/* Class52_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public abstract class Class52_Sub2_Sub1 extends Class52_Sub2 {
	Canvas aCanvas9072;
	Class_ra_Sub1 aClass_ra_Sub1_9073;
	int anInt9074;
	int anInt9075;
	int[] anIntArray9076;
	float[] aFloatArray9077;
	boolean aBoolean9078;
	public static Canvas aCanvas9079;

	final boolean method546() {
		try {
			((Class52_Sub2_Sub1) this).aBoolean9078 = false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afi.i(").append(')').toString());
		}
	}

	void method591(int i) {
		try {
			((Class52_Sub2_Sub1) this).anIntArray9076 = new int[(2061776189 * ((Class52_Sub2_Sub1) this).anInt9075 * (1038713159 * ((Class52_Sub2_Sub1) this).anInt9074))];
			((Class52_Sub2_Sub1) this).aFloatArray9077 = new float[(2061776189 * ((Class52_Sub2_Sub1) this).anInt9075 * (1038713159 * ((Class52_Sub2_Sub1) this).anInt9074))];
			if (((Class52_Sub2_Sub1) this).aBoolean9078)
				((Class52_Sub2_Sub1) this).aClass_ra_Sub1_9073.method5207(1038713159 * ((Class52_Sub2_Sub1) this).anInt9074, 2061776189 * ((Class52_Sub2_Sub1) this).anInt9075, ((Class52_Sub2_Sub1) this).anIntArray9076, ((Class52_Sub2_Sub1) this).aFloatArray9077);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afi.z(").append(')').toString());
		}
	}

	Class52_Sub2_Sub1(Class_ra_Sub1 class_ra_sub1, Canvas canvas, int i, int i_0_) {
		((Class52_Sub2_Sub1) this).aCanvas9072 = canvas;
		((Class52_Sub2_Sub1) this).aClass_ra_Sub1_9073 = class_ra_sub1;
		((Class52_Sub2_Sub1) this).anInt9074 = -1172842377 * i;
		((Class52_Sub2_Sub1) this).anInt9075 = -374060523 * i_0_;
	}

	public int method547() {
		return ((Class52_Sub2_Sub1) this).anInt9074 * 1038713159;
	}

	final boolean method136() {
		try {
			((Class52_Sub2_Sub1) this).aClass_ra_Sub1_9073.method5207(1038713159 * ((Class52_Sub2_Sub1) this).anInt9074, 2061776189 * ((Class52_Sub2_Sub1) this).anInt9075, ((Class52_Sub2_Sub1) this).anIntArray9076, ((Class52_Sub2_Sub1) this).aFloatArray9077);
			((Class52_Sub2_Sub1) this).aBoolean9078 = true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afi.p(").append(')').toString());
		}
	}

	public int method552() {
		try {
			return 2061776189 * ((Class52_Sub2_Sub1) this).anInt9075;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afi.f(").append(')').toString());
		}
	}

	public int method544() {
		return 2061776189 * ((Class52_Sub2_Sub1) this).anInt9075;
	}

	final boolean method134() {
		((Class52_Sub2_Sub1) this).aClass_ra_Sub1_9073.method5207(1038713159 * ((Class52_Sub2_Sub1) this).anInt9074, 2061776189 * ((Class52_Sub2_Sub1) this).anInt9075, ((Class52_Sub2_Sub1) this).anIntArray9076, ((Class52_Sub2_Sub1) this).aFloatArray9077);
		((Class52_Sub2_Sub1) this).aBoolean9078 = true;
		return true;
	}

	final boolean method548() {
		((Class52_Sub2_Sub1) this).aBoolean9078 = false;
		return true;
	}

	final void method582(int i, int i_1_) {
		try {
			if (i != 1038713159 * ((Class52_Sub2_Sub1) this).anInt9074 || 2061776189 * ((Class52_Sub2_Sub1) this).anInt9075 != i_1_) {
				((Class52_Sub2_Sub1) this).anInt9074 = -1172842377 * i;
				((Class52_Sub2_Sub1) this).anInt9075 = -374060523 * i_1_;
				method591(251162115);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afi.e(").append(')').toString());
		}
	}

	final void method583(int i, int i_2_) {
		if (i != 1038713159 * ((Class52_Sub2_Sub1) this).anInt9074 || 2061776189 * ((Class52_Sub2_Sub1) this).anInt9075 != i_2_) {
			((Class52_Sub2_Sub1) this).anInt9074 = -1172842377 * i;
			((Class52_Sub2_Sub1) this).anInt9075 = -374060523 * i_2_;
			method591(251162115);
		}
	}

	public int method549() {
		return ((Class52_Sub2_Sub1) this).anInt9074 * 1038713159;
	}

	public int method545() {
		try {
			return ((Class52_Sub2_Sub1) this).anInt9074 * 1038713159;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("afi.a(").append(')').toString());
		}
	}

	public int method551() {
		return ((Class52_Sub2_Sub1) this).anInt9074 * 1038713159;
	}

	public int method550() {
		return ((Class52_Sub2_Sub1) this).anInt9074 * 1038713159;
	}
}
