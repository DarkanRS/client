public class Matrix44Var {

	public static Matrix44Var aClass294_3518 = new Matrix44Var();
	float aFloat3517;
	float aFloat3514;
	float aFloat3520;
	float aFloat3516;
	float aFloat3513;
	float aFloat3522;
	float aFloat3515;
	float aFloat3524;
	float aFloat3525;
	float aFloat3519;
	float aFloat3523;
	float aFloat3521;

	public void method5207() {
		float f_1 = this.aFloat3515;
		float f_2 = this.aFloat3524;
		float f_3 = this.aFloat3517;
		this.aFloat3517 = this.aFloat3514;
		this.aFloat3514 = f_3;
		float f_4 = this.aFloat3520;
		this.aFloat3520 = this.aFloat3516;
		this.aFloat3516 = f_4;
		float f_5 = this.aFloat3513;
		this.aFloat3513 = this.aFloat3522;
		this.aFloat3522 = f_5;
		this.aFloat3515 = -(f_1 * this.aFloat3519 + f_2 * this.aFloat3517 + this.aFloat3525 * this.aFloat3520);
		this.aFloat3524 = -(f_1 * this.aFloat3514 + f_2 * this.aFloat3523 + this.aFloat3525 * this.aFloat3513);
		this.aFloat3525 = -(f_1 * this.aFloat3516 + f_2 * this.aFloat3522 + this.aFloat3525 * this.aFloat3521);
	}

	public void method5208(Matrix44Var matrix44var_1) {
		float f_2 = this.aFloat3519;
		float f_3 = this.aFloat3514;
		float f_4 = this.aFloat3517;
		float f_5 = this.aFloat3523;
		float f_6 = this.aFloat3520;
		float f_7 = this.aFloat3513;
		float f_8 = this.aFloat3515;
		float f_9 = this.aFloat3524;
		float f_10 = this.aFloat3516;
		float f_11 = this.aFloat3522;
		float f_12 = this.aFloat3521;
		float f_13 = this.aFloat3525;
		this.aFloat3519 = f_2 * matrix44var_1.aFloat3519 + f_3 * matrix44var_1.aFloat3517 + f_10 * matrix44var_1.aFloat3520;
		this.aFloat3514 = f_2 * matrix44var_1.aFloat3514 + f_3 * matrix44var_1.aFloat3523 + f_10 * matrix44var_1.aFloat3513;
		this.aFloat3516 = f_2 * matrix44var_1.aFloat3516 + f_3 * matrix44var_1.aFloat3522 + f_10 * matrix44var_1.aFloat3521;
		this.aFloat3517 = f_4 * matrix44var_1.aFloat3519 + f_5 * matrix44var_1.aFloat3517 + f_11 * matrix44var_1.aFloat3520;
		this.aFloat3523 = f_4 * matrix44var_1.aFloat3514 + f_5 * matrix44var_1.aFloat3523 + f_11 * matrix44var_1.aFloat3513;
		this.aFloat3522 = f_4 * matrix44var_1.aFloat3516 + f_5 * matrix44var_1.aFloat3522 + f_11 * matrix44var_1.aFloat3521;
		this.aFloat3520 = f_6 * matrix44var_1.aFloat3519 + f_7 * matrix44var_1.aFloat3517 + f_12 * matrix44var_1.aFloat3520;
		this.aFloat3513 = f_6 * matrix44var_1.aFloat3514 + f_7 * matrix44var_1.aFloat3523 + f_12 * matrix44var_1.aFloat3513;
		this.aFloat3521 = f_6 * matrix44var_1.aFloat3516 + f_7 * matrix44var_1.aFloat3522 + f_12 * matrix44var_1.aFloat3521;
		this.aFloat3515 = f_8 * matrix44var_1.aFloat3519 + f_9 * matrix44var_1.aFloat3517 + f_13 * matrix44var_1.aFloat3520 + matrix44var_1.aFloat3515;
		this.aFloat3524 = f_8 * matrix44var_1.aFloat3514 + f_9 * matrix44var_1.aFloat3523 + f_13 * matrix44var_1.aFloat3513 + matrix44var_1.aFloat3524;
		this.aFloat3525 = f_8 * matrix44var_1.aFloat3516 + f_9 * matrix44var_1.aFloat3522 + f_13 * matrix44var_1.aFloat3521 + matrix44var_1.aFloat3525;
	}

	public void method5209(Matrix44Var matrix44var_1) {
		this.aFloat3519 = matrix44var_1.aFloat3519;
		this.aFloat3517 = matrix44var_1.aFloat3517;
		this.aFloat3520 = matrix44var_1.aFloat3520;
		this.aFloat3515 = matrix44var_1.aFloat3515;
		this.aFloat3514 = matrix44var_1.aFloat3514;
		this.aFloat3523 = matrix44var_1.aFloat3523;
		this.aFloat3513 = matrix44var_1.aFloat3513;
		this.aFloat3524 = matrix44var_1.aFloat3524;
		this.aFloat3516 = matrix44var_1.aFloat3516;
		this.aFloat3522 = matrix44var_1.aFloat3522;
		this.aFloat3521 = matrix44var_1.aFloat3521;
		this.aFloat3525 = matrix44var_1.aFloat3525;
	}

	public void method5210(Position class305_1) {
		this.method5242(class305_1.aClass381_3594);
		this.method5263(class305_1.aClass385_3595);
	}

	public void method5212() {
		this.aFloat3525 = 0.0F;
		this.aFloat3524 = 0.0F;
		this.aFloat3515 = 0.0F;
		this.aFloat3513 = 0.0F;
		this.aFloat3520 = 0.0F;
		this.aFloat3522 = 0.0F;
		this.aFloat3517 = 0.0F;
		this.aFloat3516 = 0.0F;
		this.aFloat3514 = 0.0F;
		this.aFloat3521 = 1.0F;
		this.aFloat3523 = 1.0F;
		this.aFloat3519 = 1.0F;
	}

	public void method5213(int i_1, int i_2, int i_3, float f_4, float f_5, float f_6) {
		if (i_1 != 0) {
			float f_7 = Class297.aFloatArray3536[i_1 & 0x3fff];
			float f_8 = Class297.aFloatArray3537[i_1 & 0x3fff];
			this.aFloat3521 = 1.0F;
			this.aFloat3513 = 0.0F;
			this.aFloat3520 = 0.0F;
			this.aFloat3522 = 0.0F;
			this.aFloat3516 = 0.0F;
			this.aFloat3519 = 2.0F * f_7 * (float) i_2;
			this.aFloat3523 = 2.0F * f_7 * (float) i_3;
			this.aFloat3514 = 2.0F * f_8 * (float) i_2;
			this.aFloat3517 = -2.0F * f_8 * (float) i_3;
			this.aFloat3515 = (float) (i_2 * 2) * (0.5F * f_8 - 0.5F * f_7) + f_4;
			this.aFloat3524 = (float) (i_3 * 2) * (-0.5F * f_8 - 0.5F * f_7) + f_5;
			this.aFloat3525 = f_6;
		} else {
			this.aFloat3513 = 0.0F;
			this.aFloat3520 = 0.0F;
			this.aFloat3522 = 0.0F;
			this.aFloat3517 = 0.0F;
			this.aFloat3516 = 0.0F;
			this.aFloat3514 = 0.0F;
			this.aFloat3519 = (float) (i_2 * 2);
			this.aFloat3523 = (float) (i_3 * 2);
			this.aFloat3521 = 1.0F;
			this.aFloat3515 = f_4 - (float) i_2;
			this.aFloat3524 = f_5 - (float) i_3;
			this.aFloat3525 = f_6;
		}

	}

	public void method5214() {
		this.aFloat3519 = (float) 1.0;
		this.aFloat3517 = (float) 0.0;
		this.aFloat3520 = (float) 0.0;
		this.aFloat3515 = 0.0F;
		this.aFloat3514 = (float) 0.0;
		this.aFloat3523 = (float) 0.0;
		this.aFloat3513 = (float) 1.0;
		this.aFloat3524 = 0.0F;
		this.aFloat3516 = (float) 0.0;
		this.aFloat3522 = (float) 1.0;
		this.aFloat3521 = (float) 0.0;
		this.aFloat3525 = 0.0F;
	}

	public void method5215(Matrix44Var matrix44var_1) {
		if (this == matrix44var_1) {
			this.method5207();
		} else {
			this.aFloat3519 = matrix44var_1.aFloat3519;
			this.aFloat3517 = matrix44var_1.aFloat3514;
			this.aFloat3520 = matrix44var_1.aFloat3516;
			this.aFloat3514 = matrix44var_1.aFloat3517;
			this.aFloat3523 = matrix44var_1.aFloat3523;
			this.aFloat3513 = matrix44var_1.aFloat3522;
			this.aFloat3516 = matrix44var_1.aFloat3520;
			this.aFloat3522 = matrix44var_1.aFloat3513;
			this.aFloat3521 = matrix44var_1.aFloat3521;
			this.aFloat3515 = -(matrix44var_1.aFloat3515 * this.aFloat3519 + matrix44var_1.aFloat3524 * this.aFloat3517 + matrix44var_1.aFloat3525 * this.aFloat3520);
			this.aFloat3524 = -(matrix44var_1.aFloat3515 * this.aFloat3514 + matrix44var_1.aFloat3524 * this.aFloat3523 + matrix44var_1.aFloat3525 * this.aFloat3513);
			this.aFloat3525 = -(matrix44var_1.aFloat3515 * this.aFloat3516 + matrix44var_1.aFloat3524 * this.aFloat3522 + matrix44var_1.aFloat3525 * this.aFloat3521);
		}

	}

	public void method5217(float f_1, float f_2, float f_3, float theta) {
		float cos = (float) Math.cos((double) theta);
		float sin = (float) Math.sin((double) theta);
		this.aFloat3519 = cos + f_1 * f_1 * (1.0F - cos);
		this.aFloat3514 = f_3 * sin + f_2 * f_1 * (1.0F - cos);
		this.aFloat3516 = -f_2 * sin + f_3 * f_1 * (1.0F - cos);
		this.aFloat3517 = -f_3 * sin + f_1 * f_2 * (1.0F - cos);
		this.aFloat3523 = cos + f_2 * f_2 * (1.0F - cos);
		this.aFloat3522 = f_1 * sin + f_3 * f_2 * (1.0F - cos);
		this.aFloat3520 = f_2 * sin + f_1 * f_3 * (1.0F - cos);
		this.aFloat3513 = -f_1 * sin + f_2 * f_3 * (1.0F - cos);
		this.aFloat3521 = cos + f_3 * f_3 * (1.0F - cos);
		this.aFloat3525 = 0.0F;
		this.aFloat3524 = 0.0F;
		this.aFloat3515 = 0.0F;
	}

	public void method5219(float f_1, float f_2, float f_3) {
		this.aFloat3515 += f_1;
		this.aFloat3524 += f_2;
		this.aFloat3525 += f_3;
	}

	public void rotation(float axisX, float axisY, float axisZ, float theta) {
		float cos = (float) Math.cos((double) theta);
		float sin = (float) Math.sin((double) theta);
		float f_7 = cos + axisX * axisX * (1.0F - cos);
		float f_8 = axisZ * sin + axisY * axisX * (1.0F - cos);
		float f_9 = -axisY * sin + axisZ * axisX * (1.0F - cos);
		float f_10 = -axisZ * sin + axisX * axisY * (1.0F - cos);
		float f_11 = cos + axisY * axisY * (1.0F - cos);
		float f_12 = axisX * sin + axisZ * axisY * (1.0F - cos);
		float f_13 = axisY * sin + axisX * axisZ * (1.0F - cos);
		float f_14 = -axisX * sin + axisY * axisZ * (1.0F - cos);
		float f_15 = cos + axisZ * axisZ * (1.0F - cos);
		float f_16 = this.aFloat3519;
		float f_17 = this.aFloat3514;
		float f_18 = this.aFloat3517;
		float f_19 = this.aFloat3523;
		float f_20 = this.aFloat3520;
		float f_21 = this.aFloat3513;
		float f_22 = this.aFloat3515;
		float f_23 = this.aFloat3524;
		this.aFloat3519 = f_16 * f_7 + f_17 * f_10 + this.aFloat3516 * f_13;
		this.aFloat3514 = f_16 * f_8 + f_17 * f_11 + this.aFloat3516 * f_14;
		this.aFloat3516 = f_16 * f_9 + f_17 * f_12 + this.aFloat3516 * f_15;
		this.aFloat3517 = f_18 * f_7 + f_19 * f_10 + this.aFloat3522 * f_13;
		this.aFloat3523 = f_18 * f_8 + f_19 * f_11 + this.aFloat3522 * f_14;
		this.aFloat3522 = f_18 * f_9 + f_19 * f_12 + this.aFloat3522 * f_15;
		this.aFloat3520 = f_20 * f_7 + f_21 * f_10 + this.aFloat3521 * f_13;
		this.aFloat3513 = f_20 * f_8 + f_21 * f_11 + this.aFloat3521 * f_14;
		this.aFloat3521 = f_20 * f_9 + f_21 * f_12 + this.aFloat3521 * f_15;
		this.aFloat3515 = f_22 * f_7 + f_23 * f_10 + this.aFloat3525 * f_13;
		this.aFloat3524 = f_22 * f_8 + f_23 * f_11 + this.aFloat3525 * f_14;
		this.aFloat3525 = f_22 * f_9 + f_23 * f_12 + this.aFloat3525 * f_15;
	}

	public void method5223(float f_1, float f_2, float f_3) {
		this.aFloat3513 = 0.0F;
		this.aFloat3520 = 0.0F;
		this.aFloat3522 = 0.0F;
		this.aFloat3517 = 0.0F;
		this.aFloat3516 = 0.0F;
		this.aFloat3514 = 0.0F;
		this.aFloat3521 = 1.0F;
		this.aFloat3523 = 1.0F;
		this.aFloat3519 = 1.0F;
		this.aFloat3515 = f_1;
		this.aFloat3524 = f_2;
		this.aFloat3525 = f_3;
	}

	public String toString() {
		return this.aFloat3519 + "," + this.aFloat3517 + "," + this.aFloat3520 + "," + this.aFloat3515 + " - " + this.aFloat3514 + "," + this.aFloat3523 + "," + this.aFloat3513 + "," + this.aFloat3524 + " - " + this.aFloat3516 + "," + this.aFloat3522 + "," + this.aFloat3521 + "," + this.aFloat3525;
	}

	public void method5226(float f_1, float f_2, float f_3, float[] floats_4) {
		floats_4[0] = this.aFloat3519 * f_1 + this.aFloat3517 * f_2 + this.aFloat3520 * f_3 + this.aFloat3515;
		floats_4[1] = this.aFloat3514 * f_1 + this.aFloat3523 * f_2 + this.aFloat3513 * f_3 + this.aFloat3524;
		floats_4[2] = this.aFloat3516 * f_1 + this.aFloat3522 * f_2 + this.aFloat3521 * f_3 + this.aFloat3525;
	}

	public void method5228(float f_1, float f_2, float f_3, float[] floats_4) {
		f_1 -= this.aFloat3515;
		f_2 -= this.aFloat3524;
		f_3 -= this.aFloat3525;
		floats_4[0] = (float) ((int) (this.aFloat3519 * f_1 + this.aFloat3514 * f_2 + this.aFloat3516 * f_3));
		floats_4[1] = (float) ((int) (this.aFloat3517 * f_1 + this.aFloat3523 * f_2 + this.aFloat3522 * f_3));
		floats_4[2] = (float) ((int) (this.aFloat3520 * f_1 + this.aFloat3513 * f_2 + this.aFloat3521 * f_3));
	}

	public void method5230(float[] floats_1) {
		float f_2 = floats_1[0];
		float f_3 = floats_1[1];
		float f_4 = floats_1[2];
		floats_1[0] = this.aFloat3519 * f_2 + this.aFloat3514 * f_3 + this.aFloat3516 * f_4;
		floats_1[1] = this.aFloat3517 * f_2 + this.aFloat3523 * f_3 + this.aFloat3522 * f_4;
		floats_1[2] = this.aFloat3520 * f_2 + this.aFloat3513 * f_3 + this.aFloat3521 * f_4;
	}

	public float[] method5231(float[] floats_1) {
		floats_1[0] = this.aFloat3515;
		floats_1[1] = this.aFloat3524;
		floats_1[2] = this.aFloat3525;
		return floats_1;
	}

	void method5242(Quaternion quaternion_1) {
		this.method5272(quaternion_1.i, quaternion_1.j, quaternion_1.k, quaternion_1.scalar);
	}

	public void method5243(float[] floats_1) {
		float f_2 = floats_1[0] - this.aFloat3515;
		float f_3 = floats_1[1] - this.aFloat3524;
		float f_4 = floats_1[2] - this.aFloat3525;
		floats_1[0] = (float) ((int) (this.aFloat3519 * f_2 + this.aFloat3514 * f_3 + this.aFloat3516 * f_4));
		floats_1[1] = (float) ((int) (this.aFloat3517 * f_2 + this.aFloat3523 * f_3 + this.aFloat3522 * f_4));
		floats_1[2] = (float) ((int) (this.aFloat3520 * f_2 + this.aFloat3513 * f_3 + this.aFloat3521 * f_4));
	}

	public void method5247(float f_1, float f_2) {
		this.aFloat3519 *= f_1;
		this.aFloat3517 *= f_1;
		this.aFloat3520 *= f_1;
		this.aFloat3515 *= f_1;
		this.aFloat3514 *= f_2;
		this.aFloat3523 *= f_2;
		this.aFloat3513 *= f_2;
		this.aFloat3524 *= f_2;
		this.aFloat3516 *= (float) 1.0;
		this.aFloat3522 *= (float) 1.0;
		this.aFloat3521 *= (float) 1.0;
		this.aFloat3525 *= (float) 1.0;
	}

	public void method5259(float f_1, float f_2, float f_3) {
		this.aFloat3519 = f_1;
		this.aFloat3517 = 0.0F;
		this.aFloat3520 = 0.0F;
		this.aFloat3515 = 0.0F;
		this.aFloat3514 = 0.0F;
		this.aFloat3523 = f_2;
		this.aFloat3513 = 0.0F;
		this.aFloat3524 = 0.0F;
		this.aFloat3516 = 0.0F;
		this.aFloat3522 = 0.0F;
		this.aFloat3521 = f_3;
		this.aFloat3525 = 0.0F;
	}

	public void method5261(Matrix44Var matrix44var_1, Matrix44Var matrix44var_2) {
		this.aFloat3519 = matrix44var_1.aFloat3519 * matrix44var_2.aFloat3519 + matrix44var_1.aFloat3514 * matrix44var_2.aFloat3517 + matrix44var_1.aFloat3516 * matrix44var_2.aFloat3520;
		this.aFloat3514 = matrix44var_1.aFloat3519 * matrix44var_2.aFloat3514 + matrix44var_1.aFloat3514 * matrix44var_2.aFloat3523 + matrix44var_1.aFloat3516 * matrix44var_2.aFloat3513;
		this.aFloat3516 = matrix44var_1.aFloat3519 * matrix44var_2.aFloat3516 + matrix44var_1.aFloat3514 * matrix44var_2.aFloat3522 + matrix44var_1.aFloat3516 * matrix44var_2.aFloat3521;
		this.aFloat3517 = matrix44var_1.aFloat3517 * matrix44var_2.aFloat3519 + matrix44var_1.aFloat3523 * matrix44var_2.aFloat3517 + matrix44var_1.aFloat3522 * matrix44var_2.aFloat3520;
		this.aFloat3523 = matrix44var_1.aFloat3517 * matrix44var_2.aFloat3514 + matrix44var_1.aFloat3523 * matrix44var_2.aFloat3523 + matrix44var_1.aFloat3522 * matrix44var_2.aFloat3513;
		this.aFloat3522 = matrix44var_1.aFloat3517 * matrix44var_2.aFloat3516 + matrix44var_1.aFloat3523 * matrix44var_2.aFloat3522 + matrix44var_1.aFloat3522 * matrix44var_2.aFloat3521;
		this.aFloat3520 = matrix44var_1.aFloat3520 * matrix44var_2.aFloat3519 + matrix44var_1.aFloat3513 * matrix44var_2.aFloat3517 + matrix44var_1.aFloat3521 * matrix44var_2.aFloat3520;
		this.aFloat3513 = matrix44var_1.aFloat3520 * matrix44var_2.aFloat3514 + matrix44var_1.aFloat3513 * matrix44var_2.aFloat3523 + matrix44var_1.aFloat3521 * matrix44var_2.aFloat3513;
		this.aFloat3521 = matrix44var_1.aFloat3520 * matrix44var_2.aFloat3516 + matrix44var_1.aFloat3513 * matrix44var_2.aFloat3522 + matrix44var_1.aFloat3521 * matrix44var_2.aFloat3521;
		this.aFloat3515 = matrix44var_1.aFloat3515 * matrix44var_2.aFloat3519 + matrix44var_1.aFloat3524 * matrix44var_2.aFloat3517 + matrix44var_1.aFloat3525 * matrix44var_2.aFloat3520 + matrix44var_2.aFloat3515;
		this.aFloat3524 = matrix44var_1.aFloat3515 * matrix44var_2.aFloat3514 + matrix44var_1.aFloat3524 * matrix44var_2.aFloat3523 + matrix44var_1.aFloat3525 * matrix44var_2.aFloat3513 + matrix44var_2.aFloat3524;
		this.aFloat3525 = matrix44var_1.aFloat3515 * matrix44var_2.aFloat3516 + matrix44var_1.aFloat3524 * matrix44var_2.aFloat3522 + matrix44var_1.aFloat3525 * matrix44var_2.aFloat3521 + matrix44var_2.aFloat3525;
	}

	public Matrix44Var(Matrix44Var matrix44var_1) {
		this.method5209(matrix44var_1);
	}

	public Matrix44Var() {
		this.method5212();
	}

	void method5263(Vector3 vector3_1) {
		this.method5219(vector3_1.x, vector3_1.y, vector3_1.z);
	}

	void method5272(float f_1, float f_2, float f_3, float f_4) {
		float f_5 = f_1 * f_1;
		float f_6 = f_1 * f_2;
		float f_7 = f_1 * f_3;
		float f_8 = f_1 * f_4;
		float f_9 = f_2 * f_2;
		float f_10 = f_2 * f_3;
		float f_11 = f_2 * f_4;
		float f_12 = f_3 * f_3;
		float f_13 = f_3 * f_4;
		this.aFloat3519 = 1.0F - 2.0F * (f_9 + f_12);
		this.aFloat3517 = 2.0F * (f_6 - f_13);
		this.aFloat3520 = 2.0F * (f_7 + f_11);
		this.aFloat3514 = 2.0F * (f_6 + f_13);
		this.aFloat3523 = 1.0F - 2.0F * (f_5 + f_12);
		this.aFloat3513 = 2.0F * (f_10 - f_8);
		this.aFloat3516 = 2.0F * (f_7 - f_11);
		this.aFloat3522 = 2.0F * (f_10 + f_8);
		this.aFloat3521 = 1.0F - 2.0F * (f_5 + f_9);
		this.aFloat3525 = 0.0F;
		this.aFloat3524 = 0.0F;
		this.aFloat3515 = 0.0F;
	}

	public void method5279(Position class305_1) {
		float f_2 = class305_1.aClass381_3594.scalar * class305_1.aClass381_3594.scalar;
		float f_3 = class305_1.aClass381_3594.scalar * class305_1.aClass381_3594.i;
		float f_4 = class305_1.aClass381_3594.scalar * class305_1.aClass381_3594.j;
		float f_5 = class305_1.aClass381_3594.scalar * class305_1.aClass381_3594.k;
		float f_6 = class305_1.aClass381_3594.i * class305_1.aClass381_3594.i;
		float f_7 = class305_1.aClass381_3594.i * class305_1.aClass381_3594.j;
		float f_8 = class305_1.aClass381_3594.i * class305_1.aClass381_3594.k;
		float f_9 = class305_1.aClass381_3594.j * class305_1.aClass381_3594.j;
		float f_10 = class305_1.aClass381_3594.j * class305_1.aClass381_3594.k;
		float f_11 = class305_1.aClass381_3594.k * class305_1.aClass381_3594.k;
		this.aFloat3519 = f_6 + f_2 - f_11 - f_9;
		this.aFloat3514 = f_7 + f_5 + f_7 + f_5;
		this.aFloat3516 = f_8 - f_4 - f_4 + f_8;
		this.aFloat3517 = f_7 - f_5 - f_5 + f_7;
		this.aFloat3523 = f_9 + f_2 - f_6 - f_11;
		this.aFloat3522 = f_10 + f_3 + f_10 + f_3;
		this.aFloat3520 = f_8 + f_4 + f_8 + f_4;
		this.aFloat3513 = f_10 - f_3 - f_3 + f_10;
		this.aFloat3521 = f_11 + f_2 - f_9 - f_6;
		this.aFloat3515 = class305_1.aClass385_3595.x;
		this.aFloat3524 = class305_1.aClass385_3595.y;
		this.aFloat3525 = class305_1.aClass385_3595.z;
	}

}
