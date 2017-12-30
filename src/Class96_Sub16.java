/* Class96_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub16 extends Class96 {
	int anInt9381;
	long aLong9382;
	public static Class211 aClass211_9383;

	public void method1601() {
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) Class86.aClass465_823.method7754(-6193626509720689219L * (((Class96_Sub16) this).aLong9382)));
		if (class282_sub38 != null)
			class282_sub38.anInt8002 = -1352622247 * ((Class96_Sub16) this).anInt9381;
		else
			Class86.aClass465_823.method7765(new Class282_Sub38(900972081 * ((Class96_Sub16) this).anInt9381), -6193626509720689219L * ((Class96_Sub16) this).aLong9382);
	}

	public void method1592(int i) {
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) Class86.aClass465_823.method7754(-6193626509720689219L * (((Class96_Sub16) this).aLong9382)));
		if (class282_sub38 != null)
			class282_sub38.anInt8002 = -1352622247 * ((Class96_Sub16) this).anInt9381;
		else
			Class86.aClass465_823.method7765(new Class282_Sub38(900972081 * ((Class96_Sub16) this).anInt9381), -6193626509720689219L * ((Class96_Sub16) this).aLong9382);
	}

	Class96_Sub16(RsByteBuffer class282_sub35, boolean bool) {
		super(class282_sub35);
		int i = class282_sub35.readUnsignedShort();
		if (bool)
			((Class96_Sub16) this).aLong9382 = (0x100000000L | (long) i) * -8460157808910631531L;
		else
			((Class96_Sub16) this).aLong9382 = -8460157808910631531L * (long) i;
		((Class96_Sub16) this).anInt9381 = class282_sub35.readInt() * -1911760175;
	}

	static final void method14647(CS2Executor class527, byte i) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub4_8223, (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]), -939446296);
		Class538.method11500(Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1329116825), false, (byte) 24);
		Class190.method3148((byte) 38);
	}

	static void method14648(int i, int i_0_, int i_1_, byte i_2_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Class263.method4778(11, (long) i);
		class282_sub50_sub12.method14995(467467668);
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9668 = i_0_ * -1773141545;
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9641 = 717659479 * i_1_;
	}

	static final void method14649(CS2Executor class527, byte i) {
		int i_3_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub1_8197.method7785(i_3_, 364907736);
	}
}
