/* Class199 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class199 implements Interface8_Impl1_Impl2_Impl1 {
	int anInt10169;
	Class77 aClass77_10170;
	int anInt10171;
	Class_ra_Sub3_Sub2 aClass_ra_Sub3_Sub2_10172;
	long aLong10173;

	public int f() {
		return ((Class199) this).anInt10169;
	}

	public int a() {
		return ((Class199) this).anInt10171;
	}

	public long method144() {
		return ((Class199) this).aLong10173;
	}

	public void b() {
		if (((Class199) this).aLong10173 != 0L) {
			IUnknown.Release(((Class199) this).aLong10173);
			((Class199) this).aLong10173 = 0L;
		}
		((Class199) this).aClass_ra_Sub3_Sub2_10172.method5293(this);
	}

	public void method141() {
		if (((Class199) this).aLong10173 != 0L) {
			((Class199) this).aClass_ra_Sub3_Sub2_10172.method5552(((Class199) this).aLong10173);
			((Class199) this).aLong10173 = 0L;
		}
	}

	public void x() {
		if (((Class199) this).aLong10173 != 0L) {
			IUnknown.Release(((Class199) this).aLong10173);
			((Class199) this).aLong10173 = 0L;
		}
		((Class199) this).aClass_ra_Sub3_Sub2_10172.method5293(this);
	}

	public void method142() {
		if (((Class199) this).aLong10173 != 0L) {
			((Class199) this).aClass_ra_Sub3_Sub2_10172.method5552(((Class199) this).aLong10173);
			((Class199) this).aLong10173 = 0L;
		}
	}

	public int i() {
		return ((Class199) this).anInt10171;
	}

	public int k() {
		return ((Class199) this).anInt10169;
	}

	Class199(Class_ra_Sub3_Sub2 class_ra_sub3_sub2, Class77 class77, int i, int i_0_) {
		((Class199) this).aClass_ra_Sub3_Sub2_10172 = class_ra_sub3_sub2;
		((Class199) this).anInt10171 = i;
		((Class199) this).anInt10169 = i_0_;
		((Class199) this).aClass77_10170 = class77;
		((Class199) this).aLong10173 = (IDirect3DDevice.CreateDepthStencilSurface(((Class_ra_Sub3_Sub2) ((Class199) this).aClass_ra_Sub3_Sub2_10172).aLong9847, i, i_0_, Class_ra_Sub3_Sub2.method5550(((Class199) this).aClass77_10170), 0, 0, false));
		((Class199) this).aClass_ra_Sub3_Sub2_10172.method5323(this);
	}

	public void d() {
		if (((Class199) this).aLong10173 != 0L) {
			IUnknown.Release(((Class199) this).aLong10173);
			((Class199) this).aLong10173 = 0L;
		}
		((Class199) this).aClass_ra_Sub3_Sub2_10172.method5293(this);
	}

	public long method147() {
		return ((Class199) this).aLong10173;
	}

	public long method145() {
		return ((Class199) this).aLong10173;
	}

	public int p() {
		return ((Class199) this).anInt10171;
	}

	public void method146() {
		if (((Class199) this).aLong10173 != 0L) {
			((Class199) this).aClass_ra_Sub3_Sub2_10172.method5552(((Class199) this).aLong10173);
			((Class199) this).aLong10173 = 0L;
		}
	}

	public void method143() {
		if (((Class199) this).aLong10173 != 0L) {
			((Class199) this).aClass_ra_Sub3_Sub2_10172.method5552(((Class199) this).aLong10173);
			((Class199) this).aLong10173 = 0L;
		}
	}

	public void u() {
		if (((Class199) this).aLong10173 != 0L) {
			IUnknown.Release(((Class199) this).aLong10173);
			((Class199) this).aLong10173 = 0L;
		}
		((Class199) this).aClass_ra_Sub3_Sub2_10172.method5293(this);
	}

	public void method148() {
		if (((Class199) this).aLong10173 != 0L) {
			((Class199) this).aClass_ra_Sub3_Sub2_10172.method5552(((Class199) this).aLong10173);
			((Class199) this).aLong10173 = 0L;
		}
	}
}
