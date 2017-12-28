
/* Class307 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class307 implements Interface34 {
	int anInt3606;
	Class76 aClass76_3607;
	Class505_Sub2_Sub2 aClass505_Sub2_Sub2_3608;
	int anInt3609;
	long aLong3610;

	void method5460() {
		method184();
	}

	public int method1() {
		return ((Class307) this).anInt3606;
	}

	public int method74() {
		return ((Class307) this).anInt3609;
	}

	public long method2() {
		return ((Class307) this).aLong3610;
	}

	public void method26() {
		if (((Class307) this).aLong3610 != 0L) {
			IUnknown.Release(((Class307) this).aLong3610);
			((Class307) this).aLong3610 = 0L;
		}
		((Class307) this).aClass505_Sub2_Sub2_3608.method13885(this);
	}

	public void finalize() {
		method184();
	}

	Class307(Class505_Sub2_Sub2 class505_sub2_sub2, Class76 class76, int i, int i_0_) {
		((Class307) this).aClass505_Sub2_Sub2_3608 = class505_sub2_sub2;
		((Class307) this).anInt3606 = i;
		((Class307) this).anInt3609 = i_0_;
		((Class307) this).aClass76_3607 = class76;
		((Class307) this).aLong3610 = (IDirect3DDevice.CreateDepthStencilSurface(((Class505_Sub2_Sub2) ((Class307) this).aClass505_Sub2_Sub2_3608).aLong10252, i, i_0_, Class505_Sub2_Sub2.method15653(((Class307) this).aClass76_3607), 0, 0, false));
		((Class307) this).aClass505_Sub2_Sub2_3608.method13901(this);
	}

	public int method75() {
		return ((Class307) this).anInt3606;
	}

	public int method39() {
		return ((Class307) this).anInt3609;
	}

	public void method185() {
		if (((Class307) this).aLong3610 != 0L) {
			((Class307) this).aClass505_Sub2_Sub2_3608.method15650(((Class307) this).aLong3610);
			((Class307) this).aLong3610 = 0L;
		}
	}

	public int method73() {
		return ((Class307) this).anInt3609;
	}

	public int method77() {
		return ((Class307) this).anInt3609;
	}

	public void method32() {
		if (((Class307) this).aLong3610 != 0L) {
			IUnknown.Release(((Class307) this).aLong3610);
			((Class307) this).aLong3610 = 0L;
		}
		((Class307) this).aClass505_Sub2_Sub2_3608.method13885(this);
	}

	void method5461() {
		method184();
	}

	public void method184() {
		if (((Class307) this).aLong3610 != 0L) {
			((Class307) this).aClass505_Sub2_Sub2_3608.method15650(((Class307) this).aLong3610);
			((Class307) this).aLong3610 = 0L;
		}
	}

	public int method76() {
		return ((Class307) this).anInt3606;
	}

	public long method123() {
		return ((Class307) this).aLong3610;
	}
}
