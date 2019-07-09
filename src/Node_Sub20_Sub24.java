public class Node_Sub20_Sub24 extends Node_Sub20 {

	public static IComponentDefinitions aClass118_9884;
	int[] anIntArray9881;
	int anInt9883;
	int anInt9880;
	int anInt9882 = -1;

	int[][] method12320(int i_1, int i_2) {
		int[][] ints_3 = this.aClass308_7670.method5463(i_1, 1586313259);
		if (this.aClass308_7670.aBool3619) {
			int i_4 = (this.anInt9883 != Class316.anInt3671 ? this.anInt9883 * i_1 / Class316.anInt3671 : i_1) * this.anInt9880;
			int[] ints_5 = ints_3[0];
			int[] ints_6 = ints_3[1];
			int[] ints_7 = ints_3[2];
			int i_8;
			int i_9;
			if (this.anInt9880 == Class316.anInt3670) {
				for (i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
					i_9 = this.anIntArray9881[i_4++];
					ints_7[i_8] = (i_9 & 0xff) << 4;
					ints_6[i_8] = (i_9 & 0xff00) >> 4;
					ints_5[i_8] = (i_9 & 0xff0000) >> 12;
				}
			} else {
				for (i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
					i_9 = i_8 * this.anInt9880 / Class316.anInt3670;
					int i_10 = this.anIntArray9881[i_4 + i_9];
					ints_7[i_8] = (i_10 & 0xff) << 4;
					ints_6[i_8] = (i_10 & 0xff00) >> 4;
					ints_5[i_8] = (i_10 & 0xff0000) >> 12;
				}
			}
		}

		return ints_3;
	}

	void method12315(int i_1, int i_2, byte b_3) {
		super.method12315(i_1, i_2, (byte) 82);
		if (this.anInt9882 >= 0 && Class532_Sub1.anInterface22_7922 != null) {
			int i_4 = Class532_Sub1.anInterface22_7922.method144(this.anInt9882).isHalfSize ? 64 : 128;
			this.anIntArray9881 = Class532_Sub1.anInterface22_7922.method140(this.anInt9882, 1.0F, i_4, i_4, false, (byte) 63);
			this.anInt9883 = i_4;
			this.anInt9880 = i_4;
		}

	}

	void method12326() {
		super.method12326();
		this.anIntArray9881 = null;
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2) {
		if (i_1 == 0) {
			this.anInt9882 = rsbytebuffer_2.readUnsignedShort();
		}

	}

	int method12324(byte b_1) {
		return this.anInt9882;
	}

	public Node_Sub20_Sub24() {
		super(0, false);
	}

	static final int method15390(int i_0, int i_1, int i_2) {
		return i_1 < 0 ? -i_0 : (int) ((double) i_0 * Math.sqrt(1.220703125E-4D * (double) i_1) + 0.5D);
	}

	public static void method15391(int i_0) {
		if (Class320.aClass253_3723 != null) {
			Class320.aClass253_3723.method4333();
		}

		if (ShaderDecoder.aClass253_1008 != null) {
			ShaderDecoder.aClass253_1008.method4333();
		}

	}

}
