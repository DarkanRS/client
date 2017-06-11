/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class128 implements Interface5 {
	public Class139 aClass139_6322;
	public Class133 aClass133_6323;
	public int anInt6324;
	public int anInt6325;
	public int anInt6326;
	public int anInt6327;
	public int anInt6328;
	public int anInt6329;
	public int anInt6330;
	public static Class148 aClass148_6331;

	public Class146 method50() {
		return null;
	}

	public Class146 method49(int i) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fe.f(").append(')').toString());
		}
	}

	Class128(Class139 class139, Class133 class133, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		aClass139_6322 = class139;
		aClass133_6323 = class133;
		anInt6327 = 807843511 * i;
		anInt6325 = -649554901 * i_0_;
		anInt6326 = i_1_ * 1273501485;
		anInt6330 = 407497983 * i_2_;
		anInt6328 = 427732857 * i_3_;
		anInt6329 = 685031529 * i_4_;
		anInt6324 = 172512313 * i_5_;
	}

	public Class146 method51() {
		return null;
	}

	static final void method1435(boolean bool, ClientScript2 class403, int i) {
		try {
			int i_6_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_6_, (byte) 53);
			Class119 class119 = Class389.aClass119Array4165[i_6_ >> 16];
			if (bool)
				Class131.method1470(class119, class105, -1270501871);
			else
				Class53.method599(class119, class105, (byte) -21);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fe.cm(").append(')').toString());
		}
	}

	static final void method1436(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			class105.aBoolean1183 = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) == 1;
			Tradution.method6054(class105, 100999784);
			if (-1 == class105.anInt1154 * -1309843523 && !class119.aBoolean1403)
				Class298_Sub52.method3582(class105.anInt1142 * -440872681, -285766228);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fe.hi(").append(')').toString());
		}
	}

	public static boolean method1437(int i, int i_7_) {
		try {
			return 0 == i || 1 == i || i == 2;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fe.k(").append(')').toString());
		}
	}

	static final void method1438(ClientScript2 class403, int i) {
		try {
			int i_8_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			int i_9_ = client.aClass251Array8920[i_8_].method2400(-574288948);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_9_ == 2 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fe.yy(").append(')').toString());
		}
	}
}
