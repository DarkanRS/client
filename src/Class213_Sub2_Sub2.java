/* Class213_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class213_Sub2_Sub2 extends Class213_Sub2 {
	byte[] aByteArray9169;

	void method1981(int i, byte i_0_) {
		int i_1_ = i * 2;
		int i_2_ = i_0_ & 0xff;
		((Class213_Sub2_Sub2) this).aByteArray9169[i_1_++] = (byte) (3 * i_2_ >> 5);
		((Class213_Sub2_Sub2) this).aByteArray9169[i_1_] = (byte) (3 * i_2_ >> 5);
	}

	Class213_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	void method1976(int i, byte i_3_) {
		int i_4_ = i * 2;
		int i_5_ = i_3_ & 0xff;
		((Class213_Sub2_Sub2) this).aByteArray9169[i_4_++] = (byte) (3 * i_5_ >> 5);
		((Class213_Sub2_Sub2) this).aByteArray9169[i_4_] = (byte) (3 * i_5_ >> 5);
	}

	byte[] method1982(int i, int i_6_, int i_7_) {
		((Class213_Sub2_Sub2) this).aByteArray9169 = new byte[i * i_6_ * i_7_ * 2];
		method1958(i, i_6_, i_7_);
		return ((Class213_Sub2_Sub2) this).aByteArray9169;
	}

	void method1983(int i, byte i_8_) {
		int i_9_ = i * 2;
		int i_10_ = i_8_ & 0xff;
		((Class213_Sub2_Sub2) this).aByteArray9169[i_9_++] = (byte) (3 * i_10_ >> 5);
		((Class213_Sub2_Sub2) this).aByteArray9169[i_9_] = (byte) (3 * i_10_ >> 5);
	}

	void method1984(int i, byte i_11_) {
		int i_12_ = i * 2;
		int i_13_ = i_11_ & 0xff;
		((Class213_Sub2_Sub2) this).aByteArray9169[i_12_++] = (byte) (3 * i_13_ >> 5);
		((Class213_Sub2_Sub2) this).aByteArray9169[i_12_] = (byte) (3 * i_13_ >> 5);
	}
}
