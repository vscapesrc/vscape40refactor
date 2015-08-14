public final class IdentityKit {
   public static int count;
   public static IdentityKit[] kits;
   public int part = -1;
   private int[] bodyModels;
   private final int[] originalColors = new int[6];
   private final int[] replacementColors = new int[6];
   private final int[] headModels = new int[]{-1, -1, -1, -1, -1};
   public boolean validStyle = false;

   public static void init(Archive archive) {
      Buffer var6;
      count = (var6 = new Buffer(archive.getEntry("idk.dat"))).readUShort();
      if(kits == null) {
         kits = new IdentityKit[count];
      }

      label67:
      for(int var1 = 0; var1 < count; ++var1) {
         if(kits[var1] == null) {
            kits[var1] = new IdentityKit();
         }

         IdentityKit var10000 = kits[var1];
         Buffer var2 = var6;
         IdentityKit var3 = var10000;

         while(true) {
            while(true) {
               int var4;
               if((var4 = var2.readUByte()) == 0) {
                  continue label67;
               }

               if(var4 == 1) {
                  var3.part = var2.readUByte();
               } else if(var4 == 2) {
                  var4 = var2.readUByte();
                  var3.bodyModels = new int[var4];

                  for(int var5 = 0; var5 < var4; ++var5) {
                     var3.bodyModels[var5] = var2.readUShort();
                  }
               } else if(var4 == 3) {
                  var3.validStyle = true;
               } else if(var4 >= 40 && var4 < 50) {
                  var3.originalColors[var4 - 40] = var2.readUShort();
               } else if(var4 >= 50 && var4 < 60) {
                  var3.replacementColors[var4 - 50] = var2.readUShort();
               } else if(var4 >= 60 && var4 < 70) {
                  var3.headModels[var4 - 60] = var2.readUShort();
               } else {
                  System.out.println("Error unrecognised config code: " + var4);
               }
            }
         }
      }

   }

   public final boolean bodyLoaded() {
      if(this.bodyModels == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.bodyModels.length; ++var2) {
            if(!Model.loaded(this.bodyModels[var2])) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public final Model bodyModel() {
      if(this.bodyModels == null) {
         return null;
      } else {
         Model[] var1 = new Model[this.bodyModels.length];

         for(int var2 = 0; var2 < this.bodyModels.length; ++var2) {
            var1[var2] = Model.lookup(this.bodyModels[var2]);
         }

         Model var4;
         if(var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new Model(var1.length, var1);
         }

         for(int var3 = 0; var3 < 6 && this.originalColors[var3] != 0; ++var3) {
            var4.recolor(this.originalColors[var3], this.replacementColors[var3]);
         }

         return var4;
      }
   }

   public final boolean loaded() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if(this.headModels[var2] != -1 && !Model.loaded(this.headModels[var2])) {
            var1 = false;
         }
      }

      return var1;
   }

   public final Model headModel() {
      Model[] var1 = new Model[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if(this.headModels[var3] != -1) {
            var1[var2++] = Model.lookup(this.headModels[var3]);
         }
      }

      Model var5 = new Model(var2, var1);

      for(int var4 = 0; var4 < 6 && this.originalColors[var4] != 0; ++var4) {
         var5.recolor(this.originalColors[var4], this.replacementColors[var4]);
      }

      return var5;
   }
}
