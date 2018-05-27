
/* Class325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class325 {
	public static int method5779(int i, int i_0_, int i_1_) {
		i_1_ &= 0x3;
		if (i_1_ == 0)
			return i;
		if (i_1_ == 1)
			return i_0_;
		if (2 == i_1_)
			return 7 - i;
		return 7 - i_0_;
	}

	Class325() throws Throwable {
		throw new Error();
	}

	public static int method5780(int i, int i_2_, int i_3_) {
		i_3_ &= 0x3;
		if (0 == i_3_)
			return i_2_;
		if (i_3_ == 1)
			return 4095 - i;
		if (i_3_ == 2)
			return 4095 - i_2_;
		return i;
	}

	public static int method5781(int i, int i_4_, int i_5_) {
		i_5_ &= 0x3;
		if (0 == i_5_)
			return i_4_;
		if (i_5_ == 1)
			return 7 - i;
		if (2 == i_5_)
			return 7 - i_4_;
		return i;
	}

	public static int method5782(int i, int i_6_, int i_7_) {
		i_7_ &= 0x3;
		if (0 == i_7_)
			return i_6_;
		if (i_7_ == 1)
			return 7 - i;
		if (2 == i_7_)
			return 7 - i_6_;
		return i;
	}

	public static int method5783(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		if (1 == (i_12_ & 0x1)) {
			int i_13_ = i_10_;
			i_10_ = i_11_;
			i_11_ = i_13_;
		}
		i_9_ &= 0x3;
		if (0 == i_9_)
			return i;
		if (i_9_ == 1)
			return i_8_;
		if (i_9_ == 2)
			return 7 - i - (i_10_ - 1);
		return 7 - i_8_ - (i_11_ - 1);
	}

	public static int method5784(int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
		if ((i_18_ & 0x1) == 1) {
			int i_19_ = i_16_;
			i_16_ = i_17_;
			i_17_ = i_19_;
		}
		i_15_ &= 0x3;
		if (i_15_ == 0)
			return i_14_;
		if (1 == i_15_)
			return 7 - i - (i_16_ - 1);
		if (i_15_ == 2)
			return 7 - i_14_ - (i_17_ - 1);
		return i;
	}

	public static int method5785(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
		if ((i_24_ & 0x1) == 1) {
			int i_25_ = i_22_;
			i_22_ = i_23_;
			i_23_ = i_25_;
		}
		i_21_ &= 0x3;
		if (i_21_ == 0)
			return i_20_;
		if (1 == i_21_)
			return 7 - i - (i_22_ - 1);
		if (i_21_ == 2)
			return 7 - i_20_ - (i_23_ - 1);
		return i;
	}

	static final void method5786(CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4607, client.aClass184_7475.aClass432_2283, 1863419528);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(string.length() + 1);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		client.aClass184_7475.method3049(class282_sub23, -495344290);
	}

	public static Class199 method5787(Component component, int i) {
		return new Class199_Sub1(component);
	}

	static final void method5788(CS2Executor class527, int i) {
		Class282_Sub36 class282_sub36 = Class312_Sub1.method12538((byte) -105);
		if (null == class282_sub36) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub36.anInt7991 * -1798678621;
			int i_26_ = (-1967986419 * class282_sub36.anInt7988 << 28 | (Class291.anInt3472 + class282_sub36.anInt7987 * -1306535747) << 14 | (1012301095 * class282_sub36.anInt7993 + Class291.anInt3473));
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = i_26_;
		}
	}

	static boolean method5789(int i, int i_27_) {
		return i == 0 || 7 == i;
	}

	public static boolean method5790(int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_) {
		if (i >= i_33_ + i_31_ || i_31_ >= i + i_29_)
			return false;
		if (i_28_ >= i_32_ + i_34_ || i_32_ >= i_28_ + i_30_)
			return false;
		return true;
	}
}
