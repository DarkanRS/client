/* Class282_Sub20_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub14 extends Class282_Sub20 {
	int anInt9828;
	int anInt9829;
	int anInt9830 = 1110968320;
	int anInt9831;
	int anInt9832;
	int anInt9833;
	int anInt9834;

	void method12318() {
		Class316.method5586((byte) 24);
	}

	void method12321(int i) {
		Class316.method5586((byte) -57);
	}

	public Class282_Sub20_Sub14() {
		super(0, true);
		((Class282_Sub20_Sub14) this).anInt9829 = 0;
		((Class282_Sub20_Sub14) this).anInt9833 = 0;
		((Class282_Sub20_Sub14) this).anInt9831 = 751716352;
		((Class282_Sub20_Sub14) this).anInt9832 = -1836077056;
		((Class282_Sub20_Sub14) this).anInt9828 = -1085902848;
		((Class282_Sub20_Sub14) this).anInt9834 = 1102209024;
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_0_) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub14) this).anInt9829 = class282_sub35.readUnsignedShort() * 323874281;
			break;
		case 6:
			((Class282_Sub20_Sub14) this).anInt9834 = class282_sub35.readUnsignedShort() * 324668819;
			break;
		case 3:
			((Class282_Sub20_Sub14) this).anInt9831 = class282_sub35.readUnsignedShort() * 730175945;
			break;
		case 4:
			((Class282_Sub20_Sub14) this).anInt9832 = class282_sub35.readUnsignedShort() * -768406103;
			break;
		case 0:
			((Class282_Sub20_Sub14) this).anInt9830 = class282_sub35.readUnsignedShort() * -376944895;
			break;
		case 5:
			((Class282_Sub20_Sub14) this).anInt9828 = class282_sub35.readUnsignedShort() * 925627495;
			break;
		case 2:
			((Class282_Sub20_Sub14) this).anInt9833 = class282_sub35.readUnsignedShort() * -793996609;
			break;
		}
	}

	int[] method12319(int i, int i_1_) {
		int[] is = aClass320_7667.method5721(i, -935224374);
		if (aClass320_7667.aBool3722) {
			int i_2_ = Class316.anIntArray3668[i] - 2048;
			for (int i_3_ = 0; i_3_ < -402153223 * Class316.anInt3670; i_3_++) {
				int i_4_ = Class316.anIntArray3672[i_3_] - 2048;
				int i_5_ = (-2094483199 * ((Class282_Sub20_Sub14) this).anInt9830 + i_4_);
				i_5_ = i_5_ < -2048 ? i_5_ + 4096 : i_5_;
				i_5_ = i_5_ > 2048 ? i_5_ - 4096 : i_5_;
				int i_6_ = (i_2_ + -377111975 * ((Class282_Sub20_Sub14) this).anInt9829);
				i_6_ = i_6_ < -2048 ? 4096 + i_6_ : i_6_;
				i_6_ = i_6_ > 2048 ? i_6_ - 4096 : i_6_;
				int i_7_ = (i_4_ + 1617419583 * ((Class282_Sub20_Sub14) this).anInt9833);
				i_7_ = i_7_ < -2048 ? 4096 + i_7_ : i_7_;
				i_7_ = i_7_ > 2048 ? i_7_ - 4096 : i_7_;
				int i_8_ = (-47198087 * ((Class282_Sub20_Sub14) this).anInt9831 + i_2_);
				i_8_ = i_8_ < -2048 ? 4096 + i_8_ : i_8_;
				i_8_ = i_8_ > 2048 ? i_8_ - 4096 : i_8_;
				is[i_3_] = (method15302(i_5_, i_6_, 1009698181) || method15300(i_7_, i_8_, 662372949)) ? 4096 : 0;
			}
		}
		return is;
	}

	boolean method15300(int i, int i_9_, int i_10_) {
		int i_11_ = (((Class282_Sub20_Sub14) this).anInt9832 * -1545607527 * (i_9_ + i) >> 12);
		int i_12_ = Class316.anIntArray3675[i_11_ * 255 >> 12 & 0xff];
		i_12_ = (i_12_ << 12) / (-1545607527 * ((Class282_Sub20_Sub14) this).anInt9832);
		i_12_ = (i_12_ << 12) / (((Class282_Sub20_Sub14) this).anInt9834 * 746330267);
		i_12_ = (i_12_ * (((Class282_Sub20_Sub14) this).anInt9828 * -119412905) >> 12);
		return i_9_ - i < i_12_ && i_9_ - i > -i_12_;
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -1367488676);
		if (aClass320_7667.aBool3722) {
			int i_13_ = Class316.anIntArray3668[i] - 2048;
			for (int i_14_ = 0; i_14_ < -402153223 * Class316.anInt3670; i_14_++) {
				int i_15_ = Class316.anIntArray3672[i_14_] - 2048;
				int i_16_ = (-2094483199 * ((Class282_Sub20_Sub14) this).anInt9830 + i_15_);
				i_16_ = i_16_ < -2048 ? i_16_ + 4096 : i_16_;
				i_16_ = i_16_ > 2048 ? i_16_ - 4096 : i_16_;
				int i_17_ = (i_13_ + -377111975 * ((Class282_Sub20_Sub14) this).anInt9829);
				i_17_ = i_17_ < -2048 ? 4096 + i_17_ : i_17_;
				i_17_ = i_17_ > 2048 ? i_17_ - 4096 : i_17_;
				int i_18_ = (i_15_ + 1617419583 * ((Class282_Sub20_Sub14) this).anInt9833);
				i_18_ = i_18_ < -2048 ? 4096 + i_18_ : i_18_;
				i_18_ = i_18_ > 2048 ? i_18_ - 4096 : i_18_;
				int i_19_ = (-47198087 * ((Class282_Sub20_Sub14) this).anInt9831 + i_13_);
				i_19_ = i_19_ < -2048 ? 4096 + i_19_ : i_19_;
				i_19_ = i_19_ > 2048 ? i_19_ - 4096 : i_19_;
				is[i_14_] = (method15302(i_16_, i_17_, 957402701) || method15300(i_18_, i_19_, 662372949)) ? 4096 : 0;
			}
		}
		return is;
	}

	boolean method15301(int i, int i_20_) {
		int i_21_ = ((i_20_ - i) * (((Class282_Sub20_Sub14) this).anInt9832 * -1545607527) >> 12);
		int i_22_ = Class316.anIntArray3675[255 * i_21_ >> 12 & 0xff];
		i_22_ = (i_22_ << 12) / (((Class282_Sub20_Sub14) this).anInt9832 * -1545607527);
		i_22_ = (i_22_ << 12) / (746330267 * ((Class282_Sub20_Sub14) this).anInt9834);
		i_22_ = (((Class282_Sub20_Sub14) this).anInt9828 * -119412905 * i_22_ >> 12);
		return i + i_20_ < i_22_ && i + i_20_ > -i_22_;
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, 148767392);
		if (aClass320_7667.aBool3722) {
			int i_23_ = Class316.anIntArray3668[i] - 2048;
			for (int i_24_ = 0; i_24_ < -402153223 * Class316.anInt3670; i_24_++) {
				int i_25_ = Class316.anIntArray3672[i_24_] - 2048;
				int i_26_ = (-2094483199 * ((Class282_Sub20_Sub14) this).anInt9830 + i_25_);
				i_26_ = i_26_ < -2048 ? i_26_ + 4096 : i_26_;
				i_26_ = i_26_ > 2048 ? i_26_ - 4096 : i_26_;
				int i_27_ = (i_23_ + -377111975 * ((Class282_Sub20_Sub14) this).anInt9829);
				i_27_ = i_27_ < -2048 ? 4096 + i_27_ : i_27_;
				i_27_ = i_27_ > 2048 ? i_27_ - 4096 : i_27_;
				int i_28_ = (i_25_ + 1617419583 * ((Class282_Sub20_Sub14) this).anInt9833);
				i_28_ = i_28_ < -2048 ? 4096 + i_28_ : i_28_;
				i_28_ = i_28_ > 2048 ? i_28_ - 4096 : i_28_;
				int i_29_ = (-47198087 * ((Class282_Sub20_Sub14) this).anInt9831 + i_23_);
				i_29_ = i_29_ < -2048 ? 4096 + i_29_ : i_29_;
				i_29_ = i_29_ > 2048 ? i_29_ - 4096 : i_29_;
				is[i_24_] = (method15302(i_26_, i_27_, 957969375) || method15300(i_28_, i_29_, 662372949)) ? 4096 : 0;
			}
		}
		return is;
	}

	void method12350() {
		Class316.method5586((byte) -112);
	}

	void method12329() {
		Class316.method5586((byte) 39);
	}

	boolean method15302(int i, int i_30_, int i_31_) {
		int i_32_ = ((i_30_ - i) * (((Class282_Sub20_Sub14) this).anInt9832 * -1545607527) >> 12);
		int i_33_ = Class316.anIntArray3675[255 * i_32_ >> 12 & 0xff];
		i_33_ = (i_33_ << 12) / (((Class282_Sub20_Sub14) this).anInt9832 * -1545607527);
		i_33_ = (i_33_ << 12) / (746330267 * ((Class282_Sub20_Sub14) this).anInt9834);
		i_33_ = (((Class282_Sub20_Sub14) this).anInt9828 * -119412905 * i_33_ >> 12);
		return i + i_30_ < i_33_ && i + i_30_ > -i_33_;
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub14) this).anInt9829 = class282_sub35.readUnsignedShort() * 323874281;
			break;
		case 6:
			((Class282_Sub20_Sub14) this).anInt9834 = class282_sub35.readUnsignedShort() * 324668819;
			break;
		case 3:
			((Class282_Sub20_Sub14) this).anInt9831 = class282_sub35.readUnsignedShort() * 730175945;
			break;
		case 4:
			((Class282_Sub20_Sub14) this).anInt9832 = class282_sub35.readUnsignedShort() * -768406103;
			break;
		case 0:
			((Class282_Sub20_Sub14) this).anInt9830 = class282_sub35.readUnsignedShort() * -376944895;
			break;
		case 5:
			((Class282_Sub20_Sub14) this).anInt9828 = class282_sub35.readUnsignedShort() * 925627495;
			break;
		case 2:
			((Class282_Sub20_Sub14) this).anInt9833 = class282_sub35.readUnsignedShort() * -793996609;
			break;
		}
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub14) this).anInt9829 = class282_sub35.readUnsignedShort() * 323874281;
			break;
		case 6:
			((Class282_Sub20_Sub14) this).anInt9834 = class282_sub35.readUnsignedShort() * 324668819;
			break;
		case 3:
			((Class282_Sub20_Sub14) this).anInt9831 = class282_sub35.readUnsignedShort() * 730175945;
			break;
		case 4:
			((Class282_Sub20_Sub14) this).anInt9832 = class282_sub35.readUnsignedShort() * -768406103;
			break;
		case 0:
			((Class282_Sub20_Sub14) this).anInt9830 = class282_sub35.readUnsignedShort() * -376944895;
			break;
		case 5:
			((Class282_Sub20_Sub14) this).anInt9828 = class282_sub35.readUnsignedShort() * 925627495;
			break;
		case 2:
			((Class282_Sub20_Sub14) this).anInt9833 = class282_sub35.readUnsignedShort() * -793996609;
			break;
		}
	}

	void method12328() {
		Class316.method5586((byte) 27);
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub14) this).anInt9829 = class282_sub35.readUnsignedShort() * 323874281;
			break;
		case 6:
			((Class282_Sub20_Sub14) this).anInt9834 = class282_sub35.readUnsignedShort() * 324668819;
			break;
		case 3:
			((Class282_Sub20_Sub14) this).anInt9831 = class282_sub35.readUnsignedShort() * 730175945;
			break;
		case 4:
			((Class282_Sub20_Sub14) this).anInt9832 = class282_sub35.readUnsignedShort() * -768406103;
			break;
		case 0:
			((Class282_Sub20_Sub14) this).anInt9830 = class282_sub35.readUnsignedShort() * -376944895;
			break;
		case 5:
			((Class282_Sub20_Sub14) this).anInt9828 = class282_sub35.readUnsignedShort() * 925627495;
			break;
		case 2:
			((Class282_Sub20_Sub14) this).anInt9833 = class282_sub35.readUnsignedShort() * -793996609;
			break;
		}
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -797291481);
		if (aClass320_7667.aBool3722) {
			int i_34_ = Class316.anIntArray3668[i] - 2048;
			for (int i_35_ = 0; i_35_ < -402153223 * Class316.anInt3670; i_35_++) {
				int i_36_ = Class316.anIntArray3672[i_35_] - 2048;
				int i_37_ = (-2094483199 * ((Class282_Sub20_Sub14) this).anInt9830 + i_36_);
				i_37_ = i_37_ < -2048 ? i_37_ + 4096 : i_37_;
				i_37_ = i_37_ > 2048 ? i_37_ - 4096 : i_37_;
				int i_38_ = (i_34_ + -377111975 * ((Class282_Sub20_Sub14) this).anInt9829);
				i_38_ = i_38_ < -2048 ? 4096 + i_38_ : i_38_;
				i_38_ = i_38_ > 2048 ? i_38_ - 4096 : i_38_;
				int i_39_ = (i_36_ + 1617419583 * ((Class282_Sub20_Sub14) this).anInt9833);
				i_39_ = i_39_ < -2048 ? 4096 + i_39_ : i_39_;
				i_39_ = i_39_ > 2048 ? i_39_ - 4096 : i_39_;
				int i_40_ = (-47198087 * ((Class282_Sub20_Sub14) this).anInt9831 + i_34_);
				i_40_ = i_40_ < -2048 ? 4096 + i_40_ : i_40_;
				i_40_ = i_40_ > 2048 ? i_40_ - 4096 : i_40_;
				is[i_35_] = (method15302(i_37_, i_38_, 1037895997) || method15300(i_39_, i_40_, 662372949)) ? 4096 : 0;
			}
		}
		return is;
	}

	boolean method15303(int i, int i_41_) {
		int i_42_ = ((i_41_ - i) * (((Class282_Sub20_Sub14) this).anInt9832 * -1545607527) >> 12);
		int i_43_ = Class316.anIntArray3675[255 * i_42_ >> 12 & 0xff];
		i_43_ = (i_43_ << 12) / (((Class282_Sub20_Sub14) this).anInt9832 * -1545607527);
		i_43_ = (i_43_ << 12) / (746330267 * ((Class282_Sub20_Sub14) this).anInt9834);
		i_43_ = (((Class282_Sub20_Sub14) this).anInt9828 * -119412905 * i_43_ >> 12);
		return i + i_41_ < i_43_ && i + i_41_ > -i_43_;
	}

	boolean method15304(int i, int i_44_) {
		int i_45_ = (((Class282_Sub20_Sub14) this).anInt9832 * -1545607527 * (i_44_ + i) >> 12);
		int i_46_ = Class316.anIntArray3675[i_45_ * 255 >> 12 & 0xff];
		i_46_ = (i_46_ << 12) / (-1545607527 * ((Class282_Sub20_Sub14) this).anInt9832);
		i_46_ = (i_46_ << 12) / (((Class282_Sub20_Sub14) this).anInt9834 * 746330267);
		i_46_ = (i_46_ * (((Class282_Sub20_Sub14) this).anInt9828 * -119412905) >> 12);
		return i_44_ - i < i_46_ && i_44_ - i > -i_46_;
	}

	boolean method15305(int i, int i_47_) {
		int i_48_ = (((Class282_Sub20_Sub14) this).anInt9832 * -1545607527 * (i_47_ + i) >> 12);
		int i_49_ = Class316.anIntArray3675[i_48_ * 255 >> 12 & 0xff];
		i_49_ = (i_49_ << 12) / (-1545607527 * ((Class282_Sub20_Sub14) this).anInt9832);
		i_49_ = (i_49_ << 12) / (((Class282_Sub20_Sub14) this).anInt9834 * 746330267);
		i_49_ = (i_49_ * (((Class282_Sub20_Sub14) this).anInt9828 * -119412905) >> 12);
		return i_47_ - i < i_49_ && i_47_ - i > -i_49_;
	}
}
