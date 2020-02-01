package com.jagex;
import java.util.Arrays;

public final class Matrix44Arr {

	public static Matrix44Arr aClass384_4666 = new Matrix44Arr();
	public float[] buf = new float[16];

	public float[] method6517(float[] floats_1) {
		System.arraycopy(this.buf, 0, floats_1, 0, 16);
		return floats_1;
	}

	public void identity() {
		this.buf[0] = 1.0F;
		this.buf[1] = 0.0F;
		this.buf[2] = 0.0F;
		this.buf[3] = 0.0F;
		this.buf[4] = 0.0F;
		this.buf[5] = 1.0F;
		this.buf[6] = 0.0F;
		this.buf[7] = 0.0F;
		this.buf[8] = 0.0F;
		this.buf[9] = 0.0F;
		this.buf[10] = 1.0F;
		this.buf[11] = 0.0F;
		this.buf[12] = 0.0F;
		this.buf[13] = 0.0F;
		this.buf[14] = 0.0F;
		this.buf[15] = 1.0F;
	}

	public void method6520() {
		float f_1 = this.buf[0];
		float f_2 = this.buf[4];
		float f_3 = this.buf[8];
		float f_4 = this.buf[12];
		float f_5 = this.buf[1];
		float f_6 = this.buf[5];
		float f_7 = this.buf[9];
		float f_8 = this.buf[13];
		float f_9 = this.buf[2];
		float f_10 = this.buf[6];
		float f_11 = this.buf[10];
		float f_12 = this.buf[14];
		float f_13 = this.buf[3];
		float f_14 = this.buf[7];
		float f_15 = this.buf[11];
		float f_16 = this.buf[15];
		this.buf[0] = f_1;
		this.buf[1] = f_2;
		this.buf[2] = f_3;
		this.buf[3] = f_4;
		this.buf[4] = f_5;
		this.buf[5] = f_6;
		this.buf[6] = f_7;
		this.buf[7] = f_8;
		this.buf[8] = f_9;
		this.buf[9] = f_10;
		this.buf[10] = f_11;
		this.buf[11] = f_12;
		this.buf[12] = f_13;
		this.buf[13] = f_14;
		this.buf[14] = f_15;
		this.buf[15] = f_16;
	}

	public void fromVarMatrix44(Matrix44Var matrix4Var) {
		this.buf[0] = matrix4Var.aFloat3519;
		this.buf[1] = matrix4Var.aFloat3514;
		this.buf[2] = matrix4Var.aFloat3516;
		this.buf[3] = 0.0F;
		this.buf[4] = matrix4Var.aFloat3517;
		this.buf[5] = matrix4Var.aFloat3523;
		this.buf[6] = matrix4Var.aFloat3522;
		this.buf[7] = 0.0F;
		this.buf[8] = matrix4Var.aFloat3520;
		this.buf[9] = matrix4Var.aFloat3513;
		this.buf[10] = matrix4Var.aFloat3521;
		this.buf[11] = 0.0F;
		this.buf[12] = matrix4Var.aFloat3515;
		this.buf[13] = matrix4Var.aFloat3524;
		this.buf[14] = matrix4Var.aFloat3525;
		this.buf[15] = 1.0F;
	}

	public void method6523(Matrix44Arr matrix44arr_1) {
		float f_2 = this.buf[0] * matrix44arr_1.buf[0] + this.buf[1] * matrix44arr_1.buf[4] + this.buf[2] * matrix44arr_1.buf[8] + this.buf[3] * matrix44arr_1.buf[12];
		float f_3 = this.buf[0] * matrix44arr_1.buf[1] + this.buf[1] * matrix44arr_1.buf[5] + this.buf[2] * matrix44arr_1.buf[9] + this.buf[3] * matrix44arr_1.buf[13];
		float f_4 = this.buf[0] * matrix44arr_1.buf[2] + this.buf[1] * matrix44arr_1.buf[6] + this.buf[2] * matrix44arr_1.buf[10] + this.buf[3] * matrix44arr_1.buf[14];
		float f_5 = this.buf[0] * matrix44arr_1.buf[3] + this.buf[1] * matrix44arr_1.buf[7] + this.buf[2] * matrix44arr_1.buf[11] + this.buf[3] * matrix44arr_1.buf[15];
		float f_6 = this.buf[4] * matrix44arr_1.buf[0] + this.buf[5] * matrix44arr_1.buf[4] + this.buf[6] * matrix44arr_1.buf[8] + this.buf[7] * matrix44arr_1.buf[12];
		float f_7 = this.buf[4] * matrix44arr_1.buf[1] + this.buf[5] * matrix44arr_1.buf[5] + this.buf[6] * matrix44arr_1.buf[9] + this.buf[7] * matrix44arr_1.buf[13];
		float f_8 = this.buf[4] * matrix44arr_1.buf[2] + this.buf[5] * matrix44arr_1.buf[6] + this.buf[6] * matrix44arr_1.buf[10] + this.buf[7] * matrix44arr_1.buf[14];
		float f_9 = this.buf[4] * matrix44arr_1.buf[3] + this.buf[5] * matrix44arr_1.buf[7] + this.buf[6] * matrix44arr_1.buf[11] + this.buf[7] * matrix44arr_1.buf[15];
		float f_10 = this.buf[8] * matrix44arr_1.buf[0] + this.buf[9] * matrix44arr_1.buf[4] + this.buf[10] * matrix44arr_1.buf[8] + this.buf[11] * matrix44arr_1.buf[12];
		float f_11 = this.buf[8] * matrix44arr_1.buf[1] + this.buf[9] * matrix44arr_1.buf[5] + this.buf[10] * matrix44arr_1.buf[9] + this.buf[11] * matrix44arr_1.buf[13];
		float f_12 = this.buf[8] * matrix44arr_1.buf[2] + this.buf[9] * matrix44arr_1.buf[6] + this.buf[10] * matrix44arr_1.buf[10] + this.buf[11] * matrix44arr_1.buf[14];
		float f_13 = this.buf[8] * matrix44arr_1.buf[3] + this.buf[9] * matrix44arr_1.buf[7] + this.buf[10] * matrix44arr_1.buf[11] + this.buf[11] * matrix44arr_1.buf[15];
		float f_14 = this.buf[12] * matrix44arr_1.buf[0] + this.buf[13] * matrix44arr_1.buf[4] + this.buf[14] * matrix44arr_1.buf[8] + this.buf[15] * matrix44arr_1.buf[12];
		float f_15 = this.buf[12] * matrix44arr_1.buf[1] + this.buf[13] * matrix44arr_1.buf[5] + this.buf[14] * matrix44arr_1.buf[9] + this.buf[15] * matrix44arr_1.buf[13];
		float f_16 = this.buf[12] * matrix44arr_1.buf[2] + this.buf[13] * matrix44arr_1.buf[6] + this.buf[14] * matrix44arr_1.buf[10] + this.buf[15] * matrix44arr_1.buf[14];
		float f_17 = this.buf[12] * matrix44arr_1.buf[3] + this.buf[13] * matrix44arr_1.buf[7] + this.buf[14] * matrix44arr_1.buf[11] + this.buf[15] * matrix44arr_1.buf[15];
		this.buf[0] = f_2;
		this.buf[1] = f_3;
		this.buf[2] = f_4;
		this.buf[3] = f_5;
		this.buf[4] = f_6;
		this.buf[5] = f_7;
		this.buf[6] = f_8;
		this.buf[7] = f_9;
		this.buf[8] = f_10;
		this.buf[9] = f_11;
		this.buf[10] = f_12;
		this.buf[11] = f_13;
		this.buf[12] = f_14;
		this.buf[13] = f_15;
		this.buf[14] = f_16;
		this.buf[15] = f_17;
	}

	public void method6524() {
		float f_1 = 1.0F / this.method6612();
		float f_2 = (this.buf[5] * this.buf[10] * this.buf[15] - this.buf[5] * this.buf[11] * this.buf[14] - this.buf[6] * this.buf[9] * this.buf[15] + this.buf[6] * this.buf[11] * this.buf[13] + this.buf[7] * this.buf[9] * this.buf[14] - this.buf[7] * this.buf[10] * this.buf[13]) * f_1;
		float f_3 = (-this.buf[1] * this.buf[10] * this.buf[15] + this.buf[1] * this.buf[11] * this.buf[14] + this.buf[2] * this.buf[9] * this.buf[15] - this.buf[2] * this.buf[11] * this.buf[13] - this.buf[3] * this.buf[9] * this.buf[14] + this.buf[3] * this.buf[10] * this.buf[13]) * f_1;
		float f_4 = (this.buf[1] * this.buf[6] * this.buf[15] - this.buf[1] * this.buf[7] * this.buf[14] - this.buf[2] * this.buf[5] * this.buf[15] + this.buf[2] * this.buf[7] * this.buf[13] + this.buf[3] * this.buf[5] * this.buf[14] - this.buf[3] * this.buf[6] * this.buf[13]) * f_1;
		float f_5 = (-this.buf[1] * this.buf[6] * this.buf[11] + this.buf[1] * this.buf[7] * this.buf[10] + this.buf[2] * this.buf[5] * this.buf[11] - this.buf[2] * this.buf[7] * this.buf[9] - this.buf[3] * this.buf[5] * this.buf[10] + this.buf[3] * this.buf[6] * this.buf[9]) * f_1;
		float f_6 = (-this.buf[4] * this.buf[10] * this.buf[15] + this.buf[4] * this.buf[11] * this.buf[14] + this.buf[6] * this.buf[8] * this.buf[15] - this.buf[6] * this.buf[11] * this.buf[12] - this.buf[7] * this.buf[8] * this.buf[14] + this.buf[7] * this.buf[10] * this.buf[12]) * f_1;
		float f_7 = (this.buf[0] * this.buf[10] * this.buf[15] - this.buf[0] * this.buf[11] * this.buf[14] - this.buf[2] * this.buf[8] * this.buf[15] + this.buf[2] * this.buf[11] * this.buf[12] + this.buf[3] * this.buf[8] * this.buf[14] - this.buf[3] * this.buf[10] * this.buf[12]) * f_1;
		float f_8 = (-this.buf[0] * this.buf[6] * this.buf[15] + this.buf[0] * this.buf[7] * this.buf[14] + this.buf[2] * this.buf[4] * this.buf[15] - this.buf[2] * this.buf[7] * this.buf[12] - this.buf[3] * this.buf[4] * this.buf[14] + this.buf[3] * this.buf[6] * this.buf[12]) * f_1;
		float f_9 = (this.buf[0] * this.buf[6] * this.buf[11] - this.buf[0] * this.buf[7] * this.buf[10] - this.buf[2] * this.buf[4] * this.buf[11] + this.buf[2] * this.buf[7] * this.buf[8] + this.buf[3] * this.buf[4] * this.buf[10] - this.buf[3] * this.buf[6] * this.buf[8]) * f_1;
		float f_10 = (this.buf[4] * this.buf[9] * this.buf[15] - this.buf[4] * this.buf[11] * this.buf[13] - this.buf[5] * this.buf[8] * this.buf[15] + this.buf[5] * this.buf[11] * this.buf[12] + this.buf[7] * this.buf[8] * this.buf[13] - this.buf[7] * this.buf[9] * this.buf[12]) * f_1;
		float f_11 = (-this.buf[0] * this.buf[9] * this.buf[15] + this.buf[0] * this.buf[11] * this.buf[13] + this.buf[1] * this.buf[8] * this.buf[15] - this.buf[1] * this.buf[11] * this.buf[12] - this.buf[3] * this.buf[8] * this.buf[13] + this.buf[3] * this.buf[9] * this.buf[12]) * f_1;
		float f_12 = (this.buf[0] * this.buf[5] * this.buf[15] - this.buf[0] * this.buf[7] * this.buf[13] - this.buf[1] * this.buf[4] * this.buf[15] + this.buf[1] * this.buf[7] * this.buf[12] + this.buf[3] * this.buf[4] * this.buf[13] - this.buf[3] * this.buf[5] * this.buf[12]) * f_1;
		float f_13 = (-this.buf[0] * this.buf[5] * this.buf[11] + this.buf[0] * this.buf[7] * this.buf[9] + this.buf[1] * this.buf[4] * this.buf[11] - this.buf[1] * this.buf[7] * this.buf[8] - this.buf[3] * this.buf[4] * this.buf[9] + this.buf[3] * this.buf[5] * this.buf[8]) * f_1;
		float f_14 = (-this.buf[4] * this.buf[9] * this.buf[14] + this.buf[4] * this.buf[10] * this.buf[13] + this.buf[5] * this.buf[8] * this.buf[14] - this.buf[5] * this.buf[10] * this.buf[12] - this.buf[6] * this.buf[8] * this.buf[13] + this.buf[6] * this.buf[9] * this.buf[12]) * f_1;
		float f_15 = (this.buf[0] * this.buf[9] * this.buf[14] - this.buf[0] * this.buf[10] * this.buf[13] - this.buf[1] * this.buf[8] * this.buf[14] + this.buf[1] * this.buf[10] * this.buf[12] + this.buf[2] * this.buf[8] * this.buf[13] - this.buf[2] * this.buf[9] * this.buf[12]) * f_1;
		float f_16 = (-this.buf[0] * this.buf[5] * this.buf[14] + this.buf[0] * this.buf[6] * this.buf[13] + this.buf[1] * this.buf[4] * this.buf[14] - this.buf[1] * this.buf[6] * this.buf[12] - this.buf[2] * this.buf[4] * this.buf[13] + this.buf[2] * this.buf[5] * this.buf[12]) * f_1;
		float f_17 = (this.buf[0] * this.buf[5] * this.buf[10] - this.buf[0] * this.buf[6] * this.buf[9] - this.buf[1] * this.buf[4] * this.buf[10] + this.buf[1] * this.buf[6] * this.buf[8] + this.buf[2] * this.buf[4] * this.buf[9] - this.buf[2] * this.buf[5] * this.buf[8]) * f_1;
		this.buf[0] = f_2;
		this.buf[1] = f_3;
		this.buf[2] = f_4;
		this.buf[3] = f_5;
		this.buf[4] = f_6;
		this.buf[5] = f_7;
		this.buf[6] = f_8;
		this.buf[7] = f_9;
		this.buf[8] = f_10;
		this.buf[9] = f_11;
		this.buf[10] = f_12;
		this.buf[11] = f_13;
		this.buf[12] = f_14;
		this.buf[13] = f_15;
		this.buf[14] = f_16;
		this.buf[15] = f_17;
	}

	public void method6525(float f_1, float f_2, float f_3, float f_4) {
		this.buf[0] = f_1;
		this.buf[1] = 0.0F;
		this.buf[2] = 0.0F;
		this.buf[3] = 0.0F;
		this.buf[4] = 0.0F;
		this.buf[5] = f_2;
		this.buf[6] = 0.0F;
		this.buf[7] = 0.0F;
		this.buf[8] = 0.0F;
		this.buf[9] = 0.0F;
		this.buf[10] = f_3;
		this.buf[11] = 0.0F;
		this.buf[12] = 0.0F;
		this.buf[13] = 0.0F;
		this.buf[14] = 0.0F;
		this.buf[15] = f_4;
	}

	public boolean method6526() {
		return this.buf[0] == 1.0F && this.buf[1] == 0.0F && this.buf[2] == 0.0F && this.buf[3] == 0.0F && this.buf[4] == 0.0F && this.buf[5] == 1.0F && this.buf[6] == 0.0F && this.buf[7] == 0.0F && this.buf[8] == 0.0F && this.buf[9] == 0.0F && this.buf[10] == 1.0F && this.buf[11] == 0.0F && this.buf[12] == 0.0F && this.buf[13] == 0.0F && this.buf[14] == 0.0F && this.buf[15] == 1.0F;
	}

	public void method6527(float f_1, float f_2, float f_3, float[] floats_4) {
		floats_4[0] = this.buf[0] * f_1 + this.buf[4] * f_2 + this.buf[8] * f_3 + this.buf[12];
		floats_4[1] = this.buf[1] * f_1 + this.buf[5] * f_2 + this.buf[9] * f_3 + this.buf[13];
		floats_4[2] = this.buf[2] * f_1 + this.buf[6] * f_2 + this.buf[10] * f_3 + this.buf[14];
		if (floats_4.length > 3) {
			floats_4[3] = this.buf[3] * f_1 + this.buf[7] * f_2 + this.buf[11] * f_3 + this.buf[15];
		}

	}

	public void method6528(float[] floats_1) {
		float f_2 = floats_1[0];
		float f_3 = floats_1[1];
		float f_4 = floats_1[2];
		floats_1[0] = this.buf[0] * f_2 + this.buf[4] * f_3 + this.buf[8] * f_4 + this.buf[12];
		floats_1[1] = this.buf[1] * f_2 + this.buf[5] * f_3 + this.buf[9] * f_4 + this.buf[13];
		floats_1[2] = this.buf[2] * f_2 + this.buf[6] * f_3 + this.buf[10] * f_4 + this.buf[14];
	}

	public void method6530(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		this.buf[0] = 2.0F / (f_2 - f_1);
		this.buf[1] = 0.0F;
		this.buf[2] = 0.0F;
		this.buf[3] = 0.0F;
		this.buf[4] = 0.0F;
		this.buf[5] = 2.0F / (f_4 - f_3);
		this.buf[6] = 0.0F;
		this.buf[7] = 0.0F;
		this.buf[8] = 0.0F;
		this.buf[9] = 0.0F;
		this.buf[10] = 2.0F / (f_6 - f_5);
		this.buf[11] = 0.0F;
		this.buf[12] = -(f_2 + f_1) / (f_2 - f_1);
		this.buf[13] = -(f_4 + f_3) / (f_4 - f_3);
		this.buf[14] = -(f_6 + f_5) / (f_6 - f_5);
		this.buf[15] = 1.0F;
	}

	public void method6531(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, float f_7, float f_8) {
		this.buf[0] = f_3 * 2.0F / f_7;
		this.buf[1] = 0.0F;
		this.buf[2] = 0.0F;
		this.buf[3] = 0.0F;
		this.buf[4] = 0.0F;
		this.buf[5] = f_4 * 2.0F / f_8;
		this.buf[6] = 0.0F;
		this.buf[7] = 0.0F;
		this.buf[8] = 2.0F * f_1 / f_7 - 1.0F;
		this.buf[9] = 2.0F * f_2 / f_8 - 1.0F;
		this.buf[10] = (f_6 + f_5) / (f_6 - f_5);
		this.buf[11] = 1.0F;
		this.buf[12] = 0.0F;
		this.buf[13] = 0.0F;
		this.buf[14] = 2.0F * f_6 * f_5 / (f_5 - f_6);
		this.buf[15] = 0.0F;
	}

	public void method6532(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, float f_7, float f_8, float f_9) {
		this.method6530(-(f_1 * f_9) / f_3, f_9 * (f_7 - f_1) / f_3, -(f_2 * f_9) / f_4, f_9 * (f_8 - f_2) / f_4, f_5, f_6);
	}

	public float method6533() {
		return -(this.buf[15] + this.buf[14]) / (this.buf[11] + this.buf[10]);
	}

	public float[] method6534(float[] floats_1) {
		System.arraycopy(this.buf, 0, floats_1, 0, 16);
		floats_1[3] = 0.0F;
		floats_1[7] = 0.0F;
		floats_1[11] = 0.0F;
		floats_1[12] = 0.0F;
		floats_1[13] = 0.0F;
		floats_1[14] = 0.0F;
		floats_1[15] = 1.0F;
		return floats_1;
	}

	public float[] method6535(float[] floats_1) {
		float f_2 = this.buf[3] + this.buf[0];
		float f_3 = this.buf[7] + this.buf[4];
		float f_4 = this.buf[11] + this.buf[8];
		double d_5 = Math.sqrt((double) (f_2 * f_2 + f_3 * f_3 + f_4 * f_4));
		floats_1[0] = (float) ((double) f_2 / d_5);
		floats_1[1] = (float) ((double) f_3 / d_5);
		floats_1[2] = (float) ((double) f_4 / d_5);
		floats_1[3] = (float) ((double) (this.buf[15] + this.buf[12]) / d_5);
		return floats_1;
	}

	public float[] method6536(float[] floats_1) {
		float f_2 = this.buf[3] - this.buf[0];
		float f_3 = this.buf[7] - this.buf[4];
		float f_4 = this.buf[11] - this.buf[8];
		double d_5 = Math.sqrt((double) (f_2 * f_2 + f_3 * f_3 + f_4 * f_4));
		floats_1[0] = (float) ((double) f_2 / d_5);
		floats_1[1] = (float) ((double) f_3 / d_5);
		floats_1[2] = (float) ((double) f_4 / d_5);
		floats_1[3] = (float) ((double) (this.buf[15] - this.buf[12]) / d_5);
		return floats_1;
	}

	public float[] method6538(float[] floats_1) {
		float f_2 = this.buf[3] - this.buf[1];
		float f_3 = this.buf[7] - this.buf[5];
		float f_4 = this.buf[11] - this.buf[9];
		double d_5 = Math.sqrt((double) (f_2 * f_2 + f_3 * f_3 + f_4 * f_4));
		floats_1[0] = (float) ((double) f_2 / d_5);
		floats_1[1] = (float) ((double) f_3 / d_5);
		floats_1[2] = (float) ((double) f_4 / d_5);
		floats_1[3] = (float) ((double) (this.buf[15] - this.buf[13]) / d_5);
		return floats_1;
	}

	public float[] method6539(float[] floats_1) {
		float f_2 = this.buf[3] + this.buf[2];
		float f_3 = this.buf[7] + this.buf[6];
		float f_4 = this.buf[11] + this.buf[10];
		double d_5 = Math.sqrt((double) (f_2 * f_2 + f_3 * f_3 + f_4 * f_4));
		floats_1[0] = (float) ((double) f_2 / d_5);
		floats_1[1] = (float) ((double) f_3 / d_5);
		floats_1[2] = (float) ((double) f_4 / d_5);
		floats_1[3] = (float) ((double) (this.buf[15] + this.buf[14]) / d_5);
		return floats_1;
	}

	public float[] method6540(float[] floats_1) {
		float f_2 = this.buf[3] - this.buf[2];
		float f_3 = this.buf[7] - this.buf[6];
		float f_4 = this.buf[11] - this.buf[10];
		double d_5 = Math.sqrt((double) (f_2 * f_2 + f_3 * f_3 + f_4 * f_4));
		floats_1[0] = (float) ((double) f_2 / d_5);
		floats_1[1] = (float) ((double) f_3 / d_5);
		floats_1[2] = (float) ((double) f_4 / d_5);
		floats_1[3] = (float) ((double) (this.buf[15] - this.buf[14]) / d_5);
		return floats_1;
	}

	public float[] method6544(float[] floats_1) {
		floats_1[0] = this.buf[0];
		floats_1[1] = this.buf[1];
		floats_1[2] = this.buf[2];
		floats_1[3] = this.buf[4];
		floats_1[4] = this.buf[5];
		floats_1[5] = this.buf[6];
		floats_1[6] = this.buf[8];
		floats_1[7] = this.buf[9];
		floats_1[8] = this.buf[10];
		return floats_1;
	}

	public float[] method6545(float[] floats_1) {
		floats_1[0] = this.buf[0];
		floats_1[1] = this.buf[4];
		floats_1[2] = this.buf[8];
		floats_1[3] = this.buf[12];
		floats_1[4] = this.buf[1];
		floats_1[5] = this.buf[5];
		floats_1[6] = this.buf[9];
		floats_1[7] = this.buf[13];
		floats_1[8] = this.buf[2];
		floats_1[9] = this.buf[6];
		floats_1[10] = this.buf[10];
		floats_1[11] = this.buf[14];
		floats_1[12] = this.buf[3];
		floats_1[13] = this.buf[7];
		floats_1[14] = this.buf[11];
		floats_1[15] = this.buf[15];
		return floats_1;
	}

	public float[] method6548(float[] floats_1) {
		floats_1[0] = this.buf[0];
		floats_1[1] = this.buf[1];
		floats_1[2] = 0.0F;
		floats_1[3] = 0.0F;
		floats_1[4] = this.buf[4];
		floats_1[5] = this.buf[5];
		floats_1[6] = 0.0F;
		floats_1[7] = 0.0F;
		floats_1[8] = this.buf[12];
		floats_1[9] = this.buf[13];
		floats_1[10] = this.buf[14];
		floats_1[11] = 0.0F;
		floats_1[12] = 0.0F;
		floats_1[13] = 0.0F;
		floats_1[14] = 0.0F;
		floats_1[15] = 1.0F;
		return floats_1;
	}

	public void method6549(int i_1, int i_2, int i_3, float f_4, float f_5, float f_6) {
		float[] floats_9;
		float[] floats_10;
		float[] floats_11;
		float[] floats_12;
		float[] floats_13;
		if (i_1 != 0) {
			float f_7 = Class297.aFloatArray3536[i_1 & 0x3fff];
			float f_8 = Class297.aFloatArray3537[i_1 & 0x3fff];
			this.buf[0] = f_7 * (float) i_2;
			this.buf[5] = f_7 * (float) i_3;
			this.buf[1] = f_8 * (float) i_2;
			this.buf[4] = -f_8 * (float) i_3;
			this.buf[10] = 1.0F;
			floats_9 = this.buf;
			floats_10 = this.buf;
			floats_11 = this.buf;
			this.buf[9] = 0.0F;
			floats_11[8] = 0.0F;
			floats_10[6] = 0.0F;
			floats_9[2] = 0.0F;
		} else {
			this.buf[0] = (float) i_2;
			this.buf[5] = (float) i_3;
			this.buf[10] = 1.0F;
			floats_12 = this.buf;
			floats_13 = this.buf;
			floats_9 = this.buf;
			floats_10 = this.buf;
			floats_11 = this.buf;
			this.buf[9] = 0.0F;
			floats_11[8] = 0.0F;
			floats_10[6] = 0.0F;
			floats_9[4] = 0.0F;
			floats_13[2] = 0.0F;
			floats_12[1] = 0.0F;
		}

		floats_12 = this.buf;
		floats_13 = this.buf;
		this.buf[11] = 0.0F;
		floats_13[7] = 0.0F;
		floats_12[3] = 0.0F;
		this.buf[15] = 1.0F;
		this.buf[12] = f_4;
		this.buf[13] = f_5;
		this.buf[14] = f_6;
	}

	public int hashCode() {
		byte b_1 = 1;
		int i_2 = 31 * b_1 + Arrays.hashCode(this.buf);
		return i_2;
	}

	public float[] method6551(float[] floats_1) {
		floats_1[0] = this.buf[0];
		floats_1[1] = this.buf[1];
		floats_1[2] = this.buf[4];
		floats_1[3] = this.buf[5];
		floats_1[4] = this.buf[8];
		floats_1[5] = this.buf[9];
		floats_1[6] = this.buf[12];
		floats_1[7] = this.buf[13];
		return floats_1;
	}

	public void method6562(Matrix44Arr matrix44arr_1) {
		System.arraycopy(matrix44arr_1.buf, 0, this.buf, 0, 16);
	}

	public void method6568(Matrix44Arr matrix44arr_1, Matrix44Arr matrix44arr_2) {
		float f_3 = matrix44arr_1.buf[0] * matrix44arr_2.buf[0] + matrix44arr_1.buf[1] * matrix44arr_2.buf[4] + matrix44arr_1.buf[2] * matrix44arr_2.buf[8] + matrix44arr_1.buf[3] * matrix44arr_2.buf[12];
		float f_4 = matrix44arr_1.buf[0] * matrix44arr_2.buf[1] + matrix44arr_1.buf[1] * matrix44arr_2.buf[5] + matrix44arr_1.buf[2] * matrix44arr_2.buf[9] + matrix44arr_1.buf[3] * matrix44arr_2.buf[13];
		float f_5 = matrix44arr_1.buf[0] * matrix44arr_2.buf[2] + matrix44arr_1.buf[1] * matrix44arr_2.buf[6] + matrix44arr_1.buf[2] * matrix44arr_2.buf[10] + matrix44arr_1.buf[3] * matrix44arr_2.buf[14];
		float f_6 = matrix44arr_1.buf[0] * matrix44arr_2.buf[3] + matrix44arr_1.buf[1] * matrix44arr_2.buf[7] + matrix44arr_1.buf[2] * matrix44arr_2.buf[11] + matrix44arr_1.buf[3] * matrix44arr_2.buf[15];
		float f_7 = matrix44arr_1.buf[4] * matrix44arr_2.buf[0] + matrix44arr_1.buf[5] * matrix44arr_2.buf[4] + matrix44arr_1.buf[6] * matrix44arr_2.buf[8] + matrix44arr_1.buf[7] * matrix44arr_2.buf[12];
		float f_8 = matrix44arr_1.buf[4] * matrix44arr_2.buf[1] + matrix44arr_1.buf[5] * matrix44arr_2.buf[5] + matrix44arr_1.buf[6] * matrix44arr_2.buf[9] + matrix44arr_1.buf[7] * matrix44arr_2.buf[13];
		float f_9 = matrix44arr_1.buf[4] * matrix44arr_2.buf[2] + matrix44arr_1.buf[5] * matrix44arr_2.buf[6] + matrix44arr_1.buf[6] * matrix44arr_2.buf[10] + matrix44arr_1.buf[7] * matrix44arr_2.buf[14];
		float f_10 = matrix44arr_1.buf[4] * matrix44arr_2.buf[3] + matrix44arr_1.buf[5] * matrix44arr_2.buf[7] + matrix44arr_1.buf[6] * matrix44arr_2.buf[11] + matrix44arr_1.buf[7] * matrix44arr_2.buf[15];
		float f_11 = matrix44arr_1.buf[8] * matrix44arr_2.buf[0] + matrix44arr_1.buf[9] * matrix44arr_2.buf[4] + matrix44arr_1.buf[10] * matrix44arr_2.buf[8] + matrix44arr_1.buf[11] * matrix44arr_2.buf[12];
		float f_12 = matrix44arr_1.buf[8] * matrix44arr_2.buf[1] + matrix44arr_1.buf[9] * matrix44arr_2.buf[5] + matrix44arr_1.buf[10] * matrix44arr_2.buf[9] + matrix44arr_1.buf[11] * matrix44arr_2.buf[13];
		float f_13 = matrix44arr_1.buf[8] * matrix44arr_2.buf[2] + matrix44arr_1.buf[9] * matrix44arr_2.buf[6] + matrix44arr_1.buf[10] * matrix44arr_2.buf[10] + matrix44arr_1.buf[11] * matrix44arr_2.buf[14];
		float f_14 = matrix44arr_1.buf[8] * matrix44arr_2.buf[3] + matrix44arr_1.buf[9] * matrix44arr_2.buf[7] + matrix44arr_1.buf[10] * matrix44arr_2.buf[11] + matrix44arr_1.buf[11] * matrix44arr_2.buf[15];
		float f_15 = matrix44arr_1.buf[12] * matrix44arr_2.buf[0] + matrix44arr_1.buf[13] * matrix44arr_2.buf[4] + matrix44arr_1.buf[14] * matrix44arr_2.buf[8] + matrix44arr_1.buf[15] * matrix44arr_2.buf[12];
		float f_16 = matrix44arr_1.buf[12] * matrix44arr_2.buf[1] + matrix44arr_1.buf[13] * matrix44arr_2.buf[5] + matrix44arr_1.buf[14] * matrix44arr_2.buf[9] + matrix44arr_1.buf[15] * matrix44arr_2.buf[13];
		float f_17 = matrix44arr_1.buf[12] * matrix44arr_2.buf[2] + matrix44arr_1.buf[13] * matrix44arr_2.buf[6] + matrix44arr_1.buf[14] * matrix44arr_2.buf[10] + matrix44arr_1.buf[15] * matrix44arr_2.buf[14];
		float f_18 = matrix44arr_1.buf[12] * matrix44arr_2.buf[3] + matrix44arr_1.buf[13] * matrix44arr_2.buf[7] + matrix44arr_1.buf[14] * matrix44arr_2.buf[11] + matrix44arr_1.buf[15] * matrix44arr_2.buf[15];
		this.buf[0] = f_3;
		this.buf[1] = f_4;
		this.buf[2] = f_5;
		this.buf[3] = f_6;
		this.buf[4] = f_7;
		this.buf[5] = f_8;
		this.buf[6] = f_9;
		this.buf[7] = f_10;
		this.buf[8] = f_11;
		this.buf[9] = f_12;
		this.buf[10] = f_13;
		this.buf[11] = f_14;
		this.buf[12] = f_15;
		this.buf[13] = f_16;
		this.buf[14] = f_17;
		this.buf[15] = f_18;
	}

	public boolean equals(Object object_1) {
		if (!(object_1 instanceof Matrix44Arr)) {
			return false;
		} else {
			Matrix44Arr matrix44arr_2 = (Matrix44Arr) object_1;

			for (int i_3 = 0; i_3 < 16; i_3++) {
				if (this.buf[i_3] != matrix44arr_2.buf[i_3]) {
					return false;
				}
			}

			return true;
		}
	}

	public String toString() {
		StringBuilder stringbuilder_1 = new StringBuilder();

		for (int i_2 = 0; i_2 < 4; i_2++) {
			for (int i_3 = 0; i_3 < 4; i_3++) {
				if (i_3 > 0) {
					stringbuilder_1.append("\t");
				}

				stringbuilder_1.append(this.buf[i_3 + i_2 * 4]);
			}

			stringbuilder_1.append("\n");
		}

		return stringbuilder_1.toString();
	}

	public float method6587() {
		return (this.buf[14] - this.buf[15]) / (this.buf[11] - this.buf[10]);
	}

	public Matrix44Arr(Matrix44Arr matrix44arr_1) {
		this.method6562(matrix44arr_1);
	}

	public float[] method6589(float[] floats_1) {
		floats_1[0] = this.buf[0];
		floats_1[1] = this.buf[4];
		floats_1[2] = this.buf[8];
		floats_1[3] = this.buf[12];
		floats_1[4] = this.buf[1];
		floats_1[5] = this.buf[5];
		floats_1[6] = this.buf[9];
		floats_1[7] = this.buf[13];
		return floats_1;
	}

	public Matrix44Arr() {
		this.identity();
	}

	float method6612() {
		return this.buf[0] * this.buf[5] * this.buf[10] * this.buf[15] - this.buf[0] * this.buf[5] * this.buf[11] * this.buf[14] - this.buf[0] * this.buf[6] * this.buf[9] * this.buf[15] + this.buf[0] * this.buf[6] * this.buf[11] * this.buf[13] + this.buf[0] * this.buf[7] * this.buf[9] * this.buf[14] - this.buf[0] * this.buf[7] * this.buf[10] * this.buf[13] - this.buf[1] * this.buf[4] * this.buf[10] * this.buf[15] + this.buf[1] * this.buf[4] * this.buf[11] * this.buf[14] + this.buf[1] * this.buf[6] * this.buf[8] * this.buf[15] - this.buf[1] * this.buf[6] * this.buf[11] * this.buf[12] - this.buf[1] * this.buf[7] * this.buf[8] * this.buf[14] + this.buf[1] * this.buf[7] * this.buf[10] * this.buf[12] + this.buf[2] * this.buf[4] * this.buf[9] * this.buf[15] - this.buf[2] * this.buf[4] * this.buf[11] * this.buf[13] - this.buf[2] * this.buf[5] * this.buf[8] * this.buf[15] + this.buf[2] * this.buf[5] * this.buf[11] * this.buf[12] + this.buf[2] * this.buf[7] * this.buf[8] * this.buf[13] - this.buf[2] * this.buf[7] * this.buf[9] * this.buf[12] - this.buf[3] * this.buf[4] * this.buf[9] * this.buf[14] + this.buf[3] * this.buf[4] * this.buf[10] * this.buf[13] + this.buf[3] * this.buf[5] * this.buf[8] * this.buf[14] - this.buf[3] * this.buf[5] * this.buf[10] * this.buf[12] - this.buf[3] * this.buf[6] * this.buf[8] * this.buf[13] + this.buf[3] * this.buf[6] * this.buf[9] * this.buf[12];
	}

	public float[] method6613(float[] floats_1) {
		float f_2 = this.buf[3] + this.buf[1];
		float f_3 = this.buf[7] + this.buf[5];
		float f_4 = this.buf[11] + this.buf[9];
		double d_5 = Math.sqrt((double) (f_2 * f_2 + f_3 * f_3 + f_4 * f_4));
		floats_1[0] = (float) ((double) f_2 / d_5);
		floats_1[1] = (float) ((double) f_3 / d_5);
		floats_1[2] = (float) ((double) f_4 / d_5);
		floats_1[3] = (float) ((double) (this.buf[15] + this.buf[13]) / d_5);
		return floats_1;
	}

	public void method6614(float f_1, float f_2, float f_3, float[] floats_4) {
		floats_4[0] = this.buf[0] * f_1 + this.buf[4] * f_2 + this.buf[8] * f_3;
		floats_4[1] = this.buf[1] * f_1 + this.buf[5] * f_2 + this.buf[9] * f_3;
		floats_4[2] = this.buf[2] * f_1 + this.buf[6] * f_2 + this.buf[10] * f_3;
		if (floats_4.length > 3) {
			floats_4[3] = this.buf[3] * f_1 + this.buf[7] * f_2 + this.buf[11] * f_3;
		}

	}

}
