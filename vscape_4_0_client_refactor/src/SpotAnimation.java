public final class SpotAnimation {
   public static SpotAnimation[] cache;
   private int id;
   private int model;
   private int animationId = -1;
   public Animation b;
   private final int[] originalColors = new int[6];
   private final int[] replacementColors = new int[6];
   public int breadthScale = 128;
   public int depthScale = 128;
   public int orientation;
   public int modelBrightness;
   public int modelShadow;
   public static Cache models = new Cache(30);

   public static void init(Archive var0) {
      Buffer var7;
      int var1 = (var7 = new Buffer(var0.getEntry("spotanim.dat"))).readUShort();
      if(cache == null) {
         cache = new SpotAnimation[var1];
      }

      label71:
      for(int j = 0; j < var1; ++j) {
         if(cache[j] == null) {
            cache[j] = new SpotAnimation();
         }

         cache[j].id = j;
         SpotAnimation var10000 = cache[j];
         Buffer var3 = var7;
         SpotAnimation var4 = var10000;

         while(true) {
            while(true) {
               int i;
               if((i = var3.readUByte()) == 0) {
                  continue label71;
               }

               if(i == 1) {
                  var4.model = var3.readUShort();
               } else if(i == 2) {
                  var4.animationId = var3.readUShort();
                  if(Animation.animations != null) {
                     var4.b = Animation.animations[var4.animationId];
                  }
               } else if(i == 4) {
                  var4.breadthScale = var3.readUShort();
               } else if(i == 5) {
                  var4.depthScale = var3.readUShort();
               } else if(i == 6) {
                  var4.orientation = var3.readUShort();
               } else if(i == 7) {
                  var4.modelBrightness = var3.readUByte();
               } else if(i == 8) {
                  var4.modelShadow = var3.readUByte();
               } else if(i == 40) {
                  i = var3.readUByte();

                  for(int var6 = 0; var6 < i; ++var6) {
                     var4.originalColors[var6] = var3.readUShort();
                     var4.replacementColors[var6] = var3.readUShort();
                  }
               } else {
                  System.out.println("Error unrecognised spotanim config code: " + i);
               }
            }
         }
      }

   }

   public final Model getModel() {
      Model var1;
      if((var1 = (Model)models.get((long)this.id)) != null) {
         return var1;
      } else if((var1 = Model.lookup(this.model)) == null) {
         return null;
      } else {
         for(int var2 = 0; var2 < 6; ++var2) {
            if(this.originalColors[0] != 0) {
               var1.recolor(this.originalColors[var2], this.replacementColors[var2]);
            }
         }

         models.put(var1, (long)this.id);
         return var1;
      }
   }
}
