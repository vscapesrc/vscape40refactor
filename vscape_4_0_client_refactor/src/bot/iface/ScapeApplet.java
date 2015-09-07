package bot.iface;

import java.awt.Frame;
import java.awt.Graphics;

public interface ScapeApplet {
	public int getWidth();
	public int getHeight();
	public Graphics getDrawGraphics();
	public void setDrawGraphics(Graphics g);
	public ScapeFrame getScapeFrame();
	public ProducingGraphicsBuffer getMainImageProducer();
	public int getMouseX();
	public int getMouseY();
	public int getMouseState();
}
