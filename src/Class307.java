import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class307 implements Interface34 {

	long aLong3610;
	Class505_Sub2_Sub2 aClass505_Sub2_Sub2_3608;
	int anInt3606;
	int anInt3609;
	Class76 aClass76_3607;

	public int method1() {
		return this.anInt3606;
	}

	public int method74() {
		return this.anInt3609;
	}

	public long method2() {
		return this.aLong3610;
	}

	public void method26() {
		if (this.aLong3610 != 0L) {
			IUnknown.Release(this.aLong3610);
			this.aLong3610 = 0L;
		}

		this.aClass505_Sub2_Sub2_3608.method13885(this);
	}

	public void finalize() {
		this.method184();
	}

	Class307(Class505_Sub2_Sub2 class505_sub2_sub2_1, Class76 class76_2, int i_3, int i_4) {
		this.aClass505_Sub2_Sub2_3608 = class505_sub2_sub2_1;
		this.anInt3606 = i_3;
		this.anInt3609 = i_4;
		this.aClass76_3607 = class76_2;
		this.aLong3610 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass505_Sub2_Sub2_3608.aLong10252, i_3, i_4, Class505_Sub2_Sub2.method15653(this.aClass76_3607), 0, 0, false);
		this.aClass505_Sub2_Sub2_3608.method13901(this);
	}

	public int method75() {
		return this.anInt3606;
	}

	public int method39() {
		return this.anInt3609;
	}

	public void method185() {
		if (this.aLong3610 != 0L) {
			this.aClass505_Sub2_Sub2_3608.method15650(this.aLong3610);
			this.aLong3610 = 0L;
		}

	}

	public int method73() {
		return this.anInt3609;
	}

	public int method77() {
		return this.anInt3609;
	}

	public void method32() {
		if (this.aLong3610 != 0L) {
			IUnknown.Release(this.aLong3610);
			this.aLong3610 = 0L;
		}

		this.aClass505_Sub2_Sub2_3608.method13885(this);
	}

	public void method184() {
		if (this.aLong3610 != 0L) {
			this.aClass505_Sub2_Sub2_3608.method15650(this.aLong3610);
			this.aLong3610 = 0L;
		}

	}

	public int method76() {
		return this.anInt3606;
	}

	public long method123() {
		return this.aLong3610;
	}

}
