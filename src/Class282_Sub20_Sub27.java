
/* Class282_Sub20_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;

public class Class282_Sub20_Sub27 extends Class282_Sub20 {
	static final int anInt9888 = 9;
	static final int anInt9889 = 3;
	static final int anInt9890 = 1;
	static final int anInt9891 = 4;
	static final int anInt9892 = 5;
	static final int anInt9893 = 6;
	static final int anInt9894 = 7;
	int anInt9895 = 310038310;
	static final int anInt9896 = 8;
	static final int anInt9897 = 10;
	static final int anInt9898 = 11;
	static final int anInt9899 = 2;
	static final int anInt9900 = 6;
	static final boolean aBool9901 = false;
	static final int anInt9902 = 12;

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub27) this).anInt9895 = class282_sub35.readUnsignedByte() * -664154831;
			break;
		case 1:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		}
	}

	int[] method12319(int i, int i_0_) {
		int[] is = aClass320_7667.method5721(i, -1371799795);
		if (aClass320_7667.aBool3722) {
			int[] is_1_ = method12317(0, i, 1969632876);
			int[] is_2_ = method12317(1, i, 2021330645);
			switch (1067215825 * ((Class282_Sub20_Sub27) this).anInt9895) {
			case 9:
				for (int i_3_ = 0; i_3_ < Class316.anInt3670 * -402153223; i_3_++) {
					int i_4_ = is_1_[i_3_];
					int i_5_ = is_2_[i_3_];
					is[i_3_] = i_4_ < i_5_ ? i_4_ : i_5_;
				}
				break;
			case 8:
				for (int i_6_ = 0; i_6_ < Class316.anInt3670 * -402153223; i_6_++) {
					int i_7_ = is_1_[i_6_];
					is[i_6_] = (0 == i_7_ ? 0 : 4096 - (4096 - is_2_[i_6_] << 12) / i_7_);
				}
				break;
			case 2:
				for (int i_8_ = 0; i_8_ < Class316.anInt3670 * -402153223; i_8_++)
					is[i_8_] = is_1_[i_8_] - is_2_[i_8_];
				break;
			case 7:
				for (int i_9_ = 0; i_9_ < Class316.anInt3670 * -402153223; i_9_++) {
					int i_10_ = is_1_[i_9_];
					is[i_9_] = (i_10_ == 4096 ? 4096 : (is_2_[i_9_] << 12) / (4096 - i_10_));
				}
				break;
			case 6:
				for (int i_11_ = 0; i_11_ < Class316.anInt3670 * -402153223; i_11_++) {
					int i_12_ = is_2_[i_11_];
					is[i_11_] = (i_12_ < 2048 ? is_1_[i_11_] * i_12_ >> 11 : 4096 - ((4096 - is_1_[i_11_]) * (4096 - i_12_) >> 11));
				}
				break;
			case 10:
				for (int i_13_ = 0; i_13_ < -402153223 * Class316.anInt3670; i_13_++) {
					int i_14_ = is_1_[i_13_];
					int i_15_ = is_2_[i_13_];
					is[i_13_] = i_14_ > i_15_ ? i_14_ : i_15_;
				}
				break;
			case 4:
				for (int i_16_ = 0; i_16_ < -402153223 * Class316.anInt3670; i_16_++) {
					int i_17_ = is_2_[i_16_];
					is[i_16_] = 0 != i_17_ ? (is_1_[i_16_] << 12) / i_17_ : 4096;
				}
				break;
			case 12:
				for (int i_18_ = 0; i_18_ < Class316.anInt3670 * -402153223; i_18_++) {
					int i_19_ = is_1_[i_18_];
					int i_20_ = is_2_[i_18_];
					is[i_18_] = i_20_ + i_19_ - (i_19_ * i_20_ >> 11);
				}
				break;
			case 11:
				for (int i_21_ = 0; i_21_ < Class316.anInt3670 * -402153223; i_21_++) {
					int i_22_ = is_1_[i_21_];
					int i_23_ = is_2_[i_21_];
					is[i_21_] = i_22_ > i_23_ ? i_22_ - i_23_ : i_23_ - i_22_;
				}
				break;
			case 1:
				for (int i_24_ = 0; i_24_ < -402153223 * Class316.anInt3670; i_24_++)
					is[i_24_] = is_2_[i_24_] + is_1_[i_24_];
				break;
			case 5:
				for (int i_25_ = 0; i_25_ < -402153223 * Class316.anInt3670; i_25_++)
					is[i_25_] = 4096 - ((4096 - is_1_[i_25_]) * (4096 - is_2_[i_25_]) >> 12);
				break;
			case 3:
				for (int i_26_ = 0; i_26_ < -402153223 * Class316.anInt3670; i_26_++)
					is[i_26_] = is_1_[i_26_] * is_2_[i_26_] >> 12;
				break;
			}
		}
		return is;
	}

	int[][] method12320(int i, int i_27_) {
		int[][] is = aClass308_7670.method5463(i, 1113233210);
		if (aClass308_7670.aBool3619) {
			int[][] is_28_ = method12333(0, i, (byte) 3);
			int[][] is_29_ = method12333(1, i, (byte) 3);
			int[] is_30_ = is[0];
			int[] is_31_ = is[1];
			int[] is_32_ = is[2];
			int[] is_33_ = is_28_[0];
			int[] is_34_ = is_28_[1];
			int[] is_35_ = is_28_[2];
			int[] is_36_ = is_29_[0];
			int[] is_37_ = is_29_[1];
			int[] is_38_ = is_29_[2];
			switch (1067215825 * ((Class282_Sub20_Sub27) this).anInt9895) {
			case 11:
				for (int i_39_ = 0; i_39_ < Class316.anInt3670 * -402153223; i_39_++) {
					int i_40_ = is_33_[i_39_];
					int i_41_ = is_34_[i_39_];
					int i_42_ = is_35_[i_39_];
					int i_43_ = is_36_[i_39_];
					int i_44_ = is_37_[i_39_];
					int i_45_ = is_38_[i_39_];
					is_30_[i_39_] = i_40_ > i_43_ ? i_40_ - i_43_ : i_43_ - i_40_;
					is_31_[i_39_] = i_41_ > i_44_ ? i_41_ - i_44_ : i_44_ - i_41_;
					is_32_[i_39_] = i_42_ > i_45_ ? i_42_ - i_45_ : i_45_ - i_42_;
				}
				break;
			case 5:
				for (int i_46_ = 0; i_46_ < Class316.anInt3670 * -402153223; i_46_++) {
					is_30_[i_46_] = 4096 - ((4096 - is_36_[i_46_]) * (4096 - is_33_[i_46_]) >> 12);
					is_31_[i_46_] = 4096 - ((4096 - is_34_[i_46_]) * (4096 - is_37_[i_46_]) >> 12);
					is_32_[i_46_] = 4096 - ((4096 - is_35_[i_46_]) * (4096 - is_38_[i_46_]) >> 12);
				}
				break;
			case 8:
				for (int i_47_ = 0; i_47_ < -402153223 * Class316.anInt3670; i_47_++) {
					int i_48_ = is_33_[i_47_];
					int i_49_ = is_34_[i_47_];
					int i_50_ = is_35_[i_47_];
					is_30_[i_47_] = (0 == i_48_ ? 0 : 4096 - (4096 - is_36_[i_47_] << 12) / i_48_);
					is_31_[i_47_] = (i_49_ == 0 ? 0 : 4096 - (4096 - is_37_[i_47_] << 12) / i_49_);
					is_32_[i_47_] = (0 == i_50_ ? 0 : 4096 - (4096 - is_38_[i_47_] << 12) / i_50_);
				}
				break;
			case 4:
				for (int i_51_ = 0; i_51_ < -402153223 * Class316.anInt3670; i_51_++) {
					int i_52_ = is_36_[i_51_];
					int i_53_ = is_37_[i_51_];
					int i_54_ = is_38_[i_51_];
					is_30_[i_51_] = i_52_ != 0 ? (is_33_[i_51_] << 12) / i_52_ : 4096;
					is_31_[i_51_] = 0 != i_53_ ? (is_34_[i_51_] << 12) / i_53_ : 4096;
					is_32_[i_51_] = i_54_ != 0 ? (is_35_[i_51_] << 12) / i_54_ : 4096;
				}
				break;
			case 3:
				for (int i_55_ = 0; i_55_ < -402153223 * Class316.anInt3670; i_55_++) {
					is_30_[i_55_] = is_36_[i_55_] * is_33_[i_55_] >> 12;
					is_31_[i_55_] = is_34_[i_55_] * is_37_[i_55_] >> 12;
					is_32_[i_55_] = is_35_[i_55_] * is_38_[i_55_] >> 12;
				}
				break;
			case 1:
				for (int i_56_ = 0; i_56_ < -402153223 * Class316.anInt3670; i_56_++) {
					is_30_[i_56_] = is_33_[i_56_] + is_36_[i_56_];
					is_31_[i_56_] = is_34_[i_56_] + is_37_[i_56_];
					is_32_[i_56_] = is_38_[i_56_] + is_35_[i_56_];
				}
				break;
			case 6:
				for (int i_57_ = 0; i_57_ < -402153223 * Class316.anInt3670; i_57_++) {
					int i_58_ = is_36_[i_57_];
					int i_59_ = is_37_[i_57_];
					int i_60_ = is_38_[i_57_];
					is_30_[i_57_] = (i_58_ < 2048 ? i_58_ * is_33_[i_57_] >> 11 : 4096 - ((4096 - is_33_[i_57_]) * (4096 - i_58_) >> 11));
					is_31_[i_57_] = (i_59_ < 2048 ? is_34_[i_57_] * i_59_ >> 11 : 4096 - ((4096 - is_34_[i_57_]) * (4096 - i_59_) >> 11));
					is_32_[i_57_] = (i_60_ < 2048 ? i_60_ * is_35_[i_57_] >> 11 : 4096 - ((4096 - i_60_) * (4096 - is_35_[i_57_]) >> 11));
				}
				break;
			case 7:
				for (int i_61_ = 0; i_61_ < Class316.anInt3670 * -402153223; i_61_++) {
					int i_62_ = is_33_[i_61_];
					int i_63_ = is_34_[i_61_];
					int i_64_ = is_35_[i_61_];
					is_30_[i_61_] = (i_62_ == 4096 ? 4096 : (is_36_[i_61_] << 12) / (4096 - i_62_));
					is_31_[i_61_] = (4096 == i_63_ ? 4096 : (is_37_[i_61_] << 12) / (4096 - i_63_));
					is_32_[i_61_] = (4096 == i_64_ ? 4096 : (is_38_[i_61_] << 12) / (4096 - i_64_));
				}
				break;
			case 10:
				for (int i_65_ = 0; i_65_ < Class316.anInt3670 * -402153223; i_65_++) {
					int i_66_ = is_33_[i_65_];
					int i_67_ = is_34_[i_65_];
					int i_68_ = is_35_[i_65_];
					int i_69_ = is_36_[i_65_];
					int i_70_ = is_37_[i_65_];
					int i_71_ = is_38_[i_65_];
					is_30_[i_65_] = i_66_ > i_69_ ? i_66_ : i_69_;
					is_31_[i_65_] = i_67_ > i_70_ ? i_67_ : i_70_;
					is_32_[i_65_] = i_68_ > i_71_ ? i_68_ : i_71_;
				}
				break;
			case 9:
				for (int i_72_ = 0; i_72_ < -402153223 * Class316.anInt3670; i_72_++) {
					int i_73_ = is_33_[i_72_];
					int i_74_ = is_34_[i_72_];
					int i_75_ = is_35_[i_72_];
					int i_76_ = is_36_[i_72_];
					int i_77_ = is_37_[i_72_];
					int i_78_ = is_38_[i_72_];
					is_30_[i_72_] = i_73_ < i_76_ ? i_73_ : i_76_;
					is_31_[i_72_] = i_74_ < i_77_ ? i_74_ : i_77_;
					is_32_[i_72_] = i_75_ < i_78_ ? i_75_ : i_78_;
				}
				break;
			case 12:
				for (int i_79_ = 0; i_79_ < Class316.anInt3670 * -402153223; i_79_++) {
					int i_80_ = is_33_[i_79_];
					int i_81_ = is_34_[i_79_];
					int i_82_ = is_35_[i_79_];
					int i_83_ = is_36_[i_79_];
					int i_84_ = is_37_[i_79_];
					int i_85_ = is_38_[i_79_];
					is_30_[i_79_] = i_80_ + i_83_ - (i_83_ * i_80_ >> 11);
					is_31_[i_79_] = i_84_ + i_81_ - (i_84_ * i_81_ >> 11);
					is_32_[i_79_] = i_85_ + i_82_ - (i_85_ * i_82_ >> 11);
				}
				break;
			case 2:
				for (int i_86_ = 0; i_86_ < Class316.anInt3670 * -402153223; i_86_++) {
					is_30_[i_86_] = is_33_[i_86_] - is_36_[i_86_];
					is_31_[i_86_] = is_34_[i_86_] - is_37_[i_86_];
					is_32_[i_86_] = is_35_[i_86_] - is_38_[i_86_];
				}
				break;
			}
		}
		return is;
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub27) this).anInt9895 = class282_sub35.readUnsignedByte() * -664154831;
			break;
		case 1:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		}
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_87_) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub27) this).anInt9895 = class282_sub35.readUnsignedByte() * -664154831;
			break;
		case 1:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		}
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -2068476444);
		if (aClass320_7667.aBool3722) {
			int[] is_88_ = method12317(0, i, 1945109906);
			int[] is_89_ = method12317(1, i, 2107489304);
			switch (1067215825 * ((Class282_Sub20_Sub27) this).anInt9895) {
			case 9:
				for (int i_90_ = 0; i_90_ < Class316.anInt3670 * -402153223; i_90_++) {
					int i_91_ = is_88_[i_90_];
					int i_92_ = is_89_[i_90_];
					is[i_90_] = i_91_ < i_92_ ? i_91_ : i_92_;
				}
				break;
			case 8:
				for (int i_93_ = 0; i_93_ < Class316.anInt3670 * -402153223; i_93_++) {
					int i_94_ = is_88_[i_93_];
					is[i_93_] = 0 == i_94_ ? 0 : 4096 - (4096 - is_89_[i_93_] << 12) / i_94_;
				}
				break;
			case 2:
				for (int i_95_ = 0; i_95_ < Class316.anInt3670 * -402153223; i_95_++)
					is[i_95_] = is_88_[i_95_] - is_89_[i_95_];
				break;
			case 7:
				for (int i_96_ = 0; i_96_ < Class316.anInt3670 * -402153223; i_96_++) {
					int i_97_ = is_88_[i_96_];
					is[i_96_] = (i_97_ == 4096 ? 4096 : (is_89_[i_96_] << 12) / (4096 - i_97_));
				}
				break;
			case 6:
				for (int i_98_ = 0; i_98_ < Class316.anInt3670 * -402153223; i_98_++) {
					int i_99_ = is_89_[i_98_];
					is[i_98_] = (i_99_ < 2048 ? is_88_[i_98_] * i_99_ >> 11 : 4096 - ((4096 - is_88_[i_98_]) * (4096 - i_99_) >> 11));
				}
				break;
			case 10:
				for (int i_100_ = 0; i_100_ < -402153223 * Class316.anInt3670; i_100_++) {
					int i_101_ = is_88_[i_100_];
					int i_102_ = is_89_[i_100_];
					is[i_100_] = i_101_ > i_102_ ? i_101_ : i_102_;
				}
				break;
			case 4:
				for (int i_103_ = 0; i_103_ < -402153223 * Class316.anInt3670; i_103_++) {
					int i_104_ = is_89_[i_103_];
					is[i_103_] = 0 != i_104_ ? (is_88_[i_103_] << 12) / i_104_ : 4096;
				}
				break;
			case 12:
				for (int i_105_ = 0; i_105_ < Class316.anInt3670 * -402153223; i_105_++) {
					int i_106_ = is_88_[i_105_];
					int i_107_ = is_89_[i_105_];
					is[i_105_] = i_107_ + i_106_ - (i_106_ * i_107_ >> 11);
				}
				break;
			case 11:
				for (int i_108_ = 0; i_108_ < Class316.anInt3670 * -402153223; i_108_++) {
					int i_109_ = is_88_[i_108_];
					int i_110_ = is_89_[i_108_];
					is[i_108_] = i_109_ > i_110_ ? i_109_ - i_110_ : i_110_ - i_109_;
				}
				break;
			case 1:
				for (int i_111_ = 0; i_111_ < -402153223 * Class316.anInt3670; i_111_++)
					is[i_111_] = is_89_[i_111_] + is_88_[i_111_];
				break;
			case 5:
				for (int i_112_ = 0; i_112_ < -402153223 * Class316.anInt3670; i_112_++)
					is[i_112_] = 4096 - ((4096 - is_88_[i_112_]) * (4096 - is_89_[i_112_]) >> 12);
				break;
			case 3:
				for (int i_113_ = 0; i_113_ < -402153223 * Class316.anInt3670; i_113_++)
					is[i_113_] = is_88_[i_113_] * is_89_[i_113_] >> 12;
				break;
			}
		}
		return is;
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, 835217102);
		if (aClass320_7667.aBool3722) {
			int[] is_114_ = method12317(0, i, 2027148719);
			int[] is_115_ = method12317(1, i, 2013001992);
			switch (1067215825 * ((Class282_Sub20_Sub27) this).anInt9895) {
			case 9:
				for (int i_116_ = 0; i_116_ < Class316.anInt3670 * -402153223; i_116_++) {
					int i_117_ = is_114_[i_116_];
					int i_118_ = is_115_[i_116_];
					is[i_116_] = i_117_ < i_118_ ? i_117_ : i_118_;
				}
				break;
			case 8:
				for (int i_119_ = 0; i_119_ < Class316.anInt3670 * -402153223; i_119_++) {
					int i_120_ = is_114_[i_119_];
					is[i_119_] = (0 == i_120_ ? 0 : 4096 - (4096 - is_115_[i_119_] << 12) / i_120_);
				}
				break;
			case 2:
				for (int i_121_ = 0; i_121_ < Class316.anInt3670 * -402153223; i_121_++)
					is[i_121_] = is_114_[i_121_] - is_115_[i_121_];
				break;
			case 7:
				for (int i_122_ = 0; i_122_ < Class316.anInt3670 * -402153223; i_122_++) {
					int i_123_ = is_114_[i_122_];
					is[i_122_] = (i_123_ == 4096 ? 4096 : (is_115_[i_122_] << 12) / (4096 - i_123_));
				}
				break;
			case 6:
				for (int i_124_ = 0; i_124_ < Class316.anInt3670 * -402153223; i_124_++) {
					int i_125_ = is_115_[i_124_];
					is[i_124_] = (i_125_ < 2048 ? is_114_[i_124_] * i_125_ >> 11 : 4096 - ((4096 - is_114_[i_124_]) * (4096 - i_125_) >> 11));
				}
				break;
			case 10:
				for (int i_126_ = 0; i_126_ < -402153223 * Class316.anInt3670; i_126_++) {
					int i_127_ = is_114_[i_126_];
					int i_128_ = is_115_[i_126_];
					is[i_126_] = i_127_ > i_128_ ? i_127_ : i_128_;
				}
				break;
			case 4:
				for (int i_129_ = 0; i_129_ < -402153223 * Class316.anInt3670; i_129_++) {
					int i_130_ = is_115_[i_129_];
					is[i_129_] = (0 != i_130_ ? (is_114_[i_129_] << 12) / i_130_ : 4096);
				}
				break;
			case 12:
				for (int i_131_ = 0; i_131_ < Class316.anInt3670 * -402153223; i_131_++) {
					int i_132_ = is_114_[i_131_];
					int i_133_ = is_115_[i_131_];
					is[i_131_] = i_133_ + i_132_ - (i_132_ * i_133_ >> 11);
				}
				break;
			case 11:
				for (int i_134_ = 0; i_134_ < Class316.anInt3670 * -402153223; i_134_++) {
					int i_135_ = is_114_[i_134_];
					int i_136_ = is_115_[i_134_];
					is[i_134_] = i_135_ > i_136_ ? i_135_ - i_136_ : i_136_ - i_135_;
				}
				break;
			case 1:
				for (int i_137_ = 0; i_137_ < -402153223 * Class316.anInt3670; i_137_++)
					is[i_137_] = is_115_[i_137_] + is_114_[i_137_];
				break;
			case 5:
				for (int i_138_ = 0; i_138_ < -402153223 * Class316.anInt3670; i_138_++)
					is[i_138_] = 4096 - (((4096 - is_114_[i_138_]) * (4096 - is_115_[i_138_])) >> 12);
				break;
			case 3:
				for (int i_139_ = 0; i_139_ < -402153223 * Class316.anInt3670; i_139_++)
					is[i_139_] = is_114_[i_139_] * is_115_[i_139_] >> 12;
				break;
			}
		}
		return is;
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub27) this).anInt9895 = class282_sub35.readUnsignedByte() * -664154831;
			break;
		case 1:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		}
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -285169737);
		if (aClass320_7667.aBool3722) {
			int[] is_140_ = method12317(0, i, 2093160600);
			int[] is_141_ = method12317(1, i, 2014565368);
			switch (1067215825 * ((Class282_Sub20_Sub27) this).anInt9895) {
			case 9:
				for (int i_142_ = 0; i_142_ < Class316.anInt3670 * -402153223; i_142_++) {
					int i_143_ = is_140_[i_142_];
					int i_144_ = is_141_[i_142_];
					is[i_142_] = i_143_ < i_144_ ? i_143_ : i_144_;
				}
				break;
			case 8:
				for (int i_145_ = 0; i_145_ < Class316.anInt3670 * -402153223; i_145_++) {
					int i_146_ = is_140_[i_145_];
					is[i_145_] = (0 == i_146_ ? 0 : 4096 - (4096 - is_141_[i_145_] << 12) / i_146_);
				}
				break;
			case 2:
				for (int i_147_ = 0; i_147_ < Class316.anInt3670 * -402153223; i_147_++)
					is[i_147_] = is_140_[i_147_] - is_141_[i_147_];
				break;
			case 7:
				for (int i_148_ = 0; i_148_ < Class316.anInt3670 * -402153223; i_148_++) {
					int i_149_ = is_140_[i_148_];
					is[i_148_] = (i_149_ == 4096 ? 4096 : (is_141_[i_148_] << 12) / (4096 - i_149_));
				}
				break;
			case 6:
				for (int i_150_ = 0; i_150_ < Class316.anInt3670 * -402153223; i_150_++) {
					int i_151_ = is_141_[i_150_];
					is[i_150_] = (i_151_ < 2048 ? is_140_[i_150_] * i_151_ >> 11 : 4096 - ((4096 - is_140_[i_150_]) * (4096 - i_151_) >> 11));
				}
				break;
			case 10:
				for (int i_152_ = 0; i_152_ < -402153223 * Class316.anInt3670; i_152_++) {
					int i_153_ = is_140_[i_152_];
					int i_154_ = is_141_[i_152_];
					is[i_152_] = i_153_ > i_154_ ? i_153_ : i_154_;
				}
				break;
			case 4:
				for (int i_155_ = 0; i_155_ < -402153223 * Class316.anInt3670; i_155_++) {
					int i_156_ = is_141_[i_155_];
					is[i_155_] = (0 != i_156_ ? (is_140_[i_155_] << 12) / i_156_ : 4096);
				}
				break;
			case 12:
				for (int i_157_ = 0; i_157_ < Class316.anInt3670 * -402153223; i_157_++) {
					int i_158_ = is_140_[i_157_];
					int i_159_ = is_141_[i_157_];
					is[i_157_] = i_159_ + i_158_ - (i_158_ * i_159_ >> 11);
				}
				break;
			case 11:
				for (int i_160_ = 0; i_160_ < Class316.anInt3670 * -402153223; i_160_++) {
					int i_161_ = is_140_[i_160_];
					int i_162_ = is_141_[i_160_];
					is[i_160_] = i_161_ > i_162_ ? i_161_ - i_162_ : i_162_ - i_161_;
				}
				break;
			case 1:
				for (int i_163_ = 0; i_163_ < -402153223 * Class316.anInt3670; i_163_++)
					is[i_163_] = is_141_[i_163_] + is_140_[i_163_];
				break;
			case 5:
				for (int i_164_ = 0; i_164_ < -402153223 * Class316.anInt3670; i_164_++)
					is[i_164_] = 4096 - (((4096 - is_140_[i_164_]) * (4096 - is_141_[i_164_])) >> 12);
				break;
			case 3:
				for (int i_165_ = 0; i_165_ < -402153223 * Class316.anInt3670; i_165_++)
					is[i_165_] = is_140_[i_165_] * is_141_[i_165_] >> 12;
				break;
			}
		}
		return is;
	}

	public Class282_Sub20_Sub27() {
		super(2, false);
	}

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 910510779);
		if (aClass308_7670.aBool3619) {
			int[][] is_166_ = method12333(0, i, (byte) 3);
			int[][] is_167_ = method12333(1, i, (byte) 3);
			int[] is_168_ = is[0];
			int[] is_169_ = is[1];
			int[] is_170_ = is[2];
			int[] is_171_ = is_166_[0];
			int[] is_172_ = is_166_[1];
			int[] is_173_ = is_166_[2];
			int[] is_174_ = is_167_[0];
			int[] is_175_ = is_167_[1];
			int[] is_176_ = is_167_[2];
			switch (1067215825 * ((Class282_Sub20_Sub27) this).anInt9895) {
			case 11:
				for (int i_177_ = 0; i_177_ < Class316.anInt3670 * -402153223; i_177_++) {
					int i_178_ = is_171_[i_177_];
					int i_179_ = is_172_[i_177_];
					int i_180_ = is_173_[i_177_];
					int i_181_ = is_174_[i_177_];
					int i_182_ = is_175_[i_177_];
					int i_183_ = is_176_[i_177_];
					is_168_[i_177_] = i_178_ > i_181_ ? i_178_ - i_181_ : i_181_ - i_178_;
					is_169_[i_177_] = i_179_ > i_182_ ? i_179_ - i_182_ : i_182_ - i_179_;
					is_170_[i_177_] = i_180_ > i_183_ ? i_180_ - i_183_ : i_183_ - i_180_;
				}
				break;
			case 5:
				for (int i_184_ = 0; i_184_ < Class316.anInt3670 * -402153223; i_184_++) {
					is_168_[i_184_] = 4096 - (((4096 - is_174_[i_184_]) * (4096 - is_171_[i_184_])) >> 12);
					is_169_[i_184_] = 4096 - (((4096 - is_172_[i_184_]) * (4096 - is_175_[i_184_])) >> 12);
					is_170_[i_184_] = 4096 - (((4096 - is_173_[i_184_]) * (4096 - is_176_[i_184_])) >> 12);
				}
				break;
			case 8:
				for (int i_185_ = 0; i_185_ < -402153223 * Class316.anInt3670; i_185_++) {
					int i_186_ = is_171_[i_185_];
					int i_187_ = is_172_[i_185_];
					int i_188_ = is_173_[i_185_];
					is_168_[i_185_] = (0 == i_186_ ? 0 : 4096 - (4096 - is_174_[i_185_] << 12) / i_186_);
					is_169_[i_185_] = (i_187_ == 0 ? 0 : 4096 - (4096 - is_175_[i_185_] << 12) / i_187_);
					is_170_[i_185_] = (0 == i_188_ ? 0 : 4096 - (4096 - is_176_[i_185_] << 12) / i_188_);
				}
				break;
			case 4:
				for (int i_189_ = 0; i_189_ < -402153223 * Class316.anInt3670; i_189_++) {
					int i_190_ = is_174_[i_189_];
					int i_191_ = is_175_[i_189_];
					int i_192_ = is_176_[i_189_];
					is_168_[i_189_] = (i_190_ != 0 ? (is_171_[i_189_] << 12) / i_190_ : 4096);
					is_169_[i_189_] = (0 != i_191_ ? (is_172_[i_189_] << 12) / i_191_ : 4096);
					is_170_[i_189_] = (i_192_ != 0 ? (is_173_[i_189_] << 12) / i_192_ : 4096);
				}
				break;
			case 3:
				for (int i_193_ = 0; i_193_ < -402153223 * Class316.anInt3670; i_193_++) {
					is_168_[i_193_] = is_174_[i_193_] * is_171_[i_193_] >> 12;
					is_169_[i_193_] = is_172_[i_193_] * is_175_[i_193_] >> 12;
					is_170_[i_193_] = is_173_[i_193_] * is_176_[i_193_] >> 12;
				}
				break;
			case 1:
				for (int i_194_ = 0; i_194_ < -402153223 * Class316.anInt3670; i_194_++) {
					is_168_[i_194_] = is_171_[i_194_] + is_174_[i_194_];
					is_169_[i_194_] = is_172_[i_194_] + is_175_[i_194_];
					is_170_[i_194_] = is_176_[i_194_] + is_173_[i_194_];
				}
				break;
			case 6:
				for (int i_195_ = 0; i_195_ < -402153223 * Class316.anInt3670; i_195_++) {
					int i_196_ = is_174_[i_195_];
					int i_197_ = is_175_[i_195_];
					int i_198_ = is_176_[i_195_];
					is_168_[i_195_] = (i_196_ < 2048 ? i_196_ * is_171_[i_195_] >> 11 : 4096 - ((4096 - is_171_[i_195_]) * (4096 - i_196_) >> 11));
					is_169_[i_195_] = (i_197_ < 2048 ? is_172_[i_195_] * i_197_ >> 11 : 4096 - ((4096 - is_172_[i_195_]) * (4096 - i_197_) >> 11));
					is_170_[i_195_] = (i_198_ < 2048 ? i_198_ * is_173_[i_195_] >> 11 : 4096 - ((4096 - i_198_) * (4096 - is_173_[i_195_]) >> 11));
				}
				break;
			case 7:
				for (int i_199_ = 0; i_199_ < Class316.anInt3670 * -402153223; i_199_++) {
					int i_200_ = is_171_[i_199_];
					int i_201_ = is_172_[i_199_];
					int i_202_ = is_173_[i_199_];
					is_168_[i_199_] = (i_200_ == 4096 ? 4096 : (is_174_[i_199_] << 12) / (4096 - i_200_));
					is_169_[i_199_] = (4096 == i_201_ ? 4096 : (is_175_[i_199_] << 12) / (4096 - i_201_));
					is_170_[i_199_] = (4096 == i_202_ ? 4096 : (is_176_[i_199_] << 12) / (4096 - i_202_));
				}
				break;
			case 10:
				for (int i_203_ = 0; i_203_ < Class316.anInt3670 * -402153223; i_203_++) {
					int i_204_ = is_171_[i_203_];
					int i_205_ = is_172_[i_203_];
					int i_206_ = is_173_[i_203_];
					int i_207_ = is_174_[i_203_];
					int i_208_ = is_175_[i_203_];
					int i_209_ = is_176_[i_203_];
					is_168_[i_203_] = i_204_ > i_207_ ? i_204_ : i_207_;
					is_169_[i_203_] = i_205_ > i_208_ ? i_205_ : i_208_;
					is_170_[i_203_] = i_206_ > i_209_ ? i_206_ : i_209_;
				}
				break;
			case 9:
				for (int i_210_ = 0; i_210_ < -402153223 * Class316.anInt3670; i_210_++) {
					int i_211_ = is_171_[i_210_];
					int i_212_ = is_172_[i_210_];
					int i_213_ = is_173_[i_210_];
					int i_214_ = is_174_[i_210_];
					int i_215_ = is_175_[i_210_];
					int i_216_ = is_176_[i_210_];
					is_168_[i_210_] = i_211_ < i_214_ ? i_211_ : i_214_;
					is_169_[i_210_] = i_212_ < i_215_ ? i_212_ : i_215_;
					is_170_[i_210_] = i_213_ < i_216_ ? i_213_ : i_216_;
				}
				break;
			case 12:
				for (int i_217_ = 0; i_217_ < Class316.anInt3670 * -402153223; i_217_++) {
					int i_218_ = is_171_[i_217_];
					int i_219_ = is_172_[i_217_];
					int i_220_ = is_173_[i_217_];
					int i_221_ = is_174_[i_217_];
					int i_222_ = is_175_[i_217_];
					int i_223_ = is_176_[i_217_];
					is_168_[i_217_] = i_218_ + i_221_ - (i_221_ * i_218_ >> 11);
					is_169_[i_217_] = i_222_ + i_219_ - (i_222_ * i_219_ >> 11);
					is_170_[i_217_] = i_223_ + i_220_ - (i_223_ * i_220_ >> 11);
				}
				break;
			case 2:
				for (int i_224_ = 0; i_224_ < Class316.anInt3670 * -402153223; i_224_++) {
					is_168_[i_224_] = is_171_[i_224_] - is_174_[i_224_];
					is_169_[i_224_] = is_172_[i_224_] - is_175_[i_224_];
					is_170_[i_224_] = is_173_[i_224_] - is_176_[i_224_];
				}
				break;
			}
		}
		return is;
	}

	public static void method15395(Object object, int i) {
		if (Class282_Sub50_Sub17.anEventQueue10074 != null) {
			for (int i_225_ = 0; (i_225_ < 50 && (Class282_Sub50_Sub17.anEventQueue10074.peekEvent() != null)); i_225_++)
				Class89.method1504(1L);
			try {
				if (object != null)
					Class282_Sub50_Sub17.anEventQueue10074.postEvent(new ActionEvent(object, 1001, "dummy"));
			} catch (Exception exception) {
				/* empty */
			}
		}
	}
}
