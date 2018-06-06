/* Class386 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class386 {
	public static final int anInt4674 = 12;
	public static final int anInt4675 = 15;
	public static final int anInt4676 = 1;
	public static final int anInt4677 = 4;
	public static final int anInt4678 = 11;
	public static final int anInt4679 = 14;
	public static final int anInt4680 = 5;
	public static final int anInt4681 = 0;
	public static final int anInt4682 = 2;
	public static final int anInt4683 = 7;
	public static final int anInt4684 = 6;
	public static final int anInt4685 = 13;
	public static final int anInt4686 = 18;
	public static final int anInt4687 = 8;
	public static final int anInt4688 = 19;
	public static final int anInt4689 = 9;
	public static final int anInt4690 = 16;
	public static final int anInt4691 = 10;
	public static final int anInt4692 = 17;
	public static final int anInt4693 = 3;

	Class386() throws Throwable {
		throw new Error();
	}

	static final void method6668(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_0_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_1_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		UnderlayDefinition class513;
		if (class527.aBool7022)
			class513 = class527.aClass513_6994;
		else
			class513 = class527.aClass513_7007;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (i_1_ != -1 && class513.method8764(i_0_, i_1_, -1290054035) ? 1 : 0);
	}

	static final void method6669(CS2Executor class527, int i) {
		int i_2_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_2_, (byte) 19);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_2_ >> 16];
		Class249.method4280(class118, class98, class527, (byte) 114);
	}

	static final void method6670(CS2Executor class527, int i) {
		int i_3_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_3_, (byte) 103);
		Class96_Sub22.method14680(class118, class527, 434841982);
	}

	public static Class467[] method6671(Class470 class470, int i) {
		int[] is = class470.method7807((byte) 0);
		Class467[] class467s = new Class467[is.length >> 2];
		for (int i_4_ = 0; i_4_ < class467s.length; i_4_++) {
			Class467 class467 = new Class467();
			class467s[i_4_] = class467;
			class467.anInt5571 = is[i_4_ << 2] * -1043730883;
			class467.anInt5574 = -31601497 * is[(i_4_ << 2) + 1];
			class467.anInt5573 = 1709553599 * is[2 + (i_4_ << 2)];
			((Class467) class467).anInt5572 = 1483782025 * is[3 + (i_4_ << 2)];
		}
		return class467s;
	}

	public static Interface43 method6672(Interface43[] interface43s, int i, int i_5_) {
		Interface43[] interface43s_6_ = interface43s;
		for (int i_7_ = 0; i_7_ < interface43s_6_.length; i_7_++) {
			Interface43 interface43 = interface43s_6_[i_7_];
			if (i == interface43.method243((byte) 1))
				return interface43;
		}
		return null;
	}

	public static void method6673(int i) {
		if (null != Class302.anInterface27Array3559) {
			Interface27[] interface27s = Class302.anInterface27Array3559;
			for (int i_8_ = 0; i_8_ < interface27s.length; i_8_++) {
				Interface27 interface27 = interface27s[i_8_];
				interface27.method161(-1145558933);
			}
		}
	}

	static final void method6674(CS2Executor class527, int i) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[1806726141 * class527.anInt7000]);
		String string_9_ = (String) (class527.objectStack[1806726141 * class527.anInt7000 + 1]);
		Class2.method257(string, string_9_, 1942118537);
	}

	static final void method6675(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -45);
	}
}
