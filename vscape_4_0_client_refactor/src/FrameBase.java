public final class FrameBase {
   public final int[] transformationTypes;
   public final int[][] groups;

   public FrameBase(Buffer buffer) {
      int var2 = buffer.readUByte();
      this.transformationTypes = new int[var2];
      this.groups = new int[var2][];

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         this.transformationTypes[var3] = buffer.readUByte();
      }

      for(var3 = 0; var3 < var2; ++var3) {
         this.groups[var3] = new int[buffer.readUByte()];
      }

      for(var3 = 0; var3 < var2; ++var3) {
         for(int var4 = 0; var4 < this.groups[var3].length; ++var4) {
            this.groups[var3][var4] = buffer.readUByte();
         }
      }

   }
}
