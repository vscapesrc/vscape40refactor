package bot.iface;

public interface RenderableObject extends Renderable {
	public int getCurrentFrameId();
	public int[] getMorphisms();
	public int getMorphVariableIndex();
	public int getMorphVarbitIndex();
	public int getCentre();
	public int getHeightEast();
	public int getHeightNorthEast();
	public int getHeightNorth();
	public Animation getAnimation();
	public int getCurrentFrameDuration();
	public int getId();
	public int getType();
	public int getOrientation();
}
