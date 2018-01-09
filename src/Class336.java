/* Class336 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class336 {
	static final int anInt3917 = 8192;
	static final int anInt3918 = 2;
	static final int anInt3919 = 4;
	static final int anInt3920 = 8;
	static final int anInt3921 = 16;
	public int[][] anIntArrayArray3922;
	static final int anInt3923 = 64;
	static final int anInt3924 = 128;
	static final int anInt3925 = 2048;
	static final int anInt3926 = 16777216;
	static final int anInt3927 = 1024;
	static final int anInt3928 = 2116288512;
	static final int anInt3929 = 4096;
	static final int anInt3930 = 1;
	public int anInt3931;
	static final int anInt3932 = 512;
	static final int anInt3933 = 16384;
	static final int anInt3934 = 131072;
	public static final int anInt3935 = 262144;
	static final int anInt3936 = 2015625216;
	public static final int anInt3937 = 2883872;
	static final int anInt3938 = 4194304;
	public static final int anInt3939 = 33554432;
	static final int anInt3940 = 1625554944;
	public static final int anInt3941 = 2097152;
	static final int anInt3942 = 67108864;
	public static final int anInt3943 = 134217728;
	static final int anInt3944 = 268435456;
	public static final int anInt3945 = 536870912;
	public static final int anInt3946 = 1073741824;
	public static final int anInt3947 = 2883842;
	static final int anInt3948 = 256;
	static final int anInt3949 = 32;
	public static final int anInt3950 = 2883968;
	static final int anInt3951 = 1336147968;
	static final int anInt3952 = 1084489728;
	static final int anInt3953 = 524288;
	static final int anInt3954 = 1109655552;
	static final int anInt3955 = 1310982144;
	static final int anInt3956 = 1210318848;
	static final int anInt3957 = 1134821376;
	static final int anInt3958 = 1612972032;
	static final int anInt3959 = 2028208128;
	public static final int anInt3960 = 8388608;
	static final int anInt3961 = 1675886592;
	static final int anInt3962 = 32768;
	public static final int anInt3963 = 2883848;
	public int anInt3964;
	int anInt3965;
	int anInt3966;
	static final int anInt3967 = 65536;
	static int anInt3968;

	public void method5964(int i, int i_0_) {
		i -= -1969357273 * anInt3931;
		i_0_ -= anInt3964 * 1503444365;
		anIntArrayArray3922[i][i_0_] |= 0x40000;
	}

	public void method5965(byte i) {
		for (int i_1_ = 0; i_1_ < ((Class336) this).anInt3965 * -1208414035; i_1_++) {
			for (int i_2_ = 0; i_2_ < 117800569 * ((Class336) this).anInt3966; i_2_++) {
				if (0 == i_1_ || i_2_ == 0 || i_1_ >= -1208414035 * ((Class336) this).anInt3965 - 5 || i_2_ >= 117800569 * ((Class336) this).anInt3966 - 5)
					anIntArrayArray3922[i_1_][i_2_] = -1;
				else
					anIntArrayArray3922[i_1_][i_2_] = 2097152;
			}
		}
	}

	public void method5966(int i, int i_3_) {
		i -= anInt3931 * -1969357273;
		i_3_ -= anInt3964 * 1503444365;
		anIntArrayArray3922[i][i_3_] &= ~0x200000;
	}

	public void method5967(int i, int i_4_, int i_5_, int i_6_, boolean bool, boolean bool_7_, byte i_8_) {
		int i_9_ = 256;
		if (bool)
			i_9_ |= 0x20000;
		if (bool_7_)
			i_9_ |= 0x40000000;
		i -= -1969357273 * anInt3931;
		i_4_ -= 1503444365 * anInt3964;
		for (int i_10_ = i; i_10_ < i + i_5_; i_10_++) {
			if (i_10_ >= 0 && i_10_ < -1208414035 * ((Class336) this).anInt3965) {
				for (int i_11_ = i_4_; i_11_ < i_4_ + i_6_; i_11_++) {
					if (i_11_ >= 0 && i_11_ < 117800569 * ((Class336) this).anInt3966)
						method5977(i_10_, i_11_, i_9_, (byte) -45);
				}
			}
		}
	}

	public void method5968(int i, int i_12_, int i_13_) {
		i -= -1969357273 * anInt3931;
		i_12_ -= anInt3964 * 1503444365;
		anIntArrayArray3922[i][i_12_] |= 0x40000;
	}

	public void method5969(int i, int i_14_) {
		i -= -1969357273 * anInt3931;
		i_14_ -= anInt3964 * 1503444365;
		anIntArrayArray3922[i][i_14_] |= 0x40000;
	}

	public void method5970(int i, int i_15_, int i_16_, int i_17_, int i_18_, boolean bool, boolean bool_19_, int i_20_) {
		int i_21_ = 256;
		if (bool)
			i_21_ |= 0x20000;
		if (bool_19_)
			i_21_ |= 0x40000000;
		i -= anInt3931 * -1969357273;
		i_15_ -= anInt3964 * 1503444365;
		if (1 == i_18_ || i_18_ == 3) {
			int i_22_ = i_16_;
			i_16_ = i_17_;
			i_17_ = i_22_;
		}
		for (int i_23_ = i; i_23_ < i + i_16_; i_23_++) {
			if (i_23_ >= 0 && i_23_ < -1208414035 * ((Class336) this).anInt3965) {
				for (int i_24_ = i_15_; i_24_ < i_17_ + i_15_; i_24_++) {
					if (i_24_ >= 0 && i_24_ < ((Class336) this).anInt3966 * 117800569)
						method5973(i_23_, i_24_, i_21_, (byte) 121);
				}
			}
		}
	}

	public void method5971(int i, int i_25_, int i_26_, int i_27_, boolean bool, boolean bool_28_, int i_29_) {
		i -= anInt3931 * -1969357273;
		i_25_ -= 1503444365 * anInt3964;
		if (i_26_ == 0) {
			if (0 == i_27_) {
				method5977(i, i_25_, 128, (byte) -66);
				method5977(i - 1, i_25_, 8, (byte) -78);
			}
			if (1 == i_27_) {
				method5977(i, i_25_, 2, (byte) -8);
				method5977(i, i_25_ + 1, 32, (byte) -40);
			}
			if (i_27_ == 2) {
				method5977(i, i_25_, 8, (byte) -5);
				method5977(1 + i, i_25_, 128, (byte) -55);
			}
			if (3 == i_27_) {
				method5977(i, i_25_, 32, (byte) -4);
				method5977(i, i_25_ - 1, 2, (byte) -73);
			}
		}
		if (1 == i_26_ || 3 == i_26_) {
			if (0 == i_27_) {
				method5977(i, i_25_, 1, (byte) -65);
				method5977(i - 1, i_25_ + 1, 16, (byte) -1);
			}
			if (i_27_ == 1) {
				method5977(i, i_25_, 4, (byte) -113);
				method5977(i + 1, 1 + i_25_, 64, (byte) -40);
			}
			if (i_27_ == 2) {
				method5977(i, i_25_, 16, (byte) -55);
				method5977(i + 1, i_25_ - 1, 1, (byte) -106);
			}
			if (3 == i_27_) {
				method5977(i, i_25_, 64, (byte) -119);
				method5977(i - 1, i_25_ - 1, 4, (byte) -35);
			}
		}
		if (i_26_ == 2) {
			if (i_27_ == 0) {
				method5977(i, i_25_, 130, (byte) -57);
				method5977(i - 1, i_25_, 8, (byte) -10);
				method5977(i, 1 + i_25_, 32, (byte) -15);
			}
			if (1 == i_27_) {
				method5977(i, i_25_, 10, (byte) -5);
				method5977(i, 1 + i_25_, 32, (byte) -98);
				method5977(1 + i, i_25_, 128, (byte) -13);
			}
			if (i_27_ == 2) {
				method5977(i, i_25_, 40, (byte) -32);
				method5977(1 + i, i_25_, 128, (byte) -104);
				method5977(i, i_25_ - 1, 2, (byte) -11);
			}
			if (i_27_ == 3) {
				method5977(i, i_25_, 160, (byte) -41);
				method5977(i, i_25_ - 1, 2, (byte) -112);
				method5977(i - 1, i_25_, 8, (byte) -103);
			}
		}
		if (bool) {
			if (i_26_ == 0) {
				if (0 == i_27_) {
					method5977(i, i_25_, 65536, (byte) -54);
					method5977(i - 1, i_25_, 4096, (byte) -117);
				}
				if (i_27_ == 1) {
					method5977(i, i_25_, 1024, (byte) -86);
					method5977(i, 1 + i_25_, 16384, (byte) -114);
				}
				if (i_27_ == 2) {
					method5977(i, i_25_, 4096, (byte) -112);
					method5977(1 + i, i_25_, 65536, (byte) -88);
				}
				if (3 == i_27_) {
					method5977(i, i_25_, 16384, (byte) -20);
					method5977(i, i_25_ - 1, 1024, (byte) -12);
				}
			}
			if (1 == i_26_ || i_26_ == 3) {
				if (i_27_ == 0) {
					method5977(i, i_25_, 512, (byte) -118);
					method5977(i - 1, i_25_ + 1, 8192, (byte) -106);
				}
				if (1 == i_27_) {
					method5977(i, i_25_, 2048, (byte) -15);
					method5977(i + 1, 1 + i_25_, 32768, (byte) -59);
				}
				if (2 == i_27_) {
					method5977(i, i_25_, 8192, (byte) -115);
					method5977(i + 1, i_25_ - 1, 512, (byte) -60);
				}
				if (i_27_ == 3) {
					method5977(i, i_25_, 32768, (byte) -88);
					method5977(i - 1, i_25_ - 1, 2048, (byte) -40);
				}
			}
			if (i_26_ == 2) {
				if (0 == i_27_) {
					method5977(i, i_25_, 66560, (byte) -32);
					method5977(i - 1, i_25_, 4096, (byte) -5);
					method5977(i, i_25_ + 1, 16384, (byte) -16);
				}
				if (i_27_ == 1) {
					method5977(i, i_25_, 5120, (byte) -17);
					method5977(i, 1 + i_25_, 16384, (byte) -115);
					method5977(i + 1, i_25_, 65536, (byte) -83);
				}
				if (i_27_ == 2) {
					method5977(i, i_25_, 20480, (byte) -124);
					method5977(1 + i, i_25_, 65536, (byte) -78);
					method5977(i, i_25_ - 1, 1024, (byte) -2);
				}
				if (3 == i_27_) {
					method5977(i, i_25_, 81920, (byte) -97);
					method5977(i, i_25_ - 1, 1024, (byte) -22);
					method5977(i - 1, i_25_, 4096, (byte) -53);
				}
			}
		}
		if (bool_28_) {
			if (i_26_ == 0) {
				if (i_27_ == 0) {
					method5977(i, i_25_, 536870912, (byte) -6);
					method5977(i - 1, i_25_, 33554432, (byte) -69);
				}
				if (i_27_ == 1) {
					method5977(i, i_25_, 8388608, (byte) -99);
					method5977(i, i_25_ + 1, 134217728, (byte) -100);
				}
				if (2 == i_27_) {
					method5977(i, i_25_, 33554432, (byte) -18);
					method5977(i + 1, i_25_, 536870912, (byte) -23);
				}
				if (i_27_ == 3) {
					method5977(i, i_25_, 134217728, (byte) -104);
					method5977(i, i_25_ - 1, 8388608, (byte) -88);
				}
			}
			if (i_26_ == 1 || 3 == i_26_) {
				if (i_27_ == 0) {
					method5977(i, i_25_, 4194304, (byte) -116);
					method5977(i - 1, i_25_ + 1, 67108864, (byte) -95);
				}
				if (i_27_ == 1) {
					method5977(i, i_25_, 16777216, (byte) -120);
					method5977(i + 1, 1 + i_25_, 268435456, (byte) -127);
				}
				if (2 == i_27_) {
					method5977(i, i_25_, 67108864, (byte) -59);
					method5977(1 + i, i_25_ - 1, 4194304, (byte) -92);
				}
				if (i_27_ == 3) {
					method5977(i, i_25_, 268435456, (byte) -63);
					method5977(i - 1, i_25_ - 1, 16777216, (byte) -69);
				}
			}
			if (2 == i_26_) {
				if (i_27_ == 0) {
					method5977(i, i_25_, 545259520, (byte) -108);
					method5977(i - 1, i_25_, 33554432, (byte) -103);
					method5977(i, i_25_ + 1, 134217728, (byte) -9);
				}
				if (1 == i_27_) {
					method5977(i, i_25_, 41943040, (byte) -99);
					method5977(i, i_25_ + 1, 134217728, (byte) -27);
					method5977(i + 1, i_25_, 536870912, (byte) -124);
				}
				if (2 == i_27_) {
					method5977(i, i_25_, 167772160, (byte) -67);
					method5977(1 + i, i_25_, 536870912, (byte) -102);
					method5977(i, i_25_ - 1, 8388608, (byte) -115);
				}
				if (3 == i_27_) {
					method5977(i, i_25_, 671088640, (byte) -1);
					method5977(i, i_25_ - 1, 8388608, (byte) -83);
					method5977(i - 1, i_25_, 33554432, (byte) -81);
				}
			}
		}
	}

	public void method5972(int i, int i_30_, int i_31_) {
		i -= -1969357273 * anInt3931;
		i_30_ -= 1503444365 * anInt3964;
		anIntArrayArray3922[i][i_30_] |= 0x200000;
	}

	void method5973(int i, int i_32_, int i_33_, byte i_34_) {
		anIntArrayArray3922[i][i_32_] &= i_33_ ^ 0xffffffff;
	}

	public void method5974(int i, int i_35_, int i_36_) {
		i -= anInt3931 * -1969357273;
		i_35_ -= anInt3964 * 1503444365;
		anIntArrayArray3922[i][i_35_] &= ~0x200000;
	}

	void method5975(int i, int i_37_, int i_38_) {
		anIntArrayArray3922[i][i_37_] |= i_38_;
	}

	public void method5976(int i, int i_39_, int i_40_, int i_41_, int i_42_, boolean bool, boolean bool_43_) {
		int i_44_ = 256;
		if (bool)
			i_44_ |= 0x20000;
		if (bool_43_)
			i_44_ |= 0x40000000;
		i -= anInt3931 * -1969357273;
		i_39_ -= anInt3964 * 1503444365;
		if (1 == i_42_ || i_42_ == 3) {
			int i_45_ = i_40_;
			i_40_ = i_41_;
			i_41_ = i_45_;
		}
		for (int i_46_ = i; i_46_ < i + i_40_; i_46_++) {
			if (i_46_ >= 0 && i_46_ < -1208414035 * ((Class336) this).anInt3965) {
				for (int i_47_ = i_39_; i_47_ < i_41_ + i_39_; i_47_++) {
					if (i_47_ >= 0 && i_47_ < ((Class336) this).anInt3966 * 117800569)
						method5973(i_46_, i_47_, i_44_, (byte) 110);
				}
			}
		}
	}

	void method5977(int i, int i_48_, int i_49_, byte i_50_) {
		anIntArrayArray3922[i][i_48_] |= i_49_;
	}

	public boolean method5978(int i, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_) {
		int i_60_ = i + i_52_;
		int i_61_ = i_53_ + i_51_;
		int i_62_ = i_56_ + i_54_;
		int i_63_ = i_55_ + i_57_;
		if (i == i_62_ && 0 == (i_58_ & 0x2)) {
			int i_64_ = i_51_ > i_55_ ? i_51_ : i_55_;
			for (int i_65_ = i_61_ < i_63_ ? i_61_ : i_63_; i_64_ < i_65_; i_64_++) {
				if (((anIntArrayArray3922[i_62_ - 1 - -1969357273 * anInt3931][i_64_ - 1503444365 * anInt3964]) & 0x8) == 0)
					return true;
			}
		} else if (i_60_ == i_54_ && 0 == (i_58_ & 0x8)) {
			int i_66_ = i_51_ > i_55_ ? i_51_ : i_55_;
			for (int i_67_ = i_61_ < i_63_ ? i_61_ : i_63_; i_66_ < i_67_; i_66_++) {
				if (0 == ((anIntArrayArray3922[i_54_ - anInt3931 * -1969357273][i_66_ - 1503444365 * anInt3964]) & 0x80))
					return true;
			}
		} else if (i_51_ == i_63_ && 0 == (i_58_ & 0x1)) {
			int i_68_ = i > i_54_ ? i : i_54_;
			for (int i_69_ = i_60_ < i_62_ ? i_60_ : i_62_; i_68_ < i_69_; i_68_++) {
				if (0 == ((anIntArrayArray3922[i_68_ - anInt3931 * -1969357273][i_63_ - 1 - anInt3964 * 1503444365]) & 0x2))
					return true;
			}
		} else if (i_61_ == i_55_ && 0 == (i_58_ & 0x4)) {
			int i_70_ = i > i_54_ ? i : i_54_;
			for (int i_71_ = i_60_ < i_62_ ? i_60_ : i_62_; i_70_ < i_71_; i_70_++) {
				if (0 == ((anIntArrayArray3922[i_70_ - -1969357273 * anInt3931][i_55_ - 1503444365 * anInt3964]) & 0x20))
					return true;
			}
		}
		return false;
	}

	public static Class336 method5979(int i, int i_72_) {
		Class336 class336 = new Class336();
		class336.anInt3931 = -892178839;
		class336.anInt3964 = 1315713723;
		((Class336) class336).anInt3965 = 260756261 * (5 + (1 + i));
		((Class336) class336).anInt3966 = (5 + (i_72_ + 1)) * 2015661001;
		class336.anIntArrayArray3922 = (new int[((Class336) class336).anInt3965 * -1208414035][((Class336) class336).anInt3966 * 117800569]);
		class336.method5965((byte) 5);
		return class336;
	}

	public static Class336 method5980(int i, int i_73_) {
		Class336 class336 = new Class336();
		class336.anInt3931 = -892178839;
		class336.anInt3964 = 1315713723;
		((Class336) class336).anInt3965 = 260756261 * (5 + (1 + i));
		((Class336) class336).anInt3966 = (5 + (i_73_ + 1)) * 2015661001;
		class336.anIntArrayArray3922 = (new int[((Class336) class336).anInt3965 * -1208414035][((Class336) class336).anInt3966 * 117800569]);
		class336.method5965((byte) 5);
		return class336;
	}

	public void method5981() {
		for (int i = 0; i < ((Class336) this).anInt3965 * -1208414035; i++) {
			for (int i_74_ = 0; i_74_ < 117800569 * ((Class336) this).anInt3966; i_74_++) {
				if (0 == i || i_74_ == 0 || i >= -1208414035 * ((Class336) this).anInt3965 - 5 || i_74_ >= 117800569 * ((Class336) this).anInt3966 - 5)
					anIntArrayArray3922[i][i_74_] = -1;
				else
					anIntArrayArray3922[i][i_74_] = 2097152;
			}
		}
	}

	public void method5982(int i, int i_75_, int i_76_, int i_77_, boolean bool, boolean bool_78_) {
		i -= anInt3931 * -1969357273;
		i_75_ -= 1503444365 * anInt3964;
		if (i_76_ == 0) {
			if (0 == i_77_) {
				method5977(i, i_75_, 128, (byte) -72);
				method5977(i - 1, i_75_, 8, (byte) -77);
			}
			if (1 == i_77_) {
				method5977(i, i_75_, 2, (byte) -52);
				method5977(i, i_75_ + 1, 32, (byte) -86);
			}
			if (i_77_ == 2) {
				method5977(i, i_75_, 8, (byte) -36);
				method5977(1 + i, i_75_, 128, (byte) -77);
			}
			if (3 == i_77_) {
				method5977(i, i_75_, 32, (byte) -24);
				method5977(i, i_75_ - 1, 2, (byte) -31);
			}
		}
		if (1 == i_76_ || 3 == i_76_) {
			if (0 == i_77_) {
				method5977(i, i_75_, 1, (byte) -108);
				method5977(i - 1, i_75_ + 1, 16, (byte) -87);
			}
			if (i_77_ == 1) {
				method5977(i, i_75_, 4, (byte) -3);
				method5977(i + 1, 1 + i_75_, 64, (byte) -113);
			}
			if (i_77_ == 2) {
				method5977(i, i_75_, 16, (byte) -5);
				method5977(i + 1, i_75_ - 1, 1, (byte) -40);
			}
			if (3 == i_77_) {
				method5977(i, i_75_, 64, (byte) -77);
				method5977(i - 1, i_75_ - 1, 4, (byte) -12);
			}
		}
		if (i_76_ == 2) {
			if (i_77_ == 0) {
				method5977(i, i_75_, 130, (byte) -7);
				method5977(i - 1, i_75_, 8, (byte) -33);
				method5977(i, 1 + i_75_, 32, (byte) -117);
			}
			if (1 == i_77_) {
				method5977(i, i_75_, 10, (byte) -85);
				method5977(i, 1 + i_75_, 32, (byte) -78);
				method5977(1 + i, i_75_, 128, (byte) -88);
			}
			if (i_77_ == 2) {
				method5977(i, i_75_, 40, (byte) -105);
				method5977(1 + i, i_75_, 128, (byte) -15);
				method5977(i, i_75_ - 1, 2, (byte) -61);
			}
			if (i_77_ == 3) {
				method5977(i, i_75_, 160, (byte) -42);
				method5977(i, i_75_ - 1, 2, (byte) -77);
				method5977(i - 1, i_75_, 8, (byte) -87);
			}
		}
		if (bool) {
			if (i_76_ == 0) {
				if (0 == i_77_) {
					method5977(i, i_75_, 65536, (byte) -46);
					method5977(i - 1, i_75_, 4096, (byte) -88);
				}
				if (i_77_ == 1) {
					method5977(i, i_75_, 1024, (byte) -111);
					method5977(i, 1 + i_75_, 16384, (byte) -58);
				}
				if (i_77_ == 2) {
					method5977(i, i_75_, 4096, (byte) -90);
					method5977(1 + i, i_75_, 65536, (byte) -65);
				}
				if (3 == i_77_) {
					method5977(i, i_75_, 16384, (byte) -40);
					method5977(i, i_75_ - 1, 1024, (byte) -81);
				}
			}
			if (1 == i_76_ || i_76_ == 3) {
				if (i_77_ == 0) {
					method5977(i, i_75_, 512, (byte) -105);
					method5977(i - 1, i_75_ + 1, 8192, (byte) -56);
				}
				if (1 == i_77_) {
					method5977(i, i_75_, 2048, (byte) -20);
					method5977(i + 1, 1 + i_75_, 32768, (byte) -35);
				}
				if (2 == i_77_) {
					method5977(i, i_75_, 8192, (byte) -118);
					method5977(i + 1, i_75_ - 1, 512, (byte) -24);
				}
				if (i_77_ == 3) {
					method5977(i, i_75_, 32768, (byte) -8);
					method5977(i - 1, i_75_ - 1, 2048, (byte) -104);
				}
			}
			if (i_76_ == 2) {
				if (0 == i_77_) {
					method5977(i, i_75_, 66560, (byte) -51);
					method5977(i - 1, i_75_, 4096, (byte) -120);
					method5977(i, i_75_ + 1, 16384, (byte) -75);
				}
				if (i_77_ == 1) {
					method5977(i, i_75_, 5120, (byte) -57);
					method5977(i, 1 + i_75_, 16384, (byte) -4);
					method5977(i + 1, i_75_, 65536, (byte) -73);
				}
				if (i_77_ == 2) {
					method5977(i, i_75_, 20480, (byte) -22);
					method5977(1 + i, i_75_, 65536, (byte) -90);
					method5977(i, i_75_ - 1, 1024, (byte) -50);
				}
				if (3 == i_77_) {
					method5977(i, i_75_, 81920, (byte) -107);
					method5977(i, i_75_ - 1, 1024, (byte) -122);
					method5977(i - 1, i_75_, 4096, (byte) -117);
				}
			}
		}
		if (bool_78_) {
			if (i_76_ == 0) {
				if (i_77_ == 0) {
					method5977(i, i_75_, 536870912, (byte) -112);
					method5977(i - 1, i_75_, 33554432, (byte) -24);
				}
				if (i_77_ == 1) {
					method5977(i, i_75_, 8388608, (byte) -46);
					method5977(i, i_75_ + 1, 134217728, (byte) -104);
				}
				if (2 == i_77_) {
					method5977(i, i_75_, 33554432, (byte) -69);
					method5977(i + 1, i_75_, 536870912, (byte) -114);
				}
				if (i_77_ == 3) {
					method5977(i, i_75_, 134217728, (byte) -109);
					method5977(i, i_75_ - 1, 8388608, (byte) -73);
				}
			}
			if (i_76_ == 1 || 3 == i_76_) {
				if (i_77_ == 0) {
					method5977(i, i_75_, 4194304, (byte) -109);
					method5977(i - 1, i_75_ + 1, 67108864, (byte) -126);
				}
				if (i_77_ == 1) {
					method5977(i, i_75_, 16777216, (byte) -91);
					method5977(i + 1, 1 + i_75_, 268435456, (byte) -31);
				}
				if (2 == i_77_) {
					method5977(i, i_75_, 67108864, (byte) -23);
					method5977(1 + i, i_75_ - 1, 4194304, (byte) -8);
				}
				if (i_77_ == 3) {
					method5977(i, i_75_, 268435456, (byte) -15);
					method5977(i - 1, i_75_ - 1, 16777216, (byte) -28);
				}
			}
			if (2 == i_76_) {
				if (i_77_ == 0) {
					method5977(i, i_75_, 545259520, (byte) -104);
					method5977(i - 1, i_75_, 33554432, (byte) -25);
					method5977(i, i_75_ + 1, 134217728, (byte) -36);
				}
				if (1 == i_77_) {
					method5977(i, i_75_, 41943040, (byte) -77);
					method5977(i, i_75_ + 1, 134217728, (byte) -103);
					method5977(i + 1, i_75_, 536870912, (byte) -34);
				}
				if (2 == i_77_) {
					method5977(i, i_75_, 167772160, (byte) -69);
					method5977(1 + i, i_75_, 536870912, (byte) -127);
					method5977(i, i_75_ - 1, 8388608, (byte) -124);
				}
				if (3 == i_77_) {
					method5977(i, i_75_, 671088640, (byte) -82);
					method5977(i, i_75_ - 1, 8388608, (byte) -4);
					method5977(i - 1, i_75_, 33554432, (byte) -60);
				}
			}
		}
	}

	public void method5983(int i, int i_79_, int i_80_, int i_81_, boolean bool, boolean bool_82_) {
		i -= anInt3931 * -1969357273;
		i_79_ -= 1503444365 * anInt3964;
		if (i_80_ == 0) {
			if (0 == i_81_) {
				method5977(i, i_79_, 128, (byte) -85);
				method5977(i - 1, i_79_, 8, (byte) -59);
			}
			if (1 == i_81_) {
				method5977(i, i_79_, 2, (byte) -43);
				method5977(i, i_79_ + 1, 32, (byte) -34);
			}
			if (i_81_ == 2) {
				method5977(i, i_79_, 8, (byte) -23);
				method5977(1 + i, i_79_, 128, (byte) -17);
			}
			if (3 == i_81_) {
				method5977(i, i_79_, 32, (byte) -53);
				method5977(i, i_79_ - 1, 2, (byte) -35);
			}
		}
		if (1 == i_80_ || 3 == i_80_) {
			if (0 == i_81_) {
				method5977(i, i_79_, 1, (byte) -71);
				method5977(i - 1, i_79_ + 1, 16, (byte) -38);
			}
			if (i_81_ == 1) {
				method5977(i, i_79_, 4, (byte) -82);
				method5977(i + 1, 1 + i_79_, 64, (byte) -128);
			}
			if (i_81_ == 2) {
				method5977(i, i_79_, 16, (byte) -111);
				method5977(i + 1, i_79_ - 1, 1, (byte) -7);
			}
			if (3 == i_81_) {
				method5977(i, i_79_, 64, (byte) -97);
				method5977(i - 1, i_79_ - 1, 4, (byte) -51);
			}
		}
		if (i_80_ == 2) {
			if (i_81_ == 0) {
				method5977(i, i_79_, 130, (byte) -8);
				method5977(i - 1, i_79_, 8, (byte) -95);
				method5977(i, 1 + i_79_, 32, (byte) -126);
			}
			if (1 == i_81_) {
				method5977(i, i_79_, 10, (byte) -127);
				method5977(i, 1 + i_79_, 32, (byte) -54);
				method5977(1 + i, i_79_, 128, (byte) -42);
			}
			if (i_81_ == 2) {
				method5977(i, i_79_, 40, (byte) -41);
				method5977(1 + i, i_79_, 128, (byte) -124);
				method5977(i, i_79_ - 1, 2, (byte) -108);
			}
			if (i_81_ == 3) {
				method5977(i, i_79_, 160, (byte) -40);
				method5977(i, i_79_ - 1, 2, (byte) -77);
				method5977(i - 1, i_79_, 8, (byte) -54);
			}
		}
		if (bool) {
			if (i_80_ == 0) {
				if (0 == i_81_) {
					method5977(i, i_79_, 65536, (byte) -111);
					method5977(i - 1, i_79_, 4096, (byte) -60);
				}
				if (i_81_ == 1) {
					method5977(i, i_79_, 1024, (byte) -77);
					method5977(i, 1 + i_79_, 16384, (byte) -59);
				}
				if (i_81_ == 2) {
					method5977(i, i_79_, 4096, (byte) -94);
					method5977(1 + i, i_79_, 65536, (byte) -104);
				}
				if (3 == i_81_) {
					method5977(i, i_79_, 16384, (byte) -108);
					method5977(i, i_79_ - 1, 1024, (byte) -109);
				}
			}
			if (1 == i_80_ || i_80_ == 3) {
				if (i_81_ == 0) {
					method5977(i, i_79_, 512, (byte) -19);
					method5977(i - 1, i_79_ + 1, 8192, (byte) -34);
				}
				if (1 == i_81_) {
					method5977(i, i_79_, 2048, (byte) -46);
					method5977(i + 1, 1 + i_79_, 32768, (byte) -24);
				}
				if (2 == i_81_) {
					method5977(i, i_79_, 8192, (byte) -104);
					method5977(i + 1, i_79_ - 1, 512, (byte) -98);
				}
				if (i_81_ == 3) {
					method5977(i, i_79_, 32768, (byte) -34);
					method5977(i - 1, i_79_ - 1, 2048, (byte) -46);
				}
			}
			if (i_80_ == 2) {
				if (0 == i_81_) {
					method5977(i, i_79_, 66560, (byte) -32);
					method5977(i - 1, i_79_, 4096, (byte) -39);
					method5977(i, i_79_ + 1, 16384, (byte) -40);
				}
				if (i_81_ == 1) {
					method5977(i, i_79_, 5120, (byte) -46);
					method5977(i, 1 + i_79_, 16384, (byte) -67);
					method5977(i + 1, i_79_, 65536, (byte) -109);
				}
				if (i_81_ == 2) {
					method5977(i, i_79_, 20480, (byte) -6);
					method5977(1 + i, i_79_, 65536, (byte) -73);
					method5977(i, i_79_ - 1, 1024, (byte) -9);
				}
				if (3 == i_81_) {
					method5977(i, i_79_, 81920, (byte) -66);
					method5977(i, i_79_ - 1, 1024, (byte) -80);
					method5977(i - 1, i_79_, 4096, (byte) -14);
				}
			}
		}
		if (bool_82_) {
			if (i_80_ == 0) {
				if (i_81_ == 0) {
					method5977(i, i_79_, 536870912, (byte) -95);
					method5977(i - 1, i_79_, 33554432, (byte) -20);
				}
				if (i_81_ == 1) {
					method5977(i, i_79_, 8388608, (byte) -98);
					method5977(i, i_79_ + 1, 134217728, (byte) -102);
				}
				if (2 == i_81_) {
					method5977(i, i_79_, 33554432, (byte) -101);
					method5977(i + 1, i_79_, 536870912, (byte) -43);
				}
				if (i_81_ == 3) {
					method5977(i, i_79_, 134217728, (byte) -66);
					method5977(i, i_79_ - 1, 8388608, (byte) -99);
				}
			}
			if (i_80_ == 1 || 3 == i_80_) {
				if (i_81_ == 0) {
					method5977(i, i_79_, 4194304, (byte) -37);
					method5977(i - 1, i_79_ + 1, 67108864, (byte) -124);
				}
				if (i_81_ == 1) {
					method5977(i, i_79_, 16777216, (byte) -109);
					method5977(i + 1, 1 + i_79_, 268435456, (byte) -60);
				}
				if (2 == i_81_) {
					method5977(i, i_79_, 67108864, (byte) -10);
					method5977(1 + i, i_79_ - 1, 4194304, (byte) -20);
				}
				if (i_81_ == 3) {
					method5977(i, i_79_, 268435456, (byte) -76);
					method5977(i - 1, i_79_ - 1, 16777216, (byte) -53);
				}
			}
			if (2 == i_80_) {
				if (i_81_ == 0) {
					method5977(i, i_79_, 545259520, (byte) -15);
					method5977(i - 1, i_79_, 33554432, (byte) -54);
					method5977(i, i_79_ + 1, 134217728, (byte) -128);
				}
				if (1 == i_81_) {
					method5977(i, i_79_, 41943040, (byte) -77);
					method5977(i, i_79_ + 1, 134217728, (byte) -47);
					method5977(i + 1, i_79_, 536870912, (byte) -33);
				}
				if (2 == i_81_) {
					method5977(i, i_79_, 167772160, (byte) -122);
					method5977(1 + i, i_79_, 536870912, (byte) -23);
					method5977(i, i_79_ - 1, 8388608, (byte) -55);
				}
				if (3 == i_81_) {
					method5977(i, i_79_, 671088640, (byte) -25);
					method5977(i, i_79_ - 1, 8388608, (byte) -83);
					method5977(i - 1, i_79_, 33554432, (byte) -126);
				}
			}
		}
	}

	void method5984(int i, int i_83_, int i_84_) {
		anIntArrayArray3922[i][i_83_] &= i_84_ ^ 0xffffffff;
	}

	public void method5985(int i, int i_85_) {
		i -= -1969357273 * anInt3931;
		i_85_ -= 1503444365 * anInt3964;
		anIntArrayArray3922[i][i_85_] |= 0x200000;
	}

	public boolean method5986(int i, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_, int i_91_, short i_92_) {
		if (i_87_ == 1) {
			if (i_88_ == i && i_86_ == i_89_)
				return true;
		} else if (i_88_ >= i && i_88_ <= i + i_87_ - 1 && i_89_ >= i_89_ && i_89_ <= i_87_ + i_89_ - 1)
			return true;
		i -= anInt3931 * -1969357273;
		i_86_ -= anInt3964 * 1503444365;
		i_88_ -= anInt3931 * -1969357273;
		i_89_ -= anInt3964 * 1503444365;
		if (1 == i_87_) {
			if (i_90_ == 0) {
				if (0 == i_91_) {
					if (i == i_88_ - 1 && i_89_ == i_86_)
						return true;
					if (i_88_ == i && 1 + i_89_ == i_86_ && (anIntArrayArray3922[i][i_86_] & 0x2c0120) == 0)
						return true;
					if (i == i_88_ && i_89_ - 1 == i_86_ && (anIntArrayArray3922[i][i_86_] & 0x2c0102) == 0)
						return true;
				} else if (i_91_ == 1) {
					if (i == i_88_ && 1 + i_89_ == i_86_)
						return true;
					if (i == i_88_ - 1 && i_86_ == i_89_ && (anIntArrayArray3922[i][i_86_] & 0x2c0108) == 0)
						return true;
					if (i == i_88_ + 1 && i_86_ == i_89_ && 0 == (anIntArrayArray3922[i][i_86_] & 0x2c0180))
						return true;
				} else if (2 == i_91_) {
					if (i == 1 + i_88_ && i_89_ == i_86_)
						return true;
					if (i == i_88_ && i_86_ == i_89_ + 1 && 0 == (anIntArrayArray3922[i][i_86_] & 0x2c0120))
						return true;
					if (i_88_ == i && i_86_ == i_89_ - 1 && 0 == (anIntArrayArray3922[i][i_86_] & 0x2c0102))
						return true;
				} else if (3 == i_91_) {
					if (i == i_88_ && i_86_ == i_89_ - 1)
						return true;
					if (i == i_88_ - 1 && i_86_ == i_89_ && (anIntArrayArray3922[i][i_86_] & 0x2c0108) == 0)
						return true;
					if (i == 1 + i_88_ && i_89_ == i_86_ && 0 == (anIntArrayArray3922[i][i_86_] & 0x2c0180))
						return true;
				}
			}
			if (i_90_ == 2) {
				if (0 == i_91_) {
					if (i == i_88_ - 1 && i_86_ == i_89_)
						return true;
					if (i == i_88_ && i_86_ == 1 + i_89_)
						return true;
					if (1 + i_88_ == i && i_86_ == i_89_ && 0 == (anIntArrayArray3922[i][i_86_] & 0x2c0180))
						return true;
					if (i == i_88_ && i_89_ - 1 == i_86_ && 0 == (anIntArrayArray3922[i][i_86_] & 0x2c0102))
						return true;
				} else if (1 == i_91_) {
					if (i == i_88_ - 1 && i_86_ == i_89_ && 0 == (anIntArrayArray3922[i][i_86_] & 0x2c0108))
						return true;
					if (i == i_88_ && 1 + i_89_ == i_86_)
						return true;
					if (i == i_88_ + 1 && i_86_ == i_89_)
						return true;
					if (i_88_ == i && i_86_ == i_89_ - 1 && 0 == (anIntArrayArray3922[i][i_86_] & 0x2c0102))
						return true;
				} else if (2 == i_91_) {
					if (i_88_ - 1 == i && i_89_ == i_86_ && (anIntArrayArray3922[i][i_86_] & 0x2c0108) == 0)
						return true;
					if (i == i_88_ && i_89_ + 1 == i_86_ && (anIntArrayArray3922[i][i_86_] & 0x2c0120) == 0)
						return true;
					if (i_88_ + 1 == i && i_89_ == i_86_)
						return true;
					if (i == i_88_ && i_89_ - 1 == i_86_)
						return true;
				} else if (3 == i_91_) {
					if (i_88_ - 1 == i && i_89_ == i_86_)
						return true;
					if (i == i_88_ && i_86_ == i_89_ + 1 && (anIntArrayArray3922[i][i_86_] & 0x2c0120) == 0)
						return true;
					if (1 + i_88_ == i && i_86_ == i_89_ && 0 == (anIntArrayArray3922[i][i_86_] & 0x2c0180))
						return true;
					if (i == i_88_ && i_89_ - 1 == i_86_)
						return true;
				}
			}
			if (9 == i_90_) {
				if (i == i_88_ && i_86_ == i_89_ + 1 && (anIntArrayArray3922[i][i_86_] & 0x20) == 0)
					return true;
				if (i == i_88_ && i_89_ - 1 == i_86_ && 0 == (anIntArrayArray3922[i][i_86_] & 0x2))
					return true;
				if (i_88_ - 1 == i && i_89_ == i_86_ && 0 == (anIntArrayArray3922[i][i_86_] & 0x8))
					return true;
				if (1 + i_88_ == i && i_89_ == i_86_ && 0 == (anIntArrayArray3922[i][i_86_] & 0x80))
					return true;
			}
		} else {
			int i_93_ = i + i_87_ - 1;
			int i_94_ = i_87_ + i_86_ - 1;
			if (i_90_ == 0) {
				if (i_91_ == 0) {
					if (i == i_88_ - i_87_ && i_89_ >= i_86_ && i_89_ <= i_94_)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_89_ + 1 == i_86_ && (anIntArrayArray3922[i_88_][i_86_] & 0x2c0120) == 0)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == i_89_ - i_87_ && (anIntArrayArray3922[i_88_][i_94_] & 0x2c0102) == 0)
						return true;
				} else if (i_91_ == 1) {
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == 1 + i_89_)
						return true;
					if (i_88_ - i_87_ == i && i_89_ >= i_86_ && i_89_ <= i_94_ && 0 == (anIntArrayArray3922[i_93_][i_89_] & 0x2c0108))
						return true;
					if (1 + i_88_ == i && i_89_ >= i_86_ && i_89_ <= i_94_ && (anIntArrayArray3922[i][i_89_] & 0x2c0180) == 0)
						return true;
				} else if (i_91_ == 2) {
					if (i == 1 + i_88_ && i_89_ >= i_86_ && i_89_ <= i_94_)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && 1 + i_89_ == i_86_ && 0 == (anIntArrayArray3922[i_88_][i_86_] & 0x2c0120))
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == i_89_ - i_87_ && (anIntArrayArray3922[i_88_][i_94_] & 0x2c0102) == 0)
						return true;
				} else if (i_91_ == 3) {
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == i_89_ - i_87_)
						return true;
					if (i_88_ - i_87_ == i && i_89_ >= i_86_ && i_89_ <= i_94_ && 0 == (anIntArrayArray3922[i_93_][i_89_] & 0x2c0108))
						return true;
					if (1 + i_88_ == i && i_89_ >= i_86_ && i_89_ <= i_94_ && (anIntArrayArray3922[i][i_89_] & 0x2c0180) == 0)
						return true;
				}
			}
			if (i_90_ == 2) {
				if (0 == i_91_) {
					if (i == i_88_ - i_87_ && i_89_ >= i_86_ && i_89_ <= i_94_)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == 1 + i_89_)
						return true;
					if (i == i_88_ + 1 && i_89_ >= i_86_ && i_89_ <= i_94_ && 0 == (anIntArrayArray3922[i][i_89_] & 0x2c0180))
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == i_89_ - i_87_ && 0 == (anIntArrayArray3922[i_88_][i_94_] & 0x2c0102))
						return true;
				} else if (1 == i_91_) {
					if (i_88_ - i_87_ == i && i_89_ >= i_86_ && i_89_ <= i_94_ && 0 == (anIntArrayArray3922[i_93_][i_89_] & 0x2c0108))
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == 1 + i_89_)
						return true;
					if (i == i_88_ + 1 && i_89_ >= i_86_ && i_89_ <= i_94_)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == i_89_ - i_87_ && 0 == (anIntArrayArray3922[i_88_][i_94_] & 0x2c0102))
						return true;
				} else if (2 == i_91_) {
					if (i_88_ - i_87_ == i && i_89_ >= i_86_ && i_89_ <= i_94_ && (anIntArrayArray3922[i_93_][i_89_] & 0x2c0108) == 0)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && 1 + i_89_ == i_86_ && (anIntArrayArray3922[i_88_][i_86_] & 0x2c0120) == 0)
						return true;
					if (1 + i_88_ == i && i_89_ >= i_86_ && i_89_ <= i_94_)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_89_ - i_87_ == i_86_)
						return true;
				} else if (i_91_ == 3) {
					if (i_88_ - i_87_ == i && i_89_ >= i_86_ && i_89_ <= i_94_)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_89_ + 1 == i_86_ && 0 == (anIntArrayArray3922[i_88_][i_86_] & 0x2c0120))
						return true;
					if (i_88_ + 1 == i && i_89_ >= i_86_ && i_89_ <= i_94_ && 0 == (anIntArrayArray3922[i][i_89_] & 0x2c0180))
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == i_89_ - i_87_)
						return true;
				}
			}
			if (9 == i_90_) {
				if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == 1 + i_89_ && 0 == (anIntArrayArray3922[i_88_][i_86_] & 0x2c0120))
					return true;
				if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == i_89_ - i_87_ && 0 == (anIntArrayArray3922[i_88_][i_94_] & 0x2c0102))
					return true;
				if (i_88_ - i_87_ == i && i_89_ >= i_86_ && i_89_ <= i_94_ && (anIntArrayArray3922[i_93_][i_89_] & 0x2c0108) == 0)
					return true;
				if (i == i_88_ + 1 && i_89_ >= i_86_ && i_89_ <= i_94_ && 0 == (anIntArrayArray3922[i][i_89_] & 0x2c0180))
					return true;
			}
		}
		return false;
	}

	public void method5987(int i, int i_95_) {
		i -= -1969357273 * anInt3931;
		i_95_ -= anInt3964 * 1503444365;
		anIntArrayArray3922[i][i_95_] |= 0x40000;
	}

	public boolean method5988(int i, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, byte i_103_) {
		if (i_97_ > 1) {
			if (Class325.method5790(i, i_96_, i_97_, i_97_, i_98_, i_99_, i_100_, i_101_, -386839744))
				return true;
			return method5978(i, i_96_, i_97_, i_97_, i_98_, i_99_, i_100_, i_101_, i_102_, -1585578368);
		}
		int i_104_ = i_100_ + i_98_ - 1;
		int i_105_ = i_101_ + i_99_ - 1;
		if (i >= i_98_ && i <= i_104_ && i_96_ >= i_99_ && i_96_ <= i_105_)
			return true;
		if (i_98_ - 1 == i && i_96_ >= i_99_ && i_96_ <= i_105_ && 0 == ((anIntArrayArray3922[i - anInt3931 * -1969357273][i_96_ - anInt3964 * 1503444365]) & 0x8) && (i_102_ & 0x8) == 0)
			return true;
		if (i_104_ + 1 == i && i_96_ >= i_99_ && i_96_ <= i_105_ && 0 == ((anIntArrayArray3922[i - -1969357273 * anInt3931][i_96_ - 1503444365 * anInt3964]) & 0x80) && 0 == (i_102_ & 0x2))
			return true;
		if (i_96_ == i_99_ - 1 && i >= i_98_ && i <= i_104_ && 0 == ((anIntArrayArray3922[i - -1969357273 * anInt3931][i_96_ - 1503444365 * anInt3964]) & 0x2) && (i_102_ & 0x4) == 0)
			return true;
		if (i_96_ == i_105_ + 1 && i >= i_98_ && i <= i_104_ && 0 == ((anIntArrayArray3922[i - anInt3931 * -1969357273][i_96_ - anInt3964 * 1503444365]) & 0x20) && 0 == (i_102_ & 0x1))
			return true;
		return false;
	}

	void method5989(int i, int i_106_, int i_107_) {
		anIntArrayArray3922[i][i_106_] &= i_107_ ^ 0xffffffff;
	}

	public void method5990(int i, int i_108_, int i_109_, int i_110_, boolean bool, boolean bool_111_) {
		i -= -1969357273 * anInt3931;
		i_108_ -= anInt3964 * 1503444365;
		if (i_109_ == 0) {
			if (i_110_ == 0) {
				method5973(i, i_108_, 128, (byte) 79);
				method5973(i - 1, i_108_, 8, (byte) 112);
			}
			if (i_110_ == 1) {
				method5973(i, i_108_, 2, (byte) 85);
				method5973(i, i_108_ + 1, 32, (byte) 80);
			}
			if (2 == i_110_) {
				method5973(i, i_108_, 8, (byte) 71);
				method5973(i + 1, i_108_, 128, (byte) 73);
			}
			if (3 == i_110_) {
				method5973(i, i_108_, 32, (byte) 110);
				method5973(i, i_108_ - 1, 2, (byte) 111);
			}
		}
		if (i_109_ == 1 || 3 == i_109_) {
			if (0 == i_110_) {
				method5973(i, i_108_, 1, (byte) 119);
				method5973(i - 1, 1 + i_108_, 16, (byte) 86);
			}
			if (1 == i_110_) {
				method5973(i, i_108_, 4, (byte) 93);
				method5973(i + 1, 1 + i_108_, 64, (byte) 100);
			}
			if (2 == i_110_) {
				method5973(i, i_108_, 16, (byte) 77);
				method5973(i + 1, i_108_ - 1, 1, (byte) 82);
			}
			if (i_110_ == 3) {
				method5973(i, i_108_, 64, (byte) 97);
				method5973(i - 1, i_108_ - 1, 4, (byte) 125);
			}
		}
		if (i_109_ == 2) {
			if (i_110_ == 0) {
				method5973(i, i_108_, 130, (byte) 99);
				method5973(i - 1, i_108_, 8, (byte) 115);
				method5973(i, 1 + i_108_, 32, (byte) 93);
			}
			if (1 == i_110_) {
				method5973(i, i_108_, 10, (byte) 72);
				method5973(i, i_108_ + 1, 32, (byte) 117);
				method5973(1 + i, i_108_, 128, (byte) 90);
			}
			if (2 == i_110_) {
				method5973(i, i_108_, 40, (byte) 115);
				method5973(i + 1, i_108_, 128, (byte) 74);
				method5973(i, i_108_ - 1, 2, (byte) 118);
			}
			if (3 == i_110_) {
				method5973(i, i_108_, 160, (byte) 123);
				method5973(i, i_108_ - 1, 2, (byte) 66);
				method5973(i - 1, i_108_, 8, (byte) 126);
			}
		}
		if (bool) {
			if (i_109_ == 0) {
				if (i_110_ == 0) {
					method5973(i, i_108_, 65536, (byte) 102);
					method5973(i - 1, i_108_, 4096, (byte) 120);
				}
				if (i_110_ == 1) {
					method5973(i, i_108_, 1024, (byte) 71);
					method5973(i, 1 + i_108_, 16384, (byte) 78);
				}
				if (2 == i_110_) {
					method5973(i, i_108_, 4096, (byte) 101);
					method5973(i + 1, i_108_, 65536, (byte) 117);
				}
				if (i_110_ == 3) {
					method5973(i, i_108_, 16384, (byte) 77);
					method5973(i, i_108_ - 1, 1024, (byte) 113);
				}
			}
			if (i_109_ == 1 || 3 == i_109_) {
				if (0 == i_110_) {
					method5973(i, i_108_, 512, (byte) 91);
					method5973(i - 1, i_108_ + 1, 8192, (byte) 110);
				}
				if (1 == i_110_) {
					method5973(i, i_108_, 2048, (byte) 124);
					method5973(i + 1, i_108_ + 1, 32768, (byte) 83);
				}
				if (2 == i_110_) {
					method5973(i, i_108_, 8192, (byte) 89);
					method5973(i + 1, i_108_ - 1, 512, (byte) 90);
				}
				if (i_110_ == 3) {
					method5973(i, i_108_, 32768, (byte) 70);
					method5973(i - 1, i_108_ - 1, 2048, (byte) 66);
				}
			}
			if (i_109_ == 2) {
				if (i_110_ == 0) {
					method5973(i, i_108_, 66560, (byte) 107);
					method5973(i - 1, i_108_, 4096, (byte) 85);
					method5973(i, 1 + i_108_, 16384, (byte) 100);
				}
				if (1 == i_110_) {
					method5973(i, i_108_, 5120, (byte) 67);
					method5973(i, i_108_ + 1, 16384, (byte) 99);
					method5973(1 + i, i_108_, 65536, (byte) 101);
				}
				if (2 == i_110_) {
					method5973(i, i_108_, 20480, (byte) 80);
					method5973(1 + i, i_108_, 65536, (byte) 67);
					method5973(i, i_108_ - 1, 1024, (byte) 121);
				}
				if (3 == i_110_) {
					method5973(i, i_108_, 81920, (byte) 90);
					method5973(i, i_108_ - 1, 1024, (byte) 69);
					method5973(i - 1, i_108_, 4096, (byte) 84);
				}
			}
		}
		if (bool_111_) {
			if (0 == i_109_) {
				if (i_110_ == 0) {
					method5973(i, i_108_, 536870912, (byte) 72);
					method5973(i - 1, i_108_, 33554432, (byte) 106);
				}
				if (i_110_ == 1) {
					method5973(i, i_108_, 8388608, (byte) 80);
					method5973(i, i_108_ + 1, 134217728, (byte) 101);
				}
				if (2 == i_110_) {
					method5973(i, i_108_, 33554432, (byte) 72);
					method5973(1 + i, i_108_, 536870912, (byte) 102);
				}
				if (i_110_ == 3) {
					method5973(i, i_108_, 134217728, (byte) 74);
					method5973(i, i_108_ - 1, 8388608, (byte) 89);
				}
			}
			if (i_109_ == 1 || 3 == i_109_) {
				if (i_110_ == 0) {
					method5973(i, i_108_, 4194304, (byte) 126);
					method5973(i - 1, 1 + i_108_, 67108864, (byte) 97);
				}
				if (i_110_ == 1) {
					method5973(i, i_108_, 16777216, (byte) 87);
					method5973(1 + i, i_108_ + 1, 268435456, (byte) 85);
				}
				if (i_110_ == 2) {
					method5973(i, i_108_, 67108864, (byte) 94);
					method5973(i + 1, i_108_ - 1, 4194304, (byte) 91);
				}
				if (i_110_ == 3) {
					method5973(i, i_108_, 268435456, (byte) 68);
					method5973(i - 1, i_108_ - 1, 16777216, (byte) 126);
				}
			}
			if (2 == i_109_) {
				if (0 == i_110_) {
					method5973(i, i_108_, 545259520, (byte) 91);
					method5973(i - 1, i_108_, 33554432, (byte) 82);
					method5973(i, i_108_ + 1, 134217728, (byte) 88);
				}
				if (i_110_ == 1) {
					method5973(i, i_108_, 41943040, (byte) 104);
					method5973(i, i_108_ + 1, 134217728, (byte) 90);
					method5973(1 + i, i_108_, 536870912, (byte) 120);
				}
				if (i_110_ == 2) {
					method5973(i, i_108_, 167772160, (byte) 123);
					method5973(i + 1, i_108_, 536870912, (byte) 101);
					method5973(i, i_108_ - 1, 8388608, (byte) 114);
				}
				if (i_110_ == 3) {
					method5973(i, i_108_, 671088640, (byte) 75);
					method5973(i, i_108_ - 1, 8388608, (byte) 115);
					method5973(i - 1, i_108_, 33554432, (byte) 90);
				}
			}
		}
	}

	Class336() {
		/* empty */
	}

	public void method5991(int i, int i_112_, byte i_113_) {
		i -= anInt3931 * -1969357273;
		i_112_ -= 1503444365 * anInt3964;
		anIntArrayArray3922[i][i_112_] &= ~0x40000;
	}

	public void method5992(int i, int i_114_, int i_115_, int i_116_, boolean bool, boolean bool_117_, byte i_118_) {
		i -= -1969357273 * anInt3931;
		i_114_ -= anInt3964 * 1503444365;
		if (i_115_ == 0) {
			if (i_116_ == 0) {
				method5973(i, i_114_, 128, (byte) 124);
				method5973(i - 1, i_114_, 8, (byte) 71);
			}
			if (i_116_ == 1) {
				method5973(i, i_114_, 2, (byte) 69);
				method5973(i, i_114_ + 1, 32, (byte) 69);
			}
			if (2 == i_116_) {
				method5973(i, i_114_, 8, (byte) 119);
				method5973(i + 1, i_114_, 128, (byte) 114);
			}
			if (3 == i_116_) {
				method5973(i, i_114_, 32, (byte) 113);
				method5973(i, i_114_ - 1, 2, (byte) 101);
			}
		}
		if (i_115_ == 1 || 3 == i_115_) {
			if (0 == i_116_) {
				method5973(i, i_114_, 1, (byte) 123);
				method5973(i - 1, 1 + i_114_, 16, (byte) 93);
			}
			if (1 == i_116_) {
				method5973(i, i_114_, 4, (byte) 122);
				method5973(i + 1, 1 + i_114_, 64, (byte) 68);
			}
			if (2 == i_116_) {
				method5973(i, i_114_, 16, (byte) 105);
				method5973(i + 1, i_114_ - 1, 1, (byte) 89);
			}
			if (i_116_ == 3) {
				method5973(i, i_114_, 64, (byte) 68);
				method5973(i - 1, i_114_ - 1, 4, (byte) 106);
			}
		}
		if (i_115_ == 2) {
			if (i_116_ == 0) {
				method5973(i, i_114_, 130, (byte) 112);
				method5973(i - 1, i_114_, 8, (byte) 74);
				method5973(i, 1 + i_114_, 32, (byte) 100);
			}
			if (1 == i_116_) {
				method5973(i, i_114_, 10, (byte) 122);
				method5973(i, i_114_ + 1, 32, (byte) 68);
				method5973(1 + i, i_114_, 128, (byte) 99);
			}
			if (2 == i_116_) {
				method5973(i, i_114_, 40, (byte) 73);
				method5973(i + 1, i_114_, 128, (byte) 102);
				method5973(i, i_114_ - 1, 2, (byte) 73);
			}
			if (3 == i_116_) {
				method5973(i, i_114_, 160, (byte) 114);
				method5973(i, i_114_ - 1, 2, (byte) 74);
				method5973(i - 1, i_114_, 8, (byte) 105);
			}
		}
		if (bool) {
			if (i_115_ == 0) {
				if (i_116_ == 0) {
					method5973(i, i_114_, 65536, (byte) 79);
					method5973(i - 1, i_114_, 4096, (byte) 124);
				}
				if (i_116_ == 1) {
					method5973(i, i_114_, 1024, (byte) 82);
					method5973(i, 1 + i_114_, 16384, (byte) 72);
				}
				if (2 == i_116_) {
					method5973(i, i_114_, 4096, (byte) 101);
					method5973(i + 1, i_114_, 65536, (byte) 119);
				}
				if (i_116_ == 3) {
					method5973(i, i_114_, 16384, (byte) 107);
					method5973(i, i_114_ - 1, 1024, (byte) 122);
				}
			}
			if (i_115_ == 1 || 3 == i_115_) {
				if (0 == i_116_) {
					method5973(i, i_114_, 512, (byte) 66);
					method5973(i - 1, i_114_ + 1, 8192, (byte) 126);
				}
				if (1 == i_116_) {
					method5973(i, i_114_, 2048, (byte) 127);
					method5973(i + 1, i_114_ + 1, 32768, (byte) 114);
				}
				if (2 == i_116_) {
					method5973(i, i_114_, 8192, (byte) 125);
					method5973(i + 1, i_114_ - 1, 512, (byte) 84);
				}
				if (i_116_ == 3) {
					method5973(i, i_114_, 32768, (byte) 116);
					method5973(i - 1, i_114_ - 1, 2048, (byte) 91);
				}
			}
			if (i_115_ == 2) {
				if (i_116_ == 0) {
					method5973(i, i_114_, 66560, (byte) 70);
					method5973(i - 1, i_114_, 4096, (byte) 88);
					method5973(i, 1 + i_114_, 16384, (byte) 121);
				}
				if (1 == i_116_) {
					method5973(i, i_114_, 5120, (byte) 66);
					method5973(i, i_114_ + 1, 16384, (byte) 101);
					method5973(1 + i, i_114_, 65536, (byte) 85);
				}
				if (2 == i_116_) {
					method5973(i, i_114_, 20480, (byte) 125);
					method5973(1 + i, i_114_, 65536, (byte) 107);
					method5973(i, i_114_ - 1, 1024, (byte) 118);
				}
				if (3 == i_116_) {
					method5973(i, i_114_, 81920, (byte) 91);
					method5973(i, i_114_ - 1, 1024, (byte) 69);
					method5973(i - 1, i_114_, 4096, (byte) 123);
				}
			}
		}
		if (bool_117_) {
			if (0 == i_115_) {
				if (i_116_ == 0) {
					method5973(i, i_114_, 536870912, (byte) 122);
					method5973(i - 1, i_114_, 33554432, (byte) 118);
				}
				if (i_116_ == 1) {
					method5973(i, i_114_, 8388608, (byte) 81);
					method5973(i, i_114_ + 1, 134217728, (byte) 90);
				}
				if (2 == i_116_) {
					method5973(i, i_114_, 33554432, (byte) 106);
					method5973(1 + i, i_114_, 536870912, (byte) 120);
				}
				if (i_116_ == 3) {
					method5973(i, i_114_, 134217728, (byte) 89);
					method5973(i, i_114_ - 1, 8388608, (byte) 68);
				}
			}
			if (i_115_ == 1 || 3 == i_115_) {
				if (i_116_ == 0) {
					method5973(i, i_114_, 4194304, (byte) 106);
					method5973(i - 1, 1 + i_114_, 67108864, (byte) 82);
				}
				if (i_116_ == 1) {
					method5973(i, i_114_, 16777216, (byte) 113);
					method5973(1 + i, i_114_ + 1, 268435456, (byte) 101);
				}
				if (i_116_ == 2) {
					method5973(i, i_114_, 67108864, (byte) 94);
					method5973(i + 1, i_114_ - 1, 4194304, (byte) 106);
				}
				if (i_116_ == 3) {
					method5973(i, i_114_, 268435456, (byte) 111);
					method5973(i - 1, i_114_ - 1, 16777216, (byte) 69);
				}
			}
			if (2 == i_115_) {
				if (0 == i_116_) {
					method5973(i, i_114_, 545259520, (byte) 87);
					method5973(i - 1, i_114_, 33554432, (byte) 118);
					method5973(i, i_114_ + 1, 134217728, (byte) 67);
				}
				if (i_116_ == 1) {
					method5973(i, i_114_, 41943040, (byte) 106);
					method5973(i, i_114_ + 1, 134217728, (byte) 91);
					method5973(1 + i, i_114_, 536870912, (byte) 123);
				}
				if (i_116_ == 2) {
					method5973(i, i_114_, 167772160, (byte) 107);
					method5973(i + 1, i_114_, 536870912, (byte) 90);
					method5973(i, i_114_ - 1, 8388608, (byte) 86);
				}
				if (i_116_ == 3) {
					method5973(i, i_114_, 671088640, (byte) 122);
					method5973(i, i_114_ - 1, 8388608, (byte) 88);
					method5973(i - 1, i_114_, 33554432, (byte) 102);
				}
			}
		}
	}

	void method5993(int i, int i_119_, int i_120_) {
		anIntArrayArray3922[i][i_119_] &= i_120_ ^ 0xffffffff;
	}

	public void method5994(int i, int i_121_) {
		i -= anInt3931 * -1969357273;
		i_121_ -= 1503444365 * anInt3964;
		anIntArrayArray3922[i][i_121_] &= ~0x40000;
	}

	public void method5995(int i, int i_122_) {
		i -= anInt3931 * -1969357273;
		i_122_ -= anInt3964 * 1503444365;
		anIntArrayArray3922[i][i_122_] &= ~0x200000;
	}

	public void method5996(int i, int i_123_, int i_124_, int i_125_, boolean bool, boolean bool_126_) {
		i -= anInt3931 * -1969357273;
		i_123_ -= 1503444365 * anInt3964;
		if (i_124_ == 0) {
			if (0 == i_125_) {
				method5977(i, i_123_, 128, (byte) -18);
				method5977(i - 1, i_123_, 8, (byte) -37);
			}
			if (1 == i_125_) {
				method5977(i, i_123_, 2, (byte) -110);
				method5977(i, i_123_ + 1, 32, (byte) -13);
			}
			if (i_125_ == 2) {
				method5977(i, i_123_, 8, (byte) -41);
				method5977(1 + i, i_123_, 128, (byte) -29);
			}
			if (3 == i_125_) {
				method5977(i, i_123_, 32, (byte) -9);
				method5977(i, i_123_ - 1, 2, (byte) -49);
			}
		}
		if (1 == i_124_ || 3 == i_124_) {
			if (0 == i_125_) {
				method5977(i, i_123_, 1, (byte) -118);
				method5977(i - 1, i_123_ + 1, 16, (byte) -4);
			}
			if (i_125_ == 1) {
				method5977(i, i_123_, 4, (byte) -89);
				method5977(i + 1, 1 + i_123_, 64, (byte) -62);
			}
			if (i_125_ == 2) {
				method5977(i, i_123_, 16, (byte) -85);
				method5977(i + 1, i_123_ - 1, 1, (byte) -127);
			}
			if (3 == i_125_) {
				method5977(i, i_123_, 64, (byte) -100);
				method5977(i - 1, i_123_ - 1, 4, (byte) -102);
			}
		}
		if (i_124_ == 2) {
			if (i_125_ == 0) {
				method5977(i, i_123_, 130, (byte) -41);
				method5977(i - 1, i_123_, 8, (byte) -9);
				method5977(i, 1 + i_123_, 32, (byte) -74);
			}
			if (1 == i_125_) {
				method5977(i, i_123_, 10, (byte) -102);
				method5977(i, 1 + i_123_, 32, (byte) -55);
				method5977(1 + i, i_123_, 128, (byte) -97);
			}
			if (i_125_ == 2) {
				method5977(i, i_123_, 40, (byte) -42);
				method5977(1 + i, i_123_, 128, (byte) -94);
				method5977(i, i_123_ - 1, 2, (byte) -57);
			}
			if (i_125_ == 3) {
				method5977(i, i_123_, 160, (byte) -64);
				method5977(i, i_123_ - 1, 2, (byte) -82);
				method5977(i - 1, i_123_, 8, (byte) -118);
			}
		}
		if (bool) {
			if (i_124_ == 0) {
				if (0 == i_125_) {
					method5977(i, i_123_, 65536, (byte) -82);
					method5977(i - 1, i_123_, 4096, (byte) -11);
				}
				if (i_125_ == 1) {
					method5977(i, i_123_, 1024, (byte) -79);
					method5977(i, 1 + i_123_, 16384, (byte) -128);
				}
				if (i_125_ == 2) {
					method5977(i, i_123_, 4096, (byte) -67);
					method5977(1 + i, i_123_, 65536, (byte) -109);
				}
				if (3 == i_125_) {
					method5977(i, i_123_, 16384, (byte) -2);
					method5977(i, i_123_ - 1, 1024, (byte) -9);
				}
			}
			if (1 == i_124_ || i_124_ == 3) {
				if (i_125_ == 0) {
					method5977(i, i_123_, 512, (byte) -73);
					method5977(i - 1, i_123_ + 1, 8192, (byte) -43);
				}
				if (1 == i_125_) {
					method5977(i, i_123_, 2048, (byte) -49);
					method5977(i + 1, 1 + i_123_, 32768, (byte) -42);
				}
				if (2 == i_125_) {
					method5977(i, i_123_, 8192, (byte) -54);
					method5977(i + 1, i_123_ - 1, 512, (byte) -113);
				}
				if (i_125_ == 3) {
					method5977(i, i_123_, 32768, (byte) -128);
					method5977(i - 1, i_123_ - 1, 2048, (byte) -87);
				}
			}
			if (i_124_ == 2) {
				if (0 == i_125_) {
					method5977(i, i_123_, 66560, (byte) -122);
					method5977(i - 1, i_123_, 4096, (byte) -116);
					method5977(i, i_123_ + 1, 16384, (byte) -52);
				}
				if (i_125_ == 1) {
					method5977(i, i_123_, 5120, (byte) -2);
					method5977(i, 1 + i_123_, 16384, (byte) -70);
					method5977(i + 1, i_123_, 65536, (byte) -109);
				}
				if (i_125_ == 2) {
					method5977(i, i_123_, 20480, (byte) -105);
					method5977(1 + i, i_123_, 65536, (byte) -29);
					method5977(i, i_123_ - 1, 1024, (byte) -48);
				}
				if (3 == i_125_) {
					method5977(i, i_123_, 81920, (byte) -75);
					method5977(i, i_123_ - 1, 1024, (byte) -86);
					method5977(i - 1, i_123_, 4096, (byte) -49);
				}
			}
		}
		if (bool_126_) {
			if (i_124_ == 0) {
				if (i_125_ == 0) {
					method5977(i, i_123_, 536870912, (byte) -31);
					method5977(i - 1, i_123_, 33554432, (byte) -67);
				}
				if (i_125_ == 1) {
					method5977(i, i_123_, 8388608, (byte) -22);
					method5977(i, i_123_ + 1, 134217728, (byte) -90);
				}
				if (2 == i_125_) {
					method5977(i, i_123_, 33554432, (byte) -120);
					method5977(i + 1, i_123_, 536870912, (byte) -26);
				}
				if (i_125_ == 3) {
					method5977(i, i_123_, 134217728, (byte) -56);
					method5977(i, i_123_ - 1, 8388608, (byte) -69);
				}
			}
			if (i_124_ == 1 || 3 == i_124_) {
				if (i_125_ == 0) {
					method5977(i, i_123_, 4194304, (byte) -92);
					method5977(i - 1, i_123_ + 1, 67108864, (byte) -113);
				}
				if (i_125_ == 1) {
					method5977(i, i_123_, 16777216, (byte) -43);
					method5977(i + 1, 1 + i_123_, 268435456, (byte) -15);
				}
				if (2 == i_125_) {
					method5977(i, i_123_, 67108864, (byte) -5);
					method5977(1 + i, i_123_ - 1, 4194304, (byte) -55);
				}
				if (i_125_ == 3) {
					method5977(i, i_123_, 268435456, (byte) -6);
					method5977(i - 1, i_123_ - 1, 16777216, (byte) -3);
				}
			}
			if (2 == i_124_) {
				if (i_125_ == 0) {
					method5977(i, i_123_, 545259520, (byte) -5);
					method5977(i - 1, i_123_, 33554432, (byte) -59);
					method5977(i, i_123_ + 1, 134217728, (byte) -64);
				}
				if (1 == i_125_) {
					method5977(i, i_123_, 41943040, (byte) -48);
					method5977(i, i_123_ + 1, 134217728, (byte) -103);
					method5977(i + 1, i_123_, 536870912, (byte) -53);
				}
				if (2 == i_125_) {
					method5977(i, i_123_, 167772160, (byte) -116);
					method5977(1 + i, i_123_, 536870912, (byte) -16);
					method5977(i, i_123_ - 1, 8388608, (byte) -105);
				}
				if (3 == i_125_) {
					method5977(i, i_123_, 671088640, (byte) -82);
					method5977(i, i_123_ - 1, 8388608, (byte) -88);
					method5977(i - 1, i_123_, 33554432, (byte) -53);
				}
			}
		}
	}

	public void method5997(int i, int i_127_) {
		i -= anInt3931 * -1969357273;
		i_127_ -= 1503444365 * anInt3964;
		anIntArrayArray3922[i][i_127_] &= ~0x40000;
	}

	public boolean method5998(int i, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_) {
		if (i_129_ == 1) {
			if (i_130_ == i && i_128_ == i_131_)
				return true;
		} else if (i_130_ >= i && i_130_ <= i + i_129_ - 1 && i_131_ >= i_131_ && i_131_ <= i_129_ + i_131_ - 1)
			return true;
		i -= anInt3931 * -1969357273;
		i_128_ -= anInt3964 * 1503444365;
		i_130_ -= anInt3931 * -1969357273;
		i_131_ -= anInt3964 * 1503444365;
		if (1 == i_129_) {
			if (i_132_ == 0) {
				if (0 == i_133_) {
					if (i == i_130_ - 1 && i_131_ == i_128_)
						return true;
					if (i_130_ == i && 1 + i_131_ == i_128_ && (anIntArrayArray3922[i][i_128_] & 0x2c0120) == 0)
						return true;
					if (i == i_130_ && i_131_ - 1 == i_128_ && (anIntArrayArray3922[i][i_128_] & 0x2c0102) == 0)
						return true;
				} else if (i_133_ == 1) {
					if (i == i_130_ && 1 + i_131_ == i_128_)
						return true;
					if (i == i_130_ - 1 && i_128_ == i_131_ && (anIntArrayArray3922[i][i_128_] & 0x2c0108) == 0)
						return true;
					if (i == i_130_ + 1 && i_128_ == i_131_ && 0 == (anIntArrayArray3922[i][i_128_] & 0x2c0180))
						return true;
				} else if (2 == i_133_) {
					if (i == 1 + i_130_ && i_131_ == i_128_)
						return true;
					if (i == i_130_ && i_128_ == i_131_ + 1 && 0 == (anIntArrayArray3922[i][i_128_] & 0x2c0120))
						return true;
					if (i_130_ == i && i_128_ == i_131_ - 1 && 0 == (anIntArrayArray3922[i][i_128_] & 0x2c0102))
						return true;
				} else if (3 == i_133_) {
					if (i == i_130_ && i_128_ == i_131_ - 1)
						return true;
					if (i == i_130_ - 1 && i_128_ == i_131_ && (anIntArrayArray3922[i][i_128_] & 0x2c0108) == 0)
						return true;
					if (i == 1 + i_130_ && i_131_ == i_128_ && 0 == (anIntArrayArray3922[i][i_128_] & 0x2c0180))
						return true;
				}
			}
			if (i_132_ == 2) {
				if (0 == i_133_) {
					if (i == i_130_ - 1 && i_128_ == i_131_)
						return true;
					if (i == i_130_ && i_128_ == 1 + i_131_)
						return true;
					if (1 + i_130_ == i && i_128_ == i_131_ && 0 == (anIntArrayArray3922[i][i_128_] & 0x2c0180))
						return true;
					if (i == i_130_ && i_131_ - 1 == i_128_ && 0 == (anIntArrayArray3922[i][i_128_] & 0x2c0102))
						return true;
				} else if (1 == i_133_) {
					if (i == i_130_ - 1 && i_128_ == i_131_ && 0 == (anIntArrayArray3922[i][i_128_] & 0x2c0108))
						return true;
					if (i == i_130_ && 1 + i_131_ == i_128_)
						return true;
					if (i == i_130_ + 1 && i_128_ == i_131_)
						return true;
					if (i_130_ == i && i_128_ == i_131_ - 1 && 0 == (anIntArrayArray3922[i][i_128_] & 0x2c0102))
						return true;
				} else if (2 == i_133_) {
					if (i_130_ - 1 == i && i_131_ == i_128_ && (anIntArrayArray3922[i][i_128_] & 0x2c0108) == 0)
						return true;
					if (i == i_130_ && i_131_ + 1 == i_128_ && (anIntArrayArray3922[i][i_128_] & 0x2c0120) == 0)
						return true;
					if (i_130_ + 1 == i && i_131_ == i_128_)
						return true;
					if (i == i_130_ && i_131_ - 1 == i_128_)
						return true;
				} else if (3 == i_133_) {
					if (i_130_ - 1 == i && i_131_ == i_128_)
						return true;
					if (i == i_130_ && i_128_ == i_131_ + 1 && (anIntArrayArray3922[i][i_128_] & 0x2c0120) == 0)
						return true;
					if (1 + i_130_ == i && i_128_ == i_131_ && 0 == (anIntArrayArray3922[i][i_128_] & 0x2c0180))
						return true;
					if (i == i_130_ && i_131_ - 1 == i_128_)
						return true;
				}
			}
			if (9 == i_132_) {
				if (i == i_130_ && i_128_ == i_131_ + 1 && (anIntArrayArray3922[i][i_128_] & 0x20) == 0)
					return true;
				if (i == i_130_ && i_131_ - 1 == i_128_ && 0 == (anIntArrayArray3922[i][i_128_] & 0x2))
					return true;
				if (i_130_ - 1 == i && i_131_ == i_128_ && 0 == (anIntArrayArray3922[i][i_128_] & 0x8))
					return true;
				if (1 + i_130_ == i && i_131_ == i_128_ && 0 == (anIntArrayArray3922[i][i_128_] & 0x80))
					return true;
			}
		} else {
			int i_134_ = i + i_129_ - 1;
			int i_135_ = i_129_ + i_128_ - 1;
			if (i_132_ == 0) {
				if (i_133_ == 0) {
					if (i == i_130_ - i_129_ && i_131_ >= i_128_ && i_131_ <= i_135_)
						return true;
					if (i_130_ >= i && i_130_ <= i_134_ && i_131_ + 1 == i_128_ && ((anIntArrayArray3922[i_130_][i_128_] & 0x2c0120) == 0))
						return true;
					if (i_130_ >= i && i_130_ <= i_134_ && i_128_ == i_131_ - i_129_ && ((anIntArrayArray3922[i_130_][i_135_] & 0x2c0102) == 0))
						return true;
				} else if (i_133_ == 1) {
					if (i_130_ >= i && i_130_ <= i_134_ && i_128_ == 1 + i_131_)
						return true;
					if (i_130_ - i_129_ == i && i_131_ >= i_128_ && i_131_ <= i_135_ && 0 == (anIntArrayArray3922[i_134_][i_131_] & 0x2c0108))
						return true;
					if (1 + i_130_ == i && i_131_ >= i_128_ && i_131_ <= i_135_ && (anIntArrayArray3922[i][i_131_] & 0x2c0180) == 0)
						return true;
				} else if (i_133_ == 2) {
					if (i == 1 + i_130_ && i_131_ >= i_128_ && i_131_ <= i_135_)
						return true;
					if (i_130_ >= i && i_130_ <= i_134_ && 1 + i_131_ == i_128_ && 0 == (anIntArrayArray3922[i_130_][i_128_] & 0x2c0120))
						return true;
					if (i_130_ >= i && i_130_ <= i_134_ && i_128_ == i_131_ - i_129_ && ((anIntArrayArray3922[i_130_][i_135_] & 0x2c0102) == 0))
						return true;
				} else if (i_133_ == 3) {
					if (i_130_ >= i && i_130_ <= i_134_ && i_128_ == i_131_ - i_129_)
						return true;
					if (i_130_ - i_129_ == i && i_131_ >= i_128_ && i_131_ <= i_135_ && 0 == (anIntArrayArray3922[i_134_][i_131_] & 0x2c0108))
						return true;
					if (1 + i_130_ == i && i_131_ >= i_128_ && i_131_ <= i_135_ && (anIntArrayArray3922[i][i_131_] & 0x2c0180) == 0)
						return true;
				}
			}
			if (i_132_ == 2) {
				if (0 == i_133_) {
					if (i == i_130_ - i_129_ && i_131_ >= i_128_ && i_131_ <= i_135_)
						return true;
					if (i_130_ >= i && i_130_ <= i_134_ && i_128_ == 1 + i_131_)
						return true;
					if (i == i_130_ + 1 && i_131_ >= i_128_ && i_131_ <= i_135_ && 0 == (anIntArrayArray3922[i][i_131_] & 0x2c0180))
						return true;
					if (i_130_ >= i && i_130_ <= i_134_ && i_128_ == i_131_ - i_129_ && 0 == (anIntArrayArray3922[i_130_][i_135_] & 0x2c0102))
						return true;
				} else if (1 == i_133_) {
					if (i_130_ - i_129_ == i && i_131_ >= i_128_ && i_131_ <= i_135_ && 0 == (anIntArrayArray3922[i_134_][i_131_] & 0x2c0108))
						return true;
					if (i_130_ >= i && i_130_ <= i_134_ && i_128_ == 1 + i_131_)
						return true;
					if (i == i_130_ + 1 && i_131_ >= i_128_ && i_131_ <= i_135_)
						return true;
					if (i_130_ >= i && i_130_ <= i_134_ && i_128_ == i_131_ - i_129_ && 0 == (anIntArrayArray3922[i_130_][i_135_] & 0x2c0102))
						return true;
				} else if (2 == i_133_) {
					if (i_130_ - i_129_ == i && i_131_ >= i_128_ && i_131_ <= i_135_ && ((anIntArrayArray3922[i_134_][i_131_] & 0x2c0108) == 0))
						return true;
					if (i_130_ >= i && i_130_ <= i_134_ && 1 + i_131_ == i_128_ && ((anIntArrayArray3922[i_130_][i_128_] & 0x2c0120) == 0))
						return true;
					if (1 + i_130_ == i && i_131_ >= i_128_ && i_131_ <= i_135_)
						return true;
					if (i_130_ >= i && i_130_ <= i_134_ && i_131_ - i_129_ == i_128_)
						return true;
				} else if (i_133_ == 3) {
					if (i_130_ - i_129_ == i && i_131_ >= i_128_ && i_131_ <= i_135_)
						return true;
					if (i_130_ >= i && i_130_ <= i_134_ && i_131_ + 1 == i_128_ && 0 == (anIntArrayArray3922[i_130_][i_128_] & 0x2c0120))
						return true;
					if (i_130_ + 1 == i && i_131_ >= i_128_ && i_131_ <= i_135_ && 0 == (anIntArrayArray3922[i][i_131_] & 0x2c0180))
						return true;
					if (i_130_ >= i && i_130_ <= i_134_ && i_128_ == i_131_ - i_129_)
						return true;
				}
			}
			if (9 == i_132_) {
				if (i_130_ >= i && i_130_ <= i_134_ && i_128_ == 1 + i_131_ && 0 == (anIntArrayArray3922[i_130_][i_128_] & 0x2c0120))
					return true;
				if (i_130_ >= i && i_130_ <= i_134_ && i_128_ == i_131_ - i_129_ && 0 == (anIntArrayArray3922[i_130_][i_135_] & 0x2c0102))
					return true;
				if (i_130_ - i_129_ == i && i_131_ >= i_128_ && i_131_ <= i_135_ && (anIntArrayArray3922[i_134_][i_131_] & 0x2c0108) == 0)
					return true;
				if (i == i_130_ + 1 && i_131_ >= i_128_ && i_131_ <= i_135_ && 0 == (anIntArrayArray3922[i][i_131_] & 0x2c0180))
					return true;
			}
		}
		return false;
	}

	public boolean method5999(int i, int i_136_, int i_137_, int i_138_, int i_139_, int i_140_, int i_141_) {
		if (i_137_ == 1) {
			if (i_138_ == i && i_136_ == i_139_)
				return true;
		} else if (i_138_ >= i && i_138_ <= i + i_137_ - 1 && i_139_ >= i_139_ && i_139_ <= i_137_ + i_139_ - 1)
			return true;
		i -= anInt3931 * -1969357273;
		i_136_ -= anInt3964 * 1503444365;
		i_138_ -= anInt3931 * -1969357273;
		i_139_ -= anInt3964 * 1503444365;
		if (1 == i_137_) {
			if (i_140_ == 0) {
				if (0 == i_141_) {
					if (i == i_138_ - 1 && i_139_ == i_136_)
						return true;
					if (i_138_ == i && 1 + i_139_ == i_136_ && (anIntArrayArray3922[i][i_136_] & 0x2c0120) == 0)
						return true;
					if (i == i_138_ && i_139_ - 1 == i_136_ && (anIntArrayArray3922[i][i_136_] & 0x2c0102) == 0)
						return true;
				} else if (i_141_ == 1) {
					if (i == i_138_ && 1 + i_139_ == i_136_)
						return true;
					if (i == i_138_ - 1 && i_136_ == i_139_ && (anIntArrayArray3922[i][i_136_] & 0x2c0108) == 0)
						return true;
					if (i == i_138_ + 1 && i_136_ == i_139_ && 0 == (anIntArrayArray3922[i][i_136_] & 0x2c0180))
						return true;
				} else if (2 == i_141_) {
					if (i == 1 + i_138_ && i_139_ == i_136_)
						return true;
					if (i == i_138_ && i_136_ == i_139_ + 1 && 0 == (anIntArrayArray3922[i][i_136_] & 0x2c0120))
						return true;
					if (i_138_ == i && i_136_ == i_139_ - 1 && 0 == (anIntArrayArray3922[i][i_136_] & 0x2c0102))
						return true;
				} else if (3 == i_141_) {
					if (i == i_138_ && i_136_ == i_139_ - 1)
						return true;
					if (i == i_138_ - 1 && i_136_ == i_139_ && (anIntArrayArray3922[i][i_136_] & 0x2c0108) == 0)
						return true;
					if (i == 1 + i_138_ && i_139_ == i_136_ && 0 == (anIntArrayArray3922[i][i_136_] & 0x2c0180))
						return true;
				}
			}
			if (i_140_ == 2) {
				if (0 == i_141_) {
					if (i == i_138_ - 1 && i_136_ == i_139_)
						return true;
					if (i == i_138_ && i_136_ == 1 + i_139_)
						return true;
					if (1 + i_138_ == i && i_136_ == i_139_ && 0 == (anIntArrayArray3922[i][i_136_] & 0x2c0180))
						return true;
					if (i == i_138_ && i_139_ - 1 == i_136_ && 0 == (anIntArrayArray3922[i][i_136_] & 0x2c0102))
						return true;
				} else if (1 == i_141_) {
					if (i == i_138_ - 1 && i_136_ == i_139_ && 0 == (anIntArrayArray3922[i][i_136_] & 0x2c0108))
						return true;
					if (i == i_138_ && 1 + i_139_ == i_136_)
						return true;
					if (i == i_138_ + 1 && i_136_ == i_139_)
						return true;
					if (i_138_ == i && i_136_ == i_139_ - 1 && 0 == (anIntArrayArray3922[i][i_136_] & 0x2c0102))
						return true;
				} else if (2 == i_141_) {
					if (i_138_ - 1 == i && i_139_ == i_136_ && (anIntArrayArray3922[i][i_136_] & 0x2c0108) == 0)
						return true;
					if (i == i_138_ && i_139_ + 1 == i_136_ && (anIntArrayArray3922[i][i_136_] & 0x2c0120) == 0)
						return true;
					if (i_138_ + 1 == i && i_139_ == i_136_)
						return true;
					if (i == i_138_ && i_139_ - 1 == i_136_)
						return true;
				} else if (3 == i_141_) {
					if (i_138_ - 1 == i && i_139_ == i_136_)
						return true;
					if (i == i_138_ && i_136_ == i_139_ + 1 && (anIntArrayArray3922[i][i_136_] & 0x2c0120) == 0)
						return true;
					if (1 + i_138_ == i && i_136_ == i_139_ && 0 == (anIntArrayArray3922[i][i_136_] & 0x2c0180))
						return true;
					if (i == i_138_ && i_139_ - 1 == i_136_)
						return true;
				}
			}
			if (9 == i_140_) {
				if (i == i_138_ && i_136_ == i_139_ + 1 && (anIntArrayArray3922[i][i_136_] & 0x20) == 0)
					return true;
				if (i == i_138_ && i_139_ - 1 == i_136_ && 0 == (anIntArrayArray3922[i][i_136_] & 0x2))
					return true;
				if (i_138_ - 1 == i && i_139_ == i_136_ && 0 == (anIntArrayArray3922[i][i_136_] & 0x8))
					return true;
				if (1 + i_138_ == i && i_139_ == i_136_ && 0 == (anIntArrayArray3922[i][i_136_] & 0x80))
					return true;
			}
		} else {
			int i_142_ = i + i_137_ - 1;
			int i_143_ = i_137_ + i_136_ - 1;
			if (i_140_ == 0) {
				if (i_141_ == 0) {
					if (i == i_138_ - i_137_ && i_139_ >= i_136_ && i_139_ <= i_143_)
						return true;
					if (i_138_ >= i && i_138_ <= i_142_ && i_139_ + 1 == i_136_ && ((anIntArrayArray3922[i_138_][i_136_] & 0x2c0120) == 0))
						return true;
					if (i_138_ >= i && i_138_ <= i_142_ && i_136_ == i_139_ - i_137_ && ((anIntArrayArray3922[i_138_][i_143_] & 0x2c0102) == 0))
						return true;
				} else if (i_141_ == 1) {
					if (i_138_ >= i && i_138_ <= i_142_ && i_136_ == 1 + i_139_)
						return true;
					if (i_138_ - i_137_ == i && i_139_ >= i_136_ && i_139_ <= i_143_ && 0 == (anIntArrayArray3922[i_142_][i_139_] & 0x2c0108))
						return true;
					if (1 + i_138_ == i && i_139_ >= i_136_ && i_139_ <= i_143_ && (anIntArrayArray3922[i][i_139_] & 0x2c0180) == 0)
						return true;
				} else if (i_141_ == 2) {
					if (i == 1 + i_138_ && i_139_ >= i_136_ && i_139_ <= i_143_)
						return true;
					if (i_138_ >= i && i_138_ <= i_142_ && 1 + i_139_ == i_136_ && 0 == (anIntArrayArray3922[i_138_][i_136_] & 0x2c0120))
						return true;
					if (i_138_ >= i && i_138_ <= i_142_ && i_136_ == i_139_ - i_137_ && ((anIntArrayArray3922[i_138_][i_143_] & 0x2c0102) == 0))
						return true;
				} else if (i_141_ == 3) {
					if (i_138_ >= i && i_138_ <= i_142_ && i_136_ == i_139_ - i_137_)
						return true;
					if (i_138_ - i_137_ == i && i_139_ >= i_136_ && i_139_ <= i_143_ && 0 == (anIntArrayArray3922[i_142_][i_139_] & 0x2c0108))
						return true;
					if (1 + i_138_ == i && i_139_ >= i_136_ && i_139_ <= i_143_ && (anIntArrayArray3922[i][i_139_] & 0x2c0180) == 0)
						return true;
				}
			}
			if (i_140_ == 2) {
				if (0 == i_141_) {
					if (i == i_138_ - i_137_ && i_139_ >= i_136_ && i_139_ <= i_143_)
						return true;
					if (i_138_ >= i && i_138_ <= i_142_ && i_136_ == 1 + i_139_)
						return true;
					if (i == i_138_ + 1 && i_139_ >= i_136_ && i_139_ <= i_143_ && 0 == (anIntArrayArray3922[i][i_139_] & 0x2c0180))
						return true;
					if (i_138_ >= i && i_138_ <= i_142_ && i_136_ == i_139_ - i_137_ && 0 == (anIntArrayArray3922[i_138_][i_143_] & 0x2c0102))
						return true;
				} else if (1 == i_141_) {
					if (i_138_ - i_137_ == i && i_139_ >= i_136_ && i_139_ <= i_143_ && 0 == (anIntArrayArray3922[i_142_][i_139_] & 0x2c0108))
						return true;
					if (i_138_ >= i && i_138_ <= i_142_ && i_136_ == 1 + i_139_)
						return true;
					if (i == i_138_ + 1 && i_139_ >= i_136_ && i_139_ <= i_143_)
						return true;
					if (i_138_ >= i && i_138_ <= i_142_ && i_136_ == i_139_ - i_137_ && 0 == (anIntArrayArray3922[i_138_][i_143_] & 0x2c0102))
						return true;
				} else if (2 == i_141_) {
					if (i_138_ - i_137_ == i && i_139_ >= i_136_ && i_139_ <= i_143_ && ((anIntArrayArray3922[i_142_][i_139_] & 0x2c0108) == 0))
						return true;
					if (i_138_ >= i && i_138_ <= i_142_ && 1 + i_139_ == i_136_ && ((anIntArrayArray3922[i_138_][i_136_] & 0x2c0120) == 0))
						return true;
					if (1 + i_138_ == i && i_139_ >= i_136_ && i_139_ <= i_143_)
						return true;
					if (i_138_ >= i && i_138_ <= i_142_ && i_139_ - i_137_ == i_136_)
						return true;
				} else if (i_141_ == 3) {
					if (i_138_ - i_137_ == i && i_139_ >= i_136_ && i_139_ <= i_143_)
						return true;
					if (i_138_ >= i && i_138_ <= i_142_ && i_139_ + 1 == i_136_ && 0 == (anIntArrayArray3922[i_138_][i_136_] & 0x2c0120))
						return true;
					if (i_138_ + 1 == i && i_139_ >= i_136_ && i_139_ <= i_143_ && 0 == (anIntArrayArray3922[i][i_139_] & 0x2c0180))
						return true;
					if (i_138_ >= i && i_138_ <= i_142_ && i_136_ == i_139_ - i_137_)
						return true;
				}
			}
			if (9 == i_140_) {
				if (i_138_ >= i && i_138_ <= i_142_ && i_136_ == 1 + i_139_ && 0 == (anIntArrayArray3922[i_138_][i_136_] & 0x2c0120))
					return true;
				if (i_138_ >= i && i_138_ <= i_142_ && i_136_ == i_139_ - i_137_ && 0 == (anIntArrayArray3922[i_138_][i_143_] & 0x2c0102))
					return true;
				if (i_138_ - i_137_ == i && i_139_ >= i_136_ && i_139_ <= i_143_ && (anIntArrayArray3922[i_142_][i_139_] & 0x2c0108) == 0)
					return true;
				if (i == i_138_ + 1 && i_139_ >= i_136_ && i_139_ <= i_143_ && 0 == (anIntArrayArray3922[i][i_139_] & 0x2c0180))
					return true;
			}
		}
		return false;
	}

	public boolean method6000(int i, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_) {
		if (i_145_ > 1) {
			if (Class325.method5790(i, i_144_, i_145_, i_145_, i_146_, i_147_, i_148_, i_149_, -748214549))
				return true;
			return method5978(i, i_144_, i_145_, i_145_, i_146_, i_147_, i_148_, i_149_, i_150_, -1927298508);
		}
		int i_151_ = i_148_ + i_146_ - 1;
		int i_152_ = i_149_ + i_147_ - 1;
		if (i >= i_146_ && i <= i_151_ && i_144_ >= i_147_ && i_144_ <= i_152_)
			return true;
		if (i_146_ - 1 == i && i_144_ >= i_147_ && i_144_ <= i_152_ && 0 == ((anIntArrayArray3922[i - anInt3931 * -1969357273][i_144_ - anInt3964 * 1503444365]) & 0x8) && (i_150_ & 0x8) == 0)
			return true;
		if (i_151_ + 1 == i && i_144_ >= i_147_ && i_144_ <= i_152_ && 0 == ((anIntArrayArray3922[i - -1969357273 * anInt3931][i_144_ - 1503444365 * anInt3964]) & 0x80) && 0 == (i_150_ & 0x2))
			return true;
		if (i_144_ == i_147_ - 1 && i >= i_146_ && i <= i_151_ && 0 == ((anIntArrayArray3922[i - -1969357273 * anInt3931][i_144_ - 1503444365 * anInt3964]) & 0x2) && (i_150_ & 0x4) == 0)
			return true;
		if (i_144_ == i_152_ + 1 && i >= i_146_ && i <= i_151_ && 0 == ((anIntArrayArray3922[i - anInt3931 * -1969357273][i_144_ - anInt3964 * 1503444365]) & 0x20) && 0 == (i_150_ & 0x1))
			return true;
		return false;
	}

	public boolean method6001(int i, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_) {
		if (i_154_ > 1) {
			if (Class325.method5790(i, i_153_, i_154_, i_154_, i_155_, i_156_, i_157_, i_158_, -133079581))
				return true;
			return method5978(i, i_153_, i_154_, i_154_, i_155_, i_156_, i_157_, i_158_, i_159_, -1339607048);
		}
		int i_160_ = i_157_ + i_155_ - 1;
		int i_161_ = i_158_ + i_156_ - 1;
		if (i >= i_155_ && i <= i_160_ && i_153_ >= i_156_ && i_153_ <= i_161_)
			return true;
		if (i_155_ - 1 == i && i_153_ >= i_156_ && i_153_ <= i_161_ && 0 == ((anIntArrayArray3922[i - anInt3931 * -1969357273][i_153_ - anInt3964 * 1503444365]) & 0x8) && (i_159_ & 0x8) == 0)
			return true;
		if (i_160_ + 1 == i && i_153_ >= i_156_ && i_153_ <= i_161_ && 0 == ((anIntArrayArray3922[i - -1969357273 * anInt3931][i_153_ - 1503444365 * anInt3964]) & 0x80) && 0 == (i_159_ & 0x2))
			return true;
		if (i_153_ == i_156_ - 1 && i >= i_155_ && i <= i_160_ && 0 == ((anIntArrayArray3922[i - -1969357273 * anInt3931][i_153_ - 1503444365 * anInt3964]) & 0x2) && (i_159_ & 0x4) == 0)
			return true;
		if (i_153_ == i_161_ + 1 && i >= i_155_ && i <= i_160_ && 0 == ((anIntArrayArray3922[i - anInt3931 * -1969357273][i_153_ - anInt3964 * 1503444365]) & 0x20) && 0 == (i_159_ & 0x1))
			return true;
		return false;
	}

	public boolean method6002(int i, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_) {
		int i_170_ = i + i_163_;
		int i_171_ = i_164_ + i_162_;
		int i_172_ = i_167_ + i_165_;
		int i_173_ = i_166_ + i_168_;
		if (i == i_172_ && 0 == (i_169_ & 0x2)) {
			int i_174_ = i_162_ > i_166_ ? i_162_ : i_166_;
			for (int i_175_ = i_171_ < i_173_ ? i_171_ : i_173_; i_174_ < i_175_; i_174_++) {
				if (((anIntArrayArray3922[i_172_ - 1 - -1969357273 * anInt3931][i_174_ - 1503444365 * anInt3964]) & 0x8) == 0)
					return true;
			}
		} else if (i_170_ == i_165_ && 0 == (i_169_ & 0x8)) {
			int i_176_ = i_162_ > i_166_ ? i_162_ : i_166_;
			for (int i_177_ = i_171_ < i_173_ ? i_171_ : i_173_; i_176_ < i_177_; i_176_++) {
				if (0 == ((anIntArrayArray3922[i_165_ - anInt3931 * -1969357273][i_176_ - 1503444365 * anInt3964]) & 0x80))
					return true;
			}
		} else if (i_162_ == i_173_ && 0 == (i_169_ & 0x1)) {
			int i_178_ = i > i_165_ ? i : i_165_;
			for (int i_179_ = i_170_ < i_172_ ? i_170_ : i_172_; i_178_ < i_179_; i_178_++) {
				if (0 == ((anIntArrayArray3922[i_178_ - anInt3931 * -1969357273][i_173_ - 1 - anInt3964 * 1503444365]) & 0x2))
					return true;
			}
		} else if (i_171_ == i_166_ && 0 == (i_169_ & 0x4)) {
			int i_180_ = i > i_165_ ? i : i_165_;
			for (int i_181_ = i_170_ < i_172_ ? i_170_ : i_172_; i_180_ < i_181_; i_180_++) {
				if (0 == ((anIntArrayArray3922[i_180_ - -1969357273 * anInt3931][i_166_ - 1503444365 * anInt3964]) & 0x20))
					return true;
			}
		}
		return false;
	}

	public static boolean method6003(int i, int i_182_, int i_183_, int i_184_, int i_185_, int i_186_, int i_187_, int i_188_) {
		if (i >= i_187_ + i_185_ || i_185_ >= i + i_183_)
			return false;
		if (i_182_ >= i_186_ + i_188_ || i_186_ >= i_182_ + i_184_)
			return false;
		return true;
	}

	public static boolean method6004(int i, int i_189_, int i_190_, int i_191_, int i_192_, int i_193_, int i_194_, int i_195_) {
		if (i >= i_194_ + i_192_ || i_192_ >= i + i_190_)
			return false;
		if (i_189_ >= i_193_ + i_195_ || i_193_ >= i_189_ + i_191_)
			return false;
		return true;
	}

	static final void method6005(CS2Executor class527, byte i) {
		int i_196_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class184 class184 = Class468_Sub20.method12807(-1949417532);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4557, class184.aClass432_2283, 502225021);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_196_);
		class184.method3049(class282_sub23, -616684350);
	}

	static final void method6006(CS2Executor class527, int i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		Class493.method8273(string, (byte) -74);
	}

	static final void method6007(int i, int[] is, int i_197_) {
		if (Class456_Sub3.method12682(i, is, 214426228)) {
			Class118[] class118s = Class468_Sub8.aClass98Array7889[i].aClass118Array998;
			for (int i_198_ = 0; i_198_ < class118s.length; i_198_++) {
				Class118 class118 = class118s[i_198_];
				if (null != class118 && null != class118.aClass456_1437)
					class118.aClass456_1437.method7582((byte) -62);
			}
		}
	}

	public static void method6008(boolean bool, byte i) {
		for (Class282_Sub48 class282_sub48 = ((Class282_Sub48) Class282_Sub48.aClass482_8073.head((byte) 38)); class282_sub48 != null; class282_sub48 = (Class282_Sub48) Class282_Sub48.aClass482_8073.next(-128319020)) {
			if (((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 != null) {
				Class79.aClass282_Sub15_Sub4_783.method15276(((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099);
				((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 = null;
			}
			if (((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096 != null) {
				Class79.aClass282_Sub15_Sub4_783.method15276(((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096);
				((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096 = null;
			}
			class282_sub48.unlink(-371378792);
		}
		if (bool) {
			for (Class282_Sub48 class282_sub48 = ((Class282_Sub48) Class282_Sub48.aClass482_8074.head((byte) 121)); null != class282_sub48; class282_sub48 = (Class282_Sub48) Class282_Sub48.aClass482_8074.next(-938773769)) {
				if (null != (((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099)) {
					Class79.aClass282_Sub15_Sub4_783.method15276(((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099);
					((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 = null;
				}
				class282_sub48.unlink(-371378792);
			}
			for (Class282_Sub48 class282_sub48 = ((Class282_Sub48) Class282_Sub48.aClass465_8075.method7750(856415350)); class282_sub48 != null; class282_sub48 = ((Class282_Sub48) Class282_Sub48.aClass465_8075.method7751((byte) 62))) {
				if (((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 != null) {
					Class79.aClass282_Sub15_Sub4_783.method15276(((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099);
					((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 = null;
				}
				class282_sub48.unlink(-371378792);
			}
		}
	}

	public static Class232 method6009(RsByteBuffer class282_sub35, int i) {
		int i_199_ = class282_sub35.readUnsignedByte();
		int[] is = new int[i_199_];
		for (int i_200_ = 0; i_200_ < i_199_; i_200_++)
			is[i_200_] = class282_sub35.readUnsignedByte();
		return new Class232(is);
	}

	static final void method6010(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 425673003;
		int i_201_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]);
		short i_202_ = (short) (((CS2Executor) class527).intStack[1 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		short i_203_ = (short) (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 + 2]);
		if (i_201_ >= 0 && i_201_ < 5) {
			class118.method2013(i_201_, i_202_, i_203_, (byte) 11);
			Class109.method1858(class118, (byte) -78);
			if (class118.anInt1288 * 1924549737 == -1 && !class98.aBool999)
				Class276.method4903(-1952846363 * class118.anInt1287, i_201_, -1379026024);
		}
	}
}
