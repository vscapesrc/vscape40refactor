import java.util.Random;

public final class RSFont extends Rasterizer2D {
   private byte[][] glyphs = new byte[256][];
   private int[] glyphWidths = new int[256];
   private int[] glyphHeights = new int[256];
   private int[] horizonalOffsets = new int[256];
   private int[] verticalOffsets = new int[256];
   private int[] glyphSpacings = new int[256];
   public int verticalSpace;
   private Random random = new Random();
   private boolean strikethrough = false;

   public RSFont(boolean wideSpace, String name, Archive archive) {
      Buffer var9 = new Buffer(archive.getEntry(name + ".dat"));
      Buffer var10;
      (var10 = new Buffer(archive.getEntry("index.dat"))).position = var9.readUShort() + 4;
      int var4;
      if((var4 = var10.readUByte()) > 0) {
         var10.position += 3 * (var4 - 1);
      }

      for(var4 = 0; var4 < 256; ++var4) {
         this.horizonalOffsets[var4] = var10.readUByte();
         this.verticalOffsets[var4] = var10.readUByte();
         int var5 = this.glyphWidths[var4] = var10.readUShort();
         int var6 = this.glyphHeights[var4] = var10.readUShort();
         int var7 = var10.readUByte();
         int var8 = var5 * var6;
         this.glyphs[var4] = new byte[var8];
         if(var7 == 0) {
            for(var7 = 0; var7 < var8; ++var7) {
               this.glyphs[var4][var7] = var9.readByte();
            }
         } else if(var7 == 1) {
            for(var7 = 0; var7 < var5; ++var7) {
               for(var8 = 0; var8 < var6; ++var8) {
                  this.glyphs[var4][var7 + var8 * var5] = var9.readByte();
               }
            }
         }

         if(var6 > this.verticalSpace && var4 < 128) {
            this.verticalSpace = var6;
         }

         this.horizonalOffsets[var4] = 1;
         this.glyphSpacings[var4] = var5 + 2;
         var7 = 0;

         for(var8 = var6 / 7; var8 < var6; ++var8) {
            var7 += this.glyphs[var4][var8 * var5];
         }

         if(var7 <= var6 / 7) {
            --this.glyphSpacings[var4];
            this.horizonalOffsets[var4] = 0;
         }

         var7 = 0;

         for(var8 = var6 / 7; var8 < var6; ++var8) {
            var7 += this.glyphs[var4][var5 - 1 + var8 * var5];
         }

         if(var7 <= var6 / 7) {
            --this.glyphSpacings[var4];
         }
      }

      if(wideSpace) {
         this.glyphSpacings[32] = this.glyphSpacings[73];
      } else {
         this.glyphSpacings[32] = this.glyphSpacings[105];
      }
   }

   public final void a(String var1, int var2, int var3, int var4) {
      this.render(var3, var1, var4, 507 - this.getTextWidth(var1));
   }

   public final void a(int var1, String var2, int var3, int var4) {
      this.render(var1, var2, var3, var4 - this.getTextWidth(var2) / 2);
   }

   public final void a(int var1, int var2, String var3, int var4, boolean var5) {
      this.shadow(var5, var2 - this.getColoredTextWidth(var3) / 2, var1, var3, var4);
   }

   public final void b(int var1, int var2, String var3, int var4, boolean var5) {
      this.shadow(false, var2, 255, var3, var4);
   }

   public final int getColoredTextWidth(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = 0;

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if(var1.charAt(var3) == 64 && var3 + 4 < var1.length() && var1.charAt(var3 + 4) == 64) {
               var3 += 4;
            } else {
               var2 += this.glyphSpacings[var1.charAt(var3)];
            }
         }

         return var2;
      }
   }

   public final int getTextWidth(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = 0;

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            var2 += this.glyphSpacings[var1.charAt(var3)];
         }

         return var2;
      }
   }

   public final void render(int color, String text, int y, int x) {
      if(text != null) {
         y -= this.verticalSpace;

         for(int var5 = 0; var5 < text.length(); ++var5) {
            char var6;
            if((var6 = text.charAt(var5)) != 32) {
               this.render(this.glyphs[var6], x + this.horizonalOffsets[var6], y + this.verticalOffsets[var6], this.glyphWidths[var6], this.glyphHeights[var6], color);
            }

            x += this.glyphSpacings[var6];
         }

      }
   }

   public final void wave(int var1, String var2, int var3, int var4, int var5) {
      if(var2 != null) {
         var3 -= this.getTextWidth(var2) / 2;
         var5 -= this.verticalSpace;

         for(int var6 = 0; var6 < var2.length(); ++var6) {
            char var7;
            if((var7 = var2.charAt(var6)) != 32) {
               this.render(this.glyphs[var7], var3 + this.horizonalOffsets[var7], var5 + this.verticalOffsets[var7] + (int)(Math.sin((double)var6 / 2.0D + (double)var4 / 5.0D) * 5.0D), this.glyphWidths[var7], this.glyphHeights[var7], var1);
            }

            var3 += this.glyphSpacings[var7];
         }

      }
   }

   public final void wave2(int var1, String var2, int var3, int var4, int var5) {
      if(var2 != null) {
         var1 -= this.getTextWidth(var2) / 2;
         var4 -= this.verticalSpace;

         for(int var6 = 0; var6 < var2.length(); ++var6) {
            char var7;
            if((var7 = var2.charAt(var6)) != 32) {
               this.render(this.glyphs[var7], var1 + this.horizonalOffsets[var7] + (int)(Math.sin((double)var6 / 5.0D + (double)var3 / 5.0D) * 5.0D), var4 + this.verticalOffsets[var7] + (int)(Math.sin((double)var6 / 3.0D + (double)var3 / 5.0D) * 5.0D), this.glyphWidths[var7], this.glyphHeights[var7], var5);
            }

            var1 += this.glyphSpacings[var7];
         }

      }
   }

   public final void shake(int var1, String var2, int var3, int var4, int var5, int var6) {
      if(var2 != null) {
         double var7;
         if((var7 = 7.0D - (double)var1 / 8.0D) < 0.0D) {
            var7 = 0.0D;
         }

         var5 -= this.getTextWidth(var2) / 2;
         var4 -= this.verticalSpace;

         for(var1 = 0; var1 < var2.length(); ++var1) {
            char var9;
            if((var9 = var2.charAt(var1)) != 32) {
               this.render(this.glyphs[var9], var5 + this.horizonalOffsets[var9], var4 + this.verticalOffsets[var9] + (int)(Math.sin((double)var1 / 1.5D + (double)var3) * var7), this.glyphWidths[var9], this.glyphHeights[var9], var6);
            }

            var5 += this.glyphSpacings[var9];
         }

      }
   }

   public final void shadow(boolean var1, int var2, int var3, String var4, int var5) {
      this.strikethrough = false;
      int var6 = var2;
      if(var4 != null) {
         var5 -= this.verticalSpace;

         for(int var7 = 0; var7 < var4.length(); ++var7) {
            if(var4.charAt(var7) == 64 && var7 + 4 < var4.length() && var4.charAt(var7 + 4) == 64) {
               int var9;
               if((var9 = this.rgb(var4.substring(var7 + 1, var7 + 4))) != -1) {
                  var3 = var9;
               }

               var7 += 4;
            } else {
               char var8;
               if((var8 = var4.charAt(var7)) != 32) {
                  if(var1) {
                     this.render(this.glyphs[var8], var2 + this.horizonalOffsets[var8] + 1, var5 + this.verticalOffsets[var8] + 1, this.glyphWidths[var8], this.glyphHeights[var8], 0);
                  }

                  this.render(this.glyphs[var8], var2 + this.horizonalOffsets[var8], var5 + this.verticalOffsets[var8], this.glyphWidths[var8], this.glyphHeights[var8], var3);
               }

               var2 += this.glyphSpacings[var8];
            }
         }

         if(this.strikethrough) {
            Rasterizer2D.drawHorizontal(var5 + (int)((double)this.verticalSpace * 0.7D), 8388608, var2 - var6, var6);
         }

      }
   }

   public final void renderRandom(int var1, int var2, String var3, int var4, int var5) {
      if(var3 != null) {
         this.random.setSeed((long)var4);
         var4 = 192 + (this.random.nextInt() & 31);
         var5 = 15 - this.verticalSpace;

         for(int var6 = 0; var6 < var3.length(); ++var6) {
            if(var3.charAt(var6) == 64 && var6 + 4 < var3.length() && var3.charAt(var6 + 4) == 64) {
               int var8;
               if((var8 = this.rgb(var3.substring(var6 + 1, var6 + 4))) != -1) {
                  var2 = var8;
               }

               var6 += 4;
            } else {
               char var7;
               if((var7 = var3.charAt(var6)) != 32) {
                  this.render(192, var1 + this.horizonalOffsets[var7] + 1, this.glyphs[var7], this.glyphWidths[var7], var5 + this.verticalOffsets[var7] + 1, this.glyphHeights[var7], 0);
                  this.render(var4, var1 + this.horizonalOffsets[var7], this.glyphs[var7], this.glyphWidths[var7], var5 + this.verticalOffsets[var7], this.glyphHeights[var7], var2);
               }

               var1 += this.glyphSpacings[var7];
               if((this.random.nextInt() & 3) == 0) {
                  ++var1;
               }
            }
         }

      }
   }

   private int rgb(String var1) {
      if(var1.equals("369")) {
         return 3368601;
      } else if(var1.equals("mon")) {
         return 'ﾀ';
      } else if(var1.equals("red")) {
         return 16711680;
      } else if(var1.equals("gre")) {
         return '\uff00';
      } else if(var1.equals("blu")) {
         return 255;
      } else if(var1.equals("ind")) {
         return 4809928;
      } else if(var1.equals("yel")) {
         return 16776960;
      } else if(var1.equals("cya")) {
         return '\uffff';
      } else if(var1.equals("mag")) {
         return 16711935;
      } else if(var1.equals("vio")) {
         return 7999717;
      } else if(var1.equals("whi")) {
         return 16777215;
      } else if(var1.equals("bla")) {
         return 0;
      } else if(var1.equals("lre")) {
         return 16748608;
      } else if(var1.equals("dre")) {
         return 8388608;
      } else if(var1.equals("dbl")) {
         return 128;
      } else if(var1.equals("or1")) {
         return 16756736;
      } else if(var1.equals("or2")) {
         return 16740352;
      } else if(var1.equals("or3")) {
         return 16723968;
      } else if(var1.equals("dor")) {
         return 9724672;
      } else if(var1.equals("gr1")) {
         return 12648192;
      } else if(var1.equals("gr2")) {
         return 8453888;
      } else if(var1.equals("gr3")) {
         return 4259584;
      } else {
         if(var1.equals("str")) {
            this.strikethrough = true;
         }

         if(var1.equals("end")) {
            this.strikethrough = false;
         }

         return -1;
      }
   }

   private void render(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * width;
      int var8 = width - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var3 < clipBottom) {
         var11 = clipBottom - var3;
         var5 -= var11;
         var3 = clipBottom;
         var10 = 0 + var11 * var4;
         var7 += var11 * width;
      }

      if(var3 + var5 >= clipTop) {
         var5 -= var3 + var5 - clipTop;
      }

      if(var2 < clipLeft) {
         var11 = clipLeft - var2;
         var4 -= var11;
         var2 = clipLeft;
         var10 += var11;
         var7 += var11;
         var9 = var11 + 0;
         var8 += var11;
      }

      if(var2 + var4 >= clipRight) {
         var11 = var2 + var4 - clipRight;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var4 > 0 && var5 > 0) {
         int var10002 = var6;
         int var10004 = var7;
         var9 = var9;
         var8 = var8;
         var7 = var5;
         var6 = var4;
         var5 = var10004;
         var4 = var10;
         var3 = var10002;
         byte[] var13 = var1;
         int[] var12 = pixels;
         var10 = -(var6 >> 2);
         var6 = -(var6 & 3);

         for(var7 = -var7; var7 < 0; ++var7) {
            for(var11 = var10; var11 < 0; ++var11) {
               if(var13[var4++] != 0) {
                  var12[var5++] = var3;
               } else {
                  ++var5;
               }

               if(var13[var4++] != 0) {
                  var12[var5++] = var3;
               } else {
                  ++var5;
               }

               if(var13[var4++] != 0) {
                  var12[var5++] = var3;
               } else {
                  ++var5;
               }

               if(var13[var4++] != 0) {
                  var12[var5++] = var3;
               } else {
                  ++var5;
               }
            }

            for(var11 = var6; var11 < 0; ++var11) {
               if(var13[var4++] != 0) {
                  var12[var5++] = var3;
               } else {
                  ++var5;
               }
            }

            var5 += var8;
            var4 += var9;
         }
      }

   }

   private void render(int var1, int x, byte[] glyph, int clipwidth, int y, int clipheight, int var7) {
      int var8 = x + y * width;
      int var9 = width - clipwidth;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if(y < clipBottom) {
         var12 = clipBottom - y;
         clipheight -= var12;
         y = clipBottom;
         var11 = 0 + var12 * clipwidth;
         var8 += var12 * width;
      }

      if(y + clipheight >= clipTop) {
         clipheight -= y + clipheight - clipTop;
      }

      if(x < clipLeft) {
         var12 = clipLeft - x;
         clipwidth -= var12;
         x = clipLeft;
         var11 += var12;
         var8 += var12;
         var10 = var12 + 0;
         var9 += var12;
      }

      if(x + clipwidth >= clipRight) {
         var12 = x + clipwidth - clipRight;
         clipwidth -= var12;
         var10 += var12;
         var9 += var12;
      }

      if(clipwidth > 0 && clipheight > 0) {
         int var10001 = clipheight;
         int var10002 = var8;
         int var10007 = var9;
         var9 = var7;
         var8 = var10007;
         var7 = var10;
         clipheight = clipwidth;
         y = var11;
         int[] var15 = pixels;
         int var14 = var10002;
         x = var10001;
         byte[] var13 = glyph;
         var9 = ((var9 & 16711935) * var1 & -16711936) + ((var9 & '\uff00') * var1 & 16711680) >> 8;
         var10 = 256 - var1;

         for(x = -x; x < 0; ++x) {
            for(var11 = -clipheight; var11 < 0; ++var11) {
               if(var13[y++] != 0) {
                  var12 = var15[var14];
                  var15[var14++] = (((var12 & 16711935) * var10 & -16711936) + ((var12 & '\uff00') * var10 & 16711680) >> 8) + var9;
               } else {
                  ++var14;
               }
            }

            var14 += var8;
            y += var7;
         }

      }
   }
}
