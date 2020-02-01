package com.jagex;
public class Preference_Sub28 extends Preference {

	public static int LASTLOGINLDAY;

	public int method7784(int i_1) {
		return 1;
	}

	public Preference_Sub28(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public void method12959() {
		if (this.anInt5578 != 1 && this.anInt5578 != 0) {
			this.anInt5578 = this.getDefaultValue();
		}

	}

	int getDefaultValue() {
		return 1;
	}

	int method7787() {
		return 1;
	}

	public int checkValid(int i_1) {
		return 1;
	}

	void setValue(int i_1) {
		this.anInt5578 = i_1;
	}

	void method7780(int i_1) {
		this.anInt5578 = -754033619 * i_1 * -859024475;
	}

	int method7786() {
		return 1;
	}

	public Preference_Sub28(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public boolean method12964() {
		return true;
	}

	public int method12966(byte b_1) {
		return this.anInt5578;
	}

}
