public final class Class39 {
   public final int[] a;
   public final int[][] b;

   public Class39(Buffer var1) {
      int var2 = var1.readUByte();
      this.a = new int[var2];
      this.b = new int[var2][];

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         this.a[var3] = var1.readUByte();
      }

      for(var3 = 0; var3 < var2; ++var3) {
         this.b[var3] = new int[var1.readUByte()];
      }

      for(var3 = 0; var3 < var2; ++var3) {
         for(int var4 = 0; var4 < this.b[var3].length; ++var4) {
            this.b[var3][var4] = var1.readUByte();
         }
      }

   }
}
