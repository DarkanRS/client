
/* Class384 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public final class Class384 {
	public static Class384 aClass384_4666 = new Class384();
	public float[] aFloatArray4667;

	public float[] method6516(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[4];
		fs[2] = aFloatArray4667[8];
		fs[3] = aFloatArray4667[12];
		fs[4] = aFloatArray4667[1];
		fs[5] = aFloatArray4667[5];
		fs[6] = aFloatArray4667[9];
		fs[7] = aFloatArray4667[13];
		fs[8] = aFloatArray4667[2];
		fs[9] = aFloatArray4667[6];
		fs[10] = aFloatArray4667[10];
		fs[11] = aFloatArray4667[14];
		fs[12] = aFloatArray4667[3];
		fs[13] = aFloatArray4667[7];
		fs[14] = aFloatArray4667[11];
		fs[15] = aFloatArray4667[15];
		return fs;
	}

	public float[] method6517(float[] fs) {
		System.arraycopy(aFloatArray4667, 0, fs, 0, 16);
		return fs;
	}

	public void method6518() {
		aFloatArray4667[0] = 1.0F;
		aFloatArray4667[1] = 0.0F;
		aFloatArray4667[2] = 0.0F;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = 0.0F;
		aFloatArray4667[5] = 1.0F;
		aFloatArray4667[6] = 0.0F;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = 0.0F;
		aFloatArray4667[9] = 0.0F;
		aFloatArray4667[10] = 1.0F;
		aFloatArray4667[11] = 0.0F;
		aFloatArray4667[12] = 0.0F;
		aFloatArray4667[13] = 0.0F;
		aFloatArray4667[14] = 0.0F;
		aFloatArray4667[15] = 1.0F;
	}

	public boolean method6519() {
		return (aFloatArray4667[0] == 1.0F && aFloatArray4667[1] == 0.0F && aFloatArray4667[2] == 0.0F && aFloatArray4667[3] == 0.0F && aFloatArray4667[4] == 0.0F && aFloatArray4667[5] == 1.0F && aFloatArray4667[6] == 0.0F && aFloatArray4667[7] == 0.0F && aFloatArray4667[8] == 0.0F && aFloatArray4667[9] == 0.0F && aFloatArray4667[10] == 1.0F && aFloatArray4667[11] == 0.0F && aFloatArray4667[12] == 0.0F && aFloatArray4667[13] == 0.0F && aFloatArray4667[14] == 0.0F && aFloatArray4667[15] == 1.0F);
	}

	public void method6520() {
		float f = aFloatArray4667[0];
		float f_0_ = aFloatArray4667[4];
		float f_1_ = aFloatArray4667[8];
		float f_2_ = aFloatArray4667[12];
		float f_3_ = aFloatArray4667[1];
		float f_4_ = aFloatArray4667[5];
		float f_5_ = aFloatArray4667[9];
		float f_6_ = aFloatArray4667[13];
		float f_7_ = aFloatArray4667[2];
		float f_8_ = aFloatArray4667[6];
		float f_9_ = aFloatArray4667[10];
		float f_10_ = aFloatArray4667[14];
		float f_11_ = aFloatArray4667[3];
		float f_12_ = aFloatArray4667[7];
		float f_13_ = aFloatArray4667[11];
		float f_14_ = aFloatArray4667[15];
		aFloatArray4667[0] = f;
		aFloatArray4667[1] = f_0_;
		aFloatArray4667[2] = f_1_;
		aFloatArray4667[3] = f_2_;
		aFloatArray4667[4] = f_3_;
		aFloatArray4667[5] = f_4_;
		aFloatArray4667[6] = f_5_;
		aFloatArray4667[7] = f_6_;
		aFloatArray4667[8] = f_7_;
		aFloatArray4667[9] = f_8_;
		aFloatArray4667[10] = f_9_;
		aFloatArray4667[11] = f_10_;
		aFloatArray4667[12] = f_11_;
		aFloatArray4667[13] = f_12_;
		aFloatArray4667[14] = f_13_;
		aFloatArray4667[15] = f_14_;
	}

	public float[] method6521(float[] fs) {
		float f = aFloatArray4667[3] + aFloatArray4667[0];
		float f_15_ = aFloatArray4667[7] + aFloatArray4667[4];
		float f_16_ = aFloatArray4667[11] + aFloatArray4667[8];
		double d = Math.sqrt((double) (f * f + f_15_ * f_15_ + f_16_ * f_16_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_15_ / d);
		fs[2] = (float) ((double) f_16_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] + aFloatArray4667[12]) / d);
		return fs;
	}

	public void method6522(Class294 class294) {
		aFloatArray4667[0] = ((Class294) class294).aFloat3519;
		aFloatArray4667[1] = ((Class294) class294).aFloat3514;
		aFloatArray4667[2] = ((Class294) class294).aFloat3516;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = ((Class294) class294).aFloat3517;
		aFloatArray4667[5] = ((Class294) class294).aFloat3523;
		aFloatArray4667[6] = ((Class294) class294).aFloat3522;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = ((Class294) class294).aFloat3520;
		aFloatArray4667[9] = ((Class294) class294).aFloat3513;
		aFloatArray4667[10] = ((Class294) class294).aFloat3521;
		aFloatArray4667[11] = 0.0F;
		aFloatArray4667[12] = ((Class294) class294).aFloat3515;
		aFloatArray4667[13] = ((Class294) class294).aFloat3524;
		aFloatArray4667[14] = ((Class294) class294).aFloat3525;
		aFloatArray4667[15] = 1.0F;
	}

	public void method6523(Class384 class384_17_) {
		float f = (aFloatArray4667[0] * class384_17_.aFloatArray4667[0] + aFloatArray4667[1] * class384_17_.aFloatArray4667[4] + aFloatArray4667[2] * class384_17_.aFloatArray4667[8] + aFloatArray4667[3] * class384_17_.aFloatArray4667[12]);
		float f_18_ = (aFloatArray4667[0] * class384_17_.aFloatArray4667[1] + aFloatArray4667[1] * class384_17_.aFloatArray4667[5] + aFloatArray4667[2] * class384_17_.aFloatArray4667[9] + aFloatArray4667[3] * class384_17_.aFloatArray4667[13]);
		float f_19_ = (aFloatArray4667[0] * class384_17_.aFloatArray4667[2] + aFloatArray4667[1] * class384_17_.aFloatArray4667[6] + aFloatArray4667[2] * class384_17_.aFloatArray4667[10] + aFloatArray4667[3] * class384_17_.aFloatArray4667[14]);
		float f_20_ = (aFloatArray4667[0] * class384_17_.aFloatArray4667[3] + aFloatArray4667[1] * class384_17_.aFloatArray4667[7] + aFloatArray4667[2] * class384_17_.aFloatArray4667[11] + aFloatArray4667[3] * class384_17_.aFloatArray4667[15]);
		float f_21_ = (aFloatArray4667[4] * class384_17_.aFloatArray4667[0] + aFloatArray4667[5] * class384_17_.aFloatArray4667[4] + aFloatArray4667[6] * class384_17_.aFloatArray4667[8] + aFloatArray4667[7] * class384_17_.aFloatArray4667[12]);
		float f_22_ = (aFloatArray4667[4] * class384_17_.aFloatArray4667[1] + aFloatArray4667[5] * class384_17_.aFloatArray4667[5] + aFloatArray4667[6] * class384_17_.aFloatArray4667[9] + aFloatArray4667[7] * class384_17_.aFloatArray4667[13]);
		float f_23_ = (aFloatArray4667[4] * class384_17_.aFloatArray4667[2] + aFloatArray4667[5] * class384_17_.aFloatArray4667[6] + aFloatArray4667[6] * class384_17_.aFloatArray4667[10] + aFloatArray4667[7] * class384_17_.aFloatArray4667[14]);
		float f_24_ = (aFloatArray4667[4] * class384_17_.aFloatArray4667[3] + aFloatArray4667[5] * class384_17_.aFloatArray4667[7] + aFloatArray4667[6] * class384_17_.aFloatArray4667[11] + aFloatArray4667[7] * class384_17_.aFloatArray4667[15]);
		float f_25_ = (aFloatArray4667[8] * class384_17_.aFloatArray4667[0] + aFloatArray4667[9] * class384_17_.aFloatArray4667[4] + aFloatArray4667[10] * class384_17_.aFloatArray4667[8] + aFloatArray4667[11] * class384_17_.aFloatArray4667[12]);
		float f_26_ = (aFloatArray4667[8] * class384_17_.aFloatArray4667[1] + aFloatArray4667[9] * class384_17_.aFloatArray4667[5] + aFloatArray4667[10] * class384_17_.aFloatArray4667[9] + aFloatArray4667[11] * class384_17_.aFloatArray4667[13]);
		float f_27_ = (aFloatArray4667[8] * class384_17_.aFloatArray4667[2] + aFloatArray4667[9] * class384_17_.aFloatArray4667[6] + aFloatArray4667[10] * class384_17_.aFloatArray4667[10] + aFloatArray4667[11] * class384_17_.aFloatArray4667[14]);
		float f_28_ = (aFloatArray4667[8] * class384_17_.aFloatArray4667[3] + aFloatArray4667[9] * class384_17_.aFloatArray4667[7] + aFloatArray4667[10] * class384_17_.aFloatArray4667[11] + aFloatArray4667[11] * class384_17_.aFloatArray4667[15]);
		float f_29_ = (aFloatArray4667[12] * class384_17_.aFloatArray4667[0] + aFloatArray4667[13] * class384_17_.aFloatArray4667[4] + aFloatArray4667[14] * class384_17_.aFloatArray4667[8] + aFloatArray4667[15] * class384_17_.aFloatArray4667[12]);
		float f_30_ = (aFloatArray4667[12] * class384_17_.aFloatArray4667[1] + aFloatArray4667[13] * class384_17_.aFloatArray4667[5] + aFloatArray4667[14] * class384_17_.aFloatArray4667[9] + aFloatArray4667[15] * class384_17_.aFloatArray4667[13]);
		float f_31_ = (aFloatArray4667[12] * class384_17_.aFloatArray4667[2] + aFloatArray4667[13] * class384_17_.aFloatArray4667[6] + aFloatArray4667[14] * class384_17_.aFloatArray4667[10] + aFloatArray4667[15] * class384_17_.aFloatArray4667[14]);
		float f_32_ = (aFloatArray4667[12] * class384_17_.aFloatArray4667[3] + aFloatArray4667[13] * class384_17_.aFloatArray4667[7] + aFloatArray4667[14] * class384_17_.aFloatArray4667[11] + aFloatArray4667[15] * class384_17_.aFloatArray4667[15]);
		aFloatArray4667[0] = f;
		aFloatArray4667[1] = f_18_;
		aFloatArray4667[2] = f_19_;
		aFloatArray4667[3] = f_20_;
		aFloatArray4667[4] = f_21_;
		aFloatArray4667[5] = f_22_;
		aFloatArray4667[6] = f_23_;
		aFloatArray4667[7] = f_24_;
		aFloatArray4667[8] = f_25_;
		aFloatArray4667[9] = f_26_;
		aFloatArray4667[10] = f_27_;
		aFloatArray4667[11] = f_28_;
		aFloatArray4667[12] = f_29_;
		aFloatArray4667[13] = f_30_;
		aFloatArray4667[14] = f_31_;
		aFloatArray4667[15] = f_32_;
	}

	public void method6524() {
		float f = 1.0F / method6612();
		float f_33_ = (aFloatArray4667[5] * aFloatArray4667[10] * aFloatArray4667[15] - aFloatArray4667[5] * aFloatArray4667[11] * aFloatArray4667[14] - aFloatArray4667[6] * aFloatArray4667[9] * aFloatArray4667[15] + aFloatArray4667[6] * aFloatArray4667[11] * aFloatArray4667[13] + aFloatArray4667[7] * aFloatArray4667[9] * aFloatArray4667[14] - (aFloatArray4667[7] * aFloatArray4667[10] * aFloatArray4667[13])) * f;
		float f_34_ = (-aFloatArray4667[1] * aFloatArray4667[10] * aFloatArray4667[15] + aFloatArray4667[1] * aFloatArray4667[11] * aFloatArray4667[14] + aFloatArray4667[2] * aFloatArray4667[9] * aFloatArray4667[15] - aFloatArray4667[2] * aFloatArray4667[11] * aFloatArray4667[13] - aFloatArray4667[3] * aFloatArray4667[9] * aFloatArray4667[14] + (aFloatArray4667[3] * aFloatArray4667[10] * aFloatArray4667[13])) * f;
		float f_35_ = ((aFloatArray4667[1] * aFloatArray4667[6] * aFloatArray4667[15] - aFloatArray4667[1] * aFloatArray4667[7] * aFloatArray4667[14] - aFloatArray4667[2] * aFloatArray4667[5] * aFloatArray4667[15] + aFloatArray4667[2] * aFloatArray4667[7] * aFloatArray4667[13] + aFloatArray4667[3] * aFloatArray4667[5] * aFloatArray4667[14] - (aFloatArray4667[3] * aFloatArray4667[6] * aFloatArray4667[13])) * f);
		float f_36_ = ((-aFloatArray4667[1] * aFloatArray4667[6] * aFloatArray4667[11] + aFloatArray4667[1] * aFloatArray4667[7] * aFloatArray4667[10] + aFloatArray4667[2] * aFloatArray4667[5] * aFloatArray4667[11] - aFloatArray4667[2] * aFloatArray4667[7] * aFloatArray4667[9] - aFloatArray4667[3] * aFloatArray4667[5] * aFloatArray4667[10] + aFloatArray4667[3] * aFloatArray4667[6] * aFloatArray4667[9]) * f);
		float f_37_ = (-aFloatArray4667[4] * aFloatArray4667[10] * aFloatArray4667[15] + aFloatArray4667[4] * aFloatArray4667[11] * aFloatArray4667[14] + aFloatArray4667[6] * aFloatArray4667[8] * aFloatArray4667[15] - aFloatArray4667[6] * aFloatArray4667[11] * aFloatArray4667[12] - aFloatArray4667[7] * aFloatArray4667[8] * aFloatArray4667[14] + (aFloatArray4667[7] * aFloatArray4667[10] * aFloatArray4667[12])) * f;
		float f_38_ = (aFloatArray4667[0] * aFloatArray4667[10] * aFloatArray4667[15] - aFloatArray4667[0] * aFloatArray4667[11] * aFloatArray4667[14] - aFloatArray4667[2] * aFloatArray4667[8] * aFloatArray4667[15] + aFloatArray4667[2] * aFloatArray4667[11] * aFloatArray4667[12] + aFloatArray4667[3] * aFloatArray4667[8] * aFloatArray4667[14] - (aFloatArray4667[3] * aFloatArray4667[10] * aFloatArray4667[12])) * f;
		float f_39_ = ((-aFloatArray4667[0] * aFloatArray4667[6] * aFloatArray4667[15] + aFloatArray4667[0] * aFloatArray4667[7] * aFloatArray4667[14] + aFloatArray4667[2] * aFloatArray4667[4] * aFloatArray4667[15] - aFloatArray4667[2] * aFloatArray4667[7] * aFloatArray4667[12] - aFloatArray4667[3] * aFloatArray4667[4] * aFloatArray4667[14] + (aFloatArray4667[3] * aFloatArray4667[6] * aFloatArray4667[12])) * f);
		float f_40_ = ((aFloatArray4667[0] * aFloatArray4667[6] * aFloatArray4667[11] - aFloatArray4667[0] * aFloatArray4667[7] * aFloatArray4667[10] - aFloatArray4667[2] * aFloatArray4667[4] * aFloatArray4667[11] + aFloatArray4667[2] * aFloatArray4667[7] * aFloatArray4667[8] + aFloatArray4667[3] * aFloatArray4667[4] * aFloatArray4667[10] - aFloatArray4667[3] * aFloatArray4667[6] * aFloatArray4667[8]) * f);
		float f_41_ = (aFloatArray4667[4] * aFloatArray4667[9] * aFloatArray4667[15] - aFloatArray4667[4] * aFloatArray4667[11] * aFloatArray4667[13] - aFloatArray4667[5] * aFloatArray4667[8] * aFloatArray4667[15] + aFloatArray4667[5] * aFloatArray4667[11] * aFloatArray4667[12] + aFloatArray4667[7] * aFloatArray4667[8] * aFloatArray4667[13] - (aFloatArray4667[7] * aFloatArray4667[9] * aFloatArray4667[12])) * f;
		float f_42_ = (-aFloatArray4667[0] * aFloatArray4667[9] * aFloatArray4667[15] + aFloatArray4667[0] * aFloatArray4667[11] * aFloatArray4667[13] + aFloatArray4667[1] * aFloatArray4667[8] * aFloatArray4667[15] - aFloatArray4667[1] * aFloatArray4667[11] * aFloatArray4667[12] - aFloatArray4667[3] * aFloatArray4667[8] * aFloatArray4667[13] + (aFloatArray4667[3] * aFloatArray4667[9] * aFloatArray4667[12])) * f;
		float f_43_ = ((aFloatArray4667[0] * aFloatArray4667[5] * aFloatArray4667[15] - aFloatArray4667[0] * aFloatArray4667[7] * aFloatArray4667[13] - aFloatArray4667[1] * aFloatArray4667[4] * aFloatArray4667[15] + aFloatArray4667[1] * aFloatArray4667[7] * aFloatArray4667[12] + aFloatArray4667[3] * aFloatArray4667[4] * aFloatArray4667[13] - (aFloatArray4667[3] * aFloatArray4667[5] * aFloatArray4667[12])) * f);
		float f_44_ = ((-aFloatArray4667[0] * aFloatArray4667[5] * aFloatArray4667[11] + aFloatArray4667[0] * aFloatArray4667[7] * aFloatArray4667[9] + aFloatArray4667[1] * aFloatArray4667[4] * aFloatArray4667[11] - aFloatArray4667[1] * aFloatArray4667[7] * aFloatArray4667[8] - aFloatArray4667[3] * aFloatArray4667[4] * aFloatArray4667[9] + aFloatArray4667[3] * aFloatArray4667[5] * aFloatArray4667[8]) * f);
		float f_45_ = (-aFloatArray4667[4] * aFloatArray4667[9] * aFloatArray4667[14] + aFloatArray4667[4] * aFloatArray4667[10] * aFloatArray4667[13] + aFloatArray4667[5] * aFloatArray4667[8] * aFloatArray4667[14] - aFloatArray4667[5] * aFloatArray4667[10] * aFloatArray4667[12] - aFloatArray4667[6] * aFloatArray4667[8] * aFloatArray4667[13] + (aFloatArray4667[6] * aFloatArray4667[9] * aFloatArray4667[12])) * f;
		float f_46_ = (aFloatArray4667[0] * aFloatArray4667[9] * aFloatArray4667[14] - aFloatArray4667[0] * aFloatArray4667[10] * aFloatArray4667[13] - aFloatArray4667[1] * aFloatArray4667[8] * aFloatArray4667[14] + aFloatArray4667[1] * aFloatArray4667[10] * aFloatArray4667[12] + aFloatArray4667[2] * aFloatArray4667[8] * aFloatArray4667[13] - (aFloatArray4667[2] * aFloatArray4667[9] * aFloatArray4667[12])) * f;
		float f_47_ = ((-aFloatArray4667[0] * aFloatArray4667[5] * aFloatArray4667[14] + aFloatArray4667[0] * aFloatArray4667[6] * aFloatArray4667[13] + aFloatArray4667[1] * aFloatArray4667[4] * aFloatArray4667[14] - aFloatArray4667[1] * aFloatArray4667[6] * aFloatArray4667[12] - aFloatArray4667[2] * aFloatArray4667[4] * aFloatArray4667[13] + (aFloatArray4667[2] * aFloatArray4667[5] * aFloatArray4667[12])) * f);
		float f_48_ = ((aFloatArray4667[0] * aFloatArray4667[5] * aFloatArray4667[10] - aFloatArray4667[0] * aFloatArray4667[6] * aFloatArray4667[9] - aFloatArray4667[1] * aFloatArray4667[4] * aFloatArray4667[10] + aFloatArray4667[1] * aFloatArray4667[6] * aFloatArray4667[8] + aFloatArray4667[2] * aFloatArray4667[4] * aFloatArray4667[9] - aFloatArray4667[2] * aFloatArray4667[5] * aFloatArray4667[8]) * f);
		aFloatArray4667[0] = f_33_;
		aFloatArray4667[1] = f_34_;
		aFloatArray4667[2] = f_35_;
		aFloatArray4667[3] = f_36_;
		aFloatArray4667[4] = f_37_;
		aFloatArray4667[5] = f_38_;
		aFloatArray4667[6] = f_39_;
		aFloatArray4667[7] = f_40_;
		aFloatArray4667[8] = f_41_;
		aFloatArray4667[9] = f_42_;
		aFloatArray4667[10] = f_43_;
		aFloatArray4667[11] = f_44_;
		aFloatArray4667[12] = f_45_;
		aFloatArray4667[13] = f_46_;
		aFloatArray4667[14] = f_47_;
		aFloatArray4667[15] = f_48_;
	}

	public void method6525(float f, float f_49_, float f_50_, float f_51_) {
		aFloatArray4667[0] = f;
		aFloatArray4667[1] = 0.0F;
		aFloatArray4667[2] = 0.0F;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = 0.0F;
		aFloatArray4667[5] = f_49_;
		aFloatArray4667[6] = 0.0F;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = 0.0F;
		aFloatArray4667[9] = 0.0F;
		aFloatArray4667[10] = f_50_;
		aFloatArray4667[11] = 0.0F;
		aFloatArray4667[12] = 0.0F;
		aFloatArray4667[13] = 0.0F;
		aFloatArray4667[14] = 0.0F;
		aFloatArray4667[15] = f_51_;
	}

	public boolean method6526() {
		return (aFloatArray4667[0] == 1.0F && aFloatArray4667[1] == 0.0F && aFloatArray4667[2] == 0.0F && aFloatArray4667[3] == 0.0F && aFloatArray4667[4] == 0.0F && aFloatArray4667[5] == 1.0F && aFloatArray4667[6] == 0.0F && aFloatArray4667[7] == 0.0F && aFloatArray4667[8] == 0.0F && aFloatArray4667[9] == 0.0F && aFloatArray4667[10] == 1.0F && aFloatArray4667[11] == 0.0F && aFloatArray4667[12] == 0.0F && aFloatArray4667[13] == 0.0F && aFloatArray4667[14] == 0.0F && aFloatArray4667[15] == 1.0F);
	}

	public void method6527(float f, float f_52_, float f_53_, float[] fs) {
		fs[0] = (aFloatArray4667[0] * f + aFloatArray4667[4] * f_52_ + aFloatArray4667[8] * f_53_ + aFloatArray4667[12]);
		fs[1] = (aFloatArray4667[1] * f + aFloatArray4667[5] * f_52_ + aFloatArray4667[9] * f_53_ + aFloatArray4667[13]);
		fs[2] = (aFloatArray4667[2] * f + aFloatArray4667[6] * f_52_ + aFloatArray4667[10] * f_53_ + aFloatArray4667[14]);
		if (fs.length > 3)
			fs[3] = (aFloatArray4667[3] * f + aFloatArray4667[7] * f_52_ + aFloatArray4667[11] * f_53_ + aFloatArray4667[15]);
	}

	public void method6528(float[] fs) {
		float f = fs[0];
		float f_54_ = fs[1];
		float f_55_ = fs[2];
		fs[0] = (aFloatArray4667[0] * f + aFloatArray4667[4] * f_54_ + aFloatArray4667[8] * f_55_ + aFloatArray4667[12]);
		fs[1] = (aFloatArray4667[1] * f + aFloatArray4667[5] * f_54_ + aFloatArray4667[9] * f_55_ + aFloatArray4667[13]);
		fs[2] = (aFloatArray4667[2] * f + aFloatArray4667[6] * f_54_ + aFloatArray4667[10] * f_55_ + aFloatArray4667[14]);
	}

	public void method6529(float f, float f_56_, float f_57_, float[] fs) {
		fs[0] = (aFloatArray4667[0] * f + aFloatArray4667[4] * f_56_ + aFloatArray4667[8] * f_57_ + aFloatArray4667[12]);
		fs[1] = (aFloatArray4667[1] * f + aFloatArray4667[5] * f_56_ + aFloatArray4667[9] * f_57_ + aFloatArray4667[13]);
		fs[2] = (aFloatArray4667[2] * f + aFloatArray4667[6] * f_56_ + aFloatArray4667[10] * f_57_ + aFloatArray4667[14]);
		if (fs.length > 3)
			fs[3] = (aFloatArray4667[3] * f + aFloatArray4667[7] * f_56_ + aFloatArray4667[11] * f_57_ + aFloatArray4667[15]);
	}

	public void method6530(float f, float f_58_, float f_59_, float f_60_, float f_61_, float f_62_) {
		aFloatArray4667[0] = 2.0F / (f_58_ - f);
		aFloatArray4667[1] = 0.0F;
		aFloatArray4667[2] = 0.0F;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = 0.0F;
		aFloatArray4667[5] = 2.0F / (f_60_ - f_59_);
		aFloatArray4667[6] = 0.0F;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = 0.0F;
		aFloatArray4667[9] = 0.0F;
		aFloatArray4667[10] = 2.0F / (f_62_ - f_61_);
		aFloatArray4667[11] = 0.0F;
		aFloatArray4667[12] = -(f_58_ + f) / (f_58_ - f);
		aFloatArray4667[13] = -(f_60_ + f_59_) / (f_60_ - f_59_);
		aFloatArray4667[14] = -(f_62_ + f_61_) / (f_62_ - f_61_);
		aFloatArray4667[15] = 1.0F;
	}

	public void method6531(float f, float f_63_, float f_64_, float f_65_, float f_66_, float f_67_, float f_68_, float f_69_) {
		aFloatArray4667[0] = f_64_ * 2.0F / f_68_;
		aFloatArray4667[1] = 0.0F;
		aFloatArray4667[2] = 0.0F;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = 0.0F;
		aFloatArray4667[5] = f_65_ * 2.0F / f_69_;
		aFloatArray4667[6] = 0.0F;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = 2.0F * f / f_68_ - 1.0F;
		aFloatArray4667[9] = 2.0F * f_63_ / f_69_ - 1.0F;
		aFloatArray4667[10] = (f_67_ + f_66_) / (f_67_ - f_66_);
		aFloatArray4667[11] = 1.0F;
		aFloatArray4667[12] = 0.0F;
		aFloatArray4667[13] = 0.0F;
		aFloatArray4667[14] = 2.0F * f_67_ * f_66_ / (f_66_ - f_67_);
		aFloatArray4667[15] = 0.0F;
	}

	public void method6532(float f, float f_70_, float f_71_, float f_72_, float f_73_, float f_74_, float f_75_, float f_76_, float f_77_) {
		method6530(-(f * f_77_) / f_71_, f_77_ * (f_75_ - f) / f_71_, -(f_70_ * f_77_) / f_72_, f_77_ * (f_76_ - f_70_) / f_72_, f_73_, f_74_);
	}

	public float method6533() {
		return (-(aFloatArray4667[15] + aFloatArray4667[14]) / (aFloatArray4667[11] + aFloatArray4667[10]));
	}

	public float[] method6534(float[] fs) {
		System.arraycopy(aFloatArray4667, 0, fs, 0, 16);
		fs[3] = 0.0F;
		fs[7] = 0.0F;
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public float[] method6535(float[] fs) {
		float f = aFloatArray4667[3] + aFloatArray4667[0];
		float f_78_ = aFloatArray4667[7] + aFloatArray4667[4];
		float f_79_ = aFloatArray4667[11] + aFloatArray4667[8];
		double d = Math.sqrt((double) (f * f + f_78_ * f_78_ + f_79_ * f_79_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_78_ / d);
		fs[2] = (float) ((double) f_79_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] + aFloatArray4667[12]) / d);
		return fs;
	}

	public float[] method6536(float[] fs) {
		float f = aFloatArray4667[3] - aFloatArray4667[0];
		float f_80_ = aFloatArray4667[7] - aFloatArray4667[4];
		float f_81_ = aFloatArray4667[11] - aFloatArray4667[8];
		double d = Math.sqrt((double) (f * f + f_80_ * f_80_ + f_81_ * f_81_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_80_ / d);
		fs[2] = (float) ((double) f_81_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] - aFloatArray4667[12]) / d);
		return fs;
	}

	public void method6537(Class294 class294) {
		aFloatArray4667[0] = ((Class294) class294).aFloat3519;
		aFloatArray4667[1] = ((Class294) class294).aFloat3514;
		aFloatArray4667[2] = ((Class294) class294).aFloat3516;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = ((Class294) class294).aFloat3517;
		aFloatArray4667[5] = ((Class294) class294).aFloat3523;
		aFloatArray4667[6] = ((Class294) class294).aFloat3522;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = ((Class294) class294).aFloat3520;
		aFloatArray4667[9] = ((Class294) class294).aFloat3513;
		aFloatArray4667[10] = ((Class294) class294).aFloat3521;
		aFloatArray4667[11] = 0.0F;
		aFloatArray4667[12] = ((Class294) class294).aFloat3515;
		aFloatArray4667[13] = ((Class294) class294).aFloat3524;
		aFloatArray4667[14] = ((Class294) class294).aFloat3525;
		aFloatArray4667[15] = 1.0F;
	}

	public float[] method6538(float[] fs) {
		float f = aFloatArray4667[3] - aFloatArray4667[1];
		float f_82_ = aFloatArray4667[7] - aFloatArray4667[5];
		float f_83_ = aFloatArray4667[11] - aFloatArray4667[9];
		double d = Math.sqrt((double) (f * f + f_82_ * f_82_ + f_83_ * f_83_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_82_ / d);
		fs[2] = (float) ((double) f_83_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] - aFloatArray4667[13]) / d);
		return fs;
	}

	public float[] method6539(float[] fs) {
		float f = aFloatArray4667[3] + aFloatArray4667[2];
		float f_84_ = aFloatArray4667[7] + aFloatArray4667[6];
		float f_85_ = aFloatArray4667[11] + aFloatArray4667[10];
		double d = Math.sqrt((double) (f * f + f_84_ * f_84_ + f_85_ * f_85_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_84_ / d);
		fs[2] = (float) ((double) f_85_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] + aFloatArray4667[14]) / d);
		return fs;
	}

	public float[] method6540(float[] fs) {
		float f = aFloatArray4667[3] - aFloatArray4667[2];
		float f_86_ = aFloatArray4667[7] - aFloatArray4667[6];
		float f_87_ = aFloatArray4667[11] - aFloatArray4667[10];
		double d = Math.sqrt((double) (f * f + f_86_ * f_86_ + f_87_ * f_87_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_86_ / d);
		fs[2] = (float) ((double) f_87_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] - aFloatArray4667[14]) / d);
		return fs;
	}

	public float method6541() {
		return (-(aFloatArray4667[15] + aFloatArray4667[14]) / (aFloatArray4667[11] + aFloatArray4667[10]));
	}

	public String method6542() {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			for (int i_88_ = 0; i_88_ < 4; i_88_++) {
				if (i_88_ > 0)
					stringbuilder.append("\t");
				stringbuilder.append(aFloatArray4667[i * 4 + i_88_]);
			}
			stringbuilder.append("\n");
		}
		return stringbuilder.toString();
	}

	public float[] method6543(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[1];
		fs[2] = aFloatArray4667[4];
		fs[3] = aFloatArray4667[5];
		fs[4] = aFloatArray4667[8];
		fs[5] = aFloatArray4667[9];
		fs[6] = aFloatArray4667[12];
		fs[7] = aFloatArray4667[13];
		return fs;
	}

	public float[] method6544(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[1];
		fs[2] = aFloatArray4667[2];
		fs[3] = aFloatArray4667[4];
		fs[4] = aFloatArray4667[5];
		fs[5] = aFloatArray4667[6];
		fs[6] = aFloatArray4667[8];
		fs[7] = aFloatArray4667[9];
		fs[8] = aFloatArray4667[10];
		return fs;
	}

	public float[] method6545(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[4];
		fs[2] = aFloatArray4667[8];
		fs[3] = aFloatArray4667[12];
		fs[4] = aFloatArray4667[1];
		fs[5] = aFloatArray4667[5];
		fs[6] = aFloatArray4667[9];
		fs[7] = aFloatArray4667[13];
		fs[8] = aFloatArray4667[2];
		fs[9] = aFloatArray4667[6];
		fs[10] = aFloatArray4667[10];
		fs[11] = aFloatArray4667[14];
		fs[12] = aFloatArray4667[3];
		fs[13] = aFloatArray4667[7];
		fs[14] = aFloatArray4667[11];
		fs[15] = aFloatArray4667[15];
		return fs;
	}

	public float[] method6546(float[] fs) {
		float f = aFloatArray4667[3] + aFloatArray4667[2];
		float f_89_ = aFloatArray4667[7] + aFloatArray4667[6];
		float f_90_ = aFloatArray4667[11] + aFloatArray4667[10];
		double d = Math.sqrt((double) (f * f + f_89_ * f_89_ + f_90_ * f_90_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_89_ / d);
		fs[2] = (float) ((double) f_90_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] + aFloatArray4667[14]) / d);
		return fs;
	}

	public void method6547(float f, float f_91_, float f_92_, float f_93_, float f_94_, float f_95_) {
		aFloatArray4667[0] = 2.0F / (f_91_ - f);
		aFloatArray4667[1] = 0.0F;
		aFloatArray4667[2] = 0.0F;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = 0.0F;
		aFloatArray4667[5] = 2.0F / (f_93_ - f_92_);
		aFloatArray4667[6] = 0.0F;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = 0.0F;
		aFloatArray4667[9] = 0.0F;
		aFloatArray4667[10] = 2.0F / (f_95_ - f_94_);
		aFloatArray4667[11] = 0.0F;
		aFloatArray4667[12] = -(f_91_ + f) / (f_91_ - f);
		aFloatArray4667[13] = -(f_93_ + f_92_) / (f_93_ - f_92_);
		aFloatArray4667[14] = -(f_95_ + f_94_) / (f_95_ - f_94_);
		aFloatArray4667[15] = 1.0F;
	}

	public float[] method6548(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[1];
		fs[2] = 0.0F;
		fs[3] = 0.0F;
		fs[4] = aFloatArray4667[4];
		fs[5] = aFloatArray4667[5];
		fs[6] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = aFloatArray4667[12];
		fs[9] = aFloatArray4667[13];
		fs[10] = aFloatArray4667[14];
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public void method6549(int i, int i_96_, int i_97_, float f, float f_98_, float f_99_) {
		if (i != 0) {
			float f_100_ = Class297.aFloatArray3536[i & 0x3fff];
			float f_101_ = Class297.aFloatArray3537[i & 0x3fff];
			aFloatArray4667[0] = f_100_ * (float) i_96_;
			aFloatArray4667[5] = f_100_ * (float) i_97_;
			aFloatArray4667[1] = f_101_ * (float) i_96_;
			aFloatArray4667[4] = -f_101_ * (float) i_97_;
			aFloatArray4667[10] = 1.0F;
			float[] fs = aFloatArray4667;
			float[] fs_102_ = aFloatArray4667;
			float[] fs_103_ = aFloatArray4667;
			aFloatArray4667[9] = 0.0F;
			fs_103_[8] = 0.0F;
			fs_102_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray4667[0] = (float) i_96_;
			aFloatArray4667[5] = (float) i_97_;
			aFloatArray4667[10] = 1.0F;
			float[] fs = aFloatArray4667;
			float[] fs_104_ = aFloatArray4667;
			float[] fs_105_ = aFloatArray4667;
			float[] fs_106_ = aFloatArray4667;
			float[] fs_107_ = aFloatArray4667;
			aFloatArray4667[9] = 0.0F;
			fs_107_[8] = 0.0F;
			fs_106_[6] = 0.0F;
			fs_105_[4] = 0.0F;
			fs_104_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray4667;
		float[] fs_108_ = aFloatArray4667;
		aFloatArray4667[11] = 0.0F;
		fs_108_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray4667[15] = 1.0F;
		aFloatArray4667[12] = f;
		aFloatArray4667[13] = f_98_;
		aFloatArray4667[14] = f_99_;
	}

	public float[] method6550(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[1];
		fs[2] = 0.0F;
		fs[3] = 0.0F;
		fs[4] = aFloatArray4667[4];
		fs[5] = aFloatArray4667[5];
		fs[6] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = aFloatArray4667[12];
		fs[9] = aFloatArray4667[13];
		fs[10] = aFloatArray4667[14];
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public int hashCode() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(aFloatArray4667);
		return i;
	}

	public float[] method6551(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[1];
		fs[2] = aFloatArray4667[4];
		fs[3] = aFloatArray4667[5];
		fs[4] = aFloatArray4667[8];
		fs[5] = aFloatArray4667[9];
		fs[6] = aFloatArray4667[12];
		fs[7] = aFloatArray4667[13];
		return fs;
	}

	public void method6552() {
		float f = aFloatArray4667[0];
		float f_109_ = aFloatArray4667[4];
		float f_110_ = aFloatArray4667[8];
		float f_111_ = aFloatArray4667[12];
		float f_112_ = aFloatArray4667[1];
		float f_113_ = aFloatArray4667[5];
		float f_114_ = aFloatArray4667[9];
		float f_115_ = aFloatArray4667[13];
		float f_116_ = aFloatArray4667[2];
		float f_117_ = aFloatArray4667[6];
		float f_118_ = aFloatArray4667[10];
		float f_119_ = aFloatArray4667[14];
		float f_120_ = aFloatArray4667[3];
		float f_121_ = aFloatArray4667[7];
		float f_122_ = aFloatArray4667[11];
		float f_123_ = aFloatArray4667[15];
		aFloatArray4667[0] = f;
		aFloatArray4667[1] = f_109_;
		aFloatArray4667[2] = f_110_;
		aFloatArray4667[3] = f_111_;
		aFloatArray4667[4] = f_112_;
		aFloatArray4667[5] = f_113_;
		aFloatArray4667[6] = f_114_;
		aFloatArray4667[7] = f_115_;
		aFloatArray4667[8] = f_116_;
		aFloatArray4667[9] = f_117_;
		aFloatArray4667[10] = f_118_;
		aFloatArray4667[11] = f_119_;
		aFloatArray4667[12] = f_120_;
		aFloatArray4667[13] = f_121_;
		aFloatArray4667[14] = f_122_;
		aFloatArray4667[15] = f_123_;
	}

	float method6553() {
		return ((aFloatArray4667[0] * aFloatArray4667[5] * aFloatArray4667[10] * aFloatArray4667[15]) - (aFloatArray4667[0] * aFloatArray4667[5] * aFloatArray4667[11] * aFloatArray4667[14]) - (aFloatArray4667[0] * aFloatArray4667[6] * aFloatArray4667[9] * aFloatArray4667[15]) + (aFloatArray4667[0] * aFloatArray4667[6] * aFloatArray4667[11] * aFloatArray4667[13]) + (aFloatArray4667[0] * aFloatArray4667[7] * aFloatArray4667[9] * aFloatArray4667[14])
				- (aFloatArray4667[0] * aFloatArray4667[7] * aFloatArray4667[10] * aFloatArray4667[13]) - (aFloatArray4667[1] * aFloatArray4667[4] * aFloatArray4667[10] * aFloatArray4667[15]) + (aFloatArray4667[1] * aFloatArray4667[4] * aFloatArray4667[11] * aFloatArray4667[14]) + (aFloatArray4667[1] * aFloatArray4667[6] * aFloatArray4667[8] * aFloatArray4667[15]) - (aFloatArray4667[1] * aFloatArray4667[6] * aFloatArray4667[11] * aFloatArray4667[12])
				- (aFloatArray4667[1] * aFloatArray4667[7] * aFloatArray4667[8] * aFloatArray4667[14]) + (aFloatArray4667[1] * aFloatArray4667[7] * aFloatArray4667[10] * aFloatArray4667[12]) + (aFloatArray4667[2] * aFloatArray4667[4] * aFloatArray4667[9] * aFloatArray4667[15]) - (aFloatArray4667[2] * aFloatArray4667[4] * aFloatArray4667[11] * aFloatArray4667[13]) - (aFloatArray4667[2] * aFloatArray4667[5] * aFloatArray4667[8] * aFloatArray4667[15])
				+ (aFloatArray4667[2] * aFloatArray4667[5] * aFloatArray4667[11] * aFloatArray4667[12]) + (aFloatArray4667[2] * aFloatArray4667[7] * aFloatArray4667[8] * aFloatArray4667[13]) - (aFloatArray4667[2] * aFloatArray4667[7] * aFloatArray4667[9] * aFloatArray4667[12]) - (aFloatArray4667[3] * aFloatArray4667[4] * aFloatArray4667[9] * aFloatArray4667[14]) + (aFloatArray4667[3] * aFloatArray4667[4] * aFloatArray4667[10] * aFloatArray4667[13])
				+ (aFloatArray4667[3] * aFloatArray4667[5] * aFloatArray4667[8] * aFloatArray4667[14]) - (aFloatArray4667[3] * aFloatArray4667[5] * aFloatArray4667[10] * aFloatArray4667[12]) - (aFloatArray4667[3] * aFloatArray4667[6] * aFloatArray4667[8] * aFloatArray4667[13]) + (aFloatArray4667[3] * aFloatArray4667[6] * aFloatArray4667[9] * aFloatArray4667[12]));
	}

	public void method6554() {
		aFloatArray4667[0] = 1.0F;
		aFloatArray4667[1] = 0.0F;
		aFloatArray4667[2] = 0.0F;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = 0.0F;
		aFloatArray4667[5] = 1.0F;
		aFloatArray4667[6] = 0.0F;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = 0.0F;
		aFloatArray4667[9] = 0.0F;
		aFloatArray4667[10] = 1.0F;
		aFloatArray4667[11] = 0.0F;
		aFloatArray4667[12] = 0.0F;
		aFloatArray4667[13] = 0.0F;
		aFloatArray4667[14] = 0.0F;
		aFloatArray4667[15] = 1.0F;
	}

	public void method6555() {
		aFloatArray4667[0] = 1.0F;
		aFloatArray4667[1] = 0.0F;
		aFloatArray4667[2] = 0.0F;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = 0.0F;
		aFloatArray4667[5] = 1.0F;
		aFloatArray4667[6] = 0.0F;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = 0.0F;
		aFloatArray4667[9] = 0.0F;
		aFloatArray4667[10] = 1.0F;
		aFloatArray4667[11] = 0.0F;
		aFloatArray4667[12] = 0.0F;
		aFloatArray4667[13] = 0.0F;
		aFloatArray4667[14] = 0.0F;
		aFloatArray4667[15] = 1.0F;
	}

	public void method6556() {
		aFloatArray4667[0] = 1.0F;
		aFloatArray4667[1] = 0.0F;
		aFloatArray4667[2] = 0.0F;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = 0.0F;
		aFloatArray4667[5] = 1.0F;
		aFloatArray4667[6] = 0.0F;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = 0.0F;
		aFloatArray4667[9] = 0.0F;
		aFloatArray4667[10] = 1.0F;
		aFloatArray4667[11] = 0.0F;
		aFloatArray4667[12] = 0.0F;
		aFloatArray4667[13] = 0.0F;
		aFloatArray4667[14] = 0.0F;
		aFloatArray4667[15] = 1.0F;
	}

	public void method6557() {
		aFloatArray4667[0] = 1.0F;
		aFloatArray4667[1] = 0.0F;
		aFloatArray4667[2] = 0.0F;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = 0.0F;
		aFloatArray4667[5] = 1.0F;
		aFloatArray4667[6] = 0.0F;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = 0.0F;
		aFloatArray4667[9] = 0.0F;
		aFloatArray4667[10] = 1.0F;
		aFloatArray4667[11] = 0.0F;
		aFloatArray4667[12] = 0.0F;
		aFloatArray4667[13] = 0.0F;
		aFloatArray4667[14] = 0.0F;
		aFloatArray4667[15] = 1.0F;
	}

	public void method6558() {
		float f = aFloatArray4667[0];
		float f_124_ = aFloatArray4667[4];
		float f_125_ = aFloatArray4667[8];
		float f_126_ = aFloatArray4667[12];
		float f_127_ = aFloatArray4667[1];
		float f_128_ = aFloatArray4667[5];
		float f_129_ = aFloatArray4667[9];
		float f_130_ = aFloatArray4667[13];
		float f_131_ = aFloatArray4667[2];
		float f_132_ = aFloatArray4667[6];
		float f_133_ = aFloatArray4667[10];
		float f_134_ = aFloatArray4667[14];
		float f_135_ = aFloatArray4667[3];
		float f_136_ = aFloatArray4667[7];
		float f_137_ = aFloatArray4667[11];
		float f_138_ = aFloatArray4667[15];
		aFloatArray4667[0] = f;
		aFloatArray4667[1] = f_124_;
		aFloatArray4667[2] = f_125_;
		aFloatArray4667[3] = f_126_;
		aFloatArray4667[4] = f_127_;
		aFloatArray4667[5] = f_128_;
		aFloatArray4667[6] = f_129_;
		aFloatArray4667[7] = f_130_;
		aFloatArray4667[8] = f_131_;
		aFloatArray4667[9] = f_132_;
		aFloatArray4667[10] = f_133_;
		aFloatArray4667[11] = f_134_;
		aFloatArray4667[12] = f_135_;
		aFloatArray4667[13] = f_136_;
		aFloatArray4667[14] = f_137_;
		aFloatArray4667[15] = f_138_;
	}

	public void method6559(Class384 class384_139_) {
		System.arraycopy(class384_139_.aFloatArray4667, 0, aFloatArray4667, 0, 16);
	}

	public void method6560(Class384 class384_140_, Class384 class384_141_) {
		float f = ((class384_140_.aFloatArray4667[0] * class384_141_.aFloatArray4667[0]) + (class384_140_.aFloatArray4667[1] * class384_141_.aFloatArray4667[4]) + (class384_140_.aFloatArray4667[2] * class384_141_.aFloatArray4667[8]) + (class384_140_.aFloatArray4667[3] * class384_141_.aFloatArray4667[12]));
		float f_142_ = ((class384_140_.aFloatArray4667[0] * class384_141_.aFloatArray4667[1]) + (class384_140_.aFloatArray4667[1] * class384_141_.aFloatArray4667[5]) + (class384_140_.aFloatArray4667[2] * class384_141_.aFloatArray4667[9]) + (class384_140_.aFloatArray4667[3] * class384_141_.aFloatArray4667[13]));
		float f_143_ = ((class384_140_.aFloatArray4667[0] * class384_141_.aFloatArray4667[2]) + (class384_140_.aFloatArray4667[1] * class384_141_.aFloatArray4667[6]) + (class384_140_.aFloatArray4667[2] * class384_141_.aFloatArray4667[10]) + (class384_140_.aFloatArray4667[3] * class384_141_.aFloatArray4667[14]));
		float f_144_ = ((class384_140_.aFloatArray4667[0] * class384_141_.aFloatArray4667[3]) + (class384_140_.aFloatArray4667[1] * class384_141_.aFloatArray4667[7]) + (class384_140_.aFloatArray4667[2] * class384_141_.aFloatArray4667[11]) + (class384_140_.aFloatArray4667[3] * class384_141_.aFloatArray4667[15]));
		float f_145_ = ((class384_140_.aFloatArray4667[4] * class384_141_.aFloatArray4667[0]) + (class384_140_.aFloatArray4667[5] * class384_141_.aFloatArray4667[4]) + (class384_140_.aFloatArray4667[6] * class384_141_.aFloatArray4667[8]) + (class384_140_.aFloatArray4667[7] * class384_141_.aFloatArray4667[12]));
		float f_146_ = ((class384_140_.aFloatArray4667[4] * class384_141_.aFloatArray4667[1]) + (class384_140_.aFloatArray4667[5] * class384_141_.aFloatArray4667[5]) + (class384_140_.aFloatArray4667[6] * class384_141_.aFloatArray4667[9]) + (class384_140_.aFloatArray4667[7] * class384_141_.aFloatArray4667[13]));
		float f_147_ = ((class384_140_.aFloatArray4667[4] * class384_141_.aFloatArray4667[2]) + (class384_140_.aFloatArray4667[5] * class384_141_.aFloatArray4667[6]) + (class384_140_.aFloatArray4667[6] * class384_141_.aFloatArray4667[10]) + (class384_140_.aFloatArray4667[7] * class384_141_.aFloatArray4667[14]));
		float f_148_ = ((class384_140_.aFloatArray4667[4] * class384_141_.aFloatArray4667[3]) + (class384_140_.aFloatArray4667[5] * class384_141_.aFloatArray4667[7]) + (class384_140_.aFloatArray4667[6] * class384_141_.aFloatArray4667[11]) + (class384_140_.aFloatArray4667[7] * class384_141_.aFloatArray4667[15]));
		float f_149_ = ((class384_140_.aFloatArray4667[8] * class384_141_.aFloatArray4667[0]) + (class384_140_.aFloatArray4667[9] * class384_141_.aFloatArray4667[4]) + (class384_140_.aFloatArray4667[10] * class384_141_.aFloatArray4667[8]) + (class384_140_.aFloatArray4667[11] * class384_141_.aFloatArray4667[12]));
		float f_150_ = ((class384_140_.aFloatArray4667[8] * class384_141_.aFloatArray4667[1]) + (class384_140_.aFloatArray4667[9] * class384_141_.aFloatArray4667[5]) + (class384_140_.aFloatArray4667[10] * class384_141_.aFloatArray4667[9]) + (class384_140_.aFloatArray4667[11] * class384_141_.aFloatArray4667[13]));
		float f_151_ = ((class384_140_.aFloatArray4667[8] * class384_141_.aFloatArray4667[2]) + (class384_140_.aFloatArray4667[9] * class384_141_.aFloatArray4667[6]) + (class384_140_.aFloatArray4667[10] * class384_141_.aFloatArray4667[10]) + (class384_140_.aFloatArray4667[11] * class384_141_.aFloatArray4667[14]));
		float f_152_ = ((class384_140_.aFloatArray4667[8] * class384_141_.aFloatArray4667[3]) + (class384_140_.aFloatArray4667[9] * class384_141_.aFloatArray4667[7]) + (class384_140_.aFloatArray4667[10] * class384_141_.aFloatArray4667[11]) + (class384_140_.aFloatArray4667[11] * class384_141_.aFloatArray4667[15]));
		float f_153_ = ((class384_140_.aFloatArray4667[12] * class384_141_.aFloatArray4667[0]) + (class384_140_.aFloatArray4667[13] * class384_141_.aFloatArray4667[4]) + (class384_140_.aFloatArray4667[14] * class384_141_.aFloatArray4667[8]) + (class384_140_.aFloatArray4667[15] * class384_141_.aFloatArray4667[12]));
		float f_154_ = ((class384_140_.aFloatArray4667[12] * class384_141_.aFloatArray4667[1]) + (class384_140_.aFloatArray4667[13] * class384_141_.aFloatArray4667[5]) + (class384_140_.aFloatArray4667[14] * class384_141_.aFloatArray4667[9]) + (class384_140_.aFloatArray4667[15] * class384_141_.aFloatArray4667[13]));
		float f_155_ = ((class384_140_.aFloatArray4667[12] * class384_141_.aFloatArray4667[2]) + (class384_140_.aFloatArray4667[13] * class384_141_.aFloatArray4667[6]) + (class384_140_.aFloatArray4667[14] * class384_141_.aFloatArray4667[10]) + (class384_140_.aFloatArray4667[15] * class384_141_.aFloatArray4667[14]));
		float f_156_ = ((class384_140_.aFloatArray4667[12] * class384_141_.aFloatArray4667[3]) + (class384_140_.aFloatArray4667[13] * class384_141_.aFloatArray4667[7]) + (class384_140_.aFloatArray4667[14] * class384_141_.aFloatArray4667[11]) + (class384_140_.aFloatArray4667[15] * class384_141_.aFloatArray4667[15]));
		aFloatArray4667[0] = f;
		aFloatArray4667[1] = f_142_;
		aFloatArray4667[2] = f_143_;
		aFloatArray4667[3] = f_144_;
		aFloatArray4667[4] = f_145_;
		aFloatArray4667[5] = f_146_;
		aFloatArray4667[6] = f_147_;
		aFloatArray4667[7] = f_148_;
		aFloatArray4667[8] = f_149_;
		aFloatArray4667[9] = f_150_;
		aFloatArray4667[10] = f_151_;
		aFloatArray4667[11] = f_152_;
		aFloatArray4667[12] = f_153_;
		aFloatArray4667[13] = f_154_;
		aFloatArray4667[14] = f_155_;
		aFloatArray4667[15] = f_156_;
	}

	public void method6561(Class384 class384_157_, Class384 class384_158_) {
		float f = ((class384_157_.aFloatArray4667[0] * class384_158_.aFloatArray4667[0]) + (class384_157_.aFloatArray4667[1] * class384_158_.aFloatArray4667[4]) + (class384_157_.aFloatArray4667[2] * class384_158_.aFloatArray4667[8]) + (class384_157_.aFloatArray4667[3] * class384_158_.aFloatArray4667[12]));
		float f_159_ = ((class384_157_.aFloatArray4667[0] * class384_158_.aFloatArray4667[1]) + (class384_157_.aFloatArray4667[1] * class384_158_.aFloatArray4667[5]) + (class384_157_.aFloatArray4667[2] * class384_158_.aFloatArray4667[9]) + (class384_157_.aFloatArray4667[3] * class384_158_.aFloatArray4667[13]));
		float f_160_ = ((class384_157_.aFloatArray4667[0] * class384_158_.aFloatArray4667[2]) + (class384_157_.aFloatArray4667[1] * class384_158_.aFloatArray4667[6]) + (class384_157_.aFloatArray4667[2] * class384_158_.aFloatArray4667[10]) + (class384_157_.aFloatArray4667[3] * class384_158_.aFloatArray4667[14]));
		float f_161_ = ((class384_157_.aFloatArray4667[0] * class384_158_.aFloatArray4667[3]) + (class384_157_.aFloatArray4667[1] * class384_158_.aFloatArray4667[7]) + (class384_157_.aFloatArray4667[2] * class384_158_.aFloatArray4667[11]) + (class384_157_.aFloatArray4667[3] * class384_158_.aFloatArray4667[15]));
		float f_162_ = ((class384_157_.aFloatArray4667[4] * class384_158_.aFloatArray4667[0]) + (class384_157_.aFloatArray4667[5] * class384_158_.aFloatArray4667[4]) + (class384_157_.aFloatArray4667[6] * class384_158_.aFloatArray4667[8]) + (class384_157_.aFloatArray4667[7] * class384_158_.aFloatArray4667[12]));
		float f_163_ = ((class384_157_.aFloatArray4667[4] * class384_158_.aFloatArray4667[1]) + (class384_157_.aFloatArray4667[5] * class384_158_.aFloatArray4667[5]) + (class384_157_.aFloatArray4667[6] * class384_158_.aFloatArray4667[9]) + (class384_157_.aFloatArray4667[7] * class384_158_.aFloatArray4667[13]));
		float f_164_ = ((class384_157_.aFloatArray4667[4] * class384_158_.aFloatArray4667[2]) + (class384_157_.aFloatArray4667[5] * class384_158_.aFloatArray4667[6]) + (class384_157_.aFloatArray4667[6] * class384_158_.aFloatArray4667[10]) + (class384_157_.aFloatArray4667[7] * class384_158_.aFloatArray4667[14]));
		float f_165_ = ((class384_157_.aFloatArray4667[4] * class384_158_.aFloatArray4667[3]) + (class384_157_.aFloatArray4667[5] * class384_158_.aFloatArray4667[7]) + (class384_157_.aFloatArray4667[6] * class384_158_.aFloatArray4667[11]) + (class384_157_.aFloatArray4667[7] * class384_158_.aFloatArray4667[15]));
		float f_166_ = ((class384_157_.aFloatArray4667[8] * class384_158_.aFloatArray4667[0]) + (class384_157_.aFloatArray4667[9] * class384_158_.aFloatArray4667[4]) + (class384_157_.aFloatArray4667[10] * class384_158_.aFloatArray4667[8]) + (class384_157_.aFloatArray4667[11] * class384_158_.aFloatArray4667[12]));
		float f_167_ = ((class384_157_.aFloatArray4667[8] * class384_158_.aFloatArray4667[1]) + (class384_157_.aFloatArray4667[9] * class384_158_.aFloatArray4667[5]) + (class384_157_.aFloatArray4667[10] * class384_158_.aFloatArray4667[9]) + (class384_157_.aFloatArray4667[11] * class384_158_.aFloatArray4667[13]));
		float f_168_ = ((class384_157_.aFloatArray4667[8] * class384_158_.aFloatArray4667[2]) + (class384_157_.aFloatArray4667[9] * class384_158_.aFloatArray4667[6]) + (class384_157_.aFloatArray4667[10] * class384_158_.aFloatArray4667[10]) + (class384_157_.aFloatArray4667[11] * class384_158_.aFloatArray4667[14]));
		float f_169_ = ((class384_157_.aFloatArray4667[8] * class384_158_.aFloatArray4667[3]) + (class384_157_.aFloatArray4667[9] * class384_158_.aFloatArray4667[7]) + (class384_157_.aFloatArray4667[10] * class384_158_.aFloatArray4667[11]) + (class384_157_.aFloatArray4667[11] * class384_158_.aFloatArray4667[15]));
		float f_170_ = ((class384_157_.aFloatArray4667[12] * class384_158_.aFloatArray4667[0]) + (class384_157_.aFloatArray4667[13] * class384_158_.aFloatArray4667[4]) + (class384_157_.aFloatArray4667[14] * class384_158_.aFloatArray4667[8]) + (class384_157_.aFloatArray4667[15] * class384_158_.aFloatArray4667[12]));
		float f_171_ = ((class384_157_.aFloatArray4667[12] * class384_158_.aFloatArray4667[1]) + (class384_157_.aFloatArray4667[13] * class384_158_.aFloatArray4667[5]) + (class384_157_.aFloatArray4667[14] * class384_158_.aFloatArray4667[9]) + (class384_157_.aFloatArray4667[15] * class384_158_.aFloatArray4667[13]));
		float f_172_ = ((class384_157_.aFloatArray4667[12] * class384_158_.aFloatArray4667[2]) + (class384_157_.aFloatArray4667[13] * class384_158_.aFloatArray4667[6]) + (class384_157_.aFloatArray4667[14] * class384_158_.aFloatArray4667[10]) + (class384_157_.aFloatArray4667[15] * class384_158_.aFloatArray4667[14]));
		float f_173_ = ((class384_157_.aFloatArray4667[12] * class384_158_.aFloatArray4667[3]) + (class384_157_.aFloatArray4667[13] * class384_158_.aFloatArray4667[7]) + (class384_157_.aFloatArray4667[14] * class384_158_.aFloatArray4667[11]) + (class384_157_.aFloatArray4667[15] * class384_158_.aFloatArray4667[15]));
		aFloatArray4667[0] = f;
		aFloatArray4667[1] = f_159_;
		aFloatArray4667[2] = f_160_;
		aFloatArray4667[3] = f_161_;
		aFloatArray4667[4] = f_162_;
		aFloatArray4667[5] = f_163_;
		aFloatArray4667[6] = f_164_;
		aFloatArray4667[7] = f_165_;
		aFloatArray4667[8] = f_166_;
		aFloatArray4667[9] = f_167_;
		aFloatArray4667[10] = f_168_;
		aFloatArray4667[11] = f_169_;
		aFloatArray4667[12] = f_170_;
		aFloatArray4667[13] = f_171_;
		aFloatArray4667[14] = f_172_;
		aFloatArray4667[15] = f_173_;
	}

	public void method6562(Class384 class384_174_) {
		System.arraycopy(class384_174_.aFloatArray4667, 0, aFloatArray4667, 0, 16);
	}

	public void method6563(Class384 class384_175_) {
		float f = (aFloatArray4667[0] * class384_175_.aFloatArray4667[0] + aFloatArray4667[1] * class384_175_.aFloatArray4667[4] + aFloatArray4667[2] * class384_175_.aFloatArray4667[8] + aFloatArray4667[3] * class384_175_.aFloatArray4667[12]);
		float f_176_ = (aFloatArray4667[0] * class384_175_.aFloatArray4667[1] + aFloatArray4667[1] * class384_175_.aFloatArray4667[5] + aFloatArray4667[2] * class384_175_.aFloatArray4667[9] + aFloatArray4667[3] * class384_175_.aFloatArray4667[13]);
		float f_177_ = (aFloatArray4667[0] * class384_175_.aFloatArray4667[2] + aFloatArray4667[1] * class384_175_.aFloatArray4667[6] + aFloatArray4667[2] * class384_175_.aFloatArray4667[10] + aFloatArray4667[3] * class384_175_.aFloatArray4667[14]);
		float f_178_ = (aFloatArray4667[0] * class384_175_.aFloatArray4667[3] + aFloatArray4667[1] * class384_175_.aFloatArray4667[7] + aFloatArray4667[2] * class384_175_.aFloatArray4667[11] + aFloatArray4667[3] * class384_175_.aFloatArray4667[15]);
		float f_179_ = (aFloatArray4667[4] * class384_175_.aFloatArray4667[0] + aFloatArray4667[5] * class384_175_.aFloatArray4667[4] + aFloatArray4667[6] * class384_175_.aFloatArray4667[8] + aFloatArray4667[7] * class384_175_.aFloatArray4667[12]);
		float f_180_ = (aFloatArray4667[4] * class384_175_.aFloatArray4667[1] + aFloatArray4667[5] * class384_175_.aFloatArray4667[5] + aFloatArray4667[6] * class384_175_.aFloatArray4667[9] + aFloatArray4667[7] * class384_175_.aFloatArray4667[13]);
		float f_181_ = (aFloatArray4667[4] * class384_175_.aFloatArray4667[2] + aFloatArray4667[5] * class384_175_.aFloatArray4667[6] + aFloatArray4667[6] * class384_175_.aFloatArray4667[10] + aFloatArray4667[7] * class384_175_.aFloatArray4667[14]);
		float f_182_ = (aFloatArray4667[4] * class384_175_.aFloatArray4667[3] + aFloatArray4667[5] * class384_175_.aFloatArray4667[7] + aFloatArray4667[6] * class384_175_.aFloatArray4667[11] + aFloatArray4667[7] * class384_175_.aFloatArray4667[15]);
		float f_183_ = (aFloatArray4667[8] * class384_175_.aFloatArray4667[0] + aFloatArray4667[9] * class384_175_.aFloatArray4667[4] + aFloatArray4667[10] * class384_175_.aFloatArray4667[8] + aFloatArray4667[11] * class384_175_.aFloatArray4667[12]);
		float f_184_ = (aFloatArray4667[8] * class384_175_.aFloatArray4667[1] + aFloatArray4667[9] * class384_175_.aFloatArray4667[5] + aFloatArray4667[10] * class384_175_.aFloatArray4667[9] + aFloatArray4667[11] * class384_175_.aFloatArray4667[13]);
		float f_185_ = (aFloatArray4667[8] * class384_175_.aFloatArray4667[2] + aFloatArray4667[9] * class384_175_.aFloatArray4667[6] + aFloatArray4667[10] * class384_175_.aFloatArray4667[10] + aFloatArray4667[11] * class384_175_.aFloatArray4667[14]);
		float f_186_ = (aFloatArray4667[8] * class384_175_.aFloatArray4667[3] + aFloatArray4667[9] * class384_175_.aFloatArray4667[7] + aFloatArray4667[10] * class384_175_.aFloatArray4667[11] + aFloatArray4667[11] * class384_175_.aFloatArray4667[15]);
		float f_187_ = (aFloatArray4667[12] * class384_175_.aFloatArray4667[0] + aFloatArray4667[13] * class384_175_.aFloatArray4667[4] + aFloatArray4667[14] * class384_175_.aFloatArray4667[8] + aFloatArray4667[15] * class384_175_.aFloatArray4667[12]);
		float f_188_ = (aFloatArray4667[12] * class384_175_.aFloatArray4667[1] + aFloatArray4667[13] * class384_175_.aFloatArray4667[5] + aFloatArray4667[14] * class384_175_.aFloatArray4667[9] + aFloatArray4667[15] * class384_175_.aFloatArray4667[13]);
		float f_189_ = (aFloatArray4667[12] * class384_175_.aFloatArray4667[2] + aFloatArray4667[13] * class384_175_.aFloatArray4667[6] + aFloatArray4667[14] * class384_175_.aFloatArray4667[10] + aFloatArray4667[15] * class384_175_.aFloatArray4667[14]);
		float f_190_ = (aFloatArray4667[12] * class384_175_.aFloatArray4667[3] + aFloatArray4667[13] * class384_175_.aFloatArray4667[7] + aFloatArray4667[14] * class384_175_.aFloatArray4667[11] + aFloatArray4667[15] * class384_175_.aFloatArray4667[15]);
		aFloatArray4667[0] = f;
		aFloatArray4667[1] = f_176_;
		aFloatArray4667[2] = f_177_;
		aFloatArray4667[3] = f_178_;
		aFloatArray4667[4] = f_179_;
		aFloatArray4667[5] = f_180_;
		aFloatArray4667[6] = f_181_;
		aFloatArray4667[7] = f_182_;
		aFloatArray4667[8] = f_183_;
		aFloatArray4667[9] = f_184_;
		aFloatArray4667[10] = f_185_;
		aFloatArray4667[11] = f_186_;
		aFloatArray4667[12] = f_187_;
		aFloatArray4667[13] = f_188_;
		aFloatArray4667[14] = f_189_;
		aFloatArray4667[15] = f_190_;
	}

	public void method6564(Class384 class384_191_) {
		float f = (aFloatArray4667[0] * class384_191_.aFloatArray4667[0] + aFloatArray4667[1] * class384_191_.aFloatArray4667[4] + aFloatArray4667[2] * class384_191_.aFloatArray4667[8] + aFloatArray4667[3] * class384_191_.aFloatArray4667[12]);
		float f_192_ = (aFloatArray4667[0] * class384_191_.aFloatArray4667[1] + aFloatArray4667[1] * class384_191_.aFloatArray4667[5] + aFloatArray4667[2] * class384_191_.aFloatArray4667[9] + aFloatArray4667[3] * class384_191_.aFloatArray4667[13]);
		float f_193_ = (aFloatArray4667[0] * class384_191_.aFloatArray4667[2] + aFloatArray4667[1] * class384_191_.aFloatArray4667[6] + aFloatArray4667[2] * class384_191_.aFloatArray4667[10] + aFloatArray4667[3] * class384_191_.aFloatArray4667[14]);
		float f_194_ = (aFloatArray4667[0] * class384_191_.aFloatArray4667[3] + aFloatArray4667[1] * class384_191_.aFloatArray4667[7] + aFloatArray4667[2] * class384_191_.aFloatArray4667[11] + aFloatArray4667[3] * class384_191_.aFloatArray4667[15]);
		float f_195_ = (aFloatArray4667[4] * class384_191_.aFloatArray4667[0] + aFloatArray4667[5] * class384_191_.aFloatArray4667[4] + aFloatArray4667[6] * class384_191_.aFloatArray4667[8] + aFloatArray4667[7] * class384_191_.aFloatArray4667[12]);
		float f_196_ = (aFloatArray4667[4] * class384_191_.aFloatArray4667[1] + aFloatArray4667[5] * class384_191_.aFloatArray4667[5] + aFloatArray4667[6] * class384_191_.aFloatArray4667[9] + aFloatArray4667[7] * class384_191_.aFloatArray4667[13]);
		float f_197_ = (aFloatArray4667[4] * class384_191_.aFloatArray4667[2] + aFloatArray4667[5] * class384_191_.aFloatArray4667[6] + aFloatArray4667[6] * class384_191_.aFloatArray4667[10] + aFloatArray4667[7] * class384_191_.aFloatArray4667[14]);
		float f_198_ = (aFloatArray4667[4] * class384_191_.aFloatArray4667[3] + aFloatArray4667[5] * class384_191_.aFloatArray4667[7] + aFloatArray4667[6] * class384_191_.aFloatArray4667[11] + aFloatArray4667[7] * class384_191_.aFloatArray4667[15]);
		float f_199_ = (aFloatArray4667[8] * class384_191_.aFloatArray4667[0] + aFloatArray4667[9] * class384_191_.aFloatArray4667[4] + aFloatArray4667[10] * class384_191_.aFloatArray4667[8] + aFloatArray4667[11] * class384_191_.aFloatArray4667[12]);
		float f_200_ = (aFloatArray4667[8] * class384_191_.aFloatArray4667[1] + aFloatArray4667[9] * class384_191_.aFloatArray4667[5] + aFloatArray4667[10] * class384_191_.aFloatArray4667[9] + aFloatArray4667[11] * class384_191_.aFloatArray4667[13]);
		float f_201_ = (aFloatArray4667[8] * class384_191_.aFloatArray4667[2] + aFloatArray4667[9] * class384_191_.aFloatArray4667[6] + aFloatArray4667[10] * class384_191_.aFloatArray4667[10] + aFloatArray4667[11] * class384_191_.aFloatArray4667[14]);
		float f_202_ = (aFloatArray4667[8] * class384_191_.aFloatArray4667[3] + aFloatArray4667[9] * class384_191_.aFloatArray4667[7] + aFloatArray4667[10] * class384_191_.aFloatArray4667[11] + aFloatArray4667[11] * class384_191_.aFloatArray4667[15]);
		float f_203_ = (aFloatArray4667[12] * class384_191_.aFloatArray4667[0] + aFloatArray4667[13] * class384_191_.aFloatArray4667[4] + aFloatArray4667[14] * class384_191_.aFloatArray4667[8] + aFloatArray4667[15] * class384_191_.aFloatArray4667[12]);
		float f_204_ = (aFloatArray4667[12] * class384_191_.aFloatArray4667[1] + aFloatArray4667[13] * class384_191_.aFloatArray4667[5] + aFloatArray4667[14] * class384_191_.aFloatArray4667[9] + aFloatArray4667[15] * class384_191_.aFloatArray4667[13]);
		float f_205_ = (aFloatArray4667[12] * class384_191_.aFloatArray4667[2] + aFloatArray4667[13] * class384_191_.aFloatArray4667[6] + aFloatArray4667[14] * class384_191_.aFloatArray4667[10] + aFloatArray4667[15] * class384_191_.aFloatArray4667[14]);
		float f_206_ = (aFloatArray4667[12] * class384_191_.aFloatArray4667[3] + aFloatArray4667[13] * class384_191_.aFloatArray4667[7] + aFloatArray4667[14] * class384_191_.aFloatArray4667[11] + aFloatArray4667[15] * class384_191_.aFloatArray4667[15]);
		aFloatArray4667[0] = f;
		aFloatArray4667[1] = f_192_;
		aFloatArray4667[2] = f_193_;
		aFloatArray4667[3] = f_194_;
		aFloatArray4667[4] = f_195_;
		aFloatArray4667[5] = f_196_;
		aFloatArray4667[6] = f_197_;
		aFloatArray4667[7] = f_198_;
		aFloatArray4667[8] = f_199_;
		aFloatArray4667[9] = f_200_;
		aFloatArray4667[10] = f_201_;
		aFloatArray4667[11] = f_202_;
		aFloatArray4667[12] = f_203_;
		aFloatArray4667[13] = f_204_;
		aFloatArray4667[14] = f_205_;
		aFloatArray4667[15] = f_206_;
	}

	public void method6565(Class294 class294) {
		aFloatArray4667[0] = ((Class294) class294).aFloat3519;
		aFloatArray4667[1] = ((Class294) class294).aFloat3514;
		aFloatArray4667[2] = ((Class294) class294).aFloat3516;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = ((Class294) class294).aFloat3517;
		aFloatArray4667[5] = ((Class294) class294).aFloat3523;
		aFloatArray4667[6] = ((Class294) class294).aFloat3522;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = ((Class294) class294).aFloat3520;
		aFloatArray4667[9] = ((Class294) class294).aFloat3513;
		aFloatArray4667[10] = ((Class294) class294).aFloat3521;
		aFloatArray4667[11] = 0.0F;
		aFloatArray4667[12] = ((Class294) class294).aFloat3515;
		aFloatArray4667[13] = ((Class294) class294).aFloat3524;
		aFloatArray4667[14] = ((Class294) class294).aFloat3525;
		aFloatArray4667[15] = 1.0F;
	}

	float method6566() {
		return ((aFloatArray4667[0] * aFloatArray4667[5] * aFloatArray4667[10] * aFloatArray4667[15]) - (aFloatArray4667[0] * aFloatArray4667[5] * aFloatArray4667[11] * aFloatArray4667[14]) - (aFloatArray4667[0] * aFloatArray4667[6] * aFloatArray4667[9] * aFloatArray4667[15]) + (aFloatArray4667[0] * aFloatArray4667[6] * aFloatArray4667[11] * aFloatArray4667[13]) + (aFloatArray4667[0] * aFloatArray4667[7] * aFloatArray4667[9] * aFloatArray4667[14])
				- (aFloatArray4667[0] * aFloatArray4667[7] * aFloatArray4667[10] * aFloatArray4667[13]) - (aFloatArray4667[1] * aFloatArray4667[4] * aFloatArray4667[10] * aFloatArray4667[15]) + (aFloatArray4667[1] * aFloatArray4667[4] * aFloatArray4667[11] * aFloatArray4667[14]) + (aFloatArray4667[1] * aFloatArray4667[6] * aFloatArray4667[8] * aFloatArray4667[15]) - (aFloatArray4667[1] * aFloatArray4667[6] * aFloatArray4667[11] * aFloatArray4667[12])
				- (aFloatArray4667[1] * aFloatArray4667[7] * aFloatArray4667[8] * aFloatArray4667[14]) + (aFloatArray4667[1] * aFloatArray4667[7] * aFloatArray4667[10] * aFloatArray4667[12]) + (aFloatArray4667[2] * aFloatArray4667[4] * aFloatArray4667[9] * aFloatArray4667[15]) - (aFloatArray4667[2] * aFloatArray4667[4] * aFloatArray4667[11] * aFloatArray4667[13]) - (aFloatArray4667[2] * aFloatArray4667[5] * aFloatArray4667[8] * aFloatArray4667[15])
				+ (aFloatArray4667[2] * aFloatArray4667[5] * aFloatArray4667[11] * aFloatArray4667[12]) + (aFloatArray4667[2] * aFloatArray4667[7] * aFloatArray4667[8] * aFloatArray4667[13]) - (aFloatArray4667[2] * aFloatArray4667[7] * aFloatArray4667[9] * aFloatArray4667[12]) - (aFloatArray4667[3] * aFloatArray4667[4] * aFloatArray4667[9] * aFloatArray4667[14]) + (aFloatArray4667[3] * aFloatArray4667[4] * aFloatArray4667[10] * aFloatArray4667[13])
				+ (aFloatArray4667[3] * aFloatArray4667[5] * aFloatArray4667[8] * aFloatArray4667[14]) - (aFloatArray4667[3] * aFloatArray4667[5] * aFloatArray4667[10] * aFloatArray4667[12]) - (aFloatArray4667[3] * aFloatArray4667[6] * aFloatArray4667[8] * aFloatArray4667[13]) + (aFloatArray4667[3] * aFloatArray4667[6] * aFloatArray4667[9] * aFloatArray4667[12]));
	}

	public boolean method6567() {
		return (aFloatArray4667[0] == 1.0F && aFloatArray4667[1] == 0.0F && aFloatArray4667[2] == 0.0F && aFloatArray4667[3] == 0.0F && aFloatArray4667[4] == 0.0F && aFloatArray4667[5] == 1.0F && aFloatArray4667[6] == 0.0F && aFloatArray4667[7] == 0.0F && aFloatArray4667[8] == 0.0F && aFloatArray4667[9] == 0.0F && aFloatArray4667[10] == 1.0F && aFloatArray4667[11] == 0.0F && aFloatArray4667[12] == 0.0F && aFloatArray4667[13] == 0.0F && aFloatArray4667[14] == 0.0F && aFloatArray4667[15] == 1.0F);
	}

	public void method6568(Class384 class384_207_, Class384 class384_208_) {
		float f = ((class384_207_.aFloatArray4667[0] * class384_208_.aFloatArray4667[0]) + (class384_207_.aFloatArray4667[1] * class384_208_.aFloatArray4667[4]) + (class384_207_.aFloatArray4667[2] * class384_208_.aFloatArray4667[8]) + (class384_207_.aFloatArray4667[3] * class384_208_.aFloatArray4667[12]));
		float f_209_ = ((class384_207_.aFloatArray4667[0] * class384_208_.aFloatArray4667[1]) + (class384_207_.aFloatArray4667[1] * class384_208_.aFloatArray4667[5]) + (class384_207_.aFloatArray4667[2] * class384_208_.aFloatArray4667[9]) + (class384_207_.aFloatArray4667[3] * class384_208_.aFloatArray4667[13]));
		float f_210_ = ((class384_207_.aFloatArray4667[0] * class384_208_.aFloatArray4667[2]) + (class384_207_.aFloatArray4667[1] * class384_208_.aFloatArray4667[6]) + (class384_207_.aFloatArray4667[2] * class384_208_.aFloatArray4667[10]) + (class384_207_.aFloatArray4667[3] * class384_208_.aFloatArray4667[14]));
		float f_211_ = ((class384_207_.aFloatArray4667[0] * class384_208_.aFloatArray4667[3]) + (class384_207_.aFloatArray4667[1] * class384_208_.aFloatArray4667[7]) + (class384_207_.aFloatArray4667[2] * class384_208_.aFloatArray4667[11]) + (class384_207_.aFloatArray4667[3] * class384_208_.aFloatArray4667[15]));
		float f_212_ = ((class384_207_.aFloatArray4667[4] * class384_208_.aFloatArray4667[0]) + (class384_207_.aFloatArray4667[5] * class384_208_.aFloatArray4667[4]) + (class384_207_.aFloatArray4667[6] * class384_208_.aFloatArray4667[8]) + (class384_207_.aFloatArray4667[7] * class384_208_.aFloatArray4667[12]));
		float f_213_ = ((class384_207_.aFloatArray4667[4] * class384_208_.aFloatArray4667[1]) + (class384_207_.aFloatArray4667[5] * class384_208_.aFloatArray4667[5]) + (class384_207_.aFloatArray4667[6] * class384_208_.aFloatArray4667[9]) + (class384_207_.aFloatArray4667[7] * class384_208_.aFloatArray4667[13]));
		float f_214_ = ((class384_207_.aFloatArray4667[4] * class384_208_.aFloatArray4667[2]) + (class384_207_.aFloatArray4667[5] * class384_208_.aFloatArray4667[6]) + (class384_207_.aFloatArray4667[6] * class384_208_.aFloatArray4667[10]) + (class384_207_.aFloatArray4667[7] * class384_208_.aFloatArray4667[14]));
		float f_215_ = ((class384_207_.aFloatArray4667[4] * class384_208_.aFloatArray4667[3]) + (class384_207_.aFloatArray4667[5] * class384_208_.aFloatArray4667[7]) + (class384_207_.aFloatArray4667[6] * class384_208_.aFloatArray4667[11]) + (class384_207_.aFloatArray4667[7] * class384_208_.aFloatArray4667[15]));
		float f_216_ = ((class384_207_.aFloatArray4667[8] * class384_208_.aFloatArray4667[0]) + (class384_207_.aFloatArray4667[9] * class384_208_.aFloatArray4667[4]) + (class384_207_.aFloatArray4667[10] * class384_208_.aFloatArray4667[8]) + (class384_207_.aFloatArray4667[11] * class384_208_.aFloatArray4667[12]));
		float f_217_ = ((class384_207_.aFloatArray4667[8] * class384_208_.aFloatArray4667[1]) + (class384_207_.aFloatArray4667[9] * class384_208_.aFloatArray4667[5]) + (class384_207_.aFloatArray4667[10] * class384_208_.aFloatArray4667[9]) + (class384_207_.aFloatArray4667[11] * class384_208_.aFloatArray4667[13]));
		float f_218_ = ((class384_207_.aFloatArray4667[8] * class384_208_.aFloatArray4667[2]) + (class384_207_.aFloatArray4667[9] * class384_208_.aFloatArray4667[6]) + (class384_207_.aFloatArray4667[10] * class384_208_.aFloatArray4667[10]) + (class384_207_.aFloatArray4667[11] * class384_208_.aFloatArray4667[14]));
		float f_219_ = ((class384_207_.aFloatArray4667[8] * class384_208_.aFloatArray4667[3]) + (class384_207_.aFloatArray4667[9] * class384_208_.aFloatArray4667[7]) + (class384_207_.aFloatArray4667[10] * class384_208_.aFloatArray4667[11]) + (class384_207_.aFloatArray4667[11] * class384_208_.aFloatArray4667[15]));
		float f_220_ = ((class384_207_.aFloatArray4667[12] * class384_208_.aFloatArray4667[0]) + (class384_207_.aFloatArray4667[13] * class384_208_.aFloatArray4667[4]) + (class384_207_.aFloatArray4667[14] * class384_208_.aFloatArray4667[8]) + (class384_207_.aFloatArray4667[15] * class384_208_.aFloatArray4667[12]));
		float f_221_ = ((class384_207_.aFloatArray4667[12] * class384_208_.aFloatArray4667[1]) + (class384_207_.aFloatArray4667[13] * class384_208_.aFloatArray4667[5]) + (class384_207_.aFloatArray4667[14] * class384_208_.aFloatArray4667[9]) + (class384_207_.aFloatArray4667[15] * class384_208_.aFloatArray4667[13]));
		float f_222_ = ((class384_207_.aFloatArray4667[12] * class384_208_.aFloatArray4667[2]) + (class384_207_.aFloatArray4667[13] * class384_208_.aFloatArray4667[6]) + (class384_207_.aFloatArray4667[14] * class384_208_.aFloatArray4667[10]) + (class384_207_.aFloatArray4667[15] * class384_208_.aFloatArray4667[14]));
		float f_223_ = ((class384_207_.aFloatArray4667[12] * class384_208_.aFloatArray4667[3]) + (class384_207_.aFloatArray4667[13] * class384_208_.aFloatArray4667[7]) + (class384_207_.aFloatArray4667[14] * class384_208_.aFloatArray4667[11]) + (class384_207_.aFloatArray4667[15] * class384_208_.aFloatArray4667[15]));
		aFloatArray4667[0] = f;
		aFloatArray4667[1] = f_209_;
		aFloatArray4667[2] = f_210_;
		aFloatArray4667[3] = f_211_;
		aFloatArray4667[4] = f_212_;
		aFloatArray4667[5] = f_213_;
		aFloatArray4667[6] = f_214_;
		aFloatArray4667[7] = f_215_;
		aFloatArray4667[8] = f_216_;
		aFloatArray4667[9] = f_217_;
		aFloatArray4667[10] = f_218_;
		aFloatArray4667[11] = f_219_;
		aFloatArray4667[12] = f_220_;
		aFloatArray4667[13] = f_221_;
		aFloatArray4667[14] = f_222_;
		aFloatArray4667[15] = f_223_;
	}

	public void method6569() {
		float f = 1.0F / method6612();
		float f_224_ = (aFloatArray4667[5] * aFloatArray4667[10] * aFloatArray4667[15] - aFloatArray4667[5] * aFloatArray4667[11] * aFloatArray4667[14] - aFloatArray4667[6] * aFloatArray4667[9] * aFloatArray4667[15] + aFloatArray4667[6] * aFloatArray4667[11] * aFloatArray4667[13] + aFloatArray4667[7] * aFloatArray4667[9] * aFloatArray4667[14] - (aFloatArray4667[7] * aFloatArray4667[10] * aFloatArray4667[13])) * f;
		float f_225_ = (-aFloatArray4667[1] * aFloatArray4667[10] * aFloatArray4667[15] + aFloatArray4667[1] * aFloatArray4667[11] * aFloatArray4667[14] + aFloatArray4667[2] * aFloatArray4667[9] * aFloatArray4667[15] - aFloatArray4667[2] * aFloatArray4667[11] * aFloatArray4667[13] - aFloatArray4667[3] * aFloatArray4667[9] * aFloatArray4667[14] + (aFloatArray4667[3] * aFloatArray4667[10] * aFloatArray4667[13])) * f;
		float f_226_ = ((aFloatArray4667[1] * aFloatArray4667[6] * aFloatArray4667[15] - aFloatArray4667[1] * aFloatArray4667[7] * aFloatArray4667[14] - aFloatArray4667[2] * aFloatArray4667[5] * aFloatArray4667[15] + aFloatArray4667[2] * aFloatArray4667[7] * aFloatArray4667[13] + aFloatArray4667[3] * aFloatArray4667[5] * aFloatArray4667[14] - (aFloatArray4667[3] * aFloatArray4667[6] * aFloatArray4667[13])) * f);
		float f_227_ = ((-aFloatArray4667[1] * aFloatArray4667[6] * aFloatArray4667[11] + aFloatArray4667[1] * aFloatArray4667[7] * aFloatArray4667[10] + aFloatArray4667[2] * aFloatArray4667[5] * aFloatArray4667[11] - aFloatArray4667[2] * aFloatArray4667[7] * aFloatArray4667[9] - aFloatArray4667[3] * aFloatArray4667[5] * aFloatArray4667[10] + aFloatArray4667[3] * aFloatArray4667[6] * aFloatArray4667[9]) * f);
		float f_228_ = (-aFloatArray4667[4] * aFloatArray4667[10] * aFloatArray4667[15] + aFloatArray4667[4] * aFloatArray4667[11] * aFloatArray4667[14] + aFloatArray4667[6] * aFloatArray4667[8] * aFloatArray4667[15] - aFloatArray4667[6] * aFloatArray4667[11] * aFloatArray4667[12] - aFloatArray4667[7] * aFloatArray4667[8] * aFloatArray4667[14] + (aFloatArray4667[7] * aFloatArray4667[10] * aFloatArray4667[12])) * f;
		float f_229_ = (aFloatArray4667[0] * aFloatArray4667[10] * aFloatArray4667[15] - aFloatArray4667[0] * aFloatArray4667[11] * aFloatArray4667[14] - aFloatArray4667[2] * aFloatArray4667[8] * aFloatArray4667[15] + aFloatArray4667[2] * aFloatArray4667[11] * aFloatArray4667[12] + aFloatArray4667[3] * aFloatArray4667[8] * aFloatArray4667[14] - (aFloatArray4667[3] * aFloatArray4667[10] * aFloatArray4667[12])) * f;
		float f_230_ = ((-aFloatArray4667[0] * aFloatArray4667[6] * aFloatArray4667[15] + aFloatArray4667[0] * aFloatArray4667[7] * aFloatArray4667[14] + aFloatArray4667[2] * aFloatArray4667[4] * aFloatArray4667[15] - aFloatArray4667[2] * aFloatArray4667[7] * aFloatArray4667[12] - aFloatArray4667[3] * aFloatArray4667[4] * aFloatArray4667[14] + (aFloatArray4667[3] * aFloatArray4667[6] * aFloatArray4667[12])) * f);
		float f_231_ = ((aFloatArray4667[0] * aFloatArray4667[6] * aFloatArray4667[11] - aFloatArray4667[0] * aFloatArray4667[7] * aFloatArray4667[10] - aFloatArray4667[2] * aFloatArray4667[4] * aFloatArray4667[11] + aFloatArray4667[2] * aFloatArray4667[7] * aFloatArray4667[8] + aFloatArray4667[3] * aFloatArray4667[4] * aFloatArray4667[10] - aFloatArray4667[3] * aFloatArray4667[6] * aFloatArray4667[8]) * f);
		float f_232_ = (aFloatArray4667[4] * aFloatArray4667[9] * aFloatArray4667[15] - aFloatArray4667[4] * aFloatArray4667[11] * aFloatArray4667[13] - aFloatArray4667[5] * aFloatArray4667[8] * aFloatArray4667[15] + aFloatArray4667[5] * aFloatArray4667[11] * aFloatArray4667[12] + aFloatArray4667[7] * aFloatArray4667[8] * aFloatArray4667[13] - (aFloatArray4667[7] * aFloatArray4667[9] * aFloatArray4667[12])) * f;
		float f_233_ = (-aFloatArray4667[0] * aFloatArray4667[9] * aFloatArray4667[15] + aFloatArray4667[0] * aFloatArray4667[11] * aFloatArray4667[13] + aFloatArray4667[1] * aFloatArray4667[8] * aFloatArray4667[15] - aFloatArray4667[1] * aFloatArray4667[11] * aFloatArray4667[12] - aFloatArray4667[3] * aFloatArray4667[8] * aFloatArray4667[13] + (aFloatArray4667[3] * aFloatArray4667[9] * aFloatArray4667[12])) * f;
		float f_234_ = ((aFloatArray4667[0] * aFloatArray4667[5] * aFloatArray4667[15] - aFloatArray4667[0] * aFloatArray4667[7] * aFloatArray4667[13] - aFloatArray4667[1] * aFloatArray4667[4] * aFloatArray4667[15] + aFloatArray4667[1] * aFloatArray4667[7] * aFloatArray4667[12] + aFloatArray4667[3] * aFloatArray4667[4] * aFloatArray4667[13] - (aFloatArray4667[3] * aFloatArray4667[5] * aFloatArray4667[12])) * f);
		float f_235_ = ((-aFloatArray4667[0] * aFloatArray4667[5] * aFloatArray4667[11] + aFloatArray4667[0] * aFloatArray4667[7] * aFloatArray4667[9] + aFloatArray4667[1] * aFloatArray4667[4] * aFloatArray4667[11] - aFloatArray4667[1] * aFloatArray4667[7] * aFloatArray4667[8] - aFloatArray4667[3] * aFloatArray4667[4] * aFloatArray4667[9] + aFloatArray4667[3] * aFloatArray4667[5] * aFloatArray4667[8]) * f);
		float f_236_ = (-aFloatArray4667[4] * aFloatArray4667[9] * aFloatArray4667[14] + aFloatArray4667[4] * aFloatArray4667[10] * aFloatArray4667[13] + aFloatArray4667[5] * aFloatArray4667[8] * aFloatArray4667[14] - aFloatArray4667[5] * aFloatArray4667[10] * aFloatArray4667[12] - aFloatArray4667[6] * aFloatArray4667[8] * aFloatArray4667[13] + (aFloatArray4667[6] * aFloatArray4667[9] * aFloatArray4667[12])) * f;
		float f_237_ = (aFloatArray4667[0] * aFloatArray4667[9] * aFloatArray4667[14] - aFloatArray4667[0] * aFloatArray4667[10] * aFloatArray4667[13] - aFloatArray4667[1] * aFloatArray4667[8] * aFloatArray4667[14] + aFloatArray4667[1] * aFloatArray4667[10] * aFloatArray4667[12] + aFloatArray4667[2] * aFloatArray4667[8] * aFloatArray4667[13] - (aFloatArray4667[2] * aFloatArray4667[9] * aFloatArray4667[12])) * f;
		float f_238_ = ((-aFloatArray4667[0] * aFloatArray4667[5] * aFloatArray4667[14] + aFloatArray4667[0] * aFloatArray4667[6] * aFloatArray4667[13] + aFloatArray4667[1] * aFloatArray4667[4] * aFloatArray4667[14] - aFloatArray4667[1] * aFloatArray4667[6] * aFloatArray4667[12] - aFloatArray4667[2] * aFloatArray4667[4] * aFloatArray4667[13] + (aFloatArray4667[2] * aFloatArray4667[5] * aFloatArray4667[12])) * f);
		float f_239_ = ((aFloatArray4667[0] * aFloatArray4667[5] * aFloatArray4667[10] - aFloatArray4667[0] * aFloatArray4667[6] * aFloatArray4667[9] - aFloatArray4667[1] * aFloatArray4667[4] * aFloatArray4667[10] + aFloatArray4667[1] * aFloatArray4667[6] * aFloatArray4667[8] + aFloatArray4667[2] * aFloatArray4667[4] * aFloatArray4667[9] - aFloatArray4667[2] * aFloatArray4667[5] * aFloatArray4667[8]) * f);
		aFloatArray4667[0] = f_224_;
		aFloatArray4667[1] = f_225_;
		aFloatArray4667[2] = f_226_;
		aFloatArray4667[3] = f_227_;
		aFloatArray4667[4] = f_228_;
		aFloatArray4667[5] = f_229_;
		aFloatArray4667[6] = f_230_;
		aFloatArray4667[7] = f_231_;
		aFloatArray4667[8] = f_232_;
		aFloatArray4667[9] = f_233_;
		aFloatArray4667[10] = f_234_;
		aFloatArray4667[11] = f_235_;
		aFloatArray4667[12] = f_236_;
		aFloatArray4667[13] = f_237_;
		aFloatArray4667[14] = f_238_;
		aFloatArray4667[15] = f_239_;
	}

	public void method6570(float f, float f_240_, float f_241_, float f_242_) {
		aFloatArray4667[0] = f;
		aFloatArray4667[1] = 0.0F;
		aFloatArray4667[2] = 0.0F;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = 0.0F;
		aFloatArray4667[5] = f_240_;
		aFloatArray4667[6] = 0.0F;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = 0.0F;
		aFloatArray4667[9] = 0.0F;
		aFloatArray4667[10] = f_241_;
		aFloatArray4667[11] = 0.0F;
		aFloatArray4667[12] = 0.0F;
		aFloatArray4667[13] = 0.0F;
		aFloatArray4667[14] = 0.0F;
		aFloatArray4667[15] = f_242_;
	}

	public void method6571(float f, float f_243_, float f_244_, float f_245_) {
		aFloatArray4667[0] = f;
		aFloatArray4667[1] = 0.0F;
		aFloatArray4667[2] = 0.0F;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = 0.0F;
		aFloatArray4667[5] = f_243_;
		aFloatArray4667[6] = 0.0F;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = 0.0F;
		aFloatArray4667[9] = 0.0F;
		aFloatArray4667[10] = f_244_;
		aFloatArray4667[11] = 0.0F;
		aFloatArray4667[12] = 0.0F;
		aFloatArray4667[13] = 0.0F;
		aFloatArray4667[14] = 0.0F;
		aFloatArray4667[15] = f_245_;
	}

	public boolean method6572() {
		return (aFloatArray4667[0] == 1.0F && aFloatArray4667[1] == 0.0F && aFloatArray4667[2] == 0.0F && aFloatArray4667[3] == 0.0F && aFloatArray4667[4] == 0.0F && aFloatArray4667[5] == 1.0F && aFloatArray4667[6] == 0.0F && aFloatArray4667[7] == 0.0F && aFloatArray4667[8] == 0.0F && aFloatArray4667[9] == 0.0F && aFloatArray4667[10] == 1.0F && aFloatArray4667[11] == 0.0F && aFloatArray4667[12] == 0.0F && aFloatArray4667[13] == 0.0F && aFloatArray4667[14] == 0.0F && aFloatArray4667[15] == 1.0F);
	}

	public String method6573() {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			for (int i_246_ = 0; i_246_ < 4; i_246_++) {
				if (i_246_ > 0)
					stringbuilder.append("\t");
				stringbuilder.append(aFloatArray4667[i * 4 + i_246_]);
			}
			stringbuilder.append("\n");
		}
		return stringbuilder.toString();
	}

	public float method6574() {
		return ((aFloatArray4667[14] - aFloatArray4667[15]) / (aFloatArray4667[11] - aFloatArray4667[10]));
	}

	public float[] method6575(float[] fs) {
		float f = aFloatArray4667[3] - aFloatArray4667[2];
		float f_247_ = aFloatArray4667[7] - aFloatArray4667[6];
		float f_248_ = aFloatArray4667[11] - aFloatArray4667[10];
		double d = Math.sqrt((double) (f * f + f_247_ * f_247_ + f_248_ * f_248_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_247_ / d);
		fs[2] = (float) ((double) f_248_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] - aFloatArray4667[14]) / d);
		return fs;
	}

	public float method6576() {
		return ((aFloatArray4667[14] - aFloatArray4667[15]) / (aFloatArray4667[11] - aFloatArray4667[10]));
	}

	public float[] method6577(float[] fs) {
		float f = aFloatArray4667[3] + aFloatArray4667[0];
		float f_249_ = aFloatArray4667[7] + aFloatArray4667[4];
		float f_250_ = aFloatArray4667[11] + aFloatArray4667[8];
		double d = Math.sqrt((double) (f * f + f_249_ * f_249_ + f_250_ * f_250_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_249_ / d);
		fs[2] = (float) ((double) f_250_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] + aFloatArray4667[12]) / d);
		return fs;
	}

	public void method6578(float[] fs) {
		float f = fs[0];
		float f_251_ = fs[1];
		float f_252_ = fs[2];
		fs[0] = (aFloatArray4667[0] * f + aFloatArray4667[4] * f_251_ + aFloatArray4667[8] * f_252_ + aFloatArray4667[12]);
		fs[1] = (aFloatArray4667[1] * f + aFloatArray4667[5] * f_251_ + aFloatArray4667[9] * f_252_ + aFloatArray4667[13]);
		fs[2] = (aFloatArray4667[2] * f + aFloatArray4667[6] * f_251_ + aFloatArray4667[10] * f_252_ + aFloatArray4667[14]);
	}

	public void method6579(float[] fs) {
		float f = fs[0];
		float f_253_ = fs[1];
		float f_254_ = fs[2];
		fs[0] = (aFloatArray4667[0] * f + aFloatArray4667[4] * f_253_ + aFloatArray4667[8] * f_254_ + aFloatArray4667[12]);
		fs[1] = (aFloatArray4667[1] * f + aFloatArray4667[5] * f_253_ + aFloatArray4667[9] * f_254_ + aFloatArray4667[13]);
		fs[2] = (aFloatArray4667[2] * f + aFloatArray4667[6] * f_253_ + aFloatArray4667[10] * f_254_ + aFloatArray4667[14]);
	}

	public void method6580(float f, float f_255_, float f_256_, float[] fs) {
		fs[0] = (aFloatArray4667[0] * f + aFloatArray4667[4] * f_255_ + aFloatArray4667[8] * f_256_);
		fs[1] = (aFloatArray4667[1] * f + aFloatArray4667[5] * f_255_ + aFloatArray4667[9] * f_256_);
		fs[2] = (aFloatArray4667[2] * f + aFloatArray4667[6] * f_255_ + aFloatArray4667[10] * f_256_);
		if (fs.length > 3)
			fs[3] = (aFloatArray4667[3] * f + aFloatArray4667[7] * f_255_ + aFloatArray4667[11] * f_256_);
	}

	public void method6581(float f, float f_257_, float f_258_, float f_259_, float f_260_, float f_261_) {
		aFloatArray4667[0] = 2.0F / (f_257_ - f);
		aFloatArray4667[1] = 0.0F;
		aFloatArray4667[2] = 0.0F;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = 0.0F;
		aFloatArray4667[5] = 2.0F / (f_259_ - f_258_);
		aFloatArray4667[6] = 0.0F;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = 0.0F;
		aFloatArray4667[9] = 0.0F;
		aFloatArray4667[10] = 2.0F / (f_261_ - f_260_);
		aFloatArray4667[11] = 0.0F;
		aFloatArray4667[12] = -(f_257_ + f) / (f_257_ - f);
		aFloatArray4667[13] = -(f_259_ + f_258_) / (f_259_ - f_258_);
		aFloatArray4667[14] = -(f_261_ + f_260_) / (f_261_ - f_260_);
		aFloatArray4667[15] = 1.0F;
	}

	public boolean method6582(Object object) {
		if (!(object instanceof Class384))
			return false;
		Class384 class384_262_ = (Class384) object;
		for (int i = 0; i < 16; i++) {
			if (aFloatArray4667[i] != class384_262_.aFloatArray4667[i])
				return false;
		}
		return true;
	}

	public void method6583(float f, float f_263_, float f_264_, float f_265_, float f_266_, float f_267_, float f_268_, float f_269_) {
		aFloatArray4667[0] = f_264_ * 2.0F / f_268_;
		aFloatArray4667[1] = 0.0F;
		aFloatArray4667[2] = 0.0F;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = 0.0F;
		aFloatArray4667[5] = f_265_ * 2.0F / f_269_;
		aFloatArray4667[6] = 0.0F;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = 2.0F * f / f_268_ - 1.0F;
		aFloatArray4667[9] = 2.0F * f_263_ / f_269_ - 1.0F;
		aFloatArray4667[10] = (f_267_ + f_266_) / (f_267_ - f_266_);
		aFloatArray4667[11] = 1.0F;
		aFloatArray4667[12] = 0.0F;
		aFloatArray4667[13] = 0.0F;
		aFloatArray4667[14] = 2.0F * f_267_ * f_266_ / (f_266_ - f_267_);
		aFloatArray4667[15] = 0.0F;
	}

	public float method6584() {
		return (-(aFloatArray4667[15] + aFloatArray4667[14]) / (aFloatArray4667[11] + aFloatArray4667[10]));
	}

	public float method6585() {
		return (-(aFloatArray4667[15] + aFloatArray4667[14]) / (aFloatArray4667[11] + aFloatArray4667[10]));
	}

	public boolean equals(Object object) {
		if (!(object instanceof Class384))
			return false;
		Class384 class384_270_ = (Class384) object;
		for (int i = 0; i < 16; i++) {
			if (aFloatArray4667[i] != class384_270_.aFloatArray4667[i])
				return false;
		}
		return true;
	}

	public void method6586(Class384 class384_271_, Class384 class384_272_) {
		float f = ((class384_271_.aFloatArray4667[0] * class384_272_.aFloatArray4667[0]) + (class384_271_.aFloatArray4667[1] * class384_272_.aFloatArray4667[4]) + (class384_271_.aFloatArray4667[2] * class384_272_.aFloatArray4667[8]) + (class384_271_.aFloatArray4667[3] * class384_272_.aFloatArray4667[12]));
		float f_273_ = ((class384_271_.aFloatArray4667[0] * class384_272_.aFloatArray4667[1]) + (class384_271_.aFloatArray4667[1] * class384_272_.aFloatArray4667[5]) + (class384_271_.aFloatArray4667[2] * class384_272_.aFloatArray4667[9]) + (class384_271_.aFloatArray4667[3] * class384_272_.aFloatArray4667[13]));
		float f_274_ = ((class384_271_.aFloatArray4667[0] * class384_272_.aFloatArray4667[2]) + (class384_271_.aFloatArray4667[1] * class384_272_.aFloatArray4667[6]) + (class384_271_.aFloatArray4667[2] * class384_272_.aFloatArray4667[10]) + (class384_271_.aFloatArray4667[3] * class384_272_.aFloatArray4667[14]));
		float f_275_ = ((class384_271_.aFloatArray4667[0] * class384_272_.aFloatArray4667[3]) + (class384_271_.aFloatArray4667[1] * class384_272_.aFloatArray4667[7]) + (class384_271_.aFloatArray4667[2] * class384_272_.aFloatArray4667[11]) + (class384_271_.aFloatArray4667[3] * class384_272_.aFloatArray4667[15]));
		float f_276_ = ((class384_271_.aFloatArray4667[4] * class384_272_.aFloatArray4667[0]) + (class384_271_.aFloatArray4667[5] * class384_272_.aFloatArray4667[4]) + (class384_271_.aFloatArray4667[6] * class384_272_.aFloatArray4667[8]) + (class384_271_.aFloatArray4667[7] * class384_272_.aFloatArray4667[12]));
		float f_277_ = ((class384_271_.aFloatArray4667[4] * class384_272_.aFloatArray4667[1]) + (class384_271_.aFloatArray4667[5] * class384_272_.aFloatArray4667[5]) + (class384_271_.aFloatArray4667[6] * class384_272_.aFloatArray4667[9]) + (class384_271_.aFloatArray4667[7] * class384_272_.aFloatArray4667[13]));
		float f_278_ = ((class384_271_.aFloatArray4667[4] * class384_272_.aFloatArray4667[2]) + (class384_271_.aFloatArray4667[5] * class384_272_.aFloatArray4667[6]) + (class384_271_.aFloatArray4667[6] * class384_272_.aFloatArray4667[10]) + (class384_271_.aFloatArray4667[7] * class384_272_.aFloatArray4667[14]));
		float f_279_ = ((class384_271_.aFloatArray4667[4] * class384_272_.aFloatArray4667[3]) + (class384_271_.aFloatArray4667[5] * class384_272_.aFloatArray4667[7]) + (class384_271_.aFloatArray4667[6] * class384_272_.aFloatArray4667[11]) + (class384_271_.aFloatArray4667[7] * class384_272_.aFloatArray4667[15]));
		float f_280_ = ((class384_271_.aFloatArray4667[8] * class384_272_.aFloatArray4667[0]) + (class384_271_.aFloatArray4667[9] * class384_272_.aFloatArray4667[4]) + (class384_271_.aFloatArray4667[10] * class384_272_.aFloatArray4667[8]) + (class384_271_.aFloatArray4667[11] * class384_272_.aFloatArray4667[12]));
		float f_281_ = ((class384_271_.aFloatArray4667[8] * class384_272_.aFloatArray4667[1]) + (class384_271_.aFloatArray4667[9] * class384_272_.aFloatArray4667[5]) + (class384_271_.aFloatArray4667[10] * class384_272_.aFloatArray4667[9]) + (class384_271_.aFloatArray4667[11] * class384_272_.aFloatArray4667[13]));
		float f_282_ = ((class384_271_.aFloatArray4667[8] * class384_272_.aFloatArray4667[2]) + (class384_271_.aFloatArray4667[9] * class384_272_.aFloatArray4667[6]) + (class384_271_.aFloatArray4667[10] * class384_272_.aFloatArray4667[10]) + (class384_271_.aFloatArray4667[11] * class384_272_.aFloatArray4667[14]));
		float f_283_ = ((class384_271_.aFloatArray4667[8] * class384_272_.aFloatArray4667[3]) + (class384_271_.aFloatArray4667[9] * class384_272_.aFloatArray4667[7]) + (class384_271_.aFloatArray4667[10] * class384_272_.aFloatArray4667[11]) + (class384_271_.aFloatArray4667[11] * class384_272_.aFloatArray4667[15]));
		float f_284_ = ((class384_271_.aFloatArray4667[12] * class384_272_.aFloatArray4667[0]) + (class384_271_.aFloatArray4667[13] * class384_272_.aFloatArray4667[4]) + (class384_271_.aFloatArray4667[14] * class384_272_.aFloatArray4667[8]) + (class384_271_.aFloatArray4667[15] * class384_272_.aFloatArray4667[12]));
		float f_285_ = ((class384_271_.aFloatArray4667[12] * class384_272_.aFloatArray4667[1]) + (class384_271_.aFloatArray4667[13] * class384_272_.aFloatArray4667[5]) + (class384_271_.aFloatArray4667[14] * class384_272_.aFloatArray4667[9]) + (class384_271_.aFloatArray4667[15] * class384_272_.aFloatArray4667[13]));
		float f_286_ = ((class384_271_.aFloatArray4667[12] * class384_272_.aFloatArray4667[2]) + (class384_271_.aFloatArray4667[13] * class384_272_.aFloatArray4667[6]) + (class384_271_.aFloatArray4667[14] * class384_272_.aFloatArray4667[10]) + (class384_271_.aFloatArray4667[15] * class384_272_.aFloatArray4667[14]));
		float f_287_ = ((class384_271_.aFloatArray4667[12] * class384_272_.aFloatArray4667[3]) + (class384_271_.aFloatArray4667[13] * class384_272_.aFloatArray4667[7]) + (class384_271_.aFloatArray4667[14] * class384_272_.aFloatArray4667[11]) + (class384_271_.aFloatArray4667[15] * class384_272_.aFloatArray4667[15]));
		aFloatArray4667[0] = f;
		aFloatArray4667[1] = f_273_;
		aFloatArray4667[2] = f_274_;
		aFloatArray4667[3] = f_275_;
		aFloatArray4667[4] = f_276_;
		aFloatArray4667[5] = f_277_;
		aFloatArray4667[6] = f_278_;
		aFloatArray4667[7] = f_279_;
		aFloatArray4667[8] = f_280_;
		aFloatArray4667[9] = f_281_;
		aFloatArray4667[10] = f_282_;
		aFloatArray4667[11] = f_283_;
		aFloatArray4667[12] = f_284_;
		aFloatArray4667[13] = f_285_;
		aFloatArray4667[14] = f_286_;
		aFloatArray4667[15] = f_287_;
	}

	public String toString() {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			for (int i_288_ = 0; i_288_ < 4; i_288_++) {
				if (i_288_ > 0)
					stringbuilder.append("\t");
				stringbuilder.append(aFloatArray4667[i * 4 + i_288_]);
			}
			stringbuilder.append("\n");
		}
		return stringbuilder.toString();
	}

	public float method6587() {
		return ((aFloatArray4667[14] - aFloatArray4667[15]) / (aFloatArray4667[11] - aFloatArray4667[10]));
	}

	public Class384(Class384 class384_289_) {
		aFloatArray4667 = new float[16];
		method6562(class384_289_);
	}

	public float[] method6588(float[] fs) {
		float f = aFloatArray4667[3] + aFloatArray4667[0];
		float f_290_ = aFloatArray4667[7] + aFloatArray4667[4];
		float f_291_ = aFloatArray4667[11] + aFloatArray4667[8];
		double d = Math.sqrt((double) (f * f + f_290_ * f_290_ + f_291_ * f_291_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_290_ / d);
		fs[2] = (float) ((double) f_291_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] + aFloatArray4667[12]) / d);
		return fs;
	}

	public float[] method6589(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[4];
		fs[2] = aFloatArray4667[8];
		fs[3] = aFloatArray4667[12];
		fs[4] = aFloatArray4667[1];
		fs[5] = aFloatArray4667[5];
		fs[6] = aFloatArray4667[9];
		fs[7] = aFloatArray4667[13];
		return fs;
	}

	public float[] method6590(float[] fs) {
		float f = aFloatArray4667[3] - aFloatArray4667[0];
		float f_292_ = aFloatArray4667[7] - aFloatArray4667[4];
		float f_293_ = aFloatArray4667[11] - aFloatArray4667[8];
		double d = Math.sqrt((double) (f * f + f_292_ * f_292_ + f_293_ * f_293_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_292_ / d);
		fs[2] = (float) ((double) f_293_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] - aFloatArray4667[12]) / d);
		return fs;
	}

	public float[] method6591(float[] fs) {
		float f = aFloatArray4667[3] + aFloatArray4667[1];
		float f_294_ = aFloatArray4667[7] + aFloatArray4667[5];
		float f_295_ = aFloatArray4667[11] + aFloatArray4667[9];
		double d = Math.sqrt((double) (f * f + f_294_ * f_294_ + f_295_ * f_295_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_294_ / d);
		fs[2] = (float) ((double) f_295_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] + aFloatArray4667[13]) / d);
		return fs;
	}

	public float[] method6592(float[] fs) {
		float f = aFloatArray4667[3] - aFloatArray4667[1];
		float f_296_ = aFloatArray4667[7] - aFloatArray4667[5];
		float f_297_ = aFloatArray4667[11] - aFloatArray4667[9];
		double d = Math.sqrt((double) (f * f + f_296_ * f_296_ + f_297_ * f_297_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_296_ / d);
		fs[2] = (float) ((double) f_297_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] - aFloatArray4667[13]) / d);
		return fs;
	}

	public boolean method6593() {
		return (aFloatArray4667[0] == 1.0F && aFloatArray4667[1] == 0.0F && aFloatArray4667[2] == 0.0F && aFloatArray4667[3] == 0.0F && aFloatArray4667[4] == 0.0F && aFloatArray4667[5] == 1.0F && aFloatArray4667[6] == 0.0F && aFloatArray4667[7] == 0.0F && aFloatArray4667[8] == 0.0F && aFloatArray4667[9] == 0.0F && aFloatArray4667[10] == 1.0F && aFloatArray4667[11] == 0.0F && aFloatArray4667[12] == 0.0F && aFloatArray4667[13] == 0.0F && aFloatArray4667[14] == 0.0F && aFloatArray4667[15] == 1.0F);
	}

	public float[] method6594(float[] fs) {
		float f = aFloatArray4667[3] - aFloatArray4667[1];
		float f_298_ = aFloatArray4667[7] - aFloatArray4667[5];
		float f_299_ = aFloatArray4667[11] - aFloatArray4667[9];
		double d = Math.sqrt((double) (f * f + f_298_ * f_298_ + f_299_ * f_299_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_298_ / d);
		fs[2] = (float) ((double) f_299_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] - aFloatArray4667[13]) / d);
		return fs;
	}

	public float[] method6595(float[] fs) {
		float f = aFloatArray4667[3] + aFloatArray4667[2];
		float f_300_ = aFloatArray4667[7] + aFloatArray4667[6];
		float f_301_ = aFloatArray4667[11] + aFloatArray4667[10];
		double d = Math.sqrt((double) (f * f + f_300_ * f_300_ + f_301_ * f_301_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_300_ / d);
		fs[2] = (float) ((double) f_301_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] + aFloatArray4667[14]) / d);
		return fs;
	}

	public float[] method6596(float[] fs) {
		System.arraycopy(aFloatArray4667, 0, fs, 0, 16);
		fs[3] = 0.0F;
		fs[7] = 0.0F;
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public Class384() {
		aFloatArray4667 = new float[16];
		method6518();
	}

	public void method6597(int i, int i_302_, int i_303_, float f, float f_304_, float f_305_) {
		if (i != 0) {
			float f_306_ = Class297.aFloatArray3536[i & 0x3fff];
			float f_307_ = Class297.aFloatArray3537[i & 0x3fff];
			aFloatArray4667[0] = f_306_ * (float) i_302_;
			aFloatArray4667[5] = f_306_ * (float) i_303_;
			aFloatArray4667[1] = f_307_ * (float) i_302_;
			aFloatArray4667[4] = -f_307_ * (float) i_303_;
			aFloatArray4667[10] = 1.0F;
			float[] fs = aFloatArray4667;
			float[] fs_308_ = aFloatArray4667;
			float[] fs_309_ = aFloatArray4667;
			aFloatArray4667[9] = 0.0F;
			fs_309_[8] = 0.0F;
			fs_308_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray4667[0] = (float) i_302_;
			aFloatArray4667[5] = (float) i_303_;
			aFloatArray4667[10] = 1.0F;
			float[] fs = aFloatArray4667;
			float[] fs_310_ = aFloatArray4667;
			float[] fs_311_ = aFloatArray4667;
			float[] fs_312_ = aFloatArray4667;
			float[] fs_313_ = aFloatArray4667;
			aFloatArray4667[9] = 0.0F;
			fs_313_[8] = 0.0F;
			fs_312_[6] = 0.0F;
			fs_311_[4] = 0.0F;
			fs_310_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray4667;
		float[] fs_314_ = aFloatArray4667;
		aFloatArray4667[11] = 0.0F;
		fs_314_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray4667[15] = 1.0F;
		aFloatArray4667[12] = f;
		aFloatArray4667[13] = f_304_;
		aFloatArray4667[14] = f_305_;
	}

	public void method6598(int i, int i_315_, int i_316_, float f, float f_317_, float f_318_) {
		if (i != 0) {
			float f_319_ = Class297.aFloatArray3536[i & 0x3fff];
			float f_320_ = Class297.aFloatArray3537[i & 0x3fff];
			aFloatArray4667[0] = f_319_ * (float) i_315_;
			aFloatArray4667[5] = f_319_ * (float) i_316_;
			aFloatArray4667[1] = f_320_ * (float) i_315_;
			aFloatArray4667[4] = -f_320_ * (float) i_316_;
			aFloatArray4667[10] = 1.0F;
			float[] fs = aFloatArray4667;
			float[] fs_321_ = aFloatArray4667;
			float[] fs_322_ = aFloatArray4667;
			aFloatArray4667[9] = 0.0F;
			fs_322_[8] = 0.0F;
			fs_321_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray4667[0] = (float) i_315_;
			aFloatArray4667[5] = (float) i_316_;
			aFloatArray4667[10] = 1.0F;
			float[] fs = aFloatArray4667;
			float[] fs_323_ = aFloatArray4667;
			float[] fs_324_ = aFloatArray4667;
			float[] fs_325_ = aFloatArray4667;
			float[] fs_326_ = aFloatArray4667;
			aFloatArray4667[9] = 0.0F;
			fs_326_[8] = 0.0F;
			fs_325_[6] = 0.0F;
			fs_324_[4] = 0.0F;
			fs_323_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray4667;
		float[] fs_327_ = aFloatArray4667;
		aFloatArray4667[11] = 0.0F;
		fs_327_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray4667[15] = 1.0F;
		aFloatArray4667[12] = f;
		aFloatArray4667[13] = f_317_;
		aFloatArray4667[14] = f_318_;
	}

	public void method6599() {
		float f = aFloatArray4667[0];
		float f_328_ = aFloatArray4667[4];
		float f_329_ = aFloatArray4667[8];
		float f_330_ = aFloatArray4667[12];
		float f_331_ = aFloatArray4667[1];
		float f_332_ = aFloatArray4667[5];
		float f_333_ = aFloatArray4667[9];
		float f_334_ = aFloatArray4667[13];
		float f_335_ = aFloatArray4667[2];
		float f_336_ = aFloatArray4667[6];
		float f_337_ = aFloatArray4667[10];
		float f_338_ = aFloatArray4667[14];
		float f_339_ = aFloatArray4667[3];
		float f_340_ = aFloatArray4667[7];
		float f_341_ = aFloatArray4667[11];
		float f_342_ = aFloatArray4667[15];
		aFloatArray4667[0] = f;
		aFloatArray4667[1] = f_328_;
		aFloatArray4667[2] = f_329_;
		aFloatArray4667[3] = f_330_;
		aFloatArray4667[4] = f_331_;
		aFloatArray4667[5] = f_332_;
		aFloatArray4667[6] = f_333_;
		aFloatArray4667[7] = f_334_;
		aFloatArray4667[8] = f_335_;
		aFloatArray4667[9] = f_336_;
		aFloatArray4667[10] = f_337_;
		aFloatArray4667[11] = f_338_;
		aFloatArray4667[12] = f_339_;
		aFloatArray4667[13] = f_340_;
		aFloatArray4667[14] = f_341_;
		aFloatArray4667[15] = f_342_;
	}

	public float[] method6600(float[] fs) {
		System.arraycopy(aFloatArray4667, 0, fs, 0, 16);
		return fs;
	}

	public boolean method6601() {
		return (aFloatArray4667[0] == 1.0F && aFloatArray4667[1] == 0.0F && aFloatArray4667[2] == 0.0F && aFloatArray4667[3] == 0.0F && aFloatArray4667[4] == 0.0F && aFloatArray4667[5] == 1.0F && aFloatArray4667[6] == 0.0F && aFloatArray4667[7] == 0.0F && aFloatArray4667[8] == 0.0F && aFloatArray4667[9] == 0.0F && aFloatArray4667[10] == 1.0F && aFloatArray4667[11] == 0.0F && aFloatArray4667[12] == 0.0F && aFloatArray4667[13] == 0.0F && aFloatArray4667[14] == 0.0F && aFloatArray4667[15] == 1.0F);
	}

	public float[] method6602(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[1];
		fs[2] = aFloatArray4667[2];
		fs[3] = aFloatArray4667[4];
		fs[4] = aFloatArray4667[5];
		fs[5] = aFloatArray4667[6];
		fs[6] = aFloatArray4667[8];
		fs[7] = aFloatArray4667[9];
		fs[8] = aFloatArray4667[10];
		return fs;
	}

	public float[] method6603(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[1];
		fs[2] = aFloatArray4667[2];
		fs[3] = aFloatArray4667[4];
		fs[4] = aFloatArray4667[5];
		fs[5] = aFloatArray4667[6];
		fs[6] = aFloatArray4667[8];
		fs[7] = aFloatArray4667[9];
		fs[8] = aFloatArray4667[10];
		return fs;
	}

	public float[] method6604(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[4];
		fs[2] = aFloatArray4667[8];
		fs[3] = aFloatArray4667[12];
		fs[4] = aFloatArray4667[1];
		fs[5] = aFloatArray4667[5];
		fs[6] = aFloatArray4667[9];
		fs[7] = aFloatArray4667[13];
		fs[8] = aFloatArray4667[2];
		fs[9] = aFloatArray4667[6];
		fs[10] = aFloatArray4667[10];
		fs[11] = aFloatArray4667[14];
		fs[12] = aFloatArray4667[3];
		fs[13] = aFloatArray4667[7];
		fs[14] = aFloatArray4667[11];
		fs[15] = aFloatArray4667[15];
		return fs;
	}

	public float[] method6605(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[4];
		fs[2] = aFloatArray4667[8];
		fs[3] = aFloatArray4667[12];
		fs[4] = aFloatArray4667[1];
		fs[5] = aFloatArray4667[5];
		fs[6] = aFloatArray4667[9];
		fs[7] = aFloatArray4667[13];
		fs[8] = aFloatArray4667[2];
		fs[9] = aFloatArray4667[6];
		fs[10] = aFloatArray4667[10];
		fs[11] = aFloatArray4667[14];
		fs[12] = aFloatArray4667[3];
		fs[13] = aFloatArray4667[7];
		fs[14] = aFloatArray4667[11];
		fs[15] = aFloatArray4667[15];
		return fs;
	}

	public float[] method6606(float[] fs) {
		float f = aFloatArray4667[3] - aFloatArray4667[1];
		float f_343_ = aFloatArray4667[7] - aFloatArray4667[5];
		float f_344_ = aFloatArray4667[11] - aFloatArray4667[9];
		double d = Math.sqrt((double) (f * f + f_343_ * f_343_ + f_344_ * f_344_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_343_ / d);
		fs[2] = (float) ((double) f_344_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] - aFloatArray4667[13]) / d);
		return fs;
	}

	public float[] method6607(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[1];
		fs[2] = aFloatArray4667[4];
		fs[3] = aFloatArray4667[5];
		fs[4] = aFloatArray4667[8];
		fs[5] = aFloatArray4667[9];
		fs[6] = aFloatArray4667[12];
		fs[7] = aFloatArray4667[13];
		return fs;
	}

	public float[] method6608(float[] fs) {
		float f = aFloatArray4667[3] + aFloatArray4667[0];
		float f_345_ = aFloatArray4667[7] + aFloatArray4667[4];
		float f_346_ = aFloatArray4667[11] + aFloatArray4667[8];
		double d = Math.sqrt((double) (f * f + f_345_ * f_345_ + f_346_ * f_346_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_345_ / d);
		fs[2] = (float) ((double) f_346_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] + aFloatArray4667[12]) / d);
		return fs;
	}

	public float[] method6609(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[4];
		fs[2] = aFloatArray4667[8];
		fs[3] = aFloatArray4667[12];
		fs[4] = aFloatArray4667[1];
		fs[5] = aFloatArray4667[5];
		fs[6] = aFloatArray4667[9];
		fs[7] = aFloatArray4667[13];
		return fs;
	}

	public float[] method6610(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[1];
		fs[2] = 0.0F;
		fs[3] = 0.0F;
		fs[4] = aFloatArray4667[4];
		fs[5] = aFloatArray4667[5];
		fs[6] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = aFloatArray4667[12];
		fs[9] = aFloatArray4667[13];
		fs[10] = aFloatArray4667[14];
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public float[] method6611(float[] fs) {
		fs[0] = aFloatArray4667[0];
		fs[1] = aFloatArray4667[1];
		fs[2] = 0.0F;
		fs[3] = 0.0F;
		fs[4] = aFloatArray4667[4];
		fs[5] = aFloatArray4667[5];
		fs[6] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = aFloatArray4667[12];
		fs[9] = aFloatArray4667[13];
		fs[10] = aFloatArray4667[14];
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	float method6612() {
		return ((aFloatArray4667[0] * aFloatArray4667[5] * aFloatArray4667[10] * aFloatArray4667[15]) - (aFloatArray4667[0] * aFloatArray4667[5] * aFloatArray4667[11] * aFloatArray4667[14]) - (aFloatArray4667[0] * aFloatArray4667[6] * aFloatArray4667[9] * aFloatArray4667[15]) + (aFloatArray4667[0] * aFloatArray4667[6] * aFloatArray4667[11] * aFloatArray4667[13]) + (aFloatArray4667[0] * aFloatArray4667[7] * aFloatArray4667[9] * aFloatArray4667[14])
				- (aFloatArray4667[0] * aFloatArray4667[7] * aFloatArray4667[10] * aFloatArray4667[13]) - (aFloatArray4667[1] * aFloatArray4667[4] * aFloatArray4667[10] * aFloatArray4667[15]) + (aFloatArray4667[1] * aFloatArray4667[4] * aFloatArray4667[11] * aFloatArray4667[14]) + (aFloatArray4667[1] * aFloatArray4667[6] * aFloatArray4667[8] * aFloatArray4667[15]) - (aFloatArray4667[1] * aFloatArray4667[6] * aFloatArray4667[11] * aFloatArray4667[12])
				- (aFloatArray4667[1] * aFloatArray4667[7] * aFloatArray4667[8] * aFloatArray4667[14]) + (aFloatArray4667[1] * aFloatArray4667[7] * aFloatArray4667[10] * aFloatArray4667[12]) + (aFloatArray4667[2] * aFloatArray4667[4] * aFloatArray4667[9] * aFloatArray4667[15]) - (aFloatArray4667[2] * aFloatArray4667[4] * aFloatArray4667[11] * aFloatArray4667[13]) - (aFloatArray4667[2] * aFloatArray4667[5] * aFloatArray4667[8] * aFloatArray4667[15])
				+ (aFloatArray4667[2] * aFloatArray4667[5] * aFloatArray4667[11] * aFloatArray4667[12]) + (aFloatArray4667[2] * aFloatArray4667[7] * aFloatArray4667[8] * aFloatArray4667[13]) - (aFloatArray4667[2] * aFloatArray4667[7] * aFloatArray4667[9] * aFloatArray4667[12]) - (aFloatArray4667[3] * aFloatArray4667[4] * aFloatArray4667[9] * aFloatArray4667[14]) + (aFloatArray4667[3] * aFloatArray4667[4] * aFloatArray4667[10] * aFloatArray4667[13])
				+ (aFloatArray4667[3] * aFloatArray4667[5] * aFloatArray4667[8] * aFloatArray4667[14]) - (aFloatArray4667[3] * aFloatArray4667[5] * aFloatArray4667[10] * aFloatArray4667[12]) - (aFloatArray4667[3] * aFloatArray4667[6] * aFloatArray4667[8] * aFloatArray4667[13]) + (aFloatArray4667[3] * aFloatArray4667[6] * aFloatArray4667[9] * aFloatArray4667[12]));
	}

	public float[] method6613(float[] fs) {
		float f = aFloatArray4667[3] + aFloatArray4667[1];
		float f_347_ = aFloatArray4667[7] + aFloatArray4667[5];
		float f_348_ = aFloatArray4667[11] + aFloatArray4667[9];
		double d = Math.sqrt((double) (f * f + f_347_ * f_347_ + f_348_ * f_348_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_347_ / d);
		fs[2] = (float) ((double) f_348_ / d);
		fs[3] = (float) ((double) (aFloatArray4667[15] + aFloatArray4667[13]) / d);
		return fs;
	}

	public void method6614(float f, float f_349_, float f_350_, float[] fs) {
		fs[0] = (aFloatArray4667[0] * f + aFloatArray4667[4] * f_349_ + aFloatArray4667[8] * f_350_);
		fs[1] = (aFloatArray4667[1] * f + aFloatArray4667[5] * f_349_ + aFloatArray4667[9] * f_350_);
		fs[2] = (aFloatArray4667[2] * f + aFloatArray4667[6] * f_349_ + aFloatArray4667[10] * f_350_);
		if (fs.length > 3)
			fs[3] = (aFloatArray4667[3] * f + aFloatArray4667[7] * f_349_ + aFloatArray4667[11] * f_350_);
	}

	public void method6615(int i, int i_351_, int i_352_, float f, float f_353_, float f_354_) {
		if (i != 0) {
			float f_355_ = Class297.aFloatArray3536[i & 0x3fff];
			float f_356_ = Class297.aFloatArray3537[i & 0x3fff];
			aFloatArray4667[0] = f_355_ * (float) i_351_;
			aFloatArray4667[5] = f_355_ * (float) i_352_;
			aFloatArray4667[1] = f_356_ * (float) i_351_;
			aFloatArray4667[4] = -f_356_ * (float) i_352_;
			aFloatArray4667[10] = 1.0F;
			float[] fs = aFloatArray4667;
			float[] fs_357_ = aFloatArray4667;
			float[] fs_358_ = aFloatArray4667;
			aFloatArray4667[9] = 0.0F;
			fs_358_[8] = 0.0F;
			fs_357_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray4667[0] = (float) i_351_;
			aFloatArray4667[5] = (float) i_352_;
			aFloatArray4667[10] = 1.0F;
			float[] fs = aFloatArray4667;
			float[] fs_359_ = aFloatArray4667;
			float[] fs_360_ = aFloatArray4667;
			float[] fs_361_ = aFloatArray4667;
			float[] fs_362_ = aFloatArray4667;
			aFloatArray4667[9] = 0.0F;
			fs_362_[8] = 0.0F;
			fs_361_[6] = 0.0F;
			fs_360_[4] = 0.0F;
			fs_359_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray4667;
		float[] fs_363_ = aFloatArray4667;
		aFloatArray4667[11] = 0.0F;
		fs_363_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray4667[15] = 1.0F;
		aFloatArray4667[12] = f;
		aFloatArray4667[13] = f_353_;
		aFloatArray4667[14] = f_354_;
	}

	public void method6616(int i, int i_364_, int i_365_, float f, float f_366_, float f_367_) {
		if (i != 0) {
			float f_368_ = Class297.aFloatArray3536[i & 0x3fff];
			float f_369_ = Class297.aFloatArray3537[i & 0x3fff];
			aFloatArray4667[0] = f_368_ * (float) i_364_;
			aFloatArray4667[5] = f_368_ * (float) i_365_;
			aFloatArray4667[1] = f_369_ * (float) i_364_;
			aFloatArray4667[4] = -f_369_ * (float) i_365_;
			aFloatArray4667[10] = 1.0F;
			float[] fs = aFloatArray4667;
			float[] fs_370_ = aFloatArray4667;
			float[] fs_371_ = aFloatArray4667;
			aFloatArray4667[9] = 0.0F;
			fs_371_[8] = 0.0F;
			fs_370_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray4667[0] = (float) i_364_;
			aFloatArray4667[5] = (float) i_365_;
			aFloatArray4667[10] = 1.0F;
			float[] fs = aFloatArray4667;
			float[] fs_372_ = aFloatArray4667;
			float[] fs_373_ = aFloatArray4667;
			float[] fs_374_ = aFloatArray4667;
			float[] fs_375_ = aFloatArray4667;
			aFloatArray4667[9] = 0.0F;
			fs_375_[8] = 0.0F;
			fs_374_[6] = 0.0F;
			fs_373_[4] = 0.0F;
			fs_372_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray4667;
		float[] fs_376_ = aFloatArray4667;
		aFloatArray4667[11] = 0.0F;
		fs_376_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray4667[15] = 1.0F;
		aFloatArray4667[12] = f;
		aFloatArray4667[13] = f_366_;
		aFloatArray4667[14] = f_367_;
	}

	public int method6617() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(aFloatArray4667);
		return i;
	}

	public boolean method6618(Object object) {
		if (!(object instanceof Class384))
			return false;
		Class384 class384_377_ = (Class384) object;
		for (int i = 0; i < 16; i++) {
			if (aFloatArray4667[i] != class384_377_.aFloatArray4667[i])
				return false;
		}
		return true;
	}

	public void method6619() {
		aFloatArray4667[0] = 1.0F;
		aFloatArray4667[1] = 0.0F;
		aFloatArray4667[2] = 0.0F;
		aFloatArray4667[3] = 0.0F;
		aFloatArray4667[4] = 0.0F;
		aFloatArray4667[5] = 1.0F;
		aFloatArray4667[6] = 0.0F;
		aFloatArray4667[7] = 0.0F;
		aFloatArray4667[8] = 0.0F;
		aFloatArray4667[9] = 0.0F;
		aFloatArray4667[10] = 1.0F;
		aFloatArray4667[11] = 0.0F;
		aFloatArray4667[12] = 0.0F;
		aFloatArray4667[13] = 0.0F;
		aFloatArray4667[14] = 0.0F;
		aFloatArray4667[15] = 1.0F;
	}

	public boolean method6620(Object object) {
		if (!(object instanceof Class384))
			return false;
		Class384 class384_378_ = (Class384) object;
		for (int i = 0; i < 16; i++) {
			if (aFloatArray4667[i] != class384_378_.aFloatArray4667[i])
				return false;
		}
		return true;
	}
}
