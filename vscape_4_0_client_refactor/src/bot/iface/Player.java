package bot.iface;

public interface Player extends Actor {
	public ActorDefinition getPlayerDefinition();
	public long getCachedModel();
	public int getGender();
	public String getName();
	public int getCombatLevel();
	public int getHeadIcon();
	public boolean isVisible();
	public Model getPlayerModel();
	public int getTotalLevel();
}
