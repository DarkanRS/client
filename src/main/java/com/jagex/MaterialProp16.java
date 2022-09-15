package com.jagex;

public class MaterialProp16 extends MaterialProperty {

	public static void queryItemParamInt(String name, boolean tradeableOnly, int paramId, int paramIntQuery) {
		CombinedInputSubscriber.queryItem(name, tradeableOnly, paramId, paramIntQuery, null, false);
	}
	int anInt9762 = 1;
	int anInt9767 = 1;

	int anInt9768 = 204;

	public MaterialProp16() {
		super(0, true);
	}

	@Override
	void decode(int i_1, ByteBuf rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			anInt9762 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 1:
			anInt9767 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 2:
			anInt9768 = rsbytebuffer_2.readUnsignedShort();
		}

	}

	@Override
	int[] method12319(int i_1) {
		int[] ints_3 = aClass320_7667.method5721(i_1);
		if (aClass320_7667.aBool3722)
			for (int i_4 = 0; i_4 < Class316.anInt3670; i_4++) {
				int i_5 = Class316.anIntArray3672[i_4];
				int i_6 = Class316.anIntArray3668[i_1];
				int i_7 = i_5 * anInt9762 >> 12;
			int i_8 = i_6 * anInt9767 >> 12;
			int i_9 = i_5 % (4096 / anInt9762) * anInt9762;
			int i_10 = i_6 % (4096 / anInt9767) * anInt9767;
			if (i_10 < anInt9768) {
				for (i_7 -= i_8; i_7 < 0; i_7 += 4) {
				}

				while (i_7 > 3)
					i_7 -= 4;

				if ((i_7 != 1) || (i_9 < anInt9768)) {
					ints_3[i_4] = 0;
					continue;
				}
			}

			if (i_9 < anInt9768) {
				for (i_7 -= i_8; i_7 < 0; i_7 += 4) {
				}

				while (i_7 > 3)
					i_7 -= 4;

				if (i_7 > 0) {
					ints_3[i_4] = 0;
					continue;
				}
			}

			ints_3[i_4] = 4096;
			}

		return ints_3;
	}

}
