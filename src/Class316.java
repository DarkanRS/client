
/* Class316 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;
import java.util.Random;

public class Class316 {
	public static int[] anIntArray3668;
	public static int anInt3669;
	public static int anInt3670;
	public static int anInt3671;
	public static int[] anIntArray3672;
	public static int anInt3673;
	static final double aDouble3674 = 6.283185307179586;
	public static int[] anIntArray3675;
	public static final int anInt3676 = 12;
	public static int[] anIntArray3677;
	public static int anInt3678;
	static Class223 aClass223_3679 = new Class223(16);
	public static Class505 aClass505_3680;

	public static void method5586(byte i) {
		if (anIntArray3677 == null || null == anIntArray3675) {
			anIntArray3677 = new int[256];
			anIntArray3675 = new int[256];
			for (int i_0_ = 0; i_0_ < 256; i_0_++) {
				double d = 6.283185307179586 * ((double) i_0_ / 255.0);
				anIntArray3677[i_0_] = (int) (Math.sin(d) * 4096.0);
				anIntArray3675[i_0_] = (int) (Math.cos(d) * 4096.0);
			}
		}
	}

	public static byte[] method5587(int i) {
		Class282_Sub50_Sub2 class282_sub50_sub2 = (Class282_Sub50_Sub2) aClass223_3679.method3758((long) i);
		if (null == class282_sub50_sub2) {
			byte[] is = new byte[512];
			Random random = new Random((long) i);
			for (int i_1_ = 0; i_1_ < 255; i_1_++)
				is[i_1_] = (byte) i_1_;
			for (int i_2_ = 0; i_2_ < 255; i_2_++) {
				int i_3_ = 255 - i_2_;
				int i_4_ = Class476.method7931(random, i_3_, -1932816739);
				byte i_5_ = is[i_4_];
				is[i_4_] = is[i_3_];
				is[i_3_] = is[511 - i_2_] = i_5_;
			}
			class282_sub50_sub2 = new Class282_Sub50_Sub2(is);
			aClass223_3679.method3759(class282_sub50_sub2, (long) i);
		}
		return ((Class282_Sub50_Sub2) class282_sub50_sub2).aByteArray9472;
	}

	public static byte[] method5588(int i, int i_6_) {
		Class282_Sub50_Sub2 class282_sub50_sub2 = (Class282_Sub50_Sub2) aClass223_3679.method3758((long) i);
		if (null == class282_sub50_sub2) {
			byte[] is = new byte[512];
			Random random = new Random((long) i);
			for (int i_7_ = 0; i_7_ < 255; i_7_++)
				is[i_7_] = (byte) i_7_;
			for (int i_8_ = 0; i_8_ < 255; i_8_++) {
				int i_9_ = 255 - i_8_;
				int i_10_ = Class476.method7931(random, i_9_, 1472489211);
				byte i_11_ = is[i_10_];
				is[i_10_] = is[i_9_];
				is[i_9_] = is[511 - i_8_] = i_11_;
			}
			class282_sub50_sub2 = new Class282_Sub50_Sub2(is);
			aClass223_3679.method3759(class282_sub50_sub2, (long) i);
		}
		return ((Class282_Sub50_Sub2) class282_sub50_sub2).aByteArray9472;
	}

	public static void method5589() {
		if (anIntArray3677 == null || null == anIntArray3675) {
			anIntArray3677 = new int[256];
			anIntArray3675 = new int[256];
			for (int i = 0; i < 256; i++) {
				double d = 6.283185307179586 * ((double) i / 255.0);
				anIntArray3677[i] = (int) (Math.sin(d) * 4096.0);
				anIntArray3675[i] = (int) (Math.cos(d) * 4096.0);
			}
		}
	}

	public static void method5590() {
		if (anIntArray3677 == null || null == anIntArray3675) {
			anIntArray3677 = new int[256];
			anIntArray3675 = new int[256];
			for (int i = 0; i < 256; i++) {
				double d = 6.283185307179586 * ((double) i / 255.0);
				anIntArray3677[i] = (int) (Math.sin(d) * 4096.0);
				anIntArray3675[i] = (int) (Math.cos(d) * 4096.0);
			}
		}
	}

	public static void method5591() {
		if (anIntArray3677 == null || null == anIntArray3675) {
			anIntArray3677 = new int[256];
			anIntArray3675 = new int[256];
			for (int i = 0; i < 256; i++) {
				double d = 6.283185307179586 * ((double) i / 255.0);
				anIntArray3677[i] = (int) (Math.sin(d) * 4096.0);
				anIntArray3675[i] = (int) (Math.cos(d) * 4096.0);
			}
		}
	}

	Class316() throws Throwable {
		throw new Error();
	}

	public static byte[] method5592(int i) {
		Class282_Sub50_Sub2 class282_sub50_sub2 = (Class282_Sub50_Sub2) aClass223_3679.method3758((long) i);
		if (null == class282_sub50_sub2) {
			byte[] is = new byte[512];
			Random random = new Random((long) i);
			for (int i_12_ = 0; i_12_ < 255; i_12_++)
				is[i_12_] = (byte) i_12_;
			for (int i_13_ = 0; i_13_ < 255; i_13_++) {
				int i_14_ = 255 - i_13_;
				int i_15_ = Class476.method7931(random, i_14_, 1039549244);
				byte i_16_ = is[i_15_];
				is[i_15_] = is[i_14_];
				is[i_14_] = is[511 - i_13_] = i_16_;
			}
			class282_sub50_sub2 = new Class282_Sub50_Sub2(is);
			aClass223_3679.method3759(class282_sub50_sub2, (long) i);
		}
		return ((Class282_Sub50_Sub2) class282_sub50_sub2).aByteArray9472;
	}

	public static void method5593(int i, int i_17_, int i_18_) {
		if (anInt3670 * -402153223 != i) {
			anIntArray3672 = new int[i];
			for (int i_19_ = 0; i_19_ < i; i_19_++)
				anIntArray3672[i_19_] = (i_19_ << 12) / i;
			anInt3669 = (i - 1) * 1098080751;
			anInt3670 = i * -1570037431;
			anInt3678 = i * -1732528160;
		}
		if (-929726253 * anInt3671 != i_17_) {
			if (i_17_ != -402153223 * anInt3670) {
				anIntArray3668 = new int[i_17_];
				for (int i_20_ = 0; i_20_ < i_17_; i_20_++)
					anIntArray3668[i_20_] = (i_20_ << 12) / i_17_;
			} else
				anIntArray3668 = anIntArray3672;
			anInt3673 = (i_17_ - 1) * 849256327;
			anInt3671 = 1936643931 * i_17_;
		}
	}

	public static void method5594(int i) {
		Class404.method6810(1208455577);
		Class20.aBool161 = false;
		Class292.method5201(Class301.anInt3555 * 1742345613, Class184.anInt2300 * 815250613, -13788709 * Class158_Sub2.anInt8975, Class110.anInt1104 * -1488439617, (byte) 12);
		Class96_Sub23.aClass282_Sub50_Sub7_9445 = null;
		Class20.aClass282_Sub50_Sub7_168 = null;
	}

	static final void method5595(CS2Executor class527, int i) {
		int i_21_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_21_, (byte) 26);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_21_ >> 16];
		Class108.method1845(class118, class98, class527, -1020802647);
	}

	static String method5596(long l) {
		return Class78.method1372(new Date(l), "EEE dd-MMM-yyyy HH:mm:ss zzz", 1899008598);
	}

	static final void method5597(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		if ((((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012 + 1]) != (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]))
			((CS2Executor) class527).instrPtr += ((((CS2Executor) class527).unknown[((CS2Executor) class527).instrPtr * 301123709]) * -1051529003);
	}

	static final void method5598(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = -492594917 * class118.anInt1429;
	}

	static void method5599(int i, int i_22_) {
		Class475.anInt5624 = 1710901657 * i;
		Class291_Sub1.anInt8016 = 638834387;
		Class291_Sub1.anInt8016 = 638834387;
		Class89.method1502(-536865133);
	}
}
