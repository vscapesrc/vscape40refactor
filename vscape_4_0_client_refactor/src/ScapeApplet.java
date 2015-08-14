import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ScapeApplet extends Applet implements FocusListener, KeyListener, MouseListener, MouseMotionListener, MouseWheelListener, WindowListener, Runnable {
   private int a;
   private int b = 20;
   int H = 1;
   private final long[] c = new long[10];
   int I;
   private boolean d = false;
   int width;
   int height;
   Graphics frameGraphics;
   ProducingGraphicsBuffer mainImageProducer;
   ScapeFrame scapeFrame;
   private boolean e = true;
   boolean awtFocus = true;
   int idleTime;
   int Q;
   public int mouseX;
   public int mouseY;
   private int f;
   private int g;
   private int h;
   private long i;
   public int T;
   public int U;
   public int V;
   final int[] W = new int[128];
   private final int[] j = new int[128];
   private int k;
   private int l;
   public boolean X;
   public int mouseState;
   private int m;
   private int n;
   public boolean Z = false;

   public void run() {
      this.getFrameComponent().addMouseListener(this);
      this.getFrameComponent().addMouseMotionListener(this);
      this.getFrameComponent().addKeyListener(this);
      this.getFrameComponent().addFocusListener(this);
      this.getFrameComponent().addMouseWheelListener(this);
      if(this.scapeFrame != null) {
         this.scapeFrame.addWindowListener(this);
      }

      try {
		this.statusText(0, "Loading...");
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      try {
		this.startUp();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      int var1 = 0;
      int var2 = 256;
      int var3 = 1;
      int var4 = 0;

      int var5;
      for(var5 = 0; var5 < 10; ++var5) {
         this.c[var5] = System.currentTimeMillis();
      }

      for(; this.a >= 0; this.frame()) {
         if(this.a > 0) {
            --this.a;
            if(this.a == 0) {
               this.exit();
               return;
            }
         }

         var5 = var2;
         int var6 = var3;
         var2 = 300;
         var3 = 1;
         long var7 = System.currentTimeMillis();
         if(this.c[var1] == 0L) {
            var2 = var5;
            var3 = var6;
         } else if(var7 > this.c[var1]) {
            var2 = (int)((long)(2560 * this.b) / (var7 - this.c[var1]));
         }

         if(var2 < 25) {
            var2 = 25;
         }

         if(var2 > 256) {
            var2 = 256;
            var3 = (int)((long)this.b - (var7 - this.c[var1]) / 10L);
         }

         if(var3 > this.b) {
            var3 = this.b;
         }

         this.c[var1] = var7;
         var1 = (var1 + 1) % 10;
         if(var3 > 1) {
            for(var5 = 0; var5 < 10; ++var5) {
               if(this.c[var5] != 0L) {
                  this.c[var5] += (long)var3;
               }
            }
         }

         if(var3 < this.H) {
            var3 = this.H;
         }

         try {
            Thread.sleep((long)var3);
         } catch (InterruptedException var9) {
            ;
         }

         while(var4 < 256) {
            this.T = this.f;
            this.U = this.g;
            this.V = this.h;
            this.f = 0;
            try {
				this.b();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            this.k = this.l;
            var4 += var2;
         }

         var4 &= 255;
         if(this.b > 0) {
            this.I = var2 * 1000 / (this.b << 8);
         }
      }

      if(this.a == -1) {
         this.exit();
      }

   }

   private void exit() {
      this.a = -2;
      this.d();
      if(this.scapeFrame != null) {
         try {
            Thread.sleep(1000L);
         } catch (Exception var1) {
            ;
         }

         try {
            System.exit(0);
            return;
         } catch (Throwable var2) {
            ;
         }
      }

   }

   final void c(int var1) {
      this.b = 1000;
   }

   public final void start() {
      if(this.a >= 0) {
         this.a = 0;
      }

   }

   public final void stop() {
      if(this.a >= 0) {
         this.a = 4000 / this.b;
      }

   }

   public final void destroy() {
      this.a = -1;

      try {
         Thread.sleep(5000L);
      } catch (Exception var1) {
         ;
      }

      if(this.a == -1) {
         this.exit();
      }

   }

   public final void update(Graphics var1) {
      if(this.frameGraphics == null) {
         this.frameGraphics = var1;
      }

      this.e = true;
      this.h();
   }

   public final void paint(Graphics var1) {
      if(this.frameGraphics == null) {
         this.frameGraphics = var1;
      }

      this.e = true;
      this.h();
   }

   public void mouseWheelMoved(MouseWheelEvent var1) {
      int var2;
      label119: {
         var2 = var1.getWheelRotation();
         int var3 = var1.getWheelRotation();
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9;
         Widget var10;
         int var11;
         int var12;
         if((var9 = Client.u[Client.tabId]) != -1) {
            var10 = Widget.widgets[var9];
            var9 = Client.resizeMode == 0?Client.clientWidth - 218:(Client.resizeMode == 0?28:Client.clientWidth - 197);
            var11 = Client.resizeMode == 0?Client.clientHeight - 298:(Client.resizeMode == 0?37:Client.clientHeight - (Client.clientWidth >= 900?37:74) - 267);
            if(var10.children == null) {
               break label119;
            }

            for(var12 = 0; var12 < var10.children.length; ++var12) {
               if(Widget.widgets[var10.children[var12]].W > 0) {
                  var8 = var12;
                  var4 = var10.childX[var12];
                  var5 = var10.childY[var12];
                  var6 = Widget.widgets[var10.children[var12]].width;
                  var7 = Widget.widgets[var10.children[var12]].height;
                  break;
               }
            }

            if(this.mouseX > var9 + var4 && this.mouseY > var11 + var5 && this.mouseX < var9 + var4 + var6 && this.mouseY < var11 + var5 + var7) {
               if(Widget.widgets[var10.children[var8]].q > 0) {
                  Widget.widgets[var10.children[var8]].q += var3 * 30;
                  break label119;
               }

               if(var3 > 0) {
                  Widget.widgets[var10.children[var8]].q += var3 * 30;
                  break label119;
               }
            }
         }

         if(Client.openInterfaceId != -1) {
            var10 = Widget.widgets[Client.openInterfaceId];
            var9 = Client.resizeMode == 0?4:Client.clientWidth / 2 - 256;
            var11 = Client.resizeMode == 0?4:Client.clientHeight / 2 - 167;

            for(var12 = 0; var12 < var10.children.length; ++var12) {
               if(Widget.widgets[var10.children[var12]].W > 0) {
                  var8 = var12;
                  var4 = var10.childX[var12];
                  var5 = var10.childY[var12];
                  var6 = Widget.widgets[var10.children[var12]].width;
                  var7 = Widget.widgets[var10.children[var12]].height;
                  break;
               }
            }

            if(this.mouseX > var9 + var4 && this.mouseY > var11 + var5 && this.mouseX < var9 + var4 + var6 && this.mouseY < var11 + var5 + var7) {
               if(Widget.widgets[var10.children[var8]].q > 0) {
                  Widget.widgets[var10.children[var8]].q += var3 * 30;
               } else if(var3 > 0) {
                  Widget.widgets[var10.children[var8]].q += var3 * 30;
               }
            }
         }
      }

      if(this.mouseX > 0 && this.mouseX < 512 && this.mouseY > Client.clientHeight - 165 && this.mouseY < Client.clientHeight - 25) {
         int var13 = Client.p;
         if((var13 = Client.p - var2 * 30) < 0) {
            var13 = 0;
         }

         if(var13 > Client.B - 110) {
            var13 = Client.B - 110;
         }

         if(Client.p != var13) {
            Client.p = var13;
            Client.D = true;
         }
      }

   }

   public final void mousePressed(MouseEvent var1) {
      int var2 = var1.getButton();
      int var3 = var1.getX();
      int var4 = var1.getY();
      if(this.scapeFrame != null) {
         Insets var5 = this.scapeFrame.getInsets();
         var3 -= var5.left;
         var4 -= var5.top;
      }

      this.idleTime = 0;
      this.g = var3;
      this.h = var4;
      this.i = System.currentTimeMillis();
      if(var2 != 2 && (!this.Z || var2 != 1 && var2 != 3)) {
         if(var1.isMetaDown()) {
            this.mouseState = 1;
            this.f = 2;
            this.Q = 2;
         } else {
            this.mouseState = 0;
            this.f = 1;
            this.Q = 1;
         }
      } else {
         this.mouseState = 5;
         this.m = var3;
         this.n = var4;
      }
   }

   public final void mouseReleased(MouseEvent var1) {
      var1.getX();
      var1.getY();
      if(this.scapeFrame != null) {
         Insets var2;
         int var10000 = (var2 = this.scapeFrame.getInsets()).left;
         var10000 = var2.top;
      }

      this.idleTime = 0;
      this.Q = 0;
      this.mouseState = 3;
   }

   public final void mouseClicked(MouseEvent var1) {
   }

   public final void mouseEntered(MouseEvent var1) {
   }

   public final void mouseExited(MouseEvent var1) {
      this.idleTime = 0;
      this.mouseX = -1;
      this.mouseY = -1;
   }

   public final void mouseDragged(MouseEvent var1) {
      int x = var1.getX();
      int y = var1.getY();
      if(this.scapeFrame != null) {
         Insets var4 = this.scapeFrame.getInsets();
         x -= var4.left;
         y -= var4.top;
      }

      if(this.mouseState == 5) {
         int dx = this.m - var1.getX();
         x = this.n - var1.getY();
         if(Client.getActiveClient() != null) {
            Client.getActiveClient().scrollWheelDrag(dx, -x);
         }

         this.m = var1.getX();
         this.n = var1.getY();
      } else {
         this.idleTime = 0;
         this.mouseX = x;
         this.mouseY = y;
         this.mouseState = 2;
      }
   }

   public final void mouseMoved(MouseEvent var1) {
      int var2 = var1.getX();
      int var4 = var1.getY();
      if(this.scapeFrame != null) {
         Insets var3 = this.scapeFrame.getInsets();
         var2 -= var3.left;
         var4 -= var3.top;
      }

      this.idleTime = 0;
      this.mouseX = var2;
      this.mouseY = var4;
      this.mouseState = 4;
   }

   public final void keyPressed(KeyEvent var1) {
      this.idleTime = 0;
      int var2 = var1.getKeyCode();
      int var3;
      if((var3 = var1.getKeyChar()) < 30) {
         var3 = 0;
      }

      if(var2 == 37) {
         var3 = 1;
      }

      if(var2 == 39) {
         var3 = 2;
      }

      if(var2 == 38) {
         var3 = 3;
      }

      if(var2 == 40) {
         var3 = 4;
      }

      if(var2 == 17) {
         var3 = 5;
      }

      if(var2 == 8) {
         var3 = 8;
      }

      if(var2 == 127) {
         var3 = 8;
      }

      if(var2 == 9) {
         var3 = 9;
      }

      if(var2 == 10) {
         var3 = 10;
      }

      if(var2 >= 112 && var2 <= 123) {
         var3 = var2 + 1008 - 112;
      }

      if(var2 == 36) {
         var3 = 1000;
      }

      if(var2 == 35) {
         var3 = 1001;
      }

      if(var2 == 33) {
         var3 = 1002;
      }

      if(var2 == 34) {
         var3 = 1003;
      }

      if(var2 == 112) {
         Client.b(0);
      } else if(var2 == 113) {
         Client.b(1);
      } else if(var2 == 114) {
         Client.b(2);
      } else if(var2 == 115) {
         Client.b(3);
      } else if(var2 == 116) {
         Client.b(4);
      } else if(var2 == 117) {
         Client.b(5);
      } else if(var2 == 118) {
         Client.b(6);
      } else if(var2 == 119) {
         Client.b(8);
      } else if(var2 == 120) {
         Client.b(9);
      } else if(var2 == 121) {
         Client.b(10);
      } else if(var2 == 122) {
         Client.b(11);
      } else if(var2 == 123) {
         Client.b(12);
      } else if(var2 == 18) {
         this.Z = true;
      }

      if(var3 > 0 && var3 < 128) {
         this.W[var3] = 1;
      }

      if(var3 > 4) {
         this.j[this.l] = var3;
         this.l = this.l + 1 & 127;
      }

   }

   public final void keyReleased(KeyEvent var1) {
      this.idleTime = 0;
      int var2 = var1.getKeyCode();
      char var3;
      if((var3 = var1.getKeyChar()) < 30) {
         var3 = 0;
      }

      if(var2 == 37) {
         var3 = 1;
      }

      if(var2 == 39) {
         var3 = 2;
      }

      if(var2 == 38) {
         var3 = 3;
      }

      if(var2 == 40) {
         var3 = 4;
      }

      if(var2 == 17) {
         var3 = 5;
      }

      if(var2 == 8) {
         var3 = 8;
      }

      if(var2 == 127) {
         var3 = 8;
      }

      if(var2 == 9) {
         var3 = 9;
      }

      if(var2 == 10) {
         var3 = 10;
      }

      if(var2 == 18) {
         this.Z = false;
      }

      if(var3 > 0 && var3 < 128) {
         this.W[var3] = 0;
      }

   }

   public final void keyTyped(KeyEvent var1) {
   }

   public final int d(int var1) {
      var1 = -1;
      if(this.l != this.k) {
         var1 = this.j[this.k];
         this.k = this.k + 1 & 127;
      }

      return var1;
   }

   public final void focusGained(FocusEvent var1) {
      this.awtFocus = true;
      this.e = true;
      this.h();
   }

   public final void focusLost(FocusEvent var1) {
      this.awtFocus = false;

      for(int var2 = 0; var2 < 128; ++var2) {
         this.W[var2] = 0;
      }

      this.Z = false;
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   void startUp() throws Throwable {
   }

   void b() throws Throwable {
   }

   void d() {
   }

   void frame() {
   }

   void h() {
   }

   Component getFrameComponent() {
      return (Component)(this.scapeFrame != null?this.scapeFrame:this);
   }

   public void startThread(Runnable var1, int priority) {
      Thread var3;
      (var3 = new Thread(var1)).start();
      var3.setPriority(priority);
   }

   void statusText(int var1, String text) throws Throwable {
      Client.getActiveClient().a();

      while(this.frameGraphics == null) {
         this.frameGraphics = this.scapeFrame.getGraphics();

         try {
            this.getFrameComponent().repaint();
         } catch (Exception var9) {
            ;
         }

         try {
            Thread.sleep(1000L);
         } catch (Exception var8) {
            ;
         }
      }

      Font var3 = new Font("Helvetica", 1, 13);
      FontMetrics var4 = this.getFrameComponent().getFontMetrics(var3);
      Font var5 = new Font("Helvetica", 0, 13);
      FontMetrics var10 = this.getFrameComponent().getFontMetrics(var5);
      if(this.e) {
         this.frameGraphics.setColor(Color.black);
         this.frameGraphics.fillRect(0, 0, Client.clientWidth, Client.clientHeight);
         this.e = false;
      }

      Color var6 = new Color(140, 17, 17);
      int var7 = Client.clientHeight / 2 - 18;
      this.frameGraphics.setColor(var6);
      this.frameGraphics.drawRect(Client.clientWidth / 2 - 152, var7, 304, 34);
      this.frameGraphics.fillRect(Client.clientWidth / 2 - 150, var7 + 2, var1 * 3, 30);
      this.frameGraphics.setColor(Color.black);
      this.frameGraphics.fillRect(Client.clientWidth / 2 - 150 + var1 * 3, var7 + 2, 300 - var1 * 3, 30);
      this.frameGraphics.setFont(var3);
      this.frameGraphics.setColor(Color.white);
      this.frameGraphics.drawString(text, (Client.clientWidth - var4.stringWidth(text)) / 2, var7 + 22);
      this.frameGraphics.drawString("", (Client.clientWidth - var10.stringWidth("")) / 2, var7 - 8);
   }
}
