import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

final class BufferedConnection implements Runnable {
   private InputStream input;
   private OutputStream output;
   private final Socket socket;
   private boolean stopped = false;
   private final ScapeApplet applet;
   private byte[] outputBuffer;
   private int cycle;
   private int bufferIndex;
   private boolean writing = false;
   private boolean erred = false;

   public BufferedConnection(ScapeApplet applet, Socket socket) throws IOException {
      this.applet = applet;
      this.socket = socket;
      this.socket.setSoTimeout(30000);
      this.socket.setTcpNoDelay(true);
      this.input = this.socket.getInputStream();
      this.output = this.socket.getOutputStream();
   }

   public final void stop() {
      this.stopped = true;

      try {
         if(this.input != null) {
            this.input.close();
         }

         if(this.output != null) {
            this.output.close();
         }

         if(this.socket != null) {
            this.socket.close();
         }
      } catch (IOException var3) {
         System.out.println("Error closing stream");
      }

      this.writing = false;
      synchronized(this) {
         this.notify();
      }

      this.outputBuffer = null;
   }

   public final int read() throws IOException {
      return this.stopped?0:this.input.read();
   }

   public final int available() throws IOException {
      return this.stopped?0:this.input.available();
   }

   public final void flushInputStream(byte[] var1, int var2) throws IOException {
      int var3 = 0;
      if(!this.stopped) {
         while(var2 > 0) {
            int var4;
            if((var4 = this.input.read(var1, var3, var2)) <= 0) {
               throw new IOException("EOF");
            }

            var3 += var4;
            var2 -= var4;
         }

      }
   }

   public final void write(int var1, byte[] var2) throws IOException {
      if(!this.stopped) {
         if(this.erred) {
            this.erred = false;
            throw new IOException("Error in writer thread");
         } else {
            if(this.outputBuffer == null) {
               this.outputBuffer = new byte[5000];
            }

            synchronized(this) {
               for(int var4 = 0; var4 < var1; ++var4) {
                  this.outputBuffer[this.bufferIndex] = var2[var4];
                  this.bufferIndex = (this.bufferIndex + 1) % 5000;
                  if(this.bufferIndex == (this.cycle + 4900) % 5000) {
                     throw new IOException("buffer overflow");
                  }
               }

               if(!this.writing) {
                  this.writing = true;
                  this.applet.startThread(this, 3);
               }

               this.notify();
            }
         }
      }
   }

   public final void run() {
      while(this.writing) {
         int var2;
         int var3;
         synchronized(this) {
            if(this.bufferIndex == this.cycle) {
               try {
                  this.wait();
               } catch (InterruptedException var6) {
                  ;
               }
            }

            if(!this.writing) {
               return;
            }

            var2 = this.cycle;
            if(this.bufferIndex >= this.cycle) {
               var3 = this.bufferIndex - this.cycle;
            } else {
               var3 = 5000 - this.cycle;
            }
         }

         if(var3 > 0) {
            try {
               this.output.write(this.outputBuffer, var2, var3);
            } catch (IOException var5) {
               this.erred = true;
            }

            this.cycle = (this.cycle + var3) % 5000;

            try {
               if(this.bufferIndex == this.cycle) {
                  this.output.flush();
               }
            } catch (IOException var4) {
               this.erred = true;
            }
         }
      }

   }
}
