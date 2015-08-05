import java.io.DataInputStream;
import java.io.IOException;

public final class SpriteGroup {
   public String name;
   public int count;
   public Sprite[] sprites = null;

   public SpriteGroup(String name) {
      this.name = name;
   }

   public final void a(DataInputStream idxStream, DataInputStream datStream) throws IOException {
      this.count = idxStream.readInt();
      this.sprites = new Sprite[this.count];

      for(int i = 0; i < this.count; ++i) {
         byte[] data = new byte[datStream.readInt()];
         datStream.readFully(data);
         this.sprites[i] = new Sprite(data);
      }

   }
}
