final class AnimableObject extends Renderable {
   public final int renderHeight;
   public final int x;
   public final int y;
   public final int z;
   public final int tick;
   public boolean transformCompleted = false;
   private final SpotAnimation animation;
   private int elapsedFrames;
   private int duration;

   public AnimableObject(int plane, int loopCycle, int loopCycleOffset, int animationIndex, int z, int y, int x) {
      this.animation = SpotAnimation.cache[animationIndex];
      this.renderHeight = plane;
      this.x = x;
      this.y = y;
      this.z = z;
      this.tick = loopCycle + loopCycleOffset;
      this.transformCompleted = false;
   }

   public final Model getRotatedModel() {
      Model var1;
      if((var1 = this.animation.getModel()) == null) {
         return null;
      } else {
         int var2 = this.animation.b.primaryFrames[this.elapsedFrames];
         var1 = new Model(true, Frame.isInvalid(var2), false, var1);
         if(!this.transformCompleted) {
            var1.createBones();
            var1.applyTransform(var2);
            var1.faceGroups = null;
            var1.vertexGroups = null;
         }

         if(this.animation.breadthScale != 128 || this.animation.depthScale != 128) {
            var1.scale(this.animation.breadthScale, this.animation.breadthScale, this.animation.depthScale);
         }

         if(this.animation.orientation != 0) {
            if(this.animation.orientation == 90) {
               var1.rotateClockwise();
            }

            if(this.animation.orientation == 180) {
               var1.rotateClockwise();
               var1.rotateClockwise();
            }

            if(this.animation.orientation == 270) {
               var1.rotateClockwise();
               var1.rotateClockwise();
               var1.rotateClockwise();
            }
         }

         var1.light(64 + this.animation.modelBrightness, 850 + this.animation.modelShadow, -30, -50, -30, true);
         return var1;
      }
   }

   public final void nextFrame(int frame) {
      this.duration += frame;

      while(true) {
         do {
            do {
               if(this.duration <= this.animation.b.duration(this.elapsedFrames)) {
                  return;
               }

               this.duration -= this.animation.b.duration(this.elapsedFrames) + 1;
               ++this.elapsedFrames;
            } while(this.elapsedFrames < this.animation.b.frameCount);
         } while(this.elapsedFrames >= 0 && this.elapsedFrames < this.animation.b.frameCount);

         this.elapsedFrames = 0;
         this.transformCompleted = true;
      }
   }
}
