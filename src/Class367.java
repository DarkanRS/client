/* Class367 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class367 {
	public static Class367 aClass367_3982;
	public static Class367 aClass367_3983;
	static Class367 aClass367_3984;
	public int anInt3985;
	public int anInt3986;
	public static Class367 aClass367_3987 = new Class367(0, 2, 2, 1);
	static Class367 aClass367_3988;
	static Class367 aClass367_3989;
	static Class367 aClass367_3990;
	public static Class367 aClass367_3991;
	static Class367 aClass367_3992;
	static Class367 aClass367_3993;
	static Class367 aClass367_3994;
	static Class367 aClass367_3995;
	public int anInt3996;
	public static Class367 aClass367_3997;
	public int anInt3998;
	public static Class367 aClass367_3999 = new Class367(1, 2, 2, 0);
	public static int anInt4000;
	public static Class57 aClass57_4001;

	Class367(int i, int i_0_, int i_1_, int i_2_) {
		anInt3996 = i * 1137854245;
		anInt3986 = -1437469861 * i_0_;
		anInt3998 = -1982815013 * i_1_;
		anInt3985 = -138487417 * i_2_;
	}

	static {
		aClass367_3994 = new Class367(2, 4, 4, 0);
		aClass367_3990 = new Class367(4, 1, 1, 1);
		aClass367_3982 = new Class367(6, 0, 4, 2);
		aClass367_3983 = new Class367(7, 0, 1, 1);
		aClass367_3988 = new Class367(8, 0, 4, 1);
		aClass367_3989 = new Class367(9, 0, 4, 1);
		aClass367_3997 = new Class367(10, 2, 2, 0);
		aClass367_3991 = new Class367(11, 0, 1, 2);
		aClass367_3992 = new Class367(12, 0, 1, 0);
		aClass367_3993 = new Class367(13, 0, 1, 0);
		aClass367_3984 = new Class367(14, 0, 4, 1);
		aClass367_3995 = new Class367(15, 0, 1, 0);
	}

	static final void method4549(ClientScript2 class403, byte i) {
		try {
			if (null != Class225.aClass162_2512) {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1;
				((ClientScript2) class403).aClass162_5252 = Class225.aClass162_2512;
			} else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pg.xh(").append(')').toString());
		}
	}

	static int method4550(char c, Class429 class429, int i) {
		try {
			int i_3_ = c << 4;
			if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
				int i_4_ = Character.toLowerCase(c);
				i_3_ = (i_4_ << 4) + 1;
			}
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pg.p(").append(')').toString());
		}
	}

	static void method4551(IComponentDefinition class105, int i, int i_5_, int i_6_) {
		try {
			Class117 class117 = class105.method1116(Class373.aClass_ra4071, 1629882987);
			if (null != class117) {
				Class373.aClass_ra4071.r(i, i_5_, -2093041337 * class105.anInt1156 + i, (i_5_ + class105.anInt1162 * 457937409));
				if (Class3.anInt56 * -64305285 < 3) {
					int i_7_ = (int) -client.aFloat8949;
					i_7_ = i_7_ + -1840255270 * client.anInt8801 & 0x3fff;
					i_7_ <<= 2;
					Class144.aClass57_1562.method639(((float) i + (float) (class105.anInt1156 * -2093041337) / 2.0F), ((float) i_5_ + (float) (class105.anInt1162 * 457937409) / 2.0F), 4135, i_7_, class117.aClass_ta1397, i, i_5_);
				} else
					Class373.aClass_ra4071.DA(-16777216, class117.aClass_ta1397, i, i_5_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pg.lp(").append(')').toString());
		}
	}

	static final void method4552(ClientScript2 class403, int i) {
		try {
			int i_8_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_8_, (byte) -5);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.aBoolean1161 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pg.rf(").append(')').toString());
		}
	}
}
