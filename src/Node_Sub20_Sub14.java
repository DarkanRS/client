public class Node_Sub20_Sub14 extends Node_Sub20 {

	int anInt9830 = 2048;
	int anInt9829 = 0;
	int anInt9833 = 0;
	int anInt9831 = 2048;
	int anInt9832 = 12288;
	int anInt9828 = 4096;
	int anInt9834 = 8192;

	void method12321(int i_1) {
		Class316.method5586((byte) -57);
	}

	public Node_Sub20_Sub14() {
		super(0, true);
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			this.anInt9830 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 1:
			this.anInt9829 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 2:
			this.anInt9833 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 3:
			this.anInt9831 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 4:
			this.anInt9832 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 5:
			this.anInt9828 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 6:
			this.anInt9834 = rsbytebuffer_2.readUnsignedShort();
		}

	}

	int[] method12319(int i_1) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, -935224374);
		if (this.aClass320_7667.aBool3722) {
			int i_4 = Class316.anIntArray3668[i_1] - 2048;

			for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
				int i_6 = Class316.anIntArray3672[i_5] - 2048;
				int i_7 = i_6 + this.anInt9830;
				i_7 = i_7 < -2048 ? i_7 + 4096 : i_7;
				i_7 = i_7 > 2048 ? i_7 - 4096 : i_7;
				int i_8 = i_4 + this.anInt9829;
				i_8 = i_8 < -2048 ? i_8 + 4096 : i_8;
				i_8 = i_8 > 2048 ? i_8 - 4096 : i_8;
				int i_9 = i_6 + this.anInt9833;
				i_9 = i_9 < -2048 ? i_9 + 4096 : i_9;
				i_9 = i_9 > 2048 ? i_9 - 4096 : i_9;
				int i_10 = i_4 + this.anInt9831;
				i_10 = i_10 < -2048 ? i_10 + 4096 : i_10;
				i_10 = i_10 > 2048 ? i_10 - 4096 : i_10;
				ints_3[i_5] = !this.method15302(i_7, i_8) && !this.method15300(i_9, i_10) ? 0 : 4096;
			}
		}

		return ints_3;
	}

	boolean method15300(int i_1, int i_2) {
		int i_4 = (i_2 + i_1) * this.anInt9832 >> 12;
		int i_5 = Class316.anIntArray3675[i_4 * 255 >> 12 & 0xff];
		i_5 = (i_5 << 12) / this.anInt9832;
		i_5 = (i_5 << 12) / this.anInt9834;
		i_5 = i_5 * this.anInt9828 >> 12;
		return i_2 - i_1 < i_5 && i_2 - i_1 > -i_5;
	}

	boolean method15302(int i_1, int i_2) {
		int i_4 = (i_2 - i_1) * this.anInt9832 >> 12;
		int i_5 = Class316.anIntArray3675[i_4 * 255 >> 12 & 0xff];
		i_5 = (i_5 << 12) / this.anInt9832;
		i_5 = (i_5 << 12) / this.anInt9834;
		i_5 = i_5 * this.anInt9828 >> 12;
		return i_2 + i_1 < i_5 && i_2 + i_1 > -i_5;
	}

}
