final class RenderableObject extends Renderable {
	private int currentFrameId;
	private final int[] morphisms;
	private final int morphVarbitIndex;
	private final int morphVariableIndex;
	private final int centre;
	private final int heightEast;
	private final int heightNorthEast;
	private final int heightNorth;
	private Animation animation;
	private int currentFrameDuration;
	public static Client client;
	private final int id;
	private final int type;
	private final int orientation;

	private ObjectDefinition morph() {
		int state = -1;
		if (this.morphVarbitIndex != -1) {
			try {
				VarBits bits;
				int var = (bits = VarBits.bits[this.morphVarbitIndex]).setting;
				int low = bits.low;
				int high = bits.high;
				high = Client.BIT_MASKS[high - low];
				state = client.settings[var] >> low & high;
			} catch (Exception var5) {
				;
			}
		} else if (this.morphVariableIndex != -1) {
			state = client.settings[this.morphVariableIndex];
		}

		return state >= 0 && state < this.morphisms.length && this.morphisms[state] != -1
				? ObjectDefinition.byId(this.morphisms[state]) : null;
	}

	public final Model getRotatedModel() {
		int var1 = -1;
		if (this.animation != null) {
			int var2;
			if ((var2 = Client.tick - this.currentFrameDuration) > 100 && this.animation.loopOffset > 0) {
				var2 = 100;
			}

			label40: {
				do {
					do {
						if (var2 <= this.animation.duration(this.currentFrameId)) {
							break label40;
						}

						var2 -= this.animation.duration(this.currentFrameId);
						++this.currentFrameId;
					} while (this.currentFrameId < this.animation.frameCount);

					this.currentFrameId -= this.animation.loopOffset;
				} while (this.currentFrameId >= 0 && this.currentFrameId < this.animation.frameCount);

				this.animation = null;
			}

			this.currentFrameDuration = Client.tick - var2;
			if (this.animation != null) {
				var1 = this.animation.primaryFrames[this.currentFrameId];
			}
		}

		ObjectDefinition var3;
		if (this.morphisms != null) {
			var3 = this.morph();
		} else {
			var3 = ObjectDefinition.byId(this.id);
		}

		return var3 == null ? null
				: var3.modelAt(this.type, this.orientation, this.centre, this.heightEast, this.heightNorthEast,
						this.heightNorth, var1);
	}

	public RenderableObject(int id, int orientation, int type, int heightEast, int heightNorthEast, int heightCentre,
			int heightNorth, int animationiD, boolean randomFrame) {
		this.id = id;
		this.type = type;
		this.orientation = orientation;
		this.centre = heightCentre;
		this.heightEast = heightEast;
		this.heightNorthEast = heightNorthEast;
		this.heightNorth = heightNorth;
		if (animationiD != -1) {
			this.animation = Animation.animations[animationiD];
			this.currentFrameId = 0;
			this.currentFrameDuration = Client.tick;
			if (randomFrame && this.animation.loopOffset != -1) {
				this.currentFrameId = (int) (Math.random() * (double) this.animation.frameCount);
				this.currentFrameDuration -= (int) (Math.random()
						* (double) this.animation.duration(this.currentFrameId));
			}
		}

		ObjectDefinition definition = ObjectDefinition.byId(this.id);
		this.morphVarbitIndex = definition.morphVarbitIndex;
		this.morphVariableIndex = definition.morphVariableIndex;
		this.morphisms = definition.morphisms;
	}
}
