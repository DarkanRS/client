/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class101 {
	byte[] aByteArray1082;
	int anInt1083;
	public static Class264 aClass264_1084;

	Class101(byte[] is) {
		((Class101) this).aByteArray1082 = is;
		((Class101) this).anInt1083 = 0;
	}

	String method1079(int i) {
		try {
			int i_0_ = method1080(1088012278);
			if (i_0_ == -1)
				return null;
			if (i_0_ > 256)
				throw new RuntimeException_Sub3();
			String string = new String(((Class101) this).aByteArray1082, ((Class101) this).anInt1083 * -999234057, i_0_);
			((Class101) this).anInt1083 += i_0_ * -786863161;
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ec.f(").append(')').toString());
		}
	}

	int method1080(int i) {
		try {
			short i_1_ = 0;
			for (int i_2_ = 0; i_2_ < 2; i_2_++)
				i_1_ |= ((((Class101) this).aByteArray1082[((((Class101) this).anInt1083 += -786863161) * -999234057) - 1]) & 0xff) << i_2_ * 8;
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ec.a(").append(')').toString());
		}
	}

	static final void method1081(ClientScript2 class403, byte i) {
		try {
			Class212.aClass212_2423.method1952(-1969463170);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ec.afe(").append(')').toString());
		}
	}
}
