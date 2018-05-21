/* Class282_Sub20_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub7 extends Class282_Sub20 {
	static final int anInt9756 = 1024;
	static final int anInt9757 = 3072;
	static final boolean aBool9758 = false;
	int anInt9759 = -414249984;
	int anInt9760 = 198245376;
	int anInt9761 = -1527863296;

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 1102296745);
		if (aClass308_7670.aBool3619) {
			int[][] is_0_ = method12333(0, i, (byte) 3);
			int[] is_1_ = is_0_[0];
			int[] is_2_ = is_0_[1];
			int[] is_3_ = is_0_[2];
			int[] is_4_ = is[0];
			int[] is_5_ = is[1];
			int[] is_6_ = is[2];
			for (int i_7_ = 0; i_7_ < -402153223 * Class316.anInt3670; i_7_++) {
				is_4_[i_7_] = (((1669837693 * ((Class282_Sub20_Sub7) this).anInt9761 * is_1_[i_7_]) >> 12) + 655176939 * ((Class282_Sub20_Sub7) this).anInt9759);
				is_5_[i_7_] = (655176939 * ((Class282_Sub20_Sub7) this).anInt9759 + (is_2_[i_7_] * (((Class282_Sub20_Sub7) this).anInt9761 * 1669837693) >> 12));
				is_6_[i_7_] = ((is_3_[i_7_] * (((Class282_Sub20_Sub7) this).anInt9761 * 1669837693) >> 12) + ((Class282_Sub20_Sub7) this).anInt9759 * 655176939);
			}
		}
		return is;
	}

	int[][] method12320(int i, int i_8_) {
		int[][] is = aClass308_7670.method5463(i, 1866699649);
		if (aClass308_7670.aBool3619) {
			int[][] is_9_ = method12333(0, i, (byte) 3);
			int[] is_10_ = is_9_[0];
			int[] is_11_ = is_9_[1];
			int[] is_12_ = is_9_[2];
			int[] is_13_ = is[0];
			int[] is_14_ = is[1];
			int[] is_15_ = is[2];
			for (int i_16_ = 0; i_16_ < -402153223 * Class316.anInt3670; i_16_++) {
				is_13_[i_16_] = (((1669837693 * ((Class282_Sub20_Sub7) this).anInt9761 * is_10_[i_16_]) >> 12) + 655176939 * ((Class282_Sub20_Sub7) this).anInt9759);
				is_14_[i_16_] = (655176939 * ((Class282_Sub20_Sub7) this).anInt9759 + ((is_11_[i_16_] * (((Class282_Sub20_Sub7) this).anInt9761 * 1669837693)) >> 12));
				is_15_[i_16_] = ((is_12_[i_16_] * (((Class282_Sub20_Sub7) this).anInt9761 * 1669837693) >> 12) + ((Class282_Sub20_Sub7) this).anInt9759 * 655176939);
			}
		}
		return is;
	}

	void method12329() {
		((Class282_Sub20_Sub7) this).anInt9761 = (((Class282_Sub20_Sub7) this).anInt9760 * 1328990913 - ((Class282_Sub20_Sub7) this).anInt9759 * 1921853063);
	}

	void method12321(int i) {
		((Class282_Sub20_Sub7) this).anInt9761 = (((Class282_Sub20_Sub7) this).anInt9760 * 1328990913 - ((Class282_Sub20_Sub7) this).anInt9759 * 1921853063);
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_17_) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub7) this).anInt9759 = class282_sub35.readUnsignedShort() * 1111086019;
			break;
		case 1:
			((Class282_Sub20_Sub7) this).anInt9760 = class282_sub35.readUnsignedShort() * -1690239979;
			break;
		case 2:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		}
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -1363046362);
		if (aClass320_7667.aBool3722) {
			int[] is_18_ = method12317(0, i, 1945114311);
			for (int i_19_ = 0; i_19_ < Class316.anInt3670 * -402153223; i_19_++)
				is[i_19_] = (655176939 * ((Class282_Sub20_Sub7) this).anInt9759 + ((is_18_[i_19_] * (1669837693 * ((Class282_Sub20_Sub7) this).anInt9761)) >> 12));
		}
		return is;
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -1038152291);
		if (aClass320_7667.aBool3722) {
			int[] is_20_ = method12317(0, i, 2090441723);
			for (int i_21_ = 0; i_21_ < Class316.anInt3670 * -402153223; i_21_++)
				is[i_21_] = (655176939 * ((Class282_Sub20_Sub7) this).anInt9759 + ((is_20_[i_21_] * (1669837693 * ((Class282_Sub20_Sub7) this).anInt9761)) >> 12));
		}
		return is;
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -1667235906);
		if (aClass320_7667.aBool3722) {
			int[] is_22_ = method12317(0, i, 1963797400);
			for (int i_23_ = 0; i_23_ < Class316.anInt3670 * -402153223; i_23_++)
				is[i_23_] = (655176939 * ((Class282_Sub20_Sub7) this).anInt9759 + ((is_22_[i_23_] * (1669837693 * ((Class282_Sub20_Sub7) this).anInt9761)) >> 12));
		}
		return is;
	}

	void method12328() {
		((Class282_Sub20_Sub7) this).anInt9761 = (((Class282_Sub20_Sub7) this).anInt9760 * 1328990913 - ((Class282_Sub20_Sub7) this).anInt9759 * 1921853063);
	}

	public Class282_Sub20_Sub7() {
		super(1, false);
	}

	void method12350() {
		((Class282_Sub20_Sub7) this).anInt9761 = (((Class282_Sub20_Sub7) this).anInt9760 * 1328990913 - ((Class282_Sub20_Sub7) this).anInt9759 * 1921853063);
	}

	void method12318() {
		((Class282_Sub20_Sub7) this).anInt9761 = (((Class282_Sub20_Sub7) this).anInt9760 * 1328990913 - ((Class282_Sub20_Sub7) this).anInt9759 * 1921853063);
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub7) this).anInt9759 = class282_sub35.readUnsignedShort() * 1111086019;
			break;
		case 1:
			((Class282_Sub20_Sub7) this).anInt9760 = class282_sub35.readUnsignedShort() * -1690239979;
			break;
		case 2:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		}
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub7) this).anInt9759 = class282_sub35.readUnsignedShort() * 1111086019;
			break;
		case 1:
			((Class282_Sub20_Sub7) this).anInt9760 = class282_sub35.readUnsignedShort() * -1690239979;
			break;
		case 2:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		}
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub7) this).anInt9759 = class282_sub35.readUnsignedShort() * 1111086019;
			break;
		case 1:
			((Class282_Sub20_Sub7) this).anInt9760 = class282_sub35.readUnsignedShort() * -1690239979;
			break;
		case 2:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		}
	}

	int[] method12319(int i, int i_24_) {
		int[] is = aClass320_7667.method5721(i, 699794774);
		if (aClass320_7667.aBool3722) {
			int[] is_25_ = method12317(0, i, 1949629181);
			for (int i_26_ = 0; i_26_ < Class316.anInt3670 * -402153223; i_26_++)
				is[i_26_] = (655176939 * ((Class282_Sub20_Sub7) this).anInt9759 + ((is_25_[i_26_] * (1669837693 * ((Class282_Sub20_Sub7) this).anInt9761)) >> 12));
		}
		return is;
	}

	static final void method15240(byte i) {
		Message.method7275(Renderers.SOFTWARE_RENDERER, 1253949100);
		if (1366222859 * client.anInt7472 != 675588453 * Class4.anInt35)
			Class405.method6823(-734889653);
	}

	static void method15241(int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, byte i_33_) {
		int i_34_ = 0;
		int i_35_ = i_29_;
		int i_36_ = 0;
		int i_37_ = i_28_ - i_32_;
		int i_38_ = i_29_ - i_32_;
		int i_39_ = i_28_ * i_28_;
		int i_40_ = i_29_ * i_29_;
		int i_41_ = i_37_ * i_37_;
		int i_42_ = i_38_ * i_38_;
		int i_43_ = i_40_ << 1;
		int i_44_ = i_39_ << 1;
		int i_45_ = i_42_ << 1;
		int i_46_ = i_41_ << 1;
		int i_47_ = i_29_ << 1;
		int i_48_ = i_38_ << 1;
		int i_49_ = (1 - i_47_) * i_39_ + i_43_;
		int i_50_ = i_40_ - (i_47_ - 1) * i_44_;
		int i_51_ = i_45_ + (1 - i_48_) * i_41_;
		int i_52_ = i_42_ - (i_48_ - 1) * i_46_;
		int i_53_ = i_39_ << 2;
		int i_54_ = i_40_ << 2;
		int i_55_ = i_41_ << 2;
		int i_56_ = i_42_ << 2;
		int i_57_ = 3 * i_43_;
		int i_58_ = (i_47_ - 3) * i_44_;
		int i_59_ = i_45_ * 3;
		int i_60_ = (i_48_ - 3) * i_46_;
		int i_61_ = i_54_;
		int i_62_ = i_53_ * (i_29_ - 1);
		int i_63_ = i_56_;
		int i_64_ = i_55_ * (i_38_ - 1);
		int[] is = Class532_Sub3_Sub1.anIntArrayArray7072[i_27_];
		Class232.method3922(is, i - i_28_, i - i_37_, i_31_, (byte) -38);
		Class232.method3922(is, i - i_37_, i_37_ + i, i_30_, (byte) -68);
		Class232.method3922(is, i + i_37_, i_28_ + i, i_31_, (byte) -67);
		while (i_35_ > 0) {
			boolean bool = i_35_ <= i_38_;
			if (bool) {
				if (i_51_ < 0) {
					while (i_51_ < 0) {
						i_51_ += i_59_;
						i_52_ += i_63_;
						i_59_ += i_56_;
						i_63_ += i_56_;
						i_36_++;
					}
				}
				if (i_52_ < 0) {
					i_51_ += i_59_;
					i_52_ += i_63_;
					i_59_ += i_56_;
					i_63_ += i_56_;
					i_36_++;
				}
				i_51_ += -i_64_;
				i_52_ += -i_60_;
				i_60_ -= i_55_;
				i_64_ -= i_55_;
			}
			if (i_49_ < 0) {
				while (i_49_ < 0) {
					i_49_ += i_57_;
					i_50_ += i_61_;
					i_57_ += i_54_;
					i_61_ += i_54_;
					i_34_++;
				}
			}
			if (i_50_ < 0) {
				i_49_ += i_57_;
				i_50_ += i_61_;
				i_57_ += i_54_;
				i_61_ += i_54_;
				i_34_++;
			}
			i_49_ += -i_62_;
			i_50_ += -i_58_;
			i_58_ -= i_53_;
			i_62_ -= i_53_;
			i_35_--;
			int i_65_ = i_27_ - i_35_;
			int i_66_ = i_27_ + i_35_;
			int i_67_ = i_34_ + i;
			int i_68_ = i - i_34_;
			if (bool) {
				int i_69_ = i + i_36_;
				int i_70_ = i - i_36_;
				Class232.method3922((Class532_Sub3_Sub1.anIntArrayArray7072[i_65_]), i_68_, i_70_, i_31_, (byte) -12);
				Class232.method3922((Class532_Sub3_Sub1.anIntArrayArray7072[i_65_]), i_70_, i_69_, i_30_, (byte) 11);
				Class232.method3922((Class532_Sub3_Sub1.anIntArrayArray7072[i_65_]), i_69_, i_67_, i_31_, (byte) 16);
				Class232.method3922((Class532_Sub3_Sub1.anIntArrayArray7072[i_66_]), i_68_, i_70_, i_31_, (byte) 2);
				Class232.method3922((Class532_Sub3_Sub1.anIntArrayArray7072[i_66_]), i_70_, i_69_, i_30_, (byte) 84);
				Class232.method3922((Class532_Sub3_Sub1.anIntArrayArray7072[i_66_]), i_69_, i_67_, i_31_, (byte) -100);
			} else {
				Class232.method3922((Class532_Sub3_Sub1.anIntArrayArray7072[i_65_]), i_68_, i_67_, i_31_, (byte) -49);
				Class232.method3922((Class532_Sub3_Sub1.anIntArrayArray7072[i_66_]), i_68_, i_67_, i_31_, (byte) 59);
			}
		}
	}
}
