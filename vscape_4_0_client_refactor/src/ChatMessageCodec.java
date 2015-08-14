final class ChatMessageCodec {
   private static final char[] message = new char[100];
   private static final Buffer buffer = new Buffer(new byte[100]);
   private static final char[] VALID_CHARACTERS = new char[]{' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '\"', '[', ']', '_', '<', '>', '^', '/', '{', '|', '}', '~', '`'};

   public static String decode(int length, Buffer buffer) {
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < length; ++var3) {
         var4 = buffer.readUByte();
         message[var2++] = VALID_CHARACTERS[var4];
      }

      boolean var6 = true;

      for(var4 = 0; var4 < var2; ++var4) {
         char var5 = message[var4];
         if(var6 && var5 >= 97 && var5 <= 122) {
            message[var4] += '￠';
            var6 = false;
         }

         if(var5 == 46 || var5 == 33 || var5 == 63) {
            var6 = true;
         }
      }

      return new String(message, 0, var2);
   }

   public static void encode(String string, Buffer buffer) {
      if(string.length() > 80) {
         string = string.substring(0, 80);
      }

      string = string.toLowerCase();

      for(int var2 = 0; var2 < string.length(); ++var2) {
         char var3 = string.charAt(var2);
         int var4 = 0;

         for(int var5 = 0; var5 < 71; ++var5) {
            if(var3 == VALID_CHARACTERS[var5]) {
               var4 = var5;
               break;
            }
         }

         buffer.writeByte(var4);
      }

   }

   public static String verify(String string) {
      buffer.position = 0;
      encode(string, buffer);
      int var1 = buffer.position;
      buffer.position = 0;
      return decode(var1, buffer);
   }
}
