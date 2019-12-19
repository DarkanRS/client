public class Preference_Sub4 extends Preference {

	public Preference_Sub4(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public int checkValid(int i_1) {
		return !Class60.method1166(this.manager.currentToolkit.getValue(-1381198903), -2081713291) ? 3 : 1;
	}

	public void method12639(byte b_1) {
		if (this.manager.currentToolkit.method12777() && !Class60.method1166(this.manager.currentToolkit.getValue(61504612), 166435291)) {
			this.anInt5578 = 0;
		}

		if (this.anInt5578 < 0 || this.anInt5578 > 2) {
			this.anInt5578 = this.getDefaultValue();
		}

	}

	int getDefaultValue() {
		return 0;
	}

	public int method7784(int i_1) {
		return !Class60.method1166(this.manager.currentToolkit.getValue(340724503), -757986233) ? 3 : 1;
	}

	void setValue(int i_1) {
		this.anInt5578 = i_1;
	}

	public int method12641(int i_1) {
		return this.anInt5578;
	}

	void method7780(int i_1) {
		this.anInt5578 = -754033619 * i_1 * -859024475;
	}

	int method7786() {
		return 0;
	}

	int method7787() {
		return 0;
	}

	public boolean method12646() {
		return Class60.method1166(this.manager.currentToolkit.getValue(-655051522), -271241654);
	}

	public Preference_Sub4(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

}
