public class Class282_Sub20_Sub21 extends Class282_Sub20 {

	int anInt9869;
	int anInt9870;
	int anInt9871;

	Class282_Sub20_Sub21(int i_1) {
		super(0, false);
		this.method15378(i_1, -175309299);
	}

	public Class282_Sub20_Sub21() {
		this(0);
	}

	void method15378(int i_1, int i_2) {
		this.anInt9869 = (i_1 & 0xff) << 4;
		this.anInt9870 = (i_1 & 0xff00) >> 4;
		this.anInt9871 = (i_1 & 0xff0000) >> 12;
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2, int i_3) {
		switch (i_1) {
		case 0:
			this.method15378(rsbytebuffer_2.read24BitUnsignedInteger(), -175309299);
		default:
		}
	}

	int[][] method12320(int i_1, int i_2) {
		int[][] ints_3 = this.aClass308_7670.method5463(i_1, 1977566548);
		if (this.aClass308_7670.aBool3619) {
			int[] ints_4 = ints_3[0];
			int[] ints_5 = ints_3[1];
			int[] ints_6 = ints_3[2];

			for (int i_7 = 0; i_7 < Class316.anInt3670; i_7++) {
				ints_4[i_7] = this.anInt9871;
				ints_5[i_7] = this.anInt9870;
				ints_6[i_7] = this.anInt9869;
			}
		}

		return ints_3;
	}

	static void method15381(int i_0, int i_1, int i_2) {
		Class282_Sub50_Sub12 class282_sub50_sub12_3 = Engine.getIComponentVar(17, (long) i_0);
		class282_sub50_sub12_3.method14995(1421038918);
		class282_sub50_sub12_3.anInt9668 = i_1;
	}

}
