/* Class57_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class57_Sub1_Sub2 extends Class57_Sub1 {
	int[] anIntArray9966;

	public void method631(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			int i_4_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			i += ((Class57_Sub1_Sub2) this).anInt8990;
			i_0_ += ((Class57_Sub1_Sub2) this).anInt9000;
			int i_5_ = i_0_ * i_4_ + i;
			int i_6_ = 0;
			int i_7_ = ((Class57_Sub1_Sub2) this).anInt8989;
			int i_8_ = ((Class57_Sub1_Sub2) this).anInt9010;
			int i_9_ = i_4_ - i_8_;
			int i_10_ = 0;
			if (i_0_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_11_ = ((((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805 - i_0_);
				i_7_ -= i_11_;
				i_0_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_6_ += i_11_ * i_8_;
				i_5_ += i_11_ * i_4_;
			}
			if (i_0_ + i_7_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7977) * 63686679)
				i_7_ -= (i_0_ + i_7_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7977 * 63686679));
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_12_ = ((((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974) * -912871679 - i);
				i_8_ -= i_12_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_6_ += i_12_;
				i_5_ += i_12_;
				i_10_ += i_12_;
				i_9_ += i_12_;
			}
			if (i + i_8_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7991 * -1416794725)) {
				int i_13_ = i + i_8_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725;
				i_8_ -= i_13_;
				i_10_ += i_13_;
				i_9_ += i_13_;
			}
			if (i_8_ > 0 && i_7_ > 0) {
				if (i_3_ == 0) {
					if (i_1_ == 1) {
						for (int i_14_ = -i_7_; i_14_ < 0; i_14_++) {
							int i_15_ = i_5_ + i_8_ - 3;
							while (i_5_ < i_15_) {
								is[i_5_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								is[i_5_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								is[i_5_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								is[i_5_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
							}
							i_15_ += 3;
							while (i_5_ < i_15_)
								is[i_5_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 0) {
						int i_16_ = (i_2_ & 0xff0000) >> 16;
						int i_17_ = (i_2_ & 0xff00) >> 8;
						int i_18_ = i_2_ & 0xff;
						for (int i_19_ = -i_7_; i_19_ < 0; i_19_++) {
							for (int i_20_ = -i_8_; i_20_ < 0; i_20_++) {
								int i_21_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								int i_22_ = (i_21_ & 0xff0000) * i_16_ & ~0xffffff;
								int i_23_ = (i_21_ & 0xff00) * i_17_ & 0xff0000;
								int i_24_ = (i_21_ & 0xff) * i_18_ & 0xff00;
								is[i_5_++] = (i_22_ | i_23_ | i_24_) >>> 8;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 3) {
						for (int i_25_ = -i_7_; i_25_ < 0; i_25_++) {
							for (int i_26_ = -i_8_; i_26_ < 0; i_26_++) {
								int i_27_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								int i_28_ = i_27_ + i_2_;
								int i_29_ = (i_27_ & 0xff00ff) + (i_2_ & 0xff00ff);
								int i_30_ = ((i_29_ & 0x1000100) + (i_28_ - i_29_ & 0x10000));
								is[i_5_++] = i_28_ - i_30_ | i_30_ - (i_30_ >>> 8);
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 2) {
						int i_31_ = i_2_ >>> 24;
						int i_32_ = 256 - i_31_;
						int i_33_ = (i_2_ & 0xff00ff) * i_32_ & ~0xff00ff;
						int i_34_ = (i_2_ & 0xff00) * i_32_ & 0xff0000;
						i_2_ = (i_33_ | i_34_) >>> 8;
						for (int i_35_ = -i_7_; i_35_ < 0; i_35_++) {
							for (int i_36_ = -i_8_; i_36_ < 0; i_36_++) {
								int i_37_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								i_33_ = (i_37_ & 0xff00ff) * i_31_ & ~0xff00ff;
								i_34_ = (i_37_ & 0xff00) * i_31_ & 0xff0000;
								is[i_5_++] = ((i_33_ | i_34_) >>> 8) + i_2_;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3_ == 1) {
					if (i_1_ == 1) {
						for (int i_38_ = -i_7_; i_38_ < 0; i_38_++) {
							int i_39_ = i_5_ + i_8_ - 3;
							while (i_5_ < i_39_) {
								int i_40_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								if (i_40_ != 0)
									is[i_5_++] = i_40_;
								else
									i_5_++;
								i_40_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								if (i_40_ != 0)
									is[i_5_++] = i_40_;
								else
									i_5_++;
								i_40_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								if (i_40_ != 0)
									is[i_5_++] = i_40_;
								else
									i_5_++;
								i_40_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								if (i_40_ != 0)
									is[i_5_++] = i_40_;
								else
									i_5_++;
							}
							i_39_ += 3;
							while (i_5_ < i_39_) {
								int i_41_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								if (i_41_ != 0)
									is[i_5_++] = i_41_;
								else
									i_5_++;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 0) {
						if ((i_2_ & 0xffffff) == 16777215) {
							int i_42_ = i_2_ >>> 24;
							int i_43_ = 256 - i_42_;
							for (int i_44_ = -i_7_; i_44_ < 0; i_44_++) {
								for (int i_45_ = -i_8_; i_45_ < 0; i_45_++) {
									int i_46_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
									if (i_46_ != 0) {
										int i_47_ = is[i_5_];
										is[i_5_++] = ((((i_46_ & 0xff00ff) * i_42_ + (i_47_ & 0xff00ff) * i_43_) & ~0xff00ff) + (((i_46_ & 0xff00) * i_42_ + (i_47_ & 0xff00) * i_43_) & 0xff0000)) >> 8;
									} else
										i_5_++;
								}
								i_5_ += i_9_;
								i_6_ += i_10_;
							}
						} else {
							int i_48_ = (i_2_ & 0xff0000) >> 16;
							int i_49_ = (i_2_ & 0xff00) >> 8;
							int i_50_ = i_2_ & 0xff;
							int i_51_ = i_2_ >>> 24;
							int i_52_ = 256 - i_51_;
							for (int i_53_ = -i_7_; i_53_ < 0; i_53_++) {
								for (int i_54_ = -i_8_; i_54_ < 0; i_54_++) {
									int i_55_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
									if (i_55_ != 0) {
										if (i_51_ != 255) {
											int i_56_ = ((i_55_ & 0xff0000) * i_48_ & ~0xffffff);
											int i_57_ = ((i_55_ & 0xff00) * i_49_ & 0xff0000);
											int i_58_ = ((i_55_ & 0xff) * i_50_ & 0xff00);
											i_55_ = ((i_56_ | i_57_ | i_58_) >>> 8);
											int i_59_ = is[i_5_];
											is[i_5_++] = ((((i_55_ & 0xff00ff) * i_51_ + ((i_59_ & 0xff00ff) * i_52_)) & ~0xff00ff) + (((i_55_ & 0xff00) * i_51_ + ((i_59_ & 0xff00) * i_52_)) & 0xff0000)) >> 8;
										} else {
											int i_60_ = ((i_55_ & 0xff0000) * i_48_ & ~0xffffff);
											int i_61_ = ((i_55_ & 0xff00) * i_49_ & 0xff0000);
											int i_62_ = ((i_55_ & 0xff) * i_50_ & 0xff00);
											is[i_5_++] = (i_60_ | i_61_ | i_62_) >>> 8;
										}
									} else
										i_5_++;
								}
								i_5_ += i_9_;
								i_6_ += i_10_;
							}
						}
					} else if (i_1_ == 3) {
						int i_63_ = i_2_ >>> 24;
						int i_64_ = 256 - i_63_;
						for (int i_65_ = -i_7_; i_65_ < 0; i_65_++) {
							for (int i_66_ = -i_8_; i_66_ < 0; i_66_++) {
								int i_67_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								int i_68_ = i_67_ + i_2_;
								int i_69_ = (i_67_ & 0xff00ff) + (i_2_ & 0xff00ff);
								int i_70_ = ((i_69_ & 0x1000100) + (i_68_ - i_69_ & 0x10000));
								i_70_ = i_68_ - i_70_ | i_70_ - (i_70_ >>> 8);
								if (i_67_ == 0 && i_63_ != 255) {
									i_67_ = i_70_;
									i_70_ = is[i_5_];
									i_70_ = ((((i_67_ & 0xff00ff) * i_63_ + (i_70_ & 0xff00ff) * i_64_) & ~0xff00ff) + (((i_67_ & 0xff00) * i_63_ + (i_70_ & 0xff00) * i_64_) & 0xff0000)) >> 8;
								}
								is[i_5_++] = i_70_;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 2) {
						int i_71_ = i_2_ >>> 24;
						int i_72_ = 256 - i_71_;
						int i_73_ = (i_2_ & 0xff00ff) * i_72_ & ~0xff00ff;
						int i_74_ = (i_2_ & 0xff00) * i_72_ & 0xff0000;
						i_2_ = (i_73_ | i_74_) >>> 8;
						for (int i_75_ = -i_7_; i_75_ < 0; i_75_++) {
							for (int i_76_ = -i_8_; i_76_ < 0; i_76_++) {
								int i_77_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								if (i_77_ != 0) {
									i_73_ = ((i_77_ & 0xff00ff) * i_71_ & ~0xff00ff);
									i_74_ = (i_77_ & 0xff00) * i_71_ & 0xff0000;
									is[i_5_++] = ((i_73_ | i_74_) >>> 8) + i_2_;
								} else
									i_5_++;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3_ == 2) {
					if (i_1_ == 1) {
						for (int i_78_ = -i_7_; i_78_ < 0; i_78_++) {
							for (int i_79_ = -i_8_; i_79_ < 0; i_79_++) {
								int i_80_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								if (i_80_ != 0) {
									int i_81_ = is[i_5_];
									int i_82_ = i_80_ + i_81_;
									int i_83_ = ((i_80_ & 0xff00ff) + (i_81_ & 0xff00ff));
									i_81_ = (i_83_ & 0x1000100) + (i_82_ - i_83_ & 0x10000);
									is[i_5_++] = i_82_ - i_81_ | i_81_ - (i_81_ >>> 8);
								} else
									i_5_++;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 0) {
						int i_84_ = (i_2_ & 0xff0000) >> 16;
						int i_85_ = (i_2_ & 0xff00) >> 8;
						int i_86_ = i_2_ & 0xff;
						for (int i_87_ = -i_7_; i_87_ < 0; i_87_++) {
							for (int i_88_ = -i_8_; i_88_ < 0; i_88_++) {
								int i_89_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								if (i_89_ != 0) {
									int i_90_ = ((i_89_ & 0xff0000) * i_84_ & ~0xffffff);
									int i_91_ = (i_89_ & 0xff00) * i_85_ & 0xff0000;
									int i_92_ = (i_89_ & 0xff) * i_86_ & 0xff00;
									i_89_ = (i_90_ | i_91_ | i_92_) >>> 8;
									int i_93_ = is[i_5_];
									int i_94_ = i_89_ + i_93_;
									int i_95_ = ((i_89_ & 0xff00ff) + (i_93_ & 0xff00ff));
									i_93_ = (i_95_ & 0x1000100) + (i_94_ - i_95_ & 0x10000);
									is[i_5_++] = i_94_ - i_93_ | i_93_ - (i_93_ >>> 8);
								} else
									i_5_++;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 3) {
						for (int i_96_ = -i_7_; i_96_ < 0; i_96_++) {
							for (int i_97_ = -i_8_; i_97_ < 0; i_97_++) {
								int i_98_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								int i_99_ = i_98_ + i_2_;
								int i_100_ = (i_98_ & 0xff00ff) + (i_2_ & 0xff00ff);
								int i_101_ = ((i_100_ & 0x1000100) + (i_99_ - i_100_ & 0x10000));
								i_98_ = i_99_ - i_101_ | i_101_ - (i_101_ >>> 8);
								i_101_ = is[i_5_];
								i_99_ = i_98_ + i_101_;
								i_100_ = (i_98_ & 0xff00ff) + (i_101_ & 0xff00ff);
								i_101_ = (i_100_ & 0x1000100) + (i_99_ - i_100_ & 0x10000);
								is[i_5_++] = i_99_ - i_101_ | i_101_ - (i_101_ >>> 8);
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else if (i_1_ == 2) {
						int i_102_ = i_2_ >>> 24;
						int i_103_ = 256 - i_102_;
						int i_104_ = (i_2_ & 0xff00ff) * i_103_ & ~0xff00ff;
						int i_105_ = (i_2_ & 0xff00) * i_103_ & 0xff0000;
						i_2_ = (i_104_ | i_105_) >>> 8;
						for (int i_106_ = -i_7_; i_106_ < 0; i_106_++) {
							for (int i_107_ = -i_8_; i_107_ < 0; i_107_++) {
								int i_108_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_6_++]);
								if (i_108_ != 0) {
									i_104_ = ((i_108_ & 0xff00ff) * i_102_ & ~0xff00ff);
									i_105_ = ((i_108_ & 0xff00) * i_102_ & 0xff0000);
									i_108_ = ((i_104_ | i_105_) >>> 8) + i_2_;
									int i_109_ = is[i_5_];
									int i_110_ = i_108_ + i_109_;
									int i_111_ = ((i_108_ & 0xff00ff) + (i_109_ & 0xff00ff));
									i_109_ = ((i_111_ & 0x1000100) + (i_110_ - i_111_ & 0x10000));
									is[i_5_++] = i_110_ - i_109_ | i_109_ - (i_109_ >>> 8);
								} else
									i_5_++;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	Class57_Sub1_Sub2(Class_ra_Sub1 class_ra_sub1, int[] is, int i, int i_112_, int i_113_, int i_114_, boolean bool) {
		super(class_ra_sub1, i_113_, i_114_);
		if (bool)
			((Class57_Sub1_Sub2) this).anIntArray9966 = new int[i_113_ * i_114_];
		else
			((Class57_Sub1_Sub2) this).anIntArray9966 = is;
		i_112_ -= ((Class57_Sub1_Sub2) this).anInt9010;
		int i_115_ = 0;
		for (int i_116_ = 0; i_116_ < i_114_; i_116_++) {
			for (int i_117_ = 0; i_117_ < i_113_; i_117_++) {
				int i_118_ = is[i++];
				if (i_118_ >>> 24 == 255)
					((Class57_Sub1_Sub2) this).anIntArray9966[i_115_++] = (i_118_ & 0xffffff) == 0 ? -16777215 : i_118_;
				else
					((Class57_Sub1_Sub2) this).anIntArray9966[i_115_++] = 0;
			}
			i += i_112_;
		}
	}

	void method651(int i, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_) {
		if (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (i_120_ > 0 && i_121_ > 0) {
			int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
			if (is != null) {
				int i_126_ = 0;
				int i_127_ = 0;
				int i_128_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
				int i_129_ = (((Class57_Sub1_Sub2) this).anInt8990 + ((Class57_Sub1_Sub2) this).anInt9010 + ((Class57_Sub1_Sub2) this).anInt8997);
				int i_130_ = (((Class57_Sub1_Sub2) this).anInt9000 + ((Class57_Sub1_Sub2) this).anInt8989 + ((Class57_Sub1_Sub2) this).anInt8993);
				int i_131_ = (i_129_ << 16) / i_120_;
				int i_132_ = (i_130_ << 16) / i_121_;
				if (((Class57_Sub1_Sub2) this).anInt8990 > 0) {
					int i_133_ = (((((Class57_Sub1_Sub2) this).anInt8990 << 16) + i_131_ - 1) / i_131_);
					i += i_133_;
					i_126_ += (i_133_ * i_131_ - (((Class57_Sub1_Sub2) this).anInt8990 << 16));
				}
				if (((Class57_Sub1_Sub2) this).anInt9000 > 0) {
					int i_134_ = (((((Class57_Sub1_Sub2) this).anInt9000 << 16) + i_132_ - 1) / i_132_);
					i_119_ += i_134_;
					i_127_ += (i_134_ * i_132_ - (((Class57_Sub1_Sub2) this).anInt9000 << 16));
				}
				if (((Class57_Sub1_Sub2) this).anInt9010 < i_129_)
					i_120_ = ((((Class57_Sub1_Sub2) this).anInt9010 << 16) - i_126_ + i_131_ - 1) / i_131_;
				if (((Class57_Sub1_Sub2) this).anInt8989 < i_130_)
					i_121_ = ((((Class57_Sub1_Sub2) this).anInt8989 << 16) - i_127_ + i_132_ - 1) / i_132_;
				int i_135_ = i + i_119_ * i_128_;
				int i_136_ = i_128_ - i_120_;
				if (i_119_ + i_121_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7977 * 63686679))
					i_121_ -= (i_119_ + i_121_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7977) * 63686679);
				if (i_119_ < (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805) {
					int i_137_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_119_);
					i_121_ -= i_137_;
					i_135_ += i_137_ * i_128_;
					i_127_ += i_132_ * i_137_;
				}
				if (i + i_120_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725) {
					int i_138_ = (i + i_120_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725);
					i_120_ -= i_138_;
					i_136_ += i_138_;
				}
				if (i < (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7974 * -912871679)) {
					int i_139_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
					i_120_ -= i_139_;
					i_135_ += i_139_;
					i_126_ += i_131_ * i_139_;
					i_136_ += i_139_;
				}
				if (i_124_ == 0) {
					if (i_122_ == 1) {
						int i_140_ = i_126_;
						for (int i_141_ = -i_121_; i_141_ < 0; i_141_++) {
							int i_142_ = ((i_127_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_143_ = -i_120_; i_143_ < 0; i_143_++) {
								is[i_135_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_126_ >> 16) + i_142_]);
								i_126_ += i_131_;
							}
							i_127_ += i_132_;
							i_126_ = i_140_;
							i_135_ += i_136_;
						}
					} else if (i_122_ == 0) {
						int i_144_ = (i_123_ & 0xff0000) >> 16;
						int i_145_ = (i_123_ & 0xff00) >> 8;
						int i_146_ = i_123_ & 0xff;
						int i_147_ = i_126_;
						for (int i_148_ = -i_121_; i_148_ < 0; i_148_++) {
							int i_149_ = ((i_127_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_150_ = -i_120_; i_150_ < 0; i_150_++) {
								int i_151_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_126_ >> 16) + i_149_]);
								int i_152_ = (i_151_ & 0xff0000) * i_144_ & ~0xffffff;
								int i_153_ = (i_151_ & 0xff00) * i_145_ & 0xff0000;
								int i_154_ = (i_151_ & 0xff) * i_146_ & 0xff00;
								is[i_135_++] = (i_152_ | i_153_ | i_154_) >>> 8;
								i_126_ += i_131_;
							}
							i_127_ += i_132_;
							i_126_ = i_147_;
							i_135_ += i_136_;
						}
					} else if (i_122_ == 3) {
						int i_155_ = i_126_;
						for (int i_156_ = -i_121_; i_156_ < 0; i_156_++) {
							int i_157_ = ((i_127_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_158_ = -i_120_; i_158_ < 0; i_158_++) {
								int i_159_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_126_ >> 16) + i_157_]);
								int i_160_ = i_159_ + i_123_;
								int i_161_ = ((i_159_ & 0xff00ff) + (i_123_ & 0xff00ff));
								int i_162_ = ((i_161_ & 0x1000100) + (i_160_ - i_161_ & 0x10000));
								is[i_135_++] = i_160_ - i_162_ | i_162_ - (i_162_ >>> 8);
								i_126_ += i_131_;
							}
							i_127_ += i_132_;
							i_126_ = i_155_;
							i_135_ += i_136_;
						}
					} else if (i_122_ == 2) {
						int i_163_ = i_123_ >>> 24;
						int i_164_ = 256 - i_163_;
						int i_165_ = (i_123_ & 0xff00ff) * i_164_ & ~0xff00ff;
						int i_166_ = (i_123_ & 0xff00) * i_164_ & 0xff0000;
						i_123_ = (i_165_ | i_166_) >>> 8;
						int i_167_ = i_126_;
						for (int i_168_ = -i_121_; i_168_ < 0; i_168_++) {
							int i_169_ = ((i_127_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_170_ = -i_120_; i_170_ < 0; i_170_++) {
								int i_171_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_126_ >> 16) + i_169_]);
								i_165_ = (i_171_ & 0xff00ff) * i_163_ & ~0xff00ff;
								i_166_ = (i_171_ & 0xff00) * i_163_ & 0xff0000;
								is[i_135_++] = ((i_165_ | i_166_) >>> 8) + i_123_;
								i_126_ += i_131_;
							}
							i_127_ += i_132_;
							i_126_ = i_167_;
							i_135_ += i_136_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_124_ == 1) {
					if (i_122_ == 1) {
						int i_172_ = i_126_;
						for (int i_173_ = -i_121_; i_173_ < 0; i_173_++) {
							int i_174_ = ((i_127_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_175_ = -i_120_; i_175_ < 0; i_175_++) {
								int i_176_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_126_ >> 16) + i_174_]);
								if (i_176_ != 0)
									is[i_135_++] = i_176_;
								else
									i_135_++;
								i_126_ += i_131_;
							}
							i_127_ += i_132_;
							i_126_ = i_172_;
							i_135_ += i_136_;
						}
					} else if (i_122_ == 0) {
						int i_177_ = i_126_;
						if ((i_123_ & 0xffffff) == 16777215) {
							int i_178_ = i_123_ >>> 24;
							int i_179_ = 256 - i_178_;
							for (int i_180_ = -i_121_; i_180_ < 0; i_180_++) {
								int i_181_ = ((i_127_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
								for (int i_182_ = -i_120_; i_182_ < 0; i_182_++) {
									int i_183_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_126_ >> 16) + i_181_]);
									if (i_183_ != 0) {
										int i_184_ = is[i_135_];
										is[i_135_++] = ((((i_183_ & 0xff00ff) * i_178_ + ((i_184_ & 0xff00ff) * i_179_)) & ~0xff00ff) + (((i_183_ & 0xff00) * i_178_ + ((i_184_ & 0xff00) * i_179_)) & 0xff0000)) >> 8;
									} else
										i_135_++;
									i_126_ += i_131_;
								}
								i_127_ += i_132_;
								i_126_ = i_177_;
								i_135_ += i_136_;
							}
						} else {
							int i_185_ = (i_123_ & 0xff0000) >> 16;
							int i_186_ = (i_123_ & 0xff00) >> 8;
							int i_187_ = i_123_ & 0xff;
							int i_188_ = i_123_ >>> 24;
							int i_189_ = 256 - i_188_;
							for (int i_190_ = -i_121_; i_190_ < 0; i_190_++) {
								int i_191_ = ((i_127_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
								for (int i_192_ = -i_120_; i_192_ < 0; i_192_++) {
									int i_193_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_126_ >> 16) + i_191_]);
									if (i_193_ != 0) {
										if (i_188_ != 255) {
											int i_194_ = ((i_193_ & 0xff0000) * i_185_ & ~0xffffff);
											int i_195_ = ((i_193_ & 0xff00) * i_186_ & 0xff0000);
											int i_196_ = ((i_193_ & 0xff) * i_187_ & 0xff00);
											i_193_ = (i_194_ | i_195_ | i_196_) >>> 8;
											int i_197_ = is[i_135_];
											is[i_135_++] = (((((i_193_ & 0xff00ff) * i_188_) + ((i_197_ & 0xff00ff) * i_189_)) & ~0xff00ff) + ((((i_193_ & 0xff00) * i_188_) + ((i_197_ & 0xff00) * i_189_)) & 0xff0000)) >> 8;
										} else {
											int i_198_ = ((i_193_ & 0xff0000) * i_185_ & ~0xffffff);
											int i_199_ = ((i_193_ & 0xff00) * i_186_ & 0xff0000);
											int i_200_ = ((i_193_ & 0xff) * i_187_ & 0xff00);
											is[i_135_++] = (i_198_ | i_199_ | i_200_) >>> 8;
										}
									} else
										i_135_++;
									i_126_ += i_131_;
								}
								i_127_ += i_132_;
								i_126_ = i_177_;
								i_135_ += i_136_;
							}
						}
					} else if (i_122_ == 3) {
						int i_201_ = i_126_;
						int i_202_ = i_123_ >>> 24;
						int i_203_ = 256 - i_202_;
						for (int i_204_ = -i_121_; i_204_ < 0; i_204_++) {
							int i_205_ = ((i_127_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_206_ = -i_120_; i_206_ < 0; i_206_++) {
								int i_207_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_126_ >> 16) + i_205_]);
								int i_208_ = i_207_ + i_123_;
								int i_209_ = ((i_207_ & 0xff00ff) + (i_123_ & 0xff00ff));
								int i_210_ = ((i_209_ & 0x1000100) + (i_208_ - i_209_ & 0x10000));
								i_210_ = i_208_ - i_210_ | i_210_ - (i_210_ >>> 8);
								if (i_207_ == 0 && i_202_ != 255) {
									i_207_ = i_210_;
									i_210_ = is[i_135_];
									i_210_ = ((((i_207_ & 0xff00ff) * i_202_ + (i_210_ & 0xff00ff) * i_203_) & ~0xff00ff) + (((i_207_ & 0xff00) * i_202_ + (i_210_ & 0xff00) * i_203_) & 0xff0000)) >> 8;
								}
								is[i_135_++] = i_210_;
								i_126_ += i_131_;
							}
							i_127_ += i_132_;
							i_126_ = i_201_;
							i_135_ += i_136_;
						}
					} else if (i_122_ == 2) {
						int i_211_ = i_123_ >>> 24;
						int i_212_ = 256 - i_211_;
						int i_213_ = (i_123_ & 0xff00ff) * i_212_ & ~0xff00ff;
						int i_214_ = (i_123_ & 0xff00) * i_212_ & 0xff0000;
						i_123_ = (i_213_ | i_214_) >>> 8;
						int i_215_ = i_126_;
						for (int i_216_ = -i_121_; i_216_ < 0; i_216_++) {
							int i_217_ = ((i_127_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_218_ = -i_120_; i_218_ < 0; i_218_++) {
								int i_219_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_126_ >> 16) + i_217_]);
								if (i_219_ != 0) {
									i_213_ = ((i_219_ & 0xff00ff) * i_211_ & ~0xff00ff);
									i_214_ = ((i_219_ & 0xff00) * i_211_ & 0xff0000);
									is[i_135_++] = ((i_213_ | i_214_) >>> 8) + i_123_;
								} else
									i_135_++;
								i_126_ += i_131_;
							}
							i_127_ += i_132_;
							i_126_ = i_215_;
							i_135_ += i_136_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_124_ == 2) {
					if (i_122_ == 1) {
						int i_220_ = i_126_;
						for (int i_221_ = -i_121_; i_221_ < 0; i_221_++) {
							int i_222_ = ((i_127_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_223_ = -i_120_; i_223_ < 0; i_223_++) {
								int i_224_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_126_ >> 16) + i_222_]);
								if (i_224_ != 0) {
									int i_225_ = is[i_135_];
									int i_226_ = i_224_ + i_225_;
									int i_227_ = ((i_224_ & 0xff00ff) + (i_225_ & 0xff00ff));
									i_225_ = ((i_227_ & 0x1000100) + (i_226_ - i_227_ & 0x10000));
									is[i_135_++] = i_226_ - i_225_ | i_225_ - (i_225_ >>> 8);
								} else
									i_135_++;
								i_126_ += i_131_;
							}
							i_127_ += i_132_;
							i_126_ = i_220_;
							i_135_ += i_136_;
						}
					} else if (i_122_ == 0) {
						int i_228_ = i_126_;
						int i_229_ = (i_123_ & 0xff0000) >> 16;
						int i_230_ = (i_123_ & 0xff00) >> 8;
						int i_231_ = i_123_ & 0xff;
						for (int i_232_ = -i_121_; i_232_ < 0; i_232_++) {
							int i_233_ = ((i_127_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_234_ = -i_120_; i_234_ < 0; i_234_++) {
								int i_235_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_126_ >> 16) + i_233_]);
								if (i_235_ != 0) {
									int i_236_ = ((i_235_ & 0xff0000) * i_229_ & ~0xffffff);
									int i_237_ = ((i_235_ & 0xff00) * i_230_ & 0xff0000);
									int i_238_ = (i_235_ & 0xff) * i_231_ & 0xff00;
									i_235_ = (i_236_ | i_237_ | i_238_) >>> 8;
									int i_239_ = is[i_135_];
									int i_240_ = i_235_ + i_239_;
									int i_241_ = ((i_235_ & 0xff00ff) + (i_239_ & 0xff00ff));
									i_239_ = ((i_241_ & 0x1000100) + (i_240_ - i_241_ & 0x10000));
									is[i_135_++] = i_240_ - i_239_ | i_239_ - (i_239_ >>> 8);
								} else
									i_135_++;
								i_126_ += i_131_;
							}
							i_127_ += i_132_;
							i_126_ = i_228_;
							i_135_ += i_136_;
						}
					} else if (i_122_ == 3) {
						int i_242_ = i_126_;
						for (int i_243_ = -i_121_; i_243_ < 0; i_243_++) {
							int i_244_ = ((i_127_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_245_ = -i_120_; i_245_ < 0; i_245_++) {
								int i_246_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_126_ >> 16) + i_244_]);
								int i_247_ = i_246_ + i_123_;
								int i_248_ = ((i_246_ & 0xff00ff) + (i_123_ & 0xff00ff));
								int i_249_ = ((i_248_ & 0x1000100) + (i_247_ - i_248_ & 0x10000));
								i_246_ = i_247_ - i_249_ | i_249_ - (i_249_ >>> 8);
								i_249_ = is[i_135_];
								i_247_ = i_246_ + i_249_;
								i_248_ = (i_246_ & 0xff00ff) + (i_249_ & 0xff00ff);
								i_249_ = (i_248_ & 0x1000100) + (i_247_ - i_248_ & 0x10000);
								is[i_135_++] = i_247_ - i_249_ | i_249_ - (i_249_ >>> 8);
								i_126_ += i_131_;
							}
							i_127_ += i_132_;
							i_126_ = i_242_;
							i_135_ += i_136_;
						}
					} else if (i_122_ == 2) {
						int i_250_ = i_123_ >>> 24;
						int i_251_ = 256 - i_250_;
						int i_252_ = (i_123_ & 0xff00ff) * i_251_ & ~0xff00ff;
						int i_253_ = (i_123_ & 0xff00) * i_251_ & 0xff0000;
						i_123_ = (i_252_ | i_253_) >>> 8;
						int i_254_ = i_126_;
						for (int i_255_ = -i_121_; i_255_ < 0; i_255_++) {
							int i_256_ = ((i_127_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_257_ = -i_120_; i_257_ < 0; i_257_++) {
								int i_258_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_126_ >> 16) + i_256_]);
								if (i_258_ != 0) {
									i_252_ = ((i_258_ & 0xff00ff) * i_250_ & ~0xff00ff);
									i_253_ = ((i_258_ & 0xff00) * i_250_ & 0xff0000);
									i_258_ = ((i_252_ | i_253_) >>> 8) + i_123_;
									int i_259_ = is[i_135_];
									int i_260_ = i_258_ + i_259_;
									int i_261_ = ((i_258_ & 0xff00ff) + (i_259_ & 0xff00ff));
									i_259_ = ((i_261_ & 0x1000100) + (i_260_ - i_261_ & 0x10000));
									is[i_135_++] = i_260_ - i_259_ | i_259_ - (i_259_ >>> 8);
								} else
									i_135_++;
								i_126_ += i_131_;
							}
							i_127_ += i_132_;
							i_126_ = i_254_;
							i_135_ += i_136_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method675(int i, int i_262_, int i_263_, int i_264_, int i_265_, int i_266_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_267_ = 0; i_267_ < i_264_; i_267_++) {
			int i_268_ = (i_262_ + i_267_) * ((Class57_Sub1_Sub2) this).anInt9010 + i;
			int i_269_ = ((i_266_ + i_267_) * (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883)) + i_265_;
			for (int i_270_ = 0; i_270_ < i_263_; i_270_++)
				((Class57_Sub1_Sub2) this).anIntArray9966[i_268_ + i_270_] = is[i_269_ + i_270_];
		}
	}

	Class57_Sub1_Sub2(Class_ra_Sub1 class_ra_sub1, int i, int i_271_) {
		super(class_ra_sub1, i, i_271_);
		((Class57_Sub1_Sub2) this).anIntArray9966 = new int[i * i_271_];
	}

	public Interface8_Impl1_Impl1 method627() {
		return new Class24(((Class57_Sub1_Sub2) this).anInt9010, ((Class57_Sub1_Sub2) this).anInt8989, ((Class57_Sub1_Sub2) this).anIntArray9966);
	}

	public void method628(int i, int i_272_, int i_273_) {
		throw new IllegalStateException("");
	}

	public void method654(int i, int i_274_, Class_ta class_ta, int i_275_, int i_276_) {
		if (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			i += ((Class57_Sub1_Sub2) this).anInt8990;
			i_274_ += ((Class57_Sub1_Sub2) this).anInt9000;
			int i_277_ = 0;
			int i_278_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			int i_279_ = ((Class57_Sub1_Sub2) this).anInt9010;
			int i_280_ = ((Class57_Sub1_Sub2) this).anInt8989;
			int i_281_ = i_278_ - i_279_;
			int i_282_ = 0;
			int i_283_ = i + i_274_ * i_278_;
			if (i_274_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_284_ = ((((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805 - i_274_);
				i_280_ -= i_284_;
				i_274_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_277_ += i_284_ * i_279_;
				i_283_ += i_284_ * i_278_;
			}
			if (i_274_ + i_280_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7977) * 63686679)
				i_280_ -= (i_274_ + i_280_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_285_ = ((((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974) * -912871679 - i);
				i_279_ -= i_285_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_277_ += i_285_;
				i_283_ += i_285_;
				i_282_ += i_285_;
				i_281_ += i_285_;
			}
			if (i + i_279_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_286_ = (i + i_279_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_279_ -= i_286_;
				i_282_ += i_286_;
				i_281_ += i_286_;
			}
			if (i_279_ > 0 && i_280_ > 0) {
				Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
				int[] is_287_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
				int[] is_288_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
				int i_289_ = i_274_;
				if (i_276_ > i_289_) {
					i_289_ = i_276_;
					i_283_ += (i_276_ - i_274_) * i_278_;
					i_277_ += ((i_276_ - i_274_) * ((Class57_Sub1_Sub2) this).anInt9010);
				}
				int i_290_ = (i_276_ + is_287_.length < i_274_ + i_280_ ? i_276_ + is_287_.length : i_274_ + i_280_);
				for (int i_291_ = i_289_; i_291_ < i_290_; i_291_++) {
					int i_292_ = is_287_[i_291_ - i_276_] + i_275_;
					int i_293_ = is_288_[i_291_ - i_276_];
					int i_294_ = i_279_;
					if (i > i_292_) {
						int i_295_ = i - i_292_;
						if (i_295_ >= i_293_) {
							i_277_ += i_279_ + i_282_;
							i_283_ += i_279_ + i_281_;
							continue;
						}
						i_293_ -= i_295_;
					} else {
						int i_296_ = i_292_ - i;
						if (i_296_ >= i_279_) {
							i_277_ += i_279_ + i_282_;
							i_283_ += i_279_ + i_281_;
							continue;
						}
						i_277_ += i_296_;
						i_294_ -= i_296_;
						i_283_ += i_296_;
					}
					int i_297_ = 0;
					if (i_294_ < i_293_)
						i_293_ = i_294_;
					else
						i_297_ = i_294_ - i_293_;
					for (int i_298_ = -i_293_; i_298_ < 0; i_298_++) {
						int i_299_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_277_++]);
						if (i_299_ != 0)
							is[i_283_++] = i_299_;
						else
							i_283_++;
					}
					i_277_ += i_297_ + i_282_;
					i_283_ += i_297_ + i_281_;
				}
			}
		}
	}

	void method635(int i, int i_300_, int i_301_, int i_302_, int i_303_, int i_304_, int i_305_, int i_306_) {
		if (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (i_301_ > 0 && i_302_ > 0) {
			int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
			if (is != null) {
				int i_307_ = 0;
				int i_308_ = 0;
				int i_309_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
				int i_310_ = (((Class57_Sub1_Sub2) this).anInt8990 + ((Class57_Sub1_Sub2) this).anInt9010 + ((Class57_Sub1_Sub2) this).anInt8997);
				int i_311_ = (((Class57_Sub1_Sub2) this).anInt9000 + ((Class57_Sub1_Sub2) this).anInt8989 + ((Class57_Sub1_Sub2) this).anInt8993);
				int i_312_ = (i_310_ << 16) / i_301_;
				int i_313_ = (i_311_ << 16) / i_302_;
				if (((Class57_Sub1_Sub2) this).anInt8990 > 0) {
					int i_314_ = (((((Class57_Sub1_Sub2) this).anInt8990 << 16) + i_312_ - 1) / i_312_);
					i += i_314_;
					i_307_ += (i_314_ * i_312_ - (((Class57_Sub1_Sub2) this).anInt8990 << 16));
				}
				if (((Class57_Sub1_Sub2) this).anInt9000 > 0) {
					int i_315_ = (((((Class57_Sub1_Sub2) this).anInt9000 << 16) + i_313_ - 1) / i_313_);
					i_300_ += i_315_;
					i_308_ += (i_315_ * i_313_ - (((Class57_Sub1_Sub2) this).anInt9000 << 16));
				}
				if (((Class57_Sub1_Sub2) this).anInt9010 < i_310_)
					i_301_ = ((((Class57_Sub1_Sub2) this).anInt9010 << 16) - i_307_ + i_312_ - 1) / i_312_;
				if (((Class57_Sub1_Sub2) this).anInt8989 < i_311_)
					i_302_ = ((((Class57_Sub1_Sub2) this).anInt8989 << 16) - i_308_ + i_313_ - 1) / i_313_;
				int i_316_ = i + i_300_ * i_309_;
				int i_317_ = i_309_ - i_301_;
				if (i_300_ + i_302_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7977 * 63686679))
					i_302_ -= (i_300_ + i_302_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7977) * 63686679);
				if (i_300_ < (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805) {
					int i_318_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_300_);
					i_302_ -= i_318_;
					i_316_ += i_318_ * i_309_;
					i_308_ += i_313_ * i_318_;
				}
				if (i + i_301_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725) {
					int i_319_ = (i + i_301_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725);
					i_301_ -= i_319_;
					i_317_ += i_319_;
				}
				if (i < (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7974 * -912871679)) {
					int i_320_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
					i_301_ -= i_320_;
					i_316_ += i_320_;
					i_307_ += i_312_ * i_320_;
					i_317_ += i_320_;
				}
				if (i_305_ == 0) {
					if (i_303_ == 1) {
						int i_321_ = i_307_;
						for (int i_322_ = -i_302_; i_322_ < 0; i_322_++) {
							int i_323_ = ((i_308_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_324_ = -i_301_; i_324_ < 0; i_324_++) {
								is[i_316_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_307_ >> 16) + i_323_]);
								i_307_ += i_312_;
							}
							i_308_ += i_313_;
							i_307_ = i_321_;
							i_316_ += i_317_;
						}
					} else if (i_303_ == 0) {
						int i_325_ = (i_304_ & 0xff0000) >> 16;
						int i_326_ = (i_304_ & 0xff00) >> 8;
						int i_327_ = i_304_ & 0xff;
						int i_328_ = i_307_;
						for (int i_329_ = -i_302_; i_329_ < 0; i_329_++) {
							int i_330_ = ((i_308_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_331_ = -i_301_; i_331_ < 0; i_331_++) {
								int i_332_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_307_ >> 16) + i_330_]);
								int i_333_ = (i_332_ & 0xff0000) * i_325_ & ~0xffffff;
								int i_334_ = (i_332_ & 0xff00) * i_326_ & 0xff0000;
								int i_335_ = (i_332_ & 0xff) * i_327_ & 0xff00;
								is[i_316_++] = (i_333_ | i_334_ | i_335_) >>> 8;
								i_307_ += i_312_;
							}
							i_308_ += i_313_;
							i_307_ = i_328_;
							i_316_ += i_317_;
						}
					} else if (i_303_ == 3) {
						int i_336_ = i_307_;
						for (int i_337_ = -i_302_; i_337_ < 0; i_337_++) {
							int i_338_ = ((i_308_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_339_ = -i_301_; i_339_ < 0; i_339_++) {
								int i_340_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_307_ >> 16) + i_338_]);
								int i_341_ = i_340_ + i_304_;
								int i_342_ = ((i_340_ & 0xff00ff) + (i_304_ & 0xff00ff));
								int i_343_ = ((i_342_ & 0x1000100) + (i_341_ - i_342_ & 0x10000));
								is[i_316_++] = i_341_ - i_343_ | i_343_ - (i_343_ >>> 8);
								i_307_ += i_312_;
							}
							i_308_ += i_313_;
							i_307_ = i_336_;
							i_316_ += i_317_;
						}
					} else if (i_303_ == 2) {
						int i_344_ = i_304_ >>> 24;
						int i_345_ = 256 - i_344_;
						int i_346_ = (i_304_ & 0xff00ff) * i_345_ & ~0xff00ff;
						int i_347_ = (i_304_ & 0xff00) * i_345_ & 0xff0000;
						i_304_ = (i_346_ | i_347_) >>> 8;
						int i_348_ = i_307_;
						for (int i_349_ = -i_302_; i_349_ < 0; i_349_++) {
							int i_350_ = ((i_308_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_351_ = -i_301_; i_351_ < 0; i_351_++) {
								int i_352_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_307_ >> 16) + i_350_]);
								i_346_ = (i_352_ & 0xff00ff) * i_344_ & ~0xff00ff;
								i_347_ = (i_352_ & 0xff00) * i_344_ & 0xff0000;
								is[i_316_++] = ((i_346_ | i_347_) >>> 8) + i_304_;
								i_307_ += i_312_;
							}
							i_308_ += i_313_;
							i_307_ = i_348_;
							i_316_ += i_317_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_305_ == 1) {
					if (i_303_ == 1) {
						int i_353_ = i_307_;
						for (int i_354_ = -i_302_; i_354_ < 0; i_354_++) {
							int i_355_ = ((i_308_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_356_ = -i_301_; i_356_ < 0; i_356_++) {
								int i_357_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_307_ >> 16) + i_355_]);
								if (i_357_ != 0)
									is[i_316_++] = i_357_;
								else
									i_316_++;
								i_307_ += i_312_;
							}
							i_308_ += i_313_;
							i_307_ = i_353_;
							i_316_ += i_317_;
						}
					} else if (i_303_ == 0) {
						int i_358_ = i_307_;
						if ((i_304_ & 0xffffff) == 16777215) {
							int i_359_ = i_304_ >>> 24;
							int i_360_ = 256 - i_359_;
							for (int i_361_ = -i_302_; i_361_ < 0; i_361_++) {
								int i_362_ = ((i_308_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
								for (int i_363_ = -i_301_; i_363_ < 0; i_363_++) {
									int i_364_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_307_ >> 16) + i_362_]);
									if (i_364_ != 0) {
										int i_365_ = is[i_316_];
										is[i_316_++] = ((((i_364_ & 0xff00ff) * i_359_ + ((i_365_ & 0xff00ff) * i_360_)) & ~0xff00ff) + (((i_364_ & 0xff00) * i_359_ + ((i_365_ & 0xff00) * i_360_)) & 0xff0000)) >> 8;
									} else
										i_316_++;
									i_307_ += i_312_;
								}
								i_308_ += i_313_;
								i_307_ = i_358_;
								i_316_ += i_317_;
							}
						} else {
							int i_366_ = (i_304_ & 0xff0000) >> 16;
							int i_367_ = (i_304_ & 0xff00) >> 8;
							int i_368_ = i_304_ & 0xff;
							int i_369_ = i_304_ >>> 24;
							int i_370_ = 256 - i_369_;
							for (int i_371_ = -i_302_; i_371_ < 0; i_371_++) {
								int i_372_ = ((i_308_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
								for (int i_373_ = -i_301_; i_373_ < 0; i_373_++) {
									int i_374_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_307_ >> 16) + i_372_]);
									if (i_374_ != 0) {
										if (i_369_ != 255) {
											int i_375_ = ((i_374_ & 0xff0000) * i_366_ & ~0xffffff);
											int i_376_ = ((i_374_ & 0xff00) * i_367_ & 0xff0000);
											int i_377_ = ((i_374_ & 0xff) * i_368_ & 0xff00);
											i_374_ = (i_375_ | i_376_ | i_377_) >>> 8;
											int i_378_ = is[i_316_];
											is[i_316_++] = (((((i_374_ & 0xff00ff) * i_369_) + ((i_378_ & 0xff00ff) * i_370_)) & ~0xff00ff) + ((((i_374_ & 0xff00) * i_369_) + ((i_378_ & 0xff00) * i_370_)) & 0xff0000)) >> 8;
										} else {
											int i_379_ = ((i_374_ & 0xff0000) * i_366_ & ~0xffffff);
											int i_380_ = ((i_374_ & 0xff00) * i_367_ & 0xff0000);
											int i_381_ = ((i_374_ & 0xff) * i_368_ & 0xff00);
											is[i_316_++] = (i_379_ | i_380_ | i_381_) >>> 8;
										}
									} else
										i_316_++;
									i_307_ += i_312_;
								}
								i_308_ += i_313_;
								i_307_ = i_358_;
								i_316_ += i_317_;
							}
						}
					} else if (i_303_ == 3) {
						int i_382_ = i_307_;
						int i_383_ = i_304_ >>> 24;
						int i_384_ = 256 - i_383_;
						for (int i_385_ = -i_302_; i_385_ < 0; i_385_++) {
							int i_386_ = ((i_308_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_387_ = -i_301_; i_387_ < 0; i_387_++) {
								int i_388_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_307_ >> 16) + i_386_]);
								int i_389_ = i_388_ + i_304_;
								int i_390_ = ((i_388_ & 0xff00ff) + (i_304_ & 0xff00ff));
								int i_391_ = ((i_390_ & 0x1000100) + (i_389_ - i_390_ & 0x10000));
								i_391_ = i_389_ - i_391_ | i_391_ - (i_391_ >>> 8);
								if (i_388_ == 0 && i_383_ != 255) {
									i_388_ = i_391_;
									i_391_ = is[i_316_];
									i_391_ = ((((i_388_ & 0xff00ff) * i_383_ + (i_391_ & 0xff00ff) * i_384_) & ~0xff00ff) + (((i_388_ & 0xff00) * i_383_ + (i_391_ & 0xff00) * i_384_) & 0xff0000)) >> 8;
								}
								is[i_316_++] = i_391_;
								i_307_ += i_312_;
							}
							i_308_ += i_313_;
							i_307_ = i_382_;
							i_316_ += i_317_;
						}
					} else if (i_303_ == 2) {
						int i_392_ = i_304_ >>> 24;
						int i_393_ = 256 - i_392_;
						int i_394_ = (i_304_ & 0xff00ff) * i_393_ & ~0xff00ff;
						int i_395_ = (i_304_ & 0xff00) * i_393_ & 0xff0000;
						i_304_ = (i_394_ | i_395_) >>> 8;
						int i_396_ = i_307_;
						for (int i_397_ = -i_302_; i_397_ < 0; i_397_++) {
							int i_398_ = ((i_308_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_399_ = -i_301_; i_399_ < 0; i_399_++) {
								int i_400_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_307_ >> 16) + i_398_]);
								if (i_400_ != 0) {
									i_394_ = ((i_400_ & 0xff00ff) * i_392_ & ~0xff00ff);
									i_395_ = ((i_400_ & 0xff00) * i_392_ & 0xff0000);
									is[i_316_++] = ((i_394_ | i_395_) >>> 8) + i_304_;
								} else
									i_316_++;
								i_307_ += i_312_;
							}
							i_308_ += i_313_;
							i_307_ = i_396_;
							i_316_ += i_317_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_305_ == 2) {
					if (i_303_ == 1) {
						int i_401_ = i_307_;
						for (int i_402_ = -i_302_; i_402_ < 0; i_402_++) {
							int i_403_ = ((i_308_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_404_ = -i_301_; i_404_ < 0; i_404_++) {
								int i_405_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_307_ >> 16) + i_403_]);
								if (i_405_ != 0) {
									int i_406_ = is[i_316_];
									int i_407_ = i_405_ + i_406_;
									int i_408_ = ((i_405_ & 0xff00ff) + (i_406_ & 0xff00ff));
									i_406_ = ((i_408_ & 0x1000100) + (i_407_ - i_408_ & 0x10000));
									is[i_316_++] = i_407_ - i_406_ | i_406_ - (i_406_ >>> 8);
								} else
									i_316_++;
								i_307_ += i_312_;
							}
							i_308_ += i_313_;
							i_307_ = i_401_;
							i_316_ += i_317_;
						}
					} else if (i_303_ == 0) {
						int i_409_ = i_307_;
						int i_410_ = (i_304_ & 0xff0000) >> 16;
						int i_411_ = (i_304_ & 0xff00) >> 8;
						int i_412_ = i_304_ & 0xff;
						for (int i_413_ = -i_302_; i_413_ < 0; i_413_++) {
							int i_414_ = ((i_308_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_415_ = -i_301_; i_415_ < 0; i_415_++) {
								int i_416_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_307_ >> 16) + i_414_]);
								if (i_416_ != 0) {
									int i_417_ = ((i_416_ & 0xff0000) * i_410_ & ~0xffffff);
									int i_418_ = ((i_416_ & 0xff00) * i_411_ & 0xff0000);
									int i_419_ = (i_416_ & 0xff) * i_412_ & 0xff00;
									i_416_ = (i_417_ | i_418_ | i_419_) >>> 8;
									int i_420_ = is[i_316_];
									int i_421_ = i_416_ + i_420_;
									int i_422_ = ((i_416_ & 0xff00ff) + (i_420_ & 0xff00ff));
									i_420_ = ((i_422_ & 0x1000100) + (i_421_ - i_422_ & 0x10000));
									is[i_316_++] = i_421_ - i_420_ | i_420_ - (i_420_ >>> 8);
								} else
									i_316_++;
								i_307_ += i_312_;
							}
							i_308_ += i_313_;
							i_307_ = i_409_;
							i_316_ += i_317_;
						}
					} else if (i_303_ == 3) {
						int i_423_ = i_307_;
						for (int i_424_ = -i_302_; i_424_ < 0; i_424_++) {
							int i_425_ = ((i_308_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_426_ = -i_301_; i_426_ < 0; i_426_++) {
								int i_427_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_307_ >> 16) + i_425_]);
								int i_428_ = i_427_ + i_304_;
								int i_429_ = ((i_427_ & 0xff00ff) + (i_304_ & 0xff00ff));
								int i_430_ = ((i_429_ & 0x1000100) + (i_428_ - i_429_ & 0x10000));
								i_427_ = i_428_ - i_430_ | i_430_ - (i_430_ >>> 8);
								i_430_ = is[i_316_];
								i_428_ = i_427_ + i_430_;
								i_429_ = (i_427_ & 0xff00ff) + (i_430_ & 0xff00ff);
								i_430_ = (i_429_ & 0x1000100) + (i_428_ - i_429_ & 0x10000);
								is[i_316_++] = i_428_ - i_430_ | i_430_ - (i_430_ >>> 8);
								i_307_ += i_312_;
							}
							i_308_ += i_313_;
							i_307_ = i_423_;
							i_316_ += i_317_;
						}
					} else if (i_303_ == 2) {
						int i_431_ = i_304_ >>> 24;
						int i_432_ = 256 - i_431_;
						int i_433_ = (i_304_ & 0xff00ff) * i_432_ & ~0xff00ff;
						int i_434_ = (i_304_ & 0xff00) * i_432_ & 0xff0000;
						i_304_ = (i_433_ | i_434_) >>> 8;
						int i_435_ = i_307_;
						for (int i_436_ = -i_302_; i_436_ < 0; i_436_++) {
							int i_437_ = ((i_308_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_438_ = -i_301_; i_438_ < 0; i_438_++) {
								int i_439_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_307_ >> 16) + i_437_]);
								if (i_439_ != 0) {
									i_433_ = ((i_439_ & 0xff00ff) * i_431_ & ~0xff00ff);
									i_434_ = ((i_439_ & 0xff00) * i_431_ & 0xff0000);
									i_439_ = ((i_433_ | i_434_) >>> 8) + i_304_;
									int i_440_ = is[i_316_];
									int i_441_ = i_439_ + i_440_;
									int i_442_ = ((i_439_ & 0xff00ff) + (i_440_ & 0xff00ff));
									i_440_ = ((i_442_ & 0x1000100) + (i_441_ - i_442_ & 0x10000));
									is[i_316_++] = i_441_ - i_440_ | i_440_ - (i_440_ >>> 8);
								} else
									i_316_++;
								i_307_ += i_312_;
							}
							i_308_ += i_313_;
							i_307_ = i_435_;
							i_316_ += i_317_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method678(boolean bool, boolean bool_443_, boolean bool_444_, int i, int i_445_, float f, int i_446_, int i_447_, int i_448_, int i_449_, int i_450_, int i_451_, boolean bool_452_) {
		if (i_446_ > 0 && i_447_ > 0 && (bool || bool_443_)) {
			int i_453_ = 0;
			int i_454_ = 0;
			int i_455_ = (((Class57_Sub1_Sub2) this).anInt8990 + ((Class57_Sub1_Sub2) this).anInt9010 + ((Class57_Sub1_Sub2) this).anInt8997);
			int i_456_ = (((Class57_Sub1_Sub2) this).anInt9000 + ((Class57_Sub1_Sub2) this).anInt8989 + ((Class57_Sub1_Sub2) this).anInt8993);
			int i_457_ = (i_455_ << 16) / i_446_;
			int i_458_ = (i_456_ << 16) / i_447_;
			if (((Class57_Sub1_Sub2) this).anInt8990 > 0) {
				int i_459_ = (((((Class57_Sub1_Sub2) this).anInt8990 << 16) + i_457_ - 1) / i_457_);
				i += i_459_;
				i_453_ += i_459_ * i_457_ - (((Class57_Sub1_Sub2) this).anInt8990 << 16);
			}
			if (((Class57_Sub1_Sub2) this).anInt9000 > 0) {
				int i_460_ = (((((Class57_Sub1_Sub2) this).anInt9000 << 16) + i_458_ - 1) / i_458_);
				i_445_ += i_460_;
				i_454_ += i_460_ * i_458_ - (((Class57_Sub1_Sub2) this).anInt9000 << 16);
			}
			if (((Class57_Sub1_Sub2) this).anInt9010 < i_455_)
				i_446_ = ((((Class57_Sub1_Sub2) this).anInt9010 << 16) - i_453_ + i_457_ - 1) / i_457_;
			if (((Class57_Sub1_Sub2) this).anInt8989 < i_456_)
				i_447_ = ((((Class57_Sub1_Sub2) this).anInt8989 << 16) - i_454_ + i_458_ - 1) / i_458_;
			int i_461_ = i + i_445_ * ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971) * 692106883);
			int i_462_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883) - i_446_);
			if (i_445_ + i_447_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7977) * 63686679)
				i_447_ -= (i_445_ + i_447_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i_445_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_463_ = ((((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805 - i_445_);
				i_447_ -= i_463_;
				i_461_ += i_463_ * ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971) * 692106883);
				i_454_ += i_458_ * i_463_;
			}
			if (i + i_446_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_464_ = (i + i_446_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_446_ -= i_464_;
				i_462_ += i_464_;
			}
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_465_ = ((((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974) * -912871679 - i);
				i_446_ -= i_465_;
				i_461_ += i_465_;
				i_453_ += i_457_ * i_465_;
				i_462_ += i_465_;
			}
			float[] fs = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).aFloatArray7973);
			int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
			if (i_450_ == 0) {
				if (i_448_ == 1) {
					int i_466_ = i_453_;
					for (int i_467_ = -i_447_; i_467_ < 0; i_467_++) {
						int i_468_ = ((i_454_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_469_ = -i_446_; i_469_ < 0; i_469_++) {
							if (!bool_443_ || f < fs[i_461_]) {
								if (bool)
									is[i_461_] = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_453_ >> 16) + i_468_]);
								if (bool_443_ && bool_452_)
									fs[i_461_] = f;
							}
							i_453_ += i_457_;
							i_461_++;
						}
						i_454_ += i_458_;
						i_453_ = i_466_;
						i_461_ += i_462_;
					}
				} else if (i_448_ == 0) {
					int i_470_ = (i_449_ & 0xff0000) >> 16;
					int i_471_ = (i_449_ & 0xff00) >> 8;
					int i_472_ = i_449_ & 0xff;
					int i_473_ = i_453_;
					for (int i_474_ = -i_447_; i_474_ < 0; i_474_++) {
						int i_475_ = ((i_454_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_476_ = -i_446_; i_476_ < 0; i_476_++) {
							if (!bool_443_ || f < fs[i_461_]) {
								if (bool) {
									int i_477_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_453_ >> 16) + i_475_]);
									int i_478_ = ((i_477_ & 0xff0000) * i_470_ & ~0xffffff);
									int i_479_ = ((i_477_ & 0xff00) * i_471_ & 0xff0000);
									int i_480_ = (i_477_ & 0xff) * i_472_ & 0xff00;
									is[i_461_] = (i_478_ | i_479_ | i_480_) >>> 8;
								}
								if (bool_443_ && bool_452_)
									fs[i_461_] = f;
							}
							i_453_ += i_457_;
							i_461_++;
						}
						i_454_ += i_458_;
						i_453_ = i_473_;
						i_461_ += i_462_;
					}
				} else if (i_448_ == 3) {
					int i_481_ = i_453_;
					for (int i_482_ = -i_447_; i_482_ < 0; i_482_++) {
						int i_483_ = ((i_454_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_484_ = -i_446_; i_484_ < 0; i_484_++) {
							if (!bool_443_ || f < fs[i_461_]) {
								if (bool) {
									int i_485_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_453_ >> 16) + i_483_]);
									int i_486_ = i_485_ + i_449_;
									int i_487_ = ((i_485_ & 0xff00ff) + (i_449_ & 0xff00ff));
									int i_488_ = ((i_487_ & 0x1000100) + (i_486_ - i_487_ & 0x10000));
									is[i_461_] = i_486_ - i_488_ | i_488_ - (i_488_ >>> 8);
								}
								if (bool_443_ && bool_452_)
									fs[i_461_] = f;
							}
							i_453_ += i_457_;
							i_461_++;
						}
						i_454_ += i_458_;
						i_453_ = i_481_;
						i_461_ += i_462_;
					}
				} else if (i_448_ == 2) {
					int i_489_ = i_449_ >>> 24;
					int i_490_ = 256 - i_489_;
					int i_491_ = (i_449_ & 0xff00ff) * i_490_ & ~0xff00ff;
					int i_492_ = (i_449_ & 0xff00) * i_490_ & 0xff0000;
					i_449_ = (i_491_ | i_492_) >>> 8;
					int i_493_ = i_453_;
					for (int i_494_ = -i_447_; i_494_ < 0; i_494_++) {
						int i_495_ = ((i_454_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_496_ = -i_446_; i_496_ < 0; i_496_++) {
							if (!bool_443_ || f < fs[i_461_]) {
								if (bool) {
									int i_497_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_453_ >> 16) + i_495_]);
									i_491_ = ((i_497_ & 0xff00ff) * i_489_ & ~0xff00ff);
									i_492_ = ((i_497_ & 0xff00) * i_489_ & 0xff0000);
									is[i_461_] = ((i_491_ | i_492_) >>> 8) + i_449_;
								}
								if (bool_443_ && bool_452_)
									fs[i_461_] = f;
							}
							i_453_ += i_457_;
							i_461_++;
						}
						i_454_ += i_458_;
						i_453_ = i_493_;
						i_461_ += i_462_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_450_ == 1) {
				if (i_448_ == 1) {
					int i_498_ = i_453_;
					for (int i_499_ = -i_447_; i_499_ < 0; i_499_++) {
						int i_500_ = ((i_454_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_501_ = -i_446_; i_501_ < 0; i_501_++) {
							if (!bool_443_ || f < fs[i_461_]) {
								int i_502_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_453_ >> 16) + i_500_]);
								if (i_502_ != 0) {
									if (bool)
										is[i_461_] = i_502_;
									if (bool_443_ && bool_452_)
										fs[i_461_] = f;
								}
							}
							i_453_ += i_457_;
							i_461_++;
						}
						i_454_ += i_458_;
						i_453_ = i_498_;
						i_461_ += i_462_;
					}
				} else if (i_448_ == 0) {
					int i_503_ = i_453_;
					if ((i_449_ & 0xffffff) == 16777215) {
						int i_504_ = i_449_ >>> 24;
						int i_505_ = 256 - i_504_;
						for (int i_506_ = -i_447_; i_506_ < 0; i_506_++) {
							int i_507_ = ((i_454_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_508_ = -i_446_; i_508_ < 0; i_508_++) {
								if (!bool_443_ || f < fs[i_461_]) {
									int i_509_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_453_ >> 16) + i_507_]);
									if (i_509_ != 0) {
										if (bool) {
											int i_510_ = is[i_461_];
											is[i_461_] = (((((i_509_ & 0xff00ff) * i_504_) + ((i_510_ & 0xff00ff) * i_505_)) & ~0xff00ff) + ((((i_509_ & 0xff00) * i_504_) + ((i_510_ & 0xff00) * i_505_)) & 0xff0000)) >> 8;
										}
										if (bool_443_ && bool_452_)
											fs[i_461_] = f;
									}
								}
								i_453_ += i_457_;
								i_461_++;
							}
							i_454_ += i_458_;
							i_453_ = i_503_;
							i_461_ += i_462_;
						}
					} else {
						int i_511_ = (i_449_ & 0xff0000) >> 16;
						int i_512_ = (i_449_ & 0xff00) >> 8;
						int i_513_ = i_449_ & 0xff;
						int i_514_ = i_449_ >>> 24;
						int i_515_ = 256 - i_514_;
						for (int i_516_ = -i_447_; i_516_ < 0; i_516_++) {
							int i_517_ = ((i_454_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_518_ = -i_446_; i_518_ < 0; i_518_++) {
								if (!bool_443_ || f < fs[i_461_]) {
									int i_519_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_453_ >> 16) + i_517_]);
									if (i_519_ != 0) {
										if (i_514_ != 255) {
											if (bool) {
												int i_520_ = (((i_519_ & 0xff0000) * i_511_) & ~0xffffff);
												int i_521_ = (((i_519_ & 0xff00) * i_512_) & 0xff0000);
												int i_522_ = ((i_519_ & 0xff) * i_513_ & 0xff00);
												i_519_ = (i_520_ | i_521_ | i_522_) >>> 8;
												int i_523_ = is[i_461_];
												is[i_461_] = (((((i_519_ & 0xff00ff) * i_514_) + ((i_523_ & 0xff00ff) * i_515_)) & ~0xff00ff) + ((((i_519_ & 0xff00) * i_514_) + ((i_523_ & 0xff00) * i_515_)) & 0xff0000)) >> 8;
											}
											if (bool_443_ && bool_452_)
												fs[i_461_] = f;
										} else {
											if (bool) {
												int i_524_ = (((i_519_ & 0xff0000) * i_511_) & ~0xffffff);
												int i_525_ = (((i_519_ & 0xff00) * i_512_) & 0xff0000);
												int i_526_ = ((i_519_ & 0xff) * i_513_ & 0xff00);
												is[i_461_] = (i_524_ | i_525_ | i_526_) >>> 8;
											}
											if (bool_443_ && bool_452_)
												fs[i_461_] = f;
										}
									}
								}
								i_453_ += i_457_;
								i_461_++;
							}
							i_454_ += i_458_;
							i_453_ = i_503_;
							i_461_ += i_462_;
						}
					}
				} else if (i_448_ == 3) {
					int i_527_ = i_453_;
					int i_528_ = i_449_ >>> 24;
					int i_529_ = 256 - i_528_;
					for (int i_530_ = -i_447_; i_530_ < 0; i_530_++) {
						int i_531_ = ((i_454_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_532_ = -i_446_; i_532_ < 0; i_532_++) {
							if (!bool_443_ || f < fs[i_461_]) {
								if (bool) {
									int i_533_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_453_ >> 16) + i_531_]);
									int i_534_ = i_533_ + i_449_;
									int i_535_ = ((i_533_ & 0xff00ff) + (i_449_ & 0xff00ff));
									int i_536_ = ((i_535_ & 0x1000100) + (i_534_ - i_535_ & 0x10000));
									i_536_ = i_534_ - i_536_ | i_536_ - (i_536_ >>> 8);
									if (i_533_ == 0 && i_528_ != 255) {
										i_533_ = i_536_;
										i_536_ = is[i_461_];
										i_536_ = ((((i_533_ & 0xff00ff) * i_528_ + ((i_536_ & 0xff00ff) * i_529_)) & ~0xff00ff) + (((i_533_ & 0xff00) * i_528_ + ((i_536_ & 0xff00) * i_529_)) & 0xff0000)) >> 8;
									}
									is[i_461_] = i_536_;
								}
								if (bool_443_ && bool_452_)
									fs[i_461_] = f;
							}
							i_453_ += i_457_;
							i_461_++;
						}
						i_454_ += i_458_;
						i_453_ = i_527_;
						i_461_ += i_462_;
					}
				} else if (i_448_ == 2) {
					int i_537_ = i_449_ >>> 24;
					int i_538_ = 256 - i_537_;
					int i_539_ = (i_449_ & 0xff00ff) * i_538_ & ~0xff00ff;
					int i_540_ = (i_449_ & 0xff00) * i_538_ & 0xff0000;
					i_449_ = (i_539_ | i_540_) >>> 8;
					int i_541_ = i_453_;
					for (int i_542_ = -i_447_; i_542_ < 0; i_542_++) {
						int i_543_ = ((i_454_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_544_ = -i_446_; i_544_ < 0; i_544_++) {
							if (!bool_443_ || f < fs[i_461_]) {
								int i_545_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_453_ >> 16) + i_543_]);
								if (i_545_ != 0) {
									if (bool) {
										i_539_ = ((i_545_ & 0xff00ff) * i_537_ & ~0xff00ff);
										i_540_ = ((i_545_ & 0xff00) * i_537_ & 0xff0000);
										is[i_461_] = (((i_539_ | i_540_) >>> 8) + i_449_);
									}
									if (bool_443_ && bool_452_)
										fs[i_461_] = f;
								}
							}
							i_453_ += i_457_;
							i_461_++;
						}
						i_454_ += i_458_;
						i_453_ = i_541_;
						i_461_ += i_462_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_450_ == 2) {
				if (i_448_ == 1) {
					int i_546_ = i_453_;
					for (int i_547_ = -i_447_; i_547_ < 0; i_547_++) {
						int i_548_ = ((i_454_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_549_ = -i_446_; i_549_ < 0; i_549_++) {
							if (!bool_443_ || f < fs[i_461_]) {
								int i_550_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_453_ >> 16) + i_548_]);
								if (i_550_ != 0) {
									if (bool) {
										int i_551_ = is[i_461_];
										int i_552_ = i_550_ + i_551_;
										int i_553_ = ((i_550_ & 0xff00ff) + (i_551_ & 0xff00ff));
										i_551_ = ((i_553_ & 0x1000100) + (i_552_ - i_553_ & 0x10000));
										is[i_461_] = (i_552_ - i_551_ | i_551_ - (i_551_ >>> 8));
									}
									if (bool_443_ && bool_452_)
										fs[i_461_] = f;
								}
							}
							i_453_ += i_457_;
							i_461_++;
						}
						i_454_ += i_458_;
						i_453_ = i_546_;
						i_461_ += i_462_;
					}
				} else if (i_448_ == 0) {
					int i_554_ = i_453_;
					int i_555_ = (i_449_ & 0xff0000) >> 16;
					int i_556_ = (i_449_ & 0xff00) >> 8;
					int i_557_ = i_449_ & 0xff;
					for (int i_558_ = -i_447_; i_558_ < 0; i_558_++) {
						int i_559_ = ((i_454_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_560_ = -i_446_; i_560_ < 0; i_560_++) {
							if (!bool_443_ || f < fs[i_461_]) {
								int i_561_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_453_ >> 16) + i_559_]);
								if (i_561_ != 0) {
									if (bool) {
										int i_562_ = ((i_561_ & 0xff0000) * i_555_ & ~0xffffff);
										int i_563_ = ((i_561_ & 0xff00) * i_556_ & 0xff0000);
										int i_564_ = ((i_561_ & 0xff) * i_557_ & 0xff00);
										i_561_ = (i_562_ | i_563_ | i_564_) >>> 8;
										int i_565_ = is[i_461_];
										int i_566_ = i_561_ + i_565_;
										int i_567_ = ((i_561_ & 0xff00ff) + (i_565_ & 0xff00ff));
										i_565_ = ((i_567_ & 0x1000100) + (i_566_ - i_567_ & 0x10000));
										is[i_461_] = (i_566_ - i_565_ | i_565_ - (i_565_ >>> 8));
									}
									if (bool_443_ && bool_452_)
										fs[i_461_] = f;
								}
							}
							i_453_ += i_457_;
							i_461_++;
						}
						i_454_ += i_458_;
						i_453_ = i_554_;
						i_461_ += i_462_;
					}
				} else if (i_448_ == 3) {
					int i_568_ = i_453_;
					for (int i_569_ = -i_447_; i_569_ < 0; i_569_++) {
						int i_570_ = ((i_454_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_571_ = -i_446_; i_571_ < 0; i_571_++) {
							if (!bool_443_ || f < fs[i_461_]) {
								if (bool) {
									int i_572_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_453_ >> 16) + i_570_]);
									int i_573_ = i_572_ + i_449_;
									int i_574_ = ((i_572_ & 0xff00ff) + (i_449_ & 0xff00ff));
									int i_575_ = ((i_574_ & 0x1000100) + (i_573_ - i_574_ & 0x10000));
									i_572_ = i_573_ - i_575_ | i_575_ - (i_575_ >>> 8);
									i_575_ = is[i_461_];
									i_573_ = i_572_ + i_575_;
									i_574_ = (i_572_ & 0xff00ff) + (i_575_ & 0xff00ff);
									i_575_ = ((i_574_ & 0x1000100) + (i_573_ - i_574_ & 0x10000));
									is[i_461_] = i_573_ - i_575_ | i_575_ - (i_575_ >>> 8);
								}
								if (bool_443_ && bool_452_)
									fs[i_461_] = f;
							}
							i_453_ += i_457_;
							i_461_++;
						}
						i_454_ += i_458_;
						i_453_ = i_568_;
						i_461_ += i_462_;
					}
				} else if (i_448_ == 2) {
					int i_576_ = i_449_ >>> 24;
					int i_577_ = 256 - i_576_;
					int i_578_ = (i_449_ & 0xff00ff) * i_577_ & ~0xff00ff;
					int i_579_ = (i_449_ & 0xff00) * i_577_ & 0xff0000;
					i_449_ = (i_578_ | i_579_) >>> 8;
					int i_580_ = i_453_;
					for (int i_581_ = -i_447_; i_581_ < 0; i_581_++) {
						int i_582_ = ((i_454_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_583_ = -i_446_; i_583_ < 0; i_583_++) {
							if (!bool_443_ || f < fs[i_461_]) {
								int i_584_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_453_ >> 16) + i_582_]);
								if (i_584_ != 0) {
									if (bool) {
										i_578_ = ((i_584_ & 0xff00ff) * i_576_ & ~0xff00ff);
										i_579_ = ((i_584_ & 0xff00) * i_576_ & 0xff0000);
										i_584_ = (((i_578_ | i_579_) >>> 8) + i_449_);
										int i_585_ = is[i_461_];
										int i_586_ = i_584_ + i_585_;
										int i_587_ = ((i_584_ & 0xff00ff) + (i_585_ & 0xff00ff));
										i_585_ = ((i_587_ & 0x1000100) + (i_586_ - i_587_ & 0x10000));
										is[i_461_] = (i_586_ - i_585_ | i_585_ - (i_585_ >>> 8));
									}
									if (bool_443_ && bool_452_)
										fs[i_461_] = f;
								}
							}
							i_453_ += i_457_;
							i_461_++;
						}
						i_454_ += i_458_;
						i_453_ = i_580_;
						i_461_ += i_462_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method680(int i, int i_588_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_589_ = anInt9001;
					while (i_589_ < 0) {
						int i_590_ = anInt9003;
						int i_591_ = anInt8988;
						int i_592_ = anInt9011;
						int i_593_ = anInt8999;
						if (i_591_ >= 0 && i_592_ >= 0 && i_591_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) < 0 && i_592_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) < 0) {
							for (/**/; i_593_ < 0; i_593_++) {
								int i_594_ = (((i_592_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_591_ >> 12));
								int i_595_ = i_590_++;
								if (i_588_ == 0) {
									if (i == 1)
										is[i_595_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_594_]);
									else if (i == 0) {
										int i_596_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_594_++]);
										int i_597_ = ((i_596_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_598_ = ((i_596_ & 0xff00) * anInt9018 & 0xff0000);
										int i_599_ = ((i_596_ & 0xff) * anInt9019 & 0xff00);
										is[i_595_] = (i_597_ | i_598_ | i_599_) >>> 8;
									} else if (i == 3) {
										int i_600_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_594_++]);
										int i_601_ = anInt9014;
										int i_602_ = i_600_ + i_601_;
										int i_603_ = ((i_600_ & 0xff00ff) + (i_601_ & 0xff00ff));
										int i_604_ = ((i_603_ & 0x1000100) + (i_602_ - i_603_ & 0x10000));
										is[i_595_] = (i_602_ - i_604_ | i_604_ - (i_604_ >>> 8));
									} else if (i == 2) {
										int i_605_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_594_]);
										int i_606_ = ((i_605_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_607_ = ((i_605_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_595_] = (((i_606_ | i_607_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_588_ == 1) {
									if (i == 1) {
										int i_608_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_594_]);
										if (i_608_ != 0)
											is[i_595_] = i_608_;
									} else if (i == 0) {
										int i_609_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_594_]);
										if (i_609_ != 0) {
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_610_ = anInt9014 >>> 24;
												int i_611_ = 256 - i_610_;
												int i_612_ = is[i_595_];
												is[i_595_] = (((((i_609_ & 0xff00ff) * i_610_) + ((i_612_ & 0xff00ff) * i_611_)) & ~0xff00ff) + ((((i_609_ & 0xff00) * i_610_) + ((i_612_ & 0xff00) * i_611_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_613_ = (((i_609_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_614_ = (((i_609_ & 0xff00) * anInt9018) & 0xff0000);
												int i_615_ = (((i_609_ & 0xff) * anInt9019) & 0xff00);
												i_609_ = (i_613_ | i_614_ | i_615_) >>> 8;
												int i_616_ = is[i_595_];
												is[i_595_] = (((((i_609_ & 0xff00ff) * anInt9015) + ((i_616_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_609_ & 0xff00) * anInt9015) + ((i_616_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_617_ = (((i_609_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_618_ = (((i_609_ & 0xff00) * anInt9018) & 0xff0000);
												int i_619_ = (((i_609_ & 0xff) * anInt9019) & 0xff00);
												is[i_595_] = (i_617_ | i_618_ | i_619_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_620_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_594_]);
										int i_621_ = anInt9014;
										int i_622_ = i_620_ + i_621_;
										int i_623_ = ((i_620_ & 0xff00ff) + (i_621_ & 0xff00ff));
										int i_624_ = ((i_623_ & 0x1000100) + (i_622_ - i_623_ & 0x10000));
										i_624_ = (i_622_ - i_624_ | i_624_ - (i_624_ >>> 8));
										if (i_620_ == 0 && anInt9015 != 255) {
											i_620_ = i_624_;
											i_624_ = is[i_595_];
											i_624_ = (((((i_620_ & 0xff00ff) * anInt9015) + ((i_624_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_620_ & 0xff00) * anInt9015) + ((i_624_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_595_] = i_624_;
									} else if (i == 2) {
										int i_625_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_594_]);
										if (i_625_ != 0) {
											int i_626_ = (((i_625_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_627_ = (((i_625_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_595_++] = ((i_626_ | i_627_) >>> 8) + anInt9022;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_588_ == 2) {
									if (i == 1) {
										int i_628_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_594_]);
										if (i_628_ != 0) {
											int i_629_ = is[i_595_];
											int i_630_ = i_628_ + i_629_;
											int i_631_ = ((i_628_ & 0xff00ff) + (i_629_ & 0xff00ff));
											i_629_ = ((i_631_ & 0x1000100) + (i_630_ - i_631_ & 0x10000));
											is[i_595_] = (i_630_ - i_629_ | i_629_ - (i_629_ >>> 8));
										}
									} else if (i == 0) {
										int i_632_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_594_]);
										if (i_632_ != 0) {
											int i_633_ = (((i_632_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_634_ = (((i_632_ & 0xff00) * anInt9018) & 0xff0000);
											int i_635_ = ((i_632_ & 0xff) * anInt9019 & 0xff00);
											i_632_ = (i_633_ | i_634_ | i_635_) >>> 8;
											int i_636_ = is[i_595_];
											int i_637_ = i_632_ + i_636_;
											int i_638_ = ((i_632_ & 0xff00ff) + (i_636_ & 0xff00ff));
											i_636_ = ((i_638_ & 0x1000100) + (i_637_ - i_638_ & 0x10000));
											is[i_595_] = (i_637_ - i_636_ | i_636_ - (i_636_ >>> 8));
										}
									} else if (i == 3) {
										int i_639_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_594_]);
										int i_640_ = anInt9014;
										int i_641_ = i_639_ + i_640_;
										int i_642_ = ((i_639_ & 0xff00ff) + (i_640_ & 0xff00ff));
										int i_643_ = ((i_642_ & 0x1000100) + (i_641_ - i_642_ & 0x10000));
										i_639_ = (i_641_ - i_643_ | i_643_ - (i_643_ >>> 8));
										i_643_ = is[i_595_];
										i_641_ = i_639_ + i_643_;
										i_642_ = ((i_639_ & 0xff00ff) + (i_643_ & 0xff00ff));
										i_643_ = ((i_642_ & 0x1000100) + (i_641_ - i_642_ & 0x10000));
										is[i_595_] = (i_641_ - i_643_ | i_643_ - (i_643_ >>> 8));
									} else if (i == 2) {
										int i_644_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_594_]);
										if (i_644_ != 0) {
											int i_645_ = (((i_644_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_646_ = (((i_644_ & 0xff00) * anInt9015) & 0xff0000);
											i_644_ = (((i_645_ | i_646_) >>> 8) + anInt9022);
											int i_647_ = is[i_595_];
											int i_648_ = i_644_ + i_647_;
											int i_649_ = ((i_644_ & 0xff00ff) + (i_647_ & 0xff00ff));
											i_647_ = ((i_649_ & 0x1000100) + (i_648_ - i_649_ & 0x10000));
											is[i_595_] = (i_648_ - i_647_ | i_647_ - (i_647_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_589_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_650_ = anInt9001;
					while (i_650_ < 0) {
						int i_651_ = anInt9003;
						int i_652_ = anInt8988;
						int i_653_ = anInt9011 + anInt9013;
						int i_654_ = anInt8999;
						if (i_652_ >= 0 && i_652_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) < 0) {
							int i_655_;
							if ((i_655_ = i_653_ - ((((Class57_Sub1_Sub2) this).anInt8989) << 12)) >= 0) {
								i_655_ = (anInt8991 - i_655_) / anInt8991;
								i_654_ += i_655_;
								i_653_ += anInt8991 * i_655_;
								i_651_ += i_655_;
							}
							if ((i_655_ = (i_653_ - anInt8991) / anInt8991) > i_654_)
								i_654_ = i_655_;
							for (/**/; i_654_ < 0; i_654_++) {
								int i_656_ = (((i_653_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_652_ >> 12));
								int i_657_ = i_651_++;
								if (i_588_ == 0) {
									if (i == 1)
										is[i_657_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_656_]);
									else if (i == 0) {
										int i_658_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_656_++]);
										int i_659_ = ((i_658_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_660_ = ((i_658_ & 0xff00) * anInt9018 & 0xff0000);
										int i_661_ = ((i_658_ & 0xff) * anInt9019 & 0xff00);
										is[i_657_] = (i_659_ | i_660_ | i_661_) >>> 8;
									} else if (i == 3) {
										int i_662_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_656_++]);
										int i_663_ = anInt9014;
										int i_664_ = i_662_ + i_663_;
										int i_665_ = ((i_662_ & 0xff00ff) + (i_663_ & 0xff00ff));
										int i_666_ = ((i_665_ & 0x1000100) + (i_664_ - i_665_ & 0x10000));
										is[i_657_] = (i_664_ - i_666_ | i_666_ - (i_666_ >>> 8));
									} else if (i == 2) {
										int i_667_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_656_]);
										int i_668_ = ((i_667_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_669_ = ((i_667_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_657_] = (((i_668_ | i_669_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_588_ == 1) {
									if (i == 1) {
										int i_670_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_656_]);
										if (i_670_ != 0)
											is[i_657_] = i_670_;
									} else if (i == 0) {
										int i_671_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_656_]);
										if (i_671_ != 0) {
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_672_ = anInt9014 >>> 24;
												int i_673_ = 256 - i_672_;
												int i_674_ = is[i_657_];
												is[i_657_] = (((((i_671_ & 0xff00ff) * i_672_) + ((i_674_ & 0xff00ff) * i_673_)) & ~0xff00ff) + ((((i_671_ & 0xff00) * i_672_) + ((i_674_ & 0xff00) * i_673_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_675_ = (((i_671_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_676_ = (((i_671_ & 0xff00) * anInt9018) & 0xff0000);
												int i_677_ = (((i_671_ & 0xff) * anInt9019) & 0xff00);
												i_671_ = (i_675_ | i_676_ | i_677_) >>> 8;
												int i_678_ = is[i_657_];
												is[i_657_] = (((((i_671_ & 0xff00ff) * anInt9015) + ((i_678_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_671_ & 0xff00) * anInt9015) + ((i_678_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_679_ = (((i_671_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_680_ = (((i_671_ & 0xff00) * anInt9018) & 0xff0000);
												int i_681_ = (((i_671_ & 0xff) * anInt9019) & 0xff00);
												is[i_657_] = (i_679_ | i_680_ | i_681_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_682_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_656_]);
										int i_683_ = anInt9014;
										int i_684_ = i_682_ + i_683_;
										int i_685_ = ((i_682_ & 0xff00ff) + (i_683_ & 0xff00ff));
										int i_686_ = ((i_685_ & 0x1000100) + (i_684_ - i_685_ & 0x10000));
										i_686_ = (i_684_ - i_686_ | i_686_ - (i_686_ >>> 8));
										if (i_682_ == 0 && anInt9015 != 255) {
											i_682_ = i_686_;
											i_686_ = is[i_657_];
											i_686_ = (((((i_682_ & 0xff00ff) * anInt9015) + ((i_686_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_682_ & 0xff00) * anInt9015) + ((i_686_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_657_] = i_686_;
									} else if (i == 2) {
										int i_687_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_656_]);
										if (i_687_ != 0) {
											int i_688_ = (((i_687_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_689_ = (((i_687_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_657_++] = ((i_688_ | i_689_) >>> 8) + anInt9022;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_588_ == 2) {
									if (i == 1) {
										int i_690_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_656_]);
										if (i_690_ != 0) {
											int i_691_ = is[i_657_];
											int i_692_ = i_690_ + i_691_;
											int i_693_ = ((i_690_ & 0xff00ff) + (i_691_ & 0xff00ff));
											i_691_ = ((i_693_ & 0x1000100) + (i_692_ - i_693_ & 0x10000));
											is[i_657_] = (i_692_ - i_691_ | i_691_ - (i_691_ >>> 8));
										}
									} else if (i == 0) {
										int i_694_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_656_]);
										if (i_694_ != 0) {
											int i_695_ = (((i_694_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_696_ = (((i_694_ & 0xff00) * anInt9018) & 0xff0000);
											int i_697_ = ((i_694_ & 0xff) * anInt9019 & 0xff00);
											i_694_ = (i_695_ | i_696_ | i_697_) >>> 8;
											int i_698_ = is[i_657_];
											int i_699_ = i_694_ + i_698_;
											int i_700_ = ((i_694_ & 0xff00ff) + (i_698_ & 0xff00ff));
											i_698_ = ((i_700_ & 0x1000100) + (i_699_ - i_700_ & 0x10000));
											is[i_657_] = (i_699_ - i_698_ | i_698_ - (i_698_ >>> 8));
										}
									} else if (i == 3) {
										int i_701_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_656_]);
										int i_702_ = anInt9014;
										int i_703_ = i_701_ + i_702_;
										int i_704_ = ((i_701_ & 0xff00ff) + (i_702_ & 0xff00ff));
										int i_705_ = ((i_704_ & 0x1000100) + (i_703_ - i_704_ & 0x10000));
										i_701_ = (i_703_ - i_705_ | i_705_ - (i_705_ >>> 8));
										i_705_ = is[i_657_];
										i_703_ = i_701_ + i_705_;
										i_704_ = ((i_701_ & 0xff00ff) + (i_705_ & 0xff00ff));
										i_705_ = ((i_704_ & 0x1000100) + (i_703_ - i_704_ & 0x10000));
										is[i_657_] = (i_703_ - i_705_ | i_705_ - (i_705_ >>> 8));
									} else if (i == 2) {
										int i_706_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_656_]);
										if (i_706_ != 0) {
											int i_707_ = (((i_706_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_708_ = (((i_706_ & 0xff00) * anInt9015) & 0xff0000);
											i_706_ = (((i_707_ | i_708_) >>> 8) + anInt9022);
											int i_709_ = is[i_657_];
											int i_710_ = i_706_ + i_709_;
											int i_711_ = ((i_706_ & 0xff00ff) + (i_709_ & 0xff00ff));
											i_709_ = ((i_711_ & 0x1000100) + (i_710_ - i_711_ & 0x10000));
											is[i_657_] = (i_710_ - i_709_ | i_709_ - (i_709_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_653_ += anInt8991;
							}
						}
						i_650_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_712_ = anInt9001;
					while (i_712_ < 0) {
						int i_713_ = anInt9003;
						int i_714_ = anInt8988;
						int i_715_ = anInt9011 + anInt9013;
						int i_716_ = anInt8999;
						if (i_714_ >= 0 && i_714_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) < 0) {
							if (i_715_ < 0) {
								int i_717_ = (anInt8991 - 1 - i_715_) / anInt8991;
								i_716_ += i_717_;
								i_715_ += anInt8991 * i_717_;
								i_713_ += i_717_;
							}
							int i_718_;
							if ((i_718_ = (1 + i_715_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_716_)
								i_716_ = i_718_;
							for (/**/; i_716_ < 0; i_716_++) {
								int i_719_ = (((i_715_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_714_ >> 12));
								int i_720_ = i_713_++;
								if (i_588_ == 0) {
									if (i == 1)
										is[i_720_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_719_]);
									else if (i == 0) {
										int i_721_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_719_++]);
										int i_722_ = ((i_721_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_723_ = ((i_721_ & 0xff00) * anInt9018 & 0xff0000);
										int i_724_ = ((i_721_ & 0xff) * anInt9019 & 0xff00);
										is[i_720_] = (i_722_ | i_723_ | i_724_) >>> 8;
									} else if (i == 3) {
										int i_725_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_719_++]);
										int i_726_ = anInt9014;
										int i_727_ = i_725_ + i_726_;
										int i_728_ = ((i_725_ & 0xff00ff) + (i_726_ & 0xff00ff));
										int i_729_ = ((i_728_ & 0x1000100) + (i_727_ - i_728_ & 0x10000));
										is[i_720_] = (i_727_ - i_729_ | i_729_ - (i_729_ >>> 8));
									} else if (i == 2) {
										int i_730_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_719_]);
										int i_731_ = ((i_730_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_732_ = ((i_730_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_720_] = (((i_731_ | i_732_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_588_ == 1) {
									if (i == 1) {
										int i_733_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_719_]);
										if (i_733_ != 0)
											is[i_720_] = i_733_;
									} else if (i == 0) {
										int i_734_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_719_]);
										if (i_734_ != 0) {
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_735_ = anInt9014 >>> 24;
												int i_736_ = 256 - i_735_;
												int i_737_ = is[i_720_];
												is[i_720_] = (((((i_734_ & 0xff00ff) * i_735_) + ((i_737_ & 0xff00ff) * i_736_)) & ~0xff00ff) + ((((i_734_ & 0xff00) * i_735_) + ((i_737_ & 0xff00) * i_736_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_738_ = (((i_734_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_739_ = (((i_734_ & 0xff00) * anInt9018) & 0xff0000);
												int i_740_ = (((i_734_ & 0xff) * anInt9019) & 0xff00);
												i_734_ = (i_738_ | i_739_ | i_740_) >>> 8;
												int i_741_ = is[i_720_];
												is[i_720_] = (((((i_734_ & 0xff00ff) * anInt9015) + ((i_741_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_734_ & 0xff00) * anInt9015) + ((i_741_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_742_ = (((i_734_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_743_ = (((i_734_ & 0xff00) * anInt9018) & 0xff0000);
												int i_744_ = (((i_734_ & 0xff) * anInt9019) & 0xff00);
												is[i_720_] = (i_742_ | i_743_ | i_744_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_745_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_719_]);
										int i_746_ = anInt9014;
										int i_747_ = i_745_ + i_746_;
										int i_748_ = ((i_745_ & 0xff00ff) + (i_746_ & 0xff00ff));
										int i_749_ = ((i_748_ & 0x1000100) + (i_747_ - i_748_ & 0x10000));
										i_749_ = (i_747_ - i_749_ | i_749_ - (i_749_ >>> 8));
										if (i_745_ == 0 && anInt9015 != 255) {
											i_745_ = i_749_;
											i_749_ = is[i_720_];
											i_749_ = (((((i_745_ & 0xff00ff) * anInt9015) + ((i_749_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_745_ & 0xff00) * anInt9015) + ((i_749_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_720_] = i_749_;
									} else if (i == 2) {
										int i_750_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_719_]);
										if (i_750_ != 0) {
											int i_751_ = (((i_750_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_752_ = (((i_750_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_720_++] = ((i_751_ | i_752_) >>> 8) + anInt9022;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_588_ == 2) {
									if (i == 1) {
										int i_753_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_719_]);
										if (i_753_ != 0) {
											int i_754_ = is[i_720_];
											int i_755_ = i_753_ + i_754_;
											int i_756_ = ((i_753_ & 0xff00ff) + (i_754_ & 0xff00ff));
											i_754_ = ((i_756_ & 0x1000100) + (i_755_ - i_756_ & 0x10000));
											is[i_720_] = (i_755_ - i_754_ | i_754_ - (i_754_ >>> 8));
										}
									} else if (i == 0) {
										int i_757_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_719_]);
										if (i_757_ != 0) {
											int i_758_ = (((i_757_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_759_ = (((i_757_ & 0xff00) * anInt9018) & 0xff0000);
											int i_760_ = ((i_757_ & 0xff) * anInt9019 & 0xff00);
											i_757_ = (i_758_ | i_759_ | i_760_) >>> 8;
											int i_761_ = is[i_720_];
											int i_762_ = i_757_ + i_761_;
											int i_763_ = ((i_757_ & 0xff00ff) + (i_761_ & 0xff00ff));
											i_761_ = ((i_763_ & 0x1000100) + (i_762_ - i_763_ & 0x10000));
											is[i_720_] = (i_762_ - i_761_ | i_761_ - (i_761_ >>> 8));
										}
									} else if (i == 3) {
										int i_764_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_719_]);
										int i_765_ = anInt9014;
										int i_766_ = i_764_ + i_765_;
										int i_767_ = ((i_764_ & 0xff00ff) + (i_765_ & 0xff00ff));
										int i_768_ = ((i_767_ & 0x1000100) + (i_766_ - i_767_ & 0x10000));
										i_764_ = (i_766_ - i_768_ | i_768_ - (i_768_ >>> 8));
										i_768_ = is[i_720_];
										i_766_ = i_764_ + i_768_;
										i_767_ = ((i_764_ & 0xff00ff) + (i_768_ & 0xff00ff));
										i_768_ = ((i_767_ & 0x1000100) + (i_766_ - i_767_ & 0x10000));
										is[i_720_] = (i_766_ - i_768_ | i_768_ - (i_768_ >>> 8));
									} else if (i == 2) {
										int i_769_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_719_]);
										if (i_769_ != 0) {
											int i_770_ = (((i_769_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_771_ = (((i_769_ & 0xff00) * anInt9015) & 0xff0000);
											i_769_ = (((i_770_ | i_771_) >>> 8) + anInt9022);
											int i_772_ = is[i_720_];
											int i_773_ = i_769_ + i_772_;
											int i_774_ = ((i_769_ & 0xff00ff) + (i_772_ & 0xff00ff));
											i_772_ = ((i_774_ & 0x1000100) + (i_773_ - i_774_ & 0x10000));
											is[i_720_] = (i_773_ - i_772_ | i_772_ - (i_772_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_715_ += anInt8991;
							}
						}
						i_712_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_775_ = anInt9001;
					while (i_775_ < 0) {
						int i_776_ = anInt9003;
						int i_777_ = anInt8988 + anInt9012;
						int i_778_ = anInt9011;
						int i_779_ = anInt8999;
						if (i_778_ >= 0 && i_778_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) < 0) {
							int i_780_;
							if ((i_780_ = i_777_ - ((((Class57_Sub1_Sub2) this).anInt9010) << 12)) >= 0) {
								i_780_ = (anInt9004 - i_780_) / anInt9004;
								i_779_ += i_780_;
								i_777_ += anInt9004 * i_780_;
								i_776_ += i_780_;
							}
							if ((i_780_ = (i_777_ - anInt9004) / anInt9004) > i_779_)
								i_779_ = i_780_;
							for (/**/; i_779_ < 0; i_779_++) {
								int i_781_ = (((i_778_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_777_ >> 12));
								int i_782_ = i_776_++;
								if (i_588_ == 0) {
									if (i == 1)
										is[i_782_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_781_]);
									else if (i == 0) {
										int i_783_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_781_++]);
										int i_784_ = ((i_783_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_785_ = ((i_783_ & 0xff00) * anInt9018 & 0xff0000);
										int i_786_ = ((i_783_ & 0xff) * anInt9019 & 0xff00);
										is[i_782_] = (i_784_ | i_785_ | i_786_) >>> 8;
									} else if (i == 3) {
										int i_787_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_781_++]);
										int i_788_ = anInt9014;
										int i_789_ = i_787_ + i_788_;
										int i_790_ = ((i_787_ & 0xff00ff) + (i_788_ & 0xff00ff));
										int i_791_ = ((i_790_ & 0x1000100) + (i_789_ - i_790_ & 0x10000));
										is[i_782_] = (i_789_ - i_791_ | i_791_ - (i_791_ >>> 8));
									} else if (i == 2) {
										int i_792_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_781_]);
										int i_793_ = ((i_792_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_794_ = ((i_792_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_782_] = (((i_793_ | i_794_) >>> 8) + anInt9022);
									} else
										throw new IllegalArgumentException();
								} else if (i_588_ == 1) {
									if (i == 1) {
										int i_795_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_781_]);
										if (i_795_ != 0)
											is[i_782_] = i_795_;
									} else if (i == 0) {
										int i_796_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_781_]);
										if (i_796_ != 0) {
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_797_ = anInt9014 >>> 24;
												int i_798_ = 256 - i_797_;
												int i_799_ = is[i_782_];
												is[i_782_] = (((((i_796_ & 0xff00ff) * i_797_) + ((i_799_ & 0xff00ff) * i_798_)) & ~0xff00ff) + ((((i_796_ & 0xff00) * i_797_) + ((i_799_ & 0xff00) * i_798_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_800_ = (((i_796_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_801_ = (((i_796_ & 0xff00) * anInt9018) & 0xff0000);
												int i_802_ = (((i_796_ & 0xff) * anInt9019) & 0xff00);
												i_796_ = (i_800_ | i_801_ | i_802_) >>> 8;
												int i_803_ = is[i_782_];
												is[i_782_] = (((((i_796_ & 0xff00ff) * anInt9015) + ((i_803_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_796_ & 0xff00) * anInt9015) + ((i_803_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_804_ = (((i_796_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_805_ = (((i_796_ & 0xff00) * anInt9018) & 0xff0000);
												int i_806_ = (((i_796_ & 0xff) * anInt9019) & 0xff00);
												is[i_782_] = (i_804_ | i_805_ | i_806_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_807_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_781_]);
										int i_808_ = anInt9014;
										int i_809_ = i_807_ + i_808_;
										int i_810_ = ((i_807_ & 0xff00ff) + (i_808_ & 0xff00ff));
										int i_811_ = ((i_810_ & 0x1000100) + (i_809_ - i_810_ & 0x10000));
										i_811_ = (i_809_ - i_811_ | i_811_ - (i_811_ >>> 8));
										if (i_807_ == 0 && anInt9015 != 255) {
											i_807_ = i_811_;
											i_811_ = is[i_782_];
											i_811_ = (((((i_807_ & 0xff00ff) * anInt9015) + ((i_811_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_807_ & 0xff00) * anInt9015) + ((i_811_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_782_] = i_811_;
									} else if (i == 2) {
										int i_812_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_781_]);
										if (i_812_ != 0) {
											int i_813_ = (((i_812_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_814_ = (((i_812_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_782_++] = ((i_813_ | i_814_) >>> 8) + anInt9022;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_588_ == 2) {
									if (i == 1) {
										int i_815_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_781_]);
										if (i_815_ != 0) {
											int i_816_ = is[i_782_];
											int i_817_ = i_815_ + i_816_;
											int i_818_ = ((i_815_ & 0xff00ff) + (i_816_ & 0xff00ff));
											i_816_ = ((i_818_ & 0x1000100) + (i_817_ - i_818_ & 0x10000));
											is[i_782_] = (i_817_ - i_816_ | i_816_ - (i_816_ >>> 8));
										}
									} else if (i == 0) {
										int i_819_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_781_]);
										if (i_819_ != 0) {
											int i_820_ = (((i_819_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_821_ = (((i_819_ & 0xff00) * anInt9018) & 0xff0000);
											int i_822_ = ((i_819_ & 0xff) * anInt9019 & 0xff00);
											i_819_ = (i_820_ | i_821_ | i_822_) >>> 8;
											int i_823_ = is[i_782_];
											int i_824_ = i_819_ + i_823_;
											int i_825_ = ((i_819_ & 0xff00ff) + (i_823_ & 0xff00ff));
											i_823_ = ((i_825_ & 0x1000100) + (i_824_ - i_825_ & 0x10000));
											is[i_782_] = (i_824_ - i_823_ | i_823_ - (i_823_ >>> 8));
										}
									} else if (i == 3) {
										int i_826_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_781_]);
										int i_827_ = anInt9014;
										int i_828_ = i_826_ + i_827_;
										int i_829_ = ((i_826_ & 0xff00ff) + (i_827_ & 0xff00ff));
										int i_830_ = ((i_829_ & 0x1000100) + (i_828_ - i_829_ & 0x10000));
										i_826_ = (i_828_ - i_830_ | i_830_ - (i_830_ >>> 8));
										i_830_ = is[i_782_];
										i_828_ = i_826_ + i_830_;
										i_829_ = ((i_826_ & 0xff00ff) + (i_830_ & 0xff00ff));
										i_830_ = ((i_829_ & 0x1000100) + (i_828_ - i_829_ & 0x10000));
										is[i_782_] = (i_828_ - i_830_ | i_830_ - (i_830_ >>> 8));
									} else if (i == 2) {
										int i_831_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_781_]);
										if (i_831_ != 0) {
											int i_832_ = (((i_831_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_833_ = (((i_831_ & 0xff00) * anInt9015) & 0xff0000);
											i_831_ = (((i_832_ | i_833_) >>> 8) + anInt9022);
											int i_834_ = is[i_782_];
											int i_835_ = i_831_ + i_834_;
											int i_836_ = ((i_831_ & 0xff00ff) + (i_834_ & 0xff00ff));
											i_834_ = ((i_836_ & 0x1000100) + (i_835_ - i_836_ & 0x10000));
											is[i_782_] = (i_835_ - i_834_ | i_834_ - (i_834_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_777_ += anInt9004;
							}
						}
						i_775_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_837_ = anInt9001;
					while (i_837_ < 0) {
						int i_838_ = anInt9003;
						int i_839_ = anInt8988 + anInt9012;
						int i_840_ = anInt9011 + anInt9013;
						int i_841_ = anInt8999;
						int i_842_;
						if ((i_842_ = i_839_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) >= 0) {
							i_842_ = (anInt9004 - i_842_) / anInt9004;
							i_841_ += i_842_;
							i_839_ += anInt9004 * i_842_;
							i_840_ += anInt8991 * i_842_;
							i_838_ += i_842_;
						}
						if ((i_842_ = (i_839_ - anInt9004) / anInt9004) > i_841_)
							i_841_ = i_842_;
						if ((i_842_ = i_840_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) >= 0) {
							i_842_ = (anInt8991 - i_842_) / anInt8991;
							i_841_ += i_842_;
							i_839_ += anInt9004 * i_842_;
							i_840_ += anInt8991 * i_842_;
							i_838_ += i_842_;
						}
						if ((i_842_ = (i_840_ - anInt8991) / anInt8991) > i_841_)
							i_841_ = i_842_;
						for (/**/; i_841_ < 0; i_841_++) {
							int i_843_ = (((i_840_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_839_ >> 12));
							int i_844_ = i_838_++;
							if (i_588_ == 0) {
								if (i == 1)
									is[i_844_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_843_]);
								else if (i == 0) {
									int i_845_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_843_++]);
									int i_846_ = ((i_845_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_847_ = ((i_845_ & 0xff00) * anInt9018 & 0xff0000);
									int i_848_ = (i_845_ & 0xff) * anInt9019 & 0xff00;
									is[i_844_] = (i_846_ | i_847_ | i_848_) >>> 8;
								} else if (i == 3) {
									int i_849_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_843_++]);
									int i_850_ = anInt9014;
									int i_851_ = i_849_ + i_850_;
									int i_852_ = ((i_849_ & 0xff00ff) + (i_850_ & 0xff00ff));
									int i_853_ = ((i_852_ & 0x1000100) + (i_851_ - i_852_ & 0x10000));
									is[i_844_] = i_851_ - i_853_ | i_853_ - (i_853_ >>> 8);
								} else if (i == 2) {
									int i_854_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_843_]);
									int i_855_ = ((i_854_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_856_ = ((i_854_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_844_] = (((i_855_ | i_856_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_588_ == 1) {
								if (i == 1) {
									int i_857_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_843_]);
									if (i_857_ != 0)
										is[i_844_] = i_857_;
								} else if (i == 0) {
									int i_858_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_843_]);
									if (i_858_ != 0) {
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_859_ = anInt9014 >>> 24;
											int i_860_ = 256 - i_859_;
											int i_861_ = is[i_844_];
											is[i_844_] = (((((i_858_ & 0xff00ff) * i_859_) + ((i_861_ & 0xff00ff) * i_860_)) & ~0xff00ff) + ((((i_858_ & 0xff00) * i_859_) + ((i_861_ & 0xff00) * i_860_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_862_ = (((i_858_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_863_ = (((i_858_ & 0xff00) * anInt9018) & 0xff0000);
											int i_864_ = ((i_858_ & 0xff) * anInt9019 & 0xff00);
											i_858_ = (i_862_ | i_863_ | i_864_) >>> 8;
											int i_865_ = is[i_844_];
											is[i_844_] = (((((i_858_ & 0xff00ff) * anInt9015) + ((i_865_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_858_ & 0xff00) * anInt9015) + ((i_865_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_866_ = (((i_858_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_867_ = (((i_858_ & 0xff00) * anInt9018) & 0xff0000);
											int i_868_ = ((i_858_ & 0xff) * anInt9019 & 0xff00);
											is[i_844_] = (i_866_ | i_867_ | i_868_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_869_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_843_]);
									int i_870_ = anInt9014;
									int i_871_ = i_869_ + i_870_;
									int i_872_ = ((i_869_ & 0xff00ff) + (i_870_ & 0xff00ff));
									int i_873_ = ((i_872_ & 0x1000100) + (i_871_ - i_872_ & 0x10000));
									i_873_ = i_871_ - i_873_ | i_873_ - (i_873_ >>> 8);
									if (i_869_ == 0 && anInt9015 != 255) {
										i_869_ = i_873_;
										i_873_ = is[i_844_];
										i_873_ = (((((i_869_ & 0xff00ff) * anInt9015) + ((i_873_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_869_ & 0xff00) * anInt9015) + ((i_873_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_844_] = i_873_;
								} else if (i == 2) {
									int i_874_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_843_]);
									if (i_874_ != 0) {
										int i_875_ = ((i_874_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_876_ = ((i_874_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_844_++] = ((i_875_ | i_876_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_588_ == 2) {
								if (i == 1) {
									int i_877_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_843_]);
									if (i_877_ != 0) {
										int i_878_ = is[i_844_];
										int i_879_ = i_877_ + i_878_;
										int i_880_ = ((i_877_ & 0xff00ff) + (i_878_ & 0xff00ff));
										i_878_ = ((i_880_ & 0x1000100) + (i_879_ - i_880_ & 0x10000));
										is[i_844_] = (i_879_ - i_878_ | i_878_ - (i_878_ >>> 8));
									}
								} else if (i == 0) {
									int i_881_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_843_]);
									if (i_881_ != 0) {
										int i_882_ = ((i_881_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_883_ = ((i_881_ & 0xff00) * anInt9018 & 0xff0000);
										int i_884_ = ((i_881_ & 0xff) * anInt9019 & 0xff00);
										i_881_ = (i_882_ | i_883_ | i_884_) >>> 8;
										int i_885_ = is[i_844_];
										int i_886_ = i_881_ + i_885_;
										int i_887_ = ((i_881_ & 0xff00ff) + (i_885_ & 0xff00ff));
										i_885_ = ((i_887_ & 0x1000100) + (i_886_ - i_887_ & 0x10000));
										is[i_844_] = (i_886_ - i_885_ | i_885_ - (i_885_ >>> 8));
									}
								} else if (i == 3) {
									int i_888_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_843_]);
									int i_889_ = anInt9014;
									int i_890_ = i_888_ + i_889_;
									int i_891_ = ((i_888_ & 0xff00ff) + (i_889_ & 0xff00ff));
									int i_892_ = ((i_891_ & 0x1000100) + (i_890_ - i_891_ & 0x10000));
									i_888_ = i_890_ - i_892_ | i_892_ - (i_892_ >>> 8);
									i_892_ = is[i_844_];
									i_890_ = i_888_ + i_892_;
									i_891_ = (i_888_ & 0xff00ff) + (i_892_ & 0xff00ff);
									i_892_ = ((i_891_ & 0x1000100) + (i_890_ - i_891_ & 0x10000));
									is[i_844_] = i_890_ - i_892_ | i_892_ - (i_892_ >>> 8);
								} else if (i == 2) {
									int i_893_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_843_]);
									if (i_893_ != 0) {
										int i_894_ = ((i_893_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_895_ = ((i_893_ & 0xff00) * anInt9015 & 0xff0000);
										i_893_ = (((i_894_ | i_895_) >>> 8) + anInt9022);
										int i_896_ = is[i_844_];
										int i_897_ = i_893_ + i_896_;
										int i_898_ = ((i_893_ & 0xff00ff) + (i_896_ & 0xff00ff));
										i_896_ = ((i_898_ & 0x1000100) + (i_897_ - i_898_ & 0x10000));
										is[i_844_] = (i_897_ - i_896_ | i_896_ - (i_896_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_839_ += anInt9004;
							i_840_ += anInt8991;
						}
						i_837_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_899_ = anInt9001;
					while (i_899_ < 0) {
						int i_900_ = anInt9003;
						int i_901_ = anInt8988 + anInt9012;
						int i_902_ = anInt9011 + anInt9013;
						int i_903_ = anInt8999;
						int i_904_;
						if ((i_904_ = i_901_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) >= 0) {
							i_904_ = (anInt9004 - i_904_) / anInt9004;
							i_903_ += i_904_;
							i_901_ += anInt9004 * i_904_;
							i_902_ += anInt8991 * i_904_;
							i_900_ += i_904_;
						}
						if ((i_904_ = (i_901_ - anInt9004) / anInt9004) > i_903_)
							i_903_ = i_904_;
						if (i_902_ < 0) {
							i_904_ = (anInt8991 - 1 - i_902_) / anInt8991;
							i_903_ += i_904_;
							i_901_ += anInt9004 * i_904_;
							i_902_ += anInt8991 * i_904_;
							i_900_ += i_904_;
						}
						if ((i_904_ = (1 + i_902_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_903_)
							i_903_ = i_904_;
						for (/**/; i_903_ < 0; i_903_++) {
							int i_905_ = (((i_902_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_901_ >> 12));
							int i_906_ = i_900_++;
							if (i_588_ == 0) {
								if (i == 1)
									is[i_906_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_905_]);
								else if (i == 0) {
									int i_907_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_905_++]);
									int i_908_ = ((i_907_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_909_ = ((i_907_ & 0xff00) * anInt9018 & 0xff0000);
									int i_910_ = (i_907_ & 0xff) * anInt9019 & 0xff00;
									is[i_906_] = (i_908_ | i_909_ | i_910_) >>> 8;
								} else if (i == 3) {
									int i_911_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_905_++]);
									int i_912_ = anInt9014;
									int i_913_ = i_911_ + i_912_;
									int i_914_ = ((i_911_ & 0xff00ff) + (i_912_ & 0xff00ff));
									int i_915_ = ((i_914_ & 0x1000100) + (i_913_ - i_914_ & 0x10000));
									is[i_906_] = i_913_ - i_915_ | i_915_ - (i_915_ >>> 8);
								} else if (i == 2) {
									int i_916_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_905_]);
									int i_917_ = ((i_916_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_918_ = ((i_916_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_906_] = (((i_917_ | i_918_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_588_ == 1) {
								if (i == 1) {
									int i_919_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_905_]);
									if (i_919_ != 0)
										is[i_906_] = i_919_;
								} else if (i == 0) {
									int i_920_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_905_]);
									if (i_920_ != 0) {
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_921_ = anInt9014 >>> 24;
											int i_922_ = 256 - i_921_;
											int i_923_ = is[i_906_];
											is[i_906_] = (((((i_920_ & 0xff00ff) * i_921_) + ((i_923_ & 0xff00ff) * i_922_)) & ~0xff00ff) + ((((i_920_ & 0xff00) * i_921_) + ((i_923_ & 0xff00) * i_922_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_924_ = (((i_920_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_925_ = (((i_920_ & 0xff00) * anInt9018) & 0xff0000);
											int i_926_ = ((i_920_ & 0xff) * anInt9019 & 0xff00);
											i_920_ = (i_924_ | i_925_ | i_926_) >>> 8;
											int i_927_ = is[i_906_];
											is[i_906_] = (((((i_920_ & 0xff00ff) * anInt9015) + ((i_927_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_920_ & 0xff00) * anInt9015) + ((i_927_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_928_ = (((i_920_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_929_ = (((i_920_ & 0xff00) * anInt9018) & 0xff0000);
											int i_930_ = ((i_920_ & 0xff) * anInt9019 & 0xff00);
											is[i_906_] = (i_928_ | i_929_ | i_930_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_931_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_905_]);
									int i_932_ = anInt9014;
									int i_933_ = i_931_ + i_932_;
									int i_934_ = ((i_931_ & 0xff00ff) + (i_932_ & 0xff00ff));
									int i_935_ = ((i_934_ & 0x1000100) + (i_933_ - i_934_ & 0x10000));
									i_935_ = i_933_ - i_935_ | i_935_ - (i_935_ >>> 8);
									if (i_931_ == 0 && anInt9015 != 255) {
										i_931_ = i_935_;
										i_935_ = is[i_906_];
										i_935_ = (((((i_931_ & 0xff00ff) * anInt9015) + ((i_935_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_931_ & 0xff00) * anInt9015) + ((i_935_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_906_] = i_935_;
								} else if (i == 2) {
									int i_936_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_905_]);
									if (i_936_ != 0) {
										int i_937_ = ((i_936_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_938_ = ((i_936_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_906_++] = ((i_937_ | i_938_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_588_ == 2) {
								if (i == 1) {
									int i_939_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_905_]);
									if (i_939_ != 0) {
										int i_940_ = is[i_906_];
										int i_941_ = i_939_ + i_940_;
										int i_942_ = ((i_939_ & 0xff00ff) + (i_940_ & 0xff00ff));
										i_940_ = ((i_942_ & 0x1000100) + (i_941_ - i_942_ & 0x10000));
										is[i_906_] = (i_941_ - i_940_ | i_940_ - (i_940_ >>> 8));
									}
								} else if (i == 0) {
									int i_943_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_905_]);
									if (i_943_ != 0) {
										int i_944_ = ((i_943_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_945_ = ((i_943_ & 0xff00) * anInt9018 & 0xff0000);
										int i_946_ = ((i_943_ & 0xff) * anInt9019 & 0xff00);
										i_943_ = (i_944_ | i_945_ | i_946_) >>> 8;
										int i_947_ = is[i_906_];
										int i_948_ = i_943_ + i_947_;
										int i_949_ = ((i_943_ & 0xff00ff) + (i_947_ & 0xff00ff));
										i_947_ = ((i_949_ & 0x1000100) + (i_948_ - i_949_ & 0x10000));
										is[i_906_] = (i_948_ - i_947_ | i_947_ - (i_947_ >>> 8));
									}
								} else if (i == 3) {
									int i_950_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_905_]);
									int i_951_ = anInt9014;
									int i_952_ = i_950_ + i_951_;
									int i_953_ = ((i_950_ & 0xff00ff) + (i_951_ & 0xff00ff));
									int i_954_ = ((i_953_ & 0x1000100) + (i_952_ - i_953_ & 0x10000));
									i_950_ = i_952_ - i_954_ | i_954_ - (i_954_ >>> 8);
									i_954_ = is[i_906_];
									i_952_ = i_950_ + i_954_;
									i_953_ = (i_950_ & 0xff00ff) + (i_954_ & 0xff00ff);
									i_954_ = ((i_953_ & 0x1000100) + (i_952_ - i_953_ & 0x10000));
									is[i_906_] = i_952_ - i_954_ | i_954_ - (i_954_ >>> 8);
								} else if (i == 2) {
									int i_955_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_905_]);
									if (i_955_ != 0) {
										int i_956_ = ((i_955_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_957_ = ((i_955_ & 0xff00) * anInt9015 & 0xff0000);
										i_955_ = (((i_956_ | i_957_) >>> 8) + anInt9022);
										int i_958_ = is[i_906_];
										int i_959_ = i_955_ + i_958_;
										int i_960_ = ((i_955_ & 0xff00ff) + (i_958_ & 0xff00ff));
										i_958_ = ((i_960_ & 0x1000100) + (i_959_ - i_960_ & 0x10000));
										is[i_906_] = (i_959_ - i_958_ | i_958_ - (i_958_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_901_ += anInt9004;
							i_902_ += anInt8991;
						}
						i_899_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_961_ = anInt9001;
				while (i_961_ < 0) {
					int i_962_ = anInt9003;
					int i_963_ = anInt8988 + anInt9012;
					int i_964_ = anInt9011;
					int i_965_ = anInt8999;
					if (i_964_ >= 0 && i_964_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) < 0) {
						if (i_963_ < 0) {
							int i_966_ = (anInt9004 - 1 - i_963_) / anInt9004;
							i_965_ += i_966_;
							i_963_ += anInt9004 * i_966_;
							i_962_ += i_966_;
						}
						int i_967_;
						if ((i_967_ = (1 + i_963_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_965_)
							i_965_ = i_967_;
						for (/**/; i_965_ < 0; i_965_++) {
							int i_968_ = (((i_964_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_963_ >> 12));
							int i_969_ = i_962_++;
							if (i_588_ == 0) {
								if (i == 1)
									is[i_969_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_968_]);
								else if (i == 0) {
									int i_970_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_968_++]);
									int i_971_ = ((i_970_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_972_ = ((i_970_ & 0xff00) * anInt9018 & 0xff0000);
									int i_973_ = (i_970_ & 0xff) * anInt9019 & 0xff00;
									is[i_969_] = (i_971_ | i_972_ | i_973_) >>> 8;
								} else if (i == 3) {
									int i_974_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_968_++]);
									int i_975_ = anInt9014;
									int i_976_ = i_974_ + i_975_;
									int i_977_ = ((i_974_ & 0xff00ff) + (i_975_ & 0xff00ff));
									int i_978_ = ((i_977_ & 0x1000100) + (i_976_ - i_977_ & 0x10000));
									is[i_969_] = i_976_ - i_978_ | i_978_ - (i_978_ >>> 8);
								} else if (i == 2) {
									int i_979_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_968_]);
									int i_980_ = ((i_979_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_981_ = ((i_979_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_969_] = (((i_980_ | i_981_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_588_ == 1) {
								if (i == 1) {
									int i_982_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_968_]);
									if (i_982_ != 0)
										is[i_969_] = i_982_;
								} else if (i == 0) {
									int i_983_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_968_]);
									if (i_983_ != 0) {
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_984_ = anInt9014 >>> 24;
											int i_985_ = 256 - i_984_;
											int i_986_ = is[i_969_];
											is[i_969_] = (((((i_983_ & 0xff00ff) * i_984_) + ((i_986_ & 0xff00ff) * i_985_)) & ~0xff00ff) + ((((i_983_ & 0xff00) * i_984_) + ((i_986_ & 0xff00) * i_985_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_987_ = (((i_983_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_988_ = (((i_983_ & 0xff00) * anInt9018) & 0xff0000);
											int i_989_ = ((i_983_ & 0xff) * anInt9019 & 0xff00);
											i_983_ = (i_987_ | i_988_ | i_989_) >>> 8;
											int i_990_ = is[i_969_];
											is[i_969_] = (((((i_983_ & 0xff00ff) * anInt9015) + ((i_990_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_983_ & 0xff00) * anInt9015) + ((i_990_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_991_ = (((i_983_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_992_ = (((i_983_ & 0xff00) * anInt9018) & 0xff0000);
											int i_993_ = ((i_983_ & 0xff) * anInt9019 & 0xff00);
											is[i_969_] = (i_991_ | i_992_ | i_993_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_994_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_968_]);
									int i_995_ = anInt9014;
									int i_996_ = i_994_ + i_995_;
									int i_997_ = ((i_994_ & 0xff00ff) + (i_995_ & 0xff00ff));
									int i_998_ = ((i_997_ & 0x1000100) + (i_996_ - i_997_ & 0x10000));
									i_998_ = i_996_ - i_998_ | i_998_ - (i_998_ >>> 8);
									if (i_994_ == 0 && anInt9015 != 255) {
										i_994_ = i_998_;
										i_998_ = is[i_969_];
										i_998_ = (((((i_994_ & 0xff00ff) * anInt9015) + ((i_998_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_994_ & 0xff00) * anInt9015) + ((i_998_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_969_] = i_998_;
								} else if (i == 2) {
									int i_999_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_968_]);
									if (i_999_ != 0) {
										int i_1000_ = ((i_999_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1001_ = ((i_999_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_969_++] = ((i_1000_ | i_1001_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_588_ == 2) {
								if (i == 1) {
									int i_1002_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_968_]);
									if (i_1002_ != 0) {
										int i_1003_ = is[i_969_];
										int i_1004_ = i_1002_ + i_1003_;
										int i_1005_ = ((i_1002_ & 0xff00ff) + (i_1003_ & 0xff00ff));
										i_1003_ = ((i_1005_ & 0x1000100) + (i_1004_ - i_1005_ & 0x10000));
										is[i_969_] = (i_1004_ - i_1003_ | i_1003_ - (i_1003_ >>> 8));
									}
								} else if (i == 0) {
									int i_1006_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_968_]);
									if (i_1006_ != 0) {
										int i_1007_ = ((i_1006_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1008_ = ((i_1006_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1009_ = ((i_1006_ & 0xff) * anInt9019 & 0xff00);
										i_1006_ = (i_1007_ | i_1008_ | i_1009_) >>> 8;
										int i_1010_ = is[i_969_];
										int i_1011_ = i_1006_ + i_1010_;
										int i_1012_ = ((i_1006_ & 0xff00ff) + (i_1010_ & 0xff00ff));
										i_1010_ = ((i_1012_ & 0x1000100) + (i_1011_ - i_1012_ & 0x10000));
										is[i_969_] = (i_1011_ - i_1010_ | i_1010_ - (i_1010_ >>> 8));
									}
								} else if (i == 3) {
									int i_1013_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_968_]);
									int i_1014_ = anInt9014;
									int i_1015_ = i_1013_ + i_1014_;
									int i_1016_ = ((i_1013_ & 0xff00ff) + (i_1014_ & 0xff00ff));
									int i_1017_ = ((i_1016_ & 0x1000100) + (i_1015_ - i_1016_ & 0x10000));
									i_1013_ = (i_1015_ - i_1017_ | i_1017_ - (i_1017_ >>> 8));
									i_1017_ = is[i_969_];
									i_1015_ = i_1013_ + i_1017_;
									i_1016_ = (i_1013_ & 0xff00ff) + (i_1017_ & 0xff00ff);
									i_1017_ = ((i_1016_ & 0x1000100) + (i_1015_ - i_1016_ & 0x10000));
									is[i_969_] = (i_1015_ - i_1017_ | i_1017_ - (i_1017_ >>> 8));
								} else if (i == 2) {
									int i_1018_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_968_]);
									if (i_1018_ != 0) {
										int i_1019_ = ((i_1018_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1020_ = ((i_1018_ & 0xff00) * anInt9015 & 0xff0000);
										i_1018_ = (((i_1019_ | i_1020_) >>> 8) + anInt9022);
										int i_1021_ = is[i_969_];
										int i_1022_ = i_1018_ + i_1021_;
										int i_1023_ = ((i_1018_ & 0xff00ff) + (i_1021_ & 0xff00ff));
										i_1021_ = ((i_1023_ & 0x1000100) + (i_1022_ - i_1023_ & 0x10000));
										is[i_969_] = (i_1022_ - i_1021_ | i_1021_ - (i_1021_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_963_ += anInt9004;
						}
					}
					i_961_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				for (int i_1024_ = anInt9001; i_1024_ < 0; i_1024_++) {
					int i_1025_ = anInt9003;
					int i_1026_ = anInt8988 + anInt9012;
					int i_1027_ = anInt9011 + anInt9013;
					int i_1028_ = anInt8999;
					if (i_1026_ < 0) {
						int i_1029_ = (anInt9004 - 1 - i_1026_) / anInt9004;
						i_1028_ += i_1029_;
						i_1026_ += anInt9004 * i_1029_;
						i_1027_ += anInt8991 * i_1029_;
						i_1025_ += i_1029_;
					}
					int i_1030_;
					if ((i_1030_ = (1 + i_1026_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1028_)
						i_1028_ = i_1030_;
					if ((i_1030_ = i_1027_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) >= 0) {
						i_1030_ = (anInt8991 - i_1030_) / anInt8991;
						i_1028_ += i_1030_;
						i_1026_ += anInt9004 * i_1030_;
						i_1027_ += anInt8991 * i_1030_;
						i_1025_ += i_1030_;
					}
					if ((i_1030_ = (i_1027_ - anInt8991) / anInt8991) > i_1028_)
						i_1028_ = i_1030_;
					for (/**/; i_1028_ < 0; i_1028_++) {
						int i_1031_ = (((i_1027_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_1026_ >> 12));
						int i_1032_ = i_1025_++;
						if (i_588_ == 0) {
							if (i == 1)
								is[i_1032_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1031_]);
							else if (i == 0) {
								int i_1033_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1031_++]);
								int i_1034_ = ((i_1033_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_1035_ = ((i_1033_ & 0xff00) * anInt9018 & 0xff0000);
								int i_1036_ = (i_1033_ & 0xff) * anInt9019 & 0xff00;
								is[i_1032_] = (i_1034_ | i_1035_ | i_1036_) >>> 8;
							} else if (i == 3) {
								int i_1037_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1031_++]);
								int i_1038_ = anInt9014;
								int i_1039_ = i_1037_ + i_1038_;
								int i_1040_ = ((i_1037_ & 0xff00ff) + (i_1038_ & 0xff00ff));
								int i_1041_ = ((i_1040_ & 0x1000100) + (i_1039_ - i_1040_ & 0x10000));
								is[i_1032_] = i_1039_ - i_1041_ | i_1041_ - (i_1041_ >>> 8);
							} else if (i == 2) {
								int i_1042_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1031_]);
								int i_1043_ = ((i_1042_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_1044_ = ((i_1042_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_1032_] = ((i_1043_ | i_1044_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_588_ == 1) {
							if (i == 1) {
								int i_1045_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1031_]);
								if (i_1045_ != 0)
									is[i_1032_] = i_1045_;
							} else if (i == 0) {
								int i_1046_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1031_]);
								if (i_1046_ != 0) {
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_1047_ = anInt9014 >>> 24;
										int i_1048_ = 256 - i_1047_;
										int i_1049_ = is[i_1032_];
										is[i_1032_] = ((((i_1046_ & 0xff00ff) * i_1047_ + ((i_1049_ & 0xff00ff) * i_1048_)) & ~0xff00ff) + (((i_1046_ & 0xff00) * i_1047_ + ((i_1049_ & 0xff00) * i_1048_)) & 0xff0000)) >> 8;
									} else if (anInt9015 != 255) {
										int i_1050_ = ((i_1046_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1051_ = ((i_1046_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1052_ = ((i_1046_ & 0xff) * anInt9019 & 0xff00);
										i_1046_ = (i_1050_ | i_1051_ | i_1052_) >>> 8;
										int i_1053_ = is[i_1032_];
										is[i_1032_] = (((((i_1046_ & 0xff00ff) * anInt9015) + ((i_1053_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1046_ & 0xff00) * anInt9015) + ((i_1053_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									} else {
										int i_1054_ = ((i_1046_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1055_ = ((i_1046_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1056_ = ((i_1046_ & 0xff) * anInt9019 & 0xff00);
										is[i_1032_] = (i_1054_ | i_1055_ | i_1056_) >>> 8;
									}
								}
							} else if (i == 3) {
								int i_1057_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1031_]);
								int i_1058_ = anInt9014;
								int i_1059_ = i_1057_ + i_1058_;
								int i_1060_ = ((i_1057_ & 0xff00ff) + (i_1058_ & 0xff00ff));
								int i_1061_ = ((i_1060_ & 0x1000100) + (i_1059_ - i_1060_ & 0x10000));
								i_1061_ = i_1059_ - i_1061_ | i_1061_ - (i_1061_ >>> 8);
								if (i_1057_ == 0 && anInt9015 != 255) {
									i_1057_ = i_1061_;
									i_1061_ = is[i_1032_];
									i_1061_ = ((((i_1057_ & 0xff00ff) * anInt9015 + ((i_1061_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + (((i_1057_ & 0xff00) * anInt9015 + ((i_1061_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
								}
								is[i_1032_] = i_1061_;
							} else if (i == 2) {
								int i_1062_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1031_]);
								if (i_1062_ != 0) {
									int i_1063_ = ((i_1062_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1064_ = ((i_1062_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_1032_++] = ((i_1063_ | i_1064_) >>> 8) + anInt9022;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_588_ == 2) {
							if (i == 1) {
								int i_1065_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1031_]);
								if (i_1065_ != 0) {
									int i_1066_ = is[i_1032_];
									int i_1067_ = i_1065_ + i_1066_;
									int i_1068_ = ((i_1065_ & 0xff00ff) + (i_1066_ & 0xff00ff));
									i_1066_ = ((i_1068_ & 0x1000100) + (i_1067_ - i_1068_ & 0x10000));
									is[i_1032_] = (i_1067_ - i_1066_ | i_1066_ - (i_1066_ >>> 8));
								}
							} else if (i == 0) {
								int i_1069_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1031_]);
								if (i_1069_ != 0) {
									int i_1070_ = ((i_1069_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1071_ = ((i_1069_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1072_ = ((i_1069_ & 0xff) * anInt9019 & 0xff00);
									i_1069_ = (i_1070_ | i_1071_ | i_1072_) >>> 8;
									int i_1073_ = is[i_1032_];
									int i_1074_ = i_1069_ + i_1073_;
									int i_1075_ = ((i_1069_ & 0xff00ff) + (i_1073_ & 0xff00ff));
									i_1073_ = ((i_1075_ & 0x1000100) + (i_1074_ - i_1075_ & 0x10000));
									is[i_1032_] = (i_1074_ - i_1073_ | i_1073_ - (i_1073_ >>> 8));
								}
							} else if (i == 3) {
								int i_1076_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1031_]);
								int i_1077_ = anInt9014;
								int i_1078_ = i_1076_ + i_1077_;
								int i_1079_ = ((i_1076_ & 0xff00ff) + (i_1077_ & 0xff00ff));
								int i_1080_ = ((i_1079_ & 0x1000100) + (i_1078_ - i_1079_ & 0x10000));
								i_1076_ = i_1078_ - i_1080_ | i_1080_ - (i_1080_ >>> 8);
								i_1080_ = is[i_1032_];
								i_1078_ = i_1076_ + i_1080_;
								i_1079_ = (i_1076_ & 0xff00ff) + (i_1080_ & 0xff00ff);
								i_1080_ = ((i_1079_ & 0x1000100) + (i_1078_ - i_1079_ & 0x10000));
								is[i_1032_] = i_1078_ - i_1080_ | i_1080_ - (i_1080_ >>> 8);
							} else if (i == 2) {
								int i_1081_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1031_]);
								if (i_1081_ != 0) {
									int i_1082_ = ((i_1081_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1083_ = ((i_1081_ & 0xff00) * anInt9015 & 0xff0000);
									i_1081_ = (((i_1082_ | i_1083_) >>> 8) + anInt9022);
									int i_1084_ = is[i_1032_];
									int i_1085_ = i_1081_ + i_1084_;
									int i_1086_ = ((i_1081_ & 0xff00ff) + (i_1084_ & 0xff00ff));
									i_1084_ = ((i_1086_ & 0x1000100) + (i_1085_ - i_1086_ & 0x10000));
									is[i_1032_] = (i_1085_ - i_1084_ | i_1084_ - (i_1084_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1026_ += anInt9004;
						i_1027_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				for (int i_1087_ = anInt9001; i_1087_ < 0; i_1087_++) {
					int i_1088_ = anInt9003;
					int i_1089_ = anInt8988 + anInt9012;
					int i_1090_ = anInt9011 + anInt9013;
					int i_1091_ = anInt8999;
					if (i_1089_ < 0) {
						int i_1092_ = (anInt9004 - 1 - i_1089_) / anInt9004;
						i_1091_ += i_1092_;
						i_1089_ += anInt9004 * i_1092_;
						i_1090_ += anInt8991 * i_1092_;
						i_1088_ += i_1092_;
					}
					int i_1093_;
					if ((i_1093_ = (1 + i_1089_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1091_)
						i_1091_ = i_1093_;
					if (i_1090_ < 0) {
						i_1093_ = (anInt8991 - 1 - i_1090_) / anInt8991;
						i_1091_ += i_1093_;
						i_1089_ += anInt9004 * i_1093_;
						i_1090_ += anInt8991 * i_1093_;
						i_1088_ += i_1093_;
					}
					if ((i_1093_ = (1 + i_1090_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_1091_)
						i_1091_ = i_1093_;
					for (/**/; i_1091_ < 0; i_1091_++) {
						int i_1094_ = (((i_1090_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_1089_ >> 12));
						int i_1095_ = i_1088_++;
						if (i_588_ == 0) {
							if (i == 1)
								is[i_1095_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1094_]);
							else if (i == 0) {
								int i_1096_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1094_++]);
								int i_1097_ = ((i_1096_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_1098_ = ((i_1096_ & 0xff00) * anInt9018 & 0xff0000);
								int i_1099_ = (i_1096_ & 0xff) * anInt9019 & 0xff00;
								is[i_1095_] = (i_1097_ | i_1098_ | i_1099_) >>> 8;
							} else if (i == 3) {
								int i_1100_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1094_++]);
								int i_1101_ = anInt9014;
								int i_1102_ = i_1100_ + i_1101_;
								int i_1103_ = ((i_1100_ & 0xff00ff) + (i_1101_ & 0xff00ff));
								int i_1104_ = ((i_1103_ & 0x1000100) + (i_1102_ - i_1103_ & 0x10000));
								is[i_1095_] = i_1102_ - i_1104_ | i_1104_ - (i_1104_ >>> 8);
							} else if (i == 2) {
								int i_1105_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1094_]);
								int i_1106_ = ((i_1105_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_1107_ = ((i_1105_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_1095_] = ((i_1106_ | i_1107_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_588_ == 1) {
							if (i == 1) {
								int i_1108_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1094_]);
								if (i_1108_ != 0)
									is[i_1095_] = i_1108_;
							} else if (i == 0) {
								int i_1109_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1094_]);
								if (i_1109_ != 0) {
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_1110_ = anInt9014 >>> 24;
										int i_1111_ = 256 - i_1110_;
										int i_1112_ = is[i_1095_];
										is[i_1095_] = ((((i_1109_ & 0xff00ff) * i_1110_ + ((i_1112_ & 0xff00ff) * i_1111_)) & ~0xff00ff) + (((i_1109_ & 0xff00) * i_1110_ + ((i_1112_ & 0xff00) * i_1111_)) & 0xff0000)) >> 8;
									} else if (anInt9015 != 255) {
										int i_1113_ = ((i_1109_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1114_ = ((i_1109_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1115_ = ((i_1109_ & 0xff) * anInt9019 & 0xff00);
										i_1109_ = (i_1113_ | i_1114_ | i_1115_) >>> 8;
										int i_1116_ = is[i_1095_];
										is[i_1095_] = (((((i_1109_ & 0xff00ff) * anInt9015) + ((i_1116_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1109_ & 0xff00) * anInt9015) + ((i_1116_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									} else {
										int i_1117_ = ((i_1109_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1118_ = ((i_1109_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1119_ = ((i_1109_ & 0xff) * anInt9019 & 0xff00);
										is[i_1095_] = (i_1117_ | i_1118_ | i_1119_) >>> 8;
									}
								}
							} else if (i == 3) {
								int i_1120_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1094_]);
								int i_1121_ = anInt9014;
								int i_1122_ = i_1120_ + i_1121_;
								int i_1123_ = ((i_1120_ & 0xff00ff) + (i_1121_ & 0xff00ff));
								int i_1124_ = ((i_1123_ & 0x1000100) + (i_1122_ - i_1123_ & 0x10000));
								i_1124_ = i_1122_ - i_1124_ | i_1124_ - (i_1124_ >>> 8);
								if (i_1120_ == 0 && anInt9015 != 255) {
									i_1120_ = i_1124_;
									i_1124_ = is[i_1095_];
									i_1124_ = ((((i_1120_ & 0xff00ff) * anInt9015 + ((i_1124_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + (((i_1120_ & 0xff00) * anInt9015 + ((i_1124_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
								}
								is[i_1095_] = i_1124_;
							} else if (i == 2) {
								int i_1125_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1094_]);
								if (i_1125_ != 0) {
									int i_1126_ = ((i_1125_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1127_ = ((i_1125_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_1095_++] = ((i_1126_ | i_1127_) >>> 8) + anInt9022;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_588_ == 2) {
							if (i == 1) {
								int i_1128_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1094_]);
								if (i_1128_ != 0) {
									int i_1129_ = is[i_1095_];
									int i_1130_ = i_1128_ + i_1129_;
									int i_1131_ = ((i_1128_ & 0xff00ff) + (i_1129_ & 0xff00ff));
									i_1129_ = ((i_1131_ & 0x1000100) + (i_1130_ - i_1131_ & 0x10000));
									is[i_1095_] = (i_1130_ - i_1129_ | i_1129_ - (i_1129_ >>> 8));
								}
							} else if (i == 0) {
								int i_1132_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1094_]);
								if (i_1132_ != 0) {
									int i_1133_ = ((i_1132_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1134_ = ((i_1132_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1135_ = ((i_1132_ & 0xff) * anInt9019 & 0xff00);
									i_1132_ = (i_1133_ | i_1134_ | i_1135_) >>> 8;
									int i_1136_ = is[i_1095_];
									int i_1137_ = i_1132_ + i_1136_;
									int i_1138_ = ((i_1132_ & 0xff00ff) + (i_1136_ & 0xff00ff));
									i_1136_ = ((i_1138_ & 0x1000100) + (i_1137_ - i_1138_ & 0x10000));
									is[i_1095_] = (i_1137_ - i_1136_ | i_1136_ - (i_1136_ >>> 8));
								}
							} else if (i == 3) {
								int i_1139_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1094_]);
								int i_1140_ = anInt9014;
								int i_1141_ = i_1139_ + i_1140_;
								int i_1142_ = ((i_1139_ & 0xff00ff) + (i_1140_ & 0xff00ff));
								int i_1143_ = ((i_1142_ & 0x1000100) + (i_1141_ - i_1142_ & 0x10000));
								i_1139_ = i_1141_ - i_1143_ | i_1143_ - (i_1143_ >>> 8);
								i_1143_ = is[i_1095_];
								i_1141_ = i_1139_ + i_1143_;
								i_1142_ = (i_1139_ & 0xff00ff) + (i_1143_ & 0xff00ff);
								i_1143_ = ((i_1142_ & 0x1000100) + (i_1141_ - i_1142_ & 0x10000));
								is[i_1095_] = i_1141_ - i_1143_ | i_1143_ - (i_1143_ >>> 8);
							} else if (i == 2) {
								int i_1144_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1094_]);
								if (i_1144_ != 0) {
									int i_1145_ = ((i_1144_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_1146_ = ((i_1144_ & 0xff00) * anInt9015 & 0xff0000);
									i_1144_ = (((i_1145_ | i_1146_) >>> 8) + anInt9022);
									int i_1147_ = is[i_1095_];
									int i_1148_ = i_1144_ + i_1147_;
									int i_1149_ = ((i_1144_ & 0xff00ff) + (i_1147_ & 0xff00ff));
									i_1147_ = ((i_1149_ & 0x1000100) + (i_1148_ - i_1149_ & 0x10000));
									is[i_1095_] = (i_1148_ - i_1147_ | i_1147_ - (i_1147_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1089_ += anInt9004;
						i_1090_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	void method681(int[] is, int[] is_1150_, int i, int i_1151_) {
		int[] is_1152_ = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is_1152_ != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_1153_ = anInt9001;
					while (i_1153_ < 0) {
						int i_1154_ = i_1153_ + i_1151_;
						if (i_1154_ >= 0) {
							if (i_1154_ >= is.length)
								break;
							int i_1155_ = anInt9003;
							int i_1156_ = anInt8988;
							int i_1157_ = anInt9011;
							int i_1158_ = anInt8999;
							if (i_1156_ >= 0 && i_1157_ >= 0 && (i_1156_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) < 0 && (i_1157_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) < 0) {
								int i_1159_ = is[i_1154_] - i;
								int i_1160_ = -is_1150_[i_1154_];
								int i_1161_ = i_1159_ - (i_1155_ - anInt9003);
								if (i_1161_ > 0) {
									i_1155_ += i_1161_;
									i_1158_ += i_1161_;
									i_1156_ += anInt9004 * i_1161_;
									i_1157_ += anInt8991 * i_1161_;
								} else
									i_1160_ -= i_1161_;
								if (i_1158_ < i_1160_)
									i_1158_ = i_1160_;
								for (/**/; i_1158_ < 0; i_1158_++) {
									int i_1162_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_1157_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_1156_ >> 12))]);
									if (i_1162_ != 0)
										is_1152_[i_1155_++] = i_1162_;
									else
										i_1155_++;
								}
							}
						}
						i_1153_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_1163_ = anInt9001;
					while (i_1163_ < 0) {
						int i_1164_ = i_1163_ + i_1151_;
						if (i_1164_ >= 0) {
							if (i_1164_ >= is.length)
								break;
							int i_1165_ = anInt9003;
							int i_1166_ = anInt8988;
							int i_1167_ = anInt9011 + anInt9013;
							int i_1168_ = anInt8999;
							if (i_1166_ >= 0 && (i_1166_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) < 0) {
								int i_1169_;
								if ((i_1169_ = (i_1167_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12))) >= 0) {
									i_1169_ = (anInt8991 - i_1169_) / anInt8991;
									i_1168_ += i_1169_;
									i_1167_ += anInt8991 * i_1169_;
									i_1165_ += i_1169_;
								}
								if ((i_1169_ = (i_1167_ - anInt8991) / anInt8991) > i_1168_)
									i_1168_ = i_1169_;
								int i_1170_ = is[i_1164_] - i;
								int i_1171_ = -is_1150_[i_1164_];
								int i_1172_ = i_1170_ - (i_1165_ - anInt9003);
								if (i_1172_ > 0) {
									i_1165_ += i_1172_;
									i_1168_ += i_1172_;
									i_1166_ += anInt9004 * i_1172_;
									i_1167_ += anInt8991 * i_1172_;
								} else
									i_1171_ -= i_1172_;
								if (i_1168_ < i_1171_)
									i_1168_ = i_1171_;
								for (/**/; i_1168_ < 0; i_1168_++) {
									int i_1173_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_1167_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_1166_ >> 12))]);
									if (i_1173_ != 0)
										is_1152_[i_1165_++] = i_1173_;
									else
										i_1165_++;
									i_1167_ += anInt8991;
								}
							}
						}
						i_1163_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_1174_ = anInt9001;
					while (i_1174_ < 0) {
						int i_1175_ = i_1174_ + i_1151_;
						if (i_1175_ >= 0) {
							if (i_1175_ >= is.length)
								break;
							int i_1176_ = anInt9003;
							int i_1177_ = anInt8988;
							int i_1178_ = anInt9011 + anInt9013;
							int i_1179_ = anInt8999;
							if (i_1177_ >= 0 && (i_1177_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) < 0) {
								if (i_1178_ < 0) {
									int i_1180_ = ((anInt8991 - 1 - i_1178_) / anInt8991);
									i_1179_ += i_1180_;
									i_1178_ += anInt8991 * i_1180_;
									i_1176_ += i_1180_;
								}
								int i_1181_;
								if ((i_1181_ = (1 + i_1178_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_1179_)
									i_1179_ = i_1181_;
								int i_1182_ = is[i_1175_] - i;
								int i_1183_ = -is_1150_[i_1175_];
								int i_1184_ = i_1182_ - (i_1176_ - anInt9003);
								if (i_1184_ > 0) {
									i_1176_ += i_1184_;
									i_1179_ += i_1184_;
									i_1177_ += anInt9004 * i_1184_;
									i_1178_ += anInt8991 * i_1184_;
								} else
									i_1183_ -= i_1184_;
								if (i_1179_ < i_1183_)
									i_1179_ = i_1183_;
								for (/**/; i_1179_ < 0; i_1179_++) {
									int i_1185_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_1178_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_1177_ >> 12))]);
									if (i_1185_ != 0)
										is_1152_[i_1176_++] = i_1185_;
									else
										i_1176_++;
									i_1178_ += anInt8991;
								}
							}
						}
						i_1174_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_1186_ = anInt9001;
					while (i_1186_ < 0) {
						int i_1187_ = i_1186_ + i_1151_;
						if (i_1187_ >= 0) {
							if (i_1187_ >= is.length)
								break;
							int i_1188_ = anInt9003;
							int i_1189_ = anInt8988 + anInt9012;
							int i_1190_ = anInt9011;
							int i_1191_ = anInt8999;
							if (i_1190_ >= 0 && (i_1190_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) < 0) {
								int i_1192_;
								if ((i_1192_ = (i_1189_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12))) >= 0) {
									i_1192_ = (anInt9004 - i_1192_) / anInt9004;
									i_1191_ += i_1192_;
									i_1189_ += anInt9004 * i_1192_;
									i_1188_ += i_1192_;
								}
								if ((i_1192_ = (i_1189_ - anInt9004) / anInt9004) > i_1191_)
									i_1191_ = i_1192_;
								int i_1193_ = is[i_1187_] - i;
								int i_1194_ = -is_1150_[i_1187_];
								int i_1195_ = i_1193_ - (i_1188_ - anInt9003);
								if (i_1195_ > 0) {
									i_1188_ += i_1195_;
									i_1191_ += i_1195_;
									i_1189_ += anInt9004 * i_1195_;
									i_1190_ += anInt8991 * i_1195_;
								} else
									i_1194_ -= i_1195_;
								if (i_1191_ < i_1194_)
									i_1191_ = i_1194_;
								for (/**/; i_1191_ < 0; i_1191_++) {
									int i_1196_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_1190_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_1189_ >> 12))]);
									if (i_1196_ != 0)
										is_1152_[i_1188_++] = i_1196_;
									else
										i_1188_++;
									i_1189_ += anInt9004;
								}
							}
						}
						i_1186_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_1197_ = anInt9001;
					while (i_1197_ < 0) {
						int i_1198_ = i_1197_ + i_1151_;
						if (i_1198_ >= 0) {
							if (i_1198_ >= is.length)
								break;
							int i_1199_ = anInt9003;
							int i_1200_ = anInt8988 + anInt9012;
							int i_1201_ = anInt9011 + anInt9013;
							int i_1202_ = anInt8999;
							int i_1203_;
							if ((i_1203_ = (i_1200_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12))) >= 0) {
								i_1203_ = (anInt9004 - i_1203_) / anInt9004;
								i_1202_ += i_1203_;
								i_1200_ += anInt9004 * i_1203_;
								i_1201_ += anInt8991 * i_1203_;
								i_1199_ += i_1203_;
							}
							if ((i_1203_ = (i_1200_ - anInt9004) / anInt9004) > i_1202_)
								i_1202_ = i_1203_;
							if ((i_1203_ = (i_1201_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12))) >= 0) {
								i_1203_ = (anInt8991 - i_1203_) / anInt8991;
								i_1202_ += i_1203_;
								i_1200_ += anInt9004 * i_1203_;
								i_1201_ += anInt8991 * i_1203_;
								i_1199_ += i_1203_;
							}
							if ((i_1203_ = (i_1201_ - anInt8991) / anInt8991) > i_1202_)
								i_1202_ = i_1203_;
							int i_1204_ = is[i_1198_] - i;
							int i_1205_ = -is_1150_[i_1198_];
							int i_1206_ = i_1204_ - (i_1199_ - anInt9003);
							if (i_1206_ > 0) {
								i_1199_ += i_1206_;
								i_1202_ += i_1206_;
								i_1200_ += anInt9004 * i_1206_;
								i_1201_ += anInt8991 * i_1206_;
							} else
								i_1205_ -= i_1206_;
							if (i_1202_ < i_1205_)
								i_1202_ = i_1205_;
							for (/**/; i_1202_ < 0; i_1202_++) {
								int i_1207_ = (((Class57_Sub1_Sub2) this).anIntArray9966[((i_1201_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010 + (i_1200_ >> 12))]);
								if (i_1207_ != 0)
									is_1152_[i_1199_++] = i_1207_;
								else
									i_1199_++;
								i_1200_ += anInt9004;
								i_1201_ += anInt8991;
							}
						}
						i_1197_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_1208_ = anInt9001;
					while (i_1208_ < 0) {
						int i_1209_ = i_1208_ + i_1151_;
						if (i_1209_ >= 0) {
							if (i_1209_ >= is.length)
								break;
							int i_1210_ = anInt9003;
							int i_1211_ = anInt8988 + anInt9012;
							int i_1212_ = anInt9011 + anInt9013;
							int i_1213_ = anInt8999;
							int i_1214_;
							if ((i_1214_ = (i_1211_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12))) >= 0) {
								i_1214_ = (anInt9004 - i_1214_) / anInt9004;
								i_1213_ += i_1214_;
								i_1211_ += anInt9004 * i_1214_;
								i_1212_ += anInt8991 * i_1214_;
								i_1210_ += i_1214_;
							}
							if ((i_1214_ = (i_1211_ - anInt9004) / anInt9004) > i_1213_)
								i_1213_ = i_1214_;
							if (i_1212_ < 0) {
								i_1214_ = (anInt8991 - 1 - i_1212_) / anInt8991;
								i_1213_ += i_1214_;
								i_1211_ += anInt9004 * i_1214_;
								i_1212_ += anInt8991 * i_1214_;
								i_1210_ += i_1214_;
							}
							if ((i_1214_ = (1 + i_1212_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_1213_)
								i_1213_ = i_1214_;
							int i_1215_ = is[i_1209_] - i;
							int i_1216_ = -is_1150_[i_1209_];
							int i_1217_ = i_1215_ - (i_1210_ - anInt9003);
							if (i_1217_ > 0) {
								i_1210_ += i_1217_;
								i_1213_ += i_1217_;
								i_1211_ += anInt9004 * i_1217_;
								i_1212_ += anInt8991 * i_1217_;
							} else
								i_1216_ -= i_1217_;
							if (i_1213_ < i_1216_)
								i_1213_ = i_1216_;
							for (/**/; i_1213_ < 0; i_1213_++) {
								int i_1218_ = (((Class57_Sub1_Sub2) this).anIntArray9966[((i_1212_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010 + (i_1211_ >> 12))]);
								if (i_1218_ != 0)
									is_1152_[i_1210_++] = i_1218_;
								else
									i_1210_++;
								i_1211_ += anInt9004;
								i_1212_ += anInt8991;
							}
						}
						i_1208_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_1219_ = anInt9001;
				while (i_1219_ < 0) {
					int i_1220_ = i_1219_ + i_1151_;
					if (i_1220_ >= 0) {
						if (i_1220_ >= is.length)
							break;
						int i_1221_ = anInt9003;
						int i_1222_ = anInt8988 + anInt9012;
						int i_1223_ = anInt9011;
						int i_1224_ = anInt8999;
						if (i_1223_ >= 0 && i_1223_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) < 0) {
							if (i_1222_ < 0) {
								int i_1225_ = (anInt9004 - 1 - i_1222_) / anInt9004;
								i_1224_ += i_1225_;
								i_1222_ += anInt9004 * i_1225_;
								i_1221_ += i_1225_;
							}
							int i_1226_;
							if ((i_1226_ = (1 + i_1222_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1224_)
								i_1224_ = i_1226_;
							int i_1227_ = is[i_1220_] - i;
							int i_1228_ = -is_1150_[i_1220_];
							int i_1229_ = i_1227_ - (i_1221_ - anInt9003);
							if (i_1229_ > 0) {
								i_1221_ += i_1229_;
								i_1224_ += i_1229_;
								i_1222_ += anInt9004 * i_1229_;
								i_1223_ += anInt8991 * i_1229_;
							} else
								i_1228_ -= i_1229_;
							if (i_1224_ < i_1228_)
								i_1224_ = i_1228_;
							for (/**/; i_1224_ < 0; i_1224_++) {
								int i_1230_ = (((Class57_Sub1_Sub2) this).anIntArray9966[((i_1223_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010 + (i_1222_ >> 12))]);
								if (i_1230_ != 0)
									is_1152_[i_1221_++] = i_1230_;
								else
									i_1221_++;
								i_1222_ += anInt9004;
							}
						}
					}
					i_1219_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				int i_1231_ = anInt9001;
				while (i_1231_ < 0) {
					int i_1232_ = i_1231_ + i_1151_;
					if (i_1232_ >= 0) {
						if (i_1232_ >= is.length)
							break;
						int i_1233_ = anInt9003;
						int i_1234_ = anInt8988 + anInt9012;
						int i_1235_ = anInt9011 + anInt9013;
						int i_1236_ = anInt8999;
						if (i_1234_ < 0) {
							int i_1237_ = (anInt9004 - 1 - i_1234_) / anInt9004;
							i_1236_ += i_1237_;
							i_1234_ += anInt9004 * i_1237_;
							i_1235_ += anInt8991 * i_1237_;
							i_1233_ += i_1237_;
						}
						int i_1238_;
						if ((i_1238_ = (1 + i_1234_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1236_)
							i_1236_ = i_1238_;
						if ((i_1238_ = i_1235_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) >= 0) {
							i_1238_ = (anInt8991 - i_1238_) / anInt8991;
							i_1236_ += i_1238_;
							i_1234_ += anInt9004 * i_1238_;
							i_1235_ += anInt8991 * i_1238_;
							i_1233_ += i_1238_;
						}
						if ((i_1238_ = (i_1235_ - anInt8991) / anInt8991) > i_1236_)
							i_1236_ = i_1238_;
						int i_1239_ = is[i_1232_] - i;
						int i_1240_ = -is_1150_[i_1232_];
						int i_1241_ = i_1239_ - (i_1233_ - anInt9003);
						if (i_1241_ > 0) {
							i_1233_ += i_1241_;
							i_1236_ += i_1241_;
							i_1234_ += anInt9004 * i_1241_;
							i_1235_ += anInt8991 * i_1241_;
						} else
							i_1240_ -= i_1241_;
						if (i_1236_ < i_1240_)
							i_1236_ = i_1240_;
						for (/**/; i_1236_ < 0; i_1236_++) {
							int i_1242_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_1235_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_1234_ >> 12))]);
							if (i_1242_ != 0)
								is_1152_[i_1233_++] = i_1242_;
							else
								i_1233_++;
							i_1234_ += anInt9004;
							i_1235_ += anInt8991;
						}
					}
					i_1231_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				int i_1243_ = anInt9001;
				while (i_1243_ < 0) {
					int i_1244_ = i_1243_ + i_1151_;
					if (i_1244_ >= 0) {
						if (i_1244_ >= is.length)
							break;
						int i_1245_ = anInt9003;
						int i_1246_ = anInt8988 + anInt9012;
						int i_1247_ = anInt9011 + anInt9013;
						int i_1248_ = anInt8999;
						if (i_1246_ < 0) {
							int i_1249_ = (anInt9004 - 1 - i_1246_) / anInt9004;
							i_1248_ += i_1249_;
							i_1246_ += anInt9004 * i_1249_;
							i_1247_ += anInt8991 * i_1249_;
							i_1245_ += i_1249_;
						}
						int i_1250_;
						if ((i_1250_ = (1 + i_1246_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_1248_)
							i_1248_ = i_1250_;
						if (i_1247_ < 0) {
							i_1250_ = (anInt8991 - 1 - i_1247_) / anInt8991;
							i_1248_ += i_1250_;
							i_1246_ += anInt9004 * i_1250_;
							i_1247_ += anInt8991 * i_1250_;
							i_1245_ += i_1250_;
						}
						if ((i_1250_ = (1 + i_1247_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_1248_)
							i_1248_ = i_1250_;
						int i_1251_ = is[i_1244_] - i;
						int i_1252_ = -is_1150_[i_1244_];
						int i_1253_ = i_1251_ - (i_1245_ - anInt9003);
						if (i_1253_ > 0) {
							i_1245_ += i_1253_;
							i_1248_ += i_1253_;
							i_1246_ += anInt9004 * i_1253_;
							i_1247_ += anInt8991 * i_1253_;
						} else
							i_1252_ -= i_1253_;
						if (i_1248_ < i_1252_)
							i_1248_ = i_1252_;
						for (/**/; i_1248_ < 0; i_1248_++) {
							int i_1254_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_1247_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_1246_ >> 12))]);
							if (i_1254_ != 0)
								is_1152_[i_1245_++] = i_1254_;
							else
								i_1245_++;
							i_1246_ += anInt9004;
							i_1247_ += anInt8991;
						}
					}
					i_1243_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	public Interface8_Impl1_Impl1 method647() {
		return new Class24(((Class57_Sub1_Sub2) this).anInt9010, ((Class57_Sub1_Sub2) this).anInt8989, ((Class57_Sub1_Sub2) this).anIntArray9966);
	}

	public Interface8_Impl1_Impl1 method646() {
		return new Class24(((Class57_Sub1_Sub2) this).anInt9010, ((Class57_Sub1_Sub2) this).anInt8989, ((Class57_Sub1_Sub2) this).anIntArray9966);
	}

	public void method649(int i, int i_1255_, int i_1256_, int i_1257_, int i_1258_) {
		if (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			int i_1259_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			i += ((Class57_Sub1_Sub2) this).anInt8990;
			i_1255_ += ((Class57_Sub1_Sub2) this).anInt9000;
			int i_1260_ = i_1255_ * i_1259_ + i;
			int i_1261_ = 0;
			int i_1262_ = ((Class57_Sub1_Sub2) this).anInt8989;
			int i_1263_ = ((Class57_Sub1_Sub2) this).anInt9010;
			int i_1264_ = i_1259_ - i_1263_;
			int i_1265_ = 0;
			if (i_1255_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_1266_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_1255_);
				i_1262_ -= i_1266_;
				i_1255_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_1261_ += i_1266_ * i_1263_;
				i_1260_ += i_1266_ * i_1259_;
			}
			if (i_1255_ + i_1262_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_1262_ -= (i_1255_ + i_1262_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_1267_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_1263_ -= i_1267_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_1261_ += i_1267_;
				i_1260_ += i_1267_;
				i_1265_ += i_1267_;
				i_1264_ += i_1267_;
			}
			if (i + i_1263_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_1268_ = (i + i_1263_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
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
								is[i_1260_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
								is[i_1260_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
								is[i_1260_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
								is[i_1260_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
							}
							i_1270_ += 3;
							while (i_1260_ < i_1270_)
								is[i_1260_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else if (i_1256_ == 0) {
						int i_1271_ = (i_1257_ & 0xff0000) >> 16;
						int i_1272_ = (i_1257_ & 0xff00) >> 8;
						int i_1273_ = i_1257_ & 0xff;
						for (int i_1274_ = -i_1262_; i_1274_ < 0; i_1274_++) {
							for (int i_1275_ = -i_1263_; i_1275_ < 0; i_1275_++) {
								int i_1276_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
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
								int i_1282_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
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
								int i_1292_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
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
							int i_1294_ = i_1260_ + i_1263_ - 3;
							while (i_1260_ < i_1294_) {
								int i_1295_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
								if (i_1295_ != 0)
									is[i_1260_++] = i_1295_;
								else
									i_1260_++;
								i_1295_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
								if (i_1295_ != 0)
									is[i_1260_++] = i_1295_;
								else
									i_1260_++;
								i_1295_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
								if (i_1295_ != 0)
									is[i_1260_++] = i_1295_;
								else
									i_1260_++;
								i_1295_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
								if (i_1295_ != 0)
									is[i_1260_++] = i_1295_;
								else
									i_1260_++;
							}
							i_1294_ += 3;
							while (i_1260_ < i_1294_) {
								int i_1296_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
								if (i_1296_ != 0)
									is[i_1260_++] = i_1296_;
								else
									i_1260_++;
							}
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else if (i_1256_ == 0) {
						if ((i_1257_ & 0xffffff) == 16777215) {
							int i_1297_ = i_1257_ >>> 24;
							int i_1298_ = 256 - i_1297_;
							for (int i_1299_ = -i_1262_; i_1299_ < 0; i_1299_++) {
								for (int i_1300_ = -i_1263_; i_1300_ < 0; i_1300_++) {
									int i_1301_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
									if (i_1301_ != 0) {
										int i_1302_ = is[i_1260_];
										is[i_1260_++] = ((((i_1301_ & 0xff00ff) * i_1297_ + ((i_1302_ & 0xff00ff) * i_1298_)) & ~0xff00ff) + (((i_1301_ & 0xff00) * i_1297_ + ((i_1302_ & 0xff00) * i_1298_)) & 0xff0000)) >> 8;
									} else
										i_1260_++;
								}
								i_1260_ += i_1264_;
								i_1261_ += i_1265_;
							}
						} else {
							int i_1303_ = (i_1257_ & 0xff0000) >> 16;
							int i_1304_ = (i_1257_ & 0xff00) >> 8;
							int i_1305_ = i_1257_ & 0xff;
							int i_1306_ = i_1257_ >>> 24;
							int i_1307_ = 256 - i_1306_;
							for (int i_1308_ = -i_1262_; i_1308_ < 0; i_1308_++) {
								for (int i_1309_ = -i_1263_; i_1309_ < 0; i_1309_++) {
									int i_1310_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
									if (i_1310_ != 0) {
										if (i_1306_ != 255) {
											int i_1311_ = (((i_1310_ & 0xff0000) * i_1303_) & ~0xffffff);
											int i_1312_ = ((i_1310_ & 0xff00) * i_1304_ & 0xff0000);
											int i_1313_ = ((i_1310_ & 0xff) * i_1305_ & 0xff00);
											i_1310_ = (i_1311_ | i_1312_ | i_1313_) >>> 8;
											int i_1314_ = is[i_1260_];
											is[i_1260_++] = (((((i_1310_ & 0xff00ff) * i_1306_) + ((i_1314_ & 0xff00ff) * i_1307_)) & ~0xff00ff) + ((((i_1310_ & 0xff00) * i_1306_) + ((i_1314_ & 0xff00) * i_1307_)) & 0xff0000)) >> 8;
										} else {
											int i_1315_ = (((i_1310_ & 0xff0000) * i_1303_) & ~0xffffff);
											int i_1316_ = ((i_1310_ & 0xff00) * i_1304_ & 0xff0000);
											int i_1317_ = ((i_1310_ & 0xff) * i_1305_ & 0xff00);
											is[i_1260_++] = (i_1315_ | i_1316_ | i_1317_) >>> 8;
										}
									} else
										i_1260_++;
								}
								i_1260_ += i_1264_;
								i_1261_ += i_1265_;
							}
						}
					} else if (i_1256_ == 3) {
						int i_1318_ = i_1257_ >>> 24;
						int i_1319_ = 256 - i_1318_;
						for (int i_1320_ = -i_1262_; i_1320_ < 0; i_1320_++) {
							for (int i_1321_ = -i_1263_; i_1321_ < 0; i_1321_++) {
								int i_1322_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
								int i_1323_ = i_1322_ + i_1257_;
								int i_1324_ = ((i_1322_ & 0xff00ff) + (i_1257_ & 0xff00ff));
								int i_1325_ = ((i_1324_ & 0x1000100) + (i_1323_ - i_1324_ & 0x10000));
								i_1325_ = i_1323_ - i_1325_ | i_1325_ - (i_1325_ >>> 8);
								if (i_1322_ == 0 && i_1318_ != 255) {
									i_1322_ = i_1325_;
									i_1325_ = is[i_1260_];
									i_1325_ = ((((i_1322_ & 0xff00ff) * i_1318_ + (i_1325_ & 0xff00ff) * i_1319_) & ~0xff00ff) + (((i_1322_ & 0xff00) * i_1318_ + (i_1325_ & 0xff00) * i_1319_) & 0xff0000)) >> 8;
								}
								is[i_1260_++] = i_1325_;
							}
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else if (i_1256_ == 2) {
						int i_1326_ = i_1257_ >>> 24;
						int i_1327_ = 256 - i_1326_;
						int i_1328_ = (i_1257_ & 0xff00ff) * i_1327_ & ~0xff00ff;
						int i_1329_ = (i_1257_ & 0xff00) * i_1327_ & 0xff0000;
						i_1257_ = (i_1328_ | i_1329_) >>> 8;
						for (int i_1330_ = -i_1262_; i_1330_ < 0; i_1330_++) {
							for (int i_1331_ = -i_1263_; i_1331_ < 0; i_1331_++) {
								int i_1332_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
								if (i_1332_ != 0) {
									i_1328_ = ((i_1332_ & 0xff00ff) * i_1326_ & ~0xff00ff);
									i_1329_ = ((i_1332_ & 0xff00) * i_1326_ & 0xff0000);
									is[i_1260_++] = ((i_1328_ | i_1329_) >>> 8) + i_1257_;
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
						for (int i_1333_ = -i_1262_; i_1333_ < 0; i_1333_++) {
							for (int i_1334_ = -i_1263_; i_1334_ < 0; i_1334_++) {
								int i_1335_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
								if (i_1335_ != 0) {
									int i_1336_ = is[i_1260_];
									int i_1337_ = i_1335_ + i_1336_;
									int i_1338_ = ((i_1335_ & 0xff00ff) + (i_1336_ & 0xff00ff));
									i_1336_ = ((i_1338_ & 0x1000100) + (i_1337_ - i_1338_ & 0x10000));
									is[i_1260_++] = (i_1337_ - i_1336_ | i_1336_ - (i_1336_ >>> 8));
								} else
									i_1260_++;
							}
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else if (i_1256_ == 0) {
						int i_1339_ = (i_1257_ & 0xff0000) >> 16;
						int i_1340_ = (i_1257_ & 0xff00) >> 8;
						int i_1341_ = i_1257_ & 0xff;
						for (int i_1342_ = -i_1262_; i_1342_ < 0; i_1342_++) {
							for (int i_1343_ = -i_1263_; i_1343_ < 0; i_1343_++) {
								int i_1344_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
								if (i_1344_ != 0) {
									int i_1345_ = ((i_1344_ & 0xff0000) * i_1339_ & ~0xffffff);
									int i_1346_ = ((i_1344_ & 0xff00) * i_1340_ & 0xff0000);
									int i_1347_ = (i_1344_ & 0xff) * i_1341_ & 0xff00;
									i_1344_ = (i_1345_ | i_1346_ | i_1347_) >>> 8;
									int i_1348_ = is[i_1260_];
									int i_1349_ = i_1344_ + i_1348_;
									int i_1350_ = ((i_1344_ & 0xff00ff) + (i_1348_ & 0xff00ff));
									i_1348_ = ((i_1350_ & 0x1000100) + (i_1349_ - i_1350_ & 0x10000));
									is[i_1260_++] = (i_1349_ - i_1348_ | i_1348_ - (i_1348_ >>> 8));
								} else
									i_1260_++;
							}
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else if (i_1256_ == 3) {
						for (int i_1351_ = -i_1262_; i_1351_ < 0; i_1351_++) {
							for (int i_1352_ = -i_1263_; i_1352_ < 0; i_1352_++) {
								int i_1353_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
								int i_1354_ = i_1353_ + i_1257_;
								int i_1355_ = ((i_1353_ & 0xff00ff) + (i_1257_ & 0xff00ff));
								int i_1356_ = ((i_1355_ & 0x1000100) + (i_1354_ - i_1355_ & 0x10000));
								i_1353_ = i_1354_ - i_1356_ | i_1356_ - (i_1356_ >>> 8);
								i_1356_ = is[i_1260_];
								i_1354_ = i_1353_ + i_1356_;
								i_1355_ = (i_1353_ & 0xff00ff) + (i_1356_ & 0xff00ff);
								i_1356_ = ((i_1355_ & 0x1000100) + (i_1354_ - i_1355_ & 0x10000));
								is[i_1260_++] = i_1354_ - i_1356_ | i_1356_ - (i_1356_ >>> 8);
							}
							i_1260_ += i_1264_;
							i_1261_ += i_1265_;
						}
					} else if (i_1256_ == 2) {
						int i_1357_ = i_1257_ >>> 24;
						int i_1358_ = 256 - i_1357_;
						int i_1359_ = (i_1257_ & 0xff00ff) * i_1358_ & ~0xff00ff;
						int i_1360_ = (i_1257_ & 0xff00) * i_1358_ & 0xff0000;
						i_1257_ = (i_1359_ | i_1360_) >>> 8;
						for (int i_1361_ = -i_1262_; i_1361_ < 0; i_1361_++) {
							for (int i_1362_ = -i_1263_; i_1362_ < 0; i_1362_++) {
								int i_1363_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1261_++]);
								if (i_1363_ != 0) {
									i_1359_ = ((i_1363_ & 0xff00ff) * i_1357_ & ~0xff00ff);
									i_1360_ = ((i_1363_ & 0xff00) * i_1357_ & 0xff0000);
									i_1363_ = (((i_1359_ | i_1360_) >>> 8) + i_1257_);
									int i_1364_ = is[i_1260_];
									int i_1365_ = i_1363_ + i_1364_;
									int i_1366_ = ((i_1363_ & 0xff00ff) + (i_1364_ & 0xff00ff));
									i_1364_ = ((i_1366_ & 0x1000100) + (i_1365_ - i_1366_ & 0x10000));
									is[i_1260_++] = (i_1365_ - i_1364_ | i_1364_ - (i_1364_ >>> 8));
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

	public void method674(int i, int i_1367_, int i_1368_, int i_1369_, int i_1370_) {
		if (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			int i_1371_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			i += ((Class57_Sub1_Sub2) this).anInt8990;
			i_1367_ += ((Class57_Sub1_Sub2) this).anInt9000;
			int i_1372_ = i_1367_ * i_1371_ + i;
			int i_1373_ = 0;
			int i_1374_ = ((Class57_Sub1_Sub2) this).anInt8989;
			int i_1375_ = ((Class57_Sub1_Sub2) this).anInt9010;
			int i_1376_ = i_1371_ - i_1375_;
			int i_1377_ = 0;
			if (i_1367_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_1378_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_1367_);
				i_1374_ -= i_1378_;
				i_1367_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_1373_ += i_1378_ * i_1375_;
				i_1372_ += i_1378_ * i_1371_;
			}
			if (i_1367_ + i_1374_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_1374_ -= (i_1367_ + i_1374_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_1379_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_1375_ -= i_1379_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_1373_ += i_1379_;
				i_1372_ += i_1379_;
				i_1377_ += i_1379_;
				i_1376_ += i_1379_;
			}
			if (i + i_1375_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_1380_ = (i + i_1375_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_1375_ -= i_1380_;
				i_1377_ += i_1380_;
				i_1376_ += i_1380_;
			}
			if (i_1375_ > 0 && i_1374_ > 0) {
				if (i_1370_ == 0) {
					if (i_1368_ == 1) {
						for (int i_1381_ = -i_1374_; i_1381_ < 0; i_1381_++) {
							int i_1382_ = i_1372_ + i_1375_ - 3;
							while (i_1372_ < i_1382_) {
								is[i_1372_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								is[i_1372_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								is[i_1372_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								is[i_1372_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
							}
							i_1382_ += 3;
							while (i_1372_ < i_1382_)
								is[i_1372_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
							i_1372_ += i_1376_;
							i_1373_ += i_1377_;
						}
					} else if (i_1368_ == 0) {
						int i_1383_ = (i_1369_ & 0xff0000) >> 16;
						int i_1384_ = (i_1369_ & 0xff00) >> 8;
						int i_1385_ = i_1369_ & 0xff;
						for (int i_1386_ = -i_1374_; i_1386_ < 0; i_1386_++) {
							for (int i_1387_ = -i_1375_; i_1387_ < 0; i_1387_++) {
								int i_1388_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								int i_1389_ = ((i_1388_ & 0xff0000) * i_1383_ & ~0xffffff);
								int i_1390_ = (i_1388_ & 0xff00) * i_1384_ & 0xff0000;
								int i_1391_ = (i_1388_ & 0xff) * i_1385_ & 0xff00;
								is[i_1372_++] = (i_1389_ | i_1390_ | i_1391_) >>> 8;
							}
							i_1372_ += i_1376_;
							i_1373_ += i_1377_;
						}
					} else if (i_1368_ == 3) {
						for (int i_1392_ = -i_1374_; i_1392_ < 0; i_1392_++) {
							for (int i_1393_ = -i_1375_; i_1393_ < 0; i_1393_++) {
								int i_1394_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								int i_1395_ = i_1394_ + i_1369_;
								int i_1396_ = ((i_1394_ & 0xff00ff) + (i_1369_ & 0xff00ff));
								int i_1397_ = ((i_1396_ & 0x1000100) + (i_1395_ - i_1396_ & 0x10000));
								is[i_1372_++] = i_1395_ - i_1397_ | i_1397_ - (i_1397_ >>> 8);
							}
							i_1372_ += i_1376_;
							i_1373_ += i_1377_;
						}
					} else if (i_1368_ == 2) {
						int i_1398_ = i_1369_ >>> 24;
						int i_1399_ = 256 - i_1398_;
						int i_1400_ = (i_1369_ & 0xff00ff) * i_1399_ & ~0xff00ff;
						int i_1401_ = (i_1369_ & 0xff00) * i_1399_ & 0xff0000;
						i_1369_ = (i_1400_ | i_1401_) >>> 8;
						for (int i_1402_ = -i_1374_; i_1402_ < 0; i_1402_++) {
							for (int i_1403_ = -i_1375_; i_1403_ < 0; i_1403_++) {
								int i_1404_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								i_1400_ = ((i_1404_ & 0xff00ff) * i_1398_ & ~0xff00ff);
								i_1401_ = (i_1404_ & 0xff00) * i_1398_ & 0xff0000;
								is[i_1372_++] = ((i_1400_ | i_1401_) >>> 8) + i_1369_;
							}
							i_1372_ += i_1376_;
							i_1373_ += i_1377_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1370_ == 1) {
					if (i_1368_ == 1) {
						for (int i_1405_ = -i_1374_; i_1405_ < 0; i_1405_++) {
							int i_1406_ = i_1372_ + i_1375_ - 3;
							while (i_1372_ < i_1406_) {
								int i_1407_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								if (i_1407_ != 0)
									is[i_1372_++] = i_1407_;
								else
									i_1372_++;
								i_1407_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								if (i_1407_ != 0)
									is[i_1372_++] = i_1407_;
								else
									i_1372_++;
								i_1407_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								if (i_1407_ != 0)
									is[i_1372_++] = i_1407_;
								else
									i_1372_++;
								i_1407_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								if (i_1407_ != 0)
									is[i_1372_++] = i_1407_;
								else
									i_1372_++;
							}
							i_1406_ += 3;
							while (i_1372_ < i_1406_) {
								int i_1408_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								if (i_1408_ != 0)
									is[i_1372_++] = i_1408_;
								else
									i_1372_++;
							}
							i_1372_ += i_1376_;
							i_1373_ += i_1377_;
						}
					} else if (i_1368_ == 0) {
						if ((i_1369_ & 0xffffff) == 16777215) {
							int i_1409_ = i_1369_ >>> 24;
							int i_1410_ = 256 - i_1409_;
							for (int i_1411_ = -i_1374_; i_1411_ < 0; i_1411_++) {
								for (int i_1412_ = -i_1375_; i_1412_ < 0; i_1412_++) {
									int i_1413_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
									if (i_1413_ != 0) {
										int i_1414_ = is[i_1372_];
										is[i_1372_++] = ((((i_1413_ & 0xff00ff) * i_1409_ + ((i_1414_ & 0xff00ff) * i_1410_)) & ~0xff00ff) + (((i_1413_ & 0xff00) * i_1409_ + ((i_1414_ & 0xff00) * i_1410_)) & 0xff0000)) >> 8;
									} else
										i_1372_++;
								}
								i_1372_ += i_1376_;
								i_1373_ += i_1377_;
							}
						} else {
							int i_1415_ = (i_1369_ & 0xff0000) >> 16;
							int i_1416_ = (i_1369_ & 0xff00) >> 8;
							int i_1417_ = i_1369_ & 0xff;
							int i_1418_ = i_1369_ >>> 24;
							int i_1419_ = 256 - i_1418_;
							for (int i_1420_ = -i_1374_; i_1420_ < 0; i_1420_++) {
								for (int i_1421_ = -i_1375_; i_1421_ < 0; i_1421_++) {
									int i_1422_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
									if (i_1422_ != 0) {
										if (i_1418_ != 255) {
											int i_1423_ = (((i_1422_ & 0xff0000) * i_1415_) & ~0xffffff);
											int i_1424_ = ((i_1422_ & 0xff00) * i_1416_ & 0xff0000);
											int i_1425_ = ((i_1422_ & 0xff) * i_1417_ & 0xff00);
											i_1422_ = (i_1423_ | i_1424_ | i_1425_) >>> 8;
											int i_1426_ = is[i_1372_];
											is[i_1372_++] = (((((i_1422_ & 0xff00ff) * i_1418_) + ((i_1426_ & 0xff00ff) * i_1419_)) & ~0xff00ff) + ((((i_1422_ & 0xff00) * i_1418_) + ((i_1426_ & 0xff00) * i_1419_)) & 0xff0000)) >> 8;
										} else {
											int i_1427_ = (((i_1422_ & 0xff0000) * i_1415_) & ~0xffffff);
											int i_1428_ = ((i_1422_ & 0xff00) * i_1416_ & 0xff0000);
											int i_1429_ = ((i_1422_ & 0xff) * i_1417_ & 0xff00);
											is[i_1372_++] = (i_1427_ | i_1428_ | i_1429_) >>> 8;
										}
									} else
										i_1372_++;
								}
								i_1372_ += i_1376_;
								i_1373_ += i_1377_;
							}
						}
					} else if (i_1368_ == 3) {
						int i_1430_ = i_1369_ >>> 24;
						int i_1431_ = 256 - i_1430_;
						for (int i_1432_ = -i_1374_; i_1432_ < 0; i_1432_++) {
							for (int i_1433_ = -i_1375_; i_1433_ < 0; i_1433_++) {
								int i_1434_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								int i_1435_ = i_1434_ + i_1369_;
								int i_1436_ = ((i_1434_ & 0xff00ff) + (i_1369_ & 0xff00ff));
								int i_1437_ = ((i_1436_ & 0x1000100) + (i_1435_ - i_1436_ & 0x10000));
								i_1437_ = i_1435_ - i_1437_ | i_1437_ - (i_1437_ >>> 8);
								if (i_1434_ == 0 && i_1430_ != 255) {
									i_1434_ = i_1437_;
									i_1437_ = is[i_1372_];
									i_1437_ = ((((i_1434_ & 0xff00ff) * i_1430_ + (i_1437_ & 0xff00ff) * i_1431_) & ~0xff00ff) + (((i_1434_ & 0xff00) * i_1430_ + (i_1437_ & 0xff00) * i_1431_) & 0xff0000)) >> 8;
								}
								is[i_1372_++] = i_1437_;
							}
							i_1372_ += i_1376_;
							i_1373_ += i_1377_;
						}
					} else if (i_1368_ == 2) {
						int i_1438_ = i_1369_ >>> 24;
						int i_1439_ = 256 - i_1438_;
						int i_1440_ = (i_1369_ & 0xff00ff) * i_1439_ & ~0xff00ff;
						int i_1441_ = (i_1369_ & 0xff00) * i_1439_ & 0xff0000;
						i_1369_ = (i_1440_ | i_1441_) >>> 8;
						for (int i_1442_ = -i_1374_; i_1442_ < 0; i_1442_++) {
							for (int i_1443_ = -i_1375_; i_1443_ < 0; i_1443_++) {
								int i_1444_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								if (i_1444_ != 0) {
									i_1440_ = ((i_1444_ & 0xff00ff) * i_1438_ & ~0xff00ff);
									i_1441_ = ((i_1444_ & 0xff00) * i_1438_ & 0xff0000);
									is[i_1372_++] = ((i_1440_ | i_1441_) >>> 8) + i_1369_;
								} else
									i_1372_++;
							}
							i_1372_ += i_1376_;
							i_1373_ += i_1377_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1370_ == 2) {
					if (i_1368_ == 1) {
						for (int i_1445_ = -i_1374_; i_1445_ < 0; i_1445_++) {
							for (int i_1446_ = -i_1375_; i_1446_ < 0; i_1446_++) {
								int i_1447_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								if (i_1447_ != 0) {
									int i_1448_ = is[i_1372_];
									int i_1449_ = i_1447_ + i_1448_;
									int i_1450_ = ((i_1447_ & 0xff00ff) + (i_1448_ & 0xff00ff));
									i_1448_ = ((i_1450_ & 0x1000100) + (i_1449_ - i_1450_ & 0x10000));
									is[i_1372_++] = (i_1449_ - i_1448_ | i_1448_ - (i_1448_ >>> 8));
								} else
									i_1372_++;
							}
							i_1372_ += i_1376_;
							i_1373_ += i_1377_;
						}
					} else if (i_1368_ == 0) {
						int i_1451_ = (i_1369_ & 0xff0000) >> 16;
						int i_1452_ = (i_1369_ & 0xff00) >> 8;
						int i_1453_ = i_1369_ & 0xff;
						for (int i_1454_ = -i_1374_; i_1454_ < 0; i_1454_++) {
							for (int i_1455_ = -i_1375_; i_1455_ < 0; i_1455_++) {
								int i_1456_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								if (i_1456_ != 0) {
									int i_1457_ = ((i_1456_ & 0xff0000) * i_1451_ & ~0xffffff);
									int i_1458_ = ((i_1456_ & 0xff00) * i_1452_ & 0xff0000);
									int i_1459_ = (i_1456_ & 0xff) * i_1453_ & 0xff00;
									i_1456_ = (i_1457_ | i_1458_ | i_1459_) >>> 8;
									int i_1460_ = is[i_1372_];
									int i_1461_ = i_1456_ + i_1460_;
									int i_1462_ = ((i_1456_ & 0xff00ff) + (i_1460_ & 0xff00ff));
									i_1460_ = ((i_1462_ & 0x1000100) + (i_1461_ - i_1462_ & 0x10000));
									is[i_1372_++] = (i_1461_ - i_1460_ | i_1460_ - (i_1460_ >>> 8));
								} else
									i_1372_++;
							}
							i_1372_ += i_1376_;
							i_1373_ += i_1377_;
						}
					} else if (i_1368_ == 3) {
						for (int i_1463_ = -i_1374_; i_1463_ < 0; i_1463_++) {
							for (int i_1464_ = -i_1375_; i_1464_ < 0; i_1464_++) {
								int i_1465_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								int i_1466_ = i_1465_ + i_1369_;
								int i_1467_ = ((i_1465_ & 0xff00ff) + (i_1369_ & 0xff00ff));
								int i_1468_ = ((i_1467_ & 0x1000100) + (i_1466_ - i_1467_ & 0x10000));
								i_1465_ = i_1466_ - i_1468_ | i_1468_ - (i_1468_ >>> 8);
								i_1468_ = is[i_1372_];
								i_1466_ = i_1465_ + i_1468_;
								i_1467_ = (i_1465_ & 0xff00ff) + (i_1468_ & 0xff00ff);
								i_1468_ = ((i_1467_ & 0x1000100) + (i_1466_ - i_1467_ & 0x10000));
								is[i_1372_++] = i_1466_ - i_1468_ | i_1468_ - (i_1468_ >>> 8);
							}
							i_1372_ += i_1376_;
							i_1373_ += i_1377_;
						}
					} else if (i_1368_ == 2) {
						int i_1469_ = i_1369_ >>> 24;
						int i_1470_ = 256 - i_1469_;
						int i_1471_ = (i_1369_ & 0xff00ff) * i_1470_ & ~0xff00ff;
						int i_1472_ = (i_1369_ & 0xff00) * i_1470_ & 0xff0000;
						i_1369_ = (i_1471_ | i_1472_) >>> 8;
						for (int i_1473_ = -i_1374_; i_1473_ < 0; i_1473_++) {
							for (int i_1474_ = -i_1375_; i_1474_ < 0; i_1474_++) {
								int i_1475_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1373_++]);
								if (i_1475_ != 0) {
									i_1471_ = ((i_1475_ & 0xff00ff) * i_1469_ & ~0xff00ff);
									i_1472_ = ((i_1475_ & 0xff00) * i_1469_ & 0xff0000);
									i_1475_ = (((i_1471_ | i_1472_) >>> 8) + i_1369_);
									int i_1476_ = is[i_1372_];
									int i_1477_ = i_1475_ + i_1476_;
									int i_1478_ = ((i_1475_ & 0xff00ff) + (i_1476_ & 0xff00ff));
									i_1476_ = ((i_1478_ & 0x1000100) + (i_1477_ - i_1478_ & 0x10000));
									is[i_1372_++] = (i_1477_ - i_1476_ | i_1476_ - (i_1476_ >>> 8));
								} else
									i_1372_++;
							}
							i_1372_ += i_1376_;
							i_1373_ += i_1377_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method643(int i, int i_1479_, int i_1480_, int i_1481_, int i_1482_) {
		if (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			int i_1483_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			i += ((Class57_Sub1_Sub2) this).anInt8990;
			i_1479_ += ((Class57_Sub1_Sub2) this).anInt9000;
			int i_1484_ = i_1479_ * i_1483_ + i;
			int i_1485_ = 0;
			int i_1486_ = ((Class57_Sub1_Sub2) this).anInt8989;
			int i_1487_ = ((Class57_Sub1_Sub2) this).anInt9010;
			int i_1488_ = i_1483_ - i_1487_;
			int i_1489_ = 0;
			if (i_1479_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_1490_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_1479_);
				i_1486_ -= i_1490_;
				i_1479_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_1485_ += i_1490_ * i_1487_;
				i_1484_ += i_1490_ * i_1483_;
			}
			if (i_1479_ + i_1486_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_1486_ -= (i_1479_ + i_1486_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_1491_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_1487_ -= i_1491_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_1485_ += i_1491_;
				i_1484_ += i_1491_;
				i_1489_ += i_1491_;
				i_1488_ += i_1491_;
			}
			if (i + i_1487_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_1492_ = (i + i_1487_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_1487_ -= i_1492_;
				i_1489_ += i_1492_;
				i_1488_ += i_1492_;
			}
			if (i_1487_ > 0 && i_1486_ > 0) {
				if (i_1482_ == 0) {
					if (i_1480_ == 1) {
						for (int i_1493_ = -i_1486_; i_1493_ < 0; i_1493_++) {
							int i_1494_ = i_1484_ + i_1487_ - 3;
							while (i_1484_ < i_1494_) {
								is[i_1484_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								is[i_1484_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								is[i_1484_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								is[i_1484_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
							}
							i_1494_ += 3;
							while (i_1484_ < i_1494_)
								is[i_1484_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
							i_1484_ += i_1488_;
							i_1485_ += i_1489_;
						}
					} else if (i_1480_ == 0) {
						int i_1495_ = (i_1481_ & 0xff0000) >> 16;
						int i_1496_ = (i_1481_ & 0xff00) >> 8;
						int i_1497_ = i_1481_ & 0xff;
						for (int i_1498_ = -i_1486_; i_1498_ < 0; i_1498_++) {
							for (int i_1499_ = -i_1487_; i_1499_ < 0; i_1499_++) {
								int i_1500_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								int i_1501_ = ((i_1500_ & 0xff0000) * i_1495_ & ~0xffffff);
								int i_1502_ = (i_1500_ & 0xff00) * i_1496_ & 0xff0000;
								int i_1503_ = (i_1500_ & 0xff) * i_1497_ & 0xff00;
								is[i_1484_++] = (i_1501_ | i_1502_ | i_1503_) >>> 8;
							}
							i_1484_ += i_1488_;
							i_1485_ += i_1489_;
						}
					} else if (i_1480_ == 3) {
						for (int i_1504_ = -i_1486_; i_1504_ < 0; i_1504_++) {
							for (int i_1505_ = -i_1487_; i_1505_ < 0; i_1505_++) {
								int i_1506_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								int i_1507_ = i_1506_ + i_1481_;
								int i_1508_ = ((i_1506_ & 0xff00ff) + (i_1481_ & 0xff00ff));
								int i_1509_ = ((i_1508_ & 0x1000100) + (i_1507_ - i_1508_ & 0x10000));
								is[i_1484_++] = i_1507_ - i_1509_ | i_1509_ - (i_1509_ >>> 8);
							}
							i_1484_ += i_1488_;
							i_1485_ += i_1489_;
						}
					} else if (i_1480_ == 2) {
						int i_1510_ = i_1481_ >>> 24;
						int i_1511_ = 256 - i_1510_;
						int i_1512_ = (i_1481_ & 0xff00ff) * i_1511_ & ~0xff00ff;
						int i_1513_ = (i_1481_ & 0xff00) * i_1511_ & 0xff0000;
						i_1481_ = (i_1512_ | i_1513_) >>> 8;
						for (int i_1514_ = -i_1486_; i_1514_ < 0; i_1514_++) {
							for (int i_1515_ = -i_1487_; i_1515_ < 0; i_1515_++) {
								int i_1516_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								i_1512_ = ((i_1516_ & 0xff00ff) * i_1510_ & ~0xff00ff);
								i_1513_ = (i_1516_ & 0xff00) * i_1510_ & 0xff0000;
								is[i_1484_++] = ((i_1512_ | i_1513_) >>> 8) + i_1481_;
							}
							i_1484_ += i_1488_;
							i_1485_ += i_1489_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1482_ == 1) {
					if (i_1480_ == 1) {
						for (int i_1517_ = -i_1486_; i_1517_ < 0; i_1517_++) {
							int i_1518_ = i_1484_ + i_1487_ - 3;
							while (i_1484_ < i_1518_) {
								int i_1519_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								if (i_1519_ != 0)
									is[i_1484_++] = i_1519_;
								else
									i_1484_++;
								i_1519_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								if (i_1519_ != 0)
									is[i_1484_++] = i_1519_;
								else
									i_1484_++;
								i_1519_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								if (i_1519_ != 0)
									is[i_1484_++] = i_1519_;
								else
									i_1484_++;
								i_1519_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								if (i_1519_ != 0)
									is[i_1484_++] = i_1519_;
								else
									i_1484_++;
							}
							i_1518_ += 3;
							while (i_1484_ < i_1518_) {
								int i_1520_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								if (i_1520_ != 0)
									is[i_1484_++] = i_1520_;
								else
									i_1484_++;
							}
							i_1484_ += i_1488_;
							i_1485_ += i_1489_;
						}
					} else if (i_1480_ == 0) {
						if ((i_1481_ & 0xffffff) == 16777215) {
							int i_1521_ = i_1481_ >>> 24;
							int i_1522_ = 256 - i_1521_;
							for (int i_1523_ = -i_1486_; i_1523_ < 0; i_1523_++) {
								for (int i_1524_ = -i_1487_; i_1524_ < 0; i_1524_++) {
									int i_1525_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
									if (i_1525_ != 0) {
										int i_1526_ = is[i_1484_];
										is[i_1484_++] = ((((i_1525_ & 0xff00ff) * i_1521_ + ((i_1526_ & 0xff00ff) * i_1522_)) & ~0xff00ff) + (((i_1525_ & 0xff00) * i_1521_ + ((i_1526_ & 0xff00) * i_1522_)) & 0xff0000)) >> 8;
									} else
										i_1484_++;
								}
								i_1484_ += i_1488_;
								i_1485_ += i_1489_;
							}
						} else {
							int i_1527_ = (i_1481_ & 0xff0000) >> 16;
							int i_1528_ = (i_1481_ & 0xff00) >> 8;
							int i_1529_ = i_1481_ & 0xff;
							int i_1530_ = i_1481_ >>> 24;
							int i_1531_ = 256 - i_1530_;
							for (int i_1532_ = -i_1486_; i_1532_ < 0; i_1532_++) {
								for (int i_1533_ = -i_1487_; i_1533_ < 0; i_1533_++) {
									int i_1534_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
									if (i_1534_ != 0) {
										if (i_1530_ != 255) {
											int i_1535_ = (((i_1534_ & 0xff0000) * i_1527_) & ~0xffffff);
											int i_1536_ = ((i_1534_ & 0xff00) * i_1528_ & 0xff0000);
											int i_1537_ = ((i_1534_ & 0xff) * i_1529_ & 0xff00);
											i_1534_ = (i_1535_ | i_1536_ | i_1537_) >>> 8;
											int i_1538_ = is[i_1484_];
											is[i_1484_++] = (((((i_1534_ & 0xff00ff) * i_1530_) + ((i_1538_ & 0xff00ff) * i_1531_)) & ~0xff00ff) + ((((i_1534_ & 0xff00) * i_1530_) + ((i_1538_ & 0xff00) * i_1531_)) & 0xff0000)) >> 8;
										} else {
											int i_1539_ = (((i_1534_ & 0xff0000) * i_1527_) & ~0xffffff);
											int i_1540_ = ((i_1534_ & 0xff00) * i_1528_ & 0xff0000);
											int i_1541_ = ((i_1534_ & 0xff) * i_1529_ & 0xff00);
											is[i_1484_++] = (i_1539_ | i_1540_ | i_1541_) >>> 8;
										}
									} else
										i_1484_++;
								}
								i_1484_ += i_1488_;
								i_1485_ += i_1489_;
							}
						}
					} else if (i_1480_ == 3) {
						int i_1542_ = i_1481_ >>> 24;
						int i_1543_ = 256 - i_1542_;
						for (int i_1544_ = -i_1486_; i_1544_ < 0; i_1544_++) {
							for (int i_1545_ = -i_1487_; i_1545_ < 0; i_1545_++) {
								int i_1546_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								int i_1547_ = i_1546_ + i_1481_;
								int i_1548_ = ((i_1546_ & 0xff00ff) + (i_1481_ & 0xff00ff));
								int i_1549_ = ((i_1548_ & 0x1000100) + (i_1547_ - i_1548_ & 0x10000));
								i_1549_ = i_1547_ - i_1549_ | i_1549_ - (i_1549_ >>> 8);
								if (i_1546_ == 0 && i_1542_ != 255) {
									i_1546_ = i_1549_;
									i_1549_ = is[i_1484_];
									i_1549_ = ((((i_1546_ & 0xff00ff) * i_1542_ + (i_1549_ & 0xff00ff) * i_1543_) & ~0xff00ff) + (((i_1546_ & 0xff00) * i_1542_ + (i_1549_ & 0xff00) * i_1543_) & 0xff0000)) >> 8;
								}
								is[i_1484_++] = i_1549_;
							}
							i_1484_ += i_1488_;
							i_1485_ += i_1489_;
						}
					} else if (i_1480_ == 2) {
						int i_1550_ = i_1481_ >>> 24;
						int i_1551_ = 256 - i_1550_;
						int i_1552_ = (i_1481_ & 0xff00ff) * i_1551_ & ~0xff00ff;
						int i_1553_ = (i_1481_ & 0xff00) * i_1551_ & 0xff0000;
						i_1481_ = (i_1552_ | i_1553_) >>> 8;
						for (int i_1554_ = -i_1486_; i_1554_ < 0; i_1554_++) {
							for (int i_1555_ = -i_1487_; i_1555_ < 0; i_1555_++) {
								int i_1556_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								if (i_1556_ != 0) {
									i_1552_ = ((i_1556_ & 0xff00ff) * i_1550_ & ~0xff00ff);
									i_1553_ = ((i_1556_ & 0xff00) * i_1550_ & 0xff0000);
									is[i_1484_++] = ((i_1552_ | i_1553_) >>> 8) + i_1481_;
								} else
									i_1484_++;
							}
							i_1484_ += i_1488_;
							i_1485_ += i_1489_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1482_ == 2) {
					if (i_1480_ == 1) {
						for (int i_1557_ = -i_1486_; i_1557_ < 0; i_1557_++) {
							for (int i_1558_ = -i_1487_; i_1558_ < 0; i_1558_++) {
								int i_1559_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								if (i_1559_ != 0) {
									int i_1560_ = is[i_1484_];
									int i_1561_ = i_1559_ + i_1560_;
									int i_1562_ = ((i_1559_ & 0xff00ff) + (i_1560_ & 0xff00ff));
									i_1560_ = ((i_1562_ & 0x1000100) + (i_1561_ - i_1562_ & 0x10000));
									is[i_1484_++] = (i_1561_ - i_1560_ | i_1560_ - (i_1560_ >>> 8));
								} else
									i_1484_++;
							}
							i_1484_ += i_1488_;
							i_1485_ += i_1489_;
						}
					} else if (i_1480_ == 0) {
						int i_1563_ = (i_1481_ & 0xff0000) >> 16;
						int i_1564_ = (i_1481_ & 0xff00) >> 8;
						int i_1565_ = i_1481_ & 0xff;
						for (int i_1566_ = -i_1486_; i_1566_ < 0; i_1566_++) {
							for (int i_1567_ = -i_1487_; i_1567_ < 0; i_1567_++) {
								int i_1568_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								if (i_1568_ != 0) {
									int i_1569_ = ((i_1568_ & 0xff0000) * i_1563_ & ~0xffffff);
									int i_1570_ = ((i_1568_ & 0xff00) * i_1564_ & 0xff0000);
									int i_1571_ = (i_1568_ & 0xff) * i_1565_ & 0xff00;
									i_1568_ = (i_1569_ | i_1570_ | i_1571_) >>> 8;
									int i_1572_ = is[i_1484_];
									int i_1573_ = i_1568_ + i_1572_;
									int i_1574_ = ((i_1568_ & 0xff00ff) + (i_1572_ & 0xff00ff));
									i_1572_ = ((i_1574_ & 0x1000100) + (i_1573_ - i_1574_ & 0x10000));
									is[i_1484_++] = (i_1573_ - i_1572_ | i_1572_ - (i_1572_ >>> 8));
								} else
									i_1484_++;
							}
							i_1484_ += i_1488_;
							i_1485_ += i_1489_;
						}
					} else if (i_1480_ == 3) {
						for (int i_1575_ = -i_1486_; i_1575_ < 0; i_1575_++) {
							for (int i_1576_ = -i_1487_; i_1576_ < 0; i_1576_++) {
								int i_1577_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								int i_1578_ = i_1577_ + i_1481_;
								int i_1579_ = ((i_1577_ & 0xff00ff) + (i_1481_ & 0xff00ff));
								int i_1580_ = ((i_1579_ & 0x1000100) + (i_1578_ - i_1579_ & 0x10000));
								i_1577_ = i_1578_ - i_1580_ | i_1580_ - (i_1580_ >>> 8);
								i_1580_ = is[i_1484_];
								i_1578_ = i_1577_ + i_1580_;
								i_1579_ = (i_1577_ & 0xff00ff) + (i_1580_ & 0xff00ff);
								i_1580_ = ((i_1579_ & 0x1000100) + (i_1578_ - i_1579_ & 0x10000));
								is[i_1484_++] = i_1578_ - i_1580_ | i_1580_ - (i_1580_ >>> 8);
							}
							i_1484_ += i_1488_;
							i_1485_ += i_1489_;
						}
					} else if (i_1480_ == 2) {
						int i_1581_ = i_1481_ >>> 24;
						int i_1582_ = 256 - i_1581_;
						int i_1583_ = (i_1481_ & 0xff00ff) * i_1582_ & ~0xff00ff;
						int i_1584_ = (i_1481_ & 0xff00) * i_1582_ & 0xff0000;
						i_1481_ = (i_1583_ | i_1584_) >>> 8;
						for (int i_1585_ = -i_1486_; i_1585_ < 0; i_1585_++) {
							for (int i_1586_ = -i_1487_; i_1586_ < 0; i_1586_++) {
								int i_1587_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1485_++]);
								if (i_1587_ != 0) {
									i_1583_ = ((i_1587_ & 0xff00ff) * i_1581_ & ~0xff00ff);
									i_1584_ = ((i_1587_ & 0xff00) * i_1581_ & 0xff0000);
									i_1587_ = (((i_1583_ | i_1584_) >>> 8) + i_1481_);
									int i_1588_ = is[i_1484_];
									int i_1589_ = i_1587_ + i_1588_;
									int i_1590_ = ((i_1587_ & 0xff00ff) + (i_1588_ & 0xff00ff));
									i_1588_ = ((i_1590_ & 0x1000100) + (i_1589_ - i_1590_ & 0x10000));
									is[i_1484_++] = (i_1589_ - i_1588_ | i_1588_ - (i_1588_ >>> 8));
								} else
									i_1484_++;
							}
							i_1484_ += i_1488_;
							i_1485_ += i_1489_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method682(boolean bool, boolean bool_1591_, boolean bool_1592_, int i, int i_1593_, float f, int i_1594_, int i_1595_, int i_1596_, int i_1597_, int i_1598_, int i_1599_, boolean bool_1600_) {
		if (i_1594_ > 0 && i_1595_ > 0 && (bool || bool_1591_)) {
			int i_1601_ = 0;
			int i_1602_ = 0;
			int i_1603_ = (((Class57_Sub1_Sub2) this).anInt8990 + ((Class57_Sub1_Sub2) this).anInt9010 + ((Class57_Sub1_Sub2) this).anInt8997);
			int i_1604_ = (((Class57_Sub1_Sub2) this).anInt9000 + ((Class57_Sub1_Sub2) this).anInt8989 + ((Class57_Sub1_Sub2) this).anInt8993);
			int i_1605_ = (i_1603_ << 16) / i_1594_;
			int i_1606_ = (i_1604_ << 16) / i_1595_;
			if (((Class57_Sub1_Sub2) this).anInt8990 > 0) {
				int i_1607_ = (((((Class57_Sub1_Sub2) this).anInt8990 << 16) + i_1605_ - 1) / i_1605_);
				i += i_1607_;
				i_1601_ += (i_1607_ * i_1605_ - (((Class57_Sub1_Sub2) this).anInt8990 << 16));
			}
			if (((Class57_Sub1_Sub2) this).anInt9000 > 0) {
				int i_1608_ = (((((Class57_Sub1_Sub2) this).anInt9000 << 16) + i_1606_ - 1) / i_1606_);
				i_1593_ += i_1608_;
				i_1602_ += (i_1608_ * i_1606_ - (((Class57_Sub1_Sub2) this).anInt9000 << 16));
			}
			if (((Class57_Sub1_Sub2) this).anInt9010 < i_1603_)
				i_1594_ = ((((Class57_Sub1_Sub2) this).anInt9010 << 16) - i_1601_ + i_1605_ - 1) / i_1605_;
			if (((Class57_Sub1_Sub2) this).anInt8989 < i_1604_)
				i_1595_ = ((((Class57_Sub1_Sub2) this).anInt8989 << 16) - i_1602_ + i_1606_ - 1) / i_1606_;
			int i_1609_ = i + i_1593_ * ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971) * 692106883);
			int i_1610_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883) - i_1594_);
			if (i_1593_ + i_1595_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_1595_ -= (i_1593_ + i_1595_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i_1593_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_1611_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_1593_);
				i_1595_ -= i_1611_;
				i_1609_ += i_1611_ * ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971) * 692106883);
				i_1602_ += i_1606_ * i_1611_;
			}
			if (i + i_1594_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_1612_ = (i + i_1594_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_1594_ -= i_1612_;
				i_1610_ += i_1612_;
			}
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_1613_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_1594_ -= i_1613_;
				i_1609_ += i_1613_;
				i_1601_ += i_1605_ * i_1613_;
				i_1610_ += i_1613_;
			}
			float[] fs = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).aFloatArray7973);
			int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
			if (i_1598_ == 0) {
				if (i_1596_ == 1) {
					int i_1614_ = i_1601_;
					for (int i_1615_ = -i_1595_; i_1615_ < 0; i_1615_++) {
						int i_1616_ = ((i_1602_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_1617_ = -i_1594_; i_1617_ < 0; i_1617_++) {
							if (!bool_1591_ || f < fs[i_1609_]) {
								if (bool)
									is[i_1609_] = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_1601_ >> 16) + i_1616_]);
								if (bool_1591_ && bool_1600_)
									fs[i_1609_] = f;
							}
							i_1601_ += i_1605_;
							i_1609_++;
						}
						i_1602_ += i_1606_;
						i_1601_ = i_1614_;
						i_1609_ += i_1610_;
					}
				} else if (i_1596_ == 0) {
					int i_1618_ = (i_1597_ & 0xff0000) >> 16;
					int i_1619_ = (i_1597_ & 0xff00) >> 8;
					int i_1620_ = i_1597_ & 0xff;
					int i_1621_ = i_1601_;
					for (int i_1622_ = -i_1595_; i_1622_ < 0; i_1622_++) {
						int i_1623_ = ((i_1602_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_1624_ = -i_1594_; i_1624_ < 0; i_1624_++) {
							if (!bool_1591_ || f < fs[i_1609_]) {
								if (bool) {
									int i_1625_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_1601_ >> 16) + i_1623_]);
									int i_1626_ = ((i_1625_ & 0xff0000) * i_1618_ & ~0xffffff);
									int i_1627_ = ((i_1625_ & 0xff00) * i_1619_ & 0xff0000);
									int i_1628_ = (i_1625_ & 0xff) * i_1620_ & 0xff00;
									is[i_1609_] = (i_1626_ | i_1627_ | i_1628_) >>> 8;
								}
								if (bool_1591_ && bool_1600_)
									fs[i_1609_] = f;
							}
							i_1601_ += i_1605_;
							i_1609_++;
						}
						i_1602_ += i_1606_;
						i_1601_ = i_1621_;
						i_1609_ += i_1610_;
					}
				} else if (i_1596_ == 3) {
					int i_1629_ = i_1601_;
					for (int i_1630_ = -i_1595_; i_1630_ < 0; i_1630_++) {
						int i_1631_ = ((i_1602_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_1632_ = -i_1594_; i_1632_ < 0; i_1632_++) {
							if (!bool_1591_ || f < fs[i_1609_]) {
								if (bool) {
									int i_1633_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_1601_ >> 16) + i_1631_]);
									int i_1634_ = i_1633_ + i_1597_;
									int i_1635_ = ((i_1633_ & 0xff00ff) + (i_1597_ & 0xff00ff));
									int i_1636_ = ((i_1635_ & 0x1000100) + (i_1634_ - i_1635_ & 0x10000));
									is[i_1609_] = (i_1634_ - i_1636_ | i_1636_ - (i_1636_ >>> 8));
								}
								if (bool_1591_ && bool_1600_)
									fs[i_1609_] = f;
							}
							i_1601_ += i_1605_;
							i_1609_++;
						}
						i_1602_ += i_1606_;
						i_1601_ = i_1629_;
						i_1609_ += i_1610_;
					}
				} else if (i_1596_ == 2) {
					int i_1637_ = i_1597_ >>> 24;
					int i_1638_ = 256 - i_1637_;
					int i_1639_ = (i_1597_ & 0xff00ff) * i_1638_ & ~0xff00ff;
					int i_1640_ = (i_1597_ & 0xff00) * i_1638_ & 0xff0000;
					i_1597_ = (i_1639_ | i_1640_) >>> 8;
					int i_1641_ = i_1601_;
					for (int i_1642_ = -i_1595_; i_1642_ < 0; i_1642_++) {
						int i_1643_ = ((i_1602_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_1644_ = -i_1594_; i_1644_ < 0; i_1644_++) {
							if (!bool_1591_ || f < fs[i_1609_]) {
								if (bool) {
									int i_1645_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_1601_ >> 16) + i_1643_]);
									i_1639_ = ((i_1645_ & 0xff00ff) * i_1637_ & ~0xff00ff);
									i_1640_ = ((i_1645_ & 0xff00) * i_1637_ & 0xff0000);
									is[i_1609_] = (((i_1639_ | i_1640_) >>> 8) + i_1597_);
								}
								if (bool_1591_ && bool_1600_)
									fs[i_1609_] = f;
							}
							i_1601_ += i_1605_;
							i_1609_++;
						}
						i_1602_ += i_1606_;
						i_1601_ = i_1641_;
						i_1609_ += i_1610_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1598_ == 1) {
				if (i_1596_ == 1) {
					int i_1646_ = i_1601_;
					for (int i_1647_ = -i_1595_; i_1647_ < 0; i_1647_++) {
						int i_1648_ = ((i_1602_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_1649_ = -i_1594_; i_1649_ < 0; i_1649_++) {
							if (!bool_1591_ || f < fs[i_1609_]) {
								int i_1650_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_1601_ >> 16) + i_1648_]);
								if (i_1650_ != 0) {
									if (bool)
										is[i_1609_] = i_1650_;
									if (bool_1591_ && bool_1600_)
										fs[i_1609_] = f;
								}
							}
							i_1601_ += i_1605_;
							i_1609_++;
						}
						i_1602_ += i_1606_;
						i_1601_ = i_1646_;
						i_1609_ += i_1610_;
					}
				} else if (i_1596_ == 0) {
					int i_1651_ = i_1601_;
					if ((i_1597_ & 0xffffff) == 16777215) {
						int i_1652_ = i_1597_ >>> 24;
						int i_1653_ = 256 - i_1652_;
						for (int i_1654_ = -i_1595_; i_1654_ < 0; i_1654_++) {
							int i_1655_ = ((i_1602_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_1656_ = -i_1594_; i_1656_ < 0; i_1656_++) {
								if (!bool_1591_ || f < fs[i_1609_]) {
									int i_1657_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_1601_ >> 16) + i_1655_]);
									if (i_1657_ != 0) {
										if (bool) {
											int i_1658_ = is[i_1609_];
											is[i_1609_] = (((((i_1657_ & 0xff00ff) * i_1652_) + ((i_1658_ & 0xff00ff) * i_1653_)) & ~0xff00ff) + ((((i_1657_ & 0xff00) * i_1652_) + ((i_1658_ & 0xff00) * i_1653_)) & 0xff0000)) >> 8;
										}
										if (bool_1591_ && bool_1600_)
											fs[i_1609_] = f;
									}
								}
								i_1601_ += i_1605_;
								i_1609_++;
							}
							i_1602_ += i_1606_;
							i_1601_ = i_1651_;
							i_1609_ += i_1610_;
						}
					} else {
						int i_1659_ = (i_1597_ & 0xff0000) >> 16;
						int i_1660_ = (i_1597_ & 0xff00) >> 8;
						int i_1661_ = i_1597_ & 0xff;
						int i_1662_ = i_1597_ >>> 24;
						int i_1663_ = 256 - i_1662_;
						for (int i_1664_ = -i_1595_; i_1664_ < 0; i_1664_++) {
							int i_1665_ = ((i_1602_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_1666_ = -i_1594_; i_1666_ < 0; i_1666_++) {
								if (!bool_1591_ || f < fs[i_1609_]) {
									int i_1667_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_1601_ >> 16) + i_1665_]);
									if (i_1667_ != 0) {
										if (i_1662_ != 255) {
											if (bool) {
												int i_1668_ = (((i_1667_ & 0xff0000) * i_1659_) & ~0xffffff);
												int i_1669_ = (((i_1667_ & 0xff00) * i_1660_) & 0xff0000);
												int i_1670_ = (((i_1667_ & 0xff) * i_1661_) & 0xff00);
												i_1667_ = (i_1668_ | i_1669_ | i_1670_) >>> 8;
												int i_1671_ = is[i_1609_];
												is[i_1609_] = (((((i_1667_ & 0xff00ff) * i_1662_) + ((i_1671_ & 0xff00ff) * i_1663_)) & ~0xff00ff) + ((((i_1667_ & 0xff00) * i_1662_) + ((i_1671_ & 0xff00) * i_1663_)) & 0xff0000)) >> 8;
											}
											if (bool_1591_ && bool_1600_)
												fs[i_1609_] = f;
										} else {
											if (bool) {
												int i_1672_ = (((i_1667_ & 0xff0000) * i_1659_) & ~0xffffff);
												int i_1673_ = (((i_1667_ & 0xff00) * i_1660_) & 0xff0000);
												int i_1674_ = (((i_1667_ & 0xff) * i_1661_) & 0xff00);
												is[i_1609_] = (i_1672_ | i_1673_ | i_1674_) >>> 8;
											}
											if (bool_1591_ && bool_1600_)
												fs[i_1609_] = f;
										}
									}
								}
								i_1601_ += i_1605_;
								i_1609_++;
							}
							i_1602_ += i_1606_;
							i_1601_ = i_1651_;
							i_1609_ += i_1610_;
						}
					}
				} else if (i_1596_ == 3) {
					int i_1675_ = i_1601_;
					int i_1676_ = i_1597_ >>> 24;
					int i_1677_ = 256 - i_1676_;
					for (int i_1678_ = -i_1595_; i_1678_ < 0; i_1678_++) {
						int i_1679_ = ((i_1602_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_1680_ = -i_1594_; i_1680_ < 0; i_1680_++) {
							if (!bool_1591_ || f < fs[i_1609_]) {
								if (bool) {
									int i_1681_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_1601_ >> 16) + i_1679_]);
									int i_1682_ = i_1681_ + i_1597_;
									int i_1683_ = ((i_1681_ & 0xff00ff) + (i_1597_ & 0xff00ff));
									int i_1684_ = ((i_1683_ & 0x1000100) + (i_1682_ - i_1683_ & 0x10000));
									i_1684_ = (i_1682_ - i_1684_ | i_1684_ - (i_1684_ >>> 8));
									if (i_1681_ == 0 && i_1676_ != 255) {
										i_1681_ = i_1684_;
										i_1684_ = is[i_1609_];
										i_1684_ = ((((i_1681_ & 0xff00ff) * i_1676_ + ((i_1684_ & 0xff00ff) * i_1677_)) & ~0xff00ff) + (((i_1681_ & 0xff00) * i_1676_ + ((i_1684_ & 0xff00) * i_1677_)) & 0xff0000)) >> 8;
									}
									is[i_1609_] = i_1684_;
								}
								if (bool_1591_ && bool_1600_)
									fs[i_1609_] = f;
							}
							i_1601_ += i_1605_;
							i_1609_++;
						}
						i_1602_ += i_1606_;
						i_1601_ = i_1675_;
						i_1609_ += i_1610_;
					}
				} else if (i_1596_ == 2) {
					int i_1685_ = i_1597_ >>> 24;
					int i_1686_ = 256 - i_1685_;
					int i_1687_ = (i_1597_ & 0xff00ff) * i_1686_ & ~0xff00ff;
					int i_1688_ = (i_1597_ & 0xff00) * i_1686_ & 0xff0000;
					i_1597_ = (i_1687_ | i_1688_) >>> 8;
					int i_1689_ = i_1601_;
					for (int i_1690_ = -i_1595_; i_1690_ < 0; i_1690_++) {
						int i_1691_ = ((i_1602_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_1692_ = -i_1594_; i_1692_ < 0; i_1692_++) {
							if (!bool_1591_ || f < fs[i_1609_]) {
								int i_1693_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_1601_ >> 16) + i_1691_]);
								if (i_1693_ != 0) {
									if (bool) {
										i_1687_ = ((i_1693_ & 0xff00ff) * i_1685_ & ~0xff00ff);
										i_1688_ = ((i_1693_ & 0xff00) * i_1685_ & 0xff0000);
										is[i_1609_] = ((i_1687_ | i_1688_) >>> 8) + i_1597_;
									}
									if (bool_1591_ && bool_1600_)
										fs[i_1609_] = f;
								}
							}
							i_1601_ += i_1605_;
							i_1609_++;
						}
						i_1602_ += i_1606_;
						i_1601_ = i_1689_;
						i_1609_ += i_1610_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1598_ == 2) {
				if (i_1596_ == 1) {
					int i_1694_ = i_1601_;
					for (int i_1695_ = -i_1595_; i_1695_ < 0; i_1695_++) {
						int i_1696_ = ((i_1602_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_1697_ = -i_1594_; i_1697_ < 0; i_1697_++) {
							if (!bool_1591_ || f < fs[i_1609_]) {
								int i_1698_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_1601_ >> 16) + i_1696_]);
								if (i_1698_ != 0) {
									if (bool) {
										int i_1699_ = is[i_1609_];
										int i_1700_ = i_1698_ + i_1699_;
										int i_1701_ = ((i_1698_ & 0xff00ff) + (i_1699_ & 0xff00ff));
										i_1699_ = ((i_1701_ & 0x1000100) + (i_1700_ - i_1701_ & 0x10000));
										is[i_1609_] = (i_1700_ - i_1699_ | i_1699_ - (i_1699_ >>> 8));
									}
									if (bool_1591_ && bool_1600_)
										fs[i_1609_] = f;
								}
							}
							i_1601_ += i_1605_;
							i_1609_++;
						}
						i_1602_ += i_1606_;
						i_1601_ = i_1694_;
						i_1609_ += i_1610_;
					}
				} else if (i_1596_ == 0) {
					int i_1702_ = i_1601_;
					int i_1703_ = (i_1597_ & 0xff0000) >> 16;
					int i_1704_ = (i_1597_ & 0xff00) >> 8;
					int i_1705_ = i_1597_ & 0xff;
					for (int i_1706_ = -i_1595_; i_1706_ < 0; i_1706_++) {
						int i_1707_ = ((i_1602_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_1708_ = -i_1594_; i_1708_ < 0; i_1708_++) {
							if (!bool_1591_ || f < fs[i_1609_]) {
								int i_1709_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_1601_ >> 16) + i_1707_]);
								if (i_1709_ != 0) {
									if (bool) {
										int i_1710_ = ((i_1709_ & 0xff0000) * i_1703_ & ~0xffffff);
										int i_1711_ = ((i_1709_ & 0xff00) * i_1704_ & 0xff0000);
										int i_1712_ = ((i_1709_ & 0xff) * i_1705_ & 0xff00);
										i_1709_ = (i_1710_ | i_1711_ | i_1712_) >>> 8;
										int i_1713_ = is[i_1609_];
										int i_1714_ = i_1709_ + i_1713_;
										int i_1715_ = ((i_1709_ & 0xff00ff) + (i_1713_ & 0xff00ff));
										i_1713_ = ((i_1715_ & 0x1000100) + (i_1714_ - i_1715_ & 0x10000));
										is[i_1609_] = (i_1714_ - i_1713_ | i_1713_ - (i_1713_ >>> 8));
									}
									if (bool_1591_ && bool_1600_)
										fs[i_1609_] = f;
								}
							}
							i_1601_ += i_1605_;
							i_1609_++;
						}
						i_1602_ += i_1606_;
						i_1601_ = i_1702_;
						i_1609_ += i_1610_;
					}
				} else if (i_1596_ == 3) {
					int i_1716_ = i_1601_;
					for (int i_1717_ = -i_1595_; i_1717_ < 0; i_1717_++) {
						int i_1718_ = ((i_1602_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_1719_ = -i_1594_; i_1719_ < 0; i_1719_++) {
							if (!bool_1591_ || f < fs[i_1609_]) {
								if (bool) {
									int i_1720_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_1601_ >> 16) + i_1718_]);
									int i_1721_ = i_1720_ + i_1597_;
									int i_1722_ = ((i_1720_ & 0xff00ff) + (i_1597_ & 0xff00ff));
									int i_1723_ = ((i_1722_ & 0x1000100) + (i_1721_ - i_1722_ & 0x10000));
									i_1720_ = (i_1721_ - i_1723_ | i_1723_ - (i_1723_ >>> 8));
									i_1723_ = is[i_1609_];
									i_1721_ = i_1720_ + i_1723_;
									i_1722_ = (i_1720_ & 0xff00ff) + (i_1723_ & 0xff00ff);
									i_1723_ = ((i_1722_ & 0x1000100) + (i_1721_ - i_1722_ & 0x10000));
									is[i_1609_] = (i_1721_ - i_1723_ | i_1723_ - (i_1723_ >>> 8));
								}
								if (bool_1591_ && bool_1600_)
									fs[i_1609_] = f;
							}
							i_1601_ += i_1605_;
							i_1609_++;
						}
						i_1602_ += i_1606_;
						i_1601_ = i_1716_;
						i_1609_ += i_1610_;
					}
				} else if (i_1596_ == 2) {
					int i_1724_ = i_1597_ >>> 24;
					int i_1725_ = 256 - i_1724_;
					int i_1726_ = (i_1597_ & 0xff00ff) * i_1725_ & ~0xff00ff;
					int i_1727_ = (i_1597_ & 0xff00) * i_1725_ & 0xff0000;
					i_1597_ = (i_1726_ | i_1727_) >>> 8;
					int i_1728_ = i_1601_;
					for (int i_1729_ = -i_1595_; i_1729_ < 0; i_1729_++) {
						int i_1730_ = ((i_1602_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
						for (int i_1731_ = -i_1594_; i_1731_ < 0; i_1731_++) {
							if (!bool_1591_ || f < fs[i_1609_]) {
								int i_1732_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_1601_ >> 16) + i_1730_]);
								if (i_1732_ != 0) {
									if (bool) {
										i_1726_ = ((i_1732_ & 0xff00ff) * i_1724_ & ~0xff00ff);
										i_1727_ = ((i_1732_ & 0xff00) * i_1724_ & 0xff0000);
										i_1732_ = (((i_1726_ | i_1727_) >>> 8) + i_1597_);
										int i_1733_ = is[i_1609_];
										int i_1734_ = i_1732_ + i_1733_;
										int i_1735_ = ((i_1732_ & 0xff00ff) + (i_1733_ & 0xff00ff));
										i_1733_ = ((i_1735_ & 0x1000100) + (i_1734_ - i_1735_ & 0x10000));
										is[i_1609_] = (i_1734_ - i_1733_ | i_1733_ - (i_1733_ >>> 8));
									}
									if (bool_1591_ && bool_1600_)
										fs[i_1609_] = f;
								}
							}
							i_1601_ += i_1605_;
							i_1609_++;
						}
						i_1602_ += i_1606_;
						i_1601_ = i_1728_;
						i_1609_ += i_1610_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method687(int i, int i_1736_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_1737_ = anInt9001;
					while (i_1737_ < 0) {
						int i_1738_ = anInt9003;
						int i_1739_ = anInt8988;
						int i_1740_ = anInt9011;
						int i_1741_ = anInt8999;
						if (i_1739_ >= 0 && i_1740_ >= 0 && i_1739_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) < 0 && i_1740_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) < 0) {
							for (/**/; i_1741_ < 0; i_1741_++) {
								int i_1742_ = (((i_1740_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_1739_ >> 12));
								int i_1743_ = i_1738_++;
								if (i_1736_ == 0) {
									if (i == 1)
										is[i_1743_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1742_]);
									else if (i == 0) {
										int i_1744_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1742_++]);
										int i_1745_ = ((i_1744_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1746_ = ((i_1744_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1747_ = ((i_1744_ & 0xff) * anInt9019 & 0xff00);
										is[i_1743_] = (i_1745_ | i_1746_ | i_1747_) >>> 8;
									} else if (i == 3) {
										int i_1748_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1742_++]);
										int i_1749_ = anInt9014;
										int i_1750_ = i_1748_ + i_1749_;
										int i_1751_ = ((i_1748_ & 0xff00ff) + (i_1749_ & 0xff00ff));
										int i_1752_ = ((i_1751_ & 0x1000100) + (i_1750_ - i_1751_ & 0x10000));
										is[i_1743_] = (i_1750_ - i_1752_ | i_1752_ - (i_1752_ >>> 8));
									} else if (i == 2) {
										int i_1753_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1742_]);
										int i_1754_ = ((i_1753_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1755_ = ((i_1753_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_1743_] = ((i_1754_ | i_1755_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_1736_ == 1) {
									if (i == 1) {
										int i_1756_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1742_]);
										if (i_1756_ != 0)
											is[i_1743_] = i_1756_;
									} else if (i == 0) {
										int i_1757_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1742_]);
										if (i_1757_ != 0) {
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_1758_ = anInt9014 >>> 24;
												int i_1759_ = 256 - i_1758_;
												int i_1760_ = is[i_1743_];
												is[i_1743_] = (((((i_1757_ & 0xff00ff) * i_1758_) + ((i_1760_ & 0xff00ff) * i_1759_)) & ~0xff00ff) + ((((i_1757_ & 0xff00) * i_1758_) + ((i_1760_ & 0xff00) * i_1759_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_1761_ = (((i_1757_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_1762_ = (((i_1757_ & 0xff00) * anInt9018) & 0xff0000);
												int i_1763_ = (((i_1757_ & 0xff) * anInt9019) & 0xff00);
												i_1757_ = (i_1761_ | i_1762_ | i_1763_) >>> 8;
												int i_1764_ = is[i_1743_];
												is[i_1743_] = (((((i_1757_ & 0xff00ff) * anInt9015) + ((i_1764_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1757_ & 0xff00) * anInt9015) + ((i_1764_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_1765_ = (((i_1757_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_1766_ = (((i_1757_ & 0xff00) * anInt9018) & 0xff0000);
												int i_1767_ = (((i_1757_ & 0xff) * anInt9019) & 0xff00);
												is[i_1743_] = (i_1765_ | i_1766_ | i_1767_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_1768_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1742_]);
										int i_1769_ = anInt9014;
										int i_1770_ = i_1768_ + i_1769_;
										int i_1771_ = ((i_1768_ & 0xff00ff) + (i_1769_ & 0xff00ff));
										int i_1772_ = ((i_1771_ & 0x1000100) + (i_1770_ - i_1771_ & 0x10000));
										i_1772_ = (i_1770_ - i_1772_ | i_1772_ - (i_1772_ >>> 8));
										if (i_1768_ == 0 && anInt9015 != 255) {
											i_1768_ = i_1772_;
											i_1772_ = is[i_1743_];
											i_1772_ = (((((i_1768_ & 0xff00ff) * anInt9015) + ((i_1772_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1768_ & 0xff00) * anInt9015) + ((i_1772_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_1743_] = i_1772_;
									} else if (i == 2) {
										int i_1773_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1742_]);
										if (i_1773_ != 0) {
											int i_1774_ = (((i_1773_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_1775_ = (((i_1773_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_1743_++] = (((i_1774_ | i_1775_) >>> 8) + anInt9022);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1736_ == 2) {
									if (i == 1) {
										int i_1776_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1742_]);
										if (i_1776_ != 0) {
											int i_1777_ = is[i_1743_];
											int i_1778_ = i_1776_ + i_1777_;
											int i_1779_ = ((i_1776_ & 0xff00ff) + (i_1777_ & 0xff00ff));
											i_1777_ = ((i_1779_ & 0x1000100) + (i_1778_ - i_1779_ & 0x10000));
											is[i_1743_] = (i_1778_ - i_1777_ | i_1777_ - (i_1777_ >>> 8));
										}
									} else if (i == 0) {
										int i_1780_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1742_]);
										if (i_1780_ != 0) {
											int i_1781_ = (((i_1780_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_1782_ = (((i_1780_ & 0xff00) * anInt9018) & 0xff0000);
											int i_1783_ = ((i_1780_ & 0xff) * anInt9019 & 0xff00);
											i_1780_ = (i_1781_ | i_1782_ | i_1783_) >>> 8;
											int i_1784_ = is[i_1743_];
											int i_1785_ = i_1780_ + i_1784_;
											int i_1786_ = ((i_1780_ & 0xff00ff) + (i_1784_ & 0xff00ff));
											i_1784_ = ((i_1786_ & 0x1000100) + (i_1785_ - i_1786_ & 0x10000));
											is[i_1743_] = (i_1785_ - i_1784_ | i_1784_ - (i_1784_ >>> 8));
										}
									} else if (i == 3) {
										int i_1787_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1742_]);
										int i_1788_ = anInt9014;
										int i_1789_ = i_1787_ + i_1788_;
										int i_1790_ = ((i_1787_ & 0xff00ff) + (i_1788_ & 0xff00ff));
										int i_1791_ = ((i_1790_ & 0x1000100) + (i_1789_ - i_1790_ & 0x10000));
										i_1787_ = (i_1789_ - i_1791_ | i_1791_ - (i_1791_ >>> 8));
										i_1791_ = is[i_1743_];
										i_1789_ = i_1787_ + i_1791_;
										i_1790_ = ((i_1787_ & 0xff00ff) + (i_1791_ & 0xff00ff));
										i_1791_ = ((i_1790_ & 0x1000100) + (i_1789_ - i_1790_ & 0x10000));
										is[i_1743_] = (i_1789_ - i_1791_ | i_1791_ - (i_1791_ >>> 8));
									} else if (i == 2) {
										int i_1792_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1742_]);
										if (i_1792_ != 0) {
											int i_1793_ = (((i_1792_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_1794_ = (((i_1792_ & 0xff00) * anInt9015) & 0xff0000);
											i_1792_ = ((i_1793_ | i_1794_) >>> 8) + anInt9022;
											int i_1795_ = is[i_1743_];
											int i_1796_ = i_1792_ + i_1795_;
											int i_1797_ = ((i_1792_ & 0xff00ff) + (i_1795_ & 0xff00ff));
											i_1795_ = ((i_1797_ & 0x1000100) + (i_1796_ - i_1797_ & 0x10000));
											is[i_1743_] = (i_1796_ - i_1795_ | i_1795_ - (i_1795_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_1737_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_1798_ = anInt9001;
					while (i_1798_ < 0) {
						int i_1799_ = anInt9003;
						int i_1800_ = anInt8988;
						int i_1801_ = anInt9011 + anInt9013;
						int i_1802_ = anInt8999;
						if (i_1800_ >= 0 && i_1800_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) < 0) {
							int i_1803_;
							if ((i_1803_ = (i_1801_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12))) >= 0) {
								i_1803_ = (anInt8991 - i_1803_) / anInt8991;
								i_1802_ += i_1803_;
								i_1801_ += anInt8991 * i_1803_;
								i_1799_ += i_1803_;
							}
							if ((i_1803_ = (i_1801_ - anInt8991) / anInt8991) > i_1802_)
								i_1802_ = i_1803_;
							for (/**/; i_1802_ < 0; i_1802_++) {
								int i_1804_ = (((i_1801_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_1800_ >> 12));
								int i_1805_ = i_1799_++;
								if (i_1736_ == 0) {
									if (i == 1)
										is[i_1805_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1804_]);
									else if (i == 0) {
										int i_1806_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1804_++]);
										int i_1807_ = ((i_1806_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1808_ = ((i_1806_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1809_ = ((i_1806_ & 0xff) * anInt9019 & 0xff00);
										is[i_1805_] = (i_1807_ | i_1808_ | i_1809_) >>> 8;
									} else if (i == 3) {
										int i_1810_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1804_++]);
										int i_1811_ = anInt9014;
										int i_1812_ = i_1810_ + i_1811_;
										int i_1813_ = ((i_1810_ & 0xff00ff) + (i_1811_ & 0xff00ff));
										int i_1814_ = ((i_1813_ & 0x1000100) + (i_1812_ - i_1813_ & 0x10000));
										is[i_1805_] = (i_1812_ - i_1814_ | i_1814_ - (i_1814_ >>> 8));
									} else if (i == 2) {
										int i_1815_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1804_]);
										int i_1816_ = ((i_1815_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1817_ = ((i_1815_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_1805_] = ((i_1816_ | i_1817_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_1736_ == 1) {
									if (i == 1) {
										int i_1818_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1804_]);
										if (i_1818_ != 0)
											is[i_1805_] = i_1818_;
									} else if (i == 0) {
										int i_1819_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1804_]);
										if (i_1819_ != 0) {
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_1820_ = anInt9014 >>> 24;
												int i_1821_ = 256 - i_1820_;
												int i_1822_ = is[i_1805_];
												is[i_1805_] = (((((i_1819_ & 0xff00ff) * i_1820_) + ((i_1822_ & 0xff00ff) * i_1821_)) & ~0xff00ff) + ((((i_1819_ & 0xff00) * i_1820_) + ((i_1822_ & 0xff00) * i_1821_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_1823_ = (((i_1819_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_1824_ = (((i_1819_ & 0xff00) * anInt9018) & 0xff0000);
												int i_1825_ = (((i_1819_ & 0xff) * anInt9019) & 0xff00);
												i_1819_ = (i_1823_ | i_1824_ | i_1825_) >>> 8;
												int i_1826_ = is[i_1805_];
												is[i_1805_] = (((((i_1819_ & 0xff00ff) * anInt9015) + ((i_1826_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1819_ & 0xff00) * anInt9015) + ((i_1826_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_1827_ = (((i_1819_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_1828_ = (((i_1819_ & 0xff00) * anInt9018) & 0xff0000);
												int i_1829_ = (((i_1819_ & 0xff) * anInt9019) & 0xff00);
												is[i_1805_] = (i_1827_ | i_1828_ | i_1829_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_1830_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1804_]);
										int i_1831_ = anInt9014;
										int i_1832_ = i_1830_ + i_1831_;
										int i_1833_ = ((i_1830_ & 0xff00ff) + (i_1831_ & 0xff00ff));
										int i_1834_ = ((i_1833_ & 0x1000100) + (i_1832_ - i_1833_ & 0x10000));
										i_1834_ = (i_1832_ - i_1834_ | i_1834_ - (i_1834_ >>> 8));
										if (i_1830_ == 0 && anInt9015 != 255) {
											i_1830_ = i_1834_;
											i_1834_ = is[i_1805_];
											i_1834_ = (((((i_1830_ & 0xff00ff) * anInt9015) + ((i_1834_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1830_ & 0xff00) * anInt9015) + ((i_1834_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_1805_] = i_1834_;
									} else if (i == 2) {
										int i_1835_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1804_]);
										if (i_1835_ != 0) {
											int i_1836_ = (((i_1835_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_1837_ = (((i_1835_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_1805_++] = (((i_1836_ | i_1837_) >>> 8) + anInt9022);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1736_ == 2) {
									if (i == 1) {
										int i_1838_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1804_]);
										if (i_1838_ != 0) {
											int i_1839_ = is[i_1805_];
											int i_1840_ = i_1838_ + i_1839_;
											int i_1841_ = ((i_1838_ & 0xff00ff) + (i_1839_ & 0xff00ff));
											i_1839_ = ((i_1841_ & 0x1000100) + (i_1840_ - i_1841_ & 0x10000));
											is[i_1805_] = (i_1840_ - i_1839_ | i_1839_ - (i_1839_ >>> 8));
										}
									} else if (i == 0) {
										int i_1842_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1804_]);
										if (i_1842_ != 0) {
											int i_1843_ = (((i_1842_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_1844_ = (((i_1842_ & 0xff00) * anInt9018) & 0xff0000);
											int i_1845_ = ((i_1842_ & 0xff) * anInt9019 & 0xff00);
											i_1842_ = (i_1843_ | i_1844_ | i_1845_) >>> 8;
											int i_1846_ = is[i_1805_];
											int i_1847_ = i_1842_ + i_1846_;
											int i_1848_ = ((i_1842_ & 0xff00ff) + (i_1846_ & 0xff00ff));
											i_1846_ = ((i_1848_ & 0x1000100) + (i_1847_ - i_1848_ & 0x10000));
											is[i_1805_] = (i_1847_ - i_1846_ | i_1846_ - (i_1846_ >>> 8));
										}
									} else if (i == 3) {
										int i_1849_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1804_]);
										int i_1850_ = anInt9014;
										int i_1851_ = i_1849_ + i_1850_;
										int i_1852_ = ((i_1849_ & 0xff00ff) + (i_1850_ & 0xff00ff));
										int i_1853_ = ((i_1852_ & 0x1000100) + (i_1851_ - i_1852_ & 0x10000));
										i_1849_ = (i_1851_ - i_1853_ | i_1853_ - (i_1853_ >>> 8));
										i_1853_ = is[i_1805_];
										i_1851_ = i_1849_ + i_1853_;
										i_1852_ = ((i_1849_ & 0xff00ff) + (i_1853_ & 0xff00ff));
										i_1853_ = ((i_1852_ & 0x1000100) + (i_1851_ - i_1852_ & 0x10000));
										is[i_1805_] = (i_1851_ - i_1853_ | i_1853_ - (i_1853_ >>> 8));
									} else if (i == 2) {
										int i_1854_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1804_]);
										if (i_1854_ != 0) {
											int i_1855_ = (((i_1854_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_1856_ = (((i_1854_ & 0xff00) * anInt9015) & 0xff0000);
											i_1854_ = ((i_1855_ | i_1856_) >>> 8) + anInt9022;
											int i_1857_ = is[i_1805_];
											int i_1858_ = i_1854_ + i_1857_;
											int i_1859_ = ((i_1854_ & 0xff00ff) + (i_1857_ & 0xff00ff));
											i_1857_ = ((i_1859_ & 0x1000100) + (i_1858_ - i_1859_ & 0x10000));
											is[i_1805_] = (i_1858_ - i_1857_ | i_1857_ - (i_1857_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1801_ += anInt8991;
							}
						}
						i_1798_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_1860_ = anInt9001;
					while (i_1860_ < 0) {
						int i_1861_ = anInt9003;
						int i_1862_ = anInt8988;
						int i_1863_ = anInt9011 + anInt9013;
						int i_1864_ = anInt8999;
						if (i_1862_ >= 0 && i_1862_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) < 0) {
							if (i_1863_ < 0) {
								int i_1865_ = (anInt8991 - 1 - i_1863_) / anInt8991;
								i_1864_ += i_1865_;
								i_1863_ += anInt8991 * i_1865_;
								i_1861_ += i_1865_;
							}
							int i_1866_;
							if ((i_1866_ = (1 + i_1863_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_1864_)
								i_1864_ = i_1866_;
							for (/**/; i_1864_ < 0; i_1864_++) {
								int i_1867_ = (((i_1863_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_1862_ >> 12));
								int i_1868_ = i_1861_++;
								if (i_1736_ == 0) {
									if (i == 1)
										is[i_1868_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1867_]);
									else if (i == 0) {
										int i_1869_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1867_++]);
										int i_1870_ = ((i_1869_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1871_ = ((i_1869_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1872_ = ((i_1869_ & 0xff) * anInt9019 & 0xff00);
										is[i_1868_] = (i_1870_ | i_1871_ | i_1872_) >>> 8;
									} else if (i == 3) {
										int i_1873_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1867_++]);
										int i_1874_ = anInt9014;
										int i_1875_ = i_1873_ + i_1874_;
										int i_1876_ = ((i_1873_ & 0xff00ff) + (i_1874_ & 0xff00ff));
										int i_1877_ = ((i_1876_ & 0x1000100) + (i_1875_ - i_1876_ & 0x10000));
										is[i_1868_] = (i_1875_ - i_1877_ | i_1877_ - (i_1877_ >>> 8));
									} else if (i == 2) {
										int i_1878_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1867_]);
										int i_1879_ = ((i_1878_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1880_ = ((i_1878_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_1868_] = ((i_1879_ | i_1880_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_1736_ == 1) {
									if (i == 1) {
										int i_1881_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1867_]);
										if (i_1881_ != 0)
											is[i_1868_] = i_1881_;
									} else if (i == 0) {
										int i_1882_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1867_]);
										if (i_1882_ != 0) {
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_1883_ = anInt9014 >>> 24;
												int i_1884_ = 256 - i_1883_;
												int i_1885_ = is[i_1868_];
												is[i_1868_] = (((((i_1882_ & 0xff00ff) * i_1883_) + ((i_1885_ & 0xff00ff) * i_1884_)) & ~0xff00ff) + ((((i_1882_ & 0xff00) * i_1883_) + ((i_1885_ & 0xff00) * i_1884_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_1886_ = (((i_1882_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_1887_ = (((i_1882_ & 0xff00) * anInt9018) & 0xff0000);
												int i_1888_ = (((i_1882_ & 0xff) * anInt9019) & 0xff00);
												i_1882_ = (i_1886_ | i_1887_ | i_1888_) >>> 8;
												int i_1889_ = is[i_1868_];
												is[i_1868_] = (((((i_1882_ & 0xff00ff) * anInt9015) + ((i_1889_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1882_ & 0xff00) * anInt9015) + ((i_1889_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_1890_ = (((i_1882_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_1891_ = (((i_1882_ & 0xff00) * anInt9018) & 0xff0000);
												int i_1892_ = (((i_1882_ & 0xff) * anInt9019) & 0xff00);
												is[i_1868_] = (i_1890_ | i_1891_ | i_1892_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_1893_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1867_]);
										int i_1894_ = anInt9014;
										int i_1895_ = i_1893_ + i_1894_;
										int i_1896_ = ((i_1893_ & 0xff00ff) + (i_1894_ & 0xff00ff));
										int i_1897_ = ((i_1896_ & 0x1000100) + (i_1895_ - i_1896_ & 0x10000));
										i_1897_ = (i_1895_ - i_1897_ | i_1897_ - (i_1897_ >>> 8));
										if (i_1893_ == 0 && anInt9015 != 255) {
											i_1893_ = i_1897_;
											i_1897_ = is[i_1868_];
											i_1897_ = (((((i_1893_ & 0xff00ff) * anInt9015) + ((i_1897_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1893_ & 0xff00) * anInt9015) + ((i_1897_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_1868_] = i_1897_;
									} else if (i == 2) {
										int i_1898_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1867_]);
										if (i_1898_ != 0) {
											int i_1899_ = (((i_1898_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_1900_ = (((i_1898_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_1868_++] = (((i_1899_ | i_1900_) >>> 8) + anInt9022);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1736_ == 2) {
									if (i == 1) {
										int i_1901_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1867_]);
										if (i_1901_ != 0) {
											int i_1902_ = is[i_1868_];
											int i_1903_ = i_1901_ + i_1902_;
											int i_1904_ = ((i_1901_ & 0xff00ff) + (i_1902_ & 0xff00ff));
											i_1902_ = ((i_1904_ & 0x1000100) + (i_1903_ - i_1904_ & 0x10000));
											is[i_1868_] = (i_1903_ - i_1902_ | i_1902_ - (i_1902_ >>> 8));
										}
									} else if (i == 0) {
										int i_1905_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1867_]);
										if (i_1905_ != 0) {
											int i_1906_ = (((i_1905_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_1907_ = (((i_1905_ & 0xff00) * anInt9018) & 0xff0000);
											int i_1908_ = ((i_1905_ & 0xff) * anInt9019 & 0xff00);
											i_1905_ = (i_1906_ | i_1907_ | i_1908_) >>> 8;
											int i_1909_ = is[i_1868_];
											int i_1910_ = i_1905_ + i_1909_;
											int i_1911_ = ((i_1905_ & 0xff00ff) + (i_1909_ & 0xff00ff));
											i_1909_ = ((i_1911_ & 0x1000100) + (i_1910_ - i_1911_ & 0x10000));
											is[i_1868_] = (i_1910_ - i_1909_ | i_1909_ - (i_1909_ >>> 8));
										}
									} else if (i == 3) {
										int i_1912_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1867_]);
										int i_1913_ = anInt9014;
										int i_1914_ = i_1912_ + i_1913_;
										int i_1915_ = ((i_1912_ & 0xff00ff) + (i_1913_ & 0xff00ff));
										int i_1916_ = ((i_1915_ & 0x1000100) + (i_1914_ - i_1915_ & 0x10000));
										i_1912_ = (i_1914_ - i_1916_ | i_1916_ - (i_1916_ >>> 8));
										i_1916_ = is[i_1868_];
										i_1914_ = i_1912_ + i_1916_;
										i_1915_ = ((i_1912_ & 0xff00ff) + (i_1916_ & 0xff00ff));
										i_1916_ = ((i_1915_ & 0x1000100) + (i_1914_ - i_1915_ & 0x10000));
										is[i_1868_] = (i_1914_ - i_1916_ | i_1916_ - (i_1916_ >>> 8));
									} else if (i == 2) {
										int i_1917_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1867_]);
										if (i_1917_ != 0) {
											int i_1918_ = (((i_1917_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_1919_ = (((i_1917_ & 0xff00) * anInt9015) & 0xff0000);
											i_1917_ = ((i_1918_ | i_1919_) >>> 8) + anInt9022;
											int i_1920_ = is[i_1868_];
											int i_1921_ = i_1917_ + i_1920_;
											int i_1922_ = ((i_1917_ & 0xff00ff) + (i_1920_ & 0xff00ff));
											i_1920_ = ((i_1922_ & 0x1000100) + (i_1921_ - i_1922_ & 0x10000));
											is[i_1868_] = (i_1921_ - i_1920_ | i_1920_ - (i_1920_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1863_ += anInt8991;
							}
						}
						i_1860_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_1923_ = anInt9001;
					while (i_1923_ < 0) {
						int i_1924_ = anInt9003;
						int i_1925_ = anInt8988 + anInt9012;
						int i_1926_ = anInt9011;
						int i_1927_ = anInt8999;
						if (i_1926_ >= 0 && i_1926_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) < 0) {
							int i_1928_;
							if ((i_1928_ = (i_1925_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12))) >= 0) {
								i_1928_ = (anInt9004 - i_1928_) / anInt9004;
								i_1927_ += i_1928_;
								i_1925_ += anInt9004 * i_1928_;
								i_1924_ += i_1928_;
							}
							if ((i_1928_ = (i_1925_ - anInt9004) / anInt9004) > i_1927_)
								i_1927_ = i_1928_;
							for (/**/; i_1927_ < 0; i_1927_++) {
								int i_1929_ = (((i_1926_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_1925_ >> 12));
								int i_1930_ = i_1924_++;
								if (i_1736_ == 0) {
									if (i == 1)
										is[i_1930_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1929_]);
									else if (i == 0) {
										int i_1931_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1929_++]);
										int i_1932_ = ((i_1931_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_1933_ = ((i_1931_ & 0xff00) * anInt9018 & 0xff0000);
										int i_1934_ = ((i_1931_ & 0xff) * anInt9019 & 0xff00);
										is[i_1930_] = (i_1932_ | i_1933_ | i_1934_) >>> 8;
									} else if (i == 3) {
										int i_1935_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1929_++]);
										int i_1936_ = anInt9014;
										int i_1937_ = i_1935_ + i_1936_;
										int i_1938_ = ((i_1935_ & 0xff00ff) + (i_1936_ & 0xff00ff));
										int i_1939_ = ((i_1938_ & 0x1000100) + (i_1937_ - i_1938_ & 0x10000));
										is[i_1930_] = (i_1937_ - i_1939_ | i_1939_ - (i_1939_ >>> 8));
									} else if (i == 2) {
										int i_1940_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1929_]);
										int i_1941_ = ((i_1940_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_1942_ = ((i_1940_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_1930_] = ((i_1941_ | i_1942_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_1736_ == 1) {
									if (i == 1) {
										int i_1943_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1929_]);
										if (i_1943_ != 0)
											is[i_1930_] = i_1943_;
									} else if (i == 0) {
										int i_1944_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1929_]);
										if (i_1944_ != 0) {
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_1945_ = anInt9014 >>> 24;
												int i_1946_ = 256 - i_1945_;
												int i_1947_ = is[i_1930_];
												is[i_1930_] = (((((i_1944_ & 0xff00ff) * i_1945_) + ((i_1947_ & 0xff00ff) * i_1946_)) & ~0xff00ff) + ((((i_1944_ & 0xff00) * i_1945_) + ((i_1947_ & 0xff00) * i_1946_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_1948_ = (((i_1944_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_1949_ = (((i_1944_ & 0xff00) * anInt9018) & 0xff0000);
												int i_1950_ = (((i_1944_ & 0xff) * anInt9019) & 0xff00);
												i_1944_ = (i_1948_ | i_1949_ | i_1950_) >>> 8;
												int i_1951_ = is[i_1930_];
												is[i_1930_] = (((((i_1944_ & 0xff00ff) * anInt9015) + ((i_1951_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1944_ & 0xff00) * anInt9015) + ((i_1951_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_1952_ = (((i_1944_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_1953_ = (((i_1944_ & 0xff00) * anInt9018) & 0xff0000);
												int i_1954_ = (((i_1944_ & 0xff) * anInt9019) & 0xff00);
												is[i_1930_] = (i_1952_ | i_1953_ | i_1954_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_1955_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1929_]);
										int i_1956_ = anInt9014;
										int i_1957_ = i_1955_ + i_1956_;
										int i_1958_ = ((i_1955_ & 0xff00ff) + (i_1956_ & 0xff00ff));
										int i_1959_ = ((i_1958_ & 0x1000100) + (i_1957_ - i_1958_ & 0x10000));
										i_1959_ = (i_1957_ - i_1959_ | i_1959_ - (i_1959_ >>> 8));
										if (i_1955_ == 0 && anInt9015 != 255) {
											i_1955_ = i_1959_;
											i_1959_ = is[i_1930_];
											i_1959_ = (((((i_1955_ & 0xff00ff) * anInt9015) + ((i_1959_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_1955_ & 0xff00) * anInt9015) + ((i_1959_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_1930_] = i_1959_;
									} else if (i == 2) {
										int i_1960_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1929_]);
										if (i_1960_ != 0) {
											int i_1961_ = (((i_1960_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_1962_ = (((i_1960_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_1930_++] = (((i_1961_ | i_1962_) >>> 8) + anInt9022);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1736_ == 2) {
									if (i == 1) {
										int i_1963_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1929_]);
										if (i_1963_ != 0) {
											int i_1964_ = is[i_1930_];
											int i_1965_ = i_1963_ + i_1964_;
											int i_1966_ = ((i_1963_ & 0xff00ff) + (i_1964_ & 0xff00ff));
											i_1964_ = ((i_1966_ & 0x1000100) + (i_1965_ - i_1966_ & 0x10000));
											is[i_1930_] = (i_1965_ - i_1964_ | i_1964_ - (i_1964_ >>> 8));
										}
									} else if (i == 0) {
										int i_1967_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1929_]);
										if (i_1967_ != 0) {
											int i_1968_ = (((i_1967_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_1969_ = (((i_1967_ & 0xff00) * anInt9018) & 0xff0000);
											int i_1970_ = ((i_1967_ & 0xff) * anInt9019 & 0xff00);
											i_1967_ = (i_1968_ | i_1969_ | i_1970_) >>> 8;
											int i_1971_ = is[i_1930_];
											int i_1972_ = i_1967_ + i_1971_;
											int i_1973_ = ((i_1967_ & 0xff00ff) + (i_1971_ & 0xff00ff));
											i_1971_ = ((i_1973_ & 0x1000100) + (i_1972_ - i_1973_ & 0x10000));
											is[i_1930_] = (i_1972_ - i_1971_ | i_1971_ - (i_1971_ >>> 8));
										}
									} else if (i == 3) {
										int i_1974_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1929_]);
										int i_1975_ = anInt9014;
										int i_1976_ = i_1974_ + i_1975_;
										int i_1977_ = ((i_1974_ & 0xff00ff) + (i_1975_ & 0xff00ff));
										int i_1978_ = ((i_1977_ & 0x1000100) + (i_1976_ - i_1977_ & 0x10000));
										i_1974_ = (i_1976_ - i_1978_ | i_1978_ - (i_1978_ >>> 8));
										i_1978_ = is[i_1930_];
										i_1976_ = i_1974_ + i_1978_;
										i_1977_ = ((i_1974_ & 0xff00ff) + (i_1978_ & 0xff00ff));
										i_1978_ = ((i_1977_ & 0x1000100) + (i_1976_ - i_1977_ & 0x10000));
										is[i_1930_] = (i_1976_ - i_1978_ | i_1978_ - (i_1978_ >>> 8));
									} else if (i == 2) {
										int i_1979_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1929_]);
										if (i_1979_ != 0) {
											int i_1980_ = (((i_1979_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_1981_ = (((i_1979_ & 0xff00) * anInt9015) & 0xff0000);
											i_1979_ = ((i_1980_ | i_1981_) >>> 8) + anInt9022;
											int i_1982_ = is[i_1930_];
											int i_1983_ = i_1979_ + i_1982_;
											int i_1984_ = ((i_1979_ & 0xff00ff) + (i_1982_ & 0xff00ff));
											i_1982_ = ((i_1984_ & 0x1000100) + (i_1983_ - i_1984_ & 0x10000));
											is[i_1930_] = (i_1983_ - i_1982_ | i_1982_ - (i_1982_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1925_ += anInt9004;
							}
						}
						i_1923_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_1985_ = anInt9001;
					while (i_1985_ < 0) {
						int i_1986_ = anInt9003;
						int i_1987_ = anInt8988 + anInt9012;
						int i_1988_ = anInt9011 + anInt9013;
						int i_1989_ = anInt8999;
						int i_1990_;
						if ((i_1990_ = i_1987_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) >= 0) {
							i_1990_ = (anInt9004 - i_1990_) / anInt9004;
							i_1989_ += i_1990_;
							i_1987_ += anInt9004 * i_1990_;
							i_1988_ += anInt8991 * i_1990_;
							i_1986_ += i_1990_;
						}
						if ((i_1990_ = (i_1987_ - anInt9004) / anInt9004) > i_1989_)
							i_1989_ = i_1990_;
						if ((i_1990_ = i_1988_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) >= 0) {
							i_1990_ = (anInt8991 - i_1990_) / anInt8991;
							i_1989_ += i_1990_;
							i_1987_ += anInt9004 * i_1990_;
							i_1988_ += anInt8991 * i_1990_;
							i_1986_ += i_1990_;
						}
						if ((i_1990_ = (i_1988_ - anInt8991) / anInt8991) > i_1989_)
							i_1989_ = i_1990_;
						for (/**/; i_1989_ < 0; i_1989_++) {
							int i_1991_ = (((i_1988_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_1987_ >> 12));
							int i_1992_ = i_1986_++;
							if (i_1736_ == 0) {
								if (i == 1)
									is[i_1992_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1991_]);
								else if (i == 0) {
									int i_1993_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1991_++]);
									int i_1994_ = ((i_1993_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_1995_ = ((i_1993_ & 0xff00) * anInt9018 & 0xff0000);
									int i_1996_ = ((i_1993_ & 0xff) * anInt9019 & 0xff00);
									is[i_1992_] = (i_1994_ | i_1995_ | i_1996_) >>> 8;
								} else if (i == 3) {
									int i_1997_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1991_++]);
									int i_1998_ = anInt9014;
									int i_1999_ = i_1997_ + i_1998_;
									int i_2000_ = ((i_1997_ & 0xff00ff) + (i_1998_ & 0xff00ff));
									int i_2001_ = ((i_2000_ & 0x1000100) + (i_1999_ - i_2000_ & 0x10000));
									is[i_1992_] = (i_1999_ - i_2001_ | i_2001_ - (i_2001_ >>> 8));
								} else if (i == 2) {
									int i_2002_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1991_]);
									int i_2003_ = ((i_2002_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2004_ = ((i_2002_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_1992_] = (((i_2003_ | i_2004_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_1736_ == 1) {
								if (i == 1) {
									int i_2005_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1991_]);
									if (i_2005_ != 0)
										is[i_1992_] = i_2005_;
								} else if (i == 0) {
									int i_2006_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1991_]);
									if (i_2006_ != 0) {
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_2007_ = anInt9014 >>> 24;
											int i_2008_ = 256 - i_2007_;
											int i_2009_ = is[i_1992_];
											is[i_1992_] = (((((i_2006_ & 0xff00ff) * i_2007_) + ((i_2009_ & 0xff00ff) * i_2008_)) & ~0xff00ff) + ((((i_2006_ & 0xff00) * i_2007_) + ((i_2009_ & 0xff00) * i_2008_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_2010_ = (((i_2006_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2011_ = (((i_2006_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2012_ = ((i_2006_ & 0xff) * anInt9019 & 0xff00);
											i_2006_ = (i_2010_ | i_2011_ | i_2012_) >>> 8;
											int i_2013_ = is[i_1992_];
											is[i_1992_] = (((((i_2006_ & 0xff00ff) * anInt9015) + ((i_2013_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2006_ & 0xff00) * anInt9015) + ((i_2013_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_2014_ = (((i_2006_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2015_ = (((i_2006_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2016_ = ((i_2006_ & 0xff) * anInt9019 & 0xff00);
											is[i_1992_] = (i_2014_ | i_2015_ | i_2016_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_2017_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1991_]);
									int i_2018_ = anInt9014;
									int i_2019_ = i_2017_ + i_2018_;
									int i_2020_ = ((i_2017_ & 0xff00ff) + (i_2018_ & 0xff00ff));
									int i_2021_ = ((i_2020_ & 0x1000100) + (i_2019_ - i_2020_ & 0x10000));
									i_2021_ = (i_2019_ - i_2021_ | i_2021_ - (i_2021_ >>> 8));
									if (i_2017_ == 0 && anInt9015 != 255) {
										i_2017_ = i_2021_;
										i_2021_ = is[i_1992_];
										i_2021_ = (((((i_2017_ & 0xff00ff) * anInt9015) + ((i_2021_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2017_ & 0xff00) * anInt9015) + ((i_2021_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_1992_] = i_2021_;
								} else if (i == 2) {
									int i_2022_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1991_]);
									if (i_2022_ != 0) {
										int i_2023_ = ((i_2022_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2024_ = ((i_2022_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_1992_++] = ((i_2023_ | i_2024_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1736_ == 2) {
								if (i == 1) {
									int i_2025_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1991_]);
									if (i_2025_ != 0) {
										int i_2026_ = is[i_1992_];
										int i_2027_ = i_2025_ + i_2026_;
										int i_2028_ = ((i_2025_ & 0xff00ff) + (i_2026_ & 0xff00ff));
										i_2026_ = ((i_2028_ & 0x1000100) + (i_2027_ - i_2028_ & 0x10000));
										is[i_1992_] = (i_2027_ - i_2026_ | i_2026_ - (i_2026_ >>> 8));
									}
								} else if (i == 0) {
									int i_2029_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1991_]);
									if (i_2029_ != 0) {
										int i_2030_ = ((i_2029_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2031_ = ((i_2029_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2032_ = ((i_2029_ & 0xff) * anInt9019 & 0xff00);
										i_2029_ = (i_2030_ | i_2031_ | i_2032_) >>> 8;
										int i_2033_ = is[i_1992_];
										int i_2034_ = i_2029_ + i_2033_;
										int i_2035_ = ((i_2029_ & 0xff00ff) + (i_2033_ & 0xff00ff));
										i_2033_ = ((i_2035_ & 0x1000100) + (i_2034_ - i_2035_ & 0x10000));
										is[i_1992_] = (i_2034_ - i_2033_ | i_2033_ - (i_2033_ >>> 8));
									}
								} else if (i == 3) {
									int i_2036_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1991_]);
									int i_2037_ = anInt9014;
									int i_2038_ = i_2036_ + i_2037_;
									int i_2039_ = ((i_2036_ & 0xff00ff) + (i_2037_ & 0xff00ff));
									int i_2040_ = ((i_2039_ & 0x1000100) + (i_2038_ - i_2039_ & 0x10000));
									i_2036_ = (i_2038_ - i_2040_ | i_2040_ - (i_2040_ >>> 8));
									i_2040_ = is[i_1992_];
									i_2038_ = i_2036_ + i_2040_;
									i_2039_ = (i_2036_ & 0xff00ff) + (i_2040_ & 0xff00ff);
									i_2040_ = ((i_2039_ & 0x1000100) + (i_2038_ - i_2039_ & 0x10000));
									is[i_1992_] = (i_2038_ - i_2040_ | i_2040_ - (i_2040_ >>> 8));
								} else if (i == 2) {
									int i_2041_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_1991_]);
									if (i_2041_ != 0) {
										int i_2042_ = ((i_2041_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2043_ = ((i_2041_ & 0xff00) * anInt9015 & 0xff0000);
										i_2041_ = (((i_2042_ | i_2043_) >>> 8) + anInt9022);
										int i_2044_ = is[i_1992_];
										int i_2045_ = i_2041_ + i_2044_;
										int i_2046_ = ((i_2041_ & 0xff00ff) + (i_2044_ & 0xff00ff));
										i_2044_ = ((i_2046_ & 0x1000100) + (i_2045_ - i_2046_ & 0x10000));
										is[i_1992_] = (i_2045_ - i_2044_ | i_2044_ - (i_2044_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1987_ += anInt9004;
							i_1988_ += anInt8991;
						}
						i_1985_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_2047_ = anInt9001;
					while (i_2047_ < 0) {
						int i_2048_ = anInt9003;
						int i_2049_ = anInt8988 + anInt9012;
						int i_2050_ = anInt9011 + anInt9013;
						int i_2051_ = anInt8999;
						int i_2052_;
						if ((i_2052_ = i_2049_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) >= 0) {
							i_2052_ = (anInt9004 - i_2052_) / anInt9004;
							i_2051_ += i_2052_;
							i_2049_ += anInt9004 * i_2052_;
							i_2050_ += anInt8991 * i_2052_;
							i_2048_ += i_2052_;
						}
						if ((i_2052_ = (i_2049_ - anInt9004) / anInt9004) > i_2051_)
							i_2051_ = i_2052_;
						if (i_2050_ < 0) {
							i_2052_ = (anInt8991 - 1 - i_2050_) / anInt8991;
							i_2051_ += i_2052_;
							i_2049_ += anInt9004 * i_2052_;
							i_2050_ += anInt8991 * i_2052_;
							i_2048_ += i_2052_;
						}
						if ((i_2052_ = (1 + i_2050_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_2051_)
							i_2051_ = i_2052_;
						for (/**/; i_2051_ < 0; i_2051_++) {
							int i_2053_ = (((i_2050_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_2049_ >> 12));
							int i_2054_ = i_2048_++;
							if (i_1736_ == 0) {
								if (i == 1)
									is[i_2054_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2053_]);
								else if (i == 0) {
									int i_2055_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2053_++]);
									int i_2056_ = ((i_2055_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2057_ = ((i_2055_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2058_ = ((i_2055_ & 0xff) * anInt9019 & 0xff00);
									is[i_2054_] = (i_2056_ | i_2057_ | i_2058_) >>> 8;
								} else if (i == 3) {
									int i_2059_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2053_++]);
									int i_2060_ = anInt9014;
									int i_2061_ = i_2059_ + i_2060_;
									int i_2062_ = ((i_2059_ & 0xff00ff) + (i_2060_ & 0xff00ff));
									int i_2063_ = ((i_2062_ & 0x1000100) + (i_2061_ - i_2062_ & 0x10000));
									is[i_2054_] = (i_2061_ - i_2063_ | i_2063_ - (i_2063_ >>> 8));
								} else if (i == 2) {
									int i_2064_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2053_]);
									int i_2065_ = ((i_2064_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2066_ = ((i_2064_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_2054_] = (((i_2065_ | i_2066_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_1736_ == 1) {
								if (i == 1) {
									int i_2067_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2053_]);
									if (i_2067_ != 0)
										is[i_2054_] = i_2067_;
								} else if (i == 0) {
									int i_2068_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2053_]);
									if (i_2068_ != 0) {
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_2069_ = anInt9014 >>> 24;
											int i_2070_ = 256 - i_2069_;
											int i_2071_ = is[i_2054_];
											is[i_2054_] = (((((i_2068_ & 0xff00ff) * i_2069_) + ((i_2071_ & 0xff00ff) * i_2070_)) & ~0xff00ff) + ((((i_2068_ & 0xff00) * i_2069_) + ((i_2071_ & 0xff00) * i_2070_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_2072_ = (((i_2068_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2073_ = (((i_2068_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2074_ = ((i_2068_ & 0xff) * anInt9019 & 0xff00);
											i_2068_ = (i_2072_ | i_2073_ | i_2074_) >>> 8;
											int i_2075_ = is[i_2054_];
											is[i_2054_] = (((((i_2068_ & 0xff00ff) * anInt9015) + ((i_2075_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2068_ & 0xff00) * anInt9015) + ((i_2075_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_2076_ = (((i_2068_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2077_ = (((i_2068_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2078_ = ((i_2068_ & 0xff) * anInt9019 & 0xff00);
											is[i_2054_] = (i_2076_ | i_2077_ | i_2078_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_2079_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2053_]);
									int i_2080_ = anInt9014;
									int i_2081_ = i_2079_ + i_2080_;
									int i_2082_ = ((i_2079_ & 0xff00ff) + (i_2080_ & 0xff00ff));
									int i_2083_ = ((i_2082_ & 0x1000100) + (i_2081_ - i_2082_ & 0x10000));
									i_2083_ = (i_2081_ - i_2083_ | i_2083_ - (i_2083_ >>> 8));
									if (i_2079_ == 0 && anInt9015 != 255) {
										i_2079_ = i_2083_;
										i_2083_ = is[i_2054_];
										i_2083_ = (((((i_2079_ & 0xff00ff) * anInt9015) + ((i_2083_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2079_ & 0xff00) * anInt9015) + ((i_2083_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_2054_] = i_2083_;
								} else if (i == 2) {
									int i_2084_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2053_]);
									if (i_2084_ != 0) {
										int i_2085_ = ((i_2084_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2086_ = ((i_2084_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_2054_++] = ((i_2085_ | i_2086_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1736_ == 2) {
								if (i == 1) {
									int i_2087_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2053_]);
									if (i_2087_ != 0) {
										int i_2088_ = is[i_2054_];
										int i_2089_ = i_2087_ + i_2088_;
										int i_2090_ = ((i_2087_ & 0xff00ff) + (i_2088_ & 0xff00ff));
										i_2088_ = ((i_2090_ & 0x1000100) + (i_2089_ - i_2090_ & 0x10000));
										is[i_2054_] = (i_2089_ - i_2088_ | i_2088_ - (i_2088_ >>> 8));
									}
								} else if (i == 0) {
									int i_2091_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2053_]);
									if (i_2091_ != 0) {
										int i_2092_ = ((i_2091_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2093_ = ((i_2091_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2094_ = ((i_2091_ & 0xff) * anInt9019 & 0xff00);
										i_2091_ = (i_2092_ | i_2093_ | i_2094_) >>> 8;
										int i_2095_ = is[i_2054_];
										int i_2096_ = i_2091_ + i_2095_;
										int i_2097_ = ((i_2091_ & 0xff00ff) + (i_2095_ & 0xff00ff));
										i_2095_ = ((i_2097_ & 0x1000100) + (i_2096_ - i_2097_ & 0x10000));
										is[i_2054_] = (i_2096_ - i_2095_ | i_2095_ - (i_2095_ >>> 8));
									}
								} else if (i == 3) {
									int i_2098_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2053_]);
									int i_2099_ = anInt9014;
									int i_2100_ = i_2098_ + i_2099_;
									int i_2101_ = ((i_2098_ & 0xff00ff) + (i_2099_ & 0xff00ff));
									int i_2102_ = ((i_2101_ & 0x1000100) + (i_2100_ - i_2101_ & 0x10000));
									i_2098_ = (i_2100_ - i_2102_ | i_2102_ - (i_2102_ >>> 8));
									i_2102_ = is[i_2054_];
									i_2100_ = i_2098_ + i_2102_;
									i_2101_ = (i_2098_ & 0xff00ff) + (i_2102_ & 0xff00ff);
									i_2102_ = ((i_2101_ & 0x1000100) + (i_2100_ - i_2101_ & 0x10000));
									is[i_2054_] = (i_2100_ - i_2102_ | i_2102_ - (i_2102_ >>> 8));
								} else if (i == 2) {
									int i_2103_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2053_]);
									if (i_2103_ != 0) {
										int i_2104_ = ((i_2103_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2105_ = ((i_2103_ & 0xff00) * anInt9015 & 0xff0000);
										i_2103_ = (((i_2104_ | i_2105_) >>> 8) + anInt9022);
										int i_2106_ = is[i_2054_];
										int i_2107_ = i_2103_ + i_2106_;
										int i_2108_ = ((i_2103_ & 0xff00ff) + (i_2106_ & 0xff00ff));
										i_2106_ = ((i_2108_ & 0x1000100) + (i_2107_ - i_2108_ & 0x10000));
										is[i_2054_] = (i_2107_ - i_2106_ | i_2106_ - (i_2106_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2049_ += anInt9004;
							i_2050_ += anInt8991;
						}
						i_2047_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_2109_ = anInt9001;
				while (i_2109_ < 0) {
					int i_2110_ = anInt9003;
					int i_2111_ = anInt8988 + anInt9012;
					int i_2112_ = anInt9011;
					int i_2113_ = anInt8999;
					if (i_2112_ >= 0 && i_2112_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) < 0) {
						if (i_2111_ < 0) {
							int i_2114_ = (anInt9004 - 1 - i_2111_) / anInt9004;
							i_2113_ += i_2114_;
							i_2111_ += anInt9004 * i_2114_;
							i_2110_ += i_2114_;
						}
						int i_2115_;
						if ((i_2115_ = (1 + i_2111_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_2113_)
							i_2113_ = i_2115_;
						for (/**/; i_2113_ < 0; i_2113_++) {
							int i_2116_ = (((i_2112_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_2111_ >> 12));
							int i_2117_ = i_2110_++;
							if (i_1736_ == 0) {
								if (i == 1)
									is[i_2117_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2116_]);
								else if (i == 0) {
									int i_2118_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2116_++]);
									int i_2119_ = ((i_2118_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2120_ = ((i_2118_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2121_ = ((i_2118_ & 0xff) * anInt9019 & 0xff00);
									is[i_2117_] = (i_2119_ | i_2120_ | i_2121_) >>> 8;
								} else if (i == 3) {
									int i_2122_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2116_++]);
									int i_2123_ = anInt9014;
									int i_2124_ = i_2122_ + i_2123_;
									int i_2125_ = ((i_2122_ & 0xff00ff) + (i_2123_ & 0xff00ff));
									int i_2126_ = ((i_2125_ & 0x1000100) + (i_2124_ - i_2125_ & 0x10000));
									is[i_2117_] = (i_2124_ - i_2126_ | i_2126_ - (i_2126_ >>> 8));
								} else if (i == 2) {
									int i_2127_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2116_]);
									int i_2128_ = ((i_2127_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2129_ = ((i_2127_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_2117_] = (((i_2128_ | i_2129_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_1736_ == 1) {
								if (i == 1) {
									int i_2130_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2116_]);
									if (i_2130_ != 0)
										is[i_2117_] = i_2130_;
								} else if (i == 0) {
									int i_2131_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2116_]);
									if (i_2131_ != 0) {
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_2132_ = anInt9014 >>> 24;
											int i_2133_ = 256 - i_2132_;
											int i_2134_ = is[i_2117_];
											is[i_2117_] = (((((i_2131_ & 0xff00ff) * i_2132_) + ((i_2134_ & 0xff00ff) * i_2133_)) & ~0xff00ff) + ((((i_2131_ & 0xff00) * i_2132_) + ((i_2134_ & 0xff00) * i_2133_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_2135_ = (((i_2131_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2136_ = (((i_2131_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2137_ = ((i_2131_ & 0xff) * anInt9019 & 0xff00);
											i_2131_ = (i_2135_ | i_2136_ | i_2137_) >>> 8;
											int i_2138_ = is[i_2117_];
											is[i_2117_] = (((((i_2131_ & 0xff00ff) * anInt9015) + ((i_2138_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2131_ & 0xff00) * anInt9015) + ((i_2138_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_2139_ = (((i_2131_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2140_ = (((i_2131_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2141_ = ((i_2131_ & 0xff) * anInt9019 & 0xff00);
											is[i_2117_] = (i_2139_ | i_2140_ | i_2141_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_2142_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2116_]);
									int i_2143_ = anInt9014;
									int i_2144_ = i_2142_ + i_2143_;
									int i_2145_ = ((i_2142_ & 0xff00ff) + (i_2143_ & 0xff00ff));
									int i_2146_ = ((i_2145_ & 0x1000100) + (i_2144_ - i_2145_ & 0x10000));
									i_2146_ = (i_2144_ - i_2146_ | i_2146_ - (i_2146_ >>> 8));
									if (i_2142_ == 0 && anInt9015 != 255) {
										i_2142_ = i_2146_;
										i_2146_ = is[i_2117_];
										i_2146_ = (((((i_2142_ & 0xff00ff) * anInt9015) + ((i_2146_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2142_ & 0xff00) * anInt9015) + ((i_2146_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_2117_] = i_2146_;
								} else if (i == 2) {
									int i_2147_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2116_]);
									if (i_2147_ != 0) {
										int i_2148_ = ((i_2147_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2149_ = ((i_2147_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_2117_++] = ((i_2148_ | i_2149_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1736_ == 2) {
								if (i == 1) {
									int i_2150_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2116_]);
									if (i_2150_ != 0) {
										int i_2151_ = is[i_2117_];
										int i_2152_ = i_2150_ + i_2151_;
										int i_2153_ = ((i_2150_ & 0xff00ff) + (i_2151_ & 0xff00ff));
										i_2151_ = ((i_2153_ & 0x1000100) + (i_2152_ - i_2153_ & 0x10000));
										is[i_2117_] = (i_2152_ - i_2151_ | i_2151_ - (i_2151_ >>> 8));
									}
								} else if (i == 0) {
									int i_2154_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2116_]);
									if (i_2154_ != 0) {
										int i_2155_ = ((i_2154_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2156_ = ((i_2154_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2157_ = ((i_2154_ & 0xff) * anInt9019 & 0xff00);
										i_2154_ = (i_2155_ | i_2156_ | i_2157_) >>> 8;
										int i_2158_ = is[i_2117_];
										int i_2159_ = i_2154_ + i_2158_;
										int i_2160_ = ((i_2154_ & 0xff00ff) + (i_2158_ & 0xff00ff));
										i_2158_ = ((i_2160_ & 0x1000100) + (i_2159_ - i_2160_ & 0x10000));
										is[i_2117_] = (i_2159_ - i_2158_ | i_2158_ - (i_2158_ >>> 8));
									}
								} else if (i == 3) {
									int i_2161_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2116_]);
									int i_2162_ = anInt9014;
									int i_2163_ = i_2161_ + i_2162_;
									int i_2164_ = ((i_2161_ & 0xff00ff) + (i_2162_ & 0xff00ff));
									int i_2165_ = ((i_2164_ & 0x1000100) + (i_2163_ - i_2164_ & 0x10000));
									i_2161_ = (i_2163_ - i_2165_ | i_2165_ - (i_2165_ >>> 8));
									i_2165_ = is[i_2117_];
									i_2163_ = i_2161_ + i_2165_;
									i_2164_ = (i_2161_ & 0xff00ff) + (i_2165_ & 0xff00ff);
									i_2165_ = ((i_2164_ & 0x1000100) + (i_2163_ - i_2164_ & 0x10000));
									is[i_2117_] = (i_2163_ - i_2165_ | i_2165_ - (i_2165_ >>> 8));
								} else if (i == 2) {
									int i_2166_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2116_]);
									if (i_2166_ != 0) {
										int i_2167_ = ((i_2166_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2168_ = ((i_2166_ & 0xff00) * anInt9015 & 0xff0000);
										i_2166_ = (((i_2167_ | i_2168_) >>> 8) + anInt9022);
										int i_2169_ = is[i_2117_];
										int i_2170_ = i_2166_ + i_2169_;
										int i_2171_ = ((i_2166_ & 0xff00ff) + (i_2169_ & 0xff00ff));
										i_2169_ = ((i_2171_ & 0x1000100) + (i_2170_ - i_2171_ & 0x10000));
										is[i_2117_] = (i_2170_ - i_2169_ | i_2169_ - (i_2169_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2111_ += anInt9004;
						}
					}
					i_2109_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				for (int i_2172_ = anInt9001; i_2172_ < 0; i_2172_++) {
					int i_2173_ = anInt9003;
					int i_2174_ = anInt8988 + anInt9012;
					int i_2175_ = anInt9011 + anInt9013;
					int i_2176_ = anInt8999;
					if (i_2174_ < 0) {
						int i_2177_ = (anInt9004 - 1 - i_2174_) / anInt9004;
						i_2176_ += i_2177_;
						i_2174_ += anInt9004 * i_2177_;
						i_2175_ += anInt8991 * i_2177_;
						i_2173_ += i_2177_;
					}
					int i_2178_;
					if ((i_2178_ = (1 + i_2174_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_2176_)
						i_2176_ = i_2178_;
					if ((i_2178_ = i_2175_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) >= 0) {
						i_2178_ = (anInt8991 - i_2178_) / anInt8991;
						i_2176_ += i_2178_;
						i_2174_ += anInt9004 * i_2178_;
						i_2175_ += anInt8991 * i_2178_;
						i_2173_ += i_2178_;
					}
					if ((i_2178_ = (i_2175_ - anInt8991) / anInt8991) > i_2176_)
						i_2176_ = i_2178_;
					for (/**/; i_2176_ < 0; i_2176_++) {
						int i_2179_ = (((i_2175_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_2174_ >> 12));
						int i_2180_ = i_2173_++;
						if (i_1736_ == 0) {
							if (i == 1)
								is[i_2180_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2179_]);
							else if (i == 0) {
								int i_2181_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2179_++]);
								int i_2182_ = ((i_2181_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_2183_ = ((i_2181_ & 0xff00) * anInt9018 & 0xff0000);
								int i_2184_ = (i_2181_ & 0xff) * anInt9019 & 0xff00;
								is[i_2180_] = (i_2182_ | i_2183_ | i_2184_) >>> 8;
							} else if (i == 3) {
								int i_2185_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2179_++]);
								int i_2186_ = anInt9014;
								int i_2187_ = i_2185_ + i_2186_;
								int i_2188_ = ((i_2185_ & 0xff00ff) + (i_2186_ & 0xff00ff));
								int i_2189_ = ((i_2188_ & 0x1000100) + (i_2187_ - i_2188_ & 0x10000));
								is[i_2180_] = i_2187_ - i_2189_ | i_2189_ - (i_2189_ >>> 8);
							} else if (i == 2) {
								int i_2190_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2179_]);
								int i_2191_ = ((i_2190_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_2192_ = ((i_2190_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_2180_] = ((i_2191_ | i_2192_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_1736_ == 1) {
							if (i == 1) {
								int i_2193_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2179_]);
								if (i_2193_ != 0)
									is[i_2180_] = i_2193_;
							} else if (i == 0) {
								int i_2194_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2179_]);
								if (i_2194_ != 0) {
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_2195_ = anInt9014 >>> 24;
										int i_2196_ = 256 - i_2195_;
										int i_2197_ = is[i_2180_];
										is[i_2180_] = ((((i_2194_ & 0xff00ff) * i_2195_ + ((i_2197_ & 0xff00ff) * i_2196_)) & ~0xff00ff) + (((i_2194_ & 0xff00) * i_2195_ + ((i_2197_ & 0xff00) * i_2196_)) & 0xff0000)) >> 8;
									} else if (anInt9015 != 255) {
										int i_2198_ = ((i_2194_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2199_ = ((i_2194_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2200_ = ((i_2194_ & 0xff) * anInt9019 & 0xff00);
										i_2194_ = (i_2198_ | i_2199_ | i_2200_) >>> 8;
										int i_2201_ = is[i_2180_];
										is[i_2180_] = (((((i_2194_ & 0xff00ff) * anInt9015) + ((i_2201_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2194_ & 0xff00) * anInt9015) + ((i_2201_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									} else {
										int i_2202_ = ((i_2194_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2203_ = ((i_2194_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2204_ = ((i_2194_ & 0xff) * anInt9019 & 0xff00);
										is[i_2180_] = (i_2202_ | i_2203_ | i_2204_) >>> 8;
									}
								}
							} else if (i == 3) {
								int i_2205_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2179_]);
								int i_2206_ = anInt9014;
								int i_2207_ = i_2205_ + i_2206_;
								int i_2208_ = ((i_2205_ & 0xff00ff) + (i_2206_ & 0xff00ff));
								int i_2209_ = ((i_2208_ & 0x1000100) + (i_2207_ - i_2208_ & 0x10000));
								i_2209_ = i_2207_ - i_2209_ | i_2209_ - (i_2209_ >>> 8);
								if (i_2205_ == 0 && anInt9015 != 255) {
									i_2205_ = i_2209_;
									i_2209_ = is[i_2180_];
									i_2209_ = ((((i_2205_ & 0xff00ff) * anInt9015 + ((i_2209_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + (((i_2205_ & 0xff00) * anInt9015 + ((i_2209_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
								}
								is[i_2180_] = i_2209_;
							} else if (i == 2) {
								int i_2210_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2179_]);
								if (i_2210_ != 0) {
									int i_2211_ = ((i_2210_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2212_ = ((i_2210_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_2180_++] = ((i_2211_ | i_2212_) >>> 8) + anInt9022;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_1736_ == 2) {
							if (i == 1) {
								int i_2213_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2179_]);
								if (i_2213_ != 0) {
									int i_2214_ = is[i_2180_];
									int i_2215_ = i_2213_ + i_2214_;
									int i_2216_ = ((i_2213_ & 0xff00ff) + (i_2214_ & 0xff00ff));
									i_2214_ = ((i_2216_ & 0x1000100) + (i_2215_ - i_2216_ & 0x10000));
									is[i_2180_] = (i_2215_ - i_2214_ | i_2214_ - (i_2214_ >>> 8));
								}
							} else if (i == 0) {
								int i_2217_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2179_]);
								if (i_2217_ != 0) {
									int i_2218_ = ((i_2217_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2219_ = ((i_2217_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2220_ = ((i_2217_ & 0xff) * anInt9019 & 0xff00);
									i_2217_ = (i_2218_ | i_2219_ | i_2220_) >>> 8;
									int i_2221_ = is[i_2180_];
									int i_2222_ = i_2217_ + i_2221_;
									int i_2223_ = ((i_2217_ & 0xff00ff) + (i_2221_ & 0xff00ff));
									i_2221_ = ((i_2223_ & 0x1000100) + (i_2222_ - i_2223_ & 0x10000));
									is[i_2180_] = (i_2222_ - i_2221_ | i_2221_ - (i_2221_ >>> 8));
								}
							} else if (i == 3) {
								int i_2224_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2179_]);
								int i_2225_ = anInt9014;
								int i_2226_ = i_2224_ + i_2225_;
								int i_2227_ = ((i_2224_ & 0xff00ff) + (i_2225_ & 0xff00ff));
								int i_2228_ = ((i_2227_ & 0x1000100) + (i_2226_ - i_2227_ & 0x10000));
								i_2224_ = i_2226_ - i_2228_ | i_2228_ - (i_2228_ >>> 8);
								i_2228_ = is[i_2180_];
								i_2226_ = i_2224_ + i_2228_;
								i_2227_ = (i_2224_ & 0xff00ff) + (i_2228_ & 0xff00ff);
								i_2228_ = ((i_2227_ & 0x1000100) + (i_2226_ - i_2227_ & 0x10000));
								is[i_2180_] = i_2226_ - i_2228_ | i_2228_ - (i_2228_ >>> 8);
							} else if (i == 2) {
								int i_2229_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2179_]);
								if (i_2229_ != 0) {
									int i_2230_ = ((i_2229_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2231_ = ((i_2229_ & 0xff00) * anInt9015 & 0xff0000);
									i_2229_ = (((i_2230_ | i_2231_) >>> 8) + anInt9022);
									int i_2232_ = is[i_2180_];
									int i_2233_ = i_2229_ + i_2232_;
									int i_2234_ = ((i_2229_ & 0xff00ff) + (i_2232_ & 0xff00ff));
									i_2232_ = ((i_2234_ & 0x1000100) + (i_2233_ - i_2234_ & 0x10000));
									is[i_2180_] = (i_2233_ - i_2232_ | i_2232_ - (i_2232_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_2174_ += anInt9004;
						i_2175_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				for (int i_2235_ = anInt9001; i_2235_ < 0; i_2235_++) {
					int i_2236_ = anInt9003;
					int i_2237_ = anInt8988 + anInt9012;
					int i_2238_ = anInt9011 + anInt9013;
					int i_2239_ = anInt8999;
					if (i_2237_ < 0) {
						int i_2240_ = (anInt9004 - 1 - i_2237_) / anInt9004;
						i_2239_ += i_2240_;
						i_2237_ += anInt9004 * i_2240_;
						i_2238_ += anInt8991 * i_2240_;
						i_2236_ += i_2240_;
					}
					int i_2241_;
					if ((i_2241_ = (1 + i_2237_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_2239_)
						i_2239_ = i_2241_;
					if (i_2238_ < 0) {
						i_2241_ = (anInt8991 - 1 - i_2238_) / anInt8991;
						i_2239_ += i_2241_;
						i_2237_ += anInt9004 * i_2241_;
						i_2238_ += anInt8991 * i_2241_;
						i_2236_ += i_2241_;
					}
					if ((i_2241_ = (1 + i_2238_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_2239_)
						i_2239_ = i_2241_;
					for (/**/; i_2239_ < 0; i_2239_++) {
						int i_2242_ = (((i_2238_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_2237_ >> 12));
						int i_2243_ = i_2236_++;
						if (i_1736_ == 0) {
							if (i == 1)
								is[i_2243_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2242_]);
							else if (i == 0) {
								int i_2244_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2242_++]);
								int i_2245_ = ((i_2244_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_2246_ = ((i_2244_ & 0xff00) * anInt9018 & 0xff0000);
								int i_2247_ = (i_2244_ & 0xff) * anInt9019 & 0xff00;
								is[i_2243_] = (i_2245_ | i_2246_ | i_2247_) >>> 8;
							} else if (i == 3) {
								int i_2248_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2242_++]);
								int i_2249_ = anInt9014;
								int i_2250_ = i_2248_ + i_2249_;
								int i_2251_ = ((i_2248_ & 0xff00ff) + (i_2249_ & 0xff00ff));
								int i_2252_ = ((i_2251_ & 0x1000100) + (i_2250_ - i_2251_ & 0x10000));
								is[i_2243_] = i_2250_ - i_2252_ | i_2252_ - (i_2252_ >>> 8);
							} else if (i == 2) {
								int i_2253_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2242_]);
								int i_2254_ = ((i_2253_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_2255_ = ((i_2253_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_2243_] = ((i_2254_ | i_2255_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_1736_ == 1) {
							if (i == 1) {
								int i_2256_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2242_]);
								if (i_2256_ != 0)
									is[i_2243_] = i_2256_;
							} else if (i == 0) {
								int i_2257_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2242_]);
								if (i_2257_ != 0) {
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_2258_ = anInt9014 >>> 24;
										int i_2259_ = 256 - i_2258_;
										int i_2260_ = is[i_2243_];
										is[i_2243_] = ((((i_2257_ & 0xff00ff) * i_2258_ + ((i_2260_ & 0xff00ff) * i_2259_)) & ~0xff00ff) + (((i_2257_ & 0xff00) * i_2258_ + ((i_2260_ & 0xff00) * i_2259_)) & 0xff0000)) >> 8;
									} else if (anInt9015 != 255) {
										int i_2261_ = ((i_2257_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2262_ = ((i_2257_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2263_ = ((i_2257_ & 0xff) * anInt9019 & 0xff00);
										i_2257_ = (i_2261_ | i_2262_ | i_2263_) >>> 8;
										int i_2264_ = is[i_2243_];
										is[i_2243_] = (((((i_2257_ & 0xff00ff) * anInt9015) + ((i_2264_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2257_ & 0xff00) * anInt9015) + ((i_2264_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									} else {
										int i_2265_ = ((i_2257_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2266_ = ((i_2257_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2267_ = ((i_2257_ & 0xff) * anInt9019 & 0xff00);
										is[i_2243_] = (i_2265_ | i_2266_ | i_2267_) >>> 8;
									}
								}
							} else if (i == 3) {
								int i_2268_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2242_]);
								int i_2269_ = anInt9014;
								int i_2270_ = i_2268_ + i_2269_;
								int i_2271_ = ((i_2268_ & 0xff00ff) + (i_2269_ & 0xff00ff));
								int i_2272_ = ((i_2271_ & 0x1000100) + (i_2270_ - i_2271_ & 0x10000));
								i_2272_ = i_2270_ - i_2272_ | i_2272_ - (i_2272_ >>> 8);
								if (i_2268_ == 0 && anInt9015 != 255) {
									i_2268_ = i_2272_;
									i_2272_ = is[i_2243_];
									i_2272_ = ((((i_2268_ & 0xff00ff) * anInt9015 + ((i_2272_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + (((i_2268_ & 0xff00) * anInt9015 + ((i_2272_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
								}
								is[i_2243_] = i_2272_;
							} else if (i == 2) {
								int i_2273_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2242_]);
								if (i_2273_ != 0) {
									int i_2274_ = ((i_2273_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2275_ = ((i_2273_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_2243_++] = ((i_2274_ | i_2275_) >>> 8) + anInt9022;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_1736_ == 2) {
							if (i == 1) {
								int i_2276_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2242_]);
								if (i_2276_ != 0) {
									int i_2277_ = is[i_2243_];
									int i_2278_ = i_2276_ + i_2277_;
									int i_2279_ = ((i_2276_ & 0xff00ff) + (i_2277_ & 0xff00ff));
									i_2277_ = ((i_2279_ & 0x1000100) + (i_2278_ - i_2279_ & 0x10000));
									is[i_2243_] = (i_2278_ - i_2277_ | i_2277_ - (i_2277_ >>> 8));
								}
							} else if (i == 0) {
								int i_2280_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2242_]);
								if (i_2280_ != 0) {
									int i_2281_ = ((i_2280_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2282_ = ((i_2280_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2283_ = ((i_2280_ & 0xff) * anInt9019 & 0xff00);
									i_2280_ = (i_2281_ | i_2282_ | i_2283_) >>> 8;
									int i_2284_ = is[i_2243_];
									int i_2285_ = i_2280_ + i_2284_;
									int i_2286_ = ((i_2280_ & 0xff00ff) + (i_2284_ & 0xff00ff));
									i_2284_ = ((i_2286_ & 0x1000100) + (i_2285_ - i_2286_ & 0x10000));
									is[i_2243_] = (i_2285_ - i_2284_ | i_2284_ - (i_2284_ >>> 8));
								}
							} else if (i == 3) {
								int i_2287_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2242_]);
								int i_2288_ = anInt9014;
								int i_2289_ = i_2287_ + i_2288_;
								int i_2290_ = ((i_2287_ & 0xff00ff) + (i_2288_ & 0xff00ff));
								int i_2291_ = ((i_2290_ & 0x1000100) + (i_2289_ - i_2290_ & 0x10000));
								i_2287_ = i_2289_ - i_2291_ | i_2291_ - (i_2291_ >>> 8);
								i_2291_ = is[i_2243_];
								i_2289_ = i_2287_ + i_2291_;
								i_2290_ = (i_2287_ & 0xff00ff) + (i_2291_ & 0xff00ff);
								i_2291_ = ((i_2290_ & 0x1000100) + (i_2289_ - i_2290_ & 0x10000));
								is[i_2243_] = i_2289_ - i_2291_ | i_2291_ - (i_2291_ >>> 8);
							} else if (i == 2) {
								int i_2292_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2242_]);
								if (i_2292_ != 0) {
									int i_2293_ = ((i_2292_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2294_ = ((i_2292_ & 0xff00) * anInt9015 & 0xff0000);
									i_2292_ = (((i_2293_ | i_2294_) >>> 8) + anInt9022);
									int i_2295_ = is[i_2243_];
									int i_2296_ = i_2292_ + i_2295_;
									int i_2297_ = ((i_2292_ & 0xff00ff) + (i_2295_ & 0xff00ff));
									i_2295_ = ((i_2297_ & 0x1000100) + (i_2296_ - i_2297_ & 0x10000));
									is[i_2243_] = (i_2296_ - i_2295_ | i_2295_ - (i_2295_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_2237_ += anInt9004;
						i_2238_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	public void method650(int i, int i_2298_, Class_ta class_ta, int i_2299_, int i_2300_) {
		if (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			i += ((Class57_Sub1_Sub2) this).anInt8990;
			i_2298_ += ((Class57_Sub1_Sub2) this).anInt9000;
			int i_2301_ = 0;
			int i_2302_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			int i_2303_ = ((Class57_Sub1_Sub2) this).anInt9010;
			int i_2304_ = ((Class57_Sub1_Sub2) this).anInt8989;
			int i_2305_ = i_2302_ - i_2303_;
			int i_2306_ = 0;
			int i_2307_ = i + i_2298_ * i_2302_;
			if (i_2298_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_2308_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_2298_);
				i_2304_ -= i_2308_;
				i_2298_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_2301_ += i_2308_ * i_2303_;
				i_2307_ += i_2308_ * i_2302_;
			}
			if (i_2298_ + i_2304_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_2304_ -= (i_2298_ + i_2304_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_2309_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_2303_ -= i_2309_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_2301_ += i_2309_;
				i_2307_ += i_2309_;
				i_2306_ += i_2309_;
				i_2305_ += i_2309_;
			}
			if (i + i_2303_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_2310_ = (i + i_2303_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_2303_ -= i_2310_;
				i_2306_ += i_2310_;
				i_2305_ += i_2310_;
			}
			if (i_2303_ > 0 && i_2304_ > 0) {
				Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
				int[] is_2311_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8443;
				int[] is_2312_ = ((Class_ta_Sub2) class_ta_sub2).anIntArray8442;
				int i_2313_ = i_2298_;
				if (i_2300_ > i_2313_) {
					i_2313_ = i_2300_;
					i_2307_ += (i_2300_ - i_2298_) * i_2302_;
					i_2301_ += ((i_2300_ - i_2298_) * ((Class57_Sub1_Sub2) this).anInt9010);
				}
				int i_2314_ = (i_2300_ + is_2311_.length < i_2298_ + i_2304_ ? i_2300_ + is_2311_.length : i_2298_ + i_2304_);
				for (int i_2315_ = i_2313_; i_2315_ < i_2314_; i_2315_++) {
					int i_2316_ = is_2311_[i_2315_ - i_2300_] + i_2299_;
					int i_2317_ = is_2312_[i_2315_ - i_2300_];
					int i_2318_ = i_2303_;
					if (i > i_2316_) {
						int i_2319_ = i - i_2316_;
						if (i_2319_ >= i_2317_) {
							i_2301_ += i_2303_ + i_2306_;
							i_2307_ += i_2303_ + i_2305_;
							continue;
						}
						i_2317_ -= i_2319_;
					} else {
						int i_2320_ = i_2316_ - i;
						if (i_2320_ >= i_2303_) {
							i_2301_ += i_2303_ + i_2306_;
							i_2307_ += i_2303_ + i_2305_;
							continue;
						}
						i_2301_ += i_2320_;
						i_2318_ -= i_2320_;
						i_2307_ += i_2320_;
					}
					int i_2321_ = 0;
					if (i_2318_ < i_2317_)
						i_2317_ = i_2318_;
					else
						i_2321_ = i_2318_ - i_2317_;
					for (int i_2322_ = -i_2317_; i_2322_ < 0; i_2322_++) {
						int i_2323_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2301_++]);
						if (i_2323_ != 0)
							is[i_2307_++] = i_2323_;
						else
							i_2307_++;
					}
					i_2301_ += i_2321_ + i_2306_;
					i_2307_ += i_2321_ + i_2305_;
				}
			}
		}
	}

	public void method632(int i, int i_2324_, int i_2325_) {
		throw new IllegalStateException("");
	}

	void method652(int i, int i_2326_, int i_2327_, int i_2328_, int i_2329_, int i_2330_, int i_2331_, int i_2332_) {
		if (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		if (i_2327_ > 0 && i_2328_ > 0) {
			int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
			if (is != null) {
				int i_2333_ = 0;
				int i_2334_ = 0;
				int i_2335_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
				int i_2336_ = (((Class57_Sub1_Sub2) this).anInt8990 + ((Class57_Sub1_Sub2) this).anInt9010 + ((Class57_Sub1_Sub2) this).anInt8997);
				int i_2337_ = (((Class57_Sub1_Sub2) this).anInt9000 + ((Class57_Sub1_Sub2) this).anInt8989 + ((Class57_Sub1_Sub2) this).anInt8993);
				int i_2338_ = (i_2336_ << 16) / i_2327_;
				int i_2339_ = (i_2337_ << 16) / i_2328_;
				if (((Class57_Sub1_Sub2) this).anInt8990 > 0) {
					int i_2340_ = ((((Class57_Sub1_Sub2) this).anInt8990 << 16) + i_2338_ - 1) / i_2338_;
					i += i_2340_;
					i_2333_ += (i_2340_ * i_2338_ - (((Class57_Sub1_Sub2) this).anInt8990 << 16));
				}
				if (((Class57_Sub1_Sub2) this).anInt9000 > 0) {
					int i_2341_ = ((((Class57_Sub1_Sub2) this).anInt9000 << 16) + i_2339_ - 1) / i_2339_;
					i_2326_ += i_2341_;
					i_2334_ += (i_2341_ * i_2339_ - (((Class57_Sub1_Sub2) this).anInt9000 << 16));
				}
				if (((Class57_Sub1_Sub2) this).anInt9010 < i_2336_)
					i_2327_ = ((((Class57_Sub1_Sub2) this).anInt9010 << 16) - i_2333_ + i_2338_ - 1) / i_2338_;
				if (((Class57_Sub1_Sub2) this).anInt8989 < i_2337_)
					i_2328_ = ((((Class57_Sub1_Sub2) this).anInt8989 << 16) - i_2334_ + i_2339_ - 1) / i_2339_;
				int i_2342_ = i + i_2326_ * i_2335_;
				int i_2343_ = i_2335_ - i_2327_;
				if (i_2326_ + i_2328_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7977 * 63686679))
					i_2328_ -= (i_2326_ + i_2328_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7977) * 63686679);
				if (i_2326_ < (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7976) * -1278653805) {
					int i_2344_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_2326_;
					i_2328_ -= i_2344_;
					i_2342_ += i_2344_ * i_2335_;
					i_2334_ += i_2339_ * i_2344_;
				}
				if (i + i_2327_ > (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725) {
					int i_2345_ = (i + i_2327_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725);
					i_2327_ -= i_2345_;
					i_2343_ += i_2345_;
				}
				if (i < (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7974 * -912871679)) {
					int i_2346_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i;
					i_2327_ -= i_2346_;
					i_2342_ += i_2346_;
					i_2333_ += i_2338_ * i_2346_;
					i_2343_ += i_2346_;
				}
				if (i_2331_ == 0) {
					if (i_2329_ == 1) {
						int i_2347_ = i_2333_;
						for (int i_2348_ = -i_2328_; i_2348_ < 0; i_2348_++) {
							int i_2349_ = ((i_2334_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_2350_ = -i_2327_; i_2350_ < 0; i_2350_++) {
								is[i_2342_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_2333_ >> 16) + i_2349_]);
								i_2333_ += i_2338_;
							}
							i_2334_ += i_2339_;
							i_2333_ = i_2347_;
							i_2342_ += i_2343_;
						}
					} else if (i_2329_ == 0) {
						int i_2351_ = (i_2330_ & 0xff0000) >> 16;
						int i_2352_ = (i_2330_ & 0xff00) >> 8;
						int i_2353_ = i_2330_ & 0xff;
						int i_2354_ = i_2333_;
						for (int i_2355_ = -i_2328_; i_2355_ < 0; i_2355_++) {
							int i_2356_ = ((i_2334_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_2357_ = -i_2327_; i_2357_ < 0; i_2357_++) {
								int i_2358_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_2333_ >> 16) + i_2356_]);
								int i_2359_ = ((i_2358_ & 0xff0000) * i_2351_ & ~0xffffff);
								int i_2360_ = (i_2358_ & 0xff00) * i_2352_ & 0xff0000;
								int i_2361_ = (i_2358_ & 0xff) * i_2353_ & 0xff00;
								is[i_2342_++] = (i_2359_ | i_2360_ | i_2361_) >>> 8;
								i_2333_ += i_2338_;
							}
							i_2334_ += i_2339_;
							i_2333_ = i_2354_;
							i_2342_ += i_2343_;
						}
					} else if (i_2329_ == 3) {
						int i_2362_ = i_2333_;
						for (int i_2363_ = -i_2328_; i_2363_ < 0; i_2363_++) {
							int i_2364_ = ((i_2334_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_2365_ = -i_2327_; i_2365_ < 0; i_2365_++) {
								int i_2366_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_2333_ >> 16) + i_2364_]);
								int i_2367_ = i_2366_ + i_2330_;
								int i_2368_ = ((i_2366_ & 0xff00ff) + (i_2330_ & 0xff00ff));
								int i_2369_ = ((i_2368_ & 0x1000100) + (i_2367_ - i_2368_ & 0x10000));
								is[i_2342_++] = i_2367_ - i_2369_ | i_2369_ - (i_2369_ >>> 8);
								i_2333_ += i_2338_;
							}
							i_2334_ += i_2339_;
							i_2333_ = i_2362_;
							i_2342_ += i_2343_;
						}
					} else if (i_2329_ == 2) {
						int i_2370_ = i_2330_ >>> 24;
						int i_2371_ = 256 - i_2370_;
						int i_2372_ = (i_2330_ & 0xff00ff) * i_2371_ & ~0xff00ff;
						int i_2373_ = (i_2330_ & 0xff00) * i_2371_ & 0xff0000;
						i_2330_ = (i_2372_ | i_2373_) >>> 8;
						int i_2374_ = i_2333_;
						for (int i_2375_ = -i_2328_; i_2375_ < 0; i_2375_++) {
							int i_2376_ = ((i_2334_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_2377_ = -i_2327_; i_2377_ < 0; i_2377_++) {
								int i_2378_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_2333_ >> 16) + i_2376_]);
								i_2372_ = ((i_2378_ & 0xff00ff) * i_2370_ & ~0xff00ff);
								i_2373_ = (i_2378_ & 0xff00) * i_2370_ & 0xff0000;
								is[i_2342_++] = ((i_2372_ | i_2373_) >>> 8) + i_2330_;
								i_2333_ += i_2338_;
							}
							i_2334_ += i_2339_;
							i_2333_ = i_2374_;
							i_2342_ += i_2343_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2331_ == 1) {
					if (i_2329_ == 1) {
						int i_2379_ = i_2333_;
						for (int i_2380_ = -i_2328_; i_2380_ < 0; i_2380_++) {
							int i_2381_ = ((i_2334_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_2382_ = -i_2327_; i_2382_ < 0; i_2382_++) {
								int i_2383_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_2333_ >> 16) + i_2381_]);
								if (i_2383_ != 0)
									is[i_2342_++] = i_2383_;
								else
									i_2342_++;
								i_2333_ += i_2338_;
							}
							i_2334_ += i_2339_;
							i_2333_ = i_2379_;
							i_2342_ += i_2343_;
						}
					} else if (i_2329_ == 0) {
						int i_2384_ = i_2333_;
						if ((i_2330_ & 0xffffff) == 16777215) {
							int i_2385_ = i_2330_ >>> 24;
							int i_2386_ = 256 - i_2385_;
							for (int i_2387_ = -i_2328_; i_2387_ < 0; i_2387_++) {
								int i_2388_ = ((i_2334_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
								for (int i_2389_ = -i_2327_; i_2389_ < 0; i_2389_++) {
									int i_2390_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_2333_ >> 16) + i_2388_]);
									if (i_2390_ != 0) {
										int i_2391_ = is[i_2342_];
										is[i_2342_++] = ((((i_2390_ & 0xff00ff) * i_2385_ + ((i_2391_ & 0xff00ff) * i_2386_)) & ~0xff00ff) + (((i_2390_ & 0xff00) * i_2385_ + ((i_2391_ & 0xff00) * i_2386_)) & 0xff0000)) >> 8;
									} else
										i_2342_++;
									i_2333_ += i_2338_;
								}
								i_2334_ += i_2339_;
								i_2333_ = i_2384_;
								i_2342_ += i_2343_;
							}
						} else {
							int i_2392_ = (i_2330_ & 0xff0000) >> 16;
							int i_2393_ = (i_2330_ & 0xff00) >> 8;
							int i_2394_ = i_2330_ & 0xff;
							int i_2395_ = i_2330_ >>> 24;
							int i_2396_ = 256 - i_2395_;
							for (int i_2397_ = -i_2328_; i_2397_ < 0; i_2397_++) {
								int i_2398_ = ((i_2334_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
								for (int i_2399_ = -i_2327_; i_2399_ < 0; i_2399_++) {
									int i_2400_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_2333_ >> 16) + i_2398_]);
									if (i_2400_ != 0) {
										if (i_2395_ != 255) {
											int i_2401_ = (((i_2400_ & 0xff0000) * i_2392_) & ~0xffffff);
											int i_2402_ = ((i_2400_ & 0xff00) * i_2393_ & 0xff0000);
											int i_2403_ = ((i_2400_ & 0xff) * i_2394_ & 0xff00);
											i_2400_ = (i_2401_ | i_2402_ | i_2403_) >>> 8;
											int i_2404_ = is[i_2342_];
											is[i_2342_++] = (((((i_2400_ & 0xff00ff) * i_2395_) + ((i_2404_ & 0xff00ff) * i_2396_)) & ~0xff00ff) + ((((i_2400_ & 0xff00) * i_2395_) + ((i_2404_ & 0xff00) * i_2396_)) & 0xff0000)) >> 8;
										} else {
											int i_2405_ = (((i_2400_ & 0xff0000) * i_2392_) & ~0xffffff);
											int i_2406_ = ((i_2400_ & 0xff00) * i_2393_ & 0xff0000);
											int i_2407_ = ((i_2400_ & 0xff) * i_2394_ & 0xff00);
											is[i_2342_++] = (i_2405_ | i_2406_ | i_2407_) >>> 8;
										}
									} else
										i_2342_++;
									i_2333_ += i_2338_;
								}
								i_2334_ += i_2339_;
								i_2333_ = i_2384_;
								i_2342_ += i_2343_;
							}
						}
					} else if (i_2329_ == 3) {
						int i_2408_ = i_2333_;
						int i_2409_ = i_2330_ >>> 24;
						int i_2410_ = 256 - i_2409_;
						for (int i_2411_ = -i_2328_; i_2411_ < 0; i_2411_++) {
							int i_2412_ = ((i_2334_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_2413_ = -i_2327_; i_2413_ < 0; i_2413_++) {
								int i_2414_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_2333_ >> 16) + i_2412_]);
								int i_2415_ = i_2414_ + i_2330_;
								int i_2416_ = ((i_2414_ & 0xff00ff) + (i_2330_ & 0xff00ff));
								int i_2417_ = ((i_2416_ & 0x1000100) + (i_2415_ - i_2416_ & 0x10000));
								i_2417_ = i_2415_ - i_2417_ | i_2417_ - (i_2417_ >>> 8);
								if (i_2414_ == 0 && i_2409_ != 255) {
									i_2414_ = i_2417_;
									i_2417_ = is[i_2342_];
									i_2417_ = ((((i_2414_ & 0xff00ff) * i_2409_ + (i_2417_ & 0xff00ff) * i_2410_) & ~0xff00ff) + (((i_2414_ & 0xff00) * i_2409_ + (i_2417_ & 0xff00) * i_2410_) & 0xff0000)) >> 8;
								}
								is[i_2342_++] = i_2417_;
								i_2333_ += i_2338_;
							}
							i_2334_ += i_2339_;
							i_2333_ = i_2408_;
							i_2342_ += i_2343_;
						}
					} else if (i_2329_ == 2) {
						int i_2418_ = i_2330_ >>> 24;
						int i_2419_ = 256 - i_2418_;
						int i_2420_ = (i_2330_ & 0xff00ff) * i_2419_ & ~0xff00ff;
						int i_2421_ = (i_2330_ & 0xff00) * i_2419_ & 0xff0000;
						i_2330_ = (i_2420_ | i_2421_) >>> 8;
						int i_2422_ = i_2333_;
						for (int i_2423_ = -i_2328_; i_2423_ < 0; i_2423_++) {
							int i_2424_ = ((i_2334_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_2425_ = -i_2327_; i_2425_ < 0; i_2425_++) {
								int i_2426_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_2333_ >> 16) + i_2424_]);
								if (i_2426_ != 0) {
									i_2420_ = ((i_2426_ & 0xff00ff) * i_2418_ & ~0xff00ff);
									i_2421_ = ((i_2426_ & 0xff00) * i_2418_ & 0xff0000);
									is[i_2342_++] = ((i_2420_ | i_2421_) >>> 8) + i_2330_;
								} else
									i_2342_++;
								i_2333_ += i_2338_;
							}
							i_2334_ += i_2339_;
							i_2333_ = i_2422_;
							i_2342_ += i_2343_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2331_ == 2) {
					if (i_2329_ == 1) {
						int i_2427_ = i_2333_;
						for (int i_2428_ = -i_2328_; i_2428_ < 0; i_2428_++) {
							int i_2429_ = ((i_2334_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_2430_ = -i_2327_; i_2430_ < 0; i_2430_++) {
								int i_2431_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_2333_ >> 16) + i_2429_]);
								if (i_2431_ != 0) {
									int i_2432_ = is[i_2342_];
									int i_2433_ = i_2431_ + i_2432_;
									int i_2434_ = ((i_2431_ & 0xff00ff) + (i_2432_ & 0xff00ff));
									i_2432_ = ((i_2434_ & 0x1000100) + (i_2433_ - i_2434_ & 0x10000));
									is[i_2342_++] = (i_2433_ - i_2432_ | i_2432_ - (i_2432_ >>> 8));
								} else
									i_2342_++;
								i_2333_ += i_2338_;
							}
							i_2334_ += i_2339_;
							i_2333_ = i_2427_;
							i_2342_ += i_2343_;
						}
					} else if (i_2329_ == 0) {
						int i_2435_ = i_2333_;
						int i_2436_ = (i_2330_ & 0xff0000) >> 16;
						int i_2437_ = (i_2330_ & 0xff00) >> 8;
						int i_2438_ = i_2330_ & 0xff;
						for (int i_2439_ = -i_2328_; i_2439_ < 0; i_2439_++) {
							int i_2440_ = ((i_2334_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_2441_ = -i_2327_; i_2441_ < 0; i_2441_++) {
								int i_2442_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_2333_ >> 16) + i_2440_]);
								if (i_2442_ != 0) {
									int i_2443_ = ((i_2442_ & 0xff0000) * i_2436_ & ~0xffffff);
									int i_2444_ = ((i_2442_ & 0xff00) * i_2437_ & 0xff0000);
									int i_2445_ = (i_2442_ & 0xff) * i_2438_ & 0xff00;
									i_2442_ = (i_2443_ | i_2444_ | i_2445_) >>> 8;
									int i_2446_ = is[i_2342_];
									int i_2447_ = i_2442_ + i_2446_;
									int i_2448_ = ((i_2442_ & 0xff00ff) + (i_2446_ & 0xff00ff));
									i_2446_ = ((i_2448_ & 0x1000100) + (i_2447_ - i_2448_ & 0x10000));
									is[i_2342_++] = (i_2447_ - i_2446_ | i_2446_ - (i_2446_ >>> 8));
								} else
									i_2342_++;
								i_2333_ += i_2338_;
							}
							i_2334_ += i_2339_;
							i_2333_ = i_2435_;
							i_2342_ += i_2343_;
						}
					} else if (i_2329_ == 3) {
						int i_2449_ = i_2333_;
						for (int i_2450_ = -i_2328_; i_2450_ < 0; i_2450_++) {
							int i_2451_ = ((i_2334_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_2452_ = -i_2327_; i_2452_ < 0; i_2452_++) {
								int i_2453_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_2333_ >> 16) + i_2451_]);
								int i_2454_ = i_2453_ + i_2330_;
								int i_2455_ = ((i_2453_ & 0xff00ff) + (i_2330_ & 0xff00ff));
								int i_2456_ = ((i_2455_ & 0x1000100) + (i_2454_ - i_2455_ & 0x10000));
								i_2453_ = i_2454_ - i_2456_ | i_2456_ - (i_2456_ >>> 8);
								i_2456_ = is[i_2342_];
								i_2454_ = i_2453_ + i_2456_;
								i_2455_ = (i_2453_ & 0xff00ff) + (i_2456_ & 0xff00ff);
								i_2456_ = ((i_2455_ & 0x1000100) + (i_2454_ - i_2455_ & 0x10000));
								is[i_2342_++] = i_2454_ - i_2456_ | i_2456_ - (i_2456_ >>> 8);
								i_2333_ += i_2338_;
							}
							i_2334_ += i_2339_;
							i_2333_ = i_2449_;
							i_2342_ += i_2343_;
						}
					} else if (i_2329_ == 2) {
						int i_2457_ = i_2330_ >>> 24;
						int i_2458_ = 256 - i_2457_;
						int i_2459_ = (i_2330_ & 0xff00ff) * i_2458_ & ~0xff00ff;
						int i_2460_ = (i_2330_ & 0xff00) * i_2458_ & 0xff0000;
						i_2330_ = (i_2459_ | i_2460_) >>> 8;
						int i_2461_ = i_2333_;
						for (int i_2462_ = -i_2328_; i_2462_ < 0; i_2462_++) {
							int i_2463_ = ((i_2334_ >> 16) * ((Class57_Sub1_Sub2) this).anInt9010);
							for (int i_2464_ = -i_2327_; i_2464_ < 0; i_2464_++) {
								int i_2465_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(i_2333_ >> 16) + i_2463_]);
								if (i_2465_ != 0) {
									i_2459_ = ((i_2465_ & 0xff00ff) * i_2457_ & ~0xff00ff);
									i_2460_ = ((i_2465_ & 0xff00) * i_2457_ & 0xff0000);
									i_2465_ = (((i_2459_ | i_2460_) >>> 8) + i_2330_);
									int i_2466_ = is[i_2342_];
									int i_2467_ = i_2465_ + i_2466_;
									int i_2468_ = ((i_2465_ & 0xff00ff) + (i_2466_ & 0xff00ff));
									i_2466_ = ((i_2468_ & 0x1000100) + (i_2467_ - i_2468_ & 0x10000));
									is[i_2342_++] = (i_2467_ - i_2466_ | i_2466_ - (i_2466_ >>> 8));
								} else
									i_2342_++;
								i_2333_ += i_2338_;
							}
							i_2334_ += i_2339_;
							i_2333_ = i_2461_;
							i_2342_ += i_2343_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method685(int[] is, int[] is_2469_, int i, int i_2470_) {
		int[] is_2471_ = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is_2471_ != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_2472_ = anInt9001;
					while (i_2472_ < 0) {
						int i_2473_ = i_2472_ + i_2470_;
						if (i_2473_ >= 0) {
							if (i_2473_ >= is.length)
								break;
							int i_2474_ = anInt9003;
							int i_2475_ = anInt8988;
							int i_2476_ = anInt9011;
							int i_2477_ = anInt8999;
							if (i_2475_ >= 0 && i_2476_ >= 0 && (i_2475_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) < 0 && (i_2476_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) < 0) {
								int i_2478_ = is[i_2473_] - i;
								int i_2479_ = -is_2469_[i_2473_];
								int i_2480_ = i_2478_ - (i_2474_ - anInt9003);
								if (i_2480_ > 0) {
									i_2474_ += i_2480_;
									i_2477_ += i_2480_;
									i_2475_ += anInt9004 * i_2480_;
									i_2476_ += anInt8991 * i_2480_;
								} else
									i_2479_ -= i_2480_;
								if (i_2477_ < i_2479_)
									i_2477_ = i_2479_;
								for (/**/; i_2477_ < 0; i_2477_++) {
									int i_2481_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_2476_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_2475_ >> 12))]);
									if (i_2481_ != 0)
										is_2471_[i_2474_++] = i_2481_;
									else
										i_2474_++;
								}
							}
						}
						i_2472_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_2482_ = anInt9001;
					while (i_2482_ < 0) {
						int i_2483_ = i_2482_ + i_2470_;
						if (i_2483_ >= 0) {
							if (i_2483_ >= is.length)
								break;
							int i_2484_ = anInt9003;
							int i_2485_ = anInt8988;
							int i_2486_ = anInt9011 + anInt9013;
							int i_2487_ = anInt8999;
							if (i_2485_ >= 0 && (i_2485_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) < 0) {
								int i_2488_;
								if ((i_2488_ = (i_2486_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12))) >= 0) {
									i_2488_ = (anInt8991 - i_2488_) / anInt8991;
									i_2487_ += i_2488_;
									i_2486_ += anInt8991 * i_2488_;
									i_2484_ += i_2488_;
								}
								if ((i_2488_ = (i_2486_ - anInt8991) / anInt8991) > i_2487_)
									i_2487_ = i_2488_;
								int i_2489_ = is[i_2483_] - i;
								int i_2490_ = -is_2469_[i_2483_];
								int i_2491_ = i_2489_ - (i_2484_ - anInt9003);
								if (i_2491_ > 0) {
									i_2484_ += i_2491_;
									i_2487_ += i_2491_;
									i_2485_ += anInt9004 * i_2491_;
									i_2486_ += anInt8991 * i_2491_;
								} else
									i_2490_ -= i_2491_;
								if (i_2487_ < i_2490_)
									i_2487_ = i_2490_;
								for (/**/; i_2487_ < 0; i_2487_++) {
									int i_2492_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_2486_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_2485_ >> 12))]);
									if (i_2492_ != 0)
										is_2471_[i_2484_++] = i_2492_;
									else
										i_2484_++;
									i_2486_ += anInt8991;
								}
							}
						}
						i_2482_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_2493_ = anInt9001;
					while (i_2493_ < 0) {
						int i_2494_ = i_2493_ + i_2470_;
						if (i_2494_ >= 0) {
							if (i_2494_ >= is.length)
								break;
							int i_2495_ = anInt9003;
							int i_2496_ = anInt8988;
							int i_2497_ = anInt9011 + anInt9013;
							int i_2498_ = anInt8999;
							if (i_2496_ >= 0 && (i_2496_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) < 0) {
								if (i_2497_ < 0) {
									int i_2499_ = ((anInt8991 - 1 - i_2497_) / anInt8991);
									i_2498_ += i_2499_;
									i_2497_ += anInt8991 * i_2499_;
									i_2495_ += i_2499_;
								}
								int i_2500_;
								if ((i_2500_ = (1 + i_2497_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_2498_)
									i_2498_ = i_2500_;
								int i_2501_ = is[i_2494_] - i;
								int i_2502_ = -is_2469_[i_2494_];
								int i_2503_ = i_2501_ - (i_2495_ - anInt9003);
								if (i_2503_ > 0) {
									i_2495_ += i_2503_;
									i_2498_ += i_2503_;
									i_2496_ += anInt9004 * i_2503_;
									i_2497_ += anInt8991 * i_2503_;
								} else
									i_2502_ -= i_2503_;
								if (i_2498_ < i_2502_)
									i_2498_ = i_2502_;
								for (/**/; i_2498_ < 0; i_2498_++) {
									int i_2504_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_2497_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_2496_ >> 12))]);
									if (i_2504_ != 0)
										is_2471_[i_2495_++] = i_2504_;
									else
										i_2495_++;
									i_2497_ += anInt8991;
								}
							}
						}
						i_2493_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_2505_ = anInt9001;
					while (i_2505_ < 0) {
						int i_2506_ = i_2505_ + i_2470_;
						if (i_2506_ >= 0) {
							if (i_2506_ >= is.length)
								break;
							int i_2507_ = anInt9003;
							int i_2508_ = anInt8988 + anInt9012;
							int i_2509_ = anInt9011;
							int i_2510_ = anInt8999;
							if (i_2509_ >= 0 && (i_2509_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) < 0) {
								int i_2511_;
								if ((i_2511_ = (i_2508_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12))) >= 0) {
									i_2511_ = (anInt9004 - i_2511_) / anInt9004;
									i_2510_ += i_2511_;
									i_2508_ += anInt9004 * i_2511_;
									i_2507_ += i_2511_;
								}
								if ((i_2511_ = (i_2508_ - anInt9004) / anInt9004) > i_2510_)
									i_2510_ = i_2511_;
								int i_2512_ = is[i_2506_] - i;
								int i_2513_ = -is_2469_[i_2506_];
								int i_2514_ = i_2512_ - (i_2507_ - anInt9003);
								if (i_2514_ > 0) {
									i_2507_ += i_2514_;
									i_2510_ += i_2514_;
									i_2508_ += anInt9004 * i_2514_;
									i_2509_ += anInt8991 * i_2514_;
								} else
									i_2513_ -= i_2514_;
								if (i_2510_ < i_2513_)
									i_2510_ = i_2513_;
								for (/**/; i_2510_ < 0; i_2510_++) {
									int i_2515_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_2509_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_2508_ >> 12))]);
									if (i_2515_ != 0)
										is_2471_[i_2507_++] = i_2515_;
									else
										i_2507_++;
									i_2508_ += anInt9004;
								}
							}
						}
						i_2505_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_2516_ = anInt9001;
					while (i_2516_ < 0) {
						int i_2517_ = i_2516_ + i_2470_;
						if (i_2517_ >= 0) {
							if (i_2517_ >= is.length)
								break;
							int i_2518_ = anInt9003;
							int i_2519_ = anInt8988 + anInt9012;
							int i_2520_ = anInt9011 + anInt9013;
							int i_2521_ = anInt8999;
							int i_2522_;
							if ((i_2522_ = (i_2519_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12))) >= 0) {
								i_2522_ = (anInt9004 - i_2522_) / anInt9004;
								i_2521_ += i_2522_;
								i_2519_ += anInt9004 * i_2522_;
								i_2520_ += anInt8991 * i_2522_;
								i_2518_ += i_2522_;
							}
							if ((i_2522_ = (i_2519_ - anInt9004) / anInt9004) > i_2521_)
								i_2521_ = i_2522_;
							if ((i_2522_ = (i_2520_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12))) >= 0) {
								i_2522_ = (anInt8991 - i_2522_) / anInt8991;
								i_2521_ += i_2522_;
								i_2519_ += anInt9004 * i_2522_;
								i_2520_ += anInt8991 * i_2522_;
								i_2518_ += i_2522_;
							}
							if ((i_2522_ = (i_2520_ - anInt8991) / anInt8991) > i_2521_)
								i_2521_ = i_2522_;
							int i_2523_ = is[i_2517_] - i;
							int i_2524_ = -is_2469_[i_2517_];
							int i_2525_ = i_2523_ - (i_2518_ - anInt9003);
							if (i_2525_ > 0) {
								i_2518_ += i_2525_;
								i_2521_ += i_2525_;
								i_2519_ += anInt9004 * i_2525_;
								i_2520_ += anInt8991 * i_2525_;
							} else
								i_2524_ -= i_2525_;
							if (i_2521_ < i_2524_)
								i_2521_ = i_2524_;
							for (/**/; i_2521_ < 0; i_2521_++) {
								int i_2526_ = (((Class57_Sub1_Sub2) this).anIntArray9966[((i_2520_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010 + (i_2519_ >> 12))]);
								if (i_2526_ != 0)
									is_2471_[i_2518_++] = i_2526_;
								else
									i_2518_++;
								i_2519_ += anInt9004;
								i_2520_ += anInt8991;
							}
						}
						i_2516_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_2527_ = anInt9001;
					while (i_2527_ < 0) {
						int i_2528_ = i_2527_ + i_2470_;
						if (i_2528_ >= 0) {
							if (i_2528_ >= is.length)
								break;
							int i_2529_ = anInt9003;
							int i_2530_ = anInt8988 + anInt9012;
							int i_2531_ = anInt9011 + anInt9013;
							int i_2532_ = anInt8999;
							int i_2533_;
							if ((i_2533_ = (i_2530_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12))) >= 0) {
								i_2533_ = (anInt9004 - i_2533_) / anInt9004;
								i_2532_ += i_2533_;
								i_2530_ += anInt9004 * i_2533_;
								i_2531_ += anInt8991 * i_2533_;
								i_2529_ += i_2533_;
							}
							if ((i_2533_ = (i_2530_ - anInt9004) / anInt9004) > i_2532_)
								i_2532_ = i_2533_;
							if (i_2531_ < 0) {
								i_2533_ = (anInt8991 - 1 - i_2531_) / anInt8991;
								i_2532_ += i_2533_;
								i_2530_ += anInt9004 * i_2533_;
								i_2531_ += anInt8991 * i_2533_;
								i_2529_ += i_2533_;
							}
							if ((i_2533_ = (1 + i_2531_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_2532_)
								i_2532_ = i_2533_;
							int i_2534_ = is[i_2528_] - i;
							int i_2535_ = -is_2469_[i_2528_];
							int i_2536_ = i_2534_ - (i_2529_ - anInt9003);
							if (i_2536_ > 0) {
								i_2529_ += i_2536_;
								i_2532_ += i_2536_;
								i_2530_ += anInt9004 * i_2536_;
								i_2531_ += anInt8991 * i_2536_;
							} else
								i_2535_ -= i_2536_;
							if (i_2532_ < i_2535_)
								i_2532_ = i_2535_;
							for (/**/; i_2532_ < 0; i_2532_++) {
								int i_2537_ = (((Class57_Sub1_Sub2) this).anIntArray9966[((i_2531_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010 + (i_2530_ >> 12))]);
								if (i_2537_ != 0)
									is_2471_[i_2529_++] = i_2537_;
								else
									i_2529_++;
								i_2530_ += anInt9004;
								i_2531_ += anInt8991;
							}
						}
						i_2527_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_2538_ = anInt9001;
				while (i_2538_ < 0) {
					int i_2539_ = i_2538_ + i_2470_;
					if (i_2539_ >= 0) {
						if (i_2539_ >= is.length)
							break;
						int i_2540_ = anInt9003;
						int i_2541_ = anInt8988 + anInt9012;
						int i_2542_ = anInt9011;
						int i_2543_ = anInt8999;
						if (i_2542_ >= 0 && i_2542_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) < 0) {
							if (i_2541_ < 0) {
								int i_2544_ = (anInt9004 - 1 - i_2541_) / anInt9004;
								i_2543_ += i_2544_;
								i_2541_ += anInt9004 * i_2544_;
								i_2540_ += i_2544_;
							}
							int i_2545_;
							if ((i_2545_ = (1 + i_2541_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_2543_)
								i_2543_ = i_2545_;
							int i_2546_ = is[i_2539_] - i;
							int i_2547_ = -is_2469_[i_2539_];
							int i_2548_ = i_2546_ - (i_2540_ - anInt9003);
							if (i_2548_ > 0) {
								i_2540_ += i_2548_;
								i_2543_ += i_2548_;
								i_2541_ += anInt9004 * i_2548_;
								i_2542_ += anInt8991 * i_2548_;
							} else
								i_2547_ -= i_2548_;
							if (i_2543_ < i_2547_)
								i_2543_ = i_2547_;
							for (/**/; i_2543_ < 0; i_2543_++) {
								int i_2549_ = (((Class57_Sub1_Sub2) this).anIntArray9966[((i_2542_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010 + (i_2541_ >> 12))]);
								if (i_2549_ != 0)
									is_2471_[i_2540_++] = i_2549_;
								else
									i_2540_++;
								i_2541_ += anInt9004;
							}
						}
					}
					i_2538_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				int i_2550_ = anInt9001;
				while (i_2550_ < 0) {
					int i_2551_ = i_2550_ + i_2470_;
					if (i_2551_ >= 0) {
						if (i_2551_ >= is.length)
							break;
						int i_2552_ = anInt9003;
						int i_2553_ = anInt8988 + anInt9012;
						int i_2554_ = anInt9011 + anInt9013;
						int i_2555_ = anInt8999;
						if (i_2553_ < 0) {
							int i_2556_ = (anInt9004 - 1 - i_2553_) / anInt9004;
							i_2555_ += i_2556_;
							i_2553_ += anInt9004 * i_2556_;
							i_2554_ += anInt8991 * i_2556_;
							i_2552_ += i_2556_;
						}
						int i_2557_;
						if ((i_2557_ = (1 + i_2553_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_2555_)
							i_2555_ = i_2557_;
						if ((i_2557_ = i_2554_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) >= 0) {
							i_2557_ = (anInt8991 - i_2557_) / anInt8991;
							i_2555_ += i_2557_;
							i_2553_ += anInt9004 * i_2557_;
							i_2554_ += anInt8991 * i_2557_;
							i_2552_ += i_2557_;
						}
						if ((i_2557_ = (i_2554_ - anInt8991) / anInt8991) > i_2555_)
							i_2555_ = i_2557_;
						int i_2558_ = is[i_2551_] - i;
						int i_2559_ = -is_2469_[i_2551_];
						int i_2560_ = i_2558_ - (i_2552_ - anInt9003);
						if (i_2560_ > 0) {
							i_2552_ += i_2560_;
							i_2555_ += i_2560_;
							i_2553_ += anInt9004 * i_2560_;
							i_2554_ += anInt8991 * i_2560_;
						} else
							i_2559_ -= i_2560_;
						if (i_2555_ < i_2559_)
							i_2555_ = i_2559_;
						for (/**/; i_2555_ < 0; i_2555_++) {
							int i_2561_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_2554_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_2553_ >> 12))]);
							if (i_2561_ != 0)
								is_2471_[i_2552_++] = i_2561_;
							else
								i_2552_++;
							i_2553_ += anInt9004;
							i_2554_ += anInt8991;
						}
					}
					i_2550_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				int i_2562_ = anInt9001;
				while (i_2562_ < 0) {
					int i_2563_ = i_2562_ + i_2470_;
					if (i_2563_ >= 0) {
						if (i_2563_ >= is.length)
							break;
						int i_2564_ = anInt9003;
						int i_2565_ = anInt8988 + anInt9012;
						int i_2566_ = anInt9011 + anInt9013;
						int i_2567_ = anInt8999;
						if (i_2565_ < 0) {
							int i_2568_ = (anInt9004 - 1 - i_2565_) / anInt9004;
							i_2567_ += i_2568_;
							i_2565_ += anInt9004 * i_2568_;
							i_2566_ += anInt8991 * i_2568_;
							i_2564_ += i_2568_;
						}
						int i_2569_;
						if ((i_2569_ = (1 + i_2565_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_2567_)
							i_2567_ = i_2569_;
						if (i_2566_ < 0) {
							i_2569_ = (anInt8991 - 1 - i_2566_) / anInt8991;
							i_2567_ += i_2569_;
							i_2565_ += anInt9004 * i_2569_;
							i_2566_ += anInt8991 * i_2569_;
							i_2564_ += i_2569_;
						}
						if ((i_2569_ = (1 + i_2566_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_2567_)
							i_2567_ = i_2569_;
						int i_2570_ = is[i_2563_] - i;
						int i_2571_ = -is_2469_[i_2563_];
						int i_2572_ = i_2570_ - (i_2564_ - anInt9003);
						if (i_2572_ > 0) {
							i_2564_ += i_2572_;
							i_2567_ += i_2572_;
							i_2565_ += anInt9004 * i_2572_;
							i_2566_ += anInt8991 * i_2572_;
						} else
							i_2571_ -= i_2572_;
						if (i_2567_ < i_2571_)
							i_2567_ = i_2571_;
						for (/**/; i_2567_ < 0; i_2567_++) {
							int i_2573_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_2566_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_2565_ >> 12))]);
							if (i_2573_ != 0)
								is_2471_[i_2564_++] = i_2573_;
							else
								i_2564_++;
							i_2565_ += anInt9004;
							i_2566_ += anInt8991;
						}
					}
					i_2562_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	Class57_Sub1_Sub2(Class_ra_Sub1 class_ra_sub1, int[] is, int i, int i_2574_) {
		super(class_ra_sub1, i, i_2574_);
		((Class57_Sub1_Sub2) this).anIntArray9966 = is;
	}

	void method686(int i, int i_2575_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_2576_ = anInt9001;
					while (i_2576_ < 0) {
						int i_2577_ = anInt9003;
						int i_2578_ = anInt8988;
						int i_2579_ = anInt9011;
						int i_2580_ = anInt8999;
						if (i_2578_ >= 0 && i_2579_ >= 0 && i_2578_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) < 0 && i_2579_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) < 0) {
							for (/**/; i_2580_ < 0; i_2580_++) {
								int i_2581_ = (((i_2579_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_2578_ >> 12));
								int i_2582_ = i_2577_++;
								if (i_2575_ == 0) {
									if (i == 1)
										is[i_2582_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2581_]);
									else if (i == 0) {
										int i_2583_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2581_++]);
										int i_2584_ = ((i_2583_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2585_ = ((i_2583_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2586_ = ((i_2583_ & 0xff) * anInt9019 & 0xff00);
										is[i_2582_] = (i_2584_ | i_2585_ | i_2586_) >>> 8;
									} else if (i == 3) {
										int i_2587_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2581_++]);
										int i_2588_ = anInt9014;
										int i_2589_ = i_2587_ + i_2588_;
										int i_2590_ = ((i_2587_ & 0xff00ff) + (i_2588_ & 0xff00ff));
										int i_2591_ = ((i_2590_ & 0x1000100) + (i_2589_ - i_2590_ & 0x10000));
										is[i_2582_] = (i_2589_ - i_2591_ | i_2591_ - (i_2591_ >>> 8));
									} else if (i == 2) {
										int i_2592_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2581_]);
										int i_2593_ = ((i_2592_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2594_ = ((i_2592_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_2582_] = ((i_2593_ | i_2594_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_2575_ == 1) {
									if (i == 1) {
										int i_2595_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2581_]);
										if (i_2595_ != 0)
											is[i_2582_] = i_2595_;
									} else if (i == 0) {
										int i_2596_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2581_]);
										if (i_2596_ != 0) {
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_2597_ = anInt9014 >>> 24;
												int i_2598_ = 256 - i_2597_;
												int i_2599_ = is[i_2582_];
												is[i_2582_] = (((((i_2596_ & 0xff00ff) * i_2597_) + ((i_2599_ & 0xff00ff) * i_2598_)) & ~0xff00ff) + ((((i_2596_ & 0xff00) * i_2597_) + ((i_2599_ & 0xff00) * i_2598_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_2600_ = (((i_2596_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_2601_ = (((i_2596_ & 0xff00) * anInt9018) & 0xff0000);
												int i_2602_ = (((i_2596_ & 0xff) * anInt9019) & 0xff00);
												i_2596_ = (i_2600_ | i_2601_ | i_2602_) >>> 8;
												int i_2603_ = is[i_2582_];
												is[i_2582_] = (((((i_2596_ & 0xff00ff) * anInt9015) + ((i_2603_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2596_ & 0xff00) * anInt9015) + ((i_2603_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_2604_ = (((i_2596_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_2605_ = (((i_2596_ & 0xff00) * anInt9018) & 0xff0000);
												int i_2606_ = (((i_2596_ & 0xff) * anInt9019) & 0xff00);
												is[i_2582_] = (i_2604_ | i_2605_ | i_2606_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_2607_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2581_]);
										int i_2608_ = anInt9014;
										int i_2609_ = i_2607_ + i_2608_;
										int i_2610_ = ((i_2607_ & 0xff00ff) + (i_2608_ & 0xff00ff));
										int i_2611_ = ((i_2610_ & 0x1000100) + (i_2609_ - i_2610_ & 0x10000));
										i_2611_ = (i_2609_ - i_2611_ | i_2611_ - (i_2611_ >>> 8));
										if (i_2607_ == 0 && anInt9015 != 255) {
											i_2607_ = i_2611_;
											i_2611_ = is[i_2582_];
											i_2611_ = (((((i_2607_ & 0xff00ff) * anInt9015) + ((i_2611_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2607_ & 0xff00) * anInt9015) + ((i_2611_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_2582_] = i_2611_;
									} else if (i == 2) {
										int i_2612_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2581_]);
										if (i_2612_ != 0) {
											int i_2613_ = (((i_2612_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_2614_ = (((i_2612_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_2582_++] = (((i_2613_ | i_2614_) >>> 8) + anInt9022);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2575_ == 2) {
									if (i == 1) {
										int i_2615_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2581_]);
										if (i_2615_ != 0) {
											int i_2616_ = is[i_2582_];
											int i_2617_ = i_2615_ + i_2616_;
											int i_2618_ = ((i_2615_ & 0xff00ff) + (i_2616_ & 0xff00ff));
											i_2616_ = ((i_2618_ & 0x1000100) + (i_2617_ - i_2618_ & 0x10000));
											is[i_2582_] = (i_2617_ - i_2616_ | i_2616_ - (i_2616_ >>> 8));
										}
									} else if (i == 0) {
										int i_2619_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2581_]);
										if (i_2619_ != 0) {
											int i_2620_ = (((i_2619_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2621_ = (((i_2619_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2622_ = ((i_2619_ & 0xff) * anInt9019 & 0xff00);
											i_2619_ = (i_2620_ | i_2621_ | i_2622_) >>> 8;
											int i_2623_ = is[i_2582_];
											int i_2624_ = i_2619_ + i_2623_;
											int i_2625_ = ((i_2619_ & 0xff00ff) + (i_2623_ & 0xff00ff));
											i_2623_ = ((i_2625_ & 0x1000100) + (i_2624_ - i_2625_ & 0x10000));
											is[i_2582_] = (i_2624_ - i_2623_ | i_2623_ - (i_2623_ >>> 8));
										}
									} else if (i == 3) {
										int i_2626_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2581_]);
										int i_2627_ = anInt9014;
										int i_2628_ = i_2626_ + i_2627_;
										int i_2629_ = ((i_2626_ & 0xff00ff) + (i_2627_ & 0xff00ff));
										int i_2630_ = ((i_2629_ & 0x1000100) + (i_2628_ - i_2629_ & 0x10000));
										i_2626_ = (i_2628_ - i_2630_ | i_2630_ - (i_2630_ >>> 8));
										i_2630_ = is[i_2582_];
										i_2628_ = i_2626_ + i_2630_;
										i_2629_ = ((i_2626_ & 0xff00ff) + (i_2630_ & 0xff00ff));
										i_2630_ = ((i_2629_ & 0x1000100) + (i_2628_ - i_2629_ & 0x10000));
										is[i_2582_] = (i_2628_ - i_2630_ | i_2630_ - (i_2630_ >>> 8));
									} else if (i == 2) {
										int i_2631_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2581_]);
										if (i_2631_ != 0) {
											int i_2632_ = (((i_2631_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_2633_ = (((i_2631_ & 0xff00) * anInt9015) & 0xff0000);
											i_2631_ = ((i_2632_ | i_2633_) >>> 8) + anInt9022;
											int i_2634_ = is[i_2582_];
											int i_2635_ = i_2631_ + i_2634_;
											int i_2636_ = ((i_2631_ & 0xff00ff) + (i_2634_ & 0xff00ff));
											i_2634_ = ((i_2636_ & 0x1000100) + (i_2635_ - i_2636_ & 0x10000));
											is[i_2582_] = (i_2635_ - i_2634_ | i_2634_ - (i_2634_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_2576_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_2637_ = anInt9001;
					while (i_2637_ < 0) {
						int i_2638_ = anInt9003;
						int i_2639_ = anInt8988;
						int i_2640_ = anInt9011 + anInt9013;
						int i_2641_ = anInt8999;
						if (i_2639_ >= 0 && i_2639_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) < 0) {
							int i_2642_;
							if ((i_2642_ = (i_2640_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12))) >= 0) {
								i_2642_ = (anInt8991 - i_2642_) / anInt8991;
								i_2641_ += i_2642_;
								i_2640_ += anInt8991 * i_2642_;
								i_2638_ += i_2642_;
							}
							if ((i_2642_ = (i_2640_ - anInt8991) / anInt8991) > i_2641_)
								i_2641_ = i_2642_;
							for (/**/; i_2641_ < 0; i_2641_++) {
								int i_2643_ = (((i_2640_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_2639_ >> 12));
								int i_2644_ = i_2638_++;
								if (i_2575_ == 0) {
									if (i == 1)
										is[i_2644_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2643_]);
									else if (i == 0) {
										int i_2645_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2643_++]);
										int i_2646_ = ((i_2645_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2647_ = ((i_2645_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2648_ = ((i_2645_ & 0xff) * anInt9019 & 0xff00);
										is[i_2644_] = (i_2646_ | i_2647_ | i_2648_) >>> 8;
									} else if (i == 3) {
										int i_2649_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2643_++]);
										int i_2650_ = anInt9014;
										int i_2651_ = i_2649_ + i_2650_;
										int i_2652_ = ((i_2649_ & 0xff00ff) + (i_2650_ & 0xff00ff));
										int i_2653_ = ((i_2652_ & 0x1000100) + (i_2651_ - i_2652_ & 0x10000));
										is[i_2644_] = (i_2651_ - i_2653_ | i_2653_ - (i_2653_ >>> 8));
									} else if (i == 2) {
										int i_2654_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2643_]);
										int i_2655_ = ((i_2654_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2656_ = ((i_2654_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_2644_] = ((i_2655_ | i_2656_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_2575_ == 1) {
									if (i == 1) {
										int i_2657_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2643_]);
										if (i_2657_ != 0)
											is[i_2644_] = i_2657_;
									} else if (i == 0) {
										int i_2658_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2643_]);
										if (i_2658_ != 0) {
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_2659_ = anInt9014 >>> 24;
												int i_2660_ = 256 - i_2659_;
												int i_2661_ = is[i_2644_];
												is[i_2644_] = (((((i_2658_ & 0xff00ff) * i_2659_) + ((i_2661_ & 0xff00ff) * i_2660_)) & ~0xff00ff) + ((((i_2658_ & 0xff00) * i_2659_) + ((i_2661_ & 0xff00) * i_2660_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_2662_ = (((i_2658_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_2663_ = (((i_2658_ & 0xff00) * anInt9018) & 0xff0000);
												int i_2664_ = (((i_2658_ & 0xff) * anInt9019) & 0xff00);
												i_2658_ = (i_2662_ | i_2663_ | i_2664_) >>> 8;
												int i_2665_ = is[i_2644_];
												is[i_2644_] = (((((i_2658_ & 0xff00ff) * anInt9015) + ((i_2665_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2658_ & 0xff00) * anInt9015) + ((i_2665_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_2666_ = (((i_2658_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_2667_ = (((i_2658_ & 0xff00) * anInt9018) & 0xff0000);
												int i_2668_ = (((i_2658_ & 0xff) * anInt9019) & 0xff00);
												is[i_2644_] = (i_2666_ | i_2667_ | i_2668_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_2669_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2643_]);
										int i_2670_ = anInt9014;
										int i_2671_ = i_2669_ + i_2670_;
										int i_2672_ = ((i_2669_ & 0xff00ff) + (i_2670_ & 0xff00ff));
										int i_2673_ = ((i_2672_ & 0x1000100) + (i_2671_ - i_2672_ & 0x10000));
										i_2673_ = (i_2671_ - i_2673_ | i_2673_ - (i_2673_ >>> 8));
										if (i_2669_ == 0 && anInt9015 != 255) {
											i_2669_ = i_2673_;
											i_2673_ = is[i_2644_];
											i_2673_ = (((((i_2669_ & 0xff00ff) * anInt9015) + ((i_2673_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2669_ & 0xff00) * anInt9015) + ((i_2673_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_2644_] = i_2673_;
									} else if (i == 2) {
										int i_2674_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2643_]);
										if (i_2674_ != 0) {
											int i_2675_ = (((i_2674_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_2676_ = (((i_2674_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_2644_++] = (((i_2675_ | i_2676_) >>> 8) + anInt9022);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2575_ == 2) {
									if (i == 1) {
										int i_2677_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2643_]);
										if (i_2677_ != 0) {
											int i_2678_ = is[i_2644_];
											int i_2679_ = i_2677_ + i_2678_;
											int i_2680_ = ((i_2677_ & 0xff00ff) + (i_2678_ & 0xff00ff));
											i_2678_ = ((i_2680_ & 0x1000100) + (i_2679_ - i_2680_ & 0x10000));
											is[i_2644_] = (i_2679_ - i_2678_ | i_2678_ - (i_2678_ >>> 8));
										}
									} else if (i == 0) {
										int i_2681_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2643_]);
										if (i_2681_ != 0) {
											int i_2682_ = (((i_2681_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2683_ = (((i_2681_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2684_ = ((i_2681_ & 0xff) * anInt9019 & 0xff00);
											i_2681_ = (i_2682_ | i_2683_ | i_2684_) >>> 8;
											int i_2685_ = is[i_2644_];
											int i_2686_ = i_2681_ + i_2685_;
											int i_2687_ = ((i_2681_ & 0xff00ff) + (i_2685_ & 0xff00ff));
											i_2685_ = ((i_2687_ & 0x1000100) + (i_2686_ - i_2687_ & 0x10000));
											is[i_2644_] = (i_2686_ - i_2685_ | i_2685_ - (i_2685_ >>> 8));
										}
									} else if (i == 3) {
										int i_2688_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2643_]);
										int i_2689_ = anInt9014;
										int i_2690_ = i_2688_ + i_2689_;
										int i_2691_ = ((i_2688_ & 0xff00ff) + (i_2689_ & 0xff00ff));
										int i_2692_ = ((i_2691_ & 0x1000100) + (i_2690_ - i_2691_ & 0x10000));
										i_2688_ = (i_2690_ - i_2692_ | i_2692_ - (i_2692_ >>> 8));
										i_2692_ = is[i_2644_];
										i_2690_ = i_2688_ + i_2692_;
										i_2691_ = ((i_2688_ & 0xff00ff) + (i_2692_ & 0xff00ff));
										i_2692_ = ((i_2691_ & 0x1000100) + (i_2690_ - i_2691_ & 0x10000));
										is[i_2644_] = (i_2690_ - i_2692_ | i_2692_ - (i_2692_ >>> 8));
									} else if (i == 2) {
										int i_2693_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2643_]);
										if (i_2693_ != 0) {
											int i_2694_ = (((i_2693_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_2695_ = (((i_2693_ & 0xff00) * anInt9015) & 0xff0000);
											i_2693_ = ((i_2694_ | i_2695_) >>> 8) + anInt9022;
											int i_2696_ = is[i_2644_];
											int i_2697_ = i_2693_ + i_2696_;
											int i_2698_ = ((i_2693_ & 0xff00ff) + (i_2696_ & 0xff00ff));
											i_2696_ = ((i_2698_ & 0x1000100) + (i_2697_ - i_2698_ & 0x10000));
											is[i_2644_] = (i_2697_ - i_2696_ | i_2696_ - (i_2696_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2640_ += anInt8991;
							}
						}
						i_2637_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_2699_ = anInt9001;
					while (i_2699_ < 0) {
						int i_2700_ = anInt9003;
						int i_2701_ = anInt8988;
						int i_2702_ = anInt9011 + anInt9013;
						int i_2703_ = anInt8999;
						if (i_2701_ >= 0 && i_2701_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) < 0) {
							if (i_2702_ < 0) {
								int i_2704_ = (anInt8991 - 1 - i_2702_) / anInt8991;
								i_2703_ += i_2704_;
								i_2702_ += anInt8991 * i_2704_;
								i_2700_ += i_2704_;
							}
							int i_2705_;
							if ((i_2705_ = (1 + i_2702_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_2703_)
								i_2703_ = i_2705_;
							for (/**/; i_2703_ < 0; i_2703_++) {
								int i_2706_ = (((i_2702_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_2701_ >> 12));
								int i_2707_ = i_2700_++;
								if (i_2575_ == 0) {
									if (i == 1)
										is[i_2707_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2706_]);
									else if (i == 0) {
										int i_2708_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2706_++]);
										int i_2709_ = ((i_2708_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2710_ = ((i_2708_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2711_ = ((i_2708_ & 0xff) * anInt9019 & 0xff00);
										is[i_2707_] = (i_2709_ | i_2710_ | i_2711_) >>> 8;
									} else if (i == 3) {
										int i_2712_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2706_++]);
										int i_2713_ = anInt9014;
										int i_2714_ = i_2712_ + i_2713_;
										int i_2715_ = ((i_2712_ & 0xff00ff) + (i_2713_ & 0xff00ff));
										int i_2716_ = ((i_2715_ & 0x1000100) + (i_2714_ - i_2715_ & 0x10000));
										is[i_2707_] = (i_2714_ - i_2716_ | i_2716_ - (i_2716_ >>> 8));
									} else if (i == 2) {
										int i_2717_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2706_]);
										int i_2718_ = ((i_2717_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2719_ = ((i_2717_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_2707_] = ((i_2718_ | i_2719_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_2575_ == 1) {
									if (i == 1) {
										int i_2720_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2706_]);
										if (i_2720_ != 0)
											is[i_2707_] = i_2720_;
									} else if (i == 0) {
										int i_2721_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2706_]);
										if (i_2721_ != 0) {
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_2722_ = anInt9014 >>> 24;
												int i_2723_ = 256 - i_2722_;
												int i_2724_ = is[i_2707_];
												is[i_2707_] = (((((i_2721_ & 0xff00ff) * i_2722_) + ((i_2724_ & 0xff00ff) * i_2723_)) & ~0xff00ff) + ((((i_2721_ & 0xff00) * i_2722_) + ((i_2724_ & 0xff00) * i_2723_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_2725_ = (((i_2721_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_2726_ = (((i_2721_ & 0xff00) * anInt9018) & 0xff0000);
												int i_2727_ = (((i_2721_ & 0xff) * anInt9019) & 0xff00);
												i_2721_ = (i_2725_ | i_2726_ | i_2727_) >>> 8;
												int i_2728_ = is[i_2707_];
												is[i_2707_] = (((((i_2721_ & 0xff00ff) * anInt9015) + ((i_2728_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2721_ & 0xff00) * anInt9015) + ((i_2728_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_2729_ = (((i_2721_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_2730_ = (((i_2721_ & 0xff00) * anInt9018) & 0xff0000);
												int i_2731_ = (((i_2721_ & 0xff) * anInt9019) & 0xff00);
												is[i_2707_] = (i_2729_ | i_2730_ | i_2731_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_2732_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2706_]);
										int i_2733_ = anInt9014;
										int i_2734_ = i_2732_ + i_2733_;
										int i_2735_ = ((i_2732_ & 0xff00ff) + (i_2733_ & 0xff00ff));
										int i_2736_ = ((i_2735_ & 0x1000100) + (i_2734_ - i_2735_ & 0x10000));
										i_2736_ = (i_2734_ - i_2736_ | i_2736_ - (i_2736_ >>> 8));
										if (i_2732_ == 0 && anInt9015 != 255) {
											i_2732_ = i_2736_;
											i_2736_ = is[i_2707_];
											i_2736_ = (((((i_2732_ & 0xff00ff) * anInt9015) + ((i_2736_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2732_ & 0xff00) * anInt9015) + ((i_2736_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_2707_] = i_2736_;
									} else if (i == 2) {
										int i_2737_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2706_]);
										if (i_2737_ != 0) {
											int i_2738_ = (((i_2737_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_2739_ = (((i_2737_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_2707_++] = (((i_2738_ | i_2739_) >>> 8) + anInt9022);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2575_ == 2) {
									if (i == 1) {
										int i_2740_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2706_]);
										if (i_2740_ != 0) {
											int i_2741_ = is[i_2707_];
											int i_2742_ = i_2740_ + i_2741_;
											int i_2743_ = ((i_2740_ & 0xff00ff) + (i_2741_ & 0xff00ff));
											i_2741_ = ((i_2743_ & 0x1000100) + (i_2742_ - i_2743_ & 0x10000));
											is[i_2707_] = (i_2742_ - i_2741_ | i_2741_ - (i_2741_ >>> 8));
										}
									} else if (i == 0) {
										int i_2744_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2706_]);
										if (i_2744_ != 0) {
											int i_2745_ = (((i_2744_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2746_ = (((i_2744_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2747_ = ((i_2744_ & 0xff) * anInt9019 & 0xff00);
											i_2744_ = (i_2745_ | i_2746_ | i_2747_) >>> 8;
											int i_2748_ = is[i_2707_];
											int i_2749_ = i_2744_ + i_2748_;
											int i_2750_ = ((i_2744_ & 0xff00ff) + (i_2748_ & 0xff00ff));
											i_2748_ = ((i_2750_ & 0x1000100) + (i_2749_ - i_2750_ & 0x10000));
											is[i_2707_] = (i_2749_ - i_2748_ | i_2748_ - (i_2748_ >>> 8));
										}
									} else if (i == 3) {
										int i_2751_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2706_]);
										int i_2752_ = anInt9014;
										int i_2753_ = i_2751_ + i_2752_;
										int i_2754_ = ((i_2751_ & 0xff00ff) + (i_2752_ & 0xff00ff));
										int i_2755_ = ((i_2754_ & 0x1000100) + (i_2753_ - i_2754_ & 0x10000));
										i_2751_ = (i_2753_ - i_2755_ | i_2755_ - (i_2755_ >>> 8));
										i_2755_ = is[i_2707_];
										i_2753_ = i_2751_ + i_2755_;
										i_2754_ = ((i_2751_ & 0xff00ff) + (i_2755_ & 0xff00ff));
										i_2755_ = ((i_2754_ & 0x1000100) + (i_2753_ - i_2754_ & 0x10000));
										is[i_2707_] = (i_2753_ - i_2755_ | i_2755_ - (i_2755_ >>> 8));
									} else if (i == 2) {
										int i_2756_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2706_]);
										if (i_2756_ != 0) {
											int i_2757_ = (((i_2756_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_2758_ = (((i_2756_ & 0xff00) * anInt9015) & 0xff0000);
											i_2756_ = ((i_2757_ | i_2758_) >>> 8) + anInt9022;
											int i_2759_ = is[i_2707_];
											int i_2760_ = i_2756_ + i_2759_;
											int i_2761_ = ((i_2756_ & 0xff00ff) + (i_2759_ & 0xff00ff));
											i_2759_ = ((i_2761_ & 0x1000100) + (i_2760_ - i_2761_ & 0x10000));
											is[i_2707_] = (i_2760_ - i_2759_ | i_2759_ - (i_2759_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2702_ += anInt8991;
							}
						}
						i_2699_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_2762_ = anInt9001;
					while (i_2762_ < 0) {
						int i_2763_ = anInt9003;
						int i_2764_ = anInt8988 + anInt9012;
						int i_2765_ = anInt9011;
						int i_2766_ = anInt8999;
						if (i_2765_ >= 0 && i_2765_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) < 0) {
							int i_2767_;
							if ((i_2767_ = (i_2764_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12))) >= 0) {
								i_2767_ = (anInt9004 - i_2767_) / anInt9004;
								i_2766_ += i_2767_;
								i_2764_ += anInt9004 * i_2767_;
								i_2763_ += i_2767_;
							}
							if ((i_2767_ = (i_2764_ - anInt9004) / anInt9004) > i_2766_)
								i_2766_ = i_2767_;
							for (/**/; i_2766_ < 0; i_2766_++) {
								int i_2768_ = (((i_2765_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_2764_ >> 12));
								int i_2769_ = i_2763_++;
								if (i_2575_ == 0) {
									if (i == 1)
										is[i_2769_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2768_]);
									else if (i == 0) {
										int i_2770_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2768_++]);
										int i_2771_ = ((i_2770_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2772_ = ((i_2770_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2773_ = ((i_2770_ & 0xff) * anInt9019 & 0xff00);
										is[i_2769_] = (i_2771_ | i_2772_ | i_2773_) >>> 8;
									} else if (i == 3) {
										int i_2774_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2768_++]);
										int i_2775_ = anInt9014;
										int i_2776_ = i_2774_ + i_2775_;
										int i_2777_ = ((i_2774_ & 0xff00ff) + (i_2775_ & 0xff00ff));
										int i_2778_ = ((i_2777_ & 0x1000100) + (i_2776_ - i_2777_ & 0x10000));
										is[i_2769_] = (i_2776_ - i_2778_ | i_2778_ - (i_2778_ >>> 8));
									} else if (i == 2) {
										int i_2779_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2768_]);
										int i_2780_ = ((i_2779_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2781_ = ((i_2779_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_2769_] = ((i_2780_ | i_2781_) >>> 8) + anInt9022;
									} else
										throw new IllegalArgumentException();
								} else if (i_2575_ == 1) {
									if (i == 1) {
										int i_2782_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2768_]);
										if (i_2782_ != 0)
											is[i_2769_] = i_2782_;
									} else if (i == 0) {
										int i_2783_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2768_]);
										if (i_2783_ != 0) {
											if ((anInt9014 & 0xffffff) == 16777215) {
												int i_2784_ = anInt9014 >>> 24;
												int i_2785_ = 256 - i_2784_;
												int i_2786_ = is[i_2769_];
												is[i_2769_] = (((((i_2783_ & 0xff00ff) * i_2784_) + ((i_2786_ & 0xff00ff) * i_2785_)) & ~0xff00ff) + ((((i_2783_ & 0xff00) * i_2784_) + ((i_2786_ & 0xff00) * i_2785_)) & 0xff0000)) >> 8;
											} else if (anInt9015 != 255) {
												int i_2787_ = (((i_2783_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_2788_ = (((i_2783_ & 0xff00) * anInt9018) & 0xff0000);
												int i_2789_ = (((i_2783_ & 0xff) * anInt9019) & 0xff00);
												i_2783_ = (i_2787_ | i_2788_ | i_2789_) >>> 8;
												int i_2790_ = is[i_2769_];
												is[i_2769_] = (((((i_2783_ & 0xff00ff) * anInt9015) + ((i_2790_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2783_ & 0xff00) * anInt9015) + ((i_2790_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
											} else {
												int i_2791_ = (((i_2783_ & 0xff0000) * anInt9009) & ~0xffffff);
												int i_2792_ = (((i_2783_ & 0xff00) * anInt9018) & 0xff0000);
												int i_2793_ = (((i_2783_ & 0xff) * anInt9019) & 0xff00);
												is[i_2769_] = (i_2791_ | i_2792_ | i_2793_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_2794_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2768_]);
										int i_2795_ = anInt9014;
										int i_2796_ = i_2794_ + i_2795_;
										int i_2797_ = ((i_2794_ & 0xff00ff) + (i_2795_ & 0xff00ff));
										int i_2798_ = ((i_2797_ & 0x1000100) + (i_2796_ - i_2797_ & 0x10000));
										i_2798_ = (i_2796_ - i_2798_ | i_2798_ - (i_2798_ >>> 8));
										if (i_2794_ == 0 && anInt9015 != 255) {
											i_2794_ = i_2798_;
											i_2798_ = is[i_2769_];
											i_2798_ = (((((i_2794_ & 0xff00ff) * anInt9015) + ((i_2798_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2794_ & 0xff00) * anInt9015) + ((i_2798_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										}
										is[i_2769_] = i_2798_;
									} else if (i == 2) {
										int i_2799_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2768_]);
										if (i_2799_ != 0) {
											int i_2800_ = (((i_2799_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_2801_ = (((i_2799_ & 0xff00) * anInt9015) & 0xff0000);
											is[i_2769_++] = (((i_2800_ | i_2801_) >>> 8) + anInt9022);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2575_ == 2) {
									if (i == 1) {
										int i_2802_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2768_]);
										if (i_2802_ != 0) {
											int i_2803_ = is[i_2769_];
											int i_2804_ = i_2802_ + i_2803_;
											int i_2805_ = ((i_2802_ & 0xff00ff) + (i_2803_ & 0xff00ff));
											i_2803_ = ((i_2805_ & 0x1000100) + (i_2804_ - i_2805_ & 0x10000));
											is[i_2769_] = (i_2804_ - i_2803_ | i_2803_ - (i_2803_ >>> 8));
										}
									} else if (i == 0) {
										int i_2806_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2768_]);
										if (i_2806_ != 0) {
											int i_2807_ = (((i_2806_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2808_ = (((i_2806_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2809_ = ((i_2806_ & 0xff) * anInt9019 & 0xff00);
											i_2806_ = (i_2807_ | i_2808_ | i_2809_) >>> 8;
											int i_2810_ = is[i_2769_];
											int i_2811_ = i_2806_ + i_2810_;
											int i_2812_ = ((i_2806_ & 0xff00ff) + (i_2810_ & 0xff00ff));
											i_2810_ = ((i_2812_ & 0x1000100) + (i_2811_ - i_2812_ & 0x10000));
											is[i_2769_] = (i_2811_ - i_2810_ | i_2810_ - (i_2810_ >>> 8));
										}
									} else if (i == 3) {
										int i_2813_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2768_]);
										int i_2814_ = anInt9014;
										int i_2815_ = i_2813_ + i_2814_;
										int i_2816_ = ((i_2813_ & 0xff00ff) + (i_2814_ & 0xff00ff));
										int i_2817_ = ((i_2816_ & 0x1000100) + (i_2815_ - i_2816_ & 0x10000));
										i_2813_ = (i_2815_ - i_2817_ | i_2817_ - (i_2817_ >>> 8));
										i_2817_ = is[i_2769_];
										i_2815_ = i_2813_ + i_2817_;
										i_2816_ = ((i_2813_ & 0xff00ff) + (i_2817_ & 0xff00ff));
										i_2817_ = ((i_2816_ & 0x1000100) + (i_2815_ - i_2816_ & 0x10000));
										is[i_2769_] = (i_2815_ - i_2817_ | i_2817_ - (i_2817_ >>> 8));
									} else if (i == 2) {
										int i_2818_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2768_]);
										if (i_2818_ != 0) {
											int i_2819_ = (((i_2818_ & 0xff00ff) * anInt9015) & ~0xff00ff);
											int i_2820_ = (((i_2818_ & 0xff00) * anInt9015) & 0xff0000);
											i_2818_ = ((i_2819_ | i_2820_) >>> 8) + anInt9022;
											int i_2821_ = is[i_2769_];
											int i_2822_ = i_2818_ + i_2821_;
											int i_2823_ = ((i_2818_ & 0xff00ff) + (i_2821_ & 0xff00ff));
											i_2821_ = ((i_2823_ & 0x1000100) + (i_2822_ - i_2823_ & 0x10000));
											is[i_2769_] = (i_2822_ - i_2821_ | i_2821_ - (i_2821_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2764_ += anInt9004;
							}
						}
						i_2762_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_2824_ = anInt9001;
					while (i_2824_ < 0) {
						int i_2825_ = anInt9003;
						int i_2826_ = anInt8988 + anInt9012;
						int i_2827_ = anInt9011 + anInt9013;
						int i_2828_ = anInt8999;
						int i_2829_;
						if ((i_2829_ = i_2826_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) >= 0) {
							i_2829_ = (anInt9004 - i_2829_) / anInt9004;
							i_2828_ += i_2829_;
							i_2826_ += anInt9004 * i_2829_;
							i_2827_ += anInt8991 * i_2829_;
							i_2825_ += i_2829_;
						}
						if ((i_2829_ = (i_2826_ - anInt9004) / anInt9004) > i_2828_)
							i_2828_ = i_2829_;
						if ((i_2829_ = i_2827_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) >= 0) {
							i_2829_ = (anInt8991 - i_2829_) / anInt8991;
							i_2828_ += i_2829_;
							i_2826_ += anInt9004 * i_2829_;
							i_2827_ += anInt8991 * i_2829_;
							i_2825_ += i_2829_;
						}
						if ((i_2829_ = (i_2827_ - anInt8991) / anInt8991) > i_2828_)
							i_2828_ = i_2829_;
						for (/**/; i_2828_ < 0; i_2828_++) {
							int i_2830_ = (((i_2827_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_2826_ >> 12));
							int i_2831_ = i_2825_++;
							if (i_2575_ == 0) {
								if (i == 1)
									is[i_2831_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2830_]);
								else if (i == 0) {
									int i_2832_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2830_++]);
									int i_2833_ = ((i_2832_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2834_ = ((i_2832_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2835_ = ((i_2832_ & 0xff) * anInt9019 & 0xff00);
									is[i_2831_] = (i_2833_ | i_2834_ | i_2835_) >>> 8;
								} else if (i == 3) {
									int i_2836_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2830_++]);
									int i_2837_ = anInt9014;
									int i_2838_ = i_2836_ + i_2837_;
									int i_2839_ = ((i_2836_ & 0xff00ff) + (i_2837_ & 0xff00ff));
									int i_2840_ = ((i_2839_ & 0x1000100) + (i_2838_ - i_2839_ & 0x10000));
									is[i_2831_] = (i_2838_ - i_2840_ | i_2840_ - (i_2840_ >>> 8));
								} else if (i == 2) {
									int i_2841_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2830_]);
									int i_2842_ = ((i_2841_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2843_ = ((i_2841_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_2831_] = (((i_2842_ | i_2843_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_2575_ == 1) {
								if (i == 1) {
									int i_2844_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2830_]);
									if (i_2844_ != 0)
										is[i_2831_] = i_2844_;
								} else if (i == 0) {
									int i_2845_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2830_]);
									if (i_2845_ != 0) {
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_2846_ = anInt9014 >>> 24;
											int i_2847_ = 256 - i_2846_;
											int i_2848_ = is[i_2831_];
											is[i_2831_] = (((((i_2845_ & 0xff00ff) * i_2846_) + ((i_2848_ & 0xff00ff) * i_2847_)) & ~0xff00ff) + ((((i_2845_ & 0xff00) * i_2846_) + ((i_2848_ & 0xff00) * i_2847_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_2849_ = (((i_2845_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2850_ = (((i_2845_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2851_ = ((i_2845_ & 0xff) * anInt9019 & 0xff00);
											i_2845_ = (i_2849_ | i_2850_ | i_2851_) >>> 8;
											int i_2852_ = is[i_2831_];
											is[i_2831_] = (((((i_2845_ & 0xff00ff) * anInt9015) + ((i_2852_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2845_ & 0xff00) * anInt9015) + ((i_2852_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_2853_ = (((i_2845_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2854_ = (((i_2845_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2855_ = ((i_2845_ & 0xff) * anInt9019 & 0xff00);
											is[i_2831_] = (i_2853_ | i_2854_ | i_2855_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_2856_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2830_]);
									int i_2857_ = anInt9014;
									int i_2858_ = i_2856_ + i_2857_;
									int i_2859_ = ((i_2856_ & 0xff00ff) + (i_2857_ & 0xff00ff));
									int i_2860_ = ((i_2859_ & 0x1000100) + (i_2858_ - i_2859_ & 0x10000));
									i_2860_ = (i_2858_ - i_2860_ | i_2860_ - (i_2860_ >>> 8));
									if (i_2856_ == 0 && anInt9015 != 255) {
										i_2856_ = i_2860_;
										i_2860_ = is[i_2831_];
										i_2860_ = (((((i_2856_ & 0xff00ff) * anInt9015) + ((i_2860_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2856_ & 0xff00) * anInt9015) + ((i_2860_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_2831_] = i_2860_;
								} else if (i == 2) {
									int i_2861_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2830_]);
									if (i_2861_ != 0) {
										int i_2862_ = ((i_2861_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2863_ = ((i_2861_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_2831_++] = ((i_2862_ | i_2863_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2575_ == 2) {
								if (i == 1) {
									int i_2864_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2830_]);
									if (i_2864_ != 0) {
										int i_2865_ = is[i_2831_];
										int i_2866_ = i_2864_ + i_2865_;
										int i_2867_ = ((i_2864_ & 0xff00ff) + (i_2865_ & 0xff00ff));
										i_2865_ = ((i_2867_ & 0x1000100) + (i_2866_ - i_2867_ & 0x10000));
										is[i_2831_] = (i_2866_ - i_2865_ | i_2865_ - (i_2865_ >>> 8));
									}
								} else if (i == 0) {
									int i_2868_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2830_]);
									if (i_2868_ != 0) {
										int i_2869_ = ((i_2868_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2870_ = ((i_2868_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2871_ = ((i_2868_ & 0xff) * anInt9019 & 0xff00);
										i_2868_ = (i_2869_ | i_2870_ | i_2871_) >>> 8;
										int i_2872_ = is[i_2831_];
										int i_2873_ = i_2868_ + i_2872_;
										int i_2874_ = ((i_2868_ & 0xff00ff) + (i_2872_ & 0xff00ff));
										i_2872_ = ((i_2874_ & 0x1000100) + (i_2873_ - i_2874_ & 0x10000));
										is[i_2831_] = (i_2873_ - i_2872_ | i_2872_ - (i_2872_ >>> 8));
									}
								} else if (i == 3) {
									int i_2875_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2830_]);
									int i_2876_ = anInt9014;
									int i_2877_ = i_2875_ + i_2876_;
									int i_2878_ = ((i_2875_ & 0xff00ff) + (i_2876_ & 0xff00ff));
									int i_2879_ = ((i_2878_ & 0x1000100) + (i_2877_ - i_2878_ & 0x10000));
									i_2875_ = (i_2877_ - i_2879_ | i_2879_ - (i_2879_ >>> 8));
									i_2879_ = is[i_2831_];
									i_2877_ = i_2875_ + i_2879_;
									i_2878_ = (i_2875_ & 0xff00ff) + (i_2879_ & 0xff00ff);
									i_2879_ = ((i_2878_ & 0x1000100) + (i_2877_ - i_2878_ & 0x10000));
									is[i_2831_] = (i_2877_ - i_2879_ | i_2879_ - (i_2879_ >>> 8));
								} else if (i == 2) {
									int i_2880_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2830_]);
									if (i_2880_ != 0) {
										int i_2881_ = ((i_2880_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2882_ = ((i_2880_ & 0xff00) * anInt9015 & 0xff0000);
										i_2880_ = (((i_2881_ | i_2882_) >>> 8) + anInt9022);
										int i_2883_ = is[i_2831_];
										int i_2884_ = i_2880_ + i_2883_;
										int i_2885_ = ((i_2880_ & 0xff00ff) + (i_2883_ & 0xff00ff));
										i_2883_ = ((i_2885_ & 0x1000100) + (i_2884_ - i_2885_ & 0x10000));
										is[i_2831_] = (i_2884_ - i_2883_ | i_2883_ - (i_2883_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2826_ += anInt9004;
							i_2827_ += anInt8991;
						}
						i_2824_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_2886_ = anInt9001;
					while (i_2886_ < 0) {
						int i_2887_ = anInt9003;
						int i_2888_ = anInt8988 + anInt9012;
						int i_2889_ = anInt9011 + anInt9013;
						int i_2890_ = anInt8999;
						int i_2891_;
						if ((i_2891_ = i_2888_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) >= 0) {
							i_2891_ = (anInt9004 - i_2891_) / anInt9004;
							i_2890_ += i_2891_;
							i_2888_ += anInt9004 * i_2891_;
							i_2889_ += anInt8991 * i_2891_;
							i_2887_ += i_2891_;
						}
						if ((i_2891_ = (i_2888_ - anInt9004) / anInt9004) > i_2890_)
							i_2890_ = i_2891_;
						if (i_2889_ < 0) {
							i_2891_ = (anInt8991 - 1 - i_2889_) / anInt8991;
							i_2890_ += i_2891_;
							i_2888_ += anInt9004 * i_2891_;
							i_2889_ += anInt8991 * i_2891_;
							i_2887_ += i_2891_;
						}
						if ((i_2891_ = (1 + i_2889_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_2890_)
							i_2890_ = i_2891_;
						for (/**/; i_2890_ < 0; i_2890_++) {
							int i_2892_ = (((i_2889_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_2888_ >> 12));
							int i_2893_ = i_2887_++;
							if (i_2575_ == 0) {
								if (i == 1)
									is[i_2893_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2892_]);
								else if (i == 0) {
									int i_2894_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2892_++]);
									int i_2895_ = ((i_2894_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2896_ = ((i_2894_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2897_ = ((i_2894_ & 0xff) * anInt9019 & 0xff00);
									is[i_2893_] = (i_2895_ | i_2896_ | i_2897_) >>> 8;
								} else if (i == 3) {
									int i_2898_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2892_++]);
									int i_2899_ = anInt9014;
									int i_2900_ = i_2898_ + i_2899_;
									int i_2901_ = ((i_2898_ & 0xff00ff) + (i_2899_ & 0xff00ff));
									int i_2902_ = ((i_2901_ & 0x1000100) + (i_2900_ - i_2901_ & 0x10000));
									is[i_2893_] = (i_2900_ - i_2902_ | i_2902_ - (i_2902_ >>> 8));
								} else if (i == 2) {
									int i_2903_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2892_]);
									int i_2904_ = ((i_2903_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2905_ = ((i_2903_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_2893_] = (((i_2904_ | i_2905_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_2575_ == 1) {
								if (i == 1) {
									int i_2906_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2892_]);
									if (i_2906_ != 0)
										is[i_2893_] = i_2906_;
								} else if (i == 0) {
									int i_2907_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2892_]);
									if (i_2907_ != 0) {
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_2908_ = anInt9014 >>> 24;
											int i_2909_ = 256 - i_2908_;
											int i_2910_ = is[i_2893_];
											is[i_2893_] = (((((i_2907_ & 0xff00ff) * i_2908_) + ((i_2910_ & 0xff00ff) * i_2909_)) & ~0xff00ff) + ((((i_2907_ & 0xff00) * i_2908_) + ((i_2910_ & 0xff00) * i_2909_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_2911_ = (((i_2907_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2912_ = (((i_2907_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2913_ = ((i_2907_ & 0xff) * anInt9019 & 0xff00);
											i_2907_ = (i_2911_ | i_2912_ | i_2913_) >>> 8;
											int i_2914_ = is[i_2893_];
											is[i_2893_] = (((((i_2907_ & 0xff00ff) * anInt9015) + ((i_2914_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2907_ & 0xff00) * anInt9015) + ((i_2914_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_2915_ = (((i_2907_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2916_ = (((i_2907_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2917_ = ((i_2907_ & 0xff) * anInt9019 & 0xff00);
											is[i_2893_] = (i_2915_ | i_2916_ | i_2917_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_2918_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2892_]);
									int i_2919_ = anInt9014;
									int i_2920_ = i_2918_ + i_2919_;
									int i_2921_ = ((i_2918_ & 0xff00ff) + (i_2919_ & 0xff00ff));
									int i_2922_ = ((i_2921_ & 0x1000100) + (i_2920_ - i_2921_ & 0x10000));
									i_2922_ = (i_2920_ - i_2922_ | i_2922_ - (i_2922_ >>> 8));
									if (i_2918_ == 0 && anInt9015 != 255) {
										i_2918_ = i_2922_;
										i_2922_ = is[i_2893_];
										i_2922_ = (((((i_2918_ & 0xff00ff) * anInt9015) + ((i_2922_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2918_ & 0xff00) * anInt9015) + ((i_2922_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_2893_] = i_2922_;
								} else if (i == 2) {
									int i_2923_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2892_]);
									if (i_2923_ != 0) {
										int i_2924_ = ((i_2923_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2925_ = ((i_2923_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_2893_++] = ((i_2924_ | i_2925_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2575_ == 2) {
								if (i == 1) {
									int i_2926_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2892_]);
									if (i_2926_ != 0) {
										int i_2927_ = is[i_2893_];
										int i_2928_ = i_2926_ + i_2927_;
										int i_2929_ = ((i_2926_ & 0xff00ff) + (i_2927_ & 0xff00ff));
										i_2927_ = ((i_2929_ & 0x1000100) + (i_2928_ - i_2929_ & 0x10000));
										is[i_2893_] = (i_2928_ - i_2927_ | i_2927_ - (i_2927_ >>> 8));
									}
								} else if (i == 0) {
									int i_2930_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2892_]);
									if (i_2930_ != 0) {
										int i_2931_ = ((i_2930_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2932_ = ((i_2930_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2933_ = ((i_2930_ & 0xff) * anInt9019 & 0xff00);
										i_2930_ = (i_2931_ | i_2932_ | i_2933_) >>> 8;
										int i_2934_ = is[i_2893_];
										int i_2935_ = i_2930_ + i_2934_;
										int i_2936_ = ((i_2930_ & 0xff00ff) + (i_2934_ & 0xff00ff));
										i_2934_ = ((i_2936_ & 0x1000100) + (i_2935_ - i_2936_ & 0x10000));
										is[i_2893_] = (i_2935_ - i_2934_ | i_2934_ - (i_2934_ >>> 8));
									}
								} else if (i == 3) {
									int i_2937_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2892_]);
									int i_2938_ = anInt9014;
									int i_2939_ = i_2937_ + i_2938_;
									int i_2940_ = ((i_2937_ & 0xff00ff) + (i_2938_ & 0xff00ff));
									int i_2941_ = ((i_2940_ & 0x1000100) + (i_2939_ - i_2940_ & 0x10000));
									i_2937_ = (i_2939_ - i_2941_ | i_2941_ - (i_2941_ >>> 8));
									i_2941_ = is[i_2893_];
									i_2939_ = i_2937_ + i_2941_;
									i_2940_ = (i_2937_ & 0xff00ff) + (i_2941_ & 0xff00ff);
									i_2941_ = ((i_2940_ & 0x1000100) + (i_2939_ - i_2940_ & 0x10000));
									is[i_2893_] = (i_2939_ - i_2941_ | i_2941_ - (i_2941_ >>> 8));
								} else if (i == 2) {
									int i_2942_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2892_]);
									if (i_2942_ != 0) {
										int i_2943_ = ((i_2942_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2944_ = ((i_2942_ & 0xff00) * anInt9015 & 0xff0000);
										i_2942_ = (((i_2943_ | i_2944_) >>> 8) + anInt9022);
										int i_2945_ = is[i_2893_];
										int i_2946_ = i_2942_ + i_2945_;
										int i_2947_ = ((i_2942_ & 0xff00ff) + (i_2945_ & 0xff00ff));
										i_2945_ = ((i_2947_ & 0x1000100) + (i_2946_ - i_2947_ & 0x10000));
										is[i_2893_] = (i_2946_ - i_2945_ | i_2945_ - (i_2945_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2888_ += anInt9004;
							i_2889_ += anInt8991;
						}
						i_2886_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_2948_ = anInt9001;
				while (i_2948_ < 0) {
					int i_2949_ = anInt9003;
					int i_2950_ = anInt8988 + anInt9012;
					int i_2951_ = anInt9011;
					int i_2952_ = anInt8999;
					if (i_2951_ >= 0 && i_2951_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) < 0) {
						if (i_2950_ < 0) {
							int i_2953_ = (anInt9004 - 1 - i_2950_) / anInt9004;
							i_2952_ += i_2953_;
							i_2950_ += anInt9004 * i_2953_;
							i_2949_ += i_2953_;
						}
						int i_2954_;
						if ((i_2954_ = (1 + i_2950_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_2952_)
							i_2952_ = i_2954_;
						for (/**/; i_2952_ < 0; i_2952_++) {
							int i_2955_ = (((i_2951_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_2950_ >> 12));
							int i_2956_ = i_2949_++;
							if (i_2575_ == 0) {
								if (i == 1)
									is[i_2956_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2955_]);
								else if (i == 0) {
									int i_2957_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2955_++]);
									int i_2958_ = ((i_2957_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_2959_ = ((i_2957_ & 0xff00) * anInt9018 & 0xff0000);
									int i_2960_ = ((i_2957_ & 0xff) * anInt9019 & 0xff00);
									is[i_2956_] = (i_2958_ | i_2959_ | i_2960_) >>> 8;
								} else if (i == 3) {
									int i_2961_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2955_++]);
									int i_2962_ = anInt9014;
									int i_2963_ = i_2961_ + i_2962_;
									int i_2964_ = ((i_2961_ & 0xff00ff) + (i_2962_ & 0xff00ff));
									int i_2965_ = ((i_2964_ & 0x1000100) + (i_2963_ - i_2964_ & 0x10000));
									is[i_2956_] = (i_2963_ - i_2965_ | i_2965_ - (i_2965_ >>> 8));
								} else if (i == 2) {
									int i_2966_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2955_]);
									int i_2967_ = ((i_2966_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_2968_ = ((i_2966_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_2956_] = (((i_2967_ | i_2968_) >>> 8) + anInt9022);
								} else
									throw new IllegalArgumentException();
							} else if (i_2575_ == 1) {
								if (i == 1) {
									int i_2969_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2955_]);
									if (i_2969_ != 0)
										is[i_2956_] = i_2969_;
								} else if (i == 0) {
									int i_2970_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2955_]);
									if (i_2970_ != 0) {
										if ((anInt9014 & 0xffffff) == 16777215) {
											int i_2971_ = anInt9014 >>> 24;
											int i_2972_ = 256 - i_2971_;
											int i_2973_ = is[i_2956_];
											is[i_2956_] = (((((i_2970_ & 0xff00ff) * i_2971_) + ((i_2973_ & 0xff00ff) * i_2972_)) & ~0xff00ff) + ((((i_2970_ & 0xff00) * i_2971_) + ((i_2973_ & 0xff00) * i_2972_)) & 0xff0000)) >> 8;
										} else if (anInt9015 != 255) {
											int i_2974_ = (((i_2970_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2975_ = (((i_2970_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2976_ = ((i_2970_ & 0xff) * anInt9019 & 0xff00);
											i_2970_ = (i_2974_ | i_2975_ | i_2976_) >>> 8;
											int i_2977_ = is[i_2956_];
											is[i_2956_] = (((((i_2970_ & 0xff00ff) * anInt9015) + ((i_2977_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2970_ & 0xff00) * anInt9015) + ((i_2977_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
										} else {
											int i_2978_ = (((i_2970_ & 0xff0000) * anInt9009) & ~0xffffff);
											int i_2979_ = (((i_2970_ & 0xff00) * anInt9018) & 0xff0000);
											int i_2980_ = ((i_2970_ & 0xff) * anInt9019 & 0xff00);
											is[i_2956_] = (i_2978_ | i_2979_ | i_2980_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_2981_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2955_]);
									int i_2982_ = anInt9014;
									int i_2983_ = i_2981_ + i_2982_;
									int i_2984_ = ((i_2981_ & 0xff00ff) + (i_2982_ & 0xff00ff));
									int i_2985_ = ((i_2984_ & 0x1000100) + (i_2983_ - i_2984_ & 0x10000));
									i_2985_ = (i_2983_ - i_2985_ | i_2985_ - (i_2985_ >>> 8));
									if (i_2981_ == 0 && anInt9015 != 255) {
										i_2981_ = i_2985_;
										i_2985_ = is[i_2956_];
										i_2985_ = (((((i_2981_ & 0xff00ff) * anInt9015) + ((i_2985_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_2981_ & 0xff00) * anInt9015) + ((i_2985_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									}
									is[i_2956_] = i_2985_;
								} else if (i == 2) {
									int i_2986_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2955_]);
									if (i_2986_ != 0) {
										int i_2987_ = ((i_2986_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_2988_ = ((i_2986_ & 0xff00) * anInt9015 & 0xff0000);
										is[i_2956_++] = ((i_2987_ | i_2988_) >>> 8) + anInt9022;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2575_ == 2) {
								if (i == 1) {
									int i_2989_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2955_]);
									if (i_2989_ != 0) {
										int i_2990_ = is[i_2956_];
										int i_2991_ = i_2989_ + i_2990_;
										int i_2992_ = ((i_2989_ & 0xff00ff) + (i_2990_ & 0xff00ff));
										i_2990_ = ((i_2992_ & 0x1000100) + (i_2991_ - i_2992_ & 0x10000));
										is[i_2956_] = (i_2991_ - i_2990_ | i_2990_ - (i_2990_ >>> 8));
									}
								} else if (i == 0) {
									int i_2993_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2955_]);
									if (i_2993_ != 0) {
										int i_2994_ = ((i_2993_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_2995_ = ((i_2993_ & 0xff00) * anInt9018 & 0xff0000);
										int i_2996_ = ((i_2993_ & 0xff) * anInt9019 & 0xff00);
										i_2993_ = (i_2994_ | i_2995_ | i_2996_) >>> 8;
										int i_2997_ = is[i_2956_];
										int i_2998_ = i_2993_ + i_2997_;
										int i_2999_ = ((i_2993_ & 0xff00ff) + (i_2997_ & 0xff00ff));
										i_2997_ = ((i_2999_ & 0x1000100) + (i_2998_ - i_2999_ & 0x10000));
										is[i_2956_] = (i_2998_ - i_2997_ | i_2997_ - (i_2997_ >>> 8));
									}
								} else if (i == 3) {
									int i_3000_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2955_]);
									int i_3001_ = anInt9014;
									int i_3002_ = i_3000_ + i_3001_;
									int i_3003_ = ((i_3000_ & 0xff00ff) + (i_3001_ & 0xff00ff));
									int i_3004_ = ((i_3003_ & 0x1000100) + (i_3002_ - i_3003_ & 0x10000));
									i_3000_ = (i_3002_ - i_3004_ | i_3004_ - (i_3004_ >>> 8));
									i_3004_ = is[i_2956_];
									i_3002_ = i_3000_ + i_3004_;
									i_3003_ = (i_3000_ & 0xff00ff) + (i_3004_ & 0xff00ff);
									i_3004_ = ((i_3003_ & 0x1000100) + (i_3002_ - i_3003_ & 0x10000));
									is[i_2956_] = (i_3002_ - i_3004_ | i_3004_ - (i_3004_ >>> 8));
								} else if (i == 2) {
									int i_3005_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_2955_]);
									if (i_3005_ != 0) {
										int i_3006_ = ((i_3005_ & 0xff00ff) * anInt9015 & ~0xff00ff);
										int i_3007_ = ((i_3005_ & 0xff00) * anInt9015 & 0xff0000);
										i_3005_ = (((i_3006_ | i_3007_) >>> 8) + anInt9022);
										int i_3008_ = is[i_2956_];
										int i_3009_ = i_3005_ + i_3008_;
										int i_3010_ = ((i_3005_ & 0xff00ff) + (i_3008_ & 0xff00ff));
										i_3008_ = ((i_3010_ & 0x1000100) + (i_3009_ - i_3010_ & 0x10000));
										is[i_2956_] = (i_3009_ - i_3008_ | i_3008_ - (i_3008_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2950_ += anInt9004;
						}
					}
					i_2948_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				for (int i_3011_ = anInt9001; i_3011_ < 0; i_3011_++) {
					int i_3012_ = anInt9003;
					int i_3013_ = anInt8988 + anInt9012;
					int i_3014_ = anInt9011 + anInt9013;
					int i_3015_ = anInt8999;
					if (i_3013_ < 0) {
						int i_3016_ = (anInt9004 - 1 - i_3013_) / anInt9004;
						i_3015_ += i_3016_;
						i_3013_ += anInt9004 * i_3016_;
						i_3014_ += anInt8991 * i_3016_;
						i_3012_ += i_3016_;
					}
					int i_3017_;
					if ((i_3017_ = (1 + i_3013_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3015_)
						i_3015_ = i_3017_;
					if ((i_3017_ = i_3014_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) >= 0) {
						i_3017_ = (anInt8991 - i_3017_) / anInt8991;
						i_3015_ += i_3017_;
						i_3013_ += anInt9004 * i_3017_;
						i_3014_ += anInt8991 * i_3017_;
						i_3012_ += i_3017_;
					}
					if ((i_3017_ = (i_3014_ - anInt8991) / anInt8991) > i_3015_)
						i_3015_ = i_3017_;
					for (/**/; i_3015_ < 0; i_3015_++) {
						int i_3018_ = (((i_3014_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_3013_ >> 12));
						int i_3019_ = i_3012_++;
						if (i_2575_ == 0) {
							if (i == 1)
								is[i_3019_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3018_]);
							else if (i == 0) {
								int i_3020_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3018_++]);
								int i_3021_ = ((i_3020_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_3022_ = ((i_3020_ & 0xff00) * anInt9018 & 0xff0000);
								int i_3023_ = (i_3020_ & 0xff) * anInt9019 & 0xff00;
								is[i_3019_] = (i_3021_ | i_3022_ | i_3023_) >>> 8;
							} else if (i == 3) {
								int i_3024_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3018_++]);
								int i_3025_ = anInt9014;
								int i_3026_ = i_3024_ + i_3025_;
								int i_3027_ = ((i_3024_ & 0xff00ff) + (i_3025_ & 0xff00ff));
								int i_3028_ = ((i_3027_ & 0x1000100) + (i_3026_ - i_3027_ & 0x10000));
								is[i_3019_] = i_3026_ - i_3028_ | i_3028_ - (i_3028_ >>> 8);
							} else if (i == 2) {
								int i_3029_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3018_]);
								int i_3030_ = ((i_3029_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_3031_ = ((i_3029_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_3019_] = ((i_3030_ | i_3031_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_2575_ == 1) {
							if (i == 1) {
								int i_3032_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3018_]);
								if (i_3032_ != 0)
									is[i_3019_] = i_3032_;
							} else if (i == 0) {
								int i_3033_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3018_]);
								if (i_3033_ != 0) {
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_3034_ = anInt9014 >>> 24;
										int i_3035_ = 256 - i_3034_;
										int i_3036_ = is[i_3019_];
										is[i_3019_] = ((((i_3033_ & 0xff00ff) * i_3034_ + ((i_3036_ & 0xff00ff) * i_3035_)) & ~0xff00ff) + (((i_3033_ & 0xff00) * i_3034_ + ((i_3036_ & 0xff00) * i_3035_)) & 0xff0000)) >> 8;
									} else if (anInt9015 != 255) {
										int i_3037_ = ((i_3033_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3038_ = ((i_3033_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3039_ = ((i_3033_ & 0xff) * anInt9019 & 0xff00);
										i_3033_ = (i_3037_ | i_3038_ | i_3039_) >>> 8;
										int i_3040_ = is[i_3019_];
										is[i_3019_] = (((((i_3033_ & 0xff00ff) * anInt9015) + ((i_3040_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3033_ & 0xff00) * anInt9015) + ((i_3040_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									} else {
										int i_3041_ = ((i_3033_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3042_ = ((i_3033_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3043_ = ((i_3033_ & 0xff) * anInt9019 & 0xff00);
										is[i_3019_] = (i_3041_ | i_3042_ | i_3043_) >>> 8;
									}
								}
							} else if (i == 3) {
								int i_3044_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3018_]);
								int i_3045_ = anInt9014;
								int i_3046_ = i_3044_ + i_3045_;
								int i_3047_ = ((i_3044_ & 0xff00ff) + (i_3045_ & 0xff00ff));
								int i_3048_ = ((i_3047_ & 0x1000100) + (i_3046_ - i_3047_ & 0x10000));
								i_3048_ = i_3046_ - i_3048_ | i_3048_ - (i_3048_ >>> 8);
								if (i_3044_ == 0 && anInt9015 != 255) {
									i_3044_ = i_3048_;
									i_3048_ = is[i_3019_];
									i_3048_ = ((((i_3044_ & 0xff00ff) * anInt9015 + ((i_3048_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + (((i_3044_ & 0xff00) * anInt9015 + ((i_3048_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
								}
								is[i_3019_] = i_3048_;
							} else if (i == 2) {
								int i_3049_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3018_]);
								if (i_3049_ != 0) {
									int i_3050_ = ((i_3049_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3051_ = ((i_3049_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_3019_++] = ((i_3050_ | i_3051_) >>> 8) + anInt9022;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2575_ == 2) {
							if (i == 1) {
								int i_3052_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3018_]);
								if (i_3052_ != 0) {
									int i_3053_ = is[i_3019_];
									int i_3054_ = i_3052_ + i_3053_;
									int i_3055_ = ((i_3052_ & 0xff00ff) + (i_3053_ & 0xff00ff));
									i_3053_ = ((i_3055_ & 0x1000100) + (i_3054_ - i_3055_ & 0x10000));
									is[i_3019_] = (i_3054_ - i_3053_ | i_3053_ - (i_3053_ >>> 8));
								}
							} else if (i == 0) {
								int i_3056_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3018_]);
								if (i_3056_ != 0) {
									int i_3057_ = ((i_3056_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3058_ = ((i_3056_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3059_ = ((i_3056_ & 0xff) * anInt9019 & 0xff00);
									i_3056_ = (i_3057_ | i_3058_ | i_3059_) >>> 8;
									int i_3060_ = is[i_3019_];
									int i_3061_ = i_3056_ + i_3060_;
									int i_3062_ = ((i_3056_ & 0xff00ff) + (i_3060_ & 0xff00ff));
									i_3060_ = ((i_3062_ & 0x1000100) + (i_3061_ - i_3062_ & 0x10000));
									is[i_3019_] = (i_3061_ - i_3060_ | i_3060_ - (i_3060_ >>> 8));
								}
							} else if (i == 3) {
								int i_3063_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3018_]);
								int i_3064_ = anInt9014;
								int i_3065_ = i_3063_ + i_3064_;
								int i_3066_ = ((i_3063_ & 0xff00ff) + (i_3064_ & 0xff00ff));
								int i_3067_ = ((i_3066_ & 0x1000100) + (i_3065_ - i_3066_ & 0x10000));
								i_3063_ = i_3065_ - i_3067_ | i_3067_ - (i_3067_ >>> 8);
								i_3067_ = is[i_3019_];
								i_3065_ = i_3063_ + i_3067_;
								i_3066_ = (i_3063_ & 0xff00ff) + (i_3067_ & 0xff00ff);
								i_3067_ = ((i_3066_ & 0x1000100) + (i_3065_ - i_3066_ & 0x10000));
								is[i_3019_] = i_3065_ - i_3067_ | i_3067_ - (i_3067_ >>> 8);
							} else if (i == 2) {
								int i_3068_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3018_]);
								if (i_3068_ != 0) {
									int i_3069_ = ((i_3068_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3070_ = ((i_3068_ & 0xff00) * anInt9015 & 0xff0000);
									i_3068_ = (((i_3069_ | i_3070_) >>> 8) + anInt9022);
									int i_3071_ = is[i_3019_];
									int i_3072_ = i_3068_ + i_3071_;
									int i_3073_ = ((i_3068_ & 0xff00ff) + (i_3071_ & 0xff00ff));
									i_3071_ = ((i_3073_ & 0x1000100) + (i_3072_ - i_3073_ & 0x10000));
									is[i_3019_] = (i_3072_ - i_3071_ | i_3071_ - (i_3071_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_3013_ += anInt9004;
						i_3014_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				for (int i_3074_ = anInt9001; i_3074_ < 0; i_3074_++) {
					int i_3075_ = anInt9003;
					int i_3076_ = anInt8988 + anInt9012;
					int i_3077_ = anInt9011 + anInt9013;
					int i_3078_ = anInt8999;
					if (i_3076_ < 0) {
						int i_3079_ = (anInt9004 - 1 - i_3076_) / anInt9004;
						i_3078_ += i_3079_;
						i_3076_ += anInt9004 * i_3079_;
						i_3077_ += anInt8991 * i_3079_;
						i_3075_ += i_3079_;
					}
					int i_3080_;
					if ((i_3080_ = (1 + i_3076_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3078_)
						i_3078_ = i_3080_;
					if (i_3077_ < 0) {
						i_3080_ = (anInt8991 - 1 - i_3077_) / anInt8991;
						i_3078_ += i_3080_;
						i_3076_ += anInt9004 * i_3080_;
						i_3077_ += anInt8991 * i_3080_;
						i_3075_ += i_3080_;
					}
					if ((i_3080_ = (1 + i_3077_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3078_)
						i_3078_ = i_3080_;
					for (/**/; i_3078_ < 0; i_3078_++) {
						int i_3081_ = (((i_3077_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_3076_ >> 12));
						int i_3082_ = i_3075_++;
						if (i_2575_ == 0) {
							if (i == 1)
								is[i_3082_] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3081_]);
							else if (i == 0) {
								int i_3083_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3081_++]);
								int i_3084_ = ((i_3083_ & 0xff0000) * anInt9009 & ~0xffffff);
								int i_3085_ = ((i_3083_ & 0xff00) * anInt9018 & 0xff0000);
								int i_3086_ = (i_3083_ & 0xff) * anInt9019 & 0xff00;
								is[i_3082_] = (i_3084_ | i_3085_ | i_3086_) >>> 8;
							} else if (i == 3) {
								int i_3087_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3081_++]);
								int i_3088_ = anInt9014;
								int i_3089_ = i_3087_ + i_3088_;
								int i_3090_ = ((i_3087_ & 0xff00ff) + (i_3088_ & 0xff00ff));
								int i_3091_ = ((i_3090_ & 0x1000100) + (i_3089_ - i_3090_ & 0x10000));
								is[i_3082_] = i_3089_ - i_3091_ | i_3091_ - (i_3091_ >>> 8);
							} else if (i == 2) {
								int i_3092_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3081_]);
								int i_3093_ = ((i_3092_ & 0xff00ff) * anInt9015 & ~0xff00ff);
								int i_3094_ = ((i_3092_ & 0xff00) * anInt9015 & 0xff0000);
								is[i_3082_] = ((i_3093_ | i_3094_) >>> 8) + anInt9022;
							} else
								throw new IllegalArgumentException();
						} else if (i_2575_ == 1) {
							if (i == 1) {
								int i_3095_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3081_]);
								if (i_3095_ != 0)
									is[i_3082_] = i_3095_;
							} else if (i == 0) {
								int i_3096_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3081_]);
								if (i_3096_ != 0) {
									if ((anInt9014 & 0xffffff) == 16777215) {
										int i_3097_ = anInt9014 >>> 24;
										int i_3098_ = 256 - i_3097_;
										int i_3099_ = is[i_3082_];
										is[i_3082_] = ((((i_3096_ & 0xff00ff) * i_3097_ + ((i_3099_ & 0xff00ff) * i_3098_)) & ~0xff00ff) + (((i_3096_ & 0xff00) * i_3097_ + ((i_3099_ & 0xff00) * i_3098_)) & 0xff0000)) >> 8;
									} else if (anInt9015 != 255) {
										int i_3100_ = ((i_3096_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3101_ = ((i_3096_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3102_ = ((i_3096_ & 0xff) * anInt9019 & 0xff00);
										i_3096_ = (i_3100_ | i_3101_ | i_3102_) >>> 8;
										int i_3103_ = is[i_3082_];
										is[i_3082_] = (((((i_3096_ & 0xff00ff) * anInt9015) + ((i_3103_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + ((((i_3096_ & 0xff00) * anInt9015) + ((i_3103_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
									} else {
										int i_3104_ = ((i_3096_ & 0xff0000) * anInt9009 & ~0xffffff);
										int i_3105_ = ((i_3096_ & 0xff00) * anInt9018 & 0xff0000);
										int i_3106_ = ((i_3096_ & 0xff) * anInt9019 & 0xff00);
										is[i_3082_] = (i_3104_ | i_3105_ | i_3106_) >>> 8;
									}
								}
							} else if (i == 3) {
								int i_3107_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3081_]);
								int i_3108_ = anInt9014;
								int i_3109_ = i_3107_ + i_3108_;
								int i_3110_ = ((i_3107_ & 0xff00ff) + (i_3108_ & 0xff00ff));
								int i_3111_ = ((i_3110_ & 0x1000100) + (i_3109_ - i_3110_ & 0x10000));
								i_3111_ = i_3109_ - i_3111_ | i_3111_ - (i_3111_ >>> 8);
								if (i_3107_ == 0 && anInt9015 != 255) {
									i_3107_ = i_3111_;
									i_3111_ = is[i_3082_];
									i_3111_ = ((((i_3107_ & 0xff00ff) * anInt9015 + ((i_3111_ & 0xff00ff) * anInt9016)) & ~0xff00ff) + (((i_3107_ & 0xff00) * anInt9015 + ((i_3111_ & 0xff00) * anInt9016)) & 0xff0000)) >> 8;
								}
								is[i_3082_] = i_3111_;
							} else if (i == 2) {
								int i_3112_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3081_]);
								if (i_3112_ != 0) {
									int i_3113_ = ((i_3112_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3114_ = ((i_3112_ & 0xff00) * anInt9015 & 0xff0000);
									is[i_3082_++] = ((i_3113_ | i_3114_) >>> 8) + anInt9022;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2575_ == 2) {
							if (i == 1) {
								int i_3115_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3081_]);
								if (i_3115_ != 0) {
									int i_3116_ = is[i_3082_];
									int i_3117_ = i_3115_ + i_3116_;
									int i_3118_ = ((i_3115_ & 0xff00ff) + (i_3116_ & 0xff00ff));
									i_3116_ = ((i_3118_ & 0x1000100) + (i_3117_ - i_3118_ & 0x10000));
									is[i_3082_] = (i_3117_ - i_3116_ | i_3116_ - (i_3116_ >>> 8));
								}
							} else if (i == 0) {
								int i_3119_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3081_]);
								if (i_3119_ != 0) {
									int i_3120_ = ((i_3119_ & 0xff0000) * anInt9009 & ~0xffffff);
									int i_3121_ = ((i_3119_ & 0xff00) * anInt9018 & 0xff0000);
									int i_3122_ = ((i_3119_ & 0xff) * anInt9019 & 0xff00);
									i_3119_ = (i_3120_ | i_3121_ | i_3122_) >>> 8;
									int i_3123_ = is[i_3082_];
									int i_3124_ = i_3119_ + i_3123_;
									int i_3125_ = ((i_3119_ & 0xff00ff) + (i_3123_ & 0xff00ff));
									i_3123_ = ((i_3125_ & 0x1000100) + (i_3124_ - i_3125_ & 0x10000));
									is[i_3082_] = (i_3124_ - i_3123_ | i_3123_ - (i_3123_ >>> 8));
								}
							} else if (i == 3) {
								int i_3126_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3081_]);
								int i_3127_ = anInt9014;
								int i_3128_ = i_3126_ + i_3127_;
								int i_3129_ = ((i_3126_ & 0xff00ff) + (i_3127_ & 0xff00ff));
								int i_3130_ = ((i_3129_ & 0x1000100) + (i_3128_ - i_3129_ & 0x10000));
								i_3126_ = i_3128_ - i_3130_ | i_3130_ - (i_3130_ >>> 8);
								i_3130_ = is[i_3082_];
								i_3128_ = i_3126_ + i_3130_;
								i_3129_ = (i_3126_ & 0xff00ff) + (i_3130_ & 0xff00ff);
								i_3130_ = ((i_3129_ & 0x1000100) + (i_3128_ - i_3129_ & 0x10000));
								is[i_3082_] = i_3128_ - i_3130_ | i_3130_ - (i_3130_ >>> 8);
							} else if (i == 2) {
								int i_3131_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3081_]);
								if (i_3131_ != 0) {
									int i_3132_ = ((i_3131_ & 0xff00ff) * anInt9015 & ~0xff00ff);
									int i_3133_ = ((i_3131_ & 0xff00) * anInt9015 & 0xff0000);
									i_3131_ = (((i_3132_ | i_3133_) >>> 8) + anInt9022);
									int i_3134_ = is[i_3082_];
									int i_3135_ = i_3131_ + i_3134_;
									int i_3136_ = ((i_3131_ & 0xff00ff) + (i_3134_ & 0xff00ff));
									i_3134_ = ((i_3136_ & 0x1000100) + (i_3135_ - i_3136_ & 0x10000));
									is[i_3082_] = (i_3135_ - i_3134_ | i_3134_ - (i_3134_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_3076_ += anInt9004;
						i_3077_ += anInt8991;
					}
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	void method683(int[] is, int[] is_3137_, int i, int i_3138_) {
		int[] is_3139_ = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is_3139_ != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_3140_ = anInt9001;
					while (i_3140_ < 0) {
						int i_3141_ = i_3140_ + i_3138_;
						if (i_3141_ >= 0) {
							if (i_3141_ >= is.length)
								break;
							int i_3142_ = anInt9003;
							int i_3143_ = anInt8988;
							int i_3144_ = anInt9011;
							int i_3145_ = anInt8999;
							if (i_3143_ >= 0 && i_3144_ >= 0 && (i_3143_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) < 0 && (i_3144_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) < 0) {
								int i_3146_ = is[i_3141_] - i;
								int i_3147_ = -is_3137_[i_3141_];
								int i_3148_ = i_3146_ - (i_3142_ - anInt9003);
								if (i_3148_ > 0) {
									i_3142_ += i_3148_;
									i_3145_ += i_3148_;
									i_3143_ += anInt9004 * i_3148_;
									i_3144_ += anInt8991 * i_3148_;
								} else
									i_3147_ -= i_3148_;
								if (i_3145_ < i_3147_)
									i_3145_ = i_3147_;
								for (/**/; i_3145_ < 0; i_3145_++) {
									int i_3149_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_3144_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_3143_ >> 12))]);
									if (i_3149_ != 0)
										is_3139_[i_3142_++] = i_3149_;
									else
										i_3142_++;
								}
							}
						}
						i_3140_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_3150_ = anInt9001;
					while (i_3150_ < 0) {
						int i_3151_ = i_3150_ + i_3138_;
						if (i_3151_ >= 0) {
							if (i_3151_ >= is.length)
								break;
							int i_3152_ = anInt9003;
							int i_3153_ = anInt8988;
							int i_3154_ = anInt9011 + anInt9013;
							int i_3155_ = anInt8999;
							if (i_3153_ >= 0 && (i_3153_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) < 0) {
								int i_3156_;
								if ((i_3156_ = (i_3154_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12))) >= 0) {
									i_3156_ = (anInt8991 - i_3156_) / anInt8991;
									i_3155_ += i_3156_;
									i_3154_ += anInt8991 * i_3156_;
									i_3152_ += i_3156_;
								}
								if ((i_3156_ = (i_3154_ - anInt8991) / anInt8991) > i_3155_)
									i_3155_ = i_3156_;
								int i_3157_ = is[i_3151_] - i;
								int i_3158_ = -is_3137_[i_3151_];
								int i_3159_ = i_3157_ - (i_3152_ - anInt9003);
								if (i_3159_ > 0) {
									i_3152_ += i_3159_;
									i_3155_ += i_3159_;
									i_3153_ += anInt9004 * i_3159_;
									i_3154_ += anInt8991 * i_3159_;
								} else
									i_3158_ -= i_3159_;
								if (i_3155_ < i_3158_)
									i_3155_ = i_3158_;
								for (/**/; i_3155_ < 0; i_3155_++) {
									int i_3160_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_3154_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_3153_ >> 12))]);
									if (i_3160_ != 0)
										is_3139_[i_3152_++] = i_3160_;
									else
										i_3152_++;
									i_3154_ += anInt8991;
								}
							}
						}
						i_3150_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_3161_ = anInt9001;
					while (i_3161_ < 0) {
						int i_3162_ = i_3161_ + i_3138_;
						if (i_3162_ >= 0) {
							if (i_3162_ >= is.length)
								break;
							int i_3163_ = anInt9003;
							int i_3164_ = anInt8988;
							int i_3165_ = anInt9011 + anInt9013;
							int i_3166_ = anInt8999;
							if (i_3164_ >= 0 && (i_3164_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) < 0) {
								if (i_3165_ < 0) {
									int i_3167_ = ((anInt8991 - 1 - i_3165_) / anInt8991);
									i_3166_ += i_3167_;
									i_3165_ += anInt8991 * i_3167_;
									i_3163_ += i_3167_;
								}
								int i_3168_;
								if ((i_3168_ = (1 + i_3165_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3166_)
									i_3166_ = i_3168_;
								int i_3169_ = is[i_3162_] - i;
								int i_3170_ = -is_3137_[i_3162_];
								int i_3171_ = i_3169_ - (i_3163_ - anInt9003);
								if (i_3171_ > 0) {
									i_3163_ += i_3171_;
									i_3166_ += i_3171_;
									i_3164_ += anInt9004 * i_3171_;
									i_3165_ += anInt8991 * i_3171_;
								} else
									i_3170_ -= i_3171_;
								if (i_3166_ < i_3170_)
									i_3166_ = i_3170_;
								for (/**/; i_3166_ < 0; i_3166_++) {
									int i_3172_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_3165_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_3164_ >> 12))]);
									if (i_3172_ != 0)
										is_3139_[i_3163_++] = i_3172_;
									else
										i_3163_++;
									i_3165_ += anInt8991;
								}
							}
						}
						i_3161_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_3173_ = anInt9001;
					while (i_3173_ < 0) {
						int i_3174_ = i_3173_ + i_3138_;
						if (i_3174_ >= 0) {
							if (i_3174_ >= is.length)
								break;
							int i_3175_ = anInt9003;
							int i_3176_ = anInt8988 + anInt9012;
							int i_3177_ = anInt9011;
							int i_3178_ = anInt8999;
							if (i_3177_ >= 0 && (i_3177_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) < 0) {
								int i_3179_;
								if ((i_3179_ = (i_3176_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12))) >= 0) {
									i_3179_ = (anInt9004 - i_3179_) / anInt9004;
									i_3178_ += i_3179_;
									i_3176_ += anInt9004 * i_3179_;
									i_3175_ += i_3179_;
								}
								if ((i_3179_ = (i_3176_ - anInt9004) / anInt9004) > i_3178_)
									i_3178_ = i_3179_;
								int i_3180_ = is[i_3174_] - i;
								int i_3181_ = -is_3137_[i_3174_];
								int i_3182_ = i_3180_ - (i_3175_ - anInt9003);
								if (i_3182_ > 0) {
									i_3175_ += i_3182_;
									i_3178_ += i_3182_;
									i_3176_ += anInt9004 * i_3182_;
									i_3177_ += anInt8991 * i_3182_;
								} else
									i_3181_ -= i_3182_;
								if (i_3178_ < i_3181_)
									i_3178_ = i_3181_;
								for (/**/; i_3178_ < 0; i_3178_++) {
									int i_3183_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_3177_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_3176_ >> 12))]);
									if (i_3183_ != 0)
										is_3139_[i_3175_++] = i_3183_;
									else
										i_3175_++;
									i_3176_ += anInt9004;
								}
							}
						}
						i_3173_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_3184_ = anInt9001;
					while (i_3184_ < 0) {
						int i_3185_ = i_3184_ + i_3138_;
						if (i_3185_ >= 0) {
							if (i_3185_ >= is.length)
								break;
							int i_3186_ = anInt9003;
							int i_3187_ = anInt8988 + anInt9012;
							int i_3188_ = anInt9011 + anInt9013;
							int i_3189_ = anInt8999;
							int i_3190_;
							if ((i_3190_ = (i_3187_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12))) >= 0) {
								i_3190_ = (anInt9004 - i_3190_) / anInt9004;
								i_3189_ += i_3190_;
								i_3187_ += anInt9004 * i_3190_;
								i_3188_ += anInt8991 * i_3190_;
								i_3186_ += i_3190_;
							}
							if ((i_3190_ = (i_3187_ - anInt9004) / anInt9004) > i_3189_)
								i_3189_ = i_3190_;
							if ((i_3190_ = (i_3188_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12))) >= 0) {
								i_3190_ = (anInt8991 - i_3190_) / anInt8991;
								i_3189_ += i_3190_;
								i_3187_ += anInt9004 * i_3190_;
								i_3188_ += anInt8991 * i_3190_;
								i_3186_ += i_3190_;
							}
							if ((i_3190_ = (i_3188_ - anInt8991) / anInt8991) > i_3189_)
								i_3189_ = i_3190_;
							int i_3191_ = is[i_3185_] - i;
							int i_3192_ = -is_3137_[i_3185_];
							int i_3193_ = i_3191_ - (i_3186_ - anInt9003);
							if (i_3193_ > 0) {
								i_3186_ += i_3193_;
								i_3189_ += i_3193_;
								i_3187_ += anInt9004 * i_3193_;
								i_3188_ += anInt8991 * i_3193_;
							} else
								i_3192_ -= i_3193_;
							if (i_3189_ < i_3192_)
								i_3189_ = i_3192_;
							for (/**/; i_3189_ < 0; i_3189_++) {
								int i_3194_ = (((Class57_Sub1_Sub2) this).anIntArray9966[((i_3188_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010 + (i_3187_ >> 12))]);
								if (i_3194_ != 0)
									is_3139_[i_3186_++] = i_3194_;
								else
									i_3186_++;
								i_3187_ += anInt9004;
								i_3188_ += anInt8991;
							}
						}
						i_3184_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_3195_ = anInt9001;
					while (i_3195_ < 0) {
						int i_3196_ = i_3195_ + i_3138_;
						if (i_3196_ >= 0) {
							if (i_3196_ >= is.length)
								break;
							int i_3197_ = anInt9003;
							int i_3198_ = anInt8988 + anInt9012;
							int i_3199_ = anInt9011 + anInt9013;
							int i_3200_ = anInt8999;
							int i_3201_;
							if ((i_3201_ = (i_3198_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12))) >= 0) {
								i_3201_ = (anInt9004 - i_3201_) / anInt9004;
								i_3200_ += i_3201_;
								i_3198_ += anInt9004 * i_3201_;
								i_3199_ += anInt8991 * i_3201_;
								i_3197_ += i_3201_;
							}
							if ((i_3201_ = (i_3198_ - anInt9004) / anInt9004) > i_3200_)
								i_3200_ = i_3201_;
							if (i_3199_ < 0) {
								i_3201_ = (anInt8991 - 1 - i_3199_) / anInt8991;
								i_3200_ += i_3201_;
								i_3198_ += anInt9004 * i_3201_;
								i_3199_ += anInt8991 * i_3201_;
								i_3197_ += i_3201_;
							}
							if ((i_3201_ = (1 + i_3199_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3200_)
								i_3200_ = i_3201_;
							int i_3202_ = is[i_3196_] - i;
							int i_3203_ = -is_3137_[i_3196_];
							int i_3204_ = i_3202_ - (i_3197_ - anInt9003);
							if (i_3204_ > 0) {
								i_3197_ += i_3204_;
								i_3200_ += i_3204_;
								i_3198_ += anInt9004 * i_3204_;
								i_3199_ += anInt8991 * i_3204_;
							} else
								i_3203_ -= i_3204_;
							if (i_3200_ < i_3203_)
								i_3200_ = i_3203_;
							for (/**/; i_3200_ < 0; i_3200_++) {
								int i_3205_ = (((Class57_Sub1_Sub2) this).anIntArray9966[((i_3199_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010 + (i_3198_ >> 12))]);
								if (i_3205_ != 0)
									is_3139_[i_3197_++] = i_3205_;
								else
									i_3197_++;
								i_3198_ += anInt9004;
								i_3199_ += anInt8991;
							}
						}
						i_3195_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_3206_ = anInt9001;
				while (i_3206_ < 0) {
					int i_3207_ = i_3206_ + i_3138_;
					if (i_3207_ >= 0) {
						if (i_3207_ >= is.length)
							break;
						int i_3208_ = anInt9003;
						int i_3209_ = anInt8988 + anInt9012;
						int i_3210_ = anInt9011;
						int i_3211_ = anInt8999;
						if (i_3210_ >= 0 && i_3210_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) < 0) {
							if (i_3209_ < 0) {
								int i_3212_ = (anInt9004 - 1 - i_3209_) / anInt9004;
								i_3211_ += i_3212_;
								i_3209_ += anInt9004 * i_3212_;
								i_3208_ += i_3212_;
							}
							int i_3213_;
							if ((i_3213_ = (1 + i_3209_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3211_)
								i_3211_ = i_3213_;
							int i_3214_ = is[i_3207_] - i;
							int i_3215_ = -is_3137_[i_3207_];
							int i_3216_ = i_3214_ - (i_3208_ - anInt9003);
							if (i_3216_ > 0) {
								i_3208_ += i_3216_;
								i_3211_ += i_3216_;
								i_3209_ += anInt9004 * i_3216_;
								i_3210_ += anInt8991 * i_3216_;
							} else
								i_3215_ -= i_3216_;
							if (i_3211_ < i_3215_)
								i_3211_ = i_3215_;
							for (/**/; i_3211_ < 0; i_3211_++) {
								int i_3217_ = (((Class57_Sub1_Sub2) this).anIntArray9966[((i_3210_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010 + (i_3209_ >> 12))]);
								if (i_3217_ != 0)
									is_3139_[i_3208_++] = i_3217_;
								else
									i_3208_++;
								i_3209_ += anInt9004;
							}
						}
					}
					i_3206_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				int i_3218_ = anInt9001;
				while (i_3218_ < 0) {
					int i_3219_ = i_3218_ + i_3138_;
					if (i_3219_ >= 0) {
						if (i_3219_ >= is.length)
							break;
						int i_3220_ = anInt9003;
						int i_3221_ = anInt8988 + anInt9012;
						int i_3222_ = anInt9011 + anInt9013;
						int i_3223_ = anInt8999;
						if (i_3221_ < 0) {
							int i_3224_ = (anInt9004 - 1 - i_3221_) / anInt9004;
							i_3223_ += i_3224_;
							i_3221_ += anInt9004 * i_3224_;
							i_3222_ += anInt8991 * i_3224_;
							i_3220_ += i_3224_;
						}
						int i_3225_;
						if ((i_3225_ = (1 + i_3221_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3223_)
							i_3223_ = i_3225_;
						if ((i_3225_ = i_3222_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) >= 0) {
							i_3225_ = (anInt8991 - i_3225_) / anInt8991;
							i_3223_ += i_3225_;
							i_3221_ += anInt9004 * i_3225_;
							i_3222_ += anInt8991 * i_3225_;
							i_3220_ += i_3225_;
						}
						if ((i_3225_ = (i_3222_ - anInt8991) / anInt8991) > i_3223_)
							i_3223_ = i_3225_;
						int i_3226_ = is[i_3219_] - i;
						int i_3227_ = -is_3137_[i_3219_];
						int i_3228_ = i_3226_ - (i_3220_ - anInt9003);
						if (i_3228_ > 0) {
							i_3220_ += i_3228_;
							i_3223_ += i_3228_;
							i_3221_ += anInt9004 * i_3228_;
							i_3222_ += anInt8991 * i_3228_;
						} else
							i_3227_ -= i_3228_;
						if (i_3223_ < i_3227_)
							i_3223_ = i_3227_;
						for (/**/; i_3223_ < 0; i_3223_++) {
							int i_3229_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_3222_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_3221_ >> 12))]);
							if (i_3229_ != 0)
								is_3139_[i_3220_++] = i_3229_;
							else
								i_3220_++;
							i_3221_ += anInt9004;
							i_3222_ += anInt8991;
						}
					}
					i_3218_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				int i_3230_ = anInt9001;
				while (i_3230_ < 0) {
					int i_3231_ = i_3230_ + i_3138_;
					if (i_3231_ >= 0) {
						if (i_3231_ >= is.length)
							break;
						int i_3232_ = anInt9003;
						int i_3233_ = anInt8988 + anInt9012;
						int i_3234_ = anInt9011 + anInt9013;
						int i_3235_ = anInt8999;
						if (i_3233_ < 0) {
							int i_3236_ = (anInt9004 - 1 - i_3233_) / anInt9004;
							i_3235_ += i_3236_;
							i_3233_ += anInt9004 * i_3236_;
							i_3234_ += anInt8991 * i_3236_;
							i_3232_ += i_3236_;
						}
						int i_3237_;
						if ((i_3237_ = (1 + i_3233_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3235_)
							i_3235_ = i_3237_;
						if (i_3234_ < 0) {
							i_3237_ = (anInt8991 - 1 - i_3234_) / anInt8991;
							i_3235_ += i_3237_;
							i_3233_ += anInt9004 * i_3237_;
							i_3234_ += anInt8991 * i_3237_;
							i_3232_ += i_3237_;
						}
						if ((i_3237_ = (1 + i_3234_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3235_)
							i_3235_ = i_3237_;
						int i_3238_ = is[i_3231_] - i;
						int i_3239_ = -is_3137_[i_3231_];
						int i_3240_ = i_3238_ - (i_3232_ - anInt9003);
						if (i_3240_ > 0) {
							i_3232_ += i_3240_;
							i_3235_ += i_3240_;
							i_3233_ += anInt9004 * i_3240_;
							i_3234_ += anInt8991 * i_3240_;
						} else
							i_3239_ -= i_3240_;
						if (i_3235_ < i_3239_)
							i_3235_ = i_3239_;
						for (/**/; i_3235_ < 0; i_3235_++) {
							int i_3241_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_3234_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_3233_ >> 12))]);
							if (i_3241_ != 0)
								is_3139_[i_3232_++] = i_3241_;
							else
								i_3232_++;
							i_3233_ += anInt9004;
							i_3234_ += anInt8991;
						}
					}
					i_3230_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	void method684(int[] is, int[] is_3242_, int i, int i_3243_) {
		int[] is_3244_ = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is_3244_ != null) {
			if (anInt9004 == 0) {
				if (anInt8991 == 0) {
					int i_3245_ = anInt9001;
					while (i_3245_ < 0) {
						int i_3246_ = i_3245_ + i_3243_;
						if (i_3246_ >= 0) {
							if (i_3246_ >= is.length)
								break;
							int i_3247_ = anInt9003;
							int i_3248_ = anInt8988;
							int i_3249_ = anInt9011;
							int i_3250_ = anInt8999;
							if (i_3248_ >= 0 && i_3249_ >= 0 && (i_3248_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) < 0 && (i_3249_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) < 0) {
								int i_3251_ = is[i_3246_] - i;
								int i_3252_ = -is_3242_[i_3246_];
								int i_3253_ = i_3251_ - (i_3247_ - anInt9003);
								if (i_3253_ > 0) {
									i_3247_ += i_3253_;
									i_3250_ += i_3253_;
									i_3248_ += anInt9004 * i_3253_;
									i_3249_ += anInt8991 * i_3253_;
								} else
									i_3252_ -= i_3253_;
								if (i_3250_ < i_3252_)
									i_3250_ = i_3252_;
								for (/**/; i_3250_ < 0; i_3250_++) {
									int i_3254_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_3249_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_3248_ >> 12))]);
									if (i_3254_ != 0)
										is_3244_[i_3247_++] = i_3254_;
									else
										i_3247_++;
								}
							}
						}
						i_3245_++;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_3255_ = anInt9001;
					while (i_3255_ < 0) {
						int i_3256_ = i_3255_ + i_3243_;
						if (i_3256_ >= 0) {
							if (i_3256_ >= is.length)
								break;
							int i_3257_ = anInt9003;
							int i_3258_ = anInt8988;
							int i_3259_ = anInt9011 + anInt9013;
							int i_3260_ = anInt8999;
							if (i_3258_ >= 0 && (i_3258_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) < 0) {
								int i_3261_;
								if ((i_3261_ = (i_3259_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12))) >= 0) {
									i_3261_ = (anInt8991 - i_3261_) / anInt8991;
									i_3260_ += i_3261_;
									i_3259_ += anInt8991 * i_3261_;
									i_3257_ += i_3261_;
								}
								if ((i_3261_ = (i_3259_ - anInt8991) / anInt8991) > i_3260_)
									i_3260_ = i_3261_;
								int i_3262_ = is[i_3256_] - i;
								int i_3263_ = -is_3242_[i_3256_];
								int i_3264_ = i_3262_ - (i_3257_ - anInt9003);
								if (i_3264_ > 0) {
									i_3257_ += i_3264_;
									i_3260_ += i_3264_;
									i_3258_ += anInt9004 * i_3264_;
									i_3259_ += anInt8991 * i_3264_;
								} else
									i_3263_ -= i_3264_;
								if (i_3260_ < i_3263_)
									i_3260_ = i_3263_;
								for (/**/; i_3260_ < 0; i_3260_++) {
									int i_3265_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_3259_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_3258_ >> 12))]);
									if (i_3265_ != 0)
										is_3244_[i_3257_++] = i_3265_;
									else
										i_3257_++;
									i_3259_ += anInt8991;
								}
							}
						}
						i_3255_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				} else {
					int i_3266_ = anInt9001;
					while (i_3266_ < 0) {
						int i_3267_ = i_3266_ + i_3243_;
						if (i_3267_ >= 0) {
							if (i_3267_ >= is.length)
								break;
							int i_3268_ = anInt9003;
							int i_3269_ = anInt8988;
							int i_3270_ = anInt9011 + anInt9013;
							int i_3271_ = anInt8999;
							if (i_3269_ >= 0 && (i_3269_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12)) < 0) {
								if (i_3270_ < 0) {
									int i_3272_ = ((anInt8991 - 1 - i_3270_) / anInt8991);
									i_3271_ += i_3272_;
									i_3270_ += anInt8991 * i_3272_;
									i_3268_ += i_3272_;
								}
								int i_3273_;
								if ((i_3273_ = (1 + i_3270_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3271_)
									i_3271_ = i_3273_;
								int i_3274_ = is[i_3267_] - i;
								int i_3275_ = -is_3242_[i_3267_];
								int i_3276_ = i_3274_ - (i_3268_ - anInt9003);
								if (i_3276_ > 0) {
									i_3268_ += i_3276_;
									i_3271_ += i_3276_;
									i_3269_ += anInt9004 * i_3276_;
									i_3270_ += anInt8991 * i_3276_;
								} else
									i_3275_ -= i_3276_;
								if (i_3271_ < i_3275_)
									i_3271_ = i_3275_;
								for (/**/; i_3271_ < 0; i_3271_++) {
									int i_3277_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_3270_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_3269_ >> 12))]);
									if (i_3277_ != 0)
										is_3244_[i_3268_++] = i_3277_;
									else
										i_3268_++;
									i_3270_ += anInt8991;
								}
							}
						}
						i_3266_++;
						anInt8988 += anInt9005;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt9004 < 0) {
				if (anInt8991 == 0) {
					int i_3278_ = anInt9001;
					while (i_3278_ < 0) {
						int i_3279_ = i_3278_ + i_3243_;
						if (i_3279_ >= 0) {
							if (i_3279_ >= is.length)
								break;
							int i_3280_ = anInt9003;
							int i_3281_ = anInt8988 + anInt9012;
							int i_3282_ = anInt9011;
							int i_3283_ = anInt8999;
							if (i_3282_ >= 0 && (i_3282_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) < 0) {
								int i_3284_;
								if ((i_3284_ = (i_3281_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12))) >= 0) {
									i_3284_ = (anInt9004 - i_3284_) / anInt9004;
									i_3283_ += i_3284_;
									i_3281_ += anInt9004 * i_3284_;
									i_3280_ += i_3284_;
								}
								if ((i_3284_ = (i_3281_ - anInt9004) / anInt9004) > i_3283_)
									i_3283_ = i_3284_;
								int i_3285_ = is[i_3279_] - i;
								int i_3286_ = -is_3242_[i_3279_];
								int i_3287_ = i_3285_ - (i_3280_ - anInt9003);
								if (i_3287_ > 0) {
									i_3280_ += i_3287_;
									i_3283_ += i_3287_;
									i_3281_ += anInt9004 * i_3287_;
									i_3282_ += anInt8991 * i_3287_;
								} else
									i_3286_ -= i_3287_;
								if (i_3283_ < i_3286_)
									i_3283_ = i_3286_;
								for (/**/; i_3283_ < 0; i_3283_++) {
									int i_3288_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_3282_ >> 12) * (((Class57_Sub1_Sub2) this).anInt9010)) + (i_3281_ >> 12))]);
									if (i_3288_ != 0)
										is_3244_[i_3280_++] = i_3288_;
									else
										i_3280_++;
									i_3281_ += anInt9004;
								}
							}
						}
						i_3278_++;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else if (anInt8991 < 0) {
					int i_3289_ = anInt9001;
					while (i_3289_ < 0) {
						int i_3290_ = i_3289_ + i_3243_;
						if (i_3290_ >= 0) {
							if (i_3290_ >= is.length)
								break;
							int i_3291_ = anInt9003;
							int i_3292_ = anInt8988 + anInt9012;
							int i_3293_ = anInt9011 + anInt9013;
							int i_3294_ = anInt8999;
							int i_3295_;
							if ((i_3295_ = (i_3292_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12))) >= 0) {
								i_3295_ = (anInt9004 - i_3295_) / anInt9004;
								i_3294_ += i_3295_;
								i_3292_ += anInt9004 * i_3295_;
								i_3293_ += anInt8991 * i_3295_;
								i_3291_ += i_3295_;
							}
							if ((i_3295_ = (i_3292_ - anInt9004) / anInt9004) > i_3294_)
								i_3294_ = i_3295_;
							if ((i_3295_ = (i_3293_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12))) >= 0) {
								i_3295_ = (anInt8991 - i_3295_) / anInt8991;
								i_3294_ += i_3295_;
								i_3292_ += anInt9004 * i_3295_;
								i_3293_ += anInt8991 * i_3295_;
								i_3291_ += i_3295_;
							}
							if ((i_3295_ = (i_3293_ - anInt8991) / anInt8991) > i_3294_)
								i_3294_ = i_3295_;
							int i_3296_ = is[i_3290_] - i;
							int i_3297_ = -is_3242_[i_3290_];
							int i_3298_ = i_3296_ - (i_3291_ - anInt9003);
							if (i_3298_ > 0) {
								i_3291_ += i_3298_;
								i_3294_ += i_3298_;
								i_3292_ += anInt9004 * i_3298_;
								i_3293_ += anInt8991 * i_3298_;
							} else
								i_3297_ -= i_3298_;
							if (i_3294_ < i_3297_)
								i_3294_ = i_3297_;
							for (/**/; i_3294_ < 0; i_3294_++) {
								int i_3299_ = (((Class57_Sub1_Sub2) this).anIntArray9966[((i_3293_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010 + (i_3292_ >> 12))]);
								if (i_3299_ != 0)
									is_3244_[i_3291_++] = i_3299_;
								else
									i_3291_++;
								i_3292_ += anInt9004;
								i_3293_ += anInt8991;
							}
						}
						i_3289_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				} else {
					int i_3300_ = anInt9001;
					while (i_3300_ < 0) {
						int i_3301_ = i_3300_ + i_3243_;
						if (i_3301_ >= 0) {
							if (i_3301_ >= is.length)
								break;
							int i_3302_ = anInt9003;
							int i_3303_ = anInt8988 + anInt9012;
							int i_3304_ = anInt9011 + anInt9013;
							int i_3305_ = anInt8999;
							int i_3306_;
							if ((i_3306_ = (i_3303_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12))) >= 0) {
								i_3306_ = (anInt9004 - i_3306_) / anInt9004;
								i_3305_ += i_3306_;
								i_3303_ += anInt9004 * i_3306_;
								i_3304_ += anInt8991 * i_3306_;
								i_3302_ += i_3306_;
							}
							if ((i_3306_ = (i_3303_ - anInt9004) / anInt9004) > i_3305_)
								i_3305_ = i_3306_;
							if (i_3304_ < 0) {
								i_3306_ = (anInt8991 - 1 - i_3304_) / anInt8991;
								i_3305_ += i_3306_;
								i_3303_ += anInt9004 * i_3306_;
								i_3304_ += anInt8991 * i_3306_;
								i_3302_ += i_3306_;
							}
							if ((i_3306_ = (1 + i_3304_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3305_)
								i_3305_ = i_3306_;
							int i_3307_ = is[i_3301_] - i;
							int i_3308_ = -is_3242_[i_3301_];
							int i_3309_ = i_3307_ - (i_3302_ - anInt9003);
							if (i_3309_ > 0) {
								i_3302_ += i_3309_;
								i_3305_ += i_3309_;
								i_3303_ += anInt9004 * i_3309_;
								i_3304_ += anInt8991 * i_3309_;
							} else
								i_3308_ -= i_3309_;
							if (i_3305_ < i_3308_)
								i_3305_ = i_3308_;
							for (/**/; i_3305_ < 0; i_3305_++) {
								int i_3310_ = (((Class57_Sub1_Sub2) this).anIntArray9966[((i_3304_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010 + (i_3303_ >> 12))]);
								if (i_3310_ != 0)
									is_3244_[i_3302_++] = i_3310_;
								else
									i_3302_++;
								i_3303_ += anInt9004;
								i_3304_ += anInt8991;
							}
						}
						i_3300_++;
						anInt8988 += anInt9005;
						anInt9011 += anInt9007;
						anInt9003 += anInt9020;
					}
				}
			} else if (anInt8991 == 0) {
				int i_3311_ = anInt9001;
				while (i_3311_ < 0) {
					int i_3312_ = i_3311_ + i_3243_;
					if (i_3312_ >= 0) {
						if (i_3312_ >= is.length)
							break;
						int i_3313_ = anInt9003;
						int i_3314_ = anInt8988 + anInt9012;
						int i_3315_ = anInt9011;
						int i_3316_ = anInt8999;
						if (i_3315_ >= 0 && i_3315_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) < 0) {
							if (i_3314_ < 0) {
								int i_3317_ = (anInt9004 - 1 - i_3314_) / anInt9004;
								i_3316_ += i_3317_;
								i_3314_ += anInt9004 * i_3317_;
								i_3313_ += i_3317_;
							}
							int i_3318_;
							if ((i_3318_ = (1 + i_3314_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3316_)
								i_3316_ = i_3318_;
							int i_3319_ = is[i_3312_] - i;
							int i_3320_ = -is_3242_[i_3312_];
							int i_3321_ = i_3319_ - (i_3313_ - anInt9003);
							if (i_3321_ > 0) {
								i_3313_ += i_3321_;
								i_3316_ += i_3321_;
								i_3314_ += anInt9004 * i_3321_;
								i_3315_ += anInt8991 * i_3321_;
							} else
								i_3320_ -= i_3321_;
							if (i_3316_ < i_3320_)
								i_3316_ = i_3320_;
							for (/**/; i_3316_ < 0; i_3316_++) {
								int i_3322_ = (((Class57_Sub1_Sub2) this).anIntArray9966[((i_3315_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010 + (i_3314_ >> 12))]);
								if (i_3322_ != 0)
									is_3244_[i_3313_++] = i_3322_;
								else
									i_3313_++;
								i_3314_ += anInt9004;
							}
						}
					}
					i_3311_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else if (anInt8991 < 0) {
				int i_3323_ = anInt9001;
				while (i_3323_ < 0) {
					int i_3324_ = i_3323_ + i_3243_;
					if (i_3324_ >= 0) {
						if (i_3324_ >= is.length)
							break;
						int i_3325_ = anInt9003;
						int i_3326_ = anInt8988 + anInt9012;
						int i_3327_ = anInt9011 + anInt9013;
						int i_3328_ = anInt8999;
						if (i_3326_ < 0) {
							int i_3329_ = (anInt9004 - 1 - i_3326_) / anInt9004;
							i_3328_ += i_3329_;
							i_3326_ += anInt9004 * i_3329_;
							i_3327_ += anInt8991 * i_3329_;
							i_3325_ += i_3329_;
						}
						int i_3330_;
						if ((i_3330_ = (1 + i_3326_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3328_)
							i_3328_ = i_3330_;
						if ((i_3330_ = i_3327_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12)) >= 0) {
							i_3330_ = (anInt8991 - i_3330_) / anInt8991;
							i_3328_ += i_3330_;
							i_3326_ += anInt9004 * i_3330_;
							i_3327_ += anInt8991 * i_3330_;
							i_3325_ += i_3330_;
						}
						if ((i_3330_ = (i_3327_ - anInt8991) / anInt8991) > i_3328_)
							i_3328_ = i_3330_;
						int i_3331_ = is[i_3324_] - i;
						int i_3332_ = -is_3242_[i_3324_];
						int i_3333_ = i_3331_ - (i_3325_ - anInt9003);
						if (i_3333_ > 0) {
							i_3325_ += i_3333_;
							i_3328_ += i_3333_;
							i_3326_ += anInt9004 * i_3333_;
							i_3327_ += anInt8991 * i_3333_;
						} else
							i_3332_ -= i_3333_;
						if (i_3328_ < i_3332_)
							i_3328_ = i_3332_;
						for (/**/; i_3328_ < 0; i_3328_++) {
							int i_3334_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_3327_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_3326_ >> 12))]);
							if (i_3334_ != 0)
								is_3244_[i_3325_++] = i_3334_;
							else
								i_3325_++;
							i_3326_ += anInt9004;
							i_3327_ += anInt8991;
						}
					}
					i_3323_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			} else {
				int i_3335_ = anInt9001;
				while (i_3335_ < 0) {
					int i_3336_ = i_3335_ + i_3243_;
					if (i_3336_ >= 0) {
						if (i_3336_ >= is.length)
							break;
						int i_3337_ = anInt9003;
						int i_3338_ = anInt8988 + anInt9012;
						int i_3339_ = anInt9011 + anInt9013;
						int i_3340_ = anInt8999;
						if (i_3338_ < 0) {
							int i_3341_ = (anInt9004 - 1 - i_3338_) / anInt9004;
							i_3340_ += i_3341_;
							i_3338_ += anInt9004 * i_3341_;
							i_3339_ += anInt8991 * i_3341_;
							i_3337_ += i_3341_;
						}
						int i_3342_;
						if ((i_3342_ = (1 + i_3338_ - (((Class57_Sub1_Sub2) this).anInt9010 << 12) - anInt9004) / anInt9004) > i_3340_)
							i_3340_ = i_3342_;
						if (i_3339_ < 0) {
							i_3342_ = (anInt8991 - 1 - i_3339_) / anInt8991;
							i_3340_ += i_3342_;
							i_3338_ += anInt9004 * i_3342_;
							i_3339_ += anInt8991 * i_3342_;
							i_3337_ += i_3342_;
						}
						if ((i_3342_ = (1 + i_3339_ - (((Class57_Sub1_Sub2) this).anInt8989 << 12) - anInt8991) / anInt8991) > i_3340_)
							i_3340_ = i_3342_;
						int i_3343_ = is[i_3336_] - i;
						int i_3344_ = -is_3242_[i_3336_];
						int i_3345_ = i_3343_ - (i_3337_ - anInt9003);
						if (i_3345_ > 0) {
							i_3337_ += i_3345_;
							i_3340_ += i_3345_;
							i_3338_ += anInt9004 * i_3345_;
							i_3339_ += anInt8991 * i_3345_;
						} else
							i_3344_ -= i_3345_;
						if (i_3340_ < i_3344_)
							i_3340_ = i_3344_;
						for (/**/; i_3340_ < 0; i_3340_++) {
							int i_3346_ = (((Class57_Sub1_Sub2) this).anIntArray9966[(((i_3339_ >> 12) * ((Class57_Sub1_Sub2) this).anInt9010) + (i_3338_ >> 12))]);
							if (i_3346_ != 0)
								is_3244_[i_3337_++] = i_3346_;
							else
								i_3337_++;
							i_3338_ += anInt9004;
							i_3339_ += anInt8991;
						}
					}
					i_3335_++;
					anInt8988 += anInt9005;
					anInt9011 += anInt9007;
					anInt9003 += anInt9020;
				}
			}
		}
	}

	public void method624(int i, int i_3347_, int i_3348_, int i_3349_, int i_3350_, int i_3351_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_3352_ = 0; i_3352_ < i_3349_; i_3352_++) {
			int i_3353_ = ((i_3347_ + i_3352_) * ((Class57_Sub1_Sub2) this).anInt9010 + i);
			int i_3354_ = (((i_3351_ + i_3352_) * (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883)) + i_3350_);
			for (int i_3355_ = 0; i_3355_ < i_3348_; i_3355_++)
				((Class57_Sub1_Sub2) this).anIntArray9966[i_3353_ + i_3355_] = is[i_3354_ + i_3355_];
		}
	}

	public void method665(int i, int i_3356_, int i_3357_, int i_3358_, int i_3359_, int i_3360_) {
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_3361_ = 0; i_3361_ < i_3358_; i_3361_++) {
			int i_3362_ = ((i_3356_ + i_3361_) * ((Class57_Sub1_Sub2) this).anInt9010 + i);
			int i_3363_ = (((i_3360_ + i_3361_) * (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883)) + i_3359_);
			for (int i_3364_ = 0; i_3364_ < i_3357_; i_3364_++)
				((Class57_Sub1_Sub2) this).anIntArray9966[i_3362_ + i_3364_] = is[i_3363_ + i_3364_];
		}
	}

	public void method648(int i, int i_3365_, int i_3366_, int i_3367_, int i_3368_) {
		if (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006.method5196())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anIntArray7967);
		if (is != null) {
			int i_3369_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7971 * 692106883);
			i += ((Class57_Sub1_Sub2) this).anInt8990;
			i_3365_ += ((Class57_Sub1_Sub2) this).anInt9000;
			int i_3370_ = i_3365_ * i_3369_ + i;
			int i_3371_ = 0;
			int i_3372_ = ((Class57_Sub1_Sub2) this).anInt8989;
			int i_3373_ = ((Class57_Sub1_Sub2) this).anInt9010;
			int i_3374_ = i_3369_ - i_3373_;
			int i_3375_ = 0;
			if (i_3365_ < (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805)) {
				int i_3376_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976) * -1278653805 - i_3365_);
				i_3372_ -= i_3376_;
				i_3365_ = (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7976 * -1278653805);
				i_3371_ += i_3376_ * i_3373_;
				i_3370_ += i_3376_ * i_3369_;
			}
			if (i_3365_ + i_3372_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7977 * 63686679))
				i_3372_ -= (i_3365_ + i_3372_ - (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7977) * 63686679);
			if (i < (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679)) {
				int i_3377_ = ((((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7974) * -912871679 - i);
				i_3373_ -= i_3377_;
				i = (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7974 * -912871679);
				i_3371_ += i_3377_;
				i_3370_ += i_3377_;
				i_3375_ += i_3377_;
				i_3374_ += i_3377_;
			}
			if (i + i_3373_ > (((Class_ra_Sub1) ((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006).anInt7991) * -1416794725) {
				int i_3378_ = (i + i_3373_ - (((Class_ra_Sub1) (((Class57_Sub1_Sub2) this).aClass_ra_Sub1_9006)).anInt7991) * -1416794725);
				i_3373_ -= i_3378_;
				i_3375_ += i_3378_;
				i_3374_ += i_3378_;
			}
			if (i_3373_ > 0 && i_3372_ > 0) {
				if (i_3368_ == 0) {
					if (i_3366_ == 1) {
						for (int i_3379_ = -i_3372_; i_3379_ < 0; i_3379_++) {
							int i_3380_ = i_3370_ + i_3373_ - 3;
							while (i_3370_ < i_3380_) {
								is[i_3370_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								is[i_3370_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								is[i_3370_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								is[i_3370_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
							}
							i_3380_ += 3;
							while (i_3370_ < i_3380_)
								is[i_3370_++] = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
							i_3370_ += i_3374_;
							i_3371_ += i_3375_;
						}
					} else if (i_3366_ == 0) {
						int i_3381_ = (i_3367_ & 0xff0000) >> 16;
						int i_3382_ = (i_3367_ & 0xff00) >> 8;
						int i_3383_ = i_3367_ & 0xff;
						for (int i_3384_ = -i_3372_; i_3384_ < 0; i_3384_++) {
							for (int i_3385_ = -i_3373_; i_3385_ < 0; i_3385_++) {
								int i_3386_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								int i_3387_ = ((i_3386_ & 0xff0000) * i_3381_ & ~0xffffff);
								int i_3388_ = (i_3386_ & 0xff00) * i_3382_ & 0xff0000;
								int i_3389_ = (i_3386_ & 0xff) * i_3383_ & 0xff00;
								is[i_3370_++] = (i_3387_ | i_3388_ | i_3389_) >>> 8;
							}
							i_3370_ += i_3374_;
							i_3371_ += i_3375_;
						}
					} else if (i_3366_ == 3) {
						for (int i_3390_ = -i_3372_; i_3390_ < 0; i_3390_++) {
							for (int i_3391_ = -i_3373_; i_3391_ < 0; i_3391_++) {
								int i_3392_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								int i_3393_ = i_3392_ + i_3367_;
								int i_3394_ = ((i_3392_ & 0xff00ff) + (i_3367_ & 0xff00ff));
								int i_3395_ = ((i_3394_ & 0x1000100) + (i_3393_ - i_3394_ & 0x10000));
								is[i_3370_++] = i_3393_ - i_3395_ | i_3395_ - (i_3395_ >>> 8);
							}
							i_3370_ += i_3374_;
							i_3371_ += i_3375_;
						}
					} else if (i_3366_ == 2) {
						int i_3396_ = i_3367_ >>> 24;
						int i_3397_ = 256 - i_3396_;
						int i_3398_ = (i_3367_ & 0xff00ff) * i_3397_ & ~0xff00ff;
						int i_3399_ = (i_3367_ & 0xff00) * i_3397_ & 0xff0000;
						i_3367_ = (i_3398_ | i_3399_) >>> 8;
						for (int i_3400_ = -i_3372_; i_3400_ < 0; i_3400_++) {
							for (int i_3401_ = -i_3373_; i_3401_ < 0; i_3401_++) {
								int i_3402_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								i_3398_ = ((i_3402_ & 0xff00ff) * i_3396_ & ~0xff00ff);
								i_3399_ = (i_3402_ & 0xff00) * i_3396_ & 0xff0000;
								is[i_3370_++] = ((i_3398_ | i_3399_) >>> 8) + i_3367_;
							}
							i_3370_ += i_3374_;
							i_3371_ += i_3375_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3368_ == 1) {
					if (i_3366_ == 1) {
						for (int i_3403_ = -i_3372_; i_3403_ < 0; i_3403_++) {
							int i_3404_ = i_3370_ + i_3373_ - 3;
							while (i_3370_ < i_3404_) {
								int i_3405_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								if (i_3405_ != 0)
									is[i_3370_++] = i_3405_;
								else
									i_3370_++;
								i_3405_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								if (i_3405_ != 0)
									is[i_3370_++] = i_3405_;
								else
									i_3370_++;
								i_3405_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								if (i_3405_ != 0)
									is[i_3370_++] = i_3405_;
								else
									i_3370_++;
								i_3405_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								if (i_3405_ != 0)
									is[i_3370_++] = i_3405_;
								else
									i_3370_++;
							}
							i_3404_ += 3;
							while (i_3370_ < i_3404_) {
								int i_3406_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								if (i_3406_ != 0)
									is[i_3370_++] = i_3406_;
								else
									i_3370_++;
							}
							i_3370_ += i_3374_;
							i_3371_ += i_3375_;
						}
					} else if (i_3366_ == 0) {
						if ((i_3367_ & 0xffffff) == 16777215) {
							int i_3407_ = i_3367_ >>> 24;
							int i_3408_ = 256 - i_3407_;
							for (int i_3409_ = -i_3372_; i_3409_ < 0; i_3409_++) {
								for (int i_3410_ = -i_3373_; i_3410_ < 0; i_3410_++) {
									int i_3411_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
									if (i_3411_ != 0) {
										int i_3412_ = is[i_3370_];
										is[i_3370_++] = ((((i_3411_ & 0xff00ff) * i_3407_ + ((i_3412_ & 0xff00ff) * i_3408_)) & ~0xff00ff) + (((i_3411_ & 0xff00) * i_3407_ + ((i_3412_ & 0xff00) * i_3408_)) & 0xff0000)) >> 8;
									} else
										i_3370_++;
								}
								i_3370_ += i_3374_;
								i_3371_ += i_3375_;
							}
						} else {
							int i_3413_ = (i_3367_ & 0xff0000) >> 16;
							int i_3414_ = (i_3367_ & 0xff00) >> 8;
							int i_3415_ = i_3367_ & 0xff;
							int i_3416_ = i_3367_ >>> 24;
							int i_3417_ = 256 - i_3416_;
							for (int i_3418_ = -i_3372_; i_3418_ < 0; i_3418_++) {
								for (int i_3419_ = -i_3373_; i_3419_ < 0; i_3419_++) {
									int i_3420_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
									if (i_3420_ != 0) {
										if (i_3416_ != 255) {
											int i_3421_ = (((i_3420_ & 0xff0000) * i_3413_) & ~0xffffff);
											int i_3422_ = ((i_3420_ & 0xff00) * i_3414_ & 0xff0000);
											int i_3423_ = ((i_3420_ & 0xff) * i_3415_ & 0xff00);
											i_3420_ = (i_3421_ | i_3422_ | i_3423_) >>> 8;
											int i_3424_ = is[i_3370_];
											is[i_3370_++] = (((((i_3420_ & 0xff00ff) * i_3416_) + ((i_3424_ & 0xff00ff) * i_3417_)) & ~0xff00ff) + ((((i_3420_ & 0xff00) * i_3416_) + ((i_3424_ & 0xff00) * i_3417_)) & 0xff0000)) >> 8;
										} else {
											int i_3425_ = (((i_3420_ & 0xff0000) * i_3413_) & ~0xffffff);
											int i_3426_ = ((i_3420_ & 0xff00) * i_3414_ & 0xff0000);
											int i_3427_ = ((i_3420_ & 0xff) * i_3415_ & 0xff00);
											is[i_3370_++] = (i_3425_ | i_3426_ | i_3427_) >>> 8;
										}
									} else
										i_3370_++;
								}
								i_3370_ += i_3374_;
								i_3371_ += i_3375_;
							}
						}
					} else if (i_3366_ == 3) {
						int i_3428_ = i_3367_ >>> 24;
						int i_3429_ = 256 - i_3428_;
						for (int i_3430_ = -i_3372_; i_3430_ < 0; i_3430_++) {
							for (int i_3431_ = -i_3373_; i_3431_ < 0; i_3431_++) {
								int i_3432_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								int i_3433_ = i_3432_ + i_3367_;
								int i_3434_ = ((i_3432_ & 0xff00ff) + (i_3367_ & 0xff00ff));
								int i_3435_ = ((i_3434_ & 0x1000100) + (i_3433_ - i_3434_ & 0x10000));
								i_3435_ = i_3433_ - i_3435_ | i_3435_ - (i_3435_ >>> 8);
								if (i_3432_ == 0 && i_3428_ != 255) {
									i_3432_ = i_3435_;
									i_3435_ = is[i_3370_];
									i_3435_ = ((((i_3432_ & 0xff00ff) * i_3428_ + (i_3435_ & 0xff00ff) * i_3429_) & ~0xff00ff) + (((i_3432_ & 0xff00) * i_3428_ + (i_3435_ & 0xff00) * i_3429_) & 0xff0000)) >> 8;
								}
								is[i_3370_++] = i_3435_;
							}
							i_3370_ += i_3374_;
							i_3371_ += i_3375_;
						}
					} else if (i_3366_ == 2) {
						int i_3436_ = i_3367_ >>> 24;
						int i_3437_ = 256 - i_3436_;
						int i_3438_ = (i_3367_ & 0xff00ff) * i_3437_ & ~0xff00ff;
						int i_3439_ = (i_3367_ & 0xff00) * i_3437_ & 0xff0000;
						i_3367_ = (i_3438_ | i_3439_) >>> 8;
						for (int i_3440_ = -i_3372_; i_3440_ < 0; i_3440_++) {
							for (int i_3441_ = -i_3373_; i_3441_ < 0; i_3441_++) {
								int i_3442_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								if (i_3442_ != 0) {
									i_3438_ = ((i_3442_ & 0xff00ff) * i_3436_ & ~0xff00ff);
									i_3439_ = ((i_3442_ & 0xff00) * i_3436_ & 0xff0000);
									is[i_3370_++] = ((i_3438_ | i_3439_) >>> 8) + i_3367_;
								} else
									i_3370_++;
							}
							i_3370_ += i_3374_;
							i_3371_ += i_3375_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3368_ == 2) {
					if (i_3366_ == 1) {
						for (int i_3443_ = -i_3372_; i_3443_ < 0; i_3443_++) {
							for (int i_3444_ = -i_3373_; i_3444_ < 0; i_3444_++) {
								int i_3445_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								if (i_3445_ != 0) {
									int i_3446_ = is[i_3370_];
									int i_3447_ = i_3445_ + i_3446_;
									int i_3448_ = ((i_3445_ & 0xff00ff) + (i_3446_ & 0xff00ff));
									i_3446_ = ((i_3448_ & 0x1000100) + (i_3447_ - i_3448_ & 0x10000));
									is[i_3370_++] = (i_3447_ - i_3446_ | i_3446_ - (i_3446_ >>> 8));
								} else
									i_3370_++;
							}
							i_3370_ += i_3374_;
							i_3371_ += i_3375_;
						}
					} else if (i_3366_ == 0) {
						int i_3449_ = (i_3367_ & 0xff0000) >> 16;
						int i_3450_ = (i_3367_ & 0xff00) >> 8;
						int i_3451_ = i_3367_ & 0xff;
						for (int i_3452_ = -i_3372_; i_3452_ < 0; i_3452_++) {
							for (int i_3453_ = -i_3373_; i_3453_ < 0; i_3453_++) {
								int i_3454_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								if (i_3454_ != 0) {
									int i_3455_ = ((i_3454_ & 0xff0000) * i_3449_ & ~0xffffff);
									int i_3456_ = ((i_3454_ & 0xff00) * i_3450_ & 0xff0000);
									int i_3457_ = (i_3454_ & 0xff) * i_3451_ & 0xff00;
									i_3454_ = (i_3455_ | i_3456_ | i_3457_) >>> 8;
									int i_3458_ = is[i_3370_];
									int i_3459_ = i_3454_ + i_3458_;
									int i_3460_ = ((i_3454_ & 0xff00ff) + (i_3458_ & 0xff00ff));
									i_3458_ = ((i_3460_ & 0x1000100) + (i_3459_ - i_3460_ & 0x10000));
									is[i_3370_++] = (i_3459_ - i_3458_ | i_3458_ - (i_3458_ >>> 8));
								} else
									i_3370_++;
							}
							i_3370_ += i_3374_;
							i_3371_ += i_3375_;
						}
					} else if (i_3366_ == 3) {
						for (int i_3461_ = -i_3372_; i_3461_ < 0; i_3461_++) {
							for (int i_3462_ = -i_3373_; i_3462_ < 0; i_3462_++) {
								int i_3463_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								int i_3464_ = i_3463_ + i_3367_;
								int i_3465_ = ((i_3463_ & 0xff00ff) + (i_3367_ & 0xff00ff));
								int i_3466_ = ((i_3465_ & 0x1000100) + (i_3464_ - i_3465_ & 0x10000));
								i_3463_ = i_3464_ - i_3466_ | i_3466_ - (i_3466_ >>> 8);
								i_3466_ = is[i_3370_];
								i_3464_ = i_3463_ + i_3466_;
								i_3465_ = (i_3463_ & 0xff00ff) + (i_3466_ & 0xff00ff);
								i_3466_ = ((i_3465_ & 0x1000100) + (i_3464_ - i_3465_ & 0x10000));
								is[i_3370_++] = i_3464_ - i_3466_ | i_3466_ - (i_3466_ >>> 8);
							}
							i_3370_ += i_3374_;
							i_3371_ += i_3375_;
						}
					} else if (i_3366_ == 2) {
						int i_3467_ = i_3367_ >>> 24;
						int i_3468_ = 256 - i_3467_;
						int i_3469_ = (i_3367_ & 0xff00ff) * i_3468_ & ~0xff00ff;
						int i_3470_ = (i_3367_ & 0xff00) * i_3468_ & 0xff0000;
						i_3367_ = (i_3469_ | i_3470_) >>> 8;
						for (int i_3471_ = -i_3372_; i_3471_ < 0; i_3471_++) {
							for (int i_3472_ = -i_3373_; i_3472_ < 0; i_3472_++) {
								int i_3473_ = (((Class57_Sub1_Sub2) this).anIntArray9966[i_3371_++]);
								if (i_3473_ != 0) {
									i_3469_ = ((i_3473_ & 0xff00ff) * i_3467_ & ~0xff00ff);
									i_3470_ = ((i_3473_ & 0xff00) * i_3467_ & 0xff0000);
									i_3473_ = (((i_3469_ | i_3470_) >>> 8) + i_3367_);
									int i_3474_ = is[i_3370_];
									int i_3475_ = i_3473_ + i_3474_;
									int i_3476_ = ((i_3473_ & 0xff00ff) + (i_3474_ & 0xff00ff));
									i_3474_ = ((i_3476_ & 0x1000100) + (i_3475_ - i_3476_ & 0x10000));
									is[i_3370_++] = (i_3475_ - i_3474_ | i_3474_ - (i_3474_ >>> 8));
								} else
									i_3370_++;
							}
							i_3370_ += i_3374_;
							i_3371_ += i_3375_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}
}
