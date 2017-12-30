/* Class282_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class282_Sub17 extends Class282 {
	abstract void method12249(RsByteBuffer class282_sub35);

	abstract void method12250(RsByteBuffer class282_sub35, int i);

	abstract void method12251(Class61 class61, int i);

	abstract void method12252(Class61 class61);

	Class282_Sub17() {
		/* empty */
	}

	abstract void method12253(RsByteBuffer class282_sub35);

	abstract void method12254(Class61 class61);

	abstract void method12255(Class61 class61);

	abstract void method12256(Class61 class61);

	abstract void method12257(RsByteBuffer class282_sub35);

	abstract void method12258(Class61 class61);

	public static boolean method12259(int i, int i_0_) {
		return 0 == i || i == 2 || i == 7 || 6 == i;
	}

	static final void method12260(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 567564004;
		class118.anInt1297 = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]) * -81350191;
		class118.anInt1298 = ((((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 + 1]) * 2017388241);
		class118.anInt1417 = 0;
		class118.anInt1326 = 0;
		int i_1_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 + 2]);
		if (i_1_ < 0)
			i_1_ = 0;
		else if (i_1_ > 4)
			i_1_ = 4;
		int i_2_ = (((CS2Executor) class527).intStack[3 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		if (i_2_ < 0)
			i_2_ = 0;
		else if (i_2_ > 4)
			i_2_ = 4;
		class118.aByte1368 = (byte) i_1_;
		class118.aByte1294 = (byte) i_2_;
		Class109.method1858(class118, (byte) -29);
		Class44.method913(class98, class118, (byte) 1);
		if (class118.anInt1268 * -2131393857 == 0)
			Class12.method483(class98, class118, false, -610252618);
	}
}
