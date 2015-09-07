public class Node implements bot.iface.Node {
	public long nodeId;
	public Node prev;
	public Node next;

	public final void unlink() {
		if (this.next != null) {
			this.next.prev = this.prev;
			this.prev.next = this.next;
			this.prev = null;
			this.next = null;
		}

	}

	@Override
	public long getNodeId() {
		return nodeId;
	}

	@Override
	public bot.iface.Node getPrev() {
		return prev;
	}

	@Override
	public bot.iface.Node getNext() {
		// TODO Auto-generated method stub
		return next;
	}
}
