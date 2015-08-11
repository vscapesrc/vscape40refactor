final class MessageCensor {
	private static int[] a;
	private static char[][] b;
	private static byte[][][] c;
	private static char[][] d;
	private static char[][] e;
	private static int[] f;

	static {
		String[] var10000 = new String[] { "cook", "cook\'s", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob",
				"noobs" };
	}

	public static void a(Archive var0) {
		Buffer var1 = new Buffer(var0.getEntry("fragmentsenc.txt"));
		Buffer var2 = new Buffer(var0.getEntry("badenc.txt"));
		Buffer var3 = new Buffer(var0.getEntry("domainenc.txt"));
		Buffer var9 = new Buffer(var0.getEntry("tldlist.txt"));
		Buffer var10000 = var1;
		Buffer var10001 = var2;
		Buffer var10002 = var3;
		var3 = var9;
		var2 = var10002;
		var1 = var10001;
		var9 = var10000;
		int var4;
		b = new char[var4 = var1.readInt()][];
		c = new byte[var4][][];
		byte[][][] var5 = c;
		char[][] var6 = b;
		Buffer var7 = var1;

		for (int var10 = 0; var10 < var6.length; ++var10) {
			char[] var13 = new char[var7.readUByte()];

			for (int var8 = 0; var8 < var13.length; ++var8) {
				var13[var8] = (char) var7.readUByte();
			}

			var6[var10] = var13;
			byte[][] var19 = new byte[var7.readUByte()][2];

			for (var4 = 0; var4 < var19.length; ++var4) {
				var19[var4][0] = (byte) var7.readUByte();
				var19[var4][1] = (byte) var7.readUByte();
			}

			if (var19.length > 0) {
				var5[var10] = var19;
			}
		}

		char[][] var12 = d = new char[var2.readInt()][];
		Buffer var16 = var2;
		char[][] var17 = var12;

		int var14;
		for (var14 = 0; var14 < var17.length; ++var14) {
			char[] var11 = new char[var16.readUByte()];

			for (var4 = 0; var4 < var11.length; ++var4) {
				var11[var4] = (char) var16.readUByte();
			}

			var17[var14] = var11;
		}

		var1 = var9;
		a = new int[var9.readInt()];

		for (var4 = 0; var4 < a.length; ++var4) {
			a[var4] = var1.readUShort();
		}

		var1 = var3;
		e = new char[var4 = var3.readInt()][];
		f = new int[var4];

		for (int var18 = 0; var18 < var4; ++var18) {
			f[var18] = var1.readUByte();
			char[] var15 = new char[var1.readUByte()];

			for (var14 = 0; var14 < var15.length; ++var14) {
				var15[var14] = (char) var1.readUByte();
			}

			e[var18] = var15;
		}

	}
}
