/* Class263 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public abstract class Class263 implements Interface9 {
	boolean aBoolean6411;
	static int anInt6412 = 3553;
	static int anInt6413 = 34037;
	static int anInt6414 = 34067;
	int anInt6415;
	int anInt6416;
	int anInt6417;
	Class179 aClass179_6418 = Class179.aClass179_1812;
	Class55 aClass55_6419;
	Class77 aClass77_6420;
	static int anInt6421 = 0;
	Class_ra_Sub3_Sub1 aClass_ra_Sub3_Sub1_6422;
	static int anInt6423 = 32879;
	static int[] anIntArray6424 = new int[1];

	public void method123() {
		int i = ((Class263) this).aClass_ra_Sub3_Sub1_6422.method5386();
		int i_0_ = (((Class_ra_Sub3_Sub1) ((Class263) this).aClass_ra_Sub3_Sub1_6422).anIntArray9831[i]);
		if (i_0_ != ((Class263) this).anInt6415) {
			if (i_0_ != 0) {
				OpenGL.glBindTexture(i_0_, 0);
				OpenGL.glDisable(i_0_);
			}
			OpenGL.glEnable(((Class263) this).anInt6415);
			((Class_ra_Sub3_Sub1) ((Class263) this).aClass_ra_Sub3_Sub1_6422).anIntArray9831[i] = ((Class263) this).anInt6415;
		}
		OpenGL.glBindTexture(((Class263) this).anInt6415, ((Class263) this).anInt6417);
	}

	public void method128() {
		int i = ((Class263) this).aClass_ra_Sub3_Sub1_6422.method5386();
		int i_1_ = (((Class_ra_Sub3_Sub1) ((Class263) this).aClass_ra_Sub3_Sub1_6422).anIntArray9831[i]);
		if (i_1_ != ((Class263) this).anInt6415) {
			if (i_1_ != 0) {
				OpenGL.glBindTexture(i_1_, 0);
				OpenGL.glDisable(i_1_);
			}
			OpenGL.glEnable(((Class263) this).anInt6415);
			((Class_ra_Sub3_Sub1) ((Class263) this).aClass_ra_Sub3_Sub1_6422).anIntArray9831[i] = ((Class263) this).anInt6415;
		}
		OpenGL.glBindTexture(((Class263) this).anInt6415, ((Class263) this).anInt6417);
	}

	public void method122(Class179 class179) {
		if (((Class263) this).aClass179_6418 != class179) {
			((Class263) this).aClass179_6418 = class179;
			method2467();
		}
	}

	void method2467() {
		((Class263) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		if (((Class263) this).aClass179_6418 == Class179.aClass179_1812) {
			OpenGL.glTexParameteri(((Class263) this).anInt6415, 10241, (((Class263) this).aBoolean6411 ? 9987 : 9729));
			OpenGL.glTexParameteri(((Class263) this).anInt6415, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(((Class263) this).anInt6415, 10241, (((Class263) this).aBoolean6411 ? 9984 : 9728));
			OpenGL.glTexParameteri(((Class263) this).anInt6415, 10240, 9728);
		}
	}

	boolean method103() {
		int i = method2471();
		((Class263) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glGenerateMipmapEXT(((Class263) this).anInt6415);
		((Class263) this).aBoolean6411 = true;
		method2467();
		method2470(i);
		return true;
	}

	void method2468(int i, int i_2_, int i_3_, int[] is) {
		if (i_2_ > 0 && !Class486.method6152(i_2_, 2042466148))
			throw new IllegalArgumentException("");
		if (i_3_ > 0 && !Class486.method6152(i_3_, 1957388461))
			throw new IllegalArgumentException("");
		if (((Class263) this).aClass55_6419 != Class55.aClass55_557)
			throw new IllegalArgumentException("");
		int i_4_ = 0;
		int i_5_ = i_2_ < i_3_ ? i_2_ : i_3_;
		int i_6_ = i_2_ >> 1;
		int i_7_ = i_3_ >> 1;
		int[] is_8_ = is;
		int[] is_9_ = new int[i_6_ * i_7_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_4_, Class_ra_Sub3_Sub1.method5533(((Class263) this).aClass55_6419, (((Class263) this).aClass77_6420)), i_2_, i_3_, 0, 32993, ((Class_ra_Sub3_Sub1) ((Class263) this).aClass_ra_Sub3_Sub1_6422).anInt9841, is_8_, 0);
			if (i_5_ <= 1)
				break;
			int i_10_ = 0;
			int i_11_ = 0;
			int i_12_ = i_11_ + i_2_;
			for (int i_13_ = 0; i_13_ < i_7_; i_13_++) {
				for (int i_14_ = 0; i_14_ < i_6_; i_14_++) {
					int i_15_ = is_8_[i_11_++];
					int i_16_ = is_8_[i_11_++];
					int i_17_ = is_8_[i_12_++];
					int i_18_ = is_8_[i_12_++];
					int i_19_ = i_15_ >> 24 & 0xff;
					int i_20_ = i_15_ >> 16 & 0xff;
					int i_21_ = i_15_ >> 8 & 0xff;
					int i_22_ = i_15_ & 0xff;
					i_19_ += i_16_ >> 24 & 0xff;
					i_20_ += i_16_ >> 16 & 0xff;
					i_21_ += i_16_ >> 8 & 0xff;
					i_22_ += i_16_ & 0xff;
					i_19_ += i_17_ >> 24 & 0xff;
					i_20_ += i_17_ >> 16 & 0xff;
					i_21_ += i_17_ >> 8 & 0xff;
					i_22_ += i_17_ & 0xff;
					i_19_ += i_18_ >> 24 & 0xff;
					i_20_ += i_18_ >> 16 & 0xff;
					i_21_ += i_18_ >> 8 & 0xff;
					i_22_ += i_18_ & 0xff;
					is_9_[i_10_++] = ((i_19_ & 0x3fc) << 22 | (i_20_ & 0x3fc) << 14 | (i_21_ & 0x3fc) << 6 | (i_22_ & 0x3fc) >> 2);
				}
				i_11_ += i_2_;
				i_12_ += i_2_;
			}
			int[] is_23_ = is_9_;
			is_9_ = is_8_;
			is_8_ = is_23_;
			i_2_ = i_6_;
			i_3_ = i_7_;
			i_6_ >>= 1;
			i_7_ >>= 1;
			i_5_ >>= 1;
			i_4_++;
		}
	}

	void method2469(int i, int i_24_, int i_25_, float[] fs) {
		if (i_24_ > 0 && !Class486.method6152(i_24_, 1815330854))
			throw new IllegalArgumentException("");
		if (i_25_ > 0 && !Class486.method6152(i_25_, 1992937673))
			throw new IllegalArgumentException("");
		int i_26_ = ((Class263) this).aClass55_6419.anInt556 * 845115459;
		int i_27_ = 0;
		int i_28_ = i_24_ < i_25_ ? i_24_ : i_25_;
		int i_29_ = i_24_ >> 1;
		int i_30_ = i_25_ >> 1;
		float[] fs_31_ = fs;
		float[] fs_32_ = new float[i_29_ * i_30_ * i_26_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_27_, Class_ra_Sub3_Sub1.method5533(((Class263) this).aClass55_6419, (((Class263) this).aClass77_6420)), i_24_, i_25_, 0, Class_ra_Sub3_Sub1.method5532(((Class263) this).aClass55_6419), 5126, fs_31_, 0);
			if (i_28_ <= 1)
				break;
			int i_33_ = i_24_ * i_26_;
			for (int i_34_ = 0; i_34_ < i_26_; i_34_++) {
				int i_35_ = i_34_;
				int i_36_ = i_34_;
				int i_37_ = i_36_ + i_33_;
				for (int i_38_ = 0; i_38_ < i_30_; i_38_++) {
					for (int i_39_ = 0; i_39_ < i_29_; i_39_++) {
						float f = fs_31_[i_36_];
						i_36_ += i_26_;
						f += fs_31_[i_36_];
						i_36_ += i_26_;
						f += fs_31_[i_37_];
						i_37_ += i_26_;
						f += fs_31_[i_37_];
						i_37_ += i_26_;
						fs_32_[i_35_] = f * 0.25F;
						i_35_ += i_26_;
					}
					i_36_ += i_33_;
					i_37_ += i_33_;
				}
			}
			float[] fs_40_ = fs_32_;
			fs_32_ = fs_31_;
			fs_31_ = fs_40_;
			i_24_ = i_29_;
			i_25_ = i_30_;
			i_29_ >>= 1;
			i_30_ >>= 1;
			i_28_ >>= 1;
			i_27_++;
		}
	}

	void method2470(int i) {
		((Class263) this).aClass_ra_Sub3_Sub1_6422.anInt8223 -= i;
		((Class263) this).aClass_ra_Sub3_Sub1_6422.anInt8223 += method2471();
	}

	int method2471() {
		int i = (((Class263) this).aClass55_6419.anInt556 * 845115459 * (((Class263) this).aClass77_6420.anInt724 * 685647847) * ((Class263) this).anInt6416);
		return ((Class263) this).aBoolean6411 ? i * 4 / 3 : i;
	}

	public void method124(Class179 class179) {
		if (((Class263) this).aClass179_6418 != class179) {
			((Class263) this).aClass179_6418 = class179;
			method2467();
		}
	}

	public void d() {
		if (((Class263) this).anInt6417 > 0) {
			((Class263) this).aClass_ra_Sub3_Sub1_6422.method5529(((Class263) this).anInt6417, method2471());
			((Class263) this).anInt6417 = 0;
		}
	}

	public void u() {
		if (((Class263) this).anInt6417 > 0) {
			((Class263) this).aClass_ra_Sub3_Sub1_6422.method5529(((Class263) this).anInt6417, method2471());
			((Class263) this).anInt6417 = 0;
		}
	}

	public void method125() {
		int i = ((Class263) this).aClass_ra_Sub3_Sub1_6422.method5386();
		int i_41_ = (((Class_ra_Sub3_Sub1) ((Class263) this).aClass_ra_Sub3_Sub1_6422).anIntArray9831[i]);
		if (i_41_ != ((Class263) this).anInt6415) {
			if (i_41_ != 0) {
				OpenGL.glBindTexture(i_41_, 0);
				OpenGL.glDisable(i_41_);
			}
			OpenGL.glEnable(((Class263) this).anInt6415);
			((Class_ra_Sub3_Sub1) ((Class263) this).aClass_ra_Sub3_Sub1_6422).anIntArray9831[i] = ((Class263) this).anInt6415;
		}
		OpenGL.glBindTexture(((Class263) this).anInt6415, ((Class263) this).anInt6417);
	}

	public void method126() {
		int i = ((Class263) this).aClass_ra_Sub3_Sub1_6422.method5386();
		int i_42_ = (((Class_ra_Sub3_Sub1) ((Class263) this).aClass_ra_Sub3_Sub1_6422).anIntArray9831[i]);
		if (i_42_ != ((Class263) this).anInt6415) {
			if (i_42_ != 0) {
				OpenGL.glBindTexture(i_42_, 0);
				OpenGL.glDisable(i_42_);
			}
			OpenGL.glEnable(((Class263) this).anInt6415);
			((Class_ra_Sub3_Sub1) ((Class263) this).aClass_ra_Sub3_Sub1_6422).anIntArray9831[i] = ((Class263) this).anInt6415;
		}
		OpenGL.glBindTexture(((Class263) this).anInt6415, ((Class263) this).anInt6417);
	}

	public void method127(Class179 class179) {
		if (((Class263) this).aClass179_6418 != class179) {
			((Class263) this).aClass179_6418 = class179;
			method2467();
		}
	}

	public void x() {
		if (((Class263) this).anInt6417 > 0) {
			((Class263) this).aClass_ra_Sub3_Sub1_6422.method5529(((Class263) this).anInt6417, method2471());
			((Class263) this).anInt6417 = 0;
		}
	}

	public void b() {
		if (((Class263) this).anInt6417 > 0) {
			((Class263) this).aClass_ra_Sub3_Sub1_6422.method5529(((Class263) this).anInt6417, method2471());
			((Class263) this).anInt6417 = 0;
		}
	}

	void method2472(int i, int i_43_, int i_44_, byte[] is) {
		if (i_43_ > 0 && !Class486.method6152(i_43_, 1815267823))
			throw new IllegalArgumentException("");
		if (i_44_ > 0 && !Class486.method6152(i_44_, 1849521842))
			throw new IllegalArgumentException("");
		int i_45_ = ((Class263) this).aClass55_6419.anInt556 * 845115459;
		int i_46_ = 0;
		int i_47_ = i_43_ < i_44_ ? i_43_ : i_44_;
		int i_48_ = i_43_ >> 1;
		int i_49_ = i_44_ >> 1;
		byte[] is_50_ = is;
		byte[] is_51_ = new byte[i_48_ * i_49_ * i_45_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_46_, Class_ra_Sub3_Sub1.method5533(((Class263) this).aClass55_6419, (((Class263) this).aClass77_6420)), i_43_, i_44_, 0, Class_ra_Sub3_Sub1.method5532(((Class263) this).aClass55_6419), 5121, is_50_, 0);
			if (i_47_ <= 1)
				break;
			int i_52_ = i_43_ * i_45_;
			for (int i_53_ = 0; i_53_ < i_45_; i_53_++) {
				int i_54_ = i_53_;
				int i_55_ = i_53_;
				int i_56_ = i_55_ + i_52_;
				for (int i_57_ = 0; i_57_ < i_49_; i_57_++) {
					for (int i_58_ = 0; i_58_ < i_48_; i_58_++) {
						int i_59_ = is_50_[i_55_];
						i_55_ += i_45_;
						i_59_ += is_50_[i_55_];
						i_55_ += i_45_;
						i_59_ += is_50_[i_56_];
						i_56_ += i_45_;
						i_59_ += is_50_[i_56_];
						i_56_ += i_45_;
						is_51_[i_54_] = (byte) (i_59_ >> 2);
						i_54_ += i_45_;
					}
					i_55_ += i_52_;
					i_56_ += i_52_;
				}
			}
			byte[] is_60_ = is_51_;
			is_51_ = is_50_;
			is_50_ = is_60_;
			i_43_ = i_48_;
			i_44_ = i_49_;
			i_48_ >>= 1;
			i_49_ >>= 1;
			i_47_ >>= 1;
			i_46_++;
		}
	}

	Class263(Class_ra_Sub3_Sub1 class_ra_sub3_sub1, int i, Class55 class55, Class77 class77, int i_61_, boolean bool) {
		((Class263) this).aClass_ra_Sub3_Sub1_6422 = class_ra_sub3_sub1;
		((Class263) this).anInt6415 = i;
		((Class263) this).aClass55_6419 = class55;
		((Class263) this).aClass77_6420 = class77;
		((Class263) this).aBoolean6411 = bool;
		((Class263) this).anInt6416 = i_61_;
		OpenGL.glGenTextures(1, anIntArray6424, 0);
		((Class263) this).anInt6417 = anIntArray6424[0];
		method2467();
		method2470(0);
	}

	public void method129(Class179 class179) {
		if (((Class263) this).aClass179_6418 != class179) {
			((Class263) this).aClass179_6418 = class179;
			method2467();
		}
	}
}
