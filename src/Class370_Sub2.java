/* Class370_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class370_Sub2 extends Class370 {
	int anInt7758;
	byte[] aByteArray7759;
	int anInt7760;
	int[] anIntArray7761 = new int[((Class370_Sub2) this).anInt4290];

	void method12517(int i, byte i_0_) {
		((Class370_Sub2) this).aByteArray7759[((Class370_Sub2) this).anInt7758++] = (byte) (127 + ((i_0_ & 0xff) >> 1));
	}

	void method12518(int i, byte i_1_) {
		((Class370_Sub2) this).aByteArray7759[((Class370_Sub2) this).anInt7758++] = (byte) (127 + ((i_1_ & 0xff) >> 1));
	}

	void method6337(int i, int i_2_) {
		((Class370_Sub2) this).anInt7760 += i_2_ * ((Class370_Sub2) this).anIntArray7761[i] >> 12;
	}

	void method6332() {
		((Class370_Sub2) this).anInt7758 = 0;
		((Class370_Sub2) this).anInt7760 = 0;
	}

	Class370_Sub2(int i, int i_3_, int i_4_, int i_5_, int i_6_, float f) {
		super(i, i_3_, i_4_, i_5_, i_6_);
		for (int i_7_ = 0; i_7_ < ((Class370_Sub2) this).anInt4290; i_7_++)
			((Class370_Sub2) this).anIntArray7761[i_7_] = (short) (int) (Math.pow((double) f, (double) i_7_) * 4096.0);
	}

	void method12519(int i, byte i_8_) {
		((Class370_Sub2) this).aByteArray7759[((Class370_Sub2) this).anInt7758++] = (byte) (127 + ((i_8_ & 0xff) >> 1));
	}

	void method6327(int i, int i_9_) {
		((Class370_Sub2) this).anInt7760 += i_9_ * ((Class370_Sub2) this).anIntArray7761[i] >> 12;
	}

	void method6330() {
		((Class370_Sub2) this).anInt7758 = 0;
		((Class370_Sub2) this).anInt7760 = 0;
	}

	void method6344() {
		((Class370_Sub2) this).anInt7760 = Math.abs(((Class370_Sub2) this).anInt7760);
		if (((Class370_Sub2) this).anInt7760 >= 4096)
			((Class370_Sub2) this).anInt7760 = 4095;
		method12517(((Class370_Sub2) this).anInt7758++, (byte) (((Class370_Sub2) this).anInt7760 >> 4));
		((Class370_Sub2) this).anInt7760 = 0;
	}

	void method6331() {
		((Class370_Sub2) this).anInt7758 = 0;
		((Class370_Sub2) this).anInt7760 = 0;
	}

	void method6333(int i, int i_10_) {
		((Class370_Sub2) this).anInt7760 += i_10_ * ((Class370_Sub2) this).anIntArray7761[i] >> 12;
	}

	void method6334(int i, int i_11_) {
		((Class370_Sub2) this).anInt7760 += i_11_ * ((Class370_Sub2) this).anIntArray7761[i] >> 12;
	}

	void method6321() {
		((Class370_Sub2) this).anInt7760 = Math.abs(((Class370_Sub2) this).anInt7760);
		if (((Class370_Sub2) this).anInt7760 >= 4096)
			((Class370_Sub2) this).anInt7760 = 4095;
		method12517(((Class370_Sub2) this).anInt7758++, (byte) (((Class370_Sub2) this).anInt7760 >> 4));
		((Class370_Sub2) this).anInt7760 = 0;
	}

	void method6345() {
		((Class370_Sub2) this).anInt7760 = Math.abs(((Class370_Sub2) this).anInt7760);
		if (((Class370_Sub2) this).anInt7760 >= 4096)
			((Class370_Sub2) this).anInt7760 = 4095;
		method12517(((Class370_Sub2) this).anInt7758++, (byte) (((Class370_Sub2) this).anInt7760 >> 4));
		((Class370_Sub2) this).anInt7760 = 0;
	}

	void method6340() {
		((Class370_Sub2) this).anInt7760 = Math.abs(((Class370_Sub2) this).anInt7760);
		if (((Class370_Sub2) this).anInt7760 >= 4096)
			((Class370_Sub2) this).anInt7760 = 4095;
		method12517(((Class370_Sub2) this).anInt7758++, (byte) (((Class370_Sub2) this).anInt7760 >> 4));
		((Class370_Sub2) this).anInt7760 = 0;
	}
}
