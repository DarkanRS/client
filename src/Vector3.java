public class Vector3 {

	static Vector3[] aClass385Array4669;
	static int anInt4668;
	public float x;
	public float y;
	public float z;
	static int anInt4670;

	static {
		new Vector3(0.0F, 0.0F, 0.0F);
		aClass385Array4669 = new Vector3[0];
	}

	public static Vector3 method6623(Vector3 vector3_0) {
		Vector3[] arr_1 = aClass385Array4669;
		synchronized (aClass385Array4669) {
			Vector3 vector3_2;
			if (anInt4668 == 0) {
				vector3_2 = new Vector3(vector3_0);
				return vector3_2;
			} else {
				aClass385Array4669[--anInt4668].copy(vector3_0);
				vector3_2 = aClass385Array4669[anInt4668];
				return vector3_2;
			}
		}
	}

	public void method6624() {
		Vector3[] arr_1 = aClass385Array4669;
		synchronized (aClass385Array4669) {
			if (anInt4668 < anInt4670 - 1) {
				aClass385Array4669[anInt4668++] = this;
			}

		}
	}

	public Vector3() {
	}

	Vector3(Vector3 vector3_1) {
		this.x = vector3_1.x;
		this.y = vector3_1.y;
		this.z = vector3_1.z;
	}

	public void set(float f_1, float f_2, float f_3) {
		this.x = f_1;
		this.y = f_2;
		this.z = f_3;
	}

	public void copy(Vector3 vector3_1) {
		this.set(vector3_1.x, vector3_1.y, vector3_1.z);
	}

	final void negate() {
		this.x = -this.x;
		this.y = -this.y;
		this.z = -this.z;
	}

	public final void subtract(float f_1, float f_2, float f_3) {
		this.x -= f_1;
		this.y -= f_2;
		this.z -= f_3;
	}

	public static final Vector3 method6632(Vector3 vector3_0, Vector3 vector3_1) {
		Vector3 vector3_2 = method6623(vector3_0);
		vector3_2.subtract(vector3_1);
		return vector3_2;
	}

	public final float magnitude() {
		return (float) Math.sqrt((double) (this.x * this.x + this.y * this.y + this.z * this.z));
	}

	final void method6634(Quaternion quaternion_1) {
		Quaternion quaternion_2 = Quaternion.method6485(this.x, this.y, this.z, 0.0F);
		Quaternion quaternion_3 = Quaternion.method6465(quaternion_1);
		Quaternion quaternion_4 = Quaternion.method6497(quaternion_3, quaternion_2);
		quaternion_4.multiply(quaternion_1);
		this.set(quaternion_4.i, quaternion_4.j, quaternion_4.k);
		quaternion_2.cache();
		quaternion_3.cache();
		quaternion_4.cache();
	}

	final void add(Vector3 vector3_1) {
		this.x += vector3_1.x;
		this.y += vector3_1.y;
		this.z += vector3_1.z;
	}

	public String toString() {
		return this.x + ", " + this.y + ", " + this.z;
	}

	public static Vector3 method6639(float f_0, float f_1, float f_2) {
		Vector3[] arr_3 = aClass385Array4669;
		synchronized (aClass385Array4669) {
			Vector3 vector3_4;
			if (anInt4668 == 0) {
				vector3_4 = new Vector3(f_0, f_1, f_2);
				return vector3_4;
			} else {
				aClass385Array4669[--anInt4668].set(f_0, f_1, f_2);
				vector3_4 = aClass385Array4669[anInt4668];
				return vector3_4;
			}
		}
	}

	public static void method6643(int i_0) {
		anInt4670 = i_0;
		aClass385Array4669 = new Vector3[i_0];
		anInt4668 = 0;
	}

	public final void method6649(Matrix44Var matrix44var_1) {
		float f_2 = this.x;
		float f_3 = this.y;
		this.x = matrix44var_1.aFloat3519 * f_2 + matrix44var_1.aFloat3517 * f_3 + matrix44var_1.aFloat3520 * this.z;
		this.y = matrix44var_1.aFloat3514 * f_2 + matrix44var_1.aFloat3523 * f_3 + matrix44var_1.aFloat3513 * this.z;
		this.z = matrix44var_1.aFloat3516 * f_2 + matrix44var_1.aFloat3522 * f_3 + matrix44var_1.aFloat3521 * this.z;
	}

	public final void method6651(Matrix44Var matrix44var_1) {
		float f_2 = this.x;
		float f_3 = this.y;
		this.x = matrix44var_1.aFloat3519 * f_2 + matrix44var_1.aFloat3517 * f_3 + matrix44var_1.aFloat3520 * this.z + matrix44var_1.aFloat3515;
		this.y = matrix44var_1.aFloat3514 * f_2 + matrix44var_1.aFloat3523 * f_3 + matrix44var_1.aFloat3513 * this.z + matrix44var_1.aFloat3524;
		this.z = matrix44var_1.aFloat3516 * f_2 + matrix44var_1.aFloat3522 * f_3 + matrix44var_1.aFloat3521 * this.z + matrix44var_1.aFloat3525;
	}

	public Vector3(float f_1, float f_2, float f_3) {
		this.x = f_1;
		this.y = f_2;
		this.z = f_3;
	}

	final void subtract(Vector3 vector3_1) {
		this.x -= vector3_1.x;
		this.y -= vector3_1.y;
		this.z -= vector3_1.z;
	}

}
