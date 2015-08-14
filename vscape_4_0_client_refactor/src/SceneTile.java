public final class SceneTile extends Node {
   int plane;
   final int positionX;
   final int positionY;
   final int d;
   public SimpleTile simpleTile;
   public ShapedTile shapedTile;
   public Wall wall;
   public WallDecoration wallDecoration;
   public GroundDecoration groundDecoration;
   public GroundItem groundItem;
   int objectCount;
   public final GameObject[] gameObjects = new GameObject[5];
   final int[] objectAttributes = new int[5];
   int attributes;
   int collisionPlane;
   boolean p;
   boolean q;
   boolean r;
   int s;
   int t;
   int u;
   int v;
   public SceneTile sceneTile;

   public SceneTile(int z, int x, int y) {
      this.d = this.plane = z;
      this.positionX = x;
      this.positionY = y;
   }
}
