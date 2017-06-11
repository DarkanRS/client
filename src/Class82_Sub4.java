/* Class82_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub4 extends Class82 {
	int anInt6826;
	int anInt6827;
	int anInt6828;
	int anInt6829;
	int anInt6830;
	int anInt6831;
	public static int anInt6832;
	public static int anInt6833;

	public void method869() {
		Class87.aClass94Array794[((Class82_Sub4) this).anInt6831 * 1062834473].method1015(1706684616).method4420(((Class82_Sub4) this).anInt6827 * 537594387, ((Class82_Sub4) this).anInt6830 * -1750222503, -172156501 * ((Class82_Sub4) this).anInt6828, ((Class82_Sub4) this).anInt6826 * 376713895, client.anInt8884 * 443738891, 0, -1529152547 * ((Class82_Sub4) this).anInt6829, (byte) 4);
	}

	public void method866(int i) {
		try {
			Class87.aClass94Array794[((Class82_Sub4) this).anInt6831 * 1062834473].method1015(500322216).method4420(((Class82_Sub4) this).anInt6827 * 537594387, ((Class82_Sub4) this).anInt6830 * -1750222503, -172156501 * ((Class82_Sub4) this).anInt6828, ((Class82_Sub4) this).anInt6826 * 376713895, client.anInt8884 * 443738891, 0, -1529152547 * ((Class82_Sub4) this).anInt6829, (byte) 73);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xe.f(").append(')').toString());
		}
	}

	public void method868() {
		Class87.aClass94Array794[((Class82_Sub4) this).anInt6831 * 1062834473].method1015(951667947).method4420(((Class82_Sub4) this).anInt6827 * 537594387, ((Class82_Sub4) this).anInt6830 * -1750222503, -172156501 * ((Class82_Sub4) this).anInt6828, ((Class82_Sub4) this).anInt6826 * 376713895, client.anInt8884 * 443738891, 0, -1529152547 * ((Class82_Sub4) this).anInt6829, (byte) 9);
	}

	Class82_Sub4(RsByteBuffer class298_sub53) {
		super(class298_sub53);
		((Class82_Sub4) this).anInt6831 = class298_sub53.readUnsignedShort() * -451568871;
		int i = class298_sub53.readUnsignedByte();
		if ((i & 0x1) != 0) {
			((Class82_Sub4) this).anInt6827 = class298_sub53.readUnsignedShort() * -1685041125;
			((Class82_Sub4) this).anInt6830 = class298_sub53.readUnsignedShort() * -1587740951;
		} else {
			((Class82_Sub4) this).anInt6827 = 1685041125;
			((Class82_Sub4) this).anInt6830 = 1587740951;
		}
		if ((i & 0x2) != 0) {
			((Class82_Sub4) this).anInt6828 = class298_sub53.readUnsignedShort() * -455796477;
			((Class82_Sub4) this).anInt6826 = class298_sub53.readUnsignedShort() * 1360155927;
		} else {
			((Class82_Sub4) this).anInt6828 = 455796477;
			((Class82_Sub4) this).anInt6826 = -1360155927;
		}
		if ((i & 0x4) != 0) {
			int i_0_ = class298_sub53.readUnsignedShort();
			int i_1_ = class298_sub53.readUnsignedShort();
			int i_2_ = 255 * i_0_ / i_1_;
			if (i_0_ > 0 && i_2_ < 1)
				i_2_ = 1;
			((Class82_Sub4) this).anInt6829 = i_2_ * -592825227;
		} else
			((Class82_Sub4) this).anInt6829 = 592825227;
	}
}
