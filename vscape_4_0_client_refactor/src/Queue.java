final class Queue {
   private final CacheableNode head = new CacheableNode();
   private CacheableNode current;

   public Queue() {
      this.head.previousNode = this.head;
      this.head.nextNode = this.head;
   }

   public final void insertHead(CacheableNode var1) {
      if(var1.nextNode != null) {
         var1.clear();
      }

      var1.nextNode = this.head.nextNode;
      var1.previousNode = this.head;
      var1.nextNode.previousNode = var1;
      var1.previousNode.nextNode = var1;
   }

   public final CacheableNode popTail() {
      CacheableNode var1 = this.head.previousNode;
      if(this.head.previousNode == this.head) {
         return null;
      } else {
         var1.clear();
         return var1;
      }
   }

   public final CacheableNode reverseGetFirst() {
      CacheableNode var1 = this.head.previousNode;
      if(this.head.previousNode == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previousNode;
         return var1;
      }
   }

   public final CacheableNode reverseGetNext() {
      CacheableNode var1 = this.current;
      if(this.current == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previousNode;
         return var1;
      }
   }

   public final int getNodeCount() {
      int var1 = 0;

      for(CacheableNode var2 = this.head.previousNode; var2 != this.head; var2 = var2.previousNode) {
         ++var1;
      }

      return var1;
   }
}
