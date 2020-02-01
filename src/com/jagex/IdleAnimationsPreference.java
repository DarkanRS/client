package com.jagex;
public class IdleAnimationsPreference extends Preference {

	int getDefaultValue() {
		return 1;
	}

	public IdleAnimationsPreference(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public IdleAnimationsPreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	void setValue(int i_1) {
		this.anInt5578 = i_1;
	}

	public int getValue() {
		return this.anInt5578;
	}

	int method7784(int i_1) {
		return 1;
	}

	int method7786() {
		return 1;
	}

	public void method12741() {
		if (this.manager.getGame() == Game.stellarDawn) {
			this.anInt5578 = 2;
		}

		if (this.anInt5578 < 0 || this.anInt5578 > 2) {
			this.anInt5578 = this.getDefaultValue();
		}

	}

	int checkValid(int i_1) {
		return 1;
	}

	void method7780(int i_1) {
		this.anInt5578 = i_1 * -754033619 * -859024475;
	}

	int method7787() {
		return 1;
	}

	static final void method12746(int i_0, int i_1, int i_2, int i_3) {
		if (i_0 >= Class532_Sub2.anInt7071 && i_0 <= Class532_Sub2.anInt7069) {
			i_1 = EntityNode.method4890(i_1, Class532_Sub2.anInt7070, Class532_Sub2.anInt7068, 2018185590);
			i_2 = EntityNode.method4890(i_2, Class532_Sub2.anInt7070, Class532_Sub2.anInt7068, 1691480210);
			GroundItemStrategy.method13411(i_0, i_1, i_2, i_3, (byte) -31);
		}

	}

}
