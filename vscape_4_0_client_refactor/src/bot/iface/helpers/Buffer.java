package bot.iface.helpers;


public class Buffer {
	bot.iface.Buffer buffer;
	
	
	private byte[] buf;
	private int position;
	private bot.iface.helpers.IsaacCipher cipher = null;
	
	
	public Buffer(bot.iface.Buffer buffer) {
		setBuffer(buffer);
	}
	
	public void setBuffer(bot.iface.Buffer buffer) {
		this.buffer = buffer;
		
		buf = buffer.getBuf();
		if(cipher == null) {
			if(buffer.getCipher() != null) {
				cipher = new bot.iface.helpers.IsaacCipher(buffer.getCipher());
			}
		}
		else {
			cipher.setCipher(buffer.getCipher());
		}
	}
	
	public void writeOpcode(int opcode) {
		position = buffer.getPosition();
		this.buf[this.position++] = (byte) (opcode + this.cipher.nextKey());
		buffer.setPosition(position);
	}
	
	public void writeShort(int s) {
		position = buffer.getPosition();
		this.buf[this.position++] = (byte) (s >> 8);
		this.buf[this.position++] = (byte) s;
		buffer.setPosition(position);
	}
	
	public void writeShortA(int s) {
		position = buffer.getPosition();
		this.buf[this.position++] = (byte) (s >> 8);
		this.buf[this.position++] = (byte) (s + 128);
		buffer.setPosition(position);
	}
	
	public final void writeLEShort(int s) {
		position = buffer.getPosition();
		this.buf[this.position++] = (byte) s;
		this.buf[this.position++] = (byte) (s >> 8);
		buffer.setPosition(position);
	}
	
	public final void writeLEShortA(int var1) {
		position = buffer.getPosition();
		this.buf[this.position++] = (byte) (var1 + 128);
		this.buf[this.position++] = (byte) (var1 >> 8);
		buffer.setPosition(position);
	}

}
