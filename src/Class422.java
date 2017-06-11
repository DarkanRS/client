/* Class422 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class422 {
	protected Class298_Sub48 aClass298_Sub48_5346;
	protected static int anInt5347 = 2;
	protected static int anInt5348 = 1;
	public static int anInt5349 = 3;
	protected int anInt5350;
	static Class57[] aClass57Array5351;

	abstract void method5610(int i);

	abstract int method5611(int i);

	abstract int method5612(int i, int i_0_);

	void method5613(int i, int i_1_) {
		try {
			if (method5612(i, 1352882135) != 3)
				method5614(i, -1655060812);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rm.b(").append(')').toString());
		}
	}

	abstract void method5614(int i, int i_2_);

	abstract int method5615();

	Class422(Class298_Sub48 class298_sub48) {
		aClass298_Sub48_5346 = class298_sub48;
		anInt5350 = method5611(-1613011239) * 1886334997;
	}

	Class422(int i, Class298_Sub48 class298_sub48) {
		anInt5350 = i * 1886334997;
		aClass298_Sub48_5346 = class298_sub48;
	}

	abstract int method5616(int i);

	public static void method5617(byte i) {
		try {
			for (int i_3_ = 0; i_3_ < -991384187 * Class300.anInt3213; i_3_++) {
				Class297 class297 = Class300.aClass297Array3214[i_3_];
				if (((Class297) class297).aByte3176 == 3)
					Class405.method4957(class297, (short) 22686);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rm.w(").append(')').toString());
		}
	}

	static final void method5618(ClientScript2 class403, int i) {
		try {
			Class116.method1272(327778485);
			client.aClass283_8716.method2667(382492199);
			Class3.method300(656179282);
			client.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rm.amc(").append(')').toString());
		}
	}

	static int method5619(CharSequence charsequence, int i, boolean bool, int i_4_) {
		try {
			if (i < 2 || i > 36)
				throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
			boolean bool_5_ = false;
			boolean bool_6_ = false;
			int i_7_ = 0;
			int i_8_ = charsequence.length();
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				int i_10_ = charsequence.charAt(i_9_);
				if (0 == i_9_) {
					if (45 == i_10_) {
						bool_5_ = true;
						continue;
					}
					if (43 == i_10_ && bool) {
						if (i_4_ >= 543732116) {
							/* empty */
						}
						continue;
					}
				}
				if (i_10_ >= 48 && i_10_ <= 57)
					i_10_ -= 48;
				else if (i_10_ >= 65 && i_10_ <= 90)
					i_10_ -= 55;
				else if (i_10_ >= 97 && i_10_ <= 122)
					i_10_ -= 87;
				else
					throw new NumberFormatException();
				if (i_10_ >= i)
					throw new NumberFormatException();
				if (bool_5_)
					i_10_ = -i_10_;
				int i_11_ = i_7_ * i + i_10_;
				if (i_11_ / i != i_7_)
					throw new NumberFormatException();
				i_7_ = i_11_;
				bool_6_ = true;
			}
			if (!bool_6_)
				throw new NumberFormatException();
			return i_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rm.d(").append(')').toString());
		}
	}

	static void method5620(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 2] = (Class316.aClass362_3318.method4307((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 2]), 245040087).method4567(Class128.aClass148_6331, (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 - 1]), -1119994003)) ? 1 : 0;
			((ClientScript2) class403).anInt5239 -= -391880689;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rm.v(").append(')').toString());
		}
	}

	static final boolean method5621(char c, int i) {
		try {
			if (Character.isISOControl(c))
				return false;
			if (ObjectDefinitions.method5788(c, (short) 160))
				return true;
			char[] cs = Class511.aCharArray6225;
			for (int i_12_ = 0; i_12_ < cs.length; i_12_++) {
				char c_13_ = cs[i_12_];
				if (c_13_ == c)
					return true;
			}
			cs = Class511.aCharArray6223;
			for (int i_14_ = 0; i_14_ < cs.length; i_14_++) {
				char c_15_ = cs[i_14_];
				if (c_15_ == c)
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rm.f(").append(')').toString());
		}
	}

	static final void method5622(ClientScript2 class403, short i) {
		try {
			Class82_Sub18.method922((byte) -40);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rm.ags(").append(')').toString());
		}
	}

	public static void method5623(int i, int i_16_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(4, (long) i);
			class298_sub37_sub12.method3445(-926993583);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rm.u(").append(')').toString());
		}
	}
}
