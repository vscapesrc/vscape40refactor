import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

final class ProducingGraphicsBuffer implements ImageObserver, ImageProducer, bot.iface.ProducingGraphicsBuffer {
	public final int[] pixels;
	final int width;
	final int height;
	private final ColorModel model;
	private ImageConsumer consumer;
	private final Image image;

	public ProducingGraphicsBuffer(int width, int height, Component var3) {
		this.width = width;
		this.height = height;
		this.pixels = new int[width * height];
		this.model = new DirectColorModel(32, 16711680, '\uff00', 255);
		this.image = var3.createImage(this);
		this.setPixels();
		var3.prepareImage(this.image, this);
		this.setPixels();
		var3.prepareImage(this.image, this);
		this.setPixels();
		var3.prepareImage(this.image, this);
		this.initializeRasterizer();
	}

	public final void initializeRasterizer() {
		Rasterizer2D.init(this.height, this.width, this.pixels);
	}

	public final void drawImage(int y, Graphics var2, int x) {
		this.setPixels();
		var2.drawImage(this.image, x, y, this);
	}

	public final synchronized void addConsumer(ImageConsumer var1) {
		this.consumer = var1;
		var1.setDimensions(this.width, this.height);
		var1.setProperties((Hashtable) null);
		var1.setColorModel(this.model);
		var1.setHints(14);
	}

	public final synchronized boolean isConsumer(ImageConsumer var1) {
		return this.consumer == var1;
	}

	public final synchronized void removeConsumer(ImageConsumer var1) {
		if (this.consumer == var1) {
			this.consumer = null;
		}

	}

	public final void startProduction(ImageConsumer var1) {
		this.addConsumer(var1);
	}

	public final void requestTopDownLeftRightResend(ImageConsumer var1) {
		System.out.println("TDLR");
	}

	private synchronized void setPixels() {
		if (this.consumer != null) {
			this.consumer.setPixels(0, 0, this.width, this.height, this.model, this.pixels, 0, this.width);
			this.consumer.imageComplete(2);
		}

	}

	public final boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
		return true;
	}

	@Override
	public int[] getPixels() {
		return pixels;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}
}
