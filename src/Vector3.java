/* Class385 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Vector3 {
	static int anInt4668;
	static Vector3[] aClass385Array4669;
	static int anInt4670;
	public float x;
	public float y;
	public float z;

	public static Vector3 method6623(Vector3 class385) {
		synchronized (aClass385Array4669) {
			if (anInt4668 == 0) {
				Vector3 class385_3_ = new Vector3(class385);
				return class385_3_;
			}
			aClass385Array4669[--anInt4668].copy(class385);
			Vector3 class385_4_ = aClass385Array4669[anInt4668];
			return class385_4_;
		}
	}

	public void method6624() {
		synchronized (aClass385Array4669) {
			if (anInt4668 < anInt4670 - 1)
				aClass385Array4669[anInt4668++] = this;
		}
	}

	public Vector3() {
		/* empty */
	}

	Vector3(Vector3 class385_7_) {
		x = class385_7_.x;
		y = class385_7_.y;
		z = class385_7_.z;
	}

	public void set(float f, float f_8_, float f_9_) {
		x = f;
		y = f_8_;
		z = f_9_;
	}

	public void copy(Vector3 class385_10_) {
		set(class385_10_.x, class385_10_.y, class385_10_.z);
	}

	final void negate() {
		x = -x;
		y = -y;
		z = -z;
	}

	public final void subtract(float f, float f_14_, float f_15_) {
		x -= f;
		y -= f_14_;
		z -= f_15_;
	}

	public static final Vector3 method6632(Vector3 class385, Vector3 class385_16_) {
		Vector3 class385_17_ = method6623(class385);
		class385_17_.subtract(class385_16_);
		return class385_17_;
	}

	public final float magnitude() {
		return (float) Math.sqrt((double) (x * x + y * y + z * z));
	}

	final void method6634(Quaternion class381) {
		Quaternion class381_18_ = Quaternion.method6485(x, y, z, 0.0F);
		Quaternion class381_19_ = Quaternion.method6465(class381);
		Quaternion class381_20_ = Quaternion.method6497(class381_19_, class381_18_);
		class381_20_.multiply(class381);
		set(((Quaternion) class381_20_).i, ((Quaternion) class381_20_).j, ((Quaternion) class381_20_).k);
		class381_18_.cache();
		class381_19_.cache();
		class381_20_.cache();
	}

	final void add(Vector3 class385_23_) {
		x += class385_23_.x;
		y += class385_23_.y;
		z += class385_23_.z;
	}

	public String toString() {
		return new StringBuilder().append(x).append(", ").append(y).append(", ").append(z).toString();
	}

	public static Vector3 method6639(float f, float f_24_, float f_25_) {
		synchronized (aClass385Array4669) {
			if (anInt4668 == 0) {
				Vector3 class385 = new Vector3(f, f_24_, f_25_);
				return class385;
			}
			aClass385Array4669[--anInt4668].set(f, f_24_, f_25_);
			Vector3 class385 = aClass385Array4669[anInt4668];
			return class385;
		}
	}

	public static void method6643(int i) {
		anInt4670 = i;
		aClass385Array4669 = new Vector3[i];
		anInt4668 = 0;
	}

	public final void method6649(Matrix44Var class294) {
		float f = x;
		float f_37_ = y;
		x = (((Matrix44Var) class294).aFloat3519 * f + ((Matrix44Var) class294).aFloat3517 * f_37_ + ((Matrix44Var) class294).aFloat3520 * z);
		y = (((Matrix44Var) class294).aFloat3514 * f + ((Matrix44Var) class294).aFloat3523 * f_37_ + ((Matrix44Var) class294).aFloat3513 * z);
		z = (((Matrix44Var) class294).aFloat3516 * f + ((Matrix44Var) class294).aFloat3522 * f_37_ + ((Matrix44Var) class294).aFloat3521 * z);
	}

	public final void method6651(Matrix44Var class294) {
		float f = x;
		float f_39_ = y;
		x = (((Matrix44Var) class294).aFloat3519 * f + ((Matrix44Var) class294).aFloat3517 * f_39_ + ((Matrix44Var) class294).aFloat3520 * z + ((Matrix44Var) class294).aFloat3515);
		y = (((Matrix44Var) class294).aFloat3514 * f + ((Matrix44Var) class294).aFloat3523 * f_39_ + ((Matrix44Var) class294).aFloat3513 * z + ((Matrix44Var) class294).aFloat3524);
		z = (((Matrix44Var) class294).aFloat3516 * f + ((Matrix44Var) class294).aFloat3522 * f_39_ + ((Matrix44Var) class294).aFloat3521 * z + ((Matrix44Var) class294).aFloat3525);
	}

	public Vector3(float f, float f_41_, float f_42_) {
		x = f;
		y = f_41_;
		z = f_42_;
	}

	static {
		new Vector3(0.0F, 0.0F, 0.0F);
		aClass385Array4669 = new Vector3[0];
	}

	final void subtract(Vector3 class385_65_) {
		x -= class385_65_.x;
		y -= class385_65_.y;
		z -= class385_65_.z;
	}
}
