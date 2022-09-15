package com.jagex;

public class SceneryShadowPreference extends Preference {

	public static int anInt7868;

	public static WorldDescriptor method12629() {
		ConnectionInfo.CURRENT_WORLD = 0;
		return CutsceneCameraMovement.getCurrentWorldDescriptor();
	}

	public SceneryShadowPreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public SceneryShadowPreference(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	@Override
	public int checkValid(int i_1) {
		return manager.textures.method12873() == 0 ? 3 : 1;
	}

	@Override
	int getDefaultValue() {
		return 2;
	}

	public boolean method12622() {
		return manager.textures.method12873() != 0;
	}

	public int method12624() {
		return value;
	}

	public void method12627() {
		if (manager.textures.method12873() == 0)
			value = 0;
		if (value < 0 || value > 2)
			value = getDefaultValue();
	}

	void method7780(int i_1) {
		value = i_1 * -754033619 * -859024475;
	}

	public int method7784() {
		return manager.textures.method12873() == 0 ? 3 : 1;
	}

	int method7786() {
		return 2;
	}

	int method7787() {
		return 2;
	}

	@Override
	void setValue(int i_1) {
		value = i_1;
	}
}
