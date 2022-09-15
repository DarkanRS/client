package com.jagex;

import jagdx.IDirect3DDevice;

public class Class158_Sub1_Sub3_Sub1 extends Class158_Sub1_Sub3 {

	boolean aBool10433;
	int anInt10437;
	Interface34 anInterface34_10435;
	int anInt10436;
	int anInt10439;
	Interface26[] anInterface26Array10440 = new Interface26[4];
	DirectXRenderer aGraphicalRenderer_Sub2_Sub2_10434;

	Class158_Sub1_Sub3_Sub1(DirectXRenderer class505_sub2_sub2_1) {
		super(class505_sub2_sub2_1);
		aGraphicalRenderer_Sub2_Sub2_10434 = class505_sub2_sub2_1;
	}

	@Override
	protected void finalize() throws Throwable {
		method15970();
		super.finalize();
	}

	@Override
	public void method13759(int i_1, Interface9 interface9_2) {
		int i_3 = 1 << i_1;
		Interface26 interface26_4 = (Interface26) interface9_2;
		if (interface9_2 == null) {
			anInt10437 &= ~i_3;
			anInterface26Array10440[i_1] = null;
			if (aBool10433)
				method15972(i_1, 0L);

			if (anInt10437 == 0) {
				anInt10436 = 0;
				anInt10439 = 0;
			}
		} else {
			if (anInt10437 != 0) {
				if (anInt10439 != interface26_4.method1() || anInt10436 != interface26_4.method74())
					throw new RuntimeException();
			} else {
				anInt10436 = interface26_4.method74();
				anInt10439 = interface26_4.method1();
				method15562();
			}

			anInt10437 |= i_3;
			anInterface26Array10440[i_1] = interface26_4;
			if (aBool10433)
				method15972(i_1, interface26_4.method2());
		}

	}

	@Override
	public boolean method13764() {
		return anInterface26Array10440[0] != null;
	}

	@Override
	public void method13765(Interface8 interface8_1) {
		Interface34 interface34_2 = (Interface34) interface8_1;
		if (interface8_1 == null) {
			anInt10437 &= -17;
			anInterface34_10435 = null;
			if (aBool10433)
				method15969(0L);

			if (anInt10437 == 0) {
				anInt10436 = 0;
				anInt10439 = 0;
			}
		} else {
			if (anInt10437 != 0) {
				if (anInt10439 != interface34_2.method1() || anInt10436 != interface34_2.method74())
					throw new RuntimeException();
			} else {
				anInt10436 = interface34_2.method74();
				anInt10439 = interface34_2.method1();
				method15562();
			}

			anInt10437 |= 0x10;
			anInterface34_10435 = interface34_2;
			if (aBool10433)
				method15969(interface34_2.method2());
		}

	}

	boolean method15969(long long_1) {
		return Class25.gtOrEqualToZero(IDirect3DDevice.SetDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_10434.aLong10252, long_1));
	}

	void method15970() {
		if (anInterface34_10435 != null)
			anInterface34_10435.method184();

		for (Interface26 element : anInterface26Array10440)
			if (element != null)
				element.method184();

	}

	boolean method15972(int i_1, long long_2) {
		return Class25.gtOrEqualToZero(IDirect3DDevice.SetRenderTarget(aGraphicalRenderer_Sub2_Sub2_10434.aLong10252, i_1, long_2));
	}

	@Override
	public void method186() {
		if (anInterface34_10435 != null)
			anInterface34_10435.method26();

		for (Interface26 element : anInterface26Array10440)
			if (element != null)
				element.method26();

	}

	@Override
	boolean method211() {
		for (int i_1 = 0; i_1 < 4; i_1++) {
			Interface26 interface26_2 = anInterface26Array10440[i_1];
			if (interface26_2 != null) {
				long long_3 = interface26_2.method2();
				method15972(i_1, long_3);
			}
		}

		if (anInterface34_10435 != null)
			method15969(anInterface34_10435.method2());

		aBool10433 = true;
		return super.method213();
	}

	@Override
	public void method212() {
		if (anInterface34_10435 != null)
			anInterface34_10435.method26();

		for (Interface26 element : anInterface26Array10440)
			if (element != null)
				element.method26();

	}

	@Override
	boolean method213() {
		for (int i_1 = 0; i_1 < 4; i_1++) {
			Interface26 interface26_2 = anInterface26Array10440[i_1];
			if (interface26_2 != null) {
				long long_3 = interface26_2.method2();
				method15972(i_1, long_3);
			}
		}

		if (anInterface34_10435 != null)
			method15969(anInterface34_10435.method2());

		aBool10433 = true;
		return super.method213();
	}

	@Override
	public int method2714() {
		return anInt10439;
	}

	@Override
	boolean method2715() {
		for (int i_1 = 1; i_1 < 4; i_1++) {
			Interface26 interface26_2 = anInterface26Array10440[i_1];
			if (interface26_2 != null)
				method15972(i_1, 0L);
		}

		if (anInterface34_10435 != null)
			method15969(0L);

		aBool10433 = false;
		return true;
	}

	@Override
	public int method2716() {
		return anInt10436;
	}

	@Override
	boolean method2717() {
		for (int i_1 = 1; i_1 < 4; i_1++) {
			Interface26 interface26_2 = anInterface26Array10440[i_1];
			if (interface26_2 != null)
				method15972(i_1, 0L);
		}

		if (anInterface34_10435 != null)
			method15969(0L);

		aBool10433 = false;
		return true;
	}

	@Override
	boolean method2718() {
		for (int i_1 = 1; i_1 < 4; i_1++) {
			Interface26 interface26_2 = anInterface26Array10440[i_1];
			if (interface26_2 != null)
				method15972(i_1, 0L);
		}

		if (anInterface34_10435 != null)
			method15969(0L);

		aBool10433 = false;
		return true;
	}

	@Override
	public int method2719() {
		return anInt10439;
	}

	@Override
	public int method2720() {
		return anInt10439;
	}

	@Override
	public int method2721() {
		return anInt10436;
	}

	@Override
	boolean method2722() {
		for (int i_1 = 1; i_1 < 4; i_1++) {
			Interface26 interface26_2 = anInterface26Array10440[i_1];
			if (interface26_2 != null)
				method15972(i_1, 0L);
		}

		if (anInterface34_10435 != null)
			method15969(0L);

		aBool10433 = false;
		return true;
	}

	@Override
	boolean method2723() {
		for (int i_1 = 1; i_1 < 4; i_1++) {
			Interface26 interface26_2 = anInterface26Array10440[i_1];
			if (interface26_2 != null)
				method15972(i_1, 0L);
		}

		if (anInterface34_10435 != null)
			method15969(0L);

		aBool10433 = false;
		return true;
	}

	@Override
	boolean method2724() {
		for (int i_1 = 1; i_1 < 4; i_1++) {
			Interface26 interface26_2 = anInterface26Array10440[i_1];
			if (interface26_2 != null)
				method15972(i_1, 0L);
		}

		if (anInterface34_10435 != null)
			method15969(0L);

		aBool10433 = false;
		return true;
	}

	@Override
	boolean method2725() {
		for (int i_1 = 1; i_1 < 4; i_1++) {
			Interface26 interface26_2 = anInterface26Array10440[i_1];
			if (interface26_2 != null)
				method15972(i_1, 0L);
		}

		if (anInterface34_10435 != null)
			method15969(0L);

		aBool10433 = false;
		return true;
	}

	@Override
	public int method2726() {
		return anInt10439;
	}

	@Override
	public int method2727() {
		return anInt10436;
	}

	@Override
	boolean method54() {
		for (int i_1 = 0; i_1 < 4; i_1++) {
			Interface26 interface26_2 = anInterface26Array10440[i_1];
			if (interface26_2 != null) {
				long long_3 = interface26_2.method2();
				method15972(i_1, long_3);
			}
		}

		if (anInterface34_10435 != null)
			method15969(anInterface34_10435.method2());

		aBool10433 = true;
		return super.method213();
	}

}
