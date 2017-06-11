/* Class213_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class213_Sub2 extends Class213 {
	int anInt7063;
	byte[] aByteArray7064;
	int anInt7065;
	int anInt7066;
	int anInt7067;
	int anInt7068;
	int anInt7069;
	int anInt7070;
	int anInt7071;

	void method1961(int i, int i_0_) {
		if (i != 0) {
			((Class213_Sub2) this).anInt7065 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7067) >> 12;
			if (((Class213_Sub2) this).anInt7065 < 0)
				((Class213_Sub2) this).anInt7065 = 0;
			else if (((Class213_Sub2) this).anInt7065 > 4096)
				((Class213_Sub2) this).anInt7065 = 4096;
			((Class213_Sub2) this).anInt7066 = ((Class213_Sub2) this).anInt7070 - (i_0_ < 0 ? -i_0_ : i_0_);
			((Class213_Sub2) this).anInt7066 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7066) >> 12;
			((Class213_Sub2) this).anInt7066 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7065) >> 12;
			((Class213_Sub2) this).anInt7068 += (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7069) >> 12;
			((Class213_Sub2) this).anInt7069 = (((Class213_Sub2) this).anInt7069 * ((Class213_Sub2) this).anInt7063) >> 12;
		} else {
			((Class213_Sub2) this).anInt7066 = ((Class213_Sub2) this).anInt7070 - (i_0_ < 0 ? -i_0_ : i_0_);
			((Class213_Sub2) this).anInt7066 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7066) >> 12;
			((Class213_Sub2) this).anInt7065 = 4096;
			((Class213_Sub2) this).anInt7068 = ((Class213_Sub2) this).anInt7066;
		}
	}

	Class213_Sub2(int i, int i_1_, int i_2_, int i_3_, int i_4_, float f, float f_5_, float f_6_) {
		super(i, i_1_, i_2_, i_3_, i_4_);
		((Class213_Sub2) this).anInt7067 = (int) (f_6_ * 4096.0F);
		((Class213_Sub2) this).anInt7070 = (int) (f_5_ * 4096.0F);
		((Class213_Sub2) this).anInt7069 = ((Class213_Sub2) this).anInt7063 = (int) (Math.pow(0.5, (double) -f) * 4096.0);
	}

	void method1970() {
		((Class213_Sub2) this).anInt7069 = ((Class213_Sub2) this).anInt7063;
		((Class213_Sub2) this).anInt7068 >>= 4;
		if (((Class213_Sub2) this).anInt7068 < 0)
			((Class213_Sub2) this).anInt7068 = 0;
		else if (((Class213_Sub2) this).anInt7068 > 255)
			((Class213_Sub2) this).anInt7068 = 255;
		method1976(((Class213_Sub2) this).anInt7071++, (byte) ((Class213_Sub2) this).anInt7068);
		((Class213_Sub2) this).anInt7068 = 0;
	}

	void method1976(int i, byte i_7_) {
		((Class213_Sub2) this).aByteArray7064[i] = i_7_;
	}

	void method1959() {
		((Class213_Sub2) this).anInt7071 = 0;
		((Class213_Sub2) this).anInt7068 = 0;
	}

	void method1966() {
		((Class213_Sub2) this).anInt7071 = 0;
		((Class213_Sub2) this).anInt7068 = 0;
	}

	void method1967() {
		((Class213_Sub2) this).anInt7069 = ((Class213_Sub2) this).anInt7063;
		((Class213_Sub2) this).anInt7068 >>= 4;
		if (((Class213_Sub2) this).anInt7068 < 0)
			((Class213_Sub2) this).anInt7068 = 0;
		else if (((Class213_Sub2) this).anInt7068 > 255)
			((Class213_Sub2) this).anInt7068 = 255;
		method1976(((Class213_Sub2) this).anInt7071++, (byte) ((Class213_Sub2) this).anInt7068);
		((Class213_Sub2) this).anInt7068 = 0;
	}

	void method1960(int i, int i_8_) {
		if (i != 0) {
			((Class213_Sub2) this).anInt7065 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7067) >> 12;
			if (((Class213_Sub2) this).anInt7065 < 0)
				((Class213_Sub2) this).anInt7065 = 0;
			else if (((Class213_Sub2) this).anInt7065 > 4096)
				((Class213_Sub2) this).anInt7065 = 4096;
			((Class213_Sub2) this).anInt7066 = ((Class213_Sub2) this).anInt7070 - (i_8_ < 0 ? -i_8_ : i_8_);
			((Class213_Sub2) this).anInt7066 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7066) >> 12;
			((Class213_Sub2) this).anInt7066 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7065) >> 12;
			((Class213_Sub2) this).anInt7068 += (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7069) >> 12;
			((Class213_Sub2) this).anInt7069 = (((Class213_Sub2) this).anInt7069 * ((Class213_Sub2) this).anInt7063) >> 12;
		} else {
			((Class213_Sub2) this).anInt7066 = ((Class213_Sub2) this).anInt7070 - (i_8_ < 0 ? -i_8_ : i_8_);
			((Class213_Sub2) this).anInt7066 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7066) >> 12;
			((Class213_Sub2) this).anInt7065 = 4096;
			((Class213_Sub2) this).anInt7068 = ((Class213_Sub2) this).anInt7066;
		}
	}

	void method1968(int i, int i_9_) {
		if (i != 0) {
			((Class213_Sub2) this).anInt7065 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7067) >> 12;
			if (((Class213_Sub2) this).anInt7065 < 0)
				((Class213_Sub2) this).anInt7065 = 0;
			else if (((Class213_Sub2) this).anInt7065 > 4096)
				((Class213_Sub2) this).anInt7065 = 4096;
			((Class213_Sub2) this).anInt7066 = ((Class213_Sub2) this).anInt7070 - (i_9_ < 0 ? -i_9_ : i_9_);
			((Class213_Sub2) this).anInt7066 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7066) >> 12;
			((Class213_Sub2) this).anInt7066 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7065) >> 12;
			((Class213_Sub2) this).anInt7068 += (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7069) >> 12;
			((Class213_Sub2) this).anInt7069 = (((Class213_Sub2) this).anInt7069 * ((Class213_Sub2) this).anInt7063) >> 12;
		} else {
			((Class213_Sub2) this).anInt7066 = ((Class213_Sub2) this).anInt7070 - (i_9_ < 0 ? -i_9_ : i_9_);
			((Class213_Sub2) this).anInt7066 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7066) >> 12;
			((Class213_Sub2) this).anInt7065 = 4096;
			((Class213_Sub2) this).anInt7068 = ((Class213_Sub2) this).anInt7066;
		}
	}

	void method1969(int i, int i_10_) {
		if (i != 0) {
			((Class213_Sub2) this).anInt7065 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7067) >> 12;
			if (((Class213_Sub2) this).anInt7065 < 0)
				((Class213_Sub2) this).anInt7065 = 0;
			else if (((Class213_Sub2) this).anInt7065 > 4096)
				((Class213_Sub2) this).anInt7065 = 4096;
			((Class213_Sub2) this).anInt7066 = ((Class213_Sub2) this).anInt7070 - (i_10_ < 0 ? -i_10_ : i_10_);
			((Class213_Sub2) this).anInt7066 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7066) >> 12;
			((Class213_Sub2) this).anInt7066 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7065) >> 12;
			((Class213_Sub2) this).anInt7068 += (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7069) >> 12;
			((Class213_Sub2) this).anInt7069 = (((Class213_Sub2) this).anInt7069 * ((Class213_Sub2) this).anInt7063) >> 12;
		} else {
			((Class213_Sub2) this).anInt7066 = ((Class213_Sub2) this).anInt7070 - (i_10_ < 0 ? -i_10_ : i_10_);
			((Class213_Sub2) this).anInt7066 = (((Class213_Sub2) this).anInt7066 * ((Class213_Sub2) this).anInt7066) >> 12;
			((Class213_Sub2) this).anInt7065 = 4096;
			((Class213_Sub2) this).anInt7068 = ((Class213_Sub2) this).anInt7066;
		}
	}
}
