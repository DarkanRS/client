
/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public final class Class241 {
	public static String method4141(byte[] is, int i, int i_0_) {
		char[] cs = new char[i_0_];
		int i_1_ = 0;
		int i_2_ = i;
		int i_3_ = i + i_0_;
		while (i_2_ < i_3_) {
			int i_4_ = is[i_2_++] & 0xff;
			int i_5_;
			if (i_4_ < 128) {
				if (i_4_ == 0)
					i_5_ = 65533;
				else
					i_5_ = i_4_;
			} else if (i_4_ < 192)
				i_5_ = 65533;
			else if (i_4_ < 224) {
				if (i_2_ < i_3_ && 128 == (is[i_2_] & 0xc0)) {
					i_5_ = (i_4_ & 0x1f) << 6 | is[i_2_++] & 0x3f;
					if (i_5_ < 128)
						i_5_ = 65533;
				} else
					i_5_ = 65533;
			} else if (i_4_ < 240) {
				if (1 + i_2_ < i_3_ && 128 == (is[i_2_] & 0xc0) && (is[1 + i_2_] & 0xc0) == 128) {
					i_5_ = ((i_4_ & 0xf) << 12 | (is[i_2_++] & 0x3f) << 6 | is[i_2_++] & 0x3f);
					if (i_5_ < 2048)
						i_5_ = 65533;
				} else
					i_5_ = 65533;
			} else if (i_4_ < 248) {
				if (i_2_ + 2 < i_3_ && 128 == (is[i_2_] & 0xc0) && 128 == (is[i_2_ + 1] & 0xc0) && 128 == (is[i_2_ + 2] & 0xc0)) {
					i_5_ = ((i_4_ & 0x7) << 18 | (is[i_2_++] & 0x3f) << 12 | (is[i_2_++] & 0x3f) << 6 | is[i_2_++] & 0x3f);
					if (i_5_ < 65536 || i_5_ > 1114111)
						i_5_ = 65533;
					else
						i_5_ = 65533;
				} else
					i_5_ = 65533;
			} else
				i_5_ = 65533;
			cs[i_1_++] = (char) i_5_;
		}
		return new String(cs, 0, i_1_);
	}

	public static int method4142(byte[] is, int i, CharSequence charsequence) {
		int i_6_ = charsequence.length();
		int i_7_ = i;
		for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
			int i_9_ = charsequence.charAt(i_8_);
			if (i_9_ <= 127)
				is[i_7_++] = (byte) i_9_;
			else if (i_9_ <= 2047) {
				is[i_7_++] = (byte) (0xc0 | i_9_ >> 6);
				is[i_7_++] = (byte) (0x80 | i_9_ & 0x3f);
			} else {
				is[i_7_++] = (byte) (0xe0 | i_9_ >> 12);
				is[i_7_++] = (byte) (0x80 | i_9_ >> 6 & 0x3f);
				is[i_7_++] = (byte) (0x80 | i_9_ & 0x3f);
			}
		}
		return i_7_ - i;
	}

	public static int method4143(byte[] is, int i, CharSequence charsequence) {
		int i_10_ = charsequence.length();
		int i_11_ = i;
		for (int i_12_ = 0; i_12_ < i_10_; i_12_++) {
			int i_13_ = charsequence.charAt(i_12_);
			if (i_13_ <= 127)
				is[i_11_++] = (byte) i_13_;
			else if (i_13_ <= 2047) {
				is[i_11_++] = (byte) (0xc0 | i_13_ >> 6);
				is[i_11_++] = (byte) (0x80 | i_13_ & 0x3f);
			} else {
				is[i_11_++] = (byte) (0xe0 | i_13_ >> 12);
				is[i_11_++] = (byte) (0x80 | i_13_ >> 6 & 0x3f);
				is[i_11_++] = (byte) (0x80 | i_13_ & 0x3f);
			}
		}
		return i_11_ - i;
	}

	Class241() throws Throwable {
		throw new Error();
	}

	public static String method4144(byte[] is, int i, int i_14_) {
		char[] cs = new char[i_14_];
		int i_15_ = 0;
		int i_16_ = i;
		int i_17_ = i + i_14_;
		while (i_16_ < i_17_) {
			int i_18_ = is[i_16_++] & 0xff;
			int i_19_;
			if (i_18_ < 128) {
				if (i_18_ == 0)
					i_19_ = 65533;
				else
					i_19_ = i_18_;
			} else if (i_18_ < 192)
				i_19_ = 65533;
			else if (i_18_ < 224) {
				if (i_16_ < i_17_ && 128 == (is[i_16_] & 0xc0)) {
					i_19_ = (i_18_ & 0x1f) << 6 | is[i_16_++] & 0x3f;
					if (i_19_ < 128)
						i_19_ = 65533;
				} else
					i_19_ = 65533;
			} else if (i_18_ < 240) {
				if (1 + i_16_ < i_17_ && 128 == (is[i_16_] & 0xc0) && (is[1 + i_16_] & 0xc0) == 128) {
					i_19_ = ((i_18_ & 0xf) << 12 | (is[i_16_++] & 0x3f) << 6 | is[i_16_++] & 0x3f);
					if (i_19_ < 2048)
						i_19_ = 65533;
				} else
					i_19_ = 65533;
			} else if (i_18_ < 248) {
				if (i_16_ + 2 < i_17_ && 128 == (is[i_16_] & 0xc0) && 128 == (is[i_16_ + 1] & 0xc0) && 128 == (is[i_16_ + 2] & 0xc0)) {
					i_19_ = ((i_18_ & 0x7) << 18 | (is[i_16_++] & 0x3f) << 12 | (is[i_16_++] & 0x3f) << 6 | is[i_16_++] & 0x3f);
					if (i_19_ < 65536 || i_19_ > 1114111)
						i_19_ = 65533;
					else
						i_19_ = 65533;
				} else
					i_19_ = 65533;
			} else
				i_19_ = 65533;
			cs[i_15_++] = (char) i_19_;
		}
		return new String(cs, 0, i_15_);
	}

	public static String method4145(byte[] is, int i, int i_20_) {
		char[] cs = new char[i_20_];
		int i_21_ = 0;
		int i_22_ = i;
		int i_23_ = i + i_20_;
		while (i_22_ < i_23_) {
			int i_24_ = is[i_22_++] & 0xff;
			int i_25_;
			if (i_24_ < 128) {
				if (i_24_ == 0)
					i_25_ = 65533;
				else
					i_25_ = i_24_;
			} else if (i_24_ < 192)
				i_25_ = 65533;
			else if (i_24_ < 224) {
				if (i_22_ < i_23_ && 128 == (is[i_22_] & 0xc0)) {
					i_25_ = (i_24_ & 0x1f) << 6 | is[i_22_++] & 0x3f;
					if (i_25_ < 128)
						i_25_ = 65533;
				} else
					i_25_ = 65533;
			} else if (i_24_ < 240) {
				if (1 + i_22_ < i_23_ && 128 == (is[i_22_] & 0xc0) && (is[1 + i_22_] & 0xc0) == 128) {
					i_25_ = ((i_24_ & 0xf) << 12 | (is[i_22_++] & 0x3f) << 6 | is[i_22_++] & 0x3f);
					if (i_25_ < 2048)
						i_25_ = 65533;
				} else
					i_25_ = 65533;
			} else if (i_24_ < 248) {
				if (i_22_ + 2 < i_23_ && 128 == (is[i_22_] & 0xc0) && 128 == (is[i_22_ + 1] & 0xc0) && 128 == (is[i_22_ + 2] & 0xc0)) {
					i_25_ = ((i_24_ & 0x7) << 18 | (is[i_22_++] & 0x3f) << 12 | (is[i_22_++] & 0x3f) << 6 | is[i_22_++] & 0x3f);
					if (i_25_ < 65536 || i_25_ > 1114111)
						i_25_ = 65533;
					else
						i_25_ = 65533;
				} else
					i_25_ = 65533;
			} else
				i_25_ = 65533;
			cs[i_21_++] = (char) i_25_;
		}
		return new String(cs, 0, i_21_);
	}

	static final void method4146(Class527 class527, int i) {
		int i_26_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_26_, (byte) 59);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = 597157617 * class118.anInt1299;
	}

	static final void method4147(Class527 class527, int i) {
		int i_27_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_27_, (byte) 107);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = -492594917 * class118.anInt1429;
	}

	static final void method4148(Class527 class527, int i) {
		((Class527) class527).anInt7012 -= 283782002;
		int i_28_ = (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537]);
		int i_29_ = (((Class527) class527).anIntArray6999[1 + ((Class527) class527).anInt7012 * 1942118537]);
		if (-1 == i_29_)
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = Class296.aClass331_3535.method5918(i_28_, 230168792).method15211((char) i_29_, 1343010087);
	}

	static final void method4149(Class118 class118, Class98 class98, Class527 class527, int i) {
		class118.anInt1378 = ((((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]) * 125067541);
	}

	public static int method4150(int i) {
		Canvas canvas = new Canvas();
		canvas.setSize(100, 100);
		Class505 class505 = Class320.method5732(0, canvas, null, null, 0, -2017555063);
		long l = Class169.method2869(1572721272);
		for (int i_30_ = 0; i_30_ < 10000; i_30_++)
			class505.method8658(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		int i_31_ = (int) (Class169.method2869(1890808944) - l);
		class505.method8425(0, 0, 100, 100, -16777216, (byte) -29);
		class505.method8396(-2143467944);
		return i_31_;
	}

	static final int method4151(int i, int i_32_, int i_33_) {
		int i_34_ = (Class260.method4632(i - 1, i_32_ - 1, -560937725) + Class260.method4632(1 + i, i_32_ - 1, -402539305) + Class260.method4632(i - 1, 1 + i_32_, -1473619628) + Class260.method4632(i + 1, 1 + i_32_, -1104539338));
		int i_35_ = (Class260.method4632(i - 1, i_32_, -1635186787) + Class260.method4632(1 + i, i_32_, -482415462) + Class260.method4632(i, i_32_ - 1, -455733899) + Class260.method4632(i, i_32_ + 1, -1506173110));
		int i_36_ = Class260.method4632(i, i_32_, -145642612);
		return i_36_ / 4 + (i_35_ / 8 + i_34_ / 16);
	}

	static void method4152(Class118 class118, Class455 class455, int i, int i_37_, int i_38_, int i_39_, int i_40_, String string, Class8 class8, Class414 class414, int i_41_, int i_42_) {
		int i_43_;
		if (4 == -672443707 * Class262.anInt3240)
			i_43_ = (int) client.aFloat7365 & 0x3fff;
		else
			i_43_ = (client.anInt7255 * -1790074477 + (int) client.aFloat7365 & 0x3fff);
		int i_44_ = (Math.max(class118.anInt1301 * 1506818197 / 2, class118.anInt1429 * -492594917 / 2) + 10);
		int i_45_ = i_39_ * i_39_ + i_38_ * i_38_;
		if (i_45_ <= i_44_ * i_44_) {
			int i_46_ = Class382.anIntArray4657[i_43_];
			int i_47_ = Class382.anIntArray4661[i_43_];
			if (4 != -672443707 * Class262.anInt3240) {
				i_46_ = i_46_ * 256 / (256 + client.anInt7203 * -1864403271);
				i_47_ = i_47_ * 256 / (256 + client.anInt7203 * -1864403271);
			}
			int i_48_ = i_46_ * i_39_ + i_38_ * i_47_ >> 14;
			int i_49_ = i_47_ * i_39_ - i_46_ * i_38_ >> 14;
			int i_50_ = class414.method6951(string, 100, null, (byte) 100);
			int i_51_ = class414.method6972(string, 100, 0, null, 2039884820);
			i_48_ -= i_50_ / 2;
			if (i_48_ >= -(class118.anInt1301 * 1506818197) && i_48_ <= class118.anInt1301 * 1506818197 && i_49_ >= -(-492594917 * class118.anInt1429) && i_49_ <= class118.anInt1429 * -492594917)
				class8.method378(string, 1506818197 * class118.anInt1301 / 2 + (i_48_ + i), (-492594917 * class118.anInt1429 / 2 + i_37_ - i_49_ - i_40_ - i_51_), i_50_, 50, i_41_, 0, 1, 0, 0, null, null, class455, i, i_37_, (byte) 123);
		}
	}
}
