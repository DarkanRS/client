/* Class499 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class499 {
	Class348 aClass348_6111 = new Class348(64);
	Class243 aClass243_6112;
	public static Class243 aClass243_6113;

	public Class499(Class411 class411, Class429 class429, Class243 class243) {
		((Class499) this).aClass243_6112 = class243;
		((Class499) this).aClass243_6112.method2316((Class120.aClass120_1436.anInt1460) * -1006924897, 236791533);
	}

	public void method6212(byte i) {
		try {
			synchronized (((Class499) this).aClass348_6111) {
				((Class499) this).aClass348_6111.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uq.f(").append(')').toString());
		}
	}

	public void method6213(int i) {
		try {
			synchronized (((Class499) this).aClass348_6111) {
				((Class499) this).aClass348_6111.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uq.p(").append(')').toString());
		}
	}

	public Class493 method6214(int i, int i_0_) {
		try {
			Class493 class493;
			synchronized (((Class499) this).aClass348_6111) {
				class493 = (Class493) ((Class499) this).aClass348_6111.method4184((long) i);
			}
			if (class493 != null)
				return class493;
			byte[] is;
			synchronized (((Class499) this).aClass243_6112) {
				is = (((Class499) this).aClass243_6112.getFile(-1006924897 * Class120.aClass120_1436.anInt1460, i, (byte) -70));
			}
			class493 = new Class493();
			if (null != is)
				class493.method6186(new RsByteBuffer(is), -420636240);
			synchronized (((Class499) this).aClass348_6111) {
				((Class499) this).aClass348_6111.method4194(class493, (long) i);
			}
			return class493;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uq.a(").append(')').toString());
		}
	}

	public void method6215(int i, int i_1_) {
		try {
			synchronized (((Class499) this).aClass348_6111) {
				((Class499) this).aClass348_6111.method4186(i, -862651401);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uq.b(").append(')').toString());
		}
	}

	static Class411[] method6216(byte i) {
		try {
			return (new Class411[] { Class411.aClass411_5318, Class411.aClass411_5320, Class411.aClass411_5316, Class411.aClass411_5319, Class411.aClass411_5321 });
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uq.a(").append(')').toString());
		}
	}

	static final void method6217(ClientScript2 class403, int i) {
		try {
			Class319.method3903((byte) 11);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uq.wg(").append(')').toString());
		}
	}

	static final void method6218(IComponentDefinition class105, Class119 class119, ClientScript2 class403, byte i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -1825255771) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1264 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uq.lu(").append(')').toString());
		}
	}
}
