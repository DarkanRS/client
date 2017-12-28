
/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Source;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;

public class Class300 implements Interface4 {
	byte aByte3547;
	int anInt3548;
	long aLong3549 = 0L;
	int anInt3550;
	Class505_Sub2_Sub2 aClass505_Sub2_Sub2_3551;
	boolean aBool3552;

	public boolean method27(int i, int i_0_, Source source) {
		if (method31(i, i_0_))
			return Class25.method751(IDirect3DVertexBuffer.Upload(((Class300) this).aLong3549, 0, ((Class300) this).anInt3550, ((Class300) this).aBool3552 ? 8192 : 0, source.method2()));
		return false;
	}

	public boolean method29(int i, int i_1_) {
		((Class300) this).anInt3550 = i;
		((Class300) this).aByte3547 = (byte) i_1_;
		if (((Class300) this).anInt3550 > ((Class300) this).anInt3548) {
			int i_2_ = 8;
			int i_3_;
			if (((Class300) this).aBool3552) {
				i_3_ = 0;
				i_2_ |= 0x200;
			} else
				i_3_ = 1;
			if (((Class300) this).aLong3549 != 0L)
				IUnknown.Release(((Class300) this).aLong3549);
			((Class300) this).aLong3549 = (IDirect3DDevice.CreateVertexBuffer(((Class505_Sub2_Sub2) ((Class300) this).aClass505_Sub2_Sub2_3551).aLong10252, ((Class300) this).anInt3550, i_2_, 0, i_3_));
			((Class300) this).anInt3548 = ((Class300) this).anInt3550;
		}
		return ((Class300) this).aLong3549 != 0L;
	}

	int method5317() {
		return ((Class300) this).aByte3547;
	}

	public boolean method31(int i, int i_4_) {
		((Class300) this).anInt3550 = i;
		((Class300) this).aByte3547 = (byte) i_4_;
		if (((Class300) this).anInt3550 > ((Class300) this).anInt3548) {
			int i_5_ = 8;
			int i_6_;
			if (((Class300) this).aBool3552) {
				i_6_ = 0;
				i_5_ |= 0x200;
			} else
				i_6_ = 1;
			if (((Class300) this).aLong3549 != 0L)
				IUnknown.Release(((Class300) this).aLong3549);
			((Class300) this).aLong3549 = (IDirect3DDevice.CreateVertexBuffer(((Class505_Sub2_Sub2) ((Class300) this).aClass505_Sub2_Sub2_3551).aLong10252, ((Class300) this).anInt3550, i_5_, 0, i_6_));
			((Class300) this).anInt3548 = ((Class300) this).anInt3550;
		}
		return ((Class300) this).aLong3549 != 0L;
	}

	int method5318() {
		return ((Class300) this).aByte3547;
	}

	public long method40(int i, int i_7_) {
		return IDirect3DVertexBuffer.Lock(((Class300) this).aLong3549, i, i_7_, (((Class300) this).aBool3552 ? 8192 : 0));
	}

	public void method38() {
		IDirect3DVertexBuffer.Unlock(((Class300) this).aLong3549);
	}

	public boolean method42(int i, int i_8_, long l) {
		return Class25.method751(IDirect3DVertexBuffer.Upload(((Class300) this).aLong3549, i, i_8_, ((Class300) this).aBool3552 ? 8192 : 0, l));
	}

	public void method26() {
		if (((Class300) this).aLong3549 != 0L) {
			IUnknown.Release(((Class300) this).aLong3549);
			((Class300) this).aLong3549 = 0L;
		}
		((Class300) this).anInt3548 = 0;
		((Class300) this).anInt3550 = 0;
		((Class300) this).aClass505_Sub2_Sub2_3551.method13885(this);
	}

	void method5319() {
		if (((Class300) this).aLong3549 != 0L) {
			((Class300) this).aClass505_Sub2_Sub2_3551.method15650(((Class300) this).aLong3549);
			((Class300) this).aLong3549 = 0L;
			((Class300) this).anInt3548 = 0;
			((Class300) this).anInt3550 = 0;
		}
	}

	public void method32() {
		if (((Class300) this).aLong3549 != 0L) {
			IUnknown.Release(((Class300) this).aLong3549);
			((Class300) this).aLong3549 = 0L;
		}
		((Class300) this).anInt3548 = 0;
		((Class300) this).anInt3550 = 0;
		((Class300) this).aClass505_Sub2_Sub2_3551.method13885(this);
	}

	public void finalize() {
		method5319();
	}

	public boolean method28(int i, int i_9_) {
		((Class300) this).anInt3550 = i;
		((Class300) this).aByte3547 = (byte) i_9_;
		if (((Class300) this).anInt3550 > ((Class300) this).anInt3548) {
			int i_10_ = 8;
			int i_11_;
			if (((Class300) this).aBool3552) {
				i_11_ = 0;
				i_10_ |= 0x200;
			} else
				i_11_ = 1;
			if (((Class300) this).aLong3549 != 0L)
				IUnknown.Release(((Class300) this).aLong3549);
			((Class300) this).aLong3549 = (IDirect3DDevice.CreateVertexBuffer(((Class505_Sub2_Sub2) ((Class300) this).aClass505_Sub2_Sub2_3551).aLong10252, ((Class300) this).anInt3550, i_10_, 0, i_11_));
			((Class300) this).anInt3548 = ((Class300) this).anInt3550;
		}
		return ((Class300) this).aLong3549 != 0L;
	}

	void method5320() {
		method5319();
	}

	public boolean method30(int i, int i_12_) {
		((Class300) this).anInt3550 = i;
		((Class300) this).aByte3547 = (byte) i_12_;
		if (((Class300) this).anInt3550 > ((Class300) this).anInt3548) {
			int i_13_ = 8;
			int i_14_;
			if (((Class300) this).aBool3552) {
				i_14_ = 0;
				i_13_ |= 0x200;
			} else
				i_14_ = 1;
			if (((Class300) this).aLong3549 != 0L)
				IUnknown.Release(((Class300) this).aLong3549);
			((Class300) this).aLong3549 = (IDirect3DDevice.CreateVertexBuffer(((Class505_Sub2_Sub2) ((Class300) this).aClass505_Sub2_Sub2_3551).aLong10252, ((Class300) this).anInt3550, i_13_, 0, i_14_));
			((Class300) this).anInt3548 = ((Class300) this).anInt3550;
		}
		return ((Class300) this).aLong3549 != 0L;
	}

	Class300(Class505_Sub2_Sub2 class505_sub2_sub2, boolean bool) {
		((Class300) this).aClass505_Sub2_Sub2_3551 = class505_sub2_sub2;
		((Class300) this).aBool3552 = bool;
		((Class300) this).aClass505_Sub2_Sub2_3551.method13901(this);
	}

	void method5321() {
		method5319();
	}

	public boolean method33(int i, int i_15_, Source source) {
		if (method31(i, i_15_))
			return Class25.method751(IDirect3DVertexBuffer.Upload(((Class300) this).aLong3549, 0, ((Class300) this).anInt3550, ((Class300) this).aBool3552 ? 8192 : 0, source.method2()));
		return false;
	}

	public boolean method34(int i, int i_16_, Source source) {
		if (method31(i, i_16_))
			return Class25.method751(IDirect3DVertexBuffer.Upload(((Class300) this).aLong3549, 0, ((Class300) this).anInt3550, ((Class300) this).aBool3552 ? 8192 : 0, source.method2()));
		return false;
	}

	public int method36() {
		return ((Class300) this).anInt3550;
	}

	public int method39() {
		return ((Class300) this).anInt3550;
	}

	public long method41(int i, int i_17_) {
		return IDirect3DVertexBuffer.Lock(((Class300) this).aLong3549, i, i_17_, (((Class300) this).aBool3552 ? 8192 : 0));
	}

	public long method37(int i, int i_18_) {
		return IDirect3DVertexBuffer.Lock(((Class300) this).aLong3549, i, i_18_, (((Class300) this).aBool3552 ? 8192 : 0));
	}

	public void method43() {
		IDirect3DVertexBuffer.Unlock(((Class300) this).aLong3549);
	}

	public void method44() {
		IDirect3DVertexBuffer.Unlock(((Class300) this).aLong3549);
	}

	public boolean method35(int i, int i_19_, long l) {
		return Class25.method751(IDirect3DVertexBuffer.Upload(((Class300) this).aLong3549, i, i_19_, ((Class300) this).aBool3552 ? 8192 : 0, l));
	}

	int method5322() {
		return ((Class300) this).aByte3547;
	}

	void method5323() {
		if (((Class300) this).aLong3549 != 0L) {
			((Class300) this).aClass505_Sub2_Sub2_3551.method15650(((Class300) this).aLong3549);
			((Class300) this).aLong3549 = 0L;
			((Class300) this).anInt3548 = 0;
			((Class300) this).anInt3550 = 0;
		}
	}

	void method5324() {
		if (((Class300) this).aLong3549 != 0L) {
			((Class300) this).aClass505_Sub2_Sub2_3551.method15650(((Class300) this).aLong3549);
			((Class300) this).aLong3549 = 0L;
			((Class300) this).anInt3548 = 0;
			((Class300) this).anInt3550 = 0;
		}
	}

	void method5325() {
		if (((Class300) this).aLong3549 != 0L) {
			((Class300) this).aClass505_Sub2_Sub2_3551.method15650(((Class300) this).aLong3549);
			((Class300) this).aLong3549 = 0L;
			((Class300) this).anInt3548 = 0;
			((Class300) this).anInt3550 = 0;
		}
	}
}
