
/* Class158_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;

public class Class158_Sub1_Sub3_Sub1 extends Class158_Sub1_Sub3 {
	boolean aBool10433;
	Class505_Sub2_Sub2 aClass505_Sub2_Sub2_10434;
	Interface34 anInterface34_10435 = null;
	int anInt10436;
	int anInt10437;
	static final int anInt10438 = 16;
	int anInt10439;
	Interface26[] anInterface26Array10440 = new Interface26[4];

	boolean method2718() {
		for (int i = 1; i < 4; i++) {
			Interface26 interface26 = ((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i];
			if (interface26 != null)
				method15972(i, 0L);
		}
		if (((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 != null)
			method15969(0L);
		((Class158_Sub1_Sub3_Sub1) this).aBool10433 = false;
		return true;
	}

	public int method2714() {
		return ((Class158_Sub1_Sub3_Sub1) this).anInt10439;
	}

	public int method2716() {
		return ((Class158_Sub1_Sub3_Sub1) this).anInt10436;
	}

	public void method13765(Interface8 interface8) {
		Interface34 interface34 = (Interface34) interface8;
		if (interface8 != null) {
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 != 0) {
				if ((((Class158_Sub1_Sub3_Sub1) this).anInt10439 != interface34.method1()) || (((Class158_Sub1_Sub3_Sub1) this).anInt10436 != interface34.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = interface34.method74();
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = interface34.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 |= 0x10;
			((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 = interface34;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15969(interface34.method2());
		} else {
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 &= ~0x10;
			((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 = null;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15969(0L);
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 == 0) {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = 0;
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = 0;
			}
		}
	}

	public void method13759(int i, Interface9 interface9) {
		int i_0_ = 1 << i;
		Interface26 interface26 = (Interface26) interface9;
		if (interface9 != null) {
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 != 0) {
				if ((((Class158_Sub1_Sub3_Sub1) this).anInt10439 != interface26.method1()) || (((Class158_Sub1_Sub3_Sub1) this).anInt10436 != interface26.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = interface26.method74();
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = interface26.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 |= i_0_;
			((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i] = interface26;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15972(i, interface26.method2());
		} else {
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 &= i_0_ ^ 0xffffffff;
			((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i] = null;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15972(i, 0L);
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 == 0) {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = 0;
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = 0;
			}
		}
	}

	boolean method15968(int i, long l) {
		return Class25.method751(IDirect3DDevice.SetRenderTarget(((Class505_Sub2_Sub2) (((Class158_Sub1_Sub3_Sub1) this).aClass505_Sub2_Sub2_10434)).aLong10252, i, l));
	}

	boolean method15969(long l) {
		return Class25.method751(IDirect3DDevice.SetDepthStencilSurface(((Class505_Sub2_Sub2) (((Class158_Sub1_Sub3_Sub1) this).aClass505_Sub2_Sub2_10434)).aLong10252, l));
	}

	public int method2720() {
		return ((Class158_Sub1_Sub3_Sub1) this).anInt10439;
	}

	public void method13761(int i, Interface9 interface9) {
		int i_1_ = 1 << i;
		Interface26 interface26 = (Interface26) interface9;
		if (interface9 != null) {
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 != 0) {
				if ((((Class158_Sub1_Sub3_Sub1) this).anInt10439 != interface26.method1()) || (((Class158_Sub1_Sub3_Sub1) this).anInt10436 != interface26.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = interface26.method74();
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = interface26.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 |= i_1_;
			((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i] = interface26;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15972(i, interface26.method2());
		} else {
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 &= i_1_ ^ 0xffffffff;
			((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i] = null;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15972(i, 0L);
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 == 0) {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = 0;
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = 0;
			}
		}
	}

	public void method13762(int i, Interface9 interface9) {
		int i_2_ = 1 << i;
		Interface26 interface26 = (Interface26) interface9;
		if (interface9 != null) {
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 != 0) {
				if ((((Class158_Sub1_Sub3_Sub1) this).anInt10439 != interface26.method1()) || (((Class158_Sub1_Sub3_Sub1) this).anInt10436 != interface26.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = interface26.method74();
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = interface26.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 |= i_2_;
			((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i] = interface26;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15972(i, interface26.method2());
		} else {
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 &= i_2_ ^ 0xffffffff;
			((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i] = null;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15972(i, 0L);
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 == 0) {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = 0;
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = 0;
			}
		}
	}

	public void method212() {
		if (((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 != null)
			((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435.method26();
		for (int i = 0; i < (((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440).length; i++) {
			if (((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i] != null)
				((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i].method26();
		}
	}

	void method15970() {
		if (((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 != null)
			((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435.method184();
		for (int i = 0; i < (((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440).length; i++) {
			if (((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i] != null)
				((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i].method184();
		}
	}

	public void finalize() throws Throwable {
		method15970();
		super.finalize();
	}

	void method15971() throws Throwable {
		method15970();
		super.finalize();
	}

	Class158_Sub1_Sub3_Sub1(Class505_Sub2_Sub2 class505_sub2_sub2) {
		super((Class505_Sub2) class505_sub2_sub2);
		((Class158_Sub1_Sub3_Sub1) this).aClass505_Sub2_Sub2_10434 = class505_sub2_sub2;
	}

	public int method2726() {
		return ((Class158_Sub1_Sub3_Sub1) this).anInt10439;
	}

	public void method13760(int i, Interface9 interface9) {
		int i_3_ = 1 << i;
		Interface26 interface26 = (Interface26) interface9;
		if (interface9 != null) {
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 != 0) {
				if ((((Class158_Sub1_Sub3_Sub1) this).anInt10439 != interface26.method1()) || (((Class158_Sub1_Sub3_Sub1) this).anInt10436 != interface26.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = interface26.method74();
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = interface26.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 |= i_3_;
			((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i] = interface26;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15972(i, interface26.method2());
		} else {
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 &= i_3_ ^ 0xffffffff;
			((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i] = null;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15972(i, 0L);
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 == 0) {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = 0;
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = 0;
			}
		}
	}

	boolean method15972(int i, long l) {
		return Class25.method751(IDirect3DDevice.SetRenderTarget(((Class505_Sub2_Sub2) (((Class158_Sub1_Sub3_Sub1) this).aClass505_Sub2_Sub2_10434)).aLong10252, i, l));
	}

	boolean method2725() {
		for (int i = 1; i < 4; i++) {
			Interface26 interface26 = ((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i];
			if (interface26 != null)
				method15972(i, 0L);
		}
		if (((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 != null)
			method15969(0L);
		((Class158_Sub1_Sub3_Sub1) this).aBool10433 = false;
		return true;
	}

	boolean method2722() {
		for (int i = 1; i < 4; i++) {
			Interface26 interface26 = ((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i];
			if (interface26 != null)
				method15972(i, 0L);
		}
		if (((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 != null)
			method15969(0L);
		((Class158_Sub1_Sub3_Sub1) this).aBool10433 = false;
		return true;
	}

	public int method2719() {
		return ((Class158_Sub1_Sub3_Sub1) this).anInt10439;
	}

	public void method13758(Interface8 interface8) {
		Interface34 interface34 = (Interface34) interface8;
		if (interface8 != null) {
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 != 0) {
				if ((((Class158_Sub1_Sub3_Sub1) this).anInt10439 != interface34.method1()) || (((Class158_Sub1_Sub3_Sub1) this).anInt10436 != interface34.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = interface34.method74();
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = interface34.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 |= 0x10;
			((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 = interface34;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15969(interface34.method2());
		} else {
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 &= ~0x10;
			((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 = null;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15969(0L);
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 == 0) {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = 0;
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = 0;
			}
		}
	}

	public void method13757(Interface8 interface8) {
		Interface34 interface34 = (Interface34) interface8;
		if (interface8 != null) {
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 != 0) {
				if ((((Class158_Sub1_Sub3_Sub1) this).anInt10439 != interface34.method1()) || (((Class158_Sub1_Sub3_Sub1) this).anInt10436 != interface34.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = interface34.method74();
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = interface34.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 |= 0x10;
			((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 = interface34;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15969(interface34.method2());
		} else {
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 &= ~0x10;
			((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 = null;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15969(0L);
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 == 0) {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = 0;
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = 0;
			}
		}
	}

	boolean method211() {
		for (int i = 0; i < 4; i++) {
			Interface26 interface26 = ((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i];
			if (interface26 != null) {
				long l = interface26.method2();
				method15972(i, l);
			}
		}
		if (((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 != null)
			method15969(((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435.method2());
		((Class158_Sub1_Sub3_Sub1) this).aBool10433 = true;
		return super.method213();
	}

	boolean method54() {
		for (int i = 0; i < 4; i++) {
			Interface26 interface26 = ((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i];
			if (interface26 != null) {
				long l = interface26.method2();
				method15972(i, l);
			}
		}
		if (((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 != null)
			method15969(((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435.method2());
		((Class158_Sub1_Sub3_Sub1) this).aBool10433 = true;
		return super.method213();
	}

	boolean method2723() {
		for (int i = 1; i < 4; i++) {
			Interface26 interface26 = ((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i];
			if (interface26 != null)
				method15972(i, 0L);
		}
		if (((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 != null)
			method15969(0L);
		((Class158_Sub1_Sub3_Sub1) this).aBool10433 = false;
		return true;
	}

	boolean method2715() {
		for (int i = 1; i < 4; i++) {
			Interface26 interface26 = ((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i];
			if (interface26 != null)
				method15972(i, 0L);
		}
		if (((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 != null)
			method15969(0L);
		((Class158_Sub1_Sub3_Sub1) this).aBool10433 = false;
		return true;
	}

	boolean method2717() {
		for (int i = 1; i < 4; i++) {
			Interface26 interface26 = ((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i];
			if (interface26 != null)
				method15972(i, 0L);
		}
		if (((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 != null)
			method15969(0L);
		((Class158_Sub1_Sub3_Sub1) this).aBool10433 = false;
		return true;
	}

	boolean method2724() {
		for (int i = 1; i < 4; i++) {
			Interface26 interface26 = ((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i];
			if (interface26 != null)
				method15972(i, 0L);
		}
		if (((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 != null)
			method15969(0L);
		((Class158_Sub1_Sub3_Sub1) this).aBool10433 = false;
		return true;
	}

	public void method13763(Interface8 interface8) {
		Interface34 interface34 = (Interface34) interface8;
		if (interface8 != null) {
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 != 0) {
				if ((((Class158_Sub1_Sub3_Sub1) this).anInt10439 != interface34.method1()) || (((Class158_Sub1_Sub3_Sub1) this).anInt10436 != interface34.method74()))
					throw new RuntimeException();
			} else {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = interface34.method74();
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = interface34.method1();
				method15562();
			}
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 |= 0x10;
			((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 = interface34;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15969(interface34.method2());
		} else {
			((Class158_Sub1_Sub3_Sub1) this).anInt10437 &= ~0x10;
			((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 = null;
			if (((Class158_Sub1_Sub3_Sub1) this).aBool10433)
				method15969(0L);
			if (((Class158_Sub1_Sub3_Sub1) this).anInt10437 == 0) {
				((Class158_Sub1_Sub3_Sub1) this).anInt10436 = 0;
				((Class158_Sub1_Sub3_Sub1) this).anInt10439 = 0;
			}
		}
	}

	boolean method15973(int i, long l) {
		return Class25.method751(IDirect3DDevice.SetRenderTarget(((Class505_Sub2_Sub2) (((Class158_Sub1_Sub3_Sub1) this).aClass505_Sub2_Sub2_10434)).aLong10252, i, l));
	}

	void method15974() throws Throwable {
		method15970();
		super.finalize();
	}

	public int method2727() {
		return ((Class158_Sub1_Sub3_Sub1) this).anInt10436;
	}

	public void method186() {
		if (((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 != null)
			((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435.method26();
		for (int i = 0; i < (((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440).length; i++) {
			if (((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i] != null)
				((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i].method26();
		}
	}

	boolean method213() {
		for (int i = 0; i < 4; i++) {
			Interface26 interface26 = ((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[i];
			if (interface26 != null) {
				long l = interface26.method2();
				method15972(i, l);
			}
		}
		if (((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435 != null)
			method15969(((Class158_Sub1_Sub3_Sub1) this).anInterface34_10435.method2());
		((Class158_Sub1_Sub3_Sub1) this).aBool10433 = true;
		return super.method213();
	}

	public boolean method13764() {
		return (((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[0] != null);
	}

	public boolean method13766() {
		return (((Class158_Sub1_Sub3_Sub1) this).anInterface26Array10440[0] != null);
	}

	public int method2721() {
		return ((Class158_Sub1_Sub3_Sub1) this).anInt10436;
	}

	boolean method15975(int i, long l) {
		return Class25.method751(IDirect3DDevice.SetRenderTarget(((Class505_Sub2_Sub2) (((Class158_Sub1_Sub3_Sub1) this).aClass505_Sub2_Sub2_10434)).aLong10252, i, l));
	}

	boolean method15976(int i, long l) {
		return Class25.method751(IDirect3DDevice.SetRenderTarget(((Class505_Sub2_Sub2) (((Class158_Sub1_Sub3_Sub1) this).aClass505_Sub2_Sub2_10434)).aLong10252, i, l));
	}

	boolean method15977(long l) {
		return Class25.method751(IDirect3DDevice.SetDepthStencilSurface(((Class505_Sub2_Sub2) (((Class158_Sub1_Sub3_Sub1) this).aClass505_Sub2_Sub2_10434)).aLong10252, l));
	}

	boolean method15978(long l) {
		return Class25.method751(IDirect3DDevice.SetDepthStencilSurface(((Class505_Sub2_Sub2) (((Class158_Sub1_Sub3_Sub1) this).aClass505_Sub2_Sub2_10434)).aLong10252, l));
	}
}
