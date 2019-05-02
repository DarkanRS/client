public class SafeModePreference extends Preference {

	int method7787() {
		return 0;
	}

	public int getValue(byte b_1) {
		return this.anInt5578;
	}

	public SafeModePreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	void setValue(int i_1) {
		this.anInt5578 = i_1;
	}

	int method7785(int i_1) {
		return 1;
	}

	public void method12928() {
		if (this.anInt5578 != 1 && this.anInt5578 != 0) {
			this.anInt5578 = this.method7781(1979417411);
		}
	}

	int method7784(int i_1) {
		return 1;
	}

	void method7780(int i_1) {
		this.anInt5578 = -754033619 * i_1 * -859024475;
	}

	int method7786() {
		return 0;
	}

	public SafeModePreference(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	int method7781(int i_1) {
		return 0;
	}
}
