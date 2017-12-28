/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class81 {
	static Class108[] aClass108Array798 = new Class108[100];
	static final int anInt799 = 100;
	static int anInt800;
	static int anInt801 = 0;
	static Class152 aClass152_802;
	static int anInt803;

	public static void method1436() {
		for (int i = 0; i < 100; i++)
			aClass108Array798[i] = null;
		anInt800 = 0;
	}

	public static void method1437(String string) {
		Class191.method3167(0, 0, "", "", "", string, 1639798109);
	}

	static int method1438() {
		return (anInt801 += 970031329) * -1976319199 - 1;
	}

	static int method1439() {
		return (anInt801 += 970031329) * -1976319199 - 1;
	}

	public static void method1440(String string) {
		Class191.method3167(0, 0, "", "", "", string, 683584562);
	}

	public static void method1441(int i, String string) {
		Class191.method3167(i, 0, "", "", "", string, 1140192579);
	}

	public static void method1442(int i, String string) {
		Class191.method3167(i, 0, "", "", "", string, 1065054685);
	}

	public static void method1443(int i, String string) {
		Class191.method3167(i, 0, "", "", "", string, 761964139);
	}

	Class81() throws Throwable {
		throw new Error();
	}

	public static void method1444(int i, int i_0_, String string, String string_1_, String string_2_, String string_3_) {
		Class340.method6070(i, i_0_, string, string_1_, string_2_, string_3_, null, -1, 30927485);
	}

	public static void method1445(int i, int i_4_, String string, String string_5_, String string_6_, String string_7_, String string_8_, int i_9_) {
		Class108 class108 = aClass108Array798[99];
		for (int i_10_ = 99; i_10_ > 0; i_10_--)
			aClass108Array798[i_10_] = aClass108Array798[i_10_ - 1];
		if (null == class108)
			class108 = new Class108(i, i_4_, string, string_5_, string_6_, string_8_, i_9_, string_7_);
		else
			class108.method1840(i, i_4_, string, string_5_, string_6_, string_8_, i_9_, string_7_, 34167);
		aClass108Array798[0] = class108;
		anInt800 += 809055037;
		client.anInt7391 = -1529209901 * client.anInt7347;
	}

	public static Class108 method1446(int i) {
		if (i < 0 || i >= 100)
			return null;
		return aClass108Array798[i];
	}

	public static Class108 method1447(int i) {
		if (i < 0 || i >= 100)
			return null;
		return aClass108Array798[i];
	}

	public static int method1448() {
		return -1824080875 * anInt800;
	}

	public static void method1449() {
		for (int i = 0; i < 100; i++)
			aClass108Array798[i] = null;
		anInt800 = 0;
	}

	public static void method1450(String string) {
		Class191.method3167(0, 0, "", "", "", string, 1962091417);
	}

	public static void method1451() {
		for (int i = 0; i < 100; i++)
			aClass108Array798[i] = null;
		anInt800 = 0;
	}

	static final void method1452(Class527 class527, int i) {
		String string = (String) (((Class527) class527).anObjectArray7019[(((Class527) class527).anInt7000 -= 1476624725) * 1806726141]);
		Class16.method567(string, false, (byte) -20);
	}

	static final boolean method1453(int[][] is, int[][] is_11_, int i, int i_12_, int i_13_, int i_14_, int i_15_, byte i_16_) {
		for (int i_17_ = i_12_; i_17_ <= i_14_; i_17_++) {
			for (int i_18_ = i_13_; i_18_ <= i_15_; i_18_++) {
				if (i == is[i_17_][i_18_] && is_11_[i_17_][i_18_] <= 1)
					return true;
			}
		}
		return false;
	}
}
