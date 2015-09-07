package bot.iface;

public interface ItemDefinition {
	public int getValue();
	public int getId();
	public boolean isMembersObject();
	public String[] getGroundActions();
	public String getItemName();
	public int getModelId();
	public boolean isStackable();
	public byte[] getDescription();
	public boolean isMembersServer();
	public String[] getWidgetActions();
	public int[] getStackIds();
	public int getCount();
}
