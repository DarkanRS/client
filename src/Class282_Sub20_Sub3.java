/* Class282_Sub20_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub3 extends Class282_Sub20 {
	static final int anInt9676 = 0;
	static final int anInt9677 = 0;
	static final int anInt9678 = 2;
	static final int anInt9679 = 0;
	int anInt9680;
	static final int anInt9681 = 1;
	int anInt9682 = 0;
	static final int anInt9683 = 0;
	int anInt9684 = 0;

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -66926573);
		if (aClass320_7667.aBool3722) {
			int i_0_ = Class316.anIntArray3668[i];
			int i_1_ = i_0_ - 2048 >> 1;
			for (int i_2_ = 0; i_2_ < Class316.anInt3670 * -402153223; i_2_++) {
				int i_3_ = Class316.anIntArray3672[i_2_];
				int i_4_ = i_3_ - 2048 >> 1;
				int i_5_;
				if (0 == ((Class282_Sub20_Sub3) this).anInt9682 * -817363845)
					i_5_ = (((Class282_Sub20_Sub3) this).anInt9680 * 1870839623 * (i_3_ - i_0_));
				else {
					int i_6_ = i_1_ * i_1_ + i_4_ * i_4_ >> 12;
					i_5_ = (int) (Math.sqrt((double) ((float) i_6_ / 4096.0F)) * 4096.0);
					i_5_ = (int) ((double) (i_5_ * (1870839623 * (((Class282_Sub20_Sub3) this).anInt9680))) * 3.141592653589793);
				}
				i_5_ -= i_5_ & ~0xfff;
				if (0 == -61832463 * ((Class282_Sub20_Sub3) this).anInt9684)
					i_5_ = (4096 + Class316.anIntArray3677[i_5_ >> 4 & 0xff] >> 1);
				else if (-61832463 * ((Class282_Sub20_Sub3) this).anInt9684 == 2) {
					i_5_ -= 2048;
					if (i_5_ < 0)
						i_5_ = -i_5_;
					i_5_ = 2048 - i_5_ << 1;
				}
				is[i_2_] = i_5_;
			}
		}
		return is;
	}

	int[] method12319(int i, int i_7_) {
		int[] is = aClass320_7667.method5721(i, -4712683);
		if (aClass320_7667.aBool3722) {
			int i_8_ = Class316.anIntArray3668[i];
			int i_9_ = i_8_ - 2048 >> 1;
			for (int i_10_ = 0; i_10_ < Class316.anInt3670 * -402153223; i_10_++) {
				int i_11_ = Class316.anIntArray3672[i_10_];
				int i_12_ = i_11_ - 2048 >> 1;
				int i_13_;
				if (0 == ((Class282_Sub20_Sub3) this).anInt9682 * -817363845)
					i_13_ = (((Class282_Sub20_Sub3) this).anInt9680 * 1870839623 * (i_11_ - i_8_));
				else {
					int i_14_ = i_9_ * i_9_ + i_12_ * i_12_ >> 12;
					i_13_ = (int) (Math.sqrt((double) ((float) i_14_ / 4096.0F)) * 4096.0);
					i_13_ = (int) ((double) (i_13_ * (1870839623 * (((Class282_Sub20_Sub3) this).anInt9680))) * 3.141592653589793);
				}
				i_13_ -= i_13_ & ~0xfff;
				if (0 == -61832463 * ((Class282_Sub20_Sub3) this).anInt9684)
					i_13_ = (4096 + Class316.anIntArray3677[i_13_ >> 4 & 0xff] >> 1);
				else if (-61832463 * ((Class282_Sub20_Sub3) this).anInt9684 == 2) {
					i_13_ -= 2048;
					if (i_13_ < 0)
						i_13_ = -i_13_;
					i_13_ = 2048 - i_13_ << 1;
				}
				is[i_10_] = i_13_;
			}
		}
		return is;
	}

	void method12321(int i) {
		Class316.method5586((byte) 39);
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_15_) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub3) this).anInt9680 = class282_sub35.readUnsignedByte() * -41600393;
			break;
		case 0:
			((Class282_Sub20_Sub3) this).anInt9682 = class282_sub35.readUnsignedByte() * 2006137523;
			break;
		case 1:
			((Class282_Sub20_Sub3) this).anInt9684 = class282_sub35.readUnsignedByte() * -115331567;
			break;
		}
	}

	void method12318() {
		Class316.method5586((byte) -29);
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -898103251);
		if (aClass320_7667.aBool3722) {
			int i_16_ = Class316.anIntArray3668[i];
			int i_17_ = i_16_ - 2048 >> 1;
			for (int i_18_ = 0; i_18_ < Class316.anInt3670 * -402153223; i_18_++) {
				int i_19_ = Class316.anIntArray3672[i_18_];
				int i_20_ = i_19_ - 2048 >> 1;
				int i_21_;
				if (0 == ((Class282_Sub20_Sub3) this).anInt9682 * -817363845)
					i_21_ = (((Class282_Sub20_Sub3) this).anInt9680 * 1870839623 * (i_19_ - i_16_));
				else {
					int i_22_ = i_17_ * i_17_ + i_20_ * i_20_ >> 12;
					i_21_ = (int) (Math.sqrt((double) ((float) i_22_ / 4096.0F)) * 4096.0);
					i_21_ = (int) ((double) (i_21_ * (1870839623 * (((Class282_Sub20_Sub3) this).anInt9680))) * 3.141592653589793);
				}
				i_21_ -= i_21_ & ~0xfff;
				if (0 == -61832463 * ((Class282_Sub20_Sub3) this).anInt9684)
					i_21_ = (4096 + Class316.anIntArray3677[i_21_ >> 4 & 0xff] >> 1);
				else if (-61832463 * ((Class282_Sub20_Sub3) this).anInt9684 == 2) {
					i_21_ -= 2048;
					if (i_21_ < 0)
						i_21_ = -i_21_;
					i_21_ = 2048 - i_21_ << 1;
				}
				is[i_18_] = i_21_;
			}
		}
		return is;
	}

	void method12329() {
		Class316.method5586((byte) 14);
	}

	void method12328() {
		Class316.method5586((byte) 8);
	}

	void method12350() {
		Class316.method5586((byte) 109);
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -917809667);
		if (aClass320_7667.aBool3722) {
			int i_23_ = Class316.anIntArray3668[i];
			int i_24_ = i_23_ - 2048 >> 1;
			for (int i_25_ = 0; i_25_ < Class316.anInt3670 * -402153223; i_25_++) {
				int i_26_ = Class316.anIntArray3672[i_25_];
				int i_27_ = i_26_ - 2048 >> 1;
				int i_28_;
				if (0 == ((Class282_Sub20_Sub3) this).anInt9682 * -817363845)
					i_28_ = (((Class282_Sub20_Sub3) this).anInt9680 * 1870839623 * (i_26_ - i_23_));
				else {
					int i_29_ = i_24_ * i_24_ + i_27_ * i_27_ >> 12;
					i_28_ = (int) (Math.sqrt((double) ((float) i_29_ / 4096.0F)) * 4096.0);
					i_28_ = (int) ((double) (i_28_ * (1870839623 * (((Class282_Sub20_Sub3) this).anInt9680))) * 3.141592653589793);
				}
				i_28_ -= i_28_ & ~0xfff;
				if (0 == -61832463 * ((Class282_Sub20_Sub3) this).anInt9684)
					i_28_ = (4096 + Class316.anIntArray3677[i_28_ >> 4 & 0xff] >> 1);
				else if (-61832463 * ((Class282_Sub20_Sub3) this).anInt9684 == 2) {
					i_28_ -= 2048;
					if (i_28_ < 0)
						i_28_ = -i_28_;
					i_28_ = 2048 - i_28_ << 1;
				}
				is[i_25_] = i_28_;
			}
		}
		return is;
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub3) this).anInt9680 = class282_sub35.readUnsignedByte() * -41600393;
			break;
		case 0:
			((Class282_Sub20_Sub3) this).anInt9682 = class282_sub35.readUnsignedByte() * 2006137523;
			break;
		case 1:
			((Class282_Sub20_Sub3) this).anInt9684 = class282_sub35.readUnsignedByte() * -115331567;
			break;
		}
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub3) this).anInt9680 = class282_sub35.readUnsignedByte() * -41600393;
			break;
		case 0:
			((Class282_Sub20_Sub3) this).anInt9682 = class282_sub35.readUnsignedByte() * 2006137523;
			break;
		case 1:
			((Class282_Sub20_Sub3) this).anInt9684 = class282_sub35.readUnsignedByte() * -115331567;
			break;
		}
	}

	public Class282_Sub20_Sub3() {
		super(0, true);
		((Class282_Sub20_Sub3) this).anInt9680 = -41600393;
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub3) this).anInt9680 = class282_sub35.readUnsignedByte() * -41600393;
			break;
		case 0:
			((Class282_Sub20_Sub3) this).anInt9682 = class282_sub35.readUnsignedByte() * 2006137523;
			break;
		case 1:
			((Class282_Sub20_Sub3) this).anInt9684 = class282_sub35.readUnsignedByte() * -115331567;
			break;
		}
	}
}
