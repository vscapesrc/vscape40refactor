final class RenderableObject extends Renderable {
   private int d;
   private final int[] e;
   private final int f;
   private final int g;
   private final int h;
   private final int i;
   private final int j;
   private final int k;
   private Animation l;
   private int m;
   public static Client client;
   private final int n;
   private final int o;
   private final int p;

   private ObjectDefinition b() {
      int var1 = -1;
      if(this.f != -1) {
         try {
            VarBits var2;
            int var3 = (var2 = VarBits.bits[this.f]).setting;
            int var4 = var2.low;
            int var6 = var2.high;
            var6 = Client.E[var6 - var4];
            var1 = client.m[var3] >> var4 & var6;
         } catch (Exception var5) {
            ;
         }
      } else if(this.g != -1) {
         var1 = client.m[this.g];
      }

      return var1 >= 0 && var1 < this.e.length && this.e[var1] != -1?ObjectDefinition.byId(this.e[var1]):null;
   }

   public final Model getRotatedModel() {
      int var1 = -1;
      if(this.l != null) {
         int var2;
         if((var2 = Client.x - this.m) > 100 && this.l.loopOffset > 0) {
            var2 = 100;
         }

         label40: {
            do {
               do {
                  if(var2 <= this.l.duration(this.d)) {
                     break label40;
                  }

                  var2 -= this.l.duration(this.d);
                  ++this.d;
               } while(this.d < this.l.frameCount);

               this.d -= this.l.loopOffset;
            } while(this.d >= 0 && this.d < this.l.frameCount);

            this.l = null;
         }

         this.m = Client.x - var2;
         if(this.l != null) {
            var1 = this.l.primaryFrames[this.d];
         }
      }

      ObjectDefinition var3;
      if(this.e != null) {
         var3 = this.b();
      } else {
         var3 = ObjectDefinition.byId(this.n);
      }

      return var3 == null?null:var3.a(this.o, this.p, this.h, this.i, this.j, this.k, var1);
   }

   public RenderableObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.n = var1;
      this.o = var3;
      this.p = var2;
      this.h = var6;
      this.i = var4;
      this.j = var5;
      this.k = var7;
      if(var8 != -1) {
         this.l = Animation.animations[var8];
         this.d = 0;
         this.m = Client.x;
         if(var9 && this.l.loopOffset != -1) {
            this.d = (int)(Math.random() * (double)this.l.frameCount);
            this.m -= (int)(Math.random() * (double)this.l.duration(this.d));
         }
      }

      ObjectDefinition var10 = ObjectDefinition.byId(this.n);
      this.f = var10.morphVarbitIndex;
      this.g = var10.morphVariableIndex;
      this.e = var10.morphisms;
   }
}
