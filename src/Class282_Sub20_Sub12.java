/* Class282_Sub20_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub12 extends Class282_Sub20 {
	int anInt9807;
	int[] anIntArray9808;
	static final int anInt9809 = 3216;
	int anInt9810 = 1231097856;
	static final int anInt9811 = 3216;
	static final int anInt9812 = 4096;
	int anInt9813 = -262300048;
	static byte[] aByteArray9814;

	void method15265() {
		double d = Math.cos((double) ((float) ((((Class282_Sub20_Sub12) this).anInt9807) * -1345936039) / 4096.0F));
		((Class282_Sub20_Sub12) this).anIntArray9808[0] = (int) (Math.sin((double) ((float) ((((Class282_Sub20_Sub12) this).anInt9813) * -453977649) / 4096.0F)) * d * 4096.0);
		((Class282_Sub20_Sub12) this).anIntArray9808[1] = (int) (Math.cos((double) ((float) ((((Class282_Sub20_Sub12) this).anInt9813) * -453977649) / 4096.0F)) * d * 4096.0);
		((Class282_Sub20_Sub12) this).anIntArray9808[2] = (int) (Math.sin((double) ((float) ((((Class282_Sub20_Sub12) this).anInt9807) * -1345936039) / 4096.0F)) * 4096.0);
		int i = ((((Class282_Sub20_Sub12) this).anIntArray9808[0] * ((Class282_Sub20_Sub12) this).anIntArray9808[0]) >> 12);
		int i_0_ = ((((Class282_Sub20_Sub12) this).anIntArray9808[1] * ((Class282_Sub20_Sub12) this).anIntArray9808[1]) >> 12);
		int i_1_ = ((((Class282_Sub20_Sub12) this).anIntArray9808[2] * ((Class282_Sub20_Sub12) this).anIntArray9808[2]) >> 12);
		int i_2_ = (int) (Math.sqrt((double) (i + i_0_ + i_1_ >> 12)) * 4096.0);
		if (0 != i_2_) {
			((Class282_Sub20_Sub12) this).anIntArray9808[0] = ((((Class282_Sub20_Sub12) this).anIntArray9808[0] << 12) / i_2_);
			((Class282_Sub20_Sub12) this).anIntArray9808[1] = ((((Class282_Sub20_Sub12) this).anIntArray9808[1] << 12) / i_2_);
			((Class282_Sub20_Sub12) this).anIntArray9808[2] = ((((Class282_Sub20_Sub12) this).anIntArray9808[2] << 12) / i_2_);
		}
	}

	int[] method12319(int i, int i_3_) {
		int[] is = aClass320_7667.method5721(i, -1267538320);
		if (aClass320_7667.aBool3722) {
			int i_4_ = ((((Class282_Sub20_Sub12) this).anInt9810 * -912188687 * (-368504257 * Class316.anInt3678)) >> 12);
			int[] is_5_ = method12317(0, i - 1 & 543225399 * Class316.anInt3673, 2074480693);
			int[] is_6_ = method12317(0, i, 1959940073);
			int[] is_7_ = method12317(0, 1 + i & Class316.anInt3673 * 543225399, 2107834570);
			for (int i_8_ = 0; i_8_ < -402153223 * Class316.anInt3670; i_8_++) {
				int i_9_ = i_4_ * (is_7_[i_8_] - is_5_[i_8_]) >> 12;
				int i_10_ = i_4_ * (is_6_[i_8_ - 1 & Class316.anInt3669 * 1201532175] - is_6_[i_8_ + 1 & (Class316.anInt3669 * 1201532175)]) >> 12;
				int i_11_ = i_10_ >> 4;
				int i_12_ = i_9_ >> 4;
				if (i_11_ < 0)
					i_11_ = -i_11_;
				if (i_11_ > 255)
					i_11_ = 255;
				if (i_12_ < 0)
					i_12_ = -i_12_;
				if (i_12_ > 255)
					i_12_ = 255;
				int i_13_ = (aByteArray9814[i_11_ + ((1 + i_12_) * i_12_ >> 1)] & 0xff);
				int i_14_ = i_10_ * i_13_ >> 8;
				int i_15_ = i_9_ * i_13_ >> 8;
				int i_16_ = i_13_ * 4096 >> 8;
				i_14_ = (i_14_ * ((Class282_Sub20_Sub12) this).anIntArray9808[0] >> 12);
				i_15_ = (((Class282_Sub20_Sub12) this).anIntArray9808[1] * i_15_ >> 12);
				i_16_ = (i_16_ * ((Class282_Sub20_Sub12) this).anIntArray9808[2] >> 12);
				is[i_8_] = i_16_ + (i_15_ + i_14_);
			}
		}
		return is;
	}

	void method12321(int i) {
		method15266((byte) 0);
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -368418857);
		if (aClass320_7667.aBool3722) {
			int i_17_ = ((((Class282_Sub20_Sub12) this).anInt9810 * -912188687 * (-368504257 * Class316.anInt3678)) >> 12);
			int[] is_18_ = method12317(0, i - 1 & 543225399 * Class316.anInt3673, 2092510661);
			int[] is_19_ = method12317(0, i, 2126835949);
			int[] is_20_ = method12317(0, 1 + i & Class316.anInt3673 * 543225399, 2073253019);
			for (int i_21_ = 0; i_21_ < -402153223 * Class316.anInt3670; i_21_++) {
				int i_22_ = i_17_ * (is_20_[i_21_] - is_18_[i_21_]) >> 12;
				int i_23_ = (i_17_ * (is_19_[i_21_ - 1 & (Class316.anInt3669 * 1201532175)] - is_19_[i_21_ + 1 & (Class316.anInt3669 * 1201532175)]) >> 12);
				int i_24_ = i_23_ >> 4;
				int i_25_ = i_22_ >> 4;
				if (i_24_ < 0)
					i_24_ = -i_24_;
				if (i_24_ > 255)
					i_24_ = 255;
				if (i_25_ < 0)
					i_25_ = -i_25_;
				if (i_25_ > 255)
					i_25_ = 255;
				int i_26_ = (aByteArray9814[i_24_ + ((1 + i_25_) * i_25_ >> 1)] & 0xff);
				int i_27_ = i_23_ * i_26_ >> 8;
				int i_28_ = i_22_ * i_26_ >> 8;
				int i_29_ = i_26_ * 4096 >> 8;
				i_27_ = (i_27_ * ((Class282_Sub20_Sub12) this).anIntArray9808[0] >> 12);
				i_28_ = (((Class282_Sub20_Sub12) this).anIntArray9808[1] * i_28_ >> 12);
				i_29_ = (i_29_ * ((Class282_Sub20_Sub12) this).anIntArray9808[2] >> 12);
				is[i_21_] = i_29_ + (i_28_ + i_27_);
			}
		}
		return is;
	}

	void method15266(byte i) {
		double d = Math.cos((double) ((float) ((((Class282_Sub20_Sub12) this).anInt9807) * -1345936039) / 4096.0F));
		((Class282_Sub20_Sub12) this).anIntArray9808[0] = (int) (Math.sin((double) ((float) ((((Class282_Sub20_Sub12) this).anInt9813) * -453977649) / 4096.0F)) * d * 4096.0);
		((Class282_Sub20_Sub12) this).anIntArray9808[1] = (int) (Math.cos((double) ((float) ((((Class282_Sub20_Sub12) this).anInt9813) * -453977649) / 4096.0F)) * d * 4096.0);
		((Class282_Sub20_Sub12) this).anIntArray9808[2] = (int) (Math.sin((double) ((float) ((((Class282_Sub20_Sub12) this).anInt9807) * -1345936039) / 4096.0F)) * 4096.0);
		int i_30_ = ((((Class282_Sub20_Sub12) this).anIntArray9808[0] * ((Class282_Sub20_Sub12) this).anIntArray9808[0]) >> 12);
		int i_31_ = ((((Class282_Sub20_Sub12) this).anIntArray9808[1] * ((Class282_Sub20_Sub12) this).anIntArray9808[1]) >> 12);
		int i_32_ = ((((Class282_Sub20_Sub12) this).anIntArray9808[2] * ((Class282_Sub20_Sub12) this).anIntArray9808[2]) >> 12);
		int i_33_ = (int) (Math.sqrt((double) (i_30_ + i_31_ + i_32_ >> 12)) * 4096.0);
		if (0 != i_33_) {
			((Class282_Sub20_Sub12) this).anIntArray9808[0] = ((((Class282_Sub20_Sub12) this).anIntArray9808[0] << 12) / i_33_);
			((Class282_Sub20_Sub12) this).anIntArray9808[1] = ((((Class282_Sub20_Sub12) this).anIntArray9808[1] << 12) / i_33_);
			((Class282_Sub20_Sub12) this).anIntArray9808[2] = ((((Class282_Sub20_Sub12) this).anIntArray9808[2] << 12) / i_33_);
		}
	}

	static {
		int i = 0;
		aByteArray9814 = new byte[32896];
		for (int i_34_ = 0; i_34_ < 256; i_34_++) {
			for (int i_35_ = 0; i_35_ <= i_34_; i_35_++)
				aByteArray9814[i++] = (byte) (int) (255.0 / Math.sqrt((double) ((float) ((i_35_ * i_35_) + (i_34_ * i_34_) + 65535) / 65535.0F)));
		}
	}

	public Class282_Sub20_Sub12() {
		super(1, true);
		((Class282_Sub20_Sub12) this).anInt9807 = 1256296208;
		((Class282_Sub20_Sub12) this).anIntArray9808 = new int[3];
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -117046449);
		if (aClass320_7667.aBool3722) {
			int i_36_ = ((((Class282_Sub20_Sub12) this).anInt9810 * -912188687 * (-368504257 * Class316.anInt3678)) >> 12);
			int[] is_37_ = method12317(0, i - 1 & 543225399 * Class316.anInt3673, 2070219440);
			int[] is_38_ = method12317(0, i, 1962286609);
			int[] is_39_ = method12317(0, 1 + i & Class316.anInt3673 * 543225399, 2065730387);
			for (int i_40_ = 0; i_40_ < -402153223 * Class316.anInt3670; i_40_++) {
				int i_41_ = i_36_ * (is_39_[i_40_] - is_37_[i_40_]) >> 12;
				int i_42_ = (i_36_ * (is_38_[i_40_ - 1 & (Class316.anInt3669 * 1201532175)] - is_38_[i_40_ + 1 & (Class316.anInt3669 * 1201532175)]) >> 12);
				int i_43_ = i_42_ >> 4;
				int i_44_ = i_41_ >> 4;
				if (i_43_ < 0)
					i_43_ = -i_43_;
				if (i_43_ > 255)
					i_43_ = 255;
				if (i_44_ < 0)
					i_44_ = -i_44_;
				if (i_44_ > 255)
					i_44_ = 255;
				int i_45_ = (aByteArray9814[i_43_ + ((1 + i_44_) * i_44_ >> 1)] & 0xff);
				int i_46_ = i_42_ * i_45_ >> 8;
				int i_47_ = i_41_ * i_45_ >> 8;
				int i_48_ = i_45_ * 4096 >> 8;
				i_46_ = (i_46_ * ((Class282_Sub20_Sub12) this).anIntArray9808[0] >> 12);
				i_47_ = (((Class282_Sub20_Sub12) this).anIntArray9808[1] * i_47_ >> 12);
				i_48_ = (i_48_ * ((Class282_Sub20_Sub12) this).anIntArray9808[2] >> 12);
				is[i_40_] = i_48_ + (i_47_ + i_46_);
			}
		}
		return is;
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -1490454858);
		if (aClass320_7667.aBool3722) {
			int i_49_ = ((((Class282_Sub20_Sub12) this).anInt9810 * -912188687 * (-368504257 * Class316.anInt3678)) >> 12);
			int[] is_50_ = method12317(0, i - 1 & 543225399 * Class316.anInt3673, 2080300415);
			int[] is_51_ = method12317(0, i, 2044934727);
			int[] is_52_ = method12317(0, 1 + i & Class316.anInt3673 * 543225399, 1940577891);
			for (int i_53_ = 0; i_53_ < -402153223 * Class316.anInt3670; i_53_++) {
				int i_54_ = i_49_ * (is_52_[i_53_] - is_50_[i_53_]) >> 12;
				int i_55_ = (i_49_ * (is_51_[i_53_ - 1 & (Class316.anInt3669 * 1201532175)] - is_51_[i_53_ + 1 & (Class316.anInt3669 * 1201532175)]) >> 12);
				int i_56_ = i_55_ >> 4;
				int i_57_ = i_54_ >> 4;
				if (i_56_ < 0)
					i_56_ = -i_56_;
				if (i_56_ > 255)
					i_56_ = 255;
				if (i_57_ < 0)
					i_57_ = -i_57_;
				if (i_57_ > 255)
					i_57_ = 255;
				int i_58_ = (aByteArray9814[i_56_ + ((1 + i_57_) * i_57_ >> 1)] & 0xff);
				int i_59_ = i_55_ * i_58_ >> 8;
				int i_60_ = i_54_ * i_58_ >> 8;
				int i_61_ = i_58_ * 4096 >> 8;
				i_59_ = (i_59_ * ((Class282_Sub20_Sub12) this).anIntArray9808[0] >> 12);
				i_60_ = (((Class282_Sub20_Sub12) this).anIntArray9808[1] * i_60_ >> 12);
				i_61_ = (i_61_ * ((Class282_Sub20_Sub12) this).anIntArray9808[2] >> 12);
				is[i_53_] = i_61_ + (i_60_ + i_59_);
			}
		}
		return is;
	}

	void method12328() {
		method15266((byte) 0);
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_62_) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub12) this).anInt9813 = class282_sub35.readUnsignedShort() * -1000370897;
			break;
		case 2:
			((Class282_Sub20_Sub12) this).anInt9807 = class282_sub35.readUnsignedShort() * -595242263;
			break;
		case 0:
			((Class282_Sub20_Sub12) this).anInt9810 = class282_sub35.readUnsignedShort() * -154888687;
			break;
		}
	}

	void method12350() {
		method15266((byte) 0);
	}

	void method12318() {
		method15266((byte) 0);
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub12) this).anInt9813 = class282_sub35.readUnsignedShort() * -1000370897;
			break;
		case 2:
			((Class282_Sub20_Sub12) this).anInt9807 = class282_sub35.readUnsignedShort() * -595242263;
			break;
		case 0:
			((Class282_Sub20_Sub12) this).anInt9810 = class282_sub35.readUnsignedShort() * -154888687;
			break;
		}
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub12) this).anInt9813 = class282_sub35.readUnsignedShort() * -1000370897;
			break;
		case 2:
			((Class282_Sub20_Sub12) this).anInt9807 = class282_sub35.readUnsignedShort() * -595242263;
			break;
		case 0:
			((Class282_Sub20_Sub12) this).anInt9810 = class282_sub35.readUnsignedShort() * -154888687;
			break;
		}
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub12) this).anInt9813 = class282_sub35.readUnsignedShort() * -1000370897;
			break;
		case 2:
			((Class282_Sub20_Sub12) this).anInt9807 = class282_sub35.readUnsignedShort() * -595242263;
			break;
		case 0:
			((Class282_Sub20_Sub12) this).anInt9810 = class282_sub35.readUnsignedShort() * -154888687;
			break;
		}
	}

	void method12329() {
		method15266((byte) 0);
	}
}
