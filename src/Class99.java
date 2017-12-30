/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class99 {
	public Class121[] aClass121Array1000;
	public String aString1001;
	public String aString1002;
	public String aString1003;
	public Class121[] aClass121Array1004;
	public static int anInt1005;

	Class99() {
		/* empty */
	}

	void method1628(Class100 class100, int i) {
		aString1003 = class100.method1633(16711935);
		aString1001 = class100.method1633(16711935);
		aString1002 = class100.method1633(16711935);
		int i_0_ = class100.method1632((byte) -36);
		int i_1_ = class100.method1632((byte) -58);
		aClass121Array1000 = 0 == i_0_ ? null : new Class121[i_0_];
		aClass121Array1004 = i_1_ == 0 ? null : new Class121[i_1_];
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			aClass121Array1000[i_2_] = new Class121();
			aClass121Array1000[i_2_].method2097(class100, (byte) 31);
		}
		for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
			aClass121Array1004[i_3_] = new Class121();
			aClass121Array1004[i_3_].method2097(class100, (byte) 26);
		}
	}

	void method1629(Class100 class100) {
		aString1003 = class100.method1633(16711935);
		aString1001 = class100.method1633(16711935);
		aString1002 = class100.method1633(16711935);
		int i = class100.method1632((byte) -114);
		int i_4_ = class100.method1632((byte) -32);
		aClass121Array1000 = 0 == i ? null : new Class121[i];
		aClass121Array1004 = i_4_ == 0 ? null : new Class121[i_4_];
		for (int i_5_ = 0; i_5_ < i; i_5_++) {
			aClass121Array1000[i_5_] = new Class121();
			aClass121Array1000[i_5_].method2097(class100, (byte) -19);
		}
		for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
			aClass121Array1004[i_6_] = new Class121();
			aClass121Array1004[i_6_].method2097(class100, (byte) 98);
		}
	}

	static void method1630(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, Class282_Sub50_Sub15 class282_sub50_sub15, Class8 class8, Class414 class414, int i_13_, int i_14_, int i_15_) {
		if (i > i_8_ && i < i_10_ + i_8_ && i_7_ > i_12_ - 397683159 * class414.anInt4978 - 1 && i_7_ < i_12_ + class414.anInt4979 * -1518951631)
			i_13_ = i_14_;
		String string = Class75.method1354(class282_sub50_sub15, -938758900);
		class8.method386(string, 3 + i_8_, i_12_, i_13_, 0, client.aRandom7260, -242333475 * PacketsDecoder.anInt9079, Class115.aClass160Array1248, Class20.anIntArray177, 701039409);
	}

	static final void method1631(CS2Executor class527, byte i) {
		UnderlayDefinition class513;
		if (((CS2Executor) class527).aBool7022) {
			if (i != 1)
				return;
			class513 = ((CS2Executor) class527).aClass513_6994;
		} else
			class513 = ((CS2Executor) class527).aClass513_7007;
		UnderlayDefinition class513_16_ = class513;
		Class118 class118 = ((UnderlayDefinition) class513_16_).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513_16_).aClass98_5885;
		Class96_Sub9.method14586(class118, class98, class527, 909686877);
	}
}
