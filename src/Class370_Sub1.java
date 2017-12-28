/* Class370_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class370_Sub1 extends Class370 {
	int anInt7746;
	int anInt7747;
	int anInt7748;
	int anInt7749;
	int anInt7750;
	int anInt7751;
	byte[] aByteArray7752;
	int anInt7753;
	int anInt7754;

	void method12507(int i, byte i_0_) {
		((Class370_Sub1) this).aByteArray7752[i] = i_0_;
	}

	void method6337(int i, int i_1_) {
		if (i != 0) {
			((Class370_Sub1) this).anInt7750 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7748) >> 12;
			if (((Class370_Sub1) this).anInt7750 < 0)
				((Class370_Sub1) this).anInt7750 = 0;
			else if (((Class370_Sub1) this).anInt7750 > 4096)
				((Class370_Sub1) this).anInt7750 = 4096;
			((Class370_Sub1) this).anInt7749 = ((Class370_Sub1) this).anInt7753 - (i_1_ < 0 ? -i_1_ : i_1_);
			((Class370_Sub1) this).anInt7749 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7749) >> 12;
			((Class370_Sub1) this).anInt7749 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7750) >> 12;
			((Class370_Sub1) this).anInt7751 += (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7747) >> 12;
			((Class370_Sub1) this).anInt7747 = (((Class370_Sub1) this).anInt7747 * ((Class370_Sub1) this).anInt7754) >> 12;
		} else {
			((Class370_Sub1) this).anInt7749 = ((Class370_Sub1) this).anInt7753 - (i_1_ < 0 ? -i_1_ : i_1_);
			((Class370_Sub1) this).anInt7749 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7749) >> 12;
			((Class370_Sub1) this).anInt7750 = 4096;
			((Class370_Sub1) this).anInt7751 = ((Class370_Sub1) this).anInt7749;
		}
	}

	void method12508(int i, byte i_2_) {
		((Class370_Sub1) this).aByteArray7752[i] = i_2_;
	}

	void method6321() {
		((Class370_Sub1) this).anInt7747 = ((Class370_Sub1) this).anInt7754;
		((Class370_Sub1) this).anInt7751 >>= 4;
		if (((Class370_Sub1) this).anInt7751 < 0)
			((Class370_Sub1) this).anInt7751 = 0;
		else if (((Class370_Sub1) this).anInt7751 > 255)
			((Class370_Sub1) this).anInt7751 = 255;
		method12508(((Class370_Sub1) this).anInt7746++, (byte) ((Class370_Sub1) this).anInt7751);
		((Class370_Sub1) this).anInt7751 = 0;
	}

	void method6327(int i, int i_3_) {
		if (i != 0) {
			((Class370_Sub1) this).anInt7750 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7748) >> 12;
			if (((Class370_Sub1) this).anInt7750 < 0)
				((Class370_Sub1) this).anInt7750 = 0;
			else if (((Class370_Sub1) this).anInt7750 > 4096)
				((Class370_Sub1) this).anInt7750 = 4096;
			((Class370_Sub1) this).anInt7749 = ((Class370_Sub1) this).anInt7753 - (i_3_ < 0 ? -i_3_ : i_3_);
			((Class370_Sub1) this).anInt7749 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7749) >> 12;
			((Class370_Sub1) this).anInt7749 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7750) >> 12;
			((Class370_Sub1) this).anInt7751 += (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7747) >> 12;
			((Class370_Sub1) this).anInt7747 = (((Class370_Sub1) this).anInt7747 * ((Class370_Sub1) this).anInt7754) >> 12;
		} else {
			((Class370_Sub1) this).anInt7749 = ((Class370_Sub1) this).anInt7753 - (i_3_ < 0 ? -i_3_ : i_3_);
			((Class370_Sub1) this).anInt7749 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7749) >> 12;
			((Class370_Sub1) this).anInt7750 = 4096;
			((Class370_Sub1) this).anInt7751 = ((Class370_Sub1) this).anInt7749;
		}
	}

	void method12509(int i, byte i_4_) {
		((Class370_Sub1) this).aByteArray7752[i] = i_4_;
	}

	Class370_Sub1(int i, int i_5_, int i_6_, int i_7_, int i_8_, float f, float f_9_, float f_10_) {
		super(i, i_5_, i_6_, i_7_, i_8_);
		((Class370_Sub1) this).anInt7748 = (int) (f_10_ * 4096.0F);
		((Class370_Sub1) this).anInt7753 = (int) (f_9_ * 4096.0F);
		((Class370_Sub1) this).anInt7747 = ((Class370_Sub1) this).anInt7754 = (int) (Math.pow(0.5, (double) -f) * 4096.0);
	}

	void method12510(int i, byte i_11_) {
		((Class370_Sub1) this).aByteArray7752[i] = i_11_;
	}

	void method6330() {
		((Class370_Sub1) this).anInt7746 = 0;
		((Class370_Sub1) this).anInt7751 = 0;
	}

	void method6331() {
		((Class370_Sub1) this).anInt7746 = 0;
		((Class370_Sub1) this).anInt7751 = 0;
	}

	void method6344() {
		((Class370_Sub1) this).anInt7747 = ((Class370_Sub1) this).anInt7754;
		((Class370_Sub1) this).anInt7751 >>= 4;
		if (((Class370_Sub1) this).anInt7751 < 0)
			((Class370_Sub1) this).anInt7751 = 0;
		else if (((Class370_Sub1) this).anInt7751 > 255)
			((Class370_Sub1) this).anInt7751 = 255;
		method12508(((Class370_Sub1) this).anInt7746++, (byte) ((Class370_Sub1) this).anInt7751);
		((Class370_Sub1) this).anInt7751 = 0;
	}

	void method6333(int i, int i_12_) {
		if (i != 0) {
			((Class370_Sub1) this).anInt7750 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7748) >> 12;
			if (((Class370_Sub1) this).anInt7750 < 0)
				((Class370_Sub1) this).anInt7750 = 0;
			else if (((Class370_Sub1) this).anInt7750 > 4096)
				((Class370_Sub1) this).anInt7750 = 4096;
			((Class370_Sub1) this).anInt7749 = ((Class370_Sub1) this).anInt7753 - (i_12_ < 0 ? -i_12_ : i_12_);
			((Class370_Sub1) this).anInt7749 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7749) >> 12;
			((Class370_Sub1) this).anInt7749 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7750) >> 12;
			((Class370_Sub1) this).anInt7751 += (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7747) >> 12;
			((Class370_Sub1) this).anInt7747 = (((Class370_Sub1) this).anInt7747 * ((Class370_Sub1) this).anInt7754) >> 12;
		} else {
			((Class370_Sub1) this).anInt7749 = ((Class370_Sub1) this).anInt7753 - (i_12_ < 0 ? -i_12_ : i_12_);
			((Class370_Sub1) this).anInt7749 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7749) >> 12;
			((Class370_Sub1) this).anInt7750 = 4096;
			((Class370_Sub1) this).anInt7751 = ((Class370_Sub1) this).anInt7749;
		}
	}

	void method6334(int i, int i_13_) {
		if (i != 0) {
			((Class370_Sub1) this).anInt7750 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7748) >> 12;
			if (((Class370_Sub1) this).anInt7750 < 0)
				((Class370_Sub1) this).anInt7750 = 0;
			else if (((Class370_Sub1) this).anInt7750 > 4096)
				((Class370_Sub1) this).anInt7750 = 4096;
			((Class370_Sub1) this).anInt7749 = ((Class370_Sub1) this).anInt7753 - (i_13_ < 0 ? -i_13_ : i_13_);
			((Class370_Sub1) this).anInt7749 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7749) >> 12;
			((Class370_Sub1) this).anInt7749 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7750) >> 12;
			((Class370_Sub1) this).anInt7751 += (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7747) >> 12;
			((Class370_Sub1) this).anInt7747 = (((Class370_Sub1) this).anInt7747 * ((Class370_Sub1) this).anInt7754) >> 12;
		} else {
			((Class370_Sub1) this).anInt7749 = ((Class370_Sub1) this).anInt7753 - (i_13_ < 0 ? -i_13_ : i_13_);
			((Class370_Sub1) this).anInt7749 = (((Class370_Sub1) this).anInt7749 * ((Class370_Sub1) this).anInt7749) >> 12;
			((Class370_Sub1) this).anInt7750 = 4096;
			((Class370_Sub1) this).anInt7751 = ((Class370_Sub1) this).anInt7749;
		}
	}

	void method6332() {
		((Class370_Sub1) this).anInt7746 = 0;
		((Class370_Sub1) this).anInt7751 = 0;
	}

	void method6345() {
		((Class370_Sub1) this).anInt7747 = ((Class370_Sub1) this).anInt7754;
		((Class370_Sub1) this).anInt7751 >>= 4;
		if (((Class370_Sub1) this).anInt7751 < 0)
			((Class370_Sub1) this).anInt7751 = 0;
		else if (((Class370_Sub1) this).anInt7751 > 255)
			((Class370_Sub1) this).anInt7751 = 255;
		method12508(((Class370_Sub1) this).anInt7746++, (byte) ((Class370_Sub1) this).anInt7751);
		((Class370_Sub1) this).anInt7751 = 0;
	}

	void method6340() {
		((Class370_Sub1) this).anInt7747 = ((Class370_Sub1) this).anInt7754;
		((Class370_Sub1) this).anInt7751 >>= 4;
		if (((Class370_Sub1) this).anInt7751 < 0)
			((Class370_Sub1) this).anInt7751 = 0;
		else if (((Class370_Sub1) this).anInt7751 > 255)
			((Class370_Sub1) this).anInt7751 = 255;
		method12508(((Class370_Sub1) this).anInt7746++, (byte) ((Class370_Sub1) this).anInt7751);
		((Class370_Sub1) this).anInt7751 = 0;
	}
}
