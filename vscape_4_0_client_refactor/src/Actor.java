public class Actor extends Renderable {
	public final int[] pathX = new int[10];
	public final int[] pathY = new int[10];
	public int interactingEntity = -1;
	int f;
	int g = 32;
	int runAnimationId = -1;
	public String i;
	public int j = 200;
	public int k;
	int l = -1;
	int m = -1;
	int n;
	final int[] o = new int[4];
	final int[] p = new int[4];
	final int[] q = new int[4];
	int r = -1;
	int s;
	int t;
	int u = -1;
	int v;
	int w;
	int x;
	int y;
	int z;
	public int animation = -1;
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
	int N = 1;
	boolean O = false;
	int P;
	int Q;
	int R;
	int S;
	int T;
	int U;
	int V;
	int W;
	public int X;
	public int Y;
	int Z;
	final boolean[] aa = new boolean[10];
	int ab = -1;
	int ac = -1;
	int ad = -1;
	int ae = -1;

	public final void setPosition(int x, int y, boolean var3) {
		if (this.animation != -1 && Animation.animations[this.animation].walkingPrecedence == 1) {
			this.animation = -1;
		}

		if (!var3) {
			int var5 = x - this.pathX[0];
			int var4 = y - this.pathY[0];
			if (var5 >= -8 && var5 <= 8 && var4 >= -8 && var4 <= 8) {
				if (this.z < 9) {
					++this.z;
				}

				for (var5 = this.z; var5 > 0; --var5) {
					this.pathX[var5] = this.pathX[var5 - 1];
					this.pathY[var5] = this.pathY[var5 - 1];
					this.aa[var5] = this.aa[var5 - 1];
				}

				this.pathX[0] = x;
				this.pathY[0] = y;
				this.aa[0] = false;
				return;
			}
		}

		this.z = 0;
		this.P = 0;
		this.f = 0;
		this.pathX[0] = x;
		this.pathY[0] = y;
		this.X = (this.pathX[0] << 7) + (this.N << 6);
		this.Y = (this.pathY[0] << 7) + (this.N << 6);
	}

	public final void resetPath() {
		this.z = 0;
		this.P = 0;
	}

	public final void updateHits(int hitType, int hitDamage, int hitCycle) {
		for (int var4 = 0; var4 < 4; ++var4) {
			if (this.q[var4] <= hitCycle) {
				this.o[var4] = hitDamage;
				this.p[var4] = hitType;
				this.q[var4] = hitCycle + 70;
				return;
			}
		}

	}

	public final void move(boolean running, int direction) {
		int var3 = this.pathX[0];
		int var4 = this.pathY[0];
		if (direction == 0) {
			--var3;
			++var4;
		}

		if (direction == 1) {
			++var4;
		}

		if (direction == 2) {
			++var3;
			++var4;
		}

		if (direction == 3) {
			--var3;
		}

		if (direction == 4) {
			++var3;
		}

		if (direction == 5) {
			--var3;
			--var4;
		}

		if (direction == 6) {
			--var4;
		}

		if (direction == 7) {
			++var3;
			--var4;
		}

		if (this.animation != -1 && Animation.animations[this.animation].walkingPrecedence == 1) {
			this.animation = -1;
		}

		if (this.z < 9) {
			++this.z;
		}

		for (direction = this.z; direction > 0; --direction) {
			this.pathX[direction] = this.pathX[direction - 1];
			this.pathY[direction] = this.pathY[direction - 1];
			this.aa[direction] = this.aa[direction - 1];
		}

		this.pathX[0] = var3;
		this.pathY[0] = var4;
		this.aa[0] = running;
	}

	public boolean isVisible() {
		return false;
	}
}
