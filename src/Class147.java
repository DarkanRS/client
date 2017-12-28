/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class147 {
	static int anInt1722;
	static int anInt1723;
	static int anInt1724;
	static int anInt1725;
	static int anInt1726;
	static int anInt1727;
	static int[] anIntArray1728;
	static int anInt1729;

	public static void method2471(Class505 class505, int[] is, int i) {
		method2474(class505, is, 0, is.length, i, null, null);
	}

	static void method2472(int i, int i_0_) {
		if (i_0_ > i + 4) {
			int i_1_ = i;
			int i_2_ = anIntArray1728[i_1_];
			int i_3_ = anIntArray1728[i_1_ + 1];
			int i_4_ = anIntArray1728[i_1_ + 2];
			int i_5_ = anIntArray1728[i_1_ + 3];
			for (int i_6_ = i + 4; i_6_ < i_0_; i_6_ += 4) {
				int i_7_ = anIntArray1728[i_6_ + 1];
				if (i_7_ < i_3_) {
					anIntArray1728[i_1_] = anIntArray1728[i_6_];
					anIntArray1728[i_1_ + 1] = i_7_;
					anIntArray1728[i_1_ + 2] = anIntArray1728[i_6_ + 2];
					anIntArray1728[i_1_ + 3] = anIntArray1728[i_6_ + 3];
					i_1_ += 4;
					anIntArray1728[i_6_] = anIntArray1728[i_1_];
					anIntArray1728[i_6_ + 1] = anIntArray1728[i_1_ + 1];
					anIntArray1728[i_6_ + 2] = anIntArray1728[i_1_ + 2];
					anIntArray1728[i_6_ + 3] = anIntArray1728[i_1_ + 3];
				}
			}
			anIntArray1728[i_1_] = i_2_;
			anIntArray1728[i_1_ + 1] = i_3_;
			anIntArray1728[i_1_ + 2] = i_4_;
			anIntArray1728[i_1_ + 3] = i_5_;
			method2472(i, i_1_);
			method2472(i_1_ + 4, i_0_);
		}
	}

	static void method2473(int i, int i_8_) {
		for (/**/; i_8_ >= i + 8; i_8_ -= 4) {
			boolean bool = true;
			for (int i_9_ = i + 4; i_9_ < i_8_; i_9_ += 4) {
				int i_10_ = anIntArray1728[i_9_ - 4];
				int i_11_ = anIntArray1728[i_9_];
				if (i_10_ > i_11_) {
					bool = false;
					anIntArray1728[i_9_ - 4] = i_11_;
					anIntArray1728[i_9_] = i_10_;
					i_10_ = anIntArray1728[i_9_ - 2];
					anIntArray1728[i_9_ - 2] = anIntArray1728[i_9_ + 2];
					anIntArray1728[i_9_ + 2] = i_10_;
					i_10_ = anIntArray1728[i_9_ - 1];
					anIntArray1728[i_9_ - 1] = anIntArray1728[i_9_ + 3];
					anIntArray1728[i_9_ + 3] = i_10_;
				}
			}
			if (bool)
				break;
		}
	}

	static void method2474(Class505 class505, int[] is, int i, int i_12_, int i_13_, int[] is_14_, int[] is_15_) {
		int[] is_16_ = new int[4];
		class505.qa(is_16_);
		if (is_14_ != null && is_16_[3] - is_16_[1] != is_14_.length)
			throw new IllegalStateException();
		method2475();
		method2476(is, i, i_12_);
		method2477(is_16_[1]);
		while (method2478(is_16_[3])) {
			int i_17_ = anInt1725;
			int i_18_ = anInt1723;
			int i_19_ = anInt1727;
			if (is_14_ != null) {
				int i_20_ = i_19_ - is_16_[1];
				if (i_17_ < is_14_[i_20_] + is_16_[0])
					i_17_ = is_14_[i_20_] + is_16_[0];
				if (i_18_ > is_14_[i_20_] + is_15_[i_20_] + is_16_[0])
					i_18_ = is_14_[i_20_] + is_15_[i_20_] + is_16_[0];
				if (i_18_ - i_17_ <= 0)
					continue;
			}
			class505.XA(i_17_, i_19_, i_18_ - i_17_, i_13_, 1);
		}
	}

	static void method2475() {
		anInt1726 = 0;
	}

	static void method2476(int[] is, int i, int i_21_) {
		int i_22_ = anInt1726 + (i_21_ << 1);
		if (anIntArray1728 == null || anIntArray1728.length < i_22_) {
			int[] is_23_ = new int[i_22_];
			for (int i_24_ = 0; i_24_ < anInt1726; i_24_++)
				is_23_[i_24_] = anIntArray1728[i_24_];
			anIntArray1728 = is_23_;
		}
		i_21_ += i;
		int i_25_ = i_21_ - 2;
		for (int i_26_ = i; i_26_ < i_21_; i_26_ += 2) {
			int i_27_ = is[i_25_ + 1];
			int i_28_ = is[i_26_ + 1];
			if (i_27_ < i_28_) {
				anIntArray1728[anInt1726++] = is[i_25_];
				anIntArray1728[anInt1726++] = i_27_;
				anIntArray1728[anInt1726++] = is[i_26_];
				anIntArray1728[anInt1726++] = i_28_;
			} else if (i_28_ < i_27_) {
				anIntArray1728[anInt1726++] = is[i_26_];
				anIntArray1728[anInt1726++] = i_28_;
				anIntArray1728[anInt1726++] = is[i_25_];
				anIntArray1728[anInt1726++] = i_27_;
			}
			i_25_ = i_26_;
		}
	}

	static void method2477(int i) {
		if (anInt1726 < 0) {
			anInt1729 = 0;
			anInt1722 = 0;
			anInt1724 = 0;
			anInt1727 = 2147483646;
		} else {
			method2472(0, anInt1726);
			int i_29_ = anIntArray1728[1];
			if (i_29_ < i)
				i_29_ = i;
			int i_30_ = 0;
			int i_31_;
			for (i_31_ = 0; i_31_ < anInt1726; i_31_ += 4) {
				int i_32_ = anIntArray1728[i_31_ + 1];
				if (i_29_ < i_32_)
					break;
				int i_33_ = anIntArray1728[i_31_];
				int i_34_ = anIntArray1728[i_31_ + 2];
				int i_35_ = anIntArray1728[i_31_ + 3];
				int i_36_ = (i_34_ - i_33_ << 16) / (i_35_ - i_32_);
				int i_37_ = (i_33_ << 16) + 32768;
				anIntArray1728[i_31_] = i_37_ + (i_29_ - i_32_) * i_36_;
				anIntArray1728[i_31_ + 2] = i_36_;
			}
			anInt1724 = i_30_;
			anInt1722 = i_31_;
			anInt1729 = i_31_;
			anInt1727 = i_29_ - 1;
		}
	}

	static boolean method2478(int i) {
		int i_38_ = anInt1722;
		int i_39_ = anInt1729;
		int i_40_ = anInt1727;
		int i_41_;
		for (/**/; i_39_ >= i_38_; i_39_ = i_41_) {
			anInt1727 = ++i_40_;
			if (i_40_ >= i)
				return false;
			i_41_ = anInt1724;
			for (/**/; i_38_ < anInt1726; i_38_ += 4) {
				int i_42_ = anIntArray1728[i_38_ + 1];
				if (i_40_ < i_42_)
					break;
				int i_43_ = anIntArray1728[i_38_];
				int i_44_ = anIntArray1728[i_38_ + 2];
				int i_45_ = anIntArray1728[i_38_ + 3];
				int i_46_ = (i_44_ - i_43_ << 16) / (i_45_ - i_42_);
				int i_47_ = (i_43_ << 16) + 32768;
				anIntArray1728[i_38_] = i_47_;
				anIntArray1728[i_38_ + 2] = i_46_;
			}
			for (int i_48_ = i_41_; i_48_ < i_38_; i_48_ += 4) {
				int i_49_ = anIntArray1728[i_48_ + 3];
				if (i_40_ >= i_49_) {
					anIntArray1728[i_48_] = anIntArray1728[i_41_];
					anIntArray1728[i_48_ + 1] = anIntArray1728[i_41_ + 1];
					anIntArray1728[i_48_ + 2] = anIntArray1728[i_41_ + 2];
					anIntArray1728[i_48_ + 3] = anIntArray1728[i_41_ + 3];
					i_41_ += 4;
				}
			}
			if (i_41_ == anInt1726) {
				anInt1726 = 0;
				return false;
			}
			method2480(i_41_, i_38_);
			anInt1724 = i_41_;
			anInt1722 = i_38_;
		}
		anInt1725 = anIntArray1728[i_39_] >> 16;
		anInt1723 = anIntArray1728[i_39_ + 4] >> 16;
		anIntArray1728[i_39_] += anIntArray1728[i_39_ + 2];
		anIntArray1728[i_39_ + 4] += anIntArray1728[i_39_ + 6];
		i_39_ += 8;
		anInt1729 = i_39_;
		return true;
	}

	static void method2479(int i, int i_50_) {
		for (/**/; i_50_ >= i + 8; i_50_ -= 4) {
			boolean bool = true;
			for (int i_51_ = i + 4; i_51_ < i_50_; i_51_ += 4) {
				int i_52_ = anIntArray1728[i_51_ - 4];
				int i_53_ = anIntArray1728[i_51_];
				if (i_52_ > i_53_) {
					bool = false;
					anIntArray1728[i_51_ - 4] = i_53_;
					anIntArray1728[i_51_] = i_52_;
					i_52_ = anIntArray1728[i_51_ - 2];
					anIntArray1728[i_51_ - 2] = anIntArray1728[i_51_ + 2];
					anIntArray1728[i_51_ + 2] = i_52_;
					i_52_ = anIntArray1728[i_51_ - 1];
					anIntArray1728[i_51_ - 1] = anIntArray1728[i_51_ + 3];
					anIntArray1728[i_51_ + 3] = i_52_;
				}
			}
			if (bool)
				break;
		}
	}

	static void method2480(int i, int i_54_) {
		for (/**/; i_54_ >= i + 8; i_54_ -= 4) {
			boolean bool = true;
			for (int i_55_ = i + 4; i_55_ < i_54_; i_55_ += 4) {
				int i_56_ = anIntArray1728[i_55_ - 4];
				int i_57_ = anIntArray1728[i_55_];
				if (i_56_ > i_57_) {
					bool = false;
					anIntArray1728[i_55_ - 4] = i_57_;
					anIntArray1728[i_55_] = i_56_;
					i_56_ = anIntArray1728[i_55_ - 2];
					anIntArray1728[i_55_ - 2] = anIntArray1728[i_55_ + 2];
					anIntArray1728[i_55_ + 2] = i_56_;
					i_56_ = anIntArray1728[i_55_ - 1];
					anIntArray1728[i_55_ - 1] = anIntArray1728[i_55_ + 3];
					anIntArray1728[i_55_ + 3] = i_56_;
				}
			}
			if (bool)
				break;
		}
	}

	public static void method2481(Class505 class505, int[] is, int i) {
		method2474(class505, is, 0, is.length, i, null, null);
	}

	public static void method2482(Class505 class505, int[] is, int i) {
		method2474(class505, is, 0, is.length, i, null, null);
	}

	public static void method2483(Class505 class505, int[] is, int i, int[] is_58_, int[] is_59_) {
		method2474(class505, is, 0, is.length, i, is_58_, is_59_);
	}

	public static void method2484(Class505 class505, int[] is, int i, int[] is_60_, int[] is_61_) {
		method2474(class505, is, 0, is.length, i, is_60_, is_61_);
	}

	public static void method2485(Class505 class505, int[] is, int i, int[] is_62_, int[] is_63_) {
		method2474(class505, is, 0, is.length, i, is_62_, is_63_);
	}

	Class147() throws Throwable {
		throw new Error();
	}

	public static void method2486(Class505 class505, int[] is, int i, int[] is_64_, int[] is_65_) {
		method2474(class505, is, 0, is.length, i, is_64_, is_65_);
	}

	static void method2487(Class505 class505, int[] is, int i, int i_66_, int i_67_, int[] is_68_, int[] is_69_) {
		int[] is_70_ = new int[4];
		class505.qa(is_70_);
		if (is_68_ != null && is_70_[3] - is_70_[1] != is_68_.length)
			throw new IllegalStateException();
		method2475();
		method2476(is, i, i_66_);
		method2477(is_70_[1]);
		while (method2478(is_70_[3])) {
			int i_71_ = anInt1725;
			int i_72_ = anInt1723;
			int i_73_ = anInt1727;
			if (is_68_ != null) {
				int i_74_ = i_73_ - is_70_[1];
				if (i_71_ < is_68_[i_74_] + is_70_[0])
					i_71_ = is_68_[i_74_] + is_70_[0];
				if (i_72_ > is_68_[i_74_] + is_69_[i_74_] + is_70_[0])
					i_72_ = is_68_[i_74_] + is_69_[i_74_] + is_70_[0];
				if (i_72_ - i_71_ <= 0)
					continue;
			}
			class505.XA(i_71_, i_73_, i_72_ - i_71_, i_67_, 1);
		}
	}

	static void method2488(Class505 class505, int[] is, int i, int i_75_, int i_76_, int[] is_77_, int[] is_78_) {
		int[] is_79_ = new int[4];
		class505.qa(is_79_);
		if (is_77_ != null && is_79_[3] - is_79_[1] != is_77_.length)
			throw new IllegalStateException();
		method2475();
		method2476(is, i, i_75_);
		method2477(is_79_[1]);
		while (method2478(is_79_[3])) {
			int i_80_ = anInt1725;
			int i_81_ = anInt1723;
			int i_82_ = anInt1727;
			if (is_77_ != null) {
				int i_83_ = i_82_ - is_79_[1];
				if (i_80_ < is_77_[i_83_] + is_79_[0])
					i_80_ = is_77_[i_83_] + is_79_[0];
				if (i_81_ > is_77_[i_83_] + is_78_[i_83_] + is_79_[0])
					i_81_ = is_77_[i_83_] + is_78_[i_83_] + is_79_[0];
				if (i_81_ - i_80_ <= 0)
					continue;
			}
			class505.XA(i_80_, i_82_, i_81_ - i_80_, i_76_, 1);
		}
	}

	static void method2489(Class505 class505, int[] is, int i, int i_84_, int i_85_, int[] is_86_, int[] is_87_) {
		int[] is_88_ = new int[4];
		class505.qa(is_88_);
		if (is_86_ != null && is_88_[3] - is_88_[1] != is_86_.length)
			throw new IllegalStateException();
		method2475();
		method2476(is, i, i_84_);
		method2477(is_88_[1]);
		while (method2478(is_88_[3])) {
			int i_89_ = anInt1725;
			int i_90_ = anInt1723;
			int i_91_ = anInt1727;
			if (is_86_ != null) {
				int i_92_ = i_91_ - is_88_[1];
				if (i_89_ < is_86_[i_92_] + is_88_[0])
					i_89_ = is_86_[i_92_] + is_88_[0];
				if (i_90_ > is_86_[i_92_] + is_87_[i_92_] + is_88_[0])
					i_90_ = is_86_[i_92_] + is_87_[i_92_] + is_88_[0];
				if (i_90_ - i_89_ <= 0)
					continue;
			}
			class505.XA(i_89_, i_91_, i_90_ - i_89_, i_85_, 1);
		}
	}

	static void method2490(int i) {
		if (anInt1726 < 0) {
			anInt1729 = 0;
			anInt1722 = 0;
			anInt1724 = 0;
			anInt1727 = 2147483646;
		} else {
			method2472(0, anInt1726);
			int i_93_ = anIntArray1728[1];
			if (i_93_ < i)
				i_93_ = i;
			int i_94_ = 0;
			int i_95_;
			for (i_95_ = 0; i_95_ < anInt1726; i_95_ += 4) {
				int i_96_ = anIntArray1728[i_95_ + 1];
				if (i_93_ < i_96_)
					break;
				int i_97_ = anIntArray1728[i_95_];
				int i_98_ = anIntArray1728[i_95_ + 2];
				int i_99_ = anIntArray1728[i_95_ + 3];
				int i_100_ = (i_98_ - i_97_ << 16) / (i_99_ - i_96_);
				int i_101_ = (i_97_ << 16) + 32768;
				anIntArray1728[i_95_] = i_101_ + (i_93_ - i_96_) * i_100_;
				anIntArray1728[i_95_ + 2] = i_100_;
			}
			anInt1724 = i_94_;
			anInt1722 = i_95_;
			anInt1729 = i_95_;
			anInt1727 = i_93_ - 1;
		}
	}

	static void method2491() {
		anInt1726 = 0;
	}

	static void method2492() {
		anInt1726 = 0;
	}

	static void method2493() {
		anInt1726 = 0;
	}

	static void method2494(int[] is, int i, int i_102_) {
		int i_103_ = anInt1726 + (i_102_ << 1);
		if (anIntArray1728 == null || anIntArray1728.length < i_103_) {
			int[] is_104_ = new int[i_103_];
			for (int i_105_ = 0; i_105_ < anInt1726; i_105_++)
				is_104_[i_105_] = anIntArray1728[i_105_];
			anIntArray1728 = is_104_;
		}
		i_102_ += i;
		int i_106_ = i_102_ - 2;
		for (int i_107_ = i; i_107_ < i_102_; i_107_ += 2) {
			int i_108_ = is[i_106_ + 1];
			int i_109_ = is[i_107_ + 1];
			if (i_108_ < i_109_) {
				anIntArray1728[anInt1726++] = is[i_106_];
				anIntArray1728[anInt1726++] = i_108_;
				anIntArray1728[anInt1726++] = is[i_107_];
				anIntArray1728[anInt1726++] = i_109_;
			} else if (i_109_ < i_108_) {
				anIntArray1728[anInt1726++] = is[i_107_];
				anIntArray1728[anInt1726++] = i_109_;
				anIntArray1728[anInt1726++] = is[i_106_];
				anIntArray1728[anInt1726++] = i_108_;
			}
			i_106_ = i_107_;
		}
	}

	static boolean method2495(int i) {
		int i_110_ = anInt1722;
		int i_111_ = anInt1729;
		int i_112_ = anInt1727;
		int i_113_;
		for (/**/; i_111_ >= i_110_; i_111_ = i_113_) {
			anInt1727 = ++i_112_;
			if (i_112_ >= i)
				return false;
			i_113_ = anInt1724;
			for (/**/; i_110_ < anInt1726; i_110_ += 4) {
				int i_114_ = anIntArray1728[i_110_ + 1];
				if (i_112_ < i_114_)
					break;
				int i_115_ = anIntArray1728[i_110_];
				int i_116_ = anIntArray1728[i_110_ + 2];
				int i_117_ = anIntArray1728[i_110_ + 3];
				int i_118_ = (i_116_ - i_115_ << 16) / (i_117_ - i_114_);
				int i_119_ = (i_115_ << 16) + 32768;
				anIntArray1728[i_110_] = i_119_;
				anIntArray1728[i_110_ + 2] = i_118_;
			}
			for (int i_120_ = i_113_; i_120_ < i_110_; i_120_ += 4) {
				int i_121_ = anIntArray1728[i_120_ + 3];
				if (i_112_ >= i_121_) {
					anIntArray1728[i_120_] = anIntArray1728[i_113_];
					anIntArray1728[i_120_ + 1] = anIntArray1728[i_113_ + 1];
					anIntArray1728[i_120_ + 2] = anIntArray1728[i_113_ + 2];
					anIntArray1728[i_120_ + 3] = anIntArray1728[i_113_ + 3];
					i_113_ += 4;
				}
			}
			if (i_113_ == anInt1726) {
				anInt1726 = 0;
				return false;
			}
			method2480(i_113_, i_110_);
			anInt1724 = i_113_;
			anInt1722 = i_110_;
		}
		anInt1725 = anIntArray1728[i_111_] >> 16;
		anInt1723 = anIntArray1728[i_111_ + 4] >> 16;
		anIntArray1728[i_111_] += anIntArray1728[i_111_ + 2];
		anIntArray1728[i_111_ + 4] += anIntArray1728[i_111_ + 6];
		i_111_ += 8;
		anInt1729 = i_111_;
		return true;
	}

	static void method2496(int i) {
		if (anInt1726 < 0) {
			anInt1729 = 0;
			anInt1722 = 0;
			anInt1724 = 0;
			anInt1727 = 2147483646;
		} else {
			method2472(0, anInt1726);
			int i_122_ = anIntArray1728[1];
			if (i_122_ < i)
				i_122_ = i;
			int i_123_ = 0;
			int i_124_;
			for (i_124_ = 0; i_124_ < anInt1726; i_124_ += 4) {
				int i_125_ = anIntArray1728[i_124_ + 1];
				if (i_122_ < i_125_)
					break;
				int i_126_ = anIntArray1728[i_124_];
				int i_127_ = anIntArray1728[i_124_ + 2];
				int i_128_ = anIntArray1728[i_124_ + 3];
				int i_129_ = (i_127_ - i_126_ << 16) / (i_128_ - i_125_);
				int i_130_ = (i_126_ << 16) + 32768;
				anIntArray1728[i_124_] = i_130_ + (i_122_ - i_125_) * i_129_;
				anIntArray1728[i_124_ + 2] = i_129_;
			}
			anInt1724 = i_123_;
			anInt1722 = i_124_;
			anInt1729 = i_124_;
			anInt1727 = i_122_ - 1;
		}
	}

	static void method2497(int i, int i_131_) {
		for (/**/; i_131_ >= i + 8; i_131_ -= 4) {
			boolean bool = true;
			for (int i_132_ = i + 4; i_132_ < i_131_; i_132_ += 4) {
				int i_133_ = anIntArray1728[i_132_ - 4];
				int i_134_ = anIntArray1728[i_132_];
				if (i_133_ > i_134_) {
					bool = false;
					anIntArray1728[i_132_ - 4] = i_134_;
					anIntArray1728[i_132_] = i_133_;
					i_133_ = anIntArray1728[i_132_ - 2];
					anIntArray1728[i_132_ - 2] = anIntArray1728[i_132_ + 2];
					anIntArray1728[i_132_ + 2] = i_133_;
					i_133_ = anIntArray1728[i_132_ - 1];
					anIntArray1728[i_132_ - 1] = anIntArray1728[i_132_ + 3];
					anIntArray1728[i_132_ + 3] = i_133_;
				}
			}
			if (bool)
				break;
		}
	}

	static void method2498(int i, int i_135_) {
		if (i_135_ > i + 4) {
			int i_136_ = i;
			int i_137_ = anIntArray1728[i_136_];
			int i_138_ = anIntArray1728[i_136_ + 1];
			int i_139_ = anIntArray1728[i_136_ + 2];
			int i_140_ = anIntArray1728[i_136_ + 3];
			for (int i_141_ = i + 4; i_141_ < i_135_; i_141_ += 4) {
				int i_142_ = anIntArray1728[i_141_ + 1];
				if (i_142_ < i_138_) {
					anIntArray1728[i_136_] = anIntArray1728[i_141_];
					anIntArray1728[i_136_ + 1] = i_142_;
					anIntArray1728[i_136_ + 2] = anIntArray1728[i_141_ + 2];
					anIntArray1728[i_136_ + 3] = anIntArray1728[i_141_ + 3];
					i_136_ += 4;
					anIntArray1728[i_141_] = anIntArray1728[i_136_];
					anIntArray1728[i_141_ + 1] = anIntArray1728[i_136_ + 1];
					anIntArray1728[i_141_ + 2] = anIntArray1728[i_136_ + 2];
					anIntArray1728[i_141_ + 3] = anIntArray1728[i_136_ + 3];
				}
			}
			anIntArray1728[i_136_] = i_137_;
			anIntArray1728[i_136_ + 1] = i_138_;
			anIntArray1728[i_136_ + 2] = i_139_;
			anIntArray1728[i_136_ + 3] = i_140_;
			method2472(i, i_136_);
			method2472(i_136_ + 4, i_135_);
		}
	}

	static void method2499(int i) {
		if (anInt1726 < 0) {
			anInt1729 = 0;
			anInt1722 = 0;
			anInt1724 = 0;
			anInt1727 = 2147483646;
		} else {
			method2472(0, anInt1726);
			int i_143_ = anIntArray1728[1];
			if (i_143_ < i)
				i_143_ = i;
			int i_144_ = 0;
			int i_145_;
			for (i_145_ = 0; i_145_ < anInt1726; i_145_ += 4) {
				int i_146_ = anIntArray1728[i_145_ + 1];
				if (i_143_ < i_146_)
					break;
				int i_147_ = anIntArray1728[i_145_];
				int i_148_ = anIntArray1728[i_145_ + 2];
				int i_149_ = anIntArray1728[i_145_ + 3];
				int i_150_ = (i_148_ - i_147_ << 16) / (i_149_ - i_146_);
				int i_151_ = (i_147_ << 16) + 32768;
				anIntArray1728[i_145_] = i_151_ + (i_143_ - i_146_) * i_150_;
				anIntArray1728[i_145_ + 2] = i_150_;
			}
			anInt1724 = i_144_;
			anInt1722 = i_145_;
			anInt1729 = i_145_;
			anInt1727 = i_143_ - 1;
		}
	}

	static boolean method2500(int i) {
		int i_152_ = anInt1722;
		int i_153_ = anInt1729;
		int i_154_ = anInt1727;
		int i_155_;
		for (/**/; i_153_ >= i_152_; i_153_ = i_155_) {
			anInt1727 = ++i_154_;
			if (i_154_ >= i)
				return false;
			i_155_ = anInt1724;
			for (/**/; i_152_ < anInt1726; i_152_ += 4) {
				int i_156_ = anIntArray1728[i_152_ + 1];
				if (i_154_ < i_156_)
					break;
				int i_157_ = anIntArray1728[i_152_];
				int i_158_ = anIntArray1728[i_152_ + 2];
				int i_159_ = anIntArray1728[i_152_ + 3];
				int i_160_ = (i_158_ - i_157_ << 16) / (i_159_ - i_156_);
				int i_161_ = (i_157_ << 16) + 32768;
				anIntArray1728[i_152_] = i_161_;
				anIntArray1728[i_152_ + 2] = i_160_;
			}
			for (int i_162_ = i_155_; i_162_ < i_152_; i_162_ += 4) {
				int i_163_ = anIntArray1728[i_162_ + 3];
				if (i_154_ >= i_163_) {
					anIntArray1728[i_162_] = anIntArray1728[i_155_];
					anIntArray1728[i_162_ + 1] = anIntArray1728[i_155_ + 1];
					anIntArray1728[i_162_ + 2] = anIntArray1728[i_155_ + 2];
					anIntArray1728[i_162_ + 3] = anIntArray1728[i_155_ + 3];
					i_155_ += 4;
				}
			}
			if (i_155_ == anInt1726) {
				anInt1726 = 0;
				return false;
			}
			method2480(i_155_, i_152_);
			anInt1724 = i_155_;
			anInt1722 = i_152_;
		}
		anInt1725 = anIntArray1728[i_153_] >> 16;
		anInt1723 = anIntArray1728[i_153_ + 4] >> 16;
		anIntArray1728[i_153_] += anIntArray1728[i_153_ + 2];
		anIntArray1728[i_153_ + 4] += anIntArray1728[i_153_ + 6];
		i_153_ += 8;
		anInt1729 = i_153_;
		return true;
	}

	static boolean method2501(int i) {
		int i_164_ = anInt1722;
		int i_165_ = anInt1729;
		int i_166_ = anInt1727;
		int i_167_;
		for (/**/; i_165_ >= i_164_; i_165_ = i_167_) {
			anInt1727 = ++i_166_;
			if (i_166_ >= i)
				return false;
			i_167_ = anInt1724;
			for (/**/; i_164_ < anInt1726; i_164_ += 4) {
				int i_168_ = anIntArray1728[i_164_ + 1];
				if (i_166_ < i_168_)
					break;
				int i_169_ = anIntArray1728[i_164_];
				int i_170_ = anIntArray1728[i_164_ + 2];
				int i_171_ = anIntArray1728[i_164_ + 3];
				int i_172_ = (i_170_ - i_169_ << 16) / (i_171_ - i_168_);
				int i_173_ = (i_169_ << 16) + 32768;
				anIntArray1728[i_164_] = i_173_;
				anIntArray1728[i_164_ + 2] = i_172_;
			}
			for (int i_174_ = i_167_; i_174_ < i_164_; i_174_ += 4) {
				int i_175_ = anIntArray1728[i_174_ + 3];
				if (i_166_ >= i_175_) {
					anIntArray1728[i_174_] = anIntArray1728[i_167_];
					anIntArray1728[i_174_ + 1] = anIntArray1728[i_167_ + 1];
					anIntArray1728[i_174_ + 2] = anIntArray1728[i_167_ + 2];
					anIntArray1728[i_174_ + 3] = anIntArray1728[i_167_ + 3];
					i_167_ += 4;
				}
			}
			if (i_167_ == anInt1726) {
				anInt1726 = 0;
				return false;
			}
			method2480(i_167_, i_164_);
			anInt1724 = i_167_;
			anInt1722 = i_164_;
		}
		anInt1725 = anIntArray1728[i_165_] >> 16;
		anInt1723 = anIntArray1728[i_165_ + 4] >> 16;
		anIntArray1728[i_165_] += anIntArray1728[i_165_ + 2];
		anIntArray1728[i_165_ + 4] += anIntArray1728[i_165_ + 6];
		i_165_ += 8;
		anInt1729 = i_165_;
		return true;
	}

	static void method2502(int i, int i_176_) {
		if (i_176_ > i + 4) {
			int i_177_ = i;
			int i_178_ = anIntArray1728[i_177_];
			int i_179_ = anIntArray1728[i_177_ + 1];
			int i_180_ = anIntArray1728[i_177_ + 2];
			int i_181_ = anIntArray1728[i_177_ + 3];
			for (int i_182_ = i + 4; i_182_ < i_176_; i_182_ += 4) {
				int i_183_ = anIntArray1728[i_182_ + 1];
				if (i_183_ < i_179_) {
					anIntArray1728[i_177_] = anIntArray1728[i_182_];
					anIntArray1728[i_177_ + 1] = i_183_;
					anIntArray1728[i_177_ + 2] = anIntArray1728[i_182_ + 2];
					anIntArray1728[i_177_ + 3] = anIntArray1728[i_182_ + 3];
					i_177_ += 4;
					anIntArray1728[i_182_] = anIntArray1728[i_177_];
					anIntArray1728[i_182_ + 1] = anIntArray1728[i_177_ + 1];
					anIntArray1728[i_182_ + 2] = anIntArray1728[i_177_ + 2];
					anIntArray1728[i_182_ + 3] = anIntArray1728[i_177_ + 3];
				}
			}
			anIntArray1728[i_177_] = i_178_;
			anIntArray1728[i_177_ + 1] = i_179_;
			anIntArray1728[i_177_ + 2] = i_180_;
			anIntArray1728[i_177_ + 3] = i_181_;
			method2472(i, i_177_);
			method2472(i_177_ + 4, i_176_);
		}
	}

	static void method2503(int i, int i_184_) {
		if (i_184_ > i + 4) {
			int i_185_ = i;
			int i_186_ = anIntArray1728[i_185_];
			int i_187_ = anIntArray1728[i_185_ + 1];
			int i_188_ = anIntArray1728[i_185_ + 2];
			int i_189_ = anIntArray1728[i_185_ + 3];
			for (int i_190_ = i + 4; i_190_ < i_184_; i_190_ += 4) {
				int i_191_ = anIntArray1728[i_190_ + 1];
				if (i_191_ < i_187_) {
					anIntArray1728[i_185_] = anIntArray1728[i_190_];
					anIntArray1728[i_185_ + 1] = i_191_;
					anIntArray1728[i_185_ + 2] = anIntArray1728[i_190_ + 2];
					anIntArray1728[i_185_ + 3] = anIntArray1728[i_190_ + 3];
					i_185_ += 4;
					anIntArray1728[i_190_] = anIntArray1728[i_185_];
					anIntArray1728[i_190_ + 1] = anIntArray1728[i_185_ + 1];
					anIntArray1728[i_190_ + 2] = anIntArray1728[i_185_ + 2];
					anIntArray1728[i_190_ + 3] = anIntArray1728[i_185_ + 3];
				}
			}
			anIntArray1728[i_185_] = i_186_;
			anIntArray1728[i_185_ + 1] = i_187_;
			anIntArray1728[i_185_ + 2] = i_188_;
			anIntArray1728[i_185_ + 3] = i_189_;
			method2472(i, i_185_);
			method2472(i_185_ + 4, i_184_);
		}
	}

	public static void method2504(Class505 class505, int[] is, int i, int[] is_192_, int[] is_193_) {
		method2474(class505, is, 0, is.length, i, is_192_, is_193_);
	}

	public static void method2505(Class505 class505, int[] is, int i, int[] is_194_, int[] is_195_) {
		method2474(class505, is, 0, is.length, i, is_194_, is_195_);
	}

	static void method2506(int i, int i_196_) {
		for (/**/; i_196_ >= i + 8; i_196_ -= 4) {
			boolean bool = true;
			for (int i_197_ = i + 4; i_197_ < i_196_; i_197_ += 4) {
				int i_198_ = anIntArray1728[i_197_ - 4];
				int i_199_ = anIntArray1728[i_197_];
				if (i_198_ > i_199_) {
					bool = false;
					anIntArray1728[i_197_ - 4] = i_199_;
					anIntArray1728[i_197_] = i_198_;
					i_198_ = anIntArray1728[i_197_ - 2];
					anIntArray1728[i_197_ - 2] = anIntArray1728[i_197_ + 2];
					anIntArray1728[i_197_ + 2] = i_198_;
					i_198_ = anIntArray1728[i_197_ - 1];
					anIntArray1728[i_197_ - 1] = anIntArray1728[i_197_ + 3];
					anIntArray1728[i_197_ + 3] = i_198_;
				}
			}
			if (bool)
				break;
		}
	}

	static void method2507(int i, int i_200_) {
		if (i_200_ > i + 4) {
			int i_201_ = i;
			int i_202_ = anIntArray1728[i_201_];
			int i_203_ = anIntArray1728[i_201_ + 1];
			int i_204_ = anIntArray1728[i_201_ + 2];
			int i_205_ = anIntArray1728[i_201_ + 3];
			for (int i_206_ = i + 4; i_206_ < i_200_; i_206_ += 4) {
				int i_207_ = anIntArray1728[i_206_ + 1];
				if (i_207_ < i_203_) {
					anIntArray1728[i_201_] = anIntArray1728[i_206_];
					anIntArray1728[i_201_ + 1] = i_207_;
					anIntArray1728[i_201_ + 2] = anIntArray1728[i_206_ + 2];
					anIntArray1728[i_201_ + 3] = anIntArray1728[i_206_ + 3];
					i_201_ += 4;
					anIntArray1728[i_206_] = anIntArray1728[i_201_];
					anIntArray1728[i_206_ + 1] = anIntArray1728[i_201_ + 1];
					anIntArray1728[i_206_ + 2] = anIntArray1728[i_201_ + 2];
					anIntArray1728[i_206_ + 3] = anIntArray1728[i_201_ + 3];
				}
			}
			anIntArray1728[i_201_] = i_202_;
			anIntArray1728[i_201_ + 1] = i_203_;
			anIntArray1728[i_201_ + 2] = i_204_;
			anIntArray1728[i_201_ + 3] = i_205_;
			method2472(i, i_201_);
			method2472(i_201_ + 4, i_200_);
		}
	}

	static void method2508(int i) {
		if (anInt1726 < 0) {
			anInt1729 = 0;
			anInt1722 = 0;
			anInt1724 = 0;
			anInt1727 = 2147483646;
		} else {
			method2472(0, anInt1726);
			int i_208_ = anIntArray1728[1];
			if (i_208_ < i)
				i_208_ = i;
			int i_209_ = 0;
			int i_210_;
			for (i_210_ = 0; i_210_ < anInt1726; i_210_ += 4) {
				int i_211_ = anIntArray1728[i_210_ + 1];
				if (i_208_ < i_211_)
					break;
				int i_212_ = anIntArray1728[i_210_];
				int i_213_ = anIntArray1728[i_210_ + 2];
				int i_214_ = anIntArray1728[i_210_ + 3];
				int i_215_ = (i_213_ - i_212_ << 16) / (i_214_ - i_211_);
				int i_216_ = (i_212_ << 16) + 32768;
				anIntArray1728[i_210_] = i_216_ + (i_208_ - i_211_) * i_215_;
				anIntArray1728[i_210_ + 2] = i_215_;
			}
			anInt1724 = i_209_;
			anInt1722 = i_210_;
			anInt1729 = i_210_;
			anInt1727 = i_208_ - 1;
		}
	}

	static void method2509(Class505 class505, int[] is, int i, int i_217_, int i_218_, int[] is_219_, int[] is_220_) {
		int[] is_221_ = new int[4];
		class505.qa(is_221_);
		if (is_219_ != null && is_221_[3] - is_221_[1] != is_219_.length)
			throw new IllegalStateException();
		method2475();
		method2476(is, i, i_217_);
		method2477(is_221_[1]);
		while (method2478(is_221_[3])) {
			int i_222_ = anInt1725;
			int i_223_ = anInt1723;
			int i_224_ = anInt1727;
			if (is_219_ != null) {
				int i_225_ = i_224_ - is_221_[1];
				if (i_222_ < is_219_[i_225_] + is_221_[0])
					i_222_ = is_219_[i_225_] + is_221_[0];
				if (i_223_ > is_219_[i_225_] + is_220_[i_225_] + is_221_[0])
					i_223_ = is_219_[i_225_] + is_220_[i_225_] + is_221_[0];
				if (i_223_ - i_222_ <= 0)
					continue;
			}
			class505.XA(i_222_, i_224_, i_223_ - i_222_, i_218_, 1);
		}
	}
}
