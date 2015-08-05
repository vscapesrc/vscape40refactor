final class HashTable {
   private final int size = 1024;
   private final Node[] cache = new Node[1024];

   public HashTable() {
      for(int var1 = 0; var1 < 1024; ++var1) {
         Node var2;
         (var2 = this.cache[var1] = new Node()).prev = var2;
         var2.next = var2;
      }

   }

   public final Node get(long var1) {
      Node var3;
      for(Node var4 = (var3 = this.cache[(int)(var1 & 1023L)]).prev; var4 != var3; var4 = var4.prev) {
         if(var4.nodeID == var1) {
            return var4;
         }
      }

      return null;
   }

   public final void remove(Node var1, long var2) {
      try {
         if(var1.next != null) {
            var1.unlink();
         }

         Node var4 = this.cache[(int)(var2 & 1023L)];
         var1.next = var4.next;
         var1.prev = var4;
         var1.next.prev = var1;
         var1.prev.next = var1;
         var1.nodeID = var2;
      } catch (RuntimeException var5) {
         SignLink.reportError("91499, " + var1 + ", " + var2 + ", 7" + ", " + var5.toString());
         throw new RuntimeException();
      }
   }
}
