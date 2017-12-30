/* Class354 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class354 {
	int anInt4108;
	Object anObject4109;
	public static Class160 aClass160_4110;
	static Class213[] aClass213Array4111;
	public static int anInt4112;

	Class354(Object object, int i) {
		((Class354) this).anObject4109 = object;
		((Class354) this).anInt4108 = -449891505 * i;
	}

	static final void method6212(CS2Executor class527, byte i) {
		int i_0_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_0_, (byte) 87);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = 985215637 * class118.anInt1320;
	}

	static final void method6213(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_1_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_2_ = (((CS2Executor) class527).intStack[1 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = 0 != (i_1_ & 1 << i_2_) ? 1 : 0;
	}

	public static int method6214(int i, int i_3_, int i_4_, int i_5_) {
		i_4_ &= 0x3;
		if (0 == i_4_)
			return i_3_;
		if (i_4_ == 1)
			return 4095 - i;
		if (i_4_ == 2)
			return 4095 - i_3_;
		return i;
	}

	static void method6215(byte i) {
		synchronized (Class13.aClass229_127) {
			Class13.aClass229_127.method3863(1545219371);
		}
	}

	static void method6216(Class505 class505, int i) {
		if (!Class20.aBool187)
			Class277.method4908(class505, 1349821918);
		else
			Class38.method857(class505, -1937681851);
	}
}
