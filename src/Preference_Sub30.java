public class Preference_Sub30 extends Preference {

	public Preference_Sub30(int i_1, Node_Sub54 class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public void method13415() {
		if (this.anInt5578 != 0 && this.manager.aPreference_Sub17_8200.method12762(1488967501) != 1) {
			this.anInt5578 = 0;
		}

		if (this.anInt5578 != 0 && this.manager.aPreference_Sub29_8201.method13050() == 2) {
			this.anInt5578 = 0;
		}

		if (this.anInt5578 < 0 || this.anInt5578 > 1) {
			this.anInt5578 = this.method7781(1923702795);
		}

	}

	int method7781(int i_1) {
		return 1;
	}

	public Preference_Sub30(Node_Sub54 class282_sub54_1) {
		super(class282_sub54_1);
	}

	public int method7785(int i_1, int i_2) {
		return i_1 != 0 && this.manager.aPreference_Sub29_8201.method13050() == 2 ? 3 : (i_1 != 0 && this.manager.aPreference_Sub17_8200.method12762(410905125) != 1 ? 2 : 1);
	}

	public int method13417(int i_1) {
		return this.anInt5578;
	}

	public int method7784(int i_1) {
		return i_1 != 0 && this.manager.aPreference_Sub29_8201.method13050() == 2 ? 3 : (i_1 != 0 && this.manager.aPreference_Sub17_8200.method12762(-1758430035) != 1 ? 2 : 1);
	}

	void method7780(int i_1) {
		this.anInt5578 = i_1 * -754033619 * -859024475;
	}

	int method7786() {
		return 1;
	}

	int method7787() {
		return 1;
	}

	public boolean method13421() {
		return true;
	}

	void method7783(int i_1) {
		this.anInt5578 = i_1;
	}

	static int method13422(char var_0, Language xlanguage_1) {
		int i_3 = var_0 << 4;
		if (Character.isUpperCase(var_0) || Character.isTitleCase(var_0)) {
			char var_4 = Character.toLowerCase(var_0);
			i_3 = (var_4 << 4) + 1;
		}

		return i_3;
	}

}
