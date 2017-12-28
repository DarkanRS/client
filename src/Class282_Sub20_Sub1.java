/* Class282_Sub20_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub1 extends Class282_Sub20 {
	static final int anInt9589 = 0;
	static final int anInt9590 = 1;
	static final int anInt9591 = 2;
	int[] anIntArray9592;
	int anInt9593 = -794373842;
	int anInt9594 = -714721280;
	int anInt9595 = 0;
	int[] anIntArray9596;
	static final int anInt9597 = 3;

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub1) this).anInt9593 = class282_sub35.readUnsignedByte() * 779556075;
			break;
		case 1:
			((Class282_Sub20_Sub1) this).anInt9594 = class282_sub35.readUnsignedShort() * 1620749511;
			break;
		case 2:
			((Class282_Sub20_Sub1) this).anInt9595 = class282_sub35.readUnsignedByte() * 115152153;
			break;
		}
	}

	int[] method12319(int i, int i_0_) {
		int[] is = aClass320_7667.method5721(i, -644245331);
		if (aClass320_7667.aBool3722) {
			int i_1_ = Class316.anIntArray3668[i];
			if (((Class282_Sub20_Sub1) this).anInt9595 * -667846871 != 0) {
				for (int i_2_ = 0; i_2_ < -402153223 * Class316.anInt3670; i_2_++) {
					int i_3_ = 0;
					int i_4_ = 0;
					int i_5_ = Class316.anIntArray3672[i_2_];
					switch (-667846871 * ((Class282_Sub20_Sub1) this).anInt9595) {
					case 2:
						i_3_ = 2048 + (i_5_ - (4096 - i_1_) >> 1);
						break;
					case 3:
						i_3_ = (i_5_ - i_1_ >> 1) + 2048;
						break;
					case 1:
						i_3_ = i_5_;
						break;
					}
					for (int i_6_ = 0; i_6_ < (-615451709 * ((Class282_Sub20_Sub1) this).anInt9593); i_6_++) {
						if (i_3_ >= (((Class282_Sub20_Sub1) this).anIntArray9592[i_6_]) && i_3_ < (((Class282_Sub20_Sub1) this).anIntArray9592[1 + i_6_])) {
							if (i_3_ < (((Class282_Sub20_Sub1) this).anIntArray9596[i_6_]))
								i_4_ = 4096;
							break;
						}
					}
					is[i_2_] = i_4_;
				}
			} else {
				int i_7_ = 0;
				for (int i_8_ = 0; (i_8_ < ((Class282_Sub20_Sub1) this).anInt9593 * -615451709); i_8_++) {
					if ((i_1_ >= ((Class282_Sub20_Sub1) this).anIntArray9592[i_8_]) && i_1_ < (((Class282_Sub20_Sub1) this).anIntArray9592[1 + i_8_])) {
						if (i_1_ < (((Class282_Sub20_Sub1) this).anIntArray9596[i_8_]))
							i_7_ = 4096;
						break;
					}
				}
				Class503.method8365(is, 0, -402153223 * Class316.anInt3670, i_7_);
			}
		}
		return is;
	}

	public Class282_Sub20_Sub1() {
		super(0, true);
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, 726025678);
		if (aClass320_7667.aBool3722) {
			int i_9_ = Class316.anIntArray3668[i];
			if (((Class282_Sub20_Sub1) this).anInt9595 * -667846871 != 0) {
				for (int i_10_ = 0; i_10_ < -402153223 * Class316.anInt3670; i_10_++) {
					int i_11_ = 0;
					int i_12_ = 0;
					int i_13_ = Class316.anIntArray3672[i_10_];
					switch (-667846871 * ((Class282_Sub20_Sub1) this).anInt9595) {
					case 2:
						i_11_ = 2048 + (i_13_ - (4096 - i_9_) >> 1);
						break;
					case 3:
						i_11_ = (i_13_ - i_9_ >> 1) + 2048;
						break;
					case 1:
						i_11_ = i_13_;
						break;
					}
					for (int i_14_ = 0; i_14_ < (-615451709 * ((Class282_Sub20_Sub1) this).anInt9593); i_14_++) {
						if (i_11_ >= (((Class282_Sub20_Sub1) this).anIntArray9592[i_14_]) && i_11_ < (((Class282_Sub20_Sub1) this).anIntArray9592[1 + i_14_])) {
							if (i_11_ < (((Class282_Sub20_Sub1) this).anIntArray9596[i_14_]))
								i_12_ = 4096;
							break;
						}
					}
					is[i_10_] = i_12_;
				}
			} else {
				int i_15_ = 0;
				for (int i_16_ = 0; (i_16_ < ((Class282_Sub20_Sub1) this).anInt9593 * -615451709); i_16_++) {
					if ((i_9_ >= ((Class282_Sub20_Sub1) this).anIntArray9592[i_16_]) && i_9_ < (((Class282_Sub20_Sub1) this).anIntArray9592[1 + i_16_])) {
						if (i_9_ < (((Class282_Sub20_Sub1) this).anIntArray9596[i_16_]))
							i_15_ = 4096;
						break;
					}
				}
				Class503.method8365(is, 0, -402153223 * Class316.anInt3670, i_15_);
			}
		}
		return is;
	}

	void method12321(int i) {
		method14842(-299192225);
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -1128469387);
		if (aClass320_7667.aBool3722) {
			int i_17_ = Class316.anIntArray3668[i];
			if (((Class282_Sub20_Sub1) this).anInt9595 * -667846871 != 0) {
				for (int i_18_ = 0; i_18_ < -402153223 * Class316.anInt3670; i_18_++) {
					int i_19_ = 0;
					int i_20_ = 0;
					int i_21_ = Class316.anIntArray3672[i_18_];
					switch (-667846871 * ((Class282_Sub20_Sub1) this).anInt9595) {
					case 2:
						i_19_ = 2048 + (i_21_ - (4096 - i_17_) >> 1);
						break;
					case 3:
						i_19_ = (i_21_ - i_17_ >> 1) + 2048;
						break;
					case 1:
						i_19_ = i_21_;
						break;
					}
					for (int i_22_ = 0; i_22_ < (-615451709 * ((Class282_Sub20_Sub1) this).anInt9593); i_22_++) {
						if (i_19_ >= (((Class282_Sub20_Sub1) this).anIntArray9592[i_22_]) && i_19_ < (((Class282_Sub20_Sub1) this).anIntArray9592[1 + i_22_])) {
							if (i_19_ < (((Class282_Sub20_Sub1) this).anIntArray9596[i_22_]))
								i_20_ = 4096;
							break;
						}
					}
					is[i_18_] = i_20_;
				}
			} else {
				int i_23_ = 0;
				for (int i_24_ = 0; (i_24_ < ((Class282_Sub20_Sub1) this).anInt9593 * -615451709); i_24_++) {
					if ((i_17_ >= ((Class282_Sub20_Sub1) this).anIntArray9592[i_24_]) && i_17_ < (((Class282_Sub20_Sub1) this).anIntArray9592[1 + i_24_])) {
						if (i_17_ < (((Class282_Sub20_Sub1) this).anIntArray9596[i_24_]))
							i_23_ = 4096;
						break;
					}
				}
				Class503.method8365(is, 0, -402153223 * Class316.anInt3670, i_23_);
			}
		}
		return is;
	}

	void method12329() {
		method14842(-628160221);
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub1) this).anInt9593 = class282_sub35.readUnsignedByte() * 779556075;
			break;
		case 1:
			((Class282_Sub20_Sub1) this).anInt9594 = class282_sub35.readUnsignedShort() * 1620749511;
			break;
		case 2:
			((Class282_Sub20_Sub1) this).anInt9595 = class282_sub35.readUnsignedByte() * 115152153;
			break;
		}
	}

	void method12328() {
		method14842(1696354829);
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -1571776532);
		if (aClass320_7667.aBool3722) {
			int i_25_ = Class316.anIntArray3668[i];
			if (((Class282_Sub20_Sub1) this).anInt9595 * -667846871 != 0) {
				for (int i_26_ = 0; i_26_ < -402153223 * Class316.anInt3670; i_26_++) {
					int i_27_ = 0;
					int i_28_ = 0;
					int i_29_ = Class316.anIntArray3672[i_26_];
					switch (-667846871 * ((Class282_Sub20_Sub1) this).anInt9595) {
					case 2:
						i_27_ = 2048 + (i_29_ - (4096 - i_25_) >> 1);
						break;
					case 3:
						i_27_ = (i_29_ - i_25_ >> 1) + 2048;
						break;
					case 1:
						i_27_ = i_29_;
						break;
					}
					for (int i_30_ = 0; i_30_ < (-615451709 * ((Class282_Sub20_Sub1) this).anInt9593); i_30_++) {
						if (i_27_ >= (((Class282_Sub20_Sub1) this).anIntArray9592[i_30_]) && i_27_ < (((Class282_Sub20_Sub1) this).anIntArray9592[1 + i_30_])) {
							if (i_27_ < (((Class282_Sub20_Sub1) this).anIntArray9596[i_30_]))
								i_28_ = 4096;
							break;
						}
					}
					is[i_26_] = i_28_;
				}
			} else {
				int i_31_ = 0;
				for (int i_32_ = 0; (i_32_ < ((Class282_Sub20_Sub1) this).anInt9593 * -615451709); i_32_++) {
					if ((i_25_ >= ((Class282_Sub20_Sub1) this).anIntArray9592[i_32_]) && i_25_ < (((Class282_Sub20_Sub1) this).anIntArray9592[1 + i_32_])) {
						if (i_25_ < (((Class282_Sub20_Sub1) this).anIntArray9596[i_32_]))
							i_31_ = 4096;
						break;
					}
				}
				Class503.method8365(is, 0, -402153223 * Class316.anInt3670, i_31_);
			}
		}
		return is;
	}

	void method12350() {
		method14842(45100402);
	}

	void method12318() {
		method14842(-1994081671);
	}

	void method14842(int i) {
		int i_33_ = 0;
		((Class282_Sub20_Sub1) this).anIntArray9596 = new int[1 + ((Class282_Sub20_Sub1) this).anInt9593 * -615451709];
		((Class282_Sub20_Sub1) this).anIntArray9592 = new int[-615451709 * ((Class282_Sub20_Sub1) this).anInt9593 + 1];
		int i_34_ = 4096 / (((Class282_Sub20_Sub1) this).anInt9593 * -615451709);
		int i_35_ = (i_34_ * (-1621207817 * ((Class282_Sub20_Sub1) this).anInt9594) >> 12);
		for (int i_36_ = 0; i_36_ < -615451709 * ((Class282_Sub20_Sub1) this).anInt9593; i_36_++) {
			((Class282_Sub20_Sub1) this).anIntArray9592[i_36_] = i_33_;
			((Class282_Sub20_Sub1) this).anIntArray9596[i_36_] = i_35_ + i_33_;
			i_33_ += i_34_;
		}
		((Class282_Sub20_Sub1) this).anIntArray9592[((Class282_Sub20_Sub1) this).anInt9593 * -615451709] = 4096;
		((Class282_Sub20_Sub1) this).anIntArray9596[-615451709 * ((Class282_Sub20_Sub1) this).anInt9593] = ((Class282_Sub20_Sub1) this).anIntArray9596[0] + 4096;
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub1) this).anInt9593 = class282_sub35.readUnsignedByte() * 779556075;
			break;
		case 1:
			((Class282_Sub20_Sub1) this).anInt9594 = class282_sub35.readUnsignedShort() * 1620749511;
			break;
		case 2:
			((Class282_Sub20_Sub1) this).anInt9595 = class282_sub35.readUnsignedByte() * 115152153;
			break;
		}
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_37_) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub1) this).anInt9593 = class282_sub35.readUnsignedByte() * 779556075;
			break;
		case 1:
			((Class282_Sub20_Sub1) this).anInt9594 = class282_sub35.readUnsignedShort() * 1620749511;
			break;
		case 2:
			((Class282_Sub20_Sub1) this).anInt9595 = class282_sub35.readUnsignedByte() * 115152153;
			break;
		}
	}

	void method14843() {
		int i = 0;
		((Class282_Sub20_Sub1) this).anIntArray9596 = new int[1 + ((Class282_Sub20_Sub1) this).anInt9593 * -615451709];
		((Class282_Sub20_Sub1) this).anIntArray9592 = new int[-615451709 * ((Class282_Sub20_Sub1) this).anInt9593 + 1];
		int i_38_ = 4096 / (((Class282_Sub20_Sub1) this).anInt9593 * -615451709);
		int i_39_ = (i_38_ * (-1621207817 * ((Class282_Sub20_Sub1) this).anInt9594) >> 12);
		for (int i_40_ = 0; i_40_ < -615451709 * ((Class282_Sub20_Sub1) this).anInt9593; i_40_++) {
			((Class282_Sub20_Sub1) this).anIntArray9592[i_40_] = i;
			((Class282_Sub20_Sub1) this).anIntArray9596[i_40_] = i_39_ + i;
			i += i_38_;
		}
		((Class282_Sub20_Sub1) this).anIntArray9592[((Class282_Sub20_Sub1) this).anInt9593 * -615451709] = 4096;
		((Class282_Sub20_Sub1) this).anIntArray9596[-615451709 * ((Class282_Sub20_Sub1) this).anInt9593] = ((Class282_Sub20_Sub1) this).anIntArray9596[0] + 4096;
	}

	void method14844() {
		int i = 0;
		((Class282_Sub20_Sub1) this).anIntArray9596 = new int[1 + ((Class282_Sub20_Sub1) this).anInt9593 * -615451709];
		((Class282_Sub20_Sub1) this).anIntArray9592 = new int[-615451709 * ((Class282_Sub20_Sub1) this).anInt9593 + 1];
		int i_41_ = 4096 / (((Class282_Sub20_Sub1) this).anInt9593 * -615451709);
		int i_42_ = (i_41_ * (-1621207817 * ((Class282_Sub20_Sub1) this).anInt9594) >> 12);
		for (int i_43_ = 0; i_43_ < -615451709 * ((Class282_Sub20_Sub1) this).anInt9593; i_43_++) {
			((Class282_Sub20_Sub1) this).anIntArray9592[i_43_] = i;
			((Class282_Sub20_Sub1) this).anIntArray9596[i_43_] = i_42_ + i;
			i += i_41_;
		}
		((Class282_Sub20_Sub1) this).anIntArray9592[((Class282_Sub20_Sub1) this).anInt9593 * -615451709] = 4096;
		((Class282_Sub20_Sub1) this).anIntArray9596[-615451709 * ((Class282_Sub20_Sub1) this).anInt9593] = ((Class282_Sub20_Sub1) this).anIntArray9596[0] + 4096;
	}
}
