/* Class264_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class264_Sub4 extends Class264 {
	int[] anIntArray7132;
	int[] anIntArray7133;
	int[] anIntArray7134;
	byte[][] aByteArrayArray7135;
	int[] anIntArray7136;
	Class_ra_Sub1 aClass_ra_Sub1_7137;

	Class264_Sub4(Class_ra_Sub1 class_ra_sub1, Class505 class505, Class89[] class89s, int[] is, int[] is_0_) {
		super(class_ra_sub1, class505);
		((Class264_Sub4) this).aClass_ra_Sub1_7137 = class_ra_sub1;
		((Class264_Sub4) this).anIntArray7133 = is;
		((Class264_Sub4) this).anIntArray7132 = is_0_;
		((Class264_Sub4) this).aByteArrayArray7135 = new byte[class89s.length][];
		((Class264_Sub4) this).anIntArray7136 = new int[class89s.length];
		((Class264_Sub4) this).anIntArray7134 = new int[class89s.length];
		for (int i = 0; i < class89s.length; i++) {
			((Class264_Sub4) this).aByteArrayArray7135[i] = class89s[i].aByteArray818;
			((Class264_Sub4) this).anIntArray7136[i] = class89s[i].anInt811;
			((Class264_Sub4) this).anIntArray7134[i] = class89s[i].anInt815;
		}
	}

	void method2509(byte[] is, int[] is_1_, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		int i_8_ = i >>> 24;
		int i_9_ = 255 - i_8_;
		for (int i_10_ = -i_5_; i_10_ < 0; i_10_++) {
			for (int i_11_ = -i_4_; i_11_ < 0; i_11_++) {
				if (is[i_2_++] != 0) {
					int i_12_ = ((((i & 0xff00) * i_8_ & 0xff0000) + (i_8_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_13_ = is_1_[i_3_];
					is_1_[i_3_++] = (((i_9_ * (i_13_ & 0xff00ff) & ~0xff00ff) + (i_9_ * (i_13_ & 0xff00) & 0xff0000)) >> 8) + i_12_;
				} else
					i_3_++;
			}
			i_3_ += i_6_;
			i_2_ += i_7_;
		}
	}

	void method2486(char c, int i, int i_14_, int i_15_, boolean bool, Class_ta class_ta, int i_16_, int i_17_) {
		if ((((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anIntArray7967) != null) {
			if (null == class_ta)
				UA(c, i, i_14_, i_15_, bool);
			else {
				i += ((Class264_Sub4) this).anIntArray7134[c];
				i_14_ += ((Class264_Sub4) this).anIntArray7136[c];
				int i_18_ = ((Class264_Sub4) this).anIntArray7133[c];
				int i_19_ = ((Class264_Sub4) this).anIntArray7132[c];
				int i_20_ = (692106883 * ((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7971);
				int i_21_ = i + i_14_ * i_20_;
				int i_22_ = i_20_ - i_18_;
				int i_23_ = 0;
				int i_24_ = 0;
				if (i_14_ < -1278653805 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7976)) {
					int i_25_ = ((((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7976) * -1278653805 - i_14_);
					i_19_ -= i_25_;
					i_14_ = -1278653805 * ((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7976;
					i_24_ += i_25_ * i_18_;
					i_21_ += i_25_ * i_20_;
				}
				if (i_19_ + i_14_ > (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7977) * 63686679)
					i_19_ -= i_19_ + i_14_ - 63686679 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7977);
				if (i < -912871679 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7974)) {
					int i_26_ = (-912871679 * ((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7974 - i);
					i_18_ -= i_26_;
					i = -912871679 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7974);
					i_24_ += i_26_;
					i_21_ += i_26_;
					i_23_ += i_26_;
					i_22_ += i_26_;
				}
				if (i_18_ + i > -1416794725 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7991)) {
					int i_27_ = i_18_ + i - (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7991) * -1416794725;
					i_18_ -= i_27_;
					i_23_ += i_27_;
					i_22_ += i_27_;
				}
				if (i_18_ > 0 && i_19_ > 0) {
					if (-16777216 == (i_15_ & ~0xffffff))
						method2510((((Class264_Sub4) this).aByteArrayArray7135[c]), (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anIntArray7967), i_15_, i_24_, i_21_, i_18_, i_19_, i_22_, i_23_, i, i_14_, ((Class264_Sub4) this).anIntArray7133[c], class_ta, i_16_, i_17_);
					else
						method2512((((Class264_Sub4) this).aByteArrayArray7135[c]), (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anIntArray7967), i_15_, i_24_, i_21_, i_18_, i_19_, i_22_, i_23_, i, i_14_, ((Class264_Sub4) this).anIntArray7133[c], class_ta, i_16_, i_17_);
				}
			}
		}
	}

	void method2510(byte[] is, int[] is_28_, int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, Class_ta class_ta, int i_38_, int i_39_) {
		Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
		int[] is_40_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
		int[] is_41_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
		int i_42_ = i_36_;
		if (i_39_ > i_42_) {
			i_42_ = i_39_;
			i_30_ += (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7971 * 692106883 * (i_39_ - i_36_));
			i_29_ += (i_39_ - i_36_) * i_37_;
		}
		int i_43_ = (is_40_.length + i_39_ < i_32_ + i_36_ ? i_39_ + is_40_.length : i_36_ + i_32_);
		for (int i_44_ = i_42_; i_44_ < i_43_; i_44_++) {
			int i_45_ = is_40_[i_44_ - i_39_] + i_38_;
			int i_46_ = is_41_[i_44_ - i_39_];
			int i_47_ = i_31_;
			if (i_35_ > i_45_) {
				int i_48_ = i_35_ - i_45_;
				if (i_48_ >= i_46_) {
					i_29_ += i_31_ + i_34_;
					i_30_ += i_33_ + i_31_;
					continue;
				}
				i_46_ -= i_48_;
			} else {
				int i_49_ = i_45_ - i_35_;
				if (i_49_ >= i_31_) {
					i_29_ += i_31_ + i_34_;
					i_30_ += i_33_ + i_31_;
					continue;
				}
				i_29_ += i_49_;
				i_47_ -= i_49_;
				i_30_ += i_49_;
			}
			int i_50_ = 0;
			if (i_47_ < i_46_)
				i_46_ = i_47_;
			else
				i_50_ = i_47_ - i_46_;
			for (int i_51_ = 0; i_51_ < i_46_; i_51_++) {
				if (is[i_29_++] != 0)
					is_28_[i_30_++] = i;
				else
					i_30_++;
			}
			i_29_ += i_50_ + i_34_;
			i_30_ += i_33_ + i_50_;
		}
	}

	void method2511(byte[] is, int[] is_52_, int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_) {
		int i_59_ = -(i_55_ >> 2);
		i_55_ = -(i_55_ & 0x3);
		for (int i_60_ = -i_56_; i_60_ < 0; i_60_++) {
			for (int i_61_ = i_59_; i_61_ < 0; i_61_++) {
				if (is[i_53_++] != 0)
					is_52_[i_54_++] = i;
				else
					i_54_++;
				if (is[i_53_++] != 0)
					is_52_[i_54_++] = i;
				else
					i_54_++;
				if (is[i_53_++] != 0)
					is_52_[i_54_++] = i;
				else
					i_54_++;
				if (is[i_53_++] != 0)
					is_52_[i_54_++] = i;
				else
					i_54_++;
			}
			for (int i_62_ = i_55_; i_62_ < 0; i_62_++) {
				if (is[i_53_++] != 0)
					is_52_[i_54_++] = i;
				else
					i_54_++;
			}
			i_54_ += i_57_;
			i_53_ += i_58_;
		}
	}

	void method2512(byte[] is, int[] is_63_, int i, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, Class_ta class_ta, int i_73_, int i_74_) {
		Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
		int[] is_75_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
		int[] is_76_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
		int i_77_ = i_70_ - -912871679 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7974);
		int i_78_ = i_71_;
		if (i_74_ > i_78_) {
			i_78_ = i_74_;
			i_65_ += ((i_74_ - i_71_) * (692106883 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7971)));
			i_64_ += (i_74_ - i_71_) * i_72_;
		}
		int i_79_ = (i_74_ + is_75_.length < i_71_ + i_67_ ? is_75_.length + i_74_ : i_67_ + i_71_);
		int i_80_ = i >>> 24;
		int i_81_ = 255 - i_80_;
		for (int i_82_ = i_78_; i_82_ < i_79_; i_82_++) {
			int i_83_ = i_73_ + is_75_[i_82_ - i_74_];
			int i_84_ = is_76_[i_82_ - i_74_];
			int i_85_ = i_66_;
			if (i_77_ > i_83_) {
				int i_86_ = i_77_ - i_83_;
				if (i_86_ >= i_84_) {
					i_64_ += i_66_ + i_69_;
					i_65_ += i_66_ + i_68_;
					continue;
				}
				i_84_ -= i_86_;
			} else {
				int i_87_ = i_83_ - i_77_;
				if (i_87_ >= i_66_) {
					i_64_ += i_69_ + i_66_;
					i_65_ += i_68_ + i_66_;
					continue;
				}
				i_64_ += i_87_;
				i_85_ -= i_87_;
				i_65_ += i_87_;
			}
			int i_88_ = 0;
			if (i_85_ < i_84_)
				i_84_ = i_85_;
			else
				i_88_ = i_85_ - i_84_;
			for (int i_89_ = -i_84_; i_89_ < 0; i_89_++) {
				if (is[i_64_++] != 0) {
					int i_90_ = ((((i & 0xff00) * i_80_ & 0xff0000) + (i_80_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_91_ = is_63_[i_65_];
					is_63_[i_65_++] = i_90_ + (((i_81_ * (i_91_ & 0xff00ff) & ~0xff00ff) + ((i_91_ & 0xff00) * i_81_ & 0xff0000)) >> 8);
				} else
					i_65_++;
			}
			i_64_ += i_88_ + i_69_;
			i_65_ += i_88_ + i_68_;
		}
	}

	void e(char c, int i, int i_92_, int i_93_, boolean bool) {
		if (null != (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anIntArray7967)) {
			i += ((Class264_Sub4) this).anIntArray7134[c];
			i_92_ += ((Class264_Sub4) this).anIntArray7136[c];
			int i_94_ = ((Class264_Sub4) this).anIntArray7133[c];
			int i_95_ = ((Class264_Sub4) this).anIntArray7132[c];
			int i_96_ = (692106883 * ((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7971);
			int i_97_ = i + i_92_ * i_96_;
			int i_98_ = i_96_ - i_94_;
			int i_99_ = 0;
			int i_100_ = 0;
			if (i_92_ < (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7976) * -1278653805) {
				int i_101_ = (-1278653805 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7976) - i_92_);
				i_95_ -= i_101_;
				i_92_ = (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7976 * -1278653805);
				i_100_ += i_94_ * i_101_;
				i_97_ += i_101_ * i_96_;
			}
			if (i_95_ + i_92_ > 63686679 * (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7977))
				i_95_ -= (i_92_ + i_95_ - (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7977 * 63686679));
			if (i < (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7974) * -912871679) {
				int i_102_ = (-912871679 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7974) - i);
				i_94_ -= i_102_;
				i = (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7974 * -912871679);
				i_100_ += i_102_;
				i_97_ += i_102_;
				i_99_ += i_102_;
				i_98_ += i_102_;
			}
			if (i_94_ + i > (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7991) * -1416794725) {
				int i_103_ = (i_94_ + i - -1416794725 * ((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7991);
				i_94_ -= i_103_;
				i_99_ += i_103_;
				i_98_ += i_103_;
			}
			if (i_94_ > 0 && i_95_ > 0) {
				if ((i_93_ & ~0xffffff) == -16777216)
					method2511(((Class264_Sub4) this).aByteArrayArray7135[c], (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anIntArray7967), i_93_, i_100_, i_97_, i_94_, i_95_, i_98_, i_99_);
				else if (0 != (i_93_ & ~0xffffff))
					method2509(((Class264_Sub4) this).aByteArrayArray7135[c], (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anIntArray7967), i_93_, i_100_, i_97_, i_94_, i_95_, i_98_, i_99_);
			}
		}
	}

	void UA(char c, int i, int i_104_, int i_105_, boolean bool) {
		if (null != (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anIntArray7967)) {
			i += ((Class264_Sub4) this).anIntArray7134[c];
			i_104_ += ((Class264_Sub4) this).anIntArray7136[c];
			int i_106_ = ((Class264_Sub4) this).anIntArray7133[c];
			int i_107_ = ((Class264_Sub4) this).anIntArray7132[c];
			int i_108_ = 692106883 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7971);
			int i_109_ = i + i_104_ * i_108_;
			int i_110_ = i_108_ - i_106_;
			int i_111_ = 0;
			int i_112_ = 0;
			if (i_104_ < (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7976) * -1278653805) {
				int i_113_ = (-1278653805 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7976) - i_104_);
				i_107_ -= i_113_;
				i_104_ = (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7976 * -1278653805);
				i_112_ += i_106_ * i_113_;
				i_109_ += i_113_ * i_108_;
			}
			if (i_107_ + i_104_ > 63686679 * (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7977))
				i_107_ -= (i_104_ + i_107_ - (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7974) * -912871679) {
				int i_114_ = (-912871679 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7974) - i);
				i_106_ -= i_114_;
				i = (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7974 * -912871679);
				i_112_ += i_114_;
				i_109_ += i_114_;
				i_111_ += i_114_;
				i_110_ += i_114_;
			}
			if (i_106_ + i > (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7991) * -1416794725) {
				int i_115_ = (i_106_ + i - -1416794725 * ((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7991);
				i_106_ -= i_115_;
				i_111_ += i_115_;
				i_110_ += i_115_;
			}
			if (i_106_ > 0 && i_107_ > 0) {
				if ((i_105_ & ~0xffffff) == -16777216)
					method2511(((Class264_Sub4) this).aByteArrayArray7135[c], (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anIntArray7967), i_105_, i_112_, i_109_, i_106_, i_107_, i_110_, i_111_);
				else if (0 != (i_105_ & ~0xffffff))
					method2509(((Class264_Sub4) this).aByteArrayArray7135[c], (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anIntArray7967), i_105_, i_112_, i_109_, i_106_, i_107_, i_110_, i_111_);
			}
		}
	}

	void g(char c, int i, int i_116_, int i_117_, boolean bool) {
		if (null != (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anIntArray7967)) {
			i += ((Class264_Sub4) this).anIntArray7134[c];
			i_116_ += ((Class264_Sub4) this).anIntArray7136[c];
			int i_118_ = ((Class264_Sub4) this).anIntArray7133[c];
			int i_119_ = ((Class264_Sub4) this).anIntArray7132[c];
			int i_120_ = 692106883 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7971);
			int i_121_ = i + i_116_ * i_120_;
			int i_122_ = i_120_ - i_118_;
			int i_123_ = 0;
			int i_124_ = 0;
			if (i_116_ < (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7976) * -1278653805) {
				int i_125_ = (-1278653805 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7976) - i_116_);
				i_119_ -= i_125_;
				i_116_ = (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7976 * -1278653805);
				i_124_ += i_118_ * i_125_;
				i_121_ += i_125_ * i_120_;
			}
			if (i_119_ + i_116_ > 63686679 * (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7977))
				i_119_ -= (i_116_ + i_119_ - (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7974) * -912871679) {
				int i_126_ = (-912871679 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7974) - i);
				i_118_ -= i_126_;
				i = (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7974 * -912871679);
				i_124_ += i_126_;
				i_121_ += i_126_;
				i_123_ += i_126_;
				i_122_ += i_126_;
			}
			if (i_118_ + i > (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7991) * -1416794725) {
				int i_127_ = (i_118_ + i - -1416794725 * ((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7991);
				i_118_ -= i_127_;
				i_123_ += i_127_;
				i_122_ += i_127_;
			}
			if (i_118_ > 0 && i_119_ > 0) {
				if ((i_117_ & ~0xffffff) == -16777216)
					method2511(((Class264_Sub4) this).aByteArrayArray7135[c], (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anIntArray7967), i_117_, i_124_, i_121_, i_118_, i_119_, i_122_, i_123_);
				else if (0 != (i_117_ & ~0xffffff))
					method2509(((Class264_Sub4) this).aByteArrayArray7135[c], (((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anIntArray7967), i_117_, i_124_, i_121_, i_118_, i_119_, i_122_, i_123_);
			}
		}
	}

	void method2489(char c, int i, int i_128_, int i_129_, boolean bool, Class_ta class_ta, int i_130_, int i_131_) {
		if ((((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anIntArray7967) != null) {
			if (null == class_ta)
				UA(c, i, i_128_, i_129_, bool);
			else {
				i += ((Class264_Sub4) this).anIntArray7134[c];
				i_128_ += ((Class264_Sub4) this).anIntArray7136[c];
				int i_132_ = ((Class264_Sub4) this).anIntArray7133[c];
				int i_133_ = ((Class264_Sub4) this).anIntArray7132[c];
				int i_134_ = (692106883 * ((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7971);
				int i_135_ = i + i_128_ * i_134_;
				int i_136_ = i_134_ - i_132_;
				int i_137_ = 0;
				int i_138_ = 0;
				if (i_128_ < -1278653805 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7976)) {
					int i_139_ = ((((Class_ra_Sub1) ((Class264_Sub4) this).aClass_ra_Sub1_7137).anInt7976) * -1278653805 - i_128_);
					i_133_ -= i_139_;
					i_128_ = -1278653805 * ((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7976;
					i_138_ += i_139_ * i_132_;
					i_135_ += i_139_ * i_134_;
				}
				if (i_133_ + i_128_ > (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7977) * 63686679)
					i_133_ -= (i_133_ + i_128_ - 63686679 * ((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7977);
				if (i < -912871679 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7974)) {
					int i_140_ = (-912871679 * ((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7974 - i);
					i_132_ -= i_140_;
					i = -912871679 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7974);
					i_138_ += i_140_;
					i_135_ += i_140_;
					i_137_ += i_140_;
					i_136_ += i_140_;
				}
				if (i_132_ + i > -1416794725 * (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7991)) {
					int i_141_ = (i_132_ + i - (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anInt7991) * -1416794725);
					i_132_ -= i_141_;
					i_137_ += i_141_;
					i_136_ += i_141_;
				}
				if (i_132_ > 0 && i_133_ > 0) {
					if (-16777216 == (i_129_ & ~0xffffff))
						method2510((((Class264_Sub4) this).aByteArrayArray7135[c]), (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anIntArray7967), i_129_, i_138_, i_135_, i_132_, i_133_, i_136_, i_137_, i, i_128_, ((Class264_Sub4) this).anIntArray7133[c], class_ta, i_130_, i_131_);
					else
						method2512((((Class264_Sub4) this).aByteArrayArray7135[c]), (((Class_ra_Sub1) (((Class264_Sub4) this).aClass_ra_Sub1_7137)).anIntArray7967), i_129_, i_138_, i_135_, i_132_, i_133_, i_136_, i_137_, i, i_128_, ((Class264_Sub4) this).anIntArray7133[c], class_ta, i_130_, i_131_);
				}
			}
		}
	}

	public static void method2513(boolean bool, int i) {
		try {
			for (Class298_Sub41 class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass453_7421.method5939(1766612795)); null != class298_sub41; class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass453_7421.method5944(49146))) {
				if (null != (((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447)) {
					Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447);
					((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447 = null;
				}
				if (null != (((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426)) {
					Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426);
					((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426 = null;
				}
				class298_sub41.unlink(-1460969981);
			}
			if (bool) {
				for (Class298_Sub41 class298_sub41 = (Class298_Sub41) Class298_Sub41.aClass453_7455.method5939(1766612795); null != class298_sub41; class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass453_7455.method5944(49146))) {
					if (null != (((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447)) {
						Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447);
						((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447 = null;
					}
					class298_sub41.unlink(-1460969981);
				}
				for (Class298_Sub41 class298_sub41 = (Class298_Sub41) Class298_Sub41.aClass437_7440.method5816(1763526126); class298_sub41 != null; class298_sub41 = (Class298_Sub41) Class298_Sub41.aClass437_7440.method5815((byte) -17)) {
					if ((((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447) != null) {
						Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447);
						((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447 = null;
					}
					class298_sub41.unlink(-1460969981);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xw.a(").append(')').toString());
		}
	}

	public static int method2514(int i, int i_142_, int i_143_, short i_144_) {
		try {
			if (Class301_Sub1.anInt7624 * -1289394455 < 100)
				return -2;
			int i_145_ = -2;
			int i_146_ = 2147483647;
			int i_147_ = i_142_ - Class301_Sub1.anInt3245;
			int i_148_ = i_143_ - Class301_Sub1.anInt3238;
			for (Class298_Sub52 class298_sub52 = ((Class298_Sub52) Class301_Sub1.aClass453_3236.method5939(1766612795)); class298_sub52 != null; class298_sub52 = (Class298_Sub52) Class301_Sub1.aClass453_3236.method5944(49146)) {
				if (class298_sub52.anInt7608 * -530122905 != i) {
					if (i_144_ >= 128)
						throw new IllegalStateException();
				} else {
					int i_149_ = class298_sub52.anInt7607 * 2122110429;
					int i_150_ = class298_sub52.anInt7610 * -372920341;
					int i_151_ = (i_149_ + Class301_Sub1.anInt3245 << 14 | i_150_ + Class301_Sub1.anInt3238);
					int i_152_ = ((i_147_ - i_149_) * (i_147_ - i_149_) + (i_148_ - i_150_) * (i_148_ - i_150_));
					if (i_145_ < 0 || i_152_ < i_146_) {
						i_145_ = i_151_;
						i_146_ = i_152_;
					}
				}
			}
			return i_145_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xw.ck(").append(')').toString());
		}
	}

	public static Class318 method2515(Socket socket, int i, int i_153_) throws IOException {
		try {
			return new Class318_Sub1(socket, i);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xw.a(").append(')').toString());
		}
	}

	static final void method2516(ClientScript2 class403, int i) {
		try {
			int i_154_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (i_154_ != Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub19_7567.method5695(-1741518508)) {
				Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub19_7567, i_154_, -814728981);
				Class3.method300(656179282);
				client.aBoolean8666 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xw.ajd(").append(')').toString());
		}
	}
}
