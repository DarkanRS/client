
/* Class8_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class8_Sub3 extends FontRenderer {
	byte[][] aByteArrayArray8967;
	HardwareRenderer aClass505_Sub3_8968;
	int[] anIntArray8969;
	int[] anIntArray8970;
	int[] anIntArray8971;
	int[] anIntArray8972;
	int[] anIntArray8973;

	void method14323(byte[] is, int[] is_0_, int[] is_1_, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, Class455 class455, int i_11_, int i_12_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_13_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_14_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_15_ = i_8_ - 72550989 * (((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt8983);
		int i_16_ = i_9_;
		if (i_12_ > i_16_) {
			i_16_ = i_12_;
			i_3_ += (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8980) * 444800403 * (i_12_ - i_9_);
			i_2_ += (i_12_ - i_9_) * i_10_;
		}
		int i_17_ = (i_12_ + is_13_.length < i_5_ + i_9_ ? i_12_ + is_13_.length : i_5_ + i_9_);
		boolean bool = false;
		for (int i_18_ = i_16_; i_18_ < i_17_; i_18_++) {
			int i_19_ = i_11_ + is_13_[i_18_ - i_12_];
			int i_20_ = is_14_[i_18_ - i_12_];
			int i_21_ = i_4_;
			if (i_15_ > i_19_) {
				int i_22_ = i_15_ - i_19_;
				if (i_22_ >= i_20_) {
					i_2_ += i_4_ + i_7_;
					i_3_ += i_6_ + i_4_;
					continue;
				}
				i_20_ -= i_22_;
			} else {
				int i_23_ = i_19_ - i_15_;
				if (i_23_ >= i_4_) {
					i_2_ += i_7_ + i_4_;
					i_3_ += i_6_ + i_4_;
					continue;
				}
				i_2_ += i_23_;
				i_21_ -= i_23_;
				i_3_ += i_23_;
			}
			int i_24_ = 0;
			if (i_21_ < i_20_)
				i_20_ = i_21_;
			else
				i_24_ = i_21_ - i_20_;
			for (int i_25_ = -i_20_; i_25_ < 0; i_25_++) {
				int i_26_;
				if ((i_26_ = is[i_2_++]) != 0)
					is_0_[i_3_++] = is_1_[i_26_ & 0xff];
				else
					i_3_++;
			}
			i_2_ += i_7_ + i_24_;
			i_3_ += i_24_ + i_6_;
		}
	}

	void UA(char c, int i, int i_27_, int i_28_, boolean bool) {
		if (null != (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anIntArray8979)) {
			i += ((Class8_Sub3) this).anIntArray8973[c];
			i_27_ += ((Class8_Sub3) this).anIntArray8972[c];
			int i_29_ = ((Class8_Sub3) this).anIntArray8969[c];
			int i_30_ = ((Class8_Sub3) this).anIntArray8971[c];
			int i_31_ = (444800403 * ((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt8980);
			int i_32_ = i_27_ * i_31_ + i;
			int i_33_ = i_31_ - i_29_;
			int i_34_ = 0;
			int i_35_ = 0;
			if (i_27_ < 1516535457 * (((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt9009)) {
				int i_36_ = (1516535457 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt9009) - i_27_);
				i_30_ -= i_36_;
				i_27_ = 1516535457 * (((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt9009);
				i_35_ += i_36_ * i_29_;
				i_32_ += i_36_ * i_31_;
			}
			if (i_30_ + i_27_ > (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8986) * 1383960921)
				i_30_ -= (i_27_ + i_30_ - (((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt8986 * 1383960921));
			if (i < 72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983)) {
				int i_37_ = (72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983) - i);
				i_29_ -= i_37_;
				i = 72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983);
				i_35_ += i_37_;
				i_32_ += i_37_;
				i_34_ += i_37_;
				i_33_ += i_37_;
			}
			if (i + i_29_ > -1710988237 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt9002)) {
				int i_38_ = i + i_29_ - -1710988237 * (((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt9002);
				i_29_ -= i_38_;
				i_34_ += i_38_;
				i_33_ += i_38_;
			}
			if (i_29_ > 0 && i_30_ > 0) {
				if (bool)
					method14325(((Class8_Sub3) this).aByteArrayArray8967[c], (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anIntArray8979), i_28_, i_35_, i_32_, i_29_, i_30_, i_33_, i_34_);
				else
					method14334(((Class8_Sub3) this).aByteArrayArray8967[c], (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anIntArray8979), ((Class8_Sub3) this).anIntArray8970, i_35_, i_32_, i_29_, i_30_, i_33_, i_34_);
			}
		}
	}

	void method14324(byte[] is, int[] is_39_, int[] is_40_, int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, Class455 class455, int i_50_, int i_51_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_52_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_53_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_54_ = i_47_ - 72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983);
		int i_55_ = i_48_;
		if (i_51_ > i_55_) {
			i_55_ = i_51_;
			i_42_ += (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8980) * 444800403 * (i_51_ - i_48_);
			i_41_ += (i_51_ - i_48_) * i_49_;
		}
		int i_56_ = (i_51_ + is_52_.length < i_44_ + i_48_ ? i_51_ + is_52_.length : i_44_ + i_48_);
		boolean bool = false;
		for (int i_57_ = i_55_; i_57_ < i_56_; i_57_++) {
			int i_58_ = i_50_ + is_52_[i_57_ - i_51_];
			int i_59_ = is_53_[i_57_ - i_51_];
			int i_60_ = i_43_;
			if (i_54_ > i_58_) {
				int i_61_ = i_54_ - i_58_;
				if (i_61_ >= i_59_) {
					i_41_ += i_43_ + i_46_;
					i_42_ += i_45_ + i_43_;
					continue;
				}
				i_59_ -= i_61_;
			} else {
				int i_62_ = i_58_ - i_54_;
				if (i_62_ >= i_43_) {
					i_41_ += i_46_ + i_43_;
					i_42_ += i_45_ + i_43_;
					continue;
				}
				i_41_ += i_62_;
				i_60_ -= i_62_;
				i_42_ += i_62_;
			}
			int i_63_ = 0;
			if (i_60_ < i_59_)
				i_59_ = i_60_;
			else
				i_63_ = i_60_ - i_59_;
			for (int i_64_ = -i_59_; i_64_ < 0; i_64_++) {
				int i_65_;
				if ((i_65_ = is[i_41_++]) != 0)
					is_39_[i_42_++] = is_40_[i_65_ & 0xff];
				else
					i_42_++;
			}
			i_41_ += i_46_ + i_63_;
			i_42_ += i_63_ + i_45_;
		}
	}

	void method14325(byte[] is, int[] is_66_, int i, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_) {
		int i_73_ = -(i_69_ >> 2);
		i_69_ = -(i_69_ & 0x3);
		for (int i_74_ = -i_70_; i_74_ < 0; i_74_++) {
			for (int i_75_ = i_73_; i_75_ < 0; i_75_++) {
				if (is[i_67_++] != 0)
					is_66_[i_68_++] = i;
				else
					i_68_++;
				if (is[i_67_++] != 0)
					is_66_[i_68_++] = i;
				else
					i_68_++;
				if (is[i_67_++] != 0)
					is_66_[i_68_++] = i;
				else
					i_68_++;
				if (is[i_67_++] != 0)
					is_66_[i_68_++] = i;
				else
					i_68_++;
			}
			for (int i_76_ = i_69_; i_76_ < 0; i_76_++) {
				if (is[i_67_++] != 0)
					is_66_[i_68_++] = i;
				else
					i_68_++;
			}
			i_68_ += i_71_;
			i_67_ += i_72_;
		}
	}

	void method374(char c, int i, int i_77_, int i_78_, boolean bool, Class455 class455, int i_79_, int i_80_) {
		if (null != (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anIntArray8979)) {
			if (null == class455)
				UA(c, i, i_77_, i_78_, bool);
			else {
				i += ((Class8_Sub3) this).anIntArray8973[c];
				i_77_ += ((Class8_Sub3) this).anIntArray8972[c];
				int i_81_ = ((Class8_Sub3) this).anIntArray8969[c];
				int i_82_ = ((Class8_Sub3) this).anIntArray8971[c];
				int i_83_ = (((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt8980 * 444800403);
				int i_84_ = i + i_77_ * i_83_;
				int i_85_ = i_83_ - i_81_;
				int i_86_ = 0;
				int i_87_ = 0;
				if (i_77_ < 1516535457 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt9009)) {
					int i_88_ = (1516535457 * ((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt9009 - i_77_);
					i_82_ -= i_88_;
					i_77_ = (((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt9009 * 1516535457);
					i_87_ += i_81_ * i_88_;
					i_84_ += i_88_ * i_83_;
				}
				if (i_82_ + i_77_ > 1383960921 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8986))
					i_82_ -= (i_77_ + i_82_ - 1383960921 * ((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt8986);
				if (i < (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983 * 72550989)) {
					int i_89_ = ((((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983) * 72550989 - i);
					i_81_ -= i_89_;
					i = 72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983);
					i_87_ += i_89_;
					i_84_ += i_89_;
					i_86_ += i_89_;
					i_85_ += i_89_;
				}
				if (i + i_81_ > -1710988237 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt9002)) {
					int i_90_ = i_81_ + i - (((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt9002) * -1710988237;
					i_81_ -= i_90_;
					i_86_ += i_90_;
					i_85_ += i_90_;
				}
				if (i_81_ > 0 && i_82_ > 0) {
					if (bool)
						method14327((((Class8_Sub3) this).aByteArrayArray8967[c]), (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anIntArray8979), i_78_, i_87_, i_84_, i_81_, i_82_, i_85_, i_86_, i, i_77_, ((Class8_Sub3) this).anIntArray8969[c], class455, i_79_, i_80_);
					else
						method14326((((Class8_Sub3) this).aByteArrayArray8967[c]), (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anIntArray8979), ((Class8_Sub3) this).anIntArray8970, i_78_, i_87_, i_84_, i_81_, i_82_, i_85_, i_86_, i, i_77_, ((Class8_Sub3) this).anIntArray8969[c], class455, i_79_, i_80_);
				}
			}
		}
	}

	void method14326(byte[] is, int[] is_91_, int[] is_92_, int i, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, Class455 class455, int i_102_, int i_103_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_104_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_105_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_106_ = i_99_ - 72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983);
		int i_107_ = i_100_;
		if (i_103_ > i_107_) {
			i_107_ = i_103_;
			i_94_ += (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8980) * 444800403 * (i_103_ - i_100_);
			i_93_ += (i_103_ - i_100_) * i_101_;
		}
		int i_108_ = (i_103_ + is_104_.length < i_96_ + i_100_ ? i_103_ + is_104_.length : i_96_ + i_100_);
		boolean bool = false;
		for (int i_109_ = i_107_; i_109_ < i_108_; i_109_++) {
			int i_110_ = i_102_ + is_104_[i_109_ - i_103_];
			int i_111_ = is_105_[i_109_ - i_103_];
			int i_112_ = i_95_;
			if (i_106_ > i_110_) {
				int i_113_ = i_106_ - i_110_;
				if (i_113_ >= i_111_) {
					i_93_ += i_95_ + i_98_;
					i_94_ += i_97_ + i_95_;
					continue;
				}
				i_111_ -= i_113_;
			} else {
				int i_114_ = i_110_ - i_106_;
				if (i_114_ >= i_95_) {
					i_93_ += i_98_ + i_95_;
					i_94_ += i_97_ + i_95_;
					continue;
				}
				i_93_ += i_114_;
				i_112_ -= i_114_;
				i_94_ += i_114_;
			}
			int i_115_ = 0;
			if (i_112_ < i_111_)
				i_111_ = i_112_;
			else
				i_115_ = i_112_ - i_111_;
			for (int i_116_ = -i_111_; i_116_ < 0; i_116_++) {
				int i_117_;
				if ((i_117_ = is[i_93_++]) != 0)
					is_91_[i_94_++] = is_92_[i_117_ & 0xff];
				else
					i_94_++;
			}
			i_93_ += i_98_ + i_115_;
			i_94_ += i_115_ + i_97_;
		}
	}

	void method14327(byte[] is, int[] is_118_, int i, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, Class455 class455, int i_128_, int i_129_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_130_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_131_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_132_ = i_125_ - 72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983);
		int i_133_ = i_126_;
		if (i_129_ > i_133_) {
			i_133_ = i_129_;
			i_120_ += (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8980) * 444800403 * (i_129_ - i_126_);
			i_119_ += i_127_ * (i_129_ - i_126_);
		}
		int i_134_ = (i_129_ + is_130_.length < i_122_ + i_126_ ? i_129_ + is_130_.length : i_126_ + i_122_);
		for (int i_135_ = i_133_; i_135_ < i_134_; i_135_++) {
			int i_136_ = is_130_[i_135_ - i_129_] + i_128_;
			int i_137_ = is_131_[i_135_ - i_129_];
			int i_138_ = i_121_;
			if (i_132_ > i_136_) {
				int i_139_ = i_132_ - i_136_;
				if (i_139_ >= i_137_) {
					i_119_ += i_121_ + i_124_;
					i_120_ += i_121_ + i_123_;
					continue;
				}
				i_137_ -= i_139_;
			} else {
				int i_140_ = i_136_ - i_132_;
				if (i_140_ >= i_121_) {
					i_119_ += i_124_ + i_121_;
					i_120_ += i_121_ + i_123_;
					continue;
				}
				i_119_ += i_140_;
				i_138_ -= i_140_;
				i_120_ += i_140_;
			}
			int i_141_ = 0;
			if (i_138_ < i_137_)
				i_137_ = i_138_;
			else
				i_141_ = i_138_ - i_137_;
			for (int i_142_ = -i_137_; i_142_ < 0; i_142_++) {
				if (is[i_119_++] != 0)
					is_118_[i_120_++] = i;
				else
					i_120_++;
			}
			i_119_ += i_141_ + i_119_;
			i_120_ += i_123_ + i_141_;
		}
	}

	void method362(char c, int i, int i_143_, int i_144_, boolean bool, Class455 class455, int i_145_, int i_146_) {
		if (null != (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anIntArray8979)) {
			if (null == class455)
				UA(c, i, i_143_, i_144_, bool);
			else {
				i += ((Class8_Sub3) this).anIntArray8973[c];
				i_143_ += ((Class8_Sub3) this).anIntArray8972[c];
				int i_147_ = ((Class8_Sub3) this).anIntArray8969[c];
				int i_148_ = ((Class8_Sub3) this).anIntArray8971[c];
				int i_149_ = (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8980 * 444800403);
				int i_150_ = i + i_143_ * i_149_;
				int i_151_ = i_149_ - i_147_;
				int i_152_ = 0;
				int i_153_ = 0;
				if (i_143_ < 1516535457 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt9009)) {
					int i_154_ = (1516535457 * ((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt9009 - i_143_);
					i_148_ -= i_154_;
					i_143_ = (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt9009) * 1516535457;
					i_153_ += i_147_ * i_154_;
					i_150_ += i_154_ * i_149_;
				}
				if (i_148_ + i_143_ > 1383960921 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8986))
					i_148_ -= (i_143_ + i_148_ - 1383960921 * ((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt8986);
				if (i < (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983 * 72550989)) {
					int i_155_ = ((((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983) * 72550989 - i);
					i_147_ -= i_155_;
					i = 72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983);
					i_153_ += i_155_;
					i_150_ += i_155_;
					i_152_ += i_155_;
					i_151_ += i_155_;
				}
				if (i + i_147_ > -1710988237 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt9002)) {
					int i_156_ = (i_147_ + i - (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt9002) * -1710988237);
					i_147_ -= i_156_;
					i_152_ += i_156_;
					i_151_ += i_156_;
				}
				if (i_147_ > 0 && i_148_ > 0) {
					if (bool)
						method14327((((Class8_Sub3) this).aByteArrayArray8967[c]), (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anIntArray8979), i_144_, i_153_, i_150_, i_147_, i_148_, i_151_, i_152_, i, i_143_, ((Class8_Sub3) this).anIntArray8969[c], class455, i_145_, i_146_);
					else
						method14326((((Class8_Sub3) this).aByteArrayArray8967[c]), (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anIntArray8979), ((Class8_Sub3) this).anIntArray8970, i_144_, i_153_, i_150_, i_147_, i_148_, i_151_, i_152_, i, i_143_, ((Class8_Sub3) this).anIntArray8969[c], class455, i_145_, i_146_);
				}
			}
		}
	}

	void c(char c, int i, int i_157_, int i_158_, boolean bool) {
		if (null != (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anIntArray8979)) {
			i += ((Class8_Sub3) this).anIntArray8973[c];
			i_157_ += ((Class8_Sub3) this).anIntArray8972[c];
			int i_159_ = ((Class8_Sub3) this).anIntArray8969[c];
			int i_160_ = ((Class8_Sub3) this).anIntArray8971[c];
			int i_161_ = 444800403 * (((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt8980);
			int i_162_ = i_157_ * i_161_ + i;
			int i_163_ = i_161_ - i_159_;
			int i_164_ = 0;
			int i_165_ = 0;
			if (i_157_ < 1516535457 * (((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt9009)) {
				int i_166_ = (1516535457 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt9009) - i_157_);
				i_160_ -= i_166_;
				i_157_ = 1516535457 * (((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt9009);
				i_165_ += i_166_ * i_159_;
				i_162_ += i_166_ * i_161_;
			}
			if (i_160_ + i_157_ > (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8986) * 1383960921)
				i_160_ -= (i_157_ + i_160_ - (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8986) * 1383960921);
			if (i < 72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983)) {
				int i_167_ = (72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983) - i);
				i_159_ -= i_167_;
				i = 72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983);
				i_165_ += i_167_;
				i_162_ += i_167_;
				i_164_ += i_167_;
				i_163_ += i_167_;
			}
			if (i + i_159_ > -1710988237 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt9002)) {
				int i_168_ = (i + i_159_ - -1710988237 * ((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt9002);
				i_159_ -= i_168_;
				i_164_ += i_168_;
				i_163_ += i_168_;
			}
			if (i_159_ > 0 && i_160_ > 0) {
				if (bool)
					method14325(((Class8_Sub3) this).aByteArrayArray8967[c], (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anIntArray8979), i_158_, i_165_, i_162_, i_159_, i_160_, i_163_, i_164_);
				else
					method14334(((Class8_Sub3) this).aByteArrayArray8967[c], (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anIntArray8979), ((Class8_Sub3) this).anIntArray8970, i_165_, i_162_, i_159_, i_160_, i_163_, i_164_);
			}
		}
	}

	void method14328(byte[] is, int[] is_169_, int i, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_, int i_175_, int i_176_, int i_177_, int i_178_, Class455 class455, int i_179_, int i_180_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_181_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_182_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_183_ = i_176_ - 72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983);
		int i_184_ = i_177_;
		if (i_180_ > i_184_) {
			i_184_ = i_180_;
			i_171_ += (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8980) * 444800403 * (i_180_ - i_177_);
			i_170_ += i_178_ * (i_180_ - i_177_);
		}
		int i_185_ = (i_180_ + is_181_.length < i_173_ + i_177_ ? i_180_ + is_181_.length : i_177_ + i_173_);
		for (int i_186_ = i_184_; i_186_ < i_185_; i_186_++) {
			int i_187_ = is_181_[i_186_ - i_180_] + i_179_;
			int i_188_ = is_182_[i_186_ - i_180_];
			int i_189_ = i_172_;
			if (i_183_ > i_187_) {
				int i_190_ = i_183_ - i_187_;
				if (i_190_ >= i_188_) {
					i_170_ += i_172_ + i_175_;
					i_171_ += i_172_ + i_174_;
					continue;
				}
				i_188_ -= i_190_;
			} else {
				int i_191_ = i_187_ - i_183_;
				if (i_191_ >= i_172_) {
					i_170_ += i_175_ + i_172_;
					i_171_ += i_172_ + i_174_;
					continue;
				}
				i_170_ += i_191_;
				i_189_ -= i_191_;
				i_171_ += i_191_;
			}
			int i_192_ = 0;
			if (i_189_ < i_188_)
				i_188_ = i_189_;
			else
				i_192_ = i_189_ - i_188_;
			for (int i_193_ = -i_188_; i_193_ < 0; i_193_++) {
				if (is[i_170_++] != 0)
					is_169_[i_171_++] = i;
				else
					i_171_++;
			}
			i_170_ += i_192_ + i_170_;
			i_171_ += i_174_ + i_192_;
		}
	}

	void method14329(byte[] is, int[] is_194_, int i, int i_195_, int i_196_, int i_197_, int i_198_, int i_199_, int i_200_) {
		int i_201_ = -(i_197_ >> 2);
		i_197_ = -(i_197_ & 0x3);
		for (int i_202_ = -i_198_; i_202_ < 0; i_202_++) {
			for (int i_203_ = i_201_; i_203_ < 0; i_203_++) {
				if (is[i_195_++] != 0)
					is_194_[i_196_++] = i;
				else
					i_196_++;
				if (is[i_195_++] != 0)
					is_194_[i_196_++] = i;
				else
					i_196_++;
				if (is[i_195_++] != 0)
					is_194_[i_196_++] = i;
				else
					i_196_++;
				if (is[i_195_++] != 0)
					is_194_[i_196_++] = i;
				else
					i_196_++;
			}
			for (int i_204_ = i_197_; i_204_ < 0; i_204_++) {
				if (is[i_195_++] != 0)
					is_194_[i_196_++] = i;
				else
					i_196_++;
			}
			i_196_ += i_199_;
			i_195_ += i_200_;
		}
	}

	void method14330(byte[] is, int[] is_205_, int i, int i_206_, int i_207_, int i_208_, int i_209_, int i_210_, int i_211_) {
		int i_212_ = -(i_208_ >> 2);
		i_208_ = -(i_208_ & 0x3);
		for (int i_213_ = -i_209_; i_213_ < 0; i_213_++) {
			for (int i_214_ = i_212_; i_214_ < 0; i_214_++) {
				if (is[i_206_++] != 0)
					is_205_[i_207_++] = i;
				else
					i_207_++;
				if (is[i_206_++] != 0)
					is_205_[i_207_++] = i;
				else
					i_207_++;
				if (is[i_206_++] != 0)
					is_205_[i_207_++] = i;
				else
					i_207_++;
				if (is[i_206_++] != 0)
					is_205_[i_207_++] = i;
				else
					i_207_++;
			}
			for (int i_215_ = i_208_; i_215_ < 0; i_215_++) {
				if (is[i_206_++] != 0)
					is_205_[i_207_++] = i;
				else
					i_207_++;
			}
			i_207_ += i_210_;
			i_206_ += i_211_;
		}
	}

	void method14331(byte[] is, int[] is_216_, int i, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_, int i_222_) {
		int i_223_ = -(i_219_ >> 2);
		i_219_ = -(i_219_ & 0x3);
		for (int i_224_ = -i_220_; i_224_ < 0; i_224_++) {
			for (int i_225_ = i_223_; i_225_ < 0; i_225_++) {
				if (is[i_217_++] != 0)
					is_216_[i_218_++] = i;
				else
					i_218_++;
				if (is[i_217_++] != 0)
					is_216_[i_218_++] = i;
				else
					i_218_++;
				if (is[i_217_++] != 0)
					is_216_[i_218_++] = i;
				else
					i_218_++;
				if (is[i_217_++] != 0)
					is_216_[i_218_++] = i;
				else
					i_218_++;
			}
			for (int i_226_ = i_219_; i_226_ < 0; i_226_++) {
				if (is[i_217_++] != 0)
					is_216_[i_218_++] = i;
				else
					i_218_++;
			}
			i_218_ += i_221_;
			i_217_ += i_222_;
		}
	}

	void method14332(byte[] is, int[] is_227_, int[] is_228_, int i, int i_229_, int i_230_, int i_231_, int i_232_, int i_233_, int i_234_, int i_235_, int i_236_, int i_237_, Class455 class455, int i_238_, int i_239_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_240_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_241_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_242_ = i_235_ - 72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983);
		int i_243_ = i_236_;
		if (i_239_ > i_243_) {
			i_243_ = i_239_;
			i_230_ += (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8980) * 444800403 * (i_239_ - i_236_);
			i_229_ += (i_239_ - i_236_) * i_237_;
		}
		int i_244_ = (i_239_ + is_240_.length < i_232_ + i_236_ ? i_239_ + is_240_.length : i_232_ + i_236_);
		boolean bool = false;
		for (int i_245_ = i_243_; i_245_ < i_244_; i_245_++) {
			int i_246_ = i_238_ + is_240_[i_245_ - i_239_];
			int i_247_ = is_241_[i_245_ - i_239_];
			int i_248_ = i_231_;
			if (i_242_ > i_246_) {
				int i_249_ = i_242_ - i_246_;
				if (i_249_ >= i_247_) {
					i_229_ += i_231_ + i_234_;
					i_230_ += i_233_ + i_231_;
					continue;
				}
				i_247_ -= i_249_;
			} else {
				int i_250_ = i_246_ - i_242_;
				if (i_250_ >= i_231_) {
					i_229_ += i_234_ + i_231_;
					i_230_ += i_233_ + i_231_;
					continue;
				}
				i_229_ += i_250_;
				i_248_ -= i_250_;
				i_230_ += i_250_;
			}
			int i_251_ = 0;
			if (i_248_ < i_247_)
				i_247_ = i_248_;
			else
				i_251_ = i_248_ - i_247_;
			for (int i_252_ = -i_247_; i_252_ < 0; i_252_++) {
				int i_253_;
				if ((i_253_ = is[i_229_++]) != 0)
					is_227_[i_230_++] = is_228_[i_253_ & 0xff];
				else
					i_230_++;
			}
			i_229_ += i_234_ + i_251_;
			i_230_ += i_251_ + i_233_;
		}
	}

	Class8_Sub3(HardwareRenderer class505_sub3, Class414 class414, Class91[] class91s, int[] is, int[] is_254_) {
		super(class505_sub3, class414);
		((Class8_Sub3) this).aClass505_Sub3_8968 = class505_sub3;
		((Class8_Sub3) this).aClass505_Sub3_8968 = class505_sub3;
		((Class8_Sub3) this).anIntArray8969 = is;
		((Class8_Sub3) this).anIntArray8971 = is_254_;
		((Class8_Sub3) this).aByteArrayArray8967 = new byte[class91s.length][];
		((Class8_Sub3) this).anIntArray8972 = new int[class91s.length];
		((Class8_Sub3) this).anIntArray8973 = new int[class91s.length];
		for (int i = 0; i < class91s.length; i++) {
			((Class8_Sub3) this).aByteArrayArray8967[i] = class91s[i].aByteArray960;
			((Class8_Sub3) this).anIntArray8972[i] = class91s[i].anInt959;
			((Class8_Sub3) this).anIntArray8973[i] = class91s[i].anInt956;
		}
		((Class8_Sub3) this).anIntArray8970 = class91s[0].anIntArray955;
	}

	void t(char c, int i, int i_255_, int i_256_, boolean bool) {
		if (null != (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anIntArray8979)) {
			i += ((Class8_Sub3) this).anIntArray8973[c];
			i_255_ += ((Class8_Sub3) this).anIntArray8972[c];
			int i_257_ = ((Class8_Sub3) this).anIntArray8969[c];
			int i_258_ = ((Class8_Sub3) this).anIntArray8971[c];
			int i_259_ = 444800403 * (((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt8980);
			int i_260_ = i_255_ * i_259_ + i;
			int i_261_ = i_259_ - i_257_;
			int i_262_ = 0;
			int i_263_ = 0;
			if (i_255_ < 1516535457 * (((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt9009)) {
				int i_264_ = (1516535457 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt9009) - i_255_);
				i_258_ -= i_264_;
				i_255_ = 1516535457 * (((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt9009);
				i_263_ += i_264_ * i_257_;
				i_260_ += i_264_ * i_259_;
			}
			if (i_258_ + i_255_ > (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8986) * 1383960921)
				i_258_ -= (i_255_ + i_258_ - (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8986) * 1383960921);
			if (i < 72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983)) {
				int i_265_ = (72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983) - i);
				i_257_ -= i_265_;
				i = 72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983);
				i_263_ += i_265_;
				i_260_ += i_265_;
				i_262_ += i_265_;
				i_261_ += i_265_;
			}
			if (i + i_257_ > -1710988237 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt9002)) {
				int i_266_ = (i + i_257_ - -1710988237 * ((HardwareRenderer) (((Class8_Sub3) this).aClass505_Sub3_8968)).anInt9002);
				i_257_ -= i_266_;
				i_262_ += i_266_;
				i_261_ += i_266_;
			}
			if (i_257_ > 0 && i_258_ > 0) {
				if (bool)
					method14325(((Class8_Sub3) this).aByteArrayArray8967[c], (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anIntArray8979), i_256_, i_263_, i_260_, i_257_, i_258_, i_261_, i_262_);
				else
					method14334(((Class8_Sub3) this).aByteArrayArray8967[c], (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anIntArray8979), ((Class8_Sub3) this).anIntArray8970, i_263_, i_260_, i_257_, i_258_, i_261_, i_262_);
			}
		}
	}

	void method14333(byte[] is, int[] is_267_, int[] is_268_, int i, int i_269_, int i_270_, int i_271_, int i_272_, int i_273_, int i_274_, int i_275_, int i_276_, int i_277_, Class455 class455, int i_278_, int i_279_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_280_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_281_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_282_ = i_275_ - 72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983);
		int i_283_ = i_276_;
		if (i_279_ > i_283_) {
			i_283_ = i_279_;
			i_270_ += (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8980) * 444800403 * (i_279_ - i_276_);
			i_269_ += (i_279_ - i_276_) * i_277_;
		}
		int i_284_ = (i_279_ + is_280_.length < i_272_ + i_276_ ? i_279_ + is_280_.length : i_272_ + i_276_);
		boolean bool = false;
		for (int i_285_ = i_283_; i_285_ < i_284_; i_285_++) {
			int i_286_ = i_278_ + is_280_[i_285_ - i_279_];
			int i_287_ = is_281_[i_285_ - i_279_];
			int i_288_ = i_271_;
			if (i_282_ > i_286_) {
				int i_289_ = i_282_ - i_286_;
				if (i_289_ >= i_287_) {
					i_269_ += i_271_ + i_274_;
					i_270_ += i_273_ + i_271_;
					continue;
				}
				i_287_ -= i_289_;
			} else {
				int i_290_ = i_286_ - i_282_;
				if (i_290_ >= i_271_) {
					i_269_ += i_274_ + i_271_;
					i_270_ += i_273_ + i_271_;
					continue;
				}
				i_269_ += i_290_;
				i_288_ -= i_290_;
				i_270_ += i_290_;
			}
			int i_291_ = 0;
			if (i_288_ < i_287_)
				i_287_ = i_288_;
			else
				i_291_ = i_288_ - i_287_;
			for (int i_292_ = -i_287_; i_292_ < 0; i_292_++) {
				int i_293_;
				if ((i_293_ = is[i_269_++]) != 0)
					is_267_[i_270_++] = is_268_[i_293_ & 0xff];
				else
					i_270_++;
			}
			i_269_ += i_274_ + i_291_;
			i_270_ += i_291_ + i_273_;
		}
	}

	void method14334(byte[] is, int[] is_294_, int[] is_295_, int i, int i_296_, int i_297_, int i_298_, int i_299_, int i_300_) {
		int i_301_ = -(i_297_ >> 2);
		i_297_ = -(i_297_ & 0x3);
		boolean bool = false;
		for (int i_302_ = -i_298_; i_302_ < 0; i_302_++) {
			for (int i_303_ = i_301_; i_303_ < 0; i_303_++) {
				int i_304_;
				if ((i_304_ = is[i++]) != 0)
					is_294_[i_296_++] = is_295_[i_304_ & 0xff];
				else
					i_296_++;
				if ((i_304_ = is[i++]) != 0)
					is_294_[i_296_++] = is_295_[i_304_ & 0xff];
				else
					i_296_++;
				if ((i_304_ = is[i++]) != 0)
					is_294_[i_296_++] = is_295_[i_304_ & 0xff];
				else
					i_296_++;
				if ((i_304_ = is[i++]) != 0)
					is_294_[i_296_++] = is_295_[i_304_ & 0xff];
				else
					i_296_++;
			}
			for (int i_305_ = i_297_; i_305_ < 0; i_305_++) {
				int i_306_;
				if ((i_306_ = is[i++]) != 0)
					is_294_[i_296_++] = is_295_[i_306_ & 0xff];
				else
					i_296_++;
			}
			i_296_ += i_299_;
			i += i_300_;
		}
	}

	void method14335(byte[] is, int[] is_307_, int i, int i_308_, int i_309_, int i_310_, int i_311_, int i_312_, int i_313_, int i_314_, int i_315_, int i_316_, Class455 class455, int i_317_, int i_318_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_319_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_320_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_321_ = i_314_ - 72550989 * (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8983);
		int i_322_ = i_315_;
		if (i_318_ > i_322_) {
			i_322_ = i_318_;
			i_309_ += (((HardwareRenderer) ((Class8_Sub3) this).aClass505_Sub3_8968).anInt8980) * 444800403 * (i_318_ - i_315_);
			i_308_ += i_316_ * (i_318_ - i_315_);
		}
		int i_323_ = (i_318_ + is_319_.length < i_311_ + i_315_ ? i_318_ + is_319_.length : i_315_ + i_311_);
		for (int i_324_ = i_322_; i_324_ < i_323_; i_324_++) {
			int i_325_ = is_319_[i_324_ - i_318_] + i_317_;
			int i_326_ = is_320_[i_324_ - i_318_];
			int i_327_ = i_310_;
			if (i_321_ > i_325_) {
				int i_328_ = i_321_ - i_325_;
				if (i_328_ >= i_326_) {
					i_308_ += i_310_ + i_313_;
					i_309_ += i_310_ + i_312_;
					continue;
				}
				i_326_ -= i_328_;
			} else {
				int i_329_ = i_325_ - i_321_;
				if (i_329_ >= i_310_) {
					i_308_ += i_313_ + i_310_;
					i_309_ += i_310_ + i_312_;
					continue;
				}
				i_308_ += i_329_;
				i_327_ -= i_329_;
				i_309_ += i_329_;
			}
			int i_330_ = 0;
			if (i_327_ < i_326_)
				i_326_ = i_327_;
			else
				i_330_ = i_327_ - i_326_;
			for (int i_331_ = -i_326_; i_331_ < 0; i_331_++) {
				if (is[i_308_++] != 0)
					is_307_[i_309_++] = i;
				else
					i_309_++;
			}
			i_308_ += i_330_ + i_308_;
			i_309_ += i_312_ + i_330_;
		}
	}

	static final void method14336(Class521_Sub1 class521_sub1, int i, boolean bool, int i_332_) {
		int i_333_;
		int i_334_;
		if (class521_sub1 instanceof Class521_Sub1_Sub1 && class521_sub1 instanceof SceneObject) {
			Class521_Sub1_Sub1 class521_sub1_sub1 = (Class521_Sub1_Sub1) class521_sub1;
			int i_335_ = (1 + (class521_sub1_sub1.aShort9455 - class521_sub1_sub1.aShort9458) << 9);
			int i_336_ = (1 + (class521_sub1_sub1.aShort9457 - class521_sub1_sub1.aShort9456) << 9);
			i_333_ = (class521_sub1_sub1.aShort9458 << 9) + i_335_ / 2;
			i_334_ = (class521_sub1_sub1.aShort9456 << 9) + i_336_ / 2;
		} else {
			Class385 class385 = class521_sub1.method11166().aClass385_3595;
			i_333_ = (int) class385.aFloat4671;
			i_334_ = (int) class385.aFloat4673;
		}
		Class210.method3612(class521_sub1.aByte7967, i_333_, i_334_, 0, i, bool, (byte) 29);
	}

	public static int method14337(int i, int i_337_, int i_338_, int i_339_) {
		int i_340_ = 255 - i_338_;
		i_337_ = (i_338_ * (i_337_ & 0xff00ff) & ~0xff00ff | i_338_ * (i_337_ & 0xff00) & 0xff0000) >>> 8;
		return (((i_340_ * (i & 0xff00ff) & ~0xff00ff | i_340_ * (i & 0xff00) & 0xff0000) >>> 8) + i_337_);
	}

	static final boolean method14338(Class184 class184, byte i) {
		boolean bool;
		try {
			bool = PacketsDecoder.method14433(class184, -1939307433);
		} catch (IOException ioexception) {
			if (client.anInt7166 * -1741204137 == 7) {
				class184.method3061(-1844369751);
				return false;
			}
			Class151.method2592((byte) 31);
			return true;
		} catch (Exception exception) {
			Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(1387149052);
			String string = new StringBuilder().append(((Class184) class184).aClass375_2286 != null ? (1694502249 * ((Class184) class184).aClass375_2286.anInt4512) : -1).append(Class2.aString14).append(((Class184) class184).aClass375_2296 != null ? (((Class184) class184).aClass375_2296.anInt4512 * 1694502249) : -1).append(Class2.aString14).append(null != ((Class184) class184).aClass375_2291 ? (1694502249 * ((Class184) class184).aClass375_2291.anInt4512) : -1).append(" ")
					.append(((Class184) class184).anInt2287 * 715663393).append(Class2.aString14).append(1948093437 * class219.anInt2711 + (Class84.myPlayer.regionBaseX[0])).append(Class2.aString14).append(class219.anInt2712 * -1002240017 + (Class84.myPlayer.regionBaseY[0])).append(" ").toString();
			for (int i_341_ = 0; (i_341_ < 715663393 * ((Class184) class184).anInt2287 && i_341_ < 50); i_341_++)
				string = new StringBuilder().append(string).append(((Class184) class184).aClass282_Sub35_Sub2_2284.buffer[i_341_]).append(Class2.aString14).toString();
			Class151.method2594(string, exception, (byte) -124);
			Class438.method7333(false, 2019589827);
			return true;
		}
		return bool;
	}

	public static Class249[] method14339(int i) {
		return (new Class249[] { Class249.aClass249_3082, Class249.aClass249_3084, Class249.aClass249_3086, Class249.aClass249_3083 });
	}

	static final void method14340(CS2Executor class527, byte i) {
		UnderlayDefinition class513;
		if (class527.aBool7022) {
			if (i <= 0)
				return;
			class513 = class527.aClass513_6994;
		} else
			class513 = class527.aClass513_7007;
		UnderlayDefinition class513_342_ = class513;
		Class118 class118 = ((UnderlayDefinition) class513_342_).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513_342_).aClass98_5885;
		Class96_Sub17.method14653(class118, class98, class527, -1985356850);
	}

	static void method14341(int i) {
		Class282_Sub50_Sub12.aClass465_9667.method7749(207048647);
		Class282_Sub50_Sub12.aClass477_9655.method7935((byte) -65);
		Class282_Sub50_Sub12.aClass477_9666.method7935((byte) -9);
	}

	static final void method14342(CS2Executor class527, byte i) {
		int i_343_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_343_, (byte) 90);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_343_ >> 16];
		Class29.method789(class118, class98, class527, -19478635);
	}
}
