package com.jagex;
import jagdx.IDirect3DDevice;

public class Class158_Sub1_Sub3_Sub1 extends Class158_Sub1_Sub3 {

	boolean aBool10433;
	int anInt10437;
	Interface34 anInterface34_10435 = null;
	int anInt10436;
	int anInt10439;
	Interface26[] anInterface26Array10440 = new Interface26[4];
	GraphicalRenderer_Sub2_Sub2 aGraphicalRenderer_Sub2_Sub2_10434;

	boolean method2718() {
		for (int i_1 = 1; i_1 < 4; i_1++) {
			Interface26 interface26_2 = this.anInterface26Array10440[i_1];
			if (interface26_2 != null) {
				this.method15972(i_1, 0L);
			}
		}

		if (this.anInterface34_10435 != null) {
			this.method15969(0L);
		}

		this.aBool10433 = false;
		return true;
	}

	public int method2714() {
		return this.anInt10439;
	}

	public int method2716() {
		return this.anInt10436;
	}

	public void method13765(Interface8 interface8_1) {
		Interface34 interface34_2 = (Interface34) interface8_1;
		if (interface8_1 == null) {
			this.anInt10437 &= ~0x10;
			this.anInterface34_10435 = null;
			if (this.aBool10433) {
				this.method15969(0L);
			}

			if (this.anInt10437 == 0) {
				this.anInt10436 = 0;
				this.anInt10439 = 0;
			}
		} else {
			if (this.anInt10437 != 0) {
				if (this.anInt10439 != interface34_2.method1() || this.anInt10436 != interface34_2.method74()) {
					throw new RuntimeException();
				}
			} else {
				this.anInt10436 = interface34_2.method74();
				this.anInt10439 = interface34_2.method1();
				this.method15562();
			}

			this.anInt10437 |= 0x10;
			this.anInterface34_10435 = interface34_2;
			if (this.aBool10433) {
				this.method15969(interface34_2.method2());
			}
		}

	}

	public void method13759(int i_1, Interface9 interface9_2) {
		int i_3 = 1 << i_1;
		Interface26 interface26_4 = (Interface26) interface9_2;
		if (interface9_2 == null) {
			this.anInt10437 &= ~i_3;
			this.anInterface26Array10440[i_1] = null;
			if (this.aBool10433) {
				this.method15972(i_1, 0L);
			}

			if (this.anInt10437 == 0) {
				this.anInt10436 = 0;
				this.anInt10439 = 0;
			}
		} else {
			if (this.anInt10437 != 0) {
				if (this.anInt10439 != interface26_4.method1() || this.anInt10436 != interface26_4.method74()) {
					throw new RuntimeException();
				}
			} else {
				this.anInt10436 = interface26_4.method74();
				this.anInt10439 = interface26_4.method1();
				this.method15562();
			}

			this.anInt10437 |= i_3;
			this.anInterface26Array10440[i_1] = interface26_4;
			if (this.aBool10433) {
				this.method15972(i_1, interface26_4.method2());
			}
		}

	}

	boolean method15969(long long_1) {
		return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(this.aGraphicalRenderer_Sub2_Sub2_10434.aLong10252, long_1));
	}

	public int method2720() {
		return this.anInt10439;
	}

	public void method13761(int i_1, Interface9 interface9_2) {
		int i_3 = 1 << i_1;
		Interface26 interface26_4 = (Interface26) interface9_2;
		if (interface9_2 == null) {
			this.anInt10437 &= ~i_3;
			this.anInterface26Array10440[i_1] = null;
			if (this.aBool10433) {
				this.method15972(i_1, 0L);
			}

			if (this.anInt10437 == 0) {
				this.anInt10436 = 0;
				this.anInt10439 = 0;
			}
		} else {
			if (this.anInt10437 != 0) {
				if (this.anInt10439 != interface26_4.method1() || this.anInt10436 != interface26_4.method74()) {
					throw new RuntimeException();
				}
			} else {
				this.anInt10436 = interface26_4.method74();
				this.anInt10439 = interface26_4.method1();
				this.method15562();
			}

			this.anInt10437 |= i_3;
			this.anInterface26Array10440[i_1] = interface26_4;
			if (this.aBool10433) {
				this.method15972(i_1, interface26_4.method2());
			}
		}

	}

	public void method13762(int i_1, Interface9 interface9_2) {
		int i_3 = 1 << i_1;
		Interface26 interface26_4 = (Interface26) interface9_2;
		if (interface9_2 == null) {
			this.anInt10437 &= ~i_3;
			this.anInterface26Array10440[i_1] = null;
			if (this.aBool10433) {
				this.method15972(i_1, 0L);
			}

			if (this.anInt10437 == 0) {
				this.anInt10436 = 0;
				this.anInt10439 = 0;
			}
		} else {
			if (this.anInt10437 != 0) {
				if (this.anInt10439 != interface26_4.method1() || this.anInt10436 != interface26_4.method74()) {
					throw new RuntimeException();
				}
			} else {
				this.anInt10436 = interface26_4.method74();
				this.anInt10439 = interface26_4.method1();
				this.method15562();
			}

			this.anInt10437 |= i_3;
			this.anInterface26Array10440[i_1] = interface26_4;
			if (this.aBool10433) {
				this.method15972(i_1, interface26_4.method2());
			}
		}

	}

	public void method212() {
		if (this.anInterface34_10435 != null) {
			this.anInterface34_10435.method26();
		}

		for (int i_1 = 0; i_1 < this.anInterface26Array10440.length; i_1++) {
			if (this.anInterface26Array10440[i_1] != null) {
				this.anInterface26Array10440[i_1].method26();
			}
		}

	}

	void method15970() {
		if (this.anInterface34_10435 != null) {
			this.anInterface34_10435.method184();
		}

		for (int i_1 = 0; i_1 < this.anInterface26Array10440.length; i_1++) {
			if (this.anInterface26Array10440[i_1] != null) {
				this.anInterface26Array10440[i_1].method184();
			}
		}

	}

	public void finalize() throws Throwable {
		this.method15970();
		super.finalize();
	}

	Class158_Sub1_Sub3_Sub1(GraphicalRenderer_Sub2_Sub2 class505_sub2_sub2_1) {
		super(class505_sub2_sub2_1);
		this.aGraphicalRenderer_Sub2_Sub2_10434 = class505_sub2_sub2_1;
	}

	public int method2726() {
		return this.anInt10439;
	}

	public void method13760(int i_1, Interface9 interface9_2) {
		int i_3 = 1 << i_1;
		Interface26 interface26_4 = (Interface26) interface9_2;
		if (interface9_2 == null) {
			this.anInt10437 &= ~i_3;
			this.anInterface26Array10440[i_1] = null;
			if (this.aBool10433) {
				this.method15972(i_1, 0L);
			}

			if (this.anInt10437 == 0) {
				this.anInt10436 = 0;
				this.anInt10439 = 0;
			}
		} else {
			if (this.anInt10437 != 0) {
				if (this.anInt10439 != interface26_4.method1() || this.anInt10436 != interface26_4.method74()) {
					throw new RuntimeException();
				}
			} else {
				this.anInt10436 = interface26_4.method74();
				this.anInt10439 = interface26_4.method1();
				this.method15562();
			}

			this.anInt10437 |= i_3;
			this.anInterface26Array10440[i_1] = interface26_4;
			if (this.aBool10433) {
				this.method15972(i_1, interface26_4.method2());
			}
		}

	}

	boolean method15972(int i_1, long long_2) {
		return Class25.gtOrEqualToZero(IDirect3DDevice.SetRenderTarget(this.aGraphicalRenderer_Sub2_Sub2_10434.aLong10252, i_1, long_2));
	}

	boolean method2725() {
		for (int i_1 = 1; i_1 < 4; i_1++) {
			Interface26 interface26_2 = this.anInterface26Array10440[i_1];
			if (interface26_2 != null) {
				this.method15972(i_1, 0L);
			}
		}

		if (this.anInterface34_10435 != null) {
			this.method15969(0L);
		}

		this.aBool10433 = false;
		return true;
	}

	boolean method2722() {
		for (int i_1 = 1; i_1 < 4; i_1++) {
			Interface26 interface26_2 = this.anInterface26Array10440[i_1];
			if (interface26_2 != null) {
				this.method15972(i_1, 0L);
			}
		}

		if (this.anInterface34_10435 != null) {
			this.method15969(0L);
		}

		this.aBool10433 = false;
		return true;
	}

	public int method2719() {
		return this.anInt10439;
	}

	public void method13758(Interface8 interface8_1) {
		Interface34 interface34_2 = (Interface34) interface8_1;
		if (interface8_1 == null) {
			this.anInt10437 &= ~0x10;
			this.anInterface34_10435 = null;
			if (this.aBool10433) {
				this.method15969(0L);
			}

			if (this.anInt10437 == 0) {
				this.anInt10436 = 0;
				this.anInt10439 = 0;
			}
		} else {
			if (this.anInt10437 != 0) {
				if (this.anInt10439 != interface34_2.method1() || this.anInt10436 != interface34_2.method74()) {
					throw new RuntimeException();
				}
			} else {
				this.anInt10436 = interface34_2.method74();
				this.anInt10439 = interface34_2.method1();
				this.method15562();
			}

			this.anInt10437 |= 0x10;
			this.anInterface34_10435 = interface34_2;
			if (this.aBool10433) {
				this.method15969(interface34_2.method2());
			}
		}

	}

	public void method13757(Interface8 interface8_1) {
		Interface34 interface34_2 = (Interface34) interface8_1;
		if (interface8_1 == null) {
			this.anInt10437 &= ~0x10;
			this.anInterface34_10435 = null;
			if (this.aBool10433) {
				this.method15969(0L);
			}

			if (this.anInt10437 == 0) {
				this.anInt10436 = 0;
				this.anInt10439 = 0;
			}
		} else {
			if (this.anInt10437 != 0) {
				if (this.anInt10439 != interface34_2.method1() || this.anInt10436 != interface34_2.method74()) {
					throw new RuntimeException();
				}
			} else {
				this.anInt10436 = interface34_2.method74();
				this.anInt10439 = interface34_2.method1();
				this.method15562();
			}

			this.anInt10437 |= 0x10;
			this.anInterface34_10435 = interface34_2;
			if (this.aBool10433) {
				this.method15969(interface34_2.method2());
			}
		}

	}

	boolean method211() {
		for (int i_1 = 0; i_1 < 4; i_1++) {
			Interface26 interface26_2 = this.anInterface26Array10440[i_1];
			if (interface26_2 != null) {
				long long_3 = interface26_2.method2();
				this.method15972(i_1, long_3);
			}
		}

		if (this.anInterface34_10435 != null) {
			this.method15969(this.anInterface34_10435.method2());
		}

		this.aBool10433 = true;
		return super.method213();
	}

	boolean method54() {
		for (int i_1 = 0; i_1 < 4; i_1++) {
			Interface26 interface26_2 = this.anInterface26Array10440[i_1];
			if (interface26_2 != null) {
				long long_3 = interface26_2.method2();
				this.method15972(i_1, long_3);
			}
		}

		if (this.anInterface34_10435 != null) {
			this.method15969(this.anInterface34_10435.method2());
		}

		this.aBool10433 = true;
		return super.method213();
	}

	boolean method2723() {
		for (int i_1 = 1; i_1 < 4; i_1++) {
			Interface26 interface26_2 = this.anInterface26Array10440[i_1];
			if (interface26_2 != null) {
				this.method15972(i_1, 0L);
			}
		}

		if (this.anInterface34_10435 != null) {
			this.method15969(0L);
		}

		this.aBool10433 = false;
		return true;
	}

	boolean method2715() {
		for (int i_1 = 1; i_1 < 4; i_1++) {
			Interface26 interface26_2 = this.anInterface26Array10440[i_1];
			if (interface26_2 != null) {
				this.method15972(i_1, 0L);
			}
		}

		if (this.anInterface34_10435 != null) {
			this.method15969(0L);
		}

		this.aBool10433 = false;
		return true;
	}

	boolean method2717() {
		for (int i_1 = 1; i_1 < 4; i_1++) {
			Interface26 interface26_2 = this.anInterface26Array10440[i_1];
			if (interface26_2 != null) {
				this.method15972(i_1, 0L);
			}
		}

		if (this.anInterface34_10435 != null) {
			this.method15969(0L);
		}

		this.aBool10433 = false;
		return true;
	}

	boolean method2724() {
		for (int i_1 = 1; i_1 < 4; i_1++) {
			Interface26 interface26_2 = this.anInterface26Array10440[i_1];
			if (interface26_2 != null) {
				this.method15972(i_1, 0L);
			}
		}

		if (this.anInterface34_10435 != null) {
			this.method15969(0L);
		}

		this.aBool10433 = false;
		return true;
	}

	public void method13763(Interface8 interface8_1) {
		Interface34 interface34_2 = (Interface34) interface8_1;
		if (interface8_1 == null) {
			this.anInt10437 &= ~0x10;
			this.anInterface34_10435 = null;
			if (this.aBool10433) {
				this.method15969(0L);
			}

			if (this.anInt10437 == 0) {
				this.anInt10436 = 0;
				this.anInt10439 = 0;
			}
		} else {
			if (this.anInt10437 != 0) {
				if (this.anInt10439 != interface34_2.method1() || this.anInt10436 != interface34_2.method74()) {
					throw new RuntimeException();
				}
			} else {
				this.anInt10436 = interface34_2.method74();
				this.anInt10439 = interface34_2.method1();
				this.method15562();
			}

			this.anInt10437 |= 0x10;
			this.anInterface34_10435 = interface34_2;
			if (this.aBool10433) {
				this.method15969(interface34_2.method2());
			}
		}

	}

	public int method2727() {
		return this.anInt10436;
	}

	public void method186() {
		if (this.anInterface34_10435 != null) {
			this.anInterface34_10435.method26();
		}

		for (int i_1 = 0; i_1 < this.anInterface26Array10440.length; i_1++) {
			if (this.anInterface26Array10440[i_1] != null) {
				this.anInterface26Array10440[i_1].method26();
			}
		}

	}

	boolean method213() {
		for (int i_1 = 0; i_1 < 4; i_1++) {
			Interface26 interface26_2 = this.anInterface26Array10440[i_1];
			if (interface26_2 != null) {
				long long_3 = interface26_2.method2();
				this.method15972(i_1, long_3);
			}
		}

		if (this.anInterface34_10435 != null) {
			this.method15969(this.anInterface34_10435.method2());
		}

		this.aBool10433 = true;
		return super.method213();
	}

	public boolean method13764() {
		return this.anInterface26Array10440[0] != null;
	}

	public boolean method13766() {
		return this.anInterface26Array10440[0] != null;
	}

	public int method2721() {
		return this.anInt10436;
	}

}
