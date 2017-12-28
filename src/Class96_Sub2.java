/* Class96_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub2 extends Class96 {
	int anInt8504;
	int anInt8505;

	public void method1601() {
		Class82.aClass75Array804[-644812741 * ((Class96_Sub2) this).anInt8504].method1342((byte) 117).method15791(((Class96_Sub2) this).anInt8505 * -2022567955, true, (byte) -83);
	}

	Class96_Sub2(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub2) this).anInt8504 = class282_sub35.readUnsignedShort() * 607938803;
		((Class96_Sub2) this).anInt8505 = class282_sub35.readUnsignedShort() * -16472603;
	}

	public void method1592(int i) {
		Class82.aClass75Array804[-644812741 * ((Class96_Sub2) this).anInt8504].method1342((byte) 18).method15791(((Class96_Sub2) this).anInt8505 * -2022567955, true, (byte) -82);
	}

	static final void method13756(Class527 class527, short i) {
		int i_0_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5175(i_0_ >> 14 & 0x3fff, i_0_ & 0x3fff);
		if (null == class282_sub50_sub6) {
			if (i > 199)
				((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537) - 1] = -1;
		} else
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub6.anInt9536 * 1864297169;
	}
}
