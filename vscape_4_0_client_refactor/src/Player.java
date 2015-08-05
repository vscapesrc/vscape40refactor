public final class Player extends Actor {
   public int af;
   private long cachedModel = -1L;
   public ActorDefinition al;
   boolean am = false;
   final int[] appearanceColors = new int[5];
   public int ao;
   private int gender;
   public String name;
   static Cache modelCache = new Cache(260);
   public int combatLevel;
   public int headIcon;
   public int at;
   public int au;
   public int av;
   int aw;
   int ax;
   boolean visible = false;
   int az;
   int aA;
   int aB;
   Model playerModel;
   public final int[] appearance = new int[12];
   private long appearanceOffset;
   int aE;
   int aF;
   int aG;
   int aH;
   int totalLevel;
   boolean aJ = false;

   public final Model getRotatedModel() {
      if(!this.visible) {
         return null;
      } else {
         Model var1;
         if((var1 = this.getAnimatedModel()) == null) {
            return null;
         } else {
            super.j = var1.modelHeight;
            var1.y = true;
            if(this.am) {
               return var1;
            } else {
               if(super.u != -1 && super.v != -1) {
                  SpotAnimation var2;
                  Model var3;
                  if((var3 = (var2 = SpotAnimation.cache[super.u]).getModel()) == null) {
                     return null;
                  }

                  (var3 = new Model(true, Frame.isInvalid(super.v), false, var3)).a(0, -super.y, 0);
                  var3.createBones();
                  var3.applyTransform(var2.b.primaryFrames[super.v]);
                  var3.faceGroups = null;
                  var3.vertexGroups = null;
                  if(var2.c != 128 || var2.d != 128) {
                     var3.scale(var2.c, var2.c, var2.d);
                  }

                  var3.light(64 + var2.f, 850 + var2.g, -30, -50, -30, true);
                  Model[] var4 = new Model[]{var1, var3};
                  var1 = new Model(var4);
               }

               if(this.playerModel != null) {
                  if(Client.x >= this.aw) {
                     this.playerModel = null;
                  }

                  if(Client.x >= this.av && Client.x < this.aw) {
                     Model var5 = this.playerModel;
                     this.playerModel.a(this.az - super.X, this.aA - this.ax, this.aB - super.Y);
                     if(super.k == 512) {
                        var5.e();
                        var5.e();
                        var5.e();
                     } else if(super.k == 1024) {
                        var5.e();
                        var5.e();
                     } else if(super.k == 1536) {
                        var5.e();
                     }

                     Model[] var6 = new Model[]{var1, var5};
                     var1 = new Model(var6);
                     if(super.k == 512) {
                        var5.e();
                     } else if(super.k == 1024) {
                        var5.e();
                        var5.e();
                     } else if(super.k == 1536) {
                        var5.e();
                        var5.e();
                        var5.e();
                     }

                     var5.a(super.X - this.az, this.ax - this.aA, super.Y - this.aB);
                  }
               }

               var1.y = true;
               return var1;
            }
         }
      }
   }

   public final void updatePlayer(Buffer var1) {
      var1.position = 0;
      this.gender = var1.readUByte();
      this.headIcon = var1.readUByte();
      this.at = var1.readUByte();
      this.al = null;
      this.ao = 0;

      int var2;
      int var3;
      for(var2 = 0; var2 < 12; ++var2) {
         if((var3 = var1.readUByte()) == 0) {
            this.appearance[var2] = 0;
         } else {
            int var4 = var1.readUByte();
            this.appearance[var2] = (var3 << 8) + var4;
            if(var2 == 0 && this.appearance[0] == '\uffff') {
               this.al = ActorDefinition.lookup(var1.readUShort());
               break;
            }

            if(this.appearance[var2] >= 512 && this.appearance[var2] - 512 < ItemDefinition.count && (var3 = ItemDefinition.fromID(this.appearance[var2] - 512).team) != 0) {
               this.ao = var3;
            }
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         if((var3 = var1.readUByte()) < 0 || var3 >= Client.n[var2].length) {
            var3 = 0;
         }

         this.appearanceColors[var2] = var3;
      }

      super.l = var1.readUShort();
      if(super.l == '\uffff') {
         super.l = -1;
      }

      super.m = var1.readUShort();
      if(super.m == '\uffff') {
         super.m = -1;
      }

      super.ab = var1.readUShort();
      if(super.ab == '\uffff') {
         super.ab = -1;
      }

      super.ac = var1.readUShort();
      if(super.ac == '\uffff') {
         super.ac = -1;
      }

      super.ad = var1.readUShort();
      if(super.ad == '\uffff') {
         super.ad = -1;
      }

      super.ae = var1.readUShort();
      if(super.ae == '\uffff') {
         super.ae = -1;
      }

      super.runAnimationId = var1.readUShort();
      if(super.runAnimationId == '\uffff') {
         super.runAnimationId = -1;
      }

      this.name = StringUtils.formatName(StringUtils.longToName(var1.m()));
      this.combatLevel = var1.readUByte();
      this.totalLevel = var1.readUShort();
      this.aJ = var1.readUByte() == 1;
      this.visible = true;
      this.appearanceOffset = 0L;

      for(var2 = 0; var2 < 12; ++var2) {
         this.appearanceOffset <<= 4;
         if(this.appearance[var2] >= 256) {
            this.appearanceOffset += (long)(this.appearance[var2] - 256);
         }
      }

      if(this.appearance[0] >= 256) {
         this.appearanceOffset += (long)(this.appearance[0] - 256 >> 4);
      }

      if(this.appearance[1] >= 256) {
         this.appearanceOffset += (long)(this.appearance[1] - 256 >> 8);
      }

      for(var2 = 0; var2 < 5; ++var2) {
         this.appearanceOffset <<= 3;
         this.appearanceOffset += (long)this.appearanceColors[var2];
      }

      this.appearanceOffset <<= 1;
      this.appearanceOffset += (long)this.gender;
   }

   public final Model getAnimatedModel() {
      if(this.al != null) {
         int var1 = -1;
         if(super.animation >= 0 && super.D == 0) {
            var1 = Animation.animations[super.animation].primaryFrames[super.B];
         } else if(super.r >= 0) {
            var1 = Animation.animations[super.r].primaryFrames[super.s];
         }

         return this.al.getAnimatedModel(-1, var1, (int[])null);
      } else {
         long var3 = this.appearanceOffset;
         int var5 = -1;
         int var6 = -1;
         int var7 = -1;
         int var8 = -1;
         if(super.animation >= 0 && super.D == 0) {
            Animation var9;
            var5 = (var9 = Animation.animations[super.animation]).primaryFrames[super.B];
            if(super.r >= 0 && super.r != super.l) {
               var6 = Animation.animations[super.r].primaryFrames[super.s];
            }

            if(var9.playerOffhand >= 0) {
               var7 = var9.playerOffhand;
               var3 += (long)(var7 - this.appearance[5] << 40);
            }

            if(var9.playerMainhand >= 0) {
               var8 = var9.playerMainhand;
               var3 += (long)(var8 - this.appearance[3] << 48);
            }
         } else if(super.r >= 0) {
            var5 = Animation.animations[super.r].primaryFrames[super.s];
         }

         int var11;
         int var12;
         ItemDefinition var10000;
         int var13;
         ItemDefinition var14;
         int var15;
         int var17;
         int var16;
         Model var19;
         if((var19 = (Model)modelCache.get(var3)) == null) {
            boolean var10 = false;

            for(var11 = 0; var11 < 12; ++var11) {
               var12 = this.appearance[var11];
               if(var8 >= 0 && var11 == 3) {
                  var12 = var8;
               }

               if(var7 >= 0 && var11 == 5) {
                  var12 = var7;
               }

               if(var12 >= 256 && var12 < 512 && !IdentityKit.b[var12 - 256].a()) {
                  var10 = true;
               }

               if(var12 >= 512) {
                  var10000 = ItemDefinition.fromID(var12 - 512);
                  var13 = this.gender;
                  var14 = var10000;
                  var15 = var10000.primaryMaleModel;
                  var16 = var14.secondaryMaleModel;
                  var17 = var14.tertiaryMaleEquipmentModel;
                  if(var13 == 1) {
                     var15 = var14.primaryFemaleModel;
                     var16 = var14.secondaryFemaleModel;
                     var17 = var14.tertiaryFemaleEquipmentModel;
                  }

                  boolean var29;
                  if(var15 == -1) {
                     var29 = true;
                  } else {
                     boolean var18 = true;
                     if(!Model.b(var15)) {
                        var18 = false;
                     }

                     if(var16 != -1 && !Model.b(var16)) {
                        var18 = false;
                     }

                     if(var17 != -1 && !Model.b(var17)) {
                        var18 = false;
                     }

                     var29 = var18;
                  }

                  if(!var29) {
                     var10 = true;
                  }
               }
            }

            if(var10) {
               if(this.cachedModel != -1L) {
                  var19 = (Model)modelCache.get(this.cachedModel);
               }

               if(var19 == null) {
                  return null;
               }
            }
         }

         if(var19 == null) {
            Model[] var20 = new Model[12];
            var11 = 0;

            for(var12 = 0; var12 < 12; ++var12) {
               int var22 = this.appearance[var12];
               if(var8 >= 0 && var12 == 3) {
                  var22 = var8;
               }

               if(var7 >= 0 && var12 == 5) {
                  var22 = var7;
               }

               Model var24;
               if(var22 >= 256 && var22 < 512 && (var24 = IdentityKit.b[var22 - 256].b()) != null) {
                  var20[var11++] = var24;
               }

               if(var22 >= 512) {
                  var10000 = ItemDefinition.fromID(var22 - 512);
                  var13 = this.gender;
                  var14 = var10000;
                  var15 = var10000.primaryMaleModel;
                  var16 = var14.secondaryMaleModel;
                  var17 = var14.tertiaryMaleEquipmentModel;
                  if(var13 == 1) {
                     var15 = var14.primaryFemaleModel;
                     var16 = var14.secondaryFemaleModel;
                     var17 = var14.tertiaryFemaleEquipmentModel;
                  }

                  Model var28;
                  if(var15 == -1) {
                     var28 = null;
                  } else {
                     Model var27 = Model.lookup(var15);
                     if(var16 != -1) {
                        if(var17 != -1) {
                           var19 = Model.lookup(var16);
                           Model var26 = Model.lookup(var17);
                           Model[] var23 = new Model[]{var27, var19, var26};
                           var27 = new Model(3, var23);
                        } else {
                           var19 = Model.lookup(var16);
                           Model[] var25 = new Model[]{var27, var19};
                           var27 = new Model(2, var25);
                        }
                     }

                     if(var13 == 0 && var14.maleTranslation != 0) {
                        var27.a(0, var14.maleTranslation, 0);
                     }

                     if(var13 == 1 && var14.femaleTranslation != 0) {
                        var27.a(0, var14.femaleTranslation, 0);
                     }

                     if(var14.originalColors != null) {
                        for(var22 = 0; var22 < var14.originalColors.length; ++var22) {
                           var27.recolor(var14.originalColors[var22], var14.replacementColors[var22]);
                        }
                     }

                     var28 = var27;
                  }

                  var24 = var28;
                  if(var28 != null) {
                     var20[var11++] = var24;
                  }
               }
            }

            var19 = new Model(var11, var20);

            for(var12 = 0; var12 < 5; ++var12) {
               if(this.appearanceColors[var12] != 0) {
                  var19.recolor(Client.n[var12][0], Client.n[var12][this.appearanceColors[var12]]);
                  if(var12 == 1) {
                     var19.recolor(Client.A[0], Client.A[this.appearanceColors[var12]]);
                  }
               }
            }

            var19.createBones();
            var19.light(84, 1000, -90, -580, -90, true);
            modelCache.put(var19, var3);
            this.cachedModel = var3;
         }

         if(this.am) {
            return var19;
         } else {
            Model var21;
            (var21 = Model.EMPTY_MODEL).a(var19, Frame.isInvalid(var5) & Frame.isInvalid(var6));
            if(var5 != -1 && var6 != -1) {
               var21.applyTransform(Animation.animations[super.animation].interleaveOrder, var6, var5);
            } else if(var5 != -1) {
               var21.applyTransform(var5);
            }

            var21.c();
            var21.faceGroups = null;
            var21.vertexGroups = null;
            return var21;
         }
      }
   }

   public final boolean isVisible() {
      return this.visible;
   }

   public final Model getHeadModel() {
      if(!this.visible) {
         return null;
      } else if(this.al != null) {
         return this.al.model();
      } else {
         boolean var1 = false;

         int var3;
         int var4;
         ItemDefinition var5;
         int var6;
         int var7;
         ItemDefinition var10000;
         for(int var2 = 0; var2 < 12; ++var2) {
            if((var3 = this.appearance[var2]) >= 256 && var3 < 512 && !IdentityKit.b[var3 - 256].c()) {
               var1 = true;
            }

            if(var3 >= 512) {
               var10000 = ItemDefinition.fromID(var3 - 512);
               var4 = this.gender;
               var5 = var10000;
               var6 = var10000.primaryMaleHeadpiece;
               var7 = var5.secondaryMaleHeadpiece;
               if(var4 == 1) {
                  var6 = var5.primaryFemaleHeadpiece;
                  var7 = var5.secondaryFemaleHeadpiece;
               }

               boolean var12;
               if(var6 == -1) {
                  var12 = true;
               } else {
                  boolean var13 = true;
                  if(!Model.b(var6)) {
                     var13 = false;
                  }

                  if(var7 != -1 && !Model.b(var7)) {
                     var13 = false;
                  }

                  var12 = var13;
               }

               if(!var12) {
                  var1 = true;
               }
            }
         }

         if(var1) {
            return null;
         } else {
            Model[] var11 = new Model[12];
            var3 = 0;

            int var14;
            for(int var8 = 0; var8 < 12; ++var8) {
               Model var15;
               if((var14 = this.appearance[var8]) >= 256 && var14 < 512) {
                  var15 = IdentityKit.b[var14 - 256].d();
                  var11[var3++] = var15;
               }

               if(var14 >= 512) {
                  var10000 = ItemDefinition.fromID(var14 - 512);
                  var4 = this.gender;
                  var5 = var10000;
                  var6 = var10000.primaryMaleHeadpiece;
                  var7 = var5.secondaryMaleHeadpiece;
                  if(var4 == 1) {
                     var6 = var5.primaryFemaleHeadpiece;
                     var7 = var5.secondaryFemaleHeadpiece;
                  }

                  Model var9;
                  if(var6 == -1) {
                     var9 = null;
                  } else {
                     var15 = Model.lookup(var6);
                     if(var7 != -1) {
                        Model var17 = Model.lookup(var7);
                        Model[] var16 = new Model[]{var15, var17};
                        var15 = new Model(2, var16);
                     }

                     if(var5.originalColors != null) {
                        for(var6 = 0; var6 < var5.originalColors.length; ++var6) {
                           var15.recolor(var5.originalColors[var6], var5.replacementColors[var6]);
                        }
                     }

                     var9 = var15;
                  }

                  var15 = var9;
                  if(var9 != null) {
                     var11[var3++] = var15;
                  }
               }
            }

            Model var10 = new Model(var3, var11);

            for(var14 = 0; var14 < 5; ++var14) {
               if(this.appearanceColors[var14] != 0) {
                  var10.recolor(Client.n[var14][0], Client.n[var14][this.appearanceColors[var14]]);
                  if(var14 == 1) {
                     var10.recolor(Client.A[0], Client.A[this.appearanceColors[var14]]);
                  }
               }
            }

            return var10;
         }
      }
   }
}
