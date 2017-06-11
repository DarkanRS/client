/* Class57_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class57_Sub1_Sub3 extends Class57_Sub1 {
	byte[] aByteArray9967;
	int[] anIntArray9968;

	void method687(int i, int i_0_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_1_ = anInt9001;
					while (i_1_ < 0) {
						int i_2_ = anInt9003;
						int i_3_ = anInt8988;
						int i_4_ = anInt9011;
						int i_5_ = anInt8999;
						if (i_3_ >= 0 && i_4_ >= 0 && i_3_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) < 0 && i_4_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) < 0) {
							for (/**/; i_5_ < 0; i_5_++) {
								int i_6_ = (((i_4_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_3_ >> 12));
								int i_7_ = i_2_++;
								if (i_0_ == 0) {
									if (i == 1)
										is[i_7_] = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_6_]) & 0xff)]);
									else if (i == 0) {
										int i_8_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_6_]) & 0xff)]);
										int i_9_ = ((i_8_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_10_ = ((i_8_ & 0xff00) * anInt9018 & 0xff0000);
										int i_11_ = ((i_8_ & 0xff) * anInt9019 & 0xff00);
										is[i_7_] = (i_9_ | i_10_ | i_11_) >>> 8;
									} else if (i == 3) {
										int i_12_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_6_]) & 0xff)]);
										int i_13_ = anInt9014;
										int i_14_ = i_12_ + i_13_;
										int i_15_ = ((i_12_ & 0xff00ff) + (i_13_ & 0xff00ff));
										int i_16_ = ((i_15_ & 0x1000100) + (i_14_ - i_15_ & 0x10000));
										is[i_7_] = i_14_ - i_16_ | i_16_ - (i_16_ >>> 8);
									} else if (i == 2) {
										int i_17_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_6_]) & 0xff)]);
										int i_18_ = ((i_17_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_19_ = ((i_17_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_7_] = (((i_18_ | i_19_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_0_ == 1) {
									if (i == 1) {
										int i_20_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_6_]);
										if (i_20_ != 0)
											is[i_7_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_20_ & 0xff]);
									} else if (i == 0) {
										int i_21_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_6_]);
										if (i_21_ != 0) {
											int i_22_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_21_ & 0xff]);
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_23_ = anInt9014 >>> 24;
												int i_24_ = 256 - i_23_;
												int i_25_ = is[i_7_];
												is[i_7_] = (((((i_22_ & 0xff00ff) * i_23_) + ((i_25_ & 0xff00ff) * i_24_)) & ~0xff00ff) + ((((i_22_ & 0xff00) * i_23_) + ((i_25_ & 0xff00) * i_24_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_26_ = (((i_22_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_27_ = (((i_22_ & 0xff00) * anInt9018) & 0xff0000);
												int i_28_ = (((i_22_ & 0xff) * anInt9019) & 0xff00);
												i_22_ = (i_26_ | i_27_ | i_28_) >>> 8;
												int i_29_ = is[i_7_];
												is[i_7_] = (((((i_22_ & 0xff00ff) * anInt9015) + ((i_29_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_22_ & 0xff00) * anInt9015) + ((i_29_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_30_ = (((i_22_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_31_ = (((i_22_ & 0xff00) * anInt9018) & 0xff0000);
												int i_32_ = (((i_22_ & 0xff) * anInt9019) & 0xff00);
												is[i_7_] = (i_30_ | i_31_ | i_32_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_33_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_6_]);
										int i_34_ = (i_33_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_33_]) : 0);
										int i_35_ = anInt9014;
										int i_36_ = i_34_ + i_35_;
										int i_37_ = ((i_34_ & 0xff00ff) + (i_35_ & 0xff00ff));
										int i_38_ = ((i_37_ & 0x1000100) + (i_36_ - i_37_ & 0x10000));
										i_38_ = i_36_ - i_38_ | i_38_ - (i_38_ >>> 8);
										if (i_34_ == 0 && anInt9015 != 255) {
											i_34_ = i_38_;
											i_38_ = is[i_7_];
											i_38_ = (((((i_34_ & 0xff00ff) * anInt9015) + ((i_38_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_34_ & 0xff00) * anInt9015) + ((i_38_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_7_] = i_38_;
									} else if (i == 2) {
										int i_39_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_6_]);
										if (i_39_ != 0) {
											int i_40_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_39_ & 0xff]);
											int i_41_ = (((i_40_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_42_ = ((i_40_ & 0xff00) * anInt9015 & 0xff0000);
											is[i_7_++] = ((i_41_ | i_42_) >>> 8) + anInt9022;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_0_ == 2) {
									if (i == 1) {
										int i_43_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_6_]);
										if (i_43_ != 0) {
											int i_44_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_43_ & 0xff]);
											int i_45_ = is[i_7_];
											int i_46_ = i_44_ + i_45_;
											int i_47_ = ((i_44_ & 0xff00ff) + (i_45_ & 0xff00ff));
											i_45_ = ((i_47_ & 0x1000100) + (i_46_ - i_47_ & 0x10000));
											is[i_7_] = (i_46_ - i_45_ | i_45_ - (i_45_ >>> 8));
										}
									} else if (i == 0) {
										int i_48_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_6_]);
										if (i_48_ != 0) {
											int i_49_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_48_ & 0xff]);
											int i_50_ = (((i_49_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_51_ = ((i_49_ & 0xff00) * anInt9018 & 0xff0000);
											int i_52_ = ((i_49_ & 0xff) * anInt9019 & 0xff00);
											i_49_ = ((i_50_ | i_51_ | i_52_) >>> 8);
											int i_53_ = is[i_7_];
											int i_54_ = i_49_ + i_53_;
											int i_55_ = ((i_49_ & 0xff00ff) + (i_53_ & 0xff00ff));
											i_53_ = ((i_55_ & 0x1000100) + (i_54_ - i_55_ & 0x10000));
											is[i_7_] = (i_54_ - i_53_ | i_53_ - (i_53_ >>> 8));
										}
									} else if (i == 3) {
										byte i_56_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_6_]);
										int i_57_ = (i_56_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_56_]) : 0);
										int i_58_ = anInt9014;
										int i_59_ = i_57_ + i_58_;
										int i_60_ = ((i_57_ & 0xff00ff) + (i_58_ & 0xff00ff));
										int i_61_ = ((i_60_ & 0x1000100) + (i_59_ - i_60_ & 0x10000));
										i_61_ = i_59_ - i_61_ | i_61_ - (i_61_ >>> 8);
										if (i_57_ == 0 && anInt9015 != 255) {
											i_57_ = i_61_;
											i_61_ = is[i_7_];
											i_61_ = (((((i_57_ & 0xff00ff) * anInt9015) + ((i_61_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_57_ & 0xff00) * anInt9015) + ((i_61_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_7_] = i_61_;
									} else if (i == 2) {
										int i_62_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_6_]);
										if (i_62_ != 0) {
											int i_63_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_62_ & 0xff]);
											int i_64_ = (((i_63_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_65_ = ((i_63_ & 0xff00) * anInt9015 & 0xff0000);
											i_63_ = (((i_64_ | i_65_) >>> 8) + anInt9022);
											int i_66_ = is[i_7_];
											int i_67_ = i_63_ + i_66_;
											int i_68_ = ((i_63_ & 0xff00ff) + (i_66_ & 0xff00ff));
											i_66_ = ((i_68_ & 0x1000100) + (i_67_ - i_68_ & 0x10000));
											is[i_7_] = (i_67_ - i_66_ | i_66_ - (i_66_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_1_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_69_ = anInt9001;
					while (i_69_ < 0) {
						int i_70_ = anInt9003;
						int i_71_ = anInt8988;
						int i_72_ = anInt9011 + anInt9013;
						int i_73_ = anInt8999;
						if (i_71_ >= 0 && i_71_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) < 0) {
							int i_74_;
							if ((i_74_ = i_72_ - ((((Class57_Sub1_Sub3) this).anInt8989) << 12)) >= 0) {
								i_74_ = (anInt8991 - i_74_) / anInt8991;
								i_73_ += i_74_;
								i_72_ += anInt8991 * i_74_;
								i_70_ += i_74_;
							}
							if ((i_74_ = (i_72_ - anInt8991) / anInt8991) > i_73_)
								i_73_ = i_74_;
							for (/**/; i_73_ < 0; i_73_++) {
								int i_75_ = (((i_72_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_71_ >> 12));
								int i_76_ = i_70_++;
								if (i_0_ == 0) {
									if (i == 1)
										is[i_76_] = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_75_]) & 0xff)]);
									else if (i == 0) {
										int i_77_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_75_]) & 0xff)]);
										int i_78_ = ((i_77_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_79_ = ((i_77_ & 0xff00) * anInt9018 & 0xff0000);
										int i_80_ = ((i_77_ & 0xff) * anInt9019 & 0xff00);
										is[i_76_] = (i_78_ | i_79_ | i_80_) >>> 8;
									} else if (i == 3) {
										int i_81_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_75_]) & 0xff)]);
										int i_82_ = anInt9014;
										int i_83_ = i_81_ + i_82_;
										int i_84_ = ((i_81_ & 0xff00ff) + (i_82_ & 0xff00ff));
										int i_85_ = ((i_84_ & 0x1000100) + (i_83_ - i_84_ & 0x10000));
										is[i_76_] = i_83_ - i_85_ | i_85_ - (i_85_ >>> 8);
									} else if (i == 2) {
										int i_86_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_75_]) & 0xff)]);
										int i_87_ = ((i_86_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_88_ = ((i_86_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_76_] = (((i_87_ | i_88_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_0_ == 1) {
									if (i == 1) {
										int i_89_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_75_]);
										if (i_89_ != 0)
											is[i_76_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_89_ & 0xff]);
									} else if (i == 0) {
										int i_90_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_75_]);
										if (i_90_ != 0) {
											int i_91_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_90_ & 0xff]);
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_92_ = anInt9014 >>> 24;
												int i_93_ = 256 - i_92_;
												int i_94_ = is[i_76_];
												is[i_76_] = (((((i_91_ & 0xff00ff) * i_92_) + ((i_94_ & 0xff00ff) * i_93_)) & ~0xff00ff) + ((((i_91_ & 0xff00) * i_92_) + ((i_94_ & 0xff00) * i_93_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_95_ = (((i_91_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_96_ = (((i_91_ & 0xff00) * anInt9018) & 0xff0000);
												int i_97_ = (((i_91_ & 0xff) * anInt9019) & 0xff00);
												i_91_ = (i_95_ | i_96_ | i_97_) >>> 8;
												int i_98_ = is[i_76_];
												is[i_76_] = (((((i_91_ & 0xff00ff) * anInt9015) + ((i_98_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_91_ & 0xff00) * anInt9015) + ((i_98_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_99_ = (((i_91_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_100_ = (((i_91_ & 0xff00) * anInt9018) & 0xff0000);
												int i_101_ = (((i_91_ & 0xff) * anInt9019) & 0xff00);
												is[i_76_] = (i_99_ | i_100_ | i_101_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_102_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_75_]);
										int i_103_ = (i_102_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_102_]) : 0);
										int i_104_ = anInt9014;
										int i_105_ = i_103_ + i_104_;
										int i_106_ = ((i_103_ & 0xff00ff) + (i_104_ & 0xff00ff));
										int i_107_ = ((i_106_ & 0x1000100) + (i_105_ - i_106_ & 0x10000));
										i_107_ = (i_105_ - i_107_ | i_107_ - (i_107_ >>> 8));
										if (i_103_ == 0 && anInt9015 != 255) {
											i_103_ = i_107_;
											i_107_ = is[i_76_];
											i_107_ = (((((i_103_ & 0xff00ff) * anInt9015) + ((i_107_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_103_ & 0xff00) * anInt9015) + ((i_107_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_76_] = i_107_;
									} else if (i == 2) {
										int i_108_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_75_]);
										if (i_108_ != 0) {
											int i_109_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_108_ & 0xff]);
											int i_110_ = (((i_109_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_111_ = (((i_109_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_76_++] = ((i_110_ | i_111_) >>> 8) + anInt9022;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_0_ == 2) {
									if (i == 1) {
										int i_112_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_75_]);
										if (i_112_ != 0) {
											int i_113_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_112_ & 0xff]);
											int i_114_ = is[i_76_];
											int i_115_ = i_113_ + i_114_;
											int i_116_ = ((i_113_ & 0xff00ff) + (i_114_ & 0xff00ff));
											i_114_ = ((i_116_ & 0x1000100) + (i_115_ - i_116_ & 0x10000));
											is[i_76_] = (i_115_ - i_114_ | i_114_ - (i_114_ >>> 8));
										}
									} else if (i == 0) {
										int i_117_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_75_]);
										if (i_117_ != 0) {
											int i_118_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_117_ & 0xff]);
											int i_119_ = (((i_118_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_120_ = (((i_118_ & 0xff00) * anInt9018) & 0xff0000);
											int i_121_ = ((i_118_ & 0xff) * anInt9019 & 0xff00);
											i_118_ = (i_119_ | i_120_ | i_121_) >>> 8;
											int i_122_ = is[i_76_];
											int i_123_ = i_118_ + i_122_;
											int i_124_ = ((i_118_ & 0xff00ff) + (i_122_ & 0xff00ff));
											i_122_ = ((i_124_ & 0x1000100) + (i_123_ - i_124_ & 0x10000));
											is[i_76_] = (i_123_ - i_122_ | i_122_ - (i_122_ >>> 8));
										}
									} else if (i == 3) {
										byte i_125_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_75_]);
										int i_126_ = (i_125_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_125_]) : 0);
										int i_127_ = anInt9014;
										int i_128_ = i_126_ + i_127_;
										int i_129_ = ((i_126_ & 0xff00ff) + (i_127_ & 0xff00ff));
										int i_130_ = ((i_129_ & 0x1000100) + (i_128_ - i_129_ & 0x10000));
										i_130_ = (i_128_ - i_130_ | i_130_ - (i_130_ >>> 8));
										if (i_126_ == 0 && anInt9015 != 255) {
											i_126_ = i_130_;
											i_130_ = is[i_76_];
											i_130_ = (((((i_126_ & 0xff00ff) * anInt9015) + ((i_130_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_126_ & 0xff00) * anInt9015) + ((i_130_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_76_] = i_130_;
									} else if (i == 2) {
										int i_131_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_75_]);
										if (i_131_ != 0) {
											int i_132_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_131_ & 0xff]);
											int i_133_ = (((i_132_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_134_ = (((i_132_ & 0xff00) * anInt9015) & 0xff0000);
											i_132_ = (((i_133_ | i_134_) >>> 8) + anInt9022);
											int i_135_ = is[i_76_];
											int i_136_ = i_132_ + i_135_;
											int i_137_ = ((i_132_ & 0xff00ff) + (i_135_ & 0xff00ff));
											i_135_ = ((i_137_ & 0x1000100) + (i_136_ - i_137_ & 0x10000));
											is[i_76_] = (i_136_ - i_135_ | i_135_ - (i_135_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_72_ += anInt8991;
							}
						}
						i_69_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_138_ = anInt9001;
					while (i_138_ < 0) {
						int i_139_ = anInt9003;
						int i_140_ = anInt8988;
						int i_141_ = anInt9011 + anInt9013;
						int i_142_ = anInt8999;
						if (i_140_ >= 0 && i_140_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) < 0) {
							if (i_141_ < 0) {
								int i_143_ = (anInt8991 - 1 - i_141_) / anInt8991;
								i_142_ += i_143_;
								i_141_ += anInt8991 * i_143_;
								i_139_ += i_143_;
							}
							int i_144_;
							if ((i_144_ = (1 + i_141_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_142_)
								i_142_ = i_144_;
							for (/**/; i_142_ < 0; i_142_++) {
								int i_145_ = (((i_141_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_140_ >> 12));
								int i_146_ = i_139_++;
								if (i_0_ == 0) {
									if (i == 1)
										is[i_146_] = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_145_]) & 0xff)]);
									else if (i == 0) {
										int i_147_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_145_]) & 0xff)]);
										int i_148_ = ((i_147_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_149_ = ((i_147_ & 0xff00) * anInt9018 & 0xff0000);
										int i_150_ = ((i_147_ & 0xff) * anInt9019 & 0xff00);
										is[i_146_] = (i_148_ | i_149_ | i_150_) >>> 8;
									} else if (i == 3) {
										int i_151_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_145_]) & 0xff)]);
										int i_152_ = anInt9014;
										int i_153_ = i_151_ + i_152_;
										int i_154_ = ((i_151_ & 0xff00ff) + (i_152_ & 0xff00ff));
										int i_155_ = ((i_154_ & 0x1000100) + (i_153_ - i_154_ & 0x10000));
										is[i_146_] = (i_153_ - i_155_ | i_155_ - (i_155_ >>> 8));
									} else if (i == 2) {
										int i_156_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_145_]) & 0xff)]);
										int i_157_ = ((i_156_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_158_ = ((i_156_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_146_] = (((i_157_ | i_158_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_0_ == 1) {
									if (i == 1) {
										int i_159_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_145_]);
										if (i_159_ != 0)
											is[i_146_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_159_ & 0xff]);
									} else if (i == 0) {
										int i_160_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_145_]);
										if (i_160_ != 0) {
											int i_161_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_160_ & 0xff]);
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_162_ = anInt9014 >>> 24;
												int i_163_ = 256 - i_162_;
												int i_164_ = is[i_146_];
												is[i_146_] = (((((i_161_ & 0xff00ff) * i_162_) + ((i_164_ & 0xff00ff) * i_163_)) & ~0xff00ff) + ((((i_161_ & 0xff00) * i_162_) + ((i_164_ & 0xff00) * i_163_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_165_ = (((i_161_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_166_ = (((i_161_ & 0xff00) * anInt9018) & 0xff0000);
												int i_167_ = (((i_161_ & 0xff) * anInt9019) & 0xff00);
												i_161_ = (i_165_ | i_166_ | i_167_) >>> 8;
												int i_168_ = is[i_146_];
												is[i_146_] = (((((i_161_ & 0xff00ff) * anInt9015) + ((i_168_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_161_ & 0xff00) * anInt9015) + ((i_168_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_169_ = (((i_161_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_170_ = (((i_161_ & 0xff00) * anInt9018) & 0xff0000);
												int i_171_ = (((i_161_ & 0xff) * anInt9019) & 0xff00);
												is[i_146_] = (i_169_ | i_170_ | i_171_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_172_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_145_]);
										int i_173_ = (i_172_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_172_]) : 0);
										int i_174_ = anInt9014;
										int i_175_ = i_173_ + i_174_;
										int i_176_ = ((i_173_ & 0xff00ff) + (i_174_ & 0xff00ff));
										int i_177_ = ((i_176_ & 0x1000100) + (i_175_ - i_176_ & 0x10000));
										i_177_ = (i_175_ - i_177_ | i_177_ - (i_177_ >>> 8));
										if (i_173_ == 0 && anInt9015 != 255) {
											i_173_ = i_177_;
											i_177_ = is[i_146_];
											i_177_ = (((((i_173_ & 0xff00ff) * anInt9015) + ((i_177_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_173_ & 0xff00) * anInt9015) + ((i_177_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_146_] = i_177_;
									} else if (i == 2) {
										int i_178_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_145_]);
										if (i_178_ != 0) {
											int i_179_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_178_ & 0xff]);
											int i_180_ = (((i_179_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_181_ = (((i_179_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_146_++] = ((i_180_ | i_181_) >>> 8) + anInt9022;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_0_ == 2) {
									if (i == 1) {
										int i_182_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_145_]);
										if (i_182_ != 0) {
											int i_183_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_182_ & 0xff]);
											int i_184_ = is[i_146_];
											int i_185_ = i_183_ + i_184_;
											int i_186_ = ((i_183_ & 0xff00ff) + (i_184_ & 0xff00ff));
											i_184_ = ((i_186_ & 0x1000100) + (i_185_ - i_186_ & 0x10000));
											is[i_146_] = (i_185_ - i_184_ | i_184_ - (i_184_ >>> 8));
										}
									} else if (i == 0) {
										int i_187_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_145_]);
										if (i_187_ != 0) {
											int i_188_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_187_ & 0xff]);
											int i_189_ = (((i_188_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_190_ = (((i_188_ & 0xff00) * anInt9018) & 0xff0000);
											int i_191_ = ((i_188_ & 0xff) * anInt9019 & 0xff00);
											i_188_ = (i_189_ | i_190_ | i_191_) >>> 8;
											int i_192_ = is[i_146_];
											int i_193_ = i_188_ + i_192_;
											int i_194_ = ((i_188_ & 0xff00ff) + (i_192_ & 0xff00ff));
											i_192_ = ((i_194_ & 0x1000100) + (i_193_ - i_194_ & 0x10000));
											is[i_146_] = (i_193_ - i_192_ | i_192_ - (i_192_ >>> 8));
										}
									} else if (i == 3) {
										byte i_195_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_145_]);
										int i_196_ = (i_195_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_195_]) : 0);
										int i_197_ = anInt9014;
										int i_198_ = i_196_ + i_197_;
										int i_199_ = ((i_196_ & 0xff00ff) + (i_197_ & 0xff00ff));
										int i_200_ = ((i_199_ & 0x1000100) + (i_198_ - i_199_ & 0x10000));
										i_200_ = (i_198_ - i_200_ | i_200_ - (i_200_ >>> 8));
										if (i_196_ == 0 && anInt9015 != 255) {
											i_196_ = i_200_;
											i_200_ = is[i_146_];
											i_200_ = (((((i_196_ & 0xff00ff) * anInt9015) + ((i_200_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_196_ & 0xff00) * anInt9015) + ((i_200_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_146_] = i_200_;
									} else if (i == 2) {
										int i_201_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_145_]);
										if (i_201_ != 0) {
											int i_202_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_201_ & 0xff]);
											int i_203_ = (((i_202_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_204_ = (((i_202_ & 0xff00) * anInt9015) & 0xff0000);
											i_202_ = (((i_203_ | i_204_) >>> 8) + anInt9022);
											int i_205_ = is[i_146_];
											int i_206_ = i_202_ + i_205_;
											int i_207_ = ((i_202_ & 0xff00ff) + (i_205_ & 0xff00ff));
											i_205_ = ((i_207_ & 0x1000100) + (i_206_ - i_207_ & 0x10000));
											is[i_146_] = (i_206_ - i_205_ | i_205_ - (i_205_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_141_ += anInt8991;
							}
						}
						i_138_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_208_ = anInt9001;
					while (i_208_ < 0) {
						int i_209_ = anInt9003;
						int i_210_ = anInt8988 + anInt9012;
						int i_211_ = anInt9011;
						int i_212_ = anInt8999;
						if (i_211_ >= 0 && i_211_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) < 0) {
							int i_213_;
							if ((i_213_ = i_210_ - ((((Class57_Sub1_Sub3) this).anInt9010) << 12)) >= 0) {
								i_213_ = (anInt9004 - i_213_) / anInt9004;
								i_212_ += i_213_;
								i_210_ += anInt9004 * i_213_;
								i_209_ += i_213_;
							}
							if ((i_213_ = (i_210_ - anInt9004) / anInt9004) > i_212_)
								i_212_ = i_213_;
							for (/**/; i_212_ < 0; i_212_++) {
								int i_214_ = (((i_211_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_210_ >> 12));
								int i_215_ = i_209_++;
								if (i_0_ == 0) {
									if (i == 1)
										is[i_215_] = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_214_]) & 0xff)]);
									else if (i == 0) {
										int i_216_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_214_]) & 0xff)]);
										int i_217_ = ((i_216_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_218_ = ((i_216_ & 0xff00) * anInt9018 & 0xff0000);
										int i_219_ = ((i_216_ & 0xff) * anInt9019 & 0xff00);
										is[i_215_] = (i_217_ | i_218_ | i_219_) >>> 8;
									} else if (i == 3) {
										int i_220_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_214_]) & 0xff)]);
										int i_221_ = anInt9014;
										int i_222_ = i_220_ + i_221_;
										int i_223_ = ((i_220_ & 0xff00ff) + (i_221_ & 0xff00ff));
										int i_224_ = ((i_223_ & 0x1000100) + (i_222_ - i_223_ & 0x10000));
										is[i_215_] = (i_222_ - i_224_ | i_224_ - (i_224_ >>> 8));
									} else if (i == 2) {
										int i_225_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_214_]) & 0xff)]);
										int i_226_ = ((i_225_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_227_ = ((i_225_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_215_] = (((i_226_ | i_227_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_0_ == 1) {
									if (i == 1) {
										int i_228_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_214_]);
										if (i_228_ != 0)
											is[i_215_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_228_ & 0xff]);
									} else if (i == 0) {
										int i_229_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_214_]);
										if (i_229_ != 0) {
											int i_230_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_229_ & 0xff]);
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_231_ = anInt9014 >>> 24;
												int i_232_ = 256 - i_231_;
												int i_233_ = is[i_215_];
												is[i_215_] = (((((i_230_ & 0xff00ff) * i_231_) + ((i_233_ & 0xff00ff) * i_232_)) & ~0xff00ff) + ((((i_230_ & 0xff00) * i_231_) + ((i_233_ & 0xff00) * i_232_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_234_ = (((i_230_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_235_ = (((i_230_ & 0xff00) * anInt9018) & 0xff0000);
												int i_236_ = (((i_230_ & 0xff) * anInt9019) & 0xff00);
												i_230_ = (i_234_ | i_235_ | i_236_) >>> 8;
												int i_237_ = is[i_215_];
												is[i_215_] = (((((i_230_ & 0xff00ff) * anInt9015) + ((i_237_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_230_ & 0xff00) * anInt9015) + ((i_237_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_238_ = (((i_230_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_239_ = (((i_230_ & 0xff00) * anInt9018) & 0xff0000);
												int i_240_ = (((i_230_ & 0xff) * anInt9019) & 0xff00);
												is[i_215_] = (i_238_ | i_239_ | i_240_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_241_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_214_]);
										int i_242_ = (i_241_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_241_]) : 0);
										int i_243_ = anInt9014;
										int i_244_ = i_242_ + i_243_;
										int i_245_ = ((i_242_ & 0xff00ff) + (i_243_ & 0xff00ff));
										int i_246_ = ((i_245_ & 0x1000100) + (i_244_ - i_245_ & 0x10000));
										i_246_ = (i_244_ - i_246_ | i_246_ - (i_246_ >>> 8));
										if (i_242_ == 0 && anInt9015 != 255) {
											i_242_ = i_246_;
											i_246_ = is[i_215_];
											i_246_ = (((((i_242_ & 0xff00ff) * anInt9015) + ((i_246_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_242_ & 0xff00) * anInt9015) + ((i_246_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_215_] = i_246_;
									} else if (i == 2) {
										int i_247_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_214_]);
										if (i_247_ != 0) {
											int i_248_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_247_ & 0xff]);
											int i_249_ = (((i_248_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_250_ = (((i_248_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_215_++] = ((i_249_ | i_250_) >>> 8) + anInt9022;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_0_ == 2) {
									if (i == 1) {
										int i_251_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_214_]);
										if (i_251_ != 0) {
											int i_252_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_251_ & 0xff]);
											int i_253_ = is[i_215_];
											int i_254_ = i_252_ + i_253_;
											int i_255_ = ((i_252_ & 0xff00ff) + (i_253_ & 0xff00ff));
											i_253_ = ((i_255_ & 0x1000100) + (i_254_ - i_255_ & 0x10000));
											is[i_215_] = (i_254_ - i_253_ | i_253_ - (i_253_ >>> 8));
										}
									} else if (i == 0) {
										int i_256_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_214_]);
										if (i_256_ != 0) {
											int i_257_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_256_ & 0xff]);
											int i_258_ = (((i_257_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_259_ = (((i_257_ & 0xff00) * anInt9018) & 0xff0000);
											int i_260_ = ((i_257_ & 0xff) * anInt9019 & 0xff00);
											i_257_ = (i_258_ | i_259_ | i_260_) >>> 8;
											int i_261_ = is[i_215_];
											int i_262_ = i_257_ + i_261_;
											int i_263_ = ((i_257_ & 0xff00ff) + (i_261_ & 0xff00ff));
											i_261_ = ((i_263_ & 0x1000100) + (i_262_ - i_263_ & 0x10000));
											is[i_215_] = (i_262_ - i_261_ | i_261_ - (i_261_ >>> 8));
										}
									} else if (i == 3) {
										byte i_264_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_214_]);
										int i_265_ = (i_264_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_264_]) : 0);
										int i_266_ = anInt9014;
										int i_267_ = i_265_ + i_266_;
										int i_268_ = ((i_265_ & 0xff00ff) + (i_266_ & 0xff00ff));
										int i_269_ = ((i_268_ & 0x1000100) + (i_267_ - i_268_ & 0x10000));
										i_269_ = (i_267_ - i_269_ | i_269_ - (i_269_ >>> 8));
										if (i_265_ == 0 && anInt9015 != 255) {
											i_265_ = i_269_;
											i_269_ = is[i_215_];
											i_269_ = (((((i_265_ & 0xff00ff) * anInt9015) + ((i_269_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_265_ & 0xff00) * anInt9015) + ((i_269_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_215_] = i_269_;
									} else if (i == 2) {
										int i_270_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_214_]);
										if (i_270_ != 0) {
											int i_271_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_270_ & 0xff]);
											int i_272_ = (((i_271_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_273_ = (((i_271_ & 0xff00) * anInt9015) & 0xff0000);
											i_271_ = (((i_272_ | i_273_) >>> 8) + anInt9022);
											int i_274_ = is[i_215_];
											int i_275_ = i_271_ + i_274_;
											int i_276_ = ((i_271_ & 0xff00ff) + (i_274_ & 0xff00ff));
											i_274_ = ((i_276_ & 0x1000100) + (i_275_ - i_276_ & 0x10000));
											is[i_215_] = (i_275_ - i_274_ | i_274_ - (i_274_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_210_ += anInt9004;
							}
						}
						i_208_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_277_ = anInt9001;
					while (i_277_ < 0) {
						int i_278_ = anInt9003;
						int i_279_ = anInt8988 + anInt9012;
						int i_280_ = anInt9011 + anInt9013;
						int i_281_ = anInt8999;
						int i_282_;
						if ((i_282_ = i_279_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) >= 0) {
							i_282_ = (anInt9004 - i_282_) / anInt9004;
							i_281_ += i_282_;
							i_279_ += anInt9004 * i_282_;
							i_280_ += anInt8991 * i_282_;
							i_278_ += i_282_;
						}
						if ((i_282_ = (i_279_ - anInt9004) / anInt9004) > i_281_)
							i_281_ = i_282_;
						if ((i_282_ = i_280_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) >= 0) {
							i_282_ = (anInt8991 - i_282_) / anInt8991;
							i_281_ += i_282_;
							i_279_ += anInt9004 * i_282_;
							i_280_ += anInt8991 * i_282_;
							i_278_ += i_282_;
						}
						if ((i_282_ = (i_280_ - anInt8991) / anInt8991) > i_281_)
							i_281_ = i_282_;
						for (/**/; i_281_ < 0; i_281_++) {
							int i_283_ = (((i_280_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_279_ >> 12));
							int i_284_ = i_278_++;
							if (i_0_ == 0) {
								if (i == 1)
									is[i_284_] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_283_]) & 0xff]);
								else if (i == 0) {
									int i_285_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_283_]) & 0xff]);
									int i_286_ = ((i_285_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_287_ = ((i_285_ & 0xff00) * anInt9018 & 0xff0000);
									int i_288_ = (i_285_ & 0xff) * anInt9019 & 0xff00;
									is[i_284_] = (i_286_ | i_287_ | i_288_) >>> 8;
								} else if (i == 3) {
									int i_289_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_283_]) & 0xff]);
									int i_290_ = anInt9014;
									int i_291_ = i_289_ + i_290_;
									int i_292_ = ((i_289_ & 0xff00ff) + (i_290_ & 0xff00ff));
									int i_293_ = ((i_292_ & 0x1000100) + (i_291_ - i_292_ & 0x10000));
									is[i_284_] = i_291_ - i_293_ | i_293_ - (i_293_ >>> 8);
								} else if (i == 2) {
									int i_294_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_283_]) & 0xff]);
									int i_295_ = ((i_294_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_296_ = ((i_294_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_284_] = (((i_295_ | i_296_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_0_ == 1) {
								if (i == 1) {
									int i_297_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_283_]);
									if (i_297_ != 0)
										is[i_284_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_297_ & 0xff]);
								} else if (i == 0) {
									int i_298_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_283_]);
									if (i_298_ != 0) {
										int i_299_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_298_ & 0xff]);
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_300_ = anInt9014 >>> 24;
											int i_301_ = 256 - i_300_;
											int i_302_ = is[i_284_];
											is[i_284_] = (((((i_299_ & 0xff00ff) * i_300_) + ((i_302_ & 0xff00ff) * i_301_)) & ~0xff00ff) + ((((i_299_ & 0xff00) * i_300_) + ((i_302_ & 0xff00) * i_301_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_303_ = (((i_299_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_304_ = (((i_299_ & 0xff00) * anInt9018) & 0xff0000);
											int i_305_ = ((i_299_ & 0xff) * anInt9019 & 0xff00);
											i_299_ = (i_303_ | i_304_ | i_305_) >>> 8;
											int i_306_ = is[i_284_];
											is[i_284_] = (((((i_299_ & 0xff00ff) * anInt9015) + ((i_306_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_299_ & 0xff00) * anInt9015) + ((i_306_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_307_ = (((i_299_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_308_ = (((i_299_ & 0xff00) * anInt9018) & 0xff0000);
											int i_309_ = ((i_299_ & 0xff) * anInt9019 & 0xff00);
											is[i_284_] = (i_307_ | i_308_ | i_309_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_310_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_283_]);
									int i_311_ = (i_310_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_310_]) : 0);
									int i_312_ = anInt9014;
									int i_313_ = i_311_ + i_312_;
									int i_314_ = ((i_311_ & 0xff00ff) + (i_312_ & 0xff00ff));
									int i_315_ = ((i_314_ & 0x1000100) + (i_313_ - i_314_ & 0x10000));
									i_315_ = i_313_ - i_315_ | i_315_ - (i_315_ >>> 8);
									if (i_311_ == 0 && anInt9015 != 255) {
										i_311_ = i_315_;
										i_315_ = is[i_284_];
										i_315_ = (((((i_311_ & 0xff00ff) * anInt9015) + ((i_315_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_311_ & 0xff00) * anInt9015) + ((i_315_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_284_] = i_315_;
								} else if (i == 2) {
									int i_316_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_283_]);
									if (i_316_ != 0) {
										int i_317_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_316_ & 0xff]);
										int i_318_ = ((i_317_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_319_ = ((i_317_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_284_++] = ((i_318_ | i_319_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_0_ == 2) {
								if (i == 1) {
									int i_320_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_283_]);
									if (i_320_ != 0) {
										int i_321_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_320_ & 0xff]);
										int i_322_ = is[i_284_];
										int i_323_ = i_321_ + i_322_;
										int i_324_ = ((i_321_ & 0xff00ff) + (i_322_ & 0xff00ff));
										i_322_ = ((i_324_ & 0x1000100) + (i_323_ - i_324_ & 0x10000));
										is[i_284_] = (i_323_ - i_322_ | i_322_ - (i_322_ >>> 8));
									}
								} else if (i == 0) {
									int i_325_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_283_]);
									if (i_325_ != 0) {
										int i_326_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_325_ & 0xff]);
										int i_327_ = ((i_326_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_328_ = ((i_326_ & 0xff00) * anInt9018 & 0xff0000);
										int i_329_ = ((i_326_ & 0xff) * anInt9019 & 0xff00);
										i_326_ = (i_327_ | i_328_ | i_329_) >>> 8;
										int i_330_ = is[i_284_];
										int i_331_ = i_326_ + i_330_;
										int i_332_ = ((i_326_ & 0xff00ff) + (i_330_ & 0xff00ff));
										i_330_ = ((i_332_ & 0x1000100) + (i_331_ - i_332_ & 0x10000));
										is[i_284_] = (i_331_ - i_330_ | i_330_ - (i_330_ >>> 8));
									}
								} else if (i == 3) {
									byte i_333_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_283_]);
									int i_334_ = (i_333_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_333_]) : 0);
									int i_335_ = anInt9014;
									int i_336_ = i_334_ + i_335_;
									int i_337_ = ((i_334_ & 0xff00ff) + (i_335_ & 0xff00ff));
									int i_338_ = ((i_337_ & 0x1000100) + (i_336_ - i_337_ & 0x10000));
									i_338_ = i_336_ - i_338_ | i_338_ - (i_338_ >>> 8);
									if (i_334_ == 0 && anInt9015 != 255) {
										i_334_ = i_338_;
										i_338_ = is[i_284_];
										i_338_ = (((((i_334_ & 0xff00ff) * anInt9015) + ((i_338_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_334_ & 0xff00) * anInt9015) + ((i_338_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_284_] = i_338_;
								} else if (i == 2) {
									int i_339_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_283_]);
									if (i_339_ != 0) {
										int i_340_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_339_ & 0xff]);
										int i_341_ = ((i_340_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_342_ = ((i_340_ & 0xff00) * anInt9015 & 0xff0000);
										i_340_ = (((i_341_ | i_342_) >>> 8) + anInt9022);
										int i_343_ = is[i_284_];
										int i_344_ = i_340_ + i_343_;
										int i_345_ = ((i_340_ & 0xff00ff) + (i_343_ & 0xff00ff));
										i_343_ = ((i_345_ & 0x1000100) + (i_344_ - i_345_ & 0x10000));
										is[i_284_] = (i_344_ - i_343_ | i_343_ - (i_343_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_279_ += anInt9004;
							i_280_ += anInt8991;
						}
						i_277_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_346_ = anInt9001;
					while (i_346_ < 0) {
						int i_347_ = anInt9003;
						int i_348_ = anInt8988 + anInt9012;
						int i_349_ = anInt9011 + anInt9013;
						int i_350_ = anInt8999;
						int i_351_;
						if ((i_351_ = i_348_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) >= 0) {
							i_351_ = (anInt9004 - i_351_) / anInt9004;
							i_350_ += i_351_;
							i_348_ += anInt9004 * i_351_;
							i_349_ += anInt8991 * i_351_;
							i_347_ += i_351_;
						}
						if ((i_351_ = (i_348_ - anInt9004) / anInt9004) > i_350_)
							i_350_ = i_351_;
						if (i_349_ < 0) {
							i_351_ = (anInt8991 - 1 - i_349_) / anInt8991;
							i_350_ += i_351_;
							i_348_ += anInt9004 * i_351_;
							i_349_ += anInt8991 * i_351_;
							i_347_ += i_351_;
						}
						if ((i_351_ = (1 + i_349_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_350_)
							i_350_ = i_351_;
						for (/**/; i_350_ < 0; i_350_++) {
							int i_352_ = (((i_349_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_348_ >> 12));
							int i_353_ = i_347_++;
							if (i_0_ == 0) {
								if (i == 1)
									is[i_353_] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_352_]) & 0xff]);
								else if (i == 0) {
									int i_354_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_352_]) & 0xff]);
									int i_355_ = ((i_354_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_356_ = ((i_354_ & 0xff00) * anInt9018 & 0xff0000);
									int i_357_ = (i_354_ & 0xff) * anInt9019 & 0xff00;
									is[i_353_] = (i_355_ | i_356_ | i_357_) >>> 8;
								} else if (i == 3) {
									int i_358_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_352_]) & 0xff]);
									int i_359_ = anInt9014;
									int i_360_ = i_358_ + i_359_;
									int i_361_ = ((i_358_ & 0xff00ff) + (i_359_ & 0xff00ff));
									int i_362_ = ((i_361_ & 0x1000100) + (i_360_ - i_361_ & 0x10000));
									is[i_353_] = i_360_ - i_362_ | i_362_ - (i_362_ >>> 8);
								} else if (i == 2) {
									int i_363_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_352_]) & 0xff]);
									int i_364_ = ((i_363_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_365_ = ((i_363_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_353_] = (((i_364_ | i_365_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_0_ == 1) {
								if (i == 1) {
									int i_366_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_352_]);
									if (i_366_ != 0)
										is[i_353_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_366_ & 0xff]);
								} else if (i == 0) {
									int i_367_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_352_]);
									if (i_367_ != 0) {
										int i_368_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_367_ & 0xff]);
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_369_ = anInt9014 >>> 24;
											int i_370_ = 256 - i_369_;
											int i_371_ = is[i_353_];
											is[i_353_] = (((((i_368_ & 0xff00ff) * i_369_) + ((i_371_ & 0xff00ff) * i_370_)) & ~0xff00ff) + ((((i_368_ & 0xff00) * i_369_) + ((i_371_ & 0xff00) * i_370_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_372_ = (((i_368_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_373_ = (((i_368_ & 0xff00) * anInt9018) & 0xff0000);
											int i_374_ = ((i_368_ & 0xff) * anInt9019 & 0xff00);
											i_368_ = (i_372_ | i_373_ | i_374_) >>> 8;
											int i_375_ = is[i_353_];
											is[i_353_] = (((((i_368_ & 0xff00ff) * anInt9015) + ((i_375_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_368_ & 0xff00) * anInt9015) + ((i_375_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_376_ = (((i_368_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_377_ = (((i_368_ & 0xff00) * anInt9018) & 0xff0000);
											int i_378_ = ((i_368_ & 0xff) * anInt9019 & 0xff00);
											is[i_353_] = (i_376_ | i_377_ | i_378_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_379_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_352_]);
									int i_380_ = (i_379_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_379_]) : 0);
									int i_381_ = anInt9014;
									int i_382_ = i_380_ + i_381_;
									int i_383_ = ((i_380_ & 0xff00ff) + (i_381_ & 0xff00ff));
									int i_384_ = ((i_383_ & 0x1000100) + (i_382_ - i_383_ & 0x10000));
									i_384_ = i_382_ - i_384_ | i_384_ - (i_384_ >>> 8);
									if (i_380_ == 0 && anInt9015 != 255) {
										i_380_ = i_384_;
										i_384_ = is[i_353_];
										i_384_ = (((((i_380_ & 0xff00ff) * anInt9015) + ((i_384_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_380_ & 0xff00) * anInt9015) + ((i_384_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_353_] = i_384_;
								} else if (i == 2) {
									int i_385_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_352_]);
									if (i_385_ != 0) {
										int i_386_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_385_ & 0xff]);
										int i_387_ = ((i_386_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_388_ = ((i_386_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_353_++] = ((i_387_ | i_388_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_0_ == 2) {
								if (i == 1) {
									int i_389_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_352_]);
									if (i_389_ != 0) {
										int i_390_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_389_ & 0xff]);
										int i_391_ = is[i_353_];
										int i_392_ = i_390_ + i_391_;
										int i_393_ = ((i_390_ & 0xff00ff) + (i_391_ & 0xff00ff));
										i_391_ = ((i_393_ & 0x1000100) + (i_392_ - i_393_ & 0x10000));
										is[i_353_] = (i_392_ - i_391_ | i_391_ - (i_391_ >>> 8));
									}
								} else if (i == 0) {
									int i_394_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_352_]);
									if (i_394_ != 0) {
										int i_395_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_394_ & 0xff]);
										int i_396_ = ((i_395_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_397_ = ((i_395_ & 0xff00) * anInt9018 & 0xff0000);
										int i_398_ = ((i_395_ & 0xff) * anInt9019 & 0xff00);
										i_395_ = (i_396_ | i_397_ | i_398_) >>> 8;
										int i_399_ = is[i_353_];
										int i_400_ = i_395_ + i_399_;
										int i_401_ = ((i_395_ & 0xff00ff) + (i_399_ & 0xff00ff));
										i_399_ = ((i_401_ & 0x1000100) + (i_400_ - i_401_ & 0x10000));
										is[i_353_] = (i_400_ - i_399_ | i_399_ - (i_399_ >>> 8));
									}
								} else if (i == 3) {
									byte i_402_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_352_]);
									int i_403_ = (i_402_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_402_]) : 0);
									int i_404_ = anInt9014;
									int i_405_ = i_403_ + i_404_;
									int i_406_ = ((i_403_ & 0xff00ff) + (i_404_ & 0xff00ff));
									int i_407_ = ((i_406_ & 0x1000100) + (i_405_ - i_406_ & 0x10000));
									i_407_ = i_405_ - i_407_ | i_407_ - (i_407_ >>> 8);
									if (i_403_ == 0 && anInt9015 != 255) {
										i_403_ = i_407_;
										i_407_ = is[i_353_];
										i_407_ = (((((i_403_ & 0xff00ff) * anInt9015) + ((i_407_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_403_ & 0xff00) * anInt9015) + ((i_407_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_353_] = i_407_;
								} else if (i == 2) {
									int i_408_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_352_]);
									if (i_408_ != 0) {
										int i_409_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_408_ & 0xff]);
										int i_410_ = ((i_409_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_411_ = ((i_409_ & 0xff00) * anInt9015 & 0xff0000);
										i_409_ = (((i_410_ | i_411_) >>> 8) + anInt9022);
										int i_412_ = is[i_353_];
										int i_413_ = i_409_ + i_412_;
										int i_414_ = ((i_409_ & 0xff00ff) + (i_412_ & 0xff00ff));
										i_412_ = ((i_414_ & 0x1000100) + (i_413_ - i_414_ & 0x10000));
										is[i_353_] = (i_413_ - i_412_ | i_412_ - (i_412_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_348_ += anInt9004;
							i_349_ += anInt8991;
						}
						i_346_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_415_ = anInt9001;
				while (i_415_ < 0) {
					int i_416_ = anInt9003;
					int i_417_ = anInt8988 + anInt9012;
					int i_418_ = anInt9011;
					int i_419_ = anInt8999;
					if (i_418_ >= 0 && i_418_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) < 0) {
						if (i_417_ < 0) {
							int i_420_ = (anInt9004 - 1 - i_417_) / anInt9004;
							i_419_ += i_420_;
							i_417_ += anInt9004 * i_420_;
							i_416_ += i_420_;
						}
						int i_421_;
						if ((i_421_ = (1 + i_417_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_419_)
							i_419_ = i_421_;
						for (/**/; i_419_ < 0; i_419_++) {
							int i_422_ = (((i_418_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_417_ >> 12));
							int i_423_ = i_416_++;
							if (i_0_ == 0) {
								if (i == 1)
									is[i_423_] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_422_]) & 0xff]);
								else if (i == 0) {
									int i_424_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_422_]) & 0xff]);
									int i_425_ = ((i_424_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_426_ = ((i_424_ & 0xff00) * anInt9018 & 0xff0000);
									int i_427_ = (i_424_ & 0xff) * anInt9019 & 0xff00;
									is[i_423_] = (i_425_ | i_426_ | i_427_) >>> 8;
								} else if (i == 3) {
									int i_428_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_422_]) & 0xff]);
									int i_429_ = anInt9014;
									int i_430_ = i_428_ + i_429_;
									int i_431_ = ((i_428_ & 0xff00ff) + (i_429_ & 0xff00ff));
									int i_432_ = ((i_431_ & 0x1000100) + (i_430_ - i_431_ & 0x10000));
									is[i_423_] = i_430_ - i_432_ | i_432_ - (i_432_ >>> 8);
								} else if (i == 2) {
									int i_433_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_422_]) & 0xff]);
									int i_434_ = ((i_433_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_435_ = ((i_433_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_423_] = (((i_434_ | i_435_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_0_ == 1) {
								if (i == 1) {
									int i_436_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_422_]);
									if (i_436_ != 0)
										is[i_423_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_436_ & 0xff]);
								} else if (i == 0) {
									int i_437_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_422_]);
									if (i_437_ != 0) {
										int i_438_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_437_ & 0xff]);
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_439_ = anInt9014 >>> 24;
											int i_440_ = 256 - i_439_;
											int i_441_ = is[i_423_];
											is[i_423_] = (((((i_438_ & 0xff00ff) * i_439_) + ((i_441_ & 0xff00ff) * i_440_)) & ~0xff00ff) + ((((i_438_ & 0xff00) * i_439_) + ((i_441_ & 0xff00) * i_440_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_442_ = (((i_438_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_443_ = (((i_438_ & 0xff00) * anInt9018) & 0xff0000);
											int i_444_ = ((i_438_ & 0xff) * anInt9019 & 0xff00);
											i_438_ = (i_442_ | i_443_ | i_444_) >>> 8;
											int i_445_ = is[i_423_];
											is[i_423_] = (((((i_438_ & 0xff00ff) * anInt9015) + ((i_445_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_438_ & 0xff00) * anInt9015) + ((i_445_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_446_ = (((i_438_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_447_ = (((i_438_ & 0xff00) * anInt9018) & 0xff0000);
											int i_448_ = ((i_438_ & 0xff) * anInt9019 & 0xff00);
											is[i_423_] = (i_446_ | i_447_ | i_448_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_449_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_422_]);
									int i_450_ = (i_449_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_449_]) : 0);
									int i_451_ = anInt9014;
									int i_452_ = i_450_ + i_451_;
									int i_453_ = ((i_450_ & 0xff00ff) + (i_451_ & 0xff00ff));
									int i_454_ = ((i_453_ & 0x1000100) + (i_452_ - i_453_ & 0x10000));
									i_454_ = i_452_ - i_454_ | i_454_ - (i_454_ >>> 8);
									if (i_450_ == 0 && anInt9015 != 255) {
										i_450_ = i_454_;
										i_454_ = is[i_423_];
										i_454_ = (((((i_450_ & 0xff00ff) * anInt9015) + ((i_454_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_450_ & 0xff00) * anInt9015) + ((i_454_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_423_] = i_454_;
								} else if (i == 2) {
									int i_455_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_422_]);
									if (i_455_ != 0) {
										int i_456_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_455_ & 0xff]);
										int i_457_ = ((i_456_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_458_ = ((i_456_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_423_++] = ((i_457_ | i_458_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_0_ == 2) {
								if (i == 1) {
									int i_459_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_422_]);
									if (i_459_ != 0) {
										int i_460_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_459_ & 0xff]);
										int i_461_ = is[i_423_];
										int i_462_ = i_460_ + i_461_;
										int i_463_ = ((i_460_ & 0xff00ff) + (i_461_ & 0xff00ff));
										i_461_ = ((i_463_ & 0x1000100) + (i_462_ - i_463_ & 0x10000));
										is[i_423_] = (i_462_ - i_461_ | i_461_ - (i_461_ >>> 8));
									}
								} else if (i == 0) {
									int i_464_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_422_]);
									if (i_464_ != 0) {
										int i_465_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_464_ & 0xff]);
										int i_466_ = ((i_465_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_467_ = ((i_465_ & 0xff00) * anInt9018 & 0xff0000);
										int i_468_ = ((i_465_ & 0xff) * anInt9019 & 0xff00);
										i_465_ = (i_466_ | i_467_ | i_468_) >>> 8;
										int i_469_ = is[i_423_];
										int i_470_ = i_465_ + i_469_;
										int i_471_ = ((i_465_ & 0xff00ff) + (i_469_ & 0xff00ff));
										i_469_ = ((i_471_ & 0x1000100) + (i_470_ - i_471_ & 0x10000));
										is[i_423_] = (i_470_ - i_469_ | i_469_ - (i_469_ >>> 8));
									}
								} else if (i == 3) {
									byte i_472_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_422_]);
									int i_473_ = (i_472_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_472_]) : 0);
									int i_474_ = anInt9014;
									int i_475_ = i_473_ + i_474_;
									int i_476_ = ((i_473_ & 0xff00ff) + (i_474_ & 0xff00ff));
									int i_477_ = ((i_476_ & 0x1000100) + (i_475_ - i_476_ & 0x10000));
									i_477_ = i_475_ - i_477_ | i_477_ - (i_477_ >>> 8);
									if (i_473_ == 0 && anInt9015 != 255) {
										i_473_ = i_477_;
										i_477_ = is[i_423_];
										i_477_ = (((((i_473_ & 0xff00ff) * anInt9015) + ((i_477_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_473_ & 0xff00) * anInt9015) + ((i_477_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_423_] = i_477_;
								} else if (i == 2) {
									int i_478_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_422_]);
									if (i_478_ != 0) {
										int i_479_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_478_ & 0xff]);
										int i_480_ = ((i_479_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_481_ = ((i_479_ & 0xff00) * anInt9015 & 0xff0000);
										i_479_ = (((i_480_ | i_481_) >>> 8) + anInt9022);
										int i_482_ = is[i_423_];
										int i_483_ = i_479_ + i_482_;
										int i_484_ = ((i_479_ & 0xff00ff) + (i_482_ & 0xff00ff));
										i_482_ = ((i_484_ & 0x1000100) + (i_483_ - i_484_ & 0x10000));
										is[i_423_] = (i_483_ - i_482_ | i_482_ - (i_482_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_417_ += anInt9004;
						}
					}
					i_415_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				for (int i_485_ = anInt9001; i_485_ < 0; i_485_++) {
					int i_486_ = anInt9003;
					int i_487_ = anInt8988 + anInt9012;
					int i_488_ = anInt9011 + anInt9013;
					int i_489_ = anInt8999;
					if (i_487_ < 0) {
						int i_490_ = (anInt9004 - 1 - i_487_) / anInt9004;
						i_489_ += i_490_;
						i_487_ += anInt9004 * i_490_;
						i_488_ += anInt8991 * i_490_;
						i_486_ += i_490_;
					}
					int i_491_;
					if ((i_491_ = (1 + i_487_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_489_)
						i_489_ = i_491_;
					if ((i_491_ = i_488_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) >= 0) {
						i_491_ = (anInt8991 - i_491_) / anInt8991;
						i_489_ += i_491_;
						i_487_ += anInt9004 * i_491_;
						i_488_ += anInt8991 * i_491_;
						i_486_ += i_491_;
					}
					if ((i_491_ = (i_488_ - anInt8991) / anInt8991) > i_489_)
						i_489_ = i_491_;
					for (/**/; i_489_ < 0; i_489_++) {
						int i_492_ = (((i_488_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_487_ >> 12));
						int i_493_ = i_486_++;
						if (i_0_ == 0) {
							if (i == 1)
								is[i_493_] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_492_]) & 0xff]);
							else if (i == 0) {
								int i_494_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_492_]) & 0xff]);
								int i_495_ = ((i_494_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_496_ = (i_494_ & 0xff00) * anInt9018 & 0xff0000;
								int i_497_ = (i_494_ & 0xff) * anInt9019 & 0xff00;
								is[i_493_] = (i_495_ | i_496_ | i_497_) >>> 8;
							} else if (i == 3) {
								int i_498_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_492_]) & 0xff]);
								int i_499_ = anInt9014;
								int i_500_ = i_498_ + i_499_;
								int i_501_ = ((i_498_ & 0xff00ff) + (i_499_ & 0xff00ff));
								int i_502_ = ((i_501_ & 0x1000100) + (i_500_ - i_501_ & 0x10000));
								is[i_493_] = i_500_ - i_502_ | i_502_ - (i_502_ >>> 8);
							} else if (i == 2) {
								int i_503_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_492_]) & 0xff]);
								int i_504_ = ((i_503_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_505_ = (i_503_ & 0xff00) * anInt9015 & 0xff0000;
								is[i_493_] = ((i_504_ | i_505_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_0_ == 1) {
							if (i == 1) {
								int i_506_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_492_]);
								if (i_506_ != 0)
									is[i_493_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_506_ & 0xff]);
							} else if (i == 0) {
								int i_507_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_492_]);
								if (i_507_ != 0) {
									int i_508_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_507_ & 0xff]);
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_509_ = anInt9014 >>> 24;
										int i_510_ = 256 - i_509_;
										int i_511_ = is[i_493_];
										is[i_493_] = ((((i_508_ & 0xff00ff) * i_509_ + ((i_511_ & 0xff00ff) * i_510_)) & ~0xff00ff) + (((i_508_ & 0xff00) * i_509_ + ((i_511_ & 0xff00) * i_510_)) & 0xff0000)) >> 8;
									} else if (anInt9015 != 255) {
										int i_512_ = ((i_508_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_513_ = ((i_508_ & 0xff00) * anInt9018 & 0xff0000);
										int i_514_ = ((i_508_ & 0xff) * anInt9019 & 0xff00);
										i_508_ = (i_512_ | i_513_ | i_514_) >>> 8;
										int i_515_ = is[i_493_];
										is[i_493_] = (((((i_508_ & 0xff00ff) * anInt9015) + ((i_515_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_508_ & 0xff00) * anInt9015) + ((i_515_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									} else {
										int i_516_ = ((i_508_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_517_ = ((i_508_ & 0xff00) * anInt9018 & 0xff0000);
										int i_518_ = ((i_508_ & 0xff) * anInt9019 & 0xff00);
										is[i_493_] = (i_516_ | i_517_ | i_518_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_519_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_492_]);
								int i_520_ = (i_519_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_519_]) : 0);
								int i_521_ = anInt9014;
								int i_522_ = i_520_ + i_521_;
								int i_523_ = ((i_520_ & 0xff00ff) + (i_521_ & 0xff00ff));
								int i_524_ = ((i_523_ & 0x1000100) + (i_522_ - i_523_ & 0x10000));
								i_524_ = i_522_ - i_524_ | i_524_ - (i_524_ >>> 8);
								if (i_520_ == 0 && anInt9015 != 255) {
									i_520_ = i_524_;
									i_524_ = is[i_493_];
									i_524_ = ((((i_520_ & 0xff00ff) * anInt9015 + (i_524_ & 0xff00ff) * anInt9016) & ~0xff00ff) + (((i_520_ & 0xff00) * anInt9015 + (i_524_ & 0xff00) * anInt9016) & 0xff0000)) >> 8;
								}
								is[i_493_] = i_524_;
							} else if (i == 2) {
								int i_525_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_492_]);
								if (i_525_ != 0) {
									int i_526_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_525_ & 0xff]);
									int i_527_ = ((i_526_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_528_ = ((i_526_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_493_++] = (((i_527_ | i_528_) >>> 8) + anInt9022);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_0_ == 2) {
							if (i == 1) {
								int i_529_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_492_]);
								if (i_529_ != 0) {
									int i_530_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_529_ & 0xff]);
									int i_531_ = is[i_493_];
									int i_532_ = i_530_ + i_531_;
									int i_533_ = ((i_530_ & 0xff00ff) + (i_531_ & 0xff00ff));
									i_531_ = ((i_533_ & 0x1000100) + (i_532_ - i_533_ & 0x10000));
									is[i_493_] = i_532_ - i_531_ | i_531_ - (i_531_ >>> 8);
								}
							} else if (i == 0) {
								int i_534_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_492_]);
								if (i_534_ != 0) {
									int i_535_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_534_ & 0xff]);
									int i_536_ = ((i_535_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_537_ = ((i_535_ & 0xff00) * anInt9018 & 0xff0000);
									int i_538_ = (i_535_ & 0xff) * anInt9019 & 0xff00;
									i_535_ = (i_536_ | i_537_ | i_538_) >>> 8;
									int i_539_ = is[i_493_];
									int i_540_ = i_535_ + i_539_;
									int i_541_ = ((i_535_ & 0xff00ff) + (i_539_ & 0xff00ff));
									i_539_ = ((i_541_ & 0x1000100) + (i_540_ - i_541_ & 0x10000));
									is[i_493_] = i_540_ - i_539_ | i_539_ - (i_539_ >>> 8);
								}
							} else if (i == 3) {
								byte i_542_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_492_]);
								int i_543_ = (i_542_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_542_]) : 0);
								int i_544_ = anInt9014;
								int i_545_ = i_543_ + i_544_;
								int i_546_ = ((i_543_ & 0xff00ff) + (i_544_ & 0xff00ff));
								int i_547_ = ((i_546_ & 0x1000100) + (i_545_ - i_546_ & 0x10000));
								i_547_ = i_545_ - i_547_ | i_547_ - (i_547_ >>> 8);
								if (i_543_ == 0 && anInt9015 != 255) {
									i_543_ = i_547_;
									i_547_ = is[i_493_];
									i_547_ = ((((i_543_ & 0xff00ff) * anInt9015 + (i_547_ & 0xff00ff) * anInt9016) & ~0xff00ff) + (((i_543_ & 0xff00) * anInt9015 + (i_547_ & 0xff00) * anInt9016) & 0xff0000)) >> 8;
								}
								is[i_493_] = i_547_;
							} else if (i == 2) {
								int i_548_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_492_]);
								if (i_548_ != 0) {
									int i_549_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_548_ & 0xff]);
									int i_550_ = ((i_549_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_551_ = ((i_549_ & 0xff00) * anInt9015 & 0xff0000);
									i_549_ = (((i_550_ | i_551_) >>> 8) + anInt9022);
									int i_552_ = is[i_493_];
									int i_553_ = i_549_ + i_552_;
									int i_554_ = ((i_549_ & 0xff00ff) + (i_552_ & 0xff00ff));
									i_552_ = ((i_554_ & 0x1000100) + (i_553_ - i_554_ & 0x10000));
									is[i_493_] = i_553_ - i_552_ | i_552_ - (i_552_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_487_ += anInt9004;
						i_488_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				for (int i_555_ = anInt9001; i_555_ < 0; i_555_++) {
					int i_556_ = anInt9003;
					int i_557_ = anInt8988 + anInt9012;
					int i_558_ = anInt9011 + anInt9013;
					int i_559_ = anInt8999;
					if (i_557_ < 0) {
						int i_560_ = (anInt9004 - 1 - i_557_) / anInt9004;
						i_559_ += i_560_;
						i_557_ += anInt9004 * i_560_;
						i_558_ += anInt8991 * i_560_;
						i_556_ += i_560_;
					}
					int i_561_;
					if ((i_561_ = (1 + i_557_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_559_)
						i_559_ = i_561_;
					if (i_558_ < 0) {
						i_561_ = (anInt8991 - 1 - i_558_) / anInt8991;
						i_559_ += i_561_;
						i_557_ += anInt9004 * i_561_;
						i_558_ += anInt8991 * i_561_;
						i_556_ += i_561_;
					}
					if ((i_561_ = (1 + i_558_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_559_)
						i_559_ = i_561_;
					for (/**/; i_559_ < 0; i_559_++) {
						int i_562_ = (((i_558_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_557_ >> 12));
						int i_563_ = i_556_++;
						if (i_0_ == 0) {
							if (i == 1)
								is[i_563_] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_562_]) & 0xff]);
							else if (i == 0) {
								int i_564_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_562_]) & 0xff]);
								int i_565_ = ((i_564_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_566_ = (i_564_ & 0xff00) * anInt9018 & 0xff0000;
								int i_567_ = (i_564_ & 0xff) * anInt9019 & 0xff00;
								is[i_563_] = (i_565_ | i_566_ | i_567_) >>> 8;
							} else if (i == 3) {
								int i_568_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_562_]) & 0xff]);
								int i_569_ = anInt9014;
								int i_570_ = i_568_ + i_569_;
								int i_571_ = ((i_568_ & 0xff00ff) + (i_569_ & 0xff00ff));
								int i_572_ = ((i_571_ & 0x1000100) + (i_570_ - i_571_ & 0x10000));
								is[i_563_] = i_570_ - i_572_ | i_572_ - (i_572_ >>> 8);
							} else if (i == 2) {
								int i_573_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_562_]) & 0xff]);
								int i_574_ = ((i_573_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_575_ = (i_573_ & 0xff00) * anInt9015 & 0xff0000;
								is[i_563_] = ((i_574_ | i_575_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_0_ == 1) {
							if (i == 1) {
								int i_576_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_562_]);
								if (i_576_ != 0)
									is[i_563_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_576_ & 0xff]);
							} else if (i == 0) {
								int i_577_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_562_]);
								if (i_577_ != 0) {
									int i_578_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_577_ & 0xff]);
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_579_ = anInt9014 >>> 24;
										int i_580_ = 256 - i_579_;
										int i_581_ = is[i_563_];
										is[i_563_] = ((((i_578_ & 0xff00ff) * i_579_ + ((i_581_ & 0xff00ff) * i_580_)) & ~0xff00ff) + (((i_578_ & 0xff00) * i_579_ + ((i_581_ & 0xff00) * i_580_)) & 0xff0000)) >> 8;
									} else if (anInt9015 != 255) {
										int i_582_ = ((i_578_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_583_ = ((i_578_ & 0xff00) * anInt9018 & 0xff0000);
										int i_584_ = ((i_578_ & 0xff) * anInt9019 & 0xff00);
										i_578_ = (i_582_ | i_583_ | i_584_) >>> 8;
										int i_585_ = is[i_563_];
										is[i_563_] = (((((i_578_ & 0xff00ff) * anInt9015) + ((i_585_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_578_ & 0xff00) * anInt9015) + ((i_585_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									} else {
										int i_586_ = ((i_578_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_587_ = ((i_578_ & 0xff00) * anInt9018 & 0xff0000);
										int i_588_ = ((i_578_ & 0xff) * anInt9019 & 0xff00);
										is[i_563_] = (i_586_ | i_587_ | i_588_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_589_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_562_]);
								int i_590_ = (i_589_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_589_]) : 0);
								int i_591_ = anInt9014;
								int i_592_ = i_590_ + i_591_;
								int i_593_ = ((i_590_ & 0xff00ff) + (i_591_ & 0xff00ff));
								int i_594_ = ((i_593_ & 0x1000100) + (i_592_ - i_593_ & 0x10000));
								i_594_ = i_592_ - i_594_ | i_594_ - (i_594_ >>> 8);
								if (i_590_ == 0 && anInt9015 != 255) {
									i_590_ = i_594_;
									i_594_ = is[i_563_];
									i_594_ = ((((i_590_ & 0xff00ff) * anInt9015 + (i_594_ & 0xff00ff) * anInt9016) & ~0xff00ff) + (((i_590_ & 0xff00) * anInt9015 + (i_594_ & 0xff00) * anInt9016) & 0xff0000)) >> 8;
								}
								is[i_563_] = i_594_;
							} else if (i == 2) {
								int i_595_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_562_]);
								if (i_595_ != 0) {
									int i_596_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_595_ & 0xff]);
									int i_597_ = ((i_596_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_598_ = ((i_596_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_563_++] = (((i_597_ | i_598_) >>> 8) + anInt9022);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_0_ == 2) {
							if (i == 1) {
								int i_599_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_562_]);
								if (i_599_ != 0) {
									int i_600_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_599_ & 0xff]);
									int i_601_ = is[i_563_];
									int i_602_ = i_600_ + i_601_;
									int i_603_ = ((i_600_ & 0xff00ff) + (i_601_ & 0xff00ff));
									i_601_ = ((i_603_ & 0x1000100) + (i_602_ - i_603_ & 0x10000));
									is[i_563_] = i_602_ - i_601_ | i_601_ - (i_601_ >>> 8);
								}
							} else if (i == 0) {
								int i_604_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_562_]);
								if (i_604_ != 0) {
									int i_605_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_604_ & 0xff]);
									int i_606_ = ((i_605_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_607_ = ((i_605_ & 0xff00) * anInt9018 & 0xff0000);
									int i_608_ = (i_605_ & 0xff) * anInt9019 & 0xff00;
									i_605_ = (i_606_ | i_607_ | i_608_) >>> 8;
									int i_609_ = is[i_563_];
									int i_610_ = i_605_ + i_609_;
									int i_611_ = ((i_605_ & 0xff00ff) + (i_609_ & 0xff00ff));
									i_609_ = ((i_611_ & 0x1000100) + (i_610_ - i_611_ & 0x10000));
									is[i_563_] = i_610_ - i_609_ | i_609_ - (i_609_ >>> 8);
								}
							} else if (i == 3) {
								byte i_612_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_562_]);
								int i_613_ = (i_612_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_612_]) : 0);
								int i_614_ = anInt9014;
								int i_615_ = i_613_ + i_614_;
								int i_616_ = ((i_613_ & 0xff00ff) + (i_614_ & 0xff00ff));
								int i_617_ = ((i_616_ & 0x1000100) + (i_615_ - i_616_ & 0x10000));
								i_617_ = i_615_ - i_617_ | i_617_ - (i_617_ >>> 8);
								if (i_613_ == 0 && anInt9015 != 255) {
									i_613_ = i_617_;
									i_617_ = is[i_563_];
									i_617_ = ((((i_613_ & 0xff00ff) * anInt9015 + (i_617_ & 0xff00ff) * anInt9016) & ~0xff00ff) + (((i_613_ & 0xff00) * anInt9015 + (i_617_ & 0xff00) * anInt9016) & 0xff0000)) >> 8;
								}
								is[i_563_] = i_617_;
							} else if (i == 2) {
								int i_618_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_562_]);
								if (i_618_ != 0) {
									int i_619_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_618_ & 0xff]);
									int i_620_ = ((i_619_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_621_ = ((i_619_ & 0xff00) * anInt9015 & 0xff0000);
									i_619_ = (((i_620_ | i_621_) >>> 8) + anInt9022);
									int i_622_ = is[i_563_];
									int i_623_ = i_619_ + i_622_;
									int i_624_ = ((i_619_ & 0xff00ff) + (i_622_ & 0xff00ff));
									i_622_ = ((i_624_ & 0x1000100) + (i_623_ - i_624_ & 0x10000));
									is[i_563_] = i_623_ - i_622_ | i_622_ - (i_622_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_557_ += anInt9004;
						i_558_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	public void method675(int i, int i_625_, int i_626_, int i_627_, int i_628_, int i_629_) {
		throw new IllegalStateException();
	}

	void method680(int i, int i_630_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_631_ = anInt9001;
					while (i_631_ < 0) {
						int i_632_ = anInt9003;
						int i_633_ = anInt8988;
						int i_634_ = anInt9011;
						int i_635_ = anInt8999;
						if (i_633_ >= 0 && i_634_ >= 0 && i_633_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) < 0 && i_634_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) < 0) {
							for (/**/; i_635_ < 0; i_635_++) {
								int i_636_ = (((i_634_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_633_ >> 12));
								int i_637_ = i_632_++;
								if (i_630_ == 0) {
									if (i == 1)
										is[i_637_] = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_636_]) & 0xff)]);
									else if (i == 0) {
										int i_638_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_636_]) & 0xff)]);
										int i_639_ = ((i_638_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_640_ = ((i_638_ & 0xff00) * anInt9018 & 0xff0000);
										int i_641_ = ((i_638_ & 0xff) * anInt9019 & 0xff00);
										is[i_637_] = (i_639_ | i_640_ | i_641_) >>> 8;
									} else if (i == 3) {
										int i_642_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_636_]) & 0xff)]);
										int i_643_ = anInt9014;
										int i_644_ = i_642_ + i_643_;
										int i_645_ = ((i_642_ & 0xff00ff) + (i_643_ & 0xff00ff));
										int i_646_ = ((i_645_ & 0x1000100) + (i_644_ - i_645_ & 0x10000));
										is[i_637_] = (i_644_ - i_646_ | i_646_ - (i_646_ >>> 8));
									} else if (i == 2) {
										int i_647_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_636_]) & 0xff)]);
										int i_648_ = ((i_647_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_649_ = ((i_647_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_637_] = (((i_648_ | i_649_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_630_ == 1) {
									if (i == 1) {
										int i_650_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_636_]);
										if (i_650_ != 0)
											is[i_637_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_650_ & 0xff]);
									} else if (i == 0) {
										int i_651_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_636_]);
										if (i_651_ != 0) {
											int i_652_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_651_ & 0xff]);
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_653_ = anInt9014 >>> 24;
												int i_654_ = 256 - i_653_;
												int i_655_ = is[i_637_];
												is[i_637_] = (((((i_652_ & 0xff00ff) * i_653_) + ((i_655_ & 0xff00ff) * i_654_)) & ~0xff00ff) + ((((i_652_ & 0xff00) * i_653_) + ((i_655_ & 0xff00) * i_654_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_656_ = (((i_652_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_657_ = (((i_652_ & 0xff00) * anInt9018) & 0xff0000);
												int i_658_ = (((i_652_ & 0xff) * anInt9019) & 0xff00);
												i_652_ = (i_656_ | i_657_ | i_658_) >>> 8;
												int i_659_ = is[i_637_];
												is[i_637_] = (((((i_652_ & 0xff00ff) * anInt9015) + ((i_659_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_652_ & 0xff00) * anInt9015) + ((i_659_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_660_ = (((i_652_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_661_ = (((i_652_ & 0xff00) * anInt9018) & 0xff0000);
												int i_662_ = (((i_652_ & 0xff) * anInt9019) & 0xff00);
												is[i_637_] = (i_660_ | i_661_ | i_662_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_663_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_636_]);
										int i_664_ = (i_663_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_663_]) : 0);
										int i_665_ = anInt9014;
										int i_666_ = i_664_ + i_665_;
										int i_667_ = ((i_664_ & 0xff00ff) + (i_665_ & 0xff00ff));
										int i_668_ = ((i_667_ & 0x1000100) + (i_666_ - i_667_ & 0x10000));
										i_668_ = (i_666_ - i_668_ | i_668_ - (i_668_ >>> 8));
										if (i_664_ == 0 && anInt9015 != 255) {
											i_664_ = i_668_;
											i_668_ = is[i_637_];
											i_668_ = (((((i_664_ & 0xff00ff) * anInt9015) + ((i_668_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_664_ & 0xff00) * anInt9015) + ((i_668_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_637_] = i_668_;
									} else if (i == 2) {
										int i_669_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_636_]);
										if (i_669_ != 0) {
											int i_670_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_669_ & 0xff]);
											int i_671_ = (((i_670_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_672_ = (((i_670_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_637_++] = ((i_671_ | i_672_) >>> 8) + anInt9022;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_630_ == 2) {
									if (i == 1) {
										int i_673_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_636_]);
										if (i_673_ != 0) {
											int i_674_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_673_ & 0xff]);
											int i_675_ = is[i_637_];
											int i_676_ = i_674_ + i_675_;
											int i_677_ = ((i_674_ & 0xff00ff) + (i_675_ & 0xff00ff));
											i_675_ = ((i_677_ & 0x1000100) + (i_676_ - i_677_ & 0x10000));
											is[i_637_] = (i_676_ - i_675_ | i_675_ - (i_675_ >>> 8));
										}
									} else if (i == 0) {
										int i_678_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_636_]);
										if (i_678_ != 0) {
											int i_679_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_678_ & 0xff]);
											int i_680_ = (((i_679_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_681_ = (((i_679_ & 0xff00) * anInt9018) & 0xff0000);
											int i_682_ = ((i_679_ & 0xff) * anInt9019 & 0xff00);
											i_679_ = (i_680_ | i_681_ | i_682_) >>> 8;
											int i_683_ = is[i_637_];
											int i_684_ = i_679_ + i_683_;
											int i_685_ = ((i_679_ & 0xff00ff) + (i_683_ & 0xff00ff));
											i_683_ = ((i_685_ & 0x1000100) + (i_684_ - i_685_ & 0x10000));
											is[i_637_] = (i_684_ - i_683_ | i_683_ - (i_683_ >>> 8));
										}
									} else if (i == 3) {
										byte i_686_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_636_]);
										int i_687_ = (i_686_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_686_]) : 0);
										int i_688_ = anInt9014;
										int i_689_ = i_687_ + i_688_;
										int i_690_ = ((i_687_ & 0xff00ff) + (i_688_ & 0xff00ff));
										int i_691_ = ((i_690_ & 0x1000100) + (i_689_ - i_690_ & 0x10000));
										i_691_ = (i_689_ - i_691_ | i_691_ - (i_691_ >>> 8));
										if (i_687_ == 0 && anInt9015 != 255) {
											i_687_ = i_691_;
											i_691_ = is[i_637_];
											i_691_ = (((((i_687_ & 0xff00ff) * anInt9015) + ((i_691_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_687_ & 0xff00) * anInt9015) + ((i_691_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_637_] = i_691_;
									} else if (i == 2) {
										int i_692_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_636_]);
										if (i_692_ != 0) {
											int i_693_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_692_ & 0xff]);
											int i_694_ = (((i_693_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_695_ = (((i_693_ & 0xff00) * anInt9015) & 0xff0000);
											i_693_ = (((i_694_ | i_695_) >>> 8) + anInt9022);
											int i_696_ = is[i_637_];
											int i_697_ = i_693_ + i_696_;
											int i_698_ = ((i_693_ & 0xff00ff) + (i_696_ & 0xff00ff));
											i_696_ = ((i_698_ & 0x1000100) + (i_697_ - i_698_ & 0x10000));
											is[i_637_] = (i_697_ - i_696_ | i_696_ - (i_696_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_631_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_699_ = anInt9001;
					while (i_699_ < 0) {
						int i_700_ = anInt9003;
						int i_701_ = anInt8988;
						int i_702_ = anInt9011 + anInt9013;
						int i_703_ = anInt8999;
						if (i_701_ >= 0 && i_701_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) < 0) {
							int i_704_;
							if ((i_704_ = i_702_ - ((((Class57_Sub1_Sub3) this).anInt8989) << 12)) >= 0) {
								i_704_ = (anInt8991 - i_704_) / anInt8991;
								i_703_ += i_704_;
								i_702_ += anInt8991 * i_704_;
								i_700_ += i_704_;
							}
							if ((i_704_ = (i_702_ - anInt8991) / anInt8991) > i_703_)
								i_703_ = i_704_;
							for (/**/; i_703_ < 0; i_703_++) {
								int i_705_ = (((i_702_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_701_ >> 12));
								int i_706_ = i_700_++;
								if (i_630_ == 0) {
									if (i == 1)
										is[i_706_] = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_705_]) & 0xff)]);
									else if (i == 0) {
										int i_707_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_705_]) & 0xff)]);
										int i_708_ = ((i_707_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_709_ = ((i_707_ & 0xff00) * anInt9018 & 0xff0000);
										int i_710_ = ((i_707_ & 0xff) * anInt9019 & 0xff00);
										is[i_706_] = (i_708_ | i_709_ | i_710_) >>> 8;
									} else if (i == 3) {
										int i_711_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_705_]) & 0xff)]);
										int i_712_ = anInt9014;
										int i_713_ = i_711_ + i_712_;
										int i_714_ = ((i_711_ & 0xff00ff) + (i_712_ & 0xff00ff));
										int i_715_ = ((i_714_ & 0x1000100) + (i_713_ - i_714_ & 0x10000));
										is[i_706_] = (i_713_ - i_715_ | i_715_ - (i_715_ >>> 8));
									} else if (i == 2) {
										int i_716_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_705_]) & 0xff)]);
										int i_717_ = ((i_716_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_718_ = ((i_716_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_706_] = (((i_717_ | i_718_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_630_ == 1) {
									if (i == 1) {
										int i_719_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_705_]);
										if (i_719_ != 0)
											is[i_706_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_719_ & 0xff]);
									} else if (i == 0) {
										int i_720_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_705_]);
										if (i_720_ != 0) {
											int i_721_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_720_ & 0xff]);
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_722_ = anInt9014 >>> 24;
												int i_723_ = 256 - i_722_;
												int i_724_ = is[i_706_];
												is[i_706_] = (((((i_721_ & 0xff00ff) * i_722_) + ((i_724_ & 0xff00ff) * i_723_)) & ~0xff00ff) + ((((i_721_ & 0xff00) * i_722_) + ((i_724_ & 0xff00) * i_723_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_725_ = (((i_721_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_726_ = (((i_721_ & 0xff00) * anInt9018) & 0xff0000);
												int i_727_ = (((i_721_ & 0xff) * anInt9019) & 0xff00);
												i_721_ = (i_725_ | i_726_ | i_727_) >>> 8;
												int i_728_ = is[i_706_];
												is[i_706_] = (((((i_721_ & 0xff00ff) * anInt9015) + ((i_728_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_721_ & 0xff00) * anInt9015) + ((i_728_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_729_ = (((i_721_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_730_ = (((i_721_ & 0xff00) * anInt9018) & 0xff0000);
												int i_731_ = (((i_721_ & 0xff) * anInt9019) & 0xff00);
												is[i_706_] = (i_729_ | i_730_ | i_731_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_732_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_705_]);
										int i_733_ = (i_732_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_732_]) : 0);
										int i_734_ = anInt9014;
										int i_735_ = i_733_ + i_734_;
										int i_736_ = ((i_733_ & 0xff00ff) + (i_734_ & 0xff00ff));
										int i_737_ = ((i_736_ & 0x1000100) + (i_735_ - i_736_ & 0x10000));
										i_737_ = (i_735_ - i_737_ | i_737_ - (i_737_ >>> 8));
										if (i_733_ == 0 && anInt9015 != 255) {
											i_733_ = i_737_;
											i_737_ = is[i_706_];
											i_737_ = (((((i_733_ & 0xff00ff) * anInt9015) + ((i_737_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_733_ & 0xff00) * anInt9015) + ((i_737_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_706_] = i_737_;
									} else if (i == 2) {
										int i_738_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_705_]);
										if (i_738_ != 0) {
											int i_739_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_738_ & 0xff]);
											int i_740_ = (((i_739_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_741_ = (((i_739_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_706_++] = ((i_740_ | i_741_) >>> 8) + anInt9022;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_630_ == 2) {
									if (i == 1) {
										int i_742_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_705_]);
										if (i_742_ != 0) {
											int i_743_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_742_ & 0xff]);
											int i_744_ = is[i_706_];
											int i_745_ = i_743_ + i_744_;
											int i_746_ = ((i_743_ & 0xff00ff) + (i_744_ & 0xff00ff));
											i_744_ = ((i_746_ & 0x1000100) + (i_745_ - i_746_ & 0x10000));
											is[i_706_] = (i_745_ - i_744_ | i_744_ - (i_744_ >>> 8));
										}
									} else if (i == 0) {
										int i_747_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_705_]);
										if (i_747_ != 0) {
											int i_748_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_747_ & 0xff]);
											int i_749_ = (((i_748_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_750_ = (((i_748_ & 0xff00) * anInt9018) & 0xff0000);
											int i_751_ = ((i_748_ & 0xff) * anInt9019 & 0xff00);
											i_748_ = (i_749_ | i_750_ | i_751_) >>> 8;
											int i_752_ = is[i_706_];
											int i_753_ = i_748_ + i_752_;
											int i_754_ = ((i_748_ & 0xff00ff) + (i_752_ & 0xff00ff));
											i_752_ = ((i_754_ & 0x1000100) + (i_753_ - i_754_ & 0x10000));
											is[i_706_] = (i_753_ - i_752_ | i_752_ - (i_752_ >>> 8));
										}
									} else if (i == 3) {
										byte i_755_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_705_]);
										int i_756_ = (i_755_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_755_]) : 0);
										int i_757_ = anInt9014;
										int i_758_ = i_756_ + i_757_;
										int i_759_ = ((i_756_ & 0xff00ff) + (i_757_ & 0xff00ff));
										int i_760_ = ((i_759_ & 0x1000100) + (i_758_ - i_759_ & 0x10000));
										i_760_ = (i_758_ - i_760_ | i_760_ - (i_760_ >>> 8));
										if (i_756_ == 0 && anInt9015 != 255) {
											i_756_ = i_760_;
											i_760_ = is[i_706_];
											i_760_ = (((((i_756_ & 0xff00ff) * anInt9015) + ((i_760_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_756_ & 0xff00) * anInt9015) + ((i_760_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_706_] = i_760_;
									} else if (i == 2) {
										int i_761_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_705_]);
										if (i_761_ != 0) {
											int i_762_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_761_ & 0xff]);
											int i_763_ = (((i_762_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_764_ = (((i_762_ & 0xff00) * anInt9015) & 0xff0000);
											i_762_ = (((i_763_ | i_764_) >>> 8) + anInt9022);
											int i_765_ = is[i_706_];
											int i_766_ = i_762_ + i_765_;
											int i_767_ = ((i_762_ & 0xff00ff) + (i_765_ & 0xff00ff));
											i_765_ = ((i_767_ & 0x1000100) + (i_766_ - i_767_ & 0x10000));
											is[i_706_] = (i_766_ - i_765_ | i_765_ - (i_765_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_702_ += anInt8991;
							}
						}
						i_699_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_768_ = anInt9001;
					while (i_768_ < 0) {
						int i_769_ = anInt9003;
						int i_770_ = anInt8988;
						int i_771_ = anInt9011 + anInt9013;
						int i_772_ = anInt8999;
						if (i_770_ >= 0 && i_770_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) < 0) {
							if (i_771_ < 0) {
								int i_773_ = (anInt8991 - 1 - i_771_) / anInt8991;
								i_772_ += i_773_;
								i_771_ += anInt8991 * i_773_;
								i_769_ += i_773_;
							}
							int i_774_;
							if ((i_774_ = (1 + i_771_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_772_)
								i_772_ = i_774_;
							for (/**/; i_772_ < 0; i_772_++) {
								int i_775_ = (((i_771_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_770_ >> 12));
								int i_776_ = i_769_++;
								if (i_630_ == 0) {
									if (i == 1)
										is[i_776_] = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_775_]) & 0xff)]);
									else if (i == 0) {
										int i_777_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_775_]) & 0xff)]);
										int i_778_ = ((i_777_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_779_ = ((i_777_ & 0xff00) * anInt9018 & 0xff0000);
										int i_780_ = ((i_777_ & 0xff) * anInt9019 & 0xff00);
										is[i_776_] = (i_778_ | i_779_ | i_780_) >>> 8;
									} else if (i == 3) {
										int i_781_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_775_]) & 0xff)]);
										int i_782_ = anInt9014;
										int i_783_ = i_781_ + i_782_;
										int i_784_ = ((i_781_ & 0xff00ff) + (i_782_ & 0xff00ff));
										int i_785_ = ((i_784_ & 0x1000100) + (i_783_ - i_784_ & 0x10000));
										is[i_776_] = (i_783_ - i_785_ | i_785_ - (i_785_ >>> 8));
									} else if (i == 2) {
										int i_786_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_775_]) & 0xff)]);
										int i_787_ = ((i_786_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_788_ = ((i_786_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_776_] = (((i_787_ | i_788_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_630_ == 1) {
									if (i == 1) {
										int i_789_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_775_]);
										if (i_789_ != 0)
											is[i_776_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_789_ & 0xff]);
									} else if (i == 0) {
										int i_790_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_775_]);
										if (i_790_ != 0) {
											int i_791_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_790_ & 0xff]);
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_792_ = anInt9014 >>> 24;
												int i_793_ = 256 - i_792_;
												int i_794_ = is[i_776_];
												is[i_776_] = (((((i_791_ & 0xff00ff) * i_792_) + ((i_794_ & 0xff00ff) * i_793_)) & ~0xff00ff) + ((((i_791_ & 0xff00) * i_792_) + ((i_794_ & 0xff00) * i_793_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_795_ = (((i_791_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_796_ = (((i_791_ & 0xff00) * anInt9018) & 0xff0000);
												int i_797_ = (((i_791_ & 0xff) * anInt9019) & 0xff00);
												i_791_ = (i_795_ | i_796_ | i_797_) >>> 8;
												int i_798_ = is[i_776_];
												is[i_776_] = (((((i_791_ & 0xff00ff) * anInt9015) + ((i_798_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_791_ & 0xff00) * anInt9015) + ((i_798_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_799_ = (((i_791_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_800_ = (((i_791_ & 0xff00) * anInt9018) & 0xff0000);
												int i_801_ = (((i_791_ & 0xff) * anInt9019) & 0xff00);
												is[i_776_] = (i_799_ | i_800_ | i_801_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_802_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_775_]);
										int i_803_ = (i_802_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_802_]) : 0);
										int i_804_ = anInt9014;
										int i_805_ = i_803_ + i_804_;
										int i_806_ = ((i_803_ & 0xff00ff) + (i_804_ & 0xff00ff));
										int i_807_ = ((i_806_ & 0x1000100) + (i_805_ - i_806_ & 0x10000));
										i_807_ = (i_805_ - i_807_ | i_807_ - (i_807_ >>> 8));
										if (i_803_ == 0 && anInt9015 != 255) {
											i_803_ = i_807_;
											i_807_ = is[i_776_];
											i_807_ = (((((i_803_ & 0xff00ff) * anInt9015) + ((i_807_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_803_ & 0xff00) * anInt9015) + ((i_807_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_776_] = i_807_;
									} else if (i == 2) {
										int i_808_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_775_]);
										if (i_808_ != 0) {
											int i_809_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_808_ & 0xff]);
											int i_810_ = (((i_809_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_811_ = (((i_809_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_776_++] = ((i_810_ | i_811_) >>> 8) + anInt9022;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_630_ == 2) {
									if (i == 1) {
										int i_812_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_775_]);
										if (i_812_ != 0) {
											int i_813_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_812_ & 0xff]);
											int i_814_ = is[i_776_];
											int i_815_ = i_813_ + i_814_;
											int i_816_ = ((i_813_ & 0xff00ff) + (i_814_ & 0xff00ff));
											i_814_ = ((i_816_ & 0x1000100) + (i_815_ - i_816_ & 0x10000));
											is[i_776_] = (i_815_ - i_814_ | i_814_ - (i_814_ >>> 8));
										}
									} else if (i == 0) {
										int i_817_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_775_]);
										if (i_817_ != 0) {
											int i_818_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_817_ & 0xff]);
											int i_819_ = (((i_818_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_820_ = (((i_818_ & 0xff00) * anInt9018) & 0xff0000);
											int i_821_ = ((i_818_ & 0xff) * anInt9019 & 0xff00);
											i_818_ = (i_819_ | i_820_ | i_821_) >>> 8;
											int i_822_ = is[i_776_];
											int i_823_ = i_818_ + i_822_;
											int i_824_ = ((i_818_ & 0xff00ff) + (i_822_ & 0xff00ff));
											i_822_ = ((i_824_ & 0x1000100) + (i_823_ - i_824_ & 0x10000));
											is[i_776_] = (i_823_ - i_822_ | i_822_ - (i_822_ >>> 8));
										}
									} else if (i == 3) {
										byte i_825_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_775_]);
										int i_826_ = (i_825_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_825_]) : 0);
										int i_827_ = anInt9014;
										int i_828_ = i_826_ + i_827_;
										int i_829_ = ((i_826_ & 0xff00ff) + (i_827_ & 0xff00ff));
										int i_830_ = ((i_829_ & 0x1000100) + (i_828_ - i_829_ & 0x10000));
										i_830_ = (i_828_ - i_830_ | i_830_ - (i_830_ >>> 8));
										if (i_826_ == 0 && anInt9015 != 255) {
											i_826_ = i_830_;
											i_830_ = is[i_776_];
											i_830_ = (((((i_826_ & 0xff00ff) * anInt9015) + ((i_830_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_826_ & 0xff00) * anInt9015) + ((i_830_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_776_] = i_830_;
									} else if (i == 2) {
										int i_831_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_775_]);
										if (i_831_ != 0) {
											int i_832_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_831_ & 0xff]);
											int i_833_ = (((i_832_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_834_ = (((i_832_ & 0xff00) * anInt9015) & 0xff0000);
											i_832_ = (((i_833_ | i_834_) >>> 8) + anInt9022);
											int i_835_ = is[i_776_];
											int i_836_ = i_832_ + i_835_;
											int i_837_ = ((i_832_ & 0xff00ff) + (i_835_ & 0xff00ff));
											i_835_ = ((i_837_ & 0x1000100) + (i_836_ - i_837_ & 0x10000));
											is[i_776_] = (i_836_ - i_835_ | i_835_ - (i_835_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_771_ += anInt8991;
							}
						}
						i_768_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_838_ = anInt9001;
					while (i_838_ < 0) {
						int i_839_ = anInt9003;
						int i_840_ = anInt8988 + anInt9012;
						int i_841_ = anInt9011;
						int i_842_ = anInt8999;
						if (i_841_ >= 0 && i_841_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) < 0) {
							int i_843_;
							if ((i_843_ = i_840_ - ((((Class57_Sub1_Sub3) this).anInt9010) << 12)) >= 0) {
								i_843_ = (anInt9004 - i_843_) / anInt9004;
								i_842_ += i_843_;
								i_840_ += anInt9004 * i_843_;
								i_839_ += i_843_;
							}
							if ((i_843_ = (i_840_ - anInt9004) / anInt9004) > i_842_)
								i_842_ = i_843_;
							for (/**/; i_842_ < 0; i_842_++) {
								int i_844_ = (((i_841_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_840_ >> 12));
								int i_845_ = i_839_++;
								if (i_630_ == 0) {
									if (i == 1)
										is[i_845_] = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_844_]) & 0xff)]);
									else if (i == 0) {
										int i_846_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_844_]) & 0xff)]);
										int i_847_ = ((i_846_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_848_ = ((i_846_ & 0xff00) * anInt9018 & 0xff0000);
										int i_849_ = ((i_846_ & 0xff) * anInt9019 & 0xff00);
										is[i_845_] = (i_847_ | i_848_ | i_849_) >>> 8;
									} else if (i == 3) {
										int i_850_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_844_]) & 0xff)]);
										int i_851_ = anInt9014;
										int i_852_ = i_850_ + i_851_;
										int i_853_ = ((i_850_ & 0xff00ff) + (i_851_ & 0xff00ff));
										int i_854_ = ((i_853_ & 0x1000100) + (i_852_ - i_853_ & 0x10000));
										is[i_845_] = (i_852_ - i_854_ | i_854_ - (i_854_ >>> 8));
									} else if (i == 2) {
										int i_855_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_844_]) & 0xff)]);
										int i_856_ = ((i_855_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_857_ = ((i_855_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_845_] = (((i_856_ | i_857_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_630_ == 1) {
									if (i == 1) {
										int i_858_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_844_]);
										if (i_858_ != 0)
											is[i_845_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_858_ & 0xff]);
									} else if (i == 0) {
										int i_859_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_844_]);
										if (i_859_ != 0) {
											int i_860_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_859_ & 0xff]);
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_861_ = anInt9014 >>> 24;
												int i_862_ = 256 - i_861_;
												int i_863_ = is[i_845_];
												is[i_845_] = (((((i_860_ & 0xff00ff) * i_861_) + ((i_863_ & 0xff00ff) * i_862_)) & ~0xff00ff) + ((((i_860_ & 0xff00) * i_861_) + ((i_863_ & 0xff00) * i_862_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_864_ = (((i_860_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_865_ = (((i_860_ & 0xff00) * anInt9018) & 0xff0000);
												int i_866_ = (((i_860_ & 0xff) * anInt9019) & 0xff00);
												i_860_ = (i_864_ | i_865_ | i_866_) >>> 8;
												int i_867_ = is[i_845_];
												is[i_845_] = (((((i_860_ & 0xff00ff) * anInt9015) + ((i_867_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_860_ & 0xff00) * anInt9015) + ((i_867_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_868_ = (((i_860_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_869_ = (((i_860_ & 0xff00) * anInt9018) & 0xff0000);
												int i_870_ = (((i_860_ & 0xff) * anInt9019) & 0xff00);
												is[i_845_] = (i_868_ | i_869_ | i_870_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_871_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_844_]);
										int i_872_ = (i_871_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_871_]) : 0);
										int i_873_ = anInt9014;
										int i_874_ = i_872_ + i_873_;
										int i_875_ = ((i_872_ & 0xff00ff) + (i_873_ & 0xff00ff));
										int i_876_ = ((i_875_ & 0x1000100) + (i_874_ - i_875_ & 0x10000));
										i_876_ = (i_874_ - i_876_ | i_876_ - (i_876_ >>> 8));
										if (i_872_ == 0 && anInt9015 != 255) {
											i_872_ = i_876_;
											i_876_ = is[i_845_];
											i_876_ = (((((i_872_ & 0xff00ff) * anInt9015) + ((i_876_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_872_ & 0xff00) * anInt9015) + ((i_876_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_845_] = i_876_;
									} else if (i == 2) {
										int i_877_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_844_]);
										if (i_877_ != 0) {
											int i_878_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_877_ & 0xff]);
											int i_879_ = (((i_878_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_880_ = (((i_878_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_845_++] = ((i_879_ | i_880_) >>> 8) + anInt9022;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_630_ == 2) {
									if (i == 1) {
										int i_881_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_844_]);
										if (i_881_ != 0) {
											int i_882_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_881_ & 0xff]);
											int i_883_ = is[i_845_];
											int i_884_ = i_882_ + i_883_;
											int i_885_ = ((i_882_ & 0xff00ff) + (i_883_ & 0xff00ff));
											i_883_ = ((i_885_ & 0x1000100) + (i_884_ - i_885_ & 0x10000));
											is[i_845_] = (i_884_ - i_883_ | i_883_ - (i_883_ >>> 8));
										}
									} else if (i == 0) {
										int i_886_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_844_]);
										if (i_886_ != 0) {
											int i_887_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_886_ & 0xff]);
											int i_888_ = (((i_887_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_889_ = (((i_887_ & 0xff00) * anInt9018) & 0xff0000);
											int i_890_ = ((i_887_ & 0xff) * anInt9019 & 0xff00);
											i_887_ = (i_888_ | i_889_ | i_890_) >>> 8;
											int i_891_ = is[i_845_];
											int i_892_ = i_887_ + i_891_;
											int i_893_ = ((i_887_ & 0xff00ff) + (i_891_ & 0xff00ff));
											i_891_ = ((i_893_ & 0x1000100) + (i_892_ - i_893_ & 0x10000));
											is[i_845_] = (i_892_ - i_891_ | i_891_ - (i_891_ >>> 8));
										}
									} else if (i == 3) {
										byte i_894_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_844_]);
										int i_895_ = (i_894_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_894_]) : 0);
										int i_896_ = anInt9014;
										int i_897_ = i_895_ + i_896_;
										int i_898_ = ((i_895_ & 0xff00ff) + (i_896_ & 0xff00ff));
										int i_899_ = ((i_898_ & 0x1000100) + (i_897_ - i_898_ & 0x10000));
										i_899_ = (i_897_ - i_899_ | i_899_ - (i_899_ >>> 8));
										if (i_895_ == 0 && anInt9015 != 255) {
											i_895_ = i_899_;
											i_899_ = is[i_845_];
											i_899_ = (((((i_895_ & 0xff00ff) * anInt9015) + ((i_899_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_895_ & 0xff00) * anInt9015) + ((i_899_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_845_] = i_899_;
									} else if (i == 2) {
										int i_900_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_844_]);
										if (i_900_ != 0) {
											int i_901_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_900_ & 0xff]);
											int i_902_ = (((i_901_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_903_ = (((i_901_ & 0xff00) * anInt9015) & 0xff0000);
											i_901_ = (((i_902_ | i_903_) >>> 8) + anInt9022);
											int i_904_ = is[i_845_];
											int i_905_ = i_901_ + i_904_;
											int i_906_ = ((i_901_ & 0xff00ff) + (i_904_ & 0xff00ff));
											i_904_ = ((i_906_ & 0x1000100) + (i_905_ - i_906_ & 0x10000));
											is[i_845_] = (i_905_ - i_904_ | i_904_ - (i_904_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_840_ += anInt9004;
							}
						}
						i_838_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_907_ = anInt9001;
					while (i_907_ < 0) {
						int i_908_ = anInt9003;
						int i_909_ = anInt8988 + anInt9012;
						int i_910_ = anInt9011 + anInt9013;
						int i_911_ = anInt8999;
						int i_912_;
						if ((i_912_ = i_909_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) >= 0) {
							i_912_ = (anInt9004 - i_912_) / anInt9004;
							i_911_ += i_912_;
							i_909_ += anInt9004 * i_912_;
							i_910_ += anInt8991 * i_912_;
							i_908_ += i_912_;
						}
						if ((i_912_ = (i_909_ - anInt9004) / anInt9004) > i_911_)
							i_911_ = i_912_;
						if ((i_912_ = i_910_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) >= 0) {
							i_912_ = (anInt8991 - i_912_) / anInt8991;
							i_911_ += i_912_;
							i_909_ += anInt9004 * i_912_;
							i_910_ += anInt8991 * i_912_;
							i_908_ += i_912_;
						}
						if ((i_912_ = (i_910_ - anInt8991) / anInt8991) > i_911_)
							i_911_ = i_912_;
						for (/**/; i_911_ < 0; i_911_++) {
							int i_913_ = (((i_910_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_909_ >> 12));
							int i_914_ = i_908_++;
							if (i_630_ == 0) {
								if (i == 1)
									is[i_914_] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_913_]) & 0xff]);
								else if (i == 0) {
									int i_915_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_913_]) & 0xff]);
									int i_916_ = ((i_915_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_917_ = ((i_915_ & 0xff00) * anInt9018 & 0xff0000);
									int i_918_ = (i_915_ & 0xff) * anInt9019 & 0xff00;
									is[i_914_] = (i_916_ | i_917_ | i_918_) >>> 8;
								} else if (i == 3) {
									int i_919_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_913_]) & 0xff]);
									int i_920_ = anInt9014;
									int i_921_ = i_919_ + i_920_;
									int i_922_ = ((i_919_ & 0xff00ff) + (i_920_ & 0xff00ff));
									int i_923_ = ((i_922_ & 0x1000100) + (i_921_ - i_922_ & 0x10000));
									is[i_914_] = i_921_ - i_923_ | i_923_ - (i_923_ >>> 8);
								} else if (i == 2) {
									int i_924_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_913_]) & 0xff]);
									int i_925_ = ((i_924_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_926_ = ((i_924_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_914_] = (((i_925_ | i_926_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_630_ == 1) {
								if (i == 1) {
									int i_927_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_913_]);
									if (i_927_ != 0)
										is[i_914_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_927_ & 0xff]);
								} else if (i == 0) {
									int i_928_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_913_]);
									if (i_928_ != 0) {
										int i_929_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_928_ & 0xff]);
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_930_ = anInt9014 >>> 24;
											int i_931_ = 256 - i_930_;
											int i_932_ = is[i_914_];
											is[i_914_] = (((((i_929_ & 0xff00ff) * i_930_) + ((i_932_ & 0xff00ff) * i_931_)) & ~0xff00ff) + ((((i_929_ & 0xff00) * i_930_) + ((i_932_ & 0xff00) * i_931_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_933_ = (((i_929_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_934_ = (((i_929_ & 0xff00) * anInt9018) & 0xff0000);
											int i_935_ = ((i_929_ & 0xff) * anInt9019 & 0xff00);
											i_929_ = (i_933_ | i_934_ | i_935_) >>> 8;
											int i_936_ = is[i_914_];
											is[i_914_] = (((((i_929_ & 0xff00ff) * anInt9015) + ((i_936_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_929_ & 0xff00) * anInt9015) + ((i_936_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_937_ = (((i_929_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_938_ = (((i_929_ & 0xff00) * anInt9018) & 0xff0000);
											int i_939_ = ((i_929_ & 0xff) * anInt9019 & 0xff00);
											is[i_914_] = (i_937_ | i_938_ | i_939_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_940_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_913_]);
									int i_941_ = (i_940_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_940_]) : 0);
									int i_942_ = anInt9014;
									int i_943_ = i_941_ + i_942_;
									int i_944_ = ((i_941_ & 0xff00ff) + (i_942_ & 0xff00ff));
									int i_945_ = ((i_944_ & 0x1000100) + (i_943_ - i_944_ & 0x10000));
									i_945_ = i_943_ - i_945_ | i_945_ - (i_945_ >>> 8);
									if (i_941_ == 0 && anInt9015 != 255) {
										i_941_ = i_945_;
										i_945_ = is[i_914_];
										i_945_ = (((((i_941_ & 0xff00ff) * anInt9015) + ((i_945_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_941_ & 0xff00) * anInt9015) + ((i_945_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_914_] = i_945_;
								} else if (i == 2) {
									int i_946_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_913_]);
									if (i_946_ != 0) {
										int i_947_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_946_ & 0xff]);
										int i_948_ = ((i_947_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_949_ = ((i_947_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_914_++] = ((i_948_ | i_949_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_630_ == 2) {
								if (i == 1) {
									int i_950_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_913_]);
									if (i_950_ != 0) {
										int i_951_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_950_ & 0xff]);
										int i_952_ = is[i_914_];
										int i_953_ = i_951_ + i_952_;
										int i_954_ = ((i_951_ & 0xff00ff) + (i_952_ & 0xff00ff));
										i_952_ = ((i_954_ & 0x1000100) + (i_953_ - i_954_ & 0x10000));
										is[i_914_] = (i_953_ - i_952_ | i_952_ - (i_952_ >>> 8));
									}
								} else if (i == 0) {
									int i_955_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_913_]);
									if (i_955_ != 0) {
										int i_956_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_955_ & 0xff]);
										int i_957_ = ((i_956_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_958_ = ((i_956_ & 0xff00) * anInt9018 & 0xff0000);
										int i_959_ = ((i_956_ & 0xff) * anInt9019 & 0xff00);
										i_956_ = (i_957_ | i_958_ | i_959_) >>> 8;
										int i_960_ = is[i_914_];
										int i_961_ = i_956_ + i_960_;
										int i_962_ = ((i_956_ & 0xff00ff) + (i_960_ & 0xff00ff));
										i_960_ = ((i_962_ & 0x1000100) + (i_961_ - i_962_ & 0x10000));
										is[i_914_] = (i_961_ - i_960_ | i_960_ - (i_960_ >>> 8));
									}
								} else if (i == 3) {
									byte i_963_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_913_]);
									int i_964_ = (i_963_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_963_]) : 0);
									int i_965_ = anInt9014;
									int i_966_ = i_964_ + i_965_;
									int i_967_ = ((i_964_ & 0xff00ff) + (i_965_ & 0xff00ff));
									int i_968_ = ((i_967_ & 0x1000100) + (i_966_ - i_967_ & 0x10000));
									i_968_ = i_966_ - i_968_ | i_968_ - (i_968_ >>> 8);
									if (i_964_ == 0 && anInt9015 != 255) {
										i_964_ = i_968_;
										i_968_ = is[i_914_];
										i_968_ = (((((i_964_ & 0xff00ff) * anInt9015) + ((i_968_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_964_ & 0xff00) * anInt9015) + ((i_968_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_914_] = i_968_;
								} else if (i == 2) {
									int i_969_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_913_]);
									if (i_969_ != 0) {
										int i_970_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_969_ & 0xff]);
										int i_971_ = ((i_970_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_972_ = ((i_970_ & 0xff00) * anInt9015 & 0xff0000);
										i_970_ = (((i_971_ | i_972_) >>> 8) + anInt9022);
										int i_973_ = is[i_914_];
										int i_974_ = i_970_ + i_973_;
										int i_975_ = ((i_970_ & 0xff00ff) + (i_973_ & 0xff00ff));
										i_973_ = ((i_975_ & 0x1000100) + (i_974_ - i_975_ & 0x10000));
										is[i_914_] = (i_974_ - i_973_ | i_973_ - (i_973_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_909_ += anInt9004;
							i_910_ += anInt8991;
						}
						i_907_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_976_ = anInt9001;
					while (i_976_ < 0) {
						int i_977_ = anInt9003;
						int i_978_ = anInt8988 + anInt9012;
						int i_979_ = anInt9011 + anInt9013;
						int i_980_ = anInt8999;
						int i_981_;
						if ((i_981_ = i_978_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) >= 0) {
							i_981_ = (anInt9004 - i_981_) / anInt9004;
							i_980_ += i_981_;
							i_978_ += anInt9004 * i_981_;
							i_979_ += anInt8991 * i_981_;
							i_977_ += i_981_;
						}
						if ((i_981_ = (i_978_ - anInt9004) / anInt9004) > i_980_)
							i_980_ = i_981_;
						if (i_979_ < 0) {
							i_981_ = (anInt8991 - 1 - i_979_) / anInt8991;
							i_980_ += i_981_;
							i_978_ += anInt9004 * i_981_;
							i_979_ += anInt8991 * i_981_;
							i_977_ += i_981_;
						}
						if ((i_981_ = (1 + i_979_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_980_)
							i_980_ = i_981_;
						for (/**/; i_980_ < 0; i_980_++) {
							int i_982_ = (((i_979_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_978_ >> 12));
							int i_983_ = i_977_++;
							if (i_630_ == 0) {
								if (i == 1)
									is[i_983_] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_982_]) & 0xff]);
								else if (i == 0) {
									int i_984_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_982_]) & 0xff]);
									int i_985_ = ((i_984_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_986_ = ((i_984_ & 0xff00) * anInt9018 & 0xff0000);
									int i_987_ = (i_984_ & 0xff) * anInt9019 & 0xff00;
									is[i_983_] = (i_985_ | i_986_ | i_987_) >>> 8;
								} else if (i == 3) {
									int i_988_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_982_]) & 0xff]);
									int i_989_ = anInt9014;
									int i_990_ = i_988_ + i_989_;
									int i_991_ = ((i_988_ & 0xff00ff) + (i_989_ & 0xff00ff));
									int i_992_ = ((i_991_ & 0x1000100) + (i_990_ - i_991_ & 0x10000));
									is[i_983_] = i_990_ - i_992_ | i_992_ - (i_992_ >>> 8);
								} else if (i == 2) {
									int i_993_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_982_]) & 0xff]);
									int i_994_ = ((i_993_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_995_ = ((i_993_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_983_] = (((i_994_ | i_995_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_630_ == 1) {
								if (i == 1) {
									int i_996_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_982_]);
									if (i_996_ != 0)
										is[i_983_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_996_ & 0xff]);
								} else if (i == 0) {
									int i_997_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_982_]);
									if (i_997_ != 0) {
										int i_998_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_997_ & 0xff]);
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_999_ = anInt9014 >>> 24;
											int i_1000_ = 256 - i_999_;
											int i_1001_ = is[i_983_];
											is[i_983_] = (((((i_998_ & 0xff00ff) * i_999_) + ((i_1001_ & 0xff00ff) * i_1000_)) & ~0xff00ff) + ((((i_998_ & 0xff00) * i_999_) + ((i_1001_ & 0xff00) * i_1000_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_1002_ = (((i_998_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_1003_ = (((i_998_ & 0xff00) * anInt9018) & 0xff0000);
											int i_1004_ = ((i_998_ & 0xff) * anInt9019 & 0xff00);
											i_998_ = (i_1002_ | i_1003_ | i_1004_) >>> 8;
											int i_1005_ = is[i_983_];
											is[i_983_] = (((((i_998_ & 0xff00ff) * anInt9015) + ((i_1005_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_998_ & 0xff00) * anInt9015) + ((i_1005_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_1006_ = (((i_998_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_1007_ = (((i_998_ & 0xff00) * anInt9018) & 0xff0000);
											int i_1008_ = ((i_998_ & 0xff) * anInt9019 & 0xff00);
											is[i_983_] = (i_1006_ | i_1007_ | i_1008_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1009_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_982_]);
									int i_1010_ = (i_1009_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1009_]) : 0);
									int i_1011_ = anInt9014;
									int i_1012_ = i_1010_ + i_1011_;
									int i_1013_ = ((i_1010_ & 0xff00ff) + (i_1011_ & 0xff00ff));
									int i_1014_ = ((i_1013_ & 0x1000100) + (i_1012_ - i_1013_ & 0x10000));
									i_1014_ = (i_1012_ - i_1014_ | i_1014_ - (i_1014_ >>> 8));
									if (i_1010_ == 0 && anInt9015 != 255) {
										i_1010_ = i_1014_;
										i_1014_ = is[i_983_];
										i_1014_ = (((((i_1010_ & 0xff00ff) * anInt9015) + ((i_1014_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1010_ & 0xff00) * anInt9015) + ((i_1014_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_983_] = i_1014_;
								} else if (i == 2) {
									int i_1015_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_982_]);
									if (i_1015_ != 0) {
										int i_1016_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1015_ & 0xff]);
										int i_1017_ = ((i_1016_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1018_ = ((i_1016_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_983_++] = ((i_1017_ | i_1018_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_630_ == 2) {
								if (i == 1) {
									int i_1019_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_982_]);
									if (i_1019_ != 0) {
										int i_1020_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1019_ & 0xff]);
										int i_1021_ = is[i_983_];
										int i_1022_ = i_1020_ + i_1021_;
										int i_1023_ = ((i_1020_ & 0xff00ff) + (i_1021_ & 0xff00ff));
										i_1021_ = ((i_1023_ & 0x1000100) + (i_1022_ - i_1023_ & 0x10000));
										is[i_983_] = (i_1022_ - i_1021_ | i_1021_ - (i_1021_ >>> 8));
									}
								} else if (i == 0) {
									int i_1024_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_982_]);
									if (i_1024_ != 0) {
										int i_1025_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1024_ & 0xff]);
										int i_1026_ = ((i_1025_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1027_ = ((i_1025_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1028_ = ((i_1025_ & 0xff) * anInt9019 & 0xff00);
										i_1025_ = (i_1026_ | i_1027_ | i_1028_) >>> 8;
										int i_1029_ = is[i_983_];
										int i_1030_ = i_1025_ + i_1029_;
										int i_1031_ = ((i_1025_ & 0xff00ff) + (i_1029_ & 0xff00ff));
										i_1029_ = ((i_1031_ & 0x1000100) + (i_1030_ - i_1031_ & 0x10000));
										is[i_983_] = (i_1030_ - i_1029_ | i_1029_ - (i_1029_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1032_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_982_]);
									int i_1033_ = (i_1032_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1032_]) : 0);
									int i_1034_ = anInt9014;
									int i_1035_ = i_1033_ + i_1034_;
									int i_1036_ = ((i_1033_ & 0xff00ff) + (i_1034_ & 0xff00ff));
									int i_1037_ = ((i_1036_ & 0x1000100) + (i_1035_ - i_1036_ & 0x10000));
									i_1037_ = (i_1035_ - i_1037_ | i_1037_ - (i_1037_ >>> 8));
									if (i_1033_ == 0 && anInt9015 != 255) {
										i_1033_ = i_1037_;
										i_1037_ = is[i_983_];
										i_1037_ = (((((i_1033_ & 0xff00ff) * anInt9015) + ((i_1037_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1033_ & 0xff00) * anInt9015) + ((i_1037_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_983_] = i_1037_;
								} else if (i == 2) {
									int i_1038_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_982_]);
									if (i_1038_ != 0) {
										int i_1039_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1038_ & 0xff]);
										int i_1040_ = ((i_1039_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1041_ = ((i_1039_ & 0xff00) * anInt9015 & 0xff0000);
										i_1039_ = (((i_1040_ | i_1041_) >>> 8) + anInt9022);
										int i_1042_ = is[i_983_];
										int i_1043_ = i_1039_ + i_1042_;
										int i_1044_ = ((i_1039_ & 0xff00ff) + (i_1042_ & 0xff00ff));
										i_1042_ = ((i_1044_ & 0x1000100) + (i_1043_ - i_1044_ & 0x10000));
										is[i_983_] = (i_1043_ - i_1042_ | i_1042_ - (i_1042_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_978_ += anInt9004;
							i_979_ += anInt8991;
						}
						i_976_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_1045_ = anInt9001;
				while (i_1045_ < 0) {
					int i_1046_ = anInt9003;
					int i_1047_ = anInt8988 + anInt9012;
					int i_1048_ = anInt9011;
					int i_1049_ = anInt8999;
					if (i_1048_ >= 0 && i_1048_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) < 0) {
						if (i_1047_ < 0) {
							int i_1050_ = (anInt9004 - 1 - i_1047_) / anInt9004;
							i_1049_ += i_1050_;
							i_1047_ += anInt9004 * i_1050_;
							i_1046_ += i_1050_;
						}
						int i_1051_;
						if ((i_1051_ = (1 + i_1047_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1049_)
							i_1049_ = i_1051_;
						for (/**/; i_1049_ < 0; i_1049_++) {
							int i_1052_ = (((i_1048_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_1047_ >> 12));
							int i_1053_ = i_1046_++;
							if (i_630_ == 0) {
								if (i == 1)
									is[i_1053_] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1052_]) & 0xff]);
								else if (i == 0) {
									int i_1054_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1052_]) & 0xff]);
									int i_1055_ = ((i_1054_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1056_ = ((i_1054_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1057_ = ((i_1054_ & 0xff) * anInt9019 & 0xff00);
									is[i_1053_] = (i_1055_ | i_1056_ | i_1057_) >>> 8;
								} else if (i == 3) {
									int i_1058_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1052_]) & 0xff]);
									int i_1059_ = anInt9014;
									int i_1060_ = i_1058_ + i_1059_;
									int i_1061_ = ((i_1058_ & 0xff00ff) + (i_1059_ & 0xff00ff));
									int i_1062_ = ((i_1061_ & 0x1000100) + (i_1060_ - i_1061_ & 0x10000));
									is[i_1053_] = (i_1060_ - i_1062_ | i_1062_ - (i_1062_ >>> 8));
								} else if (i == 2) {
									int i_1063_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1052_]) & 0xff]);
									int i_1064_ = ((i_1063_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1065_ = ((i_1063_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_1053_] = (((i_1064_ | i_1065_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_630_ == 1) {
								if (i == 1) {
									int i_1066_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1052_]);
									if (i_1066_ != 0)
										is[i_1053_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1066_ & 0xff]);
								} else if (i == 0) {
									int i_1067_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1052_]);
									if (i_1067_ != 0) {
										int i_1068_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1067_ & 0xff]);
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_1069_ = anInt9014 >>> 24;
											int i_1070_ = 256 - i_1069_;
											int i_1071_ = is[i_1053_];
											is[i_1053_] = (((((i_1068_ & 0xff00ff) * i_1069_) + ((i_1071_ & 0xff00ff) * i_1070_)) & ~0xff00ff) + ((((i_1068_ & 0xff00) * i_1069_) + ((i_1071_ & 0xff00) * i_1070_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_1072_ = (((i_1068_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_1073_ = (((i_1068_ & 0xff00) * anInt9018) & 0xff0000);
											int i_1074_ = ((i_1068_ & 0xff) * anInt9019 & 0xff00);
											i_1068_ = (i_1072_ | i_1073_ | i_1074_) >>> 8;
											int i_1075_ = is[i_1053_];
											is[i_1053_] = (((((i_1068_ & 0xff00ff) * anInt9015) + ((i_1075_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1068_ & 0xff00) * anInt9015) + ((i_1075_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_1076_ = (((i_1068_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_1077_ = (((i_1068_ & 0xff00) * anInt9018) & 0xff0000);
											int i_1078_ = ((i_1068_ & 0xff) * anInt9019 & 0xff00);
											is[i_1053_] = (i_1076_ | i_1077_ | i_1078_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1079_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1052_]);
									int i_1080_ = (i_1079_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1079_]) : 0);
									int i_1081_ = anInt9014;
									int i_1082_ = i_1080_ + i_1081_;
									int i_1083_ = ((i_1080_ & 0xff00ff) + (i_1081_ & 0xff00ff));
									int i_1084_ = ((i_1083_ & 0x1000100) + (i_1082_ - i_1083_ & 0x10000));
									i_1084_ = (i_1082_ - i_1084_ | i_1084_ - (i_1084_ >>> 8));
									if (i_1080_ == 0 && anInt9015 != 255) {
										i_1080_ = i_1084_;
										i_1084_ = is[i_1053_];
										i_1084_ = (((((i_1080_ & 0xff00ff) * anInt9015) + ((i_1084_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1080_ & 0xff00) * anInt9015) + ((i_1084_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_1053_] = i_1084_;
								} else if (i == 2) {
									int i_1085_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1052_]);
									if (i_1085_ != 0) {
										int i_1086_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1085_ & 0xff]);
										int i_1087_ = ((i_1086_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1088_ = ((i_1086_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_1053_++] = ((i_1087_ | i_1088_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_630_ == 2) {
								if (i == 1) {
									int i_1089_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1052_]);
									if (i_1089_ != 0) {
										int i_1090_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1089_ & 0xff]);
										int i_1091_ = is[i_1053_];
										int i_1092_ = i_1090_ + i_1091_;
										int i_1093_ = ((i_1090_ & 0xff00ff) + (i_1091_ & 0xff00ff));
										i_1091_ = ((i_1093_ & 0x1000100) + (i_1092_ - i_1093_ & 0x10000));
										is[i_1053_] = (i_1092_ - i_1091_ | i_1091_ - (i_1091_ >>> 8));
									}
								} else if (i == 0) {
									int i_1094_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1052_]);
									if (i_1094_ != 0) {
										int i_1095_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1094_ & 0xff]);
										int i_1096_ = ((i_1095_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1097_ = ((i_1095_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1098_ = ((i_1095_ & 0xff) * anInt9019 & 0xff00);
										i_1095_ = (i_1096_ | i_1097_ | i_1098_) >>> 8;
										int i_1099_ = is[i_1053_];
										int i_1100_ = i_1095_ + i_1099_;
										int i_1101_ = ((i_1095_ & 0xff00ff) + (i_1099_ & 0xff00ff));
										i_1099_ = ((i_1101_ & 0x1000100) + (i_1100_ - i_1101_ & 0x10000));
										is[i_1053_] = (i_1100_ - i_1099_ | i_1099_ - (i_1099_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1102_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1052_]);
									int i_1103_ = (i_1102_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1102_]) : 0);
									int i_1104_ = anInt9014;
									int i_1105_ = i_1103_ + i_1104_;
									int i_1106_ = ((i_1103_ & 0xff00ff) + (i_1104_ & 0xff00ff));
									int i_1107_ = ((i_1106_ & 0x1000100) + (i_1105_ - i_1106_ & 0x10000));
									i_1107_ = (i_1105_ - i_1107_ | i_1107_ - (i_1107_ >>> 8));
									if (i_1103_ == 0 && anInt9015 != 255) {
										i_1103_ = i_1107_;
										i_1107_ = is[i_1053_];
										i_1107_ = (((((i_1103_ & 0xff00ff) * anInt9015) + ((i_1107_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1103_ & 0xff00) * anInt9015) + ((i_1107_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_1053_] = i_1107_;
								} else if (i == 2) {
									int i_1108_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1052_]);
									if (i_1108_ != 0) {
										int i_1109_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1108_ & 0xff]);
										int i_1110_ = ((i_1109_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1111_ = ((i_1109_ & 0xff00) * anInt9015 & 0xff0000);
										i_1109_ = (((i_1110_ | i_1111_) >>> 8) + anInt9022);
										int i_1112_ = is[i_1053_];
										int i_1113_ = i_1109_ + i_1112_;
										int i_1114_ = ((i_1109_ & 0xff00ff) + (i_1112_ & 0xff00ff));
										i_1112_ = ((i_1114_ & 0x1000100) + (i_1113_ - i_1114_ & 0x10000));
										is[i_1053_] = (i_1113_ - i_1112_ | i_1112_ - (i_1112_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1047_ += anInt9004;
						}
					}
					i_1045_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				for (int i_1115_ = anInt9001; i_1115_ < 0; i_1115_++) {
					int i_1116_ = anInt9003;
					int i_1117_ = anInt8988 + anInt9012;
					int i_1118_ = anInt9011 + anInt9013;
					int i_1119_ = anInt8999;
					if (i_1117_ < 0) {
						int i_1120_ = (anInt9004 - 1 - i_1117_) / anInt9004;
						i_1119_ += i_1120_;
						i_1117_ += anInt9004 * i_1120_;
						i_1118_ += anInt8991 * i_1120_;
						i_1116_ += i_1120_;
					}
					int i_1121_;
					if ((i_1121_ = (1 + i_1117_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1119_)
						i_1119_ = i_1121_;
					if ((i_1121_ = i_1118_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) >= 0) {
						i_1121_ = (anInt8991 - i_1121_) / anInt8991;
						i_1119_ += i_1121_;
						i_1117_ += anInt9004 * i_1121_;
						i_1118_ += anInt8991 * i_1121_;
						i_1116_ += i_1121_;
					}
					if ((i_1121_ = (i_1118_ - anInt8991) / anInt8991) > i_1119_)
						i_1119_ = i_1121_;
					for (/**/; i_1119_ < 0; i_1119_++) {
						int i_1122_ = (((i_1118_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_1117_ >> 12));
						int i_1123_ = i_1116_++;
						if (i_630_ == 0) {
							if (i == 1)
								is[i_1123_] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1122_]) & 0xff]);
							else if (i == 0) {
								int i_1124_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1122_]) & 0xff]);
								int i_1125_ = ((i_1124_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_1126_ = ((i_1124_ & 0xff00) * anInt9018 & 0xff0000);
								int i_1127_ = (i_1124_ & 0xff) * anInt9019 & 0xff00;
								is[i_1123_] = (i_1125_ | i_1126_ | i_1127_) >>> 8;
							} else if (i == 3) {
								int i_1128_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1122_]) & 0xff]);
								int i_1129_ = anInt9014;
								int i_1130_ = i_1128_ + i_1129_;
								int i_1131_ = ((i_1128_ & 0xff00ff) + (i_1129_ & 0xff00ff));
								int i_1132_ = ((i_1131_ & 0x1000100) + (i_1130_ - i_1131_ & 0x10000));
								is[i_1123_] = i_1130_ - i_1132_ | i_1132_ - (i_1132_ >>> 8);
							} else if (i == 2) {
								int i_1133_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1122_]) & 0xff]);
								int i_1134_ = ((i_1133_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_1135_ = ((i_1133_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_1123_] = ((i_1134_ | i_1135_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_630_ == 1) {
							if (i == 1) {
								int i_1136_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1122_]);
								if (i_1136_ != 0)
									is[i_1123_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1136_ & 0xff]);
							} else if (i == 0) {
								int i_1137_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1122_]);
								if (i_1137_ != 0) {
									int i_1138_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1137_ & 0xff]);
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_1139_ = anInt9014 >>> 24;
										int i_1140_ = 256 - i_1139_;
										int i_1141_ = is[i_1123_];
										is[i_1123_] = ((((i_1138_ & 0xff00ff) * i_1139_ + ((i_1141_ & 0xff00ff) * i_1140_)) & ~0xff00ff) + (((i_1138_ & 0xff00) * i_1139_ + ((i_1141_ & 0xff00) * i_1140_)) & 0xff0000)) >> 8;
									} else if (anInt9015 != 255) {
										int i_1142_ = ((i_1138_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1143_ = ((i_1138_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1144_ = ((i_1138_ & 0xff) * anInt9019 & 0xff00);
										i_1138_ = (i_1142_ | i_1143_ | i_1144_) >>> 8;
										int i_1145_ = is[i_1123_];
										is[i_1123_] = (((((i_1138_ & 0xff00ff) * anInt9015) + ((i_1145_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1138_ & 0xff00) * anInt9015) + ((i_1145_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									} else {
										int i_1146_ = ((i_1138_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1147_ = ((i_1138_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1148_ = ((i_1138_ & 0xff) * anInt9019 & 0xff00);
										is[i_1123_] = (i_1146_ | i_1147_ | i_1148_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1149_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1122_]);
								int i_1150_ = (i_1149_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1149_]) : 0);
								int i_1151_ = anInt9014;
								int i_1152_ = i_1150_ + i_1151_;
								int i_1153_ = ((i_1150_ & 0xff00ff) + (i_1151_ & 0xff00ff));
								int i_1154_ = ((i_1153_ & 0x1000100) + (i_1152_ - i_1153_ & 0x10000));
								i_1154_ = i_1152_ - i_1154_ | i_1154_ - (i_1154_ >>> 8);
								if (i_1150_ == 0 && anInt9015 != 255) {
									i_1150_ = i_1154_;
									i_1154_ = is[i_1123_];
									i_1154_ = ((((i_1150_ & 0xff00ff) * anInt9015 + ((i_1154_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + (((i_1150_ & 0xff00) * anInt9015 + ((i_1154_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
								}
								is[i_1123_] = i_1154_;
							} else if (i == 2) {
								int i_1155_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1122_]);
								if (i_1155_ != 0) {
									int i_1156_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1155_ & 0xff]);
									int i_1157_ = ((i_1156_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1158_ = ((i_1156_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_1123_++] = ((i_1157_ | i_1158_) >>> 8) + anInt9022;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_630_ == 2) {
							if (i == 1) {
								int i_1159_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1122_]);
								if (i_1159_ != 0) {
									int i_1160_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1159_ & 0xff]);
									int i_1161_ = is[i_1123_];
									int i_1162_ = i_1160_ + i_1161_;
									int i_1163_ = ((i_1160_ & 0xff00ff) + (i_1161_ & 0xff00ff));
									i_1161_ = ((i_1163_ & 0x1000100) + (i_1162_ - i_1163_ & 0x10000));
									is[i_1123_] = (i_1162_ - i_1161_ | i_1161_ - (i_1161_ >>> 8));
								}
							} else if (i == 0) {
								int i_1164_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1122_]);
								if (i_1164_ != 0) {
									int i_1165_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1164_ & 0xff]);
									int i_1166_ = ((i_1165_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1167_ = ((i_1165_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1168_ = ((i_1165_ & 0xff) * anInt9019 & 0xff00);
									i_1165_ = (i_1166_ | i_1167_ | i_1168_) >>> 8;
									int i_1169_ = is[i_1123_];
									int i_1170_ = i_1165_ + i_1169_;
									int i_1171_ = ((i_1165_ & 0xff00ff) + (i_1169_ & 0xff00ff));
									i_1169_ = ((i_1171_ & 0x1000100) + (i_1170_ - i_1171_ & 0x10000));
									is[i_1123_] = (i_1170_ - i_1169_ | i_1169_ - (i_1169_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1172_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1122_]);
								int i_1173_ = (i_1172_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1172_]) : 0);
								int i_1174_ = anInt9014;
								int i_1175_ = i_1173_ + i_1174_;
								int i_1176_ = ((i_1173_ & 0xff00ff) + (i_1174_ & 0xff00ff));
								int i_1177_ = ((i_1176_ & 0x1000100) + (i_1175_ - i_1176_ & 0x10000));
								i_1177_ = i_1175_ - i_1177_ | i_1177_ - (i_1177_ >>> 8);
								if (i_1173_ == 0 && anInt9015 != 255) {
									i_1173_ = i_1177_;
									i_1177_ = is[i_1123_];
									i_1177_ = ((((i_1173_ & 0xff00ff) * anInt9015 + ((i_1177_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + (((i_1173_ & 0xff00) * anInt9015 + ((i_1177_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
								}
								is[i_1123_] = i_1177_;
							} else if (i == 2) {
								int i_1178_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1122_]);
								if (i_1178_ != 0) {
									int i_1179_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1178_ & 0xff]);
									int i_1180_ = ((i_1179_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1181_ = ((i_1179_ & 0xff00) * anInt9015 & 0xff0000);
									i_1179_ = (((i_1180_ | i_1181_) >>> 8) + anInt9022);
									int i_1182_ = is[i_1123_];
									int i_1183_ = i_1179_ + i_1182_;
									int i_1184_ = ((i_1179_ & 0xff00ff) + (i_1182_ & 0xff00ff));
									i_1182_ = ((i_1184_ & 0x1000100) + (i_1183_ - i_1184_ & 0x10000));
									is[i_1123_] = (i_1183_ - i_1182_ | i_1182_ - (i_1182_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1117_ += anInt9004;
						i_1118_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				for (int i_1185_ = anInt9001; i_1185_ < 0; i_1185_++) {
					int i_1186_ = anInt9003;
					int i_1187_ = anInt8988 + anInt9012;
					int i_1188_ = anInt9011 + anInt9013;
					int i_1189_ = anInt8999;
					if (i_1187_ < 0) {
						int i_1190_ = (anInt9004 - 1 - i_1187_) / anInt9004;
						i_1189_ += i_1190_;
						i_1187_ += anInt9004 * i_1190_;
						i_1188_ += anInt8991 * i_1190_;
						i_1186_ += i_1190_;
					}
					int i_1191_;
					if ((i_1191_ = (1 + i_1187_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1189_)
						i_1189_ = i_1191_;
					if (i_1188_ < 0) {
						i_1191_ = (anInt8991 - 1 - i_1188_) / anInt8991;
						i_1189_ += i_1191_;
						i_1187_ += anInt9004 * i_1191_;
						i_1188_ += anInt8991 * i_1191_;
						i_1186_ += i_1191_;
					}
					if ((i_1191_ = (1 + i_1188_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_1189_)
						i_1189_ = i_1191_;
					for (/**/; i_1189_ < 0; i_1189_++) {
						int i_1192_ = (((i_1188_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_1187_ >> 12));
						int i_1193_ = i_1186_++;
						if (i_630_ == 0) {
							if (i == 1)
								is[i_1193_] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1192_]) & 0xff]);
							else if (i == 0) {
								int i_1194_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1192_]) & 0xff]);
								int i_1195_ = ((i_1194_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_1196_ = ((i_1194_ & 0xff00) * anInt9018 & 0xff0000);
								int i_1197_ = (i_1194_ & 0xff) * anInt9019 & 0xff00;
								is[i_1193_] = (i_1195_ | i_1196_ | i_1197_) >>> 8;
							} else if (i == 3) {
								int i_1198_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1192_]) & 0xff]);
								int i_1199_ = anInt9014;
								int i_1200_ = i_1198_ + i_1199_;
								int i_1201_ = ((i_1198_ & 0xff00ff) + (i_1199_ & 0xff00ff));
								int i_1202_ = ((i_1201_ & 0x1000100) + (i_1200_ - i_1201_ & 0x10000));
								is[i_1193_] = i_1200_ - i_1202_ | i_1202_ - (i_1202_ >>> 8);
							} else if (i == 2) {
								int i_1203_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1192_]) & 0xff]);
								int i_1204_ = ((i_1203_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_1205_ = ((i_1203_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_1193_] = ((i_1204_ | i_1205_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_630_ == 1) {
							if (i == 1) {
								int i_1206_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1192_]);
								if (i_1206_ != 0)
									is[i_1193_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1206_ & 0xff]);
							} else if (i == 0) {
								int i_1207_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1192_]);
								if (i_1207_ != 0) {
									int i_1208_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1207_ & 0xff]);
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_1209_ = anInt9014 >>> 24;
										int i_1210_ = 256 - i_1209_;
										int i_1211_ = is[i_1193_];
										is[i_1193_] = ((((i_1208_ & 0xff00ff) * i_1209_ + ((i_1211_ & 0xff00ff) * i_1210_)) & ~0xff00ff) + (((i_1208_ & 0xff00) * i_1209_ + ((i_1211_ & 0xff00) * i_1210_)) & 0xff0000)) >> 8;
									} else if (anInt9015 != 255) {
										int i_1212_ = ((i_1208_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1213_ = ((i_1208_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1214_ = ((i_1208_ & 0xff) * anInt9019 & 0xff00);
										i_1208_ = (i_1212_ | i_1213_ | i_1214_) >>> 8;
										int i_1215_ = is[i_1193_];
										is[i_1193_] = (((((i_1208_ & 0xff00ff) * anInt9015) + ((i_1215_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1208_ & 0xff00) * anInt9015) + ((i_1215_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									} else {
										int i_1216_ = ((i_1208_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1217_ = ((i_1208_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1218_ = ((i_1208_ & 0xff) * anInt9019 & 0xff00);
										is[i_1193_] = (i_1216_ | i_1217_ | i_1218_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1219_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1192_]);
								int i_1220_ = (i_1219_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1219_]) : 0);
								int i_1221_ = anInt9014;
								int i_1222_ = i_1220_ + i_1221_;
								int i_1223_ = ((i_1220_ & 0xff00ff) + (i_1221_ & 0xff00ff));
								int i_1224_ = ((i_1223_ & 0x1000100) + (i_1222_ - i_1223_ & 0x10000));
								i_1224_ = i_1222_ - i_1224_ | i_1224_ - (i_1224_ >>> 8);
								if (i_1220_ == 0 && anInt9015 != 255) {
									i_1220_ = i_1224_;
									i_1224_ = is[i_1193_];
									i_1224_ = ((((i_1220_ & 0xff00ff) * anInt9015 + ((i_1224_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + (((i_1220_ & 0xff00) * anInt9015 + ((i_1224_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
								}
								is[i_1193_] = i_1224_;
							} else if (i == 2) {
								int i_1225_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1192_]);
								if (i_1225_ != 0) {
									int i_1226_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1225_ & 0xff]);
									int i_1227_ = ((i_1226_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1228_ = ((i_1226_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_1193_++] = ((i_1227_ | i_1228_) >>> 8) + anInt9022;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_630_ == 2) {
							if (i == 1) {
								int i_1229_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1192_]);
								if (i_1229_ != 0) {
									int i_1230_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1229_ & 0xff]);
									int i_1231_ = is[i_1193_];
									int i_1232_ = i_1230_ + i_1231_;
									int i_1233_ = ((i_1230_ & 0xff00ff) + (i_1231_ & 0xff00ff));
									i_1231_ = ((i_1233_ & 0x1000100) + (i_1232_ - i_1233_ & 0x10000));
									is[i_1193_] = (i_1232_ - i_1231_ | i_1231_ - (i_1231_ >>> 8));
								}
							} else if (i == 0) {
								int i_1234_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1192_]);
								if (i_1234_ != 0) {
									int i_1235_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1234_ & 0xff]);
									int i_1236_ = ((i_1235_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1237_ = ((i_1235_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1238_ = ((i_1235_ & 0xff) * anInt9019 & 0xff00);
									i_1235_ = (i_1236_ | i_1237_ | i_1238_) >>> 8;
									int i_1239_ = is[i_1193_];
									int i_1240_ = i_1235_ + i_1239_;
									int i_1241_ = ((i_1235_ & 0xff00ff) + (i_1239_ & 0xff00ff));
									i_1239_ = ((i_1241_ & 0x1000100) + (i_1240_ - i_1241_ & 0x10000));
									is[i_1193_] = (i_1240_ - i_1239_ | i_1239_ - (i_1239_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1242_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1192_]);
								int i_1243_ = (i_1242_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1242_]) : 0);
								int i_1244_ = anInt9014;
								int i_1245_ = i_1243_ + i_1244_;
								int i_1246_ = ((i_1243_ & 0xff00ff) + (i_1244_ & 0xff00ff));
								int i_1247_ = ((i_1246_ & 0x1000100) + (i_1245_ - i_1246_ & 0x10000));
								i_1247_ = i_1245_ - i_1247_ | i_1247_ - (i_1247_ >>> 8);
								if (i_1243_ == 0 && anInt9015 != 255) {
									i_1243_ = i_1247_;
									i_1247_ = is[i_1193_];
									i_1247_ = ((((i_1243_ & 0xff00ff) * anInt9015 + ((i_1247_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + (((i_1243_ & 0xff00) * anInt9015 + ((i_1247_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
								}
								is[i_1193_] = i_1247_;
							} else if (i == 2) {
								int i_1248_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1192_]);
								if (i_1248_ != 0) {
									int i_1249_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1248_ & 0xff]);
									int i_1250_ = ((i_1249_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1251_ = ((i_1249_ & 0xff00) * anInt9015 & 0xff0000);
									i_1249_ = (((i_1250_ | i_1251_) >>> 8) + anInt9022);
									int i_1252_ = is[i_1193_];
									int i_1253_ = i_1249_ + i_1252_;
									int i_1254_ = ((i_1249_ & 0xff00ff) + (i_1252_ & 0xff00ff));
									i_1252_ = ((i_1254_ & 0x1000100) + (i_1253_ - i_1254_ & 0x10000));
									is[i_1193_] = (i_1253_ - i_1252_ | i_1252_ - (i_1252_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1187_ += anInt9004;
						i_1188_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	public Interface8_Impl1_Impl1 method646() {
		throw new IllegalStateException();
	}

	public void method631(int i, int i_1255_, int i_1256_, int i_1257_, int i_1258_) {
		if (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			int i_1259_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			i += ((Class57_Sub1_Sub3) this).anInt8990;
			i_1255_ += ((Class57_Sub1_Sub3) this).anInt9000;
			int i_1260_ = i_1255_ * i_1259_ + i;
			int i_1261_ = 0;
			int i_1262_ = ((Class57_Sub1_Sub3) this).anInt8989;
			int i_1263_ = ((Class57_Sub1_Sub3) this).anInt9010;
			int i_1264_ = i_1259_ - i_1263_;
			int i_1265_ = 0;
			if (i_1255_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_1266_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_1255_);
				i_1262_ -= i_1266_;
				i_1255_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_1261_ += i_1266_ * i_1263_;
				i_1260_ += i_1266_ * i_1259_;
			}
			if (i_1255_ + i_1262_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_1262_ -= (i_1255_ + i_1262_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_1267_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_1263_ -= i_1267_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_1261_ += i_1267_;
				i_1260_ += i_1267_;
				i_1265_ += i_1267_;
				i_1264_ += i_1267_;
			}
			if (i + i_1263_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_1268_ = (i + i_1263_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_1263_ -= i_1268_;
				i_1265_ += i_1268_;
				i_1264_ += i_1268_;
			}
			if (i_1263_ > 0 && i_1262_ > 0) {
				if (i_1258_ == 0) {
					if (i_1256_ == 1) {
						for (int i_1269_ = -i_1262_; i_1269_ < 0; i_1269_++) {
							int i_1270_ = i_1260_ + i_1263_ - 3;
							while (i_1260_ < i_1270_) {
								is[i_1260_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]) & 0xff]);
								is[i_1260_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]) & 0xff]);
								is[i_1260_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]) & 0xff]);
								is[i_1260_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]) & 0xff]);
							}
							i_1270_ += 3;
							while (i_1260_ < i_1270_)
								is[i_1260_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]) & 0xff]);
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else if (i_1256_ == 0) {
						int i_1271_ = (i_1257_ & 0xff0000) >> 16;
						int i_1272_ = (i_1257_ & 0xff00) >> 8;
						int i_1273_ = i_1257_ & 0xff;
						for (int i_1274_ = -i_1262_; i_1274_ < 0; i_1274_++) {
							for (int i_1275_ = -i_1263_; i_1275_ < 0; i_1275_++) {
								int i_1276_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]) & 0xff]);
								int i_1277_ = ((i_1276_ & 0xff0000) * i_1271_ & ~0xffffff);
								int i_1278_ = (i_1276_ & 0xff00) * i_1272_ & 0xff0000;
								int i_1279_ = (i_1276_ & 0xff) * i_1273_ & 0xff00;
								is[i_1260_++] = (i_1277_ | i_1278_ | i_1279_) >>> 8;
							}
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else if (i_1256_ == 3) {
						for (int i_1280_ = -i_1262_; i_1280_ < 0; i_1280_++) {
							for (int i_1281_ = -i_1263_; i_1281_ < 0; i_1281_++) {
								int i_1282_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]) & 0xff]);
								int i_1283_ = i_1282_ + i_1257_;
								int i_1284_ = ((i_1282_ & 0xff00ff) + (i_1257_ & 0xff00ff));
								int i_1285_ = ((i_1284_ & 0x1000100) + (i_1283_ - i_1284_ & 0x10000));
								is[i_1260_++] = i_1283_ - i_1285_ | i_1285_ - (i_1285_ >>> 8);
							}
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else if (i_1256_ == 2) {
						int i_1286_ = i_1257_ >>> 24;
						int i_1287_ = 256 - i_1286_;
						int i_1288_ = (i_1257_ & 0xff00ff) * i_1287_ & ~0xff00ff;
						int i_1289_ = (i_1257_ & 0xff00) * i_1287_ & 0xff0000;
						i_1257_ = (i_1288_ | i_1289_) >>> 8;
						for (int i_1290_ = -i_1262_; i_1290_ < 0; i_1290_++) {
							for (int i_1291_ = -i_1263_; i_1291_ < 0; i_1291_++) {
								int i_1292_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]) & 0xff]);
								i_1288_ = ((i_1292_ & 0xff00ff) * i_1286_ & ~0xff00ff);
								i_1289_ = (i_1292_ & 0xff00) * i_1286_ & 0xff0000;
								is[i_1260_++] = ((i_1288_ | i_1289_) >>> 8) + i_1257_;
							}
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1258_ == 1) {
					if (i_1256_ == 1) {
						for (int i_1293_ = -i_1262_; i_1293_ < 0; i_1293_++) {
							for (int i_1294_ = -i_1263_; i_1294_ < 0; i_1294_++) {
								int i_1295_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]);
								if (i_1295_ != 0) {
									int i_1296_ = ((((Class57_Sub1_Sub3) this).anIntArray9968[i_1295_ & 0xff]) | ~0xffffff);
									int i_1297_ = 255;
									int i_1298_ = 0;
									int i_1299_ = is[i_1260_];
									is[i_1260_++] = (((((i_1296_ & 0xff00ff) * i_1297_ + (i_1299_ & 0xff00ff) * i_1298_) & ~0xff00ff) >> 8) + (((((i_1296_ & ~0xff00ff) >>> 8) * i_1297_) + (((i_1299_ & ~0xff00ff) >>> 8) * i_1298_)) & ~0xff00ff));
								} else
									i_1260_++;
							}
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else if (i_1256_ == 0) {
						if ((i_1257_ & 0xffffff) == 16777215) {
							int i_1300_ = i_1257_ >>> 24;
							int i_1301_ = 256 - i_1300_;
							for (int i_1302_ = -i_1262_; i_1302_ < 0; i_1302_++) {
								for (int i_1303_ = -i_1263_; i_1303_ < 0; i_1303_++) {
									int i_1304_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]);
									if (i_1304_ != 0) {
										int i_1305_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1304_ & 0xff]);
										int i_1306_ = is[i_1260_];
										is[i_1260_++] = ((((i_1305_ & 0xff00ff) * i_1300_ + ((i_1306_ & 0xff00ff) * i_1301_)) & ~0xff00ff) + (((i_1305_ & 0xff00) * i_1300_ + ((i_1306_ & 0xff00) * i_1301_)) & 0xff0000)) >> 8;
									} else
										i_1260_++;
								}
								i_1260_ += i_1264_;
								i_1261_ += i_1265_;
							}
						} else {
							int i_1307_ = (i_1257_ & 0xff0000) >> 16;
							int i_1308_ = (i_1257_ & 0xff00) >> 8;
							int i_1309_ = i_1257_ & 0xff;
							int i_1310_ = i_1257_ >>> 24;
							int i_1311_ = 256 - i_1310_;
							for (int i_1312_ = -i_1262_; i_1312_ < 0; i_1312_++) {
								for (int i_1313_ = -i_1263_; i_1313_ < 0; i_1313_++) {
									int i_1314_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]);
									if (i_1314_ != 0) {
										int i_1315_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1314_ & 0xff]);
										if (i_1310_ != 255) {
											int i_1316_ = (((i_1315_ & 0xff0000) * i_1307_) & ~0xffffff);
											int i_1317_ = ((i_1315_ & 0xff00) * i_1308_ & 0xff0000);
											int i_1318_ = ((i_1315_ & 0xff) * i_1309_ & 0xff00);
											i_1315_ = (i_1316_ | i_1317_ | i_1318_) >>> 8;
											int i_1319_ = is[i_1260_];
											is[i_1260_++] = (((((i_1315_ & 0xff00ff) * i_1310_) + ((i_1319_ & 0xff00ff) * i_1311_)) & ~0xff00ff) + ((((i_1315_ & 0xff00) * i_1310_) + ((i_1319_ & 0xff00) * i_1311_)) & 0xff0000)) >> 8;
										} else {
											int i_1320_ = (((i_1315_ & 0xff0000) * i_1307_) & ~0xffffff);
											int i_1321_ = ((i_1315_ & 0xff00) * i_1308_ & 0xff0000);
											int i_1322_ = ((i_1315_ & 0xff) * i_1309_ & 0xff00);
											is[i_1260_++] = (i_1320_ | i_1321_ | i_1322_) >>> 8;
										}
									} else
										i_1260_++;
								}
								i_1260_ += i_1264_;
								i_1261_ += i_1265_;
							}
						}
					} else if (i_1256_ == 3) {
						int i_1323_ = i_1257_ >>> 24;
						int i_1324_ = 256 - i_1323_;
						for (int i_1325_ = -i_1262_; i_1325_ < 0; i_1325_++) {
							for (int i_1326_ = -i_1263_; i_1326_ < 0; i_1326_++) {
								byte i_1327_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]);
								int i_1328_ = (i_1327_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1327_]) : 0);
								int i_1329_ = i_1328_ + i_1257_;
								int i_1330_ = ((i_1328_ & 0xff00ff) + (i_1257_ & 0xff00ff));
								int i_1331_ = ((i_1330_ & 0x1000100) + (i_1329_ - i_1330_ & 0x10000));
								i_1331_ = i_1329_ - i_1331_ | i_1331_ - (i_1331_ >>> 8);
								if (i_1328_ == 0 && i_1323_ != 255) {
									i_1328_ = i_1331_;
									i_1331_ = is[i_1260_];
									i_1331_ = ((((i_1328_ & 0xff00ff) * i_1323_ + (i_1331_ & 0xff00ff) * i_1324_) & ~0xff00ff) + (((i_1328_ & 0xff00) * i_1323_ + (i_1331_ & 0xff00) * i_1324_) & 0xff0000)) >> 8;
								}
								is[i_1260_++] = i_1331_;
							}
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else if (i_1256_ == 2) {
						int i_1332_ = i_1257_ >>> 24;
						int i_1333_ = 256 - i_1332_;
						int i_1334_ = (i_1257_ & 0xff00ff) * i_1333_ & ~0xff00ff;
						int i_1335_ = (i_1257_ & 0xff00) * i_1333_ & 0xff0000;
						i_1257_ = (i_1334_ | i_1335_) >>> 8;
						for (int i_1336_ = -i_1262_; i_1336_ < 0; i_1336_++) {
							for (int i_1337_ = -i_1263_; i_1337_ < 0; i_1337_++) {
								int i_1338_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]);
								if (i_1338_ != 0) {
									int i_1339_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1338_ & 0xff]);
									i_1334_ = ((i_1339_ & 0xff00ff) * i_1332_ & ~0xff00ff);
									i_1335_ = ((i_1339_ & 0xff00) * i_1332_ & 0xff0000);
									is[i_1260_++] = ((i_1334_ | i_1335_) >>> 8) + i_1257_;
								} else
									i_1260_++;
							}
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1258_ == 2) {
					if (i_1256_ == 1) {
						for (int i_1340_ = -i_1262_; i_1340_ < 0; i_1340_++) {
							for (int i_1341_ = -i_1263_; i_1341_ < 0; i_1341_++) {
								int i_1342_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]);
								if (i_1342_ != 0) {
									int i_1343_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1342_ & 0xff]);
									int i_1344_ = is[i_1260_];
									int i_1345_ = i_1343_ + i_1344_;
									int i_1346_ = ((i_1343_ & 0xff00ff) + (i_1344_ & 0xff00ff));
									i_1344_ = ((i_1346_ & 0x1000100) + (i_1345_ - i_1346_ & 0x10000));
									is[i_1260_++] = (i_1345_ - i_1344_ | i_1344_ - (i_1344_ >>> 8));
								} else
									i_1260_++;
							}
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else if (i_1256_ == 0) {
						int i_1347_ = (i_1257_ & 0xff0000) >> 16;
						int i_1348_ = (i_1257_ & 0xff00) >> 8;
						int i_1349_ = i_1257_ & 0xff;
						for (int i_1350_ = -i_1262_; i_1350_ < 0; i_1350_++) {
							for (int i_1351_ = -i_1263_; i_1351_ < 0; i_1351_++) {
								int i_1352_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]);
								if (i_1352_ != 0) {
									int i_1353_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1352_ & 0xff]);
									int i_1354_ = ((i_1353_ & 0xff0000) * i_1347_ & ~0xffffff);
									int i_1355_ = ((i_1353_ & 0xff00) * i_1348_ & 0xff0000);
									int i_1356_ = (i_1353_ & 0xff) * i_1349_ & 0xff00;
									i_1353_ = (i_1354_ | i_1355_ | i_1356_) >>> 8;
									int i_1357_ = is[i_1260_];
									int i_1358_ = i_1353_ + i_1357_;
									int i_1359_ = ((i_1353_ & 0xff00ff) + (i_1357_ & 0xff00ff));
									i_1357_ = ((i_1359_ & 0x1000100) + (i_1358_ - i_1359_ & 0x10000));
									is[i_1260_++] = (i_1358_ - i_1357_ | i_1357_ - (i_1357_ >>> 8));
								} else
									i_1260_++;
							}
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else if (i_1256_ == 3) {
						for (int i_1360_ = -i_1262_; i_1360_ < 0; i_1360_++) {
							for (int i_1361_ = -i_1263_; i_1361_ < 0; i_1361_++) {
								byte i_1362_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]);
								int i_1363_ = (i_1362_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1362_]) : 0);
								int i_1364_ = i_1363_ + i_1257_;
								int i_1365_ = ((i_1363_ & 0xff00ff) + (i_1257_ & 0xff00ff));
								int i_1366_ = ((i_1365_ & 0x1000100) + (i_1364_ - i_1365_ & 0x10000));
								i_1363_ = i_1364_ - i_1366_ | i_1366_ - (i_1366_ >>> 8);
								i_1366_ = is[i_1260_];
								i_1364_ = i_1363_ + i_1366_;
								i_1365_ = (i_1363_ & 0xff00ff) + (i_1366_ & 0xff00ff);
								i_1366_ = ((i_1365_ & 0x1000100) + (i_1364_ - i_1365_ & 0x10000));
								is[i_1260_++] = i_1364_ - i_1366_ | i_1366_ - (i_1366_ >>> 8);
							}
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else if (i_1256_ == 2) {
						int i_1367_ = i_1257_ >>> 24;
						int i_1368_ = 256 - i_1367_;
						int i_1369_ = (i_1257_ & 0xff00ff) * i_1368_ & ~0xff00ff;
						int i_1370_ = (i_1257_ & 0xff00) * i_1368_ & 0xff0000;
						i_1257_ = (i_1369_ | i_1370_) >>> 8;
						for (int i_1371_ = -i_1262_; i_1371_ < 0; i_1371_++) {
							for (int i_1372_ = -i_1263_; i_1372_ < 0; i_1372_++) {
								int i_1373_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1261_++]);
								if (i_1373_ != 0) {
									int i_1374_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1373_ & 0xff]);
									i_1369_ = ((i_1374_ & 0xff00ff) * i_1367_ & ~0xff00ff);
									i_1370_ = ((i_1374_ & 0xff00) * i_1367_ & 0xff0000);
									i_1374_ = (((i_1369_ | i_1370_) >>> 8) + i_1257_);
									int i_1375_ = is[i_1260_];
									int i_1376_ = i_1374_ + i_1375_;
									int i_1377_ = ((i_1374_ & 0xff00ff) + (i_1375_ & 0xff00ff));
									i_1375_ = ((i_1377_ & 0x1000100) + (i_1376_ - i_1377_ & 0x10000));
									is[i_1260_++] = (i_1376_ - i_1375_ | i_1375_ - (i_1375_ >>> 8));
								} else
									i_1260_++;
							}
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method632(int i, int i_1378_, int i_1379_) {
		throw new IllegalStateException();
	}

	void method678(boolean bool, boolean bool_1380_, boolean bool_1381_, int i, int i_1382_, float f, int i_1383_, int i_1384_, int i_1385_, int i_1386_, int i_1387_, int i_1388_, boolean bool_1389_) {
		if (i_1383_ > 0 && i_1384_ > 0 && (bool || bool_1380_)) {
			int i_1390_ = 0;
			int i_1391_ = 0;
			int i_1392_ = (((Class57_Sub1_Sub3) this).anInt8990 + ((Class57_Sub1_Sub3) this).anInt9010 + ((Class57_Sub1_Sub3) this).anInt8997);
			int i_1393_ = (((Class57_Sub1_Sub3) this).anInt9000 + ((Class57_Sub1_Sub3) this).anInt8989 + ((Class57_Sub1_Sub3) this).anInt8993);
			int i_1394_ = (i_1392_ << 16) / i_1383_;
			int i_1395_ = (i_1393_ << 16) / i_1384_;
			if (((Class57_Sub1_Sub3) this).anInt8990 > 0) {
				int i_1396_ = (((((Class57_Sub1_Sub3) this).anInt8990 << 16) + i_1394_ - 1) / i_1394_);
				i += i_1396_;
				i_1390_ += (i_1396_ * i_1394_ - (((Class57_Sub1_Sub3) this).anInt8990 << 16));
			}
			if (((Class57_Sub1_Sub3) this).anInt9000 > 0) {
				int i_1397_ = (((((Class57_Sub1_Sub3) this).anInt9000 << 16) + i_1395_ - 1) / i_1395_);
				i_1382_ += i_1397_;
				i_1391_ += (i_1397_ * i_1395_ - (((Class57_Sub1_Sub3) this).anInt9000 << 16));
			}
			if (((Class57_Sub1_Sub3) this).anInt9010 < i_1392_)
				i_1383_ = ((((Class57_Sub1_Sub3) this).anInt9010 << 16) - i_1390_ + i_1394_ - 1) / i_1394_;
			if (((Class57_Sub1_Sub3) this).anInt8989 < i_1393_)
				i_1384_ = ((((Class57_Sub1_Sub3) this).anInt8989 << 16) - i_1391_ + i_1395_ - 1) / i_1395_;
			int i_1398_ = i + i_1382_ * ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971) * 692106883);
			int i_1399_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883) - i_1383_);
			if (i_1382_ + i_1384_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_1384_ -= (i_1382_ + i_1384_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i_1382_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_1400_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_1382_);
				i_1384_ -= i_1400_;
				i_1398_ += i_1400_ * ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971) * 692106883);
				i_1391_ += i_1395_ * i_1400_;
			}
			if (i + i_1383_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_1401_ = (i + i_1383_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_1383_ -= i_1401_;
				i_1399_ += i_1401_;
			}
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_1402_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_1383_ -= i_1402_;
				i_1398_ += i_1402_;
				i_1390_ += i_1394_ * i_1402_;
				i_1399_ += i_1402_;
			}
			float[] fs = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).aFloatArray7973);
			int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
			if (i_1387_ == 0) {
				if (i_1385_ == 1) {
					int i_1403_ = i_1390_;
					for (int i_1404_ = -i_1384_; i_1404_ < 0; i_1404_++) {
						int i_1405_ = ((i_1391_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_1406_ = -i_1383_; i_1406_ < 0; i_1406_++) {
							if (!bool_1380_ || f < fs[i_1398_]) {
								if (bool)
									is[i_1398_] = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[(i_1390_ >> 16) + i_1405_]) & 0xff)]);
								if (bool_1380_ && bool_1389_)
									fs[i_1398_] = f;
							}
							i_1390_ += i_1394_;
							i_1398_++;
						}
						i_1391_ += i_1395_;
						i_1390_ = i_1403_;
						i_1398_ += i_1399_;
					}
				} else if (i_1385_ == 0) {
					int i_1407_ = (i_1386_ & 0xff0000) >> 16;
					int i_1408_ = (i_1386_ & 0xff00) >> 8;
					int i_1409_ = i_1386_ & 0xff;
					int i_1410_ = i_1390_;
					for (int i_1411_ = -i_1384_; i_1411_ < 0; i_1411_++) {
						int i_1412_ = ((i_1391_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_1413_ = -i_1383_; i_1413_ < 0; i_1413_++) {
							if (!bool_1380_ || f < fs[i_1398_]) {
								if (bool) {
									int i_1414_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[(i_1390_ >> 16) + i_1412_]) & 0xff)]);
									int i_1415_ = ((i_1414_ & 0xff0000) * i_1407_ & ~0xffffff);
									int i_1416_ = ((i_1414_ & 0xff00) * i_1408_ & 0xff0000);
									int i_1417_ = (i_1414_ & 0xff) * i_1409_ & 0xff00;
									is[i_1398_] = (i_1415_ | i_1416_ | i_1417_) >>> 8;
								}
								if (bool_1380_ && bool_1389_)
									fs[i_1398_] = f;
							}
							i_1390_ += i_1394_;
							i_1398_++;
						}
						i_1391_ += i_1395_;
						i_1390_ = i_1410_;
						i_1398_ += i_1399_;
					}
				} else if (i_1385_ == 3) {
					int i_1418_ = i_1390_;
					for (int i_1419_ = -i_1384_; i_1419_ < 0; i_1419_++) {
						int i_1420_ = ((i_1391_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_1421_ = -i_1383_; i_1421_ < 0; i_1421_++) {
							if (!bool_1380_ || f < fs[i_1398_]) {
								if (bool) {
									byte i_1422_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1390_ >> 16) + i_1420_]);
									int i_1423_ = (i_1422_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1422_]) : 0);
									int i_1424_ = i_1423_ + i_1386_;
									int i_1425_ = ((i_1423_ & 0xff00ff) + (i_1386_ & 0xff00ff));
									int i_1426_ = ((i_1425_ & 0x1000100) + (i_1424_ - i_1425_ & 0x10000));
									is[i_1398_] = (i_1424_ - i_1426_ | i_1426_ - (i_1426_ >>> 8));
								}
								if (bool_1380_ && bool_1389_)
									fs[i_1398_] = f;
							}
							i_1390_ += i_1394_;
							i_1398_++;
						}
						i_1391_ += i_1395_;
						i_1390_ = i_1418_;
						i_1398_ += i_1399_;
					}
				} else if (i_1385_ == 2) {
					int i_1427_ = i_1386_ >>> 24;
					int i_1428_ = 256 - i_1427_;
					int i_1429_ = (i_1386_ & 0xff00ff) * i_1428_ & ~0xff00ff;
					int i_1430_ = (i_1386_ & 0xff00) * i_1428_ & 0xff0000;
					i_1386_ = (i_1429_ | i_1430_) >>> 8;
					int i_1431_ = i_1390_;
					for (int i_1432_ = -i_1384_; i_1432_ < 0; i_1432_++) {
						int i_1433_ = ((i_1391_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_1434_ = -i_1383_; i_1434_ < 0; i_1434_++) {
							if (!bool_1380_ || f < fs[i_1398_]) {
								if (bool) {
									int i_1435_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[(i_1390_ >> 16) + i_1433_]) & 0xff)]);
									i_1429_ = ((i_1435_ & 0xff00ff) * i_1427_ & ~0xff00ff);
									i_1430_ = ((i_1435_ & 0xff00) * i_1427_ & 0xff0000);
									is[i_1398_] = (((i_1429_ | i_1430_) >>> 8) + i_1386_);
								}
								if (bool_1380_ && bool_1389_)
									fs[i_1398_] = f;
							}
							i_1390_ += i_1394_;
							i_1398_++;
						}
						i_1391_ += i_1395_;
						i_1390_ = i_1431_;
						i_1398_ += i_1399_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1387_ == 1) {
				if (i_1385_ == 1) {
					int i_1436_ = i_1390_;
					for (int i_1437_ = -i_1384_; i_1437_ < 0; i_1437_++) {
						int i_1438_ = ((i_1391_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_1439_ = -i_1383_; i_1439_ < 0; i_1439_++) {
							if (!bool_1380_ || f < fs[i_1398_]) {
								int i_1440_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1390_ >> 16) + i_1438_]);
								if (i_1440_ != 0) {
									if (bool)
										is[i_1398_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1440_ & 0xff]);
									if (bool_1380_ && bool_1389_)
										fs[i_1398_] = f;
								}
							}
							i_1390_ += i_1394_;
							i_1398_++;
						}
						i_1391_ += i_1395_;
						i_1390_ = i_1436_;
						i_1398_ += i_1399_;
					}
				} else if (i_1385_ == 0) {
					int i_1441_ = i_1390_;
					if ((i_1386_ & 0xffffff) == 16777215) {
						int i_1442_ = i_1386_ >>> 24;
						int i_1443_ = 256 - i_1442_;
						for (int i_1444_ = -i_1384_; i_1444_ < 0; i_1444_++) {
							int i_1445_ = ((i_1391_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_1446_ = -i_1383_; i_1446_ < 0; i_1446_++) {
								if (!bool_1380_ || f < fs[i_1398_]) {
									int i_1447_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1390_ >> 16) + i_1445_]);
									if (i_1447_ != 0) {
										if (bool) {
											int i_1448_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1447_ & 0xff]);
											int i_1449_ = is[i_1398_];
											is[i_1398_] = (((((i_1448_ & 0xff00ff) * i_1442_) + ((i_1449_ & 0xff00ff) * i_1443_)) & ~0xff00ff) + ((((i_1448_ & 0xff00) * i_1442_) + ((i_1449_ & 0xff00) * i_1443_)) & 0xff0000)) >> 8;
										}
										if (bool_1380_ && bool_1389_)
											fs[i_1398_] = f;
									}
								}
								i_1390_ += i_1394_;
								i_1398_++;
							}
							i_1391_ += i_1395_;
							i_1390_ = i_1441_;
							i_1398_ += i_1399_;
						}
					} else {
						int i_1450_ = (i_1386_ & 0xff0000) >> 16;
						int i_1451_ = (i_1386_ & 0xff00) >> 8;
						int i_1452_ = i_1386_ & 0xff;
						int i_1453_ = i_1386_ >>> 24;
						int i_1454_ = 256 - i_1453_;
						for (int i_1455_ = -i_1384_; i_1455_ < 0; i_1455_++) {
							int i_1456_ = ((i_1391_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_1457_ = -i_1383_; i_1457_ < 0; i_1457_++) {
								if (!bool_1380_ || f < fs[i_1398_]) {
									int i_1458_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1390_ >> 16) + i_1456_]);
									if (i_1458_ != 0) {
										int i_1459_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1458_ & 0xff]);
										if (i_1453_ != 255) {
											if (bool) {
												int i_1460_ = (((i_1459_ & 0xff0000) * i_1450_) & ~0xffffff);
												int i_1461_ = (((i_1459_ & 0xff00) * i_1451_) & 0xff0000);
												int i_1462_ = (((i_1459_ & 0xff) * i_1452_) & 0xff00);
												i_1459_ = (i_1460_ | i_1461_ | i_1462_) >>> 8;
												int i_1463_ = is[i_1398_];
												is[i_1398_] = (((((i_1459_ & 0xff00ff) * i_1453_) + ((i_1463_ & 0xff00ff) * i_1454_)) & ~0xff00ff) + ((((i_1459_ & 0xff00) * i_1453_) + ((i_1463_ & 0xff00) * i_1454_)) & 0xff0000)) >> 8;
											}
											if (bool_1380_ && bool_1389_)
												fs[i_1398_] = f;
										} else {
											if (bool) {
												int i_1464_ = (((i_1459_ & 0xff0000) * i_1450_) & ~0xffffff);
												int i_1465_ = (((i_1459_ & 0xff00) * i_1451_) & 0xff0000);
												int i_1466_ = (((i_1459_ & 0xff) * i_1452_) & 0xff00);
												is[i_1398_] = (i_1464_ | i_1465_ | i_1466_) >>> 8;
											}
											if (bool_1380_ && bool_1389_)
												fs[i_1398_] = f;
										}
									}
								}
								i_1390_ += i_1394_;
								i_1398_++;
							}
							i_1391_ += i_1395_;
							i_1390_ = i_1441_;
							i_1398_ += i_1399_;
						}
					}
				} else if (i_1385_ == 3) {
					int i_1467_ = i_1390_;
					int i_1468_ = i_1386_ >>> 24;
					int i_1469_ = 256 - i_1468_;
					for (int i_1470_ = -i_1384_; i_1470_ < 0; i_1470_++) {
						int i_1471_ = ((i_1391_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_1472_ = -i_1383_; i_1472_ < 0; i_1472_++) {
							if (!bool_1380_ || f < fs[i_1398_]) {
								if (bool) {
									byte i_1473_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1390_ >> 16) + i_1471_]);
									int i_1474_ = (i_1473_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1473_]) : 0);
									int i_1475_ = i_1474_ + i_1386_;
									int i_1476_ = ((i_1474_ & 0xff00ff) + (i_1386_ & 0xff00ff));
									int i_1477_ = ((i_1476_ & 0x1000100) + (i_1475_ - i_1476_ & 0x10000));
									i_1477_ = (i_1475_ - i_1477_ | i_1477_ - (i_1477_ >>> 8));
									if (i_1474_ == 0 && i_1468_ != 255) {
										i_1474_ = i_1477_;
										i_1477_ = is[i_1398_];
										i_1477_ = ((((i_1474_ & 0xff00ff) * i_1468_ + ((i_1477_ & 0xff00ff) * i_1469_)) & ~0xff00ff) + (((i_1474_ & 0xff00) * i_1468_ + ((i_1477_ & 0xff00) * i_1469_)) & 0xff0000)) >> 8;
									}
									is[i_1398_] = i_1477_;
								}
								if (bool_1380_ && bool_1389_)
									fs[i_1398_] = f;
							}
							i_1390_ += i_1394_;
							i_1398_++;
						}
						i_1391_ += i_1395_;
						i_1390_ = i_1467_;
						i_1398_ += i_1399_;
					}
				} else if (i_1385_ == 2) {
					int i_1478_ = i_1386_ >>> 24;
					int i_1479_ = 256 - i_1478_;
					int i_1480_ = (i_1386_ & 0xff00ff) * i_1479_ & ~0xff00ff;
					int i_1481_ = (i_1386_ & 0xff00) * i_1479_ & 0xff0000;
					i_1386_ = (i_1480_ | i_1481_) >>> 8;
					int i_1482_ = i_1390_;
					for (int i_1483_ = -i_1384_; i_1483_ < 0; i_1483_++) {
						int i_1484_ = ((i_1391_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_1485_ = -i_1383_; i_1485_ < 0; i_1485_++) {
							if (!bool_1380_ || f < fs[i_1398_]) {
								int i_1486_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1390_ >> 16) + i_1484_]);
								if (i_1486_ != 0) {
									if (bool) {
										int i_1487_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1486_ & 0xff]);
										i_1480_ = ((i_1487_ & 0xff00ff) * i_1478_ & ~0xff00ff);
										i_1481_ = ((i_1487_ & 0xff00) * i_1478_ & 0xff0000);
										is[i_1398_] = ((i_1480_ | i_1481_) >>> 8) + i_1386_;
									}
									if (bool_1380_ && bool_1389_)
										fs[i_1398_] = f;
								}
							}
							i_1390_ += i_1394_;
							i_1398_++;
						}
						i_1391_ += i_1395_;
						i_1390_ = i_1482_;
						i_1398_ += i_1399_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1387_ == 2) {
				if (i_1385_ == 1) {
					int i_1488_ = i_1390_;
					for (int i_1489_ = -i_1384_; i_1489_ < 0; i_1489_++) {
						int i_1490_ = ((i_1391_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_1491_ = -i_1383_; i_1491_ < 0; i_1491_++) {
							if (!bool_1380_ || f < fs[i_1398_]) {
								int i_1492_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1390_ >> 16) + i_1490_]);
								if (i_1492_ != 0) {
									if (bool) {
										int i_1493_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1492_ & 0xff]);
										int i_1494_ = is[i_1398_];
										int i_1495_ = i_1493_ + i_1494_;
										int i_1496_ = ((i_1493_ & 0xff00ff) + (i_1494_ & 0xff00ff));
										i_1494_ = ((i_1496_ & 0x1000100) + (i_1495_ - i_1496_ & 0x10000));
										is[i_1398_] = (i_1495_ - i_1494_ | i_1494_ - (i_1494_ >>> 8));
									}
									if (bool_1380_ && bool_1389_)
										fs[i_1398_] = f;
								}
							}
							i_1390_ += i_1394_;
							i_1398_++;
						}
						i_1391_ += i_1395_;
						i_1390_ = i_1488_;
						i_1398_ += i_1399_;
					}
				} else if (i_1385_ == 0) {
					int i_1497_ = i_1390_;
					int i_1498_ = (i_1386_ & 0xff0000) >> 16;
					int i_1499_ = (i_1386_ & 0xff00) >> 8;
					int i_1500_ = i_1386_ & 0xff;
					for (int i_1501_ = -i_1384_; i_1501_ < 0; i_1501_++) {
						int i_1502_ = ((i_1391_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_1503_ = -i_1383_; i_1503_ < 0; i_1503_++) {
							if (!bool_1380_ || f < fs[i_1398_]) {
								int i_1504_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1390_ >> 16) + i_1502_]);
								if (i_1504_ != 0) {
									if (bool) {
										int i_1505_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1504_ & 0xff]);
										int i_1506_ = ((i_1505_ & 0xff0000) * i_1498_ & ~0xffffff);
										int i_1507_ = ((i_1505_ & 0xff00) * i_1499_ & 0xff0000);
										int i_1508_ = ((i_1505_ & 0xff) * i_1500_ & 0xff00);
										i_1505_ = (i_1506_ | i_1507_ | i_1508_) >>> 8;
										int i_1509_ = is[i_1398_];
										int i_1510_ = i_1505_ + i_1509_;
										int i_1511_ = ((i_1505_ & 0xff00ff) + (i_1509_ & 0xff00ff));
										i_1509_ = ((i_1511_ & 0x1000100) + (i_1510_ - i_1511_ & 0x10000));
										is[i_1398_] = (i_1510_ - i_1509_ | i_1509_ - (i_1509_ >>> 8));
									}
									if (bool_1380_ && bool_1389_)
										fs[i_1398_] = f;
								}
							}
							i_1390_ += i_1394_;
							i_1398_++;
						}
						i_1391_ += i_1395_;
						i_1390_ = i_1497_;
						i_1398_ += i_1399_;
					}
				} else if (i_1385_ == 3) {
					int i_1512_ = i_1390_;
					for (int i_1513_ = -i_1384_; i_1513_ < 0; i_1513_++) {
						int i_1514_ = ((i_1391_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_1515_ = -i_1383_; i_1515_ < 0; i_1515_++) {
							if (!bool_1380_ || f < fs[i_1398_]) {
								if (bool) {
									byte i_1516_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1390_ >> 16) + i_1514_]);
									int i_1517_ = (i_1516_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1516_]) : 0);
									int i_1518_ = i_1517_ + i_1386_;
									int i_1519_ = ((i_1517_ & 0xff00ff) + (i_1386_ & 0xff00ff));
									int i_1520_ = ((i_1519_ & 0x1000100) + (i_1518_ - i_1519_ & 0x10000));
									i_1517_ = (i_1518_ - i_1520_ | i_1520_ - (i_1520_ >>> 8));
									i_1520_ = is[i_1398_];
									i_1518_ = i_1517_ + i_1520_;
									i_1519_ = (i_1517_ & 0xff00ff) + (i_1520_ & 0xff00ff);
									i_1520_ = ((i_1519_ & 0x1000100) + (i_1518_ - i_1519_ & 0x10000));
									is[i_1398_] = (i_1518_ - i_1520_ | i_1520_ - (i_1520_ >>> 8));
								}
								if (bool_1380_ && bool_1389_)
									fs[i_1398_] = f;
							}
							i_1390_ += i_1394_;
							i_1398_++;
						}
						i_1391_ += i_1395_;
						i_1390_ = i_1512_;
						i_1398_ += i_1399_;
					}
				} else if (i_1385_ == 2) {
					int i_1521_ = i_1386_ >>> 24;
					int i_1522_ = 256 - i_1521_;
					int i_1523_ = (i_1386_ & 0xff00ff) * i_1522_ & ~0xff00ff;
					int i_1524_ = (i_1386_ & 0xff00) * i_1522_ & 0xff0000;
					i_1386_ = (i_1523_ | i_1524_) >>> 8;
					int i_1525_ = i_1390_;
					for (int i_1526_ = -i_1384_; i_1526_ < 0; i_1526_++) {
						int i_1527_ = ((i_1391_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_1528_ = -i_1383_; i_1528_ < 0; i_1528_++) {
							if (!bool_1380_ || f < fs[i_1398_]) {
								int i_1529_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1390_ >> 16) + i_1527_]);
								if (i_1529_ != 0) {
									if (bool) {
										int i_1530_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1529_ & 0xff]);
										i_1523_ = ((i_1530_ & 0xff00ff) * i_1521_ & ~0xff00ff);
										i_1524_ = ((i_1530_ & 0xff00) * i_1521_ & 0xff0000);
										i_1530_ = (((i_1523_ | i_1524_) >>> 8) + i_1386_);
										int i_1531_ = is[i_1398_];
										int i_1532_ = i_1530_ + i_1531_;
										int i_1533_ = ((i_1530_ & 0xff00ff) + (i_1531_ & 0xff00ff));
										i_1531_ = ((i_1533_ & 0x1000100) + (i_1532_ - i_1533_ & 0x10000));
										is[i_1398_] = (i_1532_ - i_1531_ | i_1531_ - (i_1531_ >>> 8));
									}
									if (bool_1380_ && bool_1389_)
										fs[i_1398_] = f;
								}
							}
							i_1390_ += i_1394_;
							i_1398_++;
						}
						i_1391_ += i_1395_;
						i_1390_ = i_1525_;
						i_1398_ += i_1399_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method635(int i, int i_1534_, int i_1535_, int i_1536_, int i_1537_, int i_1538_, int i_1539_, int i_1540_) {
		if (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (i_1535_ > 0 && i_1536_ > 0) {
			int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
			if (is != null) {
				int i_1541_ = 0;
				int i_1542_ = 0;
				int i_1543_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
				int i_1544_ = (((Class57_Sub1_Sub3) this).anInt8990 + ((Class57_Sub1_Sub3) this).anInt9010 + ((Class57_Sub1_Sub3) this).anInt8997);
				int i_1545_ = (((Class57_Sub1_Sub3) this).anInt9000 + ((Class57_Sub1_Sub3) this).anInt8989 + ((Class57_Sub1_Sub3) this).anInt8993);
				int i_1546_ = (i_1544_ << 16) / i_1535_;
				int i_1547_ = (i_1545_ << 16) / i_1536_;
				if (((Class57_Sub1_Sub3) this).anInt8990 > 0) {
					int i_1548_ = ((((Class57_Sub1_Sub3) this).anInt8990 << 16) + i_1546_ - 1) / i_1546_;
					i += i_1548_;
					i_1541_ += (i_1548_ * i_1546_ - (((Class57_Sub1_Sub3) this).anInt8990 << 16));
				}
				if (((Class57_Sub1_Sub3) this).anInt9000 > 0) {
					int i_1549_ = ((((Class57_Sub1_Sub3) this).anInt9000 << 16) + i_1547_ - 1) / i_1547_;
					i_1534_ += i_1549_;
					i_1542_ += (i_1549_ * i_1547_ - (((Class57_Sub1_Sub3) this).anInt9000 << 16));
				}
				if (((Class57_Sub1_Sub3) this).anInt9010 < i_1544_)
					i_1535_ = ((((Class57_Sub1_Sub3) this).anInt9010 << 16) - i_1541_ + i_1546_ - 1) / i_1546_;
				if (((Class57_Sub1_Sub3) this).anInt8989 < i_1545_)
					i_1536_ = ((((Class57_Sub1_Sub3) this).anInt8989 << 16) - i_1542_ + i_1547_ - 1) / i_1547_;
				int i_1550_ = i + i_1534_ * i_1543_;
				int i_1551_ = i_1543_ - i_1535_;
				if (i_1534_ + i_1536_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7977 * 63686679))
					i_1536_ -= (i_1534_ + i_1536_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7977) * 63686679);
				if (i_1534_ < (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805) {
					int i_1552_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_1534_;
					i_1536_ -= i_1552_;
					i_1550_ += i_1552_ * i_1543_;
					i_1542_ += i_1547_ * i_1552_;
				}
				if (i + i_1535_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725) {
					int i_1553_ = (i + i_1535_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725);
					i_1535_ -= i_1553_;
					i_1551_ += i_1553_;
				}
				if (i < (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7974 * -912871679)) {
					int i_1554_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i;
					i_1535_ -= i_1554_;
					i_1550_ += i_1554_;
					i_1541_ += i_1546_ * i_1554_;
					i_1551_ += i_1554_;
				}
				if (i_1539_ == 0) {
					if (i_1537_ == 1) {
						int i_1555_ = i_1541_;
						for (int i_1556_ = -i_1536_; i_1556_ < 0; i_1556_++) {
							int i_1557_ = ((i_1542_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_1558_ = -i_1535_; i_1558_ < 0; i_1558_++) {
								is[i_1550_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[(i_1541_ >> 16) + i_1557_]) & 0xff]);
								i_1541_ += i_1546_;
							}
							i_1542_ += i_1547_;
							i_1541_ = i_1555_;
							i_1550_ += i_1551_;
						}
					} else if (i_1537_ == 0) {
						int i_1559_ = (i_1538_ & 0xff0000) >> 16;
						int i_1560_ = (i_1538_ & 0xff00) >> 8;
						int i_1561_ = i_1538_ & 0xff;
						int i_1562_ = i_1541_;
						for (int i_1563_ = -i_1536_; i_1563_ < 0; i_1563_++) {
							int i_1564_ = ((i_1542_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_1565_ = -i_1535_; i_1565_ < 0; i_1565_++) {
								int i_1566_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[(i_1541_ >> 16) + i_1564_]) & 0xff]);
								int i_1567_ = ((i_1566_ & 0xff0000) * i_1559_ & ~0xffffff);
								int i_1568_ = (i_1566_ & 0xff00) * i_1560_ & 0xff0000;
								int i_1569_ = (i_1566_ & 0xff) * i_1561_ & 0xff00;
								is[i_1550_++] = (i_1567_ | i_1568_ | i_1569_) >>> 8;
								i_1541_ += i_1546_;
							}
							i_1542_ += i_1547_;
							i_1541_ = i_1562_;
							i_1550_ += i_1551_;
						}
					} else if (i_1537_ == 3) {
						int i_1570_ = i_1541_;
						for (int i_1571_ = -i_1536_; i_1571_ < 0; i_1571_++) {
							int i_1572_ = ((i_1542_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_1573_ = -i_1535_; i_1573_ < 0; i_1573_++) {
								byte i_1574_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1541_ >> 16) + i_1572_]);
								int i_1575_ = (i_1574_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1574_]) : 0);
								int i_1576_ = i_1575_ + i_1538_;
								int i_1577_ = ((i_1575_ & 0xff00ff) + (i_1538_ & 0xff00ff));
								int i_1578_ = ((i_1577_ & 0x1000100) + (i_1576_ - i_1577_ & 0x10000));
								is[i_1550_++] = i_1576_ - i_1578_ | i_1578_ - (i_1578_ >>> 8);
								i_1541_ += i_1546_;
							}
							i_1542_ += i_1547_;
							i_1541_ = i_1570_;
							i_1550_ += i_1551_;
						}
					} else if (i_1537_ == 2) {
						int i_1579_ = i_1538_ >>> 24;
						int i_1580_ = 256 - i_1579_;
						int i_1581_ = (i_1538_ & 0xff00ff) * i_1580_ & ~0xff00ff;
						int i_1582_ = (i_1538_ & 0xff00) * i_1580_ & 0xff0000;
						i_1538_ = (i_1581_ | i_1582_) >>> 8;
						int i_1583_ = i_1541_;
						for (int i_1584_ = -i_1536_; i_1584_ < 0; i_1584_++) {
							int i_1585_ = ((i_1542_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_1586_ = -i_1535_; i_1586_ < 0; i_1586_++) {
								int i_1587_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[(i_1541_ >> 16) + i_1585_]) & 0xff]);
								i_1581_ = ((i_1587_ & 0xff00ff) * i_1579_ & ~0xff00ff);
								i_1582_ = (i_1587_ & 0xff00) * i_1579_ & 0xff0000;
								is[i_1550_++] = ((i_1581_ | i_1582_) >>> 8) + i_1538_;
								i_1541_ += i_1546_;
							}
							i_1542_ += i_1547_;
							i_1541_ = i_1583_;
							i_1550_ += i_1551_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1539_ == 1) {
					if (i_1537_ == 1) {
						int i_1588_ = i_1541_;
						for (int i_1589_ = -i_1536_; i_1589_ < 0; i_1589_++) {
							int i_1590_ = ((i_1542_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_1591_ = -i_1535_; i_1591_ < 0; i_1591_++) {
								int i_1592_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1541_ >> 16) + i_1590_]);
								if (i_1592_ != 0)
									is[i_1550_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1592_ & 0xff]);
								else
									i_1550_++;
								i_1541_ += i_1546_;
							}
							i_1542_ += i_1547_;
							i_1541_ = i_1588_;
							i_1550_ += i_1551_;
						}
					} else if (i_1537_ == 0) {
						int i_1593_ = i_1541_;
						if ((i_1538_ & 0xffffff) == 16777215) {
							int i_1594_ = i_1538_ >>> 24;
							int i_1595_ = 256 - i_1594_;
							for (int i_1596_ = -i_1536_; i_1596_ < 0; i_1596_++) {
								int i_1597_ = ((i_1542_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
								for (int i_1598_ = -i_1535_; i_1598_ < 0; i_1598_++) {
									int i_1599_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1541_ >> 16) + i_1597_]);
									if (i_1599_ != 0) {
										int i_1600_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1599_ & 0xff]);
										int i_1601_ = is[i_1550_];
										is[i_1550_++] = ((((i_1600_ & 0xff00ff) * i_1594_ + ((i_1601_ & 0xff00ff) * i_1595_)) & ~0xff00ff) + (((i_1600_ & 0xff00) * i_1594_ + ((i_1601_ & 0xff00) * i_1595_)) & 0xff0000)) >> 8;
									} else
										i_1550_++;
									i_1541_ += i_1546_;
								}
								i_1542_ += i_1547_;
								i_1541_ = i_1593_;
								i_1550_ += i_1551_;
							}
						} else {
							int i_1602_ = (i_1538_ & 0xff0000) >> 16;
							int i_1603_ = (i_1538_ & 0xff00) >> 8;
							int i_1604_ = i_1538_ & 0xff;
							int i_1605_ = i_1538_ >>> 24;
							int i_1606_ = 256 - i_1605_;
							for (int i_1607_ = -i_1536_; i_1607_ < 0; i_1607_++) {
								int i_1608_ = ((i_1542_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
								for (int i_1609_ = -i_1535_; i_1609_ < 0; i_1609_++) {
									int i_1610_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1541_ >> 16) + i_1608_]);
									if (i_1610_ != 0) {
										int i_1611_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1610_ & 0xff]);
										if (i_1605_ != 255) {
											int i_1612_ = (((i_1611_ & 0xff0000) * i_1602_) & ~0xffffff);
											int i_1613_ = ((i_1611_ & 0xff00) * i_1603_ & 0xff0000);
											int i_1614_ = ((i_1611_ & 0xff) * i_1604_ & 0xff00);
											i_1611_ = (i_1612_ | i_1613_ | i_1614_) >>> 8;
											int i_1615_ = is[i_1550_];
											is[i_1550_++] = (((((i_1611_ & 0xff00ff) * i_1605_) + ((i_1615_ & 0xff00ff) * i_1606_)) & ~0xff00ff) + ((((i_1611_ & 0xff00) * i_1605_) + ((i_1615_ & 0xff00) * i_1606_)) & 0xff0000)) >> 8;
										} else {
											int i_1616_ = (((i_1611_ & 0xff0000) * i_1602_) & ~0xffffff);
											int i_1617_ = ((i_1611_ & 0xff00) * i_1603_ & 0xff0000);
											int i_1618_ = ((i_1611_ & 0xff) * i_1604_ & 0xff00);
											is[i_1550_++] = (i_1616_ | i_1617_ | i_1618_) >>> 8;
										}
									} else
										i_1550_++;
									i_1541_ += i_1546_;
								}
								i_1542_ += i_1547_;
								i_1541_ = i_1593_;
								i_1550_ += i_1551_;
							}
						}
					} else if (i_1537_ == 3) {
						int i_1619_ = i_1541_;
						int i_1620_ = i_1538_ >>> 24;
						int i_1621_ = 256 - i_1620_;
						for (int i_1622_ = -i_1536_; i_1622_ < 0; i_1622_++) {
							int i_1623_ = ((i_1542_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_1624_ = -i_1535_; i_1624_ < 0; i_1624_++) {
								byte i_1625_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1541_ >> 16) + i_1623_]);
								int i_1626_ = (i_1625_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1625_]) : 0);
								int i_1627_ = i_1626_ + i_1538_;
								int i_1628_ = ((i_1626_ & 0xff00ff) + (i_1538_ & 0xff00ff));
								int i_1629_ = ((i_1628_ & 0x1000100) + (i_1627_ - i_1628_ & 0x10000));
								i_1629_ = i_1627_ - i_1629_ | i_1629_ - (i_1629_ >>> 8);
								if (i_1626_ == 0 && i_1620_ != 255) {
									i_1626_ = i_1629_;
									i_1629_ = is[i_1550_];
									i_1629_ = ((((i_1626_ & 0xff00ff) * i_1620_ + (i_1629_ & 0xff00ff) * i_1621_) & ~0xff00ff) + (((i_1626_ & 0xff00) * i_1620_ + (i_1629_ & 0xff00) * i_1621_) & 0xff0000)) >> 8;
								}
								is[i_1550_++] = i_1629_;
								i_1541_ += i_1546_;
							}
							i_1542_ += i_1547_;
							i_1541_ = i_1619_;
							i_1550_ += i_1551_;
						}
					} else if (i_1537_ == 2) {
						int i_1630_ = i_1538_ >>> 24;
						int i_1631_ = 256 - i_1630_;
						int i_1632_ = (i_1538_ & 0xff00ff) * i_1631_ & ~0xff00ff;
						int i_1633_ = (i_1538_ & 0xff00) * i_1631_ & 0xff0000;
						i_1538_ = (i_1632_ | i_1633_) >>> 8;
						int i_1634_ = i_1541_;
						for (int i_1635_ = -i_1536_; i_1635_ < 0; i_1635_++) {
							int i_1636_ = ((i_1542_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_1637_ = -i_1535_; i_1637_ < 0; i_1637_++) {
								int i_1638_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1541_ >> 16) + i_1636_]);
								if (i_1638_ != 0) {
									int i_1639_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1638_ & 0xff]);
									i_1632_ = ((i_1639_ & 0xff00ff) * i_1630_ & ~0xff00ff);
									i_1633_ = ((i_1639_ & 0xff00) * i_1630_ & 0xff0000);
									is[i_1550_++] = ((i_1632_ | i_1633_) >>> 8) + i_1538_;
								} else
									i_1550_++;
								i_1541_ += i_1546_;
							}
							i_1542_ += i_1547_;
							i_1541_ = i_1634_;
							i_1550_ += i_1551_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1539_ == 2) {
					if (i_1537_ == 1) {
						int i_1640_ = i_1541_;
						for (int i_1641_ = -i_1536_; i_1641_ < 0; i_1641_++) {
							int i_1642_ = ((i_1542_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_1643_ = -i_1535_; i_1643_ < 0; i_1643_++) {
								int i_1644_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1541_ >> 16) + i_1642_]);
								if (i_1644_ != 0) {
									int i_1645_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1644_ & 0xff]);
									int i_1646_ = is[i_1550_];
									int i_1647_ = i_1645_ + i_1646_;
									int i_1648_ = ((i_1645_ & 0xff00ff) + (i_1646_ & 0xff00ff));
									i_1646_ = ((i_1648_ & 0x1000100) + (i_1647_ - i_1648_ & 0x10000));
									is[i_1550_++] = (i_1647_ - i_1646_ | i_1646_ - (i_1646_ >>> 8));
								} else
									i_1550_++;
								i_1541_ += i_1546_;
							}
							i_1542_ += i_1547_;
							i_1541_ = i_1640_;
							i_1550_ += i_1551_;
						}
					} else if (i_1537_ == 0) {
						int i_1649_ = i_1541_;
						int i_1650_ = (i_1538_ & 0xff0000) >> 16;
						int i_1651_ = (i_1538_ & 0xff00) >> 8;
						int i_1652_ = i_1538_ & 0xff;
						for (int i_1653_ = -i_1536_; i_1653_ < 0; i_1653_++) {
							int i_1654_ = ((i_1542_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_1655_ = -i_1535_; i_1655_ < 0; i_1655_++) {
								int i_1656_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1541_ >> 16) + i_1654_]);
								if (i_1656_ != 0) {
									int i_1657_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1656_ & 0xff]);
									int i_1658_ = ((i_1657_ & 0xff0000) * i_1650_ & ~0xffffff);
									int i_1659_ = ((i_1657_ & 0xff00) * i_1651_ & 0xff0000);
									int i_1660_ = (i_1657_ & 0xff) * i_1652_ & 0xff00;
									i_1657_ = (i_1658_ | i_1659_ | i_1660_) >>> 8;
									int i_1661_ = is[i_1550_];
									int i_1662_ = i_1657_ + i_1661_;
									int i_1663_ = ((i_1657_ & 0xff00ff) + (i_1661_ & 0xff00ff));
									i_1661_ = ((i_1663_ & 0x1000100) + (i_1662_ - i_1663_ & 0x10000));
									is[i_1550_++] = (i_1662_ - i_1661_ | i_1661_ - (i_1661_ >>> 8));
								} else
									i_1550_++;
								i_1541_ += i_1546_;
							}
							i_1542_ += i_1547_;
							i_1541_ = i_1649_;
							i_1550_ += i_1551_;
						}
					} else if (i_1537_ == 3) {
						int i_1664_ = i_1541_;
						for (int i_1665_ = -i_1536_; i_1665_ < 0; i_1665_++) {
							int i_1666_ = ((i_1542_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_1667_ = -i_1535_; i_1667_ < 0; i_1667_++) {
								byte i_1668_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1541_ >> 16) + i_1666_]);
								int i_1669_ = (i_1668_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1668_]) : 0);
								int i_1670_ = i_1669_ + i_1538_;
								int i_1671_ = ((i_1669_ & 0xff00ff) + (i_1538_ & 0xff00ff));
								int i_1672_ = ((i_1671_ & 0x1000100) + (i_1670_ - i_1671_ & 0x10000));
								i_1669_ = i_1670_ - i_1672_ | i_1672_ - (i_1672_ >>> 8);
								i_1672_ = is[i_1550_];
								i_1670_ = i_1669_ + i_1672_;
								i_1671_ = (i_1669_ & 0xff00ff) + (i_1672_ & 0xff00ff);
								i_1672_ = ((i_1671_ & 0x1000100) + (i_1670_ - i_1671_ & 0x10000));
								is[i_1550_++] = i_1670_ - i_1672_ | i_1672_ - (i_1672_ >>> 8);
								i_1541_ += i_1546_;
							}
							i_1542_ += i_1547_;
							i_1541_ = i_1664_;
							i_1550_ += i_1551_;
						}
					} else if (i_1537_ == 2) {
						int i_1673_ = i_1538_ >>> 24;
						int i_1674_ = 256 - i_1673_;
						int i_1675_ = (i_1538_ & 0xff00ff) * i_1674_ & ~0xff00ff;
						int i_1676_ = (i_1538_ & 0xff00) * i_1674_ & 0xff0000;
						i_1538_ = (i_1675_ | i_1676_) >>> 8;
						int i_1677_ = i_1541_;
						for (int i_1678_ = -i_1536_; i_1678_ < 0; i_1678_++) {
							int i_1679_ = ((i_1542_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_1680_ = -i_1535_; i_1680_ < 0; i_1680_++) {
								int i_1681_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_1541_ >> 16) + i_1679_]);
								if (i_1681_ != 0) {
									int i_1682_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1681_ & 0xff]);
									i_1675_ = ((i_1682_ & 0xff00ff) * i_1673_ & ~0xff00ff);
									i_1676_ = ((i_1682_ & 0xff00) * i_1673_ & 0xff0000);
									i_1682_ = (((i_1675_ | i_1676_) >>> 8) + i_1538_);
									int i_1683_ = is[i_1550_];
									int i_1684_ = i_1682_ + i_1683_;
									int i_1685_ = ((i_1682_ & 0xff00ff) + (i_1683_ & 0xff00ff));
									i_1683_ = ((i_1685_ & 0x1000100) + (i_1684_ - i_1685_ & 0x10000));
									is[i_1550_++] = (i_1684_ - i_1683_ | i_1683_ - (i_1683_ >>> 8));
								} else
									i_1550_++;
								i_1541_ += i_1546_;
							}
							i_1542_ += i_1547_;
							i_1541_ = i_1677_;
							i_1550_ += i_1551_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Interface8_Impl1_Impl1 method627() {
		throw new IllegalStateException();
	}

	void method681(int[] is, int[] is_1686_, int i, int i_1687_) {
		int[] is_1688_ = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is_1688_ != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_1689_ = anInt9001;
					while (i_1689_ < 0) {
						int i_1690_ = i_1689_ + i_1687_;
						if (i_1690_ >= 0) {
							if (i_1690_ >= is.length)
								break;
							int i_1691_ = anInt9003;
							int i_1692_ = anInt8988;
							int i_1693_ = anInt9011;
							int i_1694_ = anInt8999;
							if (i_1692_ >= 0 && i_1693_ >= 0 && (i_1692_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) < 0 && (i_1693_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) < 0) {
								int i_1695_ = is[i_1690_] - i;
								int i_1696_ = -is_1686_[i_1690_];
								int i_1697_ = i_1695_ - (i_1691_ - anInt9003);
								if (i_1697_ > 0) {
									i_1691_ += i_1697_;
									i_1694_ += i_1697_;
									i_1692_ += anInt9004 * i_1697_;
									i_1693_ += anInt8991 * i_1697_;
								} else
									i_1696_ -= i_1697_;
								if (i_1694_ < i_1696_)
									i_1694_ = i_1696_;
								for (/**/; i_1694_ < 0; i_1694_++) {
									int i_1698_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_1693_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_1692_ >> 12))]);
									if (i_1698_ != 0)
										is_1688_[i_1691_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1698_ & 0xff]);
									else
										i_1691_++;
								}
							}
						}
						i_1689_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_1699_ = anInt9001;
					while (i_1699_ < 0) {
						int i_1700_ = i_1699_ + i_1687_;
						if (i_1700_ >= 0) {
							if (i_1700_ >= is.length)
								break;
							int i_1701_ = anInt9003;
							int i_1702_ = anInt8988;
							int i_1703_ = anInt9011 + anInt9013;
							int i_1704_ = anInt8999;
							if (i_1702_ >= 0 && (i_1702_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) < 0) {
								int i_1705_;
								if ((i_1705_ = (i_1703_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12))) >= 0) {
									i_1705_ = (anInt8991 - i_1705_) / anInt8991;
									i_1704_ += i_1705_;
									i_1703_ += anInt8991 * i_1705_;
									i_1701_ += i_1705_;
								}
								if ((i_1705_ = (i_1703_ - anInt8991) / anInt8991) > i_1704_)
									i_1704_ = i_1705_;
								int i_1706_ = is[i_1700_] - i;
								int i_1707_ = -is_1686_[i_1700_];
								int i_1708_ = i_1706_ - (i_1701_ - anInt9003);
								if (i_1708_ > 0) {
									i_1701_ += i_1708_;
									i_1704_ += i_1708_;
									i_1702_ += anInt9004 * i_1708_;
									i_1703_ += anInt8991 * i_1708_;
								} else
									i_1707_ -= i_1708_;
								if (i_1704_ < i_1707_)
									i_1704_ = i_1707_;
								for (/**/; i_1704_ < 0; i_1704_++) {
									int i_1709_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_1703_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_1702_ >> 12))]);
									if (i_1709_ != 0)
										is_1688_[i_1701_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1709_ & 0xff]);
									else
										i_1701_++;
									i_1703_ += anInt8991;
								}
							}
						}
						i_1699_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_1710_ = anInt9001;
					while (i_1710_ < 0) {
						int i_1711_ = i_1710_ + i_1687_;
						if (i_1711_ >= 0) {
							if (i_1711_ >= is.length)
								break;
							int i_1712_ = anInt9003;
							int i_1713_ = anInt8988;
							int i_1714_ = anInt9011 + anInt9013;
							int i_1715_ = anInt8999;
							if (i_1713_ >= 0 && (i_1713_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) < 0) {
								if (i_1714_ < 0) {
									int i_1716_ = ((anInt8991 - 1 - i_1714_) / anInt8991);
									i_1715_ += i_1716_;
									i_1714_ += anInt8991 * i_1716_;
									i_1712_ += i_1716_;
								}
								int i_1717_;
								if ((i_1717_ = (1 + i_1714_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_1715_)
									i_1715_ = i_1717_;
								int i_1718_ = is[i_1711_] - i;
								int i_1719_ = -is_1686_[i_1711_];
								int i_1720_ = i_1718_ - (i_1712_ - anInt9003);
								if (i_1720_ > 0) {
									i_1712_ += i_1720_;
									i_1715_ += i_1720_;
									i_1713_ += anInt9004 * i_1720_;
									i_1714_ += anInt8991 * i_1720_;
								} else
									i_1719_ -= i_1720_;
								if (i_1715_ < i_1719_)
									i_1715_ = i_1719_;
								for (/**/; i_1715_ < 0; i_1715_++) {
									int i_1721_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_1714_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_1713_ >> 12))]);
									if (i_1721_ != 0)
										is_1688_[i_1712_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1721_ & 0xff]);
									else
										i_1712_++;
									i_1714_ += anInt8991;
								}
							}
						}
						i_1710_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_1722_ = anInt9001;
					while (i_1722_ < 0) {
						int i_1723_ = i_1722_ + i_1687_;
						if (i_1723_ >= 0) {
							if (i_1723_ >= is.length)
								break;
							int i_1724_ = anInt9003;
							int i_1725_ = anInt8988 + anInt9012;
							int i_1726_ = anInt9011;
							int i_1727_ = anInt8999;
							if (i_1726_ >= 0 && (i_1726_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) < 0) {
								int i_1728_;
								if ((i_1728_ = (i_1725_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12))) >= 0) {
									i_1728_ = (anInt9004 - i_1728_) / anInt9004;
									i_1727_ += i_1728_;
									i_1725_ += anInt9004 * i_1728_;
									i_1724_ += i_1728_;
								}
								if ((i_1728_ = (i_1725_ - anInt9004) / anInt9004) > i_1727_)
									i_1727_ = i_1728_;
								int i_1729_ = is[i_1723_] - i;
								int i_1730_ = -is_1686_[i_1723_];
								int i_1731_ = i_1729_ - (i_1724_ - anInt9003);
								if (i_1731_ > 0) {
									i_1724_ += i_1731_;
									i_1727_ += i_1731_;
									i_1725_ += anInt9004 * i_1731_;
									i_1726_ += anInt8991 * i_1731_;
								} else
									i_1730_ -= i_1731_;
								if (i_1727_ < i_1730_)
									i_1727_ = i_1730_;
								for (/**/; i_1727_ < 0; i_1727_++) {
									int i_1732_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_1726_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_1725_ >> 12))]);
									if (i_1732_ != 0)
										is_1688_[i_1724_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1732_ & 0xff]);
									else
										i_1724_++;
									i_1725_ += anInt9004;
								}
							}
						}
						i_1722_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_1733_ = anInt9001;
					while (i_1733_ < 0) {
						int i_1734_ = i_1733_ + i_1687_;
						if (i_1734_ >= 0) {
							if (i_1734_ >= is.length)
								break;
							int i_1735_ = anInt9003;
							int i_1736_ = anInt8988 + anInt9012;
							int i_1737_ = anInt9011 + anInt9013;
							int i_1738_ = anInt8999;
							int i_1739_;
							if ((i_1739_ = (i_1736_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12))) >= 0) {
								i_1739_ = (anInt9004 - i_1739_) / anInt9004;
								i_1738_ += i_1739_;
								i_1736_ += anInt9004 * i_1739_;
								i_1737_ += anInt8991 * i_1739_;
								i_1735_ += i_1739_;
							}
							if ((i_1739_ = (i_1736_ - anInt9004) / anInt9004) > i_1738_)
								i_1738_ = i_1739_;
							if ((i_1739_ = (i_1737_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12))) >= 0) {
								i_1739_ = (anInt8991 - i_1739_) / anInt8991;
								i_1738_ += i_1739_;
								i_1736_ += anInt9004 * i_1739_;
								i_1737_ += anInt8991 * i_1739_;
								i_1735_ += i_1739_;
							}
							if ((i_1739_ = (i_1737_ - anInt8991) / anInt8991) > i_1738_)
								i_1738_ = i_1739_;
							int i_1740_ = is[i_1734_] - i;
							int i_1741_ = -is_1686_[i_1734_];
							int i_1742_ = i_1740_ - (i_1735_ - anInt9003);
							if (i_1742_ > 0) {
								i_1735_ += i_1742_;
								i_1738_ += i_1742_;
								i_1736_ += anInt9004 * i_1742_;
								i_1737_ += anInt8991 * i_1742_;
							} else
								i_1741_ -= i_1742_;
							if (i_1738_ < i_1741_)
								i_1738_ = i_1741_;
							for (/**/; i_1738_ < 0; i_1738_++) {
								int i_1743_ = (((Class57_Sub1_Sub3) this).aByteArray9967[((i_1737_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010 + (i_1736_ >> 12))]);
								if (i_1743_ != 0)
									is_1688_[i_1735_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1743_ & 0xff]);
								else
									i_1735_++;
								i_1736_ += anInt9004;
								i_1737_ += anInt8991;
							}
						}
						i_1733_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_1744_ = anInt9001;
					while (i_1744_ < 0) {
						int i_1745_ = i_1744_ + i_1687_;
						if (i_1745_ >= 0) {
							if (i_1745_ >= is.length)
								break;
							int i_1746_ = anInt9003;
							int i_1747_ = anInt8988 + anInt9012;
							int i_1748_ = anInt9011 + anInt9013;
							int i_1749_ = anInt8999;
							int i_1750_;
							if ((i_1750_ = (i_1747_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12))) >= 0) {
								i_1750_ = (anInt9004 - i_1750_) / anInt9004;
								i_1749_ += i_1750_;
								i_1747_ += anInt9004 * i_1750_;
								i_1748_ += anInt8991 * i_1750_;
								i_1746_ += i_1750_;
							}
							if ((i_1750_ = (i_1747_ - anInt9004) / anInt9004) > i_1749_)
								i_1749_ = i_1750_;
							if (i_1748_ < 0) {
								i_1750_ = (anInt8991 - 1 - i_1748_) / anInt8991;
								i_1749_ += i_1750_;
								i_1747_ += anInt9004 * i_1750_;
								i_1748_ += anInt8991 * i_1750_;
								i_1746_ += i_1750_;
							}
							if ((i_1750_ = (1 + i_1748_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_1749_)
								i_1749_ = i_1750_;
							int i_1751_ = is[i_1745_] - i;
							int i_1752_ = -is_1686_[i_1745_];
							int i_1753_ = i_1751_ - (i_1746_ - anInt9003);
							if (i_1753_ > 0) {
								i_1746_ += i_1753_;
								i_1749_ += i_1753_;
								i_1747_ += anInt9004 * i_1753_;
								i_1748_ += anInt8991 * i_1753_;
							} else
								i_1752_ -= i_1753_;
							if (i_1749_ < i_1752_)
								i_1749_ = i_1752_;
							for (/**/; i_1749_ < 0; i_1749_++) {
								int i_1754_ = (((Class57_Sub1_Sub3) this).aByteArray9967[((i_1748_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010 + (i_1747_ >> 12))]);
								if (i_1754_ != 0)
									is_1688_[i_1746_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1754_ & 0xff]);
								else
									i_1746_++;
								i_1747_ += anInt9004;
								i_1748_ += anInt8991;
							}
						}
						i_1744_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_1755_ = anInt9001;
				while (i_1755_ < 0) {
					int i_1756_ = i_1755_ + i_1687_;
					if (i_1756_ >= 0) {
						if (i_1756_ >= is.length)
							break;
						int i_1757_ = anInt9003;
						int i_1758_ = anInt8988 + anInt9012;
						int i_1759_ = anInt9011;
						int i_1760_ = anInt8999;
						if (i_1759_ >= 0 && i_1759_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) < 0) {
							if (i_1758_ < 0) {
								int i_1761_ = (anInt9004 - 1 - i_1758_) / anInt9004;
								i_1760_ += i_1761_;
								i_1758_ += anInt9004 * i_1761_;
								i_1757_ += i_1761_;
							}
							int i_1762_;
							if ((i_1762_ = (1 + i_1758_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1760_)
								i_1760_ = i_1762_;
							int i_1763_ = is[i_1756_] - i;
							int i_1764_ = -is_1686_[i_1756_];
							int i_1765_ = i_1763_ - (i_1757_ - anInt9003);
							if (i_1765_ > 0) {
								i_1757_ += i_1765_;
								i_1760_ += i_1765_;
								i_1758_ += anInt9004 * i_1765_;
								i_1759_ += anInt8991 * i_1765_;
							} else
								i_1764_ -= i_1765_;
							if (i_1760_ < i_1764_)
								i_1760_ = i_1764_;
							for (/**/; i_1760_ < 0; i_1760_++) {
								int i_1766_ = (((Class57_Sub1_Sub3) this).aByteArray9967[((i_1759_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010 + (i_1758_ >> 12))]);
								if (i_1766_ != 0)
									is_1688_[i_1757_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1766_ & 0xff]);
								else
									i_1757_++;
								i_1758_ += anInt9004;
							}
						}
					}
					i_1755_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				int i_1767_ = anInt9001;
				while (i_1767_ < 0) {
					int i_1768_ = i_1767_ + i_1687_;
					if (i_1768_ >= 0) {
						if (i_1768_ >= is.length)
							break;
						int i_1769_ = anInt9003;
						int i_1770_ = anInt8988 + anInt9012;
						int i_1771_ = anInt9011 + anInt9013;
						int i_1772_ = anInt8999;
						if (i_1770_ < 0) {
							int i_1773_ = (anInt9004 - 1 - i_1770_) / anInt9004;
							i_1772_ += i_1773_;
							i_1770_ += anInt9004 * i_1773_;
							i_1771_ += anInt8991 * i_1773_;
							i_1769_ += i_1773_;
						}
						int i_1774_;
						if ((i_1774_ = (1 + i_1770_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1772_)
							i_1772_ = i_1774_;
						if ((i_1774_ = i_1771_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) >= 0) {
							i_1774_ = (anInt8991 - i_1774_) / anInt8991;
							i_1772_ += i_1774_;
							i_1770_ += anInt9004 * i_1774_;
							i_1771_ += anInt8991 * i_1774_;
							i_1769_ += i_1774_;
						}
						if ((i_1774_ = (i_1771_ - anInt8991) / anInt8991) > i_1772_)
							i_1772_ = i_1774_;
						int i_1775_ = is[i_1768_] - i;
						int i_1776_ = -is_1686_[i_1768_];
						int i_1777_ = i_1775_ - (i_1769_ - anInt9003);
						if (i_1777_ > 0) {
							i_1769_ += i_1777_;
							i_1772_ += i_1777_;
							i_1770_ += anInt9004 * i_1777_;
							i_1771_ += anInt8991 * i_1777_;
						} else
							i_1776_ -= i_1777_;
						if (i_1772_ < i_1776_)
							i_1772_ = i_1776_;
						for (/**/; i_1772_ < 0; i_1772_++) {
							int i_1778_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_1771_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_1770_ >> 12))]);
							if (i_1778_ != 0)
								is_1688_[i_1769_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1778_ & 0xff]);
							else
								i_1769_++;
							i_1770_ += anInt9004;
							i_1771_ += anInt8991;
						}
					}
					i_1767_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				int i_1779_ = anInt9001;
				while (i_1779_ < 0) {
					int i_1780_ = i_1779_ + i_1687_;
					if (i_1780_ >= 0) {
						if (i_1780_ >= is.length)
							break;
						int i_1781_ = anInt9003;
						int i_1782_ = anInt8988 + anInt9012;
						int i_1783_ = anInt9011 + anInt9013;
						int i_1784_ = anInt8999;
						if (i_1782_ < 0) {
							int i_1785_ = (anInt9004 - 1 - i_1782_) / anInt9004;
							i_1784_ += i_1785_;
							i_1782_ += anInt9004 * i_1785_;
							i_1783_ += anInt8991 * i_1785_;
							i_1781_ += i_1785_;
						}
						int i_1786_;
						if ((i_1786_ = (1 + i_1782_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1784_)
							i_1784_ = i_1786_;
						if (i_1783_ < 0) {
							i_1786_ = (anInt8991 - 1 - i_1783_) / anInt8991;
							i_1784_ += i_1786_;
							i_1782_ += anInt9004 * i_1786_;
							i_1783_ += anInt8991 * i_1786_;
							i_1781_ += i_1786_;
						}
						if ((i_1786_ = (1 + i_1783_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_1784_)
							i_1784_ = i_1786_;
						int i_1787_ = is[i_1780_] - i;
						int i_1788_ = -is_1686_[i_1780_];
						int i_1789_ = i_1787_ - (i_1781_ - anInt9003);
						if (i_1789_ > 0) {
							i_1781_ += i_1789_;
							i_1784_ += i_1789_;
							i_1782_ += anInt9004 * i_1789_;
							i_1783_ += anInt8991 * i_1789_;
						} else
							i_1788_ -= i_1789_;
						if (i_1784_ < i_1788_)
							i_1784_ = i_1788_;
						for (/**/; i_1784_ < 0; i_1784_++) {
							int i_1790_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_1783_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_1782_ >> 12))]);
							if (i_1790_ != 0)
								is_1688_[i_1781_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1790_ & 0xff]);
							else
								i_1781_++;
							i_1782_ += anInt9004;
							i_1783_ += anInt8991;
						}
					}
					i_1779_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	public void method628(int i, int i_1791_, int i_1792_) {
		throw new IllegalStateException();
	}

	void method685(int[] is, int[] is_1793_, int i, int i_1794_) {
		int[] is_1795_ = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is_1795_ != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_1796_ = anInt9001;
					while (i_1796_ < 0) {
						int i_1797_ = i_1796_ + i_1794_;
						if (i_1797_ >= 0) {
							if (i_1797_ >= is.length)
								break;
							int i_1798_ = anInt9003;
							int i_1799_ = anInt8988;
							int i_1800_ = anInt9011;
							int i_1801_ = anInt8999;
							if (i_1799_ >= 0 && i_1800_ >= 0 && (i_1799_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) < 0 && (i_1800_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) < 0) {
								int i_1802_ = is[i_1797_] - i;
								int i_1803_ = -is_1793_[i_1797_];
								int i_1804_ = i_1802_ - (i_1798_ - anInt9003);
								if (i_1804_ > 0) {
									i_1798_ += i_1804_;
									i_1801_ += i_1804_;
									i_1799_ += anInt9004 * i_1804_;
									i_1800_ += anInt8991 * i_1804_;
								} else
									i_1803_ -= i_1804_;
								if (i_1801_ < i_1803_)
									i_1801_ = i_1803_;
								for (/**/; i_1801_ < 0; i_1801_++) {
									int i_1805_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_1800_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_1799_ >> 12))]);
									if (i_1805_ != 0)
										is_1795_[i_1798_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1805_ & 0xff]);
									else
										i_1798_++;
								}
							}
						}
						i_1796_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_1806_ = anInt9001;
					while (i_1806_ < 0) {
						int i_1807_ = i_1806_ + i_1794_;
						if (i_1807_ >= 0) {
							if (i_1807_ >= is.length)
								break;
							int i_1808_ = anInt9003;
							int i_1809_ = anInt8988;
							int i_1810_ = anInt9011 + anInt9013;
							int i_1811_ = anInt8999;
							if (i_1809_ >= 0 && (i_1809_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) < 0) {
								int i_1812_;
								if ((i_1812_ = (i_1810_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12))) >= 0) {
									i_1812_ = (anInt8991 - i_1812_) / anInt8991;
									i_1811_ += i_1812_;
									i_1810_ += anInt8991 * i_1812_;
									i_1808_ += i_1812_;
								}
								if ((i_1812_ = (i_1810_ - anInt8991) / anInt8991) > i_1811_)
									i_1811_ = i_1812_;
								int i_1813_ = is[i_1807_] - i;
								int i_1814_ = -is_1793_[i_1807_];
								int i_1815_ = i_1813_ - (i_1808_ - anInt9003);
								if (i_1815_ > 0) {
									i_1808_ += i_1815_;
									i_1811_ += i_1815_;
									i_1809_ += anInt9004 * i_1815_;
									i_1810_ += anInt8991 * i_1815_;
								} else
									i_1814_ -= i_1815_;
								if (i_1811_ < i_1814_)
									i_1811_ = i_1814_;
								for (/**/; i_1811_ < 0; i_1811_++) {
									int i_1816_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_1810_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_1809_ >> 12))]);
									if (i_1816_ != 0)
										is_1795_[i_1808_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1816_ & 0xff]);
									else
										i_1808_++;
									i_1810_ += anInt8991;
								}
							}
						}
						i_1806_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_1817_ = anInt9001;
					while (i_1817_ < 0) {
						int i_1818_ = i_1817_ + i_1794_;
						if (i_1818_ >= 0) {
							if (i_1818_ >= is.length)
								break;
							int i_1819_ = anInt9003;
							int i_1820_ = anInt8988;
							int i_1821_ = anInt9011 + anInt9013;
							int i_1822_ = anInt8999;
							if (i_1820_ >= 0 && (i_1820_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) < 0) {
								if (i_1821_ < 0) {
									int i_1823_ = ((anInt8991 - 1 - i_1821_) / anInt8991);
									i_1822_ += i_1823_;
									i_1821_ += anInt8991 * i_1823_;
									i_1819_ += i_1823_;
								}
								int i_1824_;
								if ((i_1824_ = (1 + i_1821_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_1822_)
									i_1822_ = i_1824_;
								int i_1825_ = is[i_1818_] - i;
								int i_1826_ = -is_1793_[i_1818_];
								int i_1827_ = i_1825_ - (i_1819_ - anInt9003);
								if (i_1827_ > 0) {
									i_1819_ += i_1827_;
									i_1822_ += i_1827_;
									i_1820_ += anInt9004 * i_1827_;
									i_1821_ += anInt8991 * i_1827_;
								} else
									i_1826_ -= i_1827_;
								if (i_1822_ < i_1826_)
									i_1822_ = i_1826_;
								for (/**/; i_1822_ < 0; i_1822_++) {
									int i_1828_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_1821_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_1820_ >> 12))]);
									if (i_1828_ != 0)
										is_1795_[i_1819_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1828_ & 0xff]);
									else
										i_1819_++;
									i_1821_ += anInt8991;
								}
							}
						}
						i_1817_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_1829_ = anInt9001;
					while (i_1829_ < 0) {
						int i_1830_ = i_1829_ + i_1794_;
						if (i_1830_ >= 0) {
							if (i_1830_ >= is.length)
								break;
							int i_1831_ = anInt9003;
							int i_1832_ = anInt8988 + anInt9012;
							int i_1833_ = anInt9011;
							int i_1834_ = anInt8999;
							if (i_1833_ >= 0 && (i_1833_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) < 0) {
								int i_1835_;
								if ((i_1835_ = (i_1832_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12))) >= 0) {
									i_1835_ = (anInt9004 - i_1835_) / anInt9004;
									i_1834_ += i_1835_;
									i_1832_ += anInt9004 * i_1835_;
									i_1831_ += i_1835_;
								}
								if ((i_1835_ = (i_1832_ - anInt9004) / anInt9004) > i_1834_)
									i_1834_ = i_1835_;
								int i_1836_ = is[i_1830_] - i;
								int i_1837_ = -is_1793_[i_1830_];
								int i_1838_ = i_1836_ - (i_1831_ - anInt9003);
								if (i_1838_ > 0) {
									i_1831_ += i_1838_;
									i_1834_ += i_1838_;
									i_1832_ += anInt9004 * i_1838_;
									i_1833_ += anInt8991 * i_1838_;
								} else
									i_1837_ -= i_1838_;
								if (i_1834_ < i_1837_)
									i_1834_ = i_1837_;
								for (/**/; i_1834_ < 0; i_1834_++) {
									int i_1839_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_1833_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_1832_ >> 12))]);
									if (i_1839_ != 0)
										is_1795_[i_1831_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1839_ & 0xff]);
									else
										i_1831_++;
									i_1832_ += anInt9004;
								}
							}
						}
						i_1829_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_1840_ = anInt9001;
					while (i_1840_ < 0) {
						int i_1841_ = i_1840_ + i_1794_;
						if (i_1841_ >= 0) {
							if (i_1841_ >= is.length)
								break;
							int i_1842_ = anInt9003;
							int i_1843_ = anInt8988 + anInt9012;
							int i_1844_ = anInt9011 + anInt9013;
							int i_1845_ = anInt8999;
							int i_1846_;
							if ((i_1846_ = (i_1843_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12))) >= 0) {
								i_1846_ = (anInt9004 - i_1846_) / anInt9004;
								i_1845_ += i_1846_;
								i_1843_ += anInt9004 * i_1846_;
								i_1844_ += anInt8991 * i_1846_;
								i_1842_ += i_1846_;
							}
							if ((i_1846_ = (i_1843_ - anInt9004) / anInt9004) > i_1845_)
								i_1845_ = i_1846_;
							if ((i_1846_ = (i_1844_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12))) >= 0) {
								i_1846_ = (anInt8991 - i_1846_) / anInt8991;
								i_1845_ += i_1846_;
								i_1843_ += anInt9004 * i_1846_;
								i_1844_ += anInt8991 * i_1846_;
								i_1842_ += i_1846_;
							}
							if ((i_1846_ = (i_1844_ - anInt8991) / anInt8991) > i_1845_)
								i_1845_ = i_1846_;
							int i_1847_ = is[i_1841_] - i;
							int i_1848_ = -is_1793_[i_1841_];
							int i_1849_ = i_1847_ - (i_1842_ - anInt9003);
							if (i_1849_ > 0) {
								i_1842_ += i_1849_;
								i_1845_ += i_1849_;
								i_1843_ += anInt9004 * i_1849_;
								i_1844_ += anInt8991 * i_1849_;
							} else
								i_1848_ -= i_1849_;
							if (i_1845_ < i_1848_)
								i_1845_ = i_1848_;
							for (/**/; i_1845_ < 0; i_1845_++) {
								int i_1850_ = (((Class57_Sub1_Sub3) this).aByteArray9967[((i_1844_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010 + (i_1843_ >> 12))]);
								if (i_1850_ != 0)
									is_1795_[i_1842_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1850_ & 0xff]);
								else
									i_1842_++;
								i_1843_ += anInt9004;
								i_1844_ += anInt8991;
							}
						}
						i_1840_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_1851_ = anInt9001;
					while (i_1851_ < 0) {
						int i_1852_ = i_1851_ + i_1794_;
						if (i_1852_ >= 0) {
							if (i_1852_ >= is.length)
								break;
							int i_1853_ = anInt9003;
							int i_1854_ = anInt8988 + anInt9012;
							int i_1855_ = anInt9011 + anInt9013;
							int i_1856_ = anInt8999;
							int i_1857_;
							if ((i_1857_ = (i_1854_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12))) >= 0) {
								i_1857_ = (anInt9004 - i_1857_) / anInt9004;
								i_1856_ += i_1857_;
								i_1854_ += anInt9004 * i_1857_;
								i_1855_ += anInt8991 * i_1857_;
								i_1853_ += i_1857_;
							}
							if ((i_1857_ = (i_1854_ - anInt9004) / anInt9004) > i_1856_)
								i_1856_ = i_1857_;
							if (i_1855_ < 0) {
								i_1857_ = (anInt8991 - 1 - i_1855_) / anInt8991;
								i_1856_ += i_1857_;
								i_1854_ += anInt9004 * i_1857_;
								i_1855_ += anInt8991 * i_1857_;
								i_1853_ += i_1857_;
							}
							if ((i_1857_ = (1 + i_1855_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_1856_)
								i_1856_ = i_1857_;
							int i_1858_ = is[i_1852_] - i;
							int i_1859_ = -is_1793_[i_1852_];
							int i_1860_ = i_1858_ - (i_1853_ - anInt9003);
							if (i_1860_ > 0) {
								i_1853_ += i_1860_;
								i_1856_ += i_1860_;
								i_1854_ += anInt9004 * i_1860_;
								i_1855_ += anInt8991 * i_1860_;
							} else
								i_1859_ -= i_1860_;
							if (i_1856_ < i_1859_)
								i_1856_ = i_1859_;
							for (/**/; i_1856_ < 0; i_1856_++) {
								int i_1861_ = (((Class57_Sub1_Sub3) this).aByteArray9967[((i_1855_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010 + (i_1854_ >> 12))]);
								if (i_1861_ != 0)
									is_1795_[i_1853_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1861_ & 0xff]);
								else
									i_1853_++;
								i_1854_ += anInt9004;
								i_1855_ += anInt8991;
							}
						}
						i_1851_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_1862_ = anInt9001;
				while (i_1862_ < 0) {
					int i_1863_ = i_1862_ + i_1794_;
					if (i_1863_ >= 0) {
						if (i_1863_ >= is.length)
							break;
						int i_1864_ = anInt9003;
						int i_1865_ = anInt8988 + anInt9012;
						int i_1866_ = anInt9011;
						int i_1867_ = anInt8999;
						if (i_1866_ >= 0 && i_1866_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) < 0) {
							if (i_1865_ < 0) {
								int i_1868_ = (anInt9004 - 1 - i_1865_) / anInt9004;
								i_1867_ += i_1868_;
								i_1865_ += anInt9004 * i_1868_;
								i_1864_ += i_1868_;
							}
							int i_1869_;
							if ((i_1869_ = (1 + i_1865_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1867_)
								i_1867_ = i_1869_;
							int i_1870_ = is[i_1863_] - i;
							int i_1871_ = -is_1793_[i_1863_];
							int i_1872_ = i_1870_ - (i_1864_ - anInt9003);
							if (i_1872_ > 0) {
								i_1864_ += i_1872_;
								i_1867_ += i_1872_;
								i_1865_ += anInt9004 * i_1872_;
								i_1866_ += anInt8991 * i_1872_;
							} else
								i_1871_ -= i_1872_;
							if (i_1867_ < i_1871_)
								i_1867_ = i_1871_;
							for (/**/; i_1867_ < 0; i_1867_++) {
								int i_1873_ = (((Class57_Sub1_Sub3) this).aByteArray9967[((i_1866_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010 + (i_1865_ >> 12))]);
								if (i_1873_ != 0)
									is_1795_[i_1864_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1873_ & 0xff]);
								else
									i_1864_++;
								i_1865_ += anInt9004;
							}
						}
					}
					i_1862_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				int i_1874_ = anInt9001;
				while (i_1874_ < 0) {
					int i_1875_ = i_1874_ + i_1794_;
					if (i_1875_ >= 0) {
						if (i_1875_ >= is.length)
							break;
						int i_1876_ = anInt9003;
						int i_1877_ = anInt8988 + anInt9012;
						int i_1878_ = anInt9011 + anInt9013;
						int i_1879_ = anInt8999;
						if (i_1877_ < 0) {
							int i_1880_ = (anInt9004 - 1 - i_1877_) / anInt9004;
							i_1879_ += i_1880_;
							i_1877_ += anInt9004 * i_1880_;
							i_1878_ += anInt8991 * i_1880_;
							i_1876_ += i_1880_;
						}
						int i_1881_;
						if ((i_1881_ = (1 + i_1877_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1879_)
							i_1879_ = i_1881_;
						if ((i_1881_ = i_1878_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) >= 0) {
							i_1881_ = (anInt8991 - i_1881_) / anInt8991;
							i_1879_ += i_1881_;
							i_1877_ += anInt9004 * i_1881_;
							i_1878_ += anInt8991 * i_1881_;
							i_1876_ += i_1881_;
						}
						if ((i_1881_ = (i_1878_ - anInt8991) / anInt8991) > i_1879_)
							i_1879_ = i_1881_;
						int i_1882_ = is[i_1875_] - i;
						int i_1883_ = -is_1793_[i_1875_];
						int i_1884_ = i_1882_ - (i_1876_ - anInt9003);
						if (i_1884_ > 0) {
							i_1876_ += i_1884_;
							i_1879_ += i_1884_;
							i_1877_ += anInt9004 * i_1884_;
							i_1878_ += anInt8991 * i_1884_;
						} else
							i_1883_ -= i_1884_;
						if (i_1879_ < i_1883_)
							i_1879_ = i_1883_;
						for (/**/; i_1879_ < 0; i_1879_++) {
							int i_1885_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_1878_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_1877_ >> 12))]);
							if (i_1885_ != 0)
								is_1795_[i_1876_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1885_ & 0xff]);
							else
								i_1876_++;
							i_1877_ += anInt9004;
							i_1878_ += anInt8991;
						}
					}
					i_1874_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				int i_1886_ = anInt9001;
				while (i_1886_ < 0) {
					int i_1887_ = i_1886_ + i_1794_;
					if (i_1887_ >= 0) {
						if (i_1887_ >= is.length)
							break;
						int i_1888_ = anInt9003;
						int i_1889_ = anInt8988 + anInt9012;
						int i_1890_ = anInt9011 + anInt9013;
						int i_1891_ = anInt8999;
						if (i_1889_ < 0) {
							int i_1892_ = (anInt9004 - 1 - i_1889_) / anInt9004;
							i_1891_ += i_1892_;
							i_1889_ += anInt9004 * i_1892_;
							i_1890_ += anInt8991 * i_1892_;
							i_1888_ += i_1892_;
						}
						int i_1893_;
						if ((i_1893_ = (1 + i_1889_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1891_)
							i_1891_ = i_1893_;
						if (i_1890_ < 0) {
							i_1893_ = (anInt8991 - 1 - i_1890_) / anInt8991;
							i_1891_ += i_1893_;
							i_1889_ += anInt9004 * i_1893_;
							i_1890_ += anInt8991 * i_1893_;
							i_1888_ += i_1893_;
						}
						if ((i_1893_ = (1 + i_1890_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_1891_)
							i_1891_ = i_1893_;
						int i_1894_ = is[i_1887_] - i;
						int i_1895_ = -is_1793_[i_1887_];
						int i_1896_ = i_1894_ - (i_1888_ - anInt9003);
						if (i_1896_ > 0) {
							i_1888_ += i_1896_;
							i_1891_ += i_1896_;
							i_1889_ += anInt9004 * i_1896_;
							i_1890_ += anInt8991 * i_1896_;
						} else
							i_1895_ -= i_1896_;
						if (i_1891_ < i_1895_)
							i_1891_ = i_1895_;
						for (/**/; i_1891_ < 0; i_1891_++) {
							int i_1897_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_1890_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_1889_ >> 12))]);
							if (i_1897_ != 0)
								is_1795_[i_1888_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1897_ & 0xff]);
							else
								i_1888_++;
							i_1889_ += anInt9004;
							i_1890_ += anInt8991;
						}
					}
					i_1886_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	public Interface8_Impl1_Impl1 method647() {
		throw new IllegalStateException();
	}

	public void method643(int i, int i_1898_, int i_1899_, int i_1900_, int i_1901_) {
		if (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			int i_1902_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			i += ((Class57_Sub1_Sub3) this).anInt8990;
			i_1898_ += ((Class57_Sub1_Sub3) this).anInt9000;
			int i_1903_ = i_1898_ * i_1902_ + i;
			int i_1904_ = 0;
			int i_1905_ = ((Class57_Sub1_Sub3) this).anInt8989;
			int i_1906_ = ((Class57_Sub1_Sub3) this).anInt9010;
			int i_1907_ = i_1902_ - i_1906_;
			int i_1908_ = 0;
			if (i_1898_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_1909_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_1898_);
				i_1905_ -= i_1909_;
				i_1898_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_1904_ += i_1909_ * i_1906_;
				i_1903_ += i_1909_ * i_1902_;
			}
			if (i_1898_ + i_1905_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_1905_ -= (i_1898_ + i_1905_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_1910_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_1906_ -= i_1910_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_1904_ += i_1910_;
				i_1903_ += i_1910_;
				i_1908_ += i_1910_;
				i_1907_ += i_1910_;
			}
			if (i + i_1906_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_1911_ = (i + i_1906_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_1906_ -= i_1911_;
				i_1908_ += i_1911_;
				i_1907_ += i_1911_;
			}
			if (i_1906_ > 0 && i_1905_ > 0) {
				if (i_1901_ == 0) {
					if (i_1899_ == 1) {
						for (int i_1912_ = -i_1905_; i_1912_ < 0; i_1912_++) {
							int i_1913_ = i_1903_ + i_1906_ - 3;
							while (i_1903_ < i_1913_) {
								is[i_1903_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]) & 0xff]);
								is[i_1903_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]) & 0xff]);
								is[i_1903_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]) & 0xff]);
								is[i_1903_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]) & 0xff]);
							}
							i_1913_ += 3;
							while (i_1903_ < i_1913_)
								is[i_1903_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]) & 0xff]);
							i_1903_ += i_1907_;
							i_1904_ += i_1908_;
						}
					} else if (i_1899_ == 0) {
						int i_1914_ = (i_1900_ & 0xff0000) >> 16;
						int i_1915_ = (i_1900_ & 0xff00) >> 8;
						int i_1916_ = i_1900_ & 0xff;
						for (int i_1917_ = -i_1905_; i_1917_ < 0; i_1917_++) {
							for (int i_1918_ = -i_1906_; i_1918_ < 0; i_1918_++) {
								int i_1919_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]) & 0xff]);
								int i_1920_ = ((i_1919_ & 0xff0000) * i_1914_ & ~0xffffff);
								int i_1921_ = (i_1919_ & 0xff00) * i_1915_ & 0xff0000;
								int i_1922_ = (i_1919_ & 0xff) * i_1916_ & 0xff00;
								is[i_1903_++] = (i_1920_ | i_1921_ | i_1922_) >>> 8;
							}
							i_1903_ += i_1907_;
							i_1904_ += i_1908_;
						}
					} else if (i_1899_ == 3) {
						for (int i_1923_ = -i_1905_; i_1923_ < 0; i_1923_++) {
							for (int i_1924_ = -i_1906_; i_1924_ < 0; i_1924_++) {
								int i_1925_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]) & 0xff]);
								int i_1926_ = i_1925_ + i_1900_;
								int i_1927_ = ((i_1925_ & 0xff00ff) + (i_1900_ & 0xff00ff));
								int i_1928_ = ((i_1927_ & 0x1000100) + (i_1926_ - i_1927_ & 0x10000));
								is[i_1903_++] = i_1926_ - i_1928_ | i_1928_ - (i_1928_ >>> 8);
							}
							i_1903_ += i_1907_;
							i_1904_ += i_1908_;
						}
					} else if (i_1899_ == 2) {
						int i_1929_ = i_1900_ >>> 24;
						int i_1930_ = 256 - i_1929_;
						int i_1931_ = (i_1900_ & 0xff00ff) * i_1930_ & ~0xff00ff;
						int i_1932_ = (i_1900_ & 0xff00) * i_1930_ & 0xff0000;
						i_1900_ = (i_1931_ | i_1932_) >>> 8;
						for (int i_1933_ = -i_1905_; i_1933_ < 0; i_1933_++) {
							for (int i_1934_ = -i_1906_; i_1934_ < 0; i_1934_++) {
								int i_1935_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]) & 0xff]);
								i_1931_ = ((i_1935_ & 0xff00ff) * i_1929_ & ~0xff00ff);
								i_1932_ = (i_1935_ & 0xff00) * i_1929_ & 0xff0000;
								is[i_1903_++] = ((i_1931_ | i_1932_) >>> 8) + i_1900_;
							}
							i_1903_ += i_1907_;
							i_1904_ += i_1908_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1901_ == 1) {
					if (i_1899_ == 1) {
						for (int i_1936_ = -i_1905_; i_1936_ < 0; i_1936_++) {
							for (int i_1937_ = -i_1906_; i_1937_ < 0; i_1937_++) {
								int i_1938_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]);
								if (i_1938_ != 0) {
									int i_1939_ = ((((Class57_Sub1_Sub3) this).anIntArray9968[i_1938_ & 0xff]) | ~0xffffff);
									int i_1940_ = 255;
									int i_1941_ = 0;
									int i_1942_ = is[i_1903_];
									is[i_1903_++] = (((((i_1939_ & 0xff00ff) * i_1940_ + (i_1942_ & 0xff00ff) * i_1941_) & ~0xff00ff) >> 8) + (((((i_1939_ & ~0xff00ff) >>> 8) * i_1940_) + (((i_1942_ & ~0xff00ff) >>> 8) * i_1941_)) & ~0xff00ff));
								} else
									i_1903_++;
							}
							i_1903_ += i_1907_;
							i_1904_ += i_1908_;
						}
					} else if (i_1899_ == 0) {
						if ((i_1900_ & 0xffffff) == 16777215) {
							int i_1943_ = i_1900_ >>> 24;
							int i_1944_ = 256 - i_1943_;
							for (int i_1945_ = -i_1905_; i_1945_ < 0; i_1945_++) {
								for (int i_1946_ = -i_1906_; i_1946_ < 0; i_1946_++) {
									int i_1947_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]);
									if (i_1947_ != 0) {
										int i_1948_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1947_ & 0xff]);
										int i_1949_ = is[i_1903_];
										is[i_1903_++] = ((((i_1948_ & 0xff00ff) * i_1943_ + ((i_1949_ & 0xff00ff) * i_1944_)) & ~0xff00ff) + (((i_1948_ & 0xff00) * i_1943_ + ((i_1949_ & 0xff00) * i_1944_)) & 0xff0000)) >> 8;
									} else
										i_1903_++;
								}
								i_1903_ += i_1907_;
								i_1904_ += i_1908_;
							}
						} else {
							int i_1950_ = (i_1900_ & 0xff0000) >> 16;
							int i_1951_ = (i_1900_ & 0xff00) >> 8;
							int i_1952_ = i_1900_ & 0xff;
							int i_1953_ = i_1900_ >>> 24;
							int i_1954_ = 256 - i_1953_;
							for (int i_1955_ = -i_1905_; i_1955_ < 0; i_1955_++) {
								for (int i_1956_ = -i_1906_; i_1956_ < 0; i_1956_++) {
									int i_1957_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]);
									if (i_1957_ != 0) {
										int i_1958_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1957_ & 0xff]);
										if (i_1953_ != 255) {
											int i_1959_ = (((i_1958_ & 0xff0000) * i_1950_) & ~0xffffff);
											int i_1960_ = ((i_1958_ & 0xff00) * i_1951_ & 0xff0000);
											int i_1961_ = ((i_1958_ & 0xff) * i_1952_ & 0xff00);
											i_1958_ = (i_1959_ | i_1960_ | i_1961_) >>> 8;
											int i_1962_ = is[i_1903_];
											is[i_1903_++] = (((((i_1958_ & 0xff00ff) * i_1953_) + ((i_1962_ & 0xff00ff) * i_1954_)) & ~0xff00ff) + ((((i_1958_ & 0xff00) * i_1953_) + ((i_1962_ & 0xff00) * i_1954_)) & 0xff0000)) >> 8;
										} else {
											int i_1963_ = (((i_1958_ & 0xff0000) * i_1950_) & ~0xffffff);
											int i_1964_ = ((i_1958_ & 0xff00) * i_1951_ & 0xff0000);
											int i_1965_ = ((i_1958_ & 0xff) * i_1952_ & 0xff00);
											is[i_1903_++] = (i_1963_ | i_1964_ | i_1965_) >>> 8;
										}
									} else
										i_1903_++;
								}
								i_1903_ += i_1907_;
								i_1904_ += i_1908_;
							}
						}
					} else if (i_1899_ == 3) {
						int i_1966_ = i_1900_ >>> 24;
						int i_1967_ = 256 - i_1966_;
						for (int i_1968_ = -i_1905_; i_1968_ < 0; i_1968_++) {
							for (int i_1969_ = -i_1906_; i_1969_ < 0; i_1969_++) {
								byte i_1970_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]);
								int i_1971_ = (i_1970_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_1970_]) : 0);
								int i_1972_ = i_1971_ + i_1900_;
								int i_1973_ = ((i_1971_ & 0xff00ff) + (i_1900_ & 0xff00ff));
								int i_1974_ = ((i_1973_ & 0x1000100) + (i_1972_ - i_1973_ & 0x10000));
								i_1974_ = i_1972_ - i_1974_ | i_1974_ - (i_1974_ >>> 8);
								if (i_1971_ == 0 && i_1966_ != 255) {
									i_1971_ = i_1974_;
									i_1974_ = is[i_1903_];
									i_1974_ = ((((i_1971_ & 0xff00ff) * i_1966_ + (i_1974_ & 0xff00ff) * i_1967_) & ~0xff00ff) + (((i_1971_ & 0xff00) * i_1966_ + (i_1974_ & 0xff00) * i_1967_) & 0xff0000)) >> 8;
								}
								is[i_1903_++] = i_1974_;
							}
							i_1903_ += i_1907_;
							i_1904_ += i_1908_;
						}
					} else if (i_1899_ == 2) {
						int i_1975_ = i_1900_ >>> 24;
						int i_1976_ = 256 - i_1975_;
						int i_1977_ = (i_1900_ & 0xff00ff) * i_1976_ & ~0xff00ff;
						int i_1978_ = (i_1900_ & 0xff00) * i_1976_ & 0xff0000;
						i_1900_ = (i_1977_ | i_1978_) >>> 8;
						for (int i_1979_ = -i_1905_; i_1979_ < 0; i_1979_++) {
							for (int i_1980_ = -i_1906_; i_1980_ < 0; i_1980_++) {
								int i_1981_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]);
								if (i_1981_ != 0) {
									int i_1982_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1981_ & 0xff]);
									i_1977_ = ((i_1982_ & 0xff00ff) * i_1975_ & ~0xff00ff);
									i_1978_ = ((i_1982_ & 0xff00) * i_1975_ & 0xff0000);
									is[i_1903_++] = ((i_1977_ | i_1978_) >>> 8) + i_1900_;
								} else
									i_1903_++;
							}
							i_1903_ += i_1907_;
							i_1904_ += i_1908_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1901_ == 2) {
					if (i_1899_ == 1) {
						for (int i_1983_ = -i_1905_; i_1983_ < 0; i_1983_++) {
							for (int i_1984_ = -i_1906_; i_1984_ < 0; i_1984_++) {
								int i_1985_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]);
								if (i_1985_ != 0) {
									int i_1986_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1985_ & 0xff]);
									int i_1987_ = is[i_1903_];
									int i_1988_ = i_1986_ + i_1987_;
									int i_1989_ = ((i_1986_ & 0xff00ff) + (i_1987_ & 0xff00ff));
									i_1987_ = ((i_1989_ & 0x1000100) + (i_1988_ - i_1989_ & 0x10000));
									is[i_1903_++] = (i_1988_ - i_1987_ | i_1987_ - (i_1987_ >>> 8));
								} else
									i_1903_++;
							}
							i_1903_ += i_1907_;
							i_1904_ += i_1908_;
						}
					} else if (i_1899_ == 0) {
						int i_1990_ = (i_1900_ & 0xff0000) >> 16;
						int i_1991_ = (i_1900_ & 0xff00) >> 8;
						int i_1992_ = i_1900_ & 0xff;
						for (int i_1993_ = -i_1905_; i_1993_ < 0; i_1993_++) {
							for (int i_1994_ = -i_1906_; i_1994_ < 0; i_1994_++) {
								int i_1995_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]);
								if (i_1995_ != 0) {
									int i_1996_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_1995_ & 0xff]);
									int i_1997_ = ((i_1996_ & 0xff0000) * i_1990_ & ~0xffffff);
									int i_1998_ = ((i_1996_ & 0xff00) * i_1991_ & 0xff0000);
									int i_1999_ = (i_1996_ & 0xff) * i_1992_ & 0xff00;
									i_1996_ = (i_1997_ | i_1998_ | i_1999_) >>> 8;
									int i_2000_ = is[i_1903_];
									int i_2001_ = i_1996_ + i_2000_;
									int i_2002_ = ((i_1996_ & 0xff00ff) + (i_2000_ & 0xff00ff));
									i_2000_ = ((i_2002_ & 0x1000100) + (i_2001_ - i_2002_ & 0x10000));
									is[i_1903_++] = (i_2001_ - i_2000_ | i_2000_ - (i_2000_ >>> 8));
								} else
									i_1903_++;
							}
							i_1903_ += i_1907_;
							i_1904_ += i_1908_;
						}
					} else if (i_1899_ == 3) {
						for (int i_2003_ = -i_1905_; i_2003_ < 0; i_2003_++) {
							for (int i_2004_ = -i_1906_; i_2004_ < 0; i_2004_++) {
								byte i_2005_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]);
								int i_2006_ = (i_2005_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2005_]) : 0);
								int i_2007_ = i_2006_ + i_1900_;
								int i_2008_ = ((i_2006_ & 0xff00ff) + (i_1900_ & 0xff00ff));
								int i_2009_ = ((i_2008_ & 0x1000100) + (i_2007_ - i_2008_ & 0x10000));
								i_2006_ = i_2007_ - i_2009_ | i_2009_ - (i_2009_ >>> 8);
								i_2009_ = is[i_1903_];
								i_2007_ = i_2006_ + i_2009_;
								i_2008_ = (i_2006_ & 0xff00ff) + (i_2009_ & 0xff00ff);
								i_2009_ = ((i_2008_ & 0x1000100) + (i_2007_ - i_2008_ & 0x10000));
								is[i_1903_++] = i_2007_ - i_2009_ | i_2009_ - (i_2009_ >>> 8);
							}
							i_1903_ += i_1907_;
							i_1904_ += i_1908_;
						}
					} else if (i_1899_ == 2) {
						int i_2010_ = i_1900_ >>> 24;
						int i_2011_ = 256 - i_2010_;
						int i_2012_ = (i_1900_ & 0xff00ff) * i_2011_ & ~0xff00ff;
						int i_2013_ = (i_1900_ & 0xff00) * i_2011_ & 0xff0000;
						i_1900_ = (i_2012_ | i_2013_) >>> 8;
						for (int i_2014_ = -i_1905_; i_2014_ < 0; i_2014_++) {
							for (int i_2015_ = -i_1906_; i_2015_ < 0; i_2015_++) {
								int i_2016_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_1904_++]);
								if (i_2016_ != 0) {
									int i_2017_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2016_ & 0xff]);
									i_2012_ = ((i_2017_ & 0xff00ff) * i_2010_ & ~0xff00ff);
									i_2013_ = ((i_2017_ & 0xff00) * i_2010_ & 0xff0000);
									i_2017_ = (((i_2012_ | i_2013_) >>> 8) + i_1900_);
									int i_2018_ = is[i_1903_];
									int i_2019_ = i_2017_ + i_2018_;
									int i_2020_ = ((i_2017_ & 0xff00ff) + (i_2018_ & 0xff00ff));
									i_2018_ = ((i_2020_ & 0x1000100) + (i_2019_ - i_2020_ & 0x10000));
									is[i_1903_++] = (i_2019_ - i_2018_ | i_2018_ - (i_2018_ >>> 8));
								} else
									i_1903_++;
							}
							i_1903_ += i_1907_;
							i_1904_ += i_1908_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method649(int i, int i_2021_, int i_2022_, int i_2023_, int i_2024_) {
		if (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			int i_2025_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			i += ((Class57_Sub1_Sub3) this).anInt8990;
			i_2021_ += ((Class57_Sub1_Sub3) this).anInt9000;
			int i_2026_ = i_2021_ * i_2025_ + i;
			int i_2027_ = 0;
			int i_2028_ = ((Class57_Sub1_Sub3) this).anInt8989;
			int i_2029_ = ((Class57_Sub1_Sub3) this).anInt9010;
			int i_2030_ = i_2025_ - i_2029_;
			int i_2031_ = 0;
			if (i_2021_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_2032_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_2021_);
				i_2028_ -= i_2032_;
				i_2021_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_2027_ += i_2032_ * i_2029_;
				i_2026_ += i_2032_ * i_2025_;
			}
			if (i_2021_ + i_2028_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_2028_ -= (i_2021_ + i_2028_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_2033_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_2029_ -= i_2033_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_2027_ += i_2033_;
				i_2026_ += i_2033_;
				i_2031_ += i_2033_;
				i_2030_ += i_2033_;
			}
			if (i + i_2029_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_2034_ = (i + i_2029_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_2029_ -= i_2034_;
				i_2031_ += i_2034_;
				i_2030_ += i_2034_;
			}
			if (i_2029_ > 0 && i_2028_ > 0) {
				if (i_2024_ == 0) {
					if (i_2022_ == 1) {
						for (int i_2035_ = -i_2028_; i_2035_ < 0; i_2035_++) {
							int i_2036_ = i_2026_ + i_2029_ - 3;
							while (i_2026_ < i_2036_) {
								is[i_2026_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]) & 0xff]);
								is[i_2026_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]) & 0xff]);
								is[i_2026_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]) & 0xff]);
								is[i_2026_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]) & 0xff]);
							}
							i_2036_ += 3;
							while (i_2026_ < i_2036_)
								is[i_2026_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]) & 0xff]);
							i_2026_ += i_2030_;
							i_2027_ += i_2031_;
						}
					} else if (i_2022_ == 0) {
						int i_2037_ = (i_2023_ & 0xff0000) >> 16;
						int i_2038_ = (i_2023_ & 0xff00) >> 8;
						int i_2039_ = i_2023_ & 0xff;
						for (int i_2040_ = -i_2028_; i_2040_ < 0; i_2040_++) {
							for (int i_2041_ = -i_2029_; i_2041_ < 0; i_2041_++) {
								int i_2042_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]) & 0xff]);
								int i_2043_ = ((i_2042_ & 0xff0000) * i_2037_ & ~0xffffff);
								int i_2044_ = (i_2042_ & 0xff00) * i_2038_ & 0xff0000;
								int i_2045_ = (i_2042_ & 0xff) * i_2039_ & 0xff00;
								is[i_2026_++] = (i_2043_ | i_2044_ | i_2045_) >>> 8;
							}
							i_2026_ += i_2030_;
							i_2027_ += i_2031_;
						}
					} else if (i_2022_ == 3) {
						for (int i_2046_ = -i_2028_; i_2046_ < 0; i_2046_++) {
							for (int i_2047_ = -i_2029_; i_2047_ < 0; i_2047_++) {
								int i_2048_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]) & 0xff]);
								int i_2049_ = i_2048_ + i_2023_;
								int i_2050_ = ((i_2048_ & 0xff00ff) + (i_2023_ & 0xff00ff));
								int i_2051_ = ((i_2050_ & 0x1000100) + (i_2049_ - i_2050_ & 0x10000));
								is[i_2026_++] = i_2049_ - i_2051_ | i_2051_ - (i_2051_ >>> 8);
							}
							i_2026_ += i_2030_;
							i_2027_ += i_2031_;
						}
					} else if (i_2022_ == 2) {
						int i_2052_ = i_2023_ >>> 24;
						int i_2053_ = 256 - i_2052_;
						int i_2054_ = (i_2023_ & 0xff00ff) * i_2053_ & ~0xff00ff;
						int i_2055_ = (i_2023_ & 0xff00) * i_2053_ & 0xff0000;
						i_2023_ = (i_2054_ | i_2055_) >>> 8;
						for (int i_2056_ = -i_2028_; i_2056_ < 0; i_2056_++) {
							for (int i_2057_ = -i_2029_; i_2057_ < 0; i_2057_++) {
								int i_2058_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]) & 0xff]);
								i_2054_ = ((i_2058_ & 0xff00ff) * i_2052_ & ~0xff00ff);
								i_2055_ = (i_2058_ & 0xff00) * i_2052_ & 0xff0000;
								is[i_2026_++] = ((i_2054_ | i_2055_) >>> 8) + i_2023_;
							}
							i_2026_ += i_2030_;
							i_2027_ += i_2031_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2024_ == 1) {
					if (i_2022_ == 1) {
						for (int i_2059_ = -i_2028_; i_2059_ < 0; i_2059_++) {
							for (int i_2060_ = -i_2029_; i_2060_ < 0; i_2060_++) {
								int i_2061_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]);
								if (i_2061_ != 0) {
									int i_2062_ = ((((Class57_Sub1_Sub3) this).anIntArray9968[i_2061_ & 0xff]) | ~0xffffff);
									int i_2063_ = 255;
									int i_2064_ = 0;
									int i_2065_ = is[i_2026_];
									is[i_2026_++] = (((((i_2062_ & 0xff00ff) * i_2063_ + (i_2065_ & 0xff00ff) * i_2064_) & ~0xff00ff) >> 8) + (((((i_2062_ & ~0xff00ff) >>> 8) * i_2063_) + (((i_2065_ & ~0xff00ff) >>> 8) * i_2064_)) & ~0xff00ff));
								} else
									i_2026_++;
							}
							i_2026_ += i_2030_;
							i_2027_ += i_2031_;
						}
					} else if (i_2022_ == 0) {
						if ((i_2023_ & 0xffffff) == 16777215) {
							int i_2066_ = i_2023_ >>> 24;
							int i_2067_ = 256 - i_2066_;
							for (int i_2068_ = -i_2028_; i_2068_ < 0; i_2068_++) {
								for (int i_2069_ = -i_2029_; i_2069_ < 0; i_2069_++) {
									int i_2070_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]);
									if (i_2070_ != 0) {
										int i_2071_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2070_ & 0xff]);
										int i_2072_ = is[i_2026_];
										is[i_2026_++] = ((((i_2071_ & 0xff00ff) * i_2066_ + ((i_2072_ & 0xff00ff) * i_2067_)) & ~0xff00ff) + (((i_2071_ & 0xff00) * i_2066_ + ((i_2072_ & 0xff00) * i_2067_)) & 0xff0000)) >> 8;
									} else
										i_2026_++;
								}
								i_2026_ += i_2030_;
								i_2027_ += i_2031_;
							}
						} else {
							int i_2073_ = (i_2023_ & 0xff0000) >> 16;
							int i_2074_ = (i_2023_ & 0xff00) >> 8;
							int i_2075_ = i_2023_ & 0xff;
							int i_2076_ = i_2023_ >>> 24;
							int i_2077_ = 256 - i_2076_;
							for (int i_2078_ = -i_2028_; i_2078_ < 0; i_2078_++) {
								for (int i_2079_ = -i_2029_; i_2079_ < 0; i_2079_++) {
									int i_2080_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]);
									if (i_2080_ != 0) {
										int i_2081_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2080_ & 0xff]);
										if (i_2076_ != 255) {
											int i_2082_ = (((i_2081_ & 0xff0000) * i_2073_) & ~0xffffff);
											int i_2083_ = ((i_2081_ & 0xff00) * i_2074_ & 0xff0000);
											int i_2084_ = ((i_2081_ & 0xff) * i_2075_ & 0xff00);
											i_2081_ = (i_2082_ | i_2083_ | i_2084_) >>> 8;
											int i_2085_ = is[i_2026_];
											is[i_2026_++] = (((((i_2081_ & 0xff00ff) * i_2076_) + ((i_2085_ & 0xff00ff) * i_2077_)) & ~0xff00ff) + ((((i_2081_ & 0xff00) * i_2076_) + ((i_2085_ & 0xff00) * i_2077_)) & 0xff0000)) >> 8;
										} else {
											int i_2086_ = (((i_2081_ & 0xff0000) * i_2073_) & ~0xffffff);
											int i_2087_ = ((i_2081_ & 0xff00) * i_2074_ & 0xff0000);
											int i_2088_ = ((i_2081_ & 0xff) * i_2075_ & 0xff00);
											is[i_2026_++] = (i_2086_ | i_2087_ | i_2088_) >>> 8;
										}
									} else
										i_2026_++;
								}
								i_2026_ += i_2030_;
								i_2027_ += i_2031_;
							}
						}
					} else if (i_2022_ == 3) {
						int i_2089_ = i_2023_ >>> 24;
						int i_2090_ = 256 - i_2089_;
						for (int i_2091_ = -i_2028_; i_2091_ < 0; i_2091_++) {
							for (int i_2092_ = -i_2029_; i_2092_ < 0; i_2092_++) {
								byte i_2093_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]);
								int i_2094_ = (i_2093_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2093_]) : 0);
								int i_2095_ = i_2094_ + i_2023_;
								int i_2096_ = ((i_2094_ & 0xff00ff) + (i_2023_ & 0xff00ff));
								int i_2097_ = ((i_2096_ & 0x1000100) + (i_2095_ - i_2096_ & 0x10000));
								i_2097_ = i_2095_ - i_2097_ | i_2097_ - (i_2097_ >>> 8);
								if (i_2094_ == 0 && i_2089_ != 255) {
									i_2094_ = i_2097_;
									i_2097_ = is[i_2026_];
									i_2097_ = ((((i_2094_ & 0xff00ff) * i_2089_ + (i_2097_ & 0xff00ff) * i_2090_) & ~0xff00ff) + (((i_2094_ & 0xff00) * i_2089_ + (i_2097_ & 0xff00) * i_2090_) & 0xff0000)) >> 8;
								}
								is[i_2026_++] = i_2097_;
							}
							i_2026_ += i_2030_;
							i_2027_ += i_2031_;
						}
					} else if (i_2022_ == 2) {
						int i_2098_ = i_2023_ >>> 24;
						int i_2099_ = 256 - i_2098_;
						int i_2100_ = (i_2023_ & 0xff00ff) * i_2099_ & ~0xff00ff;
						int i_2101_ = (i_2023_ & 0xff00) * i_2099_ & 0xff0000;
						i_2023_ = (i_2100_ | i_2101_) >>> 8;
						for (int i_2102_ = -i_2028_; i_2102_ < 0; i_2102_++) {
							for (int i_2103_ = -i_2029_; i_2103_ < 0; i_2103_++) {
								int i_2104_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]);
								if (i_2104_ != 0) {
									int i_2105_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2104_ & 0xff]);
									i_2100_ = ((i_2105_ & 0xff00ff) * i_2098_ & ~0xff00ff);
									i_2101_ = ((i_2105_ & 0xff00) * i_2098_ & 0xff0000);
									is[i_2026_++] = ((i_2100_ | i_2101_) >>> 8) + i_2023_;
								} else
									i_2026_++;
							}
							i_2026_ += i_2030_;
							i_2027_ += i_2031_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2024_ == 2) {
					if (i_2022_ == 1) {
						for (int i_2106_ = -i_2028_; i_2106_ < 0; i_2106_++) {
							for (int i_2107_ = -i_2029_; i_2107_ < 0; i_2107_++) {
								int i_2108_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]);
								if (i_2108_ != 0) {
									int i_2109_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2108_ & 0xff]);
									int i_2110_ = is[i_2026_];
									int i_2111_ = i_2109_ + i_2110_;
									int i_2112_ = ((i_2109_ & 0xff00ff) + (i_2110_ & 0xff00ff));
									i_2110_ = ((i_2112_ & 0x1000100) + (i_2111_ - i_2112_ & 0x10000));
									is[i_2026_++] = (i_2111_ - i_2110_ | i_2110_ - (i_2110_ >>> 8));
								} else
									i_2026_++;
							}
							i_2026_ += i_2030_;
							i_2027_ += i_2031_;
						}
					} else if (i_2022_ == 0) {
						int i_2113_ = (i_2023_ & 0xff0000) >> 16;
						int i_2114_ = (i_2023_ & 0xff00) >> 8;
						int i_2115_ = i_2023_ & 0xff;
						for (int i_2116_ = -i_2028_; i_2116_ < 0; i_2116_++) {
							for (int i_2117_ = -i_2029_; i_2117_ < 0; i_2117_++) {
								int i_2118_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]);
								if (i_2118_ != 0) {
									int i_2119_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2118_ & 0xff]);
									int i_2120_ = ((i_2119_ & 0xff0000) * i_2113_ & ~0xffffff);
									int i_2121_ = ((i_2119_ & 0xff00) * i_2114_ & 0xff0000);
									int i_2122_ = (i_2119_ & 0xff) * i_2115_ & 0xff00;
									i_2119_ = (i_2120_ | i_2121_ | i_2122_) >>> 8;
									int i_2123_ = is[i_2026_];
									int i_2124_ = i_2119_ + i_2123_;
									int i_2125_ = ((i_2119_ & 0xff00ff) + (i_2123_ & 0xff00ff));
									i_2123_ = ((i_2125_ & 0x1000100) + (i_2124_ - i_2125_ & 0x10000));
									is[i_2026_++] = (i_2124_ - i_2123_ | i_2123_ - (i_2123_ >>> 8));
								} else
									i_2026_++;
							}
							i_2026_ += i_2030_;
							i_2027_ += i_2031_;
						}
					} else if (i_2022_ == 3) {
						for (int i_2126_ = -i_2028_; i_2126_ < 0; i_2126_++) {
							for (int i_2127_ = -i_2029_; i_2127_ < 0; i_2127_++) {
								byte i_2128_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]);
								int i_2129_ = (i_2128_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2128_]) : 0);
								int i_2130_ = i_2129_ + i_2023_;
								int i_2131_ = ((i_2129_ & 0xff00ff) + (i_2023_ & 0xff00ff));
								int i_2132_ = ((i_2131_ & 0x1000100) + (i_2130_ - i_2131_ & 0x10000));
								i_2129_ = i_2130_ - i_2132_ | i_2132_ - (i_2132_ >>> 8);
								i_2132_ = is[i_2026_];
								i_2130_ = i_2129_ + i_2132_;
								i_2131_ = (i_2129_ & 0xff00ff) + (i_2132_ & 0xff00ff);
								i_2132_ = ((i_2131_ & 0x1000100) + (i_2130_ - i_2131_ & 0x10000));
								is[i_2026_++] = i_2130_ - i_2132_ | i_2132_ - (i_2132_ >>> 8);
							}
							i_2026_ += i_2030_;
							i_2027_ += i_2031_;
						}
					} else if (i_2022_ == 2) {
						int i_2133_ = i_2023_ >>> 24;
						int i_2134_ = 256 - i_2133_;
						int i_2135_ = (i_2023_ & 0xff00ff) * i_2134_ & ~0xff00ff;
						int i_2136_ = (i_2023_ & 0xff00) * i_2134_ & 0xff0000;
						i_2023_ = (i_2135_ | i_2136_) >>> 8;
						for (int i_2137_ = -i_2028_; i_2137_ < 0; i_2137_++) {
							for (int i_2138_ = -i_2029_; i_2138_ < 0; i_2138_++) {
								int i_2139_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2027_++]);
								if (i_2139_ != 0) {
									int i_2140_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2139_ & 0xff]);
									i_2135_ = ((i_2140_ & 0xff00ff) * i_2133_ & ~0xff00ff);
									i_2136_ = ((i_2140_ & 0xff00) * i_2133_ & 0xff0000);
									i_2140_ = (((i_2135_ | i_2136_) >>> 8) + i_2023_);
									int i_2141_ = is[i_2026_];
									int i_2142_ = i_2140_ + i_2141_;
									int i_2143_ = ((i_2140_ & 0xff00ff) + (i_2141_ & 0xff00ff));
									i_2141_ = ((i_2143_ & 0x1000100) + (i_2142_ - i_2143_ & 0x10000));
									is[i_2026_++] = (i_2142_ - i_2141_ | i_2141_ - (i_2141_ >>> 8));
								} else
									i_2026_++;
							}
							i_2026_ += i_2030_;
							i_2027_ += i_2031_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method674(int i, int i_2144_, int i_2145_, int i_2146_, int i_2147_) {
		if (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			int i_2148_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			i += ((Class57_Sub1_Sub3) this).anInt8990;
			i_2144_ += ((Class57_Sub1_Sub3) this).anInt9000;
			int i_2149_ = i_2144_ * i_2148_ + i;
			int i_2150_ = 0;
			int i_2151_ = ((Class57_Sub1_Sub3) this).anInt8989;
			int i_2152_ = ((Class57_Sub1_Sub3) this).anInt9010;
			int i_2153_ = i_2148_ - i_2152_;
			int i_2154_ = 0;
			if (i_2144_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_2155_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_2144_);
				i_2151_ -= i_2155_;
				i_2144_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_2150_ += i_2155_ * i_2152_;
				i_2149_ += i_2155_ * i_2148_;
			}
			if (i_2144_ + i_2151_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_2151_ -= (i_2144_ + i_2151_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_2156_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_2152_ -= i_2156_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_2150_ += i_2156_;
				i_2149_ += i_2156_;
				i_2154_ += i_2156_;
				i_2153_ += i_2156_;
			}
			if (i + i_2152_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_2157_ = (i + i_2152_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_2152_ -= i_2157_;
				i_2154_ += i_2157_;
				i_2153_ += i_2157_;
			}
			if (i_2152_ > 0 && i_2151_ > 0) {
				if (i_2147_ == 0) {
					if (i_2145_ == 1) {
						for (int i_2158_ = -i_2151_; i_2158_ < 0; i_2158_++) {
							int i_2159_ = i_2149_ + i_2152_ - 3;
							while (i_2149_ < i_2159_) {
								is[i_2149_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]) & 0xff]);
								is[i_2149_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]) & 0xff]);
								is[i_2149_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]) & 0xff]);
								is[i_2149_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]) & 0xff]);
							}
							i_2159_ += 3;
							while (i_2149_ < i_2159_)
								is[i_2149_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]) & 0xff]);
							i_2149_ += i_2153_;
							i_2150_ += i_2154_;
						}
					} else if (i_2145_ == 0) {
						int i_2160_ = (i_2146_ & 0xff0000) >> 16;
						int i_2161_ = (i_2146_ & 0xff00) >> 8;
						int i_2162_ = i_2146_ & 0xff;
						for (int i_2163_ = -i_2151_; i_2163_ < 0; i_2163_++) {
							for (int i_2164_ = -i_2152_; i_2164_ < 0; i_2164_++) {
								int i_2165_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]) & 0xff]);
								int i_2166_ = ((i_2165_ & 0xff0000) * i_2160_ & ~0xffffff);
								int i_2167_ = (i_2165_ & 0xff00) * i_2161_ & 0xff0000;
								int i_2168_ = (i_2165_ & 0xff) * i_2162_ & 0xff00;
								is[i_2149_++] = (i_2166_ | i_2167_ | i_2168_) >>> 8;
							}
							i_2149_ += i_2153_;
							i_2150_ += i_2154_;
						}
					} else if (i_2145_ == 3) {
						for (int i_2169_ = -i_2151_; i_2169_ < 0; i_2169_++) {
							for (int i_2170_ = -i_2152_; i_2170_ < 0; i_2170_++) {
								int i_2171_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]) & 0xff]);
								int i_2172_ = i_2171_ + i_2146_;
								int i_2173_ = ((i_2171_ & 0xff00ff) + (i_2146_ & 0xff00ff));
								int i_2174_ = ((i_2173_ & 0x1000100) + (i_2172_ - i_2173_ & 0x10000));
								is[i_2149_++] = i_2172_ - i_2174_ | i_2174_ - (i_2174_ >>> 8);
							}
							i_2149_ += i_2153_;
							i_2150_ += i_2154_;
						}
					} else if (i_2145_ == 2) {
						int i_2175_ = i_2146_ >>> 24;
						int i_2176_ = 256 - i_2175_;
						int i_2177_ = (i_2146_ & 0xff00ff) * i_2176_ & ~0xff00ff;
						int i_2178_ = (i_2146_ & 0xff00) * i_2176_ & 0xff0000;
						i_2146_ = (i_2177_ | i_2178_) >>> 8;
						for (int i_2179_ = -i_2151_; i_2179_ < 0; i_2179_++) {
							for (int i_2180_ = -i_2152_; i_2180_ < 0; i_2180_++) {
								int i_2181_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]) & 0xff]);
								i_2177_ = ((i_2181_ & 0xff00ff) * i_2175_ & ~0xff00ff);
								i_2178_ = (i_2181_ & 0xff00) * i_2175_ & 0xff0000;
								is[i_2149_++] = ((i_2177_ | i_2178_) >>> 8) + i_2146_;
							}
							i_2149_ += i_2153_;
							i_2150_ += i_2154_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2147_ == 1) {
					if (i_2145_ == 1) {
						for (int i_2182_ = -i_2151_; i_2182_ < 0; i_2182_++) {
							for (int i_2183_ = -i_2152_; i_2183_ < 0; i_2183_++) {
								int i_2184_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]);
								if (i_2184_ != 0) {
									int i_2185_ = ((((Class57_Sub1_Sub3) this).anIntArray9968[i_2184_ & 0xff]) | ~0xffffff);
									int i_2186_ = 255;
									int i_2187_ = 0;
									int i_2188_ = is[i_2149_];
									is[i_2149_++] = (((((i_2185_ & 0xff00ff) * i_2186_ + (i_2188_ & 0xff00ff) * i_2187_) & ~0xff00ff) >> 8) + (((((i_2185_ & ~0xff00ff) >>> 8) * i_2186_) + (((i_2188_ & ~0xff00ff) >>> 8) * i_2187_)) & ~0xff00ff));
								} else
									i_2149_++;
							}
							i_2149_ += i_2153_;
							i_2150_ += i_2154_;
						}
					} else if (i_2145_ == 0) {
						if ((i_2146_ & 0xffffff) == 16777215) {
							int i_2189_ = i_2146_ >>> 24;
							int i_2190_ = 256 - i_2189_;
							for (int i_2191_ = -i_2151_; i_2191_ < 0; i_2191_++) {
								for (int i_2192_ = -i_2152_; i_2192_ < 0; i_2192_++) {
									int i_2193_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]);
									if (i_2193_ != 0) {
										int i_2194_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2193_ & 0xff]);
										int i_2195_ = is[i_2149_];
										is[i_2149_++] = ((((i_2194_ & 0xff00ff) * i_2189_ + ((i_2195_ & 0xff00ff) * i_2190_)) & ~0xff00ff) + (((i_2194_ & 0xff00) * i_2189_ + ((i_2195_ & 0xff00) * i_2190_)) & 0xff0000)) >> 8;
									} else
										i_2149_++;
								}
								i_2149_ += i_2153_;
								i_2150_ += i_2154_;
							}
						} else {
							int i_2196_ = (i_2146_ & 0xff0000) >> 16;
							int i_2197_ = (i_2146_ & 0xff00) >> 8;
							int i_2198_ = i_2146_ & 0xff;
							int i_2199_ = i_2146_ >>> 24;
							int i_2200_ = 256 - i_2199_;
							for (int i_2201_ = -i_2151_; i_2201_ < 0; i_2201_++) {
								for (int i_2202_ = -i_2152_; i_2202_ < 0; i_2202_++) {
									int i_2203_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]);
									if (i_2203_ != 0) {
										int i_2204_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2203_ & 0xff]);
										if (i_2199_ != 255) {
											int i_2205_ = (((i_2204_ & 0xff0000) * i_2196_) & ~0xffffff);
											int i_2206_ = ((i_2204_ & 0xff00) * i_2197_ & 0xff0000);
											int i_2207_ = ((i_2204_ & 0xff) * i_2198_ & 0xff00);
											i_2204_ = (i_2205_ | i_2206_ | i_2207_) >>> 8;
											int i_2208_ = is[i_2149_];
											is[i_2149_++] = (((((i_2204_ & 0xff00ff) * i_2199_) + ((i_2208_ & 0xff00ff) * i_2200_)) & ~0xff00ff) + ((((i_2204_ & 0xff00) * i_2199_) + ((i_2208_ & 0xff00) * i_2200_)) & 0xff0000)) >> 8;
										} else {
											int i_2209_ = (((i_2204_ & 0xff0000) * i_2196_) & ~0xffffff);
											int i_2210_ = ((i_2204_ & 0xff00) * i_2197_ & 0xff0000);
											int i_2211_ = ((i_2204_ & 0xff) * i_2198_ & 0xff00);
											is[i_2149_++] = (i_2209_ | i_2210_ | i_2211_) >>> 8;
										}
									} else
										i_2149_++;
								}
								i_2149_ += i_2153_;
								i_2150_ += i_2154_;
							}
						}
					} else if (i_2145_ == 3) {
						int i_2212_ = i_2146_ >>> 24;
						int i_2213_ = 256 - i_2212_;
						for (int i_2214_ = -i_2151_; i_2214_ < 0; i_2214_++) {
							for (int i_2215_ = -i_2152_; i_2215_ < 0; i_2215_++) {
								byte i_2216_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]);
								int i_2217_ = (i_2216_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2216_]) : 0);
								int i_2218_ = i_2217_ + i_2146_;
								int i_2219_ = ((i_2217_ & 0xff00ff) + (i_2146_ & 0xff00ff));
								int i_2220_ = ((i_2219_ & 0x1000100) + (i_2218_ - i_2219_ & 0x10000));
								i_2220_ = i_2218_ - i_2220_ | i_2220_ - (i_2220_ >>> 8);
								if (i_2217_ == 0 && i_2212_ != 255) {
									i_2217_ = i_2220_;
									i_2220_ = is[i_2149_];
									i_2220_ = ((((i_2217_ & 0xff00ff) * i_2212_ + (i_2220_ & 0xff00ff) * i_2213_) & ~0xff00ff) + (((i_2217_ & 0xff00) * i_2212_ + (i_2220_ & 0xff00) * i_2213_) & 0xff0000)) >> 8;
								}
								is[i_2149_++] = i_2220_;
							}
							i_2149_ += i_2153_;
							i_2150_ += i_2154_;
						}
					} else if (i_2145_ == 2) {
						int i_2221_ = i_2146_ >>> 24;
						int i_2222_ = 256 - i_2221_;
						int i_2223_ = (i_2146_ & 0xff00ff) * i_2222_ & ~0xff00ff;
						int i_2224_ = (i_2146_ & 0xff00) * i_2222_ & 0xff0000;
						i_2146_ = (i_2223_ | i_2224_) >>> 8;
						for (int i_2225_ = -i_2151_; i_2225_ < 0; i_2225_++) {
							for (int i_2226_ = -i_2152_; i_2226_ < 0; i_2226_++) {
								int i_2227_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]);
								if (i_2227_ != 0) {
									int i_2228_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2227_ & 0xff]);
									i_2223_ = ((i_2228_ & 0xff00ff) * i_2221_ & ~0xff00ff);
									i_2224_ = ((i_2228_ & 0xff00) * i_2221_ & 0xff0000);
									is[i_2149_++] = ((i_2223_ | i_2224_) >>> 8) + i_2146_;
								} else
									i_2149_++;
							}
							i_2149_ += i_2153_;
							i_2150_ += i_2154_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2147_ == 2) {
					if (i_2145_ == 1) {
						for (int i_2229_ = -i_2151_; i_2229_ < 0; i_2229_++) {
							for (int i_2230_ = -i_2152_; i_2230_ < 0; i_2230_++) {
								int i_2231_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]);
								if (i_2231_ != 0) {
									int i_2232_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2231_ & 0xff]);
									int i_2233_ = is[i_2149_];
									int i_2234_ = i_2232_ + i_2233_;
									int i_2235_ = ((i_2232_ & 0xff00ff) + (i_2233_ & 0xff00ff));
									i_2233_ = ((i_2235_ & 0x1000100) + (i_2234_ - i_2235_ & 0x10000));
									is[i_2149_++] = (i_2234_ - i_2233_ | i_2233_ - (i_2233_ >>> 8));
								} else
									i_2149_++;
							}
							i_2149_ += i_2153_;
							i_2150_ += i_2154_;
						}
					} else if (i_2145_ == 0) {
						int i_2236_ = (i_2146_ & 0xff0000) >> 16;
						int i_2237_ = (i_2146_ & 0xff00) >> 8;
						int i_2238_ = i_2146_ & 0xff;
						for (int i_2239_ = -i_2151_; i_2239_ < 0; i_2239_++) {
							for (int i_2240_ = -i_2152_; i_2240_ < 0; i_2240_++) {
								int i_2241_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]);
								if (i_2241_ != 0) {
									int i_2242_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2241_ & 0xff]);
									int i_2243_ = ((i_2242_ & 0xff0000) * i_2236_ & ~0xffffff);
									int i_2244_ = ((i_2242_ & 0xff00) * i_2237_ & 0xff0000);
									int i_2245_ = (i_2242_ & 0xff) * i_2238_ & 0xff00;
									i_2242_ = (i_2243_ | i_2244_ | i_2245_) >>> 8;
									int i_2246_ = is[i_2149_];
									int i_2247_ = i_2242_ + i_2246_;
									int i_2248_ = ((i_2242_ & 0xff00ff) + (i_2246_ & 0xff00ff));
									i_2246_ = ((i_2248_ & 0x1000100) + (i_2247_ - i_2248_ & 0x10000));
									is[i_2149_++] = (i_2247_ - i_2246_ | i_2246_ - (i_2246_ >>> 8));
								} else
									i_2149_++;
							}
							i_2149_ += i_2153_;
							i_2150_ += i_2154_;
						}
					} else if (i_2145_ == 3) {
						for (int i_2249_ = -i_2151_; i_2249_ < 0; i_2249_++) {
							for (int i_2250_ = -i_2152_; i_2250_ < 0; i_2250_++) {
								byte i_2251_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]);
								int i_2252_ = (i_2251_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2251_]) : 0);
								int i_2253_ = i_2252_ + i_2146_;
								int i_2254_ = ((i_2252_ & 0xff00ff) + (i_2146_ & 0xff00ff));
								int i_2255_ = ((i_2254_ & 0x1000100) + (i_2253_ - i_2254_ & 0x10000));
								i_2252_ = i_2253_ - i_2255_ | i_2255_ - (i_2255_ >>> 8);
								i_2255_ = is[i_2149_];
								i_2253_ = i_2252_ + i_2255_;
								i_2254_ = (i_2252_ & 0xff00ff) + (i_2255_ & 0xff00ff);
								i_2255_ = ((i_2254_ & 0x1000100) + (i_2253_ - i_2254_ & 0x10000));
								is[i_2149_++] = i_2253_ - i_2255_ | i_2255_ - (i_2255_ >>> 8);
							}
							i_2149_ += i_2153_;
							i_2150_ += i_2154_;
						}
					} else if (i_2145_ == 2) {
						int i_2256_ = i_2146_ >>> 24;
						int i_2257_ = 256 - i_2256_;
						int i_2258_ = (i_2146_ & 0xff00ff) * i_2257_ & ~0xff00ff;
						int i_2259_ = (i_2146_ & 0xff00) * i_2257_ & 0xff0000;
						i_2146_ = (i_2258_ | i_2259_) >>> 8;
						for (int i_2260_ = -i_2151_; i_2260_ < 0; i_2260_++) {
							for (int i_2261_ = -i_2152_; i_2261_ < 0; i_2261_++) {
								int i_2262_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2150_++]);
								if (i_2262_ != 0) {
									int i_2263_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2262_ & 0xff]);
									i_2258_ = ((i_2263_ & 0xff00ff) * i_2256_ & ~0xff00ff);
									i_2259_ = ((i_2263_ & 0xff00) * i_2256_ & 0xff0000);
									i_2263_ = (((i_2258_ | i_2259_) >>> 8) + i_2146_);
									int i_2264_ = is[i_2149_];
									int i_2265_ = i_2263_ + i_2264_;
									int i_2266_ = ((i_2263_ & 0xff00ff) + (i_2264_ & 0xff00ff));
									i_2264_ = ((i_2266_ & 0x1000100) + (i_2265_ - i_2266_ & 0x10000));
									is[i_2149_++] = (i_2265_ - i_2264_ | i_2264_ - (i_2264_ >>> 8));
								} else
									i_2149_++;
							}
							i_2149_ += i_2153_;
							i_2150_ += i_2154_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method654(int i, int i_2267_, Class_ta class_ta, int i_2268_, int i_2269_) {
		if (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			i += ((Class57_Sub1_Sub3) this).anInt8990;
			i_2267_ += ((Class57_Sub1_Sub3) this).anInt9000;
			int i_2270_ = 0;
			int i_2271_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			int i_2272_ = ((Class57_Sub1_Sub3) this).anInt9010;
			int i_2273_ = ((Class57_Sub1_Sub3) this).anInt8989;
			int i_2274_ = i_2271_ - i_2272_;
			int i_2275_ = 0;
			int i_2276_ = i + i_2267_ * i_2271_;
			if (i_2267_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_2277_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_2267_);
				i_2273_ -= i_2277_;
				i_2267_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_2270_ += i_2277_ * i_2272_;
				i_2276_ += i_2277_ * i_2271_;
			}
			if (i_2267_ + i_2273_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_2273_ -= (i_2267_ + i_2273_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_2278_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_2272_ -= i_2278_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_2270_ += i_2278_;
				i_2276_ += i_2278_;
				i_2275_ += i_2278_;
				i_2274_ += i_2278_;
			}
			if (i + i_2272_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_2279_ = (i + i_2272_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_2272_ -= i_2279_;
				i_2275_ += i_2279_;
				i_2274_ += i_2279_;
			}
			if (i_2272_ > 0 && i_2273_ > 0) {
				Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
				int[] is_2280_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
				int[] is_2281_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
				int i_2282_ = i_2267_;
				if (i_2269_ > i_2282_) {
					i_2282_ = i_2269_;
					i_2276_ += (i_2269_ - i_2267_) * i_2271_;
					i_2270_ += ((i_2269_ - i_2267_) * ((Class57_Sub1_Sub3) this).anInt9010);
				}
				int i_2283_ = (i_2269_ + is_2280_.length < i_2267_ + i_2273_ ? i_2269_ + is_2280_.length : i_2267_ + i_2273_);
				for (int i_2284_ = i_2282_; i_2284_ < i_2283_; i_2284_++) {
					int i_2285_ = is_2280_[i_2284_ - i_2269_] + i_2268_;
					int i_2286_ = is_2281_[i_2284_ - i_2269_];
					int i_2287_ = i_2272_;
					if (i > i_2285_) {
						int i_2288_ = i - i_2285_;
						if (i_2288_ >= i_2286_) {
							i_2270_ += i_2272_ + i_2275_;
							i_2276_ += i_2272_ + i_2274_;
							continue;
						}
						i_2286_ -= i_2288_;
					} else {
						int i_2289_ = i_2285_ - i;
						if (i_2289_ >= i_2272_) {
							i_2270_ += i_2272_ + i_2275_;
							i_2276_ += i_2272_ + i_2274_;
							continue;
						}
						i_2270_ += i_2289_;
						i_2287_ -= i_2289_;
						i_2276_ += i_2289_;
					}
					int i_2290_ = 0;
					if (i_2287_ < i_2286_)
						i_2286_ = i_2287_;
					else
						i_2290_ = i_2287_ - i_2286_;
					for (int i_2291_ = -i_2286_; i_2291_ < 0; i_2291_++) {
						int i_2292_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2270_++]);
						if (i_2292_ != 0)
							is[i_2276_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2292_ & 0xff]);
						else
							i_2276_++;
					}
					i_2270_ += i_2290_ + i_2275_;
					i_2276_ += i_2290_ + i_2274_;
				}
			}
		}
	}

	public void method650(int i, int i_2293_, Class_ta class_ta, int i_2294_, int i_2295_) {
		if (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			i += ((Class57_Sub1_Sub3) this).anInt8990;
			i_2293_ += ((Class57_Sub1_Sub3) this).anInt9000;
			int i_2296_ = 0;
			int i_2297_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			int i_2298_ = ((Class57_Sub1_Sub3) this).anInt9010;
			int i_2299_ = ((Class57_Sub1_Sub3) this).anInt8989;
			int i_2300_ = i_2297_ - i_2298_;
			int i_2301_ = 0;
			int i_2302_ = i + i_2293_ * i_2297_;
			if (i_2293_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_2303_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_2293_);
				i_2299_ -= i_2303_;
				i_2293_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_2296_ += i_2303_ * i_2298_;
				i_2302_ += i_2303_ * i_2297_;
			}
			if (i_2293_ + i_2299_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_2299_ -= (i_2293_ + i_2299_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_2304_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_2298_ -= i_2304_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_2296_ += i_2304_;
				i_2302_ += i_2304_;
				i_2301_ += i_2304_;
				i_2300_ += i_2304_;
			}
			if (i + i_2298_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_2305_ = (i + i_2298_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_2298_ -= i_2305_;
				i_2301_ += i_2305_;
				i_2300_ += i_2305_;
			}
			if (i_2298_ > 0 && i_2299_ > 0) {
				Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
				int[] is_2306_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
				int[] is_2307_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
				int i_2308_ = i_2293_;
				if (i_2295_ > i_2308_) {
					i_2308_ = i_2295_;
					i_2302_ += (i_2295_ - i_2293_) * i_2297_;
					i_2296_ += ((i_2295_ - i_2293_) * ((Class57_Sub1_Sub3) this).anInt9010);
				}
				int i_2309_ = (i_2295_ + is_2306_.length < i_2293_ + i_2299_ ? i_2295_ + is_2306_.length : i_2293_ + i_2299_);
				for (int i_2310_ = i_2308_; i_2310_ < i_2309_; i_2310_++) {
					int i_2311_ = is_2306_[i_2310_ - i_2295_] + i_2294_;
					int i_2312_ = is_2307_[i_2310_ - i_2295_];
					int i_2313_ = i_2298_;
					if (i > i_2311_) {
						int i_2314_ = i - i_2311_;
						if (i_2314_ >= i_2312_) {
							i_2296_ += i_2298_ + i_2301_;
							i_2302_ += i_2298_ + i_2300_;
							continue;
						}
						i_2312_ -= i_2314_;
					} else {
						int i_2315_ = i_2311_ - i;
						if (i_2315_ >= i_2298_) {
							i_2296_ += i_2298_ + i_2301_;
							i_2302_ += i_2298_ + i_2300_;
							continue;
						}
						i_2296_ += i_2315_;
						i_2313_ -= i_2315_;
						i_2302_ += i_2315_;
					}
					int i_2316_ = 0;
					if (i_2313_ < i_2312_)
						i_2312_ = i_2313_;
					else
						i_2316_ = i_2313_ - i_2312_;
					for (int i_2317_ = -i_2312_; i_2317_ < 0; i_2317_++) {
						int i_2318_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2296_++]);
						if (i_2318_ != 0)
							is[i_2302_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2318_ & 0xff]);
						else
							i_2302_++;
					}
					i_2296_ += i_2316_ + i_2301_;
					i_2302_ += i_2316_ + i_2300_;
				}
			}
		}
	}

	void method651(int i, int i_2319_, int i_2320_, int i_2321_, int i_2322_, int i_2323_, int i_2324_, int i_2325_) {
		if (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (i_2320_ > 0 && i_2321_ > 0) {
			int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
			if (is != null) {
				int i_2326_ = 0;
				int i_2327_ = 0;
				int i_2328_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
				int i_2329_ = (((Class57_Sub1_Sub3) this).anInt8990 + ((Class57_Sub1_Sub3) this).anInt9010 + ((Class57_Sub1_Sub3) this).anInt8997);
				int i_2330_ = (((Class57_Sub1_Sub3) this).anInt9000 + ((Class57_Sub1_Sub3) this).anInt8989 + ((Class57_Sub1_Sub3) this).anInt8993);
				int i_2331_ = (i_2329_ << 16) / i_2320_;
				int i_2332_ = (i_2330_ << 16) / i_2321_;
				if (((Class57_Sub1_Sub3) this).anInt8990 > 0) {
					int i_2333_ = ((((Class57_Sub1_Sub3) this).anInt8990 << 16) + i_2331_ - 1) / i_2331_;
					i += i_2333_;
					i_2326_ += (i_2333_ * i_2331_ - (((Class57_Sub1_Sub3) this).anInt8990 << 16));
				}
				if (((Class57_Sub1_Sub3) this).anInt9000 > 0) {
					int i_2334_ = ((((Class57_Sub1_Sub3) this).anInt9000 << 16) + i_2332_ - 1) / i_2332_;
					i_2319_ += i_2334_;
					i_2327_ += (i_2334_ * i_2332_ - (((Class57_Sub1_Sub3) this).anInt9000 << 16));
				}
				if (((Class57_Sub1_Sub3) this).anInt9010 < i_2329_)
					i_2320_ = ((((Class57_Sub1_Sub3) this).anInt9010 << 16) - i_2326_ + i_2331_ - 1) / i_2331_;
				if (((Class57_Sub1_Sub3) this).anInt8989 < i_2330_)
					i_2321_ = ((((Class57_Sub1_Sub3) this).anInt8989 << 16) - i_2327_ + i_2332_ - 1) / i_2332_;
				int i_2335_ = i + i_2319_ * i_2328_;
				int i_2336_ = i_2328_ - i_2320_;
				if (i_2319_ + i_2321_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7977 * 63686679))
					i_2321_ -= (i_2319_ + i_2321_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7977) * 63686679);
				if (i_2319_ < (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805) {
					int i_2337_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_2319_;
					i_2321_ -= i_2337_;
					i_2335_ += i_2337_ * i_2328_;
					i_2327_ += i_2332_ * i_2337_;
				}
				if (i + i_2320_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725) {
					int i_2338_ = (i + i_2320_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725);
					i_2320_ -= i_2338_;
					i_2336_ += i_2338_;
				}
				if (i < (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7974 * -912871679)) {
					int i_2339_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i;
					i_2320_ -= i_2339_;
					i_2335_ += i_2339_;
					i_2326_ += i_2331_ * i_2339_;
					i_2336_ += i_2339_;
				}
				if (i_2324_ == 0) {
					if (i_2322_ == 1) {
						int i_2340_ = i_2326_;
						for (int i_2341_ = -i_2321_; i_2341_ < 0; i_2341_++) {
							int i_2342_ = ((i_2327_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2343_ = -i_2320_; i_2343_ < 0; i_2343_++) {
								is[i_2335_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[(i_2326_ >> 16) + i_2342_]) & 0xff]);
								i_2326_ += i_2331_;
							}
							i_2327_ += i_2332_;
							i_2326_ = i_2340_;
							i_2335_ += i_2336_;
						}
					} else if (i_2322_ == 0) {
						int i_2344_ = (i_2323_ & 0xff0000) >> 16;
						int i_2345_ = (i_2323_ & 0xff00) >> 8;
						int i_2346_ = i_2323_ & 0xff;
						int i_2347_ = i_2326_;
						for (int i_2348_ = -i_2321_; i_2348_ < 0; i_2348_++) {
							int i_2349_ = ((i_2327_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2350_ = -i_2320_; i_2350_ < 0; i_2350_++) {
								int i_2351_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[(i_2326_ >> 16) + i_2349_]) & 0xff]);
								int i_2352_ = ((i_2351_ & 0xff0000) * i_2344_ & ~0xffffff);
								int i_2353_ = (i_2351_ & 0xff00) * i_2345_ & 0xff0000;
								int i_2354_ = (i_2351_ & 0xff) * i_2346_ & 0xff00;
								is[i_2335_++] = (i_2352_ | i_2353_ | i_2354_) >>> 8;
								i_2326_ += i_2331_;
							}
							i_2327_ += i_2332_;
							i_2326_ = i_2347_;
							i_2335_ += i_2336_;
						}
					} else if (i_2322_ == 3) {
						int i_2355_ = i_2326_;
						for (int i_2356_ = -i_2321_; i_2356_ < 0; i_2356_++) {
							int i_2357_ = ((i_2327_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2358_ = -i_2320_; i_2358_ < 0; i_2358_++) {
								byte i_2359_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2326_ >> 16) + i_2357_]);
								int i_2360_ = (i_2359_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2359_]) : 0);
								int i_2361_ = i_2360_ + i_2323_;
								int i_2362_ = ((i_2360_ & 0xff00ff) + (i_2323_ & 0xff00ff));
								int i_2363_ = ((i_2362_ & 0x1000100) + (i_2361_ - i_2362_ & 0x10000));
								is[i_2335_++] = i_2361_ - i_2363_ | i_2363_ - (i_2363_ >>> 8);
								i_2326_ += i_2331_;
							}
							i_2327_ += i_2332_;
							i_2326_ = i_2355_;
							i_2335_ += i_2336_;
						}
					} else if (i_2322_ == 2) {
						int i_2364_ = i_2323_ >>> 24;
						int i_2365_ = 256 - i_2364_;
						int i_2366_ = (i_2323_ & 0xff00ff) * i_2365_ & ~0xff00ff;
						int i_2367_ = (i_2323_ & 0xff00) * i_2365_ & 0xff0000;
						i_2323_ = (i_2366_ | i_2367_) >>> 8;
						int i_2368_ = i_2326_;
						for (int i_2369_ = -i_2321_; i_2369_ < 0; i_2369_++) {
							int i_2370_ = ((i_2327_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2371_ = -i_2320_; i_2371_ < 0; i_2371_++) {
								int i_2372_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[(i_2326_ >> 16) + i_2370_]) & 0xff]);
								i_2366_ = ((i_2372_ & 0xff00ff) * i_2364_ & ~0xff00ff);
								i_2367_ = (i_2372_ & 0xff00) * i_2364_ & 0xff0000;
								is[i_2335_++] = ((i_2366_ | i_2367_) >>> 8) + i_2323_;
								i_2326_ += i_2331_;
							}
							i_2327_ += i_2332_;
							i_2326_ = i_2368_;
							i_2335_ += i_2336_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2324_ == 1) {
					if (i_2322_ == 1) {
						int i_2373_ = i_2326_;
						for (int i_2374_ = -i_2321_; i_2374_ < 0; i_2374_++) {
							int i_2375_ = ((i_2327_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2376_ = -i_2320_; i_2376_ < 0; i_2376_++) {
								int i_2377_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2326_ >> 16) + i_2375_]);
								if (i_2377_ != 0)
									is[i_2335_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2377_ & 0xff]);
								else
									i_2335_++;
								i_2326_ += i_2331_;
							}
							i_2327_ += i_2332_;
							i_2326_ = i_2373_;
							i_2335_ += i_2336_;
						}
					} else if (i_2322_ == 0) {
						int i_2378_ = i_2326_;
						if ((i_2323_ & 0xffffff) == 16777215) {
							int i_2379_ = i_2323_ >>> 24;
							int i_2380_ = 256 - i_2379_;
							for (int i_2381_ = -i_2321_; i_2381_ < 0; i_2381_++) {
								int i_2382_ = ((i_2327_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
								for (int i_2383_ = -i_2320_; i_2383_ < 0; i_2383_++) {
									int i_2384_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2326_ >> 16) + i_2382_]);
									if (i_2384_ != 0) {
										int i_2385_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2384_ & 0xff]);
										int i_2386_ = is[i_2335_];
										is[i_2335_++] = ((((i_2385_ & 0xff00ff) * i_2379_ + ((i_2386_ & 0xff00ff) * i_2380_)) & ~0xff00ff) + (((i_2385_ & 0xff00) * i_2379_ + ((i_2386_ & 0xff00) * i_2380_)) & 0xff0000)) >> 8;
									} else
										i_2335_++;
									i_2326_ += i_2331_;
								}
								i_2327_ += i_2332_;
								i_2326_ = i_2378_;
								i_2335_ += i_2336_;
							}
						} else {
							int i_2387_ = (i_2323_ & 0xff0000) >> 16;
							int i_2388_ = (i_2323_ & 0xff00) >> 8;
							int i_2389_ = i_2323_ & 0xff;
							int i_2390_ = i_2323_ >>> 24;
							int i_2391_ = 256 - i_2390_;
							for (int i_2392_ = -i_2321_; i_2392_ < 0; i_2392_++) {
								int i_2393_ = ((i_2327_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
								for (int i_2394_ = -i_2320_; i_2394_ < 0; i_2394_++) {
									int i_2395_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2326_ >> 16) + i_2393_]);
									if (i_2395_ != 0) {
										int i_2396_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2395_ & 0xff]);
										if (i_2390_ != 255) {
											int i_2397_ = (((i_2396_ & 0xff0000) * i_2387_) & ~0xffffff);
											int i_2398_ = ((i_2396_ & 0xff00) * i_2388_ & 0xff0000);
											int i_2399_ = ((i_2396_ & 0xff) * i_2389_ & 0xff00);
											i_2396_ = (i_2397_ | i_2398_ | i_2399_) >>> 8;
											int i_2400_ = is[i_2335_];
											is[i_2335_++] = (((((i_2396_ & 0xff00ff) * i_2390_) + ((i_2400_ & 0xff00ff) * i_2391_)) & ~0xff00ff) + ((((i_2396_ & 0xff00) * i_2390_) + ((i_2400_ & 0xff00) * i_2391_)) & 0xff0000)) >> 8;
										} else {
											int i_2401_ = (((i_2396_ & 0xff0000) * i_2387_) & ~0xffffff);
											int i_2402_ = ((i_2396_ & 0xff00) * i_2388_ & 0xff0000);
											int i_2403_ = ((i_2396_ & 0xff) * i_2389_ & 0xff00);
											is[i_2335_++] = (i_2401_ | i_2402_ | i_2403_) >>> 8;
										}
									} else
										i_2335_++;
									i_2326_ += i_2331_;
								}
								i_2327_ += i_2332_;
								i_2326_ = i_2378_;
								i_2335_ += i_2336_;
							}
						}
					} else if (i_2322_ == 3) {
						int i_2404_ = i_2326_;
						int i_2405_ = i_2323_ >>> 24;
						int i_2406_ = 256 - i_2405_;
						for (int i_2407_ = -i_2321_; i_2407_ < 0; i_2407_++) {
							int i_2408_ = ((i_2327_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2409_ = -i_2320_; i_2409_ < 0; i_2409_++) {
								byte i_2410_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2326_ >> 16) + i_2408_]);
								int i_2411_ = (i_2410_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2410_]) : 0);
								int i_2412_ = i_2411_ + i_2323_;
								int i_2413_ = ((i_2411_ & 0xff00ff) + (i_2323_ & 0xff00ff));
								int i_2414_ = ((i_2413_ & 0x1000100) + (i_2412_ - i_2413_ & 0x10000));
								i_2414_ = i_2412_ - i_2414_ | i_2414_ - (i_2414_ >>> 8);
								if (i_2411_ == 0 && i_2405_ != 255) {
									i_2411_ = i_2414_;
									i_2414_ = is[i_2335_];
									i_2414_ = ((((i_2411_ & 0xff00ff) * i_2405_ + (i_2414_ & 0xff00ff) * i_2406_) & ~0xff00ff) + (((i_2411_ & 0xff00) * i_2405_ + (i_2414_ & 0xff00) * i_2406_) & 0xff0000)) >> 8;
								}
								is[i_2335_++] = i_2414_;
								i_2326_ += i_2331_;
							}
							i_2327_ += i_2332_;
							i_2326_ = i_2404_;
							i_2335_ += i_2336_;
						}
					} else if (i_2322_ == 2) {
						int i_2415_ = i_2323_ >>> 24;
						int i_2416_ = 256 - i_2415_;
						int i_2417_ = (i_2323_ & 0xff00ff) * i_2416_ & ~0xff00ff;
						int i_2418_ = (i_2323_ & 0xff00) * i_2416_ & 0xff0000;
						i_2323_ = (i_2417_ | i_2418_) >>> 8;
						int i_2419_ = i_2326_;
						for (int i_2420_ = -i_2321_; i_2420_ < 0; i_2420_++) {
							int i_2421_ = ((i_2327_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2422_ = -i_2320_; i_2422_ < 0; i_2422_++) {
								int i_2423_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2326_ >> 16) + i_2421_]);
								if (i_2423_ != 0) {
									int i_2424_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2423_ & 0xff]);
									i_2417_ = ((i_2424_ & 0xff00ff) * i_2415_ & ~0xff00ff);
									i_2418_ = ((i_2424_ & 0xff00) * i_2415_ & 0xff0000);
									is[i_2335_++] = ((i_2417_ | i_2418_) >>> 8) + i_2323_;
								} else
									i_2335_++;
								i_2326_ += i_2331_;
							}
							i_2327_ += i_2332_;
							i_2326_ = i_2419_;
							i_2335_ += i_2336_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2324_ == 2) {
					if (i_2322_ == 1) {
						int i_2425_ = i_2326_;
						for (int i_2426_ = -i_2321_; i_2426_ < 0; i_2426_++) {
							int i_2427_ = ((i_2327_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2428_ = -i_2320_; i_2428_ < 0; i_2428_++) {
								int i_2429_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2326_ >> 16) + i_2427_]);
								if (i_2429_ != 0) {
									int i_2430_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2429_ & 0xff]);
									int i_2431_ = is[i_2335_];
									int i_2432_ = i_2430_ + i_2431_;
									int i_2433_ = ((i_2430_ & 0xff00ff) + (i_2431_ & 0xff00ff));
									i_2431_ = ((i_2433_ & 0x1000100) + (i_2432_ - i_2433_ & 0x10000));
									is[i_2335_++] = (i_2432_ - i_2431_ | i_2431_ - (i_2431_ >>> 8));
								} else
									i_2335_++;
								i_2326_ += i_2331_;
							}
							i_2327_ += i_2332_;
							i_2326_ = i_2425_;
							i_2335_ += i_2336_;
						}
					} else if (i_2322_ == 0) {
						int i_2434_ = i_2326_;
						int i_2435_ = (i_2323_ & 0xff0000) >> 16;
						int i_2436_ = (i_2323_ & 0xff00) >> 8;
						int i_2437_ = i_2323_ & 0xff;
						for (int i_2438_ = -i_2321_; i_2438_ < 0; i_2438_++) {
							int i_2439_ = ((i_2327_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2440_ = -i_2320_; i_2440_ < 0; i_2440_++) {
								int i_2441_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2326_ >> 16) + i_2439_]);
								if (i_2441_ != 0) {
									int i_2442_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2441_ & 0xff]);
									int i_2443_ = ((i_2442_ & 0xff0000) * i_2435_ & ~0xffffff);
									int i_2444_ = ((i_2442_ & 0xff00) * i_2436_ & 0xff0000);
									int i_2445_ = (i_2442_ & 0xff) * i_2437_ & 0xff00;
									i_2442_ = (i_2443_ | i_2444_ | i_2445_) >>> 8;
									int i_2446_ = is[i_2335_];
									int i_2447_ = i_2442_ + i_2446_;
									int i_2448_ = ((i_2442_ & 0xff00ff) + (i_2446_ & 0xff00ff));
									i_2446_ = ((i_2448_ & 0x1000100) + (i_2447_ - i_2448_ & 0x10000));
									is[i_2335_++] = (i_2447_ - i_2446_ | i_2446_ - (i_2446_ >>> 8));
								} else
									i_2335_++;
								i_2326_ += i_2331_;
							}
							i_2327_ += i_2332_;
							i_2326_ = i_2434_;
							i_2335_ += i_2336_;
						}
					} else if (i_2322_ == 3) {
						int i_2449_ = i_2326_;
						for (int i_2450_ = -i_2321_; i_2450_ < 0; i_2450_++) {
							int i_2451_ = ((i_2327_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2452_ = -i_2320_; i_2452_ < 0; i_2452_++) {
								byte i_2453_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2326_ >> 16) + i_2451_]);
								int i_2454_ = (i_2453_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2453_]) : 0);
								int i_2455_ = i_2454_ + i_2323_;
								int i_2456_ = ((i_2454_ & 0xff00ff) + (i_2323_ & 0xff00ff));
								int i_2457_ = ((i_2456_ & 0x1000100) + (i_2455_ - i_2456_ & 0x10000));
								i_2454_ = i_2455_ - i_2457_ | i_2457_ - (i_2457_ >>> 8);
								i_2457_ = is[i_2335_];
								i_2455_ = i_2454_ + i_2457_;
								i_2456_ = (i_2454_ & 0xff00ff) + (i_2457_ & 0xff00ff);
								i_2457_ = ((i_2456_ & 0x1000100) + (i_2455_ - i_2456_ & 0x10000));
								is[i_2335_++] = i_2455_ - i_2457_ | i_2457_ - (i_2457_ >>> 8);
								i_2326_ += i_2331_;
							}
							i_2327_ += i_2332_;
							i_2326_ = i_2449_;
							i_2335_ += i_2336_;
						}
					} else if (i_2322_ == 2) {
						int i_2458_ = i_2323_ >>> 24;
						int i_2459_ = 256 - i_2458_;
						int i_2460_ = (i_2323_ & 0xff00ff) * i_2459_ & ~0xff00ff;
						int i_2461_ = (i_2323_ & 0xff00) * i_2459_ & 0xff0000;
						i_2323_ = (i_2460_ | i_2461_) >>> 8;
						int i_2462_ = i_2326_;
						for (int i_2463_ = -i_2321_; i_2463_ < 0; i_2463_++) {
							int i_2464_ = ((i_2327_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2465_ = -i_2320_; i_2465_ < 0; i_2465_++) {
								int i_2466_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2326_ >> 16) + i_2464_]);
								if (i_2466_ != 0) {
									int i_2467_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2466_ & 0xff]);
									i_2460_ = ((i_2467_ & 0xff00ff) * i_2458_ & ~0xff00ff);
									i_2461_ = ((i_2467_ & 0xff00) * i_2458_ & 0xff0000);
									i_2467_ = (((i_2460_ | i_2461_) >>> 8) + i_2323_);
									int i_2468_ = is[i_2335_];
									int i_2469_ = i_2467_ + i_2468_;
									int i_2470_ = ((i_2467_ & 0xff00ff) + (i_2468_ & 0xff00ff));
									i_2468_ = ((i_2470_ & 0x1000100) + (i_2469_ - i_2470_ & 0x10000));
									is[i_2335_++] = (i_2469_ - i_2468_ | i_2468_ - (i_2468_ >>> 8));
								} else
									i_2335_++;
								i_2326_ += i_2331_;
							}
							i_2327_ += i_2332_;
							i_2326_ = i_2462_;
							i_2335_ += i_2336_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method683(int[] is, int[] is_2471_, int i, int i_2472_) {
		int[] is_2473_ = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is_2473_ != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_2474_ = anInt9001;
					while (i_2474_ < 0) {
						int i_2475_ = i_2474_ + i_2472_;
						if (i_2475_ >= 0) {
							if (i_2475_ >= is.length)
								break;
							int i_2476_ = anInt9003;
							int i_2477_ = anInt8988;
							int i_2478_ = anInt9011;
							int i_2479_ = anInt8999;
							if (i_2477_ >= 0 && i_2478_ >= 0 && (i_2477_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) < 0 && (i_2478_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) < 0) {
								int i_2480_ = is[i_2475_] - i;
								int i_2481_ = -is_2471_[i_2475_];
								int i_2482_ = i_2480_ - (i_2476_ - anInt9003);
								if (i_2482_ > 0) {
									i_2476_ += i_2482_;
									i_2479_ += i_2482_;
									i_2477_ += anInt9004 * i_2482_;
									i_2478_ += anInt8991 * i_2482_;
								} else
									i_2481_ -= i_2482_;
								if (i_2479_ < i_2481_)
									i_2479_ = i_2481_;
								for (/**/; i_2479_ < 0; i_2479_++) {
									int i_2483_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_2478_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_2477_ >> 12))]);
									if (i_2483_ != 0)
										is_2473_[i_2476_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2483_ & 0xff]);
									else
										i_2476_++;
								}
							}
						}
						i_2474_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_2484_ = anInt9001;
					while (i_2484_ < 0) {
						int i_2485_ = i_2484_ + i_2472_;
						if (i_2485_ >= 0) {
							if (i_2485_ >= is.length)
								break;
							int i_2486_ = anInt9003;
							int i_2487_ = anInt8988;
							int i_2488_ = anInt9011 + anInt9013;
							int i_2489_ = anInt8999;
							if (i_2487_ >= 0 && (i_2487_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) < 0) {
								int i_2490_;
								if ((i_2490_ = (i_2488_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12))) >= 0) {
									i_2490_ = (anInt8991 - i_2490_) / anInt8991;
									i_2489_ += i_2490_;
									i_2488_ += anInt8991 * i_2490_;
									i_2486_ += i_2490_;
								}
								if ((i_2490_ = (i_2488_ - anInt8991) / anInt8991) > i_2489_)
									i_2489_ = i_2490_;
								int i_2491_ = is[i_2485_] - i;
								int i_2492_ = -is_2471_[i_2485_];
								int i_2493_ = i_2491_ - (i_2486_ - anInt9003);
								if (i_2493_ > 0) {
									i_2486_ += i_2493_;
									i_2489_ += i_2493_;
									i_2487_ += anInt9004 * i_2493_;
									i_2488_ += anInt8991 * i_2493_;
								} else
									i_2492_ -= i_2493_;
								if (i_2489_ < i_2492_)
									i_2489_ = i_2492_;
								for (/**/; i_2489_ < 0; i_2489_++) {
									int i_2494_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_2488_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_2487_ >> 12))]);
									if (i_2494_ != 0)
										is_2473_[i_2486_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2494_ & 0xff]);
									else
										i_2486_++;
									i_2488_ += anInt8991;
								}
							}
						}
						i_2484_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_2495_ = anInt9001;
					while (i_2495_ < 0) {
						int i_2496_ = i_2495_ + i_2472_;
						if (i_2496_ >= 0) {
							if (i_2496_ >= is.length)
								break;
							int i_2497_ = anInt9003;
							int i_2498_ = anInt8988;
							int i_2499_ = anInt9011 + anInt9013;
							int i_2500_ = anInt8999;
							if (i_2498_ >= 0 && (i_2498_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) < 0) {
								if (i_2499_ < 0) {
									int i_2501_ = ((anInt8991 - 1 - i_2499_) / anInt8991);
									i_2500_ += i_2501_;
									i_2499_ += anInt8991 * i_2501_;
									i_2497_ += i_2501_;
								}
								int i_2502_;
								if ((i_2502_ = (1 + i_2499_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_2500_)
									i_2500_ = i_2502_;
								int i_2503_ = is[i_2496_] - i;
								int i_2504_ = -is_2471_[i_2496_];
								int i_2505_ = i_2503_ - (i_2497_ - anInt9003);
								if (i_2505_ > 0) {
									i_2497_ += i_2505_;
									i_2500_ += i_2505_;
									i_2498_ += anInt9004 * i_2505_;
									i_2499_ += anInt8991 * i_2505_;
								} else
									i_2504_ -= i_2505_;
								if (i_2500_ < i_2504_)
									i_2500_ = i_2504_;
								for (/**/; i_2500_ < 0; i_2500_++) {
									int i_2506_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_2499_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_2498_ >> 12))]);
									if (i_2506_ != 0)
										is_2473_[i_2497_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2506_ & 0xff]);
									else
										i_2497_++;
									i_2499_ += anInt8991;
								}
							}
						}
						i_2495_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_2507_ = anInt9001;
					while (i_2507_ < 0) {
						int i_2508_ = i_2507_ + i_2472_;
						if (i_2508_ >= 0) {
							if (i_2508_ >= is.length)
								break;
							int i_2509_ = anInt9003;
							int i_2510_ = anInt8988 + anInt9012;
							int i_2511_ = anInt9011;
							int i_2512_ = anInt8999;
							if (i_2511_ >= 0 && (i_2511_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) < 0) {
								int i_2513_;
								if ((i_2513_ = (i_2510_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12))) >= 0) {
									i_2513_ = (anInt9004 - i_2513_) / anInt9004;
									i_2512_ += i_2513_;
									i_2510_ += anInt9004 * i_2513_;
									i_2509_ += i_2513_;
								}
								if ((i_2513_ = (i_2510_ - anInt9004) / anInt9004) > i_2512_)
									i_2512_ = i_2513_;
								int i_2514_ = is[i_2508_] - i;
								int i_2515_ = -is_2471_[i_2508_];
								int i_2516_ = i_2514_ - (i_2509_ - anInt9003);
								if (i_2516_ > 0) {
									i_2509_ += i_2516_;
									i_2512_ += i_2516_;
									i_2510_ += anInt9004 * i_2516_;
									i_2511_ += anInt8991 * i_2516_;
								} else
									i_2515_ -= i_2516_;
								if (i_2512_ < i_2515_)
									i_2512_ = i_2515_;
								for (/**/; i_2512_ < 0; i_2512_++) {
									int i_2517_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_2511_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_2510_ >> 12))]);
									if (i_2517_ != 0)
										is_2473_[i_2509_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2517_ & 0xff]);
									else
										i_2509_++;
									i_2510_ += anInt9004;
								}
							}
						}
						i_2507_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_2518_ = anInt9001;
					while (i_2518_ < 0) {
						int i_2519_ = i_2518_ + i_2472_;
						if (i_2519_ >= 0) {
							if (i_2519_ >= is.length)
								break;
							int i_2520_ = anInt9003;
							int i_2521_ = anInt8988 + anInt9012;
							int i_2522_ = anInt9011 + anInt9013;
							int i_2523_ = anInt8999;
							int i_2524_;
							if ((i_2524_ = (i_2521_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12))) >= 0) {
								i_2524_ = (anInt9004 - i_2524_) / anInt9004;
								i_2523_ += i_2524_;
								i_2521_ += anInt9004 * i_2524_;
								i_2522_ += anInt8991 * i_2524_;
								i_2520_ += i_2524_;
							}
							if ((i_2524_ = (i_2521_ - anInt9004) / anInt9004) > i_2523_)
								i_2523_ = i_2524_;
							if ((i_2524_ = (i_2522_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12))) >= 0) {
								i_2524_ = (anInt8991 - i_2524_) / anInt8991;
								i_2523_ += i_2524_;
								i_2521_ += anInt9004 * i_2524_;
								i_2522_ += anInt8991 * i_2524_;
								i_2520_ += i_2524_;
							}
							if ((i_2524_ = (i_2522_ - anInt8991) / anInt8991) > i_2523_)
								i_2523_ = i_2524_;
							int i_2525_ = is[i_2519_] - i;
							int i_2526_ = -is_2471_[i_2519_];
							int i_2527_ = i_2525_ - (i_2520_ - anInt9003);
							if (i_2527_ > 0) {
								i_2520_ += i_2527_;
								i_2523_ += i_2527_;
								i_2521_ += anInt9004 * i_2527_;
								i_2522_ += anInt8991 * i_2527_;
							} else
								i_2526_ -= i_2527_;
							if (i_2523_ < i_2526_)
								i_2523_ = i_2526_;
							for (/**/; i_2523_ < 0; i_2523_++) {
								int i_2528_ = (((Class57_Sub1_Sub3) this).aByteArray9967[((i_2522_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010 + (i_2521_ >> 12))]);
								if (i_2528_ != 0)
									is_2473_[i_2520_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2528_ & 0xff]);
								else
									i_2520_++;
								i_2521_ += anInt9004;
								i_2522_ += anInt8991;
							}
						}
						i_2518_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_2529_ = anInt9001;
					while (i_2529_ < 0) {
						int i_2530_ = i_2529_ + i_2472_;
						if (i_2530_ >= 0) {
							if (i_2530_ >= is.length)
								break;
							int i_2531_ = anInt9003;
							int i_2532_ = anInt8988 + anInt9012;
							int i_2533_ = anInt9011 + anInt9013;
							int i_2534_ = anInt8999;
							int i_2535_;
							if ((i_2535_ = (i_2532_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12))) >= 0) {
								i_2535_ = (anInt9004 - i_2535_) / anInt9004;
								i_2534_ += i_2535_;
								i_2532_ += anInt9004 * i_2535_;
								i_2533_ += anInt8991 * i_2535_;
								i_2531_ += i_2535_;
							}
							if ((i_2535_ = (i_2532_ - anInt9004) / anInt9004) > i_2534_)
								i_2534_ = i_2535_;
							if (i_2533_ < 0) {
								i_2535_ = (anInt8991 - 1 - i_2533_) / anInt8991;
								i_2534_ += i_2535_;
								i_2532_ += anInt9004 * i_2535_;
								i_2533_ += anInt8991 * i_2535_;
								i_2531_ += i_2535_;
							}
							if ((i_2535_ = (1 + i_2533_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_2534_)
								i_2534_ = i_2535_;
							int i_2536_ = is[i_2530_] - i;
							int i_2537_ = -is_2471_[i_2530_];
							int i_2538_ = i_2536_ - (i_2531_ - anInt9003);
							if (i_2538_ > 0) {
								i_2531_ += i_2538_;
								i_2534_ += i_2538_;
								i_2532_ += anInt9004 * i_2538_;
								i_2533_ += anInt8991 * i_2538_;
							} else
								i_2537_ -= i_2538_;
							if (i_2534_ < i_2537_)
								i_2534_ = i_2537_;
							for (/**/; i_2534_ < 0; i_2534_++) {
								int i_2539_ = (((Class57_Sub1_Sub3) this).aByteArray9967[((i_2533_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010 + (i_2532_ >> 12))]);
								if (i_2539_ != 0)
									is_2473_[i_2531_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2539_ & 0xff]);
								else
									i_2531_++;
								i_2532_ += anInt9004;
								i_2533_ += anInt8991;
							}
						}
						i_2529_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_2540_ = anInt9001;
				while (i_2540_ < 0) {
					int i_2541_ = i_2540_ + i_2472_;
					if (i_2541_ >= 0) {
						if (i_2541_ >= is.length)
							break;
						int i_2542_ = anInt9003;
						int i_2543_ = anInt8988 + anInt9012;
						int i_2544_ = anInt9011;
						int i_2545_ = anInt8999;
						if (i_2544_ >= 0 && i_2544_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) < 0) {
							if (i_2543_ < 0) {
								int i_2546_ = (anInt9004 - 1 - i_2543_) / anInt9004;
								i_2545_ += i_2546_;
								i_2543_ += anInt9004 * i_2546_;
								i_2542_ += i_2546_;
							}
							int i_2547_;
							if ((i_2547_ = (1 + i_2543_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_2545_)
								i_2545_ = i_2547_;
							int i_2548_ = is[i_2541_] - i;
							int i_2549_ = -is_2471_[i_2541_];
							int i_2550_ = i_2548_ - (i_2542_ - anInt9003);
							if (i_2550_ > 0) {
								i_2542_ += i_2550_;
								i_2545_ += i_2550_;
								i_2543_ += anInt9004 * i_2550_;
								i_2544_ += anInt8991 * i_2550_;
							} else
								i_2549_ -= i_2550_;
							if (i_2545_ < i_2549_)
								i_2545_ = i_2549_;
							for (/**/; i_2545_ < 0; i_2545_++) {
								int i_2551_ = (((Class57_Sub1_Sub3) this).aByteArray9967[((i_2544_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010 + (i_2543_ >> 12))]);
								if (i_2551_ != 0)
									is_2473_[i_2542_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2551_ & 0xff]);
								else
									i_2542_++;
								i_2543_ += anInt9004;
							}
						}
					}
					i_2540_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				int i_2552_ = anInt9001;
				while (i_2552_ < 0) {
					int i_2553_ = i_2552_ + i_2472_;
					if (i_2553_ >= 0) {
						if (i_2553_ >= is.length)
							break;
						int i_2554_ = anInt9003;
						int i_2555_ = anInt8988 + anInt9012;
						int i_2556_ = anInt9011 + anInt9013;
						int i_2557_ = anInt8999;
						if (i_2555_ < 0) {
							int i_2558_ = (anInt9004 - 1 - i_2555_) / anInt9004;
							i_2557_ += i_2558_;
							i_2555_ += anInt9004 * i_2558_;
							i_2556_ += anInt8991 * i_2558_;
							i_2554_ += i_2558_;
						}
						int i_2559_;
						if ((i_2559_ = (1 + i_2555_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_2557_)
							i_2557_ = i_2559_;
						if ((i_2559_ = i_2556_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) >= 0) {
							i_2559_ = (anInt8991 - i_2559_) / anInt8991;
							i_2557_ += i_2559_;
							i_2555_ += anInt9004 * i_2559_;
							i_2556_ += anInt8991 * i_2559_;
							i_2554_ += i_2559_;
						}
						if ((i_2559_ = (i_2556_ - anInt8991) / anInt8991) > i_2557_)
							i_2557_ = i_2559_;
						int i_2560_ = is[i_2553_] - i;
						int i_2561_ = -is_2471_[i_2553_];
						int i_2562_ = i_2560_ - (i_2554_ - anInt9003);
						if (i_2562_ > 0) {
							i_2554_ += i_2562_;
							i_2557_ += i_2562_;
							i_2555_ += anInt9004 * i_2562_;
							i_2556_ += anInt8991 * i_2562_;
						} else
							i_2561_ -= i_2562_;
						if (i_2557_ < i_2561_)
							i_2557_ = i_2561_;
						for (/**/; i_2557_ < 0; i_2557_++) {
							int i_2563_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_2556_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_2555_ >> 12))]);
							if (i_2563_ != 0)
								is_2473_[i_2554_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2563_ & 0xff]);
							else
								i_2554_++;
							i_2555_ += anInt9004;
							i_2556_ += anInt8991;
						}
					}
					i_2552_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				int i_2564_ = anInt9001;
				while (i_2564_ < 0) {
					int i_2565_ = i_2564_ + i_2472_;
					if (i_2565_ >= 0) {
						if (i_2565_ >= is.length)
							break;
						int i_2566_ = anInt9003;
						int i_2567_ = anInt8988 + anInt9012;
						int i_2568_ = anInt9011 + anInt9013;
						int i_2569_ = anInt8999;
						if (i_2567_ < 0) {
							int i_2570_ = (anInt9004 - 1 - i_2567_) / anInt9004;
							i_2569_ += i_2570_;
							i_2567_ += anInt9004 * i_2570_;
							i_2568_ += anInt8991 * i_2570_;
							i_2566_ += i_2570_;
						}
						int i_2571_;
						if ((i_2571_ = (1 + i_2567_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_2569_)
							i_2569_ = i_2571_;
						if (i_2568_ < 0) {
							i_2571_ = (anInt8991 - 1 - i_2568_) / anInt8991;
							i_2569_ += i_2571_;
							i_2567_ += anInt9004 * i_2571_;
							i_2568_ += anInt8991 * i_2571_;
							i_2566_ += i_2571_;
						}
						if ((i_2571_ = (1 + i_2568_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_2569_)
							i_2569_ = i_2571_;
						int i_2572_ = is[i_2565_] - i;
						int i_2573_ = -is_2471_[i_2565_];
						int i_2574_ = i_2572_ - (i_2566_ - anInt9003);
						if (i_2574_ > 0) {
							i_2566_ += i_2574_;
							i_2569_ += i_2574_;
							i_2567_ += anInt9004 * i_2574_;
							i_2568_ += anInt8991 * i_2574_;
						} else
							i_2573_ -= i_2574_;
						if (i_2569_ < i_2573_)
							i_2569_ = i_2573_;
						for (/**/; i_2569_ < 0; i_2569_++) {
							int i_2575_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_2568_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_2567_ >> 12))]);
							if (i_2575_ != 0)
								is_2473_[i_2566_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2575_ & 0xff]);
							else
								i_2566_++;
							i_2567_ += anInt9004;
							i_2568_ += anInt8991;
						}
					}
					i_2564_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	void method682(boolean bool, boolean bool_2576_, boolean bool_2577_, int i, int i_2578_, float f, int i_2579_, int i_2580_, int i_2581_, int i_2582_, int i_2583_, int i_2584_, boolean bool_2585_) {
		if (i_2579_ > 0 && i_2580_ > 0 && (bool || bool_2576_)) {
			int i_2586_ = 0;
			int i_2587_ = 0;
			int i_2588_ = (((Class57_Sub1_Sub3) this).anInt8990 + ((Class57_Sub1_Sub3) this).anInt9010 + ((Class57_Sub1_Sub3) this).anInt8997);
			int i_2589_ = (((Class57_Sub1_Sub3) this).anInt9000 + ((Class57_Sub1_Sub3) this).anInt8989 + ((Class57_Sub1_Sub3) this).anInt8993);
			int i_2590_ = (i_2588_ << 16) / i_2579_;
			int i_2591_ = (i_2589_ << 16) / i_2580_;
			if (((Class57_Sub1_Sub3) this).anInt8990 > 0) {
				int i_2592_ = (((((Class57_Sub1_Sub3) this).anInt8990 << 16) + i_2590_ - 1) / i_2590_);
				i += i_2592_;
				i_2586_ += (i_2592_ * i_2590_ - (((Class57_Sub1_Sub3) this).anInt8990 << 16));
			}
			if (((Class57_Sub1_Sub3) this).anInt9000 > 0) {
				int i_2593_ = (((((Class57_Sub1_Sub3) this).anInt9000 << 16) + i_2591_ - 1) / i_2591_);
				i_2578_ += i_2593_;
				i_2587_ += (i_2593_ * i_2591_ - (((Class57_Sub1_Sub3) this).anInt9000 << 16));
			}
			if (((Class57_Sub1_Sub3) this).anInt9010 < i_2588_)
				i_2579_ = ((((Class57_Sub1_Sub3) this).anInt9010 << 16) - i_2586_ + i_2590_ - 1) / i_2590_;
			if (((Class57_Sub1_Sub3) this).anInt8989 < i_2589_)
				i_2580_ = ((((Class57_Sub1_Sub3) this).anInt8989 << 16) - i_2587_ + i_2591_ - 1) / i_2591_;
			int i_2594_ = i + i_2578_ * ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971) * 692106883);
			int i_2595_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883) - i_2579_);
			if (i_2578_ + i_2580_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_2580_ -= (i_2578_ + i_2580_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i_2578_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_2596_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_2578_);
				i_2580_ -= i_2596_;
				i_2594_ += i_2596_ * ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971) * 692106883);
				i_2587_ += i_2591_ * i_2596_;
			}
			if (i + i_2579_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_2597_ = (i + i_2579_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_2579_ -= i_2597_;
				i_2595_ += i_2597_;
			}
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_2598_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_2579_ -= i_2598_;
				i_2594_ += i_2598_;
				i_2586_ += i_2590_ * i_2598_;
				i_2595_ += i_2598_;
			}
			float[] fs = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).aFloatArray7973);
			int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
			if (i_2583_ == 0) {
				if (i_2581_ == 1) {
					int i_2599_ = i_2586_;
					for (int i_2600_ = -i_2580_; i_2600_ < 0; i_2600_++) {
						int i_2601_ = ((i_2587_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_2602_ = -i_2579_; i_2602_ < 0; i_2602_++) {
							if (!bool_2576_ || f < fs[i_2594_]) {
								if (bool)
									is[i_2594_] = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[(i_2586_ >> 16) + i_2601_]) & 0xff)]);
								if (bool_2576_ && bool_2585_)
									fs[i_2594_] = f;
							}
							i_2586_ += i_2590_;
							i_2594_++;
						}
						i_2587_ += i_2591_;
						i_2586_ = i_2599_;
						i_2594_ += i_2595_;
					}
				} else if (i_2581_ == 0) {
					int i_2603_ = (i_2582_ & 0xff0000) >> 16;
					int i_2604_ = (i_2582_ & 0xff00) >> 8;
					int i_2605_ = i_2582_ & 0xff;
					int i_2606_ = i_2586_;
					for (int i_2607_ = -i_2580_; i_2607_ < 0; i_2607_++) {
						int i_2608_ = ((i_2587_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_2609_ = -i_2579_; i_2609_ < 0; i_2609_++) {
							if (!bool_2576_ || f < fs[i_2594_]) {
								if (bool) {
									int i_2610_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[(i_2586_ >> 16) + i_2608_]) & 0xff)]);
									int i_2611_ = ((i_2610_ & 0xff0000) * i_2603_ & ~0xffffff);
									int i_2612_ = ((i_2610_ & 0xff00) * i_2604_ & 0xff0000);
									int i_2613_ = (i_2610_ & 0xff) * i_2605_ & 0xff00;
									is[i_2594_] = (i_2611_ | i_2612_ | i_2613_) >>> 8;
								}
								if (bool_2576_ && bool_2585_)
									fs[i_2594_] = f;
							}
							i_2586_ += i_2590_;
							i_2594_++;
						}
						i_2587_ += i_2591_;
						i_2586_ = i_2606_;
						i_2594_ += i_2595_;
					}
				} else if (i_2581_ == 3) {
					int i_2614_ = i_2586_;
					for (int i_2615_ = -i_2580_; i_2615_ < 0; i_2615_++) {
						int i_2616_ = ((i_2587_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_2617_ = -i_2579_; i_2617_ < 0; i_2617_++) {
							if (!bool_2576_ || f < fs[i_2594_]) {
								if (bool) {
									byte i_2618_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2586_ >> 16) + i_2616_]);
									int i_2619_ = (i_2618_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2618_]) : 0);
									int i_2620_ = i_2619_ + i_2582_;
									int i_2621_ = ((i_2619_ & 0xff00ff) + (i_2582_ & 0xff00ff));
									int i_2622_ = ((i_2621_ & 0x1000100) + (i_2620_ - i_2621_ & 0x10000));
									is[i_2594_] = (i_2620_ - i_2622_ | i_2622_ - (i_2622_ >>> 8));
								}
								if (bool_2576_ && bool_2585_)
									fs[i_2594_] = f;
							}
							i_2586_ += i_2590_;
							i_2594_++;
						}
						i_2587_ += i_2591_;
						i_2586_ = i_2614_;
						i_2594_ += i_2595_;
					}
				} else if (i_2581_ == 2) {
					int i_2623_ = i_2582_ >>> 24;
					int i_2624_ = 256 - i_2623_;
					int i_2625_ = (i_2582_ & 0xff00ff) * i_2624_ & ~0xff00ff;
					int i_2626_ = (i_2582_ & 0xff00) * i_2624_ & 0xff0000;
					i_2582_ = (i_2625_ | i_2626_) >>> 8;
					int i_2627_ = i_2586_;
					for (int i_2628_ = -i_2580_; i_2628_ < 0; i_2628_++) {
						int i_2629_ = ((i_2587_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_2630_ = -i_2579_; i_2630_ < 0; i_2630_++) {
							if (!bool_2576_ || f < fs[i_2594_]) {
								if (bool) {
									int i_2631_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[(i_2586_ >> 16) + i_2629_]) & 0xff)]);
									i_2625_ = ((i_2631_ & 0xff00ff) * i_2623_ & ~0xff00ff);
									i_2626_ = ((i_2631_ & 0xff00) * i_2623_ & 0xff0000);
									is[i_2594_] = (((i_2625_ | i_2626_) >>> 8) + i_2582_);
								}
								if (bool_2576_ && bool_2585_)
									fs[i_2594_] = f;
							}
							i_2586_ += i_2590_;
							i_2594_++;
						}
						i_2587_ += i_2591_;
						i_2586_ = i_2627_;
						i_2594_ += i_2595_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2583_ == 1) {
				if (i_2581_ == 1) {
					int i_2632_ = i_2586_;
					for (int i_2633_ = -i_2580_; i_2633_ < 0; i_2633_++) {
						int i_2634_ = ((i_2587_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_2635_ = -i_2579_; i_2635_ < 0; i_2635_++) {
							if (!bool_2576_ || f < fs[i_2594_]) {
								int i_2636_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2586_ >> 16) + i_2634_]);
								if (i_2636_ != 0) {
									if (bool)
										is[i_2594_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2636_ & 0xff]);
									if (bool_2576_ && bool_2585_)
										fs[i_2594_] = f;
								}
							}
							i_2586_ += i_2590_;
							i_2594_++;
						}
						i_2587_ += i_2591_;
						i_2586_ = i_2632_;
						i_2594_ += i_2595_;
					}
				} else if (i_2581_ == 0) {
					int i_2637_ = i_2586_;
					if ((i_2582_ & 0xffffff) == 16777215) {
						int i_2638_ = i_2582_ >>> 24;
						int i_2639_ = 256 - i_2638_;
						for (int i_2640_ = -i_2580_; i_2640_ < 0; i_2640_++) {
							int i_2641_ = ((i_2587_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2642_ = -i_2579_; i_2642_ < 0; i_2642_++) {
								if (!bool_2576_ || f < fs[i_2594_]) {
									int i_2643_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2586_ >> 16) + i_2641_]);
									if (i_2643_ != 0) {
										if (bool) {
											int i_2644_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2643_ & 0xff]);
											int i_2645_ = is[i_2594_];
											is[i_2594_] = (((((i_2644_ & 0xff00ff) * i_2638_) + ((i_2645_ & 0xff00ff) * i_2639_)) & ~0xff00ff) + ((((i_2644_ & 0xff00) * i_2638_) + ((i_2645_ & 0xff00) * i_2639_)) & 0xff0000)) >> 8;
										}
										if (bool_2576_ && bool_2585_)
											fs[i_2594_] = f;
									}
								}
								i_2586_ += i_2590_;
								i_2594_++;
							}
							i_2587_ += i_2591_;
							i_2586_ = i_2637_;
							i_2594_ += i_2595_;
						}
					} else {
						int i_2646_ = (i_2582_ & 0xff0000) >> 16;
						int i_2647_ = (i_2582_ & 0xff00) >> 8;
						int i_2648_ = i_2582_ & 0xff;
						int i_2649_ = i_2582_ >>> 24;
						int i_2650_ = 256 - i_2649_;
						for (int i_2651_ = -i_2580_; i_2651_ < 0; i_2651_++) {
							int i_2652_ = ((i_2587_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2653_ = -i_2579_; i_2653_ < 0; i_2653_++) {
								if (!bool_2576_ || f < fs[i_2594_]) {
									int i_2654_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2586_ >> 16) + i_2652_]);
									if (i_2654_ != 0) {
										int i_2655_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2654_ & 0xff]);
										if (i_2649_ != 255) {
											if (bool) {
												int i_2656_ = (((i_2655_ & 0xff0000) * i_2646_) & ~0xffffff);
												int i_2657_ = (((i_2655_ & 0xff00) * i_2647_) & 0xff0000);
												int i_2658_ = (((i_2655_ & 0xff) * i_2648_) & 0xff00);
												i_2655_ = (i_2656_ | i_2657_ | i_2658_) >>> 8;
												int i_2659_ = is[i_2594_];
												is[i_2594_] = (((((i_2655_ & 0xff00ff) * i_2649_) + ((i_2659_ & 0xff00ff) * i_2650_)) & ~0xff00ff) + ((((i_2655_ & 0xff00) * i_2649_) + ((i_2659_ & 0xff00) * i_2650_)) & 0xff0000)) >> 8;
											}
											if (bool_2576_ && bool_2585_)
												fs[i_2594_] = f;
										} else {
											if (bool) {
												int i_2660_ = (((i_2655_ & 0xff0000) * i_2646_) & ~0xffffff);
												int i_2661_ = (((i_2655_ & 0xff00) * i_2647_) & 0xff0000);
												int i_2662_ = (((i_2655_ & 0xff) * i_2648_) & 0xff00);
												is[i_2594_] = (i_2660_ | i_2661_ | i_2662_) >>> 8;
											}
											if (bool_2576_ && bool_2585_)
												fs[i_2594_] = f;
										}
									}
								}
								i_2586_ += i_2590_;
								i_2594_++;
							}
							i_2587_ += i_2591_;
							i_2586_ = i_2637_;
							i_2594_ += i_2595_;
						}
					}
				} else if (i_2581_ == 3) {
					int i_2663_ = i_2586_;
					int i_2664_ = i_2582_ >>> 24;
					int i_2665_ = 256 - i_2664_;
					for (int i_2666_ = -i_2580_; i_2666_ < 0; i_2666_++) {
						int i_2667_ = ((i_2587_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_2668_ = -i_2579_; i_2668_ < 0; i_2668_++) {
							if (!bool_2576_ || f < fs[i_2594_]) {
								if (bool) {
									byte i_2669_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2586_ >> 16) + i_2667_]);
									int i_2670_ = (i_2669_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2669_]) : 0);
									int i_2671_ = i_2670_ + i_2582_;
									int i_2672_ = ((i_2670_ & 0xff00ff) + (i_2582_ & 0xff00ff));
									int i_2673_ = ((i_2672_ & 0x1000100) + (i_2671_ - i_2672_ & 0x10000));
									i_2673_ = (i_2671_ - i_2673_ | i_2673_ - (i_2673_ >>> 8));
									if (i_2670_ == 0 && i_2664_ != 255) {
										i_2670_ = i_2673_;
										i_2673_ = is[i_2594_];
										i_2673_ = ((((i_2670_ & 0xff00ff) * i_2664_ + ((i_2673_ & 0xff00ff) * i_2665_)) & ~0xff00ff) + (((i_2670_ & 0xff00) * i_2664_ + ((i_2673_ & 0xff00) * i_2665_)) & 0xff0000)) >> 8;
									}
									is[i_2594_] = i_2673_;
								}
								if (bool_2576_ && bool_2585_)
									fs[i_2594_] = f;
							}
							i_2586_ += i_2590_;
							i_2594_++;
						}
						i_2587_ += i_2591_;
						i_2586_ = i_2663_;
						i_2594_ += i_2595_;
					}
				} else if (i_2581_ == 2) {
					int i_2674_ = i_2582_ >>> 24;
					int i_2675_ = 256 - i_2674_;
					int i_2676_ = (i_2582_ & 0xff00ff) * i_2675_ & ~0xff00ff;
					int i_2677_ = (i_2582_ & 0xff00) * i_2675_ & 0xff0000;
					i_2582_ = (i_2676_ | i_2677_) >>> 8;
					int i_2678_ = i_2586_;
					for (int i_2679_ = -i_2580_; i_2679_ < 0; i_2679_++) {
						int i_2680_ = ((i_2587_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_2681_ = -i_2579_; i_2681_ < 0; i_2681_++) {
							if (!bool_2576_ || f < fs[i_2594_]) {
								int i_2682_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2586_ >> 16) + i_2680_]);
								if (i_2682_ != 0) {
									if (bool) {
										int i_2683_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2682_ & 0xff]);
										i_2676_ = ((i_2683_ & 0xff00ff) * i_2674_ & ~0xff00ff);
										i_2677_ = ((i_2683_ & 0xff00) * i_2674_ & 0xff0000);
										is[i_2594_] = ((i_2676_ | i_2677_) >>> 8) + i_2582_;
									}
									if (bool_2576_ && bool_2585_)
										fs[i_2594_] = f;
								}
							}
							i_2586_ += i_2590_;
							i_2594_++;
						}
						i_2587_ += i_2591_;
						i_2586_ = i_2678_;
						i_2594_ += i_2595_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2583_ == 2) {
				if (i_2581_ == 1) {
					int i_2684_ = i_2586_;
					for (int i_2685_ = -i_2580_; i_2685_ < 0; i_2685_++) {
						int i_2686_ = ((i_2587_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_2687_ = -i_2579_; i_2687_ < 0; i_2687_++) {
							if (!bool_2576_ || f < fs[i_2594_]) {
								int i_2688_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2586_ >> 16) + i_2686_]);
								if (i_2688_ != 0) {
									if (bool) {
										int i_2689_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2688_ & 0xff]);
										int i_2690_ = is[i_2594_];
										int i_2691_ = i_2689_ + i_2690_;
										int i_2692_ = ((i_2689_ & 0xff00ff) + (i_2690_ & 0xff00ff));
										i_2690_ = ((i_2692_ & 0x1000100) + (i_2691_ - i_2692_ & 0x10000));
										is[i_2594_] = (i_2691_ - i_2690_ | i_2690_ - (i_2690_ >>> 8));
									}
									if (bool_2576_ && bool_2585_)
										fs[i_2594_] = f;
								}
							}
							i_2586_ += i_2590_;
							i_2594_++;
						}
						i_2587_ += i_2591_;
						i_2586_ = i_2684_;
						i_2594_ += i_2595_;
					}
				} else if (i_2581_ == 0) {
					int i_2693_ = i_2586_;
					int i_2694_ = (i_2582_ & 0xff0000) >> 16;
					int i_2695_ = (i_2582_ & 0xff00) >> 8;
					int i_2696_ = i_2582_ & 0xff;
					for (int i_2697_ = -i_2580_; i_2697_ < 0; i_2697_++) {
						int i_2698_ = ((i_2587_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_2699_ = -i_2579_; i_2699_ < 0; i_2699_++) {
							if (!bool_2576_ || f < fs[i_2594_]) {
								int i_2700_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2586_ >> 16) + i_2698_]);
								if (i_2700_ != 0) {
									if (bool) {
										int i_2701_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2700_ & 0xff]);
										int i_2702_ = ((i_2701_ & 0xff0000) * i_2694_ & ~0xffffff);
										int i_2703_ = ((i_2701_ & 0xff00) * i_2695_ & 0xff0000);
										int i_2704_ = ((i_2701_ & 0xff) * i_2696_ & 0xff00);
										i_2701_ = (i_2702_ | i_2703_ | i_2704_) >>> 8;
										int i_2705_ = is[i_2594_];
										int i_2706_ = i_2701_ + i_2705_;
										int i_2707_ = ((i_2701_ & 0xff00ff) + (i_2705_ & 0xff00ff));
										i_2705_ = ((i_2707_ & 0x1000100) + (i_2706_ - i_2707_ & 0x10000));
										is[i_2594_] = (i_2706_ - i_2705_ | i_2705_ - (i_2705_ >>> 8));
									}
									if (bool_2576_ && bool_2585_)
										fs[i_2594_] = f;
								}
							}
							i_2586_ += i_2590_;
							i_2594_++;
						}
						i_2587_ += i_2591_;
						i_2586_ = i_2693_;
						i_2594_ += i_2595_;
					}
				} else if (i_2581_ == 3) {
					int i_2708_ = i_2586_;
					for (int i_2709_ = -i_2580_; i_2709_ < 0; i_2709_++) {
						int i_2710_ = ((i_2587_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_2711_ = -i_2579_; i_2711_ < 0; i_2711_++) {
							if (!bool_2576_ || f < fs[i_2594_]) {
								if (bool) {
									byte i_2712_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2586_ >> 16) + i_2710_]);
									int i_2713_ = (i_2712_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2712_]) : 0);
									int i_2714_ = i_2713_ + i_2582_;
									int i_2715_ = ((i_2713_ & 0xff00ff) + (i_2582_ & 0xff00ff));
									int i_2716_ = ((i_2715_ & 0x1000100) + (i_2714_ - i_2715_ & 0x10000));
									i_2713_ = (i_2714_ - i_2716_ | i_2716_ - (i_2716_ >>> 8));
									i_2716_ = is[i_2594_];
									i_2714_ = i_2713_ + i_2716_;
									i_2715_ = (i_2713_ & 0xff00ff) + (i_2716_ & 0xff00ff);
									i_2716_ = ((i_2715_ & 0x1000100) + (i_2714_ - i_2715_ & 0x10000));
									is[i_2594_] = (i_2714_ - i_2716_ | i_2716_ - (i_2716_ >>> 8));
								}
								if (bool_2576_ && bool_2585_)
									fs[i_2594_] = f;
							}
							i_2586_ += i_2590_;
							i_2594_++;
						}
						i_2587_ += i_2591_;
						i_2586_ = i_2708_;
						i_2594_ += i_2595_;
					}
				} else if (i_2581_ == 2) {
					int i_2717_ = i_2582_ >>> 24;
					int i_2718_ = 256 - i_2717_;
					int i_2719_ = (i_2582_ & 0xff00ff) * i_2718_ & ~0xff00ff;
					int i_2720_ = (i_2582_ & 0xff00) * i_2718_ & 0xff0000;
					i_2582_ = (i_2719_ | i_2720_) >>> 8;
					int i_2721_ = i_2586_;
					for (int i_2722_ = -i_2580_; i_2722_ < 0; i_2722_++) {
						int i_2723_ = ((i_2587_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
						for (int i_2724_ = -i_2579_; i_2724_ < 0; i_2724_++) {
							if (!bool_2576_ || f < fs[i_2594_]) {
								int i_2725_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2586_ >> 16) + i_2723_]);
								if (i_2725_ != 0) {
									if (bool) {
										int i_2726_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2725_ & 0xff]);
										i_2719_ = ((i_2726_ & 0xff00ff) * i_2717_ & ~0xff00ff);
										i_2720_ = ((i_2726_ & 0xff00) * i_2717_ & 0xff0000);
										i_2726_ = (((i_2719_ | i_2720_) >>> 8) + i_2582_);
										int i_2727_ = is[i_2594_];
										int i_2728_ = i_2726_ + i_2727_;
										int i_2729_ = ((i_2726_ & 0xff00ff) + (i_2727_ & 0xff00ff));
										i_2727_ = ((i_2729_ & 0x1000100) + (i_2728_ - i_2729_ & 0x10000));
										is[i_2594_] = (i_2728_ - i_2727_ | i_2727_ - (i_2727_ >>> 8));
									}
									if (bool_2576_ && bool_2585_)
										fs[i_2594_] = f;
								}
							}
							i_2586_ += i_2590_;
							i_2594_++;
						}
						i_2587_ += i_2591_;
						i_2586_ = i_2721_;
						i_2594_ += i_2595_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method652(int i, int i_2730_, int i_2731_, int i_2732_, int i_2733_, int i_2734_, int i_2735_, int i_2736_) {
		if (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (i_2731_ > 0 && i_2732_ > 0) {
			int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
			if (is != null) {
				int i_2737_ = 0;
				int i_2738_ = 0;
				int i_2739_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
				int i_2740_ = (((Class57_Sub1_Sub3) this).anInt8990 + ((Class57_Sub1_Sub3) this).anInt9010 + ((Class57_Sub1_Sub3) this).anInt8997);
				int i_2741_ = (((Class57_Sub1_Sub3) this).anInt9000 + ((Class57_Sub1_Sub3) this).anInt8989 + ((Class57_Sub1_Sub3) this).anInt8993);
				int i_2742_ = (i_2740_ << 16) / i_2731_;
				int i_2743_ = (i_2741_ << 16) / i_2732_;
				if (((Class57_Sub1_Sub3) this).anInt8990 > 0) {
					int i_2744_ = ((((Class57_Sub1_Sub3) this).anInt8990 << 16) + i_2742_ - 1) / i_2742_;
					i += i_2744_;
					i_2737_ += (i_2744_ * i_2742_ - (((Class57_Sub1_Sub3) this).anInt8990 << 16));
				}
				if (((Class57_Sub1_Sub3) this).anInt9000 > 0) {
					int i_2745_ = ((((Class57_Sub1_Sub3) this).anInt9000 << 16) + i_2743_ - 1) / i_2743_;
					i_2730_ += i_2745_;
					i_2738_ += (i_2745_ * i_2743_ - (((Class57_Sub1_Sub3) this).anInt9000 << 16));
				}
				if (((Class57_Sub1_Sub3) this).anInt9010 < i_2740_)
					i_2731_ = ((((Class57_Sub1_Sub3) this).anInt9010 << 16) - i_2737_ + i_2742_ - 1) / i_2742_;
				if (((Class57_Sub1_Sub3) this).anInt8989 < i_2741_)
					i_2732_ = ((((Class57_Sub1_Sub3) this).anInt8989 << 16) - i_2738_ + i_2743_ - 1) / i_2743_;
				int i_2746_ = i + i_2730_ * i_2739_;
				int i_2747_ = i_2739_ - i_2731_;
				if (i_2730_ + i_2732_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7977 * 63686679))
					i_2732_ -= (i_2730_ + i_2732_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7977) * 63686679);
				if (i_2730_ < (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805) {
					int i_2748_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_2730_;
					i_2732_ -= i_2748_;
					i_2746_ += i_2748_ * i_2739_;
					i_2738_ += i_2743_ * i_2748_;
				}
				if (i + i_2731_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725) {
					int i_2749_ = (i + i_2731_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725);
					i_2731_ -= i_2749_;
					i_2747_ += i_2749_;
				}
				if (i < (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7974 * -912871679)) {
					int i_2750_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i;
					i_2731_ -= i_2750_;
					i_2746_ += i_2750_;
					i_2737_ += i_2742_ * i_2750_;
					i_2747_ += i_2750_;
				}
				if (i_2735_ == 0) {
					if (i_2733_ == 1) {
						int i_2751_ = i_2737_;
						for (int i_2752_ = -i_2732_; i_2752_ < 0; i_2752_++) {
							int i_2753_ = ((i_2738_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2754_ = -i_2731_; i_2754_ < 0; i_2754_++) {
								is[i_2746_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[(i_2737_ >> 16) + i_2753_]) & 0xff]);
								i_2737_ += i_2742_;
							}
							i_2738_ += i_2743_;
							i_2737_ = i_2751_;
							i_2746_ += i_2747_;
						}
					} else if (i_2733_ == 0) {
						int i_2755_ = (i_2734_ & 0xff0000) >> 16;
						int i_2756_ = (i_2734_ & 0xff00) >> 8;
						int i_2757_ = i_2734_ & 0xff;
						int i_2758_ = i_2737_;
						for (int i_2759_ = -i_2732_; i_2759_ < 0; i_2759_++) {
							int i_2760_ = ((i_2738_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2761_ = -i_2731_; i_2761_ < 0; i_2761_++) {
								int i_2762_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[(i_2737_ >> 16) + i_2760_]) & 0xff]);
								int i_2763_ = ((i_2762_ & 0xff0000) * i_2755_ & ~0xffffff);
								int i_2764_ = (i_2762_ & 0xff00) * i_2756_ & 0xff0000;
								int i_2765_ = (i_2762_ & 0xff) * i_2757_ & 0xff00;
								is[i_2746_++] = (i_2763_ | i_2764_ | i_2765_) >>> 8;
								i_2737_ += i_2742_;
							}
							i_2738_ += i_2743_;
							i_2737_ = i_2758_;
							i_2746_ += i_2747_;
						}
					} else if (i_2733_ == 3) {
						int i_2766_ = i_2737_;
						for (int i_2767_ = -i_2732_; i_2767_ < 0; i_2767_++) {
							int i_2768_ = ((i_2738_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2769_ = -i_2731_; i_2769_ < 0; i_2769_++) {
								byte i_2770_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2737_ >> 16) + i_2768_]);
								int i_2771_ = (i_2770_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2770_]) : 0);
								int i_2772_ = i_2771_ + i_2734_;
								int i_2773_ = ((i_2771_ & 0xff00ff) + (i_2734_ & 0xff00ff));
								int i_2774_ = ((i_2773_ & 0x1000100) + (i_2772_ - i_2773_ & 0x10000));
								is[i_2746_++] = i_2772_ - i_2774_ | i_2774_ - (i_2774_ >>> 8);
								i_2737_ += i_2742_;
							}
							i_2738_ += i_2743_;
							i_2737_ = i_2766_;
							i_2746_ += i_2747_;
						}
					} else if (i_2733_ == 2) {
						int i_2775_ = i_2734_ >>> 24;
						int i_2776_ = 256 - i_2775_;
						int i_2777_ = (i_2734_ & 0xff00ff) * i_2776_ & ~0xff00ff;
						int i_2778_ = (i_2734_ & 0xff00) * i_2776_ & 0xff0000;
						i_2734_ = (i_2777_ | i_2778_) >>> 8;
						int i_2779_ = i_2737_;
						for (int i_2780_ = -i_2732_; i_2780_ < 0; i_2780_++) {
							int i_2781_ = ((i_2738_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2782_ = -i_2731_; i_2782_ < 0; i_2782_++) {
								int i_2783_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[(i_2737_ >> 16) + i_2781_]) & 0xff]);
								i_2777_ = ((i_2783_ & 0xff00ff) * i_2775_ & ~0xff00ff);
								i_2778_ = (i_2783_ & 0xff00) * i_2775_ & 0xff0000;
								is[i_2746_++] = ((i_2777_ | i_2778_) >>> 8) + i_2734_;
								i_2737_ += i_2742_;
							}
							i_2738_ += i_2743_;
							i_2737_ = i_2779_;
							i_2746_ += i_2747_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2735_ == 1) {
					if (i_2733_ == 1) {
						int i_2784_ = i_2737_;
						for (int i_2785_ = -i_2732_; i_2785_ < 0; i_2785_++) {
							int i_2786_ = ((i_2738_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2787_ = -i_2731_; i_2787_ < 0; i_2787_++) {
								int i_2788_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2737_ >> 16) + i_2786_]);
								if (i_2788_ != 0)
									is[i_2746_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2788_ & 0xff]);
								else
									i_2746_++;
								i_2737_ += i_2742_;
							}
							i_2738_ += i_2743_;
							i_2737_ = i_2784_;
							i_2746_ += i_2747_;
						}
					} else if (i_2733_ == 0) {
						int i_2789_ = i_2737_;
						if ((i_2734_ & 0xffffff) == 16777215) {
							int i_2790_ = i_2734_ >>> 24;
							int i_2791_ = 256 - i_2790_;
							for (int i_2792_ = -i_2732_; i_2792_ < 0; i_2792_++) {
								int i_2793_ = ((i_2738_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
								for (int i_2794_ = -i_2731_; i_2794_ < 0; i_2794_++) {
									int i_2795_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2737_ >> 16) + i_2793_]);
									if (i_2795_ != 0) {
										int i_2796_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2795_ & 0xff]);
										int i_2797_ = is[i_2746_];
										is[i_2746_++] = ((((i_2796_ & 0xff00ff) * i_2790_ + ((i_2797_ & 0xff00ff) * i_2791_)) & ~0xff00ff) + (((i_2796_ & 0xff00) * i_2790_ + ((i_2797_ & 0xff00) * i_2791_)) & 0xff0000)) >> 8;
									} else
										i_2746_++;
									i_2737_ += i_2742_;
								}
								i_2738_ += i_2743_;
								i_2737_ = i_2789_;
								i_2746_ += i_2747_;
							}
						} else {
							int i_2798_ = (i_2734_ & 0xff0000) >> 16;
							int i_2799_ = (i_2734_ & 0xff00) >> 8;
							int i_2800_ = i_2734_ & 0xff;
							int i_2801_ = i_2734_ >>> 24;
							int i_2802_ = 256 - i_2801_;
							for (int i_2803_ = -i_2732_; i_2803_ < 0; i_2803_++) {
								int i_2804_ = ((i_2738_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
								for (int i_2805_ = -i_2731_; i_2805_ < 0; i_2805_++) {
									int i_2806_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2737_ >> 16) + i_2804_]);
									if (i_2806_ != 0) {
										int i_2807_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2806_ & 0xff]);
										if (i_2801_ != 255) {
											int i_2808_ = (((i_2807_ & 0xff0000) * i_2798_) & ~0xffffff);
											int i_2809_ = ((i_2807_ & 0xff00) * i_2799_ & 0xff0000);
											int i_2810_ = ((i_2807_ & 0xff) * i_2800_ & 0xff00);
											i_2807_ = (i_2808_ | i_2809_ | i_2810_) >>> 8;
											int i_2811_ = is[i_2746_];
											is[i_2746_++] = (((((i_2807_ & 0xff00ff) * i_2801_) + ((i_2811_ & 0xff00ff) * i_2802_)) & ~0xff00ff) + ((((i_2807_ & 0xff00) * i_2801_) + ((i_2811_ & 0xff00) * i_2802_)) & 0xff0000)) >> 8;
										} else {
											int i_2812_ = (((i_2807_ & 0xff0000) * i_2798_) & ~0xffffff);
											int i_2813_ = ((i_2807_ & 0xff00) * i_2799_ & 0xff0000);
											int i_2814_ = ((i_2807_ & 0xff) * i_2800_ & 0xff00);
											is[i_2746_++] = (i_2812_ | i_2813_ | i_2814_) >>> 8;
										}
									} else
										i_2746_++;
									i_2737_ += i_2742_;
								}
								i_2738_ += i_2743_;
								i_2737_ = i_2789_;
								i_2746_ += i_2747_;
							}
						}
					} else if (i_2733_ == 3) {
						int i_2815_ = i_2737_;
						int i_2816_ = i_2734_ >>> 24;
						int i_2817_ = 256 - i_2816_;
						for (int i_2818_ = -i_2732_; i_2818_ < 0; i_2818_++) {
							int i_2819_ = ((i_2738_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2820_ = -i_2731_; i_2820_ < 0; i_2820_++) {
								byte i_2821_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2737_ >> 16) + i_2819_]);
								int i_2822_ = (i_2821_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2821_]) : 0);
								int i_2823_ = i_2822_ + i_2734_;
								int i_2824_ = ((i_2822_ & 0xff00ff) + (i_2734_ & 0xff00ff));
								int i_2825_ = ((i_2824_ & 0x1000100) + (i_2823_ - i_2824_ & 0x10000));
								i_2825_ = i_2823_ - i_2825_ | i_2825_ - (i_2825_ >>> 8);
								if (i_2822_ == 0 && i_2816_ != 255) {
									i_2822_ = i_2825_;
									i_2825_ = is[i_2746_];
									i_2825_ = ((((i_2822_ & 0xff00ff) * i_2816_ + (i_2825_ & 0xff00ff) * i_2817_) & ~0xff00ff) + (((i_2822_ & 0xff00) * i_2816_ + (i_2825_ & 0xff00) * i_2817_) & 0xff0000)) >> 8;
								}
								is[i_2746_++] = i_2825_;
								i_2737_ += i_2742_;
							}
							i_2738_ += i_2743_;
							i_2737_ = i_2815_;
							i_2746_ += i_2747_;
						}
					} else if (i_2733_ == 2) {
						int i_2826_ = i_2734_ >>> 24;
						int i_2827_ = 256 - i_2826_;
						int i_2828_ = (i_2734_ & 0xff00ff) * i_2827_ & ~0xff00ff;
						int i_2829_ = (i_2734_ & 0xff00) * i_2827_ & 0xff0000;
						i_2734_ = (i_2828_ | i_2829_) >>> 8;
						int i_2830_ = i_2737_;
						for (int i_2831_ = -i_2732_; i_2831_ < 0; i_2831_++) {
							int i_2832_ = ((i_2738_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2833_ = -i_2731_; i_2833_ < 0; i_2833_++) {
								int i_2834_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2737_ >> 16) + i_2832_]);
								if (i_2834_ != 0) {
									int i_2835_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2834_ & 0xff]);
									i_2828_ = ((i_2835_ & 0xff00ff) * i_2826_ & ~0xff00ff);
									i_2829_ = ((i_2835_ & 0xff00) * i_2826_ & 0xff0000);
									is[i_2746_++] = ((i_2828_ | i_2829_) >>> 8) + i_2734_;
								} else
									i_2746_++;
								i_2737_ += i_2742_;
							}
							i_2738_ += i_2743_;
							i_2737_ = i_2830_;
							i_2746_ += i_2747_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2735_ == 2) {
					if (i_2733_ == 1) {
						int i_2836_ = i_2737_;
						for (int i_2837_ = -i_2732_; i_2837_ < 0; i_2837_++) {
							int i_2838_ = ((i_2738_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2839_ = -i_2731_; i_2839_ < 0; i_2839_++) {
								int i_2840_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2737_ >> 16) + i_2838_]);
								if (i_2840_ != 0) {
									int i_2841_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2840_ & 0xff]);
									int i_2842_ = is[i_2746_];
									int i_2843_ = i_2841_ + i_2842_;
									int i_2844_ = ((i_2841_ & 0xff00ff) + (i_2842_ & 0xff00ff));
									i_2842_ = ((i_2844_ & 0x1000100) + (i_2843_ - i_2844_ & 0x10000));
									is[i_2746_++] = (i_2843_ - i_2842_ | i_2842_ - (i_2842_ >>> 8));
								} else
									i_2746_++;
								i_2737_ += i_2742_;
							}
							i_2738_ += i_2743_;
							i_2737_ = i_2836_;
							i_2746_ += i_2747_;
						}
					} else if (i_2733_ == 0) {
						int i_2845_ = i_2737_;
						int i_2846_ = (i_2734_ & 0xff0000) >> 16;
						int i_2847_ = (i_2734_ & 0xff00) >> 8;
						int i_2848_ = i_2734_ & 0xff;
						for (int i_2849_ = -i_2732_; i_2849_ < 0; i_2849_++) {
							int i_2850_ = ((i_2738_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2851_ = -i_2731_; i_2851_ < 0; i_2851_++) {
								int i_2852_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2737_ >> 16) + i_2850_]);
								if (i_2852_ != 0) {
									int i_2853_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2852_ & 0xff]);
									int i_2854_ = ((i_2853_ & 0xff0000) * i_2846_ & ~0xffffff);
									int i_2855_ = ((i_2853_ & 0xff00) * i_2847_ & 0xff0000);
									int i_2856_ = (i_2853_ & 0xff) * i_2848_ & 0xff00;
									i_2853_ = (i_2854_ | i_2855_ | i_2856_) >>> 8;
									int i_2857_ = is[i_2746_];
									int i_2858_ = i_2853_ + i_2857_;
									int i_2859_ = ((i_2853_ & 0xff00ff) + (i_2857_ & 0xff00ff));
									i_2857_ = ((i_2859_ & 0x1000100) + (i_2858_ - i_2859_ & 0x10000));
									is[i_2746_++] = (i_2858_ - i_2857_ | i_2857_ - (i_2857_ >>> 8));
								} else
									i_2746_++;
								i_2737_ += i_2742_;
							}
							i_2738_ += i_2743_;
							i_2737_ = i_2845_;
							i_2746_ += i_2747_;
						}
					} else if (i_2733_ == 3) {
						int i_2860_ = i_2737_;
						for (int i_2861_ = -i_2732_; i_2861_ < 0; i_2861_++) {
							int i_2862_ = ((i_2738_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2863_ = -i_2731_; i_2863_ < 0; i_2863_++) {
								byte i_2864_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2737_ >> 16) + i_2862_]);
								int i_2865_ = (i_2864_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2864_]) : 0);
								int i_2866_ = i_2865_ + i_2734_;
								int i_2867_ = ((i_2865_ & 0xff00ff) + (i_2734_ & 0xff00ff));
								int i_2868_ = ((i_2867_ & 0x1000100) + (i_2866_ - i_2867_ & 0x10000));
								i_2865_ = i_2866_ - i_2868_ | i_2868_ - (i_2868_ >>> 8);
								i_2868_ = is[i_2746_];
								i_2866_ = i_2865_ + i_2868_;
								i_2867_ = (i_2865_ & 0xff00ff) + (i_2868_ & 0xff00ff);
								i_2868_ = ((i_2867_ & 0x1000100) + (i_2866_ - i_2867_ & 0x10000));
								is[i_2746_++] = i_2866_ - i_2868_ | i_2868_ - (i_2868_ >>> 8);
								i_2737_ += i_2742_;
							}
							i_2738_ += i_2743_;
							i_2737_ = i_2860_;
							i_2746_ += i_2747_;
						}
					} else if (i_2733_ == 2) {
						int i_2869_ = i_2734_ >>> 24;
						int i_2870_ = 256 - i_2869_;
						int i_2871_ = (i_2734_ & 0xff00ff) * i_2870_ & ~0xff00ff;
						int i_2872_ = (i_2734_ & 0xff00) * i_2870_ & 0xff0000;
						i_2734_ = (i_2871_ | i_2872_) >>> 8;
						int i_2873_ = i_2737_;
						for (int i_2874_ = -i_2732_; i_2874_ < 0; i_2874_++) {
							int i_2875_ = ((i_2738_ >> 16) * ((Class57_Sub1_Sub3) this).anInt9010);
							for (int i_2876_ = -i_2731_; i_2876_ < 0; i_2876_++) {
								int i_2877_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(i_2737_ >> 16) + i_2875_]);
								if (i_2877_ != 0) {
									int i_2878_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2877_ & 0xff]);
									i_2871_ = ((i_2878_ & 0xff00ff) * i_2869_ & ~0xff00ff);
									i_2872_ = ((i_2878_ & 0xff00) * i_2869_ & 0xff0000);
									i_2878_ = (((i_2871_ | i_2872_) >>> 8) + i_2734_);
									int i_2879_ = is[i_2746_];
									int i_2880_ = i_2878_ + i_2879_;
									int i_2881_ = ((i_2878_ & 0xff00ff) + (i_2879_ & 0xff00ff));
									i_2879_ = ((i_2881_ & 0x1000100) + (i_2880_ - i_2881_ & 0x10000));
									is[i_2746_++] = (i_2880_ - i_2879_ | i_2879_ - (i_2879_ >>> 8));
								} else
									i_2746_++;
								i_2737_ += i_2742_;
							}
							i_2738_ += i_2743_;
							i_2737_ = i_2873_;
							i_2746_ += i_2747_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method686(int i, int i_2882_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_2883_ = anInt9001;
					while (i_2883_ < 0) {
						int i_2884_ = anInt9003;
						int i_2885_ = anInt8988;
						int i_2886_ = anInt9011;
						int i_2887_ = anInt8999;
						if (i_2885_ >= 0 && i_2886_ >= 0 && i_2885_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) < 0 && i_2886_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) < 0) {
							for (/**/; i_2887_ < 0; i_2887_++) {
								int i_2888_ = (((i_2886_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_2885_ >> 12));
								int i_2889_ = i_2884_++;
								if (i_2882_ == 0) {
									if (i == 1)
										is[i_2889_] = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_2888_]) & 0xff)]);
									else if (i == 0) {
										int i_2890_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_2888_]) & 0xff)]);
										int i_2891_ = ((i_2890_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2892_ = ((i_2890_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2893_ = ((i_2890_ & 0xff) * anInt9019 & 0xff00);
										is[i_2889_] = (i_2891_ | i_2892_ | i_2893_) >>> 8;
									} else if (i == 3) {
										int i_2894_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_2888_]) & 0xff)]);
										int i_2895_ = anInt9014;
										int i_2896_ = i_2894_ + i_2895_;
										int i_2897_ = ((i_2894_ & 0xff00ff) + (i_2895_ & 0xff00ff));
										int i_2898_ = ((i_2897_ & 0x1000100) + (i_2896_ - i_2897_ & 0x10000));
										is[i_2889_] = (i_2896_ - i_2898_ | i_2898_ - (i_2898_ >>> 8));
									} else if (i == 2) {
										int i_2899_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_2888_]) & 0xff)]);
										int i_2900_ = ((i_2899_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2901_ = ((i_2899_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_2889_] = ((i_2900_ | i_2901_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_2882_ == 1) {
									if (i == 1) {
										int i_2902_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2888_]);
										if (i_2902_ != 0)
											is[i_2889_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2902_ & 0xff]);
									} else if (i == 0) {
										int i_2903_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2888_]);
										if (i_2903_ != 0) {
											int i_2904_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2903_ & 0xff]);
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_2905_ = anInt9014 >>> 24;
												int i_2906_ = 256 - i_2905_;
												int i_2907_ = is[i_2889_];
												is[i_2889_] = (((((i_2904_ & 0xff00ff) * i_2905_) + ((i_2907_ & 0xff00ff) * i_2906_)) & ~0xff00ff) + ((((i_2904_ & 0xff00) * i_2905_) + ((i_2907_ & 0xff00) * i_2906_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_2908_ = (((i_2904_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_2909_ = (((i_2904_ & 0xff00) * anInt9018) & 0xff0000);
												int i_2910_ = (((i_2904_ & 0xff) * anInt9019) & 0xff00);
												i_2904_ = (i_2908_ | i_2909_ | i_2910_) >>> 8;
												int i_2911_ = is[i_2889_];
												is[i_2889_] = (((((i_2904_ & 0xff00ff) * anInt9015) + ((i_2911_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2904_ & 0xff00) * anInt9015) + ((i_2911_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_2912_ = (((i_2904_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_2913_ = (((i_2904_ & 0xff00) * anInt9018) & 0xff0000);
												int i_2914_ = (((i_2904_ & 0xff) * anInt9019) & 0xff00);
												is[i_2889_] = (i_2912_ | i_2913_ | i_2914_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2915_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2888_]);
										int i_2916_ = (i_2915_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2915_]) : 0);
										int i_2917_ = anInt9014;
										int i_2918_ = i_2916_ + i_2917_;
										int i_2919_ = ((i_2916_ & 0xff00ff) + (i_2917_ & 0xff00ff));
										int i_2920_ = ((i_2919_ & 0x1000100) + (i_2918_ - i_2919_ & 0x10000));
										i_2920_ = (i_2918_ - i_2920_ | i_2920_ - (i_2920_ >>> 8));
										if (i_2916_ == 0 && anInt9015 != 255) {
											i_2916_ = i_2920_;
											i_2920_ = is[i_2889_];
											i_2920_ = (((((i_2916_ & 0xff00ff) * anInt9015) + ((i_2920_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2916_ & 0xff00) * anInt9015) + ((i_2920_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_2889_] = i_2920_;
									} else if (i == 2) {
										int i_2921_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2888_]);
										if (i_2921_ != 0) {
											int i_2922_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2921_ & 0xff]);
											int i_2923_ = (((i_2922_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_2924_ = (((i_2922_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_2889_++] = (((i_2923_ | i_2924_) >>> 8) + anInt9022);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2882_ == 2) {
									if (i == 1) {
										int i_2925_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2888_]);
										if (i_2925_ != 0) {
											int i_2926_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2925_ & 0xff]);
											int i_2927_ = is[i_2889_];
											int i_2928_ = i_2926_ + i_2927_;
											int i_2929_ = ((i_2926_ & 0xff00ff) + (i_2927_ & 0xff00ff));
											i_2927_ = ((i_2929_ & 0x1000100) + (i_2928_ - i_2929_ & 0x10000));
											is[i_2889_] = (i_2928_ - i_2927_ | i_2927_ - (i_2927_ >>> 8));
										}
									} else if (i == 0) {
										int i_2930_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2888_]);
										if (i_2930_ != 0) {
											int i_2931_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2930_ & 0xff]);
											int i_2932_ = (((i_2931_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2933_ = (((i_2931_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2934_ = ((i_2931_ & 0xff) * anInt9019 & 0xff00);
											i_2931_ = (i_2932_ | i_2933_ | i_2934_) >>> 8;
											int i_2935_ = is[i_2889_];
											int i_2936_ = i_2931_ + i_2935_;
											int i_2937_ = ((i_2931_ & 0xff00ff) + (i_2935_ & 0xff00ff));
											i_2935_ = ((i_2937_ & 0x1000100) + (i_2936_ - i_2937_ & 0x10000));
											is[i_2889_] = (i_2936_ - i_2935_ | i_2935_ - (i_2935_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2938_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2888_]);
										int i_2939_ = (i_2938_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2938_]) : 0);
										int i_2940_ = anInt9014;
										int i_2941_ = i_2939_ + i_2940_;
										int i_2942_ = ((i_2939_ & 0xff00ff) + (i_2940_ & 0xff00ff));
										int i_2943_ = ((i_2942_ & 0x1000100) + (i_2941_ - i_2942_ & 0x10000));
										i_2943_ = (i_2941_ - i_2943_ | i_2943_ - (i_2943_ >>> 8));
										if (i_2939_ == 0 && anInt9015 != 255) {
											i_2939_ = i_2943_;
											i_2943_ = is[i_2889_];
											i_2943_ = (((((i_2939_ & 0xff00ff) * anInt9015) + ((i_2943_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2939_ & 0xff00) * anInt9015) + ((i_2943_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_2889_] = i_2943_;
									} else if (i == 2) {
										int i_2944_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2888_]);
										if (i_2944_ != 0) {
											int i_2945_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2944_ & 0xff]);
											int i_2946_ = (((i_2945_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_2947_ = (((i_2945_ & 0xff00) * anInt9015) & 0xff0000);
											i_2945_ = ((i_2946_ | i_2947_) >>> 8) + anInt9022;
											int i_2948_ = is[i_2889_];
											int i_2949_ = i_2945_ + i_2948_;
											int i_2950_ = ((i_2945_ & 0xff00ff) + (i_2948_ & 0xff00ff));
											i_2948_ = ((i_2950_ & 0x1000100) + (i_2949_ - i_2950_ & 0x10000));
											is[i_2889_] = (i_2949_ - i_2948_ | i_2948_ - (i_2948_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_2883_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_2951_ = anInt9001;
					while (i_2951_ < 0) {
						int i_2952_ = anInt9003;
						int i_2953_ = anInt8988;
						int i_2954_ = anInt9011 + anInt9013;
						int i_2955_ = anInt8999;
						if (i_2953_ >= 0 && i_2953_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) < 0) {
							int i_2956_;
							if ((i_2956_ = (i_2954_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12))) >= 0) {
								i_2956_ = (anInt8991 - i_2956_) / anInt8991;
								i_2955_ += i_2956_;
								i_2954_ += anInt8991 * i_2956_;
								i_2952_ += i_2956_;
							}
							if ((i_2956_ = (i_2954_ - anInt8991) / anInt8991) > i_2955_)
								i_2955_ = i_2956_;
							for (/**/; i_2955_ < 0; i_2955_++) {
								int i_2957_ = (((i_2954_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_2953_ >> 12));
								int i_2958_ = i_2952_++;
								if (i_2882_ == 0) {
									if (i == 1)
										is[i_2958_] = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_2957_]) & 0xff)]);
									else if (i == 0) {
										int i_2959_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_2957_]) & 0xff)]);
										int i_2960_ = ((i_2959_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2961_ = ((i_2959_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2962_ = ((i_2959_ & 0xff) * anInt9019 & 0xff00);
										is[i_2958_] = (i_2960_ | i_2961_ | i_2962_) >>> 8;
									} else if (i == 3) {
										int i_2963_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_2957_]) & 0xff)]);
										int i_2964_ = anInt9014;
										int i_2965_ = i_2963_ + i_2964_;
										int i_2966_ = ((i_2963_ & 0xff00ff) + (i_2964_ & 0xff00ff));
										int i_2967_ = ((i_2966_ & 0x1000100) + (i_2965_ - i_2966_ & 0x10000));
										is[i_2958_] = (i_2965_ - i_2967_ | i_2967_ - (i_2967_ >>> 8));
									} else if (i == 2) {
										int i_2968_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_2957_]) & 0xff)]);
										int i_2969_ = ((i_2968_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2970_ = ((i_2968_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_2958_] = ((i_2969_ | i_2970_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_2882_ == 1) {
									if (i == 1) {
										int i_2971_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2957_]);
										if (i_2971_ != 0)
											is[i_2958_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2971_ & 0xff]);
									} else if (i == 0) {
										int i_2972_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2957_]);
										if (i_2972_ != 0) {
											int i_2973_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2972_ & 0xff]);
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_2974_ = anInt9014 >>> 24;
												int i_2975_ = 256 - i_2974_;
												int i_2976_ = is[i_2958_];
												is[i_2958_] = (((((i_2973_ & 0xff00ff) * i_2974_) + ((i_2976_ & 0xff00ff) * i_2975_)) & ~0xff00ff) + ((((i_2973_ & 0xff00) * i_2974_) + ((i_2976_ & 0xff00) * i_2975_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_2977_ = (((i_2973_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_2978_ = (((i_2973_ & 0xff00) * anInt9018) & 0xff0000);
												int i_2979_ = (((i_2973_ & 0xff) * anInt9019) & 0xff00);
												i_2973_ = (i_2977_ | i_2978_ | i_2979_) >>> 8;
												int i_2980_ = is[i_2958_];
												is[i_2958_] = (((((i_2973_ & 0xff00ff) * anInt9015) + ((i_2980_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2973_ & 0xff00) * anInt9015) + ((i_2980_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_2981_ = (((i_2973_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_2982_ = (((i_2973_ & 0xff00) * anInt9018) & 0xff0000);
												int i_2983_ = (((i_2973_ & 0xff) * anInt9019) & 0xff00);
												is[i_2958_] = (i_2981_ | i_2982_ | i_2983_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2984_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2957_]);
										int i_2985_ = (i_2984_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_2984_]) : 0);
										int i_2986_ = anInt9014;
										int i_2987_ = i_2985_ + i_2986_;
										int i_2988_ = ((i_2985_ & 0xff00ff) + (i_2986_ & 0xff00ff));
										int i_2989_ = ((i_2988_ & 0x1000100) + (i_2987_ - i_2988_ & 0x10000));
										i_2989_ = (i_2987_ - i_2989_ | i_2989_ - (i_2989_ >>> 8));
										if (i_2985_ == 0 && anInt9015 != 255) {
											i_2985_ = i_2989_;
											i_2989_ = is[i_2958_];
											i_2989_ = (((((i_2985_ & 0xff00ff) * anInt9015) + ((i_2989_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2985_ & 0xff00) * anInt9015) + ((i_2989_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_2958_] = i_2989_;
									} else if (i == 2) {
										int i_2990_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2957_]);
										if (i_2990_ != 0) {
											int i_2991_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2990_ & 0xff]);
											int i_2992_ = (((i_2991_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_2993_ = (((i_2991_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_2958_++] = (((i_2992_ | i_2993_) >>> 8) + anInt9022);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2882_ == 2) {
									if (i == 1) {
										int i_2994_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2957_]);
										if (i_2994_ != 0) {
											int i_2995_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2994_ & 0xff]);
											int i_2996_ = is[i_2958_];
											int i_2997_ = i_2995_ + i_2996_;
											int i_2998_ = ((i_2995_ & 0xff00ff) + (i_2996_ & 0xff00ff));
											i_2996_ = ((i_2998_ & 0x1000100) + (i_2997_ - i_2998_ & 0x10000));
											is[i_2958_] = (i_2997_ - i_2996_ | i_2996_ - (i_2996_ >>> 8));
										}
									} else if (i == 0) {
										int i_2999_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2957_]);
										if (i_2999_ != 0) {
											int i_3000_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_2999_ & 0xff]);
											int i_3001_ = (((i_3000_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_3002_ = (((i_3000_ & 0xff00) * anInt9018) & 0xff0000);
											int i_3003_ = ((i_3000_ & 0xff) * anInt9019 & 0xff00);
											i_3000_ = (i_3001_ | i_3002_ | i_3003_) >>> 8;
											int i_3004_ = is[i_2958_];
											int i_3005_ = i_3000_ + i_3004_;
											int i_3006_ = ((i_3000_ & 0xff00ff) + (i_3004_ & 0xff00ff));
											i_3004_ = ((i_3006_ & 0x1000100) + (i_3005_ - i_3006_ & 0x10000));
											is[i_2958_] = (i_3005_ - i_3004_ | i_3004_ - (i_3004_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3007_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2957_]);
										int i_3008_ = (i_3007_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3007_]) : 0);
										int i_3009_ = anInt9014;
										int i_3010_ = i_3008_ + i_3009_;
										int i_3011_ = ((i_3008_ & 0xff00ff) + (i_3009_ & 0xff00ff));
										int i_3012_ = ((i_3011_ & 0x1000100) + (i_3010_ - i_3011_ & 0x10000));
										i_3012_ = (i_3010_ - i_3012_ | i_3012_ - (i_3012_ >>> 8));
										if (i_3008_ == 0 && anInt9015 != 255) {
											i_3008_ = i_3012_;
											i_3012_ = is[i_2958_];
											i_3012_ = (((((i_3008_ & 0xff00ff) * anInt9015) + ((i_3012_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3008_ & 0xff00) * anInt9015) + ((i_3012_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_2958_] = i_3012_;
									} else if (i == 2) {
										int i_3013_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_2957_]);
										if (i_3013_ != 0) {
											int i_3014_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3013_ & 0xff]);
											int i_3015_ = (((i_3014_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_3016_ = (((i_3014_ & 0xff00) * anInt9015) & 0xff0000);
											i_3014_ = ((i_3015_ | i_3016_) >>> 8) + anInt9022;
											int i_3017_ = is[i_2958_];
											int i_3018_ = i_3014_ + i_3017_;
											int i_3019_ = ((i_3014_ & 0xff00ff) + (i_3017_ & 0xff00ff));
											i_3017_ = ((i_3019_ & 0x1000100) + (i_3018_ - i_3019_ & 0x10000));
											is[i_2958_] = (i_3018_ - i_3017_ | i_3017_ - (i_3017_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2954_ += anInt8991;
							}
						}
						i_2951_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_3020_ = anInt9001;
					while (i_3020_ < 0) {
						int i_3021_ = anInt9003;
						int i_3022_ = anInt8988;
						int i_3023_ = anInt9011 + anInt9013;
						int i_3024_ = anInt8999;
						if (i_3022_ >= 0 && i_3022_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) < 0) {
							if (i_3023_ < 0) {
								int i_3025_ = (anInt8991 - 1 - i_3023_) / anInt8991;
								i_3024_ += i_3025_;
								i_3023_ += anInt8991 * i_3025_;
								i_3021_ += i_3025_;
							}
							int i_3026_;
							if ((i_3026_ = (1 + i_3023_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3024_)
								i_3024_ = i_3026_;
							for (/**/; i_3024_ < 0; i_3024_++) {
								int i_3027_ = (((i_3023_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_3022_ >> 12));
								int i_3028_ = i_3021_++;
								if (i_2882_ == 0) {
									if (i == 1)
										is[i_3028_] = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_3027_]) & 0xff)]);
									else if (i == 0) {
										int i_3029_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_3027_]) & 0xff)]);
										int i_3030_ = ((i_3029_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3031_ = ((i_3029_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3032_ = ((i_3029_ & 0xff) * anInt9019 & 0xff00);
										is[i_3028_] = (i_3030_ | i_3031_ | i_3032_) >>> 8;
									} else if (i == 3) {
										int i_3033_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_3027_]) & 0xff)]);
										int i_3034_ = anInt9014;
										int i_3035_ = i_3033_ + i_3034_;
										int i_3036_ = ((i_3033_ & 0xff00ff) + (i_3034_ & 0xff00ff));
										int i_3037_ = ((i_3036_ & 0x1000100) + (i_3035_ - i_3036_ & 0x10000));
										is[i_3028_] = (i_3035_ - i_3037_ | i_3037_ - (i_3037_ >>> 8));
									} else if (i == 2) {
										int i_3038_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_3027_]) & 0xff)]);
										int i_3039_ = ((i_3038_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_3040_ = ((i_3038_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_3028_] = ((i_3039_ | i_3040_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_2882_ == 1) {
									if (i == 1) {
										int i_3041_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3027_]);
										if (i_3041_ != 0)
											is[i_3028_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3041_ & 0xff]);
									} else if (i == 0) {
										int i_3042_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3027_]);
										if (i_3042_ != 0) {
											int i_3043_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3042_ & 0xff]);
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_3044_ = anInt9014 >>> 24;
												int i_3045_ = 256 - i_3044_;
												int i_3046_ = is[i_3028_];
												is[i_3028_] = (((((i_3043_ & 0xff00ff) * i_3044_) + ((i_3046_ & 0xff00ff) * i_3045_)) & ~0xff00ff) + ((((i_3043_ & 0xff00) * i_3044_) + ((i_3046_ & 0xff00) * i_3045_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_3047_ = (((i_3043_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_3048_ = (((i_3043_ & 0xff00) * anInt9018) & 0xff0000);
												int i_3049_ = (((i_3043_ & 0xff) * anInt9019) & 0xff00);
												i_3043_ = (i_3047_ | i_3048_ | i_3049_) >>> 8;
												int i_3050_ = is[i_3028_];
												is[i_3028_] = (((((i_3043_ & 0xff00ff) * anInt9015) + ((i_3050_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3043_ & 0xff00) * anInt9015) + ((i_3050_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_3051_ = (((i_3043_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_3052_ = (((i_3043_ & 0xff00) * anInt9018) & 0xff0000);
												int i_3053_ = (((i_3043_ & 0xff) * anInt9019) & 0xff00);
												is[i_3028_] = (i_3051_ | i_3052_ | i_3053_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3054_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3027_]);
										int i_3055_ = (i_3054_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3054_]) : 0);
										int i_3056_ = anInt9014;
										int i_3057_ = i_3055_ + i_3056_;
										int i_3058_ = ((i_3055_ & 0xff00ff) + (i_3056_ & 0xff00ff));
										int i_3059_ = ((i_3058_ & 0x1000100) + (i_3057_ - i_3058_ & 0x10000));
										i_3059_ = (i_3057_ - i_3059_ | i_3059_ - (i_3059_ >>> 8));
										if (i_3055_ == 0 && anInt9015 != 255) {
											i_3055_ = i_3059_;
											i_3059_ = is[i_3028_];
											i_3059_ = (((((i_3055_ & 0xff00ff) * anInt9015) + ((i_3059_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3055_ & 0xff00) * anInt9015) + ((i_3059_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_3028_] = i_3059_;
									} else if (i == 2) {
										int i_3060_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3027_]);
										if (i_3060_ != 0) {
											int i_3061_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3060_ & 0xff]);
											int i_3062_ = (((i_3061_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_3063_ = (((i_3061_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_3028_++] = (((i_3062_ | i_3063_) >>> 8) + anInt9022);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2882_ == 2) {
									if (i == 1) {
										int i_3064_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3027_]);
										if (i_3064_ != 0) {
											int i_3065_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3064_ & 0xff]);
											int i_3066_ = is[i_3028_];
											int i_3067_ = i_3065_ + i_3066_;
											int i_3068_ = ((i_3065_ & 0xff00ff) + (i_3066_ & 0xff00ff));
											i_3066_ = ((i_3068_ & 0x1000100) + (i_3067_ - i_3068_ & 0x10000));
											is[i_3028_] = (i_3067_ - i_3066_ | i_3066_ - (i_3066_ >>> 8));
										}
									} else if (i == 0) {
										int i_3069_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3027_]);
										if (i_3069_ != 0) {
											int i_3070_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3069_ & 0xff]);
											int i_3071_ = (((i_3070_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_3072_ = (((i_3070_ & 0xff00) * anInt9018) & 0xff0000);
											int i_3073_ = ((i_3070_ & 0xff) * anInt9019 & 0xff00);
											i_3070_ = (i_3071_ | i_3072_ | i_3073_) >>> 8;
											int i_3074_ = is[i_3028_];
											int i_3075_ = i_3070_ + i_3074_;
											int i_3076_ = ((i_3070_ & 0xff00ff) + (i_3074_ & 0xff00ff));
											i_3074_ = ((i_3076_ & 0x1000100) + (i_3075_ - i_3076_ & 0x10000));
											is[i_3028_] = (i_3075_ - i_3074_ | i_3074_ - (i_3074_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3077_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3027_]);
										int i_3078_ = (i_3077_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3077_]) : 0);
										int i_3079_ = anInt9014;
										int i_3080_ = i_3078_ + i_3079_;
										int i_3081_ = ((i_3078_ & 0xff00ff) + (i_3079_ & 0xff00ff));
										int i_3082_ = ((i_3081_ & 0x1000100) + (i_3080_ - i_3081_ & 0x10000));
										i_3082_ = (i_3080_ - i_3082_ | i_3082_ - (i_3082_ >>> 8));
										if (i_3078_ == 0 && anInt9015 != 255) {
											i_3078_ = i_3082_;
											i_3082_ = is[i_3028_];
											i_3082_ = (((((i_3078_ & 0xff00ff) * anInt9015) + ((i_3082_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3078_ & 0xff00) * anInt9015) + ((i_3082_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_3028_] = i_3082_;
									} else if (i == 2) {
										int i_3083_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3027_]);
										if (i_3083_ != 0) {
											int i_3084_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3083_ & 0xff]);
											int i_3085_ = (((i_3084_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_3086_ = (((i_3084_ & 0xff00) * anInt9015) & 0xff0000);
											i_3084_ = ((i_3085_ | i_3086_) >>> 8) + anInt9022;
											int i_3087_ = is[i_3028_];
											int i_3088_ = i_3084_ + i_3087_;
											int i_3089_ = ((i_3084_ & 0xff00ff) + (i_3087_ & 0xff00ff));
											i_3087_ = ((i_3089_ & 0x1000100) + (i_3088_ - i_3089_ & 0x10000));
											is[i_3028_] = (i_3088_ - i_3087_ | i_3087_ - (i_3087_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_3023_ += anInt8991;
							}
						}
						i_3020_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_3090_ = anInt9001;
					while (i_3090_ < 0) {
						int i_3091_ = anInt9003;
						int i_3092_ = anInt8988 + anInt9012;
						int i_3093_ = anInt9011;
						int i_3094_ = anInt8999;
						if (i_3093_ >= 0 && i_3093_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) < 0) {
							int i_3095_;
							if ((i_3095_ = (i_3092_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12))) >= 0) {
								i_3095_ = (anInt9004 - i_3095_) / anInt9004;
								i_3094_ += i_3095_;
								i_3092_ += anInt9004 * i_3095_;
								i_3091_ += i_3095_;
							}
							if ((i_3095_ = (i_3092_ - anInt9004) / anInt9004) > i_3094_)
								i_3094_ = i_3095_;
							for (/**/; i_3094_ < 0; i_3094_++) {
								int i_3096_ = (((i_3093_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_3092_ >> 12));
								int i_3097_ = i_3091_++;
								if (i_2882_ == 0) {
									if (i == 1)
										is[i_3097_] = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_3096_]) & 0xff)]);
									else if (i == 0) {
										int i_3098_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_3096_]) & 0xff)]);
										int i_3099_ = ((i_3098_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3100_ = ((i_3098_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3101_ = ((i_3098_ & 0xff) * anInt9019 & 0xff00);
										is[i_3097_] = (i_3099_ | i_3100_ | i_3101_) >>> 8;
									} else if (i == 3) {
										int i_3102_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_3096_]) & 0xff)]);
										int i_3103_ = anInt9014;
										int i_3104_ = i_3102_ + i_3103_;
										int i_3105_ = ((i_3102_ & 0xff00ff) + (i_3103_ & 0xff00ff));
										int i_3106_ = ((i_3105_ & 0x1000100) + (i_3104_ - i_3105_ & 0x10000));
										is[i_3097_] = (i_3104_ - i_3106_ | i_3106_ - (i_3106_ >>> 8));
									} else if (i == 2) {
										int i_3107_ = (((Class57_Sub1_Sub3) this).anIntArray9968[((((Class57_Sub1_Sub3) this).aByteArray9967[i_3096_]) & 0xff)]);
										int i_3108_ = ((i_3107_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_3109_ = ((i_3107_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_3097_] = ((i_3108_ | i_3109_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_2882_ == 1) {
									if (i == 1) {
										int i_3110_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3096_]);
										if (i_3110_ != 0)
											is[i_3097_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3110_ & 0xff]);
									} else if (i == 0) {
										int i_3111_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3096_]);
										if (i_3111_ != 0) {
											int i_3112_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3111_ & 0xff]);
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_3113_ = anInt9014 >>> 24;
												int i_3114_ = 256 - i_3113_;
												int i_3115_ = is[i_3097_];
												is[i_3097_] = (((((i_3112_ & 0xff00ff) * i_3113_) + ((i_3115_ & 0xff00ff) * i_3114_)) & ~0xff00ff) + ((((i_3112_ & 0xff00) * i_3113_) + ((i_3115_ & 0xff00) * i_3114_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_3116_ = (((i_3112_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_3117_ = (((i_3112_ & 0xff00) * anInt9018) & 0xff0000);
												int i_3118_ = (((i_3112_ & 0xff) * anInt9019) & 0xff00);
												i_3112_ = (i_3116_ | i_3117_ | i_3118_) >>> 8;
												int i_3119_ = is[i_3097_];
												is[i_3097_] = (((((i_3112_ & 0xff00ff) * anInt9015) + ((i_3119_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3112_ & 0xff00) * anInt9015) + ((i_3119_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_3120_ = (((i_3112_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_3121_ = (((i_3112_ & 0xff00) * anInt9018) & 0xff0000);
												int i_3122_ = (((i_3112_ & 0xff) * anInt9019) & 0xff00);
												is[i_3097_] = (i_3120_ | i_3121_ | i_3122_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3123_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3096_]);
										int i_3124_ = (i_3123_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3123_]) : 0);
										int i_3125_ = anInt9014;
										int i_3126_ = i_3124_ + i_3125_;
										int i_3127_ = ((i_3124_ & 0xff00ff) + (i_3125_ & 0xff00ff));
										int i_3128_ = ((i_3127_ & 0x1000100) + (i_3126_ - i_3127_ & 0x10000));
										i_3128_ = (i_3126_ - i_3128_ | i_3128_ - (i_3128_ >>> 8));
										if (i_3124_ == 0 && anInt9015 != 255) {
											i_3124_ = i_3128_;
											i_3128_ = is[i_3097_];
											i_3128_ = (((((i_3124_ & 0xff00ff) * anInt9015) + ((i_3128_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3124_ & 0xff00) * anInt9015) + ((i_3128_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_3097_] = i_3128_;
									} else if (i == 2) {
										int i_3129_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3096_]);
										if (i_3129_ != 0) {
											int i_3130_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3129_ & 0xff]);
											int i_3131_ = (((i_3130_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_3132_ = (((i_3130_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_3097_++] = (((i_3131_ | i_3132_) >>> 8) + anInt9022);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2882_ == 2) {
									if (i == 1) {
										int i_3133_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3096_]);
										if (i_3133_ != 0) {
											int i_3134_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3133_ & 0xff]);
											int i_3135_ = is[i_3097_];
											int i_3136_ = i_3134_ + i_3135_;
											int i_3137_ = ((i_3134_ & 0xff00ff) + (i_3135_ & 0xff00ff));
											i_3135_ = ((i_3137_ & 0x1000100) + (i_3136_ - i_3137_ & 0x10000));
											is[i_3097_] = (i_3136_ - i_3135_ | i_3135_ - (i_3135_ >>> 8));
										}
									} else if (i == 0) {
										int i_3138_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3096_]);
										if (i_3138_ != 0) {
											int i_3139_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3138_ & 0xff]);
											int i_3140_ = (((i_3139_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_3141_ = (((i_3139_ & 0xff00) * anInt9018) & 0xff0000);
											int i_3142_ = ((i_3139_ & 0xff) * anInt9019 & 0xff00);
											i_3139_ = (i_3140_ | i_3141_ | i_3142_) >>> 8;
											int i_3143_ = is[i_3097_];
											int i_3144_ = i_3139_ + i_3143_;
											int i_3145_ = ((i_3139_ & 0xff00ff) + (i_3143_ & 0xff00ff));
											i_3143_ = ((i_3145_ & 0x1000100) + (i_3144_ - i_3145_ & 0x10000));
											is[i_3097_] = (i_3144_ - i_3143_ | i_3143_ - (i_3143_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3146_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3096_]);
										int i_3147_ = (i_3146_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3146_]) : 0);
										int i_3148_ = anInt9014;
										int i_3149_ = i_3147_ + i_3148_;
										int i_3150_ = ((i_3147_ & 0xff00ff) + (i_3148_ & 0xff00ff));
										int i_3151_ = ((i_3150_ & 0x1000100) + (i_3149_ - i_3150_ & 0x10000));
										i_3151_ = (i_3149_ - i_3151_ | i_3151_ - (i_3151_ >>> 8));
										if (i_3147_ == 0 && anInt9015 != 255) {
											i_3147_ = i_3151_;
											i_3151_ = is[i_3097_];
											i_3151_ = (((((i_3147_ & 0xff00ff) * anInt9015) + ((i_3151_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3147_ & 0xff00) * anInt9015) + ((i_3151_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_3097_] = i_3151_;
									} else if (i == 2) {
										int i_3152_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3096_]);
										if (i_3152_ != 0) {
											int i_3153_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3152_ & 0xff]);
											int i_3154_ = (((i_3153_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_3155_ = (((i_3153_ & 0xff00) * anInt9015) & 0xff0000);
											i_3153_ = ((i_3154_ | i_3155_) >>> 8) + anInt9022;
											int i_3156_ = is[i_3097_];
											int i_3157_ = i_3153_ + i_3156_;
											int i_3158_ = ((i_3153_ & 0xff00ff) + (i_3156_ & 0xff00ff));
											i_3156_ = ((i_3158_ & 0x1000100) + (i_3157_ - i_3158_ & 0x10000));
											is[i_3097_] = (i_3157_ - i_3156_ | i_3156_ - (i_3156_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_3092_ += anInt9004;
							}
						}
						i_3090_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_3159_ = anInt9001;
					while (i_3159_ < 0) {
						int i_3160_ = anInt9003;
						int i_3161_ = anInt8988 + anInt9012;
						int i_3162_ = anInt9011 + anInt9013;
						int i_3163_ = anInt8999;
						int i_3164_;
						if ((i_3164_ = i_3161_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) >= 0) {
							i_3164_ = (anInt9004 - i_3164_) / anInt9004;
							i_3163_ += i_3164_;
							i_3161_ += anInt9004 * i_3164_;
							i_3162_ += anInt8991 * i_3164_;
							i_3160_ += i_3164_;
						}
						if ((i_3164_ = (i_3161_ - anInt9004) / anInt9004) > i_3163_)
							i_3163_ = i_3164_;
						if ((i_3164_ = i_3162_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) >= 0) {
							i_3164_ = (anInt8991 - i_3164_) / anInt8991;
							i_3163_ += i_3164_;
							i_3161_ += anInt9004 * i_3164_;
							i_3162_ += anInt8991 * i_3164_;
							i_3160_ += i_3164_;
						}
						if ((i_3164_ = (i_3162_ - anInt8991) / anInt8991) > i_3163_)
							i_3163_ = i_3164_;
						for (/**/; i_3163_ < 0; i_3163_++) {
							int i_3165_ = (((i_3162_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_3161_ >> 12));
							int i_3166_ = i_3160_++;
							if (i_2882_ == 0) {
								if (i == 1)
									is[i_3166_] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3165_]) & 0xff]);
								else if (i == 0) {
									int i_3167_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3165_]) & 0xff]);
									int i_3168_ = ((i_3167_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3169_ = ((i_3167_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3170_ = ((i_3167_ & 0xff) * anInt9019 & 0xff00);
									is[i_3166_] = (i_3168_ | i_3169_ | i_3170_) >>> 8;
								} else if (i == 3) {
									int i_3171_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3165_]) & 0xff]);
									int i_3172_ = anInt9014;
									int i_3173_ = i_3171_ + i_3172_;
									int i_3174_ = ((i_3171_ & 0xff00ff) + (i_3172_ & 0xff00ff));
									int i_3175_ = ((i_3174_ & 0x1000100) + (i_3173_ - i_3174_ & 0x10000));
									is[i_3166_] = (i_3173_ - i_3175_ | i_3175_ - (i_3175_ >>> 8));
								} else if (i == 2) {
									int i_3176_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3165_]) & 0xff]);
									int i_3177_ = ((i_3176_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3178_ = ((i_3176_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_3166_] = (((i_3177_ | i_3178_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_2882_ == 1) {
								if (i == 1) {
									int i_3179_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3165_]);
									if (i_3179_ != 0)
										is[i_3166_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3179_ & 0xff]);
								} else if (i == 0) {
									int i_3180_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3165_]);
									if (i_3180_ != 0) {
										int i_3181_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3180_ & 0xff]);
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_3182_ = anInt9014 >>> 24;
											int i_3183_ = 256 - i_3182_;
											int i_3184_ = is[i_3166_];
											is[i_3166_] = (((((i_3181_ & 0xff00ff) * i_3182_) + ((i_3184_ & 0xff00ff) * i_3183_)) & ~0xff00ff) + ((((i_3181_ & 0xff00) * i_3182_) + ((i_3184_ & 0xff00) * i_3183_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_3185_ = (((i_3181_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_3186_ = (((i_3181_ & 0xff00) * anInt9018) & 0xff0000);
											int i_3187_ = ((i_3181_ & 0xff) * anInt9019 & 0xff00);
											i_3181_ = (i_3185_ | i_3186_ | i_3187_) >>> 8;
											int i_3188_ = is[i_3166_];
											is[i_3166_] = (((((i_3181_ & 0xff00ff) * anInt9015) + ((i_3188_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3181_ & 0xff00) * anInt9015) + ((i_3188_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_3189_ = (((i_3181_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_3190_ = (((i_3181_ & 0xff00) * anInt9018) & 0xff0000);
											int i_3191_ = ((i_3181_ & 0xff) * anInt9019 & 0xff00);
											is[i_3166_] = (i_3189_ | i_3190_ | i_3191_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3192_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3165_]);
									int i_3193_ = (i_3192_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3192_]) : 0);
									int i_3194_ = anInt9014;
									int i_3195_ = i_3193_ + i_3194_;
									int i_3196_ = ((i_3193_ & 0xff00ff) + (i_3194_ & 0xff00ff));
									int i_3197_ = ((i_3196_ & 0x1000100) + (i_3195_ - i_3196_ & 0x10000));
									i_3197_ = (i_3195_ - i_3197_ | i_3197_ - (i_3197_ >>> 8));
									if (i_3193_ == 0 && anInt9015 != 255) {
										i_3193_ = i_3197_;
										i_3197_ = is[i_3166_];
										i_3197_ = (((((i_3193_ & 0xff00ff) * anInt9015) + ((i_3197_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3193_ & 0xff00) * anInt9015) + ((i_3197_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_3166_] = i_3197_;
								} else if (i == 2) {
									int i_3198_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3165_]);
									if (i_3198_ != 0) {
										int i_3199_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3198_ & 0xff]);
										int i_3200_ = ((i_3199_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_3201_ = ((i_3199_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_3166_++] = ((i_3200_ | i_3201_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2882_ == 2) {
								if (i == 1) {
									int i_3202_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3165_]);
									if (i_3202_ != 0) {
										int i_3203_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3202_ & 0xff]);
										int i_3204_ = is[i_3166_];
										int i_3205_ = i_3203_ + i_3204_;
										int i_3206_ = ((i_3203_ & 0xff00ff) + (i_3204_ & 0xff00ff));
										i_3204_ = ((i_3206_ & 0x1000100) + (i_3205_ - i_3206_ & 0x10000));
										is[i_3166_] = (i_3205_ - i_3204_ | i_3204_ - (i_3204_ >>> 8));
									}
								} else if (i == 0) {
									int i_3207_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3165_]);
									if (i_3207_ != 0) {
										int i_3208_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3207_ & 0xff]);
										int i_3209_ = ((i_3208_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3210_ = ((i_3208_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3211_ = ((i_3208_ & 0xff) * anInt9019 & 0xff00);
										i_3208_ = (i_3209_ | i_3210_ | i_3211_) >>> 8;
										int i_3212_ = is[i_3166_];
										int i_3213_ = i_3208_ + i_3212_;
										int i_3214_ = ((i_3208_ & 0xff00ff) + (i_3212_ & 0xff00ff));
										i_3212_ = ((i_3214_ & 0x1000100) + (i_3213_ - i_3214_ & 0x10000));
										is[i_3166_] = (i_3213_ - i_3212_ | i_3212_ - (i_3212_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3215_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3165_]);
									int i_3216_ = (i_3215_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3215_]) : 0);
									int i_3217_ = anInt9014;
									int i_3218_ = i_3216_ + i_3217_;
									int i_3219_ = ((i_3216_ & 0xff00ff) + (i_3217_ & 0xff00ff));
									int i_3220_ = ((i_3219_ & 0x1000100) + (i_3218_ - i_3219_ & 0x10000));
									i_3220_ = (i_3218_ - i_3220_ | i_3220_ - (i_3220_ >>> 8));
									if (i_3216_ == 0 && anInt9015 != 255) {
										i_3216_ = i_3220_;
										i_3220_ = is[i_3166_];
										i_3220_ = (((((i_3216_ & 0xff00ff) * anInt9015) + ((i_3220_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3216_ & 0xff00) * anInt9015) + ((i_3220_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_3166_] = i_3220_;
								} else if (i == 2) {
									int i_3221_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3165_]);
									if (i_3221_ != 0) {
										int i_3222_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3221_ & 0xff]);
										int i_3223_ = ((i_3222_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_3224_ = ((i_3222_ & 0xff00) * anInt9015 & 0xff0000);
										i_3222_ = (((i_3223_ | i_3224_) >>> 8) + anInt9022);
										int i_3225_ = is[i_3166_];
										int i_3226_ = i_3222_ + i_3225_;
										int i_3227_ = ((i_3222_ & 0xff00ff) + (i_3225_ & 0xff00ff));
										i_3225_ = ((i_3227_ & 0x1000100) + (i_3226_ - i_3227_ & 0x10000));
										is[i_3166_] = (i_3226_ - i_3225_ | i_3225_ - (i_3225_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3161_ += anInt9004;
							i_3162_ += anInt8991;
						}
						i_3159_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_3228_ = anInt9001;
					while (i_3228_ < 0) {
						int i_3229_ = anInt9003;
						int i_3230_ = anInt8988 + anInt9012;
						int i_3231_ = anInt9011 + anInt9013;
						int i_3232_ = anInt8999;
						int i_3233_;
						if ((i_3233_ = i_3230_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) >= 0) {
							i_3233_ = (anInt9004 - i_3233_) / anInt9004;
							i_3232_ += i_3233_;
							i_3230_ += anInt9004 * i_3233_;
							i_3231_ += anInt8991 * i_3233_;
							i_3229_ += i_3233_;
						}
						if ((i_3233_ = (i_3230_ - anInt9004) / anInt9004) > i_3232_)
							i_3232_ = i_3233_;
						if (i_3231_ < 0) {
							i_3233_ = (anInt8991 - 1 - i_3231_) / anInt8991;
							i_3232_ += i_3233_;
							i_3230_ += anInt9004 * i_3233_;
							i_3231_ += anInt8991 * i_3233_;
							i_3229_ += i_3233_;
						}
						if ((i_3233_ = (1 + i_3231_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3232_)
							i_3232_ = i_3233_;
						for (/**/; i_3232_ < 0; i_3232_++) {
							int i_3234_ = (((i_3231_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_3230_ >> 12));
							int i_3235_ = i_3229_++;
							if (i_2882_ == 0) {
								if (i == 1)
									is[i_3235_] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3234_]) & 0xff]);
								else if (i == 0) {
									int i_3236_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3234_]) & 0xff]);
									int i_3237_ = ((i_3236_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3238_ = ((i_3236_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3239_ = ((i_3236_ & 0xff) * anInt9019 & 0xff00);
									is[i_3235_] = (i_3237_ | i_3238_ | i_3239_) >>> 8;
								} else if (i == 3) {
									int i_3240_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3234_]) & 0xff]);
									int i_3241_ = anInt9014;
									int i_3242_ = i_3240_ + i_3241_;
									int i_3243_ = ((i_3240_ & 0xff00ff) + (i_3241_ & 0xff00ff));
									int i_3244_ = ((i_3243_ & 0x1000100) + (i_3242_ - i_3243_ & 0x10000));
									is[i_3235_] = (i_3242_ - i_3244_ | i_3244_ - (i_3244_ >>> 8));
								} else if (i == 2) {
									int i_3245_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3234_]) & 0xff]);
									int i_3246_ = ((i_3245_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3247_ = ((i_3245_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_3235_] = (((i_3246_ | i_3247_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_2882_ == 1) {
								if (i == 1) {
									int i_3248_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3234_]);
									if (i_3248_ != 0)
										is[i_3235_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3248_ & 0xff]);
								} else if (i == 0) {
									int i_3249_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3234_]);
									if (i_3249_ != 0) {
										int i_3250_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3249_ & 0xff]);
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_3251_ = anInt9014 >>> 24;
											int i_3252_ = 256 - i_3251_;
											int i_3253_ = is[i_3235_];
											is[i_3235_] = (((((i_3250_ & 0xff00ff) * i_3251_) + ((i_3253_ & 0xff00ff) * i_3252_)) & ~0xff00ff) + ((((i_3250_ & 0xff00) * i_3251_) + ((i_3253_ & 0xff00) * i_3252_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_3254_ = (((i_3250_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_3255_ = (((i_3250_ & 0xff00) * anInt9018) & 0xff0000);
											int i_3256_ = ((i_3250_ & 0xff) * anInt9019 & 0xff00);
											i_3250_ = (i_3254_ | i_3255_ | i_3256_) >>> 8;
											int i_3257_ = is[i_3235_];
											is[i_3235_] = (((((i_3250_ & 0xff00ff) * anInt9015) + ((i_3257_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3250_ & 0xff00) * anInt9015) + ((i_3257_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_3258_ = (((i_3250_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_3259_ = (((i_3250_ & 0xff00) * anInt9018) & 0xff0000);
											int i_3260_ = ((i_3250_ & 0xff) * anInt9019 & 0xff00);
											is[i_3235_] = (i_3258_ | i_3259_ | i_3260_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3261_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3234_]);
									int i_3262_ = (i_3261_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3261_]) : 0);
									int i_3263_ = anInt9014;
									int i_3264_ = i_3262_ + i_3263_;
									int i_3265_ = ((i_3262_ & 0xff00ff) + (i_3263_ & 0xff00ff));
									int i_3266_ = ((i_3265_ & 0x1000100) + (i_3264_ - i_3265_ & 0x10000));
									i_3266_ = (i_3264_ - i_3266_ | i_3266_ - (i_3266_ >>> 8));
									if (i_3262_ == 0 && anInt9015 != 255) {
										i_3262_ = i_3266_;
										i_3266_ = is[i_3235_];
										i_3266_ = (((((i_3262_ & 0xff00ff) * anInt9015) + ((i_3266_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3262_ & 0xff00) * anInt9015) + ((i_3266_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_3235_] = i_3266_;
								} else if (i == 2) {
									int i_3267_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3234_]);
									if (i_3267_ != 0) {
										int i_3268_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3267_ & 0xff]);
										int i_3269_ = ((i_3268_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_3270_ = ((i_3268_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_3235_++] = ((i_3269_ | i_3270_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2882_ == 2) {
								if (i == 1) {
									int i_3271_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3234_]);
									if (i_3271_ != 0) {
										int i_3272_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3271_ & 0xff]);
										int i_3273_ = is[i_3235_];
										int i_3274_ = i_3272_ + i_3273_;
										int i_3275_ = ((i_3272_ & 0xff00ff) + (i_3273_ & 0xff00ff));
										i_3273_ = ((i_3275_ & 0x1000100) + (i_3274_ - i_3275_ & 0x10000));
										is[i_3235_] = (i_3274_ - i_3273_ | i_3273_ - (i_3273_ >>> 8));
									}
								} else if (i == 0) {
									int i_3276_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3234_]);
									if (i_3276_ != 0) {
										int i_3277_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3276_ & 0xff]);
										int i_3278_ = ((i_3277_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3279_ = ((i_3277_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3280_ = ((i_3277_ & 0xff) * anInt9019 & 0xff00);
										i_3277_ = (i_3278_ | i_3279_ | i_3280_) >>> 8;
										int i_3281_ = is[i_3235_];
										int i_3282_ = i_3277_ + i_3281_;
										int i_3283_ = ((i_3277_ & 0xff00ff) + (i_3281_ & 0xff00ff));
										i_3281_ = ((i_3283_ & 0x1000100) + (i_3282_ - i_3283_ & 0x10000));
										is[i_3235_] = (i_3282_ - i_3281_ | i_3281_ - (i_3281_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3284_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3234_]);
									int i_3285_ = (i_3284_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3284_]) : 0);
									int i_3286_ = anInt9014;
									int i_3287_ = i_3285_ + i_3286_;
									int i_3288_ = ((i_3285_ & 0xff00ff) + (i_3286_ & 0xff00ff));
									int i_3289_ = ((i_3288_ & 0x1000100) + (i_3287_ - i_3288_ & 0x10000));
									i_3289_ = (i_3287_ - i_3289_ | i_3289_ - (i_3289_ >>> 8));
									if (i_3285_ == 0 && anInt9015 != 255) {
										i_3285_ = i_3289_;
										i_3289_ = is[i_3235_];
										i_3289_ = (((((i_3285_ & 0xff00ff) * anInt9015) + ((i_3289_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3285_ & 0xff00) * anInt9015) + ((i_3289_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_3235_] = i_3289_;
								} else if (i == 2) {
									int i_3290_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3234_]);
									if (i_3290_ != 0) {
										int i_3291_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3290_ & 0xff]);
										int i_3292_ = ((i_3291_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_3293_ = ((i_3291_ & 0xff00) * anInt9015 & 0xff0000);
										i_3291_ = (((i_3292_ | i_3293_) >>> 8) + anInt9022);
										int i_3294_ = is[i_3235_];
										int i_3295_ = i_3291_ + i_3294_;
										int i_3296_ = ((i_3291_ & 0xff00ff) + (i_3294_ & 0xff00ff));
										i_3294_ = ((i_3296_ & 0x1000100) + (i_3295_ - i_3296_ & 0x10000));
										is[i_3235_] = (i_3295_ - i_3294_ | i_3294_ - (i_3294_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3230_ += anInt9004;
							i_3231_ += anInt8991;
						}
						i_3228_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_3297_ = anInt9001;
				while (i_3297_ < 0) {
					int i_3298_ = anInt9003;
					int i_3299_ = anInt8988 + anInt9012;
					int i_3300_ = anInt9011;
					int i_3301_ = anInt8999;
					if (i_3300_ >= 0 && i_3300_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) < 0) {
						if (i_3299_ < 0) {
							int i_3302_ = (anInt9004 - 1 - i_3299_) / anInt9004;
							i_3301_ += i_3302_;
							i_3299_ += anInt9004 * i_3302_;
							i_3298_ += i_3302_;
						}
						int i_3303_;
						if ((i_3303_ = (1 + i_3299_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3301_)
							i_3301_ = i_3303_;
						for (/**/; i_3301_ < 0; i_3301_++) {
							int i_3304_ = (((i_3300_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_3299_ >> 12));
							int i_3305_ = i_3298_++;
							if (i_2882_ == 0) {
								if (i == 1)
									is[i_3305_] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3304_]) & 0xff]);
								else if (i == 0) {
									int i_3306_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3304_]) & 0xff]);
									int i_3307_ = ((i_3306_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3308_ = ((i_3306_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3309_ = ((i_3306_ & 0xff) * anInt9019 & 0xff00);
									is[i_3305_] = (i_3307_ | i_3308_ | i_3309_) >>> 8;
								} else if (i == 3) {
									int i_3310_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3304_]) & 0xff]);
									int i_3311_ = anInt9014;
									int i_3312_ = i_3310_ + i_3311_;
									int i_3313_ = ((i_3310_ & 0xff00ff) + (i_3311_ & 0xff00ff));
									int i_3314_ = ((i_3313_ & 0x1000100) + (i_3312_ - i_3313_ & 0x10000));
									is[i_3305_] = (i_3312_ - i_3314_ | i_3314_ - (i_3314_ >>> 8));
								} else if (i == 2) {
									int i_3315_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3304_]) & 0xff]);
									int i_3316_ = ((i_3315_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3317_ = ((i_3315_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_3305_] = (((i_3316_ | i_3317_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_2882_ == 1) {
								if (i == 1) {
									int i_3318_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3304_]);
									if (i_3318_ != 0)
										is[i_3305_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3318_ & 0xff]);
								} else if (i == 0) {
									int i_3319_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3304_]);
									if (i_3319_ != 0) {
										int i_3320_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3319_ & 0xff]);
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_3321_ = anInt9014 >>> 24;
											int i_3322_ = 256 - i_3321_;
											int i_3323_ = is[i_3305_];
											is[i_3305_] = (((((i_3320_ & 0xff00ff) * i_3321_) + ((i_3323_ & 0xff00ff) * i_3322_)) & ~0xff00ff) + ((((i_3320_ & 0xff00) * i_3321_) + ((i_3323_ & 0xff00) * i_3322_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_3324_ = (((i_3320_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_3325_ = (((i_3320_ & 0xff00) * anInt9018) & 0xff0000);
											int i_3326_ = ((i_3320_ & 0xff) * anInt9019 & 0xff00);
											i_3320_ = (i_3324_ | i_3325_ | i_3326_) >>> 8;
											int i_3327_ = is[i_3305_];
											is[i_3305_] = (((((i_3320_ & 0xff00ff) * anInt9015) + ((i_3327_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3320_ & 0xff00) * anInt9015) + ((i_3327_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_3328_ = (((i_3320_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_3329_ = (((i_3320_ & 0xff00) * anInt9018) & 0xff0000);
											int i_3330_ = ((i_3320_ & 0xff) * anInt9019 & 0xff00);
											is[i_3305_] = (i_3328_ | i_3329_ | i_3330_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3331_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3304_]);
									int i_3332_ = (i_3331_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3331_]) : 0);
									int i_3333_ = anInt9014;
									int i_3334_ = i_3332_ + i_3333_;
									int i_3335_ = ((i_3332_ & 0xff00ff) + (i_3333_ & 0xff00ff));
									int i_3336_ = ((i_3335_ & 0x1000100) + (i_3334_ - i_3335_ & 0x10000));
									i_3336_ = (i_3334_ - i_3336_ | i_3336_ - (i_3336_ >>> 8));
									if (i_3332_ == 0 && anInt9015 != 255) {
										i_3332_ = i_3336_;
										i_3336_ = is[i_3305_];
										i_3336_ = (((((i_3332_ & 0xff00ff) * anInt9015) + ((i_3336_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3332_ & 0xff00) * anInt9015) + ((i_3336_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_3305_] = i_3336_;
								} else if (i == 2) {
									int i_3337_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3304_]);
									if (i_3337_ != 0) {
										int i_3338_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3337_ & 0xff]);
										int i_3339_ = ((i_3338_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_3340_ = ((i_3338_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_3305_++] = ((i_3339_ | i_3340_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2882_ == 2) {
								if (i == 1) {
									int i_3341_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3304_]);
									if (i_3341_ != 0) {
										int i_3342_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3341_ & 0xff]);
										int i_3343_ = is[i_3305_];
										int i_3344_ = i_3342_ + i_3343_;
										int i_3345_ = ((i_3342_ & 0xff00ff) + (i_3343_ & 0xff00ff));
										i_3343_ = ((i_3345_ & 0x1000100) + (i_3344_ - i_3345_ & 0x10000));
										is[i_3305_] = (i_3344_ - i_3343_ | i_3343_ - (i_3343_ >>> 8));
									}
								} else if (i == 0) {
									int i_3346_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3304_]);
									if (i_3346_ != 0) {
										int i_3347_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3346_ & 0xff]);
										int i_3348_ = ((i_3347_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3349_ = ((i_3347_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3350_ = ((i_3347_ & 0xff) * anInt9019 & 0xff00);
										i_3347_ = (i_3348_ | i_3349_ | i_3350_) >>> 8;
										int i_3351_ = is[i_3305_];
										int i_3352_ = i_3347_ + i_3351_;
										int i_3353_ = ((i_3347_ & 0xff00ff) + (i_3351_ & 0xff00ff));
										i_3351_ = ((i_3353_ & 0x1000100) + (i_3352_ - i_3353_ & 0x10000));
										is[i_3305_] = (i_3352_ - i_3351_ | i_3351_ - (i_3351_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3354_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3304_]);
									int i_3355_ = (i_3354_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3354_]) : 0);
									int i_3356_ = anInt9014;
									int i_3357_ = i_3355_ + i_3356_;
									int i_3358_ = ((i_3355_ & 0xff00ff) + (i_3356_ & 0xff00ff));
									int i_3359_ = ((i_3358_ & 0x1000100) + (i_3357_ - i_3358_ & 0x10000));
									i_3359_ = (i_3357_ - i_3359_ | i_3359_ - (i_3359_ >>> 8));
									if (i_3355_ == 0 && anInt9015 != 255) {
										i_3355_ = i_3359_;
										i_3359_ = is[i_3305_];
										i_3359_ = (((((i_3355_ & 0xff00ff) * anInt9015) + ((i_3359_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3355_ & 0xff00) * anInt9015) + ((i_3359_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_3305_] = i_3359_;
								} else if (i == 2) {
									int i_3360_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3304_]);
									if (i_3360_ != 0) {
										int i_3361_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3360_ & 0xff]);
										int i_3362_ = ((i_3361_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_3363_ = ((i_3361_ & 0xff00) * anInt9015 & 0xff0000);
										i_3361_ = (((i_3362_ | i_3363_) >>> 8) + anInt9022);
										int i_3364_ = is[i_3305_];
										int i_3365_ = i_3361_ + i_3364_;
										int i_3366_ = ((i_3361_ & 0xff00ff) + (i_3364_ & 0xff00ff));
										i_3364_ = ((i_3366_ & 0x1000100) + (i_3365_ - i_3366_ & 0x10000));
										is[i_3305_] = (i_3365_ - i_3364_ | i_3364_ - (i_3364_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3299_ += anInt9004;
						}
					}
					i_3297_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				for (int i_3367_ = anInt9001; i_3367_ < 0; i_3367_++) {
					int i_3368_ = anInt9003;
					int i_3369_ = anInt8988 + anInt9012;
					int i_3370_ = anInt9011 + anInt9013;
					int i_3371_ = anInt8999;
					if (i_3369_ < 0) {
						int i_3372_ = (anInt9004 - 1 - i_3369_) / anInt9004;
						i_3371_ += i_3372_;
						i_3369_ += anInt9004 * i_3372_;
						i_3370_ += anInt8991 * i_3372_;
						i_3368_ += i_3372_;
					}
					int i_3373_;
					if ((i_3373_ = (1 + i_3369_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3371_)
						i_3371_ = i_3373_;
					if ((i_3373_ = i_3370_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) >= 0) {
						i_3373_ = (anInt8991 - i_3373_) / anInt8991;
						i_3371_ += i_3373_;
						i_3369_ += anInt9004 * i_3373_;
						i_3370_ += anInt8991 * i_3373_;
						i_3368_ += i_3373_;
					}
					if ((i_3373_ = (i_3370_ - anInt8991) / anInt8991) > i_3371_)
						i_3371_ = i_3373_;
					for (/**/; i_3371_ < 0; i_3371_++) {
						int i_3374_ = (((i_3370_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_3369_ >> 12));
						int i_3375_ = i_3368_++;
						if (i_2882_ == 0) {
							if (i == 1)
								is[i_3375_] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3374_]) & 0xff]);
							else if (i == 0) {
								int i_3376_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3374_]) & 0xff]);
								int i_3377_ = ((i_3376_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_3378_ = ((i_3376_ & 0xff00) * anInt9018 & 0xff0000);
								int i_3379_ = (i_3376_ & 0xff) * anInt9019 & 0xff00;
								is[i_3375_] = (i_3377_ | i_3378_ | i_3379_) >>> 8;
							} else if (i == 3) {
								int i_3380_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3374_]) & 0xff]);
								int i_3381_ = anInt9014;
								int i_3382_ = i_3380_ + i_3381_;
								int i_3383_ = ((i_3380_ & 0xff00ff) + (i_3381_ & 0xff00ff));
								int i_3384_ = ((i_3383_ & 0x1000100) + (i_3382_ - i_3383_ & 0x10000));
								is[i_3375_] = i_3382_ - i_3384_ | i_3384_ - (i_3384_ >>> 8);
							} else if (i == 2) {
								int i_3385_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3374_]) & 0xff]);
								int i_3386_ = ((i_3385_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_3387_ = ((i_3385_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_3375_] = ((i_3386_ | i_3387_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_2882_ == 1) {
							if (i == 1) {
								int i_3388_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3374_]);
								if (i_3388_ != 0)
									is[i_3375_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3388_ & 0xff]);
							} else if (i == 0) {
								int i_3389_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3374_]);
								if (i_3389_ != 0) {
									int i_3390_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3389_ & 0xff]);
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_3391_ = anInt9014 >>> 24;
										int i_3392_ = 256 - i_3391_;
										int i_3393_ = is[i_3375_];
										is[i_3375_] = ((((i_3390_ & 0xff00ff) * i_3391_ + ((i_3393_ & 0xff00ff) * i_3392_)) & ~0xff00ff) + (((i_3390_ & 0xff00) * i_3391_ + ((i_3393_ & 0xff00) * i_3392_)) & 0xff0000)) >> 8;
									} else if (anInt9015 != 255) {
										int i_3394_ = ((i_3390_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3395_ = ((i_3390_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3396_ = ((i_3390_ & 0xff) * anInt9019 & 0xff00);
										i_3390_ = (i_3394_ | i_3395_ | i_3396_) >>> 8;
										int i_3397_ = is[i_3375_];
										is[i_3375_] = (((((i_3390_ & 0xff00ff) * anInt9015) + ((i_3397_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3390_ & 0xff00) * anInt9015) + ((i_3397_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									} else {
										int i_3398_ = ((i_3390_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3399_ = ((i_3390_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3400_ = ((i_3390_ & 0xff) * anInt9019 & 0xff00);
										is[i_3375_] = (i_3398_ | i_3399_ | i_3400_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_3401_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3374_]);
								int i_3402_ = (i_3401_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3401_]) : 0);
								int i_3403_ = anInt9014;
								int i_3404_ = i_3402_ + i_3403_;
								int i_3405_ = ((i_3402_ & 0xff00ff) + (i_3403_ & 0xff00ff));
								int i_3406_ = ((i_3405_ & 0x1000100) + (i_3404_ - i_3405_ & 0x10000));
								i_3406_ = i_3404_ - i_3406_ | i_3406_ - (i_3406_ >>> 8);
								if (i_3402_ == 0 && anInt9015 != 255) {
									i_3402_ = i_3406_;
									i_3406_ = is[i_3375_];
									i_3406_ = ((((i_3402_ & 0xff00ff) * anInt9015 + ((i_3406_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + (((i_3402_ & 0xff00) * anInt9015 + ((i_3406_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
								}
								is[i_3375_] = i_3406_;
							} else if (i == 2) {
								int i_3407_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3374_]);
								if (i_3407_ != 0) {
									int i_3408_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3407_ & 0xff]);
									int i_3409_ = ((i_3408_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3410_ = ((i_3408_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_3375_++] = ((i_3409_ | i_3410_) >>> 8) + anInt9022;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2882_ == 2) {
							if (i == 1) {
								int i_3411_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3374_]);
								if (i_3411_ != 0) {
									int i_3412_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3411_ & 0xff]);
									int i_3413_ = is[i_3375_];
									int i_3414_ = i_3412_ + i_3413_;
									int i_3415_ = ((i_3412_ & 0xff00ff) + (i_3413_ & 0xff00ff));
									i_3413_ = ((i_3415_ & 0x1000100) + (i_3414_ - i_3415_ & 0x10000));
									is[i_3375_] = (i_3414_ - i_3413_ | i_3413_ - (i_3413_ >>> 8));
								}
							} else if (i == 0) {
								int i_3416_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3374_]);
								if (i_3416_ != 0) {
									int i_3417_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3416_ & 0xff]);
									int i_3418_ = ((i_3417_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3419_ = ((i_3417_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3420_ = ((i_3417_ & 0xff) * anInt9019 & 0xff00);
									i_3417_ = (i_3418_ | i_3419_ | i_3420_) >>> 8;
									int i_3421_ = is[i_3375_];
									int i_3422_ = i_3417_ + i_3421_;
									int i_3423_ = ((i_3417_ & 0xff00ff) + (i_3421_ & 0xff00ff));
									i_3421_ = ((i_3423_ & 0x1000100) + (i_3422_ - i_3423_ & 0x10000));
									is[i_3375_] = (i_3422_ - i_3421_ | i_3421_ - (i_3421_ >>> 8));
								}
							} else if (i == 3) {
								byte i_3424_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3374_]);
								int i_3425_ = (i_3424_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3424_]) : 0);
								int i_3426_ = anInt9014;
								int i_3427_ = i_3425_ + i_3426_;
								int i_3428_ = ((i_3425_ & 0xff00ff) + (i_3426_ & 0xff00ff));
								int i_3429_ = ((i_3428_ & 0x1000100) + (i_3427_ - i_3428_ & 0x10000));
								i_3429_ = i_3427_ - i_3429_ | i_3429_ - (i_3429_ >>> 8);
								if (i_3425_ == 0 && anInt9015 != 255) {
									i_3425_ = i_3429_;
									i_3429_ = is[i_3375_];
									i_3429_ = ((((i_3425_ & 0xff00ff) * anInt9015 + ((i_3429_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + (((i_3425_ & 0xff00) * anInt9015 + ((i_3429_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
								}
								is[i_3375_] = i_3429_;
							} else if (i == 2) {
								int i_3430_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3374_]);
								if (i_3430_ != 0) {
									int i_3431_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3430_ & 0xff]);
									int i_3432_ = ((i_3431_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3433_ = ((i_3431_ & 0xff00) * anInt9015 & 0xff0000);
									i_3431_ = (((i_3432_ | i_3433_) >>> 8) + anInt9022);
									int i_3434_ = is[i_3375_];
									int i_3435_ = i_3431_ + i_3434_;
									int i_3436_ = ((i_3431_ & 0xff00ff) + (i_3434_ & 0xff00ff));
									i_3434_ = ((i_3436_ & 0x1000100) + (i_3435_ - i_3436_ & 0x10000));
									is[i_3375_] = (i_3435_ - i_3434_ | i_3434_ - (i_3434_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_3369_ += anInt9004;
						i_3370_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				for (int i_3437_ = anInt9001; i_3437_ < 0; i_3437_++) {
					int i_3438_ = anInt9003;
					int i_3439_ = anInt8988 + anInt9012;
					int i_3440_ = anInt9011 + anInt9013;
					int i_3441_ = anInt8999;
					if (i_3439_ < 0) {
						int i_3442_ = (anInt9004 - 1 - i_3439_) / anInt9004;
						i_3441_ += i_3442_;
						i_3439_ += anInt9004 * i_3442_;
						i_3440_ += anInt8991 * i_3442_;
						i_3438_ += i_3442_;
					}
					int i_3443_;
					if ((i_3443_ = (1 + i_3439_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3441_)
						i_3441_ = i_3443_;
					if (i_3440_ < 0) {
						i_3443_ = (anInt8991 - 1 - i_3440_) / anInt8991;
						i_3441_ += i_3443_;
						i_3439_ += anInt9004 * i_3443_;
						i_3440_ += anInt8991 * i_3443_;
						i_3438_ += i_3443_;
					}
					if ((i_3443_ = (1 + i_3440_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3441_)
						i_3441_ = i_3443_;
					for (/**/; i_3441_ < 0; i_3441_++) {
						int i_3444_ = (((i_3440_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_3439_ >> 12));
						int i_3445_ = i_3438_++;
						if (i_2882_ == 0) {
							if (i == 1)
								is[i_3445_] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3444_]) & 0xff]);
							else if (i == 0) {
								int i_3446_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3444_]) & 0xff]);
								int i_3447_ = ((i_3446_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_3448_ = ((i_3446_ & 0xff00) * anInt9018 & 0xff0000);
								int i_3449_ = (i_3446_ & 0xff) * anInt9019 & 0xff00;
								is[i_3445_] = (i_3447_ | i_3448_ | i_3449_) >>> 8;
							} else if (i == 3) {
								int i_3450_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3444_]) & 0xff]);
								int i_3451_ = anInt9014;
								int i_3452_ = i_3450_ + i_3451_;
								int i_3453_ = ((i_3450_ & 0xff00ff) + (i_3451_ & 0xff00ff));
								int i_3454_ = ((i_3453_ & 0x1000100) + (i_3452_ - i_3453_ & 0x10000));
								is[i_3445_] = i_3452_ - i_3454_ | i_3454_ - (i_3454_ >>> 8);
							} else if (i == 2) {
								int i_3455_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3444_]) & 0xff]);
								int i_3456_ = ((i_3455_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_3457_ = ((i_3455_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_3445_] = ((i_3456_ | i_3457_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_2882_ == 1) {
							if (i == 1) {
								int i_3458_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3444_]);
								if (i_3458_ != 0)
									is[i_3445_] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3458_ & 0xff]);
							} else if (i == 0) {
								int i_3459_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3444_]);
								if (i_3459_ != 0) {
									int i_3460_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3459_ & 0xff]);
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_3461_ = anInt9014 >>> 24;
										int i_3462_ = 256 - i_3461_;
										int i_3463_ = is[i_3445_];
										is[i_3445_] = ((((i_3460_ & 0xff00ff) * i_3461_ + ((i_3463_ & 0xff00ff) * i_3462_)) & ~0xff00ff) + (((i_3460_ & 0xff00) * i_3461_ + ((i_3463_ & 0xff00) * i_3462_)) & 0xff0000)) >> 8;
									} else if (anInt9015 != 255) {
										int i_3464_ = ((i_3460_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3465_ = ((i_3460_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3466_ = ((i_3460_ & 0xff) * anInt9019 & 0xff00);
										i_3460_ = (i_3464_ | i_3465_ | i_3466_) >>> 8;
										int i_3467_ = is[i_3445_];
										is[i_3445_] = (((((i_3460_ & 0xff00ff) * anInt9015) + ((i_3467_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3460_ & 0xff00) * anInt9015) + ((i_3467_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									} else {
										int i_3468_ = ((i_3460_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3469_ = ((i_3460_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3470_ = ((i_3460_ & 0xff) * anInt9019 & 0xff00);
										is[i_3445_] = (i_3468_ | i_3469_ | i_3470_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_3471_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3444_]);
								int i_3472_ = (i_3471_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3471_]) : 0);
								int i_3473_ = anInt9014;
								int i_3474_ = i_3472_ + i_3473_;
								int i_3475_ = ((i_3472_ & 0xff00ff) + (i_3473_ & 0xff00ff));
								int i_3476_ = ((i_3475_ & 0x1000100) + (i_3474_ - i_3475_ & 0x10000));
								i_3476_ = i_3474_ - i_3476_ | i_3476_ - (i_3476_ >>> 8);
								if (i_3472_ == 0 && anInt9015 != 255) {
									i_3472_ = i_3476_;
									i_3476_ = is[i_3445_];
									i_3476_ = ((((i_3472_ & 0xff00ff) * anInt9015 + ((i_3476_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + (((i_3472_ & 0xff00) * anInt9015 + ((i_3476_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
								}
								is[i_3445_] = i_3476_;
							} else if (i == 2) {
								int i_3477_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3444_]);
								if (i_3477_ != 0) {
									int i_3478_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3477_ & 0xff]);
									int i_3479_ = ((i_3478_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3480_ = ((i_3478_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_3445_++] = ((i_3479_ | i_3480_) >>> 8) + anInt9022;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2882_ == 2) {
							if (i == 1) {
								int i_3481_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3444_]);
								if (i_3481_ != 0) {
									int i_3482_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3481_ & 0xff]);
									int i_3483_ = is[i_3445_];
									int i_3484_ = i_3482_ + i_3483_;
									int i_3485_ = ((i_3482_ & 0xff00ff) + (i_3483_ & 0xff00ff));
									i_3483_ = ((i_3485_ & 0x1000100) + (i_3484_ - i_3485_ & 0x10000));
									is[i_3445_] = (i_3484_ - i_3483_ | i_3483_ - (i_3483_ >>> 8));
								}
							} else if (i == 0) {
								int i_3486_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3444_]);
								if (i_3486_ != 0) {
									int i_3487_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3486_ & 0xff]);
									int i_3488_ = ((i_3487_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3489_ = ((i_3487_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3490_ = ((i_3487_ & 0xff) * anInt9019 & 0xff00);
									i_3487_ = (i_3488_ | i_3489_ | i_3490_) >>> 8;
									int i_3491_ = is[i_3445_];
									int i_3492_ = i_3487_ + i_3491_;
									int i_3493_ = ((i_3487_ & 0xff00ff) + (i_3491_ & 0xff00ff));
									i_3491_ = ((i_3493_ & 0x1000100) + (i_3492_ - i_3493_ & 0x10000));
									is[i_3445_] = (i_3492_ - i_3491_ | i_3491_ - (i_3491_ >>> 8));
								}
							} else if (i == 3) {
								byte i_3494_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3444_]);
								int i_3495_ = (i_3494_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3494_]) : 0);
								int i_3496_ = anInt9014;
								int i_3497_ = i_3495_ + i_3496_;
								int i_3498_ = ((i_3495_ & 0xff00ff) + (i_3496_ & 0xff00ff));
								int i_3499_ = ((i_3498_ & 0x1000100) + (i_3497_ - i_3498_ & 0x10000));
								i_3499_ = i_3497_ - i_3499_ | i_3499_ - (i_3499_ >>> 8);
								if (i_3495_ == 0 && anInt9015 != 255) {
									i_3495_ = i_3499_;
									i_3499_ = is[i_3445_];
									i_3499_ = ((((i_3495_ & 0xff00ff) * anInt9015 + ((i_3499_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + (((i_3495_ & 0xff00) * anInt9015 + ((i_3499_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
								}
								is[i_3445_] = i_3499_;
							} else if (i == 2) {
								int i_3500_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3444_]);
								if (i_3500_ != 0) {
									int i_3501_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3500_ & 0xff]);
									int i_3502_ = ((i_3501_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3503_ = ((i_3501_ & 0xff00) * anInt9015 & 0xff0000);
									i_3501_ = (((i_3502_ | i_3503_) >>> 8) + anInt9022);
									int i_3504_ = is[i_3445_];
									int i_3505_ = i_3501_ + i_3504_;
									int i_3506_ = ((i_3501_ & 0xff00ff) + (i_3504_ & 0xff00ff));
									i_3504_ = ((i_3506_ & 0x1000100) + (i_3505_ - i_3506_ & 0x10000));
									is[i_3445_] = (i_3505_ - i_3504_ | i_3504_ - (i_3504_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_3439_ += anInt9004;
						i_3440_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	public void method648(int i, int i_3507_, int i_3508_, int i_3509_, int i_3510_) {
		if (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			int i_3511_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			i += ((Class57_Sub1_Sub3) this).anInt8990;
			i_3507_ += ((Class57_Sub1_Sub3) this).anInt9000;
			int i_3512_ = i_3507_ * i_3511_ + i;
			int i_3513_ = 0;
			int i_3514_ = ((Class57_Sub1_Sub3) this).anInt8989;
			int i_3515_ = ((Class57_Sub1_Sub3) this).anInt9010;
			int i_3516_ = i_3511_ - i_3515_;
			int i_3517_ = 0;
			if (i_3507_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_3518_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_3507_);
				i_3514_ -= i_3518_;
				i_3507_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_3513_ += i_3518_ * i_3515_;
				i_3512_ += i_3518_ * i_3511_;
			}
			if (i_3507_ + i_3514_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_3514_ -= (i_3507_ + i_3514_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_3519_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_3515_ -= i_3519_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_3513_ += i_3519_;
				i_3512_ += i_3519_;
				i_3517_ += i_3519_;
				i_3516_ += i_3519_;
			}
			if (i + i_3515_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_3520_ = (i + i_3515_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_3515_ -= i_3520_;
				i_3517_ += i_3520_;
				i_3516_ += i_3520_;
			}
			if (i_3515_ > 0 && i_3514_ > 0) {
				if (i_3510_ == 0) {
					if (i_3508_ == 1) {
						for (int i_3521_ = -i_3514_; i_3521_ < 0; i_3521_++) {
							int i_3522_ = i_3512_ + i_3515_ - 3;
							while (i_3512_ < i_3522_) {
								is[i_3512_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]) & 0xff]);
								is[i_3512_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]) & 0xff]);
								is[i_3512_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]) & 0xff]);
								is[i_3512_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]) & 0xff]);
							}
							i_3522_ += 3;
							while (i_3512_ < i_3522_)
								is[i_3512_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]) & 0xff]);
							i_3512_ += i_3516_;
							i_3513_ += i_3517_;
						}
					} else if (i_3508_ == 0) {
						int i_3523_ = (i_3509_ & 0xff0000) >> 16;
						int i_3524_ = (i_3509_ & 0xff00) >> 8;
						int i_3525_ = i_3509_ & 0xff;
						for (int i_3526_ = -i_3514_; i_3526_ < 0; i_3526_++) {
							for (int i_3527_ = -i_3515_; i_3527_ < 0; i_3527_++) {
								int i_3528_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]) & 0xff]);
								int i_3529_ = ((i_3528_ & 0xff0000) * i_3523_ & ~0xffffff);
								int i_3530_ = (i_3528_ & 0xff00) * i_3524_ & 0xff0000;
								int i_3531_ = (i_3528_ & 0xff) * i_3525_ & 0xff00;
								is[i_3512_++] = (i_3529_ | i_3530_ | i_3531_) >>> 8;
							}
							i_3512_ += i_3516_;
							i_3513_ += i_3517_;
						}
					} else if (i_3508_ == 3) {
						for (int i_3532_ = -i_3514_; i_3532_ < 0; i_3532_++) {
							for (int i_3533_ = -i_3515_; i_3533_ < 0; i_3533_++) {
								int i_3534_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]) & 0xff]);
								int i_3535_ = i_3534_ + i_3509_;
								int i_3536_ = ((i_3534_ & 0xff00ff) + (i_3509_ & 0xff00ff));
								int i_3537_ = ((i_3536_ & 0x1000100) + (i_3535_ - i_3536_ & 0x10000));
								is[i_3512_++] = i_3535_ - i_3537_ | i_3537_ - (i_3537_ >>> 8);
							}
							i_3512_ += i_3516_;
							i_3513_ += i_3517_;
						}
					} else if (i_3508_ == 2) {
						int i_3538_ = i_3509_ >>> 24;
						int i_3539_ = 256 - i_3538_;
						int i_3540_ = (i_3509_ & 0xff00ff) * i_3539_ & ~0xff00ff;
						int i_3541_ = (i_3509_ & 0xff00) * i_3539_ & 0xff0000;
						i_3509_ = (i_3540_ | i_3541_) >>> 8;
						for (int i_3542_ = -i_3514_; i_3542_ < 0; i_3542_++) {
							for (int i_3543_ = -i_3515_; i_3543_ < 0; i_3543_++) {
								int i_3544_ = (((Class57_Sub1_Sub3) this).anIntArray9968[(((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]) & 0xff]);
								i_3540_ = ((i_3544_ & 0xff00ff) * i_3538_ & ~0xff00ff);
								i_3541_ = (i_3544_ & 0xff00) * i_3538_ & 0xff0000;
								is[i_3512_++] = ((i_3540_ | i_3541_) >>> 8) + i_3509_;
							}
							i_3512_ += i_3516_;
							i_3513_ += i_3517_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3510_ == 1) {
					if (i_3508_ == 1) {
						for (int i_3545_ = -i_3514_; i_3545_ < 0; i_3545_++) {
							for (int i_3546_ = -i_3515_; i_3546_ < 0; i_3546_++) {
								int i_3547_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]);
								if (i_3547_ != 0) {
									int i_3548_ = ((((Class57_Sub1_Sub3) this).anIntArray9968[i_3547_ & 0xff]) | ~0xffffff);
									int i_3549_ = 255;
									int i_3550_ = 0;
									int i_3551_ = is[i_3512_];
									is[i_3512_++] = (((((i_3548_ & 0xff00ff) * i_3549_ + (i_3551_ & 0xff00ff) * i_3550_) & ~0xff00ff) >> 8) + (((((i_3548_ & ~0xff00ff) >>> 8) * i_3549_) + (((i_3551_ & ~0xff00ff) >>> 8) * i_3550_)) & ~0xff00ff));
								} else
									i_3512_++;
							}
							i_3512_ += i_3516_;
							i_3513_ += i_3517_;
						}
					} else if (i_3508_ == 0) {
						if ((i_3509_ & 0xffffff) == 16777215) {
							int i_3552_ = i_3509_ >>> 24;
							int i_3553_ = 256 - i_3552_;
							for (int i_3554_ = -i_3514_; i_3554_ < 0; i_3554_++) {
								for (int i_3555_ = -i_3515_; i_3555_ < 0; i_3555_++) {
									int i_3556_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]);
									if (i_3556_ != 0) {
										int i_3557_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3556_ & 0xff]);
										int i_3558_ = is[i_3512_];
										is[i_3512_++] = ((((i_3557_ & 0xff00ff) * i_3552_ + ((i_3558_ & 0xff00ff) * i_3553_)) & ~0xff00ff) + (((i_3557_ & 0xff00) * i_3552_ + ((i_3558_ & 0xff00) * i_3553_)) & 0xff0000)) >> 8;
									} else
										i_3512_++;
								}
								i_3512_ += i_3516_;
								i_3513_ += i_3517_;
							}
						} else {
							int i_3559_ = (i_3509_ & 0xff0000) >> 16;
							int i_3560_ = (i_3509_ & 0xff00) >> 8;
							int i_3561_ = i_3509_ & 0xff;
							int i_3562_ = i_3509_ >>> 24;
							int i_3563_ = 256 - i_3562_;
							for (int i_3564_ = -i_3514_; i_3564_ < 0; i_3564_++) {
								for (int i_3565_ = -i_3515_; i_3565_ < 0; i_3565_++) {
									int i_3566_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]);
									if (i_3566_ != 0) {
										int i_3567_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3566_ & 0xff]);
										if (i_3562_ != 255) {
											int i_3568_ = (((i_3567_ & 0xff0000) * i_3559_) & ~0xffffff);
											int i_3569_ = ((i_3567_ & 0xff00) * i_3560_ & 0xff0000);
											int i_3570_ = ((i_3567_ & 0xff) * i_3561_ & 0xff00);
											i_3567_ = (i_3568_ | i_3569_ | i_3570_) >>> 8;
											int i_3571_ = is[i_3512_];
											is[i_3512_++] = (((((i_3567_ & 0xff00ff) * i_3562_) + ((i_3571_ & 0xff00ff) * i_3563_)) & ~0xff00ff) + ((((i_3567_ & 0xff00) * i_3562_) + ((i_3571_ & 0xff00) * i_3563_)) & 0xff0000)) >> 8;
										} else {
											int i_3572_ = (((i_3567_ & 0xff0000) * i_3559_) & ~0xffffff);
											int i_3573_ = ((i_3567_ & 0xff00) * i_3560_ & 0xff0000);
											int i_3574_ = ((i_3567_ & 0xff) * i_3561_ & 0xff00);
											is[i_3512_++] = (i_3572_ | i_3573_ | i_3574_) >>> 8;
										}
									} else
										i_3512_++;
								}
								i_3512_ += i_3516_;
								i_3513_ += i_3517_;
							}
						}
					} else if (i_3508_ == 3) {
						int i_3575_ = i_3509_ >>> 24;
						int i_3576_ = 256 - i_3575_;
						for (int i_3577_ = -i_3514_; i_3577_ < 0; i_3577_++) {
							for (int i_3578_ = -i_3515_; i_3578_ < 0; i_3578_++) {
								byte i_3579_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]);
								int i_3580_ = (i_3579_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3579_]) : 0);
								int i_3581_ = i_3580_ + i_3509_;
								int i_3582_ = ((i_3580_ & 0xff00ff) + (i_3509_ & 0xff00ff));
								int i_3583_ = ((i_3582_ & 0x1000100) + (i_3581_ - i_3582_ & 0x10000));
								i_3583_ = i_3581_ - i_3583_ | i_3583_ - (i_3583_ >>> 8);
								if (i_3580_ == 0 && i_3575_ != 255) {
									i_3580_ = i_3583_;
									i_3583_ = is[i_3512_];
									i_3583_ = ((((i_3580_ & 0xff00ff) * i_3575_ + (i_3583_ & 0xff00ff) * i_3576_) & ~0xff00ff) + (((i_3580_ & 0xff00) * i_3575_ + (i_3583_ & 0xff00) * i_3576_) & 0xff0000)) >> 8;
								}
								is[i_3512_++] = i_3583_;
							}
							i_3512_ += i_3516_;
							i_3513_ += i_3517_;
						}
					} else if (i_3508_ == 2) {
						int i_3584_ = i_3509_ >>> 24;
						int i_3585_ = 256 - i_3584_;
						int i_3586_ = (i_3509_ & 0xff00ff) * i_3585_ & ~0xff00ff;
						int i_3587_ = (i_3509_ & 0xff00) * i_3585_ & 0xff0000;
						i_3509_ = (i_3586_ | i_3587_) >>> 8;
						for (int i_3588_ = -i_3514_; i_3588_ < 0; i_3588_++) {
							for (int i_3589_ = -i_3515_; i_3589_ < 0; i_3589_++) {
								int i_3590_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]);
								if (i_3590_ != 0) {
									int i_3591_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3590_ & 0xff]);
									i_3586_ = ((i_3591_ & 0xff00ff) * i_3584_ & ~0xff00ff);
									i_3587_ = ((i_3591_ & 0xff00) * i_3584_ & 0xff0000);
									is[i_3512_++] = ((i_3586_ | i_3587_) >>> 8) + i_3509_;
								} else
									i_3512_++;
							}
							i_3512_ += i_3516_;
							i_3513_ += i_3517_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3510_ == 2) {
					if (i_3508_ == 1) {
						for (int i_3592_ = -i_3514_; i_3592_ < 0; i_3592_++) {
							for (int i_3593_ = -i_3515_; i_3593_ < 0; i_3593_++) {
								int i_3594_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]);
								if (i_3594_ != 0) {
									int i_3595_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3594_ & 0xff]);
									int i_3596_ = is[i_3512_];
									int i_3597_ = i_3595_ + i_3596_;
									int i_3598_ = ((i_3595_ & 0xff00ff) + (i_3596_ & 0xff00ff));
									i_3596_ = ((i_3598_ & 0x1000100) + (i_3597_ - i_3598_ & 0x10000));
									is[i_3512_++] = (i_3597_ - i_3596_ | i_3596_ - (i_3596_ >>> 8));
								} else
									i_3512_++;
							}
							i_3512_ += i_3516_;
							i_3513_ += i_3517_;
						}
					} else if (i_3508_ == 0) {
						int i_3599_ = (i_3509_ & 0xff0000) >> 16;
						int i_3600_ = (i_3509_ & 0xff00) >> 8;
						int i_3601_ = i_3509_ & 0xff;
						for (int i_3602_ = -i_3514_; i_3602_ < 0; i_3602_++) {
							for (int i_3603_ = -i_3515_; i_3603_ < 0; i_3603_++) {
								int i_3604_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]);
								if (i_3604_ != 0) {
									int i_3605_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3604_ & 0xff]);
									int i_3606_ = ((i_3605_ & 0xff0000) * i_3599_ & ~0xffffff);
									int i_3607_ = ((i_3605_ & 0xff00) * i_3600_ & 0xff0000);
									int i_3608_ = (i_3605_ & 0xff) * i_3601_ & 0xff00;
									i_3605_ = (i_3606_ | i_3607_ | i_3608_) >>> 8;
									int i_3609_ = is[i_3512_];
									int i_3610_ = i_3605_ + i_3609_;
									int i_3611_ = ((i_3605_ & 0xff00ff) + (i_3609_ & 0xff00ff));
									i_3609_ = ((i_3611_ & 0x1000100) + (i_3610_ - i_3611_ & 0x10000));
									is[i_3512_++] = (i_3610_ - i_3609_ | i_3609_ - (i_3609_ >>> 8));
								} else
									i_3512_++;
							}
							i_3512_ += i_3516_;
							i_3513_ += i_3517_;
						}
					} else if (i_3508_ == 3) {
						for (int i_3612_ = -i_3514_; i_3612_ < 0; i_3612_++) {
							for (int i_3613_ = -i_3515_; i_3613_ < 0; i_3613_++) {
								byte i_3614_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]);
								int i_3615_ = (i_3614_ > 0 ? (((Class57_Sub1_Sub3) this).anIntArray9968[i_3614_]) : 0);
								int i_3616_ = i_3615_ + i_3509_;
								int i_3617_ = ((i_3615_ & 0xff00ff) + (i_3509_ & 0xff00ff));
								int i_3618_ = ((i_3617_ & 0x1000100) + (i_3616_ - i_3617_ & 0x10000));
								i_3615_ = i_3616_ - i_3618_ | i_3618_ - (i_3618_ >>> 8);
								i_3618_ = is[i_3512_];
								i_3616_ = i_3615_ + i_3618_;
								i_3617_ = (i_3615_ & 0xff00ff) + (i_3618_ & 0xff00ff);
								i_3618_ = ((i_3617_ & 0x1000100) + (i_3616_ - i_3617_ & 0x10000));
								is[i_3512_++] = i_3616_ - i_3618_ | i_3618_ - (i_3618_ >>> 8);
							}
							i_3512_ += i_3516_;
							i_3513_ += i_3517_;
						}
					} else if (i_3508_ == 2) {
						int i_3619_ = i_3509_ >>> 24;
						int i_3620_ = 256 - i_3619_;
						int i_3621_ = (i_3509_ & 0xff00ff) * i_3620_ & ~0xff00ff;
						int i_3622_ = (i_3509_ & 0xff00) * i_3620_ & 0xff0000;
						i_3509_ = (i_3621_ | i_3622_) >>> 8;
						for (int i_3623_ = -i_3514_; i_3623_ < 0; i_3623_++) {
							for (int i_3624_ = -i_3515_; i_3624_ < 0; i_3624_++) {
								int i_3625_ = (((Class57_Sub1_Sub3) this).aByteArray9967[i_3513_++]);
								if (i_3625_ != 0) {
									int i_3626_ = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3625_ & 0xff]);
									i_3621_ = ((i_3626_ & 0xff00ff) * i_3619_ & ~0xff00ff);
									i_3622_ = ((i_3626_ & 0xff00) * i_3619_ & 0xff0000);
									i_3626_ = (((i_3621_ | i_3622_) >>> 8) + i_3509_);
									int i_3627_ = is[i_3512_];
									int i_3628_ = i_3626_ + i_3627_;
									int i_3629_ = ((i_3626_ & 0xff00ff) + (i_3627_ & 0xff00ff));
									i_3627_ = ((i_3629_ & 0x1000100) + (i_3628_ - i_3629_ & 0x10000));
									is[i_3512_++] = (i_3628_ - i_3627_ | i_3627_ - (i_3627_ >>> 8));
								} else
									i_3512_++;
							}
							i_3512_ += i_3516_;
							i_3513_ += i_3517_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method684(int[] is, int[] is_3630_, int i, int i_3631_) {
		int[] is_3632_ = (((Class_ra_Sub1) ((Class57_Sub1_Sub3) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is_3632_ != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_3633_ = anInt9001;
					while (i_3633_ < 0) {
						int i_3634_ = i_3633_ + i_3631_;
						if (i_3634_ >= 0) {
							if (i_3634_ >= is.length)
								break;
							int i_3635_ = anInt9003;
							int i_3636_ = anInt8988;
							int i_3637_ = anInt9011;
							int i_3638_ = anInt8999;
							if (i_3636_ >= 0 && i_3637_ >= 0 && (i_3636_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) < 0 && (i_3637_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) < 0) {
								int i_3639_ = is[i_3634_] - i;
								int i_3640_ = -is_3630_[i_3634_];
								int i_3641_ = i_3639_ - (i_3635_ - anInt9003);
								if (i_3641_ > 0) {
									i_3635_ += i_3641_;
									i_3638_ += i_3641_;
									i_3636_ += anInt9004 * i_3641_;
									i_3637_ += anInt8991 * i_3641_;
								} else
									i_3640_ -= i_3641_;
								if (i_3638_ < i_3640_)
									i_3638_ = i_3640_;
								for (/**/; i_3638_ < 0; i_3638_++) {
									int i_3642_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_3637_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_3636_ >> 12))]);
									if (i_3642_ != 0)
										is_3632_[i_3635_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3642_ & 0xff]);
									else
										i_3635_++;
								}
							}
						}
						i_3633_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_3643_ = anInt9001;
					while (i_3643_ < 0) {
						int i_3644_ = i_3643_ + i_3631_;
						if (i_3644_ >= 0) {
							if (i_3644_ >= is.length)
								break;
							int i_3645_ = anInt9003;
							int i_3646_ = anInt8988;
							int i_3647_ = anInt9011 + anInt9013;
							int i_3648_ = anInt8999;
							if (i_3646_ >= 0 && (i_3646_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) < 0) {
								int i_3649_;
								if ((i_3649_ = (i_3647_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12))) >= 0) {
									i_3649_ = (anInt8991 - i_3649_) / anInt8991;
									i_3648_ += i_3649_;
									i_3647_ += anInt8991 * i_3649_;
									i_3645_ += i_3649_;
								}
								if ((i_3649_ = (i_3647_ - anInt8991) / anInt8991) > i_3648_)
									i_3648_ = i_3649_;
								int i_3650_ = is[i_3644_] - i;
								int i_3651_ = -is_3630_[i_3644_];
								int i_3652_ = i_3650_ - (i_3645_ - anInt9003);
								if (i_3652_ > 0) {
									i_3645_ += i_3652_;
									i_3648_ += i_3652_;
									i_3646_ += anInt9004 * i_3652_;
									i_3647_ += anInt8991 * i_3652_;
								} else
									i_3651_ -= i_3652_;
								if (i_3648_ < i_3651_)
									i_3648_ = i_3651_;
								for (/**/; i_3648_ < 0; i_3648_++) {
									int i_3653_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_3647_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_3646_ >> 12))]);
									if (i_3653_ != 0)
										is_3632_[i_3645_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3653_ & 0xff]);
									else
										i_3645_++;
									i_3647_ += anInt8991;
								}
							}
						}
						i_3643_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_3654_ = anInt9001;
					while (i_3654_ < 0) {
						int i_3655_ = i_3654_ + i_3631_;
						if (i_3655_ >= 0) {
							if (i_3655_ >= is.length)
								break;
							int i_3656_ = anInt9003;
							int i_3657_ = anInt8988;
							int i_3658_ = anInt9011 + anInt9013;
							int i_3659_ = anInt8999;
							if (i_3657_ >= 0 && (i_3657_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12)) < 0) {
								if (i_3658_ < 0) {
									int i_3660_ = ((anInt8991 - 1 - i_3658_) / anInt8991);
									i_3659_ += i_3660_;
									i_3658_ += anInt8991 * i_3660_;
									i_3656_ += i_3660_;
								}
								int i_3661_;
								if ((i_3661_ = (1 + i_3658_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3659_)
									i_3659_ = i_3661_;
								int i_3662_ = is[i_3655_] - i;
								int i_3663_ = -is_3630_[i_3655_];
								int i_3664_ = i_3662_ - (i_3656_ - anInt9003);
								if (i_3664_ > 0) {
									i_3656_ += i_3664_;
									i_3659_ += i_3664_;
									i_3657_ += anInt9004 * i_3664_;
									i_3658_ += anInt8991 * i_3664_;
								} else
									i_3663_ -= i_3664_;
								if (i_3659_ < i_3663_)
									i_3659_ = i_3663_;
								for (/**/; i_3659_ < 0; i_3659_++) {
									int i_3665_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_3658_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_3657_ >> 12))]);
									if (i_3665_ != 0)
										is_3632_[i_3656_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3665_ & 0xff]);
									else
										i_3656_++;
									i_3658_ += anInt8991;
								}
							}
						}
						i_3654_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_3666_ = anInt9001;
					while (i_3666_ < 0) {
						int i_3667_ = i_3666_ + i_3631_;
						if (i_3667_ >= 0) {
							if (i_3667_ >= is.length)
								break;
							int i_3668_ = anInt9003;
							int i_3669_ = anInt8988 + anInt9012;
							int i_3670_ = anInt9011;
							int i_3671_ = anInt8999;
							if (i_3670_ >= 0 && (i_3670_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) < 0) {
								int i_3672_;
								if ((i_3672_ = (i_3669_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12))) >= 0) {
									i_3672_ = (anInt9004 - i_3672_) / anInt9004;
									i_3671_ += i_3672_;
									i_3669_ += anInt9004 * i_3672_;
									i_3668_ += i_3672_;
								}
								if ((i_3672_ = (i_3669_ - anInt9004) / anInt9004) > i_3671_)
									i_3671_ = i_3672_;
								int i_3673_ = is[i_3667_] - i;
								int i_3674_ = -is_3630_[i_3667_];
								int i_3675_ = i_3673_ - (i_3668_ - anInt9003);
								if (i_3675_ > 0) {
									i_3668_ += i_3675_;
									i_3671_ += i_3675_;
									i_3669_ += anInt9004 * i_3675_;
									i_3670_ += anInt8991 * i_3675_;
								} else
									i_3674_ -= i_3675_;
								if (i_3671_ < i_3674_)
									i_3671_ = i_3674_;
								for (/**/; i_3671_ < 0; i_3671_++) {
									int i_3676_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_3670_ >> 12) * (((Class57_Sub1_Sub3) this).anInt9010)) + (i_3669_ >> 12))]);
									if (i_3676_ != 0)
										is_3632_[i_3668_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3676_ & 0xff]);
									else
										i_3668_++;
									i_3669_ += anInt9004;
								}
							}
						}
						i_3666_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_3677_ = anInt9001;
					while (i_3677_ < 0) {
						int i_3678_ = i_3677_ + i_3631_;
						if (i_3678_ >= 0) {
							if (i_3678_ >= is.length)
								break;
							int i_3679_ = anInt9003;
							int i_3680_ = anInt8988 + anInt9012;
							int i_3681_ = anInt9011 + anInt9013;
							int i_3682_ = anInt8999;
							int i_3683_;
							if ((i_3683_ = (i_3680_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12))) >= 0) {
								i_3683_ = (anInt9004 - i_3683_) / anInt9004;
								i_3682_ += i_3683_;
								i_3680_ += anInt9004 * i_3683_;
								i_3681_ += anInt8991 * i_3683_;
								i_3679_ += i_3683_;
							}
							if ((i_3683_ = (i_3680_ - anInt9004) / anInt9004) > i_3682_)
								i_3682_ = i_3683_;
							if ((i_3683_ = (i_3681_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12))) >= 0) {
								i_3683_ = (anInt8991 - i_3683_) / anInt8991;
								i_3682_ += i_3683_;
								i_3680_ += anInt9004 * i_3683_;
								i_3681_ += anInt8991 * i_3683_;
								i_3679_ += i_3683_;
							}
							if ((i_3683_ = (i_3681_ - anInt8991) / anInt8991) > i_3682_)
								i_3682_ = i_3683_;
							int i_3684_ = is[i_3678_] - i;
							int i_3685_ = -is_3630_[i_3678_];
							int i_3686_ = i_3684_ - (i_3679_ - anInt9003);
							if (i_3686_ > 0) {
								i_3679_ += i_3686_;
								i_3682_ += i_3686_;
								i_3680_ += anInt9004 * i_3686_;
								i_3681_ += anInt8991 * i_3686_;
							} else
								i_3685_ -= i_3686_;
							if (i_3682_ < i_3685_)
								i_3682_ = i_3685_;
							for (/**/; i_3682_ < 0; i_3682_++) {
								int i_3687_ = (((Class57_Sub1_Sub3) this).aByteArray9967[((i_3681_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010 + (i_3680_ >> 12))]);
								if (i_3687_ != 0)
									is_3632_[i_3679_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3687_ & 0xff]);
								else
									i_3679_++;
								i_3680_ += anInt9004;
								i_3681_ += anInt8991;
							}
						}
						i_3677_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_3688_ = anInt9001;
					while (i_3688_ < 0) {
						int i_3689_ = i_3688_ + i_3631_;
						if (i_3689_ >= 0) {
							if (i_3689_ >= is.length)
								break;
							int i_3690_ = anInt9003;
							int i_3691_ = anInt8988 + anInt9012;
							int i_3692_ = anInt9011 + anInt9013;
							int i_3693_ = anInt8999;
							int i_3694_;
							if ((i_3694_ = (i_3691_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12))) >= 0) {
								i_3694_ = (anInt9004 - i_3694_) / anInt9004;
								i_3693_ += i_3694_;
								i_3691_ += anInt9004 * i_3694_;
								i_3692_ += anInt8991 * i_3694_;
								i_3690_ += i_3694_;
							}
							if ((i_3694_ = (i_3691_ - anInt9004) / anInt9004) > i_3693_)
								i_3693_ = i_3694_;
							if (i_3692_ < 0) {
								i_3694_ = (anInt8991 - 1 - i_3692_) / anInt8991;
								i_3693_ += i_3694_;
								i_3691_ += anInt9004 * i_3694_;
								i_3692_ += anInt8991 * i_3694_;
								i_3690_ += i_3694_;
							}
							if ((i_3694_ = (1 + i_3692_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3693_)
								i_3693_ = i_3694_;
							int i_3695_ = is[i_3689_] - i;
							int i_3696_ = -is_3630_[i_3689_];
							int i_3697_ = i_3695_ - (i_3690_ - anInt9003);
							if (i_3697_ > 0) {
								i_3690_ += i_3697_;
								i_3693_ += i_3697_;
								i_3691_ += anInt9004 * i_3697_;
								i_3692_ += anInt8991 * i_3697_;
							} else
								i_3696_ -= i_3697_;
							if (i_3693_ < i_3696_)
								i_3693_ = i_3696_;
							for (/**/; i_3693_ < 0; i_3693_++) {
								int i_3698_ = (((Class57_Sub1_Sub3) this).aByteArray9967[((i_3692_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010 + (i_3691_ >> 12))]);
								if (i_3698_ != 0)
									is_3632_[i_3690_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3698_ & 0xff]);
								else
									i_3690_++;
								i_3691_ += anInt9004;
								i_3692_ += anInt8991;
							}
						}
						i_3688_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_3699_ = anInt9001;
				while (i_3699_ < 0) {
					int i_3700_ = i_3699_ + i_3631_;
					if (i_3700_ >= 0) {
						if (i_3700_ >= is.length)
							break;
						int i_3701_ = anInt9003;
						int i_3702_ = anInt8988 + anInt9012;
						int i_3703_ = anInt9011;
						int i_3704_ = anInt8999;
						if (i_3703_ >= 0 && i_3703_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) < 0) {
							if (i_3702_ < 0) {
								int i_3705_ = (anInt9004 - 1 - i_3702_) / anInt9004;
								i_3704_ += i_3705_;
								i_3702_ += anInt9004 * i_3705_;
								i_3701_ += i_3705_;
							}
							int i_3706_;
							if ((i_3706_ = (1 + i_3702_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3704_)
								i_3704_ = i_3706_;
							int i_3707_ = is[i_3700_] - i;
							int i_3708_ = -is_3630_[i_3700_];
							int i_3709_ = i_3707_ - (i_3701_ - anInt9003);
							if (i_3709_ > 0) {
								i_3701_ += i_3709_;
								i_3704_ += i_3709_;
								i_3702_ += anInt9004 * i_3709_;
								i_3703_ += anInt8991 * i_3709_;
							} else
								i_3708_ -= i_3709_;
							if (i_3704_ < i_3708_)
								i_3704_ = i_3708_;
							for (/**/; i_3704_ < 0; i_3704_++) {
								int i_3710_ = (((Class57_Sub1_Sub3) this).aByteArray9967[((i_3703_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010 + (i_3702_ >> 12))]);
								if (i_3710_ != 0)
									is_3632_[i_3701_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3710_ & 0xff]);
								else
									i_3701_++;
								i_3702_ += anInt9004;
							}
						}
					}
					i_3699_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				int i_3711_ = anInt9001;
				while (i_3711_ < 0) {
					int i_3712_ = i_3711_ + i_3631_;
					if (i_3712_ >= 0) {
						if (i_3712_ >= is.length)
							break;
						int i_3713_ = anInt9003;
						int i_3714_ = anInt8988 + anInt9012;
						int i_3715_ = anInt9011 + anInt9013;
						int i_3716_ = anInt8999;
						if (i_3714_ < 0) {
							int i_3717_ = (anInt9004 - 1 - i_3714_) / anInt9004;
							i_3716_ += i_3717_;
							i_3714_ += anInt9004 * i_3717_;
							i_3715_ += anInt8991 * i_3717_;
							i_3713_ += i_3717_;
						}
						int i_3718_;
						if ((i_3718_ = (1 + i_3714_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3716_)
							i_3716_ = i_3718_;
						if ((i_3718_ = i_3715_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12)) >= 0) {
							i_3718_ = (anInt8991 - i_3718_) / anInt8991;
							i_3716_ += i_3718_;
							i_3714_ += anInt9004 * i_3718_;
							i_3715_ += anInt8991 * i_3718_;
							i_3713_ += i_3718_;
						}
						if ((i_3718_ = (i_3715_ - anInt8991) / anInt8991) > i_3716_)
							i_3716_ = i_3718_;
						int i_3719_ = is[i_3712_] - i;
						int i_3720_ = -is_3630_[i_3712_];
						int i_3721_ = i_3719_ - (i_3713_ - anInt9003);
						if (i_3721_ > 0) {
							i_3713_ += i_3721_;
							i_3716_ += i_3721_;
							i_3714_ += anInt9004 * i_3721_;
							i_3715_ += anInt8991 * i_3721_;
						} else
							i_3720_ -= i_3721_;
						if (i_3716_ < i_3720_)
							i_3716_ = i_3720_;
						for (/**/; i_3716_ < 0; i_3716_++) {
							int i_3722_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_3715_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_3714_ >> 12))]);
							if (i_3722_ != 0)
								is_3632_[i_3713_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3722_ & 0xff]);
							else
								i_3713_++;
							i_3714_ += anInt9004;
							i_3715_ += anInt8991;
						}
					}
					i_3711_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				int i_3723_ = anInt9001;
				while (i_3723_ < 0) {
					int i_3724_ = i_3723_ + i_3631_;
					if (i_3724_ >= 0) {
						if (i_3724_ >= is.length)
							break;
						int i_3725_ = anInt9003;
						int i_3726_ = anInt8988 + anInt9012;
						int i_3727_ = anInt9011 + anInt9013;
						int i_3728_ = anInt8999;
						if (i_3726_ < 0) {
							int i_3729_ = (anInt9004 - 1 - i_3726_) / anInt9004;
							i_3728_ += i_3729_;
							i_3726_ += anInt9004 * i_3729_;
							i_3727_ += anInt8991 * i_3729_;
							i_3725_ += i_3729_;
						}
						int i_3730_;
						if ((i_3730_ = (1 + i_3726_ - (((Class57_Sub1_Sub3) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3728_)
							i_3728_ = i_3730_;
						if (i_3727_ < 0) {
							i_3730_ = (anInt8991 - 1 - i_3727_) / anInt8991;
							i_3728_ += i_3730_;
							i_3726_ += anInt9004 * i_3730_;
							i_3727_ += anInt8991 * i_3730_;
							i_3725_ += i_3730_;
						}
						if ((i_3730_ = (1 + i_3727_ - (((Class57_Sub1_Sub3) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3728_)
							i_3728_ = i_3730_;
						int i_3731_ = is[i_3724_] - i;
						int i_3732_ = -is_3630_[i_3724_];
						int i_3733_ = i_3731_ - (i_3725_ - anInt9003);
						if (i_3733_ > 0) {
							i_3725_ += i_3733_;
							i_3728_ += i_3733_;
							i_3726_ += anInt9004 * i_3733_;
							i_3727_ += anInt8991 * i_3733_;
						} else
							i_3732_ -= i_3733_;
						if (i_3728_ < i_3732_)
							i_3728_ = i_3732_;
						for (/**/; i_3728_ < 0; i_3728_++) {
							int i_3734_ = (((Class57_Sub1_Sub3) this).aByteArray9967[(((i_3727_ >> 12) * ((Class57_Sub1_Sub3) this).anInt9010) + (i_3726_ >> 12))]);
							if (i_3734_ != 0)
								is_3632_[i_3725_++] = (((Class57_Sub1_Sub3) this).anIntArray9968[i_3734_ & 0xff]);
							else
								i_3725_++;
							i_3726_ += anInt9004;
							i_3727_ += anInt8991;
						}
					}
					i_3723_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	Class57_Sub1_Sub3(Class_ra_Sub1 class_ra_sub1, byte[] is, int[] is_3735_, int i, int i_3736_) {
		super(class_ra_sub1, i, i_3736_);
		((Class57_Sub1_Sub3) this).aByteArray9967 = is;
		((Class57_Sub1_Sub3) this).anIntArray9968 = is_3735_;
	}

	public void method665(int i, int i_3737_, int i_3738_, int i_3739_, int i_3740_, int i_3741_) {
		throw new IllegalStateException();
	}

	public void method624(int i, int i_3742_, int i_3743_, int i_3744_, int i_3745_, int i_3746_) {
		throw new IllegalStateException();
	}
}
