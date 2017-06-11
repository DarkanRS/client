/* Class213_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class213_Sub1 extends Class213 {
	byte[] aByteArray7059;
	int anInt7060;
	int anInt7061;
	int[] anIntArray7062 = new int[((Class213_Sub1) this).anInt2443];

	void method1966() {
		((Class213_Sub1) this).anInt7060 = 0;
		((Class213_Sub1) this).anInt7061 = 0;
	}

	void method1959() {
		((Class213_Sub1) this).anInt7060 = 0;
		((Class213_Sub1) this).anInt7061 = 0;
	}

	void method1968(int i, int i_0_) {
		((Class213_Sub1) this).anInt7061 += i_0_ * ((Class213_Sub1) this).anIntArray7062[i] >> 12;
	}

	void method1961(int i, int i_1_) {
		((Class213_Sub1) this).anInt7061 += i_1_ * ((Class213_Sub1) this).anIntArray7062[i] >> 12;
	}

	void method1971(int i, byte i_2_) {
		((Class213_Sub1) this).aByteArray7059[((Class213_Sub1) this).anInt7060++] = (byte) (127 + ((i_2_ & 0xff) >> 1));
	}

	void method1967() {
		((Class213_Sub1) this).anInt7061 = Math.abs(((Class213_Sub1) this).anInt7061);
		if (((Class213_Sub1) this).anInt7061 >= 4096)
			((Class213_Sub1) this).anInt7061 = 4095;
		method1971(((Class213_Sub1) this).anInt7060++, (byte) (((Class213_Sub1) this).anInt7061 >> 4));
		((Class213_Sub1) this).anInt7061 = 0;
	}

	Class213_Sub1(int i, int i_3_, int i_4_, int i_5_, int i_6_, float f) {
		super(i, i_3_, i_4_, i_5_, i_6_);
		for (int i_7_ = 0; i_7_ < ((Class213_Sub1) this).anInt2443; i_7_++)
			((Class213_Sub1) this).anIntArray7062[i_7_] = (short) (int) (Math.pow((double) f, (double) i_7_) * 4096.0);
	}

	void method1960(int i, int i_8_) {
		((Class213_Sub1) this).anInt7061 += i_8_ * ((Class213_Sub1) this).anIntArray7062[i] >> 12;
	}

	void method1970() {
		((Class213_Sub1) this).anInt7061 = Math.abs(((Class213_Sub1) this).anInt7061);
		if (((Class213_Sub1) this).anInt7061 >= 4096)
			((Class213_Sub1) this).anInt7061 = 4095;
		method1971(((Class213_Sub1) this).anInt7060++, (byte) (((Class213_Sub1) this).anInt7061 >> 4));
		((Class213_Sub1) this).anInt7061 = 0;
	}

	void method1969(int i, int i_9_) {
		((Class213_Sub1) this).anInt7061 += i_9_ * ((Class213_Sub1) this).anIntArray7062[i] >> 12;
	}
}
