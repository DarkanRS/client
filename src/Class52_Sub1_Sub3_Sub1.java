/* Class52_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class52_Sub1_Sub3_Sub1 extends Class52_Sub1_Sub3 {
	int anInt9969;
	Class_ra_Sub3_Sub1 aClass_ra_Sub3_Sub1_9970;
	static int anInt9971 = 16;
	int anInt9972;
	int anInt9973;
	int anInt9974;
	Interface8_Impl1_Impl1_Impl3 anInterface8_Impl1_Impl1_Impl3_9975;
	int anInt9976;
	Interface8_Impl1_Impl1_Impl3[] anInterface8_Impl1_Impl1_Impl3Array9977 = new Interface8_Impl1_Impl1_Impl3[4];

	public boolean method560() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public int method545() {
		return ((Class52_Sub1_Sub3_Sub1) this).anInt9976;
	}

	public int method552() {
		return ((Class52_Sub1_Sub3_Sub1) this).anInt9973;
	}

	public void method563(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		int i_0_ = 1 << i;
		Interface8_Impl1_Impl1_Impl3 interface8_impl1_impl1_impl3 = (Interface8_Impl1_Impl1_Impl3) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (((Class52_Sub1_Sub3_Sub1) this).anInt9972 != 0) {
				if ((((Class52_Sub1_Sub3_Sub1) this).anInt9976 != interface8_impl1_impl1_impl3.a()) || (((Class52_Sub1_Sub3_Sub1) this).anInt9973 != interface8_impl1_impl1_impl3.f()))
					throw new RuntimeException();
			} else {
				((Class52_Sub1_Sub3_Sub1) this).anInt9973 = interface8_impl1_impl1_impl3.f();
				((Class52_Sub1_Sub3_Sub1) this).anInt9976 = interface8_impl1_impl1_impl3.a();
				method573();
			}
			((Class52_Sub1_Sub3_Sub1) this).anInt9972 |= i_0_;
			((Class52_Sub1_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl3Array9977[i] = interface8_impl1_impl1_impl3;
		} else {
			((Class52_Sub1_Sub3_Sub1) this).anInt9972 &= i_0_ ^ 0xffffffff;
			((Class52_Sub1_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl3Array9977[i] = null;
			if (((Class52_Sub1_Sub3_Sub1) this).anInt9972 == 0) {
				((Class52_Sub1_Sub3_Sub1) this).anInt9973 = 0;
				((Class52_Sub1_Sub3_Sub1) this).anInt9976 = 0;
			}
		}
		if (this == ((Class52_Sub1_Sub3_Sub1) this).aClass_ra_Sub3_Sub1_9970.method4992((short) -4810))
			method575(i);
		else
			((Class52_Sub1_Sub3_Sub1) this).anInt9969 |= i_0_;
	}

	void method574() {
		if (((Class52_Sub1_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl3_9975 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class52_Sub1_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl3_9975.method167(36096);
	}

	public void method138() {
		if (((Class52_Sub1_Sub3_Sub1) this).anInt9974 != 0) {
			((Class52_Sub1_Sub3_Sub1) this).aClass_ra_Sub3_Sub1_9970.method5528(((Class52_Sub1_Sub3_Sub1) this).anInt9974);
			((Class52_Sub1_Sub3_Sub1) this).anInt9974 = 0;
		}
	}

	Class52_Sub1_Sub3_Sub1(Class_ra_Sub3_Sub1 class_ra_sub3_sub1) {
		super((Class_ra_Sub3) class_ra_sub3_sub1);
		((Class52_Sub1_Sub3_Sub1) this).aClass_ra_Sub3_Sub1_9970 = class_ra_sub3_sub1;
		int[] is = new int[1];
		OpenGL.glGenFramebuffersEXT(1, is, 0);
		((Class52_Sub1_Sub3_Sub1) this).anInt9974 = is[0];
	}

	public void method135() {
		if (((Class52_Sub1_Sub3_Sub1) this).anInt9974 != 0) {
			((Class52_Sub1_Sub3_Sub1) this).aClass_ra_Sub3_Sub1_9970.method5528(((Class52_Sub1_Sub3_Sub1) this).anInt9974);
			((Class52_Sub1_Sub3_Sub1) this).anInt9974 = 0;
		}
	}

	boolean method136() {
		OpenGL.glBindFramebufferEXT(36160, ((Class52_Sub1_Sub3_Sub1) this).anInt9974);
		for (int i = 0; i < 4; i++) {
			if ((((Class52_Sub1_Sub3_Sub1) this).anInt9969 & 1 << i) != 0)
				method575(i);
		}
		if ((((Class52_Sub1_Sub3_Sub1) this).anInt9969 & 0x10) != 0)
			method574();
		((Class52_Sub1_Sub3_Sub1) this).anInt9969 = 0;
		return super.method136();
	}

	boolean method546() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public int method549() {
		return ((Class52_Sub1_Sub3_Sub1) this).anInt9976;
	}

	void method575(int i) {
		Interface8_Impl1_Impl1_Impl3 interface8_impl1_impl1_impl3 = (((Class52_Sub1_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl3Array9977[i]);
		if (interface8_impl1_impl1_impl3 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface8_impl1_impl1_impl3.method167(36064 + i);
	}

	public int method544() {
		return ((Class52_Sub1_Sub3_Sub1) this).anInt9973;
	}

	public void method561(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		int i_1_ = 1 << i;
		Interface8_Impl1_Impl1_Impl3 interface8_impl1_impl1_impl3 = (Interface8_Impl1_Impl1_Impl3) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (((Class52_Sub1_Sub3_Sub1) this).anInt9972 != 0) {
				if ((((Class52_Sub1_Sub3_Sub1) this).anInt9976 != interface8_impl1_impl1_impl3.a()) || (((Class52_Sub1_Sub3_Sub1) this).anInt9973 != interface8_impl1_impl1_impl3.f()))
					throw new RuntimeException();
			} else {
				((Class52_Sub1_Sub3_Sub1) this).anInt9973 = interface8_impl1_impl1_impl3.f();
				((Class52_Sub1_Sub3_Sub1) this).anInt9976 = interface8_impl1_impl1_impl3.a();
				method573();
			}
			((Class52_Sub1_Sub3_Sub1) this).anInt9972 |= i_1_;
			((Class52_Sub1_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl3Array9977[i] = interface8_impl1_impl1_impl3;
		} else {
			((Class52_Sub1_Sub3_Sub1) this).anInt9972 &= i_1_ ^ 0xffffffff;
			((Class52_Sub1_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl3Array9977[i] = null;
			if (((Class52_Sub1_Sub3_Sub1) this).anInt9972 == 0) {
				((Class52_Sub1_Sub3_Sub1) this).anInt9973 = 0;
				((Class52_Sub1_Sub3_Sub1) this).anInt9976 = 0;
			}
		}
		if (this == ((Class52_Sub1_Sub3_Sub1) this).aClass_ra_Sub3_Sub1_9970.method4992((short) -5292))
			method575(i);
		else
			((Class52_Sub1_Sub3_Sub1) this).anInt9969 |= i_1_;
	}

	public void method562(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		int i_2_ = 1 << i;
		Interface8_Impl1_Impl1_Impl3 interface8_impl1_impl1_impl3 = (Interface8_Impl1_Impl1_Impl3) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (((Class52_Sub1_Sub3_Sub1) this).anInt9972 != 0) {
				if ((((Class52_Sub1_Sub3_Sub1) this).anInt9976 != interface8_impl1_impl1_impl3.a()) || (((Class52_Sub1_Sub3_Sub1) this).anInt9973 != interface8_impl1_impl1_impl3.f()))
					throw new RuntimeException();
			} else {
				((Class52_Sub1_Sub3_Sub1) this).anInt9973 = interface8_impl1_impl1_impl3.f();
				((Class52_Sub1_Sub3_Sub1) this).anInt9976 = interface8_impl1_impl1_impl3.a();
				method573();
			}
			((Class52_Sub1_Sub3_Sub1) this).anInt9972 |= i_2_;
			((Class52_Sub1_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl3Array9977[i] = interface8_impl1_impl1_impl3;
		} else {
			((Class52_Sub1_Sub3_Sub1) this).anInt9972 &= i_2_ ^ 0xffffffff;
			((Class52_Sub1_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl3Array9977[i] = null;
			if (((Class52_Sub1_Sub3_Sub1) this).anInt9972 == 0) {
				((Class52_Sub1_Sub3_Sub1) this).anInt9973 = 0;
				((Class52_Sub1_Sub3_Sub1) this).anInt9976 = 0;
			}
		}
		if (this == ((Class52_Sub1_Sub3_Sub1) this).aClass_ra_Sub3_Sub1_9970.method4992((short) 4564))
			method575(i);
		else
			((Class52_Sub1_Sub3_Sub1) this).anInt9969 |= i_2_;
	}

	public void method564(Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		Interface8_Impl1_Impl1_Impl3 interface8_impl1_impl1_impl3 = (Interface8_Impl1_Impl1_Impl3) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if (((Class52_Sub1_Sub3_Sub1) this).anInt9972 != 0) {
				if ((((Class52_Sub1_Sub3_Sub1) this).anInt9976 != interface8_impl1_impl1_impl3.a()) || (((Class52_Sub1_Sub3_Sub1) this).anInt9973 != interface8_impl1_impl1_impl3.f()))
					throw new RuntimeException();
			} else {
				((Class52_Sub1_Sub3_Sub1) this).anInt9973 = interface8_impl1_impl1_impl3.f();
				((Class52_Sub1_Sub3_Sub1) this).anInt9976 = interface8_impl1_impl1_impl3.a();
				method573();
			}
			((Class52_Sub1_Sub3_Sub1) this).anInt9972 |= 0x10;
			((Class52_Sub1_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl3_9975 = interface8_impl1_impl1_impl3;
		} else {
			((Class52_Sub1_Sub3_Sub1) this).anInt9972 &= ~0x10;
			((Class52_Sub1_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl3_9975 = null;
			if (((Class52_Sub1_Sub3_Sub1) this).anInt9972 == 0) {
				((Class52_Sub1_Sub3_Sub1) this).anInt9973 = 0;
				((Class52_Sub1_Sub3_Sub1) this).anInt9976 = 0;
			}
		}
		if (this == ((Class52_Sub1_Sub3_Sub1) this).aClass_ra_Sub3_Sub1_9970.method4992((short) 18572))
			method574();
		else
			((Class52_Sub1_Sub3_Sub1) this).anInt9969 |= 0x10;
	}

	public boolean method557() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public boolean method559() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	boolean method134() {
		OpenGL.glBindFramebufferEXT(36160, ((Class52_Sub1_Sub3_Sub1) this).anInt9974);
		for (int i = 0; i < 4; i++) {
			if ((((Class52_Sub1_Sub3_Sub1) this).anInt9969 & 1 << i) != 0)
				method575(i);
		}
		if ((((Class52_Sub1_Sub3_Sub1) this).anInt9969 & 0x10) != 0)
			method574();
		((Class52_Sub1_Sub3_Sub1) this).anInt9969 = 0;
		return super.method136();
	}

	boolean method548() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method137() {
		if (((Class52_Sub1_Sub3_Sub1) this).anInt9974 != 0) {
			((Class52_Sub1_Sub3_Sub1) this).aClass_ra_Sub3_Sub1_9970.method5528(((Class52_Sub1_Sub3_Sub1) this).anInt9974);
			((Class52_Sub1_Sub3_Sub1) this).anInt9974 = 0;
		}
	}

	public void method558(Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		Interface8_Impl1_Impl1_Impl3 interface8_impl1_impl1_impl3 = (Interface8_Impl1_Impl1_Impl3) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if (((Class52_Sub1_Sub3_Sub1) this).anInt9972 != 0) {
				if ((((Class52_Sub1_Sub3_Sub1) this).anInt9976 != interface8_impl1_impl1_impl3.a()) || (((Class52_Sub1_Sub3_Sub1) this).anInt9973 != interface8_impl1_impl1_impl3.f()))
					throw new RuntimeException();
			} else {
				((Class52_Sub1_Sub3_Sub1) this).anInt9973 = interface8_impl1_impl1_impl3.f();
				((Class52_Sub1_Sub3_Sub1) this).anInt9976 = interface8_impl1_impl1_impl3.a();
				method573();
			}
			((Class52_Sub1_Sub3_Sub1) this).anInt9972 |= 0x10;
			((Class52_Sub1_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl3_9975 = interface8_impl1_impl1_impl3;
		} else {
			((Class52_Sub1_Sub3_Sub1) this).anInt9972 &= ~0x10;
			((Class52_Sub1_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl3_9975 = null;
			if (((Class52_Sub1_Sub3_Sub1) this).anInt9972 == 0) {
				((Class52_Sub1_Sub3_Sub1) this).anInt9973 = 0;
				((Class52_Sub1_Sub3_Sub1) this).anInt9976 = 0;
			}
		}
		if (this == ((Class52_Sub1_Sub3_Sub1) this).aClass_ra_Sub3_Sub1_9970.method4992((short) -4671))
			method574();
		else
			((Class52_Sub1_Sub3_Sub1) this).anInt9969 |= 0x10;
	}

	public int method550() {
		return ((Class52_Sub1_Sub3_Sub1) this).anInt9976;
	}

	public int method551() {
		return ((Class52_Sub1_Sub3_Sub1) this).anInt9976;
	}

	public int method547() {
		return ((Class52_Sub1_Sub3_Sub1) this).anInt9976;
	}

	public boolean method565() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}
}
