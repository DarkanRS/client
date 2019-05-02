public class Preference_Sub27 extends Preference {

	public Preference_Sub27(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public void method12950(int i_1) {
		if (this.manager.aPreference_Sub29_8201.method13050() == 2 && this.anInt5578 == 2) {
			this.anInt5578 = 1;
		}

		if (this.anInt5578 < 0 || this.anInt5578 > 2) {
			this.anInt5578 = this.method7781(1796950750);
		}

	}

	int method7784(int i_1) {
		return 1;
	}

	int method7785(int i_1) {
		return 1;
	}

	void setValue(int i_1) {
		this.anInt5578 = i_1;
	}

	public int method12952(byte b_1) {
		return this.anInt5578;
	}

	void method7780(int i_1) {
		this.anInt5578 = i_1 * -754033619 * -859024475;
	}

	int method7786() {
		return 2;
	}

	int method7787() {
		return 2;
	}

	public Preference_Sub27(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	int method7781(int i_1) {
		return 2;
	}

	static void method12958() {
		Class180.aClass229_2245.method3859();
	}

}
