import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;

public class Class367 implements Interface32 {

	long aLong4238 = 0L;
	int anInt4235;
	int anInt4237;
	GraphicalRenderer_Sub2_Sub2 aGraphicalRenderer_Sub2_Sub2_4234;
	Class76 aClass76_4233;
	boolean aBool4236;

	public void method44() {
		IDirect3DIndexBuffer.Unlock(this.aLong4238);
	}

	public int method39() {
		return this.anInt4237;
	}

	public boolean method35(int i_1, int i_2, long long_3) {
		return Class25.method751(IDirect3DIndexBuffer.Upload(this.aLong4238, i_1, i_2, this.aBool4236 ? 8192 : 0, long_3));
	}

	public long method40(int i_1, int i_2) {
		return IDirect3DIndexBuffer.Lock(this.aLong4238, i_1, i_2, this.aBool4236 ? 8192 : 0);
	}

	public void method38() {
		IDirect3DIndexBuffer.Unlock(this.aLong4238);
	}

	public int method36() {
		return this.anInt4237;
	}

	public void method26() {
		if (this.aLong4238 != 0L) {
			IUnknown.Release(this.aLong4238);
			this.aLong4238 = 0L;
		}

		this.anInt4235 = 0;
		this.anInt4237 = 0;
		this.aGraphicalRenderer_Sub2_Sub2_4234.method13885(this);
	}

	Class367(GraphicalRenderer_Sub2_Sub2 class505_sub2_sub2_1, Class76 class76_2, boolean bool_3) {
		this.aGraphicalRenderer_Sub2_Sub2_4234 = class505_sub2_sub2_1;
		this.aClass76_4233 = class76_2;
		this.aBool4236 = bool_3;
		this.aGraphicalRenderer_Sub2_Sub2_4234.method13901(this);
	}

	public void finalize() {
		this.method6308();
	}

	public void method32() {
		if (this.aLong4238 != 0L) {
			IUnknown.Release(this.aLong4238);
			this.aLong4238 = 0L;
		}

		this.anInt4235 = 0;
		this.anInt4237 = 0;
		this.aGraphicalRenderer_Sub2_Sub2_4234.method13885(this);
	}

	public long method37(int i_1, int i_2) {
		return IDirect3DIndexBuffer.Lock(this.aLong4238, i_1, i_2, this.aBool4236 ? 8192 : 0);
	}

	public void method208(int i_1) {
		this.anInt4237 = this.aClass76_4233.anInt748 * i_1;
		if (this.anInt4237 > this.anInt4235) {
			if (this.aLong4238 != 0L) {
				IUnknown.Release(this.aLong4238);
			}

			int i_2 = 8;
			byte b_3;
			if (this.aBool4236) {
				b_3 = 0;
				i_2 |= 0x200;
			} else {
				b_3 = 1;
			}

			this.aLong4238 = IDirect3DDevice.CreateIndexBuffer(this.aGraphicalRenderer_Sub2_Sub2_4234.aLong10252, this.anInt4237, i_2, this.aClass76_4233 == Class76.aClass76_752 ? 101 : 102, b_3);
			this.anInt4235 = this.anInt4237;
		}

	}

	public void method43() {
		IDirect3DIndexBuffer.Unlock(this.aLong4238);
	}

	public long method41(int i_1, int i_2) {
		return IDirect3DIndexBuffer.Lock(this.aLong4238, i_1, i_2, this.aBool4236 ? 8192 : 0);
	}

	public boolean method42(int i_1, int i_2, long long_3) {
		return Class25.method751(IDirect3DIndexBuffer.Upload(this.aLong4238, i_1, i_2, this.aBool4236 ? 8192 : 0, long_3));
	}

	void method6308() {
		if (this.aLong4238 != 0L) {
			this.aGraphicalRenderer_Sub2_Sub2_4234.method15650(this.aLong4238);
			this.aLong4238 = 0L;
		}

		this.anInt4235 = 0;
		this.anInt4237 = 0;
	}

	public void method209(int i_1) {
		this.anInt4237 = this.aClass76_4233.anInt748 * -704130985 * 971905895 * i_1;
		if (this.anInt4237 > this.anInt4235) {
			if (this.aLong4238 != 0L) {
				IUnknown.Release(this.aLong4238);
			}

			int i_2 = 8;
			byte b_3;
			if (this.aBool4236) {
				b_3 = 0;
				i_2 |= 0x200;
			} else {
				b_3 = 1;
			}

			this.aLong4238 = IDirect3DDevice.CreateIndexBuffer(this.aGraphicalRenderer_Sub2_Sub2_4234.aLong10252, this.anInt4237, i_2, this.aClass76_4233 == Class76.aClass76_752 ? 101 : 102, b_3);
			this.anInt4235 = this.anInt4237;
		}

	}

}
