public class Rasterizer2D extends CacheableNode {
	public static int[] pixels;
	public static int width;
	public static int height;
	public static int clipBottom;
	public static int clipTop;
	public static int clipLeft;
	public static int clipRight;
	public static int o;
	public static int centreX;
	public static int centreY;

	public static void init(int height, int width, int[] pixels) {
		Rasterizer2D.pixels = pixels;
		Rasterizer2D.width = width;
		Rasterizer2D.height = height;
		setBounds(height, 0, width, 0);
	}

	public static void drawHorizontal_(int x, int y, int length, int color) {
		if (y >= clipBottom && y < clipTop) {
			if (x < clipLeft) {
				length -= clipLeft - x;
				x = clipLeft;
			}

			if (x + length > clipRight) {
				length = clipRight - x;
			}

			x += y * width;

			for (y = 0; y < length; ++y) {
				pixels[x + y] = color;
			}
		}

	}

	public static void setDefaultBounds() {
		clipLeft = 0;
		clipBottom = 0;
		clipRight = width;
		clipTop = height;
		o = clipRight;
		centreX = clipRight / 2;
	}

	public static void setBounds(int var0, int var1, int var2, int var3) {
		if (var1 < 0) {
			var1 = 0;
		}

		if (var3 < 0) {
			var3 = 0;
		}

		if (var2 > width) {
			var2 = width;
		}

		if (var0 > height) {
			var0 = height;
		}

		clipLeft = var1;
		clipBottom = var3;
		clipRight = var2;
		clipTop = var0;
		o = clipRight;
		centreX = clipRight / 2;
		centreY = clipTop / 2;
	}

	public static void reset() {
		int var0 = width * height;

		for (int var1 = 0; var1 < var0; ++var1) {
			pixels[var1] = 0;
		}

	}

	public static void fillRectangle(int var0, int drawY, int width, int height, int var4, int drawX) {
		if (drawX < clipLeft) {
			width -= clipLeft - drawX;
			drawX = clipLeft;
		}

		if (drawY < clipBottom) {
			height -= clipBottom - drawY;
			drawY = clipBottom;
		}

		if (drawX + width > clipRight) {
			width = clipRight - drawX;
		}

		if (drawY + height > clipTop) {
			height = clipTop - drawY;
		}

		int var6 = 256 - var4;
		int var7 = (var0 >> 16 & 255) * var4;
		int var8 = (var0 >> 8 & 255) * var4;
		var0 = (var0 & 255) * var4;
		var4 = Rasterizer2D.width - width;
		drawY = drawX + drawY * Rasterizer2D.width;

		for (drawX = 0; drawX < height; ++drawX) {
			for (int var9 = -width; var9 < 0; ++var9) {
				int var10 = (pixels[drawY] >> 16 & 255) * var6;
				int var11 = (pixels[drawY] >> 8 & 255) * var6;
				int var12 = (pixels[drawY] & 255) * var6;
				var10 = (var7 + var10 >> 8 << 16) + (var8 + var11 >> 8 << 8) + (var0 + var12 >> 8);
				pixels[drawY++] = var10;
			}

			drawY += var4;
		}

	}

	public static void fillRectangle(int var0, int var1, int var2, int var3, int var4) {
		if (var2 < clipLeft) {
			var4 -= clipLeft - var2;
			var2 = clipLeft;
		}

		if (var1 < clipBottom) {
			var0 -= clipBottom - var1;
			var1 = clipBottom;
		}

		if (var2 + var4 > clipRight) {
			var4 = clipRight - var2;
		}

		if (var1 + var0 > clipTop) {
			var0 = clipTop - var1;
		}

		int var5 = width - var4;
		var1 = var2 + var1 * width;

		for (var0 = -var0; var0 < 0; ++var0) {
			for (var2 = -var4; var2 < 0; ++var2) {
				pixels[var1++] = var3;
			}

			var1 += var5;
		}

	}

	public static void drawRectangle(int x, int width, int height, int color, int y) {
		drawHorizontal(y, color, width, x);
		drawHorizontal(y + height - 1, color, width, x);
		drawVertical(y, color, height, x);
		drawVertical(y, color, height, x + width - 1);
	}

	public static void drawRectangle(int y, int height, int alpha, int color, int width, int x) {
		drawHorizontal(color, width, y, alpha, x);
		drawHorizontal(color, width, y + height - 1, alpha, x);
		if (height >= 3) {
			drawVertical(color, x, alpha, y + 1, height - 2);
			drawVertical(color, x + width - 1, alpha, y + 1, height - 2);
		}

	}

	public static void drawHorizontal(int y, int color, int width, int x) {
		if (y >= clipBottom && y < clipTop) {
			if (x < clipLeft) {
				width -= clipLeft - x;
				x = clipLeft;
			}

			if (x + width > clipRight) {
				width = clipRight - x;
			}

			y = x + y * Rasterizer2D.width;

			for (x = 0; x < width; ++x) {
				pixels[y + x] = color;
			}

		}
	}

	static void drawHorizontal(int color, int length, int y, int alpha, int x) {
		if (y >= clipBottom && y < clipTop) {
			if (x < clipLeft) {
				length -= clipLeft - x;
				x = clipLeft;
			}

			if (x + length > clipRight) {
				length = clipRight - x;
			}

			int var5 = 256 - alpha;
			int var6 = (color >> 16 & 255) * alpha;
			int var7 = (color >> 8 & 255) * alpha;
			color = (color & 255) * alpha;
			y = x + y * width;

			for (alpha = 0; alpha < length; ++alpha) {
				x = (pixels[y] >> 16 & 255) * var5;
				int var8 = (pixels[y] >> 8 & 255) * var5;
				int var9 = (pixels[y] & 255) * var5;
				x = (var6 + x >> 8 << 16) + (var7 + var8 >> 8 << 8) + (color + var9 >> 8);
				pixels[y++] = x;
			}

		}
	}

	public static void drawVertical(int var0, int var1, int var2, int var3) {
		if (var3 >= clipLeft && var3 < clipRight) {
			if (var0 < clipBottom) {
				var2 -= clipBottom - var0;
				var0 = clipBottom;
			}

			if (var0 + var2 > clipTop) {
				var2 = clipTop - var0;
			}

			var0 = var3 + var0 * width;

			for (var3 = 0; var3 < var2; ++var3) {
				pixels[var0 + var3 * width] = var1;
			}

		}
	}

	private static void drawVertical(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= clipLeft && var1 < clipRight) {
			if (var3 < clipBottom) {
				var4 -= clipBottom - var3;
				var3 = clipBottom;
			}

			if (var3 + var4 > clipTop) {
				var4 = clipTop - var3;
			}

			int var5 = 256 - var2;
			int var6 = (var0 >> 16 & 255) * var2;
			int var7 = (var0 >> 8 & 255) * var2;
			var0 = (var0 & 255) * var2;
			var1 += var3 * width;

			for (var2 = 0; var2 < var4; ++var2) {
				var3 = (pixels[var1] >> 16 & 255) * var5;
				int var8 = (pixels[var1] >> 8 & 255) * var5;
				int var9 = (pixels[var1] & 255) * var5;
				var3 = (var6 + var3 >> 8 << 16) + (var7 + var8 >> 8 << 8) + (var0 + var9 >> 8);
				pixels[var1] = var3;
				var1 += width;
			}

		}
	}
}
