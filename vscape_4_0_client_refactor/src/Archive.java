final class Archive {
	private final byte[] buffer;
	private final int entries;
	private final int[] identifiers;
	private final int[] extractedSizes;
	private final int[] sizes;
	private final int[] indices;
	private final boolean extracted;

	public Archive(byte[] var1) {
		Buffer var2;
		int var3 = (var2 = new Buffer(var1)).readTriByte();
		int var4;
		if ((var4 = var2.readTriByte()) != var3) {
			byte[] var5;
			BZip2Decompressor.decompress(var5 = new byte[var3], var3, var1, var4, 6);
			this.buffer = var5;
			var2 = new Buffer(this.buffer);
			this.extracted = true;
		} else {
			this.buffer = var1;
			this.extracted = false;
		}

		this.entries = var2.readUShort();
		this.identifiers = new int[this.entries];
		this.extractedSizes = new int[this.entries];
		this.sizes = new int[this.entries];
		this.indices = new int[this.entries];
		int var7 = var2.position + this.entries * 10;

		for (int var6 = 0; var6 < this.entries; ++var6) {
			this.identifiers[var6] = var2.readInt();
			this.extractedSizes[var6] = var2.readTriByte();
			this.sizes[var6] = var2.readTriByte();
			this.indices[var6] = var7;
			var7 += this.sizes[var6];
		}

	}

	public final byte[] getEntry(String name) {
		Object var2 = null;
		int var4 = 0;
		name = name.toUpperCase();

		int var3;
		for (var3 = 0; var3 < name.length(); ++var3) {
			var4 = var4 * 61 + name.charAt(var3) - 32;
		}

		for (var3 = 0; var3 < this.entries; ++var3) {
			if (this.identifiers[var3] == var4) {
				byte[] var5 = new byte[this.extractedSizes[var3]];
				if (!this.extracted) {
					BZip2Decompressor.decompress(var5, this.extractedSizes[var3], this.buffer, this.sizes[var3],
							this.indices[var3]);
				} else {
					System.arraycopy(this.buffer, this.indices[var3], var5, 0, this.extractedSizes[var3]);
				}

				return var5;
			}
		}

		return null;
	}
}
