/* Class444 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class444 {
	public static Class444 aClass444_5602;
	public static Class444 aClass444_5603;
	public static Class444 aClass444_5604 = new Class444("LIVE", 0);
	public static Class444 aClass444_5605;
	static Class444 aClass444_5606;
	public String aString5607;
	public int anInt5608;

	static {
		aClass444_5603 = new Class444("BUILDLIVE", 3);
		aClass444_5602 = new Class444("RC", 1);
		aClass444_5605 = new Class444("WIP", 2);
		aClass444_5606 = new Class444("INTBETA", 4);
	}

	Class444(String string, int i) {
		aString5607 = string;
		anInt5608 = i * -1854515921;
	}

	public static Class444 method5888(int i, byte i_0_) {
		try {
			Class444[] class444s = Class408.method4965((byte) 16);
			for (int i_1_ = 0; i_1_ < class444s.length; i_1_++) {
				Class444 class444 = class444s[i_1_];
				if (i == class444.anInt5608 * 1286017487)
					return class444;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("si.f(").append(')').toString());
		}
	}

	public static void method5889(Script class298_sub46, byte i) {
		try {
			Class203.method1908(class298_sub46, 200000, (short) 3156);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("si.b(").append(')').toString());
		}
	}

	static void method5890(byte i) {
		try {
			if (Class78.aFileOutputStream731 != null) {
				try {
					Class78.aFileOutputStream731.close();
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			Class78.aFileOutputStream731 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("si.i(").append(')').toString());
		}
	}
}
