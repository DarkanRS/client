
/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;
import java.util.Random;

public class Class248 {
	int anInt3055;
	Class342 aClass342_3056;
	Class342 aClass342_3057;
	static int[] anIntArray3058;
	Class342 aClass342_3059;
	Class342 aClass342_3060;
	Class342 aClass342_3061;
	Class342 aClass342_3062;
	int[] anIntArray3063 = { 0, 0, 0, 0, 0 };
	int[] anIntArray3064 = { 0, 0, 0, 0, 0 };
	int[] anIntArray3065 = { 0, 0, 0, 0, 0 };
	Class342 aClass342_3066;
	int anInt3067;
	Class270 aClass270_3068;
	int anInt3069 = 0;
	Class342 aClass342_3070;
	static int[] anIntArray3071;
	static int[] anIntArray3072;
	static int[] anIntArray3073 = new int[32768];
	static int[] anIntArray3074;
	static final double aDouble3075 = 1.0057929410678534;
	int anInt3076;
	static int[] anIntArray3077;
	static int[] anIntArray3078;
	Class342 aClass342_3079;
	static int[] anIntArray3080;

	static {
		Random random = new Random(0L);
		for (int i = 0; i < 32768; i++)
			anIntArray3073[i] = (random.nextInt() & 0x2) - 1;
		anIntArray3074 = new int[32768];
		for (int i = 0; i < 32768; i++)
			anIntArray3074[i] = (int) (Math.sin((double) i / 5215.1903) * 16384.0);
		anIntArray3072 = new int[220500];
		anIntArray3071 = new int[5];
		anIntArray3077 = new int[5];
		anIntArray3078 = new int[5];
		anIntArray3058 = new int[5];
		anIntArray3080 = new int[5];
	}

	final int[] method4253(int i, int i_0_) {
		Arrays.fill(anIntArray3072, 0, i, 0);
		if (i_0_ < 10)
			return anIntArray3072;
		double d = (double) i / ((double) i_0_ + 0.0);
		((Class248) this).aClass342_3066.method6078();
		((Class248) this).aClass342_3056.method6078();
		int i_1_ = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		if (((Class248) this).aClass342_3070 != null) {
			((Class248) this).aClass342_3070.method6078();
			((Class248) this).aClass342_3062.method6078();
			i_1_ = (int) ((double) (((Class342) (((Class248) this).aClass342_3070)).anInt3999 - ((Class342) (((Class248) this).aClass342_3070)).anInt4000) * 32.768 / d);
			i_2_ = (int) ((double) ((Class342) ((Class248) this).aClass342_3070).anInt4000 * 32.768 / d);
		}
		int i_4_ = 0;
		int i_5_ = 0;
		int i_6_ = 0;
		if (((Class248) this).aClass342_3059 != null) {
			((Class248) this).aClass342_3059.method6078();
			((Class248) this).aClass342_3060.method6078();
			i_4_ = (int) ((double) (((Class342) (((Class248) this).aClass342_3059)).anInt3999 - ((Class342) (((Class248) this).aClass342_3059)).anInt4000) * 32.768 / d);
			i_5_ = (int) ((double) ((Class342) ((Class248) this).aClass342_3059).anInt4000 * 32.768 / d);
		}
		for (int i_7_ = 0; i_7_ < 5; i_7_++) {
			if (((Class248) this).anIntArray3063[i_7_] != 0) {
				anIntArray3071[i_7_] = 0;
				anIntArray3077[i_7_] = (int) ((double) ((Class248) this).anIntArray3065[i_7_] * d);
				anIntArray3078[i_7_] = (((Class248) this).anIntArray3063[i_7_] << 14) / 100;
				anIntArray3058[i_7_] = (int) ((double) (((Class342) (((Class248) this).aClass342_3066)).anInt3999 - (((Class342) ((Class248) this).aClass342_3066).anInt4000)) * 32.768 * Math.pow(1.0057929410678534, (double) (((Class248) this).anIntArray3064[i_7_])) / d);
				anIntArray3080[i_7_] = (int) ((double) ((Class342) (((Class248) this).aClass342_3066)).anInt4000 * 32.768 / d);
			}
		}
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			int i_9_ = ((Class248) this).aClass342_3066.method6087(i);
			int i_10_ = ((Class248) this).aClass342_3056.method6087(i);
			if (((Class248) this).aClass342_3070 != null) {
				int i_11_ = ((Class248) this).aClass342_3070.method6087(i);
				int i_12_ = ((Class248) this).aClass342_3062.method6087(i);
				i_9_ += method4254(i_3_, i_12_, (((Class342) (((Class248) this).aClass342_3070)).anInt4002)) >> 1;
				i_3_ += (i_11_ * i_1_ >> 16) + i_2_;
			}
			if (((Class248) this).aClass342_3059 != null) {
				int i_13_ = ((Class248) this).aClass342_3059.method6087(i);
				int i_14_ = ((Class248) this).aClass342_3060.method6087(i);
				i_10_ = i_10_ * ((method4254(i_6_, i_14_, (((Class342) (((Class248) this).aClass342_3059)).anInt4002)) >> 1) + 32768) >> 15;
				i_6_ += (i_13_ * i_4_ >> 16) + i_5_;
			}
			for (int i_15_ = 0; i_15_ < 5; i_15_++) {
				if (((Class248) this).anIntArray3063[i_15_] != 0) {
					int i_16_ = i_8_ + anIntArray3077[i_15_];
					if (i_16_ < i) {
						anIntArray3072[i_16_] += method4254(anIntArray3071[i_15_], i_10_ * anIntArray3078[i_15_] >> 15, (((Class342) ((Class248) this).aClass342_3066).anInt4002));
						anIntArray3071[i_15_] += ((i_9_ * anIntArray3058[i_15_] >> 16) + anIntArray3080[i_15_]);
					}
				}
			}
		}
		if (((Class248) this).aClass342_3061 != null) {
			((Class248) this).aClass342_3061.method6078();
			((Class248) this).aClass342_3079.method6078();
			int i_17_ = 0;
			boolean bool = false;
			boolean bool_18_ = true;
			for (int i_19_ = 0; i_19_ < i; i_19_++) {
				int i_20_ = ((Class248) this).aClass342_3061.method6087(i);
				int i_21_ = ((Class248) this).aClass342_3079.method6087(i);
				int i_22_;
				if (bool_18_)
					i_22_ = ((((Class342) ((Class248) this).aClass342_3061).anInt4000) + (((((Class342) ((Class248) this).aClass342_3061).anInt3999) - (((Class342) ((Class248) this).aClass342_3061).anInt4000)) * i_20_ >> 8));
				else
					i_22_ = ((((Class342) ((Class248) this).aClass342_3061).anInt4000) + (((((Class342) ((Class248) this).aClass342_3061).anInt3999) - (((Class342) ((Class248) this).aClass342_3061).anInt4000)) * i_21_ >> 8));
				i_17_ += 256;
				if (i_17_ >= i_22_) {
					i_17_ = 0;
					bool_18_ = !bool_18_;
				}
				if (bool_18_)
					anIntArray3072[i_19_] = 0;
			}
		}
		if (((Class248) this).anInt3069 > 0 && ((Class248) this).anInt3067 > 0) {
			int i_23_ = (int) ((double) ((Class248) this).anInt3069 * d);
			for (int i_24_ = i_23_; i_24_ < i; i_24_++)
				anIntArray3072[i_24_] += (anIntArray3072[i_24_ - i_23_] * ((Class248) this).anInt3067 / 100);
		}
		if (((Class270) ((Class248) this).aClass270_3068).anIntArray3318[0] > 0 || (((Class270) ((Class248) this).aClass270_3068).anIntArray3318[1] > 0)) {
			((Class248) this).aClass342_3057.method6078();
			int i_25_ = ((Class248) this).aClass342_3057.method6087(i + 1);
			int i_26_ = ((Class248) this).aClass270_3068.method4812(0, (float) i_25_ / 65536.0F);
			int i_27_ = ((Class248) this).aClass270_3068.method4812(1, (float) i_25_ / 65536.0F);
			if (i >= i_26_ + i_27_) {
				int i_28_ = 0;
				int i_29_ = i_27_;
				if (i_29_ > i - i_26_)
					i_29_ = i - i_26_;
				for (/**/; i_28_ < i_29_; i_28_++) {
					int i_30_ = (int) (((long) anIntArray3072[i_28_ + i_26_] * (long) Class270.anInt3315) >> 16);
					for (int i_31_ = 0; i_31_ < i_26_; i_31_++)
						i_30_ += (int) (((long) (anIntArray3072[i_28_ + i_26_ - 1 - i_31_]) * (long) (Class270.anIntArrayArray3321[0][i_31_])) >> 16);
					for (int i_32_ = 0; i_32_ < i_28_; i_32_++)
						i_30_ -= (int) (((long) anIntArray3072[i_28_ - 1 - i_32_] * (long) (Class270.anIntArrayArray3321[1][i_32_])) >> 16);
					anIntArray3072[i_28_] = i_30_;
					i_25_ = ((Class248) this).aClass342_3057.method6087(i + 1);
				}
				i_29_ = 128;
				for (;;) {
					if (i_29_ > i - i_26_)
						i_29_ = i - i_26_;
					for (/**/; i_28_ < i_29_; i_28_++) {
						int i_33_ = (int) (((long) anIntArray3072[i_28_ + i_26_] * (long) Class270.anInt3315) >> 16);
						for (int i_34_ = 0; i_34_ < i_26_; i_34_++)
							i_33_ += (int) (((long) (anIntArray3072[i_28_ + i_26_ - 1 - i_34_]) * (long) (Class270.anIntArrayArray3321[0][i_34_])) >> 16);
						for (int i_35_ = 0; i_35_ < i_27_; i_35_++)
							i_33_ -= (int) (((long) (anIntArray3072[i_28_ - 1 - i_35_]) * (long) (Class270.anIntArrayArray3321[1][i_35_])) >> 16);
						anIntArray3072[i_28_] = i_33_;
						i_25_ = ((Class248) this).aClass342_3057.method6087(i + 1);
					}
					if (i_28_ >= i - i_26_)
						break;
					i_26_ = ((Class248) this).aClass270_3068.method4812(0, (float) i_25_ / 65536.0F);
					i_27_ = ((Class248) this).aClass270_3068.method4812(1, (float) i_25_ / 65536.0F);
					i_29_ += 128;
				}
				for (/**/; i_28_ < i; i_28_++) {
					int i_36_ = 0;
					for (int i_37_ = i_28_ + i_26_ - i; i_37_ < i_26_; i_37_++)
						i_36_ += (int) (((long) (anIntArray3072[i_28_ + i_26_ - 1 - i_37_]) * (long) (Class270.anIntArrayArray3321[0][i_37_])) >> 16);
					for (int i_38_ = 0; i_38_ < i_27_; i_38_++)
						i_36_ -= (int) (((long) anIntArray3072[i_28_ - 1 - i_38_] * (long) (Class270.anIntArrayArray3321[1][i_38_])) >> 16);
					anIntArray3072[i_28_] = i_36_;
					i_25_ = ((Class248) this).aClass342_3057.method6087(i + 1);
				}
			}
		}
		for (int i_39_ = 0; i_39_ < i; i_39_++) {
			if (anIntArray3072[i_39_] < -32768)
				anIntArray3072[i_39_] = -32768;
			if (anIntArray3072[i_39_] > 32767)
				anIntArray3072[i_39_] = 32767;
		}
		return anIntArray3072;
	}

	final int method4254(int i, int i_40_, int i_41_) {
		if (i_41_ == 1) {
			if ((i & 0x7fff) < 16384)
				return i_40_;
			return -i_40_;
		}
		if (i_41_ == 2)
			return anIntArray3074[i & 0x7fff] * i_40_ >> 14;
		if (i_41_ == 3)
			return ((i & 0x7fff) * i_40_ >> 14) - i_40_;
		if (i_41_ == 4)
			return anIntArray3073[i / 2607 & 0x7fff] * i_40_;
		return 0;
	}

	final void method4255(RsByteBuffer class282_sub35) {
		((Class248) this).aClass342_3066 = new Class342();
		((Class248) this).aClass342_3066.method6076(class282_sub35);
		((Class248) this).aClass342_3056 = new Class342();
		((Class248) this).aClass342_3056.method6076(class282_sub35);
		int i = class282_sub35.readUnsignedByte();
		if (i != 0) {
			class282_sub35.index -= -1115476867;
			((Class248) this).aClass342_3070 = new Class342();
			((Class248) this).aClass342_3070.method6076(class282_sub35);
			((Class248) this).aClass342_3062 = new Class342();
			((Class248) this).aClass342_3062.method6076(class282_sub35);
		}
		i = class282_sub35.readUnsignedByte();
		if (i != 0) {
			class282_sub35.index -= -1115476867;
			((Class248) this).aClass342_3059 = new Class342();
			((Class248) this).aClass342_3059.method6076(class282_sub35);
			((Class248) this).aClass342_3060 = new Class342();
			((Class248) this).aClass342_3060.method6076(class282_sub35);
		}
		i = class282_sub35.readUnsignedByte();
		if (i != 0) {
			class282_sub35.index -= -1115476867;
			((Class248) this).aClass342_3061 = new Class342();
			((Class248) this).aClass342_3061.method6076(class282_sub35);
			((Class248) this).aClass342_3079 = new Class342();
			((Class248) this).aClass342_3079.method6076(class282_sub35);
		}
		for (int i_42_ = 0; i_42_ < 10; i_42_++) {
			int i_43_ = class282_sub35.readUnsignedSmart(1540376060);
			if (i_43_ == 0)
				break;
			((Class248) this).anIntArray3063[i_42_] = i_43_;
			((Class248) this).anIntArray3064[i_42_] = class282_sub35.method13094(1923263479);
			((Class248) this).anIntArray3065[i_42_] = class282_sub35.readUnsignedSmart(1861176061);
		}
		((Class248) this).anInt3069 = class282_sub35.readUnsignedSmart(1985177971);
		((Class248) this).anInt3067 = class282_sub35.readUnsignedSmart(1862978797);
		((Class248) this).anInt3055 = class282_sub35.readUnsignedShort();
		((Class248) this).anInt3076 = class282_sub35.readUnsignedShort();
		((Class248) this).aClass270_3068 = new Class270();
		((Class248) this).aClass342_3057 = new Class342();
		((Class248) this).aClass270_3068.method4807(class282_sub35, ((Class248) this).aClass342_3057);
	}

	final int[] method4256(int i, int i_44_) {
		Arrays.fill(anIntArray3072, 0, i, 0);
		if (i_44_ < 10)
			return anIntArray3072;
		double d = (double) i / ((double) i_44_ + 0.0);
		((Class248) this).aClass342_3066.method6078();
		((Class248) this).aClass342_3056.method6078();
		int i_45_ = 0;
		int i_46_ = 0;
		int i_47_ = 0;
		if (((Class248) this).aClass342_3070 != null) {
			((Class248) this).aClass342_3070.method6078();
			((Class248) this).aClass342_3062.method6078();
			i_45_ = (int) ((double) (((Class342) ((Class248) this).aClass342_3070).anInt3999 - ((Class342) (((Class248) this).aClass342_3070)).anInt4000) * 32.768 / d);
			i_46_ = (int) ((double) ((Class342) (((Class248) this).aClass342_3070)).anInt4000 * 32.768 / d);
		}
		int i_48_ = 0;
		int i_49_ = 0;
		int i_50_ = 0;
		if (((Class248) this).aClass342_3059 != null) {
			((Class248) this).aClass342_3059.method6078();
			((Class248) this).aClass342_3060.method6078();
			i_48_ = (int) ((double) (((Class342) ((Class248) this).aClass342_3059).anInt3999 - ((Class342) (((Class248) this).aClass342_3059)).anInt4000) * 32.768 / d);
			i_49_ = (int) ((double) ((Class342) (((Class248) this).aClass342_3059)).anInt4000 * 32.768 / d);
		}
		for (int i_51_ = 0; i_51_ < 5; i_51_++) {
			if (((Class248) this).anIntArray3063[i_51_] != 0) {
				anIntArray3071[i_51_] = 0;
				anIntArray3077[i_51_] = (int) ((double) ((Class248) this).anIntArray3065[i_51_] * d);
				anIntArray3078[i_51_] = (((Class248) this).anIntArray3063[i_51_] << 14) / 100;
				anIntArray3058[i_51_] = (int) ((double) (((Class342) (((Class248) this).aClass342_3066)).anInt3999 - (((Class342) ((Class248) this).aClass342_3066).anInt4000)) * 32.768 * Math.pow(1.0057929410678534, (double) (((Class248) this).anIntArray3064[i_51_])) / d);
				anIntArray3080[i_51_] = (int) ((double) ((Class342) (((Class248) this).aClass342_3066)).anInt4000 * 32.768 / d);
			}
		}
		for (int i_52_ = 0; i_52_ < i; i_52_++) {
			int i_53_ = ((Class248) this).aClass342_3066.method6087(i);
			int i_54_ = ((Class248) this).aClass342_3056.method6087(i);
			if (((Class248) this).aClass342_3070 != null) {
				int i_55_ = ((Class248) this).aClass342_3070.method6087(i);
				int i_56_ = ((Class248) this).aClass342_3062.method6087(i);
				i_53_ += method4254(i_47_, i_56_, (((Class342) (((Class248) this).aClass342_3070)).anInt4002)) >> 1;
				i_47_ += (i_55_ * i_45_ >> 16) + i_46_;
			}
			if (((Class248) this).aClass342_3059 != null) {
				int i_57_ = ((Class248) this).aClass342_3059.method6087(i);
				int i_58_ = ((Class248) this).aClass342_3060.method6087(i);
				i_54_ = i_54_ * ((method4254(i_50_, i_58_, (((Class342) (((Class248) this).aClass342_3059)).anInt4002)) >> 1) + 32768) >> 15;
				i_50_ += (i_57_ * i_48_ >> 16) + i_49_;
			}
			for (int i_59_ = 0; i_59_ < 5; i_59_++) {
				if (((Class248) this).anIntArray3063[i_59_] != 0) {
					int i_60_ = i_52_ + anIntArray3077[i_59_];
					if (i_60_ < i) {
						anIntArray3072[i_60_] += method4254(anIntArray3071[i_59_], i_54_ * anIntArray3078[i_59_] >> 15, (((Class342) ((Class248) this).aClass342_3066).anInt4002));
						anIntArray3071[i_59_] += ((i_53_ * anIntArray3058[i_59_] >> 16) + anIntArray3080[i_59_]);
					}
				}
			}
		}
		if (((Class248) this).aClass342_3061 != null) {
			((Class248) this).aClass342_3061.method6078();
			((Class248) this).aClass342_3079.method6078();
			int i_61_ = 0;
			boolean bool = false;
			boolean bool_62_ = true;
			for (int i_63_ = 0; i_63_ < i; i_63_++) {
				int i_64_ = ((Class248) this).aClass342_3061.method6087(i);
				int i_65_ = ((Class248) this).aClass342_3079.method6087(i);
				int i_66_;
				if (bool_62_)
					i_66_ = ((((Class342) ((Class248) this).aClass342_3061).anInt4000) + (((((Class342) ((Class248) this).aClass342_3061).anInt3999) - (((Class342) ((Class248) this).aClass342_3061).anInt4000)) * i_64_ >> 8));
				else
					i_66_ = ((((Class342) ((Class248) this).aClass342_3061).anInt4000) + (((((Class342) ((Class248) this).aClass342_3061).anInt3999) - (((Class342) ((Class248) this).aClass342_3061).anInt4000)) * i_65_ >> 8));
				i_61_ += 256;
				if (i_61_ >= i_66_) {
					i_61_ = 0;
					bool_62_ = !bool_62_;
				}
				if (bool_62_)
					anIntArray3072[i_63_] = 0;
			}
		}
		if (((Class248) this).anInt3069 > 0 && ((Class248) this).anInt3067 > 0) {
			int i_67_ = (int) ((double) ((Class248) this).anInt3069 * d);
			for (int i_68_ = i_67_; i_68_ < i; i_68_++)
				anIntArray3072[i_68_] += (anIntArray3072[i_68_ - i_67_] * ((Class248) this).anInt3067 / 100);
		}
		if (((Class270) ((Class248) this).aClass270_3068).anIntArray3318[0] > 0 || (((Class270) ((Class248) this).aClass270_3068).anIntArray3318[1] > 0)) {
			((Class248) this).aClass342_3057.method6078();
			int i_69_ = ((Class248) this).aClass342_3057.method6087(i + 1);
			int i_70_ = ((Class248) this).aClass270_3068.method4812(0, (float) i_69_ / 65536.0F);
			int i_71_ = ((Class248) this).aClass270_3068.method4812(1, (float) i_69_ / 65536.0F);
			if (i >= i_70_ + i_71_) {
				int i_72_ = 0;
				int i_73_ = i_71_;
				if (i_73_ > i - i_70_)
					i_73_ = i - i_70_;
				for (/**/; i_72_ < i_73_; i_72_++) {
					int i_74_ = (int) (((long) anIntArray3072[i_72_ + i_70_] * (long) Class270.anInt3315) >> 16);
					for (int i_75_ = 0; i_75_ < i_70_; i_75_++)
						i_74_ += (int) (((long) (anIntArray3072[i_72_ + i_70_ - 1 - i_75_]) * (long) (Class270.anIntArrayArray3321[0][i_75_])) >> 16);
					for (int i_76_ = 0; i_76_ < i_72_; i_76_++)
						i_74_ -= (int) (((long) anIntArray3072[i_72_ - 1 - i_76_] * (long) (Class270.anIntArrayArray3321[1][i_76_])) >> 16);
					anIntArray3072[i_72_] = i_74_;
					i_69_ = ((Class248) this).aClass342_3057.method6087(i + 1);
				}
				i_73_ = 128;
				for (;;) {
					if (i_73_ > i - i_70_)
						i_73_ = i - i_70_;
					for (/**/; i_72_ < i_73_; i_72_++) {
						int i_77_ = (int) (((long) anIntArray3072[i_72_ + i_70_] * (long) Class270.anInt3315) >> 16);
						for (int i_78_ = 0; i_78_ < i_70_; i_78_++)
							i_77_ += (int) (((long) (anIntArray3072[i_72_ + i_70_ - 1 - i_78_]) * (long) (Class270.anIntArrayArray3321[0][i_78_])) >> 16);
						for (int i_79_ = 0; i_79_ < i_71_; i_79_++)
							i_77_ -= (int) (((long) (anIntArray3072[i_72_ - 1 - i_79_]) * (long) (Class270.anIntArrayArray3321[1][i_79_])) >> 16);
						anIntArray3072[i_72_] = i_77_;
						i_69_ = ((Class248) this).aClass342_3057.method6087(i + 1);
					}
					if (i_72_ >= i - i_70_)
						break;
					i_70_ = ((Class248) this).aClass270_3068.method4812(0, (float) i_69_ / 65536.0F);
					i_71_ = ((Class248) this).aClass270_3068.method4812(1, (float) i_69_ / 65536.0F);
					i_73_ += 128;
				}
				for (/**/; i_72_ < i; i_72_++) {
					int i_80_ = 0;
					for (int i_81_ = i_72_ + i_70_ - i; i_81_ < i_70_; i_81_++)
						i_80_ += (int) (((long) (anIntArray3072[i_72_ + i_70_ - 1 - i_81_]) * (long) (Class270.anIntArrayArray3321[0][i_81_])) >> 16);
					for (int i_82_ = 0; i_82_ < i_71_; i_82_++)
						i_80_ -= (int) (((long) anIntArray3072[i_72_ - 1 - i_82_] * (long) (Class270.anIntArrayArray3321[1][i_82_])) >> 16);
					anIntArray3072[i_72_] = i_80_;
					i_69_ = ((Class248) this).aClass342_3057.method6087(i + 1);
				}
			}
		}
		for (int i_83_ = 0; i_83_ < i; i_83_++) {
			if (anIntArray3072[i_83_] < -32768)
				anIntArray3072[i_83_] = -32768;
			if (anIntArray3072[i_83_] > 32767)
				anIntArray3072[i_83_] = 32767;
		}
		return anIntArray3072;
	}

	final int[] method4257(int i, int i_84_) {
		Arrays.fill(anIntArray3072, 0, i, 0);
		if (i_84_ < 10)
			return anIntArray3072;
		double d = (double) i / ((double) i_84_ + 0.0);
		((Class248) this).aClass342_3066.method6078();
		((Class248) this).aClass342_3056.method6078();
		int i_85_ = 0;
		int i_86_ = 0;
		int i_87_ = 0;
		if (((Class248) this).aClass342_3070 != null) {
			((Class248) this).aClass342_3070.method6078();
			((Class248) this).aClass342_3062.method6078();
			i_85_ = (int) ((double) (((Class342) ((Class248) this).aClass342_3070).anInt3999 - ((Class342) (((Class248) this).aClass342_3070)).anInt4000) * 32.768 / d);
			i_86_ = (int) ((double) ((Class342) (((Class248) this).aClass342_3070)).anInt4000 * 32.768 / d);
		}
		int i_88_ = 0;
		int i_89_ = 0;
		int i_90_ = 0;
		if (((Class248) this).aClass342_3059 != null) {
			((Class248) this).aClass342_3059.method6078();
			((Class248) this).aClass342_3060.method6078();
			i_88_ = (int) ((double) (((Class342) ((Class248) this).aClass342_3059).anInt3999 - ((Class342) (((Class248) this).aClass342_3059)).anInt4000) * 32.768 / d);
			i_89_ = (int) ((double) ((Class342) (((Class248) this).aClass342_3059)).anInt4000 * 32.768 / d);
		}
		for (int i_91_ = 0; i_91_ < 5; i_91_++) {
			if (((Class248) this).anIntArray3063[i_91_] != 0) {
				anIntArray3071[i_91_] = 0;
				anIntArray3077[i_91_] = (int) ((double) ((Class248) this).anIntArray3065[i_91_] * d);
				anIntArray3078[i_91_] = (((Class248) this).anIntArray3063[i_91_] << 14) / 100;
				anIntArray3058[i_91_] = (int) ((double) (((Class342) (((Class248) this).aClass342_3066)).anInt3999 - (((Class342) ((Class248) this).aClass342_3066).anInt4000)) * 32.768 * Math.pow(1.0057929410678534, (double) (((Class248) this).anIntArray3064[i_91_])) / d);
				anIntArray3080[i_91_] = (int) ((double) ((Class342) (((Class248) this).aClass342_3066)).anInt4000 * 32.768 / d);
			}
		}
		for (int i_92_ = 0; i_92_ < i; i_92_++) {
			int i_93_ = ((Class248) this).aClass342_3066.method6087(i);
			int i_94_ = ((Class248) this).aClass342_3056.method6087(i);
			if (((Class248) this).aClass342_3070 != null) {
				int i_95_ = ((Class248) this).aClass342_3070.method6087(i);
				int i_96_ = ((Class248) this).aClass342_3062.method6087(i);
				i_93_ += method4254(i_87_, i_96_, (((Class342) (((Class248) this).aClass342_3070)).anInt4002)) >> 1;
				i_87_ += (i_95_ * i_85_ >> 16) + i_86_;
			}
			if (((Class248) this).aClass342_3059 != null) {
				int i_97_ = ((Class248) this).aClass342_3059.method6087(i);
				int i_98_ = ((Class248) this).aClass342_3060.method6087(i);
				i_94_ = i_94_ * ((method4254(i_90_, i_98_, (((Class342) (((Class248) this).aClass342_3059)).anInt4002)) >> 1) + 32768) >> 15;
				i_90_ += (i_97_ * i_88_ >> 16) + i_89_;
			}
			for (int i_99_ = 0; i_99_ < 5; i_99_++) {
				if (((Class248) this).anIntArray3063[i_99_] != 0) {
					int i_100_ = i_92_ + anIntArray3077[i_99_];
					if (i_100_ < i) {
						anIntArray3072[i_100_] += method4254(anIntArray3071[i_99_], i_94_ * anIntArray3078[i_99_] >> 15, (((Class342) ((Class248) this).aClass342_3066).anInt4002));
						anIntArray3071[i_99_] += ((i_93_ * anIntArray3058[i_99_] >> 16) + anIntArray3080[i_99_]);
					}
				}
			}
		}
		if (((Class248) this).aClass342_3061 != null) {
			((Class248) this).aClass342_3061.method6078();
			((Class248) this).aClass342_3079.method6078();
			int i_101_ = 0;
			boolean bool = false;
			boolean bool_102_ = true;
			for (int i_103_ = 0; i_103_ < i; i_103_++) {
				int i_104_ = ((Class248) this).aClass342_3061.method6087(i);
				int i_105_ = ((Class248) this).aClass342_3079.method6087(i);
				int i_106_;
				if (bool_102_)
					i_106_ = ((((Class342) ((Class248) this).aClass342_3061).anInt4000) + (((((Class342) ((Class248) this).aClass342_3061).anInt3999) - (((Class342) ((Class248) this).aClass342_3061).anInt4000)) * i_104_ >> 8));
				else
					i_106_ = ((((Class342) ((Class248) this).aClass342_3061).anInt4000) + (((((Class342) ((Class248) this).aClass342_3061).anInt3999) - (((Class342) ((Class248) this).aClass342_3061).anInt4000)) * i_105_ >> 8));
				i_101_ += 256;
				if (i_101_ >= i_106_) {
					i_101_ = 0;
					bool_102_ = !bool_102_;
				}
				if (bool_102_)
					anIntArray3072[i_103_] = 0;
			}
		}
		if (((Class248) this).anInt3069 > 0 && ((Class248) this).anInt3067 > 0) {
			int i_107_ = (int) ((double) ((Class248) this).anInt3069 * d);
			for (int i_108_ = i_107_; i_108_ < i; i_108_++)
				anIntArray3072[i_108_] += (anIntArray3072[i_108_ - i_107_] * ((Class248) this).anInt3067 / 100);
		}
		if (((Class270) ((Class248) this).aClass270_3068).anIntArray3318[0] > 0 || (((Class270) ((Class248) this).aClass270_3068).anIntArray3318[1] > 0)) {
			((Class248) this).aClass342_3057.method6078();
			int i_109_ = ((Class248) this).aClass342_3057.method6087(i + 1);
			int i_110_ = ((Class248) this).aClass270_3068.method4812(0, (float) i_109_ / 65536.0F);
			int i_111_ = ((Class248) this).aClass270_3068.method4812(1, (float) i_109_ / 65536.0F);
			if (i >= i_110_ + i_111_) {
				int i_112_ = 0;
				int i_113_ = i_111_;
				if (i_113_ > i - i_110_)
					i_113_ = i - i_110_;
				for (/**/; i_112_ < i_113_; i_112_++) {
					int i_114_ = (int) (((long) anIntArray3072[i_112_ + i_110_] * (long) Class270.anInt3315) >> 16);
					for (int i_115_ = 0; i_115_ < i_110_; i_115_++)
						i_114_ += (int) (((long) (anIntArray3072[i_112_ + i_110_ - 1 - i_115_]) * (long) (Class270.anIntArrayArray3321[0][i_115_])) >> 16);
					for (int i_116_ = 0; i_116_ < i_112_; i_116_++)
						i_114_ -= (int) (((long) (anIntArray3072[i_112_ - 1 - i_116_]) * (long) (Class270.anIntArrayArray3321[1][i_116_])) >> 16);
					anIntArray3072[i_112_] = i_114_;
					i_109_ = ((Class248) this).aClass342_3057.method6087(i + 1);
				}
				i_113_ = 128;
				for (;;) {
					if (i_113_ > i - i_110_)
						i_113_ = i - i_110_;
					for (/**/; i_112_ < i_113_; i_112_++) {
						int i_117_ = (int) (((long) anIntArray3072[i_112_ + i_110_] * (long) Class270.anInt3315) >> 16);
						for (int i_118_ = 0; i_118_ < i_110_; i_118_++)
							i_117_ += (int) (((long) anIntArray3072[(i_112_ + i_110_ - 1 - i_118_)] * (long) (Class270.anIntArrayArray3321[0][i_118_])) >> 16);
						for (int i_119_ = 0; i_119_ < i_111_; i_119_++)
							i_117_ -= (int) (((long) (anIntArray3072[i_112_ - 1 - i_119_]) * (long) (Class270.anIntArrayArray3321[1][i_119_])) >> 16);
						anIntArray3072[i_112_] = i_117_;
						i_109_ = ((Class248) this).aClass342_3057.method6087(i + 1);
					}
					if (i_112_ >= i - i_110_)
						break;
					i_110_ = ((Class248) this).aClass270_3068.method4812(0, (float) i_109_ / 65536.0F);
					i_111_ = ((Class248) this).aClass270_3068.method4812(1, (float) i_109_ / 65536.0F);
					i_113_ += 128;
				}
				for (/**/; i_112_ < i; i_112_++) {
					int i_120_ = 0;
					for (int i_121_ = i_112_ + i_110_ - i; i_121_ < i_110_; i_121_++)
						i_120_ += (int) (((long) (anIntArray3072[i_112_ + i_110_ - 1 - i_121_]) * (long) (Class270.anIntArrayArray3321[0][i_121_])) >> 16);
					for (int i_122_ = 0; i_122_ < i_111_; i_122_++)
						i_120_ -= (int) (((long) (anIntArray3072[i_112_ - 1 - i_122_]) * (long) (Class270.anIntArrayArray3321[1][i_122_])) >> 16);
					anIntArray3072[i_112_] = i_120_;
					i_109_ = ((Class248) this).aClass342_3057.method6087(i + 1);
				}
			}
		}
		for (int i_123_ = 0; i_123_ < i; i_123_++) {
			if (anIntArray3072[i_123_] < -32768)
				anIntArray3072[i_123_] = -32768;
			if (anIntArray3072[i_123_] > 32767)
				anIntArray3072[i_123_] = 32767;
		}
		return anIntArray3072;
	}

	final int method4258(int i, int i_124_, int i_125_) {
		if (i_125_ == 1) {
			if ((i & 0x7fff) < 16384)
				return i_124_;
			return -i_124_;
		}
		if (i_125_ == 2)
			return anIntArray3074[i & 0x7fff] * i_124_ >> 14;
		if (i_125_ == 3)
			return ((i & 0x7fff) * i_124_ >> 14) - i_124_;
		if (i_125_ == 4)
			return anIntArray3073[i / 2607 & 0x7fff] * i_124_;
		return 0;
	}

	final int method4259(int i, int i_126_, int i_127_) {
		if (i_127_ == 1) {
			if ((i & 0x7fff) < 16384)
				return i_126_;
			return -i_126_;
		}
		if (i_127_ == 2)
			return anIntArray3074[i & 0x7fff] * i_126_ >> 14;
		if (i_127_ == 3)
			return ((i & 0x7fff) * i_126_ >> 14) - i_126_;
		if (i_127_ == 4)
			return anIntArray3073[i / 2607 & 0x7fff] * i_126_;
		return 0;
	}

	final int[] method4260(int i, int i_128_) {
		Arrays.fill(anIntArray3072, 0, i, 0);
		if (i_128_ < 10)
			return anIntArray3072;
		double d = (double) i / ((double) i_128_ + 0.0);
		((Class248) this).aClass342_3066.method6078();
		((Class248) this).aClass342_3056.method6078();
		int i_129_ = 0;
		int i_130_ = 0;
		int i_131_ = 0;
		if (((Class248) this).aClass342_3070 != null) {
			((Class248) this).aClass342_3070.method6078();
			((Class248) this).aClass342_3062.method6078();
			i_129_ = (int) ((double) (((Class342) ((Class248) this).aClass342_3070).anInt3999 - ((Class342) (((Class248) this).aClass342_3070)).anInt4000) * 32.768 / d);
			i_130_ = (int) ((double) ((Class342) (((Class248) this).aClass342_3070)).anInt4000 * 32.768 / d);
		}
		int i_132_ = 0;
		int i_133_ = 0;
		int i_134_ = 0;
		if (((Class248) this).aClass342_3059 != null) {
			((Class248) this).aClass342_3059.method6078();
			((Class248) this).aClass342_3060.method6078();
			i_132_ = (int) ((double) (((Class342) ((Class248) this).aClass342_3059).anInt3999 - ((Class342) (((Class248) this).aClass342_3059)).anInt4000) * 32.768 / d);
			i_133_ = (int) ((double) ((Class342) (((Class248) this).aClass342_3059)).anInt4000 * 32.768 / d);
		}
		for (int i_135_ = 0; i_135_ < 5; i_135_++) {
			if (((Class248) this).anIntArray3063[i_135_] != 0) {
				anIntArray3071[i_135_] = 0;
				anIntArray3077[i_135_] = (int) ((double) ((Class248) this).anIntArray3065[i_135_] * d);
				anIntArray3078[i_135_] = (((Class248) this).anIntArray3063[i_135_] << 14) / 100;
				anIntArray3058[i_135_] = (int) ((double) (((Class342) (((Class248) this).aClass342_3066)).anInt3999 - (((Class342) ((Class248) this).aClass342_3066).anInt4000)) * 32.768 * Math.pow(1.0057929410678534, (double) (((Class248) this).anIntArray3064[i_135_])) / d);
				anIntArray3080[i_135_] = (int) ((double) ((Class342) (((Class248) this).aClass342_3066)).anInt4000 * 32.768 / d);
			}
		}
		for (int i_136_ = 0; i_136_ < i; i_136_++) {
			int i_137_ = ((Class248) this).aClass342_3066.method6087(i);
			int i_138_ = ((Class248) this).aClass342_3056.method6087(i);
			if (((Class248) this).aClass342_3070 != null) {
				int i_139_ = ((Class248) this).aClass342_3070.method6087(i);
				int i_140_ = ((Class248) this).aClass342_3062.method6087(i);
				i_137_ += (method4254(i_131_, i_140_, ((Class342) (((Class248) this).aClass342_3070)).anInt4002) >> 1);
				i_131_ += (i_139_ * i_129_ >> 16) + i_130_;
			}
			if (((Class248) this).aClass342_3059 != null) {
				int i_141_ = ((Class248) this).aClass342_3059.method6087(i);
				int i_142_ = ((Class248) this).aClass342_3060.method6087(i);
				i_138_ = i_138_ * ((method4254(i_134_, i_142_, (((Class342) (((Class248) this).aClass342_3059)).anInt4002)) >> 1) + 32768) >> 15;
				i_134_ += (i_141_ * i_132_ >> 16) + i_133_;
			}
			for (int i_143_ = 0; i_143_ < 5; i_143_++) {
				if (((Class248) this).anIntArray3063[i_143_] != 0) {
					int i_144_ = i_136_ + anIntArray3077[i_143_];
					if (i_144_ < i) {
						anIntArray3072[i_144_] += method4254(anIntArray3071[i_143_], (i_138_ * anIntArray3078[i_143_] >> 15), (((Class342) ((Class248) this).aClass342_3066).anInt4002));
						anIntArray3071[i_143_] += ((i_137_ * anIntArray3058[i_143_] >> 16) + anIntArray3080[i_143_]);
					}
				}
			}
		}
		if (((Class248) this).aClass342_3061 != null) {
			((Class248) this).aClass342_3061.method6078();
			((Class248) this).aClass342_3079.method6078();
			int i_145_ = 0;
			boolean bool = false;
			boolean bool_146_ = true;
			for (int i_147_ = 0; i_147_ < i; i_147_++) {
				int i_148_ = ((Class248) this).aClass342_3061.method6087(i);
				int i_149_ = ((Class248) this).aClass342_3079.method6087(i);
				int i_150_;
				if (bool_146_)
					i_150_ = ((((Class342) ((Class248) this).aClass342_3061).anInt4000) + (((((Class342) ((Class248) this).aClass342_3061).anInt3999) - (((Class342) ((Class248) this).aClass342_3061).anInt4000)) * i_148_ >> 8));
				else
					i_150_ = ((((Class342) ((Class248) this).aClass342_3061).anInt4000) + (((((Class342) ((Class248) this).aClass342_3061).anInt3999) - (((Class342) ((Class248) this).aClass342_3061).anInt4000)) * i_149_ >> 8));
				i_145_ += 256;
				if (i_145_ >= i_150_) {
					i_145_ = 0;
					bool_146_ = !bool_146_;
				}
				if (bool_146_)
					anIntArray3072[i_147_] = 0;
			}
		}
		if (((Class248) this).anInt3069 > 0 && ((Class248) this).anInt3067 > 0) {
			int i_151_ = (int) ((double) ((Class248) this).anInt3069 * d);
			for (int i_152_ = i_151_; i_152_ < i; i_152_++)
				anIntArray3072[i_152_] += (anIntArray3072[i_152_ - i_151_] * ((Class248) this).anInt3067 / 100);
		}
		if (((Class270) ((Class248) this).aClass270_3068).anIntArray3318[0] > 0 || (((Class270) ((Class248) this).aClass270_3068).anIntArray3318[1] > 0)) {
			((Class248) this).aClass342_3057.method6078();
			int i_153_ = ((Class248) this).aClass342_3057.method6087(i + 1);
			int i_154_ = ((Class248) this).aClass270_3068.method4812(0, (float) i_153_ / 65536.0F);
			int i_155_ = ((Class248) this).aClass270_3068.method4812(1, (float) i_153_ / 65536.0F);
			if (i >= i_154_ + i_155_) {
				int i_156_ = 0;
				int i_157_ = i_155_;
				if (i_157_ > i - i_154_)
					i_157_ = i - i_154_;
				for (/**/; i_156_ < i_157_; i_156_++) {
					int i_158_ = (int) (((long) anIntArray3072[i_156_ + i_154_] * (long) Class270.anInt3315) >> 16);
					for (int i_159_ = 0; i_159_ < i_154_; i_159_++)
						i_158_ += (int) (((long) (anIntArray3072[i_156_ + i_154_ - 1 - i_159_]) * (long) (Class270.anIntArrayArray3321[0][i_159_])) >> 16);
					for (int i_160_ = 0; i_160_ < i_156_; i_160_++)
						i_158_ -= (int) (((long) (anIntArray3072[i_156_ - 1 - i_160_]) * (long) (Class270.anIntArrayArray3321[1][i_160_])) >> 16);
					anIntArray3072[i_156_] = i_158_;
					i_153_ = ((Class248) this).aClass342_3057.method6087(i + 1);
				}
				i_157_ = 128;
				for (;;) {
					if (i_157_ > i - i_154_)
						i_157_ = i - i_154_;
					for (/**/; i_156_ < i_157_; i_156_++) {
						int i_161_ = (int) (((long) anIntArray3072[i_156_ + i_154_] * (long) Class270.anInt3315) >> 16);
						for (int i_162_ = 0; i_162_ < i_154_; i_162_++)
							i_161_ += (int) (((long) anIntArray3072[(i_156_ + i_154_ - 1 - i_162_)] * (long) (Class270.anIntArrayArray3321[0][i_162_])) >> 16);
						for (int i_163_ = 0; i_163_ < i_155_; i_163_++)
							i_161_ -= (int) (((long) (anIntArray3072[i_156_ - 1 - i_163_]) * (long) (Class270.anIntArrayArray3321[1][i_163_])) >> 16);
						anIntArray3072[i_156_] = i_161_;
						i_153_ = ((Class248) this).aClass342_3057.method6087(i + 1);
					}
					if (i_156_ >= i - i_154_)
						break;
					i_154_ = ((Class248) this).aClass270_3068.method4812(0, (float) i_153_ / 65536.0F);
					i_155_ = ((Class248) this).aClass270_3068.method4812(1, (float) i_153_ / 65536.0F);
					i_157_ += 128;
				}
				for (/**/; i_156_ < i; i_156_++) {
					int i_164_ = 0;
					for (int i_165_ = i_156_ + i_154_ - i; i_165_ < i_154_; i_165_++)
						i_164_ += (int) (((long) (anIntArray3072[i_156_ + i_154_ - 1 - i_165_]) * (long) (Class270.anIntArrayArray3321[0][i_165_])) >> 16);
					for (int i_166_ = 0; i_166_ < i_155_; i_166_++)
						i_164_ -= (int) (((long) (anIntArray3072[i_156_ - 1 - i_166_]) * (long) (Class270.anIntArrayArray3321[1][i_166_])) >> 16);
					anIntArray3072[i_156_] = i_164_;
					i_153_ = ((Class248) this).aClass342_3057.method6087(i + 1);
				}
			}
		}
		for (int i_167_ = 0; i_167_ < i; i_167_++) {
			if (anIntArray3072[i_167_] < -32768)
				anIntArray3072[i_167_] = -32768;
			if (anIntArray3072[i_167_] > 32767)
				anIntArray3072[i_167_] = 32767;
		}
		return anIntArray3072;
	}

	final void method4261(RsByteBuffer class282_sub35) {
		((Class248) this).aClass342_3066 = new Class342();
		((Class248) this).aClass342_3066.method6076(class282_sub35);
		((Class248) this).aClass342_3056 = new Class342();
		((Class248) this).aClass342_3056.method6076(class282_sub35);
		int i = class282_sub35.readUnsignedByte();
		if (i != 0) {
			class282_sub35.index -= -1115476867;
			((Class248) this).aClass342_3070 = new Class342();
			((Class248) this).aClass342_3070.method6076(class282_sub35);
			((Class248) this).aClass342_3062 = new Class342();
			((Class248) this).aClass342_3062.method6076(class282_sub35);
		}
		i = class282_sub35.readUnsignedByte();
		if (i != 0) {
			class282_sub35.index -= -1115476867;
			((Class248) this).aClass342_3059 = new Class342();
			((Class248) this).aClass342_3059.method6076(class282_sub35);
			((Class248) this).aClass342_3060 = new Class342();
			((Class248) this).aClass342_3060.method6076(class282_sub35);
		}
		i = class282_sub35.readUnsignedByte();
		if (i != 0) {
			class282_sub35.index -= -1115476867;
			((Class248) this).aClass342_3061 = new Class342();
			((Class248) this).aClass342_3061.method6076(class282_sub35);
			((Class248) this).aClass342_3079 = new Class342();
			((Class248) this).aClass342_3079.method6076(class282_sub35);
		}
		for (int i_168_ = 0; i_168_ < 10; i_168_++) {
			int i_169_ = class282_sub35.readUnsignedSmart(1728361317);
			if (i_169_ == 0)
				break;
			((Class248) this).anIntArray3063[i_168_] = i_169_;
			((Class248) this).anIntArray3064[i_168_] = class282_sub35.method13094(-157137857);
			((Class248) this).anIntArray3065[i_168_] = class282_sub35.readUnsignedSmart(1992290366);
		}
		((Class248) this).anInt3069 = class282_sub35.readUnsignedSmart(1986669707);
		((Class248) this).anInt3067 = class282_sub35.readUnsignedSmart(1585987072);
		((Class248) this).anInt3055 = class282_sub35.readUnsignedShort();
		((Class248) this).anInt3076 = class282_sub35.readUnsignedShort();
		((Class248) this).aClass270_3068 = new Class270();
		((Class248) this).aClass342_3057 = new Class342();
		((Class248) this).aClass270_3068.method4807(class282_sub35, ((Class248) this).aClass342_3057);
	}

	final int method4262(int i, int i_170_, int i_171_) {
		if (i_171_ == 1) {
			if ((i & 0x7fff) < 16384)
				return i_170_;
			return -i_170_;
		}
		if (i_171_ == 2)
			return anIntArray3074[i & 0x7fff] * i_170_ >> 14;
		if (i_171_ == 3)
			return ((i & 0x7fff) * i_170_ >> 14) - i_170_;
		if (i_171_ == 4)
			return anIntArray3073[i / 2607 & 0x7fff] * i_170_;
		return 0;
	}

	final int method4263(int i, int i_172_, int i_173_) {
		if (i_173_ == 1) {
			if ((i & 0x7fff) < 16384)
				return i_172_;
			return -i_172_;
		}
		if (i_173_ == 2)
			return anIntArray3074[i & 0x7fff] * i_172_ >> 14;
		if (i_173_ == 3)
			return ((i & 0x7fff) * i_172_ >> 14) - i_172_;
		if (i_173_ == 4)
			return anIntArray3073[i / 2607 & 0x7fff] * i_172_;
		return 0;
	}

	final void method4264(RsByteBuffer class282_sub35) {
		((Class248) this).aClass342_3066 = new Class342();
		((Class248) this).aClass342_3066.method6076(class282_sub35);
		((Class248) this).aClass342_3056 = new Class342();
		((Class248) this).aClass342_3056.method6076(class282_sub35);
		int i = class282_sub35.readUnsignedByte();
		if (i != 0) {
			class282_sub35.index -= -1115476867;
			((Class248) this).aClass342_3070 = new Class342();
			((Class248) this).aClass342_3070.method6076(class282_sub35);
			((Class248) this).aClass342_3062 = new Class342();
			((Class248) this).aClass342_3062.method6076(class282_sub35);
		}
		i = class282_sub35.readUnsignedByte();
		if (i != 0) {
			class282_sub35.index -= -1115476867;
			((Class248) this).aClass342_3059 = new Class342();
			((Class248) this).aClass342_3059.method6076(class282_sub35);
			((Class248) this).aClass342_3060 = new Class342();
			((Class248) this).aClass342_3060.method6076(class282_sub35);
		}
		i = class282_sub35.readUnsignedByte();
		if (i != 0) {
			class282_sub35.index -= -1115476867;
			((Class248) this).aClass342_3061 = new Class342();
			((Class248) this).aClass342_3061.method6076(class282_sub35);
			((Class248) this).aClass342_3079 = new Class342();
			((Class248) this).aClass342_3079.method6076(class282_sub35);
		}
		for (int i_174_ = 0; i_174_ < 10; i_174_++) {
			int i_175_ = class282_sub35.readUnsignedSmart(1845502486);
			if (i_175_ == 0)
				break;
			((Class248) this).anIntArray3063[i_174_] = i_175_;
			((Class248) this).anIntArray3064[i_174_] = class282_sub35.method13094(-2118859129);
			((Class248) this).anIntArray3065[i_174_] = class282_sub35.readUnsignedSmart(1855083589);
		}
		((Class248) this).anInt3069 = class282_sub35.readUnsignedSmart(1800262992);
		((Class248) this).anInt3067 = class282_sub35.readUnsignedSmart(1900280779);
		((Class248) this).anInt3055 = class282_sub35.readUnsignedShort();
		((Class248) this).anInt3076 = class282_sub35.readUnsignedShort();
		((Class248) this).aClass270_3068 = new Class270();
		((Class248) this).aClass342_3057 = new Class342();
		((Class248) this).aClass270_3068.method4807(class282_sub35, ((Class248) this).aClass342_3057);
	}

	final int[] method4265(int i, int i_176_) {
		Arrays.fill(anIntArray3072, 0, i, 0);
		if (i_176_ < 10)
			return anIntArray3072;
		double d = (double) i / ((double) i_176_ + 0.0);
		((Class248) this).aClass342_3066.method6078();
		((Class248) this).aClass342_3056.method6078();
		int i_177_ = 0;
		int i_178_ = 0;
		int i_179_ = 0;
		if (((Class248) this).aClass342_3070 != null) {
			((Class248) this).aClass342_3070.method6078();
			((Class248) this).aClass342_3062.method6078();
			i_177_ = (int) ((double) (((Class342) ((Class248) this).aClass342_3070).anInt3999 - ((Class342) (((Class248) this).aClass342_3070)).anInt4000) * 32.768 / d);
			i_178_ = (int) ((double) ((Class342) (((Class248) this).aClass342_3070)).anInt4000 * 32.768 / d);
		}
		int i_180_ = 0;
		int i_181_ = 0;
		int i_182_ = 0;
		if (((Class248) this).aClass342_3059 != null) {
			((Class248) this).aClass342_3059.method6078();
			((Class248) this).aClass342_3060.method6078();
			i_180_ = (int) ((double) (((Class342) ((Class248) this).aClass342_3059).anInt3999 - ((Class342) (((Class248) this).aClass342_3059)).anInt4000) * 32.768 / d);
			i_181_ = (int) ((double) ((Class342) (((Class248) this).aClass342_3059)).anInt4000 * 32.768 / d);
		}
		for (int i_183_ = 0; i_183_ < 5; i_183_++) {
			if (((Class248) this).anIntArray3063[i_183_] != 0) {
				anIntArray3071[i_183_] = 0;
				anIntArray3077[i_183_] = (int) ((double) ((Class248) this).anIntArray3065[i_183_] * d);
				anIntArray3078[i_183_] = (((Class248) this).anIntArray3063[i_183_] << 14) / 100;
				anIntArray3058[i_183_] = (int) ((double) (((Class342) (((Class248) this).aClass342_3066)).anInt3999 - (((Class342) ((Class248) this).aClass342_3066).anInt4000)) * 32.768 * Math.pow(1.0057929410678534, (double) (((Class248) this).anIntArray3064[i_183_])) / d);
				anIntArray3080[i_183_] = (int) ((double) ((Class342) (((Class248) this).aClass342_3066)).anInt4000 * 32.768 / d);
			}
		}
		for (int i_184_ = 0; i_184_ < i; i_184_++) {
			int i_185_ = ((Class248) this).aClass342_3066.method6087(i);
			int i_186_ = ((Class248) this).aClass342_3056.method6087(i);
			if (((Class248) this).aClass342_3070 != null) {
				int i_187_ = ((Class248) this).aClass342_3070.method6087(i);
				int i_188_ = ((Class248) this).aClass342_3062.method6087(i);
				i_185_ += (method4254(i_179_, i_188_, ((Class342) (((Class248) this).aClass342_3070)).anInt4002) >> 1);
				i_179_ += (i_187_ * i_177_ >> 16) + i_178_;
			}
			if (((Class248) this).aClass342_3059 != null) {
				int i_189_ = ((Class248) this).aClass342_3059.method6087(i);
				int i_190_ = ((Class248) this).aClass342_3060.method6087(i);
				i_186_ = i_186_ * ((method4254(i_182_, i_190_, (((Class342) (((Class248) this).aClass342_3059)).anInt4002)) >> 1) + 32768) >> 15;
				i_182_ += (i_189_ * i_180_ >> 16) + i_181_;
			}
			for (int i_191_ = 0; i_191_ < 5; i_191_++) {
				if (((Class248) this).anIntArray3063[i_191_] != 0) {
					int i_192_ = i_184_ + anIntArray3077[i_191_];
					if (i_192_ < i) {
						anIntArray3072[i_192_] += method4254(anIntArray3071[i_191_], (i_186_ * anIntArray3078[i_191_] >> 15), (((Class342) ((Class248) this).aClass342_3066).anInt4002));
						anIntArray3071[i_191_] += ((i_185_ * anIntArray3058[i_191_] >> 16) + anIntArray3080[i_191_]);
					}
				}
			}
		}
		if (((Class248) this).aClass342_3061 != null) {
			((Class248) this).aClass342_3061.method6078();
			((Class248) this).aClass342_3079.method6078();
			int i_193_ = 0;
			boolean bool = false;
			boolean bool_194_ = true;
			for (int i_195_ = 0; i_195_ < i; i_195_++) {
				int i_196_ = ((Class248) this).aClass342_3061.method6087(i);
				int i_197_ = ((Class248) this).aClass342_3079.method6087(i);
				int i_198_;
				if (bool_194_)
					i_198_ = ((((Class342) ((Class248) this).aClass342_3061).anInt4000) + (((((Class342) ((Class248) this).aClass342_3061).anInt3999) - (((Class342) ((Class248) this).aClass342_3061).anInt4000)) * i_196_ >> 8));
				else
					i_198_ = ((((Class342) ((Class248) this).aClass342_3061).anInt4000) + (((((Class342) ((Class248) this).aClass342_3061).anInt3999) - (((Class342) ((Class248) this).aClass342_3061).anInt4000)) * i_197_ >> 8));
				i_193_ += 256;
				if (i_193_ >= i_198_) {
					i_193_ = 0;
					bool_194_ = !bool_194_;
				}
				if (bool_194_)
					anIntArray3072[i_195_] = 0;
			}
		}
		if (((Class248) this).anInt3069 > 0 && ((Class248) this).anInt3067 > 0) {
			int i_199_ = (int) ((double) ((Class248) this).anInt3069 * d);
			for (int i_200_ = i_199_; i_200_ < i; i_200_++)
				anIntArray3072[i_200_] += (anIntArray3072[i_200_ - i_199_] * ((Class248) this).anInt3067 / 100);
		}
		if (((Class270) ((Class248) this).aClass270_3068).anIntArray3318[0] > 0 || (((Class270) ((Class248) this).aClass270_3068).anIntArray3318[1] > 0)) {
			((Class248) this).aClass342_3057.method6078();
			int i_201_ = ((Class248) this).aClass342_3057.method6087(i + 1);
			int i_202_ = ((Class248) this).aClass270_3068.method4812(0, (float) i_201_ / 65536.0F);
			int i_203_ = ((Class248) this).aClass270_3068.method4812(1, (float) i_201_ / 65536.0F);
			if (i >= i_202_ + i_203_) {
				int i_204_ = 0;
				int i_205_ = i_203_;
				if (i_205_ > i - i_202_)
					i_205_ = i - i_202_;
				for (/**/; i_204_ < i_205_; i_204_++) {
					int i_206_ = (int) (((long) anIntArray3072[i_204_ + i_202_] * (long) Class270.anInt3315) >> 16);
					for (int i_207_ = 0; i_207_ < i_202_; i_207_++)
						i_206_ += (int) (((long) (anIntArray3072[i_204_ + i_202_ - 1 - i_207_]) * (long) (Class270.anIntArrayArray3321[0][i_207_])) >> 16);
					for (int i_208_ = 0; i_208_ < i_204_; i_208_++)
						i_206_ -= (int) (((long) (anIntArray3072[i_204_ - 1 - i_208_]) * (long) (Class270.anIntArrayArray3321[1][i_208_])) >> 16);
					anIntArray3072[i_204_] = i_206_;
					i_201_ = ((Class248) this).aClass342_3057.method6087(i + 1);
				}
				i_205_ = 128;
				for (;;) {
					if (i_205_ > i - i_202_)
						i_205_ = i - i_202_;
					for (/**/; i_204_ < i_205_; i_204_++) {
						int i_209_ = (int) (((long) anIntArray3072[i_204_ + i_202_] * (long) Class270.anInt3315) >> 16);
						for (int i_210_ = 0; i_210_ < i_202_; i_210_++)
							i_209_ += (int) (((long) anIntArray3072[(i_204_ + i_202_ - 1 - i_210_)] * (long) (Class270.anIntArrayArray3321[0][i_210_])) >> 16);
						for (int i_211_ = 0; i_211_ < i_203_; i_211_++)
							i_209_ -= (int) (((long) (anIntArray3072[i_204_ - 1 - i_211_]) * (long) (Class270.anIntArrayArray3321[1][i_211_])) >> 16);
						anIntArray3072[i_204_] = i_209_;
						i_201_ = ((Class248) this).aClass342_3057.method6087(i + 1);
					}
					if (i_204_ >= i - i_202_)
						break;
					i_202_ = ((Class248) this).aClass270_3068.method4812(0, (float) i_201_ / 65536.0F);
					i_203_ = ((Class248) this).aClass270_3068.method4812(1, (float) i_201_ / 65536.0F);
					i_205_ += 128;
				}
				for (/**/; i_204_ < i; i_204_++) {
					int i_212_ = 0;
					for (int i_213_ = i_204_ + i_202_ - i; i_213_ < i_202_; i_213_++)
						i_212_ += (int) (((long) (anIntArray3072[i_204_ + i_202_ - 1 - i_213_]) * (long) (Class270.anIntArrayArray3321[0][i_213_])) >> 16);
					for (int i_214_ = 0; i_214_ < i_203_; i_214_++)
						i_212_ -= (int) (((long) (anIntArray3072[i_204_ - 1 - i_214_]) * (long) (Class270.anIntArrayArray3321[1][i_214_])) >> 16);
					anIntArray3072[i_204_] = i_212_;
					i_201_ = ((Class248) this).aClass342_3057.method6087(i + 1);
				}
			}
		}
		for (int i_215_ = 0; i_215_ < i; i_215_++) {
			if (anIntArray3072[i_215_] < -32768)
				anIntArray3072[i_215_] = -32768;
			if (anIntArray3072[i_215_] > 32767)
				anIntArray3072[i_215_] = 32767;
		}
		return anIntArray3072;
	}

	final void method4266(RsByteBuffer class282_sub35) {
		((Class248) this).aClass342_3066 = new Class342();
		((Class248) this).aClass342_3066.method6076(class282_sub35);
		((Class248) this).aClass342_3056 = new Class342();
		((Class248) this).aClass342_3056.method6076(class282_sub35);
		int i = class282_sub35.readUnsignedByte();
		if (i != 0) {
			class282_sub35.index -= -1115476867;
			((Class248) this).aClass342_3070 = new Class342();
			((Class248) this).aClass342_3070.method6076(class282_sub35);
			((Class248) this).aClass342_3062 = new Class342();
			((Class248) this).aClass342_3062.method6076(class282_sub35);
		}
		i = class282_sub35.readUnsignedByte();
		if (i != 0) {
			class282_sub35.index -= -1115476867;
			((Class248) this).aClass342_3059 = new Class342();
			((Class248) this).aClass342_3059.method6076(class282_sub35);
			((Class248) this).aClass342_3060 = new Class342();
			((Class248) this).aClass342_3060.method6076(class282_sub35);
		}
		i = class282_sub35.readUnsignedByte();
		if (i != 0) {
			class282_sub35.index -= -1115476867;
			((Class248) this).aClass342_3061 = new Class342();
			((Class248) this).aClass342_3061.method6076(class282_sub35);
			((Class248) this).aClass342_3079 = new Class342();
			((Class248) this).aClass342_3079.method6076(class282_sub35);
		}
		for (int i_216_ = 0; i_216_ < 10; i_216_++) {
			int i_217_ = class282_sub35.readUnsignedSmart(1987294112);
			if (i_217_ == 0)
				break;
			((Class248) this).anIntArray3063[i_216_] = i_217_;
			((Class248) this).anIntArray3064[i_216_] = class282_sub35.method13094(851007422);
			((Class248) this).anIntArray3065[i_216_] = class282_sub35.readUnsignedSmart(1768126198);
		}
		((Class248) this).anInt3069 = class282_sub35.readUnsignedSmart(2019688249);
		((Class248) this).anInt3067 = class282_sub35.readUnsignedSmart(1483085780);
		((Class248) this).anInt3055 = class282_sub35.readUnsignedShort();
		((Class248) this).anInt3076 = class282_sub35.readUnsignedShort();
		((Class248) this).aClass270_3068 = new Class270();
		((Class248) this).aClass342_3057 = new Class342();
		((Class248) this).aClass270_3068.method4807(class282_sub35, ((Class248) this).aClass342_3057);
	}

	Class248() {
		((Class248) this).anInt3067 = 100;
		((Class248) this).anInt3055 = 500;
		((Class248) this).anInt3076 = 0;
	}
}
