public final class Floor {
	public static Floor[] floors;
	public int rgb;
	public int texture = -1;
	public boolean shadowing = true;
	public int hue;
	public int saturation;
	public int luminance;
	public int weightedHue;
	public int chroma;
	public int color;

	public static void init(Archive archive) {
		Buffer buffer;
		int var1 = (buffer = new Buffer(archive.getEntry("flo.dat"))).readUShort();
		if (floors == null) {
			floors = new Floor[var1];
		}

		for (int id = 0; id < var1; ++id) {
			if (floors[id] == null) {
				floors[id] = new Floor();
			}

			Floor var10000 = floors[id];
			floors[id].decode(buffer);
		}

	}

	private void decode(Buffer buffer) {
		int opcode;
		while ((opcode = buffer.readUByte()) != 0) {
			if (opcode == 1) {
				rgb = buffer.readTriByte();
				blend(rgb);
			} else if (opcode == 2) {
				texture = buffer.readUByte();
			} else if (opcode != 3) {
				if (opcode == 5) {
					shadowing = false;
				} else if (opcode == 6) {
					buffer.readString();
				} else if (opcode == 7) {
					opcode = hue;
					int var6 = saturation;
					int var7 = luminance;
					int chroma = this.weightedHue;
					int rgb = buffer.readTriByte();
					blend(rgb);
					this.hue = opcode;
					this.saturation = var6;
					this.luminance = var7;
					this.weightedHue = chroma;
					this.chroma = chroma;
				} else {
					System.out.println("Error unrecognised config code: " + opcode);
				}
			}
		}
	}

	private void blend(int var1) {
		double r = (double) (var1 >> 16 & 255) / 256.0D;
		double g = (double) (var1 >> 8 & 255) / 256.0D;
		double b = (double) (var1 & 255) / 256.0D;
		double darkest = r;
		if (g < r) {
			darkest = g;
		}

		if (b < darkest) {
			darkest = b;
		}

		double var10 = r;
		if (g > r) {
			var10 = g;
		}

		if (b > var10) {
			var10 = b;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (darkest + var10) / 2.0D;
		if (darkest != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - darkest) / (var10 + darkest);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - darkest) / (2.0D - var10 - darkest);
			}

			if (r == var10) {
				var12 = (g - b) / (var10 - darkest);
			} else if (g == var10) {
				var12 = 2.0D + (b - r) / (var10 - darkest);
			} else if (b == var10) {
				var12 = 4.0D + (r - g) / (var10 - darkest);
			}
		}

		var12 /= 6.0D;
		this.hue = (int) (var12 * 256.0D);
		this.saturation = (int) (var14 * 256.0D);
		this.luminance = (int) (var16 * 256.0D);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.luminance < 0) {
			this.luminance = 0;
		} else if (this.luminance > 255) {
			this.luminance = 255;
		}

		if (var16 > 0.5D) {
			this.chroma = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			this.chroma = (int) (var16 * var14 * 512.0D);
		}

		if (this.chroma <= 0) {
			this.chroma = 1;
		}

		this.weightedHue = (int) (var12 * (double) this.chroma);
		if ((var1 = this.hue + (int) (Math.random() * 16.0D) - 8) < 0) {
			var1 = 0;
		} else if (var1 > 255) {
			var1 = 255;
		}

		int var18;
		if ((var18 = this.saturation + (int) (Math.random() * 48.0D) - 24) < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19;
		if ((var19 = this.luminance + (int) (Math.random() * 48.0D) - 24) < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		var18 = var18;
		if (var19 > 179) {
			var18 /= 2;
		}

		if (var19 > 192) {
			var18 /= 2;
		}

		if (var19 > 217) {
			var18 /= 2;
		}

		if (var19 > 243) {
			var18 /= 2;
		}

		this.color = (var1 / 4 << 10) + (var18 / 32 << 7) + var19 / 2;
	}
}
