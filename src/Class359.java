/* Class359 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class359 {
	public static final int anInt4160 = 15;
	public static final int anInt4161 = 32768;
	public static final int anInt4162 = 15;
	static int anInt4163;

	Class359() throws Throwable {
		throw new Error();
	}

	static void method6241(RsByteBuffer class282_sub35, int i) {
		for (int i_0_ = 0; i_0_ < Class4.anInt34 * -2043473211; i_0_++) {
			int i_1_ = class282_sub35.readUnsignedSmart(1888630053);
			int i_2_ = class282_sub35.readUnsignedShort();
			if (65535 == i_2_)
				i_2_ = -1;
			if (Class244.aClass217_Sub1Array3006[i_1_] != null)
				Class244.aClass217_Sub1Array3006[i_1_].anInt2701 = i_2_ * -316063015;
		}
	}

	static final void method6242(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 709455005;
		int i_3_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]);
		int i_4_ = (((CS2Executor) class527).intStack[1 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_5_ = (((CS2Executor) class527).intStack[2 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_6_ = (((CS2Executor) class527).intStack[3 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_7_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012 + 4]);
		if (i_5_ == -1)
			throw new RuntimeException();
		Class431 class431 = Class466.aClass444_5570.method7424(i_5_, (byte) 8);
		if (i_4_ != class431.aChar5146)
			throw new RuntimeException();
		if (i_3_ != class431.aChar5140)
			throw new RuntimeException();
		int[] is = class431.method7251(Integer.valueOf(i_6_), 2099453599);
		if (i_7_ < 0 || null == is || is.length <= i_7_)
			throw new RuntimeException();
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = is[i_7_];
	}

	static final void method6243(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7000 -= -1341717846;
		String string = (String) (((CS2Executor) class527).objectStack[((CS2Executor) class527).anInt7000 * 1806726141]);
		String string_8_ = (String) (((CS2Executor) class527).objectStack[((CS2Executor) class527).anInt7000 * 1806726141 + 1]);
		if (null != Class84.myPlayer.aClass238_10558 && (Class84.myPlayer.aClass238_10558.aBool2929))
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = string_8_;
		else
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = string;
	}

	static final void method6244(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		class118.anInt1289 = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]) * 1000406043;
		class118.anInt1375 = 657648623 * (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 + 1]);
		Class109.method1858(class118, (byte) 14);
		Class44.method913(class98, class118, (byte) 1);
		if (0 == -2131393857 * class118.anInt1268)
			Class12.method483(class98, class118, false, -1114649951);
	}
}
