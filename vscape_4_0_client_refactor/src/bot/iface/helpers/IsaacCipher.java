package bot.iface.helpers;

public class IsaacCipher {
	bot.iface.IsaacCipher cipher;
	
	private int count;
	private int[] results = new int[256];
	private int[] memory = new int[256];
	private int accumulator;
	private int last;
	private int counter;
	
	public IsaacCipher(bot.iface.IsaacCipher cipher) {
		setCipher(cipher);
	}
	
	public void setCipher(bot.iface.IsaacCipher cipher) {
		this.cipher = cipher;
		results = cipher.getResults();
		memory = cipher.getMemory();
	}

	public final int nextKey() {
		count = cipher.getCount();
		
		if (this.count-- == 0) {
			this.isaac();
			this.count = 255;
		}

		cipher.setCount(count);
		
		return this.results[this.count];
	}

	private void isaac() {
		last = cipher.getLast();
		counter = cipher.getCounter();
		accumulator = cipher.getAccumulator();
		
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
		
		cipher.setLast(last);
		cipher.setCounter(counter);
		cipher.setAccumulator(accumulator);
	}
}
