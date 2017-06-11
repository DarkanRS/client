/* Class268 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class268 {
	static int[] anIntArray2858;
	Class279 aClass279_2859;
	Class279 aClass279_2860;
	Class279 aClass279_2861;
	Class279 aClass279_2862;
	Class279 aClass279_2863;
	int anInt2864;
	Class279 aClass279_2865;
	int[] anIntArray2866 = { 0, 0, 0, 0, 0 };
	int[] anIntArray2867 = { 0, 0, 0, 0, 0 };
	int[] anIntArray2868 = { 0, 0, 0, 0, 0 };
	int anInt2869 = 0;
	Class286 aClass286_2870;
	static int[] anIntArray2871;
	static int[] anIntArray2872;
	int anInt2873;
	int anInt2874;
	static int[] anIntArray2875;
	static int[] anIntArray2876 = new int[32768];
	Class279 aClass279_2877;
	Class279 aClass279_2878;
	Class279 aClass279_2879;
	static int[] anIntArray2880;
	static int[] anIntArray2881;
	static int[] anIntArray2882;
	static double aDouble2883 = 1.0057929410678534;

	Class268() {
		((Class268) this).anInt2864 = 100;
		((Class268) this).anInt2873 = 500;
		((Class268) this).anInt2874 = 0;
	}

	final int method2529(int i, int i_0_, int i_1_) {
		if (i_1_ == 1) {
			if ((i & 0x7fff) < 16384)
				return i_0_;
			return -i_0_;
		}
		if (i_1_ == 2)
			return anIntArray2871[i & 0x7fff] * i_0_ >> 14;
		if (i_1_ == 3)
			return ((i & 0x7fff) * i_0_ >> 14) - i_0_;
		if (i_1_ == 4)
			return anIntArray2876[i / 2607 & 0x7fff] * i_0_;
		return 0;
	}

	static {
		Random random = new Random(0L);
		for (int i = 0; i < 32768; i++)
			anIntArray2876[i] = (random.nextInt() & 0x2) - 1;
		anIntArray2871 = new int[32768];
		for (int i = 0; i < 32768; i++)
			anIntArray2871[i] = (int) (Math.sin((double) i / 5215.1903) * 16384.0);
		anIntArray2875 = new int[220500];
		anIntArray2858 = new int[5];
		anIntArray2880 = new int[5];
		anIntArray2881 = new int[5];
		anIntArray2882 = new int[5];
		anIntArray2872 = new int[5];
	}

	final void method2530(RsByteBuffer class298_sub53) {
		((Class268) this).aClass279_2877 = new Class279();
		((Class268) this).aClass279_2877.method2606(class298_sub53);
		((Class268) this).aClass279_2859 = new Class279();
		((Class268) this).aClass279_2859.method2606(class298_sub53);
		int i = class298_sub53.readUnsignedByte();
		if (i != 0) {
			class298_sub53.index -= 116413311;
			((Class268) this).aClass279_2860 = new Class279();
			((Class268) this).aClass279_2860.method2606(class298_sub53);
			((Class268) this).aClass279_2861 = new Class279();
			((Class268) this).aClass279_2861.method2606(class298_sub53);
		}
		i = class298_sub53.readUnsignedByte();
		if (i != 0) {
			class298_sub53.index -= 116413311;
			((Class268) this).aClass279_2862 = new Class279();
			((Class268) this).aClass279_2862.method2606(class298_sub53);
			((Class268) this).aClass279_2863 = new Class279();
			((Class268) this).aClass279_2863.method2606(class298_sub53);
		}
		i = class298_sub53.readUnsignedByte();
		if (i != 0) {
			class298_sub53.index -= 116413311;
			((Class268) this).aClass279_2879 = new Class279();
			((Class268) this).aClass279_2879.method2606(class298_sub53);
			((Class268) this).aClass279_2865 = new Class279();
			((Class268) this).aClass279_2865.method2606(class298_sub53);
		}
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
			int i_3_ = class298_sub53.readUnsignedSmart(1723054621);
			if (i_3_ == 0)
				break;
			((Class268) this).anIntArray2866[i_2_] = i_3_;
			((Class268) this).anIntArray2867[i_2_] = class298_sub53.method3645(590991010);
			((Class268) this).anIntArray2868[i_2_] = class298_sub53.readUnsignedSmart(1723054621);
		}
		((Class268) this).anInt2869 = class298_sub53.readUnsignedSmart(1723054621);
		((Class268) this).anInt2864 = class298_sub53.readUnsignedSmart(1723054621);
		((Class268) this).anInt2873 = class298_sub53.readUnsignedShort();
		((Class268) this).anInt2874 = class298_sub53.readUnsignedShort();
		((Class268) this).aClass286_2870 = new Class286();
		((Class268) this).aClass279_2878 = new Class279();
		((Class268) this).aClass286_2870.method2715(class298_sub53, ((Class268) this).aClass279_2878);
	}

	final int[] method2531(int i, int i_4_) {
		Class425.method5742(anIntArray2875, 0, i);
		if (i_4_ < 10)
			return anIntArray2875;
		double d = (double) i / ((double) i_4_ + 0.0);
		((Class268) this).aClass279_2877.method2608();
		((Class268) this).aClass279_2859.method2608();
		int i_5_ = 0;
		int i_6_ = 0;
		int i_7_ = 0;
		if (((Class268) this).aClass279_2860 != null) {
			((Class268) this).aClass279_2860.method2608();
			((Class268) this).aClass279_2861.method2608();
			i_5_ = (int) ((double) (((Class279) (((Class268) this).aClass279_2860)).anInt2974 - ((Class279) (((Class268) this).aClass279_2860)).anInt2973) * 32.768 / d);
			i_6_ = (int) ((double) ((Class279) ((Class268) this).aClass279_2860).anInt2973 * 32.768 / d);
		}
		int i_8_ = 0;
		int i_9_ = 0;
		int i_10_ = 0;
		if (((Class268) this).aClass279_2862 != null) {
			((Class268) this).aClass279_2862.method2608();
			((Class268) this).aClass279_2863.method2608();
			i_8_ = (int) ((double) (((Class279) (((Class268) this).aClass279_2862)).anInt2974 - ((Class279) (((Class268) this).aClass279_2862)).anInt2973) * 32.768 / d);
			i_9_ = (int) ((double) ((Class279) ((Class268) this).aClass279_2862).anInt2973 * 32.768 / d);
		}
		for (int i_11_ = 0; i_11_ < 5; i_11_++) {
			if (((Class268) this).anIntArray2866[i_11_] != 0) {
				anIntArray2858[i_11_] = 0;
				anIntArray2880[i_11_] = (int) ((double) ((Class268) this).anIntArray2868[i_11_] * d);
				anIntArray2881[i_11_] = (((Class268) this).anIntArray2866[i_11_] << 14) / 100;
				anIntArray2882[i_11_] = (int) ((double) (((Class279) (((Class268) this).aClass279_2877)).anInt2974 - (((Class279) ((Class268) this).aClass279_2877).anInt2973)) * 32.768 * Math.pow(1.0057929410678534, (double) (((Class268) this).anIntArray2867[i_11_])) / d);
				anIntArray2872[i_11_] = (int) ((double) ((Class279) (((Class268) this).aClass279_2877)).anInt2973 * 32.768 / d);
			}
		}
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			int i_13_ = ((Class268) this).aClass279_2877.method2605(i);
			int i_14_ = ((Class268) this).aClass279_2859.method2605(i);
			if (((Class268) this).aClass279_2860 != null) {
				int i_15_ = ((Class268) this).aClass279_2860.method2605(i);
				int i_16_ = ((Class268) this).aClass279_2861.method2605(i);
				i_13_ += method2529(i_7_, i_16_, (((Class279) (((Class268) this).aClass279_2860)).anInt2975)) >> 1;
				i_7_ += (i_15_ * i_5_ >> 16) + i_6_;
			}
			if (((Class268) this).aClass279_2862 != null) {
				int i_17_ = ((Class268) this).aClass279_2862.method2605(i);
				int i_18_ = ((Class268) this).aClass279_2863.method2605(i);
				i_14_ = i_14_ * ((method2529(i_10_, i_18_, (((Class279) (((Class268) this).aClass279_2862)).anInt2975)) >> 1) + 32768) >> 15;
				i_10_ += (i_17_ * i_8_ >> 16) + i_9_;
			}
			for (int i_19_ = 0; i_19_ < 5; i_19_++) {
				if (((Class268) this).anIntArray2866[i_19_] != 0) {
					int i_20_ = i_12_ + anIntArray2880[i_19_];
					if (i_20_ < i) {
						anIntArray2875[i_20_] += method2529(anIntArray2858[i_19_], i_14_ * anIntArray2881[i_19_] >> 15, (((Class279) ((Class268) this).aClass279_2877).anInt2975));
						anIntArray2858[i_19_] += ((i_13_ * anIntArray2882[i_19_] >> 16) + anIntArray2872[i_19_]);
					}
				}
			}
		}
		if (((Class268) this).aClass279_2879 != null) {
			((Class268) this).aClass279_2879.method2608();
			((Class268) this).aClass279_2865.method2608();
			int i_21_ = 0;
			boolean bool = false;
			boolean bool_22_ = true;
			for (int i_23_ = 0; i_23_ < i; i_23_++) {
				int i_24_ = ((Class268) this).aClass279_2879.method2605(i);
				int i_25_ = ((Class268) this).aClass279_2865.method2605(i);
				int i_26_;
				if (bool_22_)
					i_26_ = ((((Class279) ((Class268) this).aClass279_2879).anInt2973) + (((((Class279) ((Class268) this).aClass279_2879).anInt2974) - (((Class279) ((Class268) this).aClass279_2879).anInt2973)) * i_24_ >> 8));
				else
					i_26_ = ((((Class279) ((Class268) this).aClass279_2879).anInt2973) + (((((Class279) ((Class268) this).aClass279_2879).anInt2974) - (((Class279) ((Class268) this).aClass279_2879).anInt2973)) * i_25_ >> 8));
				i_21_ += 256;
				if (i_21_ >= i_26_) {
					i_21_ = 0;
					bool_22_ = !bool_22_;
				}
				if (bool_22_)
					anIntArray2875[i_23_] = 0;
			}
		}
		if (((Class268) this).anInt2869 > 0 && ((Class268) this).anInt2864 > 0) {
			int i_27_ = (int) ((double) ((Class268) this).anInt2869 * d);
			for (int i_28_ = i_27_; i_28_ < i; i_28_++)
				anIntArray2875[i_28_] += (anIntArray2875[i_28_ - i_27_] * ((Class268) this).anInt2864 / 100);
		}
		if (((Class286) ((Class268) this).aClass286_2870).anIntArray3088[0] > 0 || (((Class286) ((Class268) this).aClass286_2870).anIntArray3088[1] > 0)) {
			((Class268) this).aClass279_2878.method2608();
			int i_29_ = ((Class268) this).aClass279_2878.method2605(i + 1);
			int i_30_ = ((Class268) this).aClass286_2870.method2716(0, (float) i_29_ / 65536.0F);
			int i_31_ = ((Class268) this).aClass286_2870.method2716(1, (float) i_29_ / 65536.0F);
			if (i >= i_30_ + i_31_) {
				int i_32_ = 0;
				int i_33_ = i_31_;
				if (i_33_ > i - i_30_)
					i_33_ = i - i_30_;
				for (/**/; i_32_ < i_33_; i_32_++) {
					int i_34_ = (int) (((long) anIntArray2875[i_32_ + i_30_] * (long) Class286.anInt3087) >> 16);
					for (int i_35_ = 0; i_35_ < i_30_; i_35_++)
						i_34_ += (int) (((long) (anIntArray2875[i_32_ + i_30_ - 1 - i_35_]) * (long) (Class286.anIntArrayArray3090[0][i_35_])) >> 16);
					for (int i_36_ = 0; i_36_ < i_32_; i_36_++)
						i_34_ -= (int) (((long) anIntArray2875[i_32_ - 1 - i_36_] * (long) (Class286.anIntArrayArray3090[1][i_36_])) >> 16);
					anIntArray2875[i_32_] = i_34_;
					i_29_ = ((Class268) this).aClass279_2878.method2605(i + 1);
				}
				i_33_ = 128;
				for (;;) {
					if (i_33_ > i - i_30_)
						i_33_ = i - i_30_;
					for (/**/; i_32_ < i_33_; i_32_++) {
						int i_37_ = (int) (((long) anIntArray2875[i_32_ + i_30_] * (long) Class286.anInt3087) >> 16);
						for (int i_38_ = 0; i_38_ < i_30_; i_38_++)
							i_37_ += (int) (((long) (anIntArray2875[i_32_ + i_30_ - 1 - i_38_]) * (long) (Class286.anIntArrayArray3090[0][i_38_])) >> 16);
						for (int i_39_ = 0; i_39_ < i_31_; i_39_++)
							i_37_ -= (int) (((long) (anIntArray2875[i_32_ - 1 - i_39_]) * (long) (Class286.anIntArrayArray3090[1][i_39_])) >> 16);
						anIntArray2875[i_32_] = i_37_;
						i_29_ = ((Class268) this).aClass279_2878.method2605(i + 1);
					}
					if (i_32_ >= i - i_30_)
						break;
					i_30_ = ((Class268) this).aClass286_2870.method2716(0, (float) i_29_ / 65536.0F);
					i_31_ = ((Class268) this).aClass286_2870.method2716(1, (float) i_29_ / 65536.0F);
					i_33_ += 128;
				}
				for (/**/; i_32_ < i; i_32_++) {
					int i_40_ = 0;
					for (int i_41_ = i_32_ + i_30_ - i; i_41_ < i_30_; i_41_++)
						i_40_ += (int) (((long) (anIntArray2875[i_32_ + i_30_ - 1 - i_41_]) * (long) (Class286.anIntArrayArray3090[0][i_41_])) >> 16);
					for (int i_42_ = 0; i_42_ < i_31_; i_42_++)
						i_40_ -= (int) (((long) anIntArray2875[i_32_ - 1 - i_42_] * (long) (Class286.anIntArrayArray3090[1][i_42_])) >> 16);
					anIntArray2875[i_32_] = i_40_;
					i_29_ = ((Class268) this).aClass279_2878.method2605(i + 1);
				}
			}
		}
		for (int i_43_ = 0; i_43_ < i; i_43_++) {
			if (anIntArray2875[i_43_] < -32768)
				anIntArray2875[i_43_] = -32768;
			if (anIntArray2875[i_43_] > 32767)
				anIntArray2875[i_43_] = 32767;
		}
		return anIntArray2875;
	}
}
