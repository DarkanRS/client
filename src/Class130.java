
/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class130 {
	Class390_Sub2 aClass390_Sub2_1584;
	Class124[][] aClass124ArrayArray1585;
	int anInt1586;
	int anInt1587;
	byte[] aByteArray1588;
	int anInt1589;
	int anInt1590;
	int anInt1591;
	Class505_Sub1 aClass505_Sub1_1592;

	void method2288(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_0_) {
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10293) + 1;
		i_0_ += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10295) + 1;
		int i_1_ = i + i_0_ * ((Class130) this).anInt1586;
		int i_2_ = 0;
		int i_3_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10294);
		int i_4_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10296);
		int i_5_ = ((Class130) this).anInt1586 - i_4_;
		int i_6_ = 0;
		if (i_0_ <= 0) {
			int i_7_ = 1 - i_0_;
			i_3_ -= i_7_;
			i_2_ += i_7_ * i_4_;
			i_1_ += i_7_ * ((Class130) this).anInt1586;
			i_0_ = 1;
		}
		if (i_0_ + i_3_ >= ((Class130) this).anInt1587) {
			int i_8_ = i_0_ + i_3_ + 1 - ((Class130) this).anInt1587;
			i_3_ -= i_8_;
		}
		if (i <= 0) {
			int i_9_ = 1 - i;
			i_4_ -= i_9_;
			i_2_ += i_9_;
			i_1_ += i_9_;
			i_6_ += i_9_;
			i_5_ += i_9_;
			i = 1;
		}
		if (i + i_4_ >= ((Class130) this).anInt1586) {
			int i_10_ = i + i_4_ + 1 - ((Class130) this).anInt1586;
			i_4_ -= i_10_;
			i_6_ += i_10_;
			i_5_ += i_10_;
		}
		if (i_4_ > 0 && i_3_ > 0) {
			method2296(((Class130) this).aByteArray1588, (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).aByteArray10297), i_2_, i_1_, i_4_, i_3_, i_5_, i_6_);
			method2298(i, i_0_, i_4_, i_3_);
		}
	}

	static final void method2289(byte[] is, byte[] is_11_, int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		int i_17_ = -(i_13_ >> 2);
		i_13_ = -(i_13_ & 0x3);
		for (int i_18_ = -i_14_; i_18_ < 0; i_18_++) {
			for (int i_19_ = i_17_; i_19_ < 0; i_19_++) {
				is[i_12_++] -= is_11_[i++];
				is[i_12_++] -= is_11_[i++];
				is[i_12_++] -= is_11_[i++];
				is[i_12_++] -= is_11_[i++];
			}
			for (int i_20_ = i_13_; i_20_ < 0; i_20_++)
				is[i_12_++] -= is_11_[i++];
			i_12_ += i_15_;
			i += i_16_;
		}
	}

	void method2290(int i, int i_21_, int i_22_, boolean[][] bools, boolean bool) {
		((Class130) this).aClass505_Sub1_1592.method13620(false);
		((Class130) this).aClass505_Sub1_1592.method13623(false);
		((Class130) this).aClass505_Sub1_1592.method13581(-2);
		((Class130) this).aClass505_Sub1_1592.method13612(1);
		((Class130) this).aClass505_Sub1_1592.method13624(1);
		float f = 1.0F / (float) (((Class505_Sub1) ((Class130) this).aClass505_Sub1_1592).anInt8466 * 128);
		if (bool) {
			for (int i_23_ = 0; i_23_ < ((Class130) this).anInt1590; i_23_++) {
				int i_24_ = i_23_ << ((Class130) this).anInt1589;
				int i_25_ = i_23_ + 1 << ((Class130) this).anInt1589;
				for (int i_26_ = 0; i_26_ < ((Class130) this).anInt1591; i_26_++) {
					int i_27_ = i_26_ << ((Class130) this).anInt1589;
					int i_28_ = i_26_ + 1 << ((Class130) this).anInt1589;
					while_215_: for (int i_29_ = i_27_; i_29_ < i_28_; i_29_++) {
						if (i_29_ - i >= -i_22_ && i_29_ - i <= i_22_) {
							for (int i_30_ = i_24_; i_30_ < i_25_; i_30_++) {
								if (i_30_ - i_21_ >= -i_22_ && i_30_ - i_21_ <= i_22_ && (bools[i_29_ - i + i_22_][i_30_ - i_21_ + i_22_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_26_ / f, (float) -i_23_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									((Class130) this).aClass124ArrayArray1585[i_26_][i_23_].method2155();
									break while_215_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_31_ = 0; i_31_ < ((Class130) this).anInt1590; i_31_++) {
				int i_32_ = i_31_ << ((Class130) this).anInt1589;
				int i_33_ = i_31_ + 1 << ((Class130) this).anInt1589;
				for (int i_34_ = 0; i_34_ < ((Class130) this).anInt1591; i_34_++) {
					int i_35_ = 0;
					int i_36_ = i_34_ << ((Class130) this).anInt1589;
					int i_37_ = i_34_ + 1 << ((Class130) this).anInt1589;
					Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class130) this).aClass505_Sub1_1592).aClass282_Sub35_Sub1_8499);
					class282_sub35_sub1.index = 0;
					for (int i_38_ = i_32_; i_38_ < i_33_; i_38_++) {
						if (i_38_ - i_21_ >= -i_22_ && i_38_ - i_21_ <= i_22_) {
							int i_39_ = (i_38_ * ((((Class130) this).aClass390_Sub2_1584.anInt4776) * -1843860823) + i_36_);
							for (int i_40_ = i_36_; i_40_ < i_37_; i_40_++) {
								if (i_40_ - i >= -i_22_ && i_40_ - i <= i_22_ && (bools[i_40_ - i + i_22_][i_38_ - i_21_ + i_22_])) {
									short[] is = (((Class390_Sub2) (((Class130) this).aClass390_Sub2_1584)).aShortArrayArray8653[i_39_]);
									if (is != null) {
										if (((Class505_Sub1) (((Class130) this).aClass505_Sub1_1592)).aBool8467) {
											for (int i_41_ = 0; i_41_ < is.length; i_41_++) {
												class282_sub35_sub1.writeShort(is[i_41_] & 0xffff, 1417031095);
												i_35_++;
											}
										} else {
											for (int i_42_ = 0; i_42_ < is.length; i_42_++) {
												class282_sub35_sub1.writeLEShort(is[i_42_] & 0xffff, (byte) -24);
												i_35_++;
											}
										}
									}
								}
								i_39_++;
							}
						}
					}
					if (i_35_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_34_ / f, (float) -i_31_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						((Class130) this).aClass124ArrayArray1585[i_34_][i_31_].method2156(class282_sub35_sub1.buffer, i_35_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	static final void method2291(byte[] is, byte[] is_43_, int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_) {
		int i_49_ = -(i_45_ >> 2);
		i_45_ = -(i_45_ & 0x3);
		for (int i_50_ = -i_46_; i_50_ < 0; i_50_++) {
			for (int i_51_ = i_49_; i_51_ < 0; i_51_++) {
				is[i_44_++] += is_43_[i++];
				is[i_44_++] += is_43_[i++];
				is[i_44_++] += is_43_[i++];
				is[i_44_++] += is_43_[i++];
			}
			for (int i_52_ = i_45_; i_52_ < 0; i_52_++)
				is[i_44_++] += is_43_[i++];
			i_44_ += i_47_;
			i += i_48_;
		}
	}

	static final boolean method2292(byte[] is, int i, int i_53_, int i_54_, int i_55_, int i_56_) {
		int i_57_ = i_53_ % i_56_;
		int i_58_;
		if (i_57_ != 0)
			i_58_ = i_56_ - i_57_;
		else
			i_58_ = 0;
		int i_59_ = -((i_54_ + i_56_ - 1) / i_56_);
		int i_60_ = -((i_53_ + i_56_ - 1) / i_56_);
		for (int i_61_ = i_59_; i_61_ < 0; i_61_++) {
			for (int i_62_ = i_60_; i_62_ < 0; i_62_++) {
				if (is[i] == 0)
					return true;
				i += i_56_;
			}
			i -= i_58_;
			if (is[i - 1] == 0)
				return true;
			i += i_55_;
		}
		return false;
	}

	boolean method2293(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_63_) {
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10293) + 1;
		i_63_ += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10295) + 1;
		int i_64_ = i + i_63_ * ((Class130) this).anInt1586;
		int i_65_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10294);
		int i_66_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10296);
		int i_67_ = ((Class130) this).anInt1586 - i_66_;
		if (i_63_ <= 0) {
			int i_68_ = 1 - i_63_;
			i_65_ -= i_68_;
			i_64_ += i_68_ * ((Class130) this).anInt1586;
			i_63_ = 1;
		}
		if (i_63_ + i_65_ >= ((Class130) this).anInt1587) {
			int i_69_ = i_63_ + i_65_ + 1 - ((Class130) this).anInt1587;
			i_65_ -= i_69_;
		}
		if (i <= 0) {
			int i_70_ = 1 - i;
			i_66_ -= i_70_;
			i_64_ += i_70_;
			i_67_ += i_70_;
			i = 1;
		}
		if (i + i_66_ >= ((Class130) this).anInt1586) {
			int i_71_ = i + i_66_ + 1 - ((Class130) this).anInt1586;
			i_66_ -= i_71_;
			i_67_ += i_71_;
		}
		if (i_66_ <= 0 || i_65_ <= 0)
			return false;
		int i_72_ = 8;
		i_67_ += (i_72_ - 1) * ((Class130) this).anInt1586;
		return method2297(((Class130) this).aByteArray1588, i_64_, i_66_, i_65_, i_67_, i_72_);
	}

	void method2294() {
		((Class130) this).aClass124ArrayArray1585 = (new Class124[((Class130) this).anInt1591][((Class130) this).anInt1590]);
		for (int i = 0; i < ((Class130) this).anInt1590; i++) {
			for (int i_73_ = 0; i_73_ < ((Class130) this).anInt1591; i_73_++)
				((Class130) this).aClass124ArrayArray1585[i_73_][i] = new Class124(((Class130) this).aClass505_Sub1_1592, this, ((Class130) this).aClass390_Sub2_1584, i_73_, i, ((Class130) this).anInt1589, i_73_ * 128 + 1, i * 128 + 1);
		}
	}

	static final void method2295(byte[] is, byte[] is_74_, int i, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_) {
		int i_80_ = -(i_76_ >> 2);
		i_76_ = -(i_76_ & 0x3);
		for (int i_81_ = -i_77_; i_81_ < 0; i_81_++) {
			for (int i_82_ = i_80_; i_82_ < 0; i_82_++) {
				is[i_75_++] += is_74_[i++];
				is[i_75_++] += is_74_[i++];
				is[i_75_++] += is_74_[i++];
				is[i_75_++] += is_74_[i++];
			}
			for (int i_83_ = i_76_; i_83_ < 0; i_83_++)
				is[i_75_++] += is_74_[i++];
			i_75_ += i_78_;
			i += i_79_;
		}
	}

	static final void method2296(byte[] is, byte[] is_84_, int i, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_) {
		int i_90_ = -(i_86_ >> 2);
		i_86_ = -(i_86_ & 0x3);
		for (int i_91_ = -i_87_; i_91_ < 0; i_91_++) {
			for (int i_92_ = i_90_; i_92_ < 0; i_92_++) {
				is[i_85_++] -= is_84_[i++];
				is[i_85_++] -= is_84_[i++];
				is[i_85_++] -= is_84_[i++];
				is[i_85_++] -= is_84_[i++];
			}
			for (int i_93_ = i_86_; i_93_ < 0; i_93_++)
				is[i_85_++] -= is_84_[i++];
			i_85_ += i_88_;
			i += i_89_;
		}
	}

	static final boolean method2297(byte[] is, int i, int i_94_, int i_95_, int i_96_, int i_97_) {
		int i_98_ = i_94_ % i_97_;
		int i_99_;
		if (i_98_ != 0)
			i_99_ = i_97_ - i_98_;
		else
			i_99_ = 0;
		int i_100_ = -((i_95_ + i_97_ - 1) / i_97_);
		int i_101_ = -((i_94_ + i_97_ - 1) / i_97_);
		for (int i_102_ = i_100_; i_102_ < 0; i_102_++) {
			for (int i_103_ = i_101_; i_103_ < 0; i_103_++) {
				if (is[i] == 0)
					return true;
				i += i_97_;
			}
			i -= i_99_;
			if (is[i - 1] == 0)
				return true;
			i += i_96_;
		}
		return false;
	}

	void method2298(int i, int i_104_, int i_105_, int i_106_) {
		if (((Class130) this).aClass124ArrayArray1585 != null) {
			int i_107_ = i - 1 >> 7;
			int i_108_ = i - 1 + i_105_ - 1 >> 7;
			int i_109_ = i_104_ - 1 >> 7;
			int i_110_ = i_104_ - 1 + i_106_ - 1 >> 7;
			for (int i_111_ = i_107_; i_111_ <= i_108_; i_111_++) {
				Class124[] class124s = ((Class130) this).aClass124ArrayArray1585[i_111_];
				for (int i_112_ = i_109_; i_112_ <= i_110_; i_112_++)
					((Class124) class124s[i_112_]).aBool1556 = true;
			}
		}
	}

	void method2299(int i, int i_113_, int i_114_, int i_115_) {
		if (((Class130) this).aClass124ArrayArray1585 != null) {
			int i_116_ = i - 1 >> 7;
			int i_117_ = i - 1 + i_114_ - 1 >> 7;
			int i_118_ = i_113_ - 1 >> 7;
			int i_119_ = i_113_ - 1 + i_115_ - 1 >> 7;
			for (int i_120_ = i_116_; i_120_ <= i_117_; i_120_++) {
				Class124[] class124s = ((Class130) this).aClass124ArrayArray1585[i_120_];
				for (int i_121_ = i_118_; i_121_ <= i_119_; i_121_++)
					((Class124) class124s[i_121_]).aBool1556 = true;
			}
		}
	}

	Class130(Class505_Sub1 class505_sub1, Class390_Sub2 class390_sub2) {
		((Class130) this).aClass505_Sub1_1592 = class505_sub1;
		((Class130) this).aClass390_Sub2_1584 = class390_sub2;
		((Class130) this).anInt1586 = 2 + ((((Class130) this).aClass390_Sub2_1584.anInt4776 * -1843860823 * (((Class130) this).aClass390_Sub2_1584.anInt4774 * 750971439)) >> (((Class505_Sub1) ((Class130) this).aClass505_Sub1_1592).anInt8473));
		((Class130) this).anInt1587 = 2 + ((((Class130) this).aClass390_Sub2_1584.anInt4773 * 1826078169 * (((Class130) this).aClass390_Sub2_1584.anInt4774 * 750971439)) >> (((Class505_Sub1) ((Class130) this).aClass505_Sub1_1592).anInt8473));
		((Class130) this).aByteArray1588 = (new byte[((Class130) this).anInt1586 * ((Class130) this).anInt1587]);
		((Class130) this).anInt1589 = (7 + (((Class505_Sub1) ((Class130) this).aClass505_Sub1_1592).anInt8473) - ((Class130) this).aClass390_Sub2_1584.anInt4775 * 1856651955);
		((Class130) this).anInt1591 = (((Class130) this).aClass390_Sub2_1584.anInt4776 * -1843860823 >> ((Class130) this).anInt1589);
		((Class130) this).anInt1590 = (((Class130) this).aClass390_Sub2_1584.anInt4773 * 1826078169 >> ((Class130) this).anInt1589);
	}

	void method2300(int i, int i_122_, int i_123_, boolean[][] bools, boolean bool) {
		((Class130) this).aClass505_Sub1_1592.method13620(false);
		((Class130) this).aClass505_Sub1_1592.method13623(false);
		((Class130) this).aClass505_Sub1_1592.method13581(-2);
		((Class130) this).aClass505_Sub1_1592.method13612(1);
		((Class130) this).aClass505_Sub1_1592.method13624(1);
		float f = 1.0F / (float) (((Class505_Sub1) ((Class130) this).aClass505_Sub1_1592).anInt8466 * 128);
		if (bool) {
			for (int i_124_ = 0; i_124_ < ((Class130) this).anInt1590; i_124_++) {
				int i_125_ = i_124_ << ((Class130) this).anInt1589;
				int i_126_ = i_124_ + 1 << ((Class130) this).anInt1589;
				for (int i_127_ = 0; i_127_ < ((Class130) this).anInt1591; i_127_++) {
					int i_128_ = i_127_ << ((Class130) this).anInt1589;
					int i_129_ = i_127_ + 1 << ((Class130) this).anInt1589;
					while_216_: for (int i_130_ = i_128_; i_130_ < i_129_; i_130_++) {
						if (i_130_ - i >= -i_123_ && i_130_ - i <= i_123_) {
							for (int i_131_ = i_125_; i_131_ < i_126_; i_131_++) {
								if (i_131_ - i_122_ >= -i_123_ && i_131_ - i_122_ <= i_123_ && (bools[i_130_ - i + i_123_][i_131_ - i_122_ + i_123_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_127_ / f, (float) -i_124_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									((Class130) this).aClass124ArrayArray1585[i_127_][i_124_].method2155();
									break while_216_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_132_ = 0; i_132_ < ((Class130) this).anInt1590; i_132_++) {
				int i_133_ = i_132_ << ((Class130) this).anInt1589;
				int i_134_ = i_132_ + 1 << ((Class130) this).anInt1589;
				for (int i_135_ = 0; i_135_ < ((Class130) this).anInt1591; i_135_++) {
					int i_136_ = 0;
					int i_137_ = i_135_ << ((Class130) this).anInt1589;
					int i_138_ = i_135_ + 1 << ((Class130) this).anInt1589;
					Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class130) this).aClass505_Sub1_1592).aClass282_Sub35_Sub1_8499);
					class282_sub35_sub1.index = 0;
					for (int i_139_ = i_133_; i_139_ < i_134_; i_139_++) {
						if (i_139_ - i_122_ >= -i_123_ && i_139_ - i_122_ <= i_123_) {
							int i_140_ = (i_139_ * ((((Class130) this).aClass390_Sub2_1584.anInt4776) * -1843860823) + i_137_);
							for (int i_141_ = i_137_; i_141_ < i_138_; i_141_++) {
								if (i_141_ - i >= -i_123_ && i_141_ - i <= i_123_ && (bools[i_141_ - i + i_123_][i_139_ - i_122_ + i_123_])) {
									short[] is = (((Class390_Sub2) (((Class130) this).aClass390_Sub2_1584)).aShortArrayArray8653[i_140_]);
									if (is != null) {
										if (((Class505_Sub1) (((Class130) this).aClass505_Sub1_1592)).aBool8467) {
											for (int i_142_ = 0; i_142_ < is.length; i_142_++) {
												class282_sub35_sub1.writeShort(is[i_142_] & 0xffff, 1417031095);
												i_136_++;
											}
										} else {
											for (int i_143_ = 0; i_143_ < is.length; i_143_++) {
												class282_sub35_sub1.writeLEShort(is[i_143_] & 0xffff, (byte) 49);
												i_136_++;
											}
										}
									}
								}
								i_140_++;
							}
						}
					}
					if (i_136_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_135_ / f, (float) -i_132_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						((Class130) this).aClass124ArrayArray1585[i_135_][i_132_].method2156(class282_sub35_sub1.buffer, i_136_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method2301(int i, int i_144_, int i_145_, boolean[][] bools, boolean bool) {
		((Class130) this).aClass505_Sub1_1592.method13620(false);
		((Class130) this).aClass505_Sub1_1592.method13623(false);
		((Class130) this).aClass505_Sub1_1592.method13581(-2);
		((Class130) this).aClass505_Sub1_1592.method13612(1);
		((Class130) this).aClass505_Sub1_1592.method13624(1);
		float f = 1.0F / (float) (((Class505_Sub1) ((Class130) this).aClass505_Sub1_1592).anInt8466 * 128);
		if (bool) {
			for (int i_146_ = 0; i_146_ < ((Class130) this).anInt1590; i_146_++) {
				int i_147_ = i_146_ << ((Class130) this).anInt1589;
				int i_148_ = i_146_ + 1 << ((Class130) this).anInt1589;
				for (int i_149_ = 0; i_149_ < ((Class130) this).anInt1591; i_149_++) {
					int i_150_ = i_149_ << ((Class130) this).anInt1589;
					int i_151_ = i_149_ + 1 << ((Class130) this).anInt1589;
					while_217_: for (int i_152_ = i_150_; i_152_ < i_151_; i_152_++) {
						if (i_152_ - i >= -i_145_ && i_152_ - i <= i_145_) {
							for (int i_153_ = i_147_; i_153_ < i_148_; i_153_++) {
								if (i_153_ - i_144_ >= -i_145_ && i_153_ - i_144_ <= i_145_ && (bools[i_152_ - i + i_145_][i_153_ - i_144_ + i_145_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_149_ / f, (float) -i_146_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									((Class130) this).aClass124ArrayArray1585[i_149_][i_146_].method2155();
									break while_217_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_154_ = 0; i_154_ < ((Class130) this).anInt1590; i_154_++) {
				int i_155_ = i_154_ << ((Class130) this).anInt1589;
				int i_156_ = i_154_ + 1 << ((Class130) this).anInt1589;
				for (int i_157_ = 0; i_157_ < ((Class130) this).anInt1591; i_157_++) {
					int i_158_ = 0;
					int i_159_ = i_157_ << ((Class130) this).anInt1589;
					int i_160_ = i_157_ + 1 << ((Class130) this).anInt1589;
					Class282_Sub35_Sub1 class282_sub35_sub1 = (((Class505_Sub1) ((Class130) this).aClass505_Sub1_1592).aClass282_Sub35_Sub1_8499);
					class282_sub35_sub1.index = 0;
					for (int i_161_ = i_155_; i_161_ < i_156_; i_161_++) {
						if (i_161_ - i_144_ >= -i_145_ && i_161_ - i_144_ <= i_145_) {
							int i_162_ = (i_161_ * ((((Class130) this).aClass390_Sub2_1584.anInt4776) * -1843860823) + i_159_);
							for (int i_163_ = i_159_; i_163_ < i_160_; i_163_++) {
								if (i_163_ - i >= -i_145_ && i_163_ - i <= i_145_ && (bools[i_163_ - i + i_145_][i_161_ - i_144_ + i_145_])) {
									short[] is = (((Class390_Sub2) (((Class130) this).aClass390_Sub2_1584)).aShortArrayArray8653[i_162_]);
									if (is != null) {
										if (((Class505_Sub1) (((Class130) this).aClass505_Sub1_1592)).aBool8467) {
											for (int i_164_ = 0; i_164_ < is.length; i_164_++) {
												class282_sub35_sub1.writeShort(is[i_164_] & 0xffff, 1417031095);
												i_158_++;
											}
										} else {
											for (int i_165_ = 0; i_165_ < is.length; i_165_++) {
												class282_sub35_sub1.writeLEShort(is[i_165_] & 0xffff, (byte) -58);
												i_158_++;
											}
										}
									}
								}
								i_162_++;
							}
						}
					}
					if (i_158_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_157_ / f, (float) -i_154_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						((Class130) this).aClass124ArrayArray1585[i_157_][i_154_].method2156(class282_sub35_sub1.buffer, i_158_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method2302(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_166_) {
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10293) + 1;
		i_166_ += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10295) + 1;
		int i_167_ = i + i_166_ * ((Class130) this).anInt1586;
		int i_168_ = 0;
		int i_169_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10294);
		int i_170_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10296);
		int i_171_ = ((Class130) this).anInt1586 - i_170_;
		int i_172_ = 0;
		if (i_166_ <= 0) {
			int i_173_ = 1 - i_166_;
			i_169_ -= i_173_;
			i_168_ += i_173_ * i_170_;
			i_167_ += i_173_ * ((Class130) this).anInt1586;
			i_166_ = 1;
		}
		if (i_166_ + i_169_ >= ((Class130) this).anInt1587) {
			int i_174_ = i_166_ + i_169_ + 1 - ((Class130) this).anInt1587;
			i_169_ -= i_174_;
		}
		if (i <= 0) {
			int i_175_ = 1 - i;
			i_170_ -= i_175_;
			i_168_ += i_175_;
			i_167_ += i_175_;
			i_172_ += i_175_;
			i_171_ += i_175_;
			i = 1;
		}
		if (i + i_170_ >= ((Class130) this).anInt1586) {
			int i_176_ = i + i_170_ + 1 - ((Class130) this).anInt1586;
			i_170_ -= i_176_;
			i_172_ += i_176_;
			i_171_ += i_176_;
		}
		if (i_170_ > 0 && i_169_ > 0) {
			method2295(((Class130) this).aByteArray1588, (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).aByteArray10297), i_168_, i_167_, i_170_, i_169_, i_171_, i_172_);
			method2298(i, i_166_, i_170_, i_169_);
		}
	}

	void method2303(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_177_) {
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10293) + 1;
		i_177_ += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10295) + 1;
		int i_178_ = i + i_177_ * ((Class130) this).anInt1586;
		int i_179_ = 0;
		int i_180_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10294);
		int i_181_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10296);
		int i_182_ = ((Class130) this).anInt1586 - i_181_;
		int i_183_ = 0;
		if (i_177_ <= 0) {
			int i_184_ = 1 - i_177_;
			i_180_ -= i_184_;
			i_179_ += i_184_ * i_181_;
			i_178_ += i_184_ * ((Class130) this).anInt1586;
			i_177_ = 1;
		}
		if (i_177_ + i_180_ >= ((Class130) this).anInt1587) {
			int i_185_ = i_177_ + i_180_ + 1 - ((Class130) this).anInt1587;
			i_180_ -= i_185_;
		}
		if (i <= 0) {
			int i_186_ = 1 - i;
			i_181_ -= i_186_;
			i_179_ += i_186_;
			i_178_ += i_186_;
			i_183_ += i_186_;
			i_182_ += i_186_;
			i = 1;
		}
		if (i + i_181_ >= ((Class130) this).anInt1586) {
			int i_187_ = i + i_181_ + 1 - ((Class130) this).anInt1586;
			i_181_ -= i_187_;
			i_183_ += i_187_;
			i_182_ += i_187_;
		}
		if (i_181_ > 0 && i_180_ > 0) {
			method2295(((Class130) this).aByteArray1588, (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).aByteArray10297), i_179_, i_178_, i_181_, i_180_, i_182_, i_183_);
			method2298(i, i_177_, i_181_, i_180_);
		}
	}

	void method2304(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_188_) {
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10293) + 1;
		i_188_ += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10295) + 1;
		int i_189_ = i + i_188_ * ((Class130) this).anInt1586;
		int i_190_ = 0;
		int i_191_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10294);
		int i_192_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10296);
		int i_193_ = ((Class130) this).anInt1586 - i_192_;
		int i_194_ = 0;
		if (i_188_ <= 0) {
			int i_195_ = 1 - i_188_;
			i_191_ -= i_195_;
			i_190_ += i_195_ * i_192_;
			i_189_ += i_195_ * ((Class130) this).anInt1586;
			i_188_ = 1;
		}
		if (i_188_ + i_191_ >= ((Class130) this).anInt1587) {
			int i_196_ = i_188_ + i_191_ + 1 - ((Class130) this).anInt1587;
			i_191_ -= i_196_;
		}
		if (i <= 0) {
			int i_197_ = 1 - i;
			i_192_ -= i_197_;
			i_190_ += i_197_;
			i_189_ += i_197_;
			i_194_ += i_197_;
			i_193_ += i_197_;
			i = 1;
		}
		if (i + i_192_ >= ((Class130) this).anInt1586) {
			int i_198_ = i + i_192_ + 1 - ((Class130) this).anInt1586;
			i_192_ -= i_198_;
			i_194_ += i_198_;
			i_193_ += i_198_;
		}
		if (i_192_ > 0 && i_191_ > 0) {
			method2295(((Class130) this).aByteArray1588, (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).aByteArray10297), i_190_, i_189_, i_192_, i_191_, i_193_, i_194_);
			method2298(i, i_188_, i_192_, i_191_);
		}
	}

	void method2305(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_199_) {
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10293) + 1;
		i_199_ += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10295) + 1;
		int i_200_ = i + i_199_ * ((Class130) this).anInt1586;
		int i_201_ = 0;
		int i_202_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10294);
		int i_203_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10296);
		int i_204_ = ((Class130) this).anInt1586 - i_203_;
		int i_205_ = 0;
		if (i_199_ <= 0) {
			int i_206_ = 1 - i_199_;
			i_202_ -= i_206_;
			i_201_ += i_206_ * i_203_;
			i_200_ += i_206_ * ((Class130) this).anInt1586;
			i_199_ = 1;
		}
		if (i_199_ + i_202_ >= ((Class130) this).anInt1587) {
			int i_207_ = i_199_ + i_202_ + 1 - ((Class130) this).anInt1587;
			i_202_ -= i_207_;
		}
		if (i <= 0) {
			int i_208_ = 1 - i;
			i_203_ -= i_208_;
			i_201_ += i_208_;
			i_200_ += i_208_;
			i_205_ += i_208_;
			i_204_ += i_208_;
			i = 1;
		}
		if (i + i_203_ >= ((Class130) this).anInt1586) {
			int i_209_ = i + i_203_ + 1 - ((Class130) this).anInt1586;
			i_203_ -= i_209_;
			i_205_ += i_209_;
			i_204_ += i_209_;
		}
		if (i_203_ > 0 && i_202_ > 0) {
			method2296(((Class130) this).aByteArray1588, (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).aByteArray10297), i_201_, i_200_, i_203_, i_202_, i_204_, i_205_);
			method2298(i, i_199_, i_203_, i_202_);
		}
	}

	void method2306() {
		((Class130) this).aClass124ArrayArray1585 = (new Class124[((Class130) this).anInt1591][((Class130) this).anInt1590]);
		for (int i = 0; i < ((Class130) this).anInt1590; i++) {
			for (int i_210_ = 0; i_210_ < ((Class130) this).anInt1591; i_210_++)
				((Class130) this).aClass124ArrayArray1585[i_210_][i] = new Class124(((Class130) this).aClass505_Sub1_1592, this, ((Class130) this).aClass390_Sub2_1584, i_210_, i, ((Class130) this).anInt1589, i_210_ * 128 + 1, i * 128 + 1);
		}
	}

	boolean method2307(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_211_) {
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10293) + 1;
		i_211_ += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10295) + 1;
		int i_212_ = i + i_211_ * ((Class130) this).anInt1586;
		int i_213_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10294);
		int i_214_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10296);
		int i_215_ = ((Class130) this).anInt1586 - i_214_;
		if (i_211_ <= 0) {
			int i_216_ = 1 - i_211_;
			i_213_ -= i_216_;
			i_212_ += i_216_ * ((Class130) this).anInt1586;
			i_211_ = 1;
		}
		if (i_211_ + i_213_ >= ((Class130) this).anInt1587) {
			int i_217_ = i_211_ + i_213_ + 1 - ((Class130) this).anInt1587;
			i_213_ -= i_217_;
		}
		if (i <= 0) {
			int i_218_ = 1 - i;
			i_214_ -= i_218_;
			i_212_ += i_218_;
			i_215_ += i_218_;
			i = 1;
		}
		if (i + i_214_ >= ((Class130) this).anInt1586) {
			int i_219_ = i + i_214_ + 1 - ((Class130) this).anInt1586;
			i_214_ -= i_219_;
			i_215_ += i_219_;
		}
		if (i_214_ <= 0 || i_213_ <= 0)
			return false;
		int i_220_ = 8;
		i_215_ += (i_220_ - 1) * ((Class130) this).anInt1586;
		return method2297(((Class130) this).aByteArray1588, i_212_, i_214_, i_213_, i_215_, i_220_);
	}

	boolean method2308(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_221_) {
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10293) + 1;
		i_221_ += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10295) + 1;
		int i_222_ = i + i_221_ * ((Class130) this).anInt1586;
		int i_223_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10294);
		int i_224_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10296);
		int i_225_ = ((Class130) this).anInt1586 - i_224_;
		if (i_221_ <= 0) {
			int i_226_ = 1 - i_221_;
			i_223_ -= i_226_;
			i_222_ += i_226_ * ((Class130) this).anInt1586;
			i_221_ = 1;
		}
		if (i_221_ + i_223_ >= ((Class130) this).anInt1587) {
			int i_227_ = i_221_ + i_223_ + 1 - ((Class130) this).anInt1587;
			i_223_ -= i_227_;
		}
		if (i <= 0) {
			int i_228_ = 1 - i;
			i_224_ -= i_228_;
			i_222_ += i_228_;
			i_225_ += i_228_;
			i = 1;
		}
		if (i + i_224_ >= ((Class130) this).anInt1586) {
			int i_229_ = i + i_224_ + 1 - ((Class130) this).anInt1586;
			i_224_ -= i_229_;
			i_225_ += i_229_;
		}
		if (i_224_ <= 0 || i_223_ <= 0)
			return false;
		int i_230_ = 8;
		i_225_ += (i_230_ - 1) * ((Class130) this).anInt1586;
		return method2297(((Class130) this).aByteArray1588, i_222_, i_224_, i_223_, i_225_, i_230_);
	}

	void method2309() {
		((Class130) this).aClass124ArrayArray1585 = (new Class124[((Class130) this).anInt1591][((Class130) this).anInt1590]);
		for (int i = 0; i < ((Class130) this).anInt1590; i++) {
			for (int i_231_ = 0; i_231_ < ((Class130) this).anInt1591; i_231_++)
				((Class130) this).aClass124ArrayArray1585[i_231_][i] = new Class124(((Class130) this).aClass505_Sub1_1592, this, ((Class130) this).aClass390_Sub2_1584, i_231_, i, ((Class130) this).anInt1589, i_231_ * 128 + 1, i * 128 + 1);
		}
	}

	void method2310(int i, int i_232_, int i_233_, int i_234_) {
		if (((Class130) this).aClass124ArrayArray1585 != null) {
			int i_235_ = i - 1 >> 7;
			int i_236_ = i - 1 + i_233_ - 1 >> 7;
			int i_237_ = i_232_ - 1 >> 7;
			int i_238_ = i_232_ - 1 + i_234_ - 1 >> 7;
			for (int i_239_ = i_235_; i_239_ <= i_236_; i_239_++) {
				Class124[] class124s = ((Class130) this).aClass124ArrayArray1585[i_239_];
				for (int i_240_ = i_237_; i_240_ <= i_238_; i_240_++)
					((Class124) class124s[i_240_]).aBool1556 = true;
			}
		}
	}

	void method2311(int i, int i_241_, int i_242_, int i_243_) {
		if (((Class130) this).aClass124ArrayArray1585 != null) {
			int i_244_ = i - 1 >> 7;
			int i_245_ = i - 1 + i_242_ - 1 >> 7;
			int i_246_ = i_241_ - 1 >> 7;
			int i_247_ = i_241_ - 1 + i_243_ - 1 >> 7;
			for (int i_248_ = i_244_; i_248_ <= i_245_; i_248_++) {
				Class124[] class124s = ((Class130) this).aClass124ArrayArray1585[i_248_];
				for (int i_249_ = i_246_; i_249_ <= i_247_; i_249_++)
					((Class124) class124s[i_249_]).aBool1556 = true;
			}
		}
	}

	static final void method2312(byte[] is, byte[] is_250_, int i, int i_251_, int i_252_, int i_253_, int i_254_, int i_255_) {
		int i_256_ = -(i_252_ >> 2);
		i_252_ = -(i_252_ & 0x3);
		for (int i_257_ = -i_253_; i_257_ < 0; i_257_++) {
			for (int i_258_ = i_256_; i_258_ < 0; i_258_++) {
				is[i_251_++] -= is_250_[i++];
				is[i_251_++] -= is_250_[i++];
				is[i_251_++] -= is_250_[i++];
				is[i_251_++] -= is_250_[i++];
			}
			for (int i_259_ = i_252_; i_259_ < 0; i_259_++)
				is[i_251_++] -= is_250_[i++];
			i_251_ += i_254_;
			i += i_255_;
		}
	}

	void method2313(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_260_) {
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10293) + 1;
		i_260_ += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10295) + 1;
		int i_261_ = i + i_260_ * ((Class130) this).anInt1586;
		int i_262_ = 0;
		int i_263_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10294);
		int i_264_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10296);
		int i_265_ = ((Class130) this).anInt1586 - i_264_;
		int i_266_ = 0;
		if (i_260_ <= 0) {
			int i_267_ = 1 - i_260_;
			i_263_ -= i_267_;
			i_262_ += i_267_ * i_264_;
			i_261_ += i_267_ * ((Class130) this).anInt1586;
			i_260_ = 1;
		}
		if (i_260_ + i_263_ >= ((Class130) this).anInt1587) {
			int i_268_ = i_260_ + i_263_ + 1 - ((Class130) this).anInt1587;
			i_263_ -= i_268_;
		}
		if (i <= 0) {
			int i_269_ = 1 - i;
			i_264_ -= i_269_;
			i_262_ += i_269_;
			i_261_ += i_269_;
			i_266_ += i_269_;
			i_265_ += i_269_;
			i = 1;
		}
		if (i + i_264_ >= ((Class130) this).anInt1586) {
			int i_270_ = i + i_264_ + 1 - ((Class130) this).anInt1586;
			i_264_ -= i_270_;
			i_266_ += i_270_;
			i_265_ += i_270_;
		}
		if (i_264_ > 0 && i_263_ > 0) {
			method2296(((Class130) this).aByteArray1588, (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).aByteArray10297), i_262_, i_261_, i_264_, i_263_, i_265_, i_266_);
			method2298(i, i_260_, i_264_, i_263_);
		}
	}

	void method2314(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_271_) {
		Class282_Sub50_Sub17_Sub1 class282_sub50_sub17_sub1 = (Class282_Sub50_Sub17_Sub1) class282_sub50_sub17;
		i += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10293) + 1;
		i_271_ += (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10295) + 1;
		int i_272_ = i + i_271_ * ((Class130) this).anInt1586;
		int i_273_ = 0;
		int i_274_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10294);
		int i_275_ = (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).anInt10296);
		int i_276_ = ((Class130) this).anInt1586 - i_275_;
		int i_277_ = 0;
		if (i_271_ <= 0) {
			int i_278_ = 1 - i_271_;
			i_274_ -= i_278_;
			i_273_ += i_278_ * i_275_;
			i_272_ += i_278_ * ((Class130) this).anInt1586;
			i_271_ = 1;
		}
		if (i_271_ + i_274_ >= ((Class130) this).anInt1587) {
			int i_279_ = i_271_ + i_274_ + 1 - ((Class130) this).anInt1587;
			i_274_ -= i_279_;
		}
		if (i <= 0) {
			int i_280_ = 1 - i;
			i_275_ -= i_280_;
			i_273_ += i_280_;
			i_272_ += i_280_;
			i_277_ += i_280_;
			i_276_ += i_280_;
			i = 1;
		}
		if (i + i_275_ >= ((Class130) this).anInt1586) {
			int i_281_ = i + i_275_ + 1 - ((Class130) this).anInt1586;
			i_275_ -= i_281_;
			i_277_ += i_281_;
			i_276_ += i_281_;
		}
		if (i_275_ > 0 && i_274_ > 0) {
			method2295(((Class130) this).aByteArray1588, (((Class282_Sub50_Sub17_Sub1) class282_sub50_sub17_sub1).aByteArray10297), i_273_, i_272_, i_275_, i_274_, i_276_, i_277_);
			method2298(i, i_271_, i_275_, i_274_);
		}
	}

	static final void method2315(byte[] is, byte[] is_282_, int i, int i_283_, int i_284_, int i_285_, int i_286_, int i_287_) {
		int i_288_ = -(i_284_ >> 2);
		i_284_ = -(i_284_ & 0x3);
		for (int i_289_ = -i_285_; i_289_ < 0; i_289_++) {
			for (int i_290_ = i_288_; i_290_ < 0; i_290_++) {
				is[i_283_++] -= is_282_[i++];
				is[i_283_++] -= is_282_[i++];
				is[i_283_++] -= is_282_[i++];
				is[i_283_++] -= is_282_[i++];
			}
			for (int i_291_ = i_284_; i_291_ < 0; i_291_++)
				is[i_283_++] -= is_282_[i++];
			i_283_ += i_286_;
			i += i_287_;
		}
	}

	void method2316() {
		((Class130) this).aClass124ArrayArray1585 = (new Class124[((Class130) this).anInt1591][((Class130) this).anInt1590]);
		for (int i = 0; i < ((Class130) this).anInt1590; i++) {
			for (int i_292_ = 0; i_292_ < ((Class130) this).anInt1591; i_292_++)
				((Class130) this).aClass124ArrayArray1585[i_292_][i] = new Class124(((Class130) this).aClass505_Sub1_1592, this, ((Class130) this).aClass390_Sub2_1584, i_292_, i, ((Class130) this).anInt1589, i_292_ * 128 + 1, i * 128 + 1);
		}
	}

	static final void method2317(byte[] is, byte[] is_293_, int i, int i_294_, int i_295_, int i_296_, int i_297_, int i_298_) {
		int i_299_ = -(i_295_ >> 2);
		i_295_ = -(i_295_ & 0x3);
		for (int i_300_ = -i_296_; i_300_ < 0; i_300_++) {
			for (int i_301_ = i_299_; i_301_ < 0; i_301_++) {
				is[i_294_++] += is_293_[i++];
				is[i_294_++] += is_293_[i++];
				is[i_294_++] += is_293_[i++];
				is[i_294_++] += is_293_[i++];
			}
			for (int i_302_ = i_295_; i_302_ < 0; i_302_++)
				is[i_294_++] += is_293_[i++];
			i_294_ += i_297_;
			i += i_298_;
		}
	}

	static final boolean method2318(byte[] is, int i, int i_303_, int i_304_, int i_305_, int i_306_) {
		int i_307_ = i_303_ % i_306_;
		int i_308_;
		if (i_307_ != 0)
			i_308_ = i_306_ - i_307_;
		else
			i_308_ = 0;
		int i_309_ = -((i_304_ + i_306_ - 1) / i_306_);
		int i_310_ = -((i_303_ + i_306_ - 1) / i_306_);
		for (int i_311_ = i_309_; i_311_ < 0; i_311_++) {
			for (int i_312_ = i_310_; i_312_ < 0; i_312_++) {
				if (is[i] == 0)
					return true;
				i += i_306_;
			}
			i -= i_308_;
			if (is[i - 1] == 0)
				return true;
			i += i_305_;
		}
		return false;
	}
}
