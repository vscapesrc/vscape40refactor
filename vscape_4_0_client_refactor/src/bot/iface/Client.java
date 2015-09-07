package bot.iface;

public interface Client extends ScapeApplet {
	static int REDSTONE_COMBAT = 0;
	static int REDSTONE_SKILLS = 1;
	static int REDSTONE_QUESTS = 2;
	static int REDSTONE_INVENTORY = 3;
	static int REDSTONE_LOADOUT = 4;
	static int REDSTONE_PRAYER = 5;
	static int REDSTONE_SPELLBOOK= 6;
	static int REDSTONE_CLANCHAT = 7;
	static int REDSTONE_FRIENDSLIST = 8;
	static int REDSTONE_IGNORELIST = 9;
	static int REDSTONE_LOGOUT = 10;
	static int REDSTONE_SETTINGS = 11;
	static int REDSTONE_EMOTES = 12;
	static int REDSTONE_MUSICPLAYER = 13;
	
	
	public int getCenterX();
	public int getCenterY();
	public Npc[] getNpcs();
	public Player[] getPlayers();
	public Player getLocalPlayer();
	public boolean isMenuShowing();
	public int getNumActions();
	public String[] getActions();
	public SceneGraph getScene();
	public int[] getSettings();
	public int getClientWidth();
	public int getClientHeight();
	public boolean isLoggedIn();
	public boolean isGameCrashed();
	public int getTick();
	public String getUsername();
	public String getPassword();
	public int getItemClicked();
	public String getClickedItemName();
	public Buffer getPacket();
	public int[] getRedStoneWidgetIds();
	public int getSelectedRedStoneId();
	public Widget getWidget();
	public int getSceneX();
	public int getSceneY();
	
}
