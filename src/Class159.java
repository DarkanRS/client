/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class159 {
	public static Class450 aClass450_2010;

	public static String method2733(String string) {
		int i = string.length();
		int i_0_ = 0;
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			char c = string.charAt(i_1_);
			if ('<' == c || c == '>')
				i_0_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i_0_ + i);
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			char c = string.charAt(i_2_);
			if (c == '<')
				stringbuilder.append("<lt>");
			else if ('>' == c)
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	Class159() throws Throwable {
		throw new Error();
	}

	public static final boolean method2734(String string, String string_3_, String string_4_, String string_5_, byte i) {
		do {
			if (string != null) {
				if (i >= -1) {
					/* empty */
				}
				if (string_4_ != null)
					break;
				if (i >= -1)
					throw new IllegalStateException();
			}
			return false;
		} while (false);
		while_184_: do {
			do {
				if (!string.startsWith("#")) {
					if (i >= -1)
						throw new IllegalStateException();
					if (!string_4_.startsWith("#"))
						break while_184_;
					if (i < -1)
						break;
				}
			} while (false);
			return string.equals(string_4_);
		} while (false);
		return string_3_.equals(string_5_);
	}

	static final int method2735(int i, int i_6_, int i_7_, int i_8_) {
		int i_9_ = i / i_7_;
		int i_10_ = i & i_7_ - 1;
		int i_11_ = i_6_ / i_7_;
		int i_12_ = i_6_ & i_7_ - 1;
		int i_13_ = Class241.method4151(i_9_, i_11_, 1156456439);
		int i_14_ = Class241.method4151(i_9_ + 1, i_11_, 1156456439);
		int i_15_ = Class241.method4151(i_9_, i_11_ + 1, 1156456439);
		int i_16_ = Class241.method4151(1 + i_9_, 1 + i_11_, 1156456439);
		int i_17_ = Class430.method7220(i_13_, i_14_, i_10_, i_7_, -1918782622);
		int i_18_ = Class430.method7220(i_15_, i_16_, i_10_, i_7_, -1190208643);
		return Class430.method7220(i_17_, i_18_, i_12_, i_7_, -1754820522);
	}

	public static void method2736(long[] ls, int[] is, byte i) {
		Class497.method8316(ls, is, 0, ls.length - 1, -1763921861);
	}

	static final void method2737(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = 100 == -8084891 * Class291_Sub1.anInt8015 ? 1 : 0;
	}

	static void method2738(Class98 class98, int i, int i_19_, int i_20_, boolean bool, CS2Executor class527, int i_21_) {
		if (0 == i_19_)
			throw new RuntimeException();
		Class118 class118 = class98.aClass118Array998[i];
		if (class118.aClass118Array1438 == null) {
			class118.aClass118Array1438 = new Class118[1 + i_20_];
			class118.aClass118Array1439 = class118.aClass118Array1438;
		}
		if (class118.aClass118Array1438.length <= i_20_) {
			if (class118.aClass118Array1438 == class118.aClass118Array1439) {
				Class118[] class118s = new Class118[i_20_ + 1];
				for (int i_22_ = 0; i_22_ < class118.aClass118Array1438.length; i_22_++)
					class118s[i_22_] = class118.aClass118Array1438[i_22_];
				class118.aClass118Array1438 = class118.aClass118Array1439 = class118s;
			} else {
				Class118[] class118s = new Class118[i_20_ + 1];
				Class118[] class118s_23_ = new Class118[i_20_ + 1];
				for (int i_24_ = 0; i_24_ < class118.aClass118Array1438.length; i_24_++) {
					class118s[i_24_] = class118.aClass118Array1438[i_24_];
					class118s_23_[i_24_] = class118.aClass118Array1439[i_24_];
				}
				class118.aClass118Array1438 = class118s;
				class118.aClass118Array1439 = class118s_23_;
			}
		}
		if (i_20_ > 0 && class118.aClass118Array1438[i_20_ - 1] == null)
			throw new RuntimeException(new StringBuilder().append("").append(i_20_ - 1).toString());
		Class118 class118_25_ = new Class118();
		class118_25_.anInt1268 = i_19_ * 720825663;
		class118_25_.anInt1305 = (class118_25_.anInt1287 = 1 * class118.anInt1287) * 1571006651;
		class118_25_.anInt1288 = -646708263 * i_20_;
		class118.aClass118Array1438[i_20_] = class118_25_;
		if (class118.aClass118Array1438 != class118.aClass118Array1439)
			class118.aClass118Array1439[i_20_] = class118_25_;
		UnderlayDefinition class513;
		if (bool)
			class513 = ((CS2Executor) class527).aClass513_6994;
		else
			class513 = ((CS2Executor) class527).aClass513_7007;
		((UnderlayDefinition) class513).aClass98_5885 = class98;
		((UnderlayDefinition) class513).aClass118_5886 = class118_25_;
		Class109.method1858(class118, (byte) -95);
	}

	public static int method2739(int i, int i_26_) {
		int i_27_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_27_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_27_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_27_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_27_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_27_++;
		}
		return i_27_ + i;
	}

	public static void method2740(Interface36 interface36, int i) {
		if (Class404.anInterface36_4830 != null)
			throw new IllegalStateException("");
		Class404.anInterface36_4830 = interface36;
	}

	static final void method2741(Class118 class118, Class98 class98, CS2Executor class527, byte i) {
		Class118 class118_28_ = class118;
		boolean bool;
		if ((((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]) == 1) {
			if (i == -1) {
				/* empty */
			}
			bool = true;
		} else
			bool = false;
		class118_28_.aBool1327 = bool;
		Class109.method1858(class118, (byte) 1);
	}
}
