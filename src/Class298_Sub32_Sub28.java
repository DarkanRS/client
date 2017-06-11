/* Class298_Sub32_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub28 extends Class298_Sub32 {
	int anInt9499 = -938414935;
	int anInt9500 = -804145351;
	static boolean aBoolean9501 = false;
	static int anInt9502 = 1;

	public Class298_Sub32_Sub28() {
		super(1, false);
	}

	int[] method3131(int i, int i_0_) {
		try {
			int[] is = aClass257_7384.method2448(i, 936289557);
			if (aClass257_7384.aBoolean2810) {
				int i_1_ = 1 + (1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + (1615726345 * ((Class298_Sub32_Sub28) this).anInt9500));
				int i_2_ = 65536 / i_1_;
				int i_3_ = 1 + (((Class298_Sub32_Sub28) this).anInt9499 * 484472729 + (484472729 * ((Class298_Sub32_Sub28) this).anInt9499));
				int i_4_ = 65536 / i_3_;
				int[][] is_5_ = new int[i_1_][];
				for (int i_6_ = i - 1615726345 * (((Class298_Sub32_Sub28) this).anInt9500); (i_6_ <= (((Class298_Sub32_Sub28) this).anInt9500 * 1615726345 + i)); i_6_++) {
					int[] is_7_ = method3129(0, i_6_ & Class250.anInt2758 * -289063255, -1887337990);
					int[] is_8_ = new int[Class250.anInt2755 * -1474554145];
					int i_9_ = 0;
					for (int i_10_ = -(((Class298_Sub32_Sub28) this).anInt9499 * 484472729); i_10_ <= (484472729 * ((Class298_Sub32_Sub28) this).anInt9499); i_10_++)
						i_9_ += is_7_[i_10_ & -901777799 * Class250.anInt2753];
					int i_11_ = 0;
					while (i_11_ < Class250.anInt2755 * -1474554145) {
						is_8_[i_11_] = i_4_ * i_9_ >> 16;
						i_9_ -= is_7_[(i_11_ - (484472729 * (((Class298_Sub32_Sub28) this).anInt9499)) & -901777799 * Class250.anInt2753)];
						i_11_++;
						i_9_ += is_7_[(i_11_ + (484472729 * (((Class298_Sub32_Sub28) this).anInt9499)) & Class250.anInt2753 * -901777799)];
					}
					is_5_[(1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + i_6_ - i)] = is_8_;
				}
				for (int i_12_ = 0; i_12_ < Class250.anInt2755 * -1474554145; i_12_++) {
					int i_13_ = 0;
					for (int i_14_ = 0; i_14_ < i_1_; i_14_++)
						i_13_ += is_5_[i_14_][i_12_];
					is[i_12_] = i_13_ * i_2_ >> 16;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahq.i(").append(')').toString());
		}
	}

	int[][] method3132(int i, byte i_15_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 5);
			if (aClass239_7380.aBoolean2607) {
				int i_16_ = (1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + 1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + 1);
				int i_17_ = 65536 / i_16_;
				int i_18_ = 1 + (((Class298_Sub32_Sub28) this).anInt9499 * 484472729 + (484472729 * ((Class298_Sub32_Sub28) this).anInt9499));
				int i_19_ = 65536 / i_18_;
				int[][][] is_20_ = new int[i_16_][][];
				for (int i_21_ = i - 1615726345 * ((Class298_Sub32_Sub28) this).anInt9500; (i_21_ <= (1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + i)); i_21_++) {
					int[][] is_22_ = method3134(0, i_21_ & Class250.anInt2758 * -289063255, (byte) 8);
					int[][] is_23_ = new int[3][Class250.anInt2755 * -1474554145];
					int i_24_ = 0;
					int i_25_ = 0;
					int i_26_ = 0;
					int[] is_27_ = is_22_[0];
					int[] is_28_ = is_22_[1];
					int[] is_29_ = is_22_[2];
					for (int i_30_ = -(484472729 * ((Class298_Sub32_Sub28) this).anInt9499); i_30_ <= (484472729 * ((Class298_Sub32_Sub28) this).anInt9499); i_30_++) {
						int i_31_ = i_30_ & -901777799 * Class250.anInt2753;
						i_24_ += is_27_[i_31_];
						i_25_ += is_28_[i_31_];
						i_26_ += is_29_[i_31_];
					}
					int[] is_32_ = is_23_[0];
					int[] is_33_ = is_23_[1];
					int[] is_34_ = is_23_[2];
					int i_35_ = 0;
					while (i_35_ < Class250.anInt2755 * -1474554145) {
						is_32_[i_35_] = i_24_ * i_19_ >> 16;
						is_33_[i_35_] = i_19_ * i_25_ >> 16;
						is_34_[i_35_] = i_19_ * i_26_ >> 16;
						int i_36_ = (i_35_ - 484472729 * ((Class298_Sub32_Sub28) this).anInt9499 & Class250.anInt2753 * -901777799);
						i_24_ -= is_27_[i_36_];
						i_25_ -= is_28_[i_36_];
						i_26_ -= is_29_[i_36_];
						i_36_ = (++i_35_ + 484472729 * ((Class298_Sub32_Sub28) this).anInt9499 & Class250.anInt2753 * -901777799);
						i_24_ += is_27_[i_36_];
						i_25_ += is_28_[i_36_];
						i_26_ += is_29_[i_36_];
					}
					is_20_[1615726345 * (((Class298_Sub32_Sub28) this).anInt9500) + i_21_ - i] = is_23_;
				}
				int[] is_37_ = is[0];
				int[] is_38_ = is[1];
				int[] is_39_ = is[2];
				for (int i_40_ = 0; i_40_ < Class250.anInt2755 * -1474554145; i_40_++) {
					int i_41_ = 0;
					int i_42_ = 0;
					int i_43_ = 0;
					for (int i_44_ = 0; i_44_ < i_16_; i_44_++) {
						int[][] is_45_ = is_20_[i_44_];
						i_41_ += is_45_[0][i_40_];
						i_42_ += is_45_[1][i_40_];
						i_43_ += is_45_[2][i_40_];
					}
					is_37_[i_40_] = i_17_ * i_41_ >> 16;
					is_38_[i_40_] = i_17_ * i_42_ >> 16;
					is_39_[i_40_] = i_17_ * i_43_ >> 16;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahq.k(").append(')').toString());
		}
	}

	int[] method3312(int i) {
		int[] is = aClass257_7384.method2448(i, 1014754656);
		if (aClass257_7384.aBoolean2810) {
			int i_46_ = 1 + (1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + 1615726345 * ((Class298_Sub32_Sub28) this).anInt9500);
			int i_47_ = 65536 / i_46_;
			int i_48_ = 1 + (((Class298_Sub32_Sub28) this).anInt9499 * 484472729 + 484472729 * ((Class298_Sub32_Sub28) this).anInt9499);
			int i_49_ = 65536 / i_48_;
			int[][] is_50_ = new int[i_46_][];
			for (int i_51_ = i - (1615726345 * ((Class298_Sub32_Sub28) this).anInt9500); (i_51_ <= ((Class298_Sub32_Sub28) this).anInt9500 * 1615726345 + i); i_51_++) {
				int[] is_52_ = method3129(0, i_51_ & Class250.anInt2758 * -289063255, -1887337990);
				int[] is_53_ = new int[Class250.anInt2755 * -1474554145];
				int i_54_ = 0;
				for (int i_55_ = -(((Class298_Sub32_Sub28) this).anInt9499 * 484472729); (i_55_ <= 484472729 * ((Class298_Sub32_Sub28) this).anInt9499); i_55_++)
					i_54_ += is_52_[i_55_ & -901777799 * Class250.anInt2753];
				int i_56_ = 0;
				while (i_56_ < Class250.anInt2755 * -1474554145) {
					is_53_[i_56_] = i_49_ * i_54_ >> 16;
					i_54_ -= is_52_[(i_56_ - 484472729 * ((Class298_Sub32_Sub28) this).anInt9499 & -901777799 * Class250.anInt2753)];
					i_56_++;
					i_54_ += is_52_[(i_56_ + 484472729 * ((Class298_Sub32_Sub28) this).anInt9499 & Class250.anInt2753 * -901777799)];
				}
				is_50_[(1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + i_51_ - i)] = is_53_;
			}
			for (int i_57_ = 0; i_57_ < Class250.anInt2755 * -1474554145; i_57_++) {
				int i_58_ = 0;
				for (int i_59_ = 0; i_59_ < i_46_; i_59_++)
					i_58_ += is_50_[i_59_][i_57_];
				is[i_57_] = i_58_ * i_47_ >> 16;
			}
		}
		return is;
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_60_) {
		try {
			switch (i) {
			case 1:
				((Class298_Sub32_Sub28) this).anInt9500 = class298_sub53.readUnsignedByte() * -804145351;
				break;
			case 0:
				((Class298_Sub32_Sub28) this).anInt9499 = class298_sub53.readUnsignedByte() * -938414935;
				break;
			case 2:
				aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahq.r(").append(')').toString());
		}
	}

	int[][] method3313(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 41);
		if (aClass239_7380.aBoolean2607) {
			int i_61_ = (1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + 1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + 1);
			int i_62_ = 65536 / i_61_;
			int i_63_ = 1 + (((Class298_Sub32_Sub28) this).anInt9499 * 484472729 + 484472729 * ((Class298_Sub32_Sub28) this).anInt9499);
			int i_64_ = 65536 / i_63_;
			int[][][] is_65_ = new int[i_61_][][];
			for (int i_66_ = i - (1615726345 * ((Class298_Sub32_Sub28) this).anInt9500); (i_66_ <= 1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + i); i_66_++) {
				int[][] is_67_ = method3134(0, i_66_ & Class250.anInt2758 * -289063255, (byte) 8);
				int[][] is_68_ = new int[3][Class250.anInt2755 * -1474554145];
				int i_69_ = 0;
				int i_70_ = 0;
				int i_71_ = 0;
				int[] is_72_ = is_67_[0];
				int[] is_73_ = is_67_[1];
				int[] is_74_ = is_67_[2];
				for (int i_75_ = -(484472729 * ((Class298_Sub32_Sub28) this).anInt9499); (i_75_ <= 484472729 * ((Class298_Sub32_Sub28) this).anInt9499); i_75_++) {
					int i_76_ = i_75_ & -901777799 * Class250.anInt2753;
					i_69_ += is_72_[i_76_];
					i_70_ += is_73_[i_76_];
					i_71_ += is_74_[i_76_];
				}
				int[] is_77_ = is_68_[0];
				int[] is_78_ = is_68_[1];
				int[] is_79_ = is_68_[2];
				int i_80_ = 0;
				while (i_80_ < Class250.anInt2755 * -1474554145) {
					is_77_[i_80_] = i_69_ * i_64_ >> 16;
					is_78_[i_80_] = i_64_ * i_70_ >> 16;
					is_79_[i_80_] = i_64_ * i_71_ >> 16;
					int i_81_ = (i_80_ - (484472729 * ((Class298_Sub32_Sub28) this).anInt9499) & Class250.anInt2753 * -901777799);
					i_69_ -= is_72_[i_81_];
					i_70_ -= is_73_[i_81_];
					i_71_ -= is_74_[i_81_];
					i_81_ = (++i_80_ + 484472729 * (((Class298_Sub32_Sub28) this).anInt9499) & Class250.anInt2753 * -901777799);
					i_69_ += is_72_[i_81_];
					i_70_ += is_73_[i_81_];
					i_71_ += is_74_[i_81_];
				}
				is_65_[(1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + i_66_ - i)] = is_68_;
			}
			int[] is_82_ = is[0];
			int[] is_83_ = is[1];
			int[] is_84_ = is[2];
			for (int i_85_ = 0; i_85_ < Class250.anInt2755 * -1474554145; i_85_++) {
				int i_86_ = 0;
				int i_87_ = 0;
				int i_88_ = 0;
				for (int i_89_ = 0; i_89_ < i_61_; i_89_++) {
					int[][] is_90_ = is_65_[i_89_];
					i_86_ += is_90_[0][i_85_];
					i_87_ += is_90_[1][i_85_];
					i_88_ += is_90_[2][i_85_];
				}
				is_82_[i_85_] = i_62_ * i_86_ >> 16;
				is_83_[i_85_] = i_62_ * i_87_ >> 16;
				is_84_[i_85_] = i_62_ * i_88_ >> 16;
			}
		}
		return is;
	}

	void method3314(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 1:
			((Class298_Sub32_Sub28) this).anInt9500 = class298_sub53.readUnsignedByte() * -804145351;
			break;
		case 0:
			((Class298_Sub32_Sub28) this).anInt9499 = class298_sub53.readUnsignedByte() * -938414935;
			break;
		case 2:
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
			break;
		}
	}

	void method3315(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 1:
			((Class298_Sub32_Sub28) this).anInt9500 = class298_sub53.readUnsignedByte() * -804145351;
			break;
		case 0:
			((Class298_Sub32_Sub28) this).anInt9499 = class298_sub53.readUnsignedByte() * -938414935;
			break;
		case 2:
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
			break;
		}
	}

	int[] method3316(int i) {
		int[] is = aClass257_7384.method2448(i, 1055902862);
		if (aClass257_7384.aBoolean2810) {
			int i_91_ = 1 + (1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + 1615726345 * ((Class298_Sub32_Sub28) this).anInt9500);
			int i_92_ = 65536 / i_91_;
			int i_93_ = 1 + (((Class298_Sub32_Sub28) this).anInt9499 * 484472729 + 484472729 * ((Class298_Sub32_Sub28) this).anInt9499);
			int i_94_ = 65536 / i_93_;
			int[][] is_95_ = new int[i_91_][];
			for (int i_96_ = i - (1615726345 * ((Class298_Sub32_Sub28) this).anInt9500); (i_96_ <= ((Class298_Sub32_Sub28) this).anInt9500 * 1615726345 + i); i_96_++) {
				int[] is_97_ = method3129(0, i_96_ & Class250.anInt2758 * -289063255, -1887337990);
				int[] is_98_ = new int[Class250.anInt2755 * -1474554145];
				int i_99_ = 0;
				for (int i_100_ = -(((Class298_Sub32_Sub28) this).anInt9499 * 484472729); (i_100_ <= 484472729 * ((Class298_Sub32_Sub28) this).anInt9499); i_100_++)
					i_99_ += is_97_[i_100_ & -901777799 * Class250.anInt2753];
				int i_101_ = 0;
				while (i_101_ < Class250.anInt2755 * -1474554145) {
					is_98_[i_101_] = i_94_ * i_99_ >> 16;
					i_99_ -= is_97_[(i_101_ - 484472729 * ((Class298_Sub32_Sub28) this).anInt9499 & -901777799 * Class250.anInt2753)];
					i_101_++;
					i_99_ += is_97_[(i_101_ + 484472729 * ((Class298_Sub32_Sub28) this).anInt9499 & Class250.anInt2753 * -901777799)];
				}
				is_95_[(1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + i_96_ - i)] = is_98_;
			}
			for (int i_102_ = 0; i_102_ < Class250.anInt2755 * -1474554145; i_102_++) {
				int i_103_ = 0;
				for (int i_104_ = 0; i_104_ < i_91_; i_104_++)
					i_103_ += is_95_[i_104_][i_102_];
				is[i_102_] = i_103_ * i_92_ >> 16;
			}
		}
		return is;
	}

	int[][] method3317(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 82);
		if (aClass239_7380.aBoolean2607) {
			int i_105_ = (1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + 1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + 1);
			int i_106_ = 65536 / i_105_;
			int i_107_ = 1 + (((Class298_Sub32_Sub28) this).anInt9499 * 484472729 + 484472729 * ((Class298_Sub32_Sub28) this).anInt9499);
			int i_108_ = 65536 / i_107_;
			int[][][] is_109_ = new int[i_105_][][];
			for (int i_110_ = i - (1615726345 * ((Class298_Sub32_Sub28) this).anInt9500); (i_110_ <= 1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + i); i_110_++) {
				int[][] is_111_ = method3134(0, i_110_ & Class250.anInt2758 * -289063255, (byte) 8);
				int[][] is_112_ = new int[3][Class250.anInt2755 * -1474554145];
				int i_113_ = 0;
				int i_114_ = 0;
				int i_115_ = 0;
				int[] is_116_ = is_111_[0];
				int[] is_117_ = is_111_[1];
				int[] is_118_ = is_111_[2];
				for (int i_119_ = -(484472729 * ((Class298_Sub32_Sub28) this).anInt9499); (i_119_ <= 484472729 * ((Class298_Sub32_Sub28) this).anInt9499); i_119_++) {
					int i_120_ = i_119_ & -901777799 * Class250.anInt2753;
					i_113_ += is_116_[i_120_];
					i_114_ += is_117_[i_120_];
					i_115_ += is_118_[i_120_];
				}
				int[] is_121_ = is_112_[0];
				int[] is_122_ = is_112_[1];
				int[] is_123_ = is_112_[2];
				int i_124_ = 0;
				while (i_124_ < Class250.anInt2755 * -1474554145) {
					is_121_[i_124_] = i_113_ * i_108_ >> 16;
					is_122_[i_124_] = i_108_ * i_114_ >> 16;
					is_123_[i_124_] = i_108_ * i_115_ >> 16;
					int i_125_ = (i_124_ - (484472729 * ((Class298_Sub32_Sub28) this).anInt9499) & Class250.anInt2753 * -901777799);
					i_113_ -= is_116_[i_125_];
					i_114_ -= is_117_[i_125_];
					i_115_ -= is_118_[i_125_];
					i_125_ = (++i_124_ + 484472729 * ((Class298_Sub32_Sub28) this).anInt9499 & Class250.anInt2753 * -901777799);
					i_113_ += is_116_[i_125_];
					i_114_ += is_117_[i_125_];
					i_115_ += is_118_[i_125_];
				}
				is_109_[(1615726345 * ((Class298_Sub32_Sub28) this).anInt9500 + i_110_ - i)] = is_112_;
			}
			int[] is_126_ = is[0];
			int[] is_127_ = is[1];
			int[] is_128_ = is[2];
			for (int i_129_ = 0; i_129_ < Class250.anInt2755 * -1474554145; i_129_++) {
				int i_130_ = 0;
				int i_131_ = 0;
				int i_132_ = 0;
				for (int i_133_ = 0; i_133_ < i_105_; i_133_++) {
					int[][] is_134_ = is_109_[i_133_];
					i_130_ += is_134_[0][i_129_];
					i_131_ += is_134_[1][i_129_];
					i_132_ += is_134_[2][i_129_];
				}
				is_126_[i_129_] = i_106_ * i_130_ >> 16;
				is_127_[i_129_] = i_106_ * i_131_ >> 16;
				is_128_[i_129_] = i_106_ * i_132_ >> 16;
			}
		}
		return is;
	}
}
