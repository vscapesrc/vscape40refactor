public class CacheableNode extends Node {
	public CacheableNode previousNode;
	CacheableNode nextNode;

	public final void clear() {
		if (this.nextNode != null) {
			this.nextNode.previousNode = this.previousNode;
			this.previousNode.nextNode = this.nextNode;
			this.previousNode = null;
			this.nextNode = null;
		}

	}
}
