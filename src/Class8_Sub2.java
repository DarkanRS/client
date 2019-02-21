
/* Class8_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class8_Sub2 extends FontRenderer {
	int[] anIntArray8886;
	byte[][] aByteArrayArray8887;
	int[] anIntArray8888;
	HardwareRenderer aClass505_Sub3_8889;
	int[] anIntArray8890;
	int[] anIntArray8891;

	void c(char c, int i, int i_0_, int i_1_, boolean bool) {
		if ((((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anIntArray8979) != null) {
			i += ((Class8_Sub2) this).anIntArray8891[c];
			i_0_ += ((Class8_Sub2) this).anIntArray8890[c];
			int i_2_ = ((Class8_Sub2) this).anIntArray8886[c];
			int i_3_ = ((Class8_Sub2) this).anIntArray8888[c];
			int i_4_ = (444800403 * ((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt8980);
			int i_5_ = i + i_0_ * i_4_;
			int i_6_ = i_4_ - i_2_;
			int i_7_ = 0;
			int i_8_ = 0;
			if (i_0_ < 1516535457 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt9009)) {
				int i_9_ = (1516535457 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt9009) - i_0_);
				i_3_ -= i_9_;
				i_0_ = (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt9009 * 1516535457);
				i_8_ += i_2_ * i_9_;
				i_5_ += i_4_ * i_9_;
			}
			if (i_3_ + i_0_ > 1383960921 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8986))
				i_3_ -= i_3_ + i_0_ - (((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt8986) * 1383960921;
			if (i < 72550989 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983)) {
				int i_10_ = (72550989 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983) - i);
				i_2_ -= i_10_;
				i = (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983) * 72550989;
				i_8_ += i_10_;
				i_5_ += i_10_;
				i_7_ += i_10_;
				i_6_ += i_10_;
			}
			if (i_2_ + i > -1710988237 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt9002)) {
				int i_11_ = i_2_ + i - -1710988237 * (((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt9002);
				i_2_ -= i_11_;
				i_7_ += i_11_;
				i_6_ += i_11_;
			}
			if (i_2_ > 0 && i_3_ > 0)
				method14257(((Class8_Sub2) this).aByteArrayArray8887[c], (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anIntArray8979), i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
		}
	}

	void UA(char c, int i, int i_12_, int i_13_, boolean bool) {
		if ((((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anIntArray8979) != null) {
			i += ((Class8_Sub2) this).anIntArray8891[c];
			i_12_ += ((Class8_Sub2) this).anIntArray8890[c];
			int i_14_ = ((Class8_Sub2) this).anIntArray8886[c];
			int i_15_ = ((Class8_Sub2) this).anIntArray8888[c];
			int i_16_ = (444800403 * ((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt8980);
			int i_17_ = i + i_12_ * i_16_;
			int i_18_ = i_16_ - i_14_;
			int i_19_ = 0;
			int i_20_ = 0;
			if (i_12_ < 1516535457 * (((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt9009)) {
				int i_21_ = (1516535457 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt9009) - i_12_);
				i_15_ -= i_21_;
				i_12_ = (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt9009 * 1516535457);
				i_20_ += i_14_ * i_21_;
				i_17_ += i_16_ * i_21_;
			}
			if (i_15_ + i_12_ > 1383960921 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8986))
				i_15_ -= (i_15_ + i_12_ - (((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt8986 * 1383960921));
			if (i < 72550989 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983)) {
				int i_22_ = (72550989 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983) - i);
				i_14_ -= i_22_;
				i = (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983) * 72550989;
				i_20_ += i_22_;
				i_17_ += i_22_;
				i_19_ += i_22_;
				i_18_ += i_22_;
			}
			if (i_14_ + i > -1710988237 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt9002)) {
				int i_23_ = i_14_ + i - -1710988237 * (((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt9002);
				i_14_ -= i_23_;
				i_19_ += i_23_;
				i_18_ += i_23_;
			}
			if (i_14_ > 0 && i_15_ > 0)
				method14257(((Class8_Sub2) this).aByteArrayArray8887[c], (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anIntArray8979), i_13_, i_20_, i_17_, i_14_, i_15_, i_18_, i_19_);
		}
	}

	void method14257(byte[] is, int[] is_24_, int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_) {
		for (int i_31_ = -i_28_; i_31_ < 0; i_31_++) {
			for (int i_32_ = -i_27_; i_32_ < 0; i_32_++) {
				int i_33_ = is[i_25_++] & 0xff;
				if (0 != i_33_) {
					int i_34_ = ((((i & 0xff00) * i_33_ & 0xff0000) + ((i & 0xff00ff) * i_33_ & ~0xff00ff)) >> 8);
					i_33_ = 256 - i_33_;
					int i_35_ = is_24_[i_26_];
					is_24_[i_26_++] = i_34_ + ((((i_35_ & 0xff00) * i_33_ & 0xff0000) + (i_33_ * (i_35_ & 0xff00ff) & ~0xff00ff)) >> 8);
				} else
					i_26_++;
			}
			i_26_ += i_29_;
			i_25_ += i_30_;
		}
	}

	void t(char c, int i, int i_36_, int i_37_, boolean bool) {
		if ((((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anIntArray8979) != null) {
			i += ((Class8_Sub2) this).anIntArray8891[c];
			i_36_ += ((Class8_Sub2) this).anIntArray8890[c];
			int i_38_ = ((Class8_Sub2) this).anIntArray8886[c];
			int i_39_ = ((Class8_Sub2) this).anIntArray8888[c];
			int i_40_ = (444800403 * ((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt8980);
			int i_41_ = i + i_36_ * i_40_;
			int i_42_ = i_40_ - i_38_;
			int i_43_ = 0;
			int i_44_ = 0;
			if (i_36_ < 1516535457 * (((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt9009)) {
				int i_45_ = (1516535457 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt9009) - i_36_);
				i_39_ -= i_45_;
				i_36_ = (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt9009 * 1516535457);
				i_44_ += i_38_ * i_45_;
				i_41_ += i_40_ * i_45_;
			}
			if (i_39_ + i_36_ > 1383960921 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8986))
				i_39_ -= (i_39_ + i_36_ - (((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt8986 * 1383960921));
			if (i < 72550989 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983)) {
				int i_46_ = (72550989 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983) - i);
				i_38_ -= i_46_;
				i = (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983) * 72550989;
				i_44_ += i_46_;
				i_41_ += i_46_;
				i_43_ += i_46_;
				i_42_ += i_46_;
			}
			if (i_38_ + i > -1710988237 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt9002)) {
				int i_47_ = i_38_ + i - -1710988237 * (((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt9002);
				i_38_ -= i_47_;
				i_43_ += i_47_;
				i_42_ += i_47_;
			}
			if (i_38_ > 0 && i_39_ > 0)
				method14257(((Class8_Sub2) this).aByteArrayArray8887[c], (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anIntArray8979), i_37_, i_44_, i_41_, i_38_, i_39_, i_42_, i_43_);
		}
	}

	void method14258(byte[] is, int[] is_48_, int i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, Class455 class455, int i_58_, int i_59_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_60_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_61_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_62_ = (i_55_ - (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983) * 72550989);
		int i_63_ = i_56_;
		if (i_59_ > i_63_) {
			i_63_ = i_59_;
			i_50_ += ((i_59_ - i_56_) * (444800403 * (((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt8980)));
			i_49_ += i_57_ * (i_59_ - i_56_);
		}
		int i_64_ = (i_59_ + is_60_.length < i_56_ + i_52_ ? is_60_.length + i_59_ : i_56_ + i_52_);
		for (int i_65_ = i_63_; i_65_ < i_64_; i_65_++) {
			int i_66_ = i_58_ + is_60_[i_65_ - i_59_];
			int i_67_ = is_61_[i_65_ - i_59_];
			int i_68_ = i_51_;
			if (i_62_ > i_66_) {
				int i_69_ = i_62_ - i_66_;
				if (i_69_ >= i_67_) {
					i_49_ += i_51_ + i_54_;
					i_50_ += i_53_ + i_51_;
					continue;
				}
				i_67_ -= i_69_;
			} else {
				int i_70_ = i_66_ - i_62_;
				if (i_70_ >= i_51_) {
					i_49_ += i_54_ + i_51_;
					i_50_ += i_51_ + i_53_;
					continue;
				}
				i_49_ += i_70_;
				i_68_ -= i_70_;
				i_50_ += i_70_;
			}
			int i_71_ = 0;
			if (i_68_ < i_67_)
				i_67_ = i_68_;
			else
				i_71_ = i_68_ - i_67_;
			for (int i_72_ = -i_67_; i_72_ < 0; i_72_++) {
				int i_73_ = is[i_49_++] & 0xff;
				if (i_73_ != 0) {
					int i_74_ = ((((i & 0xff00) * i_73_ & 0xff0000) + (i_73_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					i_73_ = 256 - i_73_;
					int i_75_ = is_48_[i_50_];
					is_48_[i_50_++] = (((i_73_ * (i_75_ & 0xff00) & 0xff0000) + ((i_75_ & 0xff00ff) * i_73_ & ~0xff00ff)) >> 8) + i_74_;
				} else
					i_50_++;
			}
			i_49_ += i_71_ + i_54_;
			i_50_ += i_71_ + i_53_;
		}
	}

	void method14259(byte[] is, int[] is_76_, int i, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_) {
		for (int i_83_ = -i_80_; i_83_ < 0; i_83_++) {
			for (int i_84_ = -i_79_; i_84_ < 0; i_84_++) {
				int i_85_ = is[i_77_++] & 0xff;
				if (0 != i_85_) {
					int i_86_ = ((((i & 0xff00) * i_85_ & 0xff0000) + ((i & 0xff00ff) * i_85_ & ~0xff00ff)) >> 8);
					i_85_ = 256 - i_85_;
					int i_87_ = is_76_[i_78_];
					is_76_[i_78_++] = i_86_ + ((((i_87_ & 0xff00) * i_85_ & 0xff0000) + (i_85_ * (i_87_ & 0xff00ff) & ~0xff00ff)) >> 8);
				} else
					i_78_++;
			}
			i_78_ += i_81_;
			i_77_ += i_82_;
		}
	}

	void method362(char c, int i, int i_88_, int i_89_, boolean bool, Class455 class455, int i_90_, int i_91_) {
		if (null != (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anIntArray8979)) {
			if (null == class455)
				UA(c, i, i_88_, i_89_, bool);
			else {
				i += ((Class8_Sub2) this).anIntArray8891[c];
				i_88_ += ((Class8_Sub2) this).anIntArray8890[c];
				int i_92_ = ((Class8_Sub2) this).anIntArray8886[c];
				int i_93_ = ((Class8_Sub2) this).anIntArray8888[c];
				int i_94_ = (444800403 * ((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8980);
				int i_95_ = i + i_88_ * i_94_;
				int i_96_ = i_94_ - i_92_;
				int i_97_ = 0;
				int i_98_ = 0;
				if (i_88_ < 1516535457 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt9009)) {
					int i_99_ = (1516535457 * ((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt9009 - i_88_);
					i_93_ -= i_99_;
					i_88_ = (((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt9009 * 1516535457);
					i_98_ += i_99_ * i_92_;
					i_95_ += i_99_ * i_94_;
				}
				if (i_93_ + i_88_ > (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8986) * 1383960921)
					i_93_ -= (i_93_ + i_88_ - 1383960921 * ((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt8986);
				if (i < 72550989 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983)) {
					int i_100_ = (72550989 * (((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt8983) - i);
					i_92_ -= i_100_;
					i = 72550989 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983);
					i_98_ += i_100_;
					i_95_ += i_100_;
					i_97_ += i_100_;
					i_96_ += i_100_;
				}
				if (i_92_ + i > (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt9002) * -1710988237) {
					int i_101_ = (i + i_92_ - -1710988237 * ((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt9002);
					i_92_ -= i_101_;
					i_97_ += i_101_;
					i_96_ += i_101_;
				}
				if (i_92_ > 0 && i_93_ > 0)
					method14258(((Class8_Sub2) this).aByteArrayArray8887[c], (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anIntArray8979), i_89_, i_98_, i_95_, i_92_, i_93_, i_96_, i_97_, i, i_88_, ((Class8_Sub2) this).anIntArray8886[c], class455, i_90_, i_91_);
			}
		}
	}

	void method14260(byte[] is, int[] is_102_, int i, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_, Class455 class455, int i_112_, int i_113_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_114_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_115_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_116_ = (i_109_ - (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983) * 72550989);
		int i_117_ = i_110_;
		if (i_113_ > i_117_) {
			i_117_ = i_113_;
			i_104_ += ((i_113_ - i_110_) * (444800403 * (((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt8980)));
			i_103_ += i_111_ * (i_113_ - i_110_);
		}
		int i_118_ = (i_113_ + is_114_.length < i_110_ + i_106_ ? is_114_.length + i_113_ : i_110_ + i_106_);
		for (int i_119_ = i_117_; i_119_ < i_118_; i_119_++) {
			int i_120_ = i_112_ + is_114_[i_119_ - i_113_];
			int i_121_ = is_115_[i_119_ - i_113_];
			int i_122_ = i_105_;
			if (i_116_ > i_120_) {
				int i_123_ = i_116_ - i_120_;
				if (i_123_ >= i_121_) {
					i_103_ += i_105_ + i_108_;
					i_104_ += i_107_ + i_105_;
					continue;
				}
				i_121_ -= i_123_;
			} else {
				int i_124_ = i_120_ - i_116_;
				if (i_124_ >= i_105_) {
					i_103_ += i_108_ + i_105_;
					i_104_ += i_105_ + i_107_;
					continue;
				}
				i_103_ += i_124_;
				i_122_ -= i_124_;
				i_104_ += i_124_;
			}
			int i_125_ = 0;
			if (i_122_ < i_121_)
				i_121_ = i_122_;
			else
				i_125_ = i_122_ - i_121_;
			for (int i_126_ = -i_121_; i_126_ < 0; i_126_++) {
				int i_127_ = is[i_103_++] & 0xff;
				if (i_127_ != 0) {
					int i_128_ = ((((i & 0xff00) * i_127_ & 0xff0000) + (i_127_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					i_127_ = 256 - i_127_;
					int i_129_ = is_102_[i_104_];
					is_102_[i_104_++] = (((i_127_ * (i_129_ & 0xff00) & 0xff0000) + ((i_129_ & 0xff00ff) * i_127_ & ~0xff00ff)) >> 8) + i_128_;
				} else
					i_104_++;
			}
			i_103_ += i_125_ + i_108_;
			i_104_ += i_125_ + i_107_;
		}
	}

	void method14261(byte[] is, int[] is_130_, int i, int i_131_, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_, Class455 class455, int i_140_, int i_141_) {
		PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
		int[] is_142_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
		int[] is_143_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
		int i_144_ = (i_137_ - (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983) * 72550989);
		int i_145_ = i_138_;
		if (i_141_ > i_145_) {
			i_145_ = i_141_;
			i_132_ += ((i_141_ - i_138_) * (444800403 * (((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt8980)));
			i_131_ += i_139_ * (i_141_ - i_138_);
		}
		int i_146_ = (i_141_ + is_142_.length < i_138_ + i_134_ ? is_142_.length + i_141_ : i_138_ + i_134_);
		for (int i_147_ = i_145_; i_147_ < i_146_; i_147_++) {
			int i_148_ = i_140_ + is_142_[i_147_ - i_141_];
			int i_149_ = is_143_[i_147_ - i_141_];
			int i_150_ = i_133_;
			if (i_144_ > i_148_) {
				int i_151_ = i_144_ - i_148_;
				if (i_151_ >= i_149_) {
					i_131_ += i_133_ + i_136_;
					i_132_ += i_135_ + i_133_;
					continue;
				}
				i_149_ -= i_151_;
			} else {
				int i_152_ = i_148_ - i_144_;
				if (i_152_ >= i_133_) {
					i_131_ += i_136_ + i_133_;
					i_132_ += i_133_ + i_135_;
					continue;
				}
				i_131_ += i_152_;
				i_150_ -= i_152_;
				i_132_ += i_152_;
			}
			int i_153_ = 0;
			if (i_150_ < i_149_)
				i_149_ = i_150_;
			else
				i_153_ = i_150_ - i_149_;
			for (int i_154_ = -i_149_; i_154_ < 0; i_154_++) {
				int i_155_ = is[i_131_++] & 0xff;
				if (i_155_ != 0) {
					int i_156_ = ((((i & 0xff00) * i_155_ & 0xff0000) + (i_155_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					i_155_ = 256 - i_155_;
					int i_157_ = is_130_[i_132_];
					is_130_[i_132_++] = (((i_155_ * (i_157_ & 0xff00) & 0xff0000) + ((i_157_ & 0xff00ff) * i_155_ & ~0xff00ff)) >> 8) + i_156_;
				} else
					i_132_++;
			}
			i_131_ += i_153_ + i_136_;
			i_132_ += i_153_ + i_135_;
		}
	}

	Class8_Sub2(HardwareRenderer class505_sub3, FontMetrics class414, Class91[] class91s, int[] is, int[] is_158_) {
		super(class505_sub3, class414);
		((Class8_Sub2) this).aClass505_Sub3_8889 = class505_sub3;
		((Class8_Sub2) this).aClass505_Sub3_8889 = class505_sub3;
		((Class8_Sub2) this).anIntArray8886 = is;
		((Class8_Sub2) this).anIntArray8888 = is_158_;
		((Class8_Sub2) this).aByteArrayArray8887 = new byte[class91s.length][];
		((Class8_Sub2) this).anIntArray8890 = new int[class91s.length];
		((Class8_Sub2) this).anIntArray8891 = new int[class91s.length];
		for (int i = 0; i < class91s.length; i++) {
			Class91 class91 = class91s[i];
			if (null != class91.aByteArray961)
				((Class8_Sub2) this).aByteArrayArray8887[i] = class91.aByteArray961;
			else {
				byte[] is_159_ = class91.aByteArray960;
				byte[] is_160_ = (((Class8_Sub2) this).aByteArrayArray8887[i] = new byte[is_159_.length]);
				for (int i_161_ = 0; i_161_ < is_159_.length; i_161_++)
					is_160_[i_161_] = (byte) (is_159_[i_161_] == 0 ? 0 : -1);
			}
			((Class8_Sub2) this).anIntArray8890[i] = class91.anInt959;
			((Class8_Sub2) this).anIntArray8891[i] = class91.anInt956;
		}
	}

	void method374(char c, int i, int i_162_, int i_163_, boolean bool, Class455 class455, int i_164_, int i_165_) {
		if (null != (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anIntArray8979)) {
			if (null == class455)
				UA(c, i, i_162_, i_163_, bool);
			else {
				i += ((Class8_Sub2) this).anIntArray8891[c];
				i_162_ += ((Class8_Sub2) this).anIntArray8890[c];
				int i_166_ = ((Class8_Sub2) this).anIntArray8886[c];
				int i_167_ = ((Class8_Sub2) this).anIntArray8888[c];
				int i_168_ = (444800403 * ((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8980);
				int i_169_ = i + i_162_ * i_168_;
				int i_170_ = i_168_ - i_166_;
				int i_171_ = 0;
				int i_172_ = 0;
				if (i_162_ < 1516535457 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt9009)) {
					int i_173_ = (1516535457 * ((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt9009 - i_162_);
					i_167_ -= i_173_;
					i_162_ = (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt9009) * 1516535457;
					i_172_ += i_173_ * i_166_;
					i_169_ += i_173_ * i_168_;
				}
				if (i_167_ + i_162_ > (((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt8986) * 1383960921)
					i_167_ -= (i_167_ + i_162_ - 1383960921 * ((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt8986);
				if (i < 72550989 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983)) {
					int i_174_ = (72550989 * (((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt8983) - i);
					i_166_ -= i_174_;
					i = 72550989 * (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt8983);
					i_172_ += i_174_;
					i_169_ += i_174_;
					i_171_ += i_174_;
					i_170_ += i_174_;
				}
				if (i_166_ + i > (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anInt9002) * -1710988237) {
					int i_175_ = (i + i_166_ - -1710988237 * ((HardwareRenderer) (((Class8_Sub2) this).aClass505_Sub3_8889)).anInt9002);
					i_166_ -= i_175_;
					i_171_ += i_175_;
					i_170_ += i_175_;
				}
				if (i_166_ > 0 && i_167_ > 0)
					method14258(((Class8_Sub2) this).aByteArrayArray8887[c], (((HardwareRenderer) ((Class8_Sub2) this).aClass505_Sub3_8889).anIntArray8979), i_163_, i_172_, i_169_, i_166_, i_167_, i_170_, i_171_, i, i_162_, ((Class8_Sub2) this).anIntArray8886[c], class455, i_164_, i_165_);
			}
		}
	}

	static void method14262(int i) {
		Class282_Sub30.aClass465_7711.method7749(-1390768924);
	}

	public static void method14263(int i, int i_176_, byte i_177_) {
		Class291_Sub1.anInt8014 = (i - Class291_Sub1.anInt3472) * 1089992553;
		Class291_Sub1.anInt8016 = (i_176_ - Class291_Sub1.anInt3473) * -638834387;
	}

	public static void method14264(RsBitsBuffer class282_sub35_sub2, int i) {
		Class282_Sub42 class282_sub42 = (Class282_Sub42) Class435.aClass482_5332.head((byte) 121);
		if (class282_sub42 != null) {
			int i_178_ = class282_sub35_sub2.index * -1990677291;
			class282_sub35_sub2.writeInt(1935007287 * (((Class282_Sub42) class282_sub42).anInt8038));
			for (int i_179_ = 0; (i_179_ < -286349405 * ((Class282_Sub42) class282_sub42).anInt8033); i_179_++) {
				if (0 != (((Class282_Sub42) class282_sub42).anIntArray8036[i_179_]))
					class282_sub35_sub2.writeByte((((Class282_Sub42) class282_sub42).anIntArray8036[i_179_]));
				else {
					try {
						int i_180_ = (((Class282_Sub42) class282_sub42).anIntArray8035[i_179_]);
						if (i_180_ == 0) {
							Field field = (((Class282_Sub42) class282_sub42).aFieldArray8037[i_179_]);
							int i_181_ = field.getInt(null);
							class282_sub35_sub2.writeByte(0);
							class282_sub35_sub2.writeInt(i_181_);
						} else if (1 == i_180_) {
							Field field = (((Class282_Sub42) class282_sub42).aFieldArray8037[i_179_]);
							field.setInt(null, (((Class282_Sub42) class282_sub42).anIntArray8040[i_179_]));
							class282_sub35_sub2.writeByte(0);
						} else if (2 == i_180_) {
							Field field = (((Class282_Sub42) class282_sub42).aFieldArray8037[i_179_]);
							int i_182_ = field.getModifiers();
							class282_sub35_sub2.writeByte(0);
							class282_sub35_sub2.writeInt(i_182_);
						}
						if (i_180_ == 3) {
							Method method = (((Class282_Sub42) class282_sub42).aMethodArray8034[i_179_]);
							byte[][] is = (((Class282_Sub42) class282_sub42).aByteArrayArrayArray8041[i_179_]);
							Object[] objects = new Object[is.length];
							for (int i_183_ = 0; i_183_ < is.length; i_183_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_183_])));
								objects[i_183_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (null == object)
								class282_sub35_sub2.writeByte(0);
							else if (object instanceof Number) {
								class282_sub35_sub2.writeByte(1);
								class282_sub35_sub2.writeLong(((Number) object).longValue());
							} else if (object instanceof String) {
								class282_sub35_sub2.writeByte(2);
								class282_sub35_sub2.writeString((String) object);
							} else
								class282_sub35_sub2.writeByte(4);
						} else if (i_180_ == 4) {
							Method method = (((Class282_Sub42) class282_sub42).aMethodArray8034[i_179_]);
							int i_184_ = method.getModifiers();
							class282_sub35_sub2.writeByte(0);
							class282_sub35_sub2.writeInt(i_184_);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class282_sub35_sub2.writeByte(-10);
					} catch (InvalidClassException invalidclassexception) {
						class282_sub35_sub2.writeByte(-11);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class282_sub35_sub2.writeByte(-12);
					} catch (OptionalDataException optionaldataexception) {
						class282_sub35_sub2.writeByte(-13);
					} catch (IllegalAccessException illegalaccessexception) {
						class282_sub35_sub2.writeByte(-14);
					} catch (IllegalArgumentException illegalargumentexception) {
						class282_sub35_sub2.writeByte(-15);
					} catch (InvocationTargetException invocationtargetexception) {
						class282_sub35_sub2.writeByte(-16);
					} catch (SecurityException securityexception) {
						class282_sub35_sub2.writeByte(-17);
					} catch (IOException ioexception) {
						class282_sub35_sub2.writeByte(-18);
					} catch (NullPointerException nullpointerexception) {
						class282_sub35_sub2.writeByte(-19);
					} catch (Exception exception) {
						class282_sub35_sub2.writeByte(-20);
					} catch (Throwable throwable) {
						class282_sub35_sub2.writeByte(-21);
					}
				}
			}
			class282_sub35_sub2.method13104(i_178_, -419087977);
			class282_sub42.remove();
		}
	}
}
