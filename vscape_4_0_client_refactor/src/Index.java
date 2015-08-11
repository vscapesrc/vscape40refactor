import java.io.IOException;
import java.io.RandomAccessFile;

final class Index {
	private static final byte[] buffer = new byte[520];
	private final RandomAccessFile data;
	private final RandomAccessFile index;
	private final int file;

	public Index(RandomAccessFile data, RandomAccessFile index, int file) {
		this.file = file;
		this.data = data;
		this.index = index;
	}

	public final synchronized byte[] decompress(int indexFile) {
		try {
			this.seek(this.index, indexFile * 6);

			int var2;
			int var3;
			for (var2 = 0; var2 < 6; var2 += var3) {
				if ((var3 = this.index.read(buffer, var2, 6 - var2)) == -1) {
					return null;
				}
			}

			var2 = ((buffer[0] & 255) << 16) + ((buffer[1] & 255) << 8) + (buffer[2] & 255);
			if ((var3 = ((buffer[3] & 255) << 16) + ((buffer[4] & 255) << 8) + (buffer[5] & 255)) > 0
					&& (long) var3 <= this.data.length() / 520L) {
				byte[] var4 = new byte[var2];
				int var5 = 0;
				int var6 = 0;

				while (var5 < var2) {
					if (var3 == 0) {
						return null;
					}

					this.seek(this.data, var3 * 520);
					var3 = 0;
					int var7;
					if ((var7 = var2 - var5) > 512) {
						var7 = 512;
					}

					int var8;
					while (var3 < var7 + 8) {
						if ((var8 = this.data.read(buffer, var3, var7 + 8 - var3)) == -1) {
							return null;
						}

						var3 += var8;
					}

					var3 = ((buffer[0] & 255) << 8) + (buffer[1] & 255);
					var8 = ((buffer[2] & 255) << 8) + (buffer[3] & 255);
					int var9 = ((buffer[4] & 255) << 16) + ((buffer[5] & 255) << 8) + (buffer[6] & 255);
					int var10 = buffer[7] & 255;
					if (var3 == indexFile && var8 == var6 && var10 == this.file) {
						if (var9 >= 0 && (long) var9 <= this.data.length() / 520L) {
							for (var3 = 0; var3 < var7; ++var3) {
								var4[var5++] = buffer[var3 + 8];
							}

							var3 = var9;
							++var6;
							continue;
						}

						return null;
					}

					return null;
				}

				return var4;
			} else {
				return null;
			}
		} catch (IOException var11) {
			return null;
		}
	}

	public final synchronized boolean put(int var1, byte[] data, int var3) {
		boolean var4;
		if (!(var4 = this.put(true, var3, var1, data))) {
			var4 = this.put(false, var3, var1, data);
		}

		return var4;
	}

	private synchronized boolean put(boolean exists, int position, int length, byte[] bytes) {
		try {
			int var5;
			int var6;
			int var7;
			if (!exists) {
				if ((var7 = (int) ((this.data.length() + 519L) / 520L)) == 0) {
					var7 = 1;
				}
			} else {
				this.seek(this.index, position * 6);
				var5 = 0;

				while (true) {
					if (var5 >= 6) {
						if ((var7 = ((buffer[3] & 255) << 16) + ((buffer[4] & 255) << 8) + (buffer[5] & 255)) <= 0
								|| (long) var7 > this.data.length() / 520L) {
							return false;
						}
						break;
					}

					if ((var6 = this.index.read(buffer, var5, 6 - var5)) == -1) {
						return false;
					}

					var5 += var6;
				}
			}

			buffer[0] = (byte) (length >> 16);
			buffer[1] = (byte) (length >> 8);
			buffer[2] = (byte) length;
			buffer[3] = (byte) (var7 >> 16);
			buffer[4] = (byte) (var7 >> 8);
			buffer[5] = (byte) var7;
			this.seek(this.index, position * 6);
			this.index.write(buffer, 0, 6);
			var6 = 0;

			for (var5 = 0; var6 < length; ++var5) {
				int var8 = 0;
				int var9;
				if (exists) {
					this.seek(this.data, var7 * 520);
					var9 = 0;

					while (true) {
						int var10;
						if (var9 >= 8 || (var10 = this.data.read(buffer, var9, 8 - var9)) == -1) {
							if (var9 == 8) {
								var9 = ((buffer[0] & 255) << 8) + (buffer[1] & 255);
								var10 = ((buffer[2] & 255) << 8) + (buffer[3] & 255);
								var8 = ((buffer[4] & 255) << 16) + ((buffer[5] & 255) << 8) + (buffer[6] & 255);
								int var11 = buffer[7] & 255;
								if (var9 != position || var10 != var5 || var11 != this.file) {
									return false;
								}

								if (var8 < 0 || (long) var8 > this.data.length() / 520L) {
									return false;
								}
							}
							break;
						}

						var9 += var10;
					}
				}

				if (var8 == 0) {
					exists = false;
					if ((var8 = (int) ((this.data.length() + 519L) / 520L)) == 0) {
						++var8;
					}

					if (var8 == var7) {
						++var8;
					}
				}

				if (length - var6 <= 512) {
					var8 = 0;
				}

				buffer[0] = (byte) (position >> 8);
				buffer[1] = (byte) position;
				buffer[2] = (byte) (var5 >> 8);
				buffer[3] = (byte) var5;
				buffer[4] = (byte) (var8 >> 16);
				buffer[5] = (byte) (var8 >> 8);
				buffer[6] = (byte) var8;
				buffer[7] = (byte) this.file;
				this.seek(this.data, var7 * 520);
				this.data.write(buffer, 0, 8);
				if ((var9 = length - var6) > 512) {
					var9 = 512;
				}

				this.data.write(bytes, var6, var9);
				var6 += var9;
				var7 = var8;
			}

			return true;
		} catch (IOException var12) {
			return false;
		}
	}

	private synchronized void seek(RandomAccessFile var1, int var2) {
		try {
			var1.seek((long) var2);
		} catch (Exception var3) {
			;
		}
	}
}
