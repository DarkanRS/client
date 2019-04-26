public class Node_Sub20_Sub8 extends Node_Sub20 {

	int anInt9762 = 1;
	int anInt9767 = 1;
	int anInt9768 = 204;

	int[] method12319(int i_1) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, 177740780);
		if (this.aClass320_7667.aBool3722) {
			for (int i_4 = 0; i_4 < Class316.anInt3670; i_4++) {
				int i_5 = Class316.anIntArray3672[i_4];
				int i_6 = Class316.anIntArray3668[i_1];
				int i_7 = i_5 * this.anInt9762 >> 12;
				int i_8 = i_6 * this.anInt9767 >> 12;
				int i_9 = i_5 % (4096 / this.anInt9762) * this.anInt9762;
				int i_10 = i_6 % (4096 / this.anInt9767) * this.anInt9767;
				if (i_10 < this.anInt9768) {
					for (i_7 -= i_8; i_7 < 0; i_7 += 4) {
						;
					}

					while (i_7 > 3) {
						i_7 -= 4;
					}

					if (i_7 != 1) {
						ints_3[i_4] = 0;
						continue;
					}

					if (i_9 < this.anInt9768) {
						ints_3[i_4] = 0;
						continue;
					}
				}

				if (i_9 < this.anInt9768) {
					for (i_7 -= i_8; i_7 < 0; i_7 += 4) {
						;
					}

					while (i_7 > 3) {
						i_7 -= 4;
					}

					if (i_7 > 0) {
						ints_3[i_4] = 0;
						continue;
					}
				}

				ints_3[i_4] = 4096;
			}
		}

		return ints_3;
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			this.anInt9762 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 1:
			this.anInt9767 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 2:
			this.anInt9768 = rsbytebuffer_2.readUnsignedShort();
		}

	}

	public Node_Sub20_Sub8() {
		super(0, true);
	}

	public static void method15242(String string_0, boolean bool_1, int i_2, int i_3, int i_4) {
		CombinedInputSubscriber.method3673(string_0, bool_1, i_2, i_3, (String) null, false);
	}

}
