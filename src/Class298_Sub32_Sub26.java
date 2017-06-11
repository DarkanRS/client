/* Class298_Sub32_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub26 extends Class298_Sub32 {
	static int anInt9482 = 12;
	static int anInt9483 = 2;
	static int anInt9484 = 3;
	static int anInt9485 = 10;
	static int anInt9486 = 5;
	static int anInt9487 = 4;
	static int anInt9488 = 7;
	int anInt9489 = -1528887782;
	static int anInt9490 = 9;
	static int anInt9491 = 8;
	static int anInt9492 = 11;
	static int anInt9493 = 6;
	static int anInt9494 = 6;
	static boolean aBoolean9495 = false;
	static int anInt9496 = 1;

	void method3301(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 1:
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
			break;
		case 0:
			((Class298_Sub32_Sub26) this).anInt9489 = class298_sub53.readUnsignedByte() * -970642513;
			break;
		}
	}

	int[] method3131(int i, int i_0_) {
		try {
			int[] is = aClass257_7384.method2448(i, 2069689682);
			if (aClass257_7384.aBoolean2810) {
				int[] is_1_ = method3129(0, i, -1887337990);
				int[] is_2_ = method3129(1, i, -1887337990);
				switch (1871252303 * ((Class298_Sub32_Sub26) this).anInt9489) {
				case 5:
					for (int i_3_ = 0; i_3_ < -1474554145 * Class250.anInt2755; i_3_++)
						is[i_3_] = 4096 - ((4096 - is_2_[i_3_]) * (4096 - is_1_[i_3_]) >> 12);
					break;
				case 4:
					for (int i_4_ = 0; i_4_ < -1474554145 * Class250.anInt2755; i_4_++) {
						int i_5_ = is_2_[i_4_];
						is[i_4_] = i_5_ != 0 ? (is_1_[i_4_] << 12) / i_5_ : 4096;
					}
					break;
				case 10:
					for (int i_6_ = 0; i_6_ < -1474554145 * Class250.anInt2755; i_6_++) {
						int i_7_ = is_1_[i_6_];
						int i_8_ = is_2_[i_6_];
						is[i_6_] = i_7_ > i_8_ ? i_7_ : i_8_;
					}
					break;
				case 1:
					for (int i_9_ = 0; i_9_ < Class250.anInt2755 * -1474554145; i_9_++)
						is[i_9_] = is_2_[i_9_] + is_1_[i_9_];
					break;
				case 8:
					for (int i_10_ = 0; i_10_ < Class250.anInt2755 * -1474554145; i_10_++) {
						int i_11_ = is_1_[i_10_];
						is[i_10_] = (0 == i_11_ ? 0 : 4096 - (4096 - is_2_[i_10_] << 12) / i_11_);
					}
					break;
				case 9:
					for (int i_12_ = 0; i_12_ < -1474554145 * Class250.anInt2755; i_12_++) {
						int i_13_ = is_1_[i_12_];
						int i_14_ = is_2_[i_12_];
						is[i_12_] = i_13_ < i_14_ ? i_13_ : i_14_;
					}
					break;
				case 12:
					for (int i_15_ = 0; i_15_ < -1474554145 * Class250.anInt2755; i_15_++) {
						int i_16_ = is_1_[i_15_];
						int i_17_ = is_2_[i_15_];
						is[i_15_] = i_16_ + i_17_ - (i_17_ * i_16_ >> 11);
					}
					break;
				case 11:
					for (int i_18_ = 0; i_18_ < Class250.anInt2755 * -1474554145; i_18_++) {
						int i_19_ = is_1_[i_18_];
						int i_20_ = is_2_[i_18_];
						is[i_18_] = i_19_ > i_20_ ? i_19_ - i_20_ : i_20_ - i_19_;
					}
					break;
				case 3:
					for (int i_21_ = 0; i_21_ < Class250.anInt2755 * -1474554145; i_21_++)
						is[i_21_] = is_2_[i_21_] * is_1_[i_21_] >> 12;
					break;
				case 6:
					for (int i_22_ = 0; i_22_ < Class250.anInt2755 * -1474554145; i_22_++) {
						int i_23_ = is_2_[i_22_];
						is[i_22_] = (i_23_ < 2048 ? is_1_[i_22_] * i_23_ >> 11 : 4096 - ((4096 - is_1_[i_22_]) * (4096 - i_23_) >> 11));
					}
					break;
				case 7:
					for (int i_24_ = 0; i_24_ < Class250.anInt2755 * -1474554145; i_24_++) {
						int i_25_ = is_1_[i_24_];
						is[i_24_] = (i_25_ == 4096 ? 4096 : (is_2_[i_24_] << 12) / (4096 - i_25_));
					}
					break;
				case 2:
					for (int i_26_ = 0; i_26_ < -1474554145 * Class250.anInt2755; i_26_++)
						is[i_26_] = is_1_[i_26_] - is_2_[i_26_];
					break;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aho.i(").append(')').toString());
		}
	}

	int[][] method3302(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 31);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_27_ = method3134(0, i, (byte) 8);
			int[][] is_28_ = method3134(1, i, (byte) 8);
			int[] is_29_ = is[0];
			int[] is_30_ = is[1];
			int[] is_31_ = is[2];
			int[] is_32_ = is_27_[0];
			int[] is_33_ = is_27_[1];
			int[] is_34_ = is_27_[2];
			int[] is_35_ = is_28_[0];
			int[] is_36_ = is_28_[1];
			int[] is_37_ = is_28_[2];
			switch (1871252303 * ((Class298_Sub32_Sub26) this).anInt9489) {
			case 7:
				for (int i_38_ = 0; i_38_ < -1474554145 * Class250.anInt2755; i_38_++) {
					int i_39_ = is_32_[i_38_];
					int i_40_ = is_33_[i_38_];
					int i_41_ = is_34_[i_38_];
					is_29_[i_38_] = (i_39_ == 4096 ? 4096 : (is_35_[i_38_] << 12) / (4096 - i_39_));
					is_30_[i_38_] = (i_40_ == 4096 ? 4096 : (is_36_[i_38_] << 12) / (4096 - i_40_));
					is_31_[i_38_] = (i_41_ == 4096 ? 4096 : (is_37_[i_38_] << 12) / (4096 - i_41_));
				}
				break;
			case 2:
				for (int i_42_ = 0; i_42_ < Class250.anInt2755 * -1474554145; i_42_++) {
					is_29_[i_42_] = is_32_[i_42_] - is_35_[i_42_];
					is_30_[i_42_] = is_33_[i_42_] - is_36_[i_42_];
					is_31_[i_42_] = is_34_[i_42_] - is_37_[i_42_];
				}
				break;
			case 12:
				for (int i_43_ = 0; i_43_ < -1474554145 * Class250.anInt2755; i_43_++) {
					int i_44_ = is_32_[i_43_];
					int i_45_ = is_33_[i_43_];
					int i_46_ = is_34_[i_43_];
					int i_47_ = is_35_[i_43_];
					int i_48_ = is_36_[i_43_];
					int i_49_ = is_37_[i_43_];
					is_29_[i_43_] = i_44_ + i_47_ - (i_47_ * i_44_ >> 11);
					is_30_[i_43_] = i_48_ + i_45_ - (i_45_ * i_48_ >> 11);
					is_31_[i_43_] = i_49_ + i_46_ - (i_49_ * i_46_ >> 11);
				}
				break;
			case 4:
				for (int i_50_ = 0; i_50_ < Class250.anInt2755 * -1474554145; i_50_++) {
					int i_51_ = is_35_[i_50_];
					int i_52_ = is_36_[i_50_];
					int i_53_ = is_37_[i_50_];
					is_29_[i_50_] = 0 != i_51_ ? (is_32_[i_50_] << 12) / i_51_ : 4096;
					is_30_[i_50_] = 0 != i_52_ ? (is_33_[i_50_] << 12) / i_52_ : 4096;
					is_31_[i_50_] = 0 != i_53_ ? (is_34_[i_50_] << 12) / i_53_ : 4096;
				}
				break;
			case 6:
				for (int i_54_ = 0; i_54_ < Class250.anInt2755 * -1474554145; i_54_++) {
					int i_55_ = is_35_[i_54_];
					int i_56_ = is_36_[i_54_];
					int i_57_ = is_37_[i_54_];
					is_29_[i_54_] = (i_55_ < 2048 ? is_32_[i_54_] * i_55_ >> 11 : 4096 - ((4096 - is_32_[i_54_]) * (4096 - i_55_) >> 11));
					is_30_[i_54_] = (i_56_ < 2048 ? is_33_[i_54_] * i_56_ >> 11 : 4096 - ((4096 - is_33_[i_54_]) * (4096 - i_56_) >> 11));
					is_31_[i_54_] = (i_57_ < 2048 ? i_57_ * is_34_[i_54_] >> 11 : 4096 - ((4096 - is_34_[i_54_]) * (4096 - i_57_) >> 11));
				}
				break;
			case 1:
				for (int i_58_ = 0; i_58_ < Class250.anInt2755 * -1474554145; i_58_++) {
					is_29_[i_58_] = is_35_[i_58_] + is_32_[i_58_];
					is_30_[i_58_] = is_36_[i_58_] + is_33_[i_58_];
					is_31_[i_58_] = is_37_[i_58_] + is_34_[i_58_];
				}
				break;
			case 8:
				for (int i_59_ = 0; i_59_ < Class250.anInt2755 * -1474554145; i_59_++) {
					int i_60_ = is_32_[i_59_];
					int i_61_ = is_33_[i_59_];
					int i_62_ = is_34_[i_59_];
					is_29_[i_59_] = (i_60_ == 0 ? 0 : 4096 - (4096 - is_35_[i_59_] << 12) / i_60_);
					is_30_[i_59_] = (i_61_ == 0 ? 0 : 4096 - (4096 - is_36_[i_59_] << 12) / i_61_);
					is_31_[i_59_] = (0 == i_62_ ? 0 : 4096 - (4096 - is_37_[i_59_] << 12) / i_62_);
				}
				break;
			case 11:
				for (int i_63_ = 0; i_63_ < -1474554145 * Class250.anInt2755; i_63_++) {
					int i_64_ = is_32_[i_63_];
					int i_65_ = is_33_[i_63_];
					int i_66_ = is_34_[i_63_];
					int i_67_ = is_35_[i_63_];
					int i_68_ = is_36_[i_63_];
					int i_69_ = is_37_[i_63_];
					is_29_[i_63_] = i_64_ > i_67_ ? i_64_ - i_67_ : i_67_ - i_64_;
					is_30_[i_63_] = i_65_ > i_68_ ? i_65_ - i_68_ : i_68_ - i_65_;
					is_31_[i_63_] = i_66_ > i_69_ ? i_66_ - i_69_ : i_69_ - i_66_;
				}
				break;
			case 3:
				for (int i_70_ = 0; i_70_ < -1474554145 * Class250.anInt2755; i_70_++) {
					is_29_[i_70_] = is_35_[i_70_] * is_32_[i_70_] >> 12;
					is_30_[i_70_] = is_33_[i_70_] * is_36_[i_70_] >> 12;
					is_31_[i_70_] = is_34_[i_70_] * is_37_[i_70_] >> 12;
				}
				break;
			case 5:
				for (int i_71_ = 0; i_71_ < -1474554145 * Class250.anInt2755; i_71_++) {
					is_29_[i_71_] = 4096 - ((4096 - is_35_[i_71_]) * (4096 - is_32_[i_71_]) >> 12);
					is_30_[i_71_] = 4096 - ((4096 - is_36_[i_71_]) * (4096 - is_33_[i_71_]) >> 12);
					is_31_[i_71_] = 4096 - ((4096 - is_34_[i_71_]) * (4096 - is_37_[i_71_]) >> 12);
				}
				break;
			case 10:
				for (int i_72_ = 0; i_72_ < -1474554145 * Class250.anInt2755; i_72_++) {
					int i_73_ = is_32_[i_72_];
					int i_74_ = is_33_[i_72_];
					int i_75_ = is_34_[i_72_];
					int i_76_ = is_35_[i_72_];
					int i_77_ = is_36_[i_72_];
					int i_78_ = is_37_[i_72_];
					is_29_[i_72_] = i_73_ > i_76_ ? i_73_ : i_76_;
					is_30_[i_72_] = i_74_ > i_77_ ? i_74_ : i_77_;
					is_31_[i_72_] = i_75_ > i_78_ ? i_75_ : i_78_;
				}
				break;
			case 9:
				for (int i_79_ = 0; i_79_ < -1474554145 * Class250.anInt2755; i_79_++) {
					int i_80_ = is_32_[i_79_];
					int i_81_ = is_33_[i_79_];
					int i_82_ = is_34_[i_79_];
					int i_83_ = is_35_[i_79_];
					int i_84_ = is_36_[i_79_];
					int i_85_ = is_37_[i_79_];
					is_29_[i_79_] = i_80_ < i_83_ ? i_80_ : i_83_;
					is_30_[i_79_] = i_81_ < i_84_ ? i_81_ : i_84_;
					is_31_[i_79_] = i_82_ < i_85_ ? i_82_ : i_85_;
				}
				break;
			}
		}
		return is;
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_86_) {
		try {
			switch (i) {
			case 1:
				aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
				break;
			case 0:
				((Class298_Sub32_Sub26) this).anInt9489 = class298_sub53.readUnsignedByte() * -970642513;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aho.r(").append(')').toString());
		}
	}

	int[] method3303(int i) {
		int[] is = aClass257_7384.method2448(i, 1521688759);
		if (aClass257_7384.aBoolean2810) {
			int[] is_87_ = method3129(0, i, -1887337990);
			int[] is_88_ = method3129(1, i, -1887337990);
			switch (1871252303 * ((Class298_Sub32_Sub26) this).anInt9489) {
			case 5:
				for (int i_89_ = 0; i_89_ < -1474554145 * Class250.anInt2755; i_89_++)
					is[i_89_] = 4096 - ((4096 - is_88_[i_89_]) * (4096 - is_87_[i_89_]) >> 12);
				break;
			case 4:
				for (int i_90_ = 0; i_90_ < -1474554145 * Class250.anInt2755; i_90_++) {
					int i_91_ = is_88_[i_90_];
					is[i_90_] = i_91_ != 0 ? (is_87_[i_90_] << 12) / i_91_ : 4096;
				}
				break;
			case 10:
				for (int i_92_ = 0; i_92_ < -1474554145 * Class250.anInt2755; i_92_++) {
					int i_93_ = is_87_[i_92_];
					int i_94_ = is_88_[i_92_];
					is[i_92_] = i_93_ > i_94_ ? i_93_ : i_94_;
				}
				break;
			case 1:
				for (int i_95_ = 0; i_95_ < Class250.anInt2755 * -1474554145; i_95_++)
					is[i_95_] = is_88_[i_95_] + is_87_[i_95_];
				break;
			case 8:
				for (int i_96_ = 0; i_96_ < Class250.anInt2755 * -1474554145; i_96_++) {
					int i_97_ = is_87_[i_96_];
					is[i_96_] = 0 == i_97_ ? 0 : 4096 - (4096 - is_88_[i_96_] << 12) / i_97_;
				}
				break;
			case 9:
				for (int i_98_ = 0; i_98_ < -1474554145 * Class250.anInt2755; i_98_++) {
					int i_99_ = is_87_[i_98_];
					int i_100_ = is_88_[i_98_];
					is[i_98_] = i_99_ < i_100_ ? i_99_ : i_100_;
				}
				break;
			case 12:
				for (int i_101_ = 0; i_101_ < -1474554145 * Class250.anInt2755; i_101_++) {
					int i_102_ = is_87_[i_101_];
					int i_103_ = is_88_[i_101_];
					is[i_101_] = i_102_ + i_103_ - (i_103_ * i_102_ >> 11);
				}
				break;
			case 11:
				for (int i_104_ = 0; i_104_ < Class250.anInt2755 * -1474554145; i_104_++) {
					int i_105_ = is_87_[i_104_];
					int i_106_ = is_88_[i_104_];
					is[i_104_] = i_105_ > i_106_ ? i_105_ - i_106_ : i_106_ - i_105_;
				}
				break;
			case 3:
				for (int i_107_ = 0; i_107_ < Class250.anInt2755 * -1474554145; i_107_++)
					is[i_107_] = is_88_[i_107_] * is_87_[i_107_] >> 12;
				break;
			case 6:
				for (int i_108_ = 0; i_108_ < Class250.anInt2755 * -1474554145; i_108_++) {
					int i_109_ = is_88_[i_108_];
					is[i_108_] = (i_109_ < 2048 ? is_87_[i_108_] * i_109_ >> 11 : 4096 - ((4096 - is_87_[i_108_]) * (4096 - i_109_) >> 11));
				}
				break;
			case 7:
				for (int i_110_ = 0; i_110_ < Class250.anInt2755 * -1474554145; i_110_++) {
					int i_111_ = is_87_[i_110_];
					is[i_110_] = (i_111_ == 4096 ? 4096 : (is_88_[i_110_] << 12) / (4096 - i_111_));
				}
				break;
			case 2:
				for (int i_112_ = 0; i_112_ < -1474554145 * Class250.anInt2755; i_112_++)
					is[i_112_] = is_87_[i_112_] - is_88_[i_112_];
				break;
			}
		}
		return is;
	}

	public Class298_Sub32_Sub26() {
		super(2, false);
	}

	void method3304(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 1:
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
			break;
		case 0:
			((Class298_Sub32_Sub26) this).anInt9489 = class298_sub53.readUnsignedByte() * -970642513;
			break;
		}
	}

	int[][] method3132(int i, byte i_113_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 108);
			if (aClass239_7380.aBoolean2607) {
				int[][] is_114_ = method3134(0, i, (byte) 8);
				int[][] is_115_ = method3134(1, i, (byte) 8);
				int[] is_116_ = is[0];
				int[] is_117_ = is[1];
				int[] is_118_ = is[2];
				int[] is_119_ = is_114_[0];
				int[] is_120_ = is_114_[1];
				int[] is_121_ = is_114_[2];
				int[] is_122_ = is_115_[0];
				int[] is_123_ = is_115_[1];
				int[] is_124_ = is_115_[2];
				switch (1871252303 * ((Class298_Sub32_Sub26) this).anInt9489) {
				case 7:
					for (int i_125_ = 0; i_125_ < -1474554145 * Class250.anInt2755; i_125_++) {
						int i_126_ = is_119_[i_125_];
						int i_127_ = is_120_[i_125_];
						int i_128_ = is_121_[i_125_];
						is_116_[i_125_] = (i_126_ == 4096 ? 4096 : (is_122_[i_125_] << 12) / (4096 - i_126_));
						is_117_[i_125_] = (i_127_ == 4096 ? 4096 : (is_123_[i_125_] << 12) / (4096 - i_127_));
						is_118_[i_125_] = (i_128_ == 4096 ? 4096 : (is_124_[i_125_] << 12) / (4096 - i_128_));
					}
					break;
				case 2:
					for (int i_129_ = 0; i_129_ < Class250.anInt2755 * -1474554145; i_129_++) {
						is_116_[i_129_] = is_119_[i_129_] - is_122_[i_129_];
						is_117_[i_129_] = is_120_[i_129_] - is_123_[i_129_];
						is_118_[i_129_] = is_121_[i_129_] - is_124_[i_129_];
					}
					break;
				case 12:
					for (int i_130_ = 0; i_130_ < -1474554145 * Class250.anInt2755; i_130_++) {
						int i_131_ = is_119_[i_130_];
						int i_132_ = is_120_[i_130_];
						int i_133_ = is_121_[i_130_];
						int i_134_ = is_122_[i_130_];
						int i_135_ = is_123_[i_130_];
						int i_136_ = is_124_[i_130_];
						is_116_[i_130_] = i_131_ + i_134_ - (i_134_ * i_131_ >> 11);
						is_117_[i_130_] = i_135_ + i_132_ - (i_132_ * i_135_ >> 11);
						is_118_[i_130_] = i_136_ + i_133_ - (i_136_ * i_133_ >> 11);
					}
					break;
				case 4:
					for (int i_137_ = 0; i_137_ < Class250.anInt2755 * -1474554145; i_137_++) {
						int i_138_ = is_122_[i_137_];
						int i_139_ = is_123_[i_137_];
						int i_140_ = is_124_[i_137_];
						is_116_[i_137_] = (0 != i_138_ ? (is_119_[i_137_] << 12) / i_138_ : 4096);
						is_117_[i_137_] = (0 != i_139_ ? (is_120_[i_137_] << 12) / i_139_ : 4096);
						is_118_[i_137_] = (0 != i_140_ ? (is_121_[i_137_] << 12) / i_140_ : 4096);
					}
					break;
				case 6:
					for (int i_141_ = 0; i_141_ < Class250.anInt2755 * -1474554145; i_141_++) {
						int i_142_ = is_122_[i_141_];
						int i_143_ = is_123_[i_141_];
						int i_144_ = is_124_[i_141_];
						is_116_[i_141_] = (i_142_ < 2048 ? is_119_[i_141_] * i_142_ >> 11 : 4096 - ((4096 - is_119_[i_141_]) * (4096 - i_142_) >> 11));
						is_117_[i_141_] = (i_143_ < 2048 ? is_120_[i_141_] * i_143_ >> 11 : 4096 - ((4096 - is_120_[i_141_]) * (4096 - i_143_) >> 11));
						is_118_[i_141_] = (i_144_ < 2048 ? i_144_ * is_121_[i_141_] >> 11 : 4096 - ((4096 - is_121_[i_141_]) * (4096 - i_144_) >> 11));
					}
					break;
				case 1:
					for (int i_145_ = 0; i_145_ < Class250.anInt2755 * -1474554145; i_145_++) {
						is_116_[i_145_] = is_122_[i_145_] + is_119_[i_145_];
						is_117_[i_145_] = is_123_[i_145_] + is_120_[i_145_];
						is_118_[i_145_] = is_124_[i_145_] + is_121_[i_145_];
					}
					break;
				case 8:
					for (int i_146_ = 0; i_146_ < Class250.anInt2755 * -1474554145; i_146_++) {
						int i_147_ = is_119_[i_146_];
						int i_148_ = is_120_[i_146_];
						int i_149_ = is_121_[i_146_];
						is_116_[i_146_] = i_147_ == 0 ? 0 : 4096 - (4096 - is_122_[i_146_] << 12) / i_147_;
						is_117_[i_146_] = i_148_ == 0 ? 0 : 4096 - (4096 - is_123_[i_146_] << 12) / i_148_;
						is_118_[i_146_] = 0 == i_149_ ? 0 : 4096 - (4096 - is_124_[i_146_] << 12) / i_149_;
					}
					break;
				case 11:
					for (int i_150_ = 0; i_150_ < -1474554145 * Class250.anInt2755; i_150_++) {
						int i_151_ = is_119_[i_150_];
						int i_152_ = is_120_[i_150_];
						int i_153_ = is_121_[i_150_];
						int i_154_ = is_122_[i_150_];
						int i_155_ = is_123_[i_150_];
						int i_156_ = is_124_[i_150_];
						is_116_[i_150_] = (i_151_ > i_154_ ? i_151_ - i_154_ : i_154_ - i_151_);
						is_117_[i_150_] = (i_152_ > i_155_ ? i_152_ - i_155_ : i_155_ - i_152_);
						is_118_[i_150_] = (i_153_ > i_156_ ? i_153_ - i_156_ : i_156_ - i_153_);
					}
					break;
				case 3:
					for (int i_157_ = 0; i_157_ < -1474554145 * Class250.anInt2755; i_157_++) {
						is_116_[i_157_] = is_122_[i_157_] * is_119_[i_157_] >> 12;
						is_117_[i_157_] = is_120_[i_157_] * is_123_[i_157_] >> 12;
						is_118_[i_157_] = is_121_[i_157_] * is_124_[i_157_] >> 12;
					}
					break;
				case 5:
					for (int i_158_ = 0; i_158_ < -1474554145 * Class250.anInt2755; i_158_++) {
						is_116_[i_158_] = 4096 - (((4096 - is_122_[i_158_]) * (4096 - is_119_[i_158_])) >> 12);
						is_117_[i_158_] = 4096 - (((4096 - is_123_[i_158_]) * (4096 - is_120_[i_158_])) >> 12);
						is_118_[i_158_] = 4096 - (((4096 - is_121_[i_158_]) * (4096 - is_124_[i_158_])) >> 12);
					}
					break;
				case 10:
					for (int i_159_ = 0; i_159_ < -1474554145 * Class250.anInt2755; i_159_++) {
						int i_160_ = is_119_[i_159_];
						int i_161_ = is_120_[i_159_];
						int i_162_ = is_121_[i_159_];
						int i_163_ = is_122_[i_159_];
						int i_164_ = is_123_[i_159_];
						int i_165_ = is_124_[i_159_];
						is_116_[i_159_] = i_160_ > i_163_ ? i_160_ : i_163_;
						is_117_[i_159_] = i_161_ > i_164_ ? i_161_ : i_164_;
						is_118_[i_159_] = i_162_ > i_165_ ? i_162_ : i_165_;
					}
					break;
				case 9:
					for (int i_166_ = 0; i_166_ < -1474554145 * Class250.anInt2755; i_166_++) {
						int i_167_ = is_119_[i_166_];
						int i_168_ = is_120_[i_166_];
						int i_169_ = is_121_[i_166_];
						int i_170_ = is_122_[i_166_];
						int i_171_ = is_123_[i_166_];
						int i_172_ = is_124_[i_166_];
						is_116_[i_166_] = i_167_ < i_170_ ? i_167_ : i_170_;
						is_117_[i_166_] = i_168_ < i_171_ ? i_168_ : i_171_;
						is_118_[i_166_] = i_169_ < i_172_ ? i_169_ : i_172_;
					}
					break;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aho.k(").append(')').toString());
		}
	}

	int[] method3305(int i) {
		int[] is = aClass257_7384.method2448(i, 825764346);
		if (aClass257_7384.aBoolean2810) {
			int[] is_173_ = method3129(0, i, -1887337990);
			int[] is_174_ = method3129(1, i, -1887337990);
			switch (1871252303 * ((Class298_Sub32_Sub26) this).anInt9489) {
			case 5:
				for (int i_175_ = 0; i_175_ < -1474554145 * Class250.anInt2755; i_175_++)
					is[i_175_] = 4096 - (((4096 - is_174_[i_175_]) * (4096 - is_173_[i_175_])) >> 12);
				break;
			case 4:
				for (int i_176_ = 0; i_176_ < -1474554145 * Class250.anInt2755; i_176_++) {
					int i_177_ = is_174_[i_176_];
					is[i_176_] = (i_177_ != 0 ? (is_173_[i_176_] << 12) / i_177_ : 4096);
				}
				break;
			case 10:
				for (int i_178_ = 0; i_178_ < -1474554145 * Class250.anInt2755; i_178_++) {
					int i_179_ = is_173_[i_178_];
					int i_180_ = is_174_[i_178_];
					is[i_178_] = i_179_ > i_180_ ? i_179_ : i_180_;
				}
				break;
			case 1:
				for (int i_181_ = 0; i_181_ < Class250.anInt2755 * -1474554145; i_181_++)
					is[i_181_] = is_174_[i_181_] + is_173_[i_181_];
				break;
			case 8:
				for (int i_182_ = 0; i_182_ < Class250.anInt2755 * -1474554145; i_182_++) {
					int i_183_ = is_173_[i_182_];
					is[i_182_] = (0 == i_183_ ? 0 : 4096 - (4096 - is_174_[i_182_] << 12) / i_183_);
				}
				break;
			case 9:
				for (int i_184_ = 0; i_184_ < -1474554145 * Class250.anInt2755; i_184_++) {
					int i_185_ = is_173_[i_184_];
					int i_186_ = is_174_[i_184_];
					is[i_184_] = i_185_ < i_186_ ? i_185_ : i_186_;
				}
				break;
			case 12:
				for (int i_187_ = 0; i_187_ < -1474554145 * Class250.anInt2755; i_187_++) {
					int i_188_ = is_173_[i_187_];
					int i_189_ = is_174_[i_187_];
					is[i_187_] = i_188_ + i_189_ - (i_189_ * i_188_ >> 11);
				}
				break;
			case 11:
				for (int i_190_ = 0; i_190_ < Class250.anInt2755 * -1474554145; i_190_++) {
					int i_191_ = is_173_[i_190_];
					int i_192_ = is_174_[i_190_];
					is[i_190_] = i_191_ > i_192_ ? i_191_ - i_192_ : i_192_ - i_191_;
				}
				break;
			case 3:
				for (int i_193_ = 0; i_193_ < Class250.anInt2755 * -1474554145; i_193_++)
					is[i_193_] = is_174_[i_193_] * is_173_[i_193_] >> 12;
				break;
			case 6:
				for (int i_194_ = 0; i_194_ < Class250.anInt2755 * -1474554145; i_194_++) {
					int i_195_ = is_174_[i_194_];
					is[i_194_] = (i_195_ < 2048 ? is_173_[i_194_] * i_195_ >> 11 : 4096 - ((4096 - is_173_[i_194_]) * (4096 - i_195_) >> 11));
				}
				break;
			case 7:
				for (int i_196_ = 0; i_196_ < Class250.anInt2755 * -1474554145; i_196_++) {
					int i_197_ = is_173_[i_196_];
					is[i_196_] = (i_197_ == 4096 ? 4096 : (is_174_[i_196_] << 12) / (4096 - i_197_));
				}
				break;
			case 2:
				for (int i_198_ = 0; i_198_ < -1474554145 * Class250.anInt2755; i_198_++)
					is[i_198_] = is_173_[i_198_] - is_174_[i_198_];
				break;
			}
		}
		return is;
	}

	int[][] method3306(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 82);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_199_ = method3134(0, i, (byte) 8);
			int[][] is_200_ = method3134(1, i, (byte) 8);
			int[] is_201_ = is[0];
			int[] is_202_ = is[1];
			int[] is_203_ = is[2];
			int[] is_204_ = is_199_[0];
			int[] is_205_ = is_199_[1];
			int[] is_206_ = is_199_[2];
			int[] is_207_ = is_200_[0];
			int[] is_208_ = is_200_[1];
			int[] is_209_ = is_200_[2];
			switch (1871252303 * ((Class298_Sub32_Sub26) this).anInt9489) {
			case 7:
				for (int i_210_ = 0; i_210_ < -1474554145 * Class250.anInt2755; i_210_++) {
					int i_211_ = is_204_[i_210_];
					int i_212_ = is_205_[i_210_];
					int i_213_ = is_206_[i_210_];
					is_201_[i_210_] = (i_211_ == 4096 ? 4096 : (is_207_[i_210_] << 12) / (4096 - i_211_));
					is_202_[i_210_] = (i_212_ == 4096 ? 4096 : (is_208_[i_210_] << 12) / (4096 - i_212_));
					is_203_[i_210_] = (i_213_ == 4096 ? 4096 : (is_209_[i_210_] << 12) / (4096 - i_213_));
				}
				break;
			case 2:
				for (int i_214_ = 0; i_214_ < Class250.anInt2755 * -1474554145; i_214_++) {
					is_201_[i_214_] = is_204_[i_214_] - is_207_[i_214_];
					is_202_[i_214_] = is_205_[i_214_] - is_208_[i_214_];
					is_203_[i_214_] = is_206_[i_214_] - is_209_[i_214_];
				}
				break;
			case 12:
				for (int i_215_ = 0; i_215_ < -1474554145 * Class250.anInt2755; i_215_++) {
					int i_216_ = is_204_[i_215_];
					int i_217_ = is_205_[i_215_];
					int i_218_ = is_206_[i_215_];
					int i_219_ = is_207_[i_215_];
					int i_220_ = is_208_[i_215_];
					int i_221_ = is_209_[i_215_];
					is_201_[i_215_] = i_216_ + i_219_ - (i_219_ * i_216_ >> 11);
					is_202_[i_215_] = i_220_ + i_217_ - (i_217_ * i_220_ >> 11);
					is_203_[i_215_] = i_221_ + i_218_ - (i_221_ * i_218_ >> 11);
				}
				break;
			case 4:
				for (int i_222_ = 0; i_222_ < Class250.anInt2755 * -1474554145; i_222_++) {
					int i_223_ = is_207_[i_222_];
					int i_224_ = is_208_[i_222_];
					int i_225_ = is_209_[i_222_];
					is_201_[i_222_] = (0 != i_223_ ? (is_204_[i_222_] << 12) / i_223_ : 4096);
					is_202_[i_222_] = (0 != i_224_ ? (is_205_[i_222_] << 12) / i_224_ : 4096);
					is_203_[i_222_] = (0 != i_225_ ? (is_206_[i_222_] << 12) / i_225_ : 4096);
				}
				break;
			case 6:
				for (int i_226_ = 0; i_226_ < Class250.anInt2755 * -1474554145; i_226_++) {
					int i_227_ = is_207_[i_226_];
					int i_228_ = is_208_[i_226_];
					int i_229_ = is_209_[i_226_];
					is_201_[i_226_] = (i_227_ < 2048 ? is_204_[i_226_] * i_227_ >> 11 : 4096 - ((4096 - is_204_[i_226_]) * (4096 - i_227_) >> 11));
					is_202_[i_226_] = (i_228_ < 2048 ? is_205_[i_226_] * i_228_ >> 11 : 4096 - ((4096 - is_205_[i_226_]) * (4096 - i_228_) >> 11));
					is_203_[i_226_] = (i_229_ < 2048 ? i_229_ * is_206_[i_226_] >> 11 : 4096 - ((4096 - is_206_[i_226_]) * (4096 - i_229_) >> 11));
				}
				break;
			case 1:
				for (int i_230_ = 0; i_230_ < Class250.anInt2755 * -1474554145; i_230_++) {
					is_201_[i_230_] = is_207_[i_230_] + is_204_[i_230_];
					is_202_[i_230_] = is_208_[i_230_] + is_205_[i_230_];
					is_203_[i_230_] = is_209_[i_230_] + is_206_[i_230_];
				}
				break;
			case 8:
				for (int i_231_ = 0; i_231_ < Class250.anInt2755 * -1474554145; i_231_++) {
					int i_232_ = is_204_[i_231_];
					int i_233_ = is_205_[i_231_];
					int i_234_ = is_206_[i_231_];
					is_201_[i_231_] = (i_232_ == 0 ? 0 : 4096 - (4096 - is_207_[i_231_] << 12) / i_232_);
					is_202_[i_231_] = (i_233_ == 0 ? 0 : 4096 - (4096 - is_208_[i_231_] << 12) / i_233_);
					is_203_[i_231_] = (0 == i_234_ ? 0 : 4096 - (4096 - is_209_[i_231_] << 12) / i_234_);
				}
				break;
			case 11:
				for (int i_235_ = 0; i_235_ < -1474554145 * Class250.anInt2755; i_235_++) {
					int i_236_ = is_204_[i_235_];
					int i_237_ = is_205_[i_235_];
					int i_238_ = is_206_[i_235_];
					int i_239_ = is_207_[i_235_];
					int i_240_ = is_208_[i_235_];
					int i_241_ = is_209_[i_235_];
					is_201_[i_235_] = i_236_ > i_239_ ? i_236_ - i_239_ : i_239_ - i_236_;
					is_202_[i_235_] = i_237_ > i_240_ ? i_237_ - i_240_ : i_240_ - i_237_;
					is_203_[i_235_] = i_238_ > i_241_ ? i_238_ - i_241_ : i_241_ - i_238_;
				}
				break;
			case 3:
				for (int i_242_ = 0; i_242_ < -1474554145 * Class250.anInt2755; i_242_++) {
					is_201_[i_242_] = is_207_[i_242_] * is_204_[i_242_] >> 12;
					is_202_[i_242_] = is_205_[i_242_] * is_208_[i_242_] >> 12;
					is_203_[i_242_] = is_206_[i_242_] * is_209_[i_242_] >> 12;
				}
				break;
			case 5:
				for (int i_243_ = 0; i_243_ < -1474554145 * Class250.anInt2755; i_243_++) {
					is_201_[i_243_] = 4096 - (((4096 - is_207_[i_243_]) * (4096 - is_204_[i_243_])) >> 12);
					is_202_[i_243_] = 4096 - (((4096 - is_208_[i_243_]) * (4096 - is_205_[i_243_])) >> 12);
					is_203_[i_243_] = 4096 - (((4096 - is_206_[i_243_]) * (4096 - is_209_[i_243_])) >> 12);
				}
				break;
			case 10:
				for (int i_244_ = 0; i_244_ < -1474554145 * Class250.anInt2755; i_244_++) {
					int i_245_ = is_204_[i_244_];
					int i_246_ = is_205_[i_244_];
					int i_247_ = is_206_[i_244_];
					int i_248_ = is_207_[i_244_];
					int i_249_ = is_208_[i_244_];
					int i_250_ = is_209_[i_244_];
					is_201_[i_244_] = i_245_ > i_248_ ? i_245_ : i_248_;
					is_202_[i_244_] = i_246_ > i_249_ ? i_246_ : i_249_;
					is_203_[i_244_] = i_247_ > i_250_ ? i_247_ : i_250_;
				}
				break;
			case 9:
				for (int i_251_ = 0; i_251_ < -1474554145 * Class250.anInt2755; i_251_++) {
					int i_252_ = is_204_[i_251_];
					int i_253_ = is_205_[i_251_];
					int i_254_ = is_206_[i_251_];
					int i_255_ = is_207_[i_251_];
					int i_256_ = is_208_[i_251_];
					int i_257_ = is_209_[i_251_];
					is_201_[i_251_] = i_252_ < i_255_ ? i_252_ : i_255_;
					is_202_[i_251_] = i_253_ < i_256_ ? i_253_ : i_256_;
					is_203_[i_251_] = i_254_ < i_257_ ? i_254_ : i_257_;
				}
				break;
			}
		}
		return is;
	}

	static final void method3307(Interface class298_sub51, int i, int i_258_, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_, int i_264_, int i_265_, byte i_266_) {
		try {
			if (Class378.method4671(i, null, -1677271827)) {
				if (class298_sub51 != null && !class298_sub51.method3573(364199740))
					Class173.method1821(class298_sub51, true, false, -113822480);
				else {
					Class119 class119 = Class389.aClass119Array4165[i];
					client.method2800(class119, class119.method1295((byte) -55), -1, i_258_, i_259_, i_260_, i_261_, i_262_, i_263_, i_264_, i_265_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aho.lt(").append(')').toString());
		}
	}
}
