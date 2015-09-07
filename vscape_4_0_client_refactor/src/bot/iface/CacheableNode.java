package bot.iface;

public interface CacheableNode extends Node {
	public CacheableNode getPreviousNode();
	public CacheableNode getNextNode();
}
