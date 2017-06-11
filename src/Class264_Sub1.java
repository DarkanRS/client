/* Class264_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class264_Sub1 extends Class264 {
	int[] anIntArray7115;
	int[] anIntArray7116;
	int[] anIntArray7117;
	int[] anIntArray7118;
	Class_ra_Sub1 aClass_ra_Sub1_7119;
	byte[][] aByteArrayArray7120;
	int[] anIntArray7121;

	void method2499(byte[] is, int[] is_0_, int[] is_1_, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		int i_7_ = -(i_3_ >> 2);
		i_3_ = -(i_3_ & 0x3);
		boolean bool = false;
		for (int i_8_ = -i_4_; i_8_ < 0; i_8_++) {
			for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
				int i_10_;
				if ((i_10_ = is[i++]) != 0)
					is_0_[i_2_++] = is_1_[i_10_ & 0xff];
				else
					i_2_++;
				if ((i_10_ = is[i++]) != 0)
					is_0_[i_2_++] = is_1_[i_10_ & 0xff];
				else
					i_2_++;
				if ((i_10_ = is[i++]) != 0)
					is_0_[i_2_++] = is_1_[i_10_ & 0xff];
				else
					i_2_++;
				if ((i_10_ = is[i++]) != 0)
					is_0_[i_2_++] = is_1_[i_10_ & 0xff];
				else
					i_2_++;
			}
			for (int i_11_ = i_3_; i_11_ < 0; i_11_++) {
				int i_12_;
				if ((i_12_ = is[i++]) != 0)
					is_0_[i_2_++] = is_1_[i_12_ & 0xff];
				else
					i_2_++;
			}
			i_2_ += i_5_;
			i += i_6_;
		}
	}

	void method2500(byte[] is, int[] is_13_, int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		int i_20_ = -(i_16_ >> 2);
		i_16_ = -(i_16_ & 0x3);
		for (int i_21_ = -i_17_; i_21_ < 0; i_21_++) {
			for (int i_22_ = i_20_; i_22_ < 0; i_22_++) {
				if (is[i_14_++] != 0)
					is_13_[i_15_++] = i;
				else
					i_15_++;
				if (is[i_14_++] != 0)
					is_13_[i_15_++] = i;
				else
					i_15_++;
				if (is[i_14_++] != 0)
					is_13_[i_15_++] = i;
				else
					i_15_++;
				if (is[i_14_++] != 0)
					is_13_[i_15_++] = i;
				else
					i_15_++;
			}
			for (int i_23_ = i_16_; i_23_ < 0; i_23_++) {
				if (is[i_14_++] != 0)
					is_13_[i_15_++] = i;
				else
					i_15_++;
			}
			i_15_ += i_18_;
			i_14_ += i_19_;
		}
	}

	Class264_Sub1(Class_ra_Sub1 class_ra_sub1, Class505 class505, Class89[] class89s, int[] is, int[] is_24_) {
		super(class_ra_sub1, class505);
		((Class264_Sub1) this).aClass_ra_Sub1_7119 = class_ra_sub1;
		((Class264_Sub1) this).aClass_ra_Sub1_7119 = class_ra_sub1;
		((Class264_Sub1) this).anIntArray7118 = is;
		((Class264_Sub1) this).anIntArray7116 = is_24_;
		((Class264_Sub1) this).aByteArrayArray7120 = new byte[class89s.length][];
		((Class264_Sub1) this).anIntArray7115 = new int[class89s.length];
		((Class264_Sub1) this).anIntArray7121 = new int[class89s.length];
		for (int i = 0; i < class89s.length; i++) {
			((Class264_Sub1) this).aByteArrayArray7120[i] = class89s[i].aByteArray818;
			((Class264_Sub1) this).anIntArray7115[i] = class89s[i].anInt811;
			((Class264_Sub1) this).anIntArray7121[i] = class89s[i].anInt815;
		}
		((Class264_Sub1) this).anIntArray7117 = class89s[0].anIntArray817;
	}

	void method2501(byte[] is, int[] is_25_, int[] is_26_, int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, Class_ta class_ta, int i_36_, int i_37_) {
		Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
		int[] is_38_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
		int[] is_39_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
		int i_40_ = (i_33_ - (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7974) * -912871679);
		int i_41_ = i_34_;
		if (i_37_ > i_41_) {
			i_41_ = i_37_;
			i_28_ += ((i_37_ - i_34_) * (692106883 * (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7971)));
			i_27_ += i_35_ * (i_37_ - i_34_);
		}
		int i_42_ = (i_37_ + is_38_.length < i_30_ + i_34_ ? is_38_.length + i_37_ : i_30_ + i_34_);
		boolean bool = false;
		for (int i_43_ = i_41_; i_43_ < i_42_; i_43_++) {
			int i_44_ = i_36_ + is_38_[i_43_ - i_37_];
			int i_45_ = is_39_[i_43_ - i_37_];
			int i_46_ = i_29_;
			if (i_40_ > i_44_) {
				int i_47_ = i_40_ - i_44_;
				if (i_47_ >= i_45_) {
					i_27_ += i_32_ + i_29_;
					i_28_ += i_29_ + i_31_;
					continue;
				}
				i_45_ -= i_47_;
			} else {
				int i_48_ = i_44_ - i_40_;
				if (i_48_ >= i_29_) {
					i_27_ += i_32_ + i_29_;
					i_28_ += i_29_ + i_31_;
					continue;
				}
				i_27_ += i_48_;
				i_46_ -= i_48_;
				i_28_ += i_48_;
			}
			int i_49_ = 0;
			if (i_46_ < i_45_)
				i_45_ = i_46_;
			else
				i_49_ = i_46_ - i_45_;
			for (int i_50_ = -i_45_; i_50_ < 0; i_50_++) {
				int i_51_;
				if ((i_51_ = is[i_27_++]) != 0)
					is_25_[i_28_++] = is_26_[i_51_ & 0xff];
				else
					i_28_++;
			}
			i_27_ += i_32_ + i_49_;
			i_28_ += i_31_ + i_49_;
		}
	}

	void method2502(byte[] is, int[] is_52_, int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, Class_ta class_ta, int i_62_, int i_63_) {
		Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
		int[] is_64_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
		int[] is_65_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
		int i_66_ = (i_59_ - (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7974) * -912871679);
		int i_67_ = i_60_;
		if (i_63_ > i_67_) {
			i_67_ = i_63_;
			i_54_ += (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7971 * 692106883 * (i_63_ - i_60_));
			i_53_ += i_61_ * (i_63_ - i_60_);
		}
		int i_68_ = (i_63_ + is_64_.length < i_60_ + i_56_ ? is_64_.length + i_63_ : i_60_ + i_56_);
		for (int i_69_ = i_67_; i_69_ < i_68_; i_69_++) {
			int i_70_ = is_64_[i_69_ - i_63_] + i_62_;
			int i_71_ = is_65_[i_69_ - i_63_];
			int i_72_ = i_55_;
			if (i_66_ > i_70_) {
				int i_73_ = i_66_ - i_70_;
				if (i_73_ >= i_71_) {
					i_53_ += i_55_ + i_58_;
					i_54_ += i_57_ + i_55_;
					continue;
				}
				i_71_ -= i_73_;
			} else {
				int i_74_ = i_70_ - i_66_;
				if (i_74_ >= i_55_) {
					i_53_ += i_58_ + i_55_;
					i_54_ += i_57_ + i_55_;
					continue;
				}
				i_53_ += i_74_;
				i_72_ -= i_74_;
				i_54_ += i_74_;
			}
			int i_75_ = 0;
			if (i_72_ < i_71_)
				i_71_ = i_72_;
			else
				i_75_ = i_72_ - i_71_;
			for (int i_76_ = -i_71_; i_76_ < 0; i_76_++) {
				if (is[i_53_++] != 0)
					is_52_[i_54_++] = i;
				else
					i_54_++;
			}
			i_53_ += i_75_ + i_53_;
			i_54_ += i_75_ + i_57_;
		}
	}

	void g(char c, int i, int i_77_, int i_78_, boolean bool) {
		if (null != (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anIntArray7967)) {
			i += ((Class264_Sub1) this).anIntArray7121[c];
			i_77_ += ((Class264_Sub1) this).anIntArray7115[c];
			int i_79_ = ((Class264_Sub1) this).anIntArray7118[c];
			int i_80_ = ((Class264_Sub1) this).anIntArray7116[c];
			int i_81_ = (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7971) * 692106883;
			int i_82_ = i_77_ * i_81_ + i;
			int i_83_ = i_81_ - i_79_;
			int i_84_ = 0;
			int i_85_ = 0;
			if (i_77_ < (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7976) * -1278653805) {
				int i_86_ = ((((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7976) * -1278653805 - i_77_);
				i_80_ -= i_86_;
				i_77_ = (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7976 * -1278653805);
				i_85_ += i_86_ * i_79_;
				i_82_ += i_81_ * i_86_;
			}
			if (i_80_ + i_77_ > (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7977) * 63686679)
				i_80_ -= i_77_ + i_80_ - 63686679 * (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7977);
			if (i < (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7974) * -912871679) {
				int i_87_ = (-912871679 * (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7974) - i);
				i_79_ -= i_87_;
				i = (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7974 * -912871679);
				i_85_ += i_87_;
				i_82_ += i_87_;
				i_84_ += i_87_;
				i_83_ += i_87_;
			}
			if (i + i_79_ > -1416794725 * (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7991)) {
				int i_88_ = i + i_79_ - (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7991) * -1416794725;
				i_79_ -= i_88_;
				i_84_ += i_88_;
				i_83_ += i_88_;
			}
			if (i_79_ > 0 && i_80_ > 0) {
				if (bool)
					method2500(((Class264_Sub1) this).aByteArrayArray7120[c], (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anIntArray7967), i_78_, i_85_, i_82_, i_79_, i_80_, i_83_, i_84_);
				else
					method2499(((Class264_Sub1) this).aByteArrayArray7120[c], (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anIntArray7967), ((Class264_Sub1) this).anIntArray7117, i_85_, i_82_, i_79_, i_80_, i_83_, i_84_);
			}
		}
	}

	void e(char c, int i, int i_89_, int i_90_, boolean bool) {
		if (null != (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anIntArray7967)) {
			i += ((Class264_Sub1) this).anIntArray7121[c];
			i_89_ += ((Class264_Sub1) this).anIntArray7115[c];
			int i_91_ = ((Class264_Sub1) this).anIntArray7118[c];
			int i_92_ = ((Class264_Sub1) this).anIntArray7116[c];
			int i_93_ = (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7971) * 692106883;
			int i_94_ = i_89_ * i_93_ + i;
			int i_95_ = i_93_ - i_91_;
			int i_96_ = 0;
			int i_97_ = 0;
			if (i_89_ < (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7976) * -1278653805) {
				int i_98_ = ((((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7976) * -1278653805 - i_89_);
				i_92_ -= i_98_;
				i_89_ = (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7976 * -1278653805);
				i_97_ += i_98_ * i_91_;
				i_94_ += i_93_ * i_98_;
			}
			if (i_92_ + i_89_ > (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7977) * 63686679)
				i_92_ -= i_89_ + i_92_ - 63686679 * (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7977);
			if (i < (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7974) * -912871679) {
				int i_99_ = (-912871679 * (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7974) - i);
				i_91_ -= i_99_;
				i = (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7974 * -912871679);
				i_97_ += i_99_;
				i_94_ += i_99_;
				i_96_ += i_99_;
				i_95_ += i_99_;
			}
			if (i + i_91_ > -1416794725 * (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7991)) {
				int i_100_ = i + i_91_ - (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7991) * -1416794725;
				i_91_ -= i_100_;
				i_96_ += i_100_;
				i_95_ += i_100_;
			}
			if (i_91_ > 0 && i_92_ > 0) {
				if (bool)
					method2500(((Class264_Sub1) this).aByteArrayArray7120[c], (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anIntArray7967), i_90_, i_97_, i_94_, i_91_, i_92_, i_95_, i_96_);
				else
					method2499(((Class264_Sub1) this).aByteArrayArray7120[c], (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anIntArray7967), ((Class264_Sub1) this).anIntArray7117, i_97_, i_94_, i_91_, i_92_, i_95_, i_96_);
			}
		}
	}

	void method2486(char c, int i, int i_101_, int i_102_, boolean bool, Class_ta class_ta, int i_103_, int i_104_) {
		if ((((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anIntArray7967) != null) {
			if (class_ta == null)
				UA(c, i, i_101_, i_102_, bool);
			else {
				i += ((Class264_Sub1) this).anIntArray7121[c];
				i_101_ += ((Class264_Sub1) this).anIntArray7115[c];
				int i_105_ = ((Class264_Sub1) this).anIntArray7118[c];
				int i_106_ = ((Class264_Sub1) this).anIntArray7116[c];
				int i_107_ = (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7971 * 692106883);
				int i_108_ = i_101_ * i_107_ + i;
				int i_109_ = i_107_ - i_105_;
				int i_110_ = 0;
				int i_111_ = 0;
				if (i_101_ < (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7976) * -1278653805) {
					int i_112_ = ((((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7976) * -1278653805 - i_101_);
					i_106_ -= i_112_;
					i_101_ = -1278653805 * ((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7976;
					i_111_ += i_105_ * i_112_;
					i_108_ += i_107_ * i_112_;
				}
				if (i_106_ + i_101_ > (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7977) * 63686679)
					i_106_ -= (i_106_ + i_101_ - (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7977) * 63686679);
				if (i < -912871679 * (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7974)) {
					int i_113_ = (-912871679 * ((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7974 - i);
					i_105_ -= i_113_;
					i = (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7974 * -912871679);
					i_111_ += i_113_;
					i_108_ += i_113_;
					i_110_ += i_113_;
					i_109_ += i_113_;
				}
				if (i_105_ + i > -1416794725 * (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7991)) {
					int i_114_ = (i + i_105_ - (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7991) * -1416794725);
					i_105_ -= i_114_;
					i_110_ += i_114_;
					i_109_ += i_114_;
				}
				if (i_105_ > 0 && i_106_ > 0) {
					if (bool)
						method2502((((Class264_Sub1) this).aByteArrayArray7120[c]), (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anIntArray7967), i_102_, i_111_, i_108_, i_105_, i_106_, i_109_, i_110_, i, i_101_, ((Class264_Sub1) this).anIntArray7118[c], class_ta, i_103_, i_104_);
					else
						method2501((((Class264_Sub1) this).aByteArrayArray7120[c]), (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anIntArray7967), ((Class264_Sub1) this).anIntArray7117, i_102_, i_111_, i_108_, i_105_, i_106_, i_109_, i_110_, i, i_101_, ((Class264_Sub1) this).anIntArray7118[c], class_ta, i_103_, i_104_);
				}
			}
		}
	}

	void method2489(char c, int i, int i_115_, int i_116_, boolean bool, Class_ta class_ta, int i_117_, int i_118_) {
		if ((((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anIntArray7967) != null) {
			if (class_ta == null)
				UA(c, i, i_115_, i_116_, bool);
			else {
				i += ((Class264_Sub1) this).anIntArray7121[c];
				i_115_ += ((Class264_Sub1) this).anIntArray7115[c];
				int i_119_ = ((Class264_Sub1) this).anIntArray7118[c];
				int i_120_ = ((Class264_Sub1) this).anIntArray7116[c];
				int i_121_ = (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7971 * 692106883);
				int i_122_ = i_115_ * i_121_ + i;
				int i_123_ = i_121_ - i_119_;
				int i_124_ = 0;
				int i_125_ = 0;
				if (i_115_ < (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7976) * -1278653805) {
					int i_126_ = ((((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7976) * -1278653805 - i_115_);
					i_120_ -= i_126_;
					i_115_ = -1278653805 * ((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7976;
					i_125_ += i_119_ * i_126_;
					i_122_ += i_121_ * i_126_;
				}
				if (i_120_ + i_115_ > (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7977) * 63686679)
					i_120_ -= (i_120_ + i_115_ - (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7977) * 63686679);
				if (i < -912871679 * (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7974)) {
					int i_127_ = (-912871679 * ((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7974 - i);
					i_119_ -= i_127_;
					i = (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7974 * -912871679);
					i_125_ += i_127_;
					i_122_ += i_127_;
					i_124_ += i_127_;
					i_123_ += i_127_;
				}
				if (i_119_ + i > -1416794725 * (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7991)) {
					int i_128_ = (i + i_119_ - (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7991) * -1416794725);
					i_119_ -= i_128_;
					i_124_ += i_128_;
					i_123_ += i_128_;
				}
				if (i_119_ > 0 && i_120_ > 0) {
					if (bool)
						method2502((((Class264_Sub1) this).aByteArrayArray7120[c]), (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anIntArray7967), i_116_, i_125_, i_122_, i_119_, i_120_, i_123_, i_124_, i, i_115_, ((Class264_Sub1) this).anIntArray7118[c], class_ta, i_117_, i_118_);
					else
						method2501((((Class264_Sub1) this).aByteArrayArray7120[c]), (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anIntArray7967), ((Class264_Sub1) this).anIntArray7117, i_116_, i_125_, i_122_, i_119_, i_120_, i_123_, i_124_, i, i_115_, ((Class264_Sub1) this).anIntArray7118[c], class_ta, i_117_, i_118_);
				}
			}
		}
	}

	void UA(char c, int i, int i_129_, int i_130_, boolean bool) {
		if (null != (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anIntArray7967)) {
			i += ((Class264_Sub1) this).anIntArray7121[c];
			i_129_ += ((Class264_Sub1) this).anIntArray7115[c];
			int i_131_ = ((Class264_Sub1) this).anIntArray7118[c];
			int i_132_ = ((Class264_Sub1) this).anIntArray7116[c];
			int i_133_ = (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7971) * 692106883;
			int i_134_ = i_129_ * i_133_ + i;
			int i_135_ = i_133_ - i_131_;
			int i_136_ = 0;
			int i_137_ = 0;
			if (i_129_ < (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7976) * -1278653805) {
				int i_138_ = ((((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7976) * -1278653805 - i_129_);
				i_132_ -= i_138_;
				i_129_ = (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7976 * -1278653805);
				i_137_ += i_138_ * i_131_;
				i_134_ += i_133_ * i_138_;
			}
			if (i_132_ + i_129_ > (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7977) * 63686679)
				i_132_ -= (i_129_ + i_132_ - 63686679 * (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7977));
			if (i < (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7974) * -912871679) {
				int i_139_ = (-912871679 * (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7974) - i);
				i_131_ -= i_139_;
				i = (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7974 * -912871679);
				i_137_ += i_139_;
				i_134_ += i_139_;
				i_136_ += i_139_;
				i_135_ += i_139_;
			}
			if (i + i_131_ > -1416794725 * (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anInt7991)) {
				int i_140_ = i + i_131_ - (((Class_ra_Sub1) (((Class264_Sub1) this).aClass_ra_Sub1_7119)).anInt7991) * -1416794725;
				i_131_ -= i_140_;
				i_136_ += i_140_;
				i_135_ += i_140_;
			}
			if (i_131_ > 0 && i_132_ > 0) {
				if (bool)
					method2500(((Class264_Sub1) this).aByteArrayArray7120[c], (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anIntArray7967), i_130_, i_137_, i_134_, i_131_, i_132_, i_135_, i_136_);
				else
					method2499(((Class264_Sub1) this).aByteArrayArray7120[c], (((Class_ra_Sub1) ((Class264_Sub1) this).aClass_ra_Sub1_7119).anIntArray7967), ((Class264_Sub1) this).anIntArray7117, i_137_, i_134_, i_131_, i_132_, i_135_, i_136_);
			}
		}
	}

	public static final void method2503(int i, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_) {
		try {
			int i_146_ = i_142_ - i;
			int i_147_ = i_143_ - i_141_;
			if (i_146_ == 0) {
				if (i_147_ != 0)
					Class282.method2623(i, i_141_, i_143_, i_144_, -65962515);
			} else if (i_147_ == 0)
				Class321.method3926(i, i_142_, i_141_, i_144_, 1547095223);
			else {
				int i_148_ = (i_147_ << 12) / i_146_;
				int i_149_ = i_141_ - (i_148_ * i >> 12);
				int i_150_;
				int i_151_;
				if (i < Class372_Sub2.anInt4051 * -1424479739) {
					i_150_ = i_149_ + (i_148_ * (Class372_Sub2.anInt4051 * -1424479739) >> 12);
					i_151_ = -1424479739 * Class372_Sub2.anInt4051;
				} else if (i > 1135094847 * Class372_Sub2.anInt4048) {
					i_150_ = (i_148_ * (1135094847 * Class372_Sub2.anInt4048) >> 12) + i_149_;
					i_151_ = Class372_Sub2.anInt4048 * 1135094847;
				} else {
					i_150_ = i_141_;
					i_151_ = i;
				}
				int i_152_;
				int i_153_;
				if (i_142_ < Class372_Sub2.anInt4051 * -1424479739) {
					i_152_ = (i_148_ * (Class372_Sub2.anInt4051 * -1424479739) >> 12) + i_149_;
					i_153_ = -1424479739 * Class372_Sub2.anInt4051;
				} else if (i_142_ > 1135094847 * Class372_Sub2.anInt4048) {
					i_152_ = (Class372_Sub2.anInt4048 * 1135094847 * i_148_ >> 12) + i_149_;
					i_153_ = 1135094847 * Class372_Sub2.anInt4048;
				} else {
					i_152_ = i_143_;
					i_153_ = i_142_;
				}
				if (i_150_ < 1155384281 * Class372_Sub2.anInt4049) {
					i_150_ = 1155384281 * Class372_Sub2.anInt4049;
					i_151_ = (Class372_Sub2.anInt4049 * 1155384281 - i_149_ << 12) / i_148_;
				} else if (i_150_ > Class372_Sub2.anInt4050 * -1062447355) {
					i_150_ = -1062447355 * Class372_Sub2.anInt4050;
					i_151_ = (Class372_Sub2.anInt4050 * -1062447355 - i_149_ << 12) / i_148_;
				}
				if (i_152_ < Class372_Sub2.anInt4049 * 1155384281) {
					i_152_ = 1155384281 * Class372_Sub2.anInt4049;
					i_153_ = (Class372_Sub2.anInt4049 * 1155384281 - i_149_ << 12) / i_148_;
				} else if (i_152_ > Class372_Sub2.anInt4050 * -1062447355) {
					i_152_ = Class372_Sub2.anInt4050 * -1062447355;
					i_153_ = (Class372_Sub2.anInt4050 * -1062447355 - i_149_ << 12) / i_148_;
				}
				Class224.method2093(i_151_, i_150_, i_153_, i_152_, i_144_, -207106920);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xg.u(").append(')').toString());
		}
	}
}
