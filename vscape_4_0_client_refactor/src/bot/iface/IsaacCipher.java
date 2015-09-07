package bot.iface;

public interface IsaacCipher {
	public int getCount();
	public void setCount(int count);
	public int[] getResults();
	public int[] getMemory();
	public int getAccumulator();
	public void setAccumulator(int accumulator);
	public int getLast();
	public void setLast(int last);
	public int getCounter();
	public void setCounter(int counter);
}
