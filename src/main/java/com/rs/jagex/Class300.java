package com.rs.jagex;

import jaclib.memory.Source;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;

public class Class300 implements Interface4 {

	int anInt3550;
	byte aByte3547;
	long aLong3549;
	int anInt3548;
	DirectXRenderer aGraphicalRenderer_Sub2_Sub2_3551;
	boolean aBool3552;

	Class300(DirectXRenderer class505_sub2_sub2_1, boolean bool_2) {
		aGraphicalRenderer_Sub2_Sub2_3551 = class505_sub2_sub2_1;
		aBool3552 = bool_2;
		aGraphicalRenderer_Sub2_Sub2_3551.method13901(this);
	}

	@Override
	protected void finalize() {
		method5319();
	}

	@Override
	public void method26() {
		if (aLong3549 != 0L) {
			IUnknown.Release(aLong3549);
			aLong3549 = 0L;
		}

		anInt3548 = 0;
		anInt3550 = 0;
		aGraphicalRenderer_Sub2_Sub2_3551.method13885(this);
	}

	@Override
	public boolean method27(int i_1, int i_2, Source source_3) {
		return method31(i_1, i_2) && Class25.gtOrEqualToZero(IDirect3DVertexBuffer.Upload(aLong3549, 0, anInt3550, aBool3552 ? 8192 : 0, source_3.method2()));
	}

	@Override
	public boolean method28(int i_1, int i_2) {
		anInt3550 = i_1;
		aByte3547 = (byte) i_2;
		if (anInt3550 > anInt3548) {
			int i_3 = 8;
			byte b_4;
			if (aBool3552) {
				b_4 = 0;
				i_3 |= 0x200;
			} else
				b_4 = 1;

			if (aLong3549 != 0L)
				IUnknown.Release(aLong3549);

			aLong3549 = IDirect3DDevice.CreateVertexBuffer(aGraphicalRenderer_Sub2_Sub2_3551.aLong10252, anInt3550, i_3, 0, b_4);
			anInt3548 = anInt3550;
		}

		return aLong3549 != 0L;
	}

	@Override
	public boolean method29(int i_1, int i_2) {
		anInt3550 = i_1;
		aByte3547 = (byte) i_2;
		if (anInt3550 > anInt3548) {
			int i_3 = 8;
			byte b_4;
			if (aBool3552) {
				b_4 = 0;
				i_3 |= 0x200;
			} else
				b_4 = 1;

			if (aLong3549 != 0L)
				IUnknown.Release(aLong3549);

			aLong3549 = IDirect3DDevice.CreateVertexBuffer(aGraphicalRenderer_Sub2_Sub2_3551.aLong10252, anInt3550, i_3, 0, b_4);
			anInt3548 = anInt3550;
		}

		return aLong3549 != 0L;
	}

	@Override
	public boolean method30(int i_1, int i_2) {
		anInt3550 = i_1;
		aByte3547 = (byte) i_2;
		if (anInt3550 > anInt3548) {
			int i_3 = 8;
			byte b_4;
			if (aBool3552) {
				b_4 = 0;
				i_3 |= 0x200;
			} else
				b_4 = 1;

			if (aLong3549 != 0L)
				IUnknown.Release(aLong3549);

			aLong3549 = IDirect3DDevice.CreateVertexBuffer(aGraphicalRenderer_Sub2_Sub2_3551.aLong10252, anInt3550, i_3, 0, b_4);
			anInt3548 = anInt3550;
		}

		return aLong3549 != 0L;
	}

	@Override
	public boolean method31(int i_1, int i_2) {
		anInt3550 = i_1;
		aByte3547 = (byte) i_2;
		if (anInt3550 > anInt3548) {
			int i_3 = 8;
			byte b_4;
			if (aBool3552) {
				b_4 = 0;
				i_3 |= 0x200;
			} else
				b_4 = 1;

			if (aLong3549 != 0L)
				IUnknown.Release(aLong3549);

			aLong3549 = IDirect3DDevice.CreateVertexBuffer(aGraphicalRenderer_Sub2_Sub2_3551.aLong10252, anInt3550, i_3, 0, b_4);
			anInt3548 = anInt3550;
		}

		return aLong3549 != 0L;
	}

	@Override
	public void method32() {
		if (aLong3549 != 0L) {
			IUnknown.Release(aLong3549);
			aLong3549 = 0L;
		}

		anInt3548 = 0;
		anInt3550 = 0;
		aGraphicalRenderer_Sub2_Sub2_3551.method13885(this);
	}

	@Override
	public boolean method33(int i_1, int i_2, Source source_3) {
		return method31(i_1, i_2) && Class25.gtOrEqualToZero(IDirect3DVertexBuffer.Upload(aLong3549, 0, anInt3550, aBool3552 ? 8192 : 0, source_3.method2()));
	}

	@Override
	public boolean method34(int i_1, int i_2, Source source_3) {
		return method31(i_1, i_2) && Class25.gtOrEqualToZero(IDirect3DVertexBuffer.Upload(aLong3549, 0, anInt3550, aBool3552 ? 8192 : 0, source_3.method2()));
	}

	@Override
	public boolean method35(int i_1, int i_2, long long_3) {
		return Class25.gtOrEqualToZero(IDirect3DVertexBuffer.Upload(aLong3549, i_1, i_2, aBool3552 ? 8192 : 0, long_3));
	}

	@Override
	public int method36() {
		return anInt3550;
	}

	@Override
	public long method37(int i_1, int i_2) {
		return IDirect3DVertexBuffer.Lock(aLong3549, i_1, i_2, aBool3552 ? 8192 : 0);
	}

	@Override
	public void method38() {
		IDirect3DVertexBuffer.Unlock(aLong3549);
	}

	@Override
	public int method39() {
		return anInt3550;
	}

	@Override
	public long method40(int i_1, int i_2) {
		return IDirect3DVertexBuffer.Lock(aLong3549, i_1, i_2, aBool3552 ? 8192 : 0);
	}

	@Override
	public long method41(int i_1, int i_2) {
		return IDirect3DVertexBuffer.Lock(aLong3549, i_1, i_2, aBool3552 ? 8192 : 0);
	}

	@Override
	public boolean method42(int i_1, int i_2, long long_3) {
		return Class25.gtOrEqualToZero(IDirect3DVertexBuffer.Upload(aLong3549, i_1, i_2, aBool3552 ? 8192 : 0, long_3));
	}

	@Override
	public void method43() {
		IDirect3DVertexBuffer.Unlock(aLong3549);
	}

	@Override
	public void method44() {
		IDirect3DVertexBuffer.Unlock(aLong3549);
	}

	int method5317() {
		return aByte3547;
	}

	void method5319() {
		if (aLong3549 != 0L) {
			aGraphicalRenderer_Sub2_Sub2_3551.method15650(aLong3549);
			aLong3549 = 0L;
			anInt3548 = 0;
			anInt3550 = 0;
		}

	}

}
