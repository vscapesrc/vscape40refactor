public final class Npc extends Actor {
	public ActorDefinition npcDefinition;

	public final Model getRotatedModel() {
		if (this.npcDefinition == null) {
			return null;
		} else {
			int var2;
			Model var10000;
			if (super.animation >= 0 && super.D == 0) {
				var2 = Animation.animations[super.animation].primaryFrames[super.B];
				int var3 = -1;
				if (super.r >= 0 && super.r != super.l) {
					var3 = Animation.animations[super.r].primaryFrames[super.s];
				}

				var10000 = this.npcDefinition.getAnimatedModel(var3, var2,
						Animation.animations[super.animation].interleaveOrder);
			} else {
				var2 = -1;
				if (super.r >= 0) {
					var2 = Animation.animations[super.r].primaryFrames[super.s];
				}

				var10000 = this.npcDefinition.getAnimatedModel(-1, var2, (int[]) null);
			}

			Model var1 = var10000;
			if (var10000 == null) {
				return null;
			} else {
				super.j = var1.modelHeight;
				SpotAnimation var6;
				Model var7;
				if (super.u != -1 && super.v != -1
						&& (var7 = (var6 = SpotAnimation.cache[super.u]).getModel()) != null) {
					int var4 = var6.b.primaryFrames[super.v];
					(var7 = new Model(true, Frame.isInvalid(var4), false, var7)).a(0, -super.y, 0);
					var7.createBones();
					var7.applyTransform(var4);
					var7.faceGroups = null;
					var7.vertexGroups = null;
					if (var6.c != 128 || var6.d != 128) {
						var7.scale(var6.c, var6.c, var6.d);
					}

					var7.light(64 + var6.f, 850 + var6.g, -30, -50, -30, true);
					Model[] var5 = new Model[] { var1, var7 };
					var1 = new Model(var5);
				}

				if (this.npcDefinition.size == 1) {
					var1.y = true;
				}

				return var1;
			}
		}
	}

	public final boolean isVisible() {
		return this.npcDefinition != null;
	}
}
