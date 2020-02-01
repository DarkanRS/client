package com.jagex;
public class CPUMaxMemoryPreference extends Preference {

	void setValue(int i_1) {
		this.anInt5578 = i_1;
	}

	public CPUMaxMemoryPreference(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public void method12648() {
		if (this.anInt5578 < 0 && this.anInt5578 > 4) {
			this.anInt5578 = this.getDefaultValue();
		}

	}

	int getDefaultValue() {
		return this.manager.getProcessorSpecs().getProcessorCount() > 1 ? 4 : 2;
	}

	void method7780(int i_1) {
		this.anInt5578 = -754033619 * i_1 * -859024475;
	}

	int checkValid(int i_1) {
		return 1;
	}

	public CPUMaxMemoryPreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	int method7784(int i_1) {
		return 1;
	}

	int method7786() {
		return this.manager.getProcessorSpecs().getProcessorCount() > 1 ? 4 : 2;
	}

	int method7787() {
		return this.manager.getProcessorSpecs().getProcessorCount() > 1 ? 4 : 2;
	}

	public int getValue() {
		return this.anInt5578;
	}

}
