final class Projectile extends Renderable {
   public final int delay;
   public final int endCycle;
   private double l;
   private double m;
   private double n;
   private double o;
   private double p;
   private boolean moving = false;
   private final int startX;
   private final int startY;
   private final int startHeight;
   public final int endHeight;
   public double f;
   public double g;
   public double h;
   private final int startSlope;
   private final int startDistanceFromTarget;
   public final int targetedEntityId;
   private final SpotAnimation animation;
   private int x;
   private int y;
   public int j;
   private int z;
   public final int sceneId;

   public final void trackTarget(int var1, int var2, int var3, int var4) {
      double var5;
      if(!this.moving) {
         var5 = (double)(var4 - this.startX);
         double var7 = (double)(var2 - this.startY);
         double var9 = Math.sqrt(var5 * var5 + var7 * var7);
         this.f = (double)this.startX + var5 * (double)this.startDistanceFromTarget / var9;
         this.g = (double)this.startY + var7 * (double)this.startDistanceFromTarget / var9;
         this.h = (double)this.startHeight;
      }

      var5 = (double)(this.endCycle + 1 - var1);
      this.l = ((double)var4 - this.f) / var5;
      this.m = ((double)var2 - this.g) / var5;
      this.n = Math.sqrt(this.l * this.l + this.m * this.m);
      if(!this.moving) {
         this.o = -this.n * Math.tan((double)this.startSlope * 0.02454369D);
      }

      this.p = 2.0D * ((double)var3 - this.h - this.o * var5) / (var5 * var5);
   }

   public final Model getRotatedModel() {
      Model var1;
      if((var1 = this.animation.getModel()) == null) {
         return null;
      } else {
         int var2 = -1;
         if(this.animation.b != null) {
            var2 = this.animation.b.primaryFrames[this.x];
         }

         var1 = new Model(true, Frame.isInvalid(var2), false, var1);
         if(var2 != -1) {
            var1.createBones();
            var1.applyTransform(var2);
            var1.faceGroups = null;
            var1.vertexGroups = null;
         }

         if(this.animation.c != 128 || this.animation.d != 128) {
            var1.scale(this.animation.c, this.animation.c, this.animation.d);
         }

         int var3 = this.z;
         Model var7 = var1;
         int var4 = Model.SINE[var3];
         var3 = Model.COSINE[var3];

         for(int var5 = 0; var5 < var7.vertices; ++var5) {
            int var6 = var7.f[var5] * var3 - var7.g[var5] * var4 >> 16;
            var7.g[var5] = var7.f[var5] * var4 + var7.g[var5] * var3 >> 16;
            var7.f[var5] = var6;
         }

         var1.light(64 + this.animation.f, 850 + this.animation.g, -30, -50, -30, true);
         return var1;
      }
   }

   public Projectile(int startSlope, int endHeight, int delay, int speed, int startDistanceFromTarget, int sceneId, int height, int projectileY, int projectileX, int targetedEntityIndex, int spotAnimationId) {
      this.animation = SpotAnimation.cache[spotAnimationId];
      this.sceneId = sceneId;
      this.startX = projectileX;
      this.startY = projectileY;
      this.startHeight = height;
      this.delay = delay;
      this.endCycle = speed;
      this.startSlope = startSlope;
      this.startDistanceFromTarget = startDistanceFromTarget;
      this.targetedEntityId = targetedEntityIndex;
      this.endHeight = endHeight;
      this.moving = false;
   }

   public final void move(int var1) {
      this.moving = true;
      this.f += this.l * (double)var1;
      this.g += this.m * (double)var1;
      this.h += this.o * (double)var1 + 0.5D * this.p * (double)var1 * (double)var1;
      this.o += this.p * (double)var1;
      this.j = (int)(Math.atan2(this.l, this.m) * 325.949D) + 1024 & 2047;
      this.z = (int)(Math.atan2(this.o, this.n) * 325.949D) & 2047;
      if(this.animation.b != null) {
         this.y += var1;

         while(this.y > this.animation.b.duration(this.x)) {
            this.y -= this.animation.b.duration(this.x) + 1;
            ++this.x;
            if(this.x >= this.animation.b.frameCount) {
               this.x = 0;
            }
         }
      }

   }
}
