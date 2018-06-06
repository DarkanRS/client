/* Class8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class8_Sub1 extends FontRenderer {
	byte[][] aByteArrayArray8509;
	int[] anIntArray8510;
	int[] anIntArray8511;
	int[] anIntArray8512;
	HardwareRenderer aClass505_Sub3_8513;
	int[] anIntArray8514;
	static int anInt8515;

	void UA(char c, int i, int i_0_, int i_1_, boolean bool) {
		if ((((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anIntArray8979) != null) {
			i += ((Class8_Sub1) this).anIntArray8514[c];
			i_0_ += ((Class8_Sub1) this).anIntArray8510[c];
			int i_2_ = ((Class8_Sub1) this).anIntArray8511[c];
			int i_3_ = ((Class8_Sub1) this).anIntArray8512[c];
			int i_4_ = (444800403 * ((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt8980);
			int i_5_ = i + i_4_ * i_0_;
			int i_6_ = i_4_ - i_2_;
			int i_7_ = 0;
			int i_8_ = 0;
			if (i_0_ < 1516535457 * (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt9009)) {
				int i_9_ = ((((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt9009 * 1516535457) - i_0_);
				i_3_ -= i_9_;
				i_0_ = 1516535457 * (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt9009);
				i_8_ += i_2_ * i_9_;
				i_5_ += i_4_ * i_9_;
			}
			if (i_0_ + i_3_ > (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8986) * 1383960921)
				i_3_ -= i_0_ + i_3_ - 1383960921 * (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt8986);
			if (i < 72550989 * (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983)) {
				int i_10_ = ((((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983) * 72550989 - i);
				i_2_ -= i_10_;
				i = (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983) * 72550989;
				i_8_ += i_10_;
				i_5_ += i_10_;
				i_7_ += i_10_;
				i_6_ += i_10_;
			}
			if (i + i_2_ > (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt9002) * -1710988237) {
				int i_11_ = i + i_2_ - -1710988237 * (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt9002);
				i_2_ -= i_11_;
				i_7_ += i_11_;
				i_6_ += i_11_;
			}
			if (i_2_ > 0 && i_3_ > 0) {
				if ((i_1_ & ~0xffffff) == -16777216)
					method13771(((Class8_Sub1) this).aByteArrayArray8509[c], (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anIntArray8979), i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
				else if (0 != (i_1_ & ~0xffffff))
					method13772(((Class8_Sub1) this).aByteArrayArray8509[c], (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anIntArray8979), i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
			}
		}
	}

	Class8_Sub1(HardwareRenderer class505_sub3, FontMetrics class414, Class91[] class91s, int[] is, int[] is_12_) {
		super(class505_sub3, class414);
		((Class8_Sub1) this).aClass505_Sub3_8513 = class505_sub3;
		((Class8_Sub1) this).anIntArray8511 = is;
		((Class8_Sub1) this).anIntArray8512 = is_12_;
		((Class8_Sub1) this).aByteArrayArray8509 = new byte[class91s.length][];
		((Class8_Sub1) this).anIntArray8510 = new int[class91s.length];
		((Class8_Sub1) this).anIntArray8514 = new int[class91s.length];
		for (int i = 0; i < class91s.length; i++) {
			((Class8_Sub1) this).aByteArrayArray8509[i] = class91s[i].aByteArray960;
			((Class8_Sub1) this).anIntArray8510[i] = class91s[i].anInt959;
			((Class8_Sub1) this).anIntArray8514[i] = class91s[i].anInt956;
		}
	}

	void method374(char c, int i, int i_13_, int i_14_, boolean bool, Class455 class455, int i_15_, int i_16_) {
		if (null != (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anIntArray8979)) {
			if (null == class455)
				UA(c, i, i_13_, i_14_, bool);
			else {
				i += ((Class8_Sub1) this).anIntArray8514[c];
				i_13_ += ((Class8_Sub1) this).anIntArray8510[c];
				int i_17_ = ((Class8_Sub1) this).anIntArray8511[c];
				int i_18_ = ((Class8_Sub1) this).anIntArray8512[c];
				int i_19_ = (444800403 * ((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8980);
				int i_20_ = i + i_19_ * i_13_;
				int i_21_ = i_19_ - i_17_;
				int i_22_ = 0;
				int i_23_ = 0;
				if (i_13_ < 1516535457 * (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt9009)) {
					int i_24_ = ((((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt9009) * 1516535457 - i_13_);
					i_18_ -= i_24_;
					i_13_ = 1516535457 * ((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt9009;
					i_23_ += i_17_ * i_24_;
					i_20_ += i_19_ * i_24_;
				}
				if (i_18_ + i_13_ > (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8986) * 1383960921)
					i_18_ -= (i_13_ + i_18_ - 1383960921 * ((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt8986);
				if (i < 72550989 * (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983)) {
					int i_25_ = (72550989 * (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt8983) - i);
					i_17_ -= i_25_;
					i = 72550989 * (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983);
					i_23_ += i_25_;
					i_20_ += i_25_;
					i_22_ += i_25_;
					i_21_ += i_25_;
				}
				if (i_17_ + i > (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt9002) * -1710988237) {
					int i_26_ = (i + i_17_ - -1710988237 * ((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt9002);
					i_17_ -= i_26_;
					i_22_ += i_26_;
					i_21_ += i_26_;
				}
				if (i_17_ > 0 && i_18_ > 0) {
					if ((i_14_ & ~0xffffff) == -16777216)
						method13773((((Class8_Sub1) this).aByteArrayArray8509[c]), (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anIntArray8979), i_14_, i_23_, i_20_, i_17_, i_18_, i_21_, i_22_, i, i_13_, ((Class8_Sub1) this).anIntArray8511[c], class455, i_15_, i_16_);
					else
						method13774((((Class8_Sub1) this).aByteArrayArray8509[c]), (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anIntArray8979), i_14_, i_23_, i_20_, i_17_, i_18_, i_21_, i_22_, i, i_13_, ((Class8_Sub1) this).anIntArray8511[c], class455, i_15_, i_16_);
				}
			}
		}
	}

	void method13771(byte[] is, int[] is_27_, int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_) {
		int i_34_ = -(i_30_ >> 2);
		i_30_ = -(i_30_ & 0x3);
		for (int i_35_ = -i_31_; i_35_ < 0; i_35_++) {
			for (int i_36_ = i_34_; i_36_ < 0; i_36_++) {
				if (is[i_28_++] != 0)
					is_27_[i_29_++] = i;
				else
					i_29_++;
				if (is[i_28_++] != 0)
					is_27_[i_29_++] = i;
				else
					i_29_++;
				if (is[i_28_++] != 0)
					is_27_[i_29_++] = i;
				else
					i_29_++;
				if (is[i_28_++] != 0)
					is_27_[i_29_++] = i;
				else
					i_29_++;
			}
			for (int i_37_ = i_30_; i_37_ < 0; i_37_++) {
				if (is[i_28_++] != 0)
					is_27_[i_29_++] = i;
				else
					i_29_++;
			}
			i_29_ += i_32_;
			i_28_ += i_33_;
		}
	}

	void method13772(byte[] is, int[] is_38_, int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_) {
		int i_45_ = i >>> 24;
		int i_46_ = 255 - i_45_;
		for (int i_47_ = -i_42_; i_47_ < 0; i_47_++) {
			for (int i_48_ = -i_41_; i_48_ < 0; i_48_++) {
				if (is[i_39_++] != 0) {
					int i_49_ = ((((i & 0xff00) * i_45_ & 0xff0000) + (i_45_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_50_ = is_38_[i_40_];
					is_38_[i_40_++] = ((((i_50_ & 0xff00) * i_46_ & 0xff0000) + (i_46_ * (i_50_ & 0xff00ff) & ~0xff00ff)) >> 8) + i_49_;
				} else
					i_40_++;
			}
			i_40_ += i_43_;
			i_39_ += i_44_;
		}
	}

	void method13773(byte[] is, int[] is_51_, int i, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, Class455 class455, int i_61_, int i_62_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_63_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_64_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_65_ = i_59_;
		if (i_62_ > i_65_) {
			i_65_ = i_62_;
			i_53_ += ((i_62_ - i_59_) * (444800403 * (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt8980)));
			i_52_ += (i_62_ - i_59_) * i_60_;
		}
		int i_66_ = (i_62_ + is_63_.length < i_59_ + i_55_ ? is_63_.length + i_62_ : i_59_ + i_55_);
		for (int i_67_ = i_65_; i_67_ < i_66_; i_67_++) {
			int i_68_ = i_61_ + is_63_[i_67_ - i_62_];
			int i_69_ = is_64_[i_67_ - i_62_];
			int i_70_ = i_54_;
			if (i_58_ > i_68_) {
				int i_71_ = i_58_ - i_68_;
				if (i_71_ >= i_69_) {
					i_52_ += i_57_ + i_54_;
					i_53_ += i_54_ + i_56_;
					continue;
				}
				i_69_ -= i_71_;
			} else {
				int i_72_ = i_68_ - i_58_;
				if (i_72_ >= i_54_) {
					i_52_ += i_57_ + i_54_;
					i_53_ += i_56_ + i_54_;
					continue;
				}
				i_52_ += i_72_;
				i_70_ -= i_72_;
				i_53_ += i_72_;
			}
			int i_73_ = 0;
			if (i_70_ < i_69_)
				i_69_ = i_70_;
			else
				i_73_ = i_70_ - i_69_;
			for (int i_74_ = 0; i_74_ < i_69_; i_74_++) {
				if (is[i_52_++] != 0)
					is_51_[i_53_++] = i;
				else
					i_53_++;
			}
			i_52_ += i_73_ + i_57_;
			i_53_ += i_73_ + i_56_;
		}
	}

	void method13774(byte[] is, int[] is_75_, int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, Class455 class455, int i_85_, int i_86_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_87_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_88_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_89_ = (i_82_ - (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983) * 72550989);
		int i_90_ = i_83_;
		if (i_86_ > i_90_) {
			i_90_ = i_86_;
			i_77_ += (i_86_ - i_83_) * ((((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt8980) * 444800403);
			i_76_ += (i_86_ - i_83_) * i_84_;
		}
		int i_91_ = (i_86_ + is_87_.length < i_79_ + i_83_ ? is_87_.length + i_86_ : i_79_ + i_83_);
		int i_92_ = i >>> 24;
		int i_93_ = 255 - i_92_;
		for (int i_94_ = i_90_; i_94_ < i_91_; i_94_++) {
			int i_95_ = i_85_ + is_87_[i_94_ - i_86_];
			int i_96_ = is_88_[i_94_ - i_86_];
			int i_97_ = i_78_;
			if (i_89_ > i_95_) {
				int i_98_ = i_89_ - i_95_;
				if (i_98_ >= i_96_) {
					i_76_ += i_81_ + i_78_;
					i_77_ += i_78_ + i_80_;
					continue;
				}
				i_96_ -= i_98_;
			} else {
				int i_99_ = i_95_ - i_89_;
				if (i_99_ >= i_78_) {
					i_76_ += i_81_ + i_78_;
					i_77_ += i_80_ + i_78_;
					continue;
				}
				i_76_ += i_99_;
				i_97_ -= i_99_;
				i_77_ += i_99_;
			}
			int i_100_ = 0;
			if (i_97_ < i_96_)
				i_96_ = i_97_;
			else
				i_100_ = i_97_ - i_96_;
			for (int i_101_ = -i_96_; i_101_ < 0; i_101_++) {
				if (is[i_76_++] != 0) {
					int i_102_ = (((i_92_ * (i & 0xff00) & 0xff0000) + (i_92_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_103_ = is_75_[i_77_];
					is_75_[i_77_++] = (((i_93_ * (i_103_ & 0xff00) & 0xff0000) + ((i_103_ & 0xff00ff) * i_93_ & ~0xff00ff)) >> 8) + i_102_;
				} else
					i_77_++;
			}
			i_76_ += i_81_ + i_100_;
			i_77_ += i_80_ + i_100_;
		}
	}

	void method362(char c, int i, int i_104_, int i_105_, boolean bool, Class455 class455, int i_106_, int i_107_) {
		if (null != (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anIntArray8979)) {
			if (null == class455)
				UA(c, i, i_104_, i_105_, bool);
			else {
				i += ((Class8_Sub1) this).anIntArray8514[c];
				i_104_ += ((Class8_Sub1) this).anIntArray8510[c];
				int i_108_ = ((Class8_Sub1) this).anIntArray8511[c];
				int i_109_ = ((Class8_Sub1) this).anIntArray8512[c];
				int i_110_ = (444800403 * ((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8980);
				int i_111_ = i + i_110_ * i_104_;
				int i_112_ = i_110_ - i_108_;
				int i_113_ = 0;
				int i_114_ = 0;
				if (i_104_ < 1516535457 * (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt9009)) {
					int i_115_ = ((((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt9009) * 1516535457 - i_104_);
					i_109_ -= i_115_;
					i_104_ = 1516535457 * ((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt9009;
					i_114_ += i_108_ * i_115_;
					i_111_ += i_110_ * i_115_;
				}
				if (i_109_ + i_104_ > (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt8986) * 1383960921)
					i_109_ -= (i_104_ + i_109_ - 1383960921 * ((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt8986);
				if (i < 72550989 * (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983)) {
					int i_116_ = (72550989 * (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt8983) - i);
					i_108_ -= i_116_;
					i = 72550989 * (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983);
					i_114_ += i_116_;
					i_111_ += i_116_;
					i_113_ += i_116_;
					i_112_ += i_116_;
				}
				if (i_108_ + i > (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt9002) * -1710988237) {
					int i_117_ = (i + i_108_ - -1710988237 * ((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt9002);
					i_108_ -= i_117_;
					i_113_ += i_117_;
					i_112_ += i_117_;
				}
				if (i_108_ > 0 && i_109_ > 0) {
					if ((i_105_ & ~0xffffff) == -16777216)
						method13773((((Class8_Sub1) this).aByteArrayArray8509[c]), (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anIntArray8979), i_105_, i_114_, i_111_, i_108_, i_109_, i_112_, i_113_, i, i_104_, ((Class8_Sub1) this).anIntArray8511[c], class455, i_106_, i_107_);
					else
						method13774((((Class8_Sub1) this).aByteArrayArray8509[c]), (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anIntArray8979), i_105_, i_114_, i_111_, i_108_, i_109_, i_112_, i_113_, i, i_104_, ((Class8_Sub1) this).anIntArray8511[c], class455, i_106_, i_107_);
				}
			}
		}
	}

	void c(char c, int i, int i_118_, int i_119_, boolean bool) {
		if ((((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anIntArray8979) != null) {
			i += ((Class8_Sub1) this).anIntArray8514[c];
			i_118_ += ((Class8_Sub1) this).anIntArray8510[c];
			int i_120_ = ((Class8_Sub1) this).anIntArray8511[c];
			int i_121_ = ((Class8_Sub1) this).anIntArray8512[c];
			int i_122_ = 444800403 * (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt8980);
			int i_123_ = i + i_122_ * i_118_;
			int i_124_ = i_122_ - i_120_;
			int i_125_ = 0;
			int i_126_ = 0;
			if (i_118_ < 1516535457 * (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt9009)) {
				int i_127_ = ((((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt9009) * 1516535457 - i_118_);
				i_121_ -= i_127_;
				i_118_ = 1516535457 * (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt9009);
				i_126_ += i_120_ * i_127_;
				i_123_ += i_122_ * i_127_;
			}
			if (i_118_ + i_121_ > (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8986) * 1383960921)
				i_121_ -= i_118_ + i_121_ - 1383960921 * (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt8986);
			if (i < 72550989 * (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983)) {
				int i_128_ = ((((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983) * 72550989 - i);
				i_120_ -= i_128_;
				i = (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983) * 72550989;
				i_126_ += i_128_;
				i_123_ += i_128_;
				i_125_ += i_128_;
				i_124_ += i_128_;
			}
			if (i + i_120_ > (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt9002) * -1710988237) {
				int i_129_ = (i + i_120_ - -1710988237 * ((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt9002);
				i_120_ -= i_129_;
				i_125_ += i_129_;
				i_124_ += i_129_;
			}
			if (i_120_ > 0 && i_121_ > 0) {
				if ((i_119_ & ~0xffffff) == -16777216)
					method13771(((Class8_Sub1) this).aByteArrayArray8509[c], (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anIntArray8979), i_119_, i_126_, i_123_, i_120_, i_121_, i_124_, i_125_);
				else if (0 != (i_119_ & ~0xffffff))
					method13772(((Class8_Sub1) this).aByteArrayArray8509[c], (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anIntArray8979), i_119_, i_126_, i_123_, i_120_, i_121_, i_124_, i_125_);
			}
		}
	}

	void t(char c, int i, int i_130_, int i_131_, boolean bool) {
		if ((((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anIntArray8979) != null) {
			i += ((Class8_Sub1) this).anIntArray8514[c];
			i_130_ += ((Class8_Sub1) this).anIntArray8510[c];
			int i_132_ = ((Class8_Sub1) this).anIntArray8511[c];
			int i_133_ = ((Class8_Sub1) this).anIntArray8512[c];
			int i_134_ = 444800403 * (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt8980);
			int i_135_ = i + i_134_ * i_130_;
			int i_136_ = i_134_ - i_132_;
			int i_137_ = 0;
			int i_138_ = 0;
			if (i_130_ < 1516535457 * (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt9009)) {
				int i_139_ = ((((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt9009) * 1516535457 - i_130_);
				i_133_ -= i_139_;
				i_130_ = 1516535457 * (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt9009);
				i_138_ += i_132_ * i_139_;
				i_135_ += i_134_ * i_139_;
			}
			if (i_130_ + i_133_ > (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8986) * 1383960921)
				i_133_ -= i_130_ + i_133_ - 1383960921 * (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt8986);
			if (i < 72550989 * (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983)) {
				int i_140_ = ((((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983) * 72550989 - i);
				i_132_ -= i_140_;
				i = (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983) * 72550989;
				i_138_ += i_140_;
				i_135_ += i_140_;
				i_137_ += i_140_;
				i_136_ += i_140_;
			}
			if (i + i_132_ > (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt9002) * -1710988237) {
				int i_141_ = (i + i_132_ - -1710988237 * ((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt9002);
				i_132_ -= i_141_;
				i_137_ += i_141_;
				i_136_ += i_141_;
			}
			if (i_132_ > 0 && i_133_ > 0) {
				if ((i_131_ & ~0xffffff) == -16777216)
					method13771(((Class8_Sub1) this).aByteArrayArray8509[c], (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anIntArray8979), i_131_, i_138_, i_135_, i_132_, i_133_, i_136_, i_137_);
				else if (0 != (i_131_ & ~0xffffff))
					method13772(((Class8_Sub1) this).aByteArrayArray8509[c], (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anIntArray8979), i_131_, i_138_, i_135_, i_132_, i_133_, i_136_, i_137_);
			}
		}
	}

	void method13775(byte[] is, int[] is_142_, int i, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_) {
		int i_149_ = -(i_145_ >> 2);
		i_145_ = -(i_145_ & 0x3);
		for (int i_150_ = -i_146_; i_150_ < 0; i_150_++) {
			for (int i_151_ = i_149_; i_151_ < 0; i_151_++) {
				if (is[i_143_++] != 0)
					is_142_[i_144_++] = i;
				else
					i_144_++;
				if (is[i_143_++] != 0)
					is_142_[i_144_++] = i;
				else
					i_144_++;
				if (is[i_143_++] != 0)
					is_142_[i_144_++] = i;
				else
					i_144_++;
				if (is[i_143_++] != 0)
					is_142_[i_144_++] = i;
				else
					i_144_++;
			}
			for (int i_152_ = i_145_; i_152_ < 0; i_152_++) {
				if (is[i_143_++] != 0)
					is_142_[i_144_++] = i;
				else
					i_144_++;
			}
			i_144_ += i_147_;
			i_143_ += i_148_;
		}
	}

	void method13776(byte[] is, int[] is_153_, int i, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_) {
		int i_160_ = -(i_156_ >> 2);
		i_156_ = -(i_156_ & 0x3);
		for (int i_161_ = -i_157_; i_161_ < 0; i_161_++) {
			for (int i_162_ = i_160_; i_162_ < 0; i_162_++) {
				if (is[i_154_++] != 0)
					is_153_[i_155_++] = i;
				else
					i_155_++;
				if (is[i_154_++] != 0)
					is_153_[i_155_++] = i;
				else
					i_155_++;
				if (is[i_154_++] != 0)
					is_153_[i_155_++] = i;
				else
					i_155_++;
				if (is[i_154_++] != 0)
					is_153_[i_155_++] = i;
				else
					i_155_++;
			}
			for (int i_163_ = i_156_; i_163_ < 0; i_163_++) {
				if (is[i_154_++] != 0)
					is_153_[i_155_++] = i;
				else
					i_155_++;
			}
			i_155_ += i_158_;
			i_154_ += i_159_;
		}
	}

	void method13777(byte[] is, int[] is_164_, int i, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_) {
		int i_171_ = i >>> 24;
		int i_172_ = 255 - i_171_;
		for (int i_173_ = -i_168_; i_173_ < 0; i_173_++) {
			for (int i_174_ = -i_167_; i_174_ < 0; i_174_++) {
				if (is[i_165_++] != 0) {
					int i_175_ = ((((i & 0xff00) * i_171_ & 0xff0000) + (i_171_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_176_ = is_164_[i_166_];
					is_164_[i_166_++] = ((((i_176_ & 0xff00) * i_172_ & 0xff0000) + (i_172_ * (i_176_ & 0xff00ff) & ~0xff00ff)) >> 8) + i_175_;
				} else
					i_166_++;
			}
			i_166_ += i_169_;
			i_165_ += i_170_;
		}
	}

	void method13778(byte[] is, int[] is_177_, int i, int i_178_, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_, int i_184_, int i_185_, int i_186_, Class455 class455, int i_187_, int i_188_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_189_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_190_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_191_ = i_185_;
		if (i_188_ > i_191_) {
			i_191_ = i_188_;
			i_179_ += ((i_188_ - i_185_) * (444800403 * (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt8980)));
			i_178_ += (i_188_ - i_185_) * i_186_;
		}
		int i_192_ = (i_188_ + is_189_.length < i_185_ + i_181_ ? is_189_.length + i_188_ : i_185_ + i_181_);
		for (int i_193_ = i_191_; i_193_ < i_192_; i_193_++) {
			int i_194_ = i_187_ + is_189_[i_193_ - i_188_];
			int i_195_ = is_190_[i_193_ - i_188_];
			int i_196_ = i_180_;
			if (i_184_ > i_194_) {
				int i_197_ = i_184_ - i_194_;
				if (i_197_ >= i_195_) {
					i_178_ += i_183_ + i_180_;
					i_179_ += i_180_ + i_182_;
					continue;
				}
				i_195_ -= i_197_;
			} else {
				int i_198_ = i_194_ - i_184_;
				if (i_198_ >= i_180_) {
					i_178_ += i_183_ + i_180_;
					i_179_ += i_182_ + i_180_;
					continue;
				}
				i_178_ += i_198_;
				i_196_ -= i_198_;
				i_179_ += i_198_;
			}
			int i_199_ = 0;
			if (i_196_ < i_195_)
				i_195_ = i_196_;
			else
				i_199_ = i_196_ - i_195_;
			for (int i_200_ = 0; i_200_ < i_195_; i_200_++) {
				if (is[i_178_++] != 0)
					is_177_[i_179_++] = i;
				else
					i_179_++;
			}
			i_178_ += i_199_ + i_183_;
			i_179_ += i_199_ + i_182_;
		}
	}

	void method13779(byte[] is, int[] is_201_, int i, int i_202_, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_, int i_209_, int i_210_, Class455 class455, int i_211_, int i_212_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_213_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_214_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_215_ = i_209_;
		if (i_212_ > i_215_) {
			i_215_ = i_212_;
			i_203_ += ((i_212_ - i_209_) * (444800403 * (((HardwareRenderer) (((Class8_Sub1) this).aClass505_Sub3_8513)).anInt8980)));
			i_202_ += (i_212_ - i_209_) * i_210_;
		}
		int i_216_ = (i_212_ + is_213_.length < i_209_ + i_205_ ? is_213_.length + i_212_ : i_209_ + i_205_);
		for (int i_217_ = i_215_; i_217_ < i_216_; i_217_++) {
			int i_218_ = i_211_ + is_213_[i_217_ - i_212_];
			int i_219_ = is_214_[i_217_ - i_212_];
			int i_220_ = i_204_;
			if (i_208_ > i_218_) {
				int i_221_ = i_208_ - i_218_;
				if (i_221_ >= i_219_) {
					i_202_ += i_207_ + i_204_;
					i_203_ += i_204_ + i_206_;
					continue;
				}
				i_219_ -= i_221_;
			} else {
				int i_222_ = i_218_ - i_208_;
				if (i_222_ >= i_204_) {
					i_202_ += i_207_ + i_204_;
					i_203_ += i_206_ + i_204_;
					continue;
				}
				i_202_ += i_222_;
				i_220_ -= i_222_;
				i_203_ += i_222_;
			}
			int i_223_ = 0;
			if (i_220_ < i_219_)
				i_219_ = i_220_;
			else
				i_223_ = i_220_ - i_219_;
			for (int i_224_ = 0; i_224_ < i_219_; i_224_++) {
				if (is[i_202_++] != 0)
					is_201_[i_203_++] = i;
				else
					i_203_++;
			}
			i_202_ += i_223_ + i_207_;
			i_203_ += i_223_ + i_206_;
		}
	}

	void method13780(byte[] is, int[] is_225_, int i, int i_226_, int i_227_, int i_228_, int i_229_, int i_230_, int i_231_, int i_232_, int i_233_, int i_234_, Class455 class455, int i_235_, int i_236_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_237_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_238_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_239_ = (i_232_ - (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983) * 72550989);
		int i_240_ = i_233_;
		if (i_236_ > i_240_) {
			i_240_ = i_236_;
			i_227_ += ((i_236_ - i_233_) * (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8980 * 444800403));
			i_226_ += (i_236_ - i_233_) * i_234_;
		}
		int i_241_ = (i_236_ + is_237_.length < i_229_ + i_233_ ? is_237_.length + i_236_ : i_229_ + i_233_);
		int i_242_ = i >>> 24;
		int i_243_ = 255 - i_242_;
		for (int i_244_ = i_240_; i_244_ < i_241_; i_244_++) {
			int i_245_ = i_235_ + is_237_[i_244_ - i_236_];
			int i_246_ = is_238_[i_244_ - i_236_];
			int i_247_ = i_228_;
			if (i_239_ > i_245_) {
				int i_248_ = i_239_ - i_245_;
				if (i_248_ >= i_246_) {
					i_226_ += i_231_ + i_228_;
					i_227_ += i_228_ + i_230_;
					continue;
				}
				i_246_ -= i_248_;
			} else {
				int i_249_ = i_245_ - i_239_;
				if (i_249_ >= i_228_) {
					i_226_ += i_231_ + i_228_;
					i_227_ += i_230_ + i_228_;
					continue;
				}
				i_226_ += i_249_;
				i_247_ -= i_249_;
				i_227_ += i_249_;
			}
			int i_250_ = 0;
			if (i_247_ < i_246_)
				i_246_ = i_247_;
			else
				i_250_ = i_247_ - i_246_;
			for (int i_251_ = -i_246_; i_251_ < 0; i_251_++) {
				if (is[i_226_++] != 0) {
					int i_252_ = (((i_242_ * (i & 0xff00) & 0xff0000) + (i_242_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_253_ = is_225_[i_227_];
					is_225_[i_227_++] = (((i_243_ * (i_253_ & 0xff00) & 0xff0000) + ((i_253_ & 0xff00ff) * i_243_ & ~0xff00ff)) >> 8) + i_252_;
				} else
					i_227_++;
			}
			i_226_ += i_231_ + i_250_;
			i_227_ += i_230_ + i_250_;
		}
	}

	void method13781(byte[] is, int[] is_254_, int i, int i_255_, int i_256_, int i_257_, int i_258_, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_, Class455 class455, int i_264_, int i_265_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_266_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_267_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_268_ = (i_261_ - (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8983) * 72550989);
		int i_269_ = i_262_;
		if (i_265_ > i_269_) {
			i_269_ = i_265_;
			i_256_ += ((i_265_ - i_262_) * (((HardwareRenderer) ((Class8_Sub1) this).aClass505_Sub3_8513).anInt8980 * 444800403));
			i_255_ += (i_265_ - i_262_) * i_263_;
		}
		int i_270_ = (i_265_ + is_266_.length < i_258_ + i_262_ ? is_266_.length + i_265_ : i_258_ + i_262_);
		int i_271_ = i >>> 24;
		int i_272_ = 255 - i_271_;
		for (int i_273_ = i_269_; i_273_ < i_270_; i_273_++) {
			int i_274_ = i_264_ + is_266_[i_273_ - i_265_];
			int i_275_ = is_267_[i_273_ - i_265_];
			int i_276_ = i_257_;
			if (i_268_ > i_274_) {
				int i_277_ = i_268_ - i_274_;
				if (i_277_ >= i_275_) {
					i_255_ += i_260_ + i_257_;
					i_256_ += i_257_ + i_259_;
					continue;
				}
				i_275_ -= i_277_;
			} else {
				int i_278_ = i_274_ - i_268_;
				if (i_278_ >= i_257_) {
					i_255_ += i_260_ + i_257_;
					i_256_ += i_259_ + i_257_;
					continue;
				}
				i_255_ += i_278_;
				i_276_ -= i_278_;
				i_256_ += i_278_;
			}
			int i_279_ = 0;
			if (i_276_ < i_275_)
				i_275_ = i_276_;
			else
				i_279_ = i_276_ - i_275_;
			for (int i_280_ = -i_275_; i_280_ < 0; i_280_++) {
				if (is[i_255_++] != 0) {
					int i_281_ = (((i_271_ * (i & 0xff00) & 0xff0000) + (i_271_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_282_ = is_254_[i_256_];
					is_254_[i_256_++] = (((i_272_ * (i_282_ & 0xff00) & 0xff0000) + ((i_282_ & 0xff00ff) * i_272_ & ~0xff00ff)) >> 8) + i_281_;
				} else
					i_256_++;
			}
			i_255_ += i_260_ + i_279_;
			i_256_ += i_259_ + i_279_;
		}
	}

	static int method13782(int i, int i_283_, int i_284_) {
		int i_285_;
		if (i_283_ > 20077) {
			Defaults6Loader.method11248(1158077099);
			i_285_ = 4;
		} else if (i_283_ > 10021) {
			Class282_Sub40.method13300(-686902012);
			i_285_ = 3;
		} else if (i_283_ > 5002) {
			Class119.method2077(213665049);
			i_285_ = 2;
		} else {
			Class282_Sub20_Sub25.method15393(true, 2142081761);
			i_285_ = 1;
		}
		if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1837910677) != i) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), i, -1336804214);
			Class538.method11500(i, false, (byte) 24);
		} else
			Class393.aClass282_Sub54_4783.method13505((Class393.aClass282_Sub54_4783.aClass468_Sub18_8230), true, -1708960758);
		Class190.method3148((byte) 58);
		return i_285_;
	}

	static void method13783(int i) {
		Class468_Sub20.anIntArray7920 = Class492.method8266(2048, 35, 8, 8, 4, 0.4F, true, (byte) -23);
	}

	static void method13784(int i, int i_286_) {
		if (368603503 * Class9.lobbyStage == 140)
			Class9.anInt72 = i * -802411275;
		else if (Class9.lobbyStage * 368603503 == 273)
			Class9.anInt106 = 2008085333 * i;
	}
}
