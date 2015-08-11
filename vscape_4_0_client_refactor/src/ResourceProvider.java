import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.GZIPInputStream;

public final class ResourceProvider extends Provider implements Runnable {
	private final LinkedList requested = new LinkedList();
	private int maximumPriority;
	private int d;
	private long e;
	private int[] landscapes;
	private final byte[] payload = new byte[500];
	private int tick;
	private final byte[][] i = new byte[4][];
	private Client client;
	private final LinkedList k = new LinkedList();
	private int read;
	private int remainingData;
	private int[] musicPriorities;
	public int a;
	private int[] mapFiles;
	private int p;
	private boolean running = true;
	private OutputStream outputStream;
	private int[] membersArea;
	private boolean expectingData = false;
	private final LinkedList complete = new LinkedList();
	private final byte[] v = new byte[465000];
	private final Queue requests = new Queue();
	private InputStream inputStream;
	private Socket socket;
	private final int[][] z = new int[4][];
	private int A;
	private int B;
	private final LinkedList C = new LinkedList();
	private Resource current;
	private final LinkedList mandatoryRequests = new LinkedList();
	private int[] areas;
	private int idleTime;

	private void respond() {
		try {
			int var1 = this.inputStream.available();
			int file;
			int length;
			if (this.remainingData == 0 && var1 >= 6) {
				this.expectingData = true;

				int skip;
				for (skip = 0; skip < 6; skip += this.inputStream.read(this.payload, skip, 6 - skip)) {
					;
				}

				skip = this.payload[0] & 255;
				file = ((this.payload[1] & 255) << 8) + (this.payload[2] & 255);
				length = ((this.payload[3] & 255) << 8) + (this.payload[4] & 255);
				int sector = this.payload[5] & 255;
				this.current = null;
				Resource var6 = (Resource) this.requested.getBack();

				while (true) {
					if (var6 == null) {
						if (this.current != null) {
							this.idleTime = 0;
							if (length == 0) {
								SignLink.reportError("Rej: " + skip + "," + file);
								this.current.data = null;
								if (this.current.mandatory) {
									LinkedList var13 = this.complete;
									synchronized (this.complete) {
										this.complete.insertBack(this.current);
									}
								} else {
									this.current.unlink();
								}

								this.current = null;
							} else {
								if (this.current.data == null && sector == 0) {
									this.current.data = new byte[length];
								}

								if (this.current.data == null && sector != 0) {
									throw new IOException("missing start of file");
								}
							}
						}

						this.read = sector * 500;
						this.remainingData = 500;
						if (this.remainingData > length - sector * 500) {
							this.remainingData = length - sector * 500;
						}
						break;
					}

					if (var6.type == skip && var6.file == file) {
						this.current = var6;
					}

					if (this.current != null) {
						var6.age = 0;
					}

					var6 = (Resource) this.requested.getPrevious();
				}
			}

			if (this.remainingData > 0 && var1 >= this.remainingData) {
				this.expectingData = true;
				byte[] var11 = this.payload;
				file = 0;
				if (this.current != null) {
					var11 = this.current.data;
					file = this.read;
				}

				for (length = 0; length < this.remainingData; length += this.inputStream.read(var11, length + file,
						this.remainingData - length)) {
					;
				}

				if (this.remainingData + this.read >= var11.length && this.current != null) {
					if (this.client.indices[0] != null) {
						this.client.indices[this.current.type + 1].put(var11.length, var11, this.current.file);
					}

					if (!this.current.mandatory && this.current.type == 3) {
						this.current.mandatory = true;
						this.current.type = 93;
					}

					if (this.current.mandatory) {
						LinkedList var12 = this.complete;
						synchronized (this.complete) {
							this.complete.insertBack(this.current);
						}
					} else {
						this.current.unlink();
					}
				}

				this.remainingData = 0;
				return;
			}
		} catch (IOException var10) {
			try {
				this.socket.close();
			} catch (Exception var7) {
				;
			}

			this.socket = null;
			this.inputStream = null;
			this.outputStream = null;
			this.remainingData = 0;
		}

	}

	public final void a() {
		int var1;
		byte[] var2;
		File var3;
		FileOutputStream var6;
		for (var1 = 0; var1 < this.landscapes.length; ++var1) {
			try {
				var2 = this.client.indices[4].decompress(this.landscapes[var1]);
				var3 = new File("Configs/mapdata/" + this.landscapes[var1] + ".gz");
				(var6 = new FileOutputStream(var3)).write(var2);
				var6.close();
			} catch (Exception var5) {
				var5.printStackTrace();
			}
		}

		for (var1 = 0; var1 < this.mapFiles.length; ++var1) {
			try {
				var2 = this.client.indices[4].decompress(this.mapFiles[var1]);
				var3 = new File("Configs/mapdata/" + this.mapFiles[var1] + ".gz");
				(var6 = new FileOutputStream(var3)).write(var2);
				var6.close();
			} catch (Exception var4) {
				var4.printStackTrace();
			}
		}

	}

	public final void init(Archive archive, Client client) {
		byte[] var3 = archive.getEntry("map_index");
		Buffer var4 = new Buffer(var3);
		int count = var3.length / 7;
		this.areas = new int[count];
		this.mapFiles = new int[count];
		this.landscapes = new int[count];
		this.membersArea = new int[count];

		int var5;
		for (var5 = 0; var5 < count; ++var5) {
			this.areas[var5] = var4.readUShort();
			this.mapFiles[var5] = var4.readUShort();
			this.landscapes[var5] = var4.readUShort();
			this.membersArea[var5] = var4.readUByte();
		}

		var3 = archive.getEntry("midi_index");
		var4 = new Buffer(var3);
		count = var3.length;
		this.musicPriorities = new int[count];

		for (var5 = 0; var5 < count; ++var5) {
			this.musicPriorities[var5] = var4.readUByte();
		}

		this.client = client;
		this.running = true;
		this.client.startThread((Runnable) this, 2);
	}

	public final int b() {
		Queue var1 = this.requests;
		synchronized (this.requests) {
			return this.requests.getNodeCount();
		}
	}

	public final void c() {
		this.running = false;
	}

	private void a(Resource var1) {
		try {
			if (this.socket == null) {
				long var2;
				if ((var2 = System.currentTimeMillis()) - this.e < 4000L) {
					return;
				}

				this.e = var2;
				int var10001 = Client.k;
				this.socket = Client.createSocket('ꩊ');
				this.inputStream = this.socket.getInputStream();
				this.outputStream = this.socket.getOutputStream();
				this.outputStream.write(15);

				for (int var4 = 0; var4 < 8; ++var4) {
					this.inputStream.read();
				}

				this.idleTime = 0;
			}

			this.payload[0] = (byte) var1.type;
			this.payload[1] = (byte) (var1.file >> 8);
			this.payload[2] = (byte) var1.file;
			if (var1.mandatory) {
				this.payload[3] = 2;
			} else if (!this.client.loggedIn) {
				this.payload[3] = 1;
			} else {
				this.payload[3] = 0;
			}

			this.outputStream.write(this.payload, 0, 4);
			this.d = 0;
			this.a = -10000;
		} catch (IOException var6) {
			try {
				this.socket.close();
			} catch (Exception var5) {
				;
			}

			this.socket = null;
			this.inputStream = null;
			this.outputStream = null;
			this.remainingData = 0;
			++this.a;
		}
	}

	public final void provide(int type, int file) {
		Queue var3 = this.requests;
		synchronized (this.requests) {
			Resource node;
			for (node = (Resource) this.requests.reverseGetFirst(); node != null; node = (Resource) this.requests
					.reverseGetNext()) {
				if (node.type == type && node.file == file) {
					return;
				}
			}

			(node = new Resource()).type = type;
			node.file = file;
			node.mandatory = true;
			LinkedList var7 = this.mandatoryRequests;
			synchronized (this.mandatoryRequests) {
				this.mandatoryRequests.insertBack(node);
			}

			this.requests.insertHead(node);
		}
	}

	public final void run() {
		try {
			while (this.running) {
				++this.tick;
				byte sleepTime = 20;
				if (this.maximumPriority == 0 && this.client.indices[0] != null) {
					sleepTime = 50;
				}

				try {
					Thread.sleep((long) sleepTime);
				} catch (Exception var11) {
					;
				}

				this.expectingData = true;

				for (int var14 = 0; var14 < 100 && this.expectingData; ++var14) {
					this.expectingData = false;
					ResourceProvider var2 = this;
					LinkedList var3 = this.mandatoryRequests;
					Resource var4;
					synchronized (this.mandatoryRequests) {
						var4 = (Resource) var2.mandatoryRequests.popTail();
					}

					while (var4 != null) {
						var2.expectingData = true;
						byte[] var17 = null;
						if (var2.client.indices[0] != null) {
							var17 = var2.client.indices[var4.type + 1].decompress(var4.file);
						}

						LinkedList var5 = var2.mandatoryRequests;
						synchronized (var2.mandatoryRequests) {
							if (var17 == null) {
								var2.C.insertBack(var4);
							} else {
								var4.data = var17;
								var3 = var2.complete;
								synchronized (var2.complete) {
									var2.complete.insertBack(var4);
								}
							}

							var4 = (Resource) var2.mandatoryRequests.popTail();
						}
					}

					var2 = this;
					this.A = 0;
					this.B = 0;

					for (var4 = (Resource) this.requested.getBack(); var4 != null; var4 = (Resource) var2.requested
							.getPrevious()) {
						if (var4.mandatory) {
							++var2.A;
							System.out.println("Error: model is incomplete or missing  [ type = " + var4.type
									+ "]  [id = " + var4.file + "]");
						} else {
							++var2.B;
						}
					}

					while (var2.A < 10) {
						try {
							if ((var4 = (Resource) var2.C.popTail()) == null) {
								break;
							}

							if (var2.i[var4.type][var4.file] != 0) {
								++var2.p;
							}

							var2.i[var4.type][var4.file] = 0;
							var2.requested.insertBack(var4);
							++var2.A;
							var2.a(var4);
							var2.expectingData = true;
							System.out.println(
									"Error: file is missing  [ type = " + var4.type + "]  [id = " + var4.file + "]");
						} catch (Exception var12) {
							;
						}
					}

					if (this.A == 0 && var14 >= 5) {
						break;
					}

					this.g();
					if (this.inputStream != null) {
						this.respond();
					}
				}

				boolean var15 = false;

				Resource var16;
				for (var16 = (Resource) this.requested.getBack(); var16 != null; var16 = (Resource) this.requested
						.getPrevious()) {
					if (var16.mandatory) {
						var15 = true;
						++var16.age;
						if (var16.age > 50) {
							var16.age = 0;
							this.a(var16);
						}
					}
				}

				if (!var15) {
					for (var16 = (Resource) this.requested.getBack(); var16 != null; var16 = (Resource) this.requested
							.getPrevious()) {
						var15 = true;
						++var16.age;
						if (var16.age > 50) {
							var16.age = 0;
							this.a(var16);
						}
					}
				}

				if (var15) {
					++this.idleTime;
					if (this.idleTime > 750) {
						try {
							this.socket.close();
						} catch (Exception var7) {
							;
						}

						this.socket = null;
						this.inputStream = null;
						this.outputStream = null;
						this.remainingData = 0;
					}
				} else {
					this.idleTime = 0;
				}

				if (this.client.loggedIn && this.socket != null && this.outputStream != null
						&& (this.maximumPriority > 0 || this.client.indices[0] == null)) {
					++this.d;
					if (this.d > 500) {
						this.d = 0;
						this.payload[0] = 0;
						this.payload[1] = 0;
						this.payload[2] = 0;
						this.payload[3] = 10;

						try {
							this.outputStream.write(this.payload, 0, 4);
						} catch (IOException var6) {
							this.idleTime = 5000;
						}
					}
				}
			}

		} catch (Exception var13) {
			SignLink.reportError("od_ex " + var13.getMessage());
		}
	}

	public final void b(int var1, int var2) {
		if (this.client.indices[0] != null) {
			if (this.maximumPriority != 0) {
				Resource var3;
				(var3 = new Resource()).type = var2;
				var3.file = var1;
				var3.mandatory = false;
				LinkedList var5 = this.k;
				synchronized (this.k) {
					this.k.insertBack(var3);
				}
			}
		}
	}

	public final Resource d() {
		LinkedList var1 = this.complete;
		Resource request;
		synchronized (this.complete) {
			request = (Resource) this.complete.popTail();
		}

		if (request == null) {
			return null;
		} else {
			Queue var8 = this.requests;
			synchronized (this.requests) {
				request.clear();
			}

			if (request.data == null) {
				return request;
			} else {
				int read = 0;

				try {
					GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(request.data));

					while (true) {
						if (read == 465000) {
							throw new RuntimeException("buffer overflow!");
						}

						int in;
						if ((in = gis.read(this.v, read, 465000 - read)) == -1) {
							break;
						}

						read += in;
					}
				} catch (IOException var7) {
					System.out.println("Failed to unzip model [" + request.file + "] type = " + request.type);
					var7.printStackTrace();
					return null;
				}

				request.data = new byte[read];
				System.arraycopy(this.v, 0, request.data, 0, read);
				return request;
			}
		}
	}

	public final int a(int var1, int var2, int var3) {
		var2 += var3 << 8;

		for (var3 = 0; var3 < this.areas.length; ++var3) {
			if (this.areas[var3] == var2) {
				if (var1 == 0) {
					return this.mapFiles[var3] > 3535 ? -1 : this.mapFiles[var3];
				}

				return this.landscapes[var3] > 3535 ? -1 : this.landscapes[var3];
			}
		}

		return -1;
	}

	public final void provide(int var1) {
		this.provide(0, var1);
	}

	public final boolean b(int var1) {
		for (int var2 = 0; var2 < this.areas.length; ++var2) {
			if (this.landscapes[var2] == var1) {
				return true;
			}
		}

		return false;
	}

	public final void e() {
		LinkedList var1 = this.k;
		synchronized (this.k) {
			this.k.clear();
		}
	}

	private void g() {
		while (this.A == 0 && this.B < 10 && this.maximumPriority != 0) {
			LinkedList var1 = this.k;
			Resource var2;
			synchronized (this.k) {
				var2 = (Resource) this.k.popTail();
			}

			while (var2 != null) {
				if (this.i[var2.type][var2.file] != 0) {
					this.i[var2.type][var2.file] = 0;
					this.requested.insertBack(var2);
					this.a(var2);
					this.expectingData = true;
					if (this.p < 0) {
						++this.p;
					}

					(new StringBuilder("Loading extra files - ")).append(this.p * 100 / 0).append("%");
					++this.B;
					if (this.B == 10) {
						return;
					}
				}

				var1 = this.k;
				synchronized (this.k) {
					var2 = (Resource) this.k.popTail();
				}
			}

			for (int var8 = 0; var8 < 4; ++var8) {
				byte[] var9;
				int var3 = (var9 = this.i[var8]).length;

				for (int var4 = 0; var4 < var3; ++var4) {
					if (var9[var4] == this.maximumPriority) {
						var9[var4] = 0;
						Resource var5;
						(var5 = new Resource()).type = var8;
						var5.file = var4;
						var5.mandatory = false;
						this.requested.insertBack(var5);
						this.a(var5);
						this.expectingData = true;
						if (this.p < 0) {
							++this.p;
						}

						(new StringBuilder("Loading extra files - ")).append(this.p * 100 / 0).append("%");
						++this.B;
						if (this.B == 10) {
							return;
						}
					}
				}
			}

			--this.maximumPriority;
		}

	}
}
