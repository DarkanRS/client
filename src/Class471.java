/* Class471 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class471 {
	static Class459 aClass459_5588 = new Class459();
	static final int anInt5589 = 16;
	static final int anInt5590 = 1;
	static final int anInt5591 = 0;
	static final int anInt5592 = 4096;
	static final int anInt5593 = 6;
	static final int anInt5594 = 23;
	static final int anInt5595 = 50;

	static byte method7827(Class459 class459) {
		return (byte) method7833(8, class459);
	}

	public static int method7828(byte[] is, int i, byte[] is_0_, int i_1_, int i_2_) {
		synchronized (aClass459_5588) {
			((Class459) aClass459_5588).aByteArray5502 = is_0_;
			((Class459) aClass459_5588).anInt5503 = i_2_ * -634067365;
			((Class459) aClass459_5588).aByteArray5526 = is;
			((Class459) aClass459_5588).anInt5506 = 0;
			((Class459) aClass459_5588).anInt5507 = i * -926256369;
			((Class459) aClass459_5588).anInt5532 = 0;
			((Class459) aClass459_5588).anInt5511 = 0;
			((Class459) aClass459_5588).anInt5499 = 0;
			((Class459) aClass459_5588).anInt5508 = 0;
			method7848(aClass459_5588);
			i -= ((Class459) aClass459_5588).anInt5507 * -781968401;
			((Class459) aClass459_5588).aByteArray5502 = null;
			((Class459) aClass459_5588).aByteArray5526 = null;
			int i_3_ = i;
			return i_3_;
		}
	}

	static void method7829(Class459 class459) {
		boolean bool = false;
		boolean bool_4_ = false;
		boolean bool_5_ = false;
		boolean bool_6_ = false;
		boolean bool_7_ = false;
		boolean bool_8_ = false;
		boolean bool_9_ = false;
		boolean bool_10_ = false;
		boolean bool_11_ = false;
		boolean bool_12_ = false;
		boolean bool_13_ = false;
		boolean bool_14_ = false;
		boolean bool_15_ = false;
		boolean bool_16_ = false;
		boolean bool_17_ = false;
		boolean bool_18_ = false;
		boolean bool_19_ = false;
		boolean bool_20_ = false;
		int i = 0;
		int[] is = null;
		int[] is_21_ = null;
		int[] is_22_ = null;
		((Class459) class459).anInt5513 = -132570225;
		if (Class266.anIntArray3288 == null)
			Class266.anIntArray3288 = new int[((Class459) class459).anInt5513 * -1846788256];
		boolean bool_23_ = true;
		while (bool_23_) {
			byte i_24_ = method7831(class459);
			if (i_24_ == 23)
				break;
			i_24_ = method7831(class459);
			i_24_ = method7831(class459);
			i_24_ = method7831(class459);
			i_24_ = method7831(class459);
			i_24_ = method7831(class459);
			i_24_ = method7831(class459);
			i_24_ = method7831(class459);
			i_24_ = method7831(class459);
			i_24_ = method7831(class459);
			i_24_ = method7832(class459);
			if (i_24_ == 0) {
				/* empty */
			}
			((Class459) class459).anInt5514 = 0;
			int i_25_ = method7831(class459);
			((Class459) class459).anInt5514 = (((Class459) class459).anInt5514 * 7401411 << 8 | i_25_ & 0xff) * -1513752341;
			i_25_ = method7831(class459);
			((Class459) class459).anInt5514 = (((Class459) class459).anInt5514 * 7401411 << 8 | i_25_ & 0xff) * -1513752341;
			i_25_ = method7831(class459);
			((Class459) class459).anInt5514 = (((Class459) class459).anInt5514 * 7401411 << 8 | i_25_ & 0xff) * -1513752341;
			for (int i_26_ = 0; i_26_ < 16; i_26_++) {
				i_24_ = method7832(class459);
				if (i_24_ == 1)
					((Class459) class459).aBoolArray5510[i_26_] = true;
				else
					((Class459) class459).aBoolArray5510[i_26_] = false;
			}
			for (int i_27_ = 0; i_27_ < 256; i_27_++)
				((Class459) class459).aBoolArray5497[i_27_] = false;
			for (int i_28_ = 0; i_28_ < 16; i_28_++) {
				if (((Class459) class459).aBoolArray5510[i_28_]) {
					for (int i_29_ = 0; i_29_ < 16; i_29_++) {
						i_24_ = method7832(class459);
						if (i_24_ == 1)
							((Class459) class459).aBoolArray5497[(i_28_ * 16 + i_29_)] = true;
					}
				}
			}
			method7844(class459);
			int i_30_ = ((Class459) class459).anInt5520 * 1440361835 + 2;
			int i_31_ = method7833(3, class459);
			int i_32_ = method7833(15, class459);
			for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
				int i_34_ = 0;
				for (;;) {
					i_24_ = method7832(class459);
					if (i_24_ == 0)
						break;
					i_34_++;
				}
				((Class459) class459).aByteArray5527[i_33_] = (byte) i_34_;
			}
			byte[] is_35_ = new byte[6];
			for (byte i_36_ = 0; i_36_ < i_31_; i_36_++)
				is_35_[i_36_] = i_36_;
			for (int i_37_ = 0; i_37_ < i_32_; i_37_++) {
				byte i_38_ = ((Class459) class459).aByteArray5527[i_37_];
				byte i_39_ = is_35_[i_38_];
				for (/**/; i_38_ > 0; i_38_--)
					is_35_[i_38_] = is_35_[i_38_ - 1];
				is_35_[0] = i_39_;
				((Class459) class459).aByteArray5504[i_37_] = i_39_;
			}
			for (int i_40_ = 0; i_40_ < i_31_; i_40_++) {
				int i_41_ = method7833(5, class459);
				for (int i_42_ = 0; i_42_ < i_30_; i_42_++) {
					for (;;) {
						i_24_ = method7832(class459);
						if (i_24_ == 0)
							break;
						i_24_ = method7832(class459);
						if (i_24_ == 0)
							i_41_++;
						else
							i_41_--;
					}
					((Class459) class459).aByteArrayArray5528[i_40_][i_42_] = (byte) i_41_;
				}
			}
			for (int i_43_ = 0; i_43_ < i_31_; i_43_++) {
				int i_44_ = 32;
				byte i_45_ = 0;
				for (int i_46_ = 0; i_46_ < i_30_; i_46_++) {
					if (((Class459) class459).aByteArrayArray5528[i_43_][i_46_] > i_45_)
						i_45_ = (((Class459) class459).aByteArrayArray5528[i_43_][i_46_]);
					if (((Class459) class459).aByteArrayArray5528[i_43_][i_46_] < i_44_)
						i_44_ = (((Class459) class459).aByteArrayArray5528[i_43_][i_46_]);
				}
				method7835(((Class459) class459).anIntArrayArray5529[i_43_], ((Class459) class459).anIntArrayArray5530[i_43_], ((Class459) class459).anIntArrayArray5531[i_43_], ((Class459) class459).aByteArrayArray5528[i_43_], i_44_, i_45_, i_30_);
				((Class459) class459).anIntArray5533[i_43_] = i_44_;
			}
			int i_47_ = ((Class459) class459).anInt5520 * 1440361835 + 1;
			int i_48_ = -1;
			int i_49_ = 0;
			for (int i_50_ = 0; i_50_ <= 255; i_50_++)
				((Class459) class459).anIntArray5517[i_50_] = 0;
			int i_51_ = 4095;
			for (int i_52_ = 15; i_52_ >= 0; i_52_--) {
				for (int i_53_ = 15; i_53_ >= 0; i_53_--) {
					((Class459) class459).aByteArray5524[i_51_] = (byte) (i_52_ * 16 + i_53_);
					i_51_--;
				}
				((Class459) class459).anIntArray5525[i_52_] = i_51_ + 1;
			}
			int i_54_ = 0;
			if (i_49_ == 0) {
				i_48_++;
				i_49_ = 50;
				byte i_55_ = ((Class459) class459).aByteArray5504[i_48_];
				i = ((Class459) class459).anIntArray5533[i_55_];
				is = ((Class459) class459).anIntArrayArray5529[i_55_];
				is_22_ = ((Class459) class459).anIntArrayArray5531[i_55_];
				is_21_ = ((Class459) class459).anIntArrayArray5530[i_55_];
			}
			i_49_--;
			int i_56_ = i;
			int i_57_;
			int i_58_;
			for (i_58_ = method7833(i_56_, class459); i_58_ > is[i_56_]; i_58_ = i_58_ << 1 | i_57_) {
				i_56_++;
				i_57_ = method7832(class459);
			}
			int i_59_ = is_22_[i_58_ - is_21_[i_56_]];
			while (i_59_ != i_47_) {
				if (i_59_ == 0 || i_59_ == 1) {
					int i_60_ = -1;
					int i_61_ = 1;
					do {
						if (i_59_ == 0)
							i_60_ += 1 * i_61_;
						else if (i_59_ == 1)
							i_60_ += 2 * i_61_;
						i_61_ *= 2;
						if (i_49_ == 0) {
							i_48_++;
							i_49_ = 50;
							byte i_62_ = ((Class459) class459).aByteArray5504[i_48_];
							i = ((Class459) class459).anIntArray5533[i_62_];
							is = (((Class459) class459).anIntArrayArray5529[i_62_]);
							is_22_ = (((Class459) class459).anIntArrayArray5531[i_62_]);
							is_21_ = (((Class459) class459).anIntArrayArray5530[i_62_]);
						}
						i_49_--;
						i_56_ = i;
						for (i_58_ = method7833(i_56_, class459); i_58_ > is[i_56_]; i_58_ = i_58_ << 1 | i_57_) {
							i_56_++;
							i_57_ = method7832(class459);
						}
						i_59_ = is_22_[i_58_ - is_21_[i_56_]];
					} while (i_59_ == 0 || i_59_ == 1);
					i_60_++;
					i_25_ = (((Class459) class459).aByteArray5523[((((Class459) class459).aByteArray5524[((Class459) class459).anIntArray5525[0]]) & 0xff)]);
					((Class459) class459).anIntArray5517[i_25_ & 0xff] += i_60_;
					for (/**/; i_60_ > 0; i_60_--) {
						Class266.anIntArray3288[i_54_] = i_25_ & 0xff;
						i_54_++;
					}
				} else {
					int i_63_ = i_59_ - 1;
					if (i_63_ < 16) {
						int i_64_ = ((Class459) class459).anIntArray5525[0];
						i_24_ = (((Class459) class459).aByteArray5524[i_64_ + i_63_]);
						for (/**/; i_63_ > 3; i_63_ -= 4) {
							int i_65_ = i_64_ + i_63_;
							((Class459) class459).aByteArray5524[i_65_] = (((Class459) class459).aByteArray5524[i_65_ - 1]);
							((Class459) class459).aByteArray5524[i_65_ - 1] = (((Class459) class459).aByteArray5524[i_65_ - 2]);
							((Class459) class459).aByteArray5524[i_65_ - 2] = (((Class459) class459).aByteArray5524[i_65_ - 3]);
							((Class459) class459).aByteArray5524[i_65_ - 3] = (((Class459) class459).aByteArray5524[i_65_ - 4]);
						}
						for (/**/; i_63_ > 0; i_63_--)
							((Class459) class459).aByteArray5524[i_64_ + i_63_] = (((Class459) class459).aByteArray5524[i_64_ + i_63_ - 1]);
						((Class459) class459).aByteArray5524[i_64_] = i_24_;
					} else {
						int i_66_ = i_63_ / 16;
						int i_67_ = i_63_ % 16;
						int i_68_ = (((Class459) class459).anIntArray5525[i_66_] + i_67_);
						i_24_ = ((Class459) class459).aByteArray5524[i_68_];
						for (/**/; (i_68_ > ((Class459) class459).anIntArray5525[i_66_]); i_68_--)
							((Class459) class459).aByteArray5524[i_68_] = (((Class459) class459).aByteArray5524[i_68_ - 1]);
						((Class459) class459).anIntArray5525[i_66_]++;
						for (/**/; i_66_ > 0; i_66_--) {
							((Class459) class459).anIntArray5525[i_66_]--;
							((Class459) class459).aByteArray5524[((Class459) class459).anIntArray5525[i_66_]] = (((Class459) class459).aByteArray5524[(((Class459) class459).anIntArray5525[i_66_ - 1]) + 16 - 1]);
						}
						((Class459) class459).anIntArray5525[0]--;
						((Class459) class459).aByteArray5524[((Class459) class459).anIntArray5525[0]] = i_24_;
						if (((Class459) class459).anIntArray5525[0] == 0) {
							i_51_ = 4095;
							for (int i_69_ = 15; i_69_ >= 0; i_69_--) {
								for (int i_70_ = 15; i_70_ >= 0; i_70_--) {
									((Class459) class459).aByteArray5524[i_51_] = (((Class459) class459).aByteArray5524[(((Class459) class459).anIntArray5525[i_69_]) + i_70_]);
									i_51_--;
								}
								((Class459) class459).anIntArray5525[i_69_] = i_51_ + 1;
							}
						}
					}
					((Class459) class459).anIntArray5517[(((Class459) class459).aByteArray5523[i_24_ & 0xff] & 0xff)]++;
					Class266.anIntArray3288[i_54_] = (((Class459) class459).aByteArray5523[i_24_ & 0xff] & 0xff);
					i_54_++;
					if (i_49_ == 0) {
						i_48_++;
						i_49_ = 50;
						byte i_71_ = ((Class459) class459).aByteArray5504[i_48_];
						i = ((Class459) class459).anIntArray5533[i_71_];
						is = ((Class459) class459).anIntArrayArray5529[i_71_];
						is_22_ = ((Class459) class459).anIntArrayArray5531[i_71_];
						is_21_ = ((Class459) class459).anIntArrayArray5530[i_71_];
					}
					i_49_--;
					i_56_ = i;
					for (i_58_ = method7833(i_56_, class459); i_58_ > is[i_56_]; i_58_ = i_58_ << 1 | i_57_) {
						i_56_++;
						i_57_ = method7832(class459);
					}
					i_59_ = is_22_[i_58_ - is_21_[i_56_]];
				}
			}
			((Class459) class459).anInt5496 = 0;
			((Class459) class459).aByte5509 = (byte) 0;
			((Class459) class459).anIntArray5519[0] = 0;
			for (int i_72_ = 1; i_72_ <= 256; i_72_++)
				((Class459) class459).anIntArray5519[i_72_] = ((Class459) class459).anIntArray5517[i_72_ - 1];
			for (int i_73_ = 1; i_73_ <= 256; i_73_++)
				((Class459) class459).anIntArray5519[i_73_] += ((Class459) class459).anIntArray5519[i_73_ - 1];
			for (int i_74_ = 0; i_74_ < i_54_; i_74_++) {
				i_25_ = (byte) (Class266.anIntArray3288[i_74_] & 0xff);
				Class266.anIntArray3288[(((Class459) class459).anIntArray5519[i_25_ & 0xff])] |= i_74_ << 8;
				((Class459) class459).anIntArray5519[i_25_ & 0xff]++;
			}
			((Class459) class459).anInt5515 = ((Class266.anIntArray3288[((Class459) class459).anInt5514 * 7401411]) >> 8) * -1976927311;
			((Class459) class459).anInt5518 = 0;
			((Class459) class459).anInt5515 = Class266.anIntArray3288[(((Class459) class459).anInt5515 * 1405939025)] * -1976927311;
			((Class459) class459).anInt5516 = ((byte) (((Class459) class459).anInt5515 * 1405939025 & 0xff) * -122800995);
			Class459 class459_75_;
			((Class459) (class459_75_ = class459)).anInt5515 = ((((Class459) class459_75_).anInt5515 * 1405939025 >> 8) * -1976927311);
			((Class459) class459).anInt5518 += 1883830511;
			((Class459) class459).anInt5505 = i_54_ * -133593597;
			method7836(class459);
			if ((((Class459) class459).anInt5518 * 104412687 == ((Class459) class459).anInt5505 * -555494229 + 1) && ((Class459) class459).anInt5496 * 356933387 == 0)
				bool_23_ = true;
			else
				bool_23_ = false;
		}
	}

	static int method7830(int i, Class459 class459) {
		for (;;) {
			if (((Class459) class459).anInt5532 * 561446431 >= i) {
				int i_76_ = ((((Class459) class459).anInt5511 * -749969835 >> ((Class459) class459).anInt5532 * 561446431 - i) & (1 << i) - 1);
				((Class459) class459).anInt5532 -= i * 1364000223;
				return i_76_;
			}
			((Class459) class459).anInt5511 = ((((Class459) class459).anInt5511 * -749969835 << 8 | (((Class459) class459).aByteArray5502[((Class459) class459).anInt5503 * -455484973]) & 0xff) * -154816771);
			((Class459) class459).anInt5532 += -1972900104;
			((Class459) class459).anInt5503 += -634067365;
			((Class459) class459).anInt5499 += 1564222761;
			if (((Class459) class459).anInt5499 * -1736292583 == 0) {
				/* empty */
			}
		}
	}

	static byte method7831(Class459 class459) {
		return (byte) method7833(8, class459);
	}

	static byte method7832(Class459 class459) {
		return (byte) method7833(1, class459);
	}

	static int method7833(int i, Class459 class459) {
		for (;;) {
			if (((Class459) class459).anInt5532 * 561446431 >= i) {
				int i_77_ = ((((Class459) class459).anInt5511 * -749969835 >> ((Class459) class459).anInt5532 * 561446431 - i) & (1 << i) - 1);
				((Class459) class459).anInt5532 -= i * 1364000223;
				return i_77_;
			}
			((Class459) class459).anInt5511 = ((((Class459) class459).anInt5511 * -749969835 << 8 | (((Class459) class459).aByteArray5502[((Class459) class459).anInt5503 * -455484973]) & 0xff) * -154816771);
			((Class459) class459).anInt5532 += -1972900104;
			((Class459) class459).anInt5503 += -634067365;
			((Class459) class459).anInt5499 += 1564222761;
			if (((Class459) class459).anInt5499 * -1736292583 == 0) {
				/* empty */
			}
		}
	}

	static void method7834(Class459 class459) {
		boolean bool = false;
		boolean bool_78_ = false;
		boolean bool_79_ = false;
		boolean bool_80_ = false;
		boolean bool_81_ = false;
		boolean bool_82_ = false;
		boolean bool_83_ = false;
		boolean bool_84_ = false;
		boolean bool_85_ = false;
		boolean bool_86_ = false;
		boolean bool_87_ = false;
		boolean bool_88_ = false;
		boolean bool_89_ = false;
		boolean bool_90_ = false;
		boolean bool_91_ = false;
		boolean bool_92_ = false;
		boolean bool_93_ = false;
		boolean bool_94_ = false;
		int i = 0;
		int[] is = null;
		int[] is_95_ = null;
		int[] is_96_ = null;
		((Class459) class459).anInt5513 = -132570225;
		if (Class266.anIntArray3288 == null)
			Class266.anIntArray3288 = new int[((Class459) class459).anInt5513 * -1846788256];
		boolean bool_97_ = true;
		while (bool_97_) {
			byte i_98_ = method7831(class459);
			if (i_98_ == 23)
				break;
			i_98_ = method7831(class459);
			i_98_ = method7831(class459);
			i_98_ = method7831(class459);
			i_98_ = method7831(class459);
			i_98_ = method7831(class459);
			i_98_ = method7831(class459);
			i_98_ = method7831(class459);
			i_98_ = method7831(class459);
			i_98_ = method7831(class459);
			i_98_ = method7832(class459);
			if (i_98_ == 0) {
				/* empty */
			}
			((Class459) class459).anInt5514 = 0;
			int i_99_ = method7831(class459);
			((Class459) class459).anInt5514 = (((Class459) class459).anInt5514 * 7401411 << 8 | i_99_ & 0xff) * -1513752341;
			i_99_ = method7831(class459);
			((Class459) class459).anInt5514 = (((Class459) class459).anInt5514 * 7401411 << 8 | i_99_ & 0xff) * -1513752341;
			i_99_ = method7831(class459);
			((Class459) class459).anInt5514 = (((Class459) class459).anInt5514 * 7401411 << 8 | i_99_ & 0xff) * -1513752341;
			for (int i_100_ = 0; i_100_ < 16; i_100_++) {
				i_98_ = method7832(class459);
				if (i_98_ == 1)
					((Class459) class459).aBoolArray5510[i_100_] = true;
				else
					((Class459) class459).aBoolArray5510[i_100_] = false;
			}
			for (int i_101_ = 0; i_101_ < 256; i_101_++)
				((Class459) class459).aBoolArray5497[i_101_] = false;
			for (int i_102_ = 0; i_102_ < 16; i_102_++) {
				if (((Class459) class459).aBoolArray5510[i_102_]) {
					for (int i_103_ = 0; i_103_ < 16; i_103_++) {
						i_98_ = method7832(class459);
						if (i_98_ == 1)
							((Class459) class459).aBoolArray5497[(i_102_ * 16 + i_103_)] = true;
					}
				}
			}
			method7844(class459);
			int i_104_ = ((Class459) class459).anInt5520 * 1440361835 + 2;
			int i_105_ = method7833(3, class459);
			int i_106_ = method7833(15, class459);
			for (int i_107_ = 0; i_107_ < i_106_; i_107_++) {
				int i_108_ = 0;
				for (;;) {
					i_98_ = method7832(class459);
					if (i_98_ == 0)
						break;
					i_108_++;
				}
				((Class459) class459).aByteArray5527[i_107_] = (byte) i_108_;
			}
			byte[] is_109_ = new byte[6];
			for (byte i_110_ = 0; i_110_ < i_105_; i_110_++)
				is_109_[i_110_] = i_110_;
			for (int i_111_ = 0; i_111_ < i_106_; i_111_++) {
				byte i_112_ = ((Class459) class459).aByteArray5527[i_111_];
				byte i_113_ = is_109_[i_112_];
				for (/**/; i_112_ > 0; i_112_--)
					is_109_[i_112_] = is_109_[i_112_ - 1];
				is_109_[0] = i_113_;
				((Class459) class459).aByteArray5504[i_111_] = i_113_;
			}
			for (int i_114_ = 0; i_114_ < i_105_; i_114_++) {
				int i_115_ = method7833(5, class459);
				for (int i_116_ = 0; i_116_ < i_104_; i_116_++) {
					for (;;) {
						i_98_ = method7832(class459);
						if (i_98_ == 0)
							break;
						i_98_ = method7832(class459);
						if (i_98_ == 0)
							i_115_++;
						else
							i_115_--;
					}
					((Class459) class459).aByteArrayArray5528[i_114_][i_116_] = (byte) i_115_;
				}
			}
			for (int i_117_ = 0; i_117_ < i_105_; i_117_++) {
				int i_118_ = 32;
				byte i_119_ = 0;
				for (int i_120_ = 0; i_120_ < i_104_; i_120_++) {
					if ((((Class459) class459).aByteArrayArray5528[i_117_][i_120_]) > i_119_)
						i_119_ = (((Class459) class459).aByteArrayArray5528[i_117_][i_120_]);
					if ((((Class459) class459).aByteArrayArray5528[i_117_][i_120_]) < i_118_)
						i_118_ = (((Class459) class459).aByteArrayArray5528[i_117_][i_120_]);
				}
				method7835(((Class459) class459).anIntArrayArray5529[i_117_], ((Class459) class459).anIntArrayArray5530[i_117_], ((Class459) class459).anIntArrayArray5531[i_117_], ((Class459) class459).aByteArrayArray5528[i_117_], i_118_, i_119_, i_104_);
				((Class459) class459).anIntArray5533[i_117_] = i_118_;
			}
			int i_121_ = ((Class459) class459).anInt5520 * 1440361835 + 1;
			int i_122_ = -1;
			int i_123_ = 0;
			for (int i_124_ = 0; i_124_ <= 255; i_124_++)
				((Class459) class459).anIntArray5517[i_124_] = 0;
			int i_125_ = 4095;
			for (int i_126_ = 15; i_126_ >= 0; i_126_--) {
				for (int i_127_ = 15; i_127_ >= 0; i_127_--) {
					((Class459) class459).aByteArray5524[i_125_] = (byte) (i_126_ * 16 + i_127_);
					i_125_--;
				}
				((Class459) class459).anIntArray5525[i_126_] = i_125_ + 1;
			}
			int i_128_ = 0;
			if (i_123_ == 0) {
				i_122_++;
				i_123_ = 50;
				byte i_129_ = ((Class459) class459).aByteArray5504[i_122_];
				i = ((Class459) class459).anIntArray5533[i_129_];
				is = ((Class459) class459).anIntArrayArray5529[i_129_];
				is_96_ = ((Class459) class459).anIntArrayArray5531[i_129_];
				is_95_ = ((Class459) class459).anIntArrayArray5530[i_129_];
			}
			i_123_--;
			int i_130_ = i;
			int i_131_;
			int i_132_;
			for (i_132_ = method7833(i_130_, class459); i_132_ > is[i_130_]; i_132_ = i_132_ << 1 | i_131_) {
				i_130_++;
				i_131_ = method7832(class459);
			}
			int i_133_ = is_96_[i_132_ - is_95_[i_130_]];
			while (i_133_ != i_121_) {
				if (i_133_ == 0 || i_133_ == 1) {
					int i_134_ = -1;
					int i_135_ = 1;
					do {
						if (i_133_ == 0)
							i_134_ += 1 * i_135_;
						else if (i_133_ == 1)
							i_134_ += 2 * i_135_;
						i_135_ *= 2;
						if (i_123_ == 0) {
							i_122_++;
							i_123_ = 50;
							byte i_136_ = ((Class459) class459).aByteArray5504[i_122_];
							i = ((Class459) class459).anIntArray5533[i_136_];
							is = (((Class459) class459).anIntArrayArray5529[i_136_]);
							is_96_ = (((Class459) class459).anIntArrayArray5531[i_136_]);
							is_95_ = (((Class459) class459).anIntArrayArray5530[i_136_]);
						}
						i_123_--;
						i_130_ = i;
						for (i_132_ = method7833(i_130_, class459); i_132_ > is[i_130_]; i_132_ = i_132_ << 1 | i_131_) {
							i_130_++;
							i_131_ = method7832(class459);
						}
						i_133_ = is_96_[i_132_ - is_95_[i_130_]];
					} while (i_133_ == 0 || i_133_ == 1);
					i_134_++;
					i_99_ = (((Class459) class459).aByteArray5523[((((Class459) class459).aByteArray5524[((Class459) class459).anIntArray5525[0]]) & 0xff)]);
					((Class459) class459).anIntArray5517[i_99_ & 0xff] += i_134_;
					for (/**/; i_134_ > 0; i_134_--) {
						Class266.anIntArray3288[i_128_] = i_99_ & 0xff;
						i_128_++;
					}
				} else {
					int i_137_ = i_133_ - 1;
					if (i_137_ < 16) {
						int i_138_ = ((Class459) class459).anIntArray5525[0];
						i_98_ = (((Class459) class459).aByteArray5524[i_138_ + i_137_]);
						for (/**/; i_137_ > 3; i_137_ -= 4) {
							int i_139_ = i_138_ + i_137_;
							((Class459) class459).aByteArray5524[i_139_] = (((Class459) class459).aByteArray5524[i_139_ - 1]);
							((Class459) class459).aByteArray5524[i_139_ - 1] = (((Class459) class459).aByteArray5524[i_139_ - 2]);
							((Class459) class459).aByteArray5524[i_139_ - 2] = (((Class459) class459).aByteArray5524[i_139_ - 3]);
							((Class459) class459).aByteArray5524[i_139_ - 3] = (((Class459) class459).aByteArray5524[i_139_ - 4]);
						}
						for (/**/; i_137_ > 0; i_137_--)
							((Class459) class459).aByteArray5524[(i_138_ + i_137_)] = (((Class459) class459).aByteArray5524[i_138_ + i_137_ - 1]);
						((Class459) class459).aByteArray5524[i_138_] = i_98_;
					} else {
						int i_140_ = i_137_ / 16;
						int i_141_ = i_137_ % 16;
						int i_142_ = (((Class459) class459).anIntArray5525[i_140_] + i_141_);
						i_98_ = ((Class459) class459).aByteArray5524[i_142_];
						for (/**/; (i_142_ > ((Class459) class459).anIntArray5525[i_140_]); i_142_--)
							((Class459) class459).aByteArray5524[i_142_] = (((Class459) class459).aByteArray5524[i_142_ - 1]);
						((Class459) class459).anIntArray5525[i_140_]++;
						for (/**/; i_140_ > 0; i_140_--) {
							((Class459) class459).anIntArray5525[i_140_]--;
							((Class459) class459).aByteArray5524[((Class459) class459).anIntArray5525[i_140_]] = (((Class459) class459).aByteArray5524[(((Class459) class459).anIntArray5525[i_140_ - 1]) + 16 - 1]);
						}
						((Class459) class459).anIntArray5525[0]--;
						((Class459) class459).aByteArray5524[((Class459) class459).anIntArray5525[0]] = i_98_;
						if (((Class459) class459).anIntArray5525[0] == 0) {
							i_125_ = 4095;
							for (int i_143_ = 15; i_143_ >= 0; i_143_--) {
								for (int i_144_ = 15; i_144_ >= 0; i_144_--) {
									((Class459) class459).aByteArray5524[i_125_] = (((Class459) class459).aByteArray5524[((((Class459) class459).anIntArray5525[i_143_]) + i_144_)]);
									i_125_--;
								}
								((Class459) class459).anIntArray5525[i_143_] = i_125_ + 1;
							}
						}
					}
					((Class459) class459).anIntArray5517[(((Class459) class459).aByteArray5523[i_98_ & 0xff] & 0xff)]++;
					Class266.anIntArray3288[i_128_] = (((Class459) class459).aByteArray5523[i_98_ & 0xff] & 0xff);
					i_128_++;
					if (i_123_ == 0) {
						i_122_++;
						i_123_ = 50;
						byte i_145_ = ((Class459) class459).aByteArray5504[i_122_];
						i = ((Class459) class459).anIntArray5533[i_145_];
						is = ((Class459) class459).anIntArrayArray5529[i_145_];
						is_96_ = (((Class459) class459).anIntArrayArray5531[i_145_]);
						is_95_ = (((Class459) class459).anIntArrayArray5530[i_145_]);
					}
					i_123_--;
					i_130_ = i;
					for (i_132_ = method7833(i_130_, class459); i_132_ > is[i_130_]; i_132_ = i_132_ << 1 | i_131_) {
						i_130_++;
						i_131_ = method7832(class459);
					}
					i_133_ = is_96_[i_132_ - is_95_[i_130_]];
				}
			}
			((Class459) class459).anInt5496 = 0;
			((Class459) class459).aByte5509 = (byte) 0;
			((Class459) class459).anIntArray5519[0] = 0;
			for (int i_146_ = 1; i_146_ <= 256; i_146_++)
				((Class459) class459).anIntArray5519[i_146_] = ((Class459) class459).anIntArray5517[i_146_ - 1];
			for (int i_147_ = 1; i_147_ <= 256; i_147_++)
				((Class459) class459).anIntArray5519[i_147_] += ((Class459) class459).anIntArray5519[i_147_ - 1];
			for (int i_148_ = 0; i_148_ < i_128_; i_148_++) {
				i_99_ = (byte) (Class266.anIntArray3288[i_148_] & 0xff);
				Class266.anIntArray3288[(((Class459) class459).anIntArray5519[i_99_ & 0xff])] |= i_148_ << 8;
				((Class459) class459).anIntArray5519[i_99_ & 0xff]++;
			}
			((Class459) class459).anInt5515 = ((Class266.anIntArray3288[((Class459) class459).anInt5514 * 7401411]) >> 8) * -1976927311;
			((Class459) class459).anInt5518 = 0;
			((Class459) class459).anInt5515 = Class266.anIntArray3288[(((Class459) class459).anInt5515 * 1405939025)] * -1976927311;
			((Class459) class459).anInt5516 = ((byte) (((Class459) class459).anInt5515 * 1405939025 & 0xff) * -122800995);
			Class459 class459_149_;
			((Class459) (class459_149_ = class459)).anInt5515 = ((((Class459) class459_149_).anInt5515 * 1405939025 >> 8) * -1976927311);
			((Class459) class459).anInt5518 += 1883830511;
			((Class459) class459).anInt5505 = i_128_ * -133593597;
			method7836(class459);
			if ((((Class459) class459).anInt5518 * 104412687 == ((Class459) class459).anInt5505 * -555494229 + 1) && ((Class459) class459).anInt5496 * 356933387 == 0)
				bool_97_ = true;
			else
				bool_97_ = false;
		}
	}

	static void method7835(int[] is, int[] is_150_, int[] is_151_, byte[] is_152_, int i, int i_153_, int i_154_) {
		int i_155_ = 0;
		for (int i_156_ = i; i_156_ <= i_153_; i_156_++) {
			for (int i_157_ = 0; i_157_ < i_154_; i_157_++) {
				if (is_152_[i_157_] == i_156_) {
					is_151_[i_155_] = i_157_;
					i_155_++;
				}
			}
		}
		for (int i_158_ = 0; i_158_ < 23; i_158_++)
			is_150_[i_158_] = 0;
		for (int i_159_ = 0; i_159_ < i_154_; i_159_++)
			is_150_[is_152_[i_159_] + 1]++;
		for (int i_160_ = 1; i_160_ < 23; i_160_++)
			is_150_[i_160_] += is_150_[i_160_ - 1];
		for (int i_161_ = 0; i_161_ < 23; i_161_++)
			is[i_161_] = 0;
		int i_162_ = 0;
		for (int i_163_ = i; i_163_ <= i_153_; i_163_++) {
			i_162_ += is_150_[i_163_ + 1] - is_150_[i_163_];
			is[i_163_] = i_162_ - 1;
			i_162_ <<= 1;
		}
		for (int i_164_ = i + 1; i_164_ <= i_153_; i_164_++)
			is_150_[i_164_] = (is[i_164_ - 1] + 1 << 1) - is_150_[i_164_];
	}

	static void method7836(Class459 class459) {
		byte i = ((Class459) class459).aByte5509;
		int i_165_ = ((Class459) class459).anInt5496 * 356933387;
		int i_166_ = ((Class459) class459).anInt5518 * 104412687;
		int i_167_ = ((Class459) class459).anInt5516 * -2072907339;
		int[] is = Class266.anIntArray3288;
		int i_168_ = ((Class459) class459).anInt5515 * 1405939025;
		byte[] is_169_ = ((Class459) class459).aByteArray5526;
		int i_170_ = ((Class459) class459).anInt5506 * 58559029;
		int i_171_ = ((Class459) class459).anInt5507 * -781968401;
		int i_172_ = i_171_;
		int i_173_ = ((Class459) class459).anInt5505 * -555494229 + 1;
		while_177_: for (;;) {
			if (i_165_ > 0) {
				for (;;) {
					if (i_171_ == 0)
						break while_177_;
					if (i_165_ == 1)
						break;
					is_169_[i_170_] = i;
					i_165_--;
					i_170_++;
					i_171_--;
				}
				if (i_171_ == 0) {
					i_165_ = 1;
					break;
				}
				is_169_[i_170_] = i;
				i_170_++;
				i_171_--;
			}
			for (;;) {
				if (i_166_ == i_173_) {
					i_165_ = 0;
					break while_177_;
				}
				i = (byte) i_167_;
				i_168_ = is[i_168_];
				int i_174_ = (byte) i_168_;
				i_168_ >>= 8;
				i_166_++;
				if (i_174_ != i_167_) {
					i_167_ = i_174_;
					if (i_171_ == 0) {
						i_165_ = 1;
						break while_177_;
					}
					is_169_[i_170_] = i;
					i_170_++;
					i_171_--;
				} else {
					if (i_166_ != i_173_)
						break;
					if (i_171_ == 0) {
						i_165_ = 1;
						break while_177_;
					}
					is_169_[i_170_] = i;
					i_170_++;
					i_171_--;
				}
			}
			i_165_ = 2;
			i_168_ = is[i_168_];
			int i_175_ = (byte) i_168_;
			i_168_ >>= 8;
			if (++i_166_ != i_173_) {
				if (i_175_ != i_167_)
					i_167_ = i_175_;
				else {
					i_165_ = 3;
					i_168_ = is[i_168_];
					i_175_ = (byte) i_168_;
					i_168_ >>= 8;
					if (++i_166_ != i_173_) {
						if (i_175_ != i_167_)
							i_167_ = i_175_;
						else {
							i_168_ = is[i_168_];
							i_175_ = (byte) i_168_;
							i_168_ >>= 8;
							i_166_++;
							i_165_ = (i_175_ & 0xff) + 4;
							i_168_ = is[i_168_];
							i_167_ = (byte) i_168_;
							i_168_ >>= 8;
							i_166_++;
						}
					}
				}
			}
		}
		int i_176_ = ((Class459) class459).anInt5508 * -1596412131;
		((Class459) class459).anInt5508 += (i_172_ - i_171_) * -1541698763;
		if (((Class459) class459).anInt5508 * -1596412131 >= i_176_) {
			/* empty */
		}
		((Class459) class459).aByte5509 = i;
		((Class459) class459).anInt5496 = i_165_ * -508431197;
		((Class459) class459).anInt5518 = i_166_ * 1883830511;
		((Class459) class459).anInt5516 = i_167_ * -122800995;
		Class266.anIntArray3288 = is;
		((Class459) class459).anInt5515 = i_168_ * -1976927311;
		((Class459) class459).aByteArray5526 = is_169_;
		((Class459) class459).anInt5506 = i_170_ * -2049640419;
		((Class459) class459).anInt5507 = i_171_ * -926256369;
	}

	static void method7837(int[] is, int[] is_177_, int[] is_178_, byte[] is_179_, int i, int i_180_, int i_181_) {
		int i_182_ = 0;
		for (int i_183_ = i; i_183_ <= i_180_; i_183_++) {
			for (int i_184_ = 0; i_184_ < i_181_; i_184_++) {
				if (is_179_[i_184_] == i_183_) {
					is_178_[i_182_] = i_184_;
					i_182_++;
				}
			}
		}
		for (int i_185_ = 0; i_185_ < 23; i_185_++)
			is_177_[i_185_] = 0;
		for (int i_186_ = 0; i_186_ < i_181_; i_186_++)
			is_177_[is_179_[i_186_] + 1]++;
		for (int i_187_ = 1; i_187_ < 23; i_187_++)
			is_177_[i_187_] += is_177_[i_187_ - 1];
		for (int i_188_ = 0; i_188_ < 23; i_188_++)
			is[i_188_] = 0;
		int i_189_ = 0;
		for (int i_190_ = i; i_190_ <= i_180_; i_190_++) {
			i_189_ += is_177_[i_190_ + 1] - is_177_[i_190_];
			is[i_190_] = i_189_ - 1;
			i_189_ <<= 1;
		}
		for (int i_191_ = i + 1; i_191_ <= i_180_; i_191_++)
			is_177_[i_191_] = (is[i_191_ - 1] + 1 << 1) - is_177_[i_191_];
	}

	static void method7838(Class459 class459) {
		byte i = ((Class459) class459).aByte5509;
		int i_192_ = ((Class459) class459).anInt5496 * 356933387;
		int i_193_ = ((Class459) class459).anInt5518 * 104412687;
		int i_194_ = ((Class459) class459).anInt5516 * -2072907339;
		int[] is = Class266.anIntArray3288;
		int i_195_ = ((Class459) class459).anInt5515 * 1405939025;
		byte[] is_196_ = ((Class459) class459).aByteArray5526;
		int i_197_ = ((Class459) class459).anInt5506 * 58559029;
		int i_198_ = ((Class459) class459).anInt5507 * -781968401;
		int i_199_ = i_198_;
		int i_200_ = ((Class459) class459).anInt5505 * -555494229 + 1;
		while_178_: for (;;) {
			if (i_192_ > 0) {
				for (;;) {
					if (i_198_ == 0)
						break while_178_;
					if (i_192_ == 1)
						break;
					is_196_[i_197_] = i;
					i_192_--;
					i_197_++;
					i_198_--;
				}
				if (i_198_ == 0) {
					i_192_ = 1;
					break;
				}
				is_196_[i_197_] = i;
				i_197_++;
				i_198_--;
			}
			for (;;) {
				if (i_193_ == i_200_) {
					i_192_ = 0;
					break while_178_;
				}
				i = (byte) i_194_;
				i_195_ = is[i_195_];
				int i_201_ = (byte) i_195_;
				i_195_ >>= 8;
				i_193_++;
				if (i_201_ != i_194_) {
					i_194_ = i_201_;
					if (i_198_ == 0) {
						i_192_ = 1;
						break while_178_;
					}
					is_196_[i_197_] = i;
					i_197_++;
					i_198_--;
				} else {
					if (i_193_ != i_200_)
						break;
					if (i_198_ == 0) {
						i_192_ = 1;
						break while_178_;
					}
					is_196_[i_197_] = i;
					i_197_++;
					i_198_--;
				}
			}
			i_192_ = 2;
			i_195_ = is[i_195_];
			int i_202_ = (byte) i_195_;
			i_195_ >>= 8;
			if (++i_193_ != i_200_) {
				if (i_202_ != i_194_)
					i_194_ = i_202_;
				else {
					i_192_ = 3;
					i_195_ = is[i_195_];
					i_202_ = (byte) i_195_;
					i_195_ >>= 8;
					if (++i_193_ != i_200_) {
						if (i_202_ != i_194_)
							i_194_ = i_202_;
						else {
							i_195_ = is[i_195_];
							i_202_ = (byte) i_195_;
							i_195_ >>= 8;
							i_193_++;
							i_192_ = (i_202_ & 0xff) + 4;
							i_195_ = is[i_195_];
							i_194_ = (byte) i_195_;
							i_195_ >>= 8;
							i_193_++;
						}
					}
				}
			}
		}
		int i_203_ = ((Class459) class459).anInt5508 * -1596412131;
		((Class459) class459).anInt5508 += (i_199_ - i_198_) * -1541698763;
		if (((Class459) class459).anInt5508 * -1596412131 >= i_203_) {
			/* empty */
		}
		((Class459) class459).aByte5509 = i;
		((Class459) class459).anInt5496 = i_192_ * -508431197;
		((Class459) class459).anInt5518 = i_193_ * 1883830511;
		((Class459) class459).anInt5516 = i_194_ * -122800995;
		Class266.anIntArray3288 = is;
		((Class459) class459).anInt5515 = i_195_ * -1976927311;
		((Class459) class459).aByteArray5526 = is_196_;
		((Class459) class459).anInt5506 = i_197_ * -2049640419;
		((Class459) class459).anInt5507 = i_198_ * -926256369;
	}

	Class471() throws Throwable {
		throw new Error();
	}

	static void method7839(Class459 class459) {
		boolean bool = false;
		boolean bool_204_ = false;
		boolean bool_205_ = false;
		boolean bool_206_ = false;
		boolean bool_207_ = false;
		boolean bool_208_ = false;
		boolean bool_209_ = false;
		boolean bool_210_ = false;
		boolean bool_211_ = false;
		boolean bool_212_ = false;
		boolean bool_213_ = false;
		boolean bool_214_ = false;
		boolean bool_215_ = false;
		boolean bool_216_ = false;
		boolean bool_217_ = false;
		boolean bool_218_ = false;
		boolean bool_219_ = false;
		boolean bool_220_ = false;
		int i = 0;
		int[] is = null;
		int[] is_221_ = null;
		int[] is_222_ = null;
		((Class459) class459).anInt5513 = -132570225;
		if (Class266.anIntArray3288 == null)
			Class266.anIntArray3288 = new int[((Class459) class459).anInt5513 * -1846788256];
		boolean bool_223_ = true;
		while (bool_223_) {
			byte i_224_ = method7831(class459);
			if (i_224_ == 23)
				break;
			i_224_ = method7831(class459);
			i_224_ = method7831(class459);
			i_224_ = method7831(class459);
			i_224_ = method7831(class459);
			i_224_ = method7831(class459);
			i_224_ = method7831(class459);
			i_224_ = method7831(class459);
			i_224_ = method7831(class459);
			i_224_ = method7831(class459);
			i_224_ = method7832(class459);
			if (i_224_ == 0) {
				/* empty */
			}
			((Class459) class459).anInt5514 = 0;
			int i_225_ = method7831(class459);
			((Class459) class459).anInt5514 = (((Class459) class459).anInt5514 * 7401411 << 8 | i_225_ & 0xff) * -1513752341;
			i_225_ = method7831(class459);
			((Class459) class459).anInt5514 = (((Class459) class459).anInt5514 * 7401411 << 8 | i_225_ & 0xff) * -1513752341;
			i_225_ = method7831(class459);
			((Class459) class459).anInt5514 = (((Class459) class459).anInt5514 * 7401411 << 8 | i_225_ & 0xff) * -1513752341;
			for (int i_226_ = 0; i_226_ < 16; i_226_++) {
				i_224_ = method7832(class459);
				if (i_224_ == 1)
					((Class459) class459).aBoolArray5510[i_226_] = true;
				else
					((Class459) class459).aBoolArray5510[i_226_] = false;
			}
			for (int i_227_ = 0; i_227_ < 256; i_227_++)
				((Class459) class459).aBoolArray5497[i_227_] = false;
			for (int i_228_ = 0; i_228_ < 16; i_228_++) {
				if (((Class459) class459).aBoolArray5510[i_228_]) {
					for (int i_229_ = 0; i_229_ < 16; i_229_++) {
						i_224_ = method7832(class459);
						if (i_224_ == 1)
							((Class459) class459).aBoolArray5497[(i_228_ * 16 + i_229_)] = true;
					}
				}
			}
			method7844(class459);
			int i_230_ = ((Class459) class459).anInt5520 * 1440361835 + 2;
			int i_231_ = method7833(3, class459);
			int i_232_ = method7833(15, class459);
			for (int i_233_ = 0; i_233_ < i_232_; i_233_++) {
				int i_234_ = 0;
				for (;;) {
					i_224_ = method7832(class459);
					if (i_224_ == 0)
						break;
					i_234_++;
				}
				((Class459) class459).aByteArray5527[i_233_] = (byte) i_234_;
			}
			byte[] is_235_ = new byte[6];
			for (byte i_236_ = 0; i_236_ < i_231_; i_236_++)
				is_235_[i_236_] = i_236_;
			for (int i_237_ = 0; i_237_ < i_232_; i_237_++) {
				byte i_238_ = ((Class459) class459).aByteArray5527[i_237_];
				byte i_239_ = is_235_[i_238_];
				for (/**/; i_238_ > 0; i_238_--)
					is_235_[i_238_] = is_235_[i_238_ - 1];
				is_235_[0] = i_239_;
				((Class459) class459).aByteArray5504[i_237_] = i_239_;
			}
			for (int i_240_ = 0; i_240_ < i_231_; i_240_++) {
				int i_241_ = method7833(5, class459);
				for (int i_242_ = 0; i_242_ < i_230_; i_242_++) {
					for (;;) {
						i_224_ = method7832(class459);
						if (i_224_ == 0)
							break;
						i_224_ = method7832(class459);
						if (i_224_ == 0)
							i_241_++;
						else
							i_241_--;
					}
					((Class459) class459).aByteArrayArray5528[i_240_][i_242_] = (byte) i_241_;
				}
			}
			for (int i_243_ = 0; i_243_ < i_231_; i_243_++) {
				int i_244_ = 32;
				byte i_245_ = 0;
				for (int i_246_ = 0; i_246_ < i_230_; i_246_++) {
					if ((((Class459) class459).aByteArrayArray5528[i_243_][i_246_]) > i_245_)
						i_245_ = (((Class459) class459).aByteArrayArray5528[i_243_][i_246_]);
					if ((((Class459) class459).aByteArrayArray5528[i_243_][i_246_]) < i_244_)
						i_244_ = (((Class459) class459).aByteArrayArray5528[i_243_][i_246_]);
				}
				method7835(((Class459) class459).anIntArrayArray5529[i_243_], ((Class459) class459).anIntArrayArray5530[i_243_], ((Class459) class459).anIntArrayArray5531[i_243_], ((Class459) class459).aByteArrayArray5528[i_243_], i_244_, i_245_, i_230_);
				((Class459) class459).anIntArray5533[i_243_] = i_244_;
			}
			int i_247_ = ((Class459) class459).anInt5520 * 1440361835 + 1;
			int i_248_ = -1;
			int i_249_ = 0;
			for (int i_250_ = 0; i_250_ <= 255; i_250_++)
				((Class459) class459).anIntArray5517[i_250_] = 0;
			int i_251_ = 4095;
			for (int i_252_ = 15; i_252_ >= 0; i_252_--) {
				for (int i_253_ = 15; i_253_ >= 0; i_253_--) {
					((Class459) class459).aByteArray5524[i_251_] = (byte) (i_252_ * 16 + i_253_);
					i_251_--;
				}
				((Class459) class459).anIntArray5525[i_252_] = i_251_ + 1;
			}
			int i_254_ = 0;
			if (i_249_ == 0) {
				i_248_++;
				i_249_ = 50;
				byte i_255_ = ((Class459) class459).aByteArray5504[i_248_];
				i = ((Class459) class459).anIntArray5533[i_255_];
				is = ((Class459) class459).anIntArrayArray5529[i_255_];
				is_222_ = ((Class459) class459).anIntArrayArray5531[i_255_];
				is_221_ = ((Class459) class459).anIntArrayArray5530[i_255_];
			}
			i_249_--;
			int i_256_ = i;
			int i_257_;
			int i_258_;
			for (i_258_ = method7833(i_256_, class459); i_258_ > is[i_256_]; i_258_ = i_258_ << 1 | i_257_) {
				i_256_++;
				i_257_ = method7832(class459);
			}
			int i_259_ = is_222_[i_258_ - is_221_[i_256_]];
			while (i_259_ != i_247_) {
				if (i_259_ == 0 || i_259_ == 1) {
					int i_260_ = -1;
					int i_261_ = 1;
					do {
						if (i_259_ == 0)
							i_260_ += 1 * i_261_;
						else if (i_259_ == 1)
							i_260_ += 2 * i_261_;
						i_261_ *= 2;
						if (i_249_ == 0) {
							i_248_++;
							i_249_ = 50;
							byte i_262_ = ((Class459) class459).aByteArray5504[i_248_];
							i = ((Class459) class459).anIntArray5533[i_262_];
							is = (((Class459) class459).anIntArrayArray5529[i_262_]);
							is_222_ = (((Class459) class459).anIntArrayArray5531[i_262_]);
							is_221_ = (((Class459) class459).anIntArrayArray5530[i_262_]);
						}
						i_249_--;
						i_256_ = i;
						for (i_258_ = method7833(i_256_, class459); i_258_ > is[i_256_]; i_258_ = i_258_ << 1 | i_257_) {
							i_256_++;
							i_257_ = method7832(class459);
						}
						i_259_ = is_222_[i_258_ - is_221_[i_256_]];
					} while (i_259_ == 0 || i_259_ == 1);
					i_260_++;
					i_225_ = (((Class459) class459).aByteArray5523[((((Class459) class459).aByteArray5524[((Class459) class459).anIntArray5525[0]]) & 0xff)]);
					((Class459) class459).anIntArray5517[i_225_ & 0xff] += i_260_;
					for (/**/; i_260_ > 0; i_260_--) {
						Class266.anIntArray3288[i_254_] = i_225_ & 0xff;
						i_254_++;
					}
				} else {
					int i_263_ = i_259_ - 1;
					if (i_263_ < 16) {
						int i_264_ = ((Class459) class459).anIntArray5525[0];
						i_224_ = (((Class459) class459).aByteArray5524[i_264_ + i_263_]);
						for (/**/; i_263_ > 3; i_263_ -= 4) {
							int i_265_ = i_264_ + i_263_;
							((Class459) class459).aByteArray5524[i_265_] = (((Class459) class459).aByteArray5524[i_265_ - 1]);
							((Class459) class459).aByteArray5524[i_265_ - 1] = (((Class459) class459).aByteArray5524[i_265_ - 2]);
							((Class459) class459).aByteArray5524[i_265_ - 2] = (((Class459) class459).aByteArray5524[i_265_ - 3]);
							((Class459) class459).aByteArray5524[i_265_ - 3] = (((Class459) class459).aByteArray5524[i_265_ - 4]);
						}
						for (/**/; i_263_ > 0; i_263_--)
							((Class459) class459).aByteArray5524[(i_264_ + i_263_)] = (((Class459) class459).aByteArray5524[i_264_ + i_263_ - 1]);
						((Class459) class459).aByteArray5524[i_264_] = i_224_;
					} else {
						int i_266_ = i_263_ / 16;
						int i_267_ = i_263_ % 16;
						int i_268_ = (((Class459) class459).anIntArray5525[i_266_] + i_267_);
						i_224_ = ((Class459) class459).aByteArray5524[i_268_];
						for (/**/; (i_268_ > ((Class459) class459).anIntArray5525[i_266_]); i_268_--)
							((Class459) class459).aByteArray5524[i_268_] = (((Class459) class459).aByteArray5524[i_268_ - 1]);
						((Class459) class459).anIntArray5525[i_266_]++;
						for (/**/; i_266_ > 0; i_266_--) {
							((Class459) class459).anIntArray5525[i_266_]--;
							((Class459) class459).aByteArray5524[((Class459) class459).anIntArray5525[i_266_]] = (((Class459) class459).aByteArray5524[(((Class459) class459).anIntArray5525[i_266_ - 1]) + 16 - 1]);
						}
						((Class459) class459).anIntArray5525[0]--;
						((Class459) class459).aByteArray5524[((Class459) class459).anIntArray5525[0]] = i_224_;
						if (((Class459) class459).anIntArray5525[0] == 0) {
							i_251_ = 4095;
							for (int i_269_ = 15; i_269_ >= 0; i_269_--) {
								for (int i_270_ = 15; i_270_ >= 0; i_270_--) {
									((Class459) class459).aByteArray5524[i_251_] = (((Class459) class459).aByteArray5524[((((Class459) class459).anIntArray5525[i_269_]) + i_270_)]);
									i_251_--;
								}
								((Class459) class459).anIntArray5525[i_269_] = i_251_ + 1;
							}
						}
					}
					((Class459) class459).anIntArray5517[(((Class459) class459).aByteArray5523[i_224_ & 0xff] & 0xff)]++;
					Class266.anIntArray3288[i_254_] = (((Class459) class459).aByteArray5523[i_224_ & 0xff] & 0xff);
					i_254_++;
					if (i_249_ == 0) {
						i_248_++;
						i_249_ = 50;
						byte i_271_ = ((Class459) class459).aByteArray5504[i_248_];
						i = ((Class459) class459).anIntArray5533[i_271_];
						is = ((Class459) class459).anIntArrayArray5529[i_271_];
						is_222_ = (((Class459) class459).anIntArrayArray5531[i_271_]);
						is_221_ = (((Class459) class459).anIntArrayArray5530[i_271_]);
					}
					i_249_--;
					i_256_ = i;
					for (i_258_ = method7833(i_256_, class459); i_258_ > is[i_256_]; i_258_ = i_258_ << 1 | i_257_) {
						i_256_++;
						i_257_ = method7832(class459);
					}
					i_259_ = is_222_[i_258_ - is_221_[i_256_]];
				}
			}
			((Class459) class459).anInt5496 = 0;
			((Class459) class459).aByte5509 = (byte) 0;
			((Class459) class459).anIntArray5519[0] = 0;
			for (int i_272_ = 1; i_272_ <= 256; i_272_++)
				((Class459) class459).anIntArray5519[i_272_] = ((Class459) class459).anIntArray5517[i_272_ - 1];
			for (int i_273_ = 1; i_273_ <= 256; i_273_++)
				((Class459) class459).anIntArray5519[i_273_] += ((Class459) class459).anIntArray5519[i_273_ - 1];
			for (int i_274_ = 0; i_274_ < i_254_; i_274_++) {
				i_225_ = (byte) (Class266.anIntArray3288[i_274_] & 0xff);
				Class266.anIntArray3288[(((Class459) class459).anIntArray5519[i_225_ & 0xff])] |= i_274_ << 8;
				((Class459) class459).anIntArray5519[i_225_ & 0xff]++;
			}
			((Class459) class459).anInt5515 = ((Class266.anIntArray3288[((Class459) class459).anInt5514 * 7401411]) >> 8) * -1976927311;
			((Class459) class459).anInt5518 = 0;
			((Class459) class459).anInt5515 = Class266.anIntArray3288[(((Class459) class459).anInt5515 * 1405939025)] * -1976927311;
			((Class459) class459).anInt5516 = ((byte) (((Class459) class459).anInt5515 * 1405939025 & 0xff) * -122800995);
			Class459 class459_275_;
			((Class459) (class459_275_ = class459)).anInt5515 = ((((Class459) class459_275_).anInt5515 * 1405939025 >> 8) * -1976927311);
			((Class459) class459).anInt5518 += 1883830511;
			((Class459) class459).anInt5505 = i_254_ * -133593597;
			method7836(class459);
			if ((((Class459) class459).anInt5518 * 104412687 == ((Class459) class459).anInt5505 * -555494229 + 1) && ((Class459) class459).anInt5496 * 356933387 == 0)
				bool_223_ = true;
			else
				bool_223_ = false;
		}
	}

	public static int method7840(byte[] is, int i, byte[] is_276_, int i_277_, int i_278_) {
		synchronized (aClass459_5588) {
			((Class459) aClass459_5588).aByteArray5502 = is_276_;
			((Class459) aClass459_5588).anInt5503 = i_278_ * -634067365;
			((Class459) aClass459_5588).aByteArray5526 = is;
			((Class459) aClass459_5588).anInt5506 = 0;
			((Class459) aClass459_5588).anInt5507 = i * -926256369;
			((Class459) aClass459_5588).anInt5532 = 0;
			((Class459) aClass459_5588).anInt5511 = 0;
			((Class459) aClass459_5588).anInt5499 = 0;
			((Class459) aClass459_5588).anInt5508 = 0;
			method7848(aClass459_5588);
			i -= ((Class459) aClass459_5588).anInt5507 * -781968401;
			((Class459) aClass459_5588).aByteArray5502 = null;
			((Class459) aClass459_5588).aByteArray5526 = null;
			int i_279_ = i;
			return i_279_;
		}
	}

	public static int method7841(byte[] is, int i, byte[] is_280_, int i_281_, int i_282_) {
		synchronized (aClass459_5588) {
			((Class459) aClass459_5588).aByteArray5502 = is_280_;
			((Class459) aClass459_5588).anInt5503 = i_282_ * -634067365;
			((Class459) aClass459_5588).aByteArray5526 = is;
			((Class459) aClass459_5588).anInt5506 = 0;
			((Class459) aClass459_5588).anInt5507 = i * -926256369;
			((Class459) aClass459_5588).anInt5532 = 0;
			((Class459) aClass459_5588).anInt5511 = 0;
			((Class459) aClass459_5588).anInt5499 = 0;
			((Class459) aClass459_5588).anInt5508 = 0;
			method7848(aClass459_5588);
			i -= ((Class459) aClass459_5588).anInt5507 * -781968401;
			((Class459) aClass459_5588).aByteArray5502 = null;
			((Class459) aClass459_5588).aByteArray5526 = null;
			int i_283_ = i;
			return i_283_;
		}
	}

	static byte method7842(Class459 class459) {
		return (byte) method7833(8, class459);
	}

	static byte method7843(Class459 class459) {
		return (byte) method7833(8, class459);
	}

	static void method7844(Class459 class459) {
		((Class459) class459).anInt5520 = 0;
		for (int i = 0; i < 256; i++) {
			if (((Class459) class459).aBoolArray5497[i]) {
				((Class459) class459).aByteArray5523[((Class459) class459).anInt5520 * 1440361835] = (byte) i;
				((Class459) class459).anInt5520 += -799762621;
			}
		}
	}

	static byte method7845(Class459 class459) {
		return (byte) method7833(1, class459);
	}

	static void method7846(Class459 class459) {
		((Class459) class459).anInt5520 = 0;
		for (int i = 0; i < 256; i++) {
			if (((Class459) class459).aBoolArray5497[i]) {
				((Class459) class459).aByteArray5523[((Class459) class459).anInt5520 * 1440361835] = (byte) i;
				((Class459) class459).anInt5520 += -799762621;
			}
		}
	}

	static void method7847(Class459 class459) {
		((Class459) class459).anInt5520 = 0;
		for (int i = 0; i < 256; i++) {
			if (((Class459) class459).aBoolArray5497[i]) {
				((Class459) class459).aByteArray5523[((Class459) class459).anInt5520 * 1440361835] = (byte) i;
				((Class459) class459).anInt5520 += -799762621;
			}
		}
	}

	static void method7848(Class459 class459) {
		boolean bool = false;
		boolean bool_284_ = false;
		boolean bool_285_ = false;
		boolean bool_286_ = false;
		boolean bool_287_ = false;
		boolean bool_288_ = false;
		boolean bool_289_ = false;
		boolean bool_290_ = false;
		boolean bool_291_ = false;
		boolean bool_292_ = false;
		boolean bool_293_ = false;
		boolean bool_294_ = false;
		boolean bool_295_ = false;
		boolean bool_296_ = false;
		boolean bool_297_ = false;
		boolean bool_298_ = false;
		boolean bool_299_ = false;
		boolean bool_300_ = false;
		int i = 0;
		int[] is = null;
		int[] is_301_ = null;
		int[] is_302_ = null;
		((Class459) class459).anInt5513 = -132570225;
		if (Class266.anIntArray3288 == null)
			Class266.anIntArray3288 = new int[((Class459) class459).anInt5513 * -1846788256];
		boolean bool_303_ = true;
		while (bool_303_) {
			byte i_304_ = method7831(class459);
			if (i_304_ == 23)
				break;
			i_304_ = method7831(class459);
			i_304_ = method7831(class459);
			i_304_ = method7831(class459);
			i_304_ = method7831(class459);
			i_304_ = method7831(class459);
			i_304_ = method7831(class459);
			i_304_ = method7831(class459);
			i_304_ = method7831(class459);
			i_304_ = method7831(class459);
			i_304_ = method7832(class459);
			if (i_304_ == 0) {
				/* empty */
			}
			((Class459) class459).anInt5514 = 0;
			int i_305_ = method7831(class459);
			((Class459) class459).anInt5514 = (((Class459) class459).anInt5514 * 7401411 << 8 | i_305_ & 0xff) * -1513752341;
			i_305_ = method7831(class459);
			((Class459) class459).anInt5514 = (((Class459) class459).anInt5514 * 7401411 << 8 | i_305_ & 0xff) * -1513752341;
			i_305_ = method7831(class459);
			((Class459) class459).anInt5514 = (((Class459) class459).anInt5514 * 7401411 << 8 | i_305_ & 0xff) * -1513752341;
			for (int i_306_ = 0; i_306_ < 16; i_306_++) {
				i_304_ = method7832(class459);
				if (i_304_ == 1)
					((Class459) class459).aBoolArray5510[i_306_] = true;
				else
					((Class459) class459).aBoolArray5510[i_306_] = false;
			}
			for (int i_307_ = 0; i_307_ < 256; i_307_++)
				((Class459) class459).aBoolArray5497[i_307_] = false;
			for (int i_308_ = 0; i_308_ < 16; i_308_++) {
				if (((Class459) class459).aBoolArray5510[i_308_]) {
					for (int i_309_ = 0; i_309_ < 16; i_309_++) {
						i_304_ = method7832(class459);
						if (i_304_ == 1)
							((Class459) class459).aBoolArray5497[(i_308_ * 16 + i_309_)] = true;
					}
				}
			}
			method7844(class459);
			int i_310_ = ((Class459) class459).anInt5520 * 1440361835 + 2;
			int i_311_ = method7833(3, class459);
			int i_312_ = method7833(15, class459);
			for (int i_313_ = 0; i_313_ < i_312_; i_313_++) {
				int i_314_ = 0;
				for (;;) {
					i_304_ = method7832(class459);
					if (i_304_ == 0)
						break;
					i_314_++;
				}
				((Class459) class459).aByteArray5527[i_313_] = (byte) i_314_;
			}
			byte[] is_315_ = new byte[6];
			for (byte i_316_ = 0; i_316_ < i_311_; i_316_++)
				is_315_[i_316_] = i_316_;
			for (int i_317_ = 0; i_317_ < i_312_; i_317_++) {
				byte i_318_ = ((Class459) class459).aByteArray5527[i_317_];
				byte i_319_ = is_315_[i_318_];
				for (/**/; i_318_ > 0; i_318_--)
					is_315_[i_318_] = is_315_[i_318_ - 1];
				is_315_[0] = i_319_;
				((Class459) class459).aByteArray5504[i_317_] = i_319_;
			}
			for (int i_320_ = 0; i_320_ < i_311_; i_320_++) {
				int i_321_ = method7833(5, class459);
				for (int i_322_ = 0; i_322_ < i_310_; i_322_++) {
					for (;;) {
						i_304_ = method7832(class459);
						if (i_304_ == 0)
							break;
						i_304_ = method7832(class459);
						if (i_304_ == 0)
							i_321_++;
						else
							i_321_--;
					}
					((Class459) class459).aByteArrayArray5528[i_320_][i_322_] = (byte) i_321_;
				}
			}
			for (int i_323_ = 0; i_323_ < i_311_; i_323_++) {
				int i_324_ = 32;
				byte i_325_ = 0;
				for (int i_326_ = 0; i_326_ < i_310_; i_326_++) {
					if ((((Class459) class459).aByteArrayArray5528[i_323_][i_326_]) > i_325_)
						i_325_ = (((Class459) class459).aByteArrayArray5528[i_323_][i_326_]);
					if ((((Class459) class459).aByteArrayArray5528[i_323_][i_326_]) < i_324_)
						i_324_ = (((Class459) class459).aByteArrayArray5528[i_323_][i_326_]);
				}
				method7835(((Class459) class459).anIntArrayArray5529[i_323_], ((Class459) class459).anIntArrayArray5530[i_323_], ((Class459) class459).anIntArrayArray5531[i_323_], ((Class459) class459).aByteArrayArray5528[i_323_], i_324_, i_325_, i_310_);
				((Class459) class459).anIntArray5533[i_323_] = i_324_;
			}
			int i_327_ = ((Class459) class459).anInt5520 * 1440361835 + 1;
			int i_328_ = -1;
			int i_329_ = 0;
			for (int i_330_ = 0; i_330_ <= 255; i_330_++)
				((Class459) class459).anIntArray5517[i_330_] = 0;
			int i_331_ = 4095;
			for (int i_332_ = 15; i_332_ >= 0; i_332_--) {
				for (int i_333_ = 15; i_333_ >= 0; i_333_--) {
					((Class459) class459).aByteArray5524[i_331_] = (byte) (i_332_ * 16 + i_333_);
					i_331_--;
				}
				((Class459) class459).anIntArray5525[i_332_] = i_331_ + 1;
			}
			int i_334_ = 0;
			if (i_329_ == 0) {
				i_328_++;
				i_329_ = 50;
				byte i_335_ = ((Class459) class459).aByteArray5504[i_328_];
				i = ((Class459) class459).anIntArray5533[i_335_];
				is = ((Class459) class459).anIntArrayArray5529[i_335_];
				is_302_ = ((Class459) class459).anIntArrayArray5531[i_335_];
				is_301_ = ((Class459) class459).anIntArrayArray5530[i_335_];
			}
			i_329_--;
			int i_336_ = i;
			int i_337_;
			int i_338_;
			for (i_338_ = method7833(i_336_, class459); i_338_ > is[i_336_]; i_338_ = i_338_ << 1 | i_337_) {
				i_336_++;
				i_337_ = method7832(class459);
			}
			int i_339_ = is_302_[i_338_ - is_301_[i_336_]];
			while (i_339_ != i_327_) {
				if (i_339_ == 0 || i_339_ == 1) {
					int i_340_ = -1;
					int i_341_ = 1;
					do {
						if (i_339_ == 0)
							i_340_ += 1 * i_341_;
						else if (i_339_ == 1)
							i_340_ += 2 * i_341_;
						i_341_ *= 2;
						if (i_329_ == 0) {
							i_328_++;
							i_329_ = 50;
							byte i_342_ = ((Class459) class459).aByteArray5504[i_328_];
							i = ((Class459) class459).anIntArray5533[i_342_];
							is = (((Class459) class459).anIntArrayArray5529[i_342_]);
							is_302_ = (((Class459) class459).anIntArrayArray5531[i_342_]);
							is_301_ = (((Class459) class459).anIntArrayArray5530[i_342_]);
						}
						i_329_--;
						i_336_ = i;
						for (i_338_ = method7833(i_336_, class459); i_338_ > is[i_336_]; i_338_ = i_338_ << 1 | i_337_) {
							i_336_++;
							i_337_ = method7832(class459);
						}
						i_339_ = is_302_[i_338_ - is_301_[i_336_]];
					} while (i_339_ == 0 || i_339_ == 1);
					i_340_++;
					i_305_ = (((Class459) class459).aByteArray5523[((((Class459) class459).aByteArray5524[((Class459) class459).anIntArray5525[0]]) & 0xff)]);
					((Class459) class459).anIntArray5517[i_305_ & 0xff] += i_340_;
					for (/**/; i_340_ > 0; i_340_--) {
						Class266.anIntArray3288[i_334_] = i_305_ & 0xff;
						i_334_++;
					}
				} else {
					int i_343_ = i_339_ - 1;
					if (i_343_ < 16) {
						int i_344_ = ((Class459) class459).anIntArray5525[0];
						i_304_ = (((Class459) class459).aByteArray5524[i_344_ + i_343_]);
						for (/**/; i_343_ > 3; i_343_ -= 4) {
							int i_345_ = i_344_ + i_343_;
							((Class459) class459).aByteArray5524[i_345_] = (((Class459) class459).aByteArray5524[i_345_ - 1]);
							((Class459) class459).aByteArray5524[i_345_ - 1] = (((Class459) class459).aByteArray5524[i_345_ - 2]);
							((Class459) class459).aByteArray5524[i_345_ - 2] = (((Class459) class459).aByteArray5524[i_345_ - 3]);
							((Class459) class459).aByteArray5524[i_345_ - 3] = (((Class459) class459).aByteArray5524[i_345_ - 4]);
						}
						for (/**/; i_343_ > 0; i_343_--)
							((Class459) class459).aByteArray5524[(i_344_ + i_343_)] = (((Class459) class459).aByteArray5524[i_344_ + i_343_ - 1]);
						((Class459) class459).aByteArray5524[i_344_] = i_304_;
					} else {
						int i_346_ = i_343_ / 16;
						int i_347_ = i_343_ % 16;
						int i_348_ = (((Class459) class459).anIntArray5525[i_346_] + i_347_);
						i_304_ = ((Class459) class459).aByteArray5524[i_348_];
						for (/**/; (i_348_ > ((Class459) class459).anIntArray5525[i_346_]); i_348_--)
							((Class459) class459).aByteArray5524[i_348_] = (((Class459) class459).aByteArray5524[i_348_ - 1]);
						((Class459) class459).anIntArray5525[i_346_]++;
						for (/**/; i_346_ > 0; i_346_--) {
							((Class459) class459).anIntArray5525[i_346_]--;
							((Class459) class459).aByteArray5524[((Class459) class459).anIntArray5525[i_346_]] = (((Class459) class459).aByteArray5524[(((Class459) class459).anIntArray5525[i_346_ - 1]) + 16 - 1]);
						}
						((Class459) class459).anIntArray5525[0]--;
						((Class459) class459).aByteArray5524[((Class459) class459).anIntArray5525[0]] = i_304_;
						if (((Class459) class459).anIntArray5525[0] == 0) {
							i_331_ = 4095;
							for (int i_349_ = 15; i_349_ >= 0; i_349_--) {
								for (int i_350_ = 15; i_350_ >= 0; i_350_--) {
									((Class459) class459).aByteArray5524[i_331_] = (((Class459) class459).aByteArray5524[((((Class459) class459).anIntArray5525[i_349_]) + i_350_)]);
									i_331_--;
								}
								((Class459) class459).anIntArray5525[i_349_] = i_331_ + 1;
							}
						}
					}
					((Class459) class459).anIntArray5517[(((Class459) class459).aByteArray5523[i_304_ & 0xff] & 0xff)]++;
					Class266.anIntArray3288[i_334_] = (((Class459) class459).aByteArray5523[i_304_ & 0xff] & 0xff);
					i_334_++;
					if (i_329_ == 0) {
						i_328_++;
						i_329_ = 50;
						byte i_351_ = ((Class459) class459).aByteArray5504[i_328_];
						i = ((Class459) class459).anIntArray5533[i_351_];
						is = ((Class459) class459).anIntArrayArray5529[i_351_];
						is_302_ = (((Class459) class459).anIntArrayArray5531[i_351_]);
						is_301_ = (((Class459) class459).anIntArrayArray5530[i_351_]);
					}
					i_329_--;
					i_336_ = i;
					for (i_338_ = method7833(i_336_, class459); i_338_ > is[i_336_]; i_338_ = i_338_ << 1 | i_337_) {
						i_336_++;
						i_337_ = method7832(class459);
					}
					i_339_ = is_302_[i_338_ - is_301_[i_336_]];
				}
			}
			((Class459) class459).anInt5496 = 0;
			((Class459) class459).aByte5509 = (byte) 0;
			((Class459) class459).anIntArray5519[0] = 0;
			for (int i_352_ = 1; i_352_ <= 256; i_352_++)
				((Class459) class459).anIntArray5519[i_352_] = ((Class459) class459).anIntArray5517[i_352_ - 1];
			for (int i_353_ = 1; i_353_ <= 256; i_353_++)
				((Class459) class459).anIntArray5519[i_353_] += ((Class459) class459).anIntArray5519[i_353_ - 1];
			for (int i_354_ = 0; i_354_ < i_334_; i_354_++) {
				i_305_ = (byte) (Class266.anIntArray3288[i_354_] & 0xff);
				Class266.anIntArray3288[(((Class459) class459).anIntArray5519[i_305_ & 0xff])] |= i_354_ << 8;
				((Class459) class459).anIntArray5519[i_305_ & 0xff]++;
			}
			((Class459) class459).anInt5515 = ((Class266.anIntArray3288[((Class459) class459).anInt5514 * 7401411]) >> 8) * -1976927311;
			((Class459) class459).anInt5518 = 0;
			((Class459) class459).anInt5515 = Class266.anIntArray3288[(((Class459) class459).anInt5515 * 1405939025)] * -1976927311;
			((Class459) class459).anInt5516 = ((byte) (((Class459) class459).anInt5515 * 1405939025 & 0xff) * -122800995);
			Class459 class459_355_;
			((Class459) (class459_355_ = class459)).anInt5515 = ((((Class459) class459_355_).anInt5515 * 1405939025 >> 8) * -1976927311);
			((Class459) class459).anInt5518 += 1883830511;
			((Class459) class459).anInt5505 = i_334_ * -133593597;
			method7836(class459);
			if ((((Class459) class459).anInt5518 * 104412687 == ((Class459) class459).anInt5505 * -555494229 + 1) && ((Class459) class459).anInt5496 * 356933387 == 0)
				bool_303_ = true;
			else
				bool_303_ = false;
		}
	}
}
