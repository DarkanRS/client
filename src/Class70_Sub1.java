
/* Class70_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class70_Sub1 extends Class70 {
	Class505_Sub2_Sub2 aClass505_Sub2_Sub2_9178;
	long aLong9179 = 0L;

	Class70_Sub1(Class505_Sub2_Sub2 class505_sub2_sub2, Class72[] class72s) {
		super(class72s);
		((Class70_Sub1) this).aClass505_Sub2_Sub2_9178 = class505_sub2_sub2;
		byte i = 0;
		ByteBuffer bytebuffer = ((Class70_Sub1) this).aClass505_Sub2_Sub2_9178.aByteBuffer8838;
		bytebuffer.clear();
		for (short i_0_ = 0; i_0_ < aClass72Array707.length; i_0_++) {
			short i_1_ = 0;
			Class72 class72 = aClass72Array707[i_0_];
			for (int i_2_ = 0; i_2_ < class72.method1296(); i_2_++) {
				Class69 class69 = class72.method1297(i_2_);
				if (class69 == Class69.aClass69_695)
					method14506(bytebuffer, i_0_, i_1_, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
				else if (class69 == Class69.aClass69_689)
					method14506(bytebuffer, i_0_, i_1_, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
				else if (class69 == Class69.aClass69_690)
					method14506(bytebuffer, i_0_, i_1_, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
				else if (class69 == Class69.aClass69_691) {
					Class70_Sub1 class70_sub1_3_ = this;
					ByteBuffer bytebuffer_4_ = bytebuffer;
					short i_5_ = i_0_;
					short i_6_ = i_1_;
					byte i_7_ = 0;
					byte i_8_ = 0;
					byte i_9_ = 5;
					byte i_10_ = i;
					i++;
					class70_sub1_3_.method14506(bytebuffer_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_);
				} else if (class69 == Class69.aClass69_692) {
					Class70_Sub1 class70_sub1_11_ = this;
					ByteBuffer bytebuffer_12_ = bytebuffer;
					short i_13_ = i_0_;
					short i_14_ = i_1_;
					byte i_15_ = 1;
					byte i_16_ = 0;
					byte i_17_ = 5;
					byte i_18_ = i;
					i++;
					class70_sub1_11_.method14506(bytebuffer_12_, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_);
				} else if (class69 == Class69.aClass69_693) {
					Class70_Sub1 class70_sub1_19_ = this;
					ByteBuffer bytebuffer_20_ = bytebuffer;
					short i_21_ = i_0_;
					short i_22_ = i_1_;
					byte i_23_ = 2;
					byte i_24_ = 0;
					byte i_25_ = 5;
					byte i_26_ = i;
					i++;
					class70_sub1_19_.method14506(bytebuffer_20_, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_);
				} else if (class69 == Class69.aClass69_694) {
					Class70_Sub1 class70_sub1_27_ = this;
					ByteBuffer bytebuffer_28_ = bytebuffer;
					short i_29_ = i_0_;
					short i_30_ = i_1_;
					byte i_31_ = 3;
					byte i_32_ = 0;
					byte i_33_ = 5;
					byte i_34_ = i;
					i++;
					class70_sub1_27_.method14506(bytebuffer_28_, i_29_, i_30_, i_31_, i_32_, i_33_, i_34_);
				}
				i_1_ += class69.anInt704;
			}
		}
		method14506(bytebuffer, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
		((Class70_Sub1) this).aLong9179 = (IDirect3DDevice.CreateVertexDeclaration(((Class505_Sub2_Sub2) ((Class70_Sub1) this).aClass505_Sub2_Sub2_9178).aLong10252, ((Class70_Sub1) this).aClass505_Sub2_Sub2_9178.aLong8695));
		((Class70_Sub1) this).aClass505_Sub2_Sub2_9178.method13901(this);
	}

	void method14504(ByteBuffer bytebuffer, short i, short i_35_, byte i_36_, byte i_37_, byte i_38_, byte i_39_) {
		bytebuffer.putShort(i);
		bytebuffer.putShort(i_35_);
		bytebuffer.put(i_36_);
		bytebuffer.put(i_37_);
		bytebuffer.put(i_38_);
		bytebuffer.put(i_39_);
	}

	public void method26() {
		if (((Class70_Sub1) this).aLong9179 != 0L) {
			IUnknown.Release(((Class70_Sub1) this).aLong9179);
			((Class70_Sub1) this).aLong9179 = 0L;
		}
		((Class70_Sub1) this).aClass505_Sub2_Sub2_9178.method13885(this);
	}

	void method14505() {
		if (((Class70_Sub1) this).aLong9179 != 0L) {
			((Class70_Sub1) this).aClass505_Sub2_Sub2_9178.method15650(((Class70_Sub1) this).aLong9179);
			((Class70_Sub1) this).aLong9179 = 0L;
		}
	}

	public void finalize() {
		method14505();
	}

	void method14506(ByteBuffer bytebuffer, short i, short i_40_, byte i_41_, byte i_42_, byte i_43_, byte i_44_) {
		bytebuffer.putShort(i);
		bytebuffer.putShort(i_40_);
		bytebuffer.put(i_41_);
		bytebuffer.put(i_42_);
		bytebuffer.put(i_43_);
		bytebuffer.put(i_44_);
	}

	void method14507() {
		method14505();
	}

	void method14508() {
		method14505();
	}

	public void method32() {
		if (((Class70_Sub1) this).aLong9179 != 0L) {
			IUnknown.Release(((Class70_Sub1) this).aLong9179);
			((Class70_Sub1) this).aLong9179 = 0L;
		}
		((Class70_Sub1) this).aClass505_Sub2_Sub2_9178.method13885(this);
	}

	void method14509() {
		if (((Class70_Sub1) this).aLong9179 != 0L) {
			((Class70_Sub1) this).aClass505_Sub2_Sub2_9178.method15650(((Class70_Sub1) this).aLong9179);
			((Class70_Sub1) this).aLong9179 = 0L;
		}
	}

	void method14510() {
		if (((Class70_Sub1) this).aLong9179 != 0L) {
			((Class70_Sub1) this).aClass505_Sub2_Sub2_9178.method15650(((Class70_Sub1) this).aLong9179);
			((Class70_Sub1) this).aLong9179 = 0L;
		}
	}
}
