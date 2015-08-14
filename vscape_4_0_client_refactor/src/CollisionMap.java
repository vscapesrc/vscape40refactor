final class CollisionMap {
   private final int b = 0;
   private final int c = 0;
   private final int d = 104;
   private final int e = 104;
   public final int[][] adjacencies = new int[104][104];

   public CollisionMap() {
      this.init();
   }

   public final void init() {
      for(int var1 = 0; var1 < 104; ++var1) {
         for(int var2 = 0; var2 < 104; ++var2) {
            if(var1 != 0 && var2 != 0 && var1 != 103 && var2 != 103) {
               this.adjacencies[var1][var2] = 16777216;
            } else {
               this.adjacencies[var1][var2] = 16777215;
            }
         }
      }

   }

   public final void flagObject(int y, int orientation, int x, int type, boolean impenetrable) {
      if(type == 0) {
         if(orientation == 0) {
            this.flag(x, y, 128);
            this.flag(x - 1, y, 8);
         }

         if(orientation == 1) {
            this.flag(x, y, 2);
            this.flag(x, y + 1, 32);
         }

         if(orientation == 2) {
            this.flag(x, y, 8);
            this.flag(x + 1, y, 128);
         }

         if(orientation == 3) {
            this.flag(x, y, 32);
            this.flag(x, y - 1, 2);
         }
      }

      if(type == 1 || type == 3) {
         if(orientation == 0) {
            this.flag(x, y, 1);
            this.flag(x - 1, y + 1, 16);
         }

         if(orientation == 1) {
            this.flag(x, y, 4);
            this.flag(x + 1, y + 1, 64);
         }

         if(orientation == 2) {
            this.flag(x, y, 16);
            this.flag(x + 1, y - 1, 1);
         }

         if(orientation == 3) {
            this.flag(x, y, 64);
            this.flag(x - 1, y - 1, 4);
         }
      }

      if(type == 2) {
         if(orientation == 0) {
            this.flag(x, y, 130);
            this.flag(x - 1, y, 8);
            this.flag(x, y + 1, 32);
         }

         if(orientation == 1) {
            this.flag(x, y, 10);
            this.flag(x, y + 1, 32);
            this.flag(x + 1, y, 128);
         }

         if(orientation == 2) {
            this.flag(x, y, 40);
            this.flag(x + 1, y, 128);
            this.flag(x, y - 1, 2);
         }

         if(orientation == 3) {
            this.flag(x, y, 160);
            this.flag(x, y - 1, 2);
            this.flag(x - 1, y, 8);
         }
      }

      if(impenetrable) {
         if(type == 0) {
            if(orientation == 0) {
               this.flag(x, y, 65536);
               this.flag(x - 1, y, 4096);
            }

            if(orientation == 1) {
               this.flag(x, y, 1024);
               this.flag(x, y + 1, 16384);
            }

            if(orientation == 2) {
               this.flag(x, y, 4096);
               this.flag(x + 1, y, 65536);
            }

            if(orientation == 3) {
               this.flag(x, y, 16384);
               this.flag(x, y - 1, 1024);
            }
         }

         if(type == 1 || type == 3) {
            if(orientation == 0) {
               this.flag(x, y, 512);
               this.flag(x - 1, y + 1, 8192);
            }

            if(orientation == 1) {
               this.flag(x, y, 2048);
               this.flag(x + 1, y + 1, '耀');
            }

            if(orientation == 2) {
               this.flag(x, y, 8192);
               this.flag(x + 1, y - 1, 512);
            }

            if(orientation == 3) {
               this.flag(x, y, '耀');
               this.flag(x - 1, y - 1, 2048);
            }
         }

         if(type == 2) {
            if(orientation == 0) {
               this.flag(x, y, 66560);
               this.flag(x - 1, y, 4096);
               this.flag(x, y + 1, 16384);
            }

            if(orientation == 1) {
               this.flag(x, y, 5120);
               this.flag(x, y + 1, 16384);
               this.flag(x + 1, y, 65536);
            }

            if(orientation == 2) {
               this.flag(x, y, 20480);
               this.flag(x + 1, y, 65536);
               this.flag(x, y - 1, 1024);
            }

            if(orientation == 3) {
               this.flag(x, y, 81920);
               this.flag(x, y - 1, 1024);
               this.flag(x - 1, y, 4096);
            }
         }
      }

   }

   public final void flagObject(boolean impenetrable, int width, int length, int x, int y, int orientation) {
      int var7 = 256;
      if(impenetrable) {
         var7 = 131328;
      }

     // x = x;
      //y = y;
      int var8;
      if(orientation == 1 || orientation == 3) {
         var8 = width;
         width = length;
         length = var8;
      }

      for(var8 = x; var8 < x + width; ++var8) {
         if(var8 >= 0 && var8 < 104) {
            for(orientation = y; orientation < y + length; ++orientation) {
               if(orientation >= 0 && orientation < 104) {
                  this.flag(var8, orientation, var7);
               }
            }
         }
      }

   }

   public final void block(int y, int x) {
      this.adjacencies[x][y] |= 2097152;
   }

   private void flag(int x, int y, int bits) {
      this.adjacencies[x][y] |= bits;
   }

   public final void removeObject(int orientation, int group, boolean impenetrable, int x, int y) {
      if(group == 0) {
         if(orientation == 0) {
            this.removeFlag(128, x, y);
            this.removeFlag(8, x - 1, y);
         }

         if(orientation == 1) {
            this.removeFlag(2, x, y);
            this.removeFlag(32, x, y + 1);
         }

         if(orientation == 2) {
            this.removeFlag(8, x, y);
            this.removeFlag(128, x + 1, y);
         }

         if(orientation == 3) {
            this.removeFlag(32, x, y);
            this.removeFlag(2, x, y - 1);
         }
      }

      if(group == 1 || group == 3) {
         if(orientation == 0) {
            this.removeFlag(1, x, y);
            this.removeFlag(16, x - 1, y + 1);
         }

         if(orientation == 1) {
            this.removeFlag(4, x, y);
            this.removeFlag(64, x + 1, y + 1);
         }

         if(orientation == 2) {
            this.removeFlag(16, x, y);
            this.removeFlag(1, x + 1, y - 1);
         }

         if(orientation == 3) {
            this.removeFlag(64, x, y);
            this.removeFlag(4, x - 1, y - 1);
         }
      }

      if(group == 2) {
         if(orientation == 0) {
            this.removeFlag(130, x, y);
            this.removeFlag(8, x - 1, y);
            this.removeFlag(32, x, y + 1);
         }

         if(orientation == 1) {
            this.removeFlag(10, x, y);
            this.removeFlag(32, x, y + 1);
            this.removeFlag(128, x + 1, y);
         }

         if(orientation == 2) {
            this.removeFlag(40, x, y);
            this.removeFlag(128, x + 1, y);
            this.removeFlag(2, x, y - 1);
         }

         if(orientation == 3) {
            this.removeFlag(160, x, y);
            this.removeFlag(2, x, y - 1);
            this.removeFlag(8, x - 1, y);
         }
      }

      if(impenetrable) {
         if(group == 0) {
            if(orientation == 0) {
               this.removeFlag(65536, x, y);
               this.removeFlag(4096, x - 1, y);
            }

            if(orientation == 1) {
               this.removeFlag(1024, x, y);
               this.removeFlag(16384, x, y + 1);
            }

            if(orientation == 2) {
               this.removeFlag(4096, x, y);
               this.removeFlag(65536, x + 1, y);
            }

            if(orientation == 3) {
               this.removeFlag(16384, x, y);
               this.removeFlag(1024, x, y - 1);
            }
         }

         if(group == 1 || group == 3) {
            if(orientation == 0) {
               this.removeFlag(512, x, y);
               this.removeFlag(8192, x - 1, y + 1);
            }

            if(orientation == 1) {
               this.removeFlag(2048, x, y);
               this.removeFlag('耀', x + 1, y + 1);
            }

            if(orientation == 2) {
               this.removeFlag(8192, x, y);
               this.removeFlag(512, x + 1, y - 1);
            }

            if(orientation == 3) {
               this.removeFlag('耀', x, y);
               this.removeFlag(2048, x - 1, y - 1);
            }
         }

         if(group == 2) {
            if(orientation == 0) {
               this.removeFlag(66560, x, y);
               this.removeFlag(4096, x - 1, y);
               this.removeFlag(16384, x, y + 1);
            }

            if(orientation == 1) {
               this.removeFlag(5120, x, y);
               this.removeFlag(16384, x, y + 1);
               this.removeFlag(65536, x + 1, y);
            }

            if(orientation == 2) {
               this.removeFlag(20480, x, y);
               this.removeFlag(65536, x + 1, y);
               this.removeFlag(1024, x, y - 1);
            }

            if(orientation == 3) {
               this.removeFlag(81920, x, y);
               this.removeFlag(1024, x, y - 1);
               this.removeFlag(4096, x - 1, y);
            }
         }
      }

   }

   public final void removeObject(int x, int width, int initialX, int initialY, int length, boolean impenetrable) {
      int value = 256;
      if(impenetrable) {
         value = 131328;
      }

      initialX = initialX;
      initialY = initialY;
      if(x == 1 || x == 3) {
         x = width;
         width = length;
         length = x;
      }

      for(x = initialX; x < initialX + width; ++x) {
         if(x >= 0 && x < 104) {
            for(int y = initialY; y < initialY + length; ++y) {
               if(y >= 0 && y < 104) {
                  this.removeFlag(value, x, y);
               }
            }
         }
      }

   }

   private void removeFlag(int flag, int x, int y) {
      this.adjacencies[x][y] &= 16777215 - flag;
   }
}
