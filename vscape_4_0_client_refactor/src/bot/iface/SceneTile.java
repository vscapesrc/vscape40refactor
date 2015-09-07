package bot.iface;

public interface SceneTile {
	public int getPositionX();
	public int getPositionY();
	public int getPlane();
	public GroundItem getGroundItem();
	public GameObject[] getGameObjects();
	public int[] getObjectAttributes();
	public SceneTile getSceneTile();
}
