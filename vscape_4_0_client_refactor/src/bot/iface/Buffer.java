package bot.iface;

public interface Buffer {
	public byte[] getBuf();
	public int getPosition();
	public void setPosition(int position);
	public bot.iface.IsaacCipher getCipher();
}
