/* Class193 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Source;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;

public class Class193 implements Interface7_Impl1 {
	Class_ra_Sub3_Sub2 aClass_ra_Sub3_Sub2_8579;
	byte aByte8580;
	int anInt8581;
	int anInt8582;
	boolean aBoolean8583;
	long aLong8584 = 0L;

	public int method65() {
		return ((Class193) this).anInt8581;
	}

	public int method60() {
		return ((Class193) this).anInt8581;
	}

	int method1861() {
		return ((Class193) this).aByte8580;
	}

	public void d() {
		if (((Class193) this).aLong8584 != 0L) {
			IUnknown.Release(((Class193) this).aLong8584);
			((Class193) this).aLong8584 = 0L;
		}
		((Class193) this).anInt8582 = 0;
		((Class193) this).anInt8581 = 0;
		((Class193) this).aClass_ra_Sub3_Sub2_8579.method5293(this);
	}

	public boolean method71(int i, int i_0_, Source source) {
		if (method72(i, i_0_))
			return jagdx.a.f(IDirect3DVertexBuffer.Upload(((Class193) this).aLong8584, 0, ((Class193) this).anInt8581, ((Class193) this).aBoolean8583 ? 8192 : 0, source.f()));
		return false;
	}

	public void x() {
		if (((Class193) this).aLong8584 != 0L) {
			IUnknown.Release(((Class193) this).aLong8584);
			((Class193) this).aLong8584 = 0L;
		}
		((Class193) this).anInt8582 = 0;
		((Class193) this).anInt8581 = 0;
		((Class193) this).aClass_ra_Sub3_Sub2_8579.method5293(this);
	}

	public void b() {
		if (((Class193) this).aLong8584 != 0L) {
			IUnknown.Release(((Class193) this).aLong8584);
			((Class193) this).aLong8584 = 0L;
		}
		((Class193) this).anInt8582 = 0;
		((Class193) this).anInt8581 = 0;
		((Class193) this).aClass_ra_Sub3_Sub2_8579.method5293(this);
	}

	public boolean method63(int i, int i_1_, long l) {
		return jagdx.a.f(IDirect3DVertexBuffer.Upload(((Class193) this).aLong8584, i, i_1_, ((Class193) this).aBoolean8583 ? 8192 : 0, l));
	}

	void method1862() {
		if (((Class193) this).aLong8584 != 0L) {
			((Class193) this).aClass_ra_Sub3_Sub2_8579.method5552(((Class193) this).aLong8584);
			((Class193) this).aLong8584 = 0L;
			((Class193) this).anInt8582 = 0;
			((Class193) this).anInt8581 = 0;
		}
	}

	public long method62(int i, int i_2_) {
		return IDirect3DVertexBuffer.Lock(((Class193) this).aLong8584, i, i_2_, (((Class193) this).aBoolean8583 ? 8192 : 0));
	}

	public void u() {
		if (((Class193) this).aLong8584 != 0L) {
			IUnknown.Release(((Class193) this).aLong8584);
			((Class193) this).aLong8584 = 0L;
		}
		((Class193) this).anInt8582 = 0;
		((Class193) this).anInt8581 = 0;
		((Class193) this).aClass_ra_Sub3_Sub2_8579.method5293(this);
	}

	public void method69() {
		IDirect3DVertexBuffer.Unlock(((Class193) this).aLong8584);
	}

	public boolean method70(int i, int i_3_) {
		((Class193) this).anInt8581 = i;
		((Class193) this).aByte8580 = (byte) i_3_;
		if (((Class193) this).anInt8581 > ((Class193) this).anInt8582) {
			int i_4_ = 8;
			int i_5_;
			if (((Class193) this).aBoolean8583) {
				i_5_ = 0;
				i_4_ |= 0x200;
			} else
				i_5_ = 1;
			if (((Class193) this).aLong8584 != 0L)
				IUnknown.Release(((Class193) this).aLong8584);
			((Class193) this).aLong8584 = (IDirect3DDevice.CreateVertexBuffer(((Class_ra_Sub3_Sub2) ((Class193) this).aClass_ra_Sub3_Sub2_8579).aLong9847, ((Class193) this).anInt8581, i_4_, 0, i_5_));
			((Class193) this).anInt8582 = ((Class193) this).anInt8581;
		}
		return ((Class193) this).aLong8584 != 0L;
	}

	public void method66() {
		IDirect3DVertexBuffer.Unlock(((Class193) this).aLong8584);
	}

	public int method64() {
		return ((Class193) this).anInt8581;
	}

	public boolean method74(int i, int i_6_, Source source) {
		if (method72(i, i_6_))
			return jagdx.a.f(IDirect3DVertexBuffer.Upload(((Class193) this).aLong8584, 0, ((Class193) this).anInt8581, ((Class193) this).aBoolean8583 ? 8192 : 0, source.f()));
		return false;
	}

	public boolean method73(int i, int i_7_) {
		((Class193) this).anInt8581 = i;
		((Class193) this).aByte8580 = (byte) i_7_;
		if (((Class193) this).anInt8581 > ((Class193) this).anInt8582) {
			int i_8_ = 8;
			int i_9_;
			if (((Class193) this).aBoolean8583) {
				i_9_ = 0;
				i_8_ |= 0x200;
			} else
				i_9_ = 1;
			if (((Class193) this).aLong8584 != 0L)
				IUnknown.Release(((Class193) this).aLong8584);
			((Class193) this).aLong8584 = (IDirect3DDevice.CreateVertexBuffer(((Class_ra_Sub3_Sub2) ((Class193) this).aClass_ra_Sub3_Sub2_8579).aLong9847, ((Class193) this).anInt8581, i_8_, 0, i_9_));
			((Class193) this).anInt8582 = ((Class193) this).anInt8581;
		}
		return ((Class193) this).aLong8584 != 0L;
	}

	public boolean method67(int i, int i_10_, long l) {
		return jagdx.a.f(IDirect3DVertexBuffer.Upload(((Class193) this).aLong8584, i, i_10_, ((Class193) this).aBoolean8583 ? 8192 : 0, l));
	}

	public long method68(int i, int i_11_) {
		return IDirect3DVertexBuffer.Lock(((Class193) this).aLong8584, i, i_11_, (((Class193) this).aBoolean8583 ? 8192 : 0));
	}

	Class193(Class_ra_Sub3_Sub2 class_ra_sub3_sub2, boolean bool) {
		((Class193) this).aClass_ra_Sub3_Sub2_8579 = class_ra_sub3_sub2;
		((Class193) this).aBoolean8583 = bool;
		((Class193) this).aClass_ra_Sub3_Sub2_8579.method5323(this);
	}

	public boolean method72(int i, int i_12_) {
		((Class193) this).anInt8581 = i;
		((Class193) this).aByte8580 = (byte) i_12_;
		if (((Class193) this).anInt8581 > ((Class193) this).anInt8582) {
			int i_13_ = 8;
			int i_14_;
			if (((Class193) this).aBoolean8583) {
				i_14_ = 0;
				i_13_ |= 0x200;
			} else
				i_14_ = 1;
			if (((Class193) this).aLong8584 != 0L)
				IUnknown.Release(((Class193) this).aLong8584);
			((Class193) this).aLong8584 = (IDirect3DDevice.CreateVertexBuffer(((Class_ra_Sub3_Sub2) ((Class193) this).aClass_ra_Sub3_Sub2_8579).aLong9847, ((Class193) this).anInt8581, i_13_, 0, i_14_));
			((Class193) this).anInt8582 = ((Class193) this).anInt8581;
		}
		return ((Class193) this).aLong8584 != 0L;
	}

	public boolean method61(int i, int i_15_, long l) {
		return jagdx.a.f(IDirect3DVertexBuffer.Upload(((Class193) this).aLong8584, i, i_15_, ((Class193) this).aBoolean8583 ? 8192 : 0, l));
	}
}
