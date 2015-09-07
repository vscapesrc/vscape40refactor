package bot.iface;

public interface ObjectDefinition {
	public boolean isObstructsGround();
	public String getName();
	public int getWidth();
	public int getLength();
	public int getId();
	public boolean isImpenetrable();
	public int getMapscene();
	public int[] getMorphisms();
	public int getMorphVariableIndex();
	public int getSupportItems();
	public boolean isOccludes();
	public boolean isHollow();
	public boolean isSolid();
	public int getSurroundings();
	public int[] getModelTypes();
	public byte[] getDescription();
	public boolean isInteractive();
	public int getAnimation();
	public String[] getInteractions();
}
