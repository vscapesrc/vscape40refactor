final class GameAnimableObject extends Renderable implements bot.iface.GameAnimableObject {
	public final int plane;
	public final int x;
	public final int y;
	public final int height;
	public final int g;
	public boolean transformCompleted = false;
	private final SpotAnimation animation;
	private int elapsedFrames;
	private int k;

	public GameAnimableObject(int plane, int loopCycle, int loopCycleOffset, int animationIndex, int z, int y, int x) {
		this.animation = SpotAnimation.cache[animationIndex];
		this.plane = plane;
		this.x = x;
		this.y = y;
		this.height = z;
		this.g = loopCycle + loopCycleOffset;
		this.transformCompleted = false;
	}

	public final Model getRotatedModel() {
		Model var1;
		if ((var1 = this.animation.getModel()) == null) {
			return null;
		} else {
			int var2 = this.animation.b.primaryFrames[this.elapsedFrames];
			var1 = new Model(true, Frame.isInvalid(var2), false, var1);
			if (!this.transformCompleted) {
				var1.createBones();
				var1.applyTransform(var2);
				var1.faceGroups = null;
				var1.vertexGroups = null;
			}

			if (this.animation.c != 128 || this.animation.d != 128) {
				var1.scale(this.animation.c, this.animation.c, this.animation.d);
			}

			if (this.animation.e != 0) {
				if (this.animation.e == 90) {
					var1.e();
				}

				if (this.animation.e == 180) {
					var1.e();
					var1.e();
				}

				if (this.animation.e == 270) {
					var1.e();
					var1.e();
					var1.e();
				}
			}

			var1.light(64 + this.animation.f, 850 + this.animation.g, -30, -50, -30, true);
			return var1;
		}
	}

	public final void nextFrame(int frame) {
		this.k += frame;

		while (true) {
			do {
				do {
					if (this.k <= this.animation.b.duration(this.elapsedFrames)) {
						return;
					}

					this.k -= this.animation.b.duration(this.elapsedFrames) + 1;
					++this.elapsedFrames;
				} while (this.elapsedFrames < this.animation.b.frameCount);
			} while (this.elapsedFrames >= 0 && this.elapsedFrames < this.animation.b.frameCount);

			this.elapsedFrames = 0;
			this.transformCompleted = true;
		}
	}

	@Override
	public boolean isTransformCompleted() {
		return transformCompleted;
	}

	@Override
	public int getElapsedFrames() {
		return elapsedFrames;
	}
}
