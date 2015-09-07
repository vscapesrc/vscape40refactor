final class Item extends Renderable implements bot.iface.Item {
	public int itemId;
	public int itemCount;

	public final Model getRotatedModel() {
		return ItemDefinition.fromID(this.itemId).getAmountModel(this.itemCount);
	}

	@Override
	public int getItemId() {
		return itemId;
	}

	@Override
	public int getItemCount() {
		return itemCount;
	}
}
