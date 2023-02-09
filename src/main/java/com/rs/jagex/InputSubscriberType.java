package com.rs.jagex;

public class InputSubscriberType {

	public static int EMAIL_STATUS;

	static IComponentDefinitions NO_LAYER;

	static InputSubscriberType COMBINED = new InputSubscriberType(0);
	static InputSubscriberType KEY_PRESS = new InputSubscriberType(1);
	static InputSubscriberType KEY_HOLD = new InputSubscriberType(2);

	static void method3751(int i_0, int i_1, int i_2, int i_3, int i_4) {
		int i_6 = 0;
		int i_7 = i_3;
		int i_8 = i_2 * i_2;
		int i_9 = i_3 * i_3;
		int i_10 = i_9 << 1;
		int i_11 = i_8 << 1;
		int i_12 = i_3 << 1;
		int i_13 = i_10 + (1 - i_12) * i_8;
		int i_14 = i_9 - i_11 * (i_12 - 1);
		int i_15 = i_8 << 2;
		int i_16 = i_9 << 2;
		int i_17 = ((i_6 << 1) + 3) * i_10;
		int i_18 = ((i_3 << 1) - 3) * i_11;
		int i_19 = i_16 * (i_6 + 1);
		int i_20 = i_15 * (i_3 - 1);
		KeyHoldInputSubscriber.method3922(Class532.anIntArrayArray7072[i_1], i_0 - i_2, i_0 + i_2, i_4);
		while (i_7 > 0) {
			if (i_13 < 0)
				while (i_13 < 0) {
					i_13 += i_17;
					i_14 += i_19;
					i_17 += i_16;
					i_19 += i_16;
					++i_6;
				}
			if (i_14 < 0) {
				i_13 += i_17;
				i_14 += i_19;
				i_17 += i_16;
				i_19 += i_16;
				++i_6;
			}
			i_13 += -i_20;
			i_14 += -i_18;
			i_18 -= i_15;
			i_20 -= i_15;
			--i_7;
			int i_21 = i_1 - i_7;
			int i_22 = i_7 + i_1;
			int i_23 = i_0 + i_6;
			int i_24 = i_0 - i_6;
			KeyHoldInputSubscriber.method3922(Class532.anIntArrayArray7072[i_21], i_24, i_23, i_4);
			KeyHoldInputSubscriber.method3922(Class532.anIntArrayArray7072[i_22], i_24, i_23, i_4);
		}
	}

	static InputSubscriberType valueOf(int i_0) {
		InputSubscriberType[] arr_2 = JS5FileWorker.method5815();
		for (InputSubscriberType class221_4 : arr_2) {
			if (i_0 == class221_4.anInt2758)
				return class221_4;
		}
		return null;
	}

	int anInt2758;

	InputSubscriberType(int i_1) {
		anInt2758 = i_1;
	}
}
