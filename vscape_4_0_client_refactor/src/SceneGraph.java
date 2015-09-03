final class SceneGraph {
   private boolean d = true;
   public static boolean lowMemory = true;
   private final int e = 4;
   private final int f = 104;
   private final int g = 104;
   private final int[][][] tileHeights;
   private final SceneTile[][][] tiles = new SceneTile[4][104][104];
   private int j;
   private int k;
   private final GameObject[] sceneEntitys = new GameObject[5000];
   private final int[][][] m = new int[4][105][105];
   private static int n;
   private static int o;
   private static int p;
   private static int q;
   private static int r;
   private static int s;
   private static int t;
   private static int u;
   private static int v;
   private static int w;
   private static int x;
   private static int y;
   private static int z;
   private static int A;
   private static int B;
   private static int C;
   private static GameObject[] D = new GameObject[100];
   private static final int[] E = new int[]{53, -53, -53, 53};
   private static final int[] F = new int[]{-53, -53, 53, 53};
   private static final int[] G = new int[]{-45, 45, 45, -45};
   private static final int[] H = new int[]{45, 45, -45, -45};
   private static boolean I;
   private static int J;
   private static int K;
   public static int b = -1;
   public static int c = -1;
   private static final int L = 4;
   private static int[] M = new int[4];
   private static Class77[][] N = new Class77[4][500];
   private static int O;
   private static final Class77[] P = new Class77[500];
   private static LinkedList Q = new LinkedList();
   private static final int[] R = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   private static final int[] S = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
   private static final int[] T = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
   private static final int[] U = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
   private static final int[] V = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
   private static final int[] W = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
   private static final int[] X = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
   private static final int[] Y = new int[]{41, '饐', 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 'ꡎ', 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 7079, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41};
   private final int[] Z = new int[10000];
   private final int[] aa = new int[10000];
   private int ab;
   private final int[][] ac = new int[][]{new int[16], {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   private final int[][] ad = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   private static boolean[][][][] ae = new boolean[8][32][51][51];
   private static boolean[][] af;
   private static int ag;
   private static int ah;
   private static int ai;
   private static int aj;
   private static int ak;
   private static int al;

   public SceneGraph(int[][][] tileHeights) {
      this.tileHeights = tileHeights;
      this.reset();
   }

   public static void dispose() {
      D = null;
      M = null;
      N = null;
      Q = null;
      ae = null;
      af = null;
   }

   public final void reset() {
      int var1;
      int var2;
      for(var1 = 0; var1 < 4; ++var1) {
         for(var2 = 0; var2 < 104; ++var2) {
            for(int var3 = 0; var3 < 104; ++var3) {
               this.tiles[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < 4; ++var1) {
         for(var2 = 0; var2 < M[var1]; ++var2) {
            N[var1][var2] = null;
         }

         M[var1] = 0;
      }

      for(var1 = 0; var1 < this.k; ++var1) {
         this.sceneEntitys[var1] = null;
      }

      this.k = 0;

      for(var1 = 0; var1 < D.length; ++var1) {
         D[var1] = null;
      }

   }

   public final void a(int var1) {
      this.j = var1;

      for(int var2 = 0; var2 < 104; ++var2) {
         for(int var3 = 0; var3 < 104; ++var3) {
            if(this.tiles[var1][var2][var3] == null) {
               this.tiles[var1][var2][var3] = new SceneTile(var1, var2, var3);
            }
         }
      }

   }

   public final void a(int var1, int var2) {
      SceneTile var3 = this.tiles[0][var2][var1];

      for(int var4 = 0; var4 < 3; ++var4) {
         SceneTile var5;
         if((var5 = this.tiles[var4][var2][var1] = this.tiles[var4 + 1][var2][var1]) != null) {
            --var5.plane;

            for(int var6 = 0; var6 < var5.objectCount; ++var6) {
               GameObject var7;
               if(((var7 = var5.gameObjects[var6]).key >> 29 & 3) == 2 && var7.positionX == var2 && var7.positionY == var1) {
                  --var7.plane;
               }
            }
         }
      }

      if(this.tiles[0][var2][var1] == null) {
         this.tiles[0][var2][var1] = new SceneTile(0, var2, var1);
      }

      this.tiles[0][var2][var1].sceneTile = var3;
      this.tiles[3][var2][var1] = null;
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Class77 var8;
      (var8 = new Class77()).a = var1 / 128;
      var8.b = var3 / 128;
      var8.c = var6 / 128;
      var8.d = var4 / 128;
      var8.e = var7;
      var8.f = var1;
      var8.g = var3;
      var8.h = var6;
      var8.i = var4;
      var8.j = var5;
      var8.k = var2;
      N[var0][M[var0]++] = var8;
   }

   public final void setCollisionPlane(int plane, int x, int y, int collisionPlane) {
      if(this.tiles[plane][x][y] != null) {
         this.tiles[plane][x][y].collisionPlane = collisionPlane;
      }

   }

   public final void a(int var1, int x, int y, int type, int z, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      SimpleTile var21;
      if(type == 0) {
         var21 = new SimpleTile(var11, var12, var13, var14, -1, var19, false);

         for(z = var1; z >= 0; --z) {
            if(this.tiles[z][x][y] == null) {
               this.tiles[z][x][y] = new SceneTile(z, x, y);
            }
         }

         this.tiles[var1][x][y].simpleTile = var21;
      } else if(type != 1) {
         ShapedTile var22 = new ShapedTile(y, var15, var14, var9, var6, var17, z, var11, var19, var13, var10, var8, var7, type, var18, var16, var12, x, var20);

         for(z = var1; z >= 0; --z) {
            if(this.tiles[z][x][y] == null) {
               this.tiles[z][x][y] = new SceneTile(z, x, y);
            }
         }

         this.tiles[var1][x][y].shapedTile = var22;
      } else {
         var21 = new SimpleTile(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(z = var1; z >= 0; --z) {
            if(this.tiles[z][x][y] == null) {
               this.tiles[z][x][y] = new SceneTile(z, x, y);
            }
         }

         this.tiles[var1][x][y].simpleTile = var21;
      }
   }

   public final void addFloorDecoration(int z, int renderHeight, int y, Renderable renderable, byte config, int key, int x) {
      if(renderable != null) {
         GroundDecoration decoration;
         (decoration = new GroundDecoration()).renderable = renderable;
         decoration.x = (x << 7) + 64;
         decoration.y = (y << 7) + 64;
         decoration.renderHeight = renderHeight;
         decoration.key = key;
         decoration.config = config;
         if(this.tiles[z][x][y] == null) {
            this.tiles[z][x][y] = new SceneTile(z, x, y);
         }

         this.tiles[z][x][y].groundDecoration = decoration;
      }
   }

   public final void a(int var1, int var2, Renderable var3, int var4, Renderable var5, Renderable var6, int var7, int var8) {
      GroundItem var9;
      (var9 = new GroundItem()).primary = var6;
      var9.b = (var1 << 7) + 64;
      var9.c = (var8 << 7) + 64;
      var9.a = var4;
      var9.g = var2;
      var9.tertiary = var3;
      var9.secondary = var5;
      var2 = 0;
      SceneTile var10;
      if((var10 = this.tiles[var7][var1][var8]) != null) {
         for(var4 = 0; var4 < var10.objectCount; ++var4) {
            int var11;
            if(var10.gameObjects[var4].renderable instanceof Model && (var11 = ((Model)var10.gameObjects[var4].renderable).v) > var2) {
               var2 = var11;
            }
         }
      }

      var9.h = var2;
      if(this.tiles[var7][var1][var8] == null) {
         this.tiles[var7][var1][var8] = new SceneTile(var7, var1, var8);
      }

      this.tiles[var7][var1][var8].groundItem = var9;
   }

   public final void addWall(int faceUnknown, Renderable renderable1, int key, int y, byte config, int x, Renderable renderable2, int plane, int face, int z) {
      if(renderable1 != null || renderable2 != null) {
         Wall wall;
         (wall = new Wall()).key = key;
         wall.config = config;
         wall.x = (x << 7) + 64;
         wall.y = (y << 7) + 64;
         wall.height = plane;
         wall.primary = renderable1;
         wall.secondary = renderable2;
         wall.faceUnknown = faceUnknown;
         wall.face = face;

         for(faceUnknown = z; faceUnknown >= 0; --faceUnknown) {
            if(this.tiles[faceUnknown][x][y] == null) {
               this.tiles[faceUnknown][x][y] = new SceneTile(faceUnknown, x, y);
            }
         }

         this.tiles[z][x][y].wall = wall;
      }
   }

   public final void addWallDecoration(int key, int y, int orientation, int z, int dx, int plane, Renderable renderable, int x, byte config, int dy, int faceUnknown) {
      if(renderable != null) {
         WallDecoration wallDecoration;
         (wallDecoration = new WallDecoration()).key = key;
         wallDecoration.config = config;
         wallDecoration.x = (x << 7) + 64 + dx;
         wallDecoration.y = (y << 7) + 64 + dy;
         wallDecoration.height = plane;
         wallDecoration.renderable = renderable;
         wallDecoration.faceUnknown = faceUnknown;
         wallDecoration.face = orientation;

         for(key = z; key >= 0; --key) {
            if(this.tiles[key][x][y] == null) {
               this.tiles[key][x][y] = new SceneTile(key, x, y);
            }
         }

         this.tiles[z][x][y].wallDecoration = wallDecoration;
      }
   }

   public final boolean addObject(int key, byte config, int renderHeight, int dy, Renderable renderable, int dx, int z, int yaw, int y, int x) {
      if(renderable == null) {
         return true;
      } else {
         int centreX = (x << 7) + dx * 64;
         int centreY = (y << 7) + dy * 64;
         return this.addRenderable(z, x, y, dx, dy, centreX, centreY, renderHeight, renderable, yaw, false, key, config);
      }
   }

   public final boolean addEntity(int plane, int yaw, int renderHeight, int key, int y, int maxY, int x, Renderable renderable, boolean accountForYaw) {
	   if(renderable == null) {
         return true;
      } else {
         int minX = x - maxY;
         int minY = y - maxY;
         int maxX = x + maxY;
         maxY += y;
         if(accountForYaw) {
            if(yaw > 640 && yaw < 1408) {
               maxY += 128;
            }

            if(yaw > 1152 && yaw < 1920) {
               maxX += 128;
            }

            if(yaw > 1664 || yaw < 384) {
               minY -= 128;
            }

            if(yaw > 128 && yaw < 896) {
               minX -= 128;
            }
         }

         minX /= 128;
         minY /= 128;
         maxX /= 128;
         maxY /= 128;
         return this.addRenderable(plane, minX, minY, maxX - minX + 1, maxY - minY + 1, x, y, renderHeight, renderable, yaw, true, key, (byte)0);
      }
   }

   public final boolean addRenderable(int plane, int worldY, Renderable renderable, int orientation, int i1, int j1, int k1, int l1, int i2, int j2, int k2) {
      return renderable == null || this.addRenderable(plane, l1, k2, i2 - l1 + 1, i1 - k2 + 1, j1, worldY, k1, renderable, orientation, true, j2, (byte)0);
   }

   private boolean addRenderable(int plane, int minX, int minY, int deltaX, int deltaY, int centreX, int centreY, int renderHeight, Renderable renderable, int yaw, boolean flag, int key, byte config) {
      int var15;
      for(int var14 = minX; var14 < minX + deltaX; ++var14) {
         for(var15 = minY; var15 < minY + deltaY; ++var15) {
            if(var14 < 0 || var15 < 0 || var14 >= 104 || var15 >= 104) {
               return false;
            }

            SceneTile var16;
            if((var16 = this.tiles[plane][var14][var15]) != null && var16.objectCount >= 5) {
               return false;
            }
         }
      }

      GameObject var18;
      (var18 = new GameObject()).key = key;
      var18.config = config;
      var18.plane = plane;
      var18.centreX = centreX;
      var18.centreY = centreY;
      var18.renderHeight = renderHeight;
      var18.renderable = renderable;
      var18.yaw = yaw;
      var18.positionX = minX;
      var18.positionY = minY;
      var18.maxX = minX + deltaX - 1;
      var18.maxY = minY + deltaY - 1;

      for(var15 = minX; var15 < minX + deltaX; ++var15) {
         for(int var19 = minY; var19 < minY + deltaY; ++var19) {
            centreX = 0;
            if(var15 > minX) {
               ++centreX;
            }

            if(var15 < minX + deltaX - 1) {
               centreX += 4;
            }

            if(var19 > minY) {
               centreX += 8;
            }

            if(var19 < minY + deltaY - 1) {
               centreX += 2;
            }

            for(centreY = plane; centreY >= 0; --centreY) {
               if(this.tiles[centreY][var15][var19] == null) {
                  this.tiles[centreY][var15][var19] = new SceneTile(centreY, var15, var19);
               }
            }

            SceneTile var17;
            (var17 = this.tiles[plane][var15][var19]).gameObjects[var17.objectCount] = var18;
            var17.objectAttributes[var17.objectCount] = centreX;
            var17.attributes |= centreX;
            ++var17.objectCount;

         }
      }

      if(flag) {
         this.sceneEntitys[this.k++] = var18;
      }

      return true;
   }

   public final void c() {
      for(int var1 = 0; var1 < this.k; ++var1) {
         GameObject var2 = this.sceneEntitys[var1];
         this.removeInteractable(var2);
         this.sceneEntitys[var1] = null;
      }

      this.k = 0;
   }

   private void removeInteractable(GameObject var1) {
      for(int var2 = var1.positionX; var2 <= var1.maxX; ++var2) {
         for(int var3 = var1.positionY; var3 <= var1.maxY; ++var3) {
            SceneTile var4;
            if((var4 = this.tiles[var1.plane][var2][var3]) != null) {
               int var5;
               for(var5 = 0; var5 < var4.objectCount; ++var5) {
                  if(var4.gameObjects[var5] == var1) {
                     --var4.objectCount;

                     for(var5 = var5; var5 < var4.objectCount; ++var5) {
                        var4.gameObjects[var5] = var4.gameObjects[var5 + 1];
                        var4.objectAttributes[var5] = var4.objectAttributes[var5 + 1];
                     }

                     var4.gameObjects[var4.objectCount] = null;
                     break;
                  }
               }

               var4.attributes = 0;

               for(var5 = 0; var5 < var4.objectCount; ++var5) {
                  var4.attributes |= var4.objectAttributes[var5];
               }
            }
         }
      }

   }

   public final void displaceWallDecor(int y, int displacement, int x, int z) {
      SceneTile var5;
      if((var5 = this.tiles[z][x][y]) != null) {
         WallDecoration var6;
         if((var6 = var5.wallDecoration) != null) {
            x = (x << 7) + 64;
            y = (y << 7) + 64;
            var6.x = x + (var6.x - x) * displacement / 16;
            var6.y = y + (var6.y - y) * displacement / 16;
         }

      }
   }

   public final void a(int var1, int var2, int var3, byte var4) {
      SceneTile var5;
      if((var5 = this.tiles[var2][var1][var3]) != null) {
         var5.wall = null;
      }

   }

   public final void a(int var1, int var2, int var3) {
      SceneTile var4;
      if((var4 = this.tiles[var2][var3][var1]) != null) {
         var4.wallDecoration = null;
      }

   }

   public final void b(int var1, int var2, int var3) {
      SceneTile var6;
      if((var6 = this.tiles[var1][var2][var3]) != null) {
         for(int var4 = 0; var4 < var6.objectCount; ++var4) {
            GameObject var5;
            if(((var5 = var6.gameObjects[var4]).key >> 29 & 3) == 2 && var5.positionX == var2 && var5.positionY == var3) {
               this.removeInteractable(var5);
               return;
            }
         }

      }
   }

   public final void c(int var1, int var2, int var3) {
      SceneTile var4;
      if((var4 = this.tiles[var1][var3][var2]) != null) {
         var4.groundDecoration = null;
      }
   }

   public final void d(int var1, int var2, int var3) {
      SceneTile var4;
      if((var4 = this.tiles[var1][var2][var3]) != null) {
         var4.groundItem = null;
      }

   }

   public final Wall getTileWall(int plane, int x, int y) {
      SceneTile var4;
      return (var4 = this.tiles[plane][x][y]) == null?null:var4.wall;
   }

   public final WallDecoration getTileWallDecoration(int x, int y, int plane) {
      SceneTile var4;
      return (var4 = this.tiles[plane][x][y]) == null?null:var4.wallDecoration;
   }

   public final GameObject firstGameObject(int x, int y, int plane) {
      SceneTile tile;
      if((tile = this.tiles[plane][x][y]) == null) {
         return null;
      } else {
         for(int var4 = 0; var4 < tile.objectCount; ++var4) {
            GameObject interactable;
            if(((interactable = tile.gameObjects[var4]).key >> 29 & 3) == 2 && interactable.positionX == x && interactable.positionY == y) {
               return interactable;
            }
         }

         return null;
      }
   }

   public final GroundDecoration getTileFloorDecoration(int y, int x, int plane) {
      SceneTile var4;
      return (var4 = this.tiles[plane][x][y]) != null && var4.groundDecoration != null?var4.groundDecoration:null;
   }

   public final int getWallKey(int plane, int x, int y) {
      SceneTile var4;
      return (var4 = this.tiles[plane][x][y]) != null && var4.wall != null?var4.wall.key:0;
   }

   public final int getWallDecorationKey(int plane, int x, int y) {
      SceneTile var4;
      return (var4 = this.tiles[plane][x][y]) != null && var4.wallDecoration != null?var4.wallDecoration.key:0;
   }

   public final int k(int var1, int var2, int var3) {
      SceneTile var6;
      if((var6 = this.tiles[var1][var2][var3]) == null) {
         return 0;
      } else {
         for(int var4 = 0; var4 < var6.objectCount; ++var4) {
            GameObject var5;
            if(((var5 = var6.gameObjects[var4]).key >> 29 & 3) == 2 && var5.positionX == var2 && var5.positionY == var3) {
               return var5.key;
            }
         }

         return 0;
      }
   }

   public final int l(int var1, int var2, int var3) {
      SceneTile var4;
      return (var4 = this.tiles[var1][var2][var3]) != null && var4.groundDecoration != null?var4.groundDecoration.key:0;
   }

   public final int c(int var1, int var2, int var3, int var4) {
      SceneTile var5;
      if((var5 = this.tiles[var1][var2][var3]) == null) {
         return -1;
      } else if(var5.wall != null && var5.wall.key == var4) {
         return var5.wall.config & 255;
      } else if(var5.wallDecoration != null && var5.wallDecoration.key == var4) {
         return var5.wallDecoration.config & 255;
      } else if(var5.groundDecoration != null && var5.groundDecoration.key == var4) {
         return var5.groundDecoration.config & 255;
      } else {
         for(var2 = 0; var2 < var5.objectCount; ++var2) {
            if(var5.gameObjects[var2].key == var4) {
               return var5.gameObjects[var2].config & 255;
            }
         }

         return -1;
      }
   }

   public final void m(int var1, int var2, int var3) {
      var1 = (int)Math.sqrt(5100.0D);
      var1 = var1 * 768 >> 8;

      for(var2 = 0; var2 < 4; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            for(int var4 = 0; var4 < 104; ++var4) {
               SceneTile var5;
               if((var5 = this.tiles[var2][var3][var4]) != null) {
                  Wall var6 = var5.wall;
                  if(var5.wall != null && var6.primary != null && var6.primary.normals != null) {
                     this.a(var2, 1, 1, var3, var4, (Model)var6.primary);
                     if(var6.secondary != null && var6.secondary.normals != null) {
                        this.a(var2, 1, 1, var3, var4, (Model)var6.secondary);
                        this.a((Model)var6.primary, (Model)var6.secondary, 0, 0, 0, false);
                        ((Model)var6.secondary).a(80, var1, -50, -10, -50);
                     }

                     ((Model)var6.primary).a(80, var1, -50, -10, -50);
                  }

                  for(int var12 = 0; var12 < var5.objectCount; ++var12) {
                     GameObject var7;
                     if((var7 = var5.gameObjects[var12]) != null && var7.renderable != null && var7.renderable.normals != null) {
                        this.a(var2, var7.maxX - var7.positionX + 1, var7.maxY - var7.positionY + 1, var3, var4, (Model)var7.renderable);
                        ((Model)var7.renderable).a(80, var1, -50, -10, -50);
                     }
                  }

                  GroundDecoration var13 = var5.groundDecoration;
                  if(var5.groundDecoration != null && var13.renderable.normals != null) {
                     Model var9 = (Model)var13.renderable;
                     SceneTile var11;
                     if(var3 < 104 && (var11 = this.tiles[var2][var3 + 1][var4]) != null && var11.groundDecoration != null && var11.groundDecoration.renderable.normals != null) {
                        this.a(var9, (Model)var11.groundDecoration.renderable, 128, 0, 0, true);
                     }

                     if(var4 < 104 && (var11 = this.tiles[var2][var3][var4 + 1]) != null && var11.groundDecoration != null && var11.groundDecoration.renderable.normals != null) {
                        this.a(var9, (Model)var11.groundDecoration.renderable, 0, 0, 128, true);
                     }

                     if(var3 < 104 && var4 < 104 && (var11 = this.tiles[var2][var3 + 1][var4 + 1]) != null && var11.groundDecoration != null && var11.groundDecoration.renderable.normals != null) {
                        this.a(var9, (Model)var11.groundDecoration.renderable, 128, 0, 128, true);
                     }

                     if(var3 < 104 && var4 > 0 && (var11 = this.tiles[var2][var3 + 1][var4 - 1]) != null && var11.groundDecoration != null && var11.groundDecoration.renderable.normals != null) {
                        this.a(var9, (Model)var11.groundDecoration.renderable, 128, 0, -128, true);
                     }

                     ((Model)var13.renderable).a(80, var1, -50, -10, -50);
                  }
               }
            }
         }
      }

   }

   private void a(int var1, int var2, int var3, int var4, int var5, Model var6) {
      boolean var7 = true;
      int var8 = var4;
      int var9 = var4 + var2;
      int var10 = var5 - 1;
      int var11 = var5 + var3;

      for(int var12 = var1; var12 <= var1 + 1; ++var12) {
         if(var12 != 4) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if(var13 >= 0 && var13 < 104) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     SceneTile var15;
                     if(var14 >= 0 && var14 < 104 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var5 && var13 != var4) && (var15 = this.tiles[var12][var13][var14]) != null) {
                        int var16 = (this.tileHeights[var12][var13][var14] + this.tileHeights[var12][var13 + 1][var14] + this.tileHeights[var12][var13][var14 + 1] + this.tileHeights[var12][var13 + 1][var14 + 1]) / 4 - (this.tileHeights[var1][var4][var5] + this.tileHeights[var1][var4 + 1][var5] + this.tileHeights[var1][var4][var5 + 1] + this.tileHeights[var1][var4 + 1][var5 + 1]) / 4;
                        Wall var17 = var15.wall;
                        if(var15.wall != null && var17.primary != null && var17.primary.normals != null) {
                           this.a(var6, (Model)var17.primary, (var13 - var4 << 7) + (1 - var2 << 6), var16, (var14 - var5 << 7) + (1 - var3 << 6), var7);
                        }

                        if(var17 != null && var17.secondary != null && var17.secondary.normals != null) {
                           this.a(var6, (Model)var17.secondary, (var13 - var4 << 7) + (1 - var2 << 6), var16, (var14 - var5 << 7) + (1 - var3 << 6), var7);
                        }

                        for(int var21 = 0; var21 < var15.objectCount; ++var21) {
                           GameObject var18;
                           if((var18 = var15.gameObjects[var21]) != null && var18.renderable != null && var18.renderable.normals != null) {
                              int var19 = var18.maxX - var18.positionX + 1;
                              int var20 = var18.maxY - var18.positionY + 1;
                              this.a(var6, (Model)var18.renderable, (var18.positionX - var4 << 7) + (var19 - var2 << 6), var16, (var18.positionY - var5 << 7) + (var20 - var3 << 6), var7);
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   private void a(Model var1, Model var2, int var3, int var4, int var5, boolean var6) {
      ++this.ab;
      int var7 = 0;
      int[] var8 = var2.e;
      int var9 = var2.vertices;

      int var10;
      for(var10 = 0; var10 < var1.vertices; ++var10) {
         VertexNormal var11 = var1.normals[var10];
         VertexNormal var12;
         int var13;
         int var14;
         int var15;
         if((var12 = var1.z[var10]).faces != 0 && (var13 = var1.f[var10] - var4) <= var2.s && (var14 = var1.e[var10] - var3) >= var2.n && var14 <= var2.o && (var15 = var1.g[var10] - var5) >= var2.q && var15 <= var2.p) {
            for(int var16 = 0; var16 < var9; ++var16) {
               VertexNormal var17 = var2.normals[var16];
               VertexNormal var18 = var2.z[var16];
               if(var14 == var8[var16] && var15 == var2.g[var16] && var13 == var2.f[var16] && var18.faces != 0) {
                  var11.x += var18.x;
                  var11.y += var18.y;
                  var11.z += var18.z;
                  var11.faces += var18.faces;
                  var17.x += var12.x;
                  var17.y += var12.y;
                  var17.z += var12.z;
                  var17.faces += var12.faces;
                  ++var7;
                  this.Z[var10] = this.ab;
                  this.aa[var16] = this.ab;
               }
            }
         }
      }

      if(var7 >= 3 && var6) {
         for(var10 = 0; var10 < var1.faces; ++var10) {
            if(this.Z[var1.i[var10]] == this.ab && this.Z[var1.j[var10]] == this.ab && this.Z[var1.k[var10]] == this.ab) {
               var1.l[var10] = -1;
            }
         }

         for(var10 = 0; var10 < var2.faces; ++var10) {
            if(this.aa[var2.i[var10]] == this.ab && this.aa[var2.j[var10]] == this.ab && this.aa[var2.k[var10]] == this.ab) {
               var2.l[var10] = -1;
            }
         }

      }
   }

   public final void a(int[] var1, int var2, int var3, int var4, int var5) {
      SceneTile var9;
      if((var9 = this.tiles[var3][var4][var5]) != null) {
         SimpleTile var11 = var9.simpleTile;
         if(var9.simpleTile == null) {
            ShapedTile var10;
            if((var10 = var9.shapedTile) != null) {
               var4 = var10.l;
               var5 = var10.orientation;
               int var6 = var10.n;
               var3 = var10.o;
               int[] var12 = this.ac[var4];
               int[] indices = this.ad[var5];
               int var7 = 0;
               int var8;
               if(var6 != 0) {
                  for(var8 = 0; var8 < 4; ++var8) {
                     var1[var2] = var12[indices[var7++]] != 0?var3:var6;
                     var1[var2 + 1] = var12[indices[var7++]] != 0?var3:var6;
                     var1[var2 + 2] = var12[indices[var7++]] != 0?var3:var6;
                     var1[var2 + 3] = var12[indices[var7++]] != 0?var3:var6;
                     var2 += 512;
                  }

               } else {
                  for(var8 = 0; var8 < 4; ++var8) {
                     if(var12[indices[var7++]] != 0) {
                        var1[var2] = var3;
                     }

                     if(var12[indices[var7++]] != 0) {
                        var1[var2 + 1] = var3;
                     }

                     if(var12[indices[var7++]] != 0) {
                        var1[var2 + 2] = var3;
                     }

                     if(var12[indices[var7++]] != 0) {
                        var1[var2 + 3] = var3;
                     }

                     var2 += 512;
                  }

               }
            }
         } else {
            var3 = var11.g;
            if(var11.g != 0) {
               for(var4 = 0; var4 < 4; ++var4) {
                  var1[var2] = var3;
                  var1[var2 + 1] = var3;
                  var1[var2 + 2] = var3;
                  var1[var2 + 3] = var3;
                  var2 += 512;
               }

            }
         }
      }
   }

   public static void a(int var0, int var1, int var2, int var3, int[] var4) {
      ai = 0;
      aj = 0;
      ak = var2;
      al = var3;
      ag = var2 / 2;
      ah = var3 / 2;
      boolean[][][][] var16 = new boolean[9][32][53][53];

      int var5;
      int var7;
      int var8;
      for(var1 = 128; var1 <= 384; var1 += 32) {
         for(var2 = 0; var2 < 2048; var2 += 64) {
            z = Model.SINE[var1];
            A = Model.COSINE[var1];
            B = Model.SINE[var2];
            C = Model.COSINE[var2];
            var3 = (var1 - 128) / 32;
            var5 = var2 / 64;

            for(int var6 = -26; var6 <= 26; ++var6) {
               for(var7 = -26; var7 <= 26; ++var7) {
                  var8 = var6 << 7;
                  int var9 = var7 << 7;
                  boolean var10 = false;

                  for(int var11 = -500; var11 <= 800; var11 += 128) {
                     int var14 = var4[var3] + var11;
                     int var15 = var9 * B + var8 * C >> 16;
                     int var13 = var9 * C - var8 * B >> 16;
                     int var12 = var14 * z + var13 * A >> 16;
                     var14 = var14 * A - var13 * z >> 16;
                     boolean var10000;
                     if(var12 >= 50 && var12 <= 3500) {
                        var13 = ag + (var15 << Client.d) / var12;
                        var14 = ah + (var14 << Client.d) / var12;
                        var10000 = var13 >= 0 && var13 <= ak && var14 >= 0 && var14 <= al;
                     } else {
                        var10000 = false;
                     }

                     if(var10000) {
                        var10 = true;
                        break;
                     }
                  }

                  var16[var3][var5][var6 + 25 + 1][var7 + 25 + 1] = var10;
               }
            }
         }
      }

      for(var1 = 0; var1 < 8; ++var1) {
         for(var2 = 0; var2 < 32; ++var2) {
            for(var3 = -25; var3 < 25; ++var3) {
               for(var5 = -25; var5 < 25; ++var5) {
                  boolean var17 = false;

                  label85:
                  for(var7 = -1; var7 <= 1; ++var7) {
                     for(var8 = -1; var8 <= 1; ++var8) {
                        if(var16[var1][var2][var3 + var7 + 25 + 1][var5 + var8 + 25 + 1]) {
                           var17 = true;
                           break label85;
                        }

                        if(var16[var1][(var2 + 1) % 31][var3 + var7 + 25 + 1][var5 + var8 + 25 + 1]) {
                           var17 = true;
                           break label85;
                        }

                        if(var16[var1 + 1][var2][var3 + var7 + 25 + 1][var5 + var8 + 25 + 1]) {
                           var17 = true;
                           break label85;
                        }

                        if(var16[var1 + 1][(var2 + 1) % 31][var3 + var7 + 25 + 1][var5 + var8 + 25 + 1]) {
                           var17 = true;
                           break label85;
                        }
                     }
                  }

                  ae[var1][var2][var3 + 25][var5 + 25] = var17;
               }
            }
         }
      }

   }

   public static void b(int var0, int var1) {
      I = true;
      J = var1;
      K = var0;
      b = -1;
      c = -1;
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 < 0) {
         var1 = 0;
      } else if(var1 >= 13312) {
         var1 = 13311;
      }

      if(var2 < 0) {
         var2 = 0;
      } else if(var2 >= 13312) {
         var2 = 13311;
      }

      ++p;
      z = Model.SINE[var6];
      A = Model.COSINE[var6];
      B = Model.SINE[var3];
      C = Model.COSINE[var3];
      af = ae[(var6 - 128) / 32][var3 / 64];
      w = var1;
      x = var4;
      y = var2;
      u = var1 / 128;
      v = var2 / 128;
      o = var5;
      if((q = u - 25) < 0) {
         q = 0;
      }

      if((s = v - 25) < 0) {
         s = 0;
      }

      if((r = u + 25) > 104) {
         r = 104;
      }

      if((t = v + 25) > 104) {
         t = 104;
      }

      var1 = M[o];
      Class77[] var14 = N[o];
      O = 0;

      int var7;
      int var8;
      for(var3 = 0; var3 < var1; ++var3) {
         int var9;
         int var11;
         Class77 var16;
         boolean var18;
         if((var16 = var14[var3]).e == 1) {
            if((var7 = var16.a - u + 25) >= 0 && var7 <= 50) {
               if((var8 = var16.c - v + 25) < 0) {
                  var8 = 0;
               }

               if((var9 = var16.d - v + 25) > 50) {
                  var9 = 50;
               }

               var18 = false;

               while(var8 <= var9) {
                  if(af[var7][var8++]) {
                     var18 = true;
                     break;
                  }
               }

               if(var18) {
                  if((var11 = w - var16.f) > 32) {
                     var16.l = 1;
                  } else {
                     if(var11 >= -32) {
                        continue;
                     }

                     var16.l = 2;
                     var11 = -var11;
                  }

                  var16.o = (var16.h - y << 8) / var11;
                  var16.p = (var16.i - y << 8) / var11;
                  var16.q = (var16.j - x << 8) / var11;
                  var16.r = (var16.k - x << 8) / var11;
                  P[O++] = var16;
               }
            }
         } else if(var16.e == 2) {
            if((var7 = var16.c - v + 25) >= 0 && var7 <= 50) {
               if((var8 = var16.a - u + 25) < 0) {
                  var8 = 0;
               }

               if((var9 = var16.b - u + 25) > 50) {
                  var9 = 50;
               }

               var18 = false;

               while(var8 <= var9) {
                  if(af[var8++][var7]) {
                     var18 = true;
                     break;
                  }
               }

               if(var18) {
                  if((var11 = y - var16.h) > 32) {
                     var16.l = 3;
                  } else {
                     if(var11 >= -32) {
                        continue;
                     }

                     var16.l = 4;
                     var11 = -var11;
                  }

                  var16.m = (var16.f - w << 8) / var11;
                  var16.n = (var16.g - w << 8) / var11;
                  var16.q = (var16.j - x << 8) / var11;
                  var16.r = (var16.k - x << 8) / var11;
                  P[O++] = var16;
               }
            }
         } else if(var16.e == 4 && (var7 = var16.j - x) > 128) {
            if((var8 = var16.c - v + 25) < 0) {
               var8 = 0;
            }

            if((var9 = var16.d - v + 25) > 50) {
               var9 = 50;
            }

            if(var8 <= var9) {
               int var10;
               if((var10 = var16.a - u + 25) < 0) {
                  var10 = 0;
               }

               if((var11 = var16.b - u + 25) > 50) {
                  var11 = 50;
               }

               boolean var12 = false;

               label358:
               for(var10 = var10; var10 <= var11; ++var10) {
                  for(int var13 = var8; var13 <= var9; ++var13) {
                     if(af[var10][var13]) {
                        var12 = true;
                        break label358;
                     }
                  }
               }

               if(var12) {
                  var16.l = 5;
                  var16.m = (var16.f - w << 8) / var7;
                  var16.n = (var16.g - w << 8) / var7;
                  var16.o = (var16.h - y << 8) / var7;
                  var16.p = (var16.i - y << 8) / var7;
                  P[O++] = var16;
               }
            }
         }
      }

      n = 0;

      SceneTile[][] var15;
      for(var1 = this.j; var1 < 4; ++var1) {
         var15 = this.tiles[var1];

         for(var3 = q; var3 < r; ++var3) {
            for(var6 = s; var6 < t; ++var6) {
               SceneTile var17;
               if((var17 = var15[var3][var6]) != null) {
                  if(var17.collisionPlane <= var5 && (af[var3 - u + 25][var6 - v + 25] || this.tileHeights[var1][var3][var6] - var4 >= 2000)) {
                     var17.p = true;
                     var17.q = true;
                     var17.r = var17.objectCount > 0;
                     ++n;
                  } else {
                     var17.p = false;
                     var17.q = false;
                     var17.s = 0;
                  }
               }
            }
         }
      }

      SceneTile var19;
      for(var1 = this.j; var1 < 4; ++var1) {
         var15 = this.tiles[var1];

         for(var3 = -25; var3 <= 0; ++var3) {
            var6 = u + var3;
            var7 = u - var3;
            if(var6 >= q || var7 < r) {
               for(var4 = -25; var4 <= 0; ++var4) {
                  var5 = v + var4;
                  var8 = v - var4;
                  if(var6 >= q) {
                     if(var5 >= s && (var19 = var15[var6][var5]) != null && var19.p) {
                        this.a(var19, true);
                     }

                     if(var8 < t && (var19 = var15[var6][var8]) != null && var19.p) {
                        this.a(var19, true);
                     }
                  }

                  if(var7 < r) {
                     if(var5 >= s && (var19 = var15[var7][var5]) != null && var19.p) {
                        this.a(var19, true);
                     }

                     if(var8 < t && (var19 = var15[var7][var8]) != null && var19.p) {
                        this.a(var19, true);
                     }
                  }

                  if(n == 0) {
                     I = false;
                     return;
                  }
               }
            }
         }
      }

      for(var1 = this.j; var1 < 4; ++var1) {
         var15 = this.tiles[var1];

         for(var3 = -25; var3 <= 0; ++var3) {
            var6 = u + var3;
            var7 = u - var3;
            if(var6 >= q || var7 < r) {
               for(var4 = -25; var4 <= 0; ++var4) {
                  var5 = v + var4;
                  var8 = v - var4;
                  if(var6 >= q) {
                     if(var5 >= s && (var19 = var15[var6][var5]) != null && var19.p) {
                        this.a(var19, false);
                     }

                     if(var8 < t && (var19 = var15[var6][var8]) != null && var19.p) {
                        this.a(var19, false);
                     }
                  }

                  if(var7 < r) {
                     if(var5 >= s && (var19 = var15[var7][var5]) != null && var19.p) {
                        this.a(var19, false);
                     }

                     if(var8 < t && (var19 = var15[var7][var8]) != null && var19.p) {
                        this.a(var19, false);
                     }
                  }

                  if(n == 0) {
                     I = false;
                     return;
                  }
               }
            }
         }
      }

      I = false;
   }

   private void a(SceneTile var1, boolean var2) {
      Q.insertBack(var1);

      while(true) {
         int var3;
         int var4;
         int plane;
         int var6;
         SceneTile[][] planeTiles;
         SceneTile var8;
         int var10;
         int var13;
         int var14;
         int var15;
         int var17;
         int var16;
         int var23;
         int var26;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              Wall var9;
                              GameObject var11;
                              boolean var21;
                              int var20;
                              SceneTile var34;
                              while(true) {
                                 do {
                                    if((var1 = (SceneTile)Q.popTail()) == null) {
                                       return;
                                    }
                                 } while(!var1.q);

                                 var3 = var1.positionX;
                                 var4 = var1.positionY;
                                 plane = var1.plane;
                                 var6 = var1.d;
                                 planeTiles = this.tiles[plane];
                                 if(!var1.p) {
                                    break;
                                 }

                                 if(var2) {
                                    if(plane > 0 && (var8 = this.tiles[plane - 1][var3][var4]) != null && var8.q || var3 <= u && var3 > q && (var8 = planeTiles[var3 - 1][var4]) != null && var8.q && (var8.p || (var1.attributes & 1) == 0) || var3 >= u && var3 < r - 1 && (var8 = planeTiles[var3 + 1][var4]) != null && var8.q && (var8.p || (var1.attributes & 4) == 0) || var4 <= v && var4 > s && (var8 = planeTiles[var3][var4 - 1]) != null && var8.q && (var8.p || (var1.attributes & 8) == 0) || var4 >= v && var4 < t - 1 && (var8 = planeTiles[var3][var4 + 1]) != null && var8.q && (var8.p || (var1.attributes & 2) == 0)) {
                                       continue;
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var1.p = false;
                                 if(var1.sceneTile != null) {
                                    var8 = var1.sceneTile;
                                    if(var1.sceneTile.simpleTile != null) {
                                       if(!this.n(0, var3, var4)) {
                                          this.drawPlainTile(var8.simpleTile, 0, z, A, B, C, var3, var4);
                                       }
                                    } else if(var8.shapedTile != null && !this.n(0, var3, var4)) {
                                       this.drawTexuredTile(var3, z, B, var8.shapedTile, A, var4, C);
                                    }

                                    var9 = var8.wall;
                                    if(var8.wall != null) {
                                       var9.primary.renderAtPoint(0, z, A, B, C, var9.x - w, var9.height - x, var9.y - y, var9.key);
                                    }

                                    for(var10 = 0; var10 < var8.objectCount; ++var10) {
                                       if((var11 = var8.gameObjects[var10]) != null) {
                                          var11.renderable.renderAtPoint(var11.yaw, z, A, B, C, var11.centreX - w, var11.renderHeight - x, var11.centreY - y, var11.key);
                                       }
                                    }
                                 }

                                 var21 = false;
                                 if(var1.simpleTile != null) {
                                    if(!this.n(var6, var3, var4)) {
                                       var21 = true;
                                       this.drawPlainTile(var1.simpleTile, var6, z, A, B, C, var3, var4);
                                    }
                                 } else if(var1.shapedTile != null && !this.n(var6, var3, var4)) {
                                    var21 = true;
                                    this.drawTexuredTile(var3, z, B, var1.shapedTile, A, var4, C);
                                 }

                                 var20 = 0;
                                 var10 = 0;
                                 Wall var22 = var1.wall;
                                 WallDecoration var12 = var1.wallDecoration;
                                 if(var22 != null || var12 != null) {
                                    if(u == var3) {
                                       ++var20;
                                    } else if(u < var3) {
                                       var20 += 2;
                                    }

                                    if(v == var4) {
                                       var20 += 3;
                                    } else if(v > var4) {
                                       var20 += 6;
                                    }

                                    var10 = R[var20];
                                    var1.v = T[var20];
                                 }

                                 if(var22 != null) {
                                    if((var22.faceUnknown & S[var20]) != 0) {
                                       if(var22.faceUnknown == 16) {
                                          var1.s = 3;
                                          var1.t = U[var20];
                                          var1.u = 3 - var1.t;
                                       } else if(var22.faceUnknown == 32) {
                                          var1.s = 6;
                                          var1.t = V[var20];
                                          var1.u = 6 - var1.t;
                                       } else if(var22.faceUnknown == 64) {
                                          var1.s = 12;
                                          var1.t = W[var20];
                                          var1.u = 12 - var1.t;
                                       } else {
                                          var1.s = 9;
                                          var1.t = X[var20];
                                          var1.u = 9 - var1.t;
                                       }
                                    } else {
                                       var1.s = 0;
                                    }

                                    if((var22.faceUnknown & var10) != 0 && !this.d(var6, var3, var4, var22.faceUnknown)) {
                                       var22.primary.renderAtPoint(0, z, A, B, C, var22.x - w, var22.height - x, var22.y - y, var22.key);
                                    }

                                    if((var22.face & var10) != 0 && !this.d(var6, var3, var4, var22.face)) {
                                       var22.secondary.renderAtPoint(0, z, A, B, C, var22.x - w, var22.height - x, var22.y - y, var22.key);
                                    }
                                 }

                                 if(var12 != null && !this.e(var6, var3, var4, var12.renderable.modelHeight)) {
                                    if((var12.faceUnknown & var10) != 0) {
                                       var12.renderable.renderAtPoint(var12.face, z, A, B, C, var12.x - w, var12.height - x, var12.y - y, var12.key);
                                    } else if((var12.faceUnknown & 768) != 0) {
                                       var13 = var12.x - w;
                                       var14 = var12.height - x;
                                       var15 = var12.y - y;
                                       var16 = var12.face;
                                       if(var12.face != 1 && var16 != 2) {
                                          var17 = var13;
                                       } else {
                                          var17 = -var13;
                                       }

                                       if(var16 != 2 && var16 != 3) {
                                          var20 = var15;
                                       } else {
                                          var20 = -var15;
                                       }

                                       if((var12.faceUnknown & 256) != 0 && var20 < var17) {
                                          var10 = var13 + E[var16];
                                          var26 = var15 + F[var16];
                                          var12.renderable.renderAtPoint((var16 << 9) + 256, z, A, B, C, var10, var14, var26, var12.key);
                                       }

                                       if((var12.faceUnknown & 512) != 0 && var20 > var17) {
                                          var10 = var13 + G[var16];
                                          var26 = var15 + H[var16];
                                          var12.renderable.renderAtPoint((var16 << 9) + 1280 & 2047, z, A, B, C, var10, var14, var26, var12.key);
                                       }
                                    }
                                 }

                                 if(var21) {
                                    GroundDecoration var27 = var1.groundDecoration;
                                    if(var1.groundDecoration != null) {
                                       var27.renderable.renderAtPoint(0, z, A, B, C, var27.x - w, var27.renderHeight - x, var27.y - y, var27.key);
                                    }

                                    GroundItem var32 = var1.groundItem;
                                    if(var1.groundItem != null && var32.h == 0) {
                                       if(var32.tertiary != null) {
                                          var32.tertiary.renderAtPoint(0, z, A, B, C, var32.b - w, var32.a - x, var32.c - y, var32.g);
                                       }

                                       if(var32.secondary != null) {
                                          var32.secondary.renderAtPoint(0, z, A, B, C, var32.b - w, var32.a - x, var32.c - y, var32.g);
                                       }

                                       if(var32.primary != null) {
                                          var32.primary.renderAtPoint(0, z, A, B, C, var32.b - w, var32.a - x, var32.c - y, var32.g);
                                       }
                                    }
                                 }

                                 var13 = var1.attributes;
                                 if(var1.attributes != 0) {
                                    if(var3 < u && (var13 & 4) != 0 && (var34 = planeTiles[var3 + 1][var4]) != null && var34.q) {
                                       Q.insertBack(var34);
                                    }

                                    if(var4 < v && (var13 & 2) != 0 && (var34 = planeTiles[var3][var4 + 1]) != null && var34.q) {
                                       Q.insertBack(var34);
                                    }

                                    if(var3 > u && (var13 & 1) != 0 && (var34 = planeTiles[var3 - 1][var4]) != null && var34.q) {
                                       Q.insertBack(var34);
                                    }

                                    if(var4 > v && (var13 & 8) != 0 && (var34 = planeTiles[var3][var4 - 1]) != null && var34.q) {
                                       Q.insertBack(var34);
                                    }
                                 }
                                 break;
                              }

                              if(var1.s != 0) {
                                 var21 = true;

                                 for(var20 = 0; var20 < var1.objectCount; ++var20) {
                                    if(var1.gameObjects[var20].l != p && (var1.objectAttributes[var20] & var1.s) == var1.t) {
                                       var21 = false;
                                       break;
                                    }
                                 }

                                 if(var21) {
                                    var9 = var1.wall;
                                    if(!this.d(var6, var3, var4, var9.faceUnknown)) {
                                       var9.primary.renderAtPoint(0, z, A, B, C, var9.x - w, var9.height - x, var9.y - y, var9.key);
                                    }

                                    var1.s = 0;
                                 }
                              }

                              if(!var1.r) {
                                 break;
                              }

                              try {
                                 int var24 = var1.objectCount;
                                 var1.r = false;
                                 var20 = 0;

                                 label603:
                                 for(var10 = 0; var10 < var24; ++var10) {
                                    if((var11 = var1.gameObjects[var10]).l != p) {
                                       for(var23 = var11.positionX; var23 <= var11.maxX; ++var23) {
                                          for(var13 = var11.positionY; var13 <= var11.maxY; ++var13) {
                                             if((var34 = planeTiles[var23][var13]).p) {
                                                var1.r = true;
                                                continue label603;
                                             }

                                             if(var34.s != 0) {
                                                var15 = 0;
                                                if(var23 > var11.positionX) {
                                                   ++var15;
                                                }

                                                if(var23 < var11.maxX) {
                                                   var15 += 4;
                                                }

                                                if(var13 > var11.positionY) {
                                                   var15 += 8;
                                                }

                                                if(var13 < var11.maxY) {
                                                   var15 += 2;
                                                }

                                                if((var15 & var34.s) == var1.u) {
                                                   var1.r = true;
                                                   continue label603;
                                                }
                                             }
                                          }
                                       }

                                       D[var20++] = var11;
                                       var23 = u - var11.positionX;
                                       if((var13 = var11.maxX - u) > var23) {
                                          var23 = var13;
                                       }

                                       var14 = v - var11.positionY;
                                       if((var15 = var11.maxY - v) > var14) {
                                          var11.k = var23 + var15;
                                       } else {
                                          var11.k = var23 + var14;
                                       }
                                    }
                                 }

                                 while(var20 > 0) {
                                    var10 = -50;
                                    var26 = -1;

                                    for(var23 = 0; var23 < var20; ++var23) {
                                       GameObject var29;
                                       if((var29 = D[var23]).l != p) {
                                          if(var29.k > var10) {
                                             var10 = var29.k;
                                             var26 = var23;
                                          } else if(var29.k == var10) {
                                             var14 = var29.centreX - w;
                                             var15 = var29.centreY - y;
                                             var16 = D[var26].centreX - w;
                                             var17 = D[var26].centreY - y;
                                             if(var14 * var14 + var15 * var15 > var16 * var16 + var17 * var17) {
                                                var26 = var23;
                                             }
                                          }
                                       }
                                    }

                                    if(var26 == -1) {
                                       break;
                                    }

                                    GameObject var28;
                                    boolean var10000;
                                    label723: {
                                       (var28 = D[var26]).l = p;
                                       var16 = var28.renderable.modelHeight;
                                       var15 = var28.maxY;
                                       var14 = var28.positionY;
                                       var13 = var28.maxX;
                                       var26 = var28.positionX;
                                       var10 = var6;
                                       SceneGraph var25 = this;
                                       int var18;
                                       if(var26 == var13 && var14 == var15) {
                                          if(this.n(var6, var26, var14)) {
                                             var17 = var26 << 7;
                                             var18 = var14 << 7;
                                             var10000 = o(var17 + 1, this.tileHeights[var6][var26][var14] - var16, var18 + 1) && o(var17 + 128 - 1, this.tileHeights[var6][var26 + 1][var14] - var16, var18 + 1) && o(var17 + 128 - 1, this.tileHeights[var6][var26 + 1][var14 + 1] - var16, var18 + 128 - 1) && o(var17 + 1, this.tileHeights[var6][var26][var14 + 1] - var16, var18 + 128 - 1);
                                             break label723;
                                          }
                                       } else {
                                          var17 = var26;

                                          label559:
                                          while(true) {
                                             if(var17 > var13) {
                                                var17 = (var26 << 7) + 1;
                                                var18 = (var14 << 7) + 2;
                                                var24 = var25.tileHeights[var10][var26][var14] - var16;
                                                if(o(var17, var24, var18) && o(var10 = (var13 << 7) - 1, var24, var18)) {
                                                   var26 = (var15 << 7) - 1;
                                                   if(o(var17, var24, var26) && o(var10, var24, var26)) {
                                                      var10000 = true;
                                                      break label723;
                                                   }
                                                }
                                                break;
                                             }

                                             for(var18 = var14; var18 <= var15; ++var18) {
                                                if(var25.m[var10][var17][var18] == -p) {
                                                   break label559;
                                                }
                                             }

                                             ++var17;
                                          }
                                       }

                                       var10000 = false;
                                    }

                                    if(!var10000) {
                                       var28.renderable.renderAtPoint(var28.yaw, z, A, B, C, var28.centreX - w, var28.renderHeight - x, var28.centreY - y, var28.key);
                                    }

                                    for(var13 = var28.positionX; var13 <= var28.maxX; ++var13) {
                                       for(var14 = var28.positionY; var14 <= var28.maxY; ++var14) {
                                          SceneTile var36;
                                          if((var36 = planeTiles[var13][var14]).s != 0) {
                                             Q.insertBack(var36);
                                          } else if((var13 != var3 || var14 != var4) && var36.q) {
                                             Q.insertBack(var36);
                                          }
                                       }
                                    }
                                 }

                                 if(!var1.r) {
                                    break;
                                 }
                              } catch (Exception var19) {
                                 var1.r = false;
                                 break;
                              }
                           }
                        } while(!var1.q);
                     } while(var1.s != 0);
                  } while(var3 <= u && var3 > q && (var8 = planeTiles[var3 - 1][var4]) != null && var8.q);
               } while(var3 >= u && var3 < r - 1 && (var8 = planeTiles[var3 + 1][var4]) != null && var8.q);
            } while(var4 <= v && var4 > s && (var8 = planeTiles[var3][var4 - 1]) != null && var8.q);
         } while(var4 >= v && var4 < t - 1 && (var8 = planeTiles[var3][var4 + 1]) != null && var8.q);

         var1.q = false;
         --n;
         GroundItem var33 = var1.groundItem;
         if(var1.groundItem != null && var33.h != 0) {
            if(var33.tertiary != null) {
               var33.tertiary.renderAtPoint(0, z, A, B, C, var33.b - w, var33.a - x - var33.h, var33.c - y, var33.g);
            }

            if(var33.secondary != null) {
               var33.secondary.renderAtPoint(0, z, A, B, C, var33.b - w, var33.a - x - var33.h, var33.c - y, var33.g);
            }

            if(var33.primary != null) {
               var33.primary.renderAtPoint(0, z, A, B, C, var33.b - w, var33.a - x - var33.h, var33.c - y, var33.g);
            }
         }

         if(var1.v != 0) {
            WallDecoration var31 = var1.wallDecoration;
            if(var1.wallDecoration != null && !this.e(var6, var3, var4, var31.renderable.modelHeight)) {
               if((var31.faceUnknown & var1.v) != 0) {
                  var31.renderable.renderAtPoint(var31.face, z, A, B, C, var31.x - w, var31.height - x, var31.y - y, var31.key);
               } else if((var31.faceUnknown & 768) != 0) {
                  var10 = var31.x - w;
                  var26 = var31.height - x;
                  var23 = var31.y - y;
                  var13 = var31.face;
                  if(var31.face != 1 && var13 != 2) {
                     var14 = var10;
                  } else {
                     var14 = -var10;
                  }

                  if(var13 != 2 && var13 != 3) {
                     var15 = var23;
                  } else {
                     var15 = -var23;
                  }

                  if((var31.faceUnknown & 256) != 0 && var15 >= var14) {
                     var16 = var10 + E[var13];
                     var17 = var23 + F[var13];
                     var31.renderable.renderAtPoint((var13 << 9) + 256, z, A, B, C, var16, var26, var17, var31.key);
                  }

                  if((var31.faceUnknown & 512) != 0 && var15 <= var14) {
                     var16 = var10 + G[var13];
                     var17 = var23 + H[var13];
                     var31.renderable.renderAtPoint((var13 << 9) + 1280 & 2047, z, A, B, C, var16, var26, var17, var31.key);
                  }
               }
            }

            Wall var30 = var1.wall;
            if(var1.wall != null) {
               if((var30.face & var1.v) != 0 && !this.d(var6, var3, var4, var30.face)) {
                  var30.secondary.renderAtPoint(0, z, A, B, C, var30.x - w, var30.height - x, var30.y - y, var30.key);
               }

               if((var30.faceUnknown & var1.v) != 0 && !this.d(var6, var3, var4, var30.faceUnknown)) {
                  var30.primary.renderAtPoint(0, z, A, B, C, var30.x - w, var30.height - x, var30.y - y, var30.key);
               }
            }
         }

         SceneTile var35;
         if(plane < 3 && (var35 = this.tiles[plane + 1][var3][var4]) != null && var35.q) {
            Q.insertBack(var35);
         }

         if(var3 < u && (var35 = planeTiles[var3 + 1][var4]) != null && var35.q) {
            Q.insertBack(var35);
         }

         if(var4 < v && (var35 = planeTiles[var3][var4 + 1]) != null && var35.q) {
            Q.insertBack(var35);
         }

         if(var3 > u && (var35 = planeTiles[var3 - 1][var4]) != null && var35.q) {
            Q.insertBack(var35);
         }

         if(var4 > v && (var35 = planeTiles[var3][var4 - 1]) != null && var35.q) {
            Q.insertBack(var35);
         }
      }
   }

   private void drawPlainTile(SimpleTile var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - w;
      int var11;
      int var12 = var11 = (var8 << 7) - y;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.tileHeights[var2][var7][var8] - x;
      int var18 = this.tileHeights[var2][var7 + 1][var8] - x;
      int var19 = this.tileHeights[var2][var7 + 1][var8 + 1] - x;
      var2 = this.tileHeights[var2][var7][var8 + 1] - x;
      int var20 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var20;
      var20 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var20;
      if(var12 >= 50) {
         var20 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var20;
         var20 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var20;
         if(var11 >= 50) {
            var20 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var20;
            var20 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var20;
            if(var16 >= 50) {
               var20 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var20;
               var20 = var2 * var4 - var15 * var3 >> 16;
               var15 = var2 * var3 + var15 * var4 >> 16;
               var2 = var20;
               if(var15 >= 50) {
                  var3 = Rasterizer3D.e + (var10 << Client.d) / var12;
                  var4 = Rasterizer3D.f + (var17 << Client.d) / var12;
                  var5 = Rasterizer3D.e + (var14 << Client.d) / var11;
                  var6 = Rasterizer3D.f + (var18 << Client.d) / var11;
                  var20 = Rasterizer3D.e + (var13 << Client.d) / var16;
                  int var21 = Rasterizer3D.f + (var19 << Client.d) / var16;
                  int var22 = Rasterizer3D.e + (var9 << Client.d) / var15;
                  int var23 = Rasterizer3D.f + (var2 << Client.d) / var15;
                  Rasterizer3D.d = 0;
                  if((var20 - var22) * (var6 - var23) - (var21 - var23) * (var5 - var22) > 0) {
                     Rasterizer3D.b = var20 < 0 || var22 < 0 || var5 < 0 || var20 > Rasterizer2D.o || var22 > Rasterizer2D.o || var5 > Rasterizer2D.o;
                     if(I && b(J, K, var21, var23, var6, var20, var22, var5)) {
                        b = var7;
                        c = var8;
                     }

                     if(var1.texture == -1) {
                        if(var1.c != 12345678) {
                           Rasterizer3D.drawShadedTriangle(var21, var23, var6, var20, var22, var5, var1.c, var1.d, var1.b);
                        }
                     } else if(!lowMemory) {
                        if(var1.flat) {
                           Rasterizer3D.drawTexturedTriangle(var21, var23, var6, var20, var22, var5, var1.c, var1.d, var1.b, var10, var14, var9, var17, var18, var2, var12, var11, var15, var1.texture);
                        } else {
                           Rasterizer3D.drawTexturedTriangle(var21, var23, var6, var20, var22, var5, var1.c, var1.d, var1.b, var13, var9, var14, var19, var2, var18, var16, var15, var11, var1.texture);
                        }
                     } else {
                        var13 = Y[var1.texture];
                        Rasterizer3D.drawShadedTriangle(var21, var23, var6, var20, var22, var5, c(var13, var1.c), c(var13, var1.d), c(var13, var1.b));
                     }
                  }

                  if((var3 - var5) * (var23 - var6) - (var4 - var6) * (var22 - var5) > 0) {
                     Rasterizer3D.b = var3 < 0 || var5 < 0 || var22 < 0 || var3 > Rasterizer2D.o || var5 > Rasterizer2D.o || var22 > Rasterizer2D.o;
                     if(I && b(J, K, var4, var6, var23, var3, var5, var22)) {
                        b = var7;
                        c = var8;
                     }

                     if(var1.texture == -1) {
                        if(var1.a != 12345678) {
                           Rasterizer3D.drawShadedTriangle(var4, var6, var23, var3, var5, var22, var1.a, var1.b, var1.d);
                           return;
                        }
                     } else {
                        if(!lowMemory) {
                           Rasterizer3D.drawTexturedTriangle(var4, var6, var23, var3, var5, var22, var1.a, var1.b, var1.d, var10, var14, var9, var17, var18, var2, var12, var11, var15, var1.texture);
                           return;
                        }

                        var13 = Y[var1.texture];
                        Rasterizer3D.drawShadedTriangle(var4, var6, var23, var3, var5, var22, c(var13, var1.a), c(var13, var1.b), c(var13, var1.d));
                     }
                  }

               }
            }
         }
      }
   }

   private void drawTexuredTile(int var1, int var2, int var3, ShapedTile var4, int var5, int var6, int var7) {
      int var8 = var4.a.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var4.a[var9] - w;
         var11 = var4.b[var9] - x;
         var13 = (var12 = var4.c[var9] - y) * var3 + var10 * var7 >> 16;
         var12 = var12 * var7 - var10 * var3 >> 16;
         var10 = var13;
         var13 = var11 * var5 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var5 >> 16;
         if(var12 < 50) {
            return;
         }

         if(var4.j != null) {
            ShapedTile.r[var9] = var10;
            ShapedTile.s[var9] = var13;
            ShapedTile.t[var9] = var12;
         }

         ShapedTile.p[var9] = Rasterizer3D.e + (var10 << Client.d) / var12;
         ShapedTile.q[var9] = Rasterizer3D.f + (var13 << Client.d) / var12;
      }

      Rasterizer3D.d = 0;
      var8 = var4.g.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var4.g[var9];
         var11 = var4.h[var9];
         var12 = var4.i[var9];
         var13 = ShapedTile.p[var10];
         var2 = ShapedTile.p[var11];
         var3 = ShapedTile.p[var12];
         var5 = ShapedTile.q[var10];
         var7 = ShapedTile.q[var11];
         int var14 = ShapedTile.q[var12];
         if((var13 - var2) * (var14 - var7) - (var5 - var7) * (var3 - var2) > 0) {
            Rasterizer3D.b = var13 < 0 || var2 < 0 || var3 < 0 || var13 > Rasterizer2D.o || var2 > Rasterizer2D.o || var3 > Rasterizer2D.o;
            if(I && b(J, K, var5, var7, var14, var13, var2, var3)) {
               b = var1;
               c = var6;
            }

            if(var4.j != null && var4.j[var9] != -1) {
               if(!lowMemory) {
                  if(var4.flat) {
                     Rasterizer3D.drawTexturedTriangle(var5, var7, var14, var13, var2, var3, var4.d[var9], var4.e[var9], var4.f[var9], ShapedTile.r[0], ShapedTile.r[1], ShapedTile.r[3], ShapedTile.s[0], ShapedTile.s[1], ShapedTile.s[3], ShapedTile.t[0], ShapedTile.t[1], ShapedTile.t[3], var4.j[var9]);
                  } else {
                     Rasterizer3D.drawTexturedTriangle(var5, var7, var14, var13, var2, var3, var4.d[var9], var4.e[var9], var4.f[var9], ShapedTile.r[var10], ShapedTile.r[var11], ShapedTile.r[var12], ShapedTile.s[var10], ShapedTile.s[var11], ShapedTile.s[var12], ShapedTile.t[var10], ShapedTile.t[var11], ShapedTile.t[var12], var4.j[var9]);
                  }
               } else {
                  var10 = Y[var4.j[var9]];
                  Rasterizer3D.drawShadedTriangle(var5, var7, var14, var13, var2, var3, c(var10, var4.d[var9]), c(var10, var4.e[var9]), c(var10, var4.f[var9]));
               }
            } else if(var4.d[var9] != 12345678) {
               Rasterizer3D.drawShadedTriangle(var5, var7, var14, var13, var2, var3, var4.d[var9], var4.e[var9], var4.f[var9]);
            }
         }
      }

   }

   private static int c(int var0, int var1) {
      if((var1 = (var1 = 127 - var1) * (var0 & 127) / 160) < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   private static boolean b(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if(var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if(var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if(var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         var2 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         var0 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         return var8 * var0 > 0 && var0 * var2 > 0;
      }
   }

   private boolean n(int var1, int var2, int var3) {
      int var4;
      if((var4 = this.m[var1][var2][var3]) == -p) {
         return false;
      } else if(var4 == p) {
         return true;
      } else {
         var4 = var2 << 7;
         int var5 = var3 << 7;
         if(o(var4 + 1, this.tileHeights[var1][var2][var3], var5 + 1) && o(var4 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var5 + 1) && o(var4 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var5 + 128 - 1) && o(var4 + 1, this.tileHeights[var1][var2][var3 + 1], var5 + 128 - 1)) {
            this.m[var1][var2][var3] = p;
            return true;
         } else {
            this.m[var1][var2][var3] = -p;
            return false;
         }
      }
   }

   private boolean d(int var1, int var2, int var3, int var4) {
      if(!this.n(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         var3 = (var2 = this.tileHeights[var1][var2][var3] - 1) - 120;
         int var7 = var2 - 230;
         int var8 = var2 - 238;
         if(var4 < 16) {
            if(var4 == 1) {
               if(var5 > w) {
                  if(!o(var5, var2, var6)) {
                     return false;
                  }

                  if(!o(var5, var2, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!o(var5, var3, var6)) {
                     return false;
                  }

                  if(!o(var5, var3, var6 + 128)) {
                     return false;
                  }
               }

               if(o(var5, var7, var6) && o(var5, var7, var6 + 128)) {
                  return true;
               }

               return false;
            }

            if(var4 == 2) {
               if(var6 < y) {
                  if(!o(var5, var2, var6 + 128)) {
                     return false;
                  }

                  if(!o(var5 + 128, var2, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!o(var5, var3, var6 + 128)) {
                     return false;
                  }

                  if(!o(var5 + 128, var3, var6 + 128)) {
                     return false;
                  }
               }

               if(o(var5, var7, var6 + 128) && o(var5 + 128, var7, var6 + 128)) {
                  return true;
               }

               return false;
            }

            if(var4 == 4) {
               if(var5 < w) {
                  if(!o(var5 + 128, var2, var6)) {
                     return false;
                  }

                  if(!o(var5 + 128, var2, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!o(var5 + 128, var3, var6)) {
                     return false;
                  }

                  if(!o(var5 + 128, var3, var6 + 128)) {
                     return false;
                  }
               }

               if(o(var5 + 128, var7, var6) && o(var5 + 128, var7, var6 + 128)) {
                  return true;
               }

               return false;
            }

            if(var4 == 8) {
               if(var6 > y) {
                  if(!o(var5, var2, var6)) {
                     return false;
                  }

                  if(!o(var5 + 128, var2, var6)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!o(var5, var3, var6)) {
                     return false;
                  }

                  if(!o(var5 + 128, var3, var6)) {
                     return false;
                  }
               }

               if(o(var5, var7, var6) && o(var5 + 128, var7, var6)) {
                  return true;
               }

               return false;
            }
         }

         if(!o(var5 + 64, var8, var6 + 64)) {
            return false;
         } else if(var4 == 16) {
            return o(var5, var7, var6 + 128);
         } else if(var4 == 32) {
            return o(var5 + 128, var7, var6 + 128);
         } else if(var4 == 64) {
            return o(var5 + 128, var7, var6);
         } else if(var4 == 128) {
            return o(var5, var7, var6);
         } else {
            System.out.println("Warning unsupported wall type");
            return true;
         }
      }
   }

   private boolean e(int var1, int var2, int var3, int var4) {
      if(!this.n(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return o(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && o(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && o(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && o(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   private static boolean o(int var0, int var1, int var2) {
      for(int var3 = 0; var3 < O; ++var3) {
         Class77 var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         if((var4 = P[var3]).l == 1) {
            if((var5 = var4.f - var0) > 0) {
               var6 = var4.h + (var4.o * var5 >> 8);
               var7 = var4.i + (var4.p * var5 >> 8);
               var8 = var4.j + (var4.q * var5 >> 8);
               var9 = var4.k + (var4.r * var5 >> 8);
               if(var2 >= var6 && var2 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if(var4.l == 2) {
            if((var5 = var0 - var4.f) > 0) {
               var6 = var4.h + (var4.o * var5 >> 8);
               var7 = var4.i + (var4.p * var5 >> 8);
               var8 = var4.j + (var4.q * var5 >> 8);
               var9 = var4.k + (var4.r * var5 >> 8);
               if(var2 >= var6 && var2 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if(var4.l == 3) {
            if((var5 = var4.h - var2) > 0) {
               var6 = var4.f + (var4.m * var5 >> 8);
               var7 = var4.g + (var4.n * var5 >> 8);
               var8 = var4.j + (var4.q * var5 >> 8);
               var9 = var4.k + (var4.r * var5 >> 8);
               if(var0 >= var6 && var0 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if(var4.l == 4) {
            if((var5 = var2 - var4.h) > 0) {
               var6 = var4.f + (var4.m * var5 >> 8);
               var7 = var4.g + (var4.n * var5 >> 8);
               var8 = var4.j + (var4.q * var5 >> 8);
               var9 = var4.k + (var4.r * var5 >> 8);
               if(var0 >= var6 && var0 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if(var4.l == 5 && (var5 = var1 - var4.j) > 0) {
            var6 = var4.f + (var4.m * var5 >> 8);
            var7 = var4.g + (var4.n * var5 >> 8);
            var8 = var4.h + (var4.o * var5 >> 8);
            var9 = var4.i + (var4.p * var5 >> 8);
            if(var0 >= var6 && var0 <= var7 && var2 >= var8 && var2 <= var9) {
               return true;
            }
         }
      }

      return false;
   }
}
