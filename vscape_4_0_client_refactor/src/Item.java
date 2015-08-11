final class Item extends Renderable {
	public int itemId;
	public int itemCount;

	public final Model getRotatedModel() {
		return ItemDefinition.fromID(this.itemId).getAmountModel(this.itemCount);
	}
}
