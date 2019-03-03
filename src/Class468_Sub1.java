public class Class468_Sub1 extends Preference {

	public Class468_Sub1(Class282_Sub54 class282_sub54_1) {
		super(class282_sub54_1);
	}

	void method7783(int i_1, int i_2) {
		this.anInt5578 = i_1;
	}

	int method7781(int i_1) {
		return Class106.aClass106_1075.anInt1071;
	}

	public boolean method12609(int i_1) {
		int i_2 = this.manager.method13504((byte) 1).method7721(-1148008427);
		return i_2 >= 245;
	}

	public int method7785(int i_1, int i_2) {
		int i_3 = this.manager.method13504((byte) 1).method7721(-1778990032);
		return i_3 < 245 ? 3 : (i_1 == Class106.aClass106_1073.anInt1071 && i_3 < 500 ? 3 : 1);
	}

	public Class468_Sub1(int i_1, Class282_Sub54 class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public int method7784(int i_1) {
		int i_2 = this.manager.method13504((byte) 1).method7721(-141998405);
		return i_2 < 245 ? 3 : (Class106.aClass106_1073.anInt1071 * -827615537 * -530599889 == i_1 && i_2 < 500 ? 3 : 1);
	}

	void method7780(int i_1) {
		this.anInt5578 = i_1 * -754033619 * -859024475;
	}

	int method7786() {
		return -530599889 * Class106.aClass106_1075.anInt1071 * -827615537;
	}

	int method7787() {
		return -530599889 * Class106.aClass106_1075.anInt1071 * -827615537;
	}

	public int method12615(int i_1) {
		return this.anInt5578;
	}

	public void method12616(byte b_1) {
		int i_2 = this.manager.method13504((byte) 1).method7721(-410330652);
		if (i_2 < 245) {
			this.anInt5578 = Class106.aClass106_1075.anInt1071;
		}

		if (this.anInt5578 == Class106.aClass106_1073.anInt1071 && i_2 < 500) {
			this.anInt5578 = Class106.aClass106_1072.anInt1071;
		}

		if (this.anInt5578 < Class106.aClass106_1075.anInt1071 || this.anInt5578 > Class106.aClass106_1070.anInt1071) {
			this.anInt5578 = this.method7781(1738483379);
		}

	}

	static boolean method12619(int i_0) {
		return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5877, (byte) 78);
	}

	static int method12620(Class217_Sub1 class217_sub1_0, Class217_Sub1 class217_sub1_1, int i_2, boolean bool_3, int i_4) {
		int i_5;
		int i_6;
		if (i_2 == 1) {
			i_5 = class217_sub1_0.anInt2701;
			i_6 = class217_sub1_1.anInt2701;
			if (!bool_3) {
				if (i_5 == -1) {
					i_5 = 2001;
				}

				if (i_6 == -1) {
					i_6 = 2001;
				}
			}

			return i_5 - i_6;
		} else if (i_2 == 2) {
			return Class455.method7557(class217_sub1_0.method13055((short) -16309).aString2679, class217_sub1_1.method13055((short) -9222).aString2679, Class223.CURRENT_LANGUAGE, 1341608337);
		} else if (i_2 == 3) {
			return class217_sub1_0.aString7977.equals("-") ? (class217_sub1_1.aString7977.equals("-") ? 0 : (bool_3 ? -1 : 1)) : (class217_sub1_1.aString7977.equals("-") ? (bool_3 ? 1 : -1) : Class455.method7557(class217_sub1_0.aString7977, class217_sub1_1.aString7977, Class223.CURRENT_LANGUAGE, 1341608337));
		} else if (i_2 == 4) {
			return class217_sub1_0.method3683(-1211254734) ? (class217_sub1_1.method3683(-1211254734) ? 0 : 1) : (class217_sub1_1.method3683(-1211254734) ? -1 : 0);
		} else if (i_2 == 5) {
			return class217_sub1_0.method3681(-2014911671) ? (class217_sub1_1.method3681(279232100) ? 0 : 1) : (class217_sub1_1.method3681(-1241607378) ? -1 : 0);
		} else if (i_2 == 6) {
			return class217_sub1_0.method3682((short) -32433) ? (class217_sub1_1.method3682((short) -19177) ? 0 : 1) : (class217_sub1_1.method3682((short) -3375) ? -1 : 0);
		} else if (i_2 == 7) {
			return class217_sub1_0.method3680((byte) 1) ? (class217_sub1_1.method3680((byte) 1) ? 0 : 1) : (class217_sub1_1.method3680((byte) 1) ? -1 : 0);
		} else if (i_2 == 8) {
			i_5 = class217_sub1_0.anInt7978;
			i_6 = class217_sub1_1.anInt7978;
			if (bool_3) {
				if (i_5 == 1000) {
					i_5 = -1;
				}

				if (i_6 == 1000) {
					i_6 = -1;
				}
			} else {
				if (i_5 == -1) {
					i_5 = 1000;
				}

				if (i_6 == -1) {
					i_6 = 1000;
				}
			}

			return i_5 - i_6;
		} else {
			return class217_sub1_0.anInt7975 - class217_sub1_1.anInt7975;
		}
	}

}
