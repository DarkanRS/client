/* Class160_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class160_Sub1_Sub2 extends Class160_Sub1 {
	int[] anIntArray10220;
	byte[] aByteArray10221;

	void method2775(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (i_1_ > 0 && i_2_ > 0) {
			int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
			if (is != null) {
				int i_7_ = 0;
				int i_8_ = 0;
				int i_9_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				int i_10_ = (((Class160_Sub1_Sub2) this).anInt8853 + ((Class160_Sub1_Sub2) this).anInt8851 + ((Class160_Sub1_Sub2) this).anInt8855);
				int i_11_ = (((Class160_Sub1_Sub2) this).anInt8854 + ((Class160_Sub1_Sub2) this).anInt8867 + ((Class160_Sub1_Sub2) this).anInt8856);
				int i_12_ = (i_10_ << 16) / i_1_;
				int i_13_ = (i_11_ << 16) / i_2_;
				if (((Class160_Sub1_Sub2) this).anInt8853 > 0) {
					int i_14_ = (((((Class160_Sub1_Sub2) this).anInt8853 << 16) + i_12_ - 1) / i_12_);
					i += i_14_;
					i_7_ += (i_14_ * i_12_ - (((Class160_Sub1_Sub2) this).anInt8853 << 16));
				}
				if (((Class160_Sub1_Sub2) this).anInt8854 > 0) {
					int i_15_ = (((((Class160_Sub1_Sub2) this).anInt8854 << 16) + i_13_ - 1) / i_13_);
					i_0_ += i_15_;
					i_8_ += (i_15_ * i_13_ - (((Class160_Sub1_Sub2) this).anInt8854 << 16));
				}
				if (((Class160_Sub1_Sub2) this).anInt8851 < i_10_)
					i_1_ = ((((Class160_Sub1_Sub2) this).anInt8851 << 16) - i_7_ + i_12_ - 1) / i_12_;
				if (((Class160_Sub1_Sub2) this).anInt8867 < i_11_)
					i_2_ = ((((Class160_Sub1_Sub2) this).anInt8867 << 16) - i_8_ + i_13_ - 1) / i_13_;
				int i_16_ = i + i_0_ * i_9_;
				int i_17_ = i_9_ - i_1_;
				if (i_0_ + i_2_ > (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8986 * 1383960921))
					i_2_ -= (i_0_ + i_2_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
				if (i_0_ < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
					int i_18_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_0_);
					i_2_ -= i_18_;
					i_16_ += i_18_ * i_9_;
					i_8_ += i_13_ * i_18_;
				}
				if (i + i_1_ > (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
					int i_19_ = (i + i_1_ - (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt9002) * -1710988237);
					i_1_ -= i_19_;
					i_17_ += i_19_;
				}
				if (i < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
					int i_20_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
					i_1_ -= i_20_;
					i_16_ += i_20_;
					i_7_ += i_12_ * i_20_;
					i_17_ += i_20_;
				}
				if (i_5_ == 0) {
					if (i_3_ == 1) {
						int i_21_ = i_7_;
						for (int i_22_ = -i_2_; i_22_ < 0; i_22_++) {
							int i_23_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_24_ = -i_1_; i_24_ < 0; i_24_++) {
								is[i_16_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[(i_7_ >> 16) + i_23_]) & 0xff]);
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
							int i_30_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_31_ = -i_1_; i_31_ < 0; i_31_++) {
								int i_32_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[(i_7_ >> 16) + i_30_]) & 0xff]);
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
							int i_38_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_39_ = -i_1_; i_39_ < 0; i_39_++) {
								byte i_40_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_7_ >> 16) + i_38_]);
								int i_41_ = (i_40_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_40_]) : 0);
								int i_42_ = i_41_ + i_4_;
								int i_43_ = (i_41_ & 0xff00ff) + (i_4_ & 0xff00ff);
								int i_44_ = ((i_43_ & 0x1000100) + (i_42_ - i_43_ & 0x10000));
								is[i_16_++] = i_42_ - i_44_ | i_44_ - (i_44_ >>> 8);
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_36_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 2) {
						int i_45_ = i_4_ >>> 24;
						int i_46_ = 256 - i_45_;
						int i_47_ = (i_4_ & 0xff00ff) * i_46_ & ~0xff00ff;
						int i_48_ = (i_4_ & 0xff00) * i_46_ & 0xff0000;
						i_4_ = (i_47_ | i_48_) >>> 8;
						int i_49_ = i_7_;
						for (int i_50_ = -i_2_; i_50_ < 0; i_50_++) {
							int i_51_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_52_ = -i_1_; i_52_ < 0; i_52_++) {
								int i_53_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[(i_7_ >> 16) + i_51_]) & 0xff]);
								i_47_ = (i_53_ & 0xff00ff) * i_45_ & ~0xff00ff;
								i_48_ = (i_53_ & 0xff00) * i_45_ & 0xff0000;
								is[i_16_++] = ((i_47_ | i_48_) >>> 8) + i_4_;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_49_;
							i_16_ += i_17_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_5_ == 1) {
					if (i_3_ == 1) {
						int i_54_ = i_7_;
						for (int i_55_ = -i_2_; i_55_ < 0; i_55_++) {
							int i_56_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_57_ = -i_1_; i_57_ < 0; i_57_++) {
								int i_58_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_7_ >> 16) + i_56_]);
								if (i_58_ != 0)
									is[i_16_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_58_ & 0xff]);
								else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_54_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 0) {
						int i_59_ = i_7_;
						if ((i_4_ & 0xffffff) == 16777215) {
							int i_60_ = i_4_ >>> 24;
							int i_61_ = 256 - i_60_;
							for (int i_62_ = -i_2_; i_62_ < 0; i_62_++) {
								int i_63_ = ((i_8_ >> 16) * (((Class160_Sub1_Sub2) this).anInt8851));
								for (int i_64_ = -i_1_; i_64_ < 0; i_64_++) {
									int i_65_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_7_ >> 16) + i_63_]);
									if (i_65_ != 0) {
										int i_66_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_65_ & 0xff]);
										int i_67_ = is[i_16_];
										is[i_16_++] = ((((i_66_ & 0xff00ff) * i_60_ + (i_67_ & 0xff00ff) * i_61_) & ~0xff00ff) + (((i_66_ & 0xff00) * i_60_ + (i_67_ & 0xff00) * i_61_) & 0xff0000)) >> 8;
									} else
										i_16_++;
									i_7_ += i_12_;
								}
								i_8_ += i_13_;
								i_7_ = i_59_;
								i_16_ += i_17_;
							}
						} else {
							int i_68_ = (i_4_ & 0xff0000) >> 16;
							int i_69_ = (i_4_ & 0xff00) >> 8;
							int i_70_ = i_4_ & 0xff;
							int i_71_ = i_4_ >>> 24;
							int i_72_ = 256 - i_71_;
							for (int i_73_ = -i_2_; i_73_ < 0; i_73_++) {
								int i_74_ = ((i_8_ >> 16) * (((Class160_Sub1_Sub2) this).anInt8851));
								for (int i_75_ = -i_1_; i_75_ < 0; i_75_++) {
									int i_76_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_7_ >> 16) + i_74_]);
									if (i_76_ != 0) {
										int i_77_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_76_ & 0xff]);
										if (i_71_ != 255) {
											int i_78_ = ((i_77_ & 0xff0000) * i_68_ & ~0xffffff);
											int i_79_ = ((i_77_ & 0xff00) * i_69_ & 0xff0000);
											int i_80_ = ((i_77_ & 0xff) * i_70_ & 0xff00);
											i_77_ = ((i_78_ | i_79_ | i_80_) >>> 8);
											int i_81_ = is[i_16_];
											is[i_16_++] = ((((i_77_ & 0xff00ff) * i_71_ + ((i_81_ & 0xff00ff) * i_72_)) & ~0xff00ff) + (((i_77_ & 0xff00) * i_71_ + ((i_81_ & 0xff00) * i_72_)) & 0xff0000)) >> 8;
										} else {
											int i_82_ = ((i_77_ & 0xff0000) * i_68_ & ~0xffffff);
											int i_83_ = ((i_77_ & 0xff00) * i_69_ & 0xff0000);
											int i_84_ = ((i_77_ & 0xff) * i_70_ & 0xff00);
											is[i_16_++] = (i_82_ | i_83_ | i_84_) >>> 8;
										}
									} else
										i_16_++;
									i_7_ += i_12_;
								}
								i_8_ += i_13_;
								i_7_ = i_59_;
								i_16_ += i_17_;
							}
						}
					} else if (i_3_ == 3) {
						int i_85_ = i_7_;
						int i_86_ = i_4_ >>> 24;
						int i_87_ = 256 - i_86_;
						for (int i_88_ = -i_2_; i_88_ < 0; i_88_++) {
							int i_89_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_90_ = -i_1_; i_90_ < 0; i_90_++) {
								byte i_91_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_7_ >> 16) + i_89_]);
								int i_92_ = (i_91_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_91_]) : 0);
								int i_93_ = i_92_ + i_4_;
								int i_94_ = (i_92_ & 0xff00ff) + (i_4_ & 0xff00ff);
								int i_95_ = ((i_94_ & 0x1000100) + (i_93_ - i_94_ & 0x10000));
								i_95_ = i_93_ - i_95_ | i_95_ - (i_95_ >>> 8);
								if (i_92_ == 0 && i_86_ != 255) {
									i_92_ = i_95_;
									i_95_ = is[i_16_];
									i_95_ = ((((i_92_ & 0xff00ff) * i_86_ + (i_95_ & 0xff00ff) * i_87_) & ~0xff00ff) + (((i_92_ & 0xff00) * i_86_ + (i_95_ & 0xff00) * i_87_) & 0xff0000)) >> 8;
								}
								is[i_16_++] = i_95_;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_85_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 2) {
						int i_96_ = i_4_ >>> 24;
						int i_97_ = 256 - i_96_;
						int i_98_ = (i_4_ & 0xff00ff) * i_97_ & ~0xff00ff;
						int i_99_ = (i_4_ & 0xff00) * i_97_ & 0xff0000;
						i_4_ = (i_98_ | i_99_) >>> 8;
						int i_100_ = i_7_;
						for (int i_101_ = -i_2_; i_101_ < 0; i_101_++) {
							int i_102_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_103_ = -i_1_; i_103_ < 0; i_103_++) {
								int i_104_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_7_ >> 16) + i_102_]);
								if (i_104_ != 0) {
									int i_105_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_104_ & 0xff]);
									i_98_ = ((i_105_ & 0xff00ff) * i_96_ & ~0xff00ff);
									i_99_ = (i_105_ & 0xff00) * i_96_ & 0xff0000;
									is[i_16_++] = ((i_98_ | i_99_) >>> 8) + i_4_;
								} else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_100_;
							i_16_ += i_17_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_5_ == 2) {
					if (i_3_ == 1) {
						int i_106_ = i_7_;
						for (int i_107_ = -i_2_; i_107_ < 0; i_107_++) {
							int i_108_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_109_ = -i_1_; i_109_ < 0; i_109_++) {
								int i_110_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_7_ >> 16) + i_108_]);
								if (i_110_ != 0) {
									int i_111_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_110_ & 0xff]);
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
							i_7_ = i_106_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 0) {
						int i_115_ = i_7_;
						int i_116_ = (i_4_ & 0xff0000) >> 16;
						int i_117_ = (i_4_ & 0xff00) >> 8;
						int i_118_ = i_4_ & 0xff;
						for (int i_119_ = -i_2_; i_119_ < 0; i_119_++) {
							int i_120_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_121_ = -i_1_; i_121_ < 0; i_121_++) {
								int i_122_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_7_ >> 16) + i_120_]);
								if (i_122_ != 0) {
									int i_123_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_122_ & 0xff]);
									int i_124_ = ((i_123_ & 0xff0000) * i_116_ & ~0xffffff);
									int i_125_ = ((i_123_ & 0xff00) * i_117_ & 0xff0000);
									int i_126_ = (i_123_ & 0xff) * i_118_ & 0xff00;
									i_123_ = (i_124_ | i_125_ | i_126_) >>> 8;
									int i_127_ = is[i_16_];
									int i_128_ = i_123_ + i_127_;
									int i_129_ = ((i_123_ & 0xff00ff) + (i_127_ & 0xff00ff));
									i_127_ = ((i_129_ & 0x1000100) + (i_128_ - i_129_ & 0x10000));
									is[i_16_++] = i_128_ - i_127_ | i_127_ - (i_127_ >>> 8);
								} else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_115_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 3) {
						int i_130_ = i_7_;
						for (int i_131_ = -i_2_; i_131_ < 0; i_131_++) {
							int i_132_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_133_ = -i_1_; i_133_ < 0; i_133_++) {
								byte i_134_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_7_ >> 16) + i_132_]);
								int i_135_ = (i_134_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_134_]) : 0);
								int i_136_ = i_135_ + i_4_;
								int i_137_ = (i_135_ & 0xff00ff) + (i_4_ & 0xff00ff);
								int i_138_ = ((i_137_ & 0x1000100) + (i_136_ - i_137_ & 0x10000));
								i_135_ = i_136_ - i_138_ | i_138_ - (i_138_ >>> 8);
								i_138_ = is[i_16_];
								i_136_ = i_135_ + i_138_;
								i_137_ = (i_135_ & 0xff00ff) + (i_138_ & 0xff00ff);
								i_138_ = (i_137_ & 0x1000100) + (i_136_ - i_137_ & 0x10000);
								is[i_16_++] = i_136_ - i_138_ | i_138_ - (i_138_ >>> 8);
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_130_;
							i_16_ += i_17_;
						}
					} else if (i_3_ == 2) {
						int i_139_ = i_4_ >>> 24;
						int i_140_ = 256 - i_139_;
						int i_141_ = (i_4_ & 0xff00ff) * i_140_ & ~0xff00ff;
						int i_142_ = (i_4_ & 0xff00) * i_140_ & 0xff0000;
						i_4_ = (i_141_ | i_142_) >>> 8;
						int i_143_ = i_7_;
						for (int i_144_ = -i_2_; i_144_ < 0; i_144_++) {
							int i_145_ = ((i_8_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_146_ = -i_1_; i_146_ < 0; i_146_++) {
								int i_147_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_7_ >> 16) + i_145_]);
								if (i_147_ != 0) {
									int i_148_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_147_ & 0xff]);
									i_141_ = ((i_148_ & 0xff00ff) * i_139_ & ~0xff00ff);
									i_142_ = ((i_148_ & 0xff00) * i_139_ & 0xff0000);
									i_148_ = ((i_141_ | i_142_) >>> 8) + i_4_;
									int i_149_ = is[i_16_];
									int i_150_ = i_148_ + i_149_;
									int i_151_ = ((i_148_ & 0xff00ff) + (i_149_ & 0xff00ff));
									i_149_ = ((i_151_ & 0x1000100) + (i_150_ - i_151_ & 0x10000));
									is[i_16_++] = i_150_ - i_149_ | i_149_ - (i_149_ >>> 8);
								} else
									i_16_++;
								i_7_ += i_12_;
							}
							i_8_ += i_13_;
							i_7_ = i_143_;
							i_16_ += i_17_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2750(int i, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_) {
		throw new IllegalStateException();
	}

	Class160_Sub1_Sub2(Class505_Sub3 class505_sub3, byte[] is, int[] is_157_, int i, int i_158_) {
		super(class505_sub3, i, i_158_);
		((Class160_Sub1_Sub2) this).aByteArray10221 = is;
		((Class160_Sub1_Sub2) this).anIntArray10220 = is_157_;
	}

	void method2755(int i, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_, int i_165_) {
		if (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (i_160_ > 0 && i_161_ > 0) {
			int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
			if (is != null) {
				int i_166_ = 0;
				int i_167_ = 0;
				int i_168_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				int i_169_ = (((Class160_Sub1_Sub2) this).anInt8853 + ((Class160_Sub1_Sub2) this).anInt8851 + ((Class160_Sub1_Sub2) this).anInt8855);
				int i_170_ = (((Class160_Sub1_Sub2) this).anInt8854 + ((Class160_Sub1_Sub2) this).anInt8867 + ((Class160_Sub1_Sub2) this).anInt8856);
				int i_171_ = (i_169_ << 16) / i_160_;
				int i_172_ = (i_170_ << 16) / i_161_;
				if (((Class160_Sub1_Sub2) this).anInt8853 > 0) {
					int i_173_ = ((((Class160_Sub1_Sub2) this).anInt8853 << 16) + i_171_ - 1) / i_171_;
					i += i_173_;
					i_166_ += (i_173_ * i_171_ - (((Class160_Sub1_Sub2) this).anInt8853 << 16));
				}
				if (((Class160_Sub1_Sub2) this).anInt8854 > 0) {
					int i_174_ = ((((Class160_Sub1_Sub2) this).anInt8854 << 16) + i_172_ - 1) / i_172_;
					i_159_ += i_174_;
					i_167_ += (i_174_ * i_172_ - (((Class160_Sub1_Sub2) this).anInt8854 << 16));
				}
				if (((Class160_Sub1_Sub2) this).anInt8851 < i_169_)
					i_160_ = ((((Class160_Sub1_Sub2) this).anInt8851 << 16) - i_166_ + i_171_ - 1) / i_171_;
				if (((Class160_Sub1_Sub2) this).anInt8867 < i_170_)
					i_161_ = ((((Class160_Sub1_Sub2) this).anInt8867 << 16) - i_167_ + i_172_ - 1) / i_172_;
				int i_175_ = i + i_159_ * i_168_;
				int i_176_ = i_168_ - i_160_;
				if (i_159_ + i_161_ > (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8986 * 1383960921))
					i_161_ -= (i_159_ + i_161_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
				if (i_159_ < (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt9009) * 1516535457) {
					int i_177_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_159_;
					i_161_ -= i_177_;
					i_175_ += i_177_ * i_168_;
					i_167_ += i_172_ * i_177_;
				}
				if (i + i_160_ > (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
					int i_178_ = (i + i_160_ - (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt9002) * -1710988237);
					i_160_ -= i_178_;
					i_176_ += i_178_;
				}
				if (i < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
					int i_179_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i;
					i_160_ -= i_179_;
					i_175_ += i_179_;
					i_166_ += i_171_ * i_179_;
					i_176_ += i_179_;
				}
				if (i_164_ == 0) {
					if (i_162_ == 1) {
						int i_180_ = i_166_;
						for (int i_181_ = -i_161_; i_181_ < 0; i_181_++) {
							int i_182_ = ((i_167_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_183_ = -i_160_; i_183_ < 0; i_183_++) {
								is[i_175_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[(i_166_ >> 16) + i_182_]) & 0xff]);
								i_166_ += i_171_;
							}
							i_167_ += i_172_;
							i_166_ = i_180_;
							i_175_ += i_176_;
						}
					} else if (i_162_ == 0) {
						int i_184_ = (i_163_ & 0xff0000) >> 16;
						int i_185_ = (i_163_ & 0xff00) >> 8;
						int i_186_ = i_163_ & 0xff;
						int i_187_ = i_166_;
						for (int i_188_ = -i_161_; i_188_ < 0; i_188_++) {
							int i_189_ = ((i_167_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_190_ = -i_160_; i_190_ < 0; i_190_++) {
								int i_191_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[(i_166_ >> 16) + i_189_]) & 0xff]);
								int i_192_ = (i_191_ & 0xff0000) * i_184_ & ~0xffffff;
								int i_193_ = (i_191_ & 0xff00) * i_185_ & 0xff0000;
								int i_194_ = (i_191_ & 0xff) * i_186_ & 0xff00;
								is[i_175_++] = (i_192_ | i_193_ | i_194_) >>> 8;
								i_166_ += i_171_;
							}
							i_167_ += i_172_;
							i_166_ = i_187_;
							i_175_ += i_176_;
						}
					} else if (i_162_ == 3) {
						int i_195_ = i_166_;
						for (int i_196_ = -i_161_; i_196_ < 0; i_196_++) {
							int i_197_ = ((i_167_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_198_ = -i_160_; i_198_ < 0; i_198_++) {
								byte i_199_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_166_ >> 16) + i_197_]);
								int i_200_ = (i_199_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_199_]) : 0);
								int i_201_ = i_200_ + i_163_;
								int i_202_ = ((i_200_ & 0xff00ff) + (i_163_ & 0xff00ff));
								int i_203_ = ((i_202_ & 0x1000100) + (i_201_ - i_202_ & 0x10000));
								is[i_175_++] = i_201_ - i_203_ | i_203_ - (i_203_ >>> 8);
								i_166_ += i_171_;
							}
							i_167_ += i_172_;
							i_166_ = i_195_;
							i_175_ += i_176_;
						}
					} else if (i_162_ == 2) {
						int i_204_ = i_163_ >>> 24;
						int i_205_ = 256 - i_204_;
						int i_206_ = (i_163_ & 0xff00ff) * i_205_ & ~0xff00ff;
						int i_207_ = (i_163_ & 0xff00) * i_205_ & 0xff0000;
						i_163_ = (i_206_ | i_207_) >>> 8;
						int i_208_ = i_166_;
						for (int i_209_ = -i_161_; i_209_ < 0; i_209_++) {
							int i_210_ = ((i_167_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_211_ = -i_160_; i_211_ < 0; i_211_++) {
								int i_212_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[(i_166_ >> 16) + i_210_]) & 0xff]);
								i_206_ = (i_212_ & 0xff00ff) * i_204_ & ~0xff00ff;
								i_207_ = (i_212_ & 0xff00) * i_204_ & 0xff0000;
								is[i_175_++] = ((i_206_ | i_207_) >>> 8) + i_163_;
								i_166_ += i_171_;
							}
							i_167_ += i_172_;
							i_166_ = i_208_;
							i_175_ += i_176_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_164_ == 1) {
					if (i_162_ == 1) {
						int i_213_ = i_166_;
						for (int i_214_ = -i_161_; i_214_ < 0; i_214_++) {
							int i_215_ = ((i_167_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_216_ = -i_160_; i_216_ < 0; i_216_++) {
								int i_217_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_166_ >> 16) + i_215_]);
								if (i_217_ != 0)
									is[i_175_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_217_ & 0xff]);
								else
									i_175_++;
								i_166_ += i_171_;
							}
							i_167_ += i_172_;
							i_166_ = i_213_;
							i_175_ += i_176_;
						}
					} else if (i_162_ == 0) {
						int i_218_ = i_166_;
						if ((i_163_ & 0xffffff) == 16777215) {
							int i_219_ = i_163_ >>> 24;
							int i_220_ = 256 - i_219_;
							for (int i_221_ = -i_161_; i_221_ < 0; i_221_++) {
								int i_222_ = ((i_167_ >> 16) * (((Class160_Sub1_Sub2) this).anInt8851));
								for (int i_223_ = -i_160_; i_223_ < 0; i_223_++) {
									int i_224_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_166_ >> 16) + i_222_]);
									if (i_224_ != 0) {
										int i_225_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_224_ & 0xff]);
										int i_226_ = is[i_175_];
										is[i_175_++] = ((((i_225_ & 0xff00ff) * i_219_ + ((i_226_ & 0xff00ff) * i_220_)) & ~0xff00ff) + (((i_225_ & 0xff00) * i_219_ + ((i_226_ & 0xff00) * i_220_)) & 0xff0000)) >> 8;
									} else
										i_175_++;
									i_166_ += i_171_;
								}
								i_167_ += i_172_;
								i_166_ = i_218_;
								i_175_ += i_176_;
							}
						} else {
							int i_227_ = (i_163_ & 0xff0000) >> 16;
							int i_228_ = (i_163_ & 0xff00) >> 8;
							int i_229_ = i_163_ & 0xff;
							int i_230_ = i_163_ >>> 24;
							int i_231_ = 256 - i_230_;
							for (int i_232_ = -i_161_; i_232_ < 0; i_232_++) {
								int i_233_ = ((i_167_ >> 16) * (((Class160_Sub1_Sub2) this).anInt8851));
								for (int i_234_ = -i_160_; i_234_ < 0; i_234_++) {
									int i_235_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_166_ >> 16) + i_233_]);
									if (i_235_ != 0) {
										int i_236_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_235_ & 0xff]);
										if (i_230_ != 255) {
											int i_237_ = ((i_236_ & 0xff0000) * i_227_ & ~0xffffff);
											int i_238_ = ((i_236_ & 0xff00) * i_228_ & 0xff0000);
											int i_239_ = ((i_236_ & 0xff) * i_229_ & 0xff00);
											i_236_ = (i_237_ | i_238_ | i_239_) >>> 8;
											int i_240_ = is[i_175_];
											is[i_175_++] = (((((i_236_ & 0xff00ff) * i_230_) + ((i_240_ & 0xff00ff) * i_231_)) & ~0xff00ff) + ((((i_236_ & 0xff00) * i_230_) + ((i_240_ & 0xff00) * i_231_)) & 0xff0000)) >> 8;
										} else {
											int i_241_ = ((i_236_ & 0xff0000) * i_227_ & ~0xffffff);
											int i_242_ = ((i_236_ & 0xff00) * i_228_ & 0xff0000);
											int i_243_ = ((i_236_ & 0xff) * i_229_ & 0xff00);
											is[i_175_++] = (i_241_ | i_242_ | i_243_) >>> 8;
										}
									} else
										i_175_++;
									i_166_ += i_171_;
								}
								i_167_ += i_172_;
								i_166_ = i_218_;
								i_175_ += i_176_;
							}
						}
					} else if (i_162_ == 3) {
						int i_244_ = i_166_;
						int i_245_ = i_163_ >>> 24;
						int i_246_ = 256 - i_245_;
						for (int i_247_ = -i_161_; i_247_ < 0; i_247_++) {
							int i_248_ = ((i_167_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_249_ = -i_160_; i_249_ < 0; i_249_++) {
								byte i_250_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_166_ >> 16) + i_248_]);
								int i_251_ = (i_250_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_250_]) : 0);
								int i_252_ = i_251_ + i_163_;
								int i_253_ = ((i_251_ & 0xff00ff) + (i_163_ & 0xff00ff));
								int i_254_ = ((i_253_ & 0x1000100) + (i_252_ - i_253_ & 0x10000));
								i_254_ = i_252_ - i_254_ | i_254_ - (i_254_ >>> 8);
								if (i_251_ == 0 && i_245_ != 255) {
									i_251_ = i_254_;
									i_254_ = is[i_175_];
									i_254_ = ((((i_251_ & 0xff00ff) * i_245_ + (i_254_ & 0xff00ff) * i_246_) & ~0xff00ff) + (((i_251_ & 0xff00) * i_245_ + (i_254_ & 0xff00) * i_246_) & 0xff0000)) >> 8;
								}
								is[i_175_++] = i_254_;
								i_166_ += i_171_;
							}
							i_167_ += i_172_;
							i_166_ = i_244_;
							i_175_ += i_176_;
						}
					} else if (i_162_ == 2) {
						int i_255_ = i_163_ >>> 24;
						int i_256_ = 256 - i_255_;
						int i_257_ = (i_163_ & 0xff00ff) * i_256_ & ~0xff00ff;
						int i_258_ = (i_163_ & 0xff00) * i_256_ & 0xff0000;
						i_163_ = (i_257_ | i_258_) >>> 8;
						int i_259_ = i_166_;
						for (int i_260_ = -i_161_; i_260_ < 0; i_260_++) {
							int i_261_ = ((i_167_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_262_ = -i_160_; i_262_ < 0; i_262_++) {
								int i_263_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_166_ >> 16) + i_261_]);
								if (i_263_ != 0) {
									int i_264_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_263_ & 0xff]);
									i_257_ = ((i_264_ & 0xff00ff) * i_255_ & ~0xff00ff);
									i_258_ = ((i_264_ & 0xff00) * i_255_ & 0xff0000);
									is[i_175_++] = ((i_257_ | i_258_) >>> 8) + i_163_;
								} else
									i_175_++;
								i_166_ += i_171_;
							}
							i_167_ += i_172_;
							i_166_ = i_259_;
							i_175_ += i_176_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_164_ == 2) {
					if (i_162_ == 1) {
						int i_265_ = i_166_;
						for (int i_266_ = -i_161_; i_266_ < 0; i_266_++) {
							int i_267_ = ((i_167_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_268_ = -i_160_; i_268_ < 0; i_268_++) {
								int i_269_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_166_ >> 16) + i_267_]);
								if (i_269_ != 0) {
									int i_270_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_269_ & 0xff]);
									int i_271_ = is[i_175_];
									int i_272_ = i_270_ + i_271_;
									int i_273_ = ((i_270_ & 0xff00ff) + (i_271_ & 0xff00ff));
									i_271_ = ((i_273_ & 0x1000100) + (i_272_ - i_273_ & 0x10000));
									is[i_175_++] = i_272_ - i_271_ | i_271_ - (i_271_ >>> 8);
								} else
									i_175_++;
								i_166_ += i_171_;
							}
							i_167_ += i_172_;
							i_166_ = i_265_;
							i_175_ += i_176_;
						}
					} else if (i_162_ == 0) {
						int i_274_ = i_166_;
						int i_275_ = (i_163_ & 0xff0000) >> 16;
						int i_276_ = (i_163_ & 0xff00) >> 8;
						int i_277_ = i_163_ & 0xff;
						for (int i_278_ = -i_161_; i_278_ < 0; i_278_++) {
							int i_279_ = ((i_167_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_280_ = -i_160_; i_280_ < 0; i_280_++) {
								int i_281_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_166_ >> 16) + i_279_]);
								if (i_281_ != 0) {
									int i_282_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_281_ & 0xff]);
									int i_283_ = ((i_282_ & 0xff0000) * i_275_ & ~0xffffff);
									int i_284_ = ((i_282_ & 0xff00) * i_276_ & 0xff0000);
									int i_285_ = (i_282_ & 0xff) * i_277_ & 0xff00;
									i_282_ = (i_283_ | i_284_ | i_285_) >>> 8;
									int i_286_ = is[i_175_];
									int i_287_ = i_282_ + i_286_;
									int i_288_ = ((i_282_ & 0xff00ff) + (i_286_ & 0xff00ff));
									i_286_ = ((i_288_ & 0x1000100) + (i_287_ - i_288_ & 0x10000));
									is[i_175_++] = i_287_ - i_286_ | i_286_ - (i_286_ >>> 8);
								} else
									i_175_++;
								i_166_ += i_171_;
							}
							i_167_ += i_172_;
							i_166_ = i_274_;
							i_175_ += i_176_;
						}
					} else if (i_162_ == 3) {
						int i_289_ = i_166_;
						for (int i_290_ = -i_161_; i_290_ < 0; i_290_++) {
							int i_291_ = ((i_167_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_292_ = -i_160_; i_292_ < 0; i_292_++) {
								byte i_293_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_166_ >> 16) + i_291_]);
								int i_294_ = (i_293_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_293_]) : 0);
								int i_295_ = i_294_ + i_163_;
								int i_296_ = ((i_294_ & 0xff00ff) + (i_163_ & 0xff00ff));
								int i_297_ = ((i_296_ & 0x1000100) + (i_295_ - i_296_ & 0x10000));
								i_294_ = i_295_ - i_297_ | i_297_ - (i_297_ >>> 8);
								i_297_ = is[i_175_];
								i_295_ = i_294_ + i_297_;
								i_296_ = (i_294_ & 0xff00ff) + (i_297_ & 0xff00ff);
								i_297_ = (i_296_ & 0x1000100) + (i_295_ - i_296_ & 0x10000);
								is[i_175_++] = i_295_ - i_297_ | i_297_ - (i_297_ >>> 8);
								i_166_ += i_171_;
							}
							i_167_ += i_172_;
							i_166_ = i_289_;
							i_175_ += i_176_;
						}
					} else if (i_162_ == 2) {
						int i_298_ = i_163_ >>> 24;
						int i_299_ = 256 - i_298_;
						int i_300_ = (i_163_ & 0xff00ff) * i_299_ & ~0xff00ff;
						int i_301_ = (i_163_ & 0xff00) * i_299_ & 0xff0000;
						i_163_ = (i_300_ | i_301_) >>> 8;
						int i_302_ = i_166_;
						for (int i_303_ = -i_161_; i_303_ < 0; i_303_++) {
							int i_304_ = ((i_167_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_305_ = -i_160_; i_305_ < 0; i_305_++) {
								int i_306_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_166_ >> 16) + i_304_]);
								if (i_306_ != 0) {
									int i_307_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_306_ & 0xff]);
									i_300_ = ((i_307_ & 0xff00ff) * i_298_ & ~0xff00ff);
									i_301_ = ((i_307_ & 0xff00) * i_298_ & 0xff0000);
									i_307_ = ((i_300_ | i_301_) >>> 8) + i_163_;
									int i_308_ = is[i_175_];
									int i_309_ = i_307_ + i_308_;
									int i_310_ = ((i_307_ & 0xff00ff) + (i_308_ & 0xff00ff));
									i_308_ = ((i_310_ & 0x1000100) + (i_309_ - i_310_ & 0x10000));
									is[i_175_++] = i_309_ - i_308_ | i_308_ - (i_308_ >>> 8);
								} else
									i_175_++;
								i_166_ += i_171_;
							}
							i_167_ += i_172_;
							i_166_ = i_302_;
							i_175_ += i_176_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2742(int i, int i_311_, int i_312_, int i_313_, int i_314_) {
		if (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			int i_315_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			i += ((Class160_Sub1_Sub2) this).anInt8853;
			i_311_ += ((Class160_Sub1_Sub2) this).anInt8854;
			int i_316_ = i_311_ * i_315_ + i;
			int i_317_ = 0;
			int i_318_ = ((Class160_Sub1_Sub2) this).anInt8867;
			int i_319_ = ((Class160_Sub1_Sub2) this).anInt8851;
			int i_320_ = i_315_ - i_319_;
			int i_321_ = 0;
			if (i_311_ < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_322_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_311_);
				i_318_ -= i_322_;
				i_311_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_317_ += i_322_ * i_319_;
				i_316_ += i_322_ * i_315_;
			}
			if (i_311_ + i_318_ > (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_318_ -= (i_311_ + i_318_ - (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt8986) * 1383960921);
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_323_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_319_ -= i_323_;
				i = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_317_ += i_323_;
				i_316_ += i_323_;
				i_321_ += i_323_;
				i_320_ += i_323_;
			}
			if (i + i_319_ > (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt9002) * -1710988237) {
				int i_324_ = (i + i_319_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_319_ -= i_324_;
				i_321_ += i_324_;
				i_320_ += i_324_;
			}
			if (i_319_ > 0 && i_318_ > 0) {
				if (i_314_ == 0) {
					if (i_312_ == 1) {
						for (int i_325_ = -i_318_; i_325_ < 0; i_325_++) {
							int i_326_ = i_316_ + i_319_ - 3;
							while (i_316_ < i_326_) {
								is[i_316_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]) & 0xff]);
								is[i_316_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]) & 0xff]);
								is[i_316_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]) & 0xff]);
								is[i_316_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]) & 0xff]);
							}
							i_326_ += 3;
							while (i_316_ < i_326_)
								is[i_316_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]) & 0xff]);
							i_316_ += i_320_;
							i_317_ += i_321_;
						}
					} else if (i_312_ == 0) {
						int i_327_ = (i_313_ & 0xff0000) >> 16;
						int i_328_ = (i_313_ & 0xff00) >> 8;
						int i_329_ = i_313_ & 0xff;
						for (int i_330_ = -i_318_; i_330_ < 0; i_330_++) {
							for (int i_331_ = -i_319_; i_331_ < 0; i_331_++) {
								int i_332_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]) & 0xff]);
								int i_333_ = (i_332_ & 0xff0000) * i_327_ & ~0xffffff;
								int i_334_ = (i_332_ & 0xff00) * i_328_ & 0xff0000;
								int i_335_ = (i_332_ & 0xff) * i_329_ & 0xff00;
								is[i_316_++] = (i_333_ | i_334_ | i_335_) >>> 8;
							}
							i_316_ += i_320_;
							i_317_ += i_321_;
						}
					} else if (i_312_ == 3) {
						for (int i_336_ = -i_318_; i_336_ < 0; i_336_++) {
							for (int i_337_ = -i_319_; i_337_ < 0; i_337_++) {
								int i_338_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]) & 0xff]);
								int i_339_ = i_338_ + i_313_;
								int i_340_ = ((i_338_ & 0xff00ff) + (i_313_ & 0xff00ff));
								int i_341_ = ((i_340_ & 0x1000100) + (i_339_ - i_340_ & 0x10000));
								is[i_316_++] = i_339_ - i_341_ | i_341_ - (i_341_ >>> 8);
							}
							i_316_ += i_320_;
							i_317_ += i_321_;
						}
					} else if (i_312_ == 2) {
						int i_342_ = i_313_ >>> 24;
						int i_343_ = 256 - i_342_;
						int i_344_ = (i_313_ & 0xff00ff) * i_343_ & ~0xff00ff;
						int i_345_ = (i_313_ & 0xff00) * i_343_ & 0xff0000;
						i_313_ = (i_344_ | i_345_) >>> 8;
						for (int i_346_ = -i_318_; i_346_ < 0; i_346_++) {
							for (int i_347_ = -i_319_; i_347_ < 0; i_347_++) {
								int i_348_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]) & 0xff]);
								i_344_ = (i_348_ & 0xff00ff) * i_342_ & ~0xff00ff;
								i_345_ = (i_348_ & 0xff00) * i_342_ & 0xff0000;
								is[i_316_++] = ((i_344_ | i_345_) >>> 8) + i_313_;
							}
							i_316_ += i_320_;
							i_317_ += i_321_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_314_ == 1) {
					if (i_312_ == 1) {
						for (int i_349_ = -i_318_; i_349_ < 0; i_349_++) {
							for (int i_350_ = -i_319_; i_350_ < 0; i_350_++) {
								int i_351_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]);
								if (i_351_ != 0) {
									int i_352_ = ((((Class160_Sub1_Sub2) this).anIntArray10220[i_351_ & 0xff]) | ~0xffffff);
									int i_353_ = 255;
									int i_354_ = 0;
									int i_355_ = is[i_316_];
									is[i_316_++] = (((((i_352_ & 0xff00ff) * i_353_ + (i_355_ & 0xff00ff) * i_354_) & ~0xff00ff) >> 8) + (((((i_352_ & ~0xff00ff) >>> 8) * i_353_) + (((i_355_ & ~0xff00ff) >>> 8) * i_354_)) & ~0xff00ff));
								} else
									i_316_++;
							}
							i_316_ += i_320_;
							i_317_ += i_321_;
						}
					} else if (i_312_ == 0) {
						if ((i_313_ & 0xffffff) == 16777215) {
							int i_356_ = i_313_ >>> 24;
							int i_357_ = 256 - i_356_;
							for (int i_358_ = -i_318_; i_358_ < 0; i_358_++) {
								for (int i_359_ = -i_319_; i_359_ < 0; i_359_++) {
									int i_360_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]);
									if (i_360_ != 0) {
										int i_361_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_360_ & 0xff]);
										int i_362_ = is[i_316_];
										is[i_316_++] = ((((i_361_ & 0xff00ff) * i_356_ + ((i_362_ & 0xff00ff) * i_357_)) & ~0xff00ff) + (((i_361_ & 0xff00) * i_356_ + ((i_362_ & 0xff00) * i_357_)) & 0xff0000)) >> 8;
									} else
										i_316_++;
								}
								i_316_ += i_320_;
								i_317_ += i_321_;
							}
						} else {
							int i_363_ = (i_313_ & 0xff0000) >> 16;
							int i_364_ = (i_313_ & 0xff00) >> 8;
							int i_365_ = i_313_ & 0xff;
							int i_366_ = i_313_ >>> 24;
							int i_367_ = 256 - i_366_;
							for (int i_368_ = -i_318_; i_368_ < 0; i_368_++) {
								for (int i_369_ = -i_319_; i_369_ < 0; i_369_++) {
									int i_370_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]);
									if (i_370_ != 0) {
										int i_371_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_370_ & 0xff]);
										if (i_366_ != 255) {
											int i_372_ = ((i_371_ & 0xff0000) * i_363_ & ~0xffffff);
											int i_373_ = ((i_371_ & 0xff00) * i_364_ & 0xff0000);
											int i_374_ = ((i_371_ & 0xff) * i_365_ & 0xff00);
											i_371_ = (i_372_ | i_373_ | i_374_) >>> 8;
											int i_375_ = is[i_316_];
											is[i_316_++] = (((((i_371_ & 0xff00ff) * i_366_) + ((i_375_ & 0xff00ff) * i_367_)) & ~0xff00ff) + ((((i_371_ & 0xff00) * i_366_) + ((i_375_ & 0xff00) * i_367_)) & 0xff0000)) >> 8;
										} else {
											int i_376_ = ((i_371_ & 0xff0000) * i_363_ & ~0xffffff);
											int i_377_ = ((i_371_ & 0xff00) * i_364_ & 0xff0000);
											int i_378_ = ((i_371_ & 0xff) * i_365_ & 0xff00);
											is[i_316_++] = (i_376_ | i_377_ | i_378_) >>> 8;
										}
									} else
										i_316_++;
								}
								i_316_ += i_320_;
								i_317_ += i_321_;
							}
						}
					} else if (i_312_ == 3) {
						int i_379_ = i_313_ >>> 24;
						int i_380_ = 256 - i_379_;
						for (int i_381_ = -i_318_; i_381_ < 0; i_381_++) {
							for (int i_382_ = -i_319_; i_382_ < 0; i_382_++) {
								byte i_383_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]);
								int i_384_ = (i_383_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_383_]) : 0);
								int i_385_ = i_384_ + i_313_;
								int i_386_ = ((i_384_ & 0xff00ff) + (i_313_ & 0xff00ff));
								int i_387_ = ((i_386_ & 0x1000100) + (i_385_ - i_386_ & 0x10000));
								i_387_ = i_385_ - i_387_ | i_387_ - (i_387_ >>> 8);
								if (i_384_ == 0 && i_379_ != 255) {
									i_384_ = i_387_;
									i_387_ = is[i_316_];
									i_387_ = ((((i_384_ & 0xff00ff) * i_379_ + (i_387_ & 0xff00ff) * i_380_) & ~0xff00ff) + (((i_384_ & 0xff00) * i_379_ + (i_387_ & 0xff00) * i_380_) & 0xff0000)) >> 8;
								}
								is[i_316_++] = i_387_;
							}
							i_316_ += i_320_;
							i_317_ += i_321_;
						}
					} else if (i_312_ == 2) {
						int i_388_ = i_313_ >>> 24;
						int i_389_ = 256 - i_388_;
						int i_390_ = (i_313_ & 0xff00ff) * i_389_ & ~0xff00ff;
						int i_391_ = (i_313_ & 0xff00) * i_389_ & 0xff0000;
						i_313_ = (i_390_ | i_391_) >>> 8;
						for (int i_392_ = -i_318_; i_392_ < 0; i_392_++) {
							for (int i_393_ = -i_319_; i_393_ < 0; i_393_++) {
								int i_394_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]);
								if (i_394_ != 0) {
									int i_395_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_394_ & 0xff]);
									i_390_ = ((i_395_ & 0xff00ff) * i_388_ & ~0xff00ff);
									i_391_ = ((i_395_ & 0xff00) * i_388_ & 0xff0000);
									is[i_316_++] = ((i_390_ | i_391_) >>> 8) + i_313_;
								} else
									i_316_++;
							}
							i_316_ += i_320_;
							i_317_ += i_321_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_314_ == 2) {
					if (i_312_ == 1) {
						for (int i_396_ = -i_318_; i_396_ < 0; i_396_++) {
							for (int i_397_ = -i_319_; i_397_ < 0; i_397_++) {
								int i_398_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]);
								if (i_398_ != 0) {
									int i_399_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_398_ & 0xff]);
									int i_400_ = is[i_316_];
									int i_401_ = i_399_ + i_400_;
									int i_402_ = ((i_399_ & 0xff00ff) + (i_400_ & 0xff00ff));
									i_400_ = ((i_402_ & 0x1000100) + (i_401_ - i_402_ & 0x10000));
									is[i_316_++] = i_401_ - i_400_ | i_400_ - (i_400_ >>> 8);
								} else
									i_316_++;
							}
							i_316_ += i_320_;
							i_317_ += i_321_;
						}
					} else if (i_312_ == 0) {
						int i_403_ = (i_313_ & 0xff0000) >> 16;
						int i_404_ = (i_313_ & 0xff00) >> 8;
						int i_405_ = i_313_ & 0xff;
						for (int i_406_ = -i_318_; i_406_ < 0; i_406_++) {
							for (int i_407_ = -i_319_; i_407_ < 0; i_407_++) {
								int i_408_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]);
								if (i_408_ != 0) {
									int i_409_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_408_ & 0xff]);
									int i_410_ = ((i_409_ & 0xff0000) * i_403_ & ~0xffffff);
									int i_411_ = ((i_409_ & 0xff00) * i_404_ & 0xff0000);
									int i_412_ = (i_409_ & 0xff) * i_405_ & 0xff00;
									i_409_ = (i_410_ | i_411_ | i_412_) >>> 8;
									int i_413_ = is[i_316_];
									int i_414_ = i_409_ + i_413_;
									int i_415_ = ((i_409_ & 0xff00ff) + (i_413_ & 0xff00ff));
									i_413_ = ((i_415_ & 0x1000100) + (i_414_ - i_415_ & 0x10000));
									is[i_316_++] = i_414_ - i_413_ | i_413_ - (i_413_ >>> 8);
								} else
									i_316_++;
							}
							i_316_ += i_320_;
							i_317_ += i_321_;
						}
					} else if (i_312_ == 3) {
						for (int i_416_ = -i_318_; i_416_ < 0; i_416_++) {
							for (int i_417_ = -i_319_; i_417_ < 0; i_417_++) {
								byte i_418_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]);
								int i_419_ = (i_418_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_418_]) : 0);
								int i_420_ = i_419_ + i_313_;
								int i_421_ = ((i_419_ & 0xff00ff) + (i_313_ & 0xff00ff));
								int i_422_ = ((i_421_ & 0x1000100) + (i_420_ - i_421_ & 0x10000));
								i_419_ = i_420_ - i_422_ | i_422_ - (i_422_ >>> 8);
								i_422_ = is[i_316_];
								i_420_ = i_419_ + i_422_;
								i_421_ = (i_419_ & 0xff00ff) + (i_422_ & 0xff00ff);
								i_422_ = (i_421_ & 0x1000100) + (i_420_ - i_421_ & 0x10000);
								is[i_316_++] = i_420_ - i_422_ | i_422_ - (i_422_ >>> 8);
							}
							i_316_ += i_320_;
							i_317_ += i_321_;
						}
					} else if (i_312_ == 2) {
						int i_423_ = i_313_ >>> 24;
						int i_424_ = 256 - i_423_;
						int i_425_ = (i_313_ & 0xff00ff) * i_424_ & ~0xff00ff;
						int i_426_ = (i_313_ & 0xff00) * i_424_ & 0xff0000;
						i_313_ = (i_425_ | i_426_) >>> 8;
						for (int i_427_ = -i_318_; i_427_ < 0; i_427_++) {
							for (int i_428_ = -i_319_; i_428_ < 0; i_428_++) {
								int i_429_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_317_++]);
								if (i_429_ != 0) {
									int i_430_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_429_ & 0xff]);
									i_425_ = ((i_430_ & 0xff00ff) * i_423_ & ~0xff00ff);
									i_426_ = ((i_430_ & 0xff00) * i_423_ & 0xff0000);
									i_430_ = ((i_425_ | i_426_) >>> 8) + i_313_;
									int i_431_ = is[i_316_];
									int i_432_ = i_430_ + i_431_;
									int i_433_ = ((i_430_ & 0xff00ff) + (i_431_ & 0xff00ff));
									i_431_ = ((i_433_ & 0x1000100) + (i_432_ - i_433_ & 0x10000));
									is[i_316_++] = i_432_ - i_431_ | i_431_ - (i_431_ >>> 8);
								} else
									i_316_++;
							}
							i_316_ += i_320_;
							i_317_ += i_321_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2751(int i, int i_434_, int i_435_) {
		throw new IllegalStateException();
	}

	void method14247(boolean bool, boolean bool_436_, boolean bool_437_, int i, int i_438_, float f, int i_439_, int i_440_, int i_441_, int i_442_, int i_443_, int i_444_, boolean bool_445_) {
		if (i_439_ > 0 && i_440_ > 0 && (bool || bool_436_)) {
			int i_446_ = 0;
			int i_447_ = 0;
			int i_448_ = (((Class160_Sub1_Sub2) this).anInt8853 + ((Class160_Sub1_Sub2) this).anInt8851 + ((Class160_Sub1_Sub2) this).anInt8855);
			int i_449_ = (((Class160_Sub1_Sub2) this).anInt8854 + ((Class160_Sub1_Sub2) this).anInt8867 + ((Class160_Sub1_Sub2) this).anInt8856);
			int i_450_ = (i_448_ << 16) / i_439_;
			int i_451_ = (i_449_ << 16) / i_440_;
			if (((Class160_Sub1_Sub2) this).anInt8853 > 0) {
				int i_452_ = (((((Class160_Sub1_Sub2) this).anInt8853 << 16) + i_450_ - 1) / i_450_);
				i += i_452_;
				i_446_ += i_452_ * i_450_ - (((Class160_Sub1_Sub2) this).anInt8853 << 16);
			}
			if (((Class160_Sub1_Sub2) this).anInt8854 > 0) {
				int i_453_ = (((((Class160_Sub1_Sub2) this).anInt8854 << 16) + i_451_ - 1) / i_451_);
				i_438_ += i_453_;
				i_447_ += i_453_ * i_451_ - (((Class160_Sub1_Sub2) this).anInt8854 << 16);
			}
			if (((Class160_Sub1_Sub2) this).anInt8851 < i_448_)
				i_439_ = ((((Class160_Sub1_Sub2) this).anInt8851 << 16) - i_446_ + i_450_ - 1) / i_450_;
			if (((Class160_Sub1_Sub2) this).anInt8867 < i_449_)
				i_440_ = ((((Class160_Sub1_Sub2) this).anInt8867 << 16) - i_447_ + i_451_ - 1) / i_451_;
			int i_454_ = i + i_438_ * ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980) * 444800403);
			int i_455_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980 * 444800403) - i_439_);
			if (i_438_ + i_440_ > (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_440_ -= (i_438_ + i_440_ - (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt8986) * 1383960921);
			if (i_438_ < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_456_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_438_);
				i_440_ -= i_456_;
				i_454_ += i_456_ * ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980) * 444800403);
				i_447_ += i_451_ * i_456_;
			}
			if (i + i_439_ > (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt9002) * -1710988237) {
				int i_457_ = (i + i_439_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_439_ -= i_457_;
				i_455_ += i_457_;
			}
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_458_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_439_ -= i_458_;
				i_454_ += i_458_;
				i_446_ += i_450_ * i_458_;
				i_455_ += i_458_;
			}
			float[] fs = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).aFloatArray9010);
			int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
			if (i_443_ == 0) {
				if (i_441_ == 1) {
					int i_459_ = i_446_;
					for (int i_460_ = -i_440_; i_460_ < 0; i_460_++) {
						int i_461_ = ((i_447_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_462_ = -i_439_; i_462_ < 0; i_462_++) {
							if (!bool_436_ || f < fs[i_454_]) {
								if (bool)
									is[i_454_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[(i_446_ >> 16) + i_461_]) & 0xff)]);
								if (bool_436_ && bool_445_)
									fs[i_454_] = f;
							}
							i_446_ += i_450_;
							i_454_++;
						}
						i_447_ += i_451_;
						i_446_ = i_459_;
						i_454_ += i_455_;
					}
				} else if (i_441_ == 0) {
					int i_463_ = (i_442_ & 0xff0000) >> 16;
					int i_464_ = (i_442_ & 0xff00) >> 8;
					int i_465_ = i_442_ & 0xff;
					int i_466_ = i_446_;
					for (int i_467_ = -i_440_; i_467_ < 0; i_467_++) {
						int i_468_ = ((i_447_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_469_ = -i_439_; i_469_ < 0; i_469_++) {
							if (!bool_436_ || f < fs[i_454_]) {
								if (bool) {
									int i_470_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[(i_446_ >> 16) + i_468_]) & 0xff)]);
									int i_471_ = ((i_470_ & 0xff0000) * i_463_ & ~0xffffff);
									int i_472_ = ((i_470_ & 0xff00) * i_464_ & 0xff0000);
									int i_473_ = (i_470_ & 0xff) * i_465_ & 0xff00;
									is[i_454_] = (i_471_ | i_472_ | i_473_) >>> 8;
								}
								if (bool_436_ && bool_445_)
									fs[i_454_] = f;
							}
							i_446_ += i_450_;
							i_454_++;
						}
						i_447_ += i_451_;
						i_446_ = i_466_;
						i_454_ += i_455_;
					}
				} else if (i_441_ == 3) {
					int i_474_ = i_446_;
					for (int i_475_ = -i_440_; i_475_ < 0; i_475_++) {
						int i_476_ = ((i_447_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_477_ = -i_439_; i_477_ < 0; i_477_++) {
							if (!bool_436_ || f < fs[i_454_]) {
								if (bool) {
									byte i_478_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_446_ >> 16) + i_476_]);
									int i_479_ = (i_478_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_478_]) : 0);
									int i_480_ = i_479_ + i_442_;
									int i_481_ = ((i_479_ & 0xff00ff) + (i_442_ & 0xff00ff));
									int i_482_ = ((i_481_ & 0x1000100) + (i_480_ - i_481_ & 0x10000));
									is[i_454_] = i_480_ - i_482_ | i_482_ - (i_482_ >>> 8);
								}
								if (bool_436_ && bool_445_)
									fs[i_454_] = f;
							}
							i_446_ += i_450_;
							i_454_++;
						}
						i_447_ += i_451_;
						i_446_ = i_474_;
						i_454_ += i_455_;
					}
				} else if (i_441_ == 2) {
					int i_483_ = i_442_ >>> 24;
					int i_484_ = 256 - i_483_;
					int i_485_ = (i_442_ & 0xff00ff) * i_484_ & ~0xff00ff;
					int i_486_ = (i_442_ & 0xff00) * i_484_ & 0xff0000;
					i_442_ = (i_485_ | i_486_) >>> 8;
					int i_487_ = i_446_;
					for (int i_488_ = -i_440_; i_488_ < 0; i_488_++) {
						int i_489_ = ((i_447_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_490_ = -i_439_; i_490_ < 0; i_490_++) {
							if (!bool_436_ || f < fs[i_454_]) {
								if (bool) {
									int i_491_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[(i_446_ >> 16) + i_489_]) & 0xff)]);
									i_485_ = ((i_491_ & 0xff00ff) * i_483_ & ~0xff00ff);
									i_486_ = ((i_491_ & 0xff00) * i_483_ & 0xff0000);
									is[i_454_] = ((i_485_ | i_486_) >>> 8) + i_442_;
								}
								if (bool_436_ && bool_445_)
									fs[i_454_] = f;
							}
							i_446_ += i_450_;
							i_454_++;
						}
						i_447_ += i_451_;
						i_446_ = i_487_;
						i_454_ += i_455_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_443_ == 1) {
				if (i_441_ == 1) {
					int i_492_ = i_446_;
					for (int i_493_ = -i_440_; i_493_ < 0; i_493_++) {
						int i_494_ = ((i_447_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_495_ = -i_439_; i_495_ < 0; i_495_++) {
							if (!bool_436_ || f < fs[i_454_]) {
								int i_496_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_446_ >> 16) + i_494_]);
								if (i_496_ != 0) {
									if (bool)
										is[i_454_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_496_ & 0xff]);
									if (bool_436_ && bool_445_)
										fs[i_454_] = f;
								}
							}
							i_446_ += i_450_;
							i_454_++;
						}
						i_447_ += i_451_;
						i_446_ = i_492_;
						i_454_ += i_455_;
					}
				} else if (i_441_ == 0) {
					int i_497_ = i_446_;
					if ((i_442_ & 0xffffff) == 16777215) {
						int i_498_ = i_442_ >>> 24;
						int i_499_ = 256 - i_498_;
						for (int i_500_ = -i_440_; i_500_ < 0; i_500_++) {
							int i_501_ = ((i_447_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_502_ = -i_439_; i_502_ < 0; i_502_++) {
								if (!bool_436_ || f < fs[i_454_]) {
									int i_503_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_446_ >> 16) + i_501_]);
									if (i_503_ != 0) {
										if (bool) {
											int i_504_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_503_ & 0xff]);
											int i_505_ = is[i_454_];
											is[i_454_] = (((((i_504_ & 0xff00ff) * i_498_) + ((i_505_ & 0xff00ff) * i_499_)) & ~0xff00ff) + ((((i_504_ & 0xff00) * i_498_) + ((i_505_ & 0xff00) * i_499_)) & 0xff0000)) >> 8;
										}
										if (bool_436_ && bool_445_)
											fs[i_454_] = f;
									}
								}
								i_446_ += i_450_;
								i_454_++;
							}
							i_447_ += i_451_;
							i_446_ = i_497_;
							i_454_ += i_455_;
						}
					} else {
						int i_506_ = (i_442_ & 0xff0000) >> 16;
						int i_507_ = (i_442_ & 0xff00) >> 8;
						int i_508_ = i_442_ & 0xff;
						int i_509_ = i_442_ >>> 24;
						int i_510_ = 256 - i_509_;
						for (int i_511_ = -i_440_; i_511_ < 0; i_511_++) {
							int i_512_ = ((i_447_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_513_ = -i_439_; i_513_ < 0; i_513_++) {
								if (!bool_436_ || f < fs[i_454_]) {
									int i_514_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_446_ >> 16) + i_512_]);
									if (i_514_ != 0) {
										int i_515_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_514_ & 0xff]);
										if (i_509_ != 255) {
											if (bool) {
												int i_516_ = (((i_515_ & 0xff0000) * i_506_) & ~0xffffff);
												int i_517_ = (((i_515_ & 0xff00) * i_507_) & 0xff0000);
												int i_518_ = ((i_515_ & 0xff) * i_508_ & 0xff00);
												i_515_ = (i_516_ | i_517_ | i_518_) >>> 8;
												int i_519_ = is[i_454_];
												is[i_454_] = (((((i_515_ & 0xff00ff) * i_509_) + ((i_519_ & 0xff00ff) * i_510_)) & ~0xff00ff) + ((((i_515_ & 0xff00) * i_509_) + ((i_519_ & 0xff00) * i_510_)) & 0xff0000)) >> 8;
											}
											if (bool_436_ && bool_445_)
												fs[i_454_] = f;
										} else {
											if (bool) {
												int i_520_ = (((i_515_ & 0xff0000) * i_506_) & ~0xffffff);
												int i_521_ = (((i_515_ & 0xff00) * i_507_) & 0xff0000);
												int i_522_ = ((i_515_ & 0xff) * i_508_ & 0xff00);
												is[i_454_] = (i_520_ | i_521_ | i_522_) >>> 8;
											}
											if (bool_436_ && bool_445_)
												fs[i_454_] = f;
										}
									}
								}
								i_446_ += i_450_;
								i_454_++;
							}
							i_447_ += i_451_;
							i_446_ = i_497_;
							i_454_ += i_455_;
						}
					}
				} else if (i_441_ == 3) {
					int i_523_ = i_446_;
					int i_524_ = i_442_ >>> 24;
					int i_525_ = 256 - i_524_;
					for (int i_526_ = -i_440_; i_526_ < 0; i_526_++) {
						int i_527_ = ((i_447_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_528_ = -i_439_; i_528_ < 0; i_528_++) {
							if (!bool_436_ || f < fs[i_454_]) {
								if (bool) {
									byte i_529_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_446_ >> 16) + i_527_]);
									int i_530_ = (i_529_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_529_]) : 0);
									int i_531_ = i_530_ + i_442_;
									int i_532_ = ((i_530_ & 0xff00ff) + (i_442_ & 0xff00ff));
									int i_533_ = ((i_532_ & 0x1000100) + (i_531_ - i_532_ & 0x10000));
									i_533_ = i_531_ - i_533_ | i_533_ - (i_533_ >>> 8);
									if (i_530_ == 0 && i_524_ != 255) {
										i_530_ = i_533_;
										i_533_ = is[i_454_];
										i_533_ = ((((i_530_ & 0xff00ff) * i_524_ + ((i_533_ & 0xff00ff) * i_525_)) & ~0xff00ff) + (((i_530_ & 0xff00) * i_524_ + ((i_533_ & 0xff00) * i_525_)) & 0xff0000)) >> 8;
									}
									is[i_454_] = i_533_;
								}
								if (bool_436_ && bool_445_)
									fs[i_454_] = f;
							}
							i_446_ += i_450_;
							i_454_++;
						}
						i_447_ += i_451_;
						i_446_ = i_523_;
						i_454_ += i_455_;
					}
				} else if (i_441_ == 2) {
					int i_534_ = i_442_ >>> 24;
					int i_535_ = 256 - i_534_;
					int i_536_ = (i_442_ & 0xff00ff) * i_535_ & ~0xff00ff;
					int i_537_ = (i_442_ & 0xff00) * i_535_ & 0xff0000;
					i_442_ = (i_536_ | i_537_) >>> 8;
					int i_538_ = i_446_;
					for (int i_539_ = -i_440_; i_539_ < 0; i_539_++) {
						int i_540_ = ((i_447_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_541_ = -i_439_; i_541_ < 0; i_541_++) {
							if (!bool_436_ || f < fs[i_454_]) {
								int i_542_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_446_ >> 16) + i_540_]);
								if (i_542_ != 0) {
									if (bool) {
										int i_543_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_542_ & 0xff]);
										i_536_ = ((i_543_ & 0xff00ff) * i_534_ & ~0xff00ff);
										i_537_ = ((i_543_ & 0xff00) * i_534_ & 0xff0000);
										is[i_454_] = (((i_536_ | i_537_) >>> 8) + i_442_);
									}
									if (bool_436_ && bool_445_)
										fs[i_454_] = f;
								}
							}
							i_446_ += i_450_;
							i_454_++;
						}
						i_447_ += i_451_;
						i_446_ = i_538_;
						i_454_ += i_455_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_443_ == 2) {
				if (i_441_ == 1) {
					int i_544_ = i_446_;
					for (int i_545_ = -i_440_; i_545_ < 0; i_545_++) {
						int i_546_ = ((i_447_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_547_ = -i_439_; i_547_ < 0; i_547_++) {
							if (!bool_436_ || f < fs[i_454_]) {
								int i_548_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_446_ >> 16) + i_546_]);
								if (i_548_ != 0) {
									if (bool) {
										int i_549_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_548_ & 0xff]);
										int i_550_ = is[i_454_];
										int i_551_ = i_549_ + i_550_;
										int i_552_ = ((i_549_ & 0xff00ff) + (i_550_ & 0xff00ff));
										i_550_ = ((i_552_ & 0x1000100) + (i_551_ - i_552_ & 0x10000));
										is[i_454_] = (i_551_ - i_550_ | i_550_ - (i_550_ >>> 8));
									}
									if (bool_436_ && bool_445_)
										fs[i_454_] = f;
								}
							}
							i_446_ += i_450_;
							i_454_++;
						}
						i_447_ += i_451_;
						i_446_ = i_544_;
						i_454_ += i_455_;
					}
				} else if (i_441_ == 0) {
					int i_553_ = i_446_;
					int i_554_ = (i_442_ & 0xff0000) >> 16;
					int i_555_ = (i_442_ & 0xff00) >> 8;
					int i_556_ = i_442_ & 0xff;
					for (int i_557_ = -i_440_; i_557_ < 0; i_557_++) {
						int i_558_ = ((i_447_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_559_ = -i_439_; i_559_ < 0; i_559_++) {
							if (!bool_436_ || f < fs[i_454_]) {
								int i_560_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_446_ >> 16) + i_558_]);
								if (i_560_ != 0) {
									if (bool) {
										int i_561_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_560_ & 0xff]);
										int i_562_ = ((i_561_ & 0xff0000) * i_554_ & ~0xffffff);
										int i_563_ = ((i_561_ & 0xff00) * i_555_ & 0xff0000);
										int i_564_ = ((i_561_ & 0xff) * i_556_ & 0xff00);
										i_561_ = (i_562_ | i_563_ | i_564_) >>> 8;
										int i_565_ = is[i_454_];
										int i_566_ = i_561_ + i_565_;
										int i_567_ = ((i_561_ & 0xff00ff) + (i_565_ & 0xff00ff));
										i_565_ = ((i_567_ & 0x1000100) + (i_566_ - i_567_ & 0x10000));
										is[i_454_] = (i_566_ - i_565_ | i_565_ - (i_565_ >>> 8));
									}
									if (bool_436_ && bool_445_)
										fs[i_454_] = f;
								}
							}
							i_446_ += i_450_;
							i_454_++;
						}
						i_447_ += i_451_;
						i_446_ = i_553_;
						i_454_ += i_455_;
					}
				} else if (i_441_ == 3) {
					int i_568_ = i_446_;
					for (int i_569_ = -i_440_; i_569_ < 0; i_569_++) {
						int i_570_ = ((i_447_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_571_ = -i_439_; i_571_ < 0; i_571_++) {
							if (!bool_436_ || f < fs[i_454_]) {
								if (bool) {
									byte i_572_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_446_ >> 16) + i_570_]);
									int i_573_ = (i_572_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_572_]) : 0);
									int i_574_ = i_573_ + i_442_;
									int i_575_ = ((i_573_ & 0xff00ff) + (i_442_ & 0xff00ff));
									int i_576_ = ((i_575_ & 0x1000100) + (i_574_ - i_575_ & 0x10000));
									i_573_ = i_574_ - i_576_ | i_576_ - (i_576_ >>> 8);
									i_576_ = is[i_454_];
									i_574_ = i_573_ + i_576_;
									i_575_ = (i_573_ & 0xff00ff) + (i_576_ & 0xff00ff);
									i_576_ = ((i_575_ & 0x1000100) + (i_574_ - i_575_ & 0x10000));
									is[i_454_] = i_574_ - i_576_ | i_576_ - (i_576_ >>> 8);
								}
								if (bool_436_ && bool_445_)
									fs[i_454_] = f;
							}
							i_446_ += i_450_;
							i_454_++;
						}
						i_447_ += i_451_;
						i_446_ = i_568_;
						i_454_ += i_455_;
					}
				} else if (i_441_ == 2) {
					int i_577_ = i_442_ >>> 24;
					int i_578_ = 256 - i_577_;
					int i_579_ = (i_442_ & 0xff00ff) * i_578_ & ~0xff00ff;
					int i_580_ = (i_442_ & 0xff00) * i_578_ & 0xff0000;
					i_442_ = (i_579_ | i_580_) >>> 8;
					int i_581_ = i_446_;
					for (int i_582_ = -i_440_; i_582_ < 0; i_582_++) {
						int i_583_ = ((i_447_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_584_ = -i_439_; i_584_ < 0; i_584_++) {
							if (!bool_436_ || f < fs[i_454_]) {
								int i_585_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_446_ >> 16) + i_583_]);
								if (i_585_ != 0) {
									if (bool) {
										int i_586_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_585_ & 0xff]);
										i_579_ = ((i_586_ & 0xff00ff) * i_577_ & ~0xff00ff);
										i_580_ = ((i_586_ & 0xff00) * i_577_ & 0xff0000);
										i_586_ = (((i_579_ | i_580_) >>> 8) + i_442_);
										int i_587_ = is[i_454_];
										int i_588_ = i_586_ + i_587_;
										int i_589_ = ((i_586_ & 0xff00ff) + (i_587_ & 0xff00ff));
										i_587_ = ((i_589_ & 0x1000100) + (i_588_ - i_589_ & 0x10000));
										is[i_454_] = (i_588_ - i_587_ | i_587_ - (i_587_ >>> 8));
									}
									if (bool_436_ && bool_445_)
										fs[i_454_] = f;
								}
							}
							i_446_ += i_450_;
							i_454_++;
						}
						i_447_ += i_451_;
						i_446_ = i_581_;
						i_454_ += i_455_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2784(int i, int i_590_, Class455 class455, int i_591_, int i_592_) {
		if (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			i += ((Class160_Sub1_Sub2) this).anInt8853;
			i_590_ += ((Class160_Sub1_Sub2) this).anInt8854;
			int i_593_ = 0;
			int i_594_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			int i_595_ = ((Class160_Sub1_Sub2) this).anInt8851;
			int i_596_ = ((Class160_Sub1_Sub2) this).anInt8867;
			int i_597_ = i_594_ - i_595_;
			int i_598_ = 0;
			int i_599_ = i + i_590_ * i_594_;
			if (i_590_ < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_600_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_590_);
				i_596_ -= i_600_;
				i_590_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_593_ += i_600_ * i_595_;
				i_599_ += i_600_ * i_594_;
			}
			if (i_590_ + i_596_ > (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_596_ -= (i_590_ + i_596_ - (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt8986) * 1383960921);
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_601_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_595_ -= i_601_;
				i = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_593_ += i_601_;
				i_599_ += i_601_;
				i_598_ += i_601_;
				i_597_ += i_601_;
			}
			if (i + i_595_ > (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt9002) * -1710988237) {
				int i_602_ = (i + i_595_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_595_ -= i_602_;
				i_598_ += i_602_;
				i_597_ += i_602_;
			}
			if (i_595_ > 0 && i_596_ > 0) {
				PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
				int[] is_603_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
				int[] is_604_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
				int i_605_ = i_590_;
				if (i_592_ > i_605_) {
					i_605_ = i_592_;
					i_599_ += (i_592_ - i_590_) * i_594_;
					i_593_ += ((i_592_ - i_590_) * ((Class160_Sub1_Sub2) this).anInt8851);
				}
				int i_606_ = (i_592_ + is_603_.length < i_590_ + i_596_ ? i_592_ + is_603_.length : i_590_ + i_596_);
				for (int i_607_ = i_605_; i_607_ < i_606_; i_607_++) {
					int i_608_ = is_603_[i_607_ - i_592_] + i_591_;
					int i_609_ = is_604_[i_607_ - i_592_];
					int i_610_ = i_595_;
					if (i > i_608_) {
						int i_611_ = i - i_608_;
						if (i_611_ >= i_609_) {
							i_593_ += i_595_ + i_598_;
							i_599_ += i_595_ + i_597_;
							continue;
						}
						i_609_ -= i_611_;
					} else {
						int i_612_ = i_608_ - i;
						if (i_612_ >= i_595_) {
							i_593_ += i_595_ + i_598_;
							i_599_ += i_595_ + i_597_;
							continue;
						}
						i_593_ += i_612_;
						i_610_ -= i_612_;
						i_599_ += i_612_;
					}
					int i_613_ = 0;
					if (i_610_ < i_609_)
						i_609_ = i_610_;
					else
						i_613_ = i_610_ - i_609_;
					for (int i_614_ = -i_609_; i_614_ < 0; i_614_++) {
						int i_615_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_593_++]);
						if (i_615_ != 0)
							is[i_599_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_615_ & 0xff]);
						else
							i_599_++;
					}
					i_593_ += i_613_ + i_598_;
					i_599_ += i_613_ + i_597_;
				}
			}
		}
	}

	void method14245(int i, int i_616_) {
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					int i_617_ = anInt8864;
					while (i_617_ < 0) {
						int i_618_ = anInt8870;
						int i_619_ = anInt8873;
						int i_620_ = anInt8874;
						int i_621_ = anInt8862;
						if (i_619_ >= 0 && i_620_ >= 0 && i_619_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) < 0 && i_620_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) < 0) {
							for (/**/; i_621_ < 0; i_621_++) {
								int i_622_ = ((i_620_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851 + (i_619_ >> 12));
								int i_623_ = i_618_++;
								if (i_616_ == 0) {
									if (i == 1)
										is[i_623_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_622_]) & 0xff)]);
									else if (i == 0) {
										int i_624_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_622_]) & 0xff)]);
										int i_625_ = ((i_624_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_626_ = ((i_624_ & 0xff00) * anInt8852 & 0xff0000);
										int i_627_ = ((i_624_ & 0xff) * anInt8882 & 0xff00);
										is[i_623_] = (i_625_ | i_626_ | i_627_) >>> 8;
									} else if (i == 3) {
										int i_628_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_622_]) & 0xff)]);
										int i_629_ = anInt8877;
										int i_630_ = i_628_ + i_629_;
										int i_631_ = ((i_628_ & 0xff00ff) + (i_629_ & 0xff00ff));
										int i_632_ = ((i_631_ & 0x1000100) + (i_630_ - i_631_ & 0x10000));
										is[i_623_] = (i_630_ - i_632_ | i_632_ - (i_632_ >>> 8));
									} else if (i == 2) {
										int i_633_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_622_]) & 0xff)]);
										int i_634_ = ((i_633_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_635_ = ((i_633_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_623_] = (((i_634_ | i_635_) >>> 8) + anInt8885);
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 1) {
									if (i == 1) {
										int i_636_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_622_]);
										if (i_636_ != 0)
											is[i_623_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_636_ & 0xff]);
									} else if (i == 0) {
										int i_637_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_622_]);
										if (i_637_ != 0) {
											int i_638_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_637_ & 0xff]);
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_639_ = anInt8877 >>> 24;
												int i_640_ = 256 - i_639_;
												int i_641_ = is[i_623_];
												is[i_623_] = (((((i_638_ & 0xff00ff) * i_639_) + ((i_641_ & 0xff00ff) * i_640_)) & ~0xff00ff) + ((((i_638_ & 0xff00) * i_639_) + ((i_641_ & 0xff00) * i_640_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_642_ = (((i_638_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_643_ = (((i_638_ & 0xff00) * anInt8852) & 0xff0000);
												int i_644_ = (((i_638_ & 0xff) * anInt8882) & 0xff00);
												i_638_ = (i_642_ | i_643_ | i_644_) >>> 8;
												int i_645_ = is[i_623_];
												is[i_623_] = (((((i_638_ & 0xff00ff) * anInt8878) + ((i_645_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_638_ & 0xff00) * anInt8878) + ((i_645_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_646_ = (((i_638_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_647_ = (((i_638_ & 0xff00) * anInt8852) & 0xff0000);
												int i_648_ = (((i_638_ & 0xff) * anInt8882) & 0xff00);
												is[i_623_] = (i_646_ | i_647_ | i_648_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_649_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_622_]);
										int i_650_ = (i_649_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_649_]) : 0);
										int i_651_ = anInt8877;
										int i_652_ = i_650_ + i_651_;
										int i_653_ = ((i_650_ & 0xff00ff) + (i_651_ & 0xff00ff));
										int i_654_ = ((i_653_ & 0x1000100) + (i_652_ - i_653_ & 0x10000));
										i_654_ = (i_652_ - i_654_ | i_654_ - (i_654_ >>> 8));
										if (i_650_ == 0 && anInt8878 != 255) {
											i_650_ = i_654_;
											i_654_ = is[i_623_];
											i_654_ = (((((i_650_ & 0xff00ff) * anInt8878) + ((i_654_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_650_ & 0xff00) * anInt8878) + ((i_654_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_623_] = i_654_;
									} else if (i == 2) {
										int i_655_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_622_]);
										if (i_655_ != 0) {
											int i_656_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_655_ & 0xff]);
											int i_657_ = (((i_656_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_658_ = (((i_656_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_623_++] = ((i_657_ | i_658_) >>> 8) + anInt8885;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 2) {
									if (i == 1) {
										int i_659_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_622_]);
										if (i_659_ != 0) {
											int i_660_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_659_ & 0xff]);
											int i_661_ = is[i_623_];
											int i_662_ = i_660_ + i_661_;
											int i_663_ = ((i_660_ & 0xff00ff) + (i_661_ & 0xff00ff));
											i_661_ = ((i_663_ & 0x1000100) + (i_662_ - i_663_ & 0x10000));
											is[i_623_] = (i_662_ - i_661_ | i_661_ - (i_661_ >>> 8));
										}
									} else if (i == 0) {
										int i_664_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_622_]);
										if (i_664_ != 0) {
											int i_665_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_664_ & 0xff]);
											int i_666_ = (((i_665_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_667_ = (((i_665_ & 0xff00) * anInt8852) & 0xff0000);
											int i_668_ = ((i_665_ & 0xff) * anInt8882 & 0xff00);
											i_665_ = (i_666_ | i_667_ | i_668_) >>> 8;
											int i_669_ = is[i_623_];
											int i_670_ = i_665_ + i_669_;
											int i_671_ = ((i_665_ & 0xff00ff) + (i_669_ & 0xff00ff));
											i_669_ = ((i_671_ & 0x1000100) + (i_670_ - i_671_ & 0x10000));
											is[i_623_] = (i_670_ - i_669_ | i_669_ - (i_669_ >>> 8));
										}
									} else if (i == 3) {
										byte i_672_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_622_]);
										int i_673_ = (i_672_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_672_]) : 0);
										int i_674_ = anInt8877;
										int i_675_ = i_673_ + i_674_;
										int i_676_ = ((i_673_ & 0xff00ff) + (i_674_ & 0xff00ff));
										int i_677_ = ((i_676_ & 0x1000100) + (i_675_ - i_676_ & 0x10000));
										i_677_ = (i_675_ - i_677_ | i_677_ - (i_677_ >>> 8));
										if (i_673_ == 0 && anInt8878 != 255) {
											i_673_ = i_677_;
											i_677_ = is[i_623_];
											i_677_ = (((((i_673_ & 0xff00ff) * anInt8878) + ((i_677_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_673_ & 0xff00) * anInt8878) + ((i_677_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_623_] = i_677_;
									} else if (i == 2) {
										int i_678_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_622_]);
										if (i_678_ != 0) {
											int i_679_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_678_ & 0xff]);
											int i_680_ = (((i_679_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_681_ = (((i_679_ & 0xff00) * anInt8878) & 0xff0000);
											i_679_ = (((i_680_ | i_681_) >>> 8) + anInt8885);
											int i_682_ = is[i_623_];
											int i_683_ = i_679_ + i_682_;
											int i_684_ = ((i_679_ & 0xff00ff) + (i_682_ & 0xff00ff));
											i_682_ = ((i_684_ & 0x1000100) + (i_683_ - i_684_ & 0x10000));
											is[i_623_] = (i_683_ - i_682_ | i_682_ - (i_682_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_617_++;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_685_ = anInt8864;
					while (i_685_ < 0) {
						int i_686_ = anInt8870;
						int i_687_ = anInt8873;
						int i_688_ = anInt8874 + anInt8866;
						int i_689_ = anInt8862;
						if (i_687_ >= 0 && i_687_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) < 0) {
							int i_690_;
							if ((i_690_ = (i_688_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12))) >= 0) {
								i_690_ = (anInt8868 - i_690_) / anInt8868;
								i_689_ += i_690_;
								i_688_ += anInt8868 * i_690_;
								i_686_ += i_690_;
							}
							if ((i_690_ = (i_688_ - anInt8868) / anInt8868) > i_689_)
								i_689_ = i_690_;
							for (/**/; i_689_ < 0; i_689_++) {
								int i_691_ = ((i_688_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851 + (i_687_ >> 12));
								int i_692_ = i_686_++;
								if (i_616_ == 0) {
									if (i == 1)
										is[i_692_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_691_]) & 0xff)]);
									else if (i == 0) {
										int i_693_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_691_]) & 0xff)]);
										int i_694_ = ((i_693_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_695_ = ((i_693_ & 0xff00) * anInt8852 & 0xff0000);
										int i_696_ = ((i_693_ & 0xff) * anInt8882 & 0xff00);
										is[i_692_] = (i_694_ | i_695_ | i_696_) >>> 8;
									} else if (i == 3) {
										int i_697_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_691_]) & 0xff)]);
										int i_698_ = anInt8877;
										int i_699_ = i_697_ + i_698_;
										int i_700_ = ((i_697_ & 0xff00ff) + (i_698_ & 0xff00ff));
										int i_701_ = ((i_700_ & 0x1000100) + (i_699_ - i_700_ & 0x10000));
										is[i_692_] = (i_699_ - i_701_ | i_701_ - (i_701_ >>> 8));
									} else if (i == 2) {
										int i_702_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_691_]) & 0xff)]);
										int i_703_ = ((i_702_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_704_ = ((i_702_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_692_] = (((i_703_ | i_704_) >>> 8) + anInt8885);
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 1) {
									if (i == 1) {
										int i_705_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_691_]);
										if (i_705_ != 0)
											is[i_692_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_705_ & 0xff]);
									} else if (i == 0) {
										int i_706_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_691_]);
										if (i_706_ != 0) {
											int i_707_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_706_ & 0xff]);
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_708_ = anInt8877 >>> 24;
												int i_709_ = 256 - i_708_;
												int i_710_ = is[i_692_];
												is[i_692_] = (((((i_707_ & 0xff00ff) * i_708_) + ((i_710_ & 0xff00ff) * i_709_)) & ~0xff00ff) + ((((i_707_ & 0xff00) * i_708_) + ((i_710_ & 0xff00) * i_709_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_711_ = (((i_707_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_712_ = (((i_707_ & 0xff00) * anInt8852) & 0xff0000);
												int i_713_ = (((i_707_ & 0xff) * anInt8882) & 0xff00);
												i_707_ = (i_711_ | i_712_ | i_713_) >>> 8;
												int i_714_ = is[i_692_];
												is[i_692_] = (((((i_707_ & 0xff00ff) * anInt8878) + ((i_714_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_707_ & 0xff00) * anInt8878) + ((i_714_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_715_ = (((i_707_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_716_ = (((i_707_ & 0xff00) * anInt8852) & 0xff0000);
												int i_717_ = (((i_707_ & 0xff) * anInt8882) & 0xff00);
												is[i_692_] = (i_715_ | i_716_ | i_717_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_718_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_691_]);
										int i_719_ = (i_718_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_718_]) : 0);
										int i_720_ = anInt8877;
										int i_721_ = i_719_ + i_720_;
										int i_722_ = ((i_719_ & 0xff00ff) + (i_720_ & 0xff00ff));
										int i_723_ = ((i_722_ & 0x1000100) + (i_721_ - i_722_ & 0x10000));
										i_723_ = (i_721_ - i_723_ | i_723_ - (i_723_ >>> 8));
										if (i_719_ == 0 && anInt8878 != 255) {
											i_719_ = i_723_;
											i_723_ = is[i_692_];
											i_723_ = (((((i_719_ & 0xff00ff) * anInt8878) + ((i_723_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_719_ & 0xff00) * anInt8878) + ((i_723_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_692_] = i_723_;
									} else if (i == 2) {
										int i_724_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_691_]);
										if (i_724_ != 0) {
											int i_725_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_724_ & 0xff]);
											int i_726_ = (((i_725_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_727_ = (((i_725_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_692_++] = ((i_726_ | i_727_) >>> 8) + anInt8885;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 2) {
									if (i == 1) {
										int i_728_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_691_]);
										if (i_728_ != 0) {
											int i_729_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_728_ & 0xff]);
											int i_730_ = is[i_692_];
											int i_731_ = i_729_ + i_730_;
											int i_732_ = ((i_729_ & 0xff00ff) + (i_730_ & 0xff00ff));
											i_730_ = ((i_732_ & 0x1000100) + (i_731_ - i_732_ & 0x10000));
											is[i_692_] = (i_731_ - i_730_ | i_730_ - (i_730_ >>> 8));
										}
									} else if (i == 0) {
										int i_733_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_691_]);
										if (i_733_ != 0) {
											int i_734_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_733_ & 0xff]);
											int i_735_ = (((i_734_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_736_ = (((i_734_ & 0xff00) * anInt8852) & 0xff0000);
											int i_737_ = ((i_734_ & 0xff) * anInt8882 & 0xff00);
											i_734_ = (i_735_ | i_736_ | i_737_) >>> 8;
											int i_738_ = is[i_692_];
											int i_739_ = i_734_ + i_738_;
											int i_740_ = ((i_734_ & 0xff00ff) + (i_738_ & 0xff00ff));
											i_738_ = ((i_740_ & 0x1000100) + (i_739_ - i_740_ & 0x10000));
											is[i_692_] = (i_739_ - i_738_ | i_738_ - (i_738_ >>> 8));
										}
									} else if (i == 3) {
										byte i_741_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_691_]);
										int i_742_ = (i_741_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_741_]) : 0);
										int i_743_ = anInt8877;
										int i_744_ = i_742_ + i_743_;
										int i_745_ = ((i_742_ & 0xff00ff) + (i_743_ & 0xff00ff));
										int i_746_ = ((i_745_ & 0x1000100) + (i_744_ - i_745_ & 0x10000));
										i_746_ = (i_744_ - i_746_ | i_746_ - (i_746_ >>> 8));
										if (i_742_ == 0 && anInt8878 != 255) {
											i_742_ = i_746_;
											i_746_ = is[i_692_];
											i_746_ = (((((i_742_ & 0xff00ff) * anInt8878) + ((i_746_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_742_ & 0xff00) * anInt8878) + ((i_746_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_692_] = i_746_;
									} else if (i == 2) {
										int i_747_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_691_]);
										if (i_747_ != 0) {
											int i_748_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_747_ & 0xff]);
											int i_749_ = (((i_748_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_750_ = (((i_748_ & 0xff00) * anInt8878) & 0xff0000);
											i_748_ = (((i_749_ | i_750_) >>> 8) + anInt8885);
											int i_751_ = is[i_692_];
											int i_752_ = i_748_ + i_751_;
											int i_753_ = ((i_748_ & 0xff00ff) + (i_751_ & 0xff00ff));
											i_751_ = ((i_753_ & 0x1000100) + (i_752_ - i_753_ & 0x10000));
											is[i_692_] = (i_752_ - i_751_ | i_751_ - (i_751_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_688_ += anInt8868;
							}
						}
						i_685_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				} else {
					int i_754_ = anInt8864;
					while (i_754_ < 0) {
						int i_755_ = anInt8870;
						int i_756_ = anInt8873;
						int i_757_ = anInt8874 + anInt8866;
						int i_758_ = anInt8862;
						if (i_756_ >= 0 && i_756_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) < 0) {
							if (i_757_ < 0) {
								int i_759_ = (anInt8868 - 1 - i_757_) / anInt8868;
								i_758_ += i_759_;
								i_757_ += anInt8868 * i_759_;
								i_755_ += i_759_;
							}
							int i_760_;
							if ((i_760_ = (1 + i_757_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_758_)
								i_758_ = i_760_;
							for (/**/; i_758_ < 0; i_758_++) {
								int i_761_ = ((i_757_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851 + (i_756_ >> 12));
								int i_762_ = i_755_++;
								if (i_616_ == 0) {
									if (i == 1)
										is[i_762_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_761_]) & 0xff)]);
									else if (i == 0) {
										int i_763_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_761_]) & 0xff)]);
										int i_764_ = ((i_763_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_765_ = ((i_763_ & 0xff00) * anInt8852 & 0xff0000);
										int i_766_ = ((i_763_ & 0xff) * anInt8882 & 0xff00);
										is[i_762_] = (i_764_ | i_765_ | i_766_) >>> 8;
									} else if (i == 3) {
										int i_767_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_761_]) & 0xff)]);
										int i_768_ = anInt8877;
										int i_769_ = i_767_ + i_768_;
										int i_770_ = ((i_767_ & 0xff00ff) + (i_768_ & 0xff00ff));
										int i_771_ = ((i_770_ & 0x1000100) + (i_769_ - i_770_ & 0x10000));
										is[i_762_] = (i_769_ - i_771_ | i_771_ - (i_771_ >>> 8));
									} else if (i == 2) {
										int i_772_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_761_]) & 0xff)]);
										int i_773_ = ((i_772_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_774_ = ((i_772_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_762_] = (((i_773_ | i_774_) >>> 8) + anInt8885);
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 1) {
									if (i == 1) {
										int i_775_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_761_]);
										if (i_775_ != 0)
											is[i_762_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_775_ & 0xff]);
									} else if (i == 0) {
										int i_776_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_761_]);
										if (i_776_ != 0) {
											int i_777_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_776_ & 0xff]);
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_778_ = anInt8877 >>> 24;
												int i_779_ = 256 - i_778_;
												int i_780_ = is[i_762_];
												is[i_762_] = (((((i_777_ & 0xff00ff) * i_778_) + ((i_780_ & 0xff00ff) * i_779_)) & ~0xff00ff) + ((((i_777_ & 0xff00) * i_778_) + ((i_780_ & 0xff00) * i_779_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_781_ = (((i_777_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_782_ = (((i_777_ & 0xff00) * anInt8852) & 0xff0000);
												int i_783_ = (((i_777_ & 0xff) * anInt8882) & 0xff00);
												i_777_ = (i_781_ | i_782_ | i_783_) >>> 8;
												int i_784_ = is[i_762_];
												is[i_762_] = (((((i_777_ & 0xff00ff) * anInt8878) + ((i_784_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_777_ & 0xff00) * anInt8878) + ((i_784_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_785_ = (((i_777_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_786_ = (((i_777_ & 0xff00) * anInt8852) & 0xff0000);
												int i_787_ = (((i_777_ & 0xff) * anInt8882) & 0xff00);
												is[i_762_] = (i_785_ | i_786_ | i_787_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_788_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_761_]);
										int i_789_ = (i_788_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_788_]) : 0);
										int i_790_ = anInt8877;
										int i_791_ = i_789_ + i_790_;
										int i_792_ = ((i_789_ & 0xff00ff) + (i_790_ & 0xff00ff));
										int i_793_ = ((i_792_ & 0x1000100) + (i_791_ - i_792_ & 0x10000));
										i_793_ = (i_791_ - i_793_ | i_793_ - (i_793_ >>> 8));
										if (i_789_ == 0 && anInt8878 != 255) {
											i_789_ = i_793_;
											i_793_ = is[i_762_];
											i_793_ = (((((i_789_ & 0xff00ff) * anInt8878) + ((i_793_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_789_ & 0xff00) * anInt8878) + ((i_793_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_762_] = i_793_;
									} else if (i == 2) {
										int i_794_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_761_]);
										if (i_794_ != 0) {
											int i_795_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_794_ & 0xff]);
											int i_796_ = (((i_795_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_797_ = (((i_795_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_762_++] = ((i_796_ | i_797_) >>> 8) + anInt8885;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 2) {
									if (i == 1) {
										int i_798_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_761_]);
										if (i_798_ != 0) {
											int i_799_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_798_ & 0xff]);
											int i_800_ = is[i_762_];
											int i_801_ = i_799_ + i_800_;
											int i_802_ = ((i_799_ & 0xff00ff) + (i_800_ & 0xff00ff));
											i_800_ = ((i_802_ & 0x1000100) + (i_801_ - i_802_ & 0x10000));
											is[i_762_] = (i_801_ - i_800_ | i_800_ - (i_800_ >>> 8));
										}
									} else if (i == 0) {
										int i_803_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_761_]);
										if (i_803_ != 0) {
											int i_804_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_803_ & 0xff]);
											int i_805_ = (((i_804_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_806_ = (((i_804_ & 0xff00) * anInt8852) & 0xff0000);
											int i_807_ = ((i_804_ & 0xff) * anInt8882 & 0xff00);
											i_804_ = (i_805_ | i_806_ | i_807_) >>> 8;
											int i_808_ = is[i_762_];
											int i_809_ = i_804_ + i_808_;
											int i_810_ = ((i_804_ & 0xff00ff) + (i_808_ & 0xff00ff));
											i_808_ = ((i_810_ & 0x1000100) + (i_809_ - i_810_ & 0x10000));
											is[i_762_] = (i_809_ - i_808_ | i_808_ - (i_808_ >>> 8));
										}
									} else if (i == 3) {
										byte i_811_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_761_]);
										int i_812_ = (i_811_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_811_]) : 0);
										int i_813_ = anInt8877;
										int i_814_ = i_812_ + i_813_;
										int i_815_ = ((i_812_ & 0xff00ff) + (i_813_ & 0xff00ff));
										int i_816_ = ((i_815_ & 0x1000100) + (i_814_ - i_815_ & 0x10000));
										i_816_ = (i_814_ - i_816_ | i_816_ - (i_816_ >>> 8));
										if (i_812_ == 0 && anInt8878 != 255) {
											i_812_ = i_816_;
											i_816_ = is[i_762_];
											i_816_ = (((((i_812_ & 0xff00ff) * anInt8878) + ((i_816_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_812_ & 0xff00) * anInt8878) + ((i_816_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_762_] = i_816_;
									} else if (i == 2) {
										int i_817_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_761_]);
										if (i_817_ != 0) {
											int i_818_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_817_ & 0xff]);
											int i_819_ = (((i_818_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_820_ = (((i_818_ & 0xff00) * anInt8878) & 0xff0000);
											i_818_ = (((i_819_ | i_820_) >>> 8) + anInt8885);
											int i_821_ = is[i_762_];
											int i_822_ = i_818_ + i_821_;
											int i_823_ = ((i_818_ & 0xff00ff) + (i_821_ & 0xff00ff));
											i_821_ = ((i_823_ & 0x1000100) + (i_822_ - i_823_ & 0x10000));
											is[i_762_] = (i_822_ - i_821_ | i_821_ - (i_821_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_757_ += anInt8868;
							}
						}
						i_754_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					int i_824_ = anInt8864;
					while (i_824_ < 0) {
						int i_825_ = anInt8870;
						int i_826_ = anInt8873 + anInt8858;
						int i_827_ = anInt8874;
						int i_828_ = anInt8862;
						if (i_827_ >= 0 && i_827_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) < 0) {
							int i_829_;
							if ((i_829_ = (i_826_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12))) >= 0) {
								i_829_ = (anInt8865 - i_829_) / anInt8865;
								i_828_ += i_829_;
								i_826_ += anInt8865 * i_829_;
								i_825_ += i_829_;
							}
							if ((i_829_ = (i_826_ - anInt8865) / anInt8865) > i_828_)
								i_828_ = i_829_;
							for (/**/; i_828_ < 0; i_828_++) {
								int i_830_ = ((i_827_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851 + (i_826_ >> 12));
								int i_831_ = i_825_++;
								if (i_616_ == 0) {
									if (i == 1)
										is[i_831_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_830_]) & 0xff)]);
									else if (i == 0) {
										int i_832_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_830_]) & 0xff)]);
										int i_833_ = ((i_832_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_834_ = ((i_832_ & 0xff00) * anInt8852 & 0xff0000);
										int i_835_ = ((i_832_ & 0xff) * anInt8882 & 0xff00);
										is[i_831_] = (i_833_ | i_834_ | i_835_) >>> 8;
									} else if (i == 3) {
										int i_836_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_830_]) & 0xff)]);
										int i_837_ = anInt8877;
										int i_838_ = i_836_ + i_837_;
										int i_839_ = ((i_836_ & 0xff00ff) + (i_837_ & 0xff00ff));
										int i_840_ = ((i_839_ & 0x1000100) + (i_838_ - i_839_ & 0x10000));
										is[i_831_] = (i_838_ - i_840_ | i_840_ - (i_840_ >>> 8));
									} else if (i == 2) {
										int i_841_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_830_]) & 0xff)]);
										int i_842_ = ((i_841_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_843_ = ((i_841_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_831_] = (((i_842_ | i_843_) >>> 8) + anInt8885);
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 1) {
									if (i == 1) {
										int i_844_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_830_]);
										if (i_844_ != 0)
											is[i_831_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_844_ & 0xff]);
									} else if (i == 0) {
										int i_845_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_830_]);
										if (i_845_ != 0) {
											int i_846_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_845_ & 0xff]);
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_847_ = anInt8877 >>> 24;
												int i_848_ = 256 - i_847_;
												int i_849_ = is[i_831_];
												is[i_831_] = (((((i_846_ & 0xff00ff) * i_847_) + ((i_849_ & 0xff00ff) * i_848_)) & ~0xff00ff) + ((((i_846_ & 0xff00) * i_847_) + ((i_849_ & 0xff00) * i_848_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_850_ = (((i_846_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_851_ = (((i_846_ & 0xff00) * anInt8852) & 0xff0000);
												int i_852_ = (((i_846_ & 0xff) * anInt8882) & 0xff00);
												i_846_ = (i_850_ | i_851_ | i_852_) >>> 8;
												int i_853_ = is[i_831_];
												is[i_831_] = (((((i_846_ & 0xff00ff) * anInt8878) + ((i_853_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_846_ & 0xff00) * anInt8878) + ((i_853_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_854_ = (((i_846_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_855_ = (((i_846_ & 0xff00) * anInt8852) & 0xff0000);
												int i_856_ = (((i_846_ & 0xff) * anInt8882) & 0xff00);
												is[i_831_] = (i_854_ | i_855_ | i_856_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_857_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_830_]);
										int i_858_ = (i_857_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_857_]) : 0);
										int i_859_ = anInt8877;
										int i_860_ = i_858_ + i_859_;
										int i_861_ = ((i_858_ & 0xff00ff) + (i_859_ & 0xff00ff));
										int i_862_ = ((i_861_ & 0x1000100) + (i_860_ - i_861_ & 0x10000));
										i_862_ = (i_860_ - i_862_ | i_862_ - (i_862_ >>> 8));
										if (i_858_ == 0 && anInt8878 != 255) {
											i_858_ = i_862_;
											i_862_ = is[i_831_];
											i_862_ = (((((i_858_ & 0xff00ff) * anInt8878) + ((i_862_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_858_ & 0xff00) * anInt8878) + ((i_862_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_831_] = i_862_;
									} else if (i == 2) {
										int i_863_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_830_]);
										if (i_863_ != 0) {
											int i_864_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_863_ & 0xff]);
											int i_865_ = (((i_864_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_866_ = (((i_864_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_831_++] = ((i_865_ | i_866_) >>> 8) + anInt8885;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_616_ == 2) {
									if (i == 1) {
										int i_867_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_830_]);
										if (i_867_ != 0) {
											int i_868_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_867_ & 0xff]);
											int i_869_ = is[i_831_];
											int i_870_ = i_868_ + i_869_;
											int i_871_ = ((i_868_ & 0xff00ff) + (i_869_ & 0xff00ff));
											i_869_ = ((i_871_ & 0x1000100) + (i_870_ - i_871_ & 0x10000));
											is[i_831_] = (i_870_ - i_869_ | i_869_ - (i_869_ >>> 8));
										}
									} else if (i == 0) {
										int i_872_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_830_]);
										if (i_872_ != 0) {
											int i_873_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_872_ & 0xff]);
											int i_874_ = (((i_873_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_875_ = (((i_873_ & 0xff00) * anInt8852) & 0xff0000);
											int i_876_ = ((i_873_ & 0xff) * anInt8882 & 0xff00);
											i_873_ = (i_874_ | i_875_ | i_876_) >>> 8;
											int i_877_ = is[i_831_];
											int i_878_ = i_873_ + i_877_;
											int i_879_ = ((i_873_ & 0xff00ff) + (i_877_ & 0xff00ff));
											i_877_ = ((i_879_ & 0x1000100) + (i_878_ - i_879_ & 0x10000));
											is[i_831_] = (i_878_ - i_877_ | i_877_ - (i_877_ >>> 8));
										}
									} else if (i == 3) {
										byte i_880_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_830_]);
										int i_881_ = (i_880_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_880_]) : 0);
										int i_882_ = anInt8877;
										int i_883_ = i_881_ + i_882_;
										int i_884_ = ((i_881_ & 0xff00ff) + (i_882_ & 0xff00ff));
										int i_885_ = ((i_884_ & 0x1000100) + (i_883_ - i_884_ & 0x10000));
										i_885_ = (i_883_ - i_885_ | i_885_ - (i_885_ >>> 8));
										if (i_881_ == 0 && anInt8878 != 255) {
											i_881_ = i_885_;
											i_885_ = is[i_831_];
											i_885_ = (((((i_881_ & 0xff00ff) * anInt8878) + ((i_885_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_881_ & 0xff00) * anInt8878) + ((i_885_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_831_] = i_885_;
									} else if (i == 2) {
										int i_886_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_830_]);
										if (i_886_ != 0) {
											int i_887_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_886_ & 0xff]);
											int i_888_ = (((i_887_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_889_ = (((i_887_ & 0xff00) * anInt8878) & 0xff0000);
											i_887_ = (((i_888_ | i_889_) >>> 8) + anInt8885);
											int i_890_ = is[i_831_];
											int i_891_ = i_887_ + i_890_;
											int i_892_ = ((i_887_ & 0xff00ff) + (i_890_ & 0xff00ff));
											i_890_ = ((i_892_ & 0x1000100) + (i_891_ - i_892_ & 0x10000));
											is[i_831_] = (i_891_ - i_890_ | i_890_ - (i_890_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_826_ += anInt8865;
							}
						}
						i_824_++;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_893_ = anInt8864;
					while (i_893_ < 0) {
						int i_894_ = anInt8870;
						int i_895_ = anInt8873 + anInt8858;
						int i_896_ = anInt8874 + anInt8866;
						int i_897_ = anInt8862;
						int i_898_;
						if ((i_898_ = i_895_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12)) >= 0) {
							i_898_ = (anInt8865 - i_898_) / anInt8865;
							i_897_ += i_898_;
							i_895_ += anInt8865 * i_898_;
							i_896_ += anInt8868 * i_898_;
							i_894_ += i_898_;
						}
						if ((i_898_ = (i_895_ - anInt8865) / anInt8865) > i_897_)
							i_897_ = i_898_;
						if ((i_898_ = i_896_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12)) >= 0) {
							i_898_ = (anInt8868 - i_898_) / anInt8868;
							i_897_ += i_898_;
							i_895_ += anInt8865 * i_898_;
							i_896_ += anInt8868 * i_898_;
							i_894_ += i_898_;
						}
						if ((i_898_ = (i_896_ - anInt8868) / anInt8868) > i_897_)
							i_897_ = i_898_;
						for (/**/; i_897_ < 0; i_897_++) {
							int i_899_ = (((i_896_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_895_ >> 12));
							int i_900_ = i_894_++;
							if (i_616_ == 0) {
								if (i == 1)
									is[i_900_] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_899_]) & 0xff]);
								else if (i == 0) {
									int i_901_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_899_]) & 0xff]);
									int i_902_ = ((i_901_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_903_ = ((i_901_ & 0xff00) * anInt8852 & 0xff0000);
									int i_904_ = (i_901_ & 0xff) * anInt8882 & 0xff00;
									is[i_900_] = (i_902_ | i_903_ | i_904_) >>> 8;
								} else if (i == 3) {
									int i_905_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_899_]) & 0xff]);
									int i_906_ = anInt8877;
									int i_907_ = i_905_ + i_906_;
									int i_908_ = ((i_905_ & 0xff00ff) + (i_906_ & 0xff00ff));
									int i_909_ = ((i_908_ & 0x1000100) + (i_907_ - i_908_ & 0x10000));
									is[i_900_] = i_907_ - i_909_ | i_909_ - (i_909_ >>> 8);
								} else if (i == 2) {
									int i_910_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_899_]) & 0xff]);
									int i_911_ = ((i_910_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_912_ = ((i_910_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_900_] = (((i_911_ | i_912_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_616_ == 1) {
								if (i == 1) {
									int i_913_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_899_]);
									if (i_913_ != 0)
										is[i_900_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_913_ & 0xff]);
								} else if (i == 0) {
									int i_914_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_899_]);
									if (i_914_ != 0) {
										int i_915_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_914_ & 0xff]);
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_916_ = anInt8877 >>> 24;
											int i_917_ = 256 - i_916_;
											int i_918_ = is[i_900_];
											is[i_900_] = (((((i_915_ & 0xff00ff) * i_916_) + ((i_918_ & 0xff00ff) * i_917_)) & ~0xff00ff) + ((((i_915_ & 0xff00) * i_916_) + ((i_918_ & 0xff00) * i_917_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_919_ = (((i_915_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_920_ = (((i_915_ & 0xff00) * anInt8852) & 0xff0000);
											int i_921_ = ((i_915_ & 0xff) * anInt8882 & 0xff00);
											i_915_ = (i_919_ | i_920_ | i_921_) >>> 8;
											int i_922_ = is[i_900_];
											is[i_900_] = (((((i_915_ & 0xff00ff) * anInt8878) + ((i_922_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_915_ & 0xff00) * anInt8878) + ((i_922_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_923_ = (((i_915_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_924_ = (((i_915_ & 0xff00) * anInt8852) & 0xff0000);
											int i_925_ = ((i_915_ & 0xff) * anInt8882 & 0xff00);
											is[i_900_] = (i_923_ | i_924_ | i_925_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_926_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_899_]);
									int i_927_ = (i_926_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_926_]) : 0);
									int i_928_ = anInt8877;
									int i_929_ = i_927_ + i_928_;
									int i_930_ = ((i_927_ & 0xff00ff) + (i_928_ & 0xff00ff));
									int i_931_ = ((i_930_ & 0x1000100) + (i_929_ - i_930_ & 0x10000));
									i_931_ = i_929_ - i_931_ | i_931_ - (i_931_ >>> 8);
									if (i_927_ == 0 && anInt8878 != 255) {
										i_927_ = i_931_;
										i_931_ = is[i_900_];
										i_931_ = (((((i_927_ & 0xff00ff) * anInt8878) + ((i_931_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_927_ & 0xff00) * anInt8878) + ((i_931_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_900_] = i_931_;
								} else if (i == 2) {
									int i_932_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_899_]);
									if (i_932_ != 0) {
										int i_933_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_932_ & 0xff]);
										int i_934_ = ((i_933_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_935_ = ((i_933_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_900_++] = ((i_934_ | i_935_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_616_ == 2) {
								if (i == 1) {
									int i_936_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_899_]);
									if (i_936_ != 0) {
										int i_937_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_936_ & 0xff]);
										int i_938_ = is[i_900_];
										int i_939_ = i_937_ + i_938_;
										int i_940_ = ((i_937_ & 0xff00ff) + (i_938_ & 0xff00ff));
										i_938_ = ((i_940_ & 0x1000100) + (i_939_ - i_940_ & 0x10000));
										is[i_900_] = (i_939_ - i_938_ | i_938_ - (i_938_ >>> 8));
									}
								} else if (i == 0) {
									int i_941_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_899_]);
									if (i_941_ != 0) {
										int i_942_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_941_ & 0xff]);
										int i_943_ = ((i_942_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_944_ = ((i_942_ & 0xff00) * anInt8852 & 0xff0000);
										int i_945_ = ((i_942_ & 0xff) * anInt8882 & 0xff00);
										i_942_ = (i_943_ | i_944_ | i_945_) >>> 8;
										int i_946_ = is[i_900_];
										int i_947_ = i_942_ + i_946_;
										int i_948_ = ((i_942_ & 0xff00ff) + (i_946_ & 0xff00ff));
										i_946_ = ((i_948_ & 0x1000100) + (i_947_ - i_948_ & 0x10000));
										is[i_900_] = (i_947_ - i_946_ | i_946_ - (i_946_ >>> 8));
									}
								} else if (i == 3) {
									byte i_949_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_899_]);
									int i_950_ = (i_949_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_949_]) : 0);
									int i_951_ = anInt8877;
									int i_952_ = i_950_ + i_951_;
									int i_953_ = ((i_950_ & 0xff00ff) + (i_951_ & 0xff00ff));
									int i_954_ = ((i_953_ & 0x1000100) + (i_952_ - i_953_ & 0x10000));
									i_954_ = i_952_ - i_954_ | i_954_ - (i_954_ >>> 8);
									if (i_950_ == 0 && anInt8878 != 255) {
										i_950_ = i_954_;
										i_954_ = is[i_900_];
										i_954_ = (((((i_950_ & 0xff00ff) * anInt8878) + ((i_954_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_950_ & 0xff00) * anInt8878) + ((i_954_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_900_] = i_954_;
								} else if (i == 2) {
									int i_955_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_899_]);
									if (i_955_ != 0) {
										int i_956_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_955_ & 0xff]);
										int i_957_ = ((i_956_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_958_ = ((i_956_ & 0xff00) * anInt8878 & 0xff0000);
										i_956_ = (((i_957_ | i_958_) >>> 8) + anInt8885);
										int i_959_ = is[i_900_];
										int i_960_ = i_956_ + i_959_;
										int i_961_ = ((i_956_ & 0xff00ff) + (i_959_ & 0xff00ff));
										i_959_ = ((i_961_ & 0x1000100) + (i_960_ - i_961_ & 0x10000));
										is[i_900_] = (i_960_ - i_959_ | i_959_ - (i_959_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_895_ += anInt8865;
							i_896_ += anInt8868;
						}
						i_893_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else {
					int i_962_ = anInt8864;
					while (i_962_ < 0) {
						int i_963_ = anInt8870;
						int i_964_ = anInt8873 + anInt8858;
						int i_965_ = anInt8874 + anInt8866;
						int i_966_ = anInt8862;
						int i_967_;
						if ((i_967_ = i_964_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12)) >= 0) {
							i_967_ = (anInt8865 - i_967_) / anInt8865;
							i_966_ += i_967_;
							i_964_ += anInt8865 * i_967_;
							i_965_ += anInt8868 * i_967_;
							i_963_ += i_967_;
						}
						if ((i_967_ = (i_964_ - anInt8865) / anInt8865) > i_966_)
							i_966_ = i_967_;
						if (i_965_ < 0) {
							i_967_ = (anInt8868 - 1 - i_965_) / anInt8868;
							i_966_ += i_967_;
							i_964_ += anInt8865 * i_967_;
							i_965_ += anInt8868 * i_967_;
							i_963_ += i_967_;
						}
						if ((i_967_ = (1 + i_965_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_966_)
							i_966_ = i_967_;
						for (/**/; i_966_ < 0; i_966_++) {
							int i_968_ = (((i_965_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_964_ >> 12));
							int i_969_ = i_963_++;
							if (i_616_ == 0) {
								if (i == 1)
									is[i_969_] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_968_]) & 0xff]);
								else if (i == 0) {
									int i_970_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_968_]) & 0xff]);
									int i_971_ = ((i_970_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_972_ = ((i_970_ & 0xff00) * anInt8852 & 0xff0000);
									int i_973_ = (i_970_ & 0xff) * anInt8882 & 0xff00;
									is[i_969_] = (i_971_ | i_972_ | i_973_) >>> 8;
								} else if (i == 3) {
									int i_974_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_968_]) & 0xff]);
									int i_975_ = anInt8877;
									int i_976_ = i_974_ + i_975_;
									int i_977_ = ((i_974_ & 0xff00ff) + (i_975_ & 0xff00ff));
									int i_978_ = ((i_977_ & 0x1000100) + (i_976_ - i_977_ & 0x10000));
									is[i_969_] = i_976_ - i_978_ | i_978_ - (i_978_ >>> 8);
								} else if (i == 2) {
									int i_979_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_968_]) & 0xff]);
									int i_980_ = ((i_979_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_981_ = ((i_979_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_969_] = (((i_980_ | i_981_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_616_ == 1) {
								if (i == 1) {
									int i_982_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_968_]);
									if (i_982_ != 0)
										is[i_969_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_982_ & 0xff]);
								} else if (i == 0) {
									int i_983_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_968_]);
									if (i_983_ != 0) {
										int i_984_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_983_ & 0xff]);
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_985_ = anInt8877 >>> 24;
											int i_986_ = 256 - i_985_;
											int i_987_ = is[i_969_];
											is[i_969_] = (((((i_984_ & 0xff00ff) * i_985_) + ((i_987_ & 0xff00ff) * i_986_)) & ~0xff00ff) + ((((i_984_ & 0xff00) * i_985_) + ((i_987_ & 0xff00) * i_986_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_988_ = (((i_984_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_989_ = (((i_984_ & 0xff00) * anInt8852) & 0xff0000);
											int i_990_ = ((i_984_ & 0xff) * anInt8882 & 0xff00);
											i_984_ = (i_988_ | i_989_ | i_990_) >>> 8;
											int i_991_ = is[i_969_];
											is[i_969_] = (((((i_984_ & 0xff00ff) * anInt8878) + ((i_991_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_984_ & 0xff00) * anInt8878) + ((i_991_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_992_ = (((i_984_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_993_ = (((i_984_ & 0xff00) * anInt8852) & 0xff0000);
											int i_994_ = ((i_984_ & 0xff) * anInt8882 & 0xff00);
											is[i_969_] = (i_992_ | i_993_ | i_994_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_995_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_968_]);
									int i_996_ = (i_995_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_995_]) : 0);
									int i_997_ = anInt8877;
									int i_998_ = i_996_ + i_997_;
									int i_999_ = ((i_996_ & 0xff00ff) + (i_997_ & 0xff00ff));
									int i_1000_ = ((i_999_ & 0x1000100) + (i_998_ - i_999_ & 0x10000));
									i_1000_ = i_998_ - i_1000_ | i_1000_ - (i_1000_ >>> 8);
									if (i_996_ == 0 && anInt8878 != 255) {
										i_996_ = i_1000_;
										i_1000_ = is[i_969_];
										i_1000_ = (((((i_996_ & 0xff00ff) * anInt8878) + ((i_1000_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_996_ & 0xff00) * anInt8878) + ((i_1000_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_969_] = i_1000_;
								} else if (i == 2) {
									int i_1001_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_968_]);
									if (i_1001_ != 0) {
										int i_1002_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1001_ & 0xff]);
										int i_1003_ = ((i_1002_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1004_ = ((i_1002_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_969_++] = ((i_1003_ | i_1004_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_616_ == 2) {
								if (i == 1) {
									int i_1005_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_968_]);
									if (i_1005_ != 0) {
										int i_1006_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1005_ & 0xff]);
										int i_1007_ = is[i_969_];
										int i_1008_ = i_1006_ + i_1007_;
										int i_1009_ = ((i_1006_ & 0xff00ff) + (i_1007_ & 0xff00ff));
										i_1007_ = ((i_1009_ & 0x1000100) + (i_1008_ - i_1009_ & 0x10000));
										is[i_969_] = (i_1008_ - i_1007_ | i_1007_ - (i_1007_ >>> 8));
									}
								} else if (i == 0) {
									int i_1010_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_968_]);
									if (i_1010_ != 0) {
										int i_1011_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1010_ & 0xff]);
										int i_1012_ = ((i_1011_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1013_ = ((i_1011_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1014_ = ((i_1011_ & 0xff) * anInt8882 & 0xff00);
										i_1011_ = (i_1012_ | i_1013_ | i_1014_) >>> 8;
										int i_1015_ = is[i_969_];
										int i_1016_ = i_1011_ + i_1015_;
										int i_1017_ = ((i_1011_ & 0xff00ff) + (i_1015_ & 0xff00ff));
										i_1015_ = ((i_1017_ & 0x1000100) + (i_1016_ - i_1017_ & 0x10000));
										is[i_969_] = (i_1016_ - i_1015_ | i_1015_ - (i_1015_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1018_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_968_]);
									int i_1019_ = (i_1018_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1018_]) : 0);
									int i_1020_ = anInt8877;
									int i_1021_ = i_1019_ + i_1020_;
									int i_1022_ = ((i_1019_ & 0xff00ff) + (i_1020_ & 0xff00ff));
									int i_1023_ = ((i_1022_ & 0x1000100) + (i_1021_ - i_1022_ & 0x10000));
									i_1023_ = (i_1021_ - i_1023_ | i_1023_ - (i_1023_ >>> 8));
									if (i_1019_ == 0 && anInt8878 != 255) {
										i_1019_ = i_1023_;
										i_1023_ = is[i_969_];
										i_1023_ = (((((i_1019_ & 0xff00ff) * anInt8878) + ((i_1023_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1019_ & 0xff00) * anInt8878) + ((i_1023_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_969_] = i_1023_;
								} else if (i == 2) {
									int i_1024_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_968_]);
									if (i_1024_ != 0) {
										int i_1025_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1024_ & 0xff]);
										int i_1026_ = ((i_1025_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1027_ = ((i_1025_ & 0xff00) * anInt8878 & 0xff0000);
										i_1025_ = (((i_1026_ | i_1027_) >>> 8) + anInt8885);
										int i_1028_ = is[i_969_];
										int i_1029_ = i_1025_ + i_1028_;
										int i_1030_ = ((i_1025_ & 0xff00ff) + (i_1028_ & 0xff00ff));
										i_1028_ = ((i_1030_ & 0x1000100) + (i_1029_ - i_1030_ & 0x10000));
										is[i_969_] = (i_1029_ - i_1028_ | i_1028_ - (i_1028_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_964_ += anInt8865;
							i_965_ += anInt8868;
						}
						i_962_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8868 == 0) {
				int i_1031_ = anInt8864;
				while (i_1031_ < 0) {
					int i_1032_ = anInt8870;
					int i_1033_ = anInt8873 + anInt8858;
					int i_1034_ = anInt8874;
					int i_1035_ = anInt8862;
					if (i_1034_ >= 0 && i_1034_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) < 0) {
						if (i_1033_ < 0) {
							int i_1036_ = (anInt8865 - 1 - i_1033_) / anInt8865;
							i_1035_ += i_1036_;
							i_1033_ += anInt8865 * i_1036_;
							i_1032_ += i_1036_;
						}
						int i_1037_;
						if ((i_1037_ = (1 + i_1033_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1035_)
							i_1035_ = i_1037_;
						for (/**/; i_1035_ < 0; i_1035_++) {
							int i_1038_ = (((i_1034_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_1033_ >> 12));
							int i_1039_ = i_1032_++;
							if (i_616_ == 0) {
								if (i == 1)
									is[i_1039_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1038_]) & 0xff)]);
								else if (i == 0) {
									int i_1040_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1038_]) & 0xff)]);
									int i_1041_ = ((i_1040_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1042_ = ((i_1040_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1043_ = ((i_1040_ & 0xff) * anInt8882 & 0xff00);
									is[i_1039_] = (i_1041_ | i_1042_ | i_1043_) >>> 8;
								} else if (i == 3) {
									int i_1044_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1038_]) & 0xff)]);
									int i_1045_ = anInt8877;
									int i_1046_ = i_1044_ + i_1045_;
									int i_1047_ = ((i_1044_ & 0xff00ff) + (i_1045_ & 0xff00ff));
									int i_1048_ = ((i_1047_ & 0x1000100) + (i_1046_ - i_1047_ & 0x10000));
									is[i_1039_] = (i_1046_ - i_1048_ | i_1048_ - (i_1048_ >>> 8));
								} else if (i == 2) {
									int i_1049_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1038_]) & 0xff)]);
									int i_1050_ = ((i_1049_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1051_ = ((i_1049_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_1039_] = (((i_1050_ | i_1051_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_616_ == 1) {
								if (i == 1) {
									int i_1052_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1038_]);
									if (i_1052_ != 0)
										is[i_1039_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1052_ & 0xff]);
								} else if (i == 0) {
									int i_1053_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1038_]);
									if (i_1053_ != 0) {
										int i_1054_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1053_ & 0xff]);
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_1055_ = anInt8877 >>> 24;
											int i_1056_ = 256 - i_1055_;
											int i_1057_ = is[i_1039_];
											is[i_1039_] = (((((i_1054_ & 0xff00ff) * i_1055_) + ((i_1057_ & 0xff00ff) * i_1056_)) & ~0xff00ff) + ((((i_1054_ & 0xff00) * i_1055_) + ((i_1057_ & 0xff00) * i_1056_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_1058_ = (((i_1054_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1059_ = (((i_1054_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1060_ = ((i_1054_ & 0xff) * anInt8882 & 0xff00);
											i_1054_ = (i_1058_ | i_1059_ | i_1060_) >>> 8;
											int i_1061_ = is[i_1039_];
											is[i_1039_] = (((((i_1054_ & 0xff00ff) * anInt8878) + ((i_1061_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1054_ & 0xff00) * anInt8878) + ((i_1061_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_1062_ = (((i_1054_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1063_ = (((i_1054_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1064_ = ((i_1054_ & 0xff) * anInt8882 & 0xff00);
											is[i_1039_] = (i_1062_ | i_1063_ | i_1064_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1065_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1038_]);
									int i_1066_ = (i_1065_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1065_]) : 0);
									int i_1067_ = anInt8877;
									int i_1068_ = i_1066_ + i_1067_;
									int i_1069_ = ((i_1066_ & 0xff00ff) + (i_1067_ & 0xff00ff));
									int i_1070_ = ((i_1069_ & 0x1000100) + (i_1068_ - i_1069_ & 0x10000));
									i_1070_ = (i_1068_ - i_1070_ | i_1070_ - (i_1070_ >>> 8));
									if (i_1066_ == 0 && anInt8878 != 255) {
										i_1066_ = i_1070_;
										i_1070_ = is[i_1039_];
										i_1070_ = (((((i_1066_ & 0xff00ff) * anInt8878) + ((i_1070_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1066_ & 0xff00) * anInt8878) + ((i_1070_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_1039_] = i_1070_;
								} else if (i == 2) {
									int i_1071_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1038_]);
									if (i_1071_ != 0) {
										int i_1072_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1071_ & 0xff]);
										int i_1073_ = ((i_1072_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1074_ = ((i_1072_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_1039_++] = ((i_1073_ | i_1074_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_616_ == 2) {
								if (i == 1) {
									int i_1075_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1038_]);
									if (i_1075_ != 0) {
										int i_1076_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1075_ & 0xff]);
										int i_1077_ = is[i_1039_];
										int i_1078_ = i_1076_ + i_1077_;
										int i_1079_ = ((i_1076_ & 0xff00ff) + (i_1077_ & 0xff00ff));
										i_1077_ = ((i_1079_ & 0x1000100) + (i_1078_ - i_1079_ & 0x10000));
										is[i_1039_] = (i_1078_ - i_1077_ | i_1077_ - (i_1077_ >>> 8));
									}
								} else if (i == 0) {
									int i_1080_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1038_]);
									if (i_1080_ != 0) {
										int i_1081_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1080_ & 0xff]);
										int i_1082_ = ((i_1081_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1083_ = ((i_1081_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1084_ = ((i_1081_ & 0xff) * anInt8882 & 0xff00);
										i_1081_ = (i_1082_ | i_1083_ | i_1084_) >>> 8;
										int i_1085_ = is[i_1039_];
										int i_1086_ = i_1081_ + i_1085_;
										int i_1087_ = ((i_1081_ & 0xff00ff) + (i_1085_ & 0xff00ff));
										i_1085_ = ((i_1087_ & 0x1000100) + (i_1086_ - i_1087_ & 0x10000));
										is[i_1039_] = (i_1086_ - i_1085_ | i_1085_ - (i_1085_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1088_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1038_]);
									int i_1089_ = (i_1088_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1088_]) : 0);
									int i_1090_ = anInt8877;
									int i_1091_ = i_1089_ + i_1090_;
									int i_1092_ = ((i_1089_ & 0xff00ff) + (i_1090_ & 0xff00ff));
									int i_1093_ = ((i_1092_ & 0x1000100) + (i_1091_ - i_1092_ & 0x10000));
									i_1093_ = (i_1091_ - i_1093_ | i_1093_ - (i_1093_ >>> 8));
									if (i_1089_ == 0 && anInt8878 != 255) {
										i_1089_ = i_1093_;
										i_1093_ = is[i_1039_];
										i_1093_ = (((((i_1089_ & 0xff00ff) * anInt8878) + ((i_1093_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1089_ & 0xff00) * anInt8878) + ((i_1093_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_1039_] = i_1093_;
								} else if (i == 2) {
									int i_1094_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1038_]);
									if (i_1094_ != 0) {
										int i_1095_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1094_ & 0xff]);
										int i_1096_ = ((i_1095_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1097_ = ((i_1095_ & 0xff00) * anInt8878 & 0xff0000);
										i_1095_ = (((i_1096_ | i_1097_) >>> 8) + anInt8885);
										int i_1098_ = is[i_1039_];
										int i_1099_ = i_1095_ + i_1098_;
										int i_1100_ = ((i_1095_ & 0xff00ff) + (i_1098_ & 0xff00ff));
										i_1098_ = ((i_1100_ & 0x1000100) + (i_1099_ - i_1100_ & 0x10000));
										is[i_1039_] = (i_1099_ - i_1098_ | i_1098_ - (i_1098_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1033_ += anInt8865;
						}
					}
					i_1031_++;
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
					if ((i_1107_ = (1 + i_1103_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1105_)
						i_1105_ = i_1107_;
					if ((i_1107_ = i_1104_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12)) >= 0) {
						i_1107_ = (anInt8868 - i_1107_) / anInt8868;
						i_1105_ += i_1107_;
						i_1103_ += anInt8865 * i_1107_;
						i_1104_ += anInt8868 * i_1107_;
						i_1102_ += i_1107_;
					}
					if ((i_1107_ = (i_1104_ - anInt8868) / anInt8868) > i_1105_)
						i_1105_ = i_1107_;
					for (/**/; i_1105_ < 0; i_1105_++) {
						int i_1108_ = (((i_1104_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_1103_ >> 12));
						int i_1109_ = i_1102_++;
						if (i_616_ == 0) {
							if (i == 1)
								is[i_1109_] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_1108_]) & 0xff]);
							else if (i == 0) {
								int i_1110_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_1108_]) & 0xff]);
								int i_1111_ = ((i_1110_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_1112_ = ((i_1110_ & 0xff00) * anInt8852 & 0xff0000);
								int i_1113_ = (i_1110_ & 0xff) * anInt8882 & 0xff00;
								is[i_1109_] = (i_1111_ | i_1112_ | i_1113_) >>> 8;
							} else if (i == 3) {
								int i_1114_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_1108_]) & 0xff]);
								int i_1115_ = anInt8877;
								int i_1116_ = i_1114_ + i_1115_;
								int i_1117_ = ((i_1114_ & 0xff00ff) + (i_1115_ & 0xff00ff));
								int i_1118_ = ((i_1117_ & 0x1000100) + (i_1116_ - i_1117_ & 0x10000));
								is[i_1109_] = i_1116_ - i_1118_ | i_1118_ - (i_1118_ >>> 8);
							} else if (i == 2) {
								int i_1119_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_1108_]) & 0xff]);
								int i_1120_ = ((i_1119_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_1121_ = ((i_1119_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_1109_] = ((i_1120_ | i_1121_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_616_ == 1) {
							if (i == 1) {
								int i_1122_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1108_]);
								if (i_1122_ != 0)
									is[i_1109_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1122_ & 0xff]);
							} else if (i == 0) {
								int i_1123_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1108_]);
								if (i_1123_ != 0) {
									int i_1124_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1123_ & 0xff]);
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_1125_ = anInt8877 >>> 24;
										int i_1126_ = 256 - i_1125_;
										int i_1127_ = is[i_1109_];
										is[i_1109_] = ((((i_1124_ & 0xff00ff) * i_1125_ + ((i_1127_ & 0xff00ff) * i_1126_)) & ~0xff00ff) + (((i_1124_ & 0xff00) * i_1125_ + ((i_1127_ & 0xff00) * i_1126_)) & 0xff0000)) >> 8;
									} else if (anInt8878 != 255) {
										int i_1128_ = ((i_1124_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1129_ = ((i_1124_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1130_ = ((i_1124_ & 0xff) * anInt8882 & 0xff00);
										i_1124_ = (i_1128_ | i_1129_ | i_1130_) >>> 8;
										int i_1131_ = is[i_1109_];
										is[i_1109_] = (((((i_1124_ & 0xff00ff) * anInt8878) + ((i_1131_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1124_ & 0xff00) * anInt8878) + ((i_1131_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									} else {
										int i_1132_ = ((i_1124_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1133_ = ((i_1124_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1134_ = ((i_1124_ & 0xff) * anInt8882 & 0xff00);
										is[i_1109_] = (i_1132_ | i_1133_ | i_1134_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1135_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1108_]);
								int i_1136_ = (i_1135_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1135_]) : 0);
								int i_1137_ = anInt8877;
								int i_1138_ = i_1136_ + i_1137_;
								int i_1139_ = ((i_1136_ & 0xff00ff) + (i_1137_ & 0xff00ff));
								int i_1140_ = ((i_1139_ & 0x1000100) + (i_1138_ - i_1139_ & 0x10000));
								i_1140_ = i_1138_ - i_1140_ | i_1140_ - (i_1140_ >>> 8);
								if (i_1136_ == 0 && anInt8878 != 255) {
									i_1136_ = i_1140_;
									i_1140_ = is[i_1109_];
									i_1140_ = ((((i_1136_ & 0xff00ff) * anInt8878 + ((i_1140_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_1136_ & 0xff00) * anInt8878 + ((i_1140_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_1109_] = i_1140_;
							} else if (i == 2) {
								int i_1141_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1108_]);
								if (i_1141_ != 0) {
									int i_1142_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1141_ & 0xff]);
									int i_1143_ = ((i_1142_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1144_ = ((i_1142_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_1109_++] = ((i_1143_ | i_1144_) >>> 8) + anInt8885;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_616_ == 2) {
							if (i == 1) {
								int i_1145_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1108_]);
								if (i_1145_ != 0) {
									int i_1146_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1145_ & 0xff]);
									int i_1147_ = is[i_1109_];
									int i_1148_ = i_1146_ + i_1147_;
									int i_1149_ = ((i_1146_ & 0xff00ff) + (i_1147_ & 0xff00ff));
									i_1147_ = ((i_1149_ & 0x1000100) + (i_1148_ - i_1149_ & 0x10000));
									is[i_1109_] = (i_1148_ - i_1147_ | i_1147_ - (i_1147_ >>> 8));
								}
							} else if (i == 0) {
								int i_1150_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1108_]);
								if (i_1150_ != 0) {
									int i_1151_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1150_ & 0xff]);
									int i_1152_ = ((i_1151_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1153_ = ((i_1151_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1154_ = ((i_1151_ & 0xff) * anInt8882 & 0xff00);
									i_1151_ = (i_1152_ | i_1153_ | i_1154_) >>> 8;
									int i_1155_ = is[i_1109_];
									int i_1156_ = i_1151_ + i_1155_;
									int i_1157_ = ((i_1151_ & 0xff00ff) + (i_1155_ & 0xff00ff));
									i_1155_ = ((i_1157_ & 0x1000100) + (i_1156_ - i_1157_ & 0x10000));
									is[i_1109_] = (i_1156_ - i_1155_ | i_1155_ - (i_1155_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1158_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1108_]);
								int i_1159_ = (i_1158_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1158_]) : 0);
								int i_1160_ = anInt8877;
								int i_1161_ = i_1159_ + i_1160_;
								int i_1162_ = ((i_1159_ & 0xff00ff) + (i_1160_ & 0xff00ff));
								int i_1163_ = ((i_1162_ & 0x1000100) + (i_1161_ - i_1162_ & 0x10000));
								i_1163_ = i_1161_ - i_1163_ | i_1163_ - (i_1163_ >>> 8);
								if (i_1159_ == 0 && anInt8878 != 255) {
									i_1159_ = i_1163_;
									i_1163_ = is[i_1109_];
									i_1163_ = ((((i_1159_ & 0xff00ff) * anInt8878 + ((i_1163_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_1159_ & 0xff00) * anInt8878 + ((i_1163_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_1109_] = i_1163_;
							} else if (i == 2) {
								int i_1164_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1108_]);
								if (i_1164_ != 0) {
									int i_1165_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1164_ & 0xff]);
									int i_1166_ = ((i_1165_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1167_ = ((i_1165_ & 0xff00) * anInt8878 & 0xff0000);
									i_1165_ = (((i_1166_ | i_1167_) >>> 8) + anInt8885);
									int i_1168_ = is[i_1109_];
									int i_1169_ = i_1165_ + i_1168_;
									int i_1170_ = ((i_1165_ & 0xff00ff) + (i_1168_ & 0xff00ff));
									i_1168_ = ((i_1170_ & 0x1000100) + (i_1169_ - i_1170_ & 0x10000));
									is[i_1109_] = (i_1169_ - i_1168_ | i_1168_ - (i_1168_ >>> 8));
								}
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
				for (int i_1171_ = anInt8864; i_1171_ < 0; i_1171_++) {
					int i_1172_ = anInt8870;
					int i_1173_ = anInt8873 + anInt8858;
					int i_1174_ = anInt8874 + anInt8866;
					int i_1175_ = anInt8862;
					if (i_1173_ < 0) {
						int i_1176_ = (anInt8865 - 1 - i_1173_) / anInt8865;
						i_1175_ += i_1176_;
						i_1173_ += anInt8865 * i_1176_;
						i_1174_ += anInt8868 * i_1176_;
						i_1172_ += i_1176_;
					}
					int i_1177_;
					if ((i_1177_ = (1 + i_1173_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1175_)
						i_1175_ = i_1177_;
					if (i_1174_ < 0) {
						i_1177_ = (anInt8868 - 1 - i_1174_) / anInt8868;
						i_1175_ += i_1177_;
						i_1173_ += anInt8865 * i_1177_;
						i_1174_ += anInt8868 * i_1177_;
						i_1172_ += i_1177_;
					}
					if ((i_1177_ = (1 + i_1174_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_1175_)
						i_1175_ = i_1177_;
					for (/**/; i_1175_ < 0; i_1175_++) {
						int i_1178_ = (((i_1174_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_1173_ >> 12));
						int i_1179_ = i_1172_++;
						if (i_616_ == 0) {
							if (i == 1)
								is[i_1179_] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_1178_]) & 0xff]);
							else if (i == 0) {
								int i_1180_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_1178_]) & 0xff]);
								int i_1181_ = ((i_1180_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_1182_ = ((i_1180_ & 0xff00) * anInt8852 & 0xff0000);
								int i_1183_ = (i_1180_ & 0xff) * anInt8882 & 0xff00;
								is[i_1179_] = (i_1181_ | i_1182_ | i_1183_) >>> 8;
							} else if (i == 3) {
								int i_1184_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_1178_]) & 0xff]);
								int i_1185_ = anInt8877;
								int i_1186_ = i_1184_ + i_1185_;
								int i_1187_ = ((i_1184_ & 0xff00ff) + (i_1185_ & 0xff00ff));
								int i_1188_ = ((i_1187_ & 0x1000100) + (i_1186_ - i_1187_ & 0x10000));
								is[i_1179_] = i_1186_ - i_1188_ | i_1188_ - (i_1188_ >>> 8);
							} else if (i == 2) {
								int i_1189_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_1178_]) & 0xff]);
								int i_1190_ = ((i_1189_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_1191_ = ((i_1189_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_1179_] = ((i_1190_ | i_1191_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_616_ == 1) {
							if (i == 1) {
								int i_1192_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1178_]);
								if (i_1192_ != 0)
									is[i_1179_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1192_ & 0xff]);
							} else if (i == 0) {
								int i_1193_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1178_]);
								if (i_1193_ != 0) {
									int i_1194_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1193_ & 0xff]);
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_1195_ = anInt8877 >>> 24;
										int i_1196_ = 256 - i_1195_;
										int i_1197_ = is[i_1179_];
										is[i_1179_] = ((((i_1194_ & 0xff00ff) * i_1195_ + ((i_1197_ & 0xff00ff) * i_1196_)) & ~0xff00ff) + (((i_1194_ & 0xff00) * i_1195_ + ((i_1197_ & 0xff00) * i_1196_)) & 0xff0000)) >> 8;
									} else if (anInt8878 != 255) {
										int i_1198_ = ((i_1194_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1199_ = ((i_1194_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1200_ = ((i_1194_ & 0xff) * anInt8882 & 0xff00);
										i_1194_ = (i_1198_ | i_1199_ | i_1200_) >>> 8;
										int i_1201_ = is[i_1179_];
										is[i_1179_] = (((((i_1194_ & 0xff00ff) * anInt8878) + ((i_1201_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1194_ & 0xff00) * anInt8878) + ((i_1201_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									} else {
										int i_1202_ = ((i_1194_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1203_ = ((i_1194_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1204_ = ((i_1194_ & 0xff) * anInt8882 & 0xff00);
										is[i_1179_] = (i_1202_ | i_1203_ | i_1204_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1205_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1178_]);
								int i_1206_ = (i_1205_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1205_]) : 0);
								int i_1207_ = anInt8877;
								int i_1208_ = i_1206_ + i_1207_;
								int i_1209_ = ((i_1206_ & 0xff00ff) + (i_1207_ & 0xff00ff));
								int i_1210_ = ((i_1209_ & 0x1000100) + (i_1208_ - i_1209_ & 0x10000));
								i_1210_ = i_1208_ - i_1210_ | i_1210_ - (i_1210_ >>> 8);
								if (i_1206_ == 0 && anInt8878 != 255) {
									i_1206_ = i_1210_;
									i_1210_ = is[i_1179_];
									i_1210_ = ((((i_1206_ & 0xff00ff) * anInt8878 + ((i_1210_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_1206_ & 0xff00) * anInt8878 + ((i_1210_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_1179_] = i_1210_;
							} else if (i == 2) {
								int i_1211_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1178_]);
								if (i_1211_ != 0) {
									int i_1212_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1211_ & 0xff]);
									int i_1213_ = ((i_1212_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1214_ = ((i_1212_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_1179_++] = ((i_1213_ | i_1214_) >>> 8) + anInt8885;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_616_ == 2) {
							if (i == 1) {
								int i_1215_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1178_]);
								if (i_1215_ != 0) {
									int i_1216_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1215_ & 0xff]);
									int i_1217_ = is[i_1179_];
									int i_1218_ = i_1216_ + i_1217_;
									int i_1219_ = ((i_1216_ & 0xff00ff) + (i_1217_ & 0xff00ff));
									i_1217_ = ((i_1219_ & 0x1000100) + (i_1218_ - i_1219_ & 0x10000));
									is[i_1179_] = (i_1218_ - i_1217_ | i_1217_ - (i_1217_ >>> 8));
								}
							} else if (i == 0) {
								int i_1220_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1178_]);
								if (i_1220_ != 0) {
									int i_1221_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1220_ & 0xff]);
									int i_1222_ = ((i_1221_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1223_ = ((i_1221_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1224_ = ((i_1221_ & 0xff) * anInt8882 & 0xff00);
									i_1221_ = (i_1222_ | i_1223_ | i_1224_) >>> 8;
									int i_1225_ = is[i_1179_];
									int i_1226_ = i_1221_ + i_1225_;
									int i_1227_ = ((i_1221_ & 0xff00ff) + (i_1225_ & 0xff00ff));
									i_1225_ = ((i_1227_ & 0x1000100) + (i_1226_ - i_1227_ & 0x10000));
									is[i_1179_] = (i_1226_ - i_1225_ | i_1225_ - (i_1225_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1228_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1178_]);
								int i_1229_ = (i_1228_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1228_]) : 0);
								int i_1230_ = anInt8877;
								int i_1231_ = i_1229_ + i_1230_;
								int i_1232_ = ((i_1229_ & 0xff00ff) + (i_1230_ & 0xff00ff));
								int i_1233_ = ((i_1232_ & 0x1000100) + (i_1231_ - i_1232_ & 0x10000));
								i_1233_ = i_1231_ - i_1233_ | i_1233_ - (i_1233_ >>> 8);
								if (i_1229_ == 0 && anInt8878 != 255) {
									i_1229_ = i_1233_;
									i_1233_ = is[i_1179_];
									i_1233_ = ((((i_1229_ & 0xff00ff) * anInt8878 + ((i_1233_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_1229_ & 0xff00) * anInt8878 + ((i_1233_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_1179_] = i_1233_;
							} else if (i == 2) {
								int i_1234_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1178_]);
								if (i_1234_ != 0) {
									int i_1235_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1234_ & 0xff]);
									int i_1236_ = ((i_1235_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1237_ = ((i_1235_ & 0xff00) * anInt8878 & 0xff0000);
									i_1235_ = (((i_1236_ | i_1237_) >>> 8) + anInt8885);
									int i_1238_ = is[i_1179_];
									int i_1239_ = i_1235_ + i_1238_;
									int i_1240_ = ((i_1235_ & 0xff00ff) + (i_1238_ & 0xff00ff));
									i_1238_ = ((i_1240_ & 0x1000100) + (i_1239_ - i_1240_ & 0x10000));
									is[i_1179_] = (i_1239_ - i_1238_ | i_1238_ - (i_1238_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1173_ += anInt8865;
						i_1174_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			}
		}
	}

	void method14250(int[] is, int[] is_1241_, int i, int i_1242_) {
		int[] is_1243_ = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
		if (is_1243_ != null) {
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					int i_1244_ = anInt8864;
					while (i_1244_ < 0) {
						int i_1245_ = i_1244_ + i_1242_;
						if (i_1245_ >= 0) {
							if (i_1245_ >= is.length)
								break;
							int i_1246_ = anInt8870;
							int i_1247_ = anInt8873;
							int i_1248_ = anInt8874;
							int i_1249_ = anInt8862;
							if (i_1247_ >= 0 && i_1248_ >= 0 && (i_1247_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12)) < 0 && (i_1248_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12)) < 0) {
								int i_1250_ = is[i_1245_] - i;
								int i_1251_ = -is_1241_[i_1245_];
								int i_1252_ = i_1250_ - (i_1246_ - anInt8870);
								if (i_1252_ > 0) {
									i_1246_ += i_1252_;
									i_1249_ += i_1252_;
									i_1247_ += anInt8865 * i_1252_;
									i_1248_ += anInt8868 * i_1252_;
								} else
									i_1251_ -= i_1252_;
								if (i_1249_ < i_1251_)
									i_1249_ = i_1251_;
								for (/**/; i_1249_ < 0; i_1249_++) {
									int i_1253_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(((i_1248_ >> 12) * (((Class160_Sub1_Sub2) this).anInt8851)) + (i_1247_ >> 12))]);
									if (i_1253_ != 0)
										is_1243_[i_1246_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1253_ & 0xff]);
									else
										i_1246_++;
								}
							}
						}
						i_1244_++;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_1254_ = anInt8864;
					while (i_1254_ < 0) {
						int i_1255_ = i_1254_ + i_1242_;
						if (i_1255_ >= 0) {
							if (i_1255_ >= is.length)
								break;
							int i_1256_ = anInt8870;
							int i_1257_ = anInt8873;
							int i_1258_ = anInt8874 + anInt8866;
							int i_1259_ = anInt8862;
							if (i_1257_ >= 0 && (i_1257_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12)) < 0) {
								int i_1260_;
								if ((i_1260_ = i_1258_ - ((((Class160_Sub1_Sub2) this).anInt8867) << 12)) >= 0) {
									i_1260_ = (anInt8868 - i_1260_) / anInt8868;
									i_1259_ += i_1260_;
									i_1258_ += anInt8868 * i_1260_;
									i_1256_ += i_1260_;
								}
								if ((i_1260_ = (i_1258_ - anInt8868) / anInt8868) > i_1259_)
									i_1259_ = i_1260_;
								int i_1261_ = is[i_1255_] - i;
								int i_1262_ = -is_1241_[i_1255_];
								int i_1263_ = i_1261_ - (i_1256_ - anInt8870);
								if (i_1263_ > 0) {
									i_1256_ += i_1263_;
									i_1259_ += i_1263_;
									i_1257_ += anInt8865 * i_1263_;
									i_1258_ += anInt8868 * i_1263_;
								} else
									i_1262_ -= i_1263_;
								if (i_1259_ < i_1262_)
									i_1259_ = i_1262_;
								for (/**/; i_1259_ < 0; i_1259_++) {
									int i_1264_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(((i_1258_ >> 12) * (((Class160_Sub1_Sub2) this).anInt8851)) + (i_1257_ >> 12))]);
									if (i_1264_ != 0)
										is_1243_[i_1256_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1264_ & 0xff]);
									else
										i_1256_++;
									i_1258_ += anInt8868;
								}
							}
						}
						i_1254_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				} else {
					int i_1265_ = anInt8864;
					while (i_1265_ < 0) {
						int i_1266_ = i_1265_ + i_1242_;
						if (i_1266_ >= 0) {
							if (i_1266_ >= is.length)
								break;
							int i_1267_ = anInt8870;
							int i_1268_ = anInt8873;
							int i_1269_ = anInt8874 + anInt8866;
							int i_1270_ = anInt8862;
							if (i_1268_ >= 0 && (i_1268_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12)) < 0) {
								if (i_1269_ < 0) {
									int i_1271_ = ((anInt8868 - 1 - i_1269_) / anInt8868);
									i_1270_ += i_1271_;
									i_1269_ += anInt8868 * i_1271_;
									i_1267_ += i_1271_;
								}
								int i_1272_;
								if ((i_1272_ = (1 + i_1269_ - ((((Class160_Sub1_Sub2) this).anInt8867) << 12) - anInt8868) / anInt8868) > i_1270_)
									i_1270_ = i_1272_;
								int i_1273_ = is[i_1266_] - i;
								int i_1274_ = -is_1241_[i_1266_];
								int i_1275_ = i_1273_ - (i_1267_ - anInt8870);
								if (i_1275_ > 0) {
									i_1267_ += i_1275_;
									i_1270_ += i_1275_;
									i_1268_ += anInt8865 * i_1275_;
									i_1269_ += anInt8868 * i_1275_;
								} else
									i_1274_ -= i_1275_;
								if (i_1270_ < i_1274_)
									i_1270_ = i_1274_;
								for (/**/; i_1270_ < 0; i_1270_++) {
									int i_1276_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(((i_1269_ >> 12) * (((Class160_Sub1_Sub2) this).anInt8851)) + (i_1268_ >> 12))]);
									if (i_1276_ != 0)
										is_1243_[i_1267_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1276_ & 0xff]);
									else
										i_1267_++;
									i_1269_ += anInt8868;
								}
							}
						}
						i_1265_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					int i_1277_ = anInt8864;
					while (i_1277_ < 0) {
						int i_1278_ = i_1277_ + i_1242_;
						if (i_1278_ >= 0) {
							if (i_1278_ >= is.length)
								break;
							int i_1279_ = anInt8870;
							int i_1280_ = anInt8873 + anInt8858;
							int i_1281_ = anInt8874;
							int i_1282_ = anInt8862;
							if (i_1281_ >= 0 && (i_1281_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12)) < 0) {
								int i_1283_;
								if ((i_1283_ = i_1280_ - ((((Class160_Sub1_Sub2) this).anInt8851) << 12)) >= 0) {
									i_1283_ = (anInt8865 - i_1283_) / anInt8865;
									i_1282_ += i_1283_;
									i_1280_ += anInt8865 * i_1283_;
									i_1279_ += i_1283_;
								}
								if ((i_1283_ = (i_1280_ - anInt8865) / anInt8865) > i_1282_)
									i_1282_ = i_1283_;
								int i_1284_ = is[i_1278_] - i;
								int i_1285_ = -is_1241_[i_1278_];
								int i_1286_ = i_1284_ - (i_1279_ - anInt8870);
								if (i_1286_ > 0) {
									i_1279_ += i_1286_;
									i_1282_ += i_1286_;
									i_1280_ += anInt8865 * i_1286_;
									i_1281_ += anInt8868 * i_1286_;
								} else
									i_1285_ -= i_1286_;
								if (i_1282_ < i_1285_)
									i_1282_ = i_1285_;
								for (/**/; i_1282_ < 0; i_1282_++) {
									int i_1287_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(((i_1281_ >> 12) * (((Class160_Sub1_Sub2) this).anInt8851)) + (i_1280_ >> 12))]);
									if (i_1287_ != 0)
										is_1243_[i_1279_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1287_ & 0xff]);
									else
										i_1279_++;
									i_1280_ += anInt8865;
								}
							}
						}
						i_1277_++;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_1288_ = anInt8864;
					while (i_1288_ < 0) {
						int i_1289_ = i_1288_ + i_1242_;
						if (i_1289_ >= 0) {
							if (i_1289_ >= is.length)
								break;
							int i_1290_ = anInt8870;
							int i_1291_ = anInt8873 + anInt8858;
							int i_1292_ = anInt8874 + anInt8866;
							int i_1293_ = anInt8862;
							int i_1294_;
							if ((i_1294_ = (i_1291_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12))) >= 0) {
								i_1294_ = (anInt8865 - i_1294_) / anInt8865;
								i_1293_ += i_1294_;
								i_1291_ += anInt8865 * i_1294_;
								i_1292_ += anInt8868 * i_1294_;
								i_1290_ += i_1294_;
							}
							if ((i_1294_ = (i_1291_ - anInt8865) / anInt8865) > i_1293_)
								i_1293_ = i_1294_;
							if ((i_1294_ = (i_1292_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12))) >= 0) {
								i_1294_ = (anInt8868 - i_1294_) / anInt8868;
								i_1293_ += i_1294_;
								i_1291_ += anInt8865 * i_1294_;
								i_1292_ += anInt8868 * i_1294_;
								i_1290_ += i_1294_;
							}
							if ((i_1294_ = (i_1292_ - anInt8868) / anInt8868) > i_1293_)
								i_1293_ = i_1294_;
							int i_1295_ = is[i_1289_] - i;
							int i_1296_ = -is_1241_[i_1289_];
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
								int i_1298_ = (((Class160_Sub1_Sub2) this).aByteArray10221[((i_1292_ >> 12) * (((Class160_Sub1_Sub2) this).anInt8851)) + (i_1291_ >> 12)]);
								if (i_1298_ != 0)
									is_1243_[i_1290_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1298_ & 0xff]);
								else
									i_1290_++;
								i_1291_ += anInt8865;
								i_1292_ += anInt8868;
							}
						}
						i_1288_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else {
					int i_1299_ = anInt8864;
					while (i_1299_ < 0) {
						int i_1300_ = i_1299_ + i_1242_;
						if (i_1300_ >= 0) {
							if (i_1300_ >= is.length)
								break;
							int i_1301_ = anInt8870;
							int i_1302_ = anInt8873 + anInt8858;
							int i_1303_ = anInt8874 + anInt8866;
							int i_1304_ = anInt8862;
							int i_1305_;
							if ((i_1305_ = (i_1302_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12))) >= 0) {
								i_1305_ = (anInt8865 - i_1305_) / anInt8865;
								i_1304_ += i_1305_;
								i_1302_ += anInt8865 * i_1305_;
								i_1303_ += anInt8868 * i_1305_;
								i_1301_ += i_1305_;
							}
							if ((i_1305_ = (i_1302_ - anInt8865) / anInt8865) > i_1304_)
								i_1304_ = i_1305_;
							if (i_1303_ < 0) {
								i_1305_ = (anInt8868 - 1 - i_1303_) / anInt8868;
								i_1304_ += i_1305_;
								i_1302_ += anInt8865 * i_1305_;
								i_1303_ += anInt8868 * i_1305_;
								i_1301_ += i_1305_;
							}
							if ((i_1305_ = (1 + i_1303_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_1304_)
								i_1304_ = i_1305_;
							int i_1306_ = is[i_1300_] - i;
							int i_1307_ = -is_1241_[i_1300_];
							int i_1308_ = i_1306_ - (i_1301_ - anInt8870);
							if (i_1308_ > 0) {
								i_1301_ += i_1308_;
								i_1304_ += i_1308_;
								i_1302_ += anInt8865 * i_1308_;
								i_1303_ += anInt8868 * i_1308_;
							} else
								i_1307_ -= i_1308_;
							if (i_1304_ < i_1307_)
								i_1304_ = i_1307_;
							for (/**/; i_1304_ < 0; i_1304_++) {
								int i_1309_ = (((Class160_Sub1_Sub2) this).aByteArray10221[((i_1303_ >> 12) * (((Class160_Sub1_Sub2) this).anInt8851)) + (i_1302_ >> 12)]);
								if (i_1309_ != 0)
									is_1243_[i_1301_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1309_ & 0xff]);
								else
									i_1301_++;
								i_1302_ += anInt8865;
								i_1303_ += anInt8868;
							}
						}
						i_1299_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8868 == 0) {
				int i_1310_ = anInt8864;
				while (i_1310_ < 0) {
					int i_1311_ = i_1310_ + i_1242_;
					if (i_1311_ >= 0) {
						if (i_1311_ >= is.length)
							break;
						int i_1312_ = anInt8870;
						int i_1313_ = anInt8873 + anInt8858;
						int i_1314_ = anInt8874;
						int i_1315_ = anInt8862;
						if (i_1314_ >= 0 && i_1314_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) < 0) {
							if (i_1313_ < 0) {
								int i_1316_ = (anInt8865 - 1 - i_1313_) / anInt8865;
								i_1315_ += i_1316_;
								i_1313_ += anInt8865 * i_1316_;
								i_1312_ += i_1316_;
							}
							int i_1317_;
							if ((i_1317_ = (1 + i_1313_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1315_)
								i_1315_ = i_1317_;
							int i_1318_ = is[i_1311_] - i;
							int i_1319_ = -is_1241_[i_1311_];
							int i_1320_ = i_1318_ - (i_1312_ - anInt8870);
							if (i_1320_ > 0) {
								i_1312_ += i_1320_;
								i_1315_ += i_1320_;
								i_1313_ += anInt8865 * i_1320_;
								i_1314_ += anInt8868 * i_1320_;
							} else
								i_1319_ -= i_1320_;
							if (i_1315_ < i_1319_)
								i_1315_ = i_1319_;
							for (/**/; i_1315_ < 0; i_1315_++) {
								int i_1321_ = (((Class160_Sub1_Sub2) this).aByteArray10221[((i_1314_ >> 12) * (((Class160_Sub1_Sub2) this).anInt8851)) + (i_1313_ >> 12)]);
								if (i_1321_ != 0)
									is_1243_[i_1312_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1321_ & 0xff]);
								else
									i_1312_++;
								i_1313_ += anInt8865;
							}
						}
					}
					i_1310_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else if (anInt8868 < 0) {
				int i_1322_ = anInt8864;
				while (i_1322_ < 0) {
					int i_1323_ = i_1322_ + i_1242_;
					if (i_1323_ >= 0) {
						if (i_1323_ >= is.length)
							break;
						int i_1324_ = anInt8870;
						int i_1325_ = anInt8873 + anInt8858;
						int i_1326_ = anInt8874 + anInt8866;
						int i_1327_ = anInt8862;
						if (i_1325_ < 0) {
							int i_1328_ = (anInt8865 - 1 - i_1325_) / anInt8865;
							i_1327_ += i_1328_;
							i_1325_ += anInt8865 * i_1328_;
							i_1326_ += anInt8868 * i_1328_;
							i_1324_ += i_1328_;
						}
						int i_1329_;
						if ((i_1329_ = (1 + i_1325_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1327_)
							i_1327_ = i_1329_;
						if ((i_1329_ = i_1326_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12)) >= 0) {
							i_1329_ = (anInt8868 - i_1329_) / anInt8868;
							i_1327_ += i_1329_;
							i_1325_ += anInt8865 * i_1329_;
							i_1326_ += anInt8868 * i_1329_;
							i_1324_ += i_1329_;
						}
						if ((i_1329_ = (i_1326_ - anInt8868) / anInt8868) > i_1327_)
							i_1327_ = i_1329_;
						int i_1330_ = is[i_1323_] - i;
						int i_1331_ = -is_1241_[i_1323_];
						int i_1332_ = i_1330_ - (i_1324_ - anInt8870);
						if (i_1332_ > 0) {
							i_1324_ += i_1332_;
							i_1327_ += i_1332_;
							i_1325_ += anInt8865 * i_1332_;
							i_1326_ += anInt8868 * i_1332_;
						} else
							i_1331_ -= i_1332_;
						if (i_1327_ < i_1331_)
							i_1327_ = i_1331_;
						for (/**/; i_1327_ < 0; i_1327_++) {
							int i_1333_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(((i_1326_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_1325_ >> 12))]);
							if (i_1333_ != 0)
								is_1243_[i_1324_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1333_ & 0xff]);
							else
								i_1324_++;
							i_1325_ += anInt8865;
							i_1326_ += anInt8868;
						}
					}
					i_1322_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else {
				int i_1334_ = anInt8864;
				while (i_1334_ < 0) {
					int i_1335_ = i_1334_ + i_1242_;
					if (i_1335_ >= 0) {
						if (i_1335_ >= is.length)
							break;
						int i_1336_ = anInt8870;
						int i_1337_ = anInt8873 + anInt8858;
						int i_1338_ = anInt8874 + anInt8866;
						int i_1339_ = anInt8862;
						if (i_1337_ < 0) {
							int i_1340_ = (anInt8865 - 1 - i_1337_) / anInt8865;
							i_1339_ += i_1340_;
							i_1337_ += anInt8865 * i_1340_;
							i_1338_ += anInt8868 * i_1340_;
							i_1336_ += i_1340_;
						}
						int i_1341_;
						if ((i_1341_ = (1 + i_1337_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_1339_)
							i_1339_ = i_1341_;
						if (i_1338_ < 0) {
							i_1341_ = (anInt8868 - 1 - i_1338_) / anInt8868;
							i_1339_ += i_1341_;
							i_1337_ += anInt8865 * i_1341_;
							i_1338_ += anInt8868 * i_1341_;
							i_1336_ += i_1341_;
						}
						if ((i_1341_ = (1 + i_1338_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_1339_)
							i_1339_ = i_1341_;
						int i_1342_ = is[i_1335_] - i;
						int i_1343_ = -is_1241_[i_1335_];
						int i_1344_ = i_1342_ - (i_1336_ - anInt8870);
						if (i_1344_ > 0) {
							i_1336_ += i_1344_;
							i_1339_ += i_1344_;
							i_1337_ += anInt8865 * i_1344_;
							i_1338_ += anInt8868 * i_1344_;
						} else
							i_1343_ -= i_1344_;
						if (i_1339_ < i_1343_)
							i_1339_ = i_1343_;
						for (/**/; i_1339_ < 0; i_1339_++) {
							int i_1345_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(((i_1338_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_1337_ >> 12))]);
							if (i_1345_ != 0)
								is_1243_[i_1336_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1345_ & 0xff]);
							else
								i_1336_++;
							i_1337_ += anInt8865;
							i_1338_ += anInt8868;
						}
					}
					i_1334_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			}
		}
	}

	public Interface9 method2808() {
		throw new IllegalStateException();
	}

	public void method2768(int i, int i_1346_, int i_1347_, int i_1348_, int i_1349_, int i_1350_) {
		throw new IllegalStateException();
	}

	public void method2769(int i, int i_1351_, int i_1352_, int i_1353_, int i_1354_, int i_1355_) {
		throw new IllegalStateException();
	}

	public void method2770(int i, int i_1356_, int i_1357_) {
		throw new IllegalStateException();
	}

	public void method2771(int i, int i_1358_, int i_1359_) {
		throw new IllegalStateException();
	}

	public Interface9 method2801() {
		throw new IllegalStateException();
	}

	void method14255(boolean bool, boolean bool_1360_, boolean bool_1361_, int i, int i_1362_, float f, int i_1363_, int i_1364_, int i_1365_, int i_1366_, int i_1367_, int i_1368_, boolean bool_1369_) {
		if (i_1363_ > 0 && i_1364_ > 0 && (bool || bool_1360_)) {
			int i_1370_ = 0;
			int i_1371_ = 0;
			int i_1372_ = (((Class160_Sub1_Sub2) this).anInt8853 + ((Class160_Sub1_Sub2) this).anInt8851 + ((Class160_Sub1_Sub2) this).anInt8855);
			int i_1373_ = (((Class160_Sub1_Sub2) this).anInt8854 + ((Class160_Sub1_Sub2) this).anInt8867 + ((Class160_Sub1_Sub2) this).anInt8856);
			int i_1374_ = (i_1372_ << 16) / i_1363_;
			int i_1375_ = (i_1373_ << 16) / i_1364_;
			if (((Class160_Sub1_Sub2) this).anInt8853 > 0) {
				int i_1376_ = (((((Class160_Sub1_Sub2) this).anInt8853 << 16) + i_1374_ - 1) / i_1374_);
				i += i_1376_;
				i_1370_ += (i_1376_ * i_1374_ - (((Class160_Sub1_Sub2) this).anInt8853 << 16));
			}
			if (((Class160_Sub1_Sub2) this).anInt8854 > 0) {
				int i_1377_ = (((((Class160_Sub1_Sub2) this).anInt8854 << 16) + i_1375_ - 1) / i_1375_);
				i_1362_ += i_1377_;
				i_1371_ += (i_1377_ * i_1375_ - (((Class160_Sub1_Sub2) this).anInt8854 << 16));
			}
			if (((Class160_Sub1_Sub2) this).anInt8851 < i_1372_)
				i_1363_ = ((((Class160_Sub1_Sub2) this).anInt8851 << 16) - i_1370_ + i_1374_ - 1) / i_1374_;
			if (((Class160_Sub1_Sub2) this).anInt8867 < i_1373_)
				i_1364_ = ((((Class160_Sub1_Sub2) this).anInt8867 << 16) - i_1371_ + i_1375_ - 1) / i_1375_;
			int i_1378_ = i + i_1362_ * ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980) * 444800403);
			int i_1379_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980 * 444800403) - i_1363_);
			if (i_1362_ + i_1364_ > (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_1364_ -= (i_1362_ + i_1364_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i_1362_ < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_1380_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_1362_);
				i_1364_ -= i_1380_;
				i_1378_ += i_1380_ * (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				i_1371_ += i_1375_ * i_1380_;
			}
			if (i + i_1363_ > (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_1381_ = (i + i_1363_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_1363_ -= i_1381_;
				i_1379_ += i_1381_;
			}
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_1382_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_1363_ -= i_1382_;
				i_1378_ += i_1382_;
				i_1370_ += i_1374_ * i_1382_;
				i_1379_ += i_1382_;
			}
			float[] fs = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).aFloatArray9010);
			int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
			if (i_1367_ == 0) {
				if (i_1365_ == 1) {
					int i_1383_ = i_1370_;
					for (int i_1384_ = -i_1364_; i_1384_ < 0; i_1384_++) {
						int i_1385_ = ((i_1371_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_1386_ = -i_1363_; i_1386_ < 0; i_1386_++) {
							if (!bool_1360_ || f < fs[i_1378_]) {
								if (bool)
									is[i_1378_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[(i_1370_ >> 16) + i_1385_]) & 0xff)]);
								if (bool_1360_ && bool_1369_)
									fs[i_1378_] = f;
							}
							i_1370_ += i_1374_;
							i_1378_++;
						}
						i_1371_ += i_1375_;
						i_1370_ = i_1383_;
						i_1378_ += i_1379_;
					}
				} else if (i_1365_ == 0) {
					int i_1387_ = (i_1366_ & 0xff0000) >> 16;
					int i_1388_ = (i_1366_ & 0xff00) >> 8;
					int i_1389_ = i_1366_ & 0xff;
					int i_1390_ = i_1370_;
					for (int i_1391_ = -i_1364_; i_1391_ < 0; i_1391_++) {
						int i_1392_ = ((i_1371_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_1393_ = -i_1363_; i_1393_ < 0; i_1393_++) {
							if (!bool_1360_ || f < fs[i_1378_]) {
								if (bool) {
									int i_1394_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[(i_1370_ >> 16) + i_1392_]) & 0xff)]);
									int i_1395_ = ((i_1394_ & 0xff0000) * i_1387_ & ~0xffffff);
									int i_1396_ = ((i_1394_ & 0xff00) * i_1388_ & 0xff0000);
									int i_1397_ = (i_1394_ & 0xff) * i_1389_ & 0xff00;
									is[i_1378_] = (i_1395_ | i_1396_ | i_1397_) >>> 8;
								}
								if (bool_1360_ && bool_1369_)
									fs[i_1378_] = f;
							}
							i_1370_ += i_1374_;
							i_1378_++;
						}
						i_1371_ += i_1375_;
						i_1370_ = i_1390_;
						i_1378_ += i_1379_;
					}
				} else if (i_1365_ == 3) {
					int i_1398_ = i_1370_;
					for (int i_1399_ = -i_1364_; i_1399_ < 0; i_1399_++) {
						int i_1400_ = ((i_1371_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_1401_ = -i_1363_; i_1401_ < 0; i_1401_++) {
							if (!bool_1360_ || f < fs[i_1378_]) {
								if (bool) {
									byte i_1402_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1370_ >> 16) + i_1400_]);
									int i_1403_ = (i_1402_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1402_]) : 0);
									int i_1404_ = i_1403_ + i_1366_;
									int i_1405_ = ((i_1403_ & 0xff00ff) + (i_1366_ & 0xff00ff));
									int i_1406_ = ((i_1405_ & 0x1000100) + (i_1404_ - i_1405_ & 0x10000));
									is[i_1378_] = (i_1404_ - i_1406_ | i_1406_ - (i_1406_ >>> 8));
								}
								if (bool_1360_ && bool_1369_)
									fs[i_1378_] = f;
							}
							i_1370_ += i_1374_;
							i_1378_++;
						}
						i_1371_ += i_1375_;
						i_1370_ = i_1398_;
						i_1378_ += i_1379_;
					}
				} else if (i_1365_ == 2) {
					int i_1407_ = i_1366_ >>> 24;
					int i_1408_ = 256 - i_1407_;
					int i_1409_ = (i_1366_ & 0xff00ff) * i_1408_ & ~0xff00ff;
					int i_1410_ = (i_1366_ & 0xff00) * i_1408_ & 0xff0000;
					i_1366_ = (i_1409_ | i_1410_) >>> 8;
					int i_1411_ = i_1370_;
					for (int i_1412_ = -i_1364_; i_1412_ < 0; i_1412_++) {
						int i_1413_ = ((i_1371_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_1414_ = -i_1363_; i_1414_ < 0; i_1414_++) {
							if (!bool_1360_ || f < fs[i_1378_]) {
								if (bool) {
									int i_1415_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[(i_1370_ >> 16) + i_1413_]) & 0xff)]);
									i_1409_ = ((i_1415_ & 0xff00ff) * i_1407_ & ~0xff00ff);
									i_1410_ = ((i_1415_ & 0xff00) * i_1407_ & 0xff0000);
									is[i_1378_] = (((i_1409_ | i_1410_) >>> 8) + i_1366_);
								}
								if (bool_1360_ && bool_1369_)
									fs[i_1378_] = f;
							}
							i_1370_ += i_1374_;
							i_1378_++;
						}
						i_1371_ += i_1375_;
						i_1370_ = i_1411_;
						i_1378_ += i_1379_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1367_ == 1) {
				if (i_1365_ == 1) {
					int i_1416_ = i_1370_;
					for (int i_1417_ = -i_1364_; i_1417_ < 0; i_1417_++) {
						int i_1418_ = ((i_1371_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_1419_ = -i_1363_; i_1419_ < 0; i_1419_++) {
							if (!bool_1360_ || f < fs[i_1378_]) {
								int i_1420_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1370_ >> 16) + i_1418_]);
								if (i_1420_ != 0) {
									if (bool)
										is[i_1378_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1420_ & 0xff]);
									if (bool_1360_ && bool_1369_)
										fs[i_1378_] = f;
								}
							}
							i_1370_ += i_1374_;
							i_1378_++;
						}
						i_1371_ += i_1375_;
						i_1370_ = i_1416_;
						i_1378_ += i_1379_;
					}
				} else if (i_1365_ == 0) {
					int i_1421_ = i_1370_;
					if ((i_1366_ & 0xffffff) == 16777215) {
						int i_1422_ = i_1366_ >>> 24;
						int i_1423_ = 256 - i_1422_;
						for (int i_1424_ = -i_1364_; i_1424_ < 0; i_1424_++) {
							int i_1425_ = ((i_1371_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_1426_ = -i_1363_; i_1426_ < 0; i_1426_++) {
								if (!bool_1360_ || f < fs[i_1378_]) {
									int i_1427_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1370_ >> 16) + i_1425_]);
									if (i_1427_ != 0) {
										if (bool) {
											int i_1428_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1427_ & 0xff]);
											int i_1429_ = is[i_1378_];
											is[i_1378_] = (((((i_1428_ & 0xff00ff) * i_1422_) + ((i_1429_ & 0xff00ff) * i_1423_)) & ~0xff00ff) + ((((i_1428_ & 0xff00) * i_1422_) + ((i_1429_ & 0xff00) * i_1423_)) & 0xff0000)) >> 8;
										}
										if (bool_1360_ && bool_1369_)
											fs[i_1378_] = f;
									}
								}
								i_1370_ += i_1374_;
								i_1378_++;
							}
							i_1371_ += i_1375_;
							i_1370_ = i_1421_;
							i_1378_ += i_1379_;
						}
					} else {
						int i_1430_ = (i_1366_ & 0xff0000) >> 16;
						int i_1431_ = (i_1366_ & 0xff00) >> 8;
						int i_1432_ = i_1366_ & 0xff;
						int i_1433_ = i_1366_ >>> 24;
						int i_1434_ = 256 - i_1433_;
						for (int i_1435_ = -i_1364_; i_1435_ < 0; i_1435_++) {
							int i_1436_ = ((i_1371_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_1437_ = -i_1363_; i_1437_ < 0; i_1437_++) {
								if (!bool_1360_ || f < fs[i_1378_]) {
									int i_1438_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1370_ >> 16) + i_1436_]);
									if (i_1438_ != 0) {
										int i_1439_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1438_ & 0xff]);
										if (i_1433_ != 255) {
											if (bool) {
												int i_1440_ = (((i_1439_ & 0xff0000) * i_1430_) & ~0xffffff);
												int i_1441_ = (((i_1439_ & 0xff00) * i_1431_) & 0xff0000);
												int i_1442_ = (((i_1439_ & 0xff) * i_1432_) & 0xff00);
												i_1439_ = (i_1440_ | i_1441_ | i_1442_) >>> 8;
												int i_1443_ = is[i_1378_];
												is[i_1378_] = (((((i_1439_ & 0xff00ff) * i_1433_) + ((i_1443_ & 0xff00ff) * i_1434_)) & ~0xff00ff) + ((((i_1439_ & 0xff00) * i_1433_) + ((i_1443_ & 0xff00) * i_1434_)) & 0xff0000)) >> 8;
											}
											if (bool_1360_ && bool_1369_)
												fs[i_1378_] = f;
										} else {
											if (bool) {
												int i_1444_ = (((i_1439_ & 0xff0000) * i_1430_) & ~0xffffff);
												int i_1445_ = (((i_1439_ & 0xff00) * i_1431_) & 0xff0000);
												int i_1446_ = (((i_1439_ & 0xff) * i_1432_) & 0xff00);
												is[i_1378_] = (i_1444_ | i_1445_ | i_1446_) >>> 8;
											}
											if (bool_1360_ && bool_1369_)
												fs[i_1378_] = f;
										}
									}
								}
								i_1370_ += i_1374_;
								i_1378_++;
							}
							i_1371_ += i_1375_;
							i_1370_ = i_1421_;
							i_1378_ += i_1379_;
						}
					}
				} else if (i_1365_ == 3) {
					int i_1447_ = i_1370_;
					int i_1448_ = i_1366_ >>> 24;
					int i_1449_ = 256 - i_1448_;
					for (int i_1450_ = -i_1364_; i_1450_ < 0; i_1450_++) {
						int i_1451_ = ((i_1371_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_1452_ = -i_1363_; i_1452_ < 0; i_1452_++) {
							if (!bool_1360_ || f < fs[i_1378_]) {
								if (bool) {
									byte i_1453_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1370_ >> 16) + i_1451_]);
									int i_1454_ = (i_1453_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1453_]) : 0);
									int i_1455_ = i_1454_ + i_1366_;
									int i_1456_ = ((i_1454_ & 0xff00ff) + (i_1366_ & 0xff00ff));
									int i_1457_ = ((i_1456_ & 0x1000100) + (i_1455_ - i_1456_ & 0x10000));
									i_1457_ = (i_1455_ - i_1457_ | i_1457_ - (i_1457_ >>> 8));
									if (i_1454_ == 0 && i_1448_ != 255) {
										i_1454_ = i_1457_;
										i_1457_ = is[i_1378_];
										i_1457_ = ((((i_1454_ & 0xff00ff) * i_1448_ + ((i_1457_ & 0xff00ff) * i_1449_)) & ~0xff00ff) + (((i_1454_ & 0xff00) * i_1448_ + ((i_1457_ & 0xff00) * i_1449_)) & 0xff0000)) >> 8;
									}
									is[i_1378_] = i_1457_;
								}
								if (bool_1360_ && bool_1369_)
									fs[i_1378_] = f;
							}
							i_1370_ += i_1374_;
							i_1378_++;
						}
						i_1371_ += i_1375_;
						i_1370_ = i_1447_;
						i_1378_ += i_1379_;
					}
				} else if (i_1365_ == 2) {
					int i_1458_ = i_1366_ >>> 24;
					int i_1459_ = 256 - i_1458_;
					int i_1460_ = (i_1366_ & 0xff00ff) * i_1459_ & ~0xff00ff;
					int i_1461_ = (i_1366_ & 0xff00) * i_1459_ & 0xff0000;
					i_1366_ = (i_1460_ | i_1461_) >>> 8;
					int i_1462_ = i_1370_;
					for (int i_1463_ = -i_1364_; i_1463_ < 0; i_1463_++) {
						int i_1464_ = ((i_1371_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_1465_ = -i_1363_; i_1465_ < 0; i_1465_++) {
							if (!bool_1360_ || f < fs[i_1378_]) {
								int i_1466_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1370_ >> 16) + i_1464_]);
								if (i_1466_ != 0) {
									if (bool) {
										int i_1467_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1466_ & 0xff]);
										i_1460_ = ((i_1467_ & 0xff00ff) * i_1458_ & ~0xff00ff);
										i_1461_ = ((i_1467_ & 0xff00) * i_1458_ & 0xff0000);
										is[i_1378_] = ((i_1460_ | i_1461_) >>> 8) + i_1366_;
									}
									if (bool_1360_ && bool_1369_)
										fs[i_1378_] = f;
								}
							}
							i_1370_ += i_1374_;
							i_1378_++;
						}
						i_1371_ += i_1375_;
						i_1370_ = i_1462_;
						i_1378_ += i_1379_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1367_ == 2) {
				if (i_1365_ == 1) {
					int i_1468_ = i_1370_;
					for (int i_1469_ = -i_1364_; i_1469_ < 0; i_1469_++) {
						int i_1470_ = ((i_1371_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_1471_ = -i_1363_; i_1471_ < 0; i_1471_++) {
							if (!bool_1360_ || f < fs[i_1378_]) {
								int i_1472_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1370_ >> 16) + i_1470_]);
								if (i_1472_ != 0) {
									if (bool) {
										int i_1473_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1472_ & 0xff]);
										int i_1474_ = is[i_1378_];
										int i_1475_ = i_1473_ + i_1474_;
										int i_1476_ = ((i_1473_ & 0xff00ff) + (i_1474_ & 0xff00ff));
										i_1474_ = ((i_1476_ & 0x1000100) + (i_1475_ - i_1476_ & 0x10000));
										is[i_1378_] = (i_1475_ - i_1474_ | i_1474_ - (i_1474_ >>> 8));
									}
									if (bool_1360_ && bool_1369_)
										fs[i_1378_] = f;
								}
							}
							i_1370_ += i_1374_;
							i_1378_++;
						}
						i_1371_ += i_1375_;
						i_1370_ = i_1468_;
						i_1378_ += i_1379_;
					}
				} else if (i_1365_ == 0) {
					int i_1477_ = i_1370_;
					int i_1478_ = (i_1366_ & 0xff0000) >> 16;
					int i_1479_ = (i_1366_ & 0xff00) >> 8;
					int i_1480_ = i_1366_ & 0xff;
					for (int i_1481_ = -i_1364_; i_1481_ < 0; i_1481_++) {
						int i_1482_ = ((i_1371_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_1483_ = -i_1363_; i_1483_ < 0; i_1483_++) {
							if (!bool_1360_ || f < fs[i_1378_]) {
								int i_1484_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1370_ >> 16) + i_1482_]);
								if (i_1484_ != 0) {
									if (bool) {
										int i_1485_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1484_ & 0xff]);
										int i_1486_ = ((i_1485_ & 0xff0000) * i_1478_ & ~0xffffff);
										int i_1487_ = ((i_1485_ & 0xff00) * i_1479_ & 0xff0000);
										int i_1488_ = ((i_1485_ & 0xff) * i_1480_ & 0xff00);
										i_1485_ = (i_1486_ | i_1487_ | i_1488_) >>> 8;
										int i_1489_ = is[i_1378_];
										int i_1490_ = i_1485_ + i_1489_;
										int i_1491_ = ((i_1485_ & 0xff00ff) + (i_1489_ & 0xff00ff));
										i_1489_ = ((i_1491_ & 0x1000100) + (i_1490_ - i_1491_ & 0x10000));
										is[i_1378_] = (i_1490_ - i_1489_ | i_1489_ - (i_1489_ >>> 8));
									}
									if (bool_1360_ && bool_1369_)
										fs[i_1378_] = f;
								}
							}
							i_1370_ += i_1374_;
							i_1378_++;
						}
						i_1371_ += i_1375_;
						i_1370_ = i_1477_;
						i_1378_ += i_1379_;
					}
				} else if (i_1365_ == 3) {
					int i_1492_ = i_1370_;
					for (int i_1493_ = -i_1364_; i_1493_ < 0; i_1493_++) {
						int i_1494_ = ((i_1371_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_1495_ = -i_1363_; i_1495_ < 0; i_1495_++) {
							if (!bool_1360_ || f < fs[i_1378_]) {
								if (bool) {
									byte i_1496_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1370_ >> 16) + i_1494_]);
									int i_1497_ = (i_1496_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1496_]) : 0);
									int i_1498_ = i_1497_ + i_1366_;
									int i_1499_ = ((i_1497_ & 0xff00ff) + (i_1366_ & 0xff00ff));
									int i_1500_ = ((i_1499_ & 0x1000100) + (i_1498_ - i_1499_ & 0x10000));
									i_1497_ = (i_1498_ - i_1500_ | i_1500_ - (i_1500_ >>> 8));
									i_1500_ = is[i_1378_];
									i_1498_ = i_1497_ + i_1500_;
									i_1499_ = (i_1497_ & 0xff00ff) + (i_1500_ & 0xff00ff);
									i_1500_ = ((i_1499_ & 0x1000100) + (i_1498_ - i_1499_ & 0x10000));
									is[i_1378_] = (i_1498_ - i_1500_ | i_1500_ - (i_1500_ >>> 8));
								}
								if (bool_1360_ && bool_1369_)
									fs[i_1378_] = f;
							}
							i_1370_ += i_1374_;
							i_1378_++;
						}
						i_1371_ += i_1375_;
						i_1370_ = i_1492_;
						i_1378_ += i_1379_;
					}
				} else if (i_1365_ == 2) {
					int i_1501_ = i_1366_ >>> 24;
					int i_1502_ = 256 - i_1501_;
					int i_1503_ = (i_1366_ & 0xff00ff) * i_1502_ & ~0xff00ff;
					int i_1504_ = (i_1366_ & 0xff00) * i_1502_ & 0xff0000;
					i_1366_ = (i_1503_ | i_1504_) >>> 8;
					int i_1505_ = i_1370_;
					for (int i_1506_ = -i_1364_; i_1506_ < 0; i_1506_++) {
						int i_1507_ = ((i_1371_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_1508_ = -i_1363_; i_1508_ < 0; i_1508_++) {
							if (!bool_1360_ || f < fs[i_1378_]) {
								int i_1509_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1370_ >> 16) + i_1507_]);
								if (i_1509_ != 0) {
									if (bool) {
										int i_1510_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1509_ & 0xff]);
										i_1503_ = ((i_1510_ & 0xff00ff) * i_1501_ & ~0xff00ff);
										i_1504_ = ((i_1510_ & 0xff00) * i_1501_ & 0xff0000);
										i_1510_ = (((i_1503_ | i_1504_) >>> 8) + i_1366_);
										int i_1511_ = is[i_1378_];
										int i_1512_ = i_1510_ + i_1511_;
										int i_1513_ = ((i_1510_ & 0xff00ff) + (i_1511_ & 0xff00ff));
										i_1511_ = ((i_1513_ & 0x1000100) + (i_1512_ - i_1513_ & 0x10000));
										is[i_1378_] = (i_1512_ - i_1511_ | i_1511_ - (i_1511_ >>> 8));
									}
									if (bool_1360_ && bool_1369_)
										fs[i_1378_] = f;
								}
							}
							i_1370_ += i_1374_;
							i_1378_++;
						}
						i_1371_ += i_1375_;
						i_1370_ = i_1505_;
						i_1378_ += i_1379_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2767(int i, int i_1514_, int i_1515_, int i_1516_, int i_1517_, int i_1518_) {
		throw new IllegalStateException();
	}

	public void method2773(int i, int i_1519_, Class455 class455, int i_1520_, int i_1521_) {
		if (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			i += ((Class160_Sub1_Sub2) this).anInt8853;
			i_1519_ += ((Class160_Sub1_Sub2) this).anInt8854;
			int i_1522_ = 0;
			int i_1523_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			int i_1524_ = ((Class160_Sub1_Sub2) this).anInt8851;
			int i_1525_ = ((Class160_Sub1_Sub2) this).anInt8867;
			int i_1526_ = i_1523_ - i_1524_;
			int i_1527_ = 0;
			int i_1528_ = i + i_1519_ * i_1523_;
			if (i_1519_ < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_1529_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_1519_);
				i_1525_ -= i_1529_;
				i_1519_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_1522_ += i_1529_ * i_1524_;
				i_1528_ += i_1529_ * i_1523_;
			}
			if (i_1519_ + i_1525_ > (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_1525_ -= (i_1519_ + i_1525_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_1530_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_1524_ -= i_1530_;
				i = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_1522_ += i_1530_;
				i_1528_ += i_1530_;
				i_1527_ += i_1530_;
				i_1526_ += i_1530_;
			}
			if (i + i_1524_ > (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_1531_ = (i + i_1524_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_1524_ -= i_1531_;
				i_1527_ += i_1531_;
				i_1526_ += i_1531_;
			}
			if (i_1524_ > 0 && i_1525_ > 0) {
				PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
				int[] is_1532_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
				int[] is_1533_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
				int i_1534_ = i_1519_;
				if (i_1521_ > i_1534_) {
					i_1534_ = i_1521_;
					i_1528_ += (i_1521_ - i_1519_) * i_1523_;
					i_1522_ += ((i_1521_ - i_1519_) * ((Class160_Sub1_Sub2) this).anInt8851);
				}
				int i_1535_ = (i_1521_ + is_1532_.length < i_1519_ + i_1525_ ? i_1521_ + is_1532_.length : i_1519_ + i_1525_);
				for (int i_1536_ = i_1534_; i_1536_ < i_1535_; i_1536_++) {
					int i_1537_ = is_1532_[i_1536_ - i_1521_] + i_1520_;
					int i_1538_ = is_1533_[i_1536_ - i_1521_];
					int i_1539_ = i_1524_;
					if (i > i_1537_) {
						int i_1540_ = i - i_1537_;
						if (i_1540_ >= i_1538_) {
							i_1522_ += i_1524_ + i_1527_;
							i_1528_ += i_1524_ + i_1526_;
							continue;
						}
						i_1538_ -= i_1540_;
					} else {
						int i_1541_ = i_1537_ - i;
						if (i_1541_ >= i_1524_) {
							i_1522_ += i_1524_ + i_1527_;
							i_1528_ += i_1524_ + i_1526_;
							continue;
						}
						i_1522_ += i_1541_;
						i_1539_ -= i_1541_;
						i_1528_ += i_1541_;
					}
					int i_1542_ = 0;
					if (i_1539_ < i_1538_)
						i_1538_ = i_1539_;
					else
						i_1542_ = i_1539_ - i_1538_;
					for (int i_1543_ = -i_1538_; i_1543_ < 0; i_1543_++) {
						int i_1544_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1522_++]);
						if (i_1544_ != 0)
							is[i_1528_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1544_ & 0xff]);
						else
							i_1528_++;
					}
					i_1522_ += i_1542_ + i_1527_;
					i_1528_ += i_1542_ + i_1526_;
				}
			}
		}
	}

	void method2787(int i, int i_1545_, int i_1546_, int i_1547_, int i_1548_, int i_1549_, int i_1550_, int i_1551_) {
		if (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (i_1546_ > 0 && i_1547_ > 0) {
			int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
			if (is != null) {
				int i_1552_ = 0;
				int i_1553_ = 0;
				int i_1554_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				int i_1555_ = (((Class160_Sub1_Sub2) this).anInt8853 + ((Class160_Sub1_Sub2) this).anInt8851 + ((Class160_Sub1_Sub2) this).anInt8855);
				int i_1556_ = (((Class160_Sub1_Sub2) this).anInt8854 + ((Class160_Sub1_Sub2) this).anInt8867 + ((Class160_Sub1_Sub2) this).anInt8856);
				int i_1557_ = (i_1555_ << 16) / i_1546_;
				int i_1558_ = (i_1556_ << 16) / i_1547_;
				if (((Class160_Sub1_Sub2) this).anInt8853 > 0) {
					int i_1559_ = (((((Class160_Sub1_Sub2) this).anInt8853 << 16) + i_1557_ - 1) / i_1557_);
					i += i_1559_;
					i_1552_ += (i_1559_ * i_1557_ - (((Class160_Sub1_Sub2) this).anInt8853 << 16));
				}
				if (((Class160_Sub1_Sub2) this).anInt8854 > 0) {
					int i_1560_ = (((((Class160_Sub1_Sub2) this).anInt8854 << 16) + i_1558_ - 1) / i_1558_);
					i_1545_ += i_1560_;
					i_1553_ += (i_1560_ * i_1558_ - (((Class160_Sub1_Sub2) this).anInt8854 << 16));
				}
				if (((Class160_Sub1_Sub2) this).anInt8851 < i_1555_)
					i_1546_ = ((((Class160_Sub1_Sub2) this).anInt8851 << 16) - i_1552_ + i_1557_ - 1) / i_1557_;
				if (((Class160_Sub1_Sub2) this).anInt8867 < i_1556_)
					i_1547_ = ((((Class160_Sub1_Sub2) this).anInt8867 << 16) - i_1553_ + i_1558_ - 1) / i_1558_;
				int i_1561_ = i + i_1545_ * i_1554_;
				int i_1562_ = i_1554_ - i_1546_;
				if (i_1545_ + i_1547_ > (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8986 * 1383960921))
					i_1547_ -= (i_1545_ + i_1547_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
				if (i_1545_ < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009) * 1516535457) {
					int i_1563_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457) - i_1545_);
					i_1547_ -= i_1563_;
					i_1561_ += i_1563_ * i_1554_;
					i_1553_ += i_1558_ * i_1563_;
				}
				if (i + i_1546_ > (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002 * -1710988237)) {
					int i_1564_ = (i + i_1546_ - (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt9002) * -1710988237);
					i_1546_ -= i_1564_;
					i_1562_ += i_1564_;
				}
				if (i < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
					int i_1565_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989) - i);
					i_1546_ -= i_1565_;
					i_1561_ += i_1565_;
					i_1552_ += i_1557_ * i_1565_;
					i_1562_ += i_1565_;
				}
				if (i_1550_ == 0) {
					if (i_1548_ == 1) {
						int i_1566_ = i_1552_;
						for (int i_1567_ = -i_1547_; i_1567_ < 0; i_1567_++) {
							int i_1568_ = ((i_1553_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_1569_ = -i_1546_; i_1569_ < 0; i_1569_++) {
								is[i_1561_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[(i_1552_ >> 16) + i_1568_]) & 0xff]);
								i_1552_ += i_1557_;
							}
							i_1553_ += i_1558_;
							i_1552_ = i_1566_;
							i_1561_ += i_1562_;
						}
					} else if (i_1548_ == 0) {
						int i_1570_ = (i_1549_ & 0xff0000) >> 16;
						int i_1571_ = (i_1549_ & 0xff00) >> 8;
						int i_1572_ = i_1549_ & 0xff;
						int i_1573_ = i_1552_;
						for (int i_1574_ = -i_1547_; i_1574_ < 0; i_1574_++) {
							int i_1575_ = ((i_1553_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_1576_ = -i_1546_; i_1576_ < 0; i_1576_++) {
								int i_1577_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[(i_1552_ >> 16) + i_1575_]) & 0xff]);
								int i_1578_ = ((i_1577_ & 0xff0000) * i_1570_ & ~0xffffff);
								int i_1579_ = (i_1577_ & 0xff00) * i_1571_ & 0xff0000;
								int i_1580_ = (i_1577_ & 0xff) * i_1572_ & 0xff00;
								is[i_1561_++] = (i_1578_ | i_1579_ | i_1580_) >>> 8;
								i_1552_ += i_1557_;
							}
							i_1553_ += i_1558_;
							i_1552_ = i_1573_;
							i_1561_ += i_1562_;
						}
					} else if (i_1548_ == 3) {
						int i_1581_ = i_1552_;
						for (int i_1582_ = -i_1547_; i_1582_ < 0; i_1582_++) {
							int i_1583_ = ((i_1553_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_1584_ = -i_1546_; i_1584_ < 0; i_1584_++) {
								byte i_1585_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1552_ >> 16) + i_1583_]);
								int i_1586_ = (i_1585_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1585_]) : 0);
								int i_1587_ = i_1586_ + i_1549_;
								int i_1588_ = ((i_1586_ & 0xff00ff) + (i_1549_ & 0xff00ff));
								int i_1589_ = ((i_1588_ & 0x1000100) + (i_1587_ - i_1588_ & 0x10000));
								is[i_1561_++] = i_1587_ - i_1589_ | i_1589_ - (i_1589_ >>> 8);
								i_1552_ += i_1557_;
							}
							i_1553_ += i_1558_;
							i_1552_ = i_1581_;
							i_1561_ += i_1562_;
						}
					} else if (i_1548_ == 2) {
						int i_1590_ = i_1549_ >>> 24;
						int i_1591_ = 256 - i_1590_;
						int i_1592_ = (i_1549_ & 0xff00ff) * i_1591_ & ~0xff00ff;
						int i_1593_ = (i_1549_ & 0xff00) * i_1591_ & 0xff0000;
						i_1549_ = (i_1592_ | i_1593_) >>> 8;
						int i_1594_ = i_1552_;
						for (int i_1595_ = -i_1547_; i_1595_ < 0; i_1595_++) {
							int i_1596_ = ((i_1553_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_1597_ = -i_1546_; i_1597_ < 0; i_1597_++) {
								int i_1598_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[(i_1552_ >> 16) + i_1596_]) & 0xff]);
								i_1592_ = ((i_1598_ & 0xff00ff) * i_1590_ & ~0xff00ff);
								i_1593_ = (i_1598_ & 0xff00) * i_1590_ & 0xff0000;
								is[i_1561_++] = ((i_1592_ | i_1593_) >>> 8) + i_1549_;
								i_1552_ += i_1557_;
							}
							i_1553_ += i_1558_;
							i_1552_ = i_1594_;
							i_1561_ += i_1562_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1550_ == 1) {
					if (i_1548_ == 1) {
						int i_1599_ = i_1552_;
						for (int i_1600_ = -i_1547_; i_1600_ < 0; i_1600_++) {
							int i_1601_ = ((i_1553_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_1602_ = -i_1546_; i_1602_ < 0; i_1602_++) {
								int i_1603_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1552_ >> 16) + i_1601_]);
								if (i_1603_ != 0)
									is[i_1561_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1603_ & 0xff]);
								else
									i_1561_++;
								i_1552_ += i_1557_;
							}
							i_1553_ += i_1558_;
							i_1552_ = i_1599_;
							i_1561_ += i_1562_;
						}
					} else if (i_1548_ == 0) {
						int i_1604_ = i_1552_;
						if ((i_1549_ & 0xffffff) == 16777215) {
							int i_1605_ = i_1549_ >>> 24;
							int i_1606_ = 256 - i_1605_;
							for (int i_1607_ = -i_1547_; i_1607_ < 0; i_1607_++) {
								int i_1608_ = ((i_1553_ >> 16) * (((Class160_Sub1_Sub2) this).anInt8851));
								for (int i_1609_ = -i_1546_; i_1609_ < 0; i_1609_++) {
									int i_1610_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1552_ >> 16) + i_1608_]);
									if (i_1610_ != 0) {
										int i_1611_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1610_ & 0xff]);
										int i_1612_ = is[i_1561_];
										is[i_1561_++] = ((((i_1611_ & 0xff00ff) * i_1605_ + ((i_1612_ & 0xff00ff) * i_1606_)) & ~0xff00ff) + (((i_1611_ & 0xff00) * i_1605_ + ((i_1612_ & 0xff00) * i_1606_)) & 0xff0000)) >> 8;
									} else
										i_1561_++;
									i_1552_ += i_1557_;
								}
								i_1553_ += i_1558_;
								i_1552_ = i_1604_;
								i_1561_ += i_1562_;
							}
						} else {
							int i_1613_ = (i_1549_ & 0xff0000) >> 16;
							int i_1614_ = (i_1549_ & 0xff00) >> 8;
							int i_1615_ = i_1549_ & 0xff;
							int i_1616_ = i_1549_ >>> 24;
							int i_1617_ = 256 - i_1616_;
							for (int i_1618_ = -i_1547_; i_1618_ < 0; i_1618_++) {
								int i_1619_ = ((i_1553_ >> 16) * (((Class160_Sub1_Sub2) this).anInt8851));
								for (int i_1620_ = -i_1546_; i_1620_ < 0; i_1620_++) {
									int i_1621_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1552_ >> 16) + i_1619_]);
									if (i_1621_ != 0) {
										int i_1622_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1621_ & 0xff]);
										if (i_1616_ != 255) {
											int i_1623_ = (((i_1622_ & 0xff0000) * i_1613_) & ~0xffffff);
											int i_1624_ = ((i_1622_ & 0xff00) * i_1614_ & 0xff0000);
											int i_1625_ = ((i_1622_ & 0xff) * i_1615_ & 0xff00);
											i_1622_ = (i_1623_ | i_1624_ | i_1625_) >>> 8;
											int i_1626_ = is[i_1561_];
											is[i_1561_++] = (((((i_1622_ & 0xff00ff) * i_1616_) + ((i_1626_ & 0xff00ff) * i_1617_)) & ~0xff00ff) + ((((i_1622_ & 0xff00) * i_1616_) + ((i_1626_ & 0xff00) * i_1617_)) & 0xff0000)) >> 8;
										} else {
											int i_1627_ = (((i_1622_ & 0xff0000) * i_1613_) & ~0xffffff);
											int i_1628_ = ((i_1622_ & 0xff00) * i_1614_ & 0xff0000);
											int i_1629_ = ((i_1622_ & 0xff) * i_1615_ & 0xff00);
											is[i_1561_++] = (i_1627_ | i_1628_ | i_1629_) >>> 8;
										}
									} else
										i_1561_++;
									i_1552_ += i_1557_;
								}
								i_1553_ += i_1558_;
								i_1552_ = i_1604_;
								i_1561_ += i_1562_;
							}
						}
					} else if (i_1548_ == 3) {
						int i_1630_ = i_1552_;
						int i_1631_ = i_1549_ >>> 24;
						int i_1632_ = 256 - i_1631_;
						for (int i_1633_ = -i_1547_; i_1633_ < 0; i_1633_++) {
							int i_1634_ = ((i_1553_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_1635_ = -i_1546_; i_1635_ < 0; i_1635_++) {
								byte i_1636_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1552_ >> 16) + i_1634_]);
								int i_1637_ = (i_1636_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1636_]) : 0);
								int i_1638_ = i_1637_ + i_1549_;
								int i_1639_ = ((i_1637_ & 0xff00ff) + (i_1549_ & 0xff00ff));
								int i_1640_ = ((i_1639_ & 0x1000100) + (i_1638_ - i_1639_ & 0x10000));
								i_1640_ = i_1638_ - i_1640_ | i_1640_ - (i_1640_ >>> 8);
								if (i_1637_ == 0 && i_1631_ != 255) {
									i_1637_ = i_1640_;
									i_1640_ = is[i_1561_];
									i_1640_ = ((((i_1637_ & 0xff00ff) * i_1631_ + (i_1640_ & 0xff00ff) * i_1632_) & ~0xff00ff) + (((i_1637_ & 0xff00) * i_1631_ + (i_1640_ & 0xff00) * i_1632_) & 0xff0000)) >> 8;
								}
								is[i_1561_++] = i_1640_;
								i_1552_ += i_1557_;
							}
							i_1553_ += i_1558_;
							i_1552_ = i_1630_;
							i_1561_ += i_1562_;
						}
					} else if (i_1548_ == 2) {
						int i_1641_ = i_1549_ >>> 24;
						int i_1642_ = 256 - i_1641_;
						int i_1643_ = (i_1549_ & 0xff00ff) * i_1642_ & ~0xff00ff;
						int i_1644_ = (i_1549_ & 0xff00) * i_1642_ & 0xff0000;
						i_1549_ = (i_1643_ | i_1644_) >>> 8;
						int i_1645_ = i_1552_;
						for (int i_1646_ = -i_1547_; i_1646_ < 0; i_1646_++) {
							int i_1647_ = ((i_1553_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_1648_ = -i_1546_; i_1648_ < 0; i_1648_++) {
								int i_1649_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1552_ >> 16) + i_1647_]);
								if (i_1649_ != 0) {
									int i_1650_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1649_ & 0xff]);
									i_1643_ = ((i_1650_ & 0xff00ff) * i_1641_ & ~0xff00ff);
									i_1644_ = ((i_1650_ & 0xff00) * i_1641_ & 0xff0000);
									is[i_1561_++] = ((i_1643_ | i_1644_) >>> 8) + i_1549_;
								} else
									i_1561_++;
								i_1552_ += i_1557_;
							}
							i_1553_ += i_1558_;
							i_1552_ = i_1645_;
							i_1561_ += i_1562_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1550_ == 2) {
					if (i_1548_ == 1) {
						int i_1651_ = i_1552_;
						for (int i_1652_ = -i_1547_; i_1652_ < 0; i_1652_++) {
							int i_1653_ = ((i_1553_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_1654_ = -i_1546_; i_1654_ < 0; i_1654_++) {
								int i_1655_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1552_ >> 16) + i_1653_]);
								if (i_1655_ != 0) {
									int i_1656_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1655_ & 0xff]);
									int i_1657_ = is[i_1561_];
									int i_1658_ = i_1656_ + i_1657_;
									int i_1659_ = ((i_1656_ & 0xff00ff) + (i_1657_ & 0xff00ff));
									i_1657_ = ((i_1659_ & 0x1000100) + (i_1658_ - i_1659_ & 0x10000));
									is[i_1561_++] = (i_1658_ - i_1657_ | i_1657_ - (i_1657_ >>> 8));
								} else
									i_1561_++;
								i_1552_ += i_1557_;
							}
							i_1553_ += i_1558_;
							i_1552_ = i_1651_;
							i_1561_ += i_1562_;
						}
					} else if (i_1548_ == 0) {
						int i_1660_ = i_1552_;
						int i_1661_ = (i_1549_ & 0xff0000) >> 16;
						int i_1662_ = (i_1549_ & 0xff00) >> 8;
						int i_1663_ = i_1549_ & 0xff;
						for (int i_1664_ = -i_1547_; i_1664_ < 0; i_1664_++) {
							int i_1665_ = ((i_1553_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_1666_ = -i_1546_; i_1666_ < 0; i_1666_++) {
								int i_1667_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1552_ >> 16) + i_1665_]);
								if (i_1667_ != 0) {
									int i_1668_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1667_ & 0xff]);
									int i_1669_ = ((i_1668_ & 0xff0000) * i_1661_ & ~0xffffff);
									int i_1670_ = ((i_1668_ & 0xff00) * i_1662_ & 0xff0000);
									int i_1671_ = (i_1668_ & 0xff) * i_1663_ & 0xff00;
									i_1668_ = (i_1669_ | i_1670_ | i_1671_) >>> 8;
									int i_1672_ = is[i_1561_];
									int i_1673_ = i_1668_ + i_1672_;
									int i_1674_ = ((i_1668_ & 0xff00ff) + (i_1672_ & 0xff00ff));
									i_1672_ = ((i_1674_ & 0x1000100) + (i_1673_ - i_1674_ & 0x10000));
									is[i_1561_++] = (i_1673_ - i_1672_ | i_1672_ - (i_1672_ >>> 8));
								} else
									i_1561_++;
								i_1552_ += i_1557_;
							}
							i_1553_ += i_1558_;
							i_1552_ = i_1660_;
							i_1561_ += i_1562_;
						}
					} else if (i_1548_ == 3) {
						int i_1675_ = i_1552_;
						for (int i_1676_ = -i_1547_; i_1676_ < 0; i_1676_++) {
							int i_1677_ = ((i_1553_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_1678_ = -i_1546_; i_1678_ < 0; i_1678_++) {
								byte i_1679_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1552_ >> 16) + i_1677_]);
								int i_1680_ = (i_1679_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1679_]) : 0);
								int i_1681_ = i_1680_ + i_1549_;
								int i_1682_ = ((i_1680_ & 0xff00ff) + (i_1549_ & 0xff00ff));
								int i_1683_ = ((i_1682_ & 0x1000100) + (i_1681_ - i_1682_ & 0x10000));
								i_1680_ = i_1681_ - i_1683_ | i_1683_ - (i_1683_ >>> 8);
								i_1683_ = is[i_1561_];
								i_1681_ = i_1680_ + i_1683_;
								i_1682_ = (i_1680_ & 0xff00ff) + (i_1683_ & 0xff00ff);
								i_1683_ = ((i_1682_ & 0x1000100) + (i_1681_ - i_1682_ & 0x10000));
								is[i_1561_++] = i_1681_ - i_1683_ | i_1683_ - (i_1683_ >>> 8);
								i_1552_ += i_1557_;
							}
							i_1553_ += i_1558_;
							i_1552_ = i_1675_;
							i_1561_ += i_1562_;
						}
					} else if (i_1548_ == 2) {
						int i_1684_ = i_1549_ >>> 24;
						int i_1685_ = 256 - i_1684_;
						int i_1686_ = (i_1549_ & 0xff00ff) * i_1685_ & ~0xff00ff;
						int i_1687_ = (i_1549_ & 0xff00) * i_1685_ & 0xff0000;
						i_1549_ = (i_1686_ | i_1687_) >>> 8;
						int i_1688_ = i_1552_;
						for (int i_1689_ = -i_1547_; i_1689_ < 0; i_1689_++) {
							int i_1690_ = ((i_1553_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_1691_ = -i_1546_; i_1691_ < 0; i_1691_++) {
								int i_1692_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_1552_ >> 16) + i_1690_]);
								if (i_1692_ != 0) {
									int i_1693_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1692_ & 0xff]);
									i_1686_ = ((i_1693_ & 0xff00ff) * i_1684_ & ~0xff00ff);
									i_1687_ = ((i_1693_ & 0xff00) * i_1684_ & 0xff0000);
									i_1693_ = (((i_1686_ | i_1687_) >>> 8) + i_1549_);
									int i_1694_ = is[i_1561_];
									int i_1695_ = i_1693_ + i_1694_;
									int i_1696_ = ((i_1693_ & 0xff00ff) + (i_1694_ & 0xff00ff));
									i_1694_ = ((i_1696_ & 0x1000100) + (i_1695_ - i_1696_ & 0x10000));
									is[i_1561_++] = (i_1695_ - i_1694_ | i_1694_ - (i_1694_ >>> 8));
								} else
									i_1561_++;
								i_1552_ += i_1557_;
							}
							i_1553_ += i_1558_;
							i_1552_ = i_1688_;
							i_1561_ += i_1562_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method14246(int i, int i_1697_) {
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					int i_1698_ = anInt8864;
					while (i_1698_ < 0) {
						int i_1699_ = anInt8870;
						int i_1700_ = anInt8873;
						int i_1701_ = anInt8874;
						int i_1702_ = anInt8862;
						if (i_1700_ >= 0 && i_1701_ >= 0 && i_1700_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) < 0 && i_1701_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) < 0) {
							for (/**/; i_1702_ < 0; i_1702_++) {
								int i_1703_ = ((i_1701_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851 + (i_1700_ >> 12));
								int i_1704_ = i_1699_++;
								if (i_1697_ == 0) {
									if (i == 1)
										is[i_1704_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1703_]) & 0xff)]);
									else if (i == 0) {
										int i_1705_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1703_]) & 0xff)]);
										int i_1706_ = ((i_1705_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1707_ = ((i_1705_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1708_ = ((i_1705_ & 0xff) * anInt8882 & 0xff00);
										is[i_1704_] = (i_1706_ | i_1707_ | i_1708_) >>> 8;
									} else if (i == 3) {
										int i_1709_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1703_]) & 0xff)]);
										int i_1710_ = anInt8877;
										int i_1711_ = i_1709_ + i_1710_;
										int i_1712_ = ((i_1709_ & 0xff00ff) + (i_1710_ & 0xff00ff));
										int i_1713_ = ((i_1712_ & 0x1000100) + (i_1711_ - i_1712_ & 0x10000));
										is[i_1704_] = (i_1711_ - i_1713_ | i_1713_ - (i_1713_ >>> 8));
									} else if (i == 2) {
										int i_1714_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1703_]) & 0xff)]);
										int i_1715_ = ((i_1714_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1716_ = ((i_1714_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_1704_] = ((i_1715_ | i_1716_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_1697_ == 1) {
									if (i == 1) {
										int i_1717_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1703_]);
										if (i_1717_ != 0)
											is[i_1704_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1717_ & 0xff]);
									} else if (i == 0) {
										int i_1718_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1703_]);
										if (i_1718_ != 0) {
											int i_1719_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1718_ & 0xff]);
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_1720_ = anInt8877 >>> 24;
												int i_1721_ = 256 - i_1720_;
												int i_1722_ = is[i_1704_];
												is[i_1704_] = (((((i_1719_ & 0xff00ff) * i_1720_) + ((i_1722_ & 0xff00ff) * i_1721_)) & ~0xff00ff) + ((((i_1719_ & 0xff00) * i_1720_) + ((i_1722_ & 0xff00) * i_1721_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_1723_ = (((i_1719_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1724_ = (((i_1719_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1725_ = (((i_1719_ & 0xff) * anInt8882) & 0xff00);
												i_1719_ = (i_1723_ | i_1724_ | i_1725_) >>> 8;
												int i_1726_ = is[i_1704_];
												is[i_1704_] = (((((i_1719_ & 0xff00ff) * anInt8878) + ((i_1726_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1719_ & 0xff00) * anInt8878) + ((i_1726_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_1727_ = (((i_1719_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1728_ = (((i_1719_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1729_ = (((i_1719_ & 0xff) * anInt8882) & 0xff00);
												is[i_1704_] = (i_1727_ | i_1728_ | i_1729_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1730_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1703_]);
										int i_1731_ = (i_1730_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1730_]) : 0);
										int i_1732_ = anInt8877;
										int i_1733_ = i_1731_ + i_1732_;
										int i_1734_ = ((i_1731_ & 0xff00ff) + (i_1732_ & 0xff00ff));
										int i_1735_ = ((i_1734_ & 0x1000100) + (i_1733_ - i_1734_ & 0x10000));
										i_1735_ = (i_1733_ - i_1735_ | i_1735_ - (i_1735_ >>> 8));
										if (i_1731_ == 0 && anInt8878 != 255) {
											i_1731_ = i_1735_;
											i_1735_ = is[i_1704_];
											i_1735_ = (((((i_1731_ & 0xff00ff) * anInt8878) + ((i_1735_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1731_ & 0xff00) * anInt8878) + ((i_1735_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_1704_] = i_1735_;
									} else if (i == 2) {
										int i_1736_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1703_]);
										if (i_1736_ != 0) {
											int i_1737_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1736_ & 0xff]);
											int i_1738_ = (((i_1737_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1739_ = (((i_1737_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_1704_++] = (((i_1738_ | i_1739_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1697_ == 2) {
									if (i == 1) {
										int i_1740_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1703_]);
										if (i_1740_ != 0) {
											int i_1741_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1740_ & 0xff]);
											int i_1742_ = is[i_1704_];
											int i_1743_ = i_1741_ + i_1742_;
											int i_1744_ = ((i_1741_ & 0xff00ff) + (i_1742_ & 0xff00ff));
											i_1742_ = ((i_1744_ & 0x1000100) + (i_1743_ - i_1744_ & 0x10000));
											is[i_1704_] = (i_1743_ - i_1742_ | i_1742_ - (i_1742_ >>> 8));
										}
									} else if (i == 0) {
										int i_1745_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1703_]);
										if (i_1745_ != 0) {
											int i_1746_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1745_ & 0xff]);
											int i_1747_ = (((i_1746_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1748_ = (((i_1746_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1749_ = ((i_1746_ & 0xff) * anInt8882 & 0xff00);
											i_1746_ = (i_1747_ | i_1748_ | i_1749_) >>> 8;
											int i_1750_ = is[i_1704_];
											int i_1751_ = i_1746_ + i_1750_;
											int i_1752_ = ((i_1746_ & 0xff00ff) + (i_1750_ & 0xff00ff));
											i_1750_ = ((i_1752_ & 0x1000100) + (i_1751_ - i_1752_ & 0x10000));
											is[i_1704_] = (i_1751_ - i_1750_ | i_1750_ - (i_1750_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1753_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1703_]);
										int i_1754_ = (i_1753_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1753_]) : 0);
										int i_1755_ = anInt8877;
										int i_1756_ = i_1754_ + i_1755_;
										int i_1757_ = ((i_1754_ & 0xff00ff) + (i_1755_ & 0xff00ff));
										int i_1758_ = ((i_1757_ & 0x1000100) + (i_1756_ - i_1757_ & 0x10000));
										i_1758_ = (i_1756_ - i_1758_ | i_1758_ - (i_1758_ >>> 8));
										if (i_1754_ == 0 && anInt8878 != 255) {
											i_1754_ = i_1758_;
											i_1758_ = is[i_1704_];
											i_1758_ = (((((i_1754_ & 0xff00ff) * anInt8878) + ((i_1758_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1754_ & 0xff00) * anInt8878) + ((i_1758_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_1704_] = i_1758_;
									} else if (i == 2) {
										int i_1759_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1703_]);
										if (i_1759_ != 0) {
											int i_1760_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1759_ & 0xff]);
											int i_1761_ = (((i_1760_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1762_ = (((i_1760_ & 0xff00) * anInt8878) & 0xff0000);
											i_1760_ = ((i_1761_ | i_1762_) >>> 8) + anInt8885;
											int i_1763_ = is[i_1704_];
											int i_1764_ = i_1760_ + i_1763_;
											int i_1765_ = ((i_1760_ & 0xff00ff) + (i_1763_ & 0xff00ff));
											i_1763_ = ((i_1765_ & 0x1000100) + (i_1764_ - i_1765_ & 0x10000));
											is[i_1704_] = (i_1764_ - i_1763_ | i_1763_ - (i_1763_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_1698_++;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_1766_ = anInt8864;
					while (i_1766_ < 0) {
						int i_1767_ = anInt8870;
						int i_1768_ = anInt8873;
						int i_1769_ = anInt8874 + anInt8866;
						int i_1770_ = anInt8862;
						if (i_1768_ >= 0 && i_1768_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) < 0) {
							int i_1771_;
							if ((i_1771_ = (i_1769_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12))) >= 0) {
								i_1771_ = (anInt8868 - i_1771_) / anInt8868;
								i_1770_ += i_1771_;
								i_1769_ += anInt8868 * i_1771_;
								i_1767_ += i_1771_;
							}
							if ((i_1771_ = (i_1769_ - anInt8868) / anInt8868) > i_1770_)
								i_1770_ = i_1771_;
							for (/**/; i_1770_ < 0; i_1770_++) {
								int i_1772_ = ((i_1769_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851 + (i_1768_ >> 12));
								int i_1773_ = i_1767_++;
								if (i_1697_ == 0) {
									if (i == 1)
										is[i_1773_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1772_]) & 0xff)]);
									else if (i == 0) {
										int i_1774_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1772_]) & 0xff)]);
										int i_1775_ = ((i_1774_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1776_ = ((i_1774_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1777_ = ((i_1774_ & 0xff) * anInt8882 & 0xff00);
										is[i_1773_] = (i_1775_ | i_1776_ | i_1777_) >>> 8;
									} else if (i == 3) {
										int i_1778_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1772_]) & 0xff)]);
										int i_1779_ = anInt8877;
										int i_1780_ = i_1778_ + i_1779_;
										int i_1781_ = ((i_1778_ & 0xff00ff) + (i_1779_ & 0xff00ff));
										int i_1782_ = ((i_1781_ & 0x1000100) + (i_1780_ - i_1781_ & 0x10000));
										is[i_1773_] = (i_1780_ - i_1782_ | i_1782_ - (i_1782_ >>> 8));
									} else if (i == 2) {
										int i_1783_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1772_]) & 0xff)]);
										int i_1784_ = ((i_1783_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1785_ = ((i_1783_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_1773_] = ((i_1784_ | i_1785_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_1697_ == 1) {
									if (i == 1) {
										int i_1786_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1772_]);
										if (i_1786_ != 0)
											is[i_1773_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1786_ & 0xff]);
									} else if (i == 0) {
										int i_1787_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1772_]);
										if (i_1787_ != 0) {
											int i_1788_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1787_ & 0xff]);
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_1789_ = anInt8877 >>> 24;
												int i_1790_ = 256 - i_1789_;
												int i_1791_ = is[i_1773_];
												is[i_1773_] = (((((i_1788_ & 0xff00ff) * i_1789_) + ((i_1791_ & 0xff00ff) * i_1790_)) & ~0xff00ff) + ((((i_1788_ & 0xff00) * i_1789_) + ((i_1791_ & 0xff00) * i_1790_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_1792_ = (((i_1788_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1793_ = (((i_1788_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1794_ = (((i_1788_ & 0xff) * anInt8882) & 0xff00);
												i_1788_ = (i_1792_ | i_1793_ | i_1794_) >>> 8;
												int i_1795_ = is[i_1773_];
												is[i_1773_] = (((((i_1788_ & 0xff00ff) * anInt8878) + ((i_1795_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1788_ & 0xff00) * anInt8878) + ((i_1795_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_1796_ = (((i_1788_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1797_ = (((i_1788_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1798_ = (((i_1788_ & 0xff) * anInt8882) & 0xff00);
												is[i_1773_] = (i_1796_ | i_1797_ | i_1798_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1799_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1772_]);
										int i_1800_ = (i_1799_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1799_]) : 0);
										int i_1801_ = anInt8877;
										int i_1802_ = i_1800_ + i_1801_;
										int i_1803_ = ((i_1800_ & 0xff00ff) + (i_1801_ & 0xff00ff));
										int i_1804_ = ((i_1803_ & 0x1000100) + (i_1802_ - i_1803_ & 0x10000));
										i_1804_ = (i_1802_ - i_1804_ | i_1804_ - (i_1804_ >>> 8));
										if (i_1800_ == 0 && anInt8878 != 255) {
											i_1800_ = i_1804_;
											i_1804_ = is[i_1773_];
											i_1804_ = (((((i_1800_ & 0xff00ff) * anInt8878) + ((i_1804_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1800_ & 0xff00) * anInt8878) + ((i_1804_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_1773_] = i_1804_;
									} else if (i == 2) {
										int i_1805_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1772_]);
										if (i_1805_ != 0) {
											int i_1806_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1805_ & 0xff]);
											int i_1807_ = (((i_1806_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1808_ = (((i_1806_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_1773_++] = (((i_1807_ | i_1808_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1697_ == 2) {
									if (i == 1) {
										int i_1809_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1772_]);
										if (i_1809_ != 0) {
											int i_1810_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1809_ & 0xff]);
											int i_1811_ = is[i_1773_];
											int i_1812_ = i_1810_ + i_1811_;
											int i_1813_ = ((i_1810_ & 0xff00ff) + (i_1811_ & 0xff00ff));
											i_1811_ = ((i_1813_ & 0x1000100) + (i_1812_ - i_1813_ & 0x10000));
											is[i_1773_] = (i_1812_ - i_1811_ | i_1811_ - (i_1811_ >>> 8));
										}
									} else if (i == 0) {
										int i_1814_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1772_]);
										if (i_1814_ != 0) {
											int i_1815_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1814_ & 0xff]);
											int i_1816_ = (((i_1815_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1817_ = (((i_1815_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1818_ = ((i_1815_ & 0xff) * anInt8882 & 0xff00);
											i_1815_ = (i_1816_ | i_1817_ | i_1818_) >>> 8;
											int i_1819_ = is[i_1773_];
											int i_1820_ = i_1815_ + i_1819_;
											int i_1821_ = ((i_1815_ & 0xff00ff) + (i_1819_ & 0xff00ff));
											i_1819_ = ((i_1821_ & 0x1000100) + (i_1820_ - i_1821_ & 0x10000));
											is[i_1773_] = (i_1820_ - i_1819_ | i_1819_ - (i_1819_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1822_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1772_]);
										int i_1823_ = (i_1822_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1822_]) : 0);
										int i_1824_ = anInt8877;
										int i_1825_ = i_1823_ + i_1824_;
										int i_1826_ = ((i_1823_ & 0xff00ff) + (i_1824_ & 0xff00ff));
										int i_1827_ = ((i_1826_ & 0x1000100) + (i_1825_ - i_1826_ & 0x10000));
										i_1827_ = (i_1825_ - i_1827_ | i_1827_ - (i_1827_ >>> 8));
										if (i_1823_ == 0 && anInt8878 != 255) {
											i_1823_ = i_1827_;
											i_1827_ = is[i_1773_];
											i_1827_ = (((((i_1823_ & 0xff00ff) * anInt8878) + ((i_1827_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1823_ & 0xff00) * anInt8878) + ((i_1827_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_1773_] = i_1827_;
									} else if (i == 2) {
										int i_1828_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1772_]);
										if (i_1828_ != 0) {
											int i_1829_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1828_ & 0xff]);
											int i_1830_ = (((i_1829_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1831_ = (((i_1829_ & 0xff00) * anInt8878) & 0xff0000);
											i_1829_ = ((i_1830_ | i_1831_) >>> 8) + anInt8885;
											int i_1832_ = is[i_1773_];
											int i_1833_ = i_1829_ + i_1832_;
											int i_1834_ = ((i_1829_ & 0xff00ff) + (i_1832_ & 0xff00ff));
											i_1832_ = ((i_1834_ & 0x1000100) + (i_1833_ - i_1834_ & 0x10000));
											is[i_1773_] = (i_1833_ - i_1832_ | i_1832_ - (i_1832_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1769_ += anInt8868;
							}
						}
						i_1766_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				} else {
					int i_1835_ = anInt8864;
					while (i_1835_ < 0) {
						int i_1836_ = anInt8870;
						int i_1837_ = anInt8873;
						int i_1838_ = anInt8874 + anInt8866;
						int i_1839_ = anInt8862;
						if (i_1837_ >= 0 && i_1837_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) < 0) {
							if (i_1838_ < 0) {
								int i_1840_ = (anInt8868 - 1 - i_1838_) / anInt8868;
								i_1839_ += i_1840_;
								i_1838_ += anInt8868 * i_1840_;
								i_1836_ += i_1840_;
							}
							int i_1841_;
							if ((i_1841_ = (1 + i_1838_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_1839_)
								i_1839_ = i_1841_;
							for (/**/; i_1839_ < 0; i_1839_++) {
								int i_1842_ = ((i_1838_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851 + (i_1837_ >> 12));
								int i_1843_ = i_1836_++;
								if (i_1697_ == 0) {
									if (i == 1)
										is[i_1843_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1842_]) & 0xff)]);
									else if (i == 0) {
										int i_1844_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1842_]) & 0xff)]);
										int i_1845_ = ((i_1844_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1846_ = ((i_1844_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1847_ = ((i_1844_ & 0xff) * anInt8882 & 0xff00);
										is[i_1843_] = (i_1845_ | i_1846_ | i_1847_) >>> 8;
									} else if (i == 3) {
										int i_1848_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1842_]) & 0xff)]);
										int i_1849_ = anInt8877;
										int i_1850_ = i_1848_ + i_1849_;
										int i_1851_ = ((i_1848_ & 0xff00ff) + (i_1849_ & 0xff00ff));
										int i_1852_ = ((i_1851_ & 0x1000100) + (i_1850_ - i_1851_ & 0x10000));
										is[i_1843_] = (i_1850_ - i_1852_ | i_1852_ - (i_1852_ >>> 8));
									} else if (i == 2) {
										int i_1853_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1842_]) & 0xff)]);
										int i_1854_ = ((i_1853_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1855_ = ((i_1853_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_1843_] = ((i_1854_ | i_1855_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_1697_ == 1) {
									if (i == 1) {
										int i_1856_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1842_]);
										if (i_1856_ != 0)
											is[i_1843_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1856_ & 0xff]);
									} else if (i == 0) {
										int i_1857_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1842_]);
										if (i_1857_ != 0) {
											int i_1858_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1857_ & 0xff]);
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_1859_ = anInt8877 >>> 24;
												int i_1860_ = 256 - i_1859_;
												int i_1861_ = is[i_1843_];
												is[i_1843_] = (((((i_1858_ & 0xff00ff) * i_1859_) + ((i_1861_ & 0xff00ff) * i_1860_)) & ~0xff00ff) + ((((i_1858_ & 0xff00) * i_1859_) + ((i_1861_ & 0xff00) * i_1860_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_1862_ = (((i_1858_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1863_ = (((i_1858_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1864_ = (((i_1858_ & 0xff) * anInt8882) & 0xff00);
												i_1858_ = (i_1862_ | i_1863_ | i_1864_) >>> 8;
												int i_1865_ = is[i_1843_];
												is[i_1843_] = (((((i_1858_ & 0xff00ff) * anInt8878) + ((i_1865_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1858_ & 0xff00) * anInt8878) + ((i_1865_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_1866_ = (((i_1858_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1867_ = (((i_1858_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1868_ = (((i_1858_ & 0xff) * anInt8882) & 0xff00);
												is[i_1843_] = (i_1866_ | i_1867_ | i_1868_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1869_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1842_]);
										int i_1870_ = (i_1869_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1869_]) : 0);
										int i_1871_ = anInt8877;
										int i_1872_ = i_1870_ + i_1871_;
										int i_1873_ = ((i_1870_ & 0xff00ff) + (i_1871_ & 0xff00ff));
										int i_1874_ = ((i_1873_ & 0x1000100) + (i_1872_ - i_1873_ & 0x10000));
										i_1874_ = (i_1872_ - i_1874_ | i_1874_ - (i_1874_ >>> 8));
										if (i_1870_ == 0 && anInt8878 != 255) {
											i_1870_ = i_1874_;
											i_1874_ = is[i_1843_];
											i_1874_ = (((((i_1870_ & 0xff00ff) * anInt8878) + ((i_1874_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1870_ & 0xff00) * anInt8878) + ((i_1874_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_1843_] = i_1874_;
									} else if (i == 2) {
										int i_1875_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1842_]);
										if (i_1875_ != 0) {
											int i_1876_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1875_ & 0xff]);
											int i_1877_ = (((i_1876_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1878_ = (((i_1876_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_1843_++] = (((i_1877_ | i_1878_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1697_ == 2) {
									if (i == 1) {
										int i_1879_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1842_]);
										if (i_1879_ != 0) {
											int i_1880_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1879_ & 0xff]);
											int i_1881_ = is[i_1843_];
											int i_1882_ = i_1880_ + i_1881_;
											int i_1883_ = ((i_1880_ & 0xff00ff) + (i_1881_ & 0xff00ff));
											i_1881_ = ((i_1883_ & 0x1000100) + (i_1882_ - i_1883_ & 0x10000));
											is[i_1843_] = (i_1882_ - i_1881_ | i_1881_ - (i_1881_ >>> 8));
										}
									} else if (i == 0) {
										int i_1884_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1842_]);
										if (i_1884_ != 0) {
											int i_1885_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1884_ & 0xff]);
											int i_1886_ = (((i_1885_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1887_ = (((i_1885_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1888_ = ((i_1885_ & 0xff) * anInt8882 & 0xff00);
											i_1885_ = (i_1886_ | i_1887_ | i_1888_) >>> 8;
											int i_1889_ = is[i_1843_];
											int i_1890_ = i_1885_ + i_1889_;
											int i_1891_ = ((i_1885_ & 0xff00ff) + (i_1889_ & 0xff00ff));
											i_1889_ = ((i_1891_ & 0x1000100) + (i_1890_ - i_1891_ & 0x10000));
											is[i_1843_] = (i_1890_ - i_1889_ | i_1889_ - (i_1889_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1892_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1842_]);
										int i_1893_ = (i_1892_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1892_]) : 0);
										int i_1894_ = anInt8877;
										int i_1895_ = i_1893_ + i_1894_;
										int i_1896_ = ((i_1893_ & 0xff00ff) + (i_1894_ & 0xff00ff));
										int i_1897_ = ((i_1896_ & 0x1000100) + (i_1895_ - i_1896_ & 0x10000));
										i_1897_ = (i_1895_ - i_1897_ | i_1897_ - (i_1897_ >>> 8));
										if (i_1893_ == 0 && anInt8878 != 255) {
											i_1893_ = i_1897_;
											i_1897_ = is[i_1843_];
											i_1897_ = (((((i_1893_ & 0xff00ff) * anInt8878) + ((i_1897_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1893_ & 0xff00) * anInt8878) + ((i_1897_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_1843_] = i_1897_;
									} else if (i == 2) {
										int i_1898_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1842_]);
										if (i_1898_ != 0) {
											int i_1899_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1898_ & 0xff]);
											int i_1900_ = (((i_1899_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1901_ = (((i_1899_ & 0xff00) * anInt8878) & 0xff0000);
											i_1899_ = ((i_1900_ | i_1901_) >>> 8) + anInt8885;
											int i_1902_ = is[i_1843_];
											int i_1903_ = i_1899_ + i_1902_;
											int i_1904_ = ((i_1899_ & 0xff00ff) + (i_1902_ & 0xff00ff));
											i_1902_ = ((i_1904_ & 0x1000100) + (i_1903_ - i_1904_ & 0x10000));
											is[i_1843_] = (i_1903_ - i_1902_ | i_1902_ - (i_1902_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1838_ += anInt8868;
							}
						}
						i_1835_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					int i_1905_ = anInt8864;
					while (i_1905_ < 0) {
						int i_1906_ = anInt8870;
						int i_1907_ = anInt8873 + anInt8858;
						int i_1908_ = anInt8874;
						int i_1909_ = anInt8862;
						if (i_1908_ >= 0 && i_1908_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) < 0) {
							int i_1910_;
							if ((i_1910_ = (i_1907_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12))) >= 0) {
								i_1910_ = (anInt8865 - i_1910_) / anInt8865;
								i_1909_ += i_1910_;
								i_1907_ += anInt8865 * i_1910_;
								i_1906_ += i_1910_;
							}
							if ((i_1910_ = (i_1907_ - anInt8865) / anInt8865) > i_1909_)
								i_1909_ = i_1910_;
							for (/**/; i_1909_ < 0; i_1909_++) {
								int i_1911_ = ((i_1908_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851 + (i_1907_ >> 12));
								int i_1912_ = i_1906_++;
								if (i_1697_ == 0) {
									if (i == 1)
										is[i_1912_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1911_]) & 0xff)]);
									else if (i == 0) {
										int i_1913_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1911_]) & 0xff)]);
										int i_1914_ = ((i_1913_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_1915_ = ((i_1913_ & 0xff00) * anInt8852 & 0xff0000);
										int i_1916_ = ((i_1913_ & 0xff) * anInt8882 & 0xff00);
										is[i_1912_] = (i_1914_ | i_1915_ | i_1916_) >>> 8;
									} else if (i == 3) {
										int i_1917_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1911_]) & 0xff)]);
										int i_1918_ = anInt8877;
										int i_1919_ = i_1917_ + i_1918_;
										int i_1920_ = ((i_1917_ & 0xff00ff) + (i_1918_ & 0xff00ff));
										int i_1921_ = ((i_1920_ & 0x1000100) + (i_1919_ - i_1920_ & 0x10000));
										is[i_1912_] = (i_1919_ - i_1921_ | i_1921_ - (i_1921_ >>> 8));
									} else if (i == 2) {
										int i_1922_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1911_]) & 0xff)]);
										int i_1923_ = ((i_1922_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_1924_ = ((i_1922_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_1912_] = ((i_1923_ | i_1924_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_1697_ == 1) {
									if (i == 1) {
										int i_1925_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1911_]);
										if (i_1925_ != 0)
											is[i_1912_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1925_ & 0xff]);
									} else if (i == 0) {
										int i_1926_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1911_]);
										if (i_1926_ != 0) {
											int i_1927_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1926_ & 0xff]);
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_1928_ = anInt8877 >>> 24;
												int i_1929_ = 256 - i_1928_;
												int i_1930_ = is[i_1912_];
												is[i_1912_] = (((((i_1927_ & 0xff00ff) * i_1928_) + ((i_1930_ & 0xff00ff) * i_1929_)) & ~0xff00ff) + ((((i_1927_ & 0xff00) * i_1928_) + ((i_1930_ & 0xff00) * i_1929_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_1931_ = (((i_1927_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1932_ = (((i_1927_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1933_ = (((i_1927_ & 0xff) * anInt8882) & 0xff00);
												i_1927_ = (i_1931_ | i_1932_ | i_1933_) >>> 8;
												int i_1934_ = is[i_1912_];
												is[i_1912_] = (((((i_1927_ & 0xff00ff) * anInt8878) + ((i_1934_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1927_ & 0xff00) * anInt8878) + ((i_1934_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_1935_ = (((i_1927_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_1936_ = (((i_1927_ & 0xff00) * anInt8852) & 0xff0000);
												int i_1937_ = (((i_1927_ & 0xff) * anInt8882) & 0xff00);
												is[i_1912_] = (i_1935_ | i_1936_ | i_1937_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1938_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1911_]);
										int i_1939_ = (i_1938_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1938_]) : 0);
										int i_1940_ = anInt8877;
										int i_1941_ = i_1939_ + i_1940_;
										int i_1942_ = ((i_1939_ & 0xff00ff) + (i_1940_ & 0xff00ff));
										int i_1943_ = ((i_1942_ & 0x1000100) + (i_1941_ - i_1942_ & 0x10000));
										i_1943_ = (i_1941_ - i_1943_ | i_1943_ - (i_1943_ >>> 8));
										if (i_1939_ == 0 && anInt8878 != 255) {
											i_1939_ = i_1943_;
											i_1943_ = is[i_1912_];
											i_1943_ = (((((i_1939_ & 0xff00ff) * anInt8878) + ((i_1943_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1939_ & 0xff00) * anInt8878) + ((i_1943_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_1912_] = i_1943_;
									} else if (i == 2) {
										int i_1944_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1911_]);
										if (i_1944_ != 0) {
											int i_1945_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1944_ & 0xff]);
											int i_1946_ = (((i_1945_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1947_ = (((i_1945_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_1912_++] = (((i_1946_ | i_1947_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1697_ == 2) {
									if (i == 1) {
										int i_1948_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1911_]);
										if (i_1948_ != 0) {
											int i_1949_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1948_ & 0xff]);
											int i_1950_ = is[i_1912_];
											int i_1951_ = i_1949_ + i_1950_;
											int i_1952_ = ((i_1949_ & 0xff00ff) + (i_1950_ & 0xff00ff));
											i_1950_ = ((i_1952_ & 0x1000100) + (i_1951_ - i_1952_ & 0x10000));
											is[i_1912_] = (i_1951_ - i_1950_ | i_1950_ - (i_1950_ >>> 8));
										}
									} else if (i == 0) {
										int i_1953_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1911_]);
										if (i_1953_ != 0) {
											int i_1954_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1953_ & 0xff]);
											int i_1955_ = (((i_1954_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_1956_ = (((i_1954_ & 0xff00) * anInt8852) & 0xff0000);
											int i_1957_ = ((i_1954_ & 0xff) * anInt8882 & 0xff00);
											i_1954_ = (i_1955_ | i_1956_ | i_1957_) >>> 8;
											int i_1958_ = is[i_1912_];
											int i_1959_ = i_1954_ + i_1958_;
											int i_1960_ = ((i_1954_ & 0xff00ff) + (i_1958_ & 0xff00ff));
											i_1958_ = ((i_1960_ & 0x1000100) + (i_1959_ - i_1960_ & 0x10000));
											is[i_1912_] = (i_1959_ - i_1958_ | i_1958_ - (i_1958_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1961_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1911_]);
										int i_1962_ = (i_1961_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_1961_]) : 0);
										int i_1963_ = anInt8877;
										int i_1964_ = i_1962_ + i_1963_;
										int i_1965_ = ((i_1962_ & 0xff00ff) + (i_1963_ & 0xff00ff));
										int i_1966_ = ((i_1965_ & 0x1000100) + (i_1964_ - i_1965_ & 0x10000));
										i_1966_ = (i_1964_ - i_1966_ | i_1966_ - (i_1966_ >>> 8));
										if (i_1962_ == 0 && anInt8878 != 255) {
											i_1962_ = i_1966_;
											i_1966_ = is[i_1912_];
											i_1966_ = (((((i_1962_ & 0xff00ff) * anInt8878) + ((i_1966_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1962_ & 0xff00) * anInt8878) + ((i_1966_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_1912_] = i_1966_;
									} else if (i == 2) {
										int i_1967_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1911_]);
										if (i_1967_ != 0) {
											int i_1968_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1967_ & 0xff]);
											int i_1969_ = (((i_1968_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_1970_ = (((i_1968_ & 0xff00) * anInt8878) & 0xff0000);
											i_1968_ = ((i_1969_ | i_1970_) >>> 8) + anInt8885;
											int i_1971_ = is[i_1912_];
											int i_1972_ = i_1968_ + i_1971_;
											int i_1973_ = ((i_1968_ & 0xff00ff) + (i_1971_ & 0xff00ff));
											i_1971_ = ((i_1973_ & 0x1000100) + (i_1972_ - i_1973_ & 0x10000));
											is[i_1912_] = (i_1972_ - i_1971_ | i_1971_ - (i_1971_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1907_ += anInt8865;
							}
						}
						i_1905_++;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_1974_ = anInt8864;
					while (i_1974_ < 0) {
						int i_1975_ = anInt8870;
						int i_1976_ = anInt8873 + anInt8858;
						int i_1977_ = anInt8874 + anInt8866;
						int i_1978_ = anInt8862;
						int i_1979_;
						if ((i_1979_ = i_1976_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12)) >= 0) {
							i_1979_ = (anInt8865 - i_1979_) / anInt8865;
							i_1978_ += i_1979_;
							i_1976_ += anInt8865 * i_1979_;
							i_1977_ += anInt8868 * i_1979_;
							i_1975_ += i_1979_;
						}
						if ((i_1979_ = (i_1976_ - anInt8865) / anInt8865) > i_1978_)
							i_1978_ = i_1979_;
						if ((i_1979_ = i_1977_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12)) >= 0) {
							i_1979_ = (anInt8868 - i_1979_) / anInt8868;
							i_1978_ += i_1979_;
							i_1976_ += anInt8865 * i_1979_;
							i_1977_ += anInt8868 * i_1979_;
							i_1975_ += i_1979_;
						}
						if ((i_1979_ = (i_1977_ - anInt8868) / anInt8868) > i_1978_)
							i_1978_ = i_1979_;
						for (/**/; i_1978_ < 0; i_1978_++) {
							int i_1980_ = (((i_1977_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_1976_ >> 12));
							int i_1981_ = i_1975_++;
							if (i_1697_ == 0) {
								if (i == 1)
									is[i_1981_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1980_]) & 0xff)]);
								else if (i == 0) {
									int i_1982_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1980_]) & 0xff)]);
									int i_1983_ = ((i_1982_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_1984_ = ((i_1982_ & 0xff00) * anInt8852 & 0xff0000);
									int i_1985_ = ((i_1982_ & 0xff) * anInt8882 & 0xff00);
									is[i_1981_] = (i_1983_ | i_1984_ | i_1985_) >>> 8;
								} else if (i == 3) {
									int i_1986_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1980_]) & 0xff)]);
									int i_1987_ = anInt8877;
									int i_1988_ = i_1986_ + i_1987_;
									int i_1989_ = ((i_1986_ & 0xff00ff) + (i_1987_ & 0xff00ff));
									int i_1990_ = ((i_1989_ & 0x1000100) + (i_1988_ - i_1989_ & 0x10000));
									is[i_1981_] = (i_1988_ - i_1990_ | i_1990_ - (i_1990_ >>> 8));
								} else if (i == 2) {
									int i_1991_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_1980_]) & 0xff)]);
									int i_1992_ = ((i_1991_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_1993_ = ((i_1991_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_1981_] = (((i_1992_ | i_1993_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_1697_ == 1) {
								if (i == 1) {
									int i_1994_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1980_]);
									if (i_1994_ != 0)
										is[i_1981_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1994_ & 0xff]);
								} else if (i == 0) {
									int i_1995_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1980_]);
									if (i_1995_ != 0) {
										int i_1996_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_1995_ & 0xff]);
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_1997_ = anInt8877 >>> 24;
											int i_1998_ = 256 - i_1997_;
											int i_1999_ = is[i_1981_];
											is[i_1981_] = (((((i_1996_ & 0xff00ff) * i_1997_) + ((i_1999_ & 0xff00ff) * i_1998_)) & ~0xff00ff) + ((((i_1996_ & 0xff00) * i_1997_) + ((i_1999_ & 0xff00) * i_1998_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_2000_ = (((i_1996_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2001_ = (((i_1996_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2002_ = ((i_1996_ & 0xff) * anInt8882 & 0xff00);
											i_1996_ = (i_2000_ | i_2001_ | i_2002_) >>> 8;
											int i_2003_ = is[i_1981_];
											is[i_1981_] = (((((i_1996_ & 0xff00ff) * anInt8878) + ((i_2003_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_1996_ & 0xff00) * anInt8878) + ((i_2003_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_2004_ = (((i_1996_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2005_ = (((i_1996_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2006_ = ((i_1996_ & 0xff) * anInt8882 & 0xff00);
											is[i_1981_] = (i_2004_ | i_2005_ | i_2006_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_2007_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1980_]);
									int i_2008_ = (i_2007_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2007_]) : 0);
									int i_2009_ = anInt8877;
									int i_2010_ = i_2008_ + i_2009_;
									int i_2011_ = ((i_2008_ & 0xff00ff) + (i_2009_ & 0xff00ff));
									int i_2012_ = ((i_2011_ & 0x1000100) + (i_2010_ - i_2011_ & 0x10000));
									i_2012_ = (i_2010_ - i_2012_ | i_2012_ - (i_2012_ >>> 8));
									if (i_2008_ == 0 && anInt8878 != 255) {
										i_2008_ = i_2012_;
										i_2012_ = is[i_1981_];
										i_2012_ = (((((i_2008_ & 0xff00ff) * anInt8878) + ((i_2012_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2008_ & 0xff00) * anInt8878) + ((i_2012_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_1981_] = i_2012_;
								} else if (i == 2) {
									int i_2013_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1980_]);
									if (i_2013_ != 0) {
										int i_2014_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2013_ & 0xff]);
										int i_2015_ = ((i_2014_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2016_ = ((i_2014_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_1981_++] = ((i_2015_ | i_2016_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1697_ == 2) {
								if (i == 1) {
									int i_2017_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1980_]);
									if (i_2017_ != 0) {
										int i_2018_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2017_ & 0xff]);
										int i_2019_ = is[i_1981_];
										int i_2020_ = i_2018_ + i_2019_;
										int i_2021_ = ((i_2018_ & 0xff00ff) + (i_2019_ & 0xff00ff));
										i_2019_ = ((i_2021_ & 0x1000100) + (i_2020_ - i_2021_ & 0x10000));
										is[i_1981_] = (i_2020_ - i_2019_ | i_2019_ - (i_2019_ >>> 8));
									}
								} else if (i == 0) {
									int i_2022_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1980_]);
									if (i_2022_ != 0) {
										int i_2023_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2022_ & 0xff]);
										int i_2024_ = ((i_2023_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2025_ = ((i_2023_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2026_ = ((i_2023_ & 0xff) * anInt8882 & 0xff00);
										i_2023_ = (i_2024_ | i_2025_ | i_2026_) >>> 8;
										int i_2027_ = is[i_1981_];
										int i_2028_ = i_2023_ + i_2027_;
										int i_2029_ = ((i_2023_ & 0xff00ff) + (i_2027_ & 0xff00ff));
										i_2027_ = ((i_2029_ & 0x1000100) + (i_2028_ - i_2029_ & 0x10000));
										is[i_1981_] = (i_2028_ - i_2027_ | i_2027_ - (i_2027_ >>> 8));
									}
								} else if (i == 3) {
									byte i_2030_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1980_]);
									int i_2031_ = (i_2030_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2030_]) : 0);
									int i_2032_ = anInt8877;
									int i_2033_ = i_2031_ + i_2032_;
									int i_2034_ = ((i_2031_ & 0xff00ff) + (i_2032_ & 0xff00ff));
									int i_2035_ = ((i_2034_ & 0x1000100) + (i_2033_ - i_2034_ & 0x10000));
									i_2035_ = (i_2033_ - i_2035_ | i_2035_ - (i_2035_ >>> 8));
									if (i_2031_ == 0 && anInt8878 != 255) {
										i_2031_ = i_2035_;
										i_2035_ = is[i_1981_];
										i_2035_ = (((((i_2031_ & 0xff00ff) * anInt8878) + ((i_2035_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2031_ & 0xff00) * anInt8878) + ((i_2035_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_1981_] = i_2035_;
								} else if (i == 2) {
									int i_2036_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_1980_]);
									if (i_2036_ != 0) {
										int i_2037_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2036_ & 0xff]);
										int i_2038_ = ((i_2037_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2039_ = ((i_2037_ & 0xff00) * anInt8878 & 0xff0000);
										i_2037_ = (((i_2038_ | i_2039_) >>> 8) + anInt8885);
										int i_2040_ = is[i_1981_];
										int i_2041_ = i_2037_ + i_2040_;
										int i_2042_ = ((i_2037_ & 0xff00ff) + (i_2040_ & 0xff00ff));
										i_2040_ = ((i_2042_ & 0x1000100) + (i_2041_ - i_2042_ & 0x10000));
										is[i_1981_] = (i_2041_ - i_2040_ | i_2040_ - (i_2040_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1976_ += anInt8865;
							i_1977_ += anInt8868;
						}
						i_1974_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else {
					int i_2043_ = anInt8864;
					while (i_2043_ < 0) {
						int i_2044_ = anInt8870;
						int i_2045_ = anInt8873 + anInt8858;
						int i_2046_ = anInt8874 + anInt8866;
						int i_2047_ = anInt8862;
						int i_2048_;
						if ((i_2048_ = i_2045_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12)) >= 0) {
							i_2048_ = (anInt8865 - i_2048_) / anInt8865;
							i_2047_ += i_2048_;
							i_2045_ += anInt8865 * i_2048_;
							i_2046_ += anInt8868 * i_2048_;
							i_2044_ += i_2048_;
						}
						if ((i_2048_ = (i_2045_ - anInt8865) / anInt8865) > i_2047_)
							i_2047_ = i_2048_;
						if (i_2046_ < 0) {
							i_2048_ = (anInt8868 - 1 - i_2046_) / anInt8868;
							i_2047_ += i_2048_;
							i_2045_ += anInt8865 * i_2048_;
							i_2046_ += anInt8868 * i_2048_;
							i_2044_ += i_2048_;
						}
						if ((i_2048_ = (1 + i_2046_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_2047_)
							i_2047_ = i_2048_;
						for (/**/; i_2047_ < 0; i_2047_++) {
							int i_2049_ = (((i_2046_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_2045_ >> 12));
							int i_2050_ = i_2044_++;
							if (i_1697_ == 0) {
								if (i == 1)
									is[i_2050_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2049_]) & 0xff)]);
								else if (i == 0) {
									int i_2051_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2049_]) & 0xff)]);
									int i_2052_ = ((i_2051_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2053_ = ((i_2051_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2054_ = ((i_2051_ & 0xff) * anInt8882 & 0xff00);
									is[i_2050_] = (i_2052_ | i_2053_ | i_2054_) >>> 8;
								} else if (i == 3) {
									int i_2055_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2049_]) & 0xff)]);
									int i_2056_ = anInt8877;
									int i_2057_ = i_2055_ + i_2056_;
									int i_2058_ = ((i_2055_ & 0xff00ff) + (i_2056_ & 0xff00ff));
									int i_2059_ = ((i_2058_ & 0x1000100) + (i_2057_ - i_2058_ & 0x10000));
									is[i_2050_] = (i_2057_ - i_2059_ | i_2059_ - (i_2059_ >>> 8));
								} else if (i == 2) {
									int i_2060_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2049_]) & 0xff)]);
									int i_2061_ = ((i_2060_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2062_ = ((i_2060_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2050_] = (((i_2061_ | i_2062_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_1697_ == 1) {
								if (i == 1) {
									int i_2063_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2049_]);
									if (i_2063_ != 0)
										is[i_2050_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2063_ & 0xff]);
								} else if (i == 0) {
									int i_2064_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2049_]);
									if (i_2064_ != 0) {
										int i_2065_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2064_ & 0xff]);
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_2066_ = anInt8877 >>> 24;
											int i_2067_ = 256 - i_2066_;
											int i_2068_ = is[i_2050_];
											is[i_2050_] = (((((i_2065_ & 0xff00ff) * i_2066_) + ((i_2068_ & 0xff00ff) * i_2067_)) & ~0xff00ff) + ((((i_2065_ & 0xff00) * i_2066_) + ((i_2068_ & 0xff00) * i_2067_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_2069_ = (((i_2065_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2070_ = (((i_2065_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2071_ = ((i_2065_ & 0xff) * anInt8882 & 0xff00);
											i_2065_ = (i_2069_ | i_2070_ | i_2071_) >>> 8;
											int i_2072_ = is[i_2050_];
											is[i_2050_] = (((((i_2065_ & 0xff00ff) * anInt8878) + ((i_2072_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2065_ & 0xff00) * anInt8878) + ((i_2072_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_2073_ = (((i_2065_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2074_ = (((i_2065_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2075_ = ((i_2065_ & 0xff) * anInt8882 & 0xff00);
											is[i_2050_] = (i_2073_ | i_2074_ | i_2075_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_2076_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2049_]);
									int i_2077_ = (i_2076_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2076_]) : 0);
									int i_2078_ = anInt8877;
									int i_2079_ = i_2077_ + i_2078_;
									int i_2080_ = ((i_2077_ & 0xff00ff) + (i_2078_ & 0xff00ff));
									int i_2081_ = ((i_2080_ & 0x1000100) + (i_2079_ - i_2080_ & 0x10000));
									i_2081_ = (i_2079_ - i_2081_ | i_2081_ - (i_2081_ >>> 8));
									if (i_2077_ == 0 && anInt8878 != 255) {
										i_2077_ = i_2081_;
										i_2081_ = is[i_2050_];
										i_2081_ = (((((i_2077_ & 0xff00ff) * anInt8878) + ((i_2081_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2077_ & 0xff00) * anInt8878) + ((i_2081_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_2050_] = i_2081_;
								} else if (i == 2) {
									int i_2082_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2049_]);
									if (i_2082_ != 0) {
										int i_2083_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2082_ & 0xff]);
										int i_2084_ = ((i_2083_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2085_ = ((i_2083_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2050_++] = ((i_2084_ | i_2085_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1697_ == 2) {
								if (i == 1) {
									int i_2086_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2049_]);
									if (i_2086_ != 0) {
										int i_2087_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2086_ & 0xff]);
										int i_2088_ = is[i_2050_];
										int i_2089_ = i_2087_ + i_2088_;
										int i_2090_ = ((i_2087_ & 0xff00ff) + (i_2088_ & 0xff00ff));
										i_2088_ = ((i_2090_ & 0x1000100) + (i_2089_ - i_2090_ & 0x10000));
										is[i_2050_] = (i_2089_ - i_2088_ | i_2088_ - (i_2088_ >>> 8));
									}
								} else if (i == 0) {
									int i_2091_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2049_]);
									if (i_2091_ != 0) {
										int i_2092_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2091_ & 0xff]);
										int i_2093_ = ((i_2092_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2094_ = ((i_2092_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2095_ = ((i_2092_ & 0xff) * anInt8882 & 0xff00);
										i_2092_ = (i_2093_ | i_2094_ | i_2095_) >>> 8;
										int i_2096_ = is[i_2050_];
										int i_2097_ = i_2092_ + i_2096_;
										int i_2098_ = ((i_2092_ & 0xff00ff) + (i_2096_ & 0xff00ff));
										i_2096_ = ((i_2098_ & 0x1000100) + (i_2097_ - i_2098_ & 0x10000));
										is[i_2050_] = (i_2097_ - i_2096_ | i_2096_ - (i_2096_ >>> 8));
									}
								} else if (i == 3) {
									byte i_2099_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2049_]);
									int i_2100_ = (i_2099_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2099_]) : 0);
									int i_2101_ = anInt8877;
									int i_2102_ = i_2100_ + i_2101_;
									int i_2103_ = ((i_2100_ & 0xff00ff) + (i_2101_ & 0xff00ff));
									int i_2104_ = ((i_2103_ & 0x1000100) + (i_2102_ - i_2103_ & 0x10000));
									i_2104_ = (i_2102_ - i_2104_ | i_2104_ - (i_2104_ >>> 8));
									if (i_2100_ == 0 && anInt8878 != 255) {
										i_2100_ = i_2104_;
										i_2104_ = is[i_2050_];
										i_2104_ = (((((i_2100_ & 0xff00ff) * anInt8878) + ((i_2104_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2100_ & 0xff00) * anInt8878) + ((i_2104_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_2050_] = i_2104_;
								} else if (i == 2) {
									int i_2105_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2049_]);
									if (i_2105_ != 0) {
										int i_2106_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2105_ & 0xff]);
										int i_2107_ = ((i_2106_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2108_ = ((i_2106_ & 0xff00) * anInt8878 & 0xff0000);
										i_2106_ = (((i_2107_ | i_2108_) >>> 8) + anInt8885);
										int i_2109_ = is[i_2050_];
										int i_2110_ = i_2106_ + i_2109_;
										int i_2111_ = ((i_2106_ & 0xff00ff) + (i_2109_ & 0xff00ff));
										i_2109_ = ((i_2111_ & 0x1000100) + (i_2110_ - i_2111_ & 0x10000));
										is[i_2050_] = (i_2110_ - i_2109_ | i_2109_ - (i_2109_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2045_ += anInt8865;
							i_2046_ += anInt8868;
						}
						i_2043_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8868 == 0) {
				int i_2112_ = anInt8864;
				while (i_2112_ < 0) {
					int i_2113_ = anInt8870;
					int i_2114_ = anInt8873 + anInt8858;
					int i_2115_ = anInt8874;
					int i_2116_ = anInt8862;
					if (i_2115_ >= 0 && i_2115_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) < 0) {
						if (i_2114_ < 0) {
							int i_2117_ = (anInt8865 - 1 - i_2114_) / anInt8865;
							i_2116_ += i_2117_;
							i_2114_ += anInt8865 * i_2117_;
							i_2113_ += i_2117_;
						}
						int i_2118_;
						if ((i_2118_ = (1 + i_2114_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_2116_)
							i_2116_ = i_2118_;
						for (/**/; i_2116_ < 0; i_2116_++) {
							int i_2119_ = (((i_2115_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_2114_ >> 12));
							int i_2120_ = i_2113_++;
							if (i_1697_ == 0) {
								if (i == 1)
									is[i_2120_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2119_]) & 0xff)]);
								else if (i == 0) {
									int i_2121_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2119_]) & 0xff)]);
									int i_2122_ = ((i_2121_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2123_ = ((i_2121_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2124_ = ((i_2121_ & 0xff) * anInt8882 & 0xff00);
									is[i_2120_] = (i_2122_ | i_2123_ | i_2124_) >>> 8;
								} else if (i == 3) {
									int i_2125_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2119_]) & 0xff)]);
									int i_2126_ = anInt8877;
									int i_2127_ = i_2125_ + i_2126_;
									int i_2128_ = ((i_2125_ & 0xff00ff) + (i_2126_ & 0xff00ff));
									int i_2129_ = ((i_2128_ & 0x1000100) + (i_2127_ - i_2128_ & 0x10000));
									is[i_2120_] = (i_2127_ - i_2129_ | i_2129_ - (i_2129_ >>> 8));
								} else if (i == 2) {
									int i_2130_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2119_]) & 0xff)]);
									int i_2131_ = ((i_2130_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2132_ = ((i_2130_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2120_] = (((i_2131_ | i_2132_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_1697_ == 1) {
								if (i == 1) {
									int i_2133_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2119_]);
									if (i_2133_ != 0)
										is[i_2120_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2133_ & 0xff]);
								} else if (i == 0) {
									int i_2134_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2119_]);
									if (i_2134_ != 0) {
										int i_2135_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2134_ & 0xff]);
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_2136_ = anInt8877 >>> 24;
											int i_2137_ = 256 - i_2136_;
											int i_2138_ = is[i_2120_];
											is[i_2120_] = (((((i_2135_ & 0xff00ff) * i_2136_) + ((i_2138_ & 0xff00ff) * i_2137_)) & ~0xff00ff) + ((((i_2135_ & 0xff00) * i_2136_) + ((i_2138_ & 0xff00) * i_2137_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_2139_ = (((i_2135_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2140_ = (((i_2135_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2141_ = ((i_2135_ & 0xff) * anInt8882 & 0xff00);
											i_2135_ = (i_2139_ | i_2140_ | i_2141_) >>> 8;
											int i_2142_ = is[i_2120_];
											is[i_2120_] = (((((i_2135_ & 0xff00ff) * anInt8878) + ((i_2142_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2135_ & 0xff00) * anInt8878) + ((i_2142_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_2143_ = (((i_2135_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2144_ = (((i_2135_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2145_ = ((i_2135_ & 0xff) * anInt8882 & 0xff00);
											is[i_2120_] = (i_2143_ | i_2144_ | i_2145_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_2146_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2119_]);
									int i_2147_ = (i_2146_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2146_]) : 0);
									int i_2148_ = anInt8877;
									int i_2149_ = i_2147_ + i_2148_;
									int i_2150_ = ((i_2147_ & 0xff00ff) + (i_2148_ & 0xff00ff));
									int i_2151_ = ((i_2150_ & 0x1000100) + (i_2149_ - i_2150_ & 0x10000));
									i_2151_ = (i_2149_ - i_2151_ | i_2151_ - (i_2151_ >>> 8));
									if (i_2147_ == 0 && anInt8878 != 255) {
										i_2147_ = i_2151_;
										i_2151_ = is[i_2120_];
										i_2151_ = (((((i_2147_ & 0xff00ff) * anInt8878) + ((i_2151_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2147_ & 0xff00) * anInt8878) + ((i_2151_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_2120_] = i_2151_;
								} else if (i == 2) {
									int i_2152_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2119_]);
									if (i_2152_ != 0) {
										int i_2153_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2152_ & 0xff]);
										int i_2154_ = ((i_2153_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2155_ = ((i_2153_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2120_++] = ((i_2154_ | i_2155_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1697_ == 2) {
								if (i == 1) {
									int i_2156_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2119_]);
									if (i_2156_ != 0) {
										int i_2157_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2156_ & 0xff]);
										int i_2158_ = is[i_2120_];
										int i_2159_ = i_2157_ + i_2158_;
										int i_2160_ = ((i_2157_ & 0xff00ff) + (i_2158_ & 0xff00ff));
										i_2158_ = ((i_2160_ & 0x1000100) + (i_2159_ - i_2160_ & 0x10000));
										is[i_2120_] = (i_2159_ - i_2158_ | i_2158_ - (i_2158_ >>> 8));
									}
								} else if (i == 0) {
									int i_2161_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2119_]);
									if (i_2161_ != 0) {
										int i_2162_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2161_ & 0xff]);
										int i_2163_ = ((i_2162_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2164_ = ((i_2162_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2165_ = ((i_2162_ & 0xff) * anInt8882 & 0xff00);
										i_2162_ = (i_2163_ | i_2164_ | i_2165_) >>> 8;
										int i_2166_ = is[i_2120_];
										int i_2167_ = i_2162_ + i_2166_;
										int i_2168_ = ((i_2162_ & 0xff00ff) + (i_2166_ & 0xff00ff));
										i_2166_ = ((i_2168_ & 0x1000100) + (i_2167_ - i_2168_ & 0x10000));
										is[i_2120_] = (i_2167_ - i_2166_ | i_2166_ - (i_2166_ >>> 8));
									}
								} else if (i == 3) {
									byte i_2169_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2119_]);
									int i_2170_ = (i_2169_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2169_]) : 0);
									int i_2171_ = anInt8877;
									int i_2172_ = i_2170_ + i_2171_;
									int i_2173_ = ((i_2170_ & 0xff00ff) + (i_2171_ & 0xff00ff));
									int i_2174_ = ((i_2173_ & 0x1000100) + (i_2172_ - i_2173_ & 0x10000));
									i_2174_ = (i_2172_ - i_2174_ | i_2174_ - (i_2174_ >>> 8));
									if (i_2170_ == 0 && anInt8878 != 255) {
										i_2170_ = i_2174_;
										i_2174_ = is[i_2120_];
										i_2174_ = (((((i_2170_ & 0xff00ff) * anInt8878) + ((i_2174_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2170_ & 0xff00) * anInt8878) + ((i_2174_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_2120_] = i_2174_;
								} else if (i == 2) {
									int i_2175_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2119_]);
									if (i_2175_ != 0) {
										int i_2176_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2175_ & 0xff]);
										int i_2177_ = ((i_2176_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2178_ = ((i_2176_ & 0xff00) * anInt8878 & 0xff0000);
										i_2176_ = (((i_2177_ | i_2178_) >>> 8) + anInt8885);
										int i_2179_ = is[i_2120_];
										int i_2180_ = i_2176_ + i_2179_;
										int i_2181_ = ((i_2176_ & 0xff00ff) + (i_2179_ & 0xff00ff));
										i_2179_ = ((i_2181_ & 0x1000100) + (i_2180_ - i_2181_ & 0x10000));
										is[i_2120_] = (i_2180_ - i_2179_ | i_2179_ - (i_2179_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2114_ += anInt8865;
						}
					}
					i_2112_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else if (anInt8868 < 0) {
				for (int i_2182_ = anInt8864; i_2182_ < 0; i_2182_++) {
					int i_2183_ = anInt8870;
					int i_2184_ = anInt8873 + anInt8858;
					int i_2185_ = anInt8874 + anInt8866;
					int i_2186_ = anInt8862;
					if (i_2184_ < 0) {
						int i_2187_ = (anInt8865 - 1 - i_2184_) / anInt8865;
						i_2186_ += i_2187_;
						i_2184_ += anInt8865 * i_2187_;
						i_2185_ += anInt8868 * i_2187_;
						i_2183_ += i_2187_;
					}
					int i_2188_;
					if ((i_2188_ = (1 + i_2184_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_2186_)
						i_2186_ = i_2188_;
					if ((i_2188_ = i_2185_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12)) >= 0) {
						i_2188_ = (anInt8868 - i_2188_) / anInt8868;
						i_2186_ += i_2188_;
						i_2184_ += anInt8865 * i_2188_;
						i_2185_ += anInt8868 * i_2188_;
						i_2183_ += i_2188_;
					}
					if ((i_2188_ = (i_2185_ - anInt8868) / anInt8868) > i_2186_)
						i_2186_ = i_2188_;
					for (/**/; i_2186_ < 0; i_2186_++) {
						int i_2189_ = (((i_2185_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_2184_ >> 12));
						int i_2190_ = i_2183_++;
						if (i_1697_ == 0) {
							if (i == 1)
								is[i_2190_] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2189_]) & 0xff]);
							else if (i == 0) {
								int i_2191_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2189_]) & 0xff]);
								int i_2192_ = ((i_2191_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_2193_ = ((i_2191_ & 0xff00) * anInt8852 & 0xff0000);
								int i_2194_ = (i_2191_ & 0xff) * anInt8882 & 0xff00;
								is[i_2190_] = (i_2192_ | i_2193_ | i_2194_) >>> 8;
							} else if (i == 3) {
								int i_2195_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2189_]) & 0xff]);
								int i_2196_ = anInt8877;
								int i_2197_ = i_2195_ + i_2196_;
								int i_2198_ = ((i_2195_ & 0xff00ff) + (i_2196_ & 0xff00ff));
								int i_2199_ = ((i_2198_ & 0x1000100) + (i_2197_ - i_2198_ & 0x10000));
								is[i_2190_] = i_2197_ - i_2199_ | i_2199_ - (i_2199_ >>> 8);
							} else if (i == 2) {
								int i_2200_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2189_]) & 0xff]);
								int i_2201_ = ((i_2200_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_2202_ = ((i_2200_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_2190_] = ((i_2201_ | i_2202_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_1697_ == 1) {
							if (i == 1) {
								int i_2203_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2189_]);
								if (i_2203_ != 0)
									is[i_2190_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2203_ & 0xff]);
							} else if (i == 0) {
								int i_2204_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2189_]);
								if (i_2204_ != 0) {
									int i_2205_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2204_ & 0xff]);
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_2206_ = anInt8877 >>> 24;
										int i_2207_ = 256 - i_2206_;
										int i_2208_ = is[i_2190_];
										is[i_2190_] = ((((i_2205_ & 0xff00ff) * i_2206_ + ((i_2208_ & 0xff00ff) * i_2207_)) & ~0xff00ff) + (((i_2205_ & 0xff00) * i_2206_ + ((i_2208_ & 0xff00) * i_2207_)) & 0xff0000)) >> 8;
									} else if (anInt8878 != 255) {
										int i_2209_ = ((i_2205_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2210_ = ((i_2205_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2211_ = ((i_2205_ & 0xff) * anInt8882 & 0xff00);
										i_2205_ = (i_2209_ | i_2210_ | i_2211_) >>> 8;
										int i_2212_ = is[i_2190_];
										is[i_2190_] = (((((i_2205_ & 0xff00ff) * anInt8878) + ((i_2212_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2205_ & 0xff00) * anInt8878) + ((i_2212_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									} else {
										int i_2213_ = ((i_2205_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2214_ = ((i_2205_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2215_ = ((i_2205_ & 0xff) * anInt8882 & 0xff00);
										is[i_2190_] = (i_2213_ | i_2214_ | i_2215_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_2216_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2189_]);
								int i_2217_ = (i_2216_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2216_]) : 0);
								int i_2218_ = anInt8877;
								int i_2219_ = i_2217_ + i_2218_;
								int i_2220_ = ((i_2217_ & 0xff00ff) + (i_2218_ & 0xff00ff));
								int i_2221_ = ((i_2220_ & 0x1000100) + (i_2219_ - i_2220_ & 0x10000));
								i_2221_ = i_2219_ - i_2221_ | i_2221_ - (i_2221_ >>> 8);
								if (i_2217_ == 0 && anInt8878 != 255) {
									i_2217_ = i_2221_;
									i_2221_ = is[i_2190_];
									i_2221_ = ((((i_2217_ & 0xff00ff) * anInt8878 + ((i_2221_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_2217_ & 0xff00) * anInt8878 + ((i_2221_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_2190_] = i_2221_;
							} else if (i == 2) {
								int i_2222_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2189_]);
								if (i_2222_ != 0) {
									int i_2223_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2222_ & 0xff]);
									int i_2224_ = ((i_2223_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2225_ = ((i_2223_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2190_++] = ((i_2224_ | i_2225_) >>> 8) + anInt8885;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_1697_ == 2) {
							if (i == 1) {
								int i_2226_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2189_]);
								if (i_2226_ != 0) {
									int i_2227_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2226_ & 0xff]);
									int i_2228_ = is[i_2190_];
									int i_2229_ = i_2227_ + i_2228_;
									int i_2230_ = ((i_2227_ & 0xff00ff) + (i_2228_ & 0xff00ff));
									i_2228_ = ((i_2230_ & 0x1000100) + (i_2229_ - i_2230_ & 0x10000));
									is[i_2190_] = (i_2229_ - i_2228_ | i_2228_ - (i_2228_ >>> 8));
								}
							} else if (i == 0) {
								int i_2231_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2189_]);
								if (i_2231_ != 0) {
									int i_2232_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2231_ & 0xff]);
									int i_2233_ = ((i_2232_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2234_ = ((i_2232_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2235_ = ((i_2232_ & 0xff) * anInt8882 & 0xff00);
									i_2232_ = (i_2233_ | i_2234_ | i_2235_) >>> 8;
									int i_2236_ = is[i_2190_];
									int i_2237_ = i_2232_ + i_2236_;
									int i_2238_ = ((i_2232_ & 0xff00ff) + (i_2236_ & 0xff00ff));
									i_2236_ = ((i_2238_ & 0x1000100) + (i_2237_ - i_2238_ & 0x10000));
									is[i_2190_] = (i_2237_ - i_2236_ | i_2236_ - (i_2236_ >>> 8));
								}
							} else if (i == 3) {
								byte i_2239_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2189_]);
								int i_2240_ = (i_2239_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2239_]) : 0);
								int i_2241_ = anInt8877;
								int i_2242_ = i_2240_ + i_2241_;
								int i_2243_ = ((i_2240_ & 0xff00ff) + (i_2241_ & 0xff00ff));
								int i_2244_ = ((i_2243_ & 0x1000100) + (i_2242_ - i_2243_ & 0x10000));
								i_2244_ = i_2242_ - i_2244_ | i_2244_ - (i_2244_ >>> 8);
								if (i_2240_ == 0 && anInt8878 != 255) {
									i_2240_ = i_2244_;
									i_2244_ = is[i_2190_];
									i_2244_ = ((((i_2240_ & 0xff00ff) * anInt8878 + ((i_2244_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_2240_ & 0xff00) * anInt8878 + ((i_2244_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_2190_] = i_2244_;
							} else if (i == 2) {
								int i_2245_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2189_]);
								if (i_2245_ != 0) {
									int i_2246_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2245_ & 0xff]);
									int i_2247_ = ((i_2246_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2248_ = ((i_2246_ & 0xff00) * anInt8878 & 0xff0000);
									i_2246_ = (((i_2247_ | i_2248_) >>> 8) + anInt8885);
									int i_2249_ = is[i_2190_];
									int i_2250_ = i_2246_ + i_2249_;
									int i_2251_ = ((i_2246_ & 0xff00ff) + (i_2249_ & 0xff00ff));
									i_2249_ = ((i_2251_ & 0x1000100) + (i_2250_ - i_2251_ & 0x10000));
									is[i_2190_] = (i_2250_ - i_2249_ | i_2249_ - (i_2249_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_2184_ += anInt8865;
						i_2185_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else {
				for (int i_2252_ = anInt8864; i_2252_ < 0; i_2252_++) {
					int i_2253_ = anInt8870;
					int i_2254_ = anInt8873 + anInt8858;
					int i_2255_ = anInt8874 + anInt8866;
					int i_2256_ = anInt8862;
					if (i_2254_ < 0) {
						int i_2257_ = (anInt8865 - 1 - i_2254_) / anInt8865;
						i_2256_ += i_2257_;
						i_2254_ += anInt8865 * i_2257_;
						i_2255_ += anInt8868 * i_2257_;
						i_2253_ += i_2257_;
					}
					int i_2258_;
					if ((i_2258_ = (1 + i_2254_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_2256_)
						i_2256_ = i_2258_;
					if (i_2255_ < 0) {
						i_2258_ = (anInt8868 - 1 - i_2255_) / anInt8868;
						i_2256_ += i_2258_;
						i_2254_ += anInt8865 * i_2258_;
						i_2255_ += anInt8868 * i_2258_;
						i_2253_ += i_2258_;
					}
					if ((i_2258_ = (1 + i_2255_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_2256_)
						i_2256_ = i_2258_;
					for (/**/; i_2256_ < 0; i_2256_++) {
						int i_2259_ = (((i_2255_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_2254_ >> 12));
						int i_2260_ = i_2253_++;
						if (i_1697_ == 0) {
							if (i == 1)
								is[i_2260_] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2259_]) & 0xff]);
							else if (i == 0) {
								int i_2261_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2259_]) & 0xff]);
								int i_2262_ = ((i_2261_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_2263_ = ((i_2261_ & 0xff00) * anInt8852 & 0xff0000);
								int i_2264_ = (i_2261_ & 0xff) * anInt8882 & 0xff00;
								is[i_2260_] = (i_2262_ | i_2263_ | i_2264_) >>> 8;
							} else if (i == 3) {
								int i_2265_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2259_]) & 0xff]);
								int i_2266_ = anInt8877;
								int i_2267_ = i_2265_ + i_2266_;
								int i_2268_ = ((i_2265_ & 0xff00ff) + (i_2266_ & 0xff00ff));
								int i_2269_ = ((i_2268_ & 0x1000100) + (i_2267_ - i_2268_ & 0x10000));
								is[i_2260_] = i_2267_ - i_2269_ | i_2269_ - (i_2269_ >>> 8);
							} else if (i == 2) {
								int i_2270_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2259_]) & 0xff]);
								int i_2271_ = ((i_2270_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_2272_ = ((i_2270_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_2260_] = ((i_2271_ | i_2272_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_1697_ == 1) {
							if (i == 1) {
								int i_2273_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2259_]);
								if (i_2273_ != 0)
									is[i_2260_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2273_ & 0xff]);
							} else if (i == 0) {
								int i_2274_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2259_]);
								if (i_2274_ != 0) {
									int i_2275_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2274_ & 0xff]);
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_2276_ = anInt8877 >>> 24;
										int i_2277_ = 256 - i_2276_;
										int i_2278_ = is[i_2260_];
										is[i_2260_] = ((((i_2275_ & 0xff00ff) * i_2276_ + ((i_2278_ & 0xff00ff) * i_2277_)) & ~0xff00ff) + (((i_2275_ & 0xff00) * i_2276_ + ((i_2278_ & 0xff00) * i_2277_)) & 0xff0000)) >> 8;
									} else if (anInt8878 != 255) {
										int i_2279_ = ((i_2275_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2280_ = ((i_2275_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2281_ = ((i_2275_ & 0xff) * anInt8882 & 0xff00);
										i_2275_ = (i_2279_ | i_2280_ | i_2281_) >>> 8;
										int i_2282_ = is[i_2260_];
										is[i_2260_] = (((((i_2275_ & 0xff00ff) * anInt8878) + ((i_2282_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2275_ & 0xff00) * anInt8878) + ((i_2282_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									} else {
										int i_2283_ = ((i_2275_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2284_ = ((i_2275_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2285_ = ((i_2275_ & 0xff) * anInt8882 & 0xff00);
										is[i_2260_] = (i_2283_ | i_2284_ | i_2285_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_2286_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2259_]);
								int i_2287_ = (i_2286_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2286_]) : 0);
								int i_2288_ = anInt8877;
								int i_2289_ = i_2287_ + i_2288_;
								int i_2290_ = ((i_2287_ & 0xff00ff) + (i_2288_ & 0xff00ff));
								int i_2291_ = ((i_2290_ & 0x1000100) + (i_2289_ - i_2290_ & 0x10000));
								i_2291_ = i_2289_ - i_2291_ | i_2291_ - (i_2291_ >>> 8);
								if (i_2287_ == 0 && anInt8878 != 255) {
									i_2287_ = i_2291_;
									i_2291_ = is[i_2260_];
									i_2291_ = ((((i_2287_ & 0xff00ff) * anInt8878 + ((i_2291_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_2287_ & 0xff00) * anInt8878 + ((i_2291_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_2260_] = i_2291_;
							} else if (i == 2) {
								int i_2292_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2259_]);
								if (i_2292_ != 0) {
									int i_2293_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2292_ & 0xff]);
									int i_2294_ = ((i_2293_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2295_ = ((i_2293_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2260_++] = ((i_2294_ | i_2295_) >>> 8) + anInt8885;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_1697_ == 2) {
							if (i == 1) {
								int i_2296_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2259_]);
								if (i_2296_ != 0) {
									int i_2297_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2296_ & 0xff]);
									int i_2298_ = is[i_2260_];
									int i_2299_ = i_2297_ + i_2298_;
									int i_2300_ = ((i_2297_ & 0xff00ff) + (i_2298_ & 0xff00ff));
									i_2298_ = ((i_2300_ & 0x1000100) + (i_2299_ - i_2300_ & 0x10000));
									is[i_2260_] = (i_2299_ - i_2298_ | i_2298_ - (i_2298_ >>> 8));
								}
							} else if (i == 0) {
								int i_2301_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2259_]);
								if (i_2301_ != 0) {
									int i_2302_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2301_ & 0xff]);
									int i_2303_ = ((i_2302_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2304_ = ((i_2302_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2305_ = ((i_2302_ & 0xff) * anInt8882 & 0xff00);
									i_2302_ = (i_2303_ | i_2304_ | i_2305_) >>> 8;
									int i_2306_ = is[i_2260_];
									int i_2307_ = i_2302_ + i_2306_;
									int i_2308_ = ((i_2302_ & 0xff00ff) + (i_2306_ & 0xff00ff));
									i_2306_ = ((i_2308_ & 0x1000100) + (i_2307_ - i_2308_ & 0x10000));
									is[i_2260_] = (i_2307_ - i_2306_ | i_2306_ - (i_2306_ >>> 8));
								}
							} else if (i == 3) {
								byte i_2309_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2259_]);
								int i_2310_ = (i_2309_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2309_]) : 0);
								int i_2311_ = anInt8877;
								int i_2312_ = i_2310_ + i_2311_;
								int i_2313_ = ((i_2310_ & 0xff00ff) + (i_2311_ & 0xff00ff));
								int i_2314_ = ((i_2313_ & 0x1000100) + (i_2312_ - i_2313_ & 0x10000));
								i_2314_ = i_2312_ - i_2314_ | i_2314_ - (i_2314_ >>> 8);
								if (i_2310_ == 0 && anInt8878 != 255) {
									i_2310_ = i_2314_;
									i_2314_ = is[i_2260_];
									i_2314_ = ((((i_2310_ & 0xff00ff) * anInt8878 + ((i_2314_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_2310_ & 0xff00) * anInt8878 + ((i_2314_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_2260_] = i_2314_;
							} else if (i == 2) {
								int i_2315_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2259_]);
								if (i_2315_ != 0) {
									int i_2316_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2315_ & 0xff]);
									int i_2317_ = ((i_2316_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2318_ = ((i_2316_ & 0xff00) * anInt8878 & 0xff0000);
									i_2316_ = (((i_2317_ | i_2318_) >>> 8) + anInt8885);
									int i_2319_ = is[i_2260_];
									int i_2320_ = i_2316_ + i_2319_;
									int i_2321_ = ((i_2316_ & 0xff00ff) + (i_2319_ & 0xff00ff));
									i_2319_ = ((i_2321_ & 0x1000100) + (i_2320_ - i_2321_ & 0x10000));
									is[i_2260_] = (i_2320_ - i_2319_ | i_2319_ - (i_2319_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_2254_ += anInt8865;
						i_2255_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			}
		}
	}

	void method14253(int i, int i_2322_) {
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					int i_2323_ = anInt8864;
					while (i_2323_ < 0) {
						int i_2324_ = anInt8870;
						int i_2325_ = anInt8873;
						int i_2326_ = anInt8874;
						int i_2327_ = anInt8862;
						if (i_2325_ >= 0 && i_2326_ >= 0 && i_2325_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) < 0 && i_2326_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) < 0) {
							for (/**/; i_2327_ < 0; i_2327_++) {
								int i_2328_ = ((i_2326_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851 + (i_2325_ >> 12));
								int i_2329_ = i_2324_++;
								if (i_2322_ == 0) {
									if (i == 1)
										is[i_2329_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2328_]) & 0xff)]);
									else if (i == 0) {
										int i_2330_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2328_]) & 0xff)]);
										int i_2331_ = ((i_2330_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2332_ = ((i_2330_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2333_ = ((i_2330_ & 0xff) * anInt8882 & 0xff00);
										is[i_2329_] = (i_2331_ | i_2332_ | i_2333_) >>> 8;
									} else if (i == 3) {
										int i_2334_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2328_]) & 0xff)]);
										int i_2335_ = anInt8877;
										int i_2336_ = i_2334_ + i_2335_;
										int i_2337_ = ((i_2334_ & 0xff00ff) + (i_2335_ & 0xff00ff));
										int i_2338_ = ((i_2337_ & 0x1000100) + (i_2336_ - i_2337_ & 0x10000));
										is[i_2329_] = (i_2336_ - i_2338_ | i_2338_ - (i_2338_ >>> 8));
									} else if (i == 2) {
										int i_2339_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2328_]) & 0xff)]);
										int i_2340_ = ((i_2339_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2341_ = ((i_2339_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2329_] = ((i_2340_ | i_2341_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_2322_ == 1) {
									if (i == 1) {
										int i_2342_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2328_]);
										if (i_2342_ != 0)
											is[i_2329_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2342_ & 0xff]);
									} else if (i == 0) {
										int i_2343_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2328_]);
										if (i_2343_ != 0) {
											int i_2344_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2343_ & 0xff]);
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_2345_ = anInt8877 >>> 24;
												int i_2346_ = 256 - i_2345_;
												int i_2347_ = is[i_2329_];
												is[i_2329_] = (((((i_2344_ & 0xff00ff) * i_2345_) + ((i_2347_ & 0xff00ff) * i_2346_)) & ~0xff00ff) + ((((i_2344_ & 0xff00) * i_2345_) + ((i_2347_ & 0xff00) * i_2346_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_2348_ = (((i_2344_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2349_ = (((i_2344_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2350_ = (((i_2344_ & 0xff) * anInt8882) & 0xff00);
												i_2344_ = (i_2348_ | i_2349_ | i_2350_) >>> 8;
												int i_2351_ = is[i_2329_];
												is[i_2329_] = (((((i_2344_ & 0xff00ff) * anInt8878) + ((i_2351_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2344_ & 0xff00) * anInt8878) + ((i_2351_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_2352_ = (((i_2344_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2353_ = (((i_2344_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2354_ = (((i_2344_ & 0xff) * anInt8882) & 0xff00);
												is[i_2329_] = (i_2352_ | i_2353_ | i_2354_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2355_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2328_]);
										int i_2356_ = (i_2355_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2355_]) : 0);
										int i_2357_ = anInt8877;
										int i_2358_ = i_2356_ + i_2357_;
										int i_2359_ = ((i_2356_ & 0xff00ff) + (i_2357_ & 0xff00ff));
										int i_2360_ = ((i_2359_ & 0x1000100) + (i_2358_ - i_2359_ & 0x10000));
										i_2360_ = (i_2358_ - i_2360_ | i_2360_ - (i_2360_ >>> 8));
										if (i_2356_ == 0 && anInt8878 != 255) {
											i_2356_ = i_2360_;
											i_2360_ = is[i_2329_];
											i_2360_ = (((((i_2356_ & 0xff00ff) * anInt8878) + ((i_2360_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2356_ & 0xff00) * anInt8878) + ((i_2360_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_2329_] = i_2360_;
									} else if (i == 2) {
										int i_2361_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2328_]);
										if (i_2361_ != 0) {
											int i_2362_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2361_ & 0xff]);
											int i_2363_ = (((i_2362_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2364_ = (((i_2362_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_2329_++] = (((i_2363_ | i_2364_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2322_ == 2) {
									if (i == 1) {
										int i_2365_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2328_]);
										if (i_2365_ != 0) {
											int i_2366_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2365_ & 0xff]);
											int i_2367_ = is[i_2329_];
											int i_2368_ = i_2366_ + i_2367_;
											int i_2369_ = ((i_2366_ & 0xff00ff) + (i_2367_ & 0xff00ff));
											i_2367_ = ((i_2369_ & 0x1000100) + (i_2368_ - i_2369_ & 0x10000));
											is[i_2329_] = (i_2368_ - i_2367_ | i_2367_ - (i_2367_ >>> 8));
										}
									} else if (i == 0) {
										int i_2370_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2328_]);
										if (i_2370_ != 0) {
											int i_2371_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2370_ & 0xff]);
											int i_2372_ = (((i_2371_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2373_ = (((i_2371_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2374_ = ((i_2371_ & 0xff) * anInt8882 & 0xff00);
											i_2371_ = (i_2372_ | i_2373_ | i_2374_) >>> 8;
											int i_2375_ = is[i_2329_];
											int i_2376_ = i_2371_ + i_2375_;
											int i_2377_ = ((i_2371_ & 0xff00ff) + (i_2375_ & 0xff00ff));
											i_2375_ = ((i_2377_ & 0x1000100) + (i_2376_ - i_2377_ & 0x10000));
											is[i_2329_] = (i_2376_ - i_2375_ | i_2375_ - (i_2375_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2378_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2328_]);
										int i_2379_ = (i_2378_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2378_]) : 0);
										int i_2380_ = anInt8877;
										int i_2381_ = i_2379_ + i_2380_;
										int i_2382_ = ((i_2379_ & 0xff00ff) + (i_2380_ & 0xff00ff));
										int i_2383_ = ((i_2382_ & 0x1000100) + (i_2381_ - i_2382_ & 0x10000));
										i_2383_ = (i_2381_ - i_2383_ | i_2383_ - (i_2383_ >>> 8));
										if (i_2379_ == 0 && anInt8878 != 255) {
											i_2379_ = i_2383_;
											i_2383_ = is[i_2329_];
											i_2383_ = (((((i_2379_ & 0xff00ff) * anInt8878) + ((i_2383_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2379_ & 0xff00) * anInt8878) + ((i_2383_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_2329_] = i_2383_;
									} else if (i == 2) {
										int i_2384_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2328_]);
										if (i_2384_ != 0) {
											int i_2385_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2384_ & 0xff]);
											int i_2386_ = (((i_2385_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2387_ = (((i_2385_ & 0xff00) * anInt8878) & 0xff0000);
											i_2385_ = ((i_2386_ | i_2387_) >>> 8) + anInt8885;
											int i_2388_ = is[i_2329_];
											int i_2389_ = i_2385_ + i_2388_;
											int i_2390_ = ((i_2385_ & 0xff00ff) + (i_2388_ & 0xff00ff));
											i_2388_ = ((i_2390_ & 0x1000100) + (i_2389_ - i_2390_ & 0x10000));
											is[i_2329_] = (i_2389_ - i_2388_ | i_2388_ - (i_2388_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_2323_++;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_2391_ = anInt8864;
					while (i_2391_ < 0) {
						int i_2392_ = anInt8870;
						int i_2393_ = anInt8873;
						int i_2394_ = anInt8874 + anInt8866;
						int i_2395_ = anInt8862;
						if (i_2393_ >= 0 && i_2393_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) < 0) {
							int i_2396_;
							if ((i_2396_ = (i_2394_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12))) >= 0) {
								i_2396_ = (anInt8868 - i_2396_) / anInt8868;
								i_2395_ += i_2396_;
								i_2394_ += anInt8868 * i_2396_;
								i_2392_ += i_2396_;
							}
							if ((i_2396_ = (i_2394_ - anInt8868) / anInt8868) > i_2395_)
								i_2395_ = i_2396_;
							for (/**/; i_2395_ < 0; i_2395_++) {
								int i_2397_ = ((i_2394_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851 + (i_2393_ >> 12));
								int i_2398_ = i_2392_++;
								if (i_2322_ == 0) {
									if (i == 1)
										is[i_2398_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2397_]) & 0xff)]);
									else if (i == 0) {
										int i_2399_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2397_]) & 0xff)]);
										int i_2400_ = ((i_2399_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2401_ = ((i_2399_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2402_ = ((i_2399_ & 0xff) * anInt8882 & 0xff00);
										is[i_2398_] = (i_2400_ | i_2401_ | i_2402_) >>> 8;
									} else if (i == 3) {
										int i_2403_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2397_]) & 0xff)]);
										int i_2404_ = anInt8877;
										int i_2405_ = i_2403_ + i_2404_;
										int i_2406_ = ((i_2403_ & 0xff00ff) + (i_2404_ & 0xff00ff));
										int i_2407_ = ((i_2406_ & 0x1000100) + (i_2405_ - i_2406_ & 0x10000));
										is[i_2398_] = (i_2405_ - i_2407_ | i_2407_ - (i_2407_ >>> 8));
									} else if (i == 2) {
										int i_2408_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2397_]) & 0xff)]);
										int i_2409_ = ((i_2408_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2410_ = ((i_2408_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2398_] = ((i_2409_ | i_2410_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_2322_ == 1) {
									if (i == 1) {
										int i_2411_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2397_]);
										if (i_2411_ != 0)
											is[i_2398_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2411_ & 0xff]);
									} else if (i == 0) {
										int i_2412_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2397_]);
										if (i_2412_ != 0) {
											int i_2413_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2412_ & 0xff]);
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_2414_ = anInt8877 >>> 24;
												int i_2415_ = 256 - i_2414_;
												int i_2416_ = is[i_2398_];
												is[i_2398_] = (((((i_2413_ & 0xff00ff) * i_2414_) + ((i_2416_ & 0xff00ff) * i_2415_)) & ~0xff00ff) + ((((i_2413_ & 0xff00) * i_2414_) + ((i_2416_ & 0xff00) * i_2415_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_2417_ = (((i_2413_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2418_ = (((i_2413_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2419_ = (((i_2413_ & 0xff) * anInt8882) & 0xff00);
												i_2413_ = (i_2417_ | i_2418_ | i_2419_) >>> 8;
												int i_2420_ = is[i_2398_];
												is[i_2398_] = (((((i_2413_ & 0xff00ff) * anInt8878) + ((i_2420_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2413_ & 0xff00) * anInt8878) + ((i_2420_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_2421_ = (((i_2413_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2422_ = (((i_2413_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2423_ = (((i_2413_ & 0xff) * anInt8882) & 0xff00);
												is[i_2398_] = (i_2421_ | i_2422_ | i_2423_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2424_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2397_]);
										int i_2425_ = (i_2424_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2424_]) : 0);
										int i_2426_ = anInt8877;
										int i_2427_ = i_2425_ + i_2426_;
										int i_2428_ = ((i_2425_ & 0xff00ff) + (i_2426_ & 0xff00ff));
										int i_2429_ = ((i_2428_ & 0x1000100) + (i_2427_ - i_2428_ & 0x10000));
										i_2429_ = (i_2427_ - i_2429_ | i_2429_ - (i_2429_ >>> 8));
										if (i_2425_ == 0 && anInt8878 != 255) {
											i_2425_ = i_2429_;
											i_2429_ = is[i_2398_];
											i_2429_ = (((((i_2425_ & 0xff00ff) * anInt8878) + ((i_2429_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2425_ & 0xff00) * anInt8878) + ((i_2429_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_2398_] = i_2429_;
									} else if (i == 2) {
										int i_2430_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2397_]);
										if (i_2430_ != 0) {
											int i_2431_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2430_ & 0xff]);
											int i_2432_ = (((i_2431_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2433_ = (((i_2431_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_2398_++] = (((i_2432_ | i_2433_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2322_ == 2) {
									if (i == 1) {
										int i_2434_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2397_]);
										if (i_2434_ != 0) {
											int i_2435_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2434_ & 0xff]);
											int i_2436_ = is[i_2398_];
											int i_2437_ = i_2435_ + i_2436_;
											int i_2438_ = ((i_2435_ & 0xff00ff) + (i_2436_ & 0xff00ff));
											i_2436_ = ((i_2438_ & 0x1000100) + (i_2437_ - i_2438_ & 0x10000));
											is[i_2398_] = (i_2437_ - i_2436_ | i_2436_ - (i_2436_ >>> 8));
										}
									} else if (i == 0) {
										int i_2439_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2397_]);
										if (i_2439_ != 0) {
											int i_2440_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2439_ & 0xff]);
											int i_2441_ = (((i_2440_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2442_ = (((i_2440_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2443_ = ((i_2440_ & 0xff) * anInt8882 & 0xff00);
											i_2440_ = (i_2441_ | i_2442_ | i_2443_) >>> 8;
											int i_2444_ = is[i_2398_];
											int i_2445_ = i_2440_ + i_2444_;
											int i_2446_ = ((i_2440_ & 0xff00ff) + (i_2444_ & 0xff00ff));
											i_2444_ = ((i_2446_ & 0x1000100) + (i_2445_ - i_2446_ & 0x10000));
											is[i_2398_] = (i_2445_ - i_2444_ | i_2444_ - (i_2444_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2447_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2397_]);
										int i_2448_ = (i_2447_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2447_]) : 0);
										int i_2449_ = anInt8877;
										int i_2450_ = i_2448_ + i_2449_;
										int i_2451_ = ((i_2448_ & 0xff00ff) + (i_2449_ & 0xff00ff));
										int i_2452_ = ((i_2451_ & 0x1000100) + (i_2450_ - i_2451_ & 0x10000));
										i_2452_ = (i_2450_ - i_2452_ | i_2452_ - (i_2452_ >>> 8));
										if (i_2448_ == 0 && anInt8878 != 255) {
											i_2448_ = i_2452_;
											i_2452_ = is[i_2398_];
											i_2452_ = (((((i_2448_ & 0xff00ff) * anInt8878) + ((i_2452_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2448_ & 0xff00) * anInt8878) + ((i_2452_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_2398_] = i_2452_;
									} else if (i == 2) {
										int i_2453_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2397_]);
										if (i_2453_ != 0) {
											int i_2454_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2453_ & 0xff]);
											int i_2455_ = (((i_2454_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2456_ = (((i_2454_ & 0xff00) * anInt8878) & 0xff0000);
											i_2454_ = ((i_2455_ | i_2456_) >>> 8) + anInt8885;
											int i_2457_ = is[i_2398_];
											int i_2458_ = i_2454_ + i_2457_;
											int i_2459_ = ((i_2454_ & 0xff00ff) + (i_2457_ & 0xff00ff));
											i_2457_ = ((i_2459_ & 0x1000100) + (i_2458_ - i_2459_ & 0x10000));
											is[i_2398_] = (i_2458_ - i_2457_ | i_2457_ - (i_2457_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2394_ += anInt8868;
							}
						}
						i_2391_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				} else {
					int i_2460_ = anInt8864;
					while (i_2460_ < 0) {
						int i_2461_ = anInt8870;
						int i_2462_ = anInt8873;
						int i_2463_ = anInt8874 + anInt8866;
						int i_2464_ = anInt8862;
						if (i_2462_ >= 0 && i_2462_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) < 0) {
							if (i_2463_ < 0) {
								int i_2465_ = (anInt8868 - 1 - i_2463_) / anInt8868;
								i_2464_ += i_2465_;
								i_2463_ += anInt8868 * i_2465_;
								i_2461_ += i_2465_;
							}
							int i_2466_;
							if ((i_2466_ = (1 + i_2463_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_2464_)
								i_2464_ = i_2466_;
							for (/**/; i_2464_ < 0; i_2464_++) {
								int i_2467_ = ((i_2463_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851 + (i_2462_ >> 12));
								int i_2468_ = i_2461_++;
								if (i_2322_ == 0) {
									if (i == 1)
										is[i_2468_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2467_]) & 0xff)]);
									else if (i == 0) {
										int i_2469_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2467_]) & 0xff)]);
										int i_2470_ = ((i_2469_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2471_ = ((i_2469_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2472_ = ((i_2469_ & 0xff) * anInt8882 & 0xff00);
										is[i_2468_] = (i_2470_ | i_2471_ | i_2472_) >>> 8;
									} else if (i == 3) {
										int i_2473_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2467_]) & 0xff)]);
										int i_2474_ = anInt8877;
										int i_2475_ = i_2473_ + i_2474_;
										int i_2476_ = ((i_2473_ & 0xff00ff) + (i_2474_ & 0xff00ff));
										int i_2477_ = ((i_2476_ & 0x1000100) + (i_2475_ - i_2476_ & 0x10000));
										is[i_2468_] = (i_2475_ - i_2477_ | i_2477_ - (i_2477_ >>> 8));
									} else if (i == 2) {
										int i_2478_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2467_]) & 0xff)]);
										int i_2479_ = ((i_2478_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2480_ = ((i_2478_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2468_] = ((i_2479_ | i_2480_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_2322_ == 1) {
									if (i == 1) {
										int i_2481_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2467_]);
										if (i_2481_ != 0)
											is[i_2468_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2481_ & 0xff]);
									} else if (i == 0) {
										int i_2482_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2467_]);
										if (i_2482_ != 0) {
											int i_2483_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2482_ & 0xff]);
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_2484_ = anInt8877 >>> 24;
												int i_2485_ = 256 - i_2484_;
												int i_2486_ = is[i_2468_];
												is[i_2468_] = (((((i_2483_ & 0xff00ff) * i_2484_) + ((i_2486_ & 0xff00ff) * i_2485_)) & ~0xff00ff) + ((((i_2483_ & 0xff00) * i_2484_) + ((i_2486_ & 0xff00) * i_2485_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_2487_ = (((i_2483_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2488_ = (((i_2483_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2489_ = (((i_2483_ & 0xff) * anInt8882) & 0xff00);
												i_2483_ = (i_2487_ | i_2488_ | i_2489_) >>> 8;
												int i_2490_ = is[i_2468_];
												is[i_2468_] = (((((i_2483_ & 0xff00ff) * anInt8878) + ((i_2490_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2483_ & 0xff00) * anInt8878) + ((i_2490_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_2491_ = (((i_2483_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2492_ = (((i_2483_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2493_ = (((i_2483_ & 0xff) * anInt8882) & 0xff00);
												is[i_2468_] = (i_2491_ | i_2492_ | i_2493_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2494_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2467_]);
										int i_2495_ = (i_2494_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2494_]) : 0);
										int i_2496_ = anInt8877;
										int i_2497_ = i_2495_ + i_2496_;
										int i_2498_ = ((i_2495_ & 0xff00ff) + (i_2496_ & 0xff00ff));
										int i_2499_ = ((i_2498_ & 0x1000100) + (i_2497_ - i_2498_ & 0x10000));
										i_2499_ = (i_2497_ - i_2499_ | i_2499_ - (i_2499_ >>> 8));
										if (i_2495_ == 0 && anInt8878 != 255) {
											i_2495_ = i_2499_;
											i_2499_ = is[i_2468_];
											i_2499_ = (((((i_2495_ & 0xff00ff) * anInt8878) + ((i_2499_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2495_ & 0xff00) * anInt8878) + ((i_2499_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_2468_] = i_2499_;
									} else if (i == 2) {
										int i_2500_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2467_]);
										if (i_2500_ != 0) {
											int i_2501_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2500_ & 0xff]);
											int i_2502_ = (((i_2501_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2503_ = (((i_2501_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_2468_++] = (((i_2502_ | i_2503_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2322_ == 2) {
									if (i == 1) {
										int i_2504_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2467_]);
										if (i_2504_ != 0) {
											int i_2505_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2504_ & 0xff]);
											int i_2506_ = is[i_2468_];
											int i_2507_ = i_2505_ + i_2506_;
											int i_2508_ = ((i_2505_ & 0xff00ff) + (i_2506_ & 0xff00ff));
											i_2506_ = ((i_2508_ & 0x1000100) + (i_2507_ - i_2508_ & 0x10000));
											is[i_2468_] = (i_2507_ - i_2506_ | i_2506_ - (i_2506_ >>> 8));
										}
									} else if (i == 0) {
										int i_2509_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2467_]);
										if (i_2509_ != 0) {
											int i_2510_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2509_ & 0xff]);
											int i_2511_ = (((i_2510_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2512_ = (((i_2510_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2513_ = ((i_2510_ & 0xff) * anInt8882 & 0xff00);
											i_2510_ = (i_2511_ | i_2512_ | i_2513_) >>> 8;
											int i_2514_ = is[i_2468_];
											int i_2515_ = i_2510_ + i_2514_;
											int i_2516_ = ((i_2510_ & 0xff00ff) + (i_2514_ & 0xff00ff));
											i_2514_ = ((i_2516_ & 0x1000100) + (i_2515_ - i_2516_ & 0x10000));
											is[i_2468_] = (i_2515_ - i_2514_ | i_2514_ - (i_2514_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2517_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2467_]);
										int i_2518_ = (i_2517_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2517_]) : 0);
										int i_2519_ = anInt8877;
										int i_2520_ = i_2518_ + i_2519_;
										int i_2521_ = ((i_2518_ & 0xff00ff) + (i_2519_ & 0xff00ff));
										int i_2522_ = ((i_2521_ & 0x1000100) + (i_2520_ - i_2521_ & 0x10000));
										i_2522_ = (i_2520_ - i_2522_ | i_2522_ - (i_2522_ >>> 8));
										if (i_2518_ == 0 && anInt8878 != 255) {
											i_2518_ = i_2522_;
											i_2522_ = is[i_2468_];
											i_2522_ = (((((i_2518_ & 0xff00ff) * anInt8878) + ((i_2522_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2518_ & 0xff00) * anInt8878) + ((i_2522_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_2468_] = i_2522_;
									} else if (i == 2) {
										int i_2523_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2467_]);
										if (i_2523_ != 0) {
											int i_2524_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2523_ & 0xff]);
											int i_2525_ = (((i_2524_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2526_ = (((i_2524_ & 0xff00) * anInt8878) & 0xff0000);
											i_2524_ = ((i_2525_ | i_2526_) >>> 8) + anInt8885;
											int i_2527_ = is[i_2468_];
											int i_2528_ = i_2524_ + i_2527_;
											int i_2529_ = ((i_2524_ & 0xff00ff) + (i_2527_ & 0xff00ff));
											i_2527_ = ((i_2529_ & 0x1000100) + (i_2528_ - i_2529_ & 0x10000));
											is[i_2468_] = (i_2528_ - i_2527_ | i_2527_ - (i_2527_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2463_ += anInt8868;
							}
						}
						i_2460_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					int i_2530_ = anInt8864;
					while (i_2530_ < 0) {
						int i_2531_ = anInt8870;
						int i_2532_ = anInt8873 + anInt8858;
						int i_2533_ = anInt8874;
						int i_2534_ = anInt8862;
						if (i_2533_ >= 0 && i_2533_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) < 0) {
							int i_2535_;
							if ((i_2535_ = (i_2532_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12))) >= 0) {
								i_2535_ = (anInt8865 - i_2535_) / anInt8865;
								i_2534_ += i_2535_;
								i_2532_ += anInt8865 * i_2535_;
								i_2531_ += i_2535_;
							}
							if ((i_2535_ = (i_2532_ - anInt8865) / anInt8865) > i_2534_)
								i_2534_ = i_2535_;
							for (/**/; i_2534_ < 0; i_2534_++) {
								int i_2536_ = ((i_2533_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851 + (i_2532_ >> 12));
								int i_2537_ = i_2531_++;
								if (i_2322_ == 0) {
									if (i == 1)
										is[i_2537_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2536_]) & 0xff)]);
									else if (i == 0) {
										int i_2538_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2536_]) & 0xff)]);
										int i_2539_ = ((i_2538_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2540_ = ((i_2538_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2541_ = ((i_2538_ & 0xff) * anInt8882 & 0xff00);
										is[i_2537_] = (i_2539_ | i_2540_ | i_2541_) >>> 8;
									} else if (i == 3) {
										int i_2542_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2536_]) & 0xff)]);
										int i_2543_ = anInt8877;
										int i_2544_ = i_2542_ + i_2543_;
										int i_2545_ = ((i_2542_ & 0xff00ff) + (i_2543_ & 0xff00ff));
										int i_2546_ = ((i_2545_ & 0x1000100) + (i_2544_ - i_2545_ & 0x10000));
										is[i_2537_] = (i_2544_ - i_2546_ | i_2546_ - (i_2546_ >>> 8));
									} else if (i == 2) {
										int i_2547_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2536_]) & 0xff)]);
										int i_2548_ = ((i_2547_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2549_ = ((i_2547_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2537_] = ((i_2548_ | i_2549_) >>> 8) + anInt8885;
									} else
										throw new IllegalArgumentException();
								} else if (i_2322_ == 1) {
									if (i == 1) {
										int i_2550_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2536_]);
										if (i_2550_ != 0)
											is[i_2537_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2550_ & 0xff]);
									} else if (i == 0) {
										int i_2551_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2536_]);
										if (i_2551_ != 0) {
											int i_2552_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2551_ & 0xff]);
											if ((anInt8877 & 0xffffff) == 16777215) {
												int i_2553_ = anInt8877 >>> 24;
												int i_2554_ = 256 - i_2553_;
												int i_2555_ = is[i_2537_];
												is[i_2537_] = (((((i_2552_ & 0xff00ff) * i_2553_) + ((i_2555_ & 0xff00ff) * i_2554_)) & ~0xff00ff) + ((((i_2552_ & 0xff00) * i_2553_) + ((i_2555_ & 0xff00) * i_2554_)) & 0xff0000)) >> 8;
											} else if (anInt8878 != 255) {
												int i_2556_ = (((i_2552_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2557_ = (((i_2552_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2558_ = (((i_2552_ & 0xff) * anInt8882) & 0xff00);
												i_2552_ = (i_2556_ | i_2557_ | i_2558_) >>> 8;
												int i_2559_ = is[i_2537_];
												is[i_2537_] = (((((i_2552_ & 0xff00ff) * anInt8878) + ((i_2559_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2552_ & 0xff00) * anInt8878) + ((i_2559_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
											} else {
												int i_2560_ = (((i_2552_ & 0xff0000) * anInt8880) & ~0xffffff);
												int i_2561_ = (((i_2552_ & 0xff00) * anInt8852) & 0xff0000);
												int i_2562_ = (((i_2552_ & 0xff) * anInt8882) & 0xff00);
												is[i_2537_] = (i_2560_ | i_2561_ | i_2562_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2563_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2536_]);
										int i_2564_ = (i_2563_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2563_]) : 0);
										int i_2565_ = anInt8877;
										int i_2566_ = i_2564_ + i_2565_;
										int i_2567_ = ((i_2564_ & 0xff00ff) + (i_2565_ & 0xff00ff));
										int i_2568_ = ((i_2567_ & 0x1000100) + (i_2566_ - i_2567_ & 0x10000));
										i_2568_ = (i_2566_ - i_2568_ | i_2568_ - (i_2568_ >>> 8));
										if (i_2564_ == 0 && anInt8878 != 255) {
											i_2564_ = i_2568_;
											i_2568_ = is[i_2537_];
											i_2568_ = (((((i_2564_ & 0xff00ff) * anInt8878) + ((i_2568_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2564_ & 0xff00) * anInt8878) + ((i_2568_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_2537_] = i_2568_;
									} else if (i == 2) {
										int i_2569_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2536_]);
										if (i_2569_ != 0) {
											int i_2570_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2569_ & 0xff]);
											int i_2571_ = (((i_2570_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2572_ = (((i_2570_ & 0xff00) * anInt8878) & 0xff0000);
											is[i_2537_++] = (((i_2571_ | i_2572_) >>> 8) + anInt8885);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2322_ == 2) {
									if (i == 1) {
										int i_2573_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2536_]);
										if (i_2573_ != 0) {
											int i_2574_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2573_ & 0xff]);
											int i_2575_ = is[i_2537_];
											int i_2576_ = i_2574_ + i_2575_;
											int i_2577_ = ((i_2574_ & 0xff00ff) + (i_2575_ & 0xff00ff));
											i_2575_ = ((i_2577_ & 0x1000100) + (i_2576_ - i_2577_ & 0x10000));
											is[i_2537_] = (i_2576_ - i_2575_ | i_2575_ - (i_2575_ >>> 8));
										}
									} else if (i == 0) {
										int i_2578_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2536_]);
										if (i_2578_ != 0) {
											int i_2579_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2578_ & 0xff]);
											int i_2580_ = (((i_2579_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2581_ = (((i_2579_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2582_ = ((i_2579_ & 0xff) * anInt8882 & 0xff00);
											i_2579_ = (i_2580_ | i_2581_ | i_2582_) >>> 8;
											int i_2583_ = is[i_2537_];
											int i_2584_ = i_2579_ + i_2583_;
											int i_2585_ = ((i_2579_ & 0xff00ff) + (i_2583_ & 0xff00ff));
											i_2583_ = ((i_2585_ & 0x1000100) + (i_2584_ - i_2585_ & 0x10000));
											is[i_2537_] = (i_2584_ - i_2583_ | i_2583_ - (i_2583_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2586_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2536_]);
										int i_2587_ = (i_2586_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2586_]) : 0);
										int i_2588_ = anInt8877;
										int i_2589_ = i_2587_ + i_2588_;
										int i_2590_ = ((i_2587_ & 0xff00ff) + (i_2588_ & 0xff00ff));
										int i_2591_ = ((i_2590_ & 0x1000100) + (i_2589_ - i_2590_ & 0x10000));
										i_2591_ = (i_2589_ - i_2591_ | i_2591_ - (i_2591_ >>> 8));
										if (i_2587_ == 0 && anInt8878 != 255) {
											i_2587_ = i_2591_;
											i_2591_ = is[i_2537_];
											i_2591_ = (((((i_2587_ & 0xff00ff) * anInt8878) + ((i_2591_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2587_ & 0xff00) * anInt8878) + ((i_2591_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										}
										is[i_2537_] = i_2591_;
									} else if (i == 2) {
										int i_2592_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2536_]);
										if (i_2592_ != 0) {
											int i_2593_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2592_ & 0xff]);
											int i_2594_ = (((i_2593_ & 0xff00ff) * anInt8878) & ~0xff00ff);
											int i_2595_ = (((i_2593_ & 0xff00) * anInt8878) & 0xff0000);
											i_2593_ = ((i_2594_ | i_2595_) >>> 8) + anInt8885;
											int i_2596_ = is[i_2537_];
											int i_2597_ = i_2593_ + i_2596_;
											int i_2598_ = ((i_2593_ & 0xff00ff) + (i_2596_ & 0xff00ff));
											i_2596_ = ((i_2598_ & 0x1000100) + (i_2597_ - i_2598_ & 0x10000));
											is[i_2537_] = (i_2597_ - i_2596_ | i_2596_ - (i_2596_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2532_ += anInt8865;
							}
						}
						i_2530_++;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_2599_ = anInt8864;
					while (i_2599_ < 0) {
						int i_2600_ = anInt8870;
						int i_2601_ = anInt8873 + anInt8858;
						int i_2602_ = anInt8874 + anInt8866;
						int i_2603_ = anInt8862;
						int i_2604_;
						if ((i_2604_ = i_2601_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12)) >= 0) {
							i_2604_ = (anInt8865 - i_2604_) / anInt8865;
							i_2603_ += i_2604_;
							i_2601_ += anInt8865 * i_2604_;
							i_2602_ += anInt8868 * i_2604_;
							i_2600_ += i_2604_;
						}
						if ((i_2604_ = (i_2601_ - anInt8865) / anInt8865) > i_2603_)
							i_2603_ = i_2604_;
						if ((i_2604_ = i_2602_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12)) >= 0) {
							i_2604_ = (anInt8868 - i_2604_) / anInt8868;
							i_2603_ += i_2604_;
							i_2601_ += anInt8865 * i_2604_;
							i_2602_ += anInt8868 * i_2604_;
							i_2600_ += i_2604_;
						}
						if ((i_2604_ = (i_2602_ - anInt8868) / anInt8868) > i_2603_)
							i_2603_ = i_2604_;
						for (/**/; i_2603_ < 0; i_2603_++) {
							int i_2605_ = (((i_2602_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_2601_ >> 12));
							int i_2606_ = i_2600_++;
							if (i_2322_ == 0) {
								if (i == 1)
									is[i_2606_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2605_]) & 0xff)]);
								else if (i == 0) {
									int i_2607_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2605_]) & 0xff)]);
									int i_2608_ = ((i_2607_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2609_ = ((i_2607_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2610_ = ((i_2607_ & 0xff) * anInt8882 & 0xff00);
									is[i_2606_] = (i_2608_ | i_2609_ | i_2610_) >>> 8;
								} else if (i == 3) {
									int i_2611_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2605_]) & 0xff)]);
									int i_2612_ = anInt8877;
									int i_2613_ = i_2611_ + i_2612_;
									int i_2614_ = ((i_2611_ & 0xff00ff) + (i_2612_ & 0xff00ff));
									int i_2615_ = ((i_2614_ & 0x1000100) + (i_2613_ - i_2614_ & 0x10000));
									is[i_2606_] = (i_2613_ - i_2615_ | i_2615_ - (i_2615_ >>> 8));
								} else if (i == 2) {
									int i_2616_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2605_]) & 0xff)]);
									int i_2617_ = ((i_2616_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2618_ = ((i_2616_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2606_] = (((i_2617_ | i_2618_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_2322_ == 1) {
								if (i == 1) {
									int i_2619_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2605_]);
									if (i_2619_ != 0)
										is[i_2606_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2619_ & 0xff]);
								} else if (i == 0) {
									int i_2620_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2605_]);
									if (i_2620_ != 0) {
										int i_2621_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2620_ & 0xff]);
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_2622_ = anInt8877 >>> 24;
											int i_2623_ = 256 - i_2622_;
											int i_2624_ = is[i_2606_];
											is[i_2606_] = (((((i_2621_ & 0xff00ff) * i_2622_) + ((i_2624_ & 0xff00ff) * i_2623_)) & ~0xff00ff) + ((((i_2621_ & 0xff00) * i_2622_) + ((i_2624_ & 0xff00) * i_2623_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_2625_ = (((i_2621_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2626_ = (((i_2621_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2627_ = ((i_2621_ & 0xff) * anInt8882 & 0xff00);
											i_2621_ = (i_2625_ | i_2626_ | i_2627_) >>> 8;
											int i_2628_ = is[i_2606_];
											is[i_2606_] = (((((i_2621_ & 0xff00ff) * anInt8878) + ((i_2628_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2621_ & 0xff00) * anInt8878) + ((i_2628_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_2629_ = (((i_2621_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2630_ = (((i_2621_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2631_ = ((i_2621_ & 0xff) * anInt8882 & 0xff00);
											is[i_2606_] = (i_2629_ | i_2630_ | i_2631_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_2632_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2605_]);
									int i_2633_ = (i_2632_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2632_]) : 0);
									int i_2634_ = anInt8877;
									int i_2635_ = i_2633_ + i_2634_;
									int i_2636_ = ((i_2633_ & 0xff00ff) + (i_2634_ & 0xff00ff));
									int i_2637_ = ((i_2636_ & 0x1000100) + (i_2635_ - i_2636_ & 0x10000));
									i_2637_ = (i_2635_ - i_2637_ | i_2637_ - (i_2637_ >>> 8));
									if (i_2633_ == 0 && anInt8878 != 255) {
										i_2633_ = i_2637_;
										i_2637_ = is[i_2606_];
										i_2637_ = (((((i_2633_ & 0xff00ff) * anInt8878) + ((i_2637_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2633_ & 0xff00) * anInt8878) + ((i_2637_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_2606_] = i_2637_;
								} else if (i == 2) {
									int i_2638_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2605_]);
									if (i_2638_ != 0) {
										int i_2639_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2638_ & 0xff]);
										int i_2640_ = ((i_2639_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2641_ = ((i_2639_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2606_++] = ((i_2640_ | i_2641_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2322_ == 2) {
								if (i == 1) {
									int i_2642_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2605_]);
									if (i_2642_ != 0) {
										int i_2643_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2642_ & 0xff]);
										int i_2644_ = is[i_2606_];
										int i_2645_ = i_2643_ + i_2644_;
										int i_2646_ = ((i_2643_ & 0xff00ff) + (i_2644_ & 0xff00ff));
										i_2644_ = ((i_2646_ & 0x1000100) + (i_2645_ - i_2646_ & 0x10000));
										is[i_2606_] = (i_2645_ - i_2644_ | i_2644_ - (i_2644_ >>> 8));
									}
								} else if (i == 0) {
									int i_2647_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2605_]);
									if (i_2647_ != 0) {
										int i_2648_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2647_ & 0xff]);
										int i_2649_ = ((i_2648_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2650_ = ((i_2648_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2651_ = ((i_2648_ & 0xff) * anInt8882 & 0xff00);
										i_2648_ = (i_2649_ | i_2650_ | i_2651_) >>> 8;
										int i_2652_ = is[i_2606_];
										int i_2653_ = i_2648_ + i_2652_;
										int i_2654_ = ((i_2648_ & 0xff00ff) + (i_2652_ & 0xff00ff));
										i_2652_ = ((i_2654_ & 0x1000100) + (i_2653_ - i_2654_ & 0x10000));
										is[i_2606_] = (i_2653_ - i_2652_ | i_2652_ - (i_2652_ >>> 8));
									}
								} else if (i == 3) {
									byte i_2655_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2605_]);
									int i_2656_ = (i_2655_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2655_]) : 0);
									int i_2657_ = anInt8877;
									int i_2658_ = i_2656_ + i_2657_;
									int i_2659_ = ((i_2656_ & 0xff00ff) + (i_2657_ & 0xff00ff));
									int i_2660_ = ((i_2659_ & 0x1000100) + (i_2658_ - i_2659_ & 0x10000));
									i_2660_ = (i_2658_ - i_2660_ | i_2660_ - (i_2660_ >>> 8));
									if (i_2656_ == 0 && anInt8878 != 255) {
										i_2656_ = i_2660_;
										i_2660_ = is[i_2606_];
										i_2660_ = (((((i_2656_ & 0xff00ff) * anInt8878) + ((i_2660_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2656_ & 0xff00) * anInt8878) + ((i_2660_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_2606_] = i_2660_;
								} else if (i == 2) {
									int i_2661_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2605_]);
									if (i_2661_ != 0) {
										int i_2662_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2661_ & 0xff]);
										int i_2663_ = ((i_2662_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2664_ = ((i_2662_ & 0xff00) * anInt8878 & 0xff0000);
										i_2662_ = (((i_2663_ | i_2664_) >>> 8) + anInt8885);
										int i_2665_ = is[i_2606_];
										int i_2666_ = i_2662_ + i_2665_;
										int i_2667_ = ((i_2662_ & 0xff00ff) + (i_2665_ & 0xff00ff));
										i_2665_ = ((i_2667_ & 0x1000100) + (i_2666_ - i_2667_ & 0x10000));
										is[i_2606_] = (i_2666_ - i_2665_ | i_2665_ - (i_2665_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2601_ += anInt8865;
							i_2602_ += anInt8868;
						}
						i_2599_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else {
					int i_2668_ = anInt8864;
					while (i_2668_ < 0) {
						int i_2669_ = anInt8870;
						int i_2670_ = anInt8873 + anInt8858;
						int i_2671_ = anInt8874 + anInt8866;
						int i_2672_ = anInt8862;
						int i_2673_;
						if ((i_2673_ = i_2670_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12)) >= 0) {
							i_2673_ = (anInt8865 - i_2673_) / anInt8865;
							i_2672_ += i_2673_;
							i_2670_ += anInt8865 * i_2673_;
							i_2671_ += anInt8868 * i_2673_;
							i_2669_ += i_2673_;
						}
						if ((i_2673_ = (i_2670_ - anInt8865) / anInt8865) > i_2672_)
							i_2672_ = i_2673_;
						if (i_2671_ < 0) {
							i_2673_ = (anInt8868 - 1 - i_2671_) / anInt8868;
							i_2672_ += i_2673_;
							i_2670_ += anInt8865 * i_2673_;
							i_2671_ += anInt8868 * i_2673_;
							i_2669_ += i_2673_;
						}
						if ((i_2673_ = (1 + i_2671_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_2672_)
							i_2672_ = i_2673_;
						for (/**/; i_2672_ < 0; i_2672_++) {
							int i_2674_ = (((i_2671_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_2670_ >> 12));
							int i_2675_ = i_2669_++;
							if (i_2322_ == 0) {
								if (i == 1)
									is[i_2675_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2674_]) & 0xff)]);
								else if (i == 0) {
									int i_2676_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2674_]) & 0xff)]);
									int i_2677_ = ((i_2676_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2678_ = ((i_2676_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2679_ = ((i_2676_ & 0xff) * anInt8882 & 0xff00);
									is[i_2675_] = (i_2677_ | i_2678_ | i_2679_) >>> 8;
								} else if (i == 3) {
									int i_2680_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2674_]) & 0xff)]);
									int i_2681_ = anInt8877;
									int i_2682_ = i_2680_ + i_2681_;
									int i_2683_ = ((i_2680_ & 0xff00ff) + (i_2681_ & 0xff00ff));
									int i_2684_ = ((i_2683_ & 0x1000100) + (i_2682_ - i_2683_ & 0x10000));
									is[i_2675_] = (i_2682_ - i_2684_ | i_2684_ - (i_2684_ >>> 8));
								} else if (i == 2) {
									int i_2685_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2674_]) & 0xff)]);
									int i_2686_ = ((i_2685_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2687_ = ((i_2685_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2675_] = (((i_2686_ | i_2687_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_2322_ == 1) {
								if (i == 1) {
									int i_2688_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2674_]);
									if (i_2688_ != 0)
										is[i_2675_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2688_ & 0xff]);
								} else if (i == 0) {
									int i_2689_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2674_]);
									if (i_2689_ != 0) {
										int i_2690_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2689_ & 0xff]);
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_2691_ = anInt8877 >>> 24;
											int i_2692_ = 256 - i_2691_;
											int i_2693_ = is[i_2675_];
											is[i_2675_] = (((((i_2690_ & 0xff00ff) * i_2691_) + ((i_2693_ & 0xff00ff) * i_2692_)) & ~0xff00ff) + ((((i_2690_ & 0xff00) * i_2691_) + ((i_2693_ & 0xff00) * i_2692_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_2694_ = (((i_2690_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2695_ = (((i_2690_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2696_ = ((i_2690_ & 0xff) * anInt8882 & 0xff00);
											i_2690_ = (i_2694_ | i_2695_ | i_2696_) >>> 8;
											int i_2697_ = is[i_2675_];
											is[i_2675_] = (((((i_2690_ & 0xff00ff) * anInt8878) + ((i_2697_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2690_ & 0xff00) * anInt8878) + ((i_2697_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_2698_ = (((i_2690_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2699_ = (((i_2690_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2700_ = ((i_2690_ & 0xff) * anInt8882 & 0xff00);
											is[i_2675_] = (i_2698_ | i_2699_ | i_2700_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_2701_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2674_]);
									int i_2702_ = (i_2701_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2701_]) : 0);
									int i_2703_ = anInt8877;
									int i_2704_ = i_2702_ + i_2703_;
									int i_2705_ = ((i_2702_ & 0xff00ff) + (i_2703_ & 0xff00ff));
									int i_2706_ = ((i_2705_ & 0x1000100) + (i_2704_ - i_2705_ & 0x10000));
									i_2706_ = (i_2704_ - i_2706_ | i_2706_ - (i_2706_ >>> 8));
									if (i_2702_ == 0 && anInt8878 != 255) {
										i_2702_ = i_2706_;
										i_2706_ = is[i_2675_];
										i_2706_ = (((((i_2702_ & 0xff00ff) * anInt8878) + ((i_2706_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2702_ & 0xff00) * anInt8878) + ((i_2706_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_2675_] = i_2706_;
								} else if (i == 2) {
									int i_2707_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2674_]);
									if (i_2707_ != 0) {
										int i_2708_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2707_ & 0xff]);
										int i_2709_ = ((i_2708_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2710_ = ((i_2708_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2675_++] = ((i_2709_ | i_2710_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2322_ == 2) {
								if (i == 1) {
									int i_2711_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2674_]);
									if (i_2711_ != 0) {
										int i_2712_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2711_ & 0xff]);
										int i_2713_ = is[i_2675_];
										int i_2714_ = i_2712_ + i_2713_;
										int i_2715_ = ((i_2712_ & 0xff00ff) + (i_2713_ & 0xff00ff));
										i_2713_ = ((i_2715_ & 0x1000100) + (i_2714_ - i_2715_ & 0x10000));
										is[i_2675_] = (i_2714_ - i_2713_ | i_2713_ - (i_2713_ >>> 8));
									}
								} else if (i == 0) {
									int i_2716_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2674_]);
									if (i_2716_ != 0) {
										int i_2717_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2716_ & 0xff]);
										int i_2718_ = ((i_2717_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2719_ = ((i_2717_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2720_ = ((i_2717_ & 0xff) * anInt8882 & 0xff00);
										i_2717_ = (i_2718_ | i_2719_ | i_2720_) >>> 8;
										int i_2721_ = is[i_2675_];
										int i_2722_ = i_2717_ + i_2721_;
										int i_2723_ = ((i_2717_ & 0xff00ff) + (i_2721_ & 0xff00ff));
										i_2721_ = ((i_2723_ & 0x1000100) + (i_2722_ - i_2723_ & 0x10000));
										is[i_2675_] = (i_2722_ - i_2721_ | i_2721_ - (i_2721_ >>> 8));
									}
								} else if (i == 3) {
									byte i_2724_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2674_]);
									int i_2725_ = (i_2724_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2724_]) : 0);
									int i_2726_ = anInt8877;
									int i_2727_ = i_2725_ + i_2726_;
									int i_2728_ = ((i_2725_ & 0xff00ff) + (i_2726_ & 0xff00ff));
									int i_2729_ = ((i_2728_ & 0x1000100) + (i_2727_ - i_2728_ & 0x10000));
									i_2729_ = (i_2727_ - i_2729_ | i_2729_ - (i_2729_ >>> 8));
									if (i_2725_ == 0 && anInt8878 != 255) {
										i_2725_ = i_2729_;
										i_2729_ = is[i_2675_];
										i_2729_ = (((((i_2725_ & 0xff00ff) * anInt8878) + ((i_2729_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2725_ & 0xff00) * anInt8878) + ((i_2729_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_2675_] = i_2729_;
								} else if (i == 2) {
									int i_2730_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2674_]);
									if (i_2730_ != 0) {
										int i_2731_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2730_ & 0xff]);
										int i_2732_ = ((i_2731_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2733_ = ((i_2731_ & 0xff00) * anInt8878 & 0xff0000);
										i_2731_ = (((i_2732_ | i_2733_) >>> 8) + anInt8885);
										int i_2734_ = is[i_2675_];
										int i_2735_ = i_2731_ + i_2734_;
										int i_2736_ = ((i_2731_ & 0xff00ff) + (i_2734_ & 0xff00ff));
										i_2734_ = ((i_2736_ & 0x1000100) + (i_2735_ - i_2736_ & 0x10000));
										is[i_2675_] = (i_2735_ - i_2734_ | i_2734_ - (i_2734_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2670_ += anInt8865;
							i_2671_ += anInt8868;
						}
						i_2668_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8868 == 0) {
				int i_2737_ = anInt8864;
				while (i_2737_ < 0) {
					int i_2738_ = anInt8870;
					int i_2739_ = anInt8873 + anInt8858;
					int i_2740_ = anInt8874;
					int i_2741_ = anInt8862;
					if (i_2740_ >= 0 && i_2740_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) < 0) {
						if (i_2739_ < 0) {
							int i_2742_ = (anInt8865 - 1 - i_2739_) / anInt8865;
							i_2741_ += i_2742_;
							i_2739_ += anInt8865 * i_2742_;
							i_2738_ += i_2742_;
						}
						int i_2743_;
						if ((i_2743_ = (1 + i_2739_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_2741_)
							i_2741_ = i_2743_;
						for (/**/; i_2741_ < 0; i_2741_++) {
							int i_2744_ = (((i_2740_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_2739_ >> 12));
							int i_2745_ = i_2738_++;
							if (i_2322_ == 0) {
								if (i == 1)
									is[i_2745_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2744_]) & 0xff)]);
								else if (i == 0) {
									int i_2746_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2744_]) & 0xff)]);
									int i_2747_ = ((i_2746_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2748_ = ((i_2746_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2749_ = ((i_2746_ & 0xff) * anInt8882 & 0xff00);
									is[i_2745_] = (i_2747_ | i_2748_ | i_2749_) >>> 8;
								} else if (i == 3) {
									int i_2750_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2744_]) & 0xff)]);
									int i_2751_ = anInt8877;
									int i_2752_ = i_2750_ + i_2751_;
									int i_2753_ = ((i_2750_ & 0xff00ff) + (i_2751_ & 0xff00ff));
									int i_2754_ = ((i_2753_ & 0x1000100) + (i_2752_ - i_2753_ & 0x10000));
									is[i_2745_] = (i_2752_ - i_2754_ | i_2754_ - (i_2754_ >>> 8));
								} else if (i == 2) {
									int i_2755_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[i_2744_]) & 0xff)]);
									int i_2756_ = ((i_2755_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2757_ = ((i_2755_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2745_] = (((i_2756_ | i_2757_) >>> 8) + anInt8885);
								} else
									throw new IllegalArgumentException();
							} else if (i_2322_ == 1) {
								if (i == 1) {
									int i_2758_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2744_]);
									if (i_2758_ != 0)
										is[i_2745_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2758_ & 0xff]);
								} else if (i == 0) {
									int i_2759_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2744_]);
									if (i_2759_ != 0) {
										int i_2760_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2759_ & 0xff]);
										if ((anInt8877 & 0xffffff) == 16777215) {
											int i_2761_ = anInt8877 >>> 24;
											int i_2762_ = 256 - i_2761_;
											int i_2763_ = is[i_2745_];
											is[i_2745_] = (((((i_2760_ & 0xff00ff) * i_2761_) + ((i_2763_ & 0xff00ff) * i_2762_)) & ~0xff00ff) + ((((i_2760_ & 0xff00) * i_2761_) + ((i_2763_ & 0xff00) * i_2762_)) & 0xff0000)) >> 8;
										} else if (anInt8878 != 255) {
											int i_2764_ = (((i_2760_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2765_ = (((i_2760_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2766_ = ((i_2760_ & 0xff) * anInt8882 & 0xff00);
											i_2760_ = (i_2764_ | i_2765_ | i_2766_) >>> 8;
											int i_2767_ = is[i_2745_];
											is[i_2745_] = (((((i_2760_ & 0xff00ff) * anInt8878) + ((i_2767_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2760_ & 0xff00) * anInt8878) + ((i_2767_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
										} else {
											int i_2768_ = (((i_2760_ & 0xff0000) * anInt8880) & ~0xffffff);
											int i_2769_ = (((i_2760_ & 0xff00) * anInt8852) & 0xff0000);
											int i_2770_ = ((i_2760_ & 0xff) * anInt8882 & 0xff00);
											is[i_2745_] = (i_2768_ | i_2769_ | i_2770_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_2771_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2744_]);
									int i_2772_ = (i_2771_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2771_]) : 0);
									int i_2773_ = anInt8877;
									int i_2774_ = i_2772_ + i_2773_;
									int i_2775_ = ((i_2772_ & 0xff00ff) + (i_2773_ & 0xff00ff));
									int i_2776_ = ((i_2775_ & 0x1000100) + (i_2774_ - i_2775_ & 0x10000));
									i_2776_ = (i_2774_ - i_2776_ | i_2776_ - (i_2776_ >>> 8));
									if (i_2772_ == 0 && anInt8878 != 255) {
										i_2772_ = i_2776_;
										i_2776_ = is[i_2745_];
										i_2776_ = (((((i_2772_ & 0xff00ff) * anInt8878) + ((i_2776_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2772_ & 0xff00) * anInt8878) + ((i_2776_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_2745_] = i_2776_;
								} else if (i == 2) {
									int i_2777_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2744_]);
									if (i_2777_ != 0) {
										int i_2778_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2777_ & 0xff]);
										int i_2779_ = ((i_2778_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2780_ = ((i_2778_ & 0xff00) * anInt8878 & 0xff0000);
										is[i_2745_++] = ((i_2779_ | i_2780_) >>> 8) + anInt8885;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2322_ == 2) {
								if (i == 1) {
									int i_2781_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2744_]);
									if (i_2781_ != 0) {
										int i_2782_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2781_ & 0xff]);
										int i_2783_ = is[i_2745_];
										int i_2784_ = i_2782_ + i_2783_;
										int i_2785_ = ((i_2782_ & 0xff00ff) + (i_2783_ & 0xff00ff));
										i_2783_ = ((i_2785_ & 0x1000100) + (i_2784_ - i_2785_ & 0x10000));
										is[i_2745_] = (i_2784_ - i_2783_ | i_2783_ - (i_2783_ >>> 8));
									}
								} else if (i == 0) {
									int i_2786_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2744_]);
									if (i_2786_ != 0) {
										int i_2787_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2786_ & 0xff]);
										int i_2788_ = ((i_2787_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2789_ = ((i_2787_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2790_ = ((i_2787_ & 0xff) * anInt8882 & 0xff00);
										i_2787_ = (i_2788_ | i_2789_ | i_2790_) >>> 8;
										int i_2791_ = is[i_2745_];
										int i_2792_ = i_2787_ + i_2791_;
										int i_2793_ = ((i_2787_ & 0xff00ff) + (i_2791_ & 0xff00ff));
										i_2791_ = ((i_2793_ & 0x1000100) + (i_2792_ - i_2793_ & 0x10000));
										is[i_2745_] = (i_2792_ - i_2791_ | i_2791_ - (i_2791_ >>> 8));
									}
								} else if (i == 3) {
									byte i_2794_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2744_]);
									int i_2795_ = (i_2794_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2794_]) : 0);
									int i_2796_ = anInt8877;
									int i_2797_ = i_2795_ + i_2796_;
									int i_2798_ = ((i_2795_ & 0xff00ff) + (i_2796_ & 0xff00ff));
									int i_2799_ = ((i_2798_ & 0x1000100) + (i_2797_ - i_2798_ & 0x10000));
									i_2799_ = (i_2797_ - i_2799_ | i_2799_ - (i_2799_ >>> 8));
									if (i_2795_ == 0 && anInt8878 != 255) {
										i_2795_ = i_2799_;
										i_2799_ = is[i_2745_];
										i_2799_ = (((((i_2795_ & 0xff00ff) * anInt8878) + ((i_2799_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2795_ & 0xff00) * anInt8878) + ((i_2799_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									}
									is[i_2745_] = i_2799_;
								} else if (i == 2) {
									int i_2800_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2744_]);
									if (i_2800_ != 0) {
										int i_2801_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2800_ & 0xff]);
										int i_2802_ = ((i_2801_ & 0xff00ff) * anInt8878 & ~0xff00ff);
										int i_2803_ = ((i_2801_ & 0xff00) * anInt8878 & 0xff0000);
										i_2801_ = (((i_2802_ | i_2803_) >>> 8) + anInt8885);
										int i_2804_ = is[i_2745_];
										int i_2805_ = i_2801_ + i_2804_;
										int i_2806_ = ((i_2801_ & 0xff00ff) + (i_2804_ & 0xff00ff));
										i_2804_ = ((i_2806_ & 0x1000100) + (i_2805_ - i_2806_ & 0x10000));
										is[i_2745_] = (i_2805_ - i_2804_ | i_2804_ - (i_2804_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2739_ += anInt8865;
						}
					}
					i_2737_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else if (anInt8868 < 0) {
				for (int i_2807_ = anInt8864; i_2807_ < 0; i_2807_++) {
					int i_2808_ = anInt8870;
					int i_2809_ = anInt8873 + anInt8858;
					int i_2810_ = anInt8874 + anInt8866;
					int i_2811_ = anInt8862;
					if (i_2809_ < 0) {
						int i_2812_ = (anInt8865 - 1 - i_2809_) / anInt8865;
						i_2811_ += i_2812_;
						i_2809_ += anInt8865 * i_2812_;
						i_2810_ += anInt8868 * i_2812_;
						i_2808_ += i_2812_;
					}
					int i_2813_;
					if ((i_2813_ = (1 + i_2809_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_2811_)
						i_2811_ = i_2813_;
					if ((i_2813_ = i_2810_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12)) >= 0) {
						i_2813_ = (anInt8868 - i_2813_) / anInt8868;
						i_2811_ += i_2813_;
						i_2809_ += anInt8865 * i_2813_;
						i_2810_ += anInt8868 * i_2813_;
						i_2808_ += i_2813_;
					}
					if ((i_2813_ = (i_2810_ - anInt8868) / anInt8868) > i_2811_)
						i_2811_ = i_2813_;
					for (/**/; i_2811_ < 0; i_2811_++) {
						int i_2814_ = (((i_2810_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_2809_ >> 12));
						int i_2815_ = i_2808_++;
						if (i_2322_ == 0) {
							if (i == 1)
								is[i_2815_] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2814_]) & 0xff]);
							else if (i == 0) {
								int i_2816_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2814_]) & 0xff]);
								int i_2817_ = ((i_2816_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_2818_ = ((i_2816_ & 0xff00) * anInt8852 & 0xff0000);
								int i_2819_ = (i_2816_ & 0xff) * anInt8882 & 0xff00;
								is[i_2815_] = (i_2817_ | i_2818_ | i_2819_) >>> 8;
							} else if (i == 3) {
								int i_2820_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2814_]) & 0xff]);
								int i_2821_ = anInt8877;
								int i_2822_ = i_2820_ + i_2821_;
								int i_2823_ = ((i_2820_ & 0xff00ff) + (i_2821_ & 0xff00ff));
								int i_2824_ = ((i_2823_ & 0x1000100) + (i_2822_ - i_2823_ & 0x10000));
								is[i_2815_] = i_2822_ - i_2824_ | i_2824_ - (i_2824_ >>> 8);
							} else if (i == 2) {
								int i_2825_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2814_]) & 0xff]);
								int i_2826_ = ((i_2825_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_2827_ = ((i_2825_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_2815_] = ((i_2826_ | i_2827_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_2322_ == 1) {
							if (i == 1) {
								int i_2828_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2814_]);
								if (i_2828_ != 0)
									is[i_2815_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2828_ & 0xff]);
							} else if (i == 0) {
								int i_2829_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2814_]);
								if (i_2829_ != 0) {
									int i_2830_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2829_ & 0xff]);
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_2831_ = anInt8877 >>> 24;
										int i_2832_ = 256 - i_2831_;
										int i_2833_ = is[i_2815_];
										is[i_2815_] = ((((i_2830_ & 0xff00ff) * i_2831_ + ((i_2833_ & 0xff00ff) * i_2832_)) & ~0xff00ff) + (((i_2830_ & 0xff00) * i_2831_ + ((i_2833_ & 0xff00) * i_2832_)) & 0xff0000)) >> 8;
									} else if (anInt8878 != 255) {
										int i_2834_ = ((i_2830_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2835_ = ((i_2830_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2836_ = ((i_2830_ & 0xff) * anInt8882 & 0xff00);
										i_2830_ = (i_2834_ | i_2835_ | i_2836_) >>> 8;
										int i_2837_ = is[i_2815_];
										is[i_2815_] = (((((i_2830_ & 0xff00ff) * anInt8878) + ((i_2837_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2830_ & 0xff00) * anInt8878) + ((i_2837_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									} else {
										int i_2838_ = ((i_2830_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2839_ = ((i_2830_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2840_ = ((i_2830_ & 0xff) * anInt8882 & 0xff00);
										is[i_2815_] = (i_2838_ | i_2839_ | i_2840_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_2841_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2814_]);
								int i_2842_ = (i_2841_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2841_]) : 0);
								int i_2843_ = anInt8877;
								int i_2844_ = i_2842_ + i_2843_;
								int i_2845_ = ((i_2842_ & 0xff00ff) + (i_2843_ & 0xff00ff));
								int i_2846_ = ((i_2845_ & 0x1000100) + (i_2844_ - i_2845_ & 0x10000));
								i_2846_ = i_2844_ - i_2846_ | i_2846_ - (i_2846_ >>> 8);
								if (i_2842_ == 0 && anInt8878 != 255) {
									i_2842_ = i_2846_;
									i_2846_ = is[i_2815_];
									i_2846_ = ((((i_2842_ & 0xff00ff) * anInt8878 + ((i_2846_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_2842_ & 0xff00) * anInt8878 + ((i_2846_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_2815_] = i_2846_;
							} else if (i == 2) {
								int i_2847_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2814_]);
								if (i_2847_ != 0) {
									int i_2848_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2847_ & 0xff]);
									int i_2849_ = ((i_2848_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2850_ = ((i_2848_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2815_++] = ((i_2849_ | i_2850_) >>> 8) + anInt8885;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2322_ == 2) {
							if (i == 1) {
								int i_2851_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2814_]);
								if (i_2851_ != 0) {
									int i_2852_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2851_ & 0xff]);
									int i_2853_ = is[i_2815_];
									int i_2854_ = i_2852_ + i_2853_;
									int i_2855_ = ((i_2852_ & 0xff00ff) + (i_2853_ & 0xff00ff));
									i_2853_ = ((i_2855_ & 0x1000100) + (i_2854_ - i_2855_ & 0x10000));
									is[i_2815_] = (i_2854_ - i_2853_ | i_2853_ - (i_2853_ >>> 8));
								}
							} else if (i == 0) {
								int i_2856_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2814_]);
								if (i_2856_ != 0) {
									int i_2857_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2856_ & 0xff]);
									int i_2858_ = ((i_2857_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2859_ = ((i_2857_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2860_ = ((i_2857_ & 0xff) * anInt8882 & 0xff00);
									i_2857_ = (i_2858_ | i_2859_ | i_2860_) >>> 8;
									int i_2861_ = is[i_2815_];
									int i_2862_ = i_2857_ + i_2861_;
									int i_2863_ = ((i_2857_ & 0xff00ff) + (i_2861_ & 0xff00ff));
									i_2861_ = ((i_2863_ & 0x1000100) + (i_2862_ - i_2863_ & 0x10000));
									is[i_2815_] = (i_2862_ - i_2861_ | i_2861_ - (i_2861_ >>> 8));
								}
							} else if (i == 3) {
								byte i_2864_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2814_]);
								int i_2865_ = (i_2864_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2864_]) : 0);
								int i_2866_ = anInt8877;
								int i_2867_ = i_2865_ + i_2866_;
								int i_2868_ = ((i_2865_ & 0xff00ff) + (i_2866_ & 0xff00ff));
								int i_2869_ = ((i_2868_ & 0x1000100) + (i_2867_ - i_2868_ & 0x10000));
								i_2869_ = i_2867_ - i_2869_ | i_2869_ - (i_2869_ >>> 8);
								if (i_2865_ == 0 && anInt8878 != 255) {
									i_2865_ = i_2869_;
									i_2869_ = is[i_2815_];
									i_2869_ = ((((i_2865_ & 0xff00ff) * anInt8878 + ((i_2869_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_2865_ & 0xff00) * anInt8878 + ((i_2869_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_2815_] = i_2869_;
							} else if (i == 2) {
								int i_2870_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2814_]);
								if (i_2870_ != 0) {
									int i_2871_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2870_ & 0xff]);
									int i_2872_ = ((i_2871_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2873_ = ((i_2871_ & 0xff00) * anInt8878 & 0xff0000);
									i_2871_ = (((i_2872_ | i_2873_) >>> 8) + anInt8885);
									int i_2874_ = is[i_2815_];
									int i_2875_ = i_2871_ + i_2874_;
									int i_2876_ = ((i_2871_ & 0xff00ff) + (i_2874_ & 0xff00ff));
									i_2874_ = ((i_2876_ & 0x1000100) + (i_2875_ - i_2876_ & 0x10000));
									is[i_2815_] = (i_2875_ - i_2874_ | i_2874_ - (i_2874_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_2809_ += anInt8865;
						i_2810_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else {
				for (int i_2877_ = anInt8864; i_2877_ < 0; i_2877_++) {
					int i_2878_ = anInt8870;
					int i_2879_ = anInt8873 + anInt8858;
					int i_2880_ = anInt8874 + anInt8866;
					int i_2881_ = anInt8862;
					if (i_2879_ < 0) {
						int i_2882_ = (anInt8865 - 1 - i_2879_) / anInt8865;
						i_2881_ += i_2882_;
						i_2879_ += anInt8865 * i_2882_;
						i_2880_ += anInt8868 * i_2882_;
						i_2878_ += i_2882_;
					}
					int i_2883_;
					if ((i_2883_ = (1 + i_2879_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_2881_)
						i_2881_ = i_2883_;
					if (i_2880_ < 0) {
						i_2883_ = (anInt8868 - 1 - i_2880_) / anInt8868;
						i_2881_ += i_2883_;
						i_2879_ += anInt8865 * i_2883_;
						i_2880_ += anInt8868 * i_2883_;
						i_2878_ += i_2883_;
					}
					if ((i_2883_ = (1 + i_2880_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_2881_)
						i_2881_ = i_2883_;
					for (/**/; i_2881_ < 0; i_2881_++) {
						int i_2884_ = (((i_2880_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_2879_ >> 12));
						int i_2885_ = i_2878_++;
						if (i_2322_ == 0) {
							if (i == 1)
								is[i_2885_] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2884_]) & 0xff]);
							else if (i == 0) {
								int i_2886_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2884_]) & 0xff]);
								int i_2887_ = ((i_2886_ & 0xff0000) * anInt8880 & ~0xffffff);
								int i_2888_ = ((i_2886_ & 0xff00) * anInt8852 & 0xff0000);
								int i_2889_ = (i_2886_ & 0xff) * anInt8882 & 0xff00;
								is[i_2885_] = (i_2887_ | i_2888_ | i_2889_) >>> 8;
							} else if (i == 3) {
								int i_2890_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2884_]) & 0xff]);
								int i_2891_ = anInt8877;
								int i_2892_ = i_2890_ + i_2891_;
								int i_2893_ = ((i_2890_ & 0xff00ff) + (i_2891_ & 0xff00ff));
								int i_2894_ = ((i_2893_ & 0x1000100) + (i_2892_ - i_2893_ & 0x10000));
								is[i_2885_] = i_2892_ - i_2894_ | i_2894_ - (i_2894_ >>> 8);
							} else if (i == 2) {
								int i_2895_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_2884_]) & 0xff]);
								int i_2896_ = ((i_2895_ & 0xff00ff) * anInt8878 & ~0xff00ff);
								int i_2897_ = ((i_2895_ & 0xff00) * anInt8878 & 0xff0000);
								is[i_2885_] = ((i_2896_ | i_2897_) >>> 8) + anInt8885;
							} else
								throw new IllegalArgumentException();
						} else if (i_2322_ == 1) {
							if (i == 1) {
								int i_2898_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2884_]);
								if (i_2898_ != 0)
									is[i_2885_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2898_ & 0xff]);
							} else if (i == 0) {
								int i_2899_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2884_]);
								if (i_2899_ != 0) {
									int i_2900_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2899_ & 0xff]);
									if ((anInt8877 & 0xffffff) == 16777215) {
										int i_2901_ = anInt8877 >>> 24;
										int i_2902_ = 256 - i_2901_;
										int i_2903_ = is[i_2885_];
										is[i_2885_] = ((((i_2900_ & 0xff00ff) * i_2901_ + ((i_2903_ & 0xff00ff) * i_2902_)) & ~0xff00ff) + (((i_2900_ & 0xff00) * i_2901_ + ((i_2903_ & 0xff00) * i_2902_)) & 0xff0000)) >> 8;
									} else if (anInt8878 != 255) {
										int i_2904_ = ((i_2900_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2905_ = ((i_2900_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2906_ = ((i_2900_ & 0xff) * anInt8882 & 0xff00);
										i_2900_ = (i_2904_ | i_2905_ | i_2906_) >>> 8;
										int i_2907_ = is[i_2885_];
										is[i_2885_] = (((((i_2900_ & 0xff00ff) * anInt8878) + ((i_2907_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + ((((i_2900_ & 0xff00) * anInt8878) + ((i_2907_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
									} else {
										int i_2908_ = ((i_2900_ & 0xff0000) * anInt8880 & ~0xffffff);
										int i_2909_ = ((i_2900_ & 0xff00) * anInt8852 & 0xff0000);
										int i_2910_ = ((i_2900_ & 0xff) * anInt8882 & 0xff00);
										is[i_2885_] = (i_2908_ | i_2909_ | i_2910_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_2911_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2884_]);
								int i_2912_ = (i_2911_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2911_]) : 0);
								int i_2913_ = anInt8877;
								int i_2914_ = i_2912_ + i_2913_;
								int i_2915_ = ((i_2912_ & 0xff00ff) + (i_2913_ & 0xff00ff));
								int i_2916_ = ((i_2915_ & 0x1000100) + (i_2914_ - i_2915_ & 0x10000));
								i_2916_ = i_2914_ - i_2916_ | i_2916_ - (i_2916_ >>> 8);
								if (i_2912_ == 0 && anInt8878 != 255) {
									i_2912_ = i_2916_;
									i_2916_ = is[i_2885_];
									i_2916_ = ((((i_2912_ & 0xff00ff) * anInt8878 + ((i_2916_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_2912_ & 0xff00) * anInt8878 + ((i_2916_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_2885_] = i_2916_;
							} else if (i == 2) {
								int i_2917_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2884_]);
								if (i_2917_ != 0) {
									int i_2918_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2917_ & 0xff]);
									int i_2919_ = ((i_2918_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2920_ = ((i_2918_ & 0xff00) * anInt8878 & 0xff0000);
									is[i_2885_++] = ((i_2919_ | i_2920_) >>> 8) + anInt8885;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2322_ == 2) {
							if (i == 1) {
								int i_2921_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2884_]);
								if (i_2921_ != 0) {
									int i_2922_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2921_ & 0xff]);
									int i_2923_ = is[i_2885_];
									int i_2924_ = i_2922_ + i_2923_;
									int i_2925_ = ((i_2922_ & 0xff00ff) + (i_2923_ & 0xff00ff));
									i_2923_ = ((i_2925_ & 0x1000100) + (i_2924_ - i_2925_ & 0x10000));
									is[i_2885_] = (i_2924_ - i_2923_ | i_2923_ - (i_2923_ >>> 8));
								}
							} else if (i == 0) {
								int i_2926_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2884_]);
								if (i_2926_ != 0) {
									int i_2927_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2926_ & 0xff]);
									int i_2928_ = ((i_2927_ & 0xff0000) * anInt8880 & ~0xffffff);
									int i_2929_ = ((i_2927_ & 0xff00) * anInt8852 & 0xff0000);
									int i_2930_ = ((i_2927_ & 0xff) * anInt8882 & 0xff00);
									i_2927_ = (i_2928_ | i_2929_ | i_2930_) >>> 8;
									int i_2931_ = is[i_2885_];
									int i_2932_ = i_2927_ + i_2931_;
									int i_2933_ = ((i_2927_ & 0xff00ff) + (i_2931_ & 0xff00ff));
									i_2931_ = ((i_2933_ & 0x1000100) + (i_2932_ - i_2933_ & 0x10000));
									is[i_2885_] = (i_2932_ - i_2931_ | i_2931_ - (i_2931_ >>> 8));
								}
							} else if (i == 3) {
								byte i_2934_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2884_]);
								int i_2935_ = (i_2934_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_2934_]) : 0);
								int i_2936_ = anInt8877;
								int i_2937_ = i_2935_ + i_2936_;
								int i_2938_ = ((i_2935_ & 0xff00ff) + (i_2936_ & 0xff00ff));
								int i_2939_ = ((i_2938_ & 0x1000100) + (i_2937_ - i_2938_ & 0x10000));
								i_2939_ = i_2937_ - i_2939_ | i_2939_ - (i_2939_ >>> 8);
								if (i_2935_ == 0 && anInt8878 != 255) {
									i_2935_ = i_2939_;
									i_2939_ = is[i_2885_];
									i_2939_ = ((((i_2935_ & 0xff00ff) * anInt8878 + ((i_2939_ & 0xff00ff) * anInt8879)) & ~0xff00ff) + (((i_2935_ & 0xff00) * anInt8878 + ((i_2939_ & 0xff00) * anInt8879)) & 0xff0000)) >> 8;
								}
								is[i_2885_] = i_2939_;
							} else if (i == 2) {
								int i_2940_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_2884_]);
								if (i_2940_ != 0) {
									int i_2941_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2940_ & 0xff]);
									int i_2942_ = ((i_2941_ & 0xff00ff) * anInt8878 & ~0xff00ff);
									int i_2943_ = ((i_2941_ & 0xff00) * anInt8878 & 0xff0000);
									i_2941_ = (((i_2942_ | i_2943_) >>> 8) + anInt8885);
									int i_2944_ = is[i_2885_];
									int i_2945_ = i_2941_ + i_2944_;
									int i_2946_ = ((i_2941_ & 0xff00ff) + (i_2944_ & 0xff00ff));
									i_2944_ = ((i_2946_ & 0x1000100) + (i_2945_ - i_2946_ & 0x10000));
									is[i_2885_] = (i_2945_ - i_2944_ | i_2944_ - (i_2944_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_2879_ += anInt8865;
						i_2880_ += anInt8868;
					}
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			}
		}
	}

	void method14251(int[] is, int[] is_2947_, int i, int i_2948_) {
		int[] is_2949_ = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
		if (is_2949_ != null) {
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					int i_2950_ = anInt8864;
					while (i_2950_ < 0) {
						int i_2951_ = i_2950_ + i_2948_;
						if (i_2951_ >= 0) {
							if (i_2951_ >= is.length)
								break;
							int i_2952_ = anInt8870;
							int i_2953_ = anInt8873;
							int i_2954_ = anInt8874;
							int i_2955_ = anInt8862;
							if (i_2953_ >= 0 && i_2954_ >= 0 && (i_2953_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12)) < 0 && (i_2954_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12)) < 0) {
								int i_2956_ = is[i_2951_] - i;
								int i_2957_ = -is_2947_[i_2951_];
								int i_2958_ = i_2956_ - (i_2952_ - anInt8870);
								if (i_2958_ > 0) {
									i_2952_ += i_2958_;
									i_2955_ += i_2958_;
									i_2953_ += anInt8865 * i_2958_;
									i_2954_ += anInt8868 * i_2958_;
								} else
									i_2957_ -= i_2958_;
								if (i_2955_ < i_2957_)
									i_2955_ = i_2957_;
								for (/**/; i_2955_ < 0; i_2955_++) {
									int i_2959_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(((i_2954_ >> 12) * (((Class160_Sub1_Sub2) this).anInt8851)) + (i_2953_ >> 12))]);
									if (i_2959_ != 0)
										is_2949_[i_2952_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2959_ & 0xff]);
									else
										i_2952_++;
								}
							}
						}
						i_2950_++;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_2960_ = anInt8864;
					while (i_2960_ < 0) {
						int i_2961_ = i_2960_ + i_2948_;
						if (i_2961_ >= 0) {
							if (i_2961_ >= is.length)
								break;
							int i_2962_ = anInt8870;
							int i_2963_ = anInt8873;
							int i_2964_ = anInt8874 + anInt8866;
							int i_2965_ = anInt8862;
							if (i_2963_ >= 0 && (i_2963_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12)) < 0) {
								int i_2966_;
								if ((i_2966_ = i_2964_ - ((((Class160_Sub1_Sub2) this).anInt8867) << 12)) >= 0) {
									i_2966_ = (anInt8868 - i_2966_) / anInt8868;
									i_2965_ += i_2966_;
									i_2964_ += anInt8868 * i_2966_;
									i_2962_ += i_2966_;
								}
								if ((i_2966_ = (i_2964_ - anInt8868) / anInt8868) > i_2965_)
									i_2965_ = i_2966_;
								int i_2967_ = is[i_2961_] - i;
								int i_2968_ = -is_2947_[i_2961_];
								int i_2969_ = i_2967_ - (i_2962_ - anInt8870);
								if (i_2969_ > 0) {
									i_2962_ += i_2969_;
									i_2965_ += i_2969_;
									i_2963_ += anInt8865 * i_2969_;
									i_2964_ += anInt8868 * i_2969_;
								} else
									i_2968_ -= i_2969_;
								if (i_2965_ < i_2968_)
									i_2965_ = i_2968_;
								for (/**/; i_2965_ < 0; i_2965_++) {
									int i_2970_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(((i_2964_ >> 12) * (((Class160_Sub1_Sub2) this).anInt8851)) + (i_2963_ >> 12))]);
									if (i_2970_ != 0)
										is_2949_[i_2962_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2970_ & 0xff]);
									else
										i_2962_++;
									i_2964_ += anInt8868;
								}
							}
						}
						i_2960_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				} else {
					int i_2971_ = anInt8864;
					while (i_2971_ < 0) {
						int i_2972_ = i_2971_ + i_2948_;
						if (i_2972_ >= 0) {
							if (i_2972_ >= is.length)
								break;
							int i_2973_ = anInt8870;
							int i_2974_ = anInt8873;
							int i_2975_ = anInt8874 + anInt8866;
							int i_2976_ = anInt8862;
							if (i_2974_ >= 0 && (i_2974_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12)) < 0) {
								if (i_2975_ < 0) {
									int i_2977_ = ((anInt8868 - 1 - i_2975_) / anInt8868);
									i_2976_ += i_2977_;
									i_2975_ += anInt8868 * i_2977_;
									i_2973_ += i_2977_;
								}
								int i_2978_;
								if ((i_2978_ = (1 + i_2975_ - ((((Class160_Sub1_Sub2) this).anInt8867) << 12) - anInt8868) / anInt8868) > i_2976_)
									i_2976_ = i_2978_;
								int i_2979_ = is[i_2972_] - i;
								int i_2980_ = -is_2947_[i_2972_];
								int i_2981_ = i_2979_ - (i_2973_ - anInt8870);
								if (i_2981_ > 0) {
									i_2973_ += i_2981_;
									i_2976_ += i_2981_;
									i_2974_ += anInt8865 * i_2981_;
									i_2975_ += anInt8868 * i_2981_;
								} else
									i_2980_ -= i_2981_;
								if (i_2976_ < i_2980_)
									i_2976_ = i_2980_;
								for (/**/; i_2976_ < 0; i_2976_++) {
									int i_2982_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(((i_2975_ >> 12) * (((Class160_Sub1_Sub2) this).anInt8851)) + (i_2974_ >> 12))]);
									if (i_2982_ != 0)
										is_2949_[i_2973_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2982_ & 0xff]);
									else
										i_2973_++;
									i_2975_ += anInt8868;
								}
							}
						}
						i_2971_++;
						anInt8873 += anInt8869;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					int i_2983_ = anInt8864;
					while (i_2983_ < 0) {
						int i_2984_ = i_2983_ + i_2948_;
						if (i_2984_ >= 0) {
							if (i_2984_ >= is.length)
								break;
							int i_2985_ = anInt8870;
							int i_2986_ = anInt8873 + anInt8858;
							int i_2987_ = anInt8874;
							int i_2988_ = anInt8862;
							if (i_2987_ >= 0 && (i_2987_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12)) < 0) {
								int i_2989_;
								if ((i_2989_ = i_2986_ - ((((Class160_Sub1_Sub2) this).anInt8851) << 12)) >= 0) {
									i_2989_ = (anInt8865 - i_2989_) / anInt8865;
									i_2988_ += i_2989_;
									i_2986_ += anInt8865 * i_2989_;
									i_2985_ += i_2989_;
								}
								if ((i_2989_ = (i_2986_ - anInt8865) / anInt8865) > i_2988_)
									i_2988_ = i_2989_;
								int i_2990_ = is[i_2984_] - i;
								int i_2991_ = -is_2947_[i_2984_];
								int i_2992_ = i_2990_ - (i_2985_ - anInt8870);
								if (i_2992_ > 0) {
									i_2985_ += i_2992_;
									i_2988_ += i_2992_;
									i_2986_ += anInt8865 * i_2992_;
									i_2987_ += anInt8868 * i_2992_;
								} else
									i_2991_ -= i_2992_;
								if (i_2988_ < i_2991_)
									i_2988_ = i_2991_;
								for (/**/; i_2988_ < 0; i_2988_++) {
									int i_2993_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(((i_2987_ >> 12) * (((Class160_Sub1_Sub2) this).anInt8851)) + (i_2986_ >> 12))]);
									if (i_2993_ != 0)
										is_2949_[i_2985_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_2993_ & 0xff]);
									else
										i_2985_++;
									i_2986_ += anInt8865;
								}
							}
						}
						i_2983_++;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else if (anInt8868 < 0) {
					int i_2994_ = anInt8864;
					while (i_2994_ < 0) {
						int i_2995_ = i_2994_ + i_2948_;
						if (i_2995_ >= 0) {
							if (i_2995_ >= is.length)
								break;
							int i_2996_ = anInt8870;
							int i_2997_ = anInt8873 + anInt8858;
							int i_2998_ = anInt8874 + anInt8866;
							int i_2999_ = anInt8862;
							int i_3000_;
							if ((i_3000_ = (i_2997_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12))) >= 0) {
								i_3000_ = (anInt8865 - i_3000_) / anInt8865;
								i_2999_ += i_3000_;
								i_2997_ += anInt8865 * i_3000_;
								i_2998_ += anInt8868 * i_3000_;
								i_2996_ += i_3000_;
							}
							if ((i_3000_ = (i_2997_ - anInt8865) / anInt8865) > i_2999_)
								i_2999_ = i_3000_;
							if ((i_3000_ = (i_2998_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12))) >= 0) {
								i_3000_ = (anInt8868 - i_3000_) / anInt8868;
								i_2999_ += i_3000_;
								i_2997_ += anInt8865 * i_3000_;
								i_2998_ += anInt8868 * i_3000_;
								i_2996_ += i_3000_;
							}
							if ((i_3000_ = (i_2998_ - anInt8868) / anInt8868) > i_2999_)
								i_2999_ = i_3000_;
							int i_3001_ = is[i_2995_] - i;
							int i_3002_ = -is_2947_[i_2995_];
							int i_3003_ = i_3001_ - (i_2996_ - anInt8870);
							if (i_3003_ > 0) {
								i_2996_ += i_3003_;
								i_2999_ += i_3003_;
								i_2997_ += anInt8865 * i_3003_;
								i_2998_ += anInt8868 * i_3003_;
							} else
								i_3002_ -= i_3003_;
							if (i_2999_ < i_3002_)
								i_2999_ = i_3002_;
							for (/**/; i_2999_ < 0; i_2999_++) {
								int i_3004_ = (((Class160_Sub1_Sub2) this).aByteArray10221[((i_2998_ >> 12) * (((Class160_Sub1_Sub2) this).anInt8851)) + (i_2997_ >> 12)]);
								if (i_3004_ != 0)
									is_2949_[i_2996_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3004_ & 0xff]);
								else
									i_2996_++;
								i_2997_ += anInt8865;
								i_2998_ += anInt8868;
							}
						}
						i_2994_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				} else {
					int i_3005_ = anInt8864;
					while (i_3005_ < 0) {
						int i_3006_ = i_3005_ + i_2948_;
						if (i_3006_ >= 0) {
							if (i_3006_ >= is.length)
								break;
							int i_3007_ = anInt8870;
							int i_3008_ = anInt8873 + anInt8858;
							int i_3009_ = anInt8874 + anInt8866;
							int i_3010_ = anInt8862;
							int i_3011_;
							if ((i_3011_ = (i_3008_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12))) >= 0) {
								i_3011_ = (anInt8865 - i_3011_) / anInt8865;
								i_3010_ += i_3011_;
								i_3008_ += anInt8865 * i_3011_;
								i_3009_ += anInt8868 * i_3011_;
								i_3007_ += i_3011_;
							}
							if ((i_3011_ = (i_3008_ - anInt8865) / anInt8865) > i_3010_)
								i_3010_ = i_3011_;
							if (i_3009_ < 0) {
								i_3011_ = (anInt8868 - 1 - i_3009_) / anInt8868;
								i_3010_ += i_3011_;
								i_3008_ += anInt8865 * i_3011_;
								i_3009_ += anInt8868 * i_3011_;
								i_3007_ += i_3011_;
							}
							if ((i_3011_ = (1 + i_3009_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_3010_)
								i_3010_ = i_3011_;
							int i_3012_ = is[i_3006_] - i;
							int i_3013_ = -is_2947_[i_3006_];
							int i_3014_ = i_3012_ - (i_3007_ - anInt8870);
							if (i_3014_ > 0) {
								i_3007_ += i_3014_;
								i_3010_ += i_3014_;
								i_3008_ += anInt8865 * i_3014_;
								i_3009_ += anInt8868 * i_3014_;
							} else
								i_3013_ -= i_3014_;
							if (i_3010_ < i_3013_)
								i_3010_ = i_3013_;
							for (/**/; i_3010_ < 0; i_3010_++) {
								int i_3015_ = (((Class160_Sub1_Sub2) this).aByteArray10221[((i_3009_ >> 12) * (((Class160_Sub1_Sub2) this).anInt8851)) + (i_3008_ >> 12)]);
								if (i_3015_ != 0)
									is_2949_[i_3007_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3015_ & 0xff]);
								else
									i_3007_++;
								i_3008_ += anInt8865;
								i_3009_ += anInt8868;
							}
						}
						i_3005_++;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
						anInt8870 += anInt8850;
					}
				}
			} else if (anInt8868 == 0) {
				int i_3016_ = anInt8864;
				while (i_3016_ < 0) {
					int i_3017_ = i_3016_ + i_2948_;
					if (i_3017_ >= 0) {
						if (i_3017_ >= is.length)
							break;
						int i_3018_ = anInt8870;
						int i_3019_ = anInt8873 + anInt8858;
						int i_3020_ = anInt8874;
						int i_3021_ = anInt8862;
						if (i_3020_ >= 0 && i_3020_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) < 0) {
							if (i_3019_ < 0) {
								int i_3022_ = (anInt8865 - 1 - i_3019_) / anInt8865;
								i_3021_ += i_3022_;
								i_3019_ += anInt8865 * i_3022_;
								i_3018_ += i_3022_;
							}
							int i_3023_;
							if ((i_3023_ = (1 + i_3019_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_3021_)
								i_3021_ = i_3023_;
							int i_3024_ = is[i_3017_] - i;
							int i_3025_ = -is_2947_[i_3017_];
							int i_3026_ = i_3024_ - (i_3018_ - anInt8870);
							if (i_3026_ > 0) {
								i_3018_ += i_3026_;
								i_3021_ += i_3026_;
								i_3019_ += anInt8865 * i_3026_;
								i_3020_ += anInt8868 * i_3026_;
							} else
								i_3025_ -= i_3026_;
							if (i_3021_ < i_3025_)
								i_3021_ = i_3025_;
							for (/**/; i_3021_ < 0; i_3021_++) {
								int i_3027_ = (((Class160_Sub1_Sub2) this).aByteArray10221[((i_3020_ >> 12) * (((Class160_Sub1_Sub2) this).anInt8851)) + (i_3019_ >> 12)]);
								if (i_3027_ != 0)
									is_2949_[i_3018_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3027_ & 0xff]);
								else
									i_3018_++;
								i_3019_ += anInt8865;
							}
						}
					}
					i_3016_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else if (anInt8868 < 0) {
				int i_3028_ = anInt8864;
				while (i_3028_ < 0) {
					int i_3029_ = i_3028_ + i_2948_;
					if (i_3029_ >= 0) {
						if (i_3029_ >= is.length)
							break;
						int i_3030_ = anInt8870;
						int i_3031_ = anInt8873 + anInt8858;
						int i_3032_ = anInt8874 + anInt8866;
						int i_3033_ = anInt8862;
						if (i_3031_ < 0) {
							int i_3034_ = (anInt8865 - 1 - i_3031_) / anInt8865;
							i_3033_ += i_3034_;
							i_3031_ += anInt8865 * i_3034_;
							i_3032_ += anInt8868 * i_3034_;
							i_3030_ += i_3034_;
						}
						int i_3035_;
						if ((i_3035_ = (1 + i_3031_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_3033_)
							i_3033_ = i_3035_;
						if ((i_3035_ = i_3032_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12)) >= 0) {
							i_3035_ = (anInt8868 - i_3035_) / anInt8868;
							i_3033_ += i_3035_;
							i_3031_ += anInt8865 * i_3035_;
							i_3032_ += anInt8868 * i_3035_;
							i_3030_ += i_3035_;
						}
						if ((i_3035_ = (i_3032_ - anInt8868) / anInt8868) > i_3033_)
							i_3033_ = i_3035_;
						int i_3036_ = is[i_3029_] - i;
						int i_3037_ = -is_2947_[i_3029_];
						int i_3038_ = i_3036_ - (i_3030_ - anInt8870);
						if (i_3038_ > 0) {
							i_3030_ += i_3038_;
							i_3033_ += i_3038_;
							i_3031_ += anInt8865 * i_3038_;
							i_3032_ += anInt8868 * i_3038_;
						} else
							i_3037_ -= i_3038_;
						if (i_3033_ < i_3037_)
							i_3033_ = i_3037_;
						for (/**/; i_3033_ < 0; i_3033_++) {
							int i_3039_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(((i_3032_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_3031_ >> 12))]);
							if (i_3039_ != 0)
								is_2949_[i_3030_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3039_ & 0xff]);
							else
								i_3030_++;
							i_3031_ += anInt8865;
							i_3032_ += anInt8868;
						}
					}
					i_3028_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			} else {
				int i_3040_ = anInt8864;
				while (i_3040_ < 0) {
					int i_3041_ = i_3040_ + i_2948_;
					if (i_3041_ >= 0) {
						if (i_3041_ >= is.length)
							break;
						int i_3042_ = anInt8870;
						int i_3043_ = anInt8873 + anInt8858;
						int i_3044_ = anInt8874 + anInt8866;
						int i_3045_ = anInt8862;
						if (i_3043_ < 0) {
							int i_3046_ = (anInt8865 - 1 - i_3043_) / anInt8865;
							i_3045_ += i_3046_;
							i_3043_ += anInt8865 * i_3046_;
							i_3044_ += anInt8868 * i_3046_;
							i_3042_ += i_3046_;
						}
						int i_3047_;
						if ((i_3047_ = (1 + i_3043_ - (((Class160_Sub1_Sub2) this).anInt8851 << 12) - anInt8865) / anInt8865) > i_3045_)
							i_3045_ = i_3047_;
						if (i_3044_ < 0) {
							i_3047_ = (anInt8868 - 1 - i_3044_) / anInt8868;
							i_3045_ += i_3047_;
							i_3043_ += anInt8865 * i_3047_;
							i_3044_ += anInt8868 * i_3047_;
							i_3042_ += i_3047_;
						}
						if ((i_3047_ = (1 + i_3044_ - (((Class160_Sub1_Sub2) this).anInt8867 << 12) - anInt8868) / anInt8868) > i_3045_)
							i_3045_ = i_3047_;
						int i_3048_ = is[i_3041_] - i;
						int i_3049_ = -is_2947_[i_3041_];
						int i_3050_ = i_3048_ - (i_3042_ - anInt8870);
						if (i_3050_ > 0) {
							i_3042_ += i_3050_;
							i_3045_ += i_3050_;
							i_3043_ += anInt8865 * i_3050_;
							i_3044_ += anInt8868 * i_3050_;
						} else
							i_3049_ -= i_3050_;
						if (i_3045_ < i_3049_)
							i_3045_ = i_3049_;
						for (/**/; i_3045_ < 0; i_3045_++) {
							int i_3051_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(((i_3044_ >> 12) * ((Class160_Sub1_Sub2) this).anInt8851) + (i_3043_ >> 12))]);
							if (i_3051_ != 0)
								is_2949_[i_3042_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3051_ & 0xff]);
							else
								i_3042_++;
							i_3043_ += anInt8865;
							i_3044_ += anInt8868;
						}
					}
					i_3040_++;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			}
		}
	}

	public void method2749(int i, int i_3052_, int i_3053_, int i_3054_, int i_3055_) {
		if (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			int i_3056_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			i += ((Class160_Sub1_Sub2) this).anInt8853;
			i_3052_ += ((Class160_Sub1_Sub2) this).anInt8854;
			int i_3057_ = i_3052_ * i_3056_ + i;
			int i_3058_ = 0;
			int i_3059_ = ((Class160_Sub1_Sub2) this).anInt8867;
			int i_3060_ = ((Class160_Sub1_Sub2) this).anInt8851;
			int i_3061_ = i_3056_ - i_3060_;
			int i_3062_ = 0;
			if (i_3052_ < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_3063_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_3052_);
				i_3059_ -= i_3063_;
				i_3052_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_3058_ += i_3063_ * i_3060_;
				i_3057_ += i_3063_ * i_3056_;
			}
			if (i_3052_ + i_3059_ > (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_3059_ -= (i_3052_ + i_3059_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_3064_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_3060_ -= i_3064_;
				i = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_3058_ += i_3064_;
				i_3057_ += i_3064_;
				i_3062_ += i_3064_;
				i_3061_ += i_3064_;
			}
			if (i + i_3060_ > (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_3065_ = (i + i_3060_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_3060_ -= i_3065_;
				i_3062_ += i_3065_;
				i_3061_ += i_3065_;
			}
			if (i_3060_ > 0 && i_3059_ > 0) {
				if (i_3055_ == 0) {
					if (i_3053_ == 1) {
						for (int i_3066_ = -i_3059_; i_3066_ < 0; i_3066_++) {
							int i_3067_ = i_3057_ + i_3060_ - 3;
							while (i_3057_ < i_3067_) {
								is[i_3057_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]) & 0xff]);
								is[i_3057_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]) & 0xff]);
								is[i_3057_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]) & 0xff]);
								is[i_3057_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]) & 0xff]);
							}
							i_3067_ += 3;
							while (i_3057_ < i_3067_)
								is[i_3057_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]) & 0xff]);
							i_3057_ += i_3061_;
							i_3058_ += i_3062_;
						}
					} else if (i_3053_ == 0) {
						int i_3068_ = (i_3054_ & 0xff0000) >> 16;
						int i_3069_ = (i_3054_ & 0xff00) >> 8;
						int i_3070_ = i_3054_ & 0xff;
						for (int i_3071_ = -i_3059_; i_3071_ < 0; i_3071_++) {
							for (int i_3072_ = -i_3060_; i_3072_ < 0; i_3072_++) {
								int i_3073_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]) & 0xff]);
								int i_3074_ = ((i_3073_ & 0xff0000) * i_3068_ & ~0xffffff);
								int i_3075_ = (i_3073_ & 0xff00) * i_3069_ & 0xff0000;
								int i_3076_ = (i_3073_ & 0xff) * i_3070_ & 0xff00;
								is[i_3057_++] = (i_3074_ | i_3075_ | i_3076_) >>> 8;
							}
							i_3057_ += i_3061_;
							i_3058_ += i_3062_;
						}
					} else if (i_3053_ == 3) {
						for (int i_3077_ = -i_3059_; i_3077_ < 0; i_3077_++) {
							for (int i_3078_ = -i_3060_; i_3078_ < 0; i_3078_++) {
								int i_3079_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]) & 0xff]);
								int i_3080_ = i_3079_ + i_3054_;
								int i_3081_ = ((i_3079_ & 0xff00ff) + (i_3054_ & 0xff00ff));
								int i_3082_ = ((i_3081_ & 0x1000100) + (i_3080_ - i_3081_ & 0x10000));
								is[i_3057_++] = i_3080_ - i_3082_ | i_3082_ - (i_3082_ >>> 8);
							}
							i_3057_ += i_3061_;
							i_3058_ += i_3062_;
						}
					} else if (i_3053_ == 2) {
						int i_3083_ = i_3054_ >>> 24;
						int i_3084_ = 256 - i_3083_;
						int i_3085_ = (i_3054_ & 0xff00ff) * i_3084_ & ~0xff00ff;
						int i_3086_ = (i_3054_ & 0xff00) * i_3084_ & 0xff0000;
						i_3054_ = (i_3085_ | i_3086_) >>> 8;
						for (int i_3087_ = -i_3059_; i_3087_ < 0; i_3087_++) {
							for (int i_3088_ = -i_3060_; i_3088_ < 0; i_3088_++) {
								int i_3089_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]) & 0xff]);
								i_3085_ = ((i_3089_ & 0xff00ff) * i_3083_ & ~0xff00ff);
								i_3086_ = (i_3089_ & 0xff00) * i_3083_ & 0xff0000;
								is[i_3057_++] = ((i_3085_ | i_3086_) >>> 8) + i_3054_;
							}
							i_3057_ += i_3061_;
							i_3058_ += i_3062_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3055_ == 1) {
					if (i_3053_ == 1) {
						for (int i_3090_ = -i_3059_; i_3090_ < 0; i_3090_++) {
							for (int i_3091_ = -i_3060_; i_3091_ < 0; i_3091_++) {
								int i_3092_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]);
								if (i_3092_ != 0) {
									int i_3093_ = ((((Class160_Sub1_Sub2) this).anIntArray10220[i_3092_ & 0xff]) | ~0xffffff);
									int i_3094_ = 255;
									int i_3095_ = 0;
									int i_3096_ = is[i_3057_];
									is[i_3057_++] = (((((i_3093_ & 0xff00ff) * i_3094_ + (i_3096_ & 0xff00ff) * i_3095_) & ~0xff00ff) >> 8) + (((((i_3093_ & ~0xff00ff) >>> 8) * i_3094_) + (((i_3096_ & ~0xff00ff) >>> 8) * i_3095_)) & ~0xff00ff));
								} else
									i_3057_++;
							}
							i_3057_ += i_3061_;
							i_3058_ += i_3062_;
						}
					} else if (i_3053_ == 0) {
						if ((i_3054_ & 0xffffff) == 16777215) {
							int i_3097_ = i_3054_ >>> 24;
							int i_3098_ = 256 - i_3097_;
							for (int i_3099_ = -i_3059_; i_3099_ < 0; i_3099_++) {
								for (int i_3100_ = -i_3060_; i_3100_ < 0; i_3100_++) {
									int i_3101_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]);
									if (i_3101_ != 0) {
										int i_3102_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3101_ & 0xff]);
										int i_3103_ = is[i_3057_];
										is[i_3057_++] = ((((i_3102_ & 0xff00ff) * i_3097_ + ((i_3103_ & 0xff00ff) * i_3098_)) & ~0xff00ff) + (((i_3102_ & 0xff00) * i_3097_ + ((i_3103_ & 0xff00) * i_3098_)) & 0xff0000)) >> 8;
									} else
										i_3057_++;
								}
								i_3057_ += i_3061_;
								i_3058_ += i_3062_;
							}
						} else {
							int i_3104_ = (i_3054_ & 0xff0000) >> 16;
							int i_3105_ = (i_3054_ & 0xff00) >> 8;
							int i_3106_ = i_3054_ & 0xff;
							int i_3107_ = i_3054_ >>> 24;
							int i_3108_ = 256 - i_3107_;
							for (int i_3109_ = -i_3059_; i_3109_ < 0; i_3109_++) {
								for (int i_3110_ = -i_3060_; i_3110_ < 0; i_3110_++) {
									int i_3111_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]);
									if (i_3111_ != 0) {
										int i_3112_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3111_ & 0xff]);
										if (i_3107_ != 255) {
											int i_3113_ = (((i_3112_ & 0xff0000) * i_3104_) & ~0xffffff);
											int i_3114_ = ((i_3112_ & 0xff00) * i_3105_ & 0xff0000);
											int i_3115_ = ((i_3112_ & 0xff) * i_3106_ & 0xff00);
											i_3112_ = (i_3113_ | i_3114_ | i_3115_) >>> 8;
											int i_3116_ = is[i_3057_];
											is[i_3057_++] = (((((i_3112_ & 0xff00ff) * i_3107_) + ((i_3116_ & 0xff00ff) * i_3108_)) & ~0xff00ff) + ((((i_3112_ & 0xff00) * i_3107_) + ((i_3116_ & 0xff00) * i_3108_)) & 0xff0000)) >> 8;
										} else {
											int i_3117_ = (((i_3112_ & 0xff0000) * i_3104_) & ~0xffffff);
											int i_3118_ = ((i_3112_ & 0xff00) * i_3105_ & 0xff0000);
											int i_3119_ = ((i_3112_ & 0xff) * i_3106_ & 0xff00);
											is[i_3057_++] = (i_3117_ | i_3118_ | i_3119_) >>> 8;
										}
									} else
										i_3057_++;
								}
								i_3057_ += i_3061_;
								i_3058_ += i_3062_;
							}
						}
					} else if (i_3053_ == 3) {
						int i_3120_ = i_3054_ >>> 24;
						int i_3121_ = 256 - i_3120_;
						for (int i_3122_ = -i_3059_; i_3122_ < 0; i_3122_++) {
							for (int i_3123_ = -i_3060_; i_3123_ < 0; i_3123_++) {
								byte i_3124_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]);
								int i_3125_ = (i_3124_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_3124_]) : 0);
								int i_3126_ = i_3125_ + i_3054_;
								int i_3127_ = ((i_3125_ & 0xff00ff) + (i_3054_ & 0xff00ff));
								int i_3128_ = ((i_3127_ & 0x1000100) + (i_3126_ - i_3127_ & 0x10000));
								i_3128_ = i_3126_ - i_3128_ | i_3128_ - (i_3128_ >>> 8);
								if (i_3125_ == 0 && i_3120_ != 255) {
									i_3125_ = i_3128_;
									i_3128_ = is[i_3057_];
									i_3128_ = ((((i_3125_ & 0xff00ff) * i_3120_ + (i_3128_ & 0xff00ff) * i_3121_) & ~0xff00ff) + (((i_3125_ & 0xff00) * i_3120_ + (i_3128_ & 0xff00) * i_3121_) & 0xff0000)) >> 8;
								}
								is[i_3057_++] = i_3128_;
							}
							i_3057_ += i_3061_;
							i_3058_ += i_3062_;
						}
					} else if (i_3053_ == 2) {
						int i_3129_ = i_3054_ >>> 24;
						int i_3130_ = 256 - i_3129_;
						int i_3131_ = (i_3054_ & 0xff00ff) * i_3130_ & ~0xff00ff;
						int i_3132_ = (i_3054_ & 0xff00) * i_3130_ & 0xff0000;
						i_3054_ = (i_3131_ | i_3132_) >>> 8;
						for (int i_3133_ = -i_3059_; i_3133_ < 0; i_3133_++) {
							for (int i_3134_ = -i_3060_; i_3134_ < 0; i_3134_++) {
								int i_3135_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]);
								if (i_3135_ != 0) {
									int i_3136_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3135_ & 0xff]);
									i_3131_ = ((i_3136_ & 0xff00ff) * i_3129_ & ~0xff00ff);
									i_3132_ = ((i_3136_ & 0xff00) * i_3129_ & 0xff0000);
									is[i_3057_++] = ((i_3131_ | i_3132_) >>> 8) + i_3054_;
								} else
									i_3057_++;
							}
							i_3057_ += i_3061_;
							i_3058_ += i_3062_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3055_ == 2) {
					if (i_3053_ == 1) {
						for (int i_3137_ = -i_3059_; i_3137_ < 0; i_3137_++) {
							for (int i_3138_ = -i_3060_; i_3138_ < 0; i_3138_++) {
								int i_3139_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]);
								if (i_3139_ != 0) {
									int i_3140_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3139_ & 0xff]);
									int i_3141_ = is[i_3057_];
									int i_3142_ = i_3140_ + i_3141_;
									int i_3143_ = ((i_3140_ & 0xff00ff) + (i_3141_ & 0xff00ff));
									i_3141_ = ((i_3143_ & 0x1000100) + (i_3142_ - i_3143_ & 0x10000));
									is[i_3057_++] = (i_3142_ - i_3141_ | i_3141_ - (i_3141_ >>> 8));
								} else
									i_3057_++;
							}
							i_3057_ += i_3061_;
							i_3058_ += i_3062_;
						}
					} else if (i_3053_ == 0) {
						int i_3144_ = (i_3054_ & 0xff0000) >> 16;
						int i_3145_ = (i_3054_ & 0xff00) >> 8;
						int i_3146_ = i_3054_ & 0xff;
						for (int i_3147_ = -i_3059_; i_3147_ < 0; i_3147_++) {
							for (int i_3148_ = -i_3060_; i_3148_ < 0; i_3148_++) {
								int i_3149_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]);
								if (i_3149_ != 0) {
									int i_3150_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3149_ & 0xff]);
									int i_3151_ = ((i_3150_ & 0xff0000) * i_3144_ & ~0xffffff);
									int i_3152_ = ((i_3150_ & 0xff00) * i_3145_ & 0xff0000);
									int i_3153_ = (i_3150_ & 0xff) * i_3146_ & 0xff00;
									i_3150_ = (i_3151_ | i_3152_ | i_3153_) >>> 8;
									int i_3154_ = is[i_3057_];
									int i_3155_ = i_3150_ + i_3154_;
									int i_3156_ = ((i_3150_ & 0xff00ff) + (i_3154_ & 0xff00ff));
									i_3154_ = ((i_3156_ & 0x1000100) + (i_3155_ - i_3156_ & 0x10000));
									is[i_3057_++] = (i_3155_ - i_3154_ | i_3154_ - (i_3154_ >>> 8));
								} else
									i_3057_++;
							}
							i_3057_ += i_3061_;
							i_3058_ += i_3062_;
						}
					} else if (i_3053_ == 3) {
						for (int i_3157_ = -i_3059_; i_3157_ < 0; i_3157_++) {
							for (int i_3158_ = -i_3060_; i_3158_ < 0; i_3158_++) {
								byte i_3159_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]);
								int i_3160_ = (i_3159_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_3159_]) : 0);
								int i_3161_ = i_3160_ + i_3054_;
								int i_3162_ = ((i_3160_ & 0xff00ff) + (i_3054_ & 0xff00ff));
								int i_3163_ = ((i_3162_ & 0x1000100) + (i_3161_ - i_3162_ & 0x10000));
								i_3160_ = i_3161_ - i_3163_ | i_3163_ - (i_3163_ >>> 8);
								i_3163_ = is[i_3057_];
								i_3161_ = i_3160_ + i_3163_;
								i_3162_ = (i_3160_ & 0xff00ff) + (i_3163_ & 0xff00ff);
								i_3163_ = ((i_3162_ & 0x1000100) + (i_3161_ - i_3162_ & 0x10000));
								is[i_3057_++] = i_3161_ - i_3163_ | i_3163_ - (i_3163_ >>> 8);
							}
							i_3057_ += i_3061_;
							i_3058_ += i_3062_;
						}
					} else if (i_3053_ == 2) {
						int i_3164_ = i_3054_ >>> 24;
						int i_3165_ = 256 - i_3164_;
						int i_3166_ = (i_3054_ & 0xff00ff) * i_3165_ & ~0xff00ff;
						int i_3167_ = (i_3054_ & 0xff00) * i_3165_ & 0xff0000;
						i_3054_ = (i_3166_ | i_3167_) >>> 8;
						for (int i_3168_ = -i_3059_; i_3168_ < 0; i_3168_++) {
							for (int i_3169_ = -i_3060_; i_3169_ < 0; i_3169_++) {
								int i_3170_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3058_++]);
								if (i_3170_ != 0) {
									int i_3171_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3170_ & 0xff]);
									i_3166_ = ((i_3171_ & 0xff00ff) * i_3164_ & ~0xff00ff);
									i_3167_ = ((i_3171_ & 0xff00) * i_3164_ & 0xff0000);
									i_3171_ = (((i_3166_ | i_3167_) >>> 8) + i_3054_);
									int i_3172_ = is[i_3057_];
									int i_3173_ = i_3171_ + i_3172_;
									int i_3174_ = ((i_3171_ & 0xff00ff) + (i_3172_ & 0xff00ff));
									i_3172_ = ((i_3174_ & 0x1000100) + (i_3173_ - i_3174_ & 0x10000));
									is[i_3057_++] = (i_3173_ - i_3172_ | i_3172_ - (i_3172_ >>> 8));
								} else
									i_3057_++;
							}
							i_3057_ += i_3061_;
							i_3058_ += i_3062_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2778(int i, int i_3175_, int i_3176_, int i_3177_, int i_3178_) {
		if (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			int i_3179_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			i += ((Class160_Sub1_Sub2) this).anInt8853;
			i_3175_ += ((Class160_Sub1_Sub2) this).anInt8854;
			int i_3180_ = i_3175_ * i_3179_ + i;
			int i_3181_ = 0;
			int i_3182_ = ((Class160_Sub1_Sub2) this).anInt8867;
			int i_3183_ = ((Class160_Sub1_Sub2) this).anInt8851;
			int i_3184_ = i_3179_ - i_3183_;
			int i_3185_ = 0;
			if (i_3175_ < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_3186_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_3175_);
				i_3182_ -= i_3186_;
				i_3175_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_3181_ += i_3186_ * i_3183_;
				i_3180_ += i_3186_ * i_3179_;
			}
			if (i_3175_ + i_3182_ > (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_3182_ -= (i_3175_ + i_3182_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_3187_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_3183_ -= i_3187_;
				i = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_3181_ += i_3187_;
				i_3180_ += i_3187_;
				i_3185_ += i_3187_;
				i_3184_ += i_3187_;
			}
			if (i + i_3183_ > (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_3188_ = (i + i_3183_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_3183_ -= i_3188_;
				i_3185_ += i_3188_;
				i_3184_ += i_3188_;
			}
			if (i_3183_ > 0 && i_3182_ > 0) {
				if (i_3178_ == 0) {
					if (i_3176_ == 1) {
						for (int i_3189_ = -i_3182_; i_3189_ < 0; i_3189_++) {
							int i_3190_ = i_3180_ + i_3183_ - 3;
							while (i_3180_ < i_3190_) {
								is[i_3180_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]) & 0xff]);
								is[i_3180_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]) & 0xff]);
								is[i_3180_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]) & 0xff]);
								is[i_3180_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]) & 0xff]);
							}
							i_3190_ += 3;
							while (i_3180_ < i_3190_)
								is[i_3180_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]) & 0xff]);
							i_3180_ += i_3184_;
							i_3181_ += i_3185_;
						}
					} else if (i_3176_ == 0) {
						int i_3191_ = (i_3177_ & 0xff0000) >> 16;
						int i_3192_ = (i_3177_ & 0xff00) >> 8;
						int i_3193_ = i_3177_ & 0xff;
						for (int i_3194_ = -i_3182_; i_3194_ < 0; i_3194_++) {
							for (int i_3195_ = -i_3183_; i_3195_ < 0; i_3195_++) {
								int i_3196_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]) & 0xff]);
								int i_3197_ = ((i_3196_ & 0xff0000) * i_3191_ & ~0xffffff);
								int i_3198_ = (i_3196_ & 0xff00) * i_3192_ & 0xff0000;
								int i_3199_ = (i_3196_ & 0xff) * i_3193_ & 0xff00;
								is[i_3180_++] = (i_3197_ | i_3198_ | i_3199_) >>> 8;
							}
							i_3180_ += i_3184_;
							i_3181_ += i_3185_;
						}
					} else if (i_3176_ == 3) {
						for (int i_3200_ = -i_3182_; i_3200_ < 0; i_3200_++) {
							for (int i_3201_ = -i_3183_; i_3201_ < 0; i_3201_++) {
								int i_3202_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]) & 0xff]);
								int i_3203_ = i_3202_ + i_3177_;
								int i_3204_ = ((i_3202_ & 0xff00ff) + (i_3177_ & 0xff00ff));
								int i_3205_ = ((i_3204_ & 0x1000100) + (i_3203_ - i_3204_ & 0x10000));
								is[i_3180_++] = i_3203_ - i_3205_ | i_3205_ - (i_3205_ >>> 8);
							}
							i_3180_ += i_3184_;
							i_3181_ += i_3185_;
						}
					} else if (i_3176_ == 2) {
						int i_3206_ = i_3177_ >>> 24;
						int i_3207_ = 256 - i_3206_;
						int i_3208_ = (i_3177_ & 0xff00ff) * i_3207_ & ~0xff00ff;
						int i_3209_ = (i_3177_ & 0xff00) * i_3207_ & 0xff0000;
						i_3177_ = (i_3208_ | i_3209_) >>> 8;
						for (int i_3210_ = -i_3182_; i_3210_ < 0; i_3210_++) {
							for (int i_3211_ = -i_3183_; i_3211_ < 0; i_3211_++) {
								int i_3212_ = (((Class160_Sub1_Sub2) this).anIntArray10220[(((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]) & 0xff]);
								i_3208_ = ((i_3212_ & 0xff00ff) * i_3206_ & ~0xff00ff);
								i_3209_ = (i_3212_ & 0xff00) * i_3206_ & 0xff0000;
								is[i_3180_++] = ((i_3208_ | i_3209_) >>> 8) + i_3177_;
							}
							i_3180_ += i_3184_;
							i_3181_ += i_3185_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3178_ == 1) {
					if (i_3176_ == 1) {
						for (int i_3213_ = -i_3182_; i_3213_ < 0; i_3213_++) {
							for (int i_3214_ = -i_3183_; i_3214_ < 0; i_3214_++) {
								int i_3215_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]);
								if (i_3215_ != 0) {
									int i_3216_ = ((((Class160_Sub1_Sub2) this).anIntArray10220[i_3215_ & 0xff]) | ~0xffffff);
									int i_3217_ = 255;
									int i_3218_ = 0;
									int i_3219_ = is[i_3180_];
									is[i_3180_++] = (((((i_3216_ & 0xff00ff) * i_3217_ + (i_3219_ & 0xff00ff) * i_3218_) & ~0xff00ff) >> 8) + (((((i_3216_ & ~0xff00ff) >>> 8) * i_3217_) + (((i_3219_ & ~0xff00ff) >>> 8) * i_3218_)) & ~0xff00ff));
								} else
									i_3180_++;
							}
							i_3180_ += i_3184_;
							i_3181_ += i_3185_;
						}
					} else if (i_3176_ == 0) {
						if ((i_3177_ & 0xffffff) == 16777215) {
							int i_3220_ = i_3177_ >>> 24;
							int i_3221_ = 256 - i_3220_;
							for (int i_3222_ = -i_3182_; i_3222_ < 0; i_3222_++) {
								for (int i_3223_ = -i_3183_; i_3223_ < 0; i_3223_++) {
									int i_3224_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]);
									if (i_3224_ != 0) {
										int i_3225_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3224_ & 0xff]);
										int i_3226_ = is[i_3180_];
										is[i_3180_++] = ((((i_3225_ & 0xff00ff) * i_3220_ + ((i_3226_ & 0xff00ff) * i_3221_)) & ~0xff00ff) + (((i_3225_ & 0xff00) * i_3220_ + ((i_3226_ & 0xff00) * i_3221_)) & 0xff0000)) >> 8;
									} else
										i_3180_++;
								}
								i_3180_ += i_3184_;
								i_3181_ += i_3185_;
							}
						} else {
							int i_3227_ = (i_3177_ & 0xff0000) >> 16;
							int i_3228_ = (i_3177_ & 0xff00) >> 8;
							int i_3229_ = i_3177_ & 0xff;
							int i_3230_ = i_3177_ >>> 24;
							int i_3231_ = 256 - i_3230_;
							for (int i_3232_ = -i_3182_; i_3232_ < 0; i_3232_++) {
								for (int i_3233_ = -i_3183_; i_3233_ < 0; i_3233_++) {
									int i_3234_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]);
									if (i_3234_ != 0) {
										int i_3235_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3234_ & 0xff]);
										if (i_3230_ != 255) {
											int i_3236_ = (((i_3235_ & 0xff0000) * i_3227_) & ~0xffffff);
											int i_3237_ = ((i_3235_ & 0xff00) * i_3228_ & 0xff0000);
											int i_3238_ = ((i_3235_ & 0xff) * i_3229_ & 0xff00);
											i_3235_ = (i_3236_ | i_3237_ | i_3238_) >>> 8;
											int i_3239_ = is[i_3180_];
											is[i_3180_++] = (((((i_3235_ & 0xff00ff) * i_3230_) + ((i_3239_ & 0xff00ff) * i_3231_)) & ~0xff00ff) + ((((i_3235_ & 0xff00) * i_3230_) + ((i_3239_ & 0xff00) * i_3231_)) & 0xff0000)) >> 8;
										} else {
											int i_3240_ = (((i_3235_ & 0xff0000) * i_3227_) & ~0xffffff);
											int i_3241_ = ((i_3235_ & 0xff00) * i_3228_ & 0xff0000);
											int i_3242_ = ((i_3235_ & 0xff) * i_3229_ & 0xff00);
											is[i_3180_++] = (i_3240_ | i_3241_ | i_3242_) >>> 8;
										}
									} else
										i_3180_++;
								}
								i_3180_ += i_3184_;
								i_3181_ += i_3185_;
							}
						}
					} else if (i_3176_ == 3) {
						int i_3243_ = i_3177_ >>> 24;
						int i_3244_ = 256 - i_3243_;
						for (int i_3245_ = -i_3182_; i_3245_ < 0; i_3245_++) {
							for (int i_3246_ = -i_3183_; i_3246_ < 0; i_3246_++) {
								byte i_3247_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]);
								int i_3248_ = (i_3247_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_3247_]) : 0);
								int i_3249_ = i_3248_ + i_3177_;
								int i_3250_ = ((i_3248_ & 0xff00ff) + (i_3177_ & 0xff00ff));
								int i_3251_ = ((i_3250_ & 0x1000100) + (i_3249_ - i_3250_ & 0x10000));
								i_3251_ = i_3249_ - i_3251_ | i_3251_ - (i_3251_ >>> 8);
								if (i_3248_ == 0 && i_3243_ != 255) {
									i_3248_ = i_3251_;
									i_3251_ = is[i_3180_];
									i_3251_ = ((((i_3248_ & 0xff00ff) * i_3243_ + (i_3251_ & 0xff00ff) * i_3244_) & ~0xff00ff) + (((i_3248_ & 0xff00) * i_3243_ + (i_3251_ & 0xff00) * i_3244_) & 0xff0000)) >> 8;
								}
								is[i_3180_++] = i_3251_;
							}
							i_3180_ += i_3184_;
							i_3181_ += i_3185_;
						}
					} else if (i_3176_ == 2) {
						int i_3252_ = i_3177_ >>> 24;
						int i_3253_ = 256 - i_3252_;
						int i_3254_ = (i_3177_ & 0xff00ff) * i_3253_ & ~0xff00ff;
						int i_3255_ = (i_3177_ & 0xff00) * i_3253_ & 0xff0000;
						i_3177_ = (i_3254_ | i_3255_) >>> 8;
						for (int i_3256_ = -i_3182_; i_3256_ < 0; i_3256_++) {
							for (int i_3257_ = -i_3183_; i_3257_ < 0; i_3257_++) {
								int i_3258_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]);
								if (i_3258_ != 0) {
									int i_3259_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3258_ & 0xff]);
									i_3254_ = ((i_3259_ & 0xff00ff) * i_3252_ & ~0xff00ff);
									i_3255_ = ((i_3259_ & 0xff00) * i_3252_ & 0xff0000);
									is[i_3180_++] = ((i_3254_ | i_3255_) >>> 8) + i_3177_;
								} else
									i_3180_++;
							}
							i_3180_ += i_3184_;
							i_3181_ += i_3185_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_3178_ == 2) {
					if (i_3176_ == 1) {
						for (int i_3260_ = -i_3182_; i_3260_ < 0; i_3260_++) {
							for (int i_3261_ = -i_3183_; i_3261_ < 0; i_3261_++) {
								int i_3262_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]);
								if (i_3262_ != 0) {
									int i_3263_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3262_ & 0xff]);
									int i_3264_ = is[i_3180_];
									int i_3265_ = i_3263_ + i_3264_;
									int i_3266_ = ((i_3263_ & 0xff00ff) + (i_3264_ & 0xff00ff));
									i_3264_ = ((i_3266_ & 0x1000100) + (i_3265_ - i_3266_ & 0x10000));
									is[i_3180_++] = (i_3265_ - i_3264_ | i_3264_ - (i_3264_ >>> 8));
								} else
									i_3180_++;
							}
							i_3180_ += i_3184_;
							i_3181_ += i_3185_;
						}
					} else if (i_3176_ == 0) {
						int i_3267_ = (i_3177_ & 0xff0000) >> 16;
						int i_3268_ = (i_3177_ & 0xff00) >> 8;
						int i_3269_ = i_3177_ & 0xff;
						for (int i_3270_ = -i_3182_; i_3270_ < 0; i_3270_++) {
							for (int i_3271_ = -i_3183_; i_3271_ < 0; i_3271_++) {
								int i_3272_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]);
								if (i_3272_ != 0) {
									int i_3273_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3272_ & 0xff]);
									int i_3274_ = ((i_3273_ & 0xff0000) * i_3267_ & ~0xffffff);
									int i_3275_ = ((i_3273_ & 0xff00) * i_3268_ & 0xff0000);
									int i_3276_ = (i_3273_ & 0xff) * i_3269_ & 0xff00;
									i_3273_ = (i_3274_ | i_3275_ | i_3276_) >>> 8;
									int i_3277_ = is[i_3180_];
									int i_3278_ = i_3273_ + i_3277_;
									int i_3279_ = ((i_3273_ & 0xff00ff) + (i_3277_ & 0xff00ff));
									i_3277_ = ((i_3279_ & 0x1000100) + (i_3278_ - i_3279_ & 0x10000));
									is[i_3180_++] = (i_3278_ - i_3277_ | i_3277_ - (i_3277_ >>> 8));
								} else
									i_3180_++;
							}
							i_3180_ += i_3184_;
							i_3181_ += i_3185_;
						}
					} else if (i_3176_ == 3) {
						for (int i_3280_ = -i_3182_; i_3280_ < 0; i_3280_++) {
							for (int i_3281_ = -i_3183_; i_3281_ < 0; i_3281_++) {
								byte i_3282_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]);
								int i_3283_ = (i_3282_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_3282_]) : 0);
								int i_3284_ = i_3283_ + i_3177_;
								int i_3285_ = ((i_3283_ & 0xff00ff) + (i_3177_ & 0xff00ff));
								int i_3286_ = ((i_3285_ & 0x1000100) + (i_3284_ - i_3285_ & 0x10000));
								i_3283_ = i_3284_ - i_3286_ | i_3286_ - (i_3286_ >>> 8);
								i_3286_ = is[i_3180_];
								i_3284_ = i_3283_ + i_3286_;
								i_3285_ = (i_3283_ & 0xff00ff) + (i_3286_ & 0xff00ff);
								i_3286_ = ((i_3285_ & 0x1000100) + (i_3284_ - i_3285_ & 0x10000));
								is[i_3180_++] = i_3284_ - i_3286_ | i_3286_ - (i_3286_ >>> 8);
							}
							i_3180_ += i_3184_;
							i_3181_ += i_3185_;
						}
					} else if (i_3176_ == 2) {
						int i_3287_ = i_3177_ >>> 24;
						int i_3288_ = 256 - i_3287_;
						int i_3289_ = (i_3177_ & 0xff00ff) * i_3288_ & ~0xff00ff;
						int i_3290_ = (i_3177_ & 0xff00) * i_3288_ & 0xff0000;
						i_3177_ = (i_3289_ | i_3290_) >>> 8;
						for (int i_3291_ = -i_3182_; i_3291_ < 0; i_3291_++) {
							for (int i_3292_ = -i_3183_; i_3292_ < 0; i_3292_++) {
								int i_3293_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3181_++]);
								if (i_3293_ != 0) {
									int i_3294_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3293_ & 0xff]);
									i_3289_ = ((i_3294_ & 0xff00ff) * i_3287_ & ~0xff00ff);
									i_3290_ = ((i_3294_ & 0xff00) * i_3287_ & 0xff0000);
									i_3294_ = (((i_3289_ | i_3290_) >>> 8) + i_3177_);
									int i_3295_ = is[i_3180_];
									int i_3296_ = i_3294_ + i_3295_;
									int i_3297_ = ((i_3294_ & 0xff00ff) + (i_3295_ & 0xff00ff));
									i_3295_ = ((i_3297_ & 0x1000100) + (i_3296_ - i_3297_ & 0x10000));
									is[i_3180_++] = (i_3296_ - i_3295_ | i_3295_ - (i_3295_ >>> 8));
								} else
									i_3180_++;
							}
							i_3180_ += i_3184_;
							i_3181_ += i_3185_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method14252(boolean bool, boolean bool_3298_, boolean bool_3299_, int i, int i_3300_, float f, int i_3301_, int i_3302_, int i_3303_, int i_3304_, int i_3305_, int i_3306_, boolean bool_3307_) {
		if (i_3301_ > 0 && i_3302_ > 0 && (bool || bool_3298_)) {
			int i_3308_ = 0;
			int i_3309_ = 0;
			int i_3310_ = (((Class160_Sub1_Sub2) this).anInt8853 + ((Class160_Sub1_Sub2) this).anInt8851 + ((Class160_Sub1_Sub2) this).anInt8855);
			int i_3311_ = (((Class160_Sub1_Sub2) this).anInt8854 + ((Class160_Sub1_Sub2) this).anInt8867 + ((Class160_Sub1_Sub2) this).anInt8856);
			int i_3312_ = (i_3310_ << 16) / i_3301_;
			int i_3313_ = (i_3311_ << 16) / i_3302_;
			if (((Class160_Sub1_Sub2) this).anInt8853 > 0) {
				int i_3314_ = (((((Class160_Sub1_Sub2) this).anInt8853 << 16) + i_3312_ - 1) / i_3312_);
				i += i_3314_;
				i_3308_ += (i_3314_ * i_3312_ - (((Class160_Sub1_Sub2) this).anInt8853 << 16));
			}
			if (((Class160_Sub1_Sub2) this).anInt8854 > 0) {
				int i_3315_ = (((((Class160_Sub1_Sub2) this).anInt8854 << 16) + i_3313_ - 1) / i_3313_);
				i_3300_ += i_3315_;
				i_3309_ += (i_3315_ * i_3313_ - (((Class160_Sub1_Sub2) this).anInt8854 << 16));
			}
			if (((Class160_Sub1_Sub2) this).anInt8851 < i_3310_)
				i_3301_ = ((((Class160_Sub1_Sub2) this).anInt8851 << 16) - i_3308_ + i_3312_ - 1) / i_3312_;
			if (((Class160_Sub1_Sub2) this).anInt8867 < i_3311_)
				i_3302_ = ((((Class160_Sub1_Sub2) this).anInt8867 << 16) - i_3309_ + i_3313_ - 1) / i_3313_;
			int i_3316_ = i + i_3300_ * ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980) * 444800403);
			int i_3317_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980 * 444800403) - i_3301_);
			if (i_3300_ + i_3302_ > (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_3302_ -= (i_3300_ + i_3302_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i_3300_ < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_3318_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_3300_);
				i_3302_ -= i_3318_;
				i_3316_ += i_3318_ * (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
				i_3309_ += i_3313_ * i_3318_;
			}
			if (i + i_3301_ > (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_3319_ = (i + i_3301_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_3301_ -= i_3319_;
				i_3317_ += i_3319_;
			}
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_3320_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_3301_ -= i_3320_;
				i_3316_ += i_3320_;
				i_3308_ += i_3312_ * i_3320_;
				i_3317_ += i_3320_;
			}
			float[] fs = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).aFloatArray9010);
			int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
			if (i_3305_ == 0) {
				if (i_3303_ == 1) {
					int i_3321_ = i_3308_;
					for (int i_3322_ = -i_3302_; i_3322_ < 0; i_3322_++) {
						int i_3323_ = ((i_3309_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_3324_ = -i_3301_; i_3324_ < 0; i_3324_++) {
							if (!bool_3298_ || f < fs[i_3316_]) {
								if (bool)
									is[i_3316_] = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[(i_3308_ >> 16) + i_3323_]) & 0xff)]);
								if (bool_3298_ && bool_3307_)
									fs[i_3316_] = f;
							}
							i_3308_ += i_3312_;
							i_3316_++;
						}
						i_3309_ += i_3313_;
						i_3308_ = i_3321_;
						i_3316_ += i_3317_;
					}
				} else if (i_3303_ == 0) {
					int i_3325_ = (i_3304_ & 0xff0000) >> 16;
					int i_3326_ = (i_3304_ & 0xff00) >> 8;
					int i_3327_ = i_3304_ & 0xff;
					int i_3328_ = i_3308_;
					for (int i_3329_ = -i_3302_; i_3329_ < 0; i_3329_++) {
						int i_3330_ = ((i_3309_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_3331_ = -i_3301_; i_3331_ < 0; i_3331_++) {
							if (!bool_3298_ || f < fs[i_3316_]) {
								if (bool) {
									int i_3332_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[(i_3308_ >> 16) + i_3330_]) & 0xff)]);
									int i_3333_ = ((i_3332_ & 0xff0000) * i_3325_ & ~0xffffff);
									int i_3334_ = ((i_3332_ & 0xff00) * i_3326_ & 0xff0000);
									int i_3335_ = (i_3332_ & 0xff) * i_3327_ & 0xff00;
									is[i_3316_] = (i_3333_ | i_3334_ | i_3335_) >>> 8;
								}
								if (bool_3298_ && bool_3307_)
									fs[i_3316_] = f;
							}
							i_3308_ += i_3312_;
							i_3316_++;
						}
						i_3309_ += i_3313_;
						i_3308_ = i_3328_;
						i_3316_ += i_3317_;
					}
				} else if (i_3303_ == 3) {
					int i_3336_ = i_3308_;
					for (int i_3337_ = -i_3302_; i_3337_ < 0; i_3337_++) {
						int i_3338_ = ((i_3309_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_3339_ = -i_3301_; i_3339_ < 0; i_3339_++) {
							if (!bool_3298_ || f < fs[i_3316_]) {
								if (bool) {
									byte i_3340_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_3308_ >> 16) + i_3338_]);
									int i_3341_ = (i_3340_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_3340_]) : 0);
									int i_3342_ = i_3341_ + i_3304_;
									int i_3343_ = ((i_3341_ & 0xff00ff) + (i_3304_ & 0xff00ff));
									int i_3344_ = ((i_3343_ & 0x1000100) + (i_3342_ - i_3343_ & 0x10000));
									is[i_3316_] = (i_3342_ - i_3344_ | i_3344_ - (i_3344_ >>> 8));
								}
								if (bool_3298_ && bool_3307_)
									fs[i_3316_] = f;
							}
							i_3308_ += i_3312_;
							i_3316_++;
						}
						i_3309_ += i_3313_;
						i_3308_ = i_3336_;
						i_3316_ += i_3317_;
					}
				} else if (i_3303_ == 2) {
					int i_3345_ = i_3304_ >>> 24;
					int i_3346_ = 256 - i_3345_;
					int i_3347_ = (i_3304_ & 0xff00ff) * i_3346_ & ~0xff00ff;
					int i_3348_ = (i_3304_ & 0xff00) * i_3346_ & 0xff0000;
					i_3304_ = (i_3347_ | i_3348_) >>> 8;
					int i_3349_ = i_3308_;
					for (int i_3350_ = -i_3302_; i_3350_ < 0; i_3350_++) {
						int i_3351_ = ((i_3309_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_3352_ = -i_3301_; i_3352_ < 0; i_3352_++) {
							if (!bool_3298_ || f < fs[i_3316_]) {
								if (bool) {
									int i_3353_ = (((Class160_Sub1_Sub2) this).anIntArray10220[((((Class160_Sub1_Sub2) this).aByteArray10221[(i_3308_ >> 16) + i_3351_]) & 0xff)]);
									i_3347_ = ((i_3353_ & 0xff00ff) * i_3345_ & ~0xff00ff);
									i_3348_ = ((i_3353_ & 0xff00) * i_3345_ & 0xff0000);
									is[i_3316_] = (((i_3347_ | i_3348_) >>> 8) + i_3304_);
								}
								if (bool_3298_ && bool_3307_)
									fs[i_3316_] = f;
							}
							i_3308_ += i_3312_;
							i_3316_++;
						}
						i_3309_ += i_3313_;
						i_3308_ = i_3349_;
						i_3316_ += i_3317_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_3305_ == 1) {
				if (i_3303_ == 1) {
					int i_3354_ = i_3308_;
					for (int i_3355_ = -i_3302_; i_3355_ < 0; i_3355_++) {
						int i_3356_ = ((i_3309_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_3357_ = -i_3301_; i_3357_ < 0; i_3357_++) {
							if (!bool_3298_ || f < fs[i_3316_]) {
								int i_3358_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_3308_ >> 16) + i_3356_]);
								if (i_3358_ != 0) {
									if (bool)
										is[i_3316_] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3358_ & 0xff]);
									if (bool_3298_ && bool_3307_)
										fs[i_3316_] = f;
								}
							}
							i_3308_ += i_3312_;
							i_3316_++;
						}
						i_3309_ += i_3313_;
						i_3308_ = i_3354_;
						i_3316_ += i_3317_;
					}
				} else if (i_3303_ == 0) {
					int i_3359_ = i_3308_;
					if ((i_3304_ & 0xffffff) == 16777215) {
						int i_3360_ = i_3304_ >>> 24;
						int i_3361_ = 256 - i_3360_;
						for (int i_3362_ = -i_3302_; i_3362_ < 0; i_3362_++) {
							int i_3363_ = ((i_3309_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_3364_ = -i_3301_; i_3364_ < 0; i_3364_++) {
								if (!bool_3298_ || f < fs[i_3316_]) {
									int i_3365_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_3308_ >> 16) + i_3363_]);
									if (i_3365_ != 0) {
										if (bool) {
											int i_3366_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3365_ & 0xff]);
											int i_3367_ = is[i_3316_];
											is[i_3316_] = (((((i_3366_ & 0xff00ff) * i_3360_) + ((i_3367_ & 0xff00ff) * i_3361_)) & ~0xff00ff) + ((((i_3366_ & 0xff00) * i_3360_) + ((i_3367_ & 0xff00) * i_3361_)) & 0xff0000)) >> 8;
										}
										if (bool_3298_ && bool_3307_)
											fs[i_3316_] = f;
									}
								}
								i_3308_ += i_3312_;
								i_3316_++;
							}
							i_3309_ += i_3313_;
							i_3308_ = i_3359_;
							i_3316_ += i_3317_;
						}
					} else {
						int i_3368_ = (i_3304_ & 0xff0000) >> 16;
						int i_3369_ = (i_3304_ & 0xff00) >> 8;
						int i_3370_ = i_3304_ & 0xff;
						int i_3371_ = i_3304_ >>> 24;
						int i_3372_ = 256 - i_3371_;
						for (int i_3373_ = -i_3302_; i_3373_ < 0; i_3373_++) {
							int i_3374_ = ((i_3309_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
							for (int i_3375_ = -i_3301_; i_3375_ < 0; i_3375_++) {
								if (!bool_3298_ || f < fs[i_3316_]) {
									int i_3376_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_3308_ >> 16) + i_3374_]);
									if (i_3376_ != 0) {
										int i_3377_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3376_ & 0xff]);
										if (i_3371_ != 255) {
											if (bool) {
												int i_3378_ = (((i_3377_ & 0xff0000) * i_3368_) & ~0xffffff);
												int i_3379_ = (((i_3377_ & 0xff00) * i_3369_) & 0xff0000);
												int i_3380_ = (((i_3377_ & 0xff) * i_3370_) & 0xff00);
												i_3377_ = (i_3378_ | i_3379_ | i_3380_) >>> 8;
												int i_3381_ = is[i_3316_];
												is[i_3316_] = (((((i_3377_ & 0xff00ff) * i_3371_) + ((i_3381_ & 0xff00ff) * i_3372_)) & ~0xff00ff) + ((((i_3377_ & 0xff00) * i_3371_) + ((i_3381_ & 0xff00) * i_3372_)) & 0xff0000)) >> 8;
											}
											if (bool_3298_ && bool_3307_)
												fs[i_3316_] = f;
										} else {
											if (bool) {
												int i_3382_ = (((i_3377_ & 0xff0000) * i_3368_) & ~0xffffff);
												int i_3383_ = (((i_3377_ & 0xff00) * i_3369_) & 0xff0000);
												int i_3384_ = (((i_3377_ & 0xff) * i_3370_) & 0xff00);
												is[i_3316_] = (i_3382_ | i_3383_ | i_3384_) >>> 8;
											}
											if (bool_3298_ && bool_3307_)
												fs[i_3316_] = f;
										}
									}
								}
								i_3308_ += i_3312_;
								i_3316_++;
							}
							i_3309_ += i_3313_;
							i_3308_ = i_3359_;
							i_3316_ += i_3317_;
						}
					}
				} else if (i_3303_ == 3) {
					int i_3385_ = i_3308_;
					int i_3386_ = i_3304_ >>> 24;
					int i_3387_ = 256 - i_3386_;
					for (int i_3388_ = -i_3302_; i_3388_ < 0; i_3388_++) {
						int i_3389_ = ((i_3309_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_3390_ = -i_3301_; i_3390_ < 0; i_3390_++) {
							if (!bool_3298_ || f < fs[i_3316_]) {
								if (bool) {
									byte i_3391_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_3308_ >> 16) + i_3389_]);
									int i_3392_ = (i_3391_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_3391_]) : 0);
									int i_3393_ = i_3392_ + i_3304_;
									int i_3394_ = ((i_3392_ & 0xff00ff) + (i_3304_ & 0xff00ff));
									int i_3395_ = ((i_3394_ & 0x1000100) + (i_3393_ - i_3394_ & 0x10000));
									i_3395_ = (i_3393_ - i_3395_ | i_3395_ - (i_3395_ >>> 8));
									if (i_3392_ == 0 && i_3386_ != 255) {
										i_3392_ = i_3395_;
										i_3395_ = is[i_3316_];
										i_3395_ = ((((i_3392_ & 0xff00ff) * i_3386_ + ((i_3395_ & 0xff00ff) * i_3387_)) & ~0xff00ff) + (((i_3392_ & 0xff00) * i_3386_ + ((i_3395_ & 0xff00) * i_3387_)) & 0xff0000)) >> 8;
									}
									is[i_3316_] = i_3395_;
								}
								if (bool_3298_ && bool_3307_)
									fs[i_3316_] = f;
							}
							i_3308_ += i_3312_;
							i_3316_++;
						}
						i_3309_ += i_3313_;
						i_3308_ = i_3385_;
						i_3316_ += i_3317_;
					}
				} else if (i_3303_ == 2) {
					int i_3396_ = i_3304_ >>> 24;
					int i_3397_ = 256 - i_3396_;
					int i_3398_ = (i_3304_ & 0xff00ff) * i_3397_ & ~0xff00ff;
					int i_3399_ = (i_3304_ & 0xff00) * i_3397_ & 0xff0000;
					i_3304_ = (i_3398_ | i_3399_) >>> 8;
					int i_3400_ = i_3308_;
					for (int i_3401_ = -i_3302_; i_3401_ < 0; i_3401_++) {
						int i_3402_ = ((i_3309_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_3403_ = -i_3301_; i_3403_ < 0; i_3403_++) {
							if (!bool_3298_ || f < fs[i_3316_]) {
								int i_3404_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_3308_ >> 16) + i_3402_]);
								if (i_3404_ != 0) {
									if (bool) {
										int i_3405_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3404_ & 0xff]);
										i_3398_ = ((i_3405_ & 0xff00ff) * i_3396_ & ~0xff00ff);
										i_3399_ = ((i_3405_ & 0xff00) * i_3396_ & 0xff0000);
										is[i_3316_] = ((i_3398_ | i_3399_) >>> 8) + i_3304_;
									}
									if (bool_3298_ && bool_3307_)
										fs[i_3316_] = f;
								}
							}
							i_3308_ += i_3312_;
							i_3316_++;
						}
						i_3309_ += i_3313_;
						i_3308_ = i_3400_;
						i_3316_ += i_3317_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_3305_ == 2) {
				if (i_3303_ == 1) {
					int i_3406_ = i_3308_;
					for (int i_3407_ = -i_3302_; i_3407_ < 0; i_3407_++) {
						int i_3408_ = ((i_3309_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_3409_ = -i_3301_; i_3409_ < 0; i_3409_++) {
							if (!bool_3298_ || f < fs[i_3316_]) {
								int i_3410_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_3308_ >> 16) + i_3408_]);
								if (i_3410_ != 0) {
									if (bool) {
										int i_3411_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3410_ & 0xff]);
										int i_3412_ = is[i_3316_];
										int i_3413_ = i_3411_ + i_3412_;
										int i_3414_ = ((i_3411_ & 0xff00ff) + (i_3412_ & 0xff00ff));
										i_3412_ = ((i_3414_ & 0x1000100) + (i_3413_ - i_3414_ & 0x10000));
										is[i_3316_] = (i_3413_ - i_3412_ | i_3412_ - (i_3412_ >>> 8));
									}
									if (bool_3298_ && bool_3307_)
										fs[i_3316_] = f;
								}
							}
							i_3308_ += i_3312_;
							i_3316_++;
						}
						i_3309_ += i_3313_;
						i_3308_ = i_3406_;
						i_3316_ += i_3317_;
					}
				} else if (i_3303_ == 0) {
					int i_3415_ = i_3308_;
					int i_3416_ = (i_3304_ & 0xff0000) >> 16;
					int i_3417_ = (i_3304_ & 0xff00) >> 8;
					int i_3418_ = i_3304_ & 0xff;
					for (int i_3419_ = -i_3302_; i_3419_ < 0; i_3419_++) {
						int i_3420_ = ((i_3309_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_3421_ = -i_3301_; i_3421_ < 0; i_3421_++) {
							if (!bool_3298_ || f < fs[i_3316_]) {
								int i_3422_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_3308_ >> 16) + i_3420_]);
								if (i_3422_ != 0) {
									if (bool) {
										int i_3423_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3422_ & 0xff]);
										int i_3424_ = ((i_3423_ & 0xff0000) * i_3416_ & ~0xffffff);
										int i_3425_ = ((i_3423_ & 0xff00) * i_3417_ & 0xff0000);
										int i_3426_ = ((i_3423_ & 0xff) * i_3418_ & 0xff00);
										i_3423_ = (i_3424_ | i_3425_ | i_3426_) >>> 8;
										int i_3427_ = is[i_3316_];
										int i_3428_ = i_3423_ + i_3427_;
										int i_3429_ = ((i_3423_ & 0xff00ff) + (i_3427_ & 0xff00ff));
										i_3427_ = ((i_3429_ & 0x1000100) + (i_3428_ - i_3429_ & 0x10000));
										is[i_3316_] = (i_3428_ - i_3427_ | i_3427_ - (i_3427_ >>> 8));
									}
									if (bool_3298_ && bool_3307_)
										fs[i_3316_] = f;
								}
							}
							i_3308_ += i_3312_;
							i_3316_++;
						}
						i_3309_ += i_3313_;
						i_3308_ = i_3415_;
						i_3316_ += i_3317_;
					}
				} else if (i_3303_ == 3) {
					int i_3430_ = i_3308_;
					for (int i_3431_ = -i_3302_; i_3431_ < 0; i_3431_++) {
						int i_3432_ = ((i_3309_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_3433_ = -i_3301_; i_3433_ < 0; i_3433_++) {
							if (!bool_3298_ || f < fs[i_3316_]) {
								if (bool) {
									byte i_3434_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_3308_ >> 16) + i_3432_]);
									int i_3435_ = (i_3434_ > 0 ? (((Class160_Sub1_Sub2) this).anIntArray10220[i_3434_]) : 0);
									int i_3436_ = i_3435_ + i_3304_;
									int i_3437_ = ((i_3435_ & 0xff00ff) + (i_3304_ & 0xff00ff));
									int i_3438_ = ((i_3437_ & 0x1000100) + (i_3436_ - i_3437_ & 0x10000));
									i_3435_ = (i_3436_ - i_3438_ | i_3438_ - (i_3438_ >>> 8));
									i_3438_ = is[i_3316_];
									i_3436_ = i_3435_ + i_3438_;
									i_3437_ = (i_3435_ & 0xff00ff) + (i_3438_ & 0xff00ff);
									i_3438_ = ((i_3437_ & 0x1000100) + (i_3436_ - i_3437_ & 0x10000));
									is[i_3316_] = (i_3436_ - i_3438_ | i_3438_ - (i_3438_ >>> 8));
								}
								if (bool_3298_ && bool_3307_)
									fs[i_3316_] = f;
							}
							i_3308_ += i_3312_;
							i_3316_++;
						}
						i_3309_ += i_3313_;
						i_3308_ = i_3430_;
						i_3316_ += i_3317_;
					}
				} else if (i_3303_ == 2) {
					int i_3439_ = i_3304_ >>> 24;
					int i_3440_ = 256 - i_3439_;
					int i_3441_ = (i_3304_ & 0xff00ff) * i_3440_ & ~0xff00ff;
					int i_3442_ = (i_3304_ & 0xff00) * i_3440_ & 0xff0000;
					i_3304_ = (i_3441_ | i_3442_) >>> 8;
					int i_3443_ = i_3308_;
					for (int i_3444_ = -i_3302_; i_3444_ < 0; i_3444_++) {
						int i_3445_ = ((i_3309_ >> 16) * ((Class160_Sub1_Sub2) this).anInt8851);
						for (int i_3446_ = -i_3301_; i_3446_ < 0; i_3446_++) {
							if (!bool_3298_ || f < fs[i_3316_]) {
								int i_3447_ = (((Class160_Sub1_Sub2) this).aByteArray10221[(i_3308_ >> 16) + i_3445_]);
								if (i_3447_ != 0) {
									if (bool) {
										int i_3448_ = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3447_ & 0xff]);
										i_3441_ = ((i_3448_ & 0xff00ff) * i_3439_ & ~0xff00ff);
										i_3442_ = ((i_3448_ & 0xff00) * i_3439_ & 0xff0000);
										i_3448_ = (((i_3441_ | i_3442_) >>> 8) + i_3304_);
										int i_3449_ = is[i_3316_];
										int i_3450_ = i_3448_ + i_3449_;
										int i_3451_ = ((i_3448_ & 0xff00ff) + (i_3449_ & 0xff00ff));
										i_3449_ = ((i_3451_ & 0x1000100) + (i_3450_ - i_3451_ & 0x10000));
										is[i_3316_] = (i_3450_ - i_3449_ | i_3449_ - (i_3449_ >>> 8));
									}
									if (bool_3298_ && bool_3307_)
										fs[i_3316_] = f;
								}
							}
							i_3308_ += i_3312_;
							i_3316_++;
						}
						i_3309_ += i_3313_;
						i_3308_ = i_3443_;
						i_3316_ += i_3317_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method2774(int i, int i_3452_, Class455 class455, int i_3453_, int i_3454_) {
		if (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		int[] is = (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anIntArray8979);
		if (is != null) {
			i += ((Class160_Sub1_Sub2) this).anInt8853;
			i_3452_ += ((Class160_Sub1_Sub2) this).anInt8854;
			int i_3455_ = 0;
			int i_3456_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8980 * 444800403);
			int i_3457_ = ((Class160_Sub1_Sub2) this).anInt8851;
			int i_3458_ = ((Class160_Sub1_Sub2) this).anInt8867;
			int i_3459_ = i_3456_ - i_3457_;
			int i_3460_ = 0;
			int i_3461_ = i + i_3452_ * i_3456_;
			if (i_3452_ < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457)) {
				int i_3462_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009) * 1516535457 - i_3452_);
				i_3458_ -= i_3462_;
				i_3452_ = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
				i_3455_ += i_3462_ * i_3457_;
				i_3461_ += i_3462_ * i_3456_;
			}
			if (i_3452_ + i_3458_ > (((Class505_Sub3) ((Class160_Sub1_Sub2) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
				i_3458_ -= (i_3452_ + i_3458_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8986) * 1383960921);
			if (i < (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989)) {
				int i_3463_ = ((((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983) * 72550989 - i);
				i_3457_ -= i_3463_;
				i = (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
				i_3455_ += i_3463_;
				i_3461_ += i_3463_;
				i_3460_ += i_3463_;
				i_3459_ += i_3463_;
			}
			if (i + i_3457_ > (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237) {
				int i_3464_ = (i + i_3457_ - (((Class505_Sub3) (((Class160_Sub1_Sub2) this).aClass505_Sub3_8875)).anInt9002) * -1710988237);
				i_3457_ -= i_3464_;
				i_3460_ += i_3464_;
				i_3459_ += i_3464_;
			}
			if (i_3457_ > 0 && i_3458_ > 0) {
				PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
				int[] is_3465_ = ((PacketsDecoder) class455_sub3).anIntArray9077;
				int[] is_3466_ = ((PacketsDecoder) class455_sub3).anIntArray9078;
				int i_3467_ = i_3452_;
				if (i_3454_ > i_3467_) {
					i_3467_ = i_3454_;
					i_3461_ += (i_3454_ - i_3452_) * i_3456_;
					i_3455_ += ((i_3454_ - i_3452_) * ((Class160_Sub1_Sub2) this).anInt8851);
				}
				int i_3468_ = (i_3454_ + is_3465_.length < i_3452_ + i_3458_ ? i_3454_ + is_3465_.length : i_3452_ + i_3458_);
				for (int i_3469_ = i_3467_; i_3469_ < i_3468_; i_3469_++) {
					int i_3470_ = is_3465_[i_3469_ - i_3454_] + i_3453_;
					int i_3471_ = is_3466_[i_3469_ - i_3454_];
					int i_3472_ = i_3457_;
					if (i > i_3470_) {
						int i_3473_ = i - i_3470_;
						if (i_3473_ >= i_3471_) {
							i_3455_ += i_3457_ + i_3460_;
							i_3461_ += i_3457_ + i_3459_;
							continue;
						}
						i_3471_ -= i_3473_;
					} else {
						int i_3474_ = i_3470_ - i;
						if (i_3474_ >= i_3457_) {
							i_3455_ += i_3457_ + i_3460_;
							i_3461_ += i_3457_ + i_3459_;
							continue;
						}
						i_3455_ += i_3474_;
						i_3472_ -= i_3474_;
						i_3461_ += i_3474_;
					}
					int i_3475_ = 0;
					if (i_3472_ < i_3471_)
						i_3471_ = i_3472_;
					else
						i_3475_ = i_3472_ - i_3471_;
					for (int i_3476_ = -i_3471_; i_3476_ < 0; i_3476_++) {
						int i_3477_ = (((Class160_Sub1_Sub2) this).aByteArray10221[i_3455_++]);
						if (i_3477_ != 0)
							is[i_3461_++] = (((Class160_Sub1_Sub2) this).anIntArray10220[i_3477_ & 0xff]);
						else
							i_3461_++;
					}
					i_3455_ += i_3475_ + i_3460_;
					i_3461_ += i_3475_ + i_3459_;
				}
			}
		}
	}
}
