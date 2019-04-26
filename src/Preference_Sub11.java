public class Preference_Sub11 extends Preference {

	void method7783(int i_1) {
		this.anInt5578 = i_1;
	}

	int method7784(int i_1) {
		return 1;
	}

	int method7781(int i_1) {
		return 0;
	}

	int method7785(int i_1, int i_2) {
		return 1;
	}

	public Preference_Sub11(int i_1, Node_Sub54 class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public void method12698() {
	}

	public int method12699(byte b_1) {
		return this.anInt5578;
	}

	void method7780(int i_1) {
		this.anInt5578 = i_1 * -754033619 * -859024475;
	}

	int method7786() {
		return 0;
	}

	int method7787() {
		return 0;
	}

	public Preference_Sub11(Node_Sub54 class282_sub54_1) {
		super(class282_sub54_1);
	}

	public static int method12702(int i_0, int i_1, int i_2) {
		if (Class291_Sub1.anInt8015 < 100) {
			return -2;
		} else {
			int i_4 = -2;
			int i_5 = Integer.MAX_VALUE;
			int i_6 = i_1 - Class291_Sub1.anInt3472;
			int i_7 = i_2 - Class291_Sub1.anInt3473;

			for (Node_Sub36 class282_sub36_8 = (Node_Sub36) Class291_Sub1.aClass482_3459.head(); class282_sub36_8 != null; class282_sub36_8 = (Node_Sub36) Class291_Sub1.aClass482_3459.next(317938751)) {
				if (i_0 == class282_sub36_8.anInt7991) {
					int i_9 = class282_sub36_8.anInt7987;
					int i_10 = class282_sub36_8.anInt7993;
					int i_11 = i_9 + Class291_Sub1.anInt3472 << 14 | i_10 + Class291_Sub1.anInt3473;
					int i_12 = (i_6 - i_9) * (i_6 - i_9) + (i_7 - i_10) * (i_7 - i_10);
					if (i_4 < 0 || i_12 < i_5) {
						i_4 = i_11;
						i_5 = i_12;
					}
				}
			}

			return i_4;
		}
	}

}
