/* Class96_Sub10_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub10_Sub1 extends Class96_Sub10 {
	int anInt10156;
	int anInt10157;
	int anInt10158;
	static int anInt10159;

	public void method1601() {
		Class82.aClass75Array804[-2052083567 * ((Class96_Sub10_Sub1) this).anInt10157].method1342((byte) 68).sendGraphics(((Class96_Sub10_Sub1) this).anInt9296 * 660169595, 277206935 * ((Class96_Sub10_Sub1) this).anInt9295 << 16, ((Class96_Sub10_Sub1) this).anInt9297 * 1009489391, -1634196889 * ((Class96_Sub10_Sub1) this).anInt10156, false, -2011621393 * ((Class96_Sub10_Sub1) this).anInt10158, -1087821934);
	}

	public void method1592(int i) {
		Class82.aClass75Array804[-2052083567 * ((Class96_Sub10_Sub1) this).anInt10157].method1342((byte) 72).sendGraphics(((Class96_Sub10_Sub1) this).anInt9296 * 660169595, 277206935 * ((Class96_Sub10_Sub1) this).anInt9295 << 16, ((Class96_Sub10_Sub1) this).anInt9297 * 1009489391, -1634196889 * ((Class96_Sub10_Sub1) this).anInt10156, false, -2011621393 * ((Class96_Sub10_Sub1) this).anInt10158, 1119829285);
	}

	Class96_Sub10_Sub1(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub10_Sub1) this).anInt10157 = class282_sub35.readUnsignedShort() * -1328934799;
		((Class96_Sub10_Sub1) this).anInt10158 = class282_sub35.readUnsignedByte() * 1183905551;
		((Class96_Sub10_Sub1) this).anInt10156 = class282_sub35.readUnsignedShort() * 1239800151;
	}

	static final void method15552(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, false, 1, class527, (byte) 24);
	}

	static final void method15553(boolean bool, CS2Executor class527, int i) {
		int i_0_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_0_, (byte) 11);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_0_ >> 16];
		if (bool)
			Class455.method7554(class98, class118, 1019153265);
		else
			WorldMapIndexLoader.method3710(class98, class118, 983481657);
	}

	public static void method15554(Index class317, Index class317_1_, int i, int i_2_) {
		Class282_Sub50_Sub13.aClass317_9686 = class317;
		Class282_Sub50_Sub13.aClass317_9685 = class317_1_;
	}

	static final void method15555(CS2Executor class527, byte i) {
		int[] is = ((CS2Executor) class527).intStack;
		int i_3_ = (((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1;
		int i_4_;
		if (Class393.aClass282_Sub54_4783.aClass468_Sub23_8202.method12897((byte) 38) == 1) {
			if (i == 1)
				return;
			i_4_ = 1;
		} else
			i_4_ = 0;
		is[i_3_] = i_4_;
	}
}
