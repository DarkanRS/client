package com.jagex;
public class Preference_Sub3 extends Preference {

	public void method12631() {
		int i_2 = this.manager.toolKit.getValue(1989130239);
		if (i_2 != 3 && i_2 != 5) {
			this.anInt5578 = 0;
		}

		if (this.manager.getProcessorSpecs().getProcessorCount() < 2) {
			this.anInt5578 = 0;
		}

		if (this.anInt5578 != 0 && this.anInt5578 != 1) {
			this.anInt5578 = this.getDefaultValue();
		}

	}

	public Preference_Sub3(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	void method7780(int i_1) {
		this.anInt5578 = -754033619 * i_1 * -859024475;
	}

	int getDefaultValue() {
		int i_2 = this.manager.toolKit.getValue(-1849420735);
		return i_2 != 3 && i_2 != 5 ? 0 : 0;
	}

	int checkValid(int i_1) {
		if (i_1 == 0) {
			return 1;
		} else if (this.manager.getProcessorSpecs().getProcessorCount() < 2) {
			return 3;
		} else {
			int i_3 = this.manager.toolKit.getValue(-1012176870);
			return i_3 != 3 && i_3 != 5 ? 3 : 1;
		}
	}

	void setValue(int i_1) {
		this.anInt5578 = i_1;
	}

	public int method12632(int i_1) {
		return this.anInt5578;
	}

	int method7784(int i_1) {
		if (i_1 == 0) {
			return 1;
		} else if (this.manager.getProcessorSpecs().getProcessorCount() < 2) {
			return 3;
		} else {
			int i_2 = this.manager.toolKit.getValue(-1120904037);
			return i_2 != 3 && i_2 != 5 ? 3 : 1;
		}
	}

	int method7787() {
		int i_1 = this.manager.toolKit.getValue(-1264159175);
		return i_1 != 3 && i_1 != 5 ? 0 : 0;
	}

	public Preference_Sub3(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	int method7786() {
		int i_1 = this.manager.toolKit.getValue(1736686662);
		return i_1 != 3 && i_1 != 5 ? 0 : 0;
	}

}
