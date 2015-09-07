package bot.iface;

public interface ActorDefinition {
	public int getCount();
	public int getVarbit();
	public int getVarp();
	public int getCombatLevel();
	public String getName();
	public String[] getActions();
	public int getWalkingAnimation();
	public int getHeadIcon();
	public int getIdleAnimation();
	public long getId();
	public int getRotation();
	public boolean isClickable();
	
}
