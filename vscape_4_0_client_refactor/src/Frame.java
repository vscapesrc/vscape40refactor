import java.util.Hashtable;

public final class Frame {
   private static Hashtable h = new Hashtable();
   public int duration;
   public Class39 b;
   public int c;
   public int[] d;
   public int[] e;
   public int[] f;
   public int[] g;

   public static void a(byte[] var0, int var1) {
      Buffer var2;
      (var2 = new Buffer(var0)).position = var0.length - 12;
      int var3 = var2.readInt();
      int var4 = var2.readInt();
      int var20 = var2.readInt();
      Buffer var5;
      (var5 = new Buffer(var0)).position = 0;
      var3 = 0 + var3 + 4;
      Buffer var6;
      (var6 = new Buffer(var0)).position = var3;
      var3 += var4;
      Buffer var21;
      (var21 = new Buffer(var0)).position = var3;
      var3 += var20;
      Buffer var18;
      (var18 = new Buffer(var0)).position = var3;
      Class39 var19 = new Class39(var18);
      var20 = var5.readInt();
      int[] var22 = new int[500];
      int[] var7 = new int[500];
      int[] var8 = new int[500];
      int[] var9 = new int[500];

      for(int var10 = 0; var10 < var20; ++var10) {
         int var11 = var5.readInt();
         Frame var12 = new Frame();
         h.put(new Integer((var1 << 16) + var11), var12);
         var12.b = var19;
         var11 = var5.readUByte();
         int var13 = -1;
         int var14 = 0;

         int var15;
         for(var15 = 0; var15 < var11; ++var15) {
            int var16;
            if((var16 = var6.readUByte()) > 0) {
               if(var19.a[var15] != 0) {
                  for(int var17 = var15 - 1; var17 > var13; --var17) {
                     if(var19.a[var17] == 0) {
                        var22[var14] = var17;
                        var7[var14] = 0;
                        var8[var14] = 0;
                        var9[var14] = 0;
                        ++var14;
                        break;
                     }
                  }
               }

               var22[var14] = var15;
               short var23 = 0;
               if(var19.a[var15] == 3) {
                  var23 = 128;
               }

               if((var16 & 1) != 0) {
                  var7[var14] = var21.r();
               } else {
                  var7[var14] = var23;
               }

               if((var16 & 2) != 0) {
                  var8[var14] = var21.r();
               } else {
                  var8[var14] = var23;
               }

               if((var16 & 4) != 0) {
                  var9[var14] = var21.r();
               } else {
                  var9[var14] = var23;
               }

               var13 = var15;
               ++var14;
            }
         }

         var12.c = var14;
         var12.d = new int[var14];
         var12.e = new int[var14];
         var12.f = new int[var14];
         var12.g = new int[var14];

         for(var15 = 0; var15 < var14; ++var15) {
            var12.d[var15] = var22[var15];
            var12.e[var15] = var7[var15];
            var12.f[var15] = var8[var15];
            var12.g[var15] = var9[var15];
         }
      }

   }

   public static void a() {
      h = null;
   }

   public static Frame lookup(int var0) {
      try {
         int var1 = var0 >> 16;
         Frame var3;
         if((var3 = (Frame)h.get(new Integer(var0))) == null) {
            Client.client.resourceProvider.provide(1, var1);
            return null;
         } else {
            return var3;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public static boolean isInvalid(int var0) {
      return var0 == -1;
   }
}
