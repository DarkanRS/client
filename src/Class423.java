
/* Class423 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class423 {
	public static int method7044(int i) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return 1 + i;
	}

	public static int method7045(int i, int i_0_) {
		int i_1_ = 1;
		for (/**/; i_0_ > 1; i_0_ >>= 1) {
			if (0 != (i_0_ & 0x1))
				i_1_ *= i;
			i *= i;
		}
		if (1 == i_0_)
			return i_1_ * i;
		return i_1_;
	}

	public static int method7046(int i, int i_2_) {
		int i_3_ = 1;
		for (/**/; i_2_ > 1; i_2_ >>= 1) {
			if (0 != (i_2_ & 0x1))
				i_3_ *= i;
			i *= i;
		}
		if (1 == i_2_)
			return i_3_ * i;
		return i_3_;
	}

	public static int method7047(int i, int i_4_) {
		if (i_4_ > i) {
			int i_5_ = i;
			i = i_4_;
			i_4_ = i_5_;
		}
		int i_6_;
		for (/**/; i_4_ != 0; i_4_ = i_6_) {
			i_6_ = i % i_4_;
			i = i_4_;
		}
		return i;
	}

	Class423() throws Throwable {
		throw new Error();
	}

	public static int method7048(int i, int i_7_) {
		if (i_7_ > i) {
			int i_8_ = i;
			i = i_7_;
			i_7_ = i_8_;
		}
		int i_9_;
		for (/**/; i_7_ != 0; i_7_ = i_9_) {
			i_9_ = i % i_7_;
			i = i_7_;
		}
		return i;
	}

	public static int method7049(int i) {
		int i_10_ = i >>> 1;
		i_10_ |= i_10_ >>> 1;
		i_10_ |= i_10_ >>> 2;
		i_10_ |= i_10_ >>> 4;
		i_10_ |= i_10_ >>> 8;
		i_10_ |= i_10_ >>> 16;
		return i & (i_10_ ^ 0xffffffff);
	}

	public static int method7050(int i, int i_11_) {
		if (i_11_ > i) {
			int i_12_ = i;
			i = i_11_;
			i_11_ = i_12_;
		}
		int i_13_;
		for (/**/; i_11_ != 0; i_11_ = i_13_) {
			i_13_ = i % i_11_;
			i = i_11_;
		}
		return i;
	}

	public static int method7051(int i) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return 1 + i;
	}

	public static int method7052(int i) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return 1 + i;
	}

	public static int method7053(int i, int i_14_) {
		int i_15_ = i >>> 31;
		return (i_15_ + i) / i_14_ - i_15_;
	}

	public static boolean method7054(int i) {
		return (i & -i) == i;
	}

	public static int method7055(int i) {
		int i_16_ = i >>> 1;
		i_16_ |= i_16_ >>> 1;
		i_16_ |= i_16_ >>> 2;
		i_16_ |= i_16_ >>> 4;
		i_16_ |= i_16_ >>> 8;
		i_16_ |= i_16_ >>> 16;
		return i & (i_16_ ^ 0xffffffff);
	}

	public static boolean method7056(int i) {
		return (i & -i) == i;
	}

	public static int method7057(int i) {
		int i_17_ = i >>> 1;
		i_17_ |= i_17_ >>> 1;
		i_17_ |= i_17_ >>> 2;
		i_17_ |= i_17_ >>> 4;
		i_17_ |= i_17_ >>> 8;
		i_17_ |= i_17_ >>> 16;
		return i & (i_17_ ^ 0xffffffff);
	}

	public static int method7058(int i, int i_18_) {
		if (i_18_ > i) {
			int i_19_ = i;
			i = i_18_;
			i_18_ = i_19_;
		}
		int i_20_;
		for (/**/; i_18_ != 0; i_18_ = i_20_) {
			i_20_ = i % i_18_;
			i = i_18_;
		}
		return i;
	}

	static int method7059(int i, int i_21_) {
		int i_22_ = i >> 31 & i_21_ - 1;
		return i_22_ + ((i >>> 31) + i) % i_21_;
	}

	public static int method7060(int i) {
		int i_23_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_23_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_23_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_23_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_23_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_23_++;
		}
		return i_23_ + i;
	}

	static int method7061(int i, int i_24_) {
		int i_25_ = i >> 31 & i_24_ - 1;
		return i_25_ + ((i >>> 31) + i) % i_24_;
	}

	public static int method7062(int i, int i_26_) {
		int i_27_ = i >>> 31;
		return (i_27_ + i) / i_26_ - i_27_;
	}

	public static int method7063(Random random, int i) {
		if (i <= 0)
			throw new IllegalArgumentException();
		if (Class96_Sub9.method14585(i, 1942118537))
			return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i >> 32);
		int i_28_ = -2147483648 - (int) (4294967296L % (long) i);
		int i_29_;
		do
			i_29_ = random.nextInt();
		while (i_29_ >= i_28_);
		return Class302.method5360(i_29_, i, -205509000);
	}

	public static int method7064(Random random, int i) {
		if (i <= 0)
			throw new IllegalArgumentException();
		if (Class96_Sub9.method14585(i, 1942118537))
			return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i >> 32);
		int i_30_ = -2147483648 - (int) (4294967296L % (long) i);
		int i_31_;
		do
			i_31_ = random.nextInt();
		while (i_31_ >= i_30_);
		return Class302.method5360(i_31_, i, -1101602078);
	}

	public static Class345 method7065(int i, int i_32_) {
		Class345 class345 = (Class345) Class345.aClass229_4031.get((long) i);
		if (class345 != null)
			return class345;
		byte[] is = Class345.aClass317_4021.getFile(1, i, -2003556977);
		class345 = new Class345();
		class345.anInt4032 = i * -113116309;
		if (is != null)
			class345.method6124(new RsByteBuffer(is), (byte) -1);
		class345.method6128((byte) 3);
		if (2 == -39568147 * class345.anInt4041 && Class345.aClass465_4029.method7754((long) i) == null) {
			Class345.aClass465_4029.method7765(new Class282_Sub38(Class345.anInt4028 * 1723673999), (long) i);
			Class345.aClass345Array4025[(Class345.anInt4028 += 1694585199) * 1723673999 - 1] = class345;
		}
		Class345.aClass229_4031.put(class345, (long) i);
		return class345;
	}

	static final void method7066(int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, byte i_38_) {
		for (Class275_Sub6 class275_sub6 = (Class275_Sub6) client.aClass457_7335.method7659(301908602); class275_sub6 != null; class275_sub6 = ((Class275_Sub6) client.aClass457_7335.method7650((byte) 39))) {
			if (-1809259861 * client.cycles >= ((Class275_Sub6) class275_sub6).anInt7858 * -2033502209)
				class275_sub6.method4887((byte) -23);
			else {
				Class407.method6871(-486527707 * ((Class275_Sub6) class275_sub6).anInt7857, (((Class275_Sub6) class275_sub6).anInt7859 * -312295709 << 9) + 256, 256 + ((((Class275_Sub6) class275_sub6).anInt7854 * -1309570135) << 9), ((Class275_Sub6) class275_sub6).anInt7855 * 1139642318, -1994365952);
				Class285.aClass8_3394.method360(((Class275_Sub6) class275_sub6).aString7860, (int) ((float) i + client.aFloatArray7292[0]), (int) ((float) i_33_ + client.aFloatArray7292[1]), (~0xffffff | ((Class275_Sub6) class275_sub6).anInt7856 * 773426601), 0, 768492991);
			}
		}
	}
}
