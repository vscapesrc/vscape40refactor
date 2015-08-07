import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client extends ScapeApplet {
	private static int aa = 765;
	private static int ab = 503;
	private int ac;
	private String[] ad = new String[100];
	private int[] ae = new int[100];
	private int af;
	private int ag;
	private int ah;
	private int ai;
	public static Client client;
	private NumberFormat aj;
	private boolean ak;
	private boolean al;
	private int am;
	private boolean an;
	private int ao;
	private int ap;
	private List aq;
	private int[] ar;
	private int as;
	private int at;
	private int au;
	public boolean xpDrops;
	private int av;
	private int centerX;
	private int centerY;
	private boolean ay;
	public static boolean c = false;
	public static int d = 9;
	private boolean clientOutOfDate;
	private double gameBrightness;
	public boolean showRoofs;
	private boolean aB;
	private String aC;
	private String aD;
	private final int[] aE;
	private final boolean[] aF;
	private int aG;
	public int f;
	public int g;
	public int h;
	private int aH;
	private Sprite aI;
	private Sprite aJ;
	private Sprite aK;
	private ProducingGraphicsBuffer aL;
	private ProducingGraphicsBuffer aM;
	private int aN;
	private long aO;
	private int[][] aP;
	private int[] aQ;
	private LinkedList[][][] aR;
	private volatile boolean aS;
	private Socket aT;
	private int aU;
	private Buffer aV;
	private Npc[] aW;
	private int aX;
	private int[] aY;
	private int aZ;
	private int[] ba;
	private int bb;
	private int bc;
	private int bd;
	private String be;
	public int i;
	private Buffer bf;
	private boolean bg;
	private static int bh;
	private int[] bi;
	private int[] bj;
	private int[] bk;
	private static int bl;
	private int bm;
	static int j;
	private int bn;
	private int bo;
	private int bp;
	private int bq;
	private int br;
	private int bs;
	private final int[] bt;
	private Sprite bu;
	private Sprite bv;
	private boolean bw;
	private final int[] bx;
	private final boolean[] by;
	private long bz;
	private int bA;
	private int bB;
	private MouseMonitor bC;
	private volatile boolean bD;
	private String bE;
	private int bF;
	private boolean bG;
	private int bH;
	private String bI;
	private final int bJ;
	private final int bK;
	private Player[] bL;
	private int bM;
	private int[] bN;
	private int bO;
	private int[] bP;
	private Buffer[] bQ;
	private int bR;
	private int bS;
	private int bT;
	private int bU;
	private int[][] bV;
	private byte[] bW;
	private int bX;
	private int bY;
	private int bZ;
	private int ca;
	private int cb;
	private int cc;
	private final int[] cd;
	private static int ce;
	private long[] cf;
	private boolean gameCrashed;
	private final int[] ch;
	private int[][] ci;
	private Sprite cj;
	private Sprite ck;
	private int cl;
	private int cm;
	private int cn;
	private int co;
	private int cp;
	private int cq;
	private final int[] cr;
	private final String[] cs;
	private final String[] ct;
	private final String[] cu;
	private int cv;
	private SceneGraph scene;
	private Sprite[] cx;
	private Sprite[] cy;
	private int cz;
	private int cA;
	private int cB;
	private int cC;
	private int cD;
	private long cE;
	private boolean cF;
	private long[] cG;
	private long[] cH;
	private int[] cI;
	private int cJ;
	private static int cK = 10;
	static int k;
	private static boolean cL;
	private static boolean playingOnMembersServer = true;
	private static boolean cN;
	private volatile boolean cO;
	private int cP;
	private int cQ;
	private final int[] cR;
	private final int[] cS;
	final Index[] indices;
	public int[] m;
	private boolean cT;
	private final int cU;
	private final int[] cV;
	private final int[] cW;
	private final int[] cX;
	private final int[] cY;
	private final int[] cZ;
	private final int[] da;
	private final int[] db;
	private final String[] dc;
	private int dd;
	private int de;
	private static int df;
	private Sprite[] hitsplats;
	private int dh;
	private final int[] di;
	private final boolean dj;
	private int dk;
	private int dl;
	private int dm;
	private int dn;
	private int do_;
	private IsaacCipher dp;
	private Sprite dq;
	static final int[][] n = new int[][] {
			{ 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, '莡', 22433, 2983,
					'펱' },
			{ 8741, 12, '羽', 'ꢚ', 7735, 8404, 1701, '阞', 24094, 10153,
					'\udd2d', 4783, 1341, 16578, '袻', 25239 },
			{ 25238, 8742, 12, '羽', 'ꢚ', 7735, 8404, 1701, '阞', 24094, 10153,
					'\udd2d', 4783, 1341, 16578, '袻' },
			{ 4626, 11146, 6439, 12, 4758, 10270 },
			{ 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	private String dr;
	private static int ds;
	private int dt;
	private int du;
	private int dv;
	private int dw;
	private int dx;
	private int dy;
	private LinkedList projectiles;
	private int dA;
	private int dB;
	private int dC;
	private boolean dD;
	private int dE;
	private static final int[] dF = new int[99];
	private int dG;
	private int dH;
	private Sprite dI;
	private Sprite dJ;
	private int dK;
	private final int[] dL;
	private boolean dM;
	private Sprite[] dN;
	private int dO;
	private int dP;
	private int dQ;
	private int dR;
	private int dS;
	private int dT;
	private int dU;
	private final int[] dV;
	private final int[] dW;
	private int dX;
	private boolean dY;
	private int dZ;
	private String ea;
	private static int eb;
	private final int[] ec;
	private Archive fonts;
	private int ee;
	private int ef;
	private LinkedList eg;
	private final int[] eh;
	private Widget ei;
	private IndexedImage[] ej;
	private int ek;
	private final int el;
	private int em;
	private final int[] en;
	private int eo;
	private int ep;
	public ResourceProvider resourceProvider;
	private int eq;
	private int er;
	private int es;
	private int[] et;
	private int[] eu;
	private Sprite ev;
	private Sprite ew;
	private Sprite ex;
	private Sprite ey;
	private Sprite ez;
	private Sprite clanChatSprite;
	private int eB;
	private boolean eC;
	private String[] eD;
	private Buffer eE;
	private int eF;
	private int eG;
	private int eH;
	private int eI;
	private int eJ;
	public static int p;
	private static int eK = 0;
	private int eL;
	private static int eM = 600;
	public static int clientWidth = 765;
	public static int clientHeight = 503;
	public static int resizeMode = 0;
	private int eN;
	private int eO;
	private boolean eP;
	private static boolean eQ = true;
	private int eR;
	private final int[] eS;
	private int[] eT;
	private int[] eU;
	private int[] eV;
	private int[] eW;
	private Sprite eX;
	private Sprite[] headiconsPrayer;
	private Sprite[] headiconsPk;
	private Sprite[] fa;
	private static int fb;
	private int fc;
	private int fd;
	private int fe;
	private int ff;
	private int fg;
	private static boolean fh;
	private int fi;
	private ProducingGraphicsBuffer fj;
	private ProducingGraphicsBuffer fk;
	private ProducingGraphicsBuffer loginScreen;
	private ProducingGraphicsBuffer fm;
	private ProducingGraphicsBuffer fn;
	private ProducingGraphicsBuffer fo;
	private ProducingGraphicsBuffer fp;
	private ProducingGraphicsBuffer fq;
	private ProducingGraphicsBuffer fr;
	private static int fs;
	private int ft;
	private String fu;
	private Sprite compassSprite;
	private ProducingGraphicsBuffer fw;
	public static Player localPlayer;
	private final String[] fx;
	private final boolean[] fy;
	private final int[][][] fz;
	public static final int[] u = new int[] { -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1 };
	private int fA;
	private int fB;
	private static int fC;
	private int fD;
	private int fE;
	private int fF;
	private String fG;
	private Sprite[] fH;
	private boolean fI;
	private int fJ;
	private boolean fK;
	private Sprite[] fL;
	private static boolean playMusic;
	public static boolean playLoginMusic;
	private IndexedImage[] fN;
	private int fO;
	private static int fP;
	private static boolean fQ;
	public boolean loggedIn;
	private boolean fR;
	private boolean fS;
	private boolean fT;
	static int x;
	private ProducingGraphicsBuffer fU;
	private ProducingGraphicsBuffer fV;
	private ProducingGraphicsBuffer fW;
	private ProducingGraphicsBuffer fX;
	private int fY;
	private BufferedConnection fZ;
	private int ga;
	public static String username = "";
	public static String password = "";
	private static int gb;
	private boolean gc;
	private final int[] gd;
	private int ge;
	private LinkedList gf;
	private int[] gg;
	private int[] gh;
	private int[] gi;
	private byte[][] gj;
	private int camPitch;
	private int camYaw;
	private int camYawDelta;
	private int camPitchDelta;
	private static int go;
	private int gp;
	private int[] gq;
	private int[] gr;
	private Buffer gs;
	private int gt;
	private int gu;
	private IndexedImage gv;
	private String[] gw;
	private Sprite gx;
	private Sprite gy;
	private final int[] gz;
	static final int[] A = new int[] { 9104, 10275, 7595, 3610, 7975, 8526,
			918, '鞒', 24466, 10145, '\ue51e', 5027, 1457, 16565, '袯', 25486 };
	private final int[] gA;
	private int gB;
	static int B;
	private String gC;
	private int gD;
	private int[][][] gE;
	private long gF;
	private int gG;
	private final IndexedImage[] gH;
	static int C;
	private int gI;
	public static boolean D;
	private int gJ;
	private static int gK;
	private int requestedSong;
	private boolean gM;
	private int midiVolume;
	private MidiPlayer midi;
	private final int[] gP;
	private CollisionMap[] gQ;
	public static int[] E;
	private int[] gR;
	private int[] gS;
	private int[] gT;
	private final int[] gU;
	private boolean gV;
	private int gW;
	private int gX;
	private int gY;
	private int gZ;
	private byte[][] ha;
	public int F;
	private int hb;
	private final int[] hc;
	private final int[] hd;
	private int he;
	private final boolean hf;
	private int hg;
	private boolean hh;
	private boolean hi;
	private byte[][][] hj;
	private int loopMusic;
	private int hl;
	private int hm;
	private Sprite hn;
	private int ho;
	private int hp;
	private String hq;
	private String hr;
	private int hs;
	private int ht;
	private RSFont p11_full;
	private RSFont p12_full;
	private RSFont b12_full;
	private Class71 hx;
	private Class71 hy;
	private Class71 hz;
	private int hA;
	private int hB;
	private int[] hC;
	private int[] hD;
	private int hE;
	private int hF;
	private int hG;
	private int hH;
	private String hI;
	public int G;
	private static int hJ;
	private static String hK = "";
	private int hL;
	private int hM;
	private int hN;
	private int hO;
	private int hP;
	private int hQ;
	private int hR;
	private int[] hS;

	static {
		int var0 = 0;

		int var1;
		for (var1 = 0; var1 < 99; ++var1) {
			int var2 = (int) ((double) (var2 = var1 + 1) + 300.0D * Math.pow(
					2.0D, (double) var2 / 7.0D));
			var0 += var2;
			dF[var1] = var0 / 4;
		}

		E = new int[32];
		var0 = 2;

		for (var1 = 0; var1 < 32; ++var1) {
			E[var1] = var0 - 1;
			var0 += var0;
		}

	}

	public final void a() throws Throwable {
		if (resizeMode == 1) {
			if (clientWidth != this.scapeFrame.a()) {
				clientWidth = this.scapeFrame.a();
				this.i();
			}

			if (clientHeight != this.scapeFrame.b()) {
				clientHeight = this.scapeFrame.b();
				this.i();
			}

			if (this.loggedIn
					&& (VScapeSettings.d != clientWidth || VScapeSettings.e != clientHeight)) {
				VScapeSettings.write();
			}
		}

	}

	private void i() {
		Rasterizer3D.a(resizeMode == 0 ? aa : clientWidth, resizeMode == 0 ? ab : clientHeight);
		this.hS = Rasterizer3D.t;
		Rasterizer3D.a(resizeMode == 0 ? 516 : clientWidth, resizeMode == 0 ? 165 : clientHeight);
		this.gg = Rasterizer3D.t;
		Rasterizer3D.a(resizeMode == 0 ? (this.fU != null ? this.fU.width : 250)
				: clientWidth,
				resizeMode == 0 ? (this.fU != null ? this.fU.height : 335)
						: clientHeight);
		this.gh = Rasterizer3D.t;
		Rasterizer3D.a(resizeMode == 0 ? 512 : clientWidth, resizeMode == 0 ? 334 : clientHeight);
		this.gi = Rasterizer3D.t;
		int[] var1 = new int[9];

		for (int var2 = 0; var2 < 9; ++var2) {
			int var3 = 128 + (var2 << 5) + 15;
			int var4 = 600 + var3 * 3;
			var3 = Rasterizer3D.SINE[var3];
			var1[var2] = var4 * var3 >> 16;
		}

		SceneGraph.a(500, 800, resizeMode == 0 ? 512 : clientWidth, resizeMode == 0 ? 334
				: clientHeight, var1);
		this.fW = new ProducingGraphicsBuffer(resizeMode == 0 ? 512 : clientWidth,
				resizeMode == 0 ? 334 : clientHeight, this.getFrameComponent());
		Rasterizer2D.reset();
		this.E();
		if (!this.loggedIn) {
			this.Z();
		}

	}

	private void e(int var1) {
		if (resizeMode != var1) {
			resizeMode = var1;
			int var2 = 765;
			int var3 = 503;
			boolean var7;
			if (var1 == 0) {
				d = 9;
				var7 = false;
				var2 = aa;
				var3 = ab;
				eQ = true;
				this.eP = true;
			} else if (var1 == 1) {
				d = 10;
				var7 = true;
				var2 = VScapeSettings.d > 0 ? VScapeSettings.d : 900;
				var3 = VScapeSettings.e > 0 ? VScapeSettings.e : 600;
			} else if (var1 == 2) {
				d = 10;
				var7 = true;
				var2 = (int) Toolkit.getDefaultToolkit().getScreenSize()
						.getWidth();
				var3 = (int) Toolkit.getDefaultToolkit().getScreenSize()
						.getHeight();
			}

			var3 = var3;
			var2 = var2;
			Client var8 = this;

			try {
				clientWidth = var2;
				clientHeight = var3;
				boolean var10001 = resizeMode == 2;
				int var10002 = var2;
				boolean var10004 = resizeMode == 1;
				boolean var9 = resizeMode > 0;
				int var4 = var3;
				int var5 = var10002;
				boolean var11 = var10001;
				Client var10 = client;
				client.width = var5;
				var10.height = var4;
				if (var10.scapeFrame != null) {
					var10.scapeFrame.dispose();
				}

				var10.scapeFrame = new ScapeFrame(var10, var5, var4, var11);
				var10.scapeFrame.addWindowListener(var10);
				var10.frameGraphics = var10.scapeFrame.getGraphics();
				var10.getFrameComponent().addMouseWheelListener(var10);
				var10.getFrameComponent().addMouseListener(var10);
				var10.getFrameComponent().addMouseMotionListener(var10);
				var10.getFrameComponent().addKeyListener(var10);
				var10.getFrameComponent().addFocusListener(var10);
				var8.i();
				var8.mouseX = var8.mouseY = -1;
			} catch (Exception var6) {
				var6.printStackTrace();
			}

			this.i();
		}

	}

	private boolean mouseWithinRegion(int left, int top, int right, int bottom) {
		Rasterizer2D.drawRectangle(left, right - left, bottom - top,
				0x0000FF00, top);
		return super.mouseX >= left && super.mouseX <= right
				&& super.mouseY >= top && super.mouseY <= bottom;
	}

	private boolean b(int var1, int var2, int var3, int var4) {
		return super.U >= var1 && super.U <= var3 && super.V >= var2
				&& super.V <= var4;
	}

	private static String j() {
		String var0;
		if (!(var0 = System.getProperty("os.name")).startsWith("Linux")
				&& !var0.startsWith("Mac") && !var0.startsWith("HP-UX")) {
			String var13 = null;
			HashMap var14 = new HashMap();
			Enumeration var12 = null;

			try {
				var12 = NetworkInterface.getNetworkInterfaces();
			} catch (SocketException var8) {
				var8.printStackTrace();
			}

			while (var12.hasMoreElements()) {
				NetworkInterface var15 = (NetworkInterface) var12.nextElement();
				byte[] var16 = null;

				try {
					var16 = var15.getHardwareAddress();
				} catch (SocketException var7) {
					var7.printStackTrace();
				}

				if (var16 != null) {
					StringBuilder var5 = new StringBuilder();

					for (int var6 = 0; var6 < var16.length; ++var6) {
						var5.append(String.format("%02X%s",
								new Object[] { Byte.valueOf(var16[var6]),
										var6 < var16.length - 1 ? "-" : "" }));
					}

					if (!var5.toString().isEmpty()) {
						var14.put(var15.getName(), var5.toString());
					}

					if (!var5.toString().isEmpty() && var13 == null) {
						var13 = var15.getName();
					}
				}
			}

			return var13 != null ? (String) var14.get(var13) : null;
		} else {
			var0 = "/sbin/ifconfig";
			Pattern var1 = Pattern
					.compile("([a-fA-F0-9]{1,2}(-|:)){5}[a-fA-F0-9]{1,2}");

			try {
				Process var2 = null;

				try {
					var2 = Runtime.getRuntime().exec(var0);
				} catch (Exception var9) {
					var9.printStackTrace();
				}

				if (var2 == null) {
					System.out
							.println("the command \'ifconfig\' failed to run on your system");
				}

				var2.waitFor();
				BufferedReader var11 = new BufferedReader(
						new InputStreamReader(var2.getInputStream()));

				String var3;
				while ((var3 = var11.readLine()) != null) {
					Matcher var4;
					if ((var4 = var1.matcher(var3)).find()) {
						var3 = var4.group();
						break;
					}
				}

				return var3;
			} catch (Exception var10) {
				var10.printStackTrace();
				return null;
			}
		}
	}

	private static String f(int var0) {
		String var2;
		for (int var1 = (var2 = String.valueOf(var0)).length() - 3; var1 > 0; var1 -= 3) {
			var2 = var2.substring(0, var1) + "," + var2.substring(var1);
		}

		if (var2.length() > 8) {
			var2 = "@gre@" + var2.substring(0, var2.length() - 8)
					+ " million @whi@(" + var2 + ")";
		} else if (var2.length() > 4) {
			var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@("
					+ var2 + ")";
		}

		return " " + var2;
	}

	private void k() {
		String var1 = null;

		for (int var2 = 0; var2 < 100; ++var2) {
			int var3;
			if (this.ct[var2] != null
					&& ((var3 = this.cr[var2]) == 3 || var3 == 7)) {
				var1 = this.cs[var2];
				break;
			}
		}

		if (var1 == null) {
			this.a("You haven\'t received any messages to which you can reply.",
					0, "");
		} else {
			if (var1.startsWith("@cr")) {
				var1 = var1.substring(5);
			}

			if (var1.startsWith("@irn")) {
				var1 = var1.substring(5);
			}

			long var4 = StringUtils.a(var1.trim());
			int var7 = -1;

			for (int var6 = 0; var6 < this.bS; ++var6) {
				if (this.cG[var6] == var4) {
					var7 = var6;
					break;
				}
			}

			if (var7 != -1) {
				if (this.aQ[var7] > 0) {
					D = true;
					this.gJ = 0;
					this.hi = true;
					this.gC = "";
					this.em = 3;
					this.cE = this.cG[var7];
					this.fu = "Enter message to send to " + this.eD[var7];
					return;
				}

				this.a("That player is currently offline.", 0, "");
			}

		}
	}

	private boolean g(int var1) {
		if (var1 < 0) {
			return false;
		} else {
			if ((var1 = this.eV[var1]) >= 2000) {
				var1 -= 2000;
			}

			return var1 == 337;
		}
	}

	private static String h(int var0) {
		switch (var0) {
		case 1:
			return "@cr1@";
		case 2:
			return "@cr2@";
		case 3:
			return "@cr2@";
		case 4:
			return "@irn@";
		default:
			return "";
		}
	}

	private int a(int var1, int var2, int var3) {
		switch (var1) {
		case 1:
			this.gH[0].a(var2, var3);
			return 15;
		case 2:
			this.gH[1].a(var2, var3);
			return 15;
		case 3:
			this.gH[1].a(var2, var3);
			return 15;
		case 4:
			Animation.spriteFromGroup("chaticons", 0).drawSprite(var2, var3);
			return 13;
		default:
			return 0;
		}
	}

	private void a(String var1) {
		if (var1 != null && var1.length() != 0) {
			var1 = var1;
			String[] var2 = new String[100];

			int var3;
			int var4;
			for (var3 = 0; (var4 = var1.indexOf(" ")) != -1; var1 = var1
					.substring(var4 + 1)) {
				String var5;
				if ((var5 = var1.substring(0, var4).trim()).length() > 0) {
					var2[var3++] = var5.toLowerCase();
				}
			}

			if ((var1 = var1.trim()).length() > 0) {
				var2[var3++] = var1.toLowerCase();
			}

			this.ac = 0;

			label45: for (var4 = 0; var4 < ItemDefinition.count; ++var4) {
				ItemDefinition var6;
				if ((var6 = ItemDefinition.fromID(var4)).notedTemplateId == -1
						&& var6.itemName != null) {
					var1 = var6.itemName.toLowerCase();

					for (int var7 = 0; var7 < var3; ++var7) {
						if (var1.indexOf(var2[var7]) == -1) {
							continue label45;
						}
					}

					this.ad[this.ac] = var1;
					this.ae[this.ac] = var4;
					++this.ac;
					if (this.ac >= this.ad.length) {
						return;
					}
				}
			}

		} else {
			this.ac = 0;
		}
	}

	private void b(String var1) {
		if (var1 != null && var1.length() != 0) {
			var1 = var1;
			String[] var2 = new String[100];

			int var3;
			int var4;
			for (var3 = 0; (var4 = var1.indexOf(" ")) != -1; var1 = var1
					.substring(var4 + 1)) {
				String var5;
				if ((var5 = var1.substring(0, var4).trim()).length() > 0) {
					var2[var3++] = var5.toLowerCase();
				}
			}

			if ((var1 = var1.trim()).length() > 0) {
				var2[var3++] = var1.toLowerCase();
			}

			this.ac = 0;

			label42: for (var4 = 0; var4 < ActorDefinition.count; ++var4) {
				ActorDefinition var6;
				if ((var6 = ActorDefinition.lookup(var4)).name != null) {
					var1 = var6.name.toLowerCase();

					for (int var7 = 0; var7 < var3; ++var7) {
						if (var1.indexOf(var2[var7]) == -1) {
							continue label42;
						}
					}

					this.ad[this.ac] = var1;
					this.ae[this.ac] = var4;
					++this.ac;
					if (this.ac >= this.ad.length) {
						return;
					}
				}
			}

		} else {
			this.ac = 0;
		}
	}

	private void l() {
		int var1 = 0;
		Rasterizer3D.t = this.gg;
		if (resizeMode == 0) {
			this.fX.initializeRasterizer();
		}

		if (resizeMode == 0) {
			Animation.spriteFromGroup("chat", 4).drawSprite(0, 0);
			this.aK.b(7, 6);
		}

		if (resizeMode != 0) {
			var1 = clientHeight - 165;
		}

		if (resizeMode != 0 && eQ) {
			Animation.spriteFromGroup("chat", 5).drawSprite(0, var1 - 1);
			Rasterizer2D.fillRectangle(13417370, var1 + 6, 506, 129, 200, 7);
			this.aK.b(7, var1 + 6);
		}

		if (resizeMode != 0) {
			Animation.spriteFromGroup("chat", 6).drawSprite(0,
					clientHeight - 22);
		}

		if (resizeMode == 0) {
			this.fX.initializeRasterizer();
		}

		int var3 = 0;
		if (resizeMode != 0) {
			var3 = clientHeight - 164;
		}

		String[] var4 = new String[] { "On", "Filtered", "Off" };
		int[] var5 = new int[] { '\uff00', '\uffff', 16711680 };
		String[] var6 = new String[] { "On", "Hidden", "Off" };
		int[] var7 = new int[] { '\uff00', '\uffff', 16711680 };
		String[] var8 = new String[] { "On", "Friends", "Off", "Hide" };
		int[] var9 = new int[] { '\uff00', 16776960, 16711680, '\uffff' };
		switch (this.ah) {
		case 0:
			Animation.spriteFromGroup("chat", 1).drawSprite(5, var3 + 142);
			break;
		case 1:
			Animation.spriteFromGroup("chat", 1).drawSprite(71, var3 + 142);
			break;
		case 2:
			Animation.spriteFromGroup("chat", 1).drawSprite(137, var3 + 142);
			break;
		case 3:
			Animation.spriteFromGroup("chat", 1).drawSprite(203, var3 + 142);
			break;
		case 4:
			Animation.spriteFromGroup("chat", 1).drawSprite(269, var3 + 142);
			break;
		case 5:
			Animation.spriteFromGroup("chat", 1).drawSprite(335, var3 + 142);
			break;
		case 6:
			Animation.spriteFromGroup("chat", 1).drawSprite(401, var3 + 142);
		}

		if (this.ag == this.ah) {
			switch (this.ag) {
			case 0:
				Animation.spriteFromGroup("chat", 2).drawSprite(5, var3 + 142);
				break;
			case 1:
				Animation.spriteFromGroup("chat", 2).drawSprite(71, var3 + 142);
				break;
			case 2:
				Animation.spriteFromGroup("chat", 2)
						.drawSprite(137, var3 + 142);
				break;
			case 3:
				Animation.spriteFromGroup("chat", 2)
						.drawSprite(203, var3 + 142);
				break;
			case 4:
				Animation.spriteFromGroup("chat", 2)
						.drawSprite(269, var3 + 142);
				break;
			case 5:
				Animation.spriteFromGroup("chat", 2)
						.drawSprite(335, var3 + 142);
				break;
			case 6:
				Animation.spriteFromGroup("chat", 2)
						.drawSprite(401, var3 + 142);
			}
		} else {
			switch (this.ag) {
			case 0:
				Animation.spriteFromGroup("chat", 0).drawSprite(5, var3 + 142);
				break;
			case 1:
				Animation.spriteFromGroup("chat", 0).drawSprite(71, var3 + 142);
				break;
			case 2:
				Animation.spriteFromGroup("chat", 0)
						.drawSprite(137, var3 + 142);
				break;
			case 3:
				Animation.spriteFromGroup("chat", 0)
						.drawSprite(203, var3 + 142);
				break;
			case 4:
				Animation.spriteFromGroup("chat", 0)
						.drawSprite(269, var3 + 142);
				break;
			case 5:
				Animation.spriteFromGroup("chat", 0)
						.drawSprite(335, var3 + 142);
				break;
			case 6:
				Animation.spriteFromGroup("chat", 0)
						.drawSprite(401, var3 + 142);
			}
		}

		this.p11_full.shadow(true, 26, 16777215, "All", resizeMode == 0 ? 157 : clientHeight - 8);
		this.p11_full.shadow(true, 86, 16777215, "Game", resizeMode == 0 ? 152 : clientHeight - 12);
		this.p11_full.shadow(true, 150, 16777215, "Public", resizeMode == 0 ? 152
				: clientHeight - 12);
		this.p11_full.shadow(true, 212, 16777215, "Private", resizeMode == 0 ? 152
				: clientHeight - 12);
		this.p11_full.shadow(true, 286, 16777215, "Clan", resizeMode == 0 ? 152 : clientHeight - 12);
		this.p11_full.shadow(true, 349, 16777215, "Trade", resizeMode == 0 ? 152
				: clientHeight - 12);
		this.p11_full.shadow(true, 411, 16777215, "Global", resizeMode == 0 ? 152
				: clientHeight - 12);
		this.p11_full.a(var5[this.h], 100, var4[this.h], resizeMode == 0 ? 163
				: clientHeight - 1, true);
		this.p11_full.a(var9[this.G], 164, var8[this.G], resizeMode == 0 ? 163
				: clientHeight - 1, true);
		this.p11_full.a(var9[this.i], 230, var8[this.i], resizeMode == 0 ? 163
				: clientHeight - 1, true);
		this.p11_full.a(var7[this.f], 296, var6[this.f], resizeMode == 0 ? 163
				: clientHeight - 1, true);
		this.p11_full.a(var9[this.F], 362, var8[this.F], resizeMode == 0 ? 163
				: clientHeight - 1, true);
		this.p11_full.a(var7[this.g], 428, var6[this.g], resizeMode == 0 ? 163
				: clientHeight - 1, true);
		RSFont var2 = this.p12_full;
		if (this.hi) {
			this.b12_full.a(0, this.fu, var1 + 60, 259);
			this.b12_full.a(128, this.gC + "*", var1 + 80, 259);
		} else if (this.gJ == 1) {
			this.b12_full.a(0, "Enter amount:", var1 + 60, 259);
			this.b12_full.a(128, this.dr + "*", var1 + 80, 259);
		} else if (this.gJ == 2) {
			this.b12_full.a(0, "Enter name:", var1 + 60, 259);
			this.b12_full.a(128, this.dr + "*", var1 + 80, 259);
		} else {
			int var11;
			if (this.gJ != 3 && this.gJ != 4) {
				if (this.be != null) {
					this.b12_full.a(0, this.be, var1 + 60, 259);
					this.b12_full.a(128, "Click to continue", var1 + 80, 259);
				} else if (this.hA != -1) {
					this.a(0, 20, (Widget) Widget.widgets[this.hA], var1 + 20);
				} else if (this.dU != -1) {
					this.a(0, 20, (Widget) Widget.widgets[this.dU], var1 + 20);
				} else if (eQ || resizeMode == 0) {
					var3 = 0;
					Rasterizer2D.setBounds(var1 + 122, 8, 497, var1 + 7);

					int var13;
					int var14;
					int var17;
					int var16;
					for (var11 = 0; var11 < 500; ++var11) {
						if (this.ct[var11] != null) {
							var13 = this.cr[var11];
							var14 = this.aE[var11];
							boolean var15 = this.aF[var11];
							var17 = 114 - var3 * 14 + 3 + p;
							if (resizeMode != 0) {
								var17 += var1;
							}

							String var18 = this.cs[var11];
							byte var10 = 0;
							if (var18 != null && var18.startsWith("@irn@")) {
								var18 = var18.substring(5);
								var10 = 4;
							}

							if (var13 == 0 && (this.aG == 5 || this.aG == 0)
									&& (this.h == 0 || this.h == 1 && var15)) {
								if (var17 > var1 && var17 < var1 + 210) {
									int var10000 = resizeMode;
									var2.shadow(false, 11, 0, this.ct[var11], var17);
								}

								++var3;
							}

							if (var13 == 12 && (this.aG == 5 || this.aG == 0)
									&& (this.h == 0 || this.h == 1 && var15)) {
								if (var17 > var1 && var17 < var1 + 210) {
									var2.shadow(false, 11, 0, this.ct[var11]
											+ " @red@" + var18, var17);
								}

								++var3;
							}

							if ((var13 == 1 || var13 == 2)
									&& (var13 == 1 || this.G == 0 || this.G == 1
											&& this.c(var18))
									&& (this.aG == 1 || this.aG == 0)) {
								if (var17 > var1 && var17 < var1 + 210) {
									var16 = 11;
									if (var14 > 0) {
										var16 = 11 + this.a(var14, 12,
												var17 - 12);
									}

									if (var10 > 0) {
										var16 += this.a(var10, var16 + 1,
												var17 - 12);
									}

									var2.render(0, var18 + ":", var17, var16);
									var16 += var2.getColoredTextWidth(var18) + 8;
									var2.shadow(false, var16, 255, this.ct[var11],
											var17);
								}

								++var3;
							}

							if ((var13 == 3 || var13 == 7)
									&& (this.gu == 0 || this.aG == 2)
									&& (var13 == 7 || this.i == 0 || this.i == 1
											&& this.c(var18))
									&& (this.aG == 2 || this.aG == 0)) {
								if (var17 > var1 && var17 < var1 + 210) {
									if (resizeMode == 0) {
										var2.render(0, "From", var17, 11);
									} else {
										var2.shadow(true, 11, 16732758, "From",
												var17);
									}

									var16 = 11 + var2.getColoredTextWidth("From ");
									if (var14 > 0) {
										var16 += this.a(var14, var16 + 1,
												var17 - 12);
									}

									if (var10 > 0) {
										var16 += this.a(var10, var16 + 1,
												var17 - 12);
									}

									if (resizeMode != 0) {
										var2.shadow(true, var16, 16732758, var18
												+ ":", var17);
										var16 += var2.getColoredTextWidth(var18) + 8;
										var2.shadow(true, var16, 16732758,
												this.ct[var11], var17);
									} else {
										var2.render(0, var18 + ":", var17, var16);
										var16 += var2.getColoredTextWidth(var18) + 8;
										var2.render(8388608, this.ct[var11], var17,
												var16);
									}
								}

								++var3;
							}

							if (var13 == 4
									&& (this.F == 0 || this.F == 1
											&& this.c(var18))
									&& (this.aG == 3 || this.aG == 0)) {
								if (var17 > var1 && var17 < var1 + 210) {
									if (resizeMode != 0) {
										var2.shadow(true, 11, 16732758, var18 + " "
												+ this.ct[var11], var17);
									} else {
										var2.render(8388736, var18 + " "
												+ this.ct[var11], var17, 11);
									}
								}

								++var3;
							}

							if (var13 == 5 && this.gu == 0 && this.i < 2
									&& (this.aG == 2 || this.aG == 0)) {
								if (var17 > var1 && var17 < var1 + 210) {
									if (resizeMode != 0) {
										var2.shadow(true, 11, 16732758,
												this.ct[var11], var17);
									} else {
										var2.render(8388608, this.ct[var11], var17,
												11);
									}
								}

								++var3;
							}

							if (var13 == 6 && (this.gu == 0 || this.aG == 2)
									&& this.i < 2
									&& (this.aG == 2 || this.aG == 0)) {
								if (var17 > var1 && var17 < var1 + 210) {
									if (resizeMode != 0) {
										var2.shadow(true, 11, 16732758, "To "
												+ var18 + ":", var17);
										var2.shadow(true,
												15 + var2.getColoredTextWidth("To :" + var18),
												16732758, this.ct[var11], var17);
									} else {
										var2.render(0, "To " + var18 + ":", var17,
												11);
										var2.render(8388608, this.ct[var11], var17,
												15 + var2.getColoredTextWidth("To :" + var18));
									}
								}

								++var3;
							}

							if (var13 == 8 && (this.aG == 4 || this.aG == 0)) {
								if (var17 > var1 && var17 < var1 + 210) {
									if (resizeMode != 0) {
										var2.shadow(true, 11, 8270336, var18 + " "
												+ this.ct[var11], var17);
									} else {
										var2.render(8270336, var18 + " "
												+ this.ct[var11], var17, 11);
									}
								}

								++var3;
							}

							if (var13 == 9
									&& (this.g == 0 || this.g == 1)
									&& (this.aG == 9 || this.aG == 0
											&& this.g == 0)) {
								var2.render(255, this.aD, var17, 8);
								var16 = 8 + var2.getColoredTextWidth(this.aD);
								if (var14 > 0) {
									var16 += this.a(var14, var16 + 1,
											var17 - 12);
								}

								if (var10 > 0) {
									var16 += this.a(var10, var16 + 1,
											var17 - 12);
								}

								var2.render(0, var18 + ":", var17, var16);
								var16 += var2.getColoredTextWidth(var18) + 5;
								var2.shadow(false, var16, 8270336, this.ct[var11],
										var17);
								++var3;
							}

							if (var13 == 16
									&& (this.f == 0 || this.f == 1)
									&& (this.aG == 16 || this.aG == 0
											&& this.f == 0)) {
								String var20 = this.cu[var11];
								var2.render(0, "[", var17, 8);
								var2.render(255, var20, var17, 14);
								var13 = 14 + var2.getColoredTextWidth(var20);
								var2.render(0, "]", var17, var13);
								var13 += 6;
								if (var14 > 0) {
									var13 += this.a(var14, var13 + 1,
											var17 - 12);
								}

								if (var10 > 0) {
									var13 += this.a(var10, var13 + 1,
											var17 - 12);
								}

								var2.render(0, var18 + ":", var17, var13);
								var13 += var2.getColoredTextWidth(var18) + 5;
								var2.render(8388608, this.ct[var11], var17, var13);
								++var3;
							}
						}
					}

					Rasterizer2D.setDefaultBounds();
					if ((B = var3 * 14 + 7 + 5) < 111) {
						B = 111;
					}

					this.a(114, B - p - 114, 7 + (resizeMode == 0 ? 0
							: clientHeight - 165), 496, B);
					String var12;
					if (localPlayer != null && localPlayer.name != null) {
						var12 = localPlayer.name;
					} else {
						var12 = StringUtils.formatName(username);
					}

					if (resizeMode != 0) {
						var13 = 11;
						var14 = var1 + 133;
						if (this.bs > 0) {
							var13 = 11 + this.a(this.bs, 12, var14 - 12);
						}

						if (localPlayer.aJ) {
							var13 += this.a(4, var13 + 1, var14 - 12);
						}

						var2.render(0, var12 + ":", var14, var13);
						var2.b(255, var13 + 1 + var2.getColoredTextWidth(var12 + ": "), this.bI
								+ "*", var14, false);

						for (var16 = 0; var16 < 505; ++var16) {
							var17 = 100 - (int) ((double) var16 / 5.05D);
							Rasterizer2D.drawHorizontal(0, 1, var1 + 6, var17,
									var16 + 7);
							Rasterizer2D.drawHorizontal(0, 1, var1 + 121,
									var17, var16 + 7);
						}
					} else {
						var13 = 11;
						var14 = var1 + 133;
						if (this.bs > 0) {
							var13 = 11 + this.a(this.bs, 12, var14 - 12);
						}

						if (localPlayer.aJ) {
							var13 += this.a(4, var13 + 1, var14 - 12);
						}

						var2.render(0, var12 + ":", var14, var13);
						var2.b(255, var13 + 1 + var2.getColoredTextWidth(var12 + ": "), this.bI
								+ "*", var14, false);
						Rasterizer2D
								.drawHorizontal(var14 - 12, 8418912, 506, 7);
					}
				}
			} else {
				if (this.dr != "") {
					if (this.gJ == 3) {
						this.a(this.dr);
					} else if (this.gJ == 4) {
						this.b(this.dr);
					}
				}

				Rasterizer2D.setBounds(var1 + 121, 8, 512, var1 + 7);

				for (var3 = 0; var3 < this.ac; ++var3) {
					if ((var11 = 18 + var3 * 14 - this.af) > 0 && var11 < 132) {
						this.hy.a(this.ad[var3], 10, var11 + var1, 0, -1);
						this.hy.a(String.valueOf(this.ae[var3]), 220, var11
								+ var1, 0, -1);
					}
				}

				Rasterizer2D.setDefaultBounds();
				if (this.ac > 8) {
					this.a(114, this.af, var1 + 7, 496, this.ac * 14 + 7);
				}

				String var19;
				if (this.dr.length() == 0) {
					var19 = this.gJ == 3 ? "Item Search" : "Npc Search";
					this.hz.b(var19, 259, var1 + 40, 0, -1);
				} else if (this.ac == 0) {
					var19 = this.gJ == 3 ? "items" : "npcs";
					this.hz.b("No matching " + var19 + " found", 259,
							var1 + 70, 0, -1);
				}

				this.hy.a(this.dr + "*", 10, var1 + 132, 16777215, 0);
				Rasterizer2D.drawHorizontal_(7, var1 + 121, 505,
						resizeMode == 0 ? 8418912 : 16777215);
			}
		}

		if (this.bG && resizeMode == 0) {
			this.c(0, 338);
		}

		if (resizeMode == 0) {
			this.fX.drawImage(338, super.frameGraphics, 0);
		}

		this.fW.initializeRasterizer();
		Rasterizer3D.t = this.gi;
	}

	public final void startThread(Runnable runnable, int priority) {
		if (priority > 10) {
			priority = 10;
		}

		super.startThread(runnable, priority);
	}

	public static Socket a(int var0) throws UnknownHostException, IOException {
		return new Socket(InetAddress.getByName(hK), var0);
	}

	private void m() throws Throwable {
		if (this.eH == 0) {
			int var1 = super.T;
			if (this.fD == 1 && super.U >= 516 && super.V >= 160
					&& super.U <= 765 && super.V <= 205) {
				var1 = 0;
			}

			int var2;
			int var3;
			int var4;
			int var6;
			int var11;
			if (this.bG) {
				if (var1 != 1) {
					var2 = super.mouseX;
					var3 = super.mouseY;
					var2 -= 4;
					var3 -= 4;
					if (var2 < this.cA - 10 || var2 > this.cA + this.cC + 10
							|| var3 < this.cB - 10
							|| var3 > this.cB + this.cD + 10) {
						this.bG = false;
					}
				}

				if (var1 == 1) {
					var2 = this.cA;
					var3 = this.cB;
					var4 = this.cC;
					var11 = super.U;
					var1 = super.V;
					var11 -= 4;
					var1 -= 4;
					var6 = -1;

					for (int var7 = 0; var7 < this.fB; ++var7) {
						int var8 = var3 + 31 + (this.fB - 1 - var7) * 15;
						if (var11 > var2 && var11 < var2 + var4
								&& var1 > var8 - 13 && var1 < var8 + 3) {
							var6 = var7;
						}
					}

					if (var6 != -1) {
						this.n(var6);
					}

					this.bG = false;
					return;
				}
			} else {
				if (var1 == 1
						&& this.fB > 0
						&& ((var2 = this.eV[this.fB - 1]) >= 700 && var2 <= 705
								|| var2 == 632 || var2 == 78 || var2 == 867
								|| var2 == 431 || var2 == 53 || var2 == 74
								|| var2 == 454 || var2 == 539 || var2 == 493
								|| var2 == 847 || var2 == 447 || var2 == 1125)) {
					var3 = this.eT[this.fB - 1];
					var4 = this.eU[this.fB - 1];
					Widget var5;
					if ((var5 = Widget.widgets[var4]).swappableItems || var5.replaceItems) {
						this.gV = false;
						this.dh = 0;
						this.eF = var4;
						this.eG = var3;
						this.eH = 2;
						this.eI = super.U;
						this.eJ = super.V;
						if (Widget.widgets[var4].parent == j) {
							this.eH = 1;
						}

						if (Widget.widgets[var4].parent == this.hA) {
							this.eH = 3;
						}

						return;
					}
				}

				if (var1 == 1 && (this.hg == 1 || this.g(this.fB - 1))
						&& this.fB > 2) {
					var1 = 2;
				}

				if (var1 == 1 && this.fB > 0) {
					this.n(this.fB - 1);
				}

				if (var1 == 2 && this.fB > 0) {
					this.Q();
				}

				if (this.dG == 0 && super.T == 1) {
					var2 = resizeMode == 0 ? super.U - 25 - 545 : super.U - clientWidth
							+ 183;
					var3 = resizeMode == 0 ? super.V - 9 : super.V - 10;
					if (var2 >= 0
							&& var3 >= 0
							&& var2 < 146
							&& var3 < 151
							&& (super.mouseX < clientWidth - 21
									|| super.mouseX > clientWidth
									|| super.mouseY < 0 || super.mouseY > 21)) {
						boolean var10 = true;
						var10 = false;
						var10 = false;
						if (Math.pow((double) (77 - var2), 2.0D)
								+ Math.pow((double) (77 - var3), 2.0D) < Math
									.pow(77.0D, 2.0D)) {
							var2 -= 73;
							var3 -= 75;
							var4 = this.camYaw + this.gB & 2047;
							var11 = Rasterizer3D.SINE[var4];
							var4 = Rasterizer3D.COSINE[var4];
							var11 = var11 * (this.ga + 256) >> 8;
							var4 = var4 * (this.ga + 256) >> 8;
							var6 = var3 * var11 + var2 * var4 >> 11;
							var4 = var3 * var4 - var2 * var11 >> 11;
							var11 = localPlayer.X + var6 >> 7;
							var4 = localPlayer.Y - var4 >> 7;
							if (this.a(1, 0, 0, 0, localPlayer.pathY[0], 0, 0,
									var4, localPlayer.pathX[0], true, var11)) {
								this.gs.writeByte(var2);
								this.gs.writeByte(var3);
								this.gs.writeShort(this.camYaw);
								this.gs.writeByte(57);
								this.gs.writeByte(this.gB);
								this.gs.writeByte(this.ga);
								this.gs.writeByte(89);
								this.gs.writeShort(localPlayer.X);
								this.gs.writeShort(localPlayer.Y);
								this.gs.writeByte(this.ho);
								this.gs.writeByte(63);
							}
						}

						if (++fs > 1151) {
							fs = 0;
							this.gs.a(246);
							this.gs.writeByte(0);
							var4 = this.gs.position;
							if ((int) (Math.random() * 2.0D) == 0) {
								this.gs.writeByte(101);
							}

							this.gs.writeByte(197);
							this.gs.writeShort((int) (Math.random() * 65536.0D));
							this.gs.writeByte((int) (Math.random() * 256.0D));
							this.gs.writeByte(67);
							this.gs.writeShort(14214);
							if ((int) (Math.random() * 2.0D) == 0) {
								this.gs.writeShort(29487);
							}

							this.gs.writeShort((int) (Math.random() * 65536.0D));
							if ((int) (Math.random() * 2.0D) == 0) {
								this.gs.writeByte(220);
							}

							this.gs.writeByte(180);
							this.gs.h(this.gs.position - var4);
						}
					}
				}

				int[] var9 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
						12, 13 };
				if (resizeMode == 0) {
					if (super.T == 1) {
						if (super.U >= 524 && super.U <= 561 && super.V >= 169
								&& super.V < 205 && u[0] != -1) {
							C = 0;
							fh = true;
						}

						if (super.U >= 562 && super.U <= 594 && super.V >= 168
								&& super.V < 205 && u[1] != -1) {
							C = 1;
							fh = true;
						}

						if (super.U >= 595 && super.U <= 626 && super.V >= 168
								&& super.V < 205 && u[2] != -1) {
							C = 2;
							fh = true;
						}

						if (super.U >= 627 && super.U <= 660 && super.V >= 168
								&& super.V < 203 && u[3] != -1) {
							C = 3;
							fh = true;
						}

						if (super.U >= 661 && super.U <= 693 && super.V >= 168
								&& super.V < 205 && u[4] != -1) {
							C = 4;
							fh = true;
						}

						if (super.U >= 694 && super.U <= 725 && super.V >= 168
								&& super.V < 205 && u[5] != -1) {
							C = 5;
							fh = true;
						}

						if (super.U >= 726 && super.U <= 765 && super.V >= 169
								&& super.V < 205 && u[6] != -1) {
							C = 6;
							fh = true;
						}

						if (super.U >= 524 && super.U <= 561 && super.V >= 466
								&& super.V < 503 && u[7] != -1) {
							C = 7;
							fh = true;
						}

						if (super.U >= 562 && super.U <= 594 && super.V >= 466
								&& super.V < 503 && u[8] != -1) {
							C = 8;
							fh = true;
						}

						if (super.U >= 595 && super.U <= 627 && super.V >= 466
								&& super.V < 503 && u[9] != -1) {
							C = 9;
							fh = true;
						}

						if (super.U >= 627 && super.U <= 664 && super.V >= 466
								&& super.V < 503 && u[10] != -1) {
							C = 10;
							fh = true;
						}

						if (super.U >= 661 && super.U <= 694 && super.V >= 466
								&& super.V < 503 && u[11] != -1) {
							C = 11;
							fh = true;
						}

						if (super.U >= 695 && super.U <= 725 && super.V >= 466
								&& super.V < 503 && u[12] != -1) {
							C = 12;
							fh = true;
						}

						if (super.U >= 726 && super.U <= 765 && super.V >= 466
								&& super.V < 502 && u[13] != -1) {
							C = 13;
							fh = true;
						}
					}
				} else if (resizeMode != 0 && clientWidth < this.eR && super.T == 1) {
					if (super.U >= clientWidth - 241
							&& super.U <= clientWidth - 204
							&& super.V >= clientHeight - 72
							&& super.V < clientHeight - 40 && u[0] != -1) {
						if (this.gp == -1) {
							if (C == var9[0]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[0];
						fh = true;
					}

					if (super.U >= clientWidth - 202
							&& super.U <= clientWidth - 171
							&& super.V >= clientHeight - 72
							&& super.V < clientHeight - 40 && u[1] != -1) {
						if (this.gp == -1) {
							if (C == var9[1]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[1];
						fh = true;
					}

					if (super.U >= clientWidth - 170
							&& super.U <= clientWidth - 139
							&& super.V >= clientHeight - 72
							&& super.V < clientHeight - 40 && u[2] != -1) {
						if (this.gp == -1) {
							if (C == var9[2]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[2];
						fh = true;
					}

					if (super.U >= clientWidth - 138
							&& super.U <= clientWidth - 105
							&& super.V >= clientHeight - 72
							&& super.V < clientHeight - 40 && u[3] != -1) {
						if (this.gp == -1) {
							if (C == var9[3]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[3];
						fh = true;
					}

					if (super.U >= clientWidth - 104
							&& super.U <= clientWidth - 72
							&& super.V >= clientHeight - 72
							&& super.V < clientHeight - 40 && u[4] != -1) {
						if (this.gp == -1) {
							if (C == var9[4]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[4];
						fh = true;
					}

					if (super.U >= clientWidth - 71
							&& super.U <= clientWidth - 39
							&& super.V >= clientHeight - 72
							&& super.V < clientHeight - 40 && u[5] != -1) {
						if (this.gp == -1) {
							if (C == var9[5]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[5];
						fh = true;
					}

					if (super.U >= clientWidth - 38 && super.U <= clientWidth
							&& super.V >= clientHeight - 72
							&& super.V < clientHeight - 40 && u[6] != -1) {
						if (this.gp == -1) {
							if (C == var9[6]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[6];
						fh = true;
					}

					if (super.U >= clientWidth - 241
							&& super.U <= clientWidth - 204
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[7] != -1) {
						if (this.gp == -1) {
							if (C == var9[7]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[7];
						fh = true;
					}

					if (super.U >= clientWidth - 202
							&& super.U <= clientWidth - 171
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[8] != -1) {
						if (this.gp == -1) {
							if (C == var9[8]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[8];
						fh = true;
					}

					if (super.U >= clientWidth - 170
							&& super.U <= clientWidth - 139
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[9] != -1) {
						if (this.gp == -1) {
							if (C == var9[9]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[9];
						fh = true;
					}

					if (super.U >= clientWidth - 138
							&& super.U <= clientWidth - 105
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[10] != -1) {
						if (this.gp == -1) {
							if (C == var9[10]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[10];
						fh = true;
					}

					if (super.U >= clientWidth - 104
							&& super.U <= clientWidth - 72
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[11] != -1) {
						if (this.gp == -1) {
							if (C == var9[11]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[11];
						fh = true;
					}

					if (super.U >= clientWidth - 71
							&& super.U <= clientWidth - 39
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[12] != -1) {
						if (this.gp == -1) {
							if (C == var9[12]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[12];
						fh = true;
					}

					if (super.U >= clientWidth - 38 && super.U <= clientWidth
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[13] != -1) {
						if (this.gp == -1) {
							if (C == var9[13]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[13];
						fh = true;
					}
				}

				if (clientWidth >= this.eR && super.T == 1) {
					if (super.U >= clientWidth - 462
							&& super.U <= clientWidth - 429
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[0] != -1) {
						if (this.gp == -1) {
							if (C == var9[0]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[0];
						fh = true;
					}

					if (super.U >= clientWidth - 429
							&& super.U <= clientWidth - 396
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[1] != -1) {
						if (this.gp == -1) {
							if (C == var9[1]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[1];
						fh = true;
					}

					if (super.U >= clientWidth - 396
							&& super.U <= clientWidth - 363
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[2] != -1) {
						if (this.gp == -1) {
							if (C == var9[2]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[2];
						fh = true;
					}

					if (super.U >= clientWidth - 363
							&& super.U <= clientWidth - 330
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[3] != -1) {
						if (this.gp == -1) {
							if (C == var9[3]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[3];
						fh = true;
					}

					if (super.U >= clientWidth - 330
							&& super.U <= clientWidth - 297
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[4] != -1) {
						if (this.gp == -1) {
							if (C == var9[4]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[4];
						fh = true;
					}

					if (super.U >= clientWidth - 297
							&& super.U <= clientWidth - 264
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[5] != -1) {
						if (this.gp == -1) {
							if (C == var9[5]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[5];
						fh = true;
					}

					if (super.U >= clientWidth - 264
							&& super.U <= clientWidth - 231
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[6] != -1) {
						if (this.gp == -1) {
							if (C == var9[6]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[6];
						fh = true;
					}

					if (super.U >= clientWidth - 231
							&& super.U <= clientWidth - 198
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[7] != -1) {
						if (this.gp == -1) {
							if (C == var9[7]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[7];
						fh = true;
					}

					if (super.U >= clientWidth - 198
							&& super.U <= clientWidth - 165
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[8] != -1) {
						if (this.gp == -1) {
							if (C == var9[8]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[8];
						fh = true;
					}

					if (super.U >= clientWidth - 165
							&& super.U <= clientWidth - 132
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[9] != -1) {
						if (this.gp == -1) {
							if (C == var9[9]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[9];
						fh = true;
					}

					if (super.U >= clientWidth - 132
							&& super.U <= clientWidth - 99
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[10] != -1) {
						if (this.gp == -1) {
							if (C == var9[10]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[10];
						fh = true;
					}

					if (super.U >= clientWidth - 99
							&& super.U <= clientWidth - 66
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[11] != -1) {
						if (this.gp == -1) {
							if (C == var9[11]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[11];
						fh = true;
					}

					if (super.U >= clientWidth - 66
							&& super.U <= clientWidth - 33
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[12] != -1) {
						if (this.gp == -1) {
							if (C == var9[12]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[12];
						fh = true;
					}

					if (super.U >= clientWidth - 33 && super.U <= clientWidth
							&& super.V >= clientHeight - 37
							&& super.V < clientHeight && u[13] != -1) {
						if (this.gp == -1) {
							if (C == var9[13]) {
								this.eP = !this.eP;
							} else {
								this.eP = true;
							}
						}

						C = var9[13];
						fh = true;
					}
				}

				var2 = 0;
				if (resizeMode != 0) {
					var2 = clientHeight - 503;
				}

				if (super.mouseX >= 5 && super.mouseX <= 61
						&& super.mouseY >= var2 + 482
						&& super.mouseY <= var2 + 503) {
					this.ag = 0;
					D = true;
				} else if (super.mouseX >= 71 && super.mouseX <= 127
						&& super.mouseY >= var2 + 482
						&& super.mouseY <= var2 + 503) {
					this.ag = 1;
					D = true;
				} else if (super.mouseX >= 137 && super.mouseX <= 193
						&& super.mouseY >= var2 + 482
						&& super.mouseY <= var2 + 503) {
					this.ag = 2;
					D = true;
				} else if (super.mouseX >= 203 && super.mouseX <= 259
						&& super.mouseY >= var2 + 482
						&& super.mouseY <= var2 + 503) {
					this.ag = 3;
					D = true;
				} else if (super.mouseX >= 269 && super.mouseX <= 325
						&& super.mouseY >= var2 + 482
						&& super.mouseY <= var2 + 503) {
					this.ag = 4;
					D = true;
				} else if (super.mouseX >= 335 && super.mouseX <= 391
						&& super.mouseY >= var2 + 482
						&& super.mouseY <= var2 + 503) {
					this.ag = 5;
					D = true;
				} else if (super.mouseX >= 401 && super.mouseX <= 457
						&& super.mouseY >= var2 + 482
						&& super.mouseY <= var2 + 503) {
					this.ag = 6;
					D = true;
				} else {
					this.ag = -1;
					D = true;
				}

				if (super.T == 1) {
					if (super.U >= 5 && super.U <= 61 && super.V >= var2 + 482
							&& super.V <= var2 + 505) {
						if (resizeMode != 0) {
							if (this.ai != 0) {
								this.ah = 0;
								this.aG = 0;
								D = true;
								this.ai = 0;
								return;
							}

							eQ = !eQ;
							return;
						}

						this.ah = 0;
						this.aG = 0;
						D = true;
						this.ai = 0;
						return;
					}

					if (super.U >= 71 && super.U <= 127
							&& super.V >= var2 + 482 && super.V <= var2 + 505) {
						if (resizeMode != 0) {
							if (this.ai != 1 && resizeMode != 0) {
								this.ah = 1;
								this.aG = 5;
								D = true;
								this.ai = 1;
								return;
							}

							eQ = !eQ;
							return;
						}

						this.ah = 1;
						this.aG = 5;
						D = true;
						this.ai = 1;
						return;
					}

					if (super.U >= 137 && super.U <= 193
							&& super.V >= var2 + 482 && super.V <= var2 + 505) {
						if (resizeMode != 0) {
							if (this.ai != 2 && resizeMode != 0) {
								this.ah = 2;
								this.aG = 1;
								D = true;
								this.ai = 2;
								return;
							}

							eQ = !eQ;
							return;
						}

						this.ah = 2;
						this.aG = 1;
						D = true;
						this.ai = 2;
						return;
					}

					if (super.U >= 203 && super.U <= 259
							&& super.V >= var2 + 482 && super.V <= var2 + 505) {
						if (resizeMode != 0) {
							if (this.ai != 3 && resizeMode != 0) {
								this.ah = 3;
								this.aG = 2;
								D = true;
								this.ai = 3;
								return;
							}

							eQ = !eQ;
							return;
						}

						this.ah = 3;
						this.aG = 2;
						D = true;
						this.ai = 3;
						return;
					}

					if (super.U >= 269 && super.U <= 325
							&& super.V >= var2 + 482 && super.V <= var2 + 505) {
						if (resizeMode != 0) {
							if (this.ai != 16 && resizeMode != 0) {
								this.ah = 4;
								this.aG = 16;
								D = true;
								this.ai = 16;
								return;
							}

							eQ = !eQ;
							return;
						}

						this.ah = 4;
						this.aG = 16;
						D = true;
						this.ai = 16;
						return;
					}

					if (super.U >= 335 && super.U <= 391
							&& super.V >= var2 + 482 && super.V <= var2 + 505) {
						if (resizeMode != 0) {
							if (this.ai != 5 && resizeMode != 0) {
								this.ah = 5;
								this.aG = 3;
								D = true;
								this.ai = 5;
								return;
							}

							eQ = !eQ;
							return;
						}

						this.ah = 5;
						this.aG = 3;
						D = true;
						this.ai = 5;
						return;
					}

					if (super.U >= 401 && super.U <= 457
							&& super.V >= var2 + 482 && super.V <= var2 + 505) {
						if (resizeMode != 0 && (this.ai == 9 || resizeMode == 0)) {
							eQ = !eQ;
							return;
						}

						this.ah = 6;
						this.aG = 9;
						D = true;
						this.ai = 9;
					}
				}
			}

		}
	}

	private void n() {
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		int var7;
		int var8;
		int var14;
		try {
			this.de = -1;
			this.eg.clear();
			this.projectiles.clear();
			Rasterizer3D.e();
			o();
			this.scene.reset();
			System.gc();

			for (var1 = 0; var1 < 4; ++var1) {
				this.gQ[var1].a();
			}

			for (var1 = 0; var1 < 4; ++var1) {
				for (var2 = 0; var2 < 104; ++var2) {
					for (var3 = 0; var3 < 104; ++var3) {
						this.hj[var1][var2][var3] = 0;
					}
				}
			}

			MapRegion var12 = new MapRegion(this.hj, this.gE);
			var2 = this.gj.length;
			this.gs.a(0);
			if (!this.fS) {
				for (var3 = 0; var3 < var2; ++var3) {
					var4 = (this.gR[var3] >> 8 << 6) - this.dO;
					var5 = ((this.gR[var3] & 255) << 6) - this.dP;
					byte[] var6 = this.gj[var3];
					if (Class32.b(SignLink.getLocalCacheDirectory() + "maps/"
							+ this.gS[var3] + ".dat")) {
						var6 = Class32.a(SignLink.getLocalCacheDirectory()
								+ "maps/" + this.gS[var3] + ".dat");
					}

					if (var6 != null) {
						var12.decodeRegionMapData(var6, var5, var4, this.eq - 6 << 3,
								this.er - 6 << 3, this.gQ);
					}
				}

				for (var3 = 0; var3 < var2; ++var3) {
					var4 = (this.gR[var3] >> 8 << 6) - this.dO;
					var5 = ((this.gR[var3] & 255) << 6) - this.dP;
					if (this.gj[var3] == null && this.er < 800) {
						var12.a(var5, 64, 64, var4);
					}
				}

				if (++fb > 160) {
					fb = 0;
					this.gs.a(238);
					this.gs.writeByte(96);
				}

				this.gs.a(0);

				for (var3 = 0; var3 < var2; ++var3) {
					byte[] var13;
					if ((var13 = this.ha[var3]) != null) {
						var5 = (this.gR[var3] >> 8 << 6) - this.dO;
						var14 = ((this.gR[var3] & 255) << 6) - this.dP;
						var12.decodeLandscapes(var5, this.gQ, var14, this.scene, var13);
					}
				}
			}

			if (this.fS) {
				var3 = 0;

				label226: while (true) {
					int var9;
					int var10;
					if (var3 >= 4) {
						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								if (this.fz[0][var3][var4] == -1) {
									var12.a(var4 << 3, 8, 8, var3 << 3);
								}
							}
						}

						this.gs.a(0);
						var3 = 0;

						while (true) {
							if (var3 >= 4) {
								break label226;
							}

							for (var4 = 0; var4 < 13; ++var4) {
								for (var5 = 0; var5 < 13; ++var5) {
									if ((var14 = this.fz[var3][var4][var5]) != -1) {
										var7 = var14 >> 24 & 3;
										var8 = var14 >> 1 & 3;
										var2 = var14 >> 14 & 1023;
										var14 = var14 >> 3 & 2047;
										var9 = (var2 / 8 << 8) + var14 / 8;

										for (var10 = 0; var10 < this.gR.length; ++var10) {
											if (this.gR[var10] == var9
													&& this.ha[var10] != null) {
												var12.decodeConstructedLandscapes(this.gQ, this.scene,
														var7, var4 << 3,
														(var14 & 7) << 3, var3,
														this.ha[var10],
														(var2 & 7) << 3, var8,
														var5 << 3);
												break;
											}
										}
									}
								}
							}

							++var3;
						}
					}

					for (var4 = 0; var4 < 13; ++var4) {
						for (var5 = 0; var5 < 13; ++var5) {
							if ((var14 = this.fz[var3][var4][var5]) != -1) {
								var7 = var14 >> 24 & 3;
								var8 = var14 >> 1 & 3;
								var2 = var14 >> 14 & 1023;
								var14 = var14 >> 3 & 2047;
								var9 = (var2 / 8 << 8) + var14 / 8;

								for (var10 = 0; var10 < this.gR.length; ++var10) {
									if (this.gR[var10] == var9
											&& this.gj[var10] != null) {
										var12.a(var7, var8, this.gQ, var4 << 3,
												(var2 & 7) << 3,
												this.gj[var10],
												(var14 & 7) << 3, var3,
												var5 << 3);
										break;
									}
								}
							}
						}
					}

					++var3;
				}
			}

			this.gs.a(0);
			var12.a(this.gQ, this.scene);
			this.fW.initializeRasterizer();
			this.gs.a(0);
			int var10000 = MapRegion.b;
			this.scene.a(0);

			for (var4 = 0; var4 < 104; ++var4) {
				for (var5 = 0; var5 < 104; ++var5) {
					this.b(var4, var5);
				}
			}

			if (++eb > 98) {
				eb = 0;
				this.gs.a(150);
			}

			this.z();
		} catch (Exception var11) {
			;
		}

		ObjectDefinition.baseModels.removeAll();
		if (super.scapeFrame != null) {
			this.gs.a(210);
			this.gs.writeInt(1057001181);
		}

		System.gc();
		Rasterizer3D.f();
		this.resourceProvider.e();
		var1 = (this.eq - 6) / 8 - 1;
		var2 = (this.eq + 6) / 8 + 1;
		var3 = (this.er - 6) / 8 - 1;
		var4 = (this.er + 6) / 8 + 1;
		if (this.fI) {
			var1 = 49;
			var2 = 50;
			var3 = 49;
			var4 = 50;
		}

		for (var5 = var1; var5 <= var2; ++var5) {
			for (var14 = var3; var14 <= var4; ++var14) {
				if (var5 == var1 || var5 == var2 || var14 == var3
						|| var14 == var4) {
					if ((var7 = this.resourceProvider.a(0, var14, var5)) != -1) {
						this.resourceProvider.b(var7, 3);
					}

					if ((var8 = this.resourceProvider.a(1, var14, var5)) != -1) {
						this.resourceProvider.b(var8, 3);
					}
				}
			}
		}

	}

	private static void o() {
		ObjectDefinition.baseModels.removeAll();
		ObjectDefinition.x.removeAll();
		ActorDefinition.modelCache.removeAll();
		ItemDefinition.models.removeAll();
		ItemDefinition.sprites.removeAll();
		Player.modelCache.removeAll();
		SpotAnimation.h.removeAll();
	}

	private void i(int var1) {
		int[] var2 = this.hn.pixels;
		int var3 = this.hn.pixels.length;

		int var4;
		for (var4 = 0; var4 < var3; ++var4) {
			var2[var4] = 0;
		}

		int var5;
		for (var4 = 1; var4 < 103; ++var4) {
			var3 = 24628 + (103 - var4 << 9 << 2);

			for (var5 = 1; var5 < 103; ++var5) {
				if ((this.hj[var1][var5][var4] & 24) == 0) {
					this.scene.a(var2, var3, var1, var5, var4);
				}

				if (var1 < 3 && (this.hj[var1 + 1][var5][var4] & 8) != 0) {
					this.scene.a(var2, var3, var1 + 1, var5, var4);
				}

				var3 += 4;
			}
		}

		var4 = (238 + (int) (Math.random() * 20.0D) - 10 << 16)
				+ (238 + (int) (Math.random() * 20.0D) - 10 << 8)
				+ (238 + (int) (Math.random() * 20.0D) - 10);
		var3 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
		Sprite var9 = this.hn;
		Rasterizer2D.init(this.hn.height, var9.width, var9.pixels);

		int var10;
		for (var5 = 1; var5 < 103; ++var5) {
			for (var10 = 1; var10 < 103; ++var10) {
				if ((this.hj[var1][var10][var5] & 24) == 0) {
					this.b(var5, var4, var10, var3, var1);
				}

				if (var1 < 3 && (this.hj[var1 + 1][var10][var5] & 8) != 0) {
					this.b(var5, var4, var10, var3, var1 + 1);
				}
			}
		}

		this.fW.initializeRasterizer();
		this.es = 0;

		for (var5 = 0; var5 < 104; ++var5) {
			for (var10 = 0; var10 < 104; ++var10) {
				if ((var1 = this.scene.l(this.cc, var5, var10)) != 0
						&& (var1 = ObjectDefinition.byId(var1 >> 14 & 32767).minimapFunction) >= 0) {
					var3 = var5;
					var4 = var10;
					if (var1 != 22 && var1 != 29 && var1 != 34 && var1 != 36
							&& var1 != 46 && var1 != 47 && var1 != 48) {
						int[][] var6 = this.gQ[this.cc].adjacencies;

						for (int var7 = 0; var7 < 10; ++var7) {
							int var8;
							if ((var8 = (int) (Math.random() * 4.0D)) == 0
									&& var3 > 0 && var3 > var5 - 3
									&& (var6[var3 - 1][var4] & 19398920) == 0) {
								--var3;
							}

							if (var8 == 1 && var3 < 103 && var3 < var5 + 3
									&& (var6[var3 + 1][var4] & 19399040) == 0) {
								++var3;
							}

							if (var8 == 2 && var4 > 0 && var4 > var10 - 3
									&& (var6[var3][var4 - 1] & 19398914) == 0) {
								--var4;
							}

							if (var8 == 3 && var4 < 103 && var4 < var10 + 3
									&& (var6[var3][var4 + 1] & 19398944) == 0) {
								++var4;
							}
						}
					}

					this.fH[this.es] = this.dN[var1];
					this.et[this.es] = var3;
					this.eu[this.es] = var4;
					++this.es;
				}
			}
		}

	}

	private void b(int var1, int var2) {
		LinkedList var3;
		if ((var3 = this.aR[this.cc][var1][var2]) == null) {
			this.scene.d(this.cc, var1, var2);
		} else {
			int var4 = -99999999;
			Item var5 = null;

			Item var6;
			int var8;
			for (var6 = (Item) var3.getBack(); var6 != null; var6 = (Item) var3
					.getPrevious()) {
				ItemDefinition var7;
				var8 = (var7 = ItemDefinition.fromID(var6.itemId)).value;
				if (var7.stackable) {
					var8 *= var6.itemCount + 1;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.insertFront((Node) var5);
			var6 = null;
			Item var9 = null;

			for (Item var10 = (Item) var3.getBack(); var10 != null; var10 = (Item) var3
					.getPrevious()) {
				if (var10.itemId != ((Item) var5).itemId && var6 == null) {
					var6 = var10;
				}

				if (var10.itemId != ((Item) var5).itemId
						&& var10.itemId != ((Item) var6).itemId && var9 == null) {
					var9 = var10;
				}
			}

			var8 = var1 + (var2 << 7) + 1610612736;
			this.scene.a(var1, var8, (Renderable) var6,
					this.b(this.cc, (var2 << 7) + 64, (var1 << 7) + 64),
					(Renderable) var9, (Renderable) var5, this.cc, var2);
		}
	}

	private void a(boolean var1) {
		for (int var2 = 0; var2 < this.aX; ++var2) {
			Npc var3 = this.aW[this.aY[var2]];
			int var4 = 536870912 + (this.aY[var2] << 14);
			if (var3 != null && var3.isVisible()
					&& var3.npcDefinition.priorityRender == var1) {
				int var5 = var3.X >> 7;
				int var6 = var3.Y >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.N == 1 && (var3.X & 127) == 64
							&& (var3.Y & 127) == 64) {
						if (this.ci[var5][var6] == this.hp) {
							continue;
						}

						this.ci[var5][var6] = this.hp;
					}

					if (!var3.npcDefinition.clickable) {
						var4 += Integer.MIN_VALUE;
					}

					this.scene.addEntity(this.cc, var3.Z,
							this.b(this.cc, var3.Y, var3.X), var4, var3.Y,
							(var3.N - 1 << 6) + 60, var3.X, var3, var3.O);
				}
			}
		}

	}

	private void a(int var1, Widget var2, int var3, int var4, int var5, int var6) {
		if (var2 == null) {
			var2 = Widget.widgets[21356];
		}

		if (var2.group == 0 && var2.children != null && !var2.aa) {
			if (var3 >= var1 && var5 >= var4 && var3 <= var1 + var2.width
					&& var5 <= var4 + var2.height) {
				int var7 = var2.children.length;

				for (int var8 = 0; var8 < var7; ++var8) {
					int var9 = var2.childX[var8] + var1;
					int var10 = var2.childY[var8] + var4 - var6;
					Widget var11 = Widget.widgets[var2.children[var8]];
					var9 += var11.Y;
					var10 += var11.Z;
					if ((var11.hoverId >= 0 || var11.defaultHoverColor != 0) && var3 >= var9
							&& var5 >= var10 && var3 < var9 + var11.width
							&& var5 < var10 + var11.height) {
						if (var11.hoverId >= 0) {
							this.bH = var11.hoverId;
						} else {
							this.bH = var11.id;
						}
					}

					if (var11.group == 8 && var3 >= var9 && var5 >= var10
							&& var3 < var9 + var11.width && var5 < var10 + var11.height) {
						this.hP = var11.id;
					}

					if (var11.group == 0) {
						this.a(var9, var11, var3, var10, var5, var11.q);
						if (var11.W > var11.height) {
							this.a(var9 + var11.width, var11.height, var3, var5, var11,
									var10, true, var11.W);
						}
					} else {
						int var13;
						int var14;
						if (var11.optionType == 1 && var3 >= var9 && var5 >= var10
								&& var3 < var9 + var11.width
								&& var5 < var10 + var11.height) {
							boolean var12 = false;
							if (var11.contentType != 0) {
								var14 = var11.contentType;
								boolean var10000;
								if (var11.contentType > 0 && var14 <= 200 || var14 >= 701
										&& var14 <= 900) {
									if (var14 >= 801) {
										var14 -= 701;
									} else if (var14 >= 701) {
										var14 -= 601;
									} else if (var14 >= 101) {
										var14 -= 101;
									} else {
										--var14;
									}

									this.gw[this.fB] = "Remove @whi@"
											+ this.eD[var14];
									this.eV[this.fB] = 792;
									++this.fB;
									this.gw[this.fB] = "Message @whi@"
											+ this.eD[var14];
									this.eV[this.fB] = 639;
									++this.fB;
									var10000 = true;
								} else if (var14 >= 401 && var14 <= 500) {
									this.gw[this.fB] = "Remove @whi@" + var11.defaultText;
									this.eV[this.fB] = 322;
									++this.fB;
									var10000 = true;
								} else {
									var10000 = false;
								}

								label421: {
									if (!var10000) {
										label418: {
											var14 = var11.contentType;
											if (var11.contentType >= 20001
													&& var14 <= 20101) {
												var13 = var14 - 20001;
												String var19;
												if ((var19 = StringUtils
														.longToName(this.cH[var13]))
														.length() > 0) {
													if (var19
															.startsWith("@cc1@")
															|| var19.startsWith("@cc2@")
															|| var19.startsWith("@cc3@")) {
														var19 = var19
																.substring(5);
													}

													var19 = StringUtils
															.formatName(var19);
													this.gw[this.fB] = "Ban @whi@"
															+ var19;
													this.eV[this.fB] = 1502;
													++this.fB;
													this.gw[this.fB] = "Demote @whi@"
															+ var19;
													this.eV[this.fB] = 1501;
													++this.fB;
													this.gw[this.fB] = "Promote @whi@"
															+ var19;
													this.eV[this.fB] = 1500;
													++this.fB;
													var10000 = true;
													break label418;
												}
											}

											var10000 = false;
										}

										if (!var10000) {
											var10000 = false;
											break label421;
										}
									}

									var10000 = true;
								}

								var12 = var10000;
							}

							if (!var12) {
								this.gw[this.fB] = var11.hover;
								this.eV[this.fB] = 315;
								this.eU[this.fB] = var11.id;
								++this.fB;
							}
						}

						if (var11.optionType == 2 && this.fD == 0 && var3 >= var9
								&& var5 >= var10 && var3 < var9 + var11.width
								&& var5 < var10 + var11.height) {
							String var18 = var11.optionCircumfix;
							if (var11.optionCircumfix.indexOf(" ") != -1) {
								var18 = var18.substring(0, var18.indexOf(" "));
							}

							if (var11.optionText.endsWith("Rush")
									|| var11.optionText.endsWith("Burst")
									|| var11.optionText.endsWith("Blitz")
									|| var11.optionText.endsWith("Barrage")
									|| var11.optionText.endsWith("strike")
									|| var11.optionText.endsWith("bolt")
									|| var11.optionText.equals("Crumble undead")
									|| var11.optionText.endsWith("blast")
									|| var11.optionText.endsWith("wave")
									|| var11.optionText.equals("Claws of Guthix")
									|| var11.optionText.equals("Flames of Zamorak")
									|| var11.optionText.equals("Magic Dart")) {
								this.gw[this.fB] = "Autocast @gre@" + var11.optionText;
								this.eV[this.fB] = 104;
								this.eU[this.fB] = var11.id;
								++this.fB;
							}

							this.gw[this.fB] = var18 + " @gre@" + var11.optionText;
							this.eV[this.fB] = 626;
							this.eU[this.fB] = var11.id;
							++this.fB;
						}

						if (var11.optionType == 3 && var3 >= var9 && var5 >= var10
								&& var3 < var9 + var11.width
								&& var5 < var10 + var11.height) {
							this.gw[this.fB] = "Close";
							this.eV[this.fB] = 200;
							this.eU[this.fB] = var11.id;
							++this.fB;
						}

						if (var11.optionType == 4 && var3 >= var9 && var5 >= var10
								&& var3 < var9 + var11.width
								&& var5 < var10 + var11.height) {
							this.gw[this.fB] = var11.hover;
							this.eV[this.fB] = 169;
							this.eU[this.fB] = var11.id;
							++this.fB;
							String var21 = var11.a;
						}

						if (var11.optionType == 5 && var3 >= var9 && var5 >= var10
								&& var3 < var9 + var11.width
								&& var5 < var10 + var11.height) {
							this.gw[this.fB] = var11.hover;
							this.eV[this.fB] = 646;
							this.eU[this.fB] = var11.id;
							++this.fB;
						}

						if (var11.optionType == 6 && !this.fK && var3 >= var9
								&& var5 >= var10 && var3 < var9 + var11.width
								&& var5 < var10 + var11.height) {
							this.gw[this.fB] = var11.hover;
							this.eV[this.fB] = 679;
							this.eU[this.fB] = var11.id;
							++this.fB;
						}

						if (var11.group == 2) {
							int inventoryIndex = 0;

							for (var13 = 0; var13 < var11.height; ++var13) {
								for (var14 = 0; var14 < var11.width; ++var14) {
									int var15 = var9 + var14 * (32 + var11.spritePaddingX);
									int var16 = var10 + var13 * (32 + var11.spritePaddingY);
									if (inventoryIndex < 20) {
										var15 += var11.spriteX[inventoryIndex];
										var16 += var11.spriteY[inventoryIndex];
									}

									if (var3 >= var15 && var5 >= var16
											&& var3 < var15 + 32
											&& var5 < var16 + 32) {
										this.eo = inventoryIndex;
										this.ep = var11.id;
										if (var11.itemIds[inventoryIndex] > 0) {
											ItemDefinition var20 = ItemDefinition
													.fromID(var11.itemIds[inventoryIndex] - 1);
											if (this.hE == 1 && var11.hasActions) {
												if (var11.id != this.hG
														|| inventoryIndex != this.hF) {
													this.gw[this.fB] = "Use "
															+ this.hI
															+ " with @lre@"
															+ var20.itemName;
													this.eV[this.fB] = 870;
													this.eW[this.fB] = var20.id;
													this.eT[this.fB] = inventoryIndex;
													this.eU[this.fB] = var11.id;
													++this.fB;
												}
											} else if (this.fD == 1 && var11.hasActions) {
												if ((this.fF & 16) == 16) {
													this.gw[this.fB] = this.fG
															+ " @lre@"
															+ var20.itemName;
													this.eV[this.fB] = 543;
													this.eW[this.fB] = var20.id;
													this.eT[this.fB] = inventoryIndex;
													this.eU[this.fB] = var11.id;
													++this.fB;
												}
											} else {
												if (var11.hasActions) {
													for (var16 = 4; var16 >= 3; --var16) {
														if (var20.widgetActions != null
																&& var20.widgetActions[var16] != null) {
															this.gw[this.fB] = var20.widgetActions[var16]
																	+ " @lre@"
																	+ var20.itemName;
															if (var16 == 3) {
																this.eV[this.fB] = 493;
															}

															if (var16 == 4) {
																this.eV[this.fB] = 847;
															}

															this.eW[this.fB] = var20.id;
														} else {
															if (var16 != 4) {
																continue;
															}

															this.gw[this.fB] = "Drop @lre@"
																	+ var20.itemName;
															this.eV[this.fB] = 847;
															this.eW[this.fB] = var20.id;
															if (var20.id == 1971) {
																this.gw[this.fB] = "Remove @lre@"
																		+ var20.itemName;
															}
														}

														this.eT[this.fB] = inventoryIndex;
														this.eU[this.fB] = var11.id;
														++this.fB;
													}
												}

												if (var11.usableItems) {
													this.gw[this.fB] = "Use @lre@"
															+ var20.itemName;
													this.eV[this.fB] = 447;
													this.eW[this.fB] = var20.id;
													this.eT[this.fB] = inventoryIndex;
													this.eU[this.fB] = var11.id;
													++this.fB;
												}

												if (var11.hasActions
														&& var20.widgetActions != null) {
													for (var16 = 2; var16 >= 0; --var16) {
														if (var20.widgetActions[var16] != null) {
															this.gw[this.fB] = var20.widgetActions[var16]
																	+ " @lre@"
																	+ var20.itemName;
															if (var16 == 0) {
																this.eV[this.fB] = 74;
															}

															if (var16 == 1) {
																this.eV[this.fB] = 454;
															}

															if (var16 == 2) {
																this.eV[this.fB] = 539;
															}

															this.eW[this.fB] = var20.id;
															this.eT[this.fB] = inventoryIndex;
															this.eU[this.fB] = var11.id;
															++this.fB;
														}
													}
												}

												if (var11.id == 1688
														&& var20.y != null) {
													for (var16 = 4; var16 >= 0; --var16) {
														if (var20.y[var16] != null) {
															this.gw[this.fB] = var20.y[var16]
																	+ " @lre@"
																	+ var20.itemName;
															if (var16 == 0) {
																this.eV[this.fB] = 700;
															}

															if (var16 == 1) {
																this.eV[this.fB] = 701;
															}

															if (var16 == 2) {
																this.eV[this.fB] = 702;
															}

															if (var16 == 3) {
																this.eV[this.fB] = 703;
															}

															if (var16 == 4) {
																this.eV[this.fB] = 704;
															}

															this.eW[this.fB] = var20.id;
															this.eT[this.fB] = inventoryIndex;
															this.eU[this.fB] = var11.id;
															++this.fB;
														}
													}
												}

												if (var11.actions != null) {
													for (var16 = 4; var16 >= 0; --var16) {
														if (var11.actions[var16] != null) {
															this.gw[this.fB] = var11.actions[var16]
																	+ " @lre@"
																	+ var20.itemName;
															if (var16 == 0) {
																this.eV[this.fB] = 632;
															}

															if (var16 == 1) {
																this.eV[this.fB] = 78;
															}

															if (var16 == 2) {
																this.eV[this.fB] = 867;
															}

															if (var16 == 3) {
																this.eV[this.fB] = 431;
															}

															if (var16 == 4) {
																this.eV[this.fB] = 53;
															}

															this.eW[this.fB] = var20.id;
															this.eT[this.fB] = inventoryIndex;
															this.eU[this.fB] = var11.id;
															++this.fB;
														}
													}
												}

												this.gw[this.fB] = this.bs < 2 ? "Examine @lre@"
														+ var20.itemName
														: "Examine @lre@"
																+ var20.itemName
																+ " @gre@(@whi@"
																+ (var11.itemIds[inventoryIndex] - 1)
																+ "@gre@)";
												this.eV[this.fB] = 1125;
												this.eW[this.fB] = var20.id;
												this.eT[this.fB] = inventoryIndex;
												this.eU[this.fB] = var11.id;
												++this.fB;
											}
										}
									}

									++inventoryIndex;
								}
							}
						}
					}
				}

			}
		}
	}

	private void a(int var1, int var2, int var3, int var4, int var5) {
		this.dI.drawSprite(var4, var3);
		this.dJ.drawSprite(var4, var3 + var1 - 16);
		Rasterizer2D.fillRectangle(var1 - 32, var3 + 16, var4, 1, 16);
		Rasterizer2D.fillRectangle(var1 - 32, var3 + 16, var4, 4011046, 15);
		Rasterizer2D.fillRectangle(var1 - 32, var3 + 16, var4, 3419425, 13);
		Rasterizer2D.fillRectangle(var1 - 32, var3 + 16, var4, 3024925, 11);
		Rasterizer2D.fillRectangle(var1 - 32, var3 + 16, var4, 2696219, 10);
		Rasterizer2D.fillRectangle(var1 - 32, var3 + 16, var4, 2433049, 9);
		Rasterizer2D.fillRectangle(var1 - 32, var3 + 16, var4, 1, 1);
		int var6;
		if ((var6 = (var1 - 32) * var1 / var5) < 8) {
			var6 = 8;
		}

		var1 = (var1 - 32 - var6) * var2 / (var5 - var1);
		Rasterizer2D.fillRectangle(var6, var3 + 16 + var1, var4, 5063219, 16);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 1, var6, var4);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 8482897, var6, var4 + 1);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 7562570, var6, var4 + 2);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 6970435, var6, var4 + 3);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 6970435, var6, var4 + 4);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 6641729, var6, var4 + 5);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 6641729, var6, var4 + 6);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 6378814, var6, var4 + 7);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 6378814, var6, var4 + 8);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 6115644, var6, var4 + 9);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 6115644, var6, var4 + 10);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 5852730, var6, var4 + 11);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 5852730, var6, var4 + 12);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 5326389, var6, var4 + 13);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 4931889, var6, var4 + 14);
		Rasterizer2D.drawHorizontal(var3 + 16 + var1, 1, 15, var4);
		Rasterizer2D.drawHorizontal(var3 + 17 + var1, 1, 15, var4);
		Rasterizer2D.drawHorizontal(var3 + 17 + var1, 6641729, 14, var4);
		Rasterizer2D.drawHorizontal(var3 + 17 + var1, 6970435, 13, var4);
		Rasterizer2D.drawHorizontal(var3 + 17 + var1, 7167816, 11, var4);
		Rasterizer2D.drawHorizontal(var3 + 17 + var1, 7562570, 10, var4);
		Rasterizer2D.drawHorizontal(var3 + 17 + var1, 7759947, 7, var4);
		Rasterizer2D.drawHorizontal(var3 + 17 + var1, 8088141, 5, var4);
		Rasterizer2D.drawHorizontal(var3 + 17 + var1, 8285776, 4, var4);
		Rasterizer2D.drawHorizontal(var3 + 17 + var1, 8482897, 3, var4);
		Rasterizer2D.drawHorizontal(var3 + 17 + var1, 1, 2, var4);
		Rasterizer2D.drawHorizontal(var3 + 18 + var1, 1, 16, var4);
		Rasterizer2D.drawHorizontal(var3 + 18 + var1, 5655352, 15, var4);
		Rasterizer2D.drawHorizontal(var3 + 18 + var1, 6115644, 14, var4);
		Rasterizer2D.drawHorizontal(var3 + 18 + var1, 6444608, 11, var4);
		Rasterizer2D.drawHorizontal(var3 + 18 + var1, 6641729, 10, var4);
		Rasterizer2D.drawHorizontal(var3 + 18 + var1, 6970435, 7, var4);
		Rasterizer2D.drawHorizontal(var3 + 18 + var1, 7233606, 5, var4);
		Rasterizer2D.drawHorizontal(var3 + 18 + var1, 7430727, 4, var4);
		Rasterizer2D.drawHorizontal(var3 + 18 + var1, 8088141, 3, var4);
		Rasterizer2D.drawHorizontal(var3 + 18 + var1, 8482897, 2, var4);
		Rasterizer2D.drawHorizontal(var3 + 18 + var1, 1, 1, var4);
		Rasterizer2D.drawHorizontal(var3 + 19 + var1, 1, 16, var4);
		Rasterizer2D.drawHorizontal(var3 + 19 + var1, 5326389, 15, var4);
		Rasterizer2D.drawHorizontal(var3 + 19 + var1, 5655352, 14, var4);
		Rasterizer2D.drawHorizontal(var3 + 19 + var1, 6115644, 11, var4);
		Rasterizer2D.drawHorizontal(var3 + 19 + var1, 6378814, 9, var4);
		Rasterizer2D.drawHorizontal(var3 + 19 + var1, 6641729, 7, var4);
		Rasterizer2D.drawHorizontal(var3 + 19 + var1, 6970435, 5, var4);
		Rasterizer2D.drawHorizontal(var3 + 19 + var1, 7233606, 4, var4);
		Rasterizer2D.drawHorizontal(var3 + 19 + var1, 7562570, 3, var4);
		Rasterizer2D.drawHorizontal(var3 + 19 + var1, 8482897, 2, var4);
		Rasterizer2D.drawHorizontal(var3 + 19 + var1, 1, 1, var4);
		Rasterizer2D.drawHorizontal(var3 + 20 + var1, 1, 16, var4);
		Rasterizer2D.drawHorizontal(var3 + 20 + var1, 4931889, 15, var4);
		Rasterizer2D.drawHorizontal(var3 + 20 + var1, 5523766, 14, var4);
		Rasterizer2D.drawHorizontal(var3 + 20 + var1, 5852730, 13, var4);
		Rasterizer2D.drawHorizontal(var3 + 20 + var1, 6115644, 10, var4);
		Rasterizer2D.drawHorizontal(var3 + 20 + var1, 6378814, 8, var4);
		Rasterizer2D.drawHorizontal(var3 + 20 + var1, 6641729, 6, var4);
		Rasterizer2D.drawHorizontal(var3 + 20 + var1, 6970435, 4, var4);
		Rasterizer2D.drawHorizontal(var3 + 20 + var1, 7562570, 3, var4);
		Rasterizer2D.drawHorizontal(var3 + 20 + var1, 8482897, 2, var4);
		Rasterizer2D.drawHorizontal(var3 + 20 + var1, 1, 1, var4);
		Rasterizer2D.drawVertical(var3 + 16 + var1, 1, var6, var4 + 15);
		Rasterizer2D.drawHorizontal(var3 + 15 + var1 + var6, 1, 16, var4);
		Rasterizer2D.drawHorizontal(var3 + 14 + var1 + var6, 1, 15, var4);
		Rasterizer2D.drawHorizontal(var3 + 14 + var1 + var6, 4142890, 14, var4);
		Rasterizer2D.drawHorizontal(var3 + 14 + var1 + var6, 4471853, 10, var4);
		Rasterizer2D.drawHorizontal(var3 + 14 + var1 + var6, 4734511, 9, var4);
		Rasterizer2D.drawHorizontal(var3 + 14 + var1 + var6, 4866095, 7, var4);
		Rasterizer2D.drawHorizontal(var3 + 14 + var1 + var6, 4931889, 4, var4);
		Rasterizer2D.drawHorizontal(var3 + 14 + var1 + var6, 5655352, 3, var4);
		Rasterizer2D.drawHorizontal(var3 + 14 + var1 + var6, 1, 2, var4);
		Rasterizer2D.drawHorizontal(var3 + 13 + var1 + var6, 1, 16, var4);
		Rasterizer2D.drawHorizontal(var3 + 13 + var1 + var6, 4471853, 15, var4);
		Rasterizer2D.drawHorizontal(var3 + 13 + var1 + var6, 4931889, 11, var4);
		Rasterizer2D.drawHorizontal(var3 + 13 + var1 + var6, 5326389, 9, var4);
		Rasterizer2D.drawHorizontal(var3 + 13 + var1 + var6, 5523766, 7, var4);
		Rasterizer2D.drawHorizontal(var3 + 13 + var1 + var6, 5655352, 6, var4);
		Rasterizer2D.drawHorizontal(var3 + 13 + var1 + var6, 5852730, 4, var4);
		Rasterizer2D.drawHorizontal(var3 + 13 + var1 + var6, 6444608, 3, var4);
		Rasterizer2D.drawHorizontal(var3 + 13 + var1 + var6, 6970435, 2, var4);
		Rasterizer2D.drawHorizontal(var3 + 13 + var1 + var6, 1, 1, var4);
		Rasterizer2D.drawHorizontal(var3 + 12 + var1 + var6, 1, 16, var4);
		Rasterizer2D.drawHorizontal(var3 + 12 + var1 + var6, 4471853, 15, var4);
		Rasterizer2D.drawHorizontal(var3 + 12 + var1 + var6, 4931889, 14, var4);
		Rasterizer2D.drawHorizontal(var3 + 12 + var1 + var6, 5523766, 12, var4);
		Rasterizer2D.drawHorizontal(var3 + 12 + var1 + var6, 5655352, 11, var4);
		Rasterizer2D.drawHorizontal(var3 + 12 + var1 + var6, 5852730, 10, var4);
		Rasterizer2D.drawHorizontal(var3 + 12 + var1 + var6, 6115644, 7, var4);
		Rasterizer2D.drawHorizontal(var3 + 12 + var1 + var6, 6378814, 4, var4);
		Rasterizer2D.drawHorizontal(var3 + 12 + var1 + var6, 7233606, 3, var4);
		Rasterizer2D.drawHorizontal(var3 + 12 + var1 + var6, 8088141, 2, var4);
		Rasterizer2D.drawHorizontal(var3 + 12 + var1 + var6, 1, 1, var4);
		Rasterizer2D.drawHorizontal(var3 + 11 + var1 + var6, 1, 16, var4);
		Rasterizer2D.drawHorizontal(var3 + 11 + var1 + var6, 4931889, 15, var4);
		Rasterizer2D.drawHorizontal(var3 + 11 + var1 + var6, 5326389, 14, var4);
		Rasterizer2D.drawHorizontal(var3 + 11 + var1 + var6, 5655352, 13, var4);
		Rasterizer2D.drawHorizontal(var3 + 11 + var1 + var6, 5852730, 11, var4);
		Rasterizer2D.drawHorizontal(var3 + 11 + var1 + var6, 6115644, 9, var4);
		Rasterizer2D.drawHorizontal(var3 + 11 + var1 + var6, 6378814, 7, var4);
		Rasterizer2D.drawHorizontal(var3 + 11 + var1 + var6, 6641729, 5, var4);
		Rasterizer2D.drawHorizontal(var3 + 11 + var1 + var6, 6970435, 4, var4);
		Rasterizer2D.drawHorizontal(var3 + 11 + var1 + var6, 7562570, 3, var4);
		Rasterizer2D.drawHorizontal(var3 + 11 + var1 + var6, 8088141, 2, var4);
		Rasterizer2D.drawHorizontal(var3 + 11 + var1 + var6, 1, 1, var4);
	}

	private void a(Buffer var1, int var2) {
		this.aZ = 0;
		this.bO = 0;
		Buffer var3 = var1;
		Client var4 = this;
		var1.p();
		int var5;
		int var6;
		if ((var5 = var1.i(8)) < this.aX) {
			for (var6 = var5; var6 < var4.aX; ++var6) {
				var4.ba[var4.aZ++] = var4.aY[var6];
			}
		}

		if (var5 > var4.aX) {
			SignLink.reportError(username + " Too many npcs");
			throw new RuntimeException("eek");
		} else {
			var4.aX = 0;

			for (var6 = 0; var6 < var5; ++var6) {
				int var7 = var4.aY[var6];
				Npc var8 = var4.aW[var7];
				if (var3.i(1) == 0) {
					var4.aY[var4.aX++] = var7;
					var8.K = x;
				} else {
					int var9;
					if ((var9 = var3.i(2)) == 0) {
						var4.aY[var4.aX++] = var7;
						var8.K = x;
						var4.bP[var4.bO++] = var7;
					} else if (var9 == 1) {
						var4.aY[var4.aX++] = var7;
						var8.K = x;
						var9 = var3.i(3);
						var8.move(false, var9);
						if (var3.i(1) == 1) {
							var4.bP[var4.bO++] = var7;
						}
					} else if (var9 == 2) {
						var4.aY[var4.aX++] = var7;
						var8.K = x;
						var9 = var3.i(3);
						var8.move(true, var9);
						var9 = var3.i(3);
						var8.move(true, var9);
						if (var3.i(1) == 1) {
							var4.bP[var4.bO++] = var7;
						}
					} else if (var9 == 3) {
						var4.ba[var4.aZ++] = var7;
					}
				}
			}

			this.a(var2, var1);
			this.b(var1);

			int var11;
			for (var11 = 0; var11 < this.aZ; ++var11) {
				int var10 = this.ba[var11];
				if (this.aW[var10].K != x) {
					this.aW[var10].npcDefinition = null;
					this.aW[var10] = null;
				}
			}

			if (var1.position != var2) {
				SignLink.reportError(username
						+ " size mismatch in getnpcpos - pos:" + var1.position
						+ " psize:" + var2);
				throw new RuntimeException("eek");
			} else {
				for (var11 = 0; var11 < this.aX; ++var11) {
					if (this.aW[this.aY[var11]] == null) {
						SignLink.reportError(username
								+ " null entry in npc list - pos:" + var11
								+ " size:" + this.aX);
						throw new RuntimeException("eek");
					}
				}

			}
		}
	}

	private void j(int var1) {
		try {
			int var2;
			if ((var2 = Varp.parameters[var1].parameter) == 0) {
				return;
			}

			var1 = this.m[var1];
			if (var2 == 1) {
				if (var1 == 1) {
					this.gameBrightness = 0.9D;
				}

				if (var1 == 2) {
					this.gameBrightness = 0.8D;
				}

				if (var1 == 3) {
					this.gameBrightness = 0.7D;
				}

				if (var1 == 4) {
					this.gameBrightness = 0.6D;
				}

				Rasterizer3D.calculatePalette(this.gameBrightness);
				ItemDefinition.sprites.removeAll();
				this.hh = true;
			}

			if (var2 == 3) {
				boolean var3 = playMusic;
				if (var1 == 0) {
					if (!playMusic) {
						this.loopMusic = 0;
					}

					this.setMusicVolume(256);
					playMusic = true;
				}

				if (var1 == 1) {
					this.setMusicVolume(192);
					playMusic = true;
				}

				if (var1 == 2) {
					this.setMusicVolume(128);
					playMusic = true;
				}

				if (var1 == 3) {
					this.setMusicVolume(64);
					playMusic = true;
				}

				if (var1 == 4) {
					playMusic = false;
				}

				if (playMusic != var3) {
					if (playMusic) {
						this.requestedSong = this.cJ;
						this.gM = true;
						this.resourceProvider.provide(2, this.requestedSong);
					} else {
						this.stopMusic();
					}

					this.loopMusic = 0;
				}
			}

			if (var2 == 4) {
				Class49.a = var1;
				if (var1 == 0) {
					this.bg = true;
				}

				if (var1 == 1) {
					this.bg = true;
				}

				if (var1 == 2) {
					this.bg = true;
				}

				if (var1 == 3) {
					this.bg = true;
				}

				if (var1 == 4) {
					this.bg = false;
				}
			}

			if (var2 == 5) {
				this.hg = var1;
			}

			if (var2 == 6) {
				this.hb = var1;
			}

			if (var2 == 7) {
				this.ay = var1 == 1;
			}

			if (var2 == 8) {
				this.gu = var1;
				D = true;
			}

			if (var2 == 9) {
				this.bX = var1;
				return;
			}
		} catch (Exception var4) {
			;
		}

	}

	private void p() {
		try {
			int var1 = 0;

			int var2;
			int var13;
			for (var2 = -1; var2 < this.bM + this.aX; ++var2) {
				Object var3;
				if (var2 == -1) {
					var3 = localPlayer;
				} else if (var2 < this.bM) {
					var3 = this.bL[this.bN[var2]];
				} else {
					var3 = this.aW[this.aY[var2 - this.bM]];
				}

				if (var3 != null && ((Actor) var3).isVisible()) {
					ActorDefinition var4;
					if (var3 instanceof Npc) {
						var4 = ((Npc) var3).npcDefinition;
						if (((Npc) var3).npcDefinition.morphisms != null) {
							var4 = var4.morph();
						}

						if (var4 == null) {
							continue;
						}
					}

					if (var2 < this.bM) {
						var13 = 30;
						Player var5;
						if ((var5 = (Player) var3).headIcon >= 0) {
							this.a((Actor) var3, ((Actor) var3).j + 15);
							if (this.cP >= 0) {
								if (var5.at < 2) {
									this.headiconsPk[var5.at].drawSprite(this.cP - 12,
											this.cQ - 30);
									var13 += 25;
								}

								if (var5.headIcon < 7) {
									this.headiconsPrayer[var5.headIcon].drawSprite(
											this.cP - 12, this.cQ - var13);
									var13 += 18;
								}
							}
						}

						if (var2 >= 0 && this.bm == 10
								&& this.cl == this.bN[var2]) {
							this.a((Actor) var3, ((Actor) var3).j + 15);
							if (this.cP >= 0) {
								this.fa[var5.au].drawSprite(this.cP - 12,
										this.cQ - var13);
							}
						}
					} else {
						var4 = ((Npc) var3).npcDefinition;
						if (((Npc) var3).npcDefinition.headIcon >= 0
								&& var4.headIcon < this.headiconsPrayer.length) {
							this.a((Actor) var3, ((Actor) var3).j + 15);
							if (this.cP >= 0) {
								this.headiconsPrayer[var4.headIcon].drawSprite(this.cP - 12,
										this.cQ - 30);
							}
						}

						if (this.bm == 1 && this.gI == this.aY[var2 - this.bM]
								&& x % 20 < 10) {
							this.a((Actor) var3, ((Actor) var3).j + 15);
							if (this.cP >= 0) {
								this.fa[0].drawSprite(this.cP - 12,
										this.cQ - 28);
							}
						}
					}

					if (((Actor) var3).i != null
							&& (var2 >= this.bM || this.G == 0 || this.G == 3 || this.G == 1
									&& this.c(((Player) var3).name))) {
						this.a((Actor) var3, ((Actor) var3).j);
						if (this.cP >= 0 && var1 < 50) {
							this.cY[var1] = this.b12_full.getTextWidth(((Actor) var3).i) / 2;
							this.cX[var1] = this.b12_full.verticalSpace;
							this.cV[var1] = this.cP;
							this.cW[var1] = this.cQ;
							this.cZ[var1] = ((Actor) var3).n;
							this.da[var1] = ((Actor) var3).F;
							this.db[var1] = ((Actor) var3).J;
							this.dc[var1++] = ((Actor) var3).i;
							if (this.hb == 0 && ((Actor) var3).F > 0
									&& ((Actor) var3).F <= 3) {
								this.cX[var1] += 10;
								this.cW[var1] += 5;
							}

							if (this.hb == 0 && ((Actor) var3).F == 4) {
								this.cY[var1] = 60;
							}

							if (this.hb == 0 && ((Actor) var3).F == 5) {
								this.cX[var1] += 5;
							}
						}
					}

					if (((Actor) var3).G > x) {
						try {
							this.a((Actor) var3, ((Actor) var3).j + 15);
							if (this.cP >= 0) {
								if ((var13 = ((Actor) var3).H * 30
										/ ((Actor) var3).I) > 30) {
									var13 = 30;
								}

								Rasterizer2D.fillRectangle(5, this.cQ - 3,
										this.cP - 15, '\uff00', var13);
								Rasterizer2D.fillRectangle(5, this.cQ - 3,
										this.cP - 15 + var13, 16711680,
										30 - var13);
							}
						} catch (Exception var9) {
							;
						}
					}

					for (var13 = 0; var13 < 4; ++var13) {
						if (((Actor) var3).q[var13] > x) {
							this.a((Actor) var3, ((Actor) var3).j / 2);
							if (this.cP >= 0) {
								if (var13 == 1) {
									this.cQ -= 20;
								}

								if (var13 == 2) {
									this.cP -= 15;
									this.cQ -= 10;
								}

								if (var13 == 3) {
									this.cP += 15;
									this.cQ -= 10;
								}

								this.hitsplats[((Actor) var3).p[var13]].drawSprite(
										this.cP - 12, this.cQ - 12);
								this.p11_full.a(
										0,
										String.valueOf(((Actor) var3).o[var13]),
										this.cQ + 4, this.cP);
								this.p11_full.a(
										16777215,
										String.valueOf(((Actor) var3).o[var13]),
										this.cQ + 3, this.cP - 1);
							}
						}
					}
				}
			}

			for (var2 = 0; var2 < var1; ++var2) {
				int var11 = this.cV[var2];
				var13 = this.cW[var2];
				int var12 = this.cY[var2];
				int var6 = this.cX[var2];
				boolean var7 = true;

				while (var7) {
					var7 = false;

					for (int var8 = 0; var8 < var2; ++var8) {
						if (var13 + 2 > this.cW[var8] - this.cX[var8]
								&& var13 - var6 < this.cW[var8] + 2
								&& var11 - var12 < this.cV[var8]
										+ this.cY[var8]
								&& var11 + var12 > this.cV[var8]
										- this.cY[var8]
								&& this.cW[var8] - this.cX[var8] < var13) {
							var13 = this.cW[var8] - this.cX[var8];
							var7 = true;
						}
					}
				}

				this.cP = this.cV[var2];
				this.cQ = this.cW[var2] = var13;
				String var14 = this.dc[var2];
				if (this.hb == 0) {
					var11 = 16776960;
					if (this.cZ[var2] < 6) {
						var11 = this.cR[this.cZ[var2]];
					}

					if (this.cZ[var2] == 6) {
						var11 = this.hp % 20 >= 10 ? 16776960 : 16711680;
					}

					if (this.cZ[var2] == 7) {
						var11 = this.hp % 20 >= 10 ? '\uffff' : 255;
					}

					if (this.cZ[var2] == 8) {
						var11 = this.hp % 20 >= 10 ? 8454016 : '뀀';
					}

					if (this.cZ[var2] == 9) {
						if ((var13 = 150 - this.db[var2]) < 50) {
							var11 = 16711680 + var13 * 1280;
						} else if (var13 < 100) {
							var11 = 16776960 - 327680 * (var13 - 50);
						} else if (var13 < 150) {
							var11 = '\uff00' + 5 * (var13 - 100);
						}
					}

					if (this.cZ[var2] == 10) {
						if ((var13 = 150 - this.db[var2]) < 50) {
							var11 = 16711680 + 5 * var13;
						} else if (var13 < 100) {
							var11 = 16711935 - 327680 * (var13 - 50);
						} else if (var13 < 150) {
							var11 = 255 + 327680 * (var13 - 100) - 5
									* (var13 - 100);
						}
					}

					if (this.cZ[var2] == 11) {
						if ((var13 = 150 - this.db[var2]) < 50) {
							var11 = 16777215 - var13 * 327685;
						} else if (var13 < 100) {
							var11 = '\uff00' + 327685 * (var13 - 50);
						} else if (var13 < 150) {
							var11 = 16777215 - 327680 * (var13 - 100);
						}
					}

					if (this.da[var2] == 0) {
						this.b12_full.a(0, var14, this.cQ + 1, this.cP);
						this.b12_full.a(var11, var14, this.cQ, this.cP);
					}

					if (this.da[var2] == 1) {
						this.b12_full.wave(0, var14, this.cP, this.hp, this.cQ + 1);
						this.b12_full.wave(var11, var14, this.cP, this.hp, this.cQ);
					}

					if (this.da[var2] == 2) {
						this.b12_full.wave2(this.cP, var14, this.hp, this.cQ + 1, 0);
						this.b12_full.wave2(this.cP, var14, this.hp, this.cQ, var11);
					}

					if (this.da[var2] == 3) {
						this.b12_full.shake(150 - this.db[var2], var14, this.hp,
								this.cQ + 1, this.cP, 0);
						this.b12_full.shake(150 - this.db[var2], var14, this.hp, this.cQ,
								this.cP, var11);
					}

					if (this.da[var2] == 4) {
						var13 = this.b12_full.getTextWidth(var14);
						var12 = (150 - this.db[var2]) * (var13 + 100) / 150;
						Rasterizer2D.setBounds(334, this.cP - 50, this.cP + 50,
								0);
						this.b12_full.render(0, var14, this.cQ + 1, this.cP + 50 - var12);
						this.b12_full.render(var11, var14, this.cQ, this.cP + 50 - var12);
						Rasterizer2D.setDefaultBounds();
					}

					if (this.da[var2] == 5) {
						var13 = 150 - this.db[var2];
						var12 = 0;
						if (var13 < 25) {
							var12 = var13 - 25;
						} else if (var13 > 125) {
							var12 = var13 - 125;
						}

						Rasterizer2D.setBounds(this.cQ + 5, 0, 512, this.cQ
								- this.b12_full.verticalSpace - 1);
						this.b12_full.a(0, var14, this.cQ + 1 + var12, this.cP);
						this.b12_full.a(var11, var14, this.cQ + var12, this.cP);
						Rasterizer2D.setDefaultBounds();
					}
				} else {
					this.b12_full.a(0, var14, this.cQ + 1, this.cP);
					this.b12_full.a(16776960, var14, this.cQ, this.cP);
				}
			}

		} catch (Exception var10) {
			;
		}
	}

	private void a(long var1) {
		if (var1 != 0L) {
			try {
				for (int var3 = 0; var3 < this.bS; ++var3) {
					if (this.cG[var3] == var1) {
						--this.bS;

						for (var3 = var3; var3 < this.bS; ++var3) {
							this.eD[var3] = this.eD[var3 + 1];
							this.aQ[var3] = this.aQ[var3 + 1];
							this.cG[var3] = this.cG[var3 + 1];
						}

						this.gs.a(215);
						this.gs.writeLong(var1);
						return;
					}
				}

			} catch (RuntimeException var4) {
				SignLink.reportError("18622, false, " + var1 + ", "
						+ var4.toString());
				throw new RuntimeException();
			}
		}
	}

	private void q() {
		if (resizeMode == 0) {
			this.fU.initializeRasterizer();
		}

		if (resizeMode == 0) {
			Animation.spriteFromGroup("tabs", 5).drawSprite(0, 0);
			this.aJ.b(30, 37);
		}

		Rasterizer3D.t = this.gh;
		int var1 = clientWidth >= this.eR ? 37 : 74;
		if (resizeMode != 0) {
			if (clientWidth >= this.eR) {
				Animation.spriteFromGroup("tabs", 6).drawSprite(
						clientWidth - 461, clientHeight - 36);
			} else {
				Animation.spriteFromGroup("tabs", 7).drawSprite(
						clientWidth - 241, clientHeight - 73);
			}
		}

		if (this.eP) {
			if (clientWidth >= this.eR) {
				Animation.spriteFromGroup("tabs", 8).drawSprite(
						clientWidth - 204, clientHeight - 310);
				Rasterizer2D.fillRectangle(5260860, clientHeight - 303, 190,
						260, 100, clientWidth - 197);
				this.aJ.b(clientWidth - 198, clientHeight - 303);
			} else {
				Animation.spriteFromGroup("tabs", 8).drawSprite(
						clientWidth - 222, clientHeight - 346);
				Rasterizer2D.fillRectangle(5260860, clientHeight - 339, 190,
						260, 100, clientWidth - 216);
				this.aJ.b(clientWidth - 216, clientHeight - 339);
			}
		}

		int var2 = 0;
		int var3 = 0;
		if (resizeMode != 0) {
			var2 = clientWidth - 225;
			var3 = clientHeight - 340;
		}

		label206: {
			int var10004;
			byte var10001;
			Client var10000;
			Widget var10003;
			int var10002;
			if (resizeMode == 0) {
				if (this.gp != -1) {
					var10000 = this;
					var10001 = 0;
					var10002 = 32;
					var10003 = Widget.widgets[this.gp];
					var10004 = 36;
				} else {
					if (u[C] == -1) {
						break label206;
					}

					var10000 = this;
					var10001 = 0;
					var10002 = 32;
					var10003 = Widget.widgets[u[C]];
					var10004 = 36;
				}
			} else {
				if (resizeMode == 0 || !this.eP) {
					break label206;
				}

				if (this.gp != -1) {
					this.a(0, clientWidth >= this.eR ? var2 + 28
							: clientWidth - 214,
							(Widget) Widget.widgets[this.gp],
							clientWidth >= this.eR ? var3 + 37 : clientHeight
									- var1 - 265);
					break label206;
				}

				if (u[C] == -1) {
					break label206;
				}

				var10000 = this;
				var10001 = 0;
				var10002 = clientWidth >= this.eR ? var2 + 28
						: clientWidth - 214;
				var10003 = Widget.widgets[u[C]];
				var10004 = clientWidth >= this.eR ? var3 + 37 : clientHeight
						- var1 - 265;
			}

			var10000.a(var10001, var10002, (Widget) var10003, var10004);
		}

		if (this.gp == -1) {
			if (resizeMode == 0) {
				if (u[C] != -1) {
					switch (C) {
					case 0:
						Animation.spriteFromGroup("tabs", 0).drawSprite(6, 0);
						break;
					case 1:
						Animation.spriteFromGroup("tabs", 4).drawSprite(44, 0);
						break;
					case 2:
						Animation.spriteFromGroup("tabs", 4).drawSprite(77, 0);
						break;
					case 3:
						Animation.spriteFromGroup("tabs", 4).drawSprite(110, 0);
						break;
					case 4:
						Animation.spriteFromGroup("tabs", 4).drawSprite(143, 0);
						break;
					case 5:
						Animation.spriteFromGroup("tabs", 4).drawSprite(176, 0);
						break;
					case 6:
						Animation.spriteFromGroup("tabs", 1).drawSprite(209, 0);
						break;
					case 7:
						Animation.spriteFromGroup("tabs", 2).drawSprite(6, 298);
						break;
					case 8:
						Animation.spriteFromGroup("tabs", 4)
								.drawSprite(44, 298);
						break;
					case 9:
						Animation.spriteFromGroup("tabs", 4)
								.drawSprite(77, 298);
						break;
					case 10:
						Animation.spriteFromGroup("tabs", 4).drawSprite(110,
								298);
						break;
					case 11:
						Animation.spriteFromGroup("tabs", 4).drawSprite(143,
								298);
						break;
					case 12:
						Animation.spriteFromGroup("tabs", 4).drawSprite(176,
								298);
						break;
					case 13:
						Animation.spriteFromGroup("tabs", 3).drawSprite(209,
								298);
					}
				}
			} else if (resizeMode != 0) {
				if (clientWidth < this.eR) {
					if (u[C] != -1 && this.eP) {
						switch (C) {
						case 0:
							Animation.spriteFromGroup("tabs", 0).drawSprite(
									clientWidth - 241, clientHeight - 73);
							break;
						case 1:
							Animation.spriteFromGroup("tabs", 4).drawSprite(
									clientWidth - 202, clientHeight - 73);
							break;
						case 2:
							Animation.spriteFromGroup("tabs", 4).drawSprite(
									clientWidth - 170, clientHeight - 73);
							break;
						case 3:
							Animation.spriteFromGroup("tabs", 4).drawSprite(
									clientWidth - 138, clientHeight - 73);
							break;
						case 4:
							Animation.spriteFromGroup("tabs", 4).drawSprite(
									clientWidth - 104, clientHeight - 73);
							break;
						case 5:
							Animation.spriteFromGroup("tabs", 4).drawSprite(
									clientWidth - 71, clientHeight - 73);
							break;
						case 6:
							Animation.spriteFromGroup("tabs", 1).drawSprite(
									clientWidth - 38, clientHeight - 73);
							break;
						case 7:
							Animation.spriteFromGroup("tabs", 2).drawSprite(
									clientWidth - 241, clientHeight - 37);
							break;
						case 8:
							Animation.spriteFromGroup("tabs", 4).drawSprite(
									clientWidth - 202, clientHeight - 37);
							break;
						case 9:
							Animation.spriteFromGroup("tabs", 4).drawSprite(
									clientWidth - 170, clientHeight - 37);
							break;
						case 10:
							Animation.spriteFromGroup("tabs", 4).drawSprite(
									clientWidth - 138, clientHeight - 37);
							break;
						case 11:
							Animation.spriteFromGroup("tabs", 4).drawSprite(
									clientWidth - 104, clientHeight - 37);
							break;
						case 12:
							Animation.spriteFromGroup("tabs", 4).drawSprite(
									clientWidth - 71, clientHeight - 37);
							break;
						case 13:
							Animation.spriteFromGroup("tabs", 3).drawSprite(
									clientWidth - 38, clientHeight - 37);
						}
					}
				} else if (clientWidth >= this.eR && u[C] != -1 && this.eP) {
					switch (C) {
					case 0:
						Animation.spriteFromGroup("tabs", 4).drawSprite(
								clientWidth - 462, clientHeight - 36);
						break;
					case 1:
						Animation.spriteFromGroup("tabs", 4).drawSprite(
								clientWidth - 429, clientHeight - 36);
						break;
					case 2:
						Animation.spriteFromGroup("tabs", 4).drawSprite(
								clientWidth - 396, clientHeight - 36);
						break;
					case 3:
						Animation.spriteFromGroup("tabs", 4).drawSprite(
								clientWidth - 363, clientHeight - 36);
						break;
					case 4:
						Animation.spriteFromGroup("tabs", 4).drawSprite(
								clientWidth - 330, clientHeight - 36);
						break;
					case 5:
						Animation.spriteFromGroup("tabs", 4).drawSprite(
								clientWidth - 297, clientHeight - 36);
						break;
					case 6:
						Animation.spriteFromGroup("tabs", 4).drawSprite(
								clientWidth - 264, clientHeight - 36);
						break;
					case 7:
						Animation.spriteFromGroup("tabs", 4).drawSprite(
								clientWidth - 231, clientHeight - 36);
						break;
					case 8:
						Animation.spriteFromGroup("tabs", 4).drawSprite(
								clientWidth - 198, clientHeight - 36);
						break;
					case 9:
						Animation.spriteFromGroup("tabs", 4).drawSprite(
								clientWidth - 165, clientHeight - 36);
						break;
					case 10:
						Animation.spriteFromGroup("tabs", 4).drawSprite(
								clientWidth - 132, clientHeight - 36);
						break;
					case 11:
						Animation.spriteFromGroup("tabs", 4).drawSprite(
								clientWidth - 99, clientHeight - 36);
						break;
					case 12:
						Animation.spriteFromGroup("tabs", 4).drawSprite(
								clientWidth - 66, clientHeight - 36);
						break;
					case 13:
						Animation.spriteFromGroup("tabs", 4).drawSprite(
								clientWidth - 33, clientHeight - 36);
					}
				}
			}

			int var4;
			int[] var5;
			int[] var6;
			int[] var7;
			if (resizeMode == 0) {
				var5 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
				var6 = new int[] { 17, 49, 83, 114, 147, 180, 214, 14, 49, 82,
						116, 148, 184, 216 };
				var7 = new int[] { 9, 7, 7, 5, 2, 3, 7, 303, 306, 306, 302,
						304, 302, 303 };

				for (var4 = 0; var4 < 14; ++var4) {
					if (u[var5[var4]] != -1) {
						Animation.spriteFromGroup("sideicons", var4)
								.drawSprite(var6[var4], var7[var4]);
					}
				}
			} else if (resizeMode != 0) {
				if (clientWidth < this.eR) {
					var5 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
							12, 13 };
					var6 = new int[] { 231, 198, 165, 134, 100, 67, 32, 232,
							198, 164, 131, 98, 64, 32 };
					var7 = new int[] { 65, 67, 66, 68, 71, 70, 65, 32, 30, 30,
							33, 31, 32, 32 };

					for (var4 = 0; var4 < 14; ++var4) {
						if (u[var5[var4]] != -1) {
							Animation.spriteFromGroup("sideicons", var4)
									.drawSprite(clientWidth - var6[var4],
											clientHeight - var7[var4]);
						}
					}
				} else if (clientWidth >= this.eR) {
					var5 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
							12, 13 };
					var6 = new int[] { 455, 423, 389, 359, 325, 292, 258, 226,
							193, 160, 126, 95, 61, 29 };
					var7 = new int[] { 29, 31, 29, 32, 34, 34, 31, 32, 30, 30,
							33, 31, 32, 32 };

					for (var4 = 0; var4 < 14; ++var4) {
						if (u[var5[var4]] != -1) {
							Animation.spriteFromGroup("sideicons", var4)
									.drawSprite(clientWidth - var6[var4],
											clientHeight - var7[var4]);
						}
					}
				}
			}
		}

		if (this.bG && resizeMode == 0) {
			this.c(516, 168);
		}

		if (resizeMode == 0) {
			this.fU.drawImage(168, super.frameGraphics, 516);
		}

		this.fW.initializeRasterizer();
		Rasterizer3D.t = this.gi;
	}

	private void r() {
		int var1;
		int var2;
		for (var1 = -1; var1 < this.bM; ++var1) {
			if (var1 == -1) {
				var2 = 2047;
			} else {
				var2 = this.bN[var1];
			}

			Player var3;
			if ((var3 = this.bL[var2]) != null && var3.J > 0) {
				var3.J = var3.J - 1;
				if (var3.J == 0) {
					var3.i = null;
				}
			}
		}

		for (var1 = 0; var1 < this.aX; ++var1) {
			var2 = this.aY[var1];
			Npc var4;
			if ((var4 = this.aW[var2]) != null && var4.J > 0) {
				var4.J = var4.J - 1;
				if (var4.J == 0) {
					var4.i = null;
				}
			}
		}

	}

	private void c(int var1, int var2) {
		int var3 = this.cA - (var1 - 4);
		int var4 = -var2 + 4 + this.cB;
		int var5 = this.cC;
		int var6 = this.cD + 1;
		D = true;
		fh = true;
		Rasterizer2D.fillRectangle(var6 - 4, var4 + 2, var3, 7367262, var5);
		Rasterizer2D.fillRectangle(var6 - 2, var4 + 1, var3 + 1, 7367262,
				var5 - 2);
		Rasterizer2D.fillRectangle(var6, var4, var3 + 2, 7367262, var5 - 4);
		Rasterizer2D.fillRectangle(var6 - 2, var4 + 1, var3 + 3, 2959394,
				var5 - 6);
		Rasterizer2D.fillRectangle(var6 - 4, var4 + 2, var3 + 2, 2959394,
				var5 - 4);
		Rasterizer2D.fillRectangle(var6 - 6, var4 + 3, var3 + 1, 2959394,
				var5 - 2);
		Rasterizer2D.fillRectangle(var6 - 22, var4 + 19, var3 + 2, 5392957,
				var5 - 4);
		Rasterizer2D.fillRectangle(var6 - 22, var4 + 20, var3 + 3, 5392957,
				var5 - 6);
		Rasterizer2D.fillRectangle(var6 - 23, var4 + 20, var3 + 3, 2828060,
				var5 - 6);
		Rasterizer2D.drawRectangle(var3 + 3, var5 - 6, 1, 2763035, var4 + 2);
		Rasterizer2D.drawRectangle(var3 + 2, var5 - 4, 1, 2762267, var4 + 3);
		Rasterizer2D.drawRectangle(var3 + 2, var5 - 4, 1, 2433302, var4 + 4);
		Rasterizer2D.drawRectangle(var3 + 2, var5 - 4, 1, 2170389, var4 + 5);
		Rasterizer2D.drawRectangle(var3 + 2, var5 - 4, 1, 1973010, var4 + 6);
		Rasterizer2D.drawRectangle(var3 + 2, var5 - 4, 1, 1709838, var4 + 7);
		Rasterizer2D.drawRectangle(var3 + 2, var5 - 4, 2, 1380875, var4 + 8);
		Rasterizer2D.drawRectangle(var3 + 2, var5 - 4, 1, 1051912, var4 + 10);
		Rasterizer2D.drawRectangle(var3 + 2, var5 - 4, 1, 592388, var4 + 11);
		Rasterizer2D.drawRectangle(var3 + 2, var5 - 4, 1, 526083, var4 + 12);
		Rasterizer2D.drawRectangle(var3 + 2, var5 - 4, 1, 592388, var4 + 13);
		Rasterizer2D.drawRectangle(var3 + 2, var5 - 4, 1, 460802, var4 + 14);
		Rasterizer2D.drawRectangle(var3 + 2, var5 - 4, 1, 592388, var4 + 15);
		Rasterizer2D.drawRectangle(var3 + 2, var5 - 4, 1, 460802, var4 + 16);
		Rasterizer2D.drawRectangle(var3 + 2, var5 - 4, 1, 592388, var4 + 17);
		Rasterizer2D.drawRectangle(var3 + 2, var5 - 4, 1, 2763035, var4 + 18);
		Rasterizer2D.drawRectangle(var3 + 3, var5 - 6, 1, 5654851, var4 + 19);
		this.b12_full.render(13023381, "Choose Option", var4 + 14, var3 + 3);
		var1 = super.mouseX - var1;
		var2 = -var2 + super.mouseY;

		for (var6 = 0; var6 < this.fB; ++var6) {
			int var7 = var4 + 31 + (this.fB - 1 - var6) * 15;
			int var8 = 13023381;
			if (var1 > var3 && var1 < var3 + var5 && var2 > var7 - 13
					&& var2 < var7 + 3) {
				Rasterizer2D.fillRectangle(15, var7 - 11, var3 + 3, 7301469,
						this.cC - 6);
				var8 = 15656390;
			}

			this.b12_full.shadow(true, var3 + 3, var8, this.gw[var6], var7);
		}

	}

	private void b(long var1) {
		if (var1 != 0L) {
			try {
				if (this.bS >= 100 && this.dX != 1) {
					this.a("Your friendlist is full. Max of 100 for free users, and 200 for members",
							0, "", true);
				} else if (this.bS >= 200) {
					this.a("Your friendlist is full. Max of 100 for free users, and 200 for members",
							0, "", true);
				} else {
					String var3 = StringUtils.formatName(StringUtils
							.longToName(var1));

					int var4;
					for (var4 = 0; var4 < this.bS; ++var4) {
						if (this.cG[var4] == var1) {
							this.a(var3 + " is already on your friend list", 0,
									"", true);
							return;
						}
					}

					for (var4 = 0; var4 < this.aN; ++var4) {
						if (this.cf[var4] == var1) {
							this.a("Please remove " + var3
									+ " from your ignore list first", 0, "",
									true);
							return;
						}
					}

					if (!var3.equals(localPlayer.name)) {
						this.eD[this.bS] = var3;
						this.cG[this.bS] = var1;
						this.aQ[this.bS] = 0;
						++this.bS;
						this.gs.a(188);
						this.gs.writeLong(var1);
					}
				}
			} catch (RuntimeException var5) {
				SignLink.reportError("15283, 68, " + var1 + ", "
						+ var5.toString());
				throw new RuntimeException();
			}
		}
	}

	private int b(int var1, int var2, int var3) {
		int var4 = var3 >> 7;
		int var5 = var2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			if ((var1 = var1) < 3 && (this.hj[1][var4][var5] & 2) == 2) {
				++var1;
			}

			var3 &= 127;
			var2 &= 127;
			int var6 = this.gE[var1][var4][var5] * (128 - var3)
					+ this.gE[var1][var4 + 1][var5] * var3 >> 7;
			var1 = this.gE[var1][var4][var5 + 1] * (128 - var3)
					+ this.gE[var1][var4 + 1][var5 + 1] * var3 >> 7;
			return var6 * (128 - var2) + var1 * var2 >> 7;
		} else {
			return 0;
		}
	}

	private static String k(int var0) {
		return var0 < 100000 ? String.valueOf(var0) : (var0 < 10000000 ? var0
				/ 1000 + "K" : var0 / 1000000 + "M");
	}

	private void s() {
		try {
			if (this.fZ != null) {
				this.fZ.a();
			}
		} catch (Exception var2) {
			;
		}

		if (this.aq != null) {
			this.aq.clear();
			this.av = 0;
		}

		this.e(0);
		this.L();
		this.e(0, 0);
		this.fZ = null;
		this.loggedIn = false;
		this.aU = 2;
		this.hq = "";
		this.hr = "";
		this.aN = 0;
		this.bT = 0;
		o();
		this.scene.reset();

		for (int var1 = 0; var1 < 4; ++var1) {
			this.gQ[var1].a();
		}

		System.gc();
		this.stopMusic();
		this.cJ = -1;
		this.requestedSong = 0;
		this.loopMusic = 0;
		if (playLoginMusic) {
			this.midiVolume = 256;
			this.resourceProvider.provide(2, this.requestedSong);
		}

	}

	private void t() {
		this.dM = true;

		for (int var1 = 0; var1 < 7; ++var1) {
			this.en[var1] = -1;

			for (int var2 = 0; var2 < IdentityKit.a; ++var2) {
				if (!IdentityKit.b[var2].d
						&& IdentityKit.b[var2].c == var1 + (this.dY ? 0 : 7)) {
					this.en[var1] = var2;
					break;
				}
			}
		}

	}

	private void a(int var1, Buffer var2) {
		int var3;
		while (var2.c + 21 < var1 << 3 && (var3 = var2.i(14)) != 16383) {
			if (this.aW[var3] == null) {
				this.aW[var3] = new Npc();
			}

			Npc var4 = this.aW[var3];
			this.aY[this.aX++] = var3;
			var4.K = x;
			int var5;
			if ((var5 = var2.i(5)) > 15) {
				var5 -= 32;
			}

			int var6;
			if ((var6 = var2.i(5)) > 15) {
				var6 -= 32;
			}

			int var7 = var2.i(1);
			var4.npcDefinition = ActorDefinition.lookup(var2.i(14));
			if (var2.i(1) == 1) {
				this.bP[this.bO++] = var3;
			}

			var4.N = var4.npcDefinition.size;
			var4.g = var4.npcDefinition.rotation;
			var4.ab = var4.npcDefinition.walkingAnimation;
			var4.ac = var4.npcDefinition.halfTurnAnimation;
			var4.ad = var4.npcDefinition.rotateClockwiseAnimation;
			var4.ae = var4.npcDefinition.rotateAntiClockwiseAnimation;
			var4.l = var4.npcDefinition.idleAnimation;
			var4.setPosition(localPlayer.pathX[0] + var6, localPlayer.pathY[0]
					+ var5, var7 == 1);
		}

		var2.q();
	}

	public final void b() throws Throwable {
		if (!this.gameCrashed) {
			++x;
			if (!this.loggedIn) {
				Client client = this;
				int var2 = clientWidth / 2;
				int var3 = clientHeight / 2;
				if (super.T == 1
						&& this.b(clientWidth - 52, 10, clientWidth - 10, 52)) {
					if (playLoginMusic) {
						playLoginMusic = false;
						this.stopMusic();
					} else if (!playLoginMusic) {
						playLoginMusic = true;
						this.midiVolume = 256;
						this.requestedSong = 0;

						try {
							client.requestedSong = Integer.parseInt(client
									.getParameter("music"));
						} catch (Exception var7) {
							;
						}

						this.resourceProvider.provide(2, this.requestedSong);
					}

					VScapeSettings.write();
				}

				if (this.hq.length() > 0 || this.hr.length() > 0) {
					if (this.hq.length() > 0) {
						this.p12_full.a(16777215, var2 + 5, this.hq, var3 + 80, true);
					}

					this.p12_full.a(16777215, var2 + 5, this.hr, var3 + 80, true);
				}

				if (this.aU == 2) {
					label199: {
						if (super.T == 1
								&& this.b(var2 - 108, var3 + 12, var2 - 90,
										var3 + 24)) {
							if (c) {
								c = false;
							} else {
								c = true;
							}

							VScapeSettings.write();
						}

						if (super.T == 1
								&& this.b(
										var2 - 100,
										var3 - 64,
										var2
												+ Animation.spriteFromGroup(
														"login", 1).width / 2,
										var3 - 38)) {
							this.gG = 0;
						}

						if (super.T == 1
								&& this.b(
										var2 - 100,
										var3 - 19,
										var2
												+ Animation.spriteFromGroup(
														"login", 1).width / 2,
										var3 + 7)) {
							this.gG = 1;
						}

						if (super.T == 1
								&& this.b(
										var2 - 80,
										var3 + 38,
										var2
												+ Animation.spriteFromGroup(
														"login", 2).width / 2,
										var3 + 64)) {
							if (username.length() > 0 && password.length() > 0) {
								this.dS = 0;
								this.a(username, password, false);
								if (!VScapeSettings.a.equals(username)
										|| !VScapeSettings.b.equals(password)) {
									VScapeSettings.write();
								}

								this.stopMusic();
								if (this.loggedIn) {
									break label199;
								}
							} else {
								this.hq = "Please enter a valid login.";
							}
						}

						int var4;
						while ((var4 = client.d(-796)) != -1) {
							boolean var5 = false;

							for (int var6 = 0; var6 < 95; ++var6) {
								if (var4 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
										.charAt(var6)) {
									var5 = true;
									break;
								}
							}

							if (client.gG == 0) {
								if (var4 == 8 && username.length() > 0) {
									username = username.substring(0,
											username.length() - 1);
								}

								if (var4 == 9 || var4 == 10 || var4 == 13) {
									client.gG = 1;
								}

								if (var5) {
									username = username + (char) var4;
								}

								if (username.length() > 12) {
									username = username.substring(0, 12);
								}
							} else if (client.gG == 1) {
								if (var4 == 8 && password.length() > 0) {
									password = password.substring(0,
											password.length() - 1);
								}

								if (var4 == 9 || var4 == 10 || var4 == 13) {
									client.gG = 0;
								}

								if (var5) {
									password = password + (char) var4;
								}

								if (password.length() > 20) {
									password = password.substring(0, 20);
								}
							} else if (client.gG == 2) {
								client.p12_full.a(16777215, var2 - 308, client.hq,
										var3 - 47, true);
								client.p12_full.a(16777215, var2 + 5, client.hq,
										var3 - 180, true);
								if (var4 == 8 && hK.length() > 0) {
									hK = hK.substring(0, hK.length() - 1);
								}

								if (var4 == 9 || var4 == 10 || var4 == 13) {
									client.gG = 0;
								}

								if (var5) {
									hK = hK + (char) var4;
								}

								if (password.length() > 20) {
									hK = hK.substring(0, 20);
								}
							}

							client.p12_full.a(16777215, var2 - 308, client.hq,
									var3 - 47, true);
							client.p12_full.a(16777215, var2 + 5, client.hq,
									var3 - 180, true);
						}
					}
				}
			} else {
				this.y();
			}

			this.dispatchProvidedResources();
		}
	}

	private void b(boolean var1) {
		if (localPlayer.X >> 7 == this.hl && localPlayer.Y >> 7 == this.hm) {
			this.hl = 0;
		}

		int var2 = this.bM;
		if (var1) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; ++var3) {
			Player var4;
			int var5;
			if (var1) {
				var4 = localPlayer;
				var5 = 33538048;
			} else {
				var4 = this.bL[this.bN[var3]];
				var5 = this.bN[var3] << 14;
			}

			if (var4 != null && var4.visible) {
				var4.am = this.bM > 200 && !var1 && var4.r == var4.l;
				int var6 = var4.X >> 7;
				int var7 = var4.Y >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.playerModel != null && x >= var4.av && x < var4.aw) {
						var4.am = false;
						var4.ax = this.b(this.cc, var4.Y, var4.X);
						this.scene.addRenderable(this.cc, var4.Y, var4, var4.Z,
								var4.aH, var4.X, var4.ax, var4.aE, var4.aG,
								var5, var4.aF);
					} else {
						if ((var4.X & 127) == 64 && (var4.Y & 127) == 64) {
							if (this.ci[var6][var7] == this.hp) {
								continue;
							}

							this.ci[var6][var7] = this.hp;
						}

						var4.ax = this.b(this.cc, var4.Y, var4.X);
						this.scene.addEntity(this.cc, var4.Z, var4.ax, var5,
								var4.Y, 60, var4.X, var4, var4.O);
					}
				}
			}
		}

	}

	private boolean a(Widget var1) {
		int var5 = var1.contentType;
		if (this.bU == 2) {
			if (var5 == 201) {
				D = true;
				this.gJ = 0;
				this.hi = true;
				this.gC = "";
				this.em = 1;
				this.fu = "Enter name of friend to add to list";
			}

			if (var5 == 202) {
				D = true;
				this.gJ = 0;
				this.hi = true;
				this.gC = "";
				this.em = 2;
				this.fu = "Enter name of friend to delete from list";
			}
		}

		if (var5 == 205) {
			this.dy = 250;
			return true;
		} else {
			if (var5 == 501) {
				D = true;
				this.gJ = 0;
				this.hi = true;
				this.gC = "";
				this.em = 4;
				this.fu = "Enter name of player to add to list";
			}

			if (var5 == 502) {
				D = true;
				this.gJ = 0;
				this.hi = true;
				this.gC = "";
				this.em = 5;
				this.fu = "Enter name of player to delete from list";
			}

			if (var5 == 550) {
				D = true;
				this.gJ = 0;
				this.hi = true;
				this.gC = "";
				this.em = 6;
				this.fu = "Enter the name of the chat you wish to join";
			}

			int var2;
			int var3;
			int var4;
			if (var5 >= 300 && var5 <= 313) {
				var2 = (var5 - 300) / 2;
				var3 = var5 & 1;
				if ((var4 = this.en[var2]) != -1) {
					while (true) {
						if (var3 == 0) {
							--var4;
							if (var4 < 0) {
								var4 = IdentityKit.a - 1;
							}
						}

						if (var3 == 1) {
							++var4;
							if (var4 >= IdentityKit.a) {
								var4 = 0;
							}
						}

						if (!IdentityKit.b[var4].d
								&& IdentityKit.b[var4].c == var2
										+ (this.dY ? 0 : 7)) {
							this.en[var2] = var4;
							this.dM = true;
							break;
						}
					}
				}
			}

			if (var5 >= 314 && var5 <= 323) {
				var2 = (var5 - 314) / 2;
				var3 = var5 & 1;
				var4 = this.di[var2];
				if (var3 == 0) {
					--var4;
					if (var4 < 0) {
						var4 = n[var2].length - 1;
					}
				}

				if (var3 == 1) {
					++var4;
					if (var4 >= n[var2].length) {
						var4 = 0;
					}
				}

				this.di[var2] = var4;
				this.dM = true;
			}

			if (var5 == 324 && !this.dY) {
				this.dY = true;
				this.t();
			}

			if (var5 == 325 && this.dY) {
				this.dY = false;
				this.t();
			}

			if (var5 != 326) {
				if (var5 == 613) {
					this.fR = !this.fR;
				}

				if (var5 >= 601 && var5 <= 612) {
					this.Y();
					if (this.bE.length() > 0) {
						this.gs.a(218);
						this.gs.writeLong(StringUtils.a(this.bE));
						this.gs.writeByte(var5 - 601);
						this.gs.writeByte(this.fR ? 1 : 0);
					}
				}

				return false;
			} else {
				this.gs.a(101);
				this.gs.writeByte(this.dY ? 0 : 1);

				for (var2 = 0; var2 < 7; ++var2) {
					this.gs.writeByte(this.en[var2]);
				}

				for (var2 = 0; var2 < 5; ++var2) {
					this.gs.writeByte(this.di[var2]);
				}

				return true;
			}
		}
	}

	private void a(Buffer var1) {
		for (int var2 = 0; var2 < this.bO; ++var2) {
			int var3 = this.bP[var2];
			Player var4 = this.bL[var3];
			int var5;
			if (((var5 = var1.readUByte()) & 64) != 0) {
				var5 += var1.readUByte() << 8;
			}

			Player var6 = var4;
			Buffer var7 = var1;
			Client var18 = this;
			if ((var5 & 1024) != 0) {
				var4.Q = var1.w();
				var4.S = var1.w();
				var4.R = var1.w();
				var4.T = var1.w();
				var4.U = var1.A() + x;
				var4.V = var1.z() + x;
				var4.W = var1.w();
				var4.resetPath();
			}

			int var8;
			if ((var5 & 256) != 0) {
				var4.u = var1.y();
				var8 = var1.readInt();
				var4.y = var8 >> 16;
				var4.x = x + (var8 & '\uffff');
				var4.v = 0;
				var4.w = 0;
				if (var4.x > x) {
					var4.v = -1;
				}

				if (var4.u == '\uffff') {
					var4.u = -1;
				}
			}

			int var9;
			int var10;
			if ((var5 & 8) != 0) {
				if ((var8 = var1.y()) == '\uffff') {
					var8 = -1;
				}

				var9 = var1.v();
				if (var8 == var4.animation && var8 != -1) {
					if ((var10 = Animation.animations[var8].replayMode) == 1) {
						var4.B = 0;
						var4.C = 0;
						var4.D = var9;
						var4.E = 0;
					}

					if (var10 == 2) {
						var4.E = 0;
					}
				} else if (var8 == -1
						|| var4.animation == -1
						|| Animation.animations[var8].priority >= Animation.animations[var4.animation].priority) {
					var4.animation = var8;
					var4.B = 0;
					var4.C = 0;
					var4.D = var9;
					var4.E = 0;
					var4.P = var4.z;
				}
			}

			if ((var5 & 4) != 0) {
				var4.i = var1.readString();
				if (var4.i.charAt(0) == 126) {
					var4.i = var4.i.substring(1);
					this.a(var4.i, 2, var4.name);
				} else if (var4 == localPlayer) {
					this.a(var4.i, 2, var4.name);
				}

				var4.n = 0;
				var4.F = 0;
				var4.J = 150;
			}

			if ((var5 & 128) != 0) {
				var8 = var1.y();
				var9 = var1.readUByte();
				var10 = var1.v();
				int var11 = var1.position;
				if (var4.name != null && var4.visible) {
					long var12 = StringUtils.a(var4.name);
					boolean var14 = false;
					int var15;
					if (var9 <= 1) {
						for (var15 = 0; var15 < var18.aN; ++var15) {
							if (var18.cf[var15] == var12) {
								var14 = true;
								break;
							}
						}
					}

					if (!var14 && var18.he == 0) {
						try {
							var18.aV.position = 0;
							byte[] var16 = var18.aV.buf;
							var14 = false;
							Buffer var22 = var7;

							for (var15 = var10 + 0 - 1; var15 >= 0; --var15) {
								var16[var15] = var22.buf[var22.position++];
							}

							var18.aV.position = 0;
							String var23 = ChatMessageCodec.a(var10, var18.aV);
							var6.i = var23;
							var6.n = var8 >> 8;
							var6.af = var9;
							var6.F = var8 & 255;
							var6.J = 150;
							if (var6.aJ) {
								var18.a(var23, 1, "@irn@" + var6.name, var9);
							} else {
								var18.a(var23, 1, var6.name, var9);
							}
						} catch (Exception var17) {
							SignLink.reportError("cde2");
						}
					}
				}

				var1.position = var11 + var10;
			}

			if ((var5 & 1) != 0) {
				var4.interactingEntity = var1.y();
				if (var4.interactingEntity == '\uffff') {
					var4.interactingEntity = -1;
				}
			}

			if ((var5 & 16) != 0) {
				byte[] var20 = new byte[var8 = var1.v()];
				Buffer var21 = new Buffer(var20);
				var1.readBytes(var8, 0, var20);
				var18.bQ[var3] = var21;
				var4.updatePlayer(var21);
			}

			if ((var5 & 2) != 0) {
				var4.L = var1.A();
				var4.M = var1.y();
			}

			if ((var5 & 32) != 0) {
				var8 = var1.readUByte();
				var9 = var1.u();
				var4.updateHits(var9, var8, x);
				var4.G = x + 300;
				var4.H = var1.v();
				var4.I = var1.readUByte();
			}

			if ((var5 & 512) != 0) {
				var8 = var1.readUByte();
				var9 = var1.w();
				var4.updateHits(var9, var8, x);
				var4.G = x + 300;
				var4.H = var1.readUByte();
				var4.I = var1.v();
			}
		}

	}

	private void b(int var1, int var2, int var3, int var4, int var5) {
		int var6;
		int var7;
		int var8;
		int var9;
		if ((var6 = this.scene.getWallKey(var5, var3, var1)) != 0) {
			var8 = (var7 = this.scene.c(var5, var3, var1, var6)) >> 6 & 3;
			var7 &= 31;
			var2 = var2;
			if (var6 > 0) {
				var2 = var4;
			}

			int[] var12 = this.hn.pixels;
			var9 = 24624 + (var3 << 2) + (103 - var1 << 9 << 2);
			ObjectDefinition var10;
			if ((var10 = ObjectDefinition.byId(var6 >> 14 & 32767)).mapscene != -1) {
				IndexedImage var11;
				if ((var11 = this.ej[var10.mapscene]) != null) {
					var4 = ((var10.width << 2) - var11.c) / 2;
					var6 = ((var10.length << 2) - var11.d) / 2;
					var11.a(48 + (var3 << 2) + var4, 48
							+ (104 - var1 - var10.length << 2) + var6);
				}
			} else {
				if (var7 == 0 || var7 == 2) {
					if (var8 == 0) {
						var12[var9] = var2;
						var12[var9 + 512] = var2;
						var12[var9 + 1024] = var2;
						var12[var9 + 1536] = var2;
					} else if (var8 == 1) {
						var12[var9] = var2;
						var12[var9 + 1] = var2;
						var12[var9 + 2] = var2;
						var12[var9 + 3] = var2;
					} else if (var8 == 2) {
						var12[var9 + 3] = var2;
						var12[var9 + 3 + 512] = var2;
						var12[var9 + 3 + 1024] = var2;
						var12[var9 + 3 + 1536] = var2;
					} else if (var8 == 3) {
						var12[var9 + 1536] = var2;
						var12[var9 + 1536 + 1] = var2;
						var12[var9 + 1536 + 2] = var2;
						var12[var9 + 1536 + 3] = var2;
					}
				}

				if (var7 == 3) {
					if (var8 == 0) {
						var12[var9] = var2;
					} else if (var8 == 1) {
						var12[var9 + 3] = var2;
					} else if (var8 == 2) {
						var12[var9 + 3 + 1536] = var2;
					} else if (var8 == 3) {
						var12[var9 + 1536] = var2;
					}
				}

				if (var7 == 2) {
					if (var8 == 3) {
						var12[var9] = var2;
						var12[var9 + 512] = var2;
						var12[var9 + 1024] = var2;
						var12[var9 + 1536] = var2;
					} else if (var8 == 0) {
						var12[var9] = var2;
						var12[var9 + 1] = var2;
						var12[var9 + 2] = var2;
						var12[var9 + 3] = var2;
					} else if (var8 == 1) {
						var12[var9 + 3] = var2;
						var12[var9 + 3 + 512] = var2;
						var12[var9 + 3 + 1024] = var2;
						var12[var9 + 3 + 1536] = var2;
					} else if (var8 == 2) {
						var12[var9 + 1536] = var2;
						var12[var9 + 1536 + 1] = var2;
						var12[var9 + 1536 + 2] = var2;
						var12[var9 + 1536 + 3] = var2;
					}
				}
			}
		}

		if ((var6 = this.scene.k(var5, var3, var1)) != 0) {
			var8 = (var7 = this.scene.c(var5, var3, var1, var6)) >> 6 & 3;
			var7 &= 31;
			ObjectDefinition var13;
			int var18;
			if ((var13 = ObjectDefinition.byId(var6 >> 14 & 32767)).mapscene != -1) {
				IndexedImage var17;
				if ((var17 = this.ej[var13.mapscene]) != null) {
					var6 = ((var13.width << 2) - var17.c) / 2;
					var18 = ((var13.length << 2) - var17.d) / 2;
					var17.a(48 + (var3 << 2) + var6, 48
							+ (104 - var1 - var13.length << 2) + var18);
				}
			} else if (var7 == 9) {
				var9 = 15658734;
				if (var6 > 0) {
					var9 = 15597568;
				}

				int[] var14 = this.hn.pixels;
				var18 = 24624 + (var3 << 2) + (103 - var1 << 9 << 2);
				if (var8 != 0 && var8 != 2) {
					var14[var18] = var9;
					var14[var18 + 512 + 1] = var9;
					var14[var18 + 1024 + 2] = var9;
					var14[var18 + 1536 + 3] = var9;
				} else {
					var14[var18 + 1536] = var9;
					var14[var18 + 1024 + 1] = var9;
					var14[var18 + 512 + 2] = var9;
					var14[var18 + 3] = var9;
				}
			}
		}

		ObjectDefinition var15;
		IndexedImage var16;
		if ((var6 = this.scene.l(var5, var3, var1)) != 0
				&& (var15 = ObjectDefinition.byId(var6 >> 14 & 32767)).mapscene != -1
				&& (var16 = this.ej[var15.mapscene]) != null) {
			var2 = ((var15.width << 2) - var16.c) / 2;
			var4 = ((var15.length << 2) - var16.d) / 2;
			var16.a(48 + (var3 << 2) + var2, 48
					+ (104 - var1 - var15.length << 2) + var4);
		}

	}

	private void u() throws Throwable {
		new IndexedImage(this.fonts, "titlebox", 0);
		new IndexedImage(this.fonts, "titlebutton", 0);
		this.fN = new IndexedImage[12];
		int var1 = 0;

		try {
			var1 = Integer.parseInt(this.getParameter("fl_icon"));
		} catch (Exception var6) {
			;
		}

		if (var1 == 0) {
			for (var1 = 0; var1 < 12; ++var1) {
				this.fN[var1] = new IndexedImage(this.fonts, "runes", var1);
			}
		} else {
			for (var1 = 0; var1 < 12; ++var1) {
				this.fN[var1] = new IndexedImage(this.fonts, "runes",
						12 + (var1 & 3));
			}
		}

		this.gx = new Sprite(128, 265);
		this.gy = new Sprite(128, 265);
		System.arraycopy(this.fm.pixels, 0, this.gx.pixels, 0, '蒀');
		System.arraycopy(this.fn.pixels, 0, this.gy.pixels, 0, '蒀');
		this.bi = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.bi[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.bi[var1 + 64] = 16711680 + var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.bi[var1 + 128] = 16776960 + 4 * var1;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.bi[var1 + 192] = 16777215;
		}

		this.bj = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.bj[var1] = var1 << 10;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.bj[var1 + 64] = '\uff00' + 4 * var1;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.bj[var1 + 128] = '\uffff' + var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.bj[var1 + 192] = 16777215;
		}

		this.bk = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.bk[var1] = var1 << 2;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.bk[var1 + 64] = 255 + var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.bk[var1 + 128] = 16711935 + var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.bk[var1 + 192] = 16777215;
		}

		this.gq = new int['耀'];
		this.gr = new int['耀'];
		Client var8 = null;
		var8 = this;

		int var2;
		for (var2 = 0; var2 < var8.gq.length; ++var2) {
			var8.gq[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int) (Math.random() * 128.0D * 256.0D);
			var8.gq[var3] = (int) (Math.random() * 256.0D);
		}

		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (int var4 = 1; var4 < 127; ++var4) {
					int var5 = var4 + (var3 << 7);
					var8.gr[var5] = (var8.gq[var5 - 1] + var8.gq[var5 + 1]
							+ var8.gq[var5 - 128] + var8.gq[var5 + 128]) / 4;
				}
			}

			int[] var7 = var8.gq;
			var8.gq = var8.gr;
			var8.gr = var7;
		}

		this.statusText(10, (String) "Connecting to fileserver");
		if (!this.aS) {
			this.bD = true;
			this.aS = true;
			this.startThread((Runnable) this, 2);
		}

	}

	public static Client getActiveClient() {
		return client;
	}

	public static void main(String[] var0) {
		boolean lowMemory =  false;
		try {
			cK = 10;
			k = 0;
			SceneGraph.lowMemory = lowMemory;
			Rasterizer3D.lowMemory = lowMemory;
			cN = false;
			MapRegion.lowMemory = lowMemory;
			ObjectDefinition.f = false;
			playingOnMembersServer = true;
			SignLink.a(InetAddress.getLocalHost());
			resizeMode = 0;
			Client var10000 = client = new Client();
			int var1 = clientHeight;
			int var2 = clientWidth;
			Client client = var10000;
			var10000.X = false;
			client.width = var2;
			client.height = var1;
			boolean undecorated = resizeMode == 2;
			int var10007 = resizeMode;
			client.scapeFrame = new ScapeFrame(client, client.width,
					client.height, undecorated);
			client.scapeFrame.setFocusTraversalKeysEnabled(false);
			client.frameGraphics = client.getFrameComponent().getGraphics();
			client.mainImageProducer = new ProducingGraphicsBuffer(
					client.width, client.height, client.getFrameComponent());
			client.startThread(client, 1);
		} catch (Exception var3) {
			;
		}
	}

	public AppletContext getAppletContext() {
		return super.getAppletContext();
	}

	private void v() {
		byte[] var1 = this.fonts.getEntry("title.dat");
		Sprite var5 = new Sprite(var1, this);
		this.fm.initializeRasterizer();
		var5.c(0, 0);
		this.fn.initializeRasterizer();
		var5.c(-637, 0);
		this.fj.initializeRasterizer();
		var5.c(-128, 0);
		this.fk.initializeRasterizer();
		var5.c(-202, -371);
		this.loginScreen.initializeRasterizer();
		var5.c(-202, -171);
		this.fo.initializeRasterizer();
		var5.c(0, -265);
		this.fp.initializeRasterizer();
		var5.c(-562, -265);
		this.fq.initializeRasterizer();
		var5.c(-128, -171);
		this.fr.initializeRasterizer();
		var5.c(-562, -171);
		int[] var2 = new int[var5.width];

		for (int var3 = 0; var3 < var5.height; ++var3) {
			for (int var4 = 0; var4 < var5.width; ++var4) {
				var2[var4] = var5.pixels[var5.width - var4 - 1 + var5.width
						* var3];
			}

			System.arraycopy(var2, 0, var5.pixels, var5.width * var3,
					var5.width);
		}

		this.fm.initializeRasterizer();
		var5.c(382, 0);
		this.fn.initializeRasterizer();
		var5.c(-255, 0);
		this.fj.initializeRasterizer();
		var5.c(254, 0);
		this.fk.initializeRasterizer();
		var5.c(180, -371);
		this.loginScreen.initializeRasterizer();
		var5.c(180, -171);
		this.fo.initializeRasterizer();
		var5.c(382, -265);
		this.fp.initializeRasterizer();
		var5.c(-180, -265);
		this.fq.initializeRasterizer();
		var5.c(254, -171);
		this.fr.initializeRasterizer();
		var5.c(-180, -171);
		var5 = new Sprite(this.fonts, "logo", 0);
		this.fj.initializeRasterizer();
		var5.drawSprite(382 - var5.width / 2 - 128, 18);
		System.gc();
	}

	private void setMusicVolume(int var1) {
		this.midiVolume = var1;
		if (this.midi != null) {
			if (this.midi.isSequencerRunning()) {
				this.midi.a(0, this.midiVolume);
			}

		}
	}

	private void stopMusic() {
		if (this.midi != null) {
			this.midi.stopPlayback();
		} else {
			System.out.println("Midi player is null!");
		}
	}

	private void dispatchProvidedResources() {
		Resource var1;
		while ((var1 = this.resourceProvider.d()) != null) {
			if (var1.type == 0) {
				Model.a(var1.data, var1.file);
				if (this.hA != -1) {
					D = true;
				}
			}

			if (var1.type == 1 && var1.data != null) {
				Frame.a(var1.data, var1.file);
			}

			if (var1.type == 2 && var1.file == this.requestedSong
					&& var1.data != null) {
				byte[] var2 = var1.data;
				boolean var4 = this.loopMusic > 0;

				System.out.println("File: " + var1.file + ", gN: "
						+ this.midiVolume);

				if (this.midi == null) {
					System.out.println("Midi player is null");
				} else if (this.midi.isSequencerRunning() && !var4) {
					this.midi.playMidi(var2, true, this.midiVolume);
				} else {
					this.midi.playMidi(var2, false, this.midiVolume);
				}
			}

			if (var1.type == 3 && this.dH == 1) {
				for (int var3 = 0; var3 < this.gj.length; ++var3) {
					if (this.gS[var3] == var1.file) {
						this.gj[var3] = var1.data;
						if (var1.data == null) {
							this.gS[var3] = -1;
						}
						break;
					}

					if (this.gT[var3] == var1.file) {
						this.ha[var3] = var1.data;
						if (var1.data == null) {
							this.gT[var3] = -1;
						}
						break;
					}
				}
			}

			if (var1.type == 93 && this.resourceProvider.b(var1.file)) {
				MapRegion.decode(new Buffer(var1.data), this.resourceProvider);
			}
		}

	}

	private void m(int var1) {
		Widget var4 = Widget.widgets[var1];

		for (int var2 = 0; var2 < var4.children.length && var4.children[var2] != -1; ++var2) {
			Widget var3;
			if ((var3 = Widget.widgets[var4.children[var2]]).group == 1) {
				this.m(var3.id);
			}

			var3.K = 0;
			var3.c = 0;
		}

	}

	private void y() throws Throwable {
		this.a();
		if (this.fi > 1) {
			--this.fi;
		}

		if (this.dy > 0) {
			--this.dy;
		}

		int var1;
		for (var1 = 0; var1 < 5 && this.X(); ++var1) {
			;
		}

		if (this.loggedIn) {
			if (this.dC > 0) {
				--this.dC;
			}

			if (super.W[1] == 1 || super.W[2] == 1 || super.W[3] == 1
					|| super.W[4] == 1) {
				this.dD = true;
			}

			if (this.dD && this.dC <= 0) {
				this.dC = 20;
				this.dD = false;
				this.gs.a(86);
				this.gs.writeShort(this.camPitch);
				this.gs.m(this.camYaw);
			}

			if (super.O && !this.cF) {
				this.cF = true;
				this.gs.a(3);
				this.gs.writeByte(1);
			}

			if (!super.O && this.cF) {
				this.cF = false;
				this.gs.a(3);
				this.gs.writeByte(0);
			}

			int var3;
			int var4;
			int var6;
			int var7;
			if (this.dH == 1) {
				Client var2 = this;

				byte var10000;
				label471: {
					for (var3 = 0; var3 < var2.gj.length; ++var3) {
						if (var2.gj[var3] == null && var2.gS[var3] != -1) {
							var10000 = -1;
							break label471;
						}

						if (var2.ha[var3] == null && var2.gT[var3] != -1) {
							var10000 = -2;
							break label471;
						}
					}

					boolean var12 = true;

					for (var4 = 0; var4 < var2.gj.length; ++var4) {
						byte[] var5;
						if ((var5 = var2.ha[var4]) != null) {
							var6 = (var2.gR[var4] >> 8 << 6) - var2.dO;
							var7 = ((var2.gR[var4] & 255) << 6) - var2.dP;
							if (var2.fS) {
								var6 = 10;
								var7 = 10;
							}

							var12 &= MapRegion.objectsReady(var6, var5, var7);
						}
					}

					if (!var12) {
						var10000 = -3;
					} else if (var2.eC) {
						var10000 = -4;
					} else {
						var2.dH = 2;
						MapRegion.currentPlane = var2.cc;
						var2.n();
						var2.gs.a(121);
						var10000 = 0;
					}
				}

				byte var14 = var10000;
				if (var10000 != 0
						&& System.currentTimeMillis() - this.aO > 360000L) {
					SignLink.reportError(username + " glcfb " + this.gF + ","
							+ var14 + ",false" + "," + this.indices[0] + ","
							+ this.resourceProvider.b() + "," + this.cc + ","
							+ this.eq + "," + this.er);
					this.aO = System.currentTimeMillis();
				}
			}

			if (this.dH == 2 && this.cc != this.de) {
				this.de = this.cc;
				this.i(this.cc);
			}

			this.P();
			this.G();
			++this.dw;
			if (this.dw > 750) {
				this.A();
			}

			this.O();
			this.H();
			this.r();
			++this.cv;
			if (this.cb != 0) {
				this.ca += 20;
				if (this.ca >= 400) {
					this.cb = 0;
				}
			}

			if (this.gZ != 0) {
				++this.gW;
				if (this.gW >= 15) {
					if (this.gZ == 3) {
						D = true;
					}

					this.gZ = 0;
				}
			}

			int var11;
			if (this.eH != 0) {
				++this.dh;
				if (super.mouseX > this.eI + 5 || super.mouseX < this.eI - 5
						|| super.mouseY > this.eJ + 5
						|| super.mouseY < this.eJ - 5) {
					this.gV = true;
				}

				if (super.Q == 0) {
					if (this.eH == 3) {
						D = true;
					}

					this.eH = 0;
					if (this.gV && this.dh >= 15) {
						this.ep = -1;
						this.F();
						var4 = resizeMode == 0 ? 0 : clientWidth / 2 - 356;
						var11 = resizeMode == 0 ? 0 : clientHeight / 2 - 230;
						if (this.eF == 5382 && super.mouseY >= var11 + 40
								&& super.mouseY <= var11 + 77) {
							if (super.mouseX >= var4 + 28
									&& super.mouseX <= var4 + 74) {
								this.gs.a(214);
								this.gs.n('썩');
								this.gs.j(0);
								this.gs.n(this.eG);
								this.gs.l(this.eo);
							}

							if (super.mouseX >= var4 + 75
									&& super.mouseX <= var4 + 121) {
								this.gs.a(214);
								this.gs.n('썪');
								this.gs.j(0);
								this.gs.n(this.eG);
								this.gs.l(this.eo);
							}

							if (super.mouseX >= var4 + 122
									&& super.mouseX <= var4 + 168) {
								this.gs.a(214);
								this.gs.n('썫');
								this.gs.j(0);
								this.gs.n(this.eG);
								this.gs.l(this.eo);
							}

							if (super.mouseX >= var4 + 169
									&& super.mouseX <= var4 + 215) {
								this.gs.a(214);
								this.gs.n('썬');
								this.gs.j(0);
								this.gs.n(this.eG);
								this.gs.l(this.eo);
							}

							if (super.mouseX >= var4 + 216
									&& super.mouseX <= var4 + 262) {
								this.gs.a(214);
								this.gs.n('썭');
								this.gs.j(0);
								this.gs.n(this.eG);
								this.gs.l(this.eo);
							}

							if (super.mouseX >= var4 + 263
									&& super.mouseX <= var4 + 309) {
								this.gs.a(214);
								this.gs.n('썮');
								this.gs.j(0);
								this.gs.n(this.eG);
								this.gs.l(this.eo);
							}

							if (super.mouseX >= var4 + 310
									&& super.mouseX <= var4 + 356) {
								this.gs.a(214);
								this.gs.n('썯');
								this.gs.j(0);
								this.gs.n(this.eG);
								this.gs.l(this.eo);
							}

							if (super.mouseX >= var4 + 357
									&& super.mouseX <= var4 + 403) {
								this.gs.a(214);
								this.gs.n('썰');
								this.gs.j(0);
								this.gs.n(this.eG);
								this.gs.l(this.eo);
							}

							if (super.mouseX >= var4 + 404
									&& super.mouseX <= var4 + 450) {
								this.gs.a(214);
								this.gs.n('썱');
								this.gs.j(0);
								this.gs.n(this.eG);
								this.gs.l(this.eo);
							}
						}

						if (this.ep == this.eF && this.eo != this.eG) {
							Widget var10 = Widget.widgets[this.eF];
							byte var15 = 0;
							if (this.bX == 1 && var10.contentType == 206) {
								var15 = 1;
							}

							if (var10.itemIds[this.eo] <= 0) {
								var15 = 0;
							}

							if (var10.replaceItems) {
								var11 = this.eG;
								var3 = this.eo;
								var10.itemIds[var3] = var10.itemIds[var11];
								var10.itemAmounts[var3] = var10.itemAmounts[var11];
								var10.itemIds[var11] = -1;
								var10.itemAmounts[var11] = 0;
							} else if (var15 == 1) {
								var11 = this.eG;
								var3 = this.eo;

								while (var11 != var3) {
									if (var11 > var3) {
										var10.swapInventoryItems(var11,
												var11 - 1);
										--var11;
									} else if (var11 < var3) {
										var10.swapInventoryItems(var11,
												var11 + 1);
										++var11;
									}
								}
							} else {
								var10.swapInventoryItems(this.eG, this.eo);
							}

							this.gs.a(214);
							this.gs.n(this.eF);
							this.gs.j(var15);
							this.gs.n(this.eG);
							this.gs.l(this.eo);
						}
					} else if ((this.hg == 1 || this.g(this.fB - 1))
							&& this.fB > 2) {
						this.Q();
					} else if (this.fB > 0) {
						this.n(this.fB - 1);
					}

					this.gW = 10;
					super.T = 0;
				}
			}

			if (SceneGraph.b != -1) {
				var1 = SceneGraph.b;
				var4 = SceneGraph.c;
				boolean var13 = this.a(0, 0, 0, 0, localPlayer.pathY[0], 0, 0,
						var4, localPlayer.pathX[0], true, var1);
				SceneGraph.b = -1;
				if (var13) {
					this.bY = super.U;
					this.bZ = super.V;
					this.cb = 1;
					this.ca = 0;
				}
			}

			if (super.T == 1 && this.be != null) {
				this.be = null;
				D = true;
				super.T = 0;
			}

			this.m();
			if (super.Q == 1 || super.T == 1) {
				++this.gD;
			}

			if (this.hQ == 0 && this.hN == 0 && this.hO == 0) {
				if (this.hR > 0) {
					--this.hR;
				}
			} else if (this.hR < 0 && !this.bG) {
				++this.hR;
				if (this.hR == 0 && this.hQ != 0) {
					D = true;
				}
			}

			if (this.dH == 2) {
				this.K();
			}

			if (this.dH == 2 && this.fT) {
				var4 = (this.fc << 7) + 64;
				var11 = (this.fd << 7) + 64;
				var3 = this.b(this.cc, var11, var4) - this.fe;
				if (this.bn < var4) {
					this.bn += this.ff + (var4 - this.bn) * this.fg / 1000;
					if (this.bn > var4) {
						this.bn = var4;
					}
				}

				if (this.bn > var4) {
					this.bn -= this.ff + (this.bn - var4) * this.fg / 1000;
					if (this.bn < var4) {
						this.bn = var4;
					}
				}

				if (this.bo < var3) {
					this.bo += this.ff + (var3 - this.bo) * this.fg / 1000;
					if (this.bo > var3) {
						this.bo = var3;
					}
				}

				if (this.bo > var3) {
					this.bo -= this.ff + (this.bo - var3) * this.fg / 1000;
					if (this.bo < var3) {
						this.bo = var3;
					}
				}

				if (this.bp < var11) {
					this.bp += this.ff + (var11 - this.bp) * this.fg / 1000;
					if (this.bp > var11) {
						this.bp = var11;
					}
				}

				if (this.bp > var11) {
					this.bp -= this.ff + (this.bp - var11) * this.fg / 1000;
					if (this.bp < var11) {
						this.bp = var11;
					}
				}

				var4 = (this.dk << 7) + 64;
				var11 = (this.dl << 7) + 64;
				var3 = this.b(this.cc, var11, var4) - this.dm;
				var4 -= this.bn;
				int var16 = var3 - this.bo;
				var6 = var11 - this.bp;
				var7 = (int) Math.sqrt((double) (var4 * var4 + var6 * var6));
				var11 = (int) (Math.atan2((double) var16, (double) var7) * 325.949D) & 2047;
				var4 = (int) (Math.atan2((double) var4, (double) var6) * -325.949D) & 2047;
				if (var11 < 128) {
					var11 = 128;
				}

				if (var11 > 383) {
					var11 = 383;
				}

				if (this.bq < var11) {
					this.bq += this.dn + (var11 - this.bq) * this.do_ / 1000;
					if (this.bq > var11) {
						this.bq = var11;
					}
				}

				if (this.bq > var11) {
					this.bq -= this.dn + (this.bq - var11) * this.do_ / 1000;
					if (this.bq < var11) {
						this.bq = var11;
					}
				}

				if ((var11 = var4 - this.br) > 1024) {
					var11 -= 2048;
				}

				if (var11 < -1024) {
					var11 += 2048;
				}

				if (var11 > 0) {
					this.br += this.dn + var11 * this.do_ / 1000;
					this.br &= 2047;
				}

				if (var11 < 0) {
					this.br -= this.dn + -var11 * this.do_ / 1000;
					this.br &= 2047;
				}

				if ((var3 = var4 - this.br) > 1024) {
					var3 -= 2048;
				}

				if (var3 < -1024) {
					var3 += 2048;
				}

				if (var3 < 0 && var11 > 0 || var3 > 0 && var11 < 0) {
					this.br = var4;
				}
			}

			for (var1 = 0; var1 < 5; ++var1) {
				++this.dL[var1];
			}

			this.D();
			++super.P;
			if (super.P > 20000) {
				this.dy = 250;
				super.P -= 2000;
				this.gs.a(202);
			}

			++this.dx;
			if (this.dx > 50) {
				this.gs.a(0);
			}

			try {
				if (this.fZ != null && this.gs.position > 0) {
					this.fZ.a(this.gs.position, this.gs.buf);
					this.gs.position = 0;
					this.dx = 0;
					return;
				}
			} catch (IOException var8) {
				this.A();
				return;
			} catch (Exception var9) {
				this.s();
			}

		}
	}

	private void z() {
		for (Class15 var1 = (Class15) this.gf.getBack(); var1 != null; var1 = (Class15) this.gf
				.getPrevious()) {
			if (var1.d == -1) {
				var1.l = 0;
				this.a(var1);
			} else {
				var1.unlink();
			}
		}

	}

	final void statusText(int var1, String var2) throws Throwable {
		this.eB = var1;
		this.ea = var2;
		if (this.fj == null) {
			super.mainImageProducer = null;
			this.fX = null;
			this.fV = null;
			this.fU = null;
			this.fW = null;
			this.fw = null;
			this.fm = new ProducingGraphicsBuffer(128, 265,
					this.getFrameComponent());
			Rasterizer2D.reset();
			this.fn = new ProducingGraphicsBuffer(128, 265,
					this.getFrameComponent());
			Rasterizer2D.reset();
			this.fj = new ProducingGraphicsBuffer(509, 171,
					this.getFrameComponent());
			Rasterizer2D.reset();
			this.fk = new ProducingGraphicsBuffer(360, 132,
					this.getFrameComponent());
			Rasterizer2D.reset();
			this.loginScreen = new ProducingGraphicsBuffer(360, 200,
					this.getFrameComponent());
			Rasterizer2D.reset();
			this.fo = new ProducingGraphicsBuffer(202, 238,
					this.getFrameComponent());
			Rasterizer2D.reset();
			this.fp = new ProducingGraphicsBuffer(203, 238,
					this.getFrameComponent());
			Rasterizer2D.reset();
			this.fq = new ProducingGraphicsBuffer(74, 94,
					this.getFrameComponent());
			Rasterizer2D.reset();
			this.fr = new ProducingGraphicsBuffer(75, 94,
					this.getFrameComponent());
			Rasterizer2D.reset();
			if (this.fonts != null) {
				this.v();
				this.u();
			}

			this.hh = true;
		}

		if (this.fonts == null) {
			super.statusText(var1, var2);
		} else {
			this.prepareRasterizerForLoginScreen();
			int var3 = clientWidth / 2;
			int var4 = clientHeight / 2;
			this.b12_full.a(16777215, var3, "vscape is loading - please wait...",
					var4 - 23 - 20, true);
			int var5 = var4 - 18 - 20;
			Rasterizer2D.drawRectangle(var3 - 152, 304, 34, 9179409, var5);
			Rasterizer2D.drawRectangle(var3 - 151, 302, 32, 0, var5 + 1);
			Rasterizer2D.fillRectangle(30, var5 + 2, var3 - 150, 9179409,
					var1 * 3);
			Rasterizer2D.fillRectangle(30, var5 + 2, var3 - 150 + var1 * 3, 0,
					300 - var1 * 3);
			this.b12_full.a(16777215, var2, var4 + 4 - 20, var3);
			this.loginScreen.drawImage(0, super.frameGraphics, 0);
			if (this.hh) {
				this.hh = false;
			}

		}
	}

	private void a(int var1, int var2, int var3, int var4, Widget var5,
			int var6, boolean var7, int var8) {
		byte var9;
		if (this.cT) {
			var9 = 32;
		} else {
			var9 = 0;
		}

		this.cT = false;
		if (var3 >= var1 && var3 < var1 + 16 && var4 >= var6
				&& var4 < var6 + 16) {
			var5.q -= this.gD << 2;
			if (var7) {
				return;
			}
		} else if (var3 >= var1 && var3 < var1 + 16 && var4 >= var6 + var2 - 16
				&& var4 < var6 + var2) {
			var5.q += this.gD << 2;
			if (var7) {
				return;
			}
		} else if (var3 >= var1 - var9 && var3 < var1 + 16 + var9
				&& var4 >= var6 + 16 && var4 < var6 + var2 - 16 && this.gD > 0) {
			if ((var1 = (var2 - 32) * var2 / var8) < 8) {
				var1 = 8;
			}

			var3 = var4 - var6 - 16 - var1 / 2;
			var1 = var2 - 32 - var1;
			var5.q = (short) ((var8 - var2) * var3 / var1);
			this.cT = true;
		}

	}

	private boolean c(int var1, int var2, int var3) {
		int var4 = var1 >> 14 & 32767;
		if ((var1 = this.scene.c(this.cc, var3, var2, var1)) == -1) {
			return false;
		} else {
			int var5 = var1 & 31;
			var1 = var1 >> 6 & 3;
			if (var5 != 10 && var5 != 11 && var5 != 22) {
				this.a(2, var1, 0, var5 + 1, localPlayer.pathY[0], 0, 0, var2,
						localPlayer.pathX[0], false, var3);
			} else {
				ObjectDefinition var7 = ObjectDefinition.byId(var4);
				int var6;
				if (var1 != 0 && var1 != 2) {
					var5 = var7.length;
					var6 = var7.width;
				} else {
					var5 = var7.width;
					var6 = var7.length;
				}

				var4 = var7.surroundings;
				if (var1 != 0) {
					var4 = (var4 << var1 & 15) + (var4 >> 4 - var1);
				}

				this.a(2, 0, var6, 0, localPlayer.pathY[0], var5, var4, var2,
						localPlayer.pathX[0], false, var3);
			}

			this.bY = super.U;
			this.bZ = super.V;
			this.cb = 2;
			this.ca = 0;
			return true;
		}
	}

	private Archive getArchive(int var1, String var2, String var3, int var4, int var5)
			throws Throwable {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (this.indices[0] != null) {
				var6 = this.indices[0].decompress(var1);
			}
		} catch (Exception var16) {
			;
		}

		if (var6 != null) {
			return new Archive(var6);
		} else {
			while (var6 == null) {
				String var8 = "Unknown error";
				this.statusText(var5, "Requesting " + var2);

				int var9;
				try {
					var9 = 0;
					DataInputStream var10 = this.d(var3 + var4);
					byte[] var11 = new byte[6];
					var10.readFully(var11, 0, 6);
					Buffer var21;
					(var21 = new Buffer(var11)).position = 3;
					int var12 = var21.readTriByte() + 6;
					int var13 = 6;
					var6 = new byte[var12];
					System.arraycopy(var11, 0, var6, 0, 6);

					int var22;
					for (; var13 < var12; var9 = var22) {
						if ((var22 = var12 - var13) > 1000) {
							var22 = 1000;
						}

						if ((var22 = var10.read(var6, var13, var22)) < 0) {
							(new StringBuilder("Length error: ")).append(var13)
									.append("/").append(var12).toString();
							throw new IOException("EOF");
						}

						if ((var22 = (var13 += var22) * 100 / var12) != var9) {
							this.statusText(var5, "Loading " + var2 + " - "
									+ var22 + "%");
						}
					}

					var10.close();

					try {
						if (this.indices[0] != null) {
							this.indices[0].put(var6.length, var6, var1);
						}
					} catch (Exception var15) {
						this.indices[0] = null;
					}
				} catch (IOException var17) {
					if (var8.equals("Unknown error")) {
						var8 = "Connection error";
					}

					var6 = null;
				} catch (NullPointerException var18) {
					var8 = "Null error";
					var6 = null;
					if (!SignLink.e) {
						return null;
					}
				} catch (ArrayIndexOutOfBoundsException var19) {
					var8 = "Bounds error";
					var6 = null;
					if (!SignLink.e) {
						return null;
					}
				} catch (Exception var20) {
					var8 = "Unexpected error";
					var6 = null;
					if (!SignLink.e) {
						return null;
					}
				}

				if (var6 == null) {
					for (var9 = var7; var9 > 0; --var9) {
						this.statusText(var5, var8 + " - Retrying in " + var9);

						try {
							Thread.sleep(1000L);
						} catch (Exception var14) {
							;
						}
					}

					if ((var7 <<= 1) > 60) {
						var7 = 60;
					}

					this.bw = !this.bw;
				}
			}

			return new Archive(var6);
		}
	}

	private void A() {
		if (this.dy > 0) {
			this.s();
		} else {
			this.fW.initializeRasterizer();
			this.p12_full.a(0, "Connection lost", 144, 257);
			this.p12_full.a(16777215, "Connection lost", 143, 256);
			this.p12_full.a(0, "Please wait - attempting to reestablish", 159, 257);
			this.p12_full.a(16777215, "Please wait - attempting to reestablish", 158,
					256);
			this.fW.drawImage(4, super.frameGraphics, 4);
			this.dG = 0;
			this.hl = 0;
			BufferedConnection var1 = this.fZ;
			this.loggedIn = false;
			this.dS = 0;
			this.a(username, password, true);
			if (!this.loggedIn) {
				this.s();
			}

			try {
				var1.a();
			} catch (Exception var2) {
				;
			}
		}
	}

	private void B() {
		this.hB = 0;
		this.fA = 0;
		this.bR = 0;
		this.camYaw = 0;
		this.gB = 0;
		this.ga = 0;
	}

	private void n(int var1) throws Throwable {
		if (var1 >= 0) {
			if (this.gJ != 0 && this.gJ != 3 && this.gJ != 4) {
				this.gJ = 0;
				D = true;
			}

			int var2 = this.eT[var1];
			int var3 = this.eU[var1];
			int var4 = this.eV[var1];
			int var5 = this.eW[var1];
			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 696) {
				this.B();
			}

			Widget var6;
			if (var4 == 104) {
				eK = (var6 = Widget.widgets[var3]).id;
				if (!this.aB) {
					this.aB = true;
					this.aH = var6.id;
					this.gs.a(185);
					this.gs.writeShort(var6.id);
				} else if (this.aH == var6.id) {
					this.aB = false;
					this.aH = 0;
					this.gs.a(185);
					this.gs.writeShort(var6.id);
				} else if (this.aH != var6.id) {
					this.aB = true;
					this.aH = var6.id;
					this.gs.a(185);
					this.gs.writeShort(var6.id);
				}
			}

			Npc var12;
			if (var4 == 582 && (var12 = this.aW[var5]) != null) {
				this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0, var12.pathY[0],
						localPlayer.pathX[0], false, var12.pathX[0]);
				this.bY = super.U;
				this.bZ = super.V;
				this.cb = 2;
				this.ca = 0;
				this.gs.a(57);
				this.gs.m(this.hH);
				this.gs.m(var5);
				this.gs.l(this.hF);
				this.gs.m(this.hG);
			}

			if (var4 == 234) {
				if (!this.a(2, 0, 0, 0, localPlayer.pathY[0], 0, 0, var3,
						localPlayer.pathX[0], false, var2)) {
					this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0, var3,
							localPlayer.pathX[0], false, var2);
				}

				this.bY = super.U;
				this.bZ = super.V;
				this.cb = 2;
				this.ca = 0;
				this.gs.a(236);
				this.gs.l(var3 + this.dP);
				this.gs.writeShort(var5);
				this.gs.l(var2 + this.dO);
			}

			if (var4 == 62 && this.c(var5, var3, var2)) {
				this.gs.a(192);
				this.gs.writeShort(this.hG);
				this.gs.l(var5 >> 14 & 32767);
				this.gs.n(var3 + this.dP);
				this.gs.l(this.hF);
				this.gs.n(var2 + this.dO);
				this.gs.writeShort(this.hH);
			}

			if (var4 == 511) {
				if (!this.a(2, 0, 0, 0, localPlayer.pathY[0], 0, 0, var3,
						localPlayer.pathX[0], false, var2)) {
					this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0, var3,
							localPlayer.pathX[0], false, var2);
				}

				this.bY = super.U;
				this.bZ = super.V;
				this.cb = 2;
				this.ca = 0;
				this.gs.a(25);
				this.gs.l(this.hG);
				this.gs.m(this.hH);
				this.gs.writeShort(var5);
				this.gs.m(var3 + this.dP);
				this.gs.n(this.hF);
				this.gs.writeShort(var2 + this.dO);
			}

			if (var4 == 74) {
				this.gs.a(122);
				this.gs.n(var3);
				this.gs.m(var2);
				this.gs.l(var5);
				this.gW = 0;
				this.gX = var3;
				this.gY = var2;
				this.gZ = 2;
				if (Widget.widgets[var3].parent == j) {
					this.gZ = 1;
				}

				if (Widget.widgets[var3].parent == this.hA) {
					this.gZ = 3;
				}
			}

			if (var4 == 315) {
				var6 = Widget.widgets[var3];
				boolean var7 = true;
				if (var6.contentType > 0) {
					var7 = this.a(var6);
				}

				if (var7) {
					switch (var3) {
					case 19156:
						this.showRoofs = !this.showRoofs;
						VScapeSettings.write();
						break;
					case 24149:
						this.e(0);
						VScapeSettings.write();
						break;
					case 24150:
						this.e(1);
						VScapeSettings.write();
						break;
					case 24151:
						this.e(2);
						break;
					default:
						this.gs.a(185);
						this.gs.writeShort(var3);
					}
				}
			}

			Player var13;
			if (var4 == 561 && (var13 = this.bL[var5]) != null) {
				this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0, var13.pathY[0],
						localPlayer.pathX[0], false, var13.pathX[0]);
				this.bY = super.U;
				this.bZ = super.V;
				this.cb = 2;
				this.ca = 0;
				if ((go += var5) >= 90) {
					this.gs.a(136);
					go = 0;
				}

				this.gs.a(128);
				this.gs.writeShort(var5);
			}

			if (var4 == 20 && (var12 = this.aW[var5]) != null) {
				this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0, var12.pathY[0],
						localPlayer.pathX[0], false, var12.pathX[0]);
				this.bY = super.U;
				this.bZ = super.V;
				this.cb = 2;
				this.ca = 0;
				this.gs.a(155);
				this.gs.l(var5);
			}

			if (var4 == 779 && (var13 = this.bL[var5]) != null) {
				this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0, var13.pathY[0],
						localPlayer.pathX[0], false, var13.pathX[0]);
				this.bY = super.U;
				this.bZ = super.V;
				this.cb = 2;
				this.ca = 0;
				this.gs.a(153);
				this.gs.l(var5);
			}

			if (var4 == 519) {
				if (!this.bG) {
					SceneGraph.b(super.V - 4, super.U - 4);
				} else {
					SceneGraph.b(var3 - 4, var2 - 4);
				}
			}

			if (var4 == 1062) {
				if ((ce += this.dO) >= 113) {
					this.gs.a(183);
					this.gs.e(15086193);
					ce = 0;
				}

				this.c(var5, var3, var2);
				this.gs.a(228);
				this.gs.m(var5 >> 14 & 32767);
				this.gs.m(var3 + this.dP);
				this.gs.writeShort(var2 + this.dO);
			}

			if (var4 == 679 && !this.fK) {
				this.gs.a(40);
				this.gs.writeShort(var3);
				this.fK = true;
			}

			if (var4 == 431) {
				this.gs.a(129);
				this.gs.m(var2);
				this.gs.writeShort(var3);
				this.gs.m(var5);
				this.gW = 0;
				this.gX = var3;
				this.gY = var2;
				this.gZ = 2;
				if (Widget.widgets[var3].parent == j) {
					this.gZ = 1;
				}

				if (Widget.widgets[var3].parent == this.hA) {
					this.gZ = 3;
				}
			}

			long var8;
			int var14;
			String var15;
			if ((var4 == 337 || var4 == 42 || var4 == 792 || var4 == 322)
					&& (var14 = (var15 = this.gw[var1]).indexOf("@whi@")) != -1) {
				var8 = StringUtils.a(var15.substring(var14 + 5).trim());
				if (var4 == 337) {
					this.b(var8);
				}

				if (var4 == 42) {
					this.c(var8);
				}

				if (var4 == 792) {
					this.a(var8);
				}

				if (var4 == 322) {
					this.d(var8);
				}
			}

			if ((var4 == 1500 || var4 == 1501 || var4 == 1502)
					&& (var14 = (var15 = this.gw[var1]).indexOf("@whi@")) != -1) {
				var8 = StringUtils.a(var15.substring(var14 + 5).trim());
				if (var4 == 1500) {
					this.a(var8, 0);
				}

				if (var4 == 1501) {
					this.a(var8, 1);
				}

				if (var4 == 1502) {
					this.a(var8, 2);
				}
			}

			if (var4 == 53) {
				this.gs.a(135);
				this.gs.l(var2);
				this.gs.m(var3);
				this.gs.l(var5);
				this.gW = 0;
				this.gX = var3;
				this.gY = var2;
				this.gZ = 2;
				if (Widget.widgets[var3].parent == j) {
					this.gZ = 1;
				}

				if (Widget.widgets[var3].parent == this.hA) {
					this.gZ = 3;
				}
			}

			if (var4 == 539) {
				this.gs.a(16);
				this.gs.m(var5);
				this.gs.n(var2);
				this.gs.n(var3);
				this.gW = 0;
				this.gX = var3;
				this.gY = var2;
				this.gZ = 2;
				if (Widget.widgets[var3].parent == j) {
					this.gZ = 1;
				}

				if (Widget.widgets[var3].parent == this.hA) {
					this.gZ = 3;
				}
			}

			if (var4 == 927) {
				var14 = (var15 = this.gw[var1]).indexOf("@lre@");
				var15 = var15.substring(var14 + 5).trim();
				this.e(var15);
				System.out.println("Opening page:" + var15);
			}

			String var10;
			int var18;
			if ((var4 == 484 || var4 == 6)
					&& (var14 = (var15 = this.gw[var1]).indexOf("@whi@")) != -1) {
				var10 = StringUtils.formatName(StringUtils
						.longToName(StringUtils.a(var15.substring(var14 + 5)
								.trim())));
				boolean var11 = false;

				for (var18 = 0; var18 < this.bM; ++var18) {
					Player var16;
					if ((var16 = this.bL[this.bN[var18]]) != null
							&& var16.name != null
							&& var16.name.equalsIgnoreCase(var10)) {
						this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0,
								var16.pathY[0], localPlayer.pathX[0], false,
								var16.pathX[0]);
						if (var4 == 484) {
							this.gs.a(139);
							this.gs.l(this.bN[var18]);
						}

						if (var4 == 6) {
							if ((go += var5) >= 90) {
								this.gs.a(136);
								go = 0;
							}

							this.gs.a(128);
							this.gs.writeShort(this.bN[var18]);
						}

						var11 = true;
						break;
					}
				}

				if (!var11) {
					this.a("Unable to find " + var10, 0, "", true);
				}
			}

			if (var4 == 870) {
				this.gs.a(53);
				this.gs.writeShort(var2);
				this.gs.m(this.hF);
				this.gs.n(var5);
				this.gs.writeShort(this.hG);
				this.gs.l(this.hH);
				this.gs.writeShort(var3);
				this.gW = 0;
				this.gX = var3;
				this.gY = var2;
				this.gZ = 2;
				if (Widget.widgets[var3].parent == j) {
					this.gZ = 1;
				}

				if (Widget.widgets[var3].parent == this.hA) {
					this.gZ = 3;
				}
			}

			if (var4 == 847) {
				this.gs.a(87);
				this.gs.m(var5);
				this.gs.writeShort(var3);
				this.gs.m(var2);
				this.gW = 0;
				this.gX = var3;
				this.gY = var2;
				this.gZ = 2;
				if (Widget.widgets[var3].parent == j) {
					this.gZ = 1;
				}

				if (Widget.widgets[var3].parent == this.hA) {
					this.gZ = 3;
				}
			}

			String var22;
			if (var4 == 626) {
				var6 = Widget.widgets[var3];
				this.fD = 1;
				eK = var6.id;
				this.fE = var3;
				this.fF = var6.optionAttributes;
				this.hE = 0;
				var22 = var6.optionCircumfix;
				if (var6.optionCircumfix.indexOf(" ") != -1) {
					var22 = var22.substring(0, var22.indexOf(" "));
				}

				var10 = var6.optionCircumfix;
				if (var6.optionCircumfix.indexOf(" ") != -1) {
					var10 = var10.substring(var10.indexOf(" ") + 1);
				}

				this.fG = var22 + " " + var6.optionText + " " + var10;
				if (this.fF == 16) {
					C = 3;
					fh = true;
				}

			} else {
				if (var4 == 78) {
					this.gs.a(117);
					this.gs.n(var3);
					this.gs.n(var5);
					this.gs.l(var2);
					this.gW = 0;
					this.gX = var3;
					this.gY = var2;
					this.gZ = 2;
					if (Widget.widgets[var3].parent == j) {
						this.gZ = 1;
					}

					if (Widget.widgets[var3].parent == this.hA) {
						this.gZ = 3;
					}
				}

				if (var4 == 27 && (var13 = this.bL[var5]) != null) {
					this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0,
							var13.pathY[0], localPlayer.pathX[0], false,
							var13.pathX[0]);
					this.bY = super.U;
					this.bZ = super.V;
					this.cb = 2;
					this.ca = 0;
					if ((df += var5) >= 54) {
						this.gs.a(189);
						this.gs.writeByte(234);
						df = 0;
					}

					this.gs.a(73);
					this.gs.l(var5);
				}

				if (var4 == 213) {
					if (!this.a(2, 0, 0, 0, localPlayer.pathY[0], 0, 0, var3,
							localPlayer.pathX[0], false, var2)) {
						this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0, var3,
								localPlayer.pathX[0], false, var2);
					}

					this.bY = super.U;
					this.bZ = super.V;
					this.cb = 2;
					this.ca = 0;
					this.gs.a(79);
					this.gs.l(var3 + this.dP);
					this.gs.writeShort(var5);
					this.gs.m(var2 + this.dO);
				}

				if (var4 == 632) {
					this.gs.a(145);
					this.gs.m(var3);
					this.gs.m(var2);
					this.gs.m(var5);
					this.gW = 0;
					this.gX = var3;
					this.gY = var2;
					this.gZ = 2;
					if (Widget.widgets[var3].parent == j) {
						this.gZ = 1;
					}

					if (Widget.widgets[var3].parent == this.hA) {
						this.gZ = 3;
					}
				}

				if (var4 >= 700 && var4 <= 705) {
					var18 = 110 + (var4 - 700);
					this.gs.a(var18);
					this.gs.n(var3);
					this.gs.n(var5);
					this.gs.l(var2);
					this.gW = 0;
					this.gX = var3;
					this.gY = var2;
					this.gZ = 2;
					if (Widget.widgets[var3].parent == j) {
						this.gZ = 1;
					}

					if (Widget.widgets[var3].parent == this.hA) {
						this.gZ = 3;
					}
				}

				if (var4 == 1010) {
					this.camYaw = 20;
				}

				if (var4 == 1050) {
					if (!this.ay) {
						this.ay = true;
						this.h(429, 1);
						this.gs.a(185);
						this.gs.writeShort(153);
					} else {
						this.ay = false;
						this.h(429, 0);
						this.gs.a(185);
						this.gs.writeShort(152);
					}

					this.h(429, this.ay ? 1 : 0);
				}

				if (var4 == 1008) {
					this.g = 2;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 1007) {
					this.g = 1;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 1006) {
					this.g = 0;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 1005) {
					this.ah = 0;
					this.aG = 9;
					D = true;
				}

				if (var4 == 1004 && u[10] != -1) {
					C = 10;
					fh = true;
				}

				if (var4 == 1002) {
					this.h = 2;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 1001) {
					this.h = 1;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 1000) {
					this.h = 0;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 999) {
					this.ah = 0;
					this.aG = 0;
					D = true;
				}

				if (var4 == 998) {
					this.ah = 1;
					this.aG = 5;
					D = true;
				}

				if (var4 == 997) {
					this.G = 3;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 996) {
					this.G = 2;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 995) {
					this.G = 1;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 994) {
					this.G = 0;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 993) {
					this.ah = 2;
					this.aG = 1;
					D = true;
				}

				if (var4 == 992) {
					this.i = 2;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 991) {
					this.i = 1;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 990) {
					this.i = 0;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 989) {
					this.ah = 3;
					this.aG = 2;
					D = true;
				}

				if (var4 == 987) {
					this.F = 2;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 986) {
					this.F = 1;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 985) {
					this.F = 0;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 984) {
					this.ah = 5;
					this.aG = 3;
					D = true;
				}

				if (var4 == 983) {
					this.f = 2;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 982) {
					this.f = 1;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 981) {
					this.f = 0;
					D = true;
					VScapeSettings.write();
				}

				if (var4 == 980) {
					this.ah = 6;
					this.aG = 16;
					D = true;
				}

				if (var4 == 493) {
					this.gs.a(75);
					this.gs.n(var3);
					this.gs.l(var2);
					this.gs.m(var5);
					this.gW = 0;
					this.gX = var3;
					this.gY = var2;
					this.gZ = 2;
					if (Widget.widgets[var3].parent == j) {
						this.gZ = 1;
					}

					if (Widget.widgets[var3].parent == this.hA) {
						this.gZ = 3;
					}
				}

				if (var4 == 652) {
					if (!this.a(2, 0, 0, 0, localPlayer.pathY[0], 0, 0, var3,
							localPlayer.pathX[0], false, var2)) {
						this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0, var3,
								localPlayer.pathX[0], false, var2);
					}

					this.bY = super.U;
					this.bZ = super.V;
					this.cb = 2;
					this.ca = 0;
					this.gs.a(156);
					this.gs.m(var2 + this.dO);
					this.gs.l(var3 + this.dP);
					this.gs.n(var5);
				}

				if (var4 == 94) {
					if (!this.a(2, 0, 0, 0, localPlayer.pathY[0], 0, 0, var3,
							localPlayer.pathX[0], false, var2)) {
						this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0, var3,
								localPlayer.pathX[0], false, var2);
					}

					this.bY = super.U;
					this.bZ = super.V;
					this.cb = 2;
					this.ca = 0;
					this.gs.a(181);
					this.gs.l(var3 + this.dP);
					this.gs.writeShort(var5);
					this.gs.l(var2 + this.dO);
					this.gs.m(this.fE);
				}

				if (var4 == 646) {
					this.gs.a(185);
					this.gs.writeShort(var3);
					if ((var6 = Widget.widgets[var3]).s != null
							&& var6.s[0][0] == 5) {
						var14 = var6.s[0][1];
						if (this.m[var14] != var6.f[0]) {
							this.m[var14] = var6.f[0];
							this.j(var14);
						}
					}
				}

				if (var4 == 225 && (var12 = this.aW[var5]) != null) {
					this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0,
							var12.pathY[0], localPlayer.pathX[0], false,
							var12.pathX[0]);
					this.bY = super.U;
					this.bZ = super.V;
					this.cb = 2;
					this.ca = 0;
					if ((gK += var5) >= 85) {
						this.gs.a(230);
						this.gs.writeByte(239);
						gK = 0;
					}

					this.gs.a(17);
					this.gs.n(var5);
				}

				if (var4 == 965 && (var12 = this.aW[var5]) != null) {
					this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0,
							var12.pathY[0], localPlayer.pathX[0], false,
							var12.pathX[0]);
					this.bY = super.U;
					this.bZ = super.V;
					this.cb = 2;
					this.ca = 0;
					if (++fC >= 96) {
						this.gs.a(152);
						this.gs.writeByte(88);
						fC = 0;
					}

					this.gs.a(21);
					this.gs.writeShort(var5);
				}

				if (var4 == 413 && (var12 = this.aW[var5]) != null) {
					this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0,
							var12.pathY[0], localPlayer.pathX[0], false,
							var12.pathX[0]);
					this.bY = super.U;
					this.bZ = super.V;
					this.cb = 2;
					this.ca = 0;
					this.gs.a(131);
					this.gs.n(var5);
					this.gs.m(this.fE);
				}

				if (var4 == 200) {
					this.Y();
				}

				if (var4 == 1025 && (var12 = this.aW[var5]) != null) {
					ActorDefinition var17 = var12.npcDefinition;
					if (var12.npcDefinition.morphisms != null) {
						var17 = var17.morph();
					}

					if (var17 != null) {
						this.gs.a(222);
						this.gs.writeShort(var17.b);
					}
				}

				if (var4 == 900) {
					this.c(var5, var3, var2);
					this.gs.a(252);
					this.gs.n(var5 >> 14 & 32767);
					this.gs.l(var3 + this.dP);
					this.gs.m(var2 + this.dO);
				}

				if (var4 == 412 && (var12 = this.aW[var5]) != null) {
					this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0,
							var12.pathY[0], localPlayer.pathX[0], false,
							var12.pathX[0]);
					this.bY = super.U;
					this.bZ = super.V;
					this.cb = 2;
					this.ca = 0;
					this.gs.a(72);
					this.gs.m(var5);
				}

				if (var4 == 365 && (var13 = this.bL[var5]) != null) {
					this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0,
							var13.pathY[0], localPlayer.pathX[0], false,
							var13.pathX[0]);
					this.bY = super.U;
					this.bZ = super.V;
					this.cb = 2;
					this.ca = 0;
					this.gs.a(249);
					this.gs.m(var5);
					this.gs.l(this.fE);
				}

				if (var4 == 729 && (var13 = this.bL[var5]) != null) {
					this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0,
							var13.pathY[0], localPlayer.pathX[0], false,
							var13.pathX[0]);
					this.bY = super.U;
					this.bZ = super.V;
					this.cb = 2;
					this.ca = 0;
					this.gs.a(39);
					this.gs.l(var5);
				}

				if (var4 == 577 && (var13 = this.bL[var5]) != null) {
					this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0,
							var13.pathY[0], localPlayer.pathX[0], false,
							var13.pathX[0]);
					this.bY = super.U;
					this.bZ = super.V;
					this.cb = 2;
					this.ca = 0;
					this.gs.a(139);
					this.gs.l(var5);
				}

				if (var4 == 956 && this.c(var5, var3, var2)) {
					this.gs.a(35);
					this.gs.l(var2 + this.dO);
					this.gs.m(this.fE);
					this.gs.m(var3 + this.dP);
					this.gs.l(var5 >> 14 & 32767);
				}

				if (var4 == 567) {
					if (!this.a(2, 0, 0, 0, localPlayer.pathY[0], 0, 0, var3,
							localPlayer.pathX[0], false, var2)) {
						this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0, var3,
								localPlayer.pathX[0], false, var2);
					}

					this.bY = super.U;
					this.bZ = super.V;
					this.cb = 2;
					this.ca = 0;
					this.gs.a(23);
					this.gs.l(var3 + this.dP);
					this.gs.l(var5);
					this.gs.l(var2 + this.dO);
				}

				if (var4 == 867) {
					if ((var5 & 3) == 0) {
						++gb;
					}

					if (gb >= 59) {
						this.gs.a(200);
						this.gs.writeShort(25501);
						gb = 0;
					}

					this.gs.a(43);
					this.gs.l(var3);
					this.gs.m(var5);
					this.gs.m(var2);
					this.gW = 0;
					this.gX = var3;
					this.gY = var2;
					this.gZ = 2;
					if (Widget.widgets[var3].parent == j) {
						this.gZ = 1;
					}

					if (Widget.widgets[var3].parent == this.hA) {
						this.gZ = 3;
					}
				}

				if (var4 == 543) {
					this.gs.a(237);
					this.gs.writeShort(var2);
					this.gs.m(var5);
					this.gs.writeShort(var3);
					this.gs.m(this.fE);
					this.gW = 0;
					this.gX = var3;
					this.gY = var2;
					this.gZ = 2;
					if (Widget.widgets[var3].parent == j) {
						this.gZ = 1;
					}

					if (Widget.widgets[var3].parent == this.hA) {
						this.gZ = 3;
					}
				}

				if (var4 == 606
						&& (var14 = (var15 = this.gw[var1]).indexOf("@whi@")) != -1) {
					if (j == -1) {
						this.Y();
						this.bE = var15.substring(var14 + 5).trim();
						this.fR = false;

						for (int var19 = 0; var19 < Widget.widgets.length; ++var19) {
							if (Widget.widgets[var19] != null
									&& Widget.widgets[var19].contentType == 600) {
								this.ge = j = Widget.widgets[var19].parent;
								break;
							}
						}
					} else {
						this.a("Please close the interface you have open before using \'report abuse\'",
								0, "");
					}
				}

				if (var4 == 491 && (var13 = this.bL[var5]) != null) {
					this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0,
							var13.pathY[0], localPlayer.pathX[0], false,
							var13.pathX[0]);
					this.bY = super.U;
					this.bZ = super.V;
					this.cb = 2;
					this.ca = 0;
					this.gs.a(14);
					this.gs.writeShort(var5);
					this.gs.l(this.hF);
				}

				if (var4 == 639
						&& (var14 = (var15 = this.gw[var1]).indexOf("@whi@")) != -1) {
					var8 = StringUtils.a(var15.substring(var14 + 5).trim());
					var18 = -1;

					for (var14 = 0; var14 < this.bS; ++var14) {
						if (this.cG[var14] == var8) {
							var18 = var14;
							break;
						}
					}

					if (var18 != -1 && this.aQ[var18] > 0) {
						D = true;
						this.gJ = 0;
						this.hi = true;
						this.gC = "";
						this.em = 3;
						this.cE = this.cG[var18];
						this.fu = "Enter message to send to " + this.eD[var18];
					}
				}

				if (var4 == 454) {
					this.gs.a(41);
					this.gs.writeShort(var5);
					this.gs.m(var2);
					this.gs.m(var3);
					this.gW = 0;
					this.gX = var3;
					this.gY = var2;
					this.gZ = 2;
					if (Widget.widgets[var3].parent == j) {
						this.gZ = 1;
					}

					if (Widget.widgets[var3].parent == this.hA) {
						this.gZ = 3;
					}
				}

				if (var4 == 478 && (var12 = this.aW[var5]) != null) {
					this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0,
							var12.pathY[0], localPlayer.pathX[0], false,
							var12.pathX[0]);
					this.bY = super.U;
					this.bZ = super.V;
					this.cb = 2;
					this.ca = 0;
					if ((var5 & 3) == 0) {
						++fP;
					}

					if (fP >= 53) {
						this.gs.a(85);
						this.gs.writeByte(66);
						fP = 0;
					}

					this.gs.a(18);
					this.gs.l(var5);
				}

				if (var4 == 113) {
					this.c(var5, var3, var2);
					this.gs.a(70);
					this.gs.l(var2 + this.dO);
					this.gs.writeShort(var3 + this.dP);
					this.gs.n(var5 >> 14 & 32767);
				}

				if (var4 == 872) {
					this.c(var5, var3, var2);
					this.gs.a(234);
					this.gs.n(var2 + this.dO);
					this.gs.m(var5 >> 14 & 32767);
					this.gs.n(var3 + this.dP);
				}

				if (var4 == 502) {
					this.c(var5, var3, var2);
					this.gs.a(132);
					this.gs.n(var2 + this.dO);
					this.gs.writeShort(var5 >> 14 & 32767);
					this.gs.m(var3 + this.dP);
				}

				ItemDefinition var23;
				if (var4 == 1125) {
					var23 = ItemDefinition.fromID(var5);
					Widget var20;
					if ((var20 = Widget.widgets[var3]) != null
							&& var20.itemAmounts[var2] >= 100000) {
						var10 = var20.itemAmounts[var2] + " x "
								+ var23.itemName;
					} else if (var23.description != null) {
						var10 = new String(var23.description);
					} else {
						var10 = "It\'s a " + var23.itemName + ".";
					}

					this.a(var10, 0, "", true);
				}

				if (var4 == 169) {
					this.gs.a(185);
					this.gs.writeShort(var3);
					if ((var6 = Widget.widgets[var3]).s != null
							&& var6.s[0][0] == 5) {
						var14 = var6.s[0][1];
						this.m[var14] = 1 - this.m[var14];
						this.j(var14);
					}
				}

				if (var4 == 447) {
					this.hE = 1;
					this.hF = var2;
					this.hG = var3;
					this.hH = var5;
					this.hI = ItemDefinition.fromID(var5).itemName;
					this.fD = 0;
				} else {
					if (var4 == 1226) {
						ObjectDefinition var21;
						if ((var21 = ObjectDefinition.byId(var5 >> 14 & 32767)).description != null) {
							var10 = new String(var21.description);
						} else {
							var10 = "It\'s a " + var21.name + ".";
						}

						this.a(var10, 0, "", true);
					}

					if (var4 == 244) {
						if (!this.a(2, 0, 0, 0, localPlayer.pathY[0], 0, 0,
								var3, localPlayer.pathX[0], false, var2)) {
							this.a(2, 0, 1, 0, localPlayer.pathY[0], 1, 0,
									var3, localPlayer.pathX[0], false, var2);
						}

						this.bY = super.U;
						this.bZ = super.V;
						this.cb = 2;
						this.ca = 0;
						this.gs.a(253);
						this.gs.l(var2 + this.dO);
						this.gs.n(var3 + this.dP);
						this.gs.m(var5);
					}

					if (var4 == 1448) {
						if ((var23 = ItemDefinition.fromID(var5)).description != null) {
							var22 = new String(var23.description);
						} else {
							var22 = "It\'s a " + var23.itemName + ".";
						}

						this.a(var22, 0, "", true);
					}

					this.hE = 0;
					this.fD = 0;
				}
			}
		}
	}

	public void run() {
		if (!this.bD) {
			super.run();
		}

	}

	private void C() {
		if (this.hE == 0 && this.fD == 0) {
			this.gw[this.fB] = "Walk here";
			this.eV[this.fB] = 519;
			this.eT[this.fB] = super.mouseX;
			this.eU[this.fB] = super.mouseY;
			++this.fB;
		}

		int var1 = -1;

		for (int var2 = 0; var2 < Model.D; ++var2) {
			int var3;
			int var4 = (var3 = Model.E[var2]) & 127;
			int var5 = var3 >> 7 & 127;
			int var6 = var3 >> 29 & 3;
			int var7 = var3 >> 14 & 32767;
			if (var3 != var1) {
				var1 = var3;
				int var9;
				if (var6 == 2 && this.scene.c(this.cc, var4, var5, var3) >= 0) {
					ObjectDefinition var8;
					if ((var8 = ObjectDefinition.byId(var7)).morphisms != null) {
						var9 = -1;
						if (var8.morphVarbitIndex != -1) {
							VarBits var17;
							int var10 = (var17 = VarBits.bits[var8.morphVarbitIndex]).setting;
							int var11 = var17.low;
							var9 = var17.high;
							var9 = E[var9 - var11];
							var9 &= ObjectDefinition.client.m[var10] >> var11;
						} else if (var8.morphVariableIndex != -1) {
							var9 = ObjectDefinition.client.m[var8.morphVariableIndex];
						}

						var8 = var9 >= 0 && var9 < var8.morphisms.length
								&& var8.morphisms[var9] != -1 ? ObjectDefinition
								.byId(var8.morphisms[var9]) : null;
					}

					if (var8 == null) {
						continue;
					}

					if (this.hE == 1) {
						this.gw[this.fB] = "Use " + this.hI + " with @cya@"
								+ var8.name;
						this.eV[this.fB] = 62;
						this.eW[this.fB] = var3;
						this.eT[this.fB] = var4;
						this.eU[this.fB] = var5;
						++this.fB;
					} else if (this.fD == 1) {
						if ((this.fF & 4) == 4) {
							this.gw[this.fB] = this.fG + " @cya@" + var8.name;
							this.eV[this.fB] = 956;
							this.eW[this.fB] = var3;
							this.eT[this.fB] = var4;
							this.eU[this.fB] = var5;
							++this.fB;
						}
					} else {
						if (var8.interactions != null) {
							for (var9 = 4; var9 >= 0; --var9) {
								if (var8.interactions[var9] != null) {
									this.gw[this.fB] = var8.interactions[var9]
											+ " @cya@" + var8.name;
									if (var9 == 0) {
										this.eV[this.fB] = 502;
									}

									if (var9 == 1) {
										this.eV[this.fB] = 900;
									}

									if (var9 == 2) {
										this.eV[this.fB] = 113;
									}

									if (var9 == 3) {
										this.eV[this.fB] = 872;
									}

									if (var9 == 4) {
										this.eV[this.fB] = 1062;
									}

									this.eW[this.fB] = var3;
									this.eT[this.fB] = var4;
									this.eU[this.fB] = var5;
									++this.fB;
								}
							}
						}

						this.gw[this.fB] = this.bs < 2 ? "Examine @cya@"
								+ var8.name : "Examine @cya@" + var8.name
								+ " @gre@(@whi@" + var7 + "@gre@) (@whi@"
								+ (var4 + this.dO) + "," + (var5 + this.dP)
								+ "@gre@)";
						this.eV[this.fB] = 1226;
						this.eW[this.fB] = var8.id << 14;
						this.eT[this.fB] = var4;
						this.eU[this.fB] = var5;
						++this.fB;
					}
				}

				Npc var14;
				Player var15;
				if (var6 == 1) {
					Npc var19 = this.aW[var7];

					try {
						if (var19.npcDefinition.size == 1
								&& (var19.X & 127) == 64
								&& (var19.Y & 127) == 64) {
							for (var9 = 0; var9 < this.aX; ++var9) {
								if ((var14 = this.aW[this.aY[var9]]) != null
										&& var14 != var19
										&& var14.npcDefinition.size == 1
										&& var14.X == var19.X
										&& var14.Y == var19.Y) {
									this.a(var14.npcDefinition, this.aY[var9],
											var5, var4);
								}
							}

							for (var9 = 0; var9 < this.bM; ++var9) {
								if ((var15 = this.bL[this.bN[var9]]) != null
										&& var15.X == var19.X
										&& var15.Y == var19.Y) {
									this.a(var4, this.bN[var9], var15, var5);
								}
							}
						}

						this.a(var19.npcDefinition, var7, var5, var4);
					} catch (Exception var13) {
						;
					}
				}

				if (var6 == 0) {
					Player var18 = this.bL[var7];

					try {
						if ((var18.X & 127) == 64 && (var18.Y & 127) == 64) {
							for (var9 = 0; var9 < this.aX; ++var9) {
								if ((var14 = this.aW[this.aY[var9]]) != null
										&& var14.npcDefinition.size == 1
										&& var14.X == var18.X
										&& var14.Y == var18.Y) {
									this.a(var14.npcDefinition, this.aY[var9],
											var5, var4);
								}
							}

							for (var9 = 0; var9 < this.bM; ++var9) {
								if ((var15 = this.bL[this.bN[var9]]) != null
										&& var15 != var18 && var15.X == var18.X
										&& var15.Y == var18.Y) {
									this.a(var4, this.bN[var9], var15, var5);
								}
							}
						}

						this.a(var4, var7, var18, var5);
					} catch (Exception var12) {
						;
					}
				}

				LinkedList var20;
				if (var6 == 3 && (var20 = this.aR[this.cc][var4][var5]) != null) {
					for (Item var21 = (Item) var20.getFront(); var21 != null; var21 = (Item) var20
							.getNext()) {
						ItemDefinition var16 = ItemDefinition
								.fromID(var21.itemId);
						if (this.hE == 1) {
							this.gw[this.fB] = "Use " + this.hI + " with @lre@"
									+ var16.itemName;
							this.eV[this.fB] = 511;
							this.eW[this.fB] = var21.itemId;
							this.eT[this.fB] = var4;
							this.eU[this.fB] = var5;
							++this.fB;
						} else if (this.fD == 1) {
							if ((this.fF & 1) == 1) {
								this.gw[this.fB] = this.fG + " @lre@"
										+ var16.itemName;
								this.eV[this.fB] = 94;
								this.eW[this.fB] = var21.itemId;
								this.eT[this.fB] = var4;
								this.eU[this.fB] = var5;
								++this.fB;
							}
						} else {
							for (var6 = 4; var6 >= 0; --var6) {
								if (var16.groundActions != null
										&& var16.groundActions[var6] != null) {
									this.gw[this.fB] = var16.groundActions[var6]
											+ " @lre@" + var16.itemName;
									if (var6 == 0) {
										this.eV[this.fB] = 652;
									}

									if (var6 == 1) {
										this.eV[this.fB] = 567;
									}

									if (var6 == 2) {
										this.eV[this.fB] = 234;
									}

									if (var6 == 3) {
										this.eV[this.fB] = 244;
									}

									if (var6 == 4) {
										this.eV[this.fB] = 213;
									}

									this.eW[this.fB] = var21.itemId;
								} else {
									if (var6 != 2) {
										continue;
									}

									this.gw[this.fB] = "Take @lre@"
											+ var16.itemName;
									this.eV[this.fB] = 234;
									this.eW[this.fB] = var21.itemId;
									if (var21.itemId == 1971) {
										this.gw[this.fB] = "Remove @lre@"
												+ var16.itemName;
									}
								}

								this.eT[this.fB] = var4;
								this.eU[this.fB] = var5;
								++this.fB;
							}

							this.gw[this.fB] = this.bs < 2 ? "Examine @lre@"
									+ var16.itemName : "Examine @lre@"
									+ var16.itemName + " @gre@(@whi@"
									+ var21.itemId + "@gre@)";
							this.eV[this.fB] = 1448;
							this.eW[this.fB] = var21.itemId;
							this.eT[this.fB] = var4;
							this.eU[this.fB] = var5;
							++this.fB;
						}
					}
				}
			}
		}

	}

	public final void d() {
		SignLink.e = false;

		try {
			if (this.fZ != null) {
				this.fZ.a();
			}
		} catch (Exception var1) {
			;
		}

		this.fZ = null;
		this.stopMusic();
		this.L();
		this.e(0, 0);
		if (this.bC != null) {
			this.bC.a = false;
		}

		if (this.aq != null) {
			this.aq.clear();
			this.av = 0;
		}

		this.bC = null;
		this.resourceProvider.c();
		this.resourceProvider = null;
		this.aV = null;
		this.gs = null;
		this.bf = null;
		this.eE = null;
		this.gR = null;
		this.gj = null;
		this.ha = null;
		this.gS = null;
		this.gT = null;
		this.gE = null;
		this.hj = null;
		this.scene = null;
		this.gQ = null;
		this.bV = null;
		this.aP = null;
		this.hC = null;
		this.hD = null;
		this.bW = null;
		this.fU = null;
		this.aL = null;
		this.aM = null;
		this.fV = null;
		this.fW = null;
		this.fX = null;
		this.fw = null;
		this.aI = null;
		this.aJ = null;
		this.aK = null;
		this.gv = null;
		this.cx = null;
		this.cy = null;
		this.compassSprite = null;
		this.hitsplats = null;
		this.headiconsPrayer = null;
		this.headiconsPk = null;
		this.fa = null;
		this.fL = null;
		this.ev = null;
		this.ew = null;
		this.ex = null;
		this.ey = null;
		this.ez = null;
		this.ej = null;
		this.dN = null;
		this.ci = null;
		this.bL = null;
		this.bN = null;
		this.bP = null;
		this.bQ = null;
		this.ba = null;
		this.aW = null;
		this.aY = null;
		this.aR = null;
		this.gf = null;
		this.projectiles = null;
		this.eg = null;
		this.eT = null;
		this.eU = null;
		this.eV = null;
		this.eW = null;
		this.gw = null;
		this.m = null;
		this.et = null;
		this.eu = null;
		this.fH = null;
		this.hn = null;
		this.eD = null;
		this.cG = null;
		this.aQ = null;
		this.cf = null;
		this.cH = null;
		this.cI = null;
		this.fm = null;
		this.fn = null;
		this.fj = null;
		this.fk = null;
		this.loginScreen = null;
		this.fo = null;
		this.fp = null;
		this.fq = null;
		this.fr = null;
		this.S();
		ObjectDefinition.dispose();
		ActorDefinition.reset();
		ItemDefinition.dispose();
		Floor.floors = null;
		IdentityKit.b = null;
		Widget.widgets = null;
		Animation.animations = null;
		SpotAnimation.cache = null;
		SpotAnimation.h = null;
		Varp.parameters = null;
		super.mainImageProducer = null;
		Player.modelCache = null;
		Rasterizer3D.a();
		SceneGraph.dispose();
		Model.reset();
		Frame.a();
		System.gc();
	}

	final Component getFrameComponent() {
		return (Component) (super.scapeFrame != null ? super.scapeFrame : this);
	}

	private void D() throws Throwable {
		int var1;
		while ((var1 = this.d(-796)) != -1) {
			if (j != -1 && j == this.ge) {
				if (var1 == 8 && this.bE.length() > 0) {
					this.bE = this.bE.substring(0, this.bE.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 126 || var1 >= 65 && var1 <= 90
						|| var1 >= 48 && var1 <= 57 || var1 == 32)
						&& this.bE.length() < 12) {
					this.bE = this.bE + (char) var1;
				}
			} else {
				int var12;
				if (this.hi) {
					if (var1 >= 32 && var1 <= 126 && this.gC.length() < 80) {
						this.gC = this.gC + (char) var1;
						D = true;
					}

					if (var1 == 8 && this.gC.length() > 0) {
						this.gC = this.gC.substring(0, this.gC.length() - 1);
						D = true;
					}

					if (var1 == 13 || var1 == 10) {
						this.hi = false;
						D = true;
						long var2;
						if (this.em == 1) {
							var2 = StringUtils.a(this.gC);
							this.b(var2);
						}

						if (this.em == 2 && this.bS > 0) {
							var2 = StringUtils.a(this.gC);
							this.a(var2);
						}

						if (this.em == 3 && this.gC.length() > 0) {
							this.gs.a(126);
							this.gs.writeByte(0);
							var12 = this.gs.position;
							this.gs.writeLong(this.cE);
							ChatMessageCodec.a(this.gC, this.gs);
							this.gs.h(this.gs.position - var12);
							this.gC = ChatMessageCodec.a(this.gC);
							this.a(this.gC, 6,
									StringUtils.formatName(StringUtils
											.longToName(this.cE)));
							if (this.i == 2) {
								this.i = 1;
								this.gs.a(95);
								this.gs.writeByte(this.G);
								this.gs.writeByte(this.i);
								this.gs.writeByte(this.F);
							}
						}

						if (this.em == 4 && this.aN < 100) {
							var2 = StringUtils.a(this.gC);
							this.c(var2);
						}

						if (this.em == 5 && this.aN > 0) {
							var2 = StringUtils.a(this.gC);
							this.d(var2);
						}

						if (this.em == 6) {
							var2 = StringUtils.a(this.gC);
							long var5 = var2;
							Client var11 = this;
							if (var2 != 0L) {
								try {
									var11.gs.a(60);
									var11.gs.writeLong(var5);
								} catch (RuntimeException var8) {
									SignLink.reportError("47229, 3, " + var2
											+ ", " + var8.toString());
									throw new RuntimeException();
								}
							}
						}
					}
				} else if (this.gJ == 1) {
					if (var1 >= 48 && var1 <= 57 && this.dr.length() < 10) {
						this.dr = this.dr + (char) var1;
						D = true;
					}

					if (!this.dr.toLowerCase().contains("k")
							&& !this.dr.toLowerCase().contains("m")
							&& !this.dr.toLowerCase().contains("b")
							&& (var1 == 107 || var1 == 109) || var1 == 98) {
						this.dr = this.dr + (char) var1;
						D = true;
					}

					if (var1 == 8 && this.dr.length() > 0) {
						this.dr = this.dr.substring(0, this.dr.length() - 1);
						D = true;
					}

					if (var1 == 13 || var1 == 10) {
						if (this.dr.length() > 0) {
							if (this.dr.toLowerCase().contains("k")) {
								this.dr = this.dr.replaceAll("k", "000");
							} else if (this.dr.toLowerCase().contains("m")) {
								this.dr = this.dr.replaceAll("m", "000000");
							} else if (this.dr.toLowerCase().contains("b")) {
								this.dr = this.dr.replaceAll("b", "000000000");
							}

							try {
								var12 = Integer.parseInt(this.dr);
							} catch (NumberFormatException var9) {
								var12 = Integer.MAX_VALUE;
							}

							this.gs.a(208);
							this.gs.writeInt(var12);
						}

						this.gJ = 0;
						D = true;
					}
				} else if (this.gJ == 2) {
					if (var1 >= 32 && var1 <= 126 && this.dr.length() < 12) {
						this.dr = this.dr + (char) var1;
						D = true;
					}

					if (var1 == 8 && this.dr.length() > 0) {
						this.dr = this.dr.substring(0, this.dr.length() - 1);
						D = true;
					}

					if (var1 == 13 || var1 == 10) {
						if (this.dr.length() > 0) {
							this.gs.a(60);
							this.gs.writeLong(StringUtils.a(this.dr));
						}

						this.gJ = 0;
						D = true;
					}
				} else if (this.gJ != 3 && this.gJ != 4) {
					if (this.hA == -1) {
						if (var1 >= 32 && var1 <= 126 && this.bI.length() < 80) {
							this.bI = this.bI + (char) var1;
							D = true;
						}

						if (var1 == 8 && this.bI.length() > 0) {
							this.bI = this.bI
									.substring(0, this.bI.length() - 1);
							D = true;
						}

						if (var1 == 9) {
							this.k();
						}

						if ((var1 == 13 || var1 == 10) && this.bI.length() > 0) {
							if (this.bI.equalsIgnoreCase("::toggleroofs")) {
								this.showRoofs = !this.showRoofs;
								VScapeSettings.write();
							}

							if (this.bI.equalsIgnoreCase("::xpdrop")) {
								this.xpDrops = !this.xpDrops;
								if (!this.xpDrops && this.aq != null) {
									this.aq.clear();
								}

								VScapeSettings.write();
							}

							if (this.bI.startsWith("::mus")
									&& this.bI.contains(" ")) {
								
								this.requestedSong = Integer.parseInt((this.bI.replace("::mus","").replaceAll(" ", "")));//this.cJ;
								this.gM = true;
								this.resourceProvider.provide(2, this.requestedSong);
							}

							if (this.bs >= 2) {
								if (this.bI.equals("::itemsearch")) {
									this.gJ = 3;
								}

								if (this.bI.equals("::npcsearch")) {
									this.gJ = 4;
								}

								if (this.bI.equalsIgnoreCase("::dumpclip")) {
									this.resourceProvider.a();
								}

								if (this.bI.equalsIgnoreCase("::regular")) {
									this.e(0);
								}

								if (this.bI.equalsIgnoreCase("::resize")) {
									this.e(1);
								}

								if (this.bI.equalsIgnoreCase("::fullscreen")) {
									this.e(2);
								}

								if (this.bI.equalsIgnoreCase("::fps")) {
									fQ = !fQ;
								}

								if (this.bI.equalsIgnoreCase("::data")) {
									cL = !cL;
								}
							}

							if (this.bI.startsWith("/")) {
								this.bI = "::" + this.bI;
							}

							if (this.bI.startsWith("::")) {
								this.gs.a(103);
								this.gs.writeByte(this.bI.length() - 1);
								this.gs.a(this.bI.substring(2));
							} else {
								String var4 = this.bI.toLowerCase();
								byte var7 = 0;
								if (var4.startsWith("yellow:")) {
									var7 = 0;
									this.bI = this.bI.substring(7);
								} else if (var4.startsWith("red:")) {
									var7 = 1;
									this.bI = this.bI.substring(4);
								} else if (var4.startsWith("green:")) {
									var7 = 2;
									this.bI = this.bI.substring(6);
								} else if (var4.startsWith("cyan:")) {
									var7 = 3;
									this.bI = this.bI.substring(5);
								} else if (var4.startsWith("purple:")) {
									var7 = 4;
									this.bI = this.bI.substring(7);
								} else if (var4.startsWith("white:")) {
									var7 = 5;
									this.bI = this.bI.substring(6);
								} else if (var4.startsWith("flash1:")) {
									var7 = 6;
									this.bI = this.bI.substring(7);
								} else if (var4.startsWith("flash2:")) {
									var7 = 7;
									this.bI = this.bI.substring(7);
								} else if (var4.startsWith("flash3:")) {
									var7 = 8;
									this.bI = this.bI.substring(7);
								} else if (var4.startsWith("glow1:")) {
									var7 = 9;
									this.bI = this.bI.substring(6);
								} else if (var4.startsWith("glow2:")) {
									var7 = 10;
									this.bI = this.bI.substring(6);
								} else if (var4.startsWith("glow3:")) {
									var7 = 11;
									this.bI = this.bI.substring(6);
								} else if (var4.startsWith(">")) {
									var7 = 2;
								}

								var4 = this.bI.toLowerCase();
								byte var10 = 0;
								if (var4.startsWith("wave:")) {
									var10 = 1;
									this.bI = this.bI.substring(5);
								} else if (var4.startsWith("wave2:")) {
									var10 = 2;
									this.bI = this.bI.substring(6);
								} else if (var4.startsWith("shake:")) {
									var10 = 3;
									this.bI = this.bI.substring(6);
								} else if (var4.startsWith("scroll:")) {
									var10 = 4;
									this.bI = this.bI.substring(7);
								} else if (var4.startsWith("slide:")) {
									var10 = 5;
									this.bI = this.bI.substring(6);
								}

								this.gs.a(4);
								this.gs.writeByte(0);
								var12 = this.gs.position;
								this.gs.k(var10);
								this.gs.k(var7);
								this.aV.position = 0;
								ChatMessageCodec.a(this.bI, this.aV);
								this.gs.a(0, this.aV.buf, this.aV.position);
								this.gs.h(this.gs.position - var12);
								this.bI = ChatMessageCodec.a(this.bI);
								localPlayer.i = this.bI;
								localPlayer.n = var7;
								localPlayer.F = var10;
								localPlayer.J = 150;
								if (localPlayer.aJ) {
									this.a(localPlayer.i, 2, "@irn@"
											+ localPlayer.name, this.bs);
								} else {
									this.a(localPlayer.i, 2, localPlayer.name,
											this.bs);
								}

								if (this.G == 2) {
									this.G = 3;
									this.gs.a(95);
									this.gs.writeByte(this.G);
									this.gs.writeByte(this.i);
									this.gs.writeByte(this.F);
								}
							}

							this.bI = "";
							D = true;
						}
					}
				} else {
					if (var1 == 13 || var1 == 10) {
						this.gJ = 0;
						D = true;
					}

					if (var1 >= 32 && var1 <= 126 && this.dr.length() < 40) {
						this.dr = this.dr + (char) var1;
						D = true;
					}

					if (var1 == 8 && this.dr.length() > 0) {
						this.dr = this.dr.substring(0, this.dr.length() - 1);
						D = true;
					}
				}
			}
		}

	}

	private void o(int var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < 500; ++var3) {
			if (this.ct[var3] != null && this.aG == 9) {
				int var4 = this.cr[var3];
				String var5 = this.cs[var3];
				int var6;
				if ((var6 = 70 - var2 * 14 + 42 + p + 4 + 5) < -23) {
					break;
				}

				if (var5 != null && var5.startsWith("@irn@")) {
					var5 = var5.substring(5);
				}

				if (var4 == 9 && (this.g == 0 || this.g == 1)) {
					if (var1 > var6 - 14 && var1 <= var6
							&& !var5.equals(localPlayer.name)) {
						if (this.bs > 0) {
							this.gw[this.fB] = "Report abuse @whi@" + var5;
							this.eV[this.fB] = 606;
							++this.fB;
						}

						this.gw[this.fB] = "Add ignore @whi@" + var5;
						this.eV[this.fB] = 42;
						++this.fB;
						this.gw[this.fB] = "Add friend @whi@" + var5;
						this.eV[this.fB] = 337;
						++this.fB;
					}

					++var2;
				}
			}
		}

	}

	private void p(int var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < 500; ++var3) {
			if (this.ct[var3] != null && this.aG == 2) {
				int var4 = this.cr[var3];
				String var5 = this.cs[var3];
				int var6;
				if ((var6 = 70 - var2 * 14 + 42 + p + 4 + 5) < -23) {
					break;
				}

				if (var5 != null && var5.startsWith("@irn@")) {
					var5 = var5.substring(5);
				}

				if ((var4 == 5 || var4 == 6)
						&& (this.gu == 0 || this.aG == 2)
						&& (var4 == 6 || this.i == 0 || this.i == 1
								&& this.c(var5))) {
					++var2;
				}

				if ((var4 == 3 || var4 == 7)
						&& (this.gu == 0 || this.aG == 2)
						&& (var4 == 7 || this.i == 0 || this.i == 1
								&& this.c(var5))) {
					if (var1 > var6 - 14 && var1 <= var6) {
						if (this.bs > 0) {
							this.gw[this.fB] = "Report abuse @whi@" + var5;
							this.eV[this.fB] = 606;
							++this.fB;
						}

						this.gw[this.fB] = "Add ignore @whi@" + var5;
						this.eV[this.fB] = 42;
						++this.fB;
						this.gw[this.fB] = "Add friend @whi@" + var5;
						this.eV[this.fB] = 337;
						++this.fB;
					}

					++var2;
				}
			}
		}

	}

	private void q(int var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < 500; ++var3) {
			if (this.ct[var3] != null && (this.aG == 3 || this.aG == 4)) {
				int var4 = this.cr[var3];
				String var5 = this.cs[var3];
				int var6;
				if ((var6 = 70 - var2 * 14 + 42 + p + 4 + 5) < -23) {
					break;
				}

				if (var5 != null && var5.startsWith("@irn@")) {
					var5 = var5.substring(5);
				}

				if (this.aG == 3 && var4 == 4
						&& (this.F == 0 || this.F == 1 && this.c(var5))) {
					if (var1 > var6 - 14 && var1 <= var6) {
						this.gw[this.fB] = "Accept trade @whi@" + var5;
						this.eV[this.fB] = 484;
						++this.fB;
					}

					++var2;
				}

				if (this.aG == 4 && var4 == 8
						&& (this.F == 0 || this.F == 1 && this.c(var5))) {
					if (var1 > var6 - 14 && var1 <= var6) {
						this.gw[this.fB] = "Accept challenge @whi@" + var5;
						this.eV[this.fB] = 6;
						++this.fB;
					}

					++var2;
				}

				if (var4 == 12) {
					if (var1 > var6 - 14 && var1 <= var6) {
						this.gw[this.fB] = "Visit @red@" + var5;
						this.eV[this.fB] = 927;
						++this.fB;
					}

					++var2;
				}
			}
		}

	}

	private void r(int var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < 500; ++var3) {
			if (this.ct[var3] != null) {
				int var4 = this.cr[var3];
				int var5;
				if ((var5 = 70 - var2 * 14 + 42 + p + 4 + 5) < -23) {
					break;
				}

				String var6 = this.cs[var3];
				if (this.aG == 1) {
					var2 = var1;
					Client var8 = this;
					var3 = 0;

					for (var4 = 0; var4 < 500; ++var4) {
						if (var8.ct[var4] != null && var8.aG == 1) {
							var5 = var8.cr[var4];
							var6 = var8.cs[var4];
							int var7;
							if ((var7 = 70 - var3 * 14 + 42 + p + 4 + 5) < -23) {
								break;
							}

							if (var6 != null && var6.startsWith("@irn@")) {
								var6 = var6.substring(5);
							}

							if ((var5 == 1 || var5 == 2)
									&& (var5 == 1 || var8.G == 0 || var8.G == 1
											&& var8.c(var6))) {
								if (var2 > var7 - 14 && var2 <= var7
										&& !var6.equals(localPlayer.name)) {
									if (var8.bs > 0) {
										var8.gw[var8.fB] = "Report abuse @whi@"
												+ var6;
										var8.eV[var8.fB] = 606;
										++var8.fB;
									}

									var8.gw[var8.fB] = "Add ignore @whi@"
											+ var6;
									var8.eV[var8.fB] = 42;
									++var8.fB;
									var8.gw[var8.fB] = "Add friend @whi@"
											+ var6;
									var8.eV[var8.fB] = 337;
									++var8.fB;
								}

								++var3;
							}
						}
					}

					return;
				}

				if (this.aG == 2) {
					this.p(var1);
					return;
				}

				if (this.aG == 3 || this.aG == 4) {
					this.q(var1);
					return;
				}

				if (this.aG == 5) {
					break;
				}

				if (this.aG == 9) {
					this.o(var1);
					return;
				}

				if (this.aG == 16) {
					if (this.f != 0 && this.f != 1) {
						break;
					}

					return;
				}

				if (var6 != null && var6.startsWith("@irn@")) {
					var6 = var6.substring(5);
				}

				if (var4 == 0 && (this.h == 0 || this.h == 1 && this.aF[var3])) {
					++var2;
				}

				if ((var4 == 1 || var4 == 2)
						&& (var4 == 1 || this.G == 0 || this.G == 1
								&& this.c(var6))) {
					if (var1 > var5 - 14 && var1 <= var5
							&& !var6.equals(localPlayer.name)) {
						if (this.bs > 0) {
							this.gw[this.fB] = "Report abuse @whi@" + var6;
							this.eV[this.fB] = 606;
							++this.fB;
						}

						this.gw[this.fB] = "Add ignore @whi@" + var6;
						this.eV[this.fB] = 42;
						++this.fB;
						this.gw[this.fB] = "Add friend @whi@" + var6;
						this.eV[this.fB] = 337;
						++this.fB;
					}

					++var2;
				}

				if ((var4 == 3 || var4 == 7)
						&& this.gu == 0
						&& (var4 == 7 || this.i == 0 || this.i == 1
								&& this.c(var6))) {
					if (var1 > var5 - 14 && var1 <= var5) {
						if (this.bs > 0) {
							this.gw[this.fB] = "Report abuse @whi@" + var6;
							this.eV[this.fB] = 606;
							++this.fB;
						}

						this.gw[this.fB] = "Add ignore @whi@" + var6;
						this.eV[this.fB] = 42;
						++this.fB;
						this.gw[this.fB] = "Add friend @whi@" + var6;
						this.eV[this.fB] = 337;
						++this.fB;
					}

					++var2;
				}

				if (var4 == 4 && (this.F == 0 || this.F == 1 && this.c(var6))) {
					if (var1 > var5 - 14 && var1 <= var5) {
						this.gw[this.fB] = "Accept trade @whi@" + var6;
						this.eV[this.fB] = 484;
						++this.fB;
					}

					++var2;
				}

				if ((var4 == 5 || var4 == 6) && this.gu == 0 && this.i < 2) {
					++var2;
				}

				if (var4 == 8 && (this.F == 0 || this.F == 1 && this.c(var6))) {
					if (var1 > var5 - 14 && var1 <= var5) {
						this.gw[this.fB] = "Accept challenge @whi@" + var6;
						this.eV[this.fB] = 6;
						++this.fB;
					}

					++var2;
				}

				if (var4 == 9 && this.g == 0) {
					if (var1 > var5 - 14 && var1 <= var5
							&& !var6.equals(localPlayer.name)) {
						if (this.bs > 0) {
							this.gw[this.fB] = "Report abuse @whi@" + var6;
							this.eV[this.fB] = 606;
							++this.fB;
						}

						this.gw[this.fB] = "Add ignore @whi@" + var6;
						this.eV[this.fB] = 42;
						++this.fB;
						this.gw[this.fB] = "Add friend @whi@" + var6;
						this.eV[this.fB] = 337;
						++this.fB;
					}

					++var2;
				}

				if (var4 == 16 && this.f == 0) {
					++var2;
				}

				if (var4 == 12 && (this.h == 0 || this.h == 1 && this.aF[var3])) {
					if (var1 > var5 - 14 && var1 <= var5) {
						this.gw[this.fB] = "Go-to @lre@" + var6;
						this.eV[this.fB] = 927;
						++this.fB;
					}

					++var2;
				}
			}
		}

	}

	private static int s(int var0) {
		int var1 = 0;
		int var2 = 0;

		for (int var3 = 1; var3 <= var0; ++var3) {
			var1 = (int) ((double) var1 + Math.floor((double) var3 + 300.0D
					* Math.pow(2.0D, (double) var3 / 7.0D)));
			if (var3 >= var0) {
				return var2;
			}

			var2 = (int) Math.floor((double) (var1 / 4));
		}

		return 0;
	}

	private void a(String var1, int var2, String var3) {
		this.a(var1, var2, var3, 0, false);
	}

	private void a(String var1, int var2, String var3, int var4) {
		this.a(var1, var2, var3, var4, false);
	}

	private void a(String var1, int var2, String var3, boolean var4) {
		this.a(var1, 0, var3, 0, var4);
	}

	private void a(String var1, int var2, String var3, int var4, boolean var5) {
		if (var2 == 0 && this.dU != -1) {
			this.be = var1;
			super.T = 0;
		}

		if (this.hA == -1) {
			D = true;
		}

		for (int var6 = 499; var6 > 0; --var6) {
			this.cr[var6] = this.cr[var6 - 1];
			this.cs[var6] = this.cs[var6 - 1];
			this.ct[var6] = this.ct[var6 - 1];
			this.aE[var6] = this.aE[var6 - 1];
			this.aF[var6] = this.aF[var6 - 1];
			this.cu[var6] = this.cu[var6 - 1];
		}

		this.cr[0] = var2;
		this.cs[0] = var3;
		this.ct[0] = var1;
		this.aE[0] = var4;
		this.aF[0] = var5;
		this.cu[0] = this.aC;
	}

	public static void b(int var0) {
		C = var0;
		fh = true;
	}

	private void E() {
		if (this.fX == null) {
			this.S();
			super.mainImageProducer = null;
			this.fj = null;
			this.fk = null;
			this.loginScreen = null;
			this.fm = null;
			this.fn = null;
			this.fo = null;
			this.fp = null;
			this.fq = null;
			this.fr = null;
			this.fX = new ProducingGraphicsBuffer(516, 165,
					this.getFrameComponent());
			this.fV = new ProducingGraphicsBuffer(249, 168,
					this.getFrameComponent());
			Rasterizer2D.reset();
			Animation.spriteFromGroup("map", 0).drawSprite(0, 0);
			this.fU = new ProducingGraphicsBuffer(250, 335,
					this.getFrameComponent());
			this.fW = new ProducingGraphicsBuffer(512, 334,
					this.getFrameComponent());
			Rasterizer2D.reset();
			new ProducingGraphicsBuffer(496, 50, this.getFrameComponent());
			new ProducingGraphicsBuffer(269, 37, this.getFrameComponent());
			this.fw = new ProducingGraphicsBuffer(249, 45,
					this.getFrameComponent());
			this.hh = true;
		}
	}

	private void a(Sprite var1, int var2, int var3) {
		int var4;
		if ((var4 = var3 * var3 + var2 * var2) > 4225 && var4 < 90000) {
			int var18 = this.camYaw + this.gB & 2047;
			var4 = Model.F[var18];
			var18 = Model.G[var18];
			var4 = (var4 << 8) / (this.ga + 256);
			var18 = (var18 << 8) / (this.ga + 256);
			int var5 = var2 * var4 + var3 * var18 >> 16;
			var18 = var2 * var18 - var3 * var4 >> 16;
			double var6;
			var18 = (int) (Math.sin(var6 = Math.atan2((double) var5,
					(double) var18)) * 63.0D);
			var2 = (int) (Math.cos(var6) * 57.0D);
			int var10001 = (resizeMode == 0 ? 86 : 89) - var2 - 20;
			var3 = (resizeMode == 0 ? 131 : clientWidth + 131 - 238) + var18 - 10 - 5;
			double var8 = var6;
			var2 = var10001;
			var1 = this.dq;

			try {
				var4 = (int) (Math.sin(var8) * 65536.0D);
				var5 = (int) (Math.cos(var8) * 65536.0D);
				var4 = var4 << 8 >> 8;
				var5 = var5 << 8 >> 8;
				int var10 = 983040 + var4 * -10 + var5 * -10;
				int var11 = 983040 + (var5 * -10 - var4 * -10);
				int var12 = var3 + var2 * Rasterizer2D.width;

				for (var2 = 0; var2 < 20; ++var2) {
					int var13 = var12;
					int var14 = var10;
					int var15 = var11;

					for (var3 = -20; var3 < 0; ++var3) {
						int var16;
						if ((var16 = var1.pixels[(var14 >> 16) + (var15 >> 16)
								* var1.width]) != 0) {
							Rasterizer2D.pixels[var13++] = var16;
						} else {
							++var13;
						}

						var14 += var5;
						var15 -= var4;
					}

					var10 += var4;
					var11 += var5;
					var12 += Rasterizer2D.width;
				}
			} catch (Exception var17) {
				return;
			}
		} else {
			this.b(var1, var3, var2);
		}

	}

	private void F() {
		if (this.eH == 0) {
			this.gw[0] = "Cancel";
			this.eV[0] = 1107;
			this.fB = 1;
			if (this.hM != -1) {
				this.bH = 0;
				this.hP = 0;
				this.a(8, Widget.widgets[this.hM], super.mouseX, 8,
						super.mouseY, 0);
				if (this.bH != this.dK) {
					this.dK = this.bH;
				}

				if (this.hP != this.hO) {
					this.hO = this.hP;
				}

			} else {
				Client var1 = this;
				int var2;
				int var3;
				int var4;
				if (this.gu != 0) {
					var2 = 0;
					if (this.fi != 0) {
						var2 = 1;
					}

					for (var3 = 0; var3 < 100; ++var3) {
						if (var1.ct[var3] != null) {
							var4 = var1.cr[var3];
							String var5;
							if ((var5 = var1.cs[var3]) != null
									&& var5.startsWith("@irn@")) {
								var5 = var5.substring(5);
							}

							if ((var4 == 3 || var4 == 7)
									&& (var4 == 7 || var1.i == 0 || var1.i == 1
											&& var1.c(var5))) {
								int var6 = 329 - var2 * 13;
								if (var1.mouseX > 4
										&& var1.mouseY - 4 > var6 - 10
										&& var1.mouseY - 4 <= var6 + 3) {
									if ((var6 = var1.p12_full.getColoredTextWidth("From:  " + var5
											+ var1.ct[var3]) + 25) > 450) {
										var6 = 450;
									}

									if (var1.mouseX < var6 + 4) {
										if (var1.bs > 0) {
											var1.gw[var1.fB] = "Report abuse @whi@"
													+ var5;
											var1.eV[var1.fB] = 2606;
											++var1.fB;
										}

										var1.gw[var1.fB] = "Add ignore @whi@"
												+ var5;
										var1.eV[var1.fB] = 2042;
										++var1.fB;
										var1.gw[var1.fB] = "Add friend @whi@"
												+ var5;
										var1.eV[var1.fB] = 2337;
										++var1.fB;
									}
								}

								++var2;
								if (var2 >= 5) {
									break;
								}
							}

							if ((var4 == 5 || var4 == 6) && var1.i < 2) {
								++var2;
								if (var2 >= 5) {
									break;
								}
							}
						}
					}
				}

				this.bH = 0;
				this.hP = 0;
				int var10001;
				if (resizeMode == 0) {
					if (super.mouseX > 4 && super.mouseY > 4
							&& super.mouseX < 516 && super.mouseY < 338) {
						if (j != -1) {
							this.a(4, Widget.widgets[j], super.mouseX, 4,
									super.mouseY, 0);
						} else {
							this.C();
						}
					}
				} else if (resizeMode != 0) {
					boolean var10000;
					if (this.mouseWithinRegion(clientWidth
							- (clientWidth <= 1000 ? 240 : 480), clientHeight
							- (clientWidth <= 1000 ? 90 : 37), clientWidth,
							clientHeight)) {
						var10000 = false;
					} else if (eQ
							&& (super.mouseX > 0 && super.mouseX < 519
									&& super.mouseY > clientHeight - 165
									&& super.mouseY < clientHeight || super.mouseX > clientWidth - 220
									&& super.mouseX < clientWidth
									&& super.mouseY > 0 && super.mouseY < 165)) {
						var10000 = false;
					} else {
						var10001 = clientWidth - 216;
						boolean var11 = true;
						boolean var10 = false;
						var4 = clientWidth;
						var3 = var10001;
						if (super.mouseX >= var3 && super.mouseX <= var4
								&& super.mouseY >= 0 && super.mouseY <= 172) {
							var10000 = false;
						} else {
							label610: {
								if (this.eP) {
									if (clientWidth > 1000) {
										if (super.mouseX >= clientWidth - 420
												&& super.mouseX <= clientWidth
												&& super.mouseY >= clientHeight - 37
												&& super.mouseY <= clientHeight
												|| super.mouseX > clientWidth - 225
												&& super.mouseX < clientWidth
												&& super.mouseY > clientHeight - 37 - 274
												&& super.mouseY < clientHeight) {
											var10000 = false;
											break label610;
										}
									} else if (super.mouseX >= clientWidth - 210
											&& super.mouseX <= clientWidth
											&& super.mouseY >= clientHeight - 74
											&& super.mouseY <= clientHeight
											|| super.mouseX > clientWidth - 225
											&& super.mouseX < clientWidth
											&& super.mouseY > clientHeight - 74 - 274
											&& super.mouseY < clientHeight) {
										var10000 = false;
										break label610;
									}
								}

								var10000 = true;
							}
						}
					}

					if (var10000) {
						if (super.mouseX > clientWidth / 2 - 356
								&& super.mouseY > clientHeight / 2 - 230
								&& super.mouseX < clientWidth / 2 + 356
								&& super.mouseY < clientHeight / 2 + 230
								&& j != -1) {
							this.a(clientWidth / 2 - 356, Widget.widgets[j],
									super.mouseX, clientHeight / 2 - 230,
									super.mouseY, 0);
						} else {
							this.C();
						}
					}
				}

				if (this.bH != this.dK) {
					this.dK = this.bH;
				}

				if (this.hP != this.hO) {
					this.hO = this.hP;
				}

				this.bH = 0;
				this.hP = 0;
				int var7;
				if (resizeMode == 0) {
					if (super.mouseX > clientWidth - 218
							&& super.mouseY > clientHeight - 298
							&& super.mouseX < clientWidth - 25
							&& super.mouseY < clientHeight - 35) {
						if (this.gp != -1) {
							this.a(clientWidth - 218, Widget.widgets[this.gp],
									super.mouseX, clientHeight - 298,
									super.mouseY, 0);
						} else if (u[C] != -1) {
							this.a(clientWidth - 218, Widget.widgets[u[C]],
									super.mouseX, clientHeight - 298,
									super.mouseY, 0);
						}
					}
				} else if (resizeMode != 0) {
					var7 = clientWidth > 1000 ? 37 : 74;
					if (clientWidth > 1000 && super.mouseX > clientWidth - 197
							&& super.mouseY > clientHeight - var7 - 267
							&& super.mouseX < clientWidth - 7
							&& super.mouseY < clientHeight - var7 - 7
							&& this.eP) {
						if (this.gp != -1) {
							this.a(clientWidth - 197, Widget.widgets[this.gp],
									super.mouseX, clientHeight - 304,
									super.mouseY, 0);
						} else if (u[C] != -1) {
							this.a(clientWidth - 197, Widget.widgets[u[C]],
									super.mouseX, clientHeight - 304,
									super.mouseY, 0);
						}
					}

					if (clientWidth <= 1000 && super.mouseX > clientWidth - 211
							&& super.mouseY > clientHeight - var7 - 267
							&& super.mouseX < clientWidth - 7
							&& super.mouseY < clientHeight - var7 - 7
							&& this.eP) {
						if (this.gp != -1) {
							this.a(clientWidth - 211, Widget.widgets[this.gp],
									super.mouseX, clientHeight - var7 - 267,
									super.mouseY, 0);
						} else if (u[C] != -1) {
							this.a(clientWidth - 211, Widget.widgets[u[C]],
									super.mouseX, clientHeight - var7 - 267,
									super.mouseY, 0);
						}
					}
				}

				if (this.bH != this.dZ) {
					fh = true;
					this.dZ = this.bH;
				}

				if (this.hP != this.hN) {
					fh = true;
					this.hN = this.hP;
				}

				this.bH = 0;
				this.hP = 0;
				if (super.mouseX > 0
						&& super.mouseY > (resizeMode == 0 ? 338 : clientHeight - 165)
						&& super.mouseX < 490
						&& super.mouseY < (resizeMode == 0 ? 463 : clientHeight - 40)
						&& eQ) {
					if (this.hA != -1) {
						this.a(20, Widget.widgets[this.hA], super.mouseX,
								resizeMode == 0 ? 358 : clientHeight - 145,
								super.mouseY, 0);
					} else if (super.mouseY < (resizeMode == 0 ? 463 : clientHeight - 40)
							&& super.mouseX < 490) {
						this.r(super.mouseY
								- (resizeMode == 0 ? 338 : clientHeight - 165));
					}
				}

				if (this.hA != -1 && this.bH != this.dT) {
					D = true;
					this.dT = this.bH;
				}

				if (this.hA != -1 && this.hP != this.hQ) {
					D = true;
					this.hQ = this.hP;
				}

				if (super.mouseX > 0 && super.mouseY > clientHeight - 165
						&& super.mouseX < 519 && super.mouseY < clientHeight) {
					var2 = 0;
					if (resizeMode != 0) {
						var2 = clientHeight - 503;
					}

					if (super.mouseX >= 5 && super.mouseX <= 61
							&& super.mouseY >= var2 + 482
							&& super.mouseY <= var2 + 503) {
						this.gw[1] = "View All";
						this.eV[1] = 999;
						this.fB = 2;
					} else if (super.mouseX >= 71 && super.mouseX <= 127
							&& super.mouseY >= var2 + 482
							&& super.mouseY <= var2 + 503) {
						this.gw[1] = "Off Game";
						this.eV[1] = 1002;
						this.gw[2] = "Filtered Game";
						this.eV[2] = 1001;
						this.gw[3] = "On Game";
						this.eV[3] = 1000;
						this.gw[4] = "View Game";
						this.eV[4] = 998;
						this.fB = 5;
					} else if (super.mouseX >= 137 && super.mouseX <= 193
							&& super.mouseY >= var2 + 482
							&& super.mouseY <= var2 + 503) {
						this.gw[1] = "Hide public";
						this.eV[1] = 997;
						this.gw[2] = "Off public";
						this.eV[2] = 996;
						this.gw[3] = "Friends public";
						this.eV[3] = 995;
						this.gw[4] = "On public";
						this.eV[4] = 994;
						this.gw[5] = "View public";
						this.eV[5] = 993;
						this.fB = 6;
					} else if (super.mouseX >= 203 && super.mouseX <= 259
							&& super.mouseY >= var2 + 482
							&& super.mouseY <= var2 + 503) {
						this.gw[1] = "Off private";
						this.eV[1] = 992;
						this.gw[2] = "Friends private";
						this.eV[2] = 991;
						this.gw[3] = "On private";
						this.eV[3] = 990;
						this.gw[4] = "View private";
						this.eV[4] = 989;
						this.fB = 5;
					} else if (super.mouseX >= 269 && super.mouseX <= 325
							&& super.mouseY >= var2 + 482
							&& super.mouseY <= var2 + 503) {
						this.gw[1] = "Off clan";
						this.eV[1] = 983;
						this.gw[2] = "Hidden clan";
						this.eV[2] = 982;
						this.gw[3] = "On clan";
						this.eV[3] = 981;
						this.gw[4] = "View clan";
						this.eV[4] = 980;
						this.fB = 5;
					} else if (super.mouseX >= 335 && super.mouseX <= 391
							&& super.mouseY >= var2 + 482
							&& super.mouseY <= var2 + 503) {
						this.gw[1] = "Off trade";
						this.eV[1] = 987;
						this.gw[2] = "Friends trade";
						this.eV[2] = 986;
						this.gw[3] = "On trade";
						this.eV[3] = 985;
						this.gw[4] = "View trade";
						this.eV[4] = 984;
						this.fB = 5;
					} else if (super.mouseX >= 401 && super.mouseX <= 457
							&& super.mouseY >= var2 + 482
							&& super.mouseY <= var2 + 503) {
						this.gw[1] = "Off global";
						this.eV[1] = 1008;
						this.gw[2] = "Hidden global";
						this.eV[2] = 1007;
						this.gw[3] = "On global";
						this.eV[3] = 1006;
						this.gw[4] = "View global";
						this.eV[4] = 1005;
						this.fB = 5;
					}
				} else if (super.mouseX > clientWidth - 249
						&& super.mouseY < 168) {
					label550: {
						if (super.mouseX >= clientWidth - (resizeMode == 0 ? 225 : 215)
								&& super.mouseX <= clientWidth
										- (resizeMode == 0 ? 185 : 172)) {
							var10001 = resizeMode;
							if (super.mouseY > 0) {
								var10001 = resizeMode;
								if (super.mouseY < 38) {
									this.gw[1] = "Face north";
									this.eV[1] = 1010;
									this.fB = 2;
									break label550;
								}
							}
						}

						if (super.mouseX >= clientWidth - (resizeMode == 0 ? 55 : 225)
								&& super.mouseX <= clientWidth
										- (resizeMode == 0 ? 28 : 195)
								&& super.mouseY >= (resizeMode == 0 ? 85 : 115)
								&& super.mouseY <= (resizeMode == 0 ? 115 : 144)) {
							this.gw[1] = !this.ay ? "Turn Run on"
									: "Turn Run off";
							this.eV[1] = 1050;
							this.fB = 2;
						}
					}
				}

				boolean var8 = false;

				while (!var8) {
					var8 = true;

					for (var2 = 0; var2 < this.fB - 1; ++var2) {
						if (this.eV[var2] < 1000 && this.eV[var2 + 1] > 1000) {
							String var9 = this.gw[var2];
							this.gw[var2] = this.gw[var2 + 1];
							this.gw[var2 + 1] = var9;
							var7 = this.eV[var2];
							this.eV[var2] = this.eV[var2 + 1];
							this.eV[var2 + 1] = var7;
							var7 = this.eT[var2];
							this.eT[var2] = this.eT[var2 + 1];
							this.eT[var2 + 1] = var7;
							var7 = this.eU[var2];
							this.eU[var2] = this.eU[var2 + 1];
							this.eU[var2 + 1] = var7;
							var7 = this.eW[var2];
							this.eW[var2] = this.eW[var2 + 1];
							this.eW[var2 + 1] = var7;
							var8 = false;
						}
					}
				}

			}
		}
	}

	private void a(String var1, String var2, boolean var3) {
		try {
			if (!var3) {
				this.hr = "";
				this.hq = "Connecting to server...";
				this.loginScreenFrame();
			}

			this.fZ = new BufferedConnection(this, a('ꩊ'));
			int var6 = (int) (StringUtils.a(var1) >> 16 & 31L);
			this.gs.position = 0;
			this.gs.writeByte(14);
			this.gs.writeByte(var6);
			this.fZ.a(2, this.gs.buf);

			for (var6 = 0; var6 < 8; ++var6) {
				this.fZ.b();
			}

			int var7 = var6 = this.fZ.b();
			int var9;
			if (var6 == 0) {
				this.fZ.a(this.eE.buf, 8);
				this.eE.position = 0;
				this.gF = this.eE.m();
				int[] var14;
				(var14 = new int[4])[0] = (int) (Math.random() * 9.9999999E7D);
				var14[1] = (int) (Math.random() * 9.9999999E7D);
				var14[2] = (int) (this.gF >> 32);
				var14[3] = (int) this.gF;
				this.gs.position = 0;
				this.gs.writeByte(10);
				this.gs.writeInt(var14[0]);
				this.gs.writeInt(var14[1]);
				this.gs.writeInt(var14[2]);
				this.gs.writeInt(var14[3]);
				this.gs.writeInt(1092);
				this.gs.a(var1);
				this.gs.a(var2);
				this.gs.doRSA();
				this.bf.position = 0;
				if (var3) {
					this.bf.writeByte(18);
				} else {
					this.bf.writeByte(16);
				}

				this.bf.writeByte(this.gs.position + 36 + 1 + 1 + 2);
				this.bf.writeByte(255);
				this.bf.writeShort(326);
				this.bf.writeByte(0);
				String var8;
				if ((var8 = j()).equals("00-00-00-00-00-00-00-E0")
						|| var8.equals("00:00:00:00:00:00")) {
					var8 = System.getenv("USERNAME") + "@"
							+ System.getenv("COMPUTERNAME");
				}

				this.bf.a(var8);

				for (var9 = 0; var9 < 9; ++var9) {
					this.bf.writeInt(this.eS[var9]);
				}

				this.bf.writeBytes(this.gs.buf, this.gs.position, 0);
				this.gs.d = new IsaacCipher(var14);

				for (var9 = 0; var9 < 4; ++var9) {
					var14[var9] += 50;
				}

				this.dp = new IsaacCipher(var14);
				this.fZ.a(this.bf.position, this.bf.buf);
				var6 = this.fZ.b();
			}

			if (var6 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var10) {
					;
				}

				this.a(var1, var2, var3);
			} else if (var6 == 2) {
				this.bs = this.fZ.b();
				this.fZ.b();
				this.bC.b = 0;
				super.O = true;
				this.cF = true;
				this.loggedIn = true;
				this.gs.position = 0;
				this.eE.position = 0;
				this.dv = -1;
				this.bb = -1;
				this.bc = -1;
				this.bd = -1;
				this.du = 0;
				this.dw = 0;
				this.fi = 0;
				this.dy = 0;
				this.bm = 0;
				this.fB = 0;
				this.bG = false;
				super.P = 0;

				for (var6 = 0; var6 < 100; ++var6) {
					this.ct[var6] = null;
				}

				this.hE = 0;
				this.fD = 0;
				this.dH = 0;
				this.ek = 0;
				this.hB = (int) (Math.random() * 100.0D) - 50;
				this.fA = (int) (Math.random() * 110.0D) - 55;
				this.bR = (int) (Math.random() * 80.0D) - 40;
				this.gB = (int) (Math.random() * 120.0D) - 60;
				this.ga = (int) (Math.random() * 30.0D) - 20;
				this.camYaw = (int) (Math.random() * 20.0D) - 10 & 2047;
				this.dG = 0;
				this.de = -1;
				this.hl = 0;
				this.hm = 0;
				this.bM = 0;
				this.aX = 0;

				for (var6 = 0; var6 < 2048; ++var6) {
					this.bL[var6] = null;
					this.bQ[var6] = null;
				}

				for (var6 = 0; var6 < 16384; ++var6) {
					this.aW[var6] = null;
				}

				localPlayer = this.bL[2047] = new Player();
				this.projectiles.clear();
				this.eg.clear();

				for (var6 = 0; var6 < 4; ++var6) {
					for (int var15 = 0; var15 < 104; ++var15) {
						for (var9 = 0; var9 < 104; ++var9) {
							this.aR[var6][var15][var9] = null;
						}
					}
				}

				this.gf = new LinkedList();
				this.bU = 0;
				this.bS = 0;
				this.aN = 0;
				this.bT = 0;
				this.dU = -1;
				this.hA = -1;
				j = -1;
				this.gp = -1;
				this.dE = -1;
				this.fK = false;
				C = 3;
				this.gJ = 0;
				this.bG = false;
				this.hi = false;
				this.be = null;
				this.ef = 0;
				this.ee = -1;
				this.dY = true;
				this.t();

				for (var6 = 0; var6 < 5; ++var6) {
					this.di[var6] = 0;
				}

				for (var6 = 0; var6 < 5; ++var6) {
					this.fx[var6] = null;
					this.fy[var6] = false;
				}

				gb = 0;
				fC = 0;
				df = 0;
				hJ = 0;
				ce = 0;
				go = 0;
				fP = 0;
				gK = 0;
				this.E();
				this.e(VScapeSettings.c);
			} else if (var6 == 3) {
				this.hr = "";
				this.hq = "Invalid username or password.";
			} else if (var6 == 4) {
				this.hq = "Your account has been disabled.";
				this.hr = "Thank you, come again.";
			} else if (var6 == 5) {
				this.hq = "Your account is already logged in.";
				this.hr = "Try again in 60 seconds...";
			} else if (var6 == 6) {
				this.hq = "Vscape has been updated!";
				this.hr = "Download the new client.";
			} else if (var6 == 7) {
				this.hq = "This world is full.";
				this.hr = "Please use a different world.";
			} else if (var6 == 8) {
				this.hq = "Unable to connect.";
				this.hr = "Login server offline.";
			} else if (var6 == 9) {
				this.hq = "Login limit exceeded.";
				this.hr = "Too many connections.";
			} else if (var6 == 10) {
				this.hq = "Unable to connect.";
				this.hr = "Bad session id.";
			} else if (var6 == 11) {
				this.hr = "Login server rejected session.";
				this.hr = "Please try again.";
			} else if (var6 == 12) {
				this.hq = "You need a members account to login to this world.";
				this.hr = "Please subscribe, or use a different world.";
			} else if (var6 == 13) {
				this.hq = "Could not complete login.";
				this.hr = "Please try again.";
			} else if (var6 == 14) {
				this.hq = "The server is being updated.";
				this.hr = "Please wait and try again.";
			} else if (var6 == 15) {
				this.loggedIn = true;
				this.gs.position = 0;
				this.eE.position = 0;
				this.dv = -1;
				this.bb = -1;
				this.bc = -1;
				this.bd = -1;
				this.du = 0;
				this.dw = 0;
				this.fi = 0;
				this.fB = 0;
				this.bG = false;
				this.aO = System.currentTimeMillis();
			} else if (var6 == 16) {
				this.hq = "Login attempts exceeded.";
				this.hr = "Please wait 1 minute and try again.";
			} else if (var6 == 17) {
				this.hq = "You are standing in a members-only area.";
				this.hr = "To play on this world move to a free area first";
			} else if (var6 == 20) {
				this.hq = "Invalid loginserver requested";
				this.hr = "Please try again.";
			} else if (var6 != 21) {
				if (var6 == -1) {
					if (var7 == 0) {
						if (this.dS < 2) {
							try {
								Thread.sleep(2000L);
							} catch (Exception var12) {
								;
							}

							++this.dS;
							this.a(var1, var2, var3);
						} else {
							this.hq = "No response from loginserver.";
							this.hr = "Please wait and try again.";
						}
					} else {
						this.hq = "No response from server.";
						this.hr = "Please try again.";
					}
				} else {
					System.out.println("response:" + var6);
					this.hq = "Unexpected server response.";
					this.hr = "Please try again.";
				}
			} else {
				for (var6 = this.fZ.b(); var6 >= 0; --var6) {
					this.hq = "You have only just left another world";
					this.hr = "Your profile will be transferred in: " + var6
							+ " seconds";
					this.loginScreenFrame();

					try {
						Thread.sleep(1000L);
					} catch (Exception var11) {
						;
					}
				}

				this.a(var1, var2, var3);
			}
		} catch (IOException var13) {
			this.hq = "";
			this.hq = "Invalid login or server offline.";
		}
	}

	private boolean a(int var1, int var2, int var3, int var4, int var5,
			int var6, int var7, int var8, int var9, boolean var10, int var11) {
		int var12;
		int var13;
		for (var12 = 0; var12 < 104; ++var12) {
			for (var13 = 0; var13 < 104; ++var13) {
				this.bV[var12][var13] = 0;
				this.aP[var12][var13] = 99999999;
			}
		}

		var12 = var9;
		var13 = var5;
		this.bV[var9][var5] = 99;
		this.aP[var9][var5] = 0;
		byte var14 = 0;
		int var15 = 0;
		this.hC[0] = var9;
		int var27 = var14 + 1;
		this.hD[0] = var5;
		boolean var16 = false;
		int var17 = this.hC.length;
		int[][] var18 = this.gQ[this.cc].adjacencies;

		int var29;
		while (var15 != var27) {
			var12 = this.hC[var15];
			var13 = this.hD[var15];
			var15 = (var15 + 1) % var17;
			if (var12 == var11 && var13 == var8) {
				var16 = true;
				break;
			}

			int var21;
			CollisionMap var25;
			if (var4 != 0) {
				CollisionMap var10000;
				int var20;
				boolean var30;
				if (var4 < 5 || var4 == 10) {
					var10000 = this.gQ[this.cc];
					var20 = var4 - 1;
					var25 = var10000;
					if (var12 == var11 && var13 == var8) {
						var30 = true;
					} else {
						label741: {
							if (var20 == 0) {
								if (var2 == 0) {
									if (var12 == var11 - 1 && var13 == var8) {
										var30 = true;
										break label741;
									}

									if (var12 == var11
											&& var13 == var8 + 1
											&& (var25.adjacencies[var12][var13] & 19398944) == 0) {
										var30 = true;
										break label741;
									}

									if (var12 == var11
											&& var13 == var8 - 1
											&& (var25.adjacencies[var12][var13] & 19398914) == 0) {
										var30 = true;
										break label741;
									}
								} else if (var2 == 1) {
									if (var12 == var11 && var13 == var8 + 1) {
										var30 = true;
										break label741;
									}

									if (var12 == var11 - 1
											&& var13 == var8
											&& (var25.adjacencies[var12][var13] & 19398920) == 0) {
										var30 = true;
										break label741;
									}

									if (var12 == var11 + 1
											&& var13 == var8
											&& (var25.adjacencies[var12][var13] & 19399040) == 0) {
										var30 = true;
										break label741;
									}
								} else if (var2 == 2) {
									if (var12 == var11 + 1 && var13 == var8) {
										var30 = true;
										break label741;
									}

									if (var12 == var11
											&& var13 == var8 + 1
											&& (var25.adjacencies[var12][var13] & 19398944) == 0) {
										var30 = true;
										break label741;
									}

									if (var12 == var11
											&& var13 == var8 - 1
											&& (var25.adjacencies[var12][var13] & 19398914) == 0) {
										var30 = true;
										break label741;
									}
								} else if (var2 == 3) {
									if (var12 == var11 && var13 == var8 - 1) {
										var30 = true;
										break label741;
									}

									if (var12 == var11 - 1
											&& var13 == var8
											&& (var25.adjacencies[var12][var13] & 19398920) == 0) {
										var30 = true;
										break label741;
									}

									if (var12 == var11 + 1
											&& var13 == var8
											&& (var25.adjacencies[var12][var13] & 19399040) == 0) {
										var30 = true;
										break label741;
									}
								}
							}

							if (var20 == 2) {
								if (var2 == 0) {
									if (var12 == var11 - 1 && var13 == var8) {
										var30 = true;
										break label741;
									}

									if (var12 == var11 && var13 == var8 + 1) {
										var30 = true;
										break label741;
									}

									if (var12 == var11 + 1
											&& var13 == var8
											&& (var25.adjacencies[var12][var13] & 19399040) == 0) {
										var30 = true;
										break label741;
									}

									if (var12 == var11
											&& var13 == var8 - 1
											&& (var25.adjacencies[var12][var13] & 19398914) == 0) {
										var30 = true;
										break label741;
									}
								} else if (var2 == 1) {
									if (var12 == var11 - 1
											&& var13 == var8
											&& (var25.adjacencies[var12][var13] & 19398920) == 0) {
										var30 = true;
										break label741;
									}

									if (var12 == var11 && var13 == var8 + 1) {
										var30 = true;
										break label741;
									}

									if (var12 == var11 + 1 && var13 == var8) {
										var30 = true;
										break label741;
									}

									if (var12 == var11
											&& var13 == var8 - 1
											&& (var25.adjacencies[var12][var13] & 19398914) == 0) {
										var30 = true;
										break label741;
									}
								} else if (var2 == 2) {
									if (var12 == var11 - 1
											&& var13 == var8
											&& (var25.adjacencies[var12][var13] & 19398920) == 0) {
										var30 = true;
										break label741;
									}

									if (var12 == var11
											&& var13 == var8 + 1
											&& (var25.adjacencies[var12][var13] & 19398944) == 0) {
										var30 = true;
										break label741;
									}

									if (var12 == var11 + 1 && var13 == var8) {
										var30 = true;
										break label741;
									}

									if (var12 == var11 && var13 == var8 - 1) {
										var30 = true;
										break label741;
									}
								} else if (var2 == 3) {
									if (var12 == var11 - 1 && var13 == var8) {
										var30 = true;
										break label741;
									}

									if (var12 == var11
											&& var13 == var8 + 1
											&& (var25.adjacencies[var12][var13] & 19398944) == 0) {
										var30 = true;
										break label741;
									}

									if (var12 == var11 + 1
											&& var13 == var8
											&& (var25.adjacencies[var12][var13] & 19399040) == 0) {
										var30 = true;
										break label741;
									}

									if (var12 == var11 && var13 == var8 - 1) {
										var30 = true;
										break label741;
									}
								}
							}

							if (var20 == 9) {
								if (var12 == var11 && var13 == var8 + 1
										&& (var25.adjacencies[var12][var13] & 32) == 0) {
									var30 = true;
									break label741;
								}

								if (var12 == var11 && var13 == var8 - 1
										&& (var25.adjacencies[var12][var13] & 2) == 0) {
									var30 = true;
									break label741;
								}

								if (var12 == var11 - 1 && var13 == var8
										&& (var25.adjacencies[var12][var13] & 8) == 0) {
									var30 = true;
									break label741;
								}

								if (var12 == var11 + 1 && var13 == var8
										&& (var25.adjacencies[var12][var13] & 128) == 0) {
									var30 = true;
									break label741;
								}
							}

							var30 = false;
						}
					}

					if (var30) {
						var16 = true;
						break;
					}
				}

				if (var4 < 10) {
					var10000 = this.gQ[this.cc];
					int var10004 = var4 - 1;
					var20 = var2;
					var21 = var10004;
					var25 = var10000;
					if (var12 == var11 && var13 == var8) {
						var30 = true;
					} else {
						label748: {
							if (var21 == 6 || var21 == 7) {
								if (var21 == 7) {
									var20 = var2 + 2 & 3;
								}

								if (var20 == 0) {
									if (var12 == var11 + 1
											&& var13 == var8
											&& (var25.adjacencies[var12][var13] & 128) == 0) {
										var30 = true;
										break label748;
									}

									if (var12 == var11 && var13 == var8 - 1
											&& (var25.adjacencies[var12][var13] & 2) == 0) {
										var30 = true;
										break label748;
									}
								} else if (var20 == 1) {
									if (var12 == var11 - 1 && var13 == var8
											&& (var25.adjacencies[var12][var13] & 8) == 0) {
										var30 = true;
										break label748;
									}

									if (var12 == var11 && var13 == var8 - 1
											&& (var25.adjacencies[var12][var13] & 2) == 0) {
										var30 = true;
										break label748;
									}
								} else if (var20 == 2) {
									if (var12 == var11 - 1 && var13 == var8
											&& (var25.adjacencies[var12][var13] & 8) == 0) {
										var30 = true;
										break label748;
									}

									if (var12 == var11
											&& var13 == var8 + 1
											&& (var25.adjacencies[var12][var13] & 32) == 0) {
										var30 = true;
										break label748;
									}
								} else if (var20 == 3) {
									if (var12 == var11 + 1
											&& var13 == var8
											&& (var25.adjacencies[var12][var13] & 128) == 0) {
										var30 = true;
										break label748;
									}

									if (var12 == var11
											&& var13 == var8 + 1
											&& (var25.adjacencies[var12][var13] & 32) == 0) {
										var30 = true;
										break label748;
									}
								}
							}

							if (var21 == 8) {
								if (var12 == var11 && var13 == var8 + 1
										&& (var25.adjacencies[var12][var13] & 32) == 0) {
									var30 = true;
									break label748;
								}

								if (var12 == var11 && var13 == var8 - 1
										&& (var25.adjacencies[var12][var13] & 2) == 0) {
									var30 = true;
									break label748;
								}

								if (var12 == var11 - 1 && var13 == var8
										&& (var25.adjacencies[var12][var13] & 8) == 0) {
									var30 = true;
									break label748;
								}

								if (var12 == var11 + 1 && var13 == var8
										&& (var25.adjacencies[var12][var13] & 128) == 0) {
									var30 = true;
									break label748;
								}
							}

							var30 = false;
						}
					}

					if (var30) {
						var16 = true;
						break;
					}
				}
			}

			if (var6 != 0 && var3 != 0) {
				var25 = this.gQ[this.cc];
				int var19 = var11 + var6 - 1;
				var21 = var8 + var3 - 1;
				if (var12 >= var11 && var12 <= var19 && var13 >= var8
						&& var13 <= var21 || var12 == var11 - 1
						&& var13 >= var8 && var13 <= var21
						&& (var25.adjacencies[var12][var13] & 8) == 0 && (var7 & 8) == 0
						|| var12 == var19 + 1 && var13 >= var8
						&& var13 <= var21 && (var25.adjacencies[var12][var13] & 128) == 0
						&& (var7 & 2) == 0 || var13 == var8 - 1
						&& var12 >= var11 && var12 <= var19
						&& (var25.adjacencies[var12][var13] & 2) == 0 && (var7 & 4) == 0
						|| var13 == var21 + 1 && var12 >= var11
						&& var12 <= var19 && (var25.adjacencies[var12][var13] & 32) == 0
						&& (var7 & 1) == 0) {
					var16 = true;
					break;
				}
			}

			var29 = this.aP[var12][var13] + 1;
			if (var12 > 0 && this.bV[var12 - 1][var13] == 0
					&& (var18[var12 - 1][var13] & 19398920) == 0) {
				this.hC[var27] = var12 - 1;
				this.hD[var27] = var13;
				var27 = (var27 + 1) % var17;
				this.bV[var12 - 1][var13] = 2;
				this.aP[var12 - 1][var13] = var29;
			}

			if (var12 < 103 && this.bV[var12 + 1][var13] == 0
					&& (var18[var12 + 1][var13] & 19399040) == 0) {
				this.hC[var27] = var12 + 1;
				this.hD[var27] = var13;
				var27 = (var27 + 1) % var17;
				this.bV[var12 + 1][var13] = 8;
				this.aP[var12 + 1][var13] = var29;
			}

			if (var13 > 0 && this.bV[var12][var13 - 1] == 0
					&& (var18[var12][var13 - 1] & 19398914) == 0) {
				this.hC[var27] = var12;
				this.hD[var27] = var13 - 1;
				var27 = (var27 + 1) % var17;
				this.bV[var12][var13 - 1] = 1;
				this.aP[var12][var13 - 1] = var29;
			}

			if (var13 < 103 && this.bV[var12][var13 + 1] == 0
					&& (var18[var12][var13 + 1] & 19398944) == 0) {
				this.hC[var27] = var12;
				this.hD[var27] = var13 + 1;
				var27 = (var27 + 1) % var17;
				this.bV[var12][var13 + 1] = 4;
				this.aP[var12][var13 + 1] = var29;
			}

			if (var12 > 0 && var13 > 0 && this.bV[var12 - 1][var13 - 1] == 0
					&& (var18[var12 - 1][var13 - 1] & 19398926) == 0
					&& (var18[var12 - 1][var13] & 19398920) == 0
					&& (var18[var12][var13 - 1] & 19398914) == 0) {
				this.hC[var27] = var12 - 1;
				this.hD[var27] = var13 - 1;
				var27 = (var27 + 1) % var17;
				this.bV[var12 - 1][var13 - 1] = 3;
				this.aP[var12 - 1][var13 - 1] = var29;
			}

			if (var12 < 103 && var13 > 0 && this.bV[var12 + 1][var13 - 1] == 0
					&& (var18[var12 + 1][var13 - 1] & 19399043) == 0
					&& (var18[var12 + 1][var13] & 19399040) == 0
					&& (var18[var12][var13 - 1] & 19398914) == 0) {
				this.hC[var27] = var12 + 1;
				this.hD[var27] = var13 - 1;
				var27 = (var27 + 1) % var17;
				this.bV[var12 + 1][var13 - 1] = 9;
				this.aP[var12 + 1][var13 - 1] = var29;
			}

			if (var12 > 0 && var13 < 103 && this.bV[var12 - 1][var13 + 1] == 0
					&& (var18[var12 - 1][var13 + 1] & 19398968) == 0
					&& (var18[var12 - 1][var13] & 19398920) == 0
					&& (var18[var12][var13 + 1] & 19398944) == 0) {
				this.hC[var27] = var12 - 1;
				this.hD[var27] = var13 + 1;
				var27 = (var27 + 1) % var17;
				this.bV[var12 - 1][var13 + 1] = 6;
				this.aP[var12 - 1][var13 + 1] = var29;
			}

			if (var12 < 103 && var13 < 103
					&& this.bV[var12 + 1][var13 + 1] == 0
					&& (var18[var12 + 1][var13 + 1] & 19399136) == 0
					&& (var18[var12 + 1][var13] & 19399040) == 0
					&& (var18[var12][var13 + 1] & 19398944) == 0) {
				this.hC[var27] = var12 + 1;
				this.hD[var27] = var13 + 1;
				var27 = (var27 + 1) % var17;
				this.bV[var12 + 1][var13 + 1] = 12;
				this.aP[var12 + 1][var13 + 1] = var29;
			}
		}

		this.ho = 0;
		if (!var16) {
			if (var10) {
				var29 = 100;

				for (var2 = 1; var2 < 2; ++var2) {
					for (var3 = var11 - var2; var3 <= var11 + var2; ++var3) {
						for (var4 = var8 - var2; var4 <= var8 + var2; ++var4) {
							if (var3 >= 0 && var4 >= 0 && var3 < 104
									&& var4 < 104
									&& this.aP[var3][var4] < var29) {
								var29 = this.aP[var3][var4];
								var12 = var3;
								var13 = var4;
								this.ho = 1;
								var16 = true;
							}
						}
					}

					if (var16) {
						break;
					}
				}
			}

			if (!var16) {
				return false;
			}
		}

		byte var28 = 0;
		this.hC[0] = var12;
		var15 = var28 + 1;
		this.hD[0] = var13;

		for (var2 = var29 = this.bV[var12][var13]; var12 != var9
				|| var13 != var5; var2 = this.bV[var12][var13]) {
			if (var2 != var29) {
				var29 = var2;
				this.hC[var15] = var12;
				this.hD[var15++] = var13;
			}

			if ((var2 & 2) != 0) {
				++var12;
			} else if ((var2 & 8) != 0) {
				--var12;
			}

			if ((var2 & 1) != 0) {
				++var13;
			} else if ((var2 & 4) != 0) {
				--var13;
			}
		}

		if (var15 <= 0) {
			if (var1 != 1) {
				return true;
			} else {
				return false;
			}
		} else {
			var2 = var15;
			if (var15 > 25) {
				var2 = 25;
			}

			--var15;
			var3 = this.hC[var15];
			var4 = this.hD[var15];
			if ((hJ += var2) >= 92) {
				this.gs.a(36);
				this.gs.writeInt(0);
				hJ = 0;
			}

			if (var1 == 0) {
				this.gs.a(164);
				this.gs.writeByte(var2 + var2 + 3);
			}

			if (var1 == 1) {
				this.gs.a(248);
				this.gs.writeByte(var2 + var2 + 3 + 14);
			}

			if (var1 == 2) {
				this.gs.a(98);
				this.gs.writeByte(var2 + var2 + 3);
			}

			this.gs.n(var3 + this.dO);
			this.hl = this.hC[0];
			this.hm = this.hD[0];

			for (var1 = 1; var1 < var2; ++var1) {
				--var15;
				this.gs.writeByte(this.hC[var15] - var3);
				this.gs.writeByte(this.hD[var15] - var4);
			}

			this.gs.l(var4 + this.dP);
			this.gs.j(super.W[5] != 1 ? 0 : 1);
			return true;
		}
	}

	private void b(Buffer var1) {
		for (int var2 = 0; var2 < this.bO; ++var2) {
			int var3 = this.bP[var2];
			Npc var7 = this.aW[var3];
			int var4;
			int var5;
			int var6;
			if (((var4 = var1.readUByte()) & 16) != 0) {
				if ((var5 = var1.y()) == '\uffff') {
					var5 = -1;
				}

				var6 = var1.readUByte();
				if (var5 == var7.animation && var5 != -1) {
					if ((var5 = Animation.animations[var5].replayMode) == 1) {
						var7.B = 0;
						var7.C = 0;
						var7.D = var6;
						var7.E = 0;
					}

					if (var5 == 2) {
						var7.E = 0;
					}
				} else if (var5 == -1
						|| var7.animation == -1
						|| Animation.animations[var5].priority >= Animation.animations[var7.animation].priority) {
					var7.animation = var5;
					var7.B = 0;
					var7.C = 0;
					var7.D = var6;
					var7.E = 0;
					var7.P = var7.z;
				}
			}

			if ((var4 & 8) != 0) {
				var5 = var1.u();
				var6 = var1.v();
				var7.updateHits(var6, var5, x);
				var7.G = x + 300;
				var7.H = var1.u();
				var7.I = var1.readUByte();
			}

			if ((var4 & 128) != 0) {
				var7.u = var1.readUShort();
				var5 = var1.readInt();
				var7.y = var5 >> 16;
				var7.x = x + (var5 & '\uffff');
				var7.v = 0;
				var7.w = 0;
				if (var7.x > x) {
					var7.v = -1;
				}

				if (var7.u == '\uffff') {
					var7.u = -1;
				}
			}

			if ((var4 & 32) != 0) {
				var7.interactingEntity = var1.readUShort();
				if (var7.interactingEntity == '\uffff') {
					var7.interactingEntity = -1;
				}
			}

			if ((var4 & 1) != 0) {
				var7.i = var1.readString();
				var7.J = 100;
			}

			if ((var4 & 64) != 0) {
				var5 = var1.v();
				var6 = var1.w();
				var7.updateHits(var6, var5, x);
				var7.G = x + 300;
				var7.H = var1.w();
				var7.I = var1.v();
			}

			if ((var4 & 2) != 0) {
				var7.npcDefinition = ActorDefinition.lookup(var1.A());
				var7.N = var7.npcDefinition.size;
				var7.g = var7.npcDefinition.rotation;
				var7.ab = var7.npcDefinition.walkingAnimation;
				var7.ac = var7.npcDefinition.halfTurnAnimation;
				var7.ad = var7.npcDefinition.rotateClockwiseAnimation;
				var7.ae = var7.npcDefinition.rotateAntiClockwiseAnimation;
				var7.l = var7.npcDefinition.idleAnimation;
			}

			if ((var4 & 4) != 0) {
				var7.L = var1.y();
				var7.M = var1.y();
			}
		}

	}

	private void a(ActorDefinition var1, int var2, int var3, int var4) {
		if (this.fB < 400) {
			if (var1.morphisms != null) {
				var1 = var1.morph();
			}

			if (var1 != null) {
				if (var1.clickable) {
					String var5 = var1.name;
					if (var1.combatLevel != 0) {
						var5 = var5
								+ d(localPlayer.combatLevel, var1.combatLevel)
								+ " (level-" + var1.combatLevel + ")";
					}

					if (this.hE == 1) {
						this.gw[this.fB] = "Use " + this.hI + " with @yel@"
								+ var5;
						this.eV[this.fB] = 582;
						this.eW[this.fB] = var2;
						this.eT[this.fB] = var4;
						this.eU[this.fB] = var3;
						++this.fB;
					} else {
						if (this.fD == 1) {
							if ((this.fF & 2) == 2) {
								this.gw[this.fB] = this.fG + " @yel@" + var5;
								this.eV[this.fB] = 413;
								this.eW[this.fB] = var2;
								this.eT[this.fB] = var4;
								this.eU[this.fB] = var3;
								++this.fB;
								return;
							}
						} else {
							int var6;
							if (var1.actions != null) {
								for (var6 = 4; var6 >= 0; --var6) {
									if (var1.actions[var6] != null
											&& !var1.actions[var6]
													.equalsIgnoreCase("attack")) {
										this.gw[this.fB] = var1.actions[var6]
												+ " @yel@" + var5;
										if (var6 == 0) {
											this.eV[this.fB] = 20;
										}

										if (var6 == 1) {
											this.eV[this.fB] = 412;
										}

										if (var6 == 2) {
											this.eV[this.fB] = 225;
										}

										if (var6 == 3) {
											this.eV[this.fB] = 965;
										}

										if (var6 == 4) {
											this.eV[this.fB] = 478;
										}

										this.eW[this.fB] = var2;
										this.eT[this.fB] = var4;
										this.eU[this.fB] = var3;
										++this.fB;
									}
								}
							}

							if (var1.actions != null) {
								for (var6 = 4; var6 >= 0; --var6) {
									if (var1.actions[var6] != null
											&& var1.actions[var6]
													.equalsIgnoreCase("attack")) {
										short var7 = 0;
										if (var1.combatLevel > localPlayer.combatLevel) {
											var7 = 2000;
										}

										this.gw[this.fB] = var1.actions[var6]
												+ " @yel@" + var5;
										if (var6 == 0) {
											this.eV[this.fB] = var7 + 20;
										}

										if (var6 == 1) {
											this.eV[this.fB] = var7 + 412;
										}

										if (var6 == 2) {
											this.eV[this.fB] = var7 + 225;
										}

										if (var6 == 3) {
											this.eV[this.fB] = var7 + 965;
										}

										if (var6 == 4) {
											this.eV[this.fB] = var7 + 478;
										}

										this.eW[this.fB] = var2;
										this.eT[this.fB] = var4;
										this.eU[this.fB] = var3;
										++this.fB;
									}
								}
							}

							this.gw[this.fB] = this.bs < 2 ? "Examine @yel@"
									+ var5 : "Examine @yel@" + var5
									+ " @gre@(@whi@" + var1.id + "@gre@)";
							this.eV[this.fB] = 1025;
							this.eW[this.fB] = var2;
							this.eT[this.fB] = var4;
							this.eU[this.fB] = var3;
							++this.fB;
						}

					}
				}
			}
		}
	}

	private void a(int var1, int var2, Player var3, int var4) {
		if (var3 != localPlayer) {
			if (this.fB < 400) {
				String var5;
				if (var3.totalLevel == 0) {
					var5 = var3.name
							+ d(localPlayer.combatLevel, var3.combatLevel)
							+ " (level-" + var3.combatLevel + ")";
				} else {
					var5 = var3.name + " (skill-" + var3.totalLevel + ")";
				}

				int var6;
				if (this.hE == 1) {
					this.gw[this.fB] = "Use " + this.hI + " with @whi@" + var5;
					this.eV[this.fB] = 491;
					this.eW[this.fB] = var2;
					this.eT[this.fB] = var1;
					this.eU[this.fB] = var4;
					++this.fB;
				} else if (this.fD == 1) {
					if ((this.fF & 8) == 8) {
						this.gw[this.fB] = this.fG + " @whi@" + var5;
						this.eV[this.fB] = 365;
						this.eW[this.fB] = var2;
						this.eT[this.fB] = var1;
						this.eU[this.fB] = var4;
						++this.fB;
					}
				} else {
					for (var6 = 4; var6 >= 0; --var6) {
						if (this.fx[var6] != null) {
							this.gw[this.fB] = this.fx[var6] + " @whi@" + var5;
							short var7 = 0;
							if (this.fx[var6].equalsIgnoreCase("attack")) {
								if (var3.combatLevel > localPlayer.combatLevel) {
									var7 = 2000;
								}

								if (localPlayer.ao != 0 && var3.ao != 0) {
									if (localPlayer.ao == var3.ao) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								}
							} else if (this.fy[var6]) {
								var7 = 2000;
							}

							if (var6 == 0) {
								this.eV[this.fB] = var7 + 561;
							}

							if (var6 == 1) {
								this.eV[this.fB] = var7 + 779;
							}

							if (var6 == 2) {
								this.eV[this.fB] = var7 + 27;
							}

							if (var6 == 3) {
								this.eV[this.fB] = var7 + 577;
							}

							if (var6 == 4) {
								this.eV[this.fB] = var7 + 729;
							}

							this.eW[this.fB] = var2;
							this.eT[this.fB] = var1;
							this.eU[this.fB] = var4;
							++this.fB;
						}
					}
				}

				for (var6 = 0; var6 < this.fB; ++var6) {
					if (this.eV[var6] == 519) {
						this.gw[var6] = "Walk here @whi@" + var5;
						return;
					}
				}

			}
		}
	}

	private void a(Class15 var1) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var1.f == 0) {
			var2 = this.scene.getWallKey(var1.e, var1.g, var1.h);
		}

		if (var1.f == 1) {
			var2 = this.scene.j(var1.e, var1.g, var1.h);
		}

		if (var1.f == 2) {
			var2 = this.scene.k(var1.e, var1.g, var1.h);
		}

		if (var1.f == 3) {
			var2 = this.scene.l(var1.e, var1.g, var1.h);
		}

		if (var2 != 0) {
			var5 = this.scene.c(var1.e, var1.g, var1.h, var2);
			var3 = var2 >> 14 & 32767;
			var4 = var5 & 31;
			var5 >>= 6;
		}

		var1.i = var3;
		var1.k = var4;
		var1.j = var5;
	}

	private void G() {
		while (this.ek > 0) {
			try {
				Buffer var1 = Track.a(this.gU[0], this.gA[0]);
				new Class49(
						new ByteArrayInputStream(var1.buf, 0, var1.position),
						this.hc[0]);
				if (System.currentTimeMillis() + (long) (var1.position / 22) > this.bz
						+ (long) (this.bA / 22)) {
					this.bA = var1.position;
					this.bz = System.currentTimeMillis();
				}
			} catch (Exception var2) {
				var2.printStackTrace();
			}

			--this.ek;

			for (int var3 = 0; var3 < this.ek; ++var3) {
				this.gA[var3] = this.gA[var3 + 1];
				this.gU[var3] = this.gU[var3 + 1];
				this.hc[var3] = this.hc[var3 + 1];
				this.hd[var3] = this.hd[var3 + 1];
			}
		}

		if (this.loopMusic > 0) {
			this.loopMusic -= 20;
			if (this.loopMusic < 0) {
				this.loopMusic = 0;
			}

			if (this.loopMusic == 0 && playMusic) {
				this.requestedSong = this.cJ;
				this.gM = true;
				this.resourceProvider.provide(2, this.requestedSong);
			}
		}

	}

	final void f() throws Throwable {
		this.statusText(20, (String) "Starting up");
		(new VScapeCacheUpdater(this)).update();

		try {
			Client var1 = this;
			String var2 = "https://dl.dropboxusercontent.com/u/31306161/vscape/clientVersion.dat";
			BufferedReader var27 = new BufferedReader(new InputStreamReader(
					(new URL(var2)).openStream()));

			try {
				String var3;
				if ((var3 = var27.readLine()) != null) {
					var1.clientOutOfDate = !var3.equalsIgnoreCase("4.0");
				}

				var27.close();
			} catch (IOException var17) {
				System.out.println("problem reading remote client version");
				var27.close();
			}
		} catch (Exception var18) {
			;
		}

		try {
			VScapeSettings.read();
		} catch (Exception var16) {
			;
		}

		int var25;
		if (SignLink.a != null) {
			for (var25 = 0; var25 < 5; ++var25) {
				this.indices[var25] = new Index(SignLink.a, SignLink.b[var25],
						var25 + 1);
			}
		}

		try {
			this.fonts = this.getArchive(1, "title screen", "title", this.eS[1], 25);
			this.p11_full = new RSFont(false, "p11_full", this.fonts);
			this.p12_full = new RSFont(false, "p12_full", this.fonts);
			this.b12_full = new RSFont(false, "b12_full", this.fonts);
			RSFont var26 = new RSFont(true, "q8_full", this.fonts);
			this.hx = new Class71(false, "p11_full", this.fonts);
			this.hy = new Class71(false, "p12_full", this.fonts);
			this.hz = new Class71(true, "b12_full", this.fonts);
			this.v();
			this.u();
			Archive config = this.getArchive(2, "config", "config", this.eS[2], 30);
			Archive interfaces = this.getArchive(3, "interface", "interface", this.eS[3], 35);
			Archive var4 = this.getArchive(4, "2d graphics", "media", this.eS[4], 40);

			try {
				Animation.loadSpriteGroups();
			} catch (Exception var15) {
				System.out.println("Unable to load sprite cache.");
			}

			Archive textures = this.getArchive(6, "textures", "textures", this.eS[6], 45);
			Archive var6 = this.getArchive(7, "chat system", "wordenc", this.eS[7], 50);
			Archive var7 = this.getArchive(8, "sound effects", "sounds", this.eS[8], 55);
			this.hj = new byte[4][104][104];
			this.gE = new int[4][105][105];
			this.scene = new SceneGraph(this.gE);

			int var8;
			for (var8 = 0; var8 < 4; ++var8) {
				this.gQ[var8] = new CollisionMap();
			}

			this.hn = new Sprite(512, 512);
			Archive var34 = this.getArchive(5, "update list", "versionlist", this.eS[5],
					60);
			this.statusText(60, (String) "Connecting to update server");
			this.resourceProvider = new ResourceProvider();
			this.resourceProvider.init(var34, this);
			Model.a(this.resourceProvider);
			if (playLoginMusic) {
				this.requestedSong = 0;

				try {
					this.requestedSong = Integer.parseInt(this
							.getParameter("music"));
				} catch (Exception var14) {
					;
				}

				this.gM = true;
				this.resourceProvider.provide(2, this.requestedSong);

				while (this.resourceProvider.b() > 0) {
					this.dispatchProvidedResources();

					try {
						Thread.sleep(100L);
					} catch (Exception var13) {
						;
					}

					if (this.resourceProvider.a > 3) {
						return;
					}
				}
			}

			this.statusText(80, (String) "Unpacking media");
			this.aI = new Sprite("background");
			this.aJ = new Sprite("mascot_inv");
			this.aK = new Sprite("mascot_chat");
			new Sprite(var4, "overlay_multiway", 0);
			this.gv = new IndexedImage(var4, "mapback", 0);

			for (var8 = 0; var8 <= 14; ++var8) {
				this.cx[var8] = new Sprite(var4, "sideicons", var8);
			}

			for (var8 = 0; var8 <= 17; ++var8) {
				this.cy[var8] = new Sprite(var4, "staticons", var8);
			}

			for (var8 = 0; var8 <= 2; ++var8) {
				this.cy[var8 + 18] = new Sprite(var4, "staticons2", var8);
			}

			this.compassSprite = new Sprite(var4, "compass", 0);
			this.dq = new Sprite(var4, "mapedge", 0);
			this.dq.resize();

			try {
				for (var8 = 0; var8 < 100; ++var8) {
					this.ej[var8] = new IndexedImage(var4, "mapscene", var8);
				}
			} catch (Exception var23) {
				;
			}

			try {
				for (var8 = 0; var8 < 100; ++var8) {
					this.dN[var8] = new Sprite(var4, "mapfunction", var8);
				}
			} catch (Exception var22) {
				;
			}

			try {
				for (var8 = 0; var8 < 20; ++var8) {
					this.hitsplats[var8] = new Sprite(var4, "hitmarks", var8);
				}
			} catch (Exception var21) {
				;
			}

			try {
				for (var8 = 0; var8 < 6; ++var8) {
					this.fa[var8] = new Sprite(var4, "headicons_hint", var8);
				}
			} catch (Exception var20) {
				;
			}

			try {
				for (var8 = 0; var8 < 8; ++var8) {
					this.headiconsPrayer[var8] = new Sprite(var4, "headicons_prayer", var8);
				}

				for (var8 = 0; var8 < 3; ++var8) {
					this.headiconsPk[var8] = new Sprite(var4, "headicons_pk", var8);
				}
			} catch (Exception var19) {
				;
			}

			this.bu = new Sprite(var4, "mapmarker", 0);
			this.bv = new Sprite(var4, "mapmarker", 1);

			for (var8 = 0; var8 < 8; ++var8) {
				this.fL[var8] = new Sprite(var4, "cross", var8);
			}

			this.ev = new Sprite(var4, "mapdots", 0);
			this.eX = new Sprite(var4, "Overlay_multiway", 0);
			this.ew = new Sprite(var4, "mapdots", 1);
			this.ex = new Sprite(var4, "mapdots", 2);
			this.ey = new Sprite(var4, "mapdots", 3);
			this.ez = new Sprite(var4, "mapdots", 4);
			this.clanChatSprite = Animation.spriteFromGroup("clanchat", 7);
			this.dI = new Sprite(var4, "scrollbar", 0);
			this.dJ = new Sprite(var4, "scrollbar", 1);

			for (var8 = 0; var8 < 2; ++var8) {
				this.gH[var8] = new IndexedImage(var4, "mod_icons", var8);
			}

			Sprite var37 = new Sprite(var4, "screenframe", 0);
			this.aL = new ProducingGraphicsBuffer(var37.width, var37.height,
					this.getFrameComponent());
			var37.c(0, 0);
			var37 = new Sprite(var4, "screenframe", 1);
			this.aM = new ProducingGraphicsBuffer(var37.width, var37.height,
					this.getFrameComponent());
			var37.c(0, 0);
			var37 = new Sprite(var4, "mapedge", 0);
			new ProducingGraphicsBuffer(var37.width, var37.height,
					this.getFrameComponent());
			var37.c(0, 0);
			var8 = (int) (Math.random() * 21.0D) - 10;
			int var9 = (int) (Math.random() * 21.0D) - 10;
			int var10 = (int) (Math.random() * 21.0D) - 10;
			int var11 = (int) (Math.random() * 41.0D) - 20;

			for (int var12 = 0; var12 < 100; ++var12) {
				if (this.dN[var12] != null) {
					this.dN[var12].recolor(var8 + var11, var9 + var11, var10
							+ var11);
				}

				if (this.ej[var12] != null) {
					this.ej[var12].a(var8 + var11, var9 + var11, var10 + var11);
				}
			}

			this.statusText(83, (String) "Unpacking textures");
			Rasterizer3D.unpackTextures(textures);
			Rasterizer3D.calculatePalette(0.8D);
			Rasterizer3D.f();
			this.statusText(86, (String) "Unpacking config");

			Animation.init(config);
			ObjectDefinition.init(config);
			Floor.init(config);
			ItemDefinition.init(config);
			ActorDefinition.init(config);
			IdentityKit.a(config);
			SpotAnimation.init(config);
			Varp.init(config);
			VarBits.init(config);
			ItemDefinition.membersServer = playingOnMembersServer;

			this.statusText(90, (String) "Unpacking sounds");
			byte[] var35 = var7.getEntry("sounds.dat");
			Track.a(new Buffer(var35));
			this.statusText(95, (String) "Unpacking interfaces");
			RSFont[] var36 = new RSFont[] { this.p11_full, this.p12_full, this.b12_full, var26 };
			Widget.load(interfaces, var36, var4);
			this.statusText(100, (String) "Preparing game engine");

			int var29;
			int var31;
			int var32;
			for (var29 = 0; var29 < 33; ++var29) {
				var25 = 999;
				var31 = 0;

				for (var32 = 0; var32 < 34; ++var32) {
					if (this.gv.a[var32 + var29 * this.gv.c] == 0) {
						if (var25 == 999) {
							var25 = var32;
						}
					} else if (var25 != 999) {
						var31 = var32;
						break;
					}
				}

				this.cS[var29] = var25;
				this.eh[var29] = var31 - var25;
			}

			for (var29 = 1; var29 < 153; ++var29) {
				var25 = 999;
				var31 = 0;

				for (var32 = 24; var32 < 177; ++var32) {
					if (this.gv.a[var32 + var29 * this.gv.c] != 0
							|| var32 <= 34 && var29 <= 34) {
						if (var25 != 999) {
							var31 = var32;
							break;
						}
					} else if (var25 == 999) {
						var25 = var32;
					}
				}

				this.ec[var29 - 1] = var25 - 24;
				this.gP[var29 - 1] = var31 - var25;
			}

			Rasterizer3D.a(765, 503);
			this.hS = Rasterizer3D.t;
			Rasterizer3D.a(516, 165);
			this.gg = Rasterizer3D.t;
			Rasterizer3D.a(250, 335);
			this.gh = Rasterizer3D.t;
			Rasterizer3D.a(512, 334);
			this.gi = Rasterizer3D.t;
			int[] var33 = new int[9];

			for (var25 = 0; var25 < 9; ++var25) {
				var31 = 128 + (var25 << 5) + 15;
				var32 = 600 + var31 * 3;
				var31 = Rasterizer3D.SINE[var31];
				var33[var25] = var32 * var31 >> 16;
			}

			SceneGraph.a(500, 800, 512, 334, var33);
			MessageCensor.a(var6);
			this.bC = new MouseMonitor(this);
			this.startThread((Runnable) this.bC, 10);
			RenderableObject.client = this;
			ObjectDefinition.client = this;
			ActorDefinition.client = this;
		} catch (Exception var24) {
			var24.printStackTrace();
			SignLink.reportError("loaderror " + this.ea + " " + this.eB);
			this.gameCrashed = true;
		}
	}

	private void b(Buffer var1, int var2) {
		int var3;
		Player var4;
		int var5;
		int var6;
		for (; var1.c + 10 < var2 << 3 && (var3 = var1.i(11)) != 2047; var4
				.setPosition(localPlayer.pathX[0] + var6, localPlayer.pathY[0]
						+ var5, var3 == 1)) {
			if (this.bL[var3] == null) {
				this.bL[var3] = new Player();
				if (this.bQ[var3] != null) {
					this.bL[var3].updatePlayer(this.bQ[var3]);
				}
			}

			this.bN[this.bM++] = var3;
			(var4 = this.bL[var3]).K = x;
			if (var1.i(1) == 1) {
				this.bP[this.bO++] = var3;
			}

			var3 = var1.i(1);
			if ((var5 = var1.i(5)) > 15) {
				var5 -= 32;
			}

			if ((var6 = var1.i(5)) > 15) {
				var6 -= 32;
			}
		}

		var1.q();
	}

	private static String t(int var0) {
		return var0 < 999999999 ? String.valueOf(var0) : "*";
	}

	public URL getCodeBase() {
		try {
			return new URL(hK + ":80");
		} catch (Exception var1) {
			return null;
		}
	}

	private void H() {
		for (int var1 = 0; var1 < this.aX; ++var1) {
			int var2 = this.aY[var1];
			Npc var3;
			if ((var3 = this.aW[var2]) != null) {
				this.a((Actor) var3);
			}
		}

	}

	private void a(Actor var1) {
		if (var1.X < 128 || var1.Y < 128 || var1.X >= 13184 || var1.Y >= 13184) {
			var1.animation = -1;
			var1.u = -1;
			var1.U = 0;
			var1.V = 0;
			var1.X = (var1.pathX[0] << 7) + (var1.N << 6);
			var1.Y = (var1.pathY[0] << 7) + (var1.N << 6);
			var1.resetPath();
		}

		if (var1 == localPlayer
				&& (var1.X < 1536 || var1.Y < 1536 || var1.X >= 11776 || var1.Y >= 11776)) {
			var1.animation = -1;
			var1.u = -1;
			var1.U = 0;
			var1.V = 0;
			var1.X = (var1.pathX[0] << 7) + (var1.N << 6);
			var1.Y = (var1.pathY[0] << 7) + (var1.N << 6);
			var1.resetPath();
		}

		int var3;
		int var4;
		int var5;
		int var6;
		Animation var9;
		if (var1.U > x) {
			var3 = var1.U - x;
			var4 = (var1.Q << 7) + (var1.N << 6);
			var5 = (var1.S << 7) + (var1.N << 6);
			var1.X += (var4 - var1.X) / var3;
			var1.Y += (var5 - var1.Y) / var3;
			var1.f = 0;
			if (var1.W == 0) {
				var1.k = 1024;
			}

			if (var1.W == 1) {
				var1.k = 1536;
			}

			if (var1.W == 2) {
				var1.k = 0;
			}

			if (var1.W == 3) {
				var1.k = 512;
			}
		} else {
			int var7;
			int var8;
			if (var1.V >= x) {
				if (var1.V == x
						|| var1.animation == -1
						|| var1.D != 0
						|| var1.C + 1 > Animation.animations[var1.animation]
								.duration(var1.B)) {
					var3 = var1.V - var1.U;
					var4 = x - var1.U;
					var5 = (var1.Q << 7) + (var1.N << 6);
					var6 = (var1.S << 7) + (var1.N << 6);
					var7 = (var1.R << 7) + (var1.N << 6);
					var8 = (var1.T << 7) + (var1.N << 6);
					var1.X = (var5 * (var3 - var4) + var7 * var4) / var3;
					var1.Y = (var6 * (var3 - var4) + var8 * var4) / var3;
				}

				var1.f = 0;
				if (var1.W == 0) {
					var1.k = 1024;
				}

				if (var1.W == 1) {
					var1.k = 1536;
				}

				if (var1.W == 2) {
					var1.k = 0;
				}

				if (var1.W == 3) {
					var1.k = 512;
				}

				var1.Z = var1.k;
			} else {
				var1.r = var1.l;
				if (var1.z == 0) {
					var1.f = 0;
				} else {
					label402: {
						if (var1.animation != -1 && var1.D == 0) {
							var9 = Animation.animations[var1.animation];
							if (var1.P > 0 && var9.animatingPrecedence == 0) {
								++var1.f;
								break label402;
							}

							if (var1.P <= 0 && var9.walkingPrecedence == 0) {
								++var1.f;
								break label402;
							}
						}

						var3 = var1.X;
						var4 = var1.Y;
						var5 = (var1.pathX[var1.z - 1] << 7) + (var1.N << 6);
						var6 = (var1.pathY[var1.z - 1] << 7) + (var1.N << 6);
						if (var5 - var3 <= 256 && var5 - var3 >= -256
								&& var6 - var4 <= 256 && var6 - var4 >= -256) {
							if (var3 < var5) {
								if (var4 < var6) {
									var1.k = 1280;
								} else if (var4 > var6) {
									var1.k = 1792;
								} else {
									var1.k = 1536;
								}
							} else if (var3 > var5) {
								if (var4 < var6) {
									var1.k = 768;
								} else if (var4 > var6) {
									var1.k = 256;
								} else {
									var1.k = 512;
								}
							} else if (var4 < var6) {
								var1.k = 1024;
							} else {
								var1.k = 0;
							}

							if ((var7 = var1.k - var1.Z & 2047) > 1024) {
								var7 -= 2048;
							}

							var8 = var1.ac;
							if (var7 >= -256 && var7 <= 256) {
								var8 = var1.ab;
							} else if (var7 >= 256 && var7 < 768) {
								var8 = var1.ae;
							} else if (var7 >= -768 && var7 <= -256) {
								var8 = var1.ad;
							}

							if (var8 == -1) {
								var8 = var1.ab;
							}

							var1.r = var8;
							var7 = 4;
							if (var1.Z != var1.k
									&& var1.interactingEntity == -1
									&& var1.g != 0) {
								var7 = 2;
							}

							if (var1.z > 2) {
								var7 = 6;
							}

							if (var1.z > 3) {
								var7 = 8;
							}

							if (var1.f > 0 && var1.z > 1) {
								var7 = 8;
								--var1.f;
							}

							if (var1.aa[var1.z - 1]) {
								var7 <<= 1;
							}

							if (var7 >= 8 && var1.r == var1.ab
									&& var1.runAnimationId != -1) {
								var1.r = var1.runAnimationId;
							}

							if (var3 < var5) {
								var1.X += var7;
								if (var1.X > var5) {
									var1.X = var5;
								}
							} else if (var3 > var5) {
								var1.X -= var7;
								if (var1.X < var5) {
									var1.X = var5;
								}
							}

							if (var4 < var6) {
								var1.Y += var7;
								if (var1.Y > var6) {
									var1.Y = var6;
								}
							} else if (var4 > var6) {
								var1.Y -= var7;
								if (var1.Y < var6) {
									var1.Y = var6;
								}
							}

							if (var1.X == var5 && var1.Y == var6) {
								--var1.z;
								if (var1.P > 0) {
									--var1.P;
								}
							}
						} else {
							var1.X = var5;
							var1.Y = var6;
						}
					}
				}
			}
		}

		if (var1.g != 0) {
			Npc var10;
			if (var1.interactingEntity != -1 && var1.interactingEntity < '耀'
					&& (var10 = this.aW[var1.interactingEntity]) != null) {
				var4 = var1.X - var10.X;
				var5 = var1.Y - var10.Y;
				if (var4 != 0 || var5 != 0) {
					var1.k = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
				}
			}

			if (var1.interactingEntity >= '耀') {
				if ((var3 = var1.interactingEntity - '耀') == this.bF) {
					var3 = 2047;
				}

				Player var11;
				if ((var11 = this.bL[var3]) != null) {
					var5 = var1.X - var11.X;
					var6 = var1.Y - var11.Y;
					if (var5 != 0 || var6 != 0) {
						var1.k = (int) (Math
								.atan2((double) var5, (double) var6) * 325.949D) & 2047;
					}
				}
			}

			if ((var1.L != 0 || var1.M != 0) && (var1.z == 0 || var1.f > 0)) {
				var3 = var1.X - (var1.L - this.dO - this.dO << 6);
				var4 = var1.Y - (var1.M - this.dP - this.dP << 6);
				if (var3 != 0 || var4 != 0) {
					var1.k = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 2047;
				}

				var1.L = 0;
				var1.M = 0;
			}

			if ((var3 = var1.k - var1.Z & 2047) != 0) {
				if (var3 >= var1.g && var3 <= 2048 - var1.g) {
					if (var3 > 1024) {
						var1.Z -= var1.g;
					} else {
						var1.Z += var1.g;
					}
				} else {
					var1.Z = var1.k;
				}

				var1.Z &= 2047;
				if (var1.r == var1.l && var1.Z != var1.k) {
					if (var1.m != -1) {
						var1.r = var1.m;
					} else {
						var1.r = var1.ab;
					}
				}
			}
		}

		Actor var2 = var1;
		var1.O = false;
		if (var1.r != -1) {
			var9 = Animation.animations[var1.r];
			++var1.t;
			if (var1.s < var9.frameCount && var1.t > var9.duration(var1.s)) {
				var1.t = 0;
				++var1.s;
			}

			if (var1.s >= var9.frameCount) {
				var1.t = 0;
				var1.s = 0;
			}
		}

		if (var1.u != -1 && x >= var1.x) {
			if (var1.v < 0) {
				var1.v = 0;
			}

			var9 = SpotAnimation.cache[var1.u].b;
			++var1.w;

			while (var2.v < var9.frameCount && var2.w > var9.duration(var2.v)) {
				var2.w -= var9.duration(var2.v);
				++var2.v;
			}

			if (var2.v >= var9.frameCount && (var2.v < 0 || var2.v >= var9.frameCount)) {
				var2.u = -1;
			}
		}

		if (var2.animation != -1 && var2.D <= 1
				&& Animation.animations[var2.animation].animatingPrecedence == 1 && var2.P > 0
				&& var2.U <= x && var2.V < x) {
			var2.D = 1;
		} else {
			if (var2.animation != -1 && var2.D == 0) {
				var9 = Animation.animations[var2.animation];
				++var2.C;

				while (var2.B < var9.frameCount && var2.C > var9.duration(var2.B)) {
					var2.C -= var9.duration(var2.B);
					++var2.B;
				}

				if (var2.B >= var9.frameCount) {
					var2.B -= var9.loopOffset;
					++var2.E;
					if (var2.E >= var9.maximumLoops) {
						var2.animation = -1;
					}

					if (var2.B < 0 || var2.B >= var9.frameCount) {
						var2.animation = -1;
					}
				}

				var2.O = var9.stretches;
			}

			if (var2.D > 0) {
				--var2.D;
			}

		}
	}

	private void frameUpdate() {
		if (this.hM == -1 || this.dH != 2 && super.mainImageProducer == null) {
			if (this.hL != 0) {
				this.E();
			}

			if (this.hh) {
				this.hh = false;
				if (resizeMode == 0) {
					this.aM.drawImage(0, super.frameGraphics, 0);
					this.aL.drawImage(4, super.frameGraphics, 0);
				}

				D = true;
				fh = true;
				if (this.dH != 2) {
					if (resizeMode == 0) {
						this.fW.drawImage(4, super.frameGraphics, 4);
						this.fV.drawImage(0, super.frameGraphics, 516);
					} else {
						this.fW.drawImage(0, super.frameGraphics, 0);
					}
				}
			}

			if (!this.bG) {
				this.F();
				this.T();
			} else {
				this.c(4, 4);
			}

			if (this.gp != -1) {
				this.g(this.cv, this.gp);
			}

			this.q();
			int var21;
			if (this.hA == -1) {
				this.ei.q = (short) (B - p - 114);
				if (resizeMode == 0) {
					if (super.mouseX > 478 && super.mouseX < 580
							&& super.mouseY > 342) {
						this.a(494, 110, super.mouseX, super.mouseY - 348,
								this.ei, 0, false, B);
					}
				} else if (super.mouseX >= 460 && super.mouseX <= 513
						&& super.mouseY >= clientHeight - 158
						&& super.mouseY <= clientHeight - 44) {
					this.a(480, 114, super.mouseX - 16, super.mouseY, this.ei,
							clientHeight - 158, false, B);
				}

				if ((var21 = B - 114 - this.ei.q) < 0) {
					var21 = 0;
				}

				if (var21 > B - 114) {
					var21 = B - 114;
				}

				if (p != var21) {
					p = var21;
					D = true;
				}
			}

			int var2;
			if (this.hA == -1 && (this.gJ == 3 || this.gJ == 4)) {
				var21 = this.ac * 14 + 7;
				this.ei.q = this.af;
				if (resizeMode == 0) {
					if (super.mouseX > 478 && super.mouseX < 580
							&& super.mouseY > 342) {
						this.a(494, 110, super.mouseX, super.mouseY - 348,
								this.ei, 0, false, var21);
					}
				} else if (super.mouseX >= 460 && super.mouseX <= 513
						&& super.mouseY >= clientHeight - 158
						&& super.mouseY <= clientHeight - 44) {
					this.a(480, 114, super.mouseX - 16, super.mouseY, this.ei,
							clientHeight - 158, false, var21);
				}

				var2 = this.ei.q;
				if (this.ei.q < 0) {
					var2 = 0;
				}

				if (var2 > var21 - 114) {
					var2 = var21 - 114;
				}

				if (this.af != var2) {
					this.af = var2;
					D = true;
				}
			}

			if (this.hA != -1 && this.g(this.cv, this.hA)) {
				D = true;
			}

			if (this.gZ == 3) {
				D = true;
			}

			if (this.eH == 3) {
				D = true;
			}

			if (this.be != null) {
				D = true;
			}

			if (D) {
				this.l();
			}

			if (this.dH == 2) {
				Client var22 = this;
				++this.hp;
				this.b(true);
				this.a(true);
				this.b(false);
				this.a(false);
				Client client = this;

				int var25;
				for (Projectile var3 = (Projectile) this.projectiles.getBack(); var3 != null; var3 = (Projectile) client.projectiles
						.getPrevious()) {
					if (var3.sceneId == client.cc && x <= var3.endCycle) {
						if (x >= var3.delay) {
							Npc var4;
							if (var3.targetedEntityId > 0
									&& (var4 = client.aW[var3.targetedEntityId - 1]) != null
									&& var4.X >= 0 && var4.X < 13312
									&& var4.Y >= 0 && var4.Y < 13312) {
								var3.trackTarget(x, var4.Y,
										client.b(var3.sceneId, var4.Y, var4.X)
												- var3.endHeight, var4.X);
							}

							if (var3.targetedEntityId < 0) {
								Player var5;
								if ((var25 = -var3.targetedEntityId - 1) == client.bF) {
									var5 = localPlayer;
								} else {
									var5 = client.bL[var25];
								}

								if (var5 != null && var5.X >= 0
										&& var5.X < 13312 && var5.Y >= 0
										&& var5.Y < 13312) {
									var3.trackTarget(
											x,
											var5.Y,
											client.b(var3.sceneId, var5.Y,
													var5.X) - var3.endHeight,
											var5.X);
								}
							}

							var3.move(client.cv);
							client.scene.addEntity(client.cc, var3.j,
									(int) var3.h, -1, (int) var3.g, 60,
									(int) var3.f, var3, false);
						}
					} else {
						var3.unlink();
					}
				}

				client = this;

				for (GameAnimableObject var24 = (GameAnimableObject) this.eg
						.getBack(); var24 != null; var24 = (GameAnimableObject) client.eg
						.getPrevious()) {
					if (var24.c == client.cc && !var24.transformCompleted) {
						if (x >= var24.g) {
							var24.nextFrame(client.cv);
							if (var24.transformCompleted) {
								var24.unlink();
							} else {
								client.scene.addEntity(var24.c, 0, var24.f, -1,
										var24.e, 60, var24.d, var24, false);
							}
						}
					} else {
						var24.unlink();
					}
				}

				int var6;
				int var7;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var15;
				int var27;
				int var26;
				int var10004;
				if (!this.fT) {
					var2 = this.camPitch;
					if (this.dd / 256 > var2) {
						var2 = this.dd / 256;
					}

					if (this.by[4] && this.gz[4] + 128 > var2) {
						var2 = this.gz[4] + 128;
					}

					var6 = this.camYaw + this.bR & 2047;
					int var10001 = eM + var2 * (resizeMode == 0 ? this.eL : 5);
					int var10003 = this.dA;
					var10004 = this.b(this.cc, localPlayer.Y, localPlayer.X) - 50;
					var7 = this.dB;
					var9 = var10004;
					var27 = var10003;
					var26 = var10001;
					var10 = 2048 - var2 & 2047;
					var11 = 2048 - var6 & 2047;
					var12 = 0;
					var13 = 0;
					var26 = var26;
					int var14;
					int var16;
					if (var10 != 0) {
						var14 = Model.F[var10];
						var15 = Model.G[var10];
						var16 = 0 * var15 - var26 * var14 >> 16;
						var26 = 0 * var14 + var26 * var15 >> 16;
						var13 = var16;
					}

					if (var11 != 0) {
						var14 = Model.F[var11];
						var15 = Model.G[var11];
						var16 = var26 * var14 + 0 * var15 >> 16;
						var26 = var26 * var15 - 0 * var14 >> 16;
						var12 = var16;
					}

					this.bn = var27 - var12;
					this.bo = var9 - var13;
					this.bp = var7 - var26;
					this.bq = var2;
					this.br = var6;
				}

				int var8;
				if (!this.fT) {
					client = this;
					int var10000;
					if (this.showRoofs) {
						var10000 = this.cc;
					} else {
						var26 = 3;
						if (this.bq < 310) {
							var25 = this.bn >> 7;
							var27 = this.bp >> 7;
							var9 = localPlayer.X >> 7;
							var8 = localPlayer.Y >> 7;
							if ((this.hj[this.cc][var25][var27] & 4) != 0) {
								var26 = this.cc;
							}

							if (var9 > var25) {
								var7 = var9 - var25;
							} else {
								var7 = var25 - var9;
							}

							if (var8 > var27) {
								var10 = var8 - var27;
							} else {
								var10 = var27 - var8;
							}

							if (var7 > var10) {
								var11 = (var10 << 16) / var7;
								var12 = '耀';

								while (var25 != var9) {
									if (var25 < var9) {
										++var25;
									} else if (var25 > var9) {
										--var25;
									}

									if ((client.hj[client.cc][var25][var27] & 4) != 0) {
										var26 = client.cc;
									}

									if ((var12 += var11) >= 65536) {
										var12 -= 65536;
										if (var27 < var8) {
											++var27;
										} else if (var27 > var8) {
											--var27;
										}

										if ((client.hj[client.cc][var25][var27] & 4) != 0) {
											var26 = client.cc;
										}
									}
								}
							} else {
								var11 = (var7 << 16) / var10;
								var12 = '耀';

								while (var27 != var8) {
									if (var27 < var8) {
										++var27;
									} else if (var27 > var8) {
										--var27;
									}

									if ((client.hj[client.cc][var25][var27] & 4) != 0) {
										var26 = client.cc;
									}

									if ((var12 += var11) >= 65536) {
										var12 -= 65536;
										if (var25 < var9) {
											++var25;
										} else if (var25 > var9) {
											--var25;
										}

										if ((client.hj[client.cc][var25][var27] & 4) != 0) {
											var26 = client.cc;
										}
									}
								}
							}
						}

						if ((client.hj[client.cc][localPlayer.X >> 7][localPlayer.Y >> 7] & 4) != 0) {
							var26 = client.cc;
						}

						var10000 = var26;
					}

					var2 = var10000;
				} else {
					var2 = this.showRoofs ? this.cc
							: (this.b(this.cc, this.bp, this.bn) - this.bo < 800
									&& (this.hj[this.cc][this.bn >> 7][this.bp >> 7] & 4) != 0 ? this.cc
									: 3);
				}

				var6 = this.bn;
				int var17 = this.bo;
				int var18 = this.bp;
				int var19 = this.bq;
				int var20 = this.br;

				for (var26 = 0; var26 < 5; ++var26) {
					if (var22.by[var26]) {
						var25 = (int) (Math.random()
								* (double) ((var22.bx[var26] << 1) + 1)
								- (double) var22.bx[var26] + Math
								.sin((double) var22.dL[var26]
										* ((double) var22.ch[var26] / 100.0D))
								* (double) var22.gz[var26]);
						if (var26 == 0) {
							var22.bn += var25;
						}

						if (var26 == 1) {
							var22.bo += var25;
						}

						if (var26 == 2) {
							var22.bp += var25;
						}

						if (var26 == 3) {
							var22.br = var22.br + var25 & 2047;
						}

						if (var26 == 4) {
							var22.bq += var25;
							if (var22.bq < 128) {
								var22.bq = 128;
							}

							if (var22.bq > 383) {
								var22.bq = 383;
							}
						}
					}
				}

				var26 = Rasterizer3D.w;
				Model.A = true;
				Model.D = 0;
				Model.B = var22.mouseX - 4;
				Model.C = var22.mouseY - 4;
				Rasterizer2D.reset();
				var22.scene.a(var22.bn, var22.bp, var22.br, var22.bo, var2,
						var22.bq);
				var22.scene.c();
				var22.p();
				if (var22.bm == 2) {
					var22.d((var22.cm - var22.dO << 7) + var22.cp,
							var22.co << 1, (var22.cn - var22.dP << 7)
									+ var22.cq);
					if (var22.cP >= 0 && x % 20 < 10) {
						var22.fa[0].drawSprite(var22.cP - 12, var22.cQ - 28);
					}
				}

				if (var22.loggedIn) {
					if (var22.ao > 0 && resizeMode != 0) {
						Rasterizer2D.fillRectangle(0, 0, clientWidth,
								clientHeight, var22.ao, var22.ap);
					}

					if (var22.al && var22.am != -10) {
						if (!var22.ak) {
							if (var22.an) {
								var22.am += 5;
								if (var22.am >= 255) {
									var22.am = 255;
									var22.ak = true;
								}
							} else {
								var22.am -= 5;
								if (var22.am <= 0) {
									var22.am = 0;
									var22.ak = true;
								}
							}
						}

						if (var22.am > 0) {
							Rasterizer2D.fillRectangle(0, 0, clientWidth,
									clientHeight, var22.am, 0);
						}
					}
				}

				byte[] var29;
				IndexedImage var28;
				byte[] var30;
				if (Rasterizer3D.v[17] >= var26) {
					var27 = (var28 = Rasterizer3D.u[17]).c * var28.d - 1;
					var9 = var28.c * var22.cv << 1;
					var30 = var28.a;
					var29 = var22.bW;

					for (var10 = 0; var10 <= var27; ++var10) {
						var29[var10] = var30[var10 - var9 & var27];
					}

					var28.a = var29;
					var22.bW = var30;
					Rasterizer3D.b(17);
					if (++bl > 1235) {
						bl = 0;
						var22.gs.a(226);
						var22.gs.writeByte(0);
						var10 = var22.gs.position;
						var22.gs.writeShort('\ue562');
						var22.gs.writeByte(240);
						var22.gs.writeShort((int) (Math.random() * 65536.0D));
						var22.gs.writeByte((int) (Math.random() * 256.0D));
						if ((int) (Math.random() * 2.0D) == 0) {
							var22.gs.writeShort('쩱');
						}

						var22.gs.writeByte((int) (Math.random() * 256.0D));
						var22.gs.writeShort((int) (Math.random() * 65536.0D));
						var22.gs.writeShort(7130);
						var22.gs.writeShort((int) (Math.random() * 65536.0D));
						var22.gs.writeShort('\uf0d9');
						var22.gs.h(var22.gs.position - var10);
					}
				}

				if (Rasterizer3D.v[24] >= var26) {
					var27 = (var28 = Rasterizer3D.u[24]).c * var28.d - 1;
					var9 = var28.c * var22.cv << 1;
					var30 = var28.a;
					var29 = var22.bW;

					for (var10 = 0; var10 <= var27; ++var10) {
						var29[var10] = var30[var10 - var9 & var27];
					}

					var28.a = var29;
					var22.bW = var30;
					Rasterizer3D.b(24);
				}

				if (Rasterizer3D.v[34] >= var26) {
					var27 = (var28 = Rasterizer3D.u[34]).c * var28.d - 1;
					var9 = var28.c * var22.cv << 1;
					var30 = var28.a;
					var29 = var22.bW;

					for (var10 = 0; var10 <= var27; ++var10) {
						var29[var10] = var30[var10 - var9 & var27];
					}

					var28.a = var29;
					var22.bW = var30;
					Rasterizer3D.b(34);
				}

				int[] var40 = Rasterizer3D.v;
				var27 = (var28 = Rasterizer3D.u[40]).c * var28.d - 1;
				var9 = var28.c * var22.cv << 1;
				var30 = var28.a;
				var29 = var22.bW;

				for (var10 = 0; var10 <= var27; ++var10) {
					var29[var10] = var30[var10 - var9 & var27];
				}

				var28.a = var29;
				var22.bW = var30;
				Rasterizer3D.b(40);
				if (var22.loggedIn) {
					if (resizeMode != 0) {
						var22.l();
						var22.q();
						var22.minimap();
					}

					client = var22;
					if (eQ) {
						Client var36 = var22;
						if (var22.gu != 0) {
							RSFont var34 = var22.p12_full;
							var12 = 0;
							if (var22.fi != 0) {
								var12 = 1;
							}

							for (var13 = 0; var13 < 100; ++var13) {
								if (var36.ct[var13] != null) {
									var26 = var36.cr[var13];
									String var37 = var36.cs[var13];
									var15 = var36.aE[var13];
									byte var38 = 0;
									if (var37 != null
											&& var37.startsWith("@irn@")) {
										var37 = var37.substring(5);
										var38 = 4;
									}

									if ((var26 == 3 || var26 == 7)
											&& (var26 == 7 || var36.i == 0 || var36.i == 1
													&& var36.c(var37))) {
										var25 = 329 - var12 * 13;
										if (resizeMode != 0) {
											var25 = clientHeight - 170 - var12
													* 13;
										}

										var34.render(0, "From", var25, 4);
										var34.render('\uffff', "From", var25 - 1, 4);
										var27 = 4 + var34.getColoredTextWidth("From ");
										if (var15 > 0) {
											var27 += var36.a(var15, var27 + 1,
													var25 - 12);
										}

										if (var38 > 0) {
											var27 += var36.a(var38, var27 + 1,
													var25 - 12);
										}

										var34.render(0, var37 + ": "
												+ var36.ct[var13], var25, var27);
										var34.render('\uffff', var37 + ": "
												+ var36.ct[var13], var25 - 1,
												var27);
										++var12;
										if (var12 >= 5) {
											break;
										}
									}

									if (var26 == 5 && var36.i < 2) {
										var25 = 329 - var12 * 13;
										if (resizeMode != 0) {
											var25 = clientHeight - 170 - var12
													* 13;
										}

										var34.render(0, var36.ct[var13], var25, 4);
										var34.render('\uffff', var36.ct[var13],
												var25 - 1, 4);
										++var12;
										if (var12 >= 5) {
											break;
										}
									}

									if (var26 == 6 && var36.i < 2) {
										var25 = 329 - var12 * 13;
										if (resizeMode != 0) {
											var25 = clientHeight - 170 - var12
													* 13;
										}

										var34.render(0, "To " + var37 + ": "
												+ var36.ct[var13], var25, 4);
										var34.render('\uffff', "To " + var37 + ": "
												+ var36.ct[var13], var25 - 1, 4);
										++var12;
										if (var12 >= 5) {
											break;
										}
									}
								}
							}
						}
					}

					if (var22.cb == 1) {
						var22.fL[var22.ca / 100].drawSprite(var22.bY - 8
								- (resizeMode == 0 ? 4 : 0), var22.bZ - 8
								- (resizeMode == 0 ? 4 : 0));
					}

					if (var22.cb == 2) {
						var22.fL[4 + var22.ca / 100].drawSprite(var22.bY - 8
								- (resizeMode == 0 ? 4 : 0), var22.bZ - 8
								- (resizeMode == 0 ? 4 : 0));
					}

					if (var22.ef == 1) {
						var22.eX.drawSprite(resizeMode == 0 ? 472
								: (var22.dE == 197 ? clientWidth - 268
										: clientWidth - 255), resizeMode == 0 ? 296
								: (var22.dE == 197 ? 48 : 20));
					}

					if (var22.dE != -1) {
						label1190: {
							var22.g(var22.cv, var22.dE);
							Widget var39;
							byte var42;
							Client var41;
							int var10002;
							if ((var22.dE == 11146 || var22.dE == 24126 || var22.dE == 24131)
									&& resizeMode != 0) {
								var41 = var22;
								var42 = 0;
								var10002 = 0;
								var39 = Widget.widgets[var22.dE];
								var10004 = -5;
							} else if ((var22.dE == 2804 || var22.dE == 11479)
									&& resizeMode != 0) {
								var41 = var22;
								var42 = 0;
								var10002 = clientWidth / 2 - 256;
								var39 = Widget.widgets[var22.dE];
								var10004 = -5;
							} else if (var22.dE == 4535 && resizeMode != 0) {
								var41 = var22;
								var42 = 0;
								var10002 = -418;
								var39 = Widget.widgets[var22.dE];
								var10004 = -285;
							} else if ((var22.dE == 15892 || var22.dE == 15917
									|| var22.dE == 15931 || var22.dE == 15962)
									&& resizeMode != 0) {
								var41 = var22;
								var42 = 0;
								var10002 = var22.dE == 15892 ? -325 : -349;
								var39 = Widget.widgets[var22.dE];
								var10004 = 25;
							} else {
								if (var22.dE == 8677) {
									var22.c(true);
									break label1190;
								}

								if (var22.dE == 15843) {
									var22.c(false);
									break label1190;
								}

								if ((var22.dE == 12418 || var22.dE == 12416 || var22.dE == 12414)
										&& resizeMode != 0) {
									if (var22.dE == 12416) {
										var22.e(50, 0);
									}

									if (var22.dE == 12418) {
										var22.e(100, 0);
									}

									if (var22.dE == 12414) {
										var22.e(200, 0);
									}
									break label1190;
								}

								var41 = var22;
								var42 = 0;
								var10002 = resizeMode == 0 ? 0 : clientWidth / 2 - -80;
								var39 = Widget.widgets[var22.dE];
								var10004 = resizeMode == 0 ? 0 : clientHeight / 2 - 550;
							}

							var41.a(var42, var10002, (Widget) var39, var10004);
						}
					}

					if (j != -1) {
						var22.g(var22.cv, j);
						if (j == 8677) {
							var22.c(true);
						} else if (j == 15843) {
							var22.c(false);
						} else if ((j == 12418 || j == 12416 || j == 12414)
								&& resizeMode != 0) {
							if (j == 12416) {
								var22.e(50, 0);
							}

							if (j == 12418) {
								var22.e(100, 0);
							}

							if (j == 12414) {
								var22.e(200, 0);
							}
						} else {
							var22.a(0, resizeMode == 0 ? 0 : clientWidth / 2 - 356,
									(Widget) Widget.widgets[j], resizeMode == 0 ? 0
											: clientHeight / 2 - 230);
						}
					}

					var22.he = 0;
					var11 = (localPlayer.X >> 7) + var22.dO;
					var12 = (localPlayer.Y >> 7) + var22.dP;
					if (var11 >= 3053 && var11 <= 3156 && var12 >= 3056
							&& var12 <= 3136) {
						var22.he = 1;
					}

					if (var11 >= 3072 && var11 <= 3118 && var12 >= 9492
							&& var12 <= 9535) {
						var22.he = 1;
					}

					if (var22.he == 1 && var11 >= 3139 && var11 <= 3199
							&& var12 >= 3008 && var12 <= 3062) {
						var22.he = 0;
					}

					if (!var22.bG) {
						var22.F();
						var22.T();
					} else {
						var22.c(resizeMode == 0 ? 4 : 0, resizeMode == 0 ? 4 : 0);
					}

					if (fQ) {
						var27 = 16776960;
						if (var22.I < 15) {
							var27 = 16711680;
						}

						var22.p12_full.a("Fps:" + var22.I, 507, var27, 20);
						Runtime var32;
						var8 = (int) (((var32 = Runtime.getRuntime())
								.totalMemory() - var32.freeMemory()) / 1024L);
						var22.p12_full.a("Mem:" + var8 + "k", 507, 16776960, 35);
					}

					var26 = var22.dO + (localPlayer.X - 6 >> 7);
					var25 = var22.dP + (localPlayer.Y - 6 >> 7);
					if (cL) {
						var27 = clientWidth - var22.mouseX;
						var9 = clientHeight - var22.mouseY;
						var22.p12_full.render(16776960, "Dimensions: " + clientWidth
								+ " x " + clientHeight,
								resizeMode == 0 ? 225 : (eQ ? clientHeight - 277
										: clientHeight - 140), 5);
						var22.p12_full.render(16776960, "Mouse Positions: clientWidth - "
								+ var27 + ", clientHeight - " + var9,
								resizeMode == 0 ? 240 : (eQ ? clientHeight - 262
										: clientHeight - 125), 5);

						int[] var31;
						for (var8 = 0; var8 < client.gS.length; ++var8) {
							var31 = client.gS;
							client.p12_full.render(
									16776960,
									"Floor Map Array: "
											+ Arrays.toString(var31),
									resizeMode == 0 ? 255 : (eQ ? clientHeight - 247
											: clientHeight - 110), 5);
						}

						for (var8 = 0; var8 < client.gT.length; ++var8) {
							var31 = client.gT;
							client.p12_full.render(
									16776960,
									"Object Map Array: "
											+ Arrays.toString(var31),
									resizeMode == 0 ? 270 : (eQ ? clientHeight - 232
											: clientHeight - 95), 5);
						}

						client.p12_full.render(16776960, "Fps: " + client.I,
								resizeMode == 0 ? 285 : (eQ ? clientHeight - 217
										: clientHeight - 80), 5);
						Runtime var33;
						var7 = (int) (((var33 = Runtime.getRuntime())
								.totalMemory() - var33.freeMemory()) / 1024L);
						client.p12_full.render(16776960, "Mem: " + var7 + "k",
								resizeMode == 0 ? 299 : (eQ ? clientHeight - 202
										: clientHeight - 65), 5);
						client.p12_full.render(16776960, "Mouse X: " + client.mouseX
								+ " , Mouse Y: " + client.mouseY,
								resizeMode == 0 ? 314 : (eQ ? clientHeight - 187
										: clientHeight - 50), 5);
						client.p12_full.render(16776960,
								"Coords: " + var26 + ", " + var25, resizeMode == 0 ? 329
										: (eQ ? clientHeight - 172
												: clientHeight - 35), 5);
					}

					if (client.fi != 0) {
						var9 = (var27 = client.fi / 50) / 60;
						if ((var27 %= 60) < 10) {
							client.p12_full.render(16776960, "System update in: " + var9
									+ ":0" + var27, 329, 4);
						} else {
							client.p12_full.render(16776960, "System update in: " + var9
									+ ":" + var27, 329, 4);
						}

						if (++bh > 75) {
							bh = 0;
							client.gs.a(148);
						}
					}

					if (client.xpDrops && client.aq != null) {
						if (client.aq.size() > 0) {
							client.M();
						}

						if (client.av > 0 || client.aq.size() > 0) {
							String var35 = "Overall XP: "
									+ client.aj.format(client.N());
							var9 = client.hx.a(var35);
							var8 = client.as;
							if (client.as + var9 > client.as) {
								var8 -= var9 + 20;
							}

							client.hy
									.a(var35, var8, client.au + 8, 16777215, 0);
							if (client.aq.size() <= 0) {
								--client.av;
							}
						}
					}
				}

				if (var22.loggedIn) {
					var22.fW.drawImage(resizeMode == 0 ? 4 : 0,
							var22.frameGraphics, resizeMode == 0 ? 4 : 0);
				}

				var22.bn = var6;
				var22.bo = var17;
				var22.bp = var18;
				var22.bq = var19;
				var22.br = var20;
			}

			if (this.dH == 2 && resizeMode == 0) {
				this.minimap();
				this.fV.drawImage(0, super.frameGraphics, 516);
			}

			if (this.ee != -1) {
				fh = true;
			}

			if (fh) {
				if (this.ee != -1 && this.ee == C) {
					this.ee = -1;
					this.gs.a(120);
					this.gs.writeByte(C);
				}

				fh = false;
				this.fw.initializeRasterizer();
				this.fW.initializeRasterizer();
			}

			this.cv = 0;
		} else {
			if (this.dH == 2) {
				this.g(this.cv, this.hM);
				if (j != -1) {
					this.g(this.cv, j);
				}

				this.cv = 0;
				this.Z();
				super.mainImageProducer.initializeRasterizer();
				Rasterizer3D.t = this.hS;
				Rasterizer2D.reset();
				this.hh = true;
				Widget var1;
				if (j != -1) {
					if ((var1 = Widget.widgets[j]).width == 512 && var1.height == 334
							&& var1.group == 0) {
						var1.width = resizeMode == 0 ? 765 : clientWidth;
						var1.height = resizeMode == 0 ? 503 : clientHeight;
					}

					this.a(0, resizeMode == 0 ? 0 : clientWidth / 2 - 382,
							(Widget) var1, resizeMode == 0 ? 8 : clientHeight / 2 - 251);
				}

				if ((var1 = Widget.widgets[this.hM]).width == 512 && var1.height == 334
						&& var1.group == 0) {
					var1.width = resizeMode == 0 ? 765 : clientWidth;
					var1.height = resizeMode == 0 ? 503 : clientHeight;
				}

				this.a(0, resizeMode == 0 ? 0 : clientWidth / 2 - 382, (Widget) var1,
						resizeMode == 0 ? 8 : clientHeight / 2 - 251);
			}

			++this.hL;
			super.mainImageProducer.drawImage(0, super.frameGraphics, 0);
		}
	}

	private static void J() {
		try {
			if (j == 5292 && Widget.widgets['썥'].defaultText.equals("1")) {
				int var0 = Integer.parseInt(Widget.widgets['썦'].defaultText);
				int var1 = Integer.parseInt(Widget.widgets['썧'].defaultText);

				int var2;
				for (var2 = 0; var2 <= var0; ++var2) {
					Widget.widgets[var2 + '썓'].defaultSprite = Animation.spriteFromGroup(
							"bank", 14);
					Widget.widgets[var2 + '썓'].hover = "Click here to select tab "
							+ (var2 + 1);
				}

				for (var2 = var0 + 1; var2 <= 8; ++var2) {
					Widget.widgets[var2 + '썒'].defaultSprite = new Sprite("");
					Widget.widgets[var2 + '썒'].hover = "";
				}

				if (var0 != 8) {
					Widget.widgets[var0 + '썓'].defaultSprite = Animation.spriteFromGroup(
							"bank", 15);
					Widget.widgets[var0 + '썓'].hover = "Drag an item here to create a new tab";
				}

				if (var1 > 0) {
					Widget.widgets[var1 + '썒'].defaultSprite = Animation.spriteFromGroup(
							"bank", 13);
					Widget.widgets['썒'].defaultSprite = Animation.spriteFromGroup("bank",
							12);
				} else {
					Widget.widgets['썒'].defaultSprite = Animation.spriteFromGroup("bank",
							11);
				}

				Widget.widgets['썥'].defaultText = "0";
				return;
			}
		} catch (Exception var3) {
			;
		}

	}

	private void a(int var1, int var2, Widget var3, int var4) {
		if (var3.parent == 197 && resizeMode != 0) {
			var2 = clientWidth - 120;
			var4 = 170;
		}

		if (var3.group == 0 && var3.children != null) {
			if (!var3.aa || this.dK == var3.id || this.dZ == var3.id
					|| this.dT == var3.id) {
				int var5 = Rasterizer2D.clipLeft;
				int var6 = Rasterizer2D.clipBottom;
				int var7 = Rasterizer2D.clipRight;
				int var8 = Rasterizer2D.clipTop;
				Rasterizer2D.setBounds(var4 + var3.height, var2, var2 + var3.width,
						var4);
				int var9 = var3.children.length;

				for (int var10 = 0; var10 < var9; ++var10) {
					int var11 = var3.childX[var10] + var2;
					int var12 = var3.childY[var10] + var4 - var1;
					Widget var13 = Widget.widgets[var3.children[var10]];
					var11 += var13.Y;
					var12 += var13.Z;
					int var14;
					String var17;
					int var16;
					int var19;
					int var28;
					int var34;
					if (var13.contentType > 0) {
						Client var15 = this;
						var16 = var13.contentType;
						if (var13.contentType > 0 && var16 <= 100 || var16 >= 701
								&& var16 <= 800) {
							if (var16 == 1 && this.bU == 0) {
								var13.defaultText = "Loading friend list";
								var13.optionType = 0;
							} else if (var16 == 1 && this.bU == 1) {
								var13.defaultText = "Connecting to friendserver";
								var13.optionType = 0;
							} else if (var16 == 2 && this.bU != 2) {
								var13.defaultText = "Please wait...";
								var13.optionType = 0;
							} else {
								var34 = this.bS;
								if (this.bU != 2) {
									var34 = 0;
								}

								if (var16 > 700) {
									var16 -= 601;
								} else {
									--var16;
								}

								if (var16 >= var34) {
									var13.defaultText = "";
									var13.optionType = 0;
								} else {
									var13.defaultText = this.eD[var16];
									var13.optionType = 1;
								}
							}
						} else if (var16 >= 101 && var16 <= 200 || var16 >= 801
								&& var16 <= 900) {
							var34 = this.bS;
							if (this.bU != 2) {
								var34 = 0;
							}

							if (var16 > 800) {
								var16 -= 701;
							} else {
								var16 -= 101;
							}

							if (var16 >= var34) {
								var13.defaultText = "";
								var13.optionType = 0;
							} else {
								if (this.aQ[var16] != 0 && this.aQ[var16] == cK) {
									var13.defaultText = "@gre@Online";
								} else {
									var13.defaultText = "@red@Offline";
								}

								var13.optionType = 1;
							}
						} else if (var16 == 203) {
							var34 = this.bS;
							if (this.bU != 2) {
								var34 = 0;
							}

							var13.W = var34 * 15 + 20;
							if (var13.W <= var13.height) {
								var13.W = var13.height + 1;
							}
						} else if (var16 >= 401 && var16 <= 500) {
							var16 -= 401;
							if (var16 == 0 && this.bU == 0) {
								var13.defaultText = "Loading ignore list";
								var13.optionType = 0;
							} else if (var16 == 1 && this.bU == 0) {
								var13.defaultText = "Please wait...";
								var13.optionType = 0;
							} else {
								var34 = this.aN;
								if (this.bU == 0) {
									var34 = 0;
								}

								if (var16 >= var34) {
									var13.defaultText = "";
									var13.optionType = 0;
								} else {
									var13.defaultText = StringUtils
											.formatName(StringUtils
													.longToName(this.cf[var16]));
									var13.optionType = 1;
								}
							}
						} else if (var16 == 503) {
							var13.W = this.aN * 15 + 20;
							if (var13.W <= var13.height) {
								var13.W = var13.height + 1;
							}
						} else if (var16 == 327) {
							var13.spritePitch = 150;
							var13.spriteRoll = (int) (Math.sin((double) x / 40.0D) * 256.0D) & 2047;
							if (this.dM) {
								label1004: {
									for (var34 = 0; var34 < 7; ++var34) {
										if ((var28 = var15.en[var34]) >= 0
												&& !IdentityKit.b[var28].a()) {
											break label1004;
										}
									}

									var15.dM = false;
									Model[] var39 = new Model[7];
									var28 = 0;

									for (var19 = 0; var19 < 7; ++var19) {
										if ((var16 = var15.en[var19]) >= 0) {
											var39[var28++] = IdentityKit.b[var16]
													.b();
										}
									}

									Model var32 = new Model(var28, var39);

									for (var16 = 0; var16 < 5; ++var16) {
										if (var15.di[var16] != 0) {
											var32.recolor(n[var16][0],
													n[var16][var15.di[var16]]);
											if (var16 == 1) {
												var32.recolor(A[0],
														A[var15.di[var16]]);
											}
										}
									}

									var32.createBones();
									var32.applyTransform(Animation.animations[localPlayer.l].primaryFrames[0]);
									var32.light(64, 850, -30, -50, -30, true);
									var13.defaultMediaType = 5;
									var13.defaultMedia = 0;
									Widget.a(false, var32);
								}
							}
						} else if (var16 == 328) {
							var19 = (int) (Math.sin((double) x / 40.0D) * 256.0D) & 2047;
							var13.spritePitch = 150;
							var13.spriteRoll = var19;
							if (this.dM) {
								Model var31 = localPlayer.getAnimatedModel();

								for (var14 = 0; var14 < 5; ++var14) {
									if (var15.di[var14] != 0) {
										var31.recolor(n[var14][0],
												n[var14][var15.di[var14]]);
										if (var14 == 1) {
											var31.recolor(A[0],
													A[var15.di[var14]]);
										}
									}
								}

								var14 = localPlayer.l;
								var31.createBones();
								var31.applyTransform(Animation.animations[var14].primaryFrames[0]);
								var13.defaultMediaType = 5;
								var13.defaultMedia = 0;
								Widget.a(false, var31);
							}
						} else if (var16 == 324) {
							if (this.cj == null) {
								this.cj = var13.defaultSprite;
								this.ck = var13.secondarySprite;
							}

							if (this.dY) {
								var13.defaultSprite = this.ck;
							} else {
								var13.defaultSprite = this.cj;
							}
						} else if (var16 == 325) {
							if (this.cj == null) {
								this.cj = var13.defaultSprite;
								this.ck = var13.secondarySprite;
							}

							if (this.dY) {
								var13.defaultSprite = this.cj;
							} else {
								var13.defaultSprite = this.ck;
							}
						} else if (var16 == 600) {
							var13.defaultText = this.bE;
							if (x % 20 < 10) {
								var13.defaultText = var13.defaultText + "|";
							} else {
								var13.defaultText = var13.defaultText + " ";
							}
						} else {
							label1055: {
								if (var16 == 613) {
									if (this.bs > 0) {
										if (this.fR) {
											var13.defaultColor = 16711680;
											var13.defaultText = "Moderator option: Mute player for 48 hours: <ON>";
										} else {
											var13.defaultColor = 16777215;
											var13.defaultText = "Moderator option: Mute player for 48 hours: <OFF>";
										}
									} else {
										var13.defaultText = "";
									}
								}

								if (var16 == 650 || var16 == 655) {
									if (this.gt != 0) {
										if (this.dt == 0) {
											var17 = "earlier today";
										} else if (this.dt == 1) {
											var17 = "yesterday";
										} else {
											var17 = this.dt + " days ago";
										}

										var13.defaultText = "You last logged in " + var17
												+ " from: " + SignLink.d;
									} else {
										var13.defaultText = "";
									}
								}

								if (var16 == 651) {
									if (this.fO == 0) {
										var13.defaultText = "0 unread messages";
										var13.defaultColor = 16776960;
									}

									if (this.fO == 1) {
										var13.defaultText = "1 unread message";
										var13.defaultColor = '\uff00';
									}

									if (this.fO > 1) {
										var13.defaultText = this.fO + " unread messages";
										var13.defaultColor = '\uff00';
									}
								}

								if (var16 == 652) {
									if (this.fY == 201) {
										if (this.ft == 1) {
											var13.defaultText = "@yel@This is a non-members world: @whi@Since you are a member we";
										} else {
											var13.defaultText = "";
										}
									} else if (this.fY == 200) {
										var13.defaultText = "You have not yet set any password recovery questions.";
									} else {
										if (this.fY == 0) {
											var17 = "Earlier today";
										} else if (this.fY == 1) {
											var17 = "Yesterday";
										} else {
											var17 = this.fY + " days ago";
										}

										var13.defaultText = var17
												+ " you changed your recovery questions";
									}
								}

								if (var16 == 653) {
									if (this.fY == 201) {
										if (this.ft == 1) {
											var13.defaultText = "@whi@recommend you use a members world instead. You may use";
										} else {
											var13.defaultText = "";
										}
									} else if (this.fY == 200) {
										var13.defaultText = "We strongly recommend you do so now to secure your account.";
									} else {
										var13.defaultText = "If you do not remember making this change then cancel it immediately";
									}
								}

								if (var16 == 654) {
									if (this.fY == 201) {
										if (this.ft == 1) {
											var13.defaultText = "@whi@this world but member benefits are unavailable whilst here.";
										} else {
											var13.defaultText = "";
										}
										break label1055;
									}

									if (this.fY == 200) {
										var13.defaultText = "Do this from the \'account management\' area on our front webpage";
										break label1055;
									}

									var13.defaultText = "Do this from the \'account management\' area on our front webpage";
								}

								String var24;
								if (var16 >= 10000 && var16 <= 10020) {
									var16 -= 10000;
									var24 = "";
									int[] var33 = new int[] { 0, 3, 14, 2, 16,
											13, 1, 15, 10, 4, 17, 7, 5, 12, 11,
											6, 9, 8, 20, 18, 19 };
									var24 = var24
											+ StringUtils
													.formatName(SkillConstants.SKILL_NAMES[var33[var16]])
											+ ": " + this.cd[var33[var16]]
											+ "/" + this.dV[var33[var16]]
											+ "\\n";
									var24 = var24
											+ "Current XP: "
											+ this.aj
													.format((long) this.bt[var33[var16]])
											+ "\\n";
									if (this.dV[var33[var16]] < 99) {
										var24 = var24
												+ "Next level: "
												+ this.aj
														.format((long) s(this.dV[var33[var16]] + 1))
												+ "\\n";
										var24 = var24
												+ "Remainder: "
												+ this.aj
														.format((long) (s(this.dV[var33[var16]] + 1) - this.bt[var33[var16]]));
									} else {
										if (this.bt[var33[var16]] < 200000000) {
											var24 = var24
													+ "Remainder: "
													+ this.aj
															.format((long) (200000000 - this.bt[var33[var16]]))
													+ "\\n";
										} else {
											var24 = var24
													+ "Max EXP Reached\\n";
										}

										var24 = var24 + "Max Level Reached";
									}

									var13.defaultText = var24;
								} else if (var16 == 20000) {
									var13.W = this.bT * 15 + 20;
									if (var13.W <= var13.height) {
										var13.W = var13.height + 1;
									}
								} else if (var16 >= 20001 && var16 <= 20101) {
									var34 = this.bT;
									var16 -= 20001;
									Widget var18 = Widget.widgets[var13.id - 101];
									if (var16 >= var34) {
										var18.defaultSprite = var18.secondarySprite = null;
										var13.defaultText = "";
										var13.width = 0;
										var13.optionType = 0;
									} else {
										var19 = this.cI[var16];
										var24 = StringUtils
												.longToName(this.cH[var16]);
										switch (var19) {
										case 0:
											if (this.c(var24)
													&& !var24
															.equalsIgnoreCase(localPlayer.name)) {
												var18.defaultSprite = var18.secondarySprite = Animation
														.spriteFromGroup(
																"clanchat", 0);
											} else {
												var18.defaultSprite = var18.secondarySprite = null;
											}
											break;
										case 1:
											var18.defaultSprite = var18.secondarySprite = Animation
													.spriteFromGroup(
															"clanchat", 1);
											break;
										case 2:
											var18.defaultSprite = var18.secondarySprite = Animation
													.spriteFromGroup(
															"clanchat", 3);
											break;
										case 3:
											var18.defaultSprite = var18.secondarySprite = Animation
													.spriteFromGroup(
															"clanchat", 2);
										}

										var13.defaultText = StringUtils.formatName(var24);
										var13.width = var13.font.getColoredTextWidth(var13.defaultText);
										var13.optionType = 1;
									}
								}
							}
						}
					}

					if (var13.group == 0) {
						J();
						if (var13.q > var13.W - var13.height) {
							var13.q = var13.W - var13.height;
						}

						if (var13.q < 0) {
							var13.q = 0;
						}

						this.a(var13.q, var11, var13, var12);
						if (var13.W > var13.height) {
							this.a(var13.height, var13.q, var12, var11 + var13.width,
									var13.W);
						}
					} else if (var13.group != 1) {
						int itemId;
						int var20;
						int var23;
						if (var13.group == 2) {
							var23 = 0;

							for (var14 = 0; var14 < var13.height; ++var14) {
								for (var16 = 0; var16 < var13.width; ++var16) {
									var34 = var11 + var16 * (32 + var13.spritePaddingX);
									var28 = var12 + var14 * (32 + var13.spritePaddingY);
									if (var23 < 20) {
										var34 += var13.spriteX[var23];
										var28 += var13.spriteY[var23];
									}

									if (var13.itemIds[var23] <= 0) {
										Sprite var46;
										if (var13.sprite != null
												&& var23 < 20
												&& (var46 = var13.sprite[var23]) != null) {
											var46.drawSprite(var34, var28);
										}
									} else {
										var19 = 0;
										var20 = 0;
										itemId = var13.itemIds[var23] - 1;
										if (var34 > Rasterizer2D.clipLeft - 32
												&& var34 < Rasterizer2D.clipRight
												&& var28 > Rasterizer2D.clipBottom - 32
												&& var28 < Rasterizer2D.clipTop
												|| this.eH != 0
												&& this.eG == var23) {
											int var43 = 0;
											if (this.hE == 1
													&& this.hF == var23
													&& this.hG == var13.id) {
												var43 = 16777215;
											}

											Sprite var44;
											if ((var44 = ItemDefinition
													.sprite(itemId,
															var13.itemAmounts[var23],
															var43)) != null) {
												if (this.eH != 0
														&& this.eG == var23
														&& this.eF == var13.id) {
													var19 = super.mouseX
															- this.eI;
													var20 = super.mouseY
															- this.eJ;
													if (var19 < 5 && var19 > -5) {
														var19 = 0;
													}

													if (var20 < 5 && var20 > -5) {
														var20 = 0;
													}

													if (this.dh < 5) {
														var19 = 0;
														var20 = 0;
													}

													var44.d(var34 + var19,
															var28 + var20);
													if (var28 + var20 < Rasterizer2D.clipBottom
															&& var3.q > 0) {
														if ((var43 = this.cv
																* (Rasterizer2D.clipBottom
																		- var28 - var20)
																/ 3) > this.cv * 10) {
															var43 = this.cv * 10;
														}

														if (var43 > var3.q) {
															var43 = var3.q;
														}

														var3.q -= var43;
														this.eJ += var43;
													}

													if (var28 + var20 + 32 > Rasterizer2D.clipTop
															&& var3.q < var3.W
																	- var3.height) {
														if ((var43 = this.cv
																* (var28
																		+ var20
																		+ 32 - Rasterizer2D.clipTop)
																/ 3) > this.cv * 10) {
															var43 = this.cv * 10;
														}

														if (var43 > var3.W
																- var3.height
																- var3.q) {
															var43 = var3.W
																	- var3.height
																	- var3.q;
														}

														var3.q += var43;
														this.eJ -= var43;
													}
												} else if (this.gZ != 0
														&& this.gY == var23
														&& this.gX == var13.id) {
													var44.d(var34, var28);
												} else {
													var44.drawSprite(var34,
															var28);
												}
												
												/* draw item ids */
												this.p11_full.render(0x0000FF00,
														"ID: " + itemId, var28 + 9 + 12
																+ var20,
														var34 + var19);

												if (var44.resizeWidth == 33
														|| var13.itemAmounts[var23] != 1) {
													var43 = var13.itemAmounts[var23];
													this.p11_full.render(0, k(var43),
															var28 + 10 + var20,
															var34 + 1 + var19);
													this.p11_full.render(16776960,
															k(var43), var28 + 9
																	+ var20,
															var34 + var19);
													
												}
											}
										}
									}

									++var23;
								}
							}
						} else if (var13.group == 3) {
							boolean var29 = false;
							if (this.dT == var13.id || this.dZ == var13.id
									|| this.dK == var13.id) {
								var29 = true;
							}

							if (this.b(var13)) {
								var14 = var13.secondaryColor;
								if (var29 && var13.secondaryHoverColor != 0) {
									var14 = var13.secondaryHoverColor;
								}
							} else {
								var14 = var13.defaultColor;
								if (var29 && var13.defaultHoverColor != 0) {
									var14 = var13.defaultHoverColor;
								}
							}

							if (var13.alpha == 0) {
								if (var13.t) {
									Rasterizer2D.fillRectangle(var13.height, var12,
											var11, var14, var13.width);
								} else {
									Rasterizer2D.drawRectangle(var11, var13.width,
											var13.height, var14, var12);
								}
							} else if (var13.t) {
								Rasterizer2D.fillRectangle(var14, var12,
										var13.width, var13.height,
										256 - (var13.alpha & 255), var11);
							} else {
								Rasterizer2D.drawRectangle(var12, var13.height,
										256 - (var13.alpha & 255), var14, var13.width,
										var11);
							}
						} else {
							RSFont var25;
							if (var13.group == 4) {
								var25 = var13.font;
								String var26 = var13.defaultText;
								boolean var41 = false;
								if (this.dT == var13.id || this.dZ == var13.id
										|| this.dK == var13.id) {
									var41 = true;
								}

								if (this.b(var13)) {
									var34 = var13.secondaryColor;
									if (var41 && var13.secondaryHoverColor != 0) {
										var34 = var13.secondaryHoverColor;
									}

									if (var13.secondaryText.length() > 0) {
										var26 = var13.secondaryText;
									}
								} else {
									var34 = var13.defaultColor;
									if (var41 && var13.defaultHoverColor != 0) {
										var34 = var13.defaultHoverColor;
									}
								}

								if (var13.optionType == 6 && this.fK) {
									var26 = "Please wait...";
									var34 = var13.defaultColor;
								}

								if ((this.hA != -1 || this.dU != -1 || var13.defaultText
										.contains("Click here to continue"))
										&& (var3.id == this.hA || var3.id == this.dU)) {
									if (var34 == 16776960) {
										var34 = 255;
									}

									if (var34 == '쀀') {
										var34 = 16777215;
									}
								}

								for (var28 = var12 + var25.verticalSpace; var26.length() > 0; var28 += var25.verticalSpace) {
									if (var26.indexOf("%") != -1) {
										while ((var19 = var26.indexOf("%1")) != -1) {
											var26 = var26.substring(0, var19)
													+ t(this.a((Widget) var13,
															0))
													+ var26.substring(var19 + 2);
										}

										while ((var19 = var26.indexOf("%2")) != -1) {
											var26 = var26.substring(0, var19)
													+ t(this.a((Widget) var13,
															1))
													+ var26.substring(var19 + 2);
										}

										while ((var19 = var26.indexOf("%3")) != -1) {
											var26 = var26.substring(0, var19)
													+ t(this.a((Widget) var13,
															2))
													+ var26.substring(var19 + 2);
										}

										while ((var19 = var26.indexOf("%4")) != -1) {
											var26 = var26.substring(0, var19)
													+ t(this.a((Widget) var13,
															3))
													+ var26.substring(var19 + 2);
										}

										while ((var19 = var26.indexOf("%5")) != -1) {
											var26 = var26.substring(0, var19)
													+ t(this.a((Widget) var13,
															4))
													+ var26.substring(var19 + 2);
										}
									}

									String var35;
									if ((var19 = var26.indexOf("\\n")) != -1) {
										var35 = var26.substring(0, var19);
										var26 = var26.substring(var19 + 2);
									} else {
										var35 = var26;
										var26 = "";
									}

									if (var13.centeredText) {
										var25.a(var34, var11 + var13.width / 2,
												var35, var28, var13.shadowedText);
									} else {
										var25.shadow(var13.shadowedText, var11, var34, var35,
												var28);
									}
								}
							} else if (var13.group == 5) {
								Sprite var27;
								if (this.b(var13)) {
									var27 = var13.secondarySprite;
								} else {
									var27 = var13.defaultSprite;
								}

								if (var27 != null) {
									if (this.fD == 1 && var13.id == eK
											&& eK != 0) {
										var27.c(var11, var12, 16777215);
									} else {
										var27.drawSprite(var11, var12);
									}
								}
							} else if (var13.group == 6) {
								var23 = Rasterizer3D.e;
								var14 = Rasterizer3D.f;
								Rasterizer3D.e = var11 + var13.width / 2;
								Rasterizer3D.f = var12 + var13.height / 2;
								var16 = Rasterizer3D.SINE[var13.spritePitch] * var13.spriteScale >> 16;
								var34 = Rasterizer3D.COSINE[var13.spritePitch]
										* var13.spriteScale >> 16;
								boolean var38;
								if (var38 = this.b(var13)) {
									var19 = var13.secondaryAnimationId;
								} else {
									var19 = var13.defaultAnimationId;
								}

								Model var40;
								if (var19 == -1) {
									var40 = var13.getAnimatedModel(-1, -1,
											var38);
								} else {
									Animation var42 = Animation.animations[var19];
									var40 = var13
											.getAnimatedModel(
													var42.secondaryFrames[var13.K],
													var42.primaryFrames[var13.K],
													var38);
								}

								if (var40 != null) {
									var40.render(var13.spriteRoll, 0, var13.spritePitch, 0,
											var16, var34);
								}

								Rasterizer3D.e = var23;
								Rasterizer3D.f = var14;
							} else {
								String var30;
								if (var13.group == 7) {
									var25 = var13.font;
									var14 = 0;

									for (var16 = 0; var16 < var13.height; ++var16) {
										for (var34 = 0; var34 < var13.width; ++var34) {
											if (var13.itemIds[var14] > 0) {
												ItemDefinition var36;
												var30 = (var36 = ItemDefinition
														.fromID(var13.itemIds[var14] - 1)).itemName;
												if (var36.stackable
														|| var13.itemAmounts[var14] != 1) {
													var30 = var30
															+ " x"
															+ f(var13.itemAmounts[var14]);
												}

												var20 = var11 + var34
														* (115 + var13.spritePaddingX);
												itemId = var12 + var16
														* (12 + var13.spritePaddingY);
												if (var13.centeredText) {
													var25.a(var13.defaultColor, var20
															+ var13.width / 2,
															var30, itemId,
															var13.shadowedText);
												} else {
													var25.shadow(var13.shadowedText, var20,
															var13.defaultColor, var30,
															itemId);
												}
											}

											++var14;
										}
									}
								} else if (var13.group == 8
										&& (this.hQ == var13.id
												|| this.hN == var13.id || this.hO == var13.id)
										&& this.hR == 0 && !this.bG) {
									var23 = 0;
									var14 = 0;
									RSFont var45 = this.p12_full;

									for (var17 = var13.defaultText; var17.length() > 0; var14 += var45.verticalSpace + 1) {
										if (var17.indexOf("%") != -1) {
											while ((var28 = var17.indexOf("%1")) != -1) {
												var17 = var17.substring(0,
														var28)
														+ t(this.a(
																(Widget) var13,
																0))
														+ var17.substring(var28 + 2);
											}

											while ((var28 = var17.indexOf("%2")) != -1) {
												var17 = var17.substring(0,
														var28)
														+ t(this.a(
																(Widget) var13,
																1))
														+ var17.substring(var28 + 2);
											}

											while ((var28 = var17.indexOf("%3")) != -1) {
												var17 = var17.substring(0,
														var28)
														+ t(this.a(
																(Widget) var13,
																2))
														+ var17.substring(var28 + 2);
											}

											while ((var28 = var17.indexOf("%4")) != -1) {
												var17 = var17.substring(0,
														var28)
														+ t(this.a(
																(Widget) var13,
																3))
														+ var17.substring(var28 + 2);
											}

											while ((var28 = var17.indexOf("%5")) != -1) {
												var17 = var17.substring(0,
														var28)
														+ t(this.a(
																(Widget) var13,
																4))
														+ var17.substring(var28 + 2);
											}
										}

										if ((var28 = var17.indexOf("\\n")) != -1) {
											var30 = var17.substring(0, var28);
											var17 = var17.substring(var28 + 2);
										} else {
											var30 = var17;
											var17 = "";
										}

										if ((var20 = var45.getColoredTextWidth(var30)) > var23) {
											var23 = var20;
										}
									}

									var23 += 6;
									var14 += 7;
									var34 = var11 + var13.width - 5 - var23;
									var28 = var12 + var13.height + 5;
									if (var34 < var11 + 5) {
										var34 = var11 + 5;
									}

									if (var34 + var23 > var2 + var3.width) {
										var34 = var2 + var3.width - var23;
									}

									if (var28 + var14 > var4 + var3.height) {
										var28 = var4 + var3.height - var14;
									}

									if (var13.ah) {
										var19 = clientWidth >= this.eR ? clientHeight - 37
												: clientHeight - 73;
										if (var34 + var23 + var2 > (resizeMode == 0 ? 280
												: clientWidth + var2)) {
											var34 = (resizeMode == 0 ? 280 : clientWidth
													+ var2)
													- var23 - var2;
										}

										if (var28 + var14 + var4 > (resizeMode == 0 ? 330
												: var19 + var4 - 10)) {
											var28 = (resizeMode == 0 ? 330 : var19
													+ var4 - 10)
													- var14 - var4;
										}
									}

									Rasterizer2D.fillRectangle(var14, var28,
											var34, 16777120, var23);
									Rasterizer2D.drawRectangle(var34, var23,
											var14, 0, var28);
									var30 = var13.defaultText;

									for (var20 = var28 + var45.verticalSpace + 2; var30
											.length() > 0; var20 += var45.verticalSpace + 1) {
										if (var30.indexOf("%") != -1) {
											while ((itemId = var30.indexOf("%1")) != -1) {
												var30 = var30.substring(0,
														itemId)
														+ t(this.a(
																(Widget) var13,
																0))
														+ var30.substring(itemId + 2);
											}

											while ((itemId = var30.indexOf("%2")) != -1) {
												var30 = var30.substring(0,
														itemId)
														+ t(this.a(
																(Widget) var13,
																1))
														+ var30.substring(itemId + 2);
											}

											while ((itemId = var30.indexOf("%3")) != -1) {
												var30 = var30.substring(0,
														itemId)
														+ t(this.a(
																(Widget) var13,
																2))
														+ var30.substring(itemId + 2);
											}

											while ((itemId = var30.indexOf("%4")) != -1) {
												var30 = var30.substring(0,
														itemId)
														+ t(this.a(
																(Widget) var13,
																3))
														+ var30.substring(itemId + 2);
											}

											while ((itemId = var30.indexOf("%5")) != -1) {
												var30 = var30.substring(0,
														itemId)
														+ t(this.a(
																(Widget) var13,
																4))
														+ var30.substring(itemId + 2);
											}
										}

										String var22;
										if ((itemId = var30.indexOf("\\n")) != -1) {
											var22 = var30.substring(0, itemId);
											var30 = var30.substring(itemId + 2);
										} else {
											var22 = var30;
											var30 = "";
										}

										if (var13.centeredText) {
											var45.a(var28, var34 + var13.width / 2,
													var22, var20, false);
										} else if (var22.contains("\\r")) {
											String var37 = var22.substring(0,
													var22.indexOf("\\r"));
											var22 = var22.substring(var22
													.indexOf("\\r") + 2);
											var45.shadow(false, var34 + 3, 0, var37,
													var20);
											var11 = var23 + var34
													- var45.getColoredTextWidth(var22) - 2;
											var45.shadow(false, var11, 0, var22,
													var20);
											System.out.println("Box: " + var23);
										} else {
											var45.shadow(false, var34 + 3, 0, var22,
													var20);
										}
									}
								}
							}
						}
					}
				}

				Rasterizer2D.setBounds(var8, var5, var7, var6);
			}
		}
	}

	public final void scrollWheelDrag(int dx, int dy) {
		if ((super.mouseState == 5 || super.Z && super.mouseState == 5)
				&& this.loggedIn) {
			int var3 = VScapeSettings.camDragSensitivity;
			if (VScapeSettings.camDragSensitivity <= 0) {
				var3 = 1;
			}

			if (var3 > 10) {
				var3 = 10;
			}

			this.camYawDelta += dx * var3;
			this.camPitchDelta += dy << 1;
		}
	}

	private void K() {
		try {
			int var1 = localPlayer.X + this.hB;
			int var2 = localPlayer.Y + this.fA;
			if (this.dA - var1 < -500 || this.dA - var1 > 500
					|| this.dB - var2 < -500 || this.dB - var2 > 500) {
				this.dA = var1;
				this.dB = var2;
			}

			if (this.dA != var1) {
				this.dA += (var1 - this.dA) / 16;
			}

			if (this.dB != var2) {
				this.dB += (var2 - this.dB) / 16;
			}

			if (super.W[1] == 1) {
				this.camYawDelta += (-24 - this.camYawDelta) / 2;
			} else if (super.W[2] == 1) {
				this.camYawDelta += (24 - this.camYawDelta) / 2;
			} else {
				this.camYawDelta /= 2;
			}

			if (super.W[3] == 1) {
				this.camPitchDelta += (12 - this.camPitchDelta) / 2;
			} else if (super.W[4] == 1) {
				this.camPitchDelta += (-12 - this.camPitchDelta) / 2;
			} else {
				this.camPitchDelta /= 2;
			}

			this.camYaw = this.camYaw + this.camYawDelta / 2 & 2047; // wraparound
																		// yaw
			this.camPitch += this.camPitchDelta / 2;

			if (this.camPitch < 128) {
				this.camPitch = 128;
			}

			if (this.camPitch > 383) {
				this.camPitch = 383;
			}

			var1 = this.dA >> 7;
			var2 = this.dB >> 7;
			int var3 = this.b(this.cc, this.dB, this.dA);
			int var4 = 0;
			int var5;
			if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
				for (var5 = var1 - 4; var5 <= var1 + 4; ++var5) {
					for (int var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
						int var7 = this.cc;
						if (this.cc < 3 && (this.hj[1][var5][var6] & 2) == 2) {
							++var7;
						}

						if ((var7 = var3 - this.gE[var7][var5][var6]) > var4) {
							var4 = var7;
						}
					}
				}
			}

			if (++ds > 1512) {
				ds = 0;
				this.gs.a(77);
				this.gs.writeByte(0);
				var5 = this.gs.position;
				this.gs.writeByte((int) (Math.random() * 256.0D));
				this.gs.writeByte(101);
				this.gs.writeByte(233);
				this.gs.writeShort('뀤');
				if ((int) (Math.random() * 2.0D) == 0) {
					this.gs.writeShort('诈');
				}

				this.gs.writeByte((int) (Math.random() * 256.0D));
				this.gs.writeByte(64);
				this.gs.writeByte(38);
				this.gs.writeShort((int) (Math.random() * 65536.0D));
				this.gs.writeShort((int) (Math.random() * 65536.0D));
				this.gs.h(this.gs.position - var5);
			}

			if ((var5 = var4 * 192) > 98048) {
				var5 = 98048;
			}

			if (var5 < '耀') {
				var5 = '耀';
			}

			if (var5 > this.dd) {
				this.dd += (var5 - this.dd) / 24;
			} else if (var5 < this.dd) {
				this.dd += (var5 - this.dd) / 80;
			}
		} catch (Exception var8) {
			SignLink.reportError("glfc_ex " + localPlayer.X + ","
					+ localPlayer.Y + "," + this.dA + "," + this.dB + ","
					+ this.eq + "," + this.er + "," + this.dO + "," + this.dP);
			throw new RuntimeException("eek");
		}
	}

	public final void frame() {
		if (this.gameCrashed) {
			Graphics var2;
			(var2 = this.getFrameComponent().getGraphics())
					.setColor(Color.black);
			var2.fillRect(0, 0, 765, 503);
			this.c(1);
			if (this.gameCrashed) {
				this.aS = false;
				var2.setFont(new Font("Helvetica", 1, 16));
				var2.setColor(Color.yellow);
				var2.drawString(
						"Sorry, an error has occured whilst loading /v/scape",
						30, 35);
				var2.setColor(Color.white);
				var2.drawString("To fix this try the following (in order):",
						30, 85);
				var2.setColor(Color.white);
				var2.setFont(new Font("Helvetica", 1, 12));
				var2.drawString(
						"1: Try closing ALL open web-browser windows, and reloading",
						30, 135);
				var2.drawString(
						"2: Try clearing your web-browsers cache from tools->internet options",
						30, 165);
				var2.drawString("3: Try using a different game-world", 30, 195);
				var2.drawString("4: Try rebooting your computer", 30, 225);
				var2.drawString(
						"5: Try selecting a different version of Java from the play-game menu",
						30, 255);
			}

		} else {
			if (!this.loggedIn) {
				this.loginScreenFrame();
			} else {
				this.frameUpdate();
			}

			this.gD = 0;
		}
	}

	private boolean c(String var1) {
		if (var1 == null) {
			return false;
		} else {
			for (int var2 = 0; var2 < this.bS; ++var2) {
				if (var1.equalsIgnoreCase(this.eD[var2])) {
					return true;
				}
			}

			return var1.equalsIgnoreCase(localPlayer.name);
		}
	}

	private static String d(int var0, int var1) {
		return (var0 -= var1) < -9 ? "@red@" : (var0 < -6 ? "@or3@"
				: (var0 < -3 ? "@or2@" : (var0 < 0 ? "@or1@"
						: (var0 > 9 ? "@gre@" : (var0 > 6 ? "@gr3@"
								: (var0 > 3 ? "@gr2@" : (var0 > 0 ? "@gr1@"
										: "@yel@")))))));
	}

	private void c(boolean var1) {
		if (!this.ak && this.am == -10) {
			this.an = var1;
			this.al = true;
			if (this.an) {
				this.am = 0;
				return;
			}

			this.am = 255;
		}

	}

	private void L() {
		this.al = false;
		this.ak = false;
		this.an = false;
		this.am = -10;
	}

	private void e(int var1, int var2) {
		this.ao = var1;
		this.ap = 0;
	}

	private void M() {
		try {
			this.as = clientWidth - 250;
			this.at = clientHeight / 2 - 180;
			this.au = clientHeight - 180;
			if (this.at <= 0) {
				this.at = 0;
			}

			if (this.aq != null && this.aq.size() <= 0) {
				this.aq.clear();
			} else {
				for (int var1 = 0; var1 < this.aq.size(); ++var1) {
					int[] var2;
					if ((var2 = (int[]) this.aq.get(var1)) != null) {
						int var3 = var2[0];
						int var4 = var2[1];
						int var5 = var2[2] += this.au < this.at ? -1 : 1;
						var5 += this.at;
						int[] var6;
						if (var1 + 1 < this.aq.size()
								&& (var6 = (int[]) this.aq.get(var1 + 1)) != null
								&& Math.abs(this.at + var6[2] - var5) < 32) {
							var2[2] = var6[2] + 32;
							var5 = var2[2];
							var5 += this.at;
						}

						int var11;
						if ((var11 = Math.abs(var5 - this.au)) > 2
								&& var5 <= this.au) {
							Sprite var9 = this.cy[this.ar[var3]];
							var3 = var11 >= 255 ? 255 : var11;
							String var10 = "+" + this.aj.format((long) var4);
							var11 = this.hx.a(var10);
							int var7 = this.as;
							if (var9 != null) {
								if (var7 + var9.width + var11 > this.as) {
									var7 -= var9.width + var11 + 12;
								}

								var9.a(var7, var5, var3);
								this.hx.a("<trans=" + var3 + ">" + var10
										+ "</tans>", var7 + var9.width + 4,
										var5 + 16, 16777215, 0);
							} else {
								if (var7 + var11 > this.as) {
									var7 -= var11 + 12;
								}

								this.hx.a("<trans=" + var3 + ">" + var10
										+ "</tans>", var7, var5 + 16, 16777215,
										0);
							}
						} else {
							this.aq.remove(var1);
						}
					}
				}

			}
		} catch (Exception var8) {
			;
		}
	}

	private long N() {
		long var1 = 0L;

		for (int var3 = 0; var3 < 25; ++var3) {
			var1 += (long) this.bt[var3];
		}

		return var1;
	}

	private void f(int var1, int var2) {
		if (this.aq != null) {
			this.aq.add(new int[] { var1, var2, 0 });
			this.av = 200;
		}

	}

	private void c(long var1) {
		if (var1 != 0L) {
			try {
				if (this.aN >= 100) {
					this.a("Your ignore list is full. Max of 100 hit", 0, "",
							true);
				} else {
					String var3 = StringUtils.formatName(StringUtils
							.longToName(var1));

					int var4;
					for (var4 = 0; var4 < this.aN; ++var4) {
						if (this.cf[var4] == var1) {
							this.a(var3 + " is already on your ignore list", 0,
									"", true);
							return;
						}
					}

					for (var4 = 0; var4 < this.bS; ++var4) {
						if (this.cG[var4] == var1) {
							this.a("Please remove " + var3
									+ " from your friend list first", 0, "",
									true);
							return;
						}
					}

					this.cf[this.aN++] = var1;
					this.gs.a(133);
					this.gs.writeLong(var1);
				}
			} catch (RuntimeException var5) {
				SignLink.reportError("45688, " + var1 + ", 4" + ", "
						+ var5.toString());
				throw new RuntimeException();
			}
		}
	}

	private void O() {
		for (int var1 = -1; var1 < this.bM; ++var1) {
			int var2;
			if (var1 == -1) {
				var2 = 2047;
			} else {
				var2 = this.bN[var1];
			}

			Player var3;
			if ((var3 = this.bL[var2]) != null) {
				this.a((Actor) var3);
			}
		}

	}

	private void P() {
		if (this.dH == 2) {
			for (Class15 var1 = (Class15) this.gf.getBack(); var1 != null; var1 = (Class15) this.gf
					.getPrevious()) {
				if (var1.d > 0) {
					--var1.d;
				}

				if (var1.d == 0) {
					if (var1.i < 0 || MapRegion.a(var1.i, var1.k)) {
						this.a(var1.h, var1.e, var1.j, var1.k, var1.g, var1.f,
								var1.i);
						var1.unlink();
					}
				} else {
					if (var1.l > 0) {
						--var1.l;
					}

					if (var1.l == 0 && var1.g > 0 && var1.h > 0
							&& var1.g <= 102 && var1.h <= 102
							&& (var1.a < 0 || MapRegion.a(var1.a, var1.c))) {
						this.a(var1.h, var1.e, var1.b, var1.c, var1.g, var1.f,
								var1.a);
						var1.l = -1;
						if (var1.a == var1.i && var1.i == -1) {
							var1.unlink();
						} else if (var1.a == var1.i && var1.b == var1.j
								&& var1.c == var1.k) {
							var1.unlink();
						}
					}
				}
			}
		}

	}

	private void Q() {
		int var1 = this.b12_full.getColoredTextWidth("Choose option");

		int var2;
		int var3;
		for (var2 = 0; var2 < this.fB; ++var2) {
			if ((var3 = this.b12_full.getColoredTextWidth(this.gw[var2])) > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		var2 = 15 * this.fB + 21;
		int var4;
		if (super.U > 0 && super.V > 0 && super.U < 765 && super.V < 503) {
			if ((var3 = super.U - var1 / 2) + var1 > 761) {
				var3 = 761 - var1;
			}

			if (var3 < 0) {
				var3 = 0;
			}

			var4 = super.V;
			if (super.V + var2 > 497) {
				var4 = 497 - var2;
			}

			if (var4 < 0) {
				var4 = 0;
			}

			this.bG = true;
			this.cA = var3;
			this.cB = var4;
			this.cC = var1;
			this.cD = 15 * this.fB + 22;
		}

		if (resizeMode != 0 && super.U > 0 && super.V > 0 && super.U < clientWidth
				&& super.V < clientHeight) {
			if ((var3 = super.U - var1 / 2) + var1 > clientWidth) {
				var3 = clientWidth - var1;
			}

			if (var3 < 0) {
				var3 = 0;
			}

			var4 = super.V;
			if (super.V + var2 > clientHeight) {
				var4 = clientHeight - var2;
			}

			if (var4 < 0) {
				var4 = 0;
			}

			this.bG = true;
			this.cz = 0;
			this.cA = var3;
			this.cB = var4;
			this.cC = var1;
			this.cD = 15 * this.fB + 22;
		}

	}

	private void prepareRasterizerForLoginScreen() {
		this.loginScreen = new ProducingGraphicsBuffer(clientWidth,
				clientHeight, this.getFrameComponent());
		Rasterizer2D.reset();
	}

	private void S() {
		this.aS = false;
		boolean var10000 = this.cO;
		this.fN = null;
		this.bi = null;
		this.bj = null;
		this.bk = null;
		this.gq = null;
		this.gr = null;
		this.gx = null;
		this.gy = null;
	}

	private boolean g(int var1, int var2) {
		boolean var3 = false;
		Widget var7 = Widget.widgets[var2];

		for (int var4 = 0; var4 < var7.children.length && var7.children[var4] != -1; ++var4) {
			Widget var5;
			if ((var5 = Widget.widgets[var7.children[var4]]).group == 1) {
				var3 |= this.g(var1, var5.id);
			}

			if (var5.group == 6 && (var5.defaultAnimationId != -1 || var5.secondaryAnimationId != -1)) {
				int var6;
				if (this.b(var5)) {
					var6 = var5.secondaryAnimationId;
				} else {
					var6 = var5.defaultAnimationId;
				}

				if (var6 != -1) {
					Animation var8 = Animation.animations[var6];

					for (var5.c += var1; var5.c > var8.duration(var5.K); var3 = true) {
						var5.c -= var8.duration(var5.K) + 1;
						++var5.K;
						if (var5.K >= var8.frameCount) {
							var5.K -= var8.loopOffset;
							if (var5.K < 0 || var5.K >= var8.frameCount) {
								var5.K = 0;
							}
						}
					}
				}
			}
		}

		return var3;
	}

	private void d(long var1) {
		if (var1 != 0L) {
			try {
				for (int var3 = 0; var3 < this.aN; ++var3) {
					if (this.cf[var3] == var1) {
						--this.aN;
						System.arraycopy(this.cf, var3 + 1, this.cf, var3,
								this.aN - var3);
						this.gs.a(74);
						this.gs.writeLong(var1);
						return;
					}
				}

			} catch (RuntimeException var4) {
				SignLink.reportError("47229, 3, " + var1 + ", "
						+ var4.toString());
				throw new RuntimeException();
			}
		}
	}

	private void a(long var1, int var3) {
		if (var1 != 0L) {
			if (var3 >= 0) {
				try {
					this.gs.a(61);
					this.gs.writeLong(var1);
					this.gs.writeShort(var3);
				} catch (RuntimeException var4) {
					SignLink.reportError("47229, 3, " + var1 + ", "
							+ var4.toString());
					throw new RuntimeException();
				}
			}
		}
	}

	public String getParameter(String var1) {
		return super.getParameter(var1);
	}

	private int a(Widget var1, int var2) {
		if (var1.s != null && var2 < var1.s.length) {
			try {
				int[] var12 = var1.s[var2];
				var2 = 0;
				int var3 = 0;
				byte var4 = 0;

				while (true) {
					int var5 = var12[var3++];
					int var6 = 0;
					byte var7 = 0;
					if (var5 == 0) {
						return var2;
					}

					if (var5 == 1) {
						var6 = this.cd[var12[var3++]];
					}

					if (var5 == 2) {
						var6 = this.dV[var12[var3++]];
					}

					if (var5 == 3) {
						var6 = this.bt[var12[var3++]];
					}

					Widget var8;
					int var9;
					int var10;
					if (var5 == 4) {
						var8 = Widget.widgets[var12[var3++]];
						if ((var9 = var12[var3++]) >= 0
								&& var9 < ItemDefinition.count
								&& (!ItemDefinition.fromID(var9).membersObject || playingOnMembersServer)) {
							for (var10 = 0; var10 < var8.itemIds.length; ++var10) {
								if (var8.itemIds[var10] == var9 + 1) {
									var6 += var8.itemAmounts[var10];
								}
							}
						}
					}

					if (var5 == 5) {
						var6 = this.m[var12[var3++]];
					}

					if (var5 == 6) {
						var6 = dF[this.dV[var12[var3++]] - 1];
					}

					if (var5 == 7) {
						var6 = this.m[var12[var3++]] * 100 / '뜛';
					}

					if (var5 == 8) {
						var6 = localPlayer.combatLevel;
					}

					int var13;
					if (var5 == 9) {
						for (var13 = 0; var13 < 25; ++var13) {
							if (SkillConstants.SKILL_TOGGLES[var13]) {
								var6 += this.dV[var13];
							}
						}
					}

					if (var5 == 10) {
						var8 = Widget.widgets[var12[var3++]];
						if ((var9 = var12[var3++] + 1) >= 0
								&& var9 < ItemDefinition.count
								&& playingOnMembersServer) {
							for (var10 = 0; var10 < var8.itemIds.length; ++var10) {
								if (var8.itemIds[var10] == var9) {
									var6 = 999999999;
									break;
								}
							}
						}
					}

					if (var5 == 11) {
						var6 = this.fJ;
					}

					if (var5 == 12) {
						var6 = this.bB;
					}

					if (var5 == 13) {
						var13 = this.m[var12[var3++]];
						var9 = var12[var3++];
						var6 = (var13 & 1 << var9) == 0 ? 0 : 1;
					}

					if (var5 == 14) {
						var13 = var12[var3++];
						VarBits var14;
						var10 = (var14 = VarBits.bits[var13]).setting;
						var6 = var14.low;
						var13 = var14.high;
						var13 = E[var13 - var6];
						var6 = this.m[var10] >> var6 & var13;
					}

					if (var5 == 15) {
						var7 = 1;
					}

					if (var5 == 16) {
						var7 = 2;
					}

					if (var5 == 17) {
						var7 = 3;
					}

					if (var5 == 18) {
						var6 = (localPlayer.X >> 7) + this.dO;
					}

					if (var5 == 19) {
						var6 = (localPlayer.Y >> 7) + this.dP;
					}

					if (var5 == 20) {
						var6 = var12[var3++];
					}

					if (var7 == 0) {
						if (var4 == 0) {
							var2 += var6;
						}

						if (var4 == 1) {
							var2 -= var6;
						}

						if (var4 == 2 && var6 != 0) {
							var2 /= var6;
						}

						if (var4 == 3) {
							var2 *= var6;
						}

						var4 = 0;
					} else {
						var4 = var7;
					}
				}
			} catch (Exception var11) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	private void T() {
		if (this.fB >= 2 || this.hE != 0 || this.fD != 0) {
			String var1;
			if (this.hE == 1 && this.fB < 2) {
				var1 = "Use " + this.hI + " with...";
			} else if (this.fD == 1 && this.fB < 2) {
				var1 = this.fG + "...";
			} else {
				var1 = this.gw[this.fB - 1];
			}

			if (this.fB > 2) {
				var1 = var1 + "@whi@ / " + (this.fB - 2) + " more options";
			}

			this.b12_full.renderRandom(4, 16777215, var1, x / 1000, 15);
		}
	}

	private void b(Sprite var1, int var2, int var3) {
		int var4 = this.camYaw + this.gB & 2047;
		if (var1.width + var1.height + var2 * var2 + var3 * var3 <= 4850
				|| resizeMode == 0) {
			int var5 = Model.F[var4];
			var4 = Model.G[var4];
			var5 = (var5 << 8) / (this.ga + 256);
			var4 = (var4 << 8) / (this.ga + 256);
			int var6 = var3 * var5 + var2 * var4 >> 16;
			var2 = var3 * var4 - var2 * var5 >> 16;
			var1.drawSprite((resizeMode == 0 ? 124 : clientWidth + 129 - 5 - 238) + var6
					- var1.resizeWidth / 2 + 4, (resizeMode == 0 ? 88 : 91) - var2
					- var1.resizeHeight / 2 - 4);
		}
	}

	private void minimap() {
		if (resizeMode == 0) {
			this.fV.initializeRasterizer();
		}

		int var1;
		int var2;
		if (resizeMode != 0) {
			for (var1 = 0; var1 < 76; ++var1) {
				var2 = (int) Math.sqrt(Math.pow(77.0D, 2.0D)
						- Math.pow((double) (75 - var1), 2.0D));
				this.gP[var1] = 2 * var2 + 2;
				this.gP[150 - var1] = 2 * var2 + 2;
				this.ec[var1] = -var2 + 73;
				this.ec[150 - var1] = -var2 + 73;
			}
		}

		if (resizeMode == 0) {
			for (var1 = 0; var1 < 152; ++var1) {
				this.gP[var1] = 170;
				this.ec[var1] = -23;
			}
		}

		if (this.dG == 2) {
			if (resizeMode == 0) {
				Animation.spriteFromGroup("map", 2).drawSprite(0, 0);
			}

			if (resizeMode != 0) {
				Animation.spriteFromGroup("map", 4).drawSprite(
						clientWidth - 238, 3);
			}

			this.compassSprite.drawSpriteRotated(33, this.camYaw, this.eh, 256, this.cS, 25, resizeMode == 0 ? 4
					: 7, resizeMode == 0 ? 29 : clientWidth + 34 - 5 - 238, 33, 25);
			this.statOrbs();
			this.fW.initializeRasterizer();
		} else {
			var1 = this.camYaw + this.gB & 2047;
			var2 = 48 + localPlayer.X / 32;
			int var3 = 464 - localPlayer.Y / 32;
			this.hn.drawSpriteRotated(151, var1, this.gP, 256 + this.ga, this.ec, var3,
					resizeMode == 0 ? 9 : 12, resizeMode == 0 ? 54 : clientWidth + 59 - 5 - 238,
					146, var2);

			for (var1 = 0; var1 < this.es; ++var1) {
				var2 = (this.et[var1] << 2) + 2 - localPlayer.X / 32;
				var3 = (this.eu[var1] << 2) + 2 - localPlayer.Y / 32;
				this.b(this.fH[var1], var2, var3);
			}

			int var4;
			int var5;
			for (var1 = 0; var1 < 104; ++var1) {
				for (var2 = 0; var2 < 104; ++var2) {
					if (this.aR[this.cc][var1][var2] != null) {
						var4 = (var1 << 2) + 2 - localPlayer.X / 32;
						var5 = (var2 << 2) + 2 - localPlayer.Y / 32;
						this.b(this.ev, var4, var5);
					}
				}
			}

			for (var1 = 0; var1 < this.aX; ++var1) {
				Npc var12;
				if ((var12 = this.aW[this.aY[var1]]) != null
						&& var12.isVisible()) {
					ActorDefinition var13 = var12.npcDefinition;
					if (var12.npcDefinition.morphisms != null) {
						var13 = var13.morph();
					}

					if (var13 != null && var13.drawMinimapDot
							&& var13.clickable) {
						var4 = var12.X / 32 - localPlayer.X / 32;
						var5 = var12.Y / 32 - localPlayer.Y / 32;
						this.b(this.ew, var4, var5);
					}
				}
			}

			for (var1 = 0; var1 < this.bM; ++var1) {
				Player var14;
				if ((var14 = this.bL[this.bN[var1]]) != null && var14.visible) {
					var3 = var14.X / 32 - localPlayer.X / 32;
					var4 = var14.Y / 32 - localPlayer.Y / 32;
					boolean var17 = false;
					boolean var6 = false;

					for (int var7 = 0; var7 < this.bT; ++var7) {
						if (this.cH[var7] > 0L
								&& StringUtils.longToName(this.cH[var7])
										.equalsIgnoreCase(var14.name)) {
							var6 = true;
							break;
						}
					}

					long var9 = StringUtils.a(var14.name);

					for (int var11 = 0; var11 < this.bS; ++var11) {
						if (var9 == this.cG[var11] && this.aQ[var11] != 0) {
							var17 = true;
							break;
						}
					}

					boolean var18 = false;
					if (localPlayer.ao != 0 && var14.ao != 0
							&& localPlayer.ao == var14.ao) {
						var18 = true;
					}

					if (var17) {
						this.b(this.ey, var3, var4);
					} else if (var6) {
						this.b(this.clanChatSprite, var3, var4);
					} else if (var18) {
						this.b(this.ez, var3, var4);
					} else {
						this.b(this.ex, var3, var4);
					}
				}
			}

			if (this.bm != 0 && x % 20 < 10) {
				Npc var15;
				if (this.bm == 1 && this.gI >= 0 && this.gI < this.aW.length
						&& (var15 = this.aW[this.gI]) != null) {
					var2 = var15.X / 32 - localPlayer.X / 32;
					var3 = var15.Y / 32 - localPlayer.Y / 32;
					this.a(this.bv, var3, var2);
				}

				if (this.bm == 2) {
					var1 = (this.cm - this.dO << 2) + 2 - localPlayer.X / 32;
					var2 = (this.cn - this.dP << 2) + 2 - localPlayer.Y / 32;
					this.a(this.bv, var2, var1);
				}

				Player var16;
				if (this.bm == 10 && this.cl >= 0 && this.cl < this.bL.length
						&& (var16 = this.bL[this.cl]) != null) {
					var2 = var16.X / 32 - localPlayer.X / 32;
					var3 = var16.Y / 32 - localPlayer.Y / 32;
					this.a(this.bv, var3, var2);
				}
			}

			if (this.hl != 0) {
				var1 = (this.hl << 2) + 2 - localPlayer.X / 32;
				var2 = (this.hm << 2) + 2 - localPlayer.Y / 32;
				this.b(this.bu, var1, var2);
			}

			if (resizeMode != 0) {
				Animation.spriteFromGroup("map", 3).drawSprite(
						clientWidth - 238, 3);
				this.compassSprite.drawSpriteRotated(33, this.camYaw, this.eh, 256, this.cS, 25,
						resizeMode == 0 ? 4 : 7, resizeMode == 0 ? 29
								: clientWidth + 34 - 5 - 238, 33, 25);
			}

			Rasterizer2D.fillRectangle(3, (resizeMode == 0 ? 9 : 12) + 74, resizeMode == 0 ? 125
					: clientWidth + 130 - 5 - 238, 16777215, 3);
			if (resizeMode == 0) {
				Animation.spriteFromGroup("map", 0).drawSprite(0, 0);
				Animation.spriteFromGroup("map", 1).drawSpriteRotated(33, this.camYaw, this.eh,
						256, this.cS, 25, 4, 29, 33, 25);
			}

			this.statOrbs();
			if (this.bG && resizeMode == 0) {
				this.c(516, 0);
			}

			this.fW.initializeRasterizer();
		}
	}

	private void a(Actor var1, int var2) {
		this.d(var1.X, var2, var1.Y);
	}

	private void d(int var1, int var2, int var3) {
		if (var1 >= 128 && var3 >= 128 && var1 <= 13056 && var3 <= 13056) {
			var2 = this.b(this.cc, var3, var1) - var2;
			var1 -= this.bn;
			var2 -= this.bo;
			var3 -= this.bp;
			int var4 = Model.F[this.bq];
			int var5 = Model.G[this.bq];
			int var6 = Model.F[this.br];
			int var7 = Model.G[this.br];
			int var8 = var3 * var6 + var1 * var7 >> 16;
			var3 = var3 * var7 - var1 * var6 >> 16;
			var1 = var8;
			var8 = var2 * var5 - var3 * var4 >> 16;
			var3 = var2 * var4 + var3 * var5 >> 16;
			if (var3 >= 50) {
				this.cP = Rasterizer3D.e + (var1 << d) / var3;
				this.cQ = Rasterizer3D.f + (var8 << d) / var3;
			} else {
				this.cP = -1;
				this.cQ = -1;
			}
		} else {
			this.cP = -1;
			this.cQ = -1;
		}
	}

	private void statOrbs() {
		Client var1 = this;

		int var2;
		int var5;
		int var8;
		try {
			double var3 = (double) (var2 = (int) ((double) var1.fJ / 100.0D * 100.0D)) / 100.0D;
			var5 = resizeMode == 0 ? 190 : clientWidth - 250;
			int var6 = resizeMode == 0 ? 80 : 110;
			Animation.spriteFromGroup("orbs", resizeMode == 0 ? 5 : 4).drawSprite(var5,
					var6);
			Animation.spriteFromGroup("orbs", var1.ay ? 9 : 8).drawSprite(
					var5 + (resizeMode == 0 ? 3 : 27), var6 + 3);
			Sprite var7 = Animation.spriteFromGroup("orbs", 7);
			var8 = 27 - (int) (var3 * 27.0D);
			var7.height = var8;
			Rasterizer2D/* Sprite */.height = var8;
			var7.drawSprite(var5 + (resizeMode == 0 ? 3 : 27), var6 + 3);
			var1.p11_full.a(u(var2), var5 + (resizeMode == 0 ? 41 : 14), String.valueOf(var2),
					var6 + 26, true);
			Animation.spriteFromGroup("orbs", var1.ay ? 11 : 10).drawSprite(
					var5 + (resizeMode == 0 ? 9 : 32), var6 + 7);
		} catch (Exception var15) {
			;
		}

		var1 = this;

		int var16;
		int var9;
		double var10;
		Sprite var12;
		try {
			var2 = var1.cd[5];
			var8 = var1.dV[5];
			var10 = (double) (var9 = (int) ((double) var2 / (double) var8 * 100.0D)) / 100.0D;
			var16 = resizeMode == 0 ? 190 : clientWidth - 260;
			var8 = resizeMode == 0 ? 45 : 75;
			Animation.spriteFromGroup("orbs", resizeMode == 0 ? 5 : 4).drawSprite(var16,
					var8);
			Animation.spriteFromGroup("orbs", 1).drawSprite(
					var16 + (resizeMode == 0 ? 3 : 27), var8 + 3);
			var12 = Animation.spriteFromGroup("orbs", 7);
			var5 = 27 - (int) (var10 * 27.0D);
			var12.height = var5;
			Rasterizer2D/* Sprite */.height = var5;
			var12.drawSprite(var16 + (resizeMode == 0 ? 3 : 27), var8 + 3);
			var1.p11_full.a(u(var9), var16 + (resizeMode == 0 ? 41 : 14),
					String.valueOf(var2), var8 + 26, true);
			Animation.spriteFromGroup("orbs", 3).drawSprite(
					var16 + (resizeMode == 0 ? 7 : 30), var8 + 7);
		} catch (Exception var14) {
			;
		}

		var1 = this;

		try {
			var2 = var1.cd[3];
			var8 = var1.dV[3];
			var10 = (double) (var9 = (int) ((double) var2 / (double) var8 * 100.0D)) / 100.0D;
			var16 = resizeMode == 0 ? 180 : clientWidth - 250;
			var8 = resizeMode == 0 ? 10 : 40;
			Animation.spriteFromGroup("orbs", resizeMode == 0 ? 5 : 4).drawSprite(var16,
					var8);
			Animation.spriteFromGroup("orbs", 0).drawSprite(
					var16 + (resizeMode == 0 ? 3 : 27), var8 + 3);
			var12 = Animation.spriteFromGroup("orbs", 7);
			var5 = 27 - (int) (var10 * 27.0D);
			var12.height = var5;
			Rasterizer2D/* Sprite */.height = var5;
			var12.drawSprite(var16 + (resizeMode == 0 ? 3 : 27), var8 + 3);
			var1.p11_full.a(u(var9), var16 + (resizeMode == 0 ? 41 : 14),
					String.valueOf(var2), var8 + 26, true);
			Animation.spriteFromGroup("orbs", 2).drawSprite(
					var16 + (resizeMode == 0 ? 10 : 33), var8 + 10);
		} catch (Exception var13) {
			;
		}
	}

	private static int u(int var0) {
		return var0 >= 75 && var0 <= 100 ? '\uff00'
				: (var0 >= 50 && var0 <= 74 ? 16776960 : (var0 >= 25
						&& var0 <= 49 ? 16750623 : 16711680));
	}

	private void a(int var1, int var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9) {
		Class15 var10 = null;

		for (Class15 var11 = (Class15) this.gf.getBack(); var11 != null; var11 = (Class15) this.gf
				.getPrevious()) {
			if (var11.e == var7 && var11.g == var8 && var11.h == var5
					&& var11.f == var4) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			(var10 = new Class15()).e = var7;
			var10.f = var4;
			var10.g = var8;
			var10.h = var5;
			this.a(var10);
			this.gf.insertBack(var10);
		}

		var10.a = var2;
		var10.c = var6;
		var10.b = var3;
		var10.l = var9;
		var10.d = var1;
	}

	private boolean b(Widget var1) {
		if (var1.J == null) {
			return false;
		} else {
			for (int var2 = 0; var2 < var1.J.length; ++var2) {
				int var3 = this.a(var1, var2);
				int var4 = var1.f[var2];
				if (var1.J[var2] == 2) {
					if (var3 >= var4) {
						return false;
					}
				} else if (var1.J[var2] == 3) {
					if (var3 <= var4) {
						return false;
					}
				} else if (var1.J[var2] == 4) {
					if (var3 == var4) {
						return false;
					}
				} else if (var3 != var4) {
					return false;
				}
			}

			return true;
		}
	}

	private DataInputStream d(String var1) throws IOException {
		if (this.aT != null) {
			try {
				this.aT.close();
			} catch (Exception var4) {
				;
			}

			this.aT = null;
		}

		this.aT = a('ꩋ');
		this.aT.setSoTimeout(10000);
		InputStream var2 = this.aT.getInputStream();
		this.aT.getOutputStream().write(
				("JAGGRAB /" + var1 + "\n\n").getBytes());
		return new DataInputStream(var2);
	}

	private void loginScreenFrame() {
		this.prepareRasterizerForLoginScreen();
		if (this.aU == 2) {
			if (this.aI != null) {
				this.aI.a(clientWidth / 2 - this.aI.width / 2, clientHeight / 2
						- this.aI.height / 2);
			}

			if (playLoginMusic) {
				Animation.spriteFromGroup("login", 6).drawSprite(
						clientWidth - 52, 10);
			} else {
				Animation.spriteFromGroup("login", 7).drawSprite(
						clientWidth - 52, 10);
			}

			Animation.spriteFromGroup("login", 0).a(this.centerX - 145,
					this.centerY - 135);
			if (this.mouseWithinRegion(this.centerX - 110, this.centerY - 64,
					this.centerX + 115, this.centerY - 38)) {
				Animation.spriteFromGroup("login", 1).drawSprite(
						this.centerX - 110, this.centerY - 64);
			}

			if (this.mouseWithinRegion(this.centerX - 110, this.centerY - 19,
					this.centerX + 115, this.centerY + 8)) {
				Animation.spriteFromGroup("login", 1).drawSprite(
						this.centerX - 110, this.centerY - 17);
			}

			if (this.mouseWithinRegion(this.centerX - 90, this.centerY + 38,
					this.centerX + 99, this.centerY + 64)) {
				Animation.spriteFromGroup("login", 2).drawSprite(
						this.centerX - 90, this.centerY + 39);
			}

			RSFont var1 = this.p12_full;
			this.b12_full.shadow(true, this.centerX - 105, 15970623, username
					+ (this.gG == 0 & x % 40 < 20 ? "|" : ""),
					this.centerY - 43);
			this.b12_full.shadow(true, this.centerX - 105, 15970623,
					StringUtils.d(password)
							+ (this.gG == 1 & x % 40 < 20 ? "|" : ""),
					this.centerY + 5);
			this.b12_full.shadow(
					true,
					this.centerX
							- var1.getColoredTextWidth(this.hq)
							/ 2
							- (this.hq.length() > 25 ? 16
									: (this.hq.length() > 20 ? 14 : (this.hq
											.length() > 15 ? 12 : 10))),
					15970623, this.hq, this.centerY + 90);
			this.b12_full.shadow(
					true,
					this.centerX
							- var1.getColoredTextWidth(this.hr)
							/ 2
							- (this.hr.length() > 25 ? 16
									: (this.hr.length() > 20 ? 14 : (this.hr
											.length() > 15 ? 12 : 10))),
					15970623, this.hr, this.centerY + 113);
			if (c) {
				Animation.spriteFromGroup("login", 4).drawSprite(
						this.centerX - 108, this.centerY + 12);
			} else {
				Animation.spriteFromGroup("login", 3).drawSprite(
						this.centerX - 108, this.centerY + 12);
				if (this.mouseWithinRegion(this.centerX - 108,
						this.centerY + 12, this.centerX - 80, this.centerY + 24)) {
					Animation.spriteFromGroup("login", 5).drawSprite(
							this.centerX - 108, this.centerY + 12);
				}
			}

			this.b12_full.shadow(true, this.centerX - 92, 15970623, "Remember Me",
					this.centerY + 24);
			if (this.clientOutOfDate) {
				this.b12_full.shadow(true, this.centerX - 90, 16711680,
						"New Client Version available", this.centerY - 90);
			}
		}

		this.loginScreen.drawImage(0, super.frameGraphics, 0);
	}

	public final void h() {
		this.hh = true;
	}

	private void c(Buffer var1, int var2) {
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (var2 == 84) {
			var3 = var1.readUByte();
			var4 = this.hs + (var3 >> 4 & 7);
			var5 = this.ht + (var3 & 7);
			var6 = var1.readUShort();
			var7 = var1.readUShort();
			var8 = var1.readUShort();
			LinkedList var30;
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104
					&& (var30 = this.aR[this.cc][var4][var5]) != null) {
				for (Item var24 = (Item) var30.getBack(); var24 != null; var24 = (Item) var30
						.getPrevious()) {
					if (var24.itemId == (var6 & 32767)
							&& var24.itemCount == var7) {
						var24.itemCount = var8;
						break;
					}
				}

				this.b(var4, var5);
			}

		} else {
			int var9;
			if (var2 == 105) {
				var3 = var1.readUByte();
				var4 = this.hs + (var3 >> 4 & 7);
				var5 = this.ht + (var3 & 7);
				var6 = var1.readUShort();
				var8 = (var7 = var1.readUByte()) >> 4 & 15;
				var9 = var7 & 7;
				if (localPlayer.pathX[0] >= var4 - var8
						&& localPlayer.pathX[0] <= var4 + var8
						&& localPlayer.pathY[0] >= var5 - var8
						&& localPlayer.pathY[0] <= var5 + var8 && this.bg
						&& this.ek < 50) {
					this.gA[this.ek] = var6;
					this.gU[this.ek] = var9;
					this.hc[this.ek] = Track.a[var6];
					++this.ek;
				}
			}

			if (var2 == 215) {
				var3 = var1.z();
				var4 = var1.w();
				var5 = this.hs + (var4 >> 4 & 7);
				var6 = this.ht + (var4 & 7);
				var7 = var1.z();
				var8 = var1.readUShort();
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104
						&& var7 != this.bF) {
					Item var31;
					(var31 = new Item()).itemId = var3;
					var31.itemCount = var8;
					if (this.aR[this.cc][var5][var6] == null) {
						this.aR[this.cc][var5][var6] = new LinkedList();
					}

					this.aR[this.cc][var5][var6].insertBack(var31);
					this.b(var5, var6);
				}

			} else {
				Item var29;
				if (var2 == 156) {
					var3 = var1.u();
					var4 = this.hs + (var3 >> 4 & 7);
					var5 = this.ht + (var3 & 7);
					var6 = var1.readUShort();
					LinkedList var27;
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104
							&& (var27 = this.aR[this.cc][var4][var5]) != null) {
						for (var29 = (Item) var27.getBack(); var29 != null; var29 = (Item) var27
								.getPrevious()) {
							if (var29.itemId == (var6 & 32767)) {
								var29.unlink();
								break;
							}
						}

						if (var27.getBack() == null) {
							this.aR[this.cc][var4][var5] = null;
						}

						this.b(var4, var5);
					}

				} else {
					int var10;
					int var11;
					int var12;
					int var13;
					int var15;
					if (var2 == 160) {
						var3 = var1.w();
						var4 = this.hs + (var3 >> 4 & 7);
						var5 = this.ht + (var3 & 7);
						var7 = (var6 = var1.w()) >> 2;
						var8 = var6 & 3;
						var9 = this.gd[var7];
						var3 = var1.z();
						if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
							var10 = this.gE[this.cc][var4][var5];
							var11 = this.gE[this.cc][var4 + 1][var5];
							var12 = this.gE[this.cc][var4 + 1][var5 + 1];
							var13 = this.gE[this.cc][var4][var5 + 1];
							Wall var34;
							if (var9 == 0
									&& (var34 = this.scene.e(this.cc, var4,
											var5)) != null) {
								var15 = var34.hash >> 14 & 32767;
								if (var7 == 2) {
									var34.aRenderable1 = new RenderableObject(var15,
											var8 + 4, 2, var11, var12, var10,
											var13, var3, false);
									var34.aRenderable2 = new RenderableObject(var15,
											var8 + 1 & 3, 2, var11, var12,
											var10, var13, var3, false);
								} else {
									var34.aRenderable1 = new RenderableObject(var15, var8,
											var7, var11, var12, var10, var13,
											var3, false);
								}
							}

							WallDecoration var37;
							if (var9 == 1
									&& (var37 = this.scene.f(var4, var5,
											this.cc)) != null) {
								var37.renderable = new RenderableObject(
										var37.hash >> 14 & 32767, 0, 4, var11,
										var12, var10, var13, var3, false);
							}

							if (var9 == 2) {
								GameObject var36 = this.scene.g(var4, var5,
										this.cc);
								if (var7 == 11) {
									var7 = 10;
								}

								if (var36 != null) {
									var36.e = new RenderableObject(
											var36.m >> 14 & 32767, var8, var7,
											var11, var12, var10, var13, var3,
											false);
								}
							}

							GroundDecoration var35;
							if (var9 == 3
									&& (var35 = this.scene.h(var5, var4,
											this.cc)) != null) {
								var35.renderable = new RenderableObject(
										var35.key >> 14 & 32767, var8, 22, var11,
										var12, var10, var13, var3, false);
							}
						}

					} else {
						if (var2 == 147) {
							var3 = var1.w();
							var4 = this.hs + (var3 >> 4 & 7);
							var5 = this.ht + (var3 & 7);
							var6 = var1.readUShort();
							byte var22 = (byte) (128 - var1.buf[var1.position++]);
							var8 = var1.y();
							byte var23 = var1.x();
							var3 = var1.readUShort();
							var11 = (var10 = var1.w()) >> 2;
							var12 = var10 & 3;
							var13 = this.gd[var11];
							byte var14 = var1.readByte();
							var15 = var1.readUShort();
							byte var28 = var1.x();
							Player var21;
							if (var6 == this.bF) {
								var21 = localPlayer;
							} else {
								var21 = this.bL[var6];
							}

							if (var21 != null) {
								ObjectDefinition var33 = ObjectDefinition
										.byId(var15);
								int var16 = this.gE[this.cc][var4][var5];
								int var17 = this.gE[this.cc][var4 + 1][var5];
								int var18 = this.gE[this.cc][var4 + 1][var5 + 1];
								int var19 = this.gE[this.cc][var4][var5 + 1];
								Model var26;
								if ((var26 = var33.modelAt(var11, var12, var16,
										var17, var18, var19, -1)) != null) {
									this.a(var3 + 1, -1, 0, var13, var5, 0,
											this.cc, var4, var8 + 1);
									var21.av = var8 + x;
									var21.aw = var3 + x;
									var21.playerModel = var26;
									var3 = var33.width;
									var8 = var33.length;
									if (var12 == 1 || var12 == 3) {
										var3 = var33.length;
										var8 = var33.width;
									}

									var21.az = (var4 << 7) + (var3 << 6);
									var21.aB = (var5 << 7) + (var8 << 6);
									var21.aA = this.b(this.cc, var21.aB,
											var21.az);
									byte var20;
									if (var14 > var22) {
										var20 = var14;
										var14 = var22;
										var22 = var20;
									}

									if (var28 > var23) {
										var20 = var28;
										var28 = var23;
										var23 = var20;
									}

									var21.aE = var4 + var14;
									var21.aG = var4 + var22;
									var21.aF = var5 + var28;
									var21.aH = var5 + var23;
								}
							}
						}

						if (var2 == 151) {
							var3 = var1.u();
							var4 = this.hs + (var3 >> 4 & 7);
							var5 = this.ht + (var3 & 7);
							var6 = var1.y();
							var8 = (var7 = var1.w()) >> 2;
							var9 = var7 & 3;
							var3 = this.gd[var8];
							if (var4 >= 0 && var5 >= 0 && var4 < 104
									&& var5 < 104) {
								this.a(-1, var6, var9, var3, var5, var8,
										this.cc, var4, 0);
							}

						} else if (var2 == 4) {
							var3 = var1.readUByte();
							var4 = this.hs + (var3 >> 4 & 7);
							var5 = this.ht + (var3 & 7);
							var6 = var1.readUShort();
							var7 = var1.readUByte();
							var8 = var1.readUShort();
							if (var4 >= 0 && var5 >= 0 && var4 < 104
									&& var5 < 104) {
								var4 = (var4 << 7) + 64;
								var5 = (var5 << 7) + 64;
								GameAnimableObject var25 = new GameAnimableObject(
										this.cc, x, var8, var6, this.b(this.cc,
												var5, var4) - var7, var5, var4);
								this.eg.insertBack(var25);
							}

						} else if (var2 == 44) {
							var3 = var1.A();
							var4 = var1.readUShort();
							var5 = var1.readUByte();
							var6 = this.hs + (var5 >> 4 & 7);
							var7 = this.ht + (var5 & 7);
							if (var6 >= 0 && var7 >= 0 && var6 < 104
									&& var7 < 104) {
								(var29 = new Item()).itemId = var3;
								var29.itemCount = var4;
								if (this.aR[this.cc][var6][var7] == null) {
									this.aR[this.cc][var6][var7] = new LinkedList();
								}

								this.aR[this.cc][var6][var7].insertBack(var29);
								this.b(var6, var7);
							}

						} else if (var2 == 101) {
							var4 = (var3 = var1.v()) >> 2;
							var5 = var3 & 3;
							var6 = this.gd[var4];
							var7 = var1.readUByte();
							var8 = this.hs + (var7 >> 4 & 7);
							var9 = this.ht + (var7 & 7);
							if (var8 >= 0 && var9 >= 0 && var8 < 104
									&& var9 < 104) {
								this.a(-1, -1, var5, var6, var9, var4, this.cc,
										var8, 0);
							}

						} else {
							if (var2 == 117) {
								var3 = var1.readUByte();
								var4 = this.hs + (var3 >> 4 & 7);
								var5 = this.ht + (var3 & 7);
								var6 = var4 + var1.readByte();
								var7 = var5 + var1.readByte();
								var8 = var1.readShort();
								var9 = var1.readUShort();
								var3 = var1.readUByte() << 2;
								var10 = var1.readUByte() << 2;
								var11 = var1.readUShort();
								var12 = var1.readUShort();
								var13 = var1.readUByte();
								int var32 = var1.readUByte();
								if (var4 >= 0 && var5 >= 0 && var4 < 104
										&& var5 < 104 && var6 >= 0 && var7 >= 0
										&& var6 < 104 && var7 < 104
										&& var9 != '\uffff') {
									var4 = (var4 << 7) + 64;
									var5 = (var5 << 7) + 64;
									var6 = (var6 << 7) + 64;
									var7 = (var7 << 7) + 64;
									Projectile var38;
									(var38 = new Projectile(var13, var10, var11
											+ x, var12 + x, var32, this.cc,
											this.b(this.cc, var5, var4) - var3,
											var5, var4, var8, var9))
											.trackTarget(var11 + x, var7,
													this.b(this.cc, var7, var6)
															- var10, var6);
									this.projectiles.insertBack(var38);
								}
							}

						}
					}
				}
			}
		}
	}

	private void a(int var1, int var2, int var3, int var4, int var5, int var6,
			int var7) {
		if (var5 > 0 && var1 > 0 && var5 <= 102 && var1 <= 102) {
			int var8 = 0;
			if (var6 == 0) {
				var8 = this.scene.getWallKey(var2, var5, var1);
			}

			if (var6 == 1) {
				var8 = this.scene.j(var2, var5, var1);
			}

			if (var6 == 2) {
				var8 = this.scene.k(var2, var5, var1);
			}

			if (var6 == 3) {
				var8 = this.scene.l(var2, var5, var1);
			}

			int var9;
			if (var8 != 0) {
				var9 = this.scene.c(var2, var5, var1, var8);
				var8 = var8 >> 14 & 32767;
				int var10 = var9 & 31;
				var9 >>= 6;
				ObjectDefinition var11;
				if (var6 == 0) {
					this.scene.a(var5, var2, var1, (byte) -119);
					if ((var11 = ObjectDefinition.byId(var8)).solid) {
						this.gQ[var2].a(var9, var10, var11.impenetrable, var5,
								var1);
					}
				}

				if (var6 == 1) {
					this.scene.a(var1, var2, var5);
				}

				if (var6 == 2) {
					this.scene.b(var2, var5, var1);
					var11 = ObjectDefinition.byId(var8);
					if (var5 + var11.width > 103 || var1 + var11.width > 103
							|| var5 + var11.length > 103
							|| var1 + var11.length > 103) {
						return;
					}

					if (var11.solid) {
						this.gQ[var2].a(var9, var11.width, var5, var1,
								var11.length, var11.impenetrable);
					}
				}

				if (var6 == 3) {
					this.scene.c(var2, var1, var5);
					if ((var11 = ObjectDefinition.byId(var8)).solid
							&& var11.interactive) {
						CollisionMap var12 = this.gQ[var2];
						var12.adjacencies[var5][var1] &= 14680063;
					}
				}
			}

			if (var7 >= 0) {
				var9 = var2;
				if (var2 < 3 && (this.hj[1][var5][var1] & 2) == 2) {
					var9 = var2 + 1;
				}

				MapRegion.placeObject(this.scene, var3, var1, var4, var9, this.gQ[var2],
						this.gE, var5, var7, var2);
			}
		}

	}

	private void b(int var1, Buffer var2) {
		this.aZ = 0;
		this.bO = 0;
		var2.p();
		int var6;
		int var7;
		int var9;
		int var10;
		if (var2.i(1) != 0) {
			if ((var6 = var2.i(2)) == 0) {
				this.bP[this.bO++] = 2047;
			} else if (var6 == 1) {
				var7 = var2.i(3);
				localPlayer.move(false, var7);
				if (var2.i(1) == 1) {
					this.bP[this.bO++] = 2047;
				}
			} else if (var6 == 2) {
				var7 = var2.i(3);
				localPlayer.move(true, var7);
				int var8 = var2.i(3);
				localPlayer.move(true, var8);
				if (var2.i(1) == 1) {
					this.bP[this.bO++] = 2047;
				}
			} else if (var6 == 3) {
				this.cc = var2.i(2);
				var7 = var2.i(1);
				if (var2.i(1) == 1) {
					this.bP[this.bO++] = 2047;
				}

				var9 = var2.i(7);
				var10 = var2.i(7);
				localPlayer.setPosition(var10, var9, var7 == 1);
			}
		}

		Buffer var3 = var2;
		Client var4 = this;
		int var5;
		if ((var5 = var2.i(8)) < this.bM) {
			for (var6 = var5; var6 < var4.bM; ++var6) {
				var4.ba[var4.aZ++] = var4.bN[var6];
			}
		}

		if (var5 > var4.bM) {
			SignLink.reportError(username + " Too many players");
			throw new RuntimeException("eek");
		} else {
			var4.bM = 0;

			for (var6 = 0; var6 < var5; ++var6) {
				var7 = var4.bN[var6];
				Player var13 = var4.bL[var7];
				if (var3.i(1) == 0) {
					var4.bN[var4.bM++] = var7;
					var13.K = x;
				} else if ((var10 = var3.i(2)) == 0) {
					var4.bN[var4.bM++] = var7;
					var13.K = x;
					var4.bP[var4.bO++] = var7;
				} else if (var10 == 1) {
					var4.bN[var4.bM++] = var7;
					var13.K = x;
					var9 = var3.i(3);
					var13.move(false, var9);
					if (var3.i(1) == 1) {
						var4.bP[var4.bO++] = var7;
					}
				} else if (var10 == 2) {
					var4.bN[var4.bM++] = var7;
					var13.K = x;
					var9 = var3.i(3);
					var13.move(true, var9);
					var9 = var3.i(3);
					var13.move(true, var9);
					if (var3.i(1) == 1) {
						var4.bP[var4.bO++] = var7;
					}
				} else if (var10 == 3) {
					var4.ba[var4.aZ++] = var7;
				}
			}

			this.b(var2, var1);
			this.a(var2);

			int var12;
			for (var12 = 0; var12 < this.aZ; ++var12) {
				int var11 = this.ba[var12];
				if (this.bL[var11].K != x) {
					this.bL[var11] = null;
				}
			}

			if (var2.position != var1) {
				SignLink.reportError("Error packet size mismatch in getplayer pos:"
						+ var2.position + " psize:" + var1);
				throw new RuntimeException("eek");
			} else {
				for (var12 = 0; var12 < this.bM; ++var12) {
					if (this.bL[this.bN[var12]] == null) {
						SignLink.reportError(username
								+ " null entry in pl list - pos:" + var12
								+ " size:" + this.bM);
						throw new RuntimeException("eek");
					}
				}

			}
		}
	}

	private static void a(String var0, int var1) {
		Widget.widgets[var1].defaultText = var0;
		int var10000 = Widget.widgets[var1].parent;
	}

	private void h(int var1, int var2) {
		this.dW[429] = var2;
		if (this.m[429] != var2) {
			this.m[429] = var2;
			this.j(429);
			if (this.dU != -1) {
				D = true;
			}
		}

	}

	private boolean X() {
		if (this.fZ == null) {
			return false;
		} else {
			String var1;
			int var2;
			try {
				int var62;
				if ((var62 = this.fZ.c()) == 0) {
					return false;
				}

				if (this.dv == -1) {
					this.fZ.a(this.eE.buf, 1);
					this.dv = this.eE.buf[0] & 255;
					if (this.dp != null) {
						this.dv = this.dv - this.dp.a() & 255;
					}

					this.du = Class54.a[this.dv];
					--var62;
				}

				if (this.du == -1) {
					if (var62 <= 0) {
						return false;
					}

					this.fZ.a(this.eE.buf, 1);
					this.du = this.eE.buf[0] & 255;
					--var62;
				}

				if (this.du == -2) {
					if (var62 <= 1) {
						return false;
					}

					this.fZ.a(this.eE.buf, 2);
					this.eE.position = 0;
					this.du = this.eE.readUShort();
					var62 -= 2;
				}

				if (var62 < this.du) {
					return false;
				}

				this.eE.position = 0;
				this.fZ.a(this.eE.buf, this.du);
				this.dw = 0;
				this.bd = this.bc;
				this.bc = this.bb;
				this.bb = this.dv;
				int var3;
				int var4;
				int var8;
				int var9;
				int var10;
				int var12;
				int var13;
				int var14;
				int var29;
				int var38;
				int var39;
				int var42;
				int var43;
				int var46;
				int var44;
				int var45;
				int var48;
				int var53;
				boolean var71;
				String var64;
				String var65;
				int var67;
				switch (this.dv) {
				case 1:
					int var79;
					for (var79 = 0; var79 < this.bL.length; ++var79) {
						if (this.bL[var79] != null) {
							this.bL[var79].animation = -1;
						}
					}

					for (var79 = 0; var79 < this.aW.length; ++var79) {
						if (this.aW[var79] != null) {
							this.aW[var79].animation = -1;
						}
					}

					this.dv = -1;
					return true;
				case 4:
				case 44:
				case 84:
				case 101:
				case 105:
				case 117:
				case 147:
				case 151:
				case 156:
				case 160:
				case 215:
					this.c(this.eE, this.dv);
					this.dv = -1;
					return true;
				case 8:
					int var85 = this.eE.A();
					var29 = this.eE.readUShort();
					Widget.widgets[var85].defaultMediaType = 1;
					Widget.widgets[var85].defaultMedia = var29;
					this.dv = -1;
					return true;
				case 24:
					this.ee = this.eE.w();
					if (this.ee == C) {
						if (this.ee == 3) {
							C = 1;
						} else {
							C = 3;
						}
					}

					this.dv = -1;
					return true;
				case 27:
					this.hi = false;
					this.gJ = 1;
					this.dr = "";
					D = true;
					this.dv = -1;
					return true;
				case 34:
					int var51 = this.eE.readUShort();
					Widget var52 = Widget.widgets[var51];

					while (this.eE.position < this.du) {
						var53 = this.eE.s();
						int var54 = this.eE.readUShort();
						int var55;
						if ((var55 = this.eE.readUByte()) == 255) {
							var55 = this.eE.readInt();
						}

						if (var53 >= 0 && var53 < var52.itemIds.length) {
							var52.itemIds[var53] = var54;
							var52.itemAmounts[var53] = var55;
						}
					}

					this.dv = -1;
					return true;
				case 35:
					var13 = this.eE.readUByte();
					var14 = this.eE.readUByte();
					var62 = this.eE.readUByte();
					var2 = this.eE.readUByte();
					this.by[var13] = true;
					this.bx[var13] = var14;
					this.gz[var13] = var62;
					this.ch[var13] = var2;
					this.dL[var13] = 0;
					this.dv = -1;
					return true;
				case 36:
					var46 = this.eE.y();
					byte var86 = this.eE.readByte();
					this.dW[var46] = var86;
					if (this.m[var46] != var86) {
						this.m[var46] = var86;
						this.j(var46);
						if (this.dU != -1) {
							D = true;
						}
					}

					this.dv = -1;
					return true;
				case 50:
					long var19 = this.eE.m();
					int var21 = this.eE.readUByte();
					var65 = StringUtils.formatName(StringUtils
							.longToName(var19));

					for (var3 = 0; var3 < this.bS; ++var3) {
						if (var19 == this.cG[var3]) {
							if (this.aQ[var3] != var21) {
								this.aQ[var3] = var21;
								if (var21 >= 2) {
									this.a(var65 + " has logged in.", 5, "");
								}

								if (var21 <= 1) {
									this.a(var65 + " has logged out.", 5, "");
								}
							}

							var65 = null;
						}
					}

					if (var65 != null && this.bS < 200) {
						this.cG[this.bS] = var19;
						this.eD[this.bS] = var65;
						this.aQ[this.bS] = var21;
						++this.bS;
					}

					var71 = false;

					while (!var71) {
						var71 = true;

						for (var62 = 0; var62 < this.bS - 1; ++var62) {
							if (this.aQ[var62] != cK
									&& this.aQ[var62 + 1] == cK
									|| this.aQ[var62] == 0
									&& this.aQ[var62 + 1] != 0) {
								var2 = this.aQ[var62];
								this.aQ[var62] = this.aQ[var62 + 1];
								this.aQ[var62 + 1] = var2;
								var64 = this.eD[var62];
								this.eD[var62] = this.eD[var62 + 1];
								this.eD[var62 + 1] = var64;
								long var22 = this.cG[var62];
								this.cG[var62] = this.cG[var62 + 1];
								this.cG[var62 + 1] = var22;
								var71 = false;
							}
						}
					}

					this.dv = -1;
					return true;
				case 53:
					int var35 = this.eE.readUShort();
					Widget var36 = Widget.widgets[var35];
					int var37 = this.eE.readUShort();

					for (var38 = 0; var38 < var37; ++var38) {
						if ((var39 = this.eE.readUByte()) == 255) {
							var39 = this.eE.E();
						}

						var36.itemIds[var38] = this.eE.A();
						var36.itemAmounts[var38] = var39;
					}

					for (var38 = var37; var38 < var36.itemIds.length; ++var38) {
						var36.itemIds[var38] = 0;
						var36.itemAmounts[var38] = 0;
					}

					this.dv = -1;
					return true;
				case 60:
					this.ht = this.eE.readUByte();
					this.hs = this.eE.v();

					while (this.eE.position < this.du) {
						var13 = this.eE.readUByte();
						this.c(this.eE, var13);
					}

					this.dv = -1;
					return true;
				case 61:
					this.ef = this.eE.readUByte();
					this.dv = -1;
					return true;
				case 64:
					this.hs = this.eE.v();
					this.ht = this.eE.w();

					for (var62 = this.hs; var62 < this.hs + 8; ++var62) {
						for (var2 = this.ht; var2 < this.ht + 8; ++var2) {
							if (this.aR[this.cc][var62][var2] != null) {
								this.aR[this.cc][var62][var2] = null;
								this.b(var62, var2);
							}
						}
					}

					for (Class15 var84 = (Class15) this.gf.getBack(); var84 != null; var84 = (Class15) this.gf
							.getPrevious()) {
						if (var84.g >= this.hs && var84.g < this.hs + 8
								&& var84.h >= this.ht && var84.h < this.ht + 8
								&& var84.e == this.cc) {
							var84.d = 0;
						}
					}

					this.dv = -1;
					return true;
				case 65:
					this.a(this.eE, this.du);
					this.dv = -1;
					return true;
				case 68:
					for (int var25 = 0; var25 < this.m.length; ++var25) {
						if (this.m[var25] != this.dW[var25]) {
							this.m[var25] = this.dW[var25];
							this.j(var25);
						}
					}

					this.dv = -1;
					return true;
				case 70:
					var62 = this.eE.readShort();
					var2 = this.eE.B();
					var3 = this.eE.y();
					Widget var82;
					(var82 = Widget.widgets[var3]).Y = var62;
					var82.Z = var2;
					this.dv = -1;
					return true;
				case 71:
					var9 = this.eE.readUShort();
					var10 = this.eE.u();
					if (var9 == '\uffff') {
						var9 = -1;
					}

					u[var10] = var9;
					fh = true;
					this.dv = -1;
					return true;
				case 72:
					var2 = this.eE.y();
					Widget var83 = Widget.widgets[var2];

					for (var3 = 0; var3 < var83.itemIds.length; ++var3) {
						var83.itemIds[var3] = -1;
						var83.itemIds[var3] = 0;
					}

					this.dv = -1;
					return true;
				case 73:
				case 241:
					var62 = this.eq;
					var2 = this.er;
					if (this.dv == 73) {
						var62 = this.eE.z();
						var2 = this.eE.readUShort();
						this.fS = false;
					}

					if (this.dv == 241) {
						var2 = this.eE.z();
						this.eE.p();
						var62 = 0;

						while (true) {
							if (var62 >= 4) {
								this.eE.q();
								var62 = this.eE.readUShort();
								this.fS = true;
								break;
							}

							for (var3 = 0; var3 < 13; ++var3) {
								for (var4 = 0; var4 < 13; ++var4) {
									if (this.eE.i(1) == 1) {
										this.fz[var62][var3][var4] = this.eE
												.i(26);
									} else {
										this.fz[var62][var3][var4] = -1;
									}
								}
							}

							++var62;
						}
					}

					if (this.eq == var62 && this.er == var2 && this.dH == 2) {
						this.dv = -1;
						return true;
					}

					this.eq = var62;
					this.er = var2;
					this.dO = this.eq - 6 << 3;
					this.dP = this.er - 6 << 3;
					this.fI = (this.eq / 8 == 48 || this.eq / 8 == 49)
							&& this.er / 8 == 48;
					if (this.eq / 8 == 48 && this.er / 8 == 148) {
						this.fI = true;
					}

					this.dH = 1;
					this.aO = System.currentTimeMillis();
					this.fW.initializeRasterizer();
					var62 = resizeMode == 0 ? 200 : clientWidth / 2 - 55;
					var3 = resizeMode == 0 ? 150 : clientHeight / 2 - 45;
					Rasterizer2D.drawRectangle(var62, 130, 22, 16777215, var3);
					Rasterizer2D.fillRectangle(20, var3 + 1, var62 + 1, 0, 128);
					this.p12_full.a(0, "Loading - please wait.", var3 + 18,
							var62 + 68);
					this.p12_full.a(16777215, "Loading - please wait.", var3 + 17,
							var62 + 67);
					this.fW.drawImage(resizeMode == 0 ? 4 : 0, super.frameGraphics,
							resizeMode == 0 ? 4 : 0);
					if (this.dv == 73) {
						var4 = 0;
						var67 = (this.eq - 6) / 8;

						label1193: while (true) {
							if (var67 > (this.eq + 6) / 8) {
								this.gj = new byte[var4][];
								this.ha = new byte[var4][];
								this.gR = new int[var4];
								this.gS = new int[var4];
								this.gT = new int[var4];
								var4 = 0;
								var67 = (this.eq - 6) / 8;

								while (true) {
									if (var67 > (this.eq + 6) / 8) {
										break label1193;
									}

									for (var62 = (this.er - 6) / 8; var62 <= (this.er + 6) / 8; ++var62) {
										this.gR[var4] = (var67 << 8) + var62;
										if (this.fI
												&& (var62 == 49 || var62 == 149
														|| var62 == 147
														|| var67 == 50 || var67 == 49
														&& var62 == 47)) {
											this.gS[var4] = -1;
											this.gT[var4] = -1;
										} else {
											if ((var2 = this.gS[var4] = this.resourceProvider
													.a(0, var62, var67)) != -1) {
												this.resourceProvider.provide(
														3, var2);
											}

											if ((var3 = this.gT[var4] = this.resourceProvider
													.a(1, var62, var67)) != -1) {
												this.resourceProvider.provide(
														3, var3);
											}
										}

										++var4;
									}

									++var67;
								}
							}

							for (var62 = (this.er - 6) / 8; var62 <= (this.er + 6) / 8; ++var62) {
								++var4;
							}

							++var67;
						}
					}

					if (this.dv == 241) {
						var4 = 0;
						int[] var70 = new int[676];
						var62 = 0;

						label1154: while (true) {
							int var11;
							if (var62 >= 4) {
								this.gj = new byte[var4][];
								this.ha = new byte[var4][];
								this.gR = new int[var4];
								this.gS = new int[var4];
								this.gT = new int[var4];
								var62 = 0;

								while (true) {
									if (var62 >= var4) {
										break label1154;
									}

									var3 = (var2 = this.gR[var62] = var70[var62]) >> 8 & 255;
									var8 = var2 & 255;
									if ((var11 = this.gS[var62] = this.resourceProvider
											.a(0, var8, var3)) != -1) {
										this.resourceProvider.provide(3, var11);
									}

									if ((var9 = this.gT[var62] = this.resourceProvider
											.a(1, var8, var3)) != -1) {
										this.resourceProvider.provide(3, var9);
									}

									++var62;
								}
							}

							for (var2 = 0; var2 < 13; ++var2) {
								for (var3 = 0; var3 < 13; ++var3) {
									if ((var8 = this.fz[var62][var2][var3]) != -1) {
										var11 = var8 >> 14 & 1023;
										var9 = var8 >> 3 & 2047;
										var10 = (var11 / 8 << 8) + var9 / 8;

										for (var12 = 0; var12 < var4; ++var12) {
											if (var70[var12] == var10) {
												var10 = -1;
											}
										}

										if (var10 != -1) {
											var70[var4++] = var10;
										}
									}
								}
							}

							++var62;
						}
					}

					var4 = this.dO - this.dQ;
					var67 = this.dP - this.dR;
					this.dQ = this.dO;
					this.dR = this.dP;

					for (var62 = 0; var62 < 16384; ++var62) {
						Npc var74;
						if ((var74 = this.aW[var62]) != null) {
							for (var3 = 0; var3 < 10; ++var3) {
								var74.pathX[var3] -= var4;
								var74.pathY[var3] -= var67;
							}

							var74.X -= var4 << 7;
							var74.Y -= var67 << 7;
						}
					}

					for (var62 = 0; var62 < 2048; ++var62) {
						Player var75;
						if ((var75 = this.bL[var62]) != null) {
							for (var3 = 0; var3 < 10; ++var3) {
								var75.pathX[var3] -= var4;
								var75.pathY[var3] -= var67;
							}

							var75.X -= var4 << 7;
							var75.Y -= var67 << 7;
						}
					}

					this.eC = true;
					byte var80 = 0;
					byte var78 = 104;
					byte var81 = 1;
					if (var4 < 0) {
						var80 = 103;
						var78 = -1;
						var81 = -1;
					}

					byte var72 = 0;
					byte var76 = 104;
					byte var73 = 1;
					if (var67 < 0) {
						var72 = 103;
						var76 = -1;
						var73 = -1;
					}

					for (var10 = var80; var10 != var78; var10 += var81) {
						for (var12 = var72; var12 != var76; var12 += var73) {
							var62 = var10 + var4;
							var13 = var12 + var67;

							for (var14 = 0; var14 < 4; ++var14) {
								if (var62 >= 0 && var13 >= 0 && var62 < 104
										&& var13 < 104) {
									this.aR[var14][var10][var12] = this.aR[var14][var62][var13];
								} else {
									this.aR[var14][var10][var12] = null;
								}
							}
						}
					}

					for (Class15 var77 = (Class15) this.gf.getBack(); var77 != null; var77 = (Class15) this.gf
							.getPrevious()) {
						var77.g -= var4;
						var77.h -= var67;
						if (var77.g < 0 || var77.h < 0 || var77.g >= 104
								|| var77.h >= 104) {
							var77.unlink();
						}
					}

					if (this.hl != 0) {
						this.hl -= var4;
						this.hm -= var67;
					}

					this.fT = false;
					this.dv = -1;
					return true;
				case 74:
					if ((var8 = this.eE.y()) == '\uffff') {
						var8 = -1;
					}

					if (var8 != this.cJ && playMusic && this.loopMusic == 0) {
						this.requestedSong = var8;
						this.gM = true;
						this.resourceProvider.provide(2, this.requestedSong);
					}

					this.cJ = var8;
					this.dv = -1;
					return true;
				case 75:
					var12 = this.eE.A();
					var62 = this.eE.A();
					Widget.widgets[var62].defaultMediaType = 2;
					Widget.widgets[var62].defaultMedia = var12;
					this.dv = -1;
					return true;
				case 78:
					this.hl = 0;
					this.dv = -1;
					return true;
				case 79:
					var2 = this.eE.y();
					var3 = this.eE.z();
					Widget var24;
					if ((var24 = Widget.widgets[var2]) != null && var24.group == 0) {
						if (var3 < 0) {
							var3 = 0;
						}

						if (var3 > var24.W - var24.height) {
							var3 = var24.W - var24.height;
						}

						var24.q = var3;
					}

					this.dv = -1;
					return true;
				case 81:
					this.b(this.du, this.eE);
					this.eC = false;
					this.dv = -1;
					return true;
				case 85:
					this.ht = this.eE.v();
					this.hs = this.eE.v();
					this.dv = -1;
					return true;
				case 87:
					var44 = this.eE.y();
					var45 = this.eE.D();
					this.dW[var44] = var45;
					if (this.m[var44] != var45) {
						this.m[var44] = var45;
						this.j(var44);
						if (this.dU != -1) {
							D = true;
						}
					}

					this.dv = -1;
					return true;
				case 97:
					var42 = this.eE.readUShort();
					this.m(var42);
					if (this.gp != -1) {
						this.gp = -1;
						fh = true;
					}

					if (this.hA != -1) {
						this.hA = -1;
						D = true;
					}

					if (this.gJ != 0) {
						this.gJ = 0;
						D = true;
					}

					j = var42;
					this.fK = false;
					this.L();
					this.e(0, 0);
					this.dv = -1;
					return true;
				case 99:
					this.dG = this.eE.readUByte();
					this.dv = -1;
					return true;
				case 104:
					var62 = this.eE.v();
					var2 = this.eE.u();
					var64 = this.eE.readString();
					if (var62 > 0 && var62 <= 5) {
						if (var64.equalsIgnoreCase("null")) {
							var64 = null;
						}

						this.fx[var62 - 1] = var64;
						this.fy[var62 - 1] = var2 == 0;
					}

					this.dv = -1;
					return true;
				case 106:
					C = this.eE.v();
					fh = true;
					this.dv = -1;
					return true;
				case 107:
					this.fT = false;

					for (var2 = 0; var2 < 5; ++var2) {
						this.by[var2] = false;
					}

					this.dv = -1;
					return true;
				case 109:
					this.s();
					this.dv = -1;
					return false;
				case 110:
					this.fJ = this.eE.readUByte();
					this.dv = -1;
					return true;
				case 114:
					this.fi = this.eE.y() * 30;
					this.dv = -1;
					return true;
				case 121:
					var62 = this.eE.A();
					var2 = this.eE.z();
					if (playMusic) {
						this.requestedSong = var62;
						this.gM = false;
						this.resourceProvider.provide(2, this.requestedSong);
						this.loopMusic = var2;
					}

					this.dv = -1;
					return true;
				case 122:
					int var30 = this.eE.A();
					int var31;
					int var32 = (var31 = this.eE.A()) >> 10 & 31;
					int var33 = var31 >> 5 & 31;
					int var34 = var31 & 31;
					Widget.widgets[var30].defaultColor = (var32 << 19) + (var33 << 11)
							+ (var34 << 3);
					this.dv = -1;
					return true;
				case 126:
					try {
						String var28 = this.eE.readString();
						var29 = this.eE.z();
						a(var28, var29);
					} catch (Exception var56) {
						;
					}

					this.dv = -1;
					return true;
				case 134:
					var3 = this.eE.readUByte();
					var4 = this.eE.D();
					var67 = this.eE.readUByte();
					if (this.xpDrops && var3 >= 0 && this.bt[var3] >= 0
							&& var4 > this.bt[var3]
							&& (var9 = Math.abs(var4 - this.bt[var3])) > 0) {
						this.f(var3, var9);
					}

					this.bt[var3] = var4;
					this.cd[var3] = var67;
					this.dV[var3] = 1;

					for (var9 = 0; var9 < 98; ++var9) {
						if (var4 >= dF[var9]) {
							this.dV[var3] = var9 + 2;
						}
					}

					this.dv = -1;
					return true;
				case 142:
					var62 = this.eE.y();
					this.m(var62);
					if (this.hA != -1) {
						this.hA = -1;
						D = true;
					}

					if (this.gJ != 0) {
						this.gJ = 0;
						D = true;
					}

					this.gp = var62;
					fh = true;
					j = -1;
					this.fK = false;
					this.dv = -1;
					return true;
				case 164:
					var53 = this.eE.y();
					this.m(var53);
					if (this.gp != -1) {
						this.gp = -1;
						fh = true;
					}

					this.hA = var53;
					D = true;
					j = -1;
					this.fK = false;
					this.dv = -1;
					return true;
				case 166:
					this.fT = true;
					this.fc = this.eE.readUByte();
					this.fd = this.eE.readUByte();
					this.fe = this.eE.readUShort();
					this.ff = this.eE.readUByte();
					this.fg = this.eE.readUByte();
					if (this.fg >= 100) {
						this.bn = (this.fc << 7) + 64;
						this.bp = (this.fd << 7) + 64;
						this.bo = this.b(this.cc, this.bp, this.bn) - this.fe;
					}

					this.dv = -1;
					return true;
				case 171:
					var71 = this.eE.readUByte() == 1;
					var62 = this.eE.readUShort();
					Widget.widgets[var62].aa = var71;
					this.dv = -1;
					return true;
				case 174:
					var62 = this.eE.readUShort();
					var2 = this.eE.readUByte();
					var3 = this.eE.readUShort();
					if (this.bg && this.ek < 50) {
						this.gA[this.ek] = var62;
						this.gU[this.ek] = var2;
						this.hc[this.ek] = var3 + Track.a[var62];
						++this.ek;
					}

					this.dv = -1;
					return true;
				case 176:
					this.fY = this.eE.v();
					this.fO = this.eE.z();
					this.ft = this.eE.readUByte();
					this.gt = this.eE.E();
					this.dt = this.eE.readUShort();
					if (this.gt != 0 && j == -1) {
						SignLink.a(StringUtils.a(this.gt));
						this.Y();
						short var69 = 650;
						if (this.fY != 201 || this.ft == 1) {
							var69 = 655;
						}

						this.bE = "";
						this.fR = false;

						for (var2 = 0; var2 < Widget.widgets.length; ++var2) {
							if (Widget.widgets[var2] != null
									&& Widget.widgets[var2].contentType == var69) {
								j = Widget.widgets[var2].parent;
							}
						}
					}

					this.dv = -1;
					return true;
				case 177:
					this.fT = true;
					this.dk = this.eE.readUByte();
					this.dl = this.eE.readUByte();
					this.dm = this.eE.readUShort();
					this.dn = this.eE.readUByte();
					this.do_ = this.eE.readUByte();
					if (this.do_ >= 100) {
						var42 = (this.dk << 7) + 64;
						var43 = (this.dl << 7) + 64;
						var44 = this.b(this.cc, var43, var42) - this.dm;
						var45 = var42 - this.bn;
						var46 = var44 - this.bo;
						int var47 = var43 - this.bp;
						var48 = (int) Math.sqrt((double) (var45 * var45 + var47
								* var47));
						this.bq = (int) (Math.atan2((double) var46,
								(double) var48) * 325.949D) & 2047;
						this.br = (int) (Math.atan2((double) var45,
								(double) var47) * -325.949D) & 2047;
						if (this.bq < 128) {
							this.bq = 128;
						}

						if (this.bq > 383) {
							this.bq = 383;
						}
					}

					this.dv = -1;
					return true;
				case 185:
					var62 = this.eE.A();
					Widget.widgets[var62].defaultMediaType = 3;
					if (localPlayer.al == null) {
						Widget.widgets[var62].defaultMedia = (localPlayer.appearanceColors[0] << 25)
								+ (localPlayer.appearanceColors[4] << 20)
								+ (localPlayer.appearance[0] << 15)
								+ (localPlayer.appearance[8] << 10)
								+ (localPlayer.appearance[11] << 5)
								+ localPlayer.appearance[1];
					} else {
						Widget.widgets[var62].defaultMedia = (int) (305419896L + localPlayer.al.id);
					}

					this.dv = -1;
					return true;
				case 187:
					this.hi = false;
					this.gJ = 2;
					this.dr = "";
					D = true;
					this.dv = -1;
					return true;
				case 196:
					long var26 = this.eE.m();
					this.eE.readInt();
					var62 = this.eE.readUByte();
					var2 = this.eE.readUByte();
					var71 = false;
					if (var62 <= 1) {
						for (var4 = 0; var4 < this.aN; ++var4) {
							if (this.cf[var4] == var26) {
								var71 = true;
							}
						}
					}

					if (!var71 && this.he == 0) {
						try {
							String var66 = ChatMessageCodec.a(this.du - 14,
									this.eE);
							var65 = var2 > 0 ? h(var2) : "";
							if (var62 > 0 && var62 <= 3) {
								this.a(var66,
										7,
										var65
												+ StringUtils.formatName(StringUtils
														.longToName(var26)),
										var62);
							} else {
								this.a(var66,
										3,
										var65
												+ StringUtils.formatName(StringUtils
														.longToName(var26)),
										var62);
							}
						} catch (Exception var58) {
							SignLink.reportError("cde1");
						}
					}

					this.dv = -1;
					return true;
				case 200:
					var48 = this.eE.readUShort();
					int var49 = this.eE.readShort();
					Widget var50;
					(var50 = Widget.widgets[var48]).defaultAnimationId = var49;
					if (var49 == -1) {
						var50.K = 0;
						var50.c = 0;
					}

					this.dv = -1;
					return true;
				case 206:
					this.G = this.eE.readUByte();
					this.i = this.eE.readUByte();
					this.F = this.eE.readUByte();
					D = true;
					this.dv = -1;
					return true;
				case 208:
					if ((var10 = this.eE.B()) >= 0) {
						this.m(var10);
					}

					this.dE = var10;
					this.L();
					this.e(0, 0);
					this.dv = -1;
					return true;
				case 213:
					this.bT = this.eE.readUByte();
					if (this.bT > 0) {
						for (var3 = 0; var3 < this.bT; ++var3) {
							this.cH[var3] = this.eE.m();
							this.cI[var3] = this.eE.readUByte();
						}
					}

					this.dv = -1;
					return true;
				case 214:
					this.aN = this.du / 8;
					if (this.aN > 0) {
						for (var3 = 0; var3 < this.aN; ++var3) {
							this.cf[var3] = this.eE.m();
						}
					}

					this.dv = -1;
					return true;
				case 216:
					try {
						this.aC = this.eE.readString();
						var65 = this.eE.readString();
						var1 = this.eE.readString();
						var3 = this.eE.readUByte();
						if ((var4 = this.eE.readUByte()) > 0) {
							this.a(var1, 16,
									h(var4) + StringUtils.formatName(var65),
									var3);
						} else {
							this.a(var1, 16, StringUtils.formatName(var65),
									var3);
						}
					} catch (Exception var57) {
						var57.printStackTrace();
					}

					this.dv = -1;
					return true;
				case 217:
					try {
						this.aD = this.eE.readString();
						var65 = this.eE.readString();
						var1 = this.eE.readString();
						var3 = this.eE.readUByte();
						var4 = this.eE.readUByte();
						boolean var5 = false;
						long var6 = StringUtils.a(var65);

						for (var8 = 0; var8 < this.aN; ++var8) {
							if (this.cf[var8] == var6) {
								var5 = true;
							}
						}

						if (!var5) {
							if (var4 > 0) {
								this.a(var1,
										9,
										h(var4) + StringUtils.formatName(var65),
										var3);
							} else {
								this.a(var1, 9, StringUtils.formatName(var65),
										var3);
							}
						}
					} catch (Exception var59) {
						var59.printStackTrace();
					}

					this.dv = -1;
					return true;
				case 218:
					var43 = this.eE.C();
					this.dU = var43;
					D = true;
					this.dv = -1;
					return true;
				case 219:
					if (this.gp != -1) {
						this.gp = -1;
						fh = true;
					}

					if (this.hA != -1) {
						this.hA = -1;
						D = true;
					}

					if (this.gJ != 0) {
						this.gJ = 0;
						D = true;
					}

					j = -1;
					this.fK = false;
					this.L();
					this.e(0, 0);
					this.dv = -1;
					return true;
				case 221:
					this.bU = this.eE.readUByte();
					this.dv = -1;
					return true;
				case 230:
					var38 = this.eE.z();
					var39 = this.eE.readUShort();
					int var40 = this.eE.readUShort();
					int var41 = this.eE.A();
					Widget.widgets[var39].spritePitch = var40;
					Widget.widgets[var39].spriteRoll = var41;
					Widget.widgets[var39].spriteScale = var38;
					this.dv = -1;
					return true;
				case 240:
					this.bB = this.eE.readShort();
					this.dv = -1;
					return true;
				case 246:
					var4 = this.eE.y();
					var2 = this.eE.readUShort();
					if ((var62 = this.eE.readUShort()) == '\uffff') {
						Widget.widgets[var4].defaultMediaType = 0;
						this.dv = -1;
						return true;
					}

					ItemDefinition var68 = ItemDefinition.fromID(var62);
					Widget.widgets[var4].defaultMediaType = 4;
					Widget.widgets[var4].defaultMedia = var62;
					Widget.widgets[var4].spritePitch = var68.spritePitch;
					Widget.widgets[var4].spriteRoll = var68.spriteCameraRoll;
					Widget.widgets[var4].spriteScale = var68.spriteScale * 100 / var2;
					this.dv = -1;
					return true;
				case 248:
					var3 = this.eE.z();
					var62 = this.eE.readUShort();
					if (this.hA != -1) {
						this.hA = -1;
						D = true;
					}

					if (this.gJ != 0) {
						this.gJ = 0;
						D = true;
					}

					if (!this.eP) {
						this.eP = true;
					}

					j = var3;
					this.gp = var62;
					fh = true;
					this.fK = false;
					this.dv = -1;
					return true;
				case 249:
					this.dX = this.eE.u();
					this.bF = this.eE.A();
					this.dv = -1;
					return true;
				case 253:
					var1 = this.eE.readString();
					boolean var63 = this.eE.readUByte() == 1;
					String var15;
					long var16;
					if (var1.endsWith(":tradereq:")) {
						var16 = StringUtils.a(var15 = var1.substring(0,
								var1.indexOf(":")));
						var63 = false;

						for (var3 = 0; var3 < this.aN; ++var3) {
							if (this.cf[var3] == var16) {
								var63 = true;
							}
						}

						if (!var63 && this.he == 0) {
							this.a("wishes to trade with you.", 4, var15);
						}
					} else if (var1.endsWith(":clan:")) {
						StringUtils.a(var15 = var1.substring(0,
								var1.indexOf(":")));
						this.a("Clan: ", 8, var15);
					} else if (var1.endsWith("$link$") && var1.contains("+")) {
						var15 = var1.substring(0, var1.indexOf("+"));
						String var18 = (var1 = var1.substring(
								var15.length() + 1).trim()).substring(0,
								var1.indexOf("$"));
						this.a(var15, 12, var18);
					} else if (var1.endsWith(":duelreq:")) {
						var16 = StringUtils.a(var15 = var1.substring(0,
								var1.indexOf(":")));
						var63 = false;

						for (var3 = 0; var3 < this.aN; ++var3) {
							if (this.cf[var3] == var16) {
								var63 = true;
							}
						}

						if (!var63 && this.he == 0) {
							this.a("wishes to duel with you.", 8, var15);
						}
					} else if (!var1.endsWith(":chalreq:")) {
						if (var1.endsWith(":resetautocast:")) {
							this.aB = false;
							this.aH = 0;
						} else {
							this.a(var1, 0, "", var63);
						}
					} else {
						var16 = StringUtils.a(var15 = var1.substring(0,
								var1.indexOf(":")));
						var63 = false;

						for (var3 = 0; var3 < this.aN; ++var3) {
							if (this.cf[var3] == var16) {
								var63 = true;
							}
						}

						if (!var63 && this.he == 0) {
							var64 = var1.substring(var1.indexOf(":") + 1,
									var1.length() - 9);
							this.a(var64, 8, var15);
						}
					}

					this.dv = -1;
					return true;
				case 254:
					this.bm = this.eE.readUByte();
					if (this.bm == 1) {
						this.gI = this.eE.readUShort();
					}

					if (this.bm >= 2 && this.bm <= 6) {
						if (this.bm == 2) {
							this.cp = 64;
							this.cq = 64;
						}

						if (this.bm == 3) {
							this.cp = 0;
							this.cq = 64;
						}

						if (this.bm == 4) {
							this.cp = 128;
							this.cq = 64;
						}

						if (this.bm == 5) {
							this.cp = 64;
							this.cq = 0;
						}

						if (this.bm == 6) {
							this.cp = 64;
							this.cq = 128;
						}

						this.bm = 2;
						this.cm = this.eE.readUShort();
						this.cn = this.eE.readUShort();
						this.co = this.eE.readUByte();
					}

					if (this.bm == 10) {
						this.cl = this.eE.readUShort();
					}

					this.dv = -1;
					return true;
				default:
					SignLink.reportError("T1 - " + this.dv + "," + this.du
							+ " - " + this.bc + "," + this.bd);
				}
			} catch (IOException var60) {
				this.A();
			} catch (Exception var61) {
				var1 = "T2 - " + this.dv + "," + this.bc + "," + this.bd
						+ " - " + this.du + ","
						+ (this.dO + localPlayer.pathX[0]) + ","
						+ (this.dP + localPlayer.pathY[0]) + " - ";

				for (var2 = 0; var2 < this.du && var2 < 50; ++var2) {
					var1 = var1 + this.eE.buf[var2] + ",";
				}

				SignLink.reportError(var1);
			}

			this.dv = -1;
			return true;
		}
	}

	private void Y() {
		this.gs.a(130);
		if (this.gp != -1) {
			this.gp = -1;
			this.fK = false;
			fh = true;
		}

		if (this.hA != -1) {
			this.hA = -1;
			D = true;
			this.fK = false;
		}

		j = -1;
		this.hM = -1;
	}

	public Client() {
		this.aj = NumberFormat.getNumberInstance(Locale.US);
		this.ak = false;
		this.al = false;
		this.am = 0;
		this.an = false;
		this.ao = 0;
		this.ap = 0;
		this.ar = new int[] { 0, 2, 1, 6, 3, 4, 5, 15, 17, 11, 14, 16, 10, 13,
				12, 8, 7, 9, 19, 20, 18 };
		this.xpDrops = false;
		this.av = 0;
		this.centerX = clientWidth / 2;
		this.centerY = clientHeight / 2;
		this.ay = false;
		this.clientOutOfDate = true;
		this.gameBrightness = 0.8D;
		this.showRoofs = false;
		this.aH = 0;
		this.aU = 2;
		this.cR = new int[] { 16776960, 16711680, '\uff00', '\uffff', 16711935,
				16777215 };
		this.eL = 3;
		this.eN = 765;
		this.eO = 503;
		this.eP = true;
		this.eR = 1000;
		this.gd = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2,
				2, 2, 2, 2, 2, 2, 3 };
		this.midiVolume = 256;

		try {
			this.midi = new MidiPlayer();
			this.aq = new ArrayList();
		} catch (Exception var2) {
			var2.printStackTrace();
		}

		this.hM = -1;
		this.e(0);
		this.aE = new int[500];
		this.aF = new boolean[500];
		this.aG = 0;
		this.f = 0;
		this.g = 0;
		this.h = 0;
		this.ag = -1;
		this.ah = 0;
		hK = "vidyascape.no-ip.org";
		this.aP = new int[104][104];
		this.aQ = new int[200];
		this.aR = new LinkedList[4][104][104];
		this.aS = false;
		this.aV = new Buffer(new byte[5000]);
		this.aW = new Npc[16384];
		this.aY = new int[16384];
		this.ba = new int[1000];
		this.bf = Buffer.a();
		this.bg = true;
		j = -1;
		this.bt = new int[25];
		this.bw = false;
		this.bx = new int[5];
		this.by = new boolean[5];
		this.bD = false;
		this.bE = "";
		this.bF = -1;
		this.bG = false;
		this.bI = "";
		this.bJ = 2048;
		this.bK = 2047;
		this.bL = new Player[2048];
		this.bN = new int[2048];
		this.bP = new int[2048];
		this.bQ = new Buffer[2048];
		this.bV = new int[104][104];
		this.bW = new byte[16384];
		this.cd = new int[25];
		this.cH = new long[100];
		this.cI = new int[100];
		this.cf = new long[100];
		this.gameCrashed = false;
		this.ch = new int[5];
		this.ci = new int[104][104];
		this.cr = new int[500];
		this.cs = new String[500];
		this.ct = new String[500];
		this.cu = new String[500];
		this.cx = new Sprite[15];
		this.cy = new Sprite[22];
		this.cF = true;
		this.cG = new long[200];
		this.cJ = -1;
		this.cO = false;
		this.cP = -1;
		this.cQ = -1;
		this.cS = new int[33];
		this.indices = new Index[5];
		this.m = new int[2000];
		this.cT = false;
		this.cU = 50;
		this.cV = new int[50];
		this.cW = new int[50];
		this.cX = new int[50];
		this.cY = new int[50];
		this.cZ = new int[50];
		this.da = new int[50];
		this.db = new int[50];
		this.dc = new String[50];
		this.de = -1;
		this.hitsplats = new Sprite[20];
		this.di = new int[5];
		this.dj = false;
		this.dr = "";
		this.projectiles = new LinkedList();
		this.dD = false;
		this.dE = -1;
		this.dL = new int[5];
		this.dM = false;
		this.dN = new Sprite[100];
		this.dU = -1;
		this.dV = new int[25];
		this.dW = new int[2000];
		this.dY = true;
		this.ec = new int[152];
		this.gP = new int[152];
		this.ee = -1;
		this.eg = new LinkedList();
		this.eh = new int[33];
		this.ei = new Widget();
		this.ej = new IndexedImage[100];
		this.el = 5063219;
		this.en = new int[7];
		this.et = new int[1000];
		this.eu = new int[1000];
		this.eC = false;
		this.eD = new String[200];
		this.eE = Buffer.a();
		this.eS = new int[9];
		this.eT = new int[500];
		this.eU = new int[500];
		this.eV = new int[500];
		this.eW = new int[500];
		this.headiconsPrayer = new Sprite[20];
		this.headiconsPk = new Sprite[20];
		this.fa = new Sprite[20];
		fh = false;
		this.fu = "";
		this.fx = new String[5];
		this.fy = new boolean[5];
		this.fz = new int[4][13][13];
		this.fH = new Sprite[1000];
		this.fI = false;
		this.fK = false;
		this.fL = new Sprite[8];
		playMusic = true;
		this.loggedIn = false;
		this.fR = false;
		this.fS = false;
		this.fT = false;
		this.gc = false;
		this.ge = -1;
		this.gf = new LinkedList();
		this.camPitch = 128;
		this.gp = -1;
		this.gs = Buffer.a();
		this.gw = new String[500];
		this.gz = new int[5];
		this.gA = new int[50];
		B = 78;
		this.gC = "";
		this.gH = new IndexedImage[2];
		C = 3;
		D = false;
		this.gM = true;
		this.gQ = new CollisionMap[4];
		this.gU = new int[50];
		this.gV = false;
		this.hc = new int[50];
		this.hd = new int[50];
		this.hf = false;
		this.hh = false;
		this.hi = false;
		this.hq = "";
		this.hr = "";
		this.hA = -1;
		this.hC = new int[4000];
		this.hD = new int[4000];
	}

	private void Z() {
		if (super.mainImageProducer == null) {
			this.fX = null;
			this.fV = null;
			this.fU = null;
			this.fW = null;
			this.fw = null;
			this.fj = null;
			this.fk = null;
			this.loginScreen = null;
			this.fm = null;
			this.fn = null;
			this.fo = null;
			this.fp = null;
			this.fq = null;
			this.fr = null;
			super.mainImageProducer = new ProducingGraphicsBuffer(clientWidth,
					clientHeight, this.getFrameComponent());
			this.hh = true;
		}
	}

	private void e(String var1) {
		String var2 = System.getProperty("os.name");

		try {
			if (var2.startsWith("Mac OS")) {
				Class.forName("com.apple.eio.FileManager")
						.getDeclaredMethod("openURL",
								new Class[] { String.class })
						.invoke((Object) null, new Object[] { var1 });
			} else if (var2.startsWith("Windows")) {
				Runtime.getRuntime().exec(
						"rundll32 url.dll,FileProtocolHandler " + var1);
			} else {
				String[] var6 = new String[] { "firefox", "opera", "konqueror",
						"epiphany", "mozilla", "netscape", "safari" };
				String var3 = null;

				for (int var4 = 0; var4 < 7 && var3 == null; ++var4) {
					if (Runtime.getRuntime()
							.exec(new String[] { "which", var6[var4] })
							.waitFor() == 0) {
						var3 = var6[var4];
					}
				}

				if (var3 == null) {
					throw new Exception("Could not find web browser");
				} else {
					Runtime.getRuntime().exec(new String[] { var3, var1 });
				}
			}
		} catch (Exception var5) {
			this.a("Failed to open URL.", 0, "");
		}
	}
}
