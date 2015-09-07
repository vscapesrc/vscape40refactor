package bot.iface;

public interface Node {
	public long getNodeId();
	public Node getPrev();
	public Node getNext();
}
