import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class376 implements Interface26, Interface34 {

	long aLong4514;
	int anInt4516;
	Class360_Sub2_Sub1 aClass360_Sub2_Sub1_4515;

	public int method1() {
		return this.aClass360_Sub2_Sub1_4515.method1();
	}

	public long method2() {
		if (this.aLong4514 == 0L) {
			this.aLong4514 = IDirect3DTexture.GetSurfaceLevel(this.aClass360_Sub2_Sub1_4515.aLong4168, this.anInt4516);
		}

		return this.aLong4514;
	}

	public int method74() {
		return this.aClass360_Sub2_Sub1_4515.method59();
	}

	public void method184() {
		if (this.aLong4514 != 0L) {
			this.aClass360_Sub2_Sub1_4515.aClass505_Sub2_Sub2_4165.method15650(this.aLong4514);
			this.aLong4514 = 0L;
		}

	}

	public void finalize() {
		this.method184();
	}

	public int method75() {
		return this.aClass360_Sub2_Sub1_4515.method1();
	}

	public void method26() {
		if (this.aLong4514 != 0L) {
			IUnknown.Release(this.aLong4514);
			this.aLong4514 = 0L;
		}

		this.aClass360_Sub2_Sub1_4515.aClass505_Sub2_Sub2_4165.method13885(this);
	}

	public int method39() {
		return this.aClass360_Sub2_Sub1_4515.method59();
	}

	public int method73() {
		return this.aClass360_Sub2_Sub1_4515.method59();
	}

	public int method77() {
		return this.aClass360_Sub2_Sub1_4515.method59();
	}

	public void method32() {
		if (this.aLong4514 != 0L) {
			IUnknown.Release(this.aLong4514);
			this.aLong4514 = 0L;
		}

		this.aClass360_Sub2_Sub1_4515.aClass505_Sub2_Sub2_4165.method13885(this);
	}

	public long method123() {
		if (this.aLong4514 == 0L) {
			this.aLong4514 = IDirect3DTexture.GetSurfaceLevel(this.aClass360_Sub2_Sub1_4515.aLong4168, this.anInt4516);
		}

		return this.aLong4514;
	}

	Class376(Class360_Sub2_Sub1 class360_sub2_sub1_1, int i_2) {
		this.anInt4516 = i_2;
		this.aClass360_Sub2_Sub1_4515 = class360_sub2_sub1_1;
		this.aClass360_Sub2_Sub1_4515.aClass505_Sub2_Sub2_4165.method13901(this);
	}

	public void method185() {
		if (this.aLong4514 != 0L) {
			this.aClass360_Sub2_Sub1_4515.aClass505_Sub2_Sub2_4165.method15650(this.aLong4514);
			this.aLong4514 = 0L;
		}

	}

	public int method76() {
		return this.aClass360_Sub2_Sub1_4515.method1();
	}

}
