/* Class504 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class504 {
	Class243 aClass243_6194;
	Class348 aClass348_6195 = new Class348(64);
	public static Class375 aClass375_6196;

	public void method6248(int i) {
		try {
			synchronized (((Class504) this).aClass348_6195) {
				((Class504) this).aClass348_6195.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uv.p(").append(')').toString());
		}
	}

	public Class504(Class411 class411, Class429 class429, Class243 class243) {
		((Class504) this).aClass243_6194 = class243;
		if (null != ((Class504) this).aClass243_6194)
			((Class504) this).aClass243_6194.method2316(Class120.aClass120_1416.anInt1460 * -1006924897, 1020653544);
	}

	public void method6249(int i, byte i_0_) {
		try {
			synchronized (((Class504) this).aClass348_6195) {
				((Class504) this).aClass348_6195.method4186(i, -2004411058);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uv.b(").append(')').toString());
		}
	}

	public void method6250(int i) {
		try {
			synchronized (((Class504) this).aClass348_6195) {
				((Class504) this).aClass348_6195.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uv.f(").append(')').toString());
		}
	}

	public Class497 method6251(int i, int i_1_) {
		try {
			Class497 class497;
			synchronized (((Class504) this).aClass348_6195) {
				class497 = (Class497) ((Class504) this).aClass348_6195.method4184((long) i);
			}
			if (class497 != null)
				return class497;
			byte[] is;
			synchronized (((Class504) this).aClass243_6194) {
				is = (((Class504) this).aClass243_6194.method2315(-1006924897 * Class120.aClass120_1416.anInt1460, i, (byte) -62));
			}
			class497 = new Class497();
			if (is != null)
				class497.method6204(new RsByteBuffer(is), -1070488617);
			synchronized (((Class504) this).aClass348_6195) {
				((Class504) this).aClass348_6195.method4194(class497, (long) i);
			}
			return class497;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uv.a(").append(')').toString());
		}
	}

	static final void method6252(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			boolean bool = ((((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) == 1);
			Class311.method3817(string, bool, 729356820);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class344.anInt3688 * 367592105;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uv.adv(").append(')').toString());
		}
	}
}
