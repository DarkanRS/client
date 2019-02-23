public class Class537 {

	public char aChar7096;
	public int anInt7097;
	public int anInt7098;
	public int anInt7099;

	void method11487(RsByteBuffer rsbytebuffer_1, byte b_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method11488(rsbytebuffer_1, i_3, 1650259972);
		}
	}

	void method11488(RsByteBuffer rsbytebuffer_1, int i_2, int i_3) {
		if (i_2 == 1) {
			this.aChar7096 = Class11.method470(rsbytebuffer_1.readByte(), 276039281);
		} else if (i_2 == 2) {
			this.anInt7097 = rsbytebuffer_1.readUnsignedShort();
			this.anInt7098 = rsbytebuffer_1.readUnsignedByte();
			this.anInt7099 = rsbytebuffer_1.readUnsignedByte();
		}

	}

	static final void method11492(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 98);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		IsaacCipher.method7267(icomponentdefinitions_3, interface_4, cs2executor_0, 1465963300);
	}

}
