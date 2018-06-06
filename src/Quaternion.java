/* Class381 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Quaternion {
	float j;
	static int anInt4638;
	static int anInt4639;
	float i;
	static Quaternion[] aClass381Array4641 = new Quaternion[0];
	float k;
	float scalar;

	public static Quaternion create() {
		synchronized (aClass381Array4641) {
			if (anInt4639 == 0) {
				Quaternion class381 = new Quaternion();
				return class381;
			}
			aClass381Array4641[--anInt4639].reset();
			Quaternion class381 = aClass381Array4641[anInt4639];
			return class381;
		}
	}

	static Quaternion method6457(Quaternion class381) {
		synchronized (aClass381Array4641) {
			if (anInt4639 == 0) {
				Quaternion class381_7_ = new Quaternion(class381);
				return class381_7_;
			}
			aClass381Array4641[--anInt4639].copy(class381);
			Quaternion class381_8_ = aClass381Array4641[anInt4639];
			return class381_8_;
		}
	}

	public Quaternion() {
		reset();
	}

	Quaternion(float f, float f_11_, float f_12_, float f_13_) {
		set(f, f_11_, f_12_, f_13_);
	}

	Quaternion(Quaternion class381_14_) {
		copy(class381_14_);
	}

	void set(float f, float f_15_, float f_16_, float f_17_) {
		((Quaternion) this).i = f;
		((Quaternion) this).j = f_15_;
		((Quaternion) this).k = f_16_;
		((Quaternion) this).scalar = f_17_;
	}

	public void angle(float f, float f_19_, float f_20_, float f_21_) {
		float f_22_ = (float) Math.sin((double) (f_21_ * 0.5F));
		float f_23_ = (float) Math.cos((double) (f_21_ * 0.5F));
		((Quaternion) this).i = f * f_22_;
		((Quaternion) this).j = f_19_ * f_22_;
		((Quaternion) this).k = f_20_ * f_22_;
		((Quaternion) this).scalar = f_23_;
	}

	final void reset() {
		((Quaternion) this).k = 0.0F;
		((Quaternion) this).j = 0.0F;
		((Quaternion) this).i = 0.0F;
		((Quaternion) this).scalar = 1.0F;
	}

	final void negate() {
		((Quaternion) this).i = -((Quaternion) this).i;
		((Quaternion) this).j = -((Quaternion) this).j;
		((Quaternion) this).k = -((Quaternion) this).k;
	}

	static final Quaternion method6465(Quaternion class381) {
		Quaternion class381_26_ = method6457(class381);
		class381_26_.negate();
		return class381_26_;
	}

	public final void multiply(Quaternion class381_27_) {
		set(((((Quaternion) class381_27_).scalar * ((Quaternion) this).i) + (((Quaternion) class381_27_).i * ((Quaternion) this).scalar) + (((Quaternion) class381_27_).j * ((Quaternion) this).k) - (((Quaternion) class381_27_).k * ((Quaternion) this).j)),
				((((Quaternion) class381_27_).scalar * ((Quaternion) this).j) - (((Quaternion) class381_27_).i * ((Quaternion) this).k) + (((Quaternion) class381_27_).j * ((Quaternion) this).scalar) + (((Quaternion) class381_27_).k * ((Quaternion) this).i)),
				((((Quaternion) class381_27_).scalar * ((Quaternion) this).k) + (((Quaternion) class381_27_).i * ((Quaternion) this).j) - (((Quaternion) class381_27_).j * ((Quaternion) this).i) + (((Quaternion) class381_27_).k * ((Quaternion) this).scalar)),
				((((Quaternion) class381_27_).scalar * ((Quaternion) this).scalar) - (((Quaternion) class381_27_).i * ((Quaternion) this).i) - (((Quaternion) class381_27_).j * ((Quaternion) this).j) - (((Quaternion) class381_27_).k * ((Quaternion) this).k)));
	}

	public String toString() {
		return new StringBuilder().append(((Quaternion) this).i).append(",").append(((Quaternion) this).j).append(",").append(((Quaternion) this).k).append(",").append(((Quaternion) this).scalar).toString();
	}

	static {
		new Quaternion();
	}

	public void cache() {
		synchronized (aClass381Array4641) {
			if (anInt4639 < anInt4638 - 1)
				aClass381Array4641[anInt4639++] = this;
		}
	}
	
	public void romYawPitchRoll(float yaw, float pitch, float roll) {
		angle(0.0F, 1.0F, 0.0F, yaw);
		Quaternion class381_49_ = create();
		class381_49_.angle(1.0F, 0.0F, 0.0F, pitch);
		multiply(class381_49_);
		class381_49_.angle(0.0F, 0.0F, 1.0F, roll);
		multiply(class381_49_);
		class381_49_.cache();
	}

	static Quaternion method6485(float f, float f_54_, float f_55_, float f_56_) {
		synchronized (aClass381Array4641) {
			if (anInt4639 == 0) {
				Quaternion class381 = new Quaternion(f, f_54_, f_55_, f_56_);
				return class381;
			}
			aClass381Array4641[--anInt4639].set(f, f_54_, f_55_, f_56_);
			Quaternion class381 = aClass381Array4641[anInt4639];
			return class381;
		}
	}

	public void copy(Quaternion class381_65_) {
		((Quaternion) this).i = ((Quaternion) class381_65_).i;
		((Quaternion) this).j = ((Quaternion) class381_65_).j;
		((Quaternion) this).k = ((Quaternion) class381_65_).k;
		((Quaternion) this).scalar = ((Quaternion) class381_65_).scalar;
	}

	public static void method6493(int i) {
		anInt4638 = i;
		aClass381Array4641 = new Quaternion[i];
		anInt4639 = 0;
	}

	static final Quaternion method6497(Quaternion class381, Quaternion class381_74_) {
		Quaternion class381_75_ = method6457(class381);
		class381_75_.multiply(class381_74_);
		return class381_75_;
	}
}
