public class Class416 {

	public int anInt4986 = 0;
	public int anInt4987 = 0;
	public int anInt4988 = 2048;
	public int anInt4989 = 2048;

	void method6999(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method7004(rsbytebuffer_1, i_3);
		}
	}

	void method7004(RsByteBuffer rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			this.anInt4986 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 2) {
			this.anInt4989 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 3) {
			this.anInt4988 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 4) {
			this.anInt4987 = rsbytebuffer_1.readShort();
		}

	}

}
