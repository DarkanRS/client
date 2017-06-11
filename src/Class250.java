/* Class250 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class250 {
	public static int anInt2753;
	static double aDouble2754 = 6.283185307179586;
	public static int anInt2755;
	public static int anInt2756;
	public static int anInt2757;
	public static int anInt2758;
	public static int anInt2759 = 12;
	public static int[] anIntArray2760;
	public static int[] anIntArray2761;
	public static int[] anIntArray2762;
	public static int[] anIntArray2763;
	static Class354 aClass354_2764 = new Class354(16);
	public static String aString2765;
	static Class57[] aClass57Array2766;

	public static byte[] method2395(int i, byte i_0_) {
		try {
			Class298_Sub37_Sub11 class298_sub37_sub11 = (Class298_Sub37_Sub11) aClass354_2764.method4253((long) i);
			if (class298_sub37_sub11 == null) {
				byte[] is = new byte[512];
				Random random = new Random((long) i);
				for (int i_1_ = 0; i_1_ < 255; i_1_++)
					is[i_1_] = (byte) i_1_;
				for (int i_2_ = 0; i_2_ < 255; i_2_++) {
					int i_3_ = 255 - i_2_;
					int i_4_ = Class298_Sub19_Sub3.method3039(random, i_3_, (byte) -16);
					byte i_5_ = is[i_4_];
					is[i_4_] = is[i_3_];
					is[i_3_] = is[511 - i_2_] = i_5_;
				}
				class298_sub37_sub11 = new Class298_Sub37_Sub11(is);
				aClass354_2764.method4255(class298_sub37_sub11, (long) i);
			}
			return (((Class298_Sub37_Sub11) class298_sub37_sub11).aByteArray9606);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kl.b(").append(')').toString());
		}
	}

	public static void method2396(byte i) {
		try {
			if (anIntArray2761 == null || anIntArray2763 == null) {
				anIntArray2761 = new int[256];
				anIntArray2763 = new int[256];
				for (int i_6_ = 0; i_6_ < 256; i_6_++) {
					double d = (double) i_6_ / 255.0 * 6.283185307179586;
					anIntArray2761[i_6_] = (int) (Math.sin(d) * 4096.0);
					anIntArray2763[i_6_] = (int) (Math.cos(d) * 4096.0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kl.a(").append(')').toString());
		}
	}

	public static void method2397(int i, int i_7_, byte i_8_) {
		try {
			if (anInt2755 * -1474554145 != i) {
				anIntArray2762 = new int[i];
				for (int i_9_ = 0; i_9_ < i; i_9_++)
					anIntArray2762[i_9_] = (i_9_ << 12) / i;
				anInt2753 = -213871671 * (i - 1);
				anInt2755 = -350935777 * i;
				anInt2757 = -742310304 * i;
			}
			if (461985445 * anInt2756 != i_7_) {
				if (-1474554145 * anInt2755 != i_7_) {
					anIntArray2760 = new int[i_7_];
					for (int i_10_ = 0; i_10_ < i_7_; i_10_++)
						anIntArray2760[i_10_] = (i_10_ << 12) / i_7_;
				} else
					anIntArray2760 = anIntArray2762;
				anInt2758 = 380257689 * (i_7_ - 1);
				anInt2756 = i_7_ * -2088328915;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kl.f(").append(')').toString());
		}
	}

	Class250() throws Throwable {
		throw new Error();
	}

	static final void method2398(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class484.method6142(class105, class119, class403, -721593745);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kl.ef(").append(')').toString());
		}
	}

	static final void method2399(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5241 -= 1938723502;
			String string = (String) (((ClientScript2) class403).anObjectArray5240[-203050393 * ((ClientScript2) class403).anInt5241]);
			String string_11_ = ((String) (((ClientScript2) class403).anObjectArray5240[-203050393 * ((ClientScript2) class403).anInt5241 + 1]));
			if (null != (Class287.myPlayer.aClass366_10209) && (Class287.myPlayer.aClass366_10209.aBoolean3977))
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = string_11_;
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("kl.zm(").append(')').toString());
		}
	}
}
