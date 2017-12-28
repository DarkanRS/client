/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1 {
	static Class1 aClass1_10;
	static Class1 aClass1_11 = new Class1();
	static Class282_Sub50_Sub7 aClass282_Sub50_Sub7_12;

	Class1() {
		/* empty */
	}

	static {
		aClass1_10 = new Class1();
	}

	public static void method252(Class397 class397, int i, int i_0_, Animable class521_sub1_sub1_sub2, int i_1_, int i_2_) {
		Class527 class527 = Class125.method2167(1590618390);
		((Class527) class527).aClass521_Sub1_Sub1_Sub2_7006 = class521_sub1_sub1_sub2;
		((Class527) class527).anInt7004 = 2000547059 * i_1_;
		Class107.method1834(class397, i, i_0_, class527, (byte) 104);
		((Class527) class527).aClass521_Sub1_Sub1_Sub2_7006 = null;
		((Class527) class527).anInt7004 = -2000547059;
	}

	static final void method253(int i, Class465 class465, int i_3_) {
		if (i != -1 && class465.method7754((long) i) == null)
			class465.method7765(new Class282(), (long) i);
	}

	static final void method254(Class527 class527, byte i) {
		((Class527) class527).anInt7012 -= 283782002;
		int i_4_ = (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537]);
		int i_5_ = (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012 + 1]);
		int[] is = ((Class527) class527).anIntArray6999;
		int i_6_ = (((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1;
		int i_7_;
		if (Class247.method4248(i_4_, i_5_, (short) 660)) {
			if (i >= 7)
				return;
			i_7_ = 1;
		} else
			i_7_ = 0;
		is[i_6_] = i_7_;
	}
}
