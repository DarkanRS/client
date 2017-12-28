/* Class96_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub15 extends Class96 {
	int anInt9374;

	public void method1601() {
		Class86.aClass92Array820[1690922955 * ((Class96_Sub15) this).anInt9374].method1558((byte) -79);
	}

	public void method1592(int i) {
		Class86.aClass92Array820[1690922955 * ((Class96_Sub15) this).anInt9374].method1558((byte) -21);
	}

	Class96_Sub15(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub15) this).anInt9374 = class282_sub35.readUnsignedShort() * -1871987229;
	}

	public static int method14645(int i, int i_0_, int i_1_) {
		if (i_0_ > i) {
			int i_2_ = i;
			i = i_0_;
			i_0_ = i_2_;
		}
		int i_3_;
		for (/**/; i_0_ != 0; i_0_ = i_3_) {
			i_3_ = i % i_0_;
			i = i_0_;
		}
		return i;
	}
}
