final class MouseMonitor implements Runnable {
   private Client c;
   private Object d = new Object();
   private int[] e = new int[500];
   public boolean a = true;
   private int[] f = new int[500];
   public int b;

   public final void run() {
      while(this.a) {
         Object var1 = this.d;
         synchronized(this.d) {
            if(this.b < 500) {
               this.f[this.b] = this.c.mouseX;
               this.e[this.b] = this.c.mouseY;
               ++this.b;
            }
         }

         try {
            Thread.sleep(50L);
         } catch (Exception var2) {
            ;
         }
      }

   }

   public MouseMonitor(Client var1) {
      this.c = var1;
   }
}
