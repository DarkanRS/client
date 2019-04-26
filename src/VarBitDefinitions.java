public class VarBitDefinitions implements Definition {

	public int baseVar;
	public int startBit;
	public int endBit;

	void method3795(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			this.method3796(rsbytebuffer_1, i_3);
		}
	}

	void method3796(RsByteBuffer rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			this.baseVar = rsbytebuffer_1.readUnsignedShort();
			this.startBit = rsbytebuffer_1.readUnsignedByte();
			this.endBit = rsbytebuffer_1.readUnsignedByte();
		}
	}

	public static void method3805() {
		Class148.aNode_Sub15_Sub2_1735.method15101((short) -11220);
		Class148.anInt1730 = 1;
		CutsceneEntity.aClass317_746 = null;
		Node_Sub33.aNode_Sub15_Sub2_7836 = null;
	}
}
