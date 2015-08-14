public final class Widget {
	
	public static final int OPTION_OK = 1;
	public static final int OPTION_USABLE = 2;
	public static final int OPTION_CLOSE = 3;
	public static final int OPTION_TOGGLE_SETTING = 4;
	public static final int OPTION_RESET_SETTING = 5;
	public static final int OPTION_CONTINUE = 6;

	public static final int TYPE_CONTAINER = 0;
	public static final int TYPE_MODEL_LIST = 1;
	public static final int TYPE_INVENTORY = 2;
	public static final int TYPE_RECTANGLE = 3;
	public static final int TYPE_TEXT = 4;
	public static final int TYPE_SPRITE = 5;
	public static final int TYPE_MODEL = 6;
	public static final int TYPE_ITEM_LIST = 7;
	
   public String a;
   public Sprite defaultSprite;
   public int c;
   public Sprite[] sprite;
   public static Widget[] widgets;
   public int[] f;
   public int contentType;
   public int[] spriteX;
   public int defaultHoverColor;
   public int optionType;
   public String optionText;
   public int secondaryColor;
   public int width;
   public String hover;
   public String optionCircumfix;
   public boolean centeredText;
   public int q;
   public String[] actions;
   public int[][] s;
   public boolean t;
   public String secondaryText;
   public int hoverId;
   public int spritePaddingX;
   public int defaultColor;
   public int defaultMediaType;
   public int defaultMedia;
   public boolean replaceItems;
   public int parent;
   public int optionAttributes;
   private static Cache spriteCache;
   public int secondaryHoverColor;
   public int[] children;
   public int[] childX;
   public boolean usableItems;
   public RSFont font;
   public int spritePaddingY;
   public int[] J;
   public int K;
   public int[] spriteY;
   public String defaultText;
   public boolean hasActions;
   public int id;
   public int[] itemAmounts;
   public int[] itemIds;
   public byte alpha;
   private int secondaryMediaType;
   private int secondaryMedia;
   public int defaultAnimationId;
   public int secondaryAnimationId;
   public boolean swappableItems;
   public Sprite secondarySprite;
   public int W;
   public int group;
   public int Y;
   private static final Cache models = new Cache(30);
   public int Z;
   public boolean aa;
   public int height;
   public boolean shadowedText;
   public int spriteScale;
   public int spritePitch;
   public int spriteRoll;
   public int[] childY;
   public boolean ah;

   public final void swapInventoryItems(int first, int second) {
      int tmp = this.itemIds[first];
      this.itemIds[first] = this.itemIds[second];
      this.itemIds[second] = tmp;
      tmp = this.itemAmounts[first];
      this.itemAmounts[first] = this.itemAmounts[second];
      this.itemAmounts[second] = tmp;
   }

   public static void load(Archive interfaces, RSFont[] fonts, Archive graphics) {
      spriteCache = new Cache(50000/*'썐'*/);
      Buffer buffer = new Buffer(interfaces.getEntry("data"));
      int var3 = -1;
      int var4 = buffer.readUShort();
      widgets = new Widget[var4 + 61000/*'\uee48'*/];

      while(true) {
         Widget var5;
         do {
            int var6;
            int var7;
            int var8;
            if(buffer.position >= buffer.payload.length) {
               Widget var14 = widgets[904];
               addSpriteWidget(24149, 1, "Options/SPRITE", "Fixed");
               addSpriteWidget(24150, 2, "Options/SPRITE", "Resizable");
               addSpriteWidget(24151, 3, "Options/SPRITE", "Fullscreen");
               var14.assignChild(39, 24149, 10, 8);
               var14.assignChild(40, 24150, 70, 8);
               var14.assignChild(41, 24151, 130, 8);
               (var14 = widgets[19156]).optionType = 1;
               var14.hover = "Toggle roofs";
               var14 = container(5292);
               allocateChildren(28, (Widget)var14);
               a(5293, "bank", 0);
               var14.assignChild(0, 5293, 13, 13);
               a(5384, "bank", 1, 17, 17, "Close Window", 0, 5380, 3);
               a(5380, "bank", 2, 17, 17, 5379);
               var14.assignChild(1, 5384, 476, 16);
               var14.assignChild(2, 5380, 476, 16);
               a(8131, 5292, "bank", 5, "bank", 6, 35, 25, "Swap/Insert", 1, 4, 304);
               var14.assignChild(3, 8131, 25, 285);
               a(5386, 5292, "bank", 7, "bank", 8, 35, 25, "Withdraw Mode", 1, 4, 115);
               var14.assignChild(4, 5386, 65, 285);
               a(50000/*'썐'*/, "bank", 9, 35, 25, "Deposit All", 0, 50001/*'썑'*/, 1);
               a(50001/*'썑'*/, "bank", 10, 35, 25, 49999/*'썏'*/);
               var14.assignChild(5, 50000/*'썐'*/, 455, 285);
               var14.assignChild(6, 50001/*'썑'*/, 455, 285);
               var14.assignChild(7, 5383, 170, 15);
               var14.assignChild(8, 5385, -4, 74);
               a(50002/*'썒'*/, "bank", 11, "Click here to view the full contents of your bank");
               var14.assignChild(9, 50002/*'썒'*/, 22, 36);
               a(50003/*'썓'*/, "bank", 15, "Drag an item here to create a new tab");
               var14.assignChild(10, 50003/*'썓'*/, 70, 36);
               a(50004/*'썔'*/, "bank", 15, "Drag an item here to create a new tab");
               var14.assignChild(11, 50004/*'썔'*/, 118, 36);
               a(50005/*'썕'*/, "bank", 15, "Drag an item here to create a new tab");
               var14.assignChild(12, 50005/*'썕'*/, 166, 36);
               a(50006/*'썖'*/, "bank", 15, "Drag an item here to create a new tab");
               var14.assignChild(13, 50006/*'썖'*/, 214, 36);
               a(50007/*'썗'*/, "bank", 15, "Drag an item here to create a new tab");
               var14.assignChild(14, 50007/*'썗'*/, 262, 36);
               a(50008/*'썘'*/, "bank", 15, "Drag an item here to create a new tab");
               var14.assignChild(15, 50008/*'썘'*/, 310, 36);
               a(50009/*'썙'*/, "bank", 15, "Drag an item here to create a new tab");
               var14.assignChild(16, 50009/*'썙'*/, 358, 36);
               a(50010/*'썚'*/, "bank", 15, "Drag an item here to create a new tab");
               var14.assignChild(17, 50010/*'썚'*/, 406, 36);
               a(50011/*'썛'*/, "0", fonts, 0, 11834970, true, false);
               var14.assignChild(18, 50011/*'썛'*/, 473, 42);
               a(50012/*'썜'*/, "352", fonts, 0, 11834970, true, false);
               var14.assignChild(19, 50012/*'썜'*/, 473, 57);
               d(50013/*'썝'*/);
               var14.assignChild(20, 50013/*'썝'*/, 77, 39);
               d(50014/*'썞'*/);
               var14.assignChild(21, 50014/*'썞'*/, 125, 39);
               d(50015/*'썟'*/);
               var14.assignChild(22, 50015/*'썟'*/, 173, 39);
               d(50016/*'썠'*/);
               var14.assignChild(23, 50016/*'썠'*/, 221, 39);
               d(50017/*'썡'*/);
               var14.assignChild(24, 50017/*'썡'*/, 269, 39);
               d(50018/*'썢'*/);
               var14.assignChild(25, 50018/*'썢'*/, 317, 39);
               d(50019/*'썣'*/);
               var14.assignChild(26, 50019/*'썣'*/, 365, 39);
               d(50020/*'썤'*/);
               var14.assignChild(27, 50020/*'썤'*/, 413, 39);
               a(50021/*'썥'*/, "0", 16750623, false, true, 52, fonts, 1);
               a(50022/*'썦'*/, "0", 16750623, false, true, 52, fonts, 1);
               a(50023/*'썧'*/, "0", 16750623, false, true, 52, fonts, 1);
               (var14 = widgets[5385]).height = 206;
               var14.width = 480;
               (var14 = widgets[5382]).width = 10;
               var14.spritePaddingX = 12;
               var14.height = 35;
               int[] var15 = new int[]{8654, 8655, 8656, 8657, 8658, 8659, 8660, 8661, 8662, 8663, 8664, 8665, 8666, 8667, 8668, 8669, 8670, 8671, 8672, 12162, 13928};
               int[][] var16 = new int[][]{{4, 4}, {66, 4}, {128, 4}, {4, 34}, {66, 34}, {128, 34}, {4, 64}, {66, 64}, {128, 64}, {4, 94}, {66, 94}, {128, 94}, {4, 124}, {66, 124}, {128, 124}, {4, 154}, {66, 154}, {128, 154}, {4, 184}, {66, 184}, {128, 184}};
               Widget var24;
               int[] var18 = (var24 = widgets[3917]).children;
               int[] var19 = var24.childX;
               int[] var23 = var24.childY;
               var24.c(var24.children.length + 21);

               for(var8 = 0; var8 < var18.length; ++var8) {
                  var24.assignChild(var8, var18[var8], var19[var8], var23[var8]);
               }

               for(var8 = 0; var8 < 21; ++var8) {
                  int var10000 = var8 + 30000;
                  int var10001 = var8 + 10000;
                  boolean var10 = true;
                  var6 = var10001;
                  Widget var11;
                  (var11 = container(var10000)).group = 8;
                  var11.contentType = var6;
                  var11.defaultText = "";
                  var11.height = 28;
                  var11.width = 60;
                  var11.ah = true;
                  var24.assignChild(var18.length + var8, var8 + 30000, var16[var8][0], var16[var8][1]);
               }

               for(var8 = 0; var8 < var18.length; ++var8) {
                  for(int var12 = 0; var12 < 21; ++var12) {
                     if(var15[var12] == var24.children[var8]) {
                        widgets[var15[var12]].hoverId = var12 + 30000;
                     }
                  }
               }

               RSFont[] var13 = fonts;
               var14 = container(25000);
               allocateChildren(8, (Widget)var14);
               a(25001, "Clan Chat", fonts, 1, 16751360, true, true);
               a(25002, "Talking in: Not in chat", fonts, 0, 16751360, true, true);
               a(25003, "Owner: None", fonts, 0, 16751360, true, true);
               a(25004, "clanchat", 4);
               Widget var17 = container(25005);
               allocateChildren(3, (Widget)var17);
               a(25006, "clanchat", 5, 72, 32, "Join Chat", 550, 25007, 1);
               a(25007, "clanchat", 6, 72, 32, 25008);
               a(25009, "Join Chat", fonts, 0, 16751360, true, true);
               var17.a(0, 25006, 0, 0);
               var17.a(1, 25007, 0, 0);
               var17.a(2, 25009, 36, 11);
               var24 = container(25010);
               allocateChildren(3, (Widget)var24);
               a(25011, "clanchat", 5, 72, 32, "Clan Setup", -1, 25012, 5);
               a(25012, "clanchat", 6, 72, 32, 25013);
               a(25014, "Clan Setup", fonts, 0, 16751360, true, true);
               var24.a(0, 25011, 0, 0);
               var24.a(1, 25012, 0, 0);
               var24.a(2, 25014, 36, 11);
               var5 = container(25015);
               allocateChildren(3, (Widget)var5);
               a(25016, "clanchat", 5, 72, 32, "Leave Chat", -1, 25017, 1);
               a(25017, "clanchat", 6, 72, 32, 25018);
               a(25019, "Leave Chat", fonts, 0, 16751360, true, true);
               var5.a(0, 25016, 0, 0);
               var5.a(1, 25017, 0, 0);
               var5.a(2, 25019, 36, 11);
               var5.aa = true;
               var14.a(0, 25001, 95, 3);
               var14.a(1, 25002, 95, 25);
               var14.a(2, 25003, 95, 40);
               var14.a(3, 25004, 0, 60);
               var14.a(4, 25005, 15, 226);
               var14.a(5, 25010, 103, 226);
               var14.a(6, 25015, 15, 226);
               var14.a(7, 25020, 0, 62);
               Widget var20;
               (var20 = container(25020)).contentType = 20000;
               var20.c(200);

               for(var7 = 0; var7 < 100; ++var7) {
                  a(var8 = var7 + 25021, "clanchat", 0);
               }

               for(var7 = 0; var7 < 100; ++var7) {
                  var8 = var7 + 25021;
                  var20.children[var7] = var8;
                  var20.childX[var7] = 5;
                  if(var7 == 0) {
                     var20.childY[0] = 2;
                  } else {
                     var20.childY[var7] = var20.childY[var7 - 1] + 14;
                  }
               }

               for(var7 = 0; var7 < 100; ++var7) {
                  a(var8 = var7 + 25122, "", var13, 0, 16777215, false, true);
               }

               for(var7 = 100; var7 < 200; ++var7) {
                  var8 = 25122 + (var7 - 100);
                  var20.children[var7] = var8;
                  var20.childX[var7] = 17;
                  if(var7 == 100) {
                     var20.childY[100] = 2;
                  } else {
                     var20.childY[var7] = var20.childY[var7 - 1] + 14;
                  }
               }

               var20.height = 158;
               var20.width = 174;
               var20.W = 1405;

               for(var7 = 25122; var7 < 25222; ++var7) {
                  widgets[var7].contentType = 20001 + (var7 - 25122);
               }

               var14 = a(994);
               allocateChildren(70, (Widget)var14);
               a(995, "windowframes", 0);
               var14.assignChild(0, 995, 5, 8);
               a(1084, "bank", 1, 17, 17, "Close Window", 0, 1082, 3);
               a(1082, "bank", 2, 17, 17, 1081);
               var14.assignChild(1, 1084, 480, 17);
               var14.assignChild(2, 1082, 480, 17);
               var14.assignChild(3, 1117, 6, 17);
               var14.assignChild(4, 1119, 22, 46);
               a(1119, 68, 24);
               var14.assignChild(5, 1120, 104, 46);
               a(1120, 68, 24);
               var14.assignChild(6, 1121, 180, 46);
               a(1121, 68, 24);
               var14.assignChild(7, 1122, 264, 46);
               a(1122, 68, 24);
               var14.assignChild(8, 1123, 348, 46);
               a(1123, 68, 24);
               var14.assignChild(9, 24476, 432, 46);
               a(24476, 68, 24);
               var14.assignChild(10, 1094, 12, 78);
               var14.assignChild(11, 1125, 12, 90);
               var14.assignChild(12, 1085, 12, 134);
               var14.assignChild(13, 1124, 12, 146);
               var14.assignChild(14, 1087, 12, 188);
               var14.assignChild(15, 1116, 12, 200);
               var14.assignChild(16, 1086, 12, 244);
               var14.assignChild(17, 1089, 12, 256);
               var14.assignChild(18, 1088, 12, 302);
               var14.assignChild(19, 1090, 12, 312);
               var14.assignChild(20, 1091, 100, 78);
               var14.assignChild(21, 1126, 100, 90);
               var14.assignChild(22, 1093, 100, 134);
               var14.assignChild(23, 1129, 100, 146);
               var14.assignChild(24, 1083, 100, 188);
               var14.assignChild(25, 1118, 100, 200);
               var14.assignChild(26, 1092, 100, 244);
               var14.assignChild(27, 1095, 100, 256);
               var14.assignChild(28, 8429, 100, 302);
               var14.assignChild(29, 8428, 100, 312);
               var14.assignChild(30, 1098, 174, 78);
               var14.assignChild(31, 1109, 174, 90);
               var14.assignChild(32, 1099, 174, 134);
               var14.assignChild(33, 1110, 174, 146);
               var14.assignChild(34, 1100, 174, 188);
               var14.assignChild(35, 1111, 174, 200);
               var14.assignChild(36, 1101, 174, 244);
               var14.assignChild(37, 1112, 174, 256);
               var14.assignChild(38, 11461, 174, 302);
               var14.assignChild(39, 11459, 174, 312);
               var14.assignChild(40, 1102, 258, 78);
               var14.assignChild(41, 1127, 258, 90);
               var14.assignChild(42, 1103, 258, 134);
               var14.assignChild(43, 1113, 258, 146);
               var14.assignChild(44, 1104, 258, 188);
               var14.assignChild(45, 1114, 258, 200);
               var14.assignChild(46, 1105, 258, 244);
               var14.assignChild(47, 1115, 258, 256);
               var14.assignChild(48, 13358, 258, 302);
               var14.assignChild(49, 13357, 258, 312);
               var14.assignChild(50, 1107, 340, 78);
               var14.assignChild(51, 1128, 340, 90);
               var14.assignChild(52, 1108, 340, 134);
               var14.assignChild(53, 1130, 340, 146);
               var14.assignChild(54, 1106, 340, 188);
               var14.assignChild(55, 1131, 340, 200);
               var14.assignChild(56, 1096, 340, 244);
               var14.assignChild(57, 1132, 340, 256);
               var14.assignChild(58, 1134, 340, 302);
               var14.assignChild(59, 1135, 340, 312);
               var14.assignChild(60, 24482, 432, 78);
               var14.assignChild(61, 24477, 432, 90);
               var14.assignChild(62, 24483, 432, 134);
               var14.assignChild(63, 24478, 432, 146);
               var14.assignChild(64, 24484, 432, 188);
               var14.assignChild(65, 24479, 432, 200);
               var14.assignChild(66, 24485, 432, 244);
               var14.assignChild(67, 24480, 432, 256);
               var14.assignChild(68, 24486, 432, 302);
               var14.assignChild(69, 24481, 432, 312);
               spriteCache = null;
               return;
            }

            if((var4 = buffer.readUShort()) == '\uffff') {
               var3 = buffer.readUShort();
               var4 = buffer.readUShort();
            }

            (var5 = widgets[var4] = new Widget()).id = var4;
            var5.parent = var3;
            var5.group = buffer.readUByte();
            var5.optionType = buffer.readUByte();
            var5.contentType = buffer.readUShort();
            var5.width = buffer.readUShort();
            var5.height = buffer.readUShort();
            var5.alpha = (byte)buffer.readUByte();
            var5.hoverId = buffer.readUByte();
            if(var5.hoverId != 0) {
               var5.hoverId = (var5.hoverId - 1 << 8) + buffer.readUByte();
            } else {
               var5.hoverId = -1;
            }

            if((var4 = buffer.readUByte()) > 0) {
               var5.J = new int[var4];
               var5.f = new int[var4];

               for(var6 = 0; var6 < var4; ++var6) {
                  var5.J[var6] = buffer.readUByte();
                  var5.f[var6] = buffer.readUShort();
               }
            }

            if((var6 = buffer.readUByte()) > 0) {
               var5.s = new int[var6][];

               for(var4 = 0; var4 < var6; ++var4) {
                  var7 = buffer.readUShort();
                  var5.s[var4] = new int[var7];

                  for(var8 = 0; var8 < var7; ++var8) {
                     var5.s[var4][var8] = buffer.readUShort();
                  }
               }
            }

            if(var5.group == 0) {
               var5.W = buffer.readUShort();
               var5.aa = buffer.readUByte() == 1;
               var4 = buffer.readUShort();
               var5.children = new int[var4];
               var5.childX = new int[var4];
               var5.childY = new int[var4];

               for(var7 = 0; var7 < var4; ++var7) {
                  var5.children[var7] = buffer.readUShort();
                  var5.childX[var7] = buffer.readShort();
                  var5.childY[var7] = buffer.readShort();
               }
            }

            if(var5.group == 1) {
               buffer.readUShort();
               buffer.readUByte();
            }

            if(var5.group == 2) {
               var5.itemIds = new int[var5.width * var5.height];
               var5.itemAmounts = new int[var5.width * var5.height];
               var5.swappableItems = buffer.readUByte() == 1;
               var5.hasActions = buffer.readUByte() == 1;
               var5.usableItems = buffer.readUByte() == 1;
               var5.replaceItems = buffer.readUByte() == 1;
               var5.spritePaddingX = buffer.readUByte();
               var5.spritePaddingY = buffer.readUByte();
               var5.spriteX = new int[20];
               var5.spriteY = new int[20];
               var5.sprite = new Sprite[20];

               for(var4 = 0; var4 < 20; ++var4) {
                  if(buffer.readUByte() == 1) {
                     var5.spriteX[var4] = buffer.readShort();
                     var5.spriteY[var4] = buffer.readShort();
                     String var21 = buffer.readString();
                     if(graphics != null && var21.length() > 0) {
                        var6 = var21.lastIndexOf(",");
                        var5.sprite[var4] = a(Integer.parseInt(var21.substring(var6 + 1)), graphics, var21.substring(0, var6));
                     }
                  }
               }

               var5.actions = new String[5];

               for(var4 = 0; var4 < 5; ++var4) {
                  var5.actions[var4] = buffer.readString();
                  if(var5.actions[var4].length() == 0) {
                     var5.actions[var4] = null;
                  }

                  if(var5.id == 1688) {
                     var5.actions[1] = null;
                  }

                  if(var5.parent == 3822) {
                     var5.actions[4] = "Sell X";
                  }
               }
            }

            if(var5.group == 3) {
               var5.t = buffer.readUByte() == 1;
            }

            if(var5.group == 4 || var5.group == 1) {
               var5.centeredText = buffer.readUByte() == 1;
               var4 = buffer.readUByte();
               var5.font = fonts[var4];
               var5.shadowedText = buffer.readUByte() == 1;
            }

            if(var5.group == 4) {
               var5.defaultText = buffer.readString().replaceAll("RuneScape", "/v/scape");
               var5.secondaryText = buffer.readString();
            }

            if(var5.group == 1 || var5.group == 3 || var5.group == 4) {
               var5.defaultColor = buffer.readInt();
            }

            if(var5.group == 3 || var5.group == 4) {
               var5.secondaryColor = buffer.readInt();
               var5.defaultHoverColor = buffer.readInt();
               var5.secondaryHoverColor = buffer.readInt();
            }

            if(var5.group == 5) {
               String var22 = buffer.readString();
               if(graphics != null && var22.length() > 0) {
                  var7 = var22.lastIndexOf(",");
                  var5.defaultSprite = a(Integer.parseInt(var22.substring(var7 + 1)), graphics, var22.substring(0, var7));
               }

               var22 = buffer.readString();
               if(graphics != null && var22.length() > 0) {
                  var7 = var22.lastIndexOf(",");
                  var5.secondarySprite = a(Integer.parseInt(var22.substring(var7 + 1)), graphics, var22.substring(0, var7));
               }
            }

            if(var5.group == 6) {
               if((var4 = buffer.readUByte()) != 0) {
                  var5.defaultMediaType = 1;
                  var5.defaultMedia = (var4 - 1 << 8) + buffer.readUByte();
               }

               if((var4 = buffer.readUByte()) != 0) {
                  var5.secondaryMediaType = 1;
                  var5.secondaryMedia = (var4 - 1 << 8) + buffer.readUByte();
               }

               if((var4 = buffer.readUByte()) != 0) {
                  var5.defaultAnimationId = (var4 - 1 << 8) + buffer.readUByte();
               } else {
                  var5.defaultAnimationId = -1;
               }

               if((var4 = buffer.readUByte()) != 0) {
                  var5.secondaryAnimationId = (var4 - 1 << 8) + buffer.readUByte();
               } else {
                  var5.secondaryAnimationId = -1;
               }

               var5.spriteScale = buffer.readUShort();
               var5.spritePitch = buffer.readUShort();
               var5.spriteRoll = buffer.readUShort();
            }

            if(var5.group == 7) {
               var5.itemIds = new int[var5.width * var5.height];
               var5.itemAmounts = new int[var5.width * var5.height];
               var5.centeredText = buffer.readUByte() == 1;
               var4 = buffer.readUByte();
               var5.font = fonts[var4];
               var5.shadowedText = buffer.readUByte() == 1;
               var5.defaultColor = buffer.readInt();
               var5.spritePaddingX = buffer.readShort();
               var5.spritePaddingY = buffer.readShort();
               var5.hasActions = buffer.readUByte() == 1;
               var5.actions = new String[5];

               for(var7 = 0; var7 < 5; ++var7) {
                  var5.actions[var7] = buffer.readString();
                  if(var5.actions[var7].length() == 0) {
                     var5.actions[var7] = null;
                  }
               }
            }

            if(var5.optionType == 2 || var5.group == 2) {
               var5.optionCircumfix = buffer.readString();
               var5.optionText = buffer.readString();
               var5.optionAttributes = buffer.readUShort();
            }

            if(var5.group == 8) {
               var5.defaultText = buffer.readString();
            }
         } while(var5.optionType != 1 && var5.optionType != 4 && var5.optionType != 5 && var5.optionType != 6);

         var5.hover = buffer.readString();
         if(var5.hover.length() == 0) {
            if(var5.optionType == 1) {
               var5.hover = "Ok";
            }

            if(var5.optionType == 4) {
               var5.hover = "Select";
            }

            if(var5.optionType == 5) {
               var5.hover = "Select";
            }

            if(var5.optionType == 6) {
               var5.hover = "Continue";
            }
         }
      }
   }

   private static void addSpriteWidget(int id, int spriteId, String spriteName, String hoverText) {
      Widget var4;
      (var4 = widgets[id] = new Widget()).id = id;
      var4.parent = id;
      var4.group = TYPE_SPRITE;
      var4.optionType = 1;
      var4.contentType = 0;
      var4.alpha = 0;
      var4.hoverId = 52;
      var4.defaultSprite = getSprite(spriteId, spriteName);
      var4.secondarySprite = getSprite(spriteId, spriteName);
      var4.width = var4.defaultSprite.width;
      var4.height = var4.secondarySprite.height;
      var4.hover = hoverText;
   }

   private static void a(int id, String var1, int var2, String var3) {
      Widget var4;
      (var4 = widgets[id] = new Widget()).id = id;
      var4.parent = id;
      var4.group = TYPE_SPRITE;
      var4.optionType = 1;
      var4.contentType = 0;
      var4.alpha = 0;
      var4.hoverId = 52;
      var4.defaultSprite = Animation.spriteFromGroup(var1, var2);
      var4.secondarySprite = Animation.spriteFromGroup(var1, var2);
      var4.width = var4.defaultSprite.width;
      var4.height = var4.secondarySprite.height;
      var4.hover = var3;
   }

   private static Widget a(int var0) {
      Widget var1;
      (var1 = widgets[var0] = new Widget()).id = var0;
      var1.parent = var0;
      var1.width = 512;
      var1.height = 334;
      return var1;
   }

   private static void a(int var0, String var1, RSFont[] var2, int var3, int var4, boolean var5, boolean var6) {
      Widget var7;
      (var7 = container(var0)).parent = var0;
      var7.id = var0;
      var7.group = TYPE_TEXT;
      var7.optionType = 0;
      var7.width = 0;
      var7.height = 11;
      var7.contentType = 0;
      var7.alpha = 0;
      var7.hoverId = -1;
      var7.centeredText = var5;
      var7.shadowedText = var6;
      var7.font = var2[var3];
      var7.defaultText = var1;
      var7.secondaryText = "";
      var7.defaultColor = var4;
      var7.secondaryColor = 0;
      var7.defaultHoverColor = 0;
      var7.secondaryHoverColor = 0;
   }

   private static void a(int var0, String var1, int var2, boolean var3, boolean var4, int var5, RSFont[] var6, int var7) {
      Widget var8;
      (var8 = a(var0)).parent = var0;
      var8.id = var0;
      var8.group = TYPE_TEXT;
      var8.optionType = 0;
      var8.width = 0;
      var8.height = 0;
      var8.contentType = 0;
      var8.alpha = 0;
      var8.hoverId = 52;
      var8.centeredText = false;
      var8.shadowedText = true;
      var8.font = var6[1];
      var8.defaultText = var1;
      var8.secondaryText = "";
      var8.defaultColor = 16750623;
   }

   private static void a(int id, int var1, String var2, int var3, String var4, int var5, int var6, int var7, String var8, int var9, int var10, int var11) {
      Widget var12;
      (var12 = container(id)).parent = 5292;
      var12.id = id;
      var12.group = 5;
      var12.optionType = TYPE_TEXT;
      var12.contentType = 0;
      var12.width = 35;
      var12.height = 25;
      var12.alpha = 0;
      var12.hoverId = -1;
      var12.J = new int[1];
      var12.f = new int[1];
      var12.J[0] = 1;
      var12.f[0] = 1;
      var12.s = new int[1][3];
      var12.s[0][0] = 5;
      var12.s[0][1] = var11;
      var12.s[0][2] = 0;
      var12.defaultSprite = Animation.spriteFromGroup(var2, var3);
      var12.secondarySprite = Animation.spriteFromGroup(var4, var5);
      var12.hover = var8;
   }

   private static void a(int var0, String var1, int var2) {
      Widget var3;
      (var3 = widgets[var0] = new Widget()).id = var0;
      var3.parent = var0;
      var3.group = TYPE_SPRITE;
      var3.optionType = 0;
      var3.contentType = 0;
      var3.alpha = 0;
      var3.hoverId = 52;
      var3.defaultSprite = Animation.spriteFromGroup(var1, var2);
      var3.secondarySprite = Animation.spriteFromGroup(var1, var2);
      var3.width = 512;
      var3.height = 334;
   }

   private static void a(int var0, String var1, int var2, int var3, int var4, String var5, int var6, int var7, int var8) {
      Widget var9;
      (var9 = container(var0)).id = var0;
      var9.parent = var0;
      var9.group = TYPE_SPRITE;
      var9.optionType = var8;
      var9.contentType = var6;
      var9.alpha = 0;
      var9.hoverId = var7;
      var9.defaultSprite = Animation.spriteFromGroup(var1, var2);
      var9.secondarySprite = Animation.spriteFromGroup(var1, var2);
      var9.width = var3;
      var9.height = var4;
      var9.hover = var5;
   }

   private static void a(int var0, String var1, int var2, int var3, int var4, int var5) {
      Widget var6;
      (var6 = container(var0)).parent = var0;
      var6.id = var0;
      var6.group = TYPE_CONTAINER;
      var6.optionType = 0;
      var6.width = var3;
      var6.height = var4;
      var6.aa = true;
      var6.alpha = 0;
      var6.hoverId = -1;
      var6.W = 0;
      Widget var7;
      (var7 = container(var5)).id = var5;
      var7.parent = var5;
      var7.group = TYPE_SPRITE;
      var7.optionType = 0;
      var7.contentType = 0;
      var7.width = 512;
      var7.height = 334;
      var7.alpha = 0;
      var7.hoverId = 52;
      var7.defaultSprite = Animation.spriteFromGroup(var1, var2);
      var7.secondarySprite = Animation.spriteFromGroup(var1, var2);
      var6.c(1);
      var6.a(0, var5, 0, 0);
   }

   private static Widget container(int id) {
      Widget var1;
      (var1 = widgets[id] = new Widget()).id = id;
      var1.parent = id;
      var1.group = TYPE_CONTAINER;
      var1.optionType = 0;
      var1.contentType = 0;
      var1.width = 512;
      var1.height = 700;
      var1.alpha = 0;
      var1.hoverId = -1;
      return var1;
   }

   private static Sprite getSprite(int id, String name) {
      long var2 = (StringUtils.hashSpriteName(name) << 8) + (long)id;
      Sprite var4;
      if((var4 = (Sprite)spriteCache.get(var2)) != null) {
         return var4;
      } else {
         try {
            var4 = new Sprite(name + " " + id);
            spriteCache.put(var4, var2);
            return var4;
         } catch (Exception var5) {
            return null;
         }
      }
   }

   private void a(int var1, int var2, int var3, int var4) {
      this.children[var1] = var2;
      this.childX[var1] = var3;
      this.childY[var1] = var4;
   }

   private void c(int var1) {
      this.children = new int[var1];
      this.childX = new int[var1];
      this.childY = new int[var1];
   }

   private static Model getModel(int type, int id) {
      Model var2;
      if((var2 = (Model)models.get((long)((type << 16) + id))) != null) {
         return var2;
      } else {
         if(type == 1) {
            var2 = Model.lookup(id);
         }

         if(type == 2) {
            var2 = ActorDefinition.lookup(id).model();
         }

         if(type == 3) {
            var2 = Client.localPlayer.getHeadModel();
         }

         if(type == 4) {
            var2 = ItemDefinition.fromID(id).asStack(50);
         }

         if(type == 5) {
            var2 = null;
         }

         if(var2 != null) {
            models.put(var2, (long)((type << 16) + id));
         }

         return var2;
      }
   }

   private static Sprite a(int id, Archive archive, String name) {
      long var3 = (StringUtils.hashSpriteName(name) << 8) + (long)id;
      Sprite var5;
      if((var5 = (Sprite)spriteCache.get(var3)) != null) {
         return var5;
      } else {
         try {
            var5 = new Sprite(archive, name, id);
            spriteCache.put(var5, var3);
            return var5;
         } catch (Exception var6) {
            return null;
         }
      }
   }

   public static void a(boolean var0, Model var1) {
      if(!var0) {
         models.removeAll();
         if(var1 != null) {
            models.put(var1, 327680L);
         }

      }
   }

   public final Model getAnimatedModel(int var1, int var2, boolean secondary) {
      Model var4;
      if(secondary) {
         var4 = getModel(this.secondaryMediaType, this.secondaryMedia);
      } else {
         var4 = getModel(this.defaultMediaType, this.defaultMedia);
      }

      if(var4 == null) {
         return null;
      } else if(var2 == -1 && var1 == -1 && var4.faceColors == null) {
         return var4;
      } else {
         var4 = new Model(true, Frame.isInvalid(var2) & Frame.isInvalid(var1), false, var4);
         if(var2 != -1 || var1 != -1) {
            var4.createBones();
         }

         if(var2 != -1) {
            var4.applyTransform(var2);
         }

         if(var1 != -1) {
            var4.applyTransform(var1);
         }

         var4.light(64, 768, -50, -10, -50, true);
         return var4;
      }
   }

   private static void allocateChildren(int numChildren, Widget var1) {
      var1.children = new int[numChildren];
      var1.childX = new int[numChildren];
      var1.childY = new int[numChildren];
   }

   private void assignChild(int var1, int id, int x, int y) {
      this.children[var1] = id;
      this.childX[var1] = x;
      this.childY[var1] = y;
   }

   private static void d(int var0) {
      Widget var1;
      (var1 = widgets[var0] = new Widget()).id = var0;
      var1.parent = var0;
      var1.group = TYPE_INVENTORY;
      var1.spritePaddingX = 24;
      var1.spritePaddingY = 24;
      var1.height = 1;
      var1.width = 1;
      var1.actions = new String[5];
      var1.spriteX = new int[20];
      var1.spriteY = new int[20];
      var1.itemIds = new int[1];
      var1.itemAmounts = new int[1];
      var1.children = new int[0];
      var1.childX = new int[0];
      var1.childY = new int[0];
      var1.usableItems = false;
      var1.hasActions = false;
   }

   private static void a(int var0, int var1, int var2) {
      Widget var3;
      (var3 = widgets[var0]).spritePaddingX = 68;
      var3.spritePaddingY = 24;
   }
}
