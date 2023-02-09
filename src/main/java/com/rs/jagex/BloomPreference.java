package com.rs.jagex;

public class BloomPreference extends Preference {

	static int anInt7899;

	static void method12708() {
		Class9.aString102 = "";
		Class9.aString99 = "";
	}

	public static void method12710(int i_0) {
		Node_Sub14.anInt7597 = i_0;
		IComponentDefinitions.aClass229_1341.method3859();
	}

	public BloomPreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public BloomPreference(int i_1, GamePreferences class282_sub54_2) {
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

	public void method12703() {
		if (manager.currentToolkit.method12777() && !Class60.method1166(manager.currentToolkit.getValue()))
			value = 0;

		if (value < 0 || value > 1)
			value = getDefaultValue();

	}

	public int method12706() {
		return value;
	}

	public boolean method12707() {
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
