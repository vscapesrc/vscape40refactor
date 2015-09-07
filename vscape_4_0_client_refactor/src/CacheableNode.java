public class CacheableNode extends Node implements bot.iface.CacheableNode {
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

	@Override
	public bot.iface.CacheableNode getPreviousNode() {
		return previousNode;
	}

	@Override
	public bot.iface.CacheableNode getNextNode() {
		// TODO Auto-generated method stub
		return nextNode;
	}
}
