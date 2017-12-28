
/* Class282_Sub20_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class282_Sub20_Sub39 extends Class282_Sub20 {
	int anInt10004;
	static final int anInt10005 = 0;
	static final int anInt10006 = 4096;
	static final int anInt10007 = 2000;
	static final int anInt10008 = 16;
	int anInt10009 = 0;
	int anInt10010;
	int anInt10011;
	static final int anInt10012 = 0;
	int anInt10013 = 507333456;

	void method12318() {
		Class316.method5586((byte) 78);
	}

	void method12328() {
		Class316.method5586((byte) 32);
	}

	void method12321(int i) {
		Class316.method5586((byte) -8);
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_0_) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub39) this).anInt10004 = class282_sub35.readUnsignedShort() * -887239149;
			break;
		case 2:
			((Class282_Sub20_Sub39) this).anInt10010 = class282_sub35.readUnsignedByte() * -2120189013;
			break;
		case 0:
			((Class282_Sub20_Sub39) this).anInt10009 = class282_sub35.readUnsignedByte() * 145620759;
			break;
		case 1:
			((Class282_Sub20_Sub39) this).anInt10013 = class282_sub35.readUnsignedShort() * -452865383;
			break;
		case 4:
			((Class282_Sub20_Sub39) this).anInt10011 = class282_sub35.readUnsignedShort() * 1362460441;
			break;
		}
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -1046468088);
		if (aClass320_7667.aBool3722) {
			int i_1_ = ((Class282_Sub20_Sub39) this).anInt10011 * 1492741417 >> 1;
			int[][] is_2_ = aClass320_7667.method5722((byte) 1);
			Random random = new Random((long) (((Class282_Sub20_Sub39) this).anInt10009 * -1403705177));
			for (int i_3_ = 0; i_3_ < ((Class282_Sub20_Sub39) this).anInt10013 * -922721879; i_3_++) {
				int i_4_ = ((1492741417 * ((Class282_Sub20_Sub39) this).anInt10011 > 0) ? ((-2016400357 * ((Class282_Sub20_Sub39) this).anInt10004) + (Class476.method7931(random, (1492741417 * ((Class282_Sub20_Sub39) this).anInt10011), -44722220) - i_1_)) : (((Class282_Sub20_Sub39) this).anInt10004 * -2016400357));
				i_4_ = i_4_ >> 4 & 0xff;
				int i_5_ = Class476.method7931(random, -402153223 * Class316.anInt3670, 624909567);
				int i_6_ = Class476.method7931(random, -929726253 * Class316.anInt3671, 1633868210);
				int i_7_ = i_5_ + ((-1118394621 * ((Class282_Sub20_Sub39) this).anInt10010 * Class316.anIntArray3675[i_4_]) >> 12);
				int i_8_ = i_6_ + ((Class316.anIntArray3677[i_4_] * (((Class282_Sub20_Sub39) this).anInt10010 * -1118394621)) >> 12);
				int i_9_ = i_8_ - i_6_;
				int i_10_ = i_7_ - i_5_;
				if (i_10_ != 0 || 0 != i_9_) {
					if (i_9_ < 0)
						i_9_ = -i_9_;
					if (i_10_ < 0)
						i_10_ = -i_10_;
					boolean bool = i_9_ > i_10_;
					if (bool) {
						int i_11_ = i_5_;
						int i_12_ = i_7_;
						i_5_ = i_6_;
						i_6_ = i_11_;
						i_7_ = i_8_;
						i_8_ = i_12_;
					}
					if (i_5_ > i_7_) {
						int i_13_ = i_5_;
						int i_14_ = i_6_;
						i_5_ = i_7_;
						i_7_ = i_13_;
						i_6_ = i_8_;
						i_8_ = i_14_;
					}
					int i_15_ = i_6_;
					int i_16_ = i_7_ - i_5_;
					int i_17_ = i_8_ - i_6_;
					int i_18_ = -i_16_ / 2;
					int i_19_ = 2048 / i_16_;
					int i_20_ = 1024 - (Class476.method7931(random, 4096, -2023946460) >> 2);
					int i_21_ = i_6_ < i_8_ ? 1 : -1;
					if (i_17_ < 0)
						i_17_ = -i_17_;
					for (int i_22_ = i_5_; i_22_ < i_7_; i_22_++) {
						int i_23_ = (i_22_ - i_5_) * i_19_ + (1024 + i_20_);
						int i_24_ = i_22_ & Class316.anInt3669 * 1201532175;
						int i_25_ = i_15_ & Class316.anInt3673 * 543225399;
						if (bool)
							is_2_[i_25_][i_24_] = i_23_;
						else
							is_2_[i_24_][i_25_] = i_23_;
						i_18_ += i_17_;
						if (i_18_ > 0) {
							i_18_ -= i_16_;
							i_15_ += i_21_;
						}
					}
				}
			}
		}
		return is;
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, 730123665);
		if (aClass320_7667.aBool3722) {
			int i_26_ = ((Class282_Sub20_Sub39) this).anInt10011 * 1492741417 >> 1;
			int[][] is_27_ = aClass320_7667.method5722((byte) 1);
			Random random = new Random((long) (((Class282_Sub20_Sub39) this).anInt10009 * -1403705177));
			for (int i_28_ = 0; i_28_ < ((Class282_Sub20_Sub39) this).anInt10013 * -922721879; i_28_++) {
				int i_29_ = ((1492741417 * ((Class282_Sub20_Sub39) this).anInt10011 > 0) ? ((-2016400357 * ((Class282_Sub20_Sub39) this).anInt10004) + (Class476.method7931(random, (1492741417 * ((Class282_Sub20_Sub39) this).anInt10011), 350091656) - i_26_)) : (((Class282_Sub20_Sub39) this).anInt10004 * -2016400357));
				i_29_ = i_29_ >> 4 & 0xff;
				int i_30_ = Class476.method7931(random, -402153223 * Class316.anInt3670, 1395640605);
				int i_31_ = Class476.method7931(random, -929726253 * Class316.anInt3671, -191459207);
				int i_32_ = i_30_ + ((-1118394621 * ((Class282_Sub20_Sub39) this).anInt10010 * Class316.anIntArray3675[i_29_]) >> 12);
				int i_33_ = i_31_ + ((Class316.anIntArray3677[i_29_] * (((Class282_Sub20_Sub39) this).anInt10010 * -1118394621)) >> 12);
				int i_34_ = i_33_ - i_31_;
				int i_35_ = i_32_ - i_30_;
				if (i_35_ != 0 || 0 != i_34_) {
					if (i_34_ < 0)
						i_34_ = -i_34_;
					if (i_35_ < 0)
						i_35_ = -i_35_;
					boolean bool = i_34_ > i_35_;
					if (bool) {
						int i_36_ = i_30_;
						int i_37_ = i_32_;
						i_30_ = i_31_;
						i_31_ = i_36_;
						i_32_ = i_33_;
						i_33_ = i_37_;
					}
					if (i_30_ > i_32_) {
						int i_38_ = i_30_;
						int i_39_ = i_31_;
						i_30_ = i_32_;
						i_32_ = i_38_;
						i_31_ = i_33_;
						i_33_ = i_39_;
					}
					int i_40_ = i_31_;
					int i_41_ = i_32_ - i_30_;
					int i_42_ = i_33_ - i_31_;
					int i_43_ = -i_41_ / 2;
					int i_44_ = 2048 / i_41_;
					int i_45_ = 1024 - (Class476.method7931(random, 4096, -267465798) >> 2);
					int i_46_ = i_31_ < i_33_ ? 1 : -1;
					if (i_42_ < 0)
						i_42_ = -i_42_;
					for (int i_47_ = i_30_; i_47_ < i_32_; i_47_++) {
						int i_48_ = (i_47_ - i_30_) * i_44_ + (1024 + i_45_);
						int i_49_ = i_47_ & Class316.anInt3669 * 1201532175;
						int i_50_ = i_40_ & Class316.anInt3673 * 543225399;
						if (bool)
							is_27_[i_50_][i_49_] = i_48_;
						else
							is_27_[i_49_][i_50_] = i_48_;
						i_43_ += i_42_;
						if (i_43_ > 0) {
							i_43_ -= i_41_;
							i_40_ += i_46_;
						}
					}
				}
			}
		}
		return is;
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, 681200317);
		if (aClass320_7667.aBool3722) {
			int i_51_ = ((Class282_Sub20_Sub39) this).anInt10011 * 1492741417 >> 1;
			int[][] is_52_ = aClass320_7667.method5722((byte) 1);
			Random random = new Random((long) (((Class282_Sub20_Sub39) this).anInt10009 * -1403705177));
			for (int i_53_ = 0; i_53_ < ((Class282_Sub20_Sub39) this).anInt10013 * -922721879; i_53_++) {
				int i_54_ = ((1492741417 * ((Class282_Sub20_Sub39) this).anInt10011 > 0) ? ((-2016400357 * ((Class282_Sub20_Sub39) this).anInt10004) + (Class476.method7931(random, (1492741417 * ((Class282_Sub20_Sub39) this).anInt10011), 1191861567) - i_51_)) : (((Class282_Sub20_Sub39) this).anInt10004 * -2016400357));
				i_54_ = i_54_ >> 4 & 0xff;
				int i_55_ = Class476.method7931(random, -402153223 * Class316.anInt3670, -1734959739);
				int i_56_ = Class476.method7931(random, -929726253 * Class316.anInt3671, -1937283904);
				int i_57_ = i_55_ + ((-1118394621 * ((Class282_Sub20_Sub39) this).anInt10010 * Class316.anIntArray3675[i_54_]) >> 12);
				int i_58_ = i_56_ + ((Class316.anIntArray3677[i_54_] * (((Class282_Sub20_Sub39) this).anInt10010 * -1118394621)) >> 12);
				int i_59_ = i_58_ - i_56_;
				int i_60_ = i_57_ - i_55_;
				if (i_60_ != 0 || 0 != i_59_) {
					if (i_59_ < 0)
						i_59_ = -i_59_;
					if (i_60_ < 0)
						i_60_ = -i_60_;
					boolean bool = i_59_ > i_60_;
					if (bool) {
						int i_61_ = i_55_;
						int i_62_ = i_57_;
						i_55_ = i_56_;
						i_56_ = i_61_;
						i_57_ = i_58_;
						i_58_ = i_62_;
					}
					if (i_55_ > i_57_) {
						int i_63_ = i_55_;
						int i_64_ = i_56_;
						i_55_ = i_57_;
						i_57_ = i_63_;
						i_56_ = i_58_;
						i_58_ = i_64_;
					}
					int i_65_ = i_56_;
					int i_66_ = i_57_ - i_55_;
					int i_67_ = i_58_ - i_56_;
					int i_68_ = -i_66_ / 2;
					int i_69_ = 2048 / i_66_;
					int i_70_ = 1024 - (Class476.method7931(random, 4096, -2081542688) >> 2);
					int i_71_ = i_56_ < i_58_ ? 1 : -1;
					if (i_67_ < 0)
						i_67_ = -i_67_;
					for (int i_72_ = i_55_; i_72_ < i_57_; i_72_++) {
						int i_73_ = (i_72_ - i_55_) * i_69_ + (1024 + i_70_);
						int i_74_ = i_72_ & Class316.anInt3669 * 1201532175;
						int i_75_ = i_65_ & Class316.anInt3673 * 543225399;
						if (bool)
							is_52_[i_75_][i_74_] = i_73_;
						else
							is_52_[i_74_][i_75_] = i_73_;
						i_68_ += i_67_;
						if (i_68_ > 0) {
							i_68_ -= i_66_;
							i_65_ += i_71_;
						}
					}
				}
			}
		}
		return is;
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub39) this).anInt10004 = class282_sub35.readUnsignedShort() * -887239149;
			break;
		case 2:
			((Class282_Sub20_Sub39) this).anInt10010 = class282_sub35.readUnsignedByte() * -2120189013;
			break;
		case 0:
			((Class282_Sub20_Sub39) this).anInt10009 = class282_sub35.readUnsignedByte() * 145620759;
			break;
		case 1:
			((Class282_Sub20_Sub39) this).anInt10013 = class282_sub35.readUnsignedShort() * -452865383;
			break;
		case 4:
			((Class282_Sub20_Sub39) this).anInt10011 = class282_sub35.readUnsignedShort() * 1362460441;
			break;
		}
	}

	void method12329() {
		Class316.method5586((byte) -64);
	}

	void method12350() {
		Class316.method5586((byte) -17);
	}

	int[] method12319(int i, int i_76_) {
		int[] is = aClass320_7667.method5721(i, 347419032);
		if (aClass320_7667.aBool3722) {
			int i_77_ = ((Class282_Sub20_Sub39) this).anInt10011 * 1492741417 >> 1;
			int[][] is_78_ = aClass320_7667.method5722((byte) 1);
			Random random = new Random((long) (((Class282_Sub20_Sub39) this).anInt10009 * -1403705177));
			for (int i_79_ = 0; i_79_ < ((Class282_Sub20_Sub39) this).anInt10013 * -922721879; i_79_++) {
				int i_80_ = ((1492741417 * ((Class282_Sub20_Sub39) this).anInt10011 > 0) ? ((-2016400357 * ((Class282_Sub20_Sub39) this).anInt10004) + (Class476.method7931(random, (1492741417 * ((Class282_Sub20_Sub39) this).anInt10011), 892408081) - i_77_)) : (((Class282_Sub20_Sub39) this).anInt10004 * -2016400357));
				i_80_ = i_80_ >> 4 & 0xff;
				int i_81_ = Class476.method7931(random, -402153223 * Class316.anInt3670, -272716187);
				int i_82_ = Class476.method7931(random, -929726253 * Class316.anInt3671, -1563129644);
				int i_83_ = i_81_ + ((-1118394621 * ((Class282_Sub20_Sub39) this).anInt10010 * Class316.anIntArray3675[i_80_]) >> 12);
				int i_84_ = i_82_ + ((Class316.anIntArray3677[i_80_] * (((Class282_Sub20_Sub39) this).anInt10010 * -1118394621)) >> 12);
				int i_85_ = i_84_ - i_82_;
				int i_86_ = i_83_ - i_81_;
				if (i_86_ != 0 || 0 != i_85_) {
					if (i_85_ < 0)
						i_85_ = -i_85_;
					if (i_86_ < 0)
						i_86_ = -i_86_;
					boolean bool = i_85_ > i_86_;
					if (bool) {
						int i_87_ = i_81_;
						int i_88_ = i_83_;
						i_81_ = i_82_;
						i_82_ = i_87_;
						i_83_ = i_84_;
						i_84_ = i_88_;
					}
					if (i_81_ > i_83_) {
						int i_89_ = i_81_;
						int i_90_ = i_82_;
						i_81_ = i_83_;
						i_83_ = i_89_;
						i_82_ = i_84_;
						i_84_ = i_90_;
					}
					int i_91_ = i_82_;
					int i_92_ = i_83_ - i_81_;
					int i_93_ = i_84_ - i_82_;
					int i_94_ = -i_92_ / 2;
					int i_95_ = 2048 / i_92_;
					int i_96_ = 1024 - (Class476.method7931(random, 4096, -1883071085) >> 2);
					int i_97_ = i_82_ < i_84_ ? 1 : -1;
					if (i_93_ < 0)
						i_93_ = -i_93_;
					for (int i_98_ = i_81_; i_98_ < i_83_; i_98_++) {
						int i_99_ = (i_98_ - i_81_) * i_95_ + (1024 + i_96_);
						int i_100_ = i_98_ & Class316.anInt3669 * 1201532175;
						int i_101_ = i_91_ & Class316.anInt3673 * 543225399;
						if (bool)
							is_78_[i_101_][i_100_] = i_99_;
						else
							is_78_[i_100_][i_101_] = i_99_;
						i_94_ += i_93_;
						if (i_94_ > 0) {
							i_94_ -= i_92_;
							i_91_ += i_97_;
						}
					}
				}
			}
		}
		return is;
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub39) this).anInt10004 = class282_sub35.readUnsignedShort() * -887239149;
			break;
		case 2:
			((Class282_Sub20_Sub39) this).anInt10010 = class282_sub35.readUnsignedByte() * -2120189013;
			break;
		case 0:
			((Class282_Sub20_Sub39) this).anInt10009 = class282_sub35.readUnsignedByte() * 145620759;
			break;
		case 1:
			((Class282_Sub20_Sub39) this).anInt10013 = class282_sub35.readUnsignedShort() * -452865383;
			break;
		case 4:
			((Class282_Sub20_Sub39) this).anInt10011 = class282_sub35.readUnsignedShort() * 1362460441;
			break;
		}
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 3:
			((Class282_Sub20_Sub39) this).anInt10004 = class282_sub35.readUnsignedShort() * -887239149;
			break;
		case 2:
			((Class282_Sub20_Sub39) this).anInt10010 = class282_sub35.readUnsignedByte() * -2120189013;
			break;
		case 0:
			((Class282_Sub20_Sub39) this).anInt10009 = class282_sub35.readUnsignedByte() * 145620759;
			break;
		case 1:
			((Class282_Sub20_Sub39) this).anInt10013 = class282_sub35.readUnsignedShort() * -452865383;
			break;
		case 4:
			((Class282_Sub20_Sub39) this).anInt10011 = class282_sub35.readUnsignedShort() * 1362460441;
			break;
		}
	}

	public Class282_Sub20_Sub39() {
		super(0, true);
		((Class282_Sub20_Sub39) this).anInt10010 = 436714160;
		((Class282_Sub20_Sub39) this).anInt10011 = 1475448832;
		((Class282_Sub20_Sub39) this).anInt10004 = 0;
	}

	public static int method15436(int i, int i_102_, int i_103_, int i_104_) {
		i_103_ &= 0x3;
		if (0 == i_103_)
			return i;
		if (1 == i_103_)
			return i_102_;
		if (i_103_ == 2)
			return 4095 - i;
		return 4095 - i_102_;
	}
}
