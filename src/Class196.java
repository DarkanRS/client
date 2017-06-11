/* Class196 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;

public class Class196 implements Interface7_Impl2 {
	Class_ra_Sub3_Sub2 aClass_ra_Sub3_Sub2_8585;
	int anInt8586;
	int anInt8587;
	boolean aBoolean8588;
	Class77 aClass77_8589;
	long aLong8590 = 0L;

	Class196(Class_ra_Sub3_Sub2 class_ra_sub3_sub2, Class77 class77, boolean bool) {
		((Class196) this).aClass_ra_Sub3_Sub2_8585 = class_ra_sub3_sub2;
		((Class196) this).aClass77_8589 = class77;
		((Class196) this).aBoolean8588 = bool;
		((Class196) this).aClass_ra_Sub3_Sub2_8585.method5323(this);
	}

	public void method113(int i) {
		((Class196) this).anInt8587 = ((Class196) this).aClass77_8589.anInt724 * 685647847 * i;
		if (((Class196) this).anInt8587 > ((Class196) this).anInt8586) {
			if (((Class196) this).aLong8590 != 0L)
				IUnknown.Release(((Class196) this).aLong8590);
			int i_0_ = 8;
			int i_1_;
			if (((Class196) this).aBoolean8588) {
				i_1_ = 0;
				i_0_ |= 0x200;
			} else
				i_1_ = 1;
			((Class196) this).aLong8590 = (IDirect3DDevice.CreateIndexBuffer(((Class_ra_Sub3_Sub2) ((Class196) this).aClass_ra_Sub3_Sub2_8585).aLong9847, ((Class196) this).anInt8587, i_0_, (((Class196) this).aClass77_8589 == Class77.aClass77_718 ? 101 : 102), i_1_));
			((Class196) this).anInt8586 = ((Class196) this).anInt8587;
		}
	}

	public void method115(int i) {
		((Class196) this).anInt8587 = ((Class196) this).aClass77_8589.anInt724 * 685647847 * i;
		if (((Class196) this).anInt8587 > ((Class196) this).anInt8586) {
			if (((Class196) this).aLong8590 != 0L)
				IUnknown.Release(((Class196) this).aLong8590);
			int i_2_ = 8;
			int i_3_;
			if (((Class196) this).aBoolean8588) {
				i_3_ = 0;
				i_2_ |= 0x200;
			} else
				i_3_ = 1;
			((Class196) this).aLong8590 = (IDirect3DDevice.CreateIndexBuffer(((Class_ra_Sub3_Sub2) ((Class196) this).aClass_ra_Sub3_Sub2_8585).aLong9847, ((Class196) this).anInt8587, i_2_, (((Class196) this).aClass77_8589 == Class77.aClass77_718 ? 101 : 102), i_3_));
			((Class196) this).anInt8586 = ((Class196) this).anInt8587;
		}
	}

	public void method69() {
		IDirect3DIndexBuffer.Unlock(((Class196) this).aLong8590);
	}

	public boolean method63(int i, int i_4_, long l) {
		return jagdx.a.f(IDirect3DIndexBuffer.Upload(((Class196) this).aLong8590, i, i_4_, ((Class196) this).aBoolean8588 ? 8192 : 0, l));
	}

	public void b() {
		if (((Class196) this).aLong8590 != 0L) {
			IUnknown.Release(((Class196) this).aLong8590);
			((Class196) this).aLong8590 = 0L;
		}
		((Class196) this).anInt8586 = 0;
		((Class196) this).anInt8587 = 0;
		((Class196) this).aClass_ra_Sub3_Sub2_8585.method5293(this);
	}

	void method1874() {
		if (((Class196) this).aLong8590 != 0L) {
			((Class196) this).aClass_ra_Sub3_Sub2_8585.method5552(((Class196) this).aLong8590);
			((Class196) this).aLong8590 = 0L;
		}
		((Class196) this).anInt8586 = 0;
		((Class196) this).anInt8587 = 0;
	}

	public int method60() {
		return ((Class196) this).anInt8587;
	}

	public void d() {
		if (((Class196) this).aLong8590 != 0L) {
			IUnknown.Release(((Class196) this).aLong8590);
			((Class196) this).aLong8590 = 0L;
		}
		((Class196) this).anInt8586 = 0;
		((Class196) this).anInt8587 = 0;
		((Class196) this).aClass_ra_Sub3_Sub2_8585.method5293(this);
	}

	public void x() {
		if (((Class196) this).aLong8590 != 0L) {
			IUnknown.Release(((Class196) this).aLong8590);
			((Class196) this).aLong8590 = 0L;
		}
		((Class196) this).anInt8586 = 0;
		((Class196) this).anInt8587 = 0;
		((Class196) this).aClass_ra_Sub3_Sub2_8585.method5293(this);
	}

	public long method62(int i, int i_5_) {
		return IDirect3DIndexBuffer.Lock(((Class196) this).aLong8590, i, i_5_, (((Class196) this).aBoolean8588 ? 8192 : 0));
	}

	public int method65() {
		return ((Class196) this).anInt8587;
	}

	public boolean method61(int i, int i_6_, long l) {
		return jagdx.a.f(IDirect3DIndexBuffer.Upload(((Class196) this).aLong8590, i, i_6_, ((Class196) this).aBoolean8588 ? 8192 : 0, l));
	}

	public boolean method67(int i, int i_7_, long l) {
		return jagdx.a.f(IDirect3DIndexBuffer.Upload(((Class196) this).aLong8590, i, i_7_, ((Class196) this).aBoolean8588 ? 8192 : 0, l));
	}

	public void u() {
		if (((Class196) this).aLong8590 != 0L) {
			IUnknown.Release(((Class196) this).aLong8590);
			((Class196) this).aLong8590 = 0L;
		}
		((Class196) this).anInt8586 = 0;
		((Class196) this).anInt8587 = 0;
		((Class196) this).aClass_ra_Sub3_Sub2_8585.method5293(this);
	}

	public long method68(int i, int i_8_) {
		return IDirect3DIndexBuffer.Lock(((Class196) this).aLong8590, i, i_8_, (((Class196) this).aBoolean8588 ? 8192 : 0));
	}

	public void method112(int i) {
		((Class196) this).anInt8587 = ((Class196) this).aClass77_8589.anInt724 * 685647847 * i;
		if (((Class196) this).anInt8587 > ((Class196) this).anInt8586) {
			if (((Class196) this).aLong8590 != 0L)
				IUnknown.Release(((Class196) this).aLong8590);
			int i_9_ = 8;
			int i_10_;
			if (((Class196) this).aBoolean8588) {
				i_10_ = 0;
				i_9_ |= 0x200;
			} else
				i_10_ = 1;
			((Class196) this).aLong8590 = (IDirect3DDevice.CreateIndexBuffer(((Class_ra_Sub3_Sub2) ((Class196) this).aClass_ra_Sub3_Sub2_8585).aLong9847, ((Class196) this).anInt8587, i_9_, (((Class196) this).aClass77_8589 == Class77.aClass77_718 ? 101 : 102), i_10_));
			((Class196) this).anInt8586 = ((Class196) this).anInt8587;
		}
	}

	public void method114(int i) {
		((Class196) this).anInt8587 = ((Class196) this).aClass77_8589.anInt724 * 685647847 * i;
		if (((Class196) this).anInt8587 > ((Class196) this).anInt8586) {
			if (((Class196) this).aLong8590 != 0L)
				IUnknown.Release(((Class196) this).aLong8590);
			int i_11_ = 8;
			int i_12_;
			if (((Class196) this).aBoolean8588) {
				i_12_ = 0;
				i_11_ |= 0x200;
			} else
				i_12_ = 1;
			((Class196) this).aLong8590 = (IDirect3DDevice.CreateIndexBuffer(((Class_ra_Sub3_Sub2) ((Class196) this).aClass_ra_Sub3_Sub2_8585).aLong9847, ((Class196) this).anInt8587, i_11_, (((Class196) this).aClass77_8589 == Class77.aClass77_718 ? 101 : 102), i_12_));
			((Class196) this).anInt8586 = ((Class196) this).anInt8587;
		}
	}

	public int method64() {
		return ((Class196) this).anInt8587;
	}

	public void method116(int i) {
		((Class196) this).anInt8587 = ((Class196) this).aClass77_8589.anInt724 * 685647847 * i;
		if (((Class196) this).anInt8587 > ((Class196) this).anInt8586) {
			if (((Class196) this).aLong8590 != 0L)
				IUnknown.Release(((Class196) this).aLong8590);
			int i_13_ = 8;
			int i_14_;
			if (((Class196) this).aBoolean8588) {
				i_14_ = 0;
				i_13_ |= 0x200;
			} else
				i_14_ = 1;
			((Class196) this).aLong8590 = (IDirect3DDevice.CreateIndexBuffer(((Class_ra_Sub3_Sub2) ((Class196) this).aClass_ra_Sub3_Sub2_8585).aLong9847, ((Class196) this).anInt8587, i_13_, (((Class196) this).aClass77_8589 == Class77.aClass77_718 ? 101 : 102), i_14_));
			((Class196) this).anInt8586 = ((Class196) this).anInt8587;
		}
	}

	public void method66() {
		IDirect3DIndexBuffer.Unlock(((Class196) this).aLong8590);
	}
}
