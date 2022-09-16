package com.jagex;

public class ScreenSizePreference extends Preference {

	public static JS5Manager JS5_MANAGER;

	public ScreenSizePreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public ScreenSizePreference(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	@Override
	int checkValid(int i_1) {
		return 1;
	}

	@Override
	int getDefaultValue() {
		return manager.getProcessorSpecs().isARM() ? 3 : 2;
	}

	public int getValue() {
		return value;
	}

	public void method12684() {
		if (value < 1 || value > 3)
			value = getDefaultValue();
	}

	void method7780(int i_1) {
		value = -754033619 * i_1 * -859024475;
	}

	int method7784() {
		return 1;
	}

	int method7786() {
		return manager.getProcessorSpecs().isARM() ? 3 : 2;
	}

	int method7787() {
		return manager.getProcessorSpecs().isARM() ? 3 : 2;
	}

	@Override
	void setValue(int i_1) {
		value = i_1;
	}
}
