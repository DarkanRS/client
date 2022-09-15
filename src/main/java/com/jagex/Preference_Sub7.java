package com.jagex;

public class Preference_Sub7 extends Preference {

	public static int method12672() {
		return Class302.anInt3561;
	}

	public Preference_Sub7(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public Preference_Sub7(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	@Override
	public int checkValid(int i_1) {
		return 1;
	}

	@Override
	int getDefaultValue() {
		return manager.currentToolkit.method12777() && Class520.method11162(manager.currentToolkit.getValue()) ? 1 : 0;
	}

	public void method12663() {
		if (value < 0 || value > 2)
			value = getDefaultValue();

	}

	public boolean method12665() {
		return true;
	}

	public int method12666() {
		return value;
	}

	void method7780(int i_1) {
		value = -754033619 * i_1 * -859024475;
	}

	public int method7784() {
		return 1;
	}

	int method7786() {
		return manager.currentToolkit.method12777() && Class520.method11162(manager.currentToolkit.getValue()) ? 1 : 0;
	}

	int method7787() {
		return manager.currentToolkit.method12777() && Class520.method11162(manager.currentToolkit.getValue()) ? 1 : 0;
	}

	@Override
	void setValue(int i_1) {
		value = i_1;
	}

}
