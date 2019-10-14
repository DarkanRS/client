public class SoundLevelPreference extends Preference {

	public SoundLevelPreference(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public void method12712(byte b_1) {
		if (this.anInt5578 < 0 && this.anInt5578 > 127) {
			this.anInt5578 = this.getDefaultValue();
		}
	}

	public SoundLevelPreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	int checkValid(int i_1) {
		return 1;
	}

	void setValue(int i_1) {
		this.anInt5578 = i_1;
	}

	public int method12714() {
		return this.anInt5578;
	}

	int method7786() {
		return 127;
	}

	int method7784(int i_1) {
		return 1;
	}

	int method7787() {
		return 127;
	}

	int getDefaultValue() {
		return 127;
	}

	void method7780(int i_1) {
		this.anInt5578 = -754033619 * i_1 * -859024475;
	}
}
