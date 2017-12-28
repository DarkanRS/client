/* Class270 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class270 {
	static int anInt3315;
	static final int anInt3316 = 4;
	int[][][] anIntArrayArrayArray3317;
	int[] anIntArray3318 = new int[2];
	int[] anIntArray3319;
	static final float aFloat3320 = 100.0F;
	static int[][] anIntArrayArray3321;
	static float aFloat3322;
	static final float aFloat3323 = 32.703197F;
	static float[][] aFloatArrayArray3324 = new float[2][8];
	static final float aFloat3325 = 8.0F;
	int[][][] anIntArrayArrayArray3326;

	static float method4803(float f) {
		float f_0_ = 32.703197F * (float) Math.pow(2.0, (double) f);
		return f_0_ * 3.1415927F / 11025.0F;
	}

	float method4804(int i, int i_1_, float f) {
		float f_2_ = ((float) ((Class270) this).anIntArrayArrayArray3326[i][0][i_1_] + f * (float) ((((Class270) this).anIntArrayArrayArray3326[i][1][i_1_]) - (((Class270) this).anIntArrayArrayArray3326[i][0][i_1_])));
		f_2_ *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, (double) (-f_2_ / 20.0F));
	}

	static float method4805(float f) {
		float f_3_ = 32.703197F * (float) Math.pow(2.0, (double) f);
		return f_3_ * 3.1415927F / 11025.0F;
	}

	float method4806(int i, int i_4_, float f) {
		float f_5_ = ((float) ((Class270) this).anIntArrayArrayArray3317[i][0][i_4_] + f * (float) ((((Class270) this).anIntArrayArrayArray3317[i][1][i_4_]) - (((Class270) this).anIntArrayArrayArray3317[i][0][i_4_])));
		f_5_ *= 1.2207031E-4F;
		return method4805(f_5_);
	}

	Class270() {
		((Class270) this).anIntArrayArrayArray3317 = new int[2][2][4];
		((Class270) this).anIntArrayArrayArray3326 = new int[2][2][4];
		((Class270) this).anIntArray3319 = new int[2];
	}

	final void method4807(RsByteBuffer class282_sub35, Class342 class342) {
		int i = class282_sub35.readUnsignedByte();
		((Class270) this).anIntArray3318[0] = i >> 4;
		((Class270) this).anIntArray3318[1] = i & 0xf;
		if (i != 0) {
			((Class270) this).anIntArray3319[0] = class282_sub35.readUnsignedShort();
			((Class270) this).anIntArray3319[1] = class282_sub35.readUnsignedShort();
			int i_6_ = class282_sub35.readUnsignedByte();
			for (int i_7_ = 0; i_7_ < 2; i_7_++) {
				for (int i_8_ = 0; i_8_ < ((Class270) this).anIntArray3318[i_7_]; i_8_++) {
					((Class270) this).anIntArrayArrayArray3317[i_7_][0][i_8_] = class282_sub35.readUnsignedShort();
					((Class270) this).anIntArrayArrayArray3326[i_7_][0][i_8_] = class282_sub35.readUnsignedShort();
				}
			}
			for (int i_9_ = 0; i_9_ < 2; i_9_++) {
				for (int i_10_ = 0; i_10_ < ((Class270) this).anIntArray3318[i_9_]; i_10_++) {
					if ((i_6_ & 1 << i_9_ * 4 << i_10_) != 0) {
						((Class270) this).anIntArrayArrayArray3317[i_9_][1][i_10_] = class282_sub35.readUnsignedShort();
						((Class270) this).anIntArrayArrayArray3326[i_9_][1][i_10_] = class282_sub35.readUnsignedShort();
					} else {
						((Class270) this).anIntArrayArrayArray3317[i_9_][1][i_10_] = (((Class270) this).anIntArrayArrayArray3317[i_9_][0][i_10_]);
						((Class270) this).anIntArrayArrayArray3326[i_9_][1][i_10_] = (((Class270) this).anIntArrayArrayArray3326[i_9_][0][i_10_]);
					}
				}
			}
			if (i_6_ != 0 || (((Class270) this).anIntArray3319[1] != ((Class270) this).anIntArray3319[0]))
				class342.method6086(class282_sub35);
		} else {
			int[] is = ((Class270) this).anIntArray3319;
			((Class270) this).anIntArray3319[1] = 0;
			is[0] = 0;
		}
	}

	static {
		anIntArrayArray3321 = new int[2][8];
	}

	float method4808(int i, int i_11_, float f) {
		float f_12_ = ((float) ((Class270) this).anIntArrayArrayArray3326[i][0][i_11_] + f * (float) ((((Class270) this).anIntArrayArrayArray3326[i][1][i_11_]) - (((Class270) this).anIntArrayArrayArray3326[i][0][i_11_])));
		f_12_ *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, (double) (-f_12_ / 20.0F));
	}

	float method4809(int i, int i_13_, float f) {
		float f_14_ = ((float) ((Class270) this).anIntArrayArrayArray3326[i][0][i_13_] + f * (float) ((((Class270) this).anIntArrayArrayArray3326[i][1][i_13_]) - (((Class270) this).anIntArrayArrayArray3326[i][0][i_13_])));
		f_14_ *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, (double) (-f_14_ / 20.0F));
	}

	float method4810(int i, int i_15_, float f) {
		float f_16_ = ((float) ((Class270) this).anIntArrayArrayArray3317[i][0][i_15_] + f * (float) ((((Class270) this).anIntArrayArrayArray3317[i][1][i_15_]) - (((Class270) this).anIntArrayArrayArray3317[i][0][i_15_])));
		f_16_ *= 1.2207031E-4F;
		return method4805(f_16_);
	}

	final void method4811(RsByteBuffer class282_sub35, Class342 class342) {
		int i = class282_sub35.readUnsignedByte();
		((Class270) this).anIntArray3318[0] = i >> 4;
		((Class270) this).anIntArray3318[1] = i & 0xf;
		if (i != 0) {
			((Class270) this).anIntArray3319[0] = class282_sub35.readUnsignedShort();
			((Class270) this).anIntArray3319[1] = class282_sub35.readUnsignedShort();
			int i_17_ = class282_sub35.readUnsignedByte();
			for (int i_18_ = 0; i_18_ < 2; i_18_++) {
				for (int i_19_ = 0; i_19_ < ((Class270) this).anIntArray3318[i_18_]; i_19_++) {
					((Class270) this).anIntArrayArrayArray3317[i_18_][0][i_19_] = class282_sub35.readUnsignedShort();
					((Class270) this).anIntArrayArrayArray3326[i_18_][0][i_19_] = class282_sub35.readUnsignedShort();
				}
			}
			for (int i_20_ = 0; i_20_ < 2; i_20_++) {
				for (int i_21_ = 0; i_21_ < ((Class270) this).anIntArray3318[i_20_]; i_21_++) {
					if ((i_17_ & 1 << i_20_ * 4 << i_21_) != 0) {
						((Class270) this).anIntArrayArrayArray3317[i_20_][1][i_21_] = class282_sub35.readUnsignedShort();
						((Class270) this).anIntArrayArrayArray3326[i_20_][1][i_21_] = class282_sub35.readUnsignedShort();
					} else {
						((Class270) this).anIntArrayArrayArray3317[i_20_][1][i_21_] = (((Class270) this).anIntArrayArrayArray3317[i_20_][0][i_21_]);
						((Class270) this).anIntArrayArrayArray3326[i_20_][1][i_21_] = (((Class270) this).anIntArrayArrayArray3326[i_20_][0][i_21_]);
					}
				}
			}
			if (i_17_ != 0 || (((Class270) this).anIntArray3319[1] != ((Class270) this).anIntArray3319[0]))
				class342.method6086(class282_sub35);
		} else {
			int[] is = ((Class270) this).anIntArray3319;
			((Class270) this).anIntArray3319[1] = 0;
			is[0] = 0;
		}
	}

	int method4812(int i, float f) {
		if (i == 0) {
			float f_22_ = ((float) ((Class270) this).anIntArray3319[0] + (float) (((Class270) this).anIntArray3319[1] - ((Class270) this).anIntArray3319[0]) * f);
			f_22_ *= 0.0030517578F;
			aFloat3322 = (float) Math.pow(0.1, (double) (f_22_ / 20.0F));
			anInt3315 = (int) (aFloat3322 * 65536.0F);
		}
		if (((Class270) this).anIntArray3318[i] == 0)
			return 0;
		float f_23_ = method4804(i, 0, f);
		aFloatArrayArray3324[i][0] = -2.0F * f_23_ * (float) Math.cos((double) method4806(i, 0, f));
		aFloatArrayArray3324[i][1] = f_23_ * f_23_;
		for (int i_24_ = 1; i_24_ < ((Class270) this).anIntArray3318[i]; i_24_++) {
			f_23_ = method4804(i, i_24_, f);
			float f_25_ = (-2.0F * f_23_ * (float) Math.cos((double) method4806(i, i_24_, f)));
			float f_26_ = f_23_ * f_23_;
			aFloatArrayArray3324[i][i_24_ * 2 + 1] = aFloatArrayArray3324[i][i_24_ * 2 - 1] * f_26_;
			aFloatArrayArray3324[i][i_24_ * 2] = (aFloatArrayArray3324[i][i_24_ * 2 - 1] * f_25_ + aFloatArrayArray3324[i][i_24_ * 2 - 2] * f_26_);
			for (int i_27_ = i_24_ * 2 - 1; i_27_ >= 2; i_27_--)
				aFloatArrayArray3324[i][i_27_] += (aFloatArrayArray3324[i][i_27_ - 1] * f_25_ + aFloatArrayArray3324[i][i_27_ - 2] * f_26_);
			aFloatArrayArray3324[i][1] += aFloatArrayArray3324[i][0] * f_25_ + f_26_;
			aFloatArrayArray3324[i][0] += f_25_;
		}
		if (i == 0) {
			for (int i_28_ = 0; i_28_ < ((Class270) this).anIntArray3318[0] * 2; i_28_++)
				aFloatArrayArray3324[0][i_28_] *= aFloat3322;
		}
		for (int i_29_ = 0; i_29_ < ((Class270) this).anIntArray3318[i] * 2; i_29_++)
			anIntArrayArray3321[i][i_29_] = (int) (aFloatArrayArray3324[i][i_29_] * 65536.0F);
		return ((Class270) this).anIntArray3318[i] * 2;
	}

	float method4813(int i, int i_30_, float f) {
		float f_31_ = ((float) ((Class270) this).anIntArrayArrayArray3317[i][0][i_30_] + f * (float) ((((Class270) this).anIntArrayArrayArray3317[i][1][i_30_]) - (((Class270) this).anIntArrayArrayArray3317[i][0][i_30_])));
		f_31_ *= 1.2207031E-4F;
		return method4805(f_31_);
	}

	int method4814(int i, float f) {
		if (i == 0) {
			float f_32_ = ((float) ((Class270) this).anIntArray3319[0] + (float) (((Class270) this).anIntArray3319[1] - ((Class270) this).anIntArray3319[0]) * f);
			f_32_ *= 0.0030517578F;
			aFloat3322 = (float) Math.pow(0.1, (double) (f_32_ / 20.0F));
			anInt3315 = (int) (aFloat3322 * 65536.0F);
		}
		if (((Class270) this).anIntArray3318[i] == 0)
			return 0;
		float f_33_ = method4804(i, 0, f);
		aFloatArrayArray3324[i][0] = -2.0F * f_33_ * (float) Math.cos((double) method4806(i, 0, f));
		aFloatArrayArray3324[i][1] = f_33_ * f_33_;
		for (int i_34_ = 1; i_34_ < ((Class270) this).anIntArray3318[i]; i_34_++) {
			f_33_ = method4804(i, i_34_, f);
			float f_35_ = (-2.0F * f_33_ * (float) Math.cos((double) method4806(i, i_34_, f)));
			float f_36_ = f_33_ * f_33_;
			aFloatArrayArray3324[i][i_34_ * 2 + 1] = aFloatArrayArray3324[i][i_34_ * 2 - 1] * f_36_;
			aFloatArrayArray3324[i][i_34_ * 2] = (aFloatArrayArray3324[i][i_34_ * 2 - 1] * f_35_ + aFloatArrayArray3324[i][i_34_ * 2 - 2] * f_36_);
			for (int i_37_ = i_34_ * 2 - 1; i_37_ >= 2; i_37_--)
				aFloatArrayArray3324[i][i_37_] += (aFloatArrayArray3324[i][i_37_ - 1] * f_35_ + aFloatArrayArray3324[i][i_37_ - 2] * f_36_);
			aFloatArrayArray3324[i][1] += aFloatArrayArray3324[i][0] * f_35_ + f_36_;
			aFloatArrayArray3324[i][0] += f_35_;
		}
		if (i == 0) {
			for (int i_38_ = 0; i_38_ < ((Class270) this).anIntArray3318[0] * 2; i_38_++)
				aFloatArrayArray3324[0][i_38_] *= aFloat3322;
		}
		for (int i_39_ = 0; i_39_ < ((Class270) this).anIntArray3318[i] * 2; i_39_++)
			anIntArrayArray3321[i][i_39_] = (int) (aFloatArrayArray3324[i][i_39_] * 65536.0F);
		return ((Class270) this).anIntArray3318[i] * 2;
	}

	int method4815(int i, float f) {
		if (i == 0) {
			float f_40_ = ((float) ((Class270) this).anIntArray3319[0] + (float) (((Class270) this).anIntArray3319[1] - ((Class270) this).anIntArray3319[0]) * f);
			f_40_ *= 0.0030517578F;
			aFloat3322 = (float) Math.pow(0.1, (double) (f_40_ / 20.0F));
			anInt3315 = (int) (aFloat3322 * 65536.0F);
		}
		if (((Class270) this).anIntArray3318[i] == 0)
			return 0;
		float f_41_ = method4804(i, 0, f);
		aFloatArrayArray3324[i][0] = -2.0F * f_41_ * (float) Math.cos((double) method4806(i, 0, f));
		aFloatArrayArray3324[i][1] = f_41_ * f_41_;
		for (int i_42_ = 1; i_42_ < ((Class270) this).anIntArray3318[i]; i_42_++) {
			f_41_ = method4804(i, i_42_, f);
			float f_43_ = (-2.0F * f_41_ * (float) Math.cos((double) method4806(i, i_42_, f)));
			float f_44_ = f_41_ * f_41_;
			aFloatArrayArray3324[i][i_42_ * 2 + 1] = aFloatArrayArray3324[i][i_42_ * 2 - 1] * f_44_;
			aFloatArrayArray3324[i][i_42_ * 2] = (aFloatArrayArray3324[i][i_42_ * 2 - 1] * f_43_ + aFloatArrayArray3324[i][i_42_ * 2 - 2] * f_44_);
			for (int i_45_ = i_42_ * 2 - 1; i_45_ >= 2; i_45_--)
				aFloatArrayArray3324[i][i_45_] += (aFloatArrayArray3324[i][i_45_ - 1] * f_43_ + aFloatArrayArray3324[i][i_45_ - 2] * f_44_);
			aFloatArrayArray3324[i][1] += aFloatArrayArray3324[i][0] * f_43_ + f_44_;
			aFloatArrayArray3324[i][0] += f_43_;
		}
		if (i == 0) {
			for (int i_46_ = 0; i_46_ < ((Class270) this).anIntArray3318[0] * 2; i_46_++)
				aFloatArrayArray3324[0][i_46_] *= aFloat3322;
		}
		for (int i_47_ = 0; i_47_ < ((Class270) this).anIntArray3318[i] * 2; i_47_++)
			anIntArrayArray3321[i][i_47_] = (int) (aFloatArrayArray3324[i][i_47_] * 65536.0F);
		return ((Class270) this).anIntArray3318[i] * 2;
	}

	int method4816(int i, float f) {
		if (i == 0) {
			float f_48_ = ((float) ((Class270) this).anIntArray3319[0] + (float) (((Class270) this).anIntArray3319[1] - ((Class270) this).anIntArray3319[0]) * f);
			f_48_ *= 0.0030517578F;
			aFloat3322 = (float) Math.pow(0.1, (double) (f_48_ / 20.0F));
			anInt3315 = (int) (aFloat3322 * 65536.0F);
		}
		if (((Class270) this).anIntArray3318[i] == 0)
			return 0;
		float f_49_ = method4804(i, 0, f);
		aFloatArrayArray3324[i][0] = -2.0F * f_49_ * (float) Math.cos((double) method4806(i, 0, f));
		aFloatArrayArray3324[i][1] = f_49_ * f_49_;
		for (int i_50_ = 1; i_50_ < ((Class270) this).anIntArray3318[i]; i_50_++) {
			f_49_ = method4804(i, i_50_, f);
			float f_51_ = (-2.0F * f_49_ * (float) Math.cos((double) method4806(i, i_50_, f)));
			float f_52_ = f_49_ * f_49_;
			aFloatArrayArray3324[i][i_50_ * 2 + 1] = aFloatArrayArray3324[i][i_50_ * 2 - 1] * f_52_;
			aFloatArrayArray3324[i][i_50_ * 2] = (aFloatArrayArray3324[i][i_50_ * 2 - 1] * f_51_ + aFloatArrayArray3324[i][i_50_ * 2 - 2] * f_52_);
			for (int i_53_ = i_50_ * 2 - 1; i_53_ >= 2; i_53_--)
				aFloatArrayArray3324[i][i_53_] += (aFloatArrayArray3324[i][i_53_ - 1] * f_51_ + aFloatArrayArray3324[i][i_53_ - 2] * f_52_);
			aFloatArrayArray3324[i][1] += aFloatArrayArray3324[i][0] * f_51_ + f_52_;
			aFloatArrayArray3324[i][0] += f_51_;
		}
		if (i == 0) {
			for (int i_54_ = 0; i_54_ < ((Class270) this).anIntArray3318[0] * 2; i_54_++)
				aFloatArrayArray3324[0][i_54_] *= aFloat3322;
		}
		for (int i_55_ = 0; i_55_ < ((Class270) this).anIntArray3318[i] * 2; i_55_++)
			anIntArrayArray3321[i][i_55_] = (int) (aFloatArrayArray3324[i][i_55_] * 65536.0F);
		return ((Class270) this).anIntArray3318[i] * 2;
	}

	final void method4817(RsByteBuffer class282_sub35, Class342 class342) {
		int i = class282_sub35.readUnsignedByte();
		((Class270) this).anIntArray3318[0] = i >> 4;
		((Class270) this).anIntArray3318[1] = i & 0xf;
		if (i != 0) {
			((Class270) this).anIntArray3319[0] = class282_sub35.readUnsignedShort();
			((Class270) this).anIntArray3319[1] = class282_sub35.readUnsignedShort();
			int i_56_ = class282_sub35.readUnsignedByte();
			for (int i_57_ = 0; i_57_ < 2; i_57_++) {
				for (int i_58_ = 0; i_58_ < ((Class270) this).anIntArray3318[i_57_]; i_58_++) {
					((Class270) this).anIntArrayArrayArray3317[i_57_][0][i_58_] = class282_sub35.readUnsignedShort();
					((Class270) this).anIntArrayArrayArray3326[i_57_][0][i_58_] = class282_sub35.readUnsignedShort();
				}
			}
			for (int i_59_ = 0; i_59_ < 2; i_59_++) {
				for (int i_60_ = 0; i_60_ < ((Class270) this).anIntArray3318[i_59_]; i_60_++) {
					if ((i_56_ & 1 << i_59_ * 4 << i_60_) != 0) {
						((Class270) this).anIntArrayArrayArray3317[i_59_][1][i_60_] = class282_sub35.readUnsignedShort();
						((Class270) this).anIntArrayArrayArray3326[i_59_][1][i_60_] = class282_sub35.readUnsignedShort();
					} else {
						((Class270) this).anIntArrayArrayArray3317[i_59_][1][i_60_] = (((Class270) this).anIntArrayArrayArray3317[i_59_][0][i_60_]);
						((Class270) this).anIntArrayArrayArray3326[i_59_][1][i_60_] = (((Class270) this).anIntArrayArrayArray3326[i_59_][0][i_60_]);
					}
				}
			}
			if (i_56_ != 0 || (((Class270) this).anIntArray3319[1] != ((Class270) this).anIntArray3319[0]))
				class342.method6086(class282_sub35);
		} else {
			int[] is = ((Class270) this).anIntArray3319;
			((Class270) this).anIntArray3319[1] = 0;
			is[0] = 0;
		}
	}

	static float method4818(float f) {
		float f_61_ = 32.703197F * (float) Math.pow(2.0, (double) f);
		return f_61_ * 3.1415927F / 11025.0F;
	}

	final void method4819(RsByteBuffer class282_sub35, Class342 class342) {
		int i = class282_sub35.readUnsignedByte();
		((Class270) this).anIntArray3318[0] = i >> 4;
		((Class270) this).anIntArray3318[1] = i & 0xf;
		if (i != 0) {
			((Class270) this).anIntArray3319[0] = class282_sub35.readUnsignedShort();
			((Class270) this).anIntArray3319[1] = class282_sub35.readUnsignedShort();
			int i_62_ = class282_sub35.readUnsignedByte();
			for (int i_63_ = 0; i_63_ < 2; i_63_++) {
				for (int i_64_ = 0; i_64_ < ((Class270) this).anIntArray3318[i_63_]; i_64_++) {
					((Class270) this).anIntArrayArrayArray3317[i_63_][0][i_64_] = class282_sub35.readUnsignedShort();
					((Class270) this).anIntArrayArrayArray3326[i_63_][0][i_64_] = class282_sub35.readUnsignedShort();
				}
			}
			for (int i_65_ = 0; i_65_ < 2; i_65_++) {
				for (int i_66_ = 0; i_66_ < ((Class270) this).anIntArray3318[i_65_]; i_66_++) {
					if ((i_62_ & 1 << i_65_ * 4 << i_66_) != 0) {
						((Class270) this).anIntArrayArrayArray3317[i_65_][1][i_66_] = class282_sub35.readUnsignedShort();
						((Class270) this).anIntArrayArrayArray3326[i_65_][1][i_66_] = class282_sub35.readUnsignedShort();
					} else {
						((Class270) this).anIntArrayArrayArray3317[i_65_][1][i_66_] = (((Class270) this).anIntArrayArrayArray3317[i_65_][0][i_66_]);
						((Class270) this).anIntArrayArrayArray3326[i_65_][1][i_66_] = (((Class270) this).anIntArrayArrayArray3326[i_65_][0][i_66_]);
					}
				}
			}
			if (i_62_ != 0 || (((Class270) this).anIntArray3319[1] != ((Class270) this).anIntArray3319[0]))
				class342.method6086(class282_sub35);
		} else {
			int[] is = ((Class270) this).anIntArray3319;
			((Class270) this).anIntArray3319[1] = 0;
			is[0] = 0;
		}
	}
}
