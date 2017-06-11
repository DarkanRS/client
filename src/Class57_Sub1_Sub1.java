/* Class57_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class57_Sub1_Sub1 extends Class57_Sub1 {
	int[] anIntArray9965;

	void method684(int[] is, int[] is_0_, int i, int i_1_) {
		int[] is_2_ = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is_2_ != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_3_ = anInt9001;
					while (i_3_ < 0) {
						int i_4_ = i_3_ + i_1_;
						if (i_4_ >= 0) {
							if (i_4_ >= is.length)
								break;
							int i_5_ = anInt9003;
							int i_6_ = anInt8988;
							int i_7_ = anInt9011;
							int i_8_ = anInt8999;
							if (i_6_ >= 0 && i_7_ >= 0 && i_6_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) < 0 && i_7_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) < 0) {
								int i_9_ = is[i_4_] - i;
								int i_10_ = -is_0_[i_4_];
								int i_11_ = i_9_ - (i_5_ - anInt9003);
								if (i_11_ > 0) {
									i_5_ += i_11_;
									i_8_ += i_11_;
									i_6_ += anInt9004 * i_11_;
									i_7_ += anInt8991 * i_11_;
								} else
									i_10_ -= i_11_;
								if (i_8_ < i_10_)
									i_8_ = i_10_;
								for (/**/; i_8_ < 0; i_8_++) {
									int i_12_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_7_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_6_ >> 12)]);
									int i_13_ = i_12_ >>> 24;
									int i_14_ = 256 - i_13_;
									int i_15_ = is_2_[i_5_];
									is_2_[i_5_++] = ((((i_12_ & 0xff00ff) * i_13_ + (i_15_ & 0xff00ff) * i_14_) & ~0xff00ff) + (((i_12_ & 0xff00) * i_13_ + (i_15_ & 0xff00) * i_14_) & 0xff0000)) >> 8;
								}
							}
						}
						i_3_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_16_ = anInt9001;
					while (i_16_ < 0) {
						int i_17_ = i_16_ + i_1_;
						if (i_17_ >= 0) {
							if (i_17_ >= is.length)
								break;
							int i_18_ = anInt9003;
							int i_19_ = anInt8988;
							int i_20_ = anInt9011 + anInt9013;
							int i_21_ = anInt8999;
							if (i_19_ >= 0 && (i_19_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) < 0) {
								int i_22_;
								if ((i_22_ = (i_20_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12))) >= 0) {
									i_22_ = (anInt8991 - i_22_) / anInt8991;
									i_21_ += i_22_;
									i_20_ += anInt8991 * i_22_;
									i_18_ += i_22_;
								}
								if ((i_22_ = (i_20_ - anInt8991) / anInt8991) > i_21_)
									i_21_ = i_22_;
								int i_23_ = is[i_17_] - i;
								int i_24_ = -is_0_[i_17_];
								int i_25_ = i_23_ - (i_18_ - anInt9003);
								if (i_25_ > 0) {
									i_18_ += i_25_;
									i_21_ += i_25_;
									i_19_ += anInt9004 * i_25_;
									i_20_ += anInt8991 * i_25_;
								} else
									i_24_ -= i_25_;
								if (i_21_ < i_24_)
									i_21_ = i_24_;
								for (/**/; i_21_ < 0; i_21_++) {
									int i_26_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_20_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_19_ >> 12)]);
									int i_27_ = i_26_ >>> 24;
									int i_28_ = 256 - i_27_;
									int i_29_ = is_2_[i_18_];
									is_2_[i_18_++] = ((((i_26_ & 0xff00ff) * i_27_ + (i_29_ & 0xff00ff) * i_28_) & ~0xff00ff) + (((i_26_ & 0xff00) * i_27_ + (i_29_ & 0xff00) * i_28_) & 0xff0000)) >> 8;
									i_20_ += anInt8991;
								}
							}
						}
						i_16_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_30_ = anInt9001;
					while (i_30_ < 0) {
						int i_31_ = i_30_ + i_1_;
						if (i_31_ >= 0) {
							if (i_31_ >= is.length)
								break;
							int i_32_ = anInt9003;
							int i_33_ = anInt8988;
							int i_34_ = anInt9011 + anInt9013;
							int i_35_ = anInt8999;
							if (i_33_ >= 0 && (i_33_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) < 0) {
								if (i_34_ < 0) {
									int i_36_ = (anInt8991 - 1 - i_34_) / anInt8991;
									i_35_ += i_36_;
									i_34_ += anInt8991 * i_36_;
									i_32_ += i_36_;
								}
								int i_37_;
								if ((i_37_ = (1 + i_34_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_35_)
									i_35_ = i_37_;
								int i_38_ = is[i_31_] - i;
								int i_39_ = -is_0_[i_31_];
								int i_40_ = i_38_ - (i_32_ - anInt9003);
								if (i_40_ > 0) {
									i_32_ += i_40_;
									i_35_ += i_40_;
									i_33_ += anInt9004 * i_40_;
									i_34_ += anInt8991 * i_40_;
								} else
									i_39_ -= i_40_;
								if (i_35_ < i_39_)
									i_35_ = i_39_;
								for (/**/; i_35_ < 0; i_35_++) {
									int i_41_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_34_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_33_ >> 12)]);
									int i_42_ = i_41_ >>> 24;
									int i_43_ = 256 - i_42_;
									int i_44_ = is_2_[i_32_];
									is_2_[i_32_++] = ((((i_41_ & 0xff00ff) * i_42_ + (i_44_ & 0xff00ff) * i_43_) & ~0xff00ff) + (((i_41_ & 0xff00) * i_42_ + (i_44_ & 0xff00) * i_43_) & 0xff0000)) >> 8;
									i_34_ += anInt8991;
								}
							}
						}
						i_30_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_45_ = anInt9001;
					while (i_45_ < 0) {
						int i_46_ = i_45_ + i_1_;
						if (i_46_ >= 0) {
							if (i_46_ >= is.length)
								break;
							int i_47_ = anInt9003;
							int i_48_ = anInt8988 + anInt9012;
							int i_49_ = anInt9011;
							int i_50_ = anInt8999;
							if (i_49_ >= 0 && (i_49_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) < 0) {
								int i_51_;
								if ((i_51_ = (i_48_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12))) >= 0) {
									i_51_ = (anInt9004 - i_51_) / anInt9004;
									i_50_ += i_51_;
									i_48_ += anInt9004 * i_51_;
									i_47_ += i_51_;
								}
								if ((i_51_ = (i_48_ - anInt9004) / anInt9004) > i_50_)
									i_50_ = i_51_;
								int i_52_ = is[i_46_] - i;
								int i_53_ = -is_0_[i_46_];
								int i_54_ = i_52_ - (i_47_ - anInt9003);
								if (i_54_ > 0) {
									i_47_ += i_54_;
									i_50_ += i_54_;
									i_48_ += anInt9004 * i_54_;
									i_49_ += anInt8991 * i_54_;
								} else
									i_53_ -= i_54_;
								if (i_50_ < i_53_)
									i_50_ = i_53_;
								for (/**/; i_50_ < 0; i_50_++) {
									int i_55_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_49_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_48_ >> 12)]);
									int i_56_ = i_55_ >>> 24;
									int i_57_ = 256 - i_56_;
									int i_58_ = is_2_[i_47_];
									is_2_[i_47_++] = ((((i_55_ & 0xff00ff) * i_56_ + (i_58_ & 0xff00ff) * i_57_) & ~0xff00ff) + (((i_55_ & 0xff00) * i_56_ + (i_58_ & 0xff00) * i_57_) & 0xff0000)) >> 8;
									i_48_ += anInt9004;
								}
							}
						}
						i_45_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_59_ = anInt9001;
					while (i_59_ < 0) {
						int i_60_ = i_59_ + i_1_;
						if (i_60_ >= 0) {
							if (i_60_ >= is.length)
								break;
							int i_61_ = anInt9003;
							int i_62_ = anInt8988 + anInt9012;
							int i_63_ = anInt9011 + anInt9013;
							int i_64_ = anInt8999;
							int i_65_;
							if ((i_65_ = i_62_ - ((((Class57_Sub1_Sub1) this).anInt9010) << 12)) >= 0) {
								i_65_ = (anInt9004 - i_65_) / anInt9004;
								i_64_ += i_65_;
								i_62_ += anInt9004 * i_65_;
								i_63_ += anInt8991 * i_65_;
								i_61_ += i_65_;
							}
							if ((i_65_ = (i_62_ - anInt9004) / anInt9004) > i_64_)
								i_64_ = i_65_;
							if ((i_65_ = i_63_ - ((((Class57_Sub1_Sub1) this).anInt8989) << 12)) >= 0) {
								i_65_ = (anInt8991 - i_65_) / anInt8991;
								i_64_ += i_65_;
								i_62_ += anInt9004 * i_65_;
								i_63_ += anInt8991 * i_65_;
								i_61_ += i_65_;
							}
							if ((i_65_ = (i_63_ - anInt8991) / anInt8991) > i_64_)
								i_64_ = i_65_;
							int i_66_ = is[i_60_] - i;
							int i_67_ = -is_0_[i_60_];
							int i_68_ = i_66_ - (i_61_ - anInt9003);
							if (i_68_ > 0) {
								i_61_ += i_68_;
								i_64_ += i_68_;
								i_62_ += anInt9004 * i_68_;
								i_63_ += anInt8991 * i_68_;
							} else
								i_67_ -= i_68_;
							if (i_64_ < i_67_)
								i_64_ = i_67_;
							for (/**/; i_64_ < 0; i_64_++) {
								int i_69_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_63_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010 + (i_62_ >> 12))]);
								int i_70_ = i_69_ >>> 24;
								int i_71_ = 256 - i_70_;
								int i_72_ = is_2_[i_61_];
								is_2_[i_61_++] = ((((i_69_ & 0xff00ff) * i_70_ + (i_72_ & 0xff00ff) * i_71_) & ~0xff00ff) + (((i_69_ & 0xff00) * i_70_ + (i_72_ & 0xff00) * i_71_) & 0xff0000)) >> 8;
								i_62_ += anInt9004;
								i_63_ += anInt8991;
							}
						}
						i_59_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_73_ = anInt9001;
					while (i_73_ < 0) {
						int i_74_ = i_73_ + i_1_;
						if (i_74_ >= 0) {
							if (i_74_ >= is.length)
								break;
							int i_75_ = anInt9003;
							int i_76_ = anInt8988 + anInt9012;
							int i_77_ = anInt9011 + anInt9013;
							int i_78_ = anInt8999;
							int i_79_;
							if ((i_79_ = i_76_ - ((((Class57_Sub1_Sub1) this).anInt9010) << 12)) >= 0) {
								i_79_ = (anInt9004 - i_79_) / anInt9004;
								i_78_ += i_79_;
								i_76_ += anInt9004 * i_79_;
								i_77_ += anInt8991 * i_79_;
								i_75_ += i_79_;
							}
							if ((i_79_ = (i_76_ - anInt9004) / anInt9004) > i_78_)
								i_78_ = i_79_;
							if (i_77_ < 0) {
								i_79_ = (anInt8991 - 1 - i_77_) / anInt8991;
								i_78_ += i_79_;
								i_76_ += anInt9004 * i_79_;
								i_77_ += anInt8991 * i_79_;
								i_75_ += i_79_;
							}
							if ((i_79_ = (1 + i_77_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_78_)
								i_78_ = i_79_;
							int i_80_ = is[i_74_] - i;
							int i_81_ = -is_0_[i_74_];
							int i_82_ = i_80_ - (i_75_ - anInt9003);
							if (i_82_ > 0) {
								i_75_ += i_82_;
								i_78_ += i_82_;
								i_76_ += anInt9004 * i_82_;
								i_77_ += anInt8991 * i_82_;
							} else
								i_81_ -= i_82_;
							if (i_78_ < i_81_)
								i_78_ = i_81_;
							for (/**/; i_78_ < 0; i_78_++) {
								int i_83_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_77_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010 + (i_76_ >> 12))]);
								int i_84_ = i_83_ >>> 24;
								int i_85_ = 256 - i_84_;
								int i_86_ = is_2_[i_75_];
								is_2_[i_75_++] = ((((i_83_ & 0xff00ff) * i_84_ + (i_86_ & 0xff00ff) * i_85_) & ~0xff00ff) + (((i_83_ & 0xff00) * i_84_ + (i_86_ & 0xff00) * i_85_) & 0xff0000)) >> 8;
								i_76_ += anInt9004;
								i_77_ += anInt8991;
							}
						}
						i_73_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_87_ = anInt9001;
				while (i_87_ < 0) {
					int i_88_ = i_87_ + i_1_;
					if (i_88_ >= 0) {
						if (i_88_ >= is.length)
							break;
						int i_89_ = anInt9003;
						int i_90_ = anInt8988 + anInt9012;
						int i_91_ = anInt9011;
						int i_92_ = anInt8999;
						if (i_91_ >= 0 && i_91_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) < 0) {
							if (i_90_ < 0) {
								int i_93_ = (anInt9004 - 1 - i_90_) / anInt9004;
								i_92_ += i_93_;
								i_90_ += anInt9004 * i_93_;
								i_89_ += i_93_;
							}
							int i_94_;
							if ((i_94_ = (1 + i_90_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_92_)
								i_92_ = i_94_;
							int i_95_ = is[i_88_] - i;
							int i_96_ = -is_0_[i_88_];
							int i_97_ = i_95_ - (i_89_ - anInt9003);
							if (i_97_ > 0) {
								i_89_ += i_97_;
								i_92_ += i_97_;
								i_90_ += anInt9004 * i_97_;
								i_91_ += anInt8991 * i_97_;
							} else
								i_96_ -= i_97_;
							if (i_92_ < i_96_)
								i_92_ = i_96_;
							for (/**/; i_92_ < 0; i_92_++) {
								int i_98_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_91_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010 + (i_90_ >> 12))]);
								int i_99_ = i_98_ >>> 24;
								int i_100_ = 256 - i_99_;
								int i_101_ = is_2_[i_89_];
								is_2_[i_89_++] = ((((i_98_ & 0xff00ff) * i_99_ + (i_101_ & 0xff00ff) * i_100_) & ~0xff00ff) + (((i_98_ & 0xff00) * i_99_ + (i_101_ & 0xff00) * i_100_) & 0xff0000)) >> 8;
								i_90_ += anInt9004;
							}
						}
					}
					i_87_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				int i_102_ = anInt9001;
				while (i_102_ < 0) {
					int i_103_ = i_102_ + i_1_;
					if (i_103_ >= 0) {
						if (i_103_ >= is.length)
							break;
						int i_104_ = anInt9003;
						int i_105_ = anInt8988 + anInt9012;
						int i_106_ = anInt9011 + anInt9013;
						int i_107_ = anInt8999;
						if (i_105_ < 0) {
							int i_108_ = (anInt9004 - 1 - i_105_) / anInt9004;
							i_107_ += i_108_;
							i_105_ += anInt9004 * i_108_;
							i_106_ += anInt8991 * i_108_;
							i_104_ += i_108_;
						}
						int i_109_;
						if ((i_109_ = (1 + i_105_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_107_)
							i_107_ = i_109_;
						if ((i_109_ = i_106_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) >= 0) {
							i_109_ = (anInt8991 - i_109_) / anInt8991;
							i_107_ += i_109_;
							i_105_ += anInt9004 * i_109_;
							i_106_ += anInt8991 * i_109_;
							i_104_ += i_109_;
						}
						if ((i_109_ = (i_106_ - anInt8991) / anInt8991) > i_107_)
							i_107_ = i_109_;
						int i_110_ = is[i_103_] - i;
						int i_111_ = -is_0_[i_103_];
						int i_112_ = i_110_ - (i_104_ - anInt9003);
						if (i_112_ > 0) {
							i_104_ += i_112_;
							i_107_ += i_112_;
							i_105_ += anInt9004 * i_112_;
							i_106_ += anInt8991 * i_112_;
						} else
							i_111_ -= i_112_;
						if (i_107_ < i_111_)
							i_107_ = i_111_;
						for (/**/; i_107_ < 0; i_107_++) {
							int i_113_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_106_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_105_ >> 12))]);
							int i_114_ = i_113_ >>> 24;
							int i_115_ = 256 - i_114_;
							int i_116_ = is_2_[i_104_];
							is_2_[i_104_++] = ((((i_113_ & 0xff00ff) * i_114_ + (i_116_ & 0xff00ff) * i_115_) & ~0xff00ff) + (((i_113_ & 0xff00) * i_114_ + (i_116_ & 0xff00) * i_115_) & 0xff0000)) >> 8;
							i_105_ += anInt9004;
							i_106_ += anInt8991;
						}
					}
					i_102_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				int i_117_ = anInt9001;
				while (i_117_ < 0) {
					int i_118_ = i_117_ + i_1_;
					if (i_118_ >= 0) {
						if (i_118_ >= is.length)
							break;
						int i_119_ = anInt9003;
						int i_120_ = anInt8988 + anInt9012;
						int i_121_ = anInt9011 + anInt9013;
						int i_122_ = anInt8999;
						if (i_120_ < 0) {
							int i_123_ = (anInt9004 - 1 - i_120_) / anInt9004;
							i_122_ += i_123_;
							i_120_ += anInt9004 * i_123_;
							i_121_ += anInt8991 * i_123_;
							i_119_ += i_123_;
						}
						int i_124_;
						if ((i_124_ = (1 + i_120_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_122_)
							i_122_ = i_124_;
						if (i_121_ < 0) {
							i_124_ = (anInt8991 - 1 - i_121_) / anInt8991;
							i_122_ += i_124_;
							i_120_ += anInt9004 * i_124_;
							i_121_ += anInt8991 * i_124_;
							i_119_ += i_124_;
						}
						if ((i_124_ = (1 + i_121_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_122_)
							i_122_ = i_124_;
						int i_125_ = is[i_118_] - i;
						int i_126_ = -is_0_[i_118_];
						int i_127_ = i_125_ - (i_119_ - anInt9003);
						if (i_127_ > 0) {
							i_119_ += i_127_;
							i_122_ += i_127_;
							i_120_ += anInt9004 * i_127_;
							i_121_ += anInt8991 * i_127_;
						} else
							i_126_ -= i_127_;
						if (i_122_ < i_126_)
							i_122_ = i_126_;
						for (/**/; i_122_ < 0; i_122_++) {
							int i_128_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_121_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_120_ >> 12))]);
							int i_129_ = i_128_ >>> 24;
							int i_130_ = 256 - i_129_;
							int i_131_ = is_2_[i_119_];
							is_2_[i_119_++] = ((((i_128_ & 0xff00ff) * i_129_ + (i_131_ & 0xff00ff) * i_130_) & ~0xff00ff) + (((i_128_ & 0xff00) * i_129_ + (i_131_ & 0xff00) * i_130_) & 0xff0000)) >> 8;
							i_120_ += anInt9004;
							i_121_ += anInt8991;
						}
					}
					i_117_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	Class57_Sub1_Sub1(Class_ra_Sub1 class_ra_sub1, int[] is, int i, int i_132_, int i_133_, int i_134_, boolean bool) {
		super(class_ra_sub1, i_133_, i_134_);
		if (bool)
			((Class57_Sub1_Sub1) this).anIntArray9965 = new int[i_133_ * i_134_];
		else
			((Class57_Sub1_Sub1) this).anIntArray9965 = is;
		i_132_ -= ((Class57_Sub1_Sub1) this).anInt9010;
		int i_135_ = 0;
		for (int i_136_ = 0; i_136_ < i_134_; i_136_++) {
			for (int i_137_ = 0; i_137_ < i_133_; i_137_++)
				((Class57_Sub1_Sub1) this).anIntArray9965[i_135_++] = is[i++];
			i += i_132_;
		}
	}

	Class57_Sub1_Sub1(Class_ra_Sub1 class_ra_sub1, int[] is, int i, int i_138_) {
		super(class_ra_sub1, i, i_138_);
		((Class57_Sub1_Sub1) this).anIntArray9965 = is;
	}

	public void method675(int i, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_144_ = 0; i_144_ < i_141_; i_144_++) {
			int i_145_ = (i_139_ + i_144_) * i_140_ + i;
			int i_146_ = (i_143_ + i_144_) * i_140_ + i_142_;
			for (int i_147_ = 0; i_147_ < i_140_; i_147_++)
				((Class57_Sub1_Sub1) this).anIntArray9965[i_145_ + i_147_] = is[i_146_ + i_147_] & 0xffffff;
		}
	}

	public void method632(int i, int i_148_, int i_149_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is == null)
			throw new IllegalStateException("");
		if (i_149_ == 0) {
			for (int i_150_ = 0; i_150_ < ((Class57_Sub1_Sub1) this).anInt8989; i_150_++) {
				int i_151_ = i_150_ * ((Class57_Sub1_Sub1) this).anInt9010;
				int i_152_ = (((i_148_ + i_150_) * (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883)) + i);
				for (int i_153_ = 0; i_153_ < ((Class57_Sub1_Sub1) this).anInt9010; i_153_++)
					((Class57_Sub1_Sub1) this).anIntArray9965[i_151_ + i_153_] = ((((Class57_Sub1_Sub1) this).anIntArray9965[i_151_ + i_153_]) & 0xffffff | is[i_152_ + i_153_] << 8 & ~0xffffff);
			}
		} else if (i_149_ == 1) {
			for (int i_154_ = 0; i_154_ < ((Class57_Sub1_Sub1) this).anInt8989; i_154_++) {
				int i_155_ = i_154_ * ((Class57_Sub1_Sub1) this).anInt9010;
				int i_156_ = (((i_148_ + i_154_) * (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883)) + i);
				for (int i_157_ = 0; i_157_ < ((Class57_Sub1_Sub1) this).anInt9010; i_157_++)
					((Class57_Sub1_Sub1) this).anIntArray9965[i_155_ + i_157_] = ((((Class57_Sub1_Sub1) this).anIntArray9965[i_155_ + i_157_]) & 0xffffff | is[i_156_ + i_157_] << 16 & ~0xffffff);
			}
		} else if (i_149_ == 2) {
			for (int i_158_ = 0; i_158_ < ((Class57_Sub1_Sub1) this).anInt8989; i_158_++) {
				int i_159_ = i_158_ * ((Class57_Sub1_Sub1) this).anInt9010;
				int i_160_ = (((i_148_ + i_158_) * (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883)) + i);
				for (int i_161_ = 0; i_161_ < ((Class57_Sub1_Sub1) this).anInt9010; i_161_++)
					((Class57_Sub1_Sub1) this).anIntArray9965[i_159_ + i_161_] = ((((Class57_Sub1_Sub1) this).anIntArray9965[i_159_ + i_161_]) & 0xffffff | is[i_160_ + i_161_] << 24 & ~0xffffff);
			}
		} else if (i_149_ == 3) {
			for (int i_162_ = 0; i_162_ < ((Class57_Sub1_Sub1) this).anInt8989; i_162_++) {
				int i_163_ = i_162_ * ((Class57_Sub1_Sub1) this).anInt9010;
				int i_164_ = (((i_148_ + i_162_) * (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883)) + i);
				for (int i_165_ = 0; i_165_ < ((Class57_Sub1_Sub1) this).anInt9010; i_165_++)
					((Class57_Sub1_Sub1) this).anIntArray9965[i_163_ + i_165_] = ((((Class57_Sub1_Sub1) this).anIntArray9965[i_163_ + i_165_]) & 0xffffff | (is[i_164_ + i_165_] != 0 ? -16777216 : 0));
			}
		}
	}

	public Interface8_Impl1_Impl1 method627() {
		return new Class24(((Class57_Sub1_Sub1) this).anInt9010, ((Class57_Sub1_Sub1) this).anInt8989, ((Class57_Sub1_Sub1) this).anIntArray9965);
	}

	public void method631(int i, int i_166_, int i_167_, int i_168_, int i_169_) {
		if (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			int i_170_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			i += ((Class57_Sub1_Sub1) this).anInt8990;
			i_166_ += ((Class57_Sub1_Sub1) this).anInt9000;
			int i_171_ = i_166_ * i_170_ + i;
			int i_172_ = 0;
			int i_173_ = ((Class57_Sub1_Sub1) this).anInt8989;
			int i_174_ = ((Class57_Sub1_Sub1) this).anInt9010;
			int i_175_ = i_170_ - i_174_;
			int i_176_ = 0;
			if (i_166_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_177_ = ((((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805 - i_166_);
				i_173_ -= i_177_;
				i_166_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_172_ += i_177_ * i_174_;
				i_171_ += i_177_ * i_170_;
			}
			if (i_166_ + i_173_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7977) * 63686679)
				i_173_ -= (i_166_ + i_173_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_178_ = ((((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974) * -912871679 - i);
				i_174_ -= i_178_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_172_ += i_178_;
				i_171_ += i_178_;
				i_176_ += i_178_;
				i_175_ += i_178_;
			}
			if (i + i_174_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_179_ = (i + i_174_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_174_ -= i_179_;
				i_176_ += i_179_;
				i_175_ += i_179_;
			}
			if (i_174_ > 0 && i_173_ > 0) {
				if (i_169_ == 0) {
					if (i_167_ == 1) {
						for (int i_180_ = -i_173_; i_180_ < 0; i_180_++) {
							int i_181_ = i_171_ + i_174_ - 3;
							while (i_171_ < i_181_) {
								is[i_171_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
								is[i_171_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
								is[i_171_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
								is[i_171_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
							}
							i_181_ += 3;
							while (i_171_ < i_181_)
								is[i_171_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 0) {
						int i_182_ = (i_168_ & 0xff0000) >> 16;
						int i_183_ = (i_168_ & 0xff00) >> 8;
						int i_184_ = i_168_ & 0xff;
						for (int i_185_ = -i_173_; i_185_ < 0; i_185_++) {
							for (int i_186_ = -i_174_; i_186_ < 0; i_186_++) {
								int i_187_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
								int i_188_ = (i_187_ & 0xff0000) * i_182_ & ~0xffffff;
								int i_189_ = (i_187_ & 0xff00) * i_183_ & 0xff0000;
								int i_190_ = (i_187_ & 0xff) * i_184_ & 0xff00;
								is[i_171_++] = (i_188_ | i_189_ | i_190_) >>> 8;
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 3) {
						for (int i_191_ = -i_173_; i_191_ < 0; i_191_++) {
							for (int i_192_ = -i_174_; i_192_ < 0; i_192_++) {
								int i_193_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
								int i_194_ = i_193_ + i_168_;
								int i_195_ = ((i_193_ & 0xff00ff) + (i_168_ & 0xff00ff));
								int i_196_ = ((i_195_ & 0x1000100) + (i_194_ - i_195_ & 0x10000));
								is[i_171_++] = i_194_ - i_196_ | i_196_ - (i_196_ >>> 8);
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 2) {
						int i_197_ = i_168_ >>> 24;
						int i_198_ = 256 - i_197_;
						int i_199_ = (i_168_ & 0xff00ff) * i_198_ & ~0xff00ff;
						int i_200_ = (i_168_ & 0xff00) * i_198_ & 0xff0000;
						i_168_ = (i_199_ | i_200_) >>> 8;
						for (int i_201_ = -i_173_; i_201_ < 0; i_201_++) {
							for (int i_202_ = -i_174_; i_202_ < 0; i_202_++) {
								int i_203_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
								i_199_ = (i_203_ & 0xff00ff) * i_197_ & ~0xff00ff;
								i_200_ = (i_203_ & 0xff00) * i_197_ & 0xff0000;
								is[i_171_++] = ((i_199_ | i_200_) >>> 8) + i_168_;
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_169_ == 1) {
					if (i_167_ == 1) {
						for (int i_204_ = -i_173_; i_204_ < 0; i_204_++) {
							for (int i_205_ = -i_174_; i_205_ < 0; i_205_++) {
								int i_206_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
								int i_207_ = i_206_ >>> 24;
								int i_208_ = 256 - i_207_;
								int i_209_ = is[i_171_];
								is[i_171_++] = (((((i_206_ & 0xff00ff) * i_207_ + (i_209_ & 0xff00ff) * i_208_) & ~0xff00ff) >> 8) + (((((i_206_ & ~0xff00ff) >>> 8) * i_207_) + (((i_209_ & ~0xff00ff) >>> 8) * i_208_)) & ~0xff00ff));
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 0) {
						if ((i_168_ & 0xffffff) == 16777215) {
							for (int i_210_ = -i_173_; i_210_ < 0; i_210_++) {
								for (int i_211_ = -i_174_; i_211_ < 0; i_211_++) {
									int i_212_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
									int i_213_ = ((i_212_ >>> 24) * (i_168_ >>> 24) >> 8);
									int i_214_ = 256 - i_213_;
									int i_215_ = is[i_171_];
									is[i_171_++] = ((((i_212_ & 0xff00ff) * i_213_ + (i_215_ & 0xff00ff) * i_214_) & ~0xff00ff) + (((i_212_ & 0xff00) * i_213_ + (i_215_ & 0xff00) * i_214_) & 0xff0000)) >> 8;
								}
								i_171_ += i_175_;
								i_172_ += i_176_;
							}
						} else {
							int i_216_ = (i_168_ & 0xff0000) >> 16;
							int i_217_ = (i_168_ & 0xff00) >> 8;
							int i_218_ = i_168_ & 0xff;
							for (int i_219_ = -i_173_; i_219_ < 0; i_219_++) {
								for (int i_220_ = -i_174_; i_220_ < 0; i_220_++) {
									int i_221_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
									int i_222_ = ((i_221_ >>> 24) * (i_168_ >>> 24) >> 8);
									int i_223_ = 256 - i_222_;
									if (i_222_ != 255) {
										int i_224_ = ((i_221_ & 0xff0000) * i_216_ & ~0xffffff);
										int i_225_ = ((i_221_ & 0xff00) * i_217_ & 0xff0000);
										int i_226_ = ((i_221_ & 0xff) * i_218_ & 0xff00);
										i_221_ = (i_224_ | i_225_ | i_226_) >>> 8;
										int i_227_ = is[i_171_];
										is[i_171_++] = ((((i_221_ & 0xff00ff) * i_222_ + ((i_227_ & 0xff00ff) * i_223_)) & ~0xff00ff) + (((i_221_ & 0xff00) * i_222_ + ((i_227_ & 0xff00) * i_223_)) & 0xff0000)) >> 8;
									} else {
										int i_228_ = ((i_221_ & 0xff0000) * i_216_ & ~0xffffff);
										int i_229_ = ((i_221_ & 0xff00) * i_217_ & 0xff0000);
										int i_230_ = ((i_221_ & 0xff) * i_218_ & 0xff00);
										is[i_171_++] = (i_228_ | i_229_ | i_230_) >>> 8;
									}
								}
								i_171_ += i_175_;
								i_172_ += i_176_;
							}
						}
					} else if (i_167_ == 3) {
						for (int i_231_ = -i_173_; i_231_ < 0; i_231_++) {
							for (int i_232_ = -i_174_; i_232_ < 0; i_232_++) {
								int i_233_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
								int i_234_ = i_233_ + i_168_;
								int i_235_ = ((i_233_ & 0xff00ff) + (i_168_ & 0xff00ff));
								int i_236_ = ((i_235_ & 0x1000100) + (i_234_ - i_235_ & 0x10000));
								i_236_ = i_234_ - i_236_ | i_236_ - (i_236_ >>> 8);
								int i_237_ = (i_236_ >>> 24) * (i_168_ >>> 24) >> 8;
								int i_238_ = 256 - i_237_;
								if (i_237_ != 255) {
									i_233_ = i_236_;
									i_236_ = is[i_171_];
									i_236_ = ((((i_233_ & 0xff00ff) * i_237_ + (i_236_ & 0xff00ff) * i_238_) & ~0xff00ff) + (((i_233_ & 0xff00) * i_237_ + (i_236_ & 0xff00) * i_238_) & 0xff0000)) >> 8;
								}
								is[i_171_++] = i_236_;
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 2) {
						int i_239_ = i_168_ >>> 24;
						int i_240_ = 256 - i_239_;
						int i_241_ = (i_168_ & 0xff00ff) * i_240_ & ~0xff00ff;
						int i_242_ = (i_168_ & 0xff00) * i_240_ & 0xff0000;
						i_168_ = (i_241_ | i_242_) >>> 8;
						for (int i_243_ = -i_173_; i_243_ < 0; i_243_++) {
							for (int i_244_ = -i_174_; i_244_ < 0; i_244_++) {
								int i_245_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
								int i_246_ = i_245_ >>> 24;
								int i_247_ = 256 - i_246_;
								i_241_ = (i_245_ & 0xff00ff) * i_239_ & ~0xff00ff;
								i_242_ = (i_245_ & 0xff00) * i_239_ & 0xff0000;
								i_245_ = ((i_241_ | i_242_) >>> 8) + i_168_;
								int i_248_ = is[i_171_];
								is[i_171_++] = ((((i_245_ & 0xff00ff) * i_246_ + (i_248_ & 0xff00ff) * i_247_) & ~0xff00ff) + (((i_245_ & 0xff00) * i_246_ + (i_248_ & 0xff00) * i_247_) & 0xff0000)) >> 8;
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_169_ == 2) {
					if (i_167_ == 1) {
						for (int i_249_ = -i_173_; i_249_ < 0; i_249_++) {
							for (int i_250_ = -i_174_; i_250_ < 0; i_250_++) {
								int i_251_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
								if (i_251_ != 0) {
									int i_252_ = is[i_171_];
									int i_253_ = i_251_ + i_252_;
									int i_254_ = ((i_251_ & 0xff00ff) + (i_252_ & 0xff00ff));
									i_252_ = ((i_254_ & 0x1000100) + (i_253_ - i_254_ & 0x10000));
									is[i_171_++] = i_253_ - i_252_ | i_252_ - (i_252_ >>> 8);
								} else
									i_171_++;
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 0) {
						int i_255_ = (i_168_ & 0xff0000) >> 16;
						int i_256_ = (i_168_ & 0xff00) >> 8;
						int i_257_ = i_168_ & 0xff;
						for (int i_258_ = -i_173_; i_258_ < 0; i_258_++) {
							for (int i_259_ = -i_174_; i_259_ < 0; i_259_++) {
								int i_260_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
								if (i_260_ != 0) {
									int i_261_ = ((i_260_ & 0xff0000) * i_255_ & ~0xffffff);
									int i_262_ = ((i_260_ & 0xff00) * i_256_ & 0xff0000);
									int i_263_ = (i_260_ & 0xff) * i_257_ & 0xff00;
									i_260_ = (i_261_ | i_262_ | i_263_) >>> 8;
									int i_264_ = is[i_171_];
									int i_265_ = i_260_ + i_264_;
									int i_266_ = ((i_260_ & 0xff00ff) + (i_264_ & 0xff00ff));
									i_264_ = ((i_266_ & 0x1000100) + (i_265_ - i_266_ & 0x10000));
									is[i_171_++] = i_265_ - i_264_ | i_264_ - (i_264_ >>> 8);
								} else
									i_171_++;
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 3) {
						for (int i_267_ = -i_173_; i_267_ < 0; i_267_++) {
							for (int i_268_ = -i_174_; i_268_ < 0; i_268_++) {
								int i_269_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
								int i_270_ = i_269_ + i_168_;
								int i_271_ = ((i_269_ & 0xff00ff) + (i_168_ & 0xff00ff));
								int i_272_ = ((i_271_ & 0x1000100) + (i_270_ - i_271_ & 0x10000));
								i_269_ = i_270_ - i_272_ | i_272_ - (i_272_ >>> 8);
								i_272_ = is[i_171_];
								i_270_ = i_269_ + i_272_;
								i_271_ = (i_269_ & 0xff00ff) + (i_272_ & 0xff00ff);
								i_272_ = (i_271_ & 0x1000100) + (i_270_ - i_271_ & 0x10000);
								is[i_171_++] = i_270_ - i_272_ | i_272_ - (i_272_ >>> 8);
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else if (i_167_ == 2) {
						int i_273_ = i_168_ >>> 24;
						int i_274_ = 256 - i_273_;
						int i_275_ = (i_168_ & 0xff00ff) * i_274_ & ~0xff00ff;
						int i_276_ = (i_168_ & 0xff00) * i_274_ & 0xff0000;
						i_168_ = (i_275_ | i_276_) >>> 8;
						for (int i_277_ = -i_173_; i_277_ < 0; i_277_++) {
							for (int i_278_ = -i_174_; i_278_ < 0; i_278_++) {
								int i_279_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_172_++]);
								if (i_279_ != 0) {
									i_275_ = ((i_279_ & 0xff00ff) * i_273_ & ~0xff00ff);
									i_276_ = ((i_279_ & 0xff00) * i_273_ & 0xff0000);
									i_279_ = ((i_275_ | i_276_) >>> 8) + i_168_;
									int i_280_ = is[i_171_];
									int i_281_ = i_279_ + i_280_;
									int i_282_ = ((i_279_ & 0xff00ff) + (i_280_ & 0xff00ff));
									i_280_ = ((i_282_ & 0x1000100) + (i_281_ - i_282_ & 0x10000));
									is[i_171_++] = i_281_ - i_280_ | i_280_ - (i_280_ >>> 8);
								} else
									i_171_++;
							}
							i_171_ += i_175_;
							i_172_ += i_176_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Interface8_Impl1_Impl1 method647() {
		return new Class24(((Class57_Sub1_Sub1) this).anInt9010, ((Class57_Sub1_Sub1) this).anInt8989, ((Class57_Sub1_Sub1) this).anIntArray9965);
	}

	public Interface8_Impl1_Impl1 method646() {
		return new Class24(((Class57_Sub1_Sub1) this).anInt9010, ((Class57_Sub1_Sub1) this).anInt8989, ((Class57_Sub1_Sub1) this).anIntArray9965);
	}

	void method678(boolean bool, boolean bool_283_, boolean bool_284_, int i, int i_285_, float f, int i_286_, int i_287_, int i_288_, int i_289_, int i_290_, int i_291_, boolean bool_292_) {
		if (i_286_ > 0 && i_287_ > 0 && (bool || bool_283_)) {
			int i_293_ = 0;
			int i_294_ = 0;
			int i_295_ = (((Class57_Sub1_Sub1) this).anInt8990 + ((Class57_Sub1_Sub1) this).anInt9010 + ((Class57_Sub1_Sub1) this).anInt8997);
			int i_296_ = (((Class57_Sub1_Sub1) this).anInt9000 + ((Class57_Sub1_Sub1) this).anInt8989 + ((Class57_Sub1_Sub1) this).anInt8993);
			int i_297_ = (i_295_ << 16) / i_286_;
			int i_298_ = (i_296_ << 16) / i_287_;
			if (((Class57_Sub1_Sub1) this).anInt8990 > 0) {
				int i_299_ = (((((Class57_Sub1_Sub1) this).anInt8990 << 16) + i_297_ - 1) / i_297_);
				i += i_299_;
				i_293_ += i_299_ * i_297_ - (((Class57_Sub1_Sub1) this).anInt8990 << 16);
			}
			if (((Class57_Sub1_Sub1) this).anInt9000 > 0) {
				int i_300_ = (((((Class57_Sub1_Sub1) this).anInt9000 << 16) + i_298_ - 1) / i_298_);
				i_285_ += i_300_;
				i_294_ += i_300_ * i_298_ - (((Class57_Sub1_Sub1) this).anInt9000 << 16);
			}
			if (((Class57_Sub1_Sub1) this).anInt9010 < i_295_)
				i_286_ = ((((Class57_Sub1_Sub1) this).anInt9010 << 16) - i_293_ + i_297_ - 1) / i_297_;
			if (((Class57_Sub1_Sub1) this).anInt8989 < i_296_)
				i_287_ = ((((Class57_Sub1_Sub1) this).anInt8989 << 16) - i_294_ + i_298_ - 1) / i_298_;
			int i_301_ = i + i_285_ * ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971) * 692106883);
			int i_302_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883) - i_286_);
			if (i_285_ + i_287_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7977) * 63686679)
				i_287_ -= (i_285_ + i_287_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i_285_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_303_ = ((((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805 - i_285_);
				i_287_ -= i_303_;
				i_301_ += i_303_ * ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971) * 692106883);
				i_294_ += i_298_ * i_303_;
			}
			if (i + i_286_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_304_ = (i + i_286_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_286_ -= i_304_;
				i_302_ += i_304_;
			}
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_305_ = ((((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974) * -912871679 - i);
				i_286_ -= i_305_;
				i_301_ += i_305_;
				i_293_ += i_297_ * i_305_;
				i_302_ += i_305_;
			}
			float[] fs = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).aFloatArray7973);
			int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
			if (i_290_ == 0) {
				if (i_288_ == 1) {
					int i_306_ = i_293_;
					for (int i_307_ = -i_287_; i_307_ < 0; i_307_++) {
						int i_308_ = ((i_294_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_309_ = -i_286_; i_309_ < 0; i_309_++) {
							if (!bool_283_ || f < fs[i_301_]) {
								if (bool)
									is[i_301_] = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_293_ >> 16) + i_308_]);
								if (bool_283_ && bool_292_)
									fs[i_301_] = f;
							}
							i_293_ += i_297_;
							i_301_++;
						}
						i_294_ += i_298_;
						i_293_ = i_306_;
						i_301_ += i_302_;
					}
				} else if (i_288_ == 0) {
					int i_310_ = (i_289_ & 0xff0000) >> 16;
					int i_311_ = (i_289_ & 0xff00) >> 8;
					int i_312_ = i_289_ & 0xff;
					int i_313_ = i_293_;
					for (int i_314_ = -i_287_; i_314_ < 0; i_314_++) {
						int i_315_ = ((i_294_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_316_ = -i_286_; i_316_ < 0; i_316_++) {
							if (!bool_283_ || f < fs[i_301_]) {
								if (bool) {
									int i_317_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_293_ >> 16) + i_315_]);
									int i_318_ = ((i_317_ & 0xff0000) * i_310_ & ~0xffffff);
									int i_319_ = ((i_317_ & 0xff00) * i_311_ & 0xff0000);
									int i_320_ = (i_317_ & 0xff) * i_312_ & 0xff00;
									is[i_301_] = (i_318_ | i_319_ | i_320_) >>> 8;
								}
								if (bool_283_ && bool_292_)
									fs[i_301_] = f;
							}
							i_293_ += i_297_;
							i_301_++;
						}
						i_294_ += i_298_;
						i_293_ = i_313_;
						i_301_ += i_302_;
					}
				} else if (i_288_ == 3) {
					int i_321_ = i_293_;
					for (int i_322_ = -i_287_; i_322_ < 0; i_322_++) {
						int i_323_ = ((i_294_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_324_ = -i_286_; i_324_ < 0; i_324_++) {
							if (!bool_283_ || f < fs[i_301_]) {
								if (bool) {
									int i_325_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_293_ >> 16) + i_323_]);
									int i_326_ = i_325_ + i_289_;
									int i_327_ = ((i_325_ & 0xff00ff) + (i_289_ & 0xff00ff));
									int i_328_ = ((i_327_ & 0x1000100) + (i_326_ - i_327_ & 0x10000));
									is[i_301_] = i_326_ - i_328_ | i_328_ - (i_328_ >>> 8);
								}
								if (bool_283_ && bool_292_)
									fs[i_301_] = f;
							}
							i_293_ += i_297_;
							i_301_++;
						}
						i_294_ += i_298_;
						i_293_ = i_321_;
						i_301_ += i_302_;
					}
				} else if (i_288_ == 2) {
					int i_329_ = i_289_ >>> 24;
					int i_330_ = 256 - i_329_;
					int i_331_ = (i_289_ & 0xff00ff) * i_330_ & ~0xff00ff;
					int i_332_ = (i_289_ & 0xff00) * i_330_ & 0xff0000;
					i_289_ = (i_331_ | i_332_) >>> 8;
					int i_333_ = i_293_;
					for (int i_334_ = -i_287_; i_334_ < 0; i_334_++) {
						int i_335_ = ((i_294_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_336_ = -i_286_; i_336_ < 0; i_336_++) {
							if (!bool_283_ || f < fs[i_301_]) {
								if (bool) {
									int i_337_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_293_ >> 16) + i_335_]);
									i_331_ = ((i_337_ & 0xff00ff) * i_329_ & ~0xff00ff);
									i_332_ = ((i_337_ & 0xff00) * i_329_ & 0xff0000);
									is[i_301_] = ((i_331_ | i_332_) >>> 8) + i_289_;
								}
								if (bool_283_ && bool_292_)
									fs[i_301_] = f;
							}
							i_293_ += i_297_;
							i_301_++;
						}
						i_294_ += i_298_;
						i_293_ = i_333_;
						i_301_ += i_302_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_290_ == 1) {
				if (i_288_ == 1) {
					int i_338_ = i_293_;
					for (int i_339_ = -i_287_; i_339_ < 0; i_339_++) {
						int i_340_ = ((i_294_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_341_ = -i_286_; i_341_ < 0; i_341_++) {
							if (!bool_283_ || f < fs[i_301_]) {
								if (bool) {
									int i_342_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_293_ >> 16) + i_340_]);
									int i_343_ = i_342_ >>> 24;
									int i_344_ = 256 - i_343_;
									int i_345_ = is[i_301_];
									is[i_301_] = (((((i_342_ & 0xff00ff) * i_343_ + (i_345_ & 0xff00ff) * i_344_) & ~0xff00ff) >> 8) + (((((i_342_ & ~0xff00ff) >>> 8) * i_343_) + (((i_345_ & ~0xff00ff) >>> 8) * i_344_)) & ~0xff00ff));
								}
								if (bool_283_ && bool_292_)
									fs[i_301_] = f;
							}
							i_293_ += i_297_;
							i_301_++;
						}
						i_294_ += i_298_;
						i_293_ = i_338_;
						i_301_ += i_302_;
					}
				} else if (i_288_ == 0) {
					int i_346_ = i_293_;
					if ((i_289_ & 0xffffff) == 16777215) {
						for (int i_347_ = -i_287_; i_347_ < 0; i_347_++) {
							int i_348_ = ((i_294_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_349_ = -i_286_; i_349_ < 0; i_349_++) {
								if (!bool_283_ || f < fs[i_301_]) {
									if (bool) {
										int i_350_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_293_ >> 16) + i_348_]);
										int i_351_ = ((i_350_ >>> 24) * (i_289_ >>> 24) >> 8);
										int i_352_ = 256 - i_351_;
										int i_353_ = is[i_301_];
										is[i_301_] = ((((i_350_ & 0xff00ff) * i_351_ + ((i_353_ & 0xff00ff) * i_352_)) & ~0xff00ff) + (((i_350_ & 0xff00) * i_351_ + ((i_353_ & 0xff00) * i_352_)) & 0xff0000)) >> 8;
									}
									if (bool_283_ && bool_292_)
										fs[i_301_] = f;
								}
								i_293_ += i_297_;
								i_301_++;
							}
							i_294_ += i_298_;
							i_293_ = i_346_;
							i_301_ += i_302_;
						}
					} else {
						int i_354_ = (i_289_ & 0xff0000) >> 16;
						int i_355_ = (i_289_ & 0xff00) >> 8;
						int i_356_ = i_289_ & 0xff;
						for (int i_357_ = -i_287_; i_357_ < 0; i_357_++) {
							int i_358_ = ((i_294_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_359_ = -i_286_; i_359_ < 0; i_359_++) {
								if (!bool_283_ || f < fs[i_301_]) {
									int i_360_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_293_ >> 16) + i_358_]);
									int i_361_ = ((i_360_ >>> 24) * (i_289_ >>> 24) >> 8);
									int i_362_ = 256 - i_361_;
									if (i_361_ != 255) {
										if (bool) {
											int i_363_ = ((i_360_ & 0xff0000) * i_354_ & ~0xffffff);
											int i_364_ = ((i_360_ & 0xff00) * i_355_ & 0xff0000);
											int i_365_ = ((i_360_ & 0xff) * i_356_ & 0xff00);
											i_360_ = (i_363_ | i_364_ | i_365_) >>> 8;
											int i_366_ = is[i_301_];
											is[i_301_] = (((((i_360_ & 0xff00ff) * i_361_) + ((i_366_ & 0xff00ff) * i_362_)) & ~0xff00ff) + ((((i_360_ & 0xff00) * i_361_) + ((i_366_ & 0xff00) * i_362_)) & 0xff0000)) >> 8;
											if (bool_284_) {
												int i_367_ = (i_366_ >>> 24) + i_361_;
												if (i_367_ > 255)
													i_367_ = 255;
												is[i_301_] |= i_367_ << 24;
											}
										}
										if (bool_283_ && bool_292_)
											fs[i_301_] = f;
									} else {
										if (bool) {
											int i_368_ = ((i_360_ & 0xff0000) * i_354_ & ~0xffffff);
											int i_369_ = ((i_360_ & 0xff00) * i_355_ & 0xff0000);
											int i_370_ = ((i_360_ & 0xff) * i_356_ & 0xff00);
											is[i_301_] = (i_368_ | i_369_ | i_370_) >>> 8;
										}
										if (bool_283_ && bool_292_)
											fs[i_301_] = f;
									}
								}
								i_293_ += i_297_;
								i_301_++;
							}
							i_294_ += i_298_;
							i_293_ = i_346_;
							i_301_ += i_302_;
						}
					}
				} else if (i_288_ == 3) {
					int i_371_ = i_293_;
					for (int i_372_ = -i_287_; i_372_ < 0; i_372_++) {
						int i_373_ = ((i_294_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_374_ = -i_286_; i_374_ < 0; i_374_++) {
							if (!bool_283_ || f < fs[i_301_]) {
								if (bool) {
									int i_375_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_293_ >> 16) + i_373_]);
									int i_376_ = i_375_ + i_289_;
									int i_377_ = ((i_375_ & 0xff00ff) + (i_289_ & 0xff00ff));
									int i_378_ = ((i_377_ & 0x1000100) + (i_376_ - i_377_ & 0x10000));
									i_378_ = i_376_ - i_378_ | i_378_ - (i_378_ >>> 8);
									int i_379_ = ((i_378_ >>> 24) * (i_289_ >>> 24) >> 8);
									int i_380_ = 256 - i_379_;
									if (i_379_ != 255) {
										i_375_ = i_378_;
										i_378_ = is[i_301_];
										i_378_ = ((((i_375_ & 0xff00ff) * i_379_ + ((i_378_ & 0xff00ff) * i_380_)) & ~0xff00ff) + (((i_375_ & 0xff00) * i_379_ + ((i_378_ & 0xff00) * i_380_)) & 0xff0000)) >> 8;
									}
									is[i_301_] = i_378_;
								}
								if (bool_283_ && bool_292_)
									fs[i_301_] = f;
							}
							i_293_ += i_297_;
							i_301_++;
						}
						i_294_ += i_298_;
						i_293_ = i_371_;
						i_301_ += i_302_;
					}
				} else if (i_288_ == 2) {
					int i_381_ = i_289_ >>> 24;
					int i_382_ = 256 - i_381_;
					int i_383_ = (i_289_ & 0xff00ff) * i_382_ & ~0xff00ff;
					int i_384_ = (i_289_ & 0xff00) * i_382_ & 0xff0000;
					i_289_ = (i_383_ | i_384_) >>> 8;
					int i_385_ = i_293_;
					for (int i_386_ = -i_287_; i_386_ < 0; i_386_++) {
						int i_387_ = ((i_294_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_388_ = -i_286_; i_388_ < 0; i_388_++) {
							if (!bool_283_ || f < fs[i_301_]) {
								if (bool) {
									int i_389_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_293_ >> 16) + i_387_]);
									int i_390_ = i_389_ >>> 24;
									int i_391_ = 256 - i_390_;
									i_383_ = ((i_389_ & 0xff00ff) * i_381_ & ~0xff00ff);
									i_384_ = ((i_389_ & 0xff00) * i_381_ & 0xff0000);
									i_389_ = ((i_383_ | i_384_) >>> 8) + i_289_;
									int i_392_ = is[i_301_];
									is[i_301_] = ((((i_389_ & 0xff00ff) * i_390_ + (i_392_ & 0xff00ff) * i_391_) & ~0xff00ff) + (((i_389_ & 0xff00) * i_390_ + (i_392_ & 0xff00) * i_391_) & 0xff0000)) >> 8;
								}
								if (bool_283_ && bool_292_)
									fs[i_301_] = f;
							}
							i_293_ += i_297_;
							i_301_++;
						}
						i_294_ += i_298_;
						i_293_ = i_385_;
						i_301_ += i_302_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_290_ == 2) {
				if (i_288_ == 1) {
					int i_393_ = i_293_;
					for (int i_394_ = -i_287_; i_394_ < 0; i_394_++) {
						int i_395_ = ((i_294_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_396_ = -i_286_; i_396_ < 0; i_396_++) {
							if (!bool_283_ || f < fs[i_301_]) {
								int i_397_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_293_ >> 16) + i_395_]);
								if (i_397_ != 0) {
									if (bool) {
										int i_398_ = is[i_301_];
										int i_399_ = i_397_ + i_398_;
										int i_400_ = ((i_397_ & 0xff00ff) + (i_398_ & 0xff00ff));
										i_398_ = ((i_400_ & 0x1000100) + (i_399_ - i_400_ & 0x10000));
										is[i_301_] = (i_399_ - i_398_ | i_398_ - (i_398_ >>> 8));
									}
									if (bool_283_ && bool_292_)
										fs[i_301_] = f;
								}
							}
							i_293_ += i_297_;
							i_301_++;
						}
						i_294_ += i_298_;
						i_293_ = i_393_;
						i_301_ += i_302_;
					}
				} else if (i_288_ == 0) {
					int i_401_ = i_293_;
					int i_402_ = (i_289_ & 0xff0000) >> 16;
					int i_403_ = (i_289_ & 0xff00) >> 8;
					int i_404_ = i_289_ & 0xff;
					for (int i_405_ = -i_287_; i_405_ < 0; i_405_++) {
						int i_406_ = ((i_294_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_407_ = -i_286_; i_407_ < 0; i_407_++) {
							if (!bool_283_ || f < fs[i_301_]) {
								int i_408_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_293_ >> 16) + i_406_]);
								if (i_408_ != 0) {
									if (bool) {
										int i_409_ = ((i_408_ & 0xff0000) * i_402_ & ~0xffffff);
										int i_410_ = ((i_408_ & 0xff00) * i_403_ & 0xff0000);
										int i_411_ = ((i_408_ & 0xff) * i_404_ & 0xff00);
										i_408_ = (i_409_ | i_410_ | i_411_) >>> 8;
										int i_412_ = is[i_301_];
										int i_413_ = i_408_ + i_412_;
										int i_414_ = ((i_408_ & 0xff00ff) + (i_412_ & 0xff00ff));
										i_412_ = ((i_414_ & 0x1000100) + (i_413_ - i_414_ & 0x10000));
										is[i_301_] = (i_413_ - i_412_ | i_412_ - (i_412_ >>> 8));
									}
									if (bool_283_ && bool_292_)
										fs[i_301_] = f;
								}
							}
							i_293_ += i_297_;
							i_301_++;
						}
						i_294_ += i_298_;
						i_293_ = i_401_;
						i_301_ += i_302_;
					}
				} else if (i_288_ == 3) {
					int i_415_ = i_293_;
					for (int i_416_ = -i_287_; i_416_ < 0; i_416_++) {
						int i_417_ = ((i_294_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_418_ = -i_286_; i_418_ < 0; i_418_++) {
							if (!bool_283_ || f < fs[i_301_]) {
								if (bool) {
									int i_419_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_293_ >> 16) + i_417_]);
									int i_420_ = i_419_ + i_289_;
									int i_421_ = ((i_419_ & 0xff00ff) + (i_289_ & 0xff00ff));
									int i_422_ = ((i_421_ & 0x1000100) + (i_420_ - i_421_ & 0x10000));
									i_419_ = i_420_ - i_422_ | i_422_ - (i_422_ >>> 8);
									i_422_ = is[i_301_];
									i_420_ = i_419_ + i_422_;
									i_421_ = (i_419_ & 0xff00ff) + (i_422_ & 0xff00ff);
									i_422_ = ((i_421_ & 0x1000100) + (i_420_ - i_421_ & 0x10000));
									is[i_301_] = i_420_ - i_422_ | i_422_ - (i_422_ >>> 8);
								}
								if (bool_283_ && bool_292_)
									fs[i_301_] = f;
							}
							i_293_ += i_297_;
							i_301_++;
						}
						i_294_ += i_298_;
						i_293_ = i_415_;
						i_301_ += i_302_;
					}
				} else if (i_288_ == 2) {
					int i_423_ = i_289_ >>> 24;
					int i_424_ = 256 - i_423_;
					int i_425_ = (i_289_ & 0xff00ff) * i_424_ & ~0xff00ff;
					int i_426_ = (i_289_ & 0xff00) * i_424_ & 0xff0000;
					i_289_ = (i_425_ | i_426_) >>> 8;
					int i_427_ = i_293_;
					for (int i_428_ = -i_287_; i_428_ < 0; i_428_++) {
						int i_429_ = ((i_294_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_430_ = -i_286_; i_430_ < 0; i_430_++) {
							if (!bool_283_ || f < fs[i_301_]) {
								int i_431_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_293_ >> 16) + i_429_]);
								if (i_431_ != 0) {
									if (bool) {
										i_425_ = ((i_431_ & 0xff00ff) * i_423_ & ~0xff00ff);
										i_426_ = ((i_431_ & 0xff00) * i_423_ & 0xff0000);
										i_431_ = (((i_425_ | i_426_) >>> 8) + i_289_);
										int i_432_ = is[i_301_];
										int i_433_ = i_431_ + i_432_;
										int i_434_ = ((i_431_ & 0xff00ff) + (i_432_ & 0xff00ff));
										i_432_ = ((i_434_ & 0x1000100) + (i_433_ - i_434_ & 0x10000));
										is[i_301_] = (i_433_ - i_432_ | i_432_ - (i_432_ >>> 8));
									}
									if (bool_283_ && bool_292_)
										fs[i_301_] = f;
								}
							}
							i_293_ += i_297_;
							i_301_++;
						}
						i_294_ += i_298_;
						i_293_ = i_427_;
						i_301_ += i_302_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method635(int i, int i_435_, int i_436_, int i_437_, int i_438_, int i_439_, int i_440_, int i_441_) {
		if (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (i_436_ > 0 && i_437_ > 0) {
			int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
			if (is != null) {
				int i_442_ = 0;
				int i_443_ = 0;
				int i_444_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
				int i_445_ = (((Class57_Sub1_Sub1) this).anInt8990 + ((Class57_Sub1_Sub1) this).anInt9010 + ((Class57_Sub1_Sub1) this).anInt8997);
				int i_446_ = (((Class57_Sub1_Sub1) this).anInt9000 + ((Class57_Sub1_Sub1) this).anInt8989 + ((Class57_Sub1_Sub1) this).anInt8993);
				int i_447_ = (i_445_ << 16) / i_436_;
				int i_448_ = (i_446_ << 16) / i_437_;
				if (((Class57_Sub1_Sub1) this).anInt8990 > 0) {
					int i_449_ = (((((Class57_Sub1_Sub1) this).anInt8990 << 16) + i_447_ - 1) / i_447_);
					i += i_449_;
					i_442_ += (i_449_ * i_447_ - (((Class57_Sub1_Sub1) this).anInt8990 << 16));
				}
				if (((Class57_Sub1_Sub1) this).anInt9000 > 0) {
					int i_450_ = (((((Class57_Sub1_Sub1) this).anInt9000 << 16) + i_448_ - 1) / i_448_);
					i_435_ += i_450_;
					i_443_ += (i_450_ * i_448_ - (((Class57_Sub1_Sub1) this).anInt9000 << 16));
				}
				if (((Class57_Sub1_Sub1) this).anInt9010 < i_445_)
					i_436_ = ((((Class57_Sub1_Sub1) this).anInt9010 << 16) - i_442_ + i_447_ - 1) / i_447_;
				if (((Class57_Sub1_Sub1) this).anInt8989 < i_446_)
					i_437_ = ((((Class57_Sub1_Sub1) this).anInt8989 << 16) - i_443_ + i_448_ - 1) / i_448_;
				int i_451_ = i + i_435_ * i_444_;
				int i_452_ = i_444_ - i_436_;
				if (i_435_ + i_437_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7977 * 63686679))
					i_437_ -= (i_435_ + i_437_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7977) * 63686679);
				if (i_435_ < (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805) {
					int i_453_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_435_);
					i_437_ -= i_453_;
					i_451_ += i_453_ * i_444_;
					i_443_ += i_448_ * i_453_;
				}
				if (i + i_436_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725) {
					int i_454_ = (i + i_436_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725);
					i_436_ -= i_454_;
					i_452_ += i_454_;
				}
				if (i < (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7974 * -912871679)) {
					int i_455_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
					i_436_ -= i_455_;
					i_451_ += i_455_;
					i_442_ += i_447_ * i_455_;
					i_452_ += i_455_;
				}
				if (i_440_ == 0) {
					if (i_438_ == 1) {
						int i_456_ = i_442_;
						for (int i_457_ = -i_437_; i_457_ < 0; i_457_++) {
							int i_458_ = ((i_443_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_459_ = -i_436_; i_459_ < 0; i_459_++) {
								is[i_451_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_442_ >> 16) + i_458_]);
								i_442_ += i_447_;
							}
							i_443_ += i_448_;
							i_442_ = i_456_;
							i_451_ += i_452_;
						}
					} else if (i_438_ == 0) {
						int i_460_ = (i_439_ & 0xff0000) >> 16;
						int i_461_ = (i_439_ & 0xff00) >> 8;
						int i_462_ = i_439_ & 0xff;
						int i_463_ = i_442_;
						for (int i_464_ = -i_437_; i_464_ < 0; i_464_++) {
							int i_465_ = ((i_443_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_466_ = -i_436_; i_466_ < 0; i_466_++) {
								int i_467_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_442_ >> 16) + i_465_]);
								int i_468_ = (i_467_ & 0xff0000) * i_460_ & ~0xffffff;
								int i_469_ = (i_467_ & 0xff00) * i_461_ & 0xff0000;
								int i_470_ = (i_467_ & 0xff) * i_462_ & 0xff00;
								is[i_451_++] = (i_468_ | i_469_ | i_470_) >>> 8;
								i_442_ += i_447_;
							}
							i_443_ += i_448_;
							i_442_ = i_463_;
							i_451_ += i_452_;
						}
					} else if (i_438_ == 3) {
						int i_471_ = i_442_;
						for (int i_472_ = -i_437_; i_472_ < 0; i_472_++) {
							int i_473_ = ((i_443_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_474_ = -i_436_; i_474_ < 0; i_474_++) {
								int i_475_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_442_ >> 16) + i_473_]);
								int i_476_ = i_475_ + i_439_;
								int i_477_ = ((i_475_ & 0xff00ff) + (i_439_ & 0xff00ff));
								int i_478_ = ((i_477_ & 0x1000100) + (i_476_ - i_477_ & 0x10000));
								is[i_451_++] = i_476_ - i_478_ | i_478_ - (i_478_ >>> 8);
								i_442_ += i_447_;
							}
							i_443_ += i_448_;
							i_442_ = i_471_;
							i_451_ += i_452_;
						}
					} else if (i_438_ == 2) {
						int i_479_ = i_439_ >>> 24;
						int i_480_ = 256 - i_479_;
						int i_481_ = (i_439_ & 0xff00ff) * i_480_ & ~0xff00ff;
						int i_482_ = (i_439_ & 0xff00) * i_480_ & 0xff0000;
						i_439_ = (i_481_ | i_482_) >>> 8;
						int i_483_ = i_442_;
						for (int i_484_ = -i_437_; i_484_ < 0; i_484_++) {
							int i_485_ = ((i_443_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_486_ = -i_436_; i_486_ < 0; i_486_++) {
								int i_487_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_442_ >> 16) + i_485_]);
								i_481_ = (i_487_ & 0xff00ff) * i_479_ & ~0xff00ff;
								i_482_ = (i_487_ & 0xff00) * i_479_ & 0xff0000;
								is[i_451_++] = ((i_481_ | i_482_) >>> 8) + i_439_;
								i_442_ += i_447_;
							}
							i_443_ += i_448_;
							i_442_ = i_483_;
							i_451_ += i_452_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_440_ == 1) {
					if (i_438_ == 1) {
						int i_488_ = i_442_;
						for (int i_489_ = -i_437_; i_489_ < 0; i_489_++) {
							int i_490_ = ((i_443_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_491_ = -i_436_; i_491_ < 0; i_491_++) {
								int i_492_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_442_ >> 16) + i_490_]);
								int i_493_ = i_492_ >>> 24;
								int i_494_ = 256 - i_493_;
								int i_495_ = is[i_451_];
								is[i_451_++] = (((((i_492_ & 0xff00ff) * i_493_ + (i_495_ & 0xff00ff) * i_494_) & ~0xff00ff) >> 8) + (((((i_492_ & ~0xff00ff) >>> 8) * i_493_) + (((i_495_ & ~0xff00ff) >>> 8) * i_494_)) & ~0xff00ff));
								i_442_ += i_447_;
							}
							i_443_ += i_448_;
							i_442_ = i_488_;
							i_451_ += i_452_;
						}
					} else if (i_438_ == 0) {
						int i_496_ = i_442_;
						if ((i_439_ & 0xffffff) == 16777215) {
							for (int i_497_ = -i_437_; i_497_ < 0; i_497_++) {
								int i_498_ = ((i_443_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
								for (int i_499_ = -i_436_; i_499_ < 0; i_499_++) {
									int i_500_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_442_ >> 16) + i_498_]);
									int i_501_ = ((i_500_ >>> 24) * (i_439_ >>> 24) >> 8);
									int i_502_ = 256 - i_501_;
									int i_503_ = is[i_451_];
									is[i_451_++] = ((((i_500_ & 0xff00ff) * i_501_ + (i_503_ & 0xff00ff) * i_502_) & ~0xff00ff) + (((i_500_ & 0xff00) * i_501_ + (i_503_ & 0xff00) * i_502_) & 0xff0000)) >> 8;
									i_442_ += i_447_;
								}
								i_443_ += i_448_;
								i_442_ = i_496_;
								i_451_ += i_452_;
							}
						} else {
							int i_504_ = (i_439_ & 0xff0000) >> 16;
							int i_505_ = (i_439_ & 0xff00) >> 8;
							int i_506_ = i_439_ & 0xff;
							for (int i_507_ = -i_437_; i_507_ < 0; i_507_++) {
								int i_508_ = ((i_443_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
								for (int i_509_ = -i_436_; i_509_ < 0; i_509_++) {
									int i_510_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_442_ >> 16) + i_508_]);
									int i_511_ = ((i_510_ >>> 24) * (i_439_ >>> 24) >> 8);
									int i_512_ = 256 - i_511_;
									if (i_511_ != 255) {
										int i_513_ = ((i_510_ & 0xff0000) * i_504_ & ~0xffffff);
										int i_514_ = ((i_510_ & 0xff00) * i_505_ & 0xff0000);
										int i_515_ = ((i_510_ & 0xff) * i_506_ & 0xff00);
										i_510_ = (i_513_ | i_514_ | i_515_) >>> 8;
										int i_516_ = is[i_451_];
										is[i_451_++] = ((((i_510_ & 0xff00ff) * i_511_ + ((i_516_ & 0xff00ff) * i_512_)) & ~0xff00ff) + (((i_510_ & 0xff00) * i_511_ + ((i_516_ & 0xff00) * i_512_)) & 0xff0000)) >> 8;
									} else {
										int i_517_ = ((i_510_ & 0xff0000) * i_504_ & ~0xffffff);
										int i_518_ = ((i_510_ & 0xff00) * i_505_ & 0xff0000);
										int i_519_ = ((i_510_ & 0xff) * i_506_ & 0xff00);
										is[i_451_++] = (i_517_ | i_518_ | i_519_) >>> 8;
									}
									i_442_ += i_447_;
								}
								i_443_ += i_448_;
								i_442_ = i_496_;
								i_451_ += i_452_;
							}
						}
					} else if (i_438_ == 3) {
						int i_520_ = i_442_;
						for (int i_521_ = -i_437_; i_521_ < 0; i_521_++) {
							int i_522_ = ((i_443_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_523_ = -i_436_; i_523_ < 0; i_523_++) {
								int i_524_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_442_ >> 16) + i_522_]);
								int i_525_ = i_524_ + i_439_;
								int i_526_ = ((i_524_ & 0xff00ff) + (i_439_ & 0xff00ff));
								int i_527_ = ((i_526_ & 0x1000100) + (i_525_ - i_526_ & 0x10000));
								i_527_ = i_525_ - i_527_ | i_527_ - (i_527_ >>> 8);
								int i_528_ = (i_527_ >>> 24) * (i_439_ >>> 24) >> 8;
								int i_529_ = 256 - i_528_;
								if (i_528_ != 255) {
									i_524_ = i_527_;
									i_527_ = is[i_451_];
									i_527_ = ((((i_524_ & 0xff00ff) * i_528_ + (i_527_ & 0xff00ff) * i_529_) & ~0xff00ff) + (((i_524_ & 0xff00) * i_528_ + (i_527_ & 0xff00) * i_529_) & 0xff0000)) >> 8;
								}
								is[i_451_++] = i_527_;
								i_442_ += i_447_;
							}
							i_443_ += i_448_;
							i_442_ = i_520_;
							i_451_ += i_452_;
						}
					} else if (i_438_ == 2) {
						int i_530_ = i_439_ >>> 24;
						int i_531_ = 256 - i_530_;
						int i_532_ = (i_439_ & 0xff00ff) * i_531_ & ~0xff00ff;
						int i_533_ = (i_439_ & 0xff00) * i_531_ & 0xff0000;
						i_439_ = (i_532_ | i_533_) >>> 8;
						int i_534_ = i_442_;
						for (int i_535_ = -i_437_; i_535_ < 0; i_535_++) {
							int i_536_ = ((i_443_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_537_ = -i_436_; i_537_ < 0; i_537_++) {
								int i_538_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_442_ >> 16) + i_536_]);
								int i_539_ = i_538_ >>> 24;
								int i_540_ = 256 - i_539_;
								i_532_ = (i_538_ & 0xff00ff) * i_530_ & ~0xff00ff;
								i_533_ = (i_538_ & 0xff00) * i_530_ & 0xff0000;
								i_538_ = ((i_532_ | i_533_) >>> 8) + i_439_;
								int i_541_ = is[i_451_];
								is[i_451_++] = ((((i_538_ & 0xff00ff) * i_539_ + (i_541_ & 0xff00ff) * i_540_) & ~0xff00ff) + (((i_538_ & 0xff00) * i_539_ + (i_541_ & 0xff00) * i_540_) & 0xff0000)) >> 8;
								i_442_ += i_447_;
							}
							i_443_ += i_448_;
							i_442_ = i_534_;
							i_451_ += i_452_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_440_ == 2) {
					if (i_438_ == 1) {
						int i_542_ = i_442_;
						for (int i_543_ = -i_437_; i_543_ < 0; i_543_++) {
							int i_544_ = ((i_443_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_545_ = -i_436_; i_545_ < 0; i_545_++) {
								int i_546_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_442_ >> 16) + i_544_]);
								if (i_546_ != 0) {
									int i_547_ = is[i_451_];
									int i_548_ = i_546_ + i_547_;
									int i_549_ = ((i_546_ & 0xff00ff) + (i_547_ & 0xff00ff));
									i_547_ = ((i_549_ & 0x1000100) + (i_548_ - i_549_ & 0x10000));
									is[i_451_++] = i_548_ - i_547_ | i_547_ - (i_547_ >>> 8);
								} else
									i_451_++;
								i_442_ += i_447_;
							}
							i_443_ += i_448_;
							i_442_ = i_542_;
							i_451_ += i_452_;
						}
					} else if (i_438_ == 0) {
						int i_550_ = i_442_;
						int i_551_ = (i_439_ & 0xff0000) >> 16;
						int i_552_ = (i_439_ & 0xff00) >> 8;
						int i_553_ = i_439_ & 0xff;
						for (int i_554_ = -i_437_; i_554_ < 0; i_554_++) {
							int i_555_ = ((i_443_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_556_ = -i_436_; i_556_ < 0; i_556_++) {
								int i_557_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_442_ >> 16) + i_555_]);
								if (i_557_ != 0) {
									int i_558_ = ((i_557_ & 0xff0000) * i_551_ & ~0xffffff);
									int i_559_ = ((i_557_ & 0xff00) * i_552_ & 0xff0000);
									int i_560_ = (i_557_ & 0xff) * i_553_ & 0xff00;
									i_557_ = (i_558_ | i_559_ | i_560_) >>> 8;
									int i_561_ = is[i_451_];
									int i_562_ = i_557_ + i_561_;
									int i_563_ = ((i_557_ & 0xff00ff) + (i_561_ & 0xff00ff));
									i_561_ = ((i_563_ & 0x1000100) + (i_562_ - i_563_ & 0x10000));
									is[i_451_++] = i_562_ - i_561_ | i_561_ - (i_561_ >>> 8);
								} else
									i_451_++;
								i_442_ += i_447_;
							}
							i_443_ += i_448_;
							i_442_ = i_550_;
							i_451_ += i_452_;
						}
					} else if (i_438_ == 3) {
						int i_564_ = i_442_;
						for (int i_565_ = -i_437_; i_565_ < 0; i_565_++) {
							int i_566_ = ((i_443_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_567_ = -i_436_; i_567_ < 0; i_567_++) {
								int i_568_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_442_ >> 16) + i_566_]);
								int i_569_ = i_568_ + i_439_;
								int i_570_ = ((i_568_ & 0xff00ff) + (i_439_ & 0xff00ff));
								int i_571_ = ((i_570_ & 0x1000100) + (i_569_ - i_570_ & 0x10000));
								i_568_ = i_569_ - i_571_ | i_571_ - (i_571_ >>> 8);
								i_571_ = is[i_451_];
								i_569_ = i_568_ + i_571_;
								i_570_ = (i_568_ & 0xff00ff) + (i_571_ & 0xff00ff);
								i_571_ = (i_570_ & 0x1000100) + (i_569_ - i_570_ & 0x10000);
								is[i_451_++] = i_569_ - i_571_ | i_571_ - (i_571_ >>> 8);
								i_442_ += i_447_;
							}
							i_443_ += i_448_;
							i_442_ = i_564_;
							i_451_ += i_452_;
						}
					} else if (i_438_ == 2) {
						int i_572_ = i_439_ >>> 24;
						int i_573_ = 256 - i_572_;
						int i_574_ = (i_439_ & 0xff00ff) * i_573_ & ~0xff00ff;
						int i_575_ = (i_439_ & 0xff00) * i_573_ & 0xff0000;
						i_439_ = (i_574_ | i_575_) >>> 8;
						int i_576_ = i_442_;
						for (int i_577_ = -i_437_; i_577_ < 0; i_577_++) {
							int i_578_ = ((i_443_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_579_ = -i_436_; i_579_ < 0; i_579_++) {
								int i_580_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_442_ >> 16) + i_578_]);
								if (i_580_ != 0) {
									i_574_ = ((i_580_ & 0xff00ff) * i_572_ & ~0xff00ff);
									i_575_ = ((i_580_ & 0xff00) * i_572_ & 0xff0000);
									i_580_ = ((i_574_ | i_575_) >>> 8) + i_439_;
									int i_581_ = is[i_451_];
									int i_582_ = i_580_ + i_581_;
									int i_583_ = ((i_580_ & 0xff00ff) + (i_581_ & 0xff00ff));
									i_581_ = ((i_583_ & 0x1000100) + (i_582_ - i_583_ & 0x10000));
									is[i_451_++] = i_582_ - i_581_ | i_581_ - (i_581_ >>> 8);
								} else
									i_451_++;
								i_442_ += i_447_;
							}
							i_443_ += i_448_;
							i_442_ = i_576_;
							i_451_ += i_452_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method681(int[] is, int[] is_584_, int i, int i_585_) {
		int[] is_586_ = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is_586_ != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_587_ = anInt9001;
					while (i_587_ < 0) {
						int i_588_ = i_587_ + i_585_;
						if (i_588_ >= 0) {
							if (i_588_ >= is.length)
								break;
							int i_589_ = anInt9003;
							int i_590_ = anInt8988;
							int i_591_ = anInt9011;
							int i_592_ = anInt8999;
							if (i_590_ >= 0 && i_591_ >= 0 && (i_590_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) < 0 && (i_591_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) < 0) {
								int i_593_ = is[i_588_] - i;
								int i_594_ = -is_584_[i_588_];
								int i_595_ = i_593_ - (i_589_ - anInt9003);
								if (i_595_ > 0) {
									i_589_ += i_595_;
									i_592_ += i_595_;
									i_590_ += anInt9004 * i_595_;
									i_591_ += anInt8991 * i_595_;
								} else
									i_594_ -= i_595_;
								if (i_592_ < i_594_)
									i_592_ = i_594_;
								for (/**/; i_592_ < 0; i_592_++) {
									int i_596_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_591_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_590_ >> 12))]);
									int i_597_ = i_596_ >>> 24;
									int i_598_ = 256 - i_597_;
									int i_599_ = is_586_[i_589_];
									is_586_[i_589_++] = ((((i_596_ & 0xff00ff) * i_597_ + (i_599_ & 0xff00ff) * i_598_) & ~0xff00ff) + (((i_596_ & 0xff00) * i_597_ + (i_599_ & 0xff00) * i_598_) & 0xff0000)) >> 8;
								}
							}
						}
						i_587_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_600_ = anInt9001;
					while (i_600_ < 0) {
						int i_601_ = i_600_ + i_585_;
						if (i_601_ >= 0) {
							if (i_601_ >= is.length)
								break;
							int i_602_ = anInt9003;
							int i_603_ = anInt8988;
							int i_604_ = anInt9011 + anInt9013;
							int i_605_ = anInt8999;
							if (i_603_ >= 0 && (i_603_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) < 0) {
								int i_606_;
								if ((i_606_ = (i_604_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12))) >= 0) {
									i_606_ = (anInt8991 - i_606_) / anInt8991;
									i_605_ += i_606_;
									i_604_ += anInt8991 * i_606_;
									i_602_ += i_606_;
								}
								if ((i_606_ = (i_604_ - anInt8991) / anInt8991) > i_605_)
									i_605_ = i_606_;
								int i_607_ = is[i_601_] - i;
								int i_608_ = -is_584_[i_601_];
								int i_609_ = i_607_ - (i_602_ - anInt9003);
								if (i_609_ > 0) {
									i_602_ += i_609_;
									i_605_ += i_609_;
									i_603_ += anInt9004 * i_609_;
									i_604_ += anInt8991 * i_609_;
								} else
									i_608_ -= i_609_;
								if (i_605_ < i_608_)
									i_605_ = i_608_;
								for (/**/; i_605_ < 0; i_605_++) {
									int i_610_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_604_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_603_ >> 12))]);
									int i_611_ = i_610_ >>> 24;
									int i_612_ = 256 - i_611_;
									int i_613_ = is_586_[i_602_];
									is_586_[i_602_++] = ((((i_610_ & 0xff00ff) * i_611_ + (i_613_ & 0xff00ff) * i_612_) & ~0xff00ff) + (((i_610_ & 0xff00) * i_611_ + (i_613_ & 0xff00) * i_612_) & 0xff0000)) >> 8;
									i_604_ += anInt8991;
								}
							}
						}
						i_600_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_614_ = anInt9001;
					while (i_614_ < 0) {
						int i_615_ = i_614_ + i_585_;
						if (i_615_ >= 0) {
							if (i_615_ >= is.length)
								break;
							int i_616_ = anInt9003;
							int i_617_ = anInt8988;
							int i_618_ = anInt9011 + anInt9013;
							int i_619_ = anInt8999;
							if (i_617_ >= 0 && (i_617_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) < 0) {
								if (i_618_ < 0) {
									int i_620_ = (anInt8991 - 1 - i_618_) / anInt8991;
									i_619_ += i_620_;
									i_618_ += anInt8991 * i_620_;
									i_616_ += i_620_;
								}
								int i_621_;
								if ((i_621_ = (1 + i_618_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_619_)
									i_619_ = i_621_;
								int i_622_ = is[i_615_] - i;
								int i_623_ = -is_584_[i_615_];
								int i_624_ = i_622_ - (i_616_ - anInt9003);
								if (i_624_ > 0) {
									i_616_ += i_624_;
									i_619_ += i_624_;
									i_617_ += anInt9004 * i_624_;
									i_618_ += anInt8991 * i_624_;
								} else
									i_623_ -= i_624_;
								if (i_619_ < i_623_)
									i_619_ = i_623_;
								for (/**/; i_619_ < 0; i_619_++) {
									int i_625_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_618_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_617_ >> 12))]);
									int i_626_ = i_625_ >>> 24;
									int i_627_ = 256 - i_626_;
									int i_628_ = is_586_[i_616_];
									is_586_[i_616_++] = ((((i_625_ & 0xff00ff) * i_626_ + (i_628_ & 0xff00ff) * i_627_) & ~0xff00ff) + (((i_625_ & 0xff00) * i_626_ + (i_628_ & 0xff00) * i_627_) & 0xff0000)) >> 8;
									i_618_ += anInt8991;
								}
							}
						}
						i_614_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_629_ = anInt9001;
					while (i_629_ < 0) {
						int i_630_ = i_629_ + i_585_;
						if (i_630_ >= 0) {
							if (i_630_ >= is.length)
								break;
							int i_631_ = anInt9003;
							int i_632_ = anInt8988 + anInt9012;
							int i_633_ = anInt9011;
							int i_634_ = anInt8999;
							if (i_633_ >= 0 && (i_633_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) < 0) {
								int i_635_;
								if ((i_635_ = (i_632_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12))) >= 0) {
									i_635_ = (anInt9004 - i_635_) / anInt9004;
									i_634_ += i_635_;
									i_632_ += anInt9004 * i_635_;
									i_631_ += i_635_;
								}
								if ((i_635_ = (i_632_ - anInt9004) / anInt9004) > i_634_)
									i_634_ = i_635_;
								int i_636_ = is[i_630_] - i;
								int i_637_ = -is_584_[i_630_];
								int i_638_ = i_636_ - (i_631_ - anInt9003);
								if (i_638_ > 0) {
									i_631_ += i_638_;
									i_634_ += i_638_;
									i_632_ += anInt9004 * i_638_;
									i_633_ += anInt8991 * i_638_;
								} else
									i_637_ -= i_638_;
								if (i_634_ < i_637_)
									i_634_ = i_637_;
								for (/**/; i_634_ < 0; i_634_++) {
									int i_639_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_633_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_632_ >> 12))]);
									int i_640_ = i_639_ >>> 24;
									int i_641_ = 256 - i_640_;
									int i_642_ = is_586_[i_631_];
									is_586_[i_631_++] = ((((i_639_ & 0xff00ff) * i_640_ + (i_642_ & 0xff00ff) * i_641_) & ~0xff00ff) + (((i_639_ & 0xff00) * i_640_ + (i_642_ & 0xff00) * i_641_) & 0xff0000)) >> 8;
									i_632_ += anInt9004;
								}
							}
						}
						i_629_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_643_ = anInt9001;
					while (i_643_ < 0) {
						int i_644_ = i_643_ + i_585_;
						if (i_644_ >= 0) {
							if (i_644_ >= is.length)
								break;
							int i_645_ = anInt9003;
							int i_646_ = anInt8988 + anInt9012;
							int i_647_ = anInt9011 + anInt9013;
							int i_648_ = anInt8999;
							int i_649_;
							if ((i_649_ = i_646_ - ((((Class57_Sub1_Sub1) this).anInt9010) << 12)) >= 0) {
								i_649_ = (anInt9004 - i_649_) / anInt9004;
								i_648_ += i_649_;
								i_646_ += anInt9004 * i_649_;
								i_647_ += anInt8991 * i_649_;
								i_645_ += i_649_;
							}
							if ((i_649_ = (i_646_ - anInt9004) / anInt9004) > i_648_)
								i_648_ = i_649_;
							if ((i_649_ = i_647_ - ((((Class57_Sub1_Sub1) this).anInt8989) << 12)) >= 0) {
								i_649_ = (anInt8991 - i_649_) / anInt8991;
								i_648_ += i_649_;
								i_646_ += anInt9004 * i_649_;
								i_647_ += anInt8991 * i_649_;
								i_645_ += i_649_;
							}
							if ((i_649_ = (i_647_ - anInt8991) / anInt8991) > i_648_)
								i_648_ = i_649_;
							int i_650_ = is[i_644_] - i;
							int i_651_ = -is_584_[i_644_];
							int i_652_ = i_650_ - (i_645_ - anInt9003);
							if (i_652_ > 0) {
								i_645_ += i_652_;
								i_648_ += i_652_;
								i_646_ += anInt9004 * i_652_;
								i_647_ += anInt8991 * i_652_;
							} else
								i_651_ -= i_652_;
							if (i_648_ < i_651_)
								i_648_ = i_651_;
							for (/**/; i_648_ < 0; i_648_++) {
								int i_653_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_647_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010 + (i_646_ >> 12))]);
								int i_654_ = i_653_ >>> 24;
								int i_655_ = 256 - i_654_;
								int i_656_ = is_586_[i_645_];
								is_586_[i_645_++] = ((((i_653_ & 0xff00ff) * i_654_ + (i_656_ & 0xff00ff) * i_655_) & ~0xff00ff) + (((i_653_ & 0xff00) * i_654_ + (i_656_ & 0xff00) * i_655_) & 0xff0000)) >> 8;
								i_646_ += anInt9004;
								i_647_ += anInt8991;
							}
						}
						i_643_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_657_ = anInt9001;
					while (i_657_ < 0) {
						int i_658_ = i_657_ + i_585_;
						if (i_658_ >= 0) {
							if (i_658_ >= is.length)
								break;
							int i_659_ = anInt9003;
							int i_660_ = anInt8988 + anInt9012;
							int i_661_ = anInt9011 + anInt9013;
							int i_662_ = anInt8999;
							int i_663_;
							if ((i_663_ = i_660_ - ((((Class57_Sub1_Sub1) this).anInt9010) << 12)) >= 0) {
								i_663_ = (anInt9004 - i_663_) / anInt9004;
								i_662_ += i_663_;
								i_660_ += anInt9004 * i_663_;
								i_661_ += anInt8991 * i_663_;
								i_659_ += i_663_;
							}
							if ((i_663_ = (i_660_ - anInt9004) / anInt9004) > i_662_)
								i_662_ = i_663_;
							if (i_661_ < 0) {
								i_663_ = (anInt8991 - 1 - i_661_) / anInt8991;
								i_662_ += i_663_;
								i_660_ += anInt9004 * i_663_;
								i_661_ += anInt8991 * i_663_;
								i_659_ += i_663_;
							}
							if ((i_663_ = (1 + i_661_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_662_)
								i_662_ = i_663_;
							int i_664_ = is[i_658_] - i;
							int i_665_ = -is_584_[i_658_];
							int i_666_ = i_664_ - (i_659_ - anInt9003);
							if (i_666_ > 0) {
								i_659_ += i_666_;
								i_662_ += i_666_;
								i_660_ += anInt9004 * i_666_;
								i_661_ += anInt8991 * i_666_;
							} else
								i_665_ -= i_666_;
							if (i_662_ < i_665_)
								i_662_ = i_665_;
							for (/**/; i_662_ < 0; i_662_++) {
								int i_667_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_661_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010 + (i_660_ >> 12))]);
								int i_668_ = i_667_ >>> 24;
								int i_669_ = 256 - i_668_;
								int i_670_ = is_586_[i_659_];
								is_586_[i_659_++] = ((((i_667_ & 0xff00ff) * i_668_ + (i_670_ & 0xff00ff) * i_669_) & ~0xff00ff) + (((i_667_ & 0xff00) * i_668_ + (i_670_ & 0xff00) * i_669_) & 0xff0000)) >> 8;
								i_660_ += anInt9004;
								i_661_ += anInt8991;
							}
						}
						i_657_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_671_ = anInt9001;
				while (i_671_ < 0) {
					int i_672_ = i_671_ + i_585_;
					if (i_672_ >= 0) {
						if (i_672_ >= is.length)
							break;
						int i_673_ = anInt9003;
						int i_674_ = anInt8988 + anInt9012;
						int i_675_ = anInt9011;
						int i_676_ = anInt8999;
						if (i_675_ >= 0 && i_675_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) < 0) {
							if (i_674_ < 0) {
								int i_677_ = (anInt9004 - 1 - i_674_) / anInt9004;
								i_676_ += i_677_;
								i_674_ += anInt9004 * i_677_;
								i_673_ += i_677_;
							}
							int i_678_;
							if ((i_678_ = (1 + i_674_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_676_)
								i_676_ = i_678_;
							int i_679_ = is[i_672_] - i;
							int i_680_ = -is_584_[i_672_];
							int i_681_ = i_679_ - (i_673_ - anInt9003);
							if (i_681_ > 0) {
								i_673_ += i_681_;
								i_676_ += i_681_;
								i_674_ += anInt9004 * i_681_;
								i_675_ += anInt8991 * i_681_;
							} else
								i_680_ -= i_681_;
							if (i_676_ < i_680_)
								i_676_ = i_680_;
							for (/**/; i_676_ < 0; i_676_++) {
								int i_682_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_675_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010 + (i_674_ >> 12))]);
								int i_683_ = i_682_ >>> 24;
								int i_684_ = 256 - i_683_;
								int i_685_ = is_586_[i_673_];
								is_586_[i_673_++] = ((((i_682_ & 0xff00ff) * i_683_ + (i_685_ & 0xff00ff) * i_684_) & ~0xff00ff) + (((i_682_ & 0xff00) * i_683_ + (i_685_ & 0xff00) * i_684_) & 0xff0000)) >> 8;
								i_674_ += anInt9004;
							}
						}
					}
					i_671_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				int i_686_ = anInt9001;
				while (i_686_ < 0) {
					int i_687_ = i_686_ + i_585_;
					if (i_687_ >= 0) {
						if (i_687_ >= is.length)
							break;
						int i_688_ = anInt9003;
						int i_689_ = anInt8988 + anInt9012;
						int i_690_ = anInt9011 + anInt9013;
						int i_691_ = anInt8999;
						if (i_689_ < 0) {
							int i_692_ = (anInt9004 - 1 - i_689_) / anInt9004;
							i_691_ += i_692_;
							i_689_ += anInt9004 * i_692_;
							i_690_ += anInt8991 * i_692_;
							i_688_ += i_692_;
						}
						int i_693_;
						if ((i_693_ = (1 + i_689_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_691_)
							i_691_ = i_693_;
						if ((i_693_ = i_690_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) >= 0) {
							i_693_ = (anInt8991 - i_693_) / anInt8991;
							i_691_ += i_693_;
							i_689_ += anInt9004 * i_693_;
							i_690_ += anInt8991 * i_693_;
							i_688_ += i_693_;
						}
						if ((i_693_ = (i_690_ - anInt8991) / anInt8991) > i_691_)
							i_691_ = i_693_;
						int i_694_ = is[i_687_] - i;
						int i_695_ = -is_584_[i_687_];
						int i_696_ = i_694_ - (i_688_ - anInt9003);
						if (i_696_ > 0) {
							i_688_ += i_696_;
							i_691_ += i_696_;
							i_689_ += anInt9004 * i_696_;
							i_690_ += anInt8991 * i_696_;
						} else
							i_695_ -= i_696_;
						if (i_691_ < i_695_)
							i_691_ = i_695_;
						for (/**/; i_691_ < 0; i_691_++) {
							int i_697_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_690_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_689_ >> 12))]);
							int i_698_ = i_697_ >>> 24;
							int i_699_ = 256 - i_698_;
							int i_700_ = is_586_[i_688_];
							is_586_[i_688_++] = ((((i_697_ & 0xff00ff) * i_698_ + (i_700_ & 0xff00ff) * i_699_) & ~0xff00ff) + (((i_697_ & 0xff00) * i_698_ + (i_700_ & 0xff00) * i_699_) & 0xff0000)) >> 8;
							i_689_ += anInt9004;
							i_690_ += anInt8991;
						}
					}
					i_686_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				int i_701_ = anInt9001;
				while (i_701_ < 0) {
					int i_702_ = i_701_ + i_585_;
					if (i_702_ >= 0) {
						if (i_702_ >= is.length)
							break;
						int i_703_ = anInt9003;
						int i_704_ = anInt8988 + anInt9012;
						int i_705_ = anInt9011 + anInt9013;
						int i_706_ = anInt8999;
						if (i_704_ < 0) {
							int i_707_ = (anInt9004 - 1 - i_704_) / anInt9004;
							i_706_ += i_707_;
							i_704_ += anInt9004 * i_707_;
							i_705_ += anInt8991 * i_707_;
							i_703_ += i_707_;
						}
						int i_708_;
						if ((i_708_ = (1 + i_704_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_706_)
							i_706_ = i_708_;
						if (i_705_ < 0) {
							i_708_ = (anInt8991 - 1 - i_705_) / anInt8991;
							i_706_ += i_708_;
							i_704_ += anInt9004 * i_708_;
							i_705_ += anInt8991 * i_708_;
							i_703_ += i_708_;
						}
						if ((i_708_ = (1 + i_705_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_706_)
							i_706_ = i_708_;
						int i_709_ = is[i_702_] - i;
						int i_710_ = -is_584_[i_702_];
						int i_711_ = i_709_ - (i_703_ - anInt9003);
						if (i_711_ > 0) {
							i_703_ += i_711_;
							i_706_ += i_711_;
							i_704_ += anInt9004 * i_711_;
							i_705_ += anInt8991 * i_711_;
						} else
							i_710_ -= i_711_;
						if (i_706_ < i_710_)
							i_706_ = i_710_;
						for (/**/; i_706_ < 0; i_706_++) {
							int i_712_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_705_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_704_ >> 12))]);
							int i_713_ = i_712_ >>> 24;
							int i_714_ = 256 - i_713_;
							int i_715_ = is_586_[i_703_];
							is_586_[i_703_++] = ((((i_712_ & 0xff00ff) * i_713_ + (i_715_ & 0xff00ff) * i_714_) & ~0xff00ff) + (((i_712_ & 0xff00) * i_713_ + (i_715_ & 0xff00) * i_714_) & 0xff0000)) >> 8;
							i_704_ += anInt9004;
							i_705_ += anInt8991;
						}
					}
					i_701_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	public void method628(int i, int i_716_, int i_717_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is == null)
			throw new IllegalStateException("");
		if (i_717_ == 0) {
			for (int i_718_ = 0; i_718_ < ((Class57_Sub1_Sub1) this).anInt8989; i_718_++) {
				int i_719_ = i_718_ * ((Class57_Sub1_Sub1) this).anInt9010;
				int i_720_ = (((i_716_ + i_718_) * (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883)) + i);
				for (int i_721_ = 0; i_721_ < ((Class57_Sub1_Sub1) this).anInt9010; i_721_++)
					((Class57_Sub1_Sub1) this).anIntArray9965[i_719_ + i_721_] = ((((Class57_Sub1_Sub1) this).anIntArray9965[i_719_ + i_721_]) & 0xffffff | is[i_720_ + i_721_] << 8 & ~0xffffff);
			}
		} else if (i_717_ == 1) {
			for (int i_722_ = 0; i_722_ < ((Class57_Sub1_Sub1) this).anInt8989; i_722_++) {
				int i_723_ = i_722_ * ((Class57_Sub1_Sub1) this).anInt9010;
				int i_724_ = (((i_716_ + i_722_) * (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883)) + i);
				for (int i_725_ = 0; i_725_ < ((Class57_Sub1_Sub1) this).anInt9010; i_725_++)
					((Class57_Sub1_Sub1) this).anIntArray9965[i_723_ + i_725_] = ((((Class57_Sub1_Sub1) this).anIntArray9965[i_723_ + i_725_]) & 0xffffff | is[i_724_ + i_725_] << 16 & ~0xffffff);
			}
		} else if (i_717_ == 2) {
			for (int i_726_ = 0; i_726_ < ((Class57_Sub1_Sub1) this).anInt8989; i_726_++) {
				int i_727_ = i_726_ * ((Class57_Sub1_Sub1) this).anInt9010;
				int i_728_ = (((i_716_ + i_726_) * (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883)) + i);
				for (int i_729_ = 0; i_729_ < ((Class57_Sub1_Sub1) this).anInt9010; i_729_++)
					((Class57_Sub1_Sub1) this).anIntArray9965[i_727_ + i_729_] = ((((Class57_Sub1_Sub1) this).anIntArray9965[i_727_ + i_729_]) & 0xffffff | is[i_728_ + i_729_] << 24 & ~0xffffff);
			}
		} else if (i_717_ == 3) {
			for (int i_730_ = 0; i_730_ < ((Class57_Sub1_Sub1) this).anInt8989; i_730_++) {
				int i_731_ = i_730_ * ((Class57_Sub1_Sub1) this).anInt9010;
				int i_732_ = (((i_716_ + i_730_) * (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883)) + i);
				for (int i_733_ = 0; i_733_ < ((Class57_Sub1_Sub1) this).anInt9010; i_733_++)
					((Class57_Sub1_Sub1) this).anIntArray9965[i_731_ + i_733_] = ((((Class57_Sub1_Sub1) this).anIntArray9965[i_731_ + i_733_]) & 0xffffff | (is[i_732_ + i_733_] != 0 ? -16777216 : 0));
			}
		}
	}

	Class57_Sub1_Sub1(Class_ra_Sub1 class_ra_sub1, int i, int i_734_) {
		super(class_ra_sub1, i, i_734_);
		((Class57_Sub1_Sub1) this).anIntArray9965 = new int[i * i_734_];
	}

	void method686(int i, int i_735_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_736_ = anInt9001;
					while (i_736_ < 0) {
						int i_737_ = anInt9003;
						int i_738_ = anInt8988;
						int i_739_ = anInt9011;
						int i_740_ = anInt8999;
						if (i_738_ >= 0 && i_739_ >= 0 && i_738_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) < 0 && i_739_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) < 0) {
							for (/**/; i_740_ < 0; i_740_++) {
								int i_741_ = (((i_739_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_738_ >> 12));
								int i_742_ = i_737_++;
								if (i_735_ == 0) {
									if (i == 1)
										is[i_742_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_741_]);
									else if (i == 0) {
										int i_743_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_741_++]);
										int i_744_ = ((i_743_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_745_ = ((i_743_ & 0xff00) * anInt9018 & 0xff0000);
										int i_746_ = ((i_743_ & 0xff) * anInt9019 & 0xff00);
										is[i_742_] = (i_744_ | i_745_ | i_746_) >>> 8;
									} else if (i == 3) {
										int i_747_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_741_++]);
										int i_748_ = anInt9014;
										int i_749_ = i_747_ + i_748_;
										int i_750_ = ((i_747_ & 0xff00ff) + (i_748_ & 0xff00ff));
										int i_751_ = ((i_750_ & 0x1000100) + (i_749_ - i_750_ & 0x10000));
										is[i_742_] = (i_749_ - i_751_ | i_751_ - (i_751_ >>> 8));
									} else if (i == 2) {
										int i_752_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_741_]);
										int i_753_ = ((i_752_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_754_ = ((i_752_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_742_] = (((i_753_ | i_754_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_735_ == 1) {
									if (i == 1) {
										int i_755_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_741_]);
										int i_756_ = i_755_ >>> 24;
										int i_757_ = 256 - i_756_;
										int i_758_ = is[i_742_];
										is[i_742_] = ((((i_755_ & 0xff00ff) * i_756_ + ((i_758_ & 0xff00ff) * i_757_)) & ~0xff00ff) + (((i_755_ & 0xff00) * i_756_ + ((i_758_ & 0xff00) * i_757_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_759_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_741_]);
										int i_760_ = (i_759_ >>> 24) * anInt9015 >> 8;
										int i_761_ = 256 - i_760_;
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_762_ = is[i_742_];
											is[i_742_] = (((((i_759_ & 0xff00ff) * i_760_) + ((i_762_ & 0xff00ff) * i_761_)) & ~0xff00ff) + ((((i_759_ & 0xff00) * i_760_) + ((i_762_ & 0xff00) * i_761_)) & 0xff0000)) >> 8;
										} else if (i_760_ != 255) {
											int i_763_ = (((i_759_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_764_ = (((i_759_ & 0xff00) * anInt9018) & 0xff0000);
											int i_765_ = ((i_759_ & 0xff) * anInt9019 & 0xff00);
											i_759_ = (i_763_ | i_764_ | i_765_) >>> 8;
											int i_766_ = is[i_742_];
											is[i_742_] = (((((i_759_ & 0xff00ff) * i_760_) + ((i_766_ & 0xff00ff) * i_761_)) & ~0xff00ff) + ((((i_759_ & 0xff00) * i_760_) + ((i_766_ & 0xff00) * i_761_)) & 0xff0000)) >> 8;
										} else {
											int i_767_ = (((i_759_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_768_ = (((i_759_ & 0xff00) * anInt9018) & 0xff0000);
											int i_769_ = ((i_759_ & 0xff) * anInt9019 & 0xff00);
											is[i_742_] = (i_767_ | i_768_ | i_769_) >>> 8;
										}
									} else if (i == 3) {
										int i_770_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_741_]);
										int i_771_ = anInt9014;
										int i_772_ = i_770_ + i_771_;
										int i_773_ = ((i_770_ & 0xff00ff) + (i_771_ & 0xff00ff));
										int i_774_ = ((i_773_ & 0x1000100) + (i_772_ - i_773_ & 0x10000));
										i_774_ = (i_772_ - i_774_ | i_774_ - (i_774_ >>> 8));
										int i_775_ = (i_770_ >>> 24) * anInt9015 >> 8;
										int i_776_ = 256 - i_775_;
										if (i_775_ != 255) {
											i_770_ = i_774_;
											i_774_ = is[i_742_];
											i_774_ = (((((i_770_ & 0xff00ff) * i_775_) + ((i_774_ & 0xff00ff) * i_776_)) & ~0xff00ff) + ((((i_770_ & 0xff00) * i_775_) + ((i_774_ & 0xff00) * i_776_)) & 0xff0000)) >> 8;
										}
										is[i_742_] = i_774_;
									} else if (i == 2) {
										int i_777_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_741_]);
										int i_778_ = i_777_ >>> 24;
										int i_779_ = 256 - i_778_;
										int i_780_ = ((i_777_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_781_ = ((i_777_ & 0xff00) * anInt9015 & 0xff0000);
										i_777_ = (((i_780_ | i_781_) >>> 8) + anInt9022);
										int i_782_ = is[i_742_];
										is[i_742_] = ((((i_777_ & 0xff00ff) * i_778_ + ((i_782_ & 0xff00ff) * i_779_)) & ~0xff00ff) + (((i_777_ & 0xff00) * i_778_ + ((i_782_ & 0xff00) * i_779_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_735_ == 2) {
									if (i == 1) {
										int i_783_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_741_]);
										int i_784_ = is[i_742_];
										int i_785_ = i_783_ + i_784_;
										int i_786_ = ((i_783_ & 0xff00ff) + (i_784_ & 0xff00ff));
										i_784_ = ((i_786_ & 0x1000100) + (i_785_ - i_786_ & 0x10000));
										is[i_742_] = (i_785_ - i_784_ | i_784_ - (i_784_ >>> 8));
									} else if (i == 0) {
										int i_787_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_741_]);
										int i_788_ = ((i_787_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_789_ = ((i_787_ & 0xff00) * anInt9018 & 0xff0000);
										int i_790_ = ((i_787_ & 0xff) * anInt9019 & 0xff00);
										i_787_ = (i_788_ | i_789_ | i_790_) >>> 8;
										int i_791_ = is[i_742_];
										int i_792_ = i_787_ + i_791_;
										int i_793_ = ((i_787_ & 0xff00ff) + (i_791_ & 0xff00ff));
										i_791_ = ((i_793_ & 0x1000100) + (i_792_ - i_793_ & 0x10000));
										is[i_742_] = (i_792_ - i_791_ | i_791_ - (i_791_ >>> 8));
									} else if (i == 3) {
										int i_794_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_741_]);
										int i_795_ = anInt9014;
										int i_796_ = i_794_ + i_795_;
										int i_797_ = ((i_794_ & 0xff00ff) + (i_795_ & 0xff00ff));
										int i_798_ = ((i_797_ & 0x1000100) + (i_796_ - i_797_ & 0x10000));
										i_794_ = (i_796_ - i_798_ | i_798_ - (i_798_ >>> 8));
										i_798_ = is[i_742_];
										i_796_ = i_794_ + i_798_;
										i_797_ = ((i_794_ & 0xff00ff) + (i_798_ & 0xff00ff));
										i_798_ = ((i_797_ & 0x1000100) + (i_796_ - i_797_ & 0x10000));
										is[i_742_] = (i_796_ - i_798_ | i_798_ - (i_798_ >>> 8));
									} else if (i == 2) {
										int i_799_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_741_]);
										int i_800_ = ((i_799_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_801_ = ((i_799_ & 0xff00) * anInt9015 & 0xff0000);
										i_799_ = (((i_800_ | i_801_) >>> 8) + anInt9022);
										int i_802_ = is[i_742_];
										int i_803_ = i_799_ + i_802_;
										int i_804_ = ((i_799_ & 0xff00ff) + (i_802_ & 0xff00ff));
										i_802_ = ((i_804_ & 0x1000100) + (i_803_ - i_804_ & 0x10000));
										is[i_742_] = (i_803_ - i_802_ | i_802_ - (i_802_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_736_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_805_ = anInt9001;
					while (i_805_ < 0) {
						int i_806_ = anInt9003;
						int i_807_ = anInt8988;
						int i_808_ = anInt9011 + anInt9013;
						int i_809_ = anInt8999;
						if (i_807_ >= 0 && i_807_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) < 0) {
							int i_810_;
							if ((i_810_ = i_808_ - ((((Class57_Sub1_Sub1) this).anInt8989) << 12)) >= 0) {
								i_810_ = (anInt8991 - i_810_) / anInt8991;
								i_809_ += i_810_;
								i_808_ += anInt8991 * i_810_;
								i_806_ += i_810_;
							}
							if ((i_810_ = (i_808_ - anInt8991) / anInt8991) > i_809_)
								i_809_ = i_810_;
							for (/**/; i_809_ < 0; i_809_++) {
								int i_811_ = (((i_808_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_807_ >> 12));
								int i_812_ = i_806_++;
								if (i_735_ == 0) {
									if (i == 1)
										is[i_812_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_811_]);
									else if (i == 0) {
										int i_813_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_811_++]);
										int i_814_ = ((i_813_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_815_ = ((i_813_ & 0xff00) * anInt9018 & 0xff0000);
										int i_816_ = ((i_813_ & 0xff) * anInt9019 & 0xff00);
										is[i_812_] = (i_814_ | i_815_ | i_816_) >>> 8;
									} else if (i == 3) {
										int i_817_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_811_++]);
										int i_818_ = anInt9014;
										int i_819_ = i_817_ + i_818_;
										int i_820_ = ((i_817_ & 0xff00ff) + (i_818_ & 0xff00ff));
										int i_821_ = ((i_820_ & 0x1000100) + (i_819_ - i_820_ & 0x10000));
										is[i_812_] = (i_819_ - i_821_ | i_821_ - (i_821_ >>> 8));
									} else if (i == 2) {
										int i_822_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_811_]);
										int i_823_ = ((i_822_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_824_ = ((i_822_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_812_] = (((i_823_ | i_824_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_735_ == 1) {
									if (i == 1) {
										int i_825_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_811_]);
										int i_826_ = i_825_ >>> 24;
										int i_827_ = 256 - i_826_;
										int i_828_ = is[i_812_];
										is[i_812_] = ((((i_825_ & 0xff00ff) * i_826_ + ((i_828_ & 0xff00ff) * i_827_)) & ~0xff00ff) + (((i_825_ & 0xff00) * i_826_ + ((i_828_ & 0xff00) * i_827_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_829_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_811_]);
										int i_830_ = (i_829_ >>> 24) * anInt9015 >> 8;
										int i_831_ = 256 - i_830_;
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_832_ = is[i_812_];
											is[i_812_] = (((((i_829_ & 0xff00ff) * i_830_) + ((i_832_ & 0xff00ff) * i_831_)) & ~0xff00ff) + ((((i_829_ & 0xff00) * i_830_) + ((i_832_ & 0xff00) * i_831_)) & 0xff0000)) >> 8;
										} else if (i_830_ != 255) {
											int i_833_ = (((i_829_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_834_ = (((i_829_ & 0xff00) * anInt9018) & 0xff0000);
											int i_835_ = ((i_829_ & 0xff) * anInt9019 & 0xff00);
											i_829_ = (i_833_ | i_834_ | i_835_) >>> 8;
											int i_836_ = is[i_812_];
											is[i_812_] = (((((i_829_ & 0xff00ff) * i_830_) + ((i_836_ & 0xff00ff) * i_831_)) & ~0xff00ff) + ((((i_829_ & 0xff00) * i_830_) + ((i_836_ & 0xff00) * i_831_)) & 0xff0000)) >> 8;
										} else {
											int i_837_ = (((i_829_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_838_ = (((i_829_ & 0xff00) * anInt9018) & 0xff0000);
											int i_839_ = ((i_829_ & 0xff) * anInt9019 & 0xff00);
											is[i_812_] = (i_837_ | i_838_ | i_839_) >>> 8;
										}
									} else if (i == 3) {
										int i_840_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_811_]);
										int i_841_ = anInt9014;
										int i_842_ = i_840_ + i_841_;
										int i_843_ = ((i_840_ & 0xff00ff) + (i_841_ & 0xff00ff));
										int i_844_ = ((i_843_ & 0x1000100) + (i_842_ - i_843_ & 0x10000));
										i_844_ = (i_842_ - i_844_ | i_844_ - (i_844_ >>> 8));
										int i_845_ = (i_840_ >>> 24) * anInt9015 >> 8;
										int i_846_ = 256 - i_845_;
										if (i_845_ != 255) {
											i_840_ = i_844_;
											i_844_ = is[i_812_];
											i_844_ = (((((i_840_ & 0xff00ff) * i_845_) + ((i_844_ & 0xff00ff) * i_846_)) & ~0xff00ff) + ((((i_840_ & 0xff00) * i_845_) + ((i_844_ & 0xff00) * i_846_)) & 0xff0000)) >> 8;
										}
										is[i_812_] = i_844_;
									} else if (i == 2) {
										int i_847_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_811_]);
										int i_848_ = i_847_ >>> 24;
										int i_849_ = 256 - i_848_;
										int i_850_ = ((i_847_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_851_ = ((i_847_ & 0xff00) * anInt9015 & 0xff0000);
										i_847_ = (((i_850_ | i_851_) >>> 8) + anInt9022);
										int i_852_ = is[i_812_];
										is[i_812_] = ((((i_847_ & 0xff00ff) * i_848_ + ((i_852_ & 0xff00ff) * i_849_)) & ~0xff00ff) + (((i_847_ & 0xff00) * i_848_ + ((i_852_ & 0xff00) * i_849_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_735_ == 2) {
									if (i == 1) {
										int i_853_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_811_]);
										int i_854_ = is[i_812_];
										int i_855_ = i_853_ + i_854_;
										int i_856_ = ((i_853_ & 0xff00ff) + (i_854_ & 0xff00ff));
										i_854_ = ((i_856_ & 0x1000100) + (i_855_ - i_856_ & 0x10000));
										is[i_812_] = (i_855_ - i_854_ | i_854_ - (i_854_ >>> 8));
									} else if (i == 0) {
										int i_857_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_811_]);
										int i_858_ = ((i_857_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_859_ = ((i_857_ & 0xff00) * anInt9018 & 0xff0000);
										int i_860_ = ((i_857_ & 0xff) * anInt9019 & 0xff00);
										i_857_ = (i_858_ | i_859_ | i_860_) >>> 8;
										int i_861_ = is[i_812_];
										int i_862_ = i_857_ + i_861_;
										int i_863_ = ((i_857_ & 0xff00ff) + (i_861_ & 0xff00ff));
										i_861_ = ((i_863_ & 0x1000100) + (i_862_ - i_863_ & 0x10000));
										is[i_812_] = (i_862_ - i_861_ | i_861_ - (i_861_ >>> 8));
									} else if (i == 3) {
										int i_864_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_811_]);
										int i_865_ = anInt9014;
										int i_866_ = i_864_ + i_865_;
										int i_867_ = ((i_864_ & 0xff00ff) + (i_865_ & 0xff00ff));
										int i_868_ = ((i_867_ & 0x1000100) + (i_866_ - i_867_ & 0x10000));
										i_864_ = (i_866_ - i_868_ | i_868_ - (i_868_ >>> 8));
										i_868_ = is[i_812_];
										i_866_ = i_864_ + i_868_;
										i_867_ = ((i_864_ & 0xff00ff) + (i_868_ & 0xff00ff));
										i_868_ = ((i_867_ & 0x1000100) + (i_866_ - i_867_ & 0x10000));
										is[i_812_] = (i_866_ - i_868_ | i_868_ - (i_868_ >>> 8));
									} else if (i == 2) {
										int i_869_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_811_]);
										int i_870_ = ((i_869_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_871_ = ((i_869_ & 0xff00) * anInt9015 & 0xff0000);
										i_869_ = (((i_870_ | i_871_) >>> 8) + anInt9022);
										int i_872_ = is[i_812_];
										int i_873_ = i_869_ + i_872_;
										int i_874_ = ((i_869_ & 0xff00ff) + (i_872_ & 0xff00ff));
										i_872_ = ((i_874_ & 0x1000100) + (i_873_ - i_874_ & 0x10000));
										is[i_812_] = (i_873_ - i_872_ | i_872_ - (i_872_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_808_ += anInt8991;
							}
						}
						i_805_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_875_ = anInt9001;
					while (i_875_ < 0) {
						int i_876_ = anInt9003;
						int i_877_ = anInt8988;
						int i_878_ = anInt9011 + anInt9013;
						int i_879_ = anInt8999;
						if (i_877_ >= 0 && i_877_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) < 0) {
							if (i_878_ < 0) {
								int i_880_ = (anInt8991 - 1 - i_878_) / anInt8991;
								i_879_ += i_880_;
								i_878_ += anInt8991 * i_880_;
								i_876_ += i_880_;
							}
							int i_881_;
							if ((i_881_ = (1 + i_878_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_879_)
								i_879_ = i_881_;
							for (/**/; i_879_ < 0; i_879_++) {
								int i_882_ = (((i_878_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_877_ >> 12));
								int i_883_ = i_876_++;
								if (i_735_ == 0) {
									if (i == 1)
										is[i_883_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_882_]);
									else if (i == 0) {
										int i_884_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_882_++]);
										int i_885_ = ((i_884_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_886_ = ((i_884_ & 0xff00) * anInt9018 & 0xff0000);
										int i_887_ = ((i_884_ & 0xff) * anInt9019 & 0xff00);
										is[i_883_] = (i_885_ | i_886_ | i_887_) >>> 8;
									} else if (i == 3) {
										int i_888_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_882_++]);
										int i_889_ = anInt9014;
										int i_890_ = i_888_ + i_889_;
										int i_891_ = ((i_888_ & 0xff00ff) + (i_889_ & 0xff00ff));
										int i_892_ = ((i_891_ & 0x1000100) + (i_890_ - i_891_ & 0x10000));
										is[i_883_] = (i_890_ - i_892_ | i_892_ - (i_892_ >>> 8));
									} else if (i == 2) {
										int i_893_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_882_]);
										int i_894_ = ((i_893_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_895_ = ((i_893_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_883_] = (((i_894_ | i_895_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_735_ == 1) {
									if (i == 1) {
										int i_896_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_882_]);
										int i_897_ = i_896_ >>> 24;
										int i_898_ = 256 - i_897_;
										int i_899_ = is[i_883_];
										is[i_883_] = ((((i_896_ & 0xff00ff) * i_897_ + ((i_899_ & 0xff00ff) * i_898_)) & ~0xff00ff) + (((i_896_ & 0xff00) * i_897_ + ((i_899_ & 0xff00) * i_898_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_900_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_882_]);
										int i_901_ = (i_900_ >>> 24) * anInt9015 >> 8;
										int i_902_ = 256 - i_901_;
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_903_ = is[i_883_];
											is[i_883_] = (((((i_900_ & 0xff00ff) * i_901_) + ((i_903_ & 0xff00ff) * i_902_)) & ~0xff00ff) + ((((i_900_ & 0xff00) * i_901_) + ((i_903_ & 0xff00) * i_902_)) & 0xff0000)) >> 8;
										} else if (i_901_ != 255) {
											int i_904_ = (((i_900_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_905_ = (((i_900_ & 0xff00) * anInt9018) & 0xff0000);
											int i_906_ = ((i_900_ & 0xff) * anInt9019 & 0xff00);
											i_900_ = (i_904_ | i_905_ | i_906_) >>> 8;
											int i_907_ = is[i_883_];
											is[i_883_] = (((((i_900_ & 0xff00ff) * i_901_) + ((i_907_ & 0xff00ff) * i_902_)) & ~0xff00ff) + ((((i_900_ & 0xff00) * i_901_) + ((i_907_ & 0xff00) * i_902_)) & 0xff0000)) >> 8;
										} else {
											int i_908_ = (((i_900_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_909_ = (((i_900_ & 0xff00) * anInt9018) & 0xff0000);
											int i_910_ = ((i_900_ & 0xff) * anInt9019 & 0xff00);
											is[i_883_] = (i_908_ | i_909_ | i_910_) >>> 8;
										}
									} else if (i == 3) {
										int i_911_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_882_]);
										int i_912_ = anInt9014;
										int i_913_ = i_911_ + i_912_;
										int i_914_ = ((i_911_ & 0xff00ff) + (i_912_ & 0xff00ff));
										int i_915_ = ((i_914_ & 0x1000100) + (i_913_ - i_914_ & 0x10000));
										i_915_ = (i_913_ - i_915_ | i_915_ - (i_915_ >>> 8));
										int i_916_ = (i_911_ >>> 24) * anInt9015 >> 8;
										int i_917_ = 256 - i_916_;
										if (i_916_ != 255) {
											i_911_ = i_915_;
											i_915_ = is[i_883_];
											i_915_ = (((((i_911_ & 0xff00ff) * i_916_) + ((i_915_ & 0xff00ff) * i_917_)) & ~0xff00ff) + ((((i_911_ & 0xff00) * i_916_) + ((i_915_ & 0xff00) * i_917_)) & 0xff0000)) >> 8;
										}
										is[i_883_] = i_915_;
									} else if (i == 2) {
										int i_918_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_882_]);
										int i_919_ = i_918_ >>> 24;
										int i_920_ = 256 - i_919_;
										int i_921_ = ((i_918_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_922_ = ((i_918_ & 0xff00) * anInt9015 & 0xff0000);
										i_918_ = (((i_921_ | i_922_) >>> 8) + anInt9022);
										int i_923_ = is[i_883_];
										is[i_883_] = ((((i_918_ & 0xff00ff) * i_919_ + ((i_923_ & 0xff00ff) * i_920_)) & ~0xff00ff) + (((i_918_ & 0xff00) * i_919_ + ((i_923_ & 0xff00) * i_920_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_735_ == 2) {
									if (i == 1) {
										int i_924_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_882_]);
										int i_925_ = is[i_883_];
										int i_926_ = i_924_ + i_925_;
										int i_927_ = ((i_924_ & 0xff00ff) + (i_925_ & 0xff00ff));
										i_925_ = ((i_927_ & 0x1000100) + (i_926_ - i_927_ & 0x10000));
										is[i_883_] = (i_926_ - i_925_ | i_925_ - (i_925_ >>> 8));
									} else if (i == 0) {
										int i_928_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_882_]);
										int i_929_ = ((i_928_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_930_ = ((i_928_ & 0xff00) * anInt9018 & 0xff0000);
										int i_931_ = ((i_928_ & 0xff) * anInt9019 & 0xff00);
										i_928_ = (i_929_ | i_930_ | i_931_) >>> 8;
										int i_932_ = is[i_883_];
										int i_933_ = i_928_ + i_932_;
										int i_934_ = ((i_928_ & 0xff00ff) + (i_932_ & 0xff00ff));
										i_932_ = ((i_934_ & 0x1000100) + (i_933_ - i_934_ & 0x10000));
										is[i_883_] = (i_933_ - i_932_ | i_932_ - (i_932_ >>> 8));
									} else if (i == 3) {
										int i_935_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_882_]);
										int i_936_ = anInt9014;
										int i_937_ = i_935_ + i_936_;
										int i_938_ = ((i_935_ & 0xff00ff) + (i_936_ & 0xff00ff));
										int i_939_ = ((i_938_ & 0x1000100) + (i_937_ - i_938_ & 0x10000));
										i_935_ = (i_937_ - i_939_ | i_939_ - (i_939_ >>> 8));
										i_939_ = is[i_883_];
										i_937_ = i_935_ + i_939_;
										i_938_ = ((i_935_ & 0xff00ff) + (i_939_ & 0xff00ff));
										i_939_ = ((i_938_ & 0x1000100) + (i_937_ - i_938_ & 0x10000));
										is[i_883_] = (i_937_ - i_939_ | i_939_ - (i_939_ >>> 8));
									} else if (i == 2) {
										int i_940_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_882_]);
										int i_941_ = ((i_940_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_942_ = ((i_940_ & 0xff00) * anInt9015 & 0xff0000);
										i_940_ = (((i_941_ | i_942_) >>> 8) + anInt9022);
										int i_943_ = is[i_883_];
										int i_944_ = i_940_ + i_943_;
										int i_945_ = ((i_940_ & 0xff00ff) + (i_943_ & 0xff00ff));
										i_943_ = ((i_945_ & 0x1000100) + (i_944_ - i_945_ & 0x10000));
										is[i_883_] = (i_944_ - i_943_ | i_943_ - (i_943_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_878_ += anInt8991;
							}
						}
						i_875_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_946_ = anInt9001;
					while (i_946_ < 0) {
						int i_947_ = anInt9003;
						int i_948_ = anInt8988 + anInt9012;
						int i_949_ = anInt9011;
						int i_950_ = anInt8999;
						if (i_949_ >= 0 && i_949_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) < 0) {
							int i_951_;
							if ((i_951_ = i_948_ - ((((Class57_Sub1_Sub1) this).anInt9010) << 12)) >= 0) {
								i_951_ = (anInt9004 - i_951_) / anInt9004;
								i_950_ += i_951_;
								i_948_ += anInt9004 * i_951_;
								i_947_ += i_951_;
							}
							if ((i_951_ = (i_948_ - anInt9004) / anInt9004) > i_950_)
								i_950_ = i_951_;
							for (/**/; i_950_ < 0; i_950_++) {
								int i_952_ = (((i_949_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_948_ >> 12));
								int i_953_ = i_947_++;
								if (i_735_ == 0) {
									if (i == 1)
										is[i_953_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_952_]);
									else if (i == 0) {
										int i_954_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_952_++]);
										int i_955_ = ((i_954_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_956_ = ((i_954_ & 0xff00) * anInt9018 & 0xff0000);
										int i_957_ = ((i_954_ & 0xff) * anInt9019 & 0xff00);
										is[i_953_] = (i_955_ | i_956_ | i_957_) >>> 8;
									} else if (i == 3) {
										int i_958_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_952_++]);
										int i_959_ = anInt9014;
										int i_960_ = i_958_ + i_959_;
										int i_961_ = ((i_958_ & 0xff00ff) + (i_959_ & 0xff00ff));
										int i_962_ = ((i_961_ & 0x1000100) + (i_960_ - i_961_ & 0x10000));
										is[i_953_] = (i_960_ - i_962_ | i_962_ - (i_962_ >>> 8));
									} else if (i == 2) {
										int i_963_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_952_]);
										int i_964_ = ((i_963_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_965_ = ((i_963_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_953_] = (((i_964_ | i_965_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_735_ == 1) {
									if (i == 1) {
										int i_966_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_952_]);
										int i_967_ = i_966_ >>> 24;
										int i_968_ = 256 - i_967_;
										int i_969_ = is[i_953_];
										is[i_953_] = ((((i_966_ & 0xff00ff) * i_967_ + ((i_969_ & 0xff00ff) * i_968_)) & ~0xff00ff) + (((i_966_ & 0xff00) * i_967_ + ((i_969_ & 0xff00) * i_968_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_970_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_952_]);
										int i_971_ = (i_970_ >>> 24) * anInt9015 >> 8;
										int i_972_ = 256 - i_971_;
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_973_ = is[i_953_];
											is[i_953_] = (((((i_970_ & 0xff00ff) * i_971_) + ((i_973_ & 0xff00ff) * i_972_)) & ~0xff00ff) + ((((i_970_ & 0xff00) * i_971_) + ((i_973_ & 0xff00) * i_972_)) & 0xff0000)) >> 8;
										} else if (i_971_ != 255) {
											int i_974_ = (((i_970_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_975_ = (((i_970_ & 0xff00) * anInt9018) & 0xff0000);
											int i_976_ = ((i_970_ & 0xff) * anInt9019 & 0xff00);
											i_970_ = (i_974_ | i_975_ | i_976_) >>> 8;
											int i_977_ = is[i_953_];
											is[i_953_] = (((((i_970_ & 0xff00ff) * i_971_) + ((i_977_ & 0xff00ff) * i_972_)) & ~0xff00ff) + ((((i_970_ & 0xff00) * i_971_) + ((i_977_ & 0xff00) * i_972_)) & 0xff0000)) >> 8;
										} else {
											int i_978_ = (((i_970_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_979_ = (((i_970_ & 0xff00) * anInt9018) & 0xff0000);
											int i_980_ = ((i_970_ & 0xff) * anInt9019 & 0xff00);
											is[i_953_] = (i_978_ | i_979_ | i_980_) >>> 8;
										}
									} else if (i == 3) {
										int i_981_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_952_]);
										int i_982_ = anInt9014;
										int i_983_ = i_981_ + i_982_;
										int i_984_ = ((i_981_ & 0xff00ff) + (i_982_ & 0xff00ff));
										int i_985_ = ((i_984_ & 0x1000100) + (i_983_ - i_984_ & 0x10000));
										i_985_ = (i_983_ - i_985_ | i_985_ - (i_985_ >>> 8));
										int i_986_ = (i_981_ >>> 24) * anInt9015 >> 8;
										int i_987_ = 256 - i_986_;
										if (i_986_ != 255) {
											i_981_ = i_985_;
											i_985_ = is[i_953_];
											i_985_ = (((((i_981_ & 0xff00ff) * i_986_) + ((i_985_ & 0xff00ff) * i_987_)) & ~0xff00ff) + ((((i_981_ & 0xff00) * i_986_) + ((i_985_ & 0xff00) * i_987_)) & 0xff0000)) >> 8;
										}
										is[i_953_] = i_985_;
									} else if (i == 2) {
										int i_988_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_952_]);
										int i_989_ = i_988_ >>> 24;
										int i_990_ = 256 - i_989_;
										int i_991_ = ((i_988_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_992_ = ((i_988_ & 0xff00) * anInt9015 & 0xff0000);
										i_988_ = (((i_991_ | i_992_) >>> 8) + anInt9022);
										int i_993_ = is[i_953_];
										is[i_953_] = ((((i_988_ & 0xff00ff) * i_989_ + ((i_993_ & 0xff00ff) * i_990_)) & ~0xff00ff) + (((i_988_ & 0xff00) * i_989_ + ((i_993_ & 0xff00) * i_990_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_735_ == 2) {
									if (i == 1) {
										int i_994_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_952_]);
										int i_995_ = is[i_953_];
										int i_996_ = i_994_ + i_995_;
										int i_997_ = ((i_994_ & 0xff00ff) + (i_995_ & 0xff00ff));
										i_995_ = ((i_997_ & 0x1000100) + (i_996_ - i_997_ & 0x10000));
										is[i_953_] = (i_996_ - i_995_ | i_995_ - (i_995_ >>> 8));
									} else if (i == 0) {
										int i_998_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_952_]);
										int i_999_ = ((i_998_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1000_ = ((i_998_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1001_ = ((i_998_ & 0xff) * anInt9019 & 0xff00);
										i_998_ = ((i_999_ | i_1000_ | i_1001_) >>> 8);
										int i_1002_ = is[i_953_];
										int i_1003_ = i_998_ + i_1002_;
										int i_1004_ = ((i_998_ & 0xff00ff) + (i_1002_ & 0xff00ff));
										i_1002_ = ((i_1004_ & 0x1000100) + (i_1003_ - i_1004_ & 0x10000));
										is[i_953_] = (i_1003_ - i_1002_ | i_1002_ - (i_1002_ >>> 8));
									} else if (i == 3) {
										int i_1005_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_952_]);
										int i_1006_ = anInt9014;
										int i_1007_ = i_1005_ + i_1006_;
										int i_1008_ = ((i_1005_ & 0xff00ff) + (i_1006_ & 0xff00ff));
										int i_1009_ = ((i_1008_ & 0x1000100) + (i_1007_ - i_1008_ & 0x10000));
										i_1005_ = (i_1007_ - i_1009_ | i_1009_ - (i_1009_ >>> 8));
										i_1009_ = is[i_953_];
										i_1007_ = i_1005_ + i_1009_;
										i_1008_ = ((i_1005_ & 0xff00ff) + (i_1009_ & 0xff00ff));
										i_1009_ = ((i_1008_ & 0x1000100) + (i_1007_ - i_1008_ & 0x10000));
										is[i_953_] = (i_1007_ - i_1009_ | i_1009_ - (i_1009_ >>> 8));
									} else if (i == 2) {
										int i_1010_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_952_]);
										int i_1011_ = ((i_1010_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1012_ = ((i_1010_ & 0xff00) * anInt9015 & 0xff0000);
										i_1010_ = (((i_1011_ | i_1012_) >>> 8) + anInt9022);
										int i_1013_ = is[i_953_];
										int i_1014_ = i_1010_ + i_1013_;
										int i_1015_ = ((i_1010_ & 0xff00ff) + (i_1013_ & 0xff00ff));
										i_1013_ = ((i_1015_ & 0x1000100) + (i_1014_ - i_1015_ & 0x10000));
										is[i_953_] = (i_1014_ - i_1013_ | i_1013_ - (i_1013_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_948_ += anInt9004;
							}
						}
						i_946_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_1016_ = anInt9001;
					while (i_1016_ < 0) {
						int i_1017_ = anInt9003;
						int i_1018_ = anInt8988 + anInt9012;
						int i_1019_ = anInt9011 + anInt9013;
						int i_1020_ = anInt8999;
						int i_1021_;
						if ((i_1021_ = i_1018_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) >= 0) {
							i_1021_ = (anInt9004 - i_1021_) / anInt9004;
							i_1020_ += i_1021_;
							i_1018_ += anInt9004 * i_1021_;
							i_1019_ += anInt8991 * i_1021_;
							i_1017_ += i_1021_;
						}
						if ((i_1021_ = (i_1018_ - anInt9004) / anInt9004) > i_1020_)
							i_1020_ = i_1021_;
						if ((i_1021_ = i_1019_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) >= 0) {
							i_1021_ = (anInt8991 - i_1021_) / anInt8991;
							i_1020_ += i_1021_;
							i_1018_ += anInt9004 * i_1021_;
							i_1019_ += anInt8991 * i_1021_;
							i_1017_ += i_1021_;
						}
						if ((i_1021_ = (i_1019_ - anInt8991) / anInt8991) > i_1020_)
							i_1020_ = i_1021_;
						for (/**/; i_1020_ < 0; i_1020_++) {
							int i_1022_ = (((i_1019_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_1018_ >> 12));
							int i_1023_ = i_1017_++;
							if (i_735_ == 0) {
								if (i == 1)
									is[i_1023_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1022_]);
								else if (i == 0) {
									int i_1024_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1022_++]);
									int i_1025_ = ((i_1024_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1026_ = ((i_1024_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1027_ = ((i_1024_ & 0xff) * anInt9019 & 0xff00);
									is[i_1023_] = (i_1025_ | i_1026_ | i_1027_) >>> 8;
								} else if (i == 3) {
									int i_1028_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1022_++]);
									int i_1029_ = anInt9014;
									int i_1030_ = i_1028_ + i_1029_;
									int i_1031_ = ((i_1028_ & 0xff00ff) + (i_1029_ & 0xff00ff));
									int i_1032_ = ((i_1031_ & 0x1000100) + (i_1030_ - i_1031_ & 0x10000));
									is[i_1023_] = (i_1030_ - i_1032_ | i_1032_ - (i_1032_ >>> 8));
								} else if (i == 2) {
									int i_1033_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1022_]);
									int i_1034_ = ((i_1033_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1035_ = ((i_1033_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_1023_] = (((i_1034_ | i_1035_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_735_ == 1) {
								if (i == 1) {
									int i_1036_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1022_]);
									int i_1037_ = i_1036_ >>> 24;
									int i_1038_ = 256 - i_1037_;
									int i_1039_ = is[i_1023_];
									is[i_1023_] = ((((i_1036_ & 0xff00ff) * i_1037_ + (i_1039_ & 0xff00ff) * i_1038_) & ~0xff00ff) + (((i_1036_ & 0xff00) * i_1037_ + (i_1039_ & 0xff00) * i_1038_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_1040_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1022_]);
									int i_1041_ = (i_1040_ >>> 24) * anInt9015 >> 8;
									int i_1042_ = 256 - i_1041_;
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_1043_ = is[i_1023_];
										is[i_1023_] = ((((i_1040_ & 0xff00ff) * i_1041_ + ((i_1043_ & 0xff00ff) * i_1042_)) & ~0xff00ff) + (((i_1040_ & 0xff00) * i_1041_ + ((i_1043_ & 0xff00) * i_1042_)) & 0xff0000)) >> 8;
									} else if (i_1041_ != 255) {
										int i_1044_ = ((i_1040_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1045_ = ((i_1040_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1046_ = ((i_1040_ & 0xff) * anInt9019 & 0xff00);
										i_1040_ = (i_1044_ | i_1045_ | i_1046_) >>> 8;
										int i_1047_ = is[i_1023_];
										is[i_1023_] = ((((i_1040_ & 0xff00ff) * i_1041_ + ((i_1047_ & 0xff00ff) * i_1042_)) & ~0xff00ff) + (((i_1040_ & 0xff00) * i_1041_ + ((i_1047_ & 0xff00) * i_1042_)) & 0xff0000)) >> 8;
									} else {
										int i_1048_ = ((i_1040_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1049_ = ((i_1040_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1050_ = ((i_1040_ & 0xff) * anInt9019 & 0xff00);
										is[i_1023_] = (i_1048_ | i_1049_ | i_1050_) >>> 8;
									}
								} else if (i == 3) {
									int i_1051_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1022_]);
									int i_1052_ = anInt9014;
									int i_1053_ = i_1051_ + i_1052_;
									int i_1054_ = ((i_1051_ & 0xff00ff) + (i_1052_ & 0xff00ff));
									int i_1055_ = ((i_1054_ & 0x1000100) + (i_1053_ - i_1054_ & 0x10000));
									i_1055_ = (i_1053_ - i_1055_ | i_1055_ - (i_1055_ >>> 8));
									int i_1056_ = (i_1051_ >>> 24) * anInt9015 >> 8;
									int i_1057_ = 256 - i_1056_;
									if (i_1056_ != 255) {
										i_1051_ = i_1055_;
										i_1055_ = is[i_1023_];
										i_1055_ = ((((i_1051_ & 0xff00ff) * i_1056_ + ((i_1055_ & 0xff00ff) * i_1057_)) & ~0xff00ff) + (((i_1051_ & 0xff00) * i_1056_ + ((i_1055_ & 0xff00) * i_1057_)) & 0xff0000)) >> 8;
									}
									is[i_1023_] = i_1055_;
								} else if (i == 2) {
									int i_1058_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1022_]);
									int i_1059_ = i_1058_ >>> 24;
									int i_1060_ = 256 - i_1059_;
									int i_1061_ = ((i_1058_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1062_ = ((i_1058_ & 0xff00) * anInt9015 & 0xff0000);
									i_1058_ = (((i_1061_ | i_1062_) >>> 8) + anInt9022);
									int i_1063_ = is[i_1023_];
									is[i_1023_] = ((((i_1058_ & 0xff00ff) * i_1059_ + (i_1063_ & 0xff00ff) * i_1060_) & ~0xff00ff) + (((i_1058_ & 0xff00) * i_1059_ + (i_1063_ & 0xff00) * i_1060_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_735_ == 2) {
								if (i == 1) {
									int i_1064_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1022_]);
									int i_1065_ = is[i_1023_];
									int i_1066_ = i_1064_ + i_1065_;
									int i_1067_ = ((i_1064_ & 0xff00ff) + (i_1065_ & 0xff00ff));
									i_1065_ = ((i_1067_ & 0x1000100) + (i_1066_ - i_1067_ & 0x10000));
									is[i_1023_] = (i_1066_ - i_1065_ | i_1065_ - (i_1065_ >>> 8));
								} else if (i == 0) {
									int i_1068_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1022_]);
									int i_1069_ = ((i_1068_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1070_ = ((i_1068_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1071_ = ((i_1068_ & 0xff) * anInt9019 & 0xff00);
									i_1068_ = (i_1069_ | i_1070_ | i_1071_) >>> 8;
									int i_1072_ = is[i_1023_];
									int i_1073_ = i_1068_ + i_1072_;
									int i_1074_ = ((i_1068_ & 0xff00ff) + (i_1072_ & 0xff00ff));
									i_1072_ = ((i_1074_ & 0x1000100) + (i_1073_ - i_1074_ & 0x10000));
									is[i_1023_] = (i_1073_ - i_1072_ | i_1072_ - (i_1072_ >>> 8));
								} else if (i == 3) {
									int i_1075_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1022_]);
									int i_1076_ = anInt9014;
									int i_1077_ = i_1075_ + i_1076_;
									int i_1078_ = ((i_1075_ & 0xff00ff) + (i_1076_ & 0xff00ff));
									int i_1079_ = ((i_1078_ & 0x1000100) + (i_1077_ - i_1078_ & 0x10000));
									i_1075_ = (i_1077_ - i_1079_ | i_1079_ - (i_1079_ >>> 8));
									i_1079_ = is[i_1023_];
									i_1077_ = i_1075_ + i_1079_;
									i_1078_ = (i_1075_ & 0xff00ff) + (i_1079_ & 0xff00ff);
									i_1079_ = ((i_1078_ & 0x1000100) + (i_1077_ - i_1078_ & 0x10000));
									is[i_1023_] = (i_1077_ - i_1079_ | i_1079_ - (i_1079_ >>> 8));
								} else if (i == 2) {
									int i_1080_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1022_]);
									int i_1081_ = ((i_1080_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1082_ = ((i_1080_ & 0xff00) * anInt9015 & 0xff0000);
									i_1080_ = (((i_1081_ | i_1082_) >>> 8) + anInt9022);
									int i_1083_ = is[i_1023_];
									int i_1084_ = i_1080_ + i_1083_;
									int i_1085_ = ((i_1080_ & 0xff00ff) + (i_1083_ & 0xff00ff));
									i_1083_ = ((i_1085_ & 0x1000100) + (i_1084_ - i_1085_ & 0x10000));
									is[i_1023_] = (i_1084_ - i_1083_ | i_1083_ - (i_1083_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_1018_ += anInt9004;
							i_1019_ += anInt8991;
						}
						i_1016_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_1086_ = anInt9001;
					while (i_1086_ < 0) {
						int i_1087_ = anInt9003;
						int i_1088_ = anInt8988 + anInt9012;
						int i_1089_ = anInt9011 + anInt9013;
						int i_1090_ = anInt8999;
						int i_1091_;
						if ((i_1091_ = i_1088_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) >= 0) {
							i_1091_ = (anInt9004 - i_1091_) / anInt9004;
							i_1090_ += i_1091_;
							i_1088_ += anInt9004 * i_1091_;
							i_1089_ += anInt8991 * i_1091_;
							i_1087_ += i_1091_;
						}
						if ((i_1091_ = (i_1088_ - anInt9004) / anInt9004) > i_1090_)
							i_1090_ = i_1091_;
						if (i_1089_ < 0) {
							i_1091_ = (anInt8991 - 1 - i_1089_) / anInt8991;
							i_1090_ += i_1091_;
							i_1088_ += anInt9004 * i_1091_;
							i_1089_ += anInt8991 * i_1091_;
							i_1087_ += i_1091_;
						}
						if ((i_1091_ = (1 + i_1089_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_1090_)
							i_1090_ = i_1091_;
						for (/**/; i_1090_ < 0; i_1090_++) {
							int i_1092_ = (((i_1089_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_1088_ >> 12));
							int i_1093_ = i_1087_++;
							if (i_735_ == 0) {
								if (i == 1)
									is[i_1093_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1092_]);
								else if (i == 0) {
									int i_1094_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1092_++]);
									int i_1095_ = ((i_1094_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1096_ = ((i_1094_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1097_ = ((i_1094_ & 0xff) * anInt9019 & 0xff00);
									is[i_1093_] = (i_1095_ | i_1096_ | i_1097_) >>> 8;
								} else if (i == 3) {
									int i_1098_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1092_++]);
									int i_1099_ = anInt9014;
									int i_1100_ = i_1098_ + i_1099_;
									int i_1101_ = ((i_1098_ & 0xff00ff) + (i_1099_ & 0xff00ff));
									int i_1102_ = ((i_1101_ & 0x1000100) + (i_1100_ - i_1101_ & 0x10000));
									is[i_1093_] = (i_1100_ - i_1102_ | i_1102_ - (i_1102_ >>> 8));
								} else if (i == 2) {
									int i_1103_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1092_]);
									int i_1104_ = ((i_1103_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1105_ = ((i_1103_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_1093_] = (((i_1104_ | i_1105_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_735_ == 1) {
								if (i == 1) {
									int i_1106_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1092_]);
									int i_1107_ = i_1106_ >>> 24;
									int i_1108_ = 256 - i_1107_;
									int i_1109_ = is[i_1093_];
									is[i_1093_] = ((((i_1106_ & 0xff00ff) * i_1107_ + (i_1109_ & 0xff00ff) * i_1108_) & ~0xff00ff) + (((i_1106_ & 0xff00) * i_1107_ + (i_1109_ & 0xff00) * i_1108_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_1110_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1092_]);
									int i_1111_ = (i_1110_ >>> 24) * anInt9015 >> 8;
									int i_1112_ = 256 - i_1111_;
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_1113_ = is[i_1093_];
										is[i_1093_] = ((((i_1110_ & 0xff00ff) * i_1111_ + ((i_1113_ & 0xff00ff) * i_1112_)) & ~0xff00ff) + (((i_1110_ & 0xff00) * i_1111_ + ((i_1113_ & 0xff00) * i_1112_)) & 0xff0000)) >> 8;
									} else if (i_1111_ != 255) {
										int i_1114_ = ((i_1110_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1115_ = ((i_1110_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1116_ = ((i_1110_ & 0xff) * anInt9019 & 0xff00);
										i_1110_ = (i_1114_ | i_1115_ | i_1116_) >>> 8;
										int i_1117_ = is[i_1093_];
										is[i_1093_] = ((((i_1110_ & 0xff00ff) * i_1111_ + ((i_1117_ & 0xff00ff) * i_1112_)) & ~0xff00ff) + (((i_1110_ & 0xff00) * i_1111_ + ((i_1117_ & 0xff00) * i_1112_)) & 0xff0000)) >> 8;
									} else {
										int i_1118_ = ((i_1110_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1119_ = ((i_1110_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1120_ = ((i_1110_ & 0xff) * anInt9019 & 0xff00);
										is[i_1093_] = (i_1118_ | i_1119_ | i_1120_) >>> 8;
									}
								} else if (i == 3) {
									int i_1121_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1092_]);
									int i_1122_ = anInt9014;
									int i_1123_ = i_1121_ + i_1122_;
									int i_1124_ = ((i_1121_ & 0xff00ff) + (i_1122_ & 0xff00ff));
									int i_1125_ = ((i_1124_ & 0x1000100) + (i_1123_ - i_1124_ & 0x10000));
									i_1125_ = (i_1123_ - i_1125_ | i_1125_ - (i_1125_ >>> 8));
									int i_1126_ = (i_1121_ >>> 24) * anInt9015 >> 8;
									int i_1127_ = 256 - i_1126_;
									if (i_1126_ != 255) {
										i_1121_ = i_1125_;
										i_1125_ = is[i_1093_];
										i_1125_ = ((((i_1121_ & 0xff00ff) * i_1126_ + ((i_1125_ & 0xff00ff) * i_1127_)) & ~0xff00ff) + (((i_1121_ & 0xff00) * i_1126_ + ((i_1125_ & 0xff00) * i_1127_)) & 0xff0000)) >> 8;
									}
									is[i_1093_] = i_1125_;
								} else if (i == 2) {
									int i_1128_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1092_]);
									int i_1129_ = i_1128_ >>> 24;
									int i_1130_ = 256 - i_1129_;
									int i_1131_ = ((i_1128_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1132_ = ((i_1128_ & 0xff00) * anInt9015 & 0xff0000);
									i_1128_ = (((i_1131_ | i_1132_) >>> 8) + anInt9022);
									int i_1133_ = is[i_1093_];
									is[i_1093_] = ((((i_1128_ & 0xff00ff) * i_1129_ + (i_1133_ & 0xff00ff) * i_1130_) & ~0xff00ff) + (((i_1128_ & 0xff00) * i_1129_ + (i_1133_ & 0xff00) * i_1130_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_735_ == 2) {
								if (i == 1) {
									int i_1134_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1092_]);
									int i_1135_ = is[i_1093_];
									int i_1136_ = i_1134_ + i_1135_;
									int i_1137_ = ((i_1134_ & 0xff00ff) + (i_1135_ & 0xff00ff));
									i_1135_ = ((i_1137_ & 0x1000100) + (i_1136_ - i_1137_ & 0x10000));
									is[i_1093_] = (i_1136_ - i_1135_ | i_1135_ - (i_1135_ >>> 8));
								} else if (i == 0) {
									int i_1138_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1092_]);
									int i_1139_ = ((i_1138_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1140_ = ((i_1138_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1141_ = ((i_1138_ & 0xff) * anInt9019 & 0xff00);
									i_1138_ = (i_1139_ | i_1140_ | i_1141_) >>> 8;
									int i_1142_ = is[i_1093_];
									int i_1143_ = i_1138_ + i_1142_;
									int i_1144_ = ((i_1138_ & 0xff00ff) + (i_1142_ & 0xff00ff));
									i_1142_ = ((i_1144_ & 0x1000100) + (i_1143_ - i_1144_ & 0x10000));
									is[i_1093_] = (i_1143_ - i_1142_ | i_1142_ - (i_1142_ >>> 8));
								} else if (i == 3) {
									int i_1145_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1092_]);
									int i_1146_ = anInt9014;
									int i_1147_ = i_1145_ + i_1146_;
									int i_1148_ = ((i_1145_ & 0xff00ff) + (i_1146_ & 0xff00ff));
									int i_1149_ = ((i_1148_ & 0x1000100) + (i_1147_ - i_1148_ & 0x10000));
									i_1145_ = (i_1147_ - i_1149_ | i_1149_ - (i_1149_ >>> 8));
									i_1149_ = is[i_1093_];
									i_1147_ = i_1145_ + i_1149_;
									i_1148_ = (i_1145_ & 0xff00ff) + (i_1149_ & 0xff00ff);
									i_1149_ = ((i_1148_ & 0x1000100) + (i_1147_ - i_1148_ & 0x10000));
									is[i_1093_] = (i_1147_ - i_1149_ | i_1149_ - (i_1149_ >>> 8));
								} else if (i == 2) {
									int i_1150_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1092_]);
									int i_1151_ = ((i_1150_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1152_ = ((i_1150_ & 0xff00) * anInt9015 & 0xff0000);
									i_1150_ = (((i_1151_ | i_1152_) >>> 8) + anInt9022);
									int i_1153_ = is[i_1093_];
									int i_1154_ = i_1150_ + i_1153_;
									int i_1155_ = ((i_1150_ & 0xff00ff) + (i_1153_ & 0xff00ff));
									i_1153_ = ((i_1155_ & 0x1000100) + (i_1154_ - i_1155_ & 0x10000));
									is[i_1093_] = (i_1154_ - i_1153_ | i_1153_ - (i_1153_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_1088_ += anInt9004;
							i_1089_ += anInt8991;
						}
						i_1086_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_1156_ = anInt9001;
				while (i_1156_ < 0) {
					int i_1157_ = anInt9003;
					int i_1158_ = anInt8988 + anInt9012;
					int i_1159_ = anInt9011;
					int i_1160_ = anInt8999;
					if (i_1159_ >= 0 && i_1159_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) < 0) {
						if (i_1158_ < 0) {
							int i_1161_ = (anInt9004 - 1 - i_1158_) / anInt9004;
							i_1160_ += i_1161_;
							i_1158_ += anInt9004 * i_1161_;
							i_1157_ += i_1161_;
						}
						int i_1162_;
						if ((i_1162_ = (1 + i_1158_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1160_)
							i_1160_ = i_1162_;
						for (/**/; i_1160_ < 0; i_1160_++) {
							int i_1163_ = (((i_1159_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_1158_ >> 12));
							int i_1164_ = i_1157_++;
							if (i_735_ == 0) {
								if (i == 1)
									is[i_1164_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1163_]);
								else if (i == 0) {
									int i_1165_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1163_++]);
									int i_1166_ = ((i_1165_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1167_ = ((i_1165_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1168_ = ((i_1165_ & 0xff) * anInt9019 & 0xff00);
									is[i_1164_] = (i_1166_ | i_1167_ | i_1168_) >>> 8;
								} else if (i == 3) {
									int i_1169_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1163_++]);
									int i_1170_ = anInt9014;
									int i_1171_ = i_1169_ + i_1170_;
									int i_1172_ = ((i_1169_ & 0xff00ff) + (i_1170_ & 0xff00ff));
									int i_1173_ = ((i_1172_ & 0x1000100) + (i_1171_ - i_1172_ & 0x10000));
									is[i_1164_] = (i_1171_ - i_1173_ | i_1173_ - (i_1173_ >>> 8));
								} else if (i == 2) {
									int i_1174_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1163_]);
									int i_1175_ = ((i_1174_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1176_ = ((i_1174_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_1164_] = (((i_1175_ | i_1176_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_735_ == 1) {
								if (i == 1) {
									int i_1177_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1163_]);
									int i_1178_ = i_1177_ >>> 24;
									int i_1179_ = 256 - i_1178_;
									int i_1180_ = is[i_1164_];
									is[i_1164_] = ((((i_1177_ & 0xff00ff) * i_1178_ + (i_1180_ & 0xff00ff) * i_1179_) & ~0xff00ff) + (((i_1177_ & 0xff00) * i_1178_ + (i_1180_ & 0xff00) * i_1179_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_1181_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1163_]);
									int i_1182_ = (i_1181_ >>> 24) * anInt9015 >> 8;
									int i_1183_ = 256 - i_1182_;
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_1184_ = is[i_1164_];
										is[i_1164_] = ((((i_1181_ & 0xff00ff) * i_1182_ + ((i_1184_ & 0xff00ff) * i_1183_)) & ~0xff00ff) + (((i_1181_ & 0xff00) * i_1182_ + ((i_1184_ & 0xff00) * i_1183_)) & 0xff0000)) >> 8;
									} else if (i_1182_ != 255) {
										int i_1185_ = ((i_1181_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1186_ = ((i_1181_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1187_ = ((i_1181_ & 0xff) * anInt9019 & 0xff00);
										i_1181_ = (i_1185_ | i_1186_ | i_1187_) >>> 8;
										int i_1188_ = is[i_1164_];
										is[i_1164_] = ((((i_1181_ & 0xff00ff) * i_1182_ + ((i_1188_ & 0xff00ff) * i_1183_)) & ~0xff00ff) + (((i_1181_ & 0xff00) * i_1182_ + ((i_1188_ & 0xff00) * i_1183_)) & 0xff0000)) >> 8;
									} else {
										int i_1189_ = ((i_1181_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1190_ = ((i_1181_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1191_ = ((i_1181_ & 0xff) * anInt9019 & 0xff00);
										is[i_1164_] = (i_1189_ | i_1190_ | i_1191_) >>> 8;
									}
								} else if (i == 3) {
									int i_1192_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1163_]);
									int i_1193_ = anInt9014;
									int i_1194_ = i_1192_ + i_1193_;
									int i_1195_ = ((i_1192_ & 0xff00ff) + (i_1193_ & 0xff00ff));
									int i_1196_ = ((i_1195_ & 0x1000100) + (i_1194_ - i_1195_ & 0x10000));
									i_1196_ = (i_1194_ - i_1196_ | i_1196_ - (i_1196_ >>> 8));
									int i_1197_ = (i_1192_ >>> 24) * anInt9015 >> 8;
									int i_1198_ = 256 - i_1197_;
									if (i_1197_ != 255) {
										i_1192_ = i_1196_;
										i_1196_ = is[i_1164_];
										i_1196_ = ((((i_1192_ & 0xff00ff) * i_1197_ + ((i_1196_ & 0xff00ff) * i_1198_)) & ~0xff00ff) + (((i_1192_ & 0xff00) * i_1197_ + ((i_1196_ & 0xff00) * i_1198_)) & 0xff0000)) >> 8;
									}
									is[i_1164_] = i_1196_;
								} else if (i == 2) {
									int i_1199_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1163_]);
									int i_1200_ = i_1199_ >>> 24;
									int i_1201_ = 256 - i_1200_;
									int i_1202_ = ((i_1199_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1203_ = ((i_1199_ & 0xff00) * anInt9015 & 0xff0000);
									i_1199_ = (((i_1202_ | i_1203_) >>> 8) + anInt9022);
									int i_1204_ = is[i_1164_];
									is[i_1164_] = ((((i_1199_ & 0xff00ff) * i_1200_ + (i_1204_ & 0xff00ff) * i_1201_) & ~0xff00ff) + (((i_1199_ & 0xff00) * i_1200_ + (i_1204_ & 0xff00) * i_1201_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_735_ == 2) {
								if (i == 1) {
									int i_1205_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1163_]);
									int i_1206_ = is[i_1164_];
									int i_1207_ = i_1205_ + i_1206_;
									int i_1208_ = ((i_1205_ & 0xff00ff) + (i_1206_ & 0xff00ff));
									i_1206_ = ((i_1208_ & 0x1000100) + (i_1207_ - i_1208_ & 0x10000));
									is[i_1164_] = (i_1207_ - i_1206_ | i_1206_ - (i_1206_ >>> 8));
								} else if (i == 0) {
									int i_1209_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1163_]);
									int i_1210_ = ((i_1209_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1211_ = ((i_1209_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1212_ = ((i_1209_ & 0xff) * anInt9019 & 0xff00);
									i_1209_ = (i_1210_ | i_1211_ | i_1212_) >>> 8;
									int i_1213_ = is[i_1164_];
									int i_1214_ = i_1209_ + i_1213_;
									int i_1215_ = ((i_1209_ & 0xff00ff) + (i_1213_ & 0xff00ff));
									i_1213_ = ((i_1215_ & 0x1000100) + (i_1214_ - i_1215_ & 0x10000));
									is[i_1164_] = (i_1214_ - i_1213_ | i_1213_ - (i_1213_ >>> 8));
								} else if (i == 3) {
									int i_1216_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1163_]);
									int i_1217_ = anInt9014;
									int i_1218_ = i_1216_ + i_1217_;
									int i_1219_ = ((i_1216_ & 0xff00ff) + (i_1217_ & 0xff00ff));
									int i_1220_ = ((i_1219_ & 0x1000100) + (i_1218_ - i_1219_ & 0x10000));
									i_1216_ = (i_1218_ - i_1220_ | i_1220_ - (i_1220_ >>> 8));
									i_1220_ = is[i_1164_];
									i_1218_ = i_1216_ + i_1220_;
									i_1219_ = (i_1216_ & 0xff00ff) + (i_1220_ & 0xff00ff);
									i_1220_ = ((i_1219_ & 0x1000100) + (i_1218_ - i_1219_ & 0x10000));
									is[i_1164_] = (i_1218_ - i_1220_ | i_1220_ - (i_1220_ >>> 8));
								} else if (i == 2) {
									int i_1221_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1163_]);
									int i_1222_ = ((i_1221_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1223_ = ((i_1221_ & 0xff00) * anInt9015 & 0xff0000);
									i_1221_ = (((i_1222_ | i_1223_) >>> 8) + anInt9022);
									int i_1224_ = is[i_1164_];
									int i_1225_ = i_1221_ + i_1224_;
									int i_1226_ = ((i_1221_ & 0xff00ff) + (i_1224_ & 0xff00ff));
									i_1224_ = ((i_1226_ & 0x1000100) + (i_1225_ - i_1226_ & 0x10000));
									is[i_1164_] = (i_1225_ - i_1224_ | i_1224_ - (i_1224_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_1158_ += anInt9004;
						}
					}
					i_1156_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				for (int i_1227_ = anInt9001; i_1227_ < 0; i_1227_++) {
					int i_1228_ = anInt9003;
					int i_1229_ = anInt8988 + anInt9012;
					int i_1230_ = anInt9011 + anInt9013;
					int i_1231_ = anInt8999;
					if (i_1229_ < 0) {
						int i_1232_ = (anInt9004 - 1 - i_1229_) / anInt9004;
						i_1231_ += i_1232_;
						i_1229_ += anInt9004 * i_1232_;
						i_1230_ += anInt8991 * i_1232_;
						i_1228_ += i_1232_;
					}
					int i_1233_;
					if ((i_1233_ = (1 + i_1229_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1231_)
						i_1231_ = i_1233_;
					if ((i_1233_ = i_1230_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) >= 0) {
						i_1233_ = (anInt8991 - i_1233_) / anInt8991;
						i_1231_ += i_1233_;
						i_1229_ += anInt9004 * i_1233_;
						i_1230_ += anInt8991 * i_1233_;
						i_1228_ += i_1233_;
					}
					if ((i_1233_ = (i_1230_ - anInt8991) / anInt8991) > i_1231_)
						i_1231_ = i_1233_;
					for (/**/; i_1231_ < 0; i_1231_++) {
						int i_1234_ = (((i_1230_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_1229_ >> 12));
						int i_1235_ = i_1228_++;
						if (i_735_ == 0) {
							if (i == 1)
								is[i_1235_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1234_]);
							else if (i == 0) {
								int i_1236_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1234_++]);
								int i_1237_ = ((i_1236_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_1238_ = ((i_1236_ & 0xff00) * anInt9018 & 0xff0000);
								int i_1239_ = (i_1236_ & 0xff) * anInt9019 & 0xff00;
								is[i_1235_] = (i_1237_ | i_1238_ | i_1239_) >>> 8;
							} else if (i == 3) {
								int i_1240_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1234_++]);
								int i_1241_ = anInt9014;
								int i_1242_ = i_1240_ + i_1241_;
								int i_1243_ = ((i_1240_ & 0xff00ff) + (i_1241_ & 0xff00ff));
								int i_1244_ = ((i_1243_ & 0x1000100) + (i_1242_ - i_1243_ & 0x10000));
								is[i_1235_] = i_1242_ - i_1244_ | i_1244_ - (i_1244_ >>> 8);
							} else if (i == 2) {
								int i_1245_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1234_]);
								int i_1246_ = ((i_1245_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_1247_ = ((i_1245_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_1235_] = ((i_1246_ | i_1247_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_735_ == 1) {
							if (i == 1) {
								int i_1248_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1234_]);
								int i_1249_ = i_1248_ >>> 24;
								int i_1250_ = 256 - i_1249_;
								int i_1251_ = is[i_1235_];
								is[i_1235_] = ((((i_1248_ & 0xff00ff) * i_1249_ + (i_1251_ & 0xff00ff) * i_1250_) & ~0xff00ff) + (((i_1248_ & 0xff00) * i_1249_ + (i_1251_ & 0xff00) * i_1250_) & 0xff0000)) >> 8;
							} else if (i == 0) {
								int i_1252_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1234_]);
								int i_1253_ = (i_1252_ >>> 24) * anInt9015 >> 8;
								int i_1254_ = 256 - i_1253_;
								if ((anInt9014 & 0xffffff) == 16777215) {
									int i_1255_ = is[i_1235_];
									is[i_1235_] = ((((i_1252_ & 0xff00ff) * i_1253_ + (i_1255_ & 0xff00ff) * i_1254_) & ~0xff00ff) + (((i_1252_ & 0xff00) * i_1253_ + (i_1255_ & 0xff00) * i_1254_) & 0xff0000)) >> 8;
								} else if (i_1253_ != 255) {
									int i_1256_ = ((i_1252_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1257_ = ((i_1252_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1258_ = ((i_1252_ & 0xff) * anInt9019 & 0xff00);
									i_1252_ = (i_1256_ | i_1257_ | i_1258_) >>> 8;
									int i_1259_ = is[i_1235_];
									is[i_1235_] = ((((i_1252_ & 0xff00ff) * i_1253_ + (i_1259_ & 0xff00ff) * i_1254_) & ~0xff00ff) + (((i_1252_ & 0xff00) * i_1253_ + (i_1259_ & 0xff00) * i_1254_) & 0xff0000)) >> 8;
								} else {
									int i_1260_ = ((i_1252_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1261_ = ((i_1252_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1262_ = ((i_1252_ & 0xff) * anInt9019 & 0xff00);
									is[i_1235_] = (i_1260_ | i_1261_ | i_1262_) >>> 8;
								}
							} else if (i == 3) {
								int i_1263_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1234_]);
								int i_1264_ = anInt9014;
								int i_1265_ = i_1263_ + i_1264_;
								int i_1266_ = ((i_1263_ & 0xff00ff) + (i_1264_ & 0xff00ff));
								int i_1267_ = ((i_1266_ & 0x1000100) + (i_1265_ - i_1266_ & 0x10000));
								i_1267_ = i_1265_ - i_1267_ | i_1267_ - (i_1267_ >>> 8);
								int i_1268_ = (i_1263_ >>> 24) * anInt9015 >> 8;
								int i_1269_ = 256 - i_1268_;
								if (i_1268_ != 255) {
									i_1263_ = i_1267_;
									i_1267_ = is[i_1235_];
									i_1267_ = ((((i_1263_ & 0xff00ff) * i_1268_ + (i_1267_ & 0xff00ff) * i_1269_) & ~0xff00ff) + (((i_1263_ & 0xff00) * i_1268_ + (i_1267_ & 0xff00) * i_1269_) & 0xff0000)) >> 8;
								}
								is[i_1235_] = i_1267_;
							} else if (i == 2) {
								int i_1270_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1234_]);
								int i_1271_ = i_1270_ >>> 24;
								int i_1272_ = 256 - i_1271_;
								int i_1273_ = ((i_1270_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_1274_ = ((i_1270_ & 0xff00) * anInt9015 & 0xff0000);
								i_1270_ = ((i_1273_ | i_1274_) >>> 8) + anInt9022;
								int i_1275_ = is[i_1235_];
								is[i_1235_] = ((((i_1270_ & 0xff00ff) * i_1271_ + (i_1275_ & 0xff00ff) * i_1272_) & ~0xff00ff) + (((i_1270_ & 0xff00) * i_1271_ + (i_1275_ & 0xff00) * i_1272_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_735_ == 2) {
							if (i == 1) {
								int i_1276_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1234_]);
								int i_1277_ = is[i_1235_];
								int i_1278_ = i_1276_ + i_1277_;
								int i_1279_ = ((i_1276_ & 0xff00ff) + (i_1277_ & 0xff00ff));
								i_1277_ = ((i_1279_ & 0x1000100) + (i_1278_ - i_1279_ & 0x10000));
								is[i_1235_] = i_1278_ - i_1277_ | i_1277_ - (i_1277_ >>> 8);
							} else if (i == 0) {
								int i_1280_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1234_]);
								int i_1281_ = ((i_1280_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_1282_ = ((i_1280_ & 0xff00) * anInt9018 & 0xff0000);
								int i_1283_ = (i_1280_ & 0xff) * anInt9019 & 0xff00;
								i_1280_ = (i_1281_ | i_1282_ | i_1283_) >>> 8;
								int i_1284_ = is[i_1235_];
								int i_1285_ = i_1280_ + i_1284_;
								int i_1286_ = ((i_1280_ & 0xff00ff) + (i_1284_ & 0xff00ff));
								i_1284_ = ((i_1286_ & 0x1000100) + (i_1285_ - i_1286_ & 0x10000));
								is[i_1235_] = i_1285_ - i_1284_ | i_1284_ - (i_1284_ >>> 8);
							} else if (i == 3) {
								int i_1287_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1234_]);
								int i_1288_ = anInt9014;
								int i_1289_ = i_1287_ + i_1288_;
								int i_1290_ = ((i_1287_ & 0xff00ff) + (i_1288_ & 0xff00ff));
								int i_1291_ = ((i_1290_ & 0x1000100) + (i_1289_ - i_1290_ & 0x10000));
								i_1287_ = i_1289_ - i_1291_ | i_1291_ - (i_1291_ >>> 8);
								i_1291_ = is[i_1235_];
								i_1289_ = i_1287_ + i_1291_;
								i_1290_ = (i_1287_ & 0xff00ff) + (i_1291_ & 0xff00ff);
								i_1291_ = ((i_1290_ & 0x1000100) + (i_1289_ - i_1290_ & 0x10000));
								is[i_1235_] = i_1289_ - i_1291_ | i_1291_ - (i_1291_ >>> 8);
							} else if (i == 2) {
								int i_1292_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1234_]);
								int i_1293_ = ((i_1292_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_1294_ = ((i_1292_ & 0xff00) * anInt9015 & 0xff0000);
								i_1292_ = ((i_1293_ | i_1294_) >>> 8) + anInt9022;
								int i_1295_ = is[i_1235_];
								int i_1296_ = i_1292_ + i_1295_;
								int i_1297_ = ((i_1292_ & 0xff00ff) + (i_1295_ & 0xff00ff));
								i_1295_ = ((i_1297_ & 0x1000100) + (i_1296_ - i_1297_ & 0x10000));
								is[i_1235_] = i_1296_ - i_1295_ | i_1295_ - (i_1295_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_1229_ += anInt9004;
						i_1230_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				for (int i_1298_ = anInt9001; i_1298_ < 0; i_1298_++) {
					int i_1299_ = anInt9003;
					int i_1300_ = anInt8988 + anInt9012;
					int i_1301_ = anInt9011 + anInt9013;
					int i_1302_ = anInt8999;
					if (i_1300_ < 0) {
						int i_1303_ = (anInt9004 - 1 - i_1300_) / anInt9004;
						i_1302_ += i_1303_;
						i_1300_ += anInt9004 * i_1303_;
						i_1301_ += anInt8991 * i_1303_;
						i_1299_ += i_1303_;
					}
					int i_1304_;
					if ((i_1304_ = (1 + i_1300_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1302_)
						i_1302_ = i_1304_;
					if (i_1301_ < 0) {
						i_1304_ = (anInt8991 - 1 - i_1301_) / anInt8991;
						i_1302_ += i_1304_;
						i_1300_ += anInt9004 * i_1304_;
						i_1301_ += anInt8991 * i_1304_;
						i_1299_ += i_1304_;
					}
					if ((i_1304_ = (1 + i_1301_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_1302_)
						i_1302_ = i_1304_;
					for (/**/; i_1302_ < 0; i_1302_++) {
						int i_1305_ = (((i_1301_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_1300_ >> 12));
						int i_1306_ = i_1299_++;
						if (i_735_ == 0) {
							if (i == 1)
								is[i_1306_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1305_]);
							else if (i == 0) {
								int i_1307_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1305_++]);
								int i_1308_ = ((i_1307_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_1309_ = ((i_1307_ & 0xff00) * anInt9018 & 0xff0000);
								int i_1310_ = (i_1307_ & 0xff) * anInt9019 & 0xff00;
								is[i_1306_] = (i_1308_ | i_1309_ | i_1310_) >>> 8;
							} else if (i == 3) {
								int i_1311_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1305_++]);
								int i_1312_ = anInt9014;
								int i_1313_ = i_1311_ + i_1312_;
								int i_1314_ = ((i_1311_ & 0xff00ff) + (i_1312_ & 0xff00ff));
								int i_1315_ = ((i_1314_ & 0x1000100) + (i_1313_ - i_1314_ & 0x10000));
								is[i_1306_] = i_1313_ - i_1315_ | i_1315_ - (i_1315_ >>> 8);
							} else if (i == 2) {
								int i_1316_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1305_]);
								int i_1317_ = ((i_1316_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_1318_ = ((i_1316_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_1306_] = ((i_1317_ | i_1318_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_735_ == 1) {
							if (i == 1) {
								int i_1319_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1305_]);
								int i_1320_ = i_1319_ >>> 24;
								int i_1321_ = 256 - i_1320_;
								int i_1322_ = is[i_1306_];
								is[i_1306_] = ((((i_1319_ & 0xff00ff) * i_1320_ + (i_1322_ & 0xff00ff) * i_1321_) & ~0xff00ff) + (((i_1319_ & 0xff00) * i_1320_ + (i_1322_ & 0xff00) * i_1321_) & 0xff0000)) >> 8;
							} else if (i == 0) {
								int i_1323_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1305_]);
								int i_1324_ = (i_1323_ >>> 24) * anInt9015 >> 8;
								int i_1325_ = 256 - i_1324_;
								if ((anInt9014 & 0xffffff) == 16777215) {
									int i_1326_ = is[i_1306_];
									is[i_1306_] = ((((i_1323_ & 0xff00ff) * i_1324_ + (i_1326_ & 0xff00ff) * i_1325_) & ~0xff00ff) + (((i_1323_ & 0xff00) * i_1324_ + (i_1326_ & 0xff00) * i_1325_) & 0xff0000)) >> 8;
								} else if (i_1324_ != 255) {
									int i_1327_ = ((i_1323_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1328_ = ((i_1323_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1329_ = ((i_1323_ & 0xff) * anInt9019 & 0xff00);
									i_1323_ = (i_1327_ | i_1328_ | i_1329_) >>> 8;
									int i_1330_ = is[i_1306_];
									is[i_1306_] = ((((i_1323_ & 0xff00ff) * i_1324_ + (i_1330_ & 0xff00ff) * i_1325_) & ~0xff00ff) + (((i_1323_ & 0xff00) * i_1324_ + (i_1330_ & 0xff00) * i_1325_) & 0xff0000)) >> 8;
								} else {
									int i_1331_ = ((i_1323_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1332_ = ((i_1323_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1333_ = ((i_1323_ & 0xff) * anInt9019 & 0xff00);
									is[i_1306_] = (i_1331_ | i_1332_ | i_1333_) >>> 8;
								}
							} else if (i == 3) {
								int i_1334_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1305_]);
								int i_1335_ = anInt9014;
								int i_1336_ = i_1334_ + i_1335_;
								int i_1337_ = ((i_1334_ & 0xff00ff) + (i_1335_ & 0xff00ff));
								int i_1338_ = ((i_1337_ & 0x1000100) + (i_1336_ - i_1337_ & 0x10000));
								i_1338_ = i_1336_ - i_1338_ | i_1338_ - (i_1338_ >>> 8);
								int i_1339_ = (i_1334_ >>> 24) * anInt9015 >> 8;
								int i_1340_ = 256 - i_1339_;
								if (i_1339_ != 255) {
									i_1334_ = i_1338_;
									i_1338_ = is[i_1306_];
									i_1338_ = ((((i_1334_ & 0xff00ff) * i_1339_ + (i_1338_ & 0xff00ff) * i_1340_) & ~0xff00ff) + (((i_1334_ & 0xff00) * i_1339_ + (i_1338_ & 0xff00) * i_1340_) & 0xff0000)) >> 8;
								}
								is[i_1306_] = i_1338_;
							} else if (i == 2) {
								int i_1341_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1305_]);
								int i_1342_ = i_1341_ >>> 24;
								int i_1343_ = 256 - i_1342_;
								int i_1344_ = ((i_1341_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_1345_ = ((i_1341_ & 0xff00) * anInt9015 & 0xff0000);
								i_1341_ = ((i_1344_ | i_1345_) >>> 8) + anInt9022;
								int i_1346_ = is[i_1306_];
								is[i_1306_] = ((((i_1341_ & 0xff00ff) * i_1342_ + (i_1346_ & 0xff00ff) * i_1343_) & ~0xff00ff) + (((i_1341_ & 0xff00) * i_1342_ + (i_1346_ & 0xff00) * i_1343_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_735_ == 2) {
							if (i == 1) {
								int i_1347_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1305_]);
								int i_1348_ = is[i_1306_];
								int i_1349_ = i_1347_ + i_1348_;
								int i_1350_ = ((i_1347_ & 0xff00ff) + (i_1348_ & 0xff00ff));
								i_1348_ = ((i_1350_ & 0x1000100) + (i_1349_ - i_1350_ & 0x10000));
								is[i_1306_] = i_1349_ - i_1348_ | i_1348_ - (i_1348_ >>> 8);
							} else if (i == 0) {
								int i_1351_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1305_]);
								int i_1352_ = ((i_1351_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_1353_ = ((i_1351_ & 0xff00) * anInt9018 & 0xff0000);
								int i_1354_ = (i_1351_ & 0xff) * anInt9019 & 0xff00;
								i_1351_ = (i_1352_ | i_1353_ | i_1354_) >>> 8;
								int i_1355_ = is[i_1306_];
								int i_1356_ = i_1351_ + i_1355_;
								int i_1357_ = ((i_1351_ & 0xff00ff) + (i_1355_ & 0xff00ff));
								i_1355_ = ((i_1357_ & 0x1000100) + (i_1356_ - i_1357_ & 0x10000));
								is[i_1306_] = i_1356_ - i_1355_ | i_1355_ - (i_1355_ >>> 8);
							} else if (i == 3) {
								int i_1358_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1305_]);
								int i_1359_ = anInt9014;
								int i_1360_ = i_1358_ + i_1359_;
								int i_1361_ = ((i_1358_ & 0xff00ff) + (i_1359_ & 0xff00ff));
								int i_1362_ = ((i_1361_ & 0x1000100) + (i_1360_ - i_1361_ & 0x10000));
								i_1358_ = i_1360_ - i_1362_ | i_1362_ - (i_1362_ >>> 8);
								i_1362_ = is[i_1306_];
								i_1360_ = i_1358_ + i_1362_;
								i_1361_ = (i_1358_ & 0xff00ff) + (i_1362_ & 0xff00ff);
								i_1362_ = ((i_1361_ & 0x1000100) + (i_1360_ - i_1361_ & 0x10000));
								is[i_1306_] = i_1360_ - i_1362_ | i_1362_ - (i_1362_ >>> 8);
							} else if (i == 2) {
								int i_1363_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1305_]);
								int i_1364_ = ((i_1363_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_1365_ = ((i_1363_ & 0xff00) * anInt9015 & 0xff0000);
								i_1363_ = ((i_1364_ | i_1365_) >>> 8) + anInt9022;
								int i_1366_ = is[i_1306_];
								int i_1367_ = i_1363_ + i_1366_;
								int i_1368_ = ((i_1363_ & 0xff00ff) + (i_1366_ & 0xff00ff));
								i_1366_ = ((i_1368_ & 0x1000100) + (i_1367_ - i_1368_ & 0x10000));
								is[i_1306_] = i_1367_ - i_1366_ | i_1366_ - (i_1366_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_1300_ += anInt9004;
						i_1301_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	public void method643(int i, int i_1369_, int i_1370_, int i_1371_, int i_1372_) {
		if (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			int i_1373_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			i += ((Class57_Sub1_Sub1) this).anInt8990;
			i_1369_ += ((Class57_Sub1_Sub1) this).anInt9000;
			int i_1374_ = i_1369_ * i_1373_ + i;
			int i_1375_ = 0;
			int i_1376_ = ((Class57_Sub1_Sub1) this).anInt8989;
			int i_1377_ = ((Class57_Sub1_Sub1) this).anInt9010;
			int i_1378_ = i_1373_ - i_1377_;
			int i_1379_ = 0;
			if (i_1369_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_1380_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_1369_);
				i_1376_ -= i_1380_;
				i_1369_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_1375_ += i_1380_ * i_1377_;
				i_1374_ += i_1380_ * i_1373_;
			}
			if (i_1369_ + i_1376_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_1376_ -= (i_1369_ + i_1376_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_1381_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_1377_ -= i_1381_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_1375_ += i_1381_;
				i_1374_ += i_1381_;
				i_1379_ += i_1381_;
				i_1378_ += i_1381_;
			}
			if (i + i_1377_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_1382_ = (i + i_1377_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_1377_ -= i_1382_;
				i_1379_ += i_1382_;
				i_1378_ += i_1382_;
			}
			if (i_1377_ > 0 && i_1376_ > 0) {
				if (i_1372_ == 0) {
					if (i_1370_ == 1) {
						for (int i_1383_ = -i_1376_; i_1383_ < 0; i_1383_++) {
							int i_1384_ = i_1374_ + i_1377_ - 3;
							while (i_1374_ < i_1384_) {
								is[i_1374_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
								is[i_1374_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
								is[i_1374_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
								is[i_1374_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
							}
							i_1384_ += 3;
							while (i_1374_ < i_1384_)
								is[i_1374_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
							i_1374_ += i_1378_;
							i_1375_ += i_1379_;
						}
					} else if (i_1370_ == 0) {
						int i_1385_ = (i_1371_ & 0xff0000) >> 16;
						int i_1386_ = (i_1371_ & 0xff00) >> 8;
						int i_1387_ = i_1371_ & 0xff;
						for (int i_1388_ = -i_1376_; i_1388_ < 0; i_1388_++) {
							for (int i_1389_ = -i_1377_; i_1389_ < 0; i_1389_++) {
								int i_1390_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
								int i_1391_ = ((i_1390_ & 0xff0000) * i_1385_ & ~0xffffff);
								int i_1392_ = (i_1390_ & 0xff00) * i_1386_ & 0xff0000;
								int i_1393_ = (i_1390_ & 0xff) * i_1387_ & 0xff00;
								is[i_1374_++] = (i_1391_ | i_1392_ | i_1393_) >>> 8;
							}
							i_1374_ += i_1378_;
							i_1375_ += i_1379_;
						}
					} else if (i_1370_ == 3) {
						for (int i_1394_ = -i_1376_; i_1394_ < 0; i_1394_++) {
							for (int i_1395_ = -i_1377_; i_1395_ < 0; i_1395_++) {
								int i_1396_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
								int i_1397_ = i_1396_ + i_1371_;
								int i_1398_ = ((i_1396_ & 0xff00ff) + (i_1371_ & 0xff00ff));
								int i_1399_ = ((i_1398_ & 0x1000100) + (i_1397_ - i_1398_ & 0x10000));
								is[i_1374_++] = i_1397_ - i_1399_ | i_1399_ - (i_1399_ >>> 8);
							}
							i_1374_ += i_1378_;
							i_1375_ += i_1379_;
						}
					} else if (i_1370_ == 2) {
						int i_1400_ = i_1371_ >>> 24;
						int i_1401_ = 256 - i_1400_;
						int i_1402_ = (i_1371_ & 0xff00ff) * i_1401_ & ~0xff00ff;
						int i_1403_ = (i_1371_ & 0xff00) * i_1401_ & 0xff0000;
						i_1371_ = (i_1402_ | i_1403_) >>> 8;
						for (int i_1404_ = -i_1376_; i_1404_ < 0; i_1404_++) {
							for (int i_1405_ = -i_1377_; i_1405_ < 0; i_1405_++) {
								int i_1406_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
								i_1402_ = ((i_1406_ & 0xff00ff) * i_1400_ & ~0xff00ff);
								i_1403_ = (i_1406_ & 0xff00) * i_1400_ & 0xff0000;
								is[i_1374_++] = ((i_1402_ | i_1403_) >>> 8) + i_1371_;
							}
							i_1374_ += i_1378_;
							i_1375_ += i_1379_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1372_ == 1) {
					if (i_1370_ == 1) {
						for (int i_1407_ = -i_1376_; i_1407_ < 0; i_1407_++) {
							for (int i_1408_ = -i_1377_; i_1408_ < 0; i_1408_++) {
								int i_1409_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
								int i_1410_ = i_1409_ >>> 24;
								int i_1411_ = 256 - i_1410_;
								int i_1412_ = is[i_1374_];
								is[i_1374_++] = (((((i_1409_ & 0xff00ff) * i_1410_ + (i_1412_ & 0xff00ff) * i_1411_) & ~0xff00ff) >> 8) + (((((i_1409_ & ~0xff00ff) >>> 8) * i_1410_) + (((i_1412_ & ~0xff00ff) >>> 8) * i_1411_)) & ~0xff00ff));
							}
							i_1374_ += i_1378_;
							i_1375_ += i_1379_;
						}
					} else if (i_1370_ == 0) {
						if ((i_1371_ & 0xffffff) == 16777215) {
							for (int i_1413_ = -i_1376_; i_1413_ < 0; i_1413_++) {
								for (int i_1414_ = -i_1377_; i_1414_ < 0; i_1414_++) {
									int i_1415_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
									int i_1416_ = ((i_1415_ >>> 24) * (i_1371_ >>> 24) >> 8);
									int i_1417_ = 256 - i_1416_;
									int i_1418_ = is[i_1374_];
									is[i_1374_++] = ((((i_1415_ & 0xff00ff) * i_1416_ + (i_1418_ & 0xff00ff) * i_1417_) & ~0xff00ff) + (((i_1415_ & 0xff00) * i_1416_ + (i_1418_ & 0xff00) * i_1417_) & 0xff0000)) >> 8;
								}
								i_1374_ += i_1378_;
								i_1375_ += i_1379_;
							}
						} else {
							int i_1419_ = (i_1371_ & 0xff0000) >> 16;
							int i_1420_ = (i_1371_ & 0xff00) >> 8;
							int i_1421_ = i_1371_ & 0xff;
							for (int i_1422_ = -i_1376_; i_1422_ < 0; i_1422_++) {
								for (int i_1423_ = -i_1377_; i_1423_ < 0; i_1423_++) {
									int i_1424_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
									int i_1425_ = ((i_1424_ >>> 24) * (i_1371_ >>> 24) >> 8);
									int i_1426_ = 256 - i_1425_;
									if (i_1425_ != 255) {
										int i_1427_ = ((i_1424_ & 0xff0000) * i_1419_ & ~0xffffff);
										int i_1428_ = ((i_1424_ & 0xff00) * i_1420_ & 0xff0000);
										int i_1429_ = ((i_1424_ & 0xff) * i_1421_ & 0xff00);
										i_1424_ = (i_1427_ | i_1428_ | i_1429_) >>> 8;
										int i_1430_ = is[i_1374_];
										is[i_1374_++] = ((((i_1424_ & 0xff00ff) * i_1425_ + ((i_1430_ & 0xff00ff) * i_1426_)) & ~0xff00ff) + (((i_1424_ & 0xff00) * i_1425_ + ((i_1430_ & 0xff00) * i_1426_)) & 0xff0000)) >> 8;
									} else {
										int i_1431_ = ((i_1424_ & 0xff0000) * i_1419_ & ~0xffffff);
										int i_1432_ = ((i_1424_ & 0xff00) * i_1420_ & 0xff0000);
										int i_1433_ = ((i_1424_ & 0xff) * i_1421_ & 0xff00);
										is[i_1374_++] = (i_1431_ | i_1432_ | i_1433_) >>> 8;
									}
								}
								i_1374_ += i_1378_;
								i_1375_ += i_1379_;
							}
						}
					} else if (i_1370_ == 3) {
						for (int i_1434_ = -i_1376_; i_1434_ < 0; i_1434_++) {
							for (int i_1435_ = -i_1377_; i_1435_ < 0; i_1435_++) {
								int i_1436_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
								int i_1437_ = i_1436_ + i_1371_;
								int i_1438_ = ((i_1436_ & 0xff00ff) + (i_1371_ & 0xff00ff));
								int i_1439_ = ((i_1438_ & 0x1000100) + (i_1437_ - i_1438_ & 0x10000));
								i_1439_ = i_1437_ - i_1439_ | i_1439_ - (i_1439_ >>> 8);
								int i_1440_ = (i_1439_ >>> 24) * (i_1371_ >>> 24) >> 8;
								int i_1441_ = 256 - i_1440_;
								if (i_1440_ != 255) {
									i_1436_ = i_1439_;
									i_1439_ = is[i_1374_];
									i_1439_ = ((((i_1436_ & 0xff00ff) * i_1440_ + (i_1439_ & 0xff00ff) * i_1441_) & ~0xff00ff) + (((i_1436_ & 0xff00) * i_1440_ + (i_1439_ & 0xff00) * i_1441_) & 0xff0000)) >> 8;
								}
								is[i_1374_++] = i_1439_;
							}
							i_1374_ += i_1378_;
							i_1375_ += i_1379_;
						}
					} else if (i_1370_ == 2) {
						int i_1442_ = i_1371_ >>> 24;
						int i_1443_ = 256 - i_1442_;
						int i_1444_ = (i_1371_ & 0xff00ff) * i_1443_ & ~0xff00ff;
						int i_1445_ = (i_1371_ & 0xff00) * i_1443_ & 0xff0000;
						i_1371_ = (i_1444_ | i_1445_) >>> 8;
						for (int i_1446_ = -i_1376_; i_1446_ < 0; i_1446_++) {
							for (int i_1447_ = -i_1377_; i_1447_ < 0; i_1447_++) {
								int i_1448_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
								int i_1449_ = i_1448_ >>> 24;
								int i_1450_ = 256 - i_1449_;
								i_1444_ = ((i_1448_ & 0xff00ff) * i_1442_ & ~0xff00ff);
								i_1445_ = (i_1448_ & 0xff00) * i_1442_ & 0xff0000;
								i_1448_ = ((i_1444_ | i_1445_) >>> 8) + i_1371_;
								int i_1451_ = is[i_1374_];
								is[i_1374_++] = ((((i_1448_ & 0xff00ff) * i_1449_ + (i_1451_ & 0xff00ff) * i_1450_) & ~0xff00ff) + (((i_1448_ & 0xff00) * i_1449_ + (i_1451_ & 0xff00) * i_1450_) & 0xff0000)) >> 8;
							}
							i_1374_ += i_1378_;
							i_1375_ += i_1379_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1372_ == 2) {
					if (i_1370_ == 1) {
						for (int i_1452_ = -i_1376_; i_1452_ < 0; i_1452_++) {
							for (int i_1453_ = -i_1377_; i_1453_ < 0; i_1453_++) {
								int i_1454_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
								if (i_1454_ != 0) {
									int i_1455_ = is[i_1374_];
									int i_1456_ = i_1454_ + i_1455_;
									int i_1457_ = ((i_1454_ & 0xff00ff) + (i_1455_ & 0xff00ff));
									i_1455_ = ((i_1457_ & 0x1000100) + (i_1456_ - i_1457_ & 0x10000));
									is[i_1374_++] = (i_1456_ - i_1455_ | i_1455_ - (i_1455_ >>> 8));
								} else
									i_1374_++;
							}
							i_1374_ += i_1378_;
							i_1375_ += i_1379_;
						}
					} else if (i_1370_ == 0) {
						int i_1458_ = (i_1371_ & 0xff0000) >> 16;
						int i_1459_ = (i_1371_ & 0xff00) >> 8;
						int i_1460_ = i_1371_ & 0xff;
						for (int i_1461_ = -i_1376_; i_1461_ < 0; i_1461_++) {
							for (int i_1462_ = -i_1377_; i_1462_ < 0; i_1462_++) {
								int i_1463_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
								if (i_1463_ != 0) {
									int i_1464_ = ((i_1463_ & 0xff0000) * i_1458_ & ~0xffffff);
									int i_1465_ = ((i_1463_ & 0xff00) * i_1459_ & 0xff0000);
									int i_1466_ = (i_1463_ & 0xff) * i_1460_ & 0xff00;
									i_1463_ = (i_1464_ | i_1465_ | i_1466_) >>> 8;
									int i_1467_ = is[i_1374_];
									int i_1468_ = i_1463_ + i_1467_;
									int i_1469_ = ((i_1463_ & 0xff00ff) + (i_1467_ & 0xff00ff));
									i_1467_ = ((i_1469_ & 0x1000100) + (i_1468_ - i_1469_ & 0x10000));
									is[i_1374_++] = (i_1468_ - i_1467_ | i_1467_ - (i_1467_ >>> 8));
								} else
									i_1374_++;
							}
							i_1374_ += i_1378_;
							i_1375_ += i_1379_;
						}
					} else if (i_1370_ == 3) {
						for (int i_1470_ = -i_1376_; i_1470_ < 0; i_1470_++) {
							for (int i_1471_ = -i_1377_; i_1471_ < 0; i_1471_++) {
								int i_1472_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
								int i_1473_ = i_1472_ + i_1371_;
								int i_1474_ = ((i_1472_ & 0xff00ff) + (i_1371_ & 0xff00ff));
								int i_1475_ = ((i_1474_ & 0x1000100) + (i_1473_ - i_1474_ & 0x10000));
								i_1472_ = i_1473_ - i_1475_ | i_1475_ - (i_1475_ >>> 8);
								i_1475_ = is[i_1374_];
								i_1473_ = i_1472_ + i_1475_;
								i_1474_ = (i_1472_ & 0xff00ff) + (i_1475_ & 0xff00ff);
								i_1475_ = ((i_1474_ & 0x1000100) + (i_1473_ - i_1474_ & 0x10000));
								is[i_1374_++] = i_1473_ - i_1475_ | i_1475_ - (i_1475_ >>> 8);
							}
							i_1374_ += i_1378_;
							i_1375_ += i_1379_;
						}
					} else if (i_1370_ == 2) {
						int i_1476_ = i_1371_ >>> 24;
						int i_1477_ = 256 - i_1476_;
						int i_1478_ = (i_1371_ & 0xff00ff) * i_1477_ & ~0xff00ff;
						int i_1479_ = (i_1371_ & 0xff00) * i_1477_ & 0xff0000;
						i_1371_ = (i_1478_ | i_1479_) >>> 8;
						for (int i_1480_ = -i_1376_; i_1480_ < 0; i_1480_++) {
							for (int i_1481_ = -i_1377_; i_1481_ < 0; i_1481_++) {
								int i_1482_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1375_++]);
								if (i_1482_ != 0) {
									i_1478_ = ((i_1482_ & 0xff00ff) * i_1476_ & ~0xff00ff);
									i_1479_ = ((i_1482_ & 0xff00) * i_1476_ & 0xff0000);
									i_1482_ = (((i_1478_ | i_1479_) >>> 8) + i_1371_);
									int i_1483_ = is[i_1374_];
									int i_1484_ = i_1482_ + i_1483_;
									int i_1485_ = ((i_1482_ & 0xff00ff) + (i_1483_ & 0xff00ff));
									i_1483_ = ((i_1485_ & 0x1000100) + (i_1484_ - i_1485_ & 0x10000));
									is[i_1374_++] = (i_1484_ - i_1483_ | i_1483_ - (i_1483_ >>> 8));
								} else
									i_1374_++;
							}
							i_1374_ += i_1378_;
							i_1375_ += i_1379_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method649(int i, int i_1486_, int i_1487_, int i_1488_, int i_1489_) {
		if (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			int i_1490_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			i += ((Class57_Sub1_Sub1) this).anInt8990;
			i_1486_ += ((Class57_Sub1_Sub1) this).anInt9000;
			int i_1491_ = i_1486_ * i_1490_ + i;
			int i_1492_ = 0;
			int i_1493_ = ((Class57_Sub1_Sub1) this).anInt8989;
			int i_1494_ = ((Class57_Sub1_Sub1) this).anInt9010;
			int i_1495_ = i_1490_ - i_1494_;
			int i_1496_ = 0;
			if (i_1486_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_1497_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_1486_);
				i_1493_ -= i_1497_;
				i_1486_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_1492_ += i_1497_ * i_1494_;
				i_1491_ += i_1497_ * i_1490_;
			}
			if (i_1486_ + i_1493_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_1493_ -= (i_1486_ + i_1493_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_1498_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_1494_ -= i_1498_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_1492_ += i_1498_;
				i_1491_ += i_1498_;
				i_1496_ += i_1498_;
				i_1495_ += i_1498_;
			}
			if (i + i_1494_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_1499_ = (i + i_1494_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_1494_ -= i_1499_;
				i_1496_ += i_1499_;
				i_1495_ += i_1499_;
			}
			if (i_1494_ > 0 && i_1493_ > 0) {
				if (i_1489_ == 0) {
					if (i_1487_ == 1) {
						for (int i_1500_ = -i_1493_; i_1500_ < 0; i_1500_++) {
							int i_1501_ = i_1491_ + i_1494_ - 3;
							while (i_1491_ < i_1501_) {
								is[i_1491_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
								is[i_1491_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
								is[i_1491_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
								is[i_1491_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
							}
							i_1501_ += 3;
							while (i_1491_ < i_1501_)
								is[i_1491_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
							i_1491_ += i_1495_;
							i_1492_ += i_1496_;
						}
					} else if (i_1487_ == 0) {
						int i_1502_ = (i_1488_ & 0xff0000) >> 16;
						int i_1503_ = (i_1488_ & 0xff00) >> 8;
						int i_1504_ = i_1488_ & 0xff;
						for (int i_1505_ = -i_1493_; i_1505_ < 0; i_1505_++) {
							for (int i_1506_ = -i_1494_; i_1506_ < 0; i_1506_++) {
								int i_1507_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
								int i_1508_ = ((i_1507_ & 0xff0000) * i_1502_ & ~0xffffff);
								int i_1509_ = (i_1507_ & 0xff00) * i_1503_ & 0xff0000;
								int i_1510_ = (i_1507_ & 0xff) * i_1504_ & 0xff00;
								is[i_1491_++] = (i_1508_ | i_1509_ | i_1510_) >>> 8;
							}
							i_1491_ += i_1495_;
							i_1492_ += i_1496_;
						}
					} else if (i_1487_ == 3) {
						for (int i_1511_ = -i_1493_; i_1511_ < 0; i_1511_++) {
							for (int i_1512_ = -i_1494_; i_1512_ < 0; i_1512_++) {
								int i_1513_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
								int i_1514_ = i_1513_ + i_1488_;
								int i_1515_ = ((i_1513_ & 0xff00ff) + (i_1488_ & 0xff00ff));
								int i_1516_ = ((i_1515_ & 0x1000100) + (i_1514_ - i_1515_ & 0x10000));
								is[i_1491_++] = i_1514_ - i_1516_ | i_1516_ - (i_1516_ >>> 8);
							}
							i_1491_ += i_1495_;
							i_1492_ += i_1496_;
						}
					} else if (i_1487_ == 2) {
						int i_1517_ = i_1488_ >>> 24;
						int i_1518_ = 256 - i_1517_;
						int i_1519_ = (i_1488_ & 0xff00ff) * i_1518_ & ~0xff00ff;
						int i_1520_ = (i_1488_ & 0xff00) * i_1518_ & 0xff0000;
						i_1488_ = (i_1519_ | i_1520_) >>> 8;
						for (int i_1521_ = -i_1493_; i_1521_ < 0; i_1521_++) {
							for (int i_1522_ = -i_1494_; i_1522_ < 0; i_1522_++) {
								int i_1523_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
								i_1519_ = ((i_1523_ & 0xff00ff) * i_1517_ & ~0xff00ff);
								i_1520_ = (i_1523_ & 0xff00) * i_1517_ & 0xff0000;
								is[i_1491_++] = ((i_1519_ | i_1520_) >>> 8) + i_1488_;
							}
							i_1491_ += i_1495_;
							i_1492_ += i_1496_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1489_ == 1) {
					if (i_1487_ == 1) {
						for (int i_1524_ = -i_1493_; i_1524_ < 0; i_1524_++) {
							for (int i_1525_ = -i_1494_; i_1525_ < 0; i_1525_++) {
								int i_1526_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
								int i_1527_ = i_1526_ >>> 24;
								int i_1528_ = 256 - i_1527_;
								int i_1529_ = is[i_1491_];
								is[i_1491_++] = (((((i_1526_ & 0xff00ff) * i_1527_ + (i_1529_ & 0xff00ff) * i_1528_) & ~0xff00ff) >> 8) + (((((i_1526_ & ~0xff00ff) >>> 8) * i_1527_) + (((i_1529_ & ~0xff00ff) >>> 8) * i_1528_)) & ~0xff00ff));
							}
							i_1491_ += i_1495_;
							i_1492_ += i_1496_;
						}
					} else if (i_1487_ == 0) {
						if ((i_1488_ & 0xffffff) == 16777215) {
							for (int i_1530_ = -i_1493_; i_1530_ < 0; i_1530_++) {
								for (int i_1531_ = -i_1494_; i_1531_ < 0; i_1531_++) {
									int i_1532_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
									int i_1533_ = ((i_1532_ >>> 24) * (i_1488_ >>> 24) >> 8);
									int i_1534_ = 256 - i_1533_;
									int i_1535_ = is[i_1491_];
									is[i_1491_++] = ((((i_1532_ & 0xff00ff) * i_1533_ + (i_1535_ & 0xff00ff) * i_1534_) & ~0xff00ff) + (((i_1532_ & 0xff00) * i_1533_ + (i_1535_ & 0xff00) * i_1534_) & 0xff0000)) >> 8;
								}
								i_1491_ += i_1495_;
								i_1492_ += i_1496_;
							}
						} else {
							int i_1536_ = (i_1488_ & 0xff0000) >> 16;
							int i_1537_ = (i_1488_ & 0xff00) >> 8;
							int i_1538_ = i_1488_ & 0xff;
							for (int i_1539_ = -i_1493_; i_1539_ < 0; i_1539_++) {
								for (int i_1540_ = -i_1494_; i_1540_ < 0; i_1540_++) {
									int i_1541_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
									int i_1542_ = ((i_1541_ >>> 24) * (i_1488_ >>> 24) >> 8);
									int i_1543_ = 256 - i_1542_;
									if (i_1542_ != 255) {
										int i_1544_ = ((i_1541_ & 0xff0000) * i_1536_ & ~0xffffff);
										int i_1545_ = ((i_1541_ & 0xff00) * i_1537_ & 0xff0000);
										int i_1546_ = ((i_1541_ & 0xff) * i_1538_ & 0xff00);
										i_1541_ = (i_1544_ | i_1545_ | i_1546_) >>> 8;
										int i_1547_ = is[i_1491_];
										is[i_1491_++] = ((((i_1541_ & 0xff00ff) * i_1542_ + ((i_1547_ & 0xff00ff) * i_1543_)) & ~0xff00ff) + (((i_1541_ & 0xff00) * i_1542_ + ((i_1547_ & 0xff00) * i_1543_)) & 0xff0000)) >> 8;
									} else {
										int i_1548_ = ((i_1541_ & 0xff0000) * i_1536_ & ~0xffffff);
										int i_1549_ = ((i_1541_ & 0xff00) * i_1537_ & 0xff0000);
										int i_1550_ = ((i_1541_ & 0xff) * i_1538_ & 0xff00);
										is[i_1491_++] = (i_1548_ | i_1549_ | i_1550_) >>> 8;
									}
								}
								i_1491_ += i_1495_;
								i_1492_ += i_1496_;
							}
						}
					} else if (i_1487_ == 3) {
						for (int i_1551_ = -i_1493_; i_1551_ < 0; i_1551_++) {
							for (int i_1552_ = -i_1494_; i_1552_ < 0; i_1552_++) {
								int i_1553_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
								int i_1554_ = i_1553_ + i_1488_;
								int i_1555_ = ((i_1553_ & 0xff00ff) + (i_1488_ & 0xff00ff));
								int i_1556_ = ((i_1555_ & 0x1000100) + (i_1554_ - i_1555_ & 0x10000));
								i_1556_ = i_1554_ - i_1556_ | i_1556_ - (i_1556_ >>> 8);
								int i_1557_ = (i_1556_ >>> 24) * (i_1488_ >>> 24) >> 8;
								int i_1558_ = 256 - i_1557_;
								if (i_1557_ != 255) {
									i_1553_ = i_1556_;
									i_1556_ = is[i_1491_];
									i_1556_ = ((((i_1553_ & 0xff00ff) * i_1557_ + (i_1556_ & 0xff00ff) * i_1558_) & ~0xff00ff) + (((i_1553_ & 0xff00) * i_1557_ + (i_1556_ & 0xff00) * i_1558_) & 0xff0000)) >> 8;
								}
								is[i_1491_++] = i_1556_;
							}
							i_1491_ += i_1495_;
							i_1492_ += i_1496_;
						}
					} else if (i_1487_ == 2) {
						int i_1559_ = i_1488_ >>> 24;
						int i_1560_ = 256 - i_1559_;
						int i_1561_ = (i_1488_ & 0xff00ff) * i_1560_ & ~0xff00ff;
						int i_1562_ = (i_1488_ & 0xff00) * i_1560_ & 0xff0000;
						i_1488_ = (i_1561_ | i_1562_) >>> 8;
						for (int i_1563_ = -i_1493_; i_1563_ < 0; i_1563_++) {
							for (int i_1564_ = -i_1494_; i_1564_ < 0; i_1564_++) {
								int i_1565_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
								int i_1566_ = i_1565_ >>> 24;
								int i_1567_ = 256 - i_1566_;
								i_1561_ = ((i_1565_ & 0xff00ff) * i_1559_ & ~0xff00ff);
								i_1562_ = (i_1565_ & 0xff00) * i_1559_ & 0xff0000;
								i_1565_ = ((i_1561_ | i_1562_) >>> 8) + i_1488_;
								int i_1568_ = is[i_1491_];
								is[i_1491_++] = ((((i_1565_ & 0xff00ff) * i_1566_ + (i_1568_ & 0xff00ff) * i_1567_) & ~0xff00ff) + (((i_1565_ & 0xff00) * i_1566_ + (i_1568_ & 0xff00) * i_1567_) & 0xff0000)) >> 8;
							}
							i_1491_ += i_1495_;
							i_1492_ += i_1496_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1489_ == 2) {
					if (i_1487_ == 1) {
						for (int i_1569_ = -i_1493_; i_1569_ < 0; i_1569_++) {
							for (int i_1570_ = -i_1494_; i_1570_ < 0; i_1570_++) {
								int i_1571_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
								if (i_1571_ != 0) {
									int i_1572_ = is[i_1491_];
									int i_1573_ = i_1571_ + i_1572_;
									int i_1574_ = ((i_1571_ & 0xff00ff) + (i_1572_ & 0xff00ff));
									i_1572_ = ((i_1574_ & 0x1000100) + (i_1573_ - i_1574_ & 0x10000));
									is[i_1491_++] = (i_1573_ - i_1572_ | i_1572_ - (i_1572_ >>> 8));
								} else
									i_1491_++;
							}
							i_1491_ += i_1495_;
							i_1492_ += i_1496_;
						}
					} else if (i_1487_ == 0) {
						int i_1575_ = (i_1488_ & 0xff0000) >> 16;
						int i_1576_ = (i_1488_ & 0xff00) >> 8;
						int i_1577_ = i_1488_ & 0xff;
						for (int i_1578_ = -i_1493_; i_1578_ < 0; i_1578_++) {
							for (int i_1579_ = -i_1494_; i_1579_ < 0; i_1579_++) {
								int i_1580_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
								if (i_1580_ != 0) {
									int i_1581_ = ((i_1580_ & 0xff0000) * i_1575_ & ~0xffffff);
									int i_1582_ = ((i_1580_ & 0xff00) * i_1576_ & 0xff0000);
									int i_1583_ = (i_1580_ & 0xff) * i_1577_ & 0xff00;
									i_1580_ = (i_1581_ | i_1582_ | i_1583_) >>> 8;
									int i_1584_ = is[i_1491_];
									int i_1585_ = i_1580_ + i_1584_;
									int i_1586_ = ((i_1580_ & 0xff00ff) + (i_1584_ & 0xff00ff));
									i_1584_ = ((i_1586_ & 0x1000100) + (i_1585_ - i_1586_ & 0x10000));
									is[i_1491_++] = (i_1585_ - i_1584_ | i_1584_ - (i_1584_ >>> 8));
								} else
									i_1491_++;
							}
							i_1491_ += i_1495_;
							i_1492_ += i_1496_;
						}
					} else if (i_1487_ == 3) {
						for (int i_1587_ = -i_1493_; i_1587_ < 0; i_1587_++) {
							for (int i_1588_ = -i_1494_; i_1588_ < 0; i_1588_++) {
								int i_1589_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
								int i_1590_ = i_1589_ + i_1488_;
								int i_1591_ = ((i_1589_ & 0xff00ff) + (i_1488_ & 0xff00ff));
								int i_1592_ = ((i_1591_ & 0x1000100) + (i_1590_ - i_1591_ & 0x10000));
								i_1589_ = i_1590_ - i_1592_ | i_1592_ - (i_1592_ >>> 8);
								i_1592_ = is[i_1491_];
								i_1590_ = i_1589_ + i_1592_;
								i_1591_ = (i_1589_ & 0xff00ff) + (i_1592_ & 0xff00ff);
								i_1592_ = ((i_1591_ & 0x1000100) + (i_1590_ - i_1591_ & 0x10000));
								is[i_1491_++] = i_1590_ - i_1592_ | i_1592_ - (i_1592_ >>> 8);
							}
							i_1491_ += i_1495_;
							i_1492_ += i_1496_;
						}
					} else if (i_1487_ == 2) {
						int i_1593_ = i_1488_ >>> 24;
						int i_1594_ = 256 - i_1593_;
						int i_1595_ = (i_1488_ & 0xff00ff) * i_1594_ & ~0xff00ff;
						int i_1596_ = (i_1488_ & 0xff00) * i_1594_ & 0xff0000;
						i_1488_ = (i_1595_ | i_1596_) >>> 8;
						for (int i_1597_ = -i_1493_; i_1597_ < 0; i_1597_++) {
							for (int i_1598_ = -i_1494_; i_1598_ < 0; i_1598_++) {
								int i_1599_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1492_++]);
								if (i_1599_ != 0) {
									i_1595_ = ((i_1599_ & 0xff00ff) * i_1593_ & ~0xff00ff);
									i_1596_ = ((i_1599_ & 0xff00) * i_1593_ & 0xff0000);
									i_1599_ = (((i_1595_ | i_1596_) >>> 8) + i_1488_);
									int i_1600_ = is[i_1491_];
									int i_1601_ = i_1599_ + i_1600_;
									int i_1602_ = ((i_1599_ & 0xff00ff) + (i_1600_ & 0xff00ff));
									i_1600_ = ((i_1602_ & 0x1000100) + (i_1601_ - i_1602_ & 0x10000));
									is[i_1491_++] = (i_1601_ - i_1600_ | i_1600_ - (i_1600_ >>> 8));
								} else
									i_1491_++;
							}
							i_1491_ += i_1495_;
							i_1492_ += i_1496_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method654(int i, int i_1603_, Class_ta class_ta, int i_1604_, int i_1605_) {
		if (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			i += ((Class57_Sub1_Sub1) this).anInt8990;
			i_1603_ += ((Class57_Sub1_Sub1) this).anInt9000;
			int i_1606_ = 0;
			int i_1607_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			int i_1608_ = ((Class57_Sub1_Sub1) this).anInt9010;
			int i_1609_ = ((Class57_Sub1_Sub1) this).anInt8989;
			int i_1610_ = i_1607_ - i_1608_;
			int i_1611_ = 0;
			int i_1612_ = i + i_1603_ * i_1607_;
			if (i_1603_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_1613_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_1603_);
				i_1609_ -= i_1613_;
				i_1603_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_1606_ += i_1613_ * i_1608_;
				i_1612_ += i_1613_ * i_1607_;
			}
			if (i_1603_ + i_1609_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_1609_ -= (i_1603_ + i_1609_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_1614_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_1608_ -= i_1614_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_1606_ += i_1614_;
				i_1612_ += i_1614_;
				i_1611_ += i_1614_;
				i_1610_ += i_1614_;
			}
			if (i + i_1608_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_1615_ = (i + i_1608_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_1608_ -= i_1615_;
				i_1611_ += i_1615_;
				i_1610_ += i_1615_;
			}
			if (i_1608_ > 0 && i_1609_ > 0) {
				Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
				int[] is_1616_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
				int[] is_1617_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
				int i_1618_ = i_1603_;
				if (i_1605_ > i_1618_) {
					i_1618_ = i_1605_;
					i_1612_ += (i_1605_ - i_1603_) * i_1607_;
					i_1606_ += ((i_1605_ - i_1603_) * ((Class57_Sub1_Sub1) this).anInt9010);
				}
				int i_1619_ = (i_1605_ + is_1616_.length < i_1603_ + i_1609_ ? i_1605_ + is_1616_.length : i_1603_ + i_1609_);
				for (int i_1620_ = i_1618_; i_1620_ < i_1619_; i_1620_++) {
					int i_1621_ = is_1616_[i_1620_ - i_1605_] + i_1604_;
					int i_1622_ = is_1617_[i_1620_ - i_1605_];
					int i_1623_ = i_1608_;
					if (i > i_1621_) {
						int i_1624_ = i - i_1621_;
						if (i_1624_ >= i_1622_) {
							i_1606_ += i_1608_ + i_1611_;
							i_1612_ += i_1608_ + i_1610_;
							continue;
						}
						i_1622_ -= i_1624_;
					} else {
						int i_1625_ = i_1621_ - i;
						if (i_1625_ >= i_1608_) {
							i_1606_ += i_1608_ + i_1611_;
							i_1612_ += i_1608_ + i_1610_;
							continue;
						}
						i_1606_ += i_1625_;
						i_1623_ -= i_1625_;
						i_1612_ += i_1625_;
					}
					int i_1626_ = 0;
					if (i_1623_ < i_1622_)
						i_1622_ = i_1623_;
					else
						i_1626_ = i_1623_ - i_1622_;
					for (int i_1627_ = -i_1622_; i_1627_ < 0; i_1627_++) {
						int i_1628_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1606_++]);
						int i_1629_ = i_1628_ >>> 24;
						int i_1630_ = 256 - i_1629_;
						int i_1631_ = is[i_1612_];
						is[i_1612_++] = ((((i_1628_ & 0xff00ff) * i_1629_ + (i_1631_ & 0xff00ff) * i_1630_) & ~0xff00ff) + (((i_1628_ & 0xff00) * i_1629_ + (i_1631_ & 0xff00) * i_1630_) & 0xff0000)) >> 8;
					}
					i_1606_ += i_1626_ + i_1611_;
					i_1612_ += i_1626_ + i_1610_;
				}
			}
		}
	}

	public void method674(int i, int i_1632_, int i_1633_, int i_1634_, int i_1635_) {
		if (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			int i_1636_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			i += ((Class57_Sub1_Sub1) this).anInt8990;
			i_1632_ += ((Class57_Sub1_Sub1) this).anInt9000;
			int i_1637_ = i_1632_ * i_1636_ + i;
			int i_1638_ = 0;
			int i_1639_ = ((Class57_Sub1_Sub1) this).anInt8989;
			int i_1640_ = ((Class57_Sub1_Sub1) this).anInt9010;
			int i_1641_ = i_1636_ - i_1640_;
			int i_1642_ = 0;
			if (i_1632_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_1643_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_1632_);
				i_1639_ -= i_1643_;
				i_1632_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_1638_ += i_1643_ * i_1640_;
				i_1637_ += i_1643_ * i_1636_;
			}
			if (i_1632_ + i_1639_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_1639_ -= (i_1632_ + i_1639_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_1644_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_1640_ -= i_1644_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_1638_ += i_1644_;
				i_1637_ += i_1644_;
				i_1642_ += i_1644_;
				i_1641_ += i_1644_;
			}
			if (i + i_1640_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_1645_ = (i + i_1640_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_1640_ -= i_1645_;
				i_1642_ += i_1645_;
				i_1641_ += i_1645_;
			}
			if (i_1640_ > 0 && i_1639_ > 0) {
				if (i_1635_ == 0) {
					if (i_1633_ == 1) {
						for (int i_1646_ = -i_1639_; i_1646_ < 0; i_1646_++) {
							int i_1647_ = i_1637_ + i_1640_ - 3;
							while (i_1637_ < i_1647_) {
								is[i_1637_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
								is[i_1637_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
								is[i_1637_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
								is[i_1637_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
							}
							i_1647_ += 3;
							while (i_1637_ < i_1647_)
								is[i_1637_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
							i_1637_ += i_1641_;
							i_1638_ += i_1642_;
						}
					} else if (i_1633_ == 0) {
						int i_1648_ = (i_1634_ & 0xff0000) >> 16;
						int i_1649_ = (i_1634_ & 0xff00) >> 8;
						int i_1650_ = i_1634_ & 0xff;
						for (int i_1651_ = -i_1639_; i_1651_ < 0; i_1651_++) {
							for (int i_1652_ = -i_1640_; i_1652_ < 0; i_1652_++) {
								int i_1653_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
								int i_1654_ = ((i_1653_ & 0xff0000) * i_1648_ & ~0xffffff);
								int i_1655_ = (i_1653_ & 0xff00) * i_1649_ & 0xff0000;
								int i_1656_ = (i_1653_ & 0xff) * i_1650_ & 0xff00;
								is[i_1637_++] = (i_1654_ | i_1655_ | i_1656_) >>> 8;
							}
							i_1637_ += i_1641_;
							i_1638_ += i_1642_;
						}
					} else if (i_1633_ == 3) {
						for (int i_1657_ = -i_1639_; i_1657_ < 0; i_1657_++) {
							for (int i_1658_ = -i_1640_; i_1658_ < 0; i_1658_++) {
								int i_1659_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
								int i_1660_ = i_1659_ + i_1634_;
								int i_1661_ = ((i_1659_ & 0xff00ff) + (i_1634_ & 0xff00ff));
								int i_1662_ = ((i_1661_ & 0x1000100) + (i_1660_ - i_1661_ & 0x10000));
								is[i_1637_++] = i_1660_ - i_1662_ | i_1662_ - (i_1662_ >>> 8);
							}
							i_1637_ += i_1641_;
							i_1638_ += i_1642_;
						}
					} else if (i_1633_ == 2) {
						int i_1663_ = i_1634_ >>> 24;
						int i_1664_ = 256 - i_1663_;
						int i_1665_ = (i_1634_ & 0xff00ff) * i_1664_ & ~0xff00ff;
						int i_1666_ = (i_1634_ & 0xff00) * i_1664_ & 0xff0000;
						i_1634_ = (i_1665_ | i_1666_) >>> 8;
						for (int i_1667_ = -i_1639_; i_1667_ < 0; i_1667_++) {
							for (int i_1668_ = -i_1640_; i_1668_ < 0; i_1668_++) {
								int i_1669_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
								i_1665_ = ((i_1669_ & 0xff00ff) * i_1663_ & ~0xff00ff);
								i_1666_ = (i_1669_ & 0xff00) * i_1663_ & 0xff0000;
								is[i_1637_++] = ((i_1665_ | i_1666_) >>> 8) + i_1634_;
							}
							i_1637_ += i_1641_;
							i_1638_ += i_1642_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1635_ == 1) {
					if (i_1633_ == 1) {
						for (int i_1670_ = -i_1639_; i_1670_ < 0; i_1670_++) {
							for (int i_1671_ = -i_1640_; i_1671_ < 0; i_1671_++) {
								int i_1672_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
								int i_1673_ = i_1672_ >>> 24;
								int i_1674_ = 256 - i_1673_;
								int i_1675_ = is[i_1637_];
								is[i_1637_++] = (((((i_1672_ & 0xff00ff) * i_1673_ + (i_1675_ & 0xff00ff) * i_1674_) & ~0xff00ff) >> 8) + (((((i_1672_ & ~0xff00ff) >>> 8) * i_1673_) + (((i_1675_ & ~0xff00ff) >>> 8) * i_1674_)) & ~0xff00ff));
							}
							i_1637_ += i_1641_;
							i_1638_ += i_1642_;
						}
					} else if (i_1633_ == 0) {
						if ((i_1634_ & 0xffffff) == 16777215) {
							for (int i_1676_ = -i_1639_; i_1676_ < 0; i_1676_++) {
								for (int i_1677_ = -i_1640_; i_1677_ < 0; i_1677_++) {
									int i_1678_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
									int i_1679_ = ((i_1678_ >>> 24) * (i_1634_ >>> 24) >> 8);
									int i_1680_ = 256 - i_1679_;
									int i_1681_ = is[i_1637_];
									is[i_1637_++] = ((((i_1678_ & 0xff00ff) * i_1679_ + (i_1681_ & 0xff00ff) * i_1680_) & ~0xff00ff) + (((i_1678_ & 0xff00) * i_1679_ + (i_1681_ & 0xff00) * i_1680_) & 0xff0000)) >> 8;
								}
								i_1637_ += i_1641_;
								i_1638_ += i_1642_;
							}
						} else {
							int i_1682_ = (i_1634_ & 0xff0000) >> 16;
							int i_1683_ = (i_1634_ & 0xff00) >> 8;
							int i_1684_ = i_1634_ & 0xff;
							for (int i_1685_ = -i_1639_; i_1685_ < 0; i_1685_++) {
								for (int i_1686_ = -i_1640_; i_1686_ < 0; i_1686_++) {
									int i_1687_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
									int i_1688_ = ((i_1687_ >>> 24) * (i_1634_ >>> 24) >> 8);
									int i_1689_ = 256 - i_1688_;
									if (i_1688_ != 255) {
										int i_1690_ = ((i_1687_ & 0xff0000) * i_1682_ & ~0xffffff);
										int i_1691_ = ((i_1687_ & 0xff00) * i_1683_ & 0xff0000);
										int i_1692_ = ((i_1687_ & 0xff) * i_1684_ & 0xff00);
										i_1687_ = (i_1690_ | i_1691_ | i_1692_) >>> 8;
										int i_1693_ = is[i_1637_];
										is[i_1637_++] = ((((i_1687_ & 0xff00ff) * i_1688_ + ((i_1693_ & 0xff00ff) * i_1689_)) & ~0xff00ff) + (((i_1687_ & 0xff00) * i_1688_ + ((i_1693_ & 0xff00) * i_1689_)) & 0xff0000)) >> 8;
									} else {
										int i_1694_ = ((i_1687_ & 0xff0000) * i_1682_ & ~0xffffff);
										int i_1695_ = ((i_1687_ & 0xff00) * i_1683_ & 0xff0000);
										int i_1696_ = ((i_1687_ & 0xff) * i_1684_ & 0xff00);
										is[i_1637_++] = (i_1694_ | i_1695_ | i_1696_) >>> 8;
									}
								}
								i_1637_ += i_1641_;
								i_1638_ += i_1642_;
							}
						}
					} else if (i_1633_ == 3) {
						for (int i_1697_ = -i_1639_; i_1697_ < 0; i_1697_++) {
							for (int i_1698_ = -i_1640_; i_1698_ < 0; i_1698_++) {
								int i_1699_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
								int i_1700_ = i_1699_ + i_1634_;
								int i_1701_ = ((i_1699_ & 0xff00ff) + (i_1634_ & 0xff00ff));
								int i_1702_ = ((i_1701_ & 0x1000100) + (i_1700_ - i_1701_ & 0x10000));
								i_1702_ = i_1700_ - i_1702_ | i_1702_ - (i_1702_ >>> 8);
								int i_1703_ = (i_1702_ >>> 24) * (i_1634_ >>> 24) >> 8;
								int i_1704_ = 256 - i_1703_;
								if (i_1703_ != 255) {
									i_1699_ = i_1702_;
									i_1702_ = is[i_1637_];
									i_1702_ = ((((i_1699_ & 0xff00ff) * i_1703_ + (i_1702_ & 0xff00ff) * i_1704_) & ~0xff00ff) + (((i_1699_ & 0xff00) * i_1703_ + (i_1702_ & 0xff00) * i_1704_) & 0xff0000)) >> 8;
								}
								is[i_1637_++] = i_1702_;
							}
							i_1637_ += i_1641_;
							i_1638_ += i_1642_;
						}
					} else if (i_1633_ == 2) {
						int i_1705_ = i_1634_ >>> 24;
						int i_1706_ = 256 - i_1705_;
						int i_1707_ = (i_1634_ & 0xff00ff) * i_1706_ & ~0xff00ff;
						int i_1708_ = (i_1634_ & 0xff00) * i_1706_ & 0xff0000;
						i_1634_ = (i_1707_ | i_1708_) >>> 8;
						for (int i_1709_ = -i_1639_; i_1709_ < 0; i_1709_++) {
							for (int i_1710_ = -i_1640_; i_1710_ < 0; i_1710_++) {
								int i_1711_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
								int i_1712_ = i_1711_ >>> 24;
								int i_1713_ = 256 - i_1712_;
								i_1707_ = ((i_1711_ & 0xff00ff) * i_1705_ & ~0xff00ff);
								i_1708_ = (i_1711_ & 0xff00) * i_1705_ & 0xff0000;
								i_1711_ = ((i_1707_ | i_1708_) >>> 8) + i_1634_;
								int i_1714_ = is[i_1637_];
								is[i_1637_++] = ((((i_1711_ & 0xff00ff) * i_1712_ + (i_1714_ & 0xff00ff) * i_1713_) & ~0xff00ff) + (((i_1711_ & 0xff00) * i_1712_ + (i_1714_ & 0xff00) * i_1713_) & 0xff0000)) >> 8;
							}
							i_1637_ += i_1641_;
							i_1638_ += i_1642_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1635_ == 2) {
					if (i_1633_ == 1) {
						for (int i_1715_ = -i_1639_; i_1715_ < 0; i_1715_++) {
							for (int i_1716_ = -i_1640_; i_1716_ < 0; i_1716_++) {
								int i_1717_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
								if (i_1717_ != 0) {
									int i_1718_ = is[i_1637_];
									int i_1719_ = i_1717_ + i_1718_;
									int i_1720_ = ((i_1717_ & 0xff00ff) + (i_1718_ & 0xff00ff));
									i_1718_ = ((i_1720_ & 0x1000100) + (i_1719_ - i_1720_ & 0x10000));
									is[i_1637_++] = (i_1719_ - i_1718_ | i_1718_ - (i_1718_ >>> 8));
								} else
									i_1637_++;
							}
							i_1637_ += i_1641_;
							i_1638_ += i_1642_;
						}
					} else if (i_1633_ == 0) {
						int i_1721_ = (i_1634_ & 0xff0000) >> 16;
						int i_1722_ = (i_1634_ & 0xff00) >> 8;
						int i_1723_ = i_1634_ & 0xff;
						for (int i_1724_ = -i_1639_; i_1724_ < 0; i_1724_++) {
							for (int i_1725_ = -i_1640_; i_1725_ < 0; i_1725_++) {
								int i_1726_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
								if (i_1726_ != 0) {
									int i_1727_ = ((i_1726_ & 0xff0000) * i_1721_ & ~0xffffff);
									int i_1728_ = ((i_1726_ & 0xff00) * i_1722_ & 0xff0000);
									int i_1729_ = (i_1726_ & 0xff) * i_1723_ & 0xff00;
									i_1726_ = (i_1727_ | i_1728_ | i_1729_) >>> 8;
									int i_1730_ = is[i_1637_];
									int i_1731_ = i_1726_ + i_1730_;
									int i_1732_ = ((i_1726_ & 0xff00ff) + (i_1730_ & 0xff00ff));
									i_1730_ = ((i_1732_ & 0x1000100) + (i_1731_ - i_1732_ & 0x10000));
									is[i_1637_++] = (i_1731_ - i_1730_ | i_1730_ - (i_1730_ >>> 8));
								} else
									i_1637_++;
							}
							i_1637_ += i_1641_;
							i_1638_ += i_1642_;
						}
					} else if (i_1633_ == 3) {
						for (int i_1733_ = -i_1639_; i_1733_ < 0; i_1733_++) {
							for (int i_1734_ = -i_1640_; i_1734_ < 0; i_1734_++) {
								int i_1735_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
								int i_1736_ = i_1735_ + i_1634_;
								int i_1737_ = ((i_1735_ & 0xff00ff) + (i_1634_ & 0xff00ff));
								int i_1738_ = ((i_1737_ & 0x1000100) + (i_1736_ - i_1737_ & 0x10000));
								i_1735_ = i_1736_ - i_1738_ | i_1738_ - (i_1738_ >>> 8);
								i_1738_ = is[i_1637_];
								i_1736_ = i_1735_ + i_1738_;
								i_1737_ = (i_1735_ & 0xff00ff) + (i_1738_ & 0xff00ff);
								i_1738_ = ((i_1737_ & 0x1000100) + (i_1736_ - i_1737_ & 0x10000));
								is[i_1637_++] = i_1736_ - i_1738_ | i_1738_ - (i_1738_ >>> 8);
							}
							i_1637_ += i_1641_;
							i_1638_ += i_1642_;
						}
					} else if (i_1633_ == 2) {
						int i_1739_ = i_1634_ >>> 24;
						int i_1740_ = 256 - i_1739_;
						int i_1741_ = (i_1634_ & 0xff00ff) * i_1740_ & ~0xff00ff;
						int i_1742_ = (i_1634_ & 0xff00) * i_1740_ & 0xff0000;
						i_1634_ = (i_1741_ | i_1742_) >>> 8;
						for (int i_1743_ = -i_1639_; i_1743_ < 0; i_1743_++) {
							for (int i_1744_ = -i_1640_; i_1744_ < 0; i_1744_++) {
								int i_1745_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1638_++]);
								if (i_1745_ != 0) {
									i_1741_ = ((i_1745_ & 0xff00ff) * i_1739_ & ~0xff00ff);
									i_1742_ = ((i_1745_ & 0xff00) * i_1739_ & 0xff0000);
									i_1745_ = (((i_1741_ | i_1742_) >>> 8) + i_1634_);
									int i_1746_ = is[i_1637_];
									int i_1747_ = i_1745_ + i_1746_;
									int i_1748_ = ((i_1745_ & 0xff00ff) + (i_1746_ & 0xff00ff));
									i_1746_ = ((i_1748_ & 0x1000100) + (i_1747_ - i_1748_ & 0x10000));
									is[i_1637_++] = (i_1747_ - i_1746_ | i_1746_ - (i_1746_ >>> 8));
								} else
									i_1637_++;
							}
							i_1637_ += i_1641_;
							i_1638_ += i_1642_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method650(int i, int i_1749_, Class_ta class_ta, int i_1750_, int i_1751_) {
		if (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			i += ((Class57_Sub1_Sub1) this).anInt8990;
			i_1749_ += ((Class57_Sub1_Sub1) this).anInt9000;
			int i_1752_ = 0;
			int i_1753_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			int i_1754_ = ((Class57_Sub1_Sub1) this).anInt9010;
			int i_1755_ = ((Class57_Sub1_Sub1) this).anInt8989;
			int i_1756_ = i_1753_ - i_1754_;
			int i_1757_ = 0;
			int i_1758_ = i + i_1749_ * i_1753_;
			if (i_1749_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_1759_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_1749_);
				i_1755_ -= i_1759_;
				i_1749_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_1752_ += i_1759_ * i_1754_;
				i_1758_ += i_1759_ * i_1753_;
			}
			if (i_1749_ + i_1755_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_1755_ -= (i_1749_ + i_1755_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_1760_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_1754_ -= i_1760_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_1752_ += i_1760_;
				i_1758_ += i_1760_;
				i_1757_ += i_1760_;
				i_1756_ += i_1760_;
			}
			if (i + i_1754_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_1761_ = (i + i_1754_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_1754_ -= i_1761_;
				i_1757_ += i_1761_;
				i_1756_ += i_1761_;
			}
			if (i_1754_ > 0 && i_1755_ > 0) {
				Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
				int[] is_1762_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
				int[] is_1763_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
				int i_1764_ = i_1749_;
				if (i_1751_ > i_1764_) {
					i_1764_ = i_1751_;
					i_1758_ += (i_1751_ - i_1749_) * i_1753_;
					i_1752_ += ((i_1751_ - i_1749_) * ((Class57_Sub1_Sub1) this).anInt9010);
				}
				int i_1765_ = (i_1751_ + is_1762_.length < i_1749_ + i_1755_ ? i_1751_ + is_1762_.length : i_1749_ + i_1755_);
				for (int i_1766_ = i_1764_; i_1766_ < i_1765_; i_1766_++) {
					int i_1767_ = is_1762_[i_1766_ - i_1751_] + i_1750_;
					int i_1768_ = is_1763_[i_1766_ - i_1751_];
					int i_1769_ = i_1754_;
					if (i > i_1767_) {
						int i_1770_ = i - i_1767_;
						if (i_1770_ >= i_1768_) {
							i_1752_ += i_1754_ + i_1757_;
							i_1758_ += i_1754_ + i_1756_;
							continue;
						}
						i_1768_ -= i_1770_;
					} else {
						int i_1771_ = i_1767_ - i;
						if (i_1771_ >= i_1754_) {
							i_1752_ += i_1754_ + i_1757_;
							i_1758_ += i_1754_ + i_1756_;
							continue;
						}
						i_1752_ += i_1771_;
						i_1769_ -= i_1771_;
						i_1758_ += i_1771_;
					}
					int i_1772_ = 0;
					if (i_1769_ < i_1768_)
						i_1768_ = i_1769_;
					else
						i_1772_ = i_1769_ - i_1768_;
					for (int i_1773_ = -i_1768_; i_1773_ < 0; i_1773_++) {
						int i_1774_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1752_++]);
						int i_1775_ = i_1774_ >>> 24;
						int i_1776_ = 256 - i_1775_;
						int i_1777_ = is[i_1758_];
						is[i_1758_++] = ((((i_1774_ & 0xff00ff) * i_1775_ + (i_1777_ & 0xff00ff) * i_1776_) & ~0xff00ff) + (((i_1774_ & 0xff00) * i_1775_ + (i_1777_ & 0xff00) * i_1776_) & 0xff0000)) >> 8;
					}
					i_1752_ += i_1772_ + i_1757_;
					i_1758_ += i_1772_ + i_1756_;
				}
			}
		}
	}

	void method680(int i, int i_1778_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_1779_ = anInt9001;
					while (i_1779_ < 0) {
						int i_1780_ = anInt9003;
						int i_1781_ = anInt8988;
						int i_1782_ = anInt9011;
						int i_1783_ = anInt8999;
						if (i_1781_ >= 0 && i_1782_ >= 0 && i_1781_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) < 0 && i_1782_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) < 0) {
							for (/**/; i_1783_ < 0; i_1783_++) {
								int i_1784_ = (((i_1782_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_1781_ >> 12));
								int i_1785_ = i_1780_++;
								if (i_1778_ == 0) {
									if (i == 1)
										is[i_1785_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1784_]);
									else if (i == 0) {
										int i_1786_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1784_++]);
										int i_1787_ = ((i_1786_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1788_ = ((i_1786_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1789_ = ((i_1786_ & 0xff) * anInt9019 & 0xff00);
										is[i_1785_] = (i_1787_ | i_1788_ | i_1789_) >>> 8;
									} else if (i == 3) {
										int i_1790_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1784_++]);
										int i_1791_ = anInt9014;
										int i_1792_ = i_1790_ + i_1791_;
										int i_1793_ = ((i_1790_ & 0xff00ff) + (i_1791_ & 0xff00ff));
										int i_1794_ = ((i_1793_ & 0x1000100) + (i_1792_ - i_1793_ & 0x10000));
										is[i_1785_] = (i_1792_ - i_1794_ | i_1794_ - (i_1794_ >>> 8));
									} else if (i == 2) {
										int i_1795_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1784_]);
										int i_1796_ = ((i_1795_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1797_ = ((i_1795_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_1785_] = ((i_1796_ | i_1797_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_1778_ == 1) {
									if (i == 1) {
										int i_1798_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1784_]);
										int i_1799_ = i_1798_ >>> 24;
										int i_1800_ = 256 - i_1799_;
										int i_1801_ = is[i_1785_];
										is[i_1785_] = ((((i_1798_ & 0xff00ff) * i_1799_ + ((i_1801_ & 0xff00ff) * i_1800_)) & ~0xff00ff) + (((i_1798_ & 0xff00) * i_1799_ + ((i_1801_ & 0xff00) * i_1800_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_1802_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1784_]);
										int i_1803_ = ((i_1802_ >>> 24) * anInt9015 >> 8);
										int i_1804_ = 256 - i_1803_;
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_1805_ = is[i_1785_];
											is[i_1785_] = (((((i_1802_ & 0xff00ff) * i_1803_) + ((i_1805_ & 0xff00ff) * i_1804_)) & ~0xff00ff) + ((((i_1802_ & 0xff00) * i_1803_) + ((i_1805_ & 0xff00) * i_1804_)) & 0xff0000)) >> 8;
										} else if (i_1803_ != 255) {
											int i_1806_ = (((i_1802_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_1807_ = (((i_1802_ & 0xff00) * anInt9018) & 0xff0000);
											int i_1808_ = ((i_1802_ & 0xff) * anInt9019 & 0xff00);
											i_1802_ = (i_1806_ | i_1807_ | i_1808_) >>> 8;
											int i_1809_ = is[i_1785_];
											is[i_1785_] = (((((i_1802_ & 0xff00ff) * i_1803_) + ((i_1809_ & 0xff00ff) * i_1804_)) & ~0xff00ff) + ((((i_1802_ & 0xff00) * i_1803_) + ((i_1809_ & 0xff00) * i_1804_)) & 0xff0000)) >> 8;
										} else {
											int i_1810_ = (((i_1802_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_1811_ = (((i_1802_ & 0xff00) * anInt9018) & 0xff0000);
											int i_1812_ = ((i_1802_ & 0xff) * anInt9019 & 0xff00);
											is[i_1785_] = (i_1810_ | i_1811_ | i_1812_) >>> 8;
										}
									} else if (i == 3) {
										int i_1813_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1784_]);
										int i_1814_ = anInt9014;
										int i_1815_ = i_1813_ + i_1814_;
										int i_1816_ = ((i_1813_ & 0xff00ff) + (i_1814_ & 0xff00ff));
										int i_1817_ = ((i_1816_ & 0x1000100) + (i_1815_ - i_1816_ & 0x10000));
										i_1817_ = (i_1815_ - i_1817_ | i_1817_ - (i_1817_ >>> 8));
										int i_1818_ = ((i_1813_ >>> 24) * anInt9015 >> 8);
										int i_1819_ = 256 - i_1818_;
										if (i_1818_ != 255) {
											i_1813_ = i_1817_;
											i_1817_ = is[i_1785_];
											i_1817_ = (((((i_1813_ & 0xff00ff) * i_1818_) + ((i_1817_ & 0xff00ff) * i_1819_)) & ~0xff00ff) + ((((i_1813_ & 0xff00) * i_1818_) + ((i_1817_ & 0xff00) * i_1819_)) & 0xff0000)) >> 8;
										}
										is[i_1785_] = i_1817_;
									} else if (i == 2) {
										int i_1820_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1784_]);
										int i_1821_ = i_1820_ >>> 24;
										int i_1822_ = 256 - i_1821_;
										int i_1823_ = ((i_1820_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1824_ = ((i_1820_ & 0xff00) * anInt9015 & 0xff0000);
										i_1820_ = (((i_1823_ | i_1824_) >>> 8) + anInt9022);
										int i_1825_ = is[i_1785_];
										is[i_1785_] = ((((i_1820_ & 0xff00ff) * i_1821_ + ((i_1825_ & 0xff00ff) * i_1822_)) & ~0xff00ff) + (((i_1820_ & 0xff00) * i_1821_ + ((i_1825_ & 0xff00) * i_1822_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_1778_ == 2) {
									if (i == 1) {
										int i_1826_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1784_]);
										int i_1827_ = is[i_1785_];
										int i_1828_ = i_1826_ + i_1827_;
										int i_1829_ = ((i_1826_ & 0xff00ff) + (i_1827_ & 0xff00ff));
										i_1827_ = ((i_1829_ & 0x1000100) + (i_1828_ - i_1829_ & 0x10000));
										is[i_1785_] = (i_1828_ - i_1827_ | i_1827_ - (i_1827_ >>> 8));
									} else if (i == 0) {
										int i_1830_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1784_]);
										int i_1831_ = ((i_1830_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1832_ = ((i_1830_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1833_ = ((i_1830_ & 0xff) * anInt9019 & 0xff00);
										i_1830_ = (i_1831_ | i_1832_ | i_1833_) >>> 8;
										int i_1834_ = is[i_1785_];
										int i_1835_ = i_1830_ + i_1834_;
										int i_1836_ = ((i_1830_ & 0xff00ff) + (i_1834_ & 0xff00ff));
										i_1834_ = ((i_1836_ & 0x1000100) + (i_1835_ - i_1836_ & 0x10000));
										is[i_1785_] = (i_1835_ - i_1834_ | i_1834_ - (i_1834_ >>> 8));
									} else if (i == 3) {
										int i_1837_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1784_]);
										int i_1838_ = anInt9014;
										int i_1839_ = i_1837_ + i_1838_;
										int i_1840_ = ((i_1837_ & 0xff00ff) + (i_1838_ & 0xff00ff));
										int i_1841_ = ((i_1840_ & 0x1000100) + (i_1839_ - i_1840_ & 0x10000));
										i_1837_ = (i_1839_ - i_1841_ | i_1841_ - (i_1841_ >>> 8));
										i_1841_ = is[i_1785_];
										i_1839_ = i_1837_ + i_1841_;
										i_1840_ = ((i_1837_ & 0xff00ff) + (i_1841_ & 0xff00ff));
										i_1841_ = ((i_1840_ & 0x1000100) + (i_1839_ - i_1840_ & 0x10000));
										is[i_1785_] = (i_1839_ - i_1841_ | i_1841_ - (i_1841_ >>> 8));
									} else if (i == 2) {
										int i_1842_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1784_]);
										int i_1843_ = ((i_1842_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1844_ = ((i_1842_ & 0xff00) * anInt9015 & 0xff0000);
										i_1842_ = (((i_1843_ | i_1844_) >>> 8) + anInt9022);
										int i_1845_ = is[i_1785_];
										int i_1846_ = i_1842_ + i_1845_;
										int i_1847_ = ((i_1842_ & 0xff00ff) + (i_1845_ & 0xff00ff));
										i_1845_ = ((i_1847_ & 0x1000100) + (i_1846_ - i_1847_ & 0x10000));
										is[i_1785_] = (i_1846_ - i_1845_ | i_1845_ - (i_1845_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_1779_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_1848_ = anInt9001;
					while (i_1848_ < 0) {
						int i_1849_ = anInt9003;
						int i_1850_ = anInt8988;
						int i_1851_ = anInt9011 + anInt9013;
						int i_1852_ = anInt8999;
						if (i_1850_ >= 0 && i_1850_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) < 0) {
							int i_1853_;
							if ((i_1853_ = (i_1851_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12))) >= 0) {
								i_1853_ = (anInt8991 - i_1853_) / anInt8991;
								i_1852_ += i_1853_;
								i_1851_ += anInt8991 * i_1853_;
								i_1849_ += i_1853_;
							}
							if ((i_1853_ = (i_1851_ - anInt8991) / anInt8991) > i_1852_)
								i_1852_ = i_1853_;
							for (/**/; i_1852_ < 0; i_1852_++) {
								int i_1854_ = (((i_1851_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_1850_ >> 12));
								int i_1855_ = i_1849_++;
								if (i_1778_ == 0) {
									if (i == 1)
										is[i_1855_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1854_]);
									else if (i == 0) {
										int i_1856_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1854_++]);
										int i_1857_ = ((i_1856_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1858_ = ((i_1856_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1859_ = ((i_1856_ & 0xff) * anInt9019 & 0xff00);
										is[i_1855_] = (i_1857_ | i_1858_ | i_1859_) >>> 8;
									} else if (i == 3) {
										int i_1860_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1854_++]);
										int i_1861_ = anInt9014;
										int i_1862_ = i_1860_ + i_1861_;
										int i_1863_ = ((i_1860_ & 0xff00ff) + (i_1861_ & 0xff00ff));
										int i_1864_ = ((i_1863_ & 0x1000100) + (i_1862_ - i_1863_ & 0x10000));
										is[i_1855_] = (i_1862_ - i_1864_ | i_1864_ - (i_1864_ >>> 8));
									} else if (i == 2) {
										int i_1865_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1854_]);
										int i_1866_ = ((i_1865_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1867_ = ((i_1865_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_1855_] = ((i_1866_ | i_1867_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_1778_ == 1) {
									if (i == 1) {
										int i_1868_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1854_]);
										int i_1869_ = i_1868_ >>> 24;
										int i_1870_ = 256 - i_1869_;
										int i_1871_ = is[i_1855_];
										is[i_1855_] = ((((i_1868_ & 0xff00ff) * i_1869_ + ((i_1871_ & 0xff00ff) * i_1870_)) & ~0xff00ff) + (((i_1868_ & 0xff00) * i_1869_ + ((i_1871_ & 0xff00) * i_1870_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_1872_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1854_]);
										int i_1873_ = ((i_1872_ >>> 24) * anInt9015 >> 8);
										int i_1874_ = 256 - i_1873_;
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_1875_ = is[i_1855_];
											is[i_1855_] = (((((i_1872_ & 0xff00ff) * i_1873_) + ((i_1875_ & 0xff00ff) * i_1874_)) & ~0xff00ff) + ((((i_1872_ & 0xff00) * i_1873_) + ((i_1875_ & 0xff00) * i_1874_)) & 0xff0000)) >> 8;
										} else if (i_1873_ != 255) {
											int i_1876_ = (((i_1872_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_1877_ = (((i_1872_ & 0xff00) * anInt9018) & 0xff0000);
											int i_1878_ = ((i_1872_ & 0xff) * anInt9019 & 0xff00);
											i_1872_ = (i_1876_ | i_1877_ | i_1878_) >>> 8;
											int i_1879_ = is[i_1855_];
											is[i_1855_] = (((((i_1872_ & 0xff00ff) * i_1873_) + ((i_1879_ & 0xff00ff) * i_1874_)) & ~0xff00ff) + ((((i_1872_ & 0xff00) * i_1873_) + ((i_1879_ & 0xff00) * i_1874_)) & 0xff0000)) >> 8;
										} else {
											int i_1880_ = (((i_1872_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_1881_ = (((i_1872_ & 0xff00) * anInt9018) & 0xff0000);
											int i_1882_ = ((i_1872_ & 0xff) * anInt9019 & 0xff00);
											is[i_1855_] = (i_1880_ | i_1881_ | i_1882_) >>> 8;
										}
									} else if (i == 3) {
										int i_1883_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1854_]);
										int i_1884_ = anInt9014;
										int i_1885_ = i_1883_ + i_1884_;
										int i_1886_ = ((i_1883_ & 0xff00ff) + (i_1884_ & 0xff00ff));
										int i_1887_ = ((i_1886_ & 0x1000100) + (i_1885_ - i_1886_ & 0x10000));
										i_1887_ = (i_1885_ - i_1887_ | i_1887_ - (i_1887_ >>> 8));
										int i_1888_ = ((i_1883_ >>> 24) * anInt9015 >> 8);
										int i_1889_ = 256 - i_1888_;
										if (i_1888_ != 255) {
											i_1883_ = i_1887_;
											i_1887_ = is[i_1855_];
											i_1887_ = (((((i_1883_ & 0xff00ff) * i_1888_) + ((i_1887_ & 0xff00ff) * i_1889_)) & ~0xff00ff) + ((((i_1883_ & 0xff00) * i_1888_) + ((i_1887_ & 0xff00) * i_1889_)) & 0xff0000)) >> 8;
										}
										is[i_1855_] = i_1887_;
									} else if (i == 2) {
										int i_1890_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1854_]);
										int i_1891_ = i_1890_ >>> 24;
										int i_1892_ = 256 - i_1891_;
										int i_1893_ = ((i_1890_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1894_ = ((i_1890_ & 0xff00) * anInt9015 & 0xff0000);
										i_1890_ = (((i_1893_ | i_1894_) >>> 8) + anInt9022);
										int i_1895_ = is[i_1855_];
										is[i_1855_] = ((((i_1890_ & 0xff00ff) * i_1891_ + ((i_1895_ & 0xff00ff) * i_1892_)) & ~0xff00ff) + (((i_1890_ & 0xff00) * i_1891_ + ((i_1895_ & 0xff00) * i_1892_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_1778_ == 2) {
									if (i == 1) {
										int i_1896_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1854_]);
										int i_1897_ = is[i_1855_];
										int i_1898_ = i_1896_ + i_1897_;
										int i_1899_ = ((i_1896_ & 0xff00ff) + (i_1897_ & 0xff00ff));
										i_1897_ = ((i_1899_ & 0x1000100) + (i_1898_ - i_1899_ & 0x10000));
										is[i_1855_] = (i_1898_ - i_1897_ | i_1897_ - (i_1897_ >>> 8));
									} else if (i == 0) {
										int i_1900_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1854_]);
										int i_1901_ = ((i_1900_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1902_ = ((i_1900_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1903_ = ((i_1900_ & 0xff) * anInt9019 & 0xff00);
										i_1900_ = (i_1901_ | i_1902_ | i_1903_) >>> 8;
										int i_1904_ = is[i_1855_];
										int i_1905_ = i_1900_ + i_1904_;
										int i_1906_ = ((i_1900_ & 0xff00ff) + (i_1904_ & 0xff00ff));
										i_1904_ = ((i_1906_ & 0x1000100) + (i_1905_ - i_1906_ & 0x10000));
										is[i_1855_] = (i_1905_ - i_1904_ | i_1904_ - (i_1904_ >>> 8));
									} else if (i == 3) {
										int i_1907_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1854_]);
										int i_1908_ = anInt9014;
										int i_1909_ = i_1907_ + i_1908_;
										int i_1910_ = ((i_1907_ & 0xff00ff) + (i_1908_ & 0xff00ff));
										int i_1911_ = ((i_1910_ & 0x1000100) + (i_1909_ - i_1910_ & 0x10000));
										i_1907_ = (i_1909_ - i_1911_ | i_1911_ - (i_1911_ >>> 8));
										i_1911_ = is[i_1855_];
										i_1909_ = i_1907_ + i_1911_;
										i_1910_ = ((i_1907_ & 0xff00ff) + (i_1911_ & 0xff00ff));
										i_1911_ = ((i_1910_ & 0x1000100) + (i_1909_ - i_1910_ & 0x10000));
										is[i_1855_] = (i_1909_ - i_1911_ | i_1911_ - (i_1911_ >>> 8));
									} else if (i == 2) {
										int i_1912_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1854_]);
										int i_1913_ = ((i_1912_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1914_ = ((i_1912_ & 0xff00) * anInt9015 & 0xff0000);
										i_1912_ = (((i_1913_ | i_1914_) >>> 8) + anInt9022);
										int i_1915_ = is[i_1855_];
										int i_1916_ = i_1912_ + i_1915_;
										int i_1917_ = ((i_1912_ & 0xff00ff) + (i_1915_ & 0xff00ff));
										i_1915_ = ((i_1917_ & 0x1000100) + (i_1916_ - i_1917_ & 0x10000));
										is[i_1855_] = (i_1916_ - i_1915_ | i_1915_ - (i_1915_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_1851_ += anInt8991;
							}
						}
						i_1848_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_1918_ = anInt9001;
					while (i_1918_ < 0) {
						int i_1919_ = anInt9003;
						int i_1920_ = anInt8988;
						int i_1921_ = anInt9011 + anInt9013;
						int i_1922_ = anInt8999;
						if (i_1920_ >= 0 && i_1920_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) < 0) {
							if (i_1921_ < 0) {
								int i_1923_ = (anInt8991 - 1 - i_1921_) / anInt8991;
								i_1922_ += i_1923_;
								i_1921_ += anInt8991 * i_1923_;
								i_1919_ += i_1923_;
							}
							int i_1924_;
							if ((i_1924_ = (1 + i_1921_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_1922_)
								i_1922_ = i_1924_;
							for (/**/; i_1922_ < 0; i_1922_++) {
								int i_1925_ = (((i_1921_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_1920_ >> 12));
								int i_1926_ = i_1919_++;
								if (i_1778_ == 0) {
									if (i == 1)
										is[i_1926_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1925_]);
									else if (i == 0) {
										int i_1927_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1925_++]);
										int i_1928_ = ((i_1927_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1929_ = ((i_1927_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1930_ = ((i_1927_ & 0xff) * anInt9019 & 0xff00);
										is[i_1926_] = (i_1928_ | i_1929_ | i_1930_) >>> 8;
									} else if (i == 3) {
										int i_1931_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1925_++]);
										int i_1932_ = anInt9014;
										int i_1933_ = i_1931_ + i_1932_;
										int i_1934_ = ((i_1931_ & 0xff00ff) + (i_1932_ & 0xff00ff));
										int i_1935_ = ((i_1934_ & 0x1000100) + (i_1933_ - i_1934_ & 0x10000));
										is[i_1926_] = (i_1933_ - i_1935_ | i_1935_ - (i_1935_ >>> 8));
									} else if (i == 2) {
										int i_1936_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1925_]);
										int i_1937_ = ((i_1936_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1938_ = ((i_1936_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_1926_] = ((i_1937_ | i_1938_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_1778_ == 1) {
									if (i == 1) {
										int i_1939_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1925_]);
										int i_1940_ = i_1939_ >>> 24;
										int i_1941_ = 256 - i_1940_;
										int i_1942_ = is[i_1926_];
										is[i_1926_] = ((((i_1939_ & 0xff00ff) * i_1940_ + ((i_1942_ & 0xff00ff) * i_1941_)) & ~0xff00ff) + (((i_1939_ & 0xff00) * i_1940_ + ((i_1942_ & 0xff00) * i_1941_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_1943_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1925_]);
										int i_1944_ = ((i_1943_ >>> 24) * anInt9015 >> 8);
										int i_1945_ = 256 - i_1944_;
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_1946_ = is[i_1926_];
											is[i_1926_] = (((((i_1943_ & 0xff00ff) * i_1944_) + ((i_1946_ & 0xff00ff) * i_1945_)) & ~0xff00ff) + ((((i_1943_ & 0xff00) * i_1944_) + ((i_1946_ & 0xff00) * i_1945_)) & 0xff0000)) >> 8;
										} else if (i_1944_ != 255) {
											int i_1947_ = (((i_1943_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_1948_ = (((i_1943_ & 0xff00) * anInt9018) & 0xff0000);
											int i_1949_ = ((i_1943_ & 0xff) * anInt9019 & 0xff00);
											i_1943_ = (i_1947_ | i_1948_ | i_1949_) >>> 8;
											int i_1950_ = is[i_1926_];
											is[i_1926_] = (((((i_1943_ & 0xff00ff) * i_1944_) + ((i_1950_ & 0xff00ff) * i_1945_)) & ~0xff00ff) + ((((i_1943_ & 0xff00) * i_1944_) + ((i_1950_ & 0xff00) * i_1945_)) & 0xff0000)) >> 8;
										} else {
											int i_1951_ = (((i_1943_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_1952_ = (((i_1943_ & 0xff00) * anInt9018) & 0xff0000);
											int i_1953_ = ((i_1943_ & 0xff) * anInt9019 & 0xff00);
											is[i_1926_] = (i_1951_ | i_1952_ | i_1953_) >>> 8;
										}
									} else if (i == 3) {
										int i_1954_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1925_]);
										int i_1955_ = anInt9014;
										int i_1956_ = i_1954_ + i_1955_;
										int i_1957_ = ((i_1954_ & 0xff00ff) + (i_1955_ & 0xff00ff));
										int i_1958_ = ((i_1957_ & 0x1000100) + (i_1956_ - i_1957_ & 0x10000));
										i_1958_ = (i_1956_ - i_1958_ | i_1958_ - (i_1958_ >>> 8));
										int i_1959_ = ((i_1954_ >>> 24) * anInt9015 >> 8);
										int i_1960_ = 256 - i_1959_;
										if (i_1959_ != 255) {
											i_1954_ = i_1958_;
											i_1958_ = is[i_1926_];
											i_1958_ = (((((i_1954_ & 0xff00ff) * i_1959_) + ((i_1958_ & 0xff00ff) * i_1960_)) & ~0xff00ff) + ((((i_1954_ & 0xff00) * i_1959_) + ((i_1958_ & 0xff00) * i_1960_)) & 0xff0000)) >> 8;
										}
										is[i_1926_] = i_1958_;
									} else if (i == 2) {
										int i_1961_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1925_]);
										int i_1962_ = i_1961_ >>> 24;
										int i_1963_ = 256 - i_1962_;
										int i_1964_ = ((i_1961_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1965_ = ((i_1961_ & 0xff00) * anInt9015 & 0xff0000);
										i_1961_ = (((i_1964_ | i_1965_) >>> 8) + anInt9022);
										int i_1966_ = is[i_1926_];
										is[i_1926_] = ((((i_1961_ & 0xff00ff) * i_1962_ + ((i_1966_ & 0xff00ff) * i_1963_)) & ~0xff00ff) + (((i_1961_ & 0xff00) * i_1962_ + ((i_1966_ & 0xff00) * i_1963_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_1778_ == 2) {
									if (i == 1) {
										int i_1967_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1925_]);
										int i_1968_ = is[i_1926_];
										int i_1969_ = i_1967_ + i_1968_;
										int i_1970_ = ((i_1967_ & 0xff00ff) + (i_1968_ & 0xff00ff));
										i_1968_ = ((i_1970_ & 0x1000100) + (i_1969_ - i_1970_ & 0x10000));
										is[i_1926_] = (i_1969_ - i_1968_ | i_1968_ - (i_1968_ >>> 8));
									} else if (i == 0) {
										int i_1971_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1925_]);
										int i_1972_ = ((i_1971_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1973_ = ((i_1971_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1974_ = ((i_1971_ & 0xff) * anInt9019 & 0xff00);
										i_1971_ = (i_1972_ | i_1973_ | i_1974_) >>> 8;
										int i_1975_ = is[i_1926_];
										int i_1976_ = i_1971_ + i_1975_;
										int i_1977_ = ((i_1971_ & 0xff00ff) + (i_1975_ & 0xff00ff));
										i_1975_ = ((i_1977_ & 0x1000100) + (i_1976_ - i_1977_ & 0x10000));
										is[i_1926_] = (i_1976_ - i_1975_ | i_1975_ - (i_1975_ >>> 8));
									} else if (i == 3) {
										int i_1978_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1925_]);
										int i_1979_ = anInt9014;
										int i_1980_ = i_1978_ + i_1979_;
										int i_1981_ = ((i_1978_ & 0xff00ff) + (i_1979_ & 0xff00ff));
										int i_1982_ = ((i_1981_ & 0x1000100) + (i_1980_ - i_1981_ & 0x10000));
										i_1978_ = (i_1980_ - i_1982_ | i_1982_ - (i_1982_ >>> 8));
										i_1982_ = is[i_1926_];
										i_1980_ = i_1978_ + i_1982_;
										i_1981_ = ((i_1978_ & 0xff00ff) + (i_1982_ & 0xff00ff));
										i_1982_ = ((i_1981_ & 0x1000100) + (i_1980_ - i_1981_ & 0x10000));
										is[i_1926_] = (i_1980_ - i_1982_ | i_1982_ - (i_1982_ >>> 8));
									} else if (i == 2) {
										int i_1983_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1925_]);
										int i_1984_ = ((i_1983_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1985_ = ((i_1983_ & 0xff00) * anInt9015 & 0xff0000);
										i_1983_ = (((i_1984_ | i_1985_) >>> 8) + anInt9022);
										int i_1986_ = is[i_1926_];
										int i_1987_ = i_1983_ + i_1986_;
										int i_1988_ = ((i_1983_ & 0xff00ff) + (i_1986_ & 0xff00ff));
										i_1986_ = ((i_1988_ & 0x1000100) + (i_1987_ - i_1988_ & 0x10000));
										is[i_1926_] = (i_1987_ - i_1986_ | i_1986_ - (i_1986_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_1921_ += anInt8991;
							}
						}
						i_1918_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_1989_ = anInt9001;
					while (i_1989_ < 0) {
						int i_1990_ = anInt9003;
						int i_1991_ = anInt8988 + anInt9012;
						int i_1992_ = anInt9011;
						int i_1993_ = anInt8999;
						if (i_1992_ >= 0 && i_1992_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) < 0) {
							int i_1994_;
							if ((i_1994_ = (i_1991_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12))) >= 0) {
								i_1994_ = (anInt9004 - i_1994_) / anInt9004;
								i_1993_ += i_1994_;
								i_1991_ += anInt9004 * i_1994_;
								i_1990_ += i_1994_;
							}
							if ((i_1994_ = (i_1991_ - anInt9004) / anInt9004) > i_1993_)
								i_1993_ = i_1994_;
							for (/**/; i_1993_ < 0; i_1993_++) {
								int i_1995_ = (((i_1992_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_1991_ >> 12));
								int i_1996_ = i_1990_++;
								if (i_1778_ == 0) {
									if (i == 1)
										is[i_1996_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1995_]);
									else if (i == 0) {
										int i_1997_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1995_++]);
										int i_1998_ = ((i_1997_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1999_ = ((i_1997_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2000_ = ((i_1997_ & 0xff) * anInt9019 & 0xff00);
										is[i_1996_] = (i_1998_ | i_1999_ | i_2000_) >>> 8;
									} else if (i == 3) {
										int i_2001_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1995_++]);
										int i_2002_ = anInt9014;
										int i_2003_ = i_2001_ + i_2002_;
										int i_2004_ = ((i_2001_ & 0xff00ff) + (i_2002_ & 0xff00ff));
										int i_2005_ = ((i_2004_ & 0x1000100) + (i_2003_ - i_2004_ & 0x10000));
										is[i_1996_] = (i_2003_ - i_2005_ | i_2005_ - (i_2005_ >>> 8));
									} else if (i == 2) {
										int i_2006_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1995_]);
										int i_2007_ = ((i_2006_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2008_ = ((i_2006_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_1996_] = ((i_2007_ | i_2008_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_1778_ == 1) {
									if (i == 1) {
										int i_2009_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1995_]);
										int i_2010_ = i_2009_ >>> 24;
										int i_2011_ = 256 - i_2010_;
										int i_2012_ = is[i_1996_];
										is[i_1996_] = ((((i_2009_ & 0xff00ff) * i_2010_ + ((i_2012_ & 0xff00ff) * i_2011_)) & ~0xff00ff) + (((i_2009_ & 0xff00) * i_2010_ + ((i_2012_ & 0xff00) * i_2011_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_2013_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1995_]);
										int i_2014_ = ((i_2013_ >>> 24) * anInt9015 >> 8);
										int i_2015_ = 256 - i_2014_;
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_2016_ = is[i_1996_];
											is[i_1996_] = (((((i_2013_ & 0xff00ff) * i_2014_) + ((i_2016_ & 0xff00ff) * i_2015_)) & ~0xff00ff) + ((((i_2013_ & 0xff00) * i_2014_) + ((i_2016_ & 0xff00) * i_2015_)) & 0xff0000)) >> 8;
										} else if (i_2014_ != 255) {
											int i_2017_ = (((i_2013_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2018_ = (((i_2013_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2019_ = ((i_2013_ & 0xff) * anInt9019 & 0xff00);
											i_2013_ = (i_2017_ | i_2018_ | i_2019_) >>> 8;
											int i_2020_ = is[i_1996_];
											is[i_1996_] = (((((i_2013_ & 0xff00ff) * i_2014_) + ((i_2020_ & 0xff00ff) * i_2015_)) & ~0xff00ff) + ((((i_2013_ & 0xff00) * i_2014_) + ((i_2020_ & 0xff00) * i_2015_)) & 0xff0000)) >> 8;
										} else {
											int i_2021_ = (((i_2013_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2022_ = (((i_2013_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2023_ = ((i_2013_ & 0xff) * anInt9019 & 0xff00);
											is[i_1996_] = (i_2021_ | i_2022_ | i_2023_) >>> 8;
										}
									} else if (i == 3) {
										int i_2024_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1995_]);
										int i_2025_ = anInt9014;
										int i_2026_ = i_2024_ + i_2025_;
										int i_2027_ = ((i_2024_ & 0xff00ff) + (i_2025_ & 0xff00ff));
										int i_2028_ = ((i_2027_ & 0x1000100) + (i_2026_ - i_2027_ & 0x10000));
										i_2028_ = (i_2026_ - i_2028_ | i_2028_ - (i_2028_ >>> 8));
										int i_2029_ = ((i_2024_ >>> 24) * anInt9015 >> 8);
										int i_2030_ = 256 - i_2029_;
										if (i_2029_ != 255) {
											i_2024_ = i_2028_;
											i_2028_ = is[i_1996_];
											i_2028_ = (((((i_2024_ & 0xff00ff) * i_2029_) + ((i_2028_ & 0xff00ff) * i_2030_)) & ~0xff00ff) + ((((i_2024_ & 0xff00) * i_2029_) + ((i_2028_ & 0xff00) * i_2030_)) & 0xff0000)) >> 8;
										}
										is[i_1996_] = i_2028_;
									} else if (i == 2) {
										int i_2031_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1995_]);
										int i_2032_ = i_2031_ >>> 24;
										int i_2033_ = 256 - i_2032_;
										int i_2034_ = ((i_2031_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2035_ = ((i_2031_ & 0xff00) * anInt9015 & 0xff0000);
										i_2031_ = (((i_2034_ | i_2035_) >>> 8) + anInt9022);
										int i_2036_ = is[i_1996_];
										is[i_1996_] = ((((i_2031_ & 0xff00ff) * i_2032_ + ((i_2036_ & 0xff00ff) * i_2033_)) & ~0xff00ff) + (((i_2031_ & 0xff00) * i_2032_ + ((i_2036_ & 0xff00) * i_2033_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_1778_ == 2) {
									if (i == 1) {
										int i_2037_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1995_]);
										int i_2038_ = is[i_1996_];
										int i_2039_ = i_2037_ + i_2038_;
										int i_2040_ = ((i_2037_ & 0xff00ff) + (i_2038_ & 0xff00ff));
										i_2038_ = ((i_2040_ & 0x1000100) + (i_2039_ - i_2040_ & 0x10000));
										is[i_1996_] = (i_2039_ - i_2038_ | i_2038_ - (i_2038_ >>> 8));
									} else if (i == 0) {
										int i_2041_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1995_]);
										int i_2042_ = ((i_2041_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2043_ = ((i_2041_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2044_ = ((i_2041_ & 0xff) * anInt9019 & 0xff00);
										i_2041_ = (i_2042_ | i_2043_ | i_2044_) >>> 8;
										int i_2045_ = is[i_1996_];
										int i_2046_ = i_2041_ + i_2045_;
										int i_2047_ = ((i_2041_ & 0xff00ff) + (i_2045_ & 0xff00ff));
										i_2045_ = ((i_2047_ & 0x1000100) + (i_2046_ - i_2047_ & 0x10000));
										is[i_1996_] = (i_2046_ - i_2045_ | i_2045_ - (i_2045_ >>> 8));
									} else if (i == 3) {
										int i_2048_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1995_]);
										int i_2049_ = anInt9014;
										int i_2050_ = i_2048_ + i_2049_;
										int i_2051_ = ((i_2048_ & 0xff00ff) + (i_2049_ & 0xff00ff));
										int i_2052_ = ((i_2051_ & 0x1000100) + (i_2050_ - i_2051_ & 0x10000));
										i_2048_ = (i_2050_ - i_2052_ | i_2052_ - (i_2052_ >>> 8));
										i_2052_ = is[i_1996_];
										i_2050_ = i_2048_ + i_2052_;
										i_2051_ = ((i_2048_ & 0xff00ff) + (i_2052_ & 0xff00ff));
										i_2052_ = ((i_2051_ & 0x1000100) + (i_2050_ - i_2051_ & 0x10000));
										is[i_1996_] = (i_2050_ - i_2052_ | i_2052_ - (i_2052_ >>> 8));
									} else if (i == 2) {
										int i_2053_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_1995_]);
										int i_2054_ = ((i_2053_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2055_ = ((i_2053_ & 0xff00) * anInt9015 & 0xff0000);
										i_2053_ = (((i_2054_ | i_2055_) >>> 8) + anInt9022);
										int i_2056_ = is[i_1996_];
										int i_2057_ = i_2053_ + i_2056_;
										int i_2058_ = ((i_2053_ & 0xff00ff) + (i_2056_ & 0xff00ff));
										i_2056_ = ((i_2058_ & 0x1000100) + (i_2057_ - i_2058_ & 0x10000));
										is[i_1996_] = (i_2057_ - i_2056_ | i_2056_ - (i_2056_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_1991_ += anInt9004;
							}
						}
						i_1989_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_2059_ = anInt9001;
					while (i_2059_ < 0) {
						int i_2060_ = anInt9003;
						int i_2061_ = anInt8988 + anInt9012;
						int i_2062_ = anInt9011 + anInt9013;
						int i_2063_ = anInt8999;
						int i_2064_;
						if ((i_2064_ = i_2061_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) >= 0) {
							i_2064_ = (anInt9004 - i_2064_) / anInt9004;
							i_2063_ += i_2064_;
							i_2061_ += anInt9004 * i_2064_;
							i_2062_ += anInt8991 * i_2064_;
							i_2060_ += i_2064_;
						}
						if ((i_2064_ = (i_2061_ - anInt9004) / anInt9004) > i_2063_)
							i_2063_ = i_2064_;
						if ((i_2064_ = i_2062_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) >= 0) {
							i_2064_ = (anInt8991 - i_2064_) / anInt8991;
							i_2063_ += i_2064_;
							i_2061_ += anInt9004 * i_2064_;
							i_2062_ += anInt8991 * i_2064_;
							i_2060_ += i_2064_;
						}
						if ((i_2064_ = (i_2062_ - anInt8991) / anInt8991) > i_2063_)
							i_2063_ = i_2064_;
						for (/**/; i_2063_ < 0; i_2063_++) {
							int i_2065_ = (((i_2062_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_2061_ >> 12));
							int i_2066_ = i_2060_++;
							if (i_1778_ == 0) {
								if (i == 1)
									is[i_2066_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2065_]);
								else if (i == 0) {
									int i_2067_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2065_++]);
									int i_2068_ = ((i_2067_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2069_ = ((i_2067_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2070_ = ((i_2067_ & 0xff) * anInt9019 & 0xff00);
									is[i_2066_] = (i_2068_ | i_2069_ | i_2070_) >>> 8;
								} else if (i == 3) {
									int i_2071_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2065_++]);
									int i_2072_ = anInt9014;
									int i_2073_ = i_2071_ + i_2072_;
									int i_2074_ = ((i_2071_ & 0xff00ff) + (i_2072_ & 0xff00ff));
									int i_2075_ = ((i_2074_ & 0x1000100) + (i_2073_ - i_2074_ & 0x10000));
									is[i_2066_] = (i_2073_ - i_2075_ | i_2075_ - (i_2075_ >>> 8));
								} else if (i == 2) {
									int i_2076_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2065_]);
									int i_2077_ = ((i_2076_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2078_ = ((i_2076_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_2066_] = (((i_2077_ | i_2078_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_1778_ == 1) {
								if (i == 1) {
									int i_2079_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2065_]);
									int i_2080_ = i_2079_ >>> 24;
									int i_2081_ = 256 - i_2080_;
									int i_2082_ = is[i_2066_];
									is[i_2066_] = ((((i_2079_ & 0xff00ff) * i_2080_ + (i_2082_ & 0xff00ff) * i_2081_) & ~0xff00ff) + (((i_2079_ & 0xff00) * i_2080_ + (i_2082_ & 0xff00) * i_2081_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_2083_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2065_]);
									int i_2084_ = (i_2083_ >>> 24) * anInt9015 >> 8;
									int i_2085_ = 256 - i_2084_;
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_2086_ = is[i_2066_];
										is[i_2066_] = ((((i_2083_ & 0xff00ff) * i_2084_ + ((i_2086_ & 0xff00ff) * i_2085_)) & ~0xff00ff) + (((i_2083_ & 0xff00) * i_2084_ + ((i_2086_ & 0xff00) * i_2085_)) & 0xff0000)) >> 8;
									} else if (i_2084_ != 255) {
										int i_2087_ = ((i_2083_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2088_ = ((i_2083_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2089_ = ((i_2083_ & 0xff) * anInt9019 & 0xff00);
										i_2083_ = (i_2087_ | i_2088_ | i_2089_) >>> 8;
										int i_2090_ = is[i_2066_];
										is[i_2066_] = ((((i_2083_ & 0xff00ff) * i_2084_ + ((i_2090_ & 0xff00ff) * i_2085_)) & ~0xff00ff) + (((i_2083_ & 0xff00) * i_2084_ + ((i_2090_ & 0xff00) * i_2085_)) & 0xff0000)) >> 8;
									} else {
										int i_2091_ = ((i_2083_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2092_ = ((i_2083_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2093_ = ((i_2083_ & 0xff) * anInt9019 & 0xff00);
										is[i_2066_] = (i_2091_ | i_2092_ | i_2093_) >>> 8;
									}
								} else if (i == 3) {
									int i_2094_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2065_]);
									int i_2095_ = anInt9014;
									int i_2096_ = i_2094_ + i_2095_;
									int i_2097_ = ((i_2094_ & 0xff00ff) + (i_2095_ & 0xff00ff));
									int i_2098_ = ((i_2097_ & 0x1000100) + (i_2096_ - i_2097_ & 0x10000));
									i_2098_ = (i_2096_ - i_2098_ | i_2098_ - (i_2098_ >>> 8));
									int i_2099_ = (i_2094_ >>> 24) * anInt9015 >> 8;
									int i_2100_ = 256 - i_2099_;
									if (i_2099_ != 255) {
										i_2094_ = i_2098_;
										i_2098_ = is[i_2066_];
										i_2098_ = ((((i_2094_ & 0xff00ff) * i_2099_ + ((i_2098_ & 0xff00ff) * i_2100_)) & ~0xff00ff) + (((i_2094_ & 0xff00) * i_2099_ + ((i_2098_ & 0xff00) * i_2100_)) & 0xff0000)) >> 8;
									}
									is[i_2066_] = i_2098_;
								} else if (i == 2) {
									int i_2101_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2065_]);
									int i_2102_ = i_2101_ >>> 24;
									int i_2103_ = 256 - i_2102_;
									int i_2104_ = ((i_2101_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2105_ = ((i_2101_ & 0xff00) * anInt9015 & 0xff0000);
									i_2101_ = (((i_2104_ | i_2105_) >>> 8) + anInt9022);
									int i_2106_ = is[i_2066_];
									is[i_2066_] = ((((i_2101_ & 0xff00ff) * i_2102_ + (i_2106_ & 0xff00ff) * i_2103_) & ~0xff00ff) + (((i_2101_ & 0xff00) * i_2102_ + (i_2106_ & 0xff00) * i_2103_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_1778_ == 2) {
								if (i == 1) {
									int i_2107_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2065_]);
									int i_2108_ = is[i_2066_];
									int i_2109_ = i_2107_ + i_2108_;
									int i_2110_ = ((i_2107_ & 0xff00ff) + (i_2108_ & 0xff00ff));
									i_2108_ = ((i_2110_ & 0x1000100) + (i_2109_ - i_2110_ & 0x10000));
									is[i_2066_] = (i_2109_ - i_2108_ | i_2108_ - (i_2108_ >>> 8));
								} else if (i == 0) {
									int i_2111_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2065_]);
									int i_2112_ = ((i_2111_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2113_ = ((i_2111_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2114_ = ((i_2111_ & 0xff) * anInt9019 & 0xff00);
									i_2111_ = (i_2112_ | i_2113_ | i_2114_) >>> 8;
									int i_2115_ = is[i_2066_];
									int i_2116_ = i_2111_ + i_2115_;
									int i_2117_ = ((i_2111_ & 0xff00ff) + (i_2115_ & 0xff00ff));
									i_2115_ = ((i_2117_ & 0x1000100) + (i_2116_ - i_2117_ & 0x10000));
									is[i_2066_] = (i_2116_ - i_2115_ | i_2115_ - (i_2115_ >>> 8));
								} else if (i == 3) {
									int i_2118_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2065_]);
									int i_2119_ = anInt9014;
									int i_2120_ = i_2118_ + i_2119_;
									int i_2121_ = ((i_2118_ & 0xff00ff) + (i_2119_ & 0xff00ff));
									int i_2122_ = ((i_2121_ & 0x1000100) + (i_2120_ - i_2121_ & 0x10000));
									i_2118_ = (i_2120_ - i_2122_ | i_2122_ - (i_2122_ >>> 8));
									i_2122_ = is[i_2066_];
									i_2120_ = i_2118_ + i_2122_;
									i_2121_ = (i_2118_ & 0xff00ff) + (i_2122_ & 0xff00ff);
									i_2122_ = ((i_2121_ & 0x1000100) + (i_2120_ - i_2121_ & 0x10000));
									is[i_2066_] = (i_2120_ - i_2122_ | i_2122_ - (i_2122_ >>> 8));
								} else if (i == 2) {
									int i_2123_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2065_]);
									int i_2124_ = ((i_2123_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2125_ = ((i_2123_ & 0xff00) * anInt9015 & 0xff0000);
									i_2123_ = (((i_2124_ | i_2125_) >>> 8) + anInt9022);
									int i_2126_ = is[i_2066_];
									int i_2127_ = i_2123_ + i_2126_;
									int i_2128_ = ((i_2123_ & 0xff00ff) + (i_2126_ & 0xff00ff));
									i_2126_ = ((i_2128_ & 0x1000100) + (i_2127_ - i_2128_ & 0x10000));
									is[i_2066_] = (i_2127_ - i_2126_ | i_2126_ - (i_2126_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_2061_ += anInt9004;
							i_2062_ += anInt8991;
						}
						i_2059_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_2129_ = anInt9001;
					while (i_2129_ < 0) {
						int i_2130_ = anInt9003;
						int i_2131_ = anInt8988 + anInt9012;
						int i_2132_ = anInt9011 + anInt9013;
						int i_2133_ = anInt8999;
						int i_2134_;
						if ((i_2134_ = i_2131_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) >= 0) {
							i_2134_ = (anInt9004 - i_2134_) / anInt9004;
							i_2133_ += i_2134_;
							i_2131_ += anInt9004 * i_2134_;
							i_2132_ += anInt8991 * i_2134_;
							i_2130_ += i_2134_;
						}
						if ((i_2134_ = (i_2131_ - anInt9004) / anInt9004) > i_2133_)
							i_2133_ = i_2134_;
						if (i_2132_ < 0) {
							i_2134_ = (anInt8991 - 1 - i_2132_) / anInt8991;
							i_2133_ += i_2134_;
							i_2131_ += anInt9004 * i_2134_;
							i_2132_ += anInt8991 * i_2134_;
							i_2130_ += i_2134_;
						}
						if ((i_2134_ = (1 + i_2132_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_2133_)
							i_2133_ = i_2134_;
						for (/**/; i_2133_ < 0; i_2133_++) {
							int i_2135_ = (((i_2132_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_2131_ >> 12));
							int i_2136_ = i_2130_++;
							if (i_1778_ == 0) {
								if (i == 1)
									is[i_2136_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2135_]);
								else if (i == 0) {
									int i_2137_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2135_++]);
									int i_2138_ = ((i_2137_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2139_ = ((i_2137_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2140_ = ((i_2137_ & 0xff) * anInt9019 & 0xff00);
									is[i_2136_] = (i_2138_ | i_2139_ | i_2140_) >>> 8;
								} else if (i == 3) {
									int i_2141_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2135_++]);
									int i_2142_ = anInt9014;
									int i_2143_ = i_2141_ + i_2142_;
									int i_2144_ = ((i_2141_ & 0xff00ff) + (i_2142_ & 0xff00ff));
									int i_2145_ = ((i_2144_ & 0x1000100) + (i_2143_ - i_2144_ & 0x10000));
									is[i_2136_] = (i_2143_ - i_2145_ | i_2145_ - (i_2145_ >>> 8));
								} else if (i == 2) {
									int i_2146_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2135_]);
									int i_2147_ = ((i_2146_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2148_ = ((i_2146_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_2136_] = (((i_2147_ | i_2148_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_1778_ == 1) {
								if (i == 1) {
									int i_2149_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2135_]);
									int i_2150_ = i_2149_ >>> 24;
									int i_2151_ = 256 - i_2150_;
									int i_2152_ = is[i_2136_];
									is[i_2136_] = ((((i_2149_ & 0xff00ff) * i_2150_ + (i_2152_ & 0xff00ff) * i_2151_) & ~0xff00ff) + (((i_2149_ & 0xff00) * i_2150_ + (i_2152_ & 0xff00) * i_2151_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_2153_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2135_]);
									int i_2154_ = (i_2153_ >>> 24) * anInt9015 >> 8;
									int i_2155_ = 256 - i_2154_;
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_2156_ = is[i_2136_];
										is[i_2136_] = ((((i_2153_ & 0xff00ff) * i_2154_ + ((i_2156_ & 0xff00ff) * i_2155_)) & ~0xff00ff) + (((i_2153_ & 0xff00) * i_2154_ + ((i_2156_ & 0xff00) * i_2155_)) & 0xff0000)) >> 8;
									} else if (i_2154_ != 255) {
										int i_2157_ = ((i_2153_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2158_ = ((i_2153_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2159_ = ((i_2153_ & 0xff) * anInt9019 & 0xff00);
										i_2153_ = (i_2157_ | i_2158_ | i_2159_) >>> 8;
										int i_2160_ = is[i_2136_];
										is[i_2136_] = ((((i_2153_ & 0xff00ff) * i_2154_ + ((i_2160_ & 0xff00ff) * i_2155_)) & ~0xff00ff) + (((i_2153_ & 0xff00) * i_2154_ + ((i_2160_ & 0xff00) * i_2155_)) & 0xff0000)) >> 8;
									} else {
										int i_2161_ = ((i_2153_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2162_ = ((i_2153_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2163_ = ((i_2153_ & 0xff) * anInt9019 & 0xff00);
										is[i_2136_] = (i_2161_ | i_2162_ | i_2163_) >>> 8;
									}
								} else if (i == 3) {
									int i_2164_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2135_]);
									int i_2165_ = anInt9014;
									int i_2166_ = i_2164_ + i_2165_;
									int i_2167_ = ((i_2164_ & 0xff00ff) + (i_2165_ & 0xff00ff));
									int i_2168_ = ((i_2167_ & 0x1000100) + (i_2166_ - i_2167_ & 0x10000));
									i_2168_ = (i_2166_ - i_2168_ | i_2168_ - (i_2168_ >>> 8));
									int i_2169_ = (i_2164_ >>> 24) * anInt9015 >> 8;
									int i_2170_ = 256 - i_2169_;
									if (i_2169_ != 255) {
										i_2164_ = i_2168_;
										i_2168_ = is[i_2136_];
										i_2168_ = ((((i_2164_ & 0xff00ff) * i_2169_ + ((i_2168_ & 0xff00ff) * i_2170_)) & ~0xff00ff) + (((i_2164_ & 0xff00) * i_2169_ + ((i_2168_ & 0xff00) * i_2170_)) & 0xff0000)) >> 8;
									}
									is[i_2136_] = i_2168_;
								} else if (i == 2) {
									int i_2171_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2135_]);
									int i_2172_ = i_2171_ >>> 24;
									int i_2173_ = 256 - i_2172_;
									int i_2174_ = ((i_2171_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2175_ = ((i_2171_ & 0xff00) * anInt9015 & 0xff0000);
									i_2171_ = (((i_2174_ | i_2175_) >>> 8) + anInt9022);
									int i_2176_ = is[i_2136_];
									is[i_2136_] = ((((i_2171_ & 0xff00ff) * i_2172_ + (i_2176_ & 0xff00ff) * i_2173_) & ~0xff00ff) + (((i_2171_ & 0xff00) * i_2172_ + (i_2176_ & 0xff00) * i_2173_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_1778_ == 2) {
								if (i == 1) {
									int i_2177_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2135_]);
									int i_2178_ = is[i_2136_];
									int i_2179_ = i_2177_ + i_2178_;
									int i_2180_ = ((i_2177_ & 0xff00ff) + (i_2178_ & 0xff00ff));
									i_2178_ = ((i_2180_ & 0x1000100) + (i_2179_ - i_2180_ & 0x10000));
									is[i_2136_] = (i_2179_ - i_2178_ | i_2178_ - (i_2178_ >>> 8));
								} else if (i == 0) {
									int i_2181_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2135_]);
									int i_2182_ = ((i_2181_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2183_ = ((i_2181_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2184_ = ((i_2181_ & 0xff) * anInt9019 & 0xff00);
									i_2181_ = (i_2182_ | i_2183_ | i_2184_) >>> 8;
									int i_2185_ = is[i_2136_];
									int i_2186_ = i_2181_ + i_2185_;
									int i_2187_ = ((i_2181_ & 0xff00ff) + (i_2185_ & 0xff00ff));
									i_2185_ = ((i_2187_ & 0x1000100) + (i_2186_ - i_2187_ & 0x10000));
									is[i_2136_] = (i_2186_ - i_2185_ | i_2185_ - (i_2185_ >>> 8));
								} else if (i == 3) {
									int i_2188_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2135_]);
									int i_2189_ = anInt9014;
									int i_2190_ = i_2188_ + i_2189_;
									int i_2191_ = ((i_2188_ & 0xff00ff) + (i_2189_ & 0xff00ff));
									int i_2192_ = ((i_2191_ & 0x1000100) + (i_2190_ - i_2191_ & 0x10000));
									i_2188_ = (i_2190_ - i_2192_ | i_2192_ - (i_2192_ >>> 8));
									i_2192_ = is[i_2136_];
									i_2190_ = i_2188_ + i_2192_;
									i_2191_ = (i_2188_ & 0xff00ff) + (i_2192_ & 0xff00ff);
									i_2192_ = ((i_2191_ & 0x1000100) + (i_2190_ - i_2191_ & 0x10000));
									is[i_2136_] = (i_2190_ - i_2192_ | i_2192_ - (i_2192_ >>> 8));
								} else if (i == 2) {
									int i_2193_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2135_]);
									int i_2194_ = ((i_2193_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2195_ = ((i_2193_ & 0xff00) * anInt9015 & 0xff0000);
									i_2193_ = (((i_2194_ | i_2195_) >>> 8) + anInt9022);
									int i_2196_ = is[i_2136_];
									int i_2197_ = i_2193_ + i_2196_;
									int i_2198_ = ((i_2193_ & 0xff00ff) + (i_2196_ & 0xff00ff));
									i_2196_ = ((i_2198_ & 0x1000100) + (i_2197_ - i_2198_ & 0x10000));
									is[i_2136_] = (i_2197_ - i_2196_ | i_2196_ - (i_2196_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_2131_ += anInt9004;
							i_2132_ += anInt8991;
						}
						i_2129_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_2199_ = anInt9001;
				while (i_2199_ < 0) {
					int i_2200_ = anInt9003;
					int i_2201_ = anInt8988 + anInt9012;
					int i_2202_ = anInt9011;
					int i_2203_ = anInt8999;
					if (i_2202_ >= 0 && i_2202_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) < 0) {
						if (i_2201_ < 0) {
							int i_2204_ = (anInt9004 - 1 - i_2201_) / anInt9004;
							i_2203_ += i_2204_;
							i_2201_ += anInt9004 * i_2204_;
							i_2200_ += i_2204_;
						}
						int i_2205_;
						if ((i_2205_ = (1 + i_2201_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_2203_)
							i_2203_ = i_2205_;
						for (/**/; i_2203_ < 0; i_2203_++) {
							int i_2206_ = (((i_2202_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_2201_ >> 12));
							int i_2207_ = i_2200_++;
							if (i_1778_ == 0) {
								if (i == 1)
									is[i_2207_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2206_]);
								else if (i == 0) {
									int i_2208_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2206_++]);
									int i_2209_ = ((i_2208_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2210_ = ((i_2208_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2211_ = ((i_2208_ & 0xff) * anInt9019 & 0xff00);
									is[i_2207_] = (i_2209_ | i_2210_ | i_2211_) >>> 8;
								} else if (i == 3) {
									int i_2212_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2206_++]);
									int i_2213_ = anInt9014;
									int i_2214_ = i_2212_ + i_2213_;
									int i_2215_ = ((i_2212_ & 0xff00ff) + (i_2213_ & 0xff00ff));
									int i_2216_ = ((i_2215_ & 0x1000100) + (i_2214_ - i_2215_ & 0x10000));
									is[i_2207_] = (i_2214_ - i_2216_ | i_2216_ - (i_2216_ >>> 8));
								} else if (i == 2) {
									int i_2217_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2206_]);
									int i_2218_ = ((i_2217_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2219_ = ((i_2217_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_2207_] = (((i_2218_ | i_2219_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_1778_ == 1) {
								if (i == 1) {
									int i_2220_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2206_]);
									int i_2221_ = i_2220_ >>> 24;
									int i_2222_ = 256 - i_2221_;
									int i_2223_ = is[i_2207_];
									is[i_2207_] = ((((i_2220_ & 0xff00ff) * i_2221_ + (i_2223_ & 0xff00ff) * i_2222_) & ~0xff00ff) + (((i_2220_ & 0xff00) * i_2221_ + (i_2223_ & 0xff00) * i_2222_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_2224_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2206_]);
									int i_2225_ = (i_2224_ >>> 24) * anInt9015 >> 8;
									int i_2226_ = 256 - i_2225_;
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_2227_ = is[i_2207_];
										is[i_2207_] = ((((i_2224_ & 0xff00ff) * i_2225_ + ((i_2227_ & 0xff00ff) * i_2226_)) & ~0xff00ff) + (((i_2224_ & 0xff00) * i_2225_ + ((i_2227_ & 0xff00) * i_2226_)) & 0xff0000)) >> 8;
									} else if (i_2225_ != 255) {
										int i_2228_ = ((i_2224_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2229_ = ((i_2224_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2230_ = ((i_2224_ & 0xff) * anInt9019 & 0xff00);
										i_2224_ = (i_2228_ | i_2229_ | i_2230_) >>> 8;
										int i_2231_ = is[i_2207_];
										is[i_2207_] = ((((i_2224_ & 0xff00ff) * i_2225_ + ((i_2231_ & 0xff00ff) * i_2226_)) & ~0xff00ff) + (((i_2224_ & 0xff00) * i_2225_ + ((i_2231_ & 0xff00) * i_2226_)) & 0xff0000)) >> 8;
									} else {
										int i_2232_ = ((i_2224_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2233_ = ((i_2224_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2234_ = ((i_2224_ & 0xff) * anInt9019 & 0xff00);
										is[i_2207_] = (i_2232_ | i_2233_ | i_2234_) >>> 8;
									}
								} else if (i == 3) {
									int i_2235_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2206_]);
									int i_2236_ = anInt9014;
									int i_2237_ = i_2235_ + i_2236_;
									int i_2238_ = ((i_2235_ & 0xff00ff) + (i_2236_ & 0xff00ff));
									int i_2239_ = ((i_2238_ & 0x1000100) + (i_2237_ - i_2238_ & 0x10000));
									i_2239_ = (i_2237_ - i_2239_ | i_2239_ - (i_2239_ >>> 8));
									int i_2240_ = (i_2235_ >>> 24) * anInt9015 >> 8;
									int i_2241_ = 256 - i_2240_;
									if (i_2240_ != 255) {
										i_2235_ = i_2239_;
										i_2239_ = is[i_2207_];
										i_2239_ = ((((i_2235_ & 0xff00ff) * i_2240_ + ((i_2239_ & 0xff00ff) * i_2241_)) & ~0xff00ff) + (((i_2235_ & 0xff00) * i_2240_ + ((i_2239_ & 0xff00) * i_2241_)) & 0xff0000)) >> 8;
									}
									is[i_2207_] = i_2239_;
								} else if (i == 2) {
									int i_2242_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2206_]);
									int i_2243_ = i_2242_ >>> 24;
									int i_2244_ = 256 - i_2243_;
									int i_2245_ = ((i_2242_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2246_ = ((i_2242_ & 0xff00) * anInt9015 & 0xff0000);
									i_2242_ = (((i_2245_ | i_2246_) >>> 8) + anInt9022);
									int i_2247_ = is[i_2207_];
									is[i_2207_] = ((((i_2242_ & 0xff00ff) * i_2243_ + (i_2247_ & 0xff00ff) * i_2244_) & ~0xff00ff) + (((i_2242_ & 0xff00) * i_2243_ + (i_2247_ & 0xff00) * i_2244_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_1778_ == 2) {
								if (i == 1) {
									int i_2248_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2206_]);
									int i_2249_ = is[i_2207_];
									int i_2250_ = i_2248_ + i_2249_;
									int i_2251_ = ((i_2248_ & 0xff00ff) + (i_2249_ & 0xff00ff));
									i_2249_ = ((i_2251_ & 0x1000100) + (i_2250_ - i_2251_ & 0x10000));
									is[i_2207_] = (i_2250_ - i_2249_ | i_2249_ - (i_2249_ >>> 8));
								} else if (i == 0) {
									int i_2252_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2206_]);
									int i_2253_ = ((i_2252_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2254_ = ((i_2252_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2255_ = ((i_2252_ & 0xff) * anInt9019 & 0xff00);
									i_2252_ = (i_2253_ | i_2254_ | i_2255_) >>> 8;
									int i_2256_ = is[i_2207_];
									int i_2257_ = i_2252_ + i_2256_;
									int i_2258_ = ((i_2252_ & 0xff00ff) + (i_2256_ & 0xff00ff));
									i_2256_ = ((i_2258_ & 0x1000100) + (i_2257_ - i_2258_ & 0x10000));
									is[i_2207_] = (i_2257_ - i_2256_ | i_2256_ - (i_2256_ >>> 8));
								} else if (i == 3) {
									int i_2259_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2206_]);
									int i_2260_ = anInt9014;
									int i_2261_ = i_2259_ + i_2260_;
									int i_2262_ = ((i_2259_ & 0xff00ff) + (i_2260_ & 0xff00ff));
									int i_2263_ = ((i_2262_ & 0x1000100) + (i_2261_ - i_2262_ & 0x10000));
									i_2259_ = (i_2261_ - i_2263_ | i_2263_ - (i_2263_ >>> 8));
									i_2263_ = is[i_2207_];
									i_2261_ = i_2259_ + i_2263_;
									i_2262_ = (i_2259_ & 0xff00ff) + (i_2263_ & 0xff00ff);
									i_2263_ = ((i_2262_ & 0x1000100) + (i_2261_ - i_2262_ & 0x10000));
									is[i_2207_] = (i_2261_ - i_2263_ | i_2263_ - (i_2263_ >>> 8));
								} else if (i == 2) {
									int i_2264_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2206_]);
									int i_2265_ = ((i_2264_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2266_ = ((i_2264_ & 0xff00) * anInt9015 & 0xff0000);
									i_2264_ = (((i_2265_ | i_2266_) >>> 8) + anInt9022);
									int i_2267_ = is[i_2207_];
									int i_2268_ = i_2264_ + i_2267_;
									int i_2269_ = ((i_2264_ & 0xff00ff) + (i_2267_ & 0xff00ff));
									i_2267_ = ((i_2269_ & 0x1000100) + (i_2268_ - i_2269_ & 0x10000));
									is[i_2207_] = (i_2268_ - i_2267_ | i_2267_ - (i_2267_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_2201_ += anInt9004;
						}
					}
					i_2199_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				for (int i_2270_ = anInt9001; i_2270_ < 0; i_2270_++) {
					int i_2271_ = anInt9003;
					int i_2272_ = anInt8988 + anInt9012;
					int i_2273_ = anInt9011 + anInt9013;
					int i_2274_ = anInt8999;
					if (i_2272_ < 0) {
						int i_2275_ = (anInt9004 - 1 - i_2272_) / anInt9004;
						i_2274_ += i_2275_;
						i_2272_ += anInt9004 * i_2275_;
						i_2273_ += anInt8991 * i_2275_;
						i_2271_ += i_2275_;
					}
					int i_2276_;
					if ((i_2276_ = (1 + i_2272_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_2274_)
						i_2274_ = i_2276_;
					if ((i_2276_ = i_2273_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) >= 0) {
						i_2276_ = (anInt8991 - i_2276_) / anInt8991;
						i_2274_ += i_2276_;
						i_2272_ += anInt9004 * i_2276_;
						i_2273_ += anInt8991 * i_2276_;
						i_2271_ += i_2276_;
					}
					if ((i_2276_ = (i_2273_ - anInt8991) / anInt8991) > i_2274_)
						i_2274_ = i_2276_;
					for (/**/; i_2274_ < 0; i_2274_++) {
						int i_2277_ = (((i_2273_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_2272_ >> 12));
						int i_2278_ = i_2271_++;
						if (i_1778_ == 0) {
							if (i == 1)
								is[i_2278_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2277_]);
							else if (i == 0) {
								int i_2279_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2277_++]);
								int i_2280_ = ((i_2279_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_2281_ = ((i_2279_ & 0xff00) * anInt9018 & 0xff0000);
								int i_2282_ = (i_2279_ & 0xff) * anInt9019 & 0xff00;
								is[i_2278_] = (i_2280_ | i_2281_ | i_2282_) >>> 8;
							} else if (i == 3) {
								int i_2283_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2277_++]);
								int i_2284_ = anInt9014;
								int i_2285_ = i_2283_ + i_2284_;
								int i_2286_ = ((i_2283_ & 0xff00ff) + (i_2284_ & 0xff00ff));
								int i_2287_ = ((i_2286_ & 0x1000100) + (i_2285_ - i_2286_ & 0x10000));
								is[i_2278_] = i_2285_ - i_2287_ | i_2287_ - (i_2287_ >>> 8);
							} else if (i == 2) {
								int i_2288_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2277_]);
								int i_2289_ = ((i_2288_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_2290_ = ((i_2288_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_2278_] = ((i_2289_ | i_2290_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_1778_ == 1) {
							if (i == 1) {
								int i_2291_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2277_]);
								int i_2292_ = i_2291_ >>> 24;
								int i_2293_ = 256 - i_2292_;
								int i_2294_ = is[i_2278_];
								is[i_2278_] = ((((i_2291_ & 0xff00ff) * i_2292_ + (i_2294_ & 0xff00ff) * i_2293_) & ~0xff00ff) + (((i_2291_ & 0xff00) * i_2292_ + (i_2294_ & 0xff00) * i_2293_) & 0xff0000)) >> 8;
							} else if (i == 0) {
								int i_2295_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2277_]);
								int i_2296_ = (i_2295_ >>> 24) * anInt9015 >> 8;
								int i_2297_ = 256 - i_2296_;
								if ((anInt9014 & 0xffffff) == 16777215) {
									int i_2298_ = is[i_2278_];
									is[i_2278_] = ((((i_2295_ & 0xff00ff) * i_2296_ + (i_2298_ & 0xff00ff) * i_2297_) & ~0xff00ff) + (((i_2295_ & 0xff00) * i_2296_ + (i_2298_ & 0xff00) * i_2297_) & 0xff0000)) >> 8;
								} else if (i_2296_ != 255) {
									int i_2299_ = ((i_2295_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2300_ = ((i_2295_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2301_ = ((i_2295_ & 0xff) * anInt9019 & 0xff00);
									i_2295_ = (i_2299_ | i_2300_ | i_2301_) >>> 8;
									int i_2302_ = is[i_2278_];
									is[i_2278_] = ((((i_2295_ & 0xff00ff) * i_2296_ + (i_2302_ & 0xff00ff) * i_2297_) & ~0xff00ff) + (((i_2295_ & 0xff00) * i_2296_ + (i_2302_ & 0xff00) * i_2297_) & 0xff0000)) >> 8;
								} else {
									int i_2303_ = ((i_2295_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2304_ = ((i_2295_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2305_ = ((i_2295_ & 0xff) * anInt9019 & 0xff00);
									is[i_2278_] = (i_2303_ | i_2304_ | i_2305_) >>> 8;
								}
							} else if (i == 3) {
								int i_2306_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2277_]);
								int i_2307_ = anInt9014;
								int i_2308_ = i_2306_ + i_2307_;
								int i_2309_ = ((i_2306_ & 0xff00ff) + (i_2307_ & 0xff00ff));
								int i_2310_ = ((i_2309_ & 0x1000100) + (i_2308_ - i_2309_ & 0x10000));
								i_2310_ = i_2308_ - i_2310_ | i_2310_ - (i_2310_ >>> 8);
								int i_2311_ = (i_2306_ >>> 24) * anInt9015 >> 8;
								int i_2312_ = 256 - i_2311_;
								if (i_2311_ != 255) {
									i_2306_ = i_2310_;
									i_2310_ = is[i_2278_];
									i_2310_ = ((((i_2306_ & 0xff00ff) * i_2311_ + (i_2310_ & 0xff00ff) * i_2312_) & ~0xff00ff) + (((i_2306_ & 0xff00) * i_2311_ + (i_2310_ & 0xff00) * i_2312_) & 0xff0000)) >> 8;
								}
								is[i_2278_] = i_2310_;
							} else if (i == 2) {
								int i_2313_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2277_]);
								int i_2314_ = i_2313_ >>> 24;
								int i_2315_ = 256 - i_2314_;
								int i_2316_ = ((i_2313_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_2317_ = ((i_2313_ & 0xff00) * anInt9015 & 0xff0000);
								i_2313_ = ((i_2316_ | i_2317_) >>> 8) + anInt9022;
								int i_2318_ = is[i_2278_];
								is[i_2278_] = ((((i_2313_ & 0xff00ff) * i_2314_ + (i_2318_ & 0xff00ff) * i_2315_) & ~0xff00ff) + (((i_2313_ & 0xff00) * i_2314_ + (i_2318_ & 0xff00) * i_2315_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_1778_ == 2) {
							if (i == 1) {
								int i_2319_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2277_]);
								int i_2320_ = is[i_2278_];
								int i_2321_ = i_2319_ + i_2320_;
								int i_2322_ = ((i_2319_ & 0xff00ff) + (i_2320_ & 0xff00ff));
								i_2320_ = ((i_2322_ & 0x1000100) + (i_2321_ - i_2322_ & 0x10000));
								is[i_2278_] = i_2321_ - i_2320_ | i_2320_ - (i_2320_ >>> 8);
							} else if (i == 0) {
								int i_2323_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2277_]);
								int i_2324_ = ((i_2323_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_2325_ = ((i_2323_ & 0xff00) * anInt9018 & 0xff0000);
								int i_2326_ = (i_2323_ & 0xff) * anInt9019 & 0xff00;
								i_2323_ = (i_2324_ | i_2325_ | i_2326_) >>> 8;
								int i_2327_ = is[i_2278_];
								int i_2328_ = i_2323_ + i_2327_;
								int i_2329_ = ((i_2323_ & 0xff00ff) + (i_2327_ & 0xff00ff));
								i_2327_ = ((i_2329_ & 0x1000100) + (i_2328_ - i_2329_ & 0x10000));
								is[i_2278_] = i_2328_ - i_2327_ | i_2327_ - (i_2327_ >>> 8);
							} else if (i == 3) {
								int i_2330_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2277_]);
								int i_2331_ = anInt9014;
								int i_2332_ = i_2330_ + i_2331_;
								int i_2333_ = ((i_2330_ & 0xff00ff) + (i_2331_ & 0xff00ff));
								int i_2334_ = ((i_2333_ & 0x1000100) + (i_2332_ - i_2333_ & 0x10000));
								i_2330_ = i_2332_ - i_2334_ | i_2334_ - (i_2334_ >>> 8);
								i_2334_ = is[i_2278_];
								i_2332_ = i_2330_ + i_2334_;
								i_2333_ = (i_2330_ & 0xff00ff) + (i_2334_ & 0xff00ff);
								i_2334_ = ((i_2333_ & 0x1000100) + (i_2332_ - i_2333_ & 0x10000));
								is[i_2278_] = i_2332_ - i_2334_ | i_2334_ - (i_2334_ >>> 8);
							} else if (i == 2) {
								int i_2335_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2277_]);
								int i_2336_ = ((i_2335_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_2337_ = ((i_2335_ & 0xff00) * anInt9015 & 0xff0000);
								i_2335_ = ((i_2336_ | i_2337_) >>> 8) + anInt9022;
								int i_2338_ = is[i_2278_];
								int i_2339_ = i_2335_ + i_2338_;
								int i_2340_ = ((i_2335_ & 0xff00ff) + (i_2338_ & 0xff00ff));
								i_2338_ = ((i_2340_ & 0x1000100) + (i_2339_ - i_2340_ & 0x10000));
								is[i_2278_] = i_2339_ - i_2338_ | i_2338_ - (i_2338_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_2272_ += anInt9004;
						i_2273_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				for (int i_2341_ = anInt9001; i_2341_ < 0; i_2341_++) {
					int i_2342_ = anInt9003;
					int i_2343_ = anInt8988 + anInt9012;
					int i_2344_ = anInt9011 + anInt9013;
					int i_2345_ = anInt8999;
					if (i_2343_ < 0) {
						int i_2346_ = (anInt9004 - 1 - i_2343_) / anInt9004;
						i_2345_ += i_2346_;
						i_2343_ += anInt9004 * i_2346_;
						i_2344_ += anInt8991 * i_2346_;
						i_2342_ += i_2346_;
					}
					int i_2347_;
					if ((i_2347_ = (1 + i_2343_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_2345_)
						i_2345_ = i_2347_;
					if (i_2344_ < 0) {
						i_2347_ = (anInt8991 - 1 - i_2344_) / anInt8991;
						i_2345_ += i_2347_;
						i_2343_ += anInt9004 * i_2347_;
						i_2344_ += anInt8991 * i_2347_;
						i_2342_ += i_2347_;
					}
					if ((i_2347_ = (1 + i_2344_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_2345_)
						i_2345_ = i_2347_;
					for (/**/; i_2345_ < 0; i_2345_++) {
						int i_2348_ = (((i_2344_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_2343_ >> 12));
						int i_2349_ = i_2342_++;
						if (i_1778_ == 0) {
							if (i == 1)
								is[i_2349_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2348_]);
							else if (i == 0) {
								int i_2350_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2348_++]);
								int i_2351_ = ((i_2350_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_2352_ = ((i_2350_ & 0xff00) * anInt9018 & 0xff0000);
								int i_2353_ = (i_2350_ & 0xff) * anInt9019 & 0xff00;
								is[i_2349_] = (i_2351_ | i_2352_ | i_2353_) >>> 8;
							} else if (i == 3) {
								int i_2354_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2348_++]);
								int i_2355_ = anInt9014;
								int i_2356_ = i_2354_ + i_2355_;
								int i_2357_ = ((i_2354_ & 0xff00ff) + (i_2355_ & 0xff00ff));
								int i_2358_ = ((i_2357_ & 0x1000100) + (i_2356_ - i_2357_ & 0x10000));
								is[i_2349_] = i_2356_ - i_2358_ | i_2358_ - (i_2358_ >>> 8);
							} else if (i == 2) {
								int i_2359_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2348_]);
								int i_2360_ = ((i_2359_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_2361_ = ((i_2359_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_2349_] = ((i_2360_ | i_2361_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_1778_ == 1) {
							if (i == 1) {
								int i_2362_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2348_]);
								int i_2363_ = i_2362_ >>> 24;
								int i_2364_ = 256 - i_2363_;
								int i_2365_ = is[i_2349_];
								is[i_2349_] = ((((i_2362_ & 0xff00ff) * i_2363_ + (i_2365_ & 0xff00ff) * i_2364_) & ~0xff00ff) + (((i_2362_ & 0xff00) * i_2363_ + (i_2365_ & 0xff00) * i_2364_) & 0xff0000)) >> 8;
							} else if (i == 0) {
								int i_2366_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2348_]);
								int i_2367_ = (i_2366_ >>> 24) * anInt9015 >> 8;
								int i_2368_ = 256 - i_2367_;
								if ((anInt9014 & 0xffffff) == 16777215) {
									int i_2369_ = is[i_2349_];
									is[i_2349_] = ((((i_2366_ & 0xff00ff) * i_2367_ + (i_2369_ & 0xff00ff) * i_2368_) & ~0xff00ff) + (((i_2366_ & 0xff00) * i_2367_ + (i_2369_ & 0xff00) * i_2368_) & 0xff0000)) >> 8;
								} else if (i_2367_ != 255) {
									int i_2370_ = ((i_2366_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2371_ = ((i_2366_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2372_ = ((i_2366_ & 0xff) * anInt9019 & 0xff00);
									i_2366_ = (i_2370_ | i_2371_ | i_2372_) >>> 8;
									int i_2373_ = is[i_2349_];
									is[i_2349_] = ((((i_2366_ & 0xff00ff) * i_2367_ + (i_2373_ & 0xff00ff) * i_2368_) & ~0xff00ff) + (((i_2366_ & 0xff00) * i_2367_ + (i_2373_ & 0xff00) * i_2368_) & 0xff0000)) >> 8;
								} else {
									int i_2374_ = ((i_2366_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2375_ = ((i_2366_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2376_ = ((i_2366_ & 0xff) * anInt9019 & 0xff00);
									is[i_2349_] = (i_2374_ | i_2375_ | i_2376_) >>> 8;
								}
							} else if (i == 3) {
								int i_2377_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2348_]);
								int i_2378_ = anInt9014;
								int i_2379_ = i_2377_ + i_2378_;
								int i_2380_ = ((i_2377_ & 0xff00ff) + (i_2378_ & 0xff00ff));
								int i_2381_ = ((i_2380_ & 0x1000100) + (i_2379_ - i_2380_ & 0x10000));
								i_2381_ = i_2379_ - i_2381_ | i_2381_ - (i_2381_ >>> 8);
								int i_2382_ = (i_2377_ >>> 24) * anInt9015 >> 8;
								int i_2383_ = 256 - i_2382_;
								if (i_2382_ != 255) {
									i_2377_ = i_2381_;
									i_2381_ = is[i_2349_];
									i_2381_ = ((((i_2377_ & 0xff00ff) * i_2382_ + (i_2381_ & 0xff00ff) * i_2383_) & ~0xff00ff) + (((i_2377_ & 0xff00) * i_2382_ + (i_2381_ & 0xff00) * i_2383_) & 0xff0000)) >> 8;
								}
								is[i_2349_] = i_2381_;
							} else if (i == 2) {
								int i_2384_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2348_]);
								int i_2385_ = i_2384_ >>> 24;
								int i_2386_ = 256 - i_2385_;
								int i_2387_ = ((i_2384_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_2388_ = ((i_2384_ & 0xff00) * anInt9015 & 0xff0000);
								i_2384_ = ((i_2387_ | i_2388_) >>> 8) + anInt9022;
								int i_2389_ = is[i_2349_];
								is[i_2349_] = ((((i_2384_ & 0xff00ff) * i_2385_ + (i_2389_ & 0xff00ff) * i_2386_) & ~0xff00ff) + (((i_2384_ & 0xff00) * i_2385_ + (i_2389_ & 0xff00) * i_2386_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_1778_ == 2) {
							if (i == 1) {
								int i_2390_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2348_]);
								int i_2391_ = is[i_2349_];
								int i_2392_ = i_2390_ + i_2391_;
								int i_2393_ = ((i_2390_ & 0xff00ff) + (i_2391_ & 0xff00ff));
								i_2391_ = ((i_2393_ & 0x1000100) + (i_2392_ - i_2393_ & 0x10000));
								is[i_2349_] = i_2392_ - i_2391_ | i_2391_ - (i_2391_ >>> 8);
							} else if (i == 0) {
								int i_2394_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2348_]);
								int i_2395_ = ((i_2394_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_2396_ = ((i_2394_ & 0xff00) * anInt9018 & 0xff0000);
								int i_2397_ = (i_2394_ & 0xff) * anInt9019 & 0xff00;
								i_2394_ = (i_2395_ | i_2396_ | i_2397_) >>> 8;
								int i_2398_ = is[i_2349_];
								int i_2399_ = i_2394_ + i_2398_;
								int i_2400_ = ((i_2394_ & 0xff00ff) + (i_2398_ & 0xff00ff));
								i_2398_ = ((i_2400_ & 0x1000100) + (i_2399_ - i_2400_ & 0x10000));
								is[i_2349_] = i_2399_ - i_2398_ | i_2398_ - (i_2398_ >>> 8);
							} else if (i == 3) {
								int i_2401_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2348_]);
								int i_2402_ = anInt9014;
								int i_2403_ = i_2401_ + i_2402_;
								int i_2404_ = ((i_2401_ & 0xff00ff) + (i_2402_ & 0xff00ff));
								int i_2405_ = ((i_2404_ & 0x1000100) + (i_2403_ - i_2404_ & 0x10000));
								i_2401_ = i_2403_ - i_2405_ | i_2405_ - (i_2405_ >>> 8);
								i_2405_ = is[i_2349_];
								i_2403_ = i_2401_ + i_2405_;
								i_2404_ = (i_2401_ & 0xff00ff) + (i_2405_ & 0xff00ff);
								i_2405_ = ((i_2404_ & 0x1000100) + (i_2403_ - i_2404_ & 0x10000));
								is[i_2349_] = i_2403_ - i_2405_ | i_2405_ - (i_2405_ >>> 8);
							} else if (i == 2) {
								int i_2406_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2348_]);
								int i_2407_ = ((i_2406_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_2408_ = ((i_2406_ & 0xff00) * anInt9015 & 0xff0000);
								i_2406_ = ((i_2407_ | i_2408_) >>> 8) + anInt9022;
								int i_2409_ = is[i_2349_];
								int i_2410_ = i_2406_ + i_2409_;
								int i_2411_ = ((i_2406_ & 0xff00ff) + (i_2409_ & 0xff00ff));
								i_2409_ = ((i_2411_ & 0x1000100) + (i_2410_ - i_2411_ & 0x10000));
								is[i_2349_] = i_2410_ - i_2409_ | i_2409_ - (i_2409_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_2343_ += anInt9004;
						i_2344_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	void method652(int i, int i_2412_, int i_2413_, int i_2414_, int i_2415_, int i_2416_, int i_2417_, int i_2418_) {
		if (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (i_2413_ > 0 && i_2414_ > 0) {
			int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
			if (is != null) {
				int i_2419_ = 0;
				int i_2420_ = 0;
				int i_2421_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
				int i_2422_ = (((Class57_Sub1_Sub1) this).anInt8990 + ((Class57_Sub1_Sub1) this).anInt9010 + ((Class57_Sub1_Sub1) this).anInt8997);
				int i_2423_ = (((Class57_Sub1_Sub1) this).anInt9000 + ((Class57_Sub1_Sub1) this).anInt8989 + ((Class57_Sub1_Sub1) this).anInt8993);
				int i_2424_ = (i_2422_ << 16) / i_2413_;
				int i_2425_ = (i_2423_ << 16) / i_2414_;
				if (((Class57_Sub1_Sub1) this).anInt8990 > 0) {
					int i_2426_ = ((((Class57_Sub1_Sub1) this).anInt8990 << 16) + i_2424_ - 1) / i_2424_;
					i += i_2426_;
					i_2419_ += (i_2426_ * i_2424_ - (((Class57_Sub1_Sub1) this).anInt8990 << 16));
				}
				if (((Class57_Sub1_Sub1) this).anInt9000 > 0) {
					int i_2427_ = ((((Class57_Sub1_Sub1) this).anInt9000 << 16) + i_2425_ - 1) / i_2425_;
					i_2412_ += i_2427_;
					i_2420_ += (i_2427_ * i_2425_ - (((Class57_Sub1_Sub1) this).anInt9000 << 16));
				}
				if (((Class57_Sub1_Sub1) this).anInt9010 < i_2422_)
					i_2413_ = ((((Class57_Sub1_Sub1) this).anInt9010 << 16) - i_2419_ + i_2424_ - 1) / i_2424_;
				if (((Class57_Sub1_Sub1) this).anInt8989 < i_2423_)
					i_2414_ = ((((Class57_Sub1_Sub1) this).anInt8989 << 16) - i_2420_ + i_2425_ - 1) / i_2425_;
				int i_2428_ = i + i_2412_ * i_2421_;
				int i_2429_ = i_2421_ - i_2413_;
				if (i_2412_ + i_2414_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7977 * 63686679))
					i_2414_ -= (i_2412_ + i_2414_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7977) * 63686679);
				if (i_2412_ < (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805) {
					int i_2430_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_2412_;
					i_2414_ -= i_2430_;
					i_2428_ += i_2430_ * i_2421_;
					i_2420_ += i_2425_ * i_2430_;
				}
				if (i + i_2413_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725) {
					int i_2431_ = (i + i_2413_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725);
					i_2413_ -= i_2431_;
					i_2429_ += i_2431_;
				}
				if (i < (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7974 * -912871679)) {
					int i_2432_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i;
					i_2413_ -= i_2432_;
					i_2428_ += i_2432_;
					i_2419_ += i_2424_ * i_2432_;
					i_2429_ += i_2432_;
				}
				if (i_2417_ == 0) {
					if (i_2415_ == 1) {
						int i_2433_ = i_2419_;
						for (int i_2434_ = -i_2414_; i_2434_ < 0; i_2434_++) {
							int i_2435_ = ((i_2420_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_2436_ = -i_2413_; i_2436_ < 0; i_2436_++) {
								is[i_2428_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_2419_ >> 16) + i_2435_]);
								i_2419_ += i_2424_;
							}
							i_2420_ += i_2425_;
							i_2419_ = i_2433_;
							i_2428_ += i_2429_;
						}
					} else if (i_2415_ == 0) {
						int i_2437_ = (i_2416_ & 0xff0000) >> 16;
						int i_2438_ = (i_2416_ & 0xff00) >> 8;
						int i_2439_ = i_2416_ & 0xff;
						int i_2440_ = i_2419_;
						for (int i_2441_ = -i_2414_; i_2441_ < 0; i_2441_++) {
							int i_2442_ = ((i_2420_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_2443_ = -i_2413_; i_2443_ < 0; i_2443_++) {
								int i_2444_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_2419_ >> 16) + i_2442_]);
								int i_2445_ = ((i_2444_ & 0xff0000) * i_2437_ & ~0xffffff);
								int i_2446_ = (i_2444_ & 0xff00) * i_2438_ & 0xff0000;
								int i_2447_ = (i_2444_ & 0xff) * i_2439_ & 0xff00;
								is[i_2428_++] = (i_2445_ | i_2446_ | i_2447_) >>> 8;
								i_2419_ += i_2424_;
							}
							i_2420_ += i_2425_;
							i_2419_ = i_2440_;
							i_2428_ += i_2429_;
						}
					} else if (i_2415_ == 3) {
						int i_2448_ = i_2419_;
						for (int i_2449_ = -i_2414_; i_2449_ < 0; i_2449_++) {
							int i_2450_ = ((i_2420_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_2451_ = -i_2413_; i_2451_ < 0; i_2451_++) {
								int i_2452_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_2419_ >> 16) + i_2450_]);
								int i_2453_ = i_2452_ + i_2416_;
								int i_2454_ = ((i_2452_ & 0xff00ff) + (i_2416_ & 0xff00ff));
								int i_2455_ = ((i_2454_ & 0x1000100) + (i_2453_ - i_2454_ & 0x10000));
								is[i_2428_++] = i_2453_ - i_2455_ | i_2455_ - (i_2455_ >>> 8);
								i_2419_ += i_2424_;
							}
							i_2420_ += i_2425_;
							i_2419_ = i_2448_;
							i_2428_ += i_2429_;
						}
					} else if (i_2415_ == 2) {
						int i_2456_ = i_2416_ >>> 24;
						int i_2457_ = 256 - i_2456_;
						int i_2458_ = (i_2416_ & 0xff00ff) * i_2457_ & ~0xff00ff;
						int i_2459_ = (i_2416_ & 0xff00) * i_2457_ & 0xff0000;
						i_2416_ = (i_2458_ | i_2459_) >>> 8;
						int i_2460_ = i_2419_;
						for (int i_2461_ = -i_2414_; i_2461_ < 0; i_2461_++) {
							int i_2462_ = ((i_2420_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_2463_ = -i_2413_; i_2463_ < 0; i_2463_++) {
								int i_2464_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_2419_ >> 16) + i_2462_]);
								i_2458_ = ((i_2464_ & 0xff00ff) * i_2456_ & ~0xff00ff);
								i_2459_ = (i_2464_ & 0xff00) * i_2456_ & 0xff0000;
								is[i_2428_++] = ((i_2458_ | i_2459_) >>> 8) + i_2416_;
								i_2419_ += i_2424_;
							}
							i_2420_ += i_2425_;
							i_2419_ = i_2460_;
							i_2428_ += i_2429_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2417_ == 1) {
					if (i_2415_ == 1) {
						int i_2465_ = i_2419_;
						for (int i_2466_ = -i_2414_; i_2466_ < 0; i_2466_++) {
							int i_2467_ = ((i_2420_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_2468_ = -i_2413_; i_2468_ < 0; i_2468_++) {
								int i_2469_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_2419_ >> 16) + i_2467_]);
								int i_2470_ = i_2469_ >>> 24;
								int i_2471_ = 256 - i_2470_;
								int i_2472_ = is[i_2428_];
								is[i_2428_++] = (((((i_2469_ & 0xff00ff) * i_2470_ + (i_2472_ & 0xff00ff) * i_2471_) & ~0xff00ff) >> 8) + (((((i_2469_ & ~0xff00ff) >>> 8) * i_2470_) + (((i_2472_ & ~0xff00ff) >>> 8) * i_2471_)) & ~0xff00ff));
								i_2419_ += i_2424_;
							}
							i_2420_ += i_2425_;
							i_2419_ = i_2465_;
							i_2428_ += i_2429_;
						}
					} else if (i_2415_ == 0) {
						int i_2473_ = i_2419_;
						if ((i_2416_ & 0xffffff) == 16777215) {
							for (int i_2474_ = -i_2414_; i_2474_ < 0; i_2474_++) {
								int i_2475_ = ((i_2420_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
								for (int i_2476_ = -i_2413_; i_2476_ < 0; i_2476_++) {
									int i_2477_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_2419_ >> 16) + i_2475_]);
									int i_2478_ = ((i_2477_ >>> 24) * (i_2416_ >>> 24) >> 8);
									int i_2479_ = 256 - i_2478_;
									int i_2480_ = is[i_2428_];
									is[i_2428_++] = ((((i_2477_ & 0xff00ff) * i_2478_ + (i_2480_ & 0xff00ff) * i_2479_) & ~0xff00ff) + (((i_2477_ & 0xff00) * i_2478_ + (i_2480_ & 0xff00) * i_2479_) & 0xff0000)) >> 8;
									i_2419_ += i_2424_;
								}
								i_2420_ += i_2425_;
								i_2419_ = i_2473_;
								i_2428_ += i_2429_;
							}
						} else {
							int i_2481_ = (i_2416_ & 0xff0000) >> 16;
							int i_2482_ = (i_2416_ & 0xff00) >> 8;
							int i_2483_ = i_2416_ & 0xff;
							for (int i_2484_ = -i_2414_; i_2484_ < 0; i_2484_++) {
								int i_2485_ = ((i_2420_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
								for (int i_2486_ = -i_2413_; i_2486_ < 0; i_2486_++) {
									int i_2487_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_2419_ >> 16) + i_2485_]);
									int i_2488_ = ((i_2487_ >>> 24) * (i_2416_ >>> 24) >> 8);
									int i_2489_ = 256 - i_2488_;
									if (i_2488_ != 255) {
										int i_2490_ = ((i_2487_ & 0xff0000) * i_2481_ & ~0xffffff);
										int i_2491_ = ((i_2487_ & 0xff00) * i_2482_ & 0xff0000);
										int i_2492_ = ((i_2487_ & 0xff) * i_2483_ & 0xff00);
										i_2487_ = (i_2490_ | i_2491_ | i_2492_) >>> 8;
										int i_2493_ = is[i_2428_];
										is[i_2428_++] = ((((i_2487_ & 0xff00ff) * i_2488_ + ((i_2493_ & 0xff00ff) * i_2489_)) & ~0xff00ff) + (((i_2487_ & 0xff00) * i_2488_ + ((i_2493_ & 0xff00) * i_2489_)) & 0xff0000)) >> 8;
									} else {
										int i_2494_ = ((i_2487_ & 0xff0000) * i_2481_ & ~0xffffff);
										int i_2495_ = ((i_2487_ & 0xff00) * i_2482_ & 0xff0000);
										int i_2496_ = ((i_2487_ & 0xff) * i_2483_ & 0xff00);
										is[i_2428_++] = (i_2494_ | i_2495_ | i_2496_) >>> 8;
									}
									i_2419_ += i_2424_;
								}
								i_2420_ += i_2425_;
								i_2419_ = i_2473_;
								i_2428_ += i_2429_;
							}
						}
					} else if (i_2415_ == 3) {
						int i_2497_ = i_2419_;
						for (int i_2498_ = -i_2414_; i_2498_ < 0; i_2498_++) {
							int i_2499_ = ((i_2420_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_2500_ = -i_2413_; i_2500_ < 0; i_2500_++) {
								int i_2501_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_2419_ >> 16) + i_2499_]);
								int i_2502_ = i_2501_ + i_2416_;
								int i_2503_ = ((i_2501_ & 0xff00ff) + (i_2416_ & 0xff00ff));
								int i_2504_ = ((i_2503_ & 0x1000100) + (i_2502_ - i_2503_ & 0x10000));
								i_2504_ = i_2502_ - i_2504_ | i_2504_ - (i_2504_ >>> 8);
								int i_2505_ = (i_2504_ >>> 24) * (i_2416_ >>> 24) >> 8;
								int i_2506_ = 256 - i_2505_;
								if (i_2505_ != 255) {
									i_2501_ = i_2504_;
									i_2504_ = is[i_2428_];
									i_2504_ = ((((i_2501_ & 0xff00ff) * i_2505_ + (i_2504_ & 0xff00ff) * i_2506_) & ~0xff00ff) + (((i_2501_ & 0xff00) * i_2505_ + (i_2504_ & 0xff00) * i_2506_) & 0xff0000)) >> 8;
								}
								is[i_2428_++] = i_2504_;
								i_2419_ += i_2424_;
							}
							i_2420_ += i_2425_;
							i_2419_ = i_2497_;
							i_2428_ += i_2429_;
						}
					} else if (i_2415_ == 2) {
						int i_2507_ = i_2416_ >>> 24;
						int i_2508_ = 256 - i_2507_;
						int i_2509_ = (i_2416_ & 0xff00ff) * i_2508_ & ~0xff00ff;
						int i_2510_ = (i_2416_ & 0xff00) * i_2508_ & 0xff0000;
						i_2416_ = (i_2509_ | i_2510_) >>> 8;
						int i_2511_ = i_2419_;
						for (int i_2512_ = -i_2414_; i_2512_ < 0; i_2512_++) {
							int i_2513_ = ((i_2420_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_2514_ = -i_2413_; i_2514_ < 0; i_2514_++) {
								int i_2515_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_2419_ >> 16) + i_2513_]);
								int i_2516_ = i_2515_ >>> 24;
								int i_2517_ = 256 - i_2516_;
								i_2509_ = ((i_2515_ & 0xff00ff) * i_2507_ & ~0xff00ff);
								i_2510_ = (i_2515_ & 0xff00) * i_2507_ & 0xff0000;
								i_2515_ = ((i_2509_ | i_2510_) >>> 8) + i_2416_;
								int i_2518_ = is[i_2428_];
								is[i_2428_++] = ((((i_2515_ & 0xff00ff) * i_2516_ + (i_2518_ & 0xff00ff) * i_2517_) & ~0xff00ff) + (((i_2515_ & 0xff00) * i_2516_ + (i_2518_ & 0xff00) * i_2517_) & 0xff0000)) >> 8;
								i_2419_ += i_2424_;
							}
							i_2420_ += i_2425_;
							i_2419_ = i_2511_;
							i_2428_ += i_2429_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2417_ == 2) {
					if (i_2415_ == 1) {
						int i_2519_ = i_2419_;
						for (int i_2520_ = -i_2414_; i_2520_ < 0; i_2520_++) {
							int i_2521_ = ((i_2420_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_2522_ = -i_2413_; i_2522_ < 0; i_2522_++) {
								int i_2523_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_2419_ >> 16) + i_2521_]);
								if (i_2523_ != 0) {
									int i_2524_ = is[i_2428_];
									int i_2525_ = i_2523_ + i_2524_;
									int i_2526_ = ((i_2523_ & 0xff00ff) + (i_2524_ & 0xff00ff));
									i_2524_ = ((i_2526_ & 0x1000100) + (i_2525_ - i_2526_ & 0x10000));
									is[i_2428_++] = (i_2525_ - i_2524_ | i_2524_ - (i_2524_ >>> 8));
								} else
									i_2428_++;
								i_2419_ += i_2424_;
							}
							i_2420_ += i_2425_;
							i_2419_ = i_2519_;
							i_2428_ += i_2429_;
						}
					} else if (i_2415_ == 0) {
						int i_2527_ = i_2419_;
						int i_2528_ = (i_2416_ & 0xff0000) >> 16;
						int i_2529_ = (i_2416_ & 0xff00) >> 8;
						int i_2530_ = i_2416_ & 0xff;
						for (int i_2531_ = -i_2414_; i_2531_ < 0; i_2531_++) {
							int i_2532_ = ((i_2420_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_2533_ = -i_2413_; i_2533_ < 0; i_2533_++) {
								int i_2534_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_2419_ >> 16) + i_2532_]);
								if (i_2534_ != 0) {
									int i_2535_ = ((i_2534_ & 0xff0000) * i_2528_ & ~0xffffff);
									int i_2536_ = ((i_2534_ & 0xff00) * i_2529_ & 0xff0000);
									int i_2537_ = (i_2534_ & 0xff) * i_2530_ & 0xff00;
									i_2534_ = (i_2535_ | i_2536_ | i_2537_) >>> 8;
									int i_2538_ = is[i_2428_];
									int i_2539_ = i_2534_ + i_2538_;
									int i_2540_ = ((i_2534_ & 0xff00ff) + (i_2538_ & 0xff00ff));
									i_2538_ = ((i_2540_ & 0x1000100) + (i_2539_ - i_2540_ & 0x10000));
									is[i_2428_++] = (i_2539_ - i_2538_ | i_2538_ - (i_2538_ >>> 8));
								} else
									i_2428_++;
								i_2419_ += i_2424_;
							}
							i_2420_ += i_2425_;
							i_2419_ = i_2527_;
							i_2428_ += i_2429_;
						}
					} else if (i_2415_ == 3) {
						int i_2541_ = i_2419_;
						for (int i_2542_ = -i_2414_; i_2542_ < 0; i_2542_++) {
							int i_2543_ = ((i_2420_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_2544_ = -i_2413_; i_2544_ < 0; i_2544_++) {
								int i_2545_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_2419_ >> 16) + i_2543_]);
								int i_2546_ = i_2545_ + i_2416_;
								int i_2547_ = ((i_2545_ & 0xff00ff) + (i_2416_ & 0xff00ff));
								int i_2548_ = ((i_2547_ & 0x1000100) + (i_2546_ - i_2547_ & 0x10000));
								i_2545_ = i_2546_ - i_2548_ | i_2548_ - (i_2548_ >>> 8);
								i_2548_ = is[i_2428_];
								i_2546_ = i_2545_ + i_2548_;
								i_2547_ = (i_2545_ & 0xff00ff) + (i_2548_ & 0xff00ff);
								i_2548_ = ((i_2547_ & 0x1000100) + (i_2546_ - i_2547_ & 0x10000));
								is[i_2428_++] = i_2546_ - i_2548_ | i_2548_ - (i_2548_ >>> 8);
								i_2419_ += i_2424_;
							}
							i_2420_ += i_2425_;
							i_2419_ = i_2541_;
							i_2428_ += i_2429_;
						}
					} else if (i_2415_ == 2) {
						int i_2549_ = i_2416_ >>> 24;
						int i_2550_ = 256 - i_2549_;
						int i_2551_ = (i_2416_ & 0xff00ff) * i_2550_ & ~0xff00ff;
						int i_2552_ = (i_2416_ & 0xff00) * i_2550_ & 0xff0000;
						i_2416_ = (i_2551_ | i_2552_) >>> 8;
						int i_2553_ = i_2419_;
						for (int i_2554_ = -i_2414_; i_2554_ < 0; i_2554_++) {
							int i_2555_ = ((i_2420_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_2556_ = -i_2413_; i_2556_ < 0; i_2556_++) {
								int i_2557_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_2419_ >> 16) + i_2555_]);
								if (i_2557_ != 0) {
									i_2551_ = ((i_2557_ & 0xff00ff) * i_2549_ & ~0xff00ff);
									i_2552_ = ((i_2557_ & 0xff00) * i_2549_ & 0xff0000);
									i_2557_ = (((i_2551_ | i_2552_) >>> 8) + i_2416_);
									int i_2558_ = is[i_2428_];
									int i_2559_ = i_2557_ + i_2558_;
									int i_2560_ = ((i_2557_ & 0xff00ff) + (i_2558_ & 0xff00ff));
									i_2558_ = ((i_2560_ & 0x1000100) + (i_2559_ - i_2560_ & 0x10000));
									is[i_2428_++] = (i_2559_ - i_2558_ | i_2558_ - (i_2558_ >>> 8));
								} else
									i_2428_++;
								i_2419_ += i_2424_;
							}
							i_2420_ += i_2425_;
							i_2419_ = i_2553_;
							i_2428_ += i_2429_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method648(int i, int i_2561_, int i_2562_, int i_2563_, int i_2564_) {
		if (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			int i_2565_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			i += ((Class57_Sub1_Sub1) this).anInt8990;
			i_2561_ += ((Class57_Sub1_Sub1) this).anInt9000;
			int i_2566_ = i_2561_ * i_2565_ + i;
			int i_2567_ = 0;
			int i_2568_ = ((Class57_Sub1_Sub1) this).anInt8989;
			int i_2569_ = ((Class57_Sub1_Sub1) this).anInt9010;
			int i_2570_ = i_2565_ - i_2569_;
			int i_2571_ = 0;
			if (i_2561_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_2572_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_2561_);
				i_2568_ -= i_2572_;
				i_2561_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_2567_ += i_2572_ * i_2569_;
				i_2566_ += i_2572_ * i_2565_;
			}
			if (i_2561_ + i_2568_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_2568_ -= (i_2561_ + i_2568_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_2573_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_2569_ -= i_2573_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_2567_ += i_2573_;
				i_2566_ += i_2573_;
				i_2571_ += i_2573_;
				i_2570_ += i_2573_;
			}
			if (i + i_2569_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_2574_ = (i + i_2569_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_2569_ -= i_2574_;
				i_2571_ += i_2574_;
				i_2570_ += i_2574_;
			}
			if (i_2569_ > 0 && i_2568_ > 0) {
				if (i_2564_ == 0) {
					if (i_2562_ == 1) {
						for (int i_2575_ = -i_2568_; i_2575_ < 0; i_2575_++) {
							int i_2576_ = i_2566_ + i_2569_ - 3;
							while (i_2566_ < i_2576_) {
								is[i_2566_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
								is[i_2566_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
								is[i_2566_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
								is[i_2566_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
							}
							i_2576_ += 3;
							while (i_2566_ < i_2576_)
								is[i_2566_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
							i_2566_ += i_2570_;
							i_2567_ += i_2571_;
						}
					} else if (i_2562_ == 0) {
						int i_2577_ = (i_2563_ & 0xff0000) >> 16;
						int i_2578_ = (i_2563_ & 0xff00) >> 8;
						int i_2579_ = i_2563_ & 0xff;
						for (int i_2580_ = -i_2568_; i_2580_ < 0; i_2580_++) {
							for (int i_2581_ = -i_2569_; i_2581_ < 0; i_2581_++) {
								int i_2582_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
								int i_2583_ = ((i_2582_ & 0xff0000) * i_2577_ & ~0xffffff);
								int i_2584_ = (i_2582_ & 0xff00) * i_2578_ & 0xff0000;
								int i_2585_ = (i_2582_ & 0xff) * i_2579_ & 0xff00;
								is[i_2566_++] = (i_2583_ | i_2584_ | i_2585_) >>> 8;
							}
							i_2566_ += i_2570_;
							i_2567_ += i_2571_;
						}
					} else if (i_2562_ == 3) {
						for (int i_2586_ = -i_2568_; i_2586_ < 0; i_2586_++) {
							for (int i_2587_ = -i_2569_; i_2587_ < 0; i_2587_++) {
								int i_2588_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
								int i_2589_ = i_2588_ + i_2563_;
								int i_2590_ = ((i_2588_ & 0xff00ff) + (i_2563_ & 0xff00ff));
								int i_2591_ = ((i_2590_ & 0x1000100) + (i_2589_ - i_2590_ & 0x10000));
								is[i_2566_++] = i_2589_ - i_2591_ | i_2591_ - (i_2591_ >>> 8);
							}
							i_2566_ += i_2570_;
							i_2567_ += i_2571_;
						}
					} else if (i_2562_ == 2) {
						int i_2592_ = i_2563_ >>> 24;
						int i_2593_ = 256 - i_2592_;
						int i_2594_ = (i_2563_ & 0xff00ff) * i_2593_ & ~0xff00ff;
						int i_2595_ = (i_2563_ & 0xff00) * i_2593_ & 0xff0000;
						i_2563_ = (i_2594_ | i_2595_) >>> 8;
						for (int i_2596_ = -i_2568_; i_2596_ < 0; i_2596_++) {
							for (int i_2597_ = -i_2569_; i_2597_ < 0; i_2597_++) {
								int i_2598_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
								i_2594_ = ((i_2598_ & 0xff00ff) * i_2592_ & ~0xff00ff);
								i_2595_ = (i_2598_ & 0xff00) * i_2592_ & 0xff0000;
								is[i_2566_++] = ((i_2594_ | i_2595_) >>> 8) + i_2563_;
							}
							i_2566_ += i_2570_;
							i_2567_ += i_2571_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2564_ == 1) {
					if (i_2562_ == 1) {
						for (int i_2599_ = -i_2568_; i_2599_ < 0; i_2599_++) {
							for (int i_2600_ = -i_2569_; i_2600_ < 0; i_2600_++) {
								int i_2601_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
								int i_2602_ = i_2601_ >>> 24;
								int i_2603_ = 256 - i_2602_;
								int i_2604_ = is[i_2566_];
								is[i_2566_++] = (((((i_2601_ & 0xff00ff) * i_2602_ + (i_2604_ & 0xff00ff) * i_2603_) & ~0xff00ff) >> 8) + (((((i_2601_ & ~0xff00ff) >>> 8) * i_2602_) + (((i_2604_ & ~0xff00ff) >>> 8) * i_2603_)) & ~0xff00ff));
							}
							i_2566_ += i_2570_;
							i_2567_ += i_2571_;
						}
					} else if (i_2562_ == 0) {
						if ((i_2563_ & 0xffffff) == 16777215) {
							for (int i_2605_ = -i_2568_; i_2605_ < 0; i_2605_++) {
								for (int i_2606_ = -i_2569_; i_2606_ < 0; i_2606_++) {
									int i_2607_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
									int i_2608_ = ((i_2607_ >>> 24) * (i_2563_ >>> 24) >> 8);
									int i_2609_ = 256 - i_2608_;
									int i_2610_ = is[i_2566_];
									is[i_2566_++] = ((((i_2607_ & 0xff00ff) * i_2608_ + (i_2610_ & 0xff00ff) * i_2609_) & ~0xff00ff) + (((i_2607_ & 0xff00) * i_2608_ + (i_2610_ & 0xff00) * i_2609_) & 0xff0000)) >> 8;
								}
								i_2566_ += i_2570_;
								i_2567_ += i_2571_;
							}
						} else {
							int i_2611_ = (i_2563_ & 0xff0000) >> 16;
							int i_2612_ = (i_2563_ & 0xff00) >> 8;
							int i_2613_ = i_2563_ & 0xff;
							for (int i_2614_ = -i_2568_; i_2614_ < 0; i_2614_++) {
								for (int i_2615_ = -i_2569_; i_2615_ < 0; i_2615_++) {
									int i_2616_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
									int i_2617_ = ((i_2616_ >>> 24) * (i_2563_ >>> 24) >> 8);
									int i_2618_ = 256 - i_2617_;
									if (i_2617_ != 255) {
										int i_2619_ = ((i_2616_ & 0xff0000) * i_2611_ & ~0xffffff);
										int i_2620_ = ((i_2616_ & 0xff00) * i_2612_ & 0xff0000);
										int i_2621_ = ((i_2616_ & 0xff) * i_2613_ & 0xff00);
										i_2616_ = (i_2619_ | i_2620_ | i_2621_) >>> 8;
										int i_2622_ = is[i_2566_];
										is[i_2566_++] = ((((i_2616_ & 0xff00ff) * i_2617_ + ((i_2622_ & 0xff00ff) * i_2618_)) & ~0xff00ff) + (((i_2616_ & 0xff00) * i_2617_ + ((i_2622_ & 0xff00) * i_2618_)) & 0xff0000)) >> 8;
									} else {
										int i_2623_ = ((i_2616_ & 0xff0000) * i_2611_ & ~0xffffff);
										int i_2624_ = ((i_2616_ & 0xff00) * i_2612_ & 0xff0000);
										int i_2625_ = ((i_2616_ & 0xff) * i_2613_ & 0xff00);
										is[i_2566_++] = (i_2623_ | i_2624_ | i_2625_) >>> 8;
									}
								}
								i_2566_ += i_2570_;
								i_2567_ += i_2571_;
							}
						}
					} else if (i_2562_ == 3) {
						for (int i_2626_ = -i_2568_; i_2626_ < 0; i_2626_++) {
							for (int i_2627_ = -i_2569_; i_2627_ < 0; i_2627_++) {
								int i_2628_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
								int i_2629_ = i_2628_ + i_2563_;
								int i_2630_ = ((i_2628_ & 0xff00ff) + (i_2563_ & 0xff00ff));
								int i_2631_ = ((i_2630_ & 0x1000100) + (i_2629_ - i_2630_ & 0x10000));
								i_2631_ = i_2629_ - i_2631_ | i_2631_ - (i_2631_ >>> 8);
								int i_2632_ = (i_2631_ >>> 24) * (i_2563_ >>> 24) >> 8;
								int i_2633_ = 256 - i_2632_;
								if (i_2632_ != 255) {
									i_2628_ = i_2631_;
									i_2631_ = is[i_2566_];
									i_2631_ = ((((i_2628_ & 0xff00ff) * i_2632_ + (i_2631_ & 0xff00ff) * i_2633_) & ~0xff00ff) + (((i_2628_ & 0xff00) * i_2632_ + (i_2631_ & 0xff00) * i_2633_) & 0xff0000)) >> 8;
								}
								is[i_2566_++] = i_2631_;
							}
							i_2566_ += i_2570_;
							i_2567_ += i_2571_;
						}
					} else if (i_2562_ == 2) {
						int i_2634_ = i_2563_ >>> 24;
						int i_2635_ = 256 - i_2634_;
						int i_2636_ = (i_2563_ & 0xff00ff) * i_2635_ & ~0xff00ff;
						int i_2637_ = (i_2563_ & 0xff00) * i_2635_ & 0xff0000;
						i_2563_ = (i_2636_ | i_2637_) >>> 8;
						for (int i_2638_ = -i_2568_; i_2638_ < 0; i_2638_++) {
							for (int i_2639_ = -i_2569_; i_2639_ < 0; i_2639_++) {
								int i_2640_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
								int i_2641_ = i_2640_ >>> 24;
								int i_2642_ = 256 - i_2641_;
								i_2636_ = ((i_2640_ & 0xff00ff) * i_2634_ & ~0xff00ff);
								i_2637_ = (i_2640_ & 0xff00) * i_2634_ & 0xff0000;
								i_2640_ = ((i_2636_ | i_2637_) >>> 8) + i_2563_;
								int i_2643_ = is[i_2566_];
								is[i_2566_++] = ((((i_2640_ & 0xff00ff) * i_2641_ + (i_2643_ & 0xff00ff) * i_2642_) & ~0xff00ff) + (((i_2640_ & 0xff00) * i_2641_ + (i_2643_ & 0xff00) * i_2642_) & 0xff0000)) >> 8;
							}
							i_2566_ += i_2570_;
							i_2567_ += i_2571_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2564_ == 2) {
					if (i_2562_ == 1) {
						for (int i_2644_ = -i_2568_; i_2644_ < 0; i_2644_++) {
							for (int i_2645_ = -i_2569_; i_2645_ < 0; i_2645_++) {
								int i_2646_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
								if (i_2646_ != 0) {
									int i_2647_ = is[i_2566_];
									int i_2648_ = i_2646_ + i_2647_;
									int i_2649_ = ((i_2646_ & 0xff00ff) + (i_2647_ & 0xff00ff));
									i_2647_ = ((i_2649_ & 0x1000100) + (i_2648_ - i_2649_ & 0x10000));
									is[i_2566_++] = (i_2648_ - i_2647_ | i_2647_ - (i_2647_ >>> 8));
								} else
									i_2566_++;
							}
							i_2566_ += i_2570_;
							i_2567_ += i_2571_;
						}
					} else if (i_2562_ == 0) {
						int i_2650_ = (i_2563_ & 0xff0000) >> 16;
						int i_2651_ = (i_2563_ & 0xff00) >> 8;
						int i_2652_ = i_2563_ & 0xff;
						for (int i_2653_ = -i_2568_; i_2653_ < 0; i_2653_++) {
							for (int i_2654_ = -i_2569_; i_2654_ < 0; i_2654_++) {
								int i_2655_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
								if (i_2655_ != 0) {
									int i_2656_ = ((i_2655_ & 0xff0000) * i_2650_ & ~0xffffff);
									int i_2657_ = ((i_2655_ & 0xff00) * i_2651_ & 0xff0000);
									int i_2658_ = (i_2655_ & 0xff) * i_2652_ & 0xff00;
									i_2655_ = (i_2656_ | i_2657_ | i_2658_) >>> 8;
									int i_2659_ = is[i_2566_];
									int i_2660_ = i_2655_ + i_2659_;
									int i_2661_ = ((i_2655_ & 0xff00ff) + (i_2659_ & 0xff00ff));
									i_2659_ = ((i_2661_ & 0x1000100) + (i_2660_ - i_2661_ & 0x10000));
									is[i_2566_++] = (i_2660_ - i_2659_ | i_2659_ - (i_2659_ >>> 8));
								} else
									i_2566_++;
							}
							i_2566_ += i_2570_;
							i_2567_ += i_2571_;
						}
					} else if (i_2562_ == 3) {
						for (int i_2662_ = -i_2568_; i_2662_ < 0; i_2662_++) {
							for (int i_2663_ = -i_2569_; i_2663_ < 0; i_2663_++) {
								int i_2664_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
								int i_2665_ = i_2664_ + i_2563_;
								int i_2666_ = ((i_2664_ & 0xff00ff) + (i_2563_ & 0xff00ff));
								int i_2667_ = ((i_2666_ & 0x1000100) + (i_2665_ - i_2666_ & 0x10000));
								i_2664_ = i_2665_ - i_2667_ | i_2667_ - (i_2667_ >>> 8);
								i_2667_ = is[i_2566_];
								i_2665_ = i_2664_ + i_2667_;
								i_2666_ = (i_2664_ & 0xff00ff) + (i_2667_ & 0xff00ff);
								i_2667_ = ((i_2666_ & 0x1000100) + (i_2665_ - i_2666_ & 0x10000));
								is[i_2566_++] = i_2665_ - i_2667_ | i_2667_ - (i_2667_ >>> 8);
							}
							i_2566_ += i_2570_;
							i_2567_ += i_2571_;
						}
					} else if (i_2562_ == 2) {
						int i_2668_ = i_2563_ >>> 24;
						int i_2669_ = 256 - i_2668_;
						int i_2670_ = (i_2563_ & 0xff00ff) * i_2669_ & ~0xff00ff;
						int i_2671_ = (i_2563_ & 0xff00) * i_2669_ & 0xff0000;
						i_2563_ = (i_2670_ | i_2671_) >>> 8;
						for (int i_2672_ = -i_2568_; i_2672_ < 0; i_2672_++) {
							for (int i_2673_ = -i_2569_; i_2673_ < 0; i_2673_++) {
								int i_2674_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2567_++]);
								if (i_2674_ != 0) {
									i_2670_ = ((i_2674_ & 0xff00ff) * i_2668_ & ~0xff00ff);
									i_2671_ = ((i_2674_ & 0xff00) * i_2668_ & 0xff0000);
									i_2674_ = (((i_2670_ | i_2671_) >>> 8) + i_2563_);
									int i_2675_ = is[i_2566_];
									int i_2676_ = i_2674_ + i_2675_;
									int i_2677_ = ((i_2674_ & 0xff00ff) + (i_2675_ & 0xff00ff));
									i_2675_ = ((i_2677_ & 0x1000100) + (i_2676_ - i_2677_ & 0x10000));
									is[i_2566_++] = (i_2676_ - i_2675_ | i_2675_ - (i_2675_ >>> 8));
								} else
									i_2566_++;
							}
							i_2566_ += i_2570_;
							i_2567_ += i_2571_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method687(int i, int i_2678_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_2679_ = anInt9001;
					while (i_2679_ < 0) {
						int i_2680_ = anInt9003;
						int i_2681_ = anInt8988;
						int i_2682_ = anInt9011;
						int i_2683_ = anInt8999;
						if (i_2681_ >= 0 && i_2682_ >= 0 && i_2681_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) < 0 && i_2682_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) < 0) {
							for (/**/; i_2683_ < 0; i_2683_++) {
								int i_2684_ = (((i_2682_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_2681_ >> 12));
								int i_2685_ = i_2680_++;
								if (i_2678_ == 0) {
									if (i == 1)
										is[i_2685_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2684_]);
									else if (i == 0) {
										int i_2686_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2684_++]);
										int i_2687_ = ((i_2686_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2688_ = ((i_2686_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2689_ = ((i_2686_ & 0xff) * anInt9019 & 0xff00);
										is[i_2685_] = (i_2687_ | i_2688_ | i_2689_) >>> 8;
									} else if (i == 3) {
										int i_2690_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2684_++]);
										int i_2691_ = anInt9014;
										int i_2692_ = i_2690_ + i_2691_;
										int i_2693_ = ((i_2690_ & 0xff00ff) + (i_2691_ & 0xff00ff));
										int i_2694_ = ((i_2693_ & 0x1000100) + (i_2692_ - i_2693_ & 0x10000));
										is[i_2685_] = (i_2692_ - i_2694_ | i_2694_ - (i_2694_ >>> 8));
									} else if (i == 2) {
										int i_2695_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2684_]);
										int i_2696_ = ((i_2695_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2697_ = ((i_2695_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_2685_] = ((i_2696_ | i_2697_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_2678_ == 1) {
									if (i == 1) {
										int i_2698_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2684_]);
										int i_2699_ = i_2698_ >>> 24;
										int i_2700_ = 256 - i_2699_;
										int i_2701_ = is[i_2685_];
										is[i_2685_] = ((((i_2698_ & 0xff00ff) * i_2699_ + ((i_2701_ & 0xff00ff) * i_2700_)) & ~0xff00ff) + (((i_2698_ & 0xff00) * i_2699_ + ((i_2701_ & 0xff00) * i_2700_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_2702_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2684_]);
										int i_2703_ = ((i_2702_ >>> 24) * anInt9015 >> 8);
										int i_2704_ = 256 - i_2703_;
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_2705_ = is[i_2685_];
											is[i_2685_] = (((((i_2702_ & 0xff00ff) * i_2703_) + ((i_2705_ & 0xff00ff) * i_2704_)) & ~0xff00ff) + ((((i_2702_ & 0xff00) * i_2703_) + ((i_2705_ & 0xff00) * i_2704_)) & 0xff0000)) >> 8;
										} else if (i_2703_ != 255) {
											int i_2706_ = (((i_2702_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2707_ = (((i_2702_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2708_ = ((i_2702_ & 0xff) * anInt9019 & 0xff00);
											i_2702_ = (i_2706_ | i_2707_ | i_2708_) >>> 8;
											int i_2709_ = is[i_2685_];
											is[i_2685_] = (((((i_2702_ & 0xff00ff) * i_2703_) + ((i_2709_ & 0xff00ff) * i_2704_)) & ~0xff00ff) + ((((i_2702_ & 0xff00) * i_2703_) + ((i_2709_ & 0xff00) * i_2704_)) & 0xff0000)) >> 8;
										} else {
											int i_2710_ = (((i_2702_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2711_ = (((i_2702_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2712_ = ((i_2702_ & 0xff) * anInt9019 & 0xff00);
											is[i_2685_] = (i_2710_ | i_2711_ | i_2712_) >>> 8;
										}
									} else if (i == 3) {
										int i_2713_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2684_]);
										int i_2714_ = anInt9014;
										int i_2715_ = i_2713_ + i_2714_;
										int i_2716_ = ((i_2713_ & 0xff00ff) + (i_2714_ & 0xff00ff));
										int i_2717_ = ((i_2716_ & 0x1000100) + (i_2715_ - i_2716_ & 0x10000));
										i_2717_ = (i_2715_ - i_2717_ | i_2717_ - (i_2717_ >>> 8));
										int i_2718_ = ((i_2713_ >>> 24) * anInt9015 >> 8);
										int i_2719_ = 256 - i_2718_;
										if (i_2718_ != 255) {
											i_2713_ = i_2717_;
											i_2717_ = is[i_2685_];
											i_2717_ = (((((i_2713_ & 0xff00ff) * i_2718_) + ((i_2717_ & 0xff00ff) * i_2719_)) & ~0xff00ff) + ((((i_2713_ & 0xff00) * i_2718_) + ((i_2717_ & 0xff00) * i_2719_)) & 0xff0000)) >> 8;
										}
										is[i_2685_] = i_2717_;
									} else if (i == 2) {
										int i_2720_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2684_]);
										int i_2721_ = i_2720_ >>> 24;
										int i_2722_ = 256 - i_2721_;
										int i_2723_ = ((i_2720_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2724_ = ((i_2720_ & 0xff00) * anInt9015 & 0xff0000);
										i_2720_ = (((i_2723_ | i_2724_) >>> 8) + anInt9022);
										int i_2725_ = is[i_2685_];
										is[i_2685_] = ((((i_2720_ & 0xff00ff) * i_2721_ + ((i_2725_ & 0xff00ff) * i_2722_)) & ~0xff00ff) + (((i_2720_ & 0xff00) * i_2721_ + ((i_2725_ & 0xff00) * i_2722_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_2678_ == 2) {
									if (i == 1) {
										int i_2726_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2684_]);
										int i_2727_ = is[i_2685_];
										int i_2728_ = i_2726_ + i_2727_;
										int i_2729_ = ((i_2726_ & 0xff00ff) + (i_2727_ & 0xff00ff));
										i_2727_ = ((i_2729_ & 0x1000100) + (i_2728_ - i_2729_ & 0x10000));
										is[i_2685_] = (i_2728_ - i_2727_ | i_2727_ - (i_2727_ >>> 8));
									} else if (i == 0) {
										int i_2730_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2684_]);
										int i_2731_ = ((i_2730_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2732_ = ((i_2730_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2733_ = ((i_2730_ & 0xff) * anInt9019 & 0xff00);
										i_2730_ = (i_2731_ | i_2732_ | i_2733_) >>> 8;
										int i_2734_ = is[i_2685_];
										int i_2735_ = i_2730_ + i_2734_;
										int i_2736_ = ((i_2730_ & 0xff00ff) + (i_2734_ & 0xff00ff));
										i_2734_ = ((i_2736_ & 0x1000100) + (i_2735_ - i_2736_ & 0x10000));
										is[i_2685_] = (i_2735_ - i_2734_ | i_2734_ - (i_2734_ >>> 8));
									} else if (i == 3) {
										int i_2737_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2684_]);
										int i_2738_ = anInt9014;
										int i_2739_ = i_2737_ + i_2738_;
										int i_2740_ = ((i_2737_ & 0xff00ff) + (i_2738_ & 0xff00ff));
										int i_2741_ = ((i_2740_ & 0x1000100) + (i_2739_ - i_2740_ & 0x10000));
										i_2737_ = (i_2739_ - i_2741_ | i_2741_ - (i_2741_ >>> 8));
										i_2741_ = is[i_2685_];
										i_2739_ = i_2737_ + i_2741_;
										i_2740_ = ((i_2737_ & 0xff00ff) + (i_2741_ & 0xff00ff));
										i_2741_ = ((i_2740_ & 0x1000100) + (i_2739_ - i_2740_ & 0x10000));
										is[i_2685_] = (i_2739_ - i_2741_ | i_2741_ - (i_2741_ >>> 8));
									} else if (i == 2) {
										int i_2742_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2684_]);
										int i_2743_ = ((i_2742_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2744_ = ((i_2742_ & 0xff00) * anInt9015 & 0xff0000);
										i_2742_ = (((i_2743_ | i_2744_) >>> 8) + anInt9022);
										int i_2745_ = is[i_2685_];
										int i_2746_ = i_2742_ + i_2745_;
										int i_2747_ = ((i_2742_ & 0xff00ff) + (i_2745_ & 0xff00ff));
										i_2745_ = ((i_2747_ & 0x1000100) + (i_2746_ - i_2747_ & 0x10000));
										is[i_2685_] = (i_2746_ - i_2745_ | i_2745_ - (i_2745_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_2679_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_2748_ = anInt9001;
					while (i_2748_ < 0) {
						int i_2749_ = anInt9003;
						int i_2750_ = anInt8988;
						int i_2751_ = anInt9011 + anInt9013;
						int i_2752_ = anInt8999;
						if (i_2750_ >= 0 && i_2750_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) < 0) {
							int i_2753_;
							if ((i_2753_ = (i_2751_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12))) >= 0) {
								i_2753_ = (anInt8991 - i_2753_) / anInt8991;
								i_2752_ += i_2753_;
								i_2751_ += anInt8991 * i_2753_;
								i_2749_ += i_2753_;
							}
							if ((i_2753_ = (i_2751_ - anInt8991) / anInt8991) > i_2752_)
								i_2752_ = i_2753_;
							for (/**/; i_2752_ < 0; i_2752_++) {
								int i_2754_ = (((i_2751_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_2750_ >> 12));
								int i_2755_ = i_2749_++;
								if (i_2678_ == 0) {
									if (i == 1)
										is[i_2755_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2754_]);
									else if (i == 0) {
										int i_2756_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2754_++]);
										int i_2757_ = ((i_2756_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2758_ = ((i_2756_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2759_ = ((i_2756_ & 0xff) * anInt9019 & 0xff00);
										is[i_2755_] = (i_2757_ | i_2758_ | i_2759_) >>> 8;
									} else if (i == 3) {
										int i_2760_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2754_++]);
										int i_2761_ = anInt9014;
										int i_2762_ = i_2760_ + i_2761_;
										int i_2763_ = ((i_2760_ & 0xff00ff) + (i_2761_ & 0xff00ff));
										int i_2764_ = ((i_2763_ & 0x1000100) + (i_2762_ - i_2763_ & 0x10000));
										is[i_2755_] = (i_2762_ - i_2764_ | i_2764_ - (i_2764_ >>> 8));
									} else if (i == 2) {
										int i_2765_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2754_]);
										int i_2766_ = ((i_2765_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2767_ = ((i_2765_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_2755_] = ((i_2766_ | i_2767_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_2678_ == 1) {
									if (i == 1) {
										int i_2768_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2754_]);
										int i_2769_ = i_2768_ >>> 24;
										int i_2770_ = 256 - i_2769_;
										int i_2771_ = is[i_2755_];
										is[i_2755_] = ((((i_2768_ & 0xff00ff) * i_2769_ + ((i_2771_ & 0xff00ff) * i_2770_)) & ~0xff00ff) + (((i_2768_ & 0xff00) * i_2769_ + ((i_2771_ & 0xff00) * i_2770_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_2772_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2754_]);
										int i_2773_ = ((i_2772_ >>> 24) * anInt9015 >> 8);
										int i_2774_ = 256 - i_2773_;
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_2775_ = is[i_2755_];
											is[i_2755_] = (((((i_2772_ & 0xff00ff) * i_2773_) + ((i_2775_ & 0xff00ff) * i_2774_)) & ~0xff00ff) + ((((i_2772_ & 0xff00) * i_2773_) + ((i_2775_ & 0xff00) * i_2774_)) & 0xff0000)) >> 8;
										} else if (i_2773_ != 255) {
											int i_2776_ = (((i_2772_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2777_ = (((i_2772_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2778_ = ((i_2772_ & 0xff) * anInt9019 & 0xff00);
											i_2772_ = (i_2776_ | i_2777_ | i_2778_) >>> 8;
											int i_2779_ = is[i_2755_];
											is[i_2755_] = (((((i_2772_ & 0xff00ff) * i_2773_) + ((i_2779_ & 0xff00ff) * i_2774_)) & ~0xff00ff) + ((((i_2772_ & 0xff00) * i_2773_) + ((i_2779_ & 0xff00) * i_2774_)) & 0xff0000)) >> 8;
										} else {
											int i_2780_ = (((i_2772_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2781_ = (((i_2772_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2782_ = ((i_2772_ & 0xff) * anInt9019 & 0xff00);
											is[i_2755_] = (i_2780_ | i_2781_ | i_2782_) >>> 8;
										}
									} else if (i == 3) {
										int i_2783_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2754_]);
										int i_2784_ = anInt9014;
										int i_2785_ = i_2783_ + i_2784_;
										int i_2786_ = ((i_2783_ & 0xff00ff) + (i_2784_ & 0xff00ff));
										int i_2787_ = ((i_2786_ & 0x1000100) + (i_2785_ - i_2786_ & 0x10000));
										i_2787_ = (i_2785_ - i_2787_ | i_2787_ - (i_2787_ >>> 8));
										int i_2788_ = ((i_2783_ >>> 24) * anInt9015 >> 8);
										int i_2789_ = 256 - i_2788_;
										if (i_2788_ != 255) {
											i_2783_ = i_2787_;
											i_2787_ = is[i_2755_];
											i_2787_ = (((((i_2783_ & 0xff00ff) * i_2788_) + ((i_2787_ & 0xff00ff) * i_2789_)) & ~0xff00ff) + ((((i_2783_ & 0xff00) * i_2788_) + ((i_2787_ & 0xff00) * i_2789_)) & 0xff0000)) >> 8;
										}
										is[i_2755_] = i_2787_;
									} else if (i == 2) {
										int i_2790_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2754_]);
										int i_2791_ = i_2790_ >>> 24;
										int i_2792_ = 256 - i_2791_;
										int i_2793_ = ((i_2790_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2794_ = ((i_2790_ & 0xff00) * anInt9015 & 0xff0000);
										i_2790_ = (((i_2793_ | i_2794_) >>> 8) + anInt9022);
										int i_2795_ = is[i_2755_];
										is[i_2755_] = ((((i_2790_ & 0xff00ff) * i_2791_ + ((i_2795_ & 0xff00ff) * i_2792_)) & ~0xff00ff) + (((i_2790_ & 0xff00) * i_2791_ + ((i_2795_ & 0xff00) * i_2792_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_2678_ == 2) {
									if (i == 1) {
										int i_2796_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2754_]);
										int i_2797_ = is[i_2755_];
										int i_2798_ = i_2796_ + i_2797_;
										int i_2799_ = ((i_2796_ & 0xff00ff) + (i_2797_ & 0xff00ff));
										i_2797_ = ((i_2799_ & 0x1000100) + (i_2798_ - i_2799_ & 0x10000));
										is[i_2755_] = (i_2798_ - i_2797_ | i_2797_ - (i_2797_ >>> 8));
									} else if (i == 0) {
										int i_2800_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2754_]);
										int i_2801_ = ((i_2800_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2802_ = ((i_2800_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2803_ = ((i_2800_ & 0xff) * anInt9019 & 0xff00);
										i_2800_ = (i_2801_ | i_2802_ | i_2803_) >>> 8;
										int i_2804_ = is[i_2755_];
										int i_2805_ = i_2800_ + i_2804_;
										int i_2806_ = ((i_2800_ & 0xff00ff) + (i_2804_ & 0xff00ff));
										i_2804_ = ((i_2806_ & 0x1000100) + (i_2805_ - i_2806_ & 0x10000));
										is[i_2755_] = (i_2805_ - i_2804_ | i_2804_ - (i_2804_ >>> 8));
									} else if (i == 3) {
										int i_2807_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2754_]);
										int i_2808_ = anInt9014;
										int i_2809_ = i_2807_ + i_2808_;
										int i_2810_ = ((i_2807_ & 0xff00ff) + (i_2808_ & 0xff00ff));
										int i_2811_ = ((i_2810_ & 0x1000100) + (i_2809_ - i_2810_ & 0x10000));
										i_2807_ = (i_2809_ - i_2811_ | i_2811_ - (i_2811_ >>> 8));
										i_2811_ = is[i_2755_];
										i_2809_ = i_2807_ + i_2811_;
										i_2810_ = ((i_2807_ & 0xff00ff) + (i_2811_ & 0xff00ff));
										i_2811_ = ((i_2810_ & 0x1000100) + (i_2809_ - i_2810_ & 0x10000));
										is[i_2755_] = (i_2809_ - i_2811_ | i_2811_ - (i_2811_ >>> 8));
									} else if (i == 2) {
										int i_2812_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2754_]);
										int i_2813_ = ((i_2812_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2814_ = ((i_2812_ & 0xff00) * anInt9015 & 0xff0000);
										i_2812_ = (((i_2813_ | i_2814_) >>> 8) + anInt9022);
										int i_2815_ = is[i_2755_];
										int i_2816_ = i_2812_ + i_2815_;
										int i_2817_ = ((i_2812_ & 0xff00ff) + (i_2815_ & 0xff00ff));
										i_2815_ = ((i_2817_ & 0x1000100) + (i_2816_ - i_2817_ & 0x10000));
										is[i_2755_] = (i_2816_ - i_2815_ | i_2815_ - (i_2815_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_2751_ += anInt8991;
							}
						}
						i_2748_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_2818_ = anInt9001;
					while (i_2818_ < 0) {
						int i_2819_ = anInt9003;
						int i_2820_ = anInt8988;
						int i_2821_ = anInt9011 + anInt9013;
						int i_2822_ = anInt8999;
						if (i_2820_ >= 0 && i_2820_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) < 0) {
							if (i_2821_ < 0) {
								int i_2823_ = (anInt8991 - 1 - i_2821_) / anInt8991;
								i_2822_ += i_2823_;
								i_2821_ += anInt8991 * i_2823_;
								i_2819_ += i_2823_;
							}
							int i_2824_;
							if ((i_2824_ = (1 + i_2821_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_2822_)
								i_2822_ = i_2824_;
							for (/**/; i_2822_ < 0; i_2822_++) {
								int i_2825_ = (((i_2821_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_2820_ >> 12));
								int i_2826_ = i_2819_++;
								if (i_2678_ == 0) {
									if (i == 1)
										is[i_2826_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2825_]);
									else if (i == 0) {
										int i_2827_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2825_++]);
										int i_2828_ = ((i_2827_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2829_ = ((i_2827_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2830_ = ((i_2827_ & 0xff) * anInt9019 & 0xff00);
										is[i_2826_] = (i_2828_ | i_2829_ | i_2830_) >>> 8;
									} else if (i == 3) {
										int i_2831_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2825_++]);
										int i_2832_ = anInt9014;
										int i_2833_ = i_2831_ + i_2832_;
										int i_2834_ = ((i_2831_ & 0xff00ff) + (i_2832_ & 0xff00ff));
										int i_2835_ = ((i_2834_ & 0x1000100) + (i_2833_ - i_2834_ & 0x10000));
										is[i_2826_] = (i_2833_ - i_2835_ | i_2835_ - (i_2835_ >>> 8));
									} else if (i == 2) {
										int i_2836_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2825_]);
										int i_2837_ = ((i_2836_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2838_ = ((i_2836_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_2826_] = ((i_2837_ | i_2838_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_2678_ == 1) {
									if (i == 1) {
										int i_2839_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2825_]);
										int i_2840_ = i_2839_ >>> 24;
										int i_2841_ = 256 - i_2840_;
										int i_2842_ = is[i_2826_];
										is[i_2826_] = ((((i_2839_ & 0xff00ff) * i_2840_ + ((i_2842_ & 0xff00ff) * i_2841_)) & ~0xff00ff) + (((i_2839_ & 0xff00) * i_2840_ + ((i_2842_ & 0xff00) * i_2841_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_2843_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2825_]);
										int i_2844_ = ((i_2843_ >>> 24) * anInt9015 >> 8);
										int i_2845_ = 256 - i_2844_;
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_2846_ = is[i_2826_];
											is[i_2826_] = (((((i_2843_ & 0xff00ff) * i_2844_) + ((i_2846_ & 0xff00ff) * i_2845_)) & ~0xff00ff) + ((((i_2843_ & 0xff00) * i_2844_) + ((i_2846_ & 0xff00) * i_2845_)) & 0xff0000)) >> 8;
										} else if (i_2844_ != 255) {
											int i_2847_ = (((i_2843_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2848_ = (((i_2843_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2849_ = ((i_2843_ & 0xff) * anInt9019 & 0xff00);
											i_2843_ = (i_2847_ | i_2848_ | i_2849_) >>> 8;
											int i_2850_ = is[i_2826_];
											is[i_2826_] = (((((i_2843_ & 0xff00ff) * i_2844_) + ((i_2850_ & 0xff00ff) * i_2845_)) & ~0xff00ff) + ((((i_2843_ & 0xff00) * i_2844_) + ((i_2850_ & 0xff00) * i_2845_)) & 0xff0000)) >> 8;
										} else {
											int i_2851_ = (((i_2843_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2852_ = (((i_2843_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2853_ = ((i_2843_ & 0xff) * anInt9019 & 0xff00);
											is[i_2826_] = (i_2851_ | i_2852_ | i_2853_) >>> 8;
										}
									} else if (i == 3) {
										int i_2854_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2825_]);
										int i_2855_ = anInt9014;
										int i_2856_ = i_2854_ + i_2855_;
										int i_2857_ = ((i_2854_ & 0xff00ff) + (i_2855_ & 0xff00ff));
										int i_2858_ = ((i_2857_ & 0x1000100) + (i_2856_ - i_2857_ & 0x10000));
										i_2858_ = (i_2856_ - i_2858_ | i_2858_ - (i_2858_ >>> 8));
										int i_2859_ = ((i_2854_ >>> 24) * anInt9015 >> 8);
										int i_2860_ = 256 - i_2859_;
										if (i_2859_ != 255) {
											i_2854_ = i_2858_;
											i_2858_ = is[i_2826_];
											i_2858_ = (((((i_2854_ & 0xff00ff) * i_2859_) + ((i_2858_ & 0xff00ff) * i_2860_)) & ~0xff00ff) + ((((i_2854_ & 0xff00) * i_2859_) + ((i_2858_ & 0xff00) * i_2860_)) & 0xff0000)) >> 8;
										}
										is[i_2826_] = i_2858_;
									} else if (i == 2) {
										int i_2861_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2825_]);
										int i_2862_ = i_2861_ >>> 24;
										int i_2863_ = 256 - i_2862_;
										int i_2864_ = ((i_2861_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2865_ = ((i_2861_ & 0xff00) * anInt9015 & 0xff0000);
										i_2861_ = (((i_2864_ | i_2865_) >>> 8) + anInt9022);
										int i_2866_ = is[i_2826_];
										is[i_2826_] = ((((i_2861_ & 0xff00ff) * i_2862_ + ((i_2866_ & 0xff00ff) * i_2863_)) & ~0xff00ff) + (((i_2861_ & 0xff00) * i_2862_ + ((i_2866_ & 0xff00) * i_2863_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_2678_ == 2) {
									if (i == 1) {
										int i_2867_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2825_]);
										int i_2868_ = is[i_2826_];
										int i_2869_ = i_2867_ + i_2868_;
										int i_2870_ = ((i_2867_ & 0xff00ff) + (i_2868_ & 0xff00ff));
										i_2868_ = ((i_2870_ & 0x1000100) + (i_2869_ - i_2870_ & 0x10000));
										is[i_2826_] = (i_2869_ - i_2868_ | i_2868_ - (i_2868_ >>> 8));
									} else if (i == 0) {
										int i_2871_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2825_]);
										int i_2872_ = ((i_2871_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2873_ = ((i_2871_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2874_ = ((i_2871_ & 0xff) * anInt9019 & 0xff00);
										i_2871_ = (i_2872_ | i_2873_ | i_2874_) >>> 8;
										int i_2875_ = is[i_2826_];
										int i_2876_ = i_2871_ + i_2875_;
										int i_2877_ = ((i_2871_ & 0xff00ff) + (i_2875_ & 0xff00ff));
										i_2875_ = ((i_2877_ & 0x1000100) + (i_2876_ - i_2877_ & 0x10000));
										is[i_2826_] = (i_2876_ - i_2875_ | i_2875_ - (i_2875_ >>> 8));
									} else if (i == 3) {
										int i_2878_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2825_]);
										int i_2879_ = anInt9014;
										int i_2880_ = i_2878_ + i_2879_;
										int i_2881_ = ((i_2878_ & 0xff00ff) + (i_2879_ & 0xff00ff));
										int i_2882_ = ((i_2881_ & 0x1000100) + (i_2880_ - i_2881_ & 0x10000));
										i_2878_ = (i_2880_ - i_2882_ | i_2882_ - (i_2882_ >>> 8));
										i_2882_ = is[i_2826_];
										i_2880_ = i_2878_ + i_2882_;
										i_2881_ = ((i_2878_ & 0xff00ff) + (i_2882_ & 0xff00ff));
										i_2882_ = ((i_2881_ & 0x1000100) + (i_2880_ - i_2881_ & 0x10000));
										is[i_2826_] = (i_2880_ - i_2882_ | i_2882_ - (i_2882_ >>> 8));
									} else if (i == 2) {
										int i_2883_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2825_]);
										int i_2884_ = ((i_2883_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2885_ = ((i_2883_ & 0xff00) * anInt9015 & 0xff0000);
										i_2883_ = (((i_2884_ | i_2885_) >>> 8) + anInt9022);
										int i_2886_ = is[i_2826_];
										int i_2887_ = i_2883_ + i_2886_;
										int i_2888_ = ((i_2883_ & 0xff00ff) + (i_2886_ & 0xff00ff));
										i_2886_ = ((i_2888_ & 0x1000100) + (i_2887_ - i_2888_ & 0x10000));
										is[i_2826_] = (i_2887_ - i_2886_ | i_2886_ - (i_2886_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_2821_ += anInt8991;
							}
						}
						i_2818_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_2889_ = anInt9001;
					while (i_2889_ < 0) {
						int i_2890_ = anInt9003;
						int i_2891_ = anInt8988 + anInt9012;
						int i_2892_ = anInt9011;
						int i_2893_ = anInt8999;
						if (i_2892_ >= 0 && i_2892_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) < 0) {
							int i_2894_;
							if ((i_2894_ = (i_2891_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12))) >= 0) {
								i_2894_ = (anInt9004 - i_2894_) / anInt9004;
								i_2893_ += i_2894_;
								i_2891_ += anInt9004 * i_2894_;
								i_2890_ += i_2894_;
							}
							if ((i_2894_ = (i_2891_ - anInt9004) / anInt9004) > i_2893_)
								i_2893_ = i_2894_;
							for (/**/; i_2893_ < 0; i_2893_++) {
								int i_2895_ = (((i_2892_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_2891_ >> 12));
								int i_2896_ = i_2890_++;
								if (i_2678_ == 0) {
									if (i == 1)
										is[i_2896_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2895_]);
									else if (i == 0) {
										int i_2897_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2895_++]);
										int i_2898_ = ((i_2897_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2899_ = ((i_2897_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2900_ = ((i_2897_ & 0xff) * anInt9019 & 0xff00);
										is[i_2896_] = (i_2898_ | i_2899_ | i_2900_) >>> 8;
									} else if (i == 3) {
										int i_2901_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2895_++]);
										int i_2902_ = anInt9014;
										int i_2903_ = i_2901_ + i_2902_;
										int i_2904_ = ((i_2901_ & 0xff00ff) + (i_2902_ & 0xff00ff));
										int i_2905_ = ((i_2904_ & 0x1000100) + (i_2903_ - i_2904_ & 0x10000));
										is[i_2896_] = (i_2903_ - i_2905_ | i_2905_ - (i_2905_ >>> 8));
									} else if (i == 2) {
										int i_2906_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2895_]);
										int i_2907_ = ((i_2906_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2908_ = ((i_2906_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_2896_] = ((i_2907_ | i_2908_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_2678_ == 1) {
									if (i == 1) {
										int i_2909_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2895_]);
										int i_2910_ = i_2909_ >>> 24;
										int i_2911_ = 256 - i_2910_;
										int i_2912_ = is[i_2896_];
										is[i_2896_] = ((((i_2909_ & 0xff00ff) * i_2910_ + ((i_2912_ & 0xff00ff) * i_2911_)) & ~0xff00ff) + (((i_2909_ & 0xff00) * i_2910_ + ((i_2912_ & 0xff00) * i_2911_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_2913_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2895_]);
										int i_2914_ = ((i_2913_ >>> 24) * anInt9015 >> 8);
										int i_2915_ = 256 - i_2914_;
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_2916_ = is[i_2896_];
											is[i_2896_] = (((((i_2913_ & 0xff00ff) * i_2914_) + ((i_2916_ & 0xff00ff) * i_2915_)) & ~0xff00ff) + ((((i_2913_ & 0xff00) * i_2914_) + ((i_2916_ & 0xff00) * i_2915_)) & 0xff0000)) >> 8;
										} else if (i_2914_ != 255) {
											int i_2917_ = (((i_2913_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2918_ = (((i_2913_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2919_ = ((i_2913_ & 0xff) * anInt9019 & 0xff00);
											i_2913_ = (i_2917_ | i_2918_ | i_2919_) >>> 8;
											int i_2920_ = is[i_2896_];
											is[i_2896_] = (((((i_2913_ & 0xff00ff) * i_2914_) + ((i_2920_ & 0xff00ff) * i_2915_)) & ~0xff00ff) + ((((i_2913_ & 0xff00) * i_2914_) + ((i_2920_ & 0xff00) * i_2915_)) & 0xff0000)) >> 8;
										} else {
											int i_2921_ = (((i_2913_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2922_ = (((i_2913_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2923_ = ((i_2913_ & 0xff) * anInt9019 & 0xff00);
											is[i_2896_] = (i_2921_ | i_2922_ | i_2923_) >>> 8;
										}
									} else if (i == 3) {
										int i_2924_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2895_]);
										int i_2925_ = anInt9014;
										int i_2926_ = i_2924_ + i_2925_;
										int i_2927_ = ((i_2924_ & 0xff00ff) + (i_2925_ & 0xff00ff));
										int i_2928_ = ((i_2927_ & 0x1000100) + (i_2926_ - i_2927_ & 0x10000));
										i_2928_ = (i_2926_ - i_2928_ | i_2928_ - (i_2928_ >>> 8));
										int i_2929_ = ((i_2924_ >>> 24) * anInt9015 >> 8);
										int i_2930_ = 256 - i_2929_;
										if (i_2929_ != 255) {
											i_2924_ = i_2928_;
											i_2928_ = is[i_2896_];
											i_2928_ = (((((i_2924_ & 0xff00ff) * i_2929_) + ((i_2928_ & 0xff00ff) * i_2930_)) & ~0xff00ff) + ((((i_2924_ & 0xff00) * i_2929_) + ((i_2928_ & 0xff00) * i_2930_)) & 0xff0000)) >> 8;
										}
										is[i_2896_] = i_2928_;
									} else if (i == 2) {
										int i_2931_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2895_]);
										int i_2932_ = i_2931_ >>> 24;
										int i_2933_ = 256 - i_2932_;
										int i_2934_ = ((i_2931_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2935_ = ((i_2931_ & 0xff00) * anInt9015 & 0xff0000);
										i_2931_ = (((i_2934_ | i_2935_) >>> 8) + anInt9022);
										int i_2936_ = is[i_2896_];
										is[i_2896_] = ((((i_2931_ & 0xff00ff) * i_2932_ + ((i_2936_ & 0xff00ff) * i_2933_)) & ~0xff00ff) + (((i_2931_ & 0xff00) * i_2932_ + ((i_2936_ & 0xff00) * i_2933_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_2678_ == 2) {
									if (i == 1) {
										int i_2937_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2895_]);
										int i_2938_ = is[i_2896_];
										int i_2939_ = i_2937_ + i_2938_;
										int i_2940_ = ((i_2937_ & 0xff00ff) + (i_2938_ & 0xff00ff));
										i_2938_ = ((i_2940_ & 0x1000100) + (i_2939_ - i_2940_ & 0x10000));
										is[i_2896_] = (i_2939_ - i_2938_ | i_2938_ - (i_2938_ >>> 8));
									} else if (i == 0) {
										int i_2941_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2895_]);
										int i_2942_ = ((i_2941_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2943_ = ((i_2941_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2944_ = ((i_2941_ & 0xff) * anInt9019 & 0xff00);
										i_2941_ = (i_2942_ | i_2943_ | i_2944_) >>> 8;
										int i_2945_ = is[i_2896_];
										int i_2946_ = i_2941_ + i_2945_;
										int i_2947_ = ((i_2941_ & 0xff00ff) + (i_2945_ & 0xff00ff));
										i_2945_ = ((i_2947_ & 0x1000100) + (i_2946_ - i_2947_ & 0x10000));
										is[i_2896_] = (i_2946_ - i_2945_ | i_2945_ - (i_2945_ >>> 8));
									} else if (i == 3) {
										int i_2948_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2895_]);
										int i_2949_ = anInt9014;
										int i_2950_ = i_2948_ + i_2949_;
										int i_2951_ = ((i_2948_ & 0xff00ff) + (i_2949_ & 0xff00ff));
										int i_2952_ = ((i_2951_ & 0x1000100) + (i_2950_ - i_2951_ & 0x10000));
										i_2948_ = (i_2950_ - i_2952_ | i_2952_ - (i_2952_ >>> 8));
										i_2952_ = is[i_2896_];
										i_2950_ = i_2948_ + i_2952_;
										i_2951_ = ((i_2948_ & 0xff00ff) + (i_2952_ & 0xff00ff));
										i_2952_ = ((i_2951_ & 0x1000100) + (i_2950_ - i_2951_ & 0x10000));
										is[i_2896_] = (i_2950_ - i_2952_ | i_2952_ - (i_2952_ >>> 8));
									} else if (i == 2) {
										int i_2953_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2895_]);
										int i_2954_ = ((i_2953_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2955_ = ((i_2953_ & 0xff00) * anInt9015 & 0xff0000);
										i_2953_ = (((i_2954_ | i_2955_) >>> 8) + anInt9022);
										int i_2956_ = is[i_2896_];
										int i_2957_ = i_2953_ + i_2956_;
										int i_2958_ = ((i_2953_ & 0xff00ff) + (i_2956_ & 0xff00ff));
										i_2956_ = ((i_2958_ & 0x1000100) + (i_2957_ - i_2958_ & 0x10000));
										is[i_2896_] = (i_2957_ - i_2956_ | i_2956_ - (i_2956_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_2891_ += anInt9004;
							}
						}
						i_2889_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_2959_ = anInt9001;
					while (i_2959_ < 0) {
						int i_2960_ = anInt9003;
						int i_2961_ = anInt8988 + anInt9012;
						int i_2962_ = anInt9011 + anInt9013;
						int i_2963_ = anInt8999;
						int i_2964_;
						if ((i_2964_ = i_2961_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) >= 0) {
							i_2964_ = (anInt9004 - i_2964_) / anInt9004;
							i_2963_ += i_2964_;
							i_2961_ += anInt9004 * i_2964_;
							i_2962_ += anInt8991 * i_2964_;
							i_2960_ += i_2964_;
						}
						if ((i_2964_ = (i_2961_ - anInt9004) / anInt9004) > i_2963_)
							i_2963_ = i_2964_;
						if ((i_2964_ = i_2962_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) >= 0) {
							i_2964_ = (anInt8991 - i_2964_) / anInt8991;
							i_2963_ += i_2964_;
							i_2961_ += anInt9004 * i_2964_;
							i_2962_ += anInt8991 * i_2964_;
							i_2960_ += i_2964_;
						}
						if ((i_2964_ = (i_2962_ - anInt8991) / anInt8991) > i_2963_)
							i_2963_ = i_2964_;
						for (/**/; i_2963_ < 0; i_2963_++) {
							int i_2965_ = (((i_2962_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_2961_ >> 12));
							int i_2966_ = i_2960_++;
							if (i_2678_ == 0) {
								if (i == 1)
									is[i_2966_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2965_]);
								else if (i == 0) {
									int i_2967_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2965_++]);
									int i_2968_ = ((i_2967_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2969_ = ((i_2967_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2970_ = ((i_2967_ & 0xff) * anInt9019 & 0xff00);
									is[i_2966_] = (i_2968_ | i_2969_ | i_2970_) >>> 8;
								} else if (i == 3) {
									int i_2971_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2965_++]);
									int i_2972_ = anInt9014;
									int i_2973_ = i_2971_ + i_2972_;
									int i_2974_ = ((i_2971_ & 0xff00ff) + (i_2972_ & 0xff00ff));
									int i_2975_ = ((i_2974_ & 0x1000100) + (i_2973_ - i_2974_ & 0x10000));
									is[i_2966_] = (i_2973_ - i_2975_ | i_2975_ - (i_2975_ >>> 8));
								} else if (i == 2) {
									int i_2976_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2965_]);
									int i_2977_ = ((i_2976_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2978_ = ((i_2976_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_2966_] = (((i_2977_ | i_2978_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_2678_ == 1) {
								if (i == 1) {
									int i_2979_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2965_]);
									int i_2980_ = i_2979_ >>> 24;
									int i_2981_ = 256 - i_2980_;
									int i_2982_ = is[i_2966_];
									is[i_2966_] = ((((i_2979_ & 0xff00ff) * i_2980_ + (i_2982_ & 0xff00ff) * i_2981_) & ~0xff00ff) + (((i_2979_ & 0xff00) * i_2980_ + (i_2982_ & 0xff00) * i_2981_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_2983_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2965_]);
									int i_2984_ = (i_2983_ >>> 24) * anInt9015 >> 8;
									int i_2985_ = 256 - i_2984_;
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_2986_ = is[i_2966_];
										is[i_2966_] = ((((i_2983_ & 0xff00ff) * i_2984_ + ((i_2986_ & 0xff00ff) * i_2985_)) & ~0xff00ff) + (((i_2983_ & 0xff00) * i_2984_ + ((i_2986_ & 0xff00) * i_2985_)) & 0xff0000)) >> 8;
									} else if (i_2984_ != 255) {
										int i_2987_ = ((i_2983_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2988_ = ((i_2983_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2989_ = ((i_2983_ & 0xff) * anInt9019 & 0xff00);
										i_2983_ = (i_2987_ | i_2988_ | i_2989_) >>> 8;
										int i_2990_ = is[i_2966_];
										is[i_2966_] = ((((i_2983_ & 0xff00ff) * i_2984_ + ((i_2990_ & 0xff00ff) * i_2985_)) & ~0xff00ff) + (((i_2983_ & 0xff00) * i_2984_ + ((i_2990_ & 0xff00) * i_2985_)) & 0xff0000)) >> 8;
									} else {
										int i_2991_ = ((i_2983_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2992_ = ((i_2983_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2993_ = ((i_2983_ & 0xff) * anInt9019 & 0xff00);
										is[i_2966_] = (i_2991_ | i_2992_ | i_2993_) >>> 8;
									}
								} else if (i == 3) {
									int i_2994_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2965_]);
									int i_2995_ = anInt9014;
									int i_2996_ = i_2994_ + i_2995_;
									int i_2997_ = ((i_2994_ & 0xff00ff) + (i_2995_ & 0xff00ff));
									int i_2998_ = ((i_2997_ & 0x1000100) + (i_2996_ - i_2997_ & 0x10000));
									i_2998_ = (i_2996_ - i_2998_ | i_2998_ - (i_2998_ >>> 8));
									int i_2999_ = (i_2994_ >>> 24) * anInt9015 >> 8;
									int i_3000_ = 256 - i_2999_;
									if (i_2999_ != 255) {
										i_2994_ = i_2998_;
										i_2998_ = is[i_2966_];
										i_2998_ = ((((i_2994_ & 0xff00ff) * i_2999_ + ((i_2998_ & 0xff00ff) * i_3000_)) & ~0xff00ff) + (((i_2994_ & 0xff00) * i_2999_ + ((i_2998_ & 0xff00) * i_3000_)) & 0xff0000)) >> 8;
									}
									is[i_2966_] = i_2998_;
								} else if (i == 2) {
									int i_3001_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2965_]);
									int i_3002_ = i_3001_ >>> 24;
									int i_3003_ = 256 - i_3002_;
									int i_3004_ = ((i_3001_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3005_ = ((i_3001_ & 0xff00) * anInt9015 & 0xff0000);
									i_3001_ = (((i_3004_ | i_3005_) >>> 8) + anInt9022);
									int i_3006_ = is[i_2966_];
									is[i_2966_] = ((((i_3001_ & 0xff00ff) * i_3002_ + (i_3006_ & 0xff00ff) * i_3003_) & ~0xff00ff) + (((i_3001_ & 0xff00) * i_3002_ + (i_3006_ & 0xff00) * i_3003_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_2678_ == 2) {
								if (i == 1) {
									int i_3007_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2965_]);
									int i_3008_ = is[i_2966_];
									int i_3009_ = i_3007_ + i_3008_;
									int i_3010_ = ((i_3007_ & 0xff00ff) + (i_3008_ & 0xff00ff));
									i_3008_ = ((i_3010_ & 0x1000100) + (i_3009_ - i_3010_ & 0x10000));
									is[i_2966_] = (i_3009_ - i_3008_ | i_3008_ - (i_3008_ >>> 8));
								} else if (i == 0) {
									int i_3011_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2965_]);
									int i_3012_ = ((i_3011_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3013_ = ((i_3011_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3014_ = ((i_3011_ & 0xff) * anInt9019 & 0xff00);
									i_3011_ = (i_3012_ | i_3013_ | i_3014_) >>> 8;
									int i_3015_ = is[i_2966_];
									int i_3016_ = i_3011_ + i_3015_;
									int i_3017_ = ((i_3011_ & 0xff00ff) + (i_3015_ & 0xff00ff));
									i_3015_ = ((i_3017_ & 0x1000100) + (i_3016_ - i_3017_ & 0x10000));
									is[i_2966_] = (i_3016_ - i_3015_ | i_3015_ - (i_3015_ >>> 8));
								} else if (i == 3) {
									int i_3018_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2965_]);
									int i_3019_ = anInt9014;
									int i_3020_ = i_3018_ + i_3019_;
									int i_3021_ = ((i_3018_ & 0xff00ff) + (i_3019_ & 0xff00ff));
									int i_3022_ = ((i_3021_ & 0x1000100) + (i_3020_ - i_3021_ & 0x10000));
									i_3018_ = (i_3020_ - i_3022_ | i_3022_ - (i_3022_ >>> 8));
									i_3022_ = is[i_2966_];
									i_3020_ = i_3018_ + i_3022_;
									i_3021_ = (i_3018_ & 0xff00ff) + (i_3022_ & 0xff00ff);
									i_3022_ = ((i_3021_ & 0x1000100) + (i_3020_ - i_3021_ & 0x10000));
									is[i_2966_] = (i_3020_ - i_3022_ | i_3022_ - (i_3022_ >>> 8));
								} else if (i == 2) {
									int i_3023_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_2965_]);
									int i_3024_ = ((i_3023_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3025_ = ((i_3023_ & 0xff00) * anInt9015 & 0xff0000);
									i_3023_ = (((i_3024_ | i_3025_) >>> 8) + anInt9022);
									int i_3026_ = is[i_2966_];
									int i_3027_ = i_3023_ + i_3026_;
									int i_3028_ = ((i_3023_ & 0xff00ff) + (i_3026_ & 0xff00ff));
									i_3026_ = ((i_3028_ & 0x1000100) + (i_3027_ - i_3028_ & 0x10000));
									is[i_2966_] = (i_3027_ - i_3026_ | i_3026_ - (i_3026_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_2961_ += anInt9004;
							i_2962_ += anInt8991;
						}
						i_2959_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_3029_ = anInt9001;
					while (i_3029_ < 0) {
						int i_3030_ = anInt9003;
						int i_3031_ = anInt8988 + anInt9012;
						int i_3032_ = anInt9011 + anInt9013;
						int i_3033_ = anInt8999;
						int i_3034_;
						if ((i_3034_ = i_3031_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) >= 0) {
							i_3034_ = (anInt9004 - i_3034_) / anInt9004;
							i_3033_ += i_3034_;
							i_3031_ += anInt9004 * i_3034_;
							i_3032_ += anInt8991 * i_3034_;
							i_3030_ += i_3034_;
						}
						if ((i_3034_ = (i_3031_ - anInt9004) / anInt9004) > i_3033_)
							i_3033_ = i_3034_;
						if (i_3032_ < 0) {
							i_3034_ = (anInt8991 - 1 - i_3032_) / anInt8991;
							i_3033_ += i_3034_;
							i_3031_ += anInt9004 * i_3034_;
							i_3032_ += anInt8991 * i_3034_;
							i_3030_ += i_3034_;
						}
						if ((i_3034_ = (1 + i_3032_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3033_)
							i_3033_ = i_3034_;
						for (/**/; i_3033_ < 0; i_3033_++) {
							int i_3035_ = (((i_3032_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_3031_ >> 12));
							int i_3036_ = i_3030_++;
							if (i_2678_ == 0) {
								if (i == 1)
									is[i_3036_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3035_]);
								else if (i == 0) {
									int i_3037_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3035_++]);
									int i_3038_ = ((i_3037_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3039_ = ((i_3037_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3040_ = ((i_3037_ & 0xff) * anInt9019 & 0xff00);
									is[i_3036_] = (i_3038_ | i_3039_ | i_3040_) >>> 8;
								} else if (i == 3) {
									int i_3041_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3035_++]);
									int i_3042_ = anInt9014;
									int i_3043_ = i_3041_ + i_3042_;
									int i_3044_ = ((i_3041_ & 0xff00ff) + (i_3042_ & 0xff00ff));
									int i_3045_ = ((i_3044_ & 0x1000100) + (i_3043_ - i_3044_ & 0x10000));
									is[i_3036_] = (i_3043_ - i_3045_ | i_3045_ - (i_3045_ >>> 8));
								} else if (i == 2) {
									int i_3046_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3035_]);
									int i_3047_ = ((i_3046_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3048_ = ((i_3046_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_3036_] = (((i_3047_ | i_3048_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_2678_ == 1) {
								if (i == 1) {
									int i_3049_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3035_]);
									int i_3050_ = i_3049_ >>> 24;
									int i_3051_ = 256 - i_3050_;
									int i_3052_ = is[i_3036_];
									is[i_3036_] = ((((i_3049_ & 0xff00ff) * i_3050_ + (i_3052_ & 0xff00ff) * i_3051_) & ~0xff00ff) + (((i_3049_ & 0xff00) * i_3050_ + (i_3052_ & 0xff00) * i_3051_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_3053_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3035_]);
									int i_3054_ = (i_3053_ >>> 24) * anInt9015 >> 8;
									int i_3055_ = 256 - i_3054_;
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_3056_ = is[i_3036_];
										is[i_3036_] = ((((i_3053_ & 0xff00ff) * i_3054_ + ((i_3056_ & 0xff00ff) * i_3055_)) & ~0xff00ff) + (((i_3053_ & 0xff00) * i_3054_ + ((i_3056_ & 0xff00) * i_3055_)) & 0xff0000)) >> 8;
									} else if (i_3054_ != 255) {
										int i_3057_ = ((i_3053_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3058_ = ((i_3053_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3059_ = ((i_3053_ & 0xff) * anInt9019 & 0xff00);
										i_3053_ = (i_3057_ | i_3058_ | i_3059_) >>> 8;
										int i_3060_ = is[i_3036_];
										is[i_3036_] = ((((i_3053_ & 0xff00ff) * i_3054_ + ((i_3060_ & 0xff00ff) * i_3055_)) & ~0xff00ff) + (((i_3053_ & 0xff00) * i_3054_ + ((i_3060_ & 0xff00) * i_3055_)) & 0xff0000)) >> 8;
									} else {
										int i_3061_ = ((i_3053_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3062_ = ((i_3053_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3063_ = ((i_3053_ & 0xff) * anInt9019 & 0xff00);
										is[i_3036_] = (i_3061_ | i_3062_ | i_3063_) >>> 8;
									}
								} else if (i == 3) {
									int i_3064_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3035_]);
									int i_3065_ = anInt9014;
									int i_3066_ = i_3064_ + i_3065_;
									int i_3067_ = ((i_3064_ & 0xff00ff) + (i_3065_ & 0xff00ff));
									int i_3068_ = ((i_3067_ & 0x1000100) + (i_3066_ - i_3067_ & 0x10000));
									i_3068_ = (i_3066_ - i_3068_ | i_3068_ - (i_3068_ >>> 8));
									int i_3069_ = (i_3064_ >>> 24) * anInt9015 >> 8;
									int i_3070_ = 256 - i_3069_;
									if (i_3069_ != 255) {
										i_3064_ = i_3068_;
										i_3068_ = is[i_3036_];
										i_3068_ = ((((i_3064_ & 0xff00ff) * i_3069_ + ((i_3068_ & 0xff00ff) * i_3070_)) & ~0xff00ff) + (((i_3064_ & 0xff00) * i_3069_ + ((i_3068_ & 0xff00) * i_3070_)) & 0xff0000)) >> 8;
									}
									is[i_3036_] = i_3068_;
								} else if (i == 2) {
									int i_3071_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3035_]);
									int i_3072_ = i_3071_ >>> 24;
									int i_3073_ = 256 - i_3072_;
									int i_3074_ = ((i_3071_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3075_ = ((i_3071_ & 0xff00) * anInt9015 & 0xff0000);
									i_3071_ = (((i_3074_ | i_3075_) >>> 8) + anInt9022);
									int i_3076_ = is[i_3036_];
									is[i_3036_] = ((((i_3071_ & 0xff00ff) * i_3072_ + (i_3076_ & 0xff00ff) * i_3073_) & ~0xff00ff) + (((i_3071_ & 0xff00) * i_3072_ + (i_3076_ & 0xff00) * i_3073_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_2678_ == 2) {
								if (i == 1) {
									int i_3077_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3035_]);
									int i_3078_ = is[i_3036_];
									int i_3079_ = i_3077_ + i_3078_;
									int i_3080_ = ((i_3077_ & 0xff00ff) + (i_3078_ & 0xff00ff));
									i_3078_ = ((i_3080_ & 0x1000100) + (i_3079_ - i_3080_ & 0x10000));
									is[i_3036_] = (i_3079_ - i_3078_ | i_3078_ - (i_3078_ >>> 8));
								} else if (i == 0) {
									int i_3081_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3035_]);
									int i_3082_ = ((i_3081_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3083_ = ((i_3081_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3084_ = ((i_3081_ & 0xff) * anInt9019 & 0xff00);
									i_3081_ = (i_3082_ | i_3083_ | i_3084_) >>> 8;
									int i_3085_ = is[i_3036_];
									int i_3086_ = i_3081_ + i_3085_;
									int i_3087_ = ((i_3081_ & 0xff00ff) + (i_3085_ & 0xff00ff));
									i_3085_ = ((i_3087_ & 0x1000100) + (i_3086_ - i_3087_ & 0x10000));
									is[i_3036_] = (i_3086_ - i_3085_ | i_3085_ - (i_3085_ >>> 8));
								} else if (i == 3) {
									int i_3088_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3035_]);
									int i_3089_ = anInt9014;
									int i_3090_ = i_3088_ + i_3089_;
									int i_3091_ = ((i_3088_ & 0xff00ff) + (i_3089_ & 0xff00ff));
									int i_3092_ = ((i_3091_ & 0x1000100) + (i_3090_ - i_3091_ & 0x10000));
									i_3088_ = (i_3090_ - i_3092_ | i_3092_ - (i_3092_ >>> 8));
									i_3092_ = is[i_3036_];
									i_3090_ = i_3088_ + i_3092_;
									i_3091_ = (i_3088_ & 0xff00ff) + (i_3092_ & 0xff00ff);
									i_3092_ = ((i_3091_ & 0x1000100) + (i_3090_ - i_3091_ & 0x10000));
									is[i_3036_] = (i_3090_ - i_3092_ | i_3092_ - (i_3092_ >>> 8));
								} else if (i == 2) {
									int i_3093_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3035_]);
									int i_3094_ = ((i_3093_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3095_ = ((i_3093_ & 0xff00) * anInt9015 & 0xff0000);
									i_3093_ = (((i_3094_ | i_3095_) >>> 8) + anInt9022);
									int i_3096_ = is[i_3036_];
									int i_3097_ = i_3093_ + i_3096_;
									int i_3098_ = ((i_3093_ & 0xff00ff) + (i_3096_ & 0xff00ff));
									i_3096_ = ((i_3098_ & 0x1000100) + (i_3097_ - i_3098_ & 0x10000));
									is[i_3036_] = (i_3097_ - i_3096_ | i_3096_ - (i_3096_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_3031_ += anInt9004;
							i_3032_ += anInt8991;
						}
						i_3029_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_3099_ = anInt9001;
				while (i_3099_ < 0) {
					int i_3100_ = anInt9003;
					int i_3101_ = anInt8988 + anInt9012;
					int i_3102_ = anInt9011;
					int i_3103_ = anInt8999;
					if (i_3102_ >= 0 && i_3102_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) < 0) {
						if (i_3101_ < 0) {
							int i_3104_ = (anInt9004 - 1 - i_3101_) / anInt9004;
							i_3103_ += i_3104_;
							i_3101_ += anInt9004 * i_3104_;
							i_3100_ += i_3104_;
						}
						int i_3105_;
						if ((i_3105_ = (1 + i_3101_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3103_)
							i_3103_ = i_3105_;
						for (/**/; i_3103_ < 0; i_3103_++) {
							int i_3106_ = (((i_3102_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_3101_ >> 12));
							int i_3107_ = i_3100_++;
							if (i_2678_ == 0) {
								if (i == 1)
									is[i_3107_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3106_]);
								else if (i == 0) {
									int i_3108_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3106_++]);
									int i_3109_ = ((i_3108_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3110_ = ((i_3108_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3111_ = ((i_3108_ & 0xff) * anInt9019 & 0xff00);
									is[i_3107_] = (i_3109_ | i_3110_ | i_3111_) >>> 8;
								} else if (i == 3) {
									int i_3112_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3106_++]);
									int i_3113_ = anInt9014;
									int i_3114_ = i_3112_ + i_3113_;
									int i_3115_ = ((i_3112_ & 0xff00ff) + (i_3113_ & 0xff00ff));
									int i_3116_ = ((i_3115_ & 0x1000100) + (i_3114_ - i_3115_ & 0x10000));
									is[i_3107_] = (i_3114_ - i_3116_ | i_3116_ - (i_3116_ >>> 8));
								} else if (i == 2) {
									int i_3117_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3106_]);
									int i_3118_ = ((i_3117_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3119_ = ((i_3117_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_3107_] = (((i_3118_ | i_3119_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_2678_ == 1) {
								if (i == 1) {
									int i_3120_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3106_]);
									int i_3121_ = i_3120_ >>> 24;
									int i_3122_ = 256 - i_3121_;
									int i_3123_ = is[i_3107_];
									is[i_3107_] = ((((i_3120_ & 0xff00ff) * i_3121_ + (i_3123_ & 0xff00ff) * i_3122_) & ~0xff00ff) + (((i_3120_ & 0xff00) * i_3121_ + (i_3123_ & 0xff00) * i_3122_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_3124_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3106_]);
									int i_3125_ = (i_3124_ >>> 24) * anInt9015 >> 8;
									int i_3126_ = 256 - i_3125_;
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_3127_ = is[i_3107_];
										is[i_3107_] = ((((i_3124_ & 0xff00ff) * i_3125_ + ((i_3127_ & 0xff00ff) * i_3126_)) & ~0xff00ff) + (((i_3124_ & 0xff00) * i_3125_ + ((i_3127_ & 0xff00) * i_3126_)) & 0xff0000)) >> 8;
									} else if (i_3125_ != 255) {
										int i_3128_ = ((i_3124_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3129_ = ((i_3124_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3130_ = ((i_3124_ & 0xff) * anInt9019 & 0xff00);
										i_3124_ = (i_3128_ | i_3129_ | i_3130_) >>> 8;
										int i_3131_ = is[i_3107_];
										is[i_3107_] = ((((i_3124_ & 0xff00ff) * i_3125_ + ((i_3131_ & 0xff00ff) * i_3126_)) & ~0xff00ff) + (((i_3124_ & 0xff00) * i_3125_ + ((i_3131_ & 0xff00) * i_3126_)) & 0xff0000)) >> 8;
									} else {
										int i_3132_ = ((i_3124_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3133_ = ((i_3124_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3134_ = ((i_3124_ & 0xff) * anInt9019 & 0xff00);
										is[i_3107_] = (i_3132_ | i_3133_ | i_3134_) >>> 8;
									}
								} else if (i == 3) {
									int i_3135_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3106_]);
									int i_3136_ = anInt9014;
									int i_3137_ = i_3135_ + i_3136_;
									int i_3138_ = ((i_3135_ & 0xff00ff) + (i_3136_ & 0xff00ff));
									int i_3139_ = ((i_3138_ & 0x1000100) + (i_3137_ - i_3138_ & 0x10000));
									i_3139_ = (i_3137_ - i_3139_ | i_3139_ - (i_3139_ >>> 8));
									int i_3140_ = (i_3135_ >>> 24) * anInt9015 >> 8;
									int i_3141_ = 256 - i_3140_;
									if (i_3140_ != 255) {
										i_3135_ = i_3139_;
										i_3139_ = is[i_3107_];
										i_3139_ = ((((i_3135_ & 0xff00ff) * i_3140_ + ((i_3139_ & 0xff00ff) * i_3141_)) & ~0xff00ff) + (((i_3135_ & 0xff00) * i_3140_ + ((i_3139_ & 0xff00) * i_3141_)) & 0xff0000)) >> 8;
									}
									is[i_3107_] = i_3139_;
								} else if (i == 2) {
									int i_3142_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3106_]);
									int i_3143_ = i_3142_ >>> 24;
									int i_3144_ = 256 - i_3143_;
									int i_3145_ = ((i_3142_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3146_ = ((i_3142_ & 0xff00) * anInt9015 & 0xff0000);
									i_3142_ = (((i_3145_ | i_3146_) >>> 8) + anInt9022);
									int i_3147_ = is[i_3107_];
									is[i_3107_] = ((((i_3142_ & 0xff00ff) * i_3143_ + (i_3147_ & 0xff00ff) * i_3144_) & ~0xff00ff) + (((i_3142_ & 0xff00) * i_3143_ + (i_3147_ & 0xff00) * i_3144_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_2678_ == 2) {
								if (i == 1) {
									int i_3148_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3106_]);
									int i_3149_ = is[i_3107_];
									int i_3150_ = i_3148_ + i_3149_;
									int i_3151_ = ((i_3148_ & 0xff00ff) + (i_3149_ & 0xff00ff));
									i_3149_ = ((i_3151_ & 0x1000100) + (i_3150_ - i_3151_ & 0x10000));
									is[i_3107_] = (i_3150_ - i_3149_ | i_3149_ - (i_3149_ >>> 8));
								} else if (i == 0) {
									int i_3152_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3106_]);
									int i_3153_ = ((i_3152_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3154_ = ((i_3152_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3155_ = ((i_3152_ & 0xff) * anInt9019 & 0xff00);
									i_3152_ = (i_3153_ | i_3154_ | i_3155_) >>> 8;
									int i_3156_ = is[i_3107_];
									int i_3157_ = i_3152_ + i_3156_;
									int i_3158_ = ((i_3152_ & 0xff00ff) + (i_3156_ & 0xff00ff));
									i_3156_ = ((i_3158_ & 0x1000100) + (i_3157_ - i_3158_ & 0x10000));
									is[i_3107_] = (i_3157_ - i_3156_ | i_3156_ - (i_3156_ >>> 8));
								} else if (i == 3) {
									int i_3159_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3106_]);
									int i_3160_ = anInt9014;
									int i_3161_ = i_3159_ + i_3160_;
									int i_3162_ = ((i_3159_ & 0xff00ff) + (i_3160_ & 0xff00ff));
									int i_3163_ = ((i_3162_ & 0x1000100) + (i_3161_ - i_3162_ & 0x10000));
									i_3159_ = (i_3161_ - i_3163_ | i_3163_ - (i_3163_ >>> 8));
									i_3163_ = is[i_3107_];
									i_3161_ = i_3159_ + i_3163_;
									i_3162_ = (i_3159_ & 0xff00ff) + (i_3163_ & 0xff00ff);
									i_3163_ = ((i_3162_ & 0x1000100) + (i_3161_ - i_3162_ & 0x10000));
									is[i_3107_] = (i_3161_ - i_3163_ | i_3163_ - (i_3163_ >>> 8));
								} else if (i == 2) {
									int i_3164_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3106_]);
									int i_3165_ = ((i_3164_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3166_ = ((i_3164_ & 0xff00) * anInt9015 & 0xff0000);
									i_3164_ = (((i_3165_ | i_3166_) >>> 8) + anInt9022);
									int i_3167_ = is[i_3107_];
									int i_3168_ = i_3164_ + i_3167_;
									int i_3169_ = ((i_3164_ & 0xff00ff) + (i_3167_ & 0xff00ff));
									i_3167_ = ((i_3169_ & 0x1000100) + (i_3168_ - i_3169_ & 0x10000));
									is[i_3107_] = (i_3168_ - i_3167_ | i_3167_ - (i_3167_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_3101_ += anInt9004;
						}
					}
					i_3099_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				for (int i_3170_ = anInt9001; i_3170_ < 0; i_3170_++) {
					int i_3171_ = anInt9003;
					int i_3172_ = anInt8988 + anInt9012;
					int i_3173_ = anInt9011 + anInt9013;
					int i_3174_ = anInt8999;
					if (i_3172_ < 0) {
						int i_3175_ = (anInt9004 - 1 - i_3172_) / anInt9004;
						i_3174_ += i_3175_;
						i_3172_ += anInt9004 * i_3175_;
						i_3173_ += anInt8991 * i_3175_;
						i_3171_ += i_3175_;
					}
					int i_3176_;
					if ((i_3176_ = (1 + i_3172_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3174_)
						i_3174_ = i_3176_;
					if ((i_3176_ = i_3173_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) >= 0) {
						i_3176_ = (anInt8991 - i_3176_) / anInt8991;
						i_3174_ += i_3176_;
						i_3172_ += anInt9004 * i_3176_;
						i_3173_ += anInt8991 * i_3176_;
						i_3171_ += i_3176_;
					}
					if ((i_3176_ = (i_3173_ - anInt8991) / anInt8991) > i_3174_)
						i_3174_ = i_3176_;
					for (/**/; i_3174_ < 0; i_3174_++) {
						int i_3177_ = (((i_3173_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_3172_ >> 12));
						int i_3178_ = i_3171_++;
						if (i_2678_ == 0) {
							if (i == 1)
								is[i_3178_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3177_]);
							else if (i == 0) {
								int i_3179_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3177_++]);
								int i_3180_ = ((i_3179_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_3181_ = ((i_3179_ & 0xff00) * anInt9018 & 0xff0000);
								int i_3182_ = (i_3179_ & 0xff) * anInt9019 & 0xff00;
								is[i_3178_] = (i_3180_ | i_3181_ | i_3182_) >>> 8;
							} else if (i == 3) {
								int i_3183_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3177_++]);
								int i_3184_ = anInt9014;
								int i_3185_ = i_3183_ + i_3184_;
								int i_3186_ = ((i_3183_ & 0xff00ff) + (i_3184_ & 0xff00ff));
								int i_3187_ = ((i_3186_ & 0x1000100) + (i_3185_ - i_3186_ & 0x10000));
								is[i_3178_] = i_3185_ - i_3187_ | i_3187_ - (i_3187_ >>> 8);
							} else if (i == 2) {
								int i_3188_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3177_]);
								int i_3189_ = ((i_3188_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_3190_ = ((i_3188_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_3178_] = ((i_3189_ | i_3190_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_2678_ == 1) {
							if (i == 1) {
								int i_3191_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3177_]);
								int i_3192_ = i_3191_ >>> 24;
								int i_3193_ = 256 - i_3192_;
								int i_3194_ = is[i_3178_];
								is[i_3178_] = ((((i_3191_ & 0xff00ff) * i_3192_ + (i_3194_ & 0xff00ff) * i_3193_) & ~0xff00ff) + (((i_3191_ & 0xff00) * i_3192_ + (i_3194_ & 0xff00) * i_3193_) & 0xff0000)) >> 8;
							} else if (i == 0) {
								int i_3195_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3177_]);
								int i_3196_ = (i_3195_ >>> 24) * anInt9015 >> 8;
								int i_3197_ = 256 - i_3196_;
								if ((anInt9014 & 0xffffff) == 16777215) {
									int i_3198_ = is[i_3178_];
									is[i_3178_] = ((((i_3195_ & 0xff00ff) * i_3196_ + (i_3198_ & 0xff00ff) * i_3197_) & ~0xff00ff) + (((i_3195_ & 0xff00) * i_3196_ + (i_3198_ & 0xff00) * i_3197_) & 0xff0000)) >> 8;
								} else if (i_3196_ != 255) {
									int i_3199_ = ((i_3195_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3200_ = ((i_3195_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3201_ = ((i_3195_ & 0xff) * anInt9019 & 0xff00);
									i_3195_ = (i_3199_ | i_3200_ | i_3201_) >>> 8;
									int i_3202_ = is[i_3178_];
									is[i_3178_] = ((((i_3195_ & 0xff00ff) * i_3196_ + (i_3202_ & 0xff00ff) * i_3197_) & ~0xff00ff) + (((i_3195_ & 0xff00) * i_3196_ + (i_3202_ & 0xff00) * i_3197_) & 0xff0000)) >> 8;
								} else {
									int i_3203_ = ((i_3195_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3204_ = ((i_3195_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3205_ = ((i_3195_ & 0xff) * anInt9019 & 0xff00);
									is[i_3178_] = (i_3203_ | i_3204_ | i_3205_) >>> 8;
								}
							} else if (i == 3) {
								int i_3206_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3177_]);
								int i_3207_ = anInt9014;
								int i_3208_ = i_3206_ + i_3207_;
								int i_3209_ = ((i_3206_ & 0xff00ff) + (i_3207_ & 0xff00ff));
								int i_3210_ = ((i_3209_ & 0x1000100) + (i_3208_ - i_3209_ & 0x10000));
								i_3210_ = i_3208_ - i_3210_ | i_3210_ - (i_3210_ >>> 8);
								int i_3211_ = (i_3206_ >>> 24) * anInt9015 >> 8;
								int i_3212_ = 256 - i_3211_;
								if (i_3211_ != 255) {
									i_3206_ = i_3210_;
									i_3210_ = is[i_3178_];
									i_3210_ = ((((i_3206_ & 0xff00ff) * i_3211_ + (i_3210_ & 0xff00ff) * i_3212_) & ~0xff00ff) + (((i_3206_ & 0xff00) * i_3211_ + (i_3210_ & 0xff00) * i_3212_) & 0xff0000)) >> 8;
								}
								is[i_3178_] = i_3210_;
							} else if (i == 2) {
								int i_3213_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3177_]);
								int i_3214_ = i_3213_ >>> 24;
								int i_3215_ = 256 - i_3214_;
								int i_3216_ = ((i_3213_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_3217_ = ((i_3213_ & 0xff00) * anInt9015 & 0xff0000);
								i_3213_ = ((i_3216_ | i_3217_) >>> 8) + anInt9022;
								int i_3218_ = is[i_3178_];
								is[i_3178_] = ((((i_3213_ & 0xff00ff) * i_3214_ + (i_3218_ & 0xff00ff) * i_3215_) & ~0xff00ff) + (((i_3213_ & 0xff00) * i_3214_ + (i_3218_ & 0xff00) * i_3215_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_2678_ == 2) {
							if (i == 1) {
								int i_3219_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3177_]);
								int i_3220_ = is[i_3178_];
								int i_3221_ = i_3219_ + i_3220_;
								int i_3222_ = ((i_3219_ & 0xff00ff) + (i_3220_ & 0xff00ff));
								i_3220_ = ((i_3222_ & 0x1000100) + (i_3221_ - i_3222_ & 0x10000));
								is[i_3178_] = i_3221_ - i_3220_ | i_3220_ - (i_3220_ >>> 8);
							} else if (i == 0) {
								int i_3223_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3177_]);
								int i_3224_ = ((i_3223_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_3225_ = ((i_3223_ & 0xff00) * anInt9018 & 0xff0000);
								int i_3226_ = (i_3223_ & 0xff) * anInt9019 & 0xff00;
								i_3223_ = (i_3224_ | i_3225_ | i_3226_) >>> 8;
								int i_3227_ = is[i_3178_];
								int i_3228_ = i_3223_ + i_3227_;
								int i_3229_ = ((i_3223_ & 0xff00ff) + (i_3227_ & 0xff00ff));
								i_3227_ = ((i_3229_ & 0x1000100) + (i_3228_ - i_3229_ & 0x10000));
								is[i_3178_] = i_3228_ - i_3227_ | i_3227_ - (i_3227_ >>> 8);
							} else if (i == 3) {
								int i_3230_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3177_]);
								int i_3231_ = anInt9014;
								int i_3232_ = i_3230_ + i_3231_;
								int i_3233_ = ((i_3230_ & 0xff00ff) + (i_3231_ & 0xff00ff));
								int i_3234_ = ((i_3233_ & 0x1000100) + (i_3232_ - i_3233_ & 0x10000));
								i_3230_ = i_3232_ - i_3234_ | i_3234_ - (i_3234_ >>> 8);
								i_3234_ = is[i_3178_];
								i_3232_ = i_3230_ + i_3234_;
								i_3233_ = (i_3230_ & 0xff00ff) + (i_3234_ & 0xff00ff);
								i_3234_ = ((i_3233_ & 0x1000100) + (i_3232_ - i_3233_ & 0x10000));
								is[i_3178_] = i_3232_ - i_3234_ | i_3234_ - (i_3234_ >>> 8);
							} else if (i == 2) {
								int i_3235_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3177_]);
								int i_3236_ = ((i_3235_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_3237_ = ((i_3235_ & 0xff00) * anInt9015 & 0xff0000);
								i_3235_ = ((i_3236_ | i_3237_) >>> 8) + anInt9022;
								int i_3238_ = is[i_3178_];
								int i_3239_ = i_3235_ + i_3238_;
								int i_3240_ = ((i_3235_ & 0xff00ff) + (i_3238_ & 0xff00ff));
								i_3238_ = ((i_3240_ & 0x1000100) + (i_3239_ - i_3240_ & 0x10000));
								is[i_3178_] = i_3239_ - i_3238_ | i_3238_ - (i_3238_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_3172_ += anInt9004;
						i_3173_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				for (int i_3241_ = anInt9001; i_3241_ < 0; i_3241_++) {
					int i_3242_ = anInt9003;
					int i_3243_ = anInt8988 + anInt9012;
					int i_3244_ = anInt9011 + anInt9013;
					int i_3245_ = anInt8999;
					if (i_3243_ < 0) {
						int i_3246_ = (anInt9004 - 1 - i_3243_) / anInt9004;
						i_3245_ += i_3246_;
						i_3243_ += anInt9004 * i_3246_;
						i_3244_ += anInt8991 * i_3246_;
						i_3242_ += i_3246_;
					}
					int i_3247_;
					if ((i_3247_ = (1 + i_3243_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3245_)
						i_3245_ = i_3247_;
					if (i_3244_ < 0) {
						i_3247_ = (anInt8991 - 1 - i_3244_) / anInt8991;
						i_3245_ += i_3247_;
						i_3243_ += anInt9004 * i_3247_;
						i_3244_ += anInt8991 * i_3247_;
						i_3242_ += i_3247_;
					}
					if ((i_3247_ = (1 + i_3244_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3245_)
						i_3245_ = i_3247_;
					for (/**/; i_3245_ < 0; i_3245_++) {
						int i_3248_ = (((i_3244_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_3243_ >> 12));
						int i_3249_ = i_3242_++;
						if (i_2678_ == 0) {
							if (i == 1)
								is[i_3249_] = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3248_]);
							else if (i == 0) {
								int i_3250_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3248_++]);
								int i_3251_ = ((i_3250_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_3252_ = ((i_3250_ & 0xff00) * anInt9018 & 0xff0000);
								int i_3253_ = (i_3250_ & 0xff) * anInt9019 & 0xff00;
								is[i_3249_] = (i_3251_ | i_3252_ | i_3253_) >>> 8;
							} else if (i == 3) {
								int i_3254_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3248_++]);
								int i_3255_ = anInt9014;
								int i_3256_ = i_3254_ + i_3255_;
								int i_3257_ = ((i_3254_ & 0xff00ff) + (i_3255_ & 0xff00ff));
								int i_3258_ = ((i_3257_ & 0x1000100) + (i_3256_ - i_3257_ & 0x10000));
								is[i_3249_] = i_3256_ - i_3258_ | i_3258_ - (i_3258_ >>> 8);
							} else if (i == 2) {
								int i_3259_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3248_]);
								int i_3260_ = ((i_3259_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_3261_ = ((i_3259_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_3249_] = ((i_3260_ | i_3261_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_2678_ == 1) {
							if (i == 1) {
								int i_3262_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3248_]);
								int i_3263_ = i_3262_ >>> 24;
								int i_3264_ = 256 - i_3263_;
								int i_3265_ = is[i_3249_];
								is[i_3249_] = ((((i_3262_ & 0xff00ff) * i_3263_ + (i_3265_ & 0xff00ff) * i_3264_) & ~0xff00ff) + (((i_3262_ & 0xff00) * i_3263_ + (i_3265_ & 0xff00) * i_3264_) & 0xff0000)) >> 8;
							} else if (i == 0) {
								int i_3266_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3248_]);
								int i_3267_ = (i_3266_ >>> 24) * anInt9015 >> 8;
								int i_3268_ = 256 - i_3267_;
								if ((anInt9014 & 0xffffff) == 16777215) {
									int i_3269_ = is[i_3249_];
									is[i_3249_] = ((((i_3266_ & 0xff00ff) * i_3267_ + (i_3269_ & 0xff00ff) * i_3268_) & ~0xff00ff) + (((i_3266_ & 0xff00) * i_3267_ + (i_3269_ & 0xff00) * i_3268_) & 0xff0000)) >> 8;
								} else if (i_3267_ != 255) {
									int i_3270_ = ((i_3266_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3271_ = ((i_3266_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3272_ = ((i_3266_ & 0xff) * anInt9019 & 0xff00);
									i_3266_ = (i_3270_ | i_3271_ | i_3272_) >>> 8;
									int i_3273_ = is[i_3249_];
									is[i_3249_] = ((((i_3266_ & 0xff00ff) * i_3267_ + (i_3273_ & 0xff00ff) * i_3268_) & ~0xff00ff) + (((i_3266_ & 0xff00) * i_3267_ + (i_3273_ & 0xff00) * i_3268_) & 0xff0000)) >> 8;
								} else {
									int i_3274_ = ((i_3266_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3275_ = ((i_3266_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3276_ = ((i_3266_ & 0xff) * anInt9019 & 0xff00);
									is[i_3249_] = (i_3274_ | i_3275_ | i_3276_) >>> 8;
								}
							} else if (i == 3) {
								int i_3277_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3248_]);
								int i_3278_ = anInt9014;
								int i_3279_ = i_3277_ + i_3278_;
								int i_3280_ = ((i_3277_ & 0xff00ff) + (i_3278_ & 0xff00ff));
								int i_3281_ = ((i_3280_ & 0x1000100) + (i_3279_ - i_3280_ & 0x10000));
								i_3281_ = i_3279_ - i_3281_ | i_3281_ - (i_3281_ >>> 8);
								int i_3282_ = (i_3277_ >>> 24) * anInt9015 >> 8;
								int i_3283_ = 256 - i_3282_;
								if (i_3282_ != 255) {
									i_3277_ = i_3281_;
									i_3281_ = is[i_3249_];
									i_3281_ = ((((i_3277_ & 0xff00ff) * i_3282_ + (i_3281_ & 0xff00ff) * i_3283_) & ~0xff00ff) + (((i_3277_ & 0xff00) * i_3282_ + (i_3281_ & 0xff00) * i_3283_) & 0xff0000)) >> 8;
								}
								is[i_3249_] = i_3281_;
							} else if (i == 2) {
								int i_3284_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3248_]);
								int i_3285_ = i_3284_ >>> 24;
								int i_3286_ = 256 - i_3285_;
								int i_3287_ = ((i_3284_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_3288_ = ((i_3284_ & 0xff00) * anInt9015 & 0xff0000);
								i_3284_ = ((i_3287_ | i_3288_) >>> 8) + anInt9022;
								int i_3289_ = is[i_3249_];
								is[i_3249_] = ((((i_3284_ & 0xff00ff) * i_3285_ + (i_3289_ & 0xff00ff) * i_3286_) & ~0xff00ff) + (((i_3284_ & 0xff00) * i_3285_ + (i_3289_ & 0xff00) * i_3286_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_2678_ == 2) {
							if (i == 1) {
								int i_3290_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3248_]);
								int i_3291_ = is[i_3249_];
								int i_3292_ = i_3290_ + i_3291_;
								int i_3293_ = ((i_3290_ & 0xff00ff) + (i_3291_ & 0xff00ff));
								i_3291_ = ((i_3293_ & 0x1000100) + (i_3292_ - i_3293_ & 0x10000));
								is[i_3249_] = i_3292_ - i_3291_ | i_3291_ - (i_3291_ >>> 8);
							} else if (i == 0) {
								int i_3294_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3248_]);
								int i_3295_ = ((i_3294_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_3296_ = ((i_3294_ & 0xff00) * anInt9018 & 0xff0000);
								int i_3297_ = (i_3294_ & 0xff) * anInt9019 & 0xff00;
								i_3294_ = (i_3295_ | i_3296_ | i_3297_) >>> 8;
								int i_3298_ = is[i_3249_];
								int i_3299_ = i_3294_ + i_3298_;
								int i_3300_ = ((i_3294_ & 0xff00ff) + (i_3298_ & 0xff00ff));
								i_3298_ = ((i_3300_ & 0x1000100) + (i_3299_ - i_3300_ & 0x10000));
								is[i_3249_] = i_3299_ - i_3298_ | i_3298_ - (i_3298_ >>> 8);
							} else if (i == 3) {
								int i_3301_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3248_]);
								int i_3302_ = anInt9014;
								int i_3303_ = i_3301_ + i_3302_;
								int i_3304_ = ((i_3301_ & 0xff00ff) + (i_3302_ & 0xff00ff));
								int i_3305_ = ((i_3304_ & 0x1000100) + (i_3303_ - i_3304_ & 0x10000));
								i_3301_ = i_3303_ - i_3305_ | i_3305_ - (i_3305_ >>> 8);
								i_3305_ = is[i_3249_];
								i_3303_ = i_3301_ + i_3305_;
								i_3304_ = (i_3301_ & 0xff00ff) + (i_3305_ & 0xff00ff);
								i_3305_ = ((i_3304_ & 0x1000100) + (i_3303_ - i_3304_ & 0x10000));
								is[i_3249_] = i_3303_ - i_3305_ | i_3305_ - (i_3305_ >>> 8);
							} else if (i == 2) {
								int i_3306_ = (((Class57_Sub1_Sub1) this).anIntArray9965[i_3248_]);
								int i_3307_ = ((i_3306_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_3308_ = ((i_3306_ & 0xff00) * anInt9015 & 0xff0000);
								i_3306_ = ((i_3307_ | i_3308_) >>> 8) + anInt9022;
								int i_3309_ = is[i_3249_];
								int i_3310_ = i_3306_ + i_3309_;
								int i_3311_ = ((i_3306_ & 0xff00ff) + (i_3309_ & 0xff00ff));
								i_3309_ = ((i_3311_ & 0x1000100) + (i_3310_ - i_3311_ & 0x10000));
								is[i_3249_] = i_3310_ - i_3309_ | i_3309_ - (i_3309_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_3243_ += anInt9004;
						i_3244_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	void method683(int[] is, int[] is_3312_, int i, int i_3313_) {
		int[] is_3314_ = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is_3314_ != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_3315_ = anInt9001;
					while (i_3315_ < 0) {
						int i_3316_ = i_3315_ + i_3313_;
						if (i_3316_ >= 0) {
							if (i_3316_ >= is.length)
								break;
							int i_3317_ = anInt9003;
							int i_3318_ = anInt8988;
							int i_3319_ = anInt9011;
							int i_3320_ = anInt8999;
							if (i_3318_ >= 0 && i_3319_ >= 0 && (i_3318_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) < 0 && (i_3319_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) < 0) {
								int i_3321_ = is[i_3316_] - i;
								int i_3322_ = -is_3312_[i_3316_];
								int i_3323_ = i_3321_ - (i_3317_ - anInt9003);
								if (i_3323_ > 0) {
									i_3317_ += i_3323_;
									i_3320_ += i_3323_;
									i_3318_ += anInt9004 * i_3323_;
									i_3319_ += anInt8991 * i_3323_;
								} else
									i_3322_ -= i_3323_;
								if (i_3320_ < i_3322_)
									i_3320_ = i_3322_;
								for (/**/; i_3320_ < 0; i_3320_++) {
									int i_3324_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_3319_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_3318_ >> 12))]);
									int i_3325_ = i_3324_ >>> 24;
									int i_3326_ = 256 - i_3325_;
									int i_3327_ = is_3314_[i_3317_];
									is_3314_[i_3317_++] = ((((i_3324_ & 0xff00ff) * i_3325_ + (i_3327_ & 0xff00ff) * i_3326_) & ~0xff00ff) + (((i_3324_ & 0xff00) * i_3325_ + (i_3327_ & 0xff00) * i_3326_) & 0xff0000)) >> 8;
								}
							}
						}
						i_3315_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_3328_ = anInt9001;
					while (i_3328_ < 0) {
						int i_3329_ = i_3328_ + i_3313_;
						if (i_3329_ >= 0) {
							if (i_3329_ >= is.length)
								break;
							int i_3330_ = anInt9003;
							int i_3331_ = anInt8988;
							int i_3332_ = anInt9011 + anInt9013;
							int i_3333_ = anInt8999;
							if (i_3331_ >= 0 && (i_3331_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) < 0) {
								int i_3334_;
								if ((i_3334_ = (i_3332_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12))) >= 0) {
									i_3334_ = (anInt8991 - i_3334_) / anInt8991;
									i_3333_ += i_3334_;
									i_3332_ += anInt8991 * i_3334_;
									i_3330_ += i_3334_;
								}
								if ((i_3334_ = (i_3332_ - anInt8991) / anInt8991) > i_3333_)
									i_3333_ = i_3334_;
								int i_3335_ = is[i_3329_] - i;
								int i_3336_ = -is_3312_[i_3329_];
								int i_3337_ = i_3335_ - (i_3330_ - anInt9003);
								if (i_3337_ > 0) {
									i_3330_ += i_3337_;
									i_3333_ += i_3337_;
									i_3331_ += anInt9004 * i_3337_;
									i_3332_ += anInt8991 * i_3337_;
								} else
									i_3336_ -= i_3337_;
								if (i_3333_ < i_3336_)
									i_3333_ = i_3336_;
								for (/**/; i_3333_ < 0; i_3333_++) {
									int i_3338_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_3332_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_3331_ >> 12))]);
									int i_3339_ = i_3338_ >>> 24;
									int i_3340_ = 256 - i_3339_;
									int i_3341_ = is_3314_[i_3330_];
									is_3314_[i_3330_++] = ((((i_3338_ & 0xff00ff) * i_3339_ + (i_3341_ & 0xff00ff) * i_3340_) & ~0xff00ff) + (((i_3338_ & 0xff00) * i_3339_ + (i_3341_ & 0xff00) * i_3340_) & 0xff0000)) >> 8;
									i_3332_ += anInt8991;
								}
							}
						}
						i_3328_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_3342_ = anInt9001;
					while (i_3342_ < 0) {
						int i_3343_ = i_3342_ + i_3313_;
						if (i_3343_ >= 0) {
							if (i_3343_ >= is.length)
								break;
							int i_3344_ = anInt9003;
							int i_3345_ = anInt8988;
							int i_3346_ = anInt9011 + anInt9013;
							int i_3347_ = anInt8999;
							if (i_3345_ >= 0 && (i_3345_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) < 0) {
								if (i_3346_ < 0) {
									int i_3348_ = ((anInt8991 - 1 - i_3346_) / anInt8991);
									i_3347_ += i_3348_;
									i_3346_ += anInt8991 * i_3348_;
									i_3344_ += i_3348_;
								}
								int i_3349_;
								if ((i_3349_ = (1 + i_3346_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3347_)
									i_3347_ = i_3349_;
								int i_3350_ = is[i_3343_] - i;
								int i_3351_ = -is_3312_[i_3343_];
								int i_3352_ = i_3350_ - (i_3344_ - anInt9003);
								if (i_3352_ > 0) {
									i_3344_ += i_3352_;
									i_3347_ += i_3352_;
									i_3345_ += anInt9004 * i_3352_;
									i_3346_ += anInt8991 * i_3352_;
								} else
									i_3351_ -= i_3352_;
								if (i_3347_ < i_3351_)
									i_3347_ = i_3351_;
								for (/**/; i_3347_ < 0; i_3347_++) {
									int i_3353_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_3346_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_3345_ >> 12))]);
									int i_3354_ = i_3353_ >>> 24;
									int i_3355_ = 256 - i_3354_;
									int i_3356_ = is_3314_[i_3344_];
									is_3314_[i_3344_++] = ((((i_3353_ & 0xff00ff) * i_3354_ + (i_3356_ & 0xff00ff) * i_3355_) & ~0xff00ff) + (((i_3353_ & 0xff00) * i_3354_ + (i_3356_ & 0xff00) * i_3355_) & 0xff0000)) >> 8;
									i_3346_ += anInt8991;
								}
							}
						}
						i_3342_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_3357_ = anInt9001;
					while (i_3357_ < 0) {
						int i_3358_ = i_3357_ + i_3313_;
						if (i_3358_ >= 0) {
							if (i_3358_ >= is.length)
								break;
							int i_3359_ = anInt9003;
							int i_3360_ = anInt8988 + anInt9012;
							int i_3361_ = anInt9011;
							int i_3362_ = anInt8999;
							if (i_3361_ >= 0 && (i_3361_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) < 0) {
								int i_3363_;
								if ((i_3363_ = (i_3360_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12))) >= 0) {
									i_3363_ = (anInt9004 - i_3363_) / anInt9004;
									i_3362_ += i_3363_;
									i_3360_ += anInt9004 * i_3363_;
									i_3359_ += i_3363_;
								}
								if ((i_3363_ = (i_3360_ - anInt9004) / anInt9004) > i_3362_)
									i_3362_ = i_3363_;
								int i_3364_ = is[i_3358_] - i;
								int i_3365_ = -is_3312_[i_3358_];
								int i_3366_ = i_3364_ - (i_3359_ - anInt9003);
								if (i_3366_ > 0) {
									i_3359_ += i_3366_;
									i_3362_ += i_3366_;
									i_3360_ += anInt9004 * i_3366_;
									i_3361_ += anInt8991 * i_3366_;
								} else
									i_3365_ -= i_3366_;
								if (i_3362_ < i_3365_)
									i_3362_ = i_3365_;
								for (/**/; i_3362_ < 0; i_3362_++) {
									int i_3367_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_3361_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_3360_ >> 12))]);
									int i_3368_ = i_3367_ >>> 24;
									int i_3369_ = 256 - i_3368_;
									int i_3370_ = is_3314_[i_3359_];
									is_3314_[i_3359_++] = ((((i_3367_ & 0xff00ff) * i_3368_ + (i_3370_ & 0xff00ff) * i_3369_) & ~0xff00ff) + (((i_3367_ & 0xff00) * i_3368_ + (i_3370_ & 0xff00) * i_3369_) & 0xff0000)) >> 8;
									i_3360_ += anInt9004;
								}
							}
						}
						i_3357_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_3371_ = anInt9001;
					while (i_3371_ < 0) {
						int i_3372_ = i_3371_ + i_3313_;
						if (i_3372_ >= 0) {
							if (i_3372_ >= is.length)
								break;
							int i_3373_ = anInt9003;
							int i_3374_ = anInt8988 + anInt9012;
							int i_3375_ = anInt9011 + anInt9013;
							int i_3376_ = anInt8999;
							int i_3377_;
							if ((i_3377_ = (i_3374_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12))) >= 0) {
								i_3377_ = (anInt9004 - i_3377_) / anInt9004;
								i_3376_ += i_3377_;
								i_3374_ += anInt9004 * i_3377_;
								i_3375_ += anInt8991 * i_3377_;
								i_3373_ += i_3377_;
							}
							if ((i_3377_ = (i_3374_ - anInt9004) / anInt9004) > i_3376_)
								i_3376_ = i_3377_;
							if ((i_3377_ = (i_3375_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12))) >= 0) {
								i_3377_ = (anInt8991 - i_3377_) / anInt8991;
								i_3376_ += i_3377_;
								i_3374_ += anInt9004 * i_3377_;
								i_3375_ += anInt8991 * i_3377_;
								i_3373_ += i_3377_;
							}
							if ((i_3377_ = (i_3375_ - anInt8991) / anInt8991) > i_3376_)
								i_3376_ = i_3377_;
							int i_3378_ = is[i_3372_] - i;
							int i_3379_ = -is_3312_[i_3372_];
							int i_3380_ = i_3378_ - (i_3373_ - anInt9003);
							if (i_3380_ > 0) {
								i_3373_ += i_3380_;
								i_3376_ += i_3380_;
								i_3374_ += anInt9004 * i_3380_;
								i_3375_ += anInt8991 * i_3380_;
							} else
								i_3379_ -= i_3380_;
							if (i_3376_ < i_3379_)
								i_3376_ = i_3379_;
							for (/**/; i_3376_ < 0; i_3376_++) {
								int i_3381_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_3375_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010 + (i_3374_ >> 12))]);
								int i_3382_ = i_3381_ >>> 24;
								int i_3383_ = 256 - i_3382_;
								int i_3384_ = is_3314_[i_3373_];
								is_3314_[i_3373_++] = ((((i_3381_ & 0xff00ff) * i_3382_ + (i_3384_ & 0xff00ff) * i_3383_) & ~0xff00ff) + (((i_3381_ & 0xff00) * i_3382_ + (i_3384_ & 0xff00) * i_3383_) & 0xff0000)) >> 8;
								i_3374_ += anInt9004;
								i_3375_ += anInt8991;
							}
						}
						i_3371_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_3385_ = anInt9001;
					while (i_3385_ < 0) {
						int i_3386_ = i_3385_ + i_3313_;
						if (i_3386_ >= 0) {
							if (i_3386_ >= is.length)
								break;
							int i_3387_ = anInt9003;
							int i_3388_ = anInt8988 + anInt9012;
							int i_3389_ = anInt9011 + anInt9013;
							int i_3390_ = anInt8999;
							int i_3391_;
							if ((i_3391_ = (i_3388_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12))) >= 0) {
								i_3391_ = (anInt9004 - i_3391_) / anInt9004;
								i_3390_ += i_3391_;
								i_3388_ += anInt9004 * i_3391_;
								i_3389_ += anInt8991 * i_3391_;
								i_3387_ += i_3391_;
							}
							if ((i_3391_ = (i_3388_ - anInt9004) / anInt9004) > i_3390_)
								i_3390_ = i_3391_;
							if (i_3389_ < 0) {
								i_3391_ = (anInt8991 - 1 - i_3389_) / anInt8991;
								i_3390_ += i_3391_;
								i_3388_ += anInt9004 * i_3391_;
								i_3389_ += anInt8991 * i_3391_;
								i_3387_ += i_3391_;
							}
							if ((i_3391_ = (1 + i_3389_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3390_)
								i_3390_ = i_3391_;
							int i_3392_ = is[i_3386_] - i;
							int i_3393_ = -is_3312_[i_3386_];
							int i_3394_ = i_3392_ - (i_3387_ - anInt9003);
							if (i_3394_ > 0) {
								i_3387_ += i_3394_;
								i_3390_ += i_3394_;
								i_3388_ += anInt9004 * i_3394_;
								i_3389_ += anInt8991 * i_3394_;
							} else
								i_3393_ -= i_3394_;
							if (i_3390_ < i_3393_)
								i_3390_ = i_3393_;
							for (/**/; i_3390_ < 0; i_3390_++) {
								int i_3395_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_3389_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010 + (i_3388_ >> 12))]);
								int i_3396_ = i_3395_ >>> 24;
								int i_3397_ = 256 - i_3396_;
								int i_3398_ = is_3314_[i_3387_];
								is_3314_[i_3387_++] = ((((i_3395_ & 0xff00ff) * i_3396_ + (i_3398_ & 0xff00ff) * i_3397_) & ~0xff00ff) + (((i_3395_ & 0xff00) * i_3396_ + (i_3398_ & 0xff00) * i_3397_) & 0xff0000)) >> 8;
								i_3388_ += anInt9004;
								i_3389_ += anInt8991;
							}
						}
						i_3385_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_3399_ = anInt9001;
				while (i_3399_ < 0) {
					int i_3400_ = i_3399_ + i_3313_;
					if (i_3400_ >= 0) {
						if (i_3400_ >= is.length)
							break;
						int i_3401_ = anInt9003;
						int i_3402_ = anInt8988 + anInt9012;
						int i_3403_ = anInt9011;
						int i_3404_ = anInt8999;
						if (i_3403_ >= 0 && i_3403_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) < 0) {
							if (i_3402_ < 0) {
								int i_3405_ = (anInt9004 - 1 - i_3402_) / anInt9004;
								i_3404_ += i_3405_;
								i_3402_ += anInt9004 * i_3405_;
								i_3401_ += i_3405_;
							}
							int i_3406_;
							if ((i_3406_ = (1 + i_3402_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3404_)
								i_3404_ = i_3406_;
							int i_3407_ = is[i_3400_] - i;
							int i_3408_ = -is_3312_[i_3400_];
							int i_3409_ = i_3407_ - (i_3401_ - anInt9003);
							if (i_3409_ > 0) {
								i_3401_ += i_3409_;
								i_3404_ += i_3409_;
								i_3402_ += anInt9004 * i_3409_;
								i_3403_ += anInt8991 * i_3409_;
							} else
								i_3408_ -= i_3409_;
							if (i_3404_ < i_3408_)
								i_3404_ = i_3408_;
							for (/**/; i_3404_ < 0; i_3404_++) {
								int i_3410_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_3403_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010 + (i_3402_ >> 12))]);
								int i_3411_ = i_3410_ >>> 24;
								int i_3412_ = 256 - i_3411_;
								int i_3413_ = is_3314_[i_3401_];
								is_3314_[i_3401_++] = ((((i_3410_ & 0xff00ff) * i_3411_ + (i_3413_ & 0xff00ff) * i_3412_) & ~0xff00ff) + (((i_3410_ & 0xff00) * i_3411_ + (i_3413_ & 0xff00) * i_3412_) & 0xff0000)) >> 8;
								i_3402_ += anInt9004;
							}
						}
					}
					i_3399_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				int i_3414_ = anInt9001;
				while (i_3414_ < 0) {
					int i_3415_ = i_3414_ + i_3313_;
					if (i_3415_ >= 0) {
						if (i_3415_ >= is.length)
							break;
						int i_3416_ = anInt9003;
						int i_3417_ = anInt8988 + anInt9012;
						int i_3418_ = anInt9011 + anInt9013;
						int i_3419_ = anInt8999;
						if (i_3417_ < 0) {
							int i_3420_ = (anInt9004 - 1 - i_3417_) / anInt9004;
							i_3419_ += i_3420_;
							i_3417_ += anInt9004 * i_3420_;
							i_3418_ += anInt8991 * i_3420_;
							i_3416_ += i_3420_;
						}
						int i_3421_;
						if ((i_3421_ = (1 + i_3417_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3419_)
							i_3419_ = i_3421_;
						if ((i_3421_ = i_3418_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) >= 0) {
							i_3421_ = (anInt8991 - i_3421_) / anInt8991;
							i_3419_ += i_3421_;
							i_3417_ += anInt9004 * i_3421_;
							i_3418_ += anInt8991 * i_3421_;
							i_3416_ += i_3421_;
						}
						if ((i_3421_ = (i_3418_ - anInt8991) / anInt8991) > i_3419_)
							i_3419_ = i_3421_;
						int i_3422_ = is[i_3415_] - i;
						int i_3423_ = -is_3312_[i_3415_];
						int i_3424_ = i_3422_ - (i_3416_ - anInt9003);
						if (i_3424_ > 0) {
							i_3416_ += i_3424_;
							i_3419_ += i_3424_;
							i_3417_ += anInt9004 * i_3424_;
							i_3418_ += anInt8991 * i_3424_;
						} else
							i_3423_ -= i_3424_;
						if (i_3419_ < i_3423_)
							i_3419_ = i_3423_;
						for (/**/; i_3419_ < 0; i_3419_++) {
							int i_3425_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_3418_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_3417_ >> 12))]);
							int i_3426_ = i_3425_ >>> 24;
							int i_3427_ = 256 - i_3426_;
							int i_3428_ = is_3314_[i_3416_];
							is_3314_[i_3416_++] = ((((i_3425_ & 0xff00ff) * i_3426_ + (i_3428_ & 0xff00ff) * i_3427_) & ~0xff00ff) + (((i_3425_ & 0xff00) * i_3426_ + (i_3428_ & 0xff00) * i_3427_) & 0xff0000)) >> 8;
							i_3417_ += anInt9004;
							i_3418_ += anInt8991;
						}
					}
					i_3414_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				int i_3429_ = anInt9001;
				while (i_3429_ < 0) {
					int i_3430_ = i_3429_ + i_3313_;
					if (i_3430_ >= 0) {
						if (i_3430_ >= is.length)
							break;
						int i_3431_ = anInt9003;
						int i_3432_ = anInt8988 + anInt9012;
						int i_3433_ = anInt9011 + anInt9013;
						int i_3434_ = anInt8999;
						if (i_3432_ < 0) {
							int i_3435_ = (anInt9004 - 1 - i_3432_) / anInt9004;
							i_3434_ += i_3435_;
							i_3432_ += anInt9004 * i_3435_;
							i_3433_ += anInt8991 * i_3435_;
							i_3431_ += i_3435_;
						}
						int i_3436_;
						if ((i_3436_ = (1 + i_3432_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3434_)
							i_3434_ = i_3436_;
						if (i_3433_ < 0) {
							i_3436_ = (anInt8991 - 1 - i_3433_) / anInt8991;
							i_3434_ += i_3436_;
							i_3432_ += anInt9004 * i_3436_;
							i_3433_ += anInt8991 * i_3436_;
							i_3431_ += i_3436_;
						}
						if ((i_3436_ = (1 + i_3433_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3434_)
							i_3434_ = i_3436_;
						int i_3437_ = is[i_3430_] - i;
						int i_3438_ = -is_3312_[i_3430_];
						int i_3439_ = i_3437_ - (i_3431_ - anInt9003);
						if (i_3439_ > 0) {
							i_3431_ += i_3439_;
							i_3434_ += i_3439_;
							i_3432_ += anInt9004 * i_3439_;
							i_3433_ += anInt8991 * i_3439_;
						} else
							i_3438_ -= i_3439_;
						if (i_3434_ < i_3438_)
							i_3434_ = i_3438_;
						for (/**/; i_3434_ < 0; i_3434_++) {
							int i_3440_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_3433_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_3432_ >> 12))]);
							int i_3441_ = i_3440_ >>> 24;
							int i_3442_ = 256 - i_3441_;
							int i_3443_ = is_3314_[i_3431_];
							is_3314_[i_3431_++] = ((((i_3440_ & 0xff00ff) * i_3441_ + (i_3443_ & 0xff00ff) * i_3442_) & ~0xff00ff) + (((i_3440_ & 0xff00) * i_3441_ + (i_3443_ & 0xff00) * i_3442_) & 0xff0000)) >> 8;
							i_3432_ += anInt9004;
							i_3433_ += anInt8991;
						}
					}
					i_3429_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	void method651(int i, int i_3444_, int i_3445_, int i_3446_, int i_3447_, int i_3448_, int i_3449_, int i_3450_) {
		if (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (i_3445_ > 0 && i_3446_ > 0) {
			int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
			if (is != null) {
				int i_3451_ = 0;
				int i_3452_ = 0;
				int i_3453_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
				int i_3454_ = (((Class57_Sub1_Sub1) this).anInt8990 + ((Class57_Sub1_Sub1) this).anInt9010 + ((Class57_Sub1_Sub1) this).anInt8997);
				int i_3455_ = (((Class57_Sub1_Sub1) this).anInt9000 + ((Class57_Sub1_Sub1) this).anInt8989 + ((Class57_Sub1_Sub1) this).anInt8993);
				int i_3456_ = (i_3454_ << 16) / i_3445_;
				int i_3457_ = (i_3455_ << 16) / i_3446_;
				if (((Class57_Sub1_Sub1) this).anInt8990 > 0) {
					int i_3458_ = ((((Class57_Sub1_Sub1) this).anInt8990 << 16) + i_3456_ - 1) / i_3456_;
					i += i_3458_;
					i_3451_ += (i_3458_ * i_3456_ - (((Class57_Sub1_Sub1) this).anInt8990 << 16));
				}
				if (((Class57_Sub1_Sub1) this).anInt9000 > 0) {
					int i_3459_ = ((((Class57_Sub1_Sub1) this).anInt9000 << 16) + i_3457_ - 1) / i_3457_;
					i_3444_ += i_3459_;
					i_3452_ += (i_3459_ * i_3457_ - (((Class57_Sub1_Sub1) this).anInt9000 << 16));
				}
				if (((Class57_Sub1_Sub1) this).anInt9010 < i_3454_)
					i_3445_ = ((((Class57_Sub1_Sub1) this).anInt9010 << 16) - i_3451_ + i_3456_ - 1) / i_3456_;
				if (((Class57_Sub1_Sub1) this).anInt8989 < i_3455_)
					i_3446_ = ((((Class57_Sub1_Sub1) this).anInt8989 << 16) - i_3452_ + i_3457_ - 1) / i_3457_;
				int i_3460_ = i + i_3444_ * i_3453_;
				int i_3461_ = i_3453_ - i_3445_;
				if (i_3444_ + i_3446_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7977 * 63686679))
					i_3446_ -= (i_3444_ + i_3446_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7977) * 63686679);
				if (i_3444_ < (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805) {
					int i_3462_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_3444_;
					i_3446_ -= i_3462_;
					i_3460_ += i_3462_ * i_3453_;
					i_3452_ += i_3457_ * i_3462_;
				}
				if (i + i_3445_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725) {
					int i_3463_ = (i + i_3445_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725);
					i_3445_ -= i_3463_;
					i_3461_ += i_3463_;
				}
				if (i < (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7974 * -912871679)) {
					int i_3464_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i;
					i_3445_ -= i_3464_;
					i_3460_ += i_3464_;
					i_3451_ += i_3456_ * i_3464_;
					i_3461_ += i_3464_;
				}
				if (i_3449_ == 0) {
					if (i_3447_ == 1) {
						int i_3465_ = i_3451_;
						for (int i_3466_ = -i_3446_; i_3466_ < 0; i_3466_++) {
							int i_3467_ = ((i_3452_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_3468_ = -i_3445_; i_3468_ < 0; i_3468_++) {
								is[i_3460_++] = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3451_ >> 16) + i_3467_]);
								i_3451_ += i_3456_;
							}
							i_3452_ += i_3457_;
							i_3451_ = i_3465_;
							i_3460_ += i_3461_;
						}
					} else if (i_3447_ == 0) {
						int i_3469_ = (i_3448_ & 0xff0000) >> 16;
						int i_3470_ = (i_3448_ & 0xff00) >> 8;
						int i_3471_ = i_3448_ & 0xff;
						int i_3472_ = i_3451_;
						for (int i_3473_ = -i_3446_; i_3473_ < 0; i_3473_++) {
							int i_3474_ = ((i_3452_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_3475_ = -i_3445_; i_3475_ < 0; i_3475_++) {
								int i_3476_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3451_ >> 16) + i_3474_]);
								int i_3477_ = ((i_3476_ & 0xff0000) * i_3469_ & ~0xffffff);
								int i_3478_ = (i_3476_ & 0xff00) * i_3470_ & 0xff0000;
								int i_3479_ = (i_3476_ & 0xff) * i_3471_ & 0xff00;
								is[i_3460_++] = (i_3477_ | i_3478_ | i_3479_) >>> 8;
								i_3451_ += i_3456_;
							}
							i_3452_ += i_3457_;
							i_3451_ = i_3472_;
							i_3460_ += i_3461_;
						}
					} else if (i_3447_ == 3) {
						int i_3480_ = i_3451_;
						for (int i_3481_ = -i_3446_; i_3481_ < 0; i_3481_++) {
							int i_3482_ = ((i_3452_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_3483_ = -i_3445_; i_3483_ < 0; i_3483_++) {
								int i_3484_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3451_ >> 16) + i_3482_]);
								int i_3485_ = i_3484_ + i_3448_;
								int i_3486_ = ((i_3484_ & 0xff00ff) + (i_3448_ & 0xff00ff));
								int i_3487_ = ((i_3486_ & 0x1000100) + (i_3485_ - i_3486_ & 0x10000));
								is[i_3460_++] = i_3485_ - i_3487_ | i_3487_ - (i_3487_ >>> 8);
								i_3451_ += i_3456_;
							}
							i_3452_ += i_3457_;
							i_3451_ = i_3480_;
							i_3460_ += i_3461_;
						}
					} else if (i_3447_ == 2) {
						int i_3488_ = i_3448_ >>> 24;
						int i_3489_ = 256 - i_3488_;
						int i_3490_ = (i_3448_ & 0xff00ff) * i_3489_ & ~0xff00ff;
						int i_3491_ = (i_3448_ & 0xff00) * i_3489_ & 0xff0000;
						i_3448_ = (i_3490_ | i_3491_) >>> 8;
						int i_3492_ = i_3451_;
						for (int i_3493_ = -i_3446_; i_3493_ < 0; i_3493_++) {
							int i_3494_ = ((i_3452_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_3495_ = -i_3445_; i_3495_ < 0; i_3495_++) {
								int i_3496_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3451_ >> 16) + i_3494_]);
								i_3490_ = ((i_3496_ & 0xff00ff) * i_3488_ & ~0xff00ff);
								i_3491_ = (i_3496_ & 0xff00) * i_3488_ & 0xff0000;
								is[i_3460_++] = ((i_3490_ | i_3491_) >>> 8) + i_3448_;
								i_3451_ += i_3456_;
							}
							i_3452_ += i_3457_;
							i_3451_ = i_3492_;
							i_3460_ += i_3461_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3449_ == 1) {
					if (i_3447_ == 1) {
						int i_3497_ = i_3451_;
						for (int i_3498_ = -i_3446_; i_3498_ < 0; i_3498_++) {
							int i_3499_ = ((i_3452_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_3500_ = -i_3445_; i_3500_ < 0; i_3500_++) {
								int i_3501_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3451_ >> 16) + i_3499_]);
								int i_3502_ = i_3501_ >>> 24;
								int i_3503_ = 256 - i_3502_;
								int i_3504_ = is[i_3460_];
								is[i_3460_++] = (((((i_3501_ & 0xff00ff) * i_3502_ + (i_3504_ & 0xff00ff) * i_3503_) & ~0xff00ff) >> 8) + (((((i_3501_ & ~0xff00ff) >>> 8) * i_3502_) + (((i_3504_ & ~0xff00ff) >>> 8) * i_3503_)) & ~0xff00ff));
								i_3451_ += i_3456_;
							}
							i_3452_ += i_3457_;
							i_3451_ = i_3497_;
							i_3460_ += i_3461_;
						}
					} else if (i_3447_ == 0) {
						int i_3505_ = i_3451_;
						if ((i_3448_ & 0xffffff) == 16777215) {
							for (int i_3506_ = -i_3446_; i_3506_ < 0; i_3506_++) {
								int i_3507_ = ((i_3452_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
								for (int i_3508_ = -i_3445_; i_3508_ < 0; i_3508_++) {
									int i_3509_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3451_ >> 16) + i_3507_]);
									int i_3510_ = ((i_3509_ >>> 24) * (i_3448_ >>> 24) >> 8);
									int i_3511_ = 256 - i_3510_;
									int i_3512_ = is[i_3460_];
									is[i_3460_++] = ((((i_3509_ & 0xff00ff) * i_3510_ + (i_3512_ & 0xff00ff) * i_3511_) & ~0xff00ff) + (((i_3509_ & 0xff00) * i_3510_ + (i_3512_ & 0xff00) * i_3511_) & 0xff0000)) >> 8;
									i_3451_ += i_3456_;
								}
								i_3452_ += i_3457_;
								i_3451_ = i_3505_;
								i_3460_ += i_3461_;
							}
						} else {
							int i_3513_ = (i_3448_ & 0xff0000) >> 16;
							int i_3514_ = (i_3448_ & 0xff00) >> 8;
							int i_3515_ = i_3448_ & 0xff;
							for (int i_3516_ = -i_3446_; i_3516_ < 0; i_3516_++) {
								int i_3517_ = ((i_3452_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
								for (int i_3518_ = -i_3445_; i_3518_ < 0; i_3518_++) {
									int i_3519_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3451_ >> 16) + i_3517_]);
									int i_3520_ = ((i_3519_ >>> 24) * (i_3448_ >>> 24) >> 8);
									int i_3521_ = 256 - i_3520_;
									if (i_3520_ != 255) {
										int i_3522_ = ((i_3519_ & 0xff0000) * i_3513_ & ~0xffffff);
										int i_3523_ = ((i_3519_ & 0xff00) * i_3514_ & 0xff0000);
										int i_3524_ = ((i_3519_ & 0xff) * i_3515_ & 0xff00);
										i_3519_ = (i_3522_ | i_3523_ | i_3524_) >>> 8;
										int i_3525_ = is[i_3460_];
										is[i_3460_++] = ((((i_3519_ & 0xff00ff) * i_3520_ + ((i_3525_ & 0xff00ff) * i_3521_)) & ~0xff00ff) + (((i_3519_ & 0xff00) * i_3520_ + ((i_3525_ & 0xff00) * i_3521_)) & 0xff0000)) >> 8;
									} else {
										int i_3526_ = ((i_3519_ & 0xff0000) * i_3513_ & ~0xffffff);
										int i_3527_ = ((i_3519_ & 0xff00) * i_3514_ & 0xff0000);
										int i_3528_ = ((i_3519_ & 0xff) * i_3515_ & 0xff00);
										is[i_3460_++] = (i_3526_ | i_3527_ | i_3528_) >>> 8;
									}
									i_3451_ += i_3456_;
								}
								i_3452_ += i_3457_;
								i_3451_ = i_3505_;
								i_3460_ += i_3461_;
							}
						}
					} else if (i_3447_ == 3) {
						int i_3529_ = i_3451_;
						for (int i_3530_ = -i_3446_; i_3530_ < 0; i_3530_++) {
							int i_3531_ = ((i_3452_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_3532_ = -i_3445_; i_3532_ < 0; i_3532_++) {
								int i_3533_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3451_ >> 16) + i_3531_]);
								int i_3534_ = i_3533_ + i_3448_;
								int i_3535_ = ((i_3533_ & 0xff00ff) + (i_3448_ & 0xff00ff));
								int i_3536_ = ((i_3535_ & 0x1000100) + (i_3534_ - i_3535_ & 0x10000));
								i_3536_ = i_3534_ - i_3536_ | i_3536_ - (i_3536_ >>> 8);
								int i_3537_ = (i_3536_ >>> 24) * (i_3448_ >>> 24) >> 8;
								int i_3538_ = 256 - i_3537_;
								if (i_3537_ != 255) {
									i_3533_ = i_3536_;
									i_3536_ = is[i_3460_];
									i_3536_ = ((((i_3533_ & 0xff00ff) * i_3537_ + (i_3536_ & 0xff00ff) * i_3538_) & ~0xff00ff) + (((i_3533_ & 0xff00) * i_3537_ + (i_3536_ & 0xff00) * i_3538_) & 0xff0000)) >> 8;
								}
								is[i_3460_++] = i_3536_;
								i_3451_ += i_3456_;
							}
							i_3452_ += i_3457_;
							i_3451_ = i_3529_;
							i_3460_ += i_3461_;
						}
					} else if (i_3447_ == 2) {
						int i_3539_ = i_3448_ >>> 24;
						int i_3540_ = 256 - i_3539_;
						int i_3541_ = (i_3448_ & 0xff00ff) * i_3540_ & ~0xff00ff;
						int i_3542_ = (i_3448_ & 0xff00) * i_3540_ & 0xff0000;
						i_3448_ = (i_3541_ | i_3542_) >>> 8;
						int i_3543_ = i_3451_;
						for (int i_3544_ = -i_3446_; i_3544_ < 0; i_3544_++) {
							int i_3545_ = ((i_3452_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_3546_ = -i_3445_; i_3546_ < 0; i_3546_++) {
								int i_3547_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3451_ >> 16) + i_3545_]);
								int i_3548_ = i_3547_ >>> 24;
								int i_3549_ = 256 - i_3548_;
								i_3541_ = ((i_3547_ & 0xff00ff) * i_3539_ & ~0xff00ff);
								i_3542_ = (i_3547_ & 0xff00) * i_3539_ & 0xff0000;
								i_3547_ = ((i_3541_ | i_3542_) >>> 8) + i_3448_;
								int i_3550_ = is[i_3460_];
								is[i_3460_++] = ((((i_3547_ & 0xff00ff) * i_3548_ + (i_3550_ & 0xff00ff) * i_3549_) & ~0xff00ff) + (((i_3547_ & 0xff00) * i_3548_ + (i_3550_ & 0xff00) * i_3549_) & 0xff0000)) >> 8;
								i_3451_ += i_3456_;
							}
							i_3452_ += i_3457_;
							i_3451_ = i_3543_;
							i_3460_ += i_3461_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3449_ == 2) {
					if (i_3447_ == 1) {
						int i_3551_ = i_3451_;
						for (int i_3552_ = -i_3446_; i_3552_ < 0; i_3552_++) {
							int i_3553_ = ((i_3452_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_3554_ = -i_3445_; i_3554_ < 0; i_3554_++) {
								int i_3555_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3451_ >> 16) + i_3553_]);
								if (i_3555_ != 0) {
									int i_3556_ = is[i_3460_];
									int i_3557_ = i_3555_ + i_3556_;
									int i_3558_ = ((i_3555_ & 0xff00ff) + (i_3556_ & 0xff00ff));
									i_3556_ = ((i_3558_ & 0x1000100) + (i_3557_ - i_3558_ & 0x10000));
									is[i_3460_++] = (i_3557_ - i_3556_ | i_3556_ - (i_3556_ >>> 8));
								} else
									i_3460_++;
								i_3451_ += i_3456_;
							}
							i_3452_ += i_3457_;
							i_3451_ = i_3551_;
							i_3460_ += i_3461_;
						}
					} else if (i_3447_ == 0) {
						int i_3559_ = i_3451_;
						int i_3560_ = (i_3448_ & 0xff0000) >> 16;
						int i_3561_ = (i_3448_ & 0xff00) >> 8;
						int i_3562_ = i_3448_ & 0xff;
						for (int i_3563_ = -i_3446_; i_3563_ < 0; i_3563_++) {
							int i_3564_ = ((i_3452_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_3565_ = -i_3445_; i_3565_ < 0; i_3565_++) {
								int i_3566_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3451_ >> 16) + i_3564_]);
								if (i_3566_ != 0) {
									int i_3567_ = ((i_3566_ & 0xff0000) * i_3560_ & ~0xffffff);
									int i_3568_ = ((i_3566_ & 0xff00) * i_3561_ & 0xff0000);
									int i_3569_ = (i_3566_ & 0xff) * i_3562_ & 0xff00;
									i_3566_ = (i_3567_ | i_3568_ | i_3569_) >>> 8;
									int i_3570_ = is[i_3460_];
									int i_3571_ = i_3566_ + i_3570_;
									int i_3572_ = ((i_3566_ & 0xff00ff) + (i_3570_ & 0xff00ff));
									i_3570_ = ((i_3572_ & 0x1000100) + (i_3571_ - i_3572_ & 0x10000));
									is[i_3460_++] = (i_3571_ - i_3570_ | i_3570_ - (i_3570_ >>> 8));
								} else
									i_3460_++;
								i_3451_ += i_3456_;
							}
							i_3452_ += i_3457_;
							i_3451_ = i_3559_;
							i_3460_ += i_3461_;
						}
					} else if (i_3447_ == 3) {
						int i_3573_ = i_3451_;
						for (int i_3574_ = -i_3446_; i_3574_ < 0; i_3574_++) {
							int i_3575_ = ((i_3452_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_3576_ = -i_3445_; i_3576_ < 0; i_3576_++) {
								int i_3577_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3451_ >> 16) + i_3575_]);
								int i_3578_ = i_3577_ + i_3448_;
								int i_3579_ = ((i_3577_ & 0xff00ff) + (i_3448_ & 0xff00ff));
								int i_3580_ = ((i_3579_ & 0x1000100) + (i_3578_ - i_3579_ & 0x10000));
								i_3577_ = i_3578_ - i_3580_ | i_3580_ - (i_3580_ >>> 8);
								i_3580_ = is[i_3460_];
								i_3578_ = i_3577_ + i_3580_;
								i_3579_ = (i_3577_ & 0xff00ff) + (i_3580_ & 0xff00ff);
								i_3580_ = ((i_3579_ & 0x1000100) + (i_3578_ - i_3579_ & 0x10000));
								is[i_3460_++] = i_3578_ - i_3580_ | i_3580_ - (i_3580_ >>> 8);
								i_3451_ += i_3456_;
							}
							i_3452_ += i_3457_;
							i_3451_ = i_3573_;
							i_3460_ += i_3461_;
						}
					} else if (i_3447_ == 2) {
						int i_3581_ = i_3448_ >>> 24;
						int i_3582_ = 256 - i_3581_;
						int i_3583_ = (i_3448_ & 0xff00ff) * i_3582_ & ~0xff00ff;
						int i_3584_ = (i_3448_ & 0xff00) * i_3582_ & 0xff0000;
						i_3448_ = (i_3583_ | i_3584_) >>> 8;
						int i_3585_ = i_3451_;
						for (int i_3586_ = -i_3446_; i_3586_ < 0; i_3586_++) {
							int i_3587_ = ((i_3452_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_3588_ = -i_3445_; i_3588_ < 0; i_3588_++) {
								int i_3589_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3451_ >> 16) + i_3587_]);
								if (i_3589_ != 0) {
									i_3583_ = ((i_3589_ & 0xff00ff) * i_3581_ & ~0xff00ff);
									i_3584_ = ((i_3589_ & 0xff00) * i_3581_ & 0xff0000);
									i_3589_ = (((i_3583_ | i_3584_) >>> 8) + i_3448_);
									int i_3590_ = is[i_3460_];
									int i_3591_ = i_3589_ + i_3590_;
									int i_3592_ = ((i_3589_ & 0xff00ff) + (i_3590_ & 0xff00ff));
									i_3590_ = ((i_3592_ & 0x1000100) + (i_3591_ - i_3592_ & 0x10000));
									is[i_3460_++] = (i_3591_ - i_3590_ | i_3590_ - (i_3590_ >>> 8));
								} else
									i_3460_++;
								i_3451_ += i_3456_;
							}
							i_3452_ += i_3457_;
							i_3451_ = i_3585_;
							i_3460_ += i_3461_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method682(boolean bool, boolean bool_3593_, boolean bool_3594_, int i, int i_3595_, float f, int i_3596_, int i_3597_, int i_3598_, int i_3599_, int i_3600_, int i_3601_, boolean bool_3602_) {
		if (i_3596_ > 0 && i_3597_ > 0 && (bool || bool_3593_)) {
			int i_3603_ = 0;
			int i_3604_ = 0;
			int i_3605_ = (((Class57_Sub1_Sub1) this).anInt8990 + ((Class57_Sub1_Sub1) this).anInt9010 + ((Class57_Sub1_Sub1) this).anInt8997);
			int i_3606_ = (((Class57_Sub1_Sub1) this).anInt9000 + ((Class57_Sub1_Sub1) this).anInt8989 + ((Class57_Sub1_Sub1) this).anInt8993);
			int i_3607_ = (i_3605_ << 16) / i_3596_;
			int i_3608_ = (i_3606_ << 16) / i_3597_;
			if (((Class57_Sub1_Sub1) this).anInt8990 > 0) {
				int i_3609_ = (((((Class57_Sub1_Sub1) this).anInt8990 << 16) + i_3607_ - 1) / i_3607_);
				i += i_3609_;
				i_3603_ += (i_3609_ * i_3607_ - (((Class57_Sub1_Sub1) this).anInt8990 << 16));
			}
			if (((Class57_Sub1_Sub1) this).anInt9000 > 0) {
				int i_3610_ = (((((Class57_Sub1_Sub1) this).anInt9000 << 16) + i_3608_ - 1) / i_3608_);
				i_3595_ += i_3610_;
				i_3604_ += (i_3610_ * i_3608_ - (((Class57_Sub1_Sub1) this).anInt9000 << 16));
			}
			if (((Class57_Sub1_Sub1) this).anInt9010 < i_3605_)
				i_3596_ = ((((Class57_Sub1_Sub1) this).anInt9010 << 16) - i_3603_ + i_3607_ - 1) / i_3607_;
			if (((Class57_Sub1_Sub1) this).anInt8989 < i_3606_)
				i_3597_ = ((((Class57_Sub1_Sub1) this).anInt8989 << 16) - i_3604_ + i_3608_ - 1) / i_3608_;
			int i_3611_ = i + i_3595_ * ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971) * 692106883);
			int i_3612_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883) - i_3596_);
			if (i_3595_ + i_3597_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_3597_ -= (i_3595_ + i_3597_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i_3595_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_3613_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_3595_);
				i_3597_ -= i_3613_;
				i_3611_ += i_3613_ * ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7971) * 692106883);
				i_3604_ += i_3608_ * i_3613_;
			}
			if (i + i_3596_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_3614_ = (i + i_3596_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_3596_ -= i_3614_;
				i_3612_ += i_3614_;
			}
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_3615_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_3596_ -= i_3615_;
				i_3611_ += i_3615_;
				i_3603_ += i_3607_ * i_3615_;
				i_3612_ += i_3615_;
			}
			float[] fs = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).aFloatArray7973);
			int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
			if (i_3600_ == 0) {
				if (i_3598_ == 1) {
					int i_3616_ = i_3603_;
					for (int i_3617_ = -i_3597_; i_3617_ < 0; i_3617_++) {
						int i_3618_ = ((i_3604_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_3619_ = -i_3596_; i_3619_ < 0; i_3619_++) {
							if (!bool_3593_ || f < fs[i_3611_]) {
								if (bool)
									is[i_3611_] = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3603_ >> 16) + i_3618_]);
								if (bool_3593_ && bool_3602_)
									fs[i_3611_] = f;
							}
							i_3603_ += i_3607_;
							i_3611_++;
						}
						i_3604_ += i_3608_;
						i_3603_ = i_3616_;
						i_3611_ += i_3612_;
					}
				} else if (i_3598_ == 0) {
					int i_3620_ = (i_3599_ & 0xff0000) >> 16;
					int i_3621_ = (i_3599_ & 0xff00) >> 8;
					int i_3622_ = i_3599_ & 0xff;
					int i_3623_ = i_3603_;
					for (int i_3624_ = -i_3597_; i_3624_ < 0; i_3624_++) {
						int i_3625_ = ((i_3604_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_3626_ = -i_3596_; i_3626_ < 0; i_3626_++) {
							if (!bool_3593_ || f < fs[i_3611_]) {
								if (bool) {
									int i_3627_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3603_ >> 16) + i_3625_]);
									int i_3628_ = ((i_3627_ & 0xff0000) * i_3620_ & ~0xffffff);
									int i_3629_ = ((i_3627_ & 0xff00) * i_3621_ & 0xff0000);
									int i_3630_ = (i_3627_ & 0xff) * i_3622_ & 0xff00;
									is[i_3611_] = (i_3628_ | i_3629_ | i_3630_) >>> 8;
								}
								if (bool_3593_ && bool_3602_)
									fs[i_3611_] = f;
							}
							i_3603_ += i_3607_;
							i_3611_++;
						}
						i_3604_ += i_3608_;
						i_3603_ = i_3623_;
						i_3611_ += i_3612_;
					}
				} else if (i_3598_ == 3) {
					int i_3631_ = i_3603_;
					for (int i_3632_ = -i_3597_; i_3632_ < 0; i_3632_++) {
						int i_3633_ = ((i_3604_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_3634_ = -i_3596_; i_3634_ < 0; i_3634_++) {
							if (!bool_3593_ || f < fs[i_3611_]) {
								if (bool) {
									int i_3635_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3603_ >> 16) + i_3633_]);
									int i_3636_ = i_3635_ + i_3599_;
									int i_3637_ = ((i_3635_ & 0xff00ff) + (i_3599_ & 0xff00ff));
									int i_3638_ = ((i_3637_ & 0x1000100) + (i_3636_ - i_3637_ & 0x10000));
									is[i_3611_] = (i_3636_ - i_3638_ | i_3638_ - (i_3638_ >>> 8));
								}
								if (bool_3593_ && bool_3602_)
									fs[i_3611_] = f;
							}
							i_3603_ += i_3607_;
							i_3611_++;
						}
						i_3604_ += i_3608_;
						i_3603_ = i_3631_;
						i_3611_ += i_3612_;
					}
				} else if (i_3598_ == 2) {
					int i_3639_ = i_3599_ >>> 24;
					int i_3640_ = 256 - i_3639_;
					int i_3641_ = (i_3599_ & 0xff00ff) * i_3640_ & ~0xff00ff;
					int i_3642_ = (i_3599_ & 0xff00) * i_3640_ & 0xff0000;
					i_3599_ = (i_3641_ | i_3642_) >>> 8;
					int i_3643_ = i_3603_;
					for (int i_3644_ = -i_3597_; i_3644_ < 0; i_3644_++) {
						int i_3645_ = ((i_3604_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_3646_ = -i_3596_; i_3646_ < 0; i_3646_++) {
							if (!bool_3593_ || f < fs[i_3611_]) {
								if (bool) {
									int i_3647_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3603_ >> 16) + i_3645_]);
									i_3641_ = ((i_3647_ & 0xff00ff) * i_3639_ & ~0xff00ff);
									i_3642_ = ((i_3647_ & 0xff00) * i_3639_ & 0xff0000);
									is[i_3611_] = (((i_3641_ | i_3642_) >>> 8) + i_3599_);
								}
								if (bool_3593_ && bool_3602_)
									fs[i_3611_] = f;
							}
							i_3603_ += i_3607_;
							i_3611_++;
						}
						i_3604_ += i_3608_;
						i_3603_ = i_3643_;
						i_3611_ += i_3612_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_3600_ == 1) {
				if (i_3598_ == 1) {
					int i_3648_ = i_3603_;
					for (int i_3649_ = -i_3597_; i_3649_ < 0; i_3649_++) {
						int i_3650_ = ((i_3604_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_3651_ = -i_3596_; i_3651_ < 0; i_3651_++) {
							if (!bool_3593_ || f < fs[i_3611_]) {
								if (bool) {
									int i_3652_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3603_ >> 16) + i_3650_]);
									int i_3653_ = i_3652_ >>> 24;
									int i_3654_ = 256 - i_3653_;
									int i_3655_ = is[i_3611_];
									is[i_3611_] = (((((i_3652_ & 0xff00ff) * i_3653_ + (i_3655_ & 0xff00ff) * i_3654_) & ~0xff00ff) >> 8) + (((((i_3652_ & ~0xff00ff) >>> 8) * i_3653_) + (((i_3655_ & ~0xff00ff) >>> 8) * i_3654_)) & ~0xff00ff));
								}
								if (bool_3593_ && bool_3602_)
									fs[i_3611_] = f;
							}
							i_3603_ += i_3607_;
							i_3611_++;
						}
						i_3604_ += i_3608_;
						i_3603_ = i_3648_;
						i_3611_ += i_3612_;
					}
				} else if (i_3598_ == 0) {
					int i_3656_ = i_3603_;
					if ((i_3599_ & 0xffffff) == 16777215) {
						for (int i_3657_ = -i_3597_; i_3657_ < 0; i_3657_++) {
							int i_3658_ = ((i_3604_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_3659_ = -i_3596_; i_3659_ < 0; i_3659_++) {
								if (!bool_3593_ || f < fs[i_3611_]) {
									if (bool) {
										int i_3660_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3603_ >> 16) + i_3658_]);
										int i_3661_ = ((i_3660_ >>> 24) * (i_3599_ >>> 24) >> 8);
										int i_3662_ = 256 - i_3661_;
										int i_3663_ = is[i_3611_];
										is[i_3611_] = ((((i_3660_ & 0xff00ff) * i_3661_ + ((i_3663_ & 0xff00ff) * i_3662_)) & ~0xff00ff) + (((i_3660_ & 0xff00) * i_3661_ + ((i_3663_ & 0xff00) * i_3662_)) & 0xff0000)) >> 8;
									}
									if (bool_3593_ && bool_3602_)
										fs[i_3611_] = f;
								}
								i_3603_ += i_3607_;
								i_3611_++;
							}
							i_3604_ += i_3608_;
							i_3603_ = i_3656_;
							i_3611_ += i_3612_;
						}
					} else {
						int i_3664_ = (i_3599_ & 0xff0000) >> 16;
						int i_3665_ = (i_3599_ & 0xff00) >> 8;
						int i_3666_ = i_3599_ & 0xff;
						for (int i_3667_ = -i_3597_; i_3667_ < 0; i_3667_++) {
							int i_3668_ = ((i_3604_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
							for (int i_3669_ = -i_3596_; i_3669_ < 0; i_3669_++) {
								if (!bool_3593_ || f < fs[i_3611_]) {
									int i_3670_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3603_ >> 16) + i_3668_]);
									int i_3671_ = ((i_3670_ >>> 24) * (i_3599_ >>> 24) >> 8);
									int i_3672_ = 256 - i_3671_;
									if (i_3671_ != 255) {
										if (bool) {
											int i_3673_ = (((i_3670_ & 0xff0000) * i_3664_) & ~0xffffff);
											int i_3674_ = ((i_3670_ & 0xff00) * i_3665_ & 0xff0000);
											int i_3675_ = ((i_3670_ & 0xff) * i_3666_ & 0xff00);
											i_3670_ = (i_3673_ | i_3674_ | i_3675_) >>> 8;
											int i_3676_ = is[i_3611_];
											is[i_3611_] = (((((i_3670_ & 0xff00ff) * i_3671_) + ((i_3676_ & 0xff00ff) * i_3672_)) & ~0xff00ff) + ((((i_3670_ & 0xff00) * i_3671_) + ((i_3676_ & 0xff00) * i_3672_)) & 0xff0000)) >> 8;
											if (bool_3594_) {
												int i_3677_ = ((i_3676_ >>> 24) + i_3671_);
												if (i_3677_ > 255)
													i_3677_ = 255;
												is[i_3611_] |= i_3677_ << 24;
											}
										}
										if (bool_3593_ && bool_3602_)
											fs[i_3611_] = f;
									} else {
										if (bool) {
											int i_3678_ = (((i_3670_ & 0xff0000) * i_3664_) & ~0xffffff);
											int i_3679_ = ((i_3670_ & 0xff00) * i_3665_ & 0xff0000);
											int i_3680_ = ((i_3670_ & 0xff) * i_3666_ & 0xff00);
											is[i_3611_] = (i_3678_ | i_3679_ | i_3680_) >>> 8;
										}
										if (bool_3593_ && bool_3602_)
											fs[i_3611_] = f;
									}
								}
								i_3603_ += i_3607_;
								i_3611_++;
							}
							i_3604_ += i_3608_;
							i_3603_ = i_3656_;
							i_3611_ += i_3612_;
						}
					}
				} else if (i_3598_ == 3) {
					int i_3681_ = i_3603_;
					for (int i_3682_ = -i_3597_; i_3682_ < 0; i_3682_++) {
						int i_3683_ = ((i_3604_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_3684_ = -i_3596_; i_3684_ < 0; i_3684_++) {
							if (!bool_3593_ || f < fs[i_3611_]) {
								if (bool) {
									int i_3685_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3603_ >> 16) + i_3683_]);
									int i_3686_ = i_3685_ + i_3599_;
									int i_3687_ = ((i_3685_ & 0xff00ff) + (i_3599_ & 0xff00ff));
									int i_3688_ = ((i_3687_ & 0x1000100) + (i_3686_ - i_3687_ & 0x10000));
									i_3688_ = (i_3686_ - i_3688_ | i_3688_ - (i_3688_ >>> 8));
									int i_3689_ = ((i_3688_ >>> 24) * (i_3599_ >>> 24) >> 8);
									int i_3690_ = 256 - i_3689_;
									if (i_3689_ != 255) {
										i_3685_ = i_3688_;
										i_3688_ = is[i_3611_];
										i_3688_ = ((((i_3685_ & 0xff00ff) * i_3689_ + ((i_3688_ & 0xff00ff) * i_3690_)) & ~0xff00ff) + (((i_3685_ & 0xff00) * i_3689_ + ((i_3688_ & 0xff00) * i_3690_)) & 0xff0000)) >> 8;
									}
									is[i_3611_] = i_3688_;
								}
								if (bool_3593_ && bool_3602_)
									fs[i_3611_] = f;
							}
							i_3603_ += i_3607_;
							i_3611_++;
						}
						i_3604_ += i_3608_;
						i_3603_ = i_3681_;
						i_3611_ += i_3612_;
					}
				} else if (i_3598_ == 2) {
					int i_3691_ = i_3599_ >>> 24;
					int i_3692_ = 256 - i_3691_;
					int i_3693_ = (i_3599_ & 0xff00ff) * i_3692_ & ~0xff00ff;
					int i_3694_ = (i_3599_ & 0xff00) * i_3692_ & 0xff0000;
					i_3599_ = (i_3693_ | i_3694_) >>> 8;
					int i_3695_ = i_3603_;
					for (int i_3696_ = -i_3597_; i_3696_ < 0; i_3696_++) {
						int i_3697_ = ((i_3604_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_3698_ = -i_3596_; i_3698_ < 0; i_3698_++) {
							if (!bool_3593_ || f < fs[i_3611_]) {
								if (bool) {
									int i_3699_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3603_ >> 16) + i_3697_]);
									int i_3700_ = i_3699_ >>> 24;
									int i_3701_ = 256 - i_3700_;
									i_3693_ = ((i_3699_ & 0xff00ff) * i_3691_ & ~0xff00ff);
									i_3694_ = ((i_3699_ & 0xff00) * i_3691_ & 0xff0000);
									i_3699_ = (((i_3693_ | i_3694_) >>> 8) + i_3599_);
									int i_3702_ = is[i_3611_];
									is[i_3611_] = ((((i_3699_ & 0xff00ff) * i_3700_ + (i_3702_ & 0xff00ff) * i_3701_) & ~0xff00ff) + (((i_3699_ & 0xff00) * i_3700_ + (i_3702_ & 0xff00) * i_3701_) & 0xff0000)) >> 8;
								}
								if (bool_3593_ && bool_3602_)
									fs[i_3611_] = f;
							}
							i_3603_ += i_3607_;
							i_3611_++;
						}
						i_3604_ += i_3608_;
						i_3603_ = i_3695_;
						i_3611_ += i_3612_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_3600_ == 2) {
				if (i_3598_ == 1) {
					int i_3703_ = i_3603_;
					for (int i_3704_ = -i_3597_; i_3704_ < 0; i_3704_++) {
						int i_3705_ = ((i_3604_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_3706_ = -i_3596_; i_3706_ < 0; i_3706_++) {
							if (!bool_3593_ || f < fs[i_3611_]) {
								int i_3707_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3603_ >> 16) + i_3705_]);
								if (i_3707_ != 0) {
									if (bool) {
										int i_3708_ = is[i_3611_];
										int i_3709_ = i_3707_ + i_3708_;
										int i_3710_ = ((i_3707_ & 0xff00ff) + (i_3708_ & 0xff00ff));
										i_3708_ = ((i_3710_ & 0x1000100) + (i_3709_ - i_3710_ & 0x10000));
										is[i_3611_] = (i_3709_ - i_3708_ | i_3708_ - (i_3708_ >>> 8));
									}
									if (bool_3593_ && bool_3602_)
										fs[i_3611_] = f;
								}
							}
							i_3603_ += i_3607_;
							i_3611_++;
						}
						i_3604_ += i_3608_;
						i_3603_ = i_3703_;
						i_3611_ += i_3612_;
					}
				} else if (i_3598_ == 0) {
					int i_3711_ = i_3603_;
					int i_3712_ = (i_3599_ & 0xff0000) >> 16;
					int i_3713_ = (i_3599_ & 0xff00) >> 8;
					int i_3714_ = i_3599_ & 0xff;
					for (int i_3715_ = -i_3597_; i_3715_ < 0; i_3715_++) {
						int i_3716_ = ((i_3604_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_3717_ = -i_3596_; i_3717_ < 0; i_3717_++) {
							if (!bool_3593_ || f < fs[i_3611_]) {
								int i_3718_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3603_ >> 16) + i_3716_]);
								if (i_3718_ != 0) {
									if (bool) {
										int i_3719_ = ((i_3718_ & 0xff0000) * i_3712_ & ~0xffffff);
										int i_3720_ = ((i_3718_ & 0xff00) * i_3713_ & 0xff0000);
										int i_3721_ = ((i_3718_ & 0xff) * i_3714_ & 0xff00);
										i_3718_ = (i_3719_ | i_3720_ | i_3721_) >>> 8;
										int i_3722_ = is[i_3611_];
										int i_3723_ = i_3718_ + i_3722_;
										int i_3724_ = ((i_3718_ & 0xff00ff) + (i_3722_ & 0xff00ff));
										i_3722_ = ((i_3724_ & 0x1000100) + (i_3723_ - i_3724_ & 0x10000));
										is[i_3611_] = (i_3723_ - i_3722_ | i_3722_ - (i_3722_ >>> 8));
									}
									if (bool_3593_ && bool_3602_)
										fs[i_3611_] = f;
								}
							}
							i_3603_ += i_3607_;
							i_3611_++;
						}
						i_3604_ += i_3608_;
						i_3603_ = i_3711_;
						i_3611_ += i_3612_;
					}
				} else if (i_3598_ == 3) {
					int i_3725_ = i_3603_;
					for (int i_3726_ = -i_3597_; i_3726_ < 0; i_3726_++) {
						int i_3727_ = ((i_3604_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_3728_ = -i_3596_; i_3728_ < 0; i_3728_++) {
							if (!bool_3593_ || f < fs[i_3611_]) {
								if (bool) {
									int i_3729_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3603_ >> 16) + i_3727_]);
									int i_3730_ = i_3729_ + i_3599_;
									int i_3731_ = ((i_3729_ & 0xff00ff) + (i_3599_ & 0xff00ff));
									int i_3732_ = ((i_3731_ & 0x1000100) + (i_3730_ - i_3731_ & 0x10000));
									i_3729_ = (i_3730_ - i_3732_ | i_3732_ - (i_3732_ >>> 8));
									i_3732_ = is[i_3611_];
									i_3730_ = i_3729_ + i_3732_;
									i_3731_ = (i_3729_ & 0xff00ff) + (i_3732_ & 0xff00ff);
									i_3732_ = ((i_3731_ & 0x1000100) + (i_3730_ - i_3731_ & 0x10000));
									is[i_3611_] = (i_3730_ - i_3732_ | i_3732_ - (i_3732_ >>> 8));
								}
								if (bool_3593_ && bool_3602_)
									fs[i_3611_] = f;
							}
							i_3603_ += i_3607_;
							i_3611_++;
						}
						i_3604_ += i_3608_;
						i_3603_ = i_3725_;
						i_3611_ += i_3612_;
					}
				} else if (i_3598_ == 2) {
					int i_3733_ = i_3599_ >>> 24;
					int i_3734_ = 256 - i_3733_;
					int i_3735_ = (i_3599_ & 0xff00ff) * i_3734_ & ~0xff00ff;
					int i_3736_ = (i_3599_ & 0xff00) * i_3734_ & 0xff0000;
					i_3599_ = (i_3735_ | i_3736_) >>> 8;
					int i_3737_ = i_3603_;
					for (int i_3738_ = -i_3597_; i_3738_ < 0; i_3738_++) {
						int i_3739_ = ((i_3604_ >> 16) * ((Class57_Sub1_Sub1) this).anInt9010);
						for (int i_3740_ = -i_3596_; i_3740_ < 0; i_3740_++) {
							if (!bool_3593_ || f < fs[i_3611_]) {
								int i_3741_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(i_3603_ >> 16) + i_3739_]);
								if (i_3741_ != 0) {
									if (bool) {
										i_3735_ = ((i_3741_ & 0xff00ff) * i_3733_ & ~0xff00ff);
										i_3736_ = ((i_3741_ & 0xff00) * i_3733_ & 0xff0000);
										i_3741_ = (((i_3735_ | i_3736_) >>> 8) + i_3599_);
										int i_3742_ = is[i_3611_];
										int i_3743_ = i_3741_ + i_3742_;
										int i_3744_ = ((i_3741_ & 0xff00ff) + (i_3742_ & 0xff00ff));
										i_3742_ = ((i_3744_ & 0x1000100) + (i_3743_ - i_3744_ & 0x10000));
										is[i_3611_] = (i_3743_ - i_3742_ | i_3742_ - (i_3742_ >>> 8));
									}
									if (bool_3593_ && bool_3602_)
										fs[i_3611_] = f;
								}
							}
							i_3603_ += i_3607_;
							i_3611_++;
						}
						i_3604_ += i_3608_;
						i_3603_ = i_3737_;
						i_3611_ += i_3612_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method685(int[] is, int[] is_3745_, int i, int i_3746_) {
		int[] is_3747_ = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is_3747_ != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_3748_ = anInt9001;
					while (i_3748_ < 0) {
						int i_3749_ = i_3748_ + i_3746_;
						if (i_3749_ >= 0) {
							if (i_3749_ >= is.length)
								break;
							int i_3750_ = anInt9003;
							int i_3751_ = anInt8988;
							int i_3752_ = anInt9011;
							int i_3753_ = anInt8999;
							if (i_3751_ >= 0 && i_3752_ >= 0 && (i_3751_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) < 0 && (i_3752_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) < 0) {
								int i_3754_ = is[i_3749_] - i;
								int i_3755_ = -is_3745_[i_3749_];
								int i_3756_ = i_3754_ - (i_3750_ - anInt9003);
								if (i_3756_ > 0) {
									i_3750_ += i_3756_;
									i_3753_ += i_3756_;
									i_3751_ += anInt9004 * i_3756_;
									i_3752_ += anInt8991 * i_3756_;
								} else
									i_3755_ -= i_3756_;
								if (i_3753_ < i_3755_)
									i_3753_ = i_3755_;
								for (/**/; i_3753_ < 0; i_3753_++) {
									int i_3757_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_3752_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_3751_ >> 12))]);
									int i_3758_ = i_3757_ >>> 24;
									int i_3759_ = 256 - i_3758_;
									int i_3760_ = is_3747_[i_3750_];
									is_3747_[i_3750_++] = ((((i_3757_ & 0xff00ff) * i_3758_ + (i_3760_ & 0xff00ff) * i_3759_) & ~0xff00ff) + (((i_3757_ & 0xff00) * i_3758_ + (i_3760_ & 0xff00) * i_3759_) & 0xff0000)) >> 8;
								}
							}
						}
						i_3748_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_3761_ = anInt9001;
					while (i_3761_ < 0) {
						int i_3762_ = i_3761_ + i_3746_;
						if (i_3762_ >= 0) {
							if (i_3762_ >= is.length)
								break;
							int i_3763_ = anInt9003;
							int i_3764_ = anInt8988;
							int i_3765_ = anInt9011 + anInt9013;
							int i_3766_ = anInt8999;
							if (i_3764_ >= 0 && (i_3764_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) < 0) {
								int i_3767_;
								if ((i_3767_ = (i_3765_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12))) >= 0) {
									i_3767_ = (anInt8991 - i_3767_) / anInt8991;
									i_3766_ += i_3767_;
									i_3765_ += anInt8991 * i_3767_;
									i_3763_ += i_3767_;
								}
								if ((i_3767_ = (i_3765_ - anInt8991) / anInt8991) > i_3766_)
									i_3766_ = i_3767_;
								int i_3768_ = is[i_3762_] - i;
								int i_3769_ = -is_3745_[i_3762_];
								int i_3770_ = i_3768_ - (i_3763_ - anInt9003);
								if (i_3770_ > 0) {
									i_3763_ += i_3770_;
									i_3766_ += i_3770_;
									i_3764_ += anInt9004 * i_3770_;
									i_3765_ += anInt8991 * i_3770_;
								} else
									i_3769_ -= i_3770_;
								if (i_3766_ < i_3769_)
									i_3766_ = i_3769_;
								for (/**/; i_3766_ < 0; i_3766_++) {
									int i_3771_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_3765_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_3764_ >> 12))]);
									int i_3772_ = i_3771_ >>> 24;
									int i_3773_ = 256 - i_3772_;
									int i_3774_ = is_3747_[i_3763_];
									is_3747_[i_3763_++] = ((((i_3771_ & 0xff00ff) * i_3772_ + (i_3774_ & 0xff00ff) * i_3773_) & ~0xff00ff) + (((i_3771_ & 0xff00) * i_3772_ + (i_3774_ & 0xff00) * i_3773_) & 0xff0000)) >> 8;
									i_3765_ += anInt8991;
								}
							}
						}
						i_3761_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_3775_ = anInt9001;
					while (i_3775_ < 0) {
						int i_3776_ = i_3775_ + i_3746_;
						if (i_3776_ >= 0) {
							if (i_3776_ >= is.length)
								break;
							int i_3777_ = anInt9003;
							int i_3778_ = anInt8988;
							int i_3779_ = anInt9011 + anInt9013;
							int i_3780_ = anInt8999;
							if (i_3778_ >= 0 && (i_3778_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12)) < 0) {
								if (i_3779_ < 0) {
									int i_3781_ = ((anInt8991 - 1 - i_3779_) / anInt8991);
									i_3780_ += i_3781_;
									i_3779_ += anInt8991 * i_3781_;
									i_3777_ += i_3781_;
								}
								int i_3782_;
								if ((i_3782_ = (1 + i_3779_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3780_)
									i_3780_ = i_3782_;
								int i_3783_ = is[i_3776_] - i;
								int i_3784_ = -is_3745_[i_3776_];
								int i_3785_ = i_3783_ - (i_3777_ - anInt9003);
								if (i_3785_ > 0) {
									i_3777_ += i_3785_;
									i_3780_ += i_3785_;
									i_3778_ += anInt9004 * i_3785_;
									i_3779_ += anInt8991 * i_3785_;
								} else
									i_3784_ -= i_3785_;
								if (i_3780_ < i_3784_)
									i_3780_ = i_3784_;
								for (/**/; i_3780_ < 0; i_3780_++) {
									int i_3786_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_3779_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_3778_ >> 12))]);
									int i_3787_ = i_3786_ >>> 24;
									int i_3788_ = 256 - i_3787_;
									int i_3789_ = is_3747_[i_3777_];
									is_3747_[i_3777_++] = ((((i_3786_ & 0xff00ff) * i_3787_ + (i_3789_ & 0xff00ff) * i_3788_) & ~0xff00ff) + (((i_3786_ & 0xff00) * i_3787_ + (i_3789_ & 0xff00) * i_3788_) & 0xff0000)) >> 8;
									i_3779_ += anInt8991;
								}
							}
						}
						i_3775_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_3790_ = anInt9001;
					while (i_3790_ < 0) {
						int i_3791_ = i_3790_ + i_3746_;
						if (i_3791_ >= 0) {
							if (i_3791_ >= is.length)
								break;
							int i_3792_ = anInt9003;
							int i_3793_ = anInt8988 + anInt9012;
							int i_3794_ = anInt9011;
							int i_3795_ = anInt8999;
							if (i_3794_ >= 0 && (i_3794_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) < 0) {
								int i_3796_;
								if ((i_3796_ = (i_3793_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12))) >= 0) {
									i_3796_ = (anInt9004 - i_3796_) / anInt9004;
									i_3795_ += i_3796_;
									i_3793_ += anInt9004 * i_3796_;
									i_3792_ += i_3796_;
								}
								if ((i_3796_ = (i_3793_ - anInt9004) / anInt9004) > i_3795_)
									i_3795_ = i_3796_;
								int i_3797_ = is[i_3791_] - i;
								int i_3798_ = -is_3745_[i_3791_];
								int i_3799_ = i_3797_ - (i_3792_ - anInt9003);
								if (i_3799_ > 0) {
									i_3792_ += i_3799_;
									i_3795_ += i_3799_;
									i_3793_ += anInt9004 * i_3799_;
									i_3794_ += anInt8991 * i_3799_;
								} else
									i_3798_ -= i_3799_;
								if (i_3795_ < i_3798_)
									i_3795_ = i_3798_;
								for (/**/; i_3795_ < 0; i_3795_++) {
									int i_3800_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_3794_ >> 12) * (((Class57_Sub1_Sub1) this).anInt9010)) + (i_3793_ >> 12))]);
									int i_3801_ = i_3800_ >>> 24;
									int i_3802_ = 256 - i_3801_;
									int i_3803_ = is_3747_[i_3792_];
									is_3747_[i_3792_++] = ((((i_3800_ & 0xff00ff) * i_3801_ + (i_3803_ & 0xff00ff) * i_3802_) & ~0xff00ff) + (((i_3800_ & 0xff00) * i_3801_ + (i_3803_ & 0xff00) * i_3802_) & 0xff0000)) >> 8;
									i_3793_ += anInt9004;
								}
							}
						}
						i_3790_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_3804_ = anInt9001;
					while (i_3804_ < 0) {
						int i_3805_ = i_3804_ + i_3746_;
						if (i_3805_ >= 0) {
							if (i_3805_ >= is.length)
								break;
							int i_3806_ = anInt9003;
							int i_3807_ = anInt8988 + anInt9012;
							int i_3808_ = anInt9011 + anInt9013;
							int i_3809_ = anInt8999;
							int i_3810_;
							if ((i_3810_ = (i_3807_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12))) >= 0) {
								i_3810_ = (anInt9004 - i_3810_) / anInt9004;
								i_3809_ += i_3810_;
								i_3807_ += anInt9004 * i_3810_;
								i_3808_ += anInt8991 * i_3810_;
								i_3806_ += i_3810_;
							}
							if ((i_3810_ = (i_3807_ - anInt9004) / anInt9004) > i_3809_)
								i_3809_ = i_3810_;
							if ((i_3810_ = (i_3808_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12))) >= 0) {
								i_3810_ = (anInt8991 - i_3810_) / anInt8991;
								i_3809_ += i_3810_;
								i_3807_ += anInt9004 * i_3810_;
								i_3808_ += anInt8991 * i_3810_;
								i_3806_ += i_3810_;
							}
							if ((i_3810_ = (i_3808_ - anInt8991) / anInt8991) > i_3809_)
								i_3809_ = i_3810_;
							int i_3811_ = is[i_3805_] - i;
							int i_3812_ = -is_3745_[i_3805_];
							int i_3813_ = i_3811_ - (i_3806_ - anInt9003);
							if (i_3813_ > 0) {
								i_3806_ += i_3813_;
								i_3809_ += i_3813_;
								i_3807_ += anInt9004 * i_3813_;
								i_3808_ += anInt8991 * i_3813_;
							} else
								i_3812_ -= i_3813_;
							if (i_3809_ < i_3812_)
								i_3809_ = i_3812_;
							for (/**/; i_3809_ < 0; i_3809_++) {
								int i_3814_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_3808_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010 + (i_3807_ >> 12))]);
								int i_3815_ = i_3814_ >>> 24;
								int i_3816_ = 256 - i_3815_;
								int i_3817_ = is_3747_[i_3806_];
								is_3747_[i_3806_++] = ((((i_3814_ & 0xff00ff) * i_3815_ + (i_3817_ & 0xff00ff) * i_3816_) & ~0xff00ff) + (((i_3814_ & 0xff00) * i_3815_ + (i_3817_ & 0xff00) * i_3816_) & 0xff0000)) >> 8;
								i_3807_ += anInt9004;
								i_3808_ += anInt8991;
							}
						}
						i_3804_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_3818_ = anInt9001;
					while (i_3818_ < 0) {
						int i_3819_ = i_3818_ + i_3746_;
						if (i_3819_ >= 0) {
							if (i_3819_ >= is.length)
								break;
							int i_3820_ = anInt9003;
							int i_3821_ = anInt8988 + anInt9012;
							int i_3822_ = anInt9011 + anInt9013;
							int i_3823_ = anInt8999;
							int i_3824_;
							if ((i_3824_ = (i_3821_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12))) >= 0) {
								i_3824_ = (anInt9004 - i_3824_) / anInt9004;
								i_3823_ += i_3824_;
								i_3821_ += anInt9004 * i_3824_;
								i_3822_ += anInt8991 * i_3824_;
								i_3820_ += i_3824_;
							}
							if ((i_3824_ = (i_3821_ - anInt9004) / anInt9004) > i_3823_)
								i_3823_ = i_3824_;
							if (i_3822_ < 0) {
								i_3824_ = (anInt8991 - 1 - i_3822_) / anInt8991;
								i_3823_ += i_3824_;
								i_3821_ += anInt9004 * i_3824_;
								i_3822_ += anInt8991 * i_3824_;
								i_3820_ += i_3824_;
							}
							if ((i_3824_ = (1 + i_3822_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3823_)
								i_3823_ = i_3824_;
							int i_3825_ = is[i_3819_] - i;
							int i_3826_ = -is_3745_[i_3819_];
							int i_3827_ = i_3825_ - (i_3820_ - anInt9003);
							if (i_3827_ > 0) {
								i_3820_ += i_3827_;
								i_3823_ += i_3827_;
								i_3821_ += anInt9004 * i_3827_;
								i_3822_ += anInt8991 * i_3827_;
							} else
								i_3826_ -= i_3827_;
							if (i_3823_ < i_3826_)
								i_3823_ = i_3826_;
							for (/**/; i_3823_ < 0; i_3823_++) {
								int i_3828_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_3822_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010 + (i_3821_ >> 12))]);
								int i_3829_ = i_3828_ >>> 24;
								int i_3830_ = 256 - i_3829_;
								int i_3831_ = is_3747_[i_3820_];
								is_3747_[i_3820_++] = ((((i_3828_ & 0xff00ff) * i_3829_ + (i_3831_ & 0xff00ff) * i_3830_) & ~0xff00ff) + (((i_3828_ & 0xff00) * i_3829_ + (i_3831_ & 0xff00) * i_3830_) & 0xff0000)) >> 8;
								i_3821_ += anInt9004;
								i_3822_ += anInt8991;
							}
						}
						i_3818_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_3832_ = anInt9001;
				while (i_3832_ < 0) {
					int i_3833_ = i_3832_ + i_3746_;
					if (i_3833_ >= 0) {
						if (i_3833_ >= is.length)
							break;
						int i_3834_ = anInt9003;
						int i_3835_ = anInt8988 + anInt9012;
						int i_3836_ = anInt9011;
						int i_3837_ = anInt8999;
						if (i_3836_ >= 0 && i_3836_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) < 0) {
							if (i_3835_ < 0) {
								int i_3838_ = (anInt9004 - 1 - i_3835_) / anInt9004;
								i_3837_ += i_3838_;
								i_3835_ += anInt9004 * i_3838_;
								i_3834_ += i_3838_;
							}
							int i_3839_;
							if ((i_3839_ = (1 + i_3835_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3837_)
								i_3837_ = i_3839_;
							int i_3840_ = is[i_3833_] - i;
							int i_3841_ = -is_3745_[i_3833_];
							int i_3842_ = i_3840_ - (i_3834_ - anInt9003);
							if (i_3842_ > 0) {
								i_3834_ += i_3842_;
								i_3837_ += i_3842_;
								i_3835_ += anInt9004 * i_3842_;
								i_3836_ += anInt8991 * i_3842_;
							} else
								i_3841_ -= i_3842_;
							if (i_3837_ < i_3841_)
								i_3837_ = i_3841_;
							for (/**/; i_3837_ < 0; i_3837_++) {
								int i_3843_ = (((Class57_Sub1_Sub1) this).anIntArray9965[((i_3836_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010 + (i_3835_ >> 12))]);
								int i_3844_ = i_3843_ >>> 24;
								int i_3845_ = 256 - i_3844_;
								int i_3846_ = is_3747_[i_3834_];
								is_3747_[i_3834_++] = ((((i_3843_ & 0xff00ff) * i_3844_ + (i_3846_ & 0xff00ff) * i_3845_) & ~0xff00ff) + (((i_3843_ & 0xff00) * i_3844_ + (i_3846_ & 0xff00) * i_3845_) & 0xff0000)) >> 8;
								i_3835_ += anInt9004;
							}
						}
					}
					i_3832_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				int i_3847_ = anInt9001;
				while (i_3847_ < 0) {
					int i_3848_ = i_3847_ + i_3746_;
					if (i_3848_ >= 0) {
						if (i_3848_ >= is.length)
							break;
						int i_3849_ = anInt9003;
						int i_3850_ = anInt8988 + anInt9012;
						int i_3851_ = anInt9011 + anInt9013;
						int i_3852_ = anInt8999;
						if (i_3850_ < 0) {
							int i_3853_ = (anInt9004 - 1 - i_3850_) / anInt9004;
							i_3852_ += i_3853_;
							i_3850_ += anInt9004 * i_3853_;
							i_3851_ += anInt8991 * i_3853_;
							i_3849_ += i_3853_;
						}
						int i_3854_;
						if ((i_3854_ = (1 + i_3850_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3852_)
							i_3852_ = i_3854_;
						if ((i_3854_ = i_3851_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12)) >= 0) {
							i_3854_ = (anInt8991 - i_3854_) / anInt8991;
							i_3852_ += i_3854_;
							i_3850_ += anInt9004 * i_3854_;
							i_3851_ += anInt8991 * i_3854_;
							i_3849_ += i_3854_;
						}
						if ((i_3854_ = (i_3851_ - anInt8991) / anInt8991) > i_3852_)
							i_3852_ = i_3854_;
						int i_3855_ = is[i_3848_] - i;
						int i_3856_ = -is_3745_[i_3848_];
						int i_3857_ = i_3855_ - (i_3849_ - anInt9003);
						if (i_3857_ > 0) {
							i_3849_ += i_3857_;
							i_3852_ += i_3857_;
							i_3850_ += anInt9004 * i_3857_;
							i_3851_ += anInt8991 * i_3857_;
						} else
							i_3856_ -= i_3857_;
						if (i_3852_ < i_3856_)
							i_3852_ = i_3856_;
						for (/**/; i_3852_ < 0; i_3852_++) {
							int i_3858_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_3851_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_3850_ >> 12))]);
							int i_3859_ = i_3858_ >>> 24;
							int i_3860_ = 256 - i_3859_;
							int i_3861_ = is_3747_[i_3849_];
							is_3747_[i_3849_++] = ((((i_3858_ & 0xff00ff) * i_3859_ + (i_3861_ & 0xff00ff) * i_3860_) & ~0xff00ff) + (((i_3858_ & 0xff00) * i_3859_ + (i_3861_ & 0xff00) * i_3860_) & 0xff0000)) >> 8;
							i_3850_ += anInt9004;
							i_3851_ += anInt8991;
						}
					}
					i_3847_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				int i_3862_ = anInt9001;
				while (i_3862_ < 0) {
					int i_3863_ = i_3862_ + i_3746_;
					if (i_3863_ >= 0) {
						if (i_3863_ >= is.length)
							break;
						int i_3864_ = anInt9003;
						int i_3865_ = anInt8988 + anInt9012;
						int i_3866_ = anInt9011 + anInt9013;
						int i_3867_ = anInt8999;
						if (i_3865_ < 0) {
							int i_3868_ = (anInt9004 - 1 - i_3865_) / anInt9004;
							i_3867_ += i_3868_;
							i_3865_ += anInt9004 * i_3868_;
							i_3866_ += anInt8991 * i_3868_;
							i_3864_ += i_3868_;
						}
						int i_3869_;
						if ((i_3869_ = (1 + i_3865_ - (((Class57_Sub1_Sub1) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3867_)
							i_3867_ = i_3869_;
						if (i_3866_ < 0) {
							i_3869_ = (anInt8991 - 1 - i_3866_) / anInt8991;
							i_3867_ += i_3869_;
							i_3865_ += anInt9004 * i_3869_;
							i_3866_ += anInt8991 * i_3869_;
							i_3864_ += i_3869_;
						}
						if ((i_3869_ = (1 + i_3866_ - (((Class57_Sub1_Sub1) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3867_)
							i_3867_ = i_3869_;
						int i_3870_ = is[i_3863_] - i;
						int i_3871_ = -is_3745_[i_3863_];
						int i_3872_ = i_3870_ - (i_3864_ - anInt9003);
						if (i_3872_ > 0) {
							i_3864_ += i_3872_;
							i_3867_ += i_3872_;
							i_3865_ += anInt9004 * i_3872_;
							i_3866_ += anInt8991 * i_3872_;
						} else
							i_3871_ -= i_3872_;
						if (i_3867_ < i_3871_)
							i_3867_ = i_3871_;
						for (/**/; i_3867_ < 0; i_3867_++) {
							int i_3873_ = (((Class57_Sub1_Sub1) this).anIntArray9965[(((i_3866_ >> 12) * ((Class57_Sub1_Sub1) this).anInt9010) + (i_3865_ >> 12))]);
							int i_3874_ = i_3873_ >>> 24;
							int i_3875_ = 256 - i_3874_;
							int i_3876_ = is_3747_[i_3864_];
							is_3747_[i_3864_++] = ((((i_3873_ & 0xff00ff) * i_3874_ + (i_3876_ & 0xff00ff) * i_3875_) & ~0xff00ff) + (((i_3873_ & 0xff00) * i_3874_ + (i_3876_ & 0xff00) * i_3875_) & 0xff0000)) >> 8;
							i_3865_ += anInt9004;
							i_3866_ += anInt8991;
						}
					}
					i_3862_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	public void method665(int i, int i_3877_, int i_3878_, int i_3879_, int i_3880_, int i_3881_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_3882_ = 0; i_3882_ < i_3879_; i_3882_++) {
			int i_3883_ = (i_3877_ + i_3882_) * i_3878_ + i;
			int i_3884_ = (i_3881_ + i_3882_) * i_3878_ + i_3880_;
			for (int i_3885_ = 0; i_3885_ < i_3878_; i_3885_++)
				((Class57_Sub1_Sub1) this).anIntArray9965[i_3883_ + i_3885_] = is[i_3884_ + i_3885_] & 0xffffff;
		}
	}

	public void method624(int i, int i_3886_, int i_3887_, int i_3888_, int i_3889_, int i_3890_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub1) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_3891_ = 0; i_3891_ < i_3888_; i_3891_++) {
			int i_3892_ = (i_3886_ + i_3891_) * i_3887_ + i;
			int i_3893_ = (i_3890_ + i_3891_) * i_3887_ + i_3889_;
			for (int i_3894_ = 0; i_3894_ < i_3887_; i_3894_++)
				((Class57_Sub1_Sub1) this).anIntArray9965[i_3892_ + i_3894_] = is[i_3893_ + i_3894_] & 0xffffff;
		}
	}
}
