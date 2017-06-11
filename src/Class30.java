/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public abstract class Class30 {
	boolean aBoolean368 = false;
	static int anInt369 = 3553;
	static int anInt370 = 34037;
	static int anInt371 = 34067;
	int anInt372;
	static int anInt373 = 5121;
	static int anInt374 = 32879;
	static int anInt375 = 3552;
	int anInt376;
	Class55 aClass55_377;
	Class77 aClass77_378;
	boolean aBoolean379;
	int anInt380;
	Class_ra_Sub2 aClass_ra_Sub2_381;
	static int[] anIntArray382 = new int[1];

	Class30(Class_ra_Sub2 class_ra_sub2, int i, Class55 class55, Class77 class77, int i_0_, boolean bool) {
		((Class30) this).aClass_ra_Sub2_381 = class_ra_sub2;
		((Class30) this).anInt372 = i;
		((Class30) this).aClass55_377 = class55;
		((Class30) this).aClass77_378 = class77;
		((Class30) this).aBoolean379 = bool;
		((Class30) this).anInt380 = i_0_;
		OpenGL.glGenTextures(1, anIntArray382, 0);
		((Class30) this).anInt376 = anIntArray382[0];
		method409(0);
	}

	void method407() {
		((Class30) this).aClass_ra_Sub2_381.method5256(this);
		if (((Class30) this).aBoolean368) {
			OpenGL.glTexParameteri(((Class30) this).anInt372, 10241, ((Class30) this).aBoolean379 ? 9987 : 9729);
			OpenGL.glTexParameteri(((Class30) this).anInt372, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(((Class30) this).anInt372, 10241, ((Class30) this).aBoolean379 ? 9984 : 9728);
			OpenGL.glTexParameteri(((Class30) this).anInt372, 10240, 9728);
		}
	}

	void method408() {
		if (((Class30) this).anInt376 > 0) {
			((Class_ra_Sub2) ((Class30) this).aClass_ra_Sub2_381).anInt8175 -= method416();
			int[] is = new int[1];
			is[0] = ((Class30) this).anInt376;
			OpenGL.glDeleteTextures(1, is, 0);
			((Class30) this).anInt376 = 0;
		}
	}

	void method409(int i) {
		((Class_ra_Sub2) ((Class30) this).aClass_ra_Sub2_381).anInt8175 -= i;
		((Class_ra_Sub2) ((Class30) this).aClass_ra_Sub2_381).anInt8175 += method416();
	}

	void method410(boolean bool) {
		if (((Class30) this).aBoolean368 != bool) {
			((Class30) this).aBoolean368 = bool;
			method407();
		}
	}

	static void method411(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int[] is) {
		if (i_2_ > 0 && !Class486.method6152(i_2_, 1883323827))
			throw new IllegalArgumentException("");
		if (i_3_ > 0 && !Class486.method6152(i_3_, 1954585128))
			throw new IllegalArgumentException("");
		if (i_4_ != 32993)
			throw new IllegalArgumentException("");
		int i_6_ = 0;
		int i_7_ = i_2_ < i_3_ ? i_2_ : i_3_;
		int i_8_ = i_2_ >> 1;
		int i_9_ = i_3_ >> 1;
		int[] is_10_ = is;
		int[] is_11_ = new int[i_8_ * i_9_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_6_, i_1_, i_2_, i_3_, 0, i_4_, i_5_, is_10_, 0);
			if (i_7_ <= 1)
				break;
			int i_12_ = 0;
			int i_13_ = 0;
			int i_14_ = i_13_ + i_2_;
			for (int i_15_ = 0; i_15_ < i_9_; i_15_++) {
				for (int i_16_ = 0; i_16_ < i_8_; i_16_++) {
					int i_17_ = is_10_[i_13_++];
					int i_18_ = is_10_[i_13_++];
					int i_19_ = is_10_[i_14_++];
					int i_20_ = is_10_[i_14_++];
					int i_21_ = i_17_ >> 24 & 0xff;
					int i_22_ = i_17_ >> 16 & 0xff;
					int i_23_ = i_17_ >> 8 & 0xff;
					int i_24_ = i_17_ & 0xff;
					i_21_ += i_18_ >> 24 & 0xff;
					i_22_ += i_18_ >> 16 & 0xff;
					i_23_ += i_18_ >> 8 & 0xff;
					i_24_ += i_18_ & 0xff;
					i_21_ += i_19_ >> 24 & 0xff;
					i_22_ += i_19_ >> 16 & 0xff;
					i_23_ += i_19_ >> 8 & 0xff;
					i_24_ += i_19_ & 0xff;
					i_21_ += i_20_ >> 24 & 0xff;
					i_22_ += i_20_ >> 16 & 0xff;
					i_23_ += i_20_ >> 8 & 0xff;
					i_24_ += i_20_ & 0xff;
					is_11_[i_12_++] = ((i_21_ & 0x3fc) << 22 | (i_22_ & 0x3fc) << 14 | (i_23_ & 0x3fc) << 6 | (i_24_ & 0x3fc) >> 2);
				}
				i_13_ += i_2_;
				i_14_ += i_2_;
			}
			int[] is_25_ = is_11_;
			is_11_ = is_10_;
			is_10_ = is_25_;
			i_2_ = i_8_;
			i_3_ = i_9_;
			i_8_ >>= 1;
			i_9_ >>= 1;
			i_7_ >>= 1;
			i_6_++;
		}
	}

	static void method412(int i, int i_26_, int i_27_, int i_28_, Class55 class55, byte[] is) {
		if (i_27_ > 0 && !Class486.method6152(i_27_, 2122015724))
			throw new IllegalArgumentException("");
		if (i_28_ > 0 && !Class486.method6152(i_28_, 2088094849))
			throw new IllegalArgumentException("");
		int i_29_ = class55.anInt556 * 845115459;
		int i_30_ = 0;
		int i_31_ = i_27_ < i_28_ ? i_27_ : i_28_;
		int i_32_ = i_27_ >> 1;
		int i_33_ = i_28_ >> 1;
		byte[] is_34_ = is;
		byte[] is_35_ = new byte[i_32_ * i_33_ * i_29_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_30_, i_26_, i_27_, i_28_, 0, Class_ra_Sub2.method5228(class55), 5121, is_34_, 0);
			if (i_31_ <= 1)
				break;
			int i_36_ = i_27_ * i_29_;
			for (int i_37_ = 0; i_37_ < i_29_; i_37_++) {
				int i_38_ = i_37_;
				int i_39_ = i_37_;
				int i_40_ = i_39_ + i_36_;
				for (int i_41_ = 0; i_41_ < i_33_; i_41_++) {
					for (int i_42_ = 0; i_42_ < i_32_; i_42_++) {
						int i_43_ = is_34_[i_39_];
						i_39_ += i_29_;
						i_43_ += is_34_[i_39_];
						i_39_ += i_29_;
						i_43_ += is_34_[i_40_];
						i_40_ += i_29_;
						i_43_ += is_34_[i_40_];
						i_40_ += i_29_;
						is_35_[i_38_] = (byte) (i_43_ >> 2);
						i_38_ += i_29_;
					}
					i_39_ += i_36_;
					i_40_ += i_36_;
				}
			}
			byte[] is_44_ = is_35_;
			is_35_ = is_34_;
			is_34_ = is_44_;
			i_27_ = i_32_;
			i_28_ = i_33_;
			i_32_ >>= 1;
			i_33_ >>= 1;
			i_31_ >>= 1;
			i_30_++;
		}
	}

	boolean method413() {
		if (((Class_ra_Sub2) ((Class30) this).aClass_ra_Sub2_381).aBoolean8170) {
			int i = method416();
			((Class30) this).aClass_ra_Sub2_381.method5256(this);
			OpenGL.glGenerateMipmapEXT(((Class30) this).anInt372);
			((Class30) this).aBoolean379 = true;
			method407();
			method409(i);
			return true;
		}
		return false;
	}

	void method414(boolean bool) {
		if (((Class30) this).aBoolean379 != bool) {
			int i = method416();
			((Class30) this).aBoolean379 = true;
			method407();
			method409(i);
		}
	}

	static void method415(int i, int i_45_, int i_46_, int i_47_, Class55 class55, float[] fs) {
		if (i_46_ > 0 && !Class486.method6152(i_46_, 2081148754))
			throw new IllegalArgumentException("");
		if (i_47_ > 0 && !Class486.method6152(i_47_, 2048879832))
			throw new IllegalArgumentException("");
		int i_48_ = class55.anInt556 * 845115459;
		int i_49_ = 0;
		int i_50_ = i_46_ < i_47_ ? i_46_ : i_47_;
		int i_51_ = i_46_ >> 1;
		int i_52_ = i_47_ >> 1;
		float[] fs_53_ = fs;
		float[] fs_54_ = new float[i_51_ * i_52_ * i_48_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_49_, i_45_, i_46_, i_47_, 0, Class_ra_Sub2.method5228(class55), 5126, fs_53_, 0);
			if (i_50_ <= 1)
				break;
			int i_55_ = i_46_ * i_48_;
			for (int i_56_ = 0; i_56_ < i_48_; i_56_++) {
				int i_57_ = i_56_;
				int i_58_ = i_56_;
				int i_59_ = i_58_ + i_55_;
				for (int i_60_ = 0; i_60_ < i_52_; i_60_++) {
					for (int i_61_ = 0; i_61_ < i_51_; i_61_++) {
						float f = fs_53_[i_58_];
						i_58_ += i_48_;
						f += fs_53_[i_58_];
						i_58_ += i_48_;
						f += fs_53_[i_59_];
						i_59_ += i_48_;
						f += fs_53_[i_59_];
						i_59_ += i_48_;
						fs_54_[i_57_] = f * 0.25F;
						i_57_ += i_48_;
					}
					i_58_ += i_55_;
					i_59_ += i_55_;
				}
			}
			float[] fs_62_ = fs_54_;
			fs_54_ = fs_53_;
			fs_53_ = fs_62_;
			i_46_ = i_51_;
			i_47_ = i_52_;
			i_51_ >>= 1;
			i_52_ >>= 1;
			i_50_ >>= 1;
			i_49_++;
		}
	}

	int method416() {
		int i = (((Class30) this).aClass55_377.anInt556 * 845115459 * (((Class30) this).aClass77_378.anInt724 * 685647847) * ((Class30) this).anInt380);
		return ((Class30) this).aBoolean379 ? i * 4 / 3 : i;
	}

	void method417() {
		if (((Class30) this).anInt376 > 0) {
			((Class30) this).aClass_ra_Sub2_381.method5229(((Class30) this).anInt376, method416());
			((Class30) this).anInt376 = 0;
		}
	}
}
