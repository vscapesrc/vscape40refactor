public final class ActorDefinition {
   public static int count;
   public int b;
   public int rotateAntiClockwiseAnimation = -1;
   private static int cacheIndex;
   private int varbit = -1;
   public int halfTurnAnimation = -1;
   private int varp = -1;
   private static Buffer data;
   public int combatLevel = -1;
   public String name;
   public String[] actions;
   public int walkingAnimation = -1;
   public byte size = 1;
   private int[] replacementColors;
   private static int[] offsets;
   private int[] additionalModels;
   public int headIcon = -1;
   private int[] originalColors;
   public int idleAnimation = -1;
   public long id = -1L;
   public int rotation = 32;
   private static ActorDefinition[] cache;
   public static Client client;
   public int rotateClockwiseAnimation = -1;
   public boolean clickable = true;
   private int lightModifier;
   private int scaleZ = 128;
   public boolean drawMinimapDot = true;
   public int[] morphisms;
   private int scaleXY = 128;
   private int shadowModifier;
   public boolean priorityRender = false;
   private int[] modelIds;
   public static Cache modelCache = new Cache(30);

   public static ActorDefinition lookup(int id) {
      for(int var1 = 0; var1 < 20; ++var1) {
         if(cache[var1].id == (long)id) {
            return cache[var1];
         }
      }

      cacheIndex = (cacheIndex + 1) % 20;
      ActorDefinition var6 = cache[cacheIndex] = new ActorDefinition();
      data.position = offsets[id];
      var6.b = id;
      var6.id = (long)id;
      Buffer var2 = data;
      ActorDefinition var3 = var6;

      while(true) {
         int var4;
         while((var4 = var2.readUByte()) != 0) {
            int var5;
            if(var4 == 1) {
               var4 = var2.readUByte();
               var3.modelIds = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  var3.modelIds[var5] = var2.readUShort();
               }
            } else if(var4 == 2) {
               var3.name = var2.d();
            } else if(var4 == 3) {
               var2.readStringBytes();
            } else if(var4 == 12) {
               var3.size = var2.readByte();
            } else if(var4 == 13) {
               var3.idleAnimation = var2.readUShort();
            } else if(var4 == 14) {
               var3.walkingAnimation = var2.readUShort();
            } else if(var4 == 17) {
               var3.walkingAnimation = var2.readUShort();
               var3.halfTurnAnimation = var2.readUShort();
               var3.rotateClockwiseAnimation = var2.readUShort();
               var3.rotateAntiClockwiseAnimation = var2.readUShort();
            } else if(var4 >= 30 && var4 < 40) {
               if(var3.actions == null) {
                  var3.actions = new String[5];
               }

               var3.actions[var4 - 30] = var2.d();
               if(var3.actions[var4 - 30].equalsIgnoreCase("hidden")) {
                  var3.actions[var4 - 30] = null;
               }
            } else if(var4 == 40) {
               var4 = var2.readUByte();
               var3.originalColors = new int[var4];
               var3.replacementColors = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  var3.originalColors[var5] = var2.readUShort();
                  var3.replacementColors[var5] = var2.readUShort();
               }
            } else if(var4 == 60) {
               var4 = var2.readUByte();
               var3.additionalModels = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  var3.additionalModels[var5] = var2.readUShort();
               }
            } else if(var4 == 90) {
               var2.readUShort();
            } else if(var4 == 91) {
               var2.readUShort();
            } else if(var4 == 92) {
               var2.readUShort();
            } else if(var4 == 93) {
               var3.drawMinimapDot = false;
            } else if(var4 == 95) {
               var3.combatLevel = var2.readUShort();
            } else if(var4 == 97) {
               var3.scaleXY = var2.readUShort();
            } else if(var4 == 98) {
               var3.scaleZ = var2.readUShort();
            } else if(var4 == 99) {
               var3.priorityRender = true;
            } else if(var4 == 100) {
               var3.lightModifier = var2.readByte();
            } else if(var4 == 101) {
               var3.shadowModifier = var2.readByte() * 5;
            } else if(var4 == 102) {
               var3.headIcon = var2.readUShort();
            } else if(var4 == 103) {
               var3.rotation = var2.readUShort();
            } else if(var4 == 106) {
               var3.varbit = var2.readUShort();
               if(var3.varbit == '\uffff') {
                  var3.varbit = -1;
               }

               var3.varp = var2.readUShort();
               if(var3.varp == '\uffff') {
                  var3.varp = -1;
               }

               var4 = var2.readUByte();
               var3.morphisms = new int[var4 + 1];

               for(var5 = 0; var5 <= var4; ++var5) {
                  var3.morphisms[var5] = var2.readUShort();
                  if(var3.morphisms[var5] == '\uffff') {
                     var3.morphisms[var5] = -1;
                  }
               }
            } else if(var4 == 107) {
               var3.clickable = false;
            }
         }

         switch(id) {
         case 26:
            var6.idleAnimation = 808;
            break;
         case 2028:
            var6.idleAnimation = 2074;
            break;
         case 6142:
         case 6143:
         case 6144:
         case 6145:
         case 6146:
         case 6147:
         case 6148:
         case 6149:
         case 6150:
         case 6151:
         case 6152:
         case 6153:
         case 6154:
         case 6155:
         case 6156:
         case 6157:
            var6.drawMinimapDot = false;
         }

         return var6;
      }
   }

   public final Model model() {
      while(this.morphisms != null) {
         ActorDefinition var1;
         if((var1 = this.morph()) == null) {
            return null;
         }

         //this = var1;
      }

      if(this.additionalModels == null) {
         return null;
      } else {
         boolean var3 = false;

         int var2;
         for(var2 = 0; var2 < this.additionalModels.length; ++var2) {
            if(!Model.loaded(this.additionalModels[var2])) {
               var3 = true;
            }
         }

         if(var3) {
            return null;
         } else {
            Model[] var5 = new Model[this.additionalModels.length];

            for(int var4 = 0; var4 < this.additionalModels.length; ++var4) {
               var5[var4] = Model.lookup(this.additionalModels[var4]);
            }

            Model var6;
            if(var5.length == 1) {
               var6 = var5[0];
            } else {
               var6 = new Model(var5.length, var5);
            }

            if(this.originalColors != null) {
               for(var2 = 0; var2 < this.originalColors.length; ++var2) {
                  var6.recolor(this.originalColors[var2], this.replacementColors[var2]);
               }
            }

            return var6;
         }
      }
   }

   public final ActorDefinition morph() {
      int var1 = -1;
      if(this.varbit != -1) {
         VarBits var4;
         int var2 = (var4 = VarBits.bits[this.varbit]).setting;
         int var3 = var4.low;
         var1 = var4.high;
         var1 = Client.BIT_MASKS[var1 - var3];
         var1 &= client.settings[var2] >> var3;
      } else if(this.varp != -1) {
         var1 = client.settings[this.varp];
      }

      return var1 >= 0 && var1 < this.morphisms.length && this.morphisms[var1] != -1?lookup(this.morphisms[var1]):null;
   }

   public static void init(Archive archive) {
      data = new Buffer(archive.getEntry("npc.dat"));
      Buffer var3;
      offsets = new int[count = (var3 = new Buffer(archive.getEntry("npc.idx"))).readUShort()];
      int var1 = 2;

      int var2;
      for(var2 = 0; var2 < count; ++var2) {
         offsets[var2] = var1;
         var1 += var3.readUShort();
      }

      cache = new ActorDefinition[20];

      for(var2 = 0; var2 < 20; ++var2) {
         cache[var2] = new ActorDefinition();
      }

      for(var2 = 0; var2 < count; ++var2) {
         lookup(var2);
      }

   }

   public static void reset() {
      modelCache = null;
      offsets = null;
      cache = null;
      data = null;
   }

   public final Model getAnimatedModel(int primaryFrame, int secondaryFrame, int[] interleaveOrder) {
      if(this.morphisms != null) {
         ActorDefinition var4;
         if((var4 = this.morph()) == null) {
            return null;
         }

         //secondaryFrame = secondaryFrame;
         //primaryFrame = primaryFrame;
         //this = var4;
         return var4.getAnimatedModel(primaryFrame, secondaryFrame, interleaveOrder);
      }

      Model model;
      if((model = (Model)modelCache.get(this.id)) == null) {
         boolean unprepared = false;

         for(int var7 = 0; var7 < this.modelIds.length; ++var7) {
            if(!Model.loaded(this.modelIds[var7])) {
               unprepared = true;
            }
         }

         if(unprepared) {
            return null;
         }

         Model[] var8 = new Model[this.modelIds.length];

         int var9;
         for(var9 = 0; var9 < this.modelIds.length; ++var9) {
            var8[var9] = Model.lookup(this.modelIds[var9]);
         }

         if(var8.length == 1) {
            model = var8[0];
         } else {
            model = new Model(var8.length, var8);
         }

         if(this.originalColors != null) {
            for(var9 = 0; var9 < this.originalColors.length; ++var9) {
               model.recolor(this.originalColors[var9], this.replacementColors[var9]);
            }
         }

         model.createBones();
         model.light(64 + this.lightModifier, 850 + this.shadowModifier, -30, -50, -30, true);
         modelCache.put(model, this.id);
      }

      Model empty;
      (empty = Model.EMPTY_MODEL).a(model, Frame.isInvalid(secondaryFrame) & Frame.isInvalid(primaryFrame));
      if(secondaryFrame != -1 && primaryFrame != -1) {
         empty.applyTransform(interleaveOrder, primaryFrame, secondaryFrame);
      } else if(secondaryFrame != -1) {
         empty.applyTransform(secondaryFrame);
      }

      if(this.scaleXY != 128 || this.scaleZ != 128) {
         empty.scale(this.scaleXY, this.scaleXY, this.scaleZ);
      }

      empty.c();
      empty.faceGroups = null;
      empty.vertexGroups = null;
      if(this.size == 1) {
         empty.y = true;
      }

      return empty;
   }
}
