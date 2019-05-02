public class WaterPreference extends Preference {

	public WaterPreference(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public void method12918() {
		if (this.anInt5578 < 0 && this.anInt5578 > 2) {
			this.anInt5578 = this.method7781(1956037542);
		}
	}

	int method7781(int i_1) {
		return 1;
	}

	void setValue(int i_1) {
		this.anInt5578 = i_1;
	}

	void method7780(int i_1) {
		this.anInt5578 = i_1 * -754033619 * -859024475;
	}

	public int getValue() {
		return this.anInt5578;
	}

	public int method7784(int i_1) {
		return i_1 != 0 && this.manager.aPreference_Sub17_8200.method12762(1640668889) != 1 ? 2 : 1;
	}

	public WaterPreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	int method7786() {
		return 1;
	}

	int method7787() {
		return 1;
	}

	public int method7785(int i_1) {
		return i_1 != 0 && this.manager.aPreference_Sub17_8200.method12762(182985530) != 1 ? 2 : 1;
	}

	public boolean method12923() {
		return true;
	}
}
