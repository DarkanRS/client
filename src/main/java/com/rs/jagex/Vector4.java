package com.rs.jagex;

public class Vector4 {

	public float x;
	public float y;
	public float z;
	public float w;

	public Vector4() {
		reset();
	}

	public Vector4(float f_1, float f_2, float f_3, float f_4) {
		set(f_1, f_2, f_3, f_4);
	}

	public void concat(Matrix44 matrix44_1) {
		float f_2 = x;
		float f_3 = y;
		float f_4 = z;
		float f_5 = w;
		x = matrix44_1.buf[0] * f_2 + matrix44_1.buf[4] * f_3 + matrix44_1.buf[8] * f_4 + matrix44_1.buf[12] * f_5;
		y = matrix44_1.buf[1] * f_2 + matrix44_1.buf[5] * f_3 + matrix44_1.buf[9] * f_4 + matrix44_1.buf[13] * f_5;
		z = matrix44_1.buf[2] * f_2 + matrix44_1.buf[6] * f_3 + matrix44_1.buf[10] * f_4 + matrix44_1.buf[14] * f_5;
		w = matrix44_1.buf[3] * f_2 + matrix44_1.buf[7] * f_3 + matrix44_1.buf[11] * f_4 + matrix44_1.buf[15] * f_5;
	}

	public void copy(Vector4 vector4_1) {
		set(vector4_1.x, vector4_1.y, vector4_1.z, vector4_1.w);
	}

	public void fromInt(int i_1) {
		set((i_1 >> 16 & 0xff) * 0.003921569F, (i_1 >> 8 & 0xff) * 0.003921569F, (i_1 & 0xff) * 0.003921569F, (i_1 >> 24 & 0xff) * 0.003921569F);
	}

	public void negate() {
		x = -x;
		y = -y;
		z = -z;
		w = -w;
	}

	void reset() {
		w = 0.0F;
		z = 0.0F;
		y = 0.0F;
		x = 0.0F;
	}

	public void scale(float f_1) {
		x *= f_1;
		y *= f_1;
		z *= f_1;
		w *= f_1;
	}

	public void set(float f_1, float f_2, float f_3, float f_4) {
		x = f_1;
		y = f_2;
		z = f_3;
		w = f_4;
	}

	@Override
	public String toString() {
		return x + "," + y + "," + z + "," + w;
	}

}
