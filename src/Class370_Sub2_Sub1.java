/* Class370_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class370_Sub2_Sub1 extends Class370_Sub2 {
	byte[] aByteArray10022;

	byte[] method15440(int i, int i_0_, int i_1_) {
		((Class370_Sub2_Sub1) this).aByteArray10022 = new byte[i * i_0_ * i_1_ * 2];
		method6322(i, i_0_, i_1_);
		return ((Class370_Sub2_Sub1) this).aByteArray10022;
	}

	byte[] method15441(int i, int i_2_, int i_3_) {
		((Class370_Sub2_Sub1) this).aByteArray10022 = new byte[i * i_2_ * i_3_ * 2];
		method6322(i, i_2_, i_3_);
		return ((Class370_Sub2_Sub1) this).aByteArray10022;
	}

	void method12517(int i, byte i_4_) {
		int i_5_ = i * 2;
		i_4_ = (byte) (127 + ((i_4_ & 0xff) >> 1));
		((Class370_Sub2_Sub1) this).aByteArray10022[i_5_++] = i_4_;
		((Class370_Sub2_Sub1) this).aByteArray10022[i_5_] = i_4_;
	}

	void method12519(int i, byte i_6_) {
		int i_7_ = i * 2;
		i_6_ = (byte) (127 + ((i_6_ & 0xff) >> 1));
		((Class370_Sub2_Sub1) this).aByteArray10022[i_7_++] = i_6_;
		((Class370_Sub2_Sub1) this).aByteArray10022[i_7_] = i_6_;
	}

	void method12518(int i, byte i_8_) {
		int i_9_ = i * 2;
		i_8_ = (byte) (127 + ((i_8_ & 0xff) >> 1));
		((Class370_Sub2_Sub1) this).aByteArray10022[i_9_++] = i_8_;
		((Class370_Sub2_Sub1) this).aByteArray10022[i_9_] = i_8_;
	}

	byte[] method15442(int i, int i_10_, int i_11_) {
		((Class370_Sub2_Sub1) this).aByteArray10022 = new byte[i * i_10_ * i_11_ * 2];
		method6322(i, i_10_, i_11_);
		return ((Class370_Sub2_Sub1) this).aByteArray10022;
	}

	byte[] method15443(int i, int i_12_, int i_13_) {
		((Class370_Sub2_Sub1) this).aByteArray10022 = new byte[i * i_12_ * i_13_ * 2];
		method6322(i, i_12_, i_13_);
		return ((Class370_Sub2_Sub1) this).aByteArray10022;
	}

	byte[] method15444(int i, int i_14_, int i_15_) {
		((Class370_Sub2_Sub1) this).aByteArray10022 = new byte[i * i_14_ * i_15_ * 2];
		method6322(i, i_14_, i_15_);
		return ((Class370_Sub2_Sub1) this).aByteArray10022;
	}

	Class370_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}
}
