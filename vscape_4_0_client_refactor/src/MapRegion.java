final class MapRegion {
   private final int[] hues;
   private final int[] saturations;
   private final int[] luminances;
   private final int[] chromas;
   private final int[] h;
   private final int[][][] tileHeights;
   private final byte[][][] overlays;
   static int currentPlane;
   private final byte[][][] shading;
   private final int[][][] l;
   private final byte[][][] overlayTypes;
   private static final int[] COSINE_VERTICES = new int[]{1, 0, -1, 0};
   private final int[][] o;
   private static final int[] p = new int[]{16, 32, 64, 128};
   private final byte[][][] underlays;
   private static final int[] SINE_VERTICES = new int[]{0, -1, 0, 1};
   static int maximumPlane = 99;
   private final int width;
   private final int length;
   private final byte[][][] overlayOrientations;
   private final byte[][][] tileFlags;
   static boolean lowMemory = true;
   private static final int[] anIntArray = new int[]{1, 2, 4, 8};

   public MapRegion(byte[][][] flags, int[][][] tileHeights) {
      maximumPlane = 99;
      this.width = 104;
      this.length = 104;
      this.tileHeights = tileHeights;
      this.tileFlags = flags;
      this.underlays = new byte[4][104][104];
      this.overlays = new byte[4][104][104];
      this.overlayTypes = new byte[4][104][104];
      this.overlayOrientations = new byte[4][104][104];
      this.l = new int[4][105][105];
      this.shading = new byte[4][105][105];
      this.o = new int[105][105];
      this.hues = new int[104];
      this.saturations = new int[104];
      this.luminances = new int[104];
      this.chromas = new int[104];
      this.h = new int[104];
   }

   private static int perlinNoise(int x, int y) {
      return ((x ^= (x += y * 57) << 13) * (x * x * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) >> 19 & 255;
   }

   public final void a(CollisionMap[] maps, SceneGraph scene) {
      try {
         int z;
         int x;
         int y;
         int plane;
         for(z = 0; z < 4; ++z) {
            for(x = 0; x < 104; ++x) {
               for(y = 0; y < 104; ++y) {
                  if((this.tileFlags[z][x][y] & 1) == 1) {
                     plane = z;
                     if((this.tileFlags[1][x][y] & 2) == 2) {
                        plane = z - 1;
                     }

                     if(plane >= 0) {
                        maps[plane].block(y, x);
                     }
                  }
               }
            }
         }

         int id;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var27;
         for(z = 0; z < 4; ++z) {
            byte[][] var29 = this.shading[z];
            id = (int)Math.sqrt(5100.0D);
            var8 = id * 768 >> 8;

            for(var9 = 1; var9 < 103; ++var9) {
               for(var10 = 1; var10 < 103; ++var10) {
                  var11 = this.tileHeights[z][var10 + 1][var9] - this.tileHeights[z][var10 - 1][var9];
                  id = this.tileHeights[z][var10][var9 + 1] - this.tileHeights[z][var10][var9 - 1];
                  var12 = (int)Math.sqrt((double)(var11 * var11 + 65536 + id * id));
                  var13 = (var11 << 8) / var12;
                  var14 = 65536 / var12;
                  var15 = (id << 8) / var12;
                  var27 = 96 + (var13 * -50 + var14 * -10 + var15 * -50) / var8;
                  y = (var29[var10 - 1][var9] >> 2) + (var29[var10 + 1][var9] >> 3) + (var29[var10][var9 - 1] >> 2) + (var29[var10][var9 + 1] >> 3) + (var29[var10][var9] >> 1);
                  this.o[var10][var9] = var27 - y;
               }
            }

            for(var9 = 0; var9 < 104; ++var9) {
               this.hues[var9] = 0;
               this.saturations[var9] = 0;
               this.luminances[var9] = 0;
               this.chromas[var9] = 0;
               this.h[var9] = 0;
            }

            for(var9 = -5; var9 < 109; ++var9) {
               for(var10 = 0; var10 < 104; ++var10) {
                  if((var11 = var9 + 5) >= 0 && var11 < 104 && (id = this.underlays[z][var11][var10] & 255) > 0) {
                     Floor floor = Floor.floors[id - 1];
                     this.hues[var10] += floor.weightedHue;
                     this.saturations[var10] += floor.saturation;
                     this.luminances[var10] += floor.luminance;
                     this.chromas[var10] += floor.chroma;
                     ++this.h[var10];
                  }

                  if((id = var9 - 5) >= 0 && id < 104 && (var12 = this.underlays[z][id][var10] & 255) > 0) {
                     Floor var32 = Floor.floors[var12 - 1];
                     this.hues[var10] -= var32.weightedHue;
                     this.saturations[var10] -= var32.saturation;
                     this.luminances[var10] -= var32.luminance;
                     this.chromas[var10] -= var32.chroma;
                     --this.h[var10];
                  }
               }

               if(var9 > 0 && var9 < 103) {
                  var10 = 0;
                  var11 = 0;
                  id = 0;
                  var12 = 0;
                  var13 = 0;

                  for(var14 = -5; var14 < 109; ++var14) {
                     if((var15 = var14 + 5) >= 0 && var15 < 104) {
                        var10 += this.hues[var15];
                        var11 += this.saturations[var15];
                        id += this.luminances[var15];
                        var12 += this.chromas[var15];
                        var13 += this.h[var15];
                     }

                     if((var27 = var14 - 5) >= 0 && var27 < 104) {
                        var10 -= this.hues[var27];
                        var11 -= this.saturations[var27];
                        id -= this.luminances[var27];
                        var12 -= this.chromas[var27];
                        var13 -= this.h[var27];
                     }

                     if(var14 > 0 && var14 < 103 && (!lowMemory || (this.tileFlags[0][var9][var14] & 2) != 0 || (this.tileFlags[z][var9][var14] & 16) == 0 && this.getCollisionPlane(var14, z, var9) == currentPlane)) {
                        if(z < maximumPlane) {
                           maximumPlane = z;
                        }

                        y = this.underlays[z][var9][var14] & 255;
                        var27 = this.overlays[z][var9][var14] & 255;
                        if(y > 0 || var27 > 0) {
                           x = this.tileHeights[z][var9][var14];
                           plane = this.tileHeights[z][var9 + 1][var14];
                           var16 = this.tileHeights[z][var9 + 1][var14 + 1];
                           var8 = this.tileHeights[z][var9][var14 + 1];
                           var15 = this.o[var9][var14];
                           int var17 = this.o[var9 + 1][var14];
                           int var18 = this.o[var9 + 1][var14 + 1];
                           int var19 = this.o[var9][var14 + 1];
                           int var20 = -1;
                           int var21 = -1;
                           int var22;
                           if(y > 0) {
                              var22 = (var10 << 8) / var12;
                              var21 = var11 / var13;
                              int var23 = id / var13;
                              var20 = encode(var22, var21, var23);
                              var21 = encode(var22, var21, var23);
                           }

                           if(z > 0) {
                              boolean var33 = true;
                              if(y == 0 && this.overlayTypes[z][var9][var14] != 0) {
                                 var33 = false;
                              }

                              if(var27 > 0 && !Floor.floors[var27 - 1].shadowing) {
                                 var33 = false;
                              }

                              if(var33 && x == plane && x == var16 && x == var8) {
                                 this.l[z][var9][var14] |= 2340;
                              }
                           }

                           var22 = 0;
                           if(var20 != -1) {
                              var22 = Rasterizer3D.rgbTable[light(var21, 96)];
                           }

                           if(var27 == 0) {
                              scene.a(z, var9, var14, 0, 0, -1, x, plane, var16, var8, light(var20, var15), light(var20, var17), light(var20, var18), light(var20, var19), 0, 0, 0, 0, var22, 0);
                           } else {
                              var21 = this.overlayTypes[z][var9][var14] + 1;
                              byte var34 = this.overlayOrientations[z][var9][var14];
                              Floor var30 = Floor.floors[var27 - 1];
                              if(var27 - 1 != 54) {
                                 int var24 = var30.texture;
                                 int var25;
                                 if(var30.texture >= 0) {
                                    y = Rasterizer3D.a(var24);
                                    var25 = -1;
                                 } else if(var30.rgb == 16711935) {
                                    y = 0;
                                    var25 = -2;
                                    var24 = -1;
                                 } else if(var30.rgb == 3355443) {
                                    y = Rasterizer3D.rgbTable[checkedLight(var30.color, 96)];
                                    var25 = -2;
                                    var24 = -1;
                                 } else {
                                    var25 = encode(var30.hue, var30.saturation, var30.luminance);
                                    y = Rasterizer3D.rgbTable[checkedLight(var30.color, 96)];
                                 }

                                 if(var27 - 1 == 111) {
                                    y = Rasterizer3D.a(1);
                                    var25 = -1;
                                    var24 = 1;
                                 } else if(var25 == 6363) {
                                    y = 4733729;
                                    var25 = encode(25, 146, 24);
                                 }

                                 scene.a(z, var9, var14, var21, var34, var24, x, plane, var16, var8, light(var20, var15), light(var20, var17), light(var20, var18), light(var20, var19), checkedLight(var25, var15), checkedLight(var25, var17), checkedLight(var25, var18), checkedLight(var25, var19), var22, y);
                              }
                           }
                        }
                     }
                  }
               }
            }

            for(var9 = 1; var9 < 103; ++var9) {
               for(var10 = 1; var10 < 103; ++var10) {
                  scene.setCollisionPlane(z, var10, var9, this.getCollisionPlane(var9, z, var10));
               }
            }
         }

         scene.m(-10, -50, -50);

         for(z = 0; z < 104; ++z) {
            for(x = 0; x < 104; ++x) {
               if((this.tileFlags[1][z][x] & 2) == 2) {
                  scene.a(x, z);
               }
            }
         }

         z = 1;
         x = 2;
         y = 4;

         for(plane = 0; plane < 4; ++plane) {
            if(plane > 0) {
               z <<= 3;
               x <<= 3;
               y <<= 3;
            }

            for(var27 = 0; var27 <= plane; ++var27) {
               for(int var28 = 0; var28 <= 104; ++var28) {
                  for(var16 = 0; var16 <= 104; ++var16) {
                     if((this.l[var27][var16][var28] & z) != 0) {
                        id = var28;
                        var8 = var28;
                        var9 = var27;

                        for(var10 = var27; id > 0 && (this.l[var27][var16][id - 1] & z) != 0; --id) {
                           ;
                        }

                        while(var8 < 104 && (this.l[var27][var16][var8 + 1] & z) != 0) {
                           ++var8;
                        }

                        label310:
                        while(var9 > 0) {
                           for(var11 = id; var11 <= var8; ++var11) {
                              if((this.l[var9 - 1][var16][var11] & z) == 0) {
                                 break label310;
                              }
                           }

                           --var9;
                        }

                        label299:
                        while(var10 < plane) {
                           for(var11 = id; var11 <= var8; ++var11) {
                              if((this.l[var10 + 1][var16][var11] & z) == 0) {
                                 break label299;
                              }
                           }

                           ++var10;
                        }

                        if((var10 + 1 - var9) * (var8 - id + 1) >= 8) {
                           var12 = this.tileHeights[var10][var16][id] - 240;
                           var13 = this.tileHeights[var9][var16][id];
                           SceneGraph.a(plane, var16 << 7, var13, var16 << 7, (var8 << 7) + 128, var12, id << 7, 1);

                           for(var14 = var9; var14 <= var10; ++var14) {
                              for(var15 = id; var15 <= var8; ++var15) {
                                 this.l[var14][var16][var15] &= ~z;
                              }
                           }
                        }
                     }

                     if((this.l[var27][var16][var28] & x) != 0) {
                        id = var16;
                        var8 = var16;
                        var9 = var27;

                        for(var10 = var27; id > 0 && (this.l[var27][id - 1][var28] & x) != 0; --id) {
                           ;
                        }

                        while(var8 < 104 && (this.l[var27][var8 + 1][var28] & x) != 0) {
                           ++var8;
                        }

                        label363:
                        while(var9 > 0) {
                           for(var11 = id; var11 <= var8; ++var11) {
                              if((this.l[var9 - 1][var11][var28] & x) == 0) {
                                 break label363;
                              }
                           }

                           --var9;
                        }

                        label352:
                        while(var10 < plane) {
                           for(var11 = id; var11 <= var8; ++var11) {
                              if((this.l[var10 + 1][var11][var28] & x) == 0) {
                                 break label352;
                              }
                           }

                           ++var10;
                        }

                        if((var10 + 1 - var9) * (var8 - id + 1) >= 8) {
                           var12 = this.tileHeights[var10][id][var28] - 240;
                           var13 = this.tileHeights[var9][id][var28];
                           SceneGraph.a(plane, id << 7, var13, (var8 << 7) + 128, var28 << 7, var12, var28 << 7, 2);

                           for(var14 = var9; var14 <= var10; ++var14) {
                              for(var15 = id; var15 <= var8; ++var15) {
                                 this.l[var14][var15][var28] &= ~x;
                              }
                           }
                        }
                     }

                     if((this.l[var27][var16][var28] & y) != 0) {
                        id = var16;
                        var8 = var16;
                        var9 = var28;

                        for(var10 = var28; var9 > 0 && (this.l[var27][var16][var9 - 1] & y) != 0; --var9) {
                           ;
                        }

                        while(var10 < 104 && (this.l[var27][var16][var10 + 1] & y) != 0) {
                           ++var10;
                        }

                        label416:
                        while(id > 0) {
                           for(var11 = var9; var11 <= var10; ++var11) {
                              if((this.l[var27][id - 1][var11] & y) == 0) {
                                 break label416;
                              }
                           }

                           --id;
                        }

                        label405:
                        while(var8 < 104) {
                           for(var11 = var9; var11 <= var10; ++var11) {
                              if((this.l[var27][var8 + 1][var11] & y) == 0) {
                                 break label405;
                              }
                           }

                           ++var8;
                        }

                        if((var8 - id + 1) * (var10 - var9 + 1) >= 4) {
                           var11 = this.tileHeights[var27][id][var9];
                           SceneGraph.a(plane, id << 7, var11, (var8 << 7) + 128, (var10 << 7) + 128, var11, var9 << 7, 4);

                           for(id = id; id <= var8; ++id) {
                              for(var12 = var9; var12 <= var10; ++var12) {
                                 this.l[var27][id][var12] &= ~y;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (Exception var26) {
         ;
      }
   }

   public static void decode(Buffer buffer, ResourceProvider provider) {
      int id = -1;

      int offset;
      while((offset = buffer.c()) != 0) {
         ObjectDefinition var10000 = ObjectDefinition.byId(id += offset);
         ResourceProvider var4 = provider;
         ObjectDefinition var6 = var10000;
         if(var10000.modelIds != null) {
            for(int var5 = 0; var5 < var6.modelIds.length; ++var5) {
               var4.b(var6.modelIds[var5] & '\uffff', 0);
            }
         }

         while(buffer.s() != 0) {
            buffer.readUByte();
         }
      }

   }

   public final void a(int topLeftRegionY, int dy, int dx, int topLeftRegionX) {
      for(int y = topLeftRegionY; y <= topLeftRegionY + dy; ++y) {
         for(int x = topLeftRegionX; x <= topLeftRegionX + dx; ++x) {
            if(x >= 0 && x < 104 && y >= 0 && y < 104) {
               this.shading[0][x][y] = 127;
               if(x == topLeftRegionX && x > 0) {
                  this.tileHeights[0][x][y] = this.tileHeights[0][x - 1][y];
               }

               if(x == topLeftRegionX + dx && x < 103) {
                  this.tileHeights[0][x][y] = this.tileHeights[0][x + 1][y];
               }

               if(y == topLeftRegionY && y > 0) {
                  this.tileHeights[0][x][y] = this.tileHeights[0][x][y - 1];
               }

               if(y == topLeftRegionY + dy && y < 103) {
                  this.tileHeights[0][x][y] = this.tileHeights[0][x][y + 1];
               }
            }
         }
      }

   }

   private void placeObject(int y, SceneGraph scene, CollisionMap map, int type, int z, int x, int id, int orientation) {
      if(lowMemory && (this.tileFlags[0][x][y] & 2) == 0) {
         if((this.tileFlags[z][x][y] & 16) != 0) {
            return;
         }

         if(this.getCollisionPlane(y, z, x) != currentPlane) {
            return;
         }
      }

      if(z < maximumPlane) {
         maximumPlane = z;
      }

      int centre = this.tileHeights[z][x][y];
      int east = this.tileHeights[z][x + 1][y];
      int northEast = this.tileHeights[z][x + 1][y + 1];
      int north = this.tileHeights[z][x][y + 1];
      int mean = centre + east + northEast + north >> 2;
      ObjectDefinition definition = ObjectDefinition.byId(id);
      int key = x + (y << 7) + (id << 14) + 0x40000000;
      if(!definition.interactive) {
         key += Integer.MIN_VALUE;
      }

      byte config = (byte)((orientation << 6) + type);
      Object object;
      if(type == 22) {
         if(!lowMemory || definition.interactive || definition.obstructsGround) {
            if(definition.animation == -1 && definition.morphisms == null) {
               object = definition.modelAt(22, orientation, centre, east, northEast, north, -1);
            } else {
               object = new RenderableObject(id, orientation, 22, east, northEast, centre, north, definition.animation, true);
            }

            scene.addFloorDecoration(z, mean, y, (Renderable)object, config, key, x);
            if(definition.solid && definition.interactive && map != null) {
               map.block(y, x);
            }

         }
      } else {
         int existing;
         if(type != 10 && type != 11) {
            if(type >= 12) {
               if(definition.animation == -1 && definition.morphisms == null) {
                  object = definition.modelAt(type, orientation, centre, east, northEast, north, -1);
               } else {
                  object = new RenderableObject(id, orientation, type, east, northEast, centre, north, definition.animation, true);
               }

               scene.addObject(key, config, mean, 1, (Renderable)object, 1, z, 0, y, x);
               if(type >= 12 && type <= 17 && type != 13 && z > 0) {
                  this.l[z][x][y] |= 2340;
               }

               if(definition.solid && map != null) {
                  map.flagObject(definition.impenetrable, definition.width, definition.length, x, y, orientation);
               }

            } else if(type == 0) {
               if(definition.animation == -1 && definition.morphisms == null) {
                  object = definition.modelAt(0, orientation, centre, east, northEast, north, -1);
               } else {
                  object = new RenderableObject(id, orientation, 0, east, northEast, centre, north, definition.animation, true);
               }

               scene.addWall(anIntArray[orientation], (Renderable)object, key, y, config, x, (Renderable)null, mean, 0, z);
               if(orientation == 0) {
                  if(definition.castsShadow) {
                     this.shading[z][x][y] = 50;
                     this.shading[z][x][y + 1] = 50;
                  }

                  if(definition.occludes) {
                     this.l[z][x][y] |= 585;
                  }
               } else if(orientation == 1) {
                  if(definition.castsShadow) {
                     this.shading[z][x][y + 1] = 50;
                     this.shading[z][x + 1][y + 1] = 50;
                  }

                  if(definition.occludes) {
                     this.l[z][x][y + 1] |= 1170;
                  }
               } else if(orientation == 2) {
                  if(definition.castsShadow) {
                     this.shading[z][x + 1][y] = 50;
                     this.shading[z][x + 1][y + 1] = 50;
                  }

                  if(definition.occludes) {
                     this.l[z][x + 1][y] |= 585;
                  }
               } else if(orientation == 3) {
                  if(definition.castsShadow) {
                     this.shading[z][x][y] = 50;
                     this.shading[z][x + 1][y] = 50;
                  }

                  if(definition.occludes) {
                     this.l[z][x][y] |= 1170;
                  }
               }

               if(definition.solid && map != null) {
                  map.flagObject(y, orientation, x, type, definition.impenetrable);
               }

               if(definition.decorDisplacement != 16) {
                  scene.displaceWallDecor(y, definition.decorDisplacement, x, z);
               }

            } else if(type == 1) {
               if(definition.animation == -1 && definition.morphisms == null) {
                  object = definition.modelAt(1, orientation, centre, east, northEast, north, -1);
               } else {
                  object = new RenderableObject(id, orientation, 1, east, northEast, centre, north, definition.animation, true);
               }

               scene.addWall(p[orientation], (Renderable)object, key, y, config, x, (Renderable)null, mean, 0, z);
               if(definition.castsShadow) {
                  if(orientation == 0) {
                     this.shading[z][x][y + 1] = 50;
                  } else if(orientation == 1) {
                     this.shading[z][x + 1][y + 1] = 50;
                  } else if(orientation == 2) {
                     this.shading[z][x + 1][y] = 50;
                  } else if(orientation == 3) {
                     this.shading[z][x][y] = 50;
                  }
               }

               if(definition.solid && map != null) {
                  map.flagObject(y, orientation, x, type, definition.impenetrable);
               }

            } else {
               int displacement;
               Object var20;
               if(type == 2) {
                  displacement = orientation + 1 & 3;
                  Object var22;
                  if(definition.animation == -1 && definition.morphisms == null) {
                     var22 = definition.modelAt(2, orientation + 4, centre, east, northEast, north, -1);
                     var20 = definition.modelAt(2, displacement, centre, east, northEast, north, -1);
                  } else {
                     var22 = new RenderableObject(id, orientation + 4, 2, east, northEast, centre, north, definition.animation, true);
                     var20 = new RenderableObject(id, displacement, 2, east, northEast, centre, north, definition.animation, true);
                  }

                  scene.addWall(anIntArray[orientation], (Renderable)var22, key, y, config, x, (Renderable)var20, mean, anIntArray[displacement], z);
                  if(definition.occludes) {
                     if(orientation == 0) {
                        this.l[z][x][y] |= 585;
                        this.l[z][x][y + 1] |= 1170;
                     } else if(orientation == 1) {
                        this.l[z][x][y + 1] |= 1170;
                        this.l[z][x + 1][y] |= 585;
                     } else if(orientation == 2) {
                        this.l[z][x + 1][y] |= 585;
                        this.l[z][x][y] |= 1170;
                     } else if(orientation == 3) {
                        this.l[z][x][y] |= 1170;
                        this.l[z][x][y] |= 585;
                     }
                  }

                  if(definition.solid && map != null) {
                     map.flagObject(y, orientation, x, type, definition.impenetrable);
                  }

                  if(definition.decorDisplacement != 16) {
                     scene.displaceWallDecor(y, definition.decorDisplacement, x, z);
                  }

               } else if(type == 3) {
                  if(definition.animation == -1 && definition.morphisms == null) {
                     object = definition.modelAt(3, orientation, centre, east, northEast, north, -1);
                  } else {
                     object = new RenderableObject(id, orientation, 3, east, northEast, centre, north, definition.animation, true);
                  }

                  scene.addWall(p[orientation], (Renderable)object, key, y, config, x, (Renderable)null, mean, 0, z);
                  if(definition.castsShadow) {
                     if(orientation == 0) {
                        this.shading[z][x][y + 1] = 50;
                     } else if(orientation == 1) {
                        this.shading[z][x + 1][y + 1] = 50;
                     } else if(orientation == 2) {
                        this.shading[z][x + 1][y] = 50;
                     } else if(orientation == 3) {
                        this.shading[z][x][y] = 50;
                     }
                  }

                  if(definition.solid && map != null) {
                     map.flagObject(y, orientation, x, type, definition.impenetrable);
                  }

               } else if(type == 9) {
                  if(definition.animation == -1 && definition.morphisms == null) {
                     object = definition.modelAt(type, orientation, centre, east, northEast, north, -1);
                  } else {
                     object = new RenderableObject(id, orientation, type, east, northEast, centre, north, definition.animation, true);
                  }

                  scene.addObject(key, config, mean, 1, (Renderable)object, 1, z, 0, y, x);
                  if(definition.solid && map != null) {
                     map.flagObject(definition.impenetrable, definition.width, definition.length, x, y, orientation);
                  }

               } else {
                  if(definition.contouredGround) {
                     if(orientation == 1) {
                        displacement = north;
                        north = northEast;
                        northEast = east;
                        east = centre;
                        centre = displacement;
                     } else if(orientation == 2) {
                        displacement = north;
                        north = east;
                        east = displacement;
                        displacement = northEast;
                        northEast = centre;
                        centre = displacement;
                     } else if(orientation == 3) {
                        displacement = north;
                        north = centre;
                        centre = east;
                        east = northEast;
                        northEast = displacement;
                     }
                  }

                  if(type == 4) {
                     if(definition.animation == -1 && definition.morphisms == null) {
                        object = definition.modelAt(4, 0, centre, east, northEast, north, -1);
                     } else {
                        object = new RenderableObject(id, 0, 4, east, northEast, centre, north, definition.animation, true);
                     }

                     scene.addWallDecoration(key, y, orientation << 9, z, 0, mean, (Renderable)object, x, config, 0, anIntArray[orientation]);
                  } else if(type == 5) {
                     displacement = 16;
                     if((existing = scene.getWallKey(z, x, y)) > 0) {
                        displacement = ObjectDefinition.byId(existing >> 14 & 32767).decorDisplacement;
                     }

                     if(definition.animation == -1 && definition.morphisms == null) {
                        var20 = definition.modelAt(4, 0, centre, east, northEast, north, -1);
                     } else {
                        var20 = new RenderableObject(id, 0, 4, east, northEast, centre, north, definition.animation, true);
                     }

                     scene.addWallDecoration(key, y, orientation << 9, z, COSINE_VERTICES[orientation] * displacement, mean, (Renderable)var20, x, config, SINE_VERTICES[orientation] * displacement, anIntArray[orientation]);
                  } else if(type == 6) {
                     if(definition.animation == -1 && definition.morphisms == null) {
                        object = definition.modelAt(4, 0, centre, east, northEast, north, -1);
                     } else {
                        object = new RenderableObject(id, 0, 4, east, northEast, centre, north, definition.animation, true);
                     }

                     scene.addWallDecoration(key, y, orientation, z, 0, mean, (Renderable)object, x, config, 0, 256);
                  } else if(type == 7) {
                     if(definition.animation == -1 && definition.morphisms == null) {
                        object = definition.modelAt(4, 0, centre, east, northEast, north, -1);
                     } else {
                        object = new RenderableObject(id, 0, 4, east, northEast, centre, north, definition.animation, true);
                     }

                     scene.addWallDecoration(key, y, orientation, z, 0, mean, (Renderable)object, x, config, 0, 512);
                  } else {
                     if(type == 8) {
                        if(definition.animation == -1 && definition.morphisms == null) {
                           object = definition.modelAt(4, 0, centre, east, northEast, north, -1);
                        } else {
                           object = new RenderableObject(id, 0, 4, east, northEast, centre, north, definition.animation, true);
                        }

                        scene.addWallDecoration(key, y, orientation, z, 0, mean, (Renderable)object, x, config, 0, 768);
                     }

                  }
               }
            }
         } else {
            if(definition.animation == -1 && definition.morphisms == null) {
               object = definition.modelAt(10, orientation, centre, east, northEast, north, -1);
            } else {
               object = new RenderableObject(id, orientation, 10, east, northEast, centre, north, definition.animation, true);
            }

            if(object != null) {
               existing = 0;
               if(type == 11) {
                  existing += 256;
               }

               if(orientation != 1 && orientation != 3) {
                  id = definition.width;
                  type = definition.length;
               } else {
                  id = definition.length;
                  type = definition.width;
               }

               if(scene.addObject(key, config, mean, type, (Renderable)object, id, z, existing, y, x) && definition.castsShadow) {
                  Model var19;
                  if(object instanceof Model) {
                     var19 = (Model)object;
                  } else {
                     var19 = definition.modelAt(10, orientation, centre, east, northEast, north, -1);
                  }

                  if(var19 != null) {
                     for(centre = 0; centre <= id; ++centre) {
                        for(east = 0; east <= type; ++east) {
                           if((northEast = var19.r / 4) > 30) {
                              northEast = 30;
                           }

                           if(northEast > this.shading[z][x + centre][y + east]) {
                              this.shading[z][x + centre][y + east] = (byte)northEast;
                           }
                        }
                     }
                  }
               }
            }

            if(definition.solid && map != null) {
               map.flagObject(definition.impenetrable, definition.width, definition.length, x, y, orientation);
            }

         }
      }
   }

   private static int interpolatedNoise(int x, int y, int frequencyReciprocal) {
      int var3 = x / frequencyReciprocal;
      x &= frequencyReciprocal - 1;
      int var4 = y / frequencyReciprocal;
      y &= frequencyReciprocal - 1;
      int var5 = smoothNoise(var3, var4);
      int var6 = smoothNoise(var3 + 1, var4);
      int var7 = smoothNoise(var3, var4 + 1);
      var3 = smoothNoise(var3 + 1, var4 + 1);
      var4 = interpolate(var5, var6, x, frequencyReciprocal);
      x = interpolate(var7, var3, x, frequencyReciprocal);
      return interpolate(var4, x, y, frequencyReciprocal);
   }

   private static int encode(int hue, int saturation, int luminance) {
      if(luminance > 179) {
         saturation /= 2;
      }

      if(luminance > 192) {
         saturation /= 2;
      }

      if(luminance > 217) {
         saturation /= 2;
      }

      if(luminance > 243) {
         saturation /= 2;
      }

      return (hue / 4 << 10) + (saturation / 32 << 7) + luminance / 2;
   }

   public static boolean modelReady(int id, int type) {
      ObjectDefinition var3 = ObjectDefinition.byId(id);
      if(type == 11) {
         type = 10;
      }

      if(type >= 5 && type <= 8) {
         type = 4;
      }

      ObjectDefinition var10000 = var3;
      type = type;
      var3 = var3;
      if(var10000.modelTypes == null) {
         if(var3.modelIds == null) {
            return true;
         } else if(type != 10) {
            return true;
         } else {
            boolean var4 = true;

            for(type = 0; type < var3.modelIds.length; ++type) {
               var4 &= Model.loaded(var3.modelIds[type] & '\uffff');
            }

            return var4;
         }
      } else {
         for(int var2 = 0; var2 < var3.modelTypes.length; ++var2) {
            if(var3.modelTypes[var2] == type) {
               return Model.loaded(var3.modelIds[var2] & '\uffff');
            }
         }

         return true;
      }
   }

   public final void decodeConstructedMapData(int var1, int var2, CollisionMap[] maps, int topLeftRegionX, int var5, byte[] var6, int var7, int tileZ, int topLeftRegionY) {
      int y;
      for(int x = 0; x < 8; ++x) {
         for(y = 0; y < 8; ++y) {
            if(topLeftRegionX + x > 0 && topLeftRegionX + x < 103 && topLeftRegionY + y > 0 && topLeftRegionY + y < 103) {
               maps[tileZ].adjacencies[topLeftRegionX + x][topLeftRegionY + y] &= -16777217;
            }
         }
      }

      Buffer var17 = new Buffer(var6);

      for(y = 0; y < 4; ++y) {
         for(int var15 = 0; var15 < 64; ++var15) {
            for(int var16 = 0; var16 < 64; ++var16) {
               if(y == var1 && var15 >= var5 && var15 < var5 + 8 && var16 >= var7 && var16 < var7 + 8) {
                  int var10002 = var16 & 7;
                  int var12 = var15 & 7;
                  int var14 = var10002;
                  int var13;
                  int var10001 = topLeftRegionY + ((var13 = var2 & 3) == 0?var14:(var13 == 1?7 - var12:(var13 == 2?7 - var14:var12)));
                  int var10006 = var16 & 7;
                  var12 = var15 & 7;
                  var13 = var10006;
                  this.decodeMapData(var10001, 0, var17, topLeftRegionX + ((var14 = var2 & 3) == 0?var12:(var14 == 1?var13:(var14 == 2?7 - var12:7 - var13))), tileZ, var2, 0);
               } else {
                  this.decodeMapData(-1, 0, var17, -1, 0, 0, 0);
               }
            }
         }
      }

   }

   public final void decodeRegionMapData(byte[] data, int dY, int dX, int regionX, int regionY, CollisionMap[] maps) {
      int z;
      int localX;
      for(int var7 = 0; var7 < 4; ++var7) {
         for(z = 0; z < 64; ++z) {
            for(localX = 0; localX < 64; ++localX) {
               if(dX + z > 0 && dX + z < 103 && dY + localX > 0 && dY + localX < 103) {
                  maps[var7].adjacencies[dX + z][dY + localX] &= -16777217;
               }
            }
         }
      }

      Buffer var11 = new Buffer(data);

      for(z = 0; z < 4; ++z) {
         for(localX = 0; localX < 64; ++localX) {
            for(int localY = 0; localY < 64; ++localY) {
               this.decodeMapData(localY + dY, regionY, var11, localX + dX, z, 0, regionX);
            }
         }
      }

   }

   private void decodeMapData(int y, int regionY, Buffer buffer, int x, int z, int rotation, int regionX) {
      try {
         int type;
         if(x >= 0 && x < 104 && y >= 0 && y < 104) {
            this.tileFlags[z][x][y] = 0;

            while((type = buffer.readUByte()) != 0) {
               if(type == 1) {
                  if((regionY = buffer.readUByte()) == 1) {
                     regionY = 0;
                  }

                  if(z == 0) {
                     this.tileHeights[0][x][y] = -regionY << 3;
                     return;
                  }

                  this.tileHeights[z][x][y] = this.tileHeights[z - 1][x][y] - (regionY << 3);
                  return;
               }

               if(type <= 49) {
                  this.overlays[z][x][y] = buffer.readByte();
                  this.overlayTypes[z][x][y] = (byte)((type - 2) / 4);
                  this.overlayOrientations[z][x][y] = (byte)(type - 2 + rotation & 3);
               } else if(type <= 81) {
                  this.tileFlags[z][x][y] = (byte)(type - 49);
               } else {
                  this.underlays[z][x][y] = (byte)(type - 81);
               }
            }

            if(z == 0) {
               int[] var10000 = this.tileHeights[0][x];
               int var10001 = y;
               int var10002 = x + 932731 + regionX;
               regionY += y + 556238;
               y = var10002;
               if((y = (int)((double)(interpolatedNoise(var10002 + '넵', regionY + 91923, 4) - 128 + (interpolatedNoise(y + 10294, regionY + '鎽', 2) - 128 >> 1) + (interpolatedNoise(y, regionY, 1) - 128 >> 2)) * 0.3D) + 35) < 10) {
                  y = 10;
               } else if(y > 60) {
                  y = 60;
               }

               var10000[var10001] = -y << 3;
               return;
            }

            this.tileHeights[z][x][y] = this.tileHeights[z - 1][x][y] - 240;
            return;
         }

         while((type = buffer.readUByte()) != 0) {
            if(type == 1) {
               buffer.readUByte();
               return;
            }

            if(type <= 49) {
               buffer.readUByte();
            }
         }
      } catch (Exception var9) {
         ;
      }

   }

   private int getCollisionPlane(int y, int z, int x) {
      return (this.tileFlags[z][x][y] & 8) != 0?0:(z > 0 && (this.tileFlags[1][x][y] & 2) != 0?z - 1:z);
   }

   public final void decodeConstructedLandscapes(CollisionMap[] maps, SceneGraph scene, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9, int var10) {
      Buffer buffer = new Buffer(var7);
      int id = -1;

      int idOffset;
      while((idOffset = buffer.c()) != 0) {
         id += idOffset;
         idOffset = 0;

         int offset;
         while((offset = buffer.s()) != 0) {
            offset = (idOffset += offset - 1) & 63;
            int y = idOffset >> 6 & 63;
            int objectPlane = idOffset >> 12;
            int packed;
            int type = (packed = buffer.readUByte()) >> 2;
            packed &= 3;
            if(objectPlane == var3 && y >= var8 && y < var8 + 8 && offset >= var5 && offset < var5 + 8) {
               ObjectDefinition definition = ObjectDefinition.byId(id);
               int var10003 = y & 7;
               int var10004 = offset & 7;
               int var19 = definition.width;
               int var20 = var10004;
               int var21 = var10003;
               int var22 = definition.length;
               int var23;
               int var24 = var4 + ((var23 = var9 & 3) == 0?var21:(var23 == 1?var20:(var23 == 2?7 - var21 - (var19 - 1):7 - var20 - (var22 - 1))));
               int var10001 = offset & 7;
               var19 = y & 7;
               var20 = definition.width;
               var22 = definition.length;
               var23 = var10001;
               offset = var10 + ((var21 = var9 & 3) == 0?var23:(var21 == 1?7 - var19 - (var20 - 1):(var21 == 2?7 - var23 - (var22 - 1):var19)));
               if(var24 > 0 && offset > 0 && var24 < 103 && offset < 103) {
                  y = objectPlane;
                  if((this.tileFlags[1][var24][offset] & 2) == 2) {
                     y = objectPlane - 1;
                  }

                  CollisionMap var26 = null;
                  if(y >= 0) {
                     var26 = maps[y];
                  }

                  this.placeObject(offset, scene, var26, type, var6, var24, id, packed + var9 & 3);
               }
            }
         }
      }

   }

   private static int interpolate(int a, int b, int angle, int frequencyReciprocal) {
      angle = 65536 - Rasterizer3D.COSINE[(angle << 10) / frequencyReciprocal] >> 1;
      return (a * (65536 - angle) >> 16) + (b * angle >> 16);
   }

   private static int checkedLight(int color, int light) {
      if(color == -2) {
         return 12345678;
      } else if(color == -1) {
         if(light < 0) {
            light = 0;
         } else if(light > 127) {
            light = 127;
         }

         return light = 127 - light;
      } else {
         if((light = light * (color & 127) / 128) < 2) {
            light = 2;
         } else if(light > 126) {
            light = 126;
         }

         return (color & 'ﾀ') + light;
      }
   }

   private static int smoothNoise(int var0, int var1) {
      int var2 = perlinNoise(var0 - 1, var1 - 1) + perlinNoise(var0 + 1, var1 - 1) + perlinNoise(var0 - 1, var1 + 1) + perlinNoise(var0 + 1, var1 + 1);
      int var3 = perlinNoise(var0 - 1, var1) + perlinNoise(var0 + 1, var1) + perlinNoise(var0, var1 - 1) + perlinNoise(var0, var1 + 1);
      var0 = perlinNoise(var0, var1);
      return var2 / 16 + var3 / 8 + var0 / 4;
   }

   private static int light(int color, int light) {
      if(color == -1) {
         return 12345678;
      } else {
         if((light = light * (color & 127) / 128) < 2) {
            light = 2;
         } else if(light > 126) {
            light = 126;
         }

         return (color & 'ﾀ') + light;
      }
   }

   public static void placeObject(SceneGraph var0, int var1, int y, int var3, int z, CollisionMap var5, int[][][] var6, int x, int id, int var9) {
      int aY = var6[z][x][y];
      int bY = var6[z][x + 1][y];
      int cY = var6[z][x + 1][y + 1];
      z = var6[z][x][y + 1];
      int meanY = aY + bY + cY + z >> 2;
      ObjectDefinition definition = ObjectDefinition.byId(id);
      int key = x + (y << 7) + (id << 14) + 1073741824;
      if(!definition.interactive) {
         key += Integer.MIN_VALUE;
      }

      byte config = (byte)((var1 << 6) + var3);
      Object var16;
      if(var3 == 22) {
         if(definition.animation == -1 && definition.morphisms == null) {
            var16 = definition.modelAt(22, var1, aY, bY, cY, z, -1);
         } else {
            var16 = new RenderableObject(id, var1, 22, bY, cY, aY, z, definition.animation, true);
         }

         var0.addFloorDecoration(var9, meanY, y, (Renderable)var16, config, key, x);
         if(definition.solid && definition.interactive) {
            var5.block(y, x);
         }

      } else {
         int var17;
         if(var3 != 10 && var3 != 11) {
            if(var3 >= 12) {
               if(definition.animation == -1 && definition.morphisms == null) {
                  var16 = definition.modelAt(var3, var1, aY, bY, cY, z, -1);
               } else {
                  var16 = new RenderableObject(id, var1, var3, bY, cY, aY, z, definition.animation, true);
               }

               var0.addObject(key, config, meanY, 1, (Renderable)var16, 1, var9, 0, y, x);
               if(definition.solid) {
                  var5.flagObject(definition.impenetrable, definition.width, definition.length, x, y, var1);
               }

            } else if(var3 == 0) {
               if(definition.animation == -1 && definition.morphisms == null) {
                  var16 = definition.modelAt(0, var1, aY, bY, cY, z, -1);
               } else {
                  var16 = new RenderableObject(id, var1, 0, bY, cY, aY, z, definition.animation, true);
               }

               var0.addWall(anIntArray[var1], (Renderable)var16, key, y, config, x, (Renderable)null, meanY, 0, var9);
               if(definition.solid) {
                  var5.flagObject(y, var1, x, var3, definition.impenetrable);
               }

            } else if(var3 == 1) {
               if(definition.animation == -1 && definition.morphisms == null) {
                  var16 = definition.modelAt(1, var1, aY, bY, cY, z, -1);
               } else {
                  var16 = new RenderableObject(id, var1, 1, bY, cY, aY, z, definition.animation, true);
               }

               var0.addWall(p[var1], (Renderable)var16, key, y, config, x, (Renderable)null, meanY, 0, var9);
               if(definition.solid) {
                 var5.flagObject(y, var1, x, var3, definition.impenetrable);
               }

            } else {
               Object var19;
               int var20;
               if(var3 == 2) {
                  var20 = var1 + 1 & 3;
                  Object var21;
                  if(definition.animation == -1 && definition.morphisms == null) {
                     var21 = definition.modelAt(2, var1 + 4, aY, bY, cY, z, -1);
                     var19 = definition.modelAt(2, var20, aY, bY, cY, z, -1);
                  } else {
                     var21 = new RenderableObject(id, var1 + 4, 2, bY, cY, aY, z, definition.animation, true);
                     var19 = new RenderableObject(id, var20, 2, bY, cY, aY, z, definition.animation, true);
                  }

                  var0.addWall(anIntArray[var1], (Renderable)var21, key, y, config, x, (Renderable)var19, meanY, anIntArray[var20], var9);
                  if(definition.solid) {
                     var5.flagObject(y, var1, x, var3, definition.impenetrable);
                  }

               } else if(var3 == 3) {
                  if(definition.animation == -1 && definition.morphisms == null) {
                     var16 = definition.modelAt(3, var1, aY, bY, cY, z, -1);
                  } else {
                     var16 = new RenderableObject(id, var1, 3, bY, cY, aY, z, definition.animation, true);
                  }

                  var0.addWall(p[var1], (Renderable)var16, key, y, config, x, (Renderable)null, meanY, 0, var9);
                  if(definition.solid) {
                     var5.flagObject(y, var1, x, var3, definition.impenetrable);
                  }

               } else if(var3 == 9) {
                  if(definition.animation == -1 && definition.morphisms == null) {
                     var16 = definition.modelAt(var3, var1, aY, bY, cY, z, -1);
                  } else {
                     var16 = new RenderableObject(id, var1, var3, bY, cY, aY, z, definition.animation, true);
                  }

                  var0.addObject(key, config, meanY, 1, (Renderable)var16, 1, var9, 0, y, x);
                  if(definition.solid) {
                     var5.flagObject(definition.impenetrable, definition.width, definition.length, x, y, var1);
                  }

               } else {
                  if(definition.contouredGround) {
                     if(var1 == 1) {
                        var20 = z;
                        z = cY;
                        cY = bY;
                        bY = aY;
                        aY = var20;
                     } else if(var1 == 2) {
                        var20 = z;
                        z = bY;
                        bY = var20;
                        var20 = cY;
                        cY = aY;
                        aY = var20;
                     } else if(var1 == 3) {
                        var20 = z;
                        z = aY;
                        aY = bY;
                        bY = cY;
                        cY = var20;
                     }
                  }

                  if(var3 == 4) {
                     if(definition.animation == -1 && definition.morphisms == null) {
                        var16 = definition.modelAt(4, 0, aY, bY, cY, z, -1);
                     } else {
                        var16 = new RenderableObject(id, 0, 4, bY, cY, aY, z, definition.animation, true);
                     }

                     var0.addWallDecoration(key, y, var1 << 9, var9, 0, meanY, (Renderable)var16, x, config, 0, anIntArray[var1]);
                  } else if(var3 == 5) {
                     var20 = 16;
                     if((var17 = var0.getWallKey(var9, x, y)) > 0) {
                        var20 = ObjectDefinition.byId(var17 >> 14 & 32767).decorDisplacement;
                     }

                     if(definition.animation == -1 && definition.morphisms == null) {
                        var19 = definition.modelAt(4, 0, aY, bY, cY, z, -1);
                     } else {
                        var19 = new RenderableObject(id, 0, 4, bY, cY, aY, z, definition.animation, true);
                     }

                     var0.addWallDecoration(key, y, var1 << 9, var9, COSINE_VERTICES[var1] * var20, meanY, (Renderable)var19, x, config, SINE_VERTICES[var1] * var20, anIntArray[var1]);
                  } else if(var3 == 6) {
                     if(definition.animation == -1 && definition.morphisms == null) {
                        var16 = definition.modelAt(4, 0, aY, bY, cY, z, -1);
                     } else {
                        var16 = new RenderableObject(id, 0, 4, bY, cY, aY, z, definition.animation, true);
                     }

                     var0.addWallDecoration(key, y, var1, var9, 0, meanY, (Renderable)var16, x, config, 0, 256);
                  } else if(var3 == 7) {
                     if(definition.animation == -1 && definition.morphisms == null) {
                        var16 = definition.modelAt(4, 0, aY, bY, cY, z, -1);
                     } else {
                        var16 = new RenderableObject(id, 0, 4, bY, cY, aY, z, definition.animation, true);
                     }

                     var0.addWallDecoration(key, y, var1, var9, 0, meanY, (Renderable)var16, x, config, 0, 512);
                  } else {
                     if(var3 == 8) {
                        if(definition.animation == -1 && definition.morphisms == null) {
                           var16 = definition.modelAt(4, 0, aY, bY, cY, z, -1);
                        } else {
                           var16 = new RenderableObject(id, 0, 4, bY, cY, aY, z, definition.animation, true);
                        }

                        var0.addWallDecoration(key, y, var1, var9, 0, meanY, (Renderable)var16, x, config, 0, 768);
                     }

                  }
               }
            }
         } else {
            if(definition.animation == -1 && definition.morphisms == null) {
               var16 = definition.modelAt(10, var1, aY, bY, cY, z, -1);
            } else {
               var16 = new RenderableObject(id, var1, 10, bY, cY, aY, z, definition.animation, true);
            }

            if(var16 != null) {
               var17 = 0;
               if(var3 == 11) {
                  var17 += 256;
               }

               if(var1 != 1 && var1 != 3) {
                  z = definition.width;
                  var3 = definition.length;
               } else {
                  z = definition.length;
                  var3 = definition.width;
               }

               var0.addObject(key, config, meanY, var3, (Renderable)var16, z, var9, var17, y, x);
            }

            if(definition.solid) {
               var5.flagObject(definition.impenetrable, definition.width, definition.length, x, y, var1);
            }

         }
      }
   }

   public static boolean objectsReady(int y, byte[] data, int x) {
      boolean var3 = true;
      Buffer var10 = new Buffer(data);
      int var4 = -1;

      int position;
      label62:
      while((position = var10.s()) != 0) {
         var4 += position;
         position = 0;
         boolean var6 = false;

         while(true) {
            while(!var6) {
               int terminate;
               if((terminate = var10.s()) == 0) {
                  continue label62;
               }

               terminate = (position += terminate - 1) & 63;
               int localY = position >> 6 & 63;
               int type = var10.readUByte() >> 2;
               localY += y;
               terminate += x;
               if(localY > 0 && terminate > 0 && localY < 103 && terminate < 103) {
                  ObjectDefinition var12 = ObjectDefinition.byId(var4);
                  if(type != 22 || !lowMemory || var12.interactive || var12.obstructsGround) {
                     ObjectDefinition var11 = var12;
                     boolean var10001;
                     if(var12.modelIds == null) {
                        var10001 = true;
                     } else {
                        var6 = true;

                        for(terminate = 0; terminate < var11.modelIds.length; ++terminate) {
                           var6 &= Model.loaded(var11.modelIds[terminate] & '\uffff');
                        }

                        var10001 = var6;
                     }

                     var3 &= var10001;
                     var6 = true;
                  }
               }
            }

            if(var10.s() == 0) {
               break;
            }

            var10.readUByte();
         }
      }

      return var3;
   }

   public final void decodeLandscapes(int localX, CollisionMap[] maps, int localY, SceneGraph scene, byte[] data) {
      Buffer buf = new Buffer(data);
      int id = -1;

      int idOffset;
      while((idOffset = buf.s()) != 0) {
         id += idOffset;
         idOffset = 0;

         int y;
         while((y = buf.s()) != 0) {
            y = (idOffset += y - 1) & 63;
            int x = idOffset >> 6 & 63;
            int z = idOffset >> 12;
            int orientation;
            int type = (orientation = buf.readUByte()) >> 2;
            orientation &= 3;
            x += localX;
            y += localY;
            if(x > 0 && y > 0 && x < 103 && y < 103 && z >= 0 && z < 4) {
               int plane = z;
               if((this.tileFlags[1][x][y] & 2) == 2) {
                  plane = z - 1;
               }

               CollisionMap map = null;
               if(plane >= 0) {
                  map = maps[plane];
               }

               this.placeObject(y, scene, map, type, z, x, id, orientation);
            }
         }
      }

   }
}
