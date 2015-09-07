public final class SceneTile extends Node implements bot.iface.SceneTile {
	int a;
	final int positionX;
	final int positionY;
	final int plane;
	public SimpleTile simpleTile;
	public ShapedTile shapedTile;
	public Wall wall;
	public WallDecoration wallDecoration;
	public GroundDecoration groundDecoration;
	public GroundItem groundItem;
	int k;
	public final GameObject[] gameObjects = new GameObject[5];
	final int[] objectAttributes = new int[5];
	int n;
	int o;
	boolean p;
	boolean q;
	boolean r;
	int s;
	int t;
	int u;
	int v;
	public SceneTile sceneTile;

	public SceneTile(int z, int x, int y) {
		this.plane = this.a = z;
		this.positionX = x;
		this.positionY = y;
	}

	@Override
	public int getPositionX() {
		return positionX;
	}

	@Override
	public int getPositionY() {
		return positionY;
	}
	
	@Override
	public int getPlane() {
		return plane;
	}

	@Override
	public bot.iface.GroundItem getGroundItem() {
		return groundItem;
	}

	@Override
	public bot.iface.GameObject[] getGameObjects() {
		return gameObjects;
	}

	@Override
	public int[] getObjectAttributes() {
		return objectAttributes;
	}

	@Override
	public bot.iface.SceneTile getSceneTile() {
		return sceneTile;
	}
}
