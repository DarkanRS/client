public class Class537 {

	public char aChar7096;

	public int anInt7097;

	public int anInt7098;

	public int anInt7099;

	void method11487(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			this.method11488(rsbytebuffer_1, i_3);
		}
	}

	void method11488(RsByteBuffer rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			this.aChar7096 = Class11.getChar(rsbytebuffer_1.readByte(), 276039281);
		} else if (i_2 == 2) {
			this.anInt7097 = rsbytebuffer_1.readUnsignedShort();
			this.anInt7098 = rsbytebuffer_1.readUnsignedByte();
			this.anInt7099 = rsbytebuffer_1.readUnsignedByte();
		}
	}
}
