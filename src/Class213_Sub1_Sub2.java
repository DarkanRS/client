/* Class213_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class213_Sub1_Sub2 extends Class213_Sub1 {
	byte[] aByteArray9167;

	byte[] method1974(int i, int i_0_, int i_1_) {
		((Class213_Sub1_Sub2) this).aByteArray9167 = new byte[i * i_0_ * i_1_ * 2];
		method1958(i, i_0_, i_1_);
		return ((Class213_Sub1_Sub2) this).aByteArray9167;
	}

	void method1971(int i, byte i_2_) {
		int i_3_ = i * 2;
		i_2_ = (byte) (127 + ((i_2_ & 0xff) >> 1));
		((Class213_Sub1_Sub2) this).aByteArray9167[i_3_++] = i_2_;
		((Class213_Sub1_Sub2) this).aByteArray9167[i_3_] = i_2_;
	}

	void method1975(int i, byte i_4_) {
		int i_5_ = i * 2;
		i_4_ = (byte) (127 + ((i_4_ & 0xff) >> 1));
		((Class213_Sub1_Sub2) this).aByteArray9167[i_5_++] = i_4_;
		((Class213_Sub1_Sub2) this).aByteArray9167[i_5_] = i_4_;
	}

	Class213_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}
}
