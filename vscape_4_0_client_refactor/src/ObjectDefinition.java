public final class ObjectDefinition {
   private static int B;
   public boolean obstructsGround;
   private byte ambientLighting;
   private int translateX;
   public String name;
   private int scaleZ;
   private static final Model[] parts = new Model[4];
   private byte lightDiffusion;
   public int width;
   private int translateY;
   public int minimapFunction;
   private int[] replacementColors;
   private int scaleX;
   public int morphVariableIndex;
   private boolean inverted;
   public static boolean f;
   private static Buffer data;
   public int id = -1;
   private static int[] indices;
   public boolean impenetrable;
   public int mapscene;
   public int[] morphisms;
   private int supportItems;
   public int length;
   public boolean contouredGround;
   public boolean occludes;
   public static Client client;
   private boolean hollow;
   public boolean solid;
   public int surroundings;
   private boolean delayShading;
   private static int cacheIndex;
   private int scaleY;
   public int[] modelIds;
   public int morphVarbitIndex;
   public int decorDisplacement;
   public int[] modelTypes;
   public byte[] description;
   public boolean interactive;
   public boolean castsShadow;
   public static Cache x = new Cache(30);
   public int animation;
   private static ObjectDefinition[] cache;
   private int translateZ;
   private int[] originalColors;
   public static Cache baseModels = new Cache(500);
   public String[] interactions;

   public static ObjectDefinition byId(int id) {
      for(int var1 = 0; var1 < 20; ++var1) {
         if(cache[var1].id == id) {
            return cache[var1];
         }
      }

      cacheIndex = (cacheIndex + 1) % 20;
      ObjectDefinition var7 = cache[cacheIndex];
      data.position = indices[id];
      var7.id = id;
      var7.reset();
      var7.decode(data);
      return var7;
   }

private void decode(Buffer var2) {
      int var3 = -1;

      while(true) {
         while(true) {
            int var4;
            int var5;
            label244:
            do {
               while((var4 = var2.readUByte()) != 0) {
                  if(var4 == 1) {
                     continue label244;
                  }

                  if(var4 == 2) {
                     name = var2.readString();
                  } else if(var4 == 3) {
                     description = var2.readStringBytes();
                  } else if(var4 == 5) {
                     if((var4 = var2.readUByte()) > 0) {
                        if(modelIds == null) {
                           modelTypes = null;
                           modelIds = new int[var4];

                           for(var5 = 0; var5 < var4; ++var5) {
                              modelIds[var5] = var2.readUShort();
                           }
                        } else {
                           var2.position += var4 << 1;
                        }
                     }
                  } else if(var4 == 14) {
                     width = var2.readUByte();
                  } else if(var4 == 15) {
                     length = var2.readUByte();
                  } else if(var4 == 17) {
                     solid = false;
                  } else if(var4 == 18) {
                     impenetrable = false;
                  } else if(var4 == 19) {
                     if((var3 = var2.readUByte()) == 1) {
                        interactive = true;
                     }
                  } else if(var4 == 21) {
                     contouredGround = true;
                  } else if(var4 == 22) {
                     delayShading = true;
                  } else if(var4 == 23) {
                     occludes = true;
                  } else if(var4 == 24) {
                     animation = var2.readUShort();
                     if(animation == '\uffff') {
                        animation = -1;
                     }
                  } else if(var4 == 28) {
                     decorDisplacement = var2.readUByte();
                  } else if(var4 == 29) {
                     ambientLighting = var2.readByte();
                  } else if(var4 == 39) {
                     lightDiffusion = var2.readByte();
                  } else if(var4 >= 30 && var4 < 39) {
                     if(interactions == null) {
                        interactions = new String[5];
                     }

                     interactions[var4 - 30] = var2.readString();
                     if(interactions[var4 - 30].equalsIgnoreCase("hidden")) {
                        interactions[var4 - 30] = null;
                     }
                  } else if(var4 == 40) {
                     var4 = var2.readUByte();
                     originalColors = new int[var4];
                     replacementColors = new int[var4];

                     for(var5 = 0; var5 < var4; ++var5) {
                        originalColors[var5] = var2.readUShort();
                        replacementColors[var5] = var2.readUShort();
                     }
                  } else if(var4 == 60) {
                     minimapFunction = var2.readUShort();
                  } else if(var4 == 62) {
                     inverted = true;
                  } else if(var4 == 64) {
                     castsShadow = false;
                  } else if(var4 == 65) {
                     scaleX = var2.readUShort();
                  } else if(var4 == 66) {
                     scaleY = var2.readUShort();
                  } else if(var4 == 67) {
                     scaleZ = var2.readUShort();
                  } else if(var4 == 68) {
                     mapscene = var2.readUShort();
                  } else if(var4 == 69) {
                     surroundings = var2.readUByte();
                  } else if(var4 == 70) {
                     translateX = var2.readShort();
                  } else if(var4 == 71) {
                     translateY = var2.readShort();
                  } else if(var4 == 72) {
                     translateZ = var2.readShort();
                  } else if(var4 == 73) {
                     obstructsGround = true;
                  } else if(var4 == 74) {
                     hollow = true;
                  } else if(var4 == 75) {
                     supportItems = var2.readUByte();
                  } else if(var4 == 77) {
                     morphVarbitIndex = var2.readUShort();
                     if(morphVarbitIndex == '\uffff') {
                        morphVarbitIndex = -1;
                     }

                     morphVariableIndex = var2.readUShort();
                     if(morphVariableIndex == '\uffff') {
                        morphVariableIndex = -1;
                     }

                     var4 = var2.readUByte();
                     morphisms = new int[var4 + 1];

                     for(var5 = 0; var5 <= var4; ++var5) {
                        morphisms[var5] = var2.readUShort();
                        if(morphisms[var5] == '\uffff') {
                           morphisms[var5] = -1;
                        }
                     }
                  }
               }

               if(var3 == -1) {
                  interactive = modelIds != null && (modelTypes == null || modelTypes[0] == 10);
                  if(interactions != null) {
                     interactive = true;
                  }
               }

               if(hollow) {
                  solid = false;
                  impenetrable = false;
               }

               if(supportItems == -1) {
                  supportItems = solid?1:0;
               }

               return ;//var7;
            } while((var4 = var2.readUByte()) <= 0);

            if(modelIds == null) {
               modelTypes = new int[var4];
               modelIds = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  modelIds[var5] = var2.readUShort();
                  modelTypes[var5] = var2.readUByte();
               }
            } else {
               var2.position += var4 * 3;
            }
         }
      }
}

private void reset() {
	modelIds = null;
      modelTypes = null;
      name = null;
      description = null;
      originalColors = null;
      replacementColors = null;
      width = 1;
      length = 1;
      solid = true;
      impenetrable = true;
      interactive = false;
      contouredGround = false;
      delayShading = false;
      occludes = false;
      animation = -1;
      decorDisplacement = 16;
      ambientLighting = 0;
      lightDiffusion = 0;
      interactions = null;
      minimapFunction = -1;
      mapscene = -1;
      inverted = false;
      castsShadow = true;
      scaleX = 128;
      scaleY = 128;
      scaleZ = 128;
      surroundings = 0;
      translateX = 0;
      translateY = 0;
      translateZ = 0;
      obstructsGround = false;
      hollow = false;
      supportItems = -1;
      morphVarbitIndex = -1;
      morphVariableIndex = -1;
      morphisms = null;
}

   public static void dispose() {
      baseModels = null;
      x = null;
      indices = null;
      cache = null;
      data = null;
   }

   public static void init(Archive var0) {
      data = new Buffer(var0.getEntry("loc.dat"));
      Buffer var3;
      indices = new int[B = (var3 = new Buffer(var0.getEntry("loc.idx"))).readUShort()];
      System.out.println("Objects Loaded: " + B);
      int var1 = 2;

      int var2;
      for(var2 = 0; var2 < B; ++var2) {
         indices[var2] = var1;
         var1 += var3.readUShort();
      }

      cache = new ObjectDefinition[20];

      for(var2 = 0; var2 < 20; ++var2) {
         cache[var2] = new ObjectDefinition();
      }

   }

   public final Model modelAt(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8;
      Model var10000;
      int var19;
      label251: {
         int var10001 = var1;
         var1 = var2;
         var8 = var7;
         var7 = var10001;
         ObjectDefinition var16 = this;
         Model var9 = null;
         long var10;
         boolean var13;
         int var14;
         if(this.modelTypes == null) {
            if(var7 != 10) {
               var10000 = null;
               break label251;
            }

            var10 = (long)((this.id << 6) + var2) + ((long)(var8 + 1) << 32);
            Model var12;
            if((var12 = (Model)x.get(var10)) != null) {
               var10000 = var12;
               break label251;
            }

            if(this.modelIds == null) {
               var10000 = null;
               break label251;
            }

            var13 = this.inverted ^ var2 > 3;
            var7 = this.modelIds.length;

            for(var14 = 0; var14 < var7; ++var14) {
               var19 = var16.modelIds[var14];
               if(var13) {
                  var19 += 65536;
               }

               if((var9 = (Model)baseModels.get((long)var19)) == null) {
                  if((var9 = Model.lookup(var19 & '\uffff')) == null) {
                     var10000 = null;
                     break label251;
                  }

                  if(var13) {
                     var9.f();
                  }

                  baseModels.put(var9, (long)var19);
               }

               if(var7 > 1) {
                  parts[var14] = var9;
               }
            }

            if(var7 > 1) {
               var9 = new Model(var7, parts);
            }
         } else {
            var19 = -1;

            for(int var22 = 0; var22 < var16.modelTypes.length; ++var22) {
               if(var16.modelTypes[var22] == var7) {
                  var19 = var22;
                  break;
               }
            }

            if(var19 == -1) {
               var10000 = null;
               break label251;
            }

            var10 = (long)((var16.id << 6) + (var19 << 3) + var2) + ((long)(var8 + 1) << 32);
            Model var21;
            if((var21 = (Model)x.get(var10)) != null) {
               var10000 = var21;
               break label251;
            }

            var7 = var16.modelIds[var19];
            boolean var24;
            if(var24 = var16.inverted ^ var2 > 3) {
               var7 += 65536;
            }

            if((var9 = (Model)baseModels.get((long)var7)) == null) {
               if((var9 = Model.lookup(var7 & '\uffff')) == null) {
                  var10000 = null;
                  break label251;
               }

               if(var24) {
                  var9.f();
               }

               baseModels.put(var9, (long)var7);
            }
         }

         boolean var23 = var16.scaleX != 128 || var16.scaleY != 128 || var16.scaleZ != 128;
         var13 = var16.translateX != 0 || var16.translateY != 0 || var16.translateZ != 0;
         Model var18 = new Model(var16.originalColors == null, Frame.isInvalid(var8), var2 == 0 && var8 == -1 && !var23 && !var13, var9);
         if(var8 != -1) {
            var18.createBones();
            var18.applyTransform(var8);
            var18.faceGroups = null;
            var18.vertexGroups = null;
         }

         while(var1-- > 0) {
            var18.e();
         }

         if(var16.originalColors != null) {
            for(var14 = 0; var14 < var16.originalColors.length; ++var14) {
               var18.recolor(var16.originalColors[var14], var16.replacementColors[var14]);
            }
         }

         if(var23) {
            var18.scale(var16.scaleX, var16.scaleZ, var16.scaleY);
         }

         if(var13) {
            var18.a(var16.translateX, var16.translateY, var16.translateZ);
         }

         var18.light(64 + var16.ambientLighting, 768 + var16.lightDiffusion * 5, -50, -10, -50, !var16.delayShading);
         if(var16.supportItems == 1) {
            var18.v = var18.modelHeight;
         }

         x.put(var18, var10);
         var10000 = var18;
      }

      Model var15 = var10000;
      if(var10000 == null) {
         return null;
      } else {
         if(this.contouredGround || this.delayShading) {
            var15 = new Model(this.contouredGround, this.delayShading, var15);
         }

         if(this.contouredGround) {
            var2 = (var3 + var4 + var5 + var6) / 4;

            for(var7 = 0; var7 < var15.d; ++var7) {
               var8 = var15.e[var7];
               int var20 = var15.g[var7];
               var19 = var3 + (var4 - var3) * (var8 + 64) / 128;
               var8 = var6 + (var5 - var6) * (var8 + 64) / 128;
               var8 = var19 + (var8 - var19) * (var20 + 64) / 128;
               var15.f[var7] += var8 - var2;
            }

            Model var17 = var15;
            var15.modelHeight = 0;
            var15.s = 0;

            for(var7 = 0; var7 < var17.d; ++var7) {
               if(-(var8 = var17.f[var7]) > var17.modelHeight) {
                  var17.modelHeight = -var8;
               }

               if(var8 > var17.s) {
                  var17.s = var8;
               }
            }

            var17.u = (int)(Math.sqrt((double)(var17.r * var17.r + var17.modelHeight * var17.modelHeight)) + 0.99D);
            var17.t = var17.u + (int)(Math.sqrt((double)(var17.r * var17.r + var17.s * var17.s)) + 0.99D);
         }

         return var15;
      }
   }
}
