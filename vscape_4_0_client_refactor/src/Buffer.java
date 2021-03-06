import java.math.BigInteger;

public final class Buffer extends CacheableNode {
   public byte[] payload;
   public int position;
   public int bitPosition;
   private static final int[] BIT_MASKS = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   public IsaacCipher encryption;
   private static int f;
   private static final LinkedList g = new LinkedList();
   private static final BigInteger modulus = new BigInteger("94130513957806052682794161628272400599841345936503488219462937489366634851402663269403341019392952938035443305785420582472779847844299290563251070024353799766276919143898896847910124326394161200189040143313759078993545411210482205786875949408115165575004043804832988167434603363480389106143664094952241287651");
   private static final BigInteger exponent = new BigInteger("65537");

   public static Buffer a() {
      LinkedList var0 = g;
      synchronized(g) {
         Buffer var1 = null;
         if(f > 0) {
            --f;
            var1 = (Buffer)g.popTail();
         }

         if(var1 != null) {
            var1.position = 0;
            return var1;
         }
      }

      Buffer var3;
      (var3 = new Buffer()).position = 0;
      var3.payload = new byte[5000];
      return var3;
   }

   final int b() {
      this.position += 3;
      return (255 & this.payload[this.position - 3] << 16) + (255 & this.payload[this.position - 2] << 8) + (255 & this.payload[this.position - 1]);
   }

   private Buffer() {
   }

   public Buffer(byte[] var1) {
      this.payload = var1;
      this.position = 0;
   }

   public final int c() {
      int var1;
      int var2;
      for(var1 = 0; (var2 = this.s()) == 32767; var1 += 32767) {
         ;
      }

      return var1 + var2;
   }

   public final String d() {
      int var1 = this.position;

      while(this.payload[this.position++] != 0) {
         ;
      }

      return new String(this.payload, var1, this.position - var1 - 1);
   }

   public final void writeOpcode(int var1) {
      this.payload[this.position++] = (byte)(var1 + this.encryption.getNextKey());
   }

   public final void writeByte(int var1) {
      this.payload[this.position++] = (byte)var1;
   }

   public final void writeShort(int var1) {
      this.payload[this.position++] = (byte)(var1 >> 8);
      this.payload[this.position++] = (byte)var1;
   }

   public final void writeLEShort(int var1) {
      this.payload[this.position++] = (byte)var1;
      this.payload[this.position++] = (byte)(var1 >> 8);
   }

   public final void e(int var1) {
      this.payload[this.position++] = -26;
      this.payload[this.position++] = 50;
      this.payload[this.position++] = 113;
   }

   public final void writeInt(int var1) {
      this.payload[this.position++] = (byte)(var1 >> 24);
      this.payload[this.position++] = (byte)(var1 >> 16);
      this.payload[this.position++] = (byte)(var1 >> 8);
      this.payload[this.position++] = (byte)var1;
   }

   public final void writeLEInt(int var1) {
      this.payload[this.position++] = (byte)var1;
      this.payload[this.position++] = (byte)(var1 >> 8);
      this.payload[this.position++] = (byte)(var1 >> 16);
      this.payload[this.position++] = (byte)(var1 >> 24);
   }

   public final void writeLong(long var1) {
         this.payload[this.position++] = (byte)((int)(var1 >> 56));
         this.payload[this.position++] = (byte)((int)(var1 >> 48));
         this.payload[this.position++] = (byte)((int)(var1 >> 40));
         this.payload[this.position++] = (byte)((int)(var1 >> 32));
         this.payload[this.position++] = (byte)((int)(var1 >> 24));
         this.payload[this.position++] = (byte)((int)(var1 >> 16));
         this.payload[this.position++] = (byte)((int)(var1 >> 8));
         this.payload[this.position++] = (byte)((int)var1);
   }

   public final void writeString(String var1) {
      System.arraycopy(var1.getBytes(), 0, this.payload, this.position, var1.length());
      this.position += var1.length();
      this.payload[this.position++] = 10;
   }

   public final void writeBytes(byte[] var1, int var2, int var3) {
      for(var3 = 0; var3 < var2 + 0; ++var3) {
         this.payload[this.position++] = var1[var3];
      }

   }

   public final void h(int var1) {
      this.payload[this.position - var1 - 1] = (byte)var1;
   }

   public final int readUByte() {
      return this.payload[this.position++] & 255;
   }

   public final byte readByte() {
      return this.payload[this.position++];
   }

   public final int readUShort() {
      this.position += 2;
      return ((this.payload[this.position - 2] & 255) << 8) + (this.payload[this.position - 1] & 255);
   }

   public final int readShort() {
      this.position += 2;
      int var1;
      if((var1 = ((this.payload[this.position - 2] & 255) << 8) + (this.payload[this.position - 1] & 255)) > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public final int readTriByte() {
      this.position += 3;
      return ((this.payload[this.position - 3] & 255) << 16) + ((this.payload[this.position - 2] & 255) << 8) + (this.payload[this.position - 1] & 255);
   }

   public final int readInt() {
      this.position += 4;
      return ((this.payload[this.position - 4] & 255) << 24) + ((this.payload[this.position - 3] & 255) << 16) + ((this.payload[this.position - 2] & 255) << 8) + (this.payload[this.position - 1] & 255);
   }

   public final long readQWord() {
      long var1 = (long)this.readInt() & 4294967295L;
      long var3 = (long)this.readInt() & 4294967295L;
      return (var1 << 32) + var3;
   }

   public final String readString() {
      int var1 = this.position;

      while(this.payload[this.position++] != 10) {
         ;
      }

      return new String(this.payload, var1, this.position - var1 - 1);
   }

   public final byte[] readStringBytes() {
      int var1 = this.position;

      while(this.payload[this.position++] != 10) {
         ;
      }

      byte[] var2 = new byte[this.position - var1 - 1];
      System.arraycopy(this.payload, var1, var2, var1 - var1, this.position - 1 - var1);
      return var2;
   }

   public final void readBytes(int var1, int var2, byte[] var3) {
      for(var2 = 0; var2 < var1 + 0; ++var2) {
         var3[var2] = this.payload[this.position++];
      }

   }

   public final void enableBitAccess() {
      this.bitPosition = this.position << 3;
   }

   public final int readBits(int var1) {
      int var2 = this.bitPosition >> 3;
      int var3 = 8 - (this.bitPosition & 7);
      int var4 = 0;

      for(this.bitPosition += var1; var1 > var3; var3 = 8) {
         var4 += (this.payload[var2++] & BIT_MASKS[var3]) << var1 - var3;
         var1 -= var3;
      }

      if(var1 == var3) {
         var4 += this.payload[var2] & BIT_MASKS[var3];
      } else {
         var4 += this.payload[var2] >> var3 - var1 & BIT_MASKS[var1];
      }

      return var4;
   }

   public final void disableBitAccess() {
      this.position = (this.bitPosition + 7) / 8;
   }

   public final int r() {
      return (this.payload[this.position] & 255) < 128?this.readUByte() - 64:this.readUShort() - '쀀';
   }

   public final int s() {
      return (this.payload[this.position] & 255) < 128?this.readUByte():this.readUShort() - '耀';
   }

   public final void doRSA() {
      int var1 = this.position;
      this.position = 0;
      byte[] var2 = new byte[var1];
      this.readBytes(var1, 0, var2);
      byte[] var3 = (new BigInteger(var2)).modPow(exponent, modulus).toByteArray();
      this.position = 0;
      this.writeByte(var3.length);
      this.writeBytes(var3, var3.length, 0);
   }

   public final void writeNegatedByte(int var1) {
      this.payload[this.position++] = (byte)(-var1);
   }

   public final void writeByteS(int var1) {
      this.payload[this.position++] = (byte)(128 - var1);
   }

   public final int readUByteA() {
      return this.payload[this.position++] - 128 & 255;
   }

   public final int readNegUByte() {
      return -this.payload[this.position++] & 255;
   }

   public final int readUByteS() {
      return 128 - this.payload[this.position++] & 255;
   }

   public final byte readNegByte() {
      return (byte)(-this.payload[this.position++]);
   }

   public final void writeLEShort2(int var1) {
      this.payload[this.position++] = (byte)var1;
      this.payload[this.position++] = (byte)(var1 >> 8);
   }

   public final void writeShortA(int var1) {
      this.payload[this.position++] = (byte)(var1 >> 8);
      this.payload[this.position++] = (byte)(var1 + 128);
   }

   public final void writeLEShortA(int var1) {
      this.payload[this.position++] = (byte)(var1 + 128);
      this.payload[this.position++] = (byte)(var1 >> 8);
   }

   public final int y() {
      this.position += 2;
      return ((this.payload[this.position - 1] & 255) << 8) + (this.payload[this.position - 2] & 255);
   }

   public final int readUShortA() {
      this.position += 2;
      return ((this.payload[this.position - 2] & 255) << 8) + (this.payload[this.position - 1] - 128 & 255);
   }

   public final int A() {
      this.position += 2;
      return ((this.payload[this.position - 1] & 255) << 8) + (this.payload[this.position - 2] - 128 & 255);
   }

   public final int B() {
      this.position += 2;
      int var1;
      if((var1 = ((this.payload[this.position - 1] & 255) << 8) + (this.payload[this.position - 2] & 255)) > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public final int C() {
      this.position += 2;
      int var1;
      if((var1 = ((this.payload[this.position - 1] & 255) << 8) + (this.payload[this.position - 2] - 128 & 255)) > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public final int D() {
      this.position += 4;
      return ((this.payload[this.position - 2] & 255) << 24) + ((this.payload[this.position - 1] & 255) << 16) + ((this.payload[this.position - 4] & 255) << 8) + (this.payload[this.position - 3] & 255);
   }

   public final int E() {
      this.position += 4;
      return ((this.payload[this.position - 3] & 255) << 24) + ((this.payload[this.position - 4] & 255) << 16) + ((this.payload[this.position - 1] & 255) << 8) + (this.payload[this.position - 2] & 255);
   }

   public final void writeReverseDataA(int var1, byte[] var2, int var3) {
      for(var1 = var3 + 0 - 1; var1 >= 0; --var1) {
         this.payload[this.position++] = (byte)(var2[var1] + 128);
      }

   }
}
