final class StringUtils {
   private static final char[] BASE_37_CHARACTERS = new char[]{' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_'};

   public static long encodeBase37(String string) {
      long var1 = 0L;

      for(int var3 = 0; var3 < string.length() && var3 < 12; ++var3) {
         char var4 = string.charAt(var3);
         var1 *= 38L;
         if(var4 >= 65 && var4 <= 90) {
            var1 += (long)(var4 + 1 - 65);
         } else if(var4 >= 97 && var4 <= 122) {
            var1 += (long)(var4 + 1 - 97);
         } else if(var4 >= 48 && var4 <= 57) {
            var1 += (long)(var4 + 27 - 48);
         } else if(var4 == 95) {
            var1 += 37L;
         }
      }

      while(var1 % 38L == 0L && var1 != 0L) {
         var1 /= 38L;
      }

      return var1;
   }

   public static String decodeBase37(long value) {
      if(value > 0L && value < 9065737908494995456L) {
         try {
            if(value % 38L == 0L) {
               return "invalid_name";
            } else {
               int var2 = 0;

               char[] var3;
               long var4;
               for(var3 = new char[12]; value != 0L; var3[11 - var2++] = BASE_37_CHARACTERS[(int)(var4 - value * 38L)]) {
                  var4 = value;
                  value /= 38L;
               }

               return new String(var3, 12 - var2, var2);
            }
         } catch (RuntimeException var6) {
            SignLink.reportError("81570, " + value + ", -99" + ", " + var6.toString());
            throw new RuntimeException();
         }
      } else {
         return "invalid_name";
      }
   }

   public static long hashSpriteName(String name) {
      name = name.toUpperCase();
      long var1 = 0L;

      for(int var3 = 0; var3 < name.length(); ++var3) {
         var1 = (var1 = var1 * 61L + (long)name.charAt(var3) - 32L) + (var1 >> 56) & 72057594037927935L;
      }

      return var1;
   }

   public static String decodeIp(int ip) {
      return (ip >>> 24) + "." + (ip >> 16 & 255) + "." + (ip >> 8 & 255) + "." + (ip & 255);
   }

   public static String format(String string) {
      if(string.length() <= 0) {
         return string;
      } else {
         char[] var2 = string.toCharArray();

         for(int var1 = 0; var1 < var2.length; ++var1) {
            if((var2[var1] == 95 || var2[var1] == 32) && var1 + 1 < var2.length && var2[var1 + 1] >= 97 && var2[var1 + 1] <= 122) {
               var2[var1 + 1] = (char)(var2[var1 + 1] + 65 - 97);
            }
         }

         if(var2[0] >= 97 && var2[0] <= 122) {
            var2[0] = (char)(var2[0] + 65 - 97);
         }

         return new String(var2);
      }
   }

   public static String getAsterisks(String string) {
      StringBuffer var1 = new StringBuffer();

      for(int var2 = 0; var2 < string.length(); ++var2) {
         var1.append("*");
      }

      return var1.toString();
   }
}
