final class LinkedList {
   private final Node head = new Node();
   private Node current;

   public LinkedList() {
      this.head.prev = this.head;
      this.head.next = this.head;
   }

   public final void insertBack(Node var1) {
      if(var1.next != null) {
         var1.unlink();
      }

      var1.next = this.head.next;
      var1.prev = this.head;
      var1.next.prev = var1;
      var1.prev.next = var1;
   }

   public final void insertFront(Node var1) {
      if(var1.next != null) {
         var1.unlink();
      }

      var1.next = this.head;
      var1.prev = this.head.prev;
      var1.next.prev = var1;
      var1.prev.next = var1;
   }

   public final Node popTail() {
      Node var1 = this.head.prev;
      if(this.head.prev == this.head) {
         return null;
      } else {
         var1.unlink();
         return var1;
      }
   }

   public final Node getBack() {
      Node var1 = this.head.prev;
      if(this.head.prev == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.prev;
         return var1;
      }
   }

   public final Node getFront() {
      Node var1 = this.head.next;
      if(this.head.next == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

   public final Node getPrevious() {
      Node var1 = this.current;
      if(this.current == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.prev;
         return var1;
      }
   }

   public final Node getNext() {
      Node var1 = this.current;
      if(this.current == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

   public final void clear() {
      if(this.head.prev != this.head) {
         while(true) {
            Node var1 = this.head.prev;
            if(this.head.prev == this.head) {
               return;
            }

            var1.unlink();
         }
      }
   }
}
