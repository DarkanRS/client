/* Class405 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class405 {
	public char aChar4832;
	public int anInt4833;
	public int anInt4834;
	public int anInt4835;

	void method6812(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method6814(class282_sub35, i, 281767719);
		}
	}

	void method6813(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method6814(class282_sub35, i, 1660004738);
		}
	}

	void method6814(RsByteBuffer class282_sub35, int i, int i_0_) {
		if (i == 1)
			aChar4832 = Class11.method470(class282_sub35.readByte(), 1372393939);
		else if (3 == i) {
			anInt4833 = class282_sub35.readUnsignedShort() * 1847456201;
			anInt4834 = class282_sub35.readUnsignedByte() * 1551601905;
			anInt4835 = class282_sub35.readUnsignedByte() * 1948460257;
		}
	}

	void method6815(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method6814(class282_sub35, i, 1787079389);
		}
	}

	Class405() {
		/* empty */
	}

	void method6816(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_1_ = class282_sub35.readUnsignedByte();
			if (0 == i_1_)
				break;
			method6814(class282_sub35, i_1_, 1617452174);
		}
	}

	void method6817(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			aChar4832 = Class11.method470(class282_sub35.readByte(), 310252785);
		else if (3 == i) {
			anInt4833 = class282_sub35.readUnsignedShort() * 1847456201;
			anInt4834 = class282_sub35.readUnsignedByte() * 1551601905;
			anInt4835 = class282_sub35.readUnsignedByte() * 1948460257;
		}
	}

	void method6818(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			aChar4832 = Class11.method470(class282_sub35.readByte(), -522685697);
		else if (3 == i) {
			anInt4833 = class282_sub35.readUnsignedShort() * 1847456201;
			anInt4834 = class282_sub35.readUnsignedByte() * 1551601905;
			anInt4835 = class282_sub35.readUnsignedByte() * 1948460257;
		}
	}

	void method6819(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			aChar4832 = Class11.method470(class282_sub35.readByte(), -537574707);
		else if (3 == i) {
			anInt4833 = class282_sub35.readUnsignedShort() * 1847456201;
			anInt4834 = class282_sub35.readUnsignedByte() * 1551601905;
			anInt4835 = class282_sub35.readUnsignedByte() * 1948460257;
		}
	}

	void method6820(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			aChar4832 = Class11.method470(class282_sub35.readByte(), -1959371639);
		else if (3 == i) {
			anInt4833 = class282_sub35.readUnsignedShort() * 1847456201;
			anInt4834 = class282_sub35.readUnsignedByte() * 1551601905;
			anInt4835 = class282_sub35.readUnsignedByte() * 1948460257;
		}
	}

	void method6821(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			aChar4832 = Class11.method470(class282_sub35.readByte(), -116444694);
		else if (3 == i) {
			anInt4833 = class282_sub35.readUnsignedShort() * 1847456201;
			anInt4834 = class282_sub35.readUnsignedByte() * 1551601905;
			anInt4835 = class282_sub35.readUnsignedByte() * 1948460257;
		}
	}

	void method6822(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			aChar4832 = Class11.method470(class282_sub35.readByte(), -1575919734);
		else if (3 == i) {
			anInt4833 = class282_sub35.readUnsignedShort() * 1847456201;
			anInt4834 = class282_sub35.readUnsignedByte() * 1551601905;
			anInt4835 = class282_sub35.readUnsignedByte() * 1948460257;
		}
	}

	public static final void method6823(int i) {
		int i_2_ = Class393.aClass282_Sub54_4783.aClass468_Sub27_8209.method12952((byte) 47);
		if (0 == i_2_) {
			IndexLoaders.MAP_REGION_DECODER.method4440(null, (byte) 2);
			Class534_Sub2.method12847(0, (byte) 57);
		} else if (1 == i_2_) {
			Class510.method8744((byte) 0, -1832206339);
			Class534_Sub2.method12847(512, (byte) 105);
			if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-987741607) != null)
				Class17.method570(-1664759987);
		} else {
			Class510.method8744((byte) (48374445 * client.anInt7286 - 4 & 0xff), 688949228);
			Class534_Sub2.method12847(2, (byte) 69);
		}
		client.anInt7472 = 2121525839 * Class4.anInt35;
	}

	static void method6824(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		int i_10_ = 0;
		int i_11_ = i_5_;
		int i_12_ = 0;
		int i_13_ = i_4_ - i_8_;
		int i_14_ = i_5_ - i_8_;
		int i_15_ = i_4_ * i_4_;
		int i_16_ = i_5_ * i_5_;
		int i_17_ = i_13_ * i_13_;
		int i_18_ = i_14_ * i_14_;
		int i_19_ = i_16_ << 1;
		int i_20_ = i_15_ << 1;
		int i_21_ = i_18_ << 1;
		int i_22_ = i_17_ << 1;
		int i_23_ = i_5_ << 1;
		int i_24_ = i_14_ << 1;
		int i_25_ = (1 - i_23_) * i_15_ + i_19_;
		int i_26_ = i_16_ - i_20_ * (i_23_ - 1);
		int i_27_ = i_21_ + i_17_ * (1 - i_24_);
		int i_28_ = i_18_ - i_22_ * (i_24_ - 1);
		int i_29_ = i_15_ << 2;
		int i_30_ = i_16_ << 2;
		int i_31_ = i_17_ << 2;
		int i_32_ = i_18_ << 2;
		int i_33_ = 3 * i_19_;
		int i_34_ = i_20_ * (i_23_ - 3);
		int i_35_ = i_21_ * 3;
		int i_36_ = (i_24_ - 3) * i_22_;
		int i_37_ = i_30_;
		int i_38_ = (i_5_ - 1) * i_29_;
		int i_39_ = i_32_;
		int i_40_ = (i_14_ - 1) * i_31_;
		if (i_3_ >= 324226563 * Class532_Sub3_Sub1.anInt7070 && i_3_ <= -348932735 * Class532_Sub3_Sub1.anInt7068) {
			int[] is = Class532_Sub3_Sub1.anIntArrayArray7072[i_3_];
			int i_41_ = Class275.method4890(i - i_4_, (Class532_Sub3_Sub1.anInt7071 * -612590951), (-1345107225 * Class532_Sub3_Sub1.anInt7069), 1055094720);
			int i_42_ = Class275.method4890(i + i_4_, (Class532_Sub3_Sub1.anInt7071 * -612590951), (-1345107225 * Class532_Sub3_Sub1.anInt7069), 651225496);
			int i_43_ = Class275.method4890(i - i_13_, (Class532_Sub3_Sub1.anInt7071 * -612590951), (-1345107225 * Class532_Sub3_Sub1.anInt7069), 568370220);
			int i_44_ = Class275.method4890(i + i_13_, (-612590951 * Class532_Sub3_Sub1.anInt7071), (Class532_Sub3_Sub1.anInt7069 * -1345107225), -475666035);
			Class232.method3922(is, i_41_, i_43_, i_7_, (byte) -27);
			Class232.method3922(is, i_43_, i_44_, i_6_, (byte) -31);
			Class232.method3922(is, i_44_, i_42_, i_7_, (byte) 16);
		}
		while (i_11_ > 0) {
			boolean bool = i_11_ <= i_14_;
			if (bool) {
				if (i_27_ < 0) {
					while (i_27_ < 0) {
						i_27_ += i_35_;
						i_28_ += i_39_;
						i_35_ += i_32_;
						i_39_ += i_32_;
						i_12_++;
					}
				}
				if (i_28_ < 0) {
					i_27_ += i_35_;
					i_28_ += i_39_;
					i_35_ += i_32_;
					i_39_ += i_32_;
					i_12_++;
				}
				i_27_ += -i_40_;
				i_28_ += -i_36_;
				i_36_ -= i_31_;
				i_40_ -= i_31_;
			}
			if (i_25_ < 0) {
				while (i_25_ < 0) {
					i_25_ += i_33_;
					i_26_ += i_37_;
					i_33_ += i_30_;
					i_37_ += i_30_;
					i_10_++;
				}
			}
			if (i_26_ < 0) {
				i_25_ += i_33_;
				i_26_ += i_37_;
				i_33_ += i_30_;
				i_37_ += i_30_;
				i_10_++;
			}
			i_25_ += -i_38_;
			i_26_ += -i_34_;
			i_34_ -= i_29_;
			i_38_ -= i_29_;
			i_11_--;
			int i_45_ = i_3_ - i_11_;
			int i_46_ = i_3_ + i_11_;
			if (i_46_ >= 324226563 * Class532_Sub3_Sub1.anInt7070 && i_45_ <= -348932735 * Class532_Sub3_Sub1.anInt7068) {
				int i_47_ = Class275.method4890(i + i_10_, (-612590951 * Class532_Sub3_Sub1.anInt7071), (-1345107225 * Class532_Sub3_Sub1.anInt7069), 682389056);
				int i_48_ = Class275.method4890(i - i_10_, (Class532_Sub3_Sub1.anInt7071 * -612590951), (Class532_Sub3_Sub1.anInt7069 * -1345107225), 304939185);
				if (bool) {
					int i_49_ = Class275.method4890(i_12_ + i, (-612590951 * Class532_Sub3_Sub1.anInt7071), (-1345107225 * Class532_Sub3_Sub1.anInt7069), -849253478);
					int i_50_ = Class275.method4890(i - i_12_, (Class532_Sub3_Sub1.anInt7071 * -612590951), (Class532_Sub3_Sub1.anInt7069 * -1345107225), -1762410169);
					if (i_45_ >= 324226563 * Class532_Sub3_Sub1.anInt7070) {
						int[] is = Class532_Sub3_Sub1.anIntArrayArray7072[i_45_];
						Class232.method3922(is, i_48_, i_50_, i_7_, (byte) -1);
						Class232.method3922(is, i_50_, i_49_, i_6_, (byte) 59);
						Class232.method3922(is, i_49_, i_47_, i_7_, (byte) -30);
					}
					if (i_46_ <= Class532_Sub3_Sub1.anInt7068 * -348932735) {
						int[] is = Class532_Sub3_Sub1.anIntArrayArray7072[i_46_];
						Class232.method3922(is, i_48_, i_50_, i_7_, (byte) -15);
						Class232.method3922(is, i_50_, i_49_, i_6_, (byte) 5);
						Class232.method3922(is, i_49_, i_47_, i_7_, (byte) 62);
					}
				} else {
					if (i_45_ >= Class532_Sub3_Sub1.anInt7070 * 324226563)
						Class232.method3922((Class532_Sub3_Sub1.anIntArrayArray7072[i_45_]), i_48_, i_47_, i_7_, (byte) 66);
					if (i_46_ <= Class532_Sub3_Sub1.anInt7068 * -348932735)
						Class232.method3922((Class532_Sub3_Sub1.anIntArrayArray7072[i_46_]), i_48_, i_47_, i_7_, (byte) 92);
				}
			}
		}
	}

	public static Class467[] method6825(byte i) {
		if (Class149_Sub3.aClass467Array9380 == null) {
			Class467[] class467s = Class386.method6671(Class274.aClass470_3336, 1629641091);
			Class467[] class467s_51_ = new Class467[class467s.length];
			int i_52_ = 0;
			int i_53_ = Class393.aClass282_Sub54_4783.aClass468_Sub7_8210.method12666(527706569);
			while_135_: for (int i_54_ = 0; i_54_ < class467s.length; i_54_++) {
				Class467 class467 = class467s[i_54_];
				if ((class467.anInt5573 * -1254475713 <= 0 || class467.anInt5573 * -1254475713 >= 24) && class467.anInt5571 * -1928226539 >= 800 && -1980032233 * class467.anInt5574 >= 600 && (i_53_ != 2 || (class467.anInt5571 * -1928226539 <= 800 && class467.anInt5574 * -1980032233 <= 600)) && (i_53_ != 1 || (class467.anInt5571 * -1928226539 <= 1024 && -1980032233 * class467.anInt5574 <= 768))) {
					for (int i_55_ = 0; i_55_ < i_52_; i_55_++) {
						Class467 class467_56_ = class467s_51_[i_55_];
						if ((class467.anInt5571 * -1928226539 == -1928226539 * class467_56_.anInt5571) && (-1980032233 * class467.anInt5574 == -1980032233 * class467_56_.anInt5574)) {
							if (class467.anInt5573 * -1254475713 > class467_56_.anInt5573 * -1254475713)
								class467s_51_[i_55_] = class467;
							continue while_135_;
						}
					}
					class467s_51_[i_52_] = class467;
					i_52_++;
				}
			}
			Class149_Sub3.aClass467Array9380 = new Class467[i_52_];
			System.arraycopy(class467s_51_, 0, Class149_Sub3.aClass467Array9380, 0, i_52_);
			int[] is = new int[Class149_Sub3.aClass467Array9380.length];
			for (int i_57_ = 0; i_57_ < Class149_Sub3.aClass467Array9380.length; i_57_++) {
				Class467 class467 = Class149_Sub3.aClass467Array9380[i_57_];
				is[i_57_] = (-1980032233 * class467.anInt5574 * (-1928226539 * class467.anInt5571));
			}
			Class30.method796(is, Class149_Sub3.aClass467Array9380, -769727466);
		}
		return Class149_Sub3.aClass467Array9380;
	}
}
