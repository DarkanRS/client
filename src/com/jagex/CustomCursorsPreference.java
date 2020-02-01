package com.jagex;
public class CustomCursorsPreference extends Preference {

	public static RSInterface[] INTERFACES;

	void setValue(int i_1) {
		this.anInt5578 = i_1;
	}

	public CustomCursorsPreference(int i_1, GamePreferences class282_sub54_2) {
		super(class282_sub54_2);
	}

	int getDefaultValue() {
		return 1;
	}

	int checkValid(int i_1) {
		return 1;
	}

	public void method12674() {
		if (this.anInt5578 != 1 && this.anInt5578 != 0) {
			this.anInt5578 = this.getDefaultValue();
		}

	}

	public int method12675() {
		return this.anInt5578;
	}

	int method7784(int i_1) {
		return 1;
	}

	int method7786() {
		return 1;
	}

	int method7787() {
		return 1;
	}

	public CustomCursorsPreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	void method7780(int i_1) {
		this.anInt5578 = i_1 * -754033619 * -859024475;
	}

	public static void method12679() {
		SoftCache softcache_1 = PlayerAppearance.aClass229_2920;
		synchronized (PlayerAppearance.aClass229_2920) {
			PlayerAppearance.aClass229_2920.method3859();
		}

		softcache_1 = PlayerAppearance.aClass229_2930;
		synchronized (PlayerAppearance.aClass229_2930) {
			PlayerAppearance.aClass229_2930.method3859();
		}
	}

}
