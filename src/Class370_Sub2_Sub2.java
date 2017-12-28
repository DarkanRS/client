/* Class370_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class370_Sub2_Sub2 extends Class370_Sub2 {
	byte[] aByteArray10219;

	Class370_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	byte[] method15617(int i, int i_0_, int i_1_) {
		((Class370_Sub2_Sub2) this).aByteArray10219 = new byte[i * i_0_ * i_1_ * 2];
		method6322(i, i_0_, i_1_);
		return ((Class370_Sub2_Sub2) this).aByteArray10219;
	}

	void method12517(int i, byte i_2_) {
		int i_3_ = i * 2;
		i_2_ = (byte) (127 + ((i_2_ & 0xff) >> 1));
		((Class370_Sub2_Sub2) this).aByteArray10219[i_3_++] = i_2_;
		((Class370_Sub2_Sub2) this).aByteArray10219[i_3_] = i_2_;
	}

	byte[] method15618(int i, int i_4_, int i_5_) {
		((Class370_Sub2_Sub2) this).aByteArray10219 = new byte[i * i_4_ * i_5_ * 2];
		method6322(i, i_4_, i_5_);
		return ((Class370_Sub2_Sub2) this).aByteArray10219;
	}

	void method12519(int i, byte i_6_) {
		int i_7_ = i * 2;
		i_6_ = (byte) (127 + ((i_6_ & 0xff) >> 1));
		((Class370_Sub2_Sub2) this).aByteArray10219[i_7_++] = i_6_;
		((Class370_Sub2_Sub2) this).aByteArray10219[i_7_] = i_6_;
	}

	void method12518(int i, byte i_8_) {
		int i_9_ = i * 2;
		i_8_ = (byte) (127 + ((i_8_ & 0xff) >> 1));
		((Class370_Sub2_Sub2) this).aByteArray10219[i_9_++] = i_8_;
		((Class370_Sub2_Sub2) this).aByteArray10219[i_9_] = i_8_;
	}
}
