public final class Model extends Renderable {
	private static boolean[] H;
	private static String I = "Cla";
	private static String J = "at Cl";
	private static String K = "nt";
	private boolean L;
	private static int M;
	public static Model EMPTY_MODEL;
	private static int[] N;
	private static int[] O;
	private static int[] P;
	private static int[] Q;
	public int vertices;
	public int[] e;
	public int[] f;
	public int[] g;
	public int faces;
	public int[] i;
	public int[] j;
	public int[] k;
	private int[] R;
	private int[] S;
	private int[] T;
	public int[] l;
	private int[] facePriorities;
	private int[] faceAlphas;
	public int[] faceColors;
	private int priority;
	private int texturedFaces;
	private int[] Y;
	private int[] Z;
	private int[] aa;
	public int n;
	public int o;
	public int p;
	public int q;
	public int r;
	public int s;
	public int t;
	public int u;
	public int v;
	private int[] ab;
	private int[] ac;
	public int[][] vertexGroups;
	public int[][] faceGroups;
	public boolean y;
	VertexNormal[] z;
	private static ModelHeader[] modelHeaders;
	private static Provider ae;
	private static boolean[] af;
	private static boolean[] al;
	private static int[] am;
	private static int[] an;
	private static int[] ao;
	private static int[] ap;
	private static int[] aq;
	private static int[] ar;
	private static int[] as;
	private static int[][] at;
	private static int[] au;
	private static int[][] av;
	private static int[] aw;
	private static int[] ax;
	private static int[] ay;
	private static int[] az;
	private static int[] aA;
	private static int[] aB;
	private static int aC;
	private static int aD;
	private static int aE;
	public static boolean A;
	public static int B;
	public static int C;
	public static int D;
	public static int[] E;
	public static int[] SINE;
	public static int[] COSINE;
	private static int[] rgbTable;
	private static int[] aG;

	static {
		(new StringBuilder()).append(I).append("n Ch").append(J).append("ie").append(K).append(" ");
		EMPTY_MODEL = new Model(true);
		N = new int[2000];
		O = new int[2000];
		P = new int[2000];
		Q = new int[2000];
		af = new boolean[8000];
		al = new boolean[8000];
		am = new int[8000];
		an = new int[8000];
		ao = new int[8000];
		ap = new int[8000];
		aq = new int[8000];
		ar = new int[8000];
		as = new int[1500];
		at = new int[1500][512];
		au = new int[12];
		av = new int[12][2000];
		aw = new int[2000];
		ax = new int[2000];
		ay = new int[12];
		az = new int[10];
		aA = new int[10];
		aB = new int[10];
		E = new int[1000];
		SINE = Rasterizer3D.SINE;
		COSINE = Rasterizer3D.COSINE;
		rgbTable = Rasterizer3D.rgbTable;
		aG = Rasterizer3D.g;
	}

	public static void reset() {
		modelHeaders = null;
		af = null;
		al = null;
		an = null;
		ao = null;
		ap = null;
		aq = null;
		ar = null;
		as = null;
		at = null;
		au = null;
		av = null;
		aw = null;
		ax = null;
		ay = null;
		SINE = null;
		COSINE = null;
		rgbTable = null;
		aG = null;
	}

	private Model(int modelId) {
		byte[] var2;
		int var3;
		int var4;
		Buffer var6;
		Buffer var7;
		Buffer var8;
		Buffer var9;
		Buffer var10;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int var18;
		Model var156;
		boolean var158;
		if ((var2 = modelHeaders[modelId].modelData)[var2.length - 1] == -1 && var2[var2.length - 2] == -1) {
			var156 = this;
			Buffer var159 = new Buffer(var2);
			var6 = new Buffer(var2);
			var7 = new Buffer(var2);
			var8 = new Buffer(var2);
			var9 = new Buffer(var2);
			var10 = new Buffer(var2);
			Buffer var160 = new Buffer(var2);
			var159.position = var2.length - 23;
			var12 = var159.readUShort();
			var13 = var159.readUShort();
			var14 = var159.readUByte();
			ModelHeader var161;
			(var161 = modelHeaders[modelId] = new ModelHeader()).modelData = var2;
			var161.vertices = var12;
			var161.faceCount = var13;
			var161.texturedFaceCount = var14;
			var16 = var159.readUByte();
			boolean var162 = ~(1 & var16) == -2;
			if ((8 & var16) != 8) {
				Model var21 = this;
				Buffer var22 = new Buffer(var2);
				Buffer var23 = new Buffer(var2);
				Buffer var24 = new Buffer(var2);
				Buffer var25 = new Buffer(var2);
				Buffer var26 = new Buffer(var2);
				Buffer var27 = new Buffer(var2);
				Buffer var28 = new Buffer(var2);
				var22.position = var2.length - 23;
				int var29 = var22.readUShort();
				int var30 = var22.readUShort();
				int var31 = var22.readUByte();
				ModelHeader var32;
				(var32 = modelHeaders[modelId] = new ModelHeader()).modelData = var2;
				var32.vertices = var29;
				var32.faceCount = var30;
				var32.texturedFaceCount = var31;
				int var33 = var22.readUByte();
				boolean var34 = ~(1 & var33) == -2;
				int var35 = var22.readUByte();
				int var36 = var22.readUByte();
				int var37 = var22.readUByte();
				int var38 = var22.readUByte();
				int var39 = var22.readUByte();
				int var40 = var22.readUShort();
				int var41 = var22.readUShort();
				int var42 = var22.readUShort();
				int var43 = var22.readUShort();
				int var44 = var22.readUShort();
				int var45 = 0;
				int var46 = 0;
				int var47 = 0;
				byte[] var48 = null;
				byte[] var49 = null;
				byte[] var50 = null;
				byte[] var51 = null;
				byte[] var52 = null;
				byte[] var53 = null;
				byte[] var54 = null;
				int[] var55 = null;
				int[] var56 = null;
				int[] var57 = null;
				short[] var58 = null;
				int var59;
				if (var31 > 0) {
					var49 = new byte[var31];
					var22.position = 0;

					for (var59 = 0; var59 < var31; ++var59) {
						byte var60;
						if ((var60 = var49[var59] = var22.readByte()) == 0) {
							++var45;
						}

						if (var60 > 0 && var60 <= 3) {
							++var46;
						}

						if (var60 == 2) {
							++var47;
						}
					}
				}

				int var61 = var59 = var31 + var29;
				if (var33 == 1) {
					var59 += var30;
				}

				int var62 = var59;
				int var63 = var59 += var30;
				if (var35 == 255) {
					var59 += var30;
				}

				int var64 = var59;
				if (var37 == 1) {
					var59 += var30;
				}

				int var65 = var59;
				if (var39 == 1) {
					var59 += var29;
				}

				int var66 = var59;
				if (var36 == 1) {
					var59 += var30;
				}

				int var67 = var59;
				int var68 = var59 += var43;
				if (var38 == 1) {
					var59 += var30 << 1;
				}

				int var69 = var59;
				int var70 = var59 += var44;
				int var71 = var59 += var30 << 1;
				int var72 = var59 += var40;
				int var73 = var59 += var41;
				int var74 = var59 += var42;
				int var75 = var59 += var45 * 6;
				int var76 = var59 += var46 * 6;
				int var77 = var59 += var46 * 6;
				int var78 = var59 += var46;
				int var79 = var59 + var46;
				int[] var80 = new int[var29];
				int[] var81 = new int[var29];
				int[] var82 = new int[var29];
				int[] var83 = new int[var30];
				int[] var84 = new int[var30];
				int[] var85 = new int[var30];
				this.ab = new int[var29];
				this.l = new int[var30];
				this.facePriorities = new int[var30];
				this.faceAlphas = new int[var30];
				this.ac = new int[var30];
				if (var39 == 1) {
					this.ab = new int[var29];
				}

				if (var34) {
					this.l = new int[var30];
				}

				if (var35 == 255) {
					this.facePriorities = new int[var30];
				}

				if (var36 == 1) {
					this.faceAlphas = new int[var30];
				}

				if (var37 == 1) {
					this.ac = new int[var30];
				}

				if (var38 == 1) {
					var58 = new short[var30];
				}

				if (var38 == 1 && var31 > 0) {
					var48 = new byte[var30];
				}

				int[] var86 = new int[var30];
				int[] var87 = null;
				int[] var88 = null;
				int[] var89 = null;
				if (var31 > 0) {
					var87 = new int[var31];
					var88 = new int[var31];
					var89 = new int[var31];
					if (var46 > 0) {
						var55 = new int[var46];
						var57 = new int[var46];
						var56 = new int[var46];
						var53 = new byte[var46];
						var54 = new byte[var46];
						var51 = new byte[var46];
					}

					if (var47 > 0) {
						var52 = new byte[var47];
						var50 = new byte[var47];
					}
				}

				var22.position = var31;
				var23.position = var71;
				var24.position = var72;
				var25.position = var73;
				var26.position = var65;
				int var90 = 0;
				int var91 = 0;
				int var92 = 0;

				int var93;
				int var95;
				int var94;
				int var96;
				int var97;
				for (var93 = 0; var93 < var29; ++var93) {
					var94 = var22.readUByte();
					var95 = 0;
					if ((var94 & 1) != 0) {
						var95 = var23.r();
					}

					var96 = 0;
					if ((var94 & 2) != 0) {
						var96 = var24.r();
					}

					var97 = 0;
					if ((var94 & 4) != 0) {
						var97 = var25.r();
					}

					var80[var93] = var90 + var95;
					var81[var93] = var91 + var96;
					var82[var93] = var92 + var97;
					var90 = var80[var93];
					var91 = var81[var93];
					var92 = var82[var93];
					if (var21.ab != null) {
						var21.ab[var93] = var26.readUByte();
					}
				}

				var22.position = var70;
				var23.position = var61;
				var24.position = var63;
				var25.position = var66;
				var26.position = var64;
				var27.position = var68;
				var28.position = var69;

				for (var93 = 0; var93 < var30; ++var93) {
					var86[var93] = var22.readUShort();
					if (var33 == 1) {
						var21.l[var93] = var23.readByte();
						if (var21.l[var93] == 2) {
							var86[var93] = '\uffff';
						}

						var21.l[var93] = 0;
					}

					if (var35 == 255) {
						var21.facePriorities[var93] = var24.readByte();
					}

					if (var36 == 1) {
						var21.faceAlphas[var93] = var25.readByte();
						if (var21.faceAlphas[var93] < 0) {
							var21.faceAlphas[var93] += 256;
						}
					}

					if (var37 == 1) {
						var21.ac[var93] = var26.readUByte();
					}

					if (var38 == 1) {
						var58[var93] = (short) (var27.readUShort() - 1);
					}

					if (var48 != null) {
						if (var58[var93] != -1) {
							var48[var93] = (byte) (var28.readUByte() - 1);
						} else {
							var48[var93] = -1;
						}
					}
				}

				var22.position = var67;
				var23.position = var62;
				var93 = 0;
				var94 = 0;
				var95 = 0;
				var96 = 0;

				int var98;
				for (var97 = 0; var97 < var30; ++var97) {
					if ((var98 = var23.readUByte()) == 1) {
						var96 = var93 = var22.r() + var96;
						var96 = var94 = var22.r() + var96;
						var96 = var95 = var22.r() + var96;
						var83[var97] = var93;
						var84[var97] = var94;
						var85[var97] = var95;
					}

					if (var98 == 2) {
						var94 = var95;
						var96 = var95 = var22.r() + var96;
						var83[var97] = var93;
						var84[var97] = var94;
						var85[var97] = var95;
					}

					if (var98 == 3) {
						var93 = var95;
						var96 = var95 = var22.r() + var96;
						var83[var97] = var93;
						var84[var97] = var94;
						var85[var97] = var95;
					}

					if (var98 == 4) {
						int var99 = var93;
						var93 = var94;
						var94 = var99;
						var96 = var95 = var22.r() + var96;
						var83[var97] = var93;
						var84[var97] = var99;
						var85[var97] = var95;
					}
				}

				var22.position = var74;
				var23.position = var75;
				var24.position = var76;
				var25.position = var77;
				var26.position = var78;
				var27.position = var79;

				for (var97 = 0; var97 < var31; ++var97) {
					if ((var98 = var49[var97] & 255) == 0) {
						var87[var97] = var22.readUShort();
						var88[var97] = var22.readUShort();
						var89[var97] = var22.readUShort();
					}

					if (var98 == 1) {
						var87[var97] = var23.readUShort();
						var88[var97] = var23.readUShort();
						var89[var97] = var23.readUShort();
						var55[var97] = var24.readUShort();
						var57[var97] = var24.readUShort();
						var56[var97] = var24.readUShort();
						var53[var97] = var25.readByte();
						var54[var97] = var26.readByte();
						var51[var97] = var27.readByte();
					}

					if (var98 == 2) {
						var87[var97] = var23.readUShort();
						var88[var97] = var23.readUShort();
						var89[var97] = var23.readUShort();
						var55[var97] = var24.readUShort();
						var57[var97] = var24.readUShort();
						var56[var97] = var24.readUShort();
						var53[var97] = var25.readByte();
						var54[var97] = var26.readByte();
						var51[var97] = var27.readByte();
						var52[var97] = var27.readByte();
						var50[var97] = var27.readByte();
					}

					if (var98 == 3) {
						var87[var97] = var23.readUShort();
						var88[var97] = var23.readUShort();
						var89[var97] = var23.readUShort();
						var55[var97] = var24.readUShort();
						var57[var97] = var24.readUShort();
						var56[var97] = var24.readUShort();
						var53[var97] = var25.readByte();
						var54[var97] = var26.readByte();
						var51[var97] = var27.readByte();
					}
				}

				if (var35 != 255) {
					for (var97 = 0; var97 < var30; ++var97) {
						var21.facePriorities[var97] = var35;
					}
				}

				var21.faceColors = var86;
				var21.vertices = var29;
				var21.faces = var30;
				var21.e = var80;
				var21.f = var81;
				var21.g = var82;
				var21.i = var83;
				var21.j = var84;
				var21.k = var85;
			} else {
				var158 = false;
				var159.position -= 7;
				var4 = var159.readUByte();
				var159.position += 6;
				if (var4 == 15) {
					H[modelId] = true;
				}

				var3 = var159.readUByte();
				var15 = var159.readUByte();
				var18 = var159.readUByte();
				int var100 = var159.readUByte();
				int var101 = var159.readUByte();
				int var102 = var159.readUShort();
				int var103 = var159.readUShort();
				int var104 = var159.readUShort();
				int var105 = var159.readUShort();
				int var106 = var159.readUShort();
				int var107 = 0;
				int var108 = 0;
				int var109 = 0;
				byte[] var110 = null;
				byte[] var111 = null;
				byte[] var112 = null;
				byte[] var113 = null;
				byte[] var114 = null;
				byte[] var115 = null;
				byte[] var116 = null;
				int[] var117 = null;
				int[] var118 = null;
				int[] var119 = null;
				short[] var120 = null;
				int var121;
				if (var14 > 0) {
					var111 = new byte[var14];
					var159.position = 0;

					for (var121 = 0; var121 < var14; ++var121) {
						byte var122;
						if ((var122 = var111[var121] = var159.readByte()) == 0) {
							++var107;
						}

						if (var122 > 0 && var122 <= 3) {
							++var108;
						}

						if (var122 == 2) {
							++var109;
						}
					}
				}

				int var123 = var121 = var14 + var12;
				if (var162) {
					var121 += var13;
				}

				if (var16 == 1) {
					var121 += var13;
				}

				int var124 = var121;
				int var125 = var121 += var13;
				if (var3 == 255) {
					var121 += var13;
				}

				int var126 = var121;
				if (var18 == 1) {
					var121 += var13;
				}

				int var127 = var121;
				if (var101 == 1) {
					var121 += var12;
				}

				int var128 = var121;
				if (var15 == 1) {
					var121 += var13;
				}

				int var129 = var121;
				var105 = var121 += var105;
				if (var100 == 1) {
					var121 += var13 << 1;
				}

				int var130 = var121;
				var106 = var121 += var106;
				int var131 = var121 += var13 << 1;
				var102 = var121 += var102;
				var103 = var121 += var103;
				var104 = var121 += var104;
				var107 = var121 += var107 * 6;
				var121 += var108 * 6;
				byte var132 = 6;
				if (var4 != 14) {
					if (var4 >= 15) {
						var132 = 9;
					}
				} else {
					var132 = 7;
				}

				int var133 = var121;
				int var134 = var121 += var132 * var108;
				int var135 = var121 += var108;
				int var136 = var121 + var108;
				int[] var137 = new int[var12];
				int[] var138 = new int[var12];
				int[] var139 = new int[var12];
				int[] var140 = new int[var13];
				int[] var141 = new int[var13];
				int[] var142 = new int[var13];
				this.ab = new int[var12];
				this.l = new int[var13];
				this.facePriorities = new int[var13];
				this.faceAlphas = new int[var13];
				this.ac = new int[var13];
				if (var101 == 1) {
					this.ab = new int[var12];
				}

				if (var162) {
					this.l = new int[var13];
				}

				if (var3 == 255) {
					this.facePriorities = new int[var13];
				}

				if (var15 == 1) {
					this.faceAlphas = new int[var13];
				}

				if (var18 == 1) {
					this.ac = new int[var13];
				}

				if (var100 == 1) {
					var120 = new short[var13];
				}

				if (var100 == 1 && var14 > 0) {
					var110 = new byte[var13];
				}

				int[] var163 = new int[var13];
				int[] var143 = null;
				int[] var144 = null;
				int[] var145 = null;
				if (var14 > 0) {
					var143 = new int[var14];
					var144 = new int[var14];
					var145 = new int[var14];
					if (var108 > 0) {
						var117 = new int[var108];
						var119 = new int[var108];
						var118 = new int[var108];
						var115 = new byte[var108];
						var116 = new byte[var108];
						var113 = new byte[var108];
					}

					if (var109 > 0) {
						var114 = new byte[var109];
						var112 = new byte[var109];
					}
				}

				var159.position = var14;
				var6.position = var131;
				var7.position = var102;
				var8.position = var103;
				var9.position = var127;
				int var146 = 0;
				int var147 = 0;
				int var148 = 0;

				int var152;
				int var153;
				int var149;
				int var150;
				int var151;
				for (var149 = 0; var149 < var12; ++var149) {
					var150 = var159.readUByte();
					var151 = 0;
					if ((var150 & 1) != 0) {
						var151 = var6.r();
					}

					var152 = 0;
					if ((var150 & 2) != 0) {
						var152 = var7.r();
					}

					var153 = 0;
					if ((var150 & 4) != 0) {
						var153 = var8.r();
					}

					var137[var149] = var146 + var151;
					var138[var149] = var147 + var152;
					var139[var149] = var148 + var153;
					var146 = var137[var149];
					var147 = var138[var149];
					var148 = var139[var149];
					if (var156.ab != null) {
						var156.ab[var149] = var9.readUByte();
					}
				}

				var159.position = var106;
				var6.position = var123;
				var7.position = var125;
				var8.position = var128;
				var9.position = var126;
				var10.position = var105;
				var160.position = var130;

				for (var149 = 0; var149 < var13; ++var149) {
					var163[var149] = var159.readUShort();
					if (var16 == 1) {
						var156.l[var149] = var6.readByte();
						if (var156.l[var149] == 2) {
							var163[var149] = '\uffff';
						}

						var156.l[var149] = 0;
					}

					if (var3 == 255) {
						var156.facePriorities[var149] = var7.readByte();
					}

					if (var15 == 1) {
						var156.faceAlphas[var149] = var8.readByte();
						if (var156.faceAlphas[var149] < 0) {
							var156.faceAlphas[var149] += 256;
						}
					}

					if (var18 == 1) {
						var156.ac[var149] = var9.readUByte();
					}

					if (var100 == 1) {
						var120[var149] = (short) (var10.readUShort() - 1);
					}

					if (var110 != null) {
						if (var120[var149] != -1) {
							var110[var149] = (byte) (var160.readUByte() - 1);
						} else {
							var110[var149] = -1;
						}
					}
				}

				var159.position = var129;
				var6.position = var124;
				var149 = 0;
				var150 = 0;
				var151 = 0;
				var152 = 0;

				int var154;
				for (var153 = 0; var153 < var13; ++var153) {
					if ((var154 = var6.readUByte()) == 1) {
						var152 = var149 = var159.r() + var152;
						var152 = var150 = var159.r() + var152;
						var152 = var151 = var159.r() + var152;
						var140[var153] = var149;
						var141[var153] = var150;
						var142[var153] = var151;
					}

					if (var154 == 2) {
						var150 = var151;
						var152 = var151 = var159.r() + var152;
						var140[var153] = var149;
						var141[var153] = var150;
						var142[var153] = var151;
					}

					if (var154 == 3) {
						var149 = var151;
						var152 = var151 = var159.r() + var152;
						var140[var153] = var149;
						var141[var153] = var150;
						var142[var153] = var151;
					}

					if (var154 == 4) {
						int var155 = var149;
						var149 = var150;
						var150 = var155;
						var152 = var151 = var159.r() + var152;
						var140[var153] = var149;
						var141[var153] = var155;
						var142[var153] = var151;
					}
				}

				var159.position = var104;
				var6.position = var107;
				var7.position = var133;
				var8.position = var134;
				var9.position = var135;
				var10.position = var136;

				for (var153 = 0; var153 < var14; ++var153) {
					if ((var154 = var111[var153] & 255) == 0) {
						var143[var153] = var159.readUShort();
						var144[var153] = var159.readUShort();
						var145[var153] = var159.readUShort();
					}

					if (var154 == 1) {
						var143[var153] = var6.readUShort();
						var144[var153] = var6.readUShort();
						var145[var153] = var6.readUShort();
						if (var4 < 15) {
							var117[var153] = var7.readUShort();
							if (var4 >= 14) {
								var119[var153] = var7.b();
							} else {
								var119[var153] = var7.readUShort();
							}

							var118[var153] = var7.readUShort();
						} else {
							var117[var153] = var7.b();
							var119[var153] = var7.b();
							var118[var153] = var7.b();
						}

						var115[var153] = var8.readByte();
						var116[var153] = var9.readByte();
						var113[var153] = var10.readByte();
					}

					if (var154 == 2) {
						var143[var153] = var6.readUShort();
						var144[var153] = var6.readUShort();
						var145[var153] = var6.readUShort();
						if (var4 >= 15) {
							var117[var153] = var7.b();
							var119[var153] = var7.b();
							var118[var153] = var7.b();
						} else {
							var117[var153] = var7.readUShort();
							if (var4 < 14) {
								var119[var153] = var7.readUShort();
							} else {
								var119[var153] = var7.b();
							}

							var118[var153] = var7.readUShort();
						}

						var115[var153] = var8.readByte();
						var116[var153] = var9.readByte();
						var113[var153] = var10.readByte();
						var114[var153] = var10.readByte();
						var112[var153] = var10.readByte();
					}

					if (var154 == 3) {
						var143[var153] = var6.readUShort();
						var144[var153] = var6.readUShort();
						var145[var153] = var6.readUShort();
						if (var4 < 15) {
							var117[var153] = var7.readUShort();
							if (var4 < 14) {
								var119[var153] = var7.readUShort();
							} else {
								var119[var153] = var7.b();
							}

							var118[var153] = var7.readUShort();
						} else {
							var117[var153] = var7.b();
							var119[var153] = var7.b();
							var118[var153] = var7.b();
						}

						var115[var153] = var8.readByte();
						var116[var153] = var9.readByte();
						var113[var153] = var10.readByte();
					}
				}

				if (var3 != 255) {
					for (var153 = 0; var153 < var13; ++var153) {
						var156.facePriorities[var153] = var3;
					}
				}

				var156.faceColors = var163;
				var156.vertices = var12;
				var156.faces = var13;
				var156.e = var137;
				var156.f = var138;
				var156.g = var139;
				var156.i = var140;
				var156.j = var141;
				var156.k = var142;
			}
		} else {
			var156 = this;
			this.L = true;
			this.y = false;
			++M;
			ModelHeader var5 = modelHeaders[modelId];
			this.vertices = var5.vertices;
			this.faces = var5.faceCount;
			this.texturedFaces = var5.texturedFaceCount;
			this.e = new int[this.vertices];
			this.f = new int[this.vertices];
			this.g = new int[this.vertices];
			this.i = new int[this.faces];
			this.j = new int[this.faces];
			this.k = new int[this.faces];
			this.Y = new int[this.texturedFaces];
			this.Z = new int[this.texturedFaces];
			this.aa = new int[this.texturedFaces];
			if (var5.vertexSkinOffset >= 0) {
				this.ab = new int[this.vertices];
			}

			if (var5.texturePointerOffset >= 0) {
				this.l = new int[this.faces];
			}

			if (var5.facePriorityOffset >= 0) {
				this.facePriorities = new int[this.faces];
			} else {
				this.priority = -var5.facePriorityOffset - 1;
			}

			if (var5.faceAlphaOffset >= 0) {
				this.faceAlphas = new int[this.faces];
			}

			if (var5.faceSkinOffset >= 0) {
				this.ac = new int[this.faces];
			}

			this.faceColors = new int[this.faces];
			(var6 = new Buffer(var5.modelData)).position = 0;
			(var7 = new Buffer(var5.modelData)).position = var5.xDataOffset;
			(var8 = new Buffer(var5.modelData)).position = var5.yDataOffset;
			(var9 = new Buffer(var5.modelData)).position = var5.zDataOffset;
			(var10 = new Buffer(var5.modelData)).position = var5.vertexSkinOffset;
			int var11 = 0;
			var12 = 0;
			var13 = 0;

			int var17;
			for (var14 = 0; var14 < var156.vertices; ++var14) {
				var15 = var6.readUByte();
				var16 = 0;
				if ((var15 & 1) != 0) {
					var16 = var7.r();
				}

				var17 = 0;
				if ((var15 & 2) != 0) {
					var17 = var8.r();
				}

				var18 = 0;
				if ((var15 & 4) != 0) {
					var18 = var9.r();
				}

				var156.e[var14] = var11 + var16;
				var156.f[var14] = var12 + var17;
				var156.g[var14] = var13 + var18;
				var11 = var156.e[var14];
				var12 = var156.f[var14];
				var13 = var156.g[var14];
				if (var156.ab != null) {
					var156.ab[var14] = var10.readUByte();
				}
			}

			var6.position = var5.colorDataOffset;
			var7.position = var5.texturePointerOffset;
			var8.position = var5.facePriorityOffset;
			var9.position = var5.faceAlphaOffset;
			var10.position = var5.faceSkinOffset;

			for (var14 = 0; var14 < var156.faces; ++var14) {
				var156.faceColors[var14] = var6.readUShort();
				if (var156.l != null) {
					var156.l[var14] = var7.readUByte();
				}

				if (var156.facePriorities != null) {
					var156.facePriorities[var14] = var8.readUByte();
				}

				if (var156.faceAlphas != null) {
					var156.faceAlphas[var14] = var9.readUByte();
				}

				if (var156.ac != null) {
					var156.ac[var14] = var10.readUByte();
				}
			}

			var6.position = var5.faceDataOffset;
			var7.position = var5.faceTypeOffset;
			var14 = 0;
			var15 = 0;
			var16 = 0;
			var17 = 0;

			for (var18 = 0; var18 < var156.faces; ++var18) {
				if ((var4 = var7.readUByte()) == 1) {
					var17 = var14 = var6.r() + var17;
					var17 = var15 = var6.r() + var17;
					var17 = var16 = var6.r() + var17;
					var156.i[var18] = var14;
					var156.j[var18] = var15;
					var156.k[var18] = var16;
				}

				if (var4 == 2) {
					var15 = var16;
					var17 = var16 = var6.r() + var17;
					var156.i[var18] = var14;
					var156.j[var18] = var15;
					var156.k[var18] = var16;
				}

				if (var4 == 3) {
					var14 = var16;
					var17 = var16 = var6.r() + var17;
					var156.i[var18] = var14;
					var156.j[var18] = var15;
					var156.k[var18] = var16;
				}

				if (var4 == 4) {
					var3 = var14;
					var14 = var15;
					var15 = var3;
					var17 = var16 = var6.r() + var17;
					var156.i[var18] = var14;
					var156.j[var18] = var3;
					var156.k[var18] = var16;
				}
			}

			var6.position = var5.uvMapFaceOffset;

			for (var18 = 0; var18 < var156.texturedFaces; ++var18) {
				var156.Y[var18] = var6.readUShort();
				var156.Z[var18] = var6.readUShort();
				var156.aa[var18] = var6.readUShort();
			}
		}

		if (H[modelId]) {
			var158 = true;
			var156 = this;

			for (var3 = 0; var3 < var156.vertices; ++var3) {
				var156.e[var3] /= 4;
				var156.f[var3] /= 4;
				var156.g[var3] /= 4;
			}

			if (this.facePriorities != null) {
				for (modelId = 0; modelId < this.facePriorities.length; ++modelId) {
					this.facePriorities[modelId] = 10;
				}
			}
		}

	}

	public static void load(byte[] data, int id) {
		try {
			if (data == null) {
				ModelHeader header;
				(header = modelHeaders[id] = new ModelHeader()).vertices = 0;
				header.faceCount = 0;
				header.texturedFaceCount = 0;
			} else {
				Buffer buffer;
				(buffer = new Buffer(data)).position = data.length - 18;
				ModelHeader header;
				(header = modelHeaders[id] = new ModelHeader()).modelData = data;
				header.vertices = buffer.readUShort();
				header.faceCount = buffer.readUShort();
				header.texturedFaceCount = buffer.readUByte();
				int useTextures = buffer.readUByte();
				int useFacePriority = buffer.readUByte();
				int useTransparancy = buffer.readUByte();
				int useFaceSkinning = buffer.readUByte();
				int useVertexSkinning = buffer.readUByte();
				int xDataOffset = buffer.readUShort();
				int yDataOffset = buffer.readUShort();
				buffer.readUShort();
				int faceDataLength = buffer.readUShort();
				header.vertexDirectionOffset = 0;
				int offset = 0 + header.vertices;
				header.faceTypeOffset = offset;
				offset += header.faceCount;
				header.facePriorityOffset = offset;
				if (useFacePriority == 255) {
					offset += header.faceCount;
				} else {
					header.facePriorityOffset = -useFacePriority - 1;
				}

				header.faceSkinOffset = offset;
				if (useFaceSkinning == 1) {
					offset += header.faceCount;
				} else {
					header.faceSkinOffset = -1;
				}

				header.texturePointerOffset = offset;
				if (useTextures == 1) {
					offset += header.faceCount;
				} else {
					header.texturePointerOffset = -1;
				}

				header.vertexSkinOffset = offset;
				if (useVertexSkinning == 1) {
					offset += header.vertices;
				} else {
					header.vertexSkinOffset = -1;
				}

				header.faceAlphaOffset = offset;
				if (useTransparancy == 1) {
					offset += header.faceCount;
				} else {
					header.faceAlphaOffset = -1;
				}

				header.faceDataOffset = offset;
				offset += faceDataLength;
				header.colorDataOffset = offset;
				offset += header.faceCount << 1;
				header.uvMapFaceOffset = offset;
				offset += header.texturedFaceCount * 6;
				header.xDataOffset = offset;
				offset += xDataOffset;
				header.yDataOffset = offset;
				offset += yDataOffset;
				header.zDataOffset = offset;
			}
		} catch (Exception var10) {
			;
		}
	}

	public static void a(Provider var0) {
		modelHeaders = new ModelHeader[80000];
		H = new boolean[100000];
		ae = var0;
	}

	public static Model lookup(int var0) {
		if (modelHeaders == null) {
			return null;
		} else if (modelHeaders[var0] == null) {
			ae.provide(var0);
			return null;
		} else {
			return new Model(var0);
		}
	}

	public static boolean loaded(int var0) {
		if (modelHeaders == null) {
			return false;
		} else if (modelHeaders[var0] == null) {
			ae.provide(var0);
			return false;
		} else {
			return true;
		}
	}

	private Model(boolean var1) {
		this.L = true;
		this.y = false;
	}

	public Model(int modelCount, Model[] models) {
		this.L = true;
		this.y = false;
		++M;
		boolean hasTexturePoints = false;
		boolean hasFacePriorities = false;
		boolean hasFaceAlphas = false;
		boolean hasFaceColors = false;
		this.vertices = 0;
		this.faces = 0;
		this.texturedFaces = 0;
		this.priority = -1;

		int index;
		for (index = 0; index < modelCount; ++index) {
			Model model;
			if ((model = models[index]) != null) {
				this.vertices += model.vertices;
				this.faces += model.faces;
				this.texturedFaces += model.texturedFaces;
				hasTexturePoints |= model.l != null;
				if (model.facePriorities != null) {
					hasFacePriorities = true;
				} else {
					if (this.priority == -1) {
						this.priority = model.priority;
					}

					if (this.priority != model.priority) {
						hasFacePriorities = true;
					}
				}

				hasFaceAlphas |= model.faceAlphas != null;
				hasFaceColors |= model.ac != null;
			}
		}

		this.e = new int[this.vertices];
		this.f = new int[this.vertices];
		this.g = new int[this.vertices];
		this.ab = new int[this.vertices];
		this.i = new int[this.faces];
		this.j = new int[this.faces];
		this.k = new int[this.faces];
		this.Y = new int[this.texturedFaces];
		this.Z = new int[this.texturedFaces];
		this.aa = new int[this.texturedFaces];
		if (hasTexturePoints) {
			this.l = new int[this.faces];
		}

		if (hasFacePriorities) {
			this.facePriorities = new int[this.faces];
		}

		if (hasFaceAlphas) {
			this.faceAlphas = new int[this.faces];
		}

		if (hasFaceColors) {
			this.ac = new int[this.faces];
		}

		this.faceColors = new int[this.faces];
		this.vertices = 0;
		this.faces = 0;
		this.texturedFaces = 0;
		index = 0;

		for (int var12 = 0; var12 < modelCount; ++var12) {
			Model var9;
			if ((var9 = models[var12]) != null) {
				int var10;
				for (var10 = 0; var10 < var9.faces; ++var10) {
					if (hasTexturePoints) {
						if (var9.l == null) {
							this.l[this.faces] = 0;
						} else {
							int var11;
							if (((var11 = var9.l[var10]) & 2) == 2) {
								var11 += index << 2;
							}

							this.l[this.faces] = var11;
						}
					}

					if (hasFacePriorities) {
						if (var9.facePriorities == null) {
							this.facePriorities[this.faces] = var9.priority;
						} else {
							this.facePriorities[this.faces] = var9.facePriorities[var10];
						}
					}

					if (hasFaceAlphas) {
						if (var9.faceAlphas == null) {
							this.faceAlphas[this.faces] = 0;
						} else {
							this.faceAlphas[this.faces] = var9.faceAlphas[var10];
						}
					}

					if (hasFaceColors && var9.ac != null) {
						this.ac[this.faces] = var9.ac[var10];
					}

					this.faceColors[this.faces] = var9.faceColors[var10];
					this.i[this.faces] = this.a(var9, var9.i[var10]);
					this.j[this.faces] = this.a(var9, var9.j[var10]);
					this.k[this.faces] = this.a(var9, var9.k[var10]);
					++this.faces;
				}

				for (var10 = 0; var10 < var9.texturedFaces; ++var10) {
					this.Y[this.texturedFaces] = this.a(var9, var9.Y[var10]);
					this.Z[this.texturedFaces] = this.a(var9, var9.Z[var10]);
					this.aa[this.texturedFaces] = this.a(var9, var9.aa[var10]);
					++this.texturedFaces;
				}

				index += var9.texturedFaces;
			}
		}

	}

	public Model(Model[] var1) {
		this.L = true;
		this.y = false;
		++M;
		boolean var2 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		this.vertices = 0;
		this.faces = 0;
		this.texturedFaces = 0;
		this.priority = -1;

		int var6;
		for (var6 = 0; var6 < 2; ++var6) {
			Model var7;
			if ((var7 = var1[var6]) != null) {
				this.vertices += var7.vertices;
				this.faces += var7.faces;
				this.texturedFaces += var7.texturedFaces;
				var2 |= var7.l != null;
				if (var7.facePriorities != null) {
					var3 = true;
				} else {
					if (this.priority == -1) {
						this.priority = var7.priority;
					}

					if (this.priority != var7.priority) {
						var3 = true;
					}
				}

				var4 |= var7.faceAlphas != null;
				var5 |= var7.faceColors != null;
			}
		}

		this.e = new int[this.vertices];
		this.f = new int[this.vertices];
		this.g = new int[this.vertices];
		this.i = new int[this.faces];
		this.j = new int[this.faces];
		this.k = new int[this.faces];
		this.R = new int[this.faces];
		this.S = new int[this.faces];
		this.T = new int[this.faces];
		this.Y = new int[this.texturedFaces];
		this.Z = new int[this.texturedFaces];
		this.aa = new int[this.texturedFaces];
		if (var2) {
			this.l = new int[this.faces];
		}

		if (var3) {
			this.facePriorities = new int[this.faces];
		}

		if (var4) {
			this.faceAlphas = new int[this.faces];
		}

		if (var5) {
			this.faceColors = new int[this.faces];
		}

		this.vertices = 0;
		this.faces = 0;
		this.texturedFaces = 0;
		var6 = 0;

		for (int var12 = 0; var12 < 2; ++var12) {
			Model var8;
			if ((var8 = var1[var12]) != null) {
				int var9 = this.vertices;

				int var10;
				for (var10 = 0; var10 < var8.vertices; ++var10) {
					this.e[this.vertices] = var8.e[var10];
					this.f[this.vertices] = var8.f[var10];
					this.g[this.vertices] = var8.g[var10];
					++this.vertices;
				}

				for (var10 = 0; var10 < var8.faces; ++var10) {
					this.i[this.faces] = var8.i[var10] + var9;
					this.j[this.faces] = var8.j[var10] + var9;
					this.k[this.faces] = var8.k[var10] + var9;
					this.R[this.faces] = var8.R[var10];
					this.S[this.faces] = var8.S[var10];
					this.T[this.faces] = var8.T[var10];
					if (var2) {
						if (var8.l == null) {
							this.l[this.faces] = 0;
						} else {
							int var11;
							if (((var11 = var8.l[var10]) & 2) == 2) {
								var11 += var6 << 2;
							}

							this.l[this.faces] = var11;
						}
					}

					if (var3) {
						if (var8.facePriorities == null) {
							this.facePriorities[this.faces] = var8.priority;
						} else {
							this.facePriorities[this.faces] = var8.facePriorities[var10];
						}
					}

					if (var4) {
						if (var8.faceAlphas == null) {
							this.faceAlphas[this.faces] = 0;
						} else {
							this.faceAlphas[this.faces] = var8.faceAlphas[var10];
						}
					}

					if (var5 && var8.faceColors != null) {
						this.faceColors[this.faces] = var8.faceColors[var10];
					}

					++this.faces;
				}

				for (var10 = 0; var10 < var8.texturedFaces; ++var10) {
					this.Y[this.texturedFaces] = var8.Y[var10] + var9;
					this.Z[this.texturedFaces] = var8.Z[var10] + var9;
					this.aa[this.texturedFaces] = var8.aa[var10] + var9;
					++this.texturedFaces;
				}

				var6 += var8.texturedFaces;
			}
		}

		this.c();
	}

	public Model(boolean var1, boolean var2, boolean var3, Model var4) {
		this.L = true;
		this.y = false;
		++M;
		this.vertices = var4.vertices;
		this.faces = var4.faces;
		this.texturedFaces = var4.texturedFaces;
		int var5;
		if (var3) {
			this.e = var4.e;
			this.f = var4.f;
			this.g = var4.g;
		} else {
			this.e = new int[this.vertices];
			this.f = new int[this.vertices];
			this.g = new int[this.vertices];

			for (var5 = 0; var5 < this.vertices; ++var5) {
				this.e[var5] = var4.e[var5];
				this.f[var5] = var4.f[var5];
				this.g[var5] = var4.g[var5];
			}
		}

		if (var1) {
			this.faceColors = var4.faceColors;
		} else {
			this.faceColors = new int[this.faces];

			for (var5 = 0; var5 < this.faces; ++var5) {
				this.faceColors[var5] = var4.faceColors[var5];
			}
		}

		if (var2) {
			this.faceAlphas = var4.faceAlphas;
		} else {
			this.faceAlphas = new int[this.faces];
			if (var4.faceAlphas == null) {
				for (var5 = 0; var5 < this.faces; ++var5) {
					this.faceAlphas[var5] = 0;
				}
			} else {
				for (var5 = 0; var5 < this.faces; ++var5) {
					this.faceAlphas[var5] = var4.faceAlphas[var5];
				}
			}
		}

		this.ab = var4.ab;
		this.ac = var4.ac;
		this.l = var4.l;
		this.i = var4.i;
		this.j = var4.j;
		this.k = var4.k;
		this.facePriorities = var4.facePriorities;
		this.priority = var4.priority;
		this.Y = var4.Y;
		this.Z = var4.Z;
		this.aa = var4.aa;
	}

	public Model(boolean var1, boolean var2, Model var3) {
		this.L = true;
		this.y = false;
		++M;
		this.vertices = var3.vertices;
		this.faces = var3.faces;
		this.texturedFaces = var3.texturedFaces;
		int var5;
		if (var1) {
			this.f = new int[this.vertices];

			for (var5 = 0; var5 < this.vertices; ++var5) {
				this.f[var5] = var3.f[var5];
			}
		} else {
			this.f = var3.f;
		}

		if (var2) {
			this.R = new int[this.faces];
			this.S = new int[this.faces];
			this.T = new int[this.faces];

			for (var5 = 0; var5 < this.faces; ++var5) {
				this.R[var5] = var3.R[var5];
				this.S[var5] = var3.S[var5];
				this.T[var5] = var3.T[var5];
			}

			this.l = new int[this.faces];
			if (var3.l == null) {
				for (var5 = 0; var5 < this.faces; ++var5) {
					this.l[var5] = 0;
				}
			} else {
				for (var5 = 0; var5 < this.faces; ++var5) {
					this.l[var5] = var3.l[var5];
				}
			}

			super.normals = new VertexNormal[this.vertices];

			for (var5 = 0; var5 < this.vertices; ++var5) {
				VertexNormal var6 = super.normals[var5] = new VertexNormal();
				VertexNormal var4 = var3.normals[var5];
				var6.x = var4.x;
				var6.y = var4.y;
				var6.z = var4.z;
				var6.faces = var4.faces;
			}

			this.z = var3.z;
		} else {
			this.R = var3.R;
			this.S = var3.S;
			this.T = var3.T;
			this.l = var3.l;
		}

		this.e = var3.e;
		this.g = var3.g;
		this.faceColors = var3.faceColors;
		this.faceAlphas = var3.faceAlphas;
		this.facePriorities = var3.facePriorities;
		this.priority = var3.priority;
		this.i = var3.i;
		this.j = var3.j;
		this.k = var3.k;
		this.Y = var3.Y;
		this.Z = var3.Z;
		this.aa = var3.aa;
		super.modelHeight = var3.modelHeight;
		this.r = var3.r;
		this.u = var3.u;
		this.t = var3.t;
		this.n = var3.n;
		this.p = var3.p;
		this.q = var3.q;
		this.o = var3.o;
	}

	public final void a(Model var1, boolean var2) {
		this.vertices = var1.vertices;
		this.faces = var1.faces;
		this.texturedFaces = var1.texturedFaces;
		if (N.length < this.vertices) {
			N = new int[this.vertices + 10000];
			O = new int[this.vertices + 10000];
			P = new int[this.vertices + 10000];
		}

		this.e = N;
		this.f = O;
		this.g = P;

		int var3;
		for (var3 = 0; var3 < this.vertices; ++var3) {
			this.e[var3] = var1.e[var3];
			this.f[var3] = var1.f[var3];
			this.g[var3] = var1.g[var3];
		}

		if (var2) {
			this.faceAlphas = var1.faceAlphas;
		} else {
			if (Q.length < this.faces) {
				Q = new int[this.faces + 100];
			}

			this.faceAlphas = Q;
			if (var1.faceAlphas == null) {
				for (var3 = 0; var3 < this.faces; ++var3) {
					this.faceAlphas[var3] = 0;
				}
			} else {
				for (var3 = 0; var3 < this.faces; ++var3) {
					this.faceAlphas[var3] = var1.faceAlphas[var3];
				}
			}
		}

		this.l = var1.l;
		this.faceColors = var1.faceColors;
		this.facePriorities = var1.facePriorities;
		this.priority = var1.priority;
		this.faceGroups = var1.faceGroups;
		this.vertexGroups = var1.vertexGroups;
		this.i = var1.i;
		this.j = var1.j;
		this.k = var1.k;
		this.R = var1.R;
		this.S = var1.S;
		this.T = var1.T;
		this.Y = var1.Y;
		this.Z = var1.Z;
		this.aa = var1.aa;
	}

	private final int a(Model var1, int var2) {
		int var3 = -1;
		int var4 = var1.e[var2];
		int var5 = var1.f[var2];
		int var6 = var1.g[var2];

		for (int var7 = 0; var7 < this.vertices; ++var7) {
			if (var4 == this.e[var7] && var5 == this.f[var7] && var6 == this.g[var7]) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			this.e[this.vertices] = var4;
			this.f[this.vertices] = var5;
			this.g[this.vertices] = var6;
			if (var1.ab != null) {
				this.ab[this.vertices] = var1.ab[var2];
			}

			var3 = this.vertices++;
		}

		return var3;
	}

	public final void c() {
		super.modelHeight = 0;
		this.r = 0;
		this.s = 0;

		for (int var1 = 0; var1 < this.vertices; ++var1) {
			int var2 = this.e[var1];
			int var3 = this.f[var1];
			int var4 = this.g[var1];
			if (-var3 > super.modelHeight) {
				super.modelHeight = -var3;
			}

			if (var3 > this.s) {
				this.s = var3;
			}

			if ((var2 = var2 * var2 + var4 * var4) > this.r) {
				this.r = var2;
			}
		}

		this.r = (int) (Math.sqrt((double) this.r) + 0.99D);
		this.u = (int) (Math.sqrt((double) (this.r * this.r + super.modelHeight * super.modelHeight)) + 0.99D);
		this.t = this.u + (int) (Math.sqrt((double) (this.r * this.r + this.s * this.s)) + 0.99D);
	}

	public final void createBones() {
		int[] var1;
		int var2;
		int var3;
		int var4;
		if (this.ab != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.vertices; ++var3) {
				var4 = this.ab[var3];
				++var1[var4];
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.vertexGroups = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.vertexGroups[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.vertices; this.vertexGroups[var4][var1[var4]++] = var3++) {
				var4 = this.ab[var3];
			}

			this.ab = null;
		}

		if (this.ac != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.faces; ++var3) {
				var4 = this.ac[var3];
				++var1[var4];
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.faceGroups = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.faceGroups[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.faces; this.faceGroups[var4][var1[var4]++] = var3++) {
				var4 = this.ac[var3];
			}

			this.ac = null;
		}

	}

	public final void applyTransform(int var1) {
		if (this.vertexGroups != null) {
			if (var1 != -1) {
				Frame var5;
				if ((var5 = Frame.lookup(var1)) != null) {
					Class39 var2 = var5.b;
					aC = 0;
					aD = 0;
					aE = 0;

					for (int var3 = 0; var3 < var5.c; ++var3) {
						int var4 = var5.d[var3];
						this.a(var2.a[var4], var2.b[var4], var5.e[var3], var5.f[var3], var5.g[var3]);
					}

				}
			}
		}
	}

	public final void applyTransform(int[] var1, int var2, int var3) {
		if (var3 != -1) {
			if (var1 != null && var2 != -1) {
				Frame var4;
				if ((var4 = Frame.lookup(var3)) != null) {
					Frame var9;
					if ((var9 = Frame.lookup(var2)) == null) {
						this.applyTransform(var3);
					} else {
						Class39 var10 = var4.b;
						aC = 0;
						aD = 0;
						aE = 0;
						byte var5 = 0;
						int var11 = var5 + 1;
						int var6 = var1[0];

						int var7;
						int var8;
						for (var7 = 0; var7 < var4.c; ++var7) {
							for (var8 = var4.d[var7]; var8 > var6; var6 = var1[var11++]) {
								;
							}

							if (var8 != var6 || var10.a[var8] == 0) {
								this.a(var10.a[var8], var10.b[var8], var4.e[var7], var4.f[var7], var4.g[var7]);
							}
						}

						aC = 0;
						aD = 0;
						aE = 0;
						var5 = 0;
						var11 = var5 + 1;
						var6 = var1[0];

						for (var7 = 0; var7 < var9.c; ++var7) {
							for (var8 = var9.d[var7]; var8 > var6; var6 = var1[var11++]) {
								;
							}

							if (var8 == var6 || var10.a[var8] == 0) {
								this.a(var10.a[var8], var10.b[var8], var9.e[var7], var9.f[var7], var9.g[var7]);
							}
						}

					}
				}
			} else {
				this.applyTransform(var3);
			}
		}
	}

	private void a(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var10;
		int var11;
		if (var1 == 0) {
			var1 = 0;
			aC = 0;
			aD = 0;
			aE = 0;

			for (var7 = 0; var7 < var6; ++var7) {
				int var15;
				if ((var15 = var2[var7]) < this.vertexGroups.length) {
					int[] var16 = this.vertexGroups[var15];

					for (var10 = 0; var10 < var16.length; ++var10) {
						var11 = var16[var10];
						aC += this.e[var11];
						aD += this.f[var11];
						aE += this.g[var11];
						++var1;
					}
				}
			}

			if (var1 > 0) {
				aC = aC / var1 + var3;
				aD = aD / var1 + var4;
				aE = aE / var1 + var5;
			} else {
				aC = var3;
				aD = var4;
				aE = var5;
			}
		} else {
			int[] var8;
			int var9;
			if (var1 == 1) {
				for (var1 = 0; var1 < var6; ++var1) {
					if ((var7 = var2[var1]) < this.vertexGroups.length) {
						var8 = this.vertexGroups[var7];

						for (var9 = 0; var9 < var8.length; ++var9) {
							var10 = var8[var9];
							this.e[var10] += var3;
							this.f[var10] += var4;
							this.g[var10] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var1 = 0; var1 < var6; ++var1) {
					if ((var7 = var2[var1]) < this.vertexGroups.length) {
						var8 = this.vertexGroups[var7];

						for (var9 = 0; var9 < var8.length; ++var9) {
							var10 = var8[var9];
							this.e[var10] -= aC;
							this.f[var10] -= aD;
							this.g[var10] -= aE;
							var11 = (var3 & 255) << 3;
							var7 = (var4 & 255) << 3;
							int var12;
							int var13;
							int var14;
							if ((var12 = (var5 & 255) << 3) != 0) {
								var13 = SINE[var12];
								var12 = COSINE[var12];
								var14 = this.f[var10] * var13 + this.e[var10] * var12 >> 16;
								this.f[var10] = this.f[var10] * var12 - this.e[var10] * var13 >> 16;
								this.e[var10] = var14;
							}

							if (var11 != 0) {
								var13 = SINE[var11];
								var12 = COSINE[var11];
								var14 = this.f[var10] * var12 - this.g[var10] * var13 >> 16;
								this.g[var10] = this.f[var10] * var13 + this.g[var10] * var12 >> 16;
								this.f[var10] = var14;
							}

							if (var7 != 0) {
								var13 = SINE[var7];
								var12 = COSINE[var7];
								var14 = this.g[var10] * var13 + this.e[var10] * var12 >> 16;
								this.g[var10] = this.g[var10] * var12 - this.e[var10] * var13 >> 16;
								this.e[var10] = var14;
							}

							this.e[var10] += aC;
							this.f[var10] += aD;
							this.g[var10] += aE;
						}
					}
				}

			} else if (var1 == 3) {
				for (var1 = 0; var1 < var6; ++var1) {
					if ((var7 = var2[var1]) < this.vertexGroups.length) {
						var8 = this.vertexGroups[var7];

						for (var9 = 0; var9 < var8.length; ++var9) {
							var10 = var8[var9];
							this.e[var10] -= aC;
							this.f[var10] -= aD;
							this.g[var10] -= aE;
							this.e[var10] = this.e[var10] * var3 / 128;
							this.f[var10] = this.f[var10] * var4 / 128;
							this.g[var10] = this.g[var10] * var5 / 128;
							this.e[var10] += aC;
							this.f[var10] += aD;
							this.g[var10] += aE;
						}
					}
				}

			} else {
				if (var1 == 5 && this.faceGroups != null && this.faceAlphas != null) {
					for (var1 = 0; var1 < var6; ++var1) {
						if ((var7 = var2[var1]) < this.faceGroups.length) {
							var8 = this.faceGroups[var7];

							for (var9 = 0; var9 < var8.length; ++var9) {
								var10 = var8[var9];
								this.faceAlphas[var10] += var3 << 3;
								if (this.faceAlphas[var10] < 0) {
									this.faceAlphas[var10] = 0;
								}

								if (this.faceAlphas[var10] > 255) {
									this.faceAlphas[var10] = 255;
								}
							}
						}
					}
				}

			}
		}
	}

	public final void e() {
		for (int var1 = 0; var1 < this.vertices; ++var1) {
			int var2 = this.e[var1];
			this.e[var1] = this.g[var1];
			this.g[var1] = -var2;
		}

	}

	public final void a(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.vertices; ++var4) {
			this.e[var4] += var1;
			this.f[var4] += var2;
			this.g[var4] += var3;
		}

	}

	public final void recolor(int var1, int var2) {
		for (int var3 = 0; var3 < this.faces; ++var3) {
			if (this.faceColors[var3] == var1) {
				this.faceColors[var3] = var2;
			}
		}

	}

	public final void f() {
		int var1;
		for (var1 = 0; var1 < this.vertices; ++var1) {
			this.g[var1] = -this.g[var1];
		}

		for (var1 = 0; var1 < this.faces; ++var1) {
			int var2 = this.i[var1];
			this.i[var1] = this.k[var1];
			this.k[var1] = var2;
		}

	}

	public final void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.vertices; ++var4) {
			this.e[var4] = this.e[var4] * var1 / 128;
			this.f[var4] = this.f[var4] * var3 / 128;
			this.g[var4] = this.g[var4] * var2 / 128;
		}

	}

	public final void light(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = (int) Math.sqrt((double) (var3 * var3 + var4 * var4 + var5 * var5));
		var2 = var2 * var7 >> 8;
		if (this.R == null) {
			this.R = new int[this.faces];
			this.S = new int[this.faces];
			this.T = new int[this.faces];
		}

		if (super.normals == null) {
			super.normals = new VertexNormal[this.vertices];

			for (var7 = 0; var7 < this.vertices; ++var7) {
				super.normals[var7] = new VertexNormal();
			}
		}

		VertexNormal var20;
		for (var7 = 0; var7 < this.faces; ++var7) {
			if (this.faceColors != null && this.faceAlphas != null
					&& (this.faceColors[var7] == '\uffff' || this.faceColors[var7] == 16705)) {
				this.faceAlphas[var7] = 255;
			}

			int var8 = this.i[var7];
			int var9 = this.j[var7];
			int var10 = this.k[var7];
			int var11 = this.e[var9] - this.e[var8];
			int var12 = this.f[var9] - this.f[var8];
			int var13 = this.g[var9] - this.g[var8];
			int var14 = this.e[var10] - this.e[var8];
			int var15 = this.f[var10] - this.f[var8];
			int var16 = this.g[var10] - this.g[var8];
			int var17 = var12 * var16 - var15 * var13;
			var13 = var13 * var14 - var16 * var11;

			for (var11 = var11 * var15 - var14 * var12; var17 > 8192 || var13 > 8192 || var11 > 8192 || var17 < -8192
					|| var13 < -8192 || var11 < -8192; var11 >>= 1) {
				var17 >>= 1;
				var13 >>= 1;
			}

			if ((var12 = (int) Math.sqrt((double) (var17 * var17 + var13 * var13 + var11 * var11))) <= 0) {
				var12 = 1;
			}

			var17 = (var17 << 8) / var12;
			var13 = (var13 << 8) / var12;
			var11 = (var11 << 8) / var12;
			if (this.l != null && (this.l[var7] & 1) != 0) {
				var8 = var1 + (var3 * var17 + var4 * var13 + var5 * var11) / (var2 + var2 / 2);
				this.R[var7] = c(this.faceColors[var7], var8, this.l[var7]);
			} else {
				VertexNormal var10000 = var20 = super.normals[var8];
				var10000.x += var17;
				var20.y += var13;
				var20.z += var11;
				++var20.faces;
				var10000 = var20 = super.normals[var9];
				var10000.x += var17;
				var20.y += var13;
				var20.z += var11;
				++var20.faces;
				var10000 = var20 = super.normals[var10];
				var10000.x += var17;
				var20.y += var13;
				var20.z += var11;
				++var20.faces;
			}
		}

		if (var6) {
			this.a(var1, var2, var3, var4, var5);
		} else {
			this.z = new VertexNormal[this.vertices];

			for (var7 = 0; var7 < this.vertices; ++var7) {
				var20 = super.normals[var7];
				VertexNormal var21;
				(var21 = this.z[var7] = new VertexNormal()).x = var20.x;
				var21.y = var20.y;
				var21.z = var20.z;
				var21.faces = var20.faces;
			}
		}

		if (var6) {
			this.c();
		} else {
			boolean var18 = true;
			Model var19 = this;
			super.modelHeight = 0;
			this.r = 0;
			this.s = 0;
			this.n = 999999;
			this.o = -999999;
			this.p = -99999;
			this.q = 99999;

			for (var2 = 0; var2 < var19.vertices; ++var2) {
				var3 = var19.e[var2];
				var4 = var19.f[var2];
				var5 = var19.g[var2];
				if (var3 < var19.n) {
					var19.n = var3;
				}

				if (var3 > var19.o) {
					var19.o = var3;
				}

				if (var5 < var19.q) {
					var19.q = var5;
				}

				if (var5 > var19.p) {
					var19.p = var5;
				}

				if (-var4 > var19.modelHeight) {
					var19.modelHeight = -var4;
				}

				if (var4 > var19.s) {
					var19.s = var4;
				}

				if ((var3 = var3 * var3 + var5 * var5) > var19.r) {
					var19.r = var3;
				}
			}

			var19.r = (int) Math.sqrt((double) var19.r);
			var19.u = (int) Math.sqrt((double) (var19.r * var19.r + var19.modelHeight * var19.modelHeight));
			var19.t = var19.u + (int) Math.sqrt((double) (var19.r * var19.r + var19.s * var19.s));
		}
	}

	public final void a(int var1, int var2, int var3, int var4, int var5) {
		int var6;
		for (var6 = 0; var6 < this.faces; ++var6) {
			int var7 = this.i[var6];
			int var8 = this.j[var6];
			int var9 = this.k[var6];
			int var10;
			if (this.l == null) {
				var10 = this.faceColors[var6];
				VertexNormal var11 = super.normals[var7];
				var7 = var1 + (var3 * var11.x + var4 * var11.y + var5 * var11.z) / (var2 * var11.faces);
				this.R[var6] = c(var10, var7, 0);
				var11 = super.normals[var8];
				var7 = var1 + (var3 * var11.x + var4 * var11.y + var5 * var11.z) / (var2 * var11.faces);
				this.S[var6] = c(var10, var7, 0);
				var11 = super.normals[var9];
				var7 = var1 + (var3 * var11.x + var4 * var11.y + var5 * var11.z) / (var2 * var11.faces);
				this.T[var6] = c(var10, var7, 0);
			} else if ((this.l[var6] & 1) == 0) {
				var10 = this.faceColors[var6];
				int var13 = this.l[var6];
				VertexNormal var12 = super.normals[var7];
				var7 = var1 + (var3 * var12.x + var4 * var12.y + var5 * var12.z) / (var2 * var12.faces);
				this.R[var6] = c(var10, var7, var13);
				var12 = super.normals[var8];
				var7 = var1 + (var3 * var12.x + var4 * var12.y + var5 * var12.z) / (var2 * var12.faces);
				this.S[var6] = c(var10, var7, var13);
				var12 = super.normals[var9];
				var7 = var1 + (var3 * var12.x + var4 * var12.y + var5 * var12.z) / (var2 * var12.faces);
				this.T[var6] = c(var10, var7, var13);
			}
		}

		super.normals = null;
		this.z = null;
		this.ab = null;
		this.ac = null;
		if (this.l != null) {
			for (var6 = 0; var6 < this.faces; ++var6) {
				if ((this.l[var6] & 2) == 2) {
					return;
				}
			}
		}

		this.faceColors = null;
	}

	private static int c(int var0, int var1, int var2) {
		if (var0 == '\uffff') {
			return 0;
		} else if ((var2 & 2) == 2) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			return var1 = 127 - var1;
		} else {
			if ((var1 = var1 * (var0 & 127) >> 7) < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 'ﾀ') + var1;
		}
	}

	public final void render(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = Rasterizer3D.e;
		int var8 = Rasterizer3D.f;
		int var9 = SINE[var1];
		int var10 = COSINE[var1];
		int var11 = SINE[var2];
		int var12 = COSINE[var2];
		int var13 = SINE[var3];
		var3 = COSINE[var3];
		int var14 = var5 * var13 + var6 * var3 >> 16;

		for (int var15 = 0; var15 < this.vertices; ++var15) {
			int var16 = this.e[var15];
			int var17 = this.f[var15];
			int var18 = this.g[var15];
			int var19;
			if (var2 != 0) {
				var19 = var17 * var11 + var16 * var12 >> 16;
				var17 = var17 * var12 - var16 * var11 >> 16;
				var16 = var19;
			}

			if (var1 != 0) {
				var19 = var18 * var9 + var16 * var10 >> 16;
				var18 = var18 * var10 - var16 * var9 >> 16;
				var16 = var19;
			}

			var16 += var4;
			var17 += var5;
			var18 += var6;
			var19 = var17 * var3 - var18 * var13 >> 16;
			var18 = var17 * var13 + var18 * var3 >> 16;
			ao[var15] = var18 - var14;
			am[var15] = var7 + (var16 << 9) / var18;
			an[var15] = var8 + (var19 << 9) / var18;
			if (this.texturedFaces > 0) {
				ap[var15] = var16;
				aq[var15] = var19;
				ar[var15] = var18;
			}
		}

		try {
			this.a(false, false, 0);
		} catch (Exception var20) {
			;
		}
	}

	public final void renderAtPoint(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
			int var9) {
		int var10 = var8 * var5 - var6 * var4 >> 16;
		int var11 = var7 * var2 + var10 * var3 >> 16;
		int var12 = this.r * var3 >> 16;
		int var13;
		if ((var13 = var11 + var12) > 50 && var11 < 3500) {
			int var14;
			int var15;
			if ((var15 = (var14 = var8 * var4 + var6 * var5 >> 16) - this.r << Client.d)
					/ var13 < Rasterizer2D.centreX) {
				int var16;
				if ((var16 = var14 + this.r << Client.d) / var13 > -Rasterizer2D.centreX) {
					var10 = var7 * var3 - var10 * var2 >> 16;
					int var17 = this.r * var2 >> 16;
					int var18;
					if ((var18 = var10 + var17 << Client.d) / var13 > -Rasterizer2D.q) {
						var17 += super.modelHeight * var3 >> 16;
						if ((var17 = var10 - var17 << Client.d) / var13 < Rasterizer2D.q) {
							int var19 = var12 + (super.modelHeight * var2 >> 16);
							boolean var20 = false;
							if (var11 - var19 <= 50) {
								var20 = true;
							}

							boolean var23 = false;
							if (var9 > 0 && A) {
								if ((var12 = var11 - var12) <= 50) {
									var12 = 50;
								}

								if (var14 > 0) {
									var15 /= var13;
									var16 /= var12;
								} else {
									var16 /= var13;
									var15 /= var12;
								}

								if (var10 > 0) {
									var17 /= var13;
									var18 /= var12;
								} else {
									var18 /= var13;
									var17 /= var12;
								}

								var10 = B - Rasterizer3D.e;
								var13 = C - Rasterizer3D.f;
								if (var10 > var15 && var10 < var16 && var13 > var17 && var13 < var18) {
									if (this.y) {
										E[D++] = var9;
									} else {
										var23 = true;
									}
								}
							}

							var12 = Rasterizer3D.e;
							var10 = Rasterizer3D.f;
							var13 = 0;
							var14 = 0;
							if (var1 != 0) {
								var13 = SINE[var1];
								var14 = COSINE[var1];
							}

							for (var15 = 0; var15 < this.vertices; ++var15) {
								var16 = this.e[var15];
								var17 = this.f[var15];
								var18 = this.g[var15];
								int var21;
								if (var1 != 0) {
									var21 = var18 * var13 + var16 * var14 >> 16;
									var18 = var18 * var14 - var16 * var13 >> 16;
									var16 = var21;
								}

								var16 += var6;
								var17 += var7;
								var21 = (var18 += var8) * var4 + var16 * var5 >> 16;
								var18 = var18 * var5 - var16 * var4 >> 16;
								var16 = var21;
								var21 = var17 * var3 - var18 * var2 >> 16;
								var18 = var17 * var2 + var18 * var3 >> 16;
								ao[var15] = var18 - var11;
								if (var18 >= 50) {
									am[var15] = var12 + (var16 << Client.d) / var18;
									an[var15] = var10 + (var21 << Client.d) / var18;
								} else {
									am[var15] = -5000;
									var20 = true;
								}

								if (var20 || this.texturedFaces > 0) {
									ap[var15] = var16;
									aq[var15] = var21;
									ar[var15] = var18;
								}
							}

							try {
								this.a(var20, var23, var9);
							} catch (Exception var22) {
								;
							}
						}
					}
				}
			}
		}
	}

	private final void a(boolean var1, boolean var2, int var3) {
		int var4;
		for (var4 = 0; var4 < this.t; ++var4) {
			as[var4] = 0;
		}

		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var17;
		int var18;
		for (var4 = 0; var4 < this.faces; ++var4) {
			if (this.l == null || this.l[var4] != -1) {
				var5 = this.i[var4];
				var6 = this.j[var4];
				var7 = this.k[var4];
				var8 = am[var5];
				var9 = am[var6];
				var10 = am[var7];
				if (!var1 || var8 != -5000 && var9 != -5000 && var10 != -5000) {
					if (var2) {
						int var10002 = an[var5];
						int var10003 = an[var6];
						int var14 = an[var7];
						int var15 = var10003;
						int var16 = var10002;
						var17 = C;
						var18 = B;
						if (var17 < var16 && var17 < var15 && var17 < var14 ? false
								: (var17 > var16 && var17 > var15 && var17 > var14 ? false
										: (var18 < var8 && var18 < var9 && var18 < var10 ? false
												: var18 <= var8 || var18 <= var9 || var18 <= var10))) {
							E[D++] = var3;
							var2 = false;
						}
					}

					if ((var8 - var9) * (an[var7] - an[var6]) - (an[var5] - an[var6]) * (var10 - var9) <= 0) {
						continue;
					}

					al[var4] = false;
					if (var8 >= 0 && var9 >= 0 && var10 >= 0 && var8 <= Rasterizer2D.o && var9 <= Rasterizer2D.o
							&& var10 <= Rasterizer2D.o) {
						af[var4] = false;
					} else {
						af[var4] = true;
					}
				} else {
					al[var4] = true;
				}

				var18 = (ao[var5] + ao[var6] + ao[var7]) / 3 + this.u;
				at[var18][as[var18]++] = var4;
			}
		}

		int[] var22;
		if (this.facePriorities == null) {
			for (var4 = this.t - 1; var4 >= 0; --var4) {
				if ((var5 = as[var4]) > 0) {
					var22 = at[var4];

					for (var7 = 0; var7 < var5; ++var7) {
						this.drawModel(var22[var7]);
					}
				}
			}

		} else {
			for (var4 = 0; var4 < 12; ++var4) {
				au[var4] = 0;
				ay[var4] = 0;
			}

			for (var4 = this.t - 1; var4 >= 0; --var4) {
				if ((var5 = as[var4]) > 0) {
					var22 = at[var4];

					for (var7 = 0; var7 < var5; ++var7) {
						var8 = var22[var7];
						var9 = this.facePriorities[var8];
						var10 = au[var9]++;
						av[var9][var10] = var8;
						if (var9 < 10) {
							ay[var9] += var4;
						} else if (var9 == 10) {
							aw[var10] = var4;
						} else {
							ax[var10] = var4;
						}
					}
				}
			}

			var4 = 0;
			if (au[1] > 0 || au[2] > 0) {
				var4 = (ay[1] + ay[2]) / (au[1] + au[2]);
			}

			var5 = 0;
			if (au[3] > 0 || au[4] > 0) {
				var5 = (ay[3] + ay[4]) / (au[3] + au[4]);
			}

			var6 = 0;
			if (au[6] > 0 || au[8] > 0) {
				var6 = (ay[6] + ay[8]) / (au[6] + au[8]);
			}

			var7 = 0;
			var8 = au[10];
			int[] var23 = av[10];
			int[] var24 = aw;
			if (var8 == 0) {
				var7 = 0;
				var8 = au[11];
				var23 = av[11];
				var24 = ax;
			}

			if (var8 > 0) {
				var18 = var24[0];
			} else {
				var18 = -1000;
			}

			for (int var19 = 0; var19 < 10; ++var19) {
				while (var19 == 0 && var18 > var4) {
					this.drawModel(var23[var7++]);
					if (var7 == var8 && var23 != av[11]) {
						var7 = 0;
						var8 = au[11];
						var23 = av[11];
						var24 = ax;
					}

					if (var7 < var8) {
						var18 = var24[var7];
					} else {
						var18 = -1000;
					}
				}

				while (var19 == 3 && var18 > var5) {
					this.drawModel(var23[var7++]);
					if (var7 == var8 && var23 != av[11]) {
						var7 = 0;
						var8 = au[11];
						var23 = av[11];
						var24 = ax;
					}

					if (var7 < var8) {
						var18 = var24[var7];
					} else {
						var18 = -1000;
					}
				}

				while (var19 == 5 && var18 > var6) {
					this.drawModel(var23[var7++]);
					if (var7 == var8 && var23 != av[11]) {
						var7 = 0;
						var8 = au[11];
						var23 = av[11];
						var24 = ax;
					}

					if (var7 < var8) {
						var18 = var24[var7];
					} else {
						var18 = -1000;
					}
				}

				int var20 = au[var19];
				int[] var21 = av[var19];

				for (var17 = 0; var17 < var20; ++var17) {
					this.drawModel(var21[var17]);
				}
			}

			while (var18 != -1000) {
				this.drawModel(var23[var7++]);
				if (var7 == var8 && var23 != av[11]) {
					var7 = 0;
					var23 = av[11];
					var8 = au[11];
					var24 = ax;
				}

				if (var7 < var8) {
					var18 = var24[var7];
				} else {
					var18 = -1000;
				}
			}

		}
	}

	private final void drawModel(int modelID) {
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!al[modelID]) {
			int var2 = this.i[modelID];
			var3 = this.j[modelID];
			var4 = this.k[modelID];
			Rasterizer3D.b = af[modelID];
			if (this.faceAlphas == null) {
				Rasterizer3D.d = 0;
			} else {
				Rasterizer3D.d = this.faceAlphas[modelID];
			}

			if (this.l == null) {
				var5 = 0;
			} else {
				var5 = this.l[modelID] & 3;
			}

			if (var5 == 0) {
				Rasterizer3D.drawShadedTriangle(an[var2], an[var3], an[var4], am[var2], am[var3], am[var4],
						this.R[modelID], this.S[modelID], this.T[modelID]);
			} else if (var5 == 1) {
				Rasterizer3D.drawFlatTriangle(an[var2], an[var3], an[var4], am[var2], am[var3], am[var4],
						rgbTable[this.R[modelID]]);
			} else if (var5 == 2) {
				var5 = this.l[modelID] >> 2;
				var6 = this.Y[var5];
				var7 = this.Z[var5];
				var5 = this.aa[var5];
				Rasterizer3D.drawTexturedTriangle(an[var2], an[var3], an[var4], am[var2], am[var3], am[var4],
						this.R[modelID], this.S[modelID], this.T[modelID], ap[var6], ap[var7], ap[var5], aq[var6],
						aq[var7], aq[var5], ar[var6], ar[var7], ar[var5], this.faceColors[modelID]);
			} else {
				if (var5 == 3) {
					var5 = this.l[modelID] >> 2;
					var6 = this.Y[var5];
					var7 = this.Z[var5];
					var5 = this.aa[var5];
					Rasterizer3D.drawTexturedTriangle(an[var2], an[var3], an[var4], am[var2], am[var3], am[var4],
							this.R[modelID], this.R[modelID], this.R[modelID], ap[var6], ap[var7], ap[var5], aq[var6],
							aq[var7], aq[var5], ar[var6], ar[var7], ar[var5], this.faceColors[modelID]);
				}

			}
		} else {
			if (this.faceColors == null || this.faceColors[modelID] != '\uffff') {
				var3 = Rasterizer3D.e;
				var4 = Rasterizer3D.f;
				var5 = 0;
				var6 = this.i[modelID];
				var7 = this.j[modelID];
				int var8 = this.k[modelID];
				int var9 = ar[var6];
				int var10 = ar[var7];
				int var11 = ar[var8];
				int var12;
				int var13;
				int var14;
				int var15;
				if (var9 >= 50) {
					az[0] = am[var6];
					aA[0] = an[var6];
					++var5;
					aB[0] = this.R[modelID];
				} else {
					var12 = ap[var6];
					var13 = aq[var6];
					var14 = this.R[modelID];
					if (var11 >= 50) {
						var15 = (50 - var9) * aG[var11 - var9];
						az[0] = var3 + (var12 + ((ap[var8] - var12) * var15 >> 16) << Client.d) / 50;
						aA[0] = var4 + (var13 + ((aq[var8] - var13) * var15 >> 16) << Client.d) / 50;
						++var5;
						aB[0] = var14 + ((this.T[modelID] - var14) * var15 >> 16);
					}

					if (var10 >= 50) {
						var15 = (50 - var9) * aG[var10 - var9];
						az[var5] = var3 + (var12 + ((ap[var7] - var12) * var15 >> 16) << Client.d) / 50;
						aA[var5] = var4 + (var13 + ((aq[var7] - var13) * var15 >> 16) << Client.d) / 50;
						aB[var5++] = var14 + ((this.S[modelID] - var14) * var15 >> 16);
					}
				}

				if (var10 >= 50) {
					az[var5] = am[var7];
					aA[var5] = an[var7];
					aB[var5++] = this.S[modelID];
				} else {
					var12 = ap[var7];
					var13 = aq[var7];
					var14 = this.S[modelID];
					if (var9 >= 50) {
						var15 = (50 - var10) * aG[var9 - var10];
						az[var5] = var3 + (var12 + ((ap[var6] - var12) * var15 >> 16) << Client.d) / 50;
						aA[var5] = var4 + (var13 + ((aq[var6] - var13) * var15 >> 16) << Client.d) / 50;
						aB[var5++] = var14 + ((this.R[modelID] - var14) * var15 >> 16);
					}

					if (var11 >= 50) {
						var15 = (50 - var10) * aG[var11 - var10];
						az[var5] = var3 + (var12 + ((ap[var8] - var12) * var15 >> 16) << Client.d) / 50;
						aA[var5] = var4 + (var13 + ((aq[var8] - var13) * var15 >> 16) << Client.d) / 50;
						aB[var5++] = var14 + ((this.T[modelID] - var14) * var15 >> 16);
					}
				}

				if (var11 >= 50) {
					az[var5] = am[var8];
					aA[var5] = an[var8];
					aB[var5++] = this.T[modelID];
				} else {
					var12 = ap[var8];
					var13 = aq[var8];
					var14 = this.T[modelID];
					if (var10 >= 50) {
						var15 = (50 - var11) * aG[var10 - var11];
						az[var5] = var3 + (var12 + ((ap[var7] - var12) * var15 >> 16) << Client.d) / 50;
						aA[var5] = var4 + (var13 + ((aq[var7] - var13) * var15 >> 16) << Client.d) / 50;
						aB[var5++] = var14 + ((this.S[modelID] - var14) * var15 >> 16);
					}

					if (var9 >= 50) {
						var15 = (50 - var11) * aG[var9 - var11];
						az[var5] = var3 + (var12 + ((ap[var6] - var12) * var15 >> 16) << Client.d) / 50;
						aA[var5] = var4 + (var13 + ((aq[var6] - var13) * var15 >> 16) << Client.d) / 50;
						aB[var5++] = var14 + ((this.R[modelID] - var14) * var15 >> 16);
					}
				}

				var12 = az[0];
				var13 = az[1];
				var14 = az[2];
				var15 = aA[0];
				var3 = aA[1];
				var4 = aA[2];
				if ((var12 - var13) * (var4 - var3) - (var15 - var3) * (var14 - var13) > 0) {
					Rasterizer3D.b = false;
					if (var5 == 3) {
						if (var12 < 0 || var13 < 0 || var14 < 0 || var12 > Rasterizer2D.o || var13 > Rasterizer2D.o
								|| var14 > Rasterizer2D.o) {
							Rasterizer3D.b = true;
						}

						if (this.l == null) {
							var6 = 0;
						} else {
							var6 = this.l[modelID] & 3;
						}

						if (var6 == 0) {
							Rasterizer3D.drawShadedTriangle(var15, var3, var4, var12, var13, var14, aB[0], aB[1],
									aB[2]);
						} else if (var6 == 1) {
							Rasterizer3D.drawFlatTriangle(var15, var3, var4, var12, var13, var14,
									rgbTable[this.R[modelID]]);
						} else if (var6 == 2) {
							var6 = this.l[modelID] >> 2;
							var7 = this.Y[var6];
							var8 = this.Z[var6];
							var6 = this.aa[var6];
							Rasterizer3D.drawTexturedTriangle(var15, var3, var4, var12, var13, var14, aB[0], aB[1],
									aB[2], ap[var7], ap[var8], ap[var6], aq[var7], aq[var8], aq[var6], ar[var7],
									ar[var8], ar[var6], this.faceColors[modelID]);
						} else if (var6 == 3) {
							var6 = this.l[modelID] >> 2;
							var7 = this.Y[var6];
							var8 = this.Z[var6];
							var6 = this.aa[var6];
							Rasterizer3D.drawTexturedTriangle(var15, var3, var4, var12, var13, var14, this.R[modelID],
									this.R[modelID], this.R[modelID], ap[var7], ap[var8], ap[var6], aq[var7], aq[var8],
									aq[var6], ar[var7], ar[var8], ar[var6], this.faceColors[modelID]);
						}
					}

					if (var5 == 4) {
						if (var12 < 0 || var13 < 0 || var14 < 0 || var12 > Rasterizer2D.o || var13 > Rasterizer2D.o
								|| var14 > Rasterizer2D.o || az[3] < 0 || az[3] > Rasterizer2D.o) {
							Rasterizer3D.b = true;
						}

						if (this.l == null) {
							var6 = 0;
						} else {
							var6 = this.l[modelID] & 3;
						}

						if (var6 == 0) {
							Rasterizer3D.drawShadedTriangle(var15, var3, var4, var12, var13, var14, aB[0], aB[1],
									aB[2]);
							Rasterizer3D.drawShadedTriangle(var15, var4, aA[3], var12, var14, az[3], aB[0], aB[2],
									aB[3]);
							return;
						}

						if (var6 == 1) {
							var6 = rgbTable[this.R[modelID]];
							Rasterizer3D.drawFlatTriangle(var15, var3, var4, var12, var13, var14, var6);
							Rasterizer3D.drawFlatTriangle(var15, var4, aA[3], var12, var14, az[3], var6);
							return;
						}

						if (var6 == 2) {
							var6 = this.l[modelID] >> 2;
							var7 = this.Y[var6];
							var8 = this.Z[var6];
							var6 = this.aa[var6];
							Rasterizer3D.drawTexturedTriangle(var15, var3, var4, var12, var13, var14, aB[0], aB[1],
									aB[2], ap[var7], ap[var8], ap[var6], aq[var7], aq[var8], aq[var6], ar[var7],
									ar[var8], ar[var6], this.faceColors[modelID]);
							Rasterizer3D.drawTexturedTriangle(var15, var4, aA[3], var12, var14, az[3], aB[0], aB[2],
									aB[3], ap[var7], ap[var8], ap[var6], aq[var7], aq[var8], aq[var6], ar[var7],
									ar[var8], ar[var6], this.faceColors[modelID]);
							return;
						}

						if (var6 == 3) {
							var6 = this.l[modelID] >> 2;
							var7 = this.Y[var6];
							var8 = this.Z[var6];
							var6 = this.aa[var6];
							Rasterizer3D.drawTexturedTriangle(var15, var3, var4, var12, var13, var14, this.R[modelID],
									this.R[modelID], this.R[modelID], ap[var7], ap[var8], ap[var6], aq[var7], aq[var8],
									aq[var6], ar[var7], ar[var8], ar[var6], this.faceColors[modelID]);
							Rasterizer3D.drawTexturedTriangle(var15, var4, aA[3], var12, var14, az[3], this.R[modelID],
									this.R[modelID], this.R[modelID], ap[var7], ap[var8], ap[var6], aq[var7], aq[var8],
									aq[var6], ar[var7], ar[var8], ar[var6], this.faceColors[modelID]);
						}
					}
				}
			}

		}
	}
}
