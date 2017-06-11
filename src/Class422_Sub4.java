/* Class422_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class422_Sub4 extends Class422 {
	public static int anInt8373 = 2;
	public static int anInt8374 = 1;
	public static int anInt8375 = 0;

	public int method5636(int i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ade.y(").append(')').toString());
		}
	}

	public Class422_Sub4(int i, Class298_Sub48 class298_sub48) {
		super(i, class298_sub48);
		Class148.method1612(-1598873795 * anInt5350, -1410466853);
	}

	public void method5637(int i) {
		try {
			if (aClass298_Sub48_5346.method3543(-463714341).method5594(1268482556) < 245)
				anInt5350 = 0;
			if (-1598873795 * anInt5350 < 0 || -1598873795 * anInt5350 > 2)
				anInt5350 = method5611(-334062973) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ade.s(").append(')').toString());
		}
	}

	void method5610(int i) {
		anInt5350 = i * 1886334997;
		Class148.method1612(-1598873795 * anInt5350, -1253191065);
	}

	public int method5612(int i, int i_0_) {
		try {
			if (aClass298_Sub48_5346.method3543(-2143176849).method5594(1386061533) < 245)
				return 3;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ade.f(").append(')').toString());
		}
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = i * 1886334997;
			Class148.method1612(-1598873795 * anInt5350, -663288448);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ade.p(").append(')').toString());
		}
	}

	public Class422_Sub4(Class298_Sub48 class298_sub48) {
		super(class298_sub48);
		Class148.method1612(anInt5350 * -1598873795, -1776530085);
	}

	int method5615() {
		if (aClass298_Sub48_5346.method3543(-810795620).method5594(1995953827) < 245)
			return 0;
		return 2;
	}

	public int method5616(int i) {
		if (aClass298_Sub48_5346.method3543(616034505).method5594(1913483259) < 245)
			return 3;
		return 1;
	}

	int method5611(int i) {
		try {
			if (aClass298_Sub48_5346.method3543(-1188800813).method5594(1637246770) < 245)
				return 0;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ade.a(").append(')').toString());
		}
	}

	public boolean method5638(byte i) {
		try {
			if (aClass298_Sub48_5346.method3543(-325188584).method5594(2056702911) < 245)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ade.z(").append(')').toString());
		}
	}

	public static int method5639(int i, int i_2_) {
		try {
			int i_3_ = i >>> 1;
			i_3_ |= i_3_ >>> 1;
			i_3_ |= i_3_ >>> 2;
			i_3_ |= i_3_ >>> 4;
			i_3_ |= i_3_ >>> 8;
			i_3_ |= i_3_ >>> 16;
			return i & (i_3_ ^ 0xffffffff);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ade.i(").append(')').toString());
		}
	}
}
