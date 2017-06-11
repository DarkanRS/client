/* Class422_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class422_Sub27 extends Class422 {
	public static int anInt8431 = 1;
	public static int anInt8432 = 0;

	public Class422_Sub27(int i, Class298_Sub48 class298_sub48) {
		super(i, class298_sub48);
	}

	public Class422_Sub27(Class298_Sub48 class298_sub48) {
		super(class298_sub48);
	}

	void method5610(int i) {
		anInt5350 = i * 1886334997;
	}

	int method5612(int i, int i_0_) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aep.f(").append(')').toString());
		}
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = i * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aep.p(").append(')').toString());
		}
	}

	public int method5720(byte i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aep.z(").append(')').toString());
		}
	}

	int method5615() {
		return 0;
	}

	int method5616(int i) {
		return 1;
	}

	int method5611(int i) {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aep.a(").append(')').toString());
		}
	}

	public void method5721(byte i) {
		try {
			if (1 != -1598873795 * anInt5350 && anInt5350 * -1598873795 != 0)
				anInt5350 = method5611(181111129) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aep.s(").append(')').toString());
		}
	}

	static final void method5722(IComponentDefinition class105, ClientScript2 class403, int i) {
		try {
			if (-300634099 * ((ClientScript2) class403).anInt5254 >= 10)
				throw new RuntimeException();
			if (class105.anObjectArray1164 != null) {
				Script class298_sub46 = new Script();
				class298_sub46.aClass105_7525 = class105;
				class298_sub46.params = class105.anObjectArray1164;
				((Script) class298_sub46).anInt7524 = (1954090355 * ((ClientScript2) class403).anInt5254 + -171453569);
				client.aClass453_8893.method5935(class298_sub46, -201281014);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aep.qv(").append(')').toString());
		}
	}
}
