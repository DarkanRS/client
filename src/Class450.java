/* Class450 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class450 {
	static int anInt5631 = 23;
	static int anInt5632 = 16;
	static Class439 aClass439_5633 = new Class439();
	static int anInt5634 = 6;
	static int anInt5635 = 1;
	static int anInt5636 = 4096;
	static int anInt5637 = 50;
	static int anInt5638 = 0;

	public static int method5921(byte[] is, int i, byte[] is_0_, int i_1_, int i_2_) {
		synchronized (aClass439_5633) {
			((Class439) aClass439_5633).aByteArray5536 = is_0_;
			((Class439) aClass439_5633).anInt5543 = i_2_ * 497351807;
			((Class439) aClass439_5633).aByteArray5550 = is;
			((Class439) aClass439_5633).anInt5546 = 0;
			((Class439) aClass439_5633).anInt5547 = i * 329554717;
			((Class439) aClass439_5633).anInt5552 = 0;
			((Class439) aClass439_5633).anInt5551 = 0;
			((Class439) aClass439_5633).anInt5544 = 0;
			((Class439) aClass439_5633).anInt5548 = 0;
			method5923(aClass439_5633);
			i -= ((Class439) aClass439_5633).anInt5547 * 66256693;
			((Class439) aClass439_5633).aByteArray5536 = null;
			((Class439) aClass439_5633).aByteArray5550 = null;
			int i_3_ = i;
			return i_3_;
		}
	}

	static void method5922(Class439 class439) {
		byte i = ((Class439) class439).aByte5570;
		int i_4_ = ((Class439) class439).anInt5571 * -966285967;
		int i_5_ = ((Class439) class439).anInt5555 * 849607515;
		int i_6_ = ((Class439) class439).anInt5542 * 1013527997;
		int[] is = Class439.anIntArray5560;
		int i_7_ = ((Class439) class439).anInt5556 * 1501792989;
		byte[] is_8_ = ((Class439) class439).aByteArray5550;
		int i_9_ = ((Class439) class439).anInt5546 * -1701270189;
		int i_10_ = ((Class439) class439).anInt5547 * 66256693;
		int i_11_ = i_10_;
		int i_12_ = ((Class439) class439).anInt5574 * -69219207 + 1;
		while_105_: for (;;) {
			if (i_4_ > 0) {
				for (;;) {
					if (i_10_ == 0)
						break while_105_;
					if (i_4_ == 1)
						break;
					is_8_[i_9_] = i;
					i_4_--;
					i_9_++;
					i_10_--;
				}
				if (i_10_ == 0) {
					i_4_ = 1;
					break;
				}
				is_8_[i_9_] = i;
				i_9_++;
				i_10_--;
			}
			for (;;) {
				if (i_5_ == i_12_) {
					i_4_ = 0;
					break while_105_;
				}
				i = (byte) i_6_;
				i_7_ = is[i_7_];
				int i_13_ = (byte) i_7_;
				i_7_ >>= 8;
				i_5_++;
				if (i_13_ != i_6_) {
					i_6_ = i_13_;
					if (i_10_ == 0) {
						i_4_ = 1;
						break while_105_;
					}
					is_8_[i_9_] = i;
					i_9_++;
					i_10_--;
				} else {
					if (i_5_ != i_12_)
						break;
					if (i_10_ == 0) {
						i_4_ = 1;
						break while_105_;
					}
					is_8_[i_9_] = i;
					i_9_++;
					i_10_--;
				}
			}
			i_4_ = 2;
			i_7_ = is[i_7_];
			int i_14_ = (byte) i_7_;
			i_7_ >>= 8;
			if (++i_5_ != i_12_) {
				if (i_14_ != i_6_)
					i_6_ = i_14_;
				else {
					i_4_ = 3;
					i_7_ = is[i_7_];
					i_14_ = (byte) i_7_;
					i_7_ >>= 8;
					if (++i_5_ != i_12_) {
						if (i_14_ != i_6_)
							i_6_ = i_14_;
						else {
							i_7_ = is[i_7_];
							i_14_ = (byte) i_7_;
							i_7_ >>= 8;
							i_5_++;
							i_4_ = (i_14_ & 0xff) + 4;
							i_7_ = is[i_7_];
							i_6_ = (byte) i_7_;
							i_7_ >>= 8;
							i_5_++;
						}
					}
				}
			}
		}
		int i_15_ = ((Class439) class439).anInt5548 * 1847985911;
		((Class439) class439).anInt5548 += (i_11_ - i_10_) * 834706119;
		if (((Class439) class439).anInt5548 * 1847985911 >= i_15_) {
			/* empty */
		}
		((Class439) class439).aByte5570 = i;
		((Class439) class439).anInt5571 = i_4_ * 1622047633;
		((Class439) class439).anInt5555 = i_5_ * 1402191059;
		((Class439) class439).anInt5542 = i_6_ * -84955755;
		Class439.anIntArray5560 = is;
		((Class439) class439).anInt5556 = i_7_ * -1642553995;
		((Class439) class439).aByteArray5550 = is_8_;
		((Class439) class439).anInt5546 = i_9_ * -1038344485;
		((Class439) class439).anInt5547 = i_10_ * 329554717;
	}

	static void method5923(Class439 class439) {
		boolean bool = false;
		boolean bool_16_ = false;
		boolean bool_17_ = false;
		boolean bool_18_ = false;
		boolean bool_19_ = false;
		boolean bool_20_ = false;
		boolean bool_21_ = false;
		boolean bool_22_ = false;
		boolean bool_23_ = false;
		boolean bool_24_ = false;
		boolean bool_25_ = false;
		boolean bool_26_ = false;
		boolean bool_27_ = false;
		boolean bool_28_ = false;
		boolean bool_29_ = false;
		boolean bool_30_ = false;
		boolean bool_31_ = false;
		boolean bool_32_ = false;
		int i = 0;
		int[] is = null;
		int[] is_33_ = null;
		int[] is_34_ = null;
		((Class439) class439).anInt5553 = -1770501691;
		if (Class439.anIntArray5560 == null)
			Class439.anIntArray5560 = new int[((Class439) class439).anInt5553 * 605156896];
		boolean bool_35_ = true;
		while (bool_35_) {
			byte i_36_ = method5924(class439);
			if (i_36_ == 23)
				break;
			i_36_ = method5924(class439);
			i_36_ = method5924(class439);
			i_36_ = method5924(class439);
			i_36_ = method5924(class439);
			i_36_ = method5924(class439);
			i_36_ = method5924(class439);
			i_36_ = method5924(class439);
			i_36_ = method5924(class439);
			i_36_ = method5924(class439);
			i_36_ = method5926(class439);
			if (i_36_ == 0) {
				/* empty */
			}
			((Class439) class439).anInt5554 = 0;
			int i_37_ = method5924(class439);
			((Class439) class439).anInt5554 = (((Class439) class439).anInt5554 * -1963861893 << 8 | i_37_ & 0xff) * -1428404557;
			i_37_ = method5924(class439);
			((Class439) class439).anInt5554 = (((Class439) class439).anInt5554 * -1963861893 << 8 | i_37_ & 0xff) * -1428404557;
			i_37_ = method5924(class439);
			((Class439) class439).anInt5554 = (((Class439) class439).anInt5554 * -1963861893 << 8 | i_37_ & 0xff) * -1428404557;
			for (int i_38_ = 0; i_38_ < 16; i_38_++) {
				i_36_ = method5926(class439);
				if (i_36_ == 1)
					((Class439) class439).aBooleanArray5563[i_38_] = true;
				else
					((Class439) class439).aBooleanArray5563[i_38_] = false;
			}
			for (int i_39_ = 0; i_39_ < 256; i_39_++)
				((Class439) class439).aBooleanArray5573[i_39_] = false;
			for (int i_40_ = 0; i_40_ < 16; i_40_++) {
				if (((Class439) class439).aBooleanArray5563[i_40_]) {
					for (int i_41_ = 0; i_41_ < 16; i_41_++) {
						i_36_ = method5926(class439);
						if (i_36_ == 1)
							((Class439) class439).aBooleanArray5573[(i_40_ * 16 + i_41_)] = true;
					}
				}
			}
			method5925(class439);
			int i_42_ = ((Class439) class439).anInt5561 * -2130856323 + 2;
			int i_43_ = method5927(3, class439);
			int i_44_ = method5927(15, class439);
			for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
				int i_46_ = 0;
				for (;;) {
					i_36_ = method5926(class439);
					if (i_36_ == 0)
						break;
					i_46_++;
				}
				((Class439) class439).aByteArray5562[i_45_] = (byte) i_46_;
			}
			byte[] is_47_ = new byte[6];
			for (byte i_48_ = 0; i_48_ < i_43_; i_48_++)
				is_47_[i_48_] = i_48_;
			for (int i_49_ = 0; i_49_ < i_44_; i_49_++) {
				byte i_50_ = ((Class439) class439).aByteArray5562[i_49_];
				byte i_51_ = is_47_[i_50_];
				for (/**/; i_50_ > 0; i_50_--)
					is_47_[i_50_] = is_47_[i_50_ - 1];
				is_47_[0] = i_51_;
				((Class439) class439).aByteArray5567[i_49_] = i_51_;
			}
			for (int i_52_ = 0; i_52_ < i_43_; i_52_++) {
				int i_53_ = method5927(5, class439);
				for (int i_54_ = 0; i_54_ < i_42_; i_54_++) {
					for (;;) {
						i_36_ = method5926(class439);
						if (i_36_ == 0)
							break;
						i_36_ = method5926(class439);
						if (i_36_ == 0)
							i_53_++;
						else
							i_53_--;
					}
					((Class439) class439).aByteArrayArray5549[i_52_][i_54_] = (byte) i_53_;
				}
			}
			for (int i_55_ = 0; i_55_ < i_43_; i_55_++) {
				int i_56_ = 32;
				byte i_57_ = 0;
				for (int i_58_ = 0; i_58_ < i_42_; i_58_++) {
					if (((Class439) class439).aByteArrayArray5549[i_55_][i_58_] > i_57_)
						i_57_ = (((Class439) class439).aByteArrayArray5549[i_55_][i_58_]);
					if (((Class439) class439).aByteArrayArray5549[i_55_][i_58_] < i_56_)
						i_56_ = (((Class439) class439).aByteArrayArray5549[i_55_][i_58_]);
				}
				method5928(((Class439) class439).anIntArrayArray5565[i_55_], ((Class439) class439).anIntArrayArray5540[i_55_], ((Class439) class439).anIntArrayArray5572[i_55_], ((Class439) class439).aByteArrayArray5549[i_55_], i_56_, i_57_, i_42_);
				((Class439) class439).anIntArray5566[i_55_] = i_56_;
			}
			int i_59_ = ((Class439) class439).anInt5561 * -2130856323 + 1;
			int i_60_ = -1;
			int i_61_ = 0;
			for (int i_62_ = 0; i_62_ <= 255; i_62_++)
				((Class439) class439).anIntArray5557[i_62_] = 0;
			int i_63_ = 4095;
			for (int i_64_ = 15; i_64_ >= 0; i_64_--) {
				for (int i_65_ = 15; i_65_ >= 0; i_65_--) {
					((Class439) class439).aByteArray5568[i_63_] = (byte) (i_64_ * 16 + i_65_);
					i_63_--;
				}
				((Class439) class439).anIntArray5569[i_64_] = i_63_ + 1;
			}
			int i_66_ = 0;
			if (i_61_ == 0) {
				i_60_++;
				i_61_ = 50;
				byte i_67_ = ((Class439) class439).aByteArray5567[i_60_];
				i = ((Class439) class439).anIntArray5566[i_67_];
				is = ((Class439) class439).anIntArrayArray5565[i_67_];
				is_34_ = ((Class439) class439).anIntArrayArray5572[i_67_];
				is_33_ = ((Class439) class439).anIntArrayArray5540[i_67_];
			}
			i_61_--;
			int i_68_ = i;
			int i_69_;
			int i_70_;
			for (i_70_ = method5927(i_68_, class439); i_70_ > is[i_68_]; i_70_ = i_70_ << 1 | i_69_) {
				i_68_++;
				i_69_ = method5926(class439);
			}
			int i_71_ = is_34_[i_70_ - is_33_[i_68_]];
			while (i_71_ != i_59_) {
				if (i_71_ == 0 || i_71_ == 1) {
					int i_72_ = -1;
					int i_73_ = 1;
					do {
						if (i_71_ == 0)
							i_72_ += 1 * i_73_;
						else if (i_71_ == 1)
							i_72_ += 2 * i_73_;
						i_73_ *= 2;
						if (i_61_ == 0) {
							i_60_++;
							i_61_ = 50;
							byte i_74_ = ((Class439) class439).aByteArray5567[i_60_];
							i = ((Class439) class439).anIntArray5566[i_74_];
							is = (((Class439) class439).anIntArrayArray5565[i_74_]);
							is_34_ = (((Class439) class439).anIntArrayArray5572[i_74_]);
							is_33_ = (((Class439) class439).anIntArrayArray5540[i_74_]);
						}
						i_61_--;
						i_68_ = i;
						for (i_70_ = method5927(i_68_, class439); i_70_ > is[i_68_]; i_70_ = i_70_ << 1 | i_69_) {
							i_68_++;
							i_69_ = method5926(class439);
						}
						i_71_ = is_34_[i_70_ - is_33_[i_68_]];
					} while (i_71_ == 0 || i_71_ == 1);
					i_72_++;
					i_37_ = (((Class439) class439).aByteArray5564[((((Class439) class439).aByteArray5568[((Class439) class439).anIntArray5569[0]]) & 0xff)]);
					((Class439) class439).anIntArray5557[i_37_ & 0xff] += i_72_;
					for (/**/; i_72_ > 0; i_72_--) {
						Class439.anIntArray5560[i_66_] = i_37_ & 0xff;
						i_66_++;
					}
				} else {
					int i_75_ = i_71_ - 1;
					if (i_75_ < 16) {
						int i_76_ = ((Class439) class439).anIntArray5569[0];
						i_36_ = (((Class439) class439).aByteArray5568[i_76_ + i_75_]);
						for (/**/; i_75_ > 3; i_75_ -= 4) {
							int i_77_ = i_76_ + i_75_;
							((Class439) class439).aByteArray5568[i_77_] = (((Class439) class439).aByteArray5568[i_77_ - 1]);
							((Class439) class439).aByteArray5568[i_77_ - 1] = (((Class439) class439).aByteArray5568[i_77_ - 2]);
							((Class439) class439).aByteArray5568[i_77_ - 2] = (((Class439) class439).aByteArray5568[i_77_ - 3]);
							((Class439) class439).aByteArray5568[i_77_ - 3] = (((Class439) class439).aByteArray5568[i_77_ - 4]);
						}
						for (/**/; i_75_ > 0; i_75_--)
							((Class439) class439).aByteArray5568[i_76_ + i_75_] = (((Class439) class439).aByteArray5568[i_76_ + i_75_ - 1]);
						((Class439) class439).aByteArray5568[i_76_] = i_36_;
					} else {
						int i_78_ = i_75_ / 16;
						int i_79_ = i_75_ % 16;
						int i_80_ = (((Class439) class439).anIntArray5569[i_78_] + i_79_);
						i_36_ = ((Class439) class439).aByteArray5568[i_80_];
						for (/**/; (i_80_ > ((Class439) class439).anIntArray5569[i_78_]); i_80_--)
							((Class439) class439).aByteArray5568[i_80_] = (((Class439) class439).aByteArray5568[i_80_ - 1]);
						((Class439) class439).anIntArray5569[i_78_]++;
						for (/**/; i_78_ > 0; i_78_--) {
							((Class439) class439).anIntArray5569[i_78_]--;
							((Class439) class439).aByteArray5568[((Class439) class439).anIntArray5569[i_78_]] = (((Class439) class439).aByteArray5568[(((Class439) class439).anIntArray5569[i_78_ - 1]) + 16 - 1]);
						}
						((Class439) class439).anIntArray5569[0]--;
						((Class439) class439).aByteArray5568[((Class439) class439).anIntArray5569[0]] = i_36_;
						if (((Class439) class439).anIntArray5569[0] == 0) {
							i_63_ = 4095;
							for (int i_81_ = 15; i_81_ >= 0; i_81_--) {
								for (int i_82_ = 15; i_82_ >= 0; i_82_--) {
									((Class439) class439).aByteArray5568[i_63_] = (((Class439) class439).aByteArray5568[(((Class439) class439).anIntArray5569[i_81_]) + i_82_]);
									i_63_--;
								}
								((Class439) class439).anIntArray5569[i_81_] = i_63_ + 1;
							}
						}
					}
					((Class439) class439).anIntArray5557[(((Class439) class439).aByteArray5564[i_36_ & 0xff] & 0xff)]++;
					Class439.anIntArray5560[i_66_] = (((Class439) class439).aByteArray5564[i_36_ & 0xff] & 0xff);
					i_66_++;
					if (i_61_ == 0) {
						i_60_++;
						i_61_ = 50;
						byte i_83_ = ((Class439) class439).aByteArray5567[i_60_];
						i = ((Class439) class439).anIntArray5566[i_83_];
						is = ((Class439) class439).anIntArrayArray5565[i_83_];
						is_34_ = ((Class439) class439).anIntArrayArray5572[i_83_];
						is_33_ = ((Class439) class439).anIntArrayArray5540[i_83_];
					}
					i_61_--;
					i_68_ = i;
					for (i_70_ = method5927(i_68_, class439); i_70_ > is[i_68_]; i_70_ = i_70_ << 1 | i_69_) {
						i_68_++;
						i_69_ = method5926(class439);
					}
					i_71_ = is_34_[i_70_ - is_33_[i_68_]];
				}
			}
			((Class439) class439).anInt5571 = 0;
			((Class439) class439).aByte5570 = (byte) 0;
			((Class439) class439).anIntArray5559[0] = 0;
			for (int i_84_ = 1; i_84_ <= 256; i_84_++)
				((Class439) class439).anIntArray5559[i_84_] = ((Class439) class439).anIntArray5557[i_84_ - 1];
			for (int i_85_ = 1; i_85_ <= 256; i_85_++)
				((Class439) class439).anIntArray5559[i_85_] += ((Class439) class439).anIntArray5559[i_85_ - 1];
			for (int i_86_ = 0; i_86_ < i_66_; i_86_++) {
				i_37_ = (byte) (Class439.anIntArray5560[i_86_] & 0xff);
				Class439.anIntArray5560[(((Class439) class439).anIntArray5559[i_37_ & 0xff])] |= i_86_ << 8;
				((Class439) class439).anIntArray5559[i_37_ & 0xff]++;
			}
			((Class439) class439).anInt5556 = ((Class439.anIntArray5560[((Class439) class439).anInt5554 * -1963861893]) >> 8) * -1642553995;
			((Class439) class439).anInt5555 = 0;
			((Class439) class439).anInt5556 = Class439.anIntArray5560[(((Class439) class439).anInt5556 * 1501792989)] * -1642553995;
			((Class439) class439).anInt5542 = ((byte) (((Class439) class439).anInt5556 * 1501792989 & 0xff) * -84955755);
			Class439 class439_87_;
			((Class439) (class439_87_ = class439)).anInt5556 = ((((Class439) class439_87_).anInt5556 * 1501792989 >> 8) * -1642553995);
			((Class439) class439).anInt5555 += 1402191059;
			((Class439) class439).anInt5574 = i_66_ * -555426359;
			method5922(class439);
			if ((((Class439) class439).anInt5555 * 849607515 == ((Class439) class439).anInt5574 * -69219207 + 1) && ((Class439) class439).anInt5571 * -966285967 == 0)
				bool_35_ = true;
			else
				bool_35_ = false;
		}
	}

	static byte method5924(Class439 class439) {
		return (byte) method5927(8, class439);
	}

	static void method5925(Class439 class439) {
		((Class439) class439).anInt5561 = 0;
		for (int i = 0; i < 256; i++) {
			if (((Class439) class439).aBooleanArray5573[i]) {
				((Class439) class439).aByteArray5564[((Class439) class439).anInt5561 * -2130856323] = (byte) i;
				((Class439) class439).anInt5561 += -603327787;
			}
		}
	}

	static byte method5926(Class439 class439) {
		return (byte) method5927(1, class439);
	}

	Class450() throws Throwable {
		throw new Error();
	}

	static int method5927(int i, Class439 class439) {
		for (;;) {
			if (((Class439) class439).anInt5552 * 1660824337 >= i) {
				int i_88_ = ((((Class439) class439).anInt5551 * -1710803227 >> ((Class439) class439).anInt5552 * 1660824337 - i) & (1 << i) - 1);
				((Class439) class439).anInt5552 -= i * -360700431;
				return i_88_;
			}
			((Class439) class439).anInt5551 = ((((Class439) class439).anInt5551 * -1710803227 << 8 | (((Class439) class439).aByteArray5536[((Class439) class439).anInt5543 * -1070677121]) & 0xff) * 1040750317);
			((Class439) class439).anInt5552 += 1409363848;
			((Class439) class439).anInt5543 += 497351807;
			((Class439) class439).anInt5544 += -1183153807;
			if (((Class439) class439).anInt5544 * -487579759 == 0) {
				/* empty */
			}
		}
	}

	static void method5928(int[] is, int[] is_89_, int[] is_90_, byte[] is_91_, int i, int i_92_, int i_93_) {
		int i_94_ = 0;
		for (int i_95_ = i; i_95_ <= i_92_; i_95_++) {
			for (int i_96_ = 0; i_96_ < i_93_; i_96_++) {
				if (is_91_[i_96_] == i_95_) {
					is_90_[i_94_] = i_96_;
					i_94_++;
				}
			}
		}
		for (int i_97_ = 0; i_97_ < 23; i_97_++)
			is_89_[i_97_] = 0;
		for (int i_98_ = 0; i_98_ < i_93_; i_98_++)
			is_89_[is_91_[i_98_] + 1]++;
		for (int i_99_ = 1; i_99_ < 23; i_99_++)
			is_89_[i_99_] += is_89_[i_99_ - 1];
		for (int i_100_ = 0; i_100_ < 23; i_100_++)
			is[i_100_] = 0;
		int i_101_ = 0;
		for (int i_102_ = i; i_102_ <= i_92_; i_102_++) {
			i_101_ += is_89_[i_102_ + 1] - is_89_[i_102_];
			is[i_102_] = i_101_ - 1;
			i_101_ <<= 1;
		}
		for (int i_103_ = i + 1; i_103_ <= i_92_; i_103_++)
			is_89_[i_103_] = (is[i_103_ - 1] + 1 << 1) - is_89_[i_103_];
	}
}
