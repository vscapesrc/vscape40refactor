import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

final class BufferedConnection implements Runnable {
	private InputStream inputStream;
	private OutputStream outputStream;
	private final Socket socket;
	private boolean disconnected = false;
	private final ScapeApplet e;
	private byte[] f;
	private int g;
	private int h;
	private boolean threadRunning = false;
	private boolean j = false;

	public BufferedConnection(ScapeApplet var1, Socket socket) throws IOException {
		this.e = var1;
		this.socket = socket;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.inputStream = this.socket.getInputStream();
		this.outputStream = this.socket.getOutputStream();
	}

	public final void disconnect() {
		this.disconnected = true;

		try {
			if (this.inputStream != null) {
				this.inputStream.close();
			}

			if (this.outputStream != null) {
				this.outputStream.close();
			}

			if (this.socket != null) {
				this.socket.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		this.threadRunning = false;
		synchronized (this) {
			this.notify();
		}

		this.f = null;
	}

	public final int readByte() throws IOException {
		return this.disconnected ? 0 : this.inputStream.read();
	}

	public final int available() throws IOException {
		return this.disconnected ? 0 : this.inputStream.available();
	}

	public final void read(byte[] buf, int length) throws IOException {
		int var3 = 0;
		if (!this.disconnected) {
			while (length > 0) {
				int var4;
				if ((var4 = this.inputStream.read(buf, var3, length)) <= 0) {
					throw new IOException("EOF");
				}

				var3 += var4;
				length -= var4;
			}

		}
	}

	public final void startWriterThread(int var1, byte[] var2) throws IOException {
		if (!this.disconnected) {
			if (this.j) {
				this.j = false;
				throw new IOException("Error in writer thread");
			} else {
				if (this.f == null) {
					this.f = new byte[5000];
				}

				synchronized (this) {
					for (int var4 = 0; var4 < var1; ++var4) {
						this.f[this.h] = var2[var4];
						this.h = (this.h + 1) % 5000;
						if (this.h == (this.g + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}

					if (!this.threadRunning) {
						this.threadRunning = true;
						this.e.startThread(this, 3);
					}

					this.notify();
				}
			}
		}
	}

	public final void run() {
		while (this.threadRunning) {
			int var2;
			int var3;
			synchronized (this) {
				if (this.h == this.g) {
					try {
						this.wait();
					} catch (InterruptedException var6) {
						;
					}
				}

				if (!this.threadRunning) {
					return;
				}

				var2 = this.g;
				if (this.h >= this.g) {
					var3 = this.h - this.g;
				} else {
					var3 = 5000 - this.g;
				}
			}

			if (var3 > 0) {
				try {
					this.outputStream.write(this.f, var2, var3);
				} catch (IOException var5) {
					this.j = true;
				}

				this.g = (this.g + var3) % 5000;

				try {
					if (this.h == this.g) {
						this.outputStream.flush();
					}
				} catch (IOException var4) {
					this.j = true;
				}
			}
		}

	}
}
