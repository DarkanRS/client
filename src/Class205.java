/* Class205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class205 {
	Class243 aClass243_2338;
	public int anInt2339;
	Class348 aClass348_2340 = new Class348(64);
	static long aLong2341;

	public Class207 method1914(int i, int i_0_) {
		try {
			Class207 class207;
			synchronized (((Class205) this).aClass348_2340) {
				class207 = (Class207) ((Class205) this).aClass348_2340.method4184((long) i);
			}
			if (null != class207)
				return class207;
			byte[] is;
			synchronized (((Class205) this).aClass243_2338) {
				is = (((Class205) this).aClass243_2338.method2315(-1006924897 * Class120.aClass120_1421.anInt1460, i, (byte) -4));
			}
			class207 = new Class207();
			if (null != is)
				class207.method1927(new RsByteBuffer(is), 27685189);
			synchronized (((Class205) this).aClass348_2340) {
				((Class205) this).aClass348_2340.method4194(class207, (long) i);
			}
			return class207;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("iq.a(").append(')').toString());
		}
	}

	public void method1915(int i) {
		try {
			synchronized (((Class205) this).aClass348_2340) {
				((Class205) this).aClass348_2340.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("iq.f(").append(')').toString());
		}
	}

	public void method1916(int i, byte i_1_) {
		try {
			synchronized (((Class205) this).aClass348_2340) {
				((Class205) this).aClass348_2340.method4186(i, -355539463);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("iq.b(").append(')').toString());
		}
	}

	public void method1917(byte i) {
		try {
			synchronized (((Class205) this).aClass348_2340) {
				((Class205) this).aClass348_2340.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("iq.p(").append(')').toString());
		}
	}

	public Class205(Class411 class411, Class429 class429, Class243 class243) {
		((Class205) this).aClass243_2338 = class243;
		if (null != ((Class205) this).aClass243_2338)
			anInt2339 = (((Class205) this).aClass243_2338.method2316(Class120.aClass120_1421.anInt1460 * -1006924897, 487068051)) * 1946957321;
		else
			anInt2339 = 0;
	}

	static void method1918(Class335 class335, byte i) {
		try {
			class335.aClass365_Sub1_3616 = null;
			synchronized (Class335.aStack3619) {
				if (Class335.aStack3619.size() < 200)
					Class335.aStack3619.push(class335);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("iq.f(").append(')').toString());
		}
	}
}
