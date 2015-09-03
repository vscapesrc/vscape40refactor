public class Actor extends Renderable {
   public final int[] pathX = new int[10];
   public final int[] pathY = new int[10];
   public int interactingEntity = -1;
   int f;
   int g = 32;
   int runAnimationId = -1;
   public String i;
   public int actorHeight = 200;
   public int k;
   int l = -1;
   int m = -1;
   int n;
   final int[] hitDamages = new int[4];
   final int[] hitTypes = new int[4];
   final int[] hitCycles = new int[4];
   int r = -1;
   int s;
   int t;
   int u = -1;
   int v;
   int w;
   int x;
   int y;
   int remainingPath;
   public int emoteAnimation = -1;
   int B;
   int C;
   int D;
   int E;
   int F;
   public int G = -1000;
   public int H;
   public int I;
   int J = 100;
   int K;
   int L;
   int M;
   int size = 1;
   boolean O = false;
   int P;
   int Q;
   int R;
   int S;
   int T;
   int U;
   int V;
   int W;
   public int worldX;
   public int worldY;
   int Z;
   final boolean[] pathRun = new boolean[10];
   int ab = -1;
   int ac = -1;
   int ad = -1;
   int ae = -1;

   public final void setPosition(int x, int y, boolean teleported) {
      if(this.emoteAnimation != -1 && Animation.animations[this.emoteAnimation].walkingPrecedence == 1) {
         this.emoteAnimation = -1;
      }

      if(!teleported) {
         int var5 = x - this.pathX[0];
         int var4 = y - this.pathY[0];
         if(var5 >= -8 && var5 <= 8 && var4 >= -8 && var4 <= 8) {
            if(this.remainingPath < 9) {
               ++this.remainingPath;
            }

            for(var5 = this.remainingPath; var5 > 0; --var5) {
               this.pathX[var5] = this.pathX[var5 - 1];
               this.pathY[var5] = this.pathY[var5 - 1];
               this.pathRun[var5] = this.pathRun[var5 - 1];
            }

            this.pathX[0] = x;
            this.pathY[0] = y;
            this.pathRun[0] = false;
            return;
         }
      }

      this.remainingPath = 0;
      this.P = 0;
      this.f = 0;
      this.pathX[0] = x;
      this.pathY[0] = y;
      this.worldX = (this.pathX[0] << 7) + (this.size << 6);
      this.worldY = (this.pathY[0] << 7) + (this.size << 6);
   }

   public final void resetPath() {
      this.remainingPath = 0;
      this.P = 0;
   }

   public final void updateHits(int hitType, int hitDamage, int hitCycle) {
      for(int var4 = 0; var4 < 4; ++var4) {
         if(this.hitCycles[var4] <= hitCycle) {
            this.hitDamages[var4] = hitDamage;
            this.hitTypes[var4] = hitType;
            this.hitCycles[var4] = hitCycle + 70;
            return;
         }
      }

   }

   public final void walk(boolean running, int direction) {
      int x = this.pathX[0];
      int y = this.pathY[0];
      if(direction == 0) {
         --x;
         ++y;
      }

      if(direction == 1) {
         ++y;
      }

      if(direction == 2) {
         ++x;
         ++y;
      }

      if(direction == 3) {
         --x;
      }

      if(direction == 4) {
         ++x;
      }

      if(direction == 5) {
         --x;
         --y;
      }

      if(direction == 6) {
         --y;
      }

      if(direction == 7) {
         ++x;
         --y;
      }

      if(this.emoteAnimation != -1 && Animation.animations[this.emoteAnimation].walkingPrecedence == 1) {
         this.emoteAnimation = -1;
      }

      if(this.remainingPath < 9) {
         ++this.remainingPath;
      }

      for(direction = this.remainingPath; direction > 0; --direction) {
         this.pathX[direction] = this.pathX[direction - 1];
         this.pathY[direction] = this.pathY[direction - 1];
         this.pathRun[direction] = this.pathRun[direction - 1];
      }

      this.pathX[0] = x;
      this.pathY[0] = y;
      this.pathRun[0] = running;
   }

   public boolean isVisible() {
      return false;
   }
}
