/* Class286 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class286 {
	int[][][] anIntArrayArrayArray3084;
	static int anInt3085 = 4;
	int[] anIntArray3086;
	static int anInt3087;
	int[] anIntArray3088 = new int[2];
	static float[][] aFloatArrayArray3089 = new float[2][8];
	static int[][] anIntArrayArray3090 = new int[2][8];
	int[][][] anIntArrayArrayArray3091;
	static float aFloat3092;
	static float aFloat3093 = 100.0F;
	static float aFloat3094 = 8.0F;
	static float aFloat3095 = 32.703197F;

	final void method2715(RsByteBuffer class298_sub53, Class279 class279) {
		int i = class298_sub53.readUnsignedByte();
		((Class286) this).anIntArray3088[0] = i >> 4;
		((Class286) this).anIntArray3088[1] = i & 0xf;
		if (i != 0) {
			((Class286) this).anIntArray3086[0] = class298_sub53.readUnsignedShort();
			((Class286) this).anIntArray3086[1] = class298_sub53.readUnsignedShort();
			int i_0_ = class298_sub53.readUnsignedByte();
			for (int i_1_ = 0; i_1_ < 2; i_1_++) {
				for (int i_2_ = 0; i_2_ < ((Class286) this).anIntArray3088[i_1_]; i_2_++) {
					((Class286) this).anIntArrayArrayArray3084[i_1_][0][i_2_] = class298_sub53.readUnsignedShort();
					((Class286) this).anIntArrayArrayArray3091[i_1_][0][i_2_] = class298_sub53.readUnsignedShort();
				}
			}
			for (int i_3_ = 0; i_3_ < 2; i_3_++) {
				for (int i_4_ = 0; i_4_ < ((Class286) this).anIntArray3088[i_3_]; i_4_++) {
					if ((i_0_ & 1 << i_3_ * 4 << i_4_) != 0) {
						((Class286) this).anIntArrayArrayArray3084[i_3_][1][i_4_] = class298_sub53.readUnsignedShort();
						((Class286) this).anIntArrayArrayArray3091[i_3_][1][i_4_] = class298_sub53.readUnsignedShort();
					} else {
						((Class286) this).anIntArrayArrayArray3084[i_3_][1][i_4_] = (((Class286) this).anIntArrayArrayArray3084[i_3_][0][i_4_]);
						((Class286) this).anIntArrayArrayArray3091[i_3_][1][i_4_] = (((Class286) this).anIntArrayArrayArray3091[i_3_][0][i_4_]);
					}
				}
			}
			if (i_0_ != 0 || (((Class286) this).anIntArray3086[1] != ((Class286) this).anIntArray3086[0]))
				class279.method2607(class298_sub53);
		} else {
			int[] is = ((Class286) this).anIntArray3086;
			((Class286) this).anIntArray3086[1] = 0;
			is[0] = 0;
		}
	}

	int method2716(int i, float f) {
		if (i == 0) {
			float f_5_ = ((float) ((Class286) this).anIntArray3086[0] + (float) (((Class286) this).anIntArray3086[1] - ((Class286) this).anIntArray3086[0]) * f);
			f_5_ *= 0.0030517578F;
			aFloat3092 = (float) Math.pow(0.1, (double) (f_5_ / 20.0F));
			anInt3087 = (int) (aFloat3092 * 65536.0F);
		}
		if (((Class286) this).anIntArray3088[i] == 0)
			return 0;
		float f_6_ = method2719(i, 0, f);
		aFloatArrayArray3089[i][0] = -2.0F * f_6_ * (float) Math.cos((double) method2717(i, 0, f));
		aFloatArrayArray3089[i][1] = f_6_ * f_6_;
		for (int i_7_ = 1; i_7_ < ((Class286) this).anIntArray3088[i]; i_7_++) {
			f_6_ = method2719(i, i_7_, f);
			float f_8_ = (-2.0F * f_6_ * (float) Math.cos((double) method2717(i, i_7_, f)));
			float f_9_ = f_6_ * f_6_;
			aFloatArrayArray3089[i][i_7_ * 2 + 1] = aFloatArrayArray3089[i][i_7_ * 2 - 1] * f_9_;
			aFloatArrayArray3089[i][i_7_ * 2] = (aFloatArrayArray3089[i][i_7_ * 2 - 1] * f_8_ + aFloatArrayArray3089[i][i_7_ * 2 - 2] * f_9_);
			for (int i_10_ = i_7_ * 2 - 1; i_10_ >= 2; i_10_--)
				aFloatArrayArray3089[i][i_10_] += (aFloatArrayArray3089[i][i_10_ - 1] * f_8_ + aFloatArrayArray3089[i][i_10_ - 2] * f_9_);
			aFloatArrayArray3089[i][1] += aFloatArrayArray3089[i][0] * f_8_ + f_9_;
			aFloatArrayArray3089[i][0] += f_8_;
		}
		if (i == 0) {
			for (int i_11_ = 0; i_11_ < ((Class286) this).anIntArray3088[0] * 2; i_11_++)
				aFloatArrayArray3089[0][i_11_] *= aFloat3092;
		}
		for (int i_12_ = 0; i_12_ < ((Class286) this).anIntArray3088[i] * 2; i_12_++)
			anIntArrayArray3090[i][i_12_] = (int) (aFloatArrayArray3089[i][i_12_] * 65536.0F);
		return ((Class286) this).anIntArray3088[i] * 2;
	}

	float method2717(int i, int i_13_, float f) {
		float f_14_ = ((float) ((Class286) this).anIntArrayArrayArray3084[i][0][i_13_] + f * (float) ((((Class286) this).anIntArrayArrayArray3084[i][1][i_13_]) - (((Class286) this).anIntArrayArrayArray3084[i][0][i_13_])));
		f_14_ *= 1.2207031E-4F;
		return method2718(f_14_);
	}

	static float method2718(float f) {
		float f_15_ = 32.703197F * (float) Math.pow(2.0, (double) f);
		return f_15_ * 3.1415927F / 11025.0F;
	}

	Class286() {
		((Class286) this).anIntArrayArrayArray3084 = new int[2][2][4];
		((Class286) this).anIntArrayArrayArray3091 = new int[2][2][4];
		((Class286) this).anIntArray3086 = new int[2];
	}

	float method2719(int i, int i_16_, float f) {
		float f_17_ = ((float) ((Class286) this).anIntArrayArrayArray3091[i][0][i_16_] + f * (float) ((((Class286) this).anIntArrayArrayArray3091[i][1][i_16_]) - (((Class286) this).anIntArrayArrayArray3091[i][0][i_16_])));
		f_17_ *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, (double) (-f_17_ / 20.0F));
	}
}
