public final class IndexedImage extends Rasterizer2D {
	public byte[] a;
	public final int[] b;
	public int c;
	public int d;
	public int e;
	public int f;
	public int g;
	private int r;

	public IndexedImage(Archive var1, String var2, int var3) {
		Buffer var8 = new Buffer(var1.getEntry(var2 + ".dat"));
		Buffer var6;
		(var6 = new Buffer(var1.getEntry("index.dat"))).position = var8.readUShort();
		this.g = var6.readUShort();
		this.r = var6.readUShort();
		int var4 = var6.readUByte();
		this.b = new int[var4];

		int var5;
		for (var5 = 0; var5 < var4 - 1; ++var5) {
			this.b[var5 + 1] = var6.readTriByte();
		}

		for (var5 = 0; var5 < var3; ++var5) {
			var6.position += 2;
			var8.position += var6.readUShort() * var6.readUShort();
			++var6.position;
		}

		this.e = var6.readUByte();
		this.f = var6.readUByte();
		this.c = var6.readUShort();
		this.d = var6.readUShort();
		var5 = var6.readUByte();
		int var7 = this.c * this.d;
		this.a = new byte[var7];
		if (var5 == 0) {
			for (var3 = 0; var3 < var7; ++var3) {
				this.a[var3] = var8.readByte();
			}

		} else {
			if (var5 == 1) {
				for (var3 = 0; var3 < this.c; ++var3) {
					for (var7 = 0; var7 < this.d; ++var7) {
						this.a[var3 + var7 * this.c] = var8.readByte();
					}
				}
			}

		}
	}

	public final void a() {
		this.g /= 2;
		this.r /= 2;
		byte[] var1 = new byte[this.g * this.r];
		int var2 = 0;

		for (int var3 = 0; var3 < this.d; ++var3) {
			for (int var4 = 0; var4 < this.c; ++var4) {
				var1[(var4 + this.e >> 1) + (var3 + this.f >> 1) * this.g] = this.a[var2++];
			}
		}

		this.a = var1;
		this.c = this.g;
		this.d = this.r;
		this.e = 0;
		this.f = 0;
	}

	public final void b() {
		if (this.c != this.g || this.d != this.r) {
			byte[] var1 = new byte[this.g * this.r];
			int var2 = 0;

			for (int var3 = 0; var3 < this.d; ++var3) {
				for (int var4 = 0; var4 < this.c; ++var4) {
					var1[var4 + this.e + (var3 + this.f) * this.g] = this.a[var2++];
				}
			}

			this.a = var1;
			this.c = this.g;
			this.d = this.r;
			this.e = 0;
			this.f = 0;
		}
	}

	public final void a(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.b.length; ++var4) {
			int var5;
			if ((var5 = (this.b[var4] >> 16 & 255) + var1) < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6;
			if ((var6 = (this.b[var4] >> 8 & 255) + var2) < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7;
			if ((var7 = (this.b[var4] & 255) + var3) < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			this.b[var4] = (var5 << 16) + (var6 << 8) + var7;
		}

	}

	public final void a(int var1, int var2) {
		var1 += this.e;
		var2 += this.f;
		int var3 = var1 + var2 * Rasterizer2D.width;
		int var4 = 0;
		int var5 = this.d;
		int var6 = this.c;
		int var7 = Rasterizer2D.width - var6;
		int var8 = 0;
		int var9;
		if (var2 < Rasterizer2D.clipBottom) {
			var9 = Rasterizer2D.clipBottom - var2;
			var5 -= var9;
			var2 = Rasterizer2D.clipBottom;
			var4 = 0 + var9 * var6;
			var3 += var9 * Rasterizer2D.width;
		}

		if (var2 + var5 > Rasterizer2D.clipTop) {
			var5 -= var2 + var5 - Rasterizer2D.clipTop;
		}

		if (var1 < Rasterizer2D.clipLeft) {
			var9 = Rasterizer2D.clipLeft - var1;
			var6 -= var9;
			var1 = Rasterizer2D.clipLeft;
			var4 += var9;
			var3 += var9;
			var8 = var9 + 0;
			var7 += var9;
		}

		if (var1 + var6 > Rasterizer2D.clipRight) {
			var9 = var1 + var6 - Rasterizer2D.clipRight;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			int var10000 = var5;
			int var10003 = var7;
			var9 = var8;
			int[] var15 = this.b;
			var7 = var4;
			var5 = var3;
			var4 = var10003;
			byte[] var14 = this.a;
			int[] var13 = Rasterizer2D.pixels;
			var1 = var10000;
			int var10 = -(var6 >> 2);
			var6 = -(var6 & 3);

			for (var1 = -var1; var1 < 0; ++var1) {
				int var11;
				byte var12;
				for (var11 = var10; var11 < 0; ++var11) {
					if ((var12 = var14[var7++]) != 0) {
						var13[var5++] = var15[var12 & 255];
					} else {
						++var5;
					}

					if ((var12 = var14[var7++]) != 0) {
						var13[var5++] = var15[var12 & 255];
					} else {
						++var5;
					}

					if ((var12 = var14[var7++]) != 0) {
						var13[var5++] = var15[var12 & 255];
					} else {
						++var5;
					}

					if ((var12 = var14[var7++]) != 0) {
						var13[var5++] = var15[var12 & 255];
					} else {
						++var5;
					}
				}

				for (var11 = var6; var11 < 0; ++var11) {
					if ((var12 = var14[var7++]) != 0) {
						var13[var5++] = var15[var12 & 255];
					} else {
						++var5;
					}
				}

				var5 += var4;
				var7 += var9;
			}
		}

	}
}
