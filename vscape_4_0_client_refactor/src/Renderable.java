public class Renderable extends CacheableNode {
   VertexNormal[] normals;
   public int modelHeight = 1000;

   public void renderAtPoint(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      Model var10;
      if((var10 = this.getRotatedModel()) != null) {
         this.modelHeight = var10.modelHeight;
         var10.renderAtPoint(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }

   Model getRotatedModel() {
      return null;
   }
}
