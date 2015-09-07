public final class IsaacCipher implements bot.iface.IsaacCipher {
	private int count;
	private final int[] results = new int[256];
	private final int[] memory = new int[256];
	private int accumulator;
	private int last;
	private int counter;

	public IsaacCipher(int[] seed) {
		System.arraycopy(seed, 0, this.results, 0, 4);
		this.init();
	}

	public final int nextKey() {
		if (this.count-- == 0) {
			this.isaac();
			this.count = 255;
		}

		return this.results[this.count];
	}

	private void isaac() {
		this.last += ++this.counter;

		for (int var1 = 0; var1 < 256; ++var1) {
			int var2 = this.memory[var1];
			if ((var1 & 3) == 0) {
				this.accumulator ^= this.accumulator << 13;
			} else if ((var1 & 3) == 1) {
				this.accumulator ^= this.accumulator >>> 6;
			} else if ((var1 & 3) == 2) {
				this.accumulator ^= this.accumulator << 2;
			} else if ((var1 & 3) == 3) {
				this.accumulator ^= this.accumulator >>> 16;
			}

			this.accumulator += this.memory[var1 + 128 & 255];
			int var3;
			this.memory[var1] = var3 = this.memory[(var2 & 1020) >> 2] + this.accumulator + this.last;
			this.results[var1] = this.last = this.memory[(var3 >> 8 & 1020) >> 2] + var2;
		}
	}

	private void init() {
		int var1 = -1640531527;
		int var2 = -1640531527;
		int var3 = -1640531527;
		int var4 = -1640531527;
		int var5 = -1640531527;
		int var6 = -1640531527;
		int var7 = -1640531527;
		int var8 = -1640531527;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			var8 ^= var7 << 11;
			var5 += var8;
			var7 = var7 + var6 ^ var6 >>> 2;
			var4 += var7;
			var6 = var6 + var5 ^ var5 << 8;
			var3 += var6;
			var5 = var5 + var4 ^ var4 >>> 16;
			var2 += var5;
			var4 = var4 + var3 ^ var3 << 10;
			var1 += var4;
			var3 = var3 + var2 ^ var2 >>> 4;
			var8 += var3;
			var2 = var2 + var1 ^ var1 << 8;
			var7 += var2;
			var1 = var1 + var8 ^ var8 >>> 9;
			var6 += var1;
			var8 += var7;
		}

		for (var9 = 0; var9 < 256; var9 += 8) {
			var8 += this.results[var9];
			var7 += this.results[var9 + 1];
			var6 += this.results[var9 + 2];
			var5 += this.results[var9 + 3];
			var4 += this.results[var9 + 4];
			var3 += this.results[var9 + 5];
			var2 += this.results[var9 + 6];
			var1 += this.results[var9 + 7];
			var8 ^= var7 << 11;
			var5 += var8;
			var7 = var7 + var6 ^ var6 >>> 2;
			var4 += var7;
			var6 = var6 + var5 ^ var5 << 8;
			var3 += var6;
			var5 = var5 + var4 ^ var4 >>> 16;
			var2 += var5;
			var4 = var4 + var3 ^ var3 << 10;
			var1 += var4;
			var3 = var3 + var2 ^ var2 >>> 4;
			var8 += var3;
			var2 = var2 + var1 ^ var1 << 8;
			var7 += var2;
			var1 = var1 + var8 ^ var8 >>> 9;
			var6 += var1;
			var8 += var7;
			this.memory[var9] = var8;
			this.memory[var9 + 1] = var7;
			this.memory[var9 + 2] = var6;
			this.memory[var9 + 3] = var5;
			this.memory[var9 + 4] = var4;
			this.memory[var9 + 5] = var3;
			this.memory[var9 + 6] = var2;
			this.memory[var9 + 7] = var1;
		}

		for (var9 = 0; var9 < 256; var9 += 8) {
			var8 += this.memory[var9];
			var7 += this.memory[var9 + 1];
			var6 += this.memory[var9 + 2];
			var5 += this.memory[var9 + 3];
			var4 += this.memory[var9 + 4];
			var3 += this.memory[var9 + 5];
			var2 += this.memory[var9 + 6];
			var1 += this.memory[var9 + 7];
			var8 ^= var7 << 11;
			var5 += var8;
			var7 = var7 + var6 ^ var6 >>> 2;
			var4 += var7;
			var6 = var6 + var5 ^ var5 << 8;
			var3 += var6;
			var5 = var5 + var4 ^ var4 >>> 16;
			var2 += var5;
			var4 = var4 + var3 ^ var3 << 10;
			var1 += var4;
			var3 = var3 + var2 ^ var2 >>> 4;
			var8 += var3;
			var2 = var2 + var1 ^ var1 << 8;
			var7 += var2;
			var1 = var1 + var8 ^ var8 >>> 9;
			var6 += var1;
			var8 += var7;
			this.memory[var9] = var8;
			this.memory[var9 + 1] = var7;
			this.memory[var9 + 2] = var6;
			this.memory[var9 + 3] = var5;
			this.memory[var9 + 4] = var4;
			this.memory[var9 + 5] = var3;
			this.memory[var9 + 6] = var2;
			this.memory[var9 + 7] = var1;
		}

		this.isaac();
		this.count = 256;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int[] getResults() {
		return results;
	}

	@Override
	public int[] getMemory() {
		return memory;
	}

	@Override
	public int getAccumulator() {
		return accumulator;
	}

	@Override
	public void setAccumulator(int accumulator) {
		this.accumulator = accumulator;
	}

	@Override
	public int getLast() {
		return last;
	}

	@Override
	public void setLast(int last) {
		this.last = last;
	}

	@Override
	public int getCounter() {
		return counter;
	}

	@Override
	public void setCounter(int counter) {
		this.counter = counter;
	}
}
