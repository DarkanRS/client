/* Class370_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class370_Sub1_Sub2 extends Class370_Sub1 {
	byte[] aByteArray10215;

	byte[] method15614(int i, int i_0_, int i_1_) {
		((Class370_Sub1_Sub2) this).aByteArray10215 = new byte[i * i_0_ * i_1_ * 2];
		method6322(i, i_0_, i_1_);
		return ((Class370_Sub1_Sub2) this).aByteArray10215;
	}

	void method12510(int i, byte i_2_) {
		int i_3_ = i * 2;
		int i_4_ = i_2_ & 0xff;
		((Class370_Sub1_Sub2) this).aByteArray10215[i_3_++] = (byte) (3 * i_4_ >> 5);
		((Class370_Sub1_Sub2) this).aByteArray10215[i_3_] = (byte) (3 * i_4_ >> 5);
	}

	void method12509(int i, byte i_5_) {
		int i_6_ = i * 2;
		int i_7_ = i_5_ & 0xff;
		((Class370_Sub1_Sub2) this).aByteArray10215[i_6_++] = (byte) (3 * i_7_ >> 5);
		((Class370_Sub1_Sub2) this).aByteArray10215[i_6_] = (byte) (3 * i_7_ >> 5);
	}

	byte[] method15615(int i, int i_8_, int i_9_) {
		((Class370_Sub1_Sub2) this).aByteArray10215 = new byte[i * i_8_ * i_9_ * 2];
		method6322(i, i_8_, i_9_);
		return ((Class370_Sub1_Sub2) this).aByteArray10215;
	}

	Class370_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	void method12508(int i, byte i_10_) {
		int i_11_ = i * 2;
		int i_12_ = i_10_ & 0xff;
		((Class370_Sub1_Sub2) this).aByteArray10215[i_11_++] = (byte) (3 * i_12_ >> 5);
		((Class370_Sub1_Sub2) this).aByteArray10215[i_11_] = (byte) (3 * i_12_ >> 5);
	}

	void method12507(int i, byte i_13_) {
		int i_14_ = i * 2;
		int i_15_ = i_13_ & 0xff;
		((Class370_Sub1_Sub2) this).aByteArray10215[i_14_++] = (byte) (3 * i_15_ >> 5);
		((Class370_Sub1_Sub2) this).aByteArray10215[i_14_] = (byte) (3 * i_15_ >> 5);
	}
}
