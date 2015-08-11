public final class Cache {
	private final CacheableNode a = new CacheableNode();
	private final int size;
	private int remaining;
	private final HashTable hashTable;
	private final Queue queue = new Queue();

	public Cache(int size) {
		this.size = size;
		this.remaining = size;
		this.hashTable = new HashTable();
	}

	public final CacheableNode get(long id) {
		CacheableNode var3;
		if ((var3 = (CacheableNode) this.hashTable.get(id)) != null) {
			this.queue.insertHead(var3);
		}

		return var3;
	}

	public final void put(CacheableNode cacheableNode, long id) {
		try {
			if (this.remaining == 0) {
				CacheableNode var4;
				(var4 = this.queue.popTail()).unlink();
				var4.clear();
				if (var4 == this.a) {
					(var4 = this.queue.popTail()).unlink();
					var4.clear();
				}
			} else {
				--this.remaining;
			}

			this.hashTable.remove(cacheableNode, id);
			this.queue.insertHead(cacheableNode);
		} catch (RuntimeException var5) {
			SignLink.reportError("47547, " + cacheableNode + ", " + id + ", 2" + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public final void removeAll() {
		CacheableNode var1;
		while ((var1 = this.queue.popTail()) != null) {
			var1.unlink();
			var1.clear();
		}

		this.remaining = this.size;
	}
}
