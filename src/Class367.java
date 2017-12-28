
/* Class367 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;

public class Class367 implements Interface32 {
	Class76 aClass76_4233;
	Class505_Sub2_Sub2 aClass505_Sub2_Sub2_4234;
	int anInt4235;
	boolean aBool4236;
	int anInt4237;
	long aLong4238 = 0L;

	public void method44() {
		IDirect3DIndexBuffer.Unlock(((Class367) this).aLong4238);
	}

	public int method39() {
		return ((Class367) this).anInt4237;
	}

	public boolean method35(int i, int i_0_, long l) {
		return Class25.method751(IDirect3DIndexBuffer.Upload(((Class367) this).aLong4238, i, i_0_, ((Class367) this).aBool4236 ? 8192 : 0, l));
	}

	public long method40(int i, int i_1_) {
		return IDirect3DIndexBuffer.Lock(((Class367) this).aLong4238, i, i_1_, (((Class367) this).aBool4236 ? 8192 : 0));
	}

	public void method38() {
		IDirect3DIndexBuffer.Unlock(((Class367) this).aLong4238);
	}

	public int method36() {
		return ((Class367) this).anInt4237;
	}

	public void method26() {
		if (((Class367) this).aLong4238 != 0L) {
			IUnknown.Release(((Class367) this).aLong4238);
			((Class367) this).aLong4238 = 0L;
		}
		((Class367) this).anInt4235 = 0;
		((Class367) this).anInt4237 = 0;
		((Class367) this).aClass505_Sub2_Sub2_4234.method13885(this);
	}

	Class367(Class505_Sub2_Sub2 class505_sub2_sub2, Class76 class76, boolean bool) {
		((Class367) this).aClass505_Sub2_Sub2_4234 = class505_sub2_sub2;
		((Class367) this).aClass76_4233 = class76;
		((Class367) this).aBool4236 = bool;
		((Class367) this).aClass505_Sub2_Sub2_4234.method13901(this);
	}

	public void finalize() {
		method6308();
	}

	public void method32() {
		if (((Class367) this).aLong4238 != 0L) {
			IUnknown.Release(((Class367) this).aLong4238);
			((Class367) this).aLong4238 = 0L;
		}
		((Class367) this).anInt4235 = 0;
		((Class367) this).anInt4237 = 0;
		((Class367) this).aClass505_Sub2_Sub2_4234.method13885(this);
	}

	void method6306() {
		method6308();
	}

	void method6307() {
		method6308();
	}

	public long method37(int i, int i_2_) {
		return IDirect3DIndexBuffer.Lock(((Class367) this).aLong4238, i, i_2_, (((Class367) this).aBool4236 ? 8192 : 0));
	}

	public void method208(int i) {
		((Class367) this).anInt4237 = ((Class367) this).aClass76_4233.anInt748 * 971905895 * i;
		if (((Class367) this).anInt4237 > ((Class367) this).anInt4235) {
			if (((Class367) this).aLong4238 != 0L)
				IUnknown.Release(((Class367) this).aLong4238);
			int i_3_ = 8;
			int i_4_;
			if (((Class367) this).aBool4236) {
				i_4_ = 0;
				i_3_ |= 0x200;
			} else
				i_4_ = 1;
			((Class367) this).aLong4238 = (IDirect3DDevice.CreateIndexBuffer(((Class505_Sub2_Sub2) ((Class367) this).aClass505_Sub2_Sub2_4234).aLong10252, ((Class367) this).anInt4237, i_3_, (((Class367) this).aClass76_4233 == Class76.aClass76_752 ? 101 : 102), i_4_));
			((Class367) this).anInt4235 = ((Class367) this).anInt4237;
		}
	}

	public void method43() {
		IDirect3DIndexBuffer.Unlock(((Class367) this).aLong4238);
	}

	public long method41(int i, int i_5_) {
		return IDirect3DIndexBuffer.Lock(((Class367) this).aLong4238, i, i_5_, (((Class367) this).aBool4236 ? 8192 : 0));
	}

	public boolean method42(int i, int i_6_, long l) {
		return Class25.method751(IDirect3DIndexBuffer.Upload(((Class367) this).aLong4238, i, i_6_, ((Class367) this).aBool4236 ? 8192 : 0, l));
	}

	void method6308() {
		if (((Class367) this).aLong4238 != 0L) {
			((Class367) this).aClass505_Sub2_Sub2_4234.method15650(((Class367) this).aLong4238);
			((Class367) this).aLong4238 = 0L;
		}
		((Class367) this).anInt4235 = 0;
		((Class367) this).anInt4237 = 0;
	}

	public void method209(int i) {
		((Class367) this).anInt4237 = ((Class367) this).aClass76_4233.anInt748 * 971905895 * i;
		if (((Class367) this).anInt4237 > ((Class367) this).anInt4235) {
			if (((Class367) this).aLong4238 != 0L)
				IUnknown.Release(((Class367) this).aLong4238);
			int i_7_ = 8;
			int i_8_;
			if (((Class367) this).aBool4236) {
				i_8_ = 0;
				i_7_ |= 0x200;
			} else
				i_8_ = 1;
			((Class367) this).aLong4238 = (IDirect3DDevice.CreateIndexBuffer(((Class505_Sub2_Sub2) ((Class367) this).aClass505_Sub2_Sub2_4234).aLong10252, ((Class367) this).anInt4237, i_7_, (((Class367) this).aClass76_4233 == Class76.aClass76_752 ? 101 : 102), i_8_));
			((Class367) this).anInt4235 = ((Class367) this).anInt4237;
		}
	}

	void method6309() {
		if (((Class367) this).aLong4238 != 0L) {
			((Class367) this).aClass505_Sub2_Sub2_4234.method15650(((Class367) this).aLong4238);
			((Class367) this).aLong4238 = 0L;
		}
		((Class367) this).anInt4235 = 0;
		((Class367) this).anInt4237 = 0;
	}
}
