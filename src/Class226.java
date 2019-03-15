public class Class226 implements Definition {

	public int anInt2784;

	public int anInt2785;

	public int anInt2783;

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
			this.anInt2784 = rsbytebuffer_1.readUnsignedShort();
			this.anInt2785 = rsbytebuffer_1.readUnsignedByte();
			this.anInt2783 = rsbytebuffer_1.readUnsignedByte();
		}
	}

	public static void method3805() {
		Class148.aClass282_Sub15_Sub2_1735.method15101((short) -11220);
		Class148.anInt1730 = 1;
		Class75.aClass317_746 = null;
		Class282_Sub33.aClass282_Sub15_Sub2_7836 = null;
	}
}
