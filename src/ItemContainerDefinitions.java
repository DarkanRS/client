public class ItemContainerDefinitions extends CacheableNode implements Definition {

	public int contentSize = 0;
	public int maxSize = 0;
	public int[] itemIds;
	public int[] amounts;

	void method15690(RsByteBuffer rsbytebuffer_1, int i_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method15691(rsbytebuffer_1, i_3, -1602172632);
		}
	}

	void method15691(RsByteBuffer rsbytebuffer_1, int i_2, int i_3) {
		if (i_2 == 2) {
			this.maxSize = rsbytebuffer_1.readUnsignedShort();
//			if (this.maxSize == 556) {
//				System.out.println("Bank inventorydef increased to 800.");
//				this.maxSize = 800;
//			}
		} else if (i_2 == 4) {
			this.contentSize = rsbytebuffer_1.readUnsignedByte();
			this.itemIds = new int[this.contentSize];
			this.amounts = new int[this.contentSize];

			for (int i_4 = 0; i_4 < this.contentSize; i_4++) {
				this.itemIds[i_4] = rsbytebuffer_1.readUnsignedShort();
				this.amounts[i_4] = rsbytebuffer_1.readUnsignedShort();
			}
		}

	}

	static final void method15696(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class84.myPlayer.playerAppearance != null && Class84.myPlayer.playerAppearance.aBool2929 ? 1 : 0;
	}

}
