/* Class160_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class160_Sub1_Sub1 extends Class160_Sub1 {
	int[] anIntArray10201;

	void method2787(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (i_1_ > 0 && i_2_ > 0) {
			int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
			if (is != null) {
				int i_7_ = 0;
				int i_8_ = 0;
				int i_9_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				int i_10_ = (((Class160_Sub1_Sub1) this).anInt8853 + ((Class160_Sub1_Sub1) this).anInt8851 + ((Class160_Sub1_Sub1) this).anInt8855);
				int i_11_ = (((Class160_Sub1_Sub1) this).anInt8854 + ((Class160_Sub1_Sub1) this).anInt8867 + ((Class160_Sub1_Sub1) this).anInt8856);
				int i_12_ = (i_10_ << 16) / i_1_;
				int i_13_ = (i_11_ << 16) / i_2_;
				if (((Class160_Sub1_Sub1) this).anInt8853 > 0) {
					int i_14_ = (((((Class160_Sub1_Sub1) this).anInt8853 << 16) + i_12_ - 1) / i_12_);
					i += i_14_;
					i_7_ += (i_14_ * i_12_ - (((Class160_Sub1_Sub1) this).anInt8853 << 16));
				}
				if (((Class160_Sub1_Sub1) this).anInt8854 > 0) {
					int i_15_ = (((((Class160_Sub1_Sub1) this).anInt8854 << 16) + i_13_ - 1) / i_13_);
					i_0_ += i_15_;
					i_8_ += (i_15_ * i_13_ - (((Class160_Sub1_Sub1) this).anInt8854 << 16));
				}
				if (((Class160_Sub1_Sub1) this).anInt8851 < i_10_)
					i_1_ = ((((Class160_Sub1_Sub1) this).anInt8851 << 16) - i_7_ + i_12_ - 1) / i_12_;
				if (((Class160_Sub1_Sub1) this).anInt8867 < i_11_)
					i_2_ = ((((Class160_Sub1_Sub1) this).anInt8867 << 16) - i_8_ + i_13_ - 1) / i_13_;
				int i_16_ = i + i_0_ * i_9_;
				int i_17_ = i_9_ - i_1_;
				if (i_0_ + i_2_ > (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8986 * 1383960921))
					i_2_ -= (i_0_ + i_2_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
				if (i_0_ < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
					int i_18_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_0_);
					i_2_ -= i_18_;
					i_16_ += i_18_ * i_9_;
					i_8_ += i_13_ * i_18_;
				}
				if (i + i_1_ > (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
					int i_19_ = (i + i_1_ - (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt9002) * -1710988237);
					i_1_ -= i_19_;
					i_17_ += i_19_;
				}
				if (i < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
					int i_20_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
					i_1_ -= i_20_;
					i_16_ += i_20_;
					i_7_ += i_12_ * i_20_;
					i_17_ += i_20_;
				}
				if (i_5_ == 0) {
					if (i_3_ == 1) {
						int i_21_ = i_7_;
						for (int i_22_ = -i_2_; i_22_ < 0; i_22_++) {
							int i_23_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_24_ = -i_1_; i_24_ < 0; i_24_++) {
								is[i_16_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_7_ >> 16) + i_23_]);
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
							int i_30_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_31_ = -i_1_; i_31_ < 0; i_31_++) {
								int i_32_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_7_ >> 16) + i_30_]);
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
							int i_38_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_39_ = -i_1_; i_39_ < 0; i_39_++) {
								int i_40_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_7_ >> 16) + i_38_]);
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
							int i_50_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_51_ = -i_1_; i_51_ < 0; i_51_++) {
								int i_52_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_7_ >> 16) + i_50_]);
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
							int i_55_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_56_ = -i_1_; i_56_ < 0; i_56_++) {
								int i_57_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_7_ >> 16) + i_55_]);
								if (i_57_ != 0)
									is[i_16_++] = i_57_;
								else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_53_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 0) {
						int i_58_ = i_7_;
						if ((i_4_ & 0xffffff) == 16777215) {
							int i_59_ = i_4_ >>> 24;
							int i_60_ = 256 - i_59_;
							for (int i_61_ = -i_2_; i_61_ < 0; i_61_++) {
								int i_62_ = ((i_8_ >> 16) * (((Class160_Sub1_Sub1) this).anInt8851));
								for (int i_63_ = -i_1_; i_63_ < 0; i_63_++) {
									int i_64_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_7_ >> 16) + i_62_]);
									if (i_64_ != 0) {
										int i_65_ = is[i_16_];
										is[i_16_++] = ((((i_64_ & 0xff00ff) * i_59_ + (i_65_ & 0xff00ff) * i_60_) & ~0xff00ff) + (((i_64_ & 0xff00) * i_59_ + (i_65_ & 0xff00) * i_60_) & 0xff0000)) >> 8;
									} else
										i_16_++;
									i_7_ += i_12_;
								}
								i_8_ += i_13_;
								i_7_ = i_58_;
								i_16_ += i_17_;
							}
						} else {
							int i_66_ = (i_4_ & 0xff0000) >> 16;
							int i_67_ = (i_4_ & 0xff00) >> 8;
							int i_68_ = i_4_ & 0xff;
							int i_69_ = i_4_ >>> 24;
							int i_70_ = 256 - i_69_;
							for (int i_71_ = -i_2_; i_71_ < 0; i_71_++) {
								int i_72_ = ((i_8_ >> 16) * (((Class160_Sub1_Sub1) this).anInt8851));
								for (int i_73_ = -i_1_; i_73_ < 0; i_73_++) {
									int i_74_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_7_ >> 16) + i_72_]);
									if (i_74_ != 0) {
										if (i_69_ != 255) {
											int i_75_ = ((i_74_ & 0xff0000) * i_66_ & ~0xffffff);
											int i_76_ = ((i_74_ & 0xff00) * i_67_ & 0xff0000);
											int i_77_ = ((i_74_ & 0xff) * i_68_ & 0xff00);
											i_74_ = ((i_75_ | i_76_ | i_77_) >>> 8);
											int i_78_ = is[i_16_];
											is[i_16_++] = ((((i_74_ & 0xff00ff) * i_69_ + ((i_78_ & 0xff00ff) * i_70_)) & ~0xff00ff) + (((i_74_ & 0xff00) * i_69_ + ((i_78_ & 0xff00) * i_70_)) & 0xff0000)) >> 8;
										} else {
											int i_79_ = ((i_74_ & 0xff0000) * i_66_ & ~0xffffff);
											int i_80_ = ((i_74_ & 0xff00) * i_67_ & 0xff0000);
											int i_81_ = ((i_74_ & 0xff) * i_68_ & 0xff00);
											is[i_16_++] = (i_79_ | i_80_ | i_81_) >>> 8;
										}
									} else
										i_16_++;
									i_7_ += i_12_;
								}
								i_8_ += i_13_;
								i_7_ = i_58_;
								i_16_ += i_17_;
							}
						}
					} else if (i_3_ == 3) {
						int i_82_ = i_7_;
						int i_83_ = i_4_ >>> 24;
						int i_84_ = 256 - i_83_;
						for (int i_85_ = -i_2_; i_85_ < 0; i_85_++) {
							int i_86_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_87_ = -i_1_; i_87_ < 0; i_87_++) {
								int i_88_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_7_ >> 16) + i_86_]);
								int i_89_ = i_88_ + i_4_;
								int i_90_ = (i_88_ & 0xff00ff) + (i_4_ & 0xff00ff);
								int i_91_ = ((i_90_ & 0x1000100) + (i_89_ - i_90_ & 0x10000));
								i_91_ = i_89_ - i_91_ | i_91_ - (i_91_ >>> 8);
								if (i_88_ == 0 && i_83_ != 255) {
									i_88_ = i_91_;
									i_91_ = is[i_16_];
									i_91_ = ((((i_88_ & 0xff00ff) * i_83_ + (i_91_ & 0xff00ff) * i_84_) & ~0xff00ff) + (((i_88_ & 0xff00) * i_83_ + (i_91_ & 0xff00) * i_84_) & 0xff0000)) >> 8;
								}
								is[i_16_++] = i_91_;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_82_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 2) {
						int i_92_ = i_4_ >>> 24;
						int i_93_ = 256 - i_92_;
						int i_94_ = (i_4_ & 0xff00ff) * i_93_ & ~0xff00ff;
						int i_95_ = (i_4_ & 0xff00) * i_93_ & 0xff0000;
						i_4_ = (i_94_ | i_95_) >>> 8;
						int i_96_ = i_7_;
						for (int i_97_ = -i_2_; i_97_ < 0; i_97_++) {
							int i_98_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_99_ = -i_1_; i_99_ < 0; i_99_++) {
								int i_100_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_7_ >> 16) + i_98_]);
								if (i_100_ != 0) {
									i_94_ = ((i_100_ & 0xff00ff) * i_92_ & ~0xff00ff);
									i_95_ = (i_100_ & 0xff00) * i_92_ & 0xff0000;
									is[i_16_++] = ((i_94_ | i_95_) >>> 8) + i_4_;
								} else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_96_;
							i_16_ += i_17_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_5_ == 2) {
					if (i_3_ == 1) {
						int i_101_ = i_7_;
						for (int i_102_ = -i_2_; i_102_ < 0; i_102_++) {
							int i_103_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_104_ = -i_1_; i_104_ < 0; i_104_++) {
								int i_105_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_7_ >> 16) + i_103_]);
								if (i_105_ != 0) {
									int i_106_ = is[i_16_];
									int i_107_ = i_105_ + i_106_;
									int i_108_ = ((i_105_ & 0xff00ff) + (i_106_ & 0xff00ff));
									i_106_ = ((i_108_ & 0x1000100) + (i_107_ - i_108_ & 0x10000));
									is[i_16_++] = i_107_ - i_106_ | i_106_ - (i_106_ >>> 8);
								} else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_101_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 0) {
						int i_109_ = i_7_;
						int i_110_ = (i_4_ & 0xff0000) >> 16;
						int i_111_ = (i_4_ & 0xff00) >> 8;
						int i_112_ = i_4_ & 0xff;
						for (int i_113_ = -i_2_; i_113_ < 0; i_113_++) {
							int i_114_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_115_ = -i_1_; i_115_ < 0; i_115_++) {
								int i_116_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_7_ >> 16) + i_114_]);
								if (i_116_ != 0) {
									int i_117_ = ((i_116_ & 0xff0000) * i_110_ & ~0xffffff);
									int i_118_ = ((i_116_ & 0xff00) * i_111_ & 0xff0000);
									int i_119_ = (i_116_ & 0xff) * i_112_ & 0xff00;
									i_116_ = (i_117_ | i_118_ | i_119_) >>> 8;
									int i_120_ = is[i_16_];
									int i_121_ = i_116_ + i_120_;
									int i_122_ = ((i_116_ & 0xff00ff) + (i_120_ & 0xff00ff));
									i_120_ = ((i_122_ & 0x1000100) + (i_121_ - i_122_ & 0x10000));
									is[i_16_++] = i_121_ - i_120_ | i_120_ - (i_120_ >>> 8);
								} else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_109_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 3) {
						int i_123_ = i_7_;
						for (int i_124_ = -i_2_; i_124_ < 0; i_124_++) {
							int i_125_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_126_ = -i_1_; i_126_ < 0; i_126_++) {
								int i_127_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_7_ >> 16) + i_125_]);
								int i_128_ = i_127_ + i_4_;
								int i_129_ = (i_127_ & 0xff00ff) + (i_4_ & 0xff00ff);
								int i_130_ = ((i_129_ & 0x1000100) + (i_128_ - i_129_ & 0x10000));
								i_127_ = i_128_ - i_130_ | i_130_ - (i_130_ >>> 8);
								i_130_ = is[i_16_];
								i_128_ = i_127_ + i_130_;
								i_129_ = (i_127_ & 0xff00ff) + (i_130_ & 0xff00ff);
								i_130_ = (i_129_ & 0x1000100) + (i_128_ - i_129_ & 0x10000);
								is[i_16_++] = i_128_ - i_130_ | i_130_ - (i_130_ >>> 8);
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_123_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 2) {
						int i_131_ = i_4_ >>> 24;
						int i_132_ = 256 - i_131_;
						int i_133_ = (i_4_ & 0xff00ff) * i_132_ & ~0xff00ff;
						int i_134_ = (i_4_ & 0xff00) * i_132_ & 0xff0000;
						i_4_ = (i_133_ | i_134_) >>> 8;
						int i_135_ = i_7_;
						for (int i_136_ = -i_2_; i_136_ < 0; i_136_++) {
							int i_137_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_138_ = -i_1_; i_138_ < 0; i_138_++) {
								int i_139_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_7_ >> 16) + i_137_]);
								if (i_139_ != 0) {
									i_133_ = ((i_139_ & 0xff00ff) * i_131_ & ~0xff00ff);
									i_134_ = ((i_139_ & 0xff00) * i_131_ & 0xff0000);
									i_139_ = ((i_133_ | i_134_) >>> 8) + i_4_;
									int i_140_ = is[i_16_];
									int i_141_ = i_139_ + i_140_;
									int i_142_ = ((i_139_ & 0xff00ff) + (i_140_ & 0xff00ff));
									i_140_ = ((i_142_ & 0x1000100) + (i_141_ - i_142_ & 0x10000));
									is[i_16_++] = i_141_ - i_140_ | i_140_ - (i_140_ >>> 8);
								} else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_135_;
							i_16_ += i_17_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	Class160_Sub1_Sub1(HardwareRenderer class505_sub3, int[] is, int i, int i_143_, int i_144_, int i_145_, boolean bool) {
		super(class505_sub3, i_144_, i_145_);
		if (bool)
			((Class160_Sub1_Sub1) this).anIntArray10201 = new int[i_144_ * i_145_];
		else
			((Class160_Sub1_Sub1) this).anIntArray10201 = is;
		i_143_ -= ((Class160_Sub1_Sub1) this).anInt8851;
		int i_146_ = 0;
		for (int i_147_ = 0; i_147_ < i_145_; i_147_++) {
			for (int i_148_ = 0; i_148_ < i_144_; i_148_++) {
				int i_149_ = is[i++];
				if (i_149_ >>> 24 == 255)
					((Class160_Sub1_Sub1) this).anIntArray10201[i_146_++] = (i_149_ & 0xffffff) == 0 ? -16777215 : i_149_;
				else
					((Class160_Sub1_Sub1) this).anIntArray10201[i_146_++] = 0;
			}
			i += i_143_;
		}
	}

	Class160_Sub1_Sub1(HardwareRenderer class505_sub3, int i, int i_150_) {
		super(class505_sub3, i, i_150_);
		((Class160_Sub1_Sub1) this).anIntArray10201 = new int[i * i_150_];
	}

	public void method2750(int i, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_) {
		int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_156_ = 0; i_156_ < i_153_; i_156_++) {
			int i_157_ = ((i_151_ + i_156_) * ((Class160_Sub1_Sub1) this).anInt8851 + i);
			int i_158_ = ((i_155_ + i_156_) * (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i_154_;
			for (int i_159_ = 0; i_159_ < i_152_; i_159_++)
				((Class160_Sub1_Sub1) this).anIntArray10201[i_157_ + i_159_] = is[i_158_ + i_159_];
		}
	}

	void method14246(int i, int i_160_) {
		int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					int i_161_ = anInt8864;
					while (i_161_ < 0) {
						int i_162_ = anInt8870;
						int i_163_ = anInt8873;
						int i_164_ = anInt8874;
						int i_165_ = anInt8862;
						if (i_163_ >= 0 && i_164_ >= 0 && i_163_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) < 0 && i_164_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) < 0) {
							for (/**/; i_165_ < 0; i_165_++) {
								int i_166_ = ((i_164_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851 + (i_163_ >> 12));
								int i_167_ = i_162_++;
								if (i_160_ == 0) {
									if (i == 1)
										is[i_167_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_166_]);
									else if (i == 0) {
										int i_168_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_166_++]);
										int i_169_ = ((i_168_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_170_ = ((i_168_ & 0xff00) * anInt8852 & 0xff0000);
										int i_171_ = ((i_168_ & 0xff) * anInt8882 & 0xff00);
										is[i_167_] = (i_169_ | i_170_ | i_171_) >>> 8;
									} else if (i == 3) {
										int i_172_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_166_++]);
										int i_173_ = anInt8877;
										int i_174_ = i_172_ + i_173_;
										int i_175_ = ((i_172_ & 0xff00ff) + (i_173_ & 0xff00ff));
										int i_176_ = ((i_175_ & 0x1000100) + (i_174_ - i_175_ & 0x10000));
										is[i_167_] = (i_174_ - i_176_ | i_176_ - (i_176_ >>> 8));
									} else if (i == 2) {
										int i_177_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_166_]);
										int i_178_ = ((i_177_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_179_ = ((i_177_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_167_] = (((i_178_ | i_179_) >>> 8) + anInt8885);
									} else
										throw new IllegalArgumentException();
								} else if (i_160_ == 1) {
									if (i == 1) {
										int i_180_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_166_]);
										if (i_180_ != 0)
											is[i_167_] = i_180_;
									} else if (i == 0) {
										int i_181_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_166_]);
										if (i_181_ != 0) {
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_182_ = anInt8877 >>> 24;
												int i_183_ = 256 - i_182_;
												int i_184_ = is[i_167_];
												is[i_167_] = (((((i_181_ & 0xff00ff) * i_182_) + ((i_184_ & 0xff00ff) * i_183_)) & ~0xff00ff) + ((((i_181_ & 0xff00) * i_182_) + ((i_184_ & 0xff00) * i_183_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_185_ = (((i_181_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_186_ = (((i_181_ & 0xff00) * anInt8852) & 0xff0000);
												int i_187_ = (((i_181_ & 0xff) * anInt8882) & 0xff00);
												i_181_ = (i_185_ | i_186_ | i_187_) >>> 8;
												int i_188_ = is[i_167_];
												is[i_167_] = (((((i_181_ & 0xff00ff) * anInt8878) + ((i_188_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_181_ & 0xff00) * anInt8878) + ((i_188_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_189_ = (((i_181_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_190_ = (((i_181_ & 0xff00) * anInt8852) & 0xff0000);
												int i_191_ = (((i_181_ & 0xff) * anInt8882) & 0xff00);
												is[i_167_] = (i_189_ | i_190_ | i_191_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_192_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_166_]);
										int i_193_ = anInt8877;
										int i_194_ = i_192_ + i_193_;
										int i_195_ = ((i_192_ & 0xff00ff) + (i_193_ & 0xff00ff));
										int i_196_ = ((i_195_ & 0x1000100) + (i_194_ - i_195_ & 0x10000));
										i_196_ = (i_194_ - i_196_ | i_196_ - (i_196_ >>> 8));
										if (i_192_ == 0 && anInt8878 != 255) {
											i_192_ = i_196_;
											i_196_ = is[i_167_];
											i_196_ = (((((i_192_ & 0xff00ff) * anInt8878) + ((i_196_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_192_ & 0xff00) * anInt8878) + ((i_196_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_167_] = i_196_;
									} else if (i == 2) {
										int i_197_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_166_]);
										if (i_197_ != 0) {
											int i_198_ = (((i_197_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_199_ = (((i_197_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_167_++] = ((i_198_ | i_199_) >>> 8) + anInt8885;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_160_ == 2) {
									if (i == 1) {
										int i_200_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_166_]);
										if (i_200_ != 0) {
											int i_201_ = is[i_167_];
											int i_202_ = i_200_ + i_201_;
											int i_203_ = ((i_200_ & 0xff00ff) + (i_201_ & 0xff00ff));
											i_201_ = ((i_203_ & 0x1000100) + (i_202_ - i_203_ & 0x10000));
											is[i_167_] = (i_202_ - i_201_ | i_201_ - (i_201_ >>> 8));
										}
									} else if (i == 0) {
										int i_204_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_166_]);
										if (i_204_ != 0) {
											int i_205_ = (((i_204_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_206_ = (((i_204_ & 0xff00) * anInt8852) & 0xff0000);
											int i_207_ = ((i_204_ & 0xff) * anInt8882 & 0xff00);
											i_204_ = (i_205_ | i_206_ | i_207_) >>> 8;
											int i_208_ = is[i_167_];
											int i_209_ = i_204_ + i_208_;
											int i_210_ = ((i_204_ & 0xff00ff) + (i_208_ & 0xff00ff));
											i_208_ = ((i_210_ & 0x1000100) + (i_209_ - i_210_ & 0x10000));
											is[i_167_] = (i_209_ - i_208_ | i_208_ - (i_208_ >>> 8));
										}
									} else if (i == 3) {
										int i_211_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_166_]);
										int i_212_ = anInt8877;
										int i_213_ = i_211_ + i_212_;
										int i_214_ = ((i_211_ & 0xff00ff) + (i_212_ & 0xff00ff));
										int i_215_ = ((i_214_ & 0x1000100) + (i_213_ - i_214_ & 0x10000));
										i_211_ = (i_213_ - i_215_ | i_215_ - (i_215_ >>> 8));
										i_215_ = is[i_167_];
										i_213_ = i_211_ + i_215_;
										i_214_ = ((i_211_ & 0xff00ff) + (i_215_ & 0xff00ff));
										i_215_ = ((i_214_ & 0x1000100) + (i_213_ - i_214_ & 0x10000));
										is[i_167_] = (i_213_ - i_215_ | i_215_ - (i_215_ >>> 8));
									} else if (i == 2) {
										int i_216_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_166_]);
										if (i_216_ != 0) {
											int i_217_ = (((i_216_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_218_ = (((i_216_ & 0xff00) * anInt8878) & 0xff0000);
											i_216_ = (((i_217_ | i_218_) >>> 8) + anInt8885);
											int i_219_ = is[i_167_];
											int i_220_ = i_216_ + i_219_;
											int i_221_ = ((i_216_ & 0xff00ff) + (i_219_ & 0xff00ff));
											i_219_ = ((i_221_ & 0x1000100) + (i_220_ - i_221_ & 0x10000));
											is[i_167_] = (i_220_ - i_219_ | i_219_ - (i_219_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_161_++;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_222_ = anInt8864;
					while (i_222_ < 0) {
						int i_223_ = anInt8870;
						int i_224_ = anInt8873;
						int i_225_ = anInt8874 + anInt8866;
						int i_226_ = anInt8862;
						if (i_224_ >= 0 && i_224_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) < 0) {
							int i_227_;
							if ((i_227_ = (i_225_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12))) >= 0) {
								i_227_ = (anInt8868 - i_227_) / anInt8868;
								i_226_ += i_227_;
								i_225_ += anInt8868 * i_227_;
								i_223_ += i_227_;
							}
							if ((i_227_ = (i_225_ - anInt8868) / anInt8868) > i_226_)
								i_226_ = i_227_;
							for (/**/; i_226_ < 0; i_226_++) {
								int i_228_ = ((i_225_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851 + (i_224_ >> 12));
								int i_229_ = i_223_++;
								if (i_160_ == 0) {
									if (i == 1)
										is[i_229_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_228_]);
									else if (i == 0) {
										int i_230_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_228_++]);
										int i_231_ = ((i_230_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_232_ = ((i_230_ & 0xff00) * anInt8852 & 0xff0000);
										int i_233_ = ((i_230_ & 0xff) * anInt8882 & 0xff00);
										is[i_229_] = (i_231_ | i_232_ | i_233_) >>> 8;
									} else if (i == 3) {
										int i_234_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_228_++]);
										int i_235_ = anInt8877;
										int i_236_ = i_234_ + i_235_;
										int i_237_ = ((i_234_ & 0xff00ff) + (i_235_ & 0xff00ff));
										int i_238_ = ((i_237_ & 0x1000100) + (i_236_ - i_237_ & 0x10000));
										is[i_229_] = (i_236_ - i_238_ | i_238_ - (i_238_ >>> 8));
									} else if (i == 2) {
										int i_239_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_228_]);
										int i_240_ = ((i_239_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_241_ = ((i_239_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_229_] = (((i_240_ | i_241_) >>> 8) + anInt8885);
									} else
										throw new IllegalArgumentException();
								} else if (i_160_ == 1) {
									if (i == 1) {
										int i_242_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_228_]);
										if (i_242_ != 0)
											is[i_229_] = i_242_;
									} else if (i == 0) {
										int i_243_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_228_]);
										if (i_243_ != 0) {
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_244_ = anInt8877 >>> 24;
												int i_245_ = 256 - i_244_;
												int i_246_ = is[i_229_];
												is[i_229_] = (((((i_243_ & 0xff00ff) * i_244_) + ((i_246_ & 0xff00ff) * i_245_)) & ~0xff00ff) + ((((i_243_ & 0xff00) * i_244_) + ((i_246_ & 0xff00) * i_245_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_247_ = (((i_243_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_248_ = (((i_243_ & 0xff00) * anInt8852) & 0xff0000);
												int i_249_ = (((i_243_ & 0xff) * anInt8882) & 0xff00);
												i_243_ = (i_247_ | i_248_ | i_249_) >>> 8;
												int i_250_ = is[i_229_];
												is[i_229_] = (((((i_243_ & 0xff00ff) * anInt8878) + ((i_250_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_243_ & 0xff00) * anInt8878) + ((i_250_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_251_ = (((i_243_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_252_ = (((i_243_ & 0xff00) * anInt8852) & 0xff0000);
												int i_253_ = (((i_243_ & 0xff) * anInt8882) & 0xff00);
												is[i_229_] = (i_251_ | i_252_ | i_253_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_254_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_228_]);
										int i_255_ = anInt8877;
										int i_256_ = i_254_ + i_255_;
										int i_257_ = ((i_254_ & 0xff00ff) + (i_255_ & 0xff00ff));
										int i_258_ = ((i_257_ & 0x1000100) + (i_256_ - i_257_ & 0x10000));
										i_258_ = (i_256_ - i_258_ | i_258_ - (i_258_ >>> 8));
										if (i_254_ == 0 && anInt8878 != 255) {
											i_254_ = i_258_;
											i_258_ = is[i_229_];
											i_258_ = (((((i_254_ & 0xff00ff) * anInt8878) + ((i_258_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_254_ & 0xff00) * anInt8878) + ((i_258_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_229_] = i_258_;
									} else if (i == 2) {
										int i_259_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_228_]);
										if (i_259_ != 0) {
											int i_260_ = (((i_259_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_261_ = (((i_259_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_229_++] = ((i_260_ | i_261_) >>> 8) + anInt8885;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_160_ == 2) {
									if (i == 1) {
										int i_262_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_228_]);
										if (i_262_ != 0) {
											int i_263_ = is[i_229_];
											int i_264_ = i_262_ + i_263_;
											int i_265_ = ((i_262_ & 0xff00ff) + (i_263_ & 0xff00ff));
											i_263_ = ((i_265_ & 0x1000100) + (i_264_ - i_265_ & 0x10000));
											is[i_229_] = (i_264_ - i_263_ | i_263_ - (i_263_ >>> 8));
										}
									} else if (i == 0) {
										int i_266_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_228_]);
										if (i_266_ != 0) {
											int i_267_ = (((i_266_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_268_ = (((i_266_ & 0xff00) * anInt8852) & 0xff0000);
											int i_269_ = ((i_266_ & 0xff) * anInt8882 & 0xff00);
											i_266_ = (i_267_ | i_268_ | i_269_) >>> 8;
											int i_270_ = is[i_229_];
											int i_271_ = i_266_ + i_270_;
											int i_272_ = ((i_266_ & 0xff00ff) + (i_270_ & 0xff00ff));
											i_270_ = ((i_272_ & 0x1000100) + (i_271_ - i_272_ & 0x10000));
											is[i_229_] = (i_271_ - i_270_ | i_270_ - (i_270_ >>> 8));
										}
									} else if (i == 3) {
										int i_273_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_228_]);
										int i_274_ = anInt8877;
										int i_275_ = i_273_ + i_274_;
										int i_276_ = ((i_273_ & 0xff00ff) + (i_274_ & 0xff00ff));
										int i_277_ = ((i_276_ & 0x1000100) + (i_275_ - i_276_ & 0x10000));
										i_273_ = (i_275_ - i_277_ | i_277_ - (i_277_ >>> 8));
										i_277_ = is[i_229_];
										i_275_ = i_273_ + i_277_;
										i_276_ = ((i_273_ & 0xff00ff) + (i_277_ & 0xff00ff));
										i_277_ = ((i_276_ & 0x1000100) + (i_275_ - i_276_ & 0x10000));
										is[i_229_] = (i_275_ - i_277_ | i_277_ - (i_277_ >>> 8));
									} else if (i == 2) {
										int i_278_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_228_]);
										if (i_278_ != 0) {
											int i_279_ = (((i_278_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_280_ = (((i_278_ & 0xff00) * anInt8878) & 0xff0000);
											i_278_ = (((i_279_ | i_280_) >>> 8) + anInt8885);
											int i_281_ = is[i_229_];
											int i_282_ = i_278_ + i_281_;
											int i_283_ = ((i_278_ & 0xff00ff) + (i_281_ & 0xff00ff));
											i_281_ = ((i_283_ & 0x1000100) + (i_282_ - i_283_ & 0x10000));
											is[i_229_] = (i_282_ - i_281_ | i_281_ - (i_281_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_225_ += anInt8868;
							}
						}
						i_222_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				} else {
					int i_284_ = anInt8864;
					while (i_284_ < 0) {
						int i_285_ = anInt8870;
						int i_286_ = anInt8873;
						int i_287_ = anInt8874 + anInt8866;
						int i_288_ = anInt8862;
						if (i_286_ >= 0 && i_286_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) < 0) {
							if (i_287_ < 0) {
								int i_289_ = (anInt8868 - 1 - i_287_) / anInt8868;
								i_288_ += i_289_;
								i_287_ += anInt8868 * i_289_;
								i_285_ += i_289_;
							}
							int i_290_;
							if ((i_290_ = (1 + i_287_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_288_)
								i_288_ = i_290_;
							for (/**/; i_288_ < 0; i_288_++) {
								int i_291_ = ((i_287_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851 + (i_286_ >> 12));
								int i_292_ = i_285_++;
								if (i_160_ == 0) {
									if (i == 1)
										is[i_292_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_291_]);
									else if (i == 0) {
										int i_293_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_291_++]);
										int i_294_ = ((i_293_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_295_ = ((i_293_ & 0xff00) * anInt8852 & 0xff0000);
										int i_296_ = ((i_293_ & 0xff) * anInt8882 & 0xff00);
										is[i_292_] = (i_294_ | i_295_ | i_296_) >>> 8;
									} else if (i == 3) {
										int i_297_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_291_++]);
										int i_298_ = anInt8877;
										int i_299_ = i_297_ + i_298_;
										int i_300_ = ((i_297_ & 0xff00ff) + (i_298_ & 0xff00ff));
										int i_301_ = ((i_300_ & 0x1000100) + (i_299_ - i_300_ & 0x10000));
										is[i_292_] = (i_299_ - i_301_ | i_301_ - (i_301_ >>> 8));
									} else if (i == 2) {
										int i_302_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_291_]);
										int i_303_ = ((i_302_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_304_ = ((i_302_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_292_] = (((i_303_ | i_304_) >>> 8) + anInt8885);
									} else
										throw new IllegalArgumentException();
								} else if (i_160_ == 1) {
									if (i == 1) {
										int i_305_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_291_]);
										if (i_305_ != 0)
											is[i_292_] = i_305_;
									} else if (i == 0) {
										int i_306_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_291_]);
										if (i_306_ != 0) {
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_307_ = anInt8877 >>> 24;
												int i_308_ = 256 - i_307_;
												int i_309_ = is[i_292_];
												is[i_292_] = (((((i_306_ & 0xff00ff) * i_307_) + ((i_309_ & 0xff00ff) * i_308_)) & ~0xff00ff) + ((((i_306_ & 0xff00) * i_307_) + ((i_309_ & 0xff00) * i_308_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_310_ = (((i_306_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_311_ = (((i_306_ & 0xff00) * anInt8852) & 0xff0000);
												int i_312_ = (((i_306_ & 0xff) * anInt8882) & 0xff00);
												i_306_ = (i_310_ | i_311_ | i_312_) >>> 8;
												int i_313_ = is[i_292_];
												is[i_292_] = (((((i_306_ & 0xff00ff) * anInt8878) + ((i_313_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_306_ & 0xff00) * anInt8878) + ((i_313_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_314_ = (((i_306_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_315_ = (((i_306_ & 0xff00) * anInt8852) & 0xff0000);
												int i_316_ = (((i_306_ & 0xff) * anInt8882) & 0xff00);
												is[i_292_] = (i_314_ | i_315_ | i_316_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_317_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_291_]);
										int i_318_ = anInt8877;
										int i_319_ = i_317_ + i_318_;
										int i_320_ = ((i_317_ & 0xff00ff) + (i_318_ & 0xff00ff));
										int i_321_ = ((i_320_ & 0x1000100) + (i_319_ - i_320_ & 0x10000));
										i_321_ = (i_319_ - i_321_ | i_321_ - (i_321_ >>> 8));
										if (i_317_ == 0 && anInt8878 != 255) {
											i_317_ = i_321_;
											i_321_ = is[i_292_];
											i_321_ = (((((i_317_ & 0xff00ff) * anInt8878) + ((i_321_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_317_ & 0xff00) * anInt8878) + ((i_321_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_292_] = i_321_;
									} else if (i == 2) {
										int i_322_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_291_]);
										if (i_322_ != 0) {
											int i_323_ = (((i_322_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_324_ = (((i_322_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_292_++] = ((i_323_ | i_324_) >>> 8) + anInt8885;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_160_ == 2) {
									if (i == 1) {
										int i_325_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_291_]);
										if (i_325_ != 0) {
											int i_326_ = is[i_292_];
											int i_327_ = i_325_ + i_326_;
											int i_328_ = ((i_325_ & 0xff00ff) + (i_326_ & 0xff00ff));
											i_326_ = ((i_328_ & 0x1000100) + (i_327_ - i_328_ & 0x10000));
											is[i_292_] = (i_327_ - i_326_ | i_326_ - (i_326_ >>> 8));
										}
									} else if (i == 0) {
										int i_329_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_291_]);
										if (i_329_ != 0) {
											int i_330_ = (((i_329_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_331_ = (((i_329_ & 0xff00) * anInt8852) & 0xff0000);
											int i_332_ = ((i_329_ & 0xff) * anInt8882 & 0xff00);
											i_329_ = (i_330_ | i_331_ | i_332_) >>> 8;
											int i_333_ = is[i_292_];
											int i_334_ = i_329_ + i_333_;
											int i_335_ = ((i_329_ & 0xff00ff) + (i_333_ & 0xff00ff));
											i_333_ = ((i_335_ & 0x1000100) + (i_334_ - i_335_ & 0x10000));
											is[i_292_] = (i_334_ - i_333_ | i_333_ - (i_333_ >>> 8));
										}
									} else if (i == 3) {
										int i_336_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_291_]);
										int i_337_ = anInt8877;
										int i_338_ = i_336_ + i_337_;
										int i_339_ = ((i_336_ & 0xff00ff) + (i_337_ & 0xff00ff));
										int i_340_ = ((i_339_ & 0x1000100) + (i_338_ - i_339_ & 0x10000));
										i_336_ = (i_338_ - i_340_ | i_340_ - (i_340_ >>> 8));
										i_340_ = is[i_292_];
										i_338_ = i_336_ + i_340_;
										i_339_ = ((i_336_ & 0xff00ff) + (i_340_ & 0xff00ff));
										i_340_ = ((i_339_ & 0x1000100) + (i_338_ - i_339_ & 0x10000));
										is[i_292_] = (i_338_ - i_340_ | i_340_ - (i_340_ >>> 8));
									} else if (i == 2) {
										int i_341_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_291_]);
										if (i_341_ != 0) {
											int i_342_ = (((i_341_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_343_ = (((i_341_ & 0xff00) * anInt8878) & 0xff0000);
											i_341_ = (((i_342_ | i_343_) >>> 8) + anInt8885);
											int i_344_ = is[i_292_];
											int i_345_ = i_341_ + i_344_;
											int i_346_ = ((i_341_ & 0xff00ff) + (i_344_ & 0xff00ff));
											i_344_ = ((i_346_ & 0x1000100) + (i_345_ - i_346_ & 0x10000));
											is[i_292_] = (i_345_ - i_344_ | i_344_ - (i_344_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_287_ += anInt8868;
							}
						}
						i_284_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					int i_347_ = anInt8864;
					while (i_347_ < 0) {
						int i_348_ = anInt8870;
						int i_349_ = anInt8873 + anInt8858;
						int i_350_ = anInt8874;
						int i_351_ = anInt8862;
						if (i_350_ >= 0 && i_350_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) < 0) {
							int i_352_;
							if ((i_352_ = (i_349_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12))) >= 0) {
								i_352_ = (anInt8865 - i_352_) / anInt8865;
								i_351_ += i_352_;
								i_349_ += anInt8865 * i_352_;
								i_348_ += i_352_;
							}
							if ((i_352_ = (i_349_ - anInt8865) / anInt8865) > i_351_)
								i_351_ = i_352_;
							for (/**/; i_351_ < 0; i_351_++) {
								int i_353_ = ((i_350_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851 + (i_349_ >> 12));
								int i_354_ = i_348_++;
								if (i_160_ == 0) {
									if (i == 1)
										is[i_354_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_353_]);
									else if (i == 0) {
										int i_355_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_353_++]);
										int i_356_ = ((i_355_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_357_ = ((i_355_ & 0xff00) * anInt8852 & 0xff0000);
										int i_358_ = ((i_355_ & 0xff) * anInt8882 & 0xff00);
										is[i_354_] = (i_356_ | i_357_ | i_358_) >>> 8;
									} else if (i == 3) {
										int i_359_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_353_++]);
										int i_360_ = anInt8877;
										int i_361_ = i_359_ + i_360_;
										int i_362_ = ((i_359_ & 0xff00ff) + (i_360_ & 0xff00ff));
										int i_363_ = ((i_362_ & 0x1000100) + (i_361_ - i_362_ & 0x10000));
										is[i_354_] = (i_361_ - i_363_ | i_363_ - (i_363_ >>> 8));
									} else if (i == 2) {
										int i_364_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_353_]);
										int i_365_ = ((i_364_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_366_ = ((i_364_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_354_] = (((i_365_ | i_366_) >>> 8) + anInt8885);
									} else
										throw new IllegalArgumentException();
								} else if (i_160_ == 1) {
									if (i == 1) {
										int i_367_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_353_]);
										if (i_367_ != 0)
											is[i_354_] = i_367_;
									} else if (i == 0) {
										int i_368_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_353_]);
										if (i_368_ != 0) {
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_369_ = anInt8877 >>> 24;
												int i_370_ = 256 - i_369_;
												int i_371_ = is[i_354_];
												is[i_354_] = (((((i_368_ & 0xff00ff) * i_369_) + ((i_371_ & 0xff00ff) * i_370_)) & ~0xff00ff) + ((((i_368_ & 0xff00) * i_369_) + ((i_371_ & 0xff00) * i_370_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_372_ = (((i_368_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_373_ = (((i_368_ & 0xff00) * anInt8852) & 0xff0000);
												int i_374_ = (((i_368_ & 0xff) * anInt8882) & 0xff00);
												i_368_ = (i_372_ | i_373_ | i_374_) >>> 8;
												int i_375_ = is[i_354_];
												is[i_354_] = (((((i_368_ & 0xff00ff) * anInt8878) + ((i_375_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_368_ & 0xff00) * anInt8878) + ((i_375_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_376_ = (((i_368_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_377_ = (((i_368_ & 0xff00) * anInt8852) & 0xff0000);
												int i_378_ = (((i_368_ & 0xff) * anInt8882) & 0xff00);
												is[i_354_] = (i_376_ | i_377_ | i_378_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_379_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_353_]);
										int i_380_ = anInt8877;
										int i_381_ = i_379_ + i_380_;
										int i_382_ = ((i_379_ & 0xff00ff) + (i_380_ & 0xff00ff));
										int i_383_ = ((i_382_ & 0x1000100) + (i_381_ - i_382_ & 0x10000));
										i_383_ = (i_381_ - i_383_ | i_383_ - (i_383_ >>> 8));
										if (i_379_ == 0 && anInt8878 != 255) {
											i_379_ = i_383_;
											i_383_ = is[i_354_];
											i_383_ = (((((i_379_ & 0xff00ff) * anInt8878) + ((i_383_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_379_ & 0xff00) * anInt8878) + ((i_383_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_354_] = i_383_;
									} else if (i == 2) {
										int i_384_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_353_]);
										if (i_384_ != 0) {
											int i_385_ = (((i_384_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_386_ = (((i_384_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_354_++] = ((i_385_ | i_386_) >>> 8) + anInt8885;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_160_ == 2) {
									if (i == 1) {
										int i_387_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_353_]);
										if (i_387_ != 0) {
											int i_388_ = is[i_354_];
											int i_389_ = i_387_ + i_388_;
											int i_390_ = ((i_387_ & 0xff00ff) + (i_388_ & 0xff00ff));
											i_388_ = ((i_390_ & 0x1000100) + (i_389_ - i_390_ & 0x10000));
											is[i_354_] = (i_389_ - i_388_ | i_388_ - (i_388_ >>> 8));
										}
									} else if (i == 0) {
										int i_391_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_353_]);
										if (i_391_ != 0) {
											int i_392_ = (((i_391_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_393_ = (((i_391_ & 0xff00) * anInt8852) & 0xff0000);
											int i_394_ = ((i_391_ & 0xff) * anInt8882 & 0xff00);
											i_391_ = (i_392_ | i_393_ | i_394_) >>> 8;
											int i_395_ = is[i_354_];
											int i_396_ = i_391_ + i_395_;
											int i_397_ = ((i_391_ & 0xff00ff) + (i_395_ & 0xff00ff));
											i_395_ = ((i_397_ & 0x1000100) + (i_396_ - i_397_ & 0x10000));
											is[i_354_] = (i_396_ - i_395_ | i_395_ - (i_395_ >>> 8));
										}
									} else if (i == 3) {
										int i_398_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_353_]);
										int i_399_ = anInt8877;
										int i_400_ = i_398_ + i_399_;
										int i_401_ = ((i_398_ & 0xff00ff) + (i_399_ & 0xff00ff));
										int i_402_ = ((i_401_ & 0x1000100) + (i_400_ - i_401_ & 0x10000));
										i_398_ = (i_400_ - i_402_ | i_402_ - (i_402_ >>> 8));
										i_402_ = is[i_354_];
										i_400_ = i_398_ + i_402_;
										i_401_ = ((i_398_ & 0xff00ff) + (i_402_ & 0xff00ff));
										i_402_ = ((i_401_ & 0x1000100) + (i_400_ - i_401_ & 0x10000));
										is[i_354_] = (i_400_ - i_402_ | i_402_ - (i_402_ >>> 8));
									} else if (i == 2) {
										int i_403_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_353_]);
										if (i_403_ != 0) {
											int i_404_ = (((i_403_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_405_ = (((i_403_ & 0xff00) * anInt8878) & 0xff0000);
											i_403_ = (((i_404_ | i_405_) >>> 8) + anInt8885);
											int i_406_ = is[i_354_];
											int i_407_ = i_403_ + i_406_;
											int i_408_ = ((i_403_ & 0xff00ff) + (i_406_ & 0xff00ff));
											i_406_ = ((i_408_ & 0x1000100) + (i_407_ - i_408_ & 0x10000));
											is[i_354_] = (i_407_ - i_406_ | i_406_ - (i_406_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_349_ += anInt8865;
							}
						}
						i_347_++;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_409_ = anInt8864;
					while (i_409_ < 0) {
						int i_410_ = anInt8870;
						int i_411_ = anInt8873 + anInt8858;
						int i_412_ = anInt8874 + anInt8866;
						int i_413_ = anInt8862;
						int i_414_;
						if ((i_414_ = i_411_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12)) >= 0) {
							i_414_ = (anInt8865 - i_414_) / anInt8865;
							i_413_ += i_414_;
							i_411_ += anInt8865 * i_414_;
							i_412_ += anInt8868 * i_414_;
							i_410_ += i_414_;
						}
						if ((i_414_ = (i_411_ - anInt8865) / anInt8865) > i_413_)
							i_413_ = i_414_;
						if ((i_414_ = i_412_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12)) >= 0) {
							i_414_ = (anInt8868 - i_414_) / anInt8868;
							i_413_ += i_414_;
							i_411_ += anInt8865 * i_414_;
							i_412_ += anInt8868 * i_414_;
							i_410_ += i_414_;
						}
						if ((i_414_ = (i_412_ - anInt8868) / anInt8868) > i_413_)
							i_413_ = i_414_;
						for (/**/; i_413_ < 0; i_413_++) {
							int i_415_ = (((i_412_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_411_ >> 12));
							int i_416_ = i_410_++;
							if (i_160_ == 0) {
								if (i == 1)
									is[i_416_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_415_]);
								else if (i == 0) {
									int i_417_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_415_++]);
									int i_418_ = ((i_417_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_419_ = ((i_417_ & 0xff00) * anInt8852 & 0xff0000);
									int i_420_ = (i_417_ & 0xff) * anInt8882 & 0xff00;
									is[i_416_] = (i_418_ | i_419_ | i_420_) >>> 8;
								} else if (i == 3) {
									int i_421_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_415_++]);
									int i_422_ = anInt8877;
									int i_423_ = i_421_ + i_422_;
									int i_424_ = ((i_421_ & 0xff00ff) + (i_422_ & 0xff00ff));
									int i_425_ = ((i_424_ & 0x1000100) + (i_423_ - i_424_ & 0x10000));
									is[i_416_] = i_423_ - i_425_ | i_425_ - (i_425_ >>> 8);
								} else if (i == 2) {
									int i_426_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_415_]);
									int i_427_ = ((i_426_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_428_ = ((i_426_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_416_] = (((i_427_ | i_428_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_160_ == 1) {
								if (i == 1) {
									int i_429_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_415_]);
									if (i_429_ != 0)
										is[i_416_] = i_429_;
								} else if (i == 0) {
									int i_430_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_415_]);
									if (i_430_ != 0) {
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_431_ = anInt8877 >>> 24;
											int i_432_ = 256 - i_431_;
											int i_433_ = is[i_416_];
											is[i_416_] = (((((i_430_ & 0xff00ff) * i_431_) + ((i_433_ & 0xff00ff) * i_432_)) & ~0xff00ff) + ((((i_430_ & 0xff00) * i_431_) + ((i_433_ & 0xff00) * i_432_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_434_ = (((i_430_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_435_ = (((i_430_ & 0xff00) * anInt8852) & 0xff0000);
											int i_436_ = ((i_430_ & 0xff) * anInt8882 & 0xff00);
											i_430_ = (i_434_ | i_435_ | i_436_) >>> 8;
											int i_437_ = is[i_416_];
											is[i_416_] = (((((i_430_ & 0xff00ff) * anInt8878) + ((i_437_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_430_ & 0xff00) * anInt8878) + ((i_437_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_438_ = (((i_430_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_439_ = (((i_430_ & 0xff00) * anInt8852) & 0xff0000);
											int i_440_ = ((i_430_ & 0xff) * anInt8882 & 0xff00);
											is[i_416_] = (i_438_ | i_439_ | i_440_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_441_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_415_]);
									int i_442_ = anInt8877;
									int i_443_ = i_441_ + i_442_;
									int i_444_ = ((i_441_ & 0xff00ff) + (i_442_ & 0xff00ff));
									int i_445_ = ((i_444_ & 0x1000100) + (i_443_ - i_444_ & 0x10000));
									i_445_ = i_443_ - i_445_ | i_445_ - (i_445_ >>> 8);
									if (i_441_ == 0 && anInt8878 != 255) {
										i_441_ = i_445_;
										i_445_ = is[i_416_];
										i_445_ = (((((i_441_ & 0xff00ff) * anInt8878) + ((i_445_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_441_ & 0xff00) * anInt8878) + ((i_445_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_416_] = i_445_;
								} else if (i == 2) {
									int i_446_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_415_]);
									if (i_446_ != 0) {
										int i_447_ = ((i_446_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_448_ = ((i_446_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_416_++] = ((i_447_ | i_448_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_160_ == 2) {
								if (i == 1) {
									int i_449_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_415_]);
									if (i_449_ != 0) {
										int i_450_ = is[i_416_];
										int i_451_ = i_449_ + i_450_;
										int i_452_ = ((i_449_ & 0xff00ff) + (i_450_ & 0xff00ff));
										i_450_ = ((i_452_ & 0x1000100) + (i_451_ - i_452_ & 0x10000));
										is[i_416_] = (i_451_ - i_450_ | i_450_ - (i_450_ >>> 8));
									}
								} else if (i == 0) {
									int i_453_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_415_]);
									if (i_453_ != 0) {
										int i_454_ = ((i_453_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_455_ = ((i_453_ & 0xff00) * anInt8852 & 0xff0000);
										int i_456_ = ((i_453_ & 0xff) * anInt8882 & 0xff00);
										i_453_ = (i_454_ | i_455_ | i_456_) >>> 8;
										int i_457_ = is[i_416_];
										int i_458_ = i_453_ + i_457_;
										int i_459_ = ((i_453_ & 0xff00ff) + (i_457_ & 0xff00ff));
										i_457_ = ((i_459_ & 0x1000100) + (i_458_ - i_459_ & 0x10000));
										is[i_416_] = (i_458_ - i_457_ | i_457_ - (i_457_ >>> 8));
									}
								} else if (i == 3) {
									int i_460_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_415_]);
									int i_461_ = anInt8877;
									int i_462_ = i_460_ + i_461_;
									int i_463_ = ((i_460_ & 0xff00ff) + (i_461_ & 0xff00ff));
									int i_464_ = ((i_463_ & 0x1000100) + (i_462_ - i_463_ & 0x10000));
									i_460_ = i_462_ - i_464_ | i_464_ - (i_464_ >>> 8);
									i_464_ = is[i_416_];
									i_462_ = i_460_ + i_464_;
									i_463_ = (i_460_ & 0xff00ff) + (i_464_ & 0xff00ff);
									i_464_ = ((i_463_ & 0x1000100) + (i_462_ - i_463_ & 0x10000));
									is[i_416_] = i_462_ - i_464_ | i_464_ - (i_464_ >>> 8);
								} else if (i == 2) {
									int i_465_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_415_]);
									if (i_465_ != 0) {
										int i_466_ = ((i_465_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_467_ = ((i_465_ & 0xff00) * anInt8878 & 0xff0000);
										i_465_ = (((i_466_ | i_467_) >>> 8) + anInt8885);
										int i_468_ = is[i_416_];
										int i_469_ = i_465_ + i_468_;
										int i_470_ = ((i_465_ & 0xff00ff) + (i_468_ & 0xff00ff));
										i_468_ = ((i_470_ & 0x1000100) + (i_469_ - i_470_ & 0x10000));
										is[i_416_] = (i_469_ - i_468_ | i_468_ - (i_468_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_411_ += anInt8865;
							i_412_ += anInt8868;
						}
						i_409_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else {
					int i_471_ = anInt8864;
					while (i_471_ < 0) {
						int i_472_ = anInt8870;
						int i_473_ = anInt8873 + anInt8858;
						int i_474_ = anInt8874 + anInt8866;
						int i_475_ = anInt8862;
						int i_476_;
						if ((i_476_ = i_473_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12)) >= 0) {
							i_476_ = (anInt8865 - i_476_) / anInt8865;
							i_475_ += i_476_;
							i_473_ += anInt8865 * i_476_;
							i_474_ += anInt8868 * i_476_;
							i_472_ += i_476_;
						}
						if ((i_476_ = (i_473_ - anInt8865) / anInt8865) > i_475_)
							i_475_ = i_476_;
						if (i_474_ < 0) {
							i_476_ = (anInt8868 - 1 - i_474_) / anInt8868;
							i_475_ += i_476_;
							i_473_ += anInt8865 * i_476_;
							i_474_ += anInt8868 * i_476_;
							i_472_ += i_476_;
						}
						if ((i_476_ = (1 + i_474_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_475_)
							i_475_ = i_476_;
						for (/**/; i_475_ < 0; i_475_++) {
							int i_477_ = (((i_474_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_473_ >> 12));
							int i_478_ = i_472_++;
							if (i_160_ == 0) {
								if (i == 1)
									is[i_478_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_477_]);
								else if (i == 0) {
									int i_479_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_477_++]);
									int i_480_ = ((i_479_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_481_ = ((i_479_ & 0xff00) * anInt8852 & 0xff0000);
									int i_482_ = (i_479_ & 0xff) * anInt8882 & 0xff00;
									is[i_478_] = (i_480_ | i_481_ | i_482_) >>> 8;
								} else if (i == 3) {
									int i_483_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_477_++]);
									int i_484_ = anInt8877;
									int i_485_ = i_483_ + i_484_;
									int i_486_ = ((i_483_ & 0xff00ff) + (i_484_ & 0xff00ff));
									int i_487_ = ((i_486_ & 0x1000100) + (i_485_ - i_486_ & 0x10000));
									is[i_478_] = i_485_ - i_487_ | i_487_ - (i_487_ >>> 8);
								} else if (i == 2) {
									int i_488_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_477_]);
									int i_489_ = ((i_488_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_490_ = ((i_488_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_478_] = (((i_489_ | i_490_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_160_ == 1) {
								if (i == 1) {
									int i_491_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_477_]);
									if (i_491_ != 0)
										is[i_478_] = i_491_;
								} else if (i == 0) {
									int i_492_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_477_]);
									if (i_492_ != 0) {
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_493_ = anInt8877 >>> 24;
											int i_494_ = 256 - i_493_;
											int i_495_ = is[i_478_];
											is[i_478_] = (((((i_492_ & 0xff00ff) * i_493_) + ((i_495_ & 0xff00ff) * i_494_)) & ~0xff00ff) + ((((i_492_ & 0xff00) * i_493_) + ((i_495_ & 0xff00) * i_494_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_496_ = (((i_492_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_497_ = (((i_492_ & 0xff00) * anInt8852) & 0xff0000);
											int i_498_ = ((i_492_ & 0xff) * anInt8882 & 0xff00);
											i_492_ = (i_496_ | i_497_ | i_498_) >>> 8;
											int i_499_ = is[i_478_];
											is[i_478_] = (((((i_492_ & 0xff00ff) * anInt8878) + ((i_499_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_492_ & 0xff00) * anInt8878) + ((i_499_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_500_ = (((i_492_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_501_ = (((i_492_ & 0xff00) * anInt8852) & 0xff0000);
											int i_502_ = ((i_492_ & 0xff) * anInt8882 & 0xff00);
											is[i_478_] = (i_500_ | i_501_ | i_502_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_503_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_477_]);
									int i_504_ = anInt8877;
									int i_505_ = i_503_ + i_504_;
									int i_506_ = ((i_503_ & 0xff00ff) + (i_504_ & 0xff00ff));
									int i_507_ = ((i_506_ & 0x1000100) + (i_505_ - i_506_ & 0x10000));
									i_507_ = i_505_ - i_507_ | i_507_ - (i_507_ >>> 8);
									if (i_503_ == 0 && anInt8878 != 255) {
										i_503_ = i_507_;
										i_507_ = is[i_478_];
										i_507_ = (((((i_503_ & 0xff00ff) * anInt8878) + ((i_507_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_503_ & 0xff00) * anInt8878) + ((i_507_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_478_] = i_507_;
								} else if (i == 2) {
									int i_508_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_477_]);
									if (i_508_ != 0) {
										int i_509_ = ((i_508_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_510_ = ((i_508_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_478_++] = ((i_509_ | i_510_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_160_ == 2) {
								if (i == 1) {
									int i_511_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_477_]);
									if (i_511_ != 0) {
										int i_512_ = is[i_478_];
										int i_513_ = i_511_ + i_512_;
										int i_514_ = ((i_511_ & 0xff00ff) + (i_512_ & 0xff00ff));
										i_512_ = ((i_514_ & 0x1000100) + (i_513_ - i_514_ & 0x10000));
										is[i_478_] = (i_513_ - i_512_ | i_512_ - (i_512_ >>> 8));
									}
								} else if (i == 0) {
									int i_515_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_477_]);
									if (i_515_ != 0) {
										int i_516_ = ((i_515_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_517_ = ((i_515_ & 0xff00) * anInt8852 & 0xff0000);
										int i_518_ = ((i_515_ & 0xff) * anInt8882 & 0xff00);
										i_515_ = (i_516_ | i_517_ | i_518_) >>> 8;
										int i_519_ = is[i_478_];
										int i_520_ = i_515_ + i_519_;
										int i_521_ = ((i_515_ & 0xff00ff) + (i_519_ & 0xff00ff));
										i_519_ = ((i_521_ & 0x1000100) + (i_520_ - i_521_ & 0x10000));
										is[i_478_] = (i_520_ - i_519_ | i_519_ - (i_519_ >>> 8));
									}
								} else if (i == 3) {
									int i_522_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_477_]);
									int i_523_ = anInt8877;
									int i_524_ = i_522_ + i_523_;
									int i_525_ = ((i_522_ & 0xff00ff) + (i_523_ & 0xff00ff));
									int i_526_ = ((i_525_ & 0x1000100) + (i_524_ - i_525_ & 0x10000));
									i_522_ = i_524_ - i_526_ | i_526_ - (i_526_ >>> 8);
									i_526_ = is[i_478_];
									i_524_ = i_522_ + i_526_;
									i_525_ = (i_522_ & 0xff00ff) + (i_526_ & 0xff00ff);
									i_526_ = ((i_525_ & 0x1000100) + (i_524_ - i_525_ & 0x10000));
									is[i_478_] = i_524_ - i_526_ | i_526_ - (i_526_ >>> 8);
								} else if (i == 2) {
									int i_527_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_477_]);
									if (i_527_ != 0) {
										int i_528_ = ((i_527_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_529_ = ((i_527_ & 0xff00) * anInt8878 & 0xff0000);
										i_527_ = (((i_528_ | i_529_) >>> 8) + anInt8885);
										int i_530_ = is[i_478_];
										int i_531_ = i_527_ + i_530_;
										int i_532_ = ((i_527_ & 0xff00ff) + (i_530_ & 0xff00ff));
										i_530_ = ((i_532_ & 0x1000100) + (i_531_ - i_532_ & 0x10000));
										is[i_478_] = (i_531_ - i_530_ | i_530_ - (i_530_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_473_ += anInt8865;
							i_474_ += anInt8868;
						}
						i_471_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8868 == 0) {
				int i_533_ = anInt8864;
				while (i_533_ < 0) {
					int i_534_ = anInt8870;
					int i_535_ = anInt8873 + anInt8858;
					int i_536_ = anInt8874;
					int i_537_ = anInt8862;
					if (i_536_ >= 0 && i_536_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) < 0) {
						if (i_535_ < 0) {
							int i_538_ = (anInt8865 - 1 - i_535_) / anInt8865;
							i_537_ += i_538_;
							i_535_ += anInt8865 * i_538_;
							i_534_ += i_538_;
						}
						int i_539_;
						if ((i_539_ = (1 + i_535_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_537_)
							i_537_ = i_539_;
						for (/**/; i_537_ < 0; i_537_++) {
							int i_540_ = (((i_536_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_535_ >> 12));
							int i_541_ = i_534_++;
							if (i_160_ == 0) {
								if (i == 1)
									is[i_541_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_540_]);
								else if (i == 0) {
									int i_542_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_540_++]);
									int i_543_ = ((i_542_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_544_ = ((i_542_ & 0xff00) * anInt8852 & 0xff0000);
									int i_545_ = (i_542_ & 0xff) * anInt8882 & 0xff00;
									is[i_541_] = (i_543_ | i_544_ | i_545_) >>> 8;
								} else if (i == 3) {
									int i_546_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_540_++]);
									int i_547_ = anInt8877;
									int i_548_ = i_546_ + i_547_;
									int i_549_ = ((i_546_ & 0xff00ff) + (i_547_ & 0xff00ff));
									int i_550_ = ((i_549_ & 0x1000100) + (i_548_ - i_549_ & 0x10000));
									is[i_541_] = i_548_ - i_550_ | i_550_ - (i_550_ >>> 8);
								} else if (i == 2) {
									int i_551_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_540_]);
									int i_552_ = ((i_551_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_553_ = ((i_551_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_541_] = (((i_552_ | i_553_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_160_ == 1) {
								if (i == 1) {
									int i_554_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_540_]);
									if (i_554_ != 0)
										is[i_541_] = i_554_;
								} else if (i == 0) {
									int i_555_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_540_]);
									if (i_555_ != 0) {
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_556_ = anInt8877 >>> 24;
											int i_557_ = 256 - i_556_;
											int i_558_ = is[i_541_];
											is[i_541_] = (((((i_555_ & 0xff00ff) * i_556_) + ((i_558_ & 0xff00ff) * i_557_)) & ~0xff00ff) + ((((i_555_ & 0xff00) * i_556_) + ((i_558_ & 0xff00) * i_557_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_559_ = (((i_555_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_560_ = (((i_555_ & 0xff00) * anInt8852) & 0xff0000);
											int i_561_ = ((i_555_ & 0xff) * anInt8882 & 0xff00);
											i_555_ = (i_559_ | i_560_ | i_561_) >>> 8;
											int i_562_ = is[i_541_];
											is[i_541_] = (((((i_555_ & 0xff00ff) * anInt8878) + ((i_562_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_555_ & 0xff00) * anInt8878) + ((i_562_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_563_ = (((i_555_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_564_ = (((i_555_ & 0xff00) * anInt8852) & 0xff0000);
											int i_565_ = ((i_555_ & 0xff) * anInt8882 & 0xff00);
											is[i_541_] = (i_563_ | i_564_ | i_565_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_566_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_540_]);
									int i_567_ = anInt8877;
									int i_568_ = i_566_ + i_567_;
									int i_569_ = ((i_566_ & 0xff00ff) + (i_567_ & 0xff00ff));
									int i_570_ = ((i_569_ & 0x1000100) + (i_568_ - i_569_ & 0x10000));
									i_570_ = i_568_ - i_570_ | i_570_ - (i_570_ >>> 8);
									if (i_566_ == 0 && anInt8878 != 255) {
										i_566_ = i_570_;
										i_570_ = is[i_541_];
										i_570_ = (((((i_566_ & 0xff00ff) * anInt8878) + ((i_570_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_566_ & 0xff00) * anInt8878) + ((i_570_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_541_] = i_570_;
								} else if (i == 2) {
									int i_571_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_540_]);
									if (i_571_ != 0) {
										int i_572_ = ((i_571_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_573_ = ((i_571_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_541_++] = ((i_572_ | i_573_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_160_ == 2) {
								if (i == 1) {
									int i_574_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_540_]);
									if (i_574_ != 0) {
										int i_575_ = is[i_541_];
										int i_576_ = i_574_ + i_575_;
										int i_577_ = ((i_574_ & 0xff00ff) + (i_575_ & 0xff00ff));
										i_575_ = ((i_577_ & 0x1000100) + (i_576_ - i_577_ & 0x10000));
										is[i_541_] = (i_576_ - i_575_ | i_575_ - (i_575_ >>> 8));
									}
								} else if (i == 0) {
									int i_578_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_540_]);
									if (i_578_ != 0) {
										int i_579_ = ((i_578_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_580_ = ((i_578_ & 0xff00) * anInt8852 & 0xff0000);
										int i_581_ = ((i_578_ & 0xff) * anInt8882 & 0xff00);
										i_578_ = (i_579_ | i_580_ | i_581_) >>> 8;
										int i_582_ = is[i_541_];
										int i_583_ = i_578_ + i_582_;
										int i_584_ = ((i_578_ & 0xff00ff) + (i_582_ & 0xff00ff));
										i_582_ = ((i_584_ & 0x1000100) + (i_583_ - i_584_ & 0x10000));
										is[i_541_] = (i_583_ - i_582_ | i_582_ - (i_582_ >>> 8));
									}
								} else if (i == 3) {
									int i_585_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_540_]);
									int i_586_ = anInt8877;
									int i_587_ = i_585_ + i_586_;
									int i_588_ = ((i_585_ & 0xff00ff) + (i_586_ & 0xff00ff));
									int i_589_ = ((i_588_ & 0x1000100) + (i_587_ - i_588_ & 0x10000));
									i_585_ = i_587_ - i_589_ | i_589_ - (i_589_ >>> 8);
									i_589_ = is[i_541_];
									i_587_ = i_585_ + i_589_;
									i_588_ = (i_585_ & 0xff00ff) + (i_589_ & 0xff00ff);
									i_589_ = ((i_588_ & 0x1000100) + (i_587_ - i_588_ & 0x10000));
									is[i_541_] = i_587_ - i_589_ | i_589_ - (i_589_ >>> 8);
								} else if (i == 2) {
									int i_590_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_540_]);
									if (i_590_ != 0) {
										int i_591_ = ((i_590_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_592_ = ((i_590_ & 0xff00) * anInt8878 & 0xff0000);
										i_590_ = (((i_591_ | i_592_) >>> 8) + anInt8885);
										int i_593_ = is[i_541_];
										int i_594_ = i_590_ + i_593_;
										int i_595_ = ((i_590_ & 0xff00ff) + (i_593_ & 0xff00ff));
										i_593_ = ((i_595_ & 0x1000100) + (i_594_ - i_595_ & 0x10000));
										is[i_541_] = (i_594_ - i_593_ | i_593_ - (i_593_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_535_ += anInt8865;
						}
					}
					i_533_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else if (anInt8868 < 0) {
				for (int i_596_ = anInt8864; i_596_ < 0; i_596_++) {
					int i_597_ = anInt8870;
					int i_598_ = anInt8873 + anInt8858;
					int i_599_ = anInt8874 + anInt8866;
					int i_600_ = anInt8862;
					if (i_598_ < 0) {
						int i_601_ = (anInt8865 - 1 - i_598_) / anInt8865;
						i_600_ += i_601_;
						i_598_ += anInt8865 * i_601_;
						i_599_ += anInt8868 * i_601_;
						i_597_ += i_601_;
					}
					int i_602_;
					if ((i_602_ = (1 + i_598_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_600_)
						i_600_ = i_602_;
					if ((i_602_ = i_599_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12)) >= 0) {
						i_602_ = (anInt8868 - i_602_) / anInt8868;
						i_600_ += i_602_;
						i_598_ += anInt8865 * i_602_;
						i_599_ += anInt8868 * i_602_;
						i_597_ += i_602_;
					}
					if ((i_602_ = (i_599_ - anInt8868) / anInt8868) > i_600_)
						i_600_ = i_602_;
					for (/**/; i_600_ < 0; i_600_++) {
						int i_603_ = (((i_599_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_598_ >> 12));
						int i_604_ = i_597_++;
						if (i_160_ == 0) {
							if (i == 1)
								is[i_604_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_603_]);
							else if (i == 0) {
								int i_605_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_603_++]);
								int i_606_ = ((i_605_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_607_ = (i_605_ & 0xff00) * anInt8852 & 0xff0000;
								int i_608_ = (i_605_ & 0xff) * anInt8882 & 0xff00;
								is[i_604_] = (i_606_ | i_607_ | i_608_) >>> 8;
							} else if (i == 3) {
								int i_609_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_603_++]);
								int i_610_ = anInt8877;
								int i_611_ = i_609_ + i_610_;
								int i_612_ = ((i_609_ & 0xff00ff) + (i_610_ & 0xff00ff));
								int i_613_ = ((i_612_ & 0x1000100) + (i_611_ - i_612_ & 0x10000));
								is[i_604_] = i_611_ - i_613_ | i_613_ - (i_613_ >>> 8);
							} else if (i == 2) {
								int i_614_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_603_]);
								int i_615_ = ((i_614_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_616_ = (i_614_ & 0xff00) * anInt8878 & 0xff0000;
								is[i_604_] = ((i_615_ | i_616_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_160_ == 1) {
							if (i == 1) {
								int i_617_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_603_]);
								if (i_617_ != 0)
									is[i_604_] = i_617_;
							} else if (i == 0) {
								int i_618_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_603_]);
								if (i_618_ != 0) {
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_619_ = anInt8877 >>> 24;
										int i_620_ = 256 - i_619_;
										int i_621_ = is[i_604_];
										is[i_604_] = ((((i_618_ & 0xff00ff) * i_619_ + ((i_621_ & 0xff00ff) * i_620_)) & ~0xff00ff) + (((i_618_ & 0xff00) * i_619_ + ((i_621_ & 0xff00) * i_620_)) & 0xff0000)) >> 8;
									} else if (anInt8878 != 255) {
										int i_622_ = ((i_618_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_623_ = ((i_618_ & 0xff00) * anInt8852 & 0xff0000);
										int i_624_ = ((i_618_ & 0xff) * anInt8882 & 0xff00);
										i_618_ = (i_622_ | i_623_ | i_624_) >>> 8;
										int i_625_ = is[i_604_];
										is[i_604_] = (((((i_618_ & 0xff00ff) * anInt8878) + ((i_625_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_618_ & 0xff00) * anInt8878) + ((i_625_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									} else {
										int i_626_ = ((i_618_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_627_ = ((i_618_ & 0xff00) * anInt8852 & 0xff0000);
										int i_628_ = ((i_618_ & 0xff) * anInt8882 & 0xff00);
										is[i_604_] = (i_626_ | i_627_ | i_628_) >>> 8;
									}
								}
							} else if (i == 3) {
								int i_629_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_603_]);
								int i_630_ = anInt8877;
								int i_631_ = i_629_ + i_630_;
								int i_632_ = ((i_629_ & 0xff00ff) + (i_630_ & 0xff00ff));
								int i_633_ = ((i_632_ & 0x1000100) + (i_631_ - i_632_ & 0x10000));
								i_633_ = i_631_ - i_633_ | i_633_ - (i_633_ >>> 8);
								if (i_629_ == 0 && anInt8878 != 255) {
									i_629_ = i_633_;
									i_633_ = is[i_604_];
									i_633_ = ((((i_629_ & 0xff00ff) * anInt8878 + (i_633_ & 0xff00ff) * anInt8879) & ~0xff00ff) + (((i_629_ & 0xff00) * anInt8878 + (i_633_ & 0xff00) * anInt8879) & 0xff0000)) >> 8;
								}
								is[i_604_] = i_633_;
							} else if (i == 2) {
								int i_634_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_603_]);
								if (i_634_ != 0) {
									int i_635_ = ((i_634_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_636_ = ((i_634_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_604_++] = (((i_635_ | i_636_) >>> 8) + anInt8885);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_160_ == 2) {
							if (i == 1) {
								int i_637_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_603_]);
								if (i_637_ != 0) {
									int i_638_ = is[i_604_];
									int i_639_ = i_637_ + i_638_;
									int i_640_ = ((i_637_ & 0xff00ff) + (i_638_ & 0xff00ff));
									i_638_ = ((i_640_ & 0x1000100) + (i_639_ - i_640_ & 0x10000));
									is[i_604_] = i_639_ - i_638_ | i_638_ - (i_638_ >>> 8);
								}
							} else if (i == 0) {
								int i_641_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_603_]);
								if (i_641_ != 0) {
									int i_642_ = ((i_641_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_643_ = ((i_641_ & 0xff00) * anInt8852 & 0xff0000);
									int i_644_ = (i_641_ & 0xff) * anInt8882 & 0xff00;
									i_641_ = (i_642_ | i_643_ | i_644_) >>> 8;
									int i_645_ = is[i_604_];
									int i_646_ = i_641_ + i_645_;
									int i_647_ = ((i_641_ & 0xff00ff) + (i_645_ & 0xff00ff));
									i_645_ = ((i_647_ & 0x1000100) + (i_646_ - i_647_ & 0x10000));
									is[i_604_] = i_646_ - i_645_ | i_645_ - (i_645_ >>> 8);
								}
							} else if (i == 3) {
								int i_648_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_603_]);
								int i_649_ = anInt8877;
								int i_650_ = i_648_ + i_649_;
								int i_651_ = ((i_648_ & 0xff00ff) + (i_649_ & 0xff00ff));
								int i_652_ = ((i_651_ & 0x1000100) + (i_650_ - i_651_ & 0x10000));
								i_648_ = i_650_ - i_652_ | i_652_ - (i_652_ >>> 8);
								i_652_ = is[i_604_];
								i_650_ = i_648_ + i_652_;
								i_651_ = (i_648_ & 0xff00ff) + (i_652_ & 0xff00ff);
								i_652_ = (i_651_ & 0x1000100) + (i_650_ - i_651_ & 0x10000);
								is[i_604_] = i_650_ - i_652_ | i_652_ - (i_652_ >>> 8);
							} else if (i == 2) {
								int i_653_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_603_]);
								if (i_653_ != 0) {
									int i_654_ = ((i_653_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_655_ = ((i_653_ & 0xff00) * anInt8878 & 0xff0000);
									i_653_ = (((i_654_ | i_655_) >>> 8) + anInt8885);
									int i_656_ = is[i_604_];
									int i_657_ = i_653_ + i_656_;
									int i_658_ = ((i_653_ & 0xff00ff) + (i_656_ & 0xff00ff));
									i_656_ = ((i_658_ & 0x1000100) + (i_657_ - i_658_ & 0x10000));
									is[i_604_] = i_657_ - i_656_ | i_656_ - (i_656_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_598_ += anInt8865;
						i_599_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else {
				for (int i_659_ = anInt8864; i_659_ < 0; i_659_++) {
					int i_660_ = anInt8870;
					int i_661_ = anInt8873 + anInt8858;
					int i_662_ = anInt8874 + anInt8866;
					int i_663_ = anInt8862;
					if (i_661_ < 0) {
						int i_664_ = (anInt8865 - 1 - i_661_) / anInt8865;
						i_663_ += i_664_;
						i_661_ += anInt8865 * i_664_;
						i_662_ += anInt8868 * i_664_;
						i_660_ += i_664_;
					}
					int i_665_;
					if ((i_665_ = (1 + i_661_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_663_)
						i_663_ = i_665_;
					if (i_662_ < 0) {
						i_665_ = (anInt8868 - 1 - i_662_) / anInt8868;
						i_663_ += i_665_;
						i_661_ += anInt8865 * i_665_;
						i_662_ += anInt8868 * i_665_;
						i_660_ += i_665_;
					}
					if ((i_665_ = (1 + i_662_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_663_)
						i_663_ = i_665_;
					for (/**/; i_663_ < 0; i_663_++) {
						int i_666_ = (((i_662_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_661_ >> 12));
						int i_667_ = i_660_++;
						if (i_160_ == 0) {
							if (i == 1)
								is[i_667_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_666_]);
							else if (i == 0) {
								int i_668_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_666_++]);
								int i_669_ = ((i_668_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_670_ = (i_668_ & 0xff00) * anInt8852 & 0xff0000;
								int i_671_ = (i_668_ & 0xff) * anInt8882 & 0xff00;
								is[i_667_] = (i_669_ | i_670_ | i_671_) >>> 8;
							} else if (i == 3) {
								int i_672_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_666_++]);
								int i_673_ = anInt8877;
								int i_674_ = i_672_ + i_673_;
								int i_675_ = ((i_672_ & 0xff00ff) + (i_673_ & 0xff00ff));
								int i_676_ = ((i_675_ & 0x1000100) + (i_674_ - i_675_ & 0x10000));
								is[i_667_] = i_674_ - i_676_ | i_676_ - (i_676_ >>> 8);
							} else if (i == 2) {
								int i_677_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_666_]);
								int i_678_ = ((i_677_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_679_ = (i_677_ & 0xff00) * anInt8878 & 0xff0000;
								is[i_667_] = ((i_678_ | i_679_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_160_ == 1) {
							if (i == 1) {
								int i_680_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_666_]);
								if (i_680_ != 0)
									is[i_667_] = i_680_;
							} else if (i == 0) {
								int i_681_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_666_]);
								if (i_681_ != 0) {
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_682_ = anInt8877 >>> 24;
										int i_683_ = 256 - i_682_;
										int i_684_ = is[i_667_];
										is[i_667_] = ((((i_681_ & 0xff00ff) * i_682_ + ((i_684_ & 0xff00ff) * i_683_)) & ~0xff00ff) + (((i_681_ & 0xff00) * i_682_ + ((i_684_ & 0xff00) * i_683_)) & 0xff0000)) >> 8;
									} else if (anInt8878 != 255) {
										int i_685_ = ((i_681_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_686_ = ((i_681_ & 0xff00) * anInt8852 & 0xff0000);
										int i_687_ = ((i_681_ & 0xff) * anInt8882 & 0xff00);
										i_681_ = (i_685_ | i_686_ | i_687_) >>> 8;
										int i_688_ = is[i_667_];
										is[i_667_] = (((((i_681_ & 0xff00ff) * anInt8878) + ((i_688_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_681_ & 0xff00) * anInt8878) + ((i_688_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									} else {
										int i_689_ = ((i_681_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_690_ = ((i_681_ & 0xff00) * anInt8852 & 0xff0000);
										int i_691_ = ((i_681_ & 0xff) * anInt8882 & 0xff00);
										is[i_667_] = (i_689_ | i_690_ | i_691_) >>> 8;
									}
								}
							} else if (i == 3) {
								int i_692_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_666_]);
								int i_693_ = anInt8877;
								int i_694_ = i_692_ + i_693_;
								int i_695_ = ((i_692_ & 0xff00ff) + (i_693_ & 0xff00ff));
								int i_696_ = ((i_695_ & 0x1000100) + (i_694_ - i_695_ & 0x10000));
								i_696_ = i_694_ - i_696_ | i_696_ - (i_696_ >>> 8);
								if (i_692_ == 0 && anInt8878 != 255) {
									i_692_ = i_696_;
									i_696_ = is[i_667_];
									i_696_ = ((((i_692_ & 0xff00ff) * anInt8878 + (i_696_ & 0xff00ff) * anInt8879) & ~0xff00ff) + (((i_692_ & 0xff00) * anInt8878 + (i_696_ & 0xff00) * anInt8879) & 0xff0000)) >> 8;
								}
								is[i_667_] = i_696_;
							} else if (i == 2) {
								int i_697_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_666_]);
								if (i_697_ != 0) {
									int i_698_ = ((i_697_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_699_ = ((i_697_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_667_++] = (((i_698_ | i_699_) >>> 8) + anInt8885);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_160_ == 2) {
							if (i == 1) {
								int i_700_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_666_]);
								if (i_700_ != 0) {
									int i_701_ = is[i_667_];
									int i_702_ = i_700_ + i_701_;
									int i_703_ = ((i_700_ & 0xff00ff) + (i_701_ & 0xff00ff));
									i_701_ = ((i_703_ & 0x1000100) + (i_702_ - i_703_ & 0x10000));
									is[i_667_] = i_702_ - i_701_ | i_701_ - (i_701_ >>> 8);
								}
							} else if (i == 0) {
								int i_704_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_666_]);
								if (i_704_ != 0) {
									int i_705_ = ((i_704_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_706_ = ((i_704_ & 0xff00) * anInt8852 & 0xff0000);
									int i_707_ = (i_704_ & 0xff) * anInt8882 & 0xff00;
									i_704_ = (i_705_ | i_706_ | i_707_) >>> 8;
									int i_708_ = is[i_667_];
									int i_709_ = i_704_ + i_708_;
									int i_710_ = ((i_704_ & 0xff00ff) + (i_708_ & 0xff00ff));
									i_708_ = ((i_710_ & 0x1000100) + (i_709_ - i_710_ & 0x10000));
									is[i_667_] = i_709_ - i_708_ | i_708_ - (i_708_ >>> 8);
								}
							} else if (i == 3) {
								int i_711_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_666_]);
								int i_712_ = anInt8877;
								int i_713_ = i_711_ + i_712_;
								int i_714_ = ((i_711_ & 0xff00ff) + (i_712_ & 0xff00ff));
								int i_715_ = ((i_714_ & 0x1000100) + (i_713_ - i_714_ & 0x10000));
								i_711_ = i_713_ - i_715_ | i_715_ - (i_715_ >>> 8);
								i_715_ = is[i_667_];
								i_713_ = i_711_ + i_715_;
								i_714_ = (i_711_ & 0xff00ff) + (i_715_ & 0xff00ff);
								i_715_ = (i_714_ & 0x1000100) + (i_713_ - i_714_ & 0x10000);
								is[i_667_] = i_713_ - i_715_ | i_715_ - (i_715_ >>> 8);
							} else if (i == 2) {
								int i_716_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_666_]);
								if (i_716_ != 0) {
									int i_717_ = ((i_716_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_718_ = ((i_716_ & 0xff00) * anInt8878 & 0xff0000);
									i_716_ = (((i_717_ | i_718_) >>> 8) + anInt8885);
									int i_719_ = is[i_667_];
									int i_720_ = i_716_ + i_719_;
									int i_721_ = ((i_716_ & 0xff00ff) + (i_719_ & 0xff00ff));
									i_719_ = ((i_721_ & 0x1000100) + (i_720_ - i_721_ & 0x10000));
									is[i_667_] = i_720_ - i_719_ | i_719_ - (i_719_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_661_ += anInt8865;
						i_662_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			}
		}
	}

	public Interface9 method2808() {
		return new Class192(((Class160_Sub1_Sub1) this).anInt8851, ((Class160_Sub1_Sub1) this).anInt8867, ((Class160_Sub1_Sub1) this).anIntArray10201);
	}

	public void method2742(int i, int i_722_, int i_723_, int i_724_, int i_725_) {
		if (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			int i_726_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			i += ((Class160_Sub1_Sub1) this).anInt8853;
			i_722_ += ((Class160_Sub1_Sub1) this).anInt8854;
			int i_727_ = i_722_ * i_726_ + i;
			int i_728_ = 0;
			int i_729_ = ((Class160_Sub1_Sub1) this).anInt8867;
			int i_730_ = ((Class160_Sub1_Sub1) this).anInt8851;
			int i_731_ = i_726_ - i_730_;
			int i_732_ = 0;
			if (i_722_ < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_733_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_722_);
				i_729_ -= i_733_;
				i_722_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_728_ += i_733_ * i_730_;
				i_727_ += i_733_ * i_726_;
			}
			if (i_722_ + i_729_ > (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_729_ -= (i_722_ + i_729_ - (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt8986) * 1383960921);
			if (i < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_734_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_730_ -= i_734_;
				i = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_728_ += i_734_;
				i_727_ += i_734_;
				i_732_ += i_734_;
				i_731_ += i_734_;
			}
			if (i + i_730_ > (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt9002) * -1710988237) {
				int i_735_ = (i + i_730_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_730_ -= i_735_;
				i_732_ += i_735_;
				i_731_ += i_735_;
			}
			if (i_730_ > 0 && i_729_ > 0) {
				if (i_725_ == 0) {
					if (i_723_ == 1) {
						for (int i_736_ = -i_729_; i_736_ < 0; i_736_++) {
							int i_737_ = i_727_ + i_730_ - 3;
							while (i_727_ < i_737_) {
								is[i_727_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								is[i_727_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								is[i_727_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								is[i_727_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
							}
							i_737_ += 3;
							while (i_727_ < i_737_)
								is[i_727_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
							i_727_ += i_731_;
							i_728_ += i_732_;
						}
					} else if (i_723_ == 0) {
						int i_738_ = (i_724_ & 0xff0000) >> 16;
						int i_739_ = (i_724_ & 0xff00) >> 8;
						int i_740_ = i_724_ & 0xff;
						for (int i_741_ = -i_729_; i_741_ < 0; i_741_++) {
							for (int i_742_ = -i_730_; i_742_ < 0; i_742_++) {
								int i_743_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								int i_744_ = (i_743_ & 0xff0000) * i_738_ & ~0xffffff;
								int i_745_ = (i_743_ & 0xff00) * i_739_ & 0xff0000;
								int i_746_ = (i_743_ & 0xff) * i_740_ & 0xff00;
								is[i_727_++] = (i_744_ | i_745_ | i_746_) >>> 8;
							}
							i_727_ += i_731_;
							i_728_ += i_732_;
						}
					} else if (i_723_ == 3) {
						for (int i_747_ = -i_729_; i_747_ < 0; i_747_++) {
							for (int i_748_ = -i_730_; i_748_ < 0; i_748_++) {
								int i_749_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								int i_750_ = i_749_ + i_724_;
								int i_751_ = ((i_749_ & 0xff00ff) + (i_724_ & 0xff00ff));
								int i_752_ = ((i_751_ & 0x1000100) + (i_750_ - i_751_ & 0x10000));
								is[i_727_++] = i_750_ - i_752_ | i_752_ - (i_752_ >>> 8);
							}
							i_727_ += i_731_;
							i_728_ += i_732_;
						}
					} else if (i_723_ == 2) {
						int i_753_ = i_724_ >>> 24;
						int i_754_ = 256 - i_753_;
						int i_755_ = (i_724_ & 0xff00ff) * i_754_ & ~0xff00ff;
						int i_756_ = (i_724_ & 0xff00) * i_754_ & 0xff0000;
						i_724_ = (i_755_ | i_756_) >>> 8;
						for (int i_757_ = -i_729_; i_757_ < 0; i_757_++) {
							for (int i_758_ = -i_730_; i_758_ < 0; i_758_++) {
								int i_759_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								i_755_ = (i_759_ & 0xff00ff) * i_753_ & ~0xff00ff;
								i_756_ = (i_759_ & 0xff00) * i_753_ & 0xff0000;
								is[i_727_++] = ((i_755_ | i_756_) >>> 8) + i_724_;
							}
							i_727_ += i_731_;
							i_728_ += i_732_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_725_ == 1) {
					if (i_723_ == 1) {
						for (int i_760_ = -i_729_; i_760_ < 0; i_760_++) {
							int i_761_ = i_727_ + i_730_ - 3;
							while (i_727_ < i_761_) {
								int i_762_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								if (i_762_ != 0)
									is[i_727_++] = i_762_;
								else
									i_727_++;
								i_762_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								if (i_762_ != 0)
									is[i_727_++] = i_762_;
								else
									i_727_++;
								i_762_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								if (i_762_ != 0)
									is[i_727_++] = i_762_;
								else
									i_727_++;
								i_762_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								if (i_762_ != 0)
									is[i_727_++] = i_762_;
								else
									i_727_++;
							}
							i_761_ += 3;
							while (i_727_ < i_761_) {
								int i_763_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								if (i_763_ != 0)
									is[i_727_++] = i_763_;
								else
									i_727_++;
							}
							i_727_ += i_731_;
							i_728_ += i_732_;
						}
					} else if (i_723_ == 0) {
						if ((i_724_ & 0xffffff) == 16777215) {
							int i_764_ = i_724_ >>> 24;
							int i_765_ = 256 - i_764_;
							for (int i_766_ = -i_729_; i_766_ < 0; i_766_++) {
								for (int i_767_ = -i_730_; i_767_ < 0; i_767_++) {
									int i_768_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
									if (i_768_ != 0) {
										int i_769_ = is[i_727_];
										is[i_727_++] = ((((i_768_ & 0xff00ff) * i_764_ + ((i_769_ & 0xff00ff) * i_765_)) & ~0xff00ff) + (((i_768_ & 0xff00) * i_764_ + ((i_769_ & 0xff00) * i_765_)) & 0xff0000)) >> 8;
									} else
										i_727_++;
								}
								i_727_ += i_731_;
								i_728_ += i_732_;
							}
						} else {
							int i_770_ = (i_724_ & 0xff0000) >> 16;
							int i_771_ = (i_724_ & 0xff00) >> 8;
							int i_772_ = i_724_ & 0xff;
							int i_773_ = i_724_ >>> 24;
							int i_774_ = 256 - i_773_;
							for (int i_775_ = -i_729_; i_775_ < 0; i_775_++) {
								for (int i_776_ = -i_730_; i_776_ < 0; i_776_++) {
									int i_777_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
									if (i_777_ != 0) {
										if (i_773_ != 255) {
											int i_778_ = ((i_777_ & 0xff0000) * i_770_ & ~0xffffff);
											int i_779_ = ((i_777_ & 0xff00) * i_771_ & 0xff0000);
											int i_780_ = ((i_777_ & 0xff) * i_772_ & 0xff00);
											i_777_ = (i_778_ | i_779_ | i_780_) >>> 8;
											int i_781_ = is[i_727_];
											is[i_727_++] = (((((i_777_ & 0xff00ff) * i_773_) + ((i_781_ & 0xff00ff) * i_774_)) & ~0xff00ff) + ((((i_777_ & 0xff00) * i_773_) + ((i_781_ & 0xff00) * i_774_)) & 0xff0000)) >> 8;
										} else {
											int i_782_ = ((i_777_ & 0xff0000) * i_770_ & ~0xffffff);
											int i_783_ = ((i_777_ & 0xff00) * i_771_ & 0xff0000);
											int i_784_ = ((i_777_ & 0xff) * i_772_ & 0xff00);
											is[i_727_++] = (i_782_ | i_783_ | i_784_) >>> 8;
										}
									} else
										i_727_++;
								}
								i_727_ += i_731_;
								i_728_ += i_732_;
							}
						}
					} else if (i_723_ == 3) {
						int i_785_ = i_724_ >>> 24;
						int i_786_ = 256 - i_785_;
						for (int i_787_ = -i_729_; i_787_ < 0; i_787_++) {
							for (int i_788_ = -i_730_; i_788_ < 0; i_788_++) {
								int i_789_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								int i_790_ = i_789_ + i_724_;
								int i_791_ = ((i_789_ & 0xff00ff) + (i_724_ & 0xff00ff));
								int i_792_ = ((i_791_ & 0x1000100) + (i_790_ - i_791_ & 0x10000));
								i_792_ = i_790_ - i_792_ | i_792_ - (i_792_ >>> 8);
								if (i_789_ == 0 && i_785_ != 255) {
									i_789_ = i_792_;
									i_792_ = is[i_727_];
									i_792_ = ((((i_789_ & 0xff00ff) * i_785_ + (i_792_ & 0xff00ff) * i_786_) & ~0xff00ff) + (((i_789_ & 0xff00) * i_785_ + (i_792_ & 0xff00) * i_786_) & 0xff0000)) >> 8;
								}
								is[i_727_++] = i_792_;
							}
							i_727_ += i_731_;
							i_728_ += i_732_;
						}
					} else if (i_723_ == 2) {
						int i_793_ = i_724_ >>> 24;
						int i_794_ = 256 - i_793_;
						int i_795_ = (i_724_ & 0xff00ff) * i_794_ & ~0xff00ff;
						int i_796_ = (i_724_ & 0xff00) * i_794_ & 0xff0000;
						i_724_ = (i_795_ | i_796_) >>> 8;
						for (int i_797_ = -i_729_; i_797_ < 0; i_797_++) {
							for (int i_798_ = -i_730_; i_798_ < 0; i_798_++) {
								int i_799_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								if (i_799_ != 0) {
									i_795_ = ((i_799_ & 0xff00ff) * i_793_ & ~0xff00ff);
									i_796_ = ((i_799_ & 0xff00) * i_793_ & 0xff0000);
									is[i_727_++] = ((i_795_ | i_796_) >>> 8) + i_724_;
								} else
									i_727_++;
							}
							i_727_ += i_731_;
							i_728_ += i_732_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_725_ == 2) {
					if (i_723_ == 1) {
						for (int i_800_ = -i_729_; i_800_ < 0; i_800_++) {
							for (int i_801_ = -i_730_; i_801_ < 0; i_801_++) {
								int i_802_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								if (i_802_ != 0) {
									int i_803_ = is[i_727_];
									int i_804_ = i_802_ + i_803_;
									int i_805_ = ((i_802_ & 0xff00ff) + (i_803_ & 0xff00ff));
									i_803_ = ((i_805_ & 0x1000100) + (i_804_ - i_805_ & 0x10000));
									is[i_727_++] = i_804_ - i_803_ | i_803_ - (i_803_ >>> 8);
								} else
									i_727_++;
							}
							i_727_ += i_731_;
							i_728_ += i_732_;
						}
					} else if (i_723_ == 0) {
						int i_806_ = (i_724_ & 0xff0000) >> 16;
						int i_807_ = (i_724_ & 0xff00) >> 8;
						int i_808_ = i_724_ & 0xff;
						for (int i_809_ = -i_729_; i_809_ < 0; i_809_++) {
							for (int i_810_ = -i_730_; i_810_ < 0; i_810_++) {
								int i_811_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								if (i_811_ != 0) {
									int i_812_ = ((i_811_ & 0xff0000) * i_806_ & ~0xffffff);
									int i_813_ = ((i_811_ & 0xff00) * i_807_ & 0xff0000);
									int i_814_ = (i_811_ & 0xff) * i_808_ & 0xff00;
									i_811_ = (i_812_ | i_813_ | i_814_) >>> 8;
									int i_815_ = is[i_727_];
									int i_816_ = i_811_ + i_815_;
									int i_817_ = ((i_811_ & 0xff00ff) + (i_815_ & 0xff00ff));
									i_815_ = ((i_817_ & 0x1000100) + (i_816_ - i_817_ & 0x10000));
									is[i_727_++] = i_816_ - i_815_ | i_815_ - (i_815_ >>> 8);
								} else
									i_727_++;
							}
							i_727_ += i_731_;
							i_728_ += i_732_;
						}
					} else if (i_723_ == 3) {
						for (int i_818_ = -i_729_; i_818_ < 0; i_818_++) {
							for (int i_819_ = -i_730_; i_819_ < 0; i_819_++) {
								int i_820_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								int i_821_ = i_820_ + i_724_;
								int i_822_ = ((i_820_ & 0xff00ff) + (i_724_ & 0xff00ff));
								int i_823_ = ((i_822_ & 0x1000100) + (i_821_ - i_822_ & 0x10000));
								i_820_ = i_821_ - i_823_ | i_823_ - (i_823_ >>> 8);
								i_823_ = is[i_727_];
								i_821_ = i_820_ + i_823_;
								i_822_ = (i_820_ & 0xff00ff) + (i_823_ & 0xff00ff);
								i_823_ = (i_822_ & 0x1000100) + (i_821_ - i_822_ & 0x10000);
								is[i_727_++] = i_821_ - i_823_ | i_823_ - (i_823_ >>> 8);
							}
							i_727_ += i_731_;
							i_728_ += i_732_;
						}
					} else if (i_723_ == 2) {
						int i_824_ = i_724_ >>> 24;
						int i_825_ = 256 - i_824_;
						int i_826_ = (i_724_ & 0xff00ff) * i_825_ & ~0xff00ff;
						int i_827_ = (i_724_ & 0xff00) * i_825_ & 0xff0000;
						i_724_ = (i_826_ | i_827_) >>> 8;
						for (int i_828_ = -i_729_; i_828_ < 0; i_828_++) {
							for (int i_829_ = -i_730_; i_829_ < 0; i_829_++) {
								int i_830_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_728_++]);
								if (i_830_ != 0) {
									i_826_ = ((i_830_ & 0xff00ff) * i_824_ & ~0xff00ff);
									i_827_ = ((i_830_ & 0xff00) * i_824_ & 0xff0000);
									i_830_ = ((i_826_ | i_827_) >>> 8) + i_724_;
									int i_831_ = is[i_727_];
									int i_832_ = i_830_ + i_831_;
									int i_833_ = ((i_830_ & 0xff00ff) + (i_831_ & 0xff00ff));
									i_831_ = ((i_833_ & 0x1000100) + (i_832_ - i_833_ & 0x10000));
									is[i_727_++] = i_832_ - i_831_ | i_831_ - (i_831_ >>> 8);
								} else
									i_727_++;
							}
							i_727_ += i_731_;
							i_728_ += i_732_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2773(int i, int i_834_, Class455 class455, int i_835_, int i_836_) {
		if (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			i += ((Class160_Sub1_Sub1) this).anInt8853;
			i_834_ += ((Class160_Sub1_Sub1) this).anInt8854;
			int i_837_ = 0;
			int i_838_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			int i_839_ = ((Class160_Sub1_Sub1) this).anInt8851;
			int i_840_ = ((Class160_Sub1_Sub1) this).anInt8867;
			int i_841_ = i_838_ - i_839_;
			int i_842_ = 0;
			int i_843_ = i + i_834_ * i_838_;
			if (i_834_ < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_844_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_834_);
				i_840_ -= i_844_;
				i_834_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_837_ += i_844_ * i_839_;
				i_843_ += i_844_ * i_838_;
			}
			if (i_834_ + i_840_ > (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_840_ -= (i_834_ + i_840_ - (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt8986) * 1383960921);
			if (i < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_845_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_839_ -= i_845_;
				i = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_837_ += i_845_;
				i_843_ += i_845_;
				i_842_ += i_845_;
				i_841_ += i_845_;
			}
			if (i + i_839_ > (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt9002) * -1710988237) {
				int i_846_ = (i + i_839_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_839_ -= i_846_;
				i_842_ += i_846_;
				i_841_ += i_846_;
			}
			if (i_839_ > 0 && i_840_ > 0) {
				PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
				int[] is_847_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
				int[] is_848_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
				int i_849_ = i_834_;
				if (i_836_ > i_849_) {
					i_849_ = i_836_;
					i_843_ += (i_836_ - i_834_) * i_838_;
					i_837_ += ((i_836_ - i_834_) * ((Class160_Sub1_Sub1) this).anInt8851);
				}
				int i_850_ = (i_836_ + is_847_.length < i_834_ + i_840_ ? i_836_ + is_847_.length : i_834_ + i_840_);
				for (int i_851_ = i_849_; i_851_ < i_850_; i_851_++) {
					int i_852_ = is_847_[i_851_ - i_836_] + i_835_;
					int i_853_ = is_848_[i_851_ - i_836_];
					int i_854_ = i_839_;
					if (i > i_852_) {
						int i_855_ = i - i_852_;
						if (i_855_ >= i_853_) {
							i_837_ += i_839_ + i_842_;
							i_843_ += i_839_ + i_841_;
							continue;
						}
						i_853_ -= i_855_;
					} else {
						int i_856_ = i_852_ - i;
						if (i_856_ >= i_839_) {
							i_837_ += i_839_ + i_842_;
							i_843_ += i_839_ + i_841_;
							continue;
						}
						i_837_ += i_856_;
						i_854_ -= i_856_;
						i_843_ += i_856_;
					}
					int i_857_ = 0;
					if (i_854_ < i_853_)
						i_853_ = i_854_;
					else
						i_857_ = i_854_ - i_853_;
					for (int i_858_ = -i_853_; i_858_ < 0; i_858_++) {
						int i_859_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_837_++]);
						if (i_859_ != 0)
							is[i_843_++] = i_859_;
						else
							i_843_++;
					}
					i_837_ += i_857_ + i_842_;
					i_843_ += i_857_ + i_841_;
				}
			}
		}
	}

	void method2755(int i, int i_860_, int i_861_, int i_862_, int i_863_, int i_864_, int i_865_, int i_866_) {
		if (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (i_861_ > 0 && i_862_ > 0) {
			int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
			if (is != null) {
				int i_867_ = 0;
				int i_868_ = 0;
				int i_869_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				int i_870_ = (((Class160_Sub1_Sub1) this).anInt8853 + ((Class160_Sub1_Sub1) this).anInt8851 + ((Class160_Sub1_Sub1) this).anInt8855);
				int i_871_ = (((Class160_Sub1_Sub1) this).anInt8854 + ((Class160_Sub1_Sub1) this).anInt8867 + ((Class160_Sub1_Sub1) this).anInt8856);
				int i_872_ = (i_870_ << 16) / i_861_;
				int i_873_ = (i_871_ << 16) / i_862_;
				if (((Class160_Sub1_Sub1) this).anInt8853 > 0) {
					int i_874_ = ((((Class160_Sub1_Sub1) this).anInt8853 << 16) + i_872_ - 1) / i_872_;
					i += i_874_;
					i_867_ += (i_874_ * i_872_ - (((Class160_Sub1_Sub1) this).anInt8853 << 16));
				}
				if (((Class160_Sub1_Sub1) this).anInt8854 > 0) {
					int i_875_ = ((((Class160_Sub1_Sub1) this).anInt8854 << 16) + i_873_ - 1) / i_873_;
					i_860_ += i_875_;
					i_868_ += (i_875_ * i_873_ - (((Class160_Sub1_Sub1) this).anInt8854 << 16));
				}
				if (((Class160_Sub1_Sub1) this).anInt8851 < i_870_)
					i_861_ = ((((Class160_Sub1_Sub1) this).anInt8851 << 16) - i_867_ + i_872_ - 1) / i_872_;
				if (((Class160_Sub1_Sub1) this).anInt8867 < i_871_)
					i_862_ = ((((Class160_Sub1_Sub1) this).anInt8867 << 16) - i_868_ + i_873_ - 1) / i_873_;
				int i_876_ = i + i_860_ * i_869_;
				int i_877_ = i_869_ - i_861_;
				if (i_860_ + i_862_ > (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8986 * 1383960921))
					i_862_ -= (i_860_ + i_862_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
				if (i_860_ < (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt9009) * 1516535457) {
					int i_878_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_860_;
					i_862_ -= i_878_;
					i_876_ += i_878_ * i_869_;
					i_868_ += i_873_ * i_878_;
				}
				if (i + i_861_ > (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
					int i_879_ = (i + i_861_ - (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt9002) * -1710988237);
					i_861_ -= i_879_;
					i_877_ += i_879_;
				}
				if (i < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
					int i_880_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i;
					i_861_ -= i_880_;
					i_876_ += i_880_;
					i_867_ += i_872_ * i_880_;
					i_877_ += i_880_;
				}
				if (i_865_ == 0) {
					if (i_863_ == 1) {
						int i_881_ = i_867_;
						for (int i_882_ = -i_862_; i_882_ < 0; i_882_++) {
							int i_883_ = ((i_868_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_884_ = -i_861_; i_884_ < 0; i_884_++) {
								is[i_876_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_867_ >> 16) + i_883_]);
								i_867_ += i_872_;
							}
							i_868_ += i_873_;
							i_867_ = i_881_;
							i_876_ += i_877_;
						}
					} else if (i_863_ == 0) {
						int i_885_ = (i_864_ & 0xff0000) >> 16;
						int i_886_ = (i_864_ & 0xff00) >> 8;
						int i_887_ = i_864_ & 0xff;
						int i_888_ = i_867_;
						for (int i_889_ = -i_862_; i_889_ < 0; i_889_++) {
							int i_890_ = ((i_868_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_891_ = -i_861_; i_891_ < 0; i_891_++) {
								int i_892_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_867_ >> 16) + i_890_]);
								int i_893_ = (i_892_ & 0xff0000) * i_885_ & ~0xffffff;
								int i_894_ = (i_892_ & 0xff00) * i_886_ & 0xff0000;
								int i_895_ = (i_892_ & 0xff) * i_887_ & 0xff00;
								is[i_876_++] = (i_893_ | i_894_ | i_895_) >>> 8;
								i_867_ += i_872_;
							}
							i_868_ += i_873_;
							i_867_ = i_888_;
							i_876_ += i_877_;
						}
					} else if (i_863_ == 3) {
						int i_896_ = i_867_;
						for (int i_897_ = -i_862_; i_897_ < 0; i_897_++) {
							int i_898_ = ((i_868_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_899_ = -i_861_; i_899_ < 0; i_899_++) {
								int i_900_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_867_ >> 16) + i_898_]);
								int i_901_ = i_900_ + i_864_;
								int i_902_ = ((i_900_ & 0xff00ff) + (i_864_ & 0xff00ff));
								int i_903_ = ((i_902_ & 0x1000100) + (i_901_ - i_902_ & 0x10000));
								is[i_876_++] = i_901_ - i_903_ | i_903_ - (i_903_ >>> 8);
								i_867_ += i_872_;
							}
							i_868_ += i_873_;
							i_867_ = i_896_;
							i_876_ += i_877_;
						}
					} else if (i_863_ == 2) {
						int i_904_ = i_864_ >>> 24;
						int i_905_ = 256 - i_904_;
						int i_906_ = (i_864_ & 0xff00ff) * i_905_ & ~0xff00ff;
						int i_907_ = (i_864_ & 0xff00) * i_905_ & 0xff0000;
						i_864_ = (i_906_ | i_907_) >>> 8;
						int i_908_ = i_867_;
						for (int i_909_ = -i_862_; i_909_ < 0; i_909_++) {
							int i_910_ = ((i_868_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_911_ = -i_861_; i_911_ < 0; i_911_++) {
								int i_912_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_867_ >> 16) + i_910_]);
								i_906_ = (i_912_ & 0xff00ff) * i_904_ & ~0xff00ff;
								i_907_ = (i_912_ & 0xff00) * i_904_ & 0xff0000;
								is[i_876_++] = ((i_906_ | i_907_) >>> 8) + i_864_;
								i_867_ += i_872_;
							}
							i_868_ += i_873_;
							i_867_ = i_908_;
							i_876_ += i_877_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_865_ == 1) {
					if (i_863_ == 1) {
						int i_913_ = i_867_;
						for (int i_914_ = -i_862_; i_914_ < 0; i_914_++) {
							int i_915_ = ((i_868_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_916_ = -i_861_; i_916_ < 0; i_916_++) {
								int i_917_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_867_ >> 16) + i_915_]);
								if (i_917_ != 0)
									is[i_876_++] = i_917_;
								else
									i_876_++;
								i_867_ += i_872_;
							}
							i_868_ += i_873_;
							i_867_ = i_913_;
							i_876_ += i_877_;
						}
					} else if (i_863_ == 0) {
						int i_918_ = i_867_;
						if ((i_864_ & 0xffffff) == 16777215) {
							int i_919_ = i_864_ >>> 24;
							int i_920_ = 256 - i_919_;
							for (int i_921_ = -i_862_; i_921_ < 0; i_921_++) {
								int i_922_ = ((i_868_ >> 16) * (((Class160_Sub1_Sub1) this).anInt8851));
								for (int i_923_ = -i_861_; i_923_ < 0; i_923_++) {
									int i_924_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_867_ >> 16) + i_922_]);
									if (i_924_ != 0) {
										int i_925_ = is[i_876_];
										is[i_876_++] = ((((i_924_ & 0xff00ff) * i_919_ + ((i_925_ & 0xff00ff) * i_920_)) & ~0xff00ff) + (((i_924_ & 0xff00) * i_919_ + ((i_925_ & 0xff00) * i_920_)) & 0xff0000)) >> 8;
									} else
										i_876_++;
									i_867_ += i_872_;
								}
								i_868_ += i_873_;
								i_867_ = i_918_;
								i_876_ += i_877_;
							}
						} else {
							int i_926_ = (i_864_ & 0xff0000) >> 16;
							int i_927_ = (i_864_ & 0xff00) >> 8;
							int i_928_ = i_864_ & 0xff;
							int i_929_ = i_864_ >>> 24;
							int i_930_ = 256 - i_929_;
							for (int i_931_ = -i_862_; i_931_ < 0; i_931_++) {
								int i_932_ = ((i_868_ >> 16) * (((Class160_Sub1_Sub1) this).anInt8851));
								for (int i_933_ = -i_861_; i_933_ < 0; i_933_++) {
									int i_934_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_867_ >> 16) + i_932_]);
									if (i_934_ != 0) {
										if (i_929_ != 255) {
											int i_935_ = ((i_934_ & 0xff0000) * i_926_ & ~0xffffff);
											int i_936_ = ((i_934_ & 0xff00) * i_927_ & 0xff0000);
											int i_937_ = ((i_934_ & 0xff) * i_928_ & 0xff00);
											i_934_ = (i_935_ | i_936_ | i_937_) >>> 8;
											int i_938_ = is[i_876_];
											is[i_876_++] = (((((i_934_ & 0xff00ff) * i_929_) + ((i_938_ & 0xff00ff) * i_930_)) & ~0xff00ff) + ((((i_934_ & 0xff00) * i_929_) + ((i_938_ & 0xff00) * i_930_)) & 0xff0000)) >> 8;
										} else {
											int i_939_ = ((i_934_ & 0xff0000) * i_926_ & ~0xffffff);
											int i_940_ = ((i_934_ & 0xff00) * i_927_ & 0xff0000);
											int i_941_ = ((i_934_ & 0xff) * i_928_ & 0xff00);
											is[i_876_++] = (i_939_ | i_940_ | i_941_) >>> 8;
										}
									} else
										i_876_++;
									i_867_ += i_872_;
								}
								i_868_ += i_873_;
								i_867_ = i_918_;
								i_876_ += i_877_;
							}
						}
					} else if (i_863_ == 3) {
						int i_942_ = i_867_;
						int i_943_ = i_864_ >>> 24;
						int i_944_ = 256 - i_943_;
						for (int i_945_ = -i_862_; i_945_ < 0; i_945_++) {
							int i_946_ = ((i_868_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_947_ = -i_861_; i_947_ < 0; i_947_++) {
								int i_948_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_867_ >> 16) + i_946_]);
								int i_949_ = i_948_ + i_864_;
								int i_950_ = ((i_948_ & 0xff00ff) + (i_864_ & 0xff00ff));
								int i_951_ = ((i_950_ & 0x1000100) + (i_949_ - i_950_ & 0x10000));
								i_951_ = i_949_ - i_951_ | i_951_ - (i_951_ >>> 8);
								if (i_948_ == 0 && i_943_ != 255) {
									i_948_ = i_951_;
									i_951_ = is[i_876_];
									i_951_ = ((((i_948_ & 0xff00ff) * i_943_ + (i_951_ & 0xff00ff) * i_944_) & ~0xff00ff) + (((i_948_ & 0xff00) * i_943_ + (i_951_ & 0xff00) * i_944_) & 0xff0000)) >> 8;
								}
								is[i_876_++] = i_951_;
								i_867_ += i_872_;
							}
							i_868_ += i_873_;
							i_867_ = i_942_;
							i_876_ += i_877_;
						}
					} else if (i_863_ == 2) {
						int i_952_ = i_864_ >>> 24;
						int i_953_ = 256 - i_952_;
						int i_954_ = (i_864_ & 0xff00ff) * i_953_ & ~0xff00ff;
						int i_955_ = (i_864_ & 0xff00) * i_953_ & 0xff0000;
						i_864_ = (i_954_ | i_955_) >>> 8;
						int i_956_ = i_867_;
						for (int i_957_ = -i_862_; i_957_ < 0; i_957_++) {
							int i_958_ = ((i_868_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_959_ = -i_861_; i_959_ < 0; i_959_++) {
								int i_960_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_867_ >> 16) + i_958_]);
								if (i_960_ != 0) {
									i_954_ = ((i_960_ & 0xff00ff) * i_952_ & ~0xff00ff);
									i_955_ = ((i_960_ & 0xff00) * i_952_ & 0xff0000);
									is[i_876_++] = ((i_954_ | i_955_) >>> 8) + i_864_;
								} else
									i_876_++;
								i_867_ += i_872_;
							}
							i_868_ += i_873_;
							i_867_ = i_956_;
							i_876_ += i_877_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_865_ == 2) {
					if (i_863_ == 1) {
						int i_961_ = i_867_;
						for (int i_962_ = -i_862_; i_962_ < 0; i_962_++) {
							int i_963_ = ((i_868_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_964_ = -i_861_; i_964_ < 0; i_964_++) {
								int i_965_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_867_ >> 16) + i_963_]);
								if (i_965_ != 0) {
									int i_966_ = is[i_876_];
									int i_967_ = i_965_ + i_966_;
									int i_968_ = ((i_965_ & 0xff00ff) + (i_966_ & 0xff00ff));
									i_966_ = ((i_968_ & 0x1000100) + (i_967_ - i_968_ & 0x10000));
									is[i_876_++] = i_967_ - i_966_ | i_966_ - (i_966_ >>> 8);
								} else
									i_876_++;
								i_867_ += i_872_;
							}
							i_868_ += i_873_;
							i_867_ = i_961_;
							i_876_ += i_877_;
						}
					} else if (i_863_ == 0) {
						int i_969_ = i_867_;
						int i_970_ = (i_864_ & 0xff0000) >> 16;
						int i_971_ = (i_864_ & 0xff00) >> 8;
						int i_972_ = i_864_ & 0xff;
						for (int i_973_ = -i_862_; i_973_ < 0; i_973_++) {
							int i_974_ = ((i_868_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_975_ = -i_861_; i_975_ < 0; i_975_++) {
								int i_976_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_867_ >> 16) + i_974_]);
								if (i_976_ != 0) {
									int i_977_ = ((i_976_ & 0xff0000) * i_970_ & ~0xffffff);
									int i_978_ = ((i_976_ & 0xff00) * i_971_ & 0xff0000);
									int i_979_ = (i_976_ & 0xff) * i_972_ & 0xff00;
									i_976_ = (i_977_ | i_978_ | i_979_) >>> 8;
									int i_980_ = is[i_876_];
									int i_981_ = i_976_ + i_980_;
									int i_982_ = ((i_976_ & 0xff00ff) + (i_980_ & 0xff00ff));
									i_980_ = ((i_982_ & 0x1000100) + (i_981_ - i_982_ & 0x10000));
									is[i_876_++] = i_981_ - i_980_ | i_980_ - (i_980_ >>> 8);
								} else
									i_876_++;
								i_867_ += i_872_;
							}
							i_868_ += i_873_;
							i_867_ = i_969_;
							i_876_ += i_877_;
						}
					} else if (i_863_ == 3) {
						int i_983_ = i_867_;
						for (int i_984_ = -i_862_; i_984_ < 0; i_984_++) {
							int i_985_ = ((i_868_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_986_ = -i_861_; i_986_ < 0; i_986_++) {
								int i_987_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_867_ >> 16) + i_985_]);
								int i_988_ = i_987_ + i_864_;
								int i_989_ = ((i_987_ & 0xff00ff) + (i_864_ & 0xff00ff));
								int i_990_ = ((i_989_ & 0x1000100) + (i_988_ - i_989_ & 0x10000));
								i_987_ = i_988_ - i_990_ | i_990_ - (i_990_ >>> 8);
								i_990_ = is[i_876_];
								i_988_ = i_987_ + i_990_;
								i_989_ = (i_987_ & 0xff00ff) + (i_990_ & 0xff00ff);
								i_990_ = (i_989_ & 0x1000100) + (i_988_ - i_989_ & 0x10000);
								is[i_876_++] = i_988_ - i_990_ | i_990_ - (i_990_ >>> 8);
								i_867_ += i_872_;
							}
							i_868_ += i_873_;
							i_867_ = i_983_;
							i_876_ += i_877_;
						}
					} else if (i_863_ == 2) {
						int i_991_ = i_864_ >>> 24;
						int i_992_ = 256 - i_991_;
						int i_993_ = (i_864_ & 0xff00ff) * i_992_ & ~0xff00ff;
						int i_994_ = (i_864_ & 0xff00) * i_992_ & 0xff0000;
						i_864_ = (i_993_ | i_994_) >>> 8;
						int i_995_ = i_867_;
						for (int i_996_ = -i_862_; i_996_ < 0; i_996_++) {
							int i_997_ = ((i_868_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_998_ = -i_861_; i_998_ < 0; i_998_++) {
								int i_999_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_867_ >> 16) + i_997_]);
								if (i_999_ != 0) {
									i_993_ = ((i_999_ & 0xff00ff) * i_991_ & ~0xff00ff);
									i_994_ = ((i_999_ & 0xff00) * i_991_ & 0xff0000);
									i_999_ = ((i_993_ | i_994_) >>> 8) + i_864_;
									int i_1000_ = is[i_876_];
									int i_1001_ = i_999_ + i_1000_;
									int i_1002_ = ((i_999_ & 0xff00ff) + (i_1000_ & 0xff00ff));
									i_1000_ = ((i_1002_ & 0x1000100) + (i_1001_ - i_1002_ & 0x10000));
									is[i_876_++] = (i_1001_ - i_1000_ | i_1000_ - (i_1000_ >>> 8));
								} else
									i_876_++;
								i_867_ += i_872_;
							}
							i_868_ += i_873_;
							i_867_ = i_995_;
							i_876_ += i_877_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method14247(boolean bool, boolean bool_1003_, boolean bool_1004_, int i, int i_1005_, float f, int i_1006_, int i_1007_, int i_1008_, int i_1009_, int i_1010_, int i_1011_, boolean bool_1012_) {
		if (i_1006_ > 0 && i_1007_ > 0 && (bool || bool_1003_)) {
			int i_1013_ = 0;
			int i_1014_ = 0;
			int i_1015_ = (((Class160_Sub1_Sub1) this).anInt8853 + ((Class160_Sub1_Sub1) this).anInt8851 + ((Class160_Sub1_Sub1) this).anInt8855);
			int i_1016_ = (((Class160_Sub1_Sub1) this).anInt8854 + ((Class160_Sub1_Sub1) this).anInt8867 + ((Class160_Sub1_Sub1) this).anInt8856);
			int i_1017_ = (i_1015_ << 16) / i_1006_;
			int i_1018_ = (i_1016_ << 16) / i_1007_;
			if (((Class160_Sub1_Sub1) this).anInt8853 > 0) {
				int i_1019_ = (((((Class160_Sub1_Sub1) this).anInt8853 << 16) + i_1017_ - 1) / i_1017_);
				i += i_1019_;
				i_1013_ += (i_1019_ * i_1017_ - (((Class160_Sub1_Sub1) this).anInt8853 << 16));
			}
			if (((Class160_Sub1_Sub1) this).anInt8854 > 0) {
				int i_1020_ = (((((Class160_Sub1_Sub1) this).anInt8854 << 16) + i_1018_ - 1) / i_1018_);
				i_1005_ += i_1020_;
				i_1014_ += (i_1020_ * i_1018_ - (((Class160_Sub1_Sub1) this).anInt8854 << 16));
			}
			if (((Class160_Sub1_Sub1) this).anInt8851 < i_1015_)
				i_1006_ = ((((Class160_Sub1_Sub1) this).anInt8851 << 16) - i_1013_ + i_1017_ - 1) / i_1017_;
			if (((Class160_Sub1_Sub1) this).anInt8867 < i_1016_)
				i_1007_ = ((((Class160_Sub1_Sub1) this).anInt8867 << 16) - i_1014_ + i_1018_ - 1) / i_1018_;
			int i_1021_ = i + i_1005_ * ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980) * 444800403);
			int i_1022_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403) - i_1006_);
			if (i_1005_ + i_1007_ > (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_1007_ -= (i_1005_ + i_1007_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i_1005_ < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_1023_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_1005_);
				i_1007_ -= i_1023_;
				i_1021_ += i_1023_ * (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				i_1014_ += i_1018_ * i_1023_;
			}
			if (i + i_1006_ > (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_1024_ = (i + i_1006_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_1006_ -= i_1024_;
				i_1022_ += i_1024_;
			}
			if (i < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_1025_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_1006_ -= i_1025_;
				i_1021_ += i_1025_;
				i_1013_ += i_1017_ * i_1025_;
				i_1022_ += i_1025_;
			}
			float[] fs = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).aFloatArray9010);
			int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
			if (i_1010_ == 0) {
				if (i_1008_ == 1) {
					int i_1026_ = i_1013_;
					for (int i_1027_ = -i_1007_; i_1027_ < 0; i_1027_++) {
						int i_1028_ = ((i_1014_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_1029_ = -i_1006_; i_1029_ < 0; i_1029_++) {
							if (!bool_1003_ || f < fs[i_1021_]) {
								if (bool)
									is[i_1021_] = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_1013_ >> 16) + i_1028_]);
								if (bool_1003_ && bool_1012_)
									fs[i_1021_] = f;
							}
							i_1013_ += i_1017_;
							i_1021_++;
						}
						i_1014_ += i_1018_;
						i_1013_ = i_1026_;
						i_1021_ += i_1022_;
					}
				} else if (i_1008_ == 0) {
					int i_1030_ = (i_1009_ & 0xff0000) >> 16;
					int i_1031_ = (i_1009_ & 0xff00) >> 8;
					int i_1032_ = i_1009_ & 0xff;
					int i_1033_ = i_1013_;
					for (int i_1034_ = -i_1007_; i_1034_ < 0; i_1034_++) {
						int i_1035_ = ((i_1014_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_1036_ = -i_1006_; i_1036_ < 0; i_1036_++) {
							if (!bool_1003_ || f < fs[i_1021_]) {
								if (bool) {
									int i_1037_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_1013_ >> 16) + i_1035_]);
									int i_1038_ = ((i_1037_ & 0xff0000) * i_1030_ & ~0xffffff);
									int i_1039_ = ((i_1037_ & 0xff00) * i_1031_ & 0xff0000);
									int i_1040_ = (i_1037_ & 0xff) * i_1032_ & 0xff00;
									is[i_1021_] = (i_1038_ | i_1039_ | i_1040_) >>> 8;
								}
								if (bool_1003_ && bool_1012_)
									fs[i_1021_] = f;
							}
							i_1013_ += i_1017_;
							i_1021_++;
						}
						i_1014_ += i_1018_;
						i_1013_ = i_1033_;
						i_1021_ += i_1022_;
					}
				} else if (i_1008_ == 3) {
					int i_1041_ = i_1013_;
					for (int i_1042_ = -i_1007_; i_1042_ < 0; i_1042_++) {
						int i_1043_ = ((i_1014_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_1044_ = -i_1006_; i_1044_ < 0; i_1044_++) {
							if (!bool_1003_ || f < fs[i_1021_]) {
								if (bool) {
									int i_1045_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_1013_ >> 16) + i_1043_]);
									int i_1046_ = i_1045_ + i_1009_;
									int i_1047_ = ((i_1045_ & 0xff00ff) + (i_1009_ & 0xff00ff));
									int i_1048_ = ((i_1047_ & 0x1000100) + (i_1046_ - i_1047_ & 0x10000));
									is[i_1021_] = (i_1046_ - i_1048_ | i_1048_ - (i_1048_ >>> 8));
								}
								if (bool_1003_ && bool_1012_)
									fs[i_1021_] = f;
							}
							i_1013_ += i_1017_;
							i_1021_++;
						}
						i_1014_ += i_1018_;
						i_1013_ = i_1041_;
						i_1021_ += i_1022_;
					}
				} else if (i_1008_ == 2) {
					int i_1049_ = i_1009_ >>> 24;
					int i_1050_ = 256 - i_1049_;
					int i_1051_ = (i_1009_ & 0xff00ff) * i_1050_ & ~0xff00ff;
					int i_1052_ = (i_1009_ & 0xff00) * i_1050_ & 0xff0000;
					i_1009_ = (i_1051_ | i_1052_) >>> 8;
					int i_1053_ = i_1013_;
					for (int i_1054_ = -i_1007_; i_1054_ < 0; i_1054_++) {
						int i_1055_ = ((i_1014_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_1056_ = -i_1006_; i_1056_ < 0; i_1056_++) {
							if (!bool_1003_ || f < fs[i_1021_]) {
								if (bool) {
									int i_1057_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_1013_ >> 16) + i_1055_]);
									i_1051_ = ((i_1057_ & 0xff00ff) * i_1049_ & ~0xff00ff);
									i_1052_ = ((i_1057_ & 0xff00) * i_1049_ & 0xff0000);
									is[i_1021_] = (((i_1051_ | i_1052_) >>> 8) + i_1009_);
								}
								if (bool_1003_ && bool_1012_)
									fs[i_1021_] = f;
							}
							i_1013_ += i_1017_;
							i_1021_++;
						}
						i_1014_ += i_1018_;
						i_1013_ = i_1053_;
						i_1021_ += i_1022_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1010_ == 1) {
				if (i_1008_ == 1) {
					int i_1058_ = i_1013_;
					for (int i_1059_ = -i_1007_; i_1059_ < 0; i_1059_++) {
						int i_1060_ = ((i_1014_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_1061_ = -i_1006_; i_1061_ < 0; i_1061_++) {
							if (!bool_1003_ || f < fs[i_1021_]) {
								int i_1062_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_1013_ >> 16) + i_1060_]);
								if (i_1062_ != 0) {
									if (bool)
										is[i_1021_] = i_1062_;
									if (bool_1003_ && bool_1012_)
										fs[i_1021_] = f;
								}
							}
							i_1013_ += i_1017_;
							i_1021_++;
						}
						i_1014_ += i_1018_;
						i_1013_ = i_1058_;
						i_1021_ += i_1022_;
					}
				} else if (i_1008_ == 0) {
					int i_1063_ = i_1013_;
					if ((i_1009_ & 0xffffff) == 16777215) {
						int i_1064_ = i_1009_ >>> 24;
						int i_1065_ = 256 - i_1064_;
						for (int i_1066_ = -i_1007_; i_1066_ < 0; i_1066_++) {
							int i_1067_ = ((i_1014_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_1068_ = -i_1006_; i_1068_ < 0; i_1068_++) {
								if (!bool_1003_ || f < fs[i_1021_]) {
									int i_1069_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_1013_ >> 16) + i_1067_]);
									if (i_1069_ != 0) {
										if (bool) {
											int i_1070_ = is[i_1021_];
											is[i_1021_] = (((((i_1069_ & 0xff00ff) * i_1064_) + ((i_1070_ & 0xff00ff) * i_1065_)) & ~0xff00ff) + ((((i_1069_ & 0xff00) * i_1064_) + ((i_1070_ & 0xff00) * i_1065_)) & 0xff0000)) >> 8;
										}
										if (bool_1003_ && bool_1012_)
											fs[i_1021_] = f;
									}
								}
								i_1013_ += i_1017_;
								i_1021_++;
							}
							i_1014_ += i_1018_;
							i_1013_ = i_1063_;
							i_1021_ += i_1022_;
						}
					} else {
						int i_1071_ = (i_1009_ & 0xff0000) >> 16;
						int i_1072_ = (i_1009_ & 0xff00) >> 8;
						int i_1073_ = i_1009_ & 0xff;
						int i_1074_ = i_1009_ >>> 24;
						int i_1075_ = 256 - i_1074_;
						for (int i_1076_ = -i_1007_; i_1076_ < 0; i_1076_++) {
							int i_1077_ = ((i_1014_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_1078_ = -i_1006_; i_1078_ < 0; i_1078_++) {
								if (!bool_1003_ || f < fs[i_1021_]) {
									int i_1079_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_1013_ >> 16) + i_1077_]);
									if (i_1079_ != 0) {
										if (i_1074_ != 255) {
											if (bool) {
												int i_1080_ = (((i_1079_ & 0xff0000) * i_1071_) & ~0xffffff);
												int i_1081_ = (((i_1079_ & 0xff00) * i_1072_) & 0xff0000);
												int i_1082_ = (((i_1079_ & 0xff) * i_1073_) & 0xff00);
												i_1079_ = (i_1080_ | i_1081_ | i_1082_) >>> 8;
												int i_1083_ = is[i_1021_];
												is[i_1021_] = (((((i_1079_ & 0xff00ff) * i_1074_) + ((i_1083_ & 0xff00ff) * i_1075_)) & ~0xff00ff) + ((((i_1079_ & 0xff00) * i_1074_) + ((i_1083_ & 0xff00) * i_1075_)) & 0xff0000)) >> 8;
											}
											if (bool_1003_ && bool_1012_)
												fs[i_1021_] = f;
										} else {
											if (bool) {
												int i_1084_ = (((i_1079_ & 0xff0000) * i_1071_) & ~0xffffff);
												int i_1085_ = (((i_1079_ & 0xff00) * i_1072_) & 0xff0000);
												int i_1086_ = (((i_1079_ & 0xff) * i_1073_) & 0xff00);
												is[i_1021_] = (i_1084_ | i_1085_ | i_1086_) >>> 8;
											}
											if (bool_1003_ && bool_1012_)
												fs[i_1021_] = f;
										}
									}
								}
								i_1013_ += i_1017_;
								i_1021_++;
							}
							i_1014_ += i_1018_;
							i_1013_ = i_1063_;
							i_1021_ += i_1022_;
						}
					}
				} else if (i_1008_ == 3) {
					int i_1087_ = i_1013_;
					int i_1088_ = i_1009_ >>> 24;
					int i_1089_ = 256 - i_1088_;
					for (int i_1090_ = -i_1007_; i_1090_ < 0; i_1090_++) {
						int i_1091_ = ((i_1014_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_1092_ = -i_1006_; i_1092_ < 0; i_1092_++) {
							if (!bool_1003_ || f < fs[i_1021_]) {
								if (bool) {
									int i_1093_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_1013_ >> 16) + i_1091_]);
									int i_1094_ = i_1093_ + i_1009_;
									int i_1095_ = ((i_1093_ & 0xff00ff) + (i_1009_ & 0xff00ff));
									int i_1096_ = ((i_1095_ & 0x1000100) + (i_1094_ - i_1095_ & 0x10000));
									i_1096_ = (i_1094_ - i_1096_ | i_1096_ - (i_1096_ >>> 8));
									if (i_1093_ == 0 && i_1088_ != 255) {
										i_1093_ = i_1096_;
										i_1096_ = is[i_1021_];
										i_1096_ = ((((i_1093_ & 0xff00ff) * i_1088_ + ((i_1096_ & 0xff00ff) * i_1089_)) & ~0xff00ff) + (((i_1093_ & 0xff00) * i_1088_ + ((i_1096_ & 0xff00) * i_1089_)) & 0xff0000)) >> 8;
									}
									is[i_1021_] = i_1096_;
								}
								if (bool_1003_ && bool_1012_)
									fs[i_1021_] = f;
							}
							i_1013_ += i_1017_;
							i_1021_++;
						}
						i_1014_ += i_1018_;
						i_1013_ = i_1087_;
						i_1021_ += i_1022_;
					}
				} else if (i_1008_ == 2) {
					int i_1097_ = i_1009_ >>> 24;
					int i_1098_ = 256 - i_1097_;
					int i_1099_ = (i_1009_ & 0xff00ff) * i_1098_ & ~0xff00ff;
					int i_1100_ = (i_1009_ & 0xff00) * i_1098_ & 0xff0000;
					i_1009_ = (i_1099_ | i_1100_) >>> 8;
					int i_1101_ = i_1013_;
					for (int i_1102_ = -i_1007_; i_1102_ < 0; i_1102_++) {
						int i_1103_ = ((i_1014_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_1104_ = -i_1006_; i_1104_ < 0; i_1104_++) {
							if (!bool_1003_ || f < fs[i_1021_]) {
								int i_1105_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_1013_ >> 16) + i_1103_]);
								if (i_1105_ != 0) {
									if (bool) {
										i_1099_ = ((i_1105_ & 0xff00ff) * i_1097_ & ~0xff00ff);
										i_1100_ = ((i_1105_ & 0xff00) * i_1097_ & 0xff0000);
										is[i_1021_] = ((i_1099_ | i_1100_) >>> 8) + i_1009_;
									}
									if (bool_1003_ && bool_1012_)
										fs[i_1021_] = f;
								}
							}
							i_1013_ += i_1017_;
							i_1021_++;
						}
						i_1014_ += i_1018_;
						i_1013_ = i_1101_;
						i_1021_ += i_1022_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1010_ == 2) {
				if (i_1008_ == 1) {
					int i_1106_ = i_1013_;
					for (int i_1107_ = -i_1007_; i_1107_ < 0; i_1107_++) {
						int i_1108_ = ((i_1014_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_1109_ = -i_1006_; i_1109_ < 0; i_1109_++) {
							if (!bool_1003_ || f < fs[i_1021_]) {
								int i_1110_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_1013_ >> 16) + i_1108_]);
								if (i_1110_ != 0) {
									if (bool) {
										int i_1111_ = is[i_1021_];
										int i_1112_ = i_1110_ + i_1111_;
										int i_1113_ = ((i_1110_ & 0xff00ff) + (i_1111_ & 0xff00ff));
										i_1111_ = ((i_1113_ & 0x1000100) + (i_1112_ - i_1113_ & 0x10000));
										is[i_1021_] = (i_1112_ - i_1111_ | i_1111_ - (i_1111_ >>> 8));
									}
									if (bool_1003_ && bool_1012_)
										fs[i_1021_] = f;
								}
							}
							i_1013_ += i_1017_;
							i_1021_++;
						}
						i_1014_ += i_1018_;
						i_1013_ = i_1106_;
						i_1021_ += i_1022_;
					}
				} else if (i_1008_ == 0) {
					int i_1114_ = i_1013_;
					int i_1115_ = (i_1009_ & 0xff0000) >> 16;
					int i_1116_ = (i_1009_ & 0xff00) >> 8;
					int i_1117_ = i_1009_ & 0xff;
					for (int i_1118_ = -i_1007_; i_1118_ < 0; i_1118_++) {
						int i_1119_ = ((i_1014_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_1120_ = -i_1006_; i_1120_ < 0; i_1120_++) {
							if (!bool_1003_ || f < fs[i_1021_]) {
								int i_1121_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_1013_ >> 16) + i_1119_]);
								if (i_1121_ != 0) {
									if (bool) {
										int i_1122_ = ((i_1121_ & 0xff0000) * i_1115_ & ~0xffffff);
										int i_1123_ = ((i_1121_ & 0xff00) * i_1116_ & 0xff0000);
										int i_1124_ = ((i_1121_ & 0xff) * i_1117_ & 0xff00);
										i_1121_ = (i_1122_ | i_1123_ | i_1124_) >>> 8;
										int i_1125_ = is[i_1021_];
										int i_1126_ = i_1121_ + i_1125_;
										int i_1127_ = ((i_1121_ & 0xff00ff) + (i_1125_ & 0xff00ff));
										i_1125_ = ((i_1127_ & 0x1000100) + (i_1126_ - i_1127_ & 0x10000));
										is[i_1021_] = (i_1126_ - i_1125_ | i_1125_ - (i_1125_ >>> 8));
									}
									if (bool_1003_ && bool_1012_)
										fs[i_1021_] = f;
								}
							}
							i_1013_ += i_1017_;
							i_1021_++;
						}
						i_1014_ += i_1018_;
						i_1013_ = i_1114_;
						i_1021_ += i_1022_;
					}
				} else if (i_1008_ == 3) {
					int i_1128_ = i_1013_;
					for (int i_1129_ = -i_1007_; i_1129_ < 0; i_1129_++) {
						int i_1130_ = ((i_1014_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_1131_ = -i_1006_; i_1131_ < 0; i_1131_++) {
							if (!bool_1003_ || f < fs[i_1021_]) {
								if (bool) {
									int i_1132_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_1013_ >> 16) + i_1130_]);
									int i_1133_ = i_1132_ + i_1009_;
									int i_1134_ = ((i_1132_ & 0xff00ff) + (i_1009_ & 0xff00ff));
									int i_1135_ = ((i_1134_ & 0x1000100) + (i_1133_ - i_1134_ & 0x10000));
									i_1132_ = (i_1133_ - i_1135_ | i_1135_ - (i_1135_ >>> 8));
									i_1135_ = is[i_1021_];
									i_1133_ = i_1132_ + i_1135_;
									i_1134_ = (i_1132_ & 0xff00ff) + (i_1135_ & 0xff00ff);
									i_1135_ = ((i_1134_ & 0x1000100) + (i_1133_ - i_1134_ & 0x10000));
									is[i_1021_] = (i_1133_ - i_1135_ | i_1135_ - (i_1135_ >>> 8));
								}
								if (bool_1003_ && bool_1012_)
									fs[i_1021_] = f;
							}
							i_1013_ += i_1017_;
							i_1021_++;
						}
						i_1014_ += i_1018_;
						i_1013_ = i_1128_;
						i_1021_ += i_1022_;
					}
				} else if (i_1008_ == 2) {
					int i_1136_ = i_1009_ >>> 24;
					int i_1137_ = 256 - i_1136_;
					int i_1138_ = (i_1009_ & 0xff00ff) * i_1137_ & ~0xff00ff;
					int i_1139_ = (i_1009_ & 0xff00) * i_1137_ & 0xff0000;
					i_1009_ = (i_1138_ | i_1139_) >>> 8;
					int i_1140_ = i_1013_;
					for (int i_1141_ = -i_1007_; i_1141_ < 0; i_1141_++) {
						int i_1142_ = ((i_1014_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_1143_ = -i_1006_; i_1143_ < 0; i_1143_++) {
							if (!bool_1003_ || f < fs[i_1021_]) {
								int i_1144_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_1013_ >> 16) + i_1142_]);
								if (i_1144_ != 0) {
									if (bool) {
										i_1138_ = ((i_1144_ & 0xff00ff) * i_1136_ & ~0xff00ff);
										i_1139_ = ((i_1144_ & 0xff00) * i_1136_ & 0xff0000);
										i_1144_ = (((i_1138_ | i_1139_) >>> 8) + i_1009_);
										int i_1145_ = is[i_1021_];
										int i_1146_ = i_1144_ + i_1145_;
										int i_1147_ = ((i_1144_ & 0xff00ff) + (i_1145_ & 0xff00ff));
										i_1145_ = ((i_1147_ & 0x1000100) + (i_1146_ - i_1147_ & 0x10000));
										is[i_1021_] = (i_1146_ - i_1145_ | i_1145_ - (i_1145_ >>> 8));
									}
									if (bool_1003_ && bool_1012_)
										fs[i_1021_] = f;
								}
							}
							i_1013_ += i_1017_;
							i_1021_++;
						}
						i_1014_ += i_1018_;
						i_1013_ = i_1140_;
						i_1021_ += i_1022_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method14245(int i, int i_1148_) {
		int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					int i_1149_ = anInt8864;
					while (i_1149_ < 0) {
						int i_1150_ = anInt8870;
						int i_1151_ = anInt8873;
						int i_1152_ = anInt8874;
						int i_1153_ = anInt8862;
						if (i_1151_ >= 0 && i_1152_ >= 0 && i_1151_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) < 0 && i_1152_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) < 0) {
							for (/**/; i_1153_ < 0; i_1153_++) {
								int i_1154_ = ((i_1152_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851 + (i_1151_ >> 12));
								int i_1155_ = i_1150_++;
								if (i_1148_ == 0) {
									if (i == 1)
										is[i_1155_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1154_]);
									else if (i == 0) {
										int i_1156_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1154_++]);
										int i_1157_ = ((i_1156_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1158_ = ((i_1156_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1159_ = ((i_1156_ & 0xff) * anInt8882 & 0xff00);
										is[i_1155_] = (i_1157_ | i_1158_ | i_1159_) >>> 8;
									} else if (i == 3) {
										int i_1160_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1154_++]);
										int i_1161_ = anInt8877;
										int i_1162_ = i_1160_ + i_1161_;
										int i_1163_ = ((i_1160_ & 0xff00ff) + (i_1161_ & 0xff00ff));
										int i_1164_ = ((i_1163_ & 0x1000100) + (i_1162_ - i_1163_ & 0x10000));
										is[i_1155_] = (i_1162_ - i_1164_ | i_1164_ - (i_1164_ >>> 8));
									} else if (i == 2) {
										int i_1165_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1154_]);
										int i_1166_ = ((i_1165_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1167_ = ((i_1165_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_1155_] = ((i_1166_ | i_1167_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_1148_ == 1) {
									if (i == 1) {
										int i_1168_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1154_]);
										if (i_1168_ != 0)
											is[i_1155_] = i_1168_;
									} else if (i == 0) {
										int i_1169_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1154_]);
										if (i_1169_ != 0) {
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_1170_ = anInt8877 >>> 24;
												int i_1171_ = 256 - i_1170_;
												int i_1172_ = is[i_1155_];
												is[i_1155_] = (((((i_1169_ & 0xff00ff) * i_1170_) + ((i_1172_ & 0xff00ff) * i_1171_)) & ~0xff00ff) + ((((i_1169_ & 0xff00) * i_1170_) + ((i_1172_ & 0xff00) * i_1171_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_1173_ = (((i_1169_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1174_ = (((i_1169_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1175_ = (((i_1169_ & 0xff) * anInt8882) & 0xff00);
												i_1169_ = (i_1173_ | i_1174_ | i_1175_) >>> 8;
												int i_1176_ = is[i_1155_];
												is[i_1155_] = (((((i_1169_ & 0xff00ff) * anInt8878) + ((i_1176_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1169_ & 0xff00) * anInt8878) + ((i_1176_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_1177_ = (((i_1169_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1178_ = (((i_1169_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1179_ = (((i_1169_ & 0xff) * anInt8882) & 0xff00);
												is[i_1155_] = (i_1177_ | i_1178_ | i_1179_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_1180_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1154_]);
										int i_1181_ = anInt8877;
										int i_1182_ = i_1180_ + i_1181_;
										int i_1183_ = ((i_1180_ & 0xff00ff) + (i_1181_ & 0xff00ff));
										int i_1184_ = ((i_1183_ & 0x1000100) + (i_1182_ - i_1183_ & 0x10000));
										i_1184_ = (i_1182_ - i_1184_ | i_1184_ - (i_1184_ >>> 8));
										if (i_1180_ == 0 && anInt8878 != 255) {
											i_1180_ = i_1184_;
											i_1184_ = is[i_1155_];
											i_1184_ = (((((i_1180_ & 0xff00ff) * anInt8878) + ((i_1184_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1180_ & 0xff00) * anInt8878) + ((i_1184_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_1155_] = i_1184_;
									} else if (i == 2) {
										int i_1185_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1154_]);
										if (i_1185_ != 0) {
											int i_1186_ = (((i_1185_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1187_ = (((i_1185_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_1155_++] = (((i_1186_ | i_1187_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1148_ == 2) {
									if (i == 1) {
										int i_1188_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1154_]);
										if (i_1188_ != 0) {
											int i_1189_ = is[i_1155_];
											int i_1190_ = i_1188_ + i_1189_;
											int i_1191_ = ((i_1188_ & 0xff00ff) + (i_1189_ & 0xff00ff));
											i_1189_ = ((i_1191_ & 0x1000100) + (i_1190_ - i_1191_ & 0x10000));
											is[i_1155_] = (i_1190_ - i_1189_ | i_1189_ - (i_1189_ >>> 8));
										}
									} else if (i == 0) {
										int i_1192_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1154_]);
										if (i_1192_ != 0) {
											int i_1193_ = (((i_1192_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1194_ = (((i_1192_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1195_ = ((i_1192_ & 0xff) * anInt8882 & 0xff00);
											i_1192_ = (i_1193_ | i_1194_ | i_1195_) >>> 8;
											int i_1196_ = is[i_1155_];
											int i_1197_ = i_1192_ + i_1196_;
											int i_1198_ = ((i_1192_ & 0xff00ff) + (i_1196_ & 0xff00ff));
											i_1196_ = ((i_1198_ & 0x1000100) + (i_1197_ - i_1198_ & 0x10000));
											is[i_1155_] = (i_1197_ - i_1196_ | i_1196_ - (i_1196_ >>> 8));
										}
									} else if (i == 3) {
										int i_1199_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1154_]);
										int i_1200_ = anInt8877;
										int i_1201_ = i_1199_ + i_1200_;
										int i_1202_ = ((i_1199_ & 0xff00ff) + (i_1200_ & 0xff00ff));
										int i_1203_ = ((i_1202_ & 0x1000100) + (i_1201_ - i_1202_ & 0x10000));
										i_1199_ = (i_1201_ - i_1203_ | i_1203_ - (i_1203_ >>> 8));
										i_1203_ = is[i_1155_];
										i_1201_ = i_1199_ + i_1203_;
										i_1202_ = ((i_1199_ & 0xff00ff) + (i_1203_ & 0xff00ff));
										i_1203_ = ((i_1202_ & 0x1000100) + (i_1201_ - i_1202_ & 0x10000));
										is[i_1155_] = (i_1201_ - i_1203_ | i_1203_ - (i_1203_ >>> 8));
									} else if (i == 2) {
										int i_1204_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1154_]);
										if (i_1204_ != 0) {
											int i_1205_ = (((i_1204_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1206_ = (((i_1204_ & 0xff00) * anInt8878) & 0xff0000);
											i_1204_ = ((i_1205_ | i_1206_) >>> 8) + anInt8885;
											int i_1207_ = is[i_1155_];
											int i_1208_ = i_1204_ + i_1207_;
											int i_1209_ = ((i_1204_ & 0xff00ff) + (i_1207_ & 0xff00ff));
											i_1207_ = ((i_1209_ & 0x1000100) + (i_1208_ - i_1209_ & 0x10000));
											is[i_1155_] = (i_1208_ - i_1207_ | i_1207_ - (i_1207_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_1149_++;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_1210_ = anInt8864;
					while (i_1210_ < 0) {
						int i_1211_ = anInt8870;
						int i_1212_ = anInt8873;
						int i_1213_ = anInt8874 + anInt8866;
						int i_1214_ = anInt8862;
						if (i_1212_ >= 0 && i_1212_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) < 0) {
							int i_1215_;
							if ((i_1215_ = (i_1213_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12))) >= 0) {
								i_1215_ = (anInt8868 - i_1215_) / anInt8868;
								i_1214_ += i_1215_;
								i_1213_ += anInt8868 * i_1215_;
								i_1211_ += i_1215_;
							}
							if ((i_1215_ = (i_1213_ - anInt8868) / anInt8868) > i_1214_)
								i_1214_ = i_1215_;
							for (/**/; i_1214_ < 0; i_1214_++) {
								int i_1216_ = ((i_1213_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851 + (i_1212_ >> 12));
								int i_1217_ = i_1211_++;
								if (i_1148_ == 0) {
									if (i == 1)
										is[i_1217_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1216_]);
									else if (i == 0) {
										int i_1218_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1216_++]);
										int i_1219_ = ((i_1218_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1220_ = ((i_1218_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1221_ = ((i_1218_ & 0xff) * anInt8882 & 0xff00);
										is[i_1217_] = (i_1219_ | i_1220_ | i_1221_) >>> 8;
									} else if (i == 3) {
										int i_1222_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1216_++]);
										int i_1223_ = anInt8877;
										int i_1224_ = i_1222_ + i_1223_;
										int i_1225_ = ((i_1222_ & 0xff00ff) + (i_1223_ & 0xff00ff));
										int i_1226_ = ((i_1225_ & 0x1000100) + (i_1224_ - i_1225_ & 0x10000));
										is[i_1217_] = (i_1224_ - i_1226_ | i_1226_ - (i_1226_ >>> 8));
									} else if (i == 2) {
										int i_1227_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1216_]);
										int i_1228_ = ((i_1227_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1229_ = ((i_1227_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_1217_] = ((i_1228_ | i_1229_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_1148_ == 1) {
									if (i == 1) {
										int i_1230_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1216_]);
										if (i_1230_ != 0)
											is[i_1217_] = i_1230_;
									} else if (i == 0) {
										int i_1231_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1216_]);
										if (i_1231_ != 0) {
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_1232_ = anInt8877 >>> 24;
												int i_1233_ = 256 - i_1232_;
												int i_1234_ = is[i_1217_];
												is[i_1217_] = (((((i_1231_ & 0xff00ff) * i_1232_) + ((i_1234_ & 0xff00ff) * i_1233_)) & ~0xff00ff) + ((((i_1231_ & 0xff00) * i_1232_) + ((i_1234_ & 0xff00) * i_1233_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_1235_ = (((i_1231_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1236_ = (((i_1231_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1237_ = (((i_1231_ & 0xff) * anInt8882) & 0xff00);
												i_1231_ = (i_1235_ | i_1236_ | i_1237_) >>> 8;
												int i_1238_ = is[i_1217_];
												is[i_1217_] = (((((i_1231_ & 0xff00ff) * anInt8878) + ((i_1238_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1231_ & 0xff00) * anInt8878) + ((i_1238_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_1239_ = (((i_1231_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1240_ = (((i_1231_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1241_ = (((i_1231_ & 0xff) * anInt8882) & 0xff00);
												is[i_1217_] = (i_1239_ | i_1240_ | i_1241_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_1242_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1216_]);
										int i_1243_ = anInt8877;
										int i_1244_ = i_1242_ + i_1243_;
										int i_1245_ = ((i_1242_ & 0xff00ff) + (i_1243_ & 0xff00ff));
										int i_1246_ = ((i_1245_ & 0x1000100) + (i_1244_ - i_1245_ & 0x10000));
										i_1246_ = (i_1244_ - i_1246_ | i_1246_ - (i_1246_ >>> 8));
										if (i_1242_ == 0 && anInt8878 != 255) {
											i_1242_ = i_1246_;
											i_1246_ = is[i_1217_];
											i_1246_ = (((((i_1242_ & 0xff00ff) * anInt8878) + ((i_1246_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1242_ & 0xff00) * anInt8878) + ((i_1246_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_1217_] = i_1246_;
									} else if (i == 2) {
										int i_1247_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1216_]);
										if (i_1247_ != 0) {
											int i_1248_ = (((i_1247_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1249_ = (((i_1247_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_1217_++] = (((i_1248_ | i_1249_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1148_ == 2) {
									if (i == 1) {
										int i_1250_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1216_]);
										if (i_1250_ != 0) {
											int i_1251_ = is[i_1217_];
											int i_1252_ = i_1250_ + i_1251_;
											int i_1253_ = ((i_1250_ & 0xff00ff) + (i_1251_ & 0xff00ff));
											i_1251_ = ((i_1253_ & 0x1000100) + (i_1252_ - i_1253_ & 0x10000));
											is[i_1217_] = (i_1252_ - i_1251_ | i_1251_ - (i_1251_ >>> 8));
										}
									} else if (i == 0) {
										int i_1254_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1216_]);
										if (i_1254_ != 0) {
											int i_1255_ = (((i_1254_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1256_ = (((i_1254_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1257_ = ((i_1254_ & 0xff) * anInt8882 & 0xff00);
											i_1254_ = (i_1255_ | i_1256_ | i_1257_) >>> 8;
											int i_1258_ = is[i_1217_];
											int i_1259_ = i_1254_ + i_1258_;
											int i_1260_ = ((i_1254_ & 0xff00ff) + (i_1258_ & 0xff00ff));
											i_1258_ = ((i_1260_ & 0x1000100) + (i_1259_ - i_1260_ & 0x10000));
											is[i_1217_] = (i_1259_ - i_1258_ | i_1258_ - (i_1258_ >>> 8));
										}
									} else if (i == 3) {
										int i_1261_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1216_]);
										int i_1262_ = anInt8877;
										int i_1263_ = i_1261_ + i_1262_;
										int i_1264_ = ((i_1261_ & 0xff00ff) + (i_1262_ & 0xff00ff));
										int i_1265_ = ((i_1264_ & 0x1000100) + (i_1263_ - i_1264_ & 0x10000));
										i_1261_ = (i_1263_ - i_1265_ | i_1265_ - (i_1265_ >>> 8));
										i_1265_ = is[i_1217_];
										i_1263_ = i_1261_ + i_1265_;
										i_1264_ = ((i_1261_ & 0xff00ff) + (i_1265_ & 0xff00ff));
										i_1265_ = ((i_1264_ & 0x1000100) + (i_1263_ - i_1264_ & 0x10000));
										is[i_1217_] = (i_1263_ - i_1265_ | i_1265_ - (i_1265_ >>> 8));
									} else if (i == 2) {
										int i_1266_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1216_]);
										if (i_1266_ != 0) {
											int i_1267_ = (((i_1266_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1268_ = (((i_1266_ & 0xff00) * anInt8878) & 0xff0000);
											i_1266_ = ((i_1267_ | i_1268_) >>> 8) + anInt8885;
											int i_1269_ = is[i_1217_];
											int i_1270_ = i_1266_ + i_1269_;
											int i_1271_ = ((i_1266_ & 0xff00ff) + (i_1269_ & 0xff00ff));
											i_1269_ = ((i_1271_ & 0x1000100) + (i_1270_ - i_1271_ & 0x10000));
											is[i_1217_] = (i_1270_ - i_1269_ | i_1269_ - (i_1269_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1213_ += anInt8868;
							}
						}
						i_1210_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				} else {
					int i_1272_ = anInt8864;
					while (i_1272_ < 0) {
						int i_1273_ = anInt8870;
						int i_1274_ = anInt8873;
						int i_1275_ = anInt8874 + anInt8866;
						int i_1276_ = anInt8862;
						if (i_1274_ >= 0 && i_1274_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) < 0) {
							if (i_1275_ < 0) {
								int i_1277_ = (anInt8868 - 1 - i_1275_) / anInt8868;
								i_1276_ += i_1277_;
								i_1275_ += anInt8868 * i_1277_;
								i_1273_ += i_1277_;
							}
							int i_1278_;
							if ((i_1278_ = (1 + i_1275_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_1276_)
								i_1276_ = i_1278_;
							for (/**/; i_1276_ < 0; i_1276_++) {
								int i_1279_ = ((i_1275_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851 + (i_1274_ >> 12));
								int i_1280_ = i_1273_++;
								if (i_1148_ == 0) {
									if (i == 1)
										is[i_1280_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1279_]);
									else if (i == 0) {
										int i_1281_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1279_++]);
										int i_1282_ = ((i_1281_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1283_ = ((i_1281_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1284_ = ((i_1281_ & 0xff) * anInt8882 & 0xff00);
										is[i_1280_] = (i_1282_ | i_1283_ | i_1284_) >>> 8;
									} else if (i == 3) {
										int i_1285_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1279_++]);
										int i_1286_ = anInt8877;
										int i_1287_ = i_1285_ + i_1286_;
										int i_1288_ = ((i_1285_ & 0xff00ff) + (i_1286_ & 0xff00ff));
										int i_1289_ = ((i_1288_ & 0x1000100) + (i_1287_ - i_1288_ & 0x10000));
										is[i_1280_] = (i_1287_ - i_1289_ | i_1289_ - (i_1289_ >>> 8));
									} else if (i == 2) {
										int i_1290_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1279_]);
										int i_1291_ = ((i_1290_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1292_ = ((i_1290_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_1280_] = ((i_1291_ | i_1292_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_1148_ == 1) {
									if (i == 1) {
										int i_1293_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1279_]);
										if (i_1293_ != 0)
											is[i_1280_] = i_1293_;
									} else if (i == 0) {
										int i_1294_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1279_]);
										if (i_1294_ != 0) {
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_1295_ = anInt8877 >>> 24;
												int i_1296_ = 256 - i_1295_;
												int i_1297_ = is[i_1280_];
												is[i_1280_] = (((((i_1294_ & 0xff00ff) * i_1295_) + ((i_1297_ & 0xff00ff) * i_1296_)) & ~0xff00ff) + ((((i_1294_ & 0xff00) * i_1295_) + ((i_1297_ & 0xff00) * i_1296_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_1298_ = (((i_1294_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1299_ = (((i_1294_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1300_ = (((i_1294_ & 0xff) * anInt8882) & 0xff00);
												i_1294_ = (i_1298_ | i_1299_ | i_1300_) >>> 8;
												int i_1301_ = is[i_1280_];
												is[i_1280_] = (((((i_1294_ & 0xff00ff) * anInt8878) + ((i_1301_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1294_ & 0xff00) * anInt8878) + ((i_1301_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_1302_ = (((i_1294_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1303_ = (((i_1294_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1304_ = (((i_1294_ & 0xff) * anInt8882) & 0xff00);
												is[i_1280_] = (i_1302_ | i_1303_ | i_1304_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_1305_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1279_]);
										int i_1306_ = anInt8877;
										int i_1307_ = i_1305_ + i_1306_;
										int i_1308_ = ((i_1305_ & 0xff00ff) + (i_1306_ & 0xff00ff));
										int i_1309_ = ((i_1308_ & 0x1000100) + (i_1307_ - i_1308_ & 0x10000));
										i_1309_ = (i_1307_ - i_1309_ | i_1309_ - (i_1309_ >>> 8));
										if (i_1305_ == 0 && anInt8878 != 255) {
											i_1305_ = i_1309_;
											i_1309_ = is[i_1280_];
											i_1309_ = (((((i_1305_ & 0xff00ff) * anInt8878) + ((i_1309_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1305_ & 0xff00) * anInt8878) + ((i_1309_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_1280_] = i_1309_;
									} else if (i == 2) {
										int i_1310_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1279_]);
										if (i_1310_ != 0) {
											int i_1311_ = (((i_1310_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1312_ = (((i_1310_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_1280_++] = (((i_1311_ | i_1312_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1148_ == 2) {
									if (i == 1) {
										int i_1313_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1279_]);
										if (i_1313_ != 0) {
											int i_1314_ = is[i_1280_];
											int i_1315_ = i_1313_ + i_1314_;
											int i_1316_ = ((i_1313_ & 0xff00ff) + (i_1314_ & 0xff00ff));
											i_1314_ = ((i_1316_ & 0x1000100) + (i_1315_ - i_1316_ & 0x10000));
											is[i_1280_] = (i_1315_ - i_1314_ | i_1314_ - (i_1314_ >>> 8));
										}
									} else if (i == 0) {
										int i_1317_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1279_]);
										if (i_1317_ != 0) {
											int i_1318_ = (((i_1317_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1319_ = (((i_1317_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1320_ = ((i_1317_ & 0xff) * anInt8882 & 0xff00);
											i_1317_ = (i_1318_ | i_1319_ | i_1320_) >>> 8;
											int i_1321_ = is[i_1280_];
											int i_1322_ = i_1317_ + i_1321_;
											int i_1323_ = ((i_1317_ & 0xff00ff) + (i_1321_ & 0xff00ff));
											i_1321_ = ((i_1323_ & 0x1000100) + (i_1322_ - i_1323_ & 0x10000));
											is[i_1280_] = (i_1322_ - i_1321_ | i_1321_ - (i_1321_ >>> 8));
										}
									} else if (i == 3) {
										int i_1324_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1279_]);
										int i_1325_ = anInt8877;
										int i_1326_ = i_1324_ + i_1325_;
										int i_1327_ = ((i_1324_ & 0xff00ff) + (i_1325_ & 0xff00ff));
										int i_1328_ = ((i_1327_ & 0x1000100) + (i_1326_ - i_1327_ & 0x10000));
										i_1324_ = (i_1326_ - i_1328_ | i_1328_ - (i_1328_ >>> 8));
										i_1328_ = is[i_1280_];
										i_1326_ = i_1324_ + i_1328_;
										i_1327_ = ((i_1324_ & 0xff00ff) + (i_1328_ & 0xff00ff));
										i_1328_ = ((i_1327_ & 0x1000100) + (i_1326_ - i_1327_ & 0x10000));
										is[i_1280_] = (i_1326_ - i_1328_ | i_1328_ - (i_1328_ >>> 8));
									} else if (i == 2) {
										int i_1329_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1279_]);
										if (i_1329_ != 0) {
											int i_1330_ = (((i_1329_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1331_ = (((i_1329_ & 0xff00) * anInt8878) & 0xff0000);
											i_1329_ = ((i_1330_ | i_1331_) >>> 8) + anInt8885;
											int i_1332_ = is[i_1280_];
											int i_1333_ = i_1329_ + i_1332_;
											int i_1334_ = ((i_1329_ & 0xff00ff) + (i_1332_ & 0xff00ff));
											i_1332_ = ((i_1334_ & 0x1000100) + (i_1333_ - i_1334_ & 0x10000));
											is[i_1280_] = (i_1333_ - i_1332_ | i_1332_ - (i_1332_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1275_ += anInt8868;
							}
						}
						i_1272_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					int i_1335_ = anInt8864;
					while (i_1335_ < 0) {
						int i_1336_ = anInt8870;
						int i_1337_ = anInt8873 + anInt8858;
						int i_1338_ = anInt8874;
						int i_1339_ = anInt8862;
						if (i_1338_ >= 0 && i_1338_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) < 0) {
							int i_1340_;
							if ((i_1340_ = (i_1337_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12))) >= 0) {
								i_1340_ = (anInt8865 - i_1340_) / anInt8865;
								i_1339_ += i_1340_;
								i_1337_ += anInt8865 * i_1340_;
								i_1336_ += i_1340_;
							}
							if ((i_1340_ = (i_1337_ - anInt8865) / anInt8865) > i_1339_)
								i_1339_ = i_1340_;
							for (/**/; i_1339_ < 0; i_1339_++) {
								int i_1341_ = ((i_1338_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851 + (i_1337_ >> 12));
								int i_1342_ = i_1336_++;
								if (i_1148_ == 0) {
									if (i == 1)
										is[i_1342_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1341_]);
									else if (i == 0) {
										int i_1343_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1341_++]);
										int i_1344_ = ((i_1343_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1345_ = ((i_1343_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1346_ = ((i_1343_ & 0xff) * anInt8882 & 0xff00);
										is[i_1342_] = (i_1344_ | i_1345_ | i_1346_) >>> 8;
									} else if (i == 3) {
										int i_1347_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1341_++]);
										int i_1348_ = anInt8877;
										int i_1349_ = i_1347_ + i_1348_;
										int i_1350_ = ((i_1347_ & 0xff00ff) + (i_1348_ & 0xff00ff));
										int i_1351_ = ((i_1350_ & 0x1000100) + (i_1349_ - i_1350_ & 0x10000));
										is[i_1342_] = (i_1349_ - i_1351_ | i_1351_ - (i_1351_ >>> 8));
									} else if (i == 2) {
										int i_1352_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1341_]);
										int i_1353_ = ((i_1352_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1354_ = ((i_1352_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_1342_] = ((i_1353_ | i_1354_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_1148_ == 1) {
									if (i == 1) {
										int i_1355_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1341_]);
										if (i_1355_ != 0)
											is[i_1342_] = i_1355_;
									} else if (i == 0) {
										int i_1356_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1341_]);
										if (i_1356_ != 0) {
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_1357_ = anInt8877 >>> 24;
												int i_1358_ = 256 - i_1357_;
												int i_1359_ = is[i_1342_];
												is[i_1342_] = (((((i_1356_ & 0xff00ff) * i_1357_) + ((i_1359_ & 0xff00ff) * i_1358_)) & ~0xff00ff) + ((((i_1356_ & 0xff00) * i_1357_) + ((i_1359_ & 0xff00) * i_1358_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_1360_ = (((i_1356_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1361_ = (((i_1356_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1362_ = (((i_1356_ & 0xff) * anInt8882) & 0xff00);
												i_1356_ = (i_1360_ | i_1361_ | i_1362_) >>> 8;
												int i_1363_ = is[i_1342_];
												is[i_1342_] = (((((i_1356_ & 0xff00ff) * anInt8878) + ((i_1363_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1356_ & 0xff00) * anInt8878) + ((i_1363_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_1364_ = (((i_1356_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1365_ = (((i_1356_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1366_ = (((i_1356_ & 0xff) * anInt8882) & 0xff00);
												is[i_1342_] = (i_1364_ | i_1365_ | i_1366_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_1367_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1341_]);
										int i_1368_ = anInt8877;
										int i_1369_ = i_1367_ + i_1368_;
										int i_1370_ = ((i_1367_ & 0xff00ff) + (i_1368_ & 0xff00ff));
										int i_1371_ = ((i_1370_ & 0x1000100) + (i_1369_ - i_1370_ & 0x10000));
										i_1371_ = (i_1369_ - i_1371_ | i_1371_ - (i_1371_ >>> 8));
										if (i_1367_ == 0 && anInt8878 != 255) {
											i_1367_ = i_1371_;
											i_1371_ = is[i_1342_];
											i_1371_ = (((((i_1367_ & 0xff00ff) * anInt8878) + ((i_1371_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1367_ & 0xff00) * anInt8878) + ((i_1371_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_1342_] = i_1371_;
									} else if (i == 2) {
										int i_1372_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1341_]);
										if (i_1372_ != 0) {
											int i_1373_ = (((i_1372_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1374_ = (((i_1372_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_1342_++] = (((i_1373_ | i_1374_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1148_ == 2) {
									if (i == 1) {
										int i_1375_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1341_]);
										if (i_1375_ != 0) {
											int i_1376_ = is[i_1342_];
											int i_1377_ = i_1375_ + i_1376_;
											int i_1378_ = ((i_1375_ & 0xff00ff) + (i_1376_ & 0xff00ff));
											i_1376_ = ((i_1378_ & 0x1000100) + (i_1377_ - i_1378_ & 0x10000));
											is[i_1342_] = (i_1377_ - i_1376_ | i_1376_ - (i_1376_ >>> 8));
										}
									} else if (i == 0) {
										int i_1379_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1341_]);
										if (i_1379_ != 0) {
											int i_1380_ = (((i_1379_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1381_ = (((i_1379_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1382_ = ((i_1379_ & 0xff) * anInt8882 & 0xff00);
											i_1379_ = (i_1380_ | i_1381_ | i_1382_) >>> 8;
											int i_1383_ = is[i_1342_];
											int i_1384_ = i_1379_ + i_1383_;
											int i_1385_ = ((i_1379_ & 0xff00ff) + (i_1383_ & 0xff00ff));
											i_1383_ = ((i_1385_ & 0x1000100) + (i_1384_ - i_1385_ & 0x10000));
											is[i_1342_] = (i_1384_ - i_1383_ | i_1383_ - (i_1383_ >>> 8));
										}
									} else if (i == 3) {
										int i_1386_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1341_]);
										int i_1387_ = anInt8877;
										int i_1388_ = i_1386_ + i_1387_;
										int i_1389_ = ((i_1386_ & 0xff00ff) + (i_1387_ & 0xff00ff));
										int i_1390_ = ((i_1389_ & 0x1000100) + (i_1388_ - i_1389_ & 0x10000));
										i_1386_ = (i_1388_ - i_1390_ | i_1390_ - (i_1390_ >>> 8));
										i_1390_ = is[i_1342_];
										i_1388_ = i_1386_ + i_1390_;
										i_1389_ = ((i_1386_ & 0xff00ff) + (i_1390_ & 0xff00ff));
										i_1390_ = ((i_1389_ & 0x1000100) + (i_1388_ - i_1389_ & 0x10000));
										is[i_1342_] = (i_1388_ - i_1390_ | i_1390_ - (i_1390_ >>> 8));
									} else if (i == 2) {
										int i_1391_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1341_]);
										if (i_1391_ != 0) {
											int i_1392_ = (((i_1391_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1393_ = (((i_1391_ & 0xff00) * anInt8878) & 0xff0000);
											i_1391_ = ((i_1392_ | i_1393_) >>> 8) + anInt8885;
											int i_1394_ = is[i_1342_];
											int i_1395_ = i_1391_ + i_1394_;
											int i_1396_ = ((i_1391_ & 0xff00ff) + (i_1394_ & 0xff00ff));
											i_1394_ = ((i_1396_ & 0x1000100) + (i_1395_ - i_1396_ & 0x10000));
											is[i_1342_] = (i_1395_ - i_1394_ | i_1394_ - (i_1394_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1337_ += anInt8865;
							}
						}
						i_1335_++;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_1397_ = anInt8864;
					while (i_1397_ < 0) {
						int i_1398_ = anInt8870;
						int i_1399_ = anInt8873 + anInt8858;
						int i_1400_ = anInt8874 + anInt8866;
						int i_1401_ = anInt8862;
						int i_1402_;
						if ((i_1402_ = i_1399_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12)) >= 0) {
							i_1402_ = (anInt8865 - i_1402_) / anInt8865;
							i_1401_ += i_1402_;
							i_1399_ += anInt8865 * i_1402_;
							i_1400_ += anInt8868 * i_1402_;
							i_1398_ += i_1402_;
						}
						if ((i_1402_ = (i_1399_ - anInt8865) / anInt8865) > i_1401_)
							i_1401_ = i_1402_;
						if ((i_1402_ = i_1400_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12)) >= 0) {
							i_1402_ = (anInt8868 - i_1402_) / anInt8868;
							i_1401_ += i_1402_;
							i_1399_ += anInt8865 * i_1402_;
							i_1400_ += anInt8868 * i_1402_;
							i_1398_ += i_1402_;
						}
						if ((i_1402_ = (i_1400_ - anInt8868) / anInt8868) > i_1401_)
							i_1401_ = i_1402_;
						for (/**/; i_1401_ < 0; i_1401_++) {
							int i_1403_ = (((i_1400_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_1399_ >> 12));
							int i_1404_ = i_1398_++;
							if (i_1148_ == 0) {
								if (i == 1)
									is[i_1404_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1403_]);
								else if (i == 0) {
									int i_1405_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1403_++]);
									int i_1406_ = ((i_1405_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1407_ = ((i_1405_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1408_ = ((i_1405_ & 0xff) * anInt8882 & 0xff00);
									is[i_1404_] = (i_1406_ | i_1407_ | i_1408_) >>> 8;
								} else if (i == 3) {
									int i_1409_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1403_++]);
									int i_1410_ = anInt8877;
									int i_1411_ = i_1409_ + i_1410_;
									int i_1412_ = ((i_1409_ & 0xff00ff) + (i_1410_ & 0xff00ff));
									int i_1413_ = ((i_1412_ & 0x1000100) + (i_1411_ - i_1412_ & 0x10000));
									is[i_1404_] = (i_1411_ - i_1413_ | i_1413_ - (i_1413_ >>> 8));
								} else if (i == 2) {
									int i_1414_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1403_]);
									int i_1415_ = ((i_1414_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1416_ = ((i_1414_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_1404_] = (((i_1415_ | i_1416_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_1148_ == 1) {
								if (i == 1) {
									int i_1417_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1403_]);
									if (i_1417_ != 0)
										is[i_1404_] = i_1417_;
								} else if (i == 0) {
									int i_1418_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1403_]);
									if (i_1418_ != 0) {
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_1419_ = anInt8877 >>> 24;
											int i_1420_ = 256 - i_1419_;
											int i_1421_ = is[i_1404_];
											is[i_1404_] = (((((i_1418_ & 0xff00ff) * i_1419_) + ((i_1421_ & 0xff00ff) * i_1420_)) & ~0xff00ff) + ((((i_1418_ & 0xff00) * i_1419_) + ((i_1421_ & 0xff00) * i_1420_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_1422_ = (((i_1418_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1423_ = (((i_1418_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1424_ = ((i_1418_ & 0xff) * anInt8882 & 0xff00);
											i_1418_ = (i_1422_ | i_1423_ | i_1424_) >>> 8;
											int i_1425_ = is[i_1404_];
											is[i_1404_] = (((((i_1418_ & 0xff00ff) * anInt8878) + ((i_1425_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1418_ & 0xff00) * anInt8878) + ((i_1425_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_1426_ = (((i_1418_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1427_ = (((i_1418_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1428_ = ((i_1418_ & 0xff) * anInt8882 & 0xff00);
											is[i_1404_] = (i_1426_ | i_1427_ | i_1428_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_1429_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1403_]);
									int i_1430_ = anInt8877;
									int i_1431_ = i_1429_ + i_1430_;
									int i_1432_ = ((i_1429_ & 0xff00ff) + (i_1430_ & 0xff00ff));
									int i_1433_ = ((i_1432_ & 0x1000100) + (i_1431_ - i_1432_ & 0x10000));
									i_1433_ = (i_1431_ - i_1433_ | i_1433_ - (i_1433_ >>> 8));
									if (i_1429_ == 0 && anInt8878 != 255) {
										i_1429_ = i_1433_;
										i_1433_ = is[i_1404_];
										i_1433_ = (((((i_1429_ & 0xff00ff) * anInt8878) + ((i_1433_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1429_ & 0xff00) * anInt8878) + ((i_1433_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_1404_] = i_1433_;
								} else if (i == 2) {
									int i_1434_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1403_]);
									if (i_1434_ != 0) {
										int i_1435_ = ((i_1434_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1436_ = ((i_1434_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_1404_++] = ((i_1435_ | i_1436_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1148_ == 2) {
								if (i == 1) {
									int i_1437_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1403_]);
									if (i_1437_ != 0) {
										int i_1438_ = is[i_1404_];
										int i_1439_ = i_1437_ + i_1438_;
										int i_1440_ = ((i_1437_ & 0xff00ff) + (i_1438_ & 0xff00ff));
										i_1438_ = ((i_1440_ & 0x1000100) + (i_1439_ - i_1440_ & 0x10000));
										is[i_1404_] = (i_1439_ - i_1438_ | i_1438_ - (i_1438_ >>> 8));
									}
								} else if (i == 0) {
									int i_1441_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1403_]);
									if (i_1441_ != 0) {
										int i_1442_ = ((i_1441_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1443_ = ((i_1441_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1444_ = ((i_1441_ & 0xff) * anInt8882 & 0xff00);
										i_1441_ = (i_1442_ | i_1443_ | i_1444_) >>> 8;
										int i_1445_ = is[i_1404_];
										int i_1446_ = i_1441_ + i_1445_;
										int i_1447_ = ((i_1441_ & 0xff00ff) + (i_1445_ & 0xff00ff));
										i_1445_ = ((i_1447_ & 0x1000100) + (i_1446_ - i_1447_ & 0x10000));
										is[i_1404_] = (i_1446_ - i_1445_ | i_1445_ - (i_1445_ >>> 8));
									}
								} else if (i == 3) {
									int i_1448_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1403_]);
									int i_1449_ = anInt8877;
									int i_1450_ = i_1448_ + i_1449_;
									int i_1451_ = ((i_1448_ & 0xff00ff) + (i_1449_ & 0xff00ff));
									int i_1452_ = ((i_1451_ & 0x1000100) + (i_1450_ - i_1451_ & 0x10000));
									i_1448_ = (i_1450_ - i_1452_ | i_1452_ - (i_1452_ >>> 8));
									i_1452_ = is[i_1404_];
									i_1450_ = i_1448_ + i_1452_;
									i_1451_ = (i_1448_ & 0xff00ff) + (i_1452_ & 0xff00ff);
									i_1452_ = ((i_1451_ & 0x1000100) + (i_1450_ - i_1451_ & 0x10000));
									is[i_1404_] = (i_1450_ - i_1452_ | i_1452_ - (i_1452_ >>> 8));
								} else if (i == 2) {
									int i_1453_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1403_]);
									if (i_1453_ != 0) {
										int i_1454_ = ((i_1453_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1455_ = ((i_1453_ & 0xff00) * anInt8878 & 0xff0000);
										i_1453_ = (((i_1454_ | i_1455_) >>> 8) + anInt8885);
										int i_1456_ = is[i_1404_];
										int i_1457_ = i_1453_ + i_1456_;
										int i_1458_ = ((i_1453_ & 0xff00ff) + (i_1456_ & 0xff00ff));
										i_1456_ = ((i_1458_ & 0x1000100) + (i_1457_ - i_1458_ & 0x10000));
										is[i_1404_] = (i_1457_ - i_1456_ | i_1456_ - (i_1456_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1399_ += anInt8865;
							i_1400_ += anInt8868;
						}
						i_1397_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else {
					int i_1459_ = anInt8864;
					while (i_1459_ < 0) {
						int i_1460_ = anInt8870;
						int i_1461_ = anInt8873 + anInt8858;
						int i_1462_ = anInt8874 + anInt8866;
						int i_1463_ = anInt8862;
						int i_1464_;
						if ((i_1464_ = i_1461_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12)) >= 0) {
							i_1464_ = (anInt8865 - i_1464_) / anInt8865;
							i_1463_ += i_1464_;
							i_1461_ += anInt8865 * i_1464_;
							i_1462_ += anInt8868 * i_1464_;
							i_1460_ += i_1464_;
						}
						if ((i_1464_ = (i_1461_ - anInt8865) / anInt8865) > i_1463_)
							i_1463_ = i_1464_;
						if (i_1462_ < 0) {
							i_1464_ = (anInt8868 - 1 - i_1462_) / anInt8868;
							i_1463_ += i_1464_;
							i_1461_ += anInt8865 * i_1464_;
							i_1462_ += anInt8868 * i_1464_;
							i_1460_ += i_1464_;
						}
						if ((i_1464_ = (1 + i_1462_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_1463_)
							i_1463_ = i_1464_;
						for (/**/; i_1463_ < 0; i_1463_++) {
							int i_1465_ = (((i_1462_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_1461_ >> 12));
							int i_1466_ = i_1460_++;
							if (i_1148_ == 0) {
								if (i == 1)
									is[i_1466_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1465_]);
								else if (i == 0) {
									int i_1467_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1465_++]);
									int i_1468_ = ((i_1467_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1469_ = ((i_1467_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1470_ = ((i_1467_ & 0xff) * anInt8882 & 0xff00);
									is[i_1466_] = (i_1468_ | i_1469_ | i_1470_) >>> 8;
								} else if (i == 3) {
									int i_1471_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1465_++]);
									int i_1472_ = anInt8877;
									int i_1473_ = i_1471_ + i_1472_;
									int i_1474_ = ((i_1471_ & 0xff00ff) + (i_1472_ & 0xff00ff));
									int i_1475_ = ((i_1474_ & 0x1000100) + (i_1473_ - i_1474_ & 0x10000));
									is[i_1466_] = (i_1473_ - i_1475_ | i_1475_ - (i_1475_ >>> 8));
								} else if (i == 2) {
									int i_1476_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1465_]);
									int i_1477_ = ((i_1476_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1478_ = ((i_1476_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_1466_] = (((i_1477_ | i_1478_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_1148_ == 1) {
								if (i == 1) {
									int i_1479_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1465_]);
									if (i_1479_ != 0)
										is[i_1466_] = i_1479_;
								} else if (i == 0) {
									int i_1480_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1465_]);
									if (i_1480_ != 0) {
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_1481_ = anInt8877 >>> 24;
											int i_1482_ = 256 - i_1481_;
											int i_1483_ = is[i_1466_];
											is[i_1466_] = (((((i_1480_ & 0xff00ff) * i_1481_) + ((i_1483_ & 0xff00ff) * i_1482_)) & ~0xff00ff) + ((((i_1480_ & 0xff00) * i_1481_) + ((i_1483_ & 0xff00) * i_1482_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_1484_ = (((i_1480_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1485_ = (((i_1480_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1486_ = ((i_1480_ & 0xff) * anInt8882 & 0xff00);
											i_1480_ = (i_1484_ | i_1485_ | i_1486_) >>> 8;
											int i_1487_ = is[i_1466_];
											is[i_1466_] = (((((i_1480_ & 0xff00ff) * anInt8878) + ((i_1487_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1480_ & 0xff00) * anInt8878) + ((i_1487_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_1488_ = (((i_1480_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1489_ = (((i_1480_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1490_ = ((i_1480_ & 0xff) * anInt8882 & 0xff00);
											is[i_1466_] = (i_1488_ | i_1489_ | i_1490_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_1491_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1465_]);
									int i_1492_ = anInt8877;
									int i_1493_ = i_1491_ + i_1492_;
									int i_1494_ = ((i_1491_ & 0xff00ff) + (i_1492_ & 0xff00ff));
									int i_1495_ = ((i_1494_ & 0x1000100) + (i_1493_ - i_1494_ & 0x10000));
									i_1495_ = (i_1493_ - i_1495_ | i_1495_ - (i_1495_ >>> 8));
									if (i_1491_ == 0 && anInt8878 != 255) {
										i_1491_ = i_1495_;
										i_1495_ = is[i_1466_];
										i_1495_ = (((((i_1491_ & 0xff00ff) * anInt8878) + ((i_1495_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1491_ & 0xff00) * anInt8878) + ((i_1495_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_1466_] = i_1495_;
								} else if (i == 2) {
									int i_1496_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1465_]);
									if (i_1496_ != 0) {
										int i_1497_ = ((i_1496_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1498_ = ((i_1496_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_1466_++] = ((i_1497_ | i_1498_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1148_ == 2) {
								if (i == 1) {
									int i_1499_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1465_]);
									if (i_1499_ != 0) {
										int i_1500_ = is[i_1466_];
										int i_1501_ = i_1499_ + i_1500_;
										int i_1502_ = ((i_1499_ & 0xff00ff) + (i_1500_ & 0xff00ff));
										i_1500_ = ((i_1502_ & 0x1000100) + (i_1501_ - i_1502_ & 0x10000));
										is[i_1466_] = (i_1501_ - i_1500_ | i_1500_ - (i_1500_ >>> 8));
									}
								} else if (i == 0) {
									int i_1503_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1465_]);
									if (i_1503_ != 0) {
										int i_1504_ = ((i_1503_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1505_ = ((i_1503_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1506_ = ((i_1503_ & 0xff) * anInt8882 & 0xff00);
										i_1503_ = (i_1504_ | i_1505_ | i_1506_) >>> 8;
										int i_1507_ = is[i_1466_];
										int i_1508_ = i_1503_ + i_1507_;
										int i_1509_ = ((i_1503_ & 0xff00ff) + (i_1507_ & 0xff00ff));
										i_1507_ = ((i_1509_ & 0x1000100) + (i_1508_ - i_1509_ & 0x10000));
										is[i_1466_] = (i_1508_ - i_1507_ | i_1507_ - (i_1507_ >>> 8));
									}
								} else if (i == 3) {
									int i_1510_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1465_]);
									int i_1511_ = anInt8877;
									int i_1512_ = i_1510_ + i_1511_;
									int i_1513_ = ((i_1510_ & 0xff00ff) + (i_1511_ & 0xff00ff));
									int i_1514_ = ((i_1513_ & 0x1000100) + (i_1512_ - i_1513_ & 0x10000));
									i_1510_ = (i_1512_ - i_1514_ | i_1514_ - (i_1514_ >>> 8));
									i_1514_ = is[i_1466_];
									i_1512_ = i_1510_ + i_1514_;
									i_1513_ = (i_1510_ & 0xff00ff) + (i_1514_ & 0xff00ff);
									i_1514_ = ((i_1513_ & 0x1000100) + (i_1512_ - i_1513_ & 0x10000));
									is[i_1466_] = (i_1512_ - i_1514_ | i_1514_ - (i_1514_ >>> 8));
								} else if (i == 2) {
									int i_1515_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1465_]);
									if (i_1515_ != 0) {
										int i_1516_ = ((i_1515_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1517_ = ((i_1515_ & 0xff00) * anInt8878 & 0xff0000);
										i_1515_ = (((i_1516_ | i_1517_) >>> 8) + anInt8885);
										int i_1518_ = is[i_1466_];
										int i_1519_ = i_1515_ + i_1518_;
										int i_1520_ = ((i_1515_ & 0xff00ff) + (i_1518_ & 0xff00ff));
										i_1518_ = ((i_1520_ & 0x1000100) + (i_1519_ - i_1520_ & 0x10000));
										is[i_1466_] = (i_1519_ - i_1518_ | i_1518_ - (i_1518_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1461_ += anInt8865;
							i_1462_ += anInt8868;
						}
						i_1459_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8868 == 0) {
				int i_1521_ = anInt8864;
				while (i_1521_ < 0) {
					int i_1522_ = anInt8870;
					int i_1523_ = anInt8873 + anInt8858;
					int i_1524_ = anInt8874;
					int i_1525_ = anInt8862;
					if (i_1524_ >= 0 && i_1524_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) < 0) {
						if (i_1523_ < 0) {
							int i_1526_ = (anInt8865 - 1 - i_1523_) / anInt8865;
							i_1525_ += i_1526_;
							i_1523_ += anInt8865 * i_1526_;
							i_1522_ += i_1526_;
						}
						int i_1527_;
						if ((i_1527_ = (1 + i_1523_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1525_)
							i_1525_ = i_1527_;
						for (/**/; i_1525_ < 0; i_1525_++) {
							int i_1528_ = (((i_1524_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_1523_ >> 12));
							int i_1529_ = i_1522_++;
							if (i_1148_ == 0) {
								if (i == 1)
									is[i_1529_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1528_]);
								else if (i == 0) {
									int i_1530_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1528_++]);
									int i_1531_ = ((i_1530_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1532_ = ((i_1530_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1533_ = ((i_1530_ & 0xff) * anInt8882 & 0xff00);
									is[i_1529_] = (i_1531_ | i_1532_ | i_1533_) >>> 8;
								} else if (i == 3) {
									int i_1534_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1528_++]);
									int i_1535_ = anInt8877;
									int i_1536_ = i_1534_ + i_1535_;
									int i_1537_ = ((i_1534_ & 0xff00ff) + (i_1535_ & 0xff00ff));
									int i_1538_ = ((i_1537_ & 0x1000100) + (i_1536_ - i_1537_ & 0x10000));
									is[i_1529_] = (i_1536_ - i_1538_ | i_1538_ - (i_1538_ >>> 8));
								} else if (i == 2) {
									int i_1539_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1528_]);
									int i_1540_ = ((i_1539_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1541_ = ((i_1539_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_1529_] = (((i_1540_ | i_1541_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_1148_ == 1) {
								if (i == 1) {
									int i_1542_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1528_]);
									if (i_1542_ != 0)
										is[i_1529_] = i_1542_;
								} else if (i == 0) {
									int i_1543_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1528_]);
									if (i_1543_ != 0) {
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_1544_ = anInt8877 >>> 24;
											int i_1545_ = 256 - i_1544_;
											int i_1546_ = is[i_1529_];
											is[i_1529_] = (((((i_1543_ & 0xff00ff) * i_1544_) + ((i_1546_ & 0xff00ff) * i_1545_)) & ~0xff00ff) + ((((i_1543_ & 0xff00) * i_1544_) + ((i_1546_ & 0xff00) * i_1545_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_1547_ = (((i_1543_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1548_ = (((i_1543_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1549_ = ((i_1543_ & 0xff) * anInt8882 & 0xff00);
											i_1543_ = (i_1547_ | i_1548_ | i_1549_) >>> 8;
											int i_1550_ = is[i_1529_];
											is[i_1529_] = (((((i_1543_ & 0xff00ff) * anInt8878) + ((i_1550_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1543_ & 0xff00) * anInt8878) + ((i_1550_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_1551_ = (((i_1543_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1552_ = (((i_1543_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1553_ = ((i_1543_ & 0xff) * anInt8882 & 0xff00);
											is[i_1529_] = (i_1551_ | i_1552_ | i_1553_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_1554_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1528_]);
									int i_1555_ = anInt8877;
									int i_1556_ = i_1554_ + i_1555_;
									int i_1557_ = ((i_1554_ & 0xff00ff) + (i_1555_ & 0xff00ff));
									int i_1558_ = ((i_1557_ & 0x1000100) + (i_1556_ - i_1557_ & 0x10000));
									i_1558_ = (i_1556_ - i_1558_ | i_1558_ - (i_1558_ >>> 8));
									if (i_1554_ == 0 && anInt8878 != 255) {
										i_1554_ = i_1558_;
										i_1558_ = is[i_1529_];
										i_1558_ = (((((i_1554_ & 0xff00ff) * anInt8878) + ((i_1558_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1554_ & 0xff00) * anInt8878) + ((i_1558_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_1529_] = i_1558_;
								} else if (i == 2) {
									int i_1559_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1528_]);
									if (i_1559_ != 0) {
										int i_1560_ = ((i_1559_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1561_ = ((i_1559_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_1529_++] = ((i_1560_ | i_1561_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1148_ == 2) {
								if (i == 1) {
									int i_1562_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1528_]);
									if (i_1562_ != 0) {
										int i_1563_ = is[i_1529_];
										int i_1564_ = i_1562_ + i_1563_;
										int i_1565_ = ((i_1562_ & 0xff00ff) + (i_1563_ & 0xff00ff));
										i_1563_ = ((i_1565_ & 0x1000100) + (i_1564_ - i_1565_ & 0x10000));
										is[i_1529_] = (i_1564_ - i_1563_ | i_1563_ - (i_1563_ >>> 8));
									}
								} else if (i == 0) {
									int i_1566_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1528_]);
									if (i_1566_ != 0) {
										int i_1567_ = ((i_1566_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1568_ = ((i_1566_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1569_ = ((i_1566_ & 0xff) * anInt8882 & 0xff00);
										i_1566_ = (i_1567_ | i_1568_ | i_1569_) >>> 8;
										int i_1570_ = is[i_1529_];
										int i_1571_ = i_1566_ + i_1570_;
										int i_1572_ = ((i_1566_ & 0xff00ff) + (i_1570_ & 0xff00ff));
										i_1570_ = ((i_1572_ & 0x1000100) + (i_1571_ - i_1572_ & 0x10000));
										is[i_1529_] = (i_1571_ - i_1570_ | i_1570_ - (i_1570_ >>> 8));
									}
								} else if (i == 3) {
									int i_1573_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1528_]);
									int i_1574_ = anInt8877;
									int i_1575_ = i_1573_ + i_1574_;
									int i_1576_ = ((i_1573_ & 0xff00ff) + (i_1574_ & 0xff00ff));
									int i_1577_ = ((i_1576_ & 0x1000100) + (i_1575_ - i_1576_ & 0x10000));
									i_1573_ = (i_1575_ - i_1577_ | i_1577_ - (i_1577_ >>> 8));
									i_1577_ = is[i_1529_];
									i_1575_ = i_1573_ + i_1577_;
									i_1576_ = (i_1573_ & 0xff00ff) + (i_1577_ & 0xff00ff);
									i_1577_ = ((i_1576_ & 0x1000100) + (i_1575_ - i_1576_ & 0x10000));
									is[i_1529_] = (i_1575_ - i_1577_ | i_1577_ - (i_1577_ >>> 8));
								} else if (i == 2) {
									int i_1578_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1528_]);
									if (i_1578_ != 0) {
										int i_1579_ = ((i_1578_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1580_ = ((i_1578_ & 0xff00) * anInt8878 & 0xff0000);
										i_1578_ = (((i_1579_ | i_1580_) >>> 8) + anInt8885);
										int i_1581_ = is[i_1529_];
										int i_1582_ = i_1578_ + i_1581_;
										int i_1583_ = ((i_1578_ & 0xff00ff) + (i_1581_ & 0xff00ff));
										i_1581_ = ((i_1583_ & 0x1000100) + (i_1582_ - i_1583_ & 0x10000));
										is[i_1529_] = (i_1582_ - i_1581_ | i_1581_ - (i_1581_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1523_ += anInt8865;
						}
					}
					i_1521_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else if (anInt8868 < 0) {
				for (int i_1584_ = anInt8864; i_1584_ < 0; i_1584_++) {
					int i_1585_ = anInt8870;
					int i_1586_ = anInt8873 + anInt8858;
					int i_1587_ = anInt8874 + anInt8866;
					int i_1588_ = anInt8862;
					if (i_1586_ < 0) {
						int i_1589_ = (anInt8865 - 1 - i_1586_) / anInt8865;
						i_1588_ += i_1589_;
						i_1586_ += anInt8865 * i_1589_;
						i_1587_ += anInt8868 * i_1589_;
						i_1585_ += i_1589_;
					}
					int i_1590_;
					if ((i_1590_ = (1 + i_1586_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1588_)
						i_1588_ = i_1590_;
					if ((i_1590_ = i_1587_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12)) >= 0) {
						i_1590_ = (anInt8868 - i_1590_) / anInt8868;
						i_1588_ += i_1590_;
						i_1586_ += anInt8865 * i_1590_;
						i_1587_ += anInt8868 * i_1590_;
						i_1585_ += i_1590_;
					}
					if ((i_1590_ = (i_1587_ - anInt8868) / anInt8868) > i_1588_)
						i_1588_ = i_1590_;
					for (/**/; i_1588_ < 0; i_1588_++) {
						int i_1591_ = (((i_1587_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_1586_ >> 12));
						int i_1592_ = i_1585_++;
						if (i_1148_ == 0) {
							if (i == 1)
								is[i_1592_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1591_]);
							else if (i == 0) {
								int i_1593_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1591_++]);
								int i_1594_ = ((i_1593_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_1595_ = ((i_1593_ & 0xff00) * anInt8852 & 0xff0000);
								int i_1596_ = (i_1593_ & 0xff) * anInt8882 & 0xff00;
								is[i_1592_] = (i_1594_ | i_1595_ | i_1596_) >>> 8;
							} else if (i == 3) {
								int i_1597_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1591_++]);
								int i_1598_ = anInt8877;
								int i_1599_ = i_1597_ + i_1598_;
								int i_1600_ = ((i_1597_ & 0xff00ff) + (i_1598_ & 0xff00ff));
								int i_1601_ = ((i_1600_ & 0x1000100) + (i_1599_ - i_1600_ & 0x10000));
								is[i_1592_] = i_1599_ - i_1601_ | i_1601_ - (i_1601_ >>> 8);
							} else if (i == 2) {
								int i_1602_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1591_]);
								int i_1603_ = ((i_1602_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_1604_ = ((i_1602_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_1592_] = ((i_1603_ | i_1604_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_1148_ == 1) {
							if (i == 1) {
								int i_1605_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1591_]);
								if (i_1605_ != 0)
									is[i_1592_] = i_1605_;
							} else if (i == 0) {
								int i_1606_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1591_]);
								if (i_1606_ != 0) {
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_1607_ = anInt8877 >>> 24;
										int i_1608_ = 256 - i_1607_;
										int i_1609_ = is[i_1592_];
										is[i_1592_] = ((((i_1606_ & 0xff00ff) * i_1607_ + ((i_1609_ & 0xff00ff) * i_1608_)) & ~0xff00ff) + (((i_1606_ & 0xff00) * i_1607_ + ((i_1609_ & 0xff00) * i_1608_)) & 0xff0000)) >> 8;
									} else if (anInt8878 != 255) {
										int i_1610_ = ((i_1606_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1611_ = ((i_1606_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1612_ = ((i_1606_ & 0xff) * anInt8882 & 0xff00);
										i_1606_ = (i_1610_ | i_1611_ | i_1612_) >>> 8;
										int i_1613_ = is[i_1592_];
										is[i_1592_] = (((((i_1606_ & 0xff00ff) * anInt8878) + ((i_1613_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1606_ & 0xff00) * anInt8878) + ((i_1613_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									} else {
										int i_1614_ = ((i_1606_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1615_ = ((i_1606_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1616_ = ((i_1606_ & 0xff) * anInt8882 & 0xff00);
										is[i_1592_] = (i_1614_ | i_1615_ | i_1616_) >>> 8;
									}
								}
							} else if (i == 3) {
								int i_1617_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1591_]);
								int i_1618_ = anInt8877;
								int i_1619_ = i_1617_ + i_1618_;
								int i_1620_ = ((i_1617_ & 0xff00ff) + (i_1618_ & 0xff00ff));
								int i_1621_ = ((i_1620_ & 0x1000100) + (i_1619_ - i_1620_ & 0x10000));
								i_1621_ = i_1619_ - i_1621_ | i_1621_ - (i_1621_ >>> 8);
								if (i_1617_ == 0 && anInt8878 != 255) {
									i_1617_ = i_1621_;
									i_1621_ = is[i_1592_];
									i_1621_ = ((((i_1617_ & 0xff00ff) * anInt8878 + ((i_1621_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_1617_ & 0xff00) * anInt8878 + ((i_1621_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_1592_] = i_1621_;
							} else if (i == 2) {
								int i_1622_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1591_]);
								if (i_1622_ != 0) {
									int i_1623_ = ((i_1622_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1624_ = ((i_1622_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_1592_++] = ((i_1623_ | i_1624_) >>> 8) + anInt8885;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_1148_ == 2) {
							if (i == 1) {
								int i_1625_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1591_]);
								if (i_1625_ != 0) {
									int i_1626_ = is[i_1592_];
									int i_1627_ = i_1625_ + i_1626_;
									int i_1628_ = ((i_1625_ & 0xff00ff) + (i_1626_ & 0xff00ff));
									i_1626_ = ((i_1628_ & 0x1000100) + (i_1627_ - i_1628_ & 0x10000));
									is[i_1592_] = (i_1627_ - i_1626_ | i_1626_ - (i_1626_ >>> 8));
								}
							} else if (i == 0) {
								int i_1629_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1591_]);
								if (i_1629_ != 0) {
									int i_1630_ = ((i_1629_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1631_ = ((i_1629_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1632_ = ((i_1629_ & 0xff) * anInt8882 & 0xff00);
									i_1629_ = (i_1630_ | i_1631_ | i_1632_) >>> 8;
									int i_1633_ = is[i_1592_];
									int i_1634_ = i_1629_ + i_1633_;
									int i_1635_ = ((i_1629_ & 0xff00ff) + (i_1633_ & 0xff00ff));
									i_1633_ = ((i_1635_ & 0x1000100) + (i_1634_ - i_1635_ & 0x10000));
									is[i_1592_] = (i_1634_ - i_1633_ | i_1633_ - (i_1633_ >>> 8));
								}
							} else if (i == 3) {
								int i_1636_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1591_]);
								int i_1637_ = anInt8877;
								int i_1638_ = i_1636_ + i_1637_;
								int i_1639_ = ((i_1636_ & 0xff00ff) + (i_1637_ & 0xff00ff));
								int i_1640_ = ((i_1639_ & 0x1000100) + (i_1638_ - i_1639_ & 0x10000));
								i_1636_ = i_1638_ - i_1640_ | i_1640_ - (i_1640_ >>> 8);
								i_1640_ = is[i_1592_];
								i_1638_ = i_1636_ + i_1640_;
								i_1639_ = (i_1636_ & 0xff00ff) + (i_1640_ & 0xff00ff);
								i_1640_ = ((i_1639_ & 0x1000100) + (i_1638_ - i_1639_ & 0x10000));
								is[i_1592_] = i_1638_ - i_1640_ | i_1640_ - (i_1640_ >>> 8);
							} else if (i == 2) {
								int i_1641_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1591_]);
								if (i_1641_ != 0) {
									int i_1642_ = ((i_1641_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1643_ = ((i_1641_ & 0xff00) * anInt8878 & 0xff0000);
									i_1641_ = (((i_1642_ | i_1643_) >>> 8) + anInt8885);
									int i_1644_ = is[i_1592_];
									int i_1645_ = i_1641_ + i_1644_;
									int i_1646_ = ((i_1641_ & 0xff00ff) + (i_1644_ & 0xff00ff));
									i_1644_ = ((i_1646_ & 0x1000100) + (i_1645_ - i_1646_ & 0x10000));
									is[i_1592_] = (i_1645_ - i_1644_ | i_1644_ - (i_1644_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1586_ += anInt8865;
						i_1587_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else {
				for (int i_1647_ = anInt8864; i_1647_ < 0; i_1647_++) {
					int i_1648_ = anInt8870;
					int i_1649_ = anInt8873 + anInt8858;
					int i_1650_ = anInt8874 + anInt8866;
					int i_1651_ = anInt8862;
					if (i_1649_ < 0) {
						int i_1652_ = (anInt8865 - 1 - i_1649_) / anInt8865;
						i_1651_ += i_1652_;
						i_1649_ += anInt8865 * i_1652_;
						i_1650_ += anInt8868 * i_1652_;
						i_1648_ += i_1652_;
					}
					int i_1653_;
					if ((i_1653_ = (1 + i_1649_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1651_)
						i_1651_ = i_1653_;
					if (i_1650_ < 0) {
						i_1653_ = (anInt8868 - 1 - i_1650_) / anInt8868;
						i_1651_ += i_1653_;
						i_1649_ += anInt8865 * i_1653_;
						i_1650_ += anInt8868 * i_1653_;
						i_1648_ += i_1653_;
					}
					if ((i_1653_ = (1 + i_1650_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_1651_)
						i_1651_ = i_1653_;
					for (/**/; i_1651_ < 0; i_1651_++) {
						int i_1654_ = (((i_1650_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_1649_ >> 12));
						int i_1655_ = i_1648_++;
						if (i_1148_ == 0) {
							if (i == 1)
								is[i_1655_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1654_]);
							else if (i == 0) {
								int i_1656_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1654_++]);
								int i_1657_ = ((i_1656_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_1658_ = ((i_1656_ & 0xff00) * anInt8852 & 0xff0000);
								int i_1659_ = (i_1656_ & 0xff) * anInt8882 & 0xff00;
								is[i_1655_] = (i_1657_ | i_1658_ | i_1659_) >>> 8;
							} else if (i == 3) {
								int i_1660_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1654_++]);
								int i_1661_ = anInt8877;
								int i_1662_ = i_1660_ + i_1661_;
								int i_1663_ = ((i_1660_ & 0xff00ff) + (i_1661_ & 0xff00ff));
								int i_1664_ = ((i_1663_ & 0x1000100) + (i_1662_ - i_1663_ & 0x10000));
								is[i_1655_] = i_1662_ - i_1664_ | i_1664_ - (i_1664_ >>> 8);
							} else if (i == 2) {
								int i_1665_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1654_]);
								int i_1666_ = ((i_1665_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_1667_ = ((i_1665_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_1655_] = ((i_1666_ | i_1667_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_1148_ == 1) {
							if (i == 1) {
								int i_1668_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1654_]);
								if (i_1668_ != 0)
									is[i_1655_] = i_1668_;
							} else if (i == 0) {
								int i_1669_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1654_]);
								if (i_1669_ != 0) {
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_1670_ = anInt8877 >>> 24;
										int i_1671_ = 256 - i_1670_;
										int i_1672_ = is[i_1655_];
										is[i_1655_] = ((((i_1669_ & 0xff00ff) * i_1670_ + ((i_1672_ & 0xff00ff) * i_1671_)) & ~0xff00ff) + (((i_1669_ & 0xff00) * i_1670_ + ((i_1672_ & 0xff00) * i_1671_)) & 0xff0000)) >> 8;
									} else if (anInt8878 != 255) {
										int i_1673_ = ((i_1669_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1674_ = ((i_1669_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1675_ = ((i_1669_ & 0xff) * anInt8882 & 0xff00);
										i_1669_ = (i_1673_ | i_1674_ | i_1675_) >>> 8;
										int i_1676_ = is[i_1655_];
										is[i_1655_] = (((((i_1669_ & 0xff00ff) * anInt8878) + ((i_1676_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1669_ & 0xff00) * anInt8878) + ((i_1676_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									} else {
										int i_1677_ = ((i_1669_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1678_ = ((i_1669_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1679_ = ((i_1669_ & 0xff) * anInt8882 & 0xff00);
										is[i_1655_] = (i_1677_ | i_1678_ | i_1679_) >>> 8;
									}
								}
							} else if (i == 3) {
								int i_1680_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1654_]);
								int i_1681_ = anInt8877;
								int i_1682_ = i_1680_ + i_1681_;
								int i_1683_ = ((i_1680_ & 0xff00ff) + (i_1681_ & 0xff00ff));
								int i_1684_ = ((i_1683_ & 0x1000100) + (i_1682_ - i_1683_ & 0x10000));
								i_1684_ = i_1682_ - i_1684_ | i_1684_ - (i_1684_ >>> 8);
								if (i_1680_ == 0 && anInt8878 != 255) {
									i_1680_ = i_1684_;
									i_1684_ = is[i_1655_];
									i_1684_ = ((((i_1680_ & 0xff00ff) * anInt8878 + ((i_1684_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_1680_ & 0xff00) * anInt8878 + ((i_1684_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_1655_] = i_1684_;
							} else if (i == 2) {
								int i_1685_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1654_]);
								if (i_1685_ != 0) {
									int i_1686_ = ((i_1685_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1687_ = ((i_1685_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_1655_++] = ((i_1686_ | i_1687_) >>> 8) + anInt8885;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_1148_ == 2) {
							if (i == 1) {
								int i_1688_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1654_]);
								if (i_1688_ != 0) {
									int i_1689_ = is[i_1655_];
									int i_1690_ = i_1688_ + i_1689_;
									int i_1691_ = ((i_1688_ & 0xff00ff) + (i_1689_ & 0xff00ff));
									i_1689_ = ((i_1691_ & 0x1000100) + (i_1690_ - i_1691_ & 0x10000));
									is[i_1655_] = (i_1690_ - i_1689_ | i_1689_ - (i_1689_ >>> 8));
								}
							} else if (i == 0) {
								int i_1692_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1654_]);
								if (i_1692_ != 0) {
									int i_1693_ = ((i_1692_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1694_ = ((i_1692_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1695_ = ((i_1692_ & 0xff) * anInt8882 & 0xff00);
									i_1692_ = (i_1693_ | i_1694_ | i_1695_) >>> 8;
									int i_1696_ = is[i_1655_];
									int i_1697_ = i_1692_ + i_1696_;
									int i_1698_ = ((i_1692_ & 0xff00ff) + (i_1696_ & 0xff00ff));
									i_1696_ = ((i_1698_ & 0x1000100) + (i_1697_ - i_1698_ & 0x10000));
									is[i_1655_] = (i_1697_ - i_1696_ | i_1696_ - (i_1696_ >>> 8));
								}
							} else if (i == 3) {
								int i_1699_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1654_]);
								int i_1700_ = anInt8877;
								int i_1701_ = i_1699_ + i_1700_;
								int i_1702_ = ((i_1699_ & 0xff00ff) + (i_1700_ & 0xff00ff));
								int i_1703_ = ((i_1702_ & 0x1000100) + (i_1701_ - i_1702_ & 0x10000));
								i_1699_ = i_1701_ - i_1703_ | i_1703_ - (i_1703_ >>> 8);
								i_1703_ = is[i_1655_];
								i_1701_ = i_1699_ + i_1703_;
								i_1702_ = (i_1699_ & 0xff00ff) + (i_1703_ & 0xff00ff);
								i_1703_ = ((i_1702_ & 0x1000100) + (i_1701_ - i_1702_ & 0x10000));
								is[i_1655_] = i_1701_ - i_1703_ | i_1703_ - (i_1703_ >>> 8);
							} else if (i == 2) {
								int i_1704_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1654_]);
								if (i_1704_ != 0) {
									int i_1705_ = ((i_1704_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1706_ = ((i_1704_ & 0xff00) * anInt8878 & 0xff0000);
									i_1704_ = (((i_1705_ | i_1706_) >>> 8) + anInt8885);
									int i_1707_ = is[i_1655_];
									int i_1708_ = i_1704_ + i_1707_;
									int i_1709_ = ((i_1704_ & 0xff00ff) + (i_1707_ & 0xff00ff));
									i_1707_ = ((i_1709_ & 0x1000100) + (i_1708_ - i_1709_ & 0x10000));
									is[i_1655_] = (i_1708_ - i_1707_ | i_1707_ - (i_1707_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1649_ += anInt8865;
						i_1650_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			}
		}
	}

	public void method2749(int i, int i_1710_, int i_1711_, int i_1712_, int i_1713_) {
		if (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			int i_1714_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			i += ((Class160_Sub1_Sub1) this).anInt8853;
			i_1710_ += ((Class160_Sub1_Sub1) this).anInt8854;
			int i_1715_ = i_1710_ * i_1714_ + i;
			int i_1716_ = 0;
			int i_1717_ = ((Class160_Sub1_Sub1) this).anInt8867;
			int i_1718_ = ((Class160_Sub1_Sub1) this).anInt8851;
			int i_1719_ = i_1714_ - i_1718_;
			int i_1720_ = 0;
			if (i_1710_ < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_1721_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_1710_);
				i_1717_ -= i_1721_;
				i_1710_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_1716_ += i_1721_ * i_1718_;
				i_1715_ += i_1721_ * i_1714_;
			}
			if (i_1710_ + i_1717_ > (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_1717_ -= (i_1710_ + i_1717_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_1722_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_1718_ -= i_1722_;
				i = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_1716_ += i_1722_;
				i_1715_ += i_1722_;
				i_1720_ += i_1722_;
				i_1719_ += i_1722_;
			}
			if (i + i_1718_ > (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_1723_ = (i + i_1718_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_1718_ -= i_1723_;
				i_1720_ += i_1723_;
				i_1719_ += i_1723_;
			}
			if (i_1718_ > 0 && i_1717_ > 0) {
				if (i_1713_ == 0) {
					if (i_1711_ == 1) {
						for (int i_1724_ = -i_1717_; i_1724_ < 0; i_1724_++) {
							int i_1725_ = i_1715_ + i_1718_ - 3;
							while (i_1715_ < i_1725_) {
								is[i_1715_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								is[i_1715_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								is[i_1715_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								is[i_1715_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
							}
							i_1725_ += 3;
							while (i_1715_ < i_1725_)
								is[i_1715_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
							i_1715_ += i_1719_;
							i_1716_ += i_1720_;
						}
					} else if (i_1711_ == 0) {
						int i_1726_ = (i_1712_ & 0xff0000) >> 16;
						int i_1727_ = (i_1712_ & 0xff00) >> 8;
						int i_1728_ = i_1712_ & 0xff;
						for (int i_1729_ = -i_1717_; i_1729_ < 0; i_1729_++) {
							for (int i_1730_ = -i_1718_; i_1730_ < 0; i_1730_++) {
								int i_1731_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								int i_1732_ = ((i_1731_ & 0xff0000) * i_1726_ & ~0xffffff);
								int i_1733_ = (i_1731_ & 0xff00) * i_1727_ & 0xff0000;
								int i_1734_ = (i_1731_ & 0xff) * i_1728_ & 0xff00;
								is[i_1715_++] = (i_1732_ | i_1733_ | i_1734_) >>> 8;
							}
							i_1715_ += i_1719_;
							i_1716_ += i_1720_;
						}
					} else if (i_1711_ == 3) {
						for (int i_1735_ = -i_1717_; i_1735_ < 0; i_1735_++) {
							for (int i_1736_ = -i_1718_; i_1736_ < 0; i_1736_++) {
								int i_1737_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								int i_1738_ = i_1737_ + i_1712_;
								int i_1739_ = ((i_1737_ & 0xff00ff) + (i_1712_ & 0xff00ff));
								int i_1740_ = ((i_1739_ & 0x1000100) + (i_1738_ - i_1739_ & 0x10000));
								is[i_1715_++] = i_1738_ - i_1740_ | i_1740_ - (i_1740_ >>> 8);
							}
							i_1715_ += i_1719_;
							i_1716_ += i_1720_;
						}
					} else if (i_1711_ == 2) {
						int i_1741_ = i_1712_ >>> 24;
						int i_1742_ = 256 - i_1741_;
						int i_1743_ = (i_1712_ & 0xff00ff) * i_1742_ & ~0xff00ff;
						int i_1744_ = (i_1712_ & 0xff00) * i_1742_ & 0xff0000;
						i_1712_ = (i_1743_ | i_1744_) >>> 8;
						for (int i_1745_ = -i_1717_; i_1745_ < 0; i_1745_++) {
							for (int i_1746_ = -i_1718_; i_1746_ < 0; i_1746_++) {
								int i_1747_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								i_1743_ = ((i_1747_ & 0xff00ff) * i_1741_ & ~0xff00ff);
								i_1744_ = (i_1747_ & 0xff00) * i_1741_ & 0xff0000;
								is[i_1715_++] = ((i_1743_ | i_1744_) >>> 8) + i_1712_;
							}
							i_1715_ += i_1719_;
							i_1716_ += i_1720_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1713_ == 1) {
					if (i_1711_ == 1) {
						for (int i_1748_ = -i_1717_; i_1748_ < 0; i_1748_++) {
							int i_1749_ = i_1715_ + i_1718_ - 3;
							while (i_1715_ < i_1749_) {
								int i_1750_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								if (i_1750_ != 0)
									is[i_1715_++] = i_1750_;
								else
									i_1715_++;
								i_1750_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								if (i_1750_ != 0)
									is[i_1715_++] = i_1750_;
								else
									i_1715_++;
								i_1750_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								if (i_1750_ != 0)
									is[i_1715_++] = i_1750_;
								else
									i_1715_++;
								i_1750_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								if (i_1750_ != 0)
									is[i_1715_++] = i_1750_;
								else
									i_1715_++;
							}
							i_1749_ += 3;
							while (i_1715_ < i_1749_) {
								int i_1751_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								if (i_1751_ != 0)
									is[i_1715_++] = i_1751_;
								else
									i_1715_++;
							}
							i_1715_ += i_1719_;
							i_1716_ += i_1720_;
						}
					} else if (i_1711_ == 0) {
						if ((i_1712_ & 0xffffff) == 16777215) {
							int i_1752_ = i_1712_ >>> 24;
							int i_1753_ = 256 - i_1752_;
							for (int i_1754_ = -i_1717_; i_1754_ < 0; i_1754_++) {
								for (int i_1755_ = -i_1718_; i_1755_ < 0; i_1755_++) {
									int i_1756_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
									if (i_1756_ != 0) {
										int i_1757_ = is[i_1715_];
										is[i_1715_++] = ((((i_1756_ & 0xff00ff) * i_1752_ + ((i_1757_ & 0xff00ff) * i_1753_)) & ~0xff00ff) + (((i_1756_ & 0xff00) * i_1752_ + ((i_1757_ & 0xff00) * i_1753_)) & 0xff0000)) >> 8;
									} else
										i_1715_++;
								}
								i_1715_ += i_1719_;
								i_1716_ += i_1720_;
							}
						} else {
							int i_1758_ = (i_1712_ & 0xff0000) >> 16;
							int i_1759_ = (i_1712_ & 0xff00) >> 8;
							int i_1760_ = i_1712_ & 0xff;
							int i_1761_ = i_1712_ >>> 24;
							int i_1762_ = 256 - i_1761_;
							for (int i_1763_ = -i_1717_; i_1763_ < 0; i_1763_++) {
								for (int i_1764_ = -i_1718_; i_1764_ < 0; i_1764_++) {
									int i_1765_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
									if (i_1765_ != 0) {
										if (i_1761_ != 255) {
											int i_1766_ = (((i_1765_ & 0xff0000) * i_1758_) & ~0xffffff);
											int i_1767_ = ((i_1765_ & 0xff00) * i_1759_ & 0xff0000);
											int i_1768_ = ((i_1765_ & 0xff) * i_1760_ & 0xff00);
											i_1765_ = (i_1766_ | i_1767_ | i_1768_) >>> 8;
											int i_1769_ = is[i_1715_];
											is[i_1715_++] = (((((i_1765_ & 0xff00ff) * i_1761_) + ((i_1769_ & 0xff00ff) * i_1762_)) & ~0xff00ff) + ((((i_1765_ & 0xff00) * i_1761_) + ((i_1769_ & 0xff00) * i_1762_)) & 0xff0000)) >> 8;
										} else {
											int i_1770_ = (((i_1765_ & 0xff0000) * i_1758_) & ~0xffffff);
											int i_1771_ = ((i_1765_ & 0xff00) * i_1759_ & 0xff0000);
											int i_1772_ = ((i_1765_ & 0xff) * i_1760_ & 0xff00);
											is[i_1715_++] = (i_1770_ | i_1771_ | i_1772_) >>> 8;
										}
									} else
										i_1715_++;
								}
								i_1715_ += i_1719_;
								i_1716_ += i_1720_;
							}
						}
					} else if (i_1711_ == 3) {
						int i_1773_ = i_1712_ >>> 24;
						int i_1774_ = 256 - i_1773_;
						for (int i_1775_ = -i_1717_; i_1775_ < 0; i_1775_++) {
							for (int i_1776_ = -i_1718_; i_1776_ < 0; i_1776_++) {
								int i_1777_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								int i_1778_ = i_1777_ + i_1712_;
								int i_1779_ = ((i_1777_ & 0xff00ff) + (i_1712_ & 0xff00ff));
								int i_1780_ = ((i_1779_ & 0x1000100) + (i_1778_ - i_1779_ & 0x10000));
								i_1780_ = i_1778_ - i_1780_ | i_1780_ - (i_1780_ >>> 8);
								if (i_1777_ == 0 && i_1773_ != 255) {
									i_1777_ = i_1780_;
									i_1780_ = is[i_1715_];
									i_1780_ = ((((i_1777_ & 0xff00ff) * i_1773_ + (i_1780_ & 0xff00ff) * i_1774_) & ~0xff00ff) + (((i_1777_ & 0xff00) * i_1773_ + (i_1780_ & 0xff00) * i_1774_) & 0xff0000)) >> 8;
								}
								is[i_1715_++] = i_1780_;
							}
							i_1715_ += i_1719_;
							i_1716_ += i_1720_;
						}
					} else if (i_1711_ == 2) {
						int i_1781_ = i_1712_ >>> 24;
						int i_1782_ = 256 - i_1781_;
						int i_1783_ = (i_1712_ & 0xff00ff) * i_1782_ & ~0xff00ff;
						int i_1784_ = (i_1712_ & 0xff00) * i_1782_ & 0xff0000;
						i_1712_ = (i_1783_ | i_1784_) >>> 8;
						for (int i_1785_ = -i_1717_; i_1785_ < 0; i_1785_++) {
							for (int i_1786_ = -i_1718_; i_1786_ < 0; i_1786_++) {
								int i_1787_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								if (i_1787_ != 0) {
									i_1783_ = ((i_1787_ & 0xff00ff) * i_1781_ & ~0xff00ff);
									i_1784_ = ((i_1787_ & 0xff00) * i_1781_ & 0xff0000);
									is[i_1715_++] = ((i_1783_ | i_1784_) >>> 8) + i_1712_;
								} else
									i_1715_++;
							}
							i_1715_ += i_1719_;
							i_1716_ += i_1720_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1713_ == 2) {
					if (i_1711_ == 1) {
						for (int i_1788_ = -i_1717_; i_1788_ < 0; i_1788_++) {
							for (int i_1789_ = -i_1718_; i_1789_ < 0; i_1789_++) {
								int i_1790_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								if (i_1790_ != 0) {
									int i_1791_ = is[i_1715_];
									int i_1792_ = i_1790_ + i_1791_;
									int i_1793_ = ((i_1790_ & 0xff00ff) + (i_1791_ & 0xff00ff));
									i_1791_ = ((i_1793_ & 0x1000100) + (i_1792_ - i_1793_ & 0x10000));
									is[i_1715_++] = (i_1792_ - i_1791_ | i_1791_ - (i_1791_ >>> 8));
								} else
									i_1715_++;
							}
							i_1715_ += i_1719_;
							i_1716_ += i_1720_;
						}
					} else if (i_1711_ == 0) {
						int i_1794_ = (i_1712_ & 0xff0000) >> 16;
						int i_1795_ = (i_1712_ & 0xff00) >> 8;
						int i_1796_ = i_1712_ & 0xff;
						for (int i_1797_ = -i_1717_; i_1797_ < 0; i_1797_++) {
							for (int i_1798_ = -i_1718_; i_1798_ < 0; i_1798_++) {
								int i_1799_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								if (i_1799_ != 0) {
									int i_1800_ = ((i_1799_ & 0xff0000) * i_1794_ & ~0xffffff);
									int i_1801_ = ((i_1799_ & 0xff00) * i_1795_ & 0xff0000);
									int i_1802_ = (i_1799_ & 0xff) * i_1796_ & 0xff00;
									i_1799_ = (i_1800_ | i_1801_ | i_1802_) >>> 8;
									int i_1803_ = is[i_1715_];
									int i_1804_ = i_1799_ + i_1803_;
									int i_1805_ = ((i_1799_ & 0xff00ff) + (i_1803_ & 0xff00ff));
									i_1803_ = ((i_1805_ & 0x1000100) + (i_1804_ - i_1805_ & 0x10000));
									is[i_1715_++] = (i_1804_ - i_1803_ | i_1803_ - (i_1803_ >>> 8));
								} else
									i_1715_++;
							}
							i_1715_ += i_1719_;
							i_1716_ += i_1720_;
						}
					} else if (i_1711_ == 3) {
						for (int i_1806_ = -i_1717_; i_1806_ < 0; i_1806_++) {
							for (int i_1807_ = -i_1718_; i_1807_ < 0; i_1807_++) {
								int i_1808_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								int i_1809_ = i_1808_ + i_1712_;
								int i_1810_ = ((i_1808_ & 0xff00ff) + (i_1712_ & 0xff00ff));
								int i_1811_ = ((i_1810_ & 0x1000100) + (i_1809_ - i_1810_ & 0x10000));
								i_1808_ = i_1809_ - i_1811_ | i_1811_ - (i_1811_ >>> 8);
								i_1811_ = is[i_1715_];
								i_1809_ = i_1808_ + i_1811_;
								i_1810_ = (i_1808_ & 0xff00ff) + (i_1811_ & 0xff00ff);
								i_1811_ = ((i_1810_ & 0x1000100) + (i_1809_ - i_1810_ & 0x10000));
								is[i_1715_++] = i_1809_ - i_1811_ | i_1811_ - (i_1811_ >>> 8);
							}
							i_1715_ += i_1719_;
							i_1716_ += i_1720_;
						}
					} else if (i_1711_ == 2) {
						int i_1812_ = i_1712_ >>> 24;
						int i_1813_ = 256 - i_1812_;
						int i_1814_ = (i_1712_ & 0xff00ff) * i_1813_ & ~0xff00ff;
						int i_1815_ = (i_1712_ & 0xff00) * i_1813_ & 0xff0000;
						i_1712_ = (i_1814_ | i_1815_) >>> 8;
						for (int i_1816_ = -i_1717_; i_1816_ < 0; i_1816_++) {
							for (int i_1817_ = -i_1718_; i_1817_ < 0; i_1817_++) {
								int i_1818_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1716_++]);
								if (i_1818_ != 0) {
									i_1814_ = ((i_1818_ & 0xff00ff) * i_1812_ & ~0xff00ff);
									i_1815_ = ((i_1818_ & 0xff00) * i_1812_ & 0xff0000);
									i_1818_ = (((i_1814_ | i_1815_) >>> 8) + i_1712_);
									int i_1819_ = is[i_1715_];
									int i_1820_ = i_1818_ + i_1819_;
									int i_1821_ = ((i_1818_ & 0xff00ff) + (i_1819_ & 0xff00ff));
									i_1819_ = ((i_1821_ & 0x1000100) + (i_1820_ - i_1821_ & 0x10000));
									is[i_1715_++] = (i_1820_ - i_1819_ | i_1819_ - (i_1819_ >>> 8));
								} else
									i_1715_++;
							}
							i_1715_ += i_1719_;
							i_1716_ += i_1720_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method14250(int[] is, int[] is_1822_, int i, int i_1823_) {
		int[] is_1824_ = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
		if (is_1824_ != null) {
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					int i_1825_ = anInt8864;
					while (i_1825_ < 0) {
						int i_1826_ = i_1825_ + i_1823_;
						if (i_1826_ >= 0) {
							if (i_1826_ >= is.length)
								break;
							int i_1827_ = anInt8870;
							int i_1828_ = anInt8873;
							int i_1829_ = anInt8874;
							int i_1830_ = anInt8862;
							if (i_1828_ >= 0 && i_1829_ >= 0 && (i_1828_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12)) < 0 && (i_1829_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12)) < 0) {
								int i_1831_ = is[i_1826_] - i;
								int i_1832_ = -is_1822_[i_1826_];
								int i_1833_ = i_1831_ - (i_1827_ - anInt8870);
								if (i_1833_ > 0) {
									i_1827_ += i_1833_;
									i_1830_ += i_1833_;
									i_1828_ += anInt8865 * i_1833_;
									i_1829_ += anInt8868 * i_1833_;
								} else
									i_1832_ -= i_1833_;
								if (i_1830_ < i_1832_)
									i_1830_ = i_1832_;
								for (/**/; i_1830_ < 0; i_1830_++) {
									int i_1834_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(((i_1829_ >> 12) * (((Class160_Sub1_Sub1) this).anInt8851)) + (i_1828_ >> 12))]);
									if (i_1834_ != 0)
										is_1824_[i_1827_++] = i_1834_;
									else
										i_1827_++;
								}
							}
						}
						i_1825_++;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_1835_ = anInt8864;
					while (i_1835_ < 0) {
						int i_1836_ = i_1835_ + i_1823_;
						if (i_1836_ >= 0) {
							if (i_1836_ >= is.length)
								break;
							int i_1837_ = anInt8870;
							int i_1838_ = anInt8873;
							int i_1839_ = anInt8874 + anInt8866;
							int i_1840_ = anInt8862;
							if (i_1838_ >= 0 && (i_1838_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12)) < 0) {
								int i_1841_;
								if ((i_1841_ = i_1839_ - ((((Class160_Sub1_Sub1) this).anInt8867) << 12)) >= 0) {
									i_1841_ = (anInt8868 - i_1841_) / anInt8868;
									i_1840_ += i_1841_;
									i_1839_ += anInt8868 * i_1841_;
									i_1837_ += i_1841_;
								}
								if ((i_1841_ = (i_1839_ - anInt8868) / anInt8868) > i_1840_)
									i_1840_ = i_1841_;
								int i_1842_ = is[i_1836_] - i;
								int i_1843_ = -is_1822_[i_1836_];
								int i_1844_ = i_1842_ - (i_1837_ - anInt8870);
								if (i_1844_ > 0) {
									i_1837_ += i_1844_;
									i_1840_ += i_1844_;
									i_1838_ += anInt8865 * i_1844_;
									i_1839_ += anInt8868 * i_1844_;
								} else
									i_1843_ -= i_1844_;
								if (i_1840_ < i_1843_)
									i_1840_ = i_1843_;
								for (/**/; i_1840_ < 0; i_1840_++) {
									int i_1845_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(((i_1839_ >> 12) * (((Class160_Sub1_Sub1) this).anInt8851)) + (i_1838_ >> 12))]);
									if (i_1845_ != 0)
										is_1824_[i_1837_++] = i_1845_;
									else
										i_1837_++;
									i_1839_ += anInt8868;
								}
							}
						}
						i_1835_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				} else {
					int i_1846_ = anInt8864;
					while (i_1846_ < 0) {
						int i_1847_ = i_1846_ + i_1823_;
						if (i_1847_ >= 0) {
							if (i_1847_ >= is.length)
								break;
							int i_1848_ = anInt8870;
							int i_1849_ = anInt8873;
							int i_1850_ = anInt8874 + anInt8866;
							int i_1851_ = anInt8862;
							if (i_1849_ >= 0 && (i_1849_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12)) < 0) {
								if (i_1850_ < 0) {
									int i_1852_ = ((anInt8868 - 1 - i_1850_) / anInt8868);
									i_1851_ += i_1852_;
									i_1850_ += anInt8868 * i_1852_;
									i_1848_ += i_1852_;
								}
								int i_1853_;
								if ((i_1853_ = (1 + i_1850_ - ((((Class160_Sub1_Sub1) this).anInt8867) << 12) - anInt8868) / anInt8868) > i_1851_)
									i_1851_ = i_1853_;
								int i_1854_ = is[i_1847_] - i;
								int i_1855_ = -is_1822_[i_1847_];
								int i_1856_ = i_1854_ - (i_1848_ - anInt8870);
								if (i_1856_ > 0) {
									i_1848_ += i_1856_;
									i_1851_ += i_1856_;
									i_1849_ += anInt8865 * i_1856_;
									i_1850_ += anInt8868 * i_1856_;
								} else
									i_1855_ -= i_1856_;
								if (i_1851_ < i_1855_)
									i_1851_ = i_1855_;
								for (/**/; i_1851_ < 0; i_1851_++) {
									int i_1857_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(((i_1850_ >> 12) * (((Class160_Sub1_Sub1) this).anInt8851)) + (i_1849_ >> 12))]);
									if (i_1857_ != 0)
										is_1824_[i_1848_++] = i_1857_;
									else
										i_1848_++;
									i_1850_ += anInt8868;
								}
							}
						}
						i_1846_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					int i_1858_ = anInt8864;
					while (i_1858_ < 0) {
						int i_1859_ = i_1858_ + i_1823_;
						if (i_1859_ >= 0) {
							if (i_1859_ >= is.length)
								break;
							int i_1860_ = anInt8870;
							int i_1861_ = anInt8873 + anInt8858;
							int i_1862_ = anInt8874;
							int i_1863_ = anInt8862;
							if (i_1862_ >= 0 && (i_1862_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12)) < 0) {
								int i_1864_;
								if ((i_1864_ = i_1861_ - ((((Class160_Sub1_Sub1) this).anInt8851) << 12)) >= 0) {
									i_1864_ = (anInt8865 - i_1864_) / anInt8865;
									i_1863_ += i_1864_;
									i_1861_ += anInt8865 * i_1864_;
									i_1860_ += i_1864_;
								}
								if ((i_1864_ = (i_1861_ - anInt8865) / anInt8865) > i_1863_)
									i_1863_ = i_1864_;
								int i_1865_ = is[i_1859_] - i;
								int i_1866_ = -is_1822_[i_1859_];
								int i_1867_ = i_1865_ - (i_1860_ - anInt8870);
								if (i_1867_ > 0) {
									i_1860_ += i_1867_;
									i_1863_ += i_1867_;
									i_1861_ += anInt8865 * i_1867_;
									i_1862_ += anInt8868 * i_1867_;
								} else
									i_1866_ -= i_1867_;
								if (i_1863_ < i_1866_)
									i_1863_ = i_1866_;
								for (/**/; i_1863_ < 0; i_1863_++) {
									int i_1868_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(((i_1862_ >> 12) * (((Class160_Sub1_Sub1) this).anInt8851)) + (i_1861_ >> 12))]);
									if (i_1868_ != 0)
										is_1824_[i_1860_++] = i_1868_;
									else
										i_1860_++;
									i_1861_ += anInt8865;
								}
							}
						}
						i_1858_++;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_1869_ = anInt8864;
					while (i_1869_ < 0) {
						int i_1870_ = i_1869_ + i_1823_;
						if (i_1870_ >= 0) {
							if (i_1870_ >= is.length)
								break;
							int i_1871_ = anInt8870;
							int i_1872_ = anInt8873 + anInt8858;
							int i_1873_ = anInt8874 + anInt8866;
							int i_1874_ = anInt8862;
							int i_1875_;
							if ((i_1875_ = (i_1872_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12))) >= 0) {
								i_1875_ = (anInt8865 - i_1875_) / anInt8865;
								i_1874_ += i_1875_;
								i_1872_ += anInt8865 * i_1875_;
								i_1873_ += anInt8868 * i_1875_;
								i_1871_ += i_1875_;
							}
							if ((i_1875_ = (i_1872_ - anInt8865) / anInt8865) > i_1874_)
								i_1874_ = i_1875_;
							if ((i_1875_ = (i_1873_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12))) >= 0) {
								i_1875_ = (anInt8868 - i_1875_) / anInt8868;
								i_1874_ += i_1875_;
								i_1872_ += anInt8865 * i_1875_;
								i_1873_ += anInt8868 * i_1875_;
								i_1871_ += i_1875_;
							}
							if ((i_1875_ = (i_1873_ - anInt8868) / anInt8868) > i_1874_)
								i_1874_ = i_1875_;
							int i_1876_ = is[i_1870_] - i;
							int i_1877_ = -is_1822_[i_1870_];
							int i_1878_ = i_1876_ - (i_1871_ - anInt8870);
							if (i_1878_ > 0) {
								i_1871_ += i_1878_;
								i_1874_ += i_1878_;
								i_1872_ += anInt8865 * i_1878_;
								i_1873_ += anInt8868 * i_1878_;
							} else
								i_1877_ -= i_1878_;
							if (i_1874_ < i_1877_)
								i_1874_ = i_1877_;
							for (/**/; i_1874_ < 0; i_1874_++) {
								int i_1879_ = (((Class160_Sub1_Sub1) this).anIntArray10201[((i_1873_ >> 12) * (((Class160_Sub1_Sub1) this).anInt8851)) + (i_1872_ >> 12)]);
								if (i_1879_ != 0)
									is_1824_[i_1871_++] = i_1879_;
								else
									i_1871_++;
								i_1872_ += anInt8865;
								i_1873_ += anInt8868;
							}
						}
						i_1869_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else {
					int i_1880_ = anInt8864;
					while (i_1880_ < 0) {
						int i_1881_ = i_1880_ + i_1823_;
						if (i_1881_ >= 0) {
							if (i_1881_ >= is.length)
								break;
							int i_1882_ = anInt8870;
							int i_1883_ = anInt8873 + anInt8858;
							int i_1884_ = anInt8874 + anInt8866;
							int i_1885_ = anInt8862;
							int i_1886_;
							if ((i_1886_ = (i_1883_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12))) >= 0) {
								i_1886_ = (anInt8865 - i_1886_) / anInt8865;
								i_1885_ += i_1886_;
								i_1883_ += anInt8865 * i_1886_;
								i_1884_ += anInt8868 * i_1886_;
								i_1882_ += i_1886_;
							}
							if ((i_1886_ = (i_1883_ - anInt8865) / anInt8865) > i_1885_)
								i_1885_ = i_1886_;
							if (i_1884_ < 0) {
								i_1886_ = (anInt8868 - 1 - i_1884_) / anInt8868;
								i_1885_ += i_1886_;
								i_1883_ += anInt8865 * i_1886_;
								i_1884_ += anInt8868 * i_1886_;
								i_1882_ += i_1886_;
							}
							if ((i_1886_ = (1 + i_1884_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_1885_)
								i_1885_ = i_1886_;
							int i_1887_ = is[i_1881_] - i;
							int i_1888_ = -is_1822_[i_1881_];
							int i_1889_ = i_1887_ - (i_1882_ - anInt8870);
							if (i_1889_ > 0) {
								i_1882_ += i_1889_;
								i_1885_ += i_1889_;
								i_1883_ += anInt8865 * i_1889_;
								i_1884_ += anInt8868 * i_1889_;
							} else
								i_1888_ -= i_1889_;
							if (i_1885_ < i_1888_)
								i_1885_ = i_1888_;
							for (/**/; i_1885_ < 0; i_1885_++) {
								int i_1890_ = (((Class160_Sub1_Sub1) this).anIntArray10201[((i_1884_ >> 12) * (((Class160_Sub1_Sub1) this).anInt8851)) + (i_1883_ >> 12)]);
								if (i_1890_ != 0)
									is_1824_[i_1882_++] = i_1890_;
								else
									i_1882_++;
								i_1883_ += anInt8865;
								i_1884_ += anInt8868;
							}
						}
						i_1880_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8868 == 0) {
				int i_1891_ = anInt8864;
				while (i_1891_ < 0) {
					int i_1892_ = i_1891_ + i_1823_;
					if (i_1892_ >= 0) {
						if (i_1892_ >= is.length)
							break;
						int i_1893_ = anInt8870;
						int i_1894_ = anInt8873 + anInt8858;
						int i_1895_ = anInt8874;
						int i_1896_ = anInt8862;
						if (i_1895_ >= 0 && i_1895_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) < 0) {
							if (i_1894_ < 0) {
								int i_1897_ = (anInt8865 - 1 - i_1894_) / anInt8865;
								i_1896_ += i_1897_;
								i_1894_ += anInt8865 * i_1897_;
								i_1893_ += i_1897_;
							}
							int i_1898_;
							if ((i_1898_ = (1 + i_1894_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1896_)
								i_1896_ = i_1898_;
							int i_1899_ = is[i_1892_] - i;
							int i_1900_ = -is_1822_[i_1892_];
							int i_1901_ = i_1899_ - (i_1893_ - anInt8870);
							if (i_1901_ > 0) {
								i_1893_ += i_1901_;
								i_1896_ += i_1901_;
								i_1894_ += anInt8865 * i_1901_;
								i_1895_ += anInt8868 * i_1901_;
							} else
								i_1900_ -= i_1901_;
							if (i_1896_ < i_1900_)
								i_1896_ = i_1900_;
							for (/**/; i_1896_ < 0; i_1896_++) {
								int i_1902_ = (((Class160_Sub1_Sub1) this).anIntArray10201[((i_1895_ >> 12) * (((Class160_Sub1_Sub1) this).anInt8851)) + (i_1894_ >> 12)]);
								if (i_1902_ != 0)
									is_1824_[i_1893_++] = i_1902_;
								else
									i_1893_++;
								i_1894_ += anInt8865;
							}
						}
					}
					i_1891_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else if (anInt8868 < 0) {
				int i_1903_ = anInt8864;
				while (i_1903_ < 0) {
					int i_1904_ = i_1903_ + i_1823_;
					if (i_1904_ >= 0) {
						if (i_1904_ >= is.length)
							break;
						int i_1905_ = anInt8870;
						int i_1906_ = anInt8873 + anInt8858;
						int i_1907_ = anInt8874 + anInt8866;
						int i_1908_ = anInt8862;
						if (i_1906_ < 0) {
							int i_1909_ = (anInt8865 - 1 - i_1906_) / anInt8865;
							i_1908_ += i_1909_;
							i_1906_ += anInt8865 * i_1909_;
							i_1907_ += anInt8868 * i_1909_;
							i_1905_ += i_1909_;
						}
						int i_1910_;
						if ((i_1910_ = (1 + i_1906_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1908_)
							i_1908_ = i_1910_;
						if ((i_1910_ = i_1907_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12)) >= 0) {
							i_1910_ = (anInt8868 - i_1910_) / anInt8868;
							i_1908_ += i_1910_;
							i_1906_ += anInt8865 * i_1910_;
							i_1907_ += anInt8868 * i_1910_;
							i_1905_ += i_1910_;
						}
						if ((i_1910_ = (i_1907_ - anInt8868) / anInt8868) > i_1908_)
							i_1908_ = i_1910_;
						int i_1911_ = is[i_1904_] - i;
						int i_1912_ = -is_1822_[i_1904_];
						int i_1913_ = i_1911_ - (i_1905_ - anInt8870);
						if (i_1913_ > 0) {
							i_1905_ += i_1913_;
							i_1908_ += i_1913_;
							i_1906_ += anInt8865 * i_1913_;
							i_1907_ += anInt8868 * i_1913_;
						} else
							i_1912_ -= i_1913_;
						if (i_1908_ < i_1912_)
							i_1908_ = i_1912_;
						for (/**/; i_1908_ < 0; i_1908_++) {
							int i_1914_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(((i_1907_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_1906_ >> 12))]);
							if (i_1914_ != 0)
								is_1824_[i_1905_++] = i_1914_;
							else
								i_1905_++;
							i_1906_ += anInt8865;
							i_1907_ += anInt8868;
						}
					}
					i_1903_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else {
				int i_1915_ = anInt8864;
				while (i_1915_ < 0) {
					int i_1916_ = i_1915_ + i_1823_;
					if (i_1916_ >= 0) {
						if (i_1916_ >= is.length)
							break;
						int i_1917_ = anInt8870;
						int i_1918_ = anInt8873 + anInt8858;
						int i_1919_ = anInt8874 + anInt8866;
						int i_1920_ = anInt8862;
						if (i_1918_ < 0) {
							int i_1921_ = (anInt8865 - 1 - i_1918_) / anInt8865;
							i_1920_ += i_1921_;
							i_1918_ += anInt8865 * i_1921_;
							i_1919_ += anInt8868 * i_1921_;
							i_1917_ += i_1921_;
						}
						int i_1922_;
						if ((i_1922_ = (1 + i_1918_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1920_)
							i_1920_ = i_1922_;
						if (i_1919_ < 0) {
							i_1922_ = (anInt8868 - 1 - i_1919_) / anInt8868;
							i_1920_ += i_1922_;
							i_1918_ += anInt8865 * i_1922_;
							i_1919_ += anInt8868 * i_1922_;
							i_1917_ += i_1922_;
						}
						if ((i_1922_ = (1 + i_1919_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_1920_)
							i_1920_ = i_1922_;
						int i_1923_ = is[i_1916_] - i;
						int i_1924_ = -is_1822_[i_1916_];
						int i_1925_ = i_1923_ - (i_1917_ - anInt8870);
						if (i_1925_ > 0) {
							i_1917_ += i_1925_;
							i_1920_ += i_1925_;
							i_1918_ += anInt8865 * i_1925_;
							i_1919_ += anInt8868 * i_1925_;
						} else
							i_1924_ -= i_1925_;
						if (i_1920_ < i_1924_)
							i_1920_ = i_1924_;
						for (/**/; i_1920_ < 0; i_1920_++) {
							int i_1926_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(((i_1919_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_1918_ >> 12))]);
							if (i_1926_ != 0)
								is_1824_[i_1917_++] = i_1926_;
							else
								i_1917_++;
							i_1918_ += anInt8865;
							i_1919_ += anInt8868;
						}
					}
					i_1915_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			}
		}
	}

	public void method2768(int i, int i_1927_, int i_1928_, int i_1929_, int i_1930_, int i_1931_) {
		int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_1932_ = 0; i_1932_ < i_1929_; i_1932_++) {
			int i_1933_ = ((i_1927_ + i_1932_) * ((Class160_Sub1_Sub1) this).anInt8851 + i);
			int i_1934_ = (((i_1931_ + i_1932_) * (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i_1930_);
			for (int i_1935_ = 0; i_1935_ < i_1928_; i_1935_++)
				((Class160_Sub1_Sub1) this).anIntArray10201[i_1933_ + i_1935_] = is[i_1934_ + i_1935_];
		}
	}

	public void method2769(int i, int i_1936_, int i_1937_, int i_1938_, int i_1939_, int i_1940_) {
		int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_1941_ = 0; i_1941_ < i_1938_; i_1941_++) {
			int i_1942_ = ((i_1936_ + i_1941_) * ((Class160_Sub1_Sub1) this).anInt8851 + i);
			int i_1943_ = (((i_1940_ + i_1941_) * (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i_1939_);
			for (int i_1944_ = 0; i_1944_ < i_1937_; i_1944_++)
				((Class160_Sub1_Sub1) this).anIntArray10201[i_1942_ + i_1944_] = is[i_1943_ + i_1944_];
		}
	}

	public void method2770(int i, int i_1945_, int i_1946_) {
		throw new IllegalStateException("");
	}

	public void method2771(int i, int i_1947_, int i_1948_) {
		throw new IllegalStateException("");
	}

	public Interface9 method2801() {
		return new Class192(((Class160_Sub1_Sub1) this).anInt8851, ((Class160_Sub1_Sub1) this).anInt8867, ((Class160_Sub1_Sub1) this).anIntArray10201);
	}

	public void method2784(int i, int i_1949_, Class455 class455, int i_1950_, int i_1951_) {
		if (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			i += ((Class160_Sub1_Sub1) this).anInt8853;
			i_1949_ += ((Class160_Sub1_Sub1) this).anInt8854;
			int i_1952_ = 0;
			int i_1953_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			int i_1954_ = ((Class160_Sub1_Sub1) this).anInt8851;
			int i_1955_ = ((Class160_Sub1_Sub1) this).anInt8867;
			int i_1956_ = i_1953_ - i_1954_;
			int i_1957_ = 0;
			int i_1958_ = i + i_1949_ * i_1953_;
			if (i_1949_ < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_1959_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_1949_);
				i_1955_ -= i_1959_;
				i_1949_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_1952_ += i_1959_ * i_1954_;
				i_1958_ += i_1959_ * i_1953_;
			}
			if (i_1949_ + i_1955_ > (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_1955_ -= (i_1949_ + i_1955_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_1960_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_1954_ -= i_1960_;
				i = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_1952_ += i_1960_;
				i_1958_ += i_1960_;
				i_1957_ += i_1960_;
				i_1956_ += i_1960_;
			}
			if (i + i_1954_ > (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_1961_ = (i + i_1954_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_1954_ -= i_1961_;
				i_1957_ += i_1961_;
				i_1956_ += i_1961_;
			}
			if (i_1954_ > 0 && i_1955_ > 0) {
				PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
				int[] is_1962_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
				int[] is_1963_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
				int i_1964_ = i_1949_;
				if (i_1951_ > i_1964_) {
					i_1964_ = i_1951_;
					i_1958_ += (i_1951_ - i_1949_) * i_1953_;
					i_1952_ += ((i_1951_ - i_1949_) * ((Class160_Sub1_Sub1) this).anInt8851);
				}
				int i_1965_ = (i_1951_ + is_1962_.length < i_1949_ + i_1955_ ? i_1951_ + is_1962_.length : i_1949_ + i_1955_);
				for (int i_1966_ = i_1964_; i_1966_ < i_1965_; i_1966_++) {
					int i_1967_ = is_1962_[i_1966_ - i_1951_] + i_1950_;
					int i_1968_ = is_1963_[i_1966_ - i_1951_];
					int i_1969_ = i_1954_;
					if (i > i_1967_) {
						int i_1970_ = i - i_1967_;
						if (i_1970_ >= i_1968_) {
							i_1952_ += i_1954_ + i_1957_;
							i_1958_ += i_1954_ + i_1956_;
							continue;
						}
						i_1968_ -= i_1970_;
					} else {
						int i_1971_ = i_1967_ - i;
						if (i_1971_ >= i_1954_) {
							i_1952_ += i_1954_ + i_1957_;
							i_1958_ += i_1954_ + i_1956_;
							continue;
						}
						i_1952_ += i_1971_;
						i_1969_ -= i_1971_;
						i_1958_ += i_1971_;
					}
					int i_1972_ = 0;
					if (i_1969_ < i_1968_)
						i_1968_ = i_1969_;
					else
						i_1972_ = i_1969_ - i_1968_;
					for (int i_1973_ = -i_1968_; i_1973_ < 0; i_1973_++) {
						int i_1974_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1952_++]);
						if (i_1974_ != 0)
							is[i_1958_++] = i_1974_;
						else
							i_1958_++;
					}
					i_1952_ += i_1972_ + i_1957_;
					i_1958_ += i_1972_ + i_1956_;
				}
			}
		}
	}

	public void method2774(int i, int i_1975_, Class455 class455, int i_1976_, int i_1977_) {
		if (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			i += ((Class160_Sub1_Sub1) this).anInt8853;
			i_1975_ += ((Class160_Sub1_Sub1) this).anInt8854;
			int i_1978_ = 0;
			int i_1979_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			int i_1980_ = ((Class160_Sub1_Sub1) this).anInt8851;
			int i_1981_ = ((Class160_Sub1_Sub1) this).anInt8867;
			int i_1982_ = i_1979_ - i_1980_;
			int i_1983_ = 0;
			int i_1984_ = i + i_1975_ * i_1979_;
			if (i_1975_ < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_1985_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_1975_);
				i_1981_ -= i_1985_;
				i_1975_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_1978_ += i_1985_ * i_1980_;
				i_1984_ += i_1985_ * i_1979_;
			}
			if (i_1975_ + i_1981_ > (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_1981_ -= (i_1975_ + i_1981_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_1986_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_1980_ -= i_1986_;
				i = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_1978_ += i_1986_;
				i_1984_ += i_1986_;
				i_1983_ += i_1986_;
				i_1982_ += i_1986_;
			}
			if (i + i_1980_ > (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_1987_ = (i + i_1980_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_1980_ -= i_1987_;
				i_1983_ += i_1987_;
				i_1982_ += i_1987_;
			}
			if (i_1980_ > 0 && i_1981_ > 0) {
				PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
				int[] is_1988_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
				int[] is_1989_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
				int i_1990_ = i_1975_;
				if (i_1977_ > i_1990_) {
					i_1990_ = i_1977_;
					i_1984_ += (i_1977_ - i_1975_) * i_1979_;
					i_1978_ += ((i_1977_ - i_1975_) * ((Class160_Sub1_Sub1) this).anInt8851);
				}
				int i_1991_ = (i_1977_ + is_1988_.length < i_1975_ + i_1981_ ? i_1977_ + is_1988_.length : i_1975_ + i_1981_);
				for (int i_1992_ = i_1990_; i_1992_ < i_1991_; i_1992_++) {
					int i_1993_ = is_1988_[i_1992_ - i_1977_] + i_1976_;
					int i_1994_ = is_1989_[i_1992_ - i_1977_];
					int i_1995_ = i_1980_;
					if (i > i_1993_) {
						int i_1996_ = i - i_1993_;
						if (i_1996_ >= i_1994_) {
							i_1978_ += i_1980_ + i_1983_;
							i_1984_ += i_1980_ + i_1982_;
							continue;
						}
						i_1994_ -= i_1996_;
					} else {
						int i_1997_ = i_1993_ - i;
						if (i_1997_ >= i_1980_) {
							i_1978_ += i_1980_ + i_1983_;
							i_1984_ += i_1980_ + i_1982_;
							continue;
						}
						i_1978_ += i_1997_;
						i_1995_ -= i_1997_;
						i_1984_ += i_1997_;
					}
					int i_1998_ = 0;
					if (i_1995_ < i_1994_)
						i_1994_ = i_1995_;
					else
						i_1998_ = i_1995_ - i_1994_;
					for (int i_1999_ = -i_1994_; i_1999_ < 0; i_1999_++) {
						int i_2000_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_1978_++]);
						if (i_2000_ != 0)
							is[i_1984_++] = i_2000_;
						else
							i_1984_++;
					}
					i_1978_ += i_1998_ + i_1983_;
					i_1984_ += i_1998_ + i_1982_;
				}
			}
		}
	}

	void method2775(int i, int i_2001_, int i_2002_, int i_2003_, int i_2004_, int i_2005_, int i_2006_, int i_2007_) {
		if (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (i_2002_ > 0 && i_2003_ > 0) {
			int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
			if (is != null) {
				int i_2008_ = 0;
				int i_2009_ = 0;
				int i_2010_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				int i_2011_ = (((Class160_Sub1_Sub1) this).anInt8853 + ((Class160_Sub1_Sub1) this).anInt8851 + ((Class160_Sub1_Sub1) this).anInt8855);
				int i_2012_ = (((Class160_Sub1_Sub1) this).anInt8854 + ((Class160_Sub1_Sub1) this).anInt8867 + ((Class160_Sub1_Sub1) this).anInt8856);
				int i_2013_ = (i_2011_ << 16) / i_2002_;
				int i_2014_ = (i_2012_ << 16) / i_2003_;
				if (((Class160_Sub1_Sub1) this).anInt8853 > 0) {
					int i_2015_ = (((((Class160_Sub1_Sub1) this).anInt8853 << 16) + i_2013_ - 1) / i_2013_);
					i += i_2015_;
					i_2008_ += (i_2015_ * i_2013_ - (((Class160_Sub1_Sub1) this).anInt8853 << 16));
				}
				if (((Class160_Sub1_Sub1) this).anInt8854 > 0) {
					int i_2016_ = (((((Class160_Sub1_Sub1) this).anInt8854 << 16) + i_2014_ - 1) / i_2014_);
					i_2001_ += i_2016_;
					i_2009_ += (i_2016_ * i_2014_ - (((Class160_Sub1_Sub1) this).anInt8854 << 16));
				}
				if (((Class160_Sub1_Sub1) this).anInt8851 < i_2011_)
					i_2002_ = ((((Class160_Sub1_Sub1) this).anInt8851 << 16) - i_2008_ + i_2013_ - 1) / i_2013_;
				if (((Class160_Sub1_Sub1) this).anInt8867 < i_2012_)
					i_2003_ = ((((Class160_Sub1_Sub1) this).anInt8867 << 16) - i_2009_ + i_2014_ - 1) / i_2014_;
				int i_2017_ = i + i_2001_ * i_2010_;
				int i_2018_ = i_2010_ - i_2002_;
				if (i_2001_ + i_2003_ > (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8986 * 1383960921))
					i_2003_ -= (i_2001_ + i_2003_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
				if (i_2001_ < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009) * 1516535457) {
					int i_2019_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457) - i_2001_);
					i_2003_ -= i_2019_;
					i_2017_ += i_2019_ * i_2010_;
					i_2009_ += i_2014_ * i_2019_;
				}
				if (i + i_2002_ > (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002 * -1710988237)) {
					int i_2020_ = (i + i_2002_ - (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt9002) * -1710988237);
					i_2002_ -= i_2020_;
					i_2018_ += i_2020_;
				}
				if (i < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
					int i_2021_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989) - i);
					i_2002_ -= i_2021_;
					i_2017_ += i_2021_;
					i_2008_ += i_2013_ * i_2021_;
					i_2018_ += i_2021_;
				}
				if (i_2006_ == 0) {
					if (i_2004_ == 1) {
						int i_2022_ = i_2008_;
						for (int i_2023_ = -i_2003_; i_2023_ < 0; i_2023_++) {
							int i_2024_ = ((i_2009_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_2025_ = -i_2002_; i_2025_ < 0; i_2025_++) {
								is[i_2017_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2008_ >> 16) + i_2024_]);
								i_2008_ += i_2013_;
							}
							i_2009_ += i_2014_;
							i_2008_ = i_2022_;
							i_2017_ += i_2018_;
						}
					} else if (i_2004_ == 0) {
						int i_2026_ = (i_2005_ & 0xff0000) >> 16;
						int i_2027_ = (i_2005_ & 0xff00) >> 8;
						int i_2028_ = i_2005_ & 0xff;
						int i_2029_ = i_2008_;
						for (int i_2030_ = -i_2003_; i_2030_ < 0; i_2030_++) {
							int i_2031_ = ((i_2009_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_2032_ = -i_2002_; i_2032_ < 0; i_2032_++) {
								int i_2033_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2008_ >> 16) + i_2031_]);
								int i_2034_ = ((i_2033_ & 0xff0000) * i_2026_ & ~0xffffff);
								int i_2035_ = (i_2033_ & 0xff00) * i_2027_ & 0xff0000;
								int i_2036_ = (i_2033_ & 0xff) * i_2028_ & 0xff00;
								is[i_2017_++] = (i_2034_ | i_2035_ | i_2036_) >>> 8;
								i_2008_ += i_2013_;
							}
							i_2009_ += i_2014_;
							i_2008_ = i_2029_;
							i_2017_ += i_2018_;
						}
					} else if (i_2004_ == 3) {
						int i_2037_ = i_2008_;
						for (int i_2038_ = -i_2003_; i_2038_ < 0; i_2038_++) {
							int i_2039_ = ((i_2009_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_2040_ = -i_2002_; i_2040_ < 0; i_2040_++) {
								int i_2041_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2008_ >> 16) + i_2039_]);
								int i_2042_ = i_2041_ + i_2005_;
								int i_2043_ = ((i_2041_ & 0xff00ff) + (i_2005_ & 0xff00ff));
								int i_2044_ = ((i_2043_ & 0x1000100) + (i_2042_ - i_2043_ & 0x10000));
								is[i_2017_++] = i_2042_ - i_2044_ | i_2044_ - (i_2044_ >>> 8);
								i_2008_ += i_2013_;
							}
							i_2009_ += i_2014_;
							i_2008_ = i_2037_;
							i_2017_ += i_2018_;
						}
					} else if (i_2004_ == 2) {
						int i_2045_ = i_2005_ >>> 24;
						int i_2046_ = 256 - i_2045_;
						int i_2047_ = (i_2005_ & 0xff00ff) * i_2046_ & ~0xff00ff;
						int i_2048_ = (i_2005_ & 0xff00) * i_2046_ & 0xff0000;
						i_2005_ = (i_2047_ | i_2048_) >>> 8;
						int i_2049_ = i_2008_;
						for (int i_2050_ = -i_2003_; i_2050_ < 0; i_2050_++) {
							int i_2051_ = ((i_2009_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_2052_ = -i_2002_; i_2052_ < 0; i_2052_++) {
								int i_2053_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2008_ >> 16) + i_2051_]);
								i_2047_ = ((i_2053_ & 0xff00ff) * i_2045_ & ~0xff00ff);
								i_2048_ = (i_2053_ & 0xff00) * i_2045_ & 0xff0000;
								is[i_2017_++] = ((i_2047_ | i_2048_) >>> 8) + i_2005_;
								i_2008_ += i_2013_;
							}
							i_2009_ += i_2014_;
							i_2008_ = i_2049_;
							i_2017_ += i_2018_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2006_ == 1) {
					if (i_2004_ == 1) {
						int i_2054_ = i_2008_;
						for (int i_2055_ = -i_2003_; i_2055_ < 0; i_2055_++) {
							int i_2056_ = ((i_2009_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_2057_ = -i_2002_; i_2057_ < 0; i_2057_++) {
								int i_2058_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2008_ >> 16) + i_2056_]);
								if (i_2058_ != 0)
									is[i_2017_++] = i_2058_;
								else
									i_2017_++;
								i_2008_ += i_2013_;
							}
							i_2009_ += i_2014_;
							i_2008_ = i_2054_;
							i_2017_ += i_2018_;
						}
					} else if (i_2004_ == 0) {
						int i_2059_ = i_2008_;
						if ((i_2005_ & 0xffffff) == 16777215) {
							int i_2060_ = i_2005_ >>> 24;
							int i_2061_ = 256 - i_2060_;
							for (int i_2062_ = -i_2003_; i_2062_ < 0; i_2062_++) {
								int i_2063_ = ((i_2009_ >> 16) * (((Class160_Sub1_Sub1) this).anInt8851));
								for (int i_2064_ = -i_2002_; i_2064_ < 0; i_2064_++) {
									int i_2065_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2008_ >> 16) + i_2063_]);
									if (i_2065_ != 0) {
										int i_2066_ = is[i_2017_];
										is[i_2017_++] = ((((i_2065_ & 0xff00ff) * i_2060_ + ((i_2066_ & 0xff00ff) * i_2061_)) & ~0xff00ff) + (((i_2065_ & 0xff00) * i_2060_ + ((i_2066_ & 0xff00) * i_2061_)) & 0xff0000)) >> 8;
									} else
										i_2017_++;
									i_2008_ += i_2013_;
								}
								i_2009_ += i_2014_;
								i_2008_ = i_2059_;
								i_2017_ += i_2018_;
							}
						} else {
							int i_2067_ = (i_2005_ & 0xff0000) >> 16;
							int i_2068_ = (i_2005_ & 0xff00) >> 8;
							int i_2069_ = i_2005_ & 0xff;
							int i_2070_ = i_2005_ >>> 24;
							int i_2071_ = 256 - i_2070_;
							for (int i_2072_ = -i_2003_; i_2072_ < 0; i_2072_++) {
								int i_2073_ = ((i_2009_ >> 16) * (((Class160_Sub1_Sub1) this).anInt8851));
								for (int i_2074_ = -i_2002_; i_2074_ < 0; i_2074_++) {
									int i_2075_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2008_ >> 16) + i_2073_]);
									if (i_2075_ != 0) {
										if (i_2070_ != 255) {
											int i_2076_ = (((i_2075_ & 0xff0000) * i_2067_) & ~0xffffff);
											int i_2077_ = ((i_2075_ & 0xff00) * i_2068_ & 0xff0000);
											int i_2078_ = ((i_2075_ & 0xff) * i_2069_ & 0xff00);
											i_2075_ = (i_2076_ | i_2077_ | i_2078_) >>> 8;
											int i_2079_ = is[i_2017_];
											is[i_2017_++] = (((((i_2075_ & 0xff00ff) * i_2070_) + ((i_2079_ & 0xff00ff) * i_2071_)) & ~0xff00ff) + ((((i_2075_ & 0xff00) * i_2070_) + ((i_2079_ & 0xff00) * i_2071_)) & 0xff0000)) >> 8;
										} else {
											int i_2080_ = (((i_2075_ & 0xff0000) * i_2067_) & ~0xffffff);
											int i_2081_ = ((i_2075_ & 0xff00) * i_2068_ & 0xff0000);
											int i_2082_ = ((i_2075_ & 0xff) * i_2069_ & 0xff00);
											is[i_2017_++] = (i_2080_ | i_2081_ | i_2082_) >>> 8;
										}
									} else
										i_2017_++;
									i_2008_ += i_2013_;
								}
								i_2009_ += i_2014_;
								i_2008_ = i_2059_;
								i_2017_ += i_2018_;
							}
						}
					} else if (i_2004_ == 3) {
						int i_2083_ = i_2008_;
						int i_2084_ = i_2005_ >>> 24;
						int i_2085_ = 256 - i_2084_;
						for (int i_2086_ = -i_2003_; i_2086_ < 0; i_2086_++) {
							int i_2087_ = ((i_2009_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_2088_ = -i_2002_; i_2088_ < 0; i_2088_++) {
								int i_2089_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2008_ >> 16) + i_2087_]);
								int i_2090_ = i_2089_ + i_2005_;
								int i_2091_ = ((i_2089_ & 0xff00ff) + (i_2005_ & 0xff00ff));
								int i_2092_ = ((i_2091_ & 0x1000100) + (i_2090_ - i_2091_ & 0x10000));
								i_2092_ = i_2090_ - i_2092_ | i_2092_ - (i_2092_ >>> 8);
								if (i_2089_ == 0 && i_2084_ != 255) {
									i_2089_ = i_2092_;
									i_2092_ = is[i_2017_];
									i_2092_ = ((((i_2089_ & 0xff00ff) * i_2084_ + (i_2092_ & 0xff00ff) * i_2085_) & ~0xff00ff) + (((i_2089_ & 0xff00) * i_2084_ + (i_2092_ & 0xff00) * i_2085_) & 0xff0000)) >> 8;
								}
								is[i_2017_++] = i_2092_;
								i_2008_ += i_2013_;
							}
							i_2009_ += i_2014_;
							i_2008_ = i_2083_;
							i_2017_ += i_2018_;
						}
					} else if (i_2004_ == 2) {
						int i_2093_ = i_2005_ >>> 24;
						int i_2094_ = 256 - i_2093_;
						int i_2095_ = (i_2005_ & 0xff00ff) * i_2094_ & ~0xff00ff;
						int i_2096_ = (i_2005_ & 0xff00) * i_2094_ & 0xff0000;
						i_2005_ = (i_2095_ | i_2096_) >>> 8;
						int i_2097_ = i_2008_;
						for (int i_2098_ = -i_2003_; i_2098_ < 0; i_2098_++) {
							int i_2099_ = ((i_2009_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_2100_ = -i_2002_; i_2100_ < 0; i_2100_++) {
								int i_2101_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2008_ >> 16) + i_2099_]);
								if (i_2101_ != 0) {
									i_2095_ = ((i_2101_ & 0xff00ff) * i_2093_ & ~0xff00ff);
									i_2096_ = ((i_2101_ & 0xff00) * i_2093_ & 0xff0000);
									is[i_2017_++] = ((i_2095_ | i_2096_) >>> 8) + i_2005_;
								} else
									i_2017_++;
								i_2008_ += i_2013_;
							}
							i_2009_ += i_2014_;
							i_2008_ = i_2097_;
							i_2017_ += i_2018_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2006_ == 2) {
					if (i_2004_ == 1) {
						int i_2102_ = i_2008_;
						for (int i_2103_ = -i_2003_; i_2103_ < 0; i_2103_++) {
							int i_2104_ = ((i_2009_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_2105_ = -i_2002_; i_2105_ < 0; i_2105_++) {
								int i_2106_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2008_ >> 16) + i_2104_]);
								if (i_2106_ != 0) {
									int i_2107_ = is[i_2017_];
									int i_2108_ = i_2106_ + i_2107_;
									int i_2109_ = ((i_2106_ & 0xff00ff) + (i_2107_ & 0xff00ff));
									i_2107_ = ((i_2109_ & 0x1000100) + (i_2108_ - i_2109_ & 0x10000));
									is[i_2017_++] = (i_2108_ - i_2107_ | i_2107_ - (i_2107_ >>> 8));
								} else
									i_2017_++;
								i_2008_ += i_2013_;
							}
							i_2009_ += i_2014_;
							i_2008_ = i_2102_;
							i_2017_ += i_2018_;
						}
					} else if (i_2004_ == 0) {
						int i_2110_ = i_2008_;
						int i_2111_ = (i_2005_ & 0xff0000) >> 16;
						int i_2112_ = (i_2005_ & 0xff00) >> 8;
						int i_2113_ = i_2005_ & 0xff;
						for (int i_2114_ = -i_2003_; i_2114_ < 0; i_2114_++) {
							int i_2115_ = ((i_2009_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_2116_ = -i_2002_; i_2116_ < 0; i_2116_++) {
								int i_2117_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2008_ >> 16) + i_2115_]);
								if (i_2117_ != 0) {
									int i_2118_ = ((i_2117_ & 0xff0000) * i_2111_ & ~0xffffff);
									int i_2119_ = ((i_2117_ & 0xff00) * i_2112_ & 0xff0000);
									int i_2120_ = (i_2117_ & 0xff) * i_2113_ & 0xff00;
									i_2117_ = (i_2118_ | i_2119_ | i_2120_) >>> 8;
									int i_2121_ = is[i_2017_];
									int i_2122_ = i_2117_ + i_2121_;
									int i_2123_ = ((i_2117_ & 0xff00ff) + (i_2121_ & 0xff00ff));
									i_2121_ = ((i_2123_ & 0x1000100) + (i_2122_ - i_2123_ & 0x10000));
									is[i_2017_++] = (i_2122_ - i_2121_ | i_2121_ - (i_2121_ >>> 8));
								} else
									i_2017_++;
								i_2008_ += i_2013_;
							}
							i_2009_ += i_2014_;
							i_2008_ = i_2110_;
							i_2017_ += i_2018_;
						}
					} else if (i_2004_ == 3) {
						int i_2124_ = i_2008_;
						for (int i_2125_ = -i_2003_; i_2125_ < 0; i_2125_++) {
							int i_2126_ = ((i_2009_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_2127_ = -i_2002_; i_2127_ < 0; i_2127_++) {
								int i_2128_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2008_ >> 16) + i_2126_]);
								int i_2129_ = i_2128_ + i_2005_;
								int i_2130_ = ((i_2128_ & 0xff00ff) + (i_2005_ & 0xff00ff));
								int i_2131_ = ((i_2130_ & 0x1000100) + (i_2129_ - i_2130_ & 0x10000));
								i_2128_ = i_2129_ - i_2131_ | i_2131_ - (i_2131_ >>> 8);
								i_2131_ = is[i_2017_];
								i_2129_ = i_2128_ + i_2131_;
								i_2130_ = (i_2128_ & 0xff00ff) + (i_2131_ & 0xff00ff);
								i_2131_ = ((i_2130_ & 0x1000100) + (i_2129_ - i_2130_ & 0x10000));
								is[i_2017_++] = i_2129_ - i_2131_ | i_2131_ - (i_2131_ >>> 8);
								i_2008_ += i_2013_;
							}
							i_2009_ += i_2014_;
							i_2008_ = i_2124_;
							i_2017_ += i_2018_;
						}
					} else if (i_2004_ == 2) {
						int i_2132_ = i_2005_ >>> 24;
						int i_2133_ = 256 - i_2132_;
						int i_2134_ = (i_2005_ & 0xff00ff) * i_2133_ & ~0xff00ff;
						int i_2135_ = (i_2005_ & 0xff00) * i_2133_ & 0xff0000;
						i_2005_ = (i_2134_ | i_2135_) >>> 8;
						int i_2136_ = i_2008_;
						for (int i_2137_ = -i_2003_; i_2137_ < 0; i_2137_++) {
							int i_2138_ = ((i_2009_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_2139_ = -i_2002_; i_2139_ < 0; i_2139_++) {
								int i_2140_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2008_ >> 16) + i_2138_]);
								if (i_2140_ != 0) {
									i_2134_ = ((i_2140_ & 0xff00ff) * i_2132_ & ~0xff00ff);
									i_2135_ = ((i_2140_ & 0xff00) * i_2132_ & 0xff0000);
									i_2140_ = (((i_2134_ | i_2135_) >>> 8) + i_2005_);
									int i_2141_ = is[i_2017_];
									int i_2142_ = i_2140_ + i_2141_;
									int i_2143_ = ((i_2140_ & 0xff00ff) + (i_2141_ & 0xff00ff));
									i_2141_ = ((i_2143_ & 0x1000100) + (i_2142_ - i_2143_ & 0x10000));
									is[i_2017_++] = (i_2142_ - i_2141_ | i_2141_ - (i_2141_ >>> 8));
								} else
									i_2017_++;
								i_2008_ += i_2013_;
							}
							i_2009_ += i_2014_;
							i_2008_ = i_2136_;
							i_2017_ += i_2018_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method14255(boolean bool, boolean bool_2144_, boolean bool_2145_, int i, int i_2146_, float f, int i_2147_, int i_2148_, int i_2149_, int i_2150_, int i_2151_, int i_2152_, boolean bool_2153_) {
		if (i_2147_ > 0 && i_2148_ > 0 && (bool || bool_2144_)) {
			int i_2154_ = 0;
			int i_2155_ = 0;
			int i_2156_ = (((Class160_Sub1_Sub1) this).anInt8853 + ((Class160_Sub1_Sub1) this).anInt8851 + ((Class160_Sub1_Sub1) this).anInt8855);
			int i_2157_ = (((Class160_Sub1_Sub1) this).anInt8854 + ((Class160_Sub1_Sub1) this).anInt8867 + ((Class160_Sub1_Sub1) this).anInt8856);
			int i_2158_ = (i_2156_ << 16) / i_2147_;
			int i_2159_ = (i_2157_ << 16) / i_2148_;
			if (((Class160_Sub1_Sub1) this).anInt8853 > 0) {
				int i_2160_ = (((((Class160_Sub1_Sub1) this).anInt8853 << 16) + i_2158_ - 1) / i_2158_);
				i += i_2160_;
				i_2154_ += (i_2160_ * i_2158_ - (((Class160_Sub1_Sub1) this).anInt8853 << 16));
			}
			if (((Class160_Sub1_Sub1) this).anInt8854 > 0) {
				int i_2161_ = (((((Class160_Sub1_Sub1) this).anInt8854 << 16) + i_2159_ - 1) / i_2159_);
				i_2146_ += i_2161_;
				i_2155_ += (i_2161_ * i_2159_ - (((Class160_Sub1_Sub1) this).anInt8854 << 16));
			}
			if (((Class160_Sub1_Sub1) this).anInt8851 < i_2156_)
				i_2147_ = ((((Class160_Sub1_Sub1) this).anInt8851 << 16) - i_2154_ + i_2158_ - 1) / i_2158_;
			if (((Class160_Sub1_Sub1) this).anInt8867 < i_2157_)
				i_2148_ = ((((Class160_Sub1_Sub1) this).anInt8867 << 16) - i_2155_ + i_2159_ - 1) / i_2159_;
			int i_2162_ = i + i_2146_ * ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980) * 444800403);
			int i_2163_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403) - i_2147_);
			if (i_2146_ + i_2148_ > (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_2148_ -= (i_2146_ + i_2148_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i_2146_ < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_2164_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_2146_);
				i_2148_ -= i_2164_;
				i_2162_ += i_2164_ * (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				i_2155_ += i_2159_ * i_2164_;
			}
			if (i + i_2147_ > (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_2165_ = (i + i_2147_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_2147_ -= i_2165_;
				i_2163_ += i_2165_;
			}
			if (i < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_2166_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_2147_ -= i_2166_;
				i_2162_ += i_2166_;
				i_2154_ += i_2158_ * i_2166_;
				i_2163_ += i_2166_;
			}
			float[] fs = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).aFloatArray9010);
			int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
			if (i_2151_ == 0) {
				if (i_2149_ == 1) {
					int i_2167_ = i_2154_;
					for (int i_2168_ = -i_2148_; i_2168_ < 0; i_2168_++) {
						int i_2169_ = ((i_2155_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2170_ = -i_2147_; i_2170_ < 0; i_2170_++) {
							if (!bool_2144_ || f < fs[i_2162_]) {
								if (bool)
									is[i_2162_] = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2154_ >> 16) + i_2169_]);
								if (bool_2144_ && bool_2153_)
									fs[i_2162_] = f;
							}
							i_2154_ += i_2158_;
							i_2162_++;
						}
						i_2155_ += i_2159_;
						i_2154_ = i_2167_;
						i_2162_ += i_2163_;
					}
				} else if (i_2149_ == 0) {
					int i_2171_ = (i_2150_ & 0xff0000) >> 16;
					int i_2172_ = (i_2150_ & 0xff00) >> 8;
					int i_2173_ = i_2150_ & 0xff;
					int i_2174_ = i_2154_;
					for (int i_2175_ = -i_2148_; i_2175_ < 0; i_2175_++) {
						int i_2176_ = ((i_2155_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2177_ = -i_2147_; i_2177_ < 0; i_2177_++) {
							if (!bool_2144_ || f < fs[i_2162_]) {
								if (bool) {
									int i_2178_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2154_ >> 16) + i_2176_]);
									int i_2179_ = ((i_2178_ & 0xff0000) * i_2171_ & ~0xffffff);
									int i_2180_ = ((i_2178_ & 0xff00) * i_2172_ & 0xff0000);
									int i_2181_ = (i_2178_ & 0xff) * i_2173_ & 0xff00;
									is[i_2162_] = (i_2179_ | i_2180_ | i_2181_) >>> 8;
								}
								if (bool_2144_ && bool_2153_)
									fs[i_2162_] = f;
							}
							i_2154_ += i_2158_;
							i_2162_++;
						}
						i_2155_ += i_2159_;
						i_2154_ = i_2174_;
						i_2162_ += i_2163_;
					}
				} else if (i_2149_ == 3) {
					int i_2182_ = i_2154_;
					for (int i_2183_ = -i_2148_; i_2183_ < 0; i_2183_++) {
						int i_2184_ = ((i_2155_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2185_ = -i_2147_; i_2185_ < 0; i_2185_++) {
							if (!bool_2144_ || f < fs[i_2162_]) {
								if (bool) {
									int i_2186_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2154_ >> 16) + i_2184_]);
									int i_2187_ = i_2186_ + i_2150_;
									int i_2188_ = ((i_2186_ & 0xff00ff) + (i_2150_ & 0xff00ff));
									int i_2189_ = ((i_2188_ & 0x1000100) + (i_2187_ - i_2188_ & 0x10000));
									is[i_2162_] = (i_2187_ - i_2189_ | i_2189_ - (i_2189_ >>> 8));
								}
								if (bool_2144_ && bool_2153_)
									fs[i_2162_] = f;
							}
							i_2154_ += i_2158_;
							i_2162_++;
						}
						i_2155_ += i_2159_;
						i_2154_ = i_2182_;
						i_2162_ += i_2163_;
					}
				} else if (i_2149_ == 2) {
					int i_2190_ = i_2150_ >>> 24;
					int i_2191_ = 256 - i_2190_;
					int i_2192_ = (i_2150_ & 0xff00ff) * i_2191_ & ~0xff00ff;
					int i_2193_ = (i_2150_ & 0xff00) * i_2191_ & 0xff0000;
					i_2150_ = (i_2192_ | i_2193_) >>> 8;
					int i_2194_ = i_2154_;
					for (int i_2195_ = -i_2148_; i_2195_ < 0; i_2195_++) {
						int i_2196_ = ((i_2155_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2197_ = -i_2147_; i_2197_ < 0; i_2197_++) {
							if (!bool_2144_ || f < fs[i_2162_]) {
								if (bool) {
									int i_2198_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2154_ >> 16) + i_2196_]);
									i_2192_ = ((i_2198_ & 0xff00ff) * i_2190_ & ~0xff00ff);
									i_2193_ = ((i_2198_ & 0xff00) * i_2190_ & 0xff0000);
									is[i_2162_] = (((i_2192_ | i_2193_) >>> 8) + i_2150_);
								}
								if (bool_2144_ && bool_2153_)
									fs[i_2162_] = f;
							}
							i_2154_ += i_2158_;
							i_2162_++;
						}
						i_2155_ += i_2159_;
						i_2154_ = i_2194_;
						i_2162_ += i_2163_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2151_ == 1) {
				if (i_2149_ == 1) {
					int i_2199_ = i_2154_;
					for (int i_2200_ = -i_2148_; i_2200_ < 0; i_2200_++) {
						int i_2201_ = ((i_2155_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2202_ = -i_2147_; i_2202_ < 0; i_2202_++) {
							if (!bool_2144_ || f < fs[i_2162_]) {
								int i_2203_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2154_ >> 16) + i_2201_]);
								if (i_2203_ != 0) {
									if (bool)
										is[i_2162_] = i_2203_;
									if (bool_2144_ && bool_2153_)
										fs[i_2162_] = f;
								}
							}
							i_2154_ += i_2158_;
							i_2162_++;
						}
						i_2155_ += i_2159_;
						i_2154_ = i_2199_;
						i_2162_ += i_2163_;
					}
				} else if (i_2149_ == 0) {
					int i_2204_ = i_2154_;
					if ((i_2150_ & 0xffffff) == 16777215) {
						int i_2205_ = i_2150_ >>> 24;
						int i_2206_ = 256 - i_2205_;
						for (int i_2207_ = -i_2148_; i_2207_ < 0; i_2207_++) {
							int i_2208_ = ((i_2155_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_2209_ = -i_2147_; i_2209_ < 0; i_2209_++) {
								if (!bool_2144_ || f < fs[i_2162_]) {
									int i_2210_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2154_ >> 16) + i_2208_]);
									if (i_2210_ != 0) {
										if (bool) {
											int i_2211_ = is[i_2162_];
											is[i_2162_] = (((((i_2210_ & 0xff00ff) * i_2205_) + ((i_2211_ & 0xff00ff) * i_2206_)) & ~0xff00ff) + ((((i_2210_ & 0xff00) * i_2205_) + ((i_2211_ & 0xff00) * i_2206_)) & 0xff0000)) >> 8;
										}
										if (bool_2144_ && bool_2153_)
											fs[i_2162_] = f;
									}
								}
								i_2154_ += i_2158_;
								i_2162_++;
							}
							i_2155_ += i_2159_;
							i_2154_ = i_2204_;
							i_2162_ += i_2163_;
						}
					} else {
						int i_2212_ = (i_2150_ & 0xff0000) >> 16;
						int i_2213_ = (i_2150_ & 0xff00) >> 8;
						int i_2214_ = i_2150_ & 0xff;
						int i_2215_ = i_2150_ >>> 24;
						int i_2216_ = 256 - i_2215_;
						for (int i_2217_ = -i_2148_; i_2217_ < 0; i_2217_++) {
							int i_2218_ = ((i_2155_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_2219_ = -i_2147_; i_2219_ < 0; i_2219_++) {
								if (!bool_2144_ || f < fs[i_2162_]) {
									int i_2220_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2154_ >> 16) + i_2218_]);
									if (i_2220_ != 0) {
										if (i_2215_ != 255) {
											if (bool) {
												int i_2221_ = (((i_2220_ & 0xff0000) * i_2212_) & ~0xffffff);
												int i_2222_ = (((i_2220_ & 0xff00) * i_2213_) & 0xff0000);
												int i_2223_ = (((i_2220_ & 0xff) * i_2214_) & 0xff00);
												i_2220_ = (i_2221_ | i_2222_ | i_2223_) >>> 8;
												int i_2224_ = is[i_2162_];
												is[i_2162_] = (((((i_2220_ & 0xff00ff) * i_2215_) + ((i_2224_ & 0xff00ff) * i_2216_)) & ~0xff00ff) + ((((i_2220_ & 0xff00) * i_2215_) + ((i_2224_ & 0xff00) * i_2216_)) & 0xff0000)) >> 8;
											}
											if (bool_2144_ && bool_2153_)
												fs[i_2162_] = f;
										} else {
											if (bool) {
												int i_2225_ = (((i_2220_ & 0xff0000) * i_2212_) & ~0xffffff);
												int i_2226_ = (((i_2220_ & 0xff00) * i_2213_) & 0xff0000);
												int i_2227_ = (((i_2220_ & 0xff) * i_2214_) & 0xff00);
												is[i_2162_] = (i_2225_ | i_2226_ | i_2227_) >>> 8;
											}
											if (bool_2144_ && bool_2153_)
												fs[i_2162_] = f;
										}
									}
								}
								i_2154_ += i_2158_;
								i_2162_++;
							}
							i_2155_ += i_2159_;
							i_2154_ = i_2204_;
							i_2162_ += i_2163_;
						}
					}
				} else if (i_2149_ == 3) {
					int i_2228_ = i_2154_;
					int i_2229_ = i_2150_ >>> 24;
					int i_2230_ = 256 - i_2229_;
					for (int i_2231_ = -i_2148_; i_2231_ < 0; i_2231_++) {
						int i_2232_ = ((i_2155_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2233_ = -i_2147_; i_2233_ < 0; i_2233_++) {
							if (!bool_2144_ || f < fs[i_2162_]) {
								if (bool) {
									int i_2234_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2154_ >> 16) + i_2232_]);
									int i_2235_ = i_2234_ + i_2150_;
									int i_2236_ = ((i_2234_ & 0xff00ff) + (i_2150_ & 0xff00ff));
									int i_2237_ = ((i_2236_ & 0x1000100) + (i_2235_ - i_2236_ & 0x10000));
									i_2237_ = (i_2235_ - i_2237_ | i_2237_ - (i_2237_ >>> 8));
									if (i_2234_ == 0 && i_2229_ != 255) {
										i_2234_ = i_2237_;
										i_2237_ = is[i_2162_];
										i_2237_ = ((((i_2234_ & 0xff00ff) * i_2229_ + ((i_2237_ & 0xff00ff) * i_2230_)) & ~0xff00ff) + (((i_2234_ & 0xff00) * i_2229_ + ((i_2237_ & 0xff00) * i_2230_)) & 0xff0000)) >> 8;
									}
									is[i_2162_] = i_2237_;
								}
								if (bool_2144_ && bool_2153_)
									fs[i_2162_] = f;
							}
							i_2154_ += i_2158_;
							i_2162_++;
						}
						i_2155_ += i_2159_;
						i_2154_ = i_2228_;
						i_2162_ += i_2163_;
					}
				} else if (i_2149_ == 2) {
					int i_2238_ = i_2150_ >>> 24;
					int i_2239_ = 256 - i_2238_;
					int i_2240_ = (i_2150_ & 0xff00ff) * i_2239_ & ~0xff00ff;
					int i_2241_ = (i_2150_ & 0xff00) * i_2239_ & 0xff0000;
					i_2150_ = (i_2240_ | i_2241_) >>> 8;
					int i_2242_ = i_2154_;
					for (int i_2243_ = -i_2148_; i_2243_ < 0; i_2243_++) {
						int i_2244_ = ((i_2155_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2245_ = -i_2147_; i_2245_ < 0; i_2245_++) {
							if (!bool_2144_ || f < fs[i_2162_]) {
								int i_2246_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2154_ >> 16) + i_2244_]);
								if (i_2246_ != 0) {
									if (bool) {
										i_2240_ = ((i_2246_ & 0xff00ff) * i_2238_ & ~0xff00ff);
										i_2241_ = ((i_2246_ & 0xff00) * i_2238_ & 0xff0000);
										is[i_2162_] = ((i_2240_ | i_2241_) >>> 8) + i_2150_;
									}
									if (bool_2144_ && bool_2153_)
										fs[i_2162_] = f;
								}
							}
							i_2154_ += i_2158_;
							i_2162_++;
						}
						i_2155_ += i_2159_;
						i_2154_ = i_2242_;
						i_2162_ += i_2163_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2151_ == 2) {
				if (i_2149_ == 1) {
					int i_2247_ = i_2154_;
					for (int i_2248_ = -i_2148_; i_2248_ < 0; i_2248_++) {
						int i_2249_ = ((i_2155_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2250_ = -i_2147_; i_2250_ < 0; i_2250_++) {
							if (!bool_2144_ || f < fs[i_2162_]) {
								int i_2251_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2154_ >> 16) + i_2249_]);
								if (i_2251_ != 0) {
									if (bool) {
										int i_2252_ = is[i_2162_];
										int i_2253_ = i_2251_ + i_2252_;
										int i_2254_ = ((i_2251_ & 0xff00ff) + (i_2252_ & 0xff00ff));
										i_2252_ = ((i_2254_ & 0x1000100) + (i_2253_ - i_2254_ & 0x10000));
										is[i_2162_] = (i_2253_ - i_2252_ | i_2252_ - (i_2252_ >>> 8));
									}
									if (bool_2144_ && bool_2153_)
										fs[i_2162_] = f;
								}
							}
							i_2154_ += i_2158_;
							i_2162_++;
						}
						i_2155_ += i_2159_;
						i_2154_ = i_2247_;
						i_2162_ += i_2163_;
					}
				} else if (i_2149_ == 0) {
					int i_2255_ = i_2154_;
					int i_2256_ = (i_2150_ & 0xff0000) >> 16;
					int i_2257_ = (i_2150_ & 0xff00) >> 8;
					int i_2258_ = i_2150_ & 0xff;
					for (int i_2259_ = -i_2148_; i_2259_ < 0; i_2259_++) {
						int i_2260_ = ((i_2155_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2261_ = -i_2147_; i_2261_ < 0; i_2261_++) {
							if (!bool_2144_ || f < fs[i_2162_]) {
								int i_2262_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2154_ >> 16) + i_2260_]);
								if (i_2262_ != 0) {
									if (bool) {
										int i_2263_ = ((i_2262_ & 0xff0000) * i_2256_ & ~0xffffff);
										int i_2264_ = ((i_2262_ & 0xff00) * i_2257_ & 0xff0000);
										int i_2265_ = ((i_2262_ & 0xff) * i_2258_ & 0xff00);
										i_2262_ = (i_2263_ | i_2264_ | i_2265_) >>> 8;
										int i_2266_ = is[i_2162_];
										int i_2267_ = i_2262_ + i_2266_;
										int i_2268_ = ((i_2262_ & 0xff00ff) + (i_2266_ & 0xff00ff));
										i_2266_ = ((i_2268_ & 0x1000100) + (i_2267_ - i_2268_ & 0x10000));
										is[i_2162_] = (i_2267_ - i_2266_ | i_2266_ - (i_2266_ >>> 8));
									}
									if (bool_2144_ && bool_2153_)
										fs[i_2162_] = f;
								}
							}
							i_2154_ += i_2158_;
							i_2162_++;
						}
						i_2155_ += i_2159_;
						i_2154_ = i_2255_;
						i_2162_ += i_2163_;
					}
				} else if (i_2149_ == 3) {
					int i_2269_ = i_2154_;
					for (int i_2270_ = -i_2148_; i_2270_ < 0; i_2270_++) {
						int i_2271_ = ((i_2155_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2272_ = -i_2147_; i_2272_ < 0; i_2272_++) {
							if (!bool_2144_ || f < fs[i_2162_]) {
								if (bool) {
									int i_2273_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2154_ >> 16) + i_2271_]);
									int i_2274_ = i_2273_ + i_2150_;
									int i_2275_ = ((i_2273_ & 0xff00ff) + (i_2150_ & 0xff00ff));
									int i_2276_ = ((i_2275_ & 0x1000100) + (i_2274_ - i_2275_ & 0x10000));
									i_2273_ = (i_2274_ - i_2276_ | i_2276_ - (i_2276_ >>> 8));
									i_2276_ = is[i_2162_];
									i_2274_ = i_2273_ + i_2276_;
									i_2275_ = (i_2273_ & 0xff00ff) + (i_2276_ & 0xff00ff);
									i_2276_ = ((i_2275_ & 0x1000100) + (i_2274_ - i_2275_ & 0x10000));
									is[i_2162_] = (i_2274_ - i_2276_ | i_2276_ - (i_2276_ >>> 8));
								}
								if (bool_2144_ && bool_2153_)
									fs[i_2162_] = f;
							}
							i_2154_ += i_2158_;
							i_2162_++;
						}
						i_2155_ += i_2159_;
						i_2154_ = i_2269_;
						i_2162_ += i_2163_;
					}
				} else if (i_2149_ == 2) {
					int i_2277_ = i_2150_ >>> 24;
					int i_2278_ = 256 - i_2277_;
					int i_2279_ = (i_2150_ & 0xff00ff) * i_2278_ & ~0xff00ff;
					int i_2280_ = (i_2150_ & 0xff00) * i_2278_ & 0xff0000;
					i_2150_ = (i_2279_ | i_2280_) >>> 8;
					int i_2281_ = i_2154_;
					for (int i_2282_ = -i_2148_; i_2282_ < 0; i_2282_++) {
						int i_2283_ = ((i_2155_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2284_ = -i_2147_; i_2284_ < 0; i_2284_++) {
							if (!bool_2144_ || f < fs[i_2162_]) {
								int i_2285_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2154_ >> 16) + i_2283_]);
								if (i_2285_ != 0) {
									if (bool) {
										i_2279_ = ((i_2285_ & 0xff00ff) * i_2277_ & ~0xff00ff);
										i_2280_ = ((i_2285_ & 0xff00) * i_2277_ & 0xff0000);
										i_2285_ = (((i_2279_ | i_2280_) >>> 8) + i_2150_);
										int i_2286_ = is[i_2162_];
										int i_2287_ = i_2285_ + i_2286_;
										int i_2288_ = ((i_2285_ & 0xff00ff) + (i_2286_ & 0xff00ff));
										i_2286_ = ((i_2288_ & 0x1000100) + (i_2287_ - i_2288_ & 0x10000));
										is[i_2162_] = (i_2287_ - i_2286_ | i_2286_ - (i_2286_ >>> 8));
									}
									if (bool_2144_ && bool_2153_)
										fs[i_2162_] = f;
								}
							}
							i_2154_ += i_2158_;
							i_2162_++;
						}
						i_2155_ += i_2159_;
						i_2154_ = i_2281_;
						i_2162_ += i_2163_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2751(int i, int i_2289_, int i_2290_) {
		throw new IllegalStateException("");
	}

	void method14253(int i, int i_2291_) {
		int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					int i_2292_ = anInt8864;
					while (i_2292_ < 0) {
						int i_2293_ = anInt8870;
						int i_2294_ = anInt8873;
						int i_2295_ = anInt8874;
						int i_2296_ = anInt8862;
						if (i_2294_ >= 0 && i_2295_ >= 0 && i_2294_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) < 0 && i_2295_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) < 0) {
							for (/**/; i_2296_ < 0; i_2296_++) {
								int i_2297_ = ((i_2295_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851 + (i_2294_ >> 12));
								int i_2298_ = i_2293_++;
								if (i_2291_ == 0) {
									if (i == 1)
										is[i_2298_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2297_]);
									else if (i == 0) {
										int i_2299_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2297_++]);
										int i_2300_ = ((i_2299_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2301_ = ((i_2299_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2302_ = ((i_2299_ & 0xff) * anInt8882 & 0xff00);
										is[i_2298_] = (i_2300_ | i_2301_ | i_2302_) >>> 8;
									} else if (i == 3) {
										int i_2303_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2297_++]);
										int i_2304_ = anInt8877;
										int i_2305_ = i_2303_ + i_2304_;
										int i_2306_ = ((i_2303_ & 0xff00ff) + (i_2304_ & 0xff00ff));
										int i_2307_ = ((i_2306_ & 0x1000100) + (i_2305_ - i_2306_ & 0x10000));
										is[i_2298_] = (i_2305_ - i_2307_ | i_2307_ - (i_2307_ >>> 8));
									} else if (i == 2) {
										int i_2308_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2297_]);
										int i_2309_ = ((i_2308_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2310_ = ((i_2308_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2298_] = ((i_2309_ | i_2310_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_2291_ == 1) {
									if (i == 1) {
										int i_2311_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2297_]);
										if (i_2311_ != 0)
											is[i_2298_] = i_2311_;
									} else if (i == 0) {
										int i_2312_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2297_]);
										if (i_2312_ != 0) {
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_2313_ = anInt8877 >>> 24;
												int i_2314_ = 256 - i_2313_;
												int i_2315_ = is[i_2298_];
												is[i_2298_] = (((((i_2312_ & 0xff00ff) * i_2313_) + ((i_2315_ & 0xff00ff) * i_2314_)) & ~0xff00ff) + ((((i_2312_ & 0xff00) * i_2313_) + ((i_2315_ & 0xff00) * i_2314_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_2316_ = (((i_2312_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2317_ = (((i_2312_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2318_ = (((i_2312_ & 0xff) * anInt8882) & 0xff00);
												i_2312_ = (i_2316_ | i_2317_ | i_2318_) >>> 8;
												int i_2319_ = is[i_2298_];
												is[i_2298_] = (((((i_2312_ & 0xff00ff) * anInt8878) + ((i_2319_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2312_ & 0xff00) * anInt8878) + ((i_2319_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_2320_ = (((i_2312_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2321_ = (((i_2312_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2322_ = (((i_2312_ & 0xff) * anInt8882) & 0xff00);
												is[i_2298_] = (i_2320_ | i_2321_ | i_2322_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_2323_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2297_]);
										int i_2324_ = anInt8877;
										int i_2325_ = i_2323_ + i_2324_;
										int i_2326_ = ((i_2323_ & 0xff00ff) + (i_2324_ & 0xff00ff));
										int i_2327_ = ((i_2326_ & 0x1000100) + (i_2325_ - i_2326_ & 0x10000));
										i_2327_ = (i_2325_ - i_2327_ | i_2327_ - (i_2327_ >>> 8));
										if (i_2323_ == 0 && anInt8878 != 255) {
											i_2323_ = i_2327_;
											i_2327_ = is[i_2298_];
											i_2327_ = (((((i_2323_ & 0xff00ff) * anInt8878) + ((i_2327_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2323_ & 0xff00) * anInt8878) + ((i_2327_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_2298_] = i_2327_;
									} else if (i == 2) {
										int i_2328_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2297_]);
										if (i_2328_ != 0) {
											int i_2329_ = (((i_2328_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2330_ = (((i_2328_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_2298_++] = (((i_2329_ | i_2330_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2291_ == 2) {
									if (i == 1) {
										int i_2331_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2297_]);
										if (i_2331_ != 0) {
											int i_2332_ = is[i_2298_];
											int i_2333_ = i_2331_ + i_2332_;
											int i_2334_ = ((i_2331_ & 0xff00ff) + (i_2332_ & 0xff00ff));
											i_2332_ = ((i_2334_ & 0x1000100) + (i_2333_ - i_2334_ & 0x10000));
											is[i_2298_] = (i_2333_ - i_2332_ | i_2332_ - (i_2332_ >>> 8));
										}
									} else if (i == 0) {
										int i_2335_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2297_]);
										if (i_2335_ != 0) {
											int i_2336_ = (((i_2335_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2337_ = (((i_2335_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2338_ = ((i_2335_ & 0xff) * anInt8882 & 0xff00);
											i_2335_ = (i_2336_ | i_2337_ | i_2338_) >>> 8;
											int i_2339_ = is[i_2298_];
											int i_2340_ = i_2335_ + i_2339_;
											int i_2341_ = ((i_2335_ & 0xff00ff) + (i_2339_ & 0xff00ff));
											i_2339_ = ((i_2341_ & 0x1000100) + (i_2340_ - i_2341_ & 0x10000));
											is[i_2298_] = (i_2340_ - i_2339_ | i_2339_ - (i_2339_ >>> 8));
										}
									} else if (i == 3) {
										int i_2342_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2297_]);
										int i_2343_ = anInt8877;
										int i_2344_ = i_2342_ + i_2343_;
										int i_2345_ = ((i_2342_ & 0xff00ff) + (i_2343_ & 0xff00ff));
										int i_2346_ = ((i_2345_ & 0x1000100) + (i_2344_ - i_2345_ & 0x10000));
										i_2342_ = (i_2344_ - i_2346_ | i_2346_ - (i_2346_ >>> 8));
										i_2346_ = is[i_2298_];
										i_2344_ = i_2342_ + i_2346_;
										i_2345_ = ((i_2342_ & 0xff00ff) + (i_2346_ & 0xff00ff));
										i_2346_ = ((i_2345_ & 0x1000100) + (i_2344_ - i_2345_ & 0x10000));
										is[i_2298_] = (i_2344_ - i_2346_ | i_2346_ - (i_2346_ >>> 8));
									} else if (i == 2) {
										int i_2347_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2297_]);
										if (i_2347_ != 0) {
											int i_2348_ = (((i_2347_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2349_ = (((i_2347_ & 0xff00) * anInt8878) & 0xff0000);
											i_2347_ = ((i_2348_ | i_2349_) >>> 8) + anInt8885;
											int i_2350_ = is[i_2298_];
											int i_2351_ = i_2347_ + i_2350_;
											int i_2352_ = ((i_2347_ & 0xff00ff) + (i_2350_ & 0xff00ff));
											i_2350_ = ((i_2352_ & 0x1000100) + (i_2351_ - i_2352_ & 0x10000));
											is[i_2298_] = (i_2351_ - i_2350_ | i_2350_ - (i_2350_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_2292_++;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_2353_ = anInt8864;
					while (i_2353_ < 0) {
						int i_2354_ = anInt8870;
						int i_2355_ = anInt8873;
						int i_2356_ = anInt8874 + anInt8866;
						int i_2357_ = anInt8862;
						if (i_2355_ >= 0 && i_2355_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) < 0) {
							int i_2358_;
							if ((i_2358_ = (i_2356_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12))) >= 0) {
								i_2358_ = (anInt8868 - i_2358_) / anInt8868;
								i_2357_ += i_2358_;
								i_2356_ += anInt8868 * i_2358_;
								i_2354_ += i_2358_;
							}
							if ((i_2358_ = (i_2356_ - anInt8868) / anInt8868) > i_2357_)
								i_2357_ = i_2358_;
							for (/**/; i_2357_ < 0; i_2357_++) {
								int i_2359_ = ((i_2356_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851 + (i_2355_ >> 12));
								int i_2360_ = i_2354_++;
								if (i_2291_ == 0) {
									if (i == 1)
										is[i_2360_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2359_]);
									else if (i == 0) {
										int i_2361_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2359_++]);
										int i_2362_ = ((i_2361_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2363_ = ((i_2361_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2364_ = ((i_2361_ & 0xff) * anInt8882 & 0xff00);
										is[i_2360_] = (i_2362_ | i_2363_ | i_2364_) >>> 8;
									} else if (i == 3) {
										int i_2365_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2359_++]);
										int i_2366_ = anInt8877;
										int i_2367_ = i_2365_ + i_2366_;
										int i_2368_ = ((i_2365_ & 0xff00ff) + (i_2366_ & 0xff00ff));
										int i_2369_ = ((i_2368_ & 0x1000100) + (i_2367_ - i_2368_ & 0x10000));
										is[i_2360_] = (i_2367_ - i_2369_ | i_2369_ - (i_2369_ >>> 8));
									} else if (i == 2) {
										int i_2370_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2359_]);
										int i_2371_ = ((i_2370_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2372_ = ((i_2370_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2360_] = ((i_2371_ | i_2372_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_2291_ == 1) {
									if (i == 1) {
										int i_2373_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2359_]);
										if (i_2373_ != 0)
											is[i_2360_] = i_2373_;
									} else if (i == 0) {
										int i_2374_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2359_]);
										if (i_2374_ != 0) {
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_2375_ = anInt8877 >>> 24;
												int i_2376_ = 256 - i_2375_;
												int i_2377_ = is[i_2360_];
												is[i_2360_] = (((((i_2374_ & 0xff00ff) * i_2375_) + ((i_2377_ & 0xff00ff) * i_2376_)) & ~0xff00ff) + ((((i_2374_ & 0xff00) * i_2375_) + ((i_2377_ & 0xff00) * i_2376_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_2378_ = (((i_2374_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2379_ = (((i_2374_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2380_ = (((i_2374_ & 0xff) * anInt8882) & 0xff00);
												i_2374_ = (i_2378_ | i_2379_ | i_2380_) >>> 8;
												int i_2381_ = is[i_2360_];
												is[i_2360_] = (((((i_2374_ & 0xff00ff) * anInt8878) + ((i_2381_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2374_ & 0xff00) * anInt8878) + ((i_2381_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_2382_ = (((i_2374_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2383_ = (((i_2374_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2384_ = (((i_2374_ & 0xff) * anInt8882) & 0xff00);
												is[i_2360_] = (i_2382_ | i_2383_ | i_2384_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_2385_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2359_]);
										int i_2386_ = anInt8877;
										int i_2387_ = i_2385_ + i_2386_;
										int i_2388_ = ((i_2385_ & 0xff00ff) + (i_2386_ & 0xff00ff));
										int i_2389_ = ((i_2388_ & 0x1000100) + (i_2387_ - i_2388_ & 0x10000));
										i_2389_ = (i_2387_ - i_2389_ | i_2389_ - (i_2389_ >>> 8));
										if (i_2385_ == 0 && anInt8878 != 255) {
											i_2385_ = i_2389_;
											i_2389_ = is[i_2360_];
											i_2389_ = (((((i_2385_ & 0xff00ff) * anInt8878) + ((i_2389_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2385_ & 0xff00) * anInt8878) + ((i_2389_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_2360_] = i_2389_;
									} else if (i == 2) {
										int i_2390_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2359_]);
										if (i_2390_ != 0) {
											int i_2391_ = (((i_2390_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2392_ = (((i_2390_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_2360_++] = (((i_2391_ | i_2392_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2291_ == 2) {
									if (i == 1) {
										int i_2393_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2359_]);
										if (i_2393_ != 0) {
											int i_2394_ = is[i_2360_];
											int i_2395_ = i_2393_ + i_2394_;
											int i_2396_ = ((i_2393_ & 0xff00ff) + (i_2394_ & 0xff00ff));
											i_2394_ = ((i_2396_ & 0x1000100) + (i_2395_ - i_2396_ & 0x10000));
											is[i_2360_] = (i_2395_ - i_2394_ | i_2394_ - (i_2394_ >>> 8));
										}
									} else if (i == 0) {
										int i_2397_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2359_]);
										if (i_2397_ != 0) {
											int i_2398_ = (((i_2397_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2399_ = (((i_2397_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2400_ = ((i_2397_ & 0xff) * anInt8882 & 0xff00);
											i_2397_ = (i_2398_ | i_2399_ | i_2400_) >>> 8;
											int i_2401_ = is[i_2360_];
											int i_2402_ = i_2397_ + i_2401_;
											int i_2403_ = ((i_2397_ & 0xff00ff) + (i_2401_ & 0xff00ff));
											i_2401_ = ((i_2403_ & 0x1000100) + (i_2402_ - i_2403_ & 0x10000));
											is[i_2360_] = (i_2402_ - i_2401_ | i_2401_ - (i_2401_ >>> 8));
										}
									} else if (i == 3) {
										int i_2404_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2359_]);
										int i_2405_ = anInt8877;
										int i_2406_ = i_2404_ + i_2405_;
										int i_2407_ = ((i_2404_ & 0xff00ff) + (i_2405_ & 0xff00ff));
										int i_2408_ = ((i_2407_ & 0x1000100) + (i_2406_ - i_2407_ & 0x10000));
										i_2404_ = (i_2406_ - i_2408_ | i_2408_ - (i_2408_ >>> 8));
										i_2408_ = is[i_2360_];
										i_2406_ = i_2404_ + i_2408_;
										i_2407_ = ((i_2404_ & 0xff00ff) + (i_2408_ & 0xff00ff));
										i_2408_ = ((i_2407_ & 0x1000100) + (i_2406_ - i_2407_ & 0x10000));
										is[i_2360_] = (i_2406_ - i_2408_ | i_2408_ - (i_2408_ >>> 8));
									} else if (i == 2) {
										int i_2409_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2359_]);
										if (i_2409_ != 0) {
											int i_2410_ = (((i_2409_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2411_ = (((i_2409_ & 0xff00) * anInt8878) & 0xff0000);
											i_2409_ = ((i_2410_ | i_2411_) >>> 8) + anInt8885;
											int i_2412_ = is[i_2360_];
											int i_2413_ = i_2409_ + i_2412_;
											int i_2414_ = ((i_2409_ & 0xff00ff) + (i_2412_ & 0xff00ff));
											i_2412_ = ((i_2414_ & 0x1000100) + (i_2413_ - i_2414_ & 0x10000));
											is[i_2360_] = (i_2413_ - i_2412_ | i_2412_ - (i_2412_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2356_ += anInt8868;
							}
						}
						i_2353_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				} else {
					int i_2415_ = anInt8864;
					while (i_2415_ < 0) {
						int i_2416_ = anInt8870;
						int i_2417_ = anInt8873;
						int i_2418_ = anInt8874 + anInt8866;
						int i_2419_ = anInt8862;
						if (i_2417_ >= 0 && i_2417_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) < 0) {
							if (i_2418_ < 0) {
								int i_2420_ = (anInt8868 - 1 - i_2418_) / anInt8868;
								i_2419_ += i_2420_;
								i_2418_ += anInt8868 * i_2420_;
								i_2416_ += i_2420_;
							}
							int i_2421_;
							if ((i_2421_ = (1 + i_2418_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_2419_)
								i_2419_ = i_2421_;
							for (/**/; i_2419_ < 0; i_2419_++) {
								int i_2422_ = ((i_2418_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851 + (i_2417_ >> 12));
								int i_2423_ = i_2416_++;
								if (i_2291_ == 0) {
									if (i == 1)
										is[i_2423_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2422_]);
									else if (i == 0) {
										int i_2424_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2422_++]);
										int i_2425_ = ((i_2424_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2426_ = ((i_2424_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2427_ = ((i_2424_ & 0xff) * anInt8882 & 0xff00);
										is[i_2423_] = (i_2425_ | i_2426_ | i_2427_) >>> 8;
									} else if (i == 3) {
										int i_2428_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2422_++]);
										int i_2429_ = anInt8877;
										int i_2430_ = i_2428_ + i_2429_;
										int i_2431_ = ((i_2428_ & 0xff00ff) + (i_2429_ & 0xff00ff));
										int i_2432_ = ((i_2431_ & 0x1000100) + (i_2430_ - i_2431_ & 0x10000));
										is[i_2423_] = (i_2430_ - i_2432_ | i_2432_ - (i_2432_ >>> 8));
									} else if (i == 2) {
										int i_2433_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2422_]);
										int i_2434_ = ((i_2433_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2435_ = ((i_2433_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2423_] = ((i_2434_ | i_2435_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_2291_ == 1) {
									if (i == 1) {
										int i_2436_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2422_]);
										if (i_2436_ != 0)
											is[i_2423_] = i_2436_;
									} else if (i == 0) {
										int i_2437_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2422_]);
										if (i_2437_ != 0) {
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_2438_ = anInt8877 >>> 24;
												int i_2439_ = 256 - i_2438_;
												int i_2440_ = is[i_2423_];
												is[i_2423_] = (((((i_2437_ & 0xff00ff) * i_2438_) + ((i_2440_ & 0xff00ff) * i_2439_)) & ~0xff00ff) + ((((i_2437_ & 0xff00) * i_2438_) + ((i_2440_ & 0xff00) * i_2439_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_2441_ = (((i_2437_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2442_ = (((i_2437_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2443_ = (((i_2437_ & 0xff) * anInt8882) & 0xff00);
												i_2437_ = (i_2441_ | i_2442_ | i_2443_) >>> 8;
												int i_2444_ = is[i_2423_];
												is[i_2423_] = (((((i_2437_ & 0xff00ff) * anInt8878) + ((i_2444_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2437_ & 0xff00) * anInt8878) + ((i_2444_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_2445_ = (((i_2437_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2446_ = (((i_2437_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2447_ = (((i_2437_ & 0xff) * anInt8882) & 0xff00);
												is[i_2423_] = (i_2445_ | i_2446_ | i_2447_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_2448_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2422_]);
										int i_2449_ = anInt8877;
										int i_2450_ = i_2448_ + i_2449_;
										int i_2451_ = ((i_2448_ & 0xff00ff) + (i_2449_ & 0xff00ff));
										int i_2452_ = ((i_2451_ & 0x1000100) + (i_2450_ - i_2451_ & 0x10000));
										i_2452_ = (i_2450_ - i_2452_ | i_2452_ - (i_2452_ >>> 8));
										if (i_2448_ == 0 && anInt8878 != 255) {
											i_2448_ = i_2452_;
											i_2452_ = is[i_2423_];
											i_2452_ = (((((i_2448_ & 0xff00ff) * anInt8878) + ((i_2452_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2448_ & 0xff00) * anInt8878) + ((i_2452_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_2423_] = i_2452_;
									} else if (i == 2) {
										int i_2453_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2422_]);
										if (i_2453_ != 0) {
											int i_2454_ = (((i_2453_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2455_ = (((i_2453_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_2423_++] = (((i_2454_ | i_2455_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2291_ == 2) {
									if (i == 1) {
										int i_2456_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2422_]);
										if (i_2456_ != 0) {
											int i_2457_ = is[i_2423_];
											int i_2458_ = i_2456_ + i_2457_;
											int i_2459_ = ((i_2456_ & 0xff00ff) + (i_2457_ & 0xff00ff));
											i_2457_ = ((i_2459_ & 0x1000100) + (i_2458_ - i_2459_ & 0x10000));
											is[i_2423_] = (i_2458_ - i_2457_ | i_2457_ - (i_2457_ >>> 8));
										}
									} else if (i == 0) {
										int i_2460_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2422_]);
										if (i_2460_ != 0) {
											int i_2461_ = (((i_2460_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2462_ = (((i_2460_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2463_ = ((i_2460_ & 0xff) * anInt8882 & 0xff00);
											i_2460_ = (i_2461_ | i_2462_ | i_2463_) >>> 8;
											int i_2464_ = is[i_2423_];
											int i_2465_ = i_2460_ + i_2464_;
											int i_2466_ = ((i_2460_ & 0xff00ff) + (i_2464_ & 0xff00ff));
											i_2464_ = ((i_2466_ & 0x1000100) + (i_2465_ - i_2466_ & 0x10000));
											is[i_2423_] = (i_2465_ - i_2464_ | i_2464_ - (i_2464_ >>> 8));
										}
									} else if (i == 3) {
										int i_2467_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2422_]);
										int i_2468_ = anInt8877;
										int i_2469_ = i_2467_ + i_2468_;
										int i_2470_ = ((i_2467_ & 0xff00ff) + (i_2468_ & 0xff00ff));
										int i_2471_ = ((i_2470_ & 0x1000100) + (i_2469_ - i_2470_ & 0x10000));
										i_2467_ = (i_2469_ - i_2471_ | i_2471_ - (i_2471_ >>> 8));
										i_2471_ = is[i_2423_];
										i_2469_ = i_2467_ + i_2471_;
										i_2470_ = ((i_2467_ & 0xff00ff) + (i_2471_ & 0xff00ff));
										i_2471_ = ((i_2470_ & 0x1000100) + (i_2469_ - i_2470_ & 0x10000));
										is[i_2423_] = (i_2469_ - i_2471_ | i_2471_ - (i_2471_ >>> 8));
									} else if (i == 2) {
										int i_2472_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2422_]);
										if (i_2472_ != 0) {
											int i_2473_ = (((i_2472_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2474_ = (((i_2472_ & 0xff00) * anInt8878) & 0xff0000);
											i_2472_ = ((i_2473_ | i_2474_) >>> 8) + anInt8885;
											int i_2475_ = is[i_2423_];
											int i_2476_ = i_2472_ + i_2475_;
											int i_2477_ = ((i_2472_ & 0xff00ff) + (i_2475_ & 0xff00ff));
											i_2475_ = ((i_2477_ & 0x1000100) + (i_2476_ - i_2477_ & 0x10000));
											is[i_2423_] = (i_2476_ - i_2475_ | i_2475_ - (i_2475_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2418_ += anInt8868;
							}
						}
						i_2415_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					int i_2478_ = anInt8864;
					while (i_2478_ < 0) {
						int i_2479_ = anInt8870;
						int i_2480_ = anInt8873 + anInt8858;
						int i_2481_ = anInt8874;
						int i_2482_ = anInt8862;
						if (i_2481_ >= 0 && i_2481_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) < 0) {
							int i_2483_;
							if ((i_2483_ = (i_2480_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12))) >= 0) {
								i_2483_ = (anInt8865 - i_2483_) / anInt8865;
								i_2482_ += i_2483_;
								i_2480_ += anInt8865 * i_2483_;
								i_2479_ += i_2483_;
							}
							if ((i_2483_ = (i_2480_ - anInt8865) / anInt8865) > i_2482_)
								i_2482_ = i_2483_;
							for (/**/; i_2482_ < 0; i_2482_++) {
								int i_2484_ = ((i_2481_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851 + (i_2480_ >> 12));
								int i_2485_ = i_2479_++;
								if (i_2291_ == 0) {
									if (i == 1)
										is[i_2485_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2484_]);
									else if (i == 0) {
										int i_2486_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2484_++]);
										int i_2487_ = ((i_2486_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2488_ = ((i_2486_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2489_ = ((i_2486_ & 0xff) * anInt8882 & 0xff00);
										is[i_2485_] = (i_2487_ | i_2488_ | i_2489_) >>> 8;
									} else if (i == 3) {
										int i_2490_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2484_++]);
										int i_2491_ = anInt8877;
										int i_2492_ = i_2490_ + i_2491_;
										int i_2493_ = ((i_2490_ & 0xff00ff) + (i_2491_ & 0xff00ff));
										int i_2494_ = ((i_2493_ & 0x1000100) + (i_2492_ - i_2493_ & 0x10000));
										is[i_2485_] = (i_2492_ - i_2494_ | i_2494_ - (i_2494_ >>> 8));
									} else if (i == 2) {
										int i_2495_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2484_]);
										int i_2496_ = ((i_2495_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2497_ = ((i_2495_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2485_] = ((i_2496_ | i_2497_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_2291_ == 1) {
									if (i == 1) {
										int i_2498_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2484_]);
										if (i_2498_ != 0)
											is[i_2485_] = i_2498_;
									} else if (i == 0) {
										int i_2499_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2484_]);
										if (i_2499_ != 0) {
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_2500_ = anInt8877 >>> 24;
												int i_2501_ = 256 - i_2500_;
												int i_2502_ = is[i_2485_];
												is[i_2485_] = (((((i_2499_ & 0xff00ff) * i_2500_) + ((i_2502_ & 0xff00ff) * i_2501_)) & ~0xff00ff) + ((((i_2499_ & 0xff00) * i_2500_) + ((i_2502_ & 0xff00) * i_2501_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_2503_ = (((i_2499_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2504_ = (((i_2499_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2505_ = (((i_2499_ & 0xff) * anInt8882) & 0xff00);
												i_2499_ = (i_2503_ | i_2504_ | i_2505_) >>> 8;
												int i_2506_ = is[i_2485_];
												is[i_2485_] = (((((i_2499_ & 0xff00ff) * anInt8878) + ((i_2506_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2499_ & 0xff00) * anInt8878) + ((i_2506_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_2507_ = (((i_2499_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2508_ = (((i_2499_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2509_ = (((i_2499_ & 0xff) * anInt8882) & 0xff00);
												is[i_2485_] = (i_2507_ | i_2508_ | i_2509_) >>> 8;
											}
										}
									} else if (i == 3) {
										int i_2510_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2484_]);
										int i_2511_ = anInt8877;
										int i_2512_ = i_2510_ + i_2511_;
										int i_2513_ = ((i_2510_ & 0xff00ff) + (i_2511_ & 0xff00ff));
										int i_2514_ = ((i_2513_ & 0x1000100) + (i_2512_ - i_2513_ & 0x10000));
										i_2514_ = (i_2512_ - i_2514_ | i_2514_ - (i_2514_ >>> 8));
										if (i_2510_ == 0 && anInt8878 != 255) {
											i_2510_ = i_2514_;
											i_2514_ = is[i_2485_];
											i_2514_ = (((((i_2510_ & 0xff00ff) * anInt8878) + ((i_2514_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2510_ & 0xff00) * anInt8878) + ((i_2514_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_2485_] = i_2514_;
									} else if (i == 2) {
										int i_2515_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2484_]);
										if (i_2515_ != 0) {
											int i_2516_ = (((i_2515_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2517_ = (((i_2515_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_2485_++] = (((i_2516_ | i_2517_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2291_ == 2) {
									if (i == 1) {
										int i_2518_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2484_]);
										if (i_2518_ != 0) {
											int i_2519_ = is[i_2485_];
											int i_2520_ = i_2518_ + i_2519_;
											int i_2521_ = ((i_2518_ & 0xff00ff) + (i_2519_ & 0xff00ff));
											i_2519_ = ((i_2521_ & 0x1000100) + (i_2520_ - i_2521_ & 0x10000));
											is[i_2485_] = (i_2520_ - i_2519_ | i_2519_ - (i_2519_ >>> 8));
										}
									} else if (i == 0) {
										int i_2522_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2484_]);
										if (i_2522_ != 0) {
											int i_2523_ = (((i_2522_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2524_ = (((i_2522_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2525_ = ((i_2522_ & 0xff) * anInt8882 & 0xff00);
											i_2522_ = (i_2523_ | i_2524_ | i_2525_) >>> 8;
											int i_2526_ = is[i_2485_];
											int i_2527_ = i_2522_ + i_2526_;
											int i_2528_ = ((i_2522_ & 0xff00ff) + (i_2526_ & 0xff00ff));
											i_2526_ = ((i_2528_ & 0x1000100) + (i_2527_ - i_2528_ & 0x10000));
											is[i_2485_] = (i_2527_ - i_2526_ | i_2526_ - (i_2526_ >>> 8));
										}
									} else if (i == 3) {
										int i_2529_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2484_]);
										int i_2530_ = anInt8877;
										int i_2531_ = i_2529_ + i_2530_;
										int i_2532_ = ((i_2529_ & 0xff00ff) + (i_2530_ & 0xff00ff));
										int i_2533_ = ((i_2532_ & 0x1000100) + (i_2531_ - i_2532_ & 0x10000));
										i_2529_ = (i_2531_ - i_2533_ | i_2533_ - (i_2533_ >>> 8));
										i_2533_ = is[i_2485_];
										i_2531_ = i_2529_ + i_2533_;
										i_2532_ = ((i_2529_ & 0xff00ff) + (i_2533_ & 0xff00ff));
										i_2533_ = ((i_2532_ & 0x1000100) + (i_2531_ - i_2532_ & 0x10000));
										is[i_2485_] = (i_2531_ - i_2533_ | i_2533_ - (i_2533_ >>> 8));
									} else if (i == 2) {
										int i_2534_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2484_]);
										if (i_2534_ != 0) {
											int i_2535_ = (((i_2534_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2536_ = (((i_2534_ & 0xff00) * anInt8878) & 0xff0000);
											i_2534_ = ((i_2535_ | i_2536_) >>> 8) + anInt8885;
											int i_2537_ = is[i_2485_];
											int i_2538_ = i_2534_ + i_2537_;
											int i_2539_ = ((i_2534_ & 0xff00ff) + (i_2537_ & 0xff00ff));
											i_2537_ = ((i_2539_ & 0x1000100) + (i_2538_ - i_2539_ & 0x10000));
											is[i_2485_] = (i_2538_ - i_2537_ | i_2537_ - (i_2537_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2480_ += anInt8865;
							}
						}
						i_2478_++;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_2540_ = anInt8864;
					while (i_2540_ < 0) {
						int i_2541_ = anInt8870;
						int i_2542_ = anInt8873 + anInt8858;
						int i_2543_ = anInt8874 + anInt8866;
						int i_2544_ = anInt8862;
						int i_2545_;
						if ((i_2545_ = i_2542_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12)) >= 0) {
							i_2545_ = (anInt8865 - i_2545_) / anInt8865;
							i_2544_ += i_2545_;
							i_2542_ += anInt8865 * i_2545_;
							i_2543_ += anInt8868 * i_2545_;
							i_2541_ += i_2545_;
						}
						if ((i_2545_ = (i_2542_ - anInt8865) / anInt8865) > i_2544_)
							i_2544_ = i_2545_;
						if ((i_2545_ = i_2543_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12)) >= 0) {
							i_2545_ = (anInt8868 - i_2545_) / anInt8868;
							i_2544_ += i_2545_;
							i_2542_ += anInt8865 * i_2545_;
							i_2543_ += anInt8868 * i_2545_;
							i_2541_ += i_2545_;
						}
						if ((i_2545_ = (i_2543_ - anInt8868) / anInt8868) > i_2544_)
							i_2544_ = i_2545_;
						for (/**/; i_2544_ < 0; i_2544_++) {
							int i_2546_ = (((i_2543_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_2542_ >> 12));
							int i_2547_ = i_2541_++;
							if (i_2291_ == 0) {
								if (i == 1)
									is[i_2547_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2546_]);
								else if (i == 0) {
									int i_2548_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2546_++]);
									int i_2549_ = ((i_2548_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2550_ = ((i_2548_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2551_ = ((i_2548_ & 0xff) * anInt8882 & 0xff00);
									is[i_2547_] = (i_2549_ | i_2550_ | i_2551_) >>> 8;
								} else if (i == 3) {
									int i_2552_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2546_++]);
									int i_2553_ = anInt8877;
									int i_2554_ = i_2552_ + i_2553_;
									int i_2555_ = ((i_2552_ & 0xff00ff) + (i_2553_ & 0xff00ff));
									int i_2556_ = ((i_2555_ & 0x1000100) + (i_2554_ - i_2555_ & 0x10000));
									is[i_2547_] = (i_2554_ - i_2556_ | i_2556_ - (i_2556_ >>> 8));
								} else if (i == 2) {
									int i_2557_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2546_]);
									int i_2558_ = ((i_2557_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2559_ = ((i_2557_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2547_] = (((i_2558_ | i_2559_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_2291_ == 1) {
								if (i == 1) {
									int i_2560_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2546_]);
									if (i_2560_ != 0)
										is[i_2547_] = i_2560_;
								} else if (i == 0) {
									int i_2561_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2546_]);
									if (i_2561_ != 0) {
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_2562_ = anInt8877 >>> 24;
											int i_2563_ = 256 - i_2562_;
											int i_2564_ = is[i_2547_];
											is[i_2547_] = (((((i_2561_ & 0xff00ff) * i_2562_) + ((i_2564_ & 0xff00ff) * i_2563_)) & ~0xff00ff) + ((((i_2561_ & 0xff00) * i_2562_) + ((i_2564_ & 0xff00) * i_2563_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_2565_ = (((i_2561_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2566_ = (((i_2561_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2567_ = ((i_2561_ & 0xff) * anInt8882 & 0xff00);
											i_2561_ = (i_2565_ | i_2566_ | i_2567_) >>> 8;
											int i_2568_ = is[i_2547_];
											is[i_2547_] = (((((i_2561_ & 0xff00ff) * anInt8878) + ((i_2568_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2561_ & 0xff00) * anInt8878) + ((i_2568_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_2569_ = (((i_2561_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2570_ = (((i_2561_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2571_ = ((i_2561_ & 0xff) * anInt8882 & 0xff00);
											is[i_2547_] = (i_2569_ | i_2570_ | i_2571_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_2572_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2546_]);
									int i_2573_ = anInt8877;
									int i_2574_ = i_2572_ + i_2573_;
									int i_2575_ = ((i_2572_ & 0xff00ff) + (i_2573_ & 0xff00ff));
									int i_2576_ = ((i_2575_ & 0x1000100) + (i_2574_ - i_2575_ & 0x10000));
									i_2576_ = (i_2574_ - i_2576_ | i_2576_ - (i_2576_ >>> 8));
									if (i_2572_ == 0 && anInt8878 != 255) {
										i_2572_ = i_2576_;
										i_2576_ = is[i_2547_];
										i_2576_ = (((((i_2572_ & 0xff00ff) * anInt8878) + ((i_2576_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2572_ & 0xff00) * anInt8878) + ((i_2576_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_2547_] = i_2576_;
								} else if (i == 2) {
									int i_2577_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2546_]);
									if (i_2577_ != 0) {
										int i_2578_ = ((i_2577_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2579_ = ((i_2577_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2547_++] = ((i_2578_ | i_2579_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2291_ == 2) {
								if (i == 1) {
									int i_2580_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2546_]);
									if (i_2580_ != 0) {
										int i_2581_ = is[i_2547_];
										int i_2582_ = i_2580_ + i_2581_;
										int i_2583_ = ((i_2580_ & 0xff00ff) + (i_2581_ & 0xff00ff));
										i_2581_ = ((i_2583_ & 0x1000100) + (i_2582_ - i_2583_ & 0x10000));
										is[i_2547_] = (i_2582_ - i_2581_ | i_2581_ - (i_2581_ >>> 8));
									}
								} else if (i == 0) {
									int i_2584_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2546_]);
									if (i_2584_ != 0) {
										int i_2585_ = ((i_2584_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2586_ = ((i_2584_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2587_ = ((i_2584_ & 0xff) * anInt8882 & 0xff00);
										i_2584_ = (i_2585_ | i_2586_ | i_2587_) >>> 8;
										int i_2588_ = is[i_2547_];
										int i_2589_ = i_2584_ + i_2588_;
										int i_2590_ = ((i_2584_ & 0xff00ff) + (i_2588_ & 0xff00ff));
										i_2588_ = ((i_2590_ & 0x1000100) + (i_2589_ - i_2590_ & 0x10000));
										is[i_2547_] = (i_2589_ - i_2588_ | i_2588_ - (i_2588_ >>> 8));
									}
								} else if (i == 3) {
									int i_2591_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2546_]);
									int i_2592_ = anInt8877;
									int i_2593_ = i_2591_ + i_2592_;
									int i_2594_ = ((i_2591_ & 0xff00ff) + (i_2592_ & 0xff00ff));
									int i_2595_ = ((i_2594_ & 0x1000100) + (i_2593_ - i_2594_ & 0x10000));
									i_2591_ = (i_2593_ - i_2595_ | i_2595_ - (i_2595_ >>> 8));
									i_2595_ = is[i_2547_];
									i_2593_ = i_2591_ + i_2595_;
									i_2594_ = (i_2591_ & 0xff00ff) + (i_2595_ & 0xff00ff);
									i_2595_ = ((i_2594_ & 0x1000100) + (i_2593_ - i_2594_ & 0x10000));
									is[i_2547_] = (i_2593_ - i_2595_ | i_2595_ - (i_2595_ >>> 8));
								} else if (i == 2) {
									int i_2596_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2546_]);
									if (i_2596_ != 0) {
										int i_2597_ = ((i_2596_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2598_ = ((i_2596_ & 0xff00) * anInt8878 & 0xff0000);
										i_2596_ = (((i_2597_ | i_2598_) >>> 8) + anInt8885);
										int i_2599_ = is[i_2547_];
										int i_2600_ = i_2596_ + i_2599_;
										int i_2601_ = ((i_2596_ & 0xff00ff) + (i_2599_ & 0xff00ff));
										i_2599_ = ((i_2601_ & 0x1000100) + (i_2600_ - i_2601_ & 0x10000));
										is[i_2547_] = (i_2600_ - i_2599_ | i_2599_ - (i_2599_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2542_ += anInt8865;
							i_2543_ += anInt8868;
						}
						i_2540_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else {
					int i_2602_ = anInt8864;
					while (i_2602_ < 0) {
						int i_2603_ = anInt8870;
						int i_2604_ = anInt8873 + anInt8858;
						int i_2605_ = anInt8874 + anInt8866;
						int i_2606_ = anInt8862;
						int i_2607_;
						if ((i_2607_ = i_2604_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12)) >= 0) {
							i_2607_ = (anInt8865 - i_2607_) / anInt8865;
							i_2606_ += i_2607_;
							i_2604_ += anInt8865 * i_2607_;
							i_2605_ += anInt8868 * i_2607_;
							i_2603_ += i_2607_;
						}
						if ((i_2607_ = (i_2604_ - anInt8865) / anInt8865) > i_2606_)
							i_2606_ = i_2607_;
						if (i_2605_ < 0) {
							i_2607_ = (anInt8868 - 1 - i_2605_) / anInt8868;
							i_2606_ += i_2607_;
							i_2604_ += anInt8865 * i_2607_;
							i_2605_ += anInt8868 * i_2607_;
							i_2603_ += i_2607_;
						}
						if ((i_2607_ = (1 + i_2605_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_2606_)
							i_2606_ = i_2607_;
						for (/**/; i_2606_ < 0; i_2606_++) {
							int i_2608_ = (((i_2605_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_2604_ >> 12));
							int i_2609_ = i_2603_++;
							if (i_2291_ == 0) {
								if (i == 1)
									is[i_2609_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2608_]);
								else if (i == 0) {
									int i_2610_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2608_++]);
									int i_2611_ = ((i_2610_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2612_ = ((i_2610_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2613_ = ((i_2610_ & 0xff) * anInt8882 & 0xff00);
									is[i_2609_] = (i_2611_ | i_2612_ | i_2613_) >>> 8;
								} else if (i == 3) {
									int i_2614_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2608_++]);
									int i_2615_ = anInt8877;
									int i_2616_ = i_2614_ + i_2615_;
									int i_2617_ = ((i_2614_ & 0xff00ff) + (i_2615_ & 0xff00ff));
									int i_2618_ = ((i_2617_ & 0x1000100) + (i_2616_ - i_2617_ & 0x10000));
									is[i_2609_] = (i_2616_ - i_2618_ | i_2618_ - (i_2618_ >>> 8));
								} else if (i == 2) {
									int i_2619_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2608_]);
									int i_2620_ = ((i_2619_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2621_ = ((i_2619_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2609_] = (((i_2620_ | i_2621_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_2291_ == 1) {
								if (i == 1) {
									int i_2622_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2608_]);
									if (i_2622_ != 0)
										is[i_2609_] = i_2622_;
								} else if (i == 0) {
									int i_2623_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2608_]);
									if (i_2623_ != 0) {
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_2624_ = anInt8877 >>> 24;
											int i_2625_ = 256 - i_2624_;
											int i_2626_ = is[i_2609_];
											is[i_2609_] = (((((i_2623_ & 0xff00ff) * i_2624_) + ((i_2626_ & 0xff00ff) * i_2625_)) & ~0xff00ff) + ((((i_2623_ & 0xff00) * i_2624_) + ((i_2626_ & 0xff00) * i_2625_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_2627_ = (((i_2623_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2628_ = (((i_2623_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2629_ = ((i_2623_ & 0xff) * anInt8882 & 0xff00);
											i_2623_ = (i_2627_ | i_2628_ | i_2629_) >>> 8;
											int i_2630_ = is[i_2609_];
											is[i_2609_] = (((((i_2623_ & 0xff00ff) * anInt8878) + ((i_2630_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2623_ & 0xff00) * anInt8878) + ((i_2630_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_2631_ = (((i_2623_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2632_ = (((i_2623_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2633_ = ((i_2623_ & 0xff) * anInt8882 & 0xff00);
											is[i_2609_] = (i_2631_ | i_2632_ | i_2633_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_2634_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2608_]);
									int i_2635_ = anInt8877;
									int i_2636_ = i_2634_ + i_2635_;
									int i_2637_ = ((i_2634_ & 0xff00ff) + (i_2635_ & 0xff00ff));
									int i_2638_ = ((i_2637_ & 0x1000100) + (i_2636_ - i_2637_ & 0x10000));
									i_2638_ = (i_2636_ - i_2638_ | i_2638_ - (i_2638_ >>> 8));
									if (i_2634_ == 0 && anInt8878 != 255) {
										i_2634_ = i_2638_;
										i_2638_ = is[i_2609_];
										i_2638_ = (((((i_2634_ & 0xff00ff) * anInt8878) + ((i_2638_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2634_ & 0xff00) * anInt8878) + ((i_2638_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_2609_] = i_2638_;
								} else if (i == 2) {
									int i_2639_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2608_]);
									if (i_2639_ != 0) {
										int i_2640_ = ((i_2639_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2641_ = ((i_2639_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2609_++] = ((i_2640_ | i_2641_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2291_ == 2) {
								if (i == 1) {
									int i_2642_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2608_]);
									if (i_2642_ != 0) {
										int i_2643_ = is[i_2609_];
										int i_2644_ = i_2642_ + i_2643_;
										int i_2645_ = ((i_2642_ & 0xff00ff) + (i_2643_ & 0xff00ff));
										i_2643_ = ((i_2645_ & 0x1000100) + (i_2644_ - i_2645_ & 0x10000));
										is[i_2609_] = (i_2644_ - i_2643_ | i_2643_ - (i_2643_ >>> 8));
									}
								} else if (i == 0) {
									int i_2646_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2608_]);
									if (i_2646_ != 0) {
										int i_2647_ = ((i_2646_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2648_ = ((i_2646_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2649_ = ((i_2646_ & 0xff) * anInt8882 & 0xff00);
										i_2646_ = (i_2647_ | i_2648_ | i_2649_) >>> 8;
										int i_2650_ = is[i_2609_];
										int i_2651_ = i_2646_ + i_2650_;
										int i_2652_ = ((i_2646_ & 0xff00ff) + (i_2650_ & 0xff00ff));
										i_2650_ = ((i_2652_ & 0x1000100) + (i_2651_ - i_2652_ & 0x10000));
										is[i_2609_] = (i_2651_ - i_2650_ | i_2650_ - (i_2650_ >>> 8));
									}
								} else if (i == 3) {
									int i_2653_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2608_]);
									int i_2654_ = anInt8877;
									int i_2655_ = i_2653_ + i_2654_;
									int i_2656_ = ((i_2653_ & 0xff00ff) + (i_2654_ & 0xff00ff));
									int i_2657_ = ((i_2656_ & 0x1000100) + (i_2655_ - i_2656_ & 0x10000));
									i_2653_ = (i_2655_ - i_2657_ | i_2657_ - (i_2657_ >>> 8));
									i_2657_ = is[i_2609_];
									i_2655_ = i_2653_ + i_2657_;
									i_2656_ = (i_2653_ & 0xff00ff) + (i_2657_ & 0xff00ff);
									i_2657_ = ((i_2656_ & 0x1000100) + (i_2655_ - i_2656_ & 0x10000));
									is[i_2609_] = (i_2655_ - i_2657_ | i_2657_ - (i_2657_ >>> 8));
								} else if (i == 2) {
									int i_2658_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2608_]);
									if (i_2658_ != 0) {
										int i_2659_ = ((i_2658_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2660_ = ((i_2658_ & 0xff00) * anInt8878 & 0xff0000);
										i_2658_ = (((i_2659_ | i_2660_) >>> 8) + anInt8885);
										int i_2661_ = is[i_2609_];
										int i_2662_ = i_2658_ + i_2661_;
										int i_2663_ = ((i_2658_ & 0xff00ff) + (i_2661_ & 0xff00ff));
										i_2661_ = ((i_2663_ & 0x1000100) + (i_2662_ - i_2663_ & 0x10000));
										is[i_2609_] = (i_2662_ - i_2661_ | i_2661_ - (i_2661_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2604_ += anInt8865;
							i_2605_ += anInt8868;
						}
						i_2602_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8868 == 0) {
				int i_2664_ = anInt8864;
				while (i_2664_ < 0) {
					int i_2665_ = anInt8870;
					int i_2666_ = anInt8873 + anInt8858;
					int i_2667_ = anInt8874;
					int i_2668_ = anInt8862;
					if (i_2667_ >= 0 && i_2667_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) < 0) {
						if (i_2666_ < 0) {
							int i_2669_ = (anInt8865 - 1 - i_2666_) / anInt8865;
							i_2668_ += i_2669_;
							i_2666_ += anInt8865 * i_2669_;
							i_2665_ += i_2669_;
						}
						int i_2670_;
						if ((i_2670_ = (1 + i_2666_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_2668_)
							i_2668_ = i_2670_;
						for (/**/; i_2668_ < 0; i_2668_++) {
							int i_2671_ = (((i_2667_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_2666_ >> 12));
							int i_2672_ = i_2665_++;
							if (i_2291_ == 0) {
								if (i == 1)
									is[i_2672_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2671_]);
								else if (i == 0) {
									int i_2673_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2671_++]);
									int i_2674_ = ((i_2673_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2675_ = ((i_2673_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2676_ = ((i_2673_ & 0xff) * anInt8882 & 0xff00);
									is[i_2672_] = (i_2674_ | i_2675_ | i_2676_) >>> 8;
								} else if (i == 3) {
									int i_2677_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2671_++]);
									int i_2678_ = anInt8877;
									int i_2679_ = i_2677_ + i_2678_;
									int i_2680_ = ((i_2677_ & 0xff00ff) + (i_2678_ & 0xff00ff));
									int i_2681_ = ((i_2680_ & 0x1000100) + (i_2679_ - i_2680_ & 0x10000));
									is[i_2672_] = (i_2679_ - i_2681_ | i_2681_ - (i_2681_ >>> 8));
								} else if (i == 2) {
									int i_2682_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2671_]);
									int i_2683_ = ((i_2682_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2684_ = ((i_2682_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2672_] = (((i_2683_ | i_2684_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_2291_ == 1) {
								if (i == 1) {
									int i_2685_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2671_]);
									if (i_2685_ != 0)
										is[i_2672_] = i_2685_;
								} else if (i == 0) {
									int i_2686_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2671_]);
									if (i_2686_ != 0) {
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_2687_ = anInt8877 >>> 24;
											int i_2688_ = 256 - i_2687_;
											int i_2689_ = is[i_2672_];
											is[i_2672_] = (((((i_2686_ & 0xff00ff) * i_2687_) + ((i_2689_ & 0xff00ff) * i_2688_)) & ~0xff00ff) + ((((i_2686_ & 0xff00) * i_2687_) + ((i_2689_ & 0xff00) * i_2688_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_2690_ = (((i_2686_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2691_ = (((i_2686_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2692_ = ((i_2686_ & 0xff) * anInt8882 & 0xff00);
											i_2686_ = (i_2690_ | i_2691_ | i_2692_) >>> 8;
											int i_2693_ = is[i_2672_];
											is[i_2672_] = (((((i_2686_ & 0xff00ff) * anInt8878) + ((i_2693_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2686_ & 0xff00) * anInt8878) + ((i_2693_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_2694_ = (((i_2686_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2695_ = (((i_2686_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2696_ = ((i_2686_ & 0xff) * anInt8882 & 0xff00);
											is[i_2672_] = (i_2694_ | i_2695_ | i_2696_) >>> 8;
										}
									}
								} else if (i == 3) {
									int i_2697_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2671_]);
									int i_2698_ = anInt8877;
									int i_2699_ = i_2697_ + i_2698_;
									int i_2700_ = ((i_2697_ & 0xff00ff) + (i_2698_ & 0xff00ff));
									int i_2701_ = ((i_2700_ & 0x1000100) + (i_2699_ - i_2700_ & 0x10000));
									i_2701_ = (i_2699_ - i_2701_ | i_2701_ - (i_2701_ >>> 8));
									if (i_2697_ == 0 && anInt8878 != 255) {
										i_2697_ = i_2701_;
										i_2701_ = is[i_2672_];
										i_2701_ = (((((i_2697_ & 0xff00ff) * anInt8878) + ((i_2701_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2697_ & 0xff00) * anInt8878) + ((i_2701_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_2672_] = i_2701_;
								} else if (i == 2) {
									int i_2702_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2671_]);
									if (i_2702_ != 0) {
										int i_2703_ = ((i_2702_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2704_ = ((i_2702_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2672_++] = ((i_2703_ | i_2704_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2291_ == 2) {
								if (i == 1) {
									int i_2705_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2671_]);
									if (i_2705_ != 0) {
										int i_2706_ = is[i_2672_];
										int i_2707_ = i_2705_ + i_2706_;
										int i_2708_ = ((i_2705_ & 0xff00ff) + (i_2706_ & 0xff00ff));
										i_2706_ = ((i_2708_ & 0x1000100) + (i_2707_ - i_2708_ & 0x10000));
										is[i_2672_] = (i_2707_ - i_2706_ | i_2706_ - (i_2706_ >>> 8));
									}
								} else if (i == 0) {
									int i_2709_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2671_]);
									if (i_2709_ != 0) {
										int i_2710_ = ((i_2709_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2711_ = ((i_2709_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2712_ = ((i_2709_ & 0xff) * anInt8882 & 0xff00);
										i_2709_ = (i_2710_ | i_2711_ | i_2712_) >>> 8;
										int i_2713_ = is[i_2672_];
										int i_2714_ = i_2709_ + i_2713_;
										int i_2715_ = ((i_2709_ & 0xff00ff) + (i_2713_ & 0xff00ff));
										i_2713_ = ((i_2715_ & 0x1000100) + (i_2714_ - i_2715_ & 0x10000));
										is[i_2672_] = (i_2714_ - i_2713_ | i_2713_ - (i_2713_ >>> 8));
									}
								} else if (i == 3) {
									int i_2716_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2671_]);
									int i_2717_ = anInt8877;
									int i_2718_ = i_2716_ + i_2717_;
									int i_2719_ = ((i_2716_ & 0xff00ff) + (i_2717_ & 0xff00ff));
									int i_2720_ = ((i_2719_ & 0x1000100) + (i_2718_ - i_2719_ & 0x10000));
									i_2716_ = (i_2718_ - i_2720_ | i_2720_ - (i_2720_ >>> 8));
									i_2720_ = is[i_2672_];
									i_2718_ = i_2716_ + i_2720_;
									i_2719_ = (i_2716_ & 0xff00ff) + (i_2720_ & 0xff00ff);
									i_2720_ = ((i_2719_ & 0x1000100) + (i_2718_ - i_2719_ & 0x10000));
									is[i_2672_] = (i_2718_ - i_2720_ | i_2720_ - (i_2720_ >>> 8));
								} else if (i == 2) {
									int i_2721_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2671_]);
									if (i_2721_ != 0) {
										int i_2722_ = ((i_2721_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2723_ = ((i_2721_ & 0xff00) * anInt8878 & 0xff0000);
										i_2721_ = (((i_2722_ | i_2723_) >>> 8) + anInt8885);
										int i_2724_ = is[i_2672_];
										int i_2725_ = i_2721_ + i_2724_;
										int i_2726_ = ((i_2721_ & 0xff00ff) + (i_2724_ & 0xff00ff));
										i_2724_ = ((i_2726_ & 0x1000100) + (i_2725_ - i_2726_ & 0x10000));
										is[i_2672_] = (i_2725_ - i_2724_ | i_2724_ - (i_2724_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2666_ += anInt8865;
						}
					}
					i_2664_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else if (anInt8868 < 0) {
				for (int i_2727_ = anInt8864; i_2727_ < 0; i_2727_++) {
					int i_2728_ = anInt8870;
					int i_2729_ = anInt8873 + anInt8858;
					int i_2730_ = anInt8874 + anInt8866;
					int i_2731_ = anInt8862;
					if (i_2729_ < 0) {
						int i_2732_ = (anInt8865 - 1 - i_2729_) / anInt8865;
						i_2731_ += i_2732_;
						i_2729_ += anInt8865 * i_2732_;
						i_2730_ += anInt8868 * i_2732_;
						i_2728_ += i_2732_;
					}
					int i_2733_;
					if ((i_2733_ = (1 + i_2729_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_2731_)
						i_2731_ = i_2733_;
					if ((i_2733_ = i_2730_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12)) >= 0) {
						i_2733_ = (anInt8868 - i_2733_) / anInt8868;
						i_2731_ += i_2733_;
						i_2729_ += anInt8865 * i_2733_;
						i_2730_ += anInt8868 * i_2733_;
						i_2728_ += i_2733_;
					}
					if ((i_2733_ = (i_2730_ - anInt8868) / anInt8868) > i_2731_)
						i_2731_ = i_2733_;
					for (/**/; i_2731_ < 0; i_2731_++) {
						int i_2734_ = (((i_2730_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_2729_ >> 12));
						int i_2735_ = i_2728_++;
						if (i_2291_ == 0) {
							if (i == 1)
								is[i_2735_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2734_]);
							else if (i == 0) {
								int i_2736_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2734_++]);
								int i_2737_ = ((i_2736_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_2738_ = ((i_2736_ & 0xff00) * anInt8852 & 0xff0000);
								int i_2739_ = (i_2736_ & 0xff) * anInt8882 & 0xff00;
								is[i_2735_] = (i_2737_ | i_2738_ | i_2739_) >>> 8;
							} else if (i == 3) {
								int i_2740_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2734_++]);
								int i_2741_ = anInt8877;
								int i_2742_ = i_2740_ + i_2741_;
								int i_2743_ = ((i_2740_ & 0xff00ff) + (i_2741_ & 0xff00ff));
								int i_2744_ = ((i_2743_ & 0x1000100) + (i_2742_ - i_2743_ & 0x10000));
								is[i_2735_] = i_2742_ - i_2744_ | i_2744_ - (i_2744_ >>> 8);
							} else if (i == 2) {
								int i_2745_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2734_]);
								int i_2746_ = ((i_2745_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_2747_ = ((i_2745_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_2735_] = ((i_2746_ | i_2747_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_2291_ == 1) {
							if (i == 1) {
								int i_2748_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2734_]);
								if (i_2748_ != 0)
									is[i_2735_] = i_2748_;
							} else if (i == 0) {
								int i_2749_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2734_]);
								if (i_2749_ != 0) {
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_2750_ = anInt8877 >>> 24;
										int i_2751_ = 256 - i_2750_;
										int i_2752_ = is[i_2735_];
										is[i_2735_] = ((((i_2749_ & 0xff00ff) * i_2750_ + ((i_2752_ & 0xff00ff) * i_2751_)) & ~0xff00ff) + (((i_2749_ & 0xff00) * i_2750_ + ((i_2752_ & 0xff00) * i_2751_)) & 0xff0000)) >> 8;
									} else if (anInt8878 != 255) {
										int i_2753_ = ((i_2749_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2754_ = ((i_2749_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2755_ = ((i_2749_ & 0xff) * anInt8882 & 0xff00);
										i_2749_ = (i_2753_ | i_2754_ | i_2755_) >>> 8;
										int i_2756_ = is[i_2735_];
										is[i_2735_] = (((((i_2749_ & 0xff00ff) * anInt8878) + ((i_2756_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2749_ & 0xff00) * anInt8878) + ((i_2756_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									} else {
										int i_2757_ = ((i_2749_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2758_ = ((i_2749_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2759_ = ((i_2749_ & 0xff) * anInt8882 & 0xff00);
										is[i_2735_] = (i_2757_ | i_2758_ | i_2759_) >>> 8;
									}
								}
							} else if (i == 3) {
								int i_2760_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2734_]);
								int i_2761_ = anInt8877;
								int i_2762_ = i_2760_ + i_2761_;
								int i_2763_ = ((i_2760_ & 0xff00ff) + (i_2761_ & 0xff00ff));
								int i_2764_ = ((i_2763_ & 0x1000100) + (i_2762_ - i_2763_ & 0x10000));
								i_2764_ = i_2762_ - i_2764_ | i_2764_ - (i_2764_ >>> 8);
								if (i_2760_ == 0 && anInt8878 != 255) {
									i_2760_ = i_2764_;
									i_2764_ = is[i_2735_];
									i_2764_ = ((((i_2760_ & 0xff00ff) * anInt8878 + ((i_2764_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_2760_ & 0xff00) * anInt8878 + ((i_2764_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_2735_] = i_2764_;
							} else if (i == 2) {
								int i_2765_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2734_]);
								if (i_2765_ != 0) {
									int i_2766_ = ((i_2765_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2767_ = ((i_2765_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2735_++] = ((i_2766_ | i_2767_) >>> 8) + anInt8885;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2291_ == 2) {
							if (i == 1) {
								int i_2768_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2734_]);
								if (i_2768_ != 0) {
									int i_2769_ = is[i_2735_];
									int i_2770_ = i_2768_ + i_2769_;
									int i_2771_ = ((i_2768_ & 0xff00ff) + (i_2769_ & 0xff00ff));
									i_2769_ = ((i_2771_ & 0x1000100) + (i_2770_ - i_2771_ & 0x10000));
									is[i_2735_] = (i_2770_ - i_2769_ | i_2769_ - (i_2769_ >>> 8));
								}
							} else if (i == 0) {
								int i_2772_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2734_]);
								if (i_2772_ != 0) {
									int i_2773_ = ((i_2772_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2774_ = ((i_2772_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2775_ = ((i_2772_ & 0xff) * anInt8882 & 0xff00);
									i_2772_ = (i_2773_ | i_2774_ | i_2775_) >>> 8;
									int i_2776_ = is[i_2735_];
									int i_2777_ = i_2772_ + i_2776_;
									int i_2778_ = ((i_2772_ & 0xff00ff) + (i_2776_ & 0xff00ff));
									i_2776_ = ((i_2778_ & 0x1000100) + (i_2777_ - i_2778_ & 0x10000));
									is[i_2735_] = (i_2777_ - i_2776_ | i_2776_ - (i_2776_ >>> 8));
								}
							} else if (i == 3) {
								int i_2779_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2734_]);
								int i_2780_ = anInt8877;
								int i_2781_ = i_2779_ + i_2780_;
								int i_2782_ = ((i_2779_ & 0xff00ff) + (i_2780_ & 0xff00ff));
								int i_2783_ = ((i_2782_ & 0x1000100) + (i_2781_ - i_2782_ & 0x10000));
								i_2779_ = i_2781_ - i_2783_ | i_2783_ - (i_2783_ >>> 8);
								i_2783_ = is[i_2735_];
								i_2781_ = i_2779_ + i_2783_;
								i_2782_ = (i_2779_ & 0xff00ff) + (i_2783_ & 0xff00ff);
								i_2783_ = ((i_2782_ & 0x1000100) + (i_2781_ - i_2782_ & 0x10000));
								is[i_2735_] = i_2781_ - i_2783_ | i_2783_ - (i_2783_ >>> 8);
							} else if (i == 2) {
								int i_2784_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2734_]);
								if (i_2784_ != 0) {
									int i_2785_ = ((i_2784_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2786_ = ((i_2784_ & 0xff00) * anInt8878 & 0xff0000);
									i_2784_ = (((i_2785_ | i_2786_) >>> 8) + anInt8885);
									int i_2787_ = is[i_2735_];
									int i_2788_ = i_2784_ + i_2787_;
									int i_2789_ = ((i_2784_ & 0xff00ff) + (i_2787_ & 0xff00ff));
									i_2787_ = ((i_2789_ & 0x1000100) + (i_2788_ - i_2789_ & 0x10000));
									is[i_2735_] = (i_2788_ - i_2787_ | i_2787_ - (i_2787_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_2729_ += anInt8865;
						i_2730_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else {
				for (int i_2790_ = anInt8864; i_2790_ < 0; i_2790_++) {
					int i_2791_ = anInt8870;
					int i_2792_ = anInt8873 + anInt8858;
					int i_2793_ = anInt8874 + anInt8866;
					int i_2794_ = anInt8862;
					if (i_2792_ < 0) {
						int i_2795_ = (anInt8865 - 1 - i_2792_) / anInt8865;
						i_2794_ += i_2795_;
						i_2792_ += anInt8865 * i_2795_;
						i_2793_ += anInt8868 * i_2795_;
						i_2791_ += i_2795_;
					}
					int i_2796_;
					if ((i_2796_ = (1 + i_2792_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_2794_)
						i_2794_ = i_2796_;
					if (i_2793_ < 0) {
						i_2796_ = (anInt8868 - 1 - i_2793_) / anInt8868;
						i_2794_ += i_2796_;
						i_2792_ += anInt8865 * i_2796_;
						i_2793_ += anInt8868 * i_2796_;
						i_2791_ += i_2796_;
					}
					if ((i_2796_ = (1 + i_2793_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_2794_)
						i_2794_ = i_2796_;
					for (/**/; i_2794_ < 0; i_2794_++) {
						int i_2797_ = (((i_2793_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_2792_ >> 12));
						int i_2798_ = i_2791_++;
						if (i_2291_ == 0) {
							if (i == 1)
								is[i_2798_] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2797_]);
							else if (i == 0) {
								int i_2799_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2797_++]);
								int i_2800_ = ((i_2799_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_2801_ = ((i_2799_ & 0xff00) * anInt8852 & 0xff0000);
								int i_2802_ = (i_2799_ & 0xff) * anInt8882 & 0xff00;
								is[i_2798_] = (i_2800_ | i_2801_ | i_2802_) >>> 8;
							} else if (i == 3) {
								int i_2803_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2797_++]);
								int i_2804_ = anInt8877;
								int i_2805_ = i_2803_ + i_2804_;
								int i_2806_ = ((i_2803_ & 0xff00ff) + (i_2804_ & 0xff00ff));
								int i_2807_ = ((i_2806_ & 0x1000100) + (i_2805_ - i_2806_ & 0x10000));
								is[i_2798_] = i_2805_ - i_2807_ | i_2807_ - (i_2807_ >>> 8);
							} else if (i == 2) {
								int i_2808_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2797_]);
								int i_2809_ = ((i_2808_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_2810_ = ((i_2808_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_2798_] = ((i_2809_ | i_2810_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_2291_ == 1) {
							if (i == 1) {
								int i_2811_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2797_]);
								if (i_2811_ != 0)
									is[i_2798_] = i_2811_;
							} else if (i == 0) {
								int i_2812_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2797_]);
								if (i_2812_ != 0) {
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_2813_ = anInt8877 >>> 24;
										int i_2814_ = 256 - i_2813_;
										int i_2815_ = is[i_2798_];
										is[i_2798_] = ((((i_2812_ & 0xff00ff) * i_2813_ + ((i_2815_ & 0xff00ff) * i_2814_)) & ~0xff00ff) + (((i_2812_ & 0xff00) * i_2813_ + ((i_2815_ & 0xff00) * i_2814_)) & 0xff0000)) >> 8;
									} else if (anInt8878 != 255) {
										int i_2816_ = ((i_2812_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2817_ = ((i_2812_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2818_ = ((i_2812_ & 0xff) * anInt8882 & 0xff00);
										i_2812_ = (i_2816_ | i_2817_ | i_2818_) >>> 8;
										int i_2819_ = is[i_2798_];
										is[i_2798_] = (((((i_2812_ & 0xff00ff) * anInt8878) + ((i_2819_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2812_ & 0xff00) * anInt8878) + ((i_2819_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									} else {
										int i_2820_ = ((i_2812_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2821_ = ((i_2812_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2822_ = ((i_2812_ & 0xff) * anInt8882 & 0xff00);
										is[i_2798_] = (i_2820_ | i_2821_ | i_2822_) >>> 8;
									}
								}
							} else if (i == 3) {
								int i_2823_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2797_]);
								int i_2824_ = anInt8877;
								int i_2825_ = i_2823_ + i_2824_;
								int i_2826_ = ((i_2823_ & 0xff00ff) + (i_2824_ & 0xff00ff));
								int i_2827_ = ((i_2826_ & 0x1000100) + (i_2825_ - i_2826_ & 0x10000));
								i_2827_ = i_2825_ - i_2827_ | i_2827_ - (i_2827_ >>> 8);
								if (i_2823_ == 0 && anInt8878 != 255) {
									i_2823_ = i_2827_;
									i_2827_ = is[i_2798_];
									i_2827_ = ((((i_2823_ & 0xff00ff) * anInt8878 + ((i_2827_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_2823_ & 0xff00) * anInt8878 + ((i_2827_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_2798_] = i_2827_;
							} else if (i == 2) {
								int i_2828_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2797_]);
								if (i_2828_ != 0) {
									int i_2829_ = ((i_2828_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2830_ = ((i_2828_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2798_++] = ((i_2829_ | i_2830_) >>> 8) + anInt8885;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2291_ == 2) {
							if (i == 1) {
								int i_2831_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2797_]);
								if (i_2831_ != 0) {
									int i_2832_ = is[i_2798_];
									int i_2833_ = i_2831_ + i_2832_;
									int i_2834_ = ((i_2831_ & 0xff00ff) + (i_2832_ & 0xff00ff));
									i_2832_ = ((i_2834_ & 0x1000100) + (i_2833_ - i_2834_ & 0x10000));
									is[i_2798_] = (i_2833_ - i_2832_ | i_2832_ - (i_2832_ >>> 8));
								}
							} else if (i == 0) {
								int i_2835_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2797_]);
								if (i_2835_ != 0) {
									int i_2836_ = ((i_2835_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2837_ = ((i_2835_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2838_ = ((i_2835_ & 0xff) * anInt8882 & 0xff00);
									i_2835_ = (i_2836_ | i_2837_ | i_2838_) >>> 8;
									int i_2839_ = is[i_2798_];
									int i_2840_ = i_2835_ + i_2839_;
									int i_2841_ = ((i_2835_ & 0xff00ff) + (i_2839_ & 0xff00ff));
									i_2839_ = ((i_2841_ & 0x1000100) + (i_2840_ - i_2841_ & 0x10000));
									is[i_2798_] = (i_2840_ - i_2839_ | i_2839_ - (i_2839_ >>> 8));
								}
							} else if (i == 3) {
								int i_2842_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2797_]);
								int i_2843_ = anInt8877;
								int i_2844_ = i_2842_ + i_2843_;
								int i_2845_ = ((i_2842_ & 0xff00ff) + (i_2843_ & 0xff00ff));
								int i_2846_ = ((i_2845_ & 0x1000100) + (i_2844_ - i_2845_ & 0x10000));
								i_2842_ = i_2844_ - i_2846_ | i_2846_ - (i_2846_ >>> 8);
								i_2846_ = is[i_2798_];
								i_2844_ = i_2842_ + i_2846_;
								i_2845_ = (i_2842_ & 0xff00ff) + (i_2846_ & 0xff00ff);
								i_2846_ = ((i_2845_ & 0x1000100) + (i_2844_ - i_2845_ & 0x10000));
								is[i_2798_] = i_2844_ - i_2846_ | i_2846_ - (i_2846_ >>> 8);
							} else if (i == 2) {
								int i_2847_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_2797_]);
								if (i_2847_ != 0) {
									int i_2848_ = ((i_2847_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2849_ = ((i_2847_ & 0xff00) * anInt8878 & 0xff0000);
									i_2847_ = (((i_2848_ | i_2849_) >>> 8) + anInt8885);
									int i_2850_ = is[i_2798_];
									int i_2851_ = i_2847_ + i_2850_;
									int i_2852_ = ((i_2847_ & 0xff00ff) + (i_2850_ & 0xff00ff));
									i_2850_ = ((i_2852_ & 0x1000100) + (i_2851_ - i_2852_ & 0x10000));
									is[i_2798_] = (i_2851_ - i_2850_ | i_2850_ - (i_2850_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_2792_ += anInt8865;
						i_2793_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			}
		}
	}

	public void method2767(int i, int i_2853_, int i_2854_, int i_2855_, int i_2856_, int i_2857_) {
		int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_2858_ = 0; i_2858_ < i_2855_; i_2858_++) {
			int i_2859_ = ((i_2853_ + i_2858_) * ((Class160_Sub1_Sub1) this).anInt8851 + i);
			int i_2860_ = (((i_2857_ + i_2858_) * (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403)) + i_2856_);
			for (int i_2861_ = 0; i_2861_ < i_2854_; i_2861_++)
				((Class160_Sub1_Sub1) this).anIntArray10201[i_2859_ + i_2861_] = is[i_2860_ + i_2861_];
		}
	}

	void method14252(boolean bool, boolean bool_2862_, boolean bool_2863_, int i, int i_2864_, float f, int i_2865_, int i_2866_, int i_2867_, int i_2868_, int i_2869_, int i_2870_, boolean bool_2871_) {
		if (i_2865_ > 0 && i_2866_ > 0 && (bool || bool_2862_)) {
			int i_2872_ = 0;
			int i_2873_ = 0;
			int i_2874_ = (((Class160_Sub1_Sub1) this).anInt8853 + ((Class160_Sub1_Sub1) this).anInt8851 + ((Class160_Sub1_Sub1) this).anInt8855);
			int i_2875_ = (((Class160_Sub1_Sub1) this).anInt8854 + ((Class160_Sub1_Sub1) this).anInt8867 + ((Class160_Sub1_Sub1) this).anInt8856);
			int i_2876_ = (i_2874_ << 16) / i_2865_;
			int i_2877_ = (i_2875_ << 16) / i_2866_;
			if (((Class160_Sub1_Sub1) this).anInt8853 > 0) {
				int i_2878_ = (((((Class160_Sub1_Sub1) this).anInt8853 << 16) + i_2876_ - 1) / i_2876_);
				i += i_2878_;
				i_2872_ += (i_2878_ * i_2876_ - (((Class160_Sub1_Sub1) this).anInt8853 << 16));
			}
			if (((Class160_Sub1_Sub1) this).anInt8854 > 0) {
				int i_2879_ = (((((Class160_Sub1_Sub1) this).anInt8854 << 16) + i_2877_ - 1) / i_2877_);
				i_2864_ += i_2879_;
				i_2873_ += (i_2879_ * i_2877_ - (((Class160_Sub1_Sub1) this).anInt8854 << 16));
			}
			if (((Class160_Sub1_Sub1) this).anInt8851 < i_2874_)
				i_2865_ = ((((Class160_Sub1_Sub1) this).anInt8851 << 16) - i_2872_ + i_2876_ - 1) / i_2876_;
			if (((Class160_Sub1_Sub1) this).anInt8867 < i_2875_)
				i_2866_ = ((((Class160_Sub1_Sub1) this).anInt8867 << 16) - i_2873_ + i_2877_ - 1) / i_2877_;
			int i_2880_ = i + i_2864_ * ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980) * 444800403);
			int i_2881_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403) - i_2865_);
			if (i_2864_ + i_2866_ > (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_2866_ -= (i_2864_ + i_2866_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i_2864_ < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_2882_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_2864_);
				i_2866_ -= i_2882_;
				i_2880_ += i_2882_ * (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				i_2873_ += i_2877_ * i_2882_;
			}
			if (i + i_2865_ > (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_2883_ = (i + i_2865_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_2865_ -= i_2883_;
				i_2881_ += i_2883_;
			}
			if (i < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_2884_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_2865_ -= i_2884_;
				i_2880_ += i_2884_;
				i_2872_ += i_2876_ * i_2884_;
				i_2881_ += i_2884_;
			}
			float[] fs = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).aFloatArray9010);
			int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
			if (i_2869_ == 0) {
				if (i_2867_ == 1) {
					int i_2885_ = i_2872_;
					for (int i_2886_ = -i_2866_; i_2886_ < 0; i_2886_++) {
						int i_2887_ = ((i_2873_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2888_ = -i_2865_; i_2888_ < 0; i_2888_++) {
							if (!bool_2862_ || f < fs[i_2880_]) {
								if (bool)
									is[i_2880_] = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2872_ >> 16) + i_2887_]);
								if (bool_2862_ && bool_2871_)
									fs[i_2880_] = f;
							}
							i_2872_ += i_2876_;
							i_2880_++;
						}
						i_2873_ += i_2877_;
						i_2872_ = i_2885_;
						i_2880_ += i_2881_;
					}
				} else if (i_2867_ == 0) {
					int i_2889_ = (i_2868_ & 0xff0000) >> 16;
					int i_2890_ = (i_2868_ & 0xff00) >> 8;
					int i_2891_ = i_2868_ & 0xff;
					int i_2892_ = i_2872_;
					for (int i_2893_ = -i_2866_; i_2893_ < 0; i_2893_++) {
						int i_2894_ = ((i_2873_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2895_ = -i_2865_; i_2895_ < 0; i_2895_++) {
							if (!bool_2862_ || f < fs[i_2880_]) {
								if (bool) {
									int i_2896_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2872_ >> 16) + i_2894_]);
									int i_2897_ = ((i_2896_ & 0xff0000) * i_2889_ & ~0xffffff);
									int i_2898_ = ((i_2896_ & 0xff00) * i_2890_ & 0xff0000);
									int i_2899_ = (i_2896_ & 0xff) * i_2891_ & 0xff00;
									is[i_2880_] = (i_2897_ | i_2898_ | i_2899_) >>> 8;
								}
								if (bool_2862_ && bool_2871_)
									fs[i_2880_] = f;
							}
							i_2872_ += i_2876_;
							i_2880_++;
						}
						i_2873_ += i_2877_;
						i_2872_ = i_2892_;
						i_2880_ += i_2881_;
					}
				} else if (i_2867_ == 3) {
					int i_2900_ = i_2872_;
					for (int i_2901_ = -i_2866_; i_2901_ < 0; i_2901_++) {
						int i_2902_ = ((i_2873_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2903_ = -i_2865_; i_2903_ < 0; i_2903_++) {
							if (!bool_2862_ || f < fs[i_2880_]) {
								if (bool) {
									int i_2904_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2872_ >> 16) + i_2902_]);
									int i_2905_ = i_2904_ + i_2868_;
									int i_2906_ = ((i_2904_ & 0xff00ff) + (i_2868_ & 0xff00ff));
									int i_2907_ = ((i_2906_ & 0x1000100) + (i_2905_ - i_2906_ & 0x10000));
									is[i_2880_] = (i_2905_ - i_2907_ | i_2907_ - (i_2907_ >>> 8));
								}
								if (bool_2862_ && bool_2871_)
									fs[i_2880_] = f;
							}
							i_2872_ += i_2876_;
							i_2880_++;
						}
						i_2873_ += i_2877_;
						i_2872_ = i_2900_;
						i_2880_ += i_2881_;
					}
				} else if (i_2867_ == 2) {
					int i_2908_ = i_2868_ >>> 24;
					int i_2909_ = 256 - i_2908_;
					int i_2910_ = (i_2868_ & 0xff00ff) * i_2909_ & ~0xff00ff;
					int i_2911_ = (i_2868_ & 0xff00) * i_2909_ & 0xff0000;
					i_2868_ = (i_2910_ | i_2911_) >>> 8;
					int i_2912_ = i_2872_;
					for (int i_2913_ = -i_2866_; i_2913_ < 0; i_2913_++) {
						int i_2914_ = ((i_2873_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2915_ = -i_2865_; i_2915_ < 0; i_2915_++) {
							if (!bool_2862_ || f < fs[i_2880_]) {
								if (bool) {
									int i_2916_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2872_ >> 16) + i_2914_]);
									i_2910_ = ((i_2916_ & 0xff00ff) * i_2908_ & ~0xff00ff);
									i_2911_ = ((i_2916_ & 0xff00) * i_2908_ & 0xff0000);
									is[i_2880_] = (((i_2910_ | i_2911_) >>> 8) + i_2868_);
								}
								if (bool_2862_ && bool_2871_)
									fs[i_2880_] = f;
							}
							i_2872_ += i_2876_;
							i_2880_++;
						}
						i_2873_ += i_2877_;
						i_2872_ = i_2912_;
						i_2880_ += i_2881_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2869_ == 1) {
				if (i_2867_ == 1) {
					int i_2917_ = i_2872_;
					for (int i_2918_ = -i_2866_; i_2918_ < 0; i_2918_++) {
						int i_2919_ = ((i_2873_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2920_ = -i_2865_; i_2920_ < 0; i_2920_++) {
							if (!bool_2862_ || f < fs[i_2880_]) {
								int i_2921_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2872_ >> 16) + i_2919_]);
								if (i_2921_ != 0) {
									if (bool)
										is[i_2880_] = i_2921_;
									if (bool_2862_ && bool_2871_)
										fs[i_2880_] = f;
								}
							}
							i_2872_ += i_2876_;
							i_2880_++;
						}
						i_2873_ += i_2877_;
						i_2872_ = i_2917_;
						i_2880_ += i_2881_;
					}
				} else if (i_2867_ == 0) {
					int i_2922_ = i_2872_;
					if ((i_2868_ & 0xffffff) == 16777215) {
						int i_2923_ = i_2868_ >>> 24;
						int i_2924_ = 256 - i_2923_;
						for (int i_2925_ = -i_2866_; i_2925_ < 0; i_2925_++) {
							int i_2926_ = ((i_2873_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_2927_ = -i_2865_; i_2927_ < 0; i_2927_++) {
								if (!bool_2862_ || f < fs[i_2880_]) {
									int i_2928_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2872_ >> 16) + i_2926_]);
									if (i_2928_ != 0) {
										if (bool) {
											int i_2929_ = is[i_2880_];
											is[i_2880_] = (((((i_2928_ & 0xff00ff) * i_2923_) + ((i_2929_ & 0xff00ff) * i_2924_)) & ~0xff00ff) + ((((i_2928_ & 0xff00) * i_2923_) + ((i_2929_ & 0xff00) * i_2924_)) & 0xff0000)) >> 8;
										}
										if (bool_2862_ && bool_2871_)
											fs[i_2880_] = f;
									}
								}
								i_2872_ += i_2876_;
								i_2880_++;
							}
							i_2873_ += i_2877_;
							i_2872_ = i_2922_;
							i_2880_ += i_2881_;
						}
					} else {
						int i_2930_ = (i_2868_ & 0xff0000) >> 16;
						int i_2931_ = (i_2868_ & 0xff00) >> 8;
						int i_2932_ = i_2868_ & 0xff;
						int i_2933_ = i_2868_ >>> 24;
						int i_2934_ = 256 - i_2933_;
						for (int i_2935_ = -i_2866_; i_2935_ < 0; i_2935_++) {
							int i_2936_ = ((i_2873_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
							for (int i_2937_ = -i_2865_; i_2937_ < 0; i_2937_++) {
								if (!bool_2862_ || f < fs[i_2880_]) {
									int i_2938_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2872_ >> 16) + i_2936_]);
									if (i_2938_ != 0) {
										if (i_2933_ != 255) {
											if (bool) {
												int i_2939_ = (((i_2938_ & 0xff0000) * i_2930_) & ~0xffffff);
												int i_2940_ = (((i_2938_ & 0xff00) * i_2931_) & 0xff0000);
												int i_2941_ = (((i_2938_ & 0xff) * i_2932_) & 0xff00);
												i_2938_ = (i_2939_ | i_2940_ | i_2941_) >>> 8;
												int i_2942_ = is[i_2880_];
												is[i_2880_] = (((((i_2938_ & 0xff00ff) * i_2933_) + ((i_2942_ & 0xff00ff) * i_2934_)) & ~0xff00ff) + ((((i_2938_ & 0xff00) * i_2933_) + ((i_2942_ & 0xff00) * i_2934_)) & 0xff0000)) >> 8;
											}
											if (bool_2862_ && bool_2871_)
												fs[i_2880_] = f;
										} else {
											if (bool) {
												int i_2943_ = (((i_2938_ & 0xff0000) * i_2930_) & ~0xffffff);
												int i_2944_ = (((i_2938_ & 0xff00) * i_2931_) & 0xff0000);
												int i_2945_ = (((i_2938_ & 0xff) * i_2932_) & 0xff00);
												is[i_2880_] = (i_2943_ | i_2944_ | i_2945_) >>> 8;
											}
											if (bool_2862_ && bool_2871_)
												fs[i_2880_] = f;
										}
									}
								}
								i_2872_ += i_2876_;
								i_2880_++;
							}
							i_2873_ += i_2877_;
							i_2872_ = i_2922_;
							i_2880_ += i_2881_;
						}
					}
				} else if (i_2867_ == 3) {
					int i_2946_ = i_2872_;
					int i_2947_ = i_2868_ >>> 24;
					int i_2948_ = 256 - i_2947_;
					for (int i_2949_ = -i_2866_; i_2949_ < 0; i_2949_++) {
						int i_2950_ = ((i_2873_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2951_ = -i_2865_; i_2951_ < 0; i_2951_++) {
							if (!bool_2862_ || f < fs[i_2880_]) {
								if (bool) {
									int i_2952_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2872_ >> 16) + i_2950_]);
									int i_2953_ = i_2952_ + i_2868_;
									int i_2954_ = ((i_2952_ & 0xff00ff) + (i_2868_ & 0xff00ff));
									int i_2955_ = ((i_2954_ & 0x1000100) + (i_2953_ - i_2954_ & 0x10000));
									i_2955_ = (i_2953_ - i_2955_ | i_2955_ - (i_2955_ >>> 8));
									if (i_2952_ == 0 && i_2947_ != 255) {
										i_2952_ = i_2955_;
										i_2955_ = is[i_2880_];
										i_2955_ = ((((i_2952_ & 0xff00ff) * i_2947_ + ((i_2955_ & 0xff00ff) * i_2948_)) & ~0xff00ff) + (((i_2952_ & 0xff00) * i_2947_ + ((i_2955_ & 0xff00) * i_2948_)) & 0xff0000)) >> 8;
									}
									is[i_2880_] = i_2955_;
								}
								if (bool_2862_ && bool_2871_)
									fs[i_2880_] = f;
							}
							i_2872_ += i_2876_;
							i_2880_++;
						}
						i_2873_ += i_2877_;
						i_2872_ = i_2946_;
						i_2880_ += i_2881_;
					}
				} else if (i_2867_ == 2) {
					int i_2956_ = i_2868_ >>> 24;
					int i_2957_ = 256 - i_2956_;
					int i_2958_ = (i_2868_ & 0xff00ff) * i_2957_ & ~0xff00ff;
					int i_2959_ = (i_2868_ & 0xff00) * i_2957_ & 0xff0000;
					i_2868_ = (i_2958_ | i_2959_) >>> 8;
					int i_2960_ = i_2872_;
					for (int i_2961_ = -i_2866_; i_2961_ < 0; i_2961_++) {
						int i_2962_ = ((i_2873_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2963_ = -i_2865_; i_2963_ < 0; i_2963_++) {
							if (!bool_2862_ || f < fs[i_2880_]) {
								int i_2964_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2872_ >> 16) + i_2962_]);
								if (i_2964_ != 0) {
									if (bool) {
										i_2958_ = ((i_2964_ & 0xff00ff) * i_2956_ & ~0xff00ff);
										i_2959_ = ((i_2964_ & 0xff00) * i_2956_ & 0xff0000);
										is[i_2880_] = ((i_2958_ | i_2959_) >>> 8) + i_2868_;
									}
									if (bool_2862_ && bool_2871_)
										fs[i_2880_] = f;
								}
							}
							i_2872_ += i_2876_;
							i_2880_++;
						}
						i_2873_ += i_2877_;
						i_2872_ = i_2960_;
						i_2880_ += i_2881_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2869_ == 2) {
				if (i_2867_ == 1) {
					int i_2965_ = i_2872_;
					for (int i_2966_ = -i_2866_; i_2966_ < 0; i_2966_++) {
						int i_2967_ = ((i_2873_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2968_ = -i_2865_; i_2968_ < 0; i_2968_++) {
							if (!bool_2862_ || f < fs[i_2880_]) {
								int i_2969_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2872_ >> 16) + i_2967_]);
								if (i_2969_ != 0) {
									if (bool) {
										int i_2970_ = is[i_2880_];
										int i_2971_ = i_2969_ + i_2970_;
										int i_2972_ = ((i_2969_ & 0xff00ff) + (i_2970_ & 0xff00ff));
										i_2970_ = ((i_2972_ & 0x1000100) + (i_2971_ - i_2972_ & 0x10000));
										is[i_2880_] = (i_2971_ - i_2970_ | i_2970_ - (i_2970_ >>> 8));
									}
									if (bool_2862_ && bool_2871_)
										fs[i_2880_] = f;
								}
							}
							i_2872_ += i_2876_;
							i_2880_++;
						}
						i_2873_ += i_2877_;
						i_2872_ = i_2965_;
						i_2880_ += i_2881_;
					}
				} else if (i_2867_ == 0) {
					int i_2973_ = i_2872_;
					int i_2974_ = (i_2868_ & 0xff0000) >> 16;
					int i_2975_ = (i_2868_ & 0xff00) >> 8;
					int i_2976_ = i_2868_ & 0xff;
					for (int i_2977_ = -i_2866_; i_2977_ < 0; i_2977_++) {
						int i_2978_ = ((i_2873_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2979_ = -i_2865_; i_2979_ < 0; i_2979_++) {
							if (!bool_2862_ || f < fs[i_2880_]) {
								int i_2980_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2872_ >> 16) + i_2978_]);
								if (i_2980_ != 0) {
									if (bool) {
										int i_2981_ = ((i_2980_ & 0xff0000) * i_2974_ & ~0xffffff);
										int i_2982_ = ((i_2980_ & 0xff00) * i_2975_ & 0xff0000);
										int i_2983_ = ((i_2980_ & 0xff) * i_2976_ & 0xff00);
										i_2980_ = (i_2981_ | i_2982_ | i_2983_) >>> 8;
										int i_2984_ = is[i_2880_];
										int i_2985_ = i_2980_ + i_2984_;
										int i_2986_ = ((i_2980_ & 0xff00ff) + (i_2984_ & 0xff00ff));
										i_2984_ = ((i_2986_ & 0x1000100) + (i_2985_ - i_2986_ & 0x10000));
										is[i_2880_] = (i_2985_ - i_2984_ | i_2984_ - (i_2984_ >>> 8));
									}
									if (bool_2862_ && bool_2871_)
										fs[i_2880_] = f;
								}
							}
							i_2872_ += i_2876_;
							i_2880_++;
						}
						i_2873_ += i_2877_;
						i_2872_ = i_2973_;
						i_2880_ += i_2881_;
					}
				} else if (i_2867_ == 3) {
					int i_2987_ = i_2872_;
					for (int i_2988_ = -i_2866_; i_2988_ < 0; i_2988_++) {
						int i_2989_ = ((i_2873_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_2990_ = -i_2865_; i_2990_ < 0; i_2990_++) {
							if (!bool_2862_ || f < fs[i_2880_]) {
								if (bool) {
									int i_2991_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2872_ >> 16) + i_2989_]);
									int i_2992_ = i_2991_ + i_2868_;
									int i_2993_ = ((i_2991_ & 0xff00ff) + (i_2868_ & 0xff00ff));
									int i_2994_ = ((i_2993_ & 0x1000100) + (i_2992_ - i_2993_ & 0x10000));
									i_2991_ = (i_2992_ - i_2994_ | i_2994_ - (i_2994_ >>> 8));
									i_2994_ = is[i_2880_];
									i_2992_ = i_2991_ + i_2994_;
									i_2993_ = (i_2991_ & 0xff00ff) + (i_2994_ & 0xff00ff);
									i_2994_ = ((i_2993_ & 0x1000100) + (i_2992_ - i_2993_ & 0x10000));
									is[i_2880_] = (i_2992_ - i_2994_ | i_2994_ - (i_2994_ >>> 8));
								}
								if (bool_2862_ && bool_2871_)
									fs[i_2880_] = f;
							}
							i_2872_ += i_2876_;
							i_2880_++;
						}
						i_2873_ += i_2877_;
						i_2872_ = i_2987_;
						i_2880_ += i_2881_;
					}
				} else if (i_2867_ == 2) {
					int i_2995_ = i_2868_ >>> 24;
					int i_2996_ = 256 - i_2995_;
					int i_2997_ = (i_2868_ & 0xff00ff) * i_2996_ & ~0xff00ff;
					int i_2998_ = (i_2868_ & 0xff00) * i_2996_ & 0xff0000;
					i_2868_ = (i_2997_ | i_2998_) >>> 8;
					int i_2999_ = i_2872_;
					for (int i_3000_ = -i_2866_; i_3000_ < 0; i_3000_++) {
						int i_3001_ = ((i_2873_ >> 16) * ((Class160_Sub1_Sub1) this).anInt8851);
						for (int i_3002_ = -i_2865_; i_3002_ < 0; i_3002_++) {
							if (!bool_2862_ || f < fs[i_2880_]) {
								int i_3003_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(i_2872_ >> 16) + i_3001_]);
								if (i_3003_ != 0) {
									if (bool) {
										i_2997_ = ((i_3003_ & 0xff00ff) * i_2995_ & ~0xff00ff);
										i_2998_ = ((i_3003_ & 0xff00) * i_2995_ & 0xff0000);
										i_3003_ = (((i_2997_ | i_2998_) >>> 8) + i_2868_);
										int i_3004_ = is[i_2880_];
										int i_3005_ = i_3003_ + i_3004_;
										int i_3006_ = ((i_3003_ & 0xff00ff) + (i_3004_ & 0xff00ff));
										i_3004_ = ((i_3006_ & 0x1000100) + (i_3005_ - i_3006_ & 0x10000));
										is[i_2880_] = (i_3005_ - i_3004_ | i_3004_ - (i_3004_ >>> 8));
									}
									if (bool_2862_ && bool_2871_)
										fs[i_2880_] = f;
								}
							}
							i_2872_ += i_2876_;
							i_2880_++;
						}
						i_2873_ += i_2877_;
						i_2872_ = i_2999_;
						i_2880_ += i_2881_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2778(int i, int i_3007_, int i_3008_, int i_3009_, int i_3010_) {
		if (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			int i_3011_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			i += ((Class160_Sub1_Sub1) this).anInt8853;
			i_3007_ += ((Class160_Sub1_Sub1) this).anInt8854;
			int i_3012_ = i_3007_ * i_3011_ + i;
			int i_3013_ = 0;
			int i_3014_ = ((Class160_Sub1_Sub1) this).anInt8867;
			int i_3015_ = ((Class160_Sub1_Sub1) this).anInt8851;
			int i_3016_ = i_3011_ - i_3015_;
			int i_3017_ = 0;
			if (i_3007_ < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_3018_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_3007_);
				i_3014_ -= i_3018_;
				i_3007_ = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_3013_ += i_3018_ * i_3015_;
				i_3012_ += i_3018_ * i_3011_;
			}
			if (i_3007_ + i_3014_ > (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_3014_ -= (i_3007_ + i_3014_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i < (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_3019_ = ((((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_3015_ -= i_3019_;
				i = (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_3013_ += i_3019_;
				i_3012_ += i_3019_;
				i_3017_ += i_3019_;
				i_3016_ += i_3019_;
			}
			if (i + i_3015_ > (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_3020_ = (i + i_3015_ - (((HardwareRenderer) (((Class160_Sub1_Sub1) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_3015_ -= i_3020_;
				i_3017_ += i_3020_;
				i_3016_ += i_3020_;
			}
			if (i_3015_ > 0 && i_3014_ > 0) {
				if (i_3010_ == 0) {
					if (i_3008_ == 1) {
						for (int i_3021_ = -i_3014_; i_3021_ < 0; i_3021_++) {
							int i_3022_ = i_3012_ + i_3015_ - 3;
							while (i_3012_ < i_3022_) {
								is[i_3012_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								is[i_3012_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								is[i_3012_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								is[i_3012_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
							}
							i_3022_ += 3;
							while (i_3012_ < i_3022_)
								is[i_3012_++] = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
							i_3012_ += i_3016_;
							i_3013_ += i_3017_;
						}
					} else if (i_3008_ == 0) {
						int i_3023_ = (i_3009_ & 0xff0000) >> 16;
						int i_3024_ = (i_3009_ & 0xff00) >> 8;
						int i_3025_ = i_3009_ & 0xff;
						for (int i_3026_ = -i_3014_; i_3026_ < 0; i_3026_++) {
							for (int i_3027_ = -i_3015_; i_3027_ < 0; i_3027_++) {
								int i_3028_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								int i_3029_ = ((i_3028_ & 0xff0000) * i_3023_ & ~0xffffff);
								int i_3030_ = (i_3028_ & 0xff00) * i_3024_ & 0xff0000;
								int i_3031_ = (i_3028_ & 0xff) * i_3025_ & 0xff00;
								is[i_3012_++] = (i_3029_ | i_3030_ | i_3031_) >>> 8;
							}
							i_3012_ += i_3016_;
							i_3013_ += i_3017_;
						}
					} else if (i_3008_ == 3) {
						for (int i_3032_ = -i_3014_; i_3032_ < 0; i_3032_++) {
							for (int i_3033_ = -i_3015_; i_3033_ < 0; i_3033_++) {
								int i_3034_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								int i_3035_ = i_3034_ + i_3009_;
								int i_3036_ = ((i_3034_ & 0xff00ff) + (i_3009_ & 0xff00ff));
								int i_3037_ = ((i_3036_ & 0x1000100) + (i_3035_ - i_3036_ & 0x10000));
								is[i_3012_++] = i_3035_ - i_3037_ | i_3037_ - (i_3037_ >>> 8);
							}
							i_3012_ += i_3016_;
							i_3013_ += i_3017_;
						}
					} else if (i_3008_ == 2) {
						int i_3038_ = i_3009_ >>> 24;
						int i_3039_ = 256 - i_3038_;
						int i_3040_ = (i_3009_ & 0xff00ff) * i_3039_ & ~0xff00ff;
						int i_3041_ = (i_3009_ & 0xff00) * i_3039_ & 0xff0000;
						i_3009_ = (i_3040_ | i_3041_) >>> 8;
						for (int i_3042_ = -i_3014_; i_3042_ < 0; i_3042_++) {
							for (int i_3043_ = -i_3015_; i_3043_ < 0; i_3043_++) {
								int i_3044_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								i_3040_ = ((i_3044_ & 0xff00ff) * i_3038_ & ~0xff00ff);
								i_3041_ = (i_3044_ & 0xff00) * i_3038_ & 0xff0000;
								is[i_3012_++] = ((i_3040_ | i_3041_) >>> 8) + i_3009_;
							}
							i_3012_ += i_3016_;
							i_3013_ += i_3017_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3010_ == 1) {
					if (i_3008_ == 1) {
						for (int i_3045_ = -i_3014_; i_3045_ < 0; i_3045_++) {
							int i_3046_ = i_3012_ + i_3015_ - 3;
							while (i_3012_ < i_3046_) {
								int i_3047_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								if (i_3047_ != 0)
									is[i_3012_++] = i_3047_;
								else
									i_3012_++;
								i_3047_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								if (i_3047_ != 0)
									is[i_3012_++] = i_3047_;
								else
									i_3012_++;
								i_3047_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								if (i_3047_ != 0)
									is[i_3012_++] = i_3047_;
								else
									i_3012_++;
								i_3047_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								if (i_3047_ != 0)
									is[i_3012_++] = i_3047_;
								else
									i_3012_++;
							}
							i_3046_ += 3;
							while (i_3012_ < i_3046_) {
								int i_3048_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								if (i_3048_ != 0)
									is[i_3012_++] = i_3048_;
								else
									i_3012_++;
							}
							i_3012_ += i_3016_;
							i_3013_ += i_3017_;
						}
					} else if (i_3008_ == 0) {
						if ((i_3009_ & 0xffffff) == 16777215) {
							int i_3049_ = i_3009_ >>> 24;
							int i_3050_ = 256 - i_3049_;
							for (int i_3051_ = -i_3014_; i_3051_ < 0; i_3051_++) {
								for (int i_3052_ = -i_3015_; i_3052_ < 0; i_3052_++) {
									int i_3053_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
									if (i_3053_ != 0) {
										int i_3054_ = is[i_3012_];
										is[i_3012_++] = ((((i_3053_ & 0xff00ff) * i_3049_ + ((i_3054_ & 0xff00ff) * i_3050_)) & ~0xff00ff) + (((i_3053_ & 0xff00) * i_3049_ + ((i_3054_ & 0xff00) * i_3050_)) & 0xff0000)) >> 8;
									} else
										i_3012_++;
								}
								i_3012_ += i_3016_;
								i_3013_ += i_3017_;
							}
						} else {
							int i_3055_ = (i_3009_ & 0xff0000) >> 16;
							int i_3056_ = (i_3009_ & 0xff00) >> 8;
							int i_3057_ = i_3009_ & 0xff;
							int i_3058_ = i_3009_ >>> 24;
							int i_3059_ = 256 - i_3058_;
							for (int i_3060_ = -i_3014_; i_3060_ < 0; i_3060_++) {
								for (int i_3061_ = -i_3015_; i_3061_ < 0; i_3061_++) {
									int i_3062_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
									if (i_3062_ != 0) {
										if (i_3058_ != 255) {
											int i_3063_ = (((i_3062_ & 0xff0000) * i_3055_) & ~0xffffff);
											int i_3064_ = ((i_3062_ & 0xff00) * i_3056_ & 0xff0000);
											int i_3065_ = ((i_3062_ & 0xff) * i_3057_ & 0xff00);
											i_3062_ = (i_3063_ | i_3064_ | i_3065_) >>> 8;
											int i_3066_ = is[i_3012_];
											is[i_3012_++] = (((((i_3062_ & 0xff00ff) * i_3058_) + ((i_3066_ & 0xff00ff) * i_3059_)) & ~0xff00ff) + ((((i_3062_ & 0xff00) * i_3058_) + ((i_3066_ & 0xff00) * i_3059_)) & 0xff0000)) >> 8;
										} else {
											int i_3067_ = (((i_3062_ & 0xff0000) * i_3055_) & ~0xffffff);
											int i_3068_ = ((i_3062_ & 0xff00) * i_3056_ & 0xff0000);
											int i_3069_ = ((i_3062_ & 0xff) * i_3057_ & 0xff00);
											is[i_3012_++] = (i_3067_ | i_3068_ | i_3069_) >>> 8;
										}
									} else
										i_3012_++;
								}
								i_3012_ += i_3016_;
								i_3013_ += i_3017_;
							}
						}
					} else if (i_3008_ == 3) {
						int i_3070_ = i_3009_ >>> 24;
						int i_3071_ = 256 - i_3070_;
						for (int i_3072_ = -i_3014_; i_3072_ < 0; i_3072_++) {
							for (int i_3073_ = -i_3015_; i_3073_ < 0; i_3073_++) {
								int i_3074_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								int i_3075_ = i_3074_ + i_3009_;
								int i_3076_ = ((i_3074_ & 0xff00ff) + (i_3009_ & 0xff00ff));
								int i_3077_ = ((i_3076_ & 0x1000100) + (i_3075_ - i_3076_ & 0x10000));
								i_3077_ = i_3075_ - i_3077_ | i_3077_ - (i_3077_ >>> 8);
								if (i_3074_ == 0 && i_3070_ != 255) {
									i_3074_ = i_3077_;
									i_3077_ = is[i_3012_];
									i_3077_ = ((((i_3074_ & 0xff00ff) * i_3070_ + (i_3077_ & 0xff00ff) * i_3071_) & ~0xff00ff) + (((i_3074_ & 0xff00) * i_3070_ + (i_3077_ & 0xff00) * i_3071_) & 0xff0000)) >> 8;
								}
								is[i_3012_++] = i_3077_;
							}
							i_3012_ += i_3016_;
							i_3013_ += i_3017_;
						}
					} else if (i_3008_ == 2) {
						int i_3078_ = i_3009_ >>> 24;
						int i_3079_ = 256 - i_3078_;
						int i_3080_ = (i_3009_ & 0xff00ff) * i_3079_ & ~0xff00ff;
						int i_3081_ = (i_3009_ & 0xff00) * i_3079_ & 0xff0000;
						i_3009_ = (i_3080_ | i_3081_) >>> 8;
						for (int i_3082_ = -i_3014_; i_3082_ < 0; i_3082_++) {
							for (int i_3083_ = -i_3015_; i_3083_ < 0; i_3083_++) {
								int i_3084_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								if (i_3084_ != 0) {
									i_3080_ = ((i_3084_ & 0xff00ff) * i_3078_ & ~0xff00ff);
									i_3081_ = ((i_3084_ & 0xff00) * i_3078_ & 0xff0000);
									is[i_3012_++] = ((i_3080_ | i_3081_) >>> 8) + i_3009_;
								} else
									i_3012_++;
							}
							i_3012_ += i_3016_;
							i_3013_ += i_3017_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3010_ == 2) {
					if (i_3008_ == 1) {
						for (int i_3085_ = -i_3014_; i_3085_ < 0; i_3085_++) {
							for (int i_3086_ = -i_3015_; i_3086_ < 0; i_3086_++) {
								int i_3087_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								if (i_3087_ != 0) {
									int i_3088_ = is[i_3012_];
									int i_3089_ = i_3087_ + i_3088_;
									int i_3090_ = ((i_3087_ & 0xff00ff) + (i_3088_ & 0xff00ff));
									i_3088_ = ((i_3090_ & 0x1000100) + (i_3089_ - i_3090_ & 0x10000));
									is[i_3012_++] = (i_3089_ - i_3088_ | i_3088_ - (i_3088_ >>> 8));
								} else
									i_3012_++;
							}
							i_3012_ += i_3016_;
							i_3013_ += i_3017_;
						}
					} else if (i_3008_ == 0) {
						int i_3091_ = (i_3009_ & 0xff0000) >> 16;
						int i_3092_ = (i_3009_ & 0xff00) >> 8;
						int i_3093_ = i_3009_ & 0xff;
						for (int i_3094_ = -i_3014_; i_3094_ < 0; i_3094_++) {
							for (int i_3095_ = -i_3015_; i_3095_ < 0; i_3095_++) {
								int i_3096_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								if (i_3096_ != 0) {
									int i_3097_ = ((i_3096_ & 0xff0000) * i_3091_ & ~0xffffff);
									int i_3098_ = ((i_3096_ & 0xff00) * i_3092_ & 0xff0000);
									int i_3099_ = (i_3096_ & 0xff) * i_3093_ & 0xff00;
									i_3096_ = (i_3097_ | i_3098_ | i_3099_) >>> 8;
									int i_3100_ = is[i_3012_];
									int i_3101_ = i_3096_ + i_3100_;
									int i_3102_ = ((i_3096_ & 0xff00ff) + (i_3100_ & 0xff00ff));
									i_3100_ = ((i_3102_ & 0x1000100) + (i_3101_ - i_3102_ & 0x10000));
									is[i_3012_++] = (i_3101_ - i_3100_ | i_3100_ - (i_3100_ >>> 8));
								} else
									i_3012_++;
							}
							i_3012_ += i_3016_;
							i_3013_ += i_3017_;
						}
					} else if (i_3008_ == 3) {
						for (int i_3103_ = -i_3014_; i_3103_ < 0; i_3103_++) {
							for (int i_3104_ = -i_3015_; i_3104_ < 0; i_3104_++) {
								int i_3105_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								int i_3106_ = i_3105_ + i_3009_;
								int i_3107_ = ((i_3105_ & 0xff00ff) + (i_3009_ & 0xff00ff));
								int i_3108_ = ((i_3107_ & 0x1000100) + (i_3106_ - i_3107_ & 0x10000));
								i_3105_ = i_3106_ - i_3108_ | i_3108_ - (i_3108_ >>> 8);
								i_3108_ = is[i_3012_];
								i_3106_ = i_3105_ + i_3108_;
								i_3107_ = (i_3105_ & 0xff00ff) + (i_3108_ & 0xff00ff);
								i_3108_ = ((i_3107_ & 0x1000100) + (i_3106_ - i_3107_ & 0x10000));
								is[i_3012_++] = i_3106_ - i_3108_ | i_3108_ - (i_3108_ >>> 8);
							}
							i_3012_ += i_3016_;
							i_3013_ += i_3017_;
						}
					} else if (i_3008_ == 2) {
						int i_3109_ = i_3009_ >>> 24;
						int i_3110_ = 256 - i_3109_;
						int i_3111_ = (i_3009_ & 0xff00ff) * i_3110_ & ~0xff00ff;
						int i_3112_ = (i_3009_ & 0xff00) * i_3110_ & 0xff0000;
						i_3009_ = (i_3111_ | i_3112_) >>> 8;
						for (int i_3113_ = -i_3014_; i_3113_ < 0; i_3113_++) {
							for (int i_3114_ = -i_3015_; i_3114_ < 0; i_3114_++) {
								int i_3115_ = (((Class160_Sub1_Sub1) this).anIntArray10201[i_3013_++]);
								if (i_3115_ != 0) {
									i_3111_ = ((i_3115_ & 0xff00ff) * i_3109_ & ~0xff00ff);
									i_3112_ = ((i_3115_ & 0xff00) * i_3109_ & 0xff0000);
									i_3115_ = (((i_3111_ | i_3112_) >>> 8) + i_3009_);
									int i_3116_ = is[i_3012_];
									int i_3117_ = i_3115_ + i_3116_;
									int i_3118_ = ((i_3115_ & 0xff00ff) + (i_3116_ & 0xff00ff));
									i_3116_ = ((i_3118_ & 0x1000100) + (i_3117_ - i_3118_ & 0x10000));
									is[i_3012_++] = (i_3117_ - i_3116_ | i_3116_ - (i_3116_ >>> 8));
								} else
									i_3012_++;
							}
							i_3012_ += i_3016_;
							i_3013_ += i_3017_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	Class160_Sub1_Sub1(HardwareRenderer class505_sub3, int[] is, int i, int i_3119_) {
		super(class505_sub3, i, i_3119_);
		((Class160_Sub1_Sub1) this).anIntArray10201 = is;
	}

	void method14251(int[] is, int[] is_3120_, int i, int i_3121_) {
		int[] is_3122_ = (((HardwareRenderer) ((Class160_Sub1_Sub1) this).aClass505_Sub3_8875).anIntArray8979);
		if (is_3122_ != null) {
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					int i_3123_ = anInt8864;
					while (i_3123_ < 0) {
						int i_3124_ = i_3123_ + i_3121_;
						if (i_3124_ >= 0) {
							if (i_3124_ >= is.length)
								break;
							int i_3125_ = anInt8870;
							int i_3126_ = anInt8873;
							int i_3127_ = anInt8874;
							int i_3128_ = anInt8862;
							if (i_3126_ >= 0 && i_3127_ >= 0 && (i_3126_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12)) < 0 && (i_3127_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12)) < 0) {
								int i_3129_ = is[i_3124_] - i;
								int i_3130_ = -is_3120_[i_3124_];
								int i_3131_ = i_3129_ - (i_3125_ - anInt8870);
								if (i_3131_ > 0) {
									i_3125_ += i_3131_;
									i_3128_ += i_3131_;
									i_3126_ += anInt8865 * i_3131_;
									i_3127_ += anInt8868 * i_3131_;
								} else
									i_3130_ -= i_3131_;
								if (i_3128_ < i_3130_)
									i_3128_ = i_3130_;
								for (/**/; i_3128_ < 0; i_3128_++) {
									int i_3132_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(((i_3127_ >> 12) * (((Class160_Sub1_Sub1) this).anInt8851)) + (i_3126_ >> 12))]);
									if (i_3132_ != 0)
										is_3122_[i_3125_++] = i_3132_;
									else
										i_3125_++;
								}
							}
						}
						i_3123_++;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_3133_ = anInt8864;
					while (i_3133_ < 0) {
						int i_3134_ = i_3133_ + i_3121_;
						if (i_3134_ >= 0) {
							if (i_3134_ >= is.length)
								break;
							int i_3135_ = anInt8870;
							int i_3136_ = anInt8873;
							int i_3137_ = anInt8874 + anInt8866;
							int i_3138_ = anInt8862;
							if (i_3136_ >= 0 && (i_3136_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12)) < 0) {
								int i_3139_;
								if ((i_3139_ = i_3137_ - ((((Class160_Sub1_Sub1) this).anInt8867) << 12)) >= 0) {
									i_3139_ = (anInt8868 - i_3139_) / anInt8868;
									i_3138_ += i_3139_;
									i_3137_ += anInt8868 * i_3139_;
									i_3135_ += i_3139_;
								}
								if ((i_3139_ = (i_3137_ - anInt8868) / anInt8868) > i_3138_)
									i_3138_ = i_3139_;
								int i_3140_ = is[i_3134_] - i;
								int i_3141_ = -is_3120_[i_3134_];
								int i_3142_ = i_3140_ - (i_3135_ - anInt8870);
								if (i_3142_ > 0) {
									i_3135_ += i_3142_;
									i_3138_ += i_3142_;
									i_3136_ += anInt8865 * i_3142_;
									i_3137_ += anInt8868 * i_3142_;
								} else
									i_3141_ -= i_3142_;
								if (i_3138_ < i_3141_)
									i_3138_ = i_3141_;
								for (/**/; i_3138_ < 0; i_3138_++) {
									int i_3143_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(((i_3137_ >> 12) * (((Class160_Sub1_Sub1) this).anInt8851)) + (i_3136_ >> 12))]);
									if (i_3143_ != 0)
										is_3122_[i_3135_++] = i_3143_;
									else
										i_3135_++;
									i_3137_ += anInt8868;
								}
							}
						}
						i_3133_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				} else {
					int i_3144_ = anInt8864;
					while (i_3144_ < 0) {
						int i_3145_ = i_3144_ + i_3121_;
						if (i_3145_ >= 0) {
							if (i_3145_ >= is.length)
								break;
							int i_3146_ = anInt8870;
							int i_3147_ = anInt8873;
							int i_3148_ = anInt8874 + anInt8866;
							int i_3149_ = anInt8862;
							if (i_3147_ >= 0 && (i_3147_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12)) < 0) {
								if (i_3148_ < 0) {
									int i_3150_ = ((anInt8868 - 1 - i_3148_) / anInt8868);
									i_3149_ += i_3150_;
									i_3148_ += anInt8868 * i_3150_;
									i_3146_ += i_3150_;
								}
								int i_3151_;
								if ((i_3151_ = (1 + i_3148_ - ((((Class160_Sub1_Sub1) this).anInt8867) << 12) - anInt8868) / anInt8868) > i_3149_)
									i_3149_ = i_3151_;
								int i_3152_ = is[i_3145_] - i;
								int i_3153_ = -is_3120_[i_3145_];
								int i_3154_ = i_3152_ - (i_3146_ - anInt8870);
								if (i_3154_ > 0) {
									i_3146_ += i_3154_;
									i_3149_ += i_3154_;
									i_3147_ += anInt8865 * i_3154_;
									i_3148_ += anInt8868 * i_3154_;
								} else
									i_3153_ -= i_3154_;
								if (i_3149_ < i_3153_)
									i_3149_ = i_3153_;
								for (/**/; i_3149_ < 0; i_3149_++) {
									int i_3155_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(((i_3148_ >> 12) * (((Class160_Sub1_Sub1) this).anInt8851)) + (i_3147_ >> 12))]);
									if (i_3155_ != 0)
										is_3122_[i_3146_++] = i_3155_;
									else
										i_3146_++;
									i_3148_ += anInt8868;
								}
							}
						}
						i_3144_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					int i_3156_ = anInt8864;
					while (i_3156_ < 0) {
						int i_3157_ = i_3156_ + i_3121_;
						if (i_3157_ >= 0) {
							if (i_3157_ >= is.length)
								break;
							int i_3158_ = anInt8870;
							int i_3159_ = anInt8873 + anInt8858;
							int i_3160_ = anInt8874;
							int i_3161_ = anInt8862;
							if (i_3160_ >= 0 && (i_3160_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12)) < 0) {
								int i_3162_;
								if ((i_3162_ = i_3159_ - ((((Class160_Sub1_Sub1) this).anInt8851) << 12)) >= 0) {
									i_3162_ = (anInt8865 - i_3162_) / anInt8865;
									i_3161_ += i_3162_;
									i_3159_ += anInt8865 * i_3162_;
									i_3158_ += i_3162_;
								}
								if ((i_3162_ = (i_3159_ - anInt8865) / anInt8865) > i_3161_)
									i_3161_ = i_3162_;
								int i_3163_ = is[i_3157_] - i;
								int i_3164_ = -is_3120_[i_3157_];
								int i_3165_ = i_3163_ - (i_3158_ - anInt8870);
								if (i_3165_ > 0) {
									i_3158_ += i_3165_;
									i_3161_ += i_3165_;
									i_3159_ += anInt8865 * i_3165_;
									i_3160_ += anInt8868 * i_3165_;
								} else
									i_3164_ -= i_3165_;
								if (i_3161_ < i_3164_)
									i_3161_ = i_3164_;
								for (/**/; i_3161_ < 0; i_3161_++) {
									int i_3166_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(((i_3160_ >> 12) * (((Class160_Sub1_Sub1) this).anInt8851)) + (i_3159_ >> 12))]);
									if (i_3166_ != 0)
										is_3122_[i_3158_++] = i_3166_;
									else
										i_3158_++;
									i_3159_ += anInt8865;
								}
							}
						}
						i_3156_++;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_3167_ = anInt8864;
					while (i_3167_ < 0) {
						int i_3168_ = i_3167_ + i_3121_;
						if (i_3168_ >= 0) {
							if (i_3168_ >= is.length)
								break;
							int i_3169_ = anInt8870;
							int i_3170_ = anInt8873 + anInt8858;
							int i_3171_ = anInt8874 + anInt8866;
							int i_3172_ = anInt8862;
							int i_3173_;
							if ((i_3173_ = (i_3170_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12))) >= 0) {
								i_3173_ = (anInt8865 - i_3173_) / anInt8865;
								i_3172_ += i_3173_;
								i_3170_ += anInt8865 * i_3173_;
								i_3171_ += anInt8868 * i_3173_;
								i_3169_ += i_3173_;
							}
							if ((i_3173_ = (i_3170_ - anInt8865) / anInt8865) > i_3172_)
								i_3172_ = i_3173_;
							if ((i_3173_ = (i_3171_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12))) >= 0) {
								i_3173_ = (anInt8868 - i_3173_) / anInt8868;
								i_3172_ += i_3173_;
								i_3170_ += anInt8865 * i_3173_;
								i_3171_ += anInt8868 * i_3173_;
								i_3169_ += i_3173_;
							}
							if ((i_3173_ = (i_3171_ - anInt8868) / anInt8868) > i_3172_)
								i_3172_ = i_3173_;
							int i_3174_ = is[i_3168_] - i;
							int i_3175_ = -is_3120_[i_3168_];
							int i_3176_ = i_3174_ - (i_3169_ - anInt8870);
							if (i_3176_ > 0) {
								i_3169_ += i_3176_;
								i_3172_ += i_3176_;
								i_3170_ += anInt8865 * i_3176_;
								i_3171_ += anInt8868 * i_3176_;
							} else
								i_3175_ -= i_3176_;
							if (i_3172_ < i_3175_)
								i_3172_ = i_3175_;
							for (/**/; i_3172_ < 0; i_3172_++) {
								int i_3177_ = (((Class160_Sub1_Sub1) this).anIntArray10201[((i_3171_ >> 12) * (((Class160_Sub1_Sub1) this).anInt8851)) + (i_3170_ >> 12)]);
								if (i_3177_ != 0)
									is_3122_[i_3169_++] = i_3177_;
								else
									i_3169_++;
								i_3170_ += anInt8865;
								i_3171_ += anInt8868;
							}
						}
						i_3167_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else {
					int i_3178_ = anInt8864;
					while (i_3178_ < 0) {
						int i_3179_ = i_3178_ + i_3121_;
						if (i_3179_ >= 0) {
							if (i_3179_ >= is.length)
								break;
							int i_3180_ = anInt8870;
							int i_3181_ = anInt8873 + anInt8858;
							int i_3182_ = anInt8874 + anInt8866;
							int i_3183_ = anInt8862;
							int i_3184_;
							if ((i_3184_ = (i_3181_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12))) >= 0) {
								i_3184_ = (anInt8865 - i_3184_) / anInt8865;
								i_3183_ += i_3184_;
								i_3181_ += anInt8865 * i_3184_;
								i_3182_ += anInt8868 * i_3184_;
								i_3180_ += i_3184_;
							}
							if ((i_3184_ = (i_3181_ - anInt8865) / anInt8865) > i_3183_)
								i_3183_ = i_3184_;
							if (i_3182_ < 0) {
								i_3184_ = (anInt8868 - 1 - i_3182_) / anInt8868;
								i_3183_ += i_3184_;
								i_3181_ += anInt8865 * i_3184_;
								i_3182_ += anInt8868 * i_3184_;
								i_3180_ += i_3184_;
							}
							if ((i_3184_ = (1 + i_3182_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_3183_)
								i_3183_ = i_3184_;
							int i_3185_ = is[i_3179_] - i;
							int i_3186_ = -is_3120_[i_3179_];
							int i_3187_ = i_3185_ - (i_3180_ - anInt8870);
							if (i_3187_ > 0) {
								i_3180_ += i_3187_;
								i_3183_ += i_3187_;
								i_3181_ += anInt8865 * i_3187_;
								i_3182_ += anInt8868 * i_3187_;
							} else
								i_3186_ -= i_3187_;
							if (i_3183_ < i_3186_)
								i_3183_ = i_3186_;
							for (/**/; i_3183_ < 0; i_3183_++) {
								int i_3188_ = (((Class160_Sub1_Sub1) this).anIntArray10201[((i_3182_ >> 12) * (((Class160_Sub1_Sub1) this).anInt8851)) + (i_3181_ >> 12)]);
								if (i_3188_ != 0)
									is_3122_[i_3180_++] = i_3188_;
								else
									i_3180_++;
								i_3181_ += anInt8865;
								i_3182_ += anInt8868;
							}
						}
						i_3178_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8868 == 0) {
				int i_3189_ = anInt8864;
				while (i_3189_ < 0) {
					int i_3190_ = i_3189_ + i_3121_;
					if (i_3190_ >= 0) {
						if (i_3190_ >= is.length)
							break;
						int i_3191_ = anInt8870;
						int i_3192_ = anInt8873 + anInt8858;
						int i_3193_ = anInt8874;
						int i_3194_ = anInt8862;
						if (i_3193_ >= 0 && i_3193_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) < 0) {
							if (i_3192_ < 0) {
								int i_3195_ = (anInt8865 - 1 - i_3192_) / anInt8865;
								i_3194_ += i_3195_;
								i_3192_ += anInt8865 * i_3195_;
								i_3191_ += i_3195_;
							}
							int i_3196_;
							if ((i_3196_ = (1 + i_3192_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_3194_)
								i_3194_ = i_3196_;
							int i_3197_ = is[i_3190_] - i;
							int i_3198_ = -is_3120_[i_3190_];
							int i_3199_ = i_3197_ - (i_3191_ - anInt8870);
							if (i_3199_ > 0) {
								i_3191_ += i_3199_;
								i_3194_ += i_3199_;
								i_3192_ += anInt8865 * i_3199_;
								i_3193_ += anInt8868 * i_3199_;
							} else
								i_3198_ -= i_3199_;
							if (i_3194_ < i_3198_)
								i_3194_ = i_3198_;
							for (/**/; i_3194_ < 0; i_3194_++) {
								int i_3200_ = (((Class160_Sub1_Sub1) this).anIntArray10201[((i_3193_ >> 12) * (((Class160_Sub1_Sub1) this).anInt8851)) + (i_3192_ >> 12)]);
								if (i_3200_ != 0)
									is_3122_[i_3191_++] = i_3200_;
								else
									i_3191_++;
								i_3192_ += anInt8865;
							}
						}
					}
					i_3189_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else if (anInt8868 < 0) {
				int i_3201_ = anInt8864;
				while (i_3201_ < 0) {
					int i_3202_ = i_3201_ + i_3121_;
					if (i_3202_ >= 0) {
						if (i_3202_ >= is.length)
							break;
						int i_3203_ = anInt8870;
						int i_3204_ = anInt8873 + anInt8858;
						int i_3205_ = anInt8874 + anInt8866;
						int i_3206_ = anInt8862;
						if (i_3204_ < 0) {
							int i_3207_ = (anInt8865 - 1 - i_3204_) / anInt8865;
							i_3206_ += i_3207_;
							i_3204_ += anInt8865 * i_3207_;
							i_3205_ += anInt8868 * i_3207_;
							i_3203_ += i_3207_;
						}
						int i_3208_;
						if ((i_3208_ = (1 + i_3204_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_3206_)
							i_3206_ = i_3208_;
						if ((i_3208_ = i_3205_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12)) >= 0) {
							i_3208_ = (anInt8868 - i_3208_) / anInt8868;
							i_3206_ += i_3208_;
							i_3204_ += anInt8865 * i_3208_;
							i_3205_ += anInt8868 * i_3208_;
							i_3203_ += i_3208_;
						}
						if ((i_3208_ = (i_3205_ - anInt8868) / anInt8868) > i_3206_)
							i_3206_ = i_3208_;
						int i_3209_ = is[i_3202_] - i;
						int i_3210_ = -is_3120_[i_3202_];
						int i_3211_ = i_3209_ - (i_3203_ - anInt8870);
						if (i_3211_ > 0) {
							i_3203_ += i_3211_;
							i_3206_ += i_3211_;
							i_3204_ += anInt8865 * i_3211_;
							i_3205_ += anInt8868 * i_3211_;
						} else
							i_3210_ -= i_3211_;
						if (i_3206_ < i_3210_)
							i_3206_ = i_3210_;
						for (/**/; i_3206_ < 0; i_3206_++) {
							int i_3212_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(((i_3205_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_3204_ >> 12))]);
							if (i_3212_ != 0)
								is_3122_[i_3203_++] = i_3212_;
							else
								i_3203_++;
							i_3204_ += anInt8865;
							i_3205_ += anInt8868;
						}
					}
					i_3201_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else {
				int i_3213_ = anInt8864;
				while (i_3213_ < 0) {
					int i_3214_ = i_3213_ + i_3121_;
					if (i_3214_ >= 0) {
						if (i_3214_ >= is.length)
							break;
						int i_3215_ = anInt8870;
						int i_3216_ = anInt8873 + anInt8858;
						int i_3217_ = anInt8874 + anInt8866;
						int i_3218_ = anInt8862;
						if (i_3216_ < 0) {
							int i_3219_ = (anInt8865 - 1 - i_3216_) / anInt8865;
							i_3218_ += i_3219_;
							i_3216_ += anInt8865 * i_3219_;
							i_3217_ += anInt8868 * i_3219_;
							i_3215_ += i_3219_;
						}
						int i_3220_;
						if ((i_3220_ = (1 + i_3216_ - (((Class160_Sub1_Sub1) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_3218_)
							i_3218_ = i_3220_;
						if (i_3217_ < 0) {
							i_3220_ = (anInt8868 - 1 - i_3217_) / anInt8868;
							i_3218_ += i_3220_;
							i_3216_ += anInt8865 * i_3220_;
							i_3217_ += anInt8868 * i_3220_;
							i_3215_ += i_3220_;
						}
						if ((i_3220_ = (1 + i_3217_ - (((Class160_Sub1_Sub1) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_3218_)
							i_3218_ = i_3220_;
						int i_3221_ = is[i_3214_] - i;
						int i_3222_ = -is_3120_[i_3214_];
						int i_3223_ = i_3221_ - (i_3215_ - anInt8870);
						if (i_3223_ > 0) {
							i_3215_ += i_3223_;
							i_3218_ += i_3223_;
							i_3216_ += anInt8865 * i_3223_;
							i_3217_ += anInt8868 * i_3223_;
						} else
							i_3222_ -= i_3223_;
						if (i_3218_ < i_3222_)
							i_3218_ = i_3222_;
						for (/**/; i_3218_ < 0; i_3218_++) {
							int i_3224_ = (((Class160_Sub1_Sub1) this).anIntArray10201[(((i_3217_ >> 12) * ((Class160_Sub1_Sub1) this).anInt8851) + (i_3216_ >> 12))]);
							if (i_3224_ != 0)
								is_3122_[i_3215_++] = i_3224_;
							else
								i_3215_++;
							i_3216_ += anInt8865;
							i_3217_ += anInt8868;
						}
					}
					i_3213_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			}
		}
	}
}
