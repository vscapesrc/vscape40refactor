import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;

final class ScapeFrame extends Frame {
   private final ScapeApplet a;
   private Toolkit b = Toolkit.getDefaultToolkit();
   private Dimension c;

   public ScapeFrame(ScapeApplet var1, int width, int height, boolean undecorated) {
      this.c = this.b.getScreenSize();
      this.c.getWidth();
      this.c.getHeight();
      this.a = var1;
      this.setTitle("/v/scape");
      this.setUndecorated(undecorated);
      this.setBackground(Color.BLACK);
      this.setVisible(true);
      this.requestFocus();
      this.toFront();
      this.setResizable(Client.resizeMode != 0);
      this.setFocusTraversalKeysEnabled(false);
      this.toFront();
      Insets var5 = this.getInsets();
      
      //this.setSize(width + var5.left + var5.right, height + var5.top + var5.bottom);
      //this.setLocationRelativeTo((Component)null); // <-- This is not reliable
      
      // use this code instead to size and center the window
      int fullWidth = width + var5.left + var5.right;
      int fullHeight = height + var5.top + var5.bottom;
      this.setBounds((int)(0.5*this.c.getWidth()) - fullWidth/2, (int)(0.5*this.c.getHeight()) - fullHeight/2, fullWidth, fullHeight);
   }

   public final Graphics getGraphics() {
      Graphics var1 = super.getGraphics();
      Insets var2 = this.getInsets();
      var1.translate(var2.left, var2.top);
      return var1;
   }

   public final int a() {
      Insets var1 = this.getInsets();
      return this.getWidth() - (var1.left + var1.right);
   }

   public final int b() {
      Insets var1 = this.getInsets();
      return this.getHeight() - (var1.top + var1.bottom);
   }

   public final void update(Graphics var1) {
      this.a.update(var1);
   }

   public final void paint(Graphics var1) {
      this.a.paint(var1);
   }
}
