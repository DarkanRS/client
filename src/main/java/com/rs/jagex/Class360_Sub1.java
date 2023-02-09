package com.rs.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

import java.nio.ByteBuffer;

public class Class360_Sub1 extends Class360 implements Interface1 {

	int anInt9123;
	int anInt9121;
	int anInt9122;

	Class360_Sub1(DirectXRenderer class505_sub2_sub2_1, Class150 class150_2, int i_3, int i_4, int i_5, byte[] bytes_7) {
		super(class505_sub2_sub2_1, class150_2, Class76.aClass76_751, false);
		anInt9123 = i_3;
		anInt9121 = i_4;
		anInt9122 = i_5;
		aLong4168 = IDirect3DDevice.CreateVolumeTexture(aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, i_3, i_4, i_5, 1, 0, DirectXRenderer.method15652(class150_2, aClass76_4164), 1);
		ByteBuffer bytebuffer_8 = aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer_8.clear();
		bytebuffer_8.put(bytes_7);
		IDirect3DVolumeTexture.Upload(aLong4168, 0, 0, 0, 0, anInt9123, anInt9121, anInt9122, class150_2.anInt1959 * anInt9123, 0, aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
	}

	@Override
	public void method201(Class35 class35_1) {
		super.method205(class35_1);
	}

	@Override
	public void method202(Class35 class35_1) {
		super.method205(class35_1);
	}

	@Override
	public void method203() {
		aGraphicalRenderer_Sub2_Sub2_4165.method15657(this);
	}

	@Override
	public void method204(Class35 class35_1) {
		super.method205(class35_1);
	}

	@Override
	public void method205(Class35 class35_1) {
		super.method205(class35_1);
	}

	@Override
	public void method206(Class35 class35_1) {
		super.method205(class35_1);
	}

	@Override
	public void method207() {
		aGraphicalRenderer_Sub2_Sub2_4165.method15657(this);
	}

	@Override
	public void method26() {
		super.method26();
	}

	@Override
	public void method32() {
		super.method26();
	}

	@Override
	long method6245() {
		return aLong4168;
	}

}
