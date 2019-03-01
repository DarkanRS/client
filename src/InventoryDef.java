public class InventoryDef extends CacheableNode implements Definition {

	public int anInt10276 = 0;
	public int anInt10277 = 0;
	public int[] anIntArray10274;
	public int[] anIntArray10275;

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
			this.anInt10277 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 4) {
			this.anInt10276 = rsbytebuffer_1.readUnsignedByte();
			this.anIntArray10274 = new int[this.anInt10276];
			this.anIntArray10275 = new int[this.anInt10276];

			for (int i_4 = 0; i_4 < this.anInt10276; i_4++) {
				this.anIntArray10274[i_4] = rsbytebuffer_1.readUnsignedShort();
				this.anIntArray10275[i_4] = rsbytebuffer_1.readUnsignedShort();
			}
		}

	}

	static final void method15696(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class84.myPlayer.playerAppearance != null && Class84.myPlayer.playerAppearance.aBool2929 ? 1 : 0;
	}

}
