/* Class52_Sub1_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;

public class Class52_Sub1_Sub3_Sub2 extends Class52_Sub1_Sub3 {
	boolean aBoolean9978;
	Interface8_Impl1_Impl1_Impl1[] anInterface8_Impl1_Impl1_Impl1Array9979;
	int anInt9980;
	int anInt9981;
	int anInt9982;
	Class_ra_Sub3_Sub2 aClass_ra_Sub3_Sub2_9983;
	Interface8_Impl1_Impl2_Impl1 anInterface8_Impl1_Impl2_Impl1_9984 = null;
	static int anInt9985 = 16;

	boolean method576(long l) {
		return jagdx.a.f(IDirect3DDevice.SetDepthStencilSurface(((Class_ra_Sub3_Sub2) (((Class52_Sub1_Sub3_Sub2) this).aClass_ra_Sub3_Sub2_9983)).aLong9847, l));
	}

	public int method545() {
		return ((Class52_Sub1_Sub3_Sub2) this).anInt9980;
	}

	public int method552() {
		return ((Class52_Sub1_Sub3_Sub2) this).anInt9981;
	}

	public void method558(Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		Interface8_Impl1_Impl2_Impl1 interface8_impl1_impl2_impl1 = (Interface8_Impl1_Impl2_Impl1) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if (((Class52_Sub1_Sub3_Sub2) this).anInt9982 != 0) {
				if ((((Class52_Sub1_Sub3_Sub2) this).anInt9980 != interface8_impl1_impl2_impl1.a()) || (((Class52_Sub1_Sub3_Sub2) this).anInt9981 != interface8_impl1_impl2_impl1.f()))
					throw new RuntimeException();
			} else {
				((Class52_Sub1_Sub3_Sub2) this).anInt9981 = interface8_impl1_impl2_impl1.f();
				((Class52_Sub1_Sub3_Sub2) this).anInt9980 = interface8_impl1_impl2_impl1.a();
				method573();
			}
			((Class52_Sub1_Sub3_Sub2) this).anInt9982 |= 0x10;
			((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984 = interface8_impl1_impl2_impl1;
			if (((Class52_Sub1_Sub3_Sub2) this).aBoolean9978)
				method576(interface8_impl1_impl2_impl1.method144());
		} else {
			((Class52_Sub1_Sub3_Sub2) this).anInt9982 &= ~0x10;
			((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984 = null;
			if (((Class52_Sub1_Sub3_Sub2) this).aBoolean9978)
				method576(0L);
			if (((Class52_Sub1_Sub3_Sub2) this).anInt9982 == 0) {
				((Class52_Sub1_Sub3_Sub2) this).anInt9981 = 0;
				((Class52_Sub1_Sub3_Sub2) this).anInt9980 = 0;
			}
		}
	}

	public void method563(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		int i_0_ = 1 << i;
		Interface8_Impl1_Impl1_Impl1 interface8_impl1_impl1_impl1 = (Interface8_Impl1_Impl1_Impl1) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (((Class52_Sub1_Sub3_Sub2) this).anInt9982 != 0) {
				if ((((Class52_Sub1_Sub3_Sub2) this).anInt9980 != interface8_impl1_impl1_impl1.a()) || (((Class52_Sub1_Sub3_Sub2) this).anInt9981 != interface8_impl1_impl1_impl1.f()))
					throw new RuntimeException();
			} else {
				((Class52_Sub1_Sub3_Sub2) this).anInt9981 = interface8_impl1_impl1_impl1.f();
				((Class52_Sub1_Sub3_Sub2) this).anInt9980 = interface8_impl1_impl1_impl1.a();
				method573();
			}
			((Class52_Sub1_Sub3_Sub2) this).anInt9982 |= i_0_;
			((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i] = interface8_impl1_impl1_impl1;
			if (((Class52_Sub1_Sub3_Sub2) this).aBoolean9978)
				method578(i, interface8_impl1_impl1_impl1.method144());
		} else {
			((Class52_Sub1_Sub3_Sub2) this).anInt9982 &= i_0_ ^ 0xffffffff;
			((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i] = null;
			if (((Class52_Sub1_Sub3_Sub2) this).aBoolean9978)
				method578(i, 0L);
			if (((Class52_Sub1_Sub3_Sub2) this).anInt9982 == 0) {
				((Class52_Sub1_Sub3_Sub2) this).anInt9981 = 0;
				((Class52_Sub1_Sub3_Sub2) this).anInt9980 = 0;
			}
		}
	}

	public int method544() {
		return ((Class52_Sub1_Sub3_Sub2) this).anInt9981;
	}

	public boolean method560() {
		return ((((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[0]) != null);
	}

	boolean method546() {
		for (int i = 1; i < 4; i++) {
			Interface8_Impl1_Impl1_Impl1 interface8_impl1_impl1_impl1 = (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i]);
			if (interface8_impl1_impl1_impl1 != null)
				method578(i, 0L);
		}
		if (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984 != null)
			method576(0L);
		((Class52_Sub1_Sub3_Sub2) this).aBoolean9978 = false;
		return true;
	}

	public void method135() {
		if (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984 != null)
			((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984.b();
		for (int i = 0; i < (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979).length; i++) {
			if ((((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i]) != null)
				((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i].b();
		}
	}

	void method577() {
		if (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984 != null)
			((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984.method141();
		for (int i = 0; i < (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979).length; i++) {
			if ((((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i]) != null)
				((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i].method141();
		}
	}

	Class52_Sub1_Sub3_Sub2(Class_ra_Sub3_Sub2 class_ra_sub3_sub2) {
		super((Class_ra_Sub3) class_ra_sub3_sub2);
		((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979 = new Interface8_Impl1_Impl1_Impl1[4];
		((Class52_Sub1_Sub3_Sub2) this).aClass_ra_Sub3_Sub2_9983 = class_ra_sub3_sub2;
	}

	public void method561(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		int i_1_ = 1 << i;
		Interface8_Impl1_Impl1_Impl1 interface8_impl1_impl1_impl1 = (Interface8_Impl1_Impl1_Impl1) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (((Class52_Sub1_Sub3_Sub2) this).anInt9982 != 0) {
				if ((((Class52_Sub1_Sub3_Sub2) this).anInt9980 != interface8_impl1_impl1_impl1.a()) || (((Class52_Sub1_Sub3_Sub2) this).anInt9981 != interface8_impl1_impl1_impl1.f()))
					throw new RuntimeException();
			} else {
				((Class52_Sub1_Sub3_Sub2) this).anInt9981 = interface8_impl1_impl1_impl1.f();
				((Class52_Sub1_Sub3_Sub2) this).anInt9980 = interface8_impl1_impl1_impl1.a();
				method573();
			}
			((Class52_Sub1_Sub3_Sub2) this).anInt9982 |= i_1_;
			((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i] = interface8_impl1_impl1_impl1;
			if (((Class52_Sub1_Sub3_Sub2) this).aBoolean9978)
				method578(i, interface8_impl1_impl1_impl1.method144());
		} else {
			((Class52_Sub1_Sub3_Sub2) this).anInt9982 &= i_1_ ^ 0xffffffff;
			((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i] = null;
			if (((Class52_Sub1_Sub3_Sub2) this).aBoolean9978)
				method578(i, 0L);
			if (((Class52_Sub1_Sub3_Sub2) this).anInt9982 == 0) {
				((Class52_Sub1_Sub3_Sub2) this).anInt9981 = 0;
				((Class52_Sub1_Sub3_Sub2) this).anInt9980 = 0;
			}
		}
	}

	public void method564(Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		Interface8_Impl1_Impl2_Impl1 interface8_impl1_impl2_impl1 = (Interface8_Impl1_Impl2_Impl1) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if (((Class52_Sub1_Sub3_Sub2) this).anInt9982 != 0) {
				if ((((Class52_Sub1_Sub3_Sub2) this).anInt9980 != interface8_impl1_impl2_impl1.a()) || (((Class52_Sub1_Sub3_Sub2) this).anInt9981 != interface8_impl1_impl2_impl1.f()))
					throw new RuntimeException();
			} else {
				((Class52_Sub1_Sub3_Sub2) this).anInt9981 = interface8_impl1_impl2_impl1.f();
				((Class52_Sub1_Sub3_Sub2) this).anInt9980 = interface8_impl1_impl2_impl1.a();
				method573();
			}
			((Class52_Sub1_Sub3_Sub2) this).anInt9982 |= 0x10;
			((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984 = interface8_impl1_impl2_impl1;
			if (((Class52_Sub1_Sub3_Sub2) this).aBoolean9978)
				method576(interface8_impl1_impl2_impl1.method144());
		} else {
			((Class52_Sub1_Sub3_Sub2) this).anInt9982 &= ~0x10;
			((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984 = null;
			if (((Class52_Sub1_Sub3_Sub2) this).aBoolean9978)
				method576(0L);
			if (((Class52_Sub1_Sub3_Sub2) this).anInt9982 == 0) {
				((Class52_Sub1_Sub3_Sub2) this).anInt9981 = 0;
				((Class52_Sub1_Sub3_Sub2) this).anInt9980 = 0;
			}
		}
	}

	public boolean method557() {
		return ((((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[0]) != null);
	}

	public void method562(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		int i_2_ = 1 << i;
		Interface8_Impl1_Impl1_Impl1 interface8_impl1_impl1_impl1 = (Interface8_Impl1_Impl1_Impl1) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (((Class52_Sub1_Sub3_Sub2) this).anInt9982 != 0) {
				if ((((Class52_Sub1_Sub3_Sub2) this).anInt9980 != interface8_impl1_impl1_impl1.a()) || (((Class52_Sub1_Sub3_Sub2) this).anInt9981 != interface8_impl1_impl1_impl1.f()))
					throw new RuntimeException();
			} else {
				((Class52_Sub1_Sub3_Sub2) this).anInt9981 = interface8_impl1_impl1_impl1.f();
				((Class52_Sub1_Sub3_Sub2) this).anInt9980 = interface8_impl1_impl1_impl1.a();
				method573();
			}
			((Class52_Sub1_Sub3_Sub2) this).anInt9982 |= i_2_;
			((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i] = interface8_impl1_impl1_impl1;
			if (((Class52_Sub1_Sub3_Sub2) this).aBoolean9978)
				method578(i, interface8_impl1_impl1_impl1.method144());
		} else {
			((Class52_Sub1_Sub3_Sub2) this).anInt9982 &= i_2_ ^ 0xffffffff;
			((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i] = null;
			if (((Class52_Sub1_Sub3_Sub2) this).aBoolean9978)
				method578(i, 0L);
			if (((Class52_Sub1_Sub3_Sub2) this).anInt9982 == 0) {
				((Class52_Sub1_Sub3_Sub2) this).anInt9981 = 0;
				((Class52_Sub1_Sub3_Sub2) this).anInt9980 = 0;
			}
		}
	}

	public boolean method565() {
		return ((((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[0]) != null);
	}

	public boolean method559() {
		return ((((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[0]) != null);
	}

	public void method137() {
		if (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984 != null)
			((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984.b();
		for (int i = 0; i < (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979).length; i++) {
			if ((((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i]) != null)
				((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i].b();
		}
	}

	public void method138() {
		if (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984 != null)
			((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984.b();
		for (int i = 0; i < (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979).length; i++) {
			if ((((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i]) != null)
				((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i].b();
		}
	}

	public int method549() {
		return ((Class52_Sub1_Sub3_Sub2) this).anInt9980;
	}

	public int method550() {
		return ((Class52_Sub1_Sub3_Sub2) this).anInt9980;
	}

	public int method551() {
		return ((Class52_Sub1_Sub3_Sub2) this).anInt9980;
	}

	public int method547() {
		return ((Class52_Sub1_Sub3_Sub2) this).anInt9980;
	}

	boolean method578(int i, long l) {
		return jagdx.a.f(IDirect3DDevice.SetRenderTarget(((Class_ra_Sub3_Sub2) (((Class52_Sub1_Sub3_Sub2) this).aClass_ra_Sub3_Sub2_9983)).aLong9847, i, l));
	}

	boolean method134() {
		for (int i = 0; i < 4; i++) {
			Interface8_Impl1_Impl1_Impl1 interface8_impl1_impl1_impl1 = (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i]);
			if (interface8_impl1_impl1_impl1 != null) {
				long l = interface8_impl1_impl1_impl1.method144();
				method578(i, l);
			}
		}
		if (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984 != null)
			method576(((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984.method144());
		((Class52_Sub1_Sub3_Sub2) this).aBoolean9978 = true;
		return super.method136();
	}

	boolean method136() {
		for (int i = 0; i < 4; i++) {
			Interface8_Impl1_Impl1_Impl1 interface8_impl1_impl1_impl1 = (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i]);
			if (interface8_impl1_impl1_impl1 != null) {
				long l = interface8_impl1_impl1_impl1.method144();
				method578(i, l);
			}
		}
		if (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984 != null)
			method576(((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984.method144());
		((Class52_Sub1_Sub3_Sub2) this).aBoolean9978 = true;
		return super.method136();
	}

	boolean method548() {
		for (int i = 1; i < 4; i++) {
			Interface8_Impl1_Impl1_Impl1 interface8_impl1_impl1_impl1 = (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl1_Impl1Array9979[i]);
			if (interface8_impl1_impl1_impl1 != null)
				method578(i, 0L);
		}
		if (((Class52_Sub1_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_9984 != null)
			method576(0L);
		((Class52_Sub1_Sub3_Sub2) this).aBoolean9978 = false;
		return true;
	}
}
