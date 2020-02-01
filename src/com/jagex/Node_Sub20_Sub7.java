package com.jagex;
public class Node_Sub20_Sub7 extends Node_Sub20 {

	int anInt9761 = 2048;
	int anInt9759 = 1024;
	int anInt9760 = 3072;

	int[][] method12320(int i_1, int i_2) {
		int[][] ints_3 = this.aClass308_7670.method5463(i_1, 1866699649);
		if (this.aClass308_7670.aBool3619) {
			int[][] ints_4 = this.method12333(0, i_1);
			int[] ints_5 = ints_4[0];
			int[] ints_6 = ints_4[1];
			int[] ints_7 = ints_4[2];
			int[] ints_8 = ints_3[0];
			int[] ints_9 = ints_3[1];
			int[] ints_10 = ints_3[2];

			for (int i_11 = 0; i_11 < Class316.anInt3670; i_11++) {
				ints_8[i_11] = (this.anInt9761 * ints_5[i_11] >> 12) + this.anInt9759;
				ints_9[i_11] = (this.anInt9761 * ints_6[i_11] >> 12) + this.anInt9759;
				ints_10[i_11] = (this.anInt9761 * ints_7[i_11] >> 12) + this.anInt9759;
			}
		}

		return ints_3;
	}

	void method12321(int i_1) {
		this.anInt9761 = this.anInt9760 - this.anInt9759;
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			this.anInt9759 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 1:
			this.anInt9760 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 2:
			this.aBool7669 = rsbytebuffer_2.readUnsignedByte() == 1;
		}

	}

	public Node_Sub20_Sub7() {
		super(1, false);
	}

	int[] method12319(int i_1) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, 699794774);
		if (this.aClass320_7667.aBool3722) {
			int[] ints_4 = this.method12317(0, i_1, 1949629181);

			for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
				ints_3[i_5] = (this.anInt9761 * ints_4[i_5] >> 12) + this.anInt9759;
			}
		}

		return ints_3;
	}

	static final void method15240() {
		Message.method7275(Renderers.SOFTWARE_RENDERER);
		if (client.anInt7472 != Class4.MY_PLAYER_PLANE) {
			ClanVarDefinitions.method6823();
		}

	}

	static void method15241(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_8 = 0;
		int i_9 = i_3;
		int i_10 = 0;
		int i_11 = i_2 - i_6;
		int i_12 = i_3 - i_6;
		int i_13 = i_2 * i_2;
		int i_14 = i_3 * i_3;
		int i_15 = i_11 * i_11;
		int i_16 = i_12 * i_12;
		int i_17 = i_14 << 1;
		int i_18 = i_13 << 1;
		int i_19 = i_16 << 1;
		int i_20 = i_15 << 1;
		int i_21 = i_3 << 1;
		int i_22 = i_12 << 1;
		int i_23 = i_17 + (1 - i_21) * i_13;
		int i_24 = i_14 - i_18 * (i_21 - 1);
		int i_25 = i_19 + (1 - i_22) * i_15;
		int i_26 = i_16 - i_20 * (i_22 - 1);
		int i_27 = i_13 << 2;
		int i_28 = i_14 << 2;
		int i_29 = i_15 << 2;
		int i_30 = i_16 << 2;
		int i_31 = i_17 * 3;
		int i_32 = i_18 * (i_21 - 3);
		int i_33 = i_19 * 3;
		int i_34 = i_20 * (i_22 - 3);
		int i_35 = i_28;
		int i_36 = (i_3 - 1) * i_27;
		int i_37 = i_30;
		int i_38 = i_29 * (i_12 - 1);
		int[] ints_39 = Class532_Sub3_Sub1.anIntArrayArray7072[i_1];
		KeyHoldInputSubscriber.method3922(ints_39, i_0 - i_2, i_0 - i_11, i_5, (byte) -38);
		KeyHoldInputSubscriber.method3922(ints_39, i_0 - i_11, i_0 + i_11, i_4, (byte) -68);
		KeyHoldInputSubscriber.method3922(ints_39, i_0 + i_11, i_0 + i_2, i_5, (byte) -67);

		while (i_9 > 0) {
			boolean bool_40 = i_9 <= i_12;
			if (bool_40) {
				if (i_25 < 0) {
					while (i_25 < 0) {
						i_25 += i_33;
						i_26 += i_37;
						i_33 += i_30;
						i_37 += i_30;
						++i_10;
					}
				}

				if (i_26 < 0) {
					i_25 += i_33;
					i_26 += i_37;
					i_33 += i_30;
					i_37 += i_30;
					++i_10;
				}

				i_25 += -i_38;
				i_26 += -i_34;
				i_34 -= i_29;
				i_38 -= i_29;
			}

			if (i_23 < 0) {
				while (i_23 < 0) {
					i_23 += i_31;
					i_24 += i_35;
					i_31 += i_28;
					i_35 += i_28;
					++i_8;
				}
			}

			if (i_24 < 0) {
				i_23 += i_31;
				i_24 += i_35;
				i_31 += i_28;
				i_35 += i_28;
				++i_8;
			}

			i_23 += -i_36;
			i_24 += -i_32;
			i_32 -= i_27;
			i_36 -= i_27;
			--i_9;
			int i_41 = i_1 - i_9;
			int i_42 = i_9 + i_1;
			int i_43 = i_0 + i_8;
			int i_44 = i_0 - i_8;
			if (bool_40) {
				int i_45 = i_0 + i_10;
				int i_46 = i_0 - i_10;
				KeyHoldInputSubscriber.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_41], i_44, i_46, i_5, (byte) -12);
				KeyHoldInputSubscriber.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_41], i_46, i_45, i_4, (byte) 11);
				KeyHoldInputSubscriber.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_41], i_45, i_43, i_5, (byte) 16);
				KeyHoldInputSubscriber.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_42], i_44, i_46, i_5, (byte) 2);
				KeyHoldInputSubscriber.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_42], i_46, i_45, i_4, (byte) 84);
				KeyHoldInputSubscriber.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_42], i_45, i_43, i_5, (byte) -100);
			} else {
				KeyHoldInputSubscriber.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_41], i_44, i_43, i_5, (byte) -49);
				KeyHoldInputSubscriber.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_42], i_44, i_43, i_5, (byte) 59);
			}
		}

	}

}
