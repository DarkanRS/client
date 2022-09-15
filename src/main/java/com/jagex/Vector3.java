package com.jagex;

public class Vector3 {

	static Vector3[] vectorStack;
	static int vecStackIdx;
	static int vectorStackSize;

	static {
		new Vector3(0.0F, 0.0F, 0.0F);
		vectorStack = new Vector3[0];
	}

	public static void initVectorStack() {
		vectorStackSize = 100;
		vectorStack = new Vector3[100];
		vecStackIdx = 0;
	}
	public static Vector3 method6632(Vector3 vector3_0, Vector3 vector3_1) {
		Vector3 vector3_2 = popVectorStackTo(vector3_0);
		vector3_2.subtract(vector3_1);
		return vector3_2;
	}
	public static Vector3 method6639(float f_0, float f_1, float f_2) {
		synchronized (vectorStack) {
			Vector3 vector3_4;
			if (vecStackIdx == 0)
				vector3_4 = new Vector3(f_0, f_1, f_2);
			else {
				vectorStack[--vecStackIdx].set(f_0, f_1, f_2);
				vector3_4 = vectorStack[vecStackIdx];
			}
			return vector3_4;
		}
	}

	public static Vector3 popVectorStackTo(Vector3 toReturn) {
		synchronized (vectorStack) {
			Vector3 vector;
			if (vecStackIdx == 0)
				vector = new Vector3(toReturn);
			else {
				vectorStack[--vecStackIdx].copy(toReturn);
				vector = vectorStack[vecStackIdx];
			}
			return vector;
		}
	}

	public float x;

	public float y;

	public float z;

	public Vector3() {
	}

	public Vector3(float f_1, float f_2, float f_3) {
		x = f_1;
		y = f_2;
		z = f_3;
	}

	Vector3(Vector3 vector3_1) {
		x = vector3_1.x;
		y = vector3_1.y;
		z = vector3_1.z;
	}

	void add(Vector3 vector3_1) {
		x += vector3_1.x;
		y += vector3_1.y;
		z += vector3_1.z;
	}

	public void copy(Vector3 vector3_1) {
		set(vector3_1.x, vector3_1.y, vector3_1.z);
	}

	public float magnitude() {
		return (float) Math.sqrt(x * x + y * y + z * z);
	}

	void method6634(Quaternion quaternion_1) {
		Quaternion quaternion_2 = Quaternion.method6485(x, y, z);
		Quaternion quaternion_3 = Quaternion.method6465(quaternion_1);
		Quaternion quaternion_4 = Quaternion.method6497(quaternion_3, quaternion_2);
		quaternion_4.multiply(quaternion_1);
		set(quaternion_4.i, quaternion_4.j, quaternion_4.k);
		quaternion_2.cache();
		quaternion_3.cache();
		quaternion_4.cache();
	}

	public void method6649(Matrix44Var matrix44var_1) {
		float f_2 = x;
		float f_3 = y;
		x = matrix44var_1.aFloat3519 * f_2 + matrix44var_1.aFloat3517 * f_3 + matrix44var_1.aFloat3520 * z;
		y = matrix44var_1.aFloat3514 * f_2 + matrix44var_1.aFloat3523 * f_3 + matrix44var_1.aFloat3513 * z;
		z = matrix44var_1.aFloat3516 * f_2 + matrix44var_1.aFloat3522 * f_3 + matrix44var_1.aFloat3521 * z;
	}

	public void method6651(Matrix44Var matrix44var_1) {
		float f_2 = x;
		float f_3 = y;
		x = matrix44var_1.aFloat3519 * f_2 + matrix44var_1.aFloat3517 * f_3 + matrix44var_1.aFloat3520 * z + matrix44var_1.aFloat3515;
		y = matrix44var_1.aFloat3514 * f_2 + matrix44var_1.aFloat3523 * f_3 + matrix44var_1.aFloat3513 * z + matrix44var_1.aFloat3524;
		z = matrix44var_1.aFloat3516 * f_2 + matrix44var_1.aFloat3522 * f_3 + matrix44var_1.aFloat3521 * z + matrix44var_1.aFloat3525;
	}

	void negate() {
		x = -x;
		y = -y;
		z = -z;
	}

	public void pushVectorStack() {
		synchronized (vectorStack) {
			if (vecStackIdx < vectorStackSize - 1)
				vectorStack[vecStackIdx++] = this;

		}
	}

	public void set(float f_1, float f_2, float f_3) {
		x = f_1;
		y = f_2;
		z = f_3;
	}

	public void subtract(float f_1, float f_2, float f_3) {
		x -= f_1;
		y -= f_2;
		z -= f_3;
	}

	void subtract(Vector3 vector3_1) {
		x -= vector3_1.x;
		y -= vector3_1.y;
		z -= vector3_1.z;
	}

	@Override
	public String toString() {
		return x + ", " + y + ", " + z;
	}

}
