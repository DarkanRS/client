/* Class362 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class362 {
	static final int anInt4186 = 12;
	static final int anInt4187 = 3;
	static final int anInt4188 = 7;
	static final int anInt4189 = 2;
	static final int anInt4190 = 10;
	static final int anInt4191 = 4;
	static final int anInt4192 = 15;
	static final int anInt4193 = 1;
	static final int anInt4194 = 11;
	static final int anInt4195 = 9;
	static final int anInt4196 = 13;
	static final int anInt4197 = 6;
	static final int anInt4198 = 8;
	static final int anInt4199 = 5;
	static final int anInt4200 = 14;

	Class362() throws Throwable {
		throw new Error();
	}

	public static final void method6276(int i) {
		OutputStream_Sub1.anImage7953 = null;
		Class515.aFont5893 = null;
	}

	static final String[] method6277(String[] strings, short i) {
		String[] strings_0_ = new String[5];
		for (int i_1_ = 0; i_1_ < 5; i_1_++) {
			strings_0_[i_1_] = new StringBuilder().append(i_1_).append(" ").toString();
			if (strings != null && null != strings[i_1_])
				strings_0_[i_1_] = new StringBuilder().append(strings_0_[i_1_]).append(strings[i_1_]).toString();
		}
		return strings_0_;
	}

	public static Interface36 getNativeLibraryLoader(int i) {
		if (null == Class404.LIBRARY_LOADER)
			throw new IllegalStateException("");
		return Class404.LIBRARY_LOADER;
	}

	static final void method6279(CS2Executor class527, int i) {
		int i_2_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub20_8207.method7785(i_2_, -915062041);
	}

	static final void method6280(CS2Executor class527, int i) {
		client.aBool7189 = true;
		Class188.method3142(69417195);
	}

	static final void method6281(CS2Executor class527, int i) {
		Class163 class163 = class527.animable.method15811(767923452);
		if (null == class163)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class163.method2829(-766550436);
	}
}
