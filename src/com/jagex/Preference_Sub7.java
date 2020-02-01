package com.jagex;
public class Preference_Sub7 extends Preference {

	public Preference_Sub7(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public void method12663() {
		if (this.anInt5578 < 0 || this.anInt5578 > 2) {
			this.anInt5578 = this.getDefaultValue();
		}

	}

	public Preference_Sub7(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public int checkValid(int i_1) {
		return 1;
	}

	public boolean method12665() {
		return true;
	}

	public int method12666(int i_1) {
		return this.anInt5578;
	}

	void method7780(int i_1) {
		this.anInt5578 = -754033619 * i_1 * -859024475;
	}

	void setValue(int i_1) {
		this.anInt5578 = i_1;
	}

	int method7786() {
		return this.manager.currentToolkit.method12777() && Class520.method11162(this.manager.currentToolkit.getValue(-1694677300), (byte) -33) ? 1 : 0;
	}

	int method7787() {
		return this.manager.currentToolkit.method12777() && Class520.method11162(this.manager.currentToolkit.getValue(1892648668), (byte) -118) ? 1 : 0;
	}

	int getDefaultValue() {
		return this.manager.currentToolkit.method12777() && Class520.method11162(this.manager.currentToolkit.getValue(1685029630), (byte) -110) ? 1 : 0;
	}

	public int method7784(int i_1) {
		return 1;
	}

	public static int method12672() {
		return Class302.anInt3561;
	}

}
