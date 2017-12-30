/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class46 implements Interface2 {
	Class366 aClass366_436;
	public static Object[] anObjectArray437;
	static Class282_Sub50_Sub7 aClass282_Sub50_Sub7_438;

	public boolean method21() {
		return true;
	}

	public void method20(boolean bool, int i) {
		if (bool)
			Class316.aClass505_3680.B(0, 0, Class349.anInt4083 * -418109423, -969250379 * Class263.anInt3243, (((Class46) this).aClass366_436.anInt4231 * -2044941049), 0);
	}

	public void method11(boolean bool) {
		if (bool)
			Class316.aClass505_3680.B(0, 0, Class349.anInt4083 * -418109423, -969250379 * Class263.anInt3243, (((Class46) this).aClass366_436.anInt4231 * -2044941049), 0);
	}

	public boolean method10(int i) {
		return true;
	}

	public void method12(boolean bool) {
		if (bool)
			Class316.aClass505_3680.B(0, 0, Class349.anInt4083 * -418109423, -969250379 * Class263.anInt3243, (((Class46) this).aClass366_436.anInt4231 * -2044941049), 0);
	}

	Class46(Class366 class366) {
		((Class46) this).aClass366_436 = class366;
	}

	public void method14(boolean bool) {
		if (bool)
			Class316.aClass505_3680.B(0, 0, Class349.anInt4083 * -418109423, -969250379 * Class263.anInt3243, (((Class46) this).aClass366_436.anInt4231 * -2044941049), 0);
	}

	public void method15() {
		/* empty */
	}

	public void method18() {
		/* empty */
	}

	public void method23() {
		/* empty */
	}

	public void method16() {
		/* empty */
	}

	public void method22(int i) {
		/* empty */
	}

	public boolean method13() {
		return true;
	}

	public boolean method9() {
		return true;
	}

	public void method19() {
		/* empty */
	}

	public boolean method17() {
		return true;
	}

	static final boolean method929(int i, int i_0_, Class225 class225, Class336 class336, int i_1_) {
		int i_2_ = i;
		int i_3_ = i_0_;
		int i_4_ = 64;
		int i_5_ = 64;
		int i_6_ = i - i_4_;
		int i_7_ = i_0_ - i_5_;
		Class251.anIntArrayArray3096[i_4_][i_5_] = 99;
		Class251.anIntArrayArray3102[i_4_][i_5_] = 0;
		int i_8_ = 0;
		int i_9_ = 0;
		Class251.anIntArray3101[i_8_] = i_2_;
		Class251.anIntArray3099[i_8_++] = i_3_;
		int[][] is = class336.anIntArrayArray3922;
		while (i_9_ != i_8_) {
			i_2_ = Class251.anIntArray3101[i_9_];
			i_3_ = Class251.anIntArray3099[i_9_];
			i_9_ = 1 + i_9_ & 0xfff;
			i_4_ = i_2_ - i_6_;
			i_5_ = i_3_ - i_7_;
			int i_10_ = i_2_ - -1969357273 * class336.anInt3931;
			int i_11_ = i_3_ - class336.anInt3964 * 1503444365;
			if (class225.method3787(2, i_2_, i_3_, class336, (byte) -32)) {
				Class251.anInt3098 = i_2_ * -1071145131;
				Class251.anInt3095 = -1330567915 * i_3_;
				return true;
			}
			int i_12_ = Class251.anIntArrayArray3102[i_4_][i_5_] + 1;
			if (i_4_ > 0 && Class251.anIntArrayArray3096[i_4_ - 1][i_5_] == 0 && (is[i_10_ - 1][i_11_] & 0x43a40000) == 0 && 0 == (is[i_10_ - 1][1 + i_11_] & 0x4e240000)) {
				Class251.anIntArray3101[i_8_] = i_2_ - 1;
				Class251.anIntArray3099[i_8_] = i_3_;
				i_8_ = i_8_ + 1 & 0xfff;
				Class251.anIntArrayArray3096[i_4_ - 1][i_5_] = 2;
				Class251.anIntArrayArray3102[i_4_ - 1][i_5_] = i_12_;
			}
			if (i_4_ < 126 && 0 == Class251.anIntArrayArray3096[1 + i_4_][i_5_] && 0 == (is[2 + i_10_][i_11_] & 0x60e40000) && 0 == (is[i_10_ + 2][1 + i_11_] & 0x78240000)) {
				Class251.anIntArray3101[i_8_] = 1 + i_2_;
				Class251.anIntArray3099[i_8_] = i_3_;
				i_8_ = 1 + i_8_ & 0xfff;
				Class251.anIntArrayArray3096[i_4_ + 1][i_5_] = 8;
				Class251.anIntArrayArray3102[i_4_ + 1][i_5_] = i_12_;
			}
			if (i_5_ > 0 && Class251.anIntArrayArray3096[i_4_][i_5_ - 1] == 0 && 0 == (is[i_10_][i_11_ - 1] & 0x43a40000) && (is[i_10_ + 1][i_11_ - 1] & 0x60e40000) == 0) {
				Class251.anIntArray3101[i_8_] = i_2_;
				Class251.anIntArray3099[i_8_] = i_3_ - 1;
				i_8_ = 1 + i_8_ & 0xfff;
				Class251.anIntArrayArray3096[i_4_][i_5_ - 1] = 1;
				Class251.anIntArrayArray3102[i_4_][i_5_ - 1] = i_12_;
			}
			if (i_5_ < 126 && Class251.anIntArrayArray3096[i_4_][i_5_ + 1] == 0 && (is[i_10_][i_11_ + 2] & 0x4e240000) == 0 && 0 == (is[1 + i_10_][i_11_ + 2] & 0x78240000)) {
				Class251.anIntArray3101[i_8_] = i_2_;
				Class251.anIntArray3099[i_8_] = i_3_ + 1;
				i_8_ = 1 + i_8_ & 0xfff;
				Class251.anIntArrayArray3096[i_4_][i_5_ + 1] = 4;
				Class251.anIntArrayArray3102[i_4_][i_5_ + 1] = i_12_;
			}
			if (i_4_ > 0 && i_5_ > 0 && Class251.anIntArrayArray3096[i_4_ - 1][i_5_ - 1] == 0 && (is[i_10_ - 1][i_11_] & 0x4fa40000) == 0 && 0 == (is[i_10_ - 1][i_11_ - 1] & 0x43a40000) && 0 == (is[i_10_][i_11_ - 1] & 0x63e40000)) {
				Class251.anIntArray3101[i_8_] = i_2_ - 1;
				Class251.anIntArray3099[i_8_] = i_3_ - 1;
				i_8_ = 1 + i_8_ & 0xfff;
				Class251.anIntArrayArray3096[i_4_ - 1][i_5_ - 1] = 3;
				Class251.anIntArrayArray3102[i_4_ - 1][i_5_ - 1] = i_12_;
			}
			if (i_4_ < 126 && i_5_ > 0 && 0 == Class251.anIntArrayArray3096[i_4_ + 1][i_5_ - 1] && 0 == (is[1 + i_10_][i_11_ - 1] & 0x63e40000) && (is[2 + i_10_][i_11_ - 1] & 0x60e40000) == 0 && 0 == (is[2 + i_10_][i_11_] & 0x78e40000)) {
				Class251.anIntArray3101[i_8_] = 1 + i_2_;
				Class251.anIntArray3099[i_8_] = i_3_ - 1;
				i_8_ = i_8_ + 1 & 0xfff;
				Class251.anIntArrayArray3096[1 + i_4_][i_5_ - 1] = 9;
				Class251.anIntArrayArray3102[1 + i_4_][i_5_ - 1] = i_12_;
			}
			if (i_4_ > 0 && i_5_ < 126 && Class251.anIntArrayArray3096[i_4_ - 1][1 + i_5_] == 0 && 0 == (is[i_10_ - 1][i_11_ + 1] & 0x4fa40000) && 0 == (is[i_10_ - 1][i_11_ + 2] & 0x4e240000) && (is[i_10_][i_11_ + 2] & 0x7e240000) == 0) {
				Class251.anIntArray3101[i_8_] = i_2_ - 1;
				Class251.anIntArray3099[i_8_] = 1 + i_3_;
				i_8_ = 1 + i_8_ & 0xfff;
				Class251.anIntArrayArray3096[i_4_ - 1][1 + i_5_] = 6;
				Class251.anIntArrayArray3102[i_4_ - 1][i_5_ + 1] = i_12_;
			}
			if (i_4_ < 126 && i_5_ < 126 && Class251.anIntArrayArray3096[i_4_ + 1][1 + i_5_] == 0 && 0 == (is[i_10_ + 1][2 + i_11_] & 0x7e240000) && 0 == (is[i_10_ + 2][2 + i_11_] & 0x78240000) && (is[2 + i_10_][i_11_ + 1] & 0x78e40000) == 0) {
				Class251.anIntArray3101[i_8_] = i_2_ + 1;
				Class251.anIntArray3099[i_8_] = i_3_ + 1;
				i_8_ = i_8_ + 1 & 0xfff;
				Class251.anIntArrayArray3096[1 + i_4_][1 + i_5_] = 12;
				Class251.anIntArrayArray3102[1 + i_4_][1 + i_5_] = i_12_;
			}
		}
		Class251.anInt3098 = -1071145131 * i_2_;
		Class251.anInt3095 = i_3_ * -1330567915;
		return false;
	}

	static final boolean method930(int i, int i_13_, int i_14_, Class225 class225, Class336 class336, byte i_15_) {
		int i_16_ = i;
		int i_17_ = i_13_;
		int i_18_ = 64;
		int i_19_ = 64;
		int i_20_ = i - i_18_;
		int i_21_ = i_13_ - i_19_;
		Class251.anIntArrayArray3096[i_18_][i_19_] = 99;
		Class251.anIntArrayArray3102[i_18_][i_19_] = 0;
		int i_22_ = 0;
		int i_23_ = 0;
		Class251.anIntArray3101[i_22_] = i_16_;
		Class251.anIntArray3099[i_22_++] = i_17_;
		int[][] is = class336.anIntArrayArray3922;
		while (i_22_ != i_23_) {
			i_16_ = Class251.anIntArray3101[i_23_];
			i_17_ = Class251.anIntArray3099[i_23_];
			i_23_ = 1 + i_23_ & 0xfff;
			i_18_ = i_16_ - i_20_;
			i_19_ = i_17_ - i_21_;
			int i_24_ = i_16_ - -1969357273 * class336.anInt3931;
			int i_25_ = i_17_ - class336.anInt3964 * 1503444365;
			if (class225.method3787(i_14_, i_16_, i_17_, class336, (byte) -14)) {
				Class251.anInt3098 = -1071145131 * i_16_;
				Class251.anInt3095 = -1330567915 * i_17_;
				return true;
			}
			int i_26_ = 1 + Class251.anIntArrayArray3102[i_18_][i_19_];
			while_123_: do {
				if (i_18_ > 0 && Class251.anIntArrayArray3096[i_18_ - 1][i_19_] == 0 && (is[i_24_ - 1][i_25_] & 0x43a40000) == 0 && 0 == (is[i_24_ - 1][i_14_ + i_25_ - 1] & 0x4e240000)) {
					for (int i_27_ = 1; i_27_ < i_14_ - 1; i_27_++) {
						if ((is[i_24_ - 1][i_27_ + i_25_] & 0x4fa40000) != 0)
							break while_123_;
					}
					Class251.anIntArray3101[i_22_] = i_16_ - 1;
					Class251.anIntArray3099[i_22_] = i_17_;
					i_22_ = i_22_ + 1 & 0xfff;
					Class251.anIntArrayArray3096[i_18_ - 1][i_19_] = 2;
					Class251.anIntArrayArray3102[i_18_ - 1][i_19_] = i_26_;
				}
			} while (false);
			while_124_: do {
				if (i_18_ < 128 - i_14_ && Class251.anIntArrayArray3096[1 + i_18_][i_19_] == 0 && (is[i_14_ + i_24_][i_25_] & 0x60e40000) == 0 && 0 == (is[i_14_ + i_24_][i_25_ + i_14_ - 1] & 0x78240000)) {
					for (int i_28_ = 1; i_28_ < i_14_ - 1; i_28_++) {
						if ((is[i_24_ + i_14_][i_28_ + i_25_] & 0x78e40000) != 0)
							break while_124_;
					}
					Class251.anIntArray3101[i_22_] = i_16_ + 1;
					Class251.anIntArray3099[i_22_] = i_17_;
					i_22_ = i_22_ + 1 & 0xfff;
					Class251.anIntArrayArray3096[i_18_ + 1][i_19_] = 8;
					Class251.anIntArrayArray3102[i_18_ + 1][i_19_] = i_26_;
				}
			} while (false);
			while_125_: do {
				if (i_19_ > 0 && 0 == Class251.anIntArrayArray3096[i_18_][i_19_ - 1] && (is[i_24_][i_25_ - 1] & 0x43a40000) == 0 && (is[i_14_ + i_24_ - 1][i_25_ - 1] & 0x60e40000) == 0) {
					for (int i_29_ = 1; i_29_ < i_14_ - 1; i_29_++) {
						if (0 != (is[i_29_ + i_24_][i_25_ - 1] & 0x63e40000))
							break while_125_;
					}
					Class251.anIntArray3101[i_22_] = i_16_;
					Class251.anIntArray3099[i_22_] = i_17_ - 1;
					i_22_ = 1 + i_22_ & 0xfff;
					Class251.anIntArrayArray3096[i_18_][i_19_ - 1] = 1;
					Class251.anIntArrayArray3102[i_18_][i_19_ - 1] = i_26_;
				}
			} while (false);
			while_126_: do {
				if (i_19_ < 128 - i_14_ && 0 == Class251.anIntArrayArray3096[i_18_][1 + i_19_] && (is[i_24_][i_14_ + i_25_] & 0x4e240000) == 0 && 0 == (is[i_24_ + i_14_ - 1][i_25_ + i_14_] & 0x78240000)) {
					for (int i_30_ = 1; i_30_ < i_14_ - 1; i_30_++) {
						if (0 != (is[i_24_ + i_30_][i_25_ + i_14_] & 0x7e240000))
							break while_126_;
					}
					Class251.anIntArray3101[i_22_] = i_16_;
					Class251.anIntArray3099[i_22_] = i_17_ + 1;
					i_22_ = i_22_ + 1 & 0xfff;
					Class251.anIntArrayArray3096[i_18_][i_19_ + 1] = 4;
					Class251.anIntArrayArray3102[i_18_][i_19_ + 1] = i_26_;
				}
			} while (false);
			while_127_: do {
				if (i_18_ > 0 && i_19_ > 0 && 0 == Class251.anIntArrayArray3096[i_18_ - 1][i_19_ - 1] && 0 == (is[i_24_ - 1][i_25_ - 1] & 0x43a40000)) {
					for (int i_31_ = 1; i_31_ < i_14_; i_31_++) {
						if (0 != (is[i_24_ - 1][i_25_ - 1 + i_31_] & 0x4fa40000) || (is[i_31_ + (i_24_ - 1)][i_25_ - 1] & 0x63e40000) != 0)
							break while_127_;
					}
					Class251.anIntArray3101[i_22_] = i_16_ - 1;
					Class251.anIntArray3099[i_22_] = i_17_ - 1;
					i_22_ = 1 + i_22_ & 0xfff;
					Class251.anIntArrayArray3096[i_18_ - 1][i_19_ - 1] = 3;
					Class251.anIntArrayArray3102[i_18_ - 1][i_19_ - 1] = i_26_;
				}
			} while (false);
			while_128_: do {
				if (i_18_ < 128 - i_14_ && i_19_ > 0 && Class251.anIntArrayArray3096[1 + i_18_][i_19_ - 1] == 0 && 0 == (is[i_14_ + i_24_][i_25_ - 1] & 0x60e40000)) {
					for (int i_32_ = 1; i_32_ < i_14_; i_32_++) {
						if ((is[i_24_ + i_14_][i_25_ - 1 + i_32_] & 0x78e40000) != 0 || 0 != (is[i_32_ + i_24_][i_25_ - 1] & 0x63e40000))
							break while_128_;
					}
					Class251.anIntArray3101[i_22_] = 1 + i_16_;
					Class251.anIntArray3099[i_22_] = i_17_ - 1;
					i_22_ = 1 + i_22_ & 0xfff;
					Class251.anIntArrayArray3096[1 + i_18_][i_19_ - 1] = 9;
					Class251.anIntArrayArray3102[1 + i_18_][i_19_ - 1] = i_26_;
				}
			} while (false);
			while_129_: do {
				if (i_18_ > 0 && i_19_ < 128 - i_14_ && Class251.anIntArrayArray3096[i_18_ - 1][1 + i_19_] == 0 && (is[i_24_ - 1][i_14_ + i_25_] & 0x4e240000) == 0) {
					for (int i_33_ = 1; i_33_ < i_14_; i_33_++) {
						if (0 != (is[i_24_ - 1][i_33_ + i_25_] & 0x4fa40000) || 0 != (is[i_33_ + (i_24_ - 1)][i_14_ + i_25_] & 0x7e240000))
							break while_129_;
					}
					Class251.anIntArray3101[i_22_] = i_16_ - 1;
					Class251.anIntArray3099[i_22_] = 1 + i_17_;
					i_22_ = i_22_ + 1 & 0xfff;
					Class251.anIntArrayArray3096[i_18_ - 1][1 + i_19_] = 6;
					Class251.anIntArrayArray3102[i_18_ - 1][1 + i_19_] = i_26_;
				}
			} while (false);
			while_130_: do {
				if (i_18_ < 128 - i_14_ && i_19_ < 128 - i_14_ && Class251.anIntArrayArray3096[i_18_ + 1][1 + i_19_] == 0 && (is[i_24_ + i_14_][i_14_ + i_25_] & 0x78240000) == 0) {
					for (int i_34_ = 1; i_34_ < i_14_; i_34_++) {
						if (((is[i_24_ + i_34_][i_25_ + i_14_] & 0x7e240000) != 0) || 0 != (is[i_14_ + i_24_][i_34_ + i_25_] & 0x78e40000))
							break while_130_;
					}
					Class251.anIntArray3101[i_22_] = i_16_ + 1;
					Class251.anIntArray3099[i_22_] = i_17_ + 1;
					i_22_ = i_22_ + 1 & 0xfff;
					Class251.anIntArrayArray3096[1 + i_18_][i_19_ + 1] = 12;
					Class251.anIntArrayArray3102[1 + i_18_][1 + i_19_] = i_26_;
				}
			} while (false);
		}
		Class251.anInt3098 = -1071145131 * i_16_;
		Class251.anInt3095 = -1330567915 * i_17_;
		return false;
	}

	public static Class252[] method931(int i) {
		return (new Class252[] { Class252.aClass252_3111, Class252.aClass252_3110, Class252.aClass252_3113, Class252.aClass252_3108, Class252.aClass252_3105, Class252.aClass252_3109, Class252.aClass252_3107, Class252.aClass252_3106 });
	}

	public static int method932(int i) {
		synchronized (Class238.aClass229_2920) {
			int i_35_ = Class238.aClass229_2920.method3862((byte) 2);
			return i_35_;
		}
	}

	static final void method933(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = ((CS2Executor) class527).aClass61_7010.anInt635 * -1130104385;
	}

	static final void method934(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (-79546877 * Class11.aClass282_Sub51_124.anInt8167 < 512 || client.aBool7465 || client.aBool7171) ? 1 : 0;
	}

	static void method935(byte i) {
		int i_36_ = 0;
		if (Class393.aClass282_Sub54_4783 != null)
			i_36_ = Class393.aClass282_Sub54_4783.aClass468_Sub7_8210.method12666(1300916790);
		if (i_36_ == 2) {
			int i_37_ = (-1016911135 * Class45.anInt434 > 800 ? 800 : Class45.anInt434 * -1016911135);
			int i_38_ = (Class107.anInt1082 * -499509193 > 600 ? 600 : -499509193 * Class107.anInt1082);
			Class349.anInt4083 = i_37_ * -1943418639;
			client.anInt3250 = (-1016911135 * Class45.anInt434 - i_37_) / 2 * -1347577581;
			client.anInt3243 = -1929118563 * i_38_;
			client.anInt3251 = 0;
		} else if (1 == i_36_) {
			int i_39_ = (-1016911135 * Class45.anInt434 > 1024 ? 1024 : Class45.anInt434 * -1016911135);
			int i_40_ = (-499509193 * Class107.anInt1082 > 768 ? 768 : Class107.anInt1082 * -499509193);
			Class349.anInt4083 = -1943418639 * i_39_;
			client.anInt3250 = -1347577581 * ((-1016911135 * Class45.anInt434 - i_39_) / 2);
			client.anInt3243 = -1929118563 * i_40_;
			client.anInt3251 = 0;
		} else {
			Class349.anInt4083 = 1407460817 * Class45.anInt434;
			client.anInt3250 = 0;
			client.anInt3243 = Class107.anInt1082 * -2128872005;
			client.anInt3251 = 0;
		}
	}
}
