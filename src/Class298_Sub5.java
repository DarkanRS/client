/* Class298_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public class Class298_Sub5 extends Linkable {
	Class32 aClass32_7193;
	Class_xa_Sub3 aClass_xa_Sub3_7194;
	NativeHeapBuffer aNativeHeapBuffer7195;
	float aFloat7196;
	Class_ra_Sub2 aClass_ra_Sub2_7197;
	Class78 aClass78_7198;
	int anInt7199;
	int[] anIntArray7200;
	Class46_Sub1 aClass46_Sub1_7201;
	Stream aStream7202;

	void method2856(int i, int i_0_, int i_1_) {
		((Class298_Sub5) this).anIntArray7200[i_0_ * (((Class298_Sub5) this).aClass_xa_Sub3_7194.anInt6287 * -506105871) + i] |= 1 << i_1_;
	}

	void method2857(int i, int i_2_, int i_3_, float f) {
		if (((Class298_Sub5) this).anInt7199 != -1) {
			Class53 class53 = ((Class298_Sub5) this).aClass_ra_Sub2_7197.anInterface_ma5299.method174(((Class298_Sub5) this).anInt7199, 1908731420);
			int i_4_ = class53.aByte533 & 0xff;
			if (i_4_ != 0 && class53.aByte529 != 4) {
				int i_5_;
				if (i_3_ < 0)
					i_5_ = 0;
				else if (i_3_ > 127)
					i_5_ = 16777215;
				else
					i_5_ = 131586 * i_3_;
				if (i_4_ == 256)
					i_2_ = i_5_;
				else {
					int i_6_ = i_4_;
					int i_7_ = 256 - i_4_;
					i_2_ = (((i_5_ & 0xff00ff) * i_6_ + (i_2_ & 0xff00ff) * i_7_ & ~0xff00ff) + ((i_5_ & 0xff00) * i_6_ + (i_2_ & 0xff00) * i_7_ & 0xff0000)) >> 8;
				}
			}
			int i_8_ = class53.aByte534 & 0xff;
			if (i_8_ != 0) {
				i_8_ += 256;
				int i_9_ = ((i_2_ & 0xff0000) >> 16) * i_8_;
				if (i_9_ > 65535)
					i_9_ = 65535;
				int i_10_ = ((i_2_ & 0xff00) >> 8) * i_8_;
				if (i_10_ > 65535)
					i_10_ = 65535;
				int i_11_ = (i_2_ & 0xff) * i_8_;
				if (i_11_ > 65535)
					i_11_ = 65535;
				i_2_ = (i_9_ << 8 & 0xff0000) + (i_10_ & 0xff00) + (i_11_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_12_ = i_2_ >> 16 & 0xff;
			int i_13_ = i_2_ >> 8 & 0xff;
			int i_14_ = i_2_ & 0xff;
			i_12_ *= f;
			if (i_12_ < 0)
				i_12_ = 0;
			else if (i_12_ > 255)
				i_12_ = 255;
			i_13_ *= f;
			if (i_13_ < 0)
				i_13_ = 0;
			else if (i_13_ > 255)
				i_13_ = 255;
			i_14_ *= f;
			if (i_14_ < 0)
				i_14_ = 0;
			else if (i_14_ > 255)
				i_14_ = 255;
			i_2_ = i_12_ << 16 | i_13_ << 8 | i_14_;
		}
		((Class298_Sub5) this).aStream7202.b(i * 4);
		((Class298_Sub5) this).aStream7202.p((byte) (i_2_ >> 16));
		((Class298_Sub5) this).aStream7202.p((byte) (i_2_ >> 8));
		((Class298_Sub5) this).aStream7202.p((byte) i_2_);
	}

	void method2858(int i) {
		((Class298_Sub5) this).aStream7202.b(i * 4 + 3);
		((Class298_Sub5) this).aStream7202.p(-1);
	}

	void method2859(int i) {
		((Class298_Sub5) this).aNativeHeapBuffer7195 = ((Class_ra_Sub2) ((Class298_Sub5) this).aClass_ra_Sub2_7197).aNativeHeap8181.f(i * 4, true);
		((Class298_Sub5) this).aStream7202 = new Stream(((Class298_Sub5) this).aNativeHeapBuffer7195);
	}

	void method2860(int i) {
		((Class298_Sub5) this).aStream7202.x();
		Interface1 interface1 = (((Class298_Sub5) this).aClass_ra_Sub2_7197.method5245(4, ((Class298_Sub5) this).aNativeHeapBuffer7195, i * 4, false));
		if (interface1 instanceof Class40_Sub2)
			((Class298_Sub5) this).aNativeHeapBuffer7195.t();
		((Class298_Sub5) this).aClass32_7193 = new Class32(interface1, 5121, 4, 0);
		((Class298_Sub5) this).aNativeHeapBuffer7195 = null;
		((Class298_Sub5) this).aStream7202 = null;
	}

	Class298_Sub5(Class_xa_Sub3 class_xa_sub3, int i, int i_15_, Class78 class78) {
		((Class298_Sub5) this).aClass_xa_Sub3_7194 = class_xa_sub3;
		((Class298_Sub5) this).aClass_ra_Sub2_7197 = (((Class_xa_Sub3) ((Class298_Sub5) this).aClass_xa_Sub3_7194).aClass_ra_Sub2_8535);
		((Class298_Sub5) this).anInt7199 = i;
		((Class298_Sub5) this).aFloat7196 = (float) i_15_;
		((Class298_Sub5) this).aClass78_7198 = class78;
		((Class298_Sub5) this).anIntArray7200 = new int[(((Class298_Sub5) this).aClass_xa_Sub3_7194.anInt6287 * -506105871 * (((Class298_Sub5) this).aClass_xa_Sub3_7194.anInt6286 * -1148794921))];
		((Class298_Sub5) this).aClass46_Sub1_7201 = new Class46_Sub1(((Class298_Sub5) this).aClass_ra_Sub2_7197, 5123, null, 1);
	}

	void method2861(int[] is, int i) {
		int i_16_ = 0;
		RsFloatBuffer class298_sub53_sub1 = (((Class_ra_Sub2) ((Class298_Sub5) this).aClass_ra_Sub2_7197).aClass298_Sub53_Sub1_8197);
		class298_sub53_sub1.index = 0;
		if (((Class_ra_Sub2) ((Class298_Sub5) this).aClass_ra_Sub2_7197).aBoolean8143) {
			for (int i_17_ = 0; i_17_ < i; i_17_++) {
				int i_18_ = is[i_17_];
				short[] is_19_ = (((Class_xa_Sub3) ((Class298_Sub5) this).aClass_xa_Sub3_7194).aShortArrayArray8550[i_18_]);
				int i_20_ = ((Class298_Sub5) this).anIntArray7200[i_18_];
				if (i_20_ != 0 && is_19_ != null) {
					int i_21_ = 0;
					int i_22_ = 0;
					while (i_22_ < is_19_.length) {
						if ((i_20_ & 1 << i_21_++) != 0) {
							class298_sub53_sub1.writeShort((is_19_[i_22_++] & 0xffff), 16711935);
							i_16_++;
							class298_sub53_sub1.writeShort((is_19_[i_22_++] & 0xffff), 16711935);
							i_16_++;
							class298_sub53_sub1.writeShort((is_19_[i_22_++] & 0xffff), 16711935);
							i_16_++;
						} else
							i_22_ += 3;
					}
				}
			}
		} else {
			for (int i_23_ = 0; i_23_ < i; i_23_++) {
				int i_24_ = is[i_23_];
				short[] is_25_ = (((Class_xa_Sub3) ((Class298_Sub5) this).aClass_xa_Sub3_7194).aShortArrayArray8550[i_24_]);
				int i_26_ = ((Class298_Sub5) this).anIntArray7200[i_24_];
				if (i_26_ != 0 && is_25_ != null) {
					int i_27_ = 0;
					int i_28_ = 0;
					while (i_28_ < is_25_.length) {
						if ((i_26_ & 1 << i_27_++) != 0) {
							class298_sub53_sub1.method3587((is_25_[i_28_++] & 0xffff), 1368367793);
							i_16_++;
							class298_sub53_sub1.method3587((is_25_[i_28_++] & 0xffff), 1368367793);
							i_16_++;
							class298_sub53_sub1.method3587((is_25_[i_28_++] & 0xffff), 1368367793);
							i_16_++;
						} else
							i_28_ += 3;
					}
				}
			}
		}
		if (i_16_ > 0) {
			((Class298_Sub5) this).aClass46_Sub1_7201.method19(5123, class298_sub53_sub1.buffer, class298_sub53_sub1.index * 385051775);
			((Class298_Sub5) this).aClass_ra_Sub2_7197.method5248((((Class_xa_Sub3) ((Class298_Sub5) this).aClass_xa_Sub3_7194).aClass32_8539), (((Class_xa_Sub3) ((Class298_Sub5) this).aClass_xa_Sub3_7194).aClass32_8519), ((Class298_Sub5) this).aClass32_7193, (((Class_xa_Sub3) ((Class298_Sub5) this).aClass_xa_Sub3_7194).aClass32_8517));
			((Class298_Sub5) this).aClass_ra_Sub2_7197.method5278(((Class298_Sub5) this).anInt7199, ((((Class_xa_Sub3) ((Class298_Sub5) this).aClass_xa_Sub3_7194).anInt8523) & 0x7) != 0, ((((Class_xa_Sub3) ((Class298_Sub5) this).aClass_xa_Sub3_7194).anInt8523) & 0x8) != 0);
			if (((Class_ra_Sub2) ((Class298_Sub5) this).aClass_ra_Sub2_7197).aBoolean8146)
				((Class298_Sub5) this).aClass_ra_Sub2_7197.method5058(2147483647, ((Class298_Sub5) this).aClass78_7198);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(1.0F / ((Class298_Sub5) this).aFloat7196, 1.0F / ((Class298_Sub5) this).aFloat7196, 1.0F);
			OpenGL.glMatrixMode(5888);
			((Class298_Sub5) this).aClass_ra_Sub2_7197.method5248((((Class_xa_Sub3) ((Class298_Sub5) this).aClass_xa_Sub3_7194).aClass32_8539), (((Class_xa_Sub3) ((Class298_Sub5) this).aClass_xa_Sub3_7194).aClass32_8519), ((Class298_Sub5) this).aClass32_7193, (((Class_xa_Sub3) ((Class298_Sub5) this).aClass_xa_Sub3_7194).aClass32_8517));
			((Class298_Sub5) this).aClass_ra_Sub2_7197.method5254(((Class298_Sub5) this).aClass46_Sub1_7201, 4, 0, i_16_);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}
}
