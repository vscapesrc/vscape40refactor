public final class VarBits {
	public static VarBits[] bits;
	public int setting;
	public int low;
	public int high;
	private boolean e = false;

	public static void init(Archive archive) {
		Buffer buffer;
		int count = (buffer = new Buffer(archive.getEntry("varbit.dat"))).readUShort();
		if (bits == null) {
			bits = new VarBits[count];
		}

		for (int i = 0; i < count; ++i) {
			if (bits[i] == null) {
				bits[i] = new VarBits();
			}

			VarBits var10000 = bits[i];
			var10000.decode(buffer);
		}

		if (buffer.position != buffer.buf.length) {
			System.out.println("varbit load mismatch");
		}

	}

	private void decode(Buffer var3) {
		int var5;
		while ((var5 = var3.readUByte()) != 0) {
			if (var5 == 1) {
				setting = var3.readUShort();
				low = var3.readUByte();
				high = var3.readUByte();
			} else if (var5 == 10) {
				var3.readString();
			} else if (var5 == 2) {
				e = true;
			} else if (var5 == 3) {
				var3.readInt();
			} else if (var5 == 4) {
				var3.readInt();
			} else {
				System.out.println("Error unrecognised config code: " + var5);
			}
		}
	}
}
