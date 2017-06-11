/* Class233 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Matrix4f {
	public float[] aFloatArray2594;
	public static Matrix4f aClass233_2595 = new Matrix4f();

	public Matrix4f(Matrix4f class233_0_) {
		aFloatArray2594 = new float[16];
		method2142(class233_0_);
	}

	public void method2142(Matrix4f class233_1_) {
		System.arraycopy(class233_1_.aFloatArray2594, 0, aFloatArray2594, 0, 16);
	}

	public void method2143(Matrix4f class233_2_, Matrix4f class233_3_) {
		float f = (class233_2_.aFloatArray2594[0] * class233_3_.aFloatArray2594[0] + (class233_2_.aFloatArray2594[1] * class233_3_.aFloatArray2594[4]) + (class233_2_.aFloatArray2594[2] * class233_3_.aFloatArray2594[8]) + (class233_2_.aFloatArray2594[3] * class233_3_.aFloatArray2594[12]));
		float f_4_ = (class233_2_.aFloatArray2594[0] * class233_3_.aFloatArray2594[1] + (class233_2_.aFloatArray2594[1] * class233_3_.aFloatArray2594[5]) + (class233_2_.aFloatArray2594[2] * class233_3_.aFloatArray2594[9]) + (class233_2_.aFloatArray2594[3] * class233_3_.aFloatArray2594[13]));
		float f_5_ = (class233_2_.aFloatArray2594[0] * class233_3_.aFloatArray2594[2] + (class233_2_.aFloatArray2594[1] * class233_3_.aFloatArray2594[6]) + (class233_2_.aFloatArray2594[2] * class233_3_.aFloatArray2594[10]) + (class233_2_.aFloatArray2594[3] * class233_3_.aFloatArray2594[14]));
		float f_6_ = (class233_2_.aFloatArray2594[0] * class233_3_.aFloatArray2594[3] + (class233_2_.aFloatArray2594[1] * class233_3_.aFloatArray2594[7]) + (class233_2_.aFloatArray2594[2] * class233_3_.aFloatArray2594[11]) + (class233_2_.aFloatArray2594[3] * class233_3_.aFloatArray2594[15]));
		float f_7_ = (class233_2_.aFloatArray2594[4] * class233_3_.aFloatArray2594[0] + (class233_2_.aFloatArray2594[5] * class233_3_.aFloatArray2594[4]) + (class233_2_.aFloatArray2594[6] * class233_3_.aFloatArray2594[8]) + (class233_2_.aFloatArray2594[7] * class233_3_.aFloatArray2594[12]));
		float f_8_ = (class233_2_.aFloatArray2594[4] * class233_3_.aFloatArray2594[1] + (class233_2_.aFloatArray2594[5] * class233_3_.aFloatArray2594[5]) + (class233_2_.aFloatArray2594[6] * class233_3_.aFloatArray2594[9]) + (class233_2_.aFloatArray2594[7] * class233_3_.aFloatArray2594[13]));
		float f_9_ = (class233_2_.aFloatArray2594[4] * class233_3_.aFloatArray2594[2] + (class233_2_.aFloatArray2594[5] * class233_3_.aFloatArray2594[6]) + (class233_2_.aFloatArray2594[6] * class233_3_.aFloatArray2594[10]) + (class233_2_.aFloatArray2594[7] * class233_3_.aFloatArray2594[14]));
		float f_10_ = (class233_2_.aFloatArray2594[4] * class233_3_.aFloatArray2594[3] + (class233_2_.aFloatArray2594[5] * class233_3_.aFloatArray2594[7]) + (class233_2_.aFloatArray2594[6] * class233_3_.aFloatArray2594[11]) + (class233_2_.aFloatArray2594[7] * class233_3_.aFloatArray2594[15]));
		float f_11_ = (class233_2_.aFloatArray2594[8] * class233_3_.aFloatArray2594[0] + (class233_2_.aFloatArray2594[9] * class233_3_.aFloatArray2594[4]) + (class233_2_.aFloatArray2594[10] * class233_3_.aFloatArray2594[8]) + (class233_2_.aFloatArray2594[11] * class233_3_.aFloatArray2594[12]));
		float f_12_ = (class233_2_.aFloatArray2594[8] * class233_3_.aFloatArray2594[1] + (class233_2_.aFloatArray2594[9] * class233_3_.aFloatArray2594[5]) + (class233_2_.aFloatArray2594[10] * class233_3_.aFloatArray2594[9]) + (class233_2_.aFloatArray2594[11] * class233_3_.aFloatArray2594[13]));
		float f_13_ = (class233_2_.aFloatArray2594[8] * class233_3_.aFloatArray2594[2] + (class233_2_.aFloatArray2594[9] * class233_3_.aFloatArray2594[6]) + (class233_2_.aFloatArray2594[10] * class233_3_.aFloatArray2594[10]) + (class233_2_.aFloatArray2594[11] * class233_3_.aFloatArray2594[14]));
		float f_14_ = (class233_2_.aFloatArray2594[8] * class233_3_.aFloatArray2594[3] + (class233_2_.aFloatArray2594[9] * class233_3_.aFloatArray2594[7]) + (class233_2_.aFloatArray2594[10] * class233_3_.aFloatArray2594[11]) + (class233_2_.aFloatArray2594[11] * class233_3_.aFloatArray2594[15]));
		float f_15_ = (class233_2_.aFloatArray2594[12] * class233_3_.aFloatArray2594[0] + (class233_2_.aFloatArray2594[13] * class233_3_.aFloatArray2594[4]) + (class233_2_.aFloatArray2594[14] * class233_3_.aFloatArray2594[8]) + (class233_2_.aFloatArray2594[15] * class233_3_.aFloatArray2594[12]));
		float f_16_ = (class233_2_.aFloatArray2594[12] * class233_3_.aFloatArray2594[1] + (class233_2_.aFloatArray2594[13] * class233_3_.aFloatArray2594[5]) + (class233_2_.aFloatArray2594[14] * class233_3_.aFloatArray2594[9]) + (class233_2_.aFloatArray2594[15] * class233_3_.aFloatArray2594[13]));
		float f_17_ = (class233_2_.aFloatArray2594[12] * class233_3_.aFloatArray2594[2] + (class233_2_.aFloatArray2594[13] * class233_3_.aFloatArray2594[6]) + (class233_2_.aFloatArray2594[14] * class233_3_.aFloatArray2594[10]) + (class233_2_.aFloatArray2594[15] * class233_3_.aFloatArray2594[14]));
		float f_18_ = (class233_2_.aFloatArray2594[12] * class233_3_.aFloatArray2594[3] + (class233_2_.aFloatArray2594[13] * class233_3_.aFloatArray2594[7]) + (class233_2_.aFloatArray2594[14] * class233_3_.aFloatArray2594[11]) + (class233_2_.aFloatArray2594[15] * class233_3_.aFloatArray2594[15]));
		aFloatArray2594[0] = f;
		aFloatArray2594[1] = f_4_;
		aFloatArray2594[2] = f_5_;
		aFloatArray2594[3] = f_6_;
		aFloatArray2594[4] = f_7_;
		aFloatArray2594[5] = f_8_;
		aFloatArray2594[6] = f_9_;
		aFloatArray2594[7] = f_10_;
		aFloatArray2594[8] = f_11_;
		aFloatArray2594[9] = f_12_;
		aFloatArray2594[10] = f_13_;
		aFloatArray2594[11] = f_14_;
		aFloatArray2594[12] = f_15_;
		aFloatArray2594[13] = f_16_;
		aFloatArray2594[14] = f_17_;
		aFloatArray2594[15] = f_18_;
	}

	public void method2144(Matrix4f class233_19_) {
		float f = (aFloatArray2594[0] * class233_19_.aFloatArray2594[0] + aFloatArray2594[1] * class233_19_.aFloatArray2594[4] + aFloatArray2594[2] * class233_19_.aFloatArray2594[8] + aFloatArray2594[3] * class233_19_.aFloatArray2594[12]);
		float f_20_ = (aFloatArray2594[0] * class233_19_.aFloatArray2594[1] + aFloatArray2594[1] * class233_19_.aFloatArray2594[5] + aFloatArray2594[2] * class233_19_.aFloatArray2594[9] + aFloatArray2594[3] * class233_19_.aFloatArray2594[13]);
		float f_21_ = (aFloatArray2594[0] * class233_19_.aFloatArray2594[2] + aFloatArray2594[1] * class233_19_.aFloatArray2594[6] + aFloatArray2594[2] * class233_19_.aFloatArray2594[10] + aFloatArray2594[3] * class233_19_.aFloatArray2594[14]);
		float f_22_ = (aFloatArray2594[0] * class233_19_.aFloatArray2594[3] + aFloatArray2594[1] * class233_19_.aFloatArray2594[7] + aFloatArray2594[2] * class233_19_.aFloatArray2594[11] + aFloatArray2594[3] * class233_19_.aFloatArray2594[15]);
		float f_23_ = (aFloatArray2594[4] * class233_19_.aFloatArray2594[0] + aFloatArray2594[5] * class233_19_.aFloatArray2594[4] + aFloatArray2594[6] * class233_19_.aFloatArray2594[8] + aFloatArray2594[7] * class233_19_.aFloatArray2594[12]);
		float f_24_ = (aFloatArray2594[4] * class233_19_.aFloatArray2594[1] + aFloatArray2594[5] * class233_19_.aFloatArray2594[5] + aFloatArray2594[6] * class233_19_.aFloatArray2594[9] + aFloatArray2594[7] * class233_19_.aFloatArray2594[13]);
		float f_25_ = (aFloatArray2594[4] * class233_19_.aFloatArray2594[2] + aFloatArray2594[5] * class233_19_.aFloatArray2594[6] + aFloatArray2594[6] * class233_19_.aFloatArray2594[10] + aFloatArray2594[7] * class233_19_.aFloatArray2594[14]);
		float f_26_ = (aFloatArray2594[4] * class233_19_.aFloatArray2594[3] + aFloatArray2594[5] * class233_19_.aFloatArray2594[7] + aFloatArray2594[6] * class233_19_.aFloatArray2594[11] + aFloatArray2594[7] * class233_19_.aFloatArray2594[15]);
		float f_27_ = (aFloatArray2594[8] * class233_19_.aFloatArray2594[0] + aFloatArray2594[9] * class233_19_.aFloatArray2594[4] + aFloatArray2594[10] * class233_19_.aFloatArray2594[8] + aFloatArray2594[11] * class233_19_.aFloatArray2594[12]);
		float f_28_ = (aFloatArray2594[8] * class233_19_.aFloatArray2594[1] + aFloatArray2594[9] * class233_19_.aFloatArray2594[5] + aFloatArray2594[10] * class233_19_.aFloatArray2594[9] + aFloatArray2594[11] * class233_19_.aFloatArray2594[13]);
		float f_29_ = (aFloatArray2594[8] * class233_19_.aFloatArray2594[2] + aFloatArray2594[9] * class233_19_.aFloatArray2594[6] + aFloatArray2594[10] * class233_19_.aFloatArray2594[10] + aFloatArray2594[11] * class233_19_.aFloatArray2594[14]);
		float f_30_ = (aFloatArray2594[8] * class233_19_.aFloatArray2594[3] + aFloatArray2594[9] * class233_19_.aFloatArray2594[7] + aFloatArray2594[10] * class233_19_.aFloatArray2594[11] + aFloatArray2594[11] * class233_19_.aFloatArray2594[15]);
		float f_31_ = (aFloatArray2594[12] * class233_19_.aFloatArray2594[0] + aFloatArray2594[13] * class233_19_.aFloatArray2594[4] + aFloatArray2594[14] * class233_19_.aFloatArray2594[8] + aFloatArray2594[15] * class233_19_.aFloatArray2594[12]);
		float f_32_ = (aFloatArray2594[12] * class233_19_.aFloatArray2594[1] + aFloatArray2594[13] * class233_19_.aFloatArray2594[5] + aFloatArray2594[14] * class233_19_.aFloatArray2594[9] + aFloatArray2594[15] * class233_19_.aFloatArray2594[13]);
		float f_33_ = (aFloatArray2594[12] * class233_19_.aFloatArray2594[2] + aFloatArray2594[13] * class233_19_.aFloatArray2594[6] + aFloatArray2594[14] * class233_19_.aFloatArray2594[10] + aFloatArray2594[15] * class233_19_.aFloatArray2594[14]);
		float f_34_ = (aFloatArray2594[12] * class233_19_.aFloatArray2594[3] + aFloatArray2594[13] * class233_19_.aFloatArray2594[7] + aFloatArray2594[14] * class233_19_.aFloatArray2594[11] + aFloatArray2594[15] * class233_19_.aFloatArray2594[15]);
		aFloatArray2594[0] = f;
		aFloatArray2594[1] = f_20_;
		aFloatArray2594[2] = f_21_;
		aFloatArray2594[3] = f_22_;
		aFloatArray2594[4] = f_23_;
		aFloatArray2594[5] = f_24_;
		aFloatArray2594[6] = f_25_;
		aFloatArray2594[7] = f_26_;
		aFloatArray2594[8] = f_27_;
		aFloatArray2594[9] = f_28_;
		aFloatArray2594[10] = f_29_;
		aFloatArray2594[11] = f_30_;
		aFloatArray2594[12] = f_31_;
		aFloatArray2594[13] = f_32_;
		aFloatArray2594[14] = f_33_;
		aFloatArray2594[15] = f_34_;
	}

	public void method2145(Matrix3f class222) {
		aFloatArray2594[0] = ((Matrix3f) class222).aFloat2494;
		aFloatArray2594[1] = ((Matrix3f) class222).aFloat2502;
		aFloatArray2594[2] = ((Matrix3f) class222).aFloat2495;
		aFloatArray2594[3] = 0.0F;
		aFloatArray2594[4] = ((Matrix3f) class222).aFloat2496;
		aFloatArray2594[5] = ((Matrix3f) class222).aFloat2497;
		aFloatArray2594[6] = ((Matrix3f) class222).aFloat2498;
		aFloatArray2594[7] = 0.0F;
		aFloatArray2594[8] = ((Matrix3f) class222).aFloat2499;
		aFloatArray2594[9] = ((Matrix3f) class222).aFloat2500;
		aFloatArray2594[10] = ((Matrix3f) class222).aFloat2501;
		aFloatArray2594[11] = 0.0F;
		aFloatArray2594[12] = ((Matrix3f) class222).aFloat2492;
		aFloatArray2594[13] = ((Matrix3f) class222).aFloat2503;
		aFloatArray2594[14] = ((Matrix3f) class222).aFloat2493;
		aFloatArray2594[15] = 1.0F;
	}

	public void method2146() {
		float f = 1.0F / method2169();
		float f_35_ = (aFloatArray2594[5] * aFloatArray2594[10] * aFloatArray2594[15] - aFloatArray2594[5] * aFloatArray2594[11] * aFloatArray2594[14] - aFloatArray2594[6] * aFloatArray2594[9] * aFloatArray2594[15] + aFloatArray2594[6] * aFloatArray2594[11] * aFloatArray2594[13] + aFloatArray2594[7] * aFloatArray2594[9] * aFloatArray2594[14] - (aFloatArray2594[7] * aFloatArray2594[10] * aFloatArray2594[13])) * f;
		float f_36_ = (-aFloatArray2594[1] * aFloatArray2594[10] * aFloatArray2594[15] + aFloatArray2594[1] * aFloatArray2594[11] * aFloatArray2594[14] + aFloatArray2594[2] * aFloatArray2594[9] * aFloatArray2594[15] - aFloatArray2594[2] * aFloatArray2594[11] * aFloatArray2594[13] - aFloatArray2594[3] * aFloatArray2594[9] * aFloatArray2594[14] + (aFloatArray2594[3] * aFloatArray2594[10] * aFloatArray2594[13])) * f;
		float f_37_ = ((aFloatArray2594[1] * aFloatArray2594[6] * aFloatArray2594[15] - aFloatArray2594[1] * aFloatArray2594[7] * aFloatArray2594[14] - aFloatArray2594[2] * aFloatArray2594[5] * aFloatArray2594[15] + aFloatArray2594[2] * aFloatArray2594[7] * aFloatArray2594[13] + aFloatArray2594[3] * aFloatArray2594[5] * aFloatArray2594[14] - (aFloatArray2594[3] * aFloatArray2594[6] * aFloatArray2594[13])) * f);
		float f_38_ = ((-aFloatArray2594[1] * aFloatArray2594[6] * aFloatArray2594[11] + aFloatArray2594[1] * aFloatArray2594[7] * aFloatArray2594[10] + aFloatArray2594[2] * aFloatArray2594[5] * aFloatArray2594[11] - aFloatArray2594[2] * aFloatArray2594[7] * aFloatArray2594[9] - aFloatArray2594[3] * aFloatArray2594[5] * aFloatArray2594[10] + aFloatArray2594[3] * aFloatArray2594[6] * aFloatArray2594[9]) * f);
		float f_39_ = (-aFloatArray2594[4] * aFloatArray2594[10] * aFloatArray2594[15] + aFloatArray2594[4] * aFloatArray2594[11] * aFloatArray2594[14] + aFloatArray2594[6] * aFloatArray2594[8] * aFloatArray2594[15] - aFloatArray2594[6] * aFloatArray2594[11] * aFloatArray2594[12] - aFloatArray2594[7] * aFloatArray2594[8] * aFloatArray2594[14] + (aFloatArray2594[7] * aFloatArray2594[10] * aFloatArray2594[12])) * f;
		float f_40_ = (aFloatArray2594[0] * aFloatArray2594[10] * aFloatArray2594[15] - aFloatArray2594[0] * aFloatArray2594[11] * aFloatArray2594[14] - aFloatArray2594[2] * aFloatArray2594[8] * aFloatArray2594[15] + aFloatArray2594[2] * aFloatArray2594[11] * aFloatArray2594[12] + aFloatArray2594[3] * aFloatArray2594[8] * aFloatArray2594[14] - (aFloatArray2594[3] * aFloatArray2594[10] * aFloatArray2594[12])) * f;
		float f_41_ = ((-aFloatArray2594[0] * aFloatArray2594[6] * aFloatArray2594[15] + aFloatArray2594[0] * aFloatArray2594[7] * aFloatArray2594[14] + aFloatArray2594[2] * aFloatArray2594[4] * aFloatArray2594[15] - aFloatArray2594[2] * aFloatArray2594[7] * aFloatArray2594[12] - aFloatArray2594[3] * aFloatArray2594[4] * aFloatArray2594[14] + (aFloatArray2594[3] * aFloatArray2594[6] * aFloatArray2594[12])) * f);
		float f_42_ = ((aFloatArray2594[0] * aFloatArray2594[6] * aFloatArray2594[11] - aFloatArray2594[0] * aFloatArray2594[7] * aFloatArray2594[10] - aFloatArray2594[2] * aFloatArray2594[4] * aFloatArray2594[11] + aFloatArray2594[2] * aFloatArray2594[7] * aFloatArray2594[8] + aFloatArray2594[3] * aFloatArray2594[4] * aFloatArray2594[10] - aFloatArray2594[3] * aFloatArray2594[6] * aFloatArray2594[8]) * f);
		float f_43_ = (aFloatArray2594[4] * aFloatArray2594[9] * aFloatArray2594[15] - aFloatArray2594[4] * aFloatArray2594[11] * aFloatArray2594[13] - aFloatArray2594[5] * aFloatArray2594[8] * aFloatArray2594[15] + aFloatArray2594[5] * aFloatArray2594[11] * aFloatArray2594[12] + aFloatArray2594[7] * aFloatArray2594[8] * aFloatArray2594[13] - (aFloatArray2594[7] * aFloatArray2594[9] * aFloatArray2594[12])) * f;
		float f_44_ = (-aFloatArray2594[0] * aFloatArray2594[9] * aFloatArray2594[15] + aFloatArray2594[0] * aFloatArray2594[11] * aFloatArray2594[13] + aFloatArray2594[1] * aFloatArray2594[8] * aFloatArray2594[15] - aFloatArray2594[1] * aFloatArray2594[11] * aFloatArray2594[12] - aFloatArray2594[3] * aFloatArray2594[8] * aFloatArray2594[13] + (aFloatArray2594[3] * aFloatArray2594[9] * aFloatArray2594[12])) * f;
		float f_45_ = ((aFloatArray2594[0] * aFloatArray2594[5] * aFloatArray2594[15] - aFloatArray2594[0] * aFloatArray2594[7] * aFloatArray2594[13] - aFloatArray2594[1] * aFloatArray2594[4] * aFloatArray2594[15] + aFloatArray2594[1] * aFloatArray2594[7] * aFloatArray2594[12] + aFloatArray2594[3] * aFloatArray2594[4] * aFloatArray2594[13] - (aFloatArray2594[3] * aFloatArray2594[5] * aFloatArray2594[12])) * f);
		float f_46_ = ((-aFloatArray2594[0] * aFloatArray2594[5] * aFloatArray2594[11] + aFloatArray2594[0] * aFloatArray2594[7] * aFloatArray2594[9] + aFloatArray2594[1] * aFloatArray2594[4] * aFloatArray2594[11] - aFloatArray2594[1] * aFloatArray2594[7] * aFloatArray2594[8] - aFloatArray2594[3] * aFloatArray2594[4] * aFloatArray2594[9] + aFloatArray2594[3] * aFloatArray2594[5] * aFloatArray2594[8]) * f);
		float f_47_ = (-aFloatArray2594[4] * aFloatArray2594[9] * aFloatArray2594[14] + aFloatArray2594[4] * aFloatArray2594[10] * aFloatArray2594[13] + aFloatArray2594[5] * aFloatArray2594[8] * aFloatArray2594[14] - aFloatArray2594[5] * aFloatArray2594[10] * aFloatArray2594[12] - aFloatArray2594[6] * aFloatArray2594[8] * aFloatArray2594[13] + (aFloatArray2594[6] * aFloatArray2594[9] * aFloatArray2594[12])) * f;
		float f_48_ = (aFloatArray2594[0] * aFloatArray2594[9] * aFloatArray2594[14] - aFloatArray2594[0] * aFloatArray2594[10] * aFloatArray2594[13] - aFloatArray2594[1] * aFloatArray2594[8] * aFloatArray2594[14] + aFloatArray2594[1] * aFloatArray2594[10] * aFloatArray2594[12] + aFloatArray2594[2] * aFloatArray2594[8] * aFloatArray2594[13] - (aFloatArray2594[2] * aFloatArray2594[9] * aFloatArray2594[12])) * f;
		float f_49_ = ((-aFloatArray2594[0] * aFloatArray2594[5] * aFloatArray2594[14] + aFloatArray2594[0] * aFloatArray2594[6] * aFloatArray2594[13] + aFloatArray2594[1] * aFloatArray2594[4] * aFloatArray2594[14] - aFloatArray2594[1] * aFloatArray2594[6] * aFloatArray2594[12] - aFloatArray2594[2] * aFloatArray2594[4] * aFloatArray2594[13] + (aFloatArray2594[2] * aFloatArray2594[5] * aFloatArray2594[12])) * f);
		float f_50_ = ((aFloatArray2594[0] * aFloatArray2594[5] * aFloatArray2594[10] - aFloatArray2594[0] * aFloatArray2594[6] * aFloatArray2594[9] - aFloatArray2594[1] * aFloatArray2594[4] * aFloatArray2594[10] + aFloatArray2594[1] * aFloatArray2594[6] * aFloatArray2594[8] + aFloatArray2594[2] * aFloatArray2594[4] * aFloatArray2594[9] - aFloatArray2594[2] * aFloatArray2594[5] * aFloatArray2594[8]) * f);
		aFloatArray2594[0] = f_35_;
		aFloatArray2594[1] = f_36_;
		aFloatArray2594[2] = f_37_;
		aFloatArray2594[3] = f_38_;
		aFloatArray2594[4] = f_39_;
		aFloatArray2594[5] = f_40_;
		aFloatArray2594[6] = f_41_;
		aFloatArray2594[7] = f_42_;
		aFloatArray2594[8] = f_43_;
		aFloatArray2594[9] = f_44_;
		aFloatArray2594[10] = f_45_;
		aFloatArray2594[11] = f_46_;
		aFloatArray2594[12] = f_47_;
		aFloatArray2594[13] = f_48_;
		aFloatArray2594[14] = f_49_;
		aFloatArray2594[15] = f_50_;
	}

	public void method2147(float f, float f_51_, float f_52_, float f_53_) {
		aFloatArray2594[0] = f;
		aFloatArray2594[1] = 0.0F;
		aFloatArray2594[2] = 0.0F;
		aFloatArray2594[3] = 0.0F;
		aFloatArray2594[4] = 0.0F;
		aFloatArray2594[5] = f_51_;
		aFloatArray2594[6] = 0.0F;
		aFloatArray2594[7] = 0.0F;
		aFloatArray2594[8] = 0.0F;
		aFloatArray2594[9] = 0.0F;
		aFloatArray2594[10] = f_52_;
		aFloatArray2594[11] = 0.0F;
		aFloatArray2594[12] = 0.0F;
		aFloatArray2594[13] = 0.0F;
		aFloatArray2594[14] = 0.0F;
		aFloatArray2594[15] = f_53_;
	}

	public boolean method2148() {
		return (aFloatArray2594[0] == 1.0F && aFloatArray2594[1] == 0.0F && aFloatArray2594[2] == 0.0F && aFloatArray2594[3] == 0.0F && aFloatArray2594[4] == 0.0F && aFloatArray2594[5] == 1.0F && aFloatArray2594[6] == 0.0F && aFloatArray2594[7] == 0.0F && aFloatArray2594[8] == 0.0F && aFloatArray2594[9] == 0.0F && aFloatArray2594[10] == 1.0F && aFloatArray2594[11] == 0.0F && aFloatArray2594[12] == 0.0F && aFloatArray2594[13] == 0.0F && aFloatArray2594[14] == 0.0F && aFloatArray2594[15] == 1.0F);
	}

	public void method2149(float f, float f_54_, float f_55_, float[] fs) {
		fs[0] = (aFloatArray2594[0] * f + aFloatArray2594[4] * f_54_ + aFloatArray2594[8] * f_55_ + aFloatArray2594[12]);
		fs[1] = (aFloatArray2594[1] * f + aFloatArray2594[5] * f_54_ + aFloatArray2594[9] * f_55_ + aFloatArray2594[13]);
		fs[2] = (aFloatArray2594[2] * f + aFloatArray2594[6] * f_54_ + aFloatArray2594[10] * f_55_ + aFloatArray2594[14]);
		if (fs.length > 3)
			fs[3] = (aFloatArray2594[3] * f + aFloatArray2594[7] * f_54_ + aFloatArray2594[11] * f_55_ + aFloatArray2594[15]);
	}

	public Matrix4f() {
		aFloatArray2594 = new float[16];
		method2172();
	}

	public float[] method2150(float[] fs) {
		fs[0] = aFloatArray2594[0];
		fs[1] = aFloatArray2594[4];
		fs[2] = aFloatArray2594[8];
		fs[3] = aFloatArray2594[12];
		fs[4] = aFloatArray2594[1];
		fs[5] = aFloatArray2594[5];
		fs[6] = aFloatArray2594[9];
		fs[7] = aFloatArray2594[13];
		return fs;
	}

	public void method2151(float f, float f_56_, float f_57_, float f_58_, float f_59_, float f_60_) {
		aFloatArray2594[0] = 2.0F / (f_56_ - f);
		aFloatArray2594[1] = 0.0F;
		aFloatArray2594[2] = 0.0F;
		aFloatArray2594[3] = 0.0F;
		aFloatArray2594[4] = 0.0F;
		aFloatArray2594[5] = 2.0F / (f_58_ - f_57_);
		aFloatArray2594[6] = 0.0F;
		aFloatArray2594[7] = 0.0F;
		aFloatArray2594[8] = 0.0F;
		aFloatArray2594[9] = 0.0F;
		aFloatArray2594[10] = 2.0F / (f_60_ - f_59_);
		aFloatArray2594[11] = 0.0F;
		aFloatArray2594[12] = -(f_56_ + f) / (f_56_ - f);
		aFloatArray2594[13] = -(f_58_ + f_57_) / (f_58_ - f_57_);
		aFloatArray2594[14] = -(f_60_ + f_59_) / (f_60_ - f_59_);
		aFloatArray2594[15] = 1.0F;
	}

	public void method2152(float f, float f_61_, float f_62_, float f_63_, float f_64_, float f_65_, float f_66_, float f_67_) {
		aFloatArray2594[0] = f_62_ * 2.0F / f_66_;
		aFloatArray2594[1] = 0.0F;
		aFloatArray2594[2] = 0.0F;
		aFloatArray2594[3] = 0.0F;
		aFloatArray2594[4] = 0.0F;
		aFloatArray2594[5] = f_63_ * 2.0F / f_67_;
		aFloatArray2594[6] = 0.0F;
		aFloatArray2594[7] = 0.0F;
		aFloatArray2594[8] = 2.0F * f / f_66_ - 1.0F;
		aFloatArray2594[9] = 2.0F * f_61_ / f_67_ - 1.0F;
		aFloatArray2594[10] = (f_65_ + f_64_) / (f_65_ - f_64_);
		aFloatArray2594[11] = 1.0F;
		aFloatArray2594[12] = 0.0F;
		aFloatArray2594[13] = 0.0F;
		aFloatArray2594[14] = 2.0F * f_65_ * f_64_ / (f_64_ - f_65_);
		aFloatArray2594[15] = 0.0F;
	}

	public void method2153(float f, float f_68_, float f_69_, float f_70_, float f_71_, float f_72_, float f_73_, float f_74_, float f_75_) {
		method2151(-(f * f_75_) / f_69_, f_75_ * (f_73_ - f) / f_69_, -(f_68_ * f_75_) / f_70_, f_75_ * (f_74_ - f_68_) / f_70_, f_71_, f_72_);
	}

	public float method2154() {
		return (-(aFloatArray2594[15] + aFloatArray2594[14]) / (aFloatArray2594[11] + aFloatArray2594[10]));
	}

	public float method2155() {
		return ((aFloatArray2594[14] - aFloatArray2594[15]) / (aFloatArray2594[11] - aFloatArray2594[10]));
	}

	public float[] method2156(float[] fs) {
		float f = aFloatArray2594[3] + aFloatArray2594[0];
		float f_76_ = aFloatArray2594[7] + aFloatArray2594[4];
		float f_77_ = aFloatArray2594[11] + aFloatArray2594[8];
		double d = Math.sqrt((double) (f * f + f_76_ * f_76_ + f_77_ * f_77_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_76_ / d);
		fs[2] = (float) ((double) f_77_ / d);
		fs[3] = (float) ((double) (aFloatArray2594[15] + aFloatArray2594[12]) / d);
		return fs;
	}

	public float[] method2157(float[] fs) {
		float f = aFloatArray2594[3] + aFloatArray2594[2];
		float f_78_ = aFloatArray2594[7] + aFloatArray2594[6];
		float f_79_ = aFloatArray2594[11] + aFloatArray2594[10];
		double d = Math.sqrt((double) (f * f + f_78_ * f_78_ + f_79_ * f_79_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_78_ / d);
		fs[2] = (float) ((double) f_79_ / d);
		fs[3] = (float) ((double) (aFloatArray2594[15] + aFloatArray2594[14]) / d);
		return fs;
	}

	public float[] method2158(float[] fs) {
		float f = aFloatArray2594[3] - aFloatArray2594[2];
		float f_80_ = aFloatArray2594[7] - aFloatArray2594[6];
		float f_81_ = aFloatArray2594[11] - aFloatArray2594[10];
		double d = Math.sqrt((double) (f * f + f_80_ * f_80_ + f_81_ * f_81_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_80_ / d);
		fs[2] = (float) ((double) f_81_ / d);
		fs[3] = (float) ((double) (aFloatArray2594[15] - aFloatArray2594[14]) / d);
		return fs;
	}

	public void method2159() {
		float f = aFloatArray2594[0];
		float f_82_ = aFloatArray2594[4];
		float f_83_ = aFloatArray2594[8];
		float f_84_ = aFloatArray2594[12];
		float f_85_ = aFloatArray2594[1];
		float f_86_ = aFloatArray2594[5];
		float f_87_ = aFloatArray2594[9];
		float f_88_ = aFloatArray2594[13];
		float f_89_ = aFloatArray2594[2];
		float f_90_ = aFloatArray2594[6];
		float f_91_ = aFloatArray2594[10];
		float f_92_ = aFloatArray2594[14];
		float f_93_ = aFloatArray2594[3];
		float f_94_ = aFloatArray2594[7];
		float f_95_ = aFloatArray2594[11];
		float f_96_ = aFloatArray2594[15];
		aFloatArray2594[0] = f;
		aFloatArray2594[1] = f_82_;
		aFloatArray2594[2] = f_83_;
		aFloatArray2594[3] = f_84_;
		aFloatArray2594[4] = f_85_;
		aFloatArray2594[5] = f_86_;
		aFloatArray2594[6] = f_87_;
		aFloatArray2594[7] = f_88_;
		aFloatArray2594[8] = f_89_;
		aFloatArray2594[9] = f_90_;
		aFloatArray2594[10] = f_91_;
		aFloatArray2594[11] = f_92_;
		aFloatArray2594[12] = f_93_;
		aFloatArray2594[13] = f_94_;
		aFloatArray2594[14] = f_95_;
		aFloatArray2594[15] = f_96_;
	}

	public float[] method2160(float[] fs) {
		System.arraycopy(aFloatArray2594, 0, fs, 0, 16);
		fs[3] = 0.0F;
		fs[7] = 0.0F;
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public float[] method2161(float[] fs) {
		fs[0] = aFloatArray2594[0];
		fs[1] = aFloatArray2594[4];
		fs[2] = aFloatArray2594[8];
		fs[3] = aFloatArray2594[12];
		fs[4] = aFloatArray2594[1];
		fs[5] = aFloatArray2594[5];
		fs[6] = aFloatArray2594[9];
		fs[7] = aFloatArray2594[13];
		fs[8] = aFloatArray2594[2];
		fs[9] = aFloatArray2594[6];
		fs[10] = aFloatArray2594[10];
		fs[11] = aFloatArray2594[14];
		fs[12] = aFloatArray2594[3];
		fs[13] = aFloatArray2594[7];
		fs[14] = aFloatArray2594[11];
		fs[15] = aFloatArray2594[15];
		return fs;
	}

	public float[] method2162(float[] fs) {
		fs[0] = aFloatArray2594[0];
		fs[1] = aFloatArray2594[1];
		fs[2] = aFloatArray2594[4];
		fs[3] = aFloatArray2594[5];
		fs[4] = aFloatArray2594[8];
		fs[5] = aFloatArray2594[9];
		fs[6] = aFloatArray2594[12];
		fs[7] = aFloatArray2594[13];
		return fs;
	}

	public float[] method2163(float[] fs) {
		float f = aFloatArray2594[3] - aFloatArray2594[1];
		float f_97_ = aFloatArray2594[7] - aFloatArray2594[5];
		float f_98_ = aFloatArray2594[11] - aFloatArray2594[9];
		double d = Math.sqrt((double) (f * f + f_97_ * f_97_ + f_98_ * f_98_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_97_ / d);
		fs[2] = (float) ((double) f_98_ / d);
		fs[3] = (float) ((double) (aFloatArray2594[15] - aFloatArray2594[13]) / d);
		return fs;
	}

	public void method2164(int i, int i_99_, int i_100_, float f, float f_101_, float f_102_) {
		if (i != 0) {
			float f_103_ = Class215.aFloatArray2450[i & 0x3fff];
			float f_104_ = Class215.aFloatArray2449[i & 0x3fff];
			aFloatArray2594[0] = f_103_ * (float) i_99_;
			aFloatArray2594[5] = f_103_ * (float) i_100_;
			aFloatArray2594[1] = f_104_ * (float) i_99_;
			aFloatArray2594[4] = -f_104_ * (float) i_100_;
			aFloatArray2594[10] = 1.0F;
			float[] fs = aFloatArray2594;
			float[] fs_105_ = aFloatArray2594;
			float[] fs_106_ = aFloatArray2594;
			aFloatArray2594[9] = 0.0F;
			fs_106_[8] = 0.0F;
			fs_105_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray2594[0] = (float) i_99_;
			aFloatArray2594[5] = (float) i_100_;
			aFloatArray2594[10] = 1.0F;
			float[] fs = aFloatArray2594;
			float[] fs_107_ = aFloatArray2594;
			float[] fs_108_ = aFloatArray2594;
			float[] fs_109_ = aFloatArray2594;
			float[] fs_110_ = aFloatArray2594;
			aFloatArray2594[9] = 0.0F;
			fs_110_[8] = 0.0F;
			fs_109_[6] = 0.0F;
			fs_108_[4] = 0.0F;
			fs_107_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray2594;
		float[] fs_111_ = aFloatArray2594;
		aFloatArray2594[11] = 0.0F;
		fs_111_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray2594[15] = 1.0F;
		aFloatArray2594[12] = f;
		aFloatArray2594[13] = f_101_;
		aFloatArray2594[14] = f_102_;
	}

	public float[] method2165(float[] fs) {
		fs[0] = aFloatArray2594[0];
		fs[1] = aFloatArray2594[1];
		fs[2] = aFloatArray2594[2];
		fs[3] = aFloatArray2594[4];
		fs[4] = aFloatArray2594[5];
		fs[5] = aFloatArray2594[6];
		fs[6] = aFloatArray2594[8];
		fs[7] = aFloatArray2594[9];
		fs[8] = aFloatArray2594[10];
		return fs;
	}

	public float[] method2166(float[] fs) {
		fs[0] = aFloatArray2594[0];
		fs[1] = aFloatArray2594[1];
		fs[2] = 0.0F;
		fs[3] = 0.0F;
		fs[4] = aFloatArray2594[4];
		fs[5] = aFloatArray2594[5];
		fs[6] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = aFloatArray2594[12];
		fs[9] = aFloatArray2594[13];
		fs[10] = aFloatArray2594[14];
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public void method2167(float f, float f_112_, float f_113_, float[] fs) {
		fs[0] = (aFloatArray2594[0] * f + aFloatArray2594[4] * f_112_ + aFloatArray2594[8] * f_113_);
		fs[1] = (aFloatArray2594[1] * f + aFloatArray2594[5] * f_112_ + aFloatArray2594[9] * f_113_);
		fs[2] = (aFloatArray2594[2] * f + aFloatArray2594[6] * f_112_ + aFloatArray2594[10] * f_113_);
		if (fs.length > 3)
			fs[3] = (aFloatArray2594[3] * f + aFloatArray2594[7] * f_112_ + aFloatArray2594[11] * f_113_);
	}

	public void method2168(float[] fs) {
		float f = fs[0];
		float f_114_ = fs[1];
		float f_115_ = fs[2];
		fs[0] = (aFloatArray2594[0] * f + aFloatArray2594[4] * f_114_ + aFloatArray2594[8] * f_115_ + aFloatArray2594[12]);
		fs[1] = (aFloatArray2594[1] * f + aFloatArray2594[5] * f_114_ + aFloatArray2594[9] * f_115_ + aFloatArray2594[13]);
		fs[2] = (aFloatArray2594[2] * f + aFloatArray2594[6] * f_114_ + aFloatArray2594[10] * f_115_ + aFloatArray2594[14]);
	}

	float method2169() {
		return ((aFloatArray2594[0] * aFloatArray2594[5] * aFloatArray2594[10] * aFloatArray2594[15]) - (aFloatArray2594[0] * aFloatArray2594[5] * aFloatArray2594[11] * aFloatArray2594[14]) - (aFloatArray2594[0] * aFloatArray2594[6] * aFloatArray2594[9] * aFloatArray2594[15]) + (aFloatArray2594[0] * aFloatArray2594[6] * aFloatArray2594[11] * aFloatArray2594[13]) + (aFloatArray2594[0] * aFloatArray2594[7] * aFloatArray2594[9] * aFloatArray2594[14])
				- (aFloatArray2594[0] * aFloatArray2594[7] * aFloatArray2594[10] * aFloatArray2594[13]) - (aFloatArray2594[1] * aFloatArray2594[4] * aFloatArray2594[10] * aFloatArray2594[15]) + (aFloatArray2594[1] * aFloatArray2594[4] * aFloatArray2594[11] * aFloatArray2594[14]) + (aFloatArray2594[1] * aFloatArray2594[6] * aFloatArray2594[8] * aFloatArray2594[15]) - (aFloatArray2594[1] * aFloatArray2594[6] * aFloatArray2594[11] * aFloatArray2594[12])
				- (aFloatArray2594[1] * aFloatArray2594[7] * aFloatArray2594[8] * aFloatArray2594[14]) + (aFloatArray2594[1] * aFloatArray2594[7] * aFloatArray2594[10] * aFloatArray2594[12]) + (aFloatArray2594[2] * aFloatArray2594[4] * aFloatArray2594[9] * aFloatArray2594[15]) - (aFloatArray2594[2] * aFloatArray2594[4] * aFloatArray2594[11] * aFloatArray2594[13]) - (aFloatArray2594[2] * aFloatArray2594[5] * aFloatArray2594[8] * aFloatArray2594[15])
				+ (aFloatArray2594[2] * aFloatArray2594[5] * aFloatArray2594[11] * aFloatArray2594[12]) + (aFloatArray2594[2] * aFloatArray2594[7] * aFloatArray2594[8] * aFloatArray2594[13]) - (aFloatArray2594[2] * aFloatArray2594[7] * aFloatArray2594[9] * aFloatArray2594[12]) - (aFloatArray2594[3] * aFloatArray2594[4] * aFloatArray2594[9] * aFloatArray2594[14]) + (aFloatArray2594[3] * aFloatArray2594[4] * aFloatArray2594[10] * aFloatArray2594[13])
				+ (aFloatArray2594[3] * aFloatArray2594[5] * aFloatArray2594[8] * aFloatArray2594[14]) - (aFloatArray2594[3] * aFloatArray2594[5] * aFloatArray2594[10] * aFloatArray2594[12]) - (aFloatArray2594[3] * aFloatArray2594[6] * aFloatArray2594[8] * aFloatArray2594[13]) + (aFloatArray2594[3] * aFloatArray2594[6] * aFloatArray2594[9] * aFloatArray2594[12]));
	}

	public float[] method2170(float[] fs) {
		float f = aFloatArray2594[3] - aFloatArray2594[0];
		float f_116_ = aFloatArray2594[7] - aFloatArray2594[4];
		float f_117_ = aFloatArray2594[11] - aFloatArray2594[8];
		double d = Math.sqrt((double) (f * f + f_116_ * f_116_ + f_117_ * f_117_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_116_ / d);
		fs[2] = (float) ((double) f_117_ / d);
		fs[3] = (float) ((double) (aFloatArray2594[15] - aFloatArray2594[12]) / d);
		return fs;
	}

	public float[] method2171(float[] fs) {
		float f = aFloatArray2594[3] + aFloatArray2594[1];
		float f_118_ = aFloatArray2594[7] + aFloatArray2594[5];
		float f_119_ = aFloatArray2594[11] + aFloatArray2594[9];
		double d = Math.sqrt((double) (f * f + f_118_ * f_118_ + f_119_ * f_119_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_118_ / d);
		fs[2] = (float) ((double) f_119_ / d);
		fs[3] = (float) ((double) (aFloatArray2594[15] + aFloatArray2594[13]) / d);
		return fs;
	}

	public void method2172() {
		aFloatArray2594[0] = 1.0F;
		aFloatArray2594[1] = 0.0F;
		aFloatArray2594[2] = 0.0F;
		aFloatArray2594[3] = 0.0F;
		aFloatArray2594[4] = 0.0F;
		aFloatArray2594[5] = 1.0F;
		aFloatArray2594[6] = 0.0F;
		aFloatArray2594[7] = 0.0F;
		aFloatArray2594[8] = 0.0F;
		aFloatArray2594[9] = 0.0F;
		aFloatArray2594[10] = 1.0F;
		aFloatArray2594[11] = 0.0F;
		aFloatArray2594[12] = 0.0F;
		aFloatArray2594[13] = 0.0F;
		aFloatArray2594[14] = 0.0F;
		aFloatArray2594[15] = 1.0F;
	}

	public float[] method2173(float[] fs) {
		System.arraycopy(aFloatArray2594, 0, fs, 0, 16);
		return fs;
	}
}
