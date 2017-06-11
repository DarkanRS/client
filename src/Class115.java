/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class115 {
	public int anInt1382;
	public static Class115 aClass115_1383 = new Class115(0, 104);
	static Class115 aClass115_1384;
	static Class115 aClass115_1385;
	static Class115 aClass115_1386 = new Class115(1, 120);
	public int anInt1387;
	static Class115 aClass115_1388;
	public static int anInt1389;

	Class115(int i, int i_0_) {
		anInt1387 = 1499224231 * i;
		anInt1382 = 1571222451 * i_0_;
	}

	static {
		aClass115_1384 = new Class115(2, 136);
		aClass115_1385 = new Class115(3, 168);
		aClass115_1388 = new Class115(4, 72);
	}

	static final void method1260(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_1_, (byte) -37);
			Class119 class119 = Class389.aClass119Array4165[i_1_ >> 16];
			Class422_Sub11.method5668(class105, class119, class403, 2137737023);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("er.mu(").append(')').toString());
		}
	}

	static final void method1261(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((ClientScript2) class403).aClass365_Sub1_Sub4_Sub1_5253.method4363((byte) 33);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("er.apo(").append(')').toString());
		}
	}

	static final void method1262(ClientScript2 class403, short i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_2_, (byte) 51);
			Class119 class119 = Class389.aClass119Array4165[i_2_ >> 16];
			Class472.method6065(class105, class119, class403, 788007280);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("er.nd(").append(')').toString());
		}
	}
}
