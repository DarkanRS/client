/* Class160_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class160_Sub1_Sub3 extends Class160_Sub1 {
	int[] anIntArray10235;

	void method2775(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (i_1_ > 0 && i_2_ > 0) {
			int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
			if (is != null) {
				int i_7_ = 0;
				int i_8_ = 0;
				int i_9_ = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				int i_10_ = (((Class160_Sub1_Sub3) this).anInt8853 + ((Class160_Sub1_Sub3) this).anInt8851 + ((Class160_Sub1_Sub3) this).anInt8855);
				int i_11_ = (((Class160_Sub1_Sub3) this).anInt8854 + ((Class160_Sub1_Sub3) this).anInt8867 + ((Class160_Sub1_Sub3) this).anInt8856);
				int i_12_ = (i_10_ << 16) / i_1_;
				int i_13_ = (i_11_ << 16) / i_2_;
				if (((Class160_Sub1_Sub3) this).anInt8853 > 0) {
					int i_14_ = (((((Class160_Sub1_Sub3) this).anInt8853 << 16) + i_12_ - 1) / i_12_);
					i += i_14_;
					i_7_ += (i_14_ * i_12_ - (((Class160_Sub1_Sub3) this).anInt8853 << 16));
				}
				if (((Class160_Sub1_Sub3) this).anInt8854 > 0) {
					int i_15_ = (((((Class160_Sub1_Sub3) this).anInt8854 << 16) + i_13_ - 1) / i_13_);
					i_0_ += i_15_;
					i_8_ += (i_15_ * i_13_ - (((Class160_Sub1_Sub3) this).anInt8854 << 16));
				}
				if (((Class160_Sub1_Sub3) this).anInt8851 < i_10_)
					i_1_ = ((((Class160_Sub1_Sub3) this).anInt8851 << 16) - i_7_ + i_12_ - 1) / i_12_;
				if (((Class160_Sub1_Sub3) this).anInt8867 < i_11_)
					i_2_ = ((((Class160_Sub1_Sub3) this).anInt8867 << 16) - i_8_ + i_13_ - 1) / i_13_;
				int i_16_ = i + i_0_ * i_9_;
				int i_17_ = i_9_ - i_1_;
				if (i_0_ + i_2_ > (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8986 * 1383960921))
					i_2_ -= (i_0_ + i_2_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
				if (i_0_ < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
					int i_18_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_0_);
					i_2_ -= i_18_;
					i_16_ += i_18_ * i_9_;
					i_8_ += i_13_ * i_18_;
				}
				if (i + i_1_ > (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
					int i_19_ = (i + i_1_ - (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt9002) * -1710988237);
					i_1_ -= i_19_;
					i_17_ += i_19_;
				}
				if (i < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
					int i_20_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
					i_1_ -= i_20_;
					i_16_ += i_20_;
					i_7_ += i_12_ * i_20_;
					i_17_ += i_20_;
				}
				if (i_5_ == 0) {
					if (i_3_ == 1) {
						int i_21_ = i_7_;
						for (int i_22_ = -i_2_; i_22_ < 0; i_22_++) {
							int i_23_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_24_ = -i_1_; i_24_ < 0; i_24_++) {
								is[i_16_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_7_ >> 16) + i_23_]);
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_21_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 0) {
						int i_25_ = (i_4_ & 0xff0000) >> 16;
						int i_26_ = (i_4_ & 0xff00) >> 8;
						int i_27_ = i_4_ & 0xff;
						int i_28_ = i_7_;
						for (int i_29_ = -i_2_; i_29_ < 0; i_29_++) {
							int i_30_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_31_ = -i_1_; i_31_ < 0; i_31_++) {
								int i_32_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_7_ >> 16) + i_30_]);
								int i_33_ = (i_32_ & 0xff0000) * i_25_ & ~0xffffff;
								int i_34_ = (i_32_ & 0xff00) * i_26_ & 0xff0000;
								int i_35_ = (i_32_ & 0xff) * i_27_ & 0xff00;
								is[i_16_++] = (i_33_ | i_34_ | i_35_) >>> 8;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_28_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 3) {
						int i_36_ = i_7_;
						for (int i_37_ = -i_2_; i_37_ < 0; i_37_++) {
							int i_38_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_39_ = -i_1_; i_39_ < 0; i_39_++) {
								int i_40_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_7_ >> 16) + i_38_]);
								int i_41_ = i_40_ + i_4_;
								int i_42_ = (i_40_ & 0xff00ff) + (i_4_ & 0xff00ff);
								int i_43_ = ((i_42_ & 0x1000100) + (i_41_ - i_42_ & 0x10000));
								is[i_16_++] = i_41_ - i_43_ | i_43_ - (i_43_ >>> 8);
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_36_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 2) {
						int i_44_ = i_4_ >>> 24;
						int i_45_ = 256 - i_44_;
						int i_46_ = (i_4_ & 0xff00ff) * i_45_ & ~0xff00ff;
						int i_47_ = (i_4_ & 0xff00) * i_45_ & 0xff0000;
						i_4_ = (i_46_ | i_47_) >>> 8;
						int i_48_ = i_7_;
						for (int i_49_ = -i_2_; i_49_ < 0; i_49_++) {
							int i_50_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_51_ = -i_1_; i_51_ < 0; i_51_++) {
								int i_52_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_7_ >> 16) + i_50_]);
								i_46_ = (i_52_ & 0xff00ff) * i_44_ & ~0xff00ff;
								i_47_ = (i_52_ & 0xff00) * i_44_ & 0xff0000;
								is[i_16_++] = ((i_46_ | i_47_) >>> 8) + i_4_;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_48_;
							i_16_ += i_17_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_5_ == 1) {
					if (i_3_ == 1) {
						int i_53_ = i_7_;
						for (int i_54_ = -i_2_; i_54_ < 0; i_54_++) {
							int i_55_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_56_ = -i_1_; i_56_ < 0; i_56_++) {
								int i_57_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_7_ >> 16) + i_55_]);
								int i_58_ = i_57_ >>> 24;
								int i_59_ = 256 - i_58_;
								int i_60_ = is[i_16_];
								is[i_16_++] = (((((i_57_ & 0xff00ff) * i_58_ + (i_60_ & 0xff00ff) * i_59_) & ~0xff00ff) >> 8) + ((((i_57_ & ~0xff00ff) >>> 8) * i_58_ + (((i_60_ & ~0xff00ff) >>> 8) * i_59_)) & ~0xff00ff));
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_53_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 0) {
						int i_61_ = i_7_;
						if ((i_4_ & 0xffffff) == 16777215) {
							for (int i_62_ = -i_2_; i_62_ < 0; i_62_++) {
								int i_63_ = ((i_8_ >> 16) * (((Class160_Sub1_Sub3) this).anInt8851));
								for (int i_64_ = -i_1_; i_64_ < 0; i_64_++) {
									int i_65_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_7_ >> 16) + i_63_]);
									int i_66_ = (i_65_ >>> 24) * (i_4_ >>> 24) >> 8;
									int i_67_ = 256 - i_66_;
									int i_68_ = is[i_16_];
									is[i_16_++] = ((((i_65_ & 0xff00ff) * i_66_ + (i_68_ & 0xff00ff) * i_67_) & ~0xff00ff) + (((i_65_ & 0xff00) * i_66_ + (i_68_ & 0xff00) * i_67_) & 0xff0000)) >> 8;
									i_7_ += i_12_;
								}
								i_8_ += i_13_;
								i_7_ = i_61_;
								i_16_ += i_17_;
							}
						} else {
							int i_69_ = (i_4_ & 0xff0000) >> 16;
							int i_70_ = (i_4_ & 0xff00) >> 8;
							int i_71_ = i_4_ & 0xff;
							for (int i_72_ = -i_2_; i_72_ < 0; i_72_++) {
								int i_73_ = ((i_8_ >> 16) * (((Class160_Sub1_Sub3) this).anInt8851));
								for (int i_74_ = -i_1_; i_74_ < 0; i_74_++) {
									int i_75_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_7_ >> 16) + i_73_]);
									int i_76_ = (i_75_ >>> 24) * (i_4_ >>> 24) >> 8;
									int i_77_ = 256 - i_76_;
									if (i_76_ != 255) {
										int i_78_ = ((i_75_ & 0xff0000) * i_69_ & ~0xffffff);
										int i_79_ = ((i_75_ & 0xff00) * i_70_ & 0xff0000);
										int i_80_ = (i_75_ & 0xff) * i_71_ & 0xff00;
										i_75_ = (i_78_ | i_79_ | i_80_) >>> 8;
										int i_81_ = is[i_16_];
										is[i_16_++] = ((((i_75_ & 0xff00ff) * i_76_ + (i_81_ & 0xff00ff) * i_77_) & ~0xff00ff) + (((i_75_ & 0xff00) * i_76_ + (i_81_ & 0xff00) * i_77_) & 0xff0000)) >> 8;
									} else {
										int i_82_ = ((i_75_ & 0xff0000) * i_69_ & ~0xffffff);
										int i_83_ = ((i_75_ & 0xff00) * i_70_ & 0xff0000);
										int i_84_ = (i_75_ & 0xff) * i_71_ & 0xff00;
										is[i_16_++] = (i_82_ | i_83_ | i_84_) >>> 8;
									}
									i_7_ += i_12_;
								}
								i_8_ += i_13_;
								i_7_ = i_61_;
								i_16_ += i_17_;
							}
						}
					} else if (i_3_ == 3) {
						int i_85_ = i_7_;
						for (int i_86_ = -i_2_; i_86_ < 0; i_86_++) {
							int i_87_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_88_ = -i_1_; i_88_ < 0; i_88_++) {
								int i_89_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_7_ >> 16) + i_87_]);
								int i_90_ = i_89_ + i_4_;
								int i_91_ = (i_89_ & 0xff00ff) + (i_4_ & 0xff00ff);
								int i_92_ = ((i_91_ & 0x1000100) + (i_90_ - i_91_ & 0x10000));
								i_92_ = i_90_ - i_92_ | i_92_ - (i_92_ >>> 8);
								int i_93_ = (i_92_ >>> 24) * (i_4_ >>> 24) >> 8;
								int i_94_ = 256 - i_93_;
								if (i_93_ != 255) {
									i_89_ = i_92_;
									i_92_ = is[i_16_];
									i_92_ = ((((i_89_ & 0xff00ff) * i_93_ + (i_92_ & 0xff00ff) * i_94_) & ~0xff00ff) + (((i_89_ & 0xff00) * i_93_ + (i_92_ & 0xff00) * i_94_) & 0xff0000)) >> 8;
								}
								is[i_16_++] = i_92_;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_85_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 2) {
						int i_95_ = i_4_ >>> 24;
						int i_96_ = 256 - i_95_;
						int i_97_ = (i_4_ & 0xff00ff) * i_96_ & ~0xff00ff;
						int i_98_ = (i_4_ & 0xff00) * i_96_ & 0xff0000;
						i_4_ = (i_97_ | i_98_) >>> 8;
						int i_99_ = i_7_;
						for (int i_100_ = -i_2_; i_100_ < 0; i_100_++) {
							int i_101_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_102_ = -i_1_; i_102_ < 0; i_102_++) {
								int i_103_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_7_ >> 16) + i_101_]);
								int i_104_ = i_103_ >>> 24;
								int i_105_ = 256 - i_104_;
								i_97_ = (i_103_ & 0xff00ff) * i_95_ & ~0xff00ff;
								i_98_ = (i_103_ & 0xff00) * i_95_ & 0xff0000;
								i_103_ = ((i_97_ | i_98_) >>> 8) + i_4_;
								int i_106_ = is[i_16_];
								is[i_16_++] = ((((i_103_ & 0xff00ff) * i_104_ + (i_106_ & 0xff00ff) * i_105_) & ~0xff00ff) + (((i_103_ & 0xff00) * i_104_ + (i_106_ & 0xff00) * i_105_) & 0xff0000)) >> 8;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_99_;
							i_16_ += i_17_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_5_ == 2) {
					if (i_3_ == 1) {
						int i_107_ = i_7_;
						for (int i_108_ = -i_2_; i_108_ < 0; i_108_++) {
							int i_109_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_110_ = -i_1_; i_110_ < 0; i_110_++) {
								int i_111_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_7_ >> 16) + i_109_]);
								if (i_111_ != 0) {
									int i_112_ = is[i_16_];
									int i_113_ = i_111_ + i_112_;
									int i_114_ = ((i_111_ & 0xff00ff) + (i_112_ & 0xff00ff));
									i_112_ = ((i_114_ & 0x1000100) + (i_113_ - i_114_ & 0x10000));
									is[i_16_++] = i_113_ - i_112_ | i_112_ - (i_112_ >>> 8);
								} else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_107_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 0) {
						int i_115_ = i_7_;
						int i_116_ = (i_4_ & 0xff0000) >> 16;
						int i_117_ = (i_4_ & 0xff00) >> 8;
						int i_118_ = i_4_ & 0xff;
						for (int i_119_ = -i_2_; i_119_ < 0; i_119_++) {
							int i_120_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_121_ = -i_1_; i_121_ < 0; i_121_++) {
								int i_122_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_7_ >> 16) + i_120_]);
								if (i_122_ != 0) {
									int i_123_ = ((i_122_ & 0xff0000) * i_116_ & ~0xffffff);
									int i_124_ = ((i_122_ & 0xff00) * i_117_ & 0xff0000);
									int i_125_ = (i_122_ & 0xff) * i_118_ & 0xff00;
									i_122_ = (i_123_ | i_124_ | i_125_) >>> 8;
									int i_126_ = is[i_16_];
									int i_127_ = i_122_ + i_126_;
									int i_128_ = ((i_122_ & 0xff00ff) + (i_126_ & 0xff00ff));
									i_126_ = ((i_128_ & 0x1000100) + (i_127_ - i_128_ & 0x10000));
									is[i_16_++] = i_127_ - i_126_ | i_126_ - (i_126_ >>> 8);
								} else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_115_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 3) {
						int i_129_ = i_7_;
						for (int i_130_ = -i_2_; i_130_ < 0; i_130_++) {
							int i_131_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_132_ = -i_1_; i_132_ < 0; i_132_++) {
								int i_133_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_7_ >> 16) + i_131_]);
								int i_134_ = i_133_ + i_4_;
								int i_135_ = (i_133_ & 0xff00ff) + (i_4_ & 0xff00ff);
								int i_136_ = ((i_135_ & 0x1000100) + (i_134_ - i_135_ & 0x10000));
								i_133_ = i_134_ - i_136_ | i_136_ - (i_136_ >>> 8);
								i_136_ = is[i_16_];
								i_134_ = i_133_ + i_136_;
								i_135_ = (i_133_ & 0xff00ff) + (i_136_ & 0xff00ff);
								i_136_ = (i_135_ & 0x1000100) + (i_134_ - i_135_ & 0x10000);
								is[i_16_++] = i_134_ - i_136_ | i_136_ - (i_136_ >>> 8);
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_129_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 2) {
						int i_137_ = i_4_ >>> 24;
						int i_138_ = 256 - i_137_;
						int i_139_ = (i_4_ & 0xff00ff) * i_138_ & ~0xff00ff;
						int i_140_ = (i_4_ & 0xff00) * i_138_ & 0xff0000;
						i_4_ = (i_139_ | i_140_) >>> 8;
						int i_141_ = i_7_;
						for (int i_142_ = -i_2_; i_142_ < 0; i_142_++) {
							int i_143_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_144_ = -i_1_; i_144_ < 0; i_144_++) {
								int i_145_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_7_ >> 16) + i_143_]);
								if (i_145_ != 0) {
									i_139_ = ((i_145_ & 0xff00ff) * i_137_ & ~0xff00ff);
									i_140_ = ((i_145_ & 0xff00) * i_137_ & 0xff0000);
									i_145_ = ((i_139_ | i_140_) >>> 8) + i_4_;
									int i_146_ = is[i_16_];
									int i_147_ = i_145_ + i_146_;
									int i_148_ = ((i_145_ & 0xff00ff) + (i_146_ & 0xff00ff));
									i_146_ = ((i_148_ & 0x1000100) + (i_147_ - i_148_ & 0x10000));
									is[i_16_++] = i_147_ - i_146_ | i_146_ - (i_146_ >>> 8);
								} else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_141_;
							i_16_ += i_17_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	Class160_Sub1_Sub3(Class505_Sub3 class505_sub3, int[] is, int i, int i_149_, int i_150_, int i_151_, boolean bool) {
		super(class505_sub3, i_150_, i_151_);
		if (bool)
			((Class160_Sub1_Sub3) this).anIntArray10235 = new int[i_150_ * i_151_];
		else
			((Class160_Sub1_Sub3) this).anIntArray10235 = is;
		i_149_ -= ((Class160_Sub1_Sub3) this).anInt8851;
		int i_152_ = 0;
		for (int i_153_ = 0; i_153_ < i_151_; i_153_++) {
			for (int i_154_ = 0; i_154_ < i_150_; i_154_++)
				((Class160_Sub1_Sub3) this).anIntArray10235[i_152_++] = is[i++];
			i += i_149_;
		}
	}

	Class160_Sub1_Sub3(Class505_Sub3 class505_sub3, int[] is, int i, int i_155_) {
		super(class505_sub3, i, i_155_);
		((Class160_Sub1_Sub3) this).anIntArray10235 = is;
	}

	public void method2778(int i, int i_156_, int i_157_, int i_158_, int i_159_) {
		if (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			int i_160_ = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			i += ((Class160_Sub1_Sub3) this).anInt8853;
			i_156_ += ((Class160_Sub1_Sub3) this).anInt8854;
			int i_161_ = i_156_ * i_160_ + i;
			int i_162_ = 0;
			int i_163_ = ((Class160_Sub1_Sub3) this).anInt8867;
			int i_164_ = ((Class160_Sub1_Sub3) this).anInt8851;
			int i_165_ = i_160_ - i_164_;
			int i_166_ = 0;
			if (i_156_ < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_167_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_156_);
				i_163_ -= i_167_;
				i_156_ = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_162_ += i_167_ * i_164_;
				i_161_ += i_167_ * i_160_;
			}
			if (i_156_ + i_163_ > (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_163_ -= (i_156_ + i_163_ - (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt8986) * 1383960921);
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_168_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_164_ -= i_168_;
				i = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_162_ += i_168_;
				i_161_ += i_168_;
				i_166_ += i_168_;
				i_165_ += i_168_;
			}
			if (i + i_164_ > (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt9002) * -1710988237) {
				int i_169_ = (i + i_164_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_164_ -= i_169_;
				i_166_ += i_169_;
				i_165_ += i_169_;
			}
			if (i_164_ > 0 && i_163_ > 0) {
				if (i_159_ == 0) {
					if (i_157_ == 1) {
						for (int i_170_ = -i_163_; i_170_ < 0; i_170_++) {
							int i_171_ = i_161_ + i_164_ - 3;
							while (i_161_ < i_171_) {
								is[i_161_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
								is[i_161_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
								is[i_161_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
								is[i_161_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
							}
							i_171_ += 3;
							while (i_161_ < i_171_)
								is[i_161_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 0) {
						int i_172_ = (i_158_ & 0xff0000) >> 16;
						int i_173_ = (i_158_ & 0xff00) >> 8;
						int i_174_ = i_158_ & 0xff;
						for (int i_175_ = -i_163_; i_175_ < 0; i_175_++) {
							for (int i_176_ = -i_164_; i_176_ < 0; i_176_++) {
								int i_177_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
								int i_178_ = (i_177_ & 0xff0000) * i_172_ & ~0xffffff;
								int i_179_ = (i_177_ & 0xff00) * i_173_ & 0xff0000;
								int i_180_ = (i_177_ & 0xff) * i_174_ & 0xff00;
								is[i_161_++] = (i_178_ | i_179_ | i_180_) >>> 8;
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 3) {
						for (int i_181_ = -i_163_; i_181_ < 0; i_181_++) {
							for (int i_182_ = -i_164_; i_182_ < 0; i_182_++) {
								int i_183_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
								int i_184_ = i_183_ + i_158_;
								int i_185_ = ((i_183_ & 0xff00ff) + (i_158_ & 0xff00ff));
								int i_186_ = ((i_185_ & 0x1000100) + (i_184_ - i_185_ & 0x10000));
								is[i_161_++] = i_184_ - i_186_ | i_186_ - (i_186_ >>> 8);
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 2) {
						int i_187_ = i_158_ >>> 24;
						int i_188_ = 256 - i_187_;
						int i_189_ = (i_158_ & 0xff00ff) * i_188_ & ~0xff00ff;
						int i_190_ = (i_158_ & 0xff00) * i_188_ & 0xff0000;
						i_158_ = (i_189_ | i_190_) >>> 8;
						for (int i_191_ = -i_163_; i_191_ < 0; i_191_++) {
							for (int i_192_ = -i_164_; i_192_ < 0; i_192_++) {
								int i_193_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
								i_189_ = (i_193_ & 0xff00ff) * i_187_ & ~0xff00ff;
								i_190_ = (i_193_ & 0xff00) * i_187_ & 0xff0000;
								is[i_161_++] = ((i_189_ | i_190_) >>> 8) + i_158_;
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_159_ == 1) {
					if (i_157_ == 1) {
						for (int i_194_ = -i_163_; i_194_ < 0; i_194_++) {
							for (int i_195_ = -i_164_; i_195_ < 0; i_195_++) {
								int i_196_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
								int i_197_ = i_196_ >>> 24;
								int i_198_ = 256 - i_197_;
								int i_199_ = is[i_161_];
								is[i_161_++] = (((((i_196_ & 0xff00ff) * i_197_ + (i_199_ & 0xff00ff) * i_198_) & ~0xff00ff) >> 8) + (((((i_196_ & ~0xff00ff) >>> 8) * i_197_) + (((i_199_ & ~0xff00ff) >>> 8) * i_198_)) & ~0xff00ff));
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 0) {
						if ((i_158_ & 0xffffff) == 16777215) {
							for (int i_200_ = -i_163_; i_200_ < 0; i_200_++) {
								for (int i_201_ = -i_164_; i_201_ < 0; i_201_++) {
									int i_202_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
									int i_203_ = ((i_202_ >>> 24) * (i_158_ >>> 24) >> 8);
									int i_204_ = 256 - i_203_;
									int i_205_ = is[i_161_];
									is[i_161_++] = ((((i_202_ & 0xff00ff) * i_203_ + (i_205_ & 0xff00ff) * i_204_) & ~0xff00ff) + (((i_202_ & 0xff00) * i_203_ + (i_205_ & 0xff00) * i_204_) & 0xff0000)) >> 8;
								}
								i_161_ += i_165_;
								i_162_ += i_166_;
							}
						} else {
							int i_206_ = (i_158_ & 0xff0000) >> 16;
							int i_207_ = (i_158_ & 0xff00) >> 8;
							int i_208_ = i_158_ & 0xff;
							for (int i_209_ = -i_163_; i_209_ < 0; i_209_++) {
								for (int i_210_ = -i_164_; i_210_ < 0; i_210_++) {
									int i_211_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
									int i_212_ = ((i_211_ >>> 24) * (i_158_ >>> 24) >> 8);
									int i_213_ = 256 - i_212_;
									if (i_212_ != 255) {
										int i_214_ = ((i_211_ & 0xff0000) * i_206_ & ~0xffffff);
										int i_215_ = ((i_211_ & 0xff00) * i_207_ & 0xff0000);
										int i_216_ = ((i_211_ & 0xff) * i_208_ & 0xff00);
										i_211_ = (i_214_ | i_215_ | i_216_) >>> 8;
										int i_217_ = is[i_161_];
										is[i_161_++] = ((((i_211_ & 0xff00ff) * i_212_ + ((i_217_ & 0xff00ff) * i_213_)) & ~0xff00ff) + (((i_211_ & 0xff00) * i_212_ + ((i_217_ & 0xff00) * i_213_)) & 0xff0000)) >> 8;
									} else {
										int i_218_ = ((i_211_ & 0xff0000) * i_206_ & ~0xffffff);
										int i_219_ = ((i_211_ & 0xff00) * i_207_ & 0xff0000);
										int i_220_ = ((i_211_ & 0xff) * i_208_ & 0xff00);
										is[i_161_++] = (i_218_ | i_219_ | i_220_) >>> 8;
									}
								}
								i_161_ += i_165_;
								i_162_ += i_166_;
							}
						}
					} else if (i_157_ == 3) {
						for (int i_221_ = -i_163_; i_221_ < 0; i_221_++) {
							for (int i_222_ = -i_164_; i_222_ < 0; i_222_++) {
								int i_223_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
								int i_224_ = i_223_ + i_158_;
								int i_225_ = ((i_223_ & 0xff00ff) + (i_158_ & 0xff00ff));
								int i_226_ = ((i_225_ & 0x1000100) + (i_224_ - i_225_ & 0x10000));
								i_226_ = i_224_ - i_226_ | i_226_ - (i_226_ >>> 8);
								int i_227_ = (i_226_ >>> 24) * (i_158_ >>> 24) >> 8;
								int i_228_ = 256 - i_227_;
								if (i_227_ != 255) {
									i_223_ = i_226_;
									i_226_ = is[i_161_];
									i_226_ = ((((i_223_ & 0xff00ff) * i_227_ + (i_226_ & 0xff00ff) * i_228_) & ~0xff00ff) + (((i_223_ & 0xff00) * i_227_ + (i_226_ & 0xff00) * i_228_) & 0xff0000)) >> 8;
								}
								is[i_161_++] = i_226_;
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 2) {
						int i_229_ = i_158_ >>> 24;
						int i_230_ = 256 - i_229_;
						int i_231_ = (i_158_ & 0xff00ff) * i_230_ & ~0xff00ff;
						int i_232_ = (i_158_ & 0xff00) * i_230_ & 0xff0000;
						i_158_ = (i_231_ | i_232_) >>> 8;
						for (int i_233_ = -i_163_; i_233_ < 0; i_233_++) {
							for (int i_234_ = -i_164_; i_234_ < 0; i_234_++) {
								int i_235_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
								int i_236_ = i_235_ >>> 24;
								int i_237_ = 256 - i_236_;
								i_231_ = (i_235_ & 0xff00ff) * i_229_ & ~0xff00ff;
								i_232_ = (i_235_ & 0xff00) * i_229_ & 0xff0000;
								i_235_ = ((i_231_ | i_232_) >>> 8) + i_158_;
								int i_238_ = is[i_161_];
								is[i_161_++] = ((((i_235_ & 0xff00ff) * i_236_ + (i_238_ & 0xff00ff) * i_237_) & ~0xff00ff) + (((i_235_ & 0xff00) * i_236_ + (i_238_ & 0xff00) * i_237_) & 0xff0000)) >> 8;
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_159_ == 2) {
					if (i_157_ == 1) {
						for (int i_239_ = -i_163_; i_239_ < 0; i_239_++) {
							for (int i_240_ = -i_164_; i_240_ < 0; i_240_++) {
								int i_241_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
								if (i_241_ != 0) {
									int i_242_ = is[i_161_];
									int i_243_ = i_241_ + i_242_;
									int i_244_ = ((i_241_ & 0xff00ff) + (i_242_ & 0xff00ff));
									i_242_ = ((i_244_ & 0x1000100) + (i_243_ - i_244_ & 0x10000));
									is[i_161_++] = i_243_ - i_242_ | i_242_ - (i_242_ >>> 8);
								} else
									i_161_++;
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 0) {
						int i_245_ = (i_158_ & 0xff0000) >> 16;
						int i_246_ = (i_158_ & 0xff00) >> 8;
						int i_247_ = i_158_ & 0xff;
						for (int i_248_ = -i_163_; i_248_ < 0; i_248_++) {
							for (int i_249_ = -i_164_; i_249_ < 0; i_249_++) {
								int i_250_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
								if (i_250_ != 0) {
									int i_251_ = ((i_250_ & 0xff0000) * i_245_ & ~0xffffff);
									int i_252_ = ((i_250_ & 0xff00) * i_246_ & 0xff0000);
									int i_253_ = (i_250_ & 0xff) * i_247_ & 0xff00;
									i_250_ = (i_251_ | i_252_ | i_253_) >>> 8;
									int i_254_ = is[i_161_];
									int i_255_ = i_250_ + i_254_;
									int i_256_ = ((i_250_ & 0xff00ff) + (i_254_ & 0xff00ff));
									i_254_ = ((i_256_ & 0x1000100) + (i_255_ - i_256_ & 0x10000));
									is[i_161_++] = i_255_ - i_254_ | i_254_ - (i_254_ >>> 8);
								} else
									i_161_++;
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 3) {
						for (int i_257_ = -i_163_; i_257_ < 0; i_257_++) {
							for (int i_258_ = -i_164_; i_258_ < 0; i_258_++) {
								int i_259_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
								int i_260_ = i_259_ + i_158_;
								int i_261_ = ((i_259_ & 0xff00ff) + (i_158_ & 0xff00ff));
								int i_262_ = ((i_261_ & 0x1000100) + (i_260_ - i_261_ & 0x10000));
								i_259_ = i_260_ - i_262_ | i_262_ - (i_262_ >>> 8);
								i_262_ = is[i_161_];
								i_260_ = i_259_ + i_262_;
								i_261_ = (i_259_ & 0xff00ff) + (i_262_ & 0xff00ff);
								i_262_ = (i_261_ & 0x1000100) + (i_260_ - i_261_ & 0x10000);
								is[i_161_++] = i_260_ - i_262_ | i_262_ - (i_262_ >>> 8);
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 2) {
						int i_263_ = i_158_ >>> 24;
						int i_264_ = 256 - i_263_;
						int i_265_ = (i_158_ & 0xff00ff) * i_264_ & ~0xff00ff;
						int i_266_ = (i_158_ & 0xff00) * i_264_ & 0xff0000;
						i_158_ = (i_265_ | i_266_) >>> 8;
						for (int i_267_ = -i_163_; i_267_ < 0; i_267_++) {
							for (int i_268_ = -i_164_; i_268_ < 0; i_268_++) {
								int i_269_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_162_++]);
								if (i_269_ != 0) {
									i_265_ = ((i_269_ & 0xff00ff) * i_263_ & ~0xff00ff);
									i_266_ = ((i_269_ & 0xff00) * i_263_ & 0xff0000);
									i_269_ = ((i_265_ | i_266_) >>> 8) + i_158_;
									int i_270_ = is[i_161_];
									int i_271_ = i_269_ + i_270_;
									int i_272_ = ((i_269_ & 0xff00ff) + (i_270_ & 0xff00ff));
									i_270_ = ((i_272_ & 0x1000100) + (i_271_ - i_272_ & 0x10000));
									is[i_161_++] = i_271_ - i_270_ | i_270_ - (i_270_ >>> 8);
								} else
									i_161_++;
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2774(int i, int i_273_, Class455 class455, int i_274_, int i_275_) {
		if (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			i += ((Class160_Sub1_Sub3) this).anInt8853;
			i_273_ += ((Class160_Sub1_Sub3) this).anInt8854;
			int i_276_ = 0;
			int i_277_ = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			int i_278_ = ((Class160_Sub1_Sub3) this).anInt8851;
			int i_279_ = ((Class160_Sub1_Sub3) this).anInt8867;
			int i_280_ = i_277_ - i_278_;
			int i_281_ = 0;
			int i_282_ = i + i_273_ * i_277_;
			if (i_273_ < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_283_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_273_);
				i_279_ -= i_283_;
				i_273_ = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_276_ += i_283_ * i_278_;
				i_282_ += i_283_ * i_277_;
			}
			if (i_273_ + i_279_ > (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_279_ -= (i_273_ + i_279_ - (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt8986) * 1383960921);
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_284_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_278_ -= i_284_;
				i = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_276_ += i_284_;
				i_282_ += i_284_;
				i_281_ += i_284_;
				i_280_ += i_284_;
			}
			if (i + i_278_ > (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt9002) * -1710988237) {
				int i_285_ = (i + i_278_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_278_ -= i_285_;
				i_281_ += i_285_;
				i_280_ += i_285_;
			}
			if (i_278_ > 0 && i_279_ > 0) {
				PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
				int[] is_286_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
				int[] is_287_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
				int i_288_ = i_273_;
				if (i_275_ > i_288_) {
					i_288_ = i_275_;
					i_282_ += (i_275_ - i_273_) * i_277_;
					i_276_ += ((i_275_ - i_273_) * ((Class160_Sub1_Sub3) this).anInt8851);
				}
				int i_289_ = (i_275_ + is_286_.length < i_273_ + i_279_ ? i_275_ + is_286_.length : i_273_ + i_279_);
				for (int i_290_ = i_288_; i_290_ < i_289_; i_290_++) {
					int i_291_ = is_286_[i_290_ - i_275_] + i_274_;
					int i_292_ = is_287_[i_290_ - i_275_];
					int i_293_ = i_278_;
					if (i > i_291_) {
						int i_294_ = i - i_291_;
						if (i_294_ >= i_292_) {
							i_276_ += i_278_ + i_281_;
							i_282_ += i_278_ + i_280_;
							continue;
						}
						i_292_ -= i_294_;
					} else {
						int i_295_ = i_291_ - i;
						if (i_295_ >= i_278_) {
							i_276_ += i_278_ + i_281_;
							i_282_ += i_278_ + i_280_;
							continue;
						}
						i_276_ += i_295_;
						i_293_ -= i_295_;
						i_282_ += i_295_;
					}
					int i_296_ = 0;
					if (i_293_ < i_292_)
						i_292_ = i_293_;
					else
						i_296_ = i_293_ - i_292_;
					for (int i_297_ = -i_292_; i_297_ < 0; i_297_++) {
						int i_298_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_276_++]);
						int i_299_ = i_298_ >>> 24;
						int i_300_ = 256 - i_299_;
						int i_301_ = is[i_282_];
						is[i_282_++] = ((((i_298_ & 0xff00ff) * i_299_ + (i_301_ & 0xff00ff) * i_300_) & ~0xff00ff) + (((i_298_ & 0xff00) * i_299_ + (i_301_ & 0xff00) * i_300_) & 0xff0000)) >> 8;
					}
					i_276_ += i_296_ + i_281_;
					i_282_ += i_296_ + i_280_;
				}
			}
		}
	}

	public Interface9 method2808() {
		return new Class192(((Class160_Sub1_Sub3) this).anInt8851, ((Class160_Sub1_Sub3) this).anInt8867, ((Class160_Sub1_Sub3) this).anIntArray10235);
	}

	public void method2742(int i, int i_302_, int i_303_, int i_304_, int i_305_) {
		if (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			int i_306_ = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			i += ((Class160_Sub1_Sub3) this).anInt8853;
			i_302_ += ((Class160_Sub1_Sub3) this).anInt8854;
			int i_307_ = i_302_ * i_306_ + i;
			int i_308_ = 0;
			int i_309_ = ((Class160_Sub1_Sub3) this).anInt8867;
			int i_310_ = ((Class160_Sub1_Sub3) this).anInt8851;
			int i_311_ = i_306_ - i_310_;
			int i_312_ = 0;
			if (i_302_ < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_313_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_302_);
				i_309_ -= i_313_;
				i_302_ = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_308_ += i_313_ * i_310_;
				i_307_ += i_313_ * i_306_;
			}
			if (i_302_ + i_309_ > (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_309_ -= (i_302_ + i_309_ - (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt8986) * 1383960921);
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_314_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_310_ -= i_314_;
				i = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_308_ += i_314_;
				i_307_ += i_314_;
				i_312_ += i_314_;
				i_311_ += i_314_;
			}
			if (i + i_310_ > (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt9002) * -1710988237) {
				int i_315_ = (i + i_310_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_310_ -= i_315_;
				i_312_ += i_315_;
				i_311_ += i_315_;
			}
			if (i_310_ > 0 && i_309_ > 0) {
				if (i_305_ == 0) {
					if (i_303_ == 1) {
						for (int i_316_ = -i_309_; i_316_ < 0; i_316_++) {
							int i_317_ = i_307_ + i_310_ - 3;
							while (i_307_ < i_317_) {
								is[i_307_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
								is[i_307_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
								is[i_307_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
								is[i_307_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
							}
							i_317_ += 3;
							while (i_307_ < i_317_)
								is[i_307_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
							i_307_ += i_311_;
							i_308_ += i_312_;
						}
					} else if (i_303_ == 0) {
						int i_318_ = (i_304_ & 0xff0000) >> 16;
						int i_319_ = (i_304_ & 0xff00) >> 8;
						int i_320_ = i_304_ & 0xff;
						for (int i_321_ = -i_309_; i_321_ < 0; i_321_++) {
							for (int i_322_ = -i_310_; i_322_ < 0; i_322_++) {
								int i_323_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
								int i_324_ = (i_323_ & 0xff0000) * i_318_ & ~0xffffff;
								int i_325_ = (i_323_ & 0xff00) * i_319_ & 0xff0000;
								int i_326_ = (i_323_ & 0xff) * i_320_ & 0xff00;
								is[i_307_++] = (i_324_ | i_325_ | i_326_) >>> 8;
							}
							i_307_ += i_311_;
							i_308_ += i_312_;
						}
					} else if (i_303_ == 3) {
						for (int i_327_ = -i_309_; i_327_ < 0; i_327_++) {
							for (int i_328_ = -i_310_; i_328_ < 0; i_328_++) {
								int i_329_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
								int i_330_ = i_329_ + i_304_;
								int i_331_ = ((i_329_ & 0xff00ff) + (i_304_ & 0xff00ff));
								int i_332_ = ((i_331_ & 0x1000100) + (i_330_ - i_331_ & 0x10000));
								is[i_307_++] = i_330_ - i_332_ | i_332_ - (i_332_ >>> 8);
							}
							i_307_ += i_311_;
							i_308_ += i_312_;
						}
					} else if (i_303_ == 2) {
						int i_333_ = i_304_ >>> 24;
						int i_334_ = 256 - i_333_;
						int i_335_ = (i_304_ & 0xff00ff) * i_334_ & ~0xff00ff;
						int i_336_ = (i_304_ & 0xff00) * i_334_ & 0xff0000;
						i_304_ = (i_335_ | i_336_) >>> 8;
						for (int i_337_ = -i_309_; i_337_ < 0; i_337_++) {
							for (int i_338_ = -i_310_; i_338_ < 0; i_338_++) {
								int i_339_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
								i_335_ = (i_339_ & 0xff00ff) * i_333_ & ~0xff00ff;
								i_336_ = (i_339_ & 0xff00) * i_333_ & 0xff0000;
								is[i_307_++] = ((i_335_ | i_336_) >>> 8) + i_304_;
							}
							i_307_ += i_311_;
							i_308_ += i_312_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_305_ == 1) {
					if (i_303_ == 1) {
						for (int i_340_ = -i_309_; i_340_ < 0; i_340_++) {
							for (int i_341_ = -i_310_; i_341_ < 0; i_341_++) {
								int i_342_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
								int i_343_ = i_342_ >>> 24;
								int i_344_ = 256 - i_343_;
								int i_345_ = is[i_307_];
								is[i_307_++] = (((((i_342_ & 0xff00ff) * i_343_ + (i_345_ & 0xff00ff) * i_344_) & ~0xff00ff) >> 8) + (((((i_342_ & ~0xff00ff) >>> 8) * i_343_) + (((i_345_ & ~0xff00ff) >>> 8) * i_344_)) & ~0xff00ff));
							}
							i_307_ += i_311_;
							i_308_ += i_312_;
						}
					} else if (i_303_ == 0) {
						if ((i_304_ & 0xffffff) == 16777215) {
							for (int i_346_ = -i_309_; i_346_ < 0; i_346_++) {
								for (int i_347_ = -i_310_; i_347_ < 0; i_347_++) {
									int i_348_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
									int i_349_ = ((i_348_ >>> 24) * (i_304_ >>> 24) >> 8);
									int i_350_ = 256 - i_349_;
									int i_351_ = is[i_307_];
									is[i_307_++] = ((((i_348_ & 0xff00ff) * i_349_ + (i_351_ & 0xff00ff) * i_350_) & ~0xff00ff) + (((i_348_ & 0xff00) * i_349_ + (i_351_ & 0xff00) * i_350_) & 0xff0000)) >> 8;
								}
								i_307_ += i_311_;
								i_308_ += i_312_;
							}
						} else {
							int i_352_ = (i_304_ & 0xff0000) >> 16;
							int i_353_ = (i_304_ & 0xff00) >> 8;
							int i_354_ = i_304_ & 0xff;
							for (int i_355_ = -i_309_; i_355_ < 0; i_355_++) {
								for (int i_356_ = -i_310_; i_356_ < 0; i_356_++) {
									int i_357_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
									int i_358_ = ((i_357_ >>> 24) * (i_304_ >>> 24) >> 8);
									int i_359_ = 256 - i_358_;
									if (i_358_ != 255) {
										int i_360_ = ((i_357_ & 0xff0000) * i_352_ & ~0xffffff);
										int i_361_ = ((i_357_ & 0xff00) * i_353_ & 0xff0000);
										int i_362_ = ((i_357_ & 0xff) * i_354_ & 0xff00);
										i_357_ = (i_360_ | i_361_ | i_362_) >>> 8;
										int i_363_ = is[i_307_];
										is[i_307_++] = ((((i_357_ & 0xff00ff) * i_358_ + ((i_363_ & 0xff00ff) * i_359_)) & ~0xff00ff) + (((i_357_ & 0xff00) * i_358_ + ((i_363_ & 0xff00) * i_359_)) & 0xff0000)) >> 8;
									} else {
										int i_364_ = ((i_357_ & 0xff0000) * i_352_ & ~0xffffff);
										int i_365_ = ((i_357_ & 0xff00) * i_353_ & 0xff0000);
										int i_366_ = ((i_357_ & 0xff) * i_354_ & 0xff00);
										is[i_307_++] = (i_364_ | i_365_ | i_366_) >>> 8;
									}
								}
								i_307_ += i_311_;
								i_308_ += i_312_;
							}
						}
					} else if (i_303_ == 3) {
						for (int i_367_ = -i_309_; i_367_ < 0; i_367_++) {
							for (int i_368_ = -i_310_; i_368_ < 0; i_368_++) {
								int i_369_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
								int i_370_ = i_369_ + i_304_;
								int i_371_ = ((i_369_ & 0xff00ff) + (i_304_ & 0xff00ff));
								int i_372_ = ((i_371_ & 0x1000100) + (i_370_ - i_371_ & 0x10000));
								i_372_ = i_370_ - i_372_ | i_372_ - (i_372_ >>> 8);
								int i_373_ = (i_372_ >>> 24) * (i_304_ >>> 24) >> 8;
								int i_374_ = 256 - i_373_;
								if (i_373_ != 255) {
									i_369_ = i_372_;
									i_372_ = is[i_307_];
									i_372_ = ((((i_369_ & 0xff00ff) * i_373_ + (i_372_ & 0xff00ff) * i_374_) & ~0xff00ff) + (((i_369_ & 0xff00) * i_373_ + (i_372_ & 0xff00) * i_374_) & 0xff0000)) >> 8;
								}
								is[i_307_++] = i_372_;
							}
							i_307_ += i_311_;
							i_308_ += i_312_;
						}
					} else if (i_303_ == 2) {
						int i_375_ = i_304_ >>> 24;
						int i_376_ = 256 - i_375_;
						int i_377_ = (i_304_ & 0xff00ff) * i_376_ & ~0xff00ff;
						int i_378_ = (i_304_ & 0xff00) * i_376_ & 0xff0000;
						i_304_ = (i_377_ | i_378_) >>> 8;
						for (int i_379_ = -i_309_; i_379_ < 0; i_379_++) {
							for (int i_380_ = -i_310_; i_380_ < 0; i_380_++) {
								int i_381_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
								int i_382_ = i_381_ >>> 24;
								int i_383_ = 256 - i_382_;
								i_377_ = (i_381_ & 0xff00ff) * i_375_ & ~0xff00ff;
								i_378_ = (i_381_ & 0xff00) * i_375_ & 0xff0000;
								i_381_ = ((i_377_ | i_378_) >>> 8) + i_304_;
								int i_384_ = is[i_307_];
								is[i_307_++] = ((((i_381_ & 0xff00ff) * i_382_ + (i_384_ & 0xff00ff) * i_383_) & ~0xff00ff) + (((i_381_ & 0xff00) * i_382_ + (i_384_ & 0xff00) * i_383_) & 0xff0000)) >> 8;
							}
							i_307_ += i_311_;
							i_308_ += i_312_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_305_ == 2) {
					if (i_303_ == 1) {
						for (int i_385_ = -i_309_; i_385_ < 0; i_385_++) {
							for (int i_386_ = -i_310_; i_386_ < 0; i_386_++) {
								int i_387_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
								if (i_387_ != 0) {
									int i_388_ = is[i_307_];
									int i_389_ = i_387_ + i_388_;
									int i_390_ = ((i_387_ & 0xff00ff) + (i_388_ & 0xff00ff));
									i_388_ = ((i_390_ & 0x1000100) + (i_389_ - i_390_ & 0x10000));
									is[i_307_++] = i_389_ - i_388_ | i_388_ - (i_388_ >>> 8);
								} else
									i_307_++;
							}
							i_307_ += i_311_;
							i_308_ += i_312_;
						}
					} else if (i_303_ == 0) {
						int i_391_ = (i_304_ & 0xff0000) >> 16;
						int i_392_ = (i_304_ & 0xff00) >> 8;
						int i_393_ = i_304_ & 0xff;
						for (int i_394_ = -i_309_; i_394_ < 0; i_394_++) {
							for (int i_395_ = -i_310_; i_395_ < 0; i_395_++) {
								int i_396_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
								if (i_396_ != 0) {
									int i_397_ = ((i_396_ & 0xff0000) * i_391_ & ~0xffffff);
									int i_398_ = ((i_396_ & 0xff00) * i_392_ & 0xff0000);
									int i_399_ = (i_396_ & 0xff) * i_393_ & 0xff00;
									i_396_ = (i_397_ | i_398_ | i_399_) >>> 8;
									int i_400_ = is[i_307_];
									int i_401_ = i_396_ + i_400_;
									int i_402_ = ((i_396_ & 0xff00ff) + (i_400_ & 0xff00ff));
									i_400_ = ((i_402_ & 0x1000100) + (i_401_ - i_402_ & 0x10000));
									is[i_307_++] = i_401_ - i_400_ | i_400_ - (i_400_ >>> 8);
								} else
									i_307_++;
							}
							i_307_ += i_311_;
							i_308_ += i_312_;
						}
					} else if (i_303_ == 3) {
						for (int i_403_ = -i_309_; i_403_ < 0; i_403_++) {
							for (int i_404_ = -i_310_; i_404_ < 0; i_404_++) {
								int i_405_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
								int i_406_ = i_405_ + i_304_;
								int i_407_ = ((i_405_ & 0xff00ff) + (i_304_ & 0xff00ff));
								int i_408_ = ((i_407_ & 0x1000100) + (i_406_ - i_407_ & 0x10000));
								i_405_ = i_406_ - i_408_ | i_408_ - (i_408_ >>> 8);
								i_408_ = is[i_307_];
								i_406_ = i_405_ + i_408_;
								i_407_ = (i_405_ & 0xff00ff) + (i_408_ & 0xff00ff);
								i_408_ = (i_407_ & 0x1000100) + (i_406_ - i_407_ & 0x10000);
								is[i_307_++] = i_406_ - i_408_ | i_408_ - (i_408_ >>> 8);
							}
							i_307_ += i_311_;
							i_308_ += i_312_;
						}
					} else if (i_303_ == 2) {
						int i_409_ = i_304_ >>> 24;
						int i_410_ = 256 - i_409_;
						int i_411_ = (i_304_ & 0xff00ff) * i_410_ & ~0xff00ff;
						int i_412_ = (i_304_ & 0xff00) * i_410_ & 0xff0000;
						i_304_ = (i_411_ | i_412_) >>> 8;
						for (int i_413_ = -i_309_; i_413_ < 0; i_413_++) {
							for (int i_414_ = -i_310_; i_414_ < 0; i_414_++) {
								int i_415_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_308_++]);
								if (i_415_ != 0) {
									i_411_ = ((i_415_ & 0xff00ff) * i_409_ & ~0xff00ff);
									i_412_ = ((i_415_ & 0xff00) * i_409_ & 0xff0000);
									i_415_ = ((i_411_ | i_412_) >>> 8) + i_304_;
									int i_416_ = is[i_307_];
									int i_417_ = i_415_ + i_416_;
									int i_418_ = ((i_415_ & 0xff00ff) + (i_416_ & 0xff00ff));
									i_416_ = ((i_418_ & 0x1000100) + (i_417_ - i_418_ & 0x10000));
									is[i_307_++] = i_417_ - i_416_ | i_416_ - (i_416_ >>> 8);
								} else
									i_307_++;
							}
							i_307_ += i_311_;
							i_308_ += i_312_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2773(int i, int i_419_, Class455 class455, int i_420_, int i_421_) {
		if (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			i += ((Class160_Sub1_Sub3) this).anInt8853;
			i_419_ += ((Class160_Sub1_Sub3) this).anInt8854;
			int i_422_ = 0;
			int i_423_ = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			int i_424_ = ((Class160_Sub1_Sub3) this).anInt8851;
			int i_425_ = ((Class160_Sub1_Sub3) this).anInt8867;
			int i_426_ = i_423_ - i_424_;
			int i_427_ = 0;
			int i_428_ = i + i_419_ * i_423_;
			if (i_419_ < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_429_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_419_);
				i_425_ -= i_429_;
				i_419_ = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_422_ += i_429_ * i_424_;
				i_428_ += i_429_ * i_423_;
			}
			if (i_419_ + i_425_ > (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_425_ -= (i_419_ + i_425_ - (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt8986) * 1383960921);
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_430_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_424_ -= i_430_;
				i = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_422_ += i_430_;
				i_428_ += i_430_;
				i_427_ += i_430_;
				i_426_ += i_430_;
			}
			if (i + i_424_ > (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt9002) * -1710988237) {
				int i_431_ = (i + i_424_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_424_ -= i_431_;
				i_427_ += i_431_;
				i_426_ += i_431_;
			}
			if (i_424_ > 0 && i_425_ > 0) {
				PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
				int[] is_432_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
				int[] is_433_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
				int i_434_ = i_419_;
				if (i_421_ > i_434_) {
					i_434_ = i_421_;
					i_428_ += (i_421_ - i_419_) * i_423_;
					i_422_ += ((i_421_ - i_419_) * ((Class160_Sub1_Sub3) this).anInt8851);
				}
				int i_435_ = (i_421_ + is_432_.length < i_419_ + i_425_ ? i_421_ + is_432_.length : i_419_ + i_425_);
				for (int i_436_ = i_434_; i_436_ < i_435_; i_436_++) {
					int i_437_ = is_432_[i_436_ - i_421_] + i_420_;
					int i_438_ = is_433_[i_436_ - i_421_];
					int i_439_ = i_424_;
					if (i > i_437_) {
						int i_440_ = i - i_437_;
						if (i_440_ >= i_438_) {
							i_422_ += i_424_ + i_427_;
							i_428_ += i_424_ + i_426_;
							continue;
						}
						i_438_ -= i_440_;
					} else {
						int i_441_ = i_437_ - i;
						if (i_441_ >= i_424_) {
							i_422_ += i_424_ + i_427_;
							i_428_ += i_424_ + i_426_;
							continue;
						}
						i_422_ += i_441_;
						i_439_ -= i_441_;
						i_428_ += i_441_;
					}
					int i_442_ = 0;
					if (i_439_ < i_438_)
						i_438_ = i_439_;
					else
						i_442_ = i_439_ - i_438_;
					for (int i_443_ = -i_438_; i_443_ < 0; i_443_++) {
						int i_444_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_422_++]);
						int i_445_ = i_444_ >>> 24;
						int i_446_ = 256 - i_445_;
						int i_447_ = is[i_428_];
						is[i_428_++] = ((((i_444_ & 0xff00ff) * i_445_ + (i_447_ & 0xff00ff) * i_446_) & ~0xff00ff) + (((i_444_ & 0xff00) * i_445_ + (i_447_ & 0xff00) * i_446_) & 0xff0000)) >> 8;
					}
					i_422_ += i_442_ + i_427_;
					i_428_ += i_442_ + i_426_;
				}
			}
		}
	}

	public void method2768(int i, int i_448_, int i_449_, int i_450_, int i_451_, int i_452_) {
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_453_ = 0; i_453_ < i_450_; i_453_++) {
			int i_454_ = (i_448_ + i_453_) * i_449_ + i;
			int i_455_ = (i_452_ + i_453_) * i_449_ + i_451_;
			for (int i_456_ = 0; i_456_ < i_449_; i_456_++)
				((Class160_Sub1_Sub3) this).anIntArray10235[i_454_ + i_456_] = is[i_455_ + i_456_] & 0xffffff;
		}
	}

	void method14247(boolean bool, boolean bool_457_, boolean bool_458_, int i, int i_459_, float f, int i_460_, int i_461_, int i_462_, int i_463_, int i_464_, int i_465_, boolean bool_466_) {
		if (i_460_ > 0 && i_461_ > 0 && (bool || bool_457_)) {
			int i_467_ = 0;
			int i_468_ = 0;
			int i_469_ = (((Class160_Sub1_Sub3) this).anInt8853 + ((Class160_Sub1_Sub3) this).anInt8851 + ((Class160_Sub1_Sub3) this).anInt8855);
			int i_470_ = (((Class160_Sub1_Sub3) this).anInt8854 + ((Class160_Sub1_Sub3) this).anInt8867 + ((Class160_Sub1_Sub3) this).anInt8856);
			int i_471_ = (i_469_ << 16) / i_460_;
			int i_472_ = (i_470_ << 16) / i_461_;
			if (((Class160_Sub1_Sub3) this).anInt8853 > 0) {
				int i_473_ = (((((Class160_Sub1_Sub3) this).anInt8853 << 16) + i_471_ - 1) / i_471_);
				i += i_473_;
				i_467_ += i_473_ * i_471_ - (((Class160_Sub1_Sub3) this).anInt8853 << 16);
			}
			if (((Class160_Sub1_Sub3) this).anInt8854 > 0) {
				int i_474_ = (((((Class160_Sub1_Sub3) this).anInt8854 << 16) + i_472_ - 1) / i_472_);
				i_459_ += i_474_;
				i_468_ += i_474_ * i_472_ - (((Class160_Sub1_Sub3) this).anInt8854 << 16);
			}
			if (((Class160_Sub1_Sub3) this).anInt8851 < i_469_)
				i_460_ = ((((Class160_Sub1_Sub3) this).anInt8851 << 16) - i_467_ + i_471_ - 1) / i_471_;
			if (((Class160_Sub1_Sub3) this).anInt8867 < i_470_)
				i_461_ = ((((Class160_Sub1_Sub3) this).anInt8867 << 16) - i_468_ + i_472_ - 1) / i_472_;
			int i_475_ = i + i_459_ * ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980) * 444800403);
			int i_476_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403) - i_460_);
			if (i_459_ + i_461_ > (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_461_ -= (i_459_ + i_461_ - (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt8986) * 1383960921);
			if (i_459_ < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_477_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_459_);
				i_461_ -= i_477_;
				i_475_ += i_477_ * ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980) * 444800403);
				i_468_ += i_472_ * i_477_;
			}
			if (i + i_460_ > (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt9002) * -1710988237) {
				int i_478_ = (i + i_460_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_460_ -= i_478_;
				i_476_ += i_478_;
			}
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_479_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_460_ -= i_479_;
				i_475_ += i_479_;
				i_467_ += i_471_ * i_479_;
				i_476_ += i_479_;
			}
			float[] fs = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).aFloatArray9010);
			int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
			if (i_464_ == 0) {
				if (i_462_ == 1) {
					int i_480_ = i_467_;
					for (int i_481_ = -i_461_; i_481_ < 0; i_481_++) {
						int i_482_ = ((i_468_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_483_ = -i_460_; i_483_ < 0; i_483_++) {
							if (!bool_457_ || f < fs[i_475_]) {
								if (bool)
									is[i_475_] = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_467_ >> 16) + i_482_]);
								if (bool_457_ && bool_466_)
									fs[i_475_] = f;
							}
							i_467_ += i_471_;
							i_475_++;
						}
						i_468_ += i_472_;
						i_467_ = i_480_;
						i_475_ += i_476_;
					}
				} else if (i_462_ == 0) {
					int i_484_ = (i_463_ & 0xff0000) >> 16;
					int i_485_ = (i_463_ & 0xff00) >> 8;
					int i_486_ = i_463_ & 0xff;
					int i_487_ = i_467_;
					for (int i_488_ = -i_461_; i_488_ < 0; i_488_++) {
						int i_489_ = ((i_468_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_490_ = -i_460_; i_490_ < 0; i_490_++) {
							if (!bool_457_ || f < fs[i_475_]) {
								if (bool) {
									int i_491_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_467_ >> 16) + i_489_]);
									int i_492_ = ((i_491_ & 0xff0000) * i_484_ & ~0xffffff);
									int i_493_ = ((i_491_ & 0xff00) * i_485_ & 0xff0000);
									int i_494_ = (i_491_ & 0xff) * i_486_ & 0xff00;
									is[i_475_] = (i_492_ | i_493_ | i_494_) >>> 8;
								}
								if (bool_457_ && bool_466_)
									fs[i_475_] = f;
							}
							i_467_ += i_471_;
							i_475_++;
						}
						i_468_ += i_472_;
						i_467_ = i_487_;
						i_475_ += i_476_;
					}
				} else if (i_462_ == 3) {
					int i_495_ = i_467_;
					for (int i_496_ = -i_461_; i_496_ < 0; i_496_++) {
						int i_497_ = ((i_468_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_498_ = -i_460_; i_498_ < 0; i_498_++) {
							if (!bool_457_ || f < fs[i_475_]) {
								if (bool) {
									int i_499_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_467_ >> 16) + i_497_]);
									int i_500_ = i_499_ + i_463_;
									int i_501_ = ((i_499_ & 0xff00ff) + (i_463_ & 0xff00ff));
									int i_502_ = ((i_501_ & 0x1000100) + (i_500_ - i_501_ & 0x10000));
									is[i_475_] = i_500_ - i_502_ | i_502_ - (i_502_ >>> 8);
								}
								if (bool_457_ && bool_466_)
									fs[i_475_] = f;
							}
							i_467_ += i_471_;
							i_475_++;
						}
						i_468_ += i_472_;
						i_467_ = i_495_;
						i_475_ += i_476_;
					}
				} else if (i_462_ == 2) {
					int i_503_ = i_463_ >>> 24;
					int i_504_ = 256 - i_503_;
					int i_505_ = (i_463_ & 0xff00ff) * i_504_ & ~0xff00ff;
					int i_506_ = (i_463_ & 0xff00) * i_504_ & 0xff0000;
					i_463_ = (i_505_ | i_506_) >>> 8;
					int i_507_ = i_467_;
					for (int i_508_ = -i_461_; i_508_ < 0; i_508_++) {
						int i_509_ = ((i_468_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_510_ = -i_460_; i_510_ < 0; i_510_++) {
							if (!bool_457_ || f < fs[i_475_]) {
								if (bool) {
									int i_511_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_467_ >> 16) + i_509_]);
									i_505_ = ((i_511_ & 0xff00ff) * i_503_ & ~0xff00ff);
									i_506_ = ((i_511_ & 0xff00) * i_503_ & 0xff0000);
									is[i_475_] = ((i_505_ | i_506_) >>> 8) + i_463_;
								}
								if (bool_457_ && bool_466_)
									fs[i_475_] = f;
							}
							i_467_ += i_471_;
							i_475_++;
						}
						i_468_ += i_472_;
						i_467_ = i_507_;
						i_475_ += i_476_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_464_ == 1) {
				if (i_462_ == 1) {
					int i_512_ = i_467_;
					for (int i_513_ = -i_461_; i_513_ < 0; i_513_++) {
						int i_514_ = ((i_468_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_515_ = -i_460_; i_515_ < 0; i_515_++) {
							if (!bool_457_ || f < fs[i_475_]) {
								if (bool) {
									int i_516_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_467_ >> 16) + i_514_]);
									int i_517_ = i_516_ >>> 24;
									int i_518_ = 256 - i_517_;
									int i_519_ = is[i_475_];
									is[i_475_] = (((((i_516_ & 0xff00ff) * i_517_ + (i_519_ & 0xff00ff) * i_518_) & ~0xff00ff) >> 8) + (((((i_516_ & ~0xff00ff) >>> 8) * i_517_) + (((i_519_ & ~0xff00ff) >>> 8) * i_518_)) & ~0xff00ff));
								}
								if (bool_457_ && bool_466_)
									fs[i_475_] = f;
							}
							i_467_ += i_471_;
							i_475_++;
						}
						i_468_ += i_472_;
						i_467_ = i_512_;
						i_475_ += i_476_;
					}
				} else if (i_462_ == 0) {
					int i_520_ = i_467_;
					if ((i_463_ & 0xffffff) == 16777215) {
						for (int i_521_ = -i_461_; i_521_ < 0; i_521_++) {
							int i_522_ = ((i_468_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_523_ = -i_460_; i_523_ < 0; i_523_++) {
								if (!bool_457_ || f < fs[i_475_]) {
									if (bool) {
										int i_524_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_467_ >> 16) + i_522_]);
										int i_525_ = ((i_524_ >>> 24) * (i_463_ >>> 24) >> 8);
										int i_526_ = 256 - i_525_;
										int i_527_ = is[i_475_];
										is[i_475_] = ((((i_524_ & 0xff00ff) * i_525_ + ((i_527_ & 0xff00ff) * i_526_)) & ~0xff00ff) + (((i_524_ & 0xff00) * i_525_ + ((i_527_ & 0xff00) * i_526_)) & 0xff0000)) >> 8;
									}
									if (bool_457_ && bool_466_)
										fs[i_475_] = f;
								}
								i_467_ += i_471_;
								i_475_++;
							}
							i_468_ += i_472_;
							i_467_ = i_520_;
							i_475_ += i_476_;
						}
					} else {
						int i_528_ = (i_463_ & 0xff0000) >> 16;
						int i_529_ = (i_463_ & 0xff00) >> 8;
						int i_530_ = i_463_ & 0xff;
						for (int i_531_ = -i_461_; i_531_ < 0; i_531_++) {
							int i_532_ = ((i_468_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_533_ = -i_460_; i_533_ < 0; i_533_++) {
								if (!bool_457_ || f < fs[i_475_]) {
									int i_534_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_467_ >> 16) + i_532_]);
									int i_535_ = ((i_534_ >>> 24) * (i_463_ >>> 24) >> 8);
									int i_536_ = 256 - i_535_;
									if (i_535_ != 255) {
										if (bool) {
											int i_537_ = ((i_534_ & 0xff0000) * i_528_ & ~0xffffff);
											int i_538_ = ((i_534_ & 0xff00) * i_529_ & 0xff0000);
											int i_539_ = ((i_534_ & 0xff) * i_530_ & 0xff00);
											i_534_ = (i_537_ | i_538_ | i_539_) >>> 8;
											int i_540_ = is[i_475_];
											is[i_475_] = (((((i_534_ & 0xff00ff) * i_535_) + ((i_540_ & 0xff00ff) * i_536_)) & ~0xff00ff) + ((((i_534_ & 0xff00) * i_535_) + ((i_540_ & 0xff00) * i_536_)) & 0xff0000)) >> 8;
											if (bool_458_) {
												int i_541_ = (i_540_ >>> 24) + i_535_;
												if (i_541_ > 255)
													i_541_ = 255;
												is[i_475_] |= i_541_ << 24;
											}
										}
										if (bool_457_ && bool_466_)
											fs[i_475_] = f;
									} else {
										if (bool) {
											int i_542_ = ((i_534_ & 0xff0000) * i_528_ & ~0xffffff);
											int i_543_ = ((i_534_ & 0xff00) * i_529_ & 0xff0000);
											int i_544_ = ((i_534_ & 0xff) * i_530_ & 0xff00);
											is[i_475_] = (i_542_ | i_543_ | i_544_) >>> 8;
										}
										if (bool_457_ && bool_466_)
											fs[i_475_] = f;
									}
								}
								i_467_ += i_471_;
								i_475_++;
							}
							i_468_ += i_472_;
							i_467_ = i_520_;
							i_475_ += i_476_;
						}
					}
				} else if (i_462_ == 3) {
					int i_545_ = i_467_;
					for (int i_546_ = -i_461_; i_546_ < 0; i_546_++) {
						int i_547_ = ((i_468_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_548_ = -i_460_; i_548_ < 0; i_548_++) {
							if (!bool_457_ || f < fs[i_475_]) {
								if (bool) {
									int i_549_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_467_ >> 16) + i_547_]);
									int i_550_ = i_549_ + i_463_;
									int i_551_ = ((i_549_ & 0xff00ff) + (i_463_ & 0xff00ff));
									int i_552_ = ((i_551_ & 0x1000100) + (i_550_ - i_551_ & 0x10000));
									i_552_ = i_550_ - i_552_ | i_552_ - (i_552_ >>> 8);
									int i_553_ = ((i_552_ >>> 24) * (i_463_ >>> 24) >> 8);
									int i_554_ = 256 - i_553_;
									if (i_553_ != 255) {
										i_549_ = i_552_;
										i_552_ = is[i_475_];
										i_552_ = ((((i_549_ & 0xff00ff) * i_553_ + ((i_552_ & 0xff00ff) * i_554_)) & ~0xff00ff) + (((i_549_ & 0xff00) * i_553_ + ((i_552_ & 0xff00) * i_554_)) & 0xff0000)) >> 8;
									}
									is[i_475_] = i_552_;
								}
								if (bool_457_ && bool_466_)
									fs[i_475_] = f;
							}
							i_467_ += i_471_;
							i_475_++;
						}
						i_468_ += i_472_;
						i_467_ = i_545_;
						i_475_ += i_476_;
					}
				} else if (i_462_ == 2) {
					int i_555_ = i_463_ >>> 24;
					int i_556_ = 256 - i_555_;
					int i_557_ = (i_463_ & 0xff00ff) * i_556_ & ~0xff00ff;
					int i_558_ = (i_463_ & 0xff00) * i_556_ & 0xff0000;
					i_463_ = (i_557_ | i_558_) >>> 8;
					int i_559_ = i_467_;
					for (int i_560_ = -i_461_; i_560_ < 0; i_560_++) {
						int i_561_ = ((i_468_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_562_ = -i_460_; i_562_ < 0; i_562_++) {
							if (!bool_457_ || f < fs[i_475_]) {
								if (bool) {
									int i_563_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_467_ >> 16) + i_561_]);
									int i_564_ = i_563_ >>> 24;
									int i_565_ = 256 - i_564_;
									i_557_ = ((i_563_ & 0xff00ff) * i_555_ & ~0xff00ff);
									i_558_ = ((i_563_ & 0xff00) * i_555_ & 0xff0000);
									i_563_ = ((i_557_ | i_558_) >>> 8) + i_463_;
									int i_566_ = is[i_475_];
									is[i_475_] = ((((i_563_ & 0xff00ff) * i_564_ + (i_566_ & 0xff00ff) * i_565_) & ~0xff00ff) + (((i_563_ & 0xff00) * i_564_ + (i_566_ & 0xff00) * i_565_) & 0xff0000)) >> 8;
								}
								if (bool_457_ && bool_466_)
									fs[i_475_] = f;
							}
							i_467_ += i_471_;
							i_475_++;
						}
						i_468_ += i_472_;
						i_467_ = i_559_;
						i_475_ += i_476_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_464_ == 2) {
				if (i_462_ == 1) {
					int i_567_ = i_467_;
					for (int i_568_ = -i_461_; i_568_ < 0; i_568_++) {
						int i_569_ = ((i_468_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_570_ = -i_460_; i_570_ < 0; i_570_++) {
							if (!bool_457_ || f < fs[i_475_]) {
								int i_571_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_467_ >> 16) + i_569_]);
								if (i_571_ != 0) {
									if (bool) {
										int i_572_ = is[i_475_];
										int i_573_ = i_571_ + i_572_;
										int i_574_ = ((i_571_ & 0xff00ff) + (i_572_ & 0xff00ff));
										i_572_ = ((i_574_ & 0x1000100) + (i_573_ - i_574_ & 0x10000));
										is[i_475_] = (i_573_ - i_572_ | i_572_ - (i_572_ >>> 8));
									}
									if (bool_457_ && bool_466_)
										fs[i_475_] = f;
								}
							}
							i_467_ += i_471_;
							i_475_++;
						}
						i_468_ += i_472_;
						i_467_ = i_567_;
						i_475_ += i_476_;
					}
				} else if (i_462_ == 0) {
					int i_575_ = i_467_;
					int i_576_ = (i_463_ & 0xff0000) >> 16;
					int i_577_ = (i_463_ & 0xff00) >> 8;
					int i_578_ = i_463_ & 0xff;
					for (int i_579_ = -i_461_; i_579_ < 0; i_579_++) {
						int i_580_ = ((i_468_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_581_ = -i_460_; i_581_ < 0; i_581_++) {
							if (!bool_457_ || f < fs[i_475_]) {
								int i_582_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_467_ >> 16) + i_580_]);
								if (i_582_ != 0) {
									if (bool) {
										int i_583_ = ((i_582_ & 0xff0000) * i_576_ & ~0xffffff);
										int i_584_ = ((i_582_ & 0xff00) * i_577_ & 0xff0000);
										int i_585_ = ((i_582_ & 0xff) * i_578_ & 0xff00);
										i_582_ = (i_583_ | i_584_ | i_585_) >>> 8;
										int i_586_ = is[i_475_];
										int i_587_ = i_582_ + i_586_;
										int i_588_ = ((i_582_ & 0xff00ff) + (i_586_ & 0xff00ff));
										i_586_ = ((i_588_ & 0x1000100) + (i_587_ - i_588_ & 0x10000));
										is[i_475_] = (i_587_ - i_586_ | i_586_ - (i_586_ >>> 8));
									}
									if (bool_457_ && bool_466_)
										fs[i_475_] = f;
								}
							}
							i_467_ += i_471_;
							i_475_++;
						}
						i_468_ += i_472_;
						i_467_ = i_575_;
						i_475_ += i_476_;
					}
				} else if (i_462_ == 3) {
					int i_589_ = i_467_;
					for (int i_590_ = -i_461_; i_590_ < 0; i_590_++) {
						int i_591_ = ((i_468_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_592_ = -i_460_; i_592_ < 0; i_592_++) {
							if (!bool_457_ || f < fs[i_475_]) {
								if (bool) {
									int i_593_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_467_ >> 16) + i_591_]);
									int i_594_ = i_593_ + i_463_;
									int i_595_ = ((i_593_ & 0xff00ff) + (i_463_ & 0xff00ff));
									int i_596_ = ((i_595_ & 0x1000100) + (i_594_ - i_595_ & 0x10000));
									i_593_ = i_594_ - i_596_ | i_596_ - (i_596_ >>> 8);
									i_596_ = is[i_475_];
									i_594_ = i_593_ + i_596_;
									i_595_ = (i_593_ & 0xff00ff) + (i_596_ & 0xff00ff);
									i_596_ = ((i_595_ & 0x1000100) + (i_594_ - i_595_ & 0x10000));
									is[i_475_] = i_594_ - i_596_ | i_596_ - (i_596_ >>> 8);
								}
								if (bool_457_ && bool_466_)
									fs[i_475_] = f;
							}
							i_467_ += i_471_;
							i_475_++;
						}
						i_468_ += i_472_;
						i_467_ = i_589_;
						i_475_ += i_476_;
					}
				} else if (i_462_ == 2) {
					int i_597_ = i_463_ >>> 24;
					int i_598_ = 256 - i_597_;
					int i_599_ = (i_463_ & 0xff00ff) * i_598_ & ~0xff00ff;
					int i_600_ = (i_463_ & 0xff00) * i_598_ & 0xff0000;
					i_463_ = (i_599_ | i_600_) >>> 8;
					int i_601_ = i_467_;
					for (int i_602_ = -i_461_; i_602_ < 0; i_602_++) {
						int i_603_ = ((i_468_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_604_ = -i_460_; i_604_ < 0; i_604_++) {
							if (!bool_457_ || f < fs[i_475_]) {
								int i_605_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_467_ >> 16) + i_603_]);
								if (i_605_ != 0) {
									if (bool) {
										i_599_ = ((i_605_ & 0xff00ff) * i_597_ & ~0xff00ff);
										i_600_ = ((i_605_ & 0xff00) * i_597_ & 0xff0000);
										i_605_ = (((i_599_ | i_600_) >>> 8) + i_463_);
										int i_606_ = is[i_475_];
										int i_607_ = i_605_ + i_606_;
										int i_608_ = ((i_605_ & 0xff00ff) + (i_606_ & 0xff00ff));
										i_606_ = ((i_608_ & 0x1000100) + (i_607_ - i_608_ & 0x10000));
										is[i_475_] = (i_607_ - i_606_ | i_606_ - (i_606_ >>> 8));
									}
									if (bool_457_ && bool_466_)
										fs[i_475_] = f;
								}
							}
							i_467_ += i_471_;
							i_475_++;
						}
						i_468_ += i_472_;
						i_467_ = i_601_;
						i_475_ += i_476_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method14245(int i, int i_609_) {
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					int i_610_ = anInt8864;
					while (i_610_ < 0) {
						int i_611_ = anInt8870;
						int i_612_ = anInt8873;
						int i_613_ = anInt8874;
						int i_614_ = anInt8862;
						if (i_612_ >= 0 && i_613_ >= 0 && i_612_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) < 0 && i_613_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) < 0) {
							for (/**/; i_614_ < 0; i_614_++) {
								int i_615_ = ((i_613_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851 + (i_612_ >> 12));
								int i_616_ = i_611_++;
								if (i_609_ == 0) {
									if (i == 1)
										is[i_616_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_615_]);
									else if (i == 0) {
										int i_617_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_615_++]);
										int i_618_ = ((i_617_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_619_ = ((i_617_ & 0xff00) * anInt8852 & 0xff0000);
										int i_620_ = ((i_617_ & 0xff) * anInt8882 & 0xff00);
										is[i_616_] = (i_618_ | i_619_ | i_620_) >>> 8;
									} else if (i == 3) {
										int i_621_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_615_++]);
										int i_622_ = anInt8877;
										int i_623_ = i_621_ + i_622_;
										int i_624_ = ((i_621_ & 0xff00ff) + (i_622_ & 0xff00ff));
										int i_625_ = ((i_624_ & 0x1000100) + (i_623_ - i_624_ & 0x10000));
										is[i_616_] = (i_623_ - i_625_ | i_625_ - (i_625_ >>> 8));
									} else if (i == 2) {
										int i_626_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_615_]);
										int i_627_ = ((i_626_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_628_ = ((i_626_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_616_] = (((i_627_ | i_628_) >>> 8) + anInt8885);
									} else
										throw new IllegalArgumentException();
								} else if (i_609_ == 1) {
									if (i == 1) {
										int i_629_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_615_]);
										int i_630_ = i_629_ >>> 24;
										int i_631_ = 256 - i_630_;
										int i_632_ = is[i_616_];
										is[i_616_] = ((((i_629_ & 0xff00ff) * i_630_ + ((i_632_ & 0xff00ff) * i_631_)) & ~0xff00ff) + (((i_629_ & 0xff00) * i_630_ + ((i_632_ & 0xff00) * i_631_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_633_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_615_]);
										int i_634_ = (i_633_ >>> 24) * anInt8878 >> 8;
										int i_635_ = 256 - i_634_;
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_636_ = is[i_616_];
											is[i_616_] = (((((i_633_ & 0xff00ff) * i_634_) + ((i_636_ & 0xff00ff) * i_635_)) & ~0xff00ff) + ((((i_633_ & 0xff00) * i_634_) + ((i_636_ & 0xff00) * i_635_)) & 0xff0000)) >> 8;
										} else if (i_634_ != 255) {
											int i_637_ = (((i_633_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_638_ = (((i_633_ & 0xff00) * anInt8852) & 0xff0000);
											int i_639_ = ((i_633_ & 0xff) * anInt8882 & 0xff00);
											i_633_ = (i_637_ | i_638_ | i_639_) >>> 8;
											int i_640_ = is[i_616_];
											is[i_616_] = (((((i_633_ & 0xff00ff) * i_634_) + ((i_640_ & 0xff00ff) * i_635_)) & ~0xff00ff) + ((((i_633_ & 0xff00) * i_634_) + ((i_640_ & 0xff00) * i_635_)) & 0xff0000)) >> 8;
										} else {
											int i_641_ = (((i_633_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_642_ = (((i_633_ & 0xff00) * anInt8852) & 0xff0000);
											int i_643_ = ((i_633_ & 0xff) * anInt8882 & 0xff00);
											is[i_616_] = (i_641_ | i_642_ | i_643_) >>> 8;
										}
									} else if (i == 3) {
										int i_644_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_615_]);
										int i_645_ = anInt8877;
										int i_646_ = i_644_ + i_645_;
										int i_647_ = ((i_644_ & 0xff00ff) + (i_645_ & 0xff00ff));
										int i_648_ = ((i_647_ & 0x1000100) + (i_646_ - i_647_ & 0x10000));
										i_648_ = (i_646_ - i_648_ | i_648_ - (i_648_ >>> 8));
										int i_649_ = (i_644_ >>> 24) * anInt8878 >> 8;
										int i_650_ = 256 - i_649_;
										if (i_649_ != 255) {
											i_644_ = i_648_;
											i_648_ = is[i_616_];
											i_648_ = (((((i_644_ & 0xff00ff) * i_649_) + ((i_648_ & 0xff00ff) * i_650_)) & ~0xff00ff) + ((((i_644_ & 0xff00) * i_649_) + ((i_648_ & 0xff00) * i_650_)) & 0xff0000)) >> 8;
										}
										is[i_616_] = i_648_;
									} else if (i == 2) {
										int i_651_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_615_]);
										int i_652_ = i_651_ >>> 24;
										int i_653_ = 256 - i_652_;
										int i_654_ = ((i_651_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_655_ = ((i_651_ & 0xff00) * anInt8878 & 0xff0000);
										i_651_ = (((i_654_ | i_655_) >>> 8) + anInt8885);
										int i_656_ = is[i_616_];
										is[i_616_] = ((((i_651_ & 0xff00ff) * i_652_ + ((i_656_ & 0xff00ff) * i_653_)) & ~0xff00ff) + (((i_651_ & 0xff00) * i_652_ + ((i_656_ & 0xff00) * i_653_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_609_ == 2) {
									if (i == 1) {
										int i_657_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_615_]);
										int i_658_ = is[i_616_];
										int i_659_ = i_657_ + i_658_;
										int i_660_ = ((i_657_ & 0xff00ff) + (i_658_ & 0xff00ff));
										i_658_ = ((i_660_ & 0x1000100) + (i_659_ - i_660_ & 0x10000));
										is[i_616_] = (i_659_ - i_658_ | i_658_ - (i_658_ >>> 8));
									} else if (i == 0) {
										int i_661_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_615_]);
										int i_662_ = ((i_661_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_663_ = ((i_661_ & 0xff00) * anInt8852 & 0xff0000);
										int i_664_ = ((i_661_ & 0xff) * anInt8882 & 0xff00);
										i_661_ = (i_662_ | i_663_ | i_664_) >>> 8;
										int i_665_ = is[i_616_];
										int i_666_ = i_661_ + i_665_;
										int i_667_ = ((i_661_ & 0xff00ff) + (i_665_ & 0xff00ff));
										i_665_ = ((i_667_ & 0x1000100) + (i_666_ - i_667_ & 0x10000));
										is[i_616_] = (i_666_ - i_665_ | i_665_ - (i_665_ >>> 8));
									} else if (i == 3) {
										int i_668_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_615_]);
										int i_669_ = anInt8877;
										int i_670_ = i_668_ + i_669_;
										int i_671_ = ((i_668_ & 0xff00ff) + (i_669_ & 0xff00ff));
										int i_672_ = ((i_671_ & 0x1000100) + (i_670_ - i_671_ & 0x10000));
										i_668_ = (i_670_ - i_672_ | i_672_ - (i_672_ >>> 8));
										i_672_ = is[i_616_];
										i_670_ = i_668_ + i_672_;
										i_671_ = ((i_668_ & 0xff00ff) + (i_672_ & 0xff00ff));
										i_672_ = ((i_671_ & 0x1000100) + (i_670_ - i_671_ & 0x10000));
										is[i_616_] = (i_670_ - i_672_ | i_672_ - (i_672_ >>> 8));
									} else if (i == 2) {
										int i_673_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_615_]);
										int i_674_ = ((i_673_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_675_ = ((i_673_ & 0xff00) * anInt8878 & 0xff0000);
										i_673_ = (((i_674_ | i_675_) >>> 8) + anInt8885);
										int i_676_ = is[i_616_];
										int i_677_ = i_673_ + i_676_;
										int i_678_ = ((i_673_ & 0xff00ff) + (i_676_ & 0xff00ff));
										i_676_ = ((i_678_ & 0x1000100) + (i_677_ - i_678_ & 0x10000));
										is[i_616_] = (i_677_ - i_676_ | i_676_ - (i_676_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_610_++;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_679_ = anInt8864;
					while (i_679_ < 0) {
						int i_680_ = anInt8870;
						int i_681_ = anInt8873;
						int i_682_ = anInt8874 + anInt8866;
						int i_683_ = anInt8862;
						if (i_681_ >= 0 && i_681_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) < 0) {
							int i_684_;
							if ((i_684_ = (i_682_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12))) >= 0) {
								i_684_ = (anInt8868 - i_684_) / anInt8868;
								i_683_ += i_684_;
								i_682_ += anInt8868 * i_684_;
								i_680_ += i_684_;
							}
							if ((i_684_ = (i_682_ - anInt8868) / anInt8868) > i_683_)
								i_683_ = i_684_;
							for (/**/; i_683_ < 0; i_683_++) {
								int i_685_ = ((i_682_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851 + (i_681_ >> 12));
								int i_686_ = i_680_++;
								if (i_609_ == 0) {
									if (i == 1)
										is[i_686_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_685_]);
									else if (i == 0) {
										int i_687_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_685_++]);
										int i_688_ = ((i_687_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_689_ = ((i_687_ & 0xff00) * anInt8852 & 0xff0000);
										int i_690_ = ((i_687_ & 0xff) * anInt8882 & 0xff00);
										is[i_686_] = (i_688_ | i_689_ | i_690_) >>> 8;
									} else if (i == 3) {
										int i_691_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_685_++]);
										int i_692_ = anInt8877;
										int i_693_ = i_691_ + i_692_;
										int i_694_ = ((i_691_ & 0xff00ff) + (i_692_ & 0xff00ff));
										int i_695_ = ((i_694_ & 0x1000100) + (i_693_ - i_694_ & 0x10000));
										is[i_686_] = (i_693_ - i_695_ | i_695_ - (i_695_ >>> 8));
									} else if (i == 2) {
										int i_696_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_685_]);
										int i_697_ = ((i_696_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_698_ = ((i_696_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_686_] = (((i_697_ | i_698_) >>> 8) + anInt8885);
									} else
										throw new IllegalArgumentException();
								} else if (i_609_ == 1) {
									if (i == 1) {
										int i_699_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_685_]);
										int i_700_ = i_699_ >>> 24;
										int i_701_ = 256 - i_700_;
										int i_702_ = is[i_686_];
										is[i_686_] = ((((i_699_ & 0xff00ff) * i_700_ + ((i_702_ & 0xff00ff) * i_701_)) & ~0xff00ff) + (((i_699_ & 0xff00) * i_700_ + ((i_702_ & 0xff00) * i_701_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_703_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_685_]);
										int i_704_ = (i_703_ >>> 24) * anInt8878 >> 8;
										int i_705_ = 256 - i_704_;
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_706_ = is[i_686_];
											is[i_686_] = (((((i_703_ & 0xff00ff) * i_704_) + ((i_706_ & 0xff00ff) * i_705_)) & ~0xff00ff) + ((((i_703_ & 0xff00) * i_704_) + ((i_706_ & 0xff00) * i_705_)) & 0xff0000)) >> 8;
										} else if (i_704_ != 255) {
											int i_707_ = (((i_703_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_708_ = (((i_703_ & 0xff00) * anInt8852) & 0xff0000);
											int i_709_ = ((i_703_ & 0xff) * anInt8882 & 0xff00);
											i_703_ = (i_707_ | i_708_ | i_709_) >>> 8;
											int i_710_ = is[i_686_];
											is[i_686_] = (((((i_703_ & 0xff00ff) * i_704_) + ((i_710_ & 0xff00ff) * i_705_)) & ~0xff00ff) + ((((i_703_ & 0xff00) * i_704_) + ((i_710_ & 0xff00) * i_705_)) & 0xff0000)) >> 8;
										} else {
											int i_711_ = (((i_703_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_712_ = (((i_703_ & 0xff00) * anInt8852) & 0xff0000);
											int i_713_ = ((i_703_ & 0xff) * anInt8882 & 0xff00);
											is[i_686_] = (i_711_ | i_712_ | i_713_) >>> 8;
										}
									} else if (i == 3) {
										int i_714_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_685_]);
										int i_715_ = anInt8877;
										int i_716_ = i_714_ + i_715_;
										int i_717_ = ((i_714_ & 0xff00ff) + (i_715_ & 0xff00ff));
										int i_718_ = ((i_717_ & 0x1000100) + (i_716_ - i_717_ & 0x10000));
										i_718_ = (i_716_ - i_718_ | i_718_ - (i_718_ >>> 8));
										int i_719_ = (i_714_ >>> 24) * anInt8878 >> 8;
										int i_720_ = 256 - i_719_;
										if (i_719_ != 255) {
											i_714_ = i_718_;
											i_718_ = is[i_686_];
											i_718_ = (((((i_714_ & 0xff00ff) * i_719_) + ((i_718_ & 0xff00ff) * i_720_)) & ~0xff00ff) + ((((i_714_ & 0xff00) * i_719_) + ((i_718_ & 0xff00) * i_720_)) & 0xff0000)) >> 8;
										}
										is[i_686_] = i_718_;
									} else if (i == 2) {
										int i_721_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_685_]);
										int i_722_ = i_721_ >>> 24;
										int i_723_ = 256 - i_722_;
										int i_724_ = ((i_721_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_725_ = ((i_721_ & 0xff00) * anInt8878 & 0xff0000);
										i_721_ = (((i_724_ | i_725_) >>> 8) + anInt8885);
										int i_726_ = is[i_686_];
										is[i_686_] = ((((i_721_ & 0xff00ff) * i_722_ + ((i_726_ & 0xff00ff) * i_723_)) & ~0xff00ff) + (((i_721_ & 0xff00) * i_722_ + ((i_726_ & 0xff00) * i_723_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_609_ == 2) {
									if (i == 1) {
										int i_727_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_685_]);
										int i_728_ = is[i_686_];
										int i_729_ = i_727_ + i_728_;
										int i_730_ = ((i_727_ & 0xff00ff) + (i_728_ & 0xff00ff));
										i_728_ = ((i_730_ & 0x1000100) + (i_729_ - i_730_ & 0x10000));
										is[i_686_] = (i_729_ - i_728_ | i_728_ - (i_728_ >>> 8));
									} else if (i == 0) {
										int i_731_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_685_]);
										int i_732_ = ((i_731_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_733_ = ((i_731_ & 0xff00) * anInt8852 & 0xff0000);
										int i_734_ = ((i_731_ & 0xff) * anInt8882 & 0xff00);
										i_731_ = (i_732_ | i_733_ | i_734_) >>> 8;
										int i_735_ = is[i_686_];
										int i_736_ = i_731_ + i_735_;
										int i_737_ = ((i_731_ & 0xff00ff) + (i_735_ & 0xff00ff));
										i_735_ = ((i_737_ & 0x1000100) + (i_736_ - i_737_ & 0x10000));
										is[i_686_] = (i_736_ - i_735_ | i_735_ - (i_735_ >>> 8));
									} else if (i == 3) {
										int i_738_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_685_]);
										int i_739_ = anInt8877;
										int i_740_ = i_738_ + i_739_;
										int i_741_ = ((i_738_ & 0xff00ff) + (i_739_ & 0xff00ff));
										int i_742_ = ((i_741_ & 0x1000100) + (i_740_ - i_741_ & 0x10000));
										i_738_ = (i_740_ - i_742_ | i_742_ - (i_742_ >>> 8));
										i_742_ = is[i_686_];
										i_740_ = i_738_ + i_742_;
										i_741_ = ((i_738_ & 0xff00ff) + (i_742_ & 0xff00ff));
										i_742_ = ((i_741_ & 0x1000100) + (i_740_ - i_741_ & 0x10000));
										is[i_686_] = (i_740_ - i_742_ | i_742_ - (i_742_ >>> 8));
									} else if (i == 2) {
										int i_743_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_685_]);
										int i_744_ = ((i_743_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_745_ = ((i_743_ & 0xff00) * anInt8878 & 0xff0000);
										i_743_ = (((i_744_ | i_745_) >>> 8) + anInt8885);
										int i_746_ = is[i_686_];
										int i_747_ = i_743_ + i_746_;
										int i_748_ = ((i_743_ & 0xff00ff) + (i_746_ & 0xff00ff));
										i_746_ = ((i_748_ & 0x1000100) + (i_747_ - i_748_ & 0x10000));
										is[i_686_] = (i_747_ - i_746_ | i_746_ - (i_746_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_682_ += anInt8868;
							}
						}
						i_679_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				} else {
					int i_749_ = anInt8864;
					while (i_749_ < 0) {
						int i_750_ = anInt8870;
						int i_751_ = anInt8873;
						int i_752_ = anInt8874 + anInt8866;
						int i_753_ = anInt8862;
						if (i_751_ >= 0 && i_751_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) < 0) {
							if (i_752_ < 0) {
								int i_754_ = (anInt8868 - 1 - i_752_) / anInt8868;
								i_753_ += i_754_;
								i_752_ += anInt8868 * i_754_;
								i_750_ += i_754_;
							}
							int i_755_;
							if ((i_755_ = (1 + i_752_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_753_)
								i_753_ = i_755_;
							for (/**/; i_753_ < 0; i_753_++) {
								int i_756_ = ((i_752_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851 + (i_751_ >> 12));
								int i_757_ = i_750_++;
								if (i_609_ == 0) {
									if (i == 1)
										is[i_757_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_756_]);
									else if (i == 0) {
										int i_758_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_756_++]);
										int i_759_ = ((i_758_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_760_ = ((i_758_ & 0xff00) * anInt8852 & 0xff0000);
										int i_761_ = ((i_758_ & 0xff) * anInt8882 & 0xff00);
										is[i_757_] = (i_759_ | i_760_ | i_761_) >>> 8;
									} else if (i == 3) {
										int i_762_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_756_++]);
										int i_763_ = anInt8877;
										int i_764_ = i_762_ + i_763_;
										int i_765_ = ((i_762_ & 0xff00ff) + (i_763_ & 0xff00ff));
										int i_766_ = ((i_765_ & 0x1000100) + (i_764_ - i_765_ & 0x10000));
										is[i_757_] = (i_764_ - i_766_ | i_766_ - (i_766_ >>> 8));
									} else if (i == 2) {
										int i_767_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_756_]);
										int i_768_ = ((i_767_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_769_ = ((i_767_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_757_] = (((i_768_ | i_769_) >>> 8) + anInt8885);
									} else
										throw new IllegalArgumentException();
								} else if (i_609_ == 1) {
									if (i == 1) {
										int i_770_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_756_]);
										int i_771_ = i_770_ >>> 24;
										int i_772_ = 256 - i_771_;
										int i_773_ = is[i_757_];
										is[i_757_] = ((((i_770_ & 0xff00ff) * i_771_ + ((i_773_ & 0xff00ff) * i_772_)) & ~0xff00ff) + (((i_770_ & 0xff00) * i_771_ + ((i_773_ & 0xff00) * i_772_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_774_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_756_]);
										int i_775_ = (i_774_ >>> 24) * anInt8878 >> 8;
										int i_776_ = 256 - i_775_;
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_777_ = is[i_757_];
											is[i_757_] = (((((i_774_ & 0xff00ff) * i_775_) + ((i_777_ & 0xff00ff) * i_776_)) & ~0xff00ff) + ((((i_774_ & 0xff00) * i_775_) + ((i_777_ & 0xff00) * i_776_)) & 0xff0000)) >> 8;
										} else if (i_775_ != 255) {
											int i_778_ = (((i_774_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_779_ = (((i_774_ & 0xff00) * anInt8852) & 0xff0000);
											int i_780_ = ((i_774_ & 0xff) * anInt8882 & 0xff00);
											i_774_ = (i_778_ | i_779_ | i_780_) >>> 8;
											int i_781_ = is[i_757_];
											is[i_757_] = (((((i_774_ & 0xff00ff) * i_775_) + ((i_781_ & 0xff00ff) * i_776_)) & ~0xff00ff) + ((((i_774_ & 0xff00) * i_775_) + ((i_781_ & 0xff00) * i_776_)) & 0xff0000)) >> 8;
										} else {
											int i_782_ = (((i_774_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_783_ = (((i_774_ & 0xff00) * anInt8852) & 0xff0000);
											int i_784_ = ((i_774_ & 0xff) * anInt8882 & 0xff00);
											is[i_757_] = (i_782_ | i_783_ | i_784_) >>> 8;
										}
									} else if (i == 3) {
										int i_785_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_756_]);
										int i_786_ = anInt8877;
										int i_787_ = i_785_ + i_786_;
										int i_788_ = ((i_785_ & 0xff00ff) + (i_786_ & 0xff00ff));
										int i_789_ = ((i_788_ & 0x1000100) + (i_787_ - i_788_ & 0x10000));
										i_789_ = (i_787_ - i_789_ | i_789_ - (i_789_ >>> 8));
										int i_790_ = (i_785_ >>> 24) * anInt8878 >> 8;
										int i_791_ = 256 - i_790_;
										if (i_790_ != 255) {
											i_785_ = i_789_;
											i_789_ = is[i_757_];
											i_789_ = (((((i_785_ & 0xff00ff) * i_790_) + ((i_789_ & 0xff00ff) * i_791_)) & ~0xff00ff) + ((((i_785_ & 0xff00) * i_790_) + ((i_789_ & 0xff00) * i_791_)) & 0xff0000)) >> 8;
										}
										is[i_757_] = i_789_;
									} else if (i == 2) {
										int i_792_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_756_]);
										int i_793_ = i_792_ >>> 24;
										int i_794_ = 256 - i_793_;
										int i_795_ = ((i_792_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_796_ = ((i_792_ & 0xff00) * anInt8878 & 0xff0000);
										i_792_ = (((i_795_ | i_796_) >>> 8) + anInt8885);
										int i_797_ = is[i_757_];
										is[i_757_] = ((((i_792_ & 0xff00ff) * i_793_ + ((i_797_ & 0xff00ff) * i_794_)) & ~0xff00ff) + (((i_792_ & 0xff00) * i_793_ + ((i_797_ & 0xff00) * i_794_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_609_ == 2) {
									if (i == 1) {
										int i_798_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_756_]);
										int i_799_ = is[i_757_];
										int i_800_ = i_798_ + i_799_;
										int i_801_ = ((i_798_ & 0xff00ff) + (i_799_ & 0xff00ff));
										i_799_ = ((i_801_ & 0x1000100) + (i_800_ - i_801_ & 0x10000));
										is[i_757_] = (i_800_ - i_799_ | i_799_ - (i_799_ >>> 8));
									} else if (i == 0) {
										int i_802_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_756_]);
										int i_803_ = ((i_802_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_804_ = ((i_802_ & 0xff00) * anInt8852 & 0xff0000);
										int i_805_ = ((i_802_ & 0xff) * anInt8882 & 0xff00);
										i_802_ = (i_803_ | i_804_ | i_805_) >>> 8;
										int i_806_ = is[i_757_];
										int i_807_ = i_802_ + i_806_;
										int i_808_ = ((i_802_ & 0xff00ff) + (i_806_ & 0xff00ff));
										i_806_ = ((i_808_ & 0x1000100) + (i_807_ - i_808_ & 0x10000));
										is[i_757_] = (i_807_ - i_806_ | i_806_ - (i_806_ >>> 8));
									} else if (i == 3) {
										int i_809_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_756_]);
										int i_810_ = anInt8877;
										int i_811_ = i_809_ + i_810_;
										int i_812_ = ((i_809_ & 0xff00ff) + (i_810_ & 0xff00ff));
										int i_813_ = ((i_812_ & 0x1000100) + (i_811_ - i_812_ & 0x10000));
										i_809_ = (i_811_ - i_813_ | i_813_ - (i_813_ >>> 8));
										i_813_ = is[i_757_];
										i_811_ = i_809_ + i_813_;
										i_812_ = ((i_809_ & 0xff00ff) + (i_813_ & 0xff00ff));
										i_813_ = ((i_812_ & 0x1000100) + (i_811_ - i_812_ & 0x10000));
										is[i_757_] = (i_811_ - i_813_ | i_813_ - (i_813_ >>> 8));
									} else if (i == 2) {
										int i_814_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_756_]);
										int i_815_ = ((i_814_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_816_ = ((i_814_ & 0xff00) * anInt8878 & 0xff0000);
										i_814_ = (((i_815_ | i_816_) >>> 8) + anInt8885);
										int i_817_ = is[i_757_];
										int i_818_ = i_814_ + i_817_;
										int i_819_ = ((i_814_ & 0xff00ff) + (i_817_ & 0xff00ff));
										i_817_ = ((i_819_ & 0x1000100) + (i_818_ - i_819_ & 0x10000));
										is[i_757_] = (i_818_ - i_817_ | i_817_ - (i_817_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_752_ += anInt8868;
							}
						}
						i_749_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					int i_820_ = anInt8864;
					while (i_820_ < 0) {
						int i_821_ = anInt8870;
						int i_822_ = anInt8873 + anInt8858;
						int i_823_ = anInt8874;
						int i_824_ = anInt8862;
						if (i_823_ >= 0 && i_823_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) < 0) {
							int i_825_;
							if ((i_825_ = (i_822_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12))) >= 0) {
								i_825_ = (anInt8865 - i_825_) / anInt8865;
								i_824_ += i_825_;
								i_822_ += anInt8865 * i_825_;
								i_821_ += i_825_;
							}
							if ((i_825_ = (i_822_ - anInt8865) / anInt8865) > i_824_)
								i_824_ = i_825_;
							for (/**/; i_824_ < 0; i_824_++) {
								int i_826_ = ((i_823_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851 + (i_822_ >> 12));
								int i_827_ = i_821_++;
								if (i_609_ == 0) {
									if (i == 1)
										is[i_827_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_826_]);
									else if (i == 0) {
										int i_828_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_826_++]);
										int i_829_ = ((i_828_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_830_ = ((i_828_ & 0xff00) * anInt8852 & 0xff0000);
										int i_831_ = ((i_828_ & 0xff) * anInt8882 & 0xff00);
										is[i_827_] = (i_829_ | i_830_ | i_831_) >>> 8;
									} else if (i == 3) {
										int i_832_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_826_++]);
										int i_833_ = anInt8877;
										int i_834_ = i_832_ + i_833_;
										int i_835_ = ((i_832_ & 0xff00ff) + (i_833_ & 0xff00ff));
										int i_836_ = ((i_835_ & 0x1000100) + (i_834_ - i_835_ & 0x10000));
										is[i_827_] = (i_834_ - i_836_ | i_836_ - (i_836_ >>> 8));
									} else if (i == 2) {
										int i_837_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_826_]);
										int i_838_ = ((i_837_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_839_ = ((i_837_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_827_] = (((i_838_ | i_839_) >>> 8) + anInt8885);
									} else
										throw new IllegalArgumentException();
								} else if (i_609_ == 1) {
									if (i == 1) {
										int i_840_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_826_]);
										int i_841_ = i_840_ >>> 24;
										int i_842_ = 256 - i_841_;
										int i_843_ = is[i_827_];
										is[i_827_] = ((((i_840_ & 0xff00ff) * i_841_ + ((i_843_ & 0xff00ff) * i_842_)) & ~0xff00ff) + (((i_840_ & 0xff00) * i_841_ + ((i_843_ & 0xff00) * i_842_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_844_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_826_]);
										int i_845_ = (i_844_ >>> 24) * anInt8878 >> 8;
										int i_846_ = 256 - i_845_;
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_847_ = is[i_827_];
											is[i_827_] = (((((i_844_ & 0xff00ff) * i_845_) + ((i_847_ & 0xff00ff) * i_846_)) & ~0xff00ff) + ((((i_844_ & 0xff00) * i_845_) + ((i_847_ & 0xff00) * i_846_)) & 0xff0000)) >> 8;
										} else if (i_845_ != 255) {
											int i_848_ = (((i_844_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_849_ = (((i_844_ & 0xff00) * anInt8852) & 0xff0000);
											int i_850_ = ((i_844_ & 0xff) * anInt8882 & 0xff00);
											i_844_ = (i_848_ | i_849_ | i_850_) >>> 8;
											int i_851_ = is[i_827_];
											is[i_827_] = (((((i_844_ & 0xff00ff) * i_845_) + ((i_851_ & 0xff00ff) * i_846_)) & ~0xff00ff) + ((((i_844_ & 0xff00) * i_845_) + ((i_851_ & 0xff00) * i_846_)) & 0xff0000)) >> 8;
										} else {
											int i_852_ = (((i_844_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_853_ = (((i_844_ & 0xff00) * anInt8852) & 0xff0000);
											int i_854_ = ((i_844_ & 0xff) * anInt8882 & 0xff00);
											is[i_827_] = (i_852_ | i_853_ | i_854_) >>> 8;
										}
									} else if (i == 3) {
										int i_855_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_826_]);
										int i_856_ = anInt8877;
										int i_857_ = i_855_ + i_856_;
										int i_858_ = ((i_855_ & 0xff00ff) + (i_856_ & 0xff00ff));
										int i_859_ = ((i_858_ & 0x1000100) + (i_857_ - i_858_ & 0x10000));
										i_859_ = (i_857_ - i_859_ | i_859_ - (i_859_ >>> 8));
										int i_860_ = (i_855_ >>> 24) * anInt8878 >> 8;
										int i_861_ = 256 - i_860_;
										if (i_860_ != 255) {
											i_855_ = i_859_;
											i_859_ = is[i_827_];
											i_859_ = (((((i_855_ & 0xff00ff) * i_860_) + ((i_859_ & 0xff00ff) * i_861_)) & ~0xff00ff) + ((((i_855_ & 0xff00) * i_860_) + ((i_859_ & 0xff00) * i_861_)) & 0xff0000)) >> 8;
										}
										is[i_827_] = i_859_;
									} else if (i == 2) {
										int i_862_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_826_]);
										int i_863_ = i_862_ >>> 24;
										int i_864_ = 256 - i_863_;
										int i_865_ = ((i_862_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_866_ = ((i_862_ & 0xff00) * anInt8878 & 0xff0000);
										i_862_ = (((i_865_ | i_866_) >>> 8) + anInt8885);
										int i_867_ = is[i_827_];
										is[i_827_] = ((((i_862_ & 0xff00ff) * i_863_ + ((i_867_ & 0xff00ff) * i_864_)) & ~0xff00ff) + (((i_862_ & 0xff00) * i_863_ + ((i_867_ & 0xff00) * i_864_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_609_ == 2) {
									if (i == 1) {
										int i_868_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_826_]);
										int i_869_ = is[i_827_];
										int i_870_ = i_868_ + i_869_;
										int i_871_ = ((i_868_ & 0xff00ff) + (i_869_ & 0xff00ff));
										i_869_ = ((i_871_ & 0x1000100) + (i_870_ - i_871_ & 0x10000));
										is[i_827_] = (i_870_ - i_869_ | i_869_ - (i_869_ >>> 8));
									} else if (i == 0) {
										int i_872_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_826_]);
										int i_873_ = ((i_872_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_874_ = ((i_872_ & 0xff00) * anInt8852 & 0xff0000);
										int i_875_ = ((i_872_ & 0xff) * anInt8882 & 0xff00);
										i_872_ = (i_873_ | i_874_ | i_875_) >>> 8;
										int i_876_ = is[i_827_];
										int i_877_ = i_872_ + i_876_;
										int i_878_ = ((i_872_ & 0xff00ff) + (i_876_ & 0xff00ff));
										i_876_ = ((i_878_ & 0x1000100) + (i_877_ - i_878_ & 0x10000));
										is[i_827_] = (i_877_ - i_876_ | i_876_ - (i_876_ >>> 8));
									} else if (i == 3) {
										int i_879_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_826_]);
										int i_880_ = anInt8877;
										int i_881_ = i_879_ + i_880_;
										int i_882_ = ((i_879_ & 0xff00ff) + (i_880_ & 0xff00ff));
										int i_883_ = ((i_882_ & 0x1000100) + (i_881_ - i_882_ & 0x10000));
										i_879_ = (i_881_ - i_883_ | i_883_ - (i_883_ >>> 8));
										i_883_ = is[i_827_];
										i_881_ = i_879_ + i_883_;
										i_882_ = ((i_879_ & 0xff00ff) + (i_883_ & 0xff00ff));
										i_883_ = ((i_882_ & 0x1000100) + (i_881_ - i_882_ & 0x10000));
										is[i_827_] = (i_881_ - i_883_ | i_883_ - (i_883_ >>> 8));
									} else if (i == 2) {
										int i_884_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_826_]);
										int i_885_ = ((i_884_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_886_ = ((i_884_ & 0xff00) * anInt8878 & 0xff0000);
										i_884_ = (((i_885_ | i_886_) >>> 8) + anInt8885);
										int i_887_ = is[i_827_];
										int i_888_ = i_884_ + i_887_;
										int i_889_ = ((i_884_ & 0xff00ff) + (i_887_ & 0xff00ff));
										i_887_ = ((i_889_ & 0x1000100) + (i_888_ - i_889_ & 0x10000));
										is[i_827_] = (i_888_ - i_887_ | i_887_ - (i_887_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_822_ += anInt8865;
							}
						}
						i_820_++;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_890_ = anInt8864;
					while (i_890_ < 0) {
						int i_891_ = anInt8870;
						int i_892_ = anInt8873 + anInt8858;
						int i_893_ = anInt8874 + anInt8866;
						int i_894_ = anInt8862;
						int i_895_;
						if ((i_895_ = i_892_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12)) >= 0) {
							i_895_ = (anInt8865 - i_895_) / anInt8865;
							i_894_ += i_895_;
							i_892_ += anInt8865 * i_895_;
							i_893_ += anInt8868 * i_895_;
							i_891_ += i_895_;
						}
						if ((i_895_ = (i_892_ - anInt8865) / anInt8865) > i_894_)
							i_894_ = i_895_;
						if ((i_895_ = i_893_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12)) >= 0) {
							i_895_ = (anInt8868 - i_895_) / anInt8868;
							i_894_ += i_895_;
							i_892_ += anInt8865 * i_895_;
							i_893_ += anInt8868 * i_895_;
							i_891_ += i_895_;
						}
						if ((i_895_ = (i_893_ - anInt8868) / anInt8868) > i_894_)
							i_894_ = i_895_;
						for (/**/; i_894_ < 0; i_894_++) {
							int i_896_ = (((i_893_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_892_ >> 12));
							int i_897_ = i_891_++;
							if (i_609_ == 0) {
								if (i == 1)
									is[i_897_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_896_]);
								else if (i == 0) {
									int i_898_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_896_++]);
									int i_899_ = ((i_898_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_900_ = ((i_898_ & 0xff00) * anInt8852 & 0xff0000);
									int i_901_ = (i_898_ & 0xff) * anInt8882 & 0xff00;
									is[i_897_] = (i_899_ | i_900_ | i_901_) >>> 8;
								} else if (i == 3) {
									int i_902_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_896_++]);
									int i_903_ = anInt8877;
									int i_904_ = i_902_ + i_903_;
									int i_905_ = ((i_902_ & 0xff00ff) + (i_903_ & 0xff00ff));
									int i_906_ = ((i_905_ & 0x1000100) + (i_904_ - i_905_ & 0x10000));
									is[i_897_] = i_904_ - i_906_ | i_906_ - (i_906_ >>> 8);
								} else if (i == 2) {
									int i_907_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_896_]);
									int i_908_ = ((i_907_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_909_ = ((i_907_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_897_] = (((i_908_ | i_909_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_609_ == 1) {
								if (i == 1) {
									int i_910_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_896_]);
									int i_911_ = i_910_ >>> 24;
									int i_912_ = 256 - i_911_;
									int i_913_ = is[i_897_];
									is[i_897_] = ((((i_910_ & 0xff00ff) * i_911_ + (i_913_ & 0xff00ff) * i_912_) & ~0xff00ff) + (((i_910_ & 0xff00) * i_911_ + (i_913_ & 0xff00) * i_912_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_914_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_896_]);
									int i_915_ = (i_914_ >>> 24) * anInt8878 >> 8;
									int i_916_ = 256 - i_915_;
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_917_ = is[i_897_];
										is[i_897_] = ((((i_914_ & 0xff00ff) * i_915_ + ((i_917_ & 0xff00ff) * i_916_)) & ~0xff00ff) + (((i_914_ & 0xff00) * i_915_ + ((i_917_ & 0xff00) * i_916_)) & 0xff0000)) >> 8;
									} else if (i_915_ != 255) {
										int i_918_ = ((i_914_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_919_ = ((i_914_ & 0xff00) * anInt8852 & 0xff0000);
										int i_920_ = ((i_914_ & 0xff) * anInt8882 & 0xff00);
										i_914_ = (i_918_ | i_919_ | i_920_) >>> 8;
										int i_921_ = is[i_897_];
										is[i_897_] = ((((i_914_ & 0xff00ff) * i_915_ + ((i_921_ & 0xff00ff) * i_916_)) & ~0xff00ff) + (((i_914_ & 0xff00) * i_915_ + ((i_921_ & 0xff00) * i_916_)) & 0xff0000)) >> 8;
									} else {
										int i_922_ = ((i_914_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_923_ = ((i_914_ & 0xff00) * anInt8852 & 0xff0000);
										int i_924_ = ((i_914_ & 0xff) * anInt8882 & 0xff00);
										is[i_897_] = (i_922_ | i_923_ | i_924_) >>> 8;
									}
								} else if (i == 3) {
									int i_925_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_896_]);
									int i_926_ = anInt8877;
									int i_927_ = i_925_ + i_926_;
									int i_928_ = ((i_925_ & 0xff00ff) + (i_926_ & 0xff00ff));
									int i_929_ = ((i_928_ & 0x1000100) + (i_927_ - i_928_ & 0x10000));
									i_929_ = i_927_ - i_929_ | i_929_ - (i_929_ >>> 8);
									int i_930_ = (i_925_ >>> 24) * anInt8878 >> 8;
									int i_931_ = 256 - i_930_;
									if (i_930_ != 255) {
										i_925_ = i_929_;
										i_929_ = is[i_897_];
										i_929_ = ((((i_925_ & 0xff00ff) * i_930_ + ((i_929_ & 0xff00ff) * i_931_)) & ~0xff00ff) + (((i_925_ & 0xff00) * i_930_ + ((i_929_ & 0xff00) * i_931_)) & 0xff0000)) >> 8;
									}
									is[i_897_] = i_929_;
								} else if (i == 2) {
									int i_932_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_896_]);
									int i_933_ = i_932_ >>> 24;
									int i_934_ = 256 - i_933_;
									int i_935_ = ((i_932_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_936_ = ((i_932_ & 0xff00) * anInt8878 & 0xff0000);
									i_932_ = (((i_935_ | i_936_) >>> 8) + anInt8885);
									int i_937_ = is[i_897_];
									is[i_897_] = ((((i_932_ & 0xff00ff) * i_933_ + (i_937_ & 0xff00ff) * i_934_) & ~0xff00ff) + (((i_932_ & 0xff00) * i_933_ + (i_937_ & 0xff00) * i_934_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_609_ == 2) {
								if (i == 1) {
									int i_938_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_896_]);
									int i_939_ = is[i_897_];
									int i_940_ = i_938_ + i_939_;
									int i_941_ = ((i_938_ & 0xff00ff) + (i_939_ & 0xff00ff));
									i_939_ = ((i_941_ & 0x1000100) + (i_940_ - i_941_ & 0x10000));
									is[i_897_] = i_940_ - i_939_ | i_939_ - (i_939_ >>> 8);
								} else if (i == 0) {
									int i_942_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_896_]);
									int i_943_ = ((i_942_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_944_ = ((i_942_ & 0xff00) * anInt8852 & 0xff0000);
									int i_945_ = (i_942_ & 0xff) * anInt8882 & 0xff00;
									i_942_ = (i_943_ | i_944_ | i_945_) >>> 8;
									int i_946_ = is[i_897_];
									int i_947_ = i_942_ + i_946_;
									int i_948_ = ((i_942_ & 0xff00ff) + (i_946_ & 0xff00ff));
									i_946_ = ((i_948_ & 0x1000100) + (i_947_ - i_948_ & 0x10000));
									is[i_897_] = i_947_ - i_946_ | i_946_ - (i_946_ >>> 8);
								} else if (i == 3) {
									int i_949_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_896_]);
									int i_950_ = anInt8877;
									int i_951_ = i_949_ + i_950_;
									int i_952_ = ((i_949_ & 0xff00ff) + (i_950_ & 0xff00ff));
									int i_953_ = ((i_952_ & 0x1000100) + (i_951_ - i_952_ & 0x10000));
									i_949_ = i_951_ - i_953_ | i_953_ - (i_953_ >>> 8);
									i_953_ = is[i_897_];
									i_951_ = i_949_ + i_953_;
									i_952_ = (i_949_ & 0xff00ff) + (i_953_ & 0xff00ff);
									i_953_ = ((i_952_ & 0x1000100) + (i_951_ - i_952_ & 0x10000));
									is[i_897_] = i_951_ - i_953_ | i_953_ - (i_953_ >>> 8);
								} else if (i == 2) {
									int i_954_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_896_]);
									int i_955_ = ((i_954_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_956_ = ((i_954_ & 0xff00) * anInt8878 & 0xff0000);
									i_954_ = (((i_955_ | i_956_) >>> 8) + anInt8885);
									int i_957_ = is[i_897_];
									int i_958_ = i_954_ + i_957_;
									int i_959_ = ((i_954_ & 0xff00ff) + (i_957_ & 0xff00ff));
									i_957_ = ((i_959_ & 0x1000100) + (i_958_ - i_959_ & 0x10000));
									is[i_897_] = i_958_ - i_957_ | i_957_ - (i_957_ >>> 8);
								}
							} else
								throw new IllegalArgumentException();
							i_892_ += anInt8865;
							i_893_ += anInt8868;
						}
						i_890_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else {
					int i_960_ = anInt8864;
					while (i_960_ < 0) {
						int i_961_ = anInt8870;
						int i_962_ = anInt8873 + anInt8858;
						int i_963_ = anInt8874 + anInt8866;
						int i_964_ = anInt8862;
						int i_965_;
						if ((i_965_ = i_962_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12)) >= 0) {
							i_965_ = (anInt8865 - i_965_) / anInt8865;
							i_964_ += i_965_;
							i_962_ += anInt8865 * i_965_;
							i_963_ += anInt8868 * i_965_;
							i_961_ += i_965_;
						}
						if ((i_965_ = (i_962_ - anInt8865) / anInt8865) > i_964_)
							i_964_ = i_965_;
						if (i_963_ < 0) {
							i_965_ = (anInt8868 - 1 - i_963_) / anInt8868;
							i_964_ += i_965_;
							i_962_ += anInt8865 * i_965_;
							i_963_ += anInt8868 * i_965_;
							i_961_ += i_965_;
						}
						if ((i_965_ = (1 + i_963_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_964_)
							i_964_ = i_965_;
						for (/**/; i_964_ < 0; i_964_++) {
							int i_966_ = (((i_963_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_962_ >> 12));
							int i_967_ = i_961_++;
							if (i_609_ == 0) {
								if (i == 1)
									is[i_967_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_966_]);
								else if (i == 0) {
									int i_968_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_966_++]);
									int i_969_ = ((i_968_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_970_ = ((i_968_ & 0xff00) * anInt8852 & 0xff0000);
									int i_971_ = (i_968_ & 0xff) * anInt8882 & 0xff00;
									is[i_967_] = (i_969_ | i_970_ | i_971_) >>> 8;
								} else if (i == 3) {
									int i_972_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_966_++]);
									int i_973_ = anInt8877;
									int i_974_ = i_972_ + i_973_;
									int i_975_ = ((i_972_ & 0xff00ff) + (i_973_ & 0xff00ff));
									int i_976_ = ((i_975_ & 0x1000100) + (i_974_ - i_975_ & 0x10000));
									is[i_967_] = i_974_ - i_976_ | i_976_ - (i_976_ >>> 8);
								} else if (i == 2) {
									int i_977_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_966_]);
									int i_978_ = ((i_977_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_979_ = ((i_977_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_967_] = (((i_978_ | i_979_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_609_ == 1) {
								if (i == 1) {
									int i_980_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_966_]);
									int i_981_ = i_980_ >>> 24;
									int i_982_ = 256 - i_981_;
									int i_983_ = is[i_967_];
									is[i_967_] = ((((i_980_ & 0xff00ff) * i_981_ + (i_983_ & 0xff00ff) * i_982_) & ~0xff00ff) + (((i_980_ & 0xff00) * i_981_ + (i_983_ & 0xff00) * i_982_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_984_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_966_]);
									int i_985_ = (i_984_ >>> 24) * anInt8878 >> 8;
									int i_986_ = 256 - i_985_;
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_987_ = is[i_967_];
										is[i_967_] = ((((i_984_ & 0xff00ff) * i_985_ + ((i_987_ & 0xff00ff) * i_986_)) & ~0xff00ff) + (((i_984_ & 0xff00) * i_985_ + ((i_987_ & 0xff00) * i_986_)) & 0xff0000)) >> 8;
									} else if (i_985_ != 255) {
										int i_988_ = ((i_984_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_989_ = ((i_984_ & 0xff00) * anInt8852 & 0xff0000);
										int i_990_ = ((i_984_ & 0xff) * anInt8882 & 0xff00);
										i_984_ = (i_988_ | i_989_ | i_990_) >>> 8;
										int i_991_ = is[i_967_];
										is[i_967_] = ((((i_984_ & 0xff00ff) * i_985_ + ((i_991_ & 0xff00ff) * i_986_)) & ~0xff00ff) + (((i_984_ & 0xff00) * i_985_ + ((i_991_ & 0xff00) * i_986_)) & 0xff0000)) >> 8;
									} else {
										int i_992_ = ((i_984_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_993_ = ((i_984_ & 0xff00) * anInt8852 & 0xff0000);
										int i_994_ = ((i_984_ & 0xff) * anInt8882 & 0xff00);
										is[i_967_] = (i_992_ | i_993_ | i_994_) >>> 8;
									}
								} else if (i == 3) {
									int i_995_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_966_]);
									int i_996_ = anInt8877;
									int i_997_ = i_995_ + i_996_;
									int i_998_ = ((i_995_ & 0xff00ff) + (i_996_ & 0xff00ff));
									int i_999_ = ((i_998_ & 0x1000100) + (i_997_ - i_998_ & 0x10000));
									i_999_ = i_997_ - i_999_ | i_999_ - (i_999_ >>> 8);
									int i_1000_ = (i_995_ >>> 24) * anInt8878 >> 8;
									int i_1001_ = 256 - i_1000_;
									if (i_1000_ != 255) {
										i_995_ = i_999_;
										i_999_ = is[i_967_];
										i_999_ = ((((i_995_ & 0xff00ff) * i_1000_ + ((i_999_ & 0xff00ff) * i_1001_)) & ~0xff00ff) + (((i_995_ & 0xff00) * i_1000_ + ((i_999_ & 0xff00) * i_1001_)) & 0xff0000)) >> 8;
									}
									is[i_967_] = i_999_;
								} else if (i == 2) {
									int i_1002_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_966_]);
									int i_1003_ = i_1002_ >>> 24;
									int i_1004_ = 256 - i_1003_;
									int i_1005_ = ((i_1002_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1006_ = ((i_1002_ & 0xff00) * anInt8878 & 0xff0000);
									i_1002_ = (((i_1005_ | i_1006_) >>> 8) + anInt8885);
									int i_1007_ = is[i_967_];
									is[i_967_] = ((((i_1002_ & 0xff00ff) * i_1003_ + (i_1007_ & 0xff00ff) * i_1004_) & ~0xff00ff) + (((i_1002_ & 0xff00) * i_1003_ + (i_1007_ & 0xff00) * i_1004_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_609_ == 2) {
								if (i == 1) {
									int i_1008_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_966_]);
									int i_1009_ = is[i_967_];
									int i_1010_ = i_1008_ + i_1009_;
									int i_1011_ = ((i_1008_ & 0xff00ff) + (i_1009_ & 0xff00ff));
									i_1009_ = ((i_1011_ & 0x1000100) + (i_1010_ - i_1011_ & 0x10000));
									is[i_967_] = (i_1010_ - i_1009_ | i_1009_ - (i_1009_ >>> 8));
								} else if (i == 0) {
									int i_1012_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_966_]);
									int i_1013_ = ((i_1012_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1014_ = ((i_1012_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1015_ = ((i_1012_ & 0xff) * anInt8882 & 0xff00);
									i_1012_ = (i_1013_ | i_1014_ | i_1015_) >>> 8;
									int i_1016_ = is[i_967_];
									int i_1017_ = i_1012_ + i_1016_;
									int i_1018_ = ((i_1012_ & 0xff00ff) + (i_1016_ & 0xff00ff));
									i_1016_ = ((i_1018_ & 0x1000100) + (i_1017_ - i_1018_ & 0x10000));
									is[i_967_] = (i_1017_ - i_1016_ | i_1016_ - (i_1016_ >>> 8));
								} else if (i == 3) {
									int i_1019_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_966_]);
									int i_1020_ = anInt8877;
									int i_1021_ = i_1019_ + i_1020_;
									int i_1022_ = ((i_1019_ & 0xff00ff) + (i_1020_ & 0xff00ff));
									int i_1023_ = ((i_1022_ & 0x1000100) + (i_1021_ - i_1022_ & 0x10000));
									i_1019_ = (i_1021_ - i_1023_ | i_1023_ - (i_1023_ >>> 8));
									i_1023_ = is[i_967_];
									i_1021_ = i_1019_ + i_1023_;
									i_1022_ = (i_1019_ & 0xff00ff) + (i_1023_ & 0xff00ff);
									i_1023_ = ((i_1022_ & 0x1000100) + (i_1021_ - i_1022_ & 0x10000));
									is[i_967_] = (i_1021_ - i_1023_ | i_1023_ - (i_1023_ >>> 8));
								} else if (i == 2) {
									int i_1024_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_966_]);
									int i_1025_ = ((i_1024_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1026_ = ((i_1024_ & 0xff00) * anInt8878 & 0xff0000);
									i_1024_ = (((i_1025_ | i_1026_) >>> 8) + anInt8885);
									int i_1027_ = is[i_967_];
									int i_1028_ = i_1024_ + i_1027_;
									int i_1029_ = ((i_1024_ & 0xff00ff) + (i_1027_ & 0xff00ff));
									i_1027_ = ((i_1029_ & 0x1000100) + (i_1028_ - i_1029_ & 0x10000));
									is[i_967_] = (i_1028_ - i_1027_ | i_1027_ - (i_1027_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_962_ += anInt8865;
							i_963_ += anInt8868;
						}
						i_960_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8868 == 0) {
				int i_1030_ = anInt8864;
				while (i_1030_ < 0) {
					int i_1031_ = anInt8870;
					int i_1032_ = anInt8873 + anInt8858;
					int i_1033_ = anInt8874;
					int i_1034_ = anInt8862;
					if (i_1033_ >= 0 && i_1033_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) < 0) {
						if (i_1032_ < 0) {
							int i_1035_ = (anInt8865 - 1 - i_1032_) / anInt8865;
							i_1034_ += i_1035_;
							i_1032_ += anInt8865 * i_1035_;
							i_1031_ += i_1035_;
						}
						int i_1036_;
						if ((i_1036_ = (1 + i_1032_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1034_)
							i_1034_ = i_1036_;
						for (/**/; i_1034_ < 0; i_1034_++) {
							int i_1037_ = (((i_1033_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_1032_ >> 12));
							int i_1038_ = i_1031_++;
							if (i_609_ == 0) {
								if (i == 1)
									is[i_1038_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1037_]);
								else if (i == 0) {
									int i_1039_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1037_++]);
									int i_1040_ = ((i_1039_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1041_ = ((i_1039_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1042_ = ((i_1039_ & 0xff) * anInt8882 & 0xff00);
									is[i_1038_] = (i_1040_ | i_1041_ | i_1042_) >>> 8;
								} else if (i == 3) {
									int i_1043_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1037_++]);
									int i_1044_ = anInt8877;
									int i_1045_ = i_1043_ + i_1044_;
									int i_1046_ = ((i_1043_ & 0xff00ff) + (i_1044_ & 0xff00ff));
									int i_1047_ = ((i_1046_ & 0x1000100) + (i_1045_ - i_1046_ & 0x10000));
									is[i_1038_] = (i_1045_ - i_1047_ | i_1047_ - (i_1047_ >>> 8));
								} else if (i == 2) {
									int i_1048_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1037_]);
									int i_1049_ = ((i_1048_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1050_ = ((i_1048_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_1038_] = (((i_1049_ | i_1050_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_609_ == 1) {
								if (i == 1) {
									int i_1051_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1037_]);
									int i_1052_ = i_1051_ >>> 24;
									int i_1053_ = 256 - i_1052_;
									int i_1054_ = is[i_1038_];
									is[i_1038_] = ((((i_1051_ & 0xff00ff) * i_1052_ + (i_1054_ & 0xff00ff) * i_1053_) & ~0xff00ff) + (((i_1051_ & 0xff00) * i_1052_ + (i_1054_ & 0xff00) * i_1053_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_1055_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1037_]);
									int i_1056_ = (i_1055_ >>> 24) * anInt8878 >> 8;
									int i_1057_ = 256 - i_1056_;
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_1058_ = is[i_1038_];
										is[i_1038_] = ((((i_1055_ & 0xff00ff) * i_1056_ + ((i_1058_ & 0xff00ff) * i_1057_)) & ~0xff00ff) + (((i_1055_ & 0xff00) * i_1056_ + ((i_1058_ & 0xff00) * i_1057_)) & 0xff0000)) >> 8;
									} else if (i_1056_ != 255) {
										int i_1059_ = ((i_1055_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1060_ = ((i_1055_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1061_ = ((i_1055_ & 0xff) * anInt8882 & 0xff00);
										i_1055_ = (i_1059_ | i_1060_ | i_1061_) >>> 8;
										int i_1062_ = is[i_1038_];
										is[i_1038_] = ((((i_1055_ & 0xff00ff) * i_1056_ + ((i_1062_ & 0xff00ff) * i_1057_)) & ~0xff00ff) + (((i_1055_ & 0xff00) * i_1056_ + ((i_1062_ & 0xff00) * i_1057_)) & 0xff0000)) >> 8;
									} else {
										int i_1063_ = ((i_1055_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1064_ = ((i_1055_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1065_ = ((i_1055_ & 0xff) * anInt8882 & 0xff00);
										is[i_1038_] = (i_1063_ | i_1064_ | i_1065_) >>> 8;
									}
								} else if (i == 3) {
									int i_1066_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1037_]);
									int i_1067_ = anInt8877;
									int i_1068_ = i_1066_ + i_1067_;
									int i_1069_ = ((i_1066_ & 0xff00ff) + (i_1067_ & 0xff00ff));
									int i_1070_ = ((i_1069_ & 0x1000100) + (i_1068_ - i_1069_ & 0x10000));
									i_1070_ = (i_1068_ - i_1070_ | i_1070_ - (i_1070_ >>> 8));
									int i_1071_ = (i_1066_ >>> 24) * anInt8878 >> 8;
									int i_1072_ = 256 - i_1071_;
									if (i_1071_ != 255) {
										i_1066_ = i_1070_;
										i_1070_ = is[i_1038_];
										i_1070_ = ((((i_1066_ & 0xff00ff) * i_1071_ + ((i_1070_ & 0xff00ff) * i_1072_)) & ~0xff00ff) + (((i_1066_ & 0xff00) * i_1071_ + ((i_1070_ & 0xff00) * i_1072_)) & 0xff0000)) >> 8;
									}
									is[i_1038_] = i_1070_;
								} else if (i == 2) {
									int i_1073_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1037_]);
									int i_1074_ = i_1073_ >>> 24;
									int i_1075_ = 256 - i_1074_;
									int i_1076_ = ((i_1073_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1077_ = ((i_1073_ & 0xff00) * anInt8878 & 0xff0000);
									i_1073_ = (((i_1076_ | i_1077_) >>> 8) + anInt8885);
									int i_1078_ = is[i_1038_];
									is[i_1038_] = ((((i_1073_ & 0xff00ff) * i_1074_ + (i_1078_ & 0xff00ff) * i_1075_) & ~0xff00ff) + (((i_1073_ & 0xff00) * i_1074_ + (i_1078_ & 0xff00) * i_1075_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_609_ == 2) {
								if (i == 1) {
									int i_1079_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1037_]);
									int i_1080_ = is[i_1038_];
									int i_1081_ = i_1079_ + i_1080_;
									int i_1082_ = ((i_1079_ & 0xff00ff) + (i_1080_ & 0xff00ff));
									i_1080_ = ((i_1082_ & 0x1000100) + (i_1081_ - i_1082_ & 0x10000));
									is[i_1038_] = (i_1081_ - i_1080_ | i_1080_ - (i_1080_ >>> 8));
								} else if (i == 0) {
									int i_1083_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1037_]);
									int i_1084_ = ((i_1083_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1085_ = ((i_1083_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1086_ = ((i_1083_ & 0xff) * anInt8882 & 0xff00);
									i_1083_ = (i_1084_ | i_1085_ | i_1086_) >>> 8;
									int i_1087_ = is[i_1038_];
									int i_1088_ = i_1083_ + i_1087_;
									int i_1089_ = ((i_1083_ & 0xff00ff) + (i_1087_ & 0xff00ff));
									i_1087_ = ((i_1089_ & 0x1000100) + (i_1088_ - i_1089_ & 0x10000));
									is[i_1038_] = (i_1088_ - i_1087_ | i_1087_ - (i_1087_ >>> 8));
								} else if (i == 3) {
									int i_1090_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1037_]);
									int i_1091_ = anInt8877;
									int i_1092_ = i_1090_ + i_1091_;
									int i_1093_ = ((i_1090_ & 0xff00ff) + (i_1091_ & 0xff00ff));
									int i_1094_ = ((i_1093_ & 0x1000100) + (i_1092_ - i_1093_ & 0x10000));
									i_1090_ = (i_1092_ - i_1094_ | i_1094_ - (i_1094_ >>> 8));
									i_1094_ = is[i_1038_];
									i_1092_ = i_1090_ + i_1094_;
									i_1093_ = (i_1090_ & 0xff00ff) + (i_1094_ & 0xff00ff);
									i_1094_ = ((i_1093_ & 0x1000100) + (i_1092_ - i_1093_ & 0x10000));
									is[i_1038_] = (i_1092_ - i_1094_ | i_1094_ - (i_1094_ >>> 8));
								} else if (i == 2) {
									int i_1095_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1037_]);
									int i_1096_ = ((i_1095_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1097_ = ((i_1095_ & 0xff00) * anInt8878 & 0xff0000);
									i_1095_ = (((i_1096_ | i_1097_) >>> 8) + anInt8885);
									int i_1098_ = is[i_1038_];
									int i_1099_ = i_1095_ + i_1098_;
									int i_1100_ = ((i_1095_ & 0xff00ff) + (i_1098_ & 0xff00ff));
									i_1098_ = ((i_1100_ & 0x1000100) + (i_1099_ - i_1100_ & 0x10000));
									is[i_1038_] = (i_1099_ - i_1098_ | i_1098_ - (i_1098_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_1032_ += anInt8865;
						}
					}
					i_1030_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else if (anInt8868 < 0) {
				for (int i_1101_ = anInt8864; i_1101_ < 0; i_1101_++) {
					int i_1102_ = anInt8870;
					int i_1103_ = anInt8873 + anInt8858;
					int i_1104_ = anInt8874 + anInt8866;
					int i_1105_ = anInt8862;
					if (i_1103_ < 0) {
						int i_1106_ = (anInt8865 - 1 - i_1103_) / anInt8865;
						i_1105_ += i_1106_;
						i_1103_ += anInt8865 * i_1106_;
						i_1104_ += anInt8868 * i_1106_;
						i_1102_ += i_1106_;
					}
					int i_1107_;
					if ((i_1107_ = (1 + i_1103_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1105_)
						i_1105_ = i_1107_;
					if ((i_1107_ = i_1104_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12)) >= 0) {
						i_1107_ = (anInt8868 - i_1107_) / anInt8868;
						i_1105_ += i_1107_;
						i_1103_ += anInt8865 * i_1107_;
						i_1104_ += anInt8868 * i_1107_;
						i_1102_ += i_1107_;
					}
					if ((i_1107_ = (i_1104_ - anInt8868) / anInt8868) > i_1105_)
						i_1105_ = i_1107_;
					for (/**/; i_1105_ < 0; i_1105_++) {
						int i_1108_ = (((i_1104_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_1103_ >> 12));
						int i_1109_ = i_1102_++;
						if (i_609_ == 0) {
							if (i == 1)
								is[i_1109_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1108_]);
							else if (i == 0) {
								int i_1110_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1108_++]);
								int i_1111_ = ((i_1110_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_1112_ = ((i_1110_ & 0xff00) * anInt8852 & 0xff0000);
								int i_1113_ = (i_1110_ & 0xff) * anInt8882 & 0xff00;
								is[i_1109_] = (i_1111_ | i_1112_ | i_1113_) >>> 8;
							} else if (i == 3) {
								int i_1114_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1108_++]);
								int i_1115_ = anInt8877;
								int i_1116_ = i_1114_ + i_1115_;
								int i_1117_ = ((i_1114_ & 0xff00ff) + (i_1115_ & 0xff00ff));
								int i_1118_ = ((i_1117_ & 0x1000100) + (i_1116_ - i_1117_ & 0x10000));
								is[i_1109_] = i_1116_ - i_1118_ | i_1118_ - (i_1118_ >>> 8);
							} else if (i == 2) {
								int i_1119_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1108_]);
								int i_1120_ = ((i_1119_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_1121_ = ((i_1119_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_1109_] = ((i_1120_ | i_1121_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_609_ == 1) {
							if (i == 1) {
								int i_1122_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1108_]);
								int i_1123_ = i_1122_ >>> 24;
								int i_1124_ = 256 - i_1123_;
								int i_1125_ = is[i_1109_];
								is[i_1109_] = ((((i_1122_ & 0xff00ff) * i_1123_ + (i_1125_ & 0xff00ff) * i_1124_) & ~0xff00ff) + (((i_1122_ & 0xff00) * i_1123_ + (i_1125_ & 0xff00) * i_1124_) & 0xff0000)) >> 8;
							} else if (i == 0) {
								int i_1126_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1108_]);
								int i_1127_ = (i_1126_ >>> 24) * anInt8878 >> 8;
								int i_1128_ = 256 - i_1127_;
								if ((anInt8877 & 0xffffff) == 16777215) {
									int i_1129_ = is[i_1109_];
									is[i_1109_] = ((((i_1126_ & 0xff00ff) * i_1127_ + (i_1129_ & 0xff00ff) * i_1128_) & ~0xff00ff) + (((i_1126_ & 0xff00) * i_1127_ + (i_1129_ & 0xff00) * i_1128_) & 0xff0000)) >> 8;
								} else if (i_1127_ != 255) {
									int i_1130_ = ((i_1126_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1131_ = ((i_1126_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1132_ = ((i_1126_ & 0xff) * anInt8882 & 0xff00);
									i_1126_ = (i_1130_ | i_1131_ | i_1132_) >>> 8;
									int i_1133_ = is[i_1109_];
									is[i_1109_] = ((((i_1126_ & 0xff00ff) * i_1127_ + (i_1133_ & 0xff00ff) * i_1128_) & ~0xff00ff) + (((i_1126_ & 0xff00) * i_1127_ + (i_1133_ & 0xff00) * i_1128_) & 0xff0000)) >> 8;
								} else {
									int i_1134_ = ((i_1126_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1135_ = ((i_1126_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1136_ = ((i_1126_ & 0xff) * anInt8882 & 0xff00);
									is[i_1109_] = (i_1134_ | i_1135_ | i_1136_) >>> 8;
								}
							} else if (i == 3) {
								int i_1137_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1108_]);
								int i_1138_ = anInt8877;
								int i_1139_ = i_1137_ + i_1138_;
								int i_1140_ = ((i_1137_ & 0xff00ff) + (i_1138_ & 0xff00ff));
								int i_1141_ = ((i_1140_ & 0x1000100) + (i_1139_ - i_1140_ & 0x10000));
								i_1141_ = i_1139_ - i_1141_ | i_1141_ - (i_1141_ >>> 8);
								int i_1142_ = (i_1137_ >>> 24) * anInt8878 >> 8;
								int i_1143_ = 256 - i_1142_;
								if (i_1142_ != 255) {
									i_1137_ = i_1141_;
									i_1141_ = is[i_1109_];
									i_1141_ = ((((i_1137_ & 0xff00ff) * i_1142_ + (i_1141_ & 0xff00ff) * i_1143_) & ~0xff00ff) + (((i_1137_ & 0xff00) * i_1142_ + (i_1141_ & 0xff00) * i_1143_) & 0xff0000)) >> 8;
								}
								is[i_1109_] = i_1141_;
							} else if (i == 2) {
								int i_1144_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1108_]);
								int i_1145_ = i_1144_ >>> 24;
								int i_1146_ = 256 - i_1145_;
								int i_1147_ = ((i_1144_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_1148_ = ((i_1144_ & 0xff00) * anInt8878 & 0xff0000);
								i_1144_ = ((i_1147_ | i_1148_) >>> 8) + anInt8885;
								int i_1149_ = is[i_1109_];
								is[i_1109_] = ((((i_1144_ & 0xff00ff) * i_1145_ + (i_1149_ & 0xff00ff) * i_1146_) & ~0xff00ff) + (((i_1144_ & 0xff00) * i_1145_ + (i_1149_ & 0xff00) * i_1146_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_609_ == 2) {
							if (i == 1) {
								int i_1150_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1108_]);
								int i_1151_ = is[i_1109_];
								int i_1152_ = i_1150_ + i_1151_;
								int i_1153_ = ((i_1150_ & 0xff00ff) + (i_1151_ & 0xff00ff));
								i_1151_ = ((i_1153_ & 0x1000100) + (i_1152_ - i_1153_ & 0x10000));
								is[i_1109_] = i_1152_ - i_1151_ | i_1151_ - (i_1151_ >>> 8);
							} else if (i == 0) {
								int i_1154_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1108_]);
								int i_1155_ = ((i_1154_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_1156_ = ((i_1154_ & 0xff00) * anInt8852 & 0xff0000);
								int i_1157_ = (i_1154_ & 0xff) * anInt8882 & 0xff00;
								i_1154_ = (i_1155_ | i_1156_ | i_1157_) >>> 8;
								int i_1158_ = is[i_1109_];
								int i_1159_ = i_1154_ + i_1158_;
								int i_1160_ = ((i_1154_ & 0xff00ff) + (i_1158_ & 0xff00ff));
								i_1158_ = ((i_1160_ & 0x1000100) + (i_1159_ - i_1160_ & 0x10000));
								is[i_1109_] = i_1159_ - i_1158_ | i_1158_ - (i_1158_ >>> 8);
							} else if (i == 3) {
								int i_1161_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1108_]);
								int i_1162_ = anInt8877;
								int i_1163_ = i_1161_ + i_1162_;
								int i_1164_ = ((i_1161_ & 0xff00ff) + (i_1162_ & 0xff00ff));
								int i_1165_ = ((i_1164_ & 0x1000100) + (i_1163_ - i_1164_ & 0x10000));
								i_1161_ = i_1163_ - i_1165_ | i_1165_ - (i_1165_ >>> 8);
								i_1165_ = is[i_1109_];
								i_1163_ = i_1161_ + i_1165_;
								i_1164_ = (i_1161_ & 0xff00ff) + (i_1165_ & 0xff00ff);
								i_1165_ = ((i_1164_ & 0x1000100) + (i_1163_ - i_1164_ & 0x10000));
								is[i_1109_] = i_1163_ - i_1165_ | i_1165_ - (i_1165_ >>> 8);
							} else if (i == 2) {
								int i_1166_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1108_]);
								int i_1167_ = ((i_1166_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_1168_ = ((i_1166_ & 0xff00) * anInt8878 & 0xff0000);
								i_1166_ = ((i_1167_ | i_1168_) >>> 8) + anInt8885;
								int i_1169_ = is[i_1109_];
								int i_1170_ = i_1166_ + i_1169_;
								int i_1171_ = ((i_1166_ & 0xff00ff) + (i_1169_ & 0xff00ff));
								i_1169_ = ((i_1171_ & 0x1000100) + (i_1170_ - i_1171_ & 0x10000));
								is[i_1109_] = i_1170_ - i_1169_ | i_1169_ - (i_1169_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_1103_ += anInt8865;
						i_1104_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else {
				for (int i_1172_ = anInt8864; i_1172_ < 0; i_1172_++) {
					int i_1173_ = anInt8870;
					int i_1174_ = anInt8873 + anInt8858;
					int i_1175_ = anInt8874 + anInt8866;
					int i_1176_ = anInt8862;
					if (i_1174_ < 0) {
						int i_1177_ = (anInt8865 - 1 - i_1174_) / anInt8865;
						i_1176_ += i_1177_;
						i_1174_ += anInt8865 * i_1177_;
						i_1175_ += anInt8868 * i_1177_;
						i_1173_ += i_1177_;
					}
					int i_1178_;
					if ((i_1178_ = (1 + i_1174_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1176_)
						i_1176_ = i_1178_;
					if (i_1175_ < 0) {
						i_1178_ = (anInt8868 - 1 - i_1175_) / anInt8868;
						i_1176_ += i_1178_;
						i_1174_ += anInt8865 * i_1178_;
						i_1175_ += anInt8868 * i_1178_;
						i_1173_ += i_1178_;
					}
					if ((i_1178_ = (1 + i_1175_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_1176_)
						i_1176_ = i_1178_;
					for (/**/; i_1176_ < 0; i_1176_++) {
						int i_1179_ = (((i_1175_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_1174_ >> 12));
						int i_1180_ = i_1173_++;
						if (i_609_ == 0) {
							if (i == 1)
								is[i_1180_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1179_]);
							else if (i == 0) {
								int i_1181_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1179_++]);
								int i_1182_ = ((i_1181_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_1183_ = ((i_1181_ & 0xff00) * anInt8852 & 0xff0000);
								int i_1184_ = (i_1181_ & 0xff) * anInt8882 & 0xff00;
								is[i_1180_] = (i_1182_ | i_1183_ | i_1184_) >>> 8;
							} else if (i == 3) {
								int i_1185_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1179_++]);
								int i_1186_ = anInt8877;
								int i_1187_ = i_1185_ + i_1186_;
								int i_1188_ = ((i_1185_ & 0xff00ff) + (i_1186_ & 0xff00ff));
								int i_1189_ = ((i_1188_ & 0x1000100) + (i_1187_ - i_1188_ & 0x10000));
								is[i_1180_] = i_1187_ - i_1189_ | i_1189_ - (i_1189_ >>> 8);
							} else if (i == 2) {
								int i_1190_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1179_]);
								int i_1191_ = ((i_1190_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_1192_ = ((i_1190_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_1180_] = ((i_1191_ | i_1192_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_609_ == 1) {
							if (i == 1) {
								int i_1193_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1179_]);
								int i_1194_ = i_1193_ >>> 24;
								int i_1195_ = 256 - i_1194_;
								int i_1196_ = is[i_1180_];
								is[i_1180_] = ((((i_1193_ & 0xff00ff) * i_1194_ + (i_1196_ & 0xff00ff) * i_1195_) & ~0xff00ff) + (((i_1193_ & 0xff00) * i_1194_ + (i_1196_ & 0xff00) * i_1195_) & 0xff0000)) >> 8;
							} else if (i == 0) {
								int i_1197_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1179_]);
								int i_1198_ = (i_1197_ >>> 24) * anInt8878 >> 8;
								int i_1199_ = 256 - i_1198_;
								if ((anInt8877 & 0xffffff) == 16777215) {
									int i_1200_ = is[i_1180_];
									is[i_1180_] = ((((i_1197_ & 0xff00ff) * i_1198_ + (i_1200_ & 0xff00ff) * i_1199_) & ~0xff00ff) + (((i_1197_ & 0xff00) * i_1198_ + (i_1200_ & 0xff00) * i_1199_) & 0xff0000)) >> 8;
								} else if (i_1198_ != 255) {
									int i_1201_ = ((i_1197_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1202_ = ((i_1197_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1203_ = ((i_1197_ & 0xff) * anInt8882 & 0xff00);
									i_1197_ = (i_1201_ | i_1202_ | i_1203_) >>> 8;
									int i_1204_ = is[i_1180_];
									is[i_1180_] = ((((i_1197_ & 0xff00ff) * i_1198_ + (i_1204_ & 0xff00ff) * i_1199_) & ~0xff00ff) + (((i_1197_ & 0xff00) * i_1198_ + (i_1204_ & 0xff00) * i_1199_) & 0xff0000)) >> 8;
								} else {
									int i_1205_ = ((i_1197_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1206_ = ((i_1197_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1207_ = ((i_1197_ & 0xff) * anInt8882 & 0xff00);
									is[i_1180_] = (i_1205_ | i_1206_ | i_1207_) >>> 8;
								}
							} else if (i == 3) {
								int i_1208_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1179_]);
								int i_1209_ = anInt8877;
								int i_1210_ = i_1208_ + i_1209_;
								int i_1211_ = ((i_1208_ & 0xff00ff) + (i_1209_ & 0xff00ff));
								int i_1212_ = ((i_1211_ & 0x1000100) + (i_1210_ - i_1211_ & 0x10000));
								i_1212_ = i_1210_ - i_1212_ | i_1212_ - (i_1212_ >>> 8);
								int i_1213_ = (i_1208_ >>> 24) * anInt8878 >> 8;
								int i_1214_ = 256 - i_1213_;
								if (i_1213_ != 255) {
									i_1208_ = i_1212_;
									i_1212_ = is[i_1180_];
									i_1212_ = ((((i_1208_ & 0xff00ff) * i_1213_ + (i_1212_ & 0xff00ff) * i_1214_) & ~0xff00ff) + (((i_1208_ & 0xff00) * i_1213_ + (i_1212_ & 0xff00) * i_1214_) & 0xff0000)) >> 8;
								}
								is[i_1180_] = i_1212_;
							} else if (i == 2) {
								int i_1215_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1179_]);
								int i_1216_ = i_1215_ >>> 24;
								int i_1217_ = 256 - i_1216_;
								int i_1218_ = ((i_1215_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_1219_ = ((i_1215_ & 0xff00) * anInt8878 & 0xff0000);
								i_1215_ = ((i_1218_ | i_1219_) >>> 8) + anInt8885;
								int i_1220_ = is[i_1180_];
								is[i_1180_] = ((((i_1215_ & 0xff00ff) * i_1216_ + (i_1220_ & 0xff00ff) * i_1217_) & ~0xff00ff) + (((i_1215_ & 0xff00) * i_1216_ + (i_1220_ & 0xff00) * i_1217_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_609_ == 2) {
							if (i == 1) {
								int i_1221_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1179_]);
								int i_1222_ = is[i_1180_];
								int i_1223_ = i_1221_ + i_1222_;
								int i_1224_ = ((i_1221_ & 0xff00ff) + (i_1222_ & 0xff00ff));
								i_1222_ = ((i_1224_ & 0x1000100) + (i_1223_ - i_1224_ & 0x10000));
								is[i_1180_] = i_1223_ - i_1222_ | i_1222_ - (i_1222_ >>> 8);
							} else if (i == 0) {
								int i_1225_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1179_]);
								int i_1226_ = ((i_1225_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_1227_ = ((i_1225_ & 0xff00) * anInt8852 & 0xff0000);
								int i_1228_ = (i_1225_ & 0xff) * anInt8882 & 0xff00;
								i_1225_ = (i_1226_ | i_1227_ | i_1228_) >>> 8;
								int i_1229_ = is[i_1180_];
								int i_1230_ = i_1225_ + i_1229_;
								int i_1231_ = ((i_1225_ & 0xff00ff) + (i_1229_ & 0xff00ff));
								i_1229_ = ((i_1231_ & 0x1000100) + (i_1230_ - i_1231_ & 0x10000));
								is[i_1180_] = i_1230_ - i_1229_ | i_1229_ - (i_1229_ >>> 8);
							} else if (i == 3) {
								int i_1232_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1179_]);
								int i_1233_ = anInt8877;
								int i_1234_ = i_1232_ + i_1233_;
								int i_1235_ = ((i_1232_ & 0xff00ff) + (i_1233_ & 0xff00ff));
								int i_1236_ = ((i_1235_ & 0x1000100) + (i_1234_ - i_1235_ & 0x10000));
								i_1232_ = i_1234_ - i_1236_ | i_1236_ - (i_1236_ >>> 8);
								i_1236_ = is[i_1180_];
								i_1234_ = i_1232_ + i_1236_;
								i_1235_ = (i_1232_ & 0xff00ff) + (i_1236_ & 0xff00ff);
								i_1236_ = ((i_1235_ & 0x1000100) + (i_1234_ - i_1235_ & 0x10000));
								is[i_1180_] = i_1234_ - i_1236_ | i_1236_ - (i_1236_ >>> 8);
							} else if (i == 2) {
								int i_1237_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1179_]);
								int i_1238_ = ((i_1237_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_1239_ = ((i_1237_ & 0xff00) * anInt8878 & 0xff0000);
								i_1237_ = ((i_1238_ | i_1239_) >>> 8) + anInt8885;
								int i_1240_ = is[i_1180_];
								int i_1241_ = i_1237_ + i_1240_;
								int i_1242_ = ((i_1237_ & 0xff00ff) + (i_1240_ & 0xff00ff));
								i_1240_ = ((i_1242_ & 0x1000100) + (i_1241_ - i_1242_ & 0x10000));
								is[i_1180_] = i_1241_ - i_1240_ | i_1240_ - (i_1240_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_1174_ += anInt8865;
						i_1175_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			}
		}
	}

	void method14250(int[] is, int[] is_1243_, int i, int i_1244_) {
		int[] is_1245_ = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is_1245_ != null) {
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					int i_1246_ = anInt8864;
					while (i_1246_ < 0) {
						int i_1247_ = i_1246_ + i_1244_;
						if (i_1247_ >= 0) {
							if (i_1247_ >= is.length)
								break;
							int i_1248_ = anInt8870;
							int i_1249_ = anInt8873;
							int i_1250_ = anInt8874;
							int i_1251_ = anInt8862;
							if (i_1249_ >= 0 && i_1250_ >= 0 && (i_1249_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12)) < 0 && (i_1250_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12)) < 0) {
								int i_1252_ = is[i_1247_] - i;
								int i_1253_ = -is_1243_[i_1247_];
								int i_1254_ = i_1252_ - (i_1248_ - anInt8870);
								if (i_1254_ > 0) {
									i_1248_ += i_1254_;
									i_1251_ += i_1254_;
									i_1249_ += anInt8865 * i_1254_;
									i_1250_ += anInt8868 * i_1254_;
								} else
									i_1253_ -= i_1254_;
								if (i_1251_ < i_1253_)
									i_1251_ = i_1253_;
								for (/**/; i_1251_ < 0; i_1251_++) {
									int i_1255_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(((i_1250_ >> 12) * (((Class160_Sub1_Sub3) this).anInt8851)) + (i_1249_ >> 12))]);
									int i_1256_ = i_1255_ >>> 24;
									int i_1257_ = 256 - i_1256_;
									int i_1258_ = is_1245_[i_1248_];
									is_1245_[i_1248_++] = ((((i_1255_ & 0xff00ff) * i_1256_ + (i_1258_ & 0xff00ff) * i_1257_) & ~0xff00ff) + (((i_1255_ & 0xff00) * i_1256_ + (i_1258_ & 0xff00) * i_1257_) & 0xff0000)) >> 8;
								}
							}
						}
						i_1246_++;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_1259_ = anInt8864;
					while (i_1259_ < 0) {
						int i_1260_ = i_1259_ + i_1244_;
						if (i_1260_ >= 0) {
							if (i_1260_ >= is.length)
								break;
							int i_1261_ = anInt8870;
							int i_1262_ = anInt8873;
							int i_1263_ = anInt8874 + anInt8866;
							int i_1264_ = anInt8862;
							if (i_1262_ >= 0 && (i_1262_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12)) < 0) {
								int i_1265_;
								if ((i_1265_ = i_1263_ - ((((Class160_Sub1_Sub3) this).anInt8867) << 12)) >= 0) {
									i_1265_ = (anInt8868 - i_1265_) / anInt8868;
									i_1264_ += i_1265_;
									i_1263_ += anInt8868 * i_1265_;
									i_1261_ += i_1265_;
								}
								if ((i_1265_ = (i_1263_ - anInt8868) / anInt8868) > i_1264_)
									i_1264_ = i_1265_;
								int i_1266_ = is[i_1260_] - i;
								int i_1267_ = -is_1243_[i_1260_];
								int i_1268_ = i_1266_ - (i_1261_ - anInt8870);
								if (i_1268_ > 0) {
									i_1261_ += i_1268_;
									i_1264_ += i_1268_;
									i_1262_ += anInt8865 * i_1268_;
									i_1263_ += anInt8868 * i_1268_;
								} else
									i_1267_ -= i_1268_;
								if (i_1264_ < i_1267_)
									i_1264_ = i_1267_;
								for (/**/; i_1264_ < 0; i_1264_++) {
									int i_1269_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(((i_1263_ >> 12) * (((Class160_Sub1_Sub3) this).anInt8851)) + (i_1262_ >> 12))]);
									int i_1270_ = i_1269_ >>> 24;
									int i_1271_ = 256 - i_1270_;
									int i_1272_ = is_1245_[i_1261_];
									is_1245_[i_1261_++] = ((((i_1269_ & 0xff00ff) * i_1270_ + (i_1272_ & 0xff00ff) * i_1271_) & ~0xff00ff) + (((i_1269_ & 0xff00) * i_1270_ + (i_1272_ & 0xff00) * i_1271_) & 0xff0000)) >> 8;
									i_1263_ += anInt8868;
								}
							}
						}
						i_1259_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				} else {
					int i_1273_ = anInt8864;
					while (i_1273_ < 0) {
						int i_1274_ = i_1273_ + i_1244_;
						if (i_1274_ >= 0) {
							if (i_1274_ >= is.length)
								break;
							int i_1275_ = anInt8870;
							int i_1276_ = anInt8873;
							int i_1277_ = anInt8874 + anInt8866;
							int i_1278_ = anInt8862;
							if (i_1276_ >= 0 && (i_1276_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12)) < 0) {
								if (i_1277_ < 0) {
									int i_1279_ = ((anInt8868 - 1 - i_1277_) / anInt8868);
									i_1278_ += i_1279_;
									i_1277_ += anInt8868 * i_1279_;
									i_1275_ += i_1279_;
								}
								int i_1280_;
								if ((i_1280_ = (1 + i_1277_ - ((((Class160_Sub1_Sub3) this).anInt8867) << 12) - anInt8868) / anInt8868) > i_1278_)
									i_1278_ = i_1280_;
								int i_1281_ = is[i_1274_] - i;
								int i_1282_ = -is_1243_[i_1274_];
								int i_1283_ = i_1281_ - (i_1275_ - anInt8870);
								if (i_1283_ > 0) {
									i_1275_ += i_1283_;
									i_1278_ += i_1283_;
									i_1276_ += anInt8865 * i_1283_;
									i_1277_ += anInt8868 * i_1283_;
								} else
									i_1282_ -= i_1283_;
								if (i_1278_ < i_1282_)
									i_1278_ = i_1282_;
								for (/**/; i_1278_ < 0; i_1278_++) {
									int i_1284_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(((i_1277_ >> 12) * (((Class160_Sub1_Sub3) this).anInt8851)) + (i_1276_ >> 12))]);
									int i_1285_ = i_1284_ >>> 24;
									int i_1286_ = 256 - i_1285_;
									int i_1287_ = is_1245_[i_1275_];
									is_1245_[i_1275_++] = ((((i_1284_ & 0xff00ff) * i_1285_ + (i_1287_ & 0xff00ff) * i_1286_) & ~0xff00ff) + (((i_1284_ & 0xff00) * i_1285_ + (i_1287_ & 0xff00) * i_1286_) & 0xff0000)) >> 8;
									i_1277_ += anInt8868;
								}
							}
						}
						i_1273_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					int i_1288_ = anInt8864;
					while (i_1288_ < 0) {
						int i_1289_ = i_1288_ + i_1244_;
						if (i_1289_ >= 0) {
							if (i_1289_ >= is.length)
								break;
							int i_1290_ = anInt8870;
							int i_1291_ = anInt8873 + anInt8858;
							int i_1292_ = anInt8874;
							int i_1293_ = anInt8862;
							if (i_1292_ >= 0 && (i_1292_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12)) < 0) {
								int i_1294_;
								if ((i_1294_ = i_1291_ - ((((Class160_Sub1_Sub3) this).anInt8851) << 12)) >= 0) {
									i_1294_ = (anInt8865 - i_1294_) / anInt8865;
									i_1293_ += i_1294_;
									i_1291_ += anInt8865 * i_1294_;
									i_1290_ += i_1294_;
								}
								if ((i_1294_ = (i_1291_ - anInt8865) / anInt8865) > i_1293_)
									i_1293_ = i_1294_;
								int i_1295_ = is[i_1289_] - i;
								int i_1296_ = -is_1243_[i_1289_];
								int i_1297_ = i_1295_ - (i_1290_ - anInt8870);
								if (i_1297_ > 0) {
									i_1290_ += i_1297_;
									i_1293_ += i_1297_;
									i_1291_ += anInt8865 * i_1297_;
									i_1292_ += anInt8868 * i_1297_;
								} else
									i_1296_ -= i_1297_;
								if (i_1293_ < i_1296_)
									i_1293_ = i_1296_;
								for (/**/; i_1293_ < 0; i_1293_++) {
									int i_1298_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(((i_1292_ >> 12) * (((Class160_Sub1_Sub3) this).anInt8851)) + (i_1291_ >> 12))]);
									int i_1299_ = i_1298_ >>> 24;
									int i_1300_ = 256 - i_1299_;
									int i_1301_ = is_1245_[i_1290_];
									is_1245_[i_1290_++] = ((((i_1298_ & 0xff00ff) * i_1299_ + (i_1301_ & 0xff00ff) * i_1300_) & ~0xff00ff) + (((i_1298_ & 0xff00) * i_1299_ + (i_1301_ & 0xff00) * i_1300_) & 0xff0000)) >> 8;
									i_1291_ += anInt8865;
								}
							}
						}
						i_1288_++;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_1302_ = anInt8864;
					while (i_1302_ < 0) {
						int i_1303_ = i_1302_ + i_1244_;
						if (i_1303_ >= 0) {
							if (i_1303_ >= is.length)
								break;
							int i_1304_ = anInt8870;
							int i_1305_ = anInt8873 + anInt8858;
							int i_1306_ = anInt8874 + anInt8866;
							int i_1307_ = anInt8862;
							int i_1308_;
							if ((i_1308_ = (i_1305_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12))) >= 0) {
								i_1308_ = (anInt8865 - i_1308_) / anInt8865;
								i_1307_ += i_1308_;
								i_1305_ += anInt8865 * i_1308_;
								i_1306_ += anInt8868 * i_1308_;
								i_1304_ += i_1308_;
							}
							if ((i_1308_ = (i_1305_ - anInt8865) / anInt8865) > i_1307_)
								i_1307_ = i_1308_;
							if ((i_1308_ = (i_1306_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12))) >= 0) {
								i_1308_ = (anInt8868 - i_1308_) / anInt8868;
								i_1307_ += i_1308_;
								i_1305_ += anInt8865 * i_1308_;
								i_1306_ += anInt8868 * i_1308_;
								i_1304_ += i_1308_;
							}
							if ((i_1308_ = (i_1306_ - anInt8868) / anInt8868) > i_1307_)
								i_1307_ = i_1308_;
							int i_1309_ = is[i_1303_] - i;
							int i_1310_ = -is_1243_[i_1303_];
							int i_1311_ = i_1309_ - (i_1304_ - anInt8870);
							if (i_1311_ > 0) {
								i_1304_ += i_1311_;
								i_1307_ += i_1311_;
								i_1305_ += anInt8865 * i_1311_;
								i_1306_ += anInt8868 * i_1311_;
							} else
								i_1310_ -= i_1311_;
							if (i_1307_ < i_1310_)
								i_1307_ = i_1310_;
							for (/**/; i_1307_ < 0; i_1307_++) {
								int i_1312_ = (((Class160_Sub1_Sub3) this).anIntArray10235[((i_1306_ >> 12) * (((Class160_Sub1_Sub3) this).anInt8851)) + (i_1305_ >> 12)]);
								int i_1313_ = i_1312_ >>> 24;
								int i_1314_ = 256 - i_1313_;
								int i_1315_ = is_1245_[i_1304_];
								is_1245_[i_1304_++] = ((((i_1312_ & 0xff00ff) * i_1313_ + (i_1315_ & 0xff00ff) * i_1314_) & ~0xff00ff) + (((i_1312_ & 0xff00) * i_1313_ + (i_1315_ & 0xff00) * i_1314_) & 0xff0000)) >> 8;
								i_1305_ += anInt8865;
								i_1306_ += anInt8868;
							}
						}
						i_1302_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else {
					int i_1316_ = anInt8864;
					while (i_1316_ < 0) {
						int i_1317_ = i_1316_ + i_1244_;
						if (i_1317_ >= 0) {
							if (i_1317_ >= is.length)
								break;
							int i_1318_ = anInt8870;
							int i_1319_ = anInt8873 + anInt8858;
							int i_1320_ = anInt8874 + anInt8866;
							int i_1321_ = anInt8862;
							int i_1322_;
							if ((i_1322_ = (i_1319_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12))) >= 0) {
								i_1322_ = (anInt8865 - i_1322_) / anInt8865;
								i_1321_ += i_1322_;
								i_1319_ += anInt8865 * i_1322_;
								i_1320_ += anInt8868 * i_1322_;
								i_1318_ += i_1322_;
							}
							if ((i_1322_ = (i_1319_ - anInt8865) / anInt8865) > i_1321_)
								i_1321_ = i_1322_;
							if (i_1320_ < 0) {
								i_1322_ = (anInt8868 - 1 - i_1320_) / anInt8868;
								i_1321_ += i_1322_;
								i_1319_ += anInt8865 * i_1322_;
								i_1320_ += anInt8868 * i_1322_;
								i_1318_ += i_1322_;
							}
							if ((i_1322_ = (1 + i_1320_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_1321_)
								i_1321_ = i_1322_;
							int i_1323_ = is[i_1317_] - i;
							int i_1324_ = -is_1243_[i_1317_];
							int i_1325_ = i_1323_ - (i_1318_ - anInt8870);
							if (i_1325_ > 0) {
								i_1318_ += i_1325_;
								i_1321_ += i_1325_;
								i_1319_ += anInt8865 * i_1325_;
								i_1320_ += anInt8868 * i_1325_;
							} else
								i_1324_ -= i_1325_;
							if (i_1321_ < i_1324_)
								i_1321_ = i_1324_;
							for (/**/; i_1321_ < 0; i_1321_++) {
								int i_1326_ = (((Class160_Sub1_Sub3) this).anIntArray10235[((i_1320_ >> 12) * (((Class160_Sub1_Sub3) this).anInt8851)) + (i_1319_ >> 12)]);
								int i_1327_ = i_1326_ >>> 24;
								int i_1328_ = 256 - i_1327_;
								int i_1329_ = is_1245_[i_1318_];
								is_1245_[i_1318_++] = ((((i_1326_ & 0xff00ff) * i_1327_ + (i_1329_ & 0xff00ff) * i_1328_) & ~0xff00ff) + (((i_1326_ & 0xff00) * i_1327_ + (i_1329_ & 0xff00) * i_1328_) & 0xff0000)) >> 8;
								i_1319_ += anInt8865;
								i_1320_ += anInt8868;
							}
						}
						i_1316_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8868 == 0) {
				int i_1330_ = anInt8864;
				while (i_1330_ < 0) {
					int i_1331_ = i_1330_ + i_1244_;
					if (i_1331_ >= 0) {
						if (i_1331_ >= is.length)
							break;
						int i_1332_ = anInt8870;
						int i_1333_ = anInt8873 + anInt8858;
						int i_1334_ = anInt8874;
						int i_1335_ = anInt8862;
						if (i_1334_ >= 0 && i_1334_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) < 0) {
							if (i_1333_ < 0) {
								int i_1336_ = (anInt8865 - 1 - i_1333_) / anInt8865;
								i_1335_ += i_1336_;
								i_1333_ += anInt8865 * i_1336_;
								i_1332_ += i_1336_;
							}
							int i_1337_;
							if ((i_1337_ = (1 + i_1333_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1335_)
								i_1335_ = i_1337_;
							int i_1338_ = is[i_1331_] - i;
							int i_1339_ = -is_1243_[i_1331_];
							int i_1340_ = i_1338_ - (i_1332_ - anInt8870);
							if (i_1340_ > 0) {
								i_1332_ += i_1340_;
								i_1335_ += i_1340_;
								i_1333_ += anInt8865 * i_1340_;
								i_1334_ += anInt8868 * i_1340_;
							} else
								i_1339_ -= i_1340_;
							if (i_1335_ < i_1339_)
								i_1335_ = i_1339_;
							for (/**/; i_1335_ < 0; i_1335_++) {
								int i_1341_ = (((Class160_Sub1_Sub3) this).anIntArray10235[((i_1334_ >> 12) * (((Class160_Sub1_Sub3) this).anInt8851)) + (i_1333_ >> 12)]);
								int i_1342_ = i_1341_ >>> 24;
								int i_1343_ = 256 - i_1342_;
								int i_1344_ = is_1245_[i_1332_];
								is_1245_[i_1332_++] = ((((i_1341_ & 0xff00ff) * i_1342_ + (i_1344_ & 0xff00ff) * i_1343_) & ~0xff00ff) + (((i_1341_ & 0xff00) * i_1342_ + (i_1344_ & 0xff00) * i_1343_) & 0xff0000)) >> 8;
								i_1333_ += anInt8865;
							}
						}
					}
					i_1330_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else if (anInt8868 < 0) {
				int i_1345_ = anInt8864;
				while (i_1345_ < 0) {
					int i_1346_ = i_1345_ + i_1244_;
					if (i_1346_ >= 0) {
						if (i_1346_ >= is.length)
							break;
						int i_1347_ = anInt8870;
						int i_1348_ = anInt8873 + anInt8858;
						int i_1349_ = anInt8874 + anInt8866;
						int i_1350_ = anInt8862;
						if (i_1348_ < 0) {
							int i_1351_ = (anInt8865 - 1 - i_1348_) / anInt8865;
							i_1350_ += i_1351_;
							i_1348_ += anInt8865 * i_1351_;
							i_1349_ += anInt8868 * i_1351_;
							i_1347_ += i_1351_;
						}
						int i_1352_;
						if ((i_1352_ = (1 + i_1348_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1350_)
							i_1350_ = i_1352_;
						if ((i_1352_ = i_1349_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12)) >= 0) {
							i_1352_ = (anInt8868 - i_1352_) / anInt8868;
							i_1350_ += i_1352_;
							i_1348_ += anInt8865 * i_1352_;
							i_1349_ += anInt8868 * i_1352_;
							i_1347_ += i_1352_;
						}
						if ((i_1352_ = (i_1349_ - anInt8868) / anInt8868) > i_1350_)
							i_1350_ = i_1352_;
						int i_1353_ = is[i_1346_] - i;
						int i_1354_ = -is_1243_[i_1346_];
						int i_1355_ = i_1353_ - (i_1347_ - anInt8870);
						if (i_1355_ > 0) {
							i_1347_ += i_1355_;
							i_1350_ += i_1355_;
							i_1348_ += anInt8865 * i_1355_;
							i_1349_ += anInt8868 * i_1355_;
						} else
							i_1354_ -= i_1355_;
						if (i_1350_ < i_1354_)
							i_1350_ = i_1354_;
						for (/**/; i_1350_ < 0; i_1350_++) {
							int i_1356_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(((i_1349_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_1348_ >> 12))]);
							int i_1357_ = i_1356_ >>> 24;
							int i_1358_ = 256 - i_1357_;
							int i_1359_ = is_1245_[i_1347_];
							is_1245_[i_1347_++] = ((((i_1356_ & 0xff00ff) * i_1357_ + (i_1359_ & 0xff00ff) * i_1358_) & ~0xff00ff) + (((i_1356_ & 0xff00) * i_1357_ + (i_1359_ & 0xff00) * i_1358_) & 0xff0000)) >> 8;
							i_1348_ += anInt8865;
							i_1349_ += anInt8868;
						}
					}
					i_1345_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else {
				int i_1360_ = anInt8864;
				while (i_1360_ < 0) {
					int i_1361_ = i_1360_ + i_1244_;
					if (i_1361_ >= 0) {
						if (i_1361_ >= is.length)
							break;
						int i_1362_ = anInt8870;
						int i_1363_ = anInt8873 + anInt8858;
						int i_1364_ = anInt8874 + anInt8866;
						int i_1365_ = anInt8862;
						if (i_1363_ < 0) {
							int i_1366_ = (anInt8865 - 1 - i_1363_) / anInt8865;
							i_1365_ += i_1366_;
							i_1363_ += anInt8865 * i_1366_;
							i_1364_ += anInt8868 * i_1366_;
							i_1362_ += i_1366_;
						}
						int i_1367_;
						if ((i_1367_ = (1 + i_1363_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1365_)
							i_1365_ = i_1367_;
						if (i_1364_ < 0) {
							i_1367_ = (anInt8868 - 1 - i_1364_) / anInt8868;
							i_1365_ += i_1367_;
							i_1363_ += anInt8865 * i_1367_;
							i_1364_ += anInt8868 * i_1367_;
							i_1362_ += i_1367_;
						}
						if ((i_1367_ = (1 + i_1364_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_1365_)
							i_1365_ = i_1367_;
						int i_1368_ = is[i_1361_] - i;
						int i_1369_ = -is_1243_[i_1361_];
						int i_1370_ = i_1368_ - (i_1362_ - anInt8870);
						if (i_1370_ > 0) {
							i_1362_ += i_1370_;
							i_1365_ += i_1370_;
							i_1363_ += anInt8865 * i_1370_;
							i_1364_ += anInt8868 * i_1370_;
						} else
							i_1369_ -= i_1370_;
						if (i_1365_ < i_1369_)
							i_1365_ = i_1369_;
						for (/**/; i_1365_ < 0; i_1365_++) {
							int i_1371_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(((i_1364_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_1363_ >> 12))]);
							int i_1372_ = i_1371_ >>> 24;
							int i_1373_ = 256 - i_1372_;
							int i_1374_ = is_1245_[i_1362_];
							is_1245_[i_1362_++] = ((((i_1371_ & 0xff00ff) * i_1372_ + (i_1374_ & 0xff00ff) * i_1373_) & ~0xff00ff) + (((i_1371_ & 0xff00) * i_1372_ + (i_1374_ & 0xff00) * i_1373_) & 0xff0000)) >> 8;
							i_1363_ += anInt8865;
							i_1364_ += anInt8868;
						}
					}
					i_1360_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			}
		}
	}

	public void method2767(int i, int i_1375_, int i_1376_, int i_1377_, int i_1378_, int i_1379_) {
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_1380_ = 0; i_1380_ < i_1377_; i_1380_++) {
			int i_1381_ = (i_1375_ + i_1380_) * i_1376_ + i;
			int i_1382_ = (i_1379_ + i_1380_) * i_1376_ + i_1378_;
			for (int i_1383_ = 0; i_1383_ < i_1376_; i_1383_++)
				((Class160_Sub1_Sub3) this).anIntArray10235[i_1381_ + i_1383_] = is[i_1382_ + i_1383_] & 0xffffff;
		}
	}

	void method14251(int[] is, int[] is_1384_, int i, int i_1385_) {
		int[] is_1386_ = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is_1386_ != null) {
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					int i_1387_ = anInt8864;
					while (i_1387_ < 0) {
						int i_1388_ = i_1387_ + i_1385_;
						if (i_1388_ >= 0) {
							if (i_1388_ >= is.length)
								break;
							int i_1389_ = anInt8870;
							int i_1390_ = anInt8873;
							int i_1391_ = anInt8874;
							int i_1392_ = anInt8862;
							if (i_1390_ >= 0 && i_1391_ >= 0 && (i_1390_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12)) < 0 && (i_1391_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12)) < 0) {
								int i_1393_ = is[i_1388_] - i;
								int i_1394_ = -is_1384_[i_1388_];
								int i_1395_ = i_1393_ - (i_1389_ - anInt8870);
								if (i_1395_ > 0) {
									i_1389_ += i_1395_;
									i_1392_ += i_1395_;
									i_1390_ += anInt8865 * i_1395_;
									i_1391_ += anInt8868 * i_1395_;
								} else
									i_1394_ -= i_1395_;
								if (i_1392_ < i_1394_)
									i_1392_ = i_1394_;
								for (/**/; i_1392_ < 0; i_1392_++) {
									int i_1396_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(((i_1391_ >> 12) * (((Class160_Sub1_Sub3) this).anInt8851)) + (i_1390_ >> 12))]);
									int i_1397_ = i_1396_ >>> 24;
									int i_1398_ = 256 - i_1397_;
									int i_1399_ = is_1386_[i_1389_];
									is_1386_[i_1389_++] = ((((i_1396_ & 0xff00ff) * i_1397_ + (i_1399_ & 0xff00ff) * i_1398_) & ~0xff00ff) + (((i_1396_ & 0xff00) * i_1397_ + (i_1399_ & 0xff00) * i_1398_) & 0xff0000)) >> 8;
								}
							}
						}
						i_1387_++;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_1400_ = anInt8864;
					while (i_1400_ < 0) {
						int i_1401_ = i_1400_ + i_1385_;
						if (i_1401_ >= 0) {
							if (i_1401_ >= is.length)
								break;
							int i_1402_ = anInt8870;
							int i_1403_ = anInt8873;
							int i_1404_ = anInt8874 + anInt8866;
							int i_1405_ = anInt8862;
							if (i_1403_ >= 0 && (i_1403_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12)) < 0) {
								int i_1406_;
								if ((i_1406_ = i_1404_ - ((((Class160_Sub1_Sub3) this).anInt8867) << 12)) >= 0) {
									i_1406_ = (anInt8868 - i_1406_) / anInt8868;
									i_1405_ += i_1406_;
									i_1404_ += anInt8868 * i_1406_;
									i_1402_ += i_1406_;
								}
								if ((i_1406_ = (i_1404_ - anInt8868) / anInt8868) > i_1405_)
									i_1405_ = i_1406_;
								int i_1407_ = is[i_1401_] - i;
								int i_1408_ = -is_1384_[i_1401_];
								int i_1409_ = i_1407_ - (i_1402_ - anInt8870);
								if (i_1409_ > 0) {
									i_1402_ += i_1409_;
									i_1405_ += i_1409_;
									i_1403_ += anInt8865 * i_1409_;
									i_1404_ += anInt8868 * i_1409_;
								} else
									i_1408_ -= i_1409_;
								if (i_1405_ < i_1408_)
									i_1405_ = i_1408_;
								for (/**/; i_1405_ < 0; i_1405_++) {
									int i_1410_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(((i_1404_ >> 12) * (((Class160_Sub1_Sub3) this).anInt8851)) + (i_1403_ >> 12))]);
									int i_1411_ = i_1410_ >>> 24;
									int i_1412_ = 256 - i_1411_;
									int i_1413_ = is_1386_[i_1402_];
									is_1386_[i_1402_++] = ((((i_1410_ & 0xff00ff) * i_1411_ + (i_1413_ & 0xff00ff) * i_1412_) & ~0xff00ff) + (((i_1410_ & 0xff00) * i_1411_ + (i_1413_ & 0xff00) * i_1412_) & 0xff0000)) >> 8;
									i_1404_ += anInt8868;
								}
							}
						}
						i_1400_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				} else {
					int i_1414_ = anInt8864;
					while (i_1414_ < 0) {
						int i_1415_ = i_1414_ + i_1385_;
						if (i_1415_ >= 0) {
							if (i_1415_ >= is.length)
								break;
							int i_1416_ = anInt8870;
							int i_1417_ = anInt8873;
							int i_1418_ = anInt8874 + anInt8866;
							int i_1419_ = anInt8862;
							if (i_1417_ >= 0 && (i_1417_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12)) < 0) {
								if (i_1418_ < 0) {
									int i_1420_ = ((anInt8868 - 1 - i_1418_) / anInt8868);
									i_1419_ += i_1420_;
									i_1418_ += anInt8868 * i_1420_;
									i_1416_ += i_1420_;
								}
								int i_1421_;
								if ((i_1421_ = (1 + i_1418_ - ((((Class160_Sub1_Sub3) this).anInt8867) << 12) - anInt8868) / anInt8868) > i_1419_)
									i_1419_ = i_1421_;
								int i_1422_ = is[i_1415_] - i;
								int i_1423_ = -is_1384_[i_1415_];
								int i_1424_ = i_1422_ - (i_1416_ - anInt8870);
								if (i_1424_ > 0) {
									i_1416_ += i_1424_;
									i_1419_ += i_1424_;
									i_1417_ += anInt8865 * i_1424_;
									i_1418_ += anInt8868 * i_1424_;
								} else
									i_1423_ -= i_1424_;
								if (i_1419_ < i_1423_)
									i_1419_ = i_1423_;
								for (/**/; i_1419_ < 0; i_1419_++) {
									int i_1425_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(((i_1418_ >> 12) * (((Class160_Sub1_Sub3) this).anInt8851)) + (i_1417_ >> 12))]);
									int i_1426_ = i_1425_ >>> 24;
									int i_1427_ = 256 - i_1426_;
									int i_1428_ = is_1386_[i_1416_];
									is_1386_[i_1416_++] = ((((i_1425_ & 0xff00ff) * i_1426_ + (i_1428_ & 0xff00ff) * i_1427_) & ~0xff00ff) + (((i_1425_ & 0xff00) * i_1426_ + (i_1428_ & 0xff00) * i_1427_) & 0xff0000)) >> 8;
									i_1418_ += anInt8868;
								}
							}
						}
						i_1414_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					int i_1429_ = anInt8864;
					while (i_1429_ < 0) {
						int i_1430_ = i_1429_ + i_1385_;
						if (i_1430_ >= 0) {
							if (i_1430_ >= is.length)
								break;
							int i_1431_ = anInt8870;
							int i_1432_ = anInt8873 + anInt8858;
							int i_1433_ = anInt8874;
							int i_1434_ = anInt8862;
							if (i_1433_ >= 0 && (i_1433_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12)) < 0) {
								int i_1435_;
								if ((i_1435_ = i_1432_ - ((((Class160_Sub1_Sub3) this).anInt8851) << 12)) >= 0) {
									i_1435_ = (anInt8865 - i_1435_) / anInt8865;
									i_1434_ += i_1435_;
									i_1432_ += anInt8865 * i_1435_;
									i_1431_ += i_1435_;
								}
								if ((i_1435_ = (i_1432_ - anInt8865) / anInt8865) > i_1434_)
									i_1434_ = i_1435_;
								int i_1436_ = is[i_1430_] - i;
								int i_1437_ = -is_1384_[i_1430_];
								int i_1438_ = i_1436_ - (i_1431_ - anInt8870);
								if (i_1438_ > 0) {
									i_1431_ += i_1438_;
									i_1434_ += i_1438_;
									i_1432_ += anInt8865 * i_1438_;
									i_1433_ += anInt8868 * i_1438_;
								} else
									i_1437_ -= i_1438_;
								if (i_1434_ < i_1437_)
									i_1434_ = i_1437_;
								for (/**/; i_1434_ < 0; i_1434_++) {
									int i_1439_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(((i_1433_ >> 12) * (((Class160_Sub1_Sub3) this).anInt8851)) + (i_1432_ >> 12))]);
									int i_1440_ = i_1439_ >>> 24;
									int i_1441_ = 256 - i_1440_;
									int i_1442_ = is_1386_[i_1431_];
									is_1386_[i_1431_++] = ((((i_1439_ & 0xff00ff) * i_1440_ + (i_1442_ & 0xff00ff) * i_1441_) & ~0xff00ff) + (((i_1439_ & 0xff00) * i_1440_ + (i_1442_ & 0xff00) * i_1441_) & 0xff0000)) >> 8;
									i_1432_ += anInt8865;
								}
							}
						}
						i_1429_++;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_1443_ = anInt8864;
					while (i_1443_ < 0) {
						int i_1444_ = i_1443_ + i_1385_;
						if (i_1444_ >= 0) {
							if (i_1444_ >= is.length)
								break;
							int i_1445_ = anInt8870;
							int i_1446_ = anInt8873 + anInt8858;
							int i_1447_ = anInt8874 + anInt8866;
							int i_1448_ = anInt8862;
							int i_1449_;
							if ((i_1449_ = (i_1446_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12))) >= 0) {
								i_1449_ = (anInt8865 - i_1449_) / anInt8865;
								i_1448_ += i_1449_;
								i_1446_ += anInt8865 * i_1449_;
								i_1447_ += anInt8868 * i_1449_;
								i_1445_ += i_1449_;
							}
							if ((i_1449_ = (i_1446_ - anInt8865) / anInt8865) > i_1448_)
								i_1448_ = i_1449_;
							if ((i_1449_ = (i_1447_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12))) >= 0) {
								i_1449_ = (anInt8868 - i_1449_) / anInt8868;
								i_1448_ += i_1449_;
								i_1446_ += anInt8865 * i_1449_;
								i_1447_ += anInt8868 * i_1449_;
								i_1445_ += i_1449_;
							}
							if ((i_1449_ = (i_1447_ - anInt8868) / anInt8868) > i_1448_)
								i_1448_ = i_1449_;
							int i_1450_ = is[i_1444_] - i;
							int i_1451_ = -is_1384_[i_1444_];
							int i_1452_ = i_1450_ - (i_1445_ - anInt8870);
							if (i_1452_ > 0) {
								i_1445_ += i_1452_;
								i_1448_ += i_1452_;
								i_1446_ += anInt8865 * i_1452_;
								i_1447_ += anInt8868 * i_1452_;
							} else
								i_1451_ -= i_1452_;
							if (i_1448_ < i_1451_)
								i_1448_ = i_1451_;
							for (/**/; i_1448_ < 0; i_1448_++) {
								int i_1453_ = (((Class160_Sub1_Sub3) this).anIntArray10235[((i_1447_ >> 12) * (((Class160_Sub1_Sub3) this).anInt8851)) + (i_1446_ >> 12)]);
								int i_1454_ = i_1453_ >>> 24;
								int i_1455_ = 256 - i_1454_;
								int i_1456_ = is_1386_[i_1445_];
								is_1386_[i_1445_++] = ((((i_1453_ & 0xff00ff) * i_1454_ + (i_1456_ & 0xff00ff) * i_1455_) & ~0xff00ff) + (((i_1453_ & 0xff00) * i_1454_ + (i_1456_ & 0xff00) * i_1455_) & 0xff0000)) >> 8;
								i_1446_ += anInt8865;
								i_1447_ += anInt8868;
							}
						}
						i_1443_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else {
					int i_1457_ = anInt8864;
					while (i_1457_ < 0) {
						int i_1458_ = i_1457_ + i_1385_;
						if (i_1458_ >= 0) {
							if (i_1458_ >= is.length)
								break;
							int i_1459_ = anInt8870;
							int i_1460_ = anInt8873 + anInt8858;
							int i_1461_ = anInt8874 + anInt8866;
							int i_1462_ = anInt8862;
							int i_1463_;
							if ((i_1463_ = (i_1460_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12))) >= 0) {
								i_1463_ = (anInt8865 - i_1463_) / anInt8865;
								i_1462_ += i_1463_;
								i_1460_ += anInt8865 * i_1463_;
								i_1461_ += anInt8868 * i_1463_;
								i_1459_ += i_1463_;
							}
							if ((i_1463_ = (i_1460_ - anInt8865) / anInt8865) > i_1462_)
								i_1462_ = i_1463_;
							if (i_1461_ < 0) {
								i_1463_ = (anInt8868 - 1 - i_1461_) / anInt8868;
								i_1462_ += i_1463_;
								i_1460_ += anInt8865 * i_1463_;
								i_1461_ += anInt8868 * i_1463_;
								i_1459_ += i_1463_;
							}
							if ((i_1463_ = (1 + i_1461_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_1462_)
								i_1462_ = i_1463_;
							int i_1464_ = is[i_1458_] - i;
							int i_1465_ = -is_1384_[i_1458_];
							int i_1466_ = i_1464_ - (i_1459_ - anInt8870);
							if (i_1466_ > 0) {
								i_1459_ += i_1466_;
								i_1462_ += i_1466_;
								i_1460_ += anInt8865 * i_1466_;
								i_1461_ += anInt8868 * i_1466_;
							} else
								i_1465_ -= i_1466_;
							if (i_1462_ < i_1465_)
								i_1462_ = i_1465_;
							for (/**/; i_1462_ < 0; i_1462_++) {
								int i_1467_ = (((Class160_Sub1_Sub3) this).anIntArray10235[((i_1461_ >> 12) * (((Class160_Sub1_Sub3) this).anInt8851)) + (i_1460_ >> 12)]);
								int i_1468_ = i_1467_ >>> 24;
								int i_1469_ = 256 - i_1468_;
								int i_1470_ = is_1386_[i_1459_];
								is_1386_[i_1459_++] = ((((i_1467_ & 0xff00ff) * i_1468_ + (i_1470_ & 0xff00ff) * i_1469_) & ~0xff00ff) + (((i_1467_ & 0xff00) * i_1468_ + (i_1470_ & 0xff00) * i_1469_) & 0xff0000)) >> 8;
								i_1460_ += anInt8865;
								i_1461_ += anInt8868;
							}
						}
						i_1457_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8868 == 0) {
				int i_1471_ = anInt8864;
				while (i_1471_ < 0) {
					int i_1472_ = i_1471_ + i_1385_;
					if (i_1472_ >= 0) {
						if (i_1472_ >= is.length)
							break;
						int i_1473_ = anInt8870;
						int i_1474_ = anInt8873 + anInt8858;
						int i_1475_ = anInt8874;
						int i_1476_ = anInt8862;
						if (i_1475_ >= 0 && i_1475_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) < 0) {
							if (i_1474_ < 0) {
								int i_1477_ = (anInt8865 - 1 - i_1474_) / anInt8865;
								i_1476_ += i_1477_;
								i_1474_ += anInt8865 * i_1477_;
								i_1473_ += i_1477_;
							}
							int i_1478_;
							if ((i_1478_ = (1 + i_1474_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1476_)
								i_1476_ = i_1478_;
							int i_1479_ = is[i_1472_] - i;
							int i_1480_ = -is_1384_[i_1472_];
							int i_1481_ = i_1479_ - (i_1473_ - anInt8870);
							if (i_1481_ > 0) {
								i_1473_ += i_1481_;
								i_1476_ += i_1481_;
								i_1474_ += anInt8865 * i_1481_;
								i_1475_ += anInt8868 * i_1481_;
							} else
								i_1480_ -= i_1481_;
							if (i_1476_ < i_1480_)
								i_1476_ = i_1480_;
							for (/**/; i_1476_ < 0; i_1476_++) {
								int i_1482_ = (((Class160_Sub1_Sub3) this).anIntArray10235[((i_1475_ >> 12) * (((Class160_Sub1_Sub3) this).anInt8851)) + (i_1474_ >> 12)]);
								int i_1483_ = i_1482_ >>> 24;
								int i_1484_ = 256 - i_1483_;
								int i_1485_ = is_1386_[i_1473_];
								is_1386_[i_1473_++] = ((((i_1482_ & 0xff00ff) * i_1483_ + (i_1485_ & 0xff00ff) * i_1484_) & ~0xff00ff) + (((i_1482_ & 0xff00) * i_1483_ + (i_1485_ & 0xff00) * i_1484_) & 0xff0000)) >> 8;
								i_1474_ += anInt8865;
							}
						}
					}
					i_1471_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else if (anInt8868 < 0) {
				int i_1486_ = anInt8864;
				while (i_1486_ < 0) {
					int i_1487_ = i_1486_ + i_1385_;
					if (i_1487_ >= 0) {
						if (i_1487_ >= is.length)
							break;
						int i_1488_ = anInt8870;
						int i_1489_ = anInt8873 + anInt8858;
						int i_1490_ = anInt8874 + anInt8866;
						int i_1491_ = anInt8862;
						if (i_1489_ < 0) {
							int i_1492_ = (anInt8865 - 1 - i_1489_) / anInt8865;
							i_1491_ += i_1492_;
							i_1489_ += anInt8865 * i_1492_;
							i_1490_ += anInt8868 * i_1492_;
							i_1488_ += i_1492_;
						}
						int i_1493_;
						if ((i_1493_ = (1 + i_1489_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1491_)
							i_1491_ = i_1493_;
						if ((i_1493_ = i_1490_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12)) >= 0) {
							i_1493_ = (anInt8868 - i_1493_) / anInt8868;
							i_1491_ += i_1493_;
							i_1489_ += anInt8865 * i_1493_;
							i_1490_ += anInt8868 * i_1493_;
							i_1488_ += i_1493_;
						}
						if ((i_1493_ = (i_1490_ - anInt8868) / anInt8868) > i_1491_)
							i_1491_ = i_1493_;
						int i_1494_ = is[i_1487_] - i;
						int i_1495_ = -is_1384_[i_1487_];
						int i_1496_ = i_1494_ - (i_1488_ - anInt8870);
						if (i_1496_ > 0) {
							i_1488_ += i_1496_;
							i_1491_ += i_1496_;
							i_1489_ += anInt8865 * i_1496_;
							i_1490_ += anInt8868 * i_1496_;
						} else
							i_1495_ -= i_1496_;
						if (i_1491_ < i_1495_)
							i_1491_ = i_1495_;
						for (/**/; i_1491_ < 0; i_1491_++) {
							int i_1497_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(((i_1490_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_1489_ >> 12))]);
							int i_1498_ = i_1497_ >>> 24;
							int i_1499_ = 256 - i_1498_;
							int i_1500_ = is_1386_[i_1488_];
							is_1386_[i_1488_++] = ((((i_1497_ & 0xff00ff) * i_1498_ + (i_1500_ & 0xff00ff) * i_1499_) & ~0xff00ff) + (((i_1497_ & 0xff00) * i_1498_ + (i_1500_ & 0xff00) * i_1499_) & 0xff0000)) >> 8;
							i_1489_ += anInt8865;
							i_1490_ += anInt8868;
						}
					}
					i_1486_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else {
				int i_1501_ = anInt8864;
				while (i_1501_ < 0) {
					int i_1502_ = i_1501_ + i_1385_;
					if (i_1502_ >= 0) {
						if (i_1502_ >= is.length)
							break;
						int i_1503_ = anInt8870;
						int i_1504_ = anInt8873 + anInt8858;
						int i_1505_ = anInt8874 + anInt8866;
						int i_1506_ = anInt8862;
						if (i_1504_ < 0) {
							int i_1507_ = (anInt8865 - 1 - i_1504_) / anInt8865;
							i_1506_ += i_1507_;
							i_1504_ += anInt8865 * i_1507_;
							i_1505_ += anInt8868 * i_1507_;
							i_1503_ += i_1507_;
						}
						int i_1508_;
						if ((i_1508_ = (1 + i_1504_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1506_)
							i_1506_ = i_1508_;
						if (i_1505_ < 0) {
							i_1508_ = (anInt8868 - 1 - i_1505_) / anInt8868;
							i_1506_ += i_1508_;
							i_1504_ += anInt8865 * i_1508_;
							i_1505_ += anInt8868 * i_1508_;
							i_1503_ += i_1508_;
						}
						if ((i_1508_ = (1 + i_1505_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_1506_)
							i_1506_ = i_1508_;
						int i_1509_ = is[i_1502_] - i;
						int i_1510_ = -is_1384_[i_1502_];
						int i_1511_ = i_1509_ - (i_1503_ - anInt8870);
						if (i_1511_ > 0) {
							i_1503_ += i_1511_;
							i_1506_ += i_1511_;
							i_1504_ += anInt8865 * i_1511_;
							i_1505_ += anInt8868 * i_1511_;
						} else
							i_1510_ -= i_1511_;
						if (i_1506_ < i_1510_)
							i_1506_ = i_1510_;
						for (/**/; i_1506_ < 0; i_1506_++) {
							int i_1512_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(((i_1505_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_1504_ >> 12))]);
							int i_1513_ = i_1512_ >>> 24;
							int i_1514_ = 256 - i_1513_;
							int i_1515_ = is_1386_[i_1503_];
							is_1386_[i_1503_++] = ((((i_1512_ & 0xff00ff) * i_1513_ + (i_1515_ & 0xff00ff) * i_1514_) & ~0xff00ff) + (((i_1512_ & 0xff00) * i_1513_ + (i_1515_ & 0xff00) * i_1514_) & 0xff0000)) >> 8;
							i_1504_ += anInt8865;
							i_1505_ += anInt8868;
						}
					}
					i_1501_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			}
		}
	}

	Class160_Sub1_Sub3(Class505_Sub3 class505_sub3, int i, int i_1516_) {
		super(class505_sub3, i, i_1516_);
		((Class160_Sub1_Sub3) this).anIntArray10235 = new int[i * i_1516_];
	}

	public void method2770(int i, int i_1517_, int i_1518_) {
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is == null)
			throw new IllegalStateException("");
		if (i_1518_ == 0) {
			for (int i_1519_ = 0; i_1519_ < ((Class160_Sub1_Sub3) this).anInt8867; i_1519_++) {
				int i_1520_ = i_1519_ * ((Class160_Sub1_Sub3) this).anInt8851;
				int i_1521_ = (((i_1517_ + i_1519_) * (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i);
				for (int i_1522_ = 0; i_1522_ < ((Class160_Sub1_Sub3) this).anInt8851; i_1522_++)
					((Class160_Sub1_Sub3) this).anIntArray10235[(i_1520_ + i_1522_)] = ((((Class160_Sub1_Sub3) this).anIntArray10235[i_1520_ + i_1522_]) & 0xffffff | is[i_1521_ + i_1522_] << 8 & ~0xffffff);
			}
		} else if (i_1518_ == 1) {
			for (int i_1523_ = 0; i_1523_ < ((Class160_Sub1_Sub3) this).anInt8867; i_1523_++) {
				int i_1524_ = i_1523_ * ((Class160_Sub1_Sub3) this).anInt8851;
				int i_1525_ = (((i_1517_ + i_1523_) * (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i);
				for (int i_1526_ = 0; i_1526_ < ((Class160_Sub1_Sub3) this).anInt8851; i_1526_++)
					((Class160_Sub1_Sub3) this).anIntArray10235[(i_1524_ + i_1526_)] = ((((Class160_Sub1_Sub3) this).anIntArray10235[i_1524_ + i_1526_]) & 0xffffff | is[i_1525_ + i_1526_] << 16 & ~0xffffff);
			}
		} else if (i_1518_ == 2) {
			for (int i_1527_ = 0; i_1527_ < ((Class160_Sub1_Sub3) this).anInt8867; i_1527_++) {
				int i_1528_ = i_1527_ * ((Class160_Sub1_Sub3) this).anInt8851;
				int i_1529_ = (((i_1517_ + i_1527_) * (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i);
				for (int i_1530_ = 0; i_1530_ < ((Class160_Sub1_Sub3) this).anInt8851; i_1530_++)
					((Class160_Sub1_Sub3) this).anIntArray10235[(i_1528_ + i_1530_)] = ((((Class160_Sub1_Sub3) this).anIntArray10235[i_1528_ + i_1530_]) & 0xffffff | is[i_1529_ + i_1530_] << 24 & ~0xffffff);
			}
		} else if (i_1518_ == 3) {
			for (int i_1531_ = 0; i_1531_ < ((Class160_Sub1_Sub3) this).anInt8867; i_1531_++) {
				int i_1532_ = i_1531_ * ((Class160_Sub1_Sub3) this).anInt8851;
				int i_1533_ = (((i_1517_ + i_1531_) * (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i);
				for (int i_1534_ = 0; i_1534_ < ((Class160_Sub1_Sub3) this).anInt8851; i_1534_++)
					((Class160_Sub1_Sub3) this).anIntArray10235[(i_1532_ + i_1534_)] = ((((Class160_Sub1_Sub3) this).anIntArray10235[i_1532_ + i_1534_]) & 0xffffff | (is[i_1533_ + i_1534_] != 0 ? -16777216 : 0));
			}
		}
	}

	public void method2750(int i, int i_1535_, int i_1536_, int i_1537_, int i_1538_, int i_1539_) {
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_1540_ = 0; i_1540_ < i_1537_; i_1540_++) {
			int i_1541_ = (i_1535_ + i_1540_) * i_1536_ + i;
			int i_1542_ = (i_1539_ + i_1540_) * i_1536_ + i_1538_;
			for (int i_1543_ = 0; i_1543_ < i_1536_; i_1543_++)
				((Class160_Sub1_Sub3) this).anIntArray10235[i_1541_ + i_1543_] = is[i_1542_ + i_1543_] & 0xffffff;
		}
	}

	void method2755(int i, int i_1544_, int i_1545_, int i_1546_, int i_1547_, int i_1548_, int i_1549_, int i_1550_) {
		if (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (i_1545_ > 0 && i_1546_ > 0) {
			int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
			if (is != null) {
				int i_1551_ = 0;
				int i_1552_ = 0;
				int i_1553_ = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				int i_1554_ = (((Class160_Sub1_Sub3) this).anInt8853 + ((Class160_Sub1_Sub3) this).anInt8851 + ((Class160_Sub1_Sub3) this).anInt8855);
				int i_1555_ = (((Class160_Sub1_Sub3) this).anInt8854 + ((Class160_Sub1_Sub3) this).anInt8867 + ((Class160_Sub1_Sub3) this).anInt8856);
				int i_1556_ = (i_1554_ << 16) / i_1545_;
				int i_1557_ = (i_1555_ << 16) / i_1546_;
				if (((Class160_Sub1_Sub3) this).anInt8853 > 0) {
					int i_1558_ = (((((Class160_Sub1_Sub3) this).anInt8853 << 16) + i_1556_ - 1) / i_1556_);
					i += i_1558_;
					i_1551_ += (i_1558_ * i_1556_ - (((Class160_Sub1_Sub3) this).anInt8853 << 16));
				}
				if (((Class160_Sub1_Sub3) this).anInt8854 > 0) {
					int i_1559_ = (((((Class160_Sub1_Sub3) this).anInt8854 << 16) + i_1557_ - 1) / i_1557_);
					i_1544_ += i_1559_;
					i_1552_ += (i_1559_ * i_1557_ - (((Class160_Sub1_Sub3) this).anInt8854 << 16));
				}
				if (((Class160_Sub1_Sub3) this).anInt8851 < i_1554_)
					i_1545_ = ((((Class160_Sub1_Sub3) this).anInt8851 << 16) - i_1551_ + i_1556_ - 1) / i_1556_;
				if (((Class160_Sub1_Sub3) this).anInt8867 < i_1555_)
					i_1546_ = ((((Class160_Sub1_Sub3) this).anInt8867 << 16) - i_1552_ + i_1557_ - 1) / i_1557_;
				int i_1560_ = i + i_1544_ * i_1553_;
				int i_1561_ = i_1553_ - i_1545_;
				if (i_1544_ + i_1546_ > (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8986 * 1383960921))
					i_1546_ -= (i_1544_ + i_1546_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
				if (i_1544_ < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009) * 1516535457) {
					int i_1562_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457) - i_1544_);
					i_1546_ -= i_1562_;
					i_1560_ += i_1562_ * i_1553_;
					i_1552_ += i_1557_ * i_1562_;
				}
				if (i + i_1545_ > (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002 * -1710988237)) {
					int i_1563_ = (i + i_1545_ - (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt9002) * -1710988237);
					i_1545_ -= i_1563_;
					i_1561_ += i_1563_;
				}
				if (i < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
					int i_1564_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989) - i);
					i_1545_ -= i_1564_;
					i_1560_ += i_1564_;
					i_1551_ += i_1556_ * i_1564_;
					i_1561_ += i_1564_;
				}
				if (i_1549_ == 0) {
					if (i_1547_ == 1) {
						int i_1565_ = i_1551_;
						for (int i_1566_ = -i_1546_; i_1566_ < 0; i_1566_++) {
							int i_1567_ = ((i_1552_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1568_ = -i_1545_; i_1568_ < 0; i_1568_++) {
								is[i_1560_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1551_ >> 16) + i_1567_]);
								i_1551_ += i_1556_;
							}
							i_1552_ += i_1557_;
							i_1551_ = i_1565_;
							i_1560_ += i_1561_;
						}
					} else if (i_1547_ == 0) {
						int i_1569_ = (i_1548_ & 0xff0000) >> 16;
						int i_1570_ = (i_1548_ & 0xff00) >> 8;
						int i_1571_ = i_1548_ & 0xff;
						int i_1572_ = i_1551_;
						for (int i_1573_ = -i_1546_; i_1573_ < 0; i_1573_++) {
							int i_1574_ = ((i_1552_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1575_ = -i_1545_; i_1575_ < 0; i_1575_++) {
								int i_1576_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1551_ >> 16) + i_1574_]);
								int i_1577_ = ((i_1576_ & 0xff0000) * i_1569_ & ~0xffffff);
								int i_1578_ = (i_1576_ & 0xff00) * i_1570_ & 0xff0000;
								int i_1579_ = (i_1576_ & 0xff) * i_1571_ & 0xff00;
								is[i_1560_++] = (i_1577_ | i_1578_ | i_1579_) >>> 8;
								i_1551_ += i_1556_;
							}
							i_1552_ += i_1557_;
							i_1551_ = i_1572_;
							i_1560_ += i_1561_;
						}
					} else if (i_1547_ == 3) {
						int i_1580_ = i_1551_;
						for (int i_1581_ = -i_1546_; i_1581_ < 0; i_1581_++) {
							int i_1582_ = ((i_1552_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1583_ = -i_1545_; i_1583_ < 0; i_1583_++) {
								int i_1584_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1551_ >> 16) + i_1582_]);
								int i_1585_ = i_1584_ + i_1548_;
								int i_1586_ = ((i_1584_ & 0xff00ff) + (i_1548_ & 0xff00ff));
								int i_1587_ = ((i_1586_ & 0x1000100) + (i_1585_ - i_1586_ & 0x10000));
								is[i_1560_++] = i_1585_ - i_1587_ | i_1587_ - (i_1587_ >>> 8);
								i_1551_ += i_1556_;
							}
							i_1552_ += i_1557_;
							i_1551_ = i_1580_;
							i_1560_ += i_1561_;
						}
					} else if (i_1547_ == 2) {
						int i_1588_ = i_1548_ >>> 24;
						int i_1589_ = 256 - i_1588_;
						int i_1590_ = (i_1548_ & 0xff00ff) * i_1589_ & ~0xff00ff;
						int i_1591_ = (i_1548_ & 0xff00) * i_1589_ & 0xff0000;
						i_1548_ = (i_1590_ | i_1591_) >>> 8;
						int i_1592_ = i_1551_;
						for (int i_1593_ = -i_1546_; i_1593_ < 0; i_1593_++) {
							int i_1594_ = ((i_1552_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1595_ = -i_1545_; i_1595_ < 0; i_1595_++) {
								int i_1596_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1551_ >> 16) + i_1594_]);
								i_1590_ = ((i_1596_ & 0xff00ff) * i_1588_ & ~0xff00ff);
								i_1591_ = (i_1596_ & 0xff00) * i_1588_ & 0xff0000;
								is[i_1560_++] = ((i_1590_ | i_1591_) >>> 8) + i_1548_;
								i_1551_ += i_1556_;
							}
							i_1552_ += i_1557_;
							i_1551_ = i_1592_;
							i_1560_ += i_1561_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1549_ == 1) {
					if (i_1547_ == 1) {
						int i_1597_ = i_1551_;
						for (int i_1598_ = -i_1546_; i_1598_ < 0; i_1598_++) {
							int i_1599_ = ((i_1552_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1600_ = -i_1545_; i_1600_ < 0; i_1600_++) {
								int i_1601_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1551_ >> 16) + i_1599_]);
								int i_1602_ = i_1601_ >>> 24;
								int i_1603_ = 256 - i_1602_;
								int i_1604_ = is[i_1560_];
								is[i_1560_++] = (((((i_1601_ & 0xff00ff) * i_1602_ + (i_1604_ & 0xff00ff) * i_1603_) & ~0xff00ff) >> 8) + (((((i_1601_ & ~0xff00ff) >>> 8) * i_1602_) + (((i_1604_ & ~0xff00ff) >>> 8) * i_1603_)) & ~0xff00ff));
								i_1551_ += i_1556_;
							}
							i_1552_ += i_1557_;
							i_1551_ = i_1597_;
							i_1560_ += i_1561_;
						}
					} else if (i_1547_ == 0) {
						int i_1605_ = i_1551_;
						if ((i_1548_ & 0xffffff) == 16777215) {
							for (int i_1606_ = -i_1546_; i_1606_ < 0; i_1606_++) {
								int i_1607_ = ((i_1552_ >> 16) * (((Class160_Sub1_Sub3) this).anInt8851));
								for (int i_1608_ = -i_1545_; i_1608_ < 0; i_1608_++) {
									int i_1609_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1551_ >> 16) + i_1607_]);
									int i_1610_ = ((i_1609_ >>> 24) * (i_1548_ >>> 24) >> 8);
									int i_1611_ = 256 - i_1610_;
									int i_1612_ = is[i_1560_];
									is[i_1560_++] = ((((i_1609_ & 0xff00ff) * i_1610_ + (i_1612_ & 0xff00ff) * i_1611_) & ~0xff00ff) + (((i_1609_ & 0xff00) * i_1610_ + (i_1612_ & 0xff00) * i_1611_) & 0xff0000)) >> 8;
									i_1551_ += i_1556_;
								}
								i_1552_ += i_1557_;
								i_1551_ = i_1605_;
								i_1560_ += i_1561_;
							}
						} else {
							int i_1613_ = (i_1548_ & 0xff0000) >> 16;
							int i_1614_ = (i_1548_ & 0xff00) >> 8;
							int i_1615_ = i_1548_ & 0xff;
							for (int i_1616_ = -i_1546_; i_1616_ < 0; i_1616_++) {
								int i_1617_ = ((i_1552_ >> 16) * (((Class160_Sub1_Sub3) this).anInt8851));
								for (int i_1618_ = -i_1545_; i_1618_ < 0; i_1618_++) {
									int i_1619_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1551_ >> 16) + i_1617_]);
									int i_1620_ = ((i_1619_ >>> 24) * (i_1548_ >>> 24) >> 8);
									int i_1621_ = 256 - i_1620_;
									if (i_1620_ != 255) {
										int i_1622_ = ((i_1619_ & 0xff0000) * i_1613_ & ~0xffffff);
										int i_1623_ = ((i_1619_ & 0xff00) * i_1614_ & 0xff0000);
										int i_1624_ = ((i_1619_ & 0xff) * i_1615_ & 0xff00);
										i_1619_ = (i_1622_ | i_1623_ | i_1624_) >>> 8;
										int i_1625_ = is[i_1560_];
										is[i_1560_++] = ((((i_1619_ & 0xff00ff) * i_1620_ + ((i_1625_ & 0xff00ff) * i_1621_)) & ~0xff00ff) + (((i_1619_ & 0xff00) * i_1620_ + ((i_1625_ & 0xff00) * i_1621_)) & 0xff0000)) >> 8;
									} else {
										int i_1626_ = ((i_1619_ & 0xff0000) * i_1613_ & ~0xffffff);
										int i_1627_ = ((i_1619_ & 0xff00) * i_1614_ & 0xff0000);
										int i_1628_ = ((i_1619_ & 0xff) * i_1615_ & 0xff00);
										is[i_1560_++] = (i_1626_ | i_1627_ | i_1628_) >>> 8;
									}
									i_1551_ += i_1556_;
								}
								i_1552_ += i_1557_;
								i_1551_ = i_1605_;
								i_1560_ += i_1561_;
							}
						}
					} else if (i_1547_ == 3) {
						int i_1629_ = i_1551_;
						for (int i_1630_ = -i_1546_; i_1630_ < 0; i_1630_++) {
							int i_1631_ = ((i_1552_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1632_ = -i_1545_; i_1632_ < 0; i_1632_++) {
								int i_1633_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1551_ >> 16) + i_1631_]);
								int i_1634_ = i_1633_ + i_1548_;
								int i_1635_ = ((i_1633_ & 0xff00ff) + (i_1548_ & 0xff00ff));
								int i_1636_ = ((i_1635_ & 0x1000100) + (i_1634_ - i_1635_ & 0x10000));
								i_1636_ = i_1634_ - i_1636_ | i_1636_ - (i_1636_ >>> 8);
								int i_1637_ = (i_1636_ >>> 24) * (i_1548_ >>> 24) >> 8;
								int i_1638_ = 256 - i_1637_;
								if (i_1637_ != 255) {
									i_1633_ = i_1636_;
									i_1636_ = is[i_1560_];
									i_1636_ = ((((i_1633_ & 0xff00ff) * i_1637_ + (i_1636_ & 0xff00ff) * i_1638_) & ~0xff00ff) + (((i_1633_ & 0xff00) * i_1637_ + (i_1636_ & 0xff00) * i_1638_) & 0xff0000)) >> 8;
								}
								is[i_1560_++] = i_1636_;
								i_1551_ += i_1556_;
							}
							i_1552_ += i_1557_;
							i_1551_ = i_1629_;
							i_1560_ += i_1561_;
						}
					} else if (i_1547_ == 2) {
						int i_1639_ = i_1548_ >>> 24;
						int i_1640_ = 256 - i_1639_;
						int i_1641_ = (i_1548_ & 0xff00ff) * i_1640_ & ~0xff00ff;
						int i_1642_ = (i_1548_ & 0xff00) * i_1640_ & 0xff0000;
						i_1548_ = (i_1641_ | i_1642_) >>> 8;
						int i_1643_ = i_1551_;
						for (int i_1644_ = -i_1546_; i_1644_ < 0; i_1644_++) {
							int i_1645_ = ((i_1552_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1646_ = -i_1545_; i_1646_ < 0; i_1646_++) {
								int i_1647_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1551_ >> 16) + i_1645_]);
								int i_1648_ = i_1647_ >>> 24;
								int i_1649_ = 256 - i_1648_;
								i_1641_ = ((i_1647_ & 0xff00ff) * i_1639_ & ~0xff00ff);
								i_1642_ = (i_1647_ & 0xff00) * i_1639_ & 0xff0000;
								i_1647_ = ((i_1641_ | i_1642_) >>> 8) + i_1548_;
								int i_1650_ = is[i_1560_];
								is[i_1560_++] = ((((i_1647_ & 0xff00ff) * i_1648_ + (i_1650_ & 0xff00ff) * i_1649_) & ~0xff00ff) + (((i_1647_ & 0xff00) * i_1648_ + (i_1650_ & 0xff00) * i_1649_) & 0xff0000)) >> 8;
								i_1551_ += i_1556_;
							}
							i_1552_ += i_1557_;
							i_1551_ = i_1643_;
							i_1560_ += i_1561_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1549_ == 2) {
					if (i_1547_ == 1) {
						int i_1651_ = i_1551_;
						for (int i_1652_ = -i_1546_; i_1652_ < 0; i_1652_++) {
							int i_1653_ = ((i_1552_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1654_ = -i_1545_; i_1654_ < 0; i_1654_++) {
								int i_1655_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1551_ >> 16) + i_1653_]);
								if (i_1655_ != 0) {
									int i_1656_ = is[i_1560_];
									int i_1657_ = i_1655_ + i_1656_;
									int i_1658_ = ((i_1655_ & 0xff00ff) + (i_1656_ & 0xff00ff));
									i_1656_ = ((i_1658_ & 0x1000100) + (i_1657_ - i_1658_ & 0x10000));
									is[i_1560_++] = (i_1657_ - i_1656_ | i_1656_ - (i_1656_ >>> 8));
								} else
									i_1560_++;
								i_1551_ += i_1556_;
							}
							i_1552_ += i_1557_;
							i_1551_ = i_1651_;
							i_1560_ += i_1561_;
						}
					} else if (i_1547_ == 0) {
						int i_1659_ = i_1551_;
						int i_1660_ = (i_1548_ & 0xff0000) >> 16;
						int i_1661_ = (i_1548_ & 0xff00) >> 8;
						int i_1662_ = i_1548_ & 0xff;
						for (int i_1663_ = -i_1546_; i_1663_ < 0; i_1663_++) {
							int i_1664_ = ((i_1552_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1665_ = -i_1545_; i_1665_ < 0; i_1665_++) {
								int i_1666_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1551_ >> 16) + i_1664_]);
								if (i_1666_ != 0) {
									int i_1667_ = ((i_1666_ & 0xff0000) * i_1660_ & ~0xffffff);
									int i_1668_ = ((i_1666_ & 0xff00) * i_1661_ & 0xff0000);
									int i_1669_ = (i_1666_ & 0xff) * i_1662_ & 0xff00;
									i_1666_ = (i_1667_ | i_1668_ | i_1669_) >>> 8;
									int i_1670_ = is[i_1560_];
									int i_1671_ = i_1666_ + i_1670_;
									int i_1672_ = ((i_1666_ & 0xff00ff) + (i_1670_ & 0xff00ff));
									i_1670_ = ((i_1672_ & 0x1000100) + (i_1671_ - i_1672_ & 0x10000));
									is[i_1560_++] = (i_1671_ - i_1670_ | i_1670_ - (i_1670_ >>> 8));
								} else
									i_1560_++;
								i_1551_ += i_1556_;
							}
							i_1552_ += i_1557_;
							i_1551_ = i_1659_;
							i_1560_ += i_1561_;
						}
					} else if (i_1547_ == 3) {
						int i_1673_ = i_1551_;
						for (int i_1674_ = -i_1546_; i_1674_ < 0; i_1674_++) {
							int i_1675_ = ((i_1552_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1676_ = -i_1545_; i_1676_ < 0; i_1676_++) {
								int i_1677_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1551_ >> 16) + i_1675_]);
								int i_1678_ = i_1677_ + i_1548_;
								int i_1679_ = ((i_1677_ & 0xff00ff) + (i_1548_ & 0xff00ff));
								int i_1680_ = ((i_1679_ & 0x1000100) + (i_1678_ - i_1679_ & 0x10000));
								i_1677_ = i_1678_ - i_1680_ | i_1680_ - (i_1680_ >>> 8);
								i_1680_ = is[i_1560_];
								i_1678_ = i_1677_ + i_1680_;
								i_1679_ = (i_1677_ & 0xff00ff) + (i_1680_ & 0xff00ff);
								i_1680_ = ((i_1679_ & 0x1000100) + (i_1678_ - i_1679_ & 0x10000));
								is[i_1560_++] = i_1678_ - i_1680_ | i_1680_ - (i_1680_ >>> 8);
								i_1551_ += i_1556_;
							}
							i_1552_ += i_1557_;
							i_1551_ = i_1673_;
							i_1560_ += i_1561_;
						}
					} else if (i_1547_ == 2) {
						int i_1681_ = i_1548_ >>> 24;
						int i_1682_ = 256 - i_1681_;
						int i_1683_ = (i_1548_ & 0xff00ff) * i_1682_ & ~0xff00ff;
						int i_1684_ = (i_1548_ & 0xff00) * i_1682_ & 0xff0000;
						i_1548_ = (i_1683_ | i_1684_) >>> 8;
						int i_1685_ = i_1551_;
						for (int i_1686_ = -i_1546_; i_1686_ < 0; i_1686_++) {
							int i_1687_ = ((i_1552_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1688_ = -i_1545_; i_1688_ < 0; i_1688_++) {
								int i_1689_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1551_ >> 16) + i_1687_]);
								if (i_1689_ != 0) {
									i_1683_ = ((i_1689_ & 0xff00ff) * i_1681_ & ~0xff00ff);
									i_1684_ = ((i_1689_ & 0xff00) * i_1681_ & 0xff0000);
									i_1689_ = (((i_1683_ | i_1684_) >>> 8) + i_1548_);
									int i_1690_ = is[i_1560_];
									int i_1691_ = i_1689_ + i_1690_;
									int i_1692_ = ((i_1689_ & 0xff00ff) + (i_1690_ & 0xff00ff));
									i_1690_ = ((i_1692_ & 0x1000100) + (i_1691_ - i_1692_ & 0x10000));
									is[i_1560_++] = (i_1691_ - i_1690_ | i_1690_ - (i_1690_ >>> 8));
								} else
									i_1560_++;
								i_1551_ += i_1556_;
							}
							i_1552_ += i_1557_;
							i_1551_ = i_1685_;
							i_1560_ += i_1561_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2784(int i, int i_1693_, Class455 class455, int i_1694_, int i_1695_) {
		if (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			i += ((Class160_Sub1_Sub3) this).anInt8853;
			i_1693_ += ((Class160_Sub1_Sub3) this).anInt8854;
			int i_1696_ = 0;
			int i_1697_ = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			int i_1698_ = ((Class160_Sub1_Sub3) this).anInt8851;
			int i_1699_ = ((Class160_Sub1_Sub3) this).anInt8867;
			int i_1700_ = i_1697_ - i_1698_;
			int i_1701_ = 0;
			int i_1702_ = i + i_1693_ * i_1697_;
			if (i_1693_ < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_1703_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_1693_);
				i_1699_ -= i_1703_;
				i_1693_ = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_1696_ += i_1703_ * i_1698_;
				i_1702_ += i_1703_ * i_1697_;
			}
			if (i_1693_ + i_1699_ > (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_1699_ -= (i_1693_ + i_1699_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_1704_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_1698_ -= i_1704_;
				i = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_1696_ += i_1704_;
				i_1702_ += i_1704_;
				i_1701_ += i_1704_;
				i_1700_ += i_1704_;
			}
			if (i + i_1698_ > (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_1705_ = (i + i_1698_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_1698_ -= i_1705_;
				i_1701_ += i_1705_;
				i_1700_ += i_1705_;
			}
			if (i_1698_ > 0 && i_1699_ > 0) {
				PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
				int[] is_1706_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
				int[] is_1707_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
				int i_1708_ = i_1693_;
				if (i_1695_ > i_1708_) {
					i_1708_ = i_1695_;
					i_1702_ += (i_1695_ - i_1693_) * i_1697_;
					i_1696_ += ((i_1695_ - i_1693_) * ((Class160_Sub1_Sub3) this).anInt8851);
				}
				int i_1709_ = (i_1695_ + is_1706_.length < i_1693_ + i_1699_ ? i_1695_ + is_1706_.length : i_1693_ + i_1699_);
				for (int i_1710_ = i_1708_; i_1710_ < i_1709_; i_1710_++) {
					int i_1711_ = is_1706_[i_1710_ - i_1695_] + i_1694_;
					int i_1712_ = is_1707_[i_1710_ - i_1695_];
					int i_1713_ = i_1698_;
					if (i > i_1711_) {
						int i_1714_ = i - i_1711_;
						if (i_1714_ >= i_1712_) {
							i_1696_ += i_1698_ + i_1701_;
							i_1702_ += i_1698_ + i_1700_;
							continue;
						}
						i_1712_ -= i_1714_;
					} else {
						int i_1715_ = i_1711_ - i;
						if (i_1715_ >= i_1698_) {
							i_1696_ += i_1698_ + i_1701_;
							i_1702_ += i_1698_ + i_1700_;
							continue;
						}
						i_1696_ += i_1715_;
						i_1713_ -= i_1715_;
						i_1702_ += i_1715_;
					}
					int i_1716_ = 0;
					if (i_1713_ < i_1712_)
						i_1712_ = i_1713_;
					else
						i_1716_ = i_1713_ - i_1712_;
					for (int i_1717_ = -i_1712_; i_1717_ < 0; i_1717_++) {
						int i_1718_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1696_++]);
						int i_1719_ = i_1718_ >>> 24;
						int i_1720_ = 256 - i_1719_;
						int i_1721_ = is[i_1702_];
						is[i_1702_++] = ((((i_1718_ & 0xff00ff) * i_1719_ + (i_1721_ & 0xff00ff) * i_1720_) & ~0xff00ff) + (((i_1718_ & 0xff00) * i_1719_ + (i_1721_ & 0xff00) * i_1720_) & 0xff0000)) >> 8;
					}
					i_1696_ += i_1716_ + i_1701_;
					i_1702_ += i_1716_ + i_1700_;
				}
			}
		}
	}

	public void method2769(int i, int i_1722_, int i_1723_, int i_1724_, int i_1725_, int i_1726_) {
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_1727_ = 0; i_1727_ < i_1724_; i_1727_++) {
			int i_1728_ = (i_1722_ + i_1727_) * i_1723_ + i;
			int i_1729_ = (i_1726_ + i_1727_) * i_1723_ + i_1725_;
			for (int i_1730_ = 0; i_1730_ < i_1723_; i_1730_++)
				((Class160_Sub1_Sub3) this).anIntArray10235[i_1728_ + i_1730_] = is[i_1729_ + i_1730_] & 0xffffff;
		}
	}

	public void method2751(int i, int i_1731_, int i_1732_) {
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is == null)
			throw new IllegalStateException("");
		if (i_1732_ == 0) {
			for (int i_1733_ = 0; i_1733_ < ((Class160_Sub1_Sub3) this).anInt8867; i_1733_++) {
				int i_1734_ = i_1733_ * ((Class160_Sub1_Sub3) this).anInt8851;
				int i_1735_ = (((i_1731_ + i_1733_) * (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i);
				for (int i_1736_ = 0; i_1736_ < ((Class160_Sub1_Sub3) this).anInt8851; i_1736_++)
					((Class160_Sub1_Sub3) this).anIntArray10235[(i_1734_ + i_1736_)] = ((((Class160_Sub1_Sub3) this).anIntArray10235[i_1734_ + i_1736_]) & 0xffffff | is[i_1735_ + i_1736_] << 8 & ~0xffffff);
			}
		} else if (i_1732_ == 1) {
			for (int i_1737_ = 0; i_1737_ < ((Class160_Sub1_Sub3) this).anInt8867; i_1737_++) {
				int i_1738_ = i_1737_ * ((Class160_Sub1_Sub3) this).anInt8851;
				int i_1739_ = (((i_1731_ + i_1737_) * (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i);
				for (int i_1740_ = 0; i_1740_ < ((Class160_Sub1_Sub3) this).anInt8851; i_1740_++)
					((Class160_Sub1_Sub3) this).anIntArray10235[(i_1738_ + i_1740_)] = ((((Class160_Sub1_Sub3) this).anIntArray10235[i_1738_ + i_1740_]) & 0xffffff | is[i_1739_ + i_1740_] << 16 & ~0xffffff);
			}
		} else if (i_1732_ == 2) {
			for (int i_1741_ = 0; i_1741_ < ((Class160_Sub1_Sub3) this).anInt8867; i_1741_++) {
				int i_1742_ = i_1741_ * ((Class160_Sub1_Sub3) this).anInt8851;
				int i_1743_ = (((i_1731_ + i_1741_) * (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i);
				for (int i_1744_ = 0; i_1744_ < ((Class160_Sub1_Sub3) this).anInt8851; i_1744_++)
					((Class160_Sub1_Sub3) this).anIntArray10235[(i_1742_ + i_1744_)] = ((((Class160_Sub1_Sub3) this).anIntArray10235[i_1742_ + i_1744_]) & 0xffffff | is[i_1743_ + i_1744_] << 24 & ~0xffffff);
			}
		} else if (i_1732_ == 3) {
			for (int i_1745_ = 0; i_1745_ < ((Class160_Sub1_Sub3) this).anInt8867; i_1745_++) {
				int i_1746_ = i_1745_ * ((Class160_Sub1_Sub3) this).anInt8851;
				int i_1747_ = (((i_1731_ + i_1745_) * (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i);
				for (int i_1748_ = 0; i_1748_ < ((Class160_Sub1_Sub3) this).anInt8851; i_1748_++)
					((Class160_Sub1_Sub3) this).anIntArray10235[(i_1746_ + i_1748_)] = ((((Class160_Sub1_Sub3) this).anIntArray10235[i_1746_ + i_1748_]) & 0xffffff | (is[i_1747_ + i_1748_] != 0 ? -16777216 : 0));
			}
		}
	}

	void method2787(int i, int i_1749_, int i_1750_, int i_1751_, int i_1752_, int i_1753_, int i_1754_, int i_1755_) {
		if (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (i_1750_ > 0 && i_1751_ > 0) {
			int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
			if (is != null) {
				int i_1756_ = 0;
				int i_1757_ = 0;
				int i_1758_ = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				int i_1759_ = (((Class160_Sub1_Sub3) this).anInt8853 + ((Class160_Sub1_Sub3) this).anInt8851 + ((Class160_Sub1_Sub3) this).anInt8855);
				int i_1760_ = (((Class160_Sub1_Sub3) this).anInt8854 + ((Class160_Sub1_Sub3) this).anInt8867 + ((Class160_Sub1_Sub3) this).anInt8856);
				int i_1761_ = (i_1759_ << 16) / i_1750_;
				int i_1762_ = (i_1760_ << 16) / i_1751_;
				if (((Class160_Sub1_Sub3) this).anInt8853 > 0) {
					int i_1763_ = (((((Class160_Sub1_Sub3) this).anInt8853 << 16) + i_1761_ - 1) / i_1761_);
					i += i_1763_;
					i_1756_ += (i_1763_ * i_1761_ - (((Class160_Sub1_Sub3) this).anInt8853 << 16));
				}
				if (((Class160_Sub1_Sub3) this).anInt8854 > 0) {
					int i_1764_ = (((((Class160_Sub1_Sub3) this).anInt8854 << 16) + i_1762_ - 1) / i_1762_);
					i_1749_ += i_1764_;
					i_1757_ += (i_1764_ * i_1762_ - (((Class160_Sub1_Sub3) this).anInt8854 << 16));
				}
				if (((Class160_Sub1_Sub3) this).anInt8851 < i_1759_)
					i_1750_ = ((((Class160_Sub1_Sub3) this).anInt8851 << 16) - i_1756_ + i_1761_ - 1) / i_1761_;
				if (((Class160_Sub1_Sub3) this).anInt8867 < i_1760_)
					i_1751_ = ((((Class160_Sub1_Sub3) this).anInt8867 << 16) - i_1757_ + i_1762_ - 1) / i_1762_;
				int i_1765_ = i + i_1749_ * i_1758_;
				int i_1766_ = i_1758_ - i_1750_;
				if (i_1749_ + i_1751_ > (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8986 * 1383960921))
					i_1751_ -= (i_1749_ + i_1751_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
				if (i_1749_ < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009) * 1516535457) {
					int i_1767_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457) - i_1749_);
					i_1751_ -= i_1767_;
					i_1765_ += i_1767_ * i_1758_;
					i_1757_ += i_1762_ * i_1767_;
				}
				if (i + i_1750_ > (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002 * -1710988237)) {
					int i_1768_ = (i + i_1750_ - (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt9002) * -1710988237);
					i_1750_ -= i_1768_;
					i_1766_ += i_1768_;
				}
				if (i < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
					int i_1769_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989) - i);
					i_1750_ -= i_1769_;
					i_1765_ += i_1769_;
					i_1756_ += i_1761_ * i_1769_;
					i_1766_ += i_1769_;
				}
				if (i_1754_ == 0) {
					if (i_1752_ == 1) {
						int i_1770_ = i_1756_;
						for (int i_1771_ = -i_1751_; i_1771_ < 0; i_1771_++) {
							int i_1772_ = ((i_1757_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1773_ = -i_1750_; i_1773_ < 0; i_1773_++) {
								is[i_1765_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1756_ >> 16) + i_1772_]);
								i_1756_ += i_1761_;
							}
							i_1757_ += i_1762_;
							i_1756_ = i_1770_;
							i_1765_ += i_1766_;
						}
					} else if (i_1752_ == 0) {
						int i_1774_ = (i_1753_ & 0xff0000) >> 16;
						int i_1775_ = (i_1753_ & 0xff00) >> 8;
						int i_1776_ = i_1753_ & 0xff;
						int i_1777_ = i_1756_;
						for (int i_1778_ = -i_1751_; i_1778_ < 0; i_1778_++) {
							int i_1779_ = ((i_1757_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1780_ = -i_1750_; i_1780_ < 0; i_1780_++) {
								int i_1781_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1756_ >> 16) + i_1779_]);
								int i_1782_ = ((i_1781_ & 0xff0000) * i_1774_ & ~0xffffff);
								int i_1783_ = (i_1781_ & 0xff00) * i_1775_ & 0xff0000;
								int i_1784_ = (i_1781_ & 0xff) * i_1776_ & 0xff00;
								is[i_1765_++] = (i_1782_ | i_1783_ | i_1784_) >>> 8;
								i_1756_ += i_1761_;
							}
							i_1757_ += i_1762_;
							i_1756_ = i_1777_;
							i_1765_ += i_1766_;
						}
					} else if (i_1752_ == 3) {
						int i_1785_ = i_1756_;
						for (int i_1786_ = -i_1751_; i_1786_ < 0; i_1786_++) {
							int i_1787_ = ((i_1757_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1788_ = -i_1750_; i_1788_ < 0; i_1788_++) {
								int i_1789_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1756_ >> 16) + i_1787_]);
								int i_1790_ = i_1789_ + i_1753_;
								int i_1791_ = ((i_1789_ & 0xff00ff) + (i_1753_ & 0xff00ff));
								int i_1792_ = ((i_1791_ & 0x1000100) + (i_1790_ - i_1791_ & 0x10000));
								is[i_1765_++] = i_1790_ - i_1792_ | i_1792_ - (i_1792_ >>> 8);
								i_1756_ += i_1761_;
							}
							i_1757_ += i_1762_;
							i_1756_ = i_1785_;
							i_1765_ += i_1766_;
						}
					} else if (i_1752_ == 2) {
						int i_1793_ = i_1753_ >>> 24;
						int i_1794_ = 256 - i_1793_;
						int i_1795_ = (i_1753_ & 0xff00ff) * i_1794_ & ~0xff00ff;
						int i_1796_ = (i_1753_ & 0xff00) * i_1794_ & 0xff0000;
						i_1753_ = (i_1795_ | i_1796_) >>> 8;
						int i_1797_ = i_1756_;
						for (int i_1798_ = -i_1751_; i_1798_ < 0; i_1798_++) {
							int i_1799_ = ((i_1757_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1800_ = -i_1750_; i_1800_ < 0; i_1800_++) {
								int i_1801_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1756_ >> 16) + i_1799_]);
								i_1795_ = ((i_1801_ & 0xff00ff) * i_1793_ & ~0xff00ff);
								i_1796_ = (i_1801_ & 0xff00) * i_1793_ & 0xff0000;
								is[i_1765_++] = ((i_1795_ | i_1796_) >>> 8) + i_1753_;
								i_1756_ += i_1761_;
							}
							i_1757_ += i_1762_;
							i_1756_ = i_1797_;
							i_1765_ += i_1766_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1754_ == 1) {
					if (i_1752_ == 1) {
						int i_1802_ = i_1756_;
						for (int i_1803_ = -i_1751_; i_1803_ < 0; i_1803_++) {
							int i_1804_ = ((i_1757_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1805_ = -i_1750_; i_1805_ < 0; i_1805_++) {
								int i_1806_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1756_ >> 16) + i_1804_]);
								int i_1807_ = i_1806_ >>> 24;
								int i_1808_ = 256 - i_1807_;
								int i_1809_ = is[i_1765_];
								is[i_1765_++] = (((((i_1806_ & 0xff00ff) * i_1807_ + (i_1809_ & 0xff00ff) * i_1808_) & ~0xff00ff) >> 8) + (((((i_1806_ & ~0xff00ff) >>> 8) * i_1807_) + (((i_1809_ & ~0xff00ff) >>> 8) * i_1808_)) & ~0xff00ff));
								i_1756_ += i_1761_;
							}
							i_1757_ += i_1762_;
							i_1756_ = i_1802_;
							i_1765_ += i_1766_;
						}
					} else if (i_1752_ == 0) {
						int i_1810_ = i_1756_;
						if ((i_1753_ & 0xffffff) == 16777215) {
							for (int i_1811_ = -i_1751_; i_1811_ < 0; i_1811_++) {
								int i_1812_ = ((i_1757_ >> 16) * (((Class160_Sub1_Sub3) this).anInt8851));
								for (int i_1813_ = -i_1750_; i_1813_ < 0; i_1813_++) {
									int i_1814_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1756_ >> 16) + i_1812_]);
									int i_1815_ = ((i_1814_ >>> 24) * (i_1753_ >>> 24) >> 8);
									int i_1816_ = 256 - i_1815_;
									int i_1817_ = is[i_1765_];
									is[i_1765_++] = ((((i_1814_ & 0xff00ff) * i_1815_ + (i_1817_ & 0xff00ff) * i_1816_) & ~0xff00ff) + (((i_1814_ & 0xff00) * i_1815_ + (i_1817_ & 0xff00) * i_1816_) & 0xff0000)) >> 8;
									i_1756_ += i_1761_;
								}
								i_1757_ += i_1762_;
								i_1756_ = i_1810_;
								i_1765_ += i_1766_;
							}
						} else {
							int i_1818_ = (i_1753_ & 0xff0000) >> 16;
							int i_1819_ = (i_1753_ & 0xff00) >> 8;
							int i_1820_ = i_1753_ & 0xff;
							for (int i_1821_ = -i_1751_; i_1821_ < 0; i_1821_++) {
								int i_1822_ = ((i_1757_ >> 16) * (((Class160_Sub1_Sub3) this).anInt8851));
								for (int i_1823_ = -i_1750_; i_1823_ < 0; i_1823_++) {
									int i_1824_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1756_ >> 16) + i_1822_]);
									int i_1825_ = ((i_1824_ >>> 24) * (i_1753_ >>> 24) >> 8);
									int i_1826_ = 256 - i_1825_;
									if (i_1825_ != 255) {
										int i_1827_ = ((i_1824_ & 0xff0000) * i_1818_ & ~0xffffff);
										int i_1828_ = ((i_1824_ & 0xff00) * i_1819_ & 0xff0000);
										int i_1829_ = ((i_1824_ & 0xff) * i_1820_ & 0xff00);
										i_1824_ = (i_1827_ | i_1828_ | i_1829_) >>> 8;
										int i_1830_ = is[i_1765_];
										is[i_1765_++] = ((((i_1824_ & 0xff00ff) * i_1825_ + ((i_1830_ & 0xff00ff) * i_1826_)) & ~0xff00ff) + (((i_1824_ & 0xff00) * i_1825_ + ((i_1830_ & 0xff00) * i_1826_)) & 0xff0000)) >> 8;
									} else {
										int i_1831_ = ((i_1824_ & 0xff0000) * i_1818_ & ~0xffffff);
										int i_1832_ = ((i_1824_ & 0xff00) * i_1819_ & 0xff0000);
										int i_1833_ = ((i_1824_ & 0xff) * i_1820_ & 0xff00);
										is[i_1765_++] = (i_1831_ | i_1832_ | i_1833_) >>> 8;
									}
									i_1756_ += i_1761_;
								}
								i_1757_ += i_1762_;
								i_1756_ = i_1810_;
								i_1765_ += i_1766_;
							}
						}
					} else if (i_1752_ == 3) {
						int i_1834_ = i_1756_;
						for (int i_1835_ = -i_1751_; i_1835_ < 0; i_1835_++) {
							int i_1836_ = ((i_1757_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1837_ = -i_1750_; i_1837_ < 0; i_1837_++) {
								int i_1838_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1756_ >> 16) + i_1836_]);
								int i_1839_ = i_1838_ + i_1753_;
								int i_1840_ = ((i_1838_ & 0xff00ff) + (i_1753_ & 0xff00ff));
								int i_1841_ = ((i_1840_ & 0x1000100) + (i_1839_ - i_1840_ & 0x10000));
								i_1841_ = i_1839_ - i_1841_ | i_1841_ - (i_1841_ >>> 8);
								int i_1842_ = (i_1841_ >>> 24) * (i_1753_ >>> 24) >> 8;
								int i_1843_ = 256 - i_1842_;
								if (i_1842_ != 255) {
									i_1838_ = i_1841_;
									i_1841_ = is[i_1765_];
									i_1841_ = ((((i_1838_ & 0xff00ff) * i_1842_ + (i_1841_ & 0xff00ff) * i_1843_) & ~0xff00ff) + (((i_1838_ & 0xff00) * i_1842_ + (i_1841_ & 0xff00) * i_1843_) & 0xff0000)) >> 8;
								}
								is[i_1765_++] = i_1841_;
								i_1756_ += i_1761_;
							}
							i_1757_ += i_1762_;
							i_1756_ = i_1834_;
							i_1765_ += i_1766_;
						}
					} else if (i_1752_ == 2) {
						int i_1844_ = i_1753_ >>> 24;
						int i_1845_ = 256 - i_1844_;
						int i_1846_ = (i_1753_ & 0xff00ff) * i_1845_ & ~0xff00ff;
						int i_1847_ = (i_1753_ & 0xff00) * i_1845_ & 0xff0000;
						i_1753_ = (i_1846_ | i_1847_) >>> 8;
						int i_1848_ = i_1756_;
						for (int i_1849_ = -i_1751_; i_1849_ < 0; i_1849_++) {
							int i_1850_ = ((i_1757_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1851_ = -i_1750_; i_1851_ < 0; i_1851_++) {
								int i_1852_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1756_ >> 16) + i_1850_]);
								int i_1853_ = i_1852_ >>> 24;
								int i_1854_ = 256 - i_1853_;
								i_1846_ = ((i_1852_ & 0xff00ff) * i_1844_ & ~0xff00ff);
								i_1847_ = (i_1852_ & 0xff00) * i_1844_ & 0xff0000;
								i_1852_ = ((i_1846_ | i_1847_) >>> 8) + i_1753_;
								int i_1855_ = is[i_1765_];
								is[i_1765_++] = ((((i_1852_ & 0xff00ff) * i_1853_ + (i_1855_ & 0xff00ff) * i_1854_) & ~0xff00ff) + (((i_1852_ & 0xff00) * i_1853_ + (i_1855_ & 0xff00) * i_1854_) & 0xff0000)) >> 8;
								i_1756_ += i_1761_;
							}
							i_1757_ += i_1762_;
							i_1756_ = i_1848_;
							i_1765_ += i_1766_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1754_ == 2) {
					if (i_1752_ == 1) {
						int i_1856_ = i_1756_;
						for (int i_1857_ = -i_1751_; i_1857_ < 0; i_1857_++) {
							int i_1858_ = ((i_1757_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1859_ = -i_1750_; i_1859_ < 0; i_1859_++) {
								int i_1860_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1756_ >> 16) + i_1858_]);
								if (i_1860_ != 0) {
									int i_1861_ = is[i_1765_];
									int i_1862_ = i_1860_ + i_1861_;
									int i_1863_ = ((i_1860_ & 0xff00ff) + (i_1861_ & 0xff00ff));
									i_1861_ = ((i_1863_ & 0x1000100) + (i_1862_ - i_1863_ & 0x10000));
									is[i_1765_++] = (i_1862_ - i_1861_ | i_1861_ - (i_1861_ >>> 8));
								} else
									i_1765_++;
								i_1756_ += i_1761_;
							}
							i_1757_ += i_1762_;
							i_1756_ = i_1856_;
							i_1765_ += i_1766_;
						}
					} else if (i_1752_ == 0) {
						int i_1864_ = i_1756_;
						int i_1865_ = (i_1753_ & 0xff0000) >> 16;
						int i_1866_ = (i_1753_ & 0xff00) >> 8;
						int i_1867_ = i_1753_ & 0xff;
						for (int i_1868_ = -i_1751_; i_1868_ < 0; i_1868_++) {
							int i_1869_ = ((i_1757_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1870_ = -i_1750_; i_1870_ < 0; i_1870_++) {
								int i_1871_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1756_ >> 16) + i_1869_]);
								if (i_1871_ != 0) {
									int i_1872_ = ((i_1871_ & 0xff0000) * i_1865_ & ~0xffffff);
									int i_1873_ = ((i_1871_ & 0xff00) * i_1866_ & 0xff0000);
									int i_1874_ = (i_1871_ & 0xff) * i_1867_ & 0xff00;
									i_1871_ = (i_1872_ | i_1873_ | i_1874_) >>> 8;
									int i_1875_ = is[i_1765_];
									int i_1876_ = i_1871_ + i_1875_;
									int i_1877_ = ((i_1871_ & 0xff00ff) + (i_1875_ & 0xff00ff));
									i_1875_ = ((i_1877_ & 0x1000100) + (i_1876_ - i_1877_ & 0x10000));
									is[i_1765_++] = (i_1876_ - i_1875_ | i_1875_ - (i_1875_ >>> 8));
								} else
									i_1765_++;
								i_1756_ += i_1761_;
							}
							i_1757_ += i_1762_;
							i_1756_ = i_1864_;
							i_1765_ += i_1766_;
						}
					} else if (i_1752_ == 3) {
						int i_1878_ = i_1756_;
						for (int i_1879_ = -i_1751_; i_1879_ < 0; i_1879_++) {
							int i_1880_ = ((i_1757_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1881_ = -i_1750_; i_1881_ < 0; i_1881_++) {
								int i_1882_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1756_ >> 16) + i_1880_]);
								int i_1883_ = i_1882_ + i_1753_;
								int i_1884_ = ((i_1882_ & 0xff00ff) + (i_1753_ & 0xff00ff));
								int i_1885_ = ((i_1884_ & 0x1000100) + (i_1883_ - i_1884_ & 0x10000));
								i_1882_ = i_1883_ - i_1885_ | i_1885_ - (i_1885_ >>> 8);
								i_1885_ = is[i_1765_];
								i_1883_ = i_1882_ + i_1885_;
								i_1884_ = (i_1882_ & 0xff00ff) + (i_1885_ & 0xff00ff);
								i_1885_ = ((i_1884_ & 0x1000100) + (i_1883_ - i_1884_ & 0x10000));
								is[i_1765_++] = i_1883_ - i_1885_ | i_1885_ - (i_1885_ >>> 8);
								i_1756_ += i_1761_;
							}
							i_1757_ += i_1762_;
							i_1756_ = i_1878_;
							i_1765_ += i_1766_;
						}
					} else if (i_1752_ == 2) {
						int i_1886_ = i_1753_ >>> 24;
						int i_1887_ = 256 - i_1886_;
						int i_1888_ = (i_1753_ & 0xff00ff) * i_1887_ & ~0xff00ff;
						int i_1889_ = (i_1753_ & 0xff00) * i_1887_ & 0xff0000;
						i_1753_ = (i_1888_ | i_1889_) >>> 8;
						int i_1890_ = i_1756_;
						for (int i_1891_ = -i_1751_; i_1891_ < 0; i_1891_++) {
							int i_1892_ = ((i_1757_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_1893_ = -i_1750_; i_1893_ < 0; i_1893_++) {
								int i_1894_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_1756_ >> 16) + i_1892_]);
								if (i_1894_ != 0) {
									i_1888_ = ((i_1894_ & 0xff00ff) * i_1886_ & ~0xff00ff);
									i_1889_ = ((i_1894_ & 0xff00) * i_1886_ & 0xff0000);
									i_1894_ = (((i_1888_ | i_1889_) >>> 8) + i_1753_);
									int i_1895_ = is[i_1765_];
									int i_1896_ = i_1894_ + i_1895_;
									int i_1897_ = ((i_1894_ & 0xff00ff) + (i_1895_ & 0xff00ff));
									i_1895_ = ((i_1897_ & 0x1000100) + (i_1896_ - i_1897_ & 0x10000));
									is[i_1765_++] = (i_1896_ - i_1895_ | i_1895_ - (i_1895_ >>> 8));
								} else
									i_1765_++;
								i_1756_ += i_1761_;
							}
							i_1757_ += i_1762_;
							i_1756_ = i_1890_;
							i_1765_ += i_1766_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method14246(int i, int i_1898_) {
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					int i_1899_ = anInt8864;
					while (i_1899_ < 0) {
						int i_1900_ = anInt8870;
						int i_1901_ = anInt8873;
						int i_1902_ = anInt8874;
						int i_1903_ = anInt8862;
						if (i_1901_ >= 0 && i_1902_ >= 0 && i_1901_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) < 0 && i_1902_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) < 0) {
							for (/**/; i_1903_ < 0; i_1903_++) {
								int i_1904_ = ((i_1902_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851 + (i_1901_ >> 12));
								int i_1905_ = i_1900_++;
								if (i_1898_ == 0) {
									if (i == 1)
										is[i_1905_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1904_]);
									else if (i == 0) {
										int i_1906_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1904_++]);
										int i_1907_ = ((i_1906_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1908_ = ((i_1906_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1909_ = ((i_1906_ & 0xff) * anInt8882 & 0xff00);
										is[i_1905_] = (i_1907_ | i_1908_ | i_1909_) >>> 8;
									} else if (i == 3) {
										int i_1910_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1904_++]);
										int i_1911_ = anInt8877;
										int i_1912_ = i_1910_ + i_1911_;
										int i_1913_ = ((i_1910_ & 0xff00ff) + (i_1911_ & 0xff00ff));
										int i_1914_ = ((i_1913_ & 0x1000100) + (i_1912_ - i_1913_ & 0x10000));
										is[i_1905_] = (i_1912_ - i_1914_ | i_1914_ - (i_1914_ >>> 8));
									} else if (i == 2) {
										int i_1915_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1904_]);
										int i_1916_ = ((i_1915_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1917_ = ((i_1915_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_1905_] = ((i_1916_ | i_1917_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_1898_ == 1) {
									if (i == 1) {
										int i_1918_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1904_]);
										int i_1919_ = i_1918_ >>> 24;
										int i_1920_ = 256 - i_1919_;
										int i_1921_ = is[i_1905_];
										is[i_1905_] = ((((i_1918_ & 0xff00ff) * i_1919_ + ((i_1921_ & 0xff00ff) * i_1920_)) & ~0xff00ff) + (((i_1918_ & 0xff00) * i_1919_ + ((i_1921_ & 0xff00) * i_1920_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_1922_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1904_]);
										int i_1923_ = ((i_1922_ >>> 24) * anInt8878 >> 8);
										int i_1924_ = 256 - i_1923_;
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_1925_ = is[i_1905_];
											is[i_1905_] = (((((i_1922_ & 0xff00ff) * i_1923_) + ((i_1925_ & 0xff00ff) * i_1924_)) & ~0xff00ff) + ((((i_1922_ & 0xff00) * i_1923_) + ((i_1925_ & 0xff00) * i_1924_)) & 0xff0000)) >> 8;
										} else if (i_1923_ != 255) {
											int i_1926_ = (((i_1922_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1927_ = (((i_1922_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1928_ = ((i_1922_ & 0xff) * anInt8882 & 0xff00);
											i_1922_ = (i_1926_ | i_1927_ | i_1928_) >>> 8;
											int i_1929_ = is[i_1905_];
											is[i_1905_] = (((((i_1922_ & 0xff00ff) * i_1923_) + ((i_1929_ & 0xff00ff) * i_1924_)) & ~0xff00ff) + ((((i_1922_ & 0xff00) * i_1923_) + ((i_1929_ & 0xff00) * i_1924_)) & 0xff0000)) >> 8;
										} else {
											int i_1930_ = (((i_1922_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1931_ = (((i_1922_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1932_ = ((i_1922_ & 0xff) * anInt8882 & 0xff00);
											is[i_1905_] = (i_1930_ | i_1931_ | i_1932_) >>> 8;
										}
									} else if (i == 3) {
										int i_1933_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1904_]);
										int i_1934_ = anInt8877;
										int i_1935_ = i_1933_ + i_1934_;
										int i_1936_ = ((i_1933_ & 0xff00ff) + (i_1934_ & 0xff00ff));
										int i_1937_ = ((i_1936_ & 0x1000100) + (i_1935_ - i_1936_ & 0x10000));
										i_1937_ = (i_1935_ - i_1937_ | i_1937_ - (i_1937_ >>> 8));
										int i_1938_ = ((i_1933_ >>> 24) * anInt8878 >> 8);
										int i_1939_ = 256 - i_1938_;
										if (i_1938_ != 255) {
											i_1933_ = i_1937_;
											i_1937_ = is[i_1905_];
											i_1937_ = (((((i_1933_ & 0xff00ff) * i_1938_) + ((i_1937_ & 0xff00ff) * i_1939_)) & ~0xff00ff) + ((((i_1933_ & 0xff00) * i_1938_) + ((i_1937_ & 0xff00) * i_1939_)) & 0xff0000)) >> 8;
										}
										is[i_1905_] = i_1937_;
									} else if (i == 2) {
										int i_1940_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1904_]);
										int i_1941_ = i_1940_ >>> 24;
										int i_1942_ = 256 - i_1941_;
										int i_1943_ = ((i_1940_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1944_ = ((i_1940_ & 0xff00) * anInt8878 & 0xff0000);
										i_1940_ = (((i_1943_ | i_1944_) >>> 8) + anInt8885);
										int i_1945_ = is[i_1905_];
										is[i_1905_] = ((((i_1940_ & 0xff00ff) * i_1941_ + ((i_1945_ & 0xff00ff) * i_1942_)) & ~0xff00ff) + (((i_1940_ & 0xff00) * i_1941_ + ((i_1945_ & 0xff00) * i_1942_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_1898_ == 2) {
									if (i == 1) {
										int i_1946_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1904_]);
										int i_1947_ = is[i_1905_];
										int i_1948_ = i_1946_ + i_1947_;
										int i_1949_ = ((i_1946_ & 0xff00ff) + (i_1947_ & 0xff00ff));
										i_1947_ = ((i_1949_ & 0x1000100) + (i_1948_ - i_1949_ & 0x10000));
										is[i_1905_] = (i_1948_ - i_1947_ | i_1947_ - (i_1947_ >>> 8));
									} else if (i == 0) {
										int i_1950_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1904_]);
										int i_1951_ = ((i_1950_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1952_ = ((i_1950_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1953_ = ((i_1950_ & 0xff) * anInt8882 & 0xff00);
										i_1950_ = (i_1951_ | i_1952_ | i_1953_) >>> 8;
										int i_1954_ = is[i_1905_];
										int i_1955_ = i_1950_ + i_1954_;
										int i_1956_ = ((i_1950_ & 0xff00ff) + (i_1954_ & 0xff00ff));
										i_1954_ = ((i_1956_ & 0x1000100) + (i_1955_ - i_1956_ & 0x10000));
										is[i_1905_] = (i_1955_ - i_1954_ | i_1954_ - (i_1954_ >>> 8));
									} else if (i == 3) {
										int i_1957_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1904_]);
										int i_1958_ = anInt8877;
										int i_1959_ = i_1957_ + i_1958_;
										int i_1960_ = ((i_1957_ & 0xff00ff) + (i_1958_ & 0xff00ff));
										int i_1961_ = ((i_1960_ & 0x1000100) + (i_1959_ - i_1960_ & 0x10000));
										i_1957_ = (i_1959_ - i_1961_ | i_1961_ - (i_1961_ >>> 8));
										i_1961_ = is[i_1905_];
										i_1959_ = i_1957_ + i_1961_;
										i_1960_ = ((i_1957_ & 0xff00ff) + (i_1961_ & 0xff00ff));
										i_1961_ = ((i_1960_ & 0x1000100) + (i_1959_ - i_1960_ & 0x10000));
										is[i_1905_] = (i_1959_ - i_1961_ | i_1961_ - (i_1961_ >>> 8));
									} else if (i == 2) {
										int i_1962_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1904_]);
										int i_1963_ = ((i_1962_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1964_ = ((i_1962_ & 0xff00) * anInt8878 & 0xff0000);
										i_1962_ = (((i_1963_ | i_1964_) >>> 8) + anInt8885);
										int i_1965_ = is[i_1905_];
										int i_1966_ = i_1962_ + i_1965_;
										int i_1967_ = ((i_1962_ & 0xff00ff) + (i_1965_ & 0xff00ff));
										i_1965_ = ((i_1967_ & 0x1000100) + (i_1966_ - i_1967_ & 0x10000));
										is[i_1905_] = (i_1966_ - i_1965_ | i_1965_ - (i_1965_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_1899_++;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_1968_ = anInt8864;
					while (i_1968_ < 0) {
						int i_1969_ = anInt8870;
						int i_1970_ = anInt8873;
						int i_1971_ = anInt8874 + anInt8866;
						int i_1972_ = anInt8862;
						if (i_1970_ >= 0 && i_1970_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) < 0) {
							int i_1973_;
							if ((i_1973_ = (i_1971_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12))) >= 0) {
								i_1973_ = (anInt8868 - i_1973_) / anInt8868;
								i_1972_ += i_1973_;
								i_1971_ += anInt8868 * i_1973_;
								i_1969_ += i_1973_;
							}
							if ((i_1973_ = (i_1971_ - anInt8868) / anInt8868) > i_1972_)
								i_1972_ = i_1973_;
							for (/**/; i_1972_ < 0; i_1972_++) {
								int i_1974_ = ((i_1971_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851 + (i_1970_ >> 12));
								int i_1975_ = i_1969_++;
								if (i_1898_ == 0) {
									if (i == 1)
										is[i_1975_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1974_]);
									else if (i == 0) {
										int i_1976_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1974_++]);
										int i_1977_ = ((i_1976_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1978_ = ((i_1976_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1979_ = ((i_1976_ & 0xff) * anInt8882 & 0xff00);
										is[i_1975_] = (i_1977_ | i_1978_ | i_1979_) >>> 8;
									} else if (i == 3) {
										int i_1980_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1974_++]);
										int i_1981_ = anInt8877;
										int i_1982_ = i_1980_ + i_1981_;
										int i_1983_ = ((i_1980_ & 0xff00ff) + (i_1981_ & 0xff00ff));
										int i_1984_ = ((i_1983_ & 0x1000100) + (i_1982_ - i_1983_ & 0x10000));
										is[i_1975_] = (i_1982_ - i_1984_ | i_1984_ - (i_1984_ >>> 8));
									} else if (i == 2) {
										int i_1985_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1974_]);
										int i_1986_ = ((i_1985_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1987_ = ((i_1985_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_1975_] = ((i_1986_ | i_1987_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_1898_ == 1) {
									if (i == 1) {
										int i_1988_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1974_]);
										int i_1989_ = i_1988_ >>> 24;
										int i_1990_ = 256 - i_1989_;
										int i_1991_ = is[i_1975_];
										is[i_1975_] = ((((i_1988_ & 0xff00ff) * i_1989_ + ((i_1991_ & 0xff00ff) * i_1990_)) & ~0xff00ff) + (((i_1988_ & 0xff00) * i_1989_ + ((i_1991_ & 0xff00) * i_1990_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_1992_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1974_]);
										int i_1993_ = ((i_1992_ >>> 24) * anInt8878 >> 8);
										int i_1994_ = 256 - i_1993_;
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_1995_ = is[i_1975_];
											is[i_1975_] = (((((i_1992_ & 0xff00ff) * i_1993_) + ((i_1995_ & 0xff00ff) * i_1994_)) & ~0xff00ff) + ((((i_1992_ & 0xff00) * i_1993_) + ((i_1995_ & 0xff00) * i_1994_)) & 0xff0000)) >> 8;
										} else if (i_1993_ != 255) {
											int i_1996_ = (((i_1992_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1997_ = (((i_1992_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1998_ = ((i_1992_ & 0xff) * anInt8882 & 0xff00);
											i_1992_ = (i_1996_ | i_1997_ | i_1998_) >>> 8;
											int i_1999_ = is[i_1975_];
											is[i_1975_] = (((((i_1992_ & 0xff00ff) * i_1993_) + ((i_1999_ & 0xff00ff) * i_1994_)) & ~0xff00ff) + ((((i_1992_ & 0xff00) * i_1993_) + ((i_1999_ & 0xff00) * i_1994_)) & 0xff0000)) >> 8;
										} else {
											int i_2000_ = (((i_1992_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2001_ = (((i_1992_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2002_ = ((i_1992_ & 0xff) * anInt8882 & 0xff00);
											is[i_1975_] = (i_2000_ | i_2001_ | i_2002_) >>> 8;
										}
									} else if (i == 3) {
										int i_2003_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1974_]);
										int i_2004_ = anInt8877;
										int i_2005_ = i_2003_ + i_2004_;
										int i_2006_ = ((i_2003_ & 0xff00ff) + (i_2004_ & 0xff00ff));
										int i_2007_ = ((i_2006_ & 0x1000100) + (i_2005_ - i_2006_ & 0x10000));
										i_2007_ = (i_2005_ - i_2007_ | i_2007_ - (i_2007_ >>> 8));
										int i_2008_ = ((i_2003_ >>> 24) * anInt8878 >> 8);
										int i_2009_ = 256 - i_2008_;
										if (i_2008_ != 255) {
											i_2003_ = i_2007_;
											i_2007_ = is[i_1975_];
											i_2007_ = (((((i_2003_ & 0xff00ff) * i_2008_) + ((i_2007_ & 0xff00ff) * i_2009_)) & ~0xff00ff) + ((((i_2003_ & 0xff00) * i_2008_) + ((i_2007_ & 0xff00) * i_2009_)) & 0xff0000)) >> 8;
										}
										is[i_1975_] = i_2007_;
									} else if (i == 2) {
										int i_2010_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1974_]);
										int i_2011_ = i_2010_ >>> 24;
										int i_2012_ = 256 - i_2011_;
										int i_2013_ = ((i_2010_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2014_ = ((i_2010_ & 0xff00) * anInt8878 & 0xff0000);
										i_2010_ = (((i_2013_ | i_2014_) >>> 8) + anInt8885);
										int i_2015_ = is[i_1975_];
										is[i_1975_] = ((((i_2010_ & 0xff00ff) * i_2011_ + ((i_2015_ & 0xff00ff) * i_2012_)) & ~0xff00ff) + (((i_2010_ & 0xff00) * i_2011_ + ((i_2015_ & 0xff00) * i_2012_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_1898_ == 2) {
									if (i == 1) {
										int i_2016_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1974_]);
										int i_2017_ = is[i_1975_];
										int i_2018_ = i_2016_ + i_2017_;
										int i_2019_ = ((i_2016_ & 0xff00ff) + (i_2017_ & 0xff00ff));
										i_2017_ = ((i_2019_ & 0x1000100) + (i_2018_ - i_2019_ & 0x10000));
										is[i_1975_] = (i_2018_ - i_2017_ | i_2017_ - (i_2017_ >>> 8));
									} else if (i == 0) {
										int i_2020_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1974_]);
										int i_2021_ = ((i_2020_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2022_ = ((i_2020_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2023_ = ((i_2020_ & 0xff) * anInt8882 & 0xff00);
										i_2020_ = (i_2021_ | i_2022_ | i_2023_) >>> 8;
										int i_2024_ = is[i_1975_];
										int i_2025_ = i_2020_ + i_2024_;
										int i_2026_ = ((i_2020_ & 0xff00ff) + (i_2024_ & 0xff00ff));
										i_2024_ = ((i_2026_ & 0x1000100) + (i_2025_ - i_2026_ & 0x10000));
										is[i_1975_] = (i_2025_ - i_2024_ | i_2024_ - (i_2024_ >>> 8));
									} else if (i == 3) {
										int i_2027_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1974_]);
										int i_2028_ = anInt8877;
										int i_2029_ = i_2027_ + i_2028_;
										int i_2030_ = ((i_2027_ & 0xff00ff) + (i_2028_ & 0xff00ff));
										int i_2031_ = ((i_2030_ & 0x1000100) + (i_2029_ - i_2030_ & 0x10000));
										i_2027_ = (i_2029_ - i_2031_ | i_2031_ - (i_2031_ >>> 8));
										i_2031_ = is[i_1975_];
										i_2029_ = i_2027_ + i_2031_;
										i_2030_ = ((i_2027_ & 0xff00ff) + (i_2031_ & 0xff00ff));
										i_2031_ = ((i_2030_ & 0x1000100) + (i_2029_ - i_2030_ & 0x10000));
										is[i_1975_] = (i_2029_ - i_2031_ | i_2031_ - (i_2031_ >>> 8));
									} else if (i == 2) {
										int i_2032_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_1974_]);
										int i_2033_ = ((i_2032_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2034_ = ((i_2032_ & 0xff00) * anInt8878 & 0xff0000);
										i_2032_ = (((i_2033_ | i_2034_) >>> 8) + anInt8885);
										int i_2035_ = is[i_1975_];
										int i_2036_ = i_2032_ + i_2035_;
										int i_2037_ = ((i_2032_ & 0xff00ff) + (i_2035_ & 0xff00ff));
										i_2035_ = ((i_2037_ & 0x1000100) + (i_2036_ - i_2037_ & 0x10000));
										is[i_1975_] = (i_2036_ - i_2035_ | i_2035_ - (i_2035_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_1971_ += anInt8868;
							}
						}
						i_1968_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				} else {
					int i_2038_ = anInt8864;
					while (i_2038_ < 0) {
						int i_2039_ = anInt8870;
						int i_2040_ = anInt8873;
						int i_2041_ = anInt8874 + anInt8866;
						int i_2042_ = anInt8862;
						if (i_2040_ >= 0 && i_2040_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) < 0) {
							if (i_2041_ < 0) {
								int i_2043_ = (anInt8868 - 1 - i_2041_) / anInt8868;
								i_2042_ += i_2043_;
								i_2041_ += anInt8868 * i_2043_;
								i_2039_ += i_2043_;
							}
							int i_2044_;
							if ((i_2044_ = (1 + i_2041_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_2042_)
								i_2042_ = i_2044_;
							for (/**/; i_2042_ < 0; i_2042_++) {
								int i_2045_ = ((i_2041_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851 + (i_2040_ >> 12));
								int i_2046_ = i_2039_++;
								if (i_1898_ == 0) {
									if (i == 1)
										is[i_2046_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2045_]);
									else if (i == 0) {
										int i_2047_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2045_++]);
										int i_2048_ = ((i_2047_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2049_ = ((i_2047_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2050_ = ((i_2047_ & 0xff) * anInt8882 & 0xff00);
										is[i_2046_] = (i_2048_ | i_2049_ | i_2050_) >>> 8;
									} else if (i == 3) {
										int i_2051_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2045_++]);
										int i_2052_ = anInt8877;
										int i_2053_ = i_2051_ + i_2052_;
										int i_2054_ = ((i_2051_ & 0xff00ff) + (i_2052_ & 0xff00ff));
										int i_2055_ = ((i_2054_ & 0x1000100) + (i_2053_ - i_2054_ & 0x10000));
										is[i_2046_] = (i_2053_ - i_2055_ | i_2055_ - (i_2055_ >>> 8));
									} else if (i == 2) {
										int i_2056_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2045_]);
										int i_2057_ = ((i_2056_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2058_ = ((i_2056_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2046_] = ((i_2057_ | i_2058_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_1898_ == 1) {
									if (i == 1) {
										int i_2059_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2045_]);
										int i_2060_ = i_2059_ >>> 24;
										int i_2061_ = 256 - i_2060_;
										int i_2062_ = is[i_2046_];
										is[i_2046_] = ((((i_2059_ & 0xff00ff) * i_2060_ + ((i_2062_ & 0xff00ff) * i_2061_)) & ~0xff00ff) + (((i_2059_ & 0xff00) * i_2060_ + ((i_2062_ & 0xff00) * i_2061_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_2063_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2045_]);
										int i_2064_ = ((i_2063_ >>> 24) * anInt8878 >> 8);
										int i_2065_ = 256 - i_2064_;
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_2066_ = is[i_2046_];
											is[i_2046_] = (((((i_2063_ & 0xff00ff) * i_2064_) + ((i_2066_ & 0xff00ff) * i_2065_)) & ~0xff00ff) + ((((i_2063_ & 0xff00) * i_2064_) + ((i_2066_ & 0xff00) * i_2065_)) & 0xff0000)) >> 8;
										} else if (i_2064_ != 255) {
											int i_2067_ = (((i_2063_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2068_ = (((i_2063_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2069_ = ((i_2063_ & 0xff) * anInt8882 & 0xff00);
											i_2063_ = (i_2067_ | i_2068_ | i_2069_) >>> 8;
											int i_2070_ = is[i_2046_];
											is[i_2046_] = (((((i_2063_ & 0xff00ff) * i_2064_) + ((i_2070_ & 0xff00ff) * i_2065_)) & ~0xff00ff) + ((((i_2063_ & 0xff00) * i_2064_) + ((i_2070_ & 0xff00) * i_2065_)) & 0xff0000)) >> 8;
										} else {
											int i_2071_ = (((i_2063_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2072_ = (((i_2063_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2073_ = ((i_2063_ & 0xff) * anInt8882 & 0xff00);
											is[i_2046_] = (i_2071_ | i_2072_ | i_2073_) >>> 8;
										}
									} else if (i == 3) {
										int i_2074_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2045_]);
										int i_2075_ = anInt8877;
										int i_2076_ = i_2074_ + i_2075_;
										int i_2077_ = ((i_2074_ & 0xff00ff) + (i_2075_ & 0xff00ff));
										int i_2078_ = ((i_2077_ & 0x1000100) + (i_2076_ - i_2077_ & 0x10000));
										i_2078_ = (i_2076_ - i_2078_ | i_2078_ - (i_2078_ >>> 8));
										int i_2079_ = ((i_2074_ >>> 24) * anInt8878 >> 8);
										int i_2080_ = 256 - i_2079_;
										if (i_2079_ != 255) {
											i_2074_ = i_2078_;
											i_2078_ = is[i_2046_];
											i_2078_ = (((((i_2074_ & 0xff00ff) * i_2079_) + ((i_2078_ & 0xff00ff) * i_2080_)) & ~0xff00ff) + ((((i_2074_ & 0xff00) * i_2079_) + ((i_2078_ & 0xff00) * i_2080_)) & 0xff0000)) >> 8;
										}
										is[i_2046_] = i_2078_;
									} else if (i == 2) {
										int i_2081_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2045_]);
										int i_2082_ = i_2081_ >>> 24;
										int i_2083_ = 256 - i_2082_;
										int i_2084_ = ((i_2081_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2085_ = ((i_2081_ & 0xff00) * anInt8878 & 0xff0000);
										i_2081_ = (((i_2084_ | i_2085_) >>> 8) + anInt8885);
										int i_2086_ = is[i_2046_];
										is[i_2046_] = ((((i_2081_ & 0xff00ff) * i_2082_ + ((i_2086_ & 0xff00ff) * i_2083_)) & ~0xff00ff) + (((i_2081_ & 0xff00) * i_2082_ + ((i_2086_ & 0xff00) * i_2083_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_1898_ == 2) {
									if (i == 1) {
										int i_2087_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2045_]);
										int i_2088_ = is[i_2046_];
										int i_2089_ = i_2087_ + i_2088_;
										int i_2090_ = ((i_2087_ & 0xff00ff) + (i_2088_ & 0xff00ff));
										i_2088_ = ((i_2090_ & 0x1000100) + (i_2089_ - i_2090_ & 0x10000));
										is[i_2046_] = (i_2089_ - i_2088_ | i_2088_ - (i_2088_ >>> 8));
									} else if (i == 0) {
										int i_2091_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2045_]);
										int i_2092_ = ((i_2091_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2093_ = ((i_2091_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2094_ = ((i_2091_ & 0xff) * anInt8882 & 0xff00);
										i_2091_ = (i_2092_ | i_2093_ | i_2094_) >>> 8;
										int i_2095_ = is[i_2046_];
										int i_2096_ = i_2091_ + i_2095_;
										int i_2097_ = ((i_2091_ & 0xff00ff) + (i_2095_ & 0xff00ff));
										i_2095_ = ((i_2097_ & 0x1000100) + (i_2096_ - i_2097_ & 0x10000));
										is[i_2046_] = (i_2096_ - i_2095_ | i_2095_ - (i_2095_ >>> 8));
									} else if (i == 3) {
										int i_2098_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2045_]);
										int i_2099_ = anInt8877;
										int i_2100_ = i_2098_ + i_2099_;
										int i_2101_ = ((i_2098_ & 0xff00ff) + (i_2099_ & 0xff00ff));
										int i_2102_ = ((i_2101_ & 0x1000100) + (i_2100_ - i_2101_ & 0x10000));
										i_2098_ = (i_2100_ - i_2102_ | i_2102_ - (i_2102_ >>> 8));
										i_2102_ = is[i_2046_];
										i_2100_ = i_2098_ + i_2102_;
										i_2101_ = ((i_2098_ & 0xff00ff) + (i_2102_ & 0xff00ff));
										i_2102_ = ((i_2101_ & 0x1000100) + (i_2100_ - i_2101_ & 0x10000));
										is[i_2046_] = (i_2100_ - i_2102_ | i_2102_ - (i_2102_ >>> 8));
									} else if (i == 2) {
										int i_2103_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2045_]);
										int i_2104_ = ((i_2103_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2105_ = ((i_2103_ & 0xff00) * anInt8878 & 0xff0000);
										i_2103_ = (((i_2104_ | i_2105_) >>> 8) + anInt8885);
										int i_2106_ = is[i_2046_];
										int i_2107_ = i_2103_ + i_2106_;
										int i_2108_ = ((i_2103_ & 0xff00ff) + (i_2106_ & 0xff00ff));
										i_2106_ = ((i_2108_ & 0x1000100) + (i_2107_ - i_2108_ & 0x10000));
										is[i_2046_] = (i_2107_ - i_2106_ | i_2106_ - (i_2106_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_2041_ += anInt8868;
							}
						}
						i_2038_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					int i_2109_ = anInt8864;
					while (i_2109_ < 0) {
						int i_2110_ = anInt8870;
						int i_2111_ = anInt8873 + anInt8858;
						int i_2112_ = anInt8874;
						int i_2113_ = anInt8862;
						if (i_2112_ >= 0 && i_2112_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) < 0) {
							int i_2114_;
							if ((i_2114_ = (i_2111_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12))) >= 0) {
								i_2114_ = (anInt8865 - i_2114_) / anInt8865;
								i_2113_ += i_2114_;
								i_2111_ += anInt8865 * i_2114_;
								i_2110_ += i_2114_;
							}
							if ((i_2114_ = (i_2111_ - anInt8865) / anInt8865) > i_2113_)
								i_2113_ = i_2114_;
							for (/**/; i_2113_ < 0; i_2113_++) {
								int i_2115_ = ((i_2112_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851 + (i_2111_ >> 12));
								int i_2116_ = i_2110_++;
								if (i_1898_ == 0) {
									if (i == 1)
										is[i_2116_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2115_]);
									else if (i == 0) {
										int i_2117_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2115_++]);
										int i_2118_ = ((i_2117_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2119_ = ((i_2117_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2120_ = ((i_2117_ & 0xff) * anInt8882 & 0xff00);
										is[i_2116_] = (i_2118_ | i_2119_ | i_2120_) >>> 8;
									} else if (i == 3) {
										int i_2121_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2115_++]);
										int i_2122_ = anInt8877;
										int i_2123_ = i_2121_ + i_2122_;
										int i_2124_ = ((i_2121_ & 0xff00ff) + (i_2122_ & 0xff00ff));
										int i_2125_ = ((i_2124_ & 0x1000100) + (i_2123_ - i_2124_ & 0x10000));
										is[i_2116_] = (i_2123_ - i_2125_ | i_2125_ - (i_2125_ >>> 8));
									} else if (i == 2) {
										int i_2126_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2115_]);
										int i_2127_ = ((i_2126_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2128_ = ((i_2126_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2116_] = ((i_2127_ | i_2128_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_1898_ == 1) {
									if (i == 1) {
										int i_2129_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2115_]);
										int i_2130_ = i_2129_ >>> 24;
										int i_2131_ = 256 - i_2130_;
										int i_2132_ = is[i_2116_];
										is[i_2116_] = ((((i_2129_ & 0xff00ff) * i_2130_ + ((i_2132_ & 0xff00ff) * i_2131_)) & ~0xff00ff) + (((i_2129_ & 0xff00) * i_2130_ + ((i_2132_ & 0xff00) * i_2131_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_2133_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2115_]);
										int i_2134_ = ((i_2133_ >>> 24) * anInt8878 >> 8);
										int i_2135_ = 256 - i_2134_;
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_2136_ = is[i_2116_];
											is[i_2116_] = (((((i_2133_ & 0xff00ff) * i_2134_) + ((i_2136_ & 0xff00ff) * i_2135_)) & ~0xff00ff) + ((((i_2133_ & 0xff00) * i_2134_) + ((i_2136_ & 0xff00) * i_2135_)) & 0xff0000)) >> 8;
										} else if (i_2134_ != 255) {
											int i_2137_ = (((i_2133_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2138_ = (((i_2133_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2139_ = ((i_2133_ & 0xff) * anInt8882 & 0xff00);
											i_2133_ = (i_2137_ | i_2138_ | i_2139_) >>> 8;
											int i_2140_ = is[i_2116_];
											is[i_2116_] = (((((i_2133_ & 0xff00ff) * i_2134_) + ((i_2140_ & 0xff00ff) * i_2135_)) & ~0xff00ff) + ((((i_2133_ & 0xff00) * i_2134_) + ((i_2140_ & 0xff00) * i_2135_)) & 0xff0000)) >> 8;
										} else {
											int i_2141_ = (((i_2133_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2142_ = (((i_2133_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2143_ = ((i_2133_ & 0xff) * anInt8882 & 0xff00);
											is[i_2116_] = (i_2141_ | i_2142_ | i_2143_) >>> 8;
										}
									} else if (i == 3) {
										int i_2144_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2115_]);
										int i_2145_ = anInt8877;
										int i_2146_ = i_2144_ + i_2145_;
										int i_2147_ = ((i_2144_ & 0xff00ff) + (i_2145_ & 0xff00ff));
										int i_2148_ = ((i_2147_ & 0x1000100) + (i_2146_ - i_2147_ & 0x10000));
										i_2148_ = (i_2146_ - i_2148_ | i_2148_ - (i_2148_ >>> 8));
										int i_2149_ = ((i_2144_ >>> 24) * anInt8878 >> 8);
										int i_2150_ = 256 - i_2149_;
										if (i_2149_ != 255) {
											i_2144_ = i_2148_;
											i_2148_ = is[i_2116_];
											i_2148_ = (((((i_2144_ & 0xff00ff) * i_2149_) + ((i_2148_ & 0xff00ff) * i_2150_)) & ~0xff00ff) + ((((i_2144_ & 0xff00) * i_2149_) + ((i_2148_ & 0xff00) * i_2150_)) & 0xff0000)) >> 8;
										}
										is[i_2116_] = i_2148_;
									} else if (i == 2) {
										int i_2151_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2115_]);
										int i_2152_ = i_2151_ >>> 24;
										int i_2153_ = 256 - i_2152_;
										int i_2154_ = ((i_2151_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2155_ = ((i_2151_ & 0xff00) * anInt8878 & 0xff0000);
										i_2151_ = (((i_2154_ | i_2155_) >>> 8) + anInt8885);
										int i_2156_ = is[i_2116_];
										is[i_2116_] = ((((i_2151_ & 0xff00ff) * i_2152_ + ((i_2156_ & 0xff00ff) * i_2153_)) & ~0xff00ff) + (((i_2151_ & 0xff00) * i_2152_ + ((i_2156_ & 0xff00) * i_2153_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_1898_ == 2) {
									if (i == 1) {
										int i_2157_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2115_]);
										int i_2158_ = is[i_2116_];
										int i_2159_ = i_2157_ + i_2158_;
										int i_2160_ = ((i_2157_ & 0xff00ff) + (i_2158_ & 0xff00ff));
										i_2158_ = ((i_2160_ & 0x1000100) + (i_2159_ - i_2160_ & 0x10000));
										is[i_2116_] = (i_2159_ - i_2158_ | i_2158_ - (i_2158_ >>> 8));
									} else if (i == 0) {
										int i_2161_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2115_]);
										int i_2162_ = ((i_2161_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2163_ = ((i_2161_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2164_ = ((i_2161_ & 0xff) * anInt8882 & 0xff00);
										i_2161_ = (i_2162_ | i_2163_ | i_2164_) >>> 8;
										int i_2165_ = is[i_2116_];
										int i_2166_ = i_2161_ + i_2165_;
										int i_2167_ = ((i_2161_ & 0xff00ff) + (i_2165_ & 0xff00ff));
										i_2165_ = ((i_2167_ & 0x1000100) + (i_2166_ - i_2167_ & 0x10000));
										is[i_2116_] = (i_2166_ - i_2165_ | i_2165_ - (i_2165_ >>> 8));
									} else if (i == 3) {
										int i_2168_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2115_]);
										int i_2169_ = anInt8877;
										int i_2170_ = i_2168_ + i_2169_;
										int i_2171_ = ((i_2168_ & 0xff00ff) + (i_2169_ & 0xff00ff));
										int i_2172_ = ((i_2171_ & 0x1000100) + (i_2170_ - i_2171_ & 0x10000));
										i_2168_ = (i_2170_ - i_2172_ | i_2172_ - (i_2172_ >>> 8));
										i_2172_ = is[i_2116_];
										i_2170_ = i_2168_ + i_2172_;
										i_2171_ = ((i_2168_ & 0xff00ff) + (i_2172_ & 0xff00ff));
										i_2172_ = ((i_2171_ & 0x1000100) + (i_2170_ - i_2171_ & 0x10000));
										is[i_2116_] = (i_2170_ - i_2172_ | i_2172_ - (i_2172_ >>> 8));
									} else if (i == 2) {
										int i_2173_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2115_]);
										int i_2174_ = ((i_2173_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2175_ = ((i_2173_ & 0xff00) * anInt8878 & 0xff0000);
										i_2173_ = (((i_2174_ | i_2175_) >>> 8) + anInt8885);
										int i_2176_ = is[i_2116_];
										int i_2177_ = i_2173_ + i_2176_;
										int i_2178_ = ((i_2173_ & 0xff00ff) + (i_2176_ & 0xff00ff));
										i_2176_ = ((i_2178_ & 0x1000100) + (i_2177_ - i_2178_ & 0x10000));
										is[i_2116_] = (i_2177_ - i_2176_ | i_2176_ - (i_2176_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_2111_ += anInt8865;
							}
						}
						i_2109_++;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_2179_ = anInt8864;
					while (i_2179_ < 0) {
						int i_2180_ = anInt8870;
						int i_2181_ = anInt8873 + anInt8858;
						int i_2182_ = anInt8874 + anInt8866;
						int i_2183_ = anInt8862;
						int i_2184_;
						if ((i_2184_ = i_2181_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12)) >= 0) {
							i_2184_ = (anInt8865 - i_2184_) / anInt8865;
							i_2183_ += i_2184_;
							i_2181_ += anInt8865 * i_2184_;
							i_2182_ += anInt8868 * i_2184_;
							i_2180_ += i_2184_;
						}
						if ((i_2184_ = (i_2181_ - anInt8865) / anInt8865) > i_2183_)
							i_2183_ = i_2184_;
						if ((i_2184_ = i_2182_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12)) >= 0) {
							i_2184_ = (anInt8868 - i_2184_) / anInt8868;
							i_2183_ += i_2184_;
							i_2181_ += anInt8865 * i_2184_;
							i_2182_ += anInt8868 * i_2184_;
							i_2180_ += i_2184_;
						}
						if ((i_2184_ = (i_2182_ - anInt8868) / anInt8868) > i_2183_)
							i_2183_ = i_2184_;
						for (/**/; i_2183_ < 0; i_2183_++) {
							int i_2185_ = (((i_2182_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_2181_ >> 12));
							int i_2186_ = i_2180_++;
							if (i_1898_ == 0) {
								if (i == 1)
									is[i_2186_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2185_]);
								else if (i == 0) {
									int i_2187_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2185_++]);
									int i_2188_ = ((i_2187_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2189_ = ((i_2187_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2190_ = ((i_2187_ & 0xff) * anInt8882 & 0xff00);
									is[i_2186_] = (i_2188_ | i_2189_ | i_2190_) >>> 8;
								} else if (i == 3) {
									int i_2191_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2185_++]);
									int i_2192_ = anInt8877;
									int i_2193_ = i_2191_ + i_2192_;
									int i_2194_ = ((i_2191_ & 0xff00ff) + (i_2192_ & 0xff00ff));
									int i_2195_ = ((i_2194_ & 0x1000100) + (i_2193_ - i_2194_ & 0x10000));
									is[i_2186_] = (i_2193_ - i_2195_ | i_2195_ - (i_2195_ >>> 8));
								} else if (i == 2) {
									int i_2196_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2185_]);
									int i_2197_ = ((i_2196_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2198_ = ((i_2196_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2186_] = (((i_2197_ | i_2198_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_1898_ == 1) {
								if (i == 1) {
									int i_2199_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2185_]);
									int i_2200_ = i_2199_ >>> 24;
									int i_2201_ = 256 - i_2200_;
									int i_2202_ = is[i_2186_];
									is[i_2186_] = ((((i_2199_ & 0xff00ff) * i_2200_ + (i_2202_ & 0xff00ff) * i_2201_) & ~0xff00ff) + (((i_2199_ & 0xff00) * i_2200_ + (i_2202_ & 0xff00) * i_2201_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_2203_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2185_]);
									int i_2204_ = (i_2203_ >>> 24) * anInt8878 >> 8;
									int i_2205_ = 256 - i_2204_;
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_2206_ = is[i_2186_];
										is[i_2186_] = ((((i_2203_ & 0xff00ff) * i_2204_ + ((i_2206_ & 0xff00ff) * i_2205_)) & ~0xff00ff) + (((i_2203_ & 0xff00) * i_2204_ + ((i_2206_ & 0xff00) * i_2205_)) & 0xff0000)) >> 8;
									} else if (i_2204_ != 255) {
										int i_2207_ = ((i_2203_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2208_ = ((i_2203_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2209_ = ((i_2203_ & 0xff) * anInt8882 & 0xff00);
										i_2203_ = (i_2207_ | i_2208_ | i_2209_) >>> 8;
										int i_2210_ = is[i_2186_];
										is[i_2186_] = ((((i_2203_ & 0xff00ff) * i_2204_ + ((i_2210_ & 0xff00ff) * i_2205_)) & ~0xff00ff) + (((i_2203_ & 0xff00) * i_2204_ + ((i_2210_ & 0xff00) * i_2205_)) & 0xff0000)) >> 8;
									} else {
										int i_2211_ = ((i_2203_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2212_ = ((i_2203_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2213_ = ((i_2203_ & 0xff) * anInt8882 & 0xff00);
										is[i_2186_] = (i_2211_ | i_2212_ | i_2213_) >>> 8;
									}
								} else if (i == 3) {
									int i_2214_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2185_]);
									int i_2215_ = anInt8877;
									int i_2216_ = i_2214_ + i_2215_;
									int i_2217_ = ((i_2214_ & 0xff00ff) + (i_2215_ & 0xff00ff));
									int i_2218_ = ((i_2217_ & 0x1000100) + (i_2216_ - i_2217_ & 0x10000));
									i_2218_ = (i_2216_ - i_2218_ | i_2218_ - (i_2218_ >>> 8));
									int i_2219_ = (i_2214_ >>> 24) * anInt8878 >> 8;
									int i_2220_ = 256 - i_2219_;
									if (i_2219_ != 255) {
										i_2214_ = i_2218_;
										i_2218_ = is[i_2186_];
										i_2218_ = ((((i_2214_ & 0xff00ff) * i_2219_ + ((i_2218_ & 0xff00ff) * i_2220_)) & ~0xff00ff) + (((i_2214_ & 0xff00) * i_2219_ + ((i_2218_ & 0xff00) * i_2220_)) & 0xff0000)) >> 8;
									}
									is[i_2186_] = i_2218_;
								} else if (i == 2) {
									int i_2221_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2185_]);
									int i_2222_ = i_2221_ >>> 24;
									int i_2223_ = 256 - i_2222_;
									int i_2224_ = ((i_2221_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2225_ = ((i_2221_ & 0xff00) * anInt8878 & 0xff0000);
									i_2221_ = (((i_2224_ | i_2225_) >>> 8) + anInt8885);
									int i_2226_ = is[i_2186_];
									is[i_2186_] = ((((i_2221_ & 0xff00ff) * i_2222_ + (i_2226_ & 0xff00ff) * i_2223_) & ~0xff00ff) + (((i_2221_ & 0xff00) * i_2222_ + (i_2226_ & 0xff00) * i_2223_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_1898_ == 2) {
								if (i == 1) {
									int i_2227_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2185_]);
									int i_2228_ = is[i_2186_];
									int i_2229_ = i_2227_ + i_2228_;
									int i_2230_ = ((i_2227_ & 0xff00ff) + (i_2228_ & 0xff00ff));
									i_2228_ = ((i_2230_ & 0x1000100) + (i_2229_ - i_2230_ & 0x10000));
									is[i_2186_] = (i_2229_ - i_2228_ | i_2228_ - (i_2228_ >>> 8));
								} else if (i == 0) {
									int i_2231_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2185_]);
									int i_2232_ = ((i_2231_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2233_ = ((i_2231_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2234_ = ((i_2231_ & 0xff) * anInt8882 & 0xff00);
									i_2231_ = (i_2232_ | i_2233_ | i_2234_) >>> 8;
									int i_2235_ = is[i_2186_];
									int i_2236_ = i_2231_ + i_2235_;
									int i_2237_ = ((i_2231_ & 0xff00ff) + (i_2235_ & 0xff00ff));
									i_2235_ = ((i_2237_ & 0x1000100) + (i_2236_ - i_2237_ & 0x10000));
									is[i_2186_] = (i_2236_ - i_2235_ | i_2235_ - (i_2235_ >>> 8));
								} else if (i == 3) {
									int i_2238_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2185_]);
									int i_2239_ = anInt8877;
									int i_2240_ = i_2238_ + i_2239_;
									int i_2241_ = ((i_2238_ & 0xff00ff) + (i_2239_ & 0xff00ff));
									int i_2242_ = ((i_2241_ & 0x1000100) + (i_2240_ - i_2241_ & 0x10000));
									i_2238_ = (i_2240_ - i_2242_ | i_2242_ - (i_2242_ >>> 8));
									i_2242_ = is[i_2186_];
									i_2240_ = i_2238_ + i_2242_;
									i_2241_ = (i_2238_ & 0xff00ff) + (i_2242_ & 0xff00ff);
									i_2242_ = ((i_2241_ & 0x1000100) + (i_2240_ - i_2241_ & 0x10000));
									is[i_2186_] = (i_2240_ - i_2242_ | i_2242_ - (i_2242_ >>> 8));
								} else if (i == 2) {
									int i_2243_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2185_]);
									int i_2244_ = ((i_2243_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2245_ = ((i_2243_ & 0xff00) * anInt8878 & 0xff0000);
									i_2243_ = (((i_2244_ | i_2245_) >>> 8) + anInt8885);
									int i_2246_ = is[i_2186_];
									int i_2247_ = i_2243_ + i_2246_;
									int i_2248_ = ((i_2243_ & 0xff00ff) + (i_2246_ & 0xff00ff));
									i_2246_ = ((i_2248_ & 0x1000100) + (i_2247_ - i_2248_ & 0x10000));
									is[i_2186_] = (i_2247_ - i_2246_ | i_2246_ - (i_2246_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_2181_ += anInt8865;
							i_2182_ += anInt8868;
						}
						i_2179_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else {
					int i_2249_ = anInt8864;
					while (i_2249_ < 0) {
						int i_2250_ = anInt8870;
						int i_2251_ = anInt8873 + anInt8858;
						int i_2252_ = anInt8874 + anInt8866;
						int i_2253_ = anInt8862;
						int i_2254_;
						if ((i_2254_ = i_2251_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12)) >= 0) {
							i_2254_ = (anInt8865 - i_2254_) / anInt8865;
							i_2253_ += i_2254_;
							i_2251_ += anInt8865 * i_2254_;
							i_2252_ += anInt8868 * i_2254_;
							i_2250_ += i_2254_;
						}
						if ((i_2254_ = (i_2251_ - anInt8865) / anInt8865) > i_2253_)
							i_2253_ = i_2254_;
						if (i_2252_ < 0) {
							i_2254_ = (anInt8868 - 1 - i_2252_) / anInt8868;
							i_2253_ += i_2254_;
							i_2251_ += anInt8865 * i_2254_;
							i_2252_ += anInt8868 * i_2254_;
							i_2250_ += i_2254_;
						}
						if ((i_2254_ = (1 + i_2252_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_2253_)
							i_2253_ = i_2254_;
						for (/**/; i_2253_ < 0; i_2253_++) {
							int i_2255_ = (((i_2252_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_2251_ >> 12));
							int i_2256_ = i_2250_++;
							if (i_1898_ == 0) {
								if (i == 1)
									is[i_2256_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2255_]);
								else if (i == 0) {
									int i_2257_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2255_++]);
									int i_2258_ = ((i_2257_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2259_ = ((i_2257_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2260_ = ((i_2257_ & 0xff) * anInt8882 & 0xff00);
									is[i_2256_] = (i_2258_ | i_2259_ | i_2260_) >>> 8;
								} else if (i == 3) {
									int i_2261_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2255_++]);
									int i_2262_ = anInt8877;
									int i_2263_ = i_2261_ + i_2262_;
									int i_2264_ = ((i_2261_ & 0xff00ff) + (i_2262_ & 0xff00ff));
									int i_2265_ = ((i_2264_ & 0x1000100) + (i_2263_ - i_2264_ & 0x10000));
									is[i_2256_] = (i_2263_ - i_2265_ | i_2265_ - (i_2265_ >>> 8));
								} else if (i == 2) {
									int i_2266_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2255_]);
									int i_2267_ = ((i_2266_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2268_ = ((i_2266_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2256_] = (((i_2267_ | i_2268_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_1898_ == 1) {
								if (i == 1) {
									int i_2269_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2255_]);
									int i_2270_ = i_2269_ >>> 24;
									int i_2271_ = 256 - i_2270_;
									int i_2272_ = is[i_2256_];
									is[i_2256_] = ((((i_2269_ & 0xff00ff) * i_2270_ + (i_2272_ & 0xff00ff) * i_2271_) & ~0xff00ff) + (((i_2269_ & 0xff00) * i_2270_ + (i_2272_ & 0xff00) * i_2271_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_2273_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2255_]);
									int i_2274_ = (i_2273_ >>> 24) * anInt8878 >> 8;
									int i_2275_ = 256 - i_2274_;
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_2276_ = is[i_2256_];
										is[i_2256_] = ((((i_2273_ & 0xff00ff) * i_2274_ + ((i_2276_ & 0xff00ff) * i_2275_)) & ~0xff00ff) + (((i_2273_ & 0xff00) * i_2274_ + ((i_2276_ & 0xff00) * i_2275_)) & 0xff0000)) >> 8;
									} else if (i_2274_ != 255) {
										int i_2277_ = ((i_2273_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2278_ = ((i_2273_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2279_ = ((i_2273_ & 0xff) * anInt8882 & 0xff00);
										i_2273_ = (i_2277_ | i_2278_ | i_2279_) >>> 8;
										int i_2280_ = is[i_2256_];
										is[i_2256_] = ((((i_2273_ & 0xff00ff) * i_2274_ + ((i_2280_ & 0xff00ff) * i_2275_)) & ~0xff00ff) + (((i_2273_ & 0xff00) * i_2274_ + ((i_2280_ & 0xff00) * i_2275_)) & 0xff0000)) >> 8;
									} else {
										int i_2281_ = ((i_2273_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2282_ = ((i_2273_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2283_ = ((i_2273_ & 0xff) * anInt8882 & 0xff00);
										is[i_2256_] = (i_2281_ | i_2282_ | i_2283_) >>> 8;
									}
								} else if (i == 3) {
									int i_2284_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2255_]);
									int i_2285_ = anInt8877;
									int i_2286_ = i_2284_ + i_2285_;
									int i_2287_ = ((i_2284_ & 0xff00ff) + (i_2285_ & 0xff00ff));
									int i_2288_ = ((i_2287_ & 0x1000100) + (i_2286_ - i_2287_ & 0x10000));
									i_2288_ = (i_2286_ - i_2288_ | i_2288_ - (i_2288_ >>> 8));
									int i_2289_ = (i_2284_ >>> 24) * anInt8878 >> 8;
									int i_2290_ = 256 - i_2289_;
									if (i_2289_ != 255) {
										i_2284_ = i_2288_;
										i_2288_ = is[i_2256_];
										i_2288_ = ((((i_2284_ & 0xff00ff) * i_2289_ + ((i_2288_ & 0xff00ff) * i_2290_)) & ~0xff00ff) + (((i_2284_ & 0xff00) * i_2289_ + ((i_2288_ & 0xff00) * i_2290_)) & 0xff0000)) >> 8;
									}
									is[i_2256_] = i_2288_;
								} else if (i == 2) {
									int i_2291_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2255_]);
									int i_2292_ = i_2291_ >>> 24;
									int i_2293_ = 256 - i_2292_;
									int i_2294_ = ((i_2291_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2295_ = ((i_2291_ & 0xff00) * anInt8878 & 0xff0000);
									i_2291_ = (((i_2294_ | i_2295_) >>> 8) + anInt8885);
									int i_2296_ = is[i_2256_];
									is[i_2256_] = ((((i_2291_ & 0xff00ff) * i_2292_ + (i_2296_ & 0xff00ff) * i_2293_) & ~0xff00ff) + (((i_2291_ & 0xff00) * i_2292_ + (i_2296_ & 0xff00) * i_2293_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_1898_ == 2) {
								if (i == 1) {
									int i_2297_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2255_]);
									int i_2298_ = is[i_2256_];
									int i_2299_ = i_2297_ + i_2298_;
									int i_2300_ = ((i_2297_ & 0xff00ff) + (i_2298_ & 0xff00ff));
									i_2298_ = ((i_2300_ & 0x1000100) + (i_2299_ - i_2300_ & 0x10000));
									is[i_2256_] = (i_2299_ - i_2298_ | i_2298_ - (i_2298_ >>> 8));
								} else if (i == 0) {
									int i_2301_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2255_]);
									int i_2302_ = ((i_2301_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2303_ = ((i_2301_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2304_ = ((i_2301_ & 0xff) * anInt8882 & 0xff00);
									i_2301_ = (i_2302_ | i_2303_ | i_2304_) >>> 8;
									int i_2305_ = is[i_2256_];
									int i_2306_ = i_2301_ + i_2305_;
									int i_2307_ = ((i_2301_ & 0xff00ff) + (i_2305_ & 0xff00ff));
									i_2305_ = ((i_2307_ & 0x1000100) + (i_2306_ - i_2307_ & 0x10000));
									is[i_2256_] = (i_2306_ - i_2305_ | i_2305_ - (i_2305_ >>> 8));
								} else if (i == 3) {
									int i_2308_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2255_]);
									int i_2309_ = anInt8877;
									int i_2310_ = i_2308_ + i_2309_;
									int i_2311_ = ((i_2308_ & 0xff00ff) + (i_2309_ & 0xff00ff));
									int i_2312_ = ((i_2311_ & 0x1000100) + (i_2310_ - i_2311_ & 0x10000));
									i_2308_ = (i_2310_ - i_2312_ | i_2312_ - (i_2312_ >>> 8));
									i_2312_ = is[i_2256_];
									i_2310_ = i_2308_ + i_2312_;
									i_2311_ = (i_2308_ & 0xff00ff) + (i_2312_ & 0xff00ff);
									i_2312_ = ((i_2311_ & 0x1000100) + (i_2310_ - i_2311_ & 0x10000));
									is[i_2256_] = (i_2310_ - i_2312_ | i_2312_ - (i_2312_ >>> 8));
								} else if (i == 2) {
									int i_2313_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2255_]);
									int i_2314_ = ((i_2313_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2315_ = ((i_2313_ & 0xff00) * anInt8878 & 0xff0000);
									i_2313_ = (((i_2314_ | i_2315_) >>> 8) + anInt8885);
									int i_2316_ = is[i_2256_];
									int i_2317_ = i_2313_ + i_2316_;
									int i_2318_ = ((i_2313_ & 0xff00ff) + (i_2316_ & 0xff00ff));
									i_2316_ = ((i_2318_ & 0x1000100) + (i_2317_ - i_2318_ & 0x10000));
									is[i_2256_] = (i_2317_ - i_2316_ | i_2316_ - (i_2316_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_2251_ += anInt8865;
							i_2252_ += anInt8868;
						}
						i_2249_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8868 == 0) {
				int i_2319_ = anInt8864;
				while (i_2319_ < 0) {
					int i_2320_ = anInt8870;
					int i_2321_ = anInt8873 + anInt8858;
					int i_2322_ = anInt8874;
					int i_2323_ = anInt8862;
					if (i_2322_ >= 0 && i_2322_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) < 0) {
						if (i_2321_ < 0) {
							int i_2324_ = (anInt8865 - 1 - i_2321_) / anInt8865;
							i_2323_ += i_2324_;
							i_2321_ += anInt8865 * i_2324_;
							i_2320_ += i_2324_;
						}
						int i_2325_;
						if ((i_2325_ = (1 + i_2321_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_2323_)
							i_2323_ = i_2325_;
						for (/**/; i_2323_ < 0; i_2323_++) {
							int i_2326_ = (((i_2322_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_2321_ >> 12));
							int i_2327_ = i_2320_++;
							if (i_1898_ == 0) {
								if (i == 1)
									is[i_2327_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2326_]);
								else if (i == 0) {
									int i_2328_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2326_++]);
									int i_2329_ = ((i_2328_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2330_ = ((i_2328_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2331_ = ((i_2328_ & 0xff) * anInt8882 & 0xff00);
									is[i_2327_] = (i_2329_ | i_2330_ | i_2331_) >>> 8;
								} else if (i == 3) {
									int i_2332_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2326_++]);
									int i_2333_ = anInt8877;
									int i_2334_ = i_2332_ + i_2333_;
									int i_2335_ = ((i_2332_ & 0xff00ff) + (i_2333_ & 0xff00ff));
									int i_2336_ = ((i_2335_ & 0x1000100) + (i_2334_ - i_2335_ & 0x10000));
									is[i_2327_] = (i_2334_ - i_2336_ | i_2336_ - (i_2336_ >>> 8));
								} else if (i == 2) {
									int i_2337_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2326_]);
									int i_2338_ = ((i_2337_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2339_ = ((i_2337_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2327_] = (((i_2338_ | i_2339_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_1898_ == 1) {
								if (i == 1) {
									int i_2340_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2326_]);
									int i_2341_ = i_2340_ >>> 24;
									int i_2342_ = 256 - i_2341_;
									int i_2343_ = is[i_2327_];
									is[i_2327_] = ((((i_2340_ & 0xff00ff) * i_2341_ + (i_2343_ & 0xff00ff) * i_2342_) & ~0xff00ff) + (((i_2340_ & 0xff00) * i_2341_ + (i_2343_ & 0xff00) * i_2342_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_2344_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2326_]);
									int i_2345_ = (i_2344_ >>> 24) * anInt8878 >> 8;
									int i_2346_ = 256 - i_2345_;
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_2347_ = is[i_2327_];
										is[i_2327_] = ((((i_2344_ & 0xff00ff) * i_2345_ + ((i_2347_ & 0xff00ff) * i_2346_)) & ~0xff00ff) + (((i_2344_ & 0xff00) * i_2345_ + ((i_2347_ & 0xff00) * i_2346_)) & 0xff0000)) >> 8;
									} else if (i_2345_ != 255) {
										int i_2348_ = ((i_2344_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2349_ = ((i_2344_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2350_ = ((i_2344_ & 0xff) * anInt8882 & 0xff00);
										i_2344_ = (i_2348_ | i_2349_ | i_2350_) >>> 8;
										int i_2351_ = is[i_2327_];
										is[i_2327_] = ((((i_2344_ & 0xff00ff) * i_2345_ + ((i_2351_ & 0xff00ff) * i_2346_)) & ~0xff00ff) + (((i_2344_ & 0xff00) * i_2345_ + ((i_2351_ & 0xff00) * i_2346_)) & 0xff0000)) >> 8;
									} else {
										int i_2352_ = ((i_2344_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2353_ = ((i_2344_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2354_ = ((i_2344_ & 0xff) * anInt8882 & 0xff00);
										is[i_2327_] = (i_2352_ | i_2353_ | i_2354_) >>> 8;
									}
								} else if (i == 3) {
									int i_2355_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2326_]);
									int i_2356_ = anInt8877;
									int i_2357_ = i_2355_ + i_2356_;
									int i_2358_ = ((i_2355_ & 0xff00ff) + (i_2356_ & 0xff00ff));
									int i_2359_ = ((i_2358_ & 0x1000100) + (i_2357_ - i_2358_ & 0x10000));
									i_2359_ = (i_2357_ - i_2359_ | i_2359_ - (i_2359_ >>> 8));
									int i_2360_ = (i_2355_ >>> 24) * anInt8878 >> 8;
									int i_2361_ = 256 - i_2360_;
									if (i_2360_ != 255) {
										i_2355_ = i_2359_;
										i_2359_ = is[i_2327_];
										i_2359_ = ((((i_2355_ & 0xff00ff) * i_2360_ + ((i_2359_ & 0xff00ff) * i_2361_)) & ~0xff00ff) + (((i_2355_ & 0xff00) * i_2360_ + ((i_2359_ & 0xff00) * i_2361_)) & 0xff0000)) >> 8;
									}
									is[i_2327_] = i_2359_;
								} else if (i == 2) {
									int i_2362_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2326_]);
									int i_2363_ = i_2362_ >>> 24;
									int i_2364_ = 256 - i_2363_;
									int i_2365_ = ((i_2362_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2366_ = ((i_2362_ & 0xff00) * anInt8878 & 0xff0000);
									i_2362_ = (((i_2365_ | i_2366_) >>> 8) + anInt8885);
									int i_2367_ = is[i_2327_];
									is[i_2327_] = ((((i_2362_ & 0xff00ff) * i_2363_ + (i_2367_ & 0xff00ff) * i_2364_) & ~0xff00ff) + (((i_2362_ & 0xff00) * i_2363_ + (i_2367_ & 0xff00) * i_2364_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_1898_ == 2) {
								if (i == 1) {
									int i_2368_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2326_]);
									int i_2369_ = is[i_2327_];
									int i_2370_ = i_2368_ + i_2369_;
									int i_2371_ = ((i_2368_ & 0xff00ff) + (i_2369_ & 0xff00ff));
									i_2369_ = ((i_2371_ & 0x1000100) + (i_2370_ - i_2371_ & 0x10000));
									is[i_2327_] = (i_2370_ - i_2369_ | i_2369_ - (i_2369_ >>> 8));
								} else if (i == 0) {
									int i_2372_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2326_]);
									int i_2373_ = ((i_2372_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2374_ = ((i_2372_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2375_ = ((i_2372_ & 0xff) * anInt8882 & 0xff00);
									i_2372_ = (i_2373_ | i_2374_ | i_2375_) >>> 8;
									int i_2376_ = is[i_2327_];
									int i_2377_ = i_2372_ + i_2376_;
									int i_2378_ = ((i_2372_ & 0xff00ff) + (i_2376_ & 0xff00ff));
									i_2376_ = ((i_2378_ & 0x1000100) + (i_2377_ - i_2378_ & 0x10000));
									is[i_2327_] = (i_2377_ - i_2376_ | i_2376_ - (i_2376_ >>> 8));
								} else if (i == 3) {
									int i_2379_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2326_]);
									int i_2380_ = anInt8877;
									int i_2381_ = i_2379_ + i_2380_;
									int i_2382_ = ((i_2379_ & 0xff00ff) + (i_2380_ & 0xff00ff));
									int i_2383_ = ((i_2382_ & 0x1000100) + (i_2381_ - i_2382_ & 0x10000));
									i_2379_ = (i_2381_ - i_2383_ | i_2383_ - (i_2383_ >>> 8));
									i_2383_ = is[i_2327_];
									i_2381_ = i_2379_ + i_2383_;
									i_2382_ = (i_2379_ & 0xff00ff) + (i_2383_ & 0xff00ff);
									i_2383_ = ((i_2382_ & 0x1000100) + (i_2381_ - i_2382_ & 0x10000));
									is[i_2327_] = (i_2381_ - i_2383_ | i_2383_ - (i_2383_ >>> 8));
								} else if (i == 2) {
									int i_2384_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2326_]);
									int i_2385_ = ((i_2384_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2386_ = ((i_2384_ & 0xff00) * anInt8878 & 0xff0000);
									i_2384_ = (((i_2385_ | i_2386_) >>> 8) + anInt8885);
									int i_2387_ = is[i_2327_];
									int i_2388_ = i_2384_ + i_2387_;
									int i_2389_ = ((i_2384_ & 0xff00ff) + (i_2387_ & 0xff00ff));
									i_2387_ = ((i_2389_ & 0x1000100) + (i_2388_ - i_2389_ & 0x10000));
									is[i_2327_] = (i_2388_ - i_2387_ | i_2387_ - (i_2387_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_2321_ += anInt8865;
						}
					}
					i_2319_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else if (anInt8868 < 0) {
				for (int i_2390_ = anInt8864; i_2390_ < 0; i_2390_++) {
					int i_2391_ = anInt8870;
					int i_2392_ = anInt8873 + anInt8858;
					int i_2393_ = anInt8874 + anInt8866;
					int i_2394_ = anInt8862;
					if (i_2392_ < 0) {
						int i_2395_ = (anInt8865 - 1 - i_2392_) / anInt8865;
						i_2394_ += i_2395_;
						i_2392_ += anInt8865 * i_2395_;
						i_2393_ += anInt8868 * i_2395_;
						i_2391_ += i_2395_;
					}
					int i_2396_;
					if ((i_2396_ = (1 + i_2392_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_2394_)
						i_2394_ = i_2396_;
					if ((i_2396_ = i_2393_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12)) >= 0) {
						i_2396_ = (anInt8868 - i_2396_) / anInt8868;
						i_2394_ += i_2396_;
						i_2392_ += anInt8865 * i_2396_;
						i_2393_ += anInt8868 * i_2396_;
						i_2391_ += i_2396_;
					}
					if ((i_2396_ = (i_2393_ - anInt8868) / anInt8868) > i_2394_)
						i_2394_ = i_2396_;
					for (/**/; i_2394_ < 0; i_2394_++) {
						int i_2397_ = (((i_2393_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_2392_ >> 12));
						int i_2398_ = i_2391_++;
						if (i_1898_ == 0) {
							if (i == 1)
								is[i_2398_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2397_]);
							else if (i == 0) {
								int i_2399_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2397_++]);
								int i_2400_ = ((i_2399_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_2401_ = ((i_2399_ & 0xff00) * anInt8852 & 0xff0000);
								int i_2402_ = (i_2399_ & 0xff) * anInt8882 & 0xff00;
								is[i_2398_] = (i_2400_ | i_2401_ | i_2402_) >>> 8;
							} else if (i == 3) {
								int i_2403_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2397_++]);
								int i_2404_ = anInt8877;
								int i_2405_ = i_2403_ + i_2404_;
								int i_2406_ = ((i_2403_ & 0xff00ff) + (i_2404_ & 0xff00ff));
								int i_2407_ = ((i_2406_ & 0x1000100) + (i_2405_ - i_2406_ & 0x10000));
								is[i_2398_] = i_2405_ - i_2407_ | i_2407_ - (i_2407_ >>> 8);
							} else if (i == 2) {
								int i_2408_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2397_]);
								int i_2409_ = ((i_2408_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_2410_ = ((i_2408_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_2398_] = ((i_2409_ | i_2410_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_1898_ == 1) {
							if (i == 1) {
								int i_2411_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2397_]);
								int i_2412_ = i_2411_ >>> 24;
								int i_2413_ = 256 - i_2412_;
								int i_2414_ = is[i_2398_];
								is[i_2398_] = ((((i_2411_ & 0xff00ff) * i_2412_ + (i_2414_ & 0xff00ff) * i_2413_) & ~0xff00ff) + (((i_2411_ & 0xff00) * i_2412_ + (i_2414_ & 0xff00) * i_2413_) & 0xff0000)) >> 8;
							} else if (i == 0) {
								int i_2415_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2397_]);
								int i_2416_ = (i_2415_ >>> 24) * anInt8878 >> 8;
								int i_2417_ = 256 - i_2416_;
								if ((anInt8877 & 0xffffff) == 16777215) {
									int i_2418_ = is[i_2398_];
									is[i_2398_] = ((((i_2415_ & 0xff00ff) * i_2416_ + (i_2418_ & 0xff00ff) * i_2417_) & ~0xff00ff) + (((i_2415_ & 0xff00) * i_2416_ + (i_2418_ & 0xff00) * i_2417_) & 0xff0000)) >> 8;
								} else if (i_2416_ != 255) {
									int i_2419_ = ((i_2415_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2420_ = ((i_2415_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2421_ = ((i_2415_ & 0xff) * anInt8882 & 0xff00);
									i_2415_ = (i_2419_ | i_2420_ | i_2421_) >>> 8;
									int i_2422_ = is[i_2398_];
									is[i_2398_] = ((((i_2415_ & 0xff00ff) * i_2416_ + (i_2422_ & 0xff00ff) * i_2417_) & ~0xff00ff) + (((i_2415_ & 0xff00) * i_2416_ + (i_2422_ & 0xff00) * i_2417_) & 0xff0000)) >> 8;
								} else {
									int i_2423_ = ((i_2415_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2424_ = ((i_2415_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2425_ = ((i_2415_ & 0xff) * anInt8882 & 0xff00);
									is[i_2398_] = (i_2423_ | i_2424_ | i_2425_) >>> 8;
								}
							} else if (i == 3) {
								int i_2426_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2397_]);
								int i_2427_ = anInt8877;
								int i_2428_ = i_2426_ + i_2427_;
								int i_2429_ = ((i_2426_ & 0xff00ff) + (i_2427_ & 0xff00ff));
								int i_2430_ = ((i_2429_ & 0x1000100) + (i_2428_ - i_2429_ & 0x10000));
								i_2430_ = i_2428_ - i_2430_ | i_2430_ - (i_2430_ >>> 8);
								int i_2431_ = (i_2426_ >>> 24) * anInt8878 >> 8;
								int i_2432_ = 256 - i_2431_;
								if (i_2431_ != 255) {
									i_2426_ = i_2430_;
									i_2430_ = is[i_2398_];
									i_2430_ = ((((i_2426_ & 0xff00ff) * i_2431_ + (i_2430_ & 0xff00ff) * i_2432_) & ~0xff00ff) + (((i_2426_ & 0xff00) * i_2431_ + (i_2430_ & 0xff00) * i_2432_) & 0xff0000)) >> 8;
								}
								is[i_2398_] = i_2430_;
							} else if (i == 2) {
								int i_2433_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2397_]);
								int i_2434_ = i_2433_ >>> 24;
								int i_2435_ = 256 - i_2434_;
								int i_2436_ = ((i_2433_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_2437_ = ((i_2433_ & 0xff00) * anInt8878 & 0xff0000);
								i_2433_ = ((i_2436_ | i_2437_) >>> 8) + anInt8885;
								int i_2438_ = is[i_2398_];
								is[i_2398_] = ((((i_2433_ & 0xff00ff) * i_2434_ + (i_2438_ & 0xff00ff) * i_2435_) & ~0xff00ff) + (((i_2433_ & 0xff00) * i_2434_ + (i_2438_ & 0xff00) * i_2435_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_1898_ == 2) {
							if (i == 1) {
								int i_2439_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2397_]);
								int i_2440_ = is[i_2398_];
								int i_2441_ = i_2439_ + i_2440_;
								int i_2442_ = ((i_2439_ & 0xff00ff) + (i_2440_ & 0xff00ff));
								i_2440_ = ((i_2442_ & 0x1000100) + (i_2441_ - i_2442_ & 0x10000));
								is[i_2398_] = i_2441_ - i_2440_ | i_2440_ - (i_2440_ >>> 8);
							} else if (i == 0) {
								int i_2443_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2397_]);
								int i_2444_ = ((i_2443_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_2445_ = ((i_2443_ & 0xff00) * anInt8852 & 0xff0000);
								int i_2446_ = (i_2443_ & 0xff) * anInt8882 & 0xff00;
								i_2443_ = (i_2444_ | i_2445_ | i_2446_) >>> 8;
								int i_2447_ = is[i_2398_];
								int i_2448_ = i_2443_ + i_2447_;
								int i_2449_ = ((i_2443_ & 0xff00ff) + (i_2447_ & 0xff00ff));
								i_2447_ = ((i_2449_ & 0x1000100) + (i_2448_ - i_2449_ & 0x10000));
								is[i_2398_] = i_2448_ - i_2447_ | i_2447_ - (i_2447_ >>> 8);
							} else if (i == 3) {
								int i_2450_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2397_]);
								int i_2451_ = anInt8877;
								int i_2452_ = i_2450_ + i_2451_;
								int i_2453_ = ((i_2450_ & 0xff00ff) + (i_2451_ & 0xff00ff));
								int i_2454_ = ((i_2453_ & 0x1000100) + (i_2452_ - i_2453_ & 0x10000));
								i_2450_ = i_2452_ - i_2454_ | i_2454_ - (i_2454_ >>> 8);
								i_2454_ = is[i_2398_];
								i_2452_ = i_2450_ + i_2454_;
								i_2453_ = (i_2450_ & 0xff00ff) + (i_2454_ & 0xff00ff);
								i_2454_ = ((i_2453_ & 0x1000100) + (i_2452_ - i_2453_ & 0x10000));
								is[i_2398_] = i_2452_ - i_2454_ | i_2454_ - (i_2454_ >>> 8);
							} else if (i == 2) {
								int i_2455_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2397_]);
								int i_2456_ = ((i_2455_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_2457_ = ((i_2455_ & 0xff00) * anInt8878 & 0xff0000);
								i_2455_ = ((i_2456_ | i_2457_) >>> 8) + anInt8885;
								int i_2458_ = is[i_2398_];
								int i_2459_ = i_2455_ + i_2458_;
								int i_2460_ = ((i_2455_ & 0xff00ff) + (i_2458_ & 0xff00ff));
								i_2458_ = ((i_2460_ & 0x1000100) + (i_2459_ - i_2460_ & 0x10000));
								is[i_2398_] = i_2459_ - i_2458_ | i_2458_ - (i_2458_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_2392_ += anInt8865;
						i_2393_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else {
				for (int i_2461_ = anInt8864; i_2461_ < 0; i_2461_++) {
					int i_2462_ = anInt8870;
					int i_2463_ = anInt8873 + anInt8858;
					int i_2464_ = anInt8874 + anInt8866;
					int i_2465_ = anInt8862;
					if (i_2463_ < 0) {
						int i_2466_ = (anInt8865 - 1 - i_2463_) / anInt8865;
						i_2465_ += i_2466_;
						i_2463_ += anInt8865 * i_2466_;
						i_2464_ += anInt8868 * i_2466_;
						i_2462_ += i_2466_;
					}
					int i_2467_;
					if ((i_2467_ = (1 + i_2463_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_2465_)
						i_2465_ = i_2467_;
					if (i_2464_ < 0) {
						i_2467_ = (anInt8868 - 1 - i_2464_) / anInt8868;
						i_2465_ += i_2467_;
						i_2463_ += anInt8865 * i_2467_;
						i_2464_ += anInt8868 * i_2467_;
						i_2462_ += i_2467_;
					}
					if ((i_2467_ = (1 + i_2464_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_2465_)
						i_2465_ = i_2467_;
					for (/**/; i_2465_ < 0; i_2465_++) {
						int i_2468_ = (((i_2464_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_2463_ >> 12));
						int i_2469_ = i_2462_++;
						if (i_1898_ == 0) {
							if (i == 1)
								is[i_2469_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2468_]);
							else if (i == 0) {
								int i_2470_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2468_++]);
								int i_2471_ = ((i_2470_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_2472_ = ((i_2470_ & 0xff00) * anInt8852 & 0xff0000);
								int i_2473_ = (i_2470_ & 0xff) * anInt8882 & 0xff00;
								is[i_2469_] = (i_2471_ | i_2472_ | i_2473_) >>> 8;
							} else if (i == 3) {
								int i_2474_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2468_++]);
								int i_2475_ = anInt8877;
								int i_2476_ = i_2474_ + i_2475_;
								int i_2477_ = ((i_2474_ & 0xff00ff) + (i_2475_ & 0xff00ff));
								int i_2478_ = ((i_2477_ & 0x1000100) + (i_2476_ - i_2477_ & 0x10000));
								is[i_2469_] = i_2476_ - i_2478_ | i_2478_ - (i_2478_ >>> 8);
							} else if (i == 2) {
								int i_2479_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2468_]);
								int i_2480_ = ((i_2479_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_2481_ = ((i_2479_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_2469_] = ((i_2480_ | i_2481_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_1898_ == 1) {
							if (i == 1) {
								int i_2482_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2468_]);
								int i_2483_ = i_2482_ >>> 24;
								int i_2484_ = 256 - i_2483_;
								int i_2485_ = is[i_2469_];
								is[i_2469_] = ((((i_2482_ & 0xff00ff) * i_2483_ + (i_2485_ & 0xff00ff) * i_2484_) & ~0xff00ff) + (((i_2482_ & 0xff00) * i_2483_ + (i_2485_ & 0xff00) * i_2484_) & 0xff0000)) >> 8;
							} else if (i == 0) {
								int i_2486_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2468_]);
								int i_2487_ = (i_2486_ >>> 24) * anInt8878 >> 8;
								int i_2488_ = 256 - i_2487_;
								if ((anInt8877 & 0xffffff) == 16777215) {
									int i_2489_ = is[i_2469_];
									is[i_2469_] = ((((i_2486_ & 0xff00ff) * i_2487_ + (i_2489_ & 0xff00ff) * i_2488_) & ~0xff00ff) + (((i_2486_ & 0xff00) * i_2487_ + (i_2489_ & 0xff00) * i_2488_) & 0xff0000)) >> 8;
								} else if (i_2487_ != 255) {
									int i_2490_ = ((i_2486_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2491_ = ((i_2486_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2492_ = ((i_2486_ & 0xff) * anInt8882 & 0xff00);
									i_2486_ = (i_2490_ | i_2491_ | i_2492_) >>> 8;
									int i_2493_ = is[i_2469_];
									is[i_2469_] = ((((i_2486_ & 0xff00ff) * i_2487_ + (i_2493_ & 0xff00ff) * i_2488_) & ~0xff00ff) + (((i_2486_ & 0xff00) * i_2487_ + (i_2493_ & 0xff00) * i_2488_) & 0xff0000)) >> 8;
								} else {
									int i_2494_ = ((i_2486_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2495_ = ((i_2486_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2496_ = ((i_2486_ & 0xff) * anInt8882 & 0xff00);
									is[i_2469_] = (i_2494_ | i_2495_ | i_2496_) >>> 8;
								}
							} else if (i == 3) {
								int i_2497_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2468_]);
								int i_2498_ = anInt8877;
								int i_2499_ = i_2497_ + i_2498_;
								int i_2500_ = ((i_2497_ & 0xff00ff) + (i_2498_ & 0xff00ff));
								int i_2501_ = ((i_2500_ & 0x1000100) + (i_2499_ - i_2500_ & 0x10000));
								i_2501_ = i_2499_ - i_2501_ | i_2501_ - (i_2501_ >>> 8);
								int i_2502_ = (i_2497_ >>> 24) * anInt8878 >> 8;
								int i_2503_ = 256 - i_2502_;
								if (i_2502_ != 255) {
									i_2497_ = i_2501_;
									i_2501_ = is[i_2469_];
									i_2501_ = ((((i_2497_ & 0xff00ff) * i_2502_ + (i_2501_ & 0xff00ff) * i_2503_) & ~0xff00ff) + (((i_2497_ & 0xff00) * i_2502_ + (i_2501_ & 0xff00) * i_2503_) & 0xff0000)) >> 8;
								}
								is[i_2469_] = i_2501_;
							} else if (i == 2) {
								int i_2504_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2468_]);
								int i_2505_ = i_2504_ >>> 24;
								int i_2506_ = 256 - i_2505_;
								int i_2507_ = ((i_2504_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_2508_ = ((i_2504_ & 0xff00) * anInt8878 & 0xff0000);
								i_2504_ = ((i_2507_ | i_2508_) >>> 8) + anInt8885;
								int i_2509_ = is[i_2469_];
								is[i_2469_] = ((((i_2504_ & 0xff00ff) * i_2505_ + (i_2509_ & 0xff00ff) * i_2506_) & ~0xff00ff) + (((i_2504_ & 0xff00) * i_2505_ + (i_2509_ & 0xff00) * i_2506_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_1898_ == 2) {
							if (i == 1) {
								int i_2510_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2468_]);
								int i_2511_ = is[i_2469_];
								int i_2512_ = i_2510_ + i_2511_;
								int i_2513_ = ((i_2510_ & 0xff00ff) + (i_2511_ & 0xff00ff));
								i_2511_ = ((i_2513_ & 0x1000100) + (i_2512_ - i_2513_ & 0x10000));
								is[i_2469_] = i_2512_ - i_2511_ | i_2511_ - (i_2511_ >>> 8);
							} else if (i == 0) {
								int i_2514_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2468_]);
								int i_2515_ = ((i_2514_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_2516_ = ((i_2514_ & 0xff00) * anInt8852 & 0xff0000);
								int i_2517_ = (i_2514_ & 0xff) * anInt8882 & 0xff00;
								i_2514_ = (i_2515_ | i_2516_ | i_2517_) >>> 8;
								int i_2518_ = is[i_2469_];
								int i_2519_ = i_2514_ + i_2518_;
								int i_2520_ = ((i_2514_ & 0xff00ff) + (i_2518_ & 0xff00ff));
								i_2518_ = ((i_2520_ & 0x1000100) + (i_2519_ - i_2520_ & 0x10000));
								is[i_2469_] = i_2519_ - i_2518_ | i_2518_ - (i_2518_ >>> 8);
							} else if (i == 3) {
								int i_2521_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2468_]);
								int i_2522_ = anInt8877;
								int i_2523_ = i_2521_ + i_2522_;
								int i_2524_ = ((i_2521_ & 0xff00ff) + (i_2522_ & 0xff00ff));
								int i_2525_ = ((i_2524_ & 0x1000100) + (i_2523_ - i_2524_ & 0x10000));
								i_2521_ = i_2523_ - i_2525_ | i_2525_ - (i_2525_ >>> 8);
								i_2525_ = is[i_2469_];
								i_2523_ = i_2521_ + i_2525_;
								i_2524_ = (i_2521_ & 0xff00ff) + (i_2525_ & 0xff00ff);
								i_2525_ = ((i_2524_ & 0x1000100) + (i_2523_ - i_2524_ & 0x10000));
								is[i_2469_] = i_2523_ - i_2525_ | i_2525_ - (i_2525_ >>> 8);
							} else if (i == 2) {
								int i_2526_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2468_]);
								int i_2527_ = ((i_2526_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_2528_ = ((i_2526_ & 0xff00) * anInt8878 & 0xff0000);
								i_2526_ = ((i_2527_ | i_2528_) >>> 8) + anInt8885;
								int i_2529_ = is[i_2469_];
								int i_2530_ = i_2526_ + i_2529_;
								int i_2531_ = ((i_2526_ & 0xff00ff) + (i_2529_ & 0xff00ff));
								i_2529_ = ((i_2531_ & 0x1000100) + (i_2530_ - i_2531_ & 0x10000));
								is[i_2469_] = i_2530_ - i_2529_ | i_2529_ - (i_2529_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_2463_ += anInt8865;
						i_2464_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			}
		}
	}

	void method14253(int i, int i_2532_) {
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					int i_2533_ = anInt8864;
					while (i_2533_ < 0) {
						int i_2534_ = anInt8870;
						int i_2535_ = anInt8873;
						int i_2536_ = anInt8874;
						int i_2537_ = anInt8862;
						if (i_2535_ >= 0 && i_2536_ >= 0 && i_2535_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) < 0 && i_2536_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) < 0) {
							for (/**/; i_2537_ < 0; i_2537_++) {
								int i_2538_ = ((i_2536_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851 + (i_2535_ >> 12));
								int i_2539_ = i_2534_++;
								if (i_2532_ == 0) {
									if (i == 1)
										is[i_2539_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2538_]);
									else if (i == 0) {
										int i_2540_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2538_++]);
										int i_2541_ = ((i_2540_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2542_ = ((i_2540_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2543_ = ((i_2540_ & 0xff) * anInt8882 & 0xff00);
										is[i_2539_] = (i_2541_ | i_2542_ | i_2543_) >>> 8;
									} else if (i == 3) {
										int i_2544_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2538_++]);
										int i_2545_ = anInt8877;
										int i_2546_ = i_2544_ + i_2545_;
										int i_2547_ = ((i_2544_ & 0xff00ff) + (i_2545_ & 0xff00ff));
										int i_2548_ = ((i_2547_ & 0x1000100) + (i_2546_ - i_2547_ & 0x10000));
										is[i_2539_] = (i_2546_ - i_2548_ | i_2548_ - (i_2548_ >>> 8));
									} else if (i == 2) {
										int i_2549_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2538_]);
										int i_2550_ = ((i_2549_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2551_ = ((i_2549_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2539_] = ((i_2550_ | i_2551_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_2532_ == 1) {
									if (i == 1) {
										int i_2552_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2538_]);
										int i_2553_ = i_2552_ >>> 24;
										int i_2554_ = 256 - i_2553_;
										int i_2555_ = is[i_2539_];
										is[i_2539_] = ((((i_2552_ & 0xff00ff) * i_2553_ + ((i_2555_ & 0xff00ff) * i_2554_)) & ~0xff00ff) + (((i_2552_ & 0xff00) * i_2553_ + ((i_2555_ & 0xff00) * i_2554_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_2556_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2538_]);
										int i_2557_ = ((i_2556_ >>> 24) * anInt8878 >> 8);
										int i_2558_ = 256 - i_2557_;
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_2559_ = is[i_2539_];
											is[i_2539_] = (((((i_2556_ & 0xff00ff) * i_2557_) + ((i_2559_ & 0xff00ff) * i_2558_)) & ~0xff00ff) + ((((i_2556_ & 0xff00) * i_2557_) + ((i_2559_ & 0xff00) * i_2558_)) & 0xff0000)) >> 8;
										} else if (i_2557_ != 255) {
											int i_2560_ = (((i_2556_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2561_ = (((i_2556_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2562_ = ((i_2556_ & 0xff) * anInt8882 & 0xff00);
											i_2556_ = (i_2560_ | i_2561_ | i_2562_) >>> 8;
											int i_2563_ = is[i_2539_];
											is[i_2539_] = (((((i_2556_ & 0xff00ff) * i_2557_) + ((i_2563_ & 0xff00ff) * i_2558_)) & ~0xff00ff) + ((((i_2556_ & 0xff00) * i_2557_) + ((i_2563_ & 0xff00) * i_2558_)) & 0xff0000)) >> 8;
										} else {
											int i_2564_ = (((i_2556_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2565_ = (((i_2556_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2566_ = ((i_2556_ & 0xff) * anInt8882 & 0xff00);
											is[i_2539_] = (i_2564_ | i_2565_ | i_2566_) >>> 8;
										}
									} else if (i == 3) {
										int i_2567_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2538_]);
										int i_2568_ = anInt8877;
										int i_2569_ = i_2567_ + i_2568_;
										int i_2570_ = ((i_2567_ & 0xff00ff) + (i_2568_ & 0xff00ff));
										int i_2571_ = ((i_2570_ & 0x1000100) + (i_2569_ - i_2570_ & 0x10000));
										i_2571_ = (i_2569_ - i_2571_ | i_2571_ - (i_2571_ >>> 8));
										int i_2572_ = ((i_2567_ >>> 24) * anInt8878 >> 8);
										int i_2573_ = 256 - i_2572_;
										if (i_2572_ != 255) {
											i_2567_ = i_2571_;
											i_2571_ = is[i_2539_];
											i_2571_ = (((((i_2567_ & 0xff00ff) * i_2572_) + ((i_2571_ & 0xff00ff) * i_2573_)) & ~0xff00ff) + ((((i_2567_ & 0xff00) * i_2572_) + ((i_2571_ & 0xff00) * i_2573_)) & 0xff0000)) >> 8;
										}
										is[i_2539_] = i_2571_;
									} else if (i == 2) {
										int i_2574_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2538_]);
										int i_2575_ = i_2574_ >>> 24;
										int i_2576_ = 256 - i_2575_;
										int i_2577_ = ((i_2574_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2578_ = ((i_2574_ & 0xff00) * anInt8878 & 0xff0000);
										i_2574_ = (((i_2577_ | i_2578_) >>> 8) + anInt8885);
										int i_2579_ = is[i_2539_];
										is[i_2539_] = ((((i_2574_ & 0xff00ff) * i_2575_ + ((i_2579_ & 0xff00ff) * i_2576_)) & ~0xff00ff) + (((i_2574_ & 0xff00) * i_2575_ + ((i_2579_ & 0xff00) * i_2576_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_2532_ == 2) {
									if (i == 1) {
										int i_2580_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2538_]);
										int i_2581_ = is[i_2539_];
										int i_2582_ = i_2580_ + i_2581_;
										int i_2583_ = ((i_2580_ & 0xff00ff) + (i_2581_ & 0xff00ff));
										i_2581_ = ((i_2583_ & 0x1000100) + (i_2582_ - i_2583_ & 0x10000));
										is[i_2539_] = (i_2582_ - i_2581_ | i_2581_ - (i_2581_ >>> 8));
									} else if (i == 0) {
										int i_2584_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2538_]);
										int i_2585_ = ((i_2584_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2586_ = ((i_2584_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2587_ = ((i_2584_ & 0xff) * anInt8882 & 0xff00);
										i_2584_ = (i_2585_ | i_2586_ | i_2587_) >>> 8;
										int i_2588_ = is[i_2539_];
										int i_2589_ = i_2584_ + i_2588_;
										int i_2590_ = ((i_2584_ & 0xff00ff) + (i_2588_ & 0xff00ff));
										i_2588_ = ((i_2590_ & 0x1000100) + (i_2589_ - i_2590_ & 0x10000));
										is[i_2539_] = (i_2589_ - i_2588_ | i_2588_ - (i_2588_ >>> 8));
									} else if (i == 3) {
										int i_2591_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2538_]);
										int i_2592_ = anInt8877;
										int i_2593_ = i_2591_ + i_2592_;
										int i_2594_ = ((i_2591_ & 0xff00ff) + (i_2592_ & 0xff00ff));
										int i_2595_ = ((i_2594_ & 0x1000100) + (i_2593_ - i_2594_ & 0x10000));
										i_2591_ = (i_2593_ - i_2595_ | i_2595_ - (i_2595_ >>> 8));
										i_2595_ = is[i_2539_];
										i_2593_ = i_2591_ + i_2595_;
										i_2594_ = ((i_2591_ & 0xff00ff) + (i_2595_ & 0xff00ff));
										i_2595_ = ((i_2594_ & 0x1000100) + (i_2593_ - i_2594_ & 0x10000));
										is[i_2539_] = (i_2593_ - i_2595_ | i_2595_ - (i_2595_ >>> 8));
									} else if (i == 2) {
										int i_2596_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2538_]);
										int i_2597_ = ((i_2596_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2598_ = ((i_2596_ & 0xff00) * anInt8878 & 0xff0000);
										i_2596_ = (((i_2597_ | i_2598_) >>> 8) + anInt8885);
										int i_2599_ = is[i_2539_];
										int i_2600_ = i_2596_ + i_2599_;
										int i_2601_ = ((i_2596_ & 0xff00ff) + (i_2599_ & 0xff00ff));
										i_2599_ = ((i_2601_ & 0x1000100) + (i_2600_ - i_2601_ & 0x10000));
										is[i_2539_] = (i_2600_ - i_2599_ | i_2599_ - (i_2599_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_2533_++;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_2602_ = anInt8864;
					while (i_2602_ < 0) {
						int i_2603_ = anInt8870;
						int i_2604_ = anInt8873;
						int i_2605_ = anInt8874 + anInt8866;
						int i_2606_ = anInt8862;
						if (i_2604_ >= 0 && i_2604_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) < 0) {
							int i_2607_;
							if ((i_2607_ = (i_2605_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12))) >= 0) {
								i_2607_ = (anInt8868 - i_2607_) / anInt8868;
								i_2606_ += i_2607_;
								i_2605_ += anInt8868 * i_2607_;
								i_2603_ += i_2607_;
							}
							if ((i_2607_ = (i_2605_ - anInt8868) / anInt8868) > i_2606_)
								i_2606_ = i_2607_;
							for (/**/; i_2606_ < 0; i_2606_++) {
								int i_2608_ = ((i_2605_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851 + (i_2604_ >> 12));
								int i_2609_ = i_2603_++;
								if (i_2532_ == 0) {
									if (i == 1)
										is[i_2609_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2608_]);
									else if (i == 0) {
										int i_2610_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2608_++]);
										int i_2611_ = ((i_2610_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2612_ = ((i_2610_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2613_ = ((i_2610_ & 0xff) * anInt8882 & 0xff00);
										is[i_2609_] = (i_2611_ | i_2612_ | i_2613_) >>> 8;
									} else if (i == 3) {
										int i_2614_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2608_++]);
										int i_2615_ = anInt8877;
										int i_2616_ = i_2614_ + i_2615_;
										int i_2617_ = ((i_2614_ & 0xff00ff) + (i_2615_ & 0xff00ff));
										int i_2618_ = ((i_2617_ & 0x1000100) + (i_2616_ - i_2617_ & 0x10000));
										is[i_2609_] = (i_2616_ - i_2618_ | i_2618_ - (i_2618_ >>> 8));
									} else if (i == 2) {
										int i_2619_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2608_]);
										int i_2620_ = ((i_2619_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2621_ = ((i_2619_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2609_] = ((i_2620_ | i_2621_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_2532_ == 1) {
									if (i == 1) {
										int i_2622_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2608_]);
										int i_2623_ = i_2622_ >>> 24;
										int i_2624_ = 256 - i_2623_;
										int i_2625_ = is[i_2609_];
										is[i_2609_] = ((((i_2622_ & 0xff00ff) * i_2623_ + ((i_2625_ & 0xff00ff) * i_2624_)) & ~0xff00ff) + (((i_2622_ & 0xff00) * i_2623_ + ((i_2625_ & 0xff00) * i_2624_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_2626_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2608_]);
										int i_2627_ = ((i_2626_ >>> 24) * anInt8878 >> 8);
										int i_2628_ = 256 - i_2627_;
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_2629_ = is[i_2609_];
											is[i_2609_] = (((((i_2626_ & 0xff00ff) * i_2627_) + ((i_2629_ & 0xff00ff) * i_2628_)) & ~0xff00ff) + ((((i_2626_ & 0xff00) * i_2627_) + ((i_2629_ & 0xff00) * i_2628_)) & 0xff0000)) >> 8;
										} else if (i_2627_ != 255) {
											int i_2630_ = (((i_2626_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2631_ = (((i_2626_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2632_ = ((i_2626_ & 0xff) * anInt8882 & 0xff00);
											i_2626_ = (i_2630_ | i_2631_ | i_2632_) >>> 8;
											int i_2633_ = is[i_2609_];
											is[i_2609_] = (((((i_2626_ & 0xff00ff) * i_2627_) + ((i_2633_ & 0xff00ff) * i_2628_)) & ~0xff00ff) + ((((i_2626_ & 0xff00) * i_2627_) + ((i_2633_ & 0xff00) * i_2628_)) & 0xff0000)) >> 8;
										} else {
											int i_2634_ = (((i_2626_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2635_ = (((i_2626_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2636_ = ((i_2626_ & 0xff) * anInt8882 & 0xff00);
											is[i_2609_] = (i_2634_ | i_2635_ | i_2636_) >>> 8;
										}
									} else if (i == 3) {
										int i_2637_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2608_]);
										int i_2638_ = anInt8877;
										int i_2639_ = i_2637_ + i_2638_;
										int i_2640_ = ((i_2637_ & 0xff00ff) + (i_2638_ & 0xff00ff));
										int i_2641_ = ((i_2640_ & 0x1000100) + (i_2639_ - i_2640_ & 0x10000));
										i_2641_ = (i_2639_ - i_2641_ | i_2641_ - (i_2641_ >>> 8));
										int i_2642_ = ((i_2637_ >>> 24) * anInt8878 >> 8);
										int i_2643_ = 256 - i_2642_;
										if (i_2642_ != 255) {
											i_2637_ = i_2641_;
											i_2641_ = is[i_2609_];
											i_2641_ = (((((i_2637_ & 0xff00ff) * i_2642_) + ((i_2641_ & 0xff00ff) * i_2643_)) & ~0xff00ff) + ((((i_2637_ & 0xff00) * i_2642_) + ((i_2641_ & 0xff00) * i_2643_)) & 0xff0000)) >> 8;
										}
										is[i_2609_] = i_2641_;
									} else if (i == 2) {
										int i_2644_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2608_]);
										int i_2645_ = i_2644_ >>> 24;
										int i_2646_ = 256 - i_2645_;
										int i_2647_ = ((i_2644_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2648_ = ((i_2644_ & 0xff00) * anInt8878 & 0xff0000);
										i_2644_ = (((i_2647_ | i_2648_) >>> 8) + anInt8885);
										int i_2649_ = is[i_2609_];
										is[i_2609_] = ((((i_2644_ & 0xff00ff) * i_2645_ + ((i_2649_ & 0xff00ff) * i_2646_)) & ~0xff00ff) + (((i_2644_ & 0xff00) * i_2645_ + ((i_2649_ & 0xff00) * i_2646_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_2532_ == 2) {
									if (i == 1) {
										int i_2650_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2608_]);
										int i_2651_ = is[i_2609_];
										int i_2652_ = i_2650_ + i_2651_;
										int i_2653_ = ((i_2650_ & 0xff00ff) + (i_2651_ & 0xff00ff));
										i_2651_ = ((i_2653_ & 0x1000100) + (i_2652_ - i_2653_ & 0x10000));
										is[i_2609_] = (i_2652_ - i_2651_ | i_2651_ - (i_2651_ >>> 8));
									} else if (i == 0) {
										int i_2654_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2608_]);
										int i_2655_ = ((i_2654_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2656_ = ((i_2654_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2657_ = ((i_2654_ & 0xff) * anInt8882 & 0xff00);
										i_2654_ = (i_2655_ | i_2656_ | i_2657_) >>> 8;
										int i_2658_ = is[i_2609_];
										int i_2659_ = i_2654_ + i_2658_;
										int i_2660_ = ((i_2654_ & 0xff00ff) + (i_2658_ & 0xff00ff));
										i_2658_ = ((i_2660_ & 0x1000100) + (i_2659_ - i_2660_ & 0x10000));
										is[i_2609_] = (i_2659_ - i_2658_ | i_2658_ - (i_2658_ >>> 8));
									} else if (i == 3) {
										int i_2661_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2608_]);
										int i_2662_ = anInt8877;
										int i_2663_ = i_2661_ + i_2662_;
										int i_2664_ = ((i_2661_ & 0xff00ff) + (i_2662_ & 0xff00ff));
										int i_2665_ = ((i_2664_ & 0x1000100) + (i_2663_ - i_2664_ & 0x10000));
										i_2661_ = (i_2663_ - i_2665_ | i_2665_ - (i_2665_ >>> 8));
										i_2665_ = is[i_2609_];
										i_2663_ = i_2661_ + i_2665_;
										i_2664_ = ((i_2661_ & 0xff00ff) + (i_2665_ & 0xff00ff));
										i_2665_ = ((i_2664_ & 0x1000100) + (i_2663_ - i_2664_ & 0x10000));
										is[i_2609_] = (i_2663_ - i_2665_ | i_2665_ - (i_2665_ >>> 8));
									} else if (i == 2) {
										int i_2666_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2608_]);
										int i_2667_ = ((i_2666_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2668_ = ((i_2666_ & 0xff00) * anInt8878 & 0xff0000);
										i_2666_ = (((i_2667_ | i_2668_) >>> 8) + anInt8885);
										int i_2669_ = is[i_2609_];
										int i_2670_ = i_2666_ + i_2669_;
										int i_2671_ = ((i_2666_ & 0xff00ff) + (i_2669_ & 0xff00ff));
										i_2669_ = ((i_2671_ & 0x1000100) + (i_2670_ - i_2671_ & 0x10000));
										is[i_2609_] = (i_2670_ - i_2669_ | i_2669_ - (i_2669_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_2605_ += anInt8868;
							}
						}
						i_2602_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				} else {
					int i_2672_ = anInt8864;
					while (i_2672_ < 0) {
						int i_2673_ = anInt8870;
						int i_2674_ = anInt8873;
						int i_2675_ = anInt8874 + anInt8866;
						int i_2676_ = anInt8862;
						if (i_2674_ >= 0 && i_2674_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) < 0) {
							if (i_2675_ < 0) {
								int i_2677_ = (anInt8868 - 1 - i_2675_) / anInt8868;
								i_2676_ += i_2677_;
								i_2675_ += anInt8868 * i_2677_;
								i_2673_ += i_2677_;
							}
							int i_2678_;
							if ((i_2678_ = (1 + i_2675_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_2676_)
								i_2676_ = i_2678_;
							for (/**/; i_2676_ < 0; i_2676_++) {
								int i_2679_ = ((i_2675_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851 + (i_2674_ >> 12));
								int i_2680_ = i_2673_++;
								if (i_2532_ == 0) {
									if (i == 1)
										is[i_2680_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2679_]);
									else if (i == 0) {
										int i_2681_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2679_++]);
										int i_2682_ = ((i_2681_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2683_ = ((i_2681_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2684_ = ((i_2681_ & 0xff) * anInt8882 & 0xff00);
										is[i_2680_] = (i_2682_ | i_2683_ | i_2684_) >>> 8;
									} else if (i == 3) {
										int i_2685_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2679_++]);
										int i_2686_ = anInt8877;
										int i_2687_ = i_2685_ + i_2686_;
										int i_2688_ = ((i_2685_ & 0xff00ff) + (i_2686_ & 0xff00ff));
										int i_2689_ = ((i_2688_ & 0x1000100) + (i_2687_ - i_2688_ & 0x10000));
										is[i_2680_] = (i_2687_ - i_2689_ | i_2689_ - (i_2689_ >>> 8));
									} else if (i == 2) {
										int i_2690_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2679_]);
										int i_2691_ = ((i_2690_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2692_ = ((i_2690_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2680_] = ((i_2691_ | i_2692_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_2532_ == 1) {
									if (i == 1) {
										int i_2693_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2679_]);
										int i_2694_ = i_2693_ >>> 24;
										int i_2695_ = 256 - i_2694_;
										int i_2696_ = is[i_2680_];
										is[i_2680_] = ((((i_2693_ & 0xff00ff) * i_2694_ + ((i_2696_ & 0xff00ff) * i_2695_)) & ~0xff00ff) + (((i_2693_ & 0xff00) * i_2694_ + ((i_2696_ & 0xff00) * i_2695_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_2697_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2679_]);
										int i_2698_ = ((i_2697_ >>> 24) * anInt8878 >> 8);
										int i_2699_ = 256 - i_2698_;
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_2700_ = is[i_2680_];
											is[i_2680_] = (((((i_2697_ & 0xff00ff) * i_2698_) + ((i_2700_ & 0xff00ff) * i_2699_)) & ~0xff00ff) + ((((i_2697_ & 0xff00) * i_2698_) + ((i_2700_ & 0xff00) * i_2699_)) & 0xff0000)) >> 8;
										} else if (i_2698_ != 255) {
											int i_2701_ = (((i_2697_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2702_ = (((i_2697_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2703_ = ((i_2697_ & 0xff) * anInt8882 & 0xff00);
											i_2697_ = (i_2701_ | i_2702_ | i_2703_) >>> 8;
											int i_2704_ = is[i_2680_];
											is[i_2680_] = (((((i_2697_ & 0xff00ff) * i_2698_) + ((i_2704_ & 0xff00ff) * i_2699_)) & ~0xff00ff) + ((((i_2697_ & 0xff00) * i_2698_) + ((i_2704_ & 0xff00) * i_2699_)) & 0xff0000)) >> 8;
										} else {
											int i_2705_ = (((i_2697_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2706_ = (((i_2697_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2707_ = ((i_2697_ & 0xff) * anInt8882 & 0xff00);
											is[i_2680_] = (i_2705_ | i_2706_ | i_2707_) >>> 8;
										}
									} else if (i == 3) {
										int i_2708_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2679_]);
										int i_2709_ = anInt8877;
										int i_2710_ = i_2708_ + i_2709_;
										int i_2711_ = ((i_2708_ & 0xff00ff) + (i_2709_ & 0xff00ff));
										int i_2712_ = ((i_2711_ & 0x1000100) + (i_2710_ - i_2711_ & 0x10000));
										i_2712_ = (i_2710_ - i_2712_ | i_2712_ - (i_2712_ >>> 8));
										int i_2713_ = ((i_2708_ >>> 24) * anInt8878 >> 8);
										int i_2714_ = 256 - i_2713_;
										if (i_2713_ != 255) {
											i_2708_ = i_2712_;
											i_2712_ = is[i_2680_];
											i_2712_ = (((((i_2708_ & 0xff00ff) * i_2713_) + ((i_2712_ & 0xff00ff) * i_2714_)) & ~0xff00ff) + ((((i_2708_ & 0xff00) * i_2713_) + ((i_2712_ & 0xff00) * i_2714_)) & 0xff0000)) >> 8;
										}
										is[i_2680_] = i_2712_;
									} else if (i == 2) {
										int i_2715_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2679_]);
										int i_2716_ = i_2715_ >>> 24;
										int i_2717_ = 256 - i_2716_;
										int i_2718_ = ((i_2715_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2719_ = ((i_2715_ & 0xff00) * anInt8878 & 0xff0000);
										i_2715_ = (((i_2718_ | i_2719_) >>> 8) + anInt8885);
										int i_2720_ = is[i_2680_];
										is[i_2680_] = ((((i_2715_ & 0xff00ff) * i_2716_ + ((i_2720_ & 0xff00ff) * i_2717_)) & ~0xff00ff) + (((i_2715_ & 0xff00) * i_2716_ + ((i_2720_ & 0xff00) * i_2717_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_2532_ == 2) {
									if (i == 1) {
										int i_2721_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2679_]);
										int i_2722_ = is[i_2680_];
										int i_2723_ = i_2721_ + i_2722_;
										int i_2724_ = ((i_2721_ & 0xff00ff) + (i_2722_ & 0xff00ff));
										i_2722_ = ((i_2724_ & 0x1000100) + (i_2723_ - i_2724_ & 0x10000));
										is[i_2680_] = (i_2723_ - i_2722_ | i_2722_ - (i_2722_ >>> 8));
									} else if (i == 0) {
										int i_2725_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2679_]);
										int i_2726_ = ((i_2725_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2727_ = ((i_2725_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2728_ = ((i_2725_ & 0xff) * anInt8882 & 0xff00);
										i_2725_ = (i_2726_ | i_2727_ | i_2728_) >>> 8;
										int i_2729_ = is[i_2680_];
										int i_2730_ = i_2725_ + i_2729_;
										int i_2731_ = ((i_2725_ & 0xff00ff) + (i_2729_ & 0xff00ff));
										i_2729_ = ((i_2731_ & 0x1000100) + (i_2730_ - i_2731_ & 0x10000));
										is[i_2680_] = (i_2730_ - i_2729_ | i_2729_ - (i_2729_ >>> 8));
									} else if (i == 3) {
										int i_2732_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2679_]);
										int i_2733_ = anInt8877;
										int i_2734_ = i_2732_ + i_2733_;
										int i_2735_ = ((i_2732_ & 0xff00ff) + (i_2733_ & 0xff00ff));
										int i_2736_ = ((i_2735_ & 0x1000100) + (i_2734_ - i_2735_ & 0x10000));
										i_2732_ = (i_2734_ - i_2736_ | i_2736_ - (i_2736_ >>> 8));
										i_2736_ = is[i_2680_];
										i_2734_ = i_2732_ + i_2736_;
										i_2735_ = ((i_2732_ & 0xff00ff) + (i_2736_ & 0xff00ff));
										i_2736_ = ((i_2735_ & 0x1000100) + (i_2734_ - i_2735_ & 0x10000));
										is[i_2680_] = (i_2734_ - i_2736_ | i_2736_ - (i_2736_ >>> 8));
									} else if (i == 2) {
										int i_2737_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2679_]);
										int i_2738_ = ((i_2737_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2739_ = ((i_2737_ & 0xff00) * anInt8878 & 0xff0000);
										i_2737_ = (((i_2738_ | i_2739_) >>> 8) + anInt8885);
										int i_2740_ = is[i_2680_];
										int i_2741_ = i_2737_ + i_2740_;
										int i_2742_ = ((i_2737_ & 0xff00ff) + (i_2740_ & 0xff00ff));
										i_2740_ = ((i_2742_ & 0x1000100) + (i_2741_ - i_2742_ & 0x10000));
										is[i_2680_] = (i_2741_ - i_2740_ | i_2740_ - (i_2740_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_2675_ += anInt8868;
							}
						}
						i_2672_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					int i_2743_ = anInt8864;
					while (i_2743_ < 0) {
						int i_2744_ = anInt8870;
						int i_2745_ = anInt8873 + anInt8858;
						int i_2746_ = anInt8874;
						int i_2747_ = anInt8862;
						if (i_2746_ >= 0 && i_2746_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) < 0) {
							int i_2748_;
							if ((i_2748_ = (i_2745_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12))) >= 0) {
								i_2748_ = (anInt8865 - i_2748_) / anInt8865;
								i_2747_ += i_2748_;
								i_2745_ += anInt8865 * i_2748_;
								i_2744_ += i_2748_;
							}
							if ((i_2748_ = (i_2745_ - anInt8865) / anInt8865) > i_2747_)
								i_2747_ = i_2748_;
							for (/**/; i_2747_ < 0; i_2747_++) {
								int i_2749_ = ((i_2746_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851 + (i_2745_ >> 12));
								int i_2750_ = i_2744_++;
								if (i_2532_ == 0) {
									if (i == 1)
										is[i_2750_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2749_]);
									else if (i == 0) {
										int i_2751_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2749_++]);
										int i_2752_ = ((i_2751_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2753_ = ((i_2751_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2754_ = ((i_2751_ & 0xff) * anInt8882 & 0xff00);
										is[i_2750_] = (i_2752_ | i_2753_ | i_2754_) >>> 8;
									} else if (i == 3) {
										int i_2755_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2749_++]);
										int i_2756_ = anInt8877;
										int i_2757_ = i_2755_ + i_2756_;
										int i_2758_ = ((i_2755_ & 0xff00ff) + (i_2756_ & 0xff00ff));
										int i_2759_ = ((i_2758_ & 0x1000100) + (i_2757_ - i_2758_ & 0x10000));
										is[i_2750_] = (i_2757_ - i_2759_ | i_2759_ - (i_2759_ >>> 8));
									} else if (i == 2) {
										int i_2760_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2749_]);
										int i_2761_ = ((i_2760_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2762_ = ((i_2760_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2750_] = ((i_2761_ | i_2762_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_2532_ == 1) {
									if (i == 1) {
										int i_2763_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2749_]);
										int i_2764_ = i_2763_ >>> 24;
										int i_2765_ = 256 - i_2764_;
										int i_2766_ = is[i_2750_];
										is[i_2750_] = ((((i_2763_ & 0xff00ff) * i_2764_ + ((i_2766_ & 0xff00ff) * i_2765_)) & ~0xff00ff) + (((i_2763_ & 0xff00) * i_2764_ + ((i_2766_ & 0xff00) * i_2765_)) & 0xff0000)) >> 8;
									} else if (i == 0) {
										int i_2767_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2749_]);
										int i_2768_ = ((i_2767_ >>> 24) * anInt8878 >> 8);
										int i_2769_ = 256 - i_2768_;
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_2770_ = is[i_2750_];
											is[i_2750_] = (((((i_2767_ & 0xff00ff) * i_2768_) + ((i_2770_ & 0xff00ff) * i_2769_)) & ~0xff00ff) + ((((i_2767_ & 0xff00) * i_2768_) + ((i_2770_ & 0xff00) * i_2769_)) & 0xff0000)) >> 8;
										} else if (i_2768_ != 255) {
											int i_2771_ = (((i_2767_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2772_ = (((i_2767_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2773_ = ((i_2767_ & 0xff) * anInt8882 & 0xff00);
											i_2767_ = (i_2771_ | i_2772_ | i_2773_) >>> 8;
											int i_2774_ = is[i_2750_];
											is[i_2750_] = (((((i_2767_ & 0xff00ff) * i_2768_) + ((i_2774_ & 0xff00ff) * i_2769_)) & ~0xff00ff) + ((((i_2767_ & 0xff00) * i_2768_) + ((i_2774_ & 0xff00) * i_2769_)) & 0xff0000)) >> 8;
										} else {
											int i_2775_ = (((i_2767_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2776_ = (((i_2767_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2777_ = ((i_2767_ & 0xff) * anInt8882 & 0xff00);
											is[i_2750_] = (i_2775_ | i_2776_ | i_2777_) >>> 8;
										}
									} else if (i == 3) {
										int i_2778_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2749_]);
										int i_2779_ = anInt8877;
										int i_2780_ = i_2778_ + i_2779_;
										int i_2781_ = ((i_2778_ & 0xff00ff) + (i_2779_ & 0xff00ff));
										int i_2782_ = ((i_2781_ & 0x1000100) + (i_2780_ - i_2781_ & 0x10000));
										i_2782_ = (i_2780_ - i_2782_ | i_2782_ - (i_2782_ >>> 8));
										int i_2783_ = ((i_2778_ >>> 24) * anInt8878 >> 8);
										int i_2784_ = 256 - i_2783_;
										if (i_2783_ != 255) {
											i_2778_ = i_2782_;
											i_2782_ = is[i_2750_];
											i_2782_ = (((((i_2778_ & 0xff00ff) * i_2783_) + ((i_2782_ & 0xff00ff) * i_2784_)) & ~0xff00ff) + ((((i_2778_ & 0xff00) * i_2783_) + ((i_2782_ & 0xff00) * i_2784_)) & 0xff0000)) >> 8;
										}
										is[i_2750_] = i_2782_;
									} else if (i == 2) {
										int i_2785_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2749_]);
										int i_2786_ = i_2785_ >>> 24;
										int i_2787_ = 256 - i_2786_;
										int i_2788_ = ((i_2785_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2789_ = ((i_2785_ & 0xff00) * anInt8878 & 0xff0000);
										i_2785_ = (((i_2788_ | i_2789_) >>> 8) + anInt8885);
										int i_2790_ = is[i_2750_];
										is[i_2750_] = ((((i_2785_ & 0xff00ff) * i_2786_ + ((i_2790_ & 0xff00ff) * i_2787_)) & ~0xff00ff) + (((i_2785_ & 0xff00) * i_2786_ + ((i_2790_ & 0xff00) * i_2787_)) & 0xff0000)) >> 8;
									} else
										throw new IllegalArgumentException();
								} else if (i_2532_ == 2) {
									if (i == 1) {
										int i_2791_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2749_]);
										int i_2792_ = is[i_2750_];
										int i_2793_ = i_2791_ + i_2792_;
										int i_2794_ = ((i_2791_ & 0xff00ff) + (i_2792_ & 0xff00ff));
										i_2792_ = ((i_2794_ & 0x1000100) + (i_2793_ - i_2794_ & 0x10000));
										is[i_2750_] = (i_2793_ - i_2792_ | i_2792_ - (i_2792_ >>> 8));
									} else if (i == 0) {
										int i_2795_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2749_]);
										int i_2796_ = ((i_2795_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2797_ = ((i_2795_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2798_ = ((i_2795_ & 0xff) * anInt8882 & 0xff00);
										i_2795_ = (i_2796_ | i_2797_ | i_2798_) >>> 8;
										int i_2799_ = is[i_2750_];
										int i_2800_ = i_2795_ + i_2799_;
										int i_2801_ = ((i_2795_ & 0xff00ff) + (i_2799_ & 0xff00ff));
										i_2799_ = ((i_2801_ & 0x1000100) + (i_2800_ - i_2801_ & 0x10000));
										is[i_2750_] = (i_2800_ - i_2799_ | i_2799_ - (i_2799_ >>> 8));
									} else if (i == 3) {
										int i_2802_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2749_]);
										int i_2803_ = anInt8877;
										int i_2804_ = i_2802_ + i_2803_;
										int i_2805_ = ((i_2802_ & 0xff00ff) + (i_2803_ & 0xff00ff));
										int i_2806_ = ((i_2805_ & 0x1000100) + (i_2804_ - i_2805_ & 0x10000));
										i_2802_ = (i_2804_ - i_2806_ | i_2806_ - (i_2806_ >>> 8));
										i_2806_ = is[i_2750_];
										i_2804_ = i_2802_ + i_2806_;
										i_2805_ = ((i_2802_ & 0xff00ff) + (i_2806_ & 0xff00ff));
										i_2806_ = ((i_2805_ & 0x1000100) + (i_2804_ - i_2805_ & 0x10000));
										is[i_2750_] = (i_2804_ - i_2806_ | i_2806_ - (i_2806_ >>> 8));
									} else if (i == 2) {
										int i_2807_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2749_]);
										int i_2808_ = ((i_2807_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2809_ = ((i_2807_ & 0xff00) * anInt8878 & 0xff0000);
										i_2807_ = (((i_2808_ | i_2809_) >>> 8) + anInt8885);
										int i_2810_ = is[i_2750_];
										int i_2811_ = i_2807_ + i_2810_;
										int i_2812_ = ((i_2807_ & 0xff00ff) + (i_2810_ & 0xff00ff));
										i_2810_ = ((i_2812_ & 0x1000100) + (i_2811_ - i_2812_ & 0x10000));
										is[i_2750_] = (i_2811_ - i_2810_ | i_2810_ - (i_2810_ >>> 8));
									}
								} else
									throw new IllegalArgumentException();
								i_2745_ += anInt8865;
							}
						}
						i_2743_++;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_2813_ = anInt8864;
					while (i_2813_ < 0) {
						int i_2814_ = anInt8870;
						int i_2815_ = anInt8873 + anInt8858;
						int i_2816_ = anInt8874 + anInt8866;
						int i_2817_ = anInt8862;
						int i_2818_;
						if ((i_2818_ = i_2815_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12)) >= 0) {
							i_2818_ = (anInt8865 - i_2818_) / anInt8865;
							i_2817_ += i_2818_;
							i_2815_ += anInt8865 * i_2818_;
							i_2816_ += anInt8868 * i_2818_;
							i_2814_ += i_2818_;
						}
						if ((i_2818_ = (i_2815_ - anInt8865) / anInt8865) > i_2817_)
							i_2817_ = i_2818_;
						if ((i_2818_ = i_2816_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12)) >= 0) {
							i_2818_ = (anInt8868 - i_2818_) / anInt8868;
							i_2817_ += i_2818_;
							i_2815_ += anInt8865 * i_2818_;
							i_2816_ += anInt8868 * i_2818_;
							i_2814_ += i_2818_;
						}
						if ((i_2818_ = (i_2816_ - anInt8868) / anInt8868) > i_2817_)
							i_2817_ = i_2818_;
						for (/**/; i_2817_ < 0; i_2817_++) {
							int i_2819_ = (((i_2816_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_2815_ >> 12));
							int i_2820_ = i_2814_++;
							if (i_2532_ == 0) {
								if (i == 1)
									is[i_2820_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2819_]);
								else if (i == 0) {
									int i_2821_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2819_++]);
									int i_2822_ = ((i_2821_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2823_ = ((i_2821_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2824_ = ((i_2821_ & 0xff) * anInt8882 & 0xff00);
									is[i_2820_] = (i_2822_ | i_2823_ | i_2824_) >>> 8;
								} else if (i == 3) {
									int i_2825_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2819_++]);
									int i_2826_ = anInt8877;
									int i_2827_ = i_2825_ + i_2826_;
									int i_2828_ = ((i_2825_ & 0xff00ff) + (i_2826_ & 0xff00ff));
									int i_2829_ = ((i_2828_ & 0x1000100) + (i_2827_ - i_2828_ & 0x10000));
									is[i_2820_] = (i_2827_ - i_2829_ | i_2829_ - (i_2829_ >>> 8));
								} else if (i == 2) {
									int i_2830_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2819_]);
									int i_2831_ = ((i_2830_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2832_ = ((i_2830_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2820_] = (((i_2831_ | i_2832_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_2532_ == 1) {
								if (i == 1) {
									int i_2833_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2819_]);
									int i_2834_ = i_2833_ >>> 24;
									int i_2835_ = 256 - i_2834_;
									int i_2836_ = is[i_2820_];
									is[i_2820_] = ((((i_2833_ & 0xff00ff) * i_2834_ + (i_2836_ & 0xff00ff) * i_2835_) & ~0xff00ff) + (((i_2833_ & 0xff00) * i_2834_ + (i_2836_ & 0xff00) * i_2835_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_2837_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2819_]);
									int i_2838_ = (i_2837_ >>> 24) * anInt8878 >> 8;
									int i_2839_ = 256 - i_2838_;
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_2840_ = is[i_2820_];
										is[i_2820_] = ((((i_2837_ & 0xff00ff) * i_2838_ + ((i_2840_ & 0xff00ff) * i_2839_)) & ~0xff00ff) + (((i_2837_ & 0xff00) * i_2838_ + ((i_2840_ & 0xff00) * i_2839_)) & 0xff0000)) >> 8;
									} else if (i_2838_ != 255) {
										int i_2841_ = ((i_2837_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2842_ = ((i_2837_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2843_ = ((i_2837_ & 0xff) * anInt8882 & 0xff00);
										i_2837_ = (i_2841_ | i_2842_ | i_2843_) >>> 8;
										int i_2844_ = is[i_2820_];
										is[i_2820_] = ((((i_2837_ & 0xff00ff) * i_2838_ + ((i_2844_ & 0xff00ff) * i_2839_)) & ~0xff00ff) + (((i_2837_ & 0xff00) * i_2838_ + ((i_2844_ & 0xff00) * i_2839_)) & 0xff0000)) >> 8;
									} else {
										int i_2845_ = ((i_2837_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2846_ = ((i_2837_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2847_ = ((i_2837_ & 0xff) * anInt8882 & 0xff00);
										is[i_2820_] = (i_2845_ | i_2846_ | i_2847_) >>> 8;
									}
								} else if (i == 3) {
									int i_2848_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2819_]);
									int i_2849_ = anInt8877;
									int i_2850_ = i_2848_ + i_2849_;
									int i_2851_ = ((i_2848_ & 0xff00ff) + (i_2849_ & 0xff00ff));
									int i_2852_ = ((i_2851_ & 0x1000100) + (i_2850_ - i_2851_ & 0x10000));
									i_2852_ = (i_2850_ - i_2852_ | i_2852_ - (i_2852_ >>> 8));
									int i_2853_ = (i_2848_ >>> 24) * anInt8878 >> 8;
									int i_2854_ = 256 - i_2853_;
									if (i_2853_ != 255) {
										i_2848_ = i_2852_;
										i_2852_ = is[i_2820_];
										i_2852_ = ((((i_2848_ & 0xff00ff) * i_2853_ + ((i_2852_ & 0xff00ff) * i_2854_)) & ~0xff00ff) + (((i_2848_ & 0xff00) * i_2853_ + ((i_2852_ & 0xff00) * i_2854_)) & 0xff0000)) >> 8;
									}
									is[i_2820_] = i_2852_;
								} else if (i == 2) {
									int i_2855_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2819_]);
									int i_2856_ = i_2855_ >>> 24;
									int i_2857_ = 256 - i_2856_;
									int i_2858_ = ((i_2855_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2859_ = ((i_2855_ & 0xff00) * anInt8878 & 0xff0000);
									i_2855_ = (((i_2858_ | i_2859_) >>> 8) + anInt8885);
									int i_2860_ = is[i_2820_];
									is[i_2820_] = ((((i_2855_ & 0xff00ff) * i_2856_ + (i_2860_ & 0xff00ff) * i_2857_) & ~0xff00ff) + (((i_2855_ & 0xff00) * i_2856_ + (i_2860_ & 0xff00) * i_2857_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_2532_ == 2) {
								if (i == 1) {
									int i_2861_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2819_]);
									int i_2862_ = is[i_2820_];
									int i_2863_ = i_2861_ + i_2862_;
									int i_2864_ = ((i_2861_ & 0xff00ff) + (i_2862_ & 0xff00ff));
									i_2862_ = ((i_2864_ & 0x1000100) + (i_2863_ - i_2864_ & 0x10000));
									is[i_2820_] = (i_2863_ - i_2862_ | i_2862_ - (i_2862_ >>> 8));
								} else if (i == 0) {
									int i_2865_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2819_]);
									int i_2866_ = ((i_2865_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2867_ = ((i_2865_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2868_ = ((i_2865_ & 0xff) * anInt8882 & 0xff00);
									i_2865_ = (i_2866_ | i_2867_ | i_2868_) >>> 8;
									int i_2869_ = is[i_2820_];
									int i_2870_ = i_2865_ + i_2869_;
									int i_2871_ = ((i_2865_ & 0xff00ff) + (i_2869_ & 0xff00ff));
									i_2869_ = ((i_2871_ & 0x1000100) + (i_2870_ - i_2871_ & 0x10000));
									is[i_2820_] = (i_2870_ - i_2869_ | i_2869_ - (i_2869_ >>> 8));
								} else if (i == 3) {
									int i_2872_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2819_]);
									int i_2873_ = anInt8877;
									int i_2874_ = i_2872_ + i_2873_;
									int i_2875_ = ((i_2872_ & 0xff00ff) + (i_2873_ & 0xff00ff));
									int i_2876_ = ((i_2875_ & 0x1000100) + (i_2874_ - i_2875_ & 0x10000));
									i_2872_ = (i_2874_ - i_2876_ | i_2876_ - (i_2876_ >>> 8));
									i_2876_ = is[i_2820_];
									i_2874_ = i_2872_ + i_2876_;
									i_2875_ = (i_2872_ & 0xff00ff) + (i_2876_ & 0xff00ff);
									i_2876_ = ((i_2875_ & 0x1000100) + (i_2874_ - i_2875_ & 0x10000));
									is[i_2820_] = (i_2874_ - i_2876_ | i_2876_ - (i_2876_ >>> 8));
								} else if (i == 2) {
									int i_2877_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2819_]);
									int i_2878_ = ((i_2877_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2879_ = ((i_2877_ & 0xff00) * anInt8878 & 0xff0000);
									i_2877_ = (((i_2878_ | i_2879_) >>> 8) + anInt8885);
									int i_2880_ = is[i_2820_];
									int i_2881_ = i_2877_ + i_2880_;
									int i_2882_ = ((i_2877_ & 0xff00ff) + (i_2880_ & 0xff00ff));
									i_2880_ = ((i_2882_ & 0x1000100) + (i_2881_ - i_2882_ & 0x10000));
									is[i_2820_] = (i_2881_ - i_2880_ | i_2880_ - (i_2880_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_2815_ += anInt8865;
							i_2816_ += anInt8868;
						}
						i_2813_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else {
					int i_2883_ = anInt8864;
					while (i_2883_ < 0) {
						int i_2884_ = anInt8870;
						int i_2885_ = anInt8873 + anInt8858;
						int i_2886_ = anInt8874 + anInt8866;
						int i_2887_ = anInt8862;
						int i_2888_;
						if ((i_2888_ = i_2885_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12)) >= 0) {
							i_2888_ = (anInt8865 - i_2888_) / anInt8865;
							i_2887_ += i_2888_;
							i_2885_ += anInt8865 * i_2888_;
							i_2886_ += anInt8868 * i_2888_;
							i_2884_ += i_2888_;
						}
						if ((i_2888_ = (i_2885_ - anInt8865) / anInt8865) > i_2887_)
							i_2887_ = i_2888_;
						if (i_2886_ < 0) {
							i_2888_ = (anInt8868 - 1 - i_2886_) / anInt8868;
							i_2887_ += i_2888_;
							i_2885_ += anInt8865 * i_2888_;
							i_2886_ += anInt8868 * i_2888_;
							i_2884_ += i_2888_;
						}
						if ((i_2888_ = (1 + i_2886_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_2887_)
							i_2887_ = i_2888_;
						for (/**/; i_2887_ < 0; i_2887_++) {
							int i_2889_ = (((i_2886_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_2885_ >> 12));
							int i_2890_ = i_2884_++;
							if (i_2532_ == 0) {
								if (i == 1)
									is[i_2890_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2889_]);
								else if (i == 0) {
									int i_2891_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2889_++]);
									int i_2892_ = ((i_2891_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2893_ = ((i_2891_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2894_ = ((i_2891_ & 0xff) * anInt8882 & 0xff00);
									is[i_2890_] = (i_2892_ | i_2893_ | i_2894_) >>> 8;
								} else if (i == 3) {
									int i_2895_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2889_++]);
									int i_2896_ = anInt8877;
									int i_2897_ = i_2895_ + i_2896_;
									int i_2898_ = ((i_2895_ & 0xff00ff) + (i_2896_ & 0xff00ff));
									int i_2899_ = ((i_2898_ & 0x1000100) + (i_2897_ - i_2898_ & 0x10000));
									is[i_2890_] = (i_2897_ - i_2899_ | i_2899_ - (i_2899_ >>> 8));
								} else if (i == 2) {
									int i_2900_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2889_]);
									int i_2901_ = ((i_2900_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2902_ = ((i_2900_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2890_] = (((i_2901_ | i_2902_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_2532_ == 1) {
								if (i == 1) {
									int i_2903_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2889_]);
									int i_2904_ = i_2903_ >>> 24;
									int i_2905_ = 256 - i_2904_;
									int i_2906_ = is[i_2890_];
									is[i_2890_] = ((((i_2903_ & 0xff00ff) * i_2904_ + (i_2906_ & 0xff00ff) * i_2905_) & ~0xff00ff) + (((i_2903_ & 0xff00) * i_2904_ + (i_2906_ & 0xff00) * i_2905_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_2907_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2889_]);
									int i_2908_ = (i_2907_ >>> 24) * anInt8878 >> 8;
									int i_2909_ = 256 - i_2908_;
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_2910_ = is[i_2890_];
										is[i_2890_] = ((((i_2907_ & 0xff00ff) * i_2908_ + ((i_2910_ & 0xff00ff) * i_2909_)) & ~0xff00ff) + (((i_2907_ & 0xff00) * i_2908_ + ((i_2910_ & 0xff00) * i_2909_)) & 0xff0000)) >> 8;
									} else if (i_2908_ != 255) {
										int i_2911_ = ((i_2907_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2912_ = ((i_2907_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2913_ = ((i_2907_ & 0xff) * anInt8882 & 0xff00);
										i_2907_ = (i_2911_ | i_2912_ | i_2913_) >>> 8;
										int i_2914_ = is[i_2890_];
										is[i_2890_] = ((((i_2907_ & 0xff00ff) * i_2908_ + ((i_2914_ & 0xff00ff) * i_2909_)) & ~0xff00ff) + (((i_2907_ & 0xff00) * i_2908_ + ((i_2914_ & 0xff00) * i_2909_)) & 0xff0000)) >> 8;
									} else {
										int i_2915_ = ((i_2907_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2916_ = ((i_2907_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2917_ = ((i_2907_ & 0xff) * anInt8882 & 0xff00);
										is[i_2890_] = (i_2915_ | i_2916_ | i_2917_) >>> 8;
									}
								} else if (i == 3) {
									int i_2918_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2889_]);
									int i_2919_ = anInt8877;
									int i_2920_ = i_2918_ + i_2919_;
									int i_2921_ = ((i_2918_ & 0xff00ff) + (i_2919_ & 0xff00ff));
									int i_2922_ = ((i_2921_ & 0x1000100) + (i_2920_ - i_2921_ & 0x10000));
									i_2922_ = (i_2920_ - i_2922_ | i_2922_ - (i_2922_ >>> 8));
									int i_2923_ = (i_2918_ >>> 24) * anInt8878 >> 8;
									int i_2924_ = 256 - i_2923_;
									if (i_2923_ != 255) {
										i_2918_ = i_2922_;
										i_2922_ = is[i_2890_];
										i_2922_ = ((((i_2918_ & 0xff00ff) * i_2923_ + ((i_2922_ & 0xff00ff) * i_2924_)) & ~0xff00ff) + (((i_2918_ & 0xff00) * i_2923_ + ((i_2922_ & 0xff00) * i_2924_)) & 0xff0000)) >> 8;
									}
									is[i_2890_] = i_2922_;
								} else if (i == 2) {
									int i_2925_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2889_]);
									int i_2926_ = i_2925_ >>> 24;
									int i_2927_ = 256 - i_2926_;
									int i_2928_ = ((i_2925_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2929_ = ((i_2925_ & 0xff00) * anInt8878 & 0xff0000);
									i_2925_ = (((i_2928_ | i_2929_) >>> 8) + anInt8885);
									int i_2930_ = is[i_2890_];
									is[i_2890_] = ((((i_2925_ & 0xff00ff) * i_2926_ + (i_2930_ & 0xff00ff) * i_2927_) & ~0xff00ff) + (((i_2925_ & 0xff00) * i_2926_ + (i_2930_ & 0xff00) * i_2927_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_2532_ == 2) {
								if (i == 1) {
									int i_2931_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2889_]);
									int i_2932_ = is[i_2890_];
									int i_2933_ = i_2931_ + i_2932_;
									int i_2934_ = ((i_2931_ & 0xff00ff) + (i_2932_ & 0xff00ff));
									i_2932_ = ((i_2934_ & 0x1000100) + (i_2933_ - i_2934_ & 0x10000));
									is[i_2890_] = (i_2933_ - i_2932_ | i_2932_ - (i_2932_ >>> 8));
								} else if (i == 0) {
									int i_2935_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2889_]);
									int i_2936_ = ((i_2935_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2937_ = ((i_2935_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2938_ = ((i_2935_ & 0xff) * anInt8882 & 0xff00);
									i_2935_ = (i_2936_ | i_2937_ | i_2938_) >>> 8;
									int i_2939_ = is[i_2890_];
									int i_2940_ = i_2935_ + i_2939_;
									int i_2941_ = ((i_2935_ & 0xff00ff) + (i_2939_ & 0xff00ff));
									i_2939_ = ((i_2941_ & 0x1000100) + (i_2940_ - i_2941_ & 0x10000));
									is[i_2890_] = (i_2940_ - i_2939_ | i_2939_ - (i_2939_ >>> 8));
								} else if (i == 3) {
									int i_2942_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2889_]);
									int i_2943_ = anInt8877;
									int i_2944_ = i_2942_ + i_2943_;
									int i_2945_ = ((i_2942_ & 0xff00ff) + (i_2943_ & 0xff00ff));
									int i_2946_ = ((i_2945_ & 0x1000100) + (i_2944_ - i_2945_ & 0x10000));
									i_2942_ = (i_2944_ - i_2946_ | i_2946_ - (i_2946_ >>> 8));
									i_2946_ = is[i_2890_];
									i_2944_ = i_2942_ + i_2946_;
									i_2945_ = (i_2942_ & 0xff00ff) + (i_2946_ & 0xff00ff);
									i_2946_ = ((i_2945_ & 0x1000100) + (i_2944_ - i_2945_ & 0x10000));
									is[i_2890_] = (i_2944_ - i_2946_ | i_2946_ - (i_2946_ >>> 8));
								} else if (i == 2) {
									int i_2947_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2889_]);
									int i_2948_ = ((i_2947_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2949_ = ((i_2947_ & 0xff00) * anInt8878 & 0xff0000);
									i_2947_ = (((i_2948_ | i_2949_) >>> 8) + anInt8885);
									int i_2950_ = is[i_2890_];
									int i_2951_ = i_2947_ + i_2950_;
									int i_2952_ = ((i_2947_ & 0xff00ff) + (i_2950_ & 0xff00ff));
									i_2950_ = ((i_2952_ & 0x1000100) + (i_2951_ - i_2952_ & 0x10000));
									is[i_2890_] = (i_2951_ - i_2950_ | i_2950_ - (i_2950_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_2885_ += anInt8865;
							i_2886_ += anInt8868;
						}
						i_2883_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8868 == 0) {
				int i_2953_ = anInt8864;
				while (i_2953_ < 0) {
					int i_2954_ = anInt8870;
					int i_2955_ = anInt8873 + anInt8858;
					int i_2956_ = anInt8874;
					int i_2957_ = anInt8862;
					if (i_2956_ >= 0 && i_2956_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) < 0) {
						if (i_2955_ < 0) {
							int i_2958_ = (anInt8865 - 1 - i_2955_) / anInt8865;
							i_2957_ += i_2958_;
							i_2955_ += anInt8865 * i_2958_;
							i_2954_ += i_2958_;
						}
						int i_2959_;
						if ((i_2959_ = (1 + i_2955_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_2957_)
							i_2957_ = i_2959_;
						for (/**/; i_2957_ < 0; i_2957_++) {
							int i_2960_ = (((i_2956_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_2955_ >> 12));
							int i_2961_ = i_2954_++;
							if (i_2532_ == 0) {
								if (i == 1)
									is[i_2961_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2960_]);
								else if (i == 0) {
									int i_2962_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2960_++]);
									int i_2963_ = ((i_2962_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2964_ = ((i_2962_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2965_ = ((i_2962_ & 0xff) * anInt8882 & 0xff00);
									is[i_2961_] = (i_2963_ | i_2964_ | i_2965_) >>> 8;
								} else if (i == 3) {
									int i_2966_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2960_++]);
									int i_2967_ = anInt8877;
									int i_2968_ = i_2966_ + i_2967_;
									int i_2969_ = ((i_2966_ & 0xff00ff) + (i_2967_ & 0xff00ff));
									int i_2970_ = ((i_2969_ & 0x1000100) + (i_2968_ - i_2969_ & 0x10000));
									is[i_2961_] = (i_2968_ - i_2970_ | i_2970_ - (i_2970_ >>> 8));
								} else if (i == 2) {
									int i_2971_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2960_]);
									int i_2972_ = ((i_2971_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2973_ = ((i_2971_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2961_] = (((i_2972_ | i_2973_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_2532_ == 1) {
								if (i == 1) {
									int i_2974_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2960_]);
									int i_2975_ = i_2974_ >>> 24;
									int i_2976_ = 256 - i_2975_;
									int i_2977_ = is[i_2961_];
									is[i_2961_] = ((((i_2974_ & 0xff00ff) * i_2975_ + (i_2977_ & 0xff00ff) * i_2976_) & ~0xff00ff) + (((i_2974_ & 0xff00) * i_2975_ + (i_2977_ & 0xff00) * i_2976_) & 0xff0000)) >> 8;
								} else if (i == 0) {
									int i_2978_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2960_]);
									int i_2979_ = (i_2978_ >>> 24) * anInt8878 >> 8;
									int i_2980_ = 256 - i_2979_;
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_2981_ = is[i_2961_];
										is[i_2961_] = ((((i_2978_ & 0xff00ff) * i_2979_ + ((i_2981_ & 0xff00ff) * i_2980_)) & ~0xff00ff) + (((i_2978_ & 0xff00) * i_2979_ + ((i_2981_ & 0xff00) * i_2980_)) & 0xff0000)) >> 8;
									} else if (i_2979_ != 255) {
										int i_2982_ = ((i_2978_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2983_ = ((i_2978_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2984_ = ((i_2978_ & 0xff) * anInt8882 & 0xff00);
										i_2978_ = (i_2982_ | i_2983_ | i_2984_) >>> 8;
										int i_2985_ = is[i_2961_];
										is[i_2961_] = ((((i_2978_ & 0xff00ff) * i_2979_ + ((i_2985_ & 0xff00ff) * i_2980_)) & ~0xff00ff) + (((i_2978_ & 0xff00) * i_2979_ + ((i_2985_ & 0xff00) * i_2980_)) & 0xff0000)) >> 8;
									} else {
										int i_2986_ = ((i_2978_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2987_ = ((i_2978_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2988_ = ((i_2978_ & 0xff) * anInt8882 & 0xff00);
										is[i_2961_] = (i_2986_ | i_2987_ | i_2988_) >>> 8;
									}
								} else if (i == 3) {
									int i_2989_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2960_]);
									int i_2990_ = anInt8877;
									int i_2991_ = i_2989_ + i_2990_;
									int i_2992_ = ((i_2989_ & 0xff00ff) + (i_2990_ & 0xff00ff));
									int i_2993_ = ((i_2992_ & 0x1000100) + (i_2991_ - i_2992_ & 0x10000));
									i_2993_ = (i_2991_ - i_2993_ | i_2993_ - (i_2993_ >>> 8));
									int i_2994_ = (i_2989_ >>> 24) * anInt8878 >> 8;
									int i_2995_ = 256 - i_2994_;
									if (i_2994_ != 255) {
										i_2989_ = i_2993_;
										i_2993_ = is[i_2961_];
										i_2993_ = ((((i_2989_ & 0xff00ff) * i_2994_ + ((i_2993_ & 0xff00ff) * i_2995_)) & ~0xff00ff) + (((i_2989_ & 0xff00) * i_2994_ + ((i_2993_ & 0xff00) * i_2995_)) & 0xff0000)) >> 8;
									}
									is[i_2961_] = i_2993_;
								} else if (i == 2) {
									int i_2996_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2960_]);
									int i_2997_ = i_2996_ >>> 24;
									int i_2998_ = 256 - i_2997_;
									int i_2999_ = ((i_2996_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_3000_ = ((i_2996_ & 0xff00) * anInt8878 & 0xff0000);
									i_2996_ = (((i_2999_ | i_3000_) >>> 8) + anInt8885);
									int i_3001_ = is[i_2961_];
									is[i_2961_] = ((((i_2996_ & 0xff00ff) * i_2997_ + (i_3001_ & 0xff00ff) * i_2998_) & ~0xff00ff) + (((i_2996_ & 0xff00) * i_2997_ + (i_3001_ & 0xff00) * i_2998_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_2532_ == 2) {
								if (i == 1) {
									int i_3002_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2960_]);
									int i_3003_ = is[i_2961_];
									int i_3004_ = i_3002_ + i_3003_;
									int i_3005_ = ((i_3002_ & 0xff00ff) + (i_3003_ & 0xff00ff));
									i_3003_ = ((i_3005_ & 0x1000100) + (i_3004_ - i_3005_ & 0x10000));
									is[i_2961_] = (i_3004_ - i_3003_ | i_3003_ - (i_3003_ >>> 8));
								} else if (i == 0) {
									int i_3006_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2960_]);
									int i_3007_ = ((i_3006_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_3008_ = ((i_3006_ & 0xff00) * anInt8852 & 0xff0000);
									int i_3009_ = ((i_3006_ & 0xff) * anInt8882 & 0xff00);
									i_3006_ = (i_3007_ | i_3008_ | i_3009_) >>> 8;
									int i_3010_ = is[i_2961_];
									int i_3011_ = i_3006_ + i_3010_;
									int i_3012_ = ((i_3006_ & 0xff00ff) + (i_3010_ & 0xff00ff));
									i_3010_ = ((i_3012_ & 0x1000100) + (i_3011_ - i_3012_ & 0x10000));
									is[i_2961_] = (i_3011_ - i_3010_ | i_3010_ - (i_3010_ >>> 8));
								} else if (i == 3) {
									int i_3013_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2960_]);
									int i_3014_ = anInt8877;
									int i_3015_ = i_3013_ + i_3014_;
									int i_3016_ = ((i_3013_ & 0xff00ff) + (i_3014_ & 0xff00ff));
									int i_3017_ = ((i_3016_ & 0x1000100) + (i_3015_ - i_3016_ & 0x10000));
									i_3013_ = (i_3015_ - i_3017_ | i_3017_ - (i_3017_ >>> 8));
									i_3017_ = is[i_2961_];
									i_3015_ = i_3013_ + i_3017_;
									i_3016_ = (i_3013_ & 0xff00ff) + (i_3017_ & 0xff00ff);
									i_3017_ = ((i_3016_ & 0x1000100) + (i_3015_ - i_3016_ & 0x10000));
									is[i_2961_] = (i_3015_ - i_3017_ | i_3017_ - (i_3017_ >>> 8));
								} else if (i == 2) {
									int i_3018_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_2960_]);
									int i_3019_ = ((i_3018_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_3020_ = ((i_3018_ & 0xff00) * anInt8878 & 0xff0000);
									i_3018_ = (((i_3019_ | i_3020_) >>> 8) + anInt8885);
									int i_3021_ = is[i_2961_];
									int i_3022_ = i_3018_ + i_3021_;
									int i_3023_ = ((i_3018_ & 0xff00ff) + (i_3021_ & 0xff00ff));
									i_3021_ = ((i_3023_ & 0x1000100) + (i_3022_ - i_3023_ & 0x10000));
									is[i_2961_] = (i_3022_ - i_3021_ | i_3021_ - (i_3021_ >>> 8));
								}
							} else
								throw new IllegalArgumentException();
							i_2955_ += anInt8865;
						}
					}
					i_2953_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else if (anInt8868 < 0) {
				for (int i_3024_ = anInt8864; i_3024_ < 0; i_3024_++) {
					int i_3025_ = anInt8870;
					int i_3026_ = anInt8873 + anInt8858;
					int i_3027_ = anInt8874 + anInt8866;
					int i_3028_ = anInt8862;
					if (i_3026_ < 0) {
						int i_3029_ = (anInt8865 - 1 - i_3026_) / anInt8865;
						i_3028_ += i_3029_;
						i_3026_ += anInt8865 * i_3029_;
						i_3027_ += anInt8868 * i_3029_;
						i_3025_ += i_3029_;
					}
					int i_3030_;
					if ((i_3030_ = (1 + i_3026_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_3028_)
						i_3028_ = i_3030_;
					if ((i_3030_ = i_3027_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12)) >= 0) {
						i_3030_ = (anInt8868 - i_3030_) / anInt8868;
						i_3028_ += i_3030_;
						i_3026_ += anInt8865 * i_3030_;
						i_3027_ += anInt8868 * i_3030_;
						i_3025_ += i_3030_;
					}
					if ((i_3030_ = (i_3027_ - anInt8868) / anInt8868) > i_3028_)
						i_3028_ = i_3030_;
					for (/**/; i_3028_ < 0; i_3028_++) {
						int i_3031_ = (((i_3027_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_3026_ >> 12));
						int i_3032_ = i_3025_++;
						if (i_2532_ == 0) {
							if (i == 1)
								is[i_3032_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3031_]);
							else if (i == 0) {
								int i_3033_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3031_++]);
								int i_3034_ = ((i_3033_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_3035_ = ((i_3033_ & 0xff00) * anInt8852 & 0xff0000);
								int i_3036_ = (i_3033_ & 0xff) * anInt8882 & 0xff00;
								is[i_3032_] = (i_3034_ | i_3035_ | i_3036_) >>> 8;
							} else if (i == 3) {
								int i_3037_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3031_++]);
								int i_3038_ = anInt8877;
								int i_3039_ = i_3037_ + i_3038_;
								int i_3040_ = ((i_3037_ & 0xff00ff) + (i_3038_ & 0xff00ff));
								int i_3041_ = ((i_3040_ & 0x1000100) + (i_3039_ - i_3040_ & 0x10000));
								is[i_3032_] = i_3039_ - i_3041_ | i_3041_ - (i_3041_ >>> 8);
							} else if (i == 2) {
								int i_3042_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3031_]);
								int i_3043_ = ((i_3042_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_3044_ = ((i_3042_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_3032_] = ((i_3043_ | i_3044_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_2532_ == 1) {
							if (i == 1) {
								int i_3045_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3031_]);
								int i_3046_ = i_3045_ >>> 24;
								int i_3047_ = 256 - i_3046_;
								int i_3048_ = is[i_3032_];
								is[i_3032_] = ((((i_3045_ & 0xff00ff) * i_3046_ + (i_3048_ & 0xff00ff) * i_3047_) & ~0xff00ff) + (((i_3045_ & 0xff00) * i_3046_ + (i_3048_ & 0xff00) * i_3047_) & 0xff0000)) >> 8;
							} else if (i == 0) {
								int i_3049_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3031_]);
								int i_3050_ = (i_3049_ >>> 24) * anInt8878 >> 8;
								int i_3051_ = 256 - i_3050_;
								if ((anInt8877 & 0xffffff) == 16777215) {
									int i_3052_ = is[i_3032_];
									is[i_3032_] = ((((i_3049_ & 0xff00ff) * i_3050_ + (i_3052_ & 0xff00ff) * i_3051_) & ~0xff00ff) + (((i_3049_ & 0xff00) * i_3050_ + (i_3052_ & 0xff00) * i_3051_) & 0xff0000)) >> 8;
								} else if (i_3050_ != 255) {
									int i_3053_ = ((i_3049_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_3054_ = ((i_3049_ & 0xff00) * anInt8852 & 0xff0000);
									int i_3055_ = ((i_3049_ & 0xff) * anInt8882 & 0xff00);
									i_3049_ = (i_3053_ | i_3054_ | i_3055_) >>> 8;
									int i_3056_ = is[i_3032_];
									is[i_3032_] = ((((i_3049_ & 0xff00ff) * i_3050_ + (i_3056_ & 0xff00ff) * i_3051_) & ~0xff00ff) + (((i_3049_ & 0xff00) * i_3050_ + (i_3056_ & 0xff00) * i_3051_) & 0xff0000)) >> 8;
								} else {
									int i_3057_ = ((i_3049_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_3058_ = ((i_3049_ & 0xff00) * anInt8852 & 0xff0000);
									int i_3059_ = ((i_3049_ & 0xff) * anInt8882 & 0xff00);
									is[i_3032_] = (i_3057_ | i_3058_ | i_3059_) >>> 8;
								}
							} else if (i == 3) {
								int i_3060_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3031_]);
								int i_3061_ = anInt8877;
								int i_3062_ = i_3060_ + i_3061_;
								int i_3063_ = ((i_3060_ & 0xff00ff) + (i_3061_ & 0xff00ff));
								int i_3064_ = ((i_3063_ & 0x1000100) + (i_3062_ - i_3063_ & 0x10000));
								i_3064_ = i_3062_ - i_3064_ | i_3064_ - (i_3064_ >>> 8);
								int i_3065_ = (i_3060_ >>> 24) * anInt8878 >> 8;
								int i_3066_ = 256 - i_3065_;
								if (i_3065_ != 255) {
									i_3060_ = i_3064_;
									i_3064_ = is[i_3032_];
									i_3064_ = ((((i_3060_ & 0xff00ff) * i_3065_ + (i_3064_ & 0xff00ff) * i_3066_) & ~0xff00ff) + (((i_3060_ & 0xff00) * i_3065_ + (i_3064_ & 0xff00) * i_3066_) & 0xff0000)) >> 8;
								}
								is[i_3032_] = i_3064_;
							} else if (i == 2) {
								int i_3067_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3031_]);
								int i_3068_ = i_3067_ >>> 24;
								int i_3069_ = 256 - i_3068_;
								int i_3070_ = ((i_3067_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_3071_ = ((i_3067_ & 0xff00) * anInt8878 & 0xff0000);
								i_3067_ = ((i_3070_ | i_3071_) >>> 8) + anInt8885;
								int i_3072_ = is[i_3032_];
								is[i_3032_] = ((((i_3067_ & 0xff00ff) * i_3068_ + (i_3072_ & 0xff00ff) * i_3069_) & ~0xff00ff) + (((i_3067_ & 0xff00) * i_3068_ + (i_3072_ & 0xff00) * i_3069_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_2532_ == 2) {
							if (i == 1) {
								int i_3073_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3031_]);
								int i_3074_ = is[i_3032_];
								int i_3075_ = i_3073_ + i_3074_;
								int i_3076_ = ((i_3073_ & 0xff00ff) + (i_3074_ & 0xff00ff));
								i_3074_ = ((i_3076_ & 0x1000100) + (i_3075_ - i_3076_ & 0x10000));
								is[i_3032_] = i_3075_ - i_3074_ | i_3074_ - (i_3074_ >>> 8);
							} else if (i == 0) {
								int i_3077_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3031_]);
								int i_3078_ = ((i_3077_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_3079_ = ((i_3077_ & 0xff00) * anInt8852 & 0xff0000);
								int i_3080_ = (i_3077_ & 0xff) * anInt8882 & 0xff00;
								i_3077_ = (i_3078_ | i_3079_ | i_3080_) >>> 8;
								int i_3081_ = is[i_3032_];
								int i_3082_ = i_3077_ + i_3081_;
								int i_3083_ = ((i_3077_ & 0xff00ff) + (i_3081_ & 0xff00ff));
								i_3081_ = ((i_3083_ & 0x1000100) + (i_3082_ - i_3083_ & 0x10000));
								is[i_3032_] = i_3082_ - i_3081_ | i_3081_ - (i_3081_ >>> 8);
							} else if (i == 3) {
								int i_3084_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3031_]);
								int i_3085_ = anInt8877;
								int i_3086_ = i_3084_ + i_3085_;
								int i_3087_ = ((i_3084_ & 0xff00ff) + (i_3085_ & 0xff00ff));
								int i_3088_ = ((i_3087_ & 0x1000100) + (i_3086_ - i_3087_ & 0x10000));
								i_3084_ = i_3086_ - i_3088_ | i_3088_ - (i_3088_ >>> 8);
								i_3088_ = is[i_3032_];
								i_3086_ = i_3084_ + i_3088_;
								i_3087_ = (i_3084_ & 0xff00ff) + (i_3088_ & 0xff00ff);
								i_3088_ = ((i_3087_ & 0x1000100) + (i_3086_ - i_3087_ & 0x10000));
								is[i_3032_] = i_3086_ - i_3088_ | i_3088_ - (i_3088_ >>> 8);
							} else if (i == 2) {
								int i_3089_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3031_]);
								int i_3090_ = ((i_3089_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_3091_ = ((i_3089_ & 0xff00) * anInt8878 & 0xff0000);
								i_3089_ = ((i_3090_ | i_3091_) >>> 8) + anInt8885;
								int i_3092_ = is[i_3032_];
								int i_3093_ = i_3089_ + i_3092_;
								int i_3094_ = ((i_3089_ & 0xff00ff) + (i_3092_ & 0xff00ff));
								i_3092_ = ((i_3094_ & 0x1000100) + (i_3093_ - i_3094_ & 0x10000));
								is[i_3032_] = i_3093_ - i_3092_ | i_3092_ - (i_3092_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_3026_ += anInt8865;
						i_3027_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else {
				for (int i_3095_ = anInt8864; i_3095_ < 0; i_3095_++) {
					int i_3096_ = anInt8870;
					int i_3097_ = anInt8873 + anInt8858;
					int i_3098_ = anInt8874 + anInt8866;
					int i_3099_ = anInt8862;
					if (i_3097_ < 0) {
						int i_3100_ = (anInt8865 - 1 - i_3097_) / anInt8865;
						i_3099_ += i_3100_;
						i_3097_ += anInt8865 * i_3100_;
						i_3098_ += anInt8868 * i_3100_;
						i_3096_ += i_3100_;
					}
					int i_3101_;
					if ((i_3101_ = (1 + i_3097_ - (((Class160_Sub1_Sub3) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_3099_)
						i_3099_ = i_3101_;
					if (i_3098_ < 0) {
						i_3101_ = (anInt8868 - 1 - i_3098_) / anInt8868;
						i_3099_ += i_3101_;
						i_3097_ += anInt8865 * i_3101_;
						i_3098_ += anInt8868 * i_3101_;
						i_3096_ += i_3101_;
					}
					if ((i_3101_ = (1 + i_3098_ - (((Class160_Sub1_Sub3) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_3099_)
						i_3099_ = i_3101_;
					for (/**/; i_3099_ < 0; i_3099_++) {
						int i_3102_ = (((i_3098_ >> 12) * ((Class160_Sub1_Sub3) this).anInt8851) + (i_3097_ >> 12));
						int i_3103_ = i_3096_++;
						if (i_2532_ == 0) {
							if (i == 1)
								is[i_3103_] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3102_]);
							else if (i == 0) {
								int i_3104_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3102_++]);
								int i_3105_ = ((i_3104_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_3106_ = ((i_3104_ & 0xff00) * anInt8852 & 0xff0000);
								int i_3107_ = (i_3104_ & 0xff) * anInt8882 & 0xff00;
								is[i_3103_] = (i_3105_ | i_3106_ | i_3107_) >>> 8;
							} else if (i == 3) {
								int i_3108_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3102_++]);
								int i_3109_ = anInt8877;
								int i_3110_ = i_3108_ + i_3109_;
								int i_3111_ = ((i_3108_ & 0xff00ff) + (i_3109_ & 0xff00ff));
								int i_3112_ = ((i_3111_ & 0x1000100) + (i_3110_ - i_3111_ & 0x10000));
								is[i_3103_] = i_3110_ - i_3112_ | i_3112_ - (i_3112_ >>> 8);
							} else if (i == 2) {
								int i_3113_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3102_]);
								int i_3114_ = ((i_3113_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_3115_ = ((i_3113_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_3103_] = ((i_3114_ | i_3115_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_2532_ == 1) {
							if (i == 1) {
								int i_3116_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3102_]);
								int i_3117_ = i_3116_ >>> 24;
								int i_3118_ = 256 - i_3117_;
								int i_3119_ = is[i_3103_];
								is[i_3103_] = ((((i_3116_ & 0xff00ff) * i_3117_ + (i_3119_ & 0xff00ff) * i_3118_) & ~0xff00ff) + (((i_3116_ & 0xff00) * i_3117_ + (i_3119_ & 0xff00) * i_3118_) & 0xff0000)) >> 8;
							} else if (i == 0) {
								int i_3120_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3102_]);
								int i_3121_ = (i_3120_ >>> 24) * anInt8878 >> 8;
								int i_3122_ = 256 - i_3121_;
								if ((anInt8877 & 0xffffff) == 16777215) {
									int i_3123_ = is[i_3103_];
									is[i_3103_] = ((((i_3120_ & 0xff00ff) * i_3121_ + (i_3123_ & 0xff00ff) * i_3122_) & ~0xff00ff) + (((i_3120_ & 0xff00) * i_3121_ + (i_3123_ & 0xff00) * i_3122_) & 0xff0000)) >> 8;
								} else if (i_3121_ != 255) {
									int i_3124_ = ((i_3120_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_3125_ = ((i_3120_ & 0xff00) * anInt8852 & 0xff0000);
									int i_3126_ = ((i_3120_ & 0xff) * anInt8882 & 0xff00);
									i_3120_ = (i_3124_ | i_3125_ | i_3126_) >>> 8;
									int i_3127_ = is[i_3103_];
									is[i_3103_] = ((((i_3120_ & 0xff00ff) * i_3121_ + (i_3127_ & 0xff00ff) * i_3122_) & ~0xff00ff) + (((i_3120_ & 0xff00) * i_3121_ + (i_3127_ & 0xff00) * i_3122_) & 0xff0000)) >> 8;
								} else {
									int i_3128_ = ((i_3120_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_3129_ = ((i_3120_ & 0xff00) * anInt8852 & 0xff0000);
									int i_3130_ = ((i_3120_ & 0xff) * anInt8882 & 0xff00);
									is[i_3103_] = (i_3128_ | i_3129_ | i_3130_) >>> 8;
								}
							} else if (i == 3) {
								int i_3131_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3102_]);
								int i_3132_ = anInt8877;
								int i_3133_ = i_3131_ + i_3132_;
								int i_3134_ = ((i_3131_ & 0xff00ff) + (i_3132_ & 0xff00ff));
								int i_3135_ = ((i_3134_ & 0x1000100) + (i_3133_ - i_3134_ & 0x10000));
								i_3135_ = i_3133_ - i_3135_ | i_3135_ - (i_3135_ >>> 8);
								int i_3136_ = (i_3131_ >>> 24) * anInt8878 >> 8;
								int i_3137_ = 256 - i_3136_;
								if (i_3136_ != 255) {
									i_3131_ = i_3135_;
									i_3135_ = is[i_3103_];
									i_3135_ = ((((i_3131_ & 0xff00ff) * i_3136_ + (i_3135_ & 0xff00ff) * i_3137_) & ~0xff00ff) + (((i_3131_ & 0xff00) * i_3136_ + (i_3135_ & 0xff00) * i_3137_) & 0xff0000)) >> 8;
								}
								is[i_3103_] = i_3135_;
							} else if (i == 2) {
								int i_3138_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3102_]);
								int i_3139_ = i_3138_ >>> 24;
								int i_3140_ = 256 - i_3139_;
								int i_3141_ = ((i_3138_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_3142_ = ((i_3138_ & 0xff00) * anInt8878 & 0xff0000);
								i_3138_ = ((i_3141_ | i_3142_) >>> 8) + anInt8885;
								int i_3143_ = is[i_3103_];
								is[i_3103_] = ((((i_3138_ & 0xff00ff) * i_3139_ + (i_3143_ & 0xff00ff) * i_3140_) & ~0xff00ff) + (((i_3138_ & 0xff00) * i_3139_ + (i_3143_ & 0xff00) * i_3140_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_2532_ == 2) {
							if (i == 1) {
								int i_3144_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3102_]);
								int i_3145_ = is[i_3103_];
								int i_3146_ = i_3144_ + i_3145_;
								int i_3147_ = ((i_3144_ & 0xff00ff) + (i_3145_ & 0xff00ff));
								i_3145_ = ((i_3147_ & 0x1000100) + (i_3146_ - i_3147_ & 0x10000));
								is[i_3103_] = i_3146_ - i_3145_ | i_3145_ - (i_3145_ >>> 8);
							} else if (i == 0) {
								int i_3148_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3102_]);
								int i_3149_ = ((i_3148_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_3150_ = ((i_3148_ & 0xff00) * anInt8852 & 0xff0000);
								int i_3151_ = (i_3148_ & 0xff) * anInt8882 & 0xff00;
								i_3148_ = (i_3149_ | i_3150_ | i_3151_) >>> 8;
								int i_3152_ = is[i_3103_];
								int i_3153_ = i_3148_ + i_3152_;
								int i_3154_ = ((i_3148_ & 0xff00ff) + (i_3152_ & 0xff00ff));
								i_3152_ = ((i_3154_ & 0x1000100) + (i_3153_ - i_3154_ & 0x10000));
								is[i_3103_] = i_3153_ - i_3152_ | i_3152_ - (i_3152_ >>> 8);
							} else if (i == 3) {
								int i_3155_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3102_]);
								int i_3156_ = anInt8877;
								int i_3157_ = i_3155_ + i_3156_;
								int i_3158_ = ((i_3155_ & 0xff00ff) + (i_3156_ & 0xff00ff));
								int i_3159_ = ((i_3158_ & 0x1000100) + (i_3157_ - i_3158_ & 0x10000));
								i_3155_ = i_3157_ - i_3159_ | i_3159_ - (i_3159_ >>> 8);
								i_3159_ = is[i_3103_];
								i_3157_ = i_3155_ + i_3159_;
								i_3158_ = (i_3155_ & 0xff00ff) + (i_3159_ & 0xff00ff);
								i_3159_ = ((i_3158_ & 0x1000100) + (i_3157_ - i_3158_ & 0x10000));
								is[i_3103_] = i_3157_ - i_3159_ | i_3159_ - (i_3159_ >>> 8);
							} else if (i == 2) {
								int i_3160_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3102_]);
								int i_3161_ = ((i_3160_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_3162_ = ((i_3160_ & 0xff00) * anInt8878 & 0xff0000);
								i_3160_ = ((i_3161_ | i_3162_) >>> 8) + anInt8885;
								int i_3163_ = is[i_3103_];
								int i_3164_ = i_3160_ + i_3163_;
								int i_3165_ = ((i_3160_ & 0xff00ff) + (i_3163_ & 0xff00ff));
								i_3163_ = ((i_3165_ & 0x1000100) + (i_3164_ - i_3165_ & 0x10000));
								is[i_3103_] = i_3164_ - i_3163_ | i_3163_ - (i_3163_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_3097_ += anInt8865;
						i_3098_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			}
		}
	}

	public void method2771(int i, int i_3166_, int i_3167_) {
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is == null)
			throw new IllegalStateException("");
		if (i_3167_ == 0) {
			for (int i_3168_ = 0; i_3168_ < ((Class160_Sub1_Sub3) this).anInt8867; i_3168_++) {
				int i_3169_ = i_3168_ * ((Class160_Sub1_Sub3) this).anInt8851;
				int i_3170_ = (((i_3166_ + i_3168_) * (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i);
				for (int i_3171_ = 0; i_3171_ < ((Class160_Sub1_Sub3) this).anInt8851; i_3171_++)
					((Class160_Sub1_Sub3) this).anIntArray10235[(i_3169_ + i_3171_)] = ((((Class160_Sub1_Sub3) this).anIntArray10235[i_3169_ + i_3171_]) & 0xffffff | is[i_3170_ + i_3171_] << 8 & ~0xffffff);
			}
		} else if (i_3167_ == 1) {
			for (int i_3172_ = 0; i_3172_ < ((Class160_Sub1_Sub3) this).anInt8867; i_3172_++) {
				int i_3173_ = i_3172_ * ((Class160_Sub1_Sub3) this).anInt8851;
				int i_3174_ = (((i_3166_ + i_3172_) * (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i);
				for (int i_3175_ = 0; i_3175_ < ((Class160_Sub1_Sub3) this).anInt8851; i_3175_++)
					((Class160_Sub1_Sub3) this).anIntArray10235[(i_3173_ + i_3175_)] = ((((Class160_Sub1_Sub3) this).anIntArray10235[i_3173_ + i_3175_]) & 0xffffff | is[i_3174_ + i_3175_] << 16 & ~0xffffff);
			}
		} else if (i_3167_ == 2) {
			for (int i_3176_ = 0; i_3176_ < ((Class160_Sub1_Sub3) this).anInt8867; i_3176_++) {
				int i_3177_ = i_3176_ * ((Class160_Sub1_Sub3) this).anInt8851;
				int i_3178_ = (((i_3166_ + i_3176_) * (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i);
				for (int i_3179_ = 0; i_3179_ < ((Class160_Sub1_Sub3) this).anInt8851; i_3179_++)
					((Class160_Sub1_Sub3) this).anIntArray10235[(i_3177_ + i_3179_)] = ((((Class160_Sub1_Sub3) this).anIntArray10235[i_3177_ + i_3179_]) & 0xffffff | is[i_3178_ + i_3179_] << 24 & ~0xffffff);
			}
		} else if (i_3167_ == 3) {
			for (int i_3180_ = 0; i_3180_ < ((Class160_Sub1_Sub3) this).anInt8867; i_3180_++) {
				int i_3181_ = i_3180_ * ((Class160_Sub1_Sub3) this).anInt8851;
				int i_3182_ = (((i_3166_ + i_3180_) * (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i);
				for (int i_3183_ = 0; i_3183_ < ((Class160_Sub1_Sub3) this).anInt8851; i_3183_++)
					((Class160_Sub1_Sub3) this).anIntArray10235[(i_3181_ + i_3183_)] = ((((Class160_Sub1_Sub3) this).anIntArray10235[i_3181_ + i_3183_]) & 0xffffff | (is[i_3182_ + i_3183_] != 0 ? -16777216 : 0));
			}
		}
	}

	public void method2749(int i, int i_3184_, int i_3185_, int i_3186_, int i_3187_) {
		if (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			int i_3188_ = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			i += ((Class160_Sub1_Sub3) this).anInt8853;
			i_3184_ += ((Class160_Sub1_Sub3) this).anInt8854;
			int i_3189_ = i_3184_ * i_3188_ + i;
			int i_3190_ = 0;
			int i_3191_ = ((Class160_Sub1_Sub3) this).anInt8867;
			int i_3192_ = ((Class160_Sub1_Sub3) this).anInt8851;
			int i_3193_ = i_3188_ - i_3192_;
			int i_3194_ = 0;
			if (i_3184_ < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_3195_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_3184_);
				i_3191_ -= i_3195_;
				i_3184_ = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_3190_ += i_3195_ * i_3192_;
				i_3189_ += i_3195_ * i_3188_;
			}
			if (i_3184_ + i_3191_ > (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_3191_ -= (i_3184_ + i_3191_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_3196_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_3192_ -= i_3196_;
				i = (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_3190_ += i_3196_;
				i_3189_ += i_3196_;
				i_3194_ += i_3196_;
				i_3193_ += i_3196_;
			}
			if (i + i_3192_ > (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_3197_ = (i + i_3192_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_3192_ -= i_3197_;
				i_3194_ += i_3197_;
				i_3193_ += i_3197_;
			}
			if (i_3192_ > 0 && i_3191_ > 0) {
				if (i_3187_ == 0) {
					if (i_3185_ == 1) {
						for (int i_3198_ = -i_3191_; i_3198_ < 0; i_3198_++) {
							int i_3199_ = i_3189_ + i_3192_ - 3;
							while (i_3189_ < i_3199_) {
								is[i_3189_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
								is[i_3189_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
								is[i_3189_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
								is[i_3189_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
							}
							i_3199_ += 3;
							while (i_3189_ < i_3199_)
								is[i_3189_++] = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
							i_3189_ += i_3193_;
							i_3190_ += i_3194_;
						}
					} else if (i_3185_ == 0) {
						int i_3200_ = (i_3186_ & 0xff0000) >> 16;
						int i_3201_ = (i_3186_ & 0xff00) >> 8;
						int i_3202_ = i_3186_ & 0xff;
						for (int i_3203_ = -i_3191_; i_3203_ < 0; i_3203_++) {
							for (int i_3204_ = -i_3192_; i_3204_ < 0; i_3204_++) {
								int i_3205_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
								int i_3206_ = ((i_3205_ & 0xff0000) * i_3200_ & ~0xffffff);
								int i_3207_ = (i_3205_ & 0xff00) * i_3201_ & 0xff0000;
								int i_3208_ = (i_3205_ & 0xff) * i_3202_ & 0xff00;
								is[i_3189_++] = (i_3206_ | i_3207_ | i_3208_) >>> 8;
							}
							i_3189_ += i_3193_;
							i_3190_ += i_3194_;
						}
					} else if (i_3185_ == 3) {
						for (int i_3209_ = -i_3191_; i_3209_ < 0; i_3209_++) {
							for (int i_3210_ = -i_3192_; i_3210_ < 0; i_3210_++) {
								int i_3211_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
								int i_3212_ = i_3211_ + i_3186_;
								int i_3213_ = ((i_3211_ & 0xff00ff) + (i_3186_ & 0xff00ff));
								int i_3214_ = ((i_3213_ & 0x1000100) + (i_3212_ - i_3213_ & 0x10000));
								is[i_3189_++] = i_3212_ - i_3214_ | i_3214_ - (i_3214_ >>> 8);
							}
							i_3189_ += i_3193_;
							i_3190_ += i_3194_;
						}
					} else if (i_3185_ == 2) {
						int i_3215_ = i_3186_ >>> 24;
						int i_3216_ = 256 - i_3215_;
						int i_3217_ = (i_3186_ & 0xff00ff) * i_3216_ & ~0xff00ff;
						int i_3218_ = (i_3186_ & 0xff00) * i_3216_ & 0xff0000;
						i_3186_ = (i_3217_ | i_3218_) >>> 8;
						for (int i_3219_ = -i_3191_; i_3219_ < 0; i_3219_++) {
							for (int i_3220_ = -i_3192_; i_3220_ < 0; i_3220_++) {
								int i_3221_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
								i_3217_ = ((i_3221_ & 0xff00ff) * i_3215_ & ~0xff00ff);
								i_3218_ = (i_3221_ & 0xff00) * i_3215_ & 0xff0000;
								is[i_3189_++] = ((i_3217_ | i_3218_) >>> 8) + i_3186_;
							}
							i_3189_ += i_3193_;
							i_3190_ += i_3194_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3187_ == 1) {
					if (i_3185_ == 1) {
						for (int i_3222_ = -i_3191_; i_3222_ < 0; i_3222_++) {
							for (int i_3223_ = -i_3192_; i_3223_ < 0; i_3223_++) {
								int i_3224_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
								int i_3225_ = i_3224_ >>> 24;
								int i_3226_ = 256 - i_3225_;
								int i_3227_ = is[i_3189_];
								is[i_3189_++] = (((((i_3224_ & 0xff00ff) * i_3225_ + (i_3227_ & 0xff00ff) * i_3226_) & ~0xff00ff) >> 8) + (((((i_3224_ & ~0xff00ff) >>> 8) * i_3225_) + (((i_3227_ & ~0xff00ff) >>> 8) * i_3226_)) & ~0xff00ff));
							}
							i_3189_ += i_3193_;
							i_3190_ += i_3194_;
						}
					} else if (i_3185_ == 0) {
						if ((i_3186_ & 0xffffff) == 16777215) {
							for (int i_3228_ = -i_3191_; i_3228_ < 0; i_3228_++) {
								for (int i_3229_ = -i_3192_; i_3229_ < 0; i_3229_++) {
									int i_3230_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
									int i_3231_ = ((i_3230_ >>> 24) * (i_3186_ >>> 24) >> 8);
									int i_3232_ = 256 - i_3231_;
									int i_3233_ = is[i_3189_];
									is[i_3189_++] = ((((i_3230_ & 0xff00ff) * i_3231_ + (i_3233_ & 0xff00ff) * i_3232_) & ~0xff00ff) + (((i_3230_ & 0xff00) * i_3231_ + (i_3233_ & 0xff00) * i_3232_) & 0xff0000)) >> 8;
								}
								i_3189_ += i_3193_;
								i_3190_ += i_3194_;
							}
						} else {
							int i_3234_ = (i_3186_ & 0xff0000) >> 16;
							int i_3235_ = (i_3186_ & 0xff00) >> 8;
							int i_3236_ = i_3186_ & 0xff;
							for (int i_3237_ = -i_3191_; i_3237_ < 0; i_3237_++) {
								for (int i_3238_ = -i_3192_; i_3238_ < 0; i_3238_++) {
									int i_3239_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
									int i_3240_ = ((i_3239_ >>> 24) * (i_3186_ >>> 24) >> 8);
									int i_3241_ = 256 - i_3240_;
									if (i_3240_ != 255) {
										int i_3242_ = ((i_3239_ & 0xff0000) * i_3234_ & ~0xffffff);
										int i_3243_ = ((i_3239_ & 0xff00) * i_3235_ & 0xff0000);
										int i_3244_ = ((i_3239_ & 0xff) * i_3236_ & 0xff00);
										i_3239_ = (i_3242_ | i_3243_ | i_3244_) >>> 8;
										int i_3245_ = is[i_3189_];
										is[i_3189_++] = ((((i_3239_ & 0xff00ff) * i_3240_ + ((i_3245_ & 0xff00ff) * i_3241_)) & ~0xff00ff) + (((i_3239_ & 0xff00) * i_3240_ + ((i_3245_ & 0xff00) * i_3241_)) & 0xff0000)) >> 8;
									} else {
										int i_3246_ = ((i_3239_ & 0xff0000) * i_3234_ & ~0xffffff);
										int i_3247_ = ((i_3239_ & 0xff00) * i_3235_ & 0xff0000);
										int i_3248_ = ((i_3239_ & 0xff) * i_3236_ & 0xff00);
										is[i_3189_++] = (i_3246_ | i_3247_ | i_3248_) >>> 8;
									}
								}
								i_3189_ += i_3193_;
								i_3190_ += i_3194_;
							}
						}
					} else if (i_3185_ == 3) {
						for (int i_3249_ = -i_3191_; i_3249_ < 0; i_3249_++) {
							for (int i_3250_ = -i_3192_; i_3250_ < 0; i_3250_++) {
								int i_3251_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
								int i_3252_ = i_3251_ + i_3186_;
								int i_3253_ = ((i_3251_ & 0xff00ff) + (i_3186_ & 0xff00ff));
								int i_3254_ = ((i_3253_ & 0x1000100) + (i_3252_ - i_3253_ & 0x10000));
								i_3254_ = i_3252_ - i_3254_ | i_3254_ - (i_3254_ >>> 8);
								int i_3255_ = (i_3254_ >>> 24) * (i_3186_ >>> 24) >> 8;
								int i_3256_ = 256 - i_3255_;
								if (i_3255_ != 255) {
									i_3251_ = i_3254_;
									i_3254_ = is[i_3189_];
									i_3254_ = ((((i_3251_ & 0xff00ff) * i_3255_ + (i_3254_ & 0xff00ff) * i_3256_) & ~0xff00ff) + (((i_3251_ & 0xff00) * i_3255_ + (i_3254_ & 0xff00) * i_3256_) & 0xff0000)) >> 8;
								}
								is[i_3189_++] = i_3254_;
							}
							i_3189_ += i_3193_;
							i_3190_ += i_3194_;
						}
					} else if (i_3185_ == 2) {
						int i_3257_ = i_3186_ >>> 24;
						int i_3258_ = 256 - i_3257_;
						int i_3259_ = (i_3186_ & 0xff00ff) * i_3258_ & ~0xff00ff;
						int i_3260_ = (i_3186_ & 0xff00) * i_3258_ & 0xff0000;
						i_3186_ = (i_3259_ | i_3260_) >>> 8;
						for (int i_3261_ = -i_3191_; i_3261_ < 0; i_3261_++) {
							for (int i_3262_ = -i_3192_; i_3262_ < 0; i_3262_++) {
								int i_3263_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
								int i_3264_ = i_3263_ >>> 24;
								int i_3265_ = 256 - i_3264_;
								i_3259_ = ((i_3263_ & 0xff00ff) * i_3257_ & ~0xff00ff);
								i_3260_ = (i_3263_ & 0xff00) * i_3257_ & 0xff0000;
								i_3263_ = ((i_3259_ | i_3260_) >>> 8) + i_3186_;
								int i_3266_ = is[i_3189_];
								is[i_3189_++] = ((((i_3263_ & 0xff00ff) * i_3264_ + (i_3266_ & 0xff00ff) * i_3265_) & ~0xff00ff) + (((i_3263_ & 0xff00) * i_3264_ + (i_3266_ & 0xff00) * i_3265_) & 0xff0000)) >> 8;
							}
							i_3189_ += i_3193_;
							i_3190_ += i_3194_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3187_ == 2) {
					if (i_3185_ == 1) {
						for (int i_3267_ = -i_3191_; i_3267_ < 0; i_3267_++) {
							for (int i_3268_ = -i_3192_; i_3268_ < 0; i_3268_++) {
								int i_3269_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
								if (i_3269_ != 0) {
									int i_3270_ = is[i_3189_];
									int i_3271_ = i_3269_ + i_3270_;
									int i_3272_ = ((i_3269_ & 0xff00ff) + (i_3270_ & 0xff00ff));
									i_3270_ = ((i_3272_ & 0x1000100) + (i_3271_ - i_3272_ & 0x10000));
									is[i_3189_++] = (i_3271_ - i_3270_ | i_3270_ - (i_3270_ >>> 8));
								} else
									i_3189_++;
							}
							i_3189_ += i_3193_;
							i_3190_ += i_3194_;
						}
					} else if (i_3185_ == 0) {
						int i_3273_ = (i_3186_ & 0xff0000) >> 16;
						int i_3274_ = (i_3186_ & 0xff00) >> 8;
						int i_3275_ = i_3186_ & 0xff;
						for (int i_3276_ = -i_3191_; i_3276_ < 0; i_3276_++) {
							for (int i_3277_ = -i_3192_; i_3277_ < 0; i_3277_++) {
								int i_3278_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
								if (i_3278_ != 0) {
									int i_3279_ = ((i_3278_ & 0xff0000) * i_3273_ & ~0xffffff);
									int i_3280_ = ((i_3278_ & 0xff00) * i_3274_ & 0xff0000);
									int i_3281_ = (i_3278_ & 0xff) * i_3275_ & 0xff00;
									i_3278_ = (i_3279_ | i_3280_ | i_3281_) >>> 8;
									int i_3282_ = is[i_3189_];
									int i_3283_ = i_3278_ + i_3282_;
									int i_3284_ = ((i_3278_ & 0xff00ff) + (i_3282_ & 0xff00ff));
									i_3282_ = ((i_3284_ & 0x1000100) + (i_3283_ - i_3284_ & 0x10000));
									is[i_3189_++] = (i_3283_ - i_3282_ | i_3282_ - (i_3282_ >>> 8));
								} else
									i_3189_++;
							}
							i_3189_ += i_3193_;
							i_3190_ += i_3194_;
						}
					} else if (i_3185_ == 3) {
						for (int i_3285_ = -i_3191_; i_3285_ < 0; i_3285_++) {
							for (int i_3286_ = -i_3192_; i_3286_ < 0; i_3286_++) {
								int i_3287_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
								int i_3288_ = i_3287_ + i_3186_;
								int i_3289_ = ((i_3287_ & 0xff00ff) + (i_3186_ & 0xff00ff));
								int i_3290_ = ((i_3289_ & 0x1000100) + (i_3288_ - i_3289_ & 0x10000));
								i_3287_ = i_3288_ - i_3290_ | i_3290_ - (i_3290_ >>> 8);
								i_3290_ = is[i_3189_];
								i_3288_ = i_3287_ + i_3290_;
								i_3289_ = (i_3287_ & 0xff00ff) + (i_3290_ & 0xff00ff);
								i_3290_ = ((i_3289_ & 0x1000100) + (i_3288_ - i_3289_ & 0x10000));
								is[i_3189_++] = i_3288_ - i_3290_ | i_3290_ - (i_3290_ >>> 8);
							}
							i_3189_ += i_3193_;
							i_3190_ += i_3194_;
						}
					} else if (i_3185_ == 2) {
						int i_3291_ = i_3186_ >>> 24;
						int i_3292_ = 256 - i_3291_;
						int i_3293_ = (i_3186_ & 0xff00ff) * i_3292_ & ~0xff00ff;
						int i_3294_ = (i_3186_ & 0xff00) * i_3292_ & 0xff0000;
						i_3186_ = (i_3293_ | i_3294_) >>> 8;
						for (int i_3295_ = -i_3191_; i_3295_ < 0; i_3295_++) {
							for (int i_3296_ = -i_3192_; i_3296_ < 0; i_3296_++) {
								int i_3297_ = (((Class160_Sub1_Sub3) this).anIntArray10235[i_3190_++]);
								if (i_3297_ != 0) {
									i_3293_ = ((i_3297_ & 0xff00ff) * i_3291_ & ~0xff00ff);
									i_3294_ = ((i_3297_ & 0xff00) * i_3291_ & 0xff0000);
									i_3297_ = (((i_3293_ | i_3294_) >>> 8) + i_3186_);
									int i_3298_ = is[i_3189_];
									int i_3299_ = i_3297_ + i_3298_;
									int i_3300_ = ((i_3297_ & 0xff00ff) + (i_3298_ & 0xff00ff));
									i_3298_ = ((i_3300_ & 0x1000100) + (i_3299_ - i_3300_ & 0x10000));
									is[i_3189_++] = (i_3299_ - i_3298_ | i_3298_ - (i_3298_ >>> 8));
								} else
									i_3189_++;
							}
							i_3189_ += i_3193_;
							i_3190_ += i_3194_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Interface9 method2801() {
		return new Class192(((Class160_Sub1_Sub3) this).anInt8851, ((Class160_Sub1_Sub3) this).anInt8867, ((Class160_Sub1_Sub3) this).anIntArray10235);
	}

	void method14252(boolean bool, boolean bool_3301_, boolean bool_3302_, int i, int i_3303_, float f, int i_3304_, int i_3305_, int i_3306_, int i_3307_, int i_3308_, int i_3309_, boolean bool_3310_) {
		if (i_3304_ > 0 && i_3305_ > 0 && (bool || bool_3301_)) {
			int i_3311_ = 0;
			int i_3312_ = 0;
			int i_3313_ = (((Class160_Sub1_Sub3) this).anInt8853 + ((Class160_Sub1_Sub3) this).anInt8851 + ((Class160_Sub1_Sub3) this).anInt8855);
			int i_3314_ = (((Class160_Sub1_Sub3) this).anInt8854 + ((Class160_Sub1_Sub3) this).anInt8867 + ((Class160_Sub1_Sub3) this).anInt8856);
			int i_3315_ = (i_3313_ << 16) / i_3304_;
			int i_3316_ = (i_3314_ << 16) / i_3305_;
			if (((Class160_Sub1_Sub3) this).anInt8853 > 0) {
				int i_3317_ = (((((Class160_Sub1_Sub3) this).anInt8853 << 16) + i_3315_ - 1) / i_3315_);
				i += i_3317_;
				i_3311_ += (i_3317_ * i_3315_ - (((Class160_Sub1_Sub3) this).anInt8853 << 16));
			}
			if (((Class160_Sub1_Sub3) this).anInt8854 > 0) {
				int i_3318_ = (((((Class160_Sub1_Sub3) this).anInt8854 << 16) + i_3316_ - 1) / i_3316_);
				i_3303_ += i_3318_;
				i_3312_ += (i_3318_ * i_3316_ - (((Class160_Sub1_Sub3) this).anInt8854 << 16));
			}
			if (((Class160_Sub1_Sub3) this).anInt8851 < i_3313_)
				i_3304_ = ((((Class160_Sub1_Sub3) this).anInt8851 << 16) - i_3311_ + i_3315_ - 1) / i_3315_;
			if (((Class160_Sub1_Sub3) this).anInt8867 < i_3314_)
				i_3305_ = ((((Class160_Sub1_Sub3) this).anInt8867 << 16) - i_3312_ + i_3316_ - 1) / i_3316_;
			int i_3319_ = i + i_3303_ * ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980) * 444800403);
			int i_3320_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403) - i_3304_);
			if (i_3303_ + i_3305_ > (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_3305_ -= (i_3303_ + i_3305_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i_3303_ < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_3321_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_3303_);
				i_3305_ -= i_3321_;
				i_3319_ += i_3321_ * (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				i_3312_ += i_3316_ * i_3321_;
			}
			if (i + i_3304_ > (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_3322_ = (i + i_3304_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_3304_ -= i_3322_;
				i_3320_ += i_3322_;
			}
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_3323_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_3304_ -= i_3323_;
				i_3319_ += i_3323_;
				i_3311_ += i_3315_ * i_3323_;
				i_3320_ += i_3323_;
			}
			float[] fs = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).aFloatArray9010);
			int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
			if (i_3308_ == 0) {
				if (i_3306_ == 1) {
					int i_3324_ = i_3311_;
					for (int i_3325_ = -i_3305_; i_3325_ < 0; i_3325_++) {
						int i_3326_ = ((i_3312_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3327_ = -i_3304_; i_3327_ < 0; i_3327_++) {
							if (!bool_3301_ || f < fs[i_3319_]) {
								if (bool)
									is[i_3319_] = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3311_ >> 16) + i_3326_]);
								if (bool_3301_ && bool_3310_)
									fs[i_3319_] = f;
							}
							i_3311_ += i_3315_;
							i_3319_++;
						}
						i_3312_ += i_3316_;
						i_3311_ = i_3324_;
						i_3319_ += i_3320_;
					}
				} else if (i_3306_ == 0) {
					int i_3328_ = (i_3307_ & 0xff0000) >> 16;
					int i_3329_ = (i_3307_ & 0xff00) >> 8;
					int i_3330_ = i_3307_ & 0xff;
					int i_3331_ = i_3311_;
					for (int i_3332_ = -i_3305_; i_3332_ < 0; i_3332_++) {
						int i_3333_ = ((i_3312_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3334_ = -i_3304_; i_3334_ < 0; i_3334_++) {
							if (!bool_3301_ || f < fs[i_3319_]) {
								if (bool) {
									int i_3335_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3311_ >> 16) + i_3333_]);
									int i_3336_ = ((i_3335_ & 0xff0000) * i_3328_ & ~0xffffff);
									int i_3337_ = ((i_3335_ & 0xff00) * i_3329_ & 0xff0000);
									int i_3338_ = (i_3335_ & 0xff) * i_3330_ & 0xff00;
									is[i_3319_] = (i_3336_ | i_3337_ | i_3338_) >>> 8;
								}
								if (bool_3301_ && bool_3310_)
									fs[i_3319_] = f;
							}
							i_3311_ += i_3315_;
							i_3319_++;
						}
						i_3312_ += i_3316_;
						i_3311_ = i_3331_;
						i_3319_ += i_3320_;
					}
				} else if (i_3306_ == 3) {
					int i_3339_ = i_3311_;
					for (int i_3340_ = -i_3305_; i_3340_ < 0; i_3340_++) {
						int i_3341_ = ((i_3312_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3342_ = -i_3304_; i_3342_ < 0; i_3342_++) {
							if (!bool_3301_ || f < fs[i_3319_]) {
								if (bool) {
									int i_3343_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3311_ >> 16) + i_3341_]);
									int i_3344_ = i_3343_ + i_3307_;
									int i_3345_ = ((i_3343_ & 0xff00ff) + (i_3307_ & 0xff00ff));
									int i_3346_ = ((i_3345_ & 0x1000100) + (i_3344_ - i_3345_ & 0x10000));
									is[i_3319_] = (i_3344_ - i_3346_ | i_3346_ - (i_3346_ >>> 8));
								}
								if (bool_3301_ && bool_3310_)
									fs[i_3319_] = f;
							}
							i_3311_ += i_3315_;
							i_3319_++;
						}
						i_3312_ += i_3316_;
						i_3311_ = i_3339_;
						i_3319_ += i_3320_;
					}
				} else if (i_3306_ == 2) {
					int i_3347_ = i_3307_ >>> 24;
					int i_3348_ = 256 - i_3347_;
					int i_3349_ = (i_3307_ & 0xff00ff) * i_3348_ & ~0xff00ff;
					int i_3350_ = (i_3307_ & 0xff00) * i_3348_ & 0xff0000;
					i_3307_ = (i_3349_ | i_3350_) >>> 8;
					int i_3351_ = i_3311_;
					for (int i_3352_ = -i_3305_; i_3352_ < 0; i_3352_++) {
						int i_3353_ = ((i_3312_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3354_ = -i_3304_; i_3354_ < 0; i_3354_++) {
							if (!bool_3301_ || f < fs[i_3319_]) {
								if (bool) {
									int i_3355_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3311_ >> 16) + i_3353_]);
									i_3349_ = ((i_3355_ & 0xff00ff) * i_3347_ & ~0xff00ff);
									i_3350_ = ((i_3355_ & 0xff00) * i_3347_ & 0xff0000);
									is[i_3319_] = (((i_3349_ | i_3350_) >>> 8) + i_3307_);
								}
								if (bool_3301_ && bool_3310_)
									fs[i_3319_] = f;
							}
							i_3311_ += i_3315_;
							i_3319_++;
						}
						i_3312_ += i_3316_;
						i_3311_ = i_3351_;
						i_3319_ += i_3320_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_3308_ == 1) {
				if (i_3306_ == 1) {
					int i_3356_ = i_3311_;
					for (int i_3357_ = -i_3305_; i_3357_ < 0; i_3357_++) {
						int i_3358_ = ((i_3312_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3359_ = -i_3304_; i_3359_ < 0; i_3359_++) {
							if (!bool_3301_ || f < fs[i_3319_]) {
								if (bool) {
									int i_3360_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3311_ >> 16) + i_3358_]);
									int i_3361_ = i_3360_ >>> 24;
									int i_3362_ = 256 - i_3361_;
									int i_3363_ = is[i_3319_];
									is[i_3319_] = (((((i_3360_ & 0xff00ff) * i_3361_ + (i_3363_ & 0xff00ff) * i_3362_) & ~0xff00ff) >> 8) + (((((i_3360_ & ~0xff00ff) >>> 8) * i_3361_) + (((i_3363_ & ~0xff00ff) >>> 8) * i_3362_)) & ~0xff00ff));
								}
								if (bool_3301_ && bool_3310_)
									fs[i_3319_] = f;
							}
							i_3311_ += i_3315_;
							i_3319_++;
						}
						i_3312_ += i_3316_;
						i_3311_ = i_3356_;
						i_3319_ += i_3320_;
					}
				} else if (i_3306_ == 0) {
					int i_3364_ = i_3311_;
					if ((i_3307_ & 0xffffff) == 16777215) {
						for (int i_3365_ = -i_3305_; i_3365_ < 0; i_3365_++) {
							int i_3366_ = ((i_3312_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_3367_ = -i_3304_; i_3367_ < 0; i_3367_++) {
								if (!bool_3301_ || f < fs[i_3319_]) {
									if (bool) {
										int i_3368_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3311_ >> 16) + i_3366_]);
										int i_3369_ = ((i_3368_ >>> 24) * (i_3307_ >>> 24) >> 8);
										int i_3370_ = 256 - i_3369_;
										int i_3371_ = is[i_3319_];
										is[i_3319_] = ((((i_3368_ & 0xff00ff) * i_3369_ + ((i_3371_ & 0xff00ff) * i_3370_)) & ~0xff00ff) + (((i_3368_ & 0xff00) * i_3369_ + ((i_3371_ & 0xff00) * i_3370_)) & 0xff0000)) >> 8;
									}
									if (bool_3301_ && bool_3310_)
										fs[i_3319_] = f;
								}
								i_3311_ += i_3315_;
								i_3319_++;
							}
							i_3312_ += i_3316_;
							i_3311_ = i_3364_;
							i_3319_ += i_3320_;
						}
					} else {
						int i_3372_ = (i_3307_ & 0xff0000) >> 16;
						int i_3373_ = (i_3307_ & 0xff00) >> 8;
						int i_3374_ = i_3307_ & 0xff;
						for (int i_3375_ = -i_3305_; i_3375_ < 0; i_3375_++) {
							int i_3376_ = ((i_3312_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_3377_ = -i_3304_; i_3377_ < 0; i_3377_++) {
								if (!bool_3301_ || f < fs[i_3319_]) {
									int i_3378_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3311_ >> 16) + i_3376_]);
									int i_3379_ = ((i_3378_ >>> 24) * (i_3307_ >>> 24) >> 8);
									int i_3380_ = 256 - i_3379_;
									if (i_3379_ != 255) {
										if (bool) {
											int i_3381_ = (((i_3378_ & 0xff0000) * i_3372_) & ~0xffffff);
											int i_3382_ = ((i_3378_ & 0xff00) * i_3373_ & 0xff0000);
											int i_3383_ = ((i_3378_ & 0xff) * i_3374_ & 0xff00);
											i_3378_ = (i_3381_ | i_3382_ | i_3383_) >>> 8;
											int i_3384_ = is[i_3319_];
											is[i_3319_] = (((((i_3378_ & 0xff00ff) * i_3379_) + ((i_3384_ & 0xff00ff) * i_3380_)) & ~0xff00ff) + ((((i_3378_ & 0xff00) * i_3379_) + ((i_3384_ & 0xff00) * i_3380_)) & 0xff0000)) >> 8;
											if (bool_3302_) {
												int i_3385_ = ((i_3384_ >>> 24) + i_3379_);
												if (i_3385_ > 255)
													i_3385_ = 255;
												is[i_3319_] |= i_3385_ << 24;
											}
										}
										if (bool_3301_ && bool_3310_)
											fs[i_3319_] = f;
									} else {
										if (bool) {
											int i_3386_ = (((i_3378_ & 0xff0000) * i_3372_) & ~0xffffff);
											int i_3387_ = ((i_3378_ & 0xff00) * i_3373_ & 0xff0000);
											int i_3388_ = ((i_3378_ & 0xff) * i_3374_ & 0xff00);
											is[i_3319_] = (i_3386_ | i_3387_ | i_3388_) >>> 8;
										}
										if (bool_3301_ && bool_3310_)
											fs[i_3319_] = f;
									}
								}
								i_3311_ += i_3315_;
								i_3319_++;
							}
							i_3312_ += i_3316_;
							i_3311_ = i_3364_;
							i_3319_ += i_3320_;
						}
					}
				} else if (i_3306_ == 3) {
					int i_3389_ = i_3311_;
					for (int i_3390_ = -i_3305_; i_3390_ < 0; i_3390_++) {
						int i_3391_ = ((i_3312_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3392_ = -i_3304_; i_3392_ < 0; i_3392_++) {
							if (!bool_3301_ || f < fs[i_3319_]) {
								if (bool) {
									int i_3393_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3311_ >> 16) + i_3391_]);
									int i_3394_ = i_3393_ + i_3307_;
									int i_3395_ = ((i_3393_ & 0xff00ff) + (i_3307_ & 0xff00ff));
									int i_3396_ = ((i_3395_ & 0x1000100) + (i_3394_ - i_3395_ & 0x10000));
									i_3396_ = (i_3394_ - i_3396_ | i_3396_ - (i_3396_ >>> 8));
									int i_3397_ = ((i_3396_ >>> 24) * (i_3307_ >>> 24) >> 8);
									int i_3398_ = 256 - i_3397_;
									if (i_3397_ != 255) {
										i_3393_ = i_3396_;
										i_3396_ = is[i_3319_];
										i_3396_ = ((((i_3393_ & 0xff00ff) * i_3397_ + ((i_3396_ & 0xff00ff) * i_3398_)) & ~0xff00ff) + (((i_3393_ & 0xff00) * i_3397_ + ((i_3396_ & 0xff00) * i_3398_)) & 0xff0000)) >> 8;
									}
									is[i_3319_] = i_3396_;
								}
								if (bool_3301_ && bool_3310_)
									fs[i_3319_] = f;
							}
							i_3311_ += i_3315_;
							i_3319_++;
						}
						i_3312_ += i_3316_;
						i_3311_ = i_3389_;
						i_3319_ += i_3320_;
					}
				} else if (i_3306_ == 2) {
					int i_3399_ = i_3307_ >>> 24;
					int i_3400_ = 256 - i_3399_;
					int i_3401_ = (i_3307_ & 0xff00ff) * i_3400_ & ~0xff00ff;
					int i_3402_ = (i_3307_ & 0xff00) * i_3400_ & 0xff0000;
					i_3307_ = (i_3401_ | i_3402_) >>> 8;
					int i_3403_ = i_3311_;
					for (int i_3404_ = -i_3305_; i_3404_ < 0; i_3404_++) {
						int i_3405_ = ((i_3312_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3406_ = -i_3304_; i_3406_ < 0; i_3406_++) {
							if (!bool_3301_ || f < fs[i_3319_]) {
								if (bool) {
									int i_3407_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3311_ >> 16) + i_3405_]);
									int i_3408_ = i_3407_ >>> 24;
									int i_3409_ = 256 - i_3408_;
									i_3401_ = ((i_3407_ & 0xff00ff) * i_3399_ & ~0xff00ff);
									i_3402_ = ((i_3407_ & 0xff00) * i_3399_ & 0xff0000);
									i_3407_ = (((i_3401_ | i_3402_) >>> 8) + i_3307_);
									int i_3410_ = is[i_3319_];
									is[i_3319_] = ((((i_3407_ & 0xff00ff) * i_3408_ + (i_3410_ & 0xff00ff) * i_3409_) & ~0xff00ff) + (((i_3407_ & 0xff00) * i_3408_ + (i_3410_ & 0xff00) * i_3409_) & 0xff0000)) >> 8;
								}
								if (bool_3301_ && bool_3310_)
									fs[i_3319_] = f;
							}
							i_3311_ += i_3315_;
							i_3319_++;
						}
						i_3312_ += i_3316_;
						i_3311_ = i_3403_;
						i_3319_ += i_3320_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_3308_ == 2) {
				if (i_3306_ == 1) {
					int i_3411_ = i_3311_;
					for (int i_3412_ = -i_3305_; i_3412_ < 0; i_3412_++) {
						int i_3413_ = ((i_3312_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3414_ = -i_3304_; i_3414_ < 0; i_3414_++) {
							if (!bool_3301_ || f < fs[i_3319_]) {
								int i_3415_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3311_ >> 16) + i_3413_]);
								if (i_3415_ != 0) {
									if (bool) {
										int i_3416_ = is[i_3319_];
										int i_3417_ = i_3415_ + i_3416_;
										int i_3418_ = ((i_3415_ & 0xff00ff) + (i_3416_ & 0xff00ff));
										i_3416_ = ((i_3418_ & 0x1000100) + (i_3417_ - i_3418_ & 0x10000));
										is[i_3319_] = (i_3417_ - i_3416_ | i_3416_ - (i_3416_ >>> 8));
									}
									if (bool_3301_ && bool_3310_)
										fs[i_3319_] = f;
								}
							}
							i_3311_ += i_3315_;
							i_3319_++;
						}
						i_3312_ += i_3316_;
						i_3311_ = i_3411_;
						i_3319_ += i_3320_;
					}
				} else if (i_3306_ == 0) {
					int i_3419_ = i_3311_;
					int i_3420_ = (i_3307_ & 0xff0000) >> 16;
					int i_3421_ = (i_3307_ & 0xff00) >> 8;
					int i_3422_ = i_3307_ & 0xff;
					for (int i_3423_ = -i_3305_; i_3423_ < 0; i_3423_++) {
						int i_3424_ = ((i_3312_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3425_ = -i_3304_; i_3425_ < 0; i_3425_++) {
							if (!bool_3301_ || f < fs[i_3319_]) {
								int i_3426_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3311_ >> 16) + i_3424_]);
								if (i_3426_ != 0) {
									if (bool) {
										int i_3427_ = ((i_3426_ & 0xff0000) * i_3420_ & ~0xffffff);
										int i_3428_ = ((i_3426_ & 0xff00) * i_3421_ & 0xff0000);
										int i_3429_ = ((i_3426_ & 0xff) * i_3422_ & 0xff00);
										i_3426_ = (i_3427_ | i_3428_ | i_3429_) >>> 8;
										int i_3430_ = is[i_3319_];
										int i_3431_ = i_3426_ + i_3430_;
										int i_3432_ = ((i_3426_ & 0xff00ff) + (i_3430_ & 0xff00ff));
										i_3430_ = ((i_3432_ & 0x1000100) + (i_3431_ - i_3432_ & 0x10000));
										is[i_3319_] = (i_3431_ - i_3430_ | i_3430_ - (i_3430_ >>> 8));
									}
									if (bool_3301_ && bool_3310_)
										fs[i_3319_] = f;
								}
							}
							i_3311_ += i_3315_;
							i_3319_++;
						}
						i_3312_ += i_3316_;
						i_3311_ = i_3419_;
						i_3319_ += i_3320_;
					}
				} else if (i_3306_ == 3) {
					int i_3433_ = i_3311_;
					for (int i_3434_ = -i_3305_; i_3434_ < 0; i_3434_++) {
						int i_3435_ = ((i_3312_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3436_ = -i_3304_; i_3436_ < 0; i_3436_++) {
							if (!bool_3301_ || f < fs[i_3319_]) {
								if (bool) {
									int i_3437_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3311_ >> 16) + i_3435_]);
									int i_3438_ = i_3437_ + i_3307_;
									int i_3439_ = ((i_3437_ & 0xff00ff) + (i_3307_ & 0xff00ff));
									int i_3440_ = ((i_3439_ & 0x1000100) + (i_3438_ - i_3439_ & 0x10000));
									i_3437_ = (i_3438_ - i_3440_ | i_3440_ - (i_3440_ >>> 8));
									i_3440_ = is[i_3319_];
									i_3438_ = i_3437_ + i_3440_;
									i_3439_ = (i_3437_ & 0xff00ff) + (i_3440_ & 0xff00ff);
									i_3440_ = ((i_3439_ & 0x1000100) + (i_3438_ - i_3439_ & 0x10000));
									is[i_3319_] = (i_3438_ - i_3440_ | i_3440_ - (i_3440_ >>> 8));
								}
								if (bool_3301_ && bool_3310_)
									fs[i_3319_] = f;
							}
							i_3311_ += i_3315_;
							i_3319_++;
						}
						i_3312_ += i_3316_;
						i_3311_ = i_3433_;
						i_3319_ += i_3320_;
					}
				} else if (i_3306_ == 2) {
					int i_3441_ = i_3307_ >>> 24;
					int i_3442_ = 256 - i_3441_;
					int i_3443_ = (i_3307_ & 0xff00ff) * i_3442_ & ~0xff00ff;
					int i_3444_ = (i_3307_ & 0xff00) * i_3442_ & 0xff0000;
					i_3307_ = (i_3443_ | i_3444_) >>> 8;
					int i_3445_ = i_3311_;
					for (int i_3446_ = -i_3305_; i_3446_ < 0; i_3446_++) {
						int i_3447_ = ((i_3312_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3448_ = -i_3304_; i_3448_ < 0; i_3448_++) {
							if (!bool_3301_ || f < fs[i_3319_]) {
								int i_3449_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3311_ >> 16) + i_3447_]);
								if (i_3449_ != 0) {
									if (bool) {
										i_3443_ = ((i_3449_ & 0xff00ff) * i_3441_ & ~0xff00ff);
										i_3444_ = ((i_3449_ & 0xff00) * i_3441_ & 0xff0000);
										i_3449_ = (((i_3443_ | i_3444_) >>> 8) + i_3307_);
										int i_3450_ = is[i_3319_];
										int i_3451_ = i_3449_ + i_3450_;
										int i_3452_ = ((i_3449_ & 0xff00ff) + (i_3450_ & 0xff00ff));
										i_3450_ = ((i_3452_ & 0x1000100) + (i_3451_ - i_3452_ & 0x10000));
										is[i_3319_] = (i_3451_ - i_3450_ | i_3450_ - (i_3450_ >>> 8));
									}
									if (bool_3301_ && bool_3310_)
										fs[i_3319_] = f;
								}
							}
							i_3311_ += i_3315_;
							i_3319_++;
						}
						i_3312_ += i_3316_;
						i_3311_ = i_3445_;
						i_3319_ += i_3320_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method14255(boolean bool, boolean bool_3453_, boolean bool_3454_, int i, int i_3455_, float f, int i_3456_, int i_3457_, int i_3458_, int i_3459_, int i_3460_, int i_3461_, boolean bool_3462_) {
		if (i_3456_ > 0 && i_3457_ > 0 && (bool || bool_3453_)) {
			int i_3463_ = 0;
			int i_3464_ = 0;
			int i_3465_ = (((Class160_Sub1_Sub3) this).anInt8853 + ((Class160_Sub1_Sub3) this).anInt8851 + ((Class160_Sub1_Sub3) this).anInt8855);
			int i_3466_ = (((Class160_Sub1_Sub3) this).anInt8854 + ((Class160_Sub1_Sub3) this).anInt8867 + ((Class160_Sub1_Sub3) this).anInt8856);
			int i_3467_ = (i_3465_ << 16) / i_3456_;
			int i_3468_ = (i_3466_ << 16) / i_3457_;
			if (((Class160_Sub1_Sub3) this).anInt8853 > 0) {
				int i_3469_ = (((((Class160_Sub1_Sub3) this).anInt8853 << 16) + i_3467_ - 1) / i_3467_);
				i += i_3469_;
				i_3463_ += (i_3469_ * i_3467_ - (((Class160_Sub1_Sub3) this).anInt8853 << 16));
			}
			if (((Class160_Sub1_Sub3) this).anInt8854 > 0) {
				int i_3470_ = (((((Class160_Sub1_Sub3) this).anInt8854 << 16) + i_3468_ - 1) / i_3468_);
				i_3455_ += i_3470_;
				i_3464_ += (i_3470_ * i_3468_ - (((Class160_Sub1_Sub3) this).anInt8854 << 16));
			}
			if (((Class160_Sub1_Sub3) this).anInt8851 < i_3465_)
				i_3456_ = ((((Class160_Sub1_Sub3) this).anInt8851 << 16) - i_3463_ + i_3467_ - 1) / i_3467_;
			if (((Class160_Sub1_Sub3) this).anInt8867 < i_3466_)
				i_3457_ = ((((Class160_Sub1_Sub3) this).anInt8867 << 16) - i_3464_ + i_3468_ - 1) / i_3468_;
			int i_3471_ = i + i_3455_ * ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980) * 444800403);
			int i_3472_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403) - i_3456_);
			if (i_3455_ + i_3457_ > (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_3457_ -= (i_3455_ + i_3457_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i_3455_ < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_3473_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_3455_);
				i_3457_ -= i_3473_;
				i_3471_ += i_3473_ * (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				i_3464_ += i_3468_ * i_3473_;
			}
			if (i + i_3456_ > (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_3474_ = (i + i_3456_ - (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_3456_ -= i_3474_;
				i_3472_ += i_3474_;
			}
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_3475_ = ((((Class505_Sub3) (((Class160_Sub1_Sub3) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_3456_ -= i_3475_;
				i_3471_ += i_3475_;
				i_3463_ += i_3467_ * i_3475_;
				i_3472_ += i_3475_;
			}
			float[] fs = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).aFloatArray9010);
			int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub3) this).aClass505_Sub3_8875).anIntArray8979);
			if (i_3460_ == 0) {
				if (i_3458_ == 1) {
					int i_3476_ = i_3463_;
					for (int i_3477_ = -i_3457_; i_3477_ < 0; i_3477_++) {
						int i_3478_ = ((i_3464_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3479_ = -i_3456_; i_3479_ < 0; i_3479_++) {
							if (!bool_3453_ || f < fs[i_3471_]) {
								if (bool)
									is[i_3471_] = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3463_ >> 16) + i_3478_]);
								if (bool_3453_ && bool_3462_)
									fs[i_3471_] = f;
							}
							i_3463_ += i_3467_;
							i_3471_++;
						}
						i_3464_ += i_3468_;
						i_3463_ = i_3476_;
						i_3471_ += i_3472_;
					}
				} else if (i_3458_ == 0) {
					int i_3480_ = (i_3459_ & 0xff0000) >> 16;
					int i_3481_ = (i_3459_ & 0xff00) >> 8;
					int i_3482_ = i_3459_ & 0xff;
					int i_3483_ = i_3463_;
					for (int i_3484_ = -i_3457_; i_3484_ < 0; i_3484_++) {
						int i_3485_ = ((i_3464_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3486_ = -i_3456_; i_3486_ < 0; i_3486_++) {
							if (!bool_3453_ || f < fs[i_3471_]) {
								if (bool) {
									int i_3487_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3463_ >> 16) + i_3485_]);
									int i_3488_ = ((i_3487_ & 0xff0000) * i_3480_ & ~0xffffff);
									int i_3489_ = ((i_3487_ & 0xff00) * i_3481_ & 0xff0000);
									int i_3490_ = (i_3487_ & 0xff) * i_3482_ & 0xff00;
									is[i_3471_] = (i_3488_ | i_3489_ | i_3490_) >>> 8;
								}
								if (bool_3453_ && bool_3462_)
									fs[i_3471_] = f;
							}
							i_3463_ += i_3467_;
							i_3471_++;
						}
						i_3464_ += i_3468_;
						i_3463_ = i_3483_;
						i_3471_ += i_3472_;
					}
				} else if (i_3458_ == 3) {
					int i_3491_ = i_3463_;
					for (int i_3492_ = -i_3457_; i_3492_ < 0; i_3492_++) {
						int i_3493_ = ((i_3464_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3494_ = -i_3456_; i_3494_ < 0; i_3494_++) {
							if (!bool_3453_ || f < fs[i_3471_]) {
								if (bool) {
									int i_3495_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3463_ >> 16) + i_3493_]);
									int i_3496_ = i_3495_ + i_3459_;
									int i_3497_ = ((i_3495_ & 0xff00ff) + (i_3459_ & 0xff00ff));
									int i_3498_ = ((i_3497_ & 0x1000100) + (i_3496_ - i_3497_ & 0x10000));
									is[i_3471_] = (i_3496_ - i_3498_ | i_3498_ - (i_3498_ >>> 8));
								}
								if (bool_3453_ && bool_3462_)
									fs[i_3471_] = f;
							}
							i_3463_ += i_3467_;
							i_3471_++;
						}
						i_3464_ += i_3468_;
						i_3463_ = i_3491_;
						i_3471_ += i_3472_;
					}
				} else if (i_3458_ == 2) {
					int i_3499_ = i_3459_ >>> 24;
					int i_3500_ = 256 - i_3499_;
					int i_3501_ = (i_3459_ & 0xff00ff) * i_3500_ & ~0xff00ff;
					int i_3502_ = (i_3459_ & 0xff00) * i_3500_ & 0xff0000;
					i_3459_ = (i_3501_ | i_3502_) >>> 8;
					int i_3503_ = i_3463_;
					for (int i_3504_ = -i_3457_; i_3504_ < 0; i_3504_++) {
						int i_3505_ = ((i_3464_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3506_ = -i_3456_; i_3506_ < 0; i_3506_++) {
							if (!bool_3453_ || f < fs[i_3471_]) {
								if (bool) {
									int i_3507_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3463_ >> 16) + i_3505_]);
									i_3501_ = ((i_3507_ & 0xff00ff) * i_3499_ & ~0xff00ff);
									i_3502_ = ((i_3507_ & 0xff00) * i_3499_ & 0xff0000);
									is[i_3471_] = (((i_3501_ | i_3502_) >>> 8) + i_3459_);
								}
								if (bool_3453_ && bool_3462_)
									fs[i_3471_] = f;
							}
							i_3463_ += i_3467_;
							i_3471_++;
						}
						i_3464_ += i_3468_;
						i_3463_ = i_3503_;
						i_3471_ += i_3472_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_3460_ == 1) {
				if (i_3458_ == 1) {
					int i_3508_ = i_3463_;
					for (int i_3509_ = -i_3457_; i_3509_ < 0; i_3509_++) {
						int i_3510_ = ((i_3464_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3511_ = -i_3456_; i_3511_ < 0; i_3511_++) {
							if (!bool_3453_ || f < fs[i_3471_]) {
								if (bool) {
									int i_3512_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3463_ >> 16) + i_3510_]);
									int i_3513_ = i_3512_ >>> 24;
									int i_3514_ = 256 - i_3513_;
									int i_3515_ = is[i_3471_];
									is[i_3471_] = (((((i_3512_ & 0xff00ff) * i_3513_ + (i_3515_ & 0xff00ff) * i_3514_) & ~0xff00ff) >> 8) + (((((i_3512_ & ~0xff00ff) >>> 8) * i_3513_) + (((i_3515_ & ~0xff00ff) >>> 8) * i_3514_)) & ~0xff00ff));
								}
								if (bool_3453_ && bool_3462_)
									fs[i_3471_] = f;
							}
							i_3463_ += i_3467_;
							i_3471_++;
						}
						i_3464_ += i_3468_;
						i_3463_ = i_3508_;
						i_3471_ += i_3472_;
					}
				} else if (i_3458_ == 0) {
					int i_3516_ = i_3463_;
					if ((i_3459_ & 0xffffff) == 16777215) {
						for (int i_3517_ = -i_3457_; i_3517_ < 0; i_3517_++) {
							int i_3518_ = ((i_3464_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_3519_ = -i_3456_; i_3519_ < 0; i_3519_++) {
								if (!bool_3453_ || f < fs[i_3471_]) {
									if (bool) {
										int i_3520_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3463_ >> 16) + i_3518_]);
										int i_3521_ = ((i_3520_ >>> 24) * (i_3459_ >>> 24) >> 8);
										int i_3522_ = 256 - i_3521_;
										int i_3523_ = is[i_3471_];
										is[i_3471_] = ((((i_3520_ & 0xff00ff) * i_3521_ + ((i_3523_ & 0xff00ff) * i_3522_)) & ~0xff00ff) + (((i_3520_ & 0xff00) * i_3521_ + ((i_3523_ & 0xff00) * i_3522_)) & 0xff0000)) >> 8;
									}
									if (bool_3453_ && bool_3462_)
										fs[i_3471_] = f;
								}
								i_3463_ += i_3467_;
								i_3471_++;
							}
							i_3464_ += i_3468_;
							i_3463_ = i_3516_;
							i_3471_ += i_3472_;
						}
					} else {
						int i_3524_ = (i_3459_ & 0xff0000) >> 16;
						int i_3525_ = (i_3459_ & 0xff00) >> 8;
						int i_3526_ = i_3459_ & 0xff;
						for (int i_3527_ = -i_3457_; i_3527_ < 0; i_3527_++) {
							int i_3528_ = ((i_3464_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
							for (int i_3529_ = -i_3456_; i_3529_ < 0; i_3529_++) {
								if (!bool_3453_ || f < fs[i_3471_]) {
									int i_3530_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3463_ >> 16) + i_3528_]);
									int i_3531_ = ((i_3530_ >>> 24) * (i_3459_ >>> 24) >> 8);
									int i_3532_ = 256 - i_3531_;
									if (i_3531_ != 255) {
										if (bool) {
											int i_3533_ = (((i_3530_ & 0xff0000) * i_3524_) & ~0xffffff);
											int i_3534_ = ((i_3530_ & 0xff00) * i_3525_ & 0xff0000);
											int i_3535_ = ((i_3530_ & 0xff) * i_3526_ & 0xff00);
											i_3530_ = (i_3533_ | i_3534_ | i_3535_) >>> 8;
											int i_3536_ = is[i_3471_];
											is[i_3471_] = (((((i_3530_ & 0xff00ff) * i_3531_) + ((i_3536_ & 0xff00ff) * i_3532_)) & ~0xff00ff) + ((((i_3530_ & 0xff00) * i_3531_) + ((i_3536_ & 0xff00) * i_3532_)) & 0xff0000)) >> 8;
											if (bool_3454_) {
												int i_3537_ = ((i_3536_ >>> 24) + i_3531_);
												if (i_3537_ > 255)
													i_3537_ = 255;
												is[i_3471_] |= i_3537_ << 24;
											}
										}
										if (bool_3453_ && bool_3462_)
											fs[i_3471_] = f;
									} else {
										if (bool) {
											int i_3538_ = (((i_3530_ & 0xff0000) * i_3524_) & ~0xffffff);
											int i_3539_ = ((i_3530_ & 0xff00) * i_3525_ & 0xff0000);
											int i_3540_ = ((i_3530_ & 0xff) * i_3526_ & 0xff00);
											is[i_3471_] = (i_3538_ | i_3539_ | i_3540_) >>> 8;
										}
										if (bool_3453_ && bool_3462_)
											fs[i_3471_] = f;
									}
								}
								i_3463_ += i_3467_;
								i_3471_++;
							}
							i_3464_ += i_3468_;
							i_3463_ = i_3516_;
							i_3471_ += i_3472_;
						}
					}
				} else if (i_3458_ == 3) {
					int i_3541_ = i_3463_;
					for (int i_3542_ = -i_3457_; i_3542_ < 0; i_3542_++) {
						int i_3543_ = ((i_3464_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3544_ = -i_3456_; i_3544_ < 0; i_3544_++) {
							if (!bool_3453_ || f < fs[i_3471_]) {
								if (bool) {
									int i_3545_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3463_ >> 16) + i_3543_]);
									int i_3546_ = i_3545_ + i_3459_;
									int i_3547_ = ((i_3545_ & 0xff00ff) + (i_3459_ & 0xff00ff));
									int i_3548_ = ((i_3547_ & 0x1000100) + (i_3546_ - i_3547_ & 0x10000));
									i_3548_ = (i_3546_ - i_3548_ | i_3548_ - (i_3548_ >>> 8));
									int i_3549_ = ((i_3548_ >>> 24) * (i_3459_ >>> 24) >> 8);
									int i_3550_ = 256 - i_3549_;
									if (i_3549_ != 255) {
										i_3545_ = i_3548_;
										i_3548_ = is[i_3471_];
										i_3548_ = ((((i_3545_ & 0xff00ff) * i_3549_ + ((i_3548_ & 0xff00ff) * i_3550_)) & ~0xff00ff) + (((i_3545_ & 0xff00) * i_3549_ + ((i_3548_ & 0xff00) * i_3550_)) & 0xff0000)) >> 8;
									}
									is[i_3471_] = i_3548_;
								}
								if (bool_3453_ && bool_3462_)
									fs[i_3471_] = f;
							}
							i_3463_ += i_3467_;
							i_3471_++;
						}
						i_3464_ += i_3468_;
						i_3463_ = i_3541_;
						i_3471_ += i_3472_;
					}
				} else if (i_3458_ == 2) {
					int i_3551_ = i_3459_ >>> 24;
					int i_3552_ = 256 - i_3551_;
					int i_3553_ = (i_3459_ & 0xff00ff) * i_3552_ & ~0xff00ff;
					int i_3554_ = (i_3459_ & 0xff00) * i_3552_ & 0xff0000;
					i_3459_ = (i_3553_ | i_3554_) >>> 8;
					int i_3555_ = i_3463_;
					for (int i_3556_ = -i_3457_; i_3556_ < 0; i_3556_++) {
						int i_3557_ = ((i_3464_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3558_ = -i_3456_; i_3558_ < 0; i_3558_++) {
							if (!bool_3453_ || f < fs[i_3471_]) {
								if (bool) {
									int i_3559_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3463_ >> 16) + i_3557_]);
									int i_3560_ = i_3559_ >>> 24;
									int i_3561_ = 256 - i_3560_;
									i_3553_ = ((i_3559_ & 0xff00ff) * i_3551_ & ~0xff00ff);
									i_3554_ = ((i_3559_ & 0xff00) * i_3551_ & 0xff0000);
									i_3559_ = (((i_3553_ | i_3554_) >>> 8) + i_3459_);
									int i_3562_ = is[i_3471_];
									is[i_3471_] = ((((i_3559_ & 0xff00ff) * i_3560_ + (i_3562_ & 0xff00ff) * i_3561_) & ~0xff00ff) + (((i_3559_ & 0xff00) * i_3560_ + (i_3562_ & 0xff00) * i_3561_) & 0xff0000)) >> 8;
								}
								if (bool_3453_ && bool_3462_)
									fs[i_3471_] = f;
							}
							i_3463_ += i_3467_;
							i_3471_++;
						}
						i_3464_ += i_3468_;
						i_3463_ = i_3555_;
						i_3471_ += i_3472_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_3460_ == 2) {
				if (i_3458_ == 1) {
					int i_3563_ = i_3463_;
					for (int i_3564_ = -i_3457_; i_3564_ < 0; i_3564_++) {
						int i_3565_ = ((i_3464_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3566_ = -i_3456_; i_3566_ < 0; i_3566_++) {
							if (!bool_3453_ || f < fs[i_3471_]) {
								int i_3567_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3463_ >> 16) + i_3565_]);
								if (i_3567_ != 0) {
									if (bool) {
										int i_3568_ = is[i_3471_];
										int i_3569_ = i_3567_ + i_3568_;
										int i_3570_ = ((i_3567_ & 0xff00ff) + (i_3568_ & 0xff00ff));
										i_3568_ = ((i_3570_ & 0x1000100) + (i_3569_ - i_3570_ & 0x10000));
										is[i_3471_] = (i_3569_ - i_3568_ | i_3568_ - (i_3568_ >>> 8));
									}
									if (bool_3453_ && bool_3462_)
										fs[i_3471_] = f;
								}
							}
							i_3463_ += i_3467_;
							i_3471_++;
						}
						i_3464_ += i_3468_;
						i_3463_ = i_3563_;
						i_3471_ += i_3472_;
					}
				} else if (i_3458_ == 0) {
					int i_3571_ = i_3463_;
					int i_3572_ = (i_3459_ & 0xff0000) >> 16;
					int i_3573_ = (i_3459_ & 0xff00) >> 8;
					int i_3574_ = i_3459_ & 0xff;
					for (int i_3575_ = -i_3457_; i_3575_ < 0; i_3575_++) {
						int i_3576_ = ((i_3464_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3577_ = -i_3456_; i_3577_ < 0; i_3577_++) {
							if (!bool_3453_ || f < fs[i_3471_]) {
								int i_3578_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3463_ >> 16) + i_3576_]);
								if (i_3578_ != 0) {
									if (bool) {
										int i_3579_ = ((i_3578_ & 0xff0000) * i_3572_ & ~0xffffff);
										int i_3580_ = ((i_3578_ & 0xff00) * i_3573_ & 0xff0000);
										int i_3581_ = ((i_3578_ & 0xff) * i_3574_ & 0xff00);
										i_3578_ = (i_3579_ | i_3580_ | i_3581_) >>> 8;
										int i_3582_ = is[i_3471_];
										int i_3583_ = i_3578_ + i_3582_;
										int i_3584_ = ((i_3578_ & 0xff00ff) + (i_3582_ & 0xff00ff));
										i_3582_ = ((i_3584_ & 0x1000100) + (i_3583_ - i_3584_ & 0x10000));
										is[i_3471_] = (i_3583_ - i_3582_ | i_3582_ - (i_3582_ >>> 8));
									}
									if (bool_3453_ && bool_3462_)
										fs[i_3471_] = f;
								}
							}
							i_3463_ += i_3467_;
							i_3471_++;
						}
						i_3464_ += i_3468_;
						i_3463_ = i_3571_;
						i_3471_ += i_3472_;
					}
				} else if (i_3458_ == 3) {
					int i_3585_ = i_3463_;
					for (int i_3586_ = -i_3457_; i_3586_ < 0; i_3586_++) {
						int i_3587_ = ((i_3464_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3588_ = -i_3456_; i_3588_ < 0; i_3588_++) {
							if (!bool_3453_ || f < fs[i_3471_]) {
								if (bool) {
									int i_3589_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3463_ >> 16) + i_3587_]);
									int i_3590_ = i_3589_ + i_3459_;
									int i_3591_ = ((i_3589_ & 0xff00ff) + (i_3459_ & 0xff00ff));
									int i_3592_ = ((i_3591_ & 0x1000100) + (i_3590_ - i_3591_ & 0x10000));
									i_3589_ = (i_3590_ - i_3592_ | i_3592_ - (i_3592_ >>> 8));
									i_3592_ = is[i_3471_];
									i_3590_ = i_3589_ + i_3592_;
									i_3591_ = (i_3589_ & 0xff00ff) + (i_3592_ & 0xff00ff);
									i_3592_ = ((i_3591_ & 0x1000100) + (i_3590_ - i_3591_ & 0x10000));
									is[i_3471_] = (i_3590_ - i_3592_ | i_3592_ - (i_3592_ >>> 8));
								}
								if (bool_3453_ && bool_3462_)
									fs[i_3471_] = f;
							}
							i_3463_ += i_3467_;
							i_3471_++;
						}
						i_3464_ += i_3468_;
						i_3463_ = i_3585_;
						i_3471_ += i_3472_;
					}
				} else if (i_3458_ == 2) {
					int i_3593_ = i_3459_ >>> 24;
					int i_3594_ = 256 - i_3593_;
					int i_3595_ = (i_3459_ & 0xff00ff) * i_3594_ & ~0xff00ff;
					int i_3596_ = (i_3459_ & 0xff00) * i_3594_ & 0xff0000;
					i_3459_ = (i_3595_ | i_3596_) >>> 8;
					int i_3597_ = i_3463_;
					for (int i_3598_ = -i_3457_; i_3598_ < 0; i_3598_++) {
						int i_3599_ = ((i_3464_ >> 16) * ((Class160_Sub1_Sub3) this).anInt8851);
						for (int i_3600_ = -i_3456_; i_3600_ < 0; i_3600_++) {
							if (!bool_3453_ || f < fs[i_3471_]) {
								int i_3601_ = (((Class160_Sub1_Sub3) this).anIntArray10235[(i_3463_ >> 16) + i_3599_]);
								if (i_3601_ != 0) {
									if (bool) {
										i_3595_ = ((i_3601_ & 0xff00ff) * i_3593_ & ~0xff00ff);
										i_3596_ = ((i_3601_ & 0xff00) * i_3593_ & 0xff0000);
										i_3601_ = (((i_3595_ | i_3596_) >>> 8) + i_3459_);
										int i_3602_ = is[i_3471_];
										int i_3603_ = i_3601_ + i_3602_;
										int i_3604_ = ((i_3601_ & 0xff00ff) + (i_3602_ & 0xff00ff));
										i_3602_ = ((i_3604_ & 0x1000100) + (i_3603_ - i_3604_ & 0x10000));
										is[i_3471_] = (i_3603_ - i_3602_ | i_3602_ - (i_3602_ >>> 8));
									}
									if (bool_3453_ && bool_3462_)
										fs[i_3471_] = f;
								}
							}
							i_3463_ += i_3467_;
							i_3471_++;
						}
						i_3464_ += i_3468_;
						i_3463_ = i_3597_;
						i_3471_ += i_3472_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}
}
