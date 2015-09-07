package bot.iface;

public interface Projectile extends Renderable {
	public int getDelay();
	public int getEndCycle();
	public boolean isMoving();
	public int getStartX();
	public int getStartY();
	public int getStartHeight();
	public int getEndHeight();
	public int getStartSlope();
	public int getStartDistanceFromTarget();
	public int getTargetedEntityId();
	public int getSceneId();
}
