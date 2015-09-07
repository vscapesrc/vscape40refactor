package bot.iface;

public interface Actor extends Renderable {
	public int[] getPathX();
	public int[] getPathY();
	public int getInteractingEntity();
	public int getRunAnimationId();
	public int getAnimation();
}
