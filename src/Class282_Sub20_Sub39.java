import java.util.Random;

public class Class282_Sub20_Sub39 extends Class282_Sub20 {

	int anInt10009 = 0;
	int anInt10013 = 2000;
	int anInt10010 = 16;
	int anInt10004 = 0;
	int anInt10011 = 4096;

	void method12321(int i_1) {
		Class316.method5586((byte) -8);
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			this.anInt10009 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 1:
			this.anInt10013 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 2:
			this.anInt10010 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 3:
			this.anInt10004 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 4:
			this.anInt10011 = rsbytebuffer_2.readUnsignedShort();
		}

	}

	int[] method12319(int i_1) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, 347419032);
		if (this.aClass320_7667.aBool3722) {
			int i_4 = this.anInt10011 >> 1;
			int[][] ints_5 = this.aClass320_7667.method5722();
			Random random_6 = new Random((long) this.anInt10009);

			for (int i_7 = 0; i_7 < this.anInt10013; i_7++) {
				int i_8 = this.anInt10011 > 0 ? this.anInt10004 + (Class476.method7931(random_6, this.anInt10011, 892408081) - i_4) : this.anInt10004;
				i_8 = i_8 >> 4 & 0xff;
				int i_9 = Class476.method7931(random_6, Class316.anInt3670, -272716187);
				int i_10 = Class476.method7931(random_6, Class316.anInt3671, -1563129644);
				int i_11 = i_9 + (Class316.anIntArray3675[i_8] * this.anInt10010 >> 12);
				int i_12 = i_10 + (Class316.anIntArray3677[i_8] * this.anInt10010 >> 12);
				int i_13 = i_12 - i_10;
				int i_14 = i_11 - i_9;
				if (i_14 != 0 || i_13 != 0) {
					if (i_13 < 0) {
						i_13 = -i_13;
					}

					if (i_14 < 0) {
						i_14 = -i_14;
					}

					boolean bool_15 = i_13 > i_14;
					int i_16;
					int i_17;
					if (bool_15) {
						i_16 = i_9;
						i_17 = i_11;
						i_9 = i_10;
						i_10 = i_16;
						i_11 = i_12;
						i_12 = i_17;
					}

					if (i_9 > i_11) {
						i_16 = i_9;
						i_17 = i_10;
						i_9 = i_11;
						i_11 = i_16;
						i_10 = i_12;
						i_12 = i_17;
					}

					i_16 = i_10;
					i_17 = i_11 - i_9;
					int i_18 = i_12 - i_10;
					int i_19 = -i_17 / 2;
					int i_20 = 2048 / i_17;
					int i_21 = 1024 - (Class476.method7931(random_6, 4096, -1883071085) >> 2);
					int i_22 = i_10 < i_12 ? 1 : -1;
					if (i_18 < 0) {
						i_18 = -i_18;
					}

					for (int i_23 = i_9; i_23 < i_11; i_23++) {
						int i_24 = i_21 + i_20 * (i_23 - i_9) + 1024;
						int i_25 = i_23 & Class316.anInt3669;
						int i_26 = i_16 & Class316.anInt3673;
						if (bool_15) {
							ints_5[i_26][i_25] = i_24;
						} else {
							ints_5[i_25][i_26] = i_24;
						}

						i_19 += i_18;
						if (i_19 > 0) {
							i_19 -= i_17;
							i_16 += i_22;
						}
					}
				}
			}
		}

		return ints_3;
	}

	public Class282_Sub20_Sub39() {
		super(0, true);
	}

	public static int method15436(int i_0, int i_1, int i_2) {
		i_2 &= 0x3;
		return i_2 == 0 ? i_0 : (i_2 == 1 ? i_1 : (i_2 == 2 ? 4095 - i_0 : 4095 - i_1));
	}

}
