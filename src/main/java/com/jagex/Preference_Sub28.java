package com.jagex;

public class Preference_Sub28 extends Preference {

	public static int LASTLOGINLDAY;

	public Preference_Sub28(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public Preference_Sub28(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	@Override
	public int checkValid(int i_1) {
		return 1;
	}

	@Override
	int getDefaultValue() {
		return 1;
	}

	public void method12959() {
		if (value != 1 && value != 0)
			value = getDefaultValue();

	}

	public boolean method12964() {
		return true;
	}

	public int method12966() {
		return value;
	}

	void method7780(int i_1) {
		value = -754033619 * i_1 * -859024475;
	}

	public int method7784() {
		return 1;
	}

	int method7786() {
		return 1;
	}

	int method7787() {
		return 1;
	}

	@Override
	void setValue(int i_1) {
		value = i_1;
	}

}
