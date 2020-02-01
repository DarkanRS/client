package com.jagex;
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

public class Class360_Sub1 extends Class360 implements Interface1 {

	int anInt9123;
	int anInt9121;
	int anInt9122;

	public void method201(Class35 class35_1) {
		super.method205(class35_1);
	}

	Class360_Sub1(GraphicalRenderer_Sub2_Sub2 class505_sub2_sub2_1, Class150 class150_2, int i_3, int i_4, int i_5, boolean bool_6, byte[] bytes_7) {
		super(class505_sub2_sub2_1, class150_2, Class76.aClass76_751, false, i_3 * i_5 * i_4);
		this.anInt9123 = i_3;
		this.anInt9121 = i_4;
		this.anInt9122 = i_5;
		this.aLong4168 = IDirect3DDevice.CreateVolumeTexture(this.aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, i_3, i_4, i_5, 1, 0, GraphicalRenderer_Sub2_Sub2.method15652(class150_2, this.aClass76_4164), 1);
		ByteBuffer bytebuffer_8 = this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer_8.clear();
		bytebuffer_8.put(bytes_7);
		IDirect3DVolumeTexture.Upload(this.aLong4168, 0, 0, 0, 0, this.anInt9123, this.anInt9121, this.anInt9122, class150_2.anInt1959 * this.anInt9123, 0, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
	}

	public void method26() {
		super.method26();
	}

	long method6245() {
		return this.aLong4168;
	}

	public void method32() {
		super.method26();
	}

	public void method207() {
		this.aGraphicalRenderer_Sub2_Sub2_4165.method15657(this);
	}

	public void method203() {
		this.aGraphicalRenderer_Sub2_Sub2_4165.method15657(this);
	}

	public void method204(Class35 class35_1) {
		super.method205(class35_1);
	}

	public void method206(Class35 class35_1) {
		super.method205(class35_1);
	}

	public void method205(Class35 class35_1) {
		super.method205(class35_1);
	}

	public void method202(Class35 class35_1) {
		super.method205(class35_1);
	}

}
