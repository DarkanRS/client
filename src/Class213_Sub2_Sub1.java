/* Class213_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class213_Sub2_Sub1 extends Class213_Sub2 {
	byte[] aByteArray9168;

	byte[] method1977(int i, int i_0_, int i_1_) {
		((Class213_Sub2_Sub1) this).aByteArray9168 = new byte[i * i_0_ * i_1_ * 2];
		method1958(i, i_0_, i_1_);
		return ((Class213_Sub2_Sub1) this).aByteArray9168;
	}

	void method1976(int i, byte i_2_) {
		int i_3_ = i * 2;
		int i_4_ = i_2_ & 0xff;
		((Class213_Sub2_Sub1) this).aByteArray9168[i_3_++] = (byte) -1;
		((Class213_Sub2_Sub1) this).aByteArray9168[i_3_] = (byte) (3 * i_4_ >> 5);
	}

	void method1978(int i, byte i_5_) {
		int i_6_ = i * 2;
		int i_7_ = i_5_ & 0xff;
		((Class213_Sub2_Sub1) this).aByteArray9168[i_6_++] = (byte) -1;
		((Class213_Sub2_Sub1) this).aByteArray9168[i_6_] = (byte) (3 * i_7_ >> 5);
	}

	void method1979(int i, byte i_8_) {
		int i_9_ = i * 2;
		int i_10_ = i_8_ & 0xff;
		((Class213_Sub2_Sub1) this).aByteArray9168[i_9_++] = (byte) -1;
		((Class213_Sub2_Sub1) this).aByteArray9168[i_9_] = (byte) (3 * i_10_ >> 5);
	}

	void method1980(int i, byte i_11_) {
		int i_12_ = i * 2;
		int i_13_ = i_11_ & 0xff;
		((Class213_Sub2_Sub1) this).aByteArray9168[i_12_++] = (byte) -1;
		((Class213_Sub2_Sub1) this).aByteArray9168[i_12_] = (byte) (3 * i_13_ >> 5);
	}

	Class213_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}
}
