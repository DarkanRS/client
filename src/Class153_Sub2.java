/* Class153_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class153_Sub2 extends Class153 {
	long aLong8623 = 0L;
	Class_ra_Sub3_Sub2 aClass_ra_Sub3_Sub2_8624;

	void method1657(ByteBuffer bytebuffer, short i, short i_0_, byte i_1_, byte i_2_, byte i_3_, byte i_4_) {
		bytebuffer.putShort(i);
		bytebuffer.putShort(i_0_);
		bytebuffer.put(i_1_);
		bytebuffer.put(i_2_);
		bytebuffer.put(i_3_);
		bytebuffer.put(i_4_);
	}

	public void b() {
		if (((Class153_Sub2) this).aLong8623 != 0L) {
			IUnknown.Release(((Class153_Sub2) this).aLong8623);
			((Class153_Sub2) this).aLong8623 = 0L;
		}
		((Class153_Sub2) this).aClass_ra_Sub3_Sub2_8624.method5293(this);
	}

	void method1658() {
		if (((Class153_Sub2) this).aLong8623 != 0L) {
			((Class153_Sub2) this).aClass_ra_Sub3_Sub2_8624.method5552(((Class153_Sub2) this).aLong8623);
			((Class153_Sub2) this).aLong8623 = 0L;
		}
	}

	public void u() {
		if (((Class153_Sub2) this).aLong8623 != 0L) {
			IUnknown.Release(((Class153_Sub2) this).aLong8623);
			((Class153_Sub2) this).aLong8623 = 0L;
		}
		((Class153_Sub2) this).aClass_ra_Sub3_Sub2_8624.method5293(this);
	}

	public void d() {
		if (((Class153_Sub2) this).aLong8623 != 0L) {
			IUnknown.Release(((Class153_Sub2) this).aLong8623);
			((Class153_Sub2) this).aLong8623 = 0L;
		}
		((Class153_Sub2) this).aClass_ra_Sub3_Sub2_8624.method5293(this);
	}

	public void x() {
		if (((Class153_Sub2) this).aLong8623 != 0L) {
			IUnknown.Release(((Class153_Sub2) this).aLong8623);
			((Class153_Sub2) this).aLong8623 = 0L;
		}
		((Class153_Sub2) this).aClass_ra_Sub3_Sub2_8624.method5293(this);
	}

	Class153_Sub2(Class_ra_Sub3_Sub2 class_ra_sub3_sub2, Class181[] class181s) {
		super(class181s);
		((Class153_Sub2) this).aClass_ra_Sub3_Sub2_8624 = class_ra_sub3_sub2;
		byte i = 0;
		ByteBuffer bytebuffer = ((Class153_Sub2) this).aClass_ra_Sub3_Sub2_8624.aByteBuffer8216;
		bytebuffer.clear();
		for (short i_5_ = 0; i_5_ < aClass181Array6405.length; i_5_++) {
			short i_6_ = 0;
			Class181 class181 = aClass181Array6405[i_5_];
			for (int i_7_ = 0; i_7_ < class181.method1842(); i_7_++) {
				Class155 class155 = class181.method1839(i_7_);
				if (class155 == Class155.aClass155_1610)
					method1657(bytebuffer, i_5_, i_6_, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
				else if (class155 == Class155.aClass155_1596)
					method1657(bytebuffer, i_5_, i_6_, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
				else if (class155 == Class155.aClass155_1597)
					method1657(bytebuffer, i_5_, i_6_, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
				else if (class155 == Class155.aClass155_1601) {
					Class153_Sub2 class153_sub2_8_ = this;
					ByteBuffer bytebuffer_9_ = bytebuffer;
					short i_10_ = i_5_;
					short i_11_ = i_6_;
					byte i_12_ = 0;
					byte i_13_ = 0;
					byte i_14_ = 5;
					byte i_15_ = i;
					i++;
					class153_sub2_8_.method1657(bytebuffer_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_);
				} else if (class155 == Class155.aClass155_1599) {
					Class153_Sub2 class153_sub2_16_ = this;
					ByteBuffer bytebuffer_17_ = bytebuffer;
					short i_18_ = i_5_;
					short i_19_ = i_6_;
					byte i_20_ = 1;
					byte i_21_ = 0;
					byte i_22_ = 5;
					byte i_23_ = i;
					i++;
					class153_sub2_16_.method1657(bytebuffer_17_, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_);
				} else if (class155 == Class155.aClass155_1600) {
					Class153_Sub2 class153_sub2_24_ = this;
					ByteBuffer bytebuffer_25_ = bytebuffer;
					short i_26_ = i_5_;
					short i_27_ = i_6_;
					byte i_28_ = 2;
					byte i_29_ = 0;
					byte i_30_ = 5;
					byte i_31_ = i;
					i++;
					class153_sub2_24_.method1657(bytebuffer_25_, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_);
				} else if (class155 == Class155.aClass155_1598) {
					Class153_Sub2 class153_sub2_32_ = this;
					ByteBuffer bytebuffer_33_ = bytebuffer;
					short i_34_ = i_5_;
					short i_35_ = i_6_;
					byte i_36_ = 3;
					byte i_37_ = 0;
					byte i_38_ = 5;
					byte i_39_ = i;
					i++;
					class153_sub2_32_.method1657(bytebuffer_33_, i_34_, i_35_, i_36_, i_37_, i_38_, i_39_);
				}
				i_6_ += class155.anInt1611;
			}
		}
		method1657(bytebuffer, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
		((Class153_Sub2) this).aLong8623 = (IDirect3DDevice.CreateVertexDeclaration(((Class_ra_Sub3_Sub2) ((Class153_Sub2) this).aClass_ra_Sub3_Sub2_8624).aLong9847, ((Class153_Sub2) this).aClass_ra_Sub3_Sub2_8624.aLong8217));
		((Class153_Sub2) this).aClass_ra_Sub3_Sub2_8624.method5323(this);
	}
}
