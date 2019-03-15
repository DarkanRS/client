public final class Quaternion {

	static Quaternion[] aClass381Array4641 = new Quaternion[0];
	static int anInt4639;
	float i;
	float j;
	float k;
	float scalar;
	static int anInt4638;

	static {
		new Quaternion();
	}

	public static Quaternion create() {
		Quaternion[] arr_0 = aClass381Array4641;
		synchronized (aClass381Array4641) {
			Quaternion quaternion_1;
			if (anInt4639 == 0) {
				quaternion_1 = new Quaternion();
				return quaternion_1;
			} else {
				aClass381Array4641[--anInt4639].reset();
				quaternion_1 = aClass381Array4641[anInt4639];
				return quaternion_1;
			}
		}
	}

	static Quaternion method6457(Quaternion quaternion_0) {
		Quaternion[] arr_1 = aClass381Array4641;
		synchronized (aClass381Array4641) {
			Quaternion quaternion_2;
			if (anInt4639 == 0) {
				quaternion_2 = new Quaternion(quaternion_0);
				return quaternion_2;
			} else {
				aClass381Array4641[--anInt4639].copy(quaternion_0);
				quaternion_2 = aClass381Array4641[anInt4639];
				return quaternion_2;
			}
		}
	}

	public Quaternion() {
		this.reset();
	}

	Quaternion(float f_1, float f_2, float f_3, float f_4) {
		this.set(f_1, f_2, f_3, f_4);
	}

	Quaternion(Quaternion quaternion_1) {
		this.copy(quaternion_1);
	}

	void set(float f_1, float f_2, float f_3, float f_4) {
		this.i = f_1;
		this.j = f_2;
		this.k = f_3;
		this.scalar = f_4;
	}

	public void angle(float f_1, float f_2, float f_3, float f_4) {
		float f_5 = (float) Math.sin((double) (f_4 * 0.5F));
		float f_6 = (float) Math.cos((double) (f_4 * 0.5F));
		this.i = f_1 * f_5;
		this.j = f_2 * f_5;
		this.k = f_3 * f_5;
		this.scalar = f_6;
	}

	final void reset() {
		this.k = 0.0F;
		this.j = 0.0F;
		this.i = 0.0F;
		this.scalar = 1.0F;
	}

	final void negate() {
		this.i = -this.i;
		this.j = -this.j;
		this.k = -this.k;
	}

	static final Quaternion method6465(Quaternion quaternion_0) {
		Quaternion quaternion_1 = method6457(quaternion_0);
		quaternion_1.negate();
		return quaternion_1;
	}

	public final void multiply(Quaternion quaternion_1) {
		this.set(quaternion_1.scalar * this.i + quaternion_1.i * this.scalar + quaternion_1.j * this.k - quaternion_1.k * this.j, quaternion_1.scalar * this.j - quaternion_1.i * this.k + quaternion_1.j * this.scalar + quaternion_1.k * this.i, quaternion_1.scalar * this.k + quaternion_1.i * this.j - quaternion_1.j * this.i + quaternion_1.k * this.scalar, quaternion_1.scalar * this.scalar - quaternion_1.i * this.i - quaternion_1.j * this.j - quaternion_1.k * this.k);
	}

	public String toString() {
		return this.i + "," + this.j + "," + this.k + "," + this.scalar;
	}

	public void cache() {
		Quaternion[] arr_1 = aClass381Array4641;
		synchronized (aClass381Array4641) {
			if (anInt4639 < anInt4638 - 1) {
				aClass381Array4641[anInt4639++] = this;
			}

		}
	}

	public void romYawPitchRoll(float f_1, float f_2, float f_3) {
		this.angle(0.0F, 1.0F, 0.0F, f_1);
		Quaternion quaternion_4 = create();
		quaternion_4.angle(1.0F, 0.0F, 0.0F, f_2);
		this.multiply(quaternion_4);
		quaternion_4.angle(0.0F, 0.0F, 1.0F, f_3);
		this.multiply(quaternion_4);
		quaternion_4.cache();
	}

	static Quaternion method6485(float f_0, float f_1, float f_2) {
		Quaternion[] arr_4 = aClass381Array4641;
		synchronized (aClass381Array4641) {
			Quaternion quaternion_5;
			if (anInt4639 == 0) {
				quaternion_5 = new Quaternion(f_0, f_1, f_2, (float) 0.0);
				return quaternion_5;
			} else {
				aClass381Array4641[--anInt4639].set(f_0, f_1, f_2, (float) 0.0);
				quaternion_5 = aClass381Array4641[anInt4639];
				return quaternion_5;
			}
		}
	}

	public void copy(Quaternion quaternion_1) {
		this.i = quaternion_1.i;
		this.j = quaternion_1.j;
		this.k = quaternion_1.k;
		this.scalar = quaternion_1.scalar;
	}

	public static void method6493() {
		anInt4638 = 10;
		aClass381Array4641 = new Quaternion[10];
		anInt4639 = 0;
	}

	static final Quaternion method6497(Quaternion quaternion_0, Quaternion quaternion_1) {
		Quaternion quaternion_2 = method6457(quaternion_0);
		quaternion_2.multiply(quaternion_1);
		return quaternion_2;
	}

}
