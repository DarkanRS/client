package com.jagex;

public class Preference_Sub4 extends Preference {

	public Preference_Sub4(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public Preference_Sub4(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	@Override
	public int checkValid(int i_1) {
		return !Class60.method1166(manager.currentToolkit.getValue()) ? 3 : 1;
	}

	@Override
	int getDefaultValue() {
		return 0;
	}

	public void method12639() {
		if (manager.currentToolkit.method12777() && !Class60.method1166(manager.currentToolkit.getValue()))
			value = 0;

		if (value < 0 || value > 2)
			value = getDefaultValue();

	}

	public int method12641() {
		return value;
	}

	public boolean method12646() {
		return Class60.method1166(manager.currentToolkit.getValue());
	}

	void method7780(int i_1) {
		value = -754033619 * i_1 * -859024475;
	}

	public int method7784() {
		return !Class60.method1166(manager.currentToolkit.getValue()) ? 3 : 1;
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
