package com.jagex;

public class FogPreference extends Preference {

	static int method13422(char var_0) {
		int i_3 = var_0 << 4;
		if (Character.isUpperCase(var_0) || Character.isTitleCase(var_0)) {
			char var_4 = Character.toLowerCase(var_0);
			i_3 = (var_4 << 4) + 1;
		}

		return i_3;
	}

	public FogPreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public FogPreference(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	@Override
	public int checkValid(int i_1) {
		return i_1 != 0 && manager.toolkitDefault.method13050() == 2 ? 3 : (i_1 != 0 && manager.groundBlending.method12762() != 1 ? 2 : 1);
	}

	@Override
	int getDefaultValue() {
		return 1;
	}

	public void method13415() {
		if (value != 0 && manager.groundBlending.method12762() != 1)
			value = 0;

		if (value != 0 && manager.toolkitDefault.method13050() == 2)
			value = 0;

		if (value < 0 || value > 1)
			value = getDefaultValue();

	}

	public int method13417() {
		return value;
	}

	public boolean method13421() {
		return true;
	}

	void method7780(int i_1) {
		value = i_1 * -754033619 * -859024475;
	}

	public int method7784(int i_1) {
		return i_1 != 0 && manager.toolkitDefault.method13050() == 2 ? 3 : (i_1 != 0 && manager.groundBlending.method12762() != 1 ? 2 : 1);
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
