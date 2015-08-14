import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import javax.swing.ImageIcon;

public final class Sprite extends Rasterizer2D {
   private String localSpriteDirectory = SignLink.getLocalCacheDirectory() + "sprites/";
   public int[] pixels;
   public int width;
   public int height;
   private int horizonalOffset;
   private int verticalOffset;
   public int resizeWidth;
   public int resizeHeight;

   public Sprite(int width, int height) {
      this.pixels = new int[width * height];
      this.width = this.resizeWidth = width;
      this.height = this.resizeHeight = height;
      this.horizonalOffset = this.verticalOffset = 0;
   }

   public Sprite(byte[] data, Component component) {
      try {
         Image var5 = Toolkit.getDefaultToolkit().createImage(data);
         MediaTracker var3;
         (var3 = new MediaTracker(component)).addImage(var5, 0);
         var3.waitForAll();
         this.width = var5.getWidth(component);
         this.height = var5.getHeight(component);
         this.resizeWidth = this.width;
         this.resizeHeight = this.height;
         this.horizonalOffset = 0;
         this.verticalOffset = 0;
         this.pixels = new int[this.width * this.height];
         (new PixelGrabber(var5, 0, 0, this.width, this.height, this.pixels, 0, this.width)).grabPixels();
      } catch (Exception var4) {
         System.out.println("Error converting jpg");
      }
   }

   public Sprite(String var1) {
      try {
         Image var4 = Toolkit.getDefaultToolkit().getImage(this.localSpriteDirectory + var1 + ".png");
         ImageIcon var2 = new ImageIcon(var4);
         this.width = var2.getIconWidth();
         this.height = var2.getIconHeight();
         this.resizeWidth = this.width;
         this.resizeHeight = this.height;
         this.horizonalOffset = 0;
         this.verticalOffset = 0;
         this.pixels = new int[this.width * this.height];
         (new PixelGrabber(var4, 0, 0, this.width, this.height, this.pixels, 0, this.width)).grabPixels();
         this.d(255, 0, 255);
      } catch (Exception var3) {
         System.out.println(var3);
      }
   }

   public final void a(int var1, int var2) {
      boolean var16 = true;
      int var3 = var2;
      var2 = var1 + this.horizonalOffset;
      var3 += this.verticalOffset;
      int var4 = var2 + var3 * Rasterizer2D.width;
      int var5 = 0;
      int var6 = this.height;
      int var7 = this.width;
      int var8 = Rasterizer2D.width - var7;
      int var9 = 0;
      int var10;
      if(var3 < Rasterizer2D.clipBottom) {
         var10 = Rasterizer2D.clipBottom - var3;
         var6 -= var10;
         var3 = Rasterizer2D.clipBottom;
         var5 = 0 + var10 * var7;
         var4 += var10 * Rasterizer2D.width;
      }

      if(var3 + var6 > Rasterizer2D.clipTop) {
         var6 -= var3 + var6 - Rasterizer2D.clipTop;
      }

      if(var2 < Rasterizer2D.clipLeft) {
         var10 = Rasterizer2D.clipLeft - var2;
         var7 -= var10;
         var2 = Rasterizer2D.clipLeft;
         var5 += var10;
         var4 += var10;
         var9 = var10 + 0;
         var8 += var10;
      }

      if(var2 + var7 > Rasterizer2D.clipRight) {
         var10 = var2 + var7 - Rasterizer2D.clipRight;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 > 0 && var6 > 0) {
         int var10002 = var6;
         var10 = var8;
         var9 = var9;
         var8 = var5;
         short var20 = 256;
         var6 = var4;
         int[] var19 = Rasterizer2D.pixels;
         int[] var18 = this.pixels;
         var3 = var10002;
         var2 = var7;
         Sprite var17 = this;
         short var11 = var20;

         for(int var12 = -var3; var12 < 0; ++var12) {
            for(int var13 = -var2; var13 < 0; ++var13) {
               var7 = var17.pixels[var8] >> 24 & var11 - 1;
               int var14;
               if((var14 = 256 - var7) > 256) {
                  var7 = 0;
               }

               if(var11 == 0) {
                  var14 = 256;
                  var7 = 0;
               }

               if((var3 = var18[var8++]) != 0) {
                  int var15 = var19[var6];
                  var19[var6++] = ((var3 & 16711935) * var7 + (var15 & 16711935) * var14 & -16711936) + ((var3 & '\uff00') * var7 + (var15 & '\uff00') * var14 & 16711680) >> 8;
               } else {
                  ++var6;
               }
            }

            var6 += var10;
            var8 += var9;
         }
      }

   }

   public final void b(int var1, int var2) {
      var1 += this.horizonalOffset;
      var2 += this.verticalOffset;
      int var3 = var1 + var2 * Rasterizer2D.width;
      int var4 = 0;
      int var5 = this.height;
      int var6 = this.width;
      int var7 = Rasterizer2D.width - var6;
      int var8 = 0;
      int var9;
      if(var2 < Rasterizer2D.clipBottom) {
         var9 = Rasterizer2D.clipBottom - var2;
         var5 -= var9;
         var2 = Rasterizer2D.clipBottom;
         var4 = 0 + var9 * var6;
         var3 += var9 * Rasterizer2D.width;
      }

      if(var2 + var5 > Rasterizer2D.clipTop) {
         var5 -= var2 + var5 - Rasterizer2D.clipTop;
      }

      if(var1 < Rasterizer2D.clipLeft) {
         var9 = Rasterizer2D.clipLeft - var1;
         var6 -= var9;
         var1 = Rasterizer2D.clipLeft;
         var4 += var9;
         var3 += var9;
         var8 = var9 + 0;
         var7 += var9;
      }

      if(var1 + var6 > Rasterizer2D.clipRight) {
         var9 = var1 + var6 - Rasterizer2D.clipRight;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         int var10001 = var6;
         var9 = var8;
         var8 = var7;
         var7 = var4;
         var6 = var3;
         int[] var17 = this.pixels;
         int[] var16 = Rasterizer2D.pixels;
         var2 = var10001;
         Sprite var15 = this;

         for(int var10 = -var5; var10 < 0; ++var10) {
            for(int var11 = -var2; var11 < 0; ++var11) {
               var3 = var15.pixels[var7] >>> 24;
               int var12 = 256 - var3;
               int var13;
               if((var13 = var17[var7++]) != 0 && var13 != 16777215) {
                  int var14 = var16[var6];
                  var16[var6++] = ((var13 & 16711935) * var3 + (var14 & 16711935) * var12 & -16711936) + ((var13 & '\uff00') * var3 + (var14 & '\uff00') * var12 & 16711680) >> 8;
               } else {
                  ++var6;
               }
            }

            var6 += var8;
            var7 += var9;
         }
      }

   }

   public final void a(int var1, int var2, int var3) {
      var1 += this.horizonalOffset;
      var2 += this.verticalOffset;
      int var4 = var1 + var2 * Rasterizer2D.width;
      int var5 = 0;
      int var6 = this.height;
      int var7 = this.width;
      int var8 = Rasterizer2D.width - var7;
      int var9 = 0;
      int var10;
      if(var2 < Rasterizer2D.clipBottom) {
         var10 = Rasterizer2D.clipBottom - var2;
         var6 -= var10;
         var2 = Rasterizer2D.clipBottom;
         var5 = 0 + var10 * var7;
         var4 += var10 * Rasterizer2D.width;
      }

      if(var2 + var6 > Rasterizer2D.clipTop) {
         var6 -= var2 + var6 - Rasterizer2D.clipTop;
      }

      if(var1 < Rasterizer2D.clipLeft) {
         var10 = Rasterizer2D.clipLeft - var1;
         var7 -= var10;
         var1 = Rasterizer2D.clipLeft;
         var5 += var10;
         var4 += var10;
         var9 = var10 + 0;
         var8 += var10;
      }

      if(var1 + var7 > Rasterizer2D.clipRight) {
         var10 = var1 + var7 - Rasterizer2D.clipRight;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 > 0 && var6 > 0) {
         a(var5, var7, Rasterizer2D.pixels, this.pixels, var9, var6, var8, var3, var4);
      }

   }

   private void d(int var1, int var2, int var3) {
      for(var1 = 0; var1 < this.pixels.length; ++var1) {
         if((this.pixels[var1] >> 16 & 255) == 255 && (this.pixels[var1] >> 8 & 255) == 0 && (this.pixels[var1] & 255) == 255) {
            this.pixels[var1] = 0;
         }
      }

   }

   public Sprite(Archive archive, String name, int id) {
      Buffer var9 = new Buffer(archive.getEntry(name + ".dat"));
      Buffer var7;
      (var7 = new Buffer(archive.getEntry("index.dat"))).position = var9.readUShort();
      this.resizeWidth = var7.readUShort();
      this.resizeHeight = var7.readUShort();
      int var4;
      int[] var5 = new int[var4 = var7.readUByte()];

      int var6;
      for(var6 = 0; var6 < var4 - 1; ++var6) {
         var5[var6 + 1] = var7.readTriByte();
         if(var5[var6 + 1] == 0) {
            var5[var6 + 1] = 1;
         }
      }

      for(var6 = 0; var6 < id; ++var6) {
         var7.position += 2;
         var9.position += var7.readUShort() * var7.readUShort();
         ++var7.position;
      }

      this.horizonalOffset = var7.readUByte();
      this.verticalOffset = var7.readUByte();
      this.width = var7.readUShort();
      this.height = var7.readUShort();
      var6 = var7.readUByte();
      int var8 = this.width * this.height;
      this.pixels = new int[var8];
      if(var6 == 0) {
         for(id = 0; id < var8; ++id) {
            this.pixels[id] = var5[var9.readUByte()];
         }

         this.d(255, 0, 255);
      } else {
         if(var6 == 1) {
            for(id = 0; id < this.width; ++id) {
               for(var8 = 0; var8 < this.height; ++var8) {
                  this.pixels[id + var8 * this.width] = var5[var9.readUByte()];
               }
            }
         }

         this.d(255, 0, 255);
      }
   }

   public final void recolor(int redOffset, int greenOffset, int blueOffset) {
      for(int index = 0; index < this.pixels.length; ++index) {
         int rgb;
         if((rgb = this.pixels[index]) != 0) {
            int var6;
            if((var6 = (rgb >> 16 & 255) + redOffset) <= 0) {
               var6 = 1;
            } else if(var6 > 255) {
               var6 = 255;
            }

            int var7;
            if((var7 = (rgb >> 8 & 255) + greenOffset) <= 0) {
               var7 = 1;
            } else if(var7 > 255) {
               var7 = 255;
            }

            if((rgb = (rgb &= 255) + blueOffset) <= 0) {
               rgb = 1;
            } else if(rgb > 255) {
               rgb = 255;
            }

            this.pixels[index] = (var6 << 16) + (var7 << 8) + rgb;
         }
      }

   }

   public final void resize() {
      int[] var1 = new int[this.resizeWidth * this.resizeHeight];

      for(int var2 = 0; var2 < this.height; ++var2) {
         System.arraycopy(this.pixels, var2 * this.width, var1, var2 + this.verticalOffset * this.resizeWidth + this.horizonalOffset, this.width);
      }

      this.pixels = var1;
      this.width = this.resizeWidth;
      this.height = this.resizeHeight;
      this.horizonalOffset = 0;
      this.verticalOffset = 0;
   }

   public final void c(int var1, int var2) {
      var1 += this.horizonalOffset;
      var2 += this.verticalOffset;
      int var3 = var1 + var2 * Rasterizer2D.width;
      int var4 = 0;
      int var5 = this.height;
      int var6 = this.width;
      int var7 = Rasterizer2D.width - var6;
      int var8 = 0;
      int var9;
      if(var2 < Rasterizer2D.clipBottom) {
         var9 = Rasterizer2D.clipBottom - var2;
         var5 -= var9;
         var2 = Rasterizer2D.clipBottom;
         var4 = 0 + var9 * var6;
         var3 += var9 * Rasterizer2D.width;
      }

      if(var2 + var5 > Rasterizer2D.clipTop) {
         var5 -= var2 + var5 - Rasterizer2D.clipTop;
      }

      if(var1 < Rasterizer2D.clipLeft) {
         var9 = Rasterizer2D.clipLeft - var1;
         var6 -= var9;
         var1 = Rasterizer2D.clipLeft;
         var4 += var9;
         var3 += var9;
         var8 = var9 + 0;
         var7 += var9;
      }

      if(var1 + var6 > Rasterizer2D.clipRight) {
         var9 = var1 + var6 - Rasterizer2D.clipRight;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         int var10000 = var3;
         int var10001 = var6;
         int var10002 = var5;
         int[] var12 = Rasterizer2D.pixels;
         int[] var11 = this.pixels;
         var6 = var7;
         var5 = var4;
         var4 = var8;
         var3 = var10002;
         var2 = var10001;
         var1 = var10000;
         var9 = -(var2 >> 2);
         var2 = -(var2 & 3);

         for(var3 = -var3; var3 < 0; ++var3) {
            int var10;
            for(var10 = var9; var10 < 0; ++var10) {
               var12[var1++] = var11[var5++];
               var12[var1++] = var11[var5++];
               var12[var1++] = var11[var5++];
               var12[var1++] = var11[var5++];
            }

            for(var10 = var2; var10 < 0; ++var10) {
               var12[var1++] = var11[var5++];
            }

            var1 += var6;
            var5 += var4;
         }
      }

   }

   public final void d(int var1, int var2) {
      var1 += this.horizonalOffset;
      var2 += this.verticalOffset;
      int var3 = var1 + var2 * Rasterizer2D.width;
      int var4 = 0;
      int var5 = this.height;
      int var6 = this.width;
      int var7 = Rasterizer2D.width - var6;
      int var8 = 0;
      int var9;
      if(var2 < Rasterizer2D.clipBottom) {
         var9 = Rasterizer2D.clipBottom - var2;
         var5 -= var9;
         var2 = Rasterizer2D.clipBottom;
         var4 = 0 + var9 * var6;
         var3 += var9 * Rasterizer2D.width;
      }

      if(var2 + var5 > Rasterizer2D.clipTop) {
         var5 -= var2 + var5 - Rasterizer2D.clipTop;
      }

      if(var1 < Rasterizer2D.clipLeft) {
         var9 = Rasterizer2D.clipLeft - var1;
         var6 -= var9;
         var1 = Rasterizer2D.clipLeft;
         var4 += var9;
         var3 += var9;
         var8 = var9 + 0;
         var7 += var9;
      }

      if(var1 + var6 > Rasterizer2D.clipRight) {
         var9 = var1 + var6 - Rasterizer2D.clipRight;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         a(var4, var6, Rasterizer2D.pixels, this.pixels, var8, var5, var7, 128, var3);
      }

   }

   public final void drawSprite(int x, int y) {
      x += this.horizonalOffset;
      y += this.verticalOffset;
      int var3 = x + y * Rasterizer2D.width;
      int var4 = 0;
      int var5 = this.height;
      int var6 = this.width;
      int var7 = Rasterizer2D.width - var6;
      int var8 = 0;
      int var9;
      if(y < Rasterizer2D.clipBottom) {
         var9 = Rasterizer2D.clipBottom - y;
         var5 -= var9;
         y = Rasterizer2D.clipBottom;
         var4 = 0 + var9 * var6;
         var3 += var9 * Rasterizer2D.width;
      }

      if(y + var5 > Rasterizer2D.clipTop) {
         var5 -= y + var5 - Rasterizer2D.clipTop;
      }

      if(x < Rasterizer2D.clipLeft) {
         var9 = Rasterizer2D.clipLeft - x;
         var6 -= var9;
         x = Rasterizer2D.clipLeft;
         var4 += var9;
         var3 += var9;
         var8 = var9 + 0;
         var7 += var9;
      }

      if(x + var6 > Rasterizer2D.clipRight) {
         var9 = x + var6 - Rasterizer2D.clipRight;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         draw(Rasterizer2D.pixels, this.pixels, var4, var3, var6, var5, var7, var8);
      }

   }

   public final void c(int var1, int var2, int var3) {
      int var4 = this.width + 2;
      int var5 = this.height + 2;
      int[] var6 = new int[var4 * var5];

      int var7;
      int var8;
      for(var7 = 0; var7 < this.width; ++var7) {
         for(var8 = 0; var8 < this.height; ++var8) {
            if(this.pixels[var7 + var8 * this.width] != 0) {
               var6[var7 + 1 + (var8 + 1) * var4] = this.pixels[var7 + var8 * this.width];
            }
         }
      }

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            if(var6[var7 + var8 * var4] == 0) {
               if(var7 < var4 - 1 && var6[var7 + 1 + var8 * var4] > 0 && var6[var7 + 1 + var8 * var4] != 16777215) {
                  var6[var7 + var8 * var4] = var3;
               }

               if(var7 > 0 && var6[var7 - 1 + var8 * var4] > 0 && var6[var7 - 1 + var8 * var4] != 16777215) {
                  var6[var7 + var8 * var4] = var3;
               }

               if(var8 < var5 - 1 && var6[var7 + (var8 + 1) * var4] > 0 && var6[var7 + (var8 + 1) * var4] != 16777215) {
                  var6[var7 + var8 * var4] = var3;
               }

               if(var8 > 0 && var6[var7 + (var8 - 1) * var4] > 0 && var6[var7 + (var8 - 1) * var4] != 16777215) {
                  var6[var7 + var8 * var4] = var3;
               }
            }
         }
      }

      --var1;
      --var2;
      var1 += this.horizonalOffset;
      var2 += this.verticalOffset;
      var7 = var1 + var2 * Rasterizer2D.width;
      var8 = 0;
      var3 = var5;
      var4 = var4;
      var5 = Rasterizer2D.width - var4;
      int var9 = 0;
      int var10;
      if(var2 < Rasterizer2D.clipBottom) {
         var10 = Rasterizer2D.clipBottom - var2;
         var3 -= var10;
         var2 = Rasterizer2D.clipBottom;
         var8 = 0 + var10 * var4;
         var7 += var10 * Rasterizer2D.width;
      }

      if(var2 + var3 > Rasterizer2D.clipTop) {
         var3 -= var2 + var3 - Rasterizer2D.clipTop;
      }

      if(var1 < Rasterizer2D.clipLeft) {
         var10 = Rasterizer2D.clipLeft - var1;
         var4 -= var10;
         var1 = Rasterizer2D.clipLeft;
         var8 += var10;
         var7 += var10;
         var9 = var10 + 0;
         var5 += var10;
      }

      if(var1 + var4 > Rasterizer2D.clipRight) {
         var10 = var1 + var4 - Rasterizer2D.clipRight;
         var4 -= var10;
         var9 += var10;
         var5 += var10;
      }

      if(var4 > 0 && var3 > 0) {
         draw(Rasterizer2D.pixels, var6, var8, var7, var4, var3, var5, var9);
      }

   }

   private static void draw(int[] raster, int[] image, int imagePosition, int rasterPosition, int width, int height, int rasterOffset, int var7) {
      int var8 = -(width >> 2);
      width = -(width & 3);

      for(int var9 = -height; var9 < 0; ++var9) {
         int var10;
         for(var10 = var8; var10 < 0; ++var10) {
            if((height = image[imagePosition++]) != 0 && height != -1) {
               raster[rasterPosition++] = height;
            } else {
               ++rasterPosition;
            }

            if((height = image[imagePosition++]) != 0 && height != -1) {
               raster[rasterPosition++] = height;
            } else {
               ++rasterPosition;
            }

            if((height = image[imagePosition++]) != 0 && height != -1) {
               raster[rasterPosition++] = height;
            } else {
               ++rasterPosition;
            }

            if((height = image[imagePosition++]) != 0 && height != -1) {
               raster[rasterPosition++] = height;
            } else {
               ++rasterPosition;
            }
         }

         for(var10 = width; var10 < 0; ++var10) {
            if((height = image[imagePosition++]) != 0 && height != -1) {
               raster[rasterPosition++] = height;
            } else {
               ++rasterPosition;
            }
         }

         rasterPosition += rasterOffset;
         imagePosition += var7;
      }

   }

   private static void a(int var0, int var1, int[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = 256 - var7;

      for(int var10 = -var5; var10 < 0; ++var10) {
         for(int var11 = -var1; var11 < 0; ++var11) {
            if((var5 = var3[var0++]) != 0) {
               int var12 = var2[var8];
               var2[var8++] = ((var5 & 16711935) * var7 + (var12 & 16711935) * var9 & -16711936) + ((var5 & '\uff00') * var7 + (var12 & '\uff00') * var9 & 16711680) >> 8;
            } else {
               ++var8;
            }
         }

         var8 += var6;
         var0 += var4;
      }

   }

   public final void drawSpriteRotated(int var1, int rotationAngle, int[] var3, int var4, int[] var5, int var6, int var7, int var8, int var9, int var10) {
      try {
         var9 = -var9 / 2;
         int var11 = -var1 / 2;
         int var12 = (int)(Math.sin((double)rotationAngle / 326.11D) * 65536.0D);
         rotationAngle = (int)(Math.cos((double)rotationAngle / 326.11D) * 65536.0D);
         var12 = var12 * var4 >> 8;
         rotationAngle = rotationAngle * var4 >> 8;
         var4 = (var10 << 16) + var11 * var12 + var9 * rotationAngle;
         var6 = (var6 << 16) + (var11 * rotationAngle - var9 * var12);
         var9 = var8 + var7 * Rasterizer2D.width;

         for(var7 = 0; var7 < var1; ++var7) {
            var8 = var5[var7];
            var10 = var9 + var8;
            var11 = var4 + rotationAngle * var8;
            int var13 = var6 - var12 * var8;

            for(var8 = -var3[var7]; var8 < 0; ++var8) {
               Rasterizer2D.pixels[var10++] = this.pixels[(var11 >> 16) + (var13 >> 16) * this.width];
               var11 += rotationAngle;
               var13 -= var12;
            }

            var4 += var12;
            var6 += rotationAngle;
            var9 += Rasterizer2D.width;
         }

      } catch (Exception var14) {
         ;
      }
   }

   public Sprite(byte[] data) {
      try {
         Image var4 = Toolkit.getDefaultToolkit().createImage(data);
         ImageIcon var2 = new ImageIcon(var4);
         this.width = var2.getIconWidth();
         this.height = var2.getIconHeight();
         this.resizeWidth = this.width;
         this.resizeHeight = this.height;
         this.horizonalOffset = 0;
         this.verticalOffset = 0;
         this.pixels = new int[this.width * this.height];
         (new PixelGrabber(var4, 0, 0, this.width, this.height, this.pixels, 0, this.width)).grabPixels();
         this.d(255, 0, 255);
      } catch (Exception var3) {
         System.out.println(var3);
      }
   }
}
