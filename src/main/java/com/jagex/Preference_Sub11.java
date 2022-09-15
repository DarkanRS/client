package com.jagex;

public class Preference_Sub11 extends Preference {

	public static int method12702(int i_0, int i_1, int i_2) {
		if (Class291_Sub1.anInt8015 < 100)
			return -2;
		int i_4 = -2;
		int i_5 = Integer.MAX_VALUE;
		int i_6 = i_1 - Class291.anInt3472;
		int i_7 = i_2 - Class291.anInt3473;

		for (Node_Sub36 class282_sub36_8 = (Node_Sub36) Class291.aClass482_3459.head(); class282_sub36_8 != null; class282_sub36_8 = (Node_Sub36) Class291.aClass482_3459.next())
			if (i_0 == class282_sub36_8.anInt7991) {
				int i_9 = class282_sub36_8.anInt7987;
				int i_10 = class282_sub36_8.anInt7993;
				int i_11 = i_9 + Class291.anInt3472 << 14 | i_10 + Class291.anInt3473;
				int i_12 = (i_6 - i_9) * (i_6 - i_9) + (i_7 - i_10) * (i_7 - i_10);
				if (i_4 < 0 || i_12 < i_5) {
					i_4 = i_11;
					i_5 = i_12;
				}
			}

		return i_4;
	}

	public Preference_Sub11(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public Preference_Sub11(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	@Override
	int checkValid(int i_1) {
		return 1;
	}

	@Override
	int getDefaultValue() {
		return 0;
	}

	public void method12698() {
	}

	public int method12699() {
		return value;
	}

	void method7780(int i_1) {
		value = i_1 * -754033619 * -859024475;
	}

	int method7784() {
		return 1;
	}

	int method7786() {
		return 0;
	}

	int method7787() {
		return 0;
	}

	@Override
	void setValue(int i_1) {
		value = i_1;
	}

}
