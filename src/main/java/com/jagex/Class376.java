package com.jagex;

import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class376 implements Interface26, Interface34 {

	long aLong4514;
	int anInt4516;
	Class360_Sub2_Sub1 aClass360_Sub2_Sub1_4515;

	Class376(Class360_Sub2_Sub1 class360_sub2_sub1_1, int i_2) {
		anInt4516 = i_2;
		aClass360_Sub2_Sub1_4515 = class360_sub2_sub1_1;
		aClass360_Sub2_Sub1_4515.aGraphicalRenderer_Sub2_Sub2_4165.method13901(this);
	}

	@Override
	protected void finalize() {
		method184();
	}

	@Override
	public int method1() {
		return aClass360_Sub2_Sub1_4515.method1();
	}

	@Override
	public long method123() {
		if (aLong4514 == 0L)
			aLong4514 = IDirect3DTexture.GetSurfaceLevel(aClass360_Sub2_Sub1_4515.aLong4168, anInt4516);

		return aLong4514;
	}

	@Override
	public void method184() {
		if (aLong4514 != 0L) {
			aClass360_Sub2_Sub1_4515.aGraphicalRenderer_Sub2_Sub2_4165.method15650(aLong4514);
			aLong4514 = 0L;
		}

	}

	@Override
	public void method185() {
		if (aLong4514 != 0L) {
			aClass360_Sub2_Sub1_4515.aGraphicalRenderer_Sub2_Sub2_4165.method15650(aLong4514);
			aLong4514 = 0L;
		}

	}

	@Override
	public long method2() {
		if (aLong4514 == 0L)
			aLong4514 = IDirect3DTexture.GetSurfaceLevel(aClass360_Sub2_Sub1_4515.aLong4168, anInt4516);

		return aLong4514;
	}

	@Override
	public void method26() {
		if (aLong4514 != 0L) {
			IUnknown.Release(aLong4514);
			aLong4514 = 0L;
		}

		aClass360_Sub2_Sub1_4515.aGraphicalRenderer_Sub2_Sub2_4165.method13885(this);
	}

	@Override
	public void method32() {
		if (aLong4514 != 0L) {
			IUnknown.Release(aLong4514);
			aLong4514 = 0L;
		}

		aClass360_Sub2_Sub1_4515.aGraphicalRenderer_Sub2_Sub2_4165.method13885(this);
	}

	@Override
	public int method39() {
		return aClass360_Sub2_Sub1_4515.method59();
	}

	@Override
	public int method73() {
		return aClass360_Sub2_Sub1_4515.method59();
	}

	@Override
	public int method74() {
		return aClass360_Sub2_Sub1_4515.method59();
	}

	@Override
	public int method75() {
		return aClass360_Sub2_Sub1_4515.method1();
	}

	@Override
	public int method76() {
		return aClass360_Sub2_Sub1_4515.method1();
	}

	@Override
	public int method77() {
		return aClass360_Sub2_Sub1_4515.method59();
	}

}
