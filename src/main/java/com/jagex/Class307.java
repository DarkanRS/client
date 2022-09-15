package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class307 implements Interface34 {

	long aLong3610;
	DirectXRenderer aGraphicalRenderer_Sub2_Sub2_3608;
	int anInt3606;
	int anInt3609;
	Class76 aClass76_3607;

	Class307(DirectXRenderer class505_sub2_sub2_1, Class76 class76_2, int i_3, int i_4) {
		aGraphicalRenderer_Sub2_Sub2_3608 = class505_sub2_sub2_1;
		anInt3606 = i_3;
		anInt3609 = i_4;
		aClass76_3607 = class76_2;
		aLong3610 = IDirect3DDevice.CreateDepthStencilSurface(aGraphicalRenderer_Sub2_Sub2_3608.aLong10252, i_3, i_4, DirectXRenderer.method15653(aClass76_3607), 0, 0, false);
		aGraphicalRenderer_Sub2_Sub2_3608.method13901(this);
	}

	@Override
	protected void finalize() {
		method184();
	}

	@Override
	public int method1() {
		return anInt3606;
	}

	@Override
	public long method123() {
		return aLong3610;
	}

	@Override
	public void method184() {
		if (aLong3610 != 0L) {
			aGraphicalRenderer_Sub2_Sub2_3608.method15650(aLong3610);
			aLong3610 = 0L;
		}

	}

	@Override
	public void method185() {
		if (aLong3610 != 0L) {
			aGraphicalRenderer_Sub2_Sub2_3608.method15650(aLong3610);
			aLong3610 = 0L;
		}

	}

	@Override
	public long method2() {
		return aLong3610;
	}

	@Override
	public void method26() {
		if (aLong3610 != 0L) {
			IUnknown.Release(aLong3610);
			aLong3610 = 0L;
		}

		aGraphicalRenderer_Sub2_Sub2_3608.method13885(this);
	}

	@Override
	public void method32() {
		if (aLong3610 != 0L) {
			IUnknown.Release(aLong3610);
			aLong3610 = 0L;
		}

		aGraphicalRenderer_Sub2_Sub2_3608.method13885(this);
	}

	@Override
	public int method39() {
		return anInt3609;
	}

	@Override
	public int method73() {
		return anInt3609;
	}

	@Override
	public int method74() {
		return anInt3609;
	}

	@Override
	public int method75() {
		return anInt3606;
	}

	@Override
	public int method76() {
		return anInt3606;
	}

	@Override
	public int method77() {
		return anInt3609;
	}

}
