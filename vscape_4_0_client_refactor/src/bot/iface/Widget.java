package bot.iface;

public interface Widget {
	
	public Widget[] getWidgets();

	public int getContentType();

	public int[] getSpriteX();

	public int getDefaultHoverColor();

	public int getOptionType();

	public String getOptionText();

	public int getSecondaryColor();

	public int getWidth();

	public String getHover();

	public String getOptionCircumfix();

	public boolean isCenteredText();

	public String[] getActions();

	public String getSecondaryText();

	public int getHoverId();

	public int getSpritePaddingX();

	public int getDefaultColor();

	public int getDefaultMediaType();

	public int getDefaultMedia();

	public boolean isReplaceItems();

	public int getParent();

	public int getOptionAttributes();

	public int getSecondaryHoverColor();

	public int[] getChildren();

	public int[] getChildX();

	public boolean isUsableItems();

	public int getSpritePaddingY();

	public int[] getSpriteY();

	public String getDefaultText();

	public boolean isHasActions();

	public int getId();

	public int[] getItemAmounts();

	public int[] getItemIds();

	public byte getAlpha();

	public int getSecondaryMediaType();

	public int getSecondaryMedia();

	public int getDefaultAnimationId();

	public int getSecondaryAnimationId();

	public boolean isSwappableItems();

	public int getGroup();

	public int getHeight();

	public boolean isShadowedText();

	public int getSpriteScale();

	public int getSpritePitch();

	public int getSpriteRoll();

	public int[] getChildY();

	public int getDrawOffsetY();

	public int getDrawOffsetX();
}
