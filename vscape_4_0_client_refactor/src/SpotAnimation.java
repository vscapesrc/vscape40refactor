public final class SpotAnimation {
	public static SpotAnimation[] cache;
	private int i;
	private int j;
	private int k = -1;
	public Animation b;
	private final int[] l = new int[6];
	private final int[] m = new int[6];
	public int c = 128;
	public int d = 128;
	public int e;
	public int f;
	public int g;
	public static Cache h = new Cache(30);

	public static void init(Archive var0) {
		Buffer var7;
		int var1 = (var7 = new Buffer(var0.getEntry("spotanim.dat"))).readUShort();
		if (cache == null) {
			cache = new SpotAnimation[var1];
		}

		label71: for (int var2 = 0; var2 < var1; ++var2) {
			if (cache[var2] == null) {
				cache[var2] = new SpotAnimation();
			}

			cache[var2].i = var2;
			SpotAnimation var10000 = cache[var2];
			Buffer var3 = var7;
			SpotAnimation var4 = var10000;

			while (true) {
				while (true) {
					int var5;
					if ((var5 = var3.readUByte()) == 0) {
						continue label71;
					}

					if (var5 == 1) {
						var4.j = var3.readUShort();
					} else if (var5 == 2) {
						var4.k = var3.readUShort();
						if (Animation.animations != null) {
							var4.b = Animation.animations[var4.k];
						}
					} else if (var5 == 4) {
						var4.c = var3.readUShort();
					} else if (var5 == 5) {
						var4.d = var3.readUShort();
					} else if (var5 == 6) {
						var4.e = var3.readUShort();
					} else if (var5 == 7) {
						var4.f = var3.readUByte();
					} else if (var5 == 8) {
						var4.g = var3.readUByte();
					} else if (var5 == 40) {
						var5 = var3.readUByte();

						for (int var6 = 0; var6 < var5; ++var6) {
							var4.l[var6] = var3.readUShort();
							var4.m[var6] = var3.readUShort();
						}
					} else {
						System.out.println("Error unrecognised spotanim config code: " + var5);
					}
				}
			}
		}

	}

	public final Model getModel() {
		Model var1;
		if ((var1 = (Model) h.get((long) this.i)) != null) {
			return var1;
		} else if ((var1 = Model.lookup(this.j)) == null) {
			return null;
		} else {
			for (int var2 = 0; var2 < 6; ++var2) {
				if (this.l[0] != 0) {
					var1.recolor(this.l[var2], this.m[var2]);
				}
			}

			h.put(var1, (long) this.i);
			return var1;
		}
	}
}
