final class CollisionMap {
   private final int b = 0;
   private final int c = 0;
   private final int d = 104;
   private final int e = 104;
   public final int[][] adjacencies = new int[104][104];

   public CollisionMap() {
      this.a();
   }

   public final void a() {
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
            this.a(x, y, 128);
            this.a(x - 1, y, 8);
         }

         if(orientation == 1) {
            this.a(x, y, 2);
            this.a(x, y + 1, 32);
         }

         if(orientation == 2) {
            this.a(x, y, 8);
            this.a(x + 1, y, 128);
         }

         if(orientation == 3) {
            this.a(x, y, 32);
            this.a(x, y - 1, 2);
         }
      }

      if(type == 1 || type == 3) {
         if(orientation == 0) {
            this.a(x, y, 1);
            this.a(x - 1, y + 1, 16);
         }

         if(orientation == 1) {
            this.a(x, y, 4);
            this.a(x + 1, y + 1, 64);
         }

         if(orientation == 2) {
            this.a(x, y, 16);
            this.a(x + 1, y - 1, 1);
         }

         if(orientation == 3) {
            this.a(x, y, 64);
            this.a(x - 1, y - 1, 4);
         }
      }

      if(type == 2) {
         if(orientation == 0) {
            this.a(x, y, 130);
            this.a(x - 1, y, 8);
            this.a(x, y + 1, 32);
         }

         if(orientation == 1) {
            this.a(x, y, 10);
            this.a(x, y + 1, 32);
            this.a(x + 1, y, 128);
         }

         if(orientation == 2) {
            this.a(x, y, 40);
            this.a(x + 1, y, 128);
            this.a(x, y - 1, 2);
         }

         if(orientation == 3) {
            this.a(x, y, 160);
            this.a(x, y - 1, 2);
            this.a(x - 1, y, 8);
         }
      }

      if(impenetrable) {
         if(type == 0) {
            if(orientation == 0) {
               this.a(x, y, 65536);
               this.a(x - 1, y, 4096);
            }

            if(orientation == 1) {
               this.a(x, y, 1024);
               this.a(x, y + 1, 16384);
            }

            if(orientation == 2) {
               this.a(x, y, 4096);
               this.a(x + 1, y, 65536);
            }

            if(orientation == 3) {
               this.a(x, y, 16384);
               this.a(x, y - 1, 1024);
            }
         }

         if(type == 1 || type == 3) {
            if(orientation == 0) {
               this.a(x, y, 512);
               this.a(x - 1, y + 1, 8192);
            }

            if(orientation == 1) {
               this.a(x, y, 2048);
               this.a(x + 1, y + 1, '耀');
            }

            if(orientation == 2) {
               this.a(x, y, 8192);
               this.a(x + 1, y - 1, 512);
            }

            if(orientation == 3) {
               this.a(x, y, '耀');
               this.a(x - 1, y - 1, 2048);
            }
         }

         if(type == 2) {
            if(orientation == 0) {
               this.a(x, y, 66560);
               this.a(x - 1, y, 4096);
               this.a(x, y + 1, 16384);
            }

            if(orientation == 1) {
               this.a(x, y, 5120);
               this.a(x, y + 1, 16384);
               this.a(x + 1, y, 65536);
            }

            if(orientation == 2) {
               this.a(x, y, 20480);
               this.a(x + 1, y, 65536);
               this.a(x, y - 1, 1024);
            }

            if(orientation == 3) {
               this.a(x, y, 81920);
               this.a(x, y - 1, 1024);
               this.a(x - 1, y, 4096);
            }
         }
      }

   }

   public final void flagObject(boolean impenetrable, int width, int length, int x, int y, int orientation) {
      int var7 = 256;
      if(impenetrable) {
         var7 = 131328;
      }

      x = x;
      y = y;
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
                  this.a(var8, orientation, var7);
               }
            }
         }
      }

   }

   public final void block(int var1, int var2) {
      this.adjacencies[var2][var1] |= 2097152;
   }

   private void a(int var1, int var2, int var3) {
      this.adjacencies[var1][var2] |= var3;
   }

   public final void a(int var1, int var2, boolean var3, int var4, int var5) {
      if(var2 == 0) {
         if(var1 == 0) {
            this.b(128, var4, var5);
            this.b(8, var4 - 1, var5);
         }

         if(var1 == 1) {
            this.b(2, var4, var5);
            this.b(32, var4, var5 + 1);
         }

         if(var1 == 2) {
            this.b(8, var4, var5);
            this.b(128, var4 + 1, var5);
         }

         if(var1 == 3) {
            this.b(32, var4, var5);
            this.b(2, var4, var5 - 1);
         }
      }

      if(var2 == 1 || var2 == 3) {
         if(var1 == 0) {
            this.b(1, var4, var5);
            this.b(16, var4 - 1, var5 + 1);
         }

         if(var1 == 1) {
            this.b(4, var4, var5);
            this.b(64, var4 + 1, var5 + 1);
         }

         if(var1 == 2) {
            this.b(16, var4, var5);
            this.b(1, var4 + 1, var5 - 1);
         }

         if(var1 == 3) {
            this.b(64, var4, var5);
            this.b(4, var4 - 1, var5 - 1);
         }
      }

      if(var2 == 2) {
         if(var1 == 0) {
            this.b(130, var4, var5);
            this.b(8, var4 - 1, var5);
            this.b(32, var4, var5 + 1);
         }

         if(var1 == 1) {
            this.b(10, var4, var5);
            this.b(32, var4, var5 + 1);
            this.b(128, var4 + 1, var5);
         }

         if(var1 == 2) {
            this.b(40, var4, var5);
            this.b(128, var4 + 1, var5);
            this.b(2, var4, var5 - 1);
         }

         if(var1 == 3) {
            this.b(160, var4, var5);
            this.b(2, var4, var5 - 1);
            this.b(8, var4 - 1, var5);
         }
      }

      if(var3) {
         if(var2 == 0) {
            if(var1 == 0) {
               this.b(65536, var4, var5);
               this.b(4096, var4 - 1, var5);
            }

            if(var1 == 1) {
               this.b(1024, var4, var5);
               this.b(16384, var4, var5 + 1);
            }

            if(var1 == 2) {
               this.b(4096, var4, var5);
               this.b(65536, var4 + 1, var5);
            }

            if(var1 == 3) {
               this.b(16384, var4, var5);
               this.b(1024, var4, var5 - 1);
            }
         }

         if(var2 == 1 || var2 == 3) {
            if(var1 == 0) {
               this.b(512, var4, var5);
               this.b(8192, var4 - 1, var5 + 1);
            }

            if(var1 == 1) {
               this.b(2048, var4, var5);
               this.b('耀', var4 + 1, var5 + 1);
            }

            if(var1 == 2) {
               this.b(8192, var4, var5);
               this.b(512, var4 + 1, var5 - 1);
            }

            if(var1 == 3) {
               this.b('耀', var4, var5);
               this.b(2048, var4 - 1, var5 - 1);
            }
         }

         if(var2 == 2) {
            if(var1 == 0) {
               this.b(66560, var4, var5);
               this.b(4096, var4 - 1, var5);
               this.b(16384, var4, var5 + 1);
            }

            if(var1 == 1) {
               this.b(5120, var4, var5);
               this.b(16384, var4, var5 + 1);
               this.b(65536, var4 + 1, var5);
            }

            if(var1 == 2) {
               this.b(20480, var4, var5);
               this.b(65536, var4 + 1, var5);
               this.b(1024, var4, var5 - 1);
            }

            if(var1 == 3) {
               this.b(81920, var4, var5);
               this.b(1024, var4, var5 - 1);
               this.b(4096, var4 - 1, var5);
            }
         }
      }

   }

   public final void a(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if(var6) {
         var7 = 131328;
      }

      var3 = var3;
      var4 = var4;
      if(var1 == 1 || var1 == 3) {
         var1 = var2;
         var2 = var5;
         var5 = var1;
      }

      for(var1 = var3; var1 < var3 + var2; ++var1) {
         if(var1 >= 0 && var1 < 104) {
            for(int var8 = var4; var8 < var4 + var5; ++var8) {
               if(var8 >= 0 && var8 < 104) {
                  this.b(var7, var1, var8);
               }
            }
         }
      }

   }

   private void b(int var1, int var2, int var3) {
      this.adjacencies[var2][var3] &= 16777215 - var1;
   }
}
