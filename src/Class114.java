/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class114 {
	Class122[] aClass122Array1236;
	String aString1237;
	static final int anInt1238 = 256;
	static final int anInt1239 = 4;
	Class122[] aClass122Array1240;
	Class99[] aClass99Array1241;
	static final int anInt1242 = 2;
	static Class194 aClass194_1243;

	void method1884(byte[] is) throws Exception_Sub1 {
		Class100 class100 = new Class100(is);
		int i = class100.method1632((byte) -10);
		if (4 != i)
			throw new Exception_Sub1(this, i, 4);
		((Class114) this).aString1237 = class100.method1633(16711935);
		((Class114) this).aClass122Array1236 = new Class122[class100.method1632((byte) -80)];
		((Class114) this).aClass122Array1240 = new Class122[class100.method1632((byte) -71)];
		((Class114) this).aClass99Array1241 = new Class99[class100.method1632((byte) -73)];
		for (int i_0_ = 0; i_0_ < ((Class114) this).aClass122Array1236.length; i_0_++) {
			((Class114) this).aClass122Array1236[i_0_] = new Class122();
			((Class114) this).aClass122Array1236[i_0_].method2105(class100, (byte) -93);
		}
		for (int i_1_ = 0; i_1_ < ((Class114) this).aClass122Array1240.length; i_1_++) {
			((Class114) this).aClass122Array1240[i_1_] = new Class122();
			((Class114) this).aClass122Array1240[i_1_].method2105(class100, (byte) -3);
		}
		for (int i_2_ = 0; i_2_ < ((Class114) this).aClass99Array1241.length; i_2_++) {
			((Class114) this).aClass99Array1241[i_2_] = new Class99();
			((Class114) this).aClass99Array1241[i_2_].method1628(class100, -998614135);
		}
	}

	void method1885(byte[] is, int i) throws Exception_Sub1 {
		Class100 class100 = new Class100(is);
		int i_3_ = class100.method1632((byte) -72);
		if (4 != i_3_)
			throw new Exception_Sub1(this, i_3_, 4);
		((Class114) this).aString1237 = class100.method1633(16711935);
		((Class114) this).aClass122Array1236 = new Class122[class100.method1632((byte) -44)];
		((Class114) this).aClass122Array1240 = new Class122[class100.method1632((byte) -15)];
		((Class114) this).aClass99Array1241 = new Class99[class100.method1632((byte) -125)];
		for (int i_4_ = 0; i_4_ < ((Class114) this).aClass122Array1236.length; i_4_++) {
			((Class114) this).aClass122Array1236[i_4_] = new Class122();
			((Class114) this).aClass122Array1236[i_4_].method2105(class100, (byte) -114);
		}
		for (int i_5_ = 0; i_5_ < ((Class114) this).aClass122Array1240.length; i_5_++) {
			((Class114) this).aClass122Array1240[i_5_] = new Class122();
			((Class114) this).aClass122Array1240[i_5_].method2105(class100, (byte) -10);
		}
		for (int i_6_ = 0; i_6_ < ((Class114) this).aClass99Array1241.length; i_6_++) {
			((Class114) this).aClass99Array1241[i_6_] = new Class99();
			((Class114) this).aClass99Array1241[i_6_].method1628(class100, -998614135);
		}
	}

	public Class114(byte[] is) throws Exception_Sub1 {
		method1885(is, 1555548172);
	}

	void method1886(byte[] is) throws Exception_Sub1 {
		Class100 class100 = new Class100(is);
		int i = class100.method1632((byte) 8);
		if (4 != i)
			throw new Exception_Sub1(this, i, 4);
		((Class114) this).aString1237 = class100.method1633(16711935);
		((Class114) this).aClass122Array1236 = new Class122[class100.method1632((byte) -77)];
		((Class114) this).aClass122Array1240 = new Class122[class100.method1632((byte) -27)];
		((Class114) this).aClass99Array1241 = new Class99[class100.method1632((byte) -84)];
		for (int i_7_ = 0; i_7_ < ((Class114) this).aClass122Array1236.length; i_7_++) {
			((Class114) this).aClass122Array1236[i_7_] = new Class122();
			((Class114) this).aClass122Array1236[i_7_].method2105(class100, (byte) -36);
		}
		for (int i_8_ = 0; i_8_ < ((Class114) this).aClass122Array1240.length; i_8_++) {
			((Class114) this).aClass122Array1240[i_8_] = new Class122();
			((Class114) this).aClass122Array1240[i_8_].method2105(class100, (byte) -127);
		}
		for (int i_9_ = 0; i_9_ < ((Class114) this).aClass99Array1241.length; i_9_++) {
			((Class114) this).aClass99Array1241[i_9_] = new Class99();
			((Class114) this).aClass99Array1241[i_9_].method1628(class100, -998614135);
		}
	}

	static FontMetrics method1887(int i) {
		FontMetrics class414;
		if (Class20.aBool187) {
			if (null != Class186.aClass8_2348 && Class176.aClass414_2200 != null)
				class414 = Class176.aClass414_2200;
			else
				class414 = Class288.aClass414_3438;
		} else
			class414 = Class288.aClass414_3438;
		Class20.anInt178 = 1217218217 * class414.anInt4979 + 362972703 * class414.anInt4978;
		return class414;
	}

	static final void method1888(CS2Executor class527, byte i) {
		class527.anInt7012 -= 709455005;
		Class153.method2618((class527.intStack[class527.anInt7012 * 1942118537]), (class527.intStack[class527.anInt7012 * 1942118537 + 1]), (class527.intStack[2 + 1942118537 * class527.anInt7012]), (class527.intStack[3 + 1942118537 * class527.anInt7012]), (class527.intStack[1942118537 * class527.anInt7012 + 4]), 1275118183);
	}

	static final void method1889(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByte626;
	}

	static void method1890(long[] ls, Object[] objects, int i, int i_10_, short i_11_) {
		if (i < i_10_) {
			int i_12_ = (i + i_10_) / 2;
			int i_13_ = i;
			long l = ls[i_12_];
			ls[i_12_] = ls[i_10_];
			ls[i_10_] = l;
			Object object = objects[i_12_];
			objects[i_12_] = objects[i_10_];
			objects[i_10_] = object;
			int i_14_ = 9223372036854775807L == l ? 0 : 1;
			for (int i_15_ = i; i_15_ < i_10_; i_15_++) {
				if (ls[i_15_] < (long) (i_15_ & i_14_) + l) {
					long l_16_ = ls[i_15_];
					ls[i_15_] = ls[i_13_];
					ls[i_13_] = l_16_;
					Object object_17_ = objects[i_15_];
					objects[i_15_] = objects[i_13_];
					objects[i_13_++] = object_17_;
				}
			}
			ls[i_10_] = ls[i_13_];
			ls[i_13_] = l;
			objects[i_10_] = objects[i_13_];
			objects[i_13_] = object;
			method1890(ls, objects, i, i_13_ - 1, (short) 255);
			method1890(ls, objects, i_13_ + 1, i_10_, (short) 255);
		}
	}
}
