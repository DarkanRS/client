
/* Class319 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public abstract class Class319 implements Interface30 {
	Class505_Sub2_Sub1 aClass505_Sub2_Sub1_3700;
	static final int anInt3701 = 3553;
	static final int anInt3702 = 34037;
	static final int anInt3703 = 34067;
	static final int anInt3704 = 32879;
	Class35 aClass35_3705 = Class35.aClass35_382;
	int anInt3706;
	int anInt3707;
	Class150 aClass150_3708;
	static final int anInt3709 = 0;
	Class76 aClass76_3710;
	int anInt3711;
	boolean aBool3712;
	static int[] anIntArray3713 = new int[1];

	int method5698() {
		int i = (((Class319) this).aClass150_3708.anInt1959 * 351642797 * (((Class319) this).aClass76_3710.anInt748 * 971905895) * ((Class319) this).anInt3711);
		return ((Class319) this).aBool3712 ? i * 4 / 3 : i;
	}

	void method5699(int i) {
		((Class319) this).aClass505_Sub2_Sub1_3700.anInt8701 -= i;
		((Class319) this).aClass505_Sub2_Sub1_3700.anInt8701 += method5698();
	}

	public void method26() {
		if (((Class319) this).anInt3706 > 0) {
			((Class319) this).aClass505_Sub2_Sub1_3700.method15570(((Class319) this).anInt3706, method5698());
			((Class319) this).anInt3706 = 0;
		}
	}

	void method5700() {
		((Class319) this).aClass505_Sub2_Sub1_3700.method14035(this);
		if (((Class319) this).aClass35_3705 == Class35.aClass35_382) {
			OpenGL.glTexParameteri(((Class319) this).anInt3707, 10241, ((Class319) this).aBool3712 ? 9987 : 9729);
			OpenGL.glTexParameteri(((Class319) this).anInt3707, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(((Class319) this).anInt3707, 10241, ((Class319) this).aBool3712 ? 9984 : 9728);
			OpenGL.glTexParameteri(((Class319) this).anInt3707, 10240, 9728);
		}
	}

	boolean method54() {
		int i = method5698();
		((Class319) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glGenerateMipmapEXT(((Class319) this).anInt3707);
		((Class319) this).aBool3712 = true;
		method5700();
		method5699(i);
		return true;
	}

	public void method204(Class35 class35) {
		if (((Class319) this).aClass35_3705 != class35) {
			((Class319) this).aClass35_3705 = class35;
			method5700();
		}
	}

	void method5701(int i, int i_0_, int i_1_, byte[] is) {
		if (i_0_ > 0 && !Class96_Sub9.method14585(i_0_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_1_ > 0 && !Class96_Sub9.method14585(i_1_, 1942118537))
			throw new IllegalArgumentException("");
		int i_2_ = ((Class319) this).aClass150_3708.anInt1959 * 351642797;
		int i_3_ = 0;
		int i_4_ = i_0_ < i_1_ ? i_0_ : i_1_;
		int i_5_ = i_0_ >> 1;
		int i_6_ = i_1_ >> 1;
		byte[] is_7_ = is;
		byte[] is_8_ = new byte[i_5_ * i_6_ * i_2_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_3_, Class505_Sub2_Sub1.method15574((((Class319) this).aClass150_3708), (((Class319) this).aClass76_3710)), i_0_, i_1_, 0, Class505_Sub2_Sub1.method15575(((Class319) this).aClass150_3708), 5121, is_7_, 0);
			if (i_4_ <= 1)
				break;
			int i_9_ = i_0_ * i_2_;
			for (int i_10_ = 0; i_10_ < i_2_; i_10_++) {
				int i_11_ = i_10_;
				int i_12_ = i_10_;
				int i_13_ = i_12_ + i_9_;
				for (int i_14_ = 0; i_14_ < i_6_; i_14_++) {
					for (int i_15_ = 0; i_15_ < i_5_; i_15_++) {
						int i_16_ = is_7_[i_12_];
						i_12_ += i_2_;
						i_16_ += is_7_[i_12_];
						i_12_ += i_2_;
						i_16_ += is_7_[i_13_];
						i_13_ += i_2_;
						i_16_ += is_7_[i_13_];
						i_13_ += i_2_;
						is_8_[i_11_] = (byte) (i_16_ >> 2);
						i_11_ += i_2_;
					}
					i_12_ += i_9_;
					i_13_ += i_9_;
				}
			}
			byte[] is_17_ = is_8_;
			is_8_ = is_7_;
			is_7_ = is_17_;
			i_0_ = i_5_;
			i_1_ = i_6_;
			i_5_ >>= 1;
			i_6_ >>= 1;
			i_4_ >>= 1;
			i_3_++;
		}
	}

	void method5702(int i, int i_18_, int i_19_, float[] fs) {
		if (i_18_ > 0 && !Class96_Sub9.method14585(i_18_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_19_ > 0 && !Class96_Sub9.method14585(i_19_, 1942118537))
			throw new IllegalArgumentException("");
		int i_20_ = ((Class319) this).aClass150_3708.anInt1959 * 351642797;
		int i_21_ = 0;
		int i_22_ = i_18_ < i_19_ ? i_18_ : i_19_;
		int i_23_ = i_18_ >> 1;
		int i_24_ = i_19_ >> 1;
		float[] fs_25_ = fs;
		float[] fs_26_ = new float[i_23_ * i_24_ * i_20_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_21_, Class505_Sub2_Sub1.method15574((((Class319) this).aClass150_3708), (((Class319) this).aClass76_3710)), i_18_, i_19_, 0, Class505_Sub2_Sub1.method15575(((Class319) this).aClass150_3708), 5126, fs_25_, 0);
			if (i_22_ <= 1)
				break;
			int i_27_ = i_18_ * i_20_;
			for (int i_28_ = 0; i_28_ < i_20_; i_28_++) {
				int i_29_ = i_28_;
				int i_30_ = i_28_;
				int i_31_ = i_30_ + i_27_;
				for (int i_32_ = 0; i_32_ < i_24_; i_32_++) {
					for (int i_33_ = 0; i_33_ < i_23_; i_33_++) {
						float f = fs_25_[i_30_];
						i_30_ += i_20_;
						f += fs_25_[i_30_];
						i_30_ += i_20_;
						f += fs_25_[i_31_];
						i_31_ += i_20_;
						f += fs_25_[i_31_];
						i_31_ += i_20_;
						fs_26_[i_29_] = f * 0.25F;
						i_29_ += i_20_;
					}
					i_30_ += i_27_;
					i_31_ += i_27_;
				}
			}
			float[] fs_34_ = fs_26_;
			fs_26_ = fs_25_;
			fs_25_ = fs_34_;
			i_18_ = i_23_;
			i_19_ = i_24_;
			i_23_ >>= 1;
			i_24_ >>= 1;
			i_22_ >>= 1;
			i_21_++;
		}
	}

	void method5703(int i, int i_35_, int i_36_, float[] fs) {
		if (i_35_ > 0 && !Class96_Sub9.method14585(i_35_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_36_ > 0 && !Class96_Sub9.method14585(i_36_, 1942118537))
			throw new IllegalArgumentException("");
		int i_37_ = ((Class319) this).aClass150_3708.anInt1959 * 351642797;
		int i_38_ = 0;
		int i_39_ = i_35_ < i_36_ ? i_35_ : i_36_;
		int i_40_ = i_35_ >> 1;
		int i_41_ = i_36_ >> 1;
		float[] fs_42_ = fs;
		float[] fs_43_ = new float[i_40_ * i_41_ * i_37_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_38_, Class505_Sub2_Sub1.method15574((((Class319) this).aClass150_3708), (((Class319) this).aClass76_3710)), i_35_, i_36_, 0, Class505_Sub2_Sub1.method15575(((Class319) this).aClass150_3708), 5126, fs_42_, 0);
			if (i_39_ <= 1)
				break;
			int i_44_ = i_35_ * i_37_;
			for (int i_45_ = 0; i_45_ < i_37_; i_45_++) {
				int i_46_ = i_45_;
				int i_47_ = i_45_;
				int i_48_ = i_47_ + i_44_;
				for (int i_49_ = 0; i_49_ < i_41_; i_49_++) {
					for (int i_50_ = 0; i_50_ < i_40_; i_50_++) {
						float f = fs_42_[i_47_];
						i_47_ += i_37_;
						f += fs_42_[i_47_];
						i_47_ += i_37_;
						f += fs_42_[i_48_];
						i_48_ += i_37_;
						f += fs_42_[i_48_];
						i_48_ += i_37_;
						fs_43_[i_46_] = f * 0.25F;
						i_46_ += i_37_;
					}
					i_47_ += i_44_;
					i_48_ += i_44_;
				}
			}
			float[] fs_51_ = fs_43_;
			fs_43_ = fs_42_;
			fs_42_ = fs_51_;
			i_35_ = i_40_;
			i_36_ = i_41_;
			i_40_ >>= 1;
			i_41_ >>= 1;
			i_39_ >>= 1;
			i_38_++;
		}
	}

	boolean method49() {
		int i = method5698();
		((Class319) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glGenerateMipmapEXT(((Class319) this).anInt3707);
		((Class319) this).aBool3712 = true;
		method5700();
		method5699(i);
		return true;
	}

	void method5704(int i, int i_52_, int i_53_, byte[] is) {
		if (i_52_ > 0 && !Class96_Sub9.method14585(i_52_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_53_ > 0 && !Class96_Sub9.method14585(i_53_, 1942118537))
			throw new IllegalArgumentException("");
		int i_54_ = ((Class319) this).aClass150_3708.anInt1959 * 351642797;
		int i_55_ = 0;
		int i_56_ = i_52_ < i_53_ ? i_52_ : i_53_;
		int i_57_ = i_52_ >> 1;
		int i_58_ = i_53_ >> 1;
		byte[] is_59_ = is;
		byte[] is_60_ = new byte[i_57_ * i_58_ * i_54_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_55_, Class505_Sub2_Sub1.method15574((((Class319) this).aClass150_3708), (((Class319) this).aClass76_3710)), i_52_, i_53_, 0, Class505_Sub2_Sub1.method15575(((Class319) this).aClass150_3708), 5121, is_59_, 0);
			if (i_56_ <= 1)
				break;
			int i_61_ = i_52_ * i_54_;
			for (int i_62_ = 0; i_62_ < i_54_; i_62_++) {
				int i_63_ = i_62_;
				int i_64_ = i_62_;
				int i_65_ = i_64_ + i_61_;
				for (int i_66_ = 0; i_66_ < i_58_; i_66_++) {
					for (int i_67_ = 0; i_67_ < i_57_; i_67_++) {
						int i_68_ = is_59_[i_64_];
						i_64_ += i_54_;
						i_68_ += is_59_[i_64_];
						i_64_ += i_54_;
						i_68_ += is_59_[i_65_];
						i_65_ += i_54_;
						i_68_ += is_59_[i_65_];
						i_65_ += i_54_;
						is_60_[i_63_] = (byte) (i_68_ >> 2);
						i_63_ += i_54_;
					}
					i_64_ += i_61_;
					i_65_ += i_61_;
				}
			}
			byte[] is_69_ = is_60_;
			is_60_ = is_59_;
			is_59_ = is_69_;
			i_52_ = i_57_;
			i_53_ = i_58_;
			i_57_ >>= 1;
			i_58_ >>= 1;
			i_56_ >>= 1;
			i_55_++;
		}
	}

	public void finalize() throws Throwable {
		method26();
		super.finalize();
	}

	public void method32() {
		if (((Class319) this).anInt3706 > 0) {
			((Class319) this).aClass505_Sub2_Sub1_3700.method15570(((Class319) this).anInt3706, method5698());
			((Class319) this).anInt3706 = 0;
		}
	}

	void method5705() throws Throwable {
		method26();
		super.finalize();
	}

	void method5706() throws Throwable {
		method26();
		super.finalize();
	}

	void method5707(int i, int i_70_, int i_71_, byte[] is) {
		if (i_70_ > 0 && !Class96_Sub9.method14585(i_70_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_71_ > 0 && !Class96_Sub9.method14585(i_71_, 1942118537))
			throw new IllegalArgumentException("");
		int i_72_ = ((Class319) this).aClass150_3708.anInt1959 * 351642797;
		int i_73_ = 0;
		int i_74_ = i_70_ < i_71_ ? i_70_ : i_71_;
		int i_75_ = i_70_ >> 1;
		int i_76_ = i_71_ >> 1;
		byte[] is_77_ = is;
		byte[] is_78_ = new byte[i_75_ * i_76_ * i_72_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_73_, Class505_Sub2_Sub1.method15574((((Class319) this).aClass150_3708), (((Class319) this).aClass76_3710)), i_70_, i_71_, 0, Class505_Sub2_Sub1.method15575(((Class319) this).aClass150_3708), 5121, is_77_, 0);
			if (i_74_ <= 1)
				break;
			int i_79_ = i_70_ * i_72_;
			for (int i_80_ = 0; i_80_ < i_72_; i_80_++) {
				int i_81_ = i_80_;
				int i_82_ = i_80_;
				int i_83_ = i_82_ + i_79_;
				for (int i_84_ = 0; i_84_ < i_76_; i_84_++) {
					for (int i_85_ = 0; i_85_ < i_75_; i_85_++) {
						int i_86_ = is_77_[i_82_];
						i_82_ += i_72_;
						i_86_ += is_77_[i_82_];
						i_82_ += i_72_;
						i_86_ += is_77_[i_83_];
						i_83_ += i_72_;
						i_86_ += is_77_[i_83_];
						i_83_ += i_72_;
						is_78_[i_81_] = (byte) (i_86_ >> 2);
						i_81_ += i_72_;
					}
					i_82_ += i_79_;
					i_83_ += i_79_;
				}
			}
			byte[] is_87_ = is_78_;
			is_78_ = is_77_;
			is_77_ = is_87_;
			i_70_ = i_75_;
			i_71_ = i_76_;
			i_75_ >>= 1;
			i_76_ >>= 1;
			i_74_ >>= 1;
			i_73_++;
		}
	}

	Class319(Class505_Sub2_Sub1 class505_sub2_sub1, int i, Class150 class150, Class76 class76, int i_88_, boolean bool) {
		((Class319) this).aClass505_Sub2_Sub1_3700 = class505_sub2_sub1;
		((Class319) this).anInt3707 = i;
		((Class319) this).aClass150_3708 = class150;
		((Class319) this).aClass76_3710 = class76;
		((Class319) this).aBool3712 = bool;
		((Class319) this).anInt3711 = i_88_;
		OpenGL.glGenTextures(1, anIntArray3713, 0);
		((Class319) this).anInt3706 = anIntArray3713[0];
		method5700();
		method5699(0);
	}

	int method5708() {
		int i = (((Class319) this).aClass150_3708.anInt1959 * 351642797 * (((Class319) this).aClass76_3710.anInt748 * 971905895) * ((Class319) this).anInt3711);
		return ((Class319) this).aBool3712 ? i * 4 / 3 : i;
	}

	public void method207() {
		int i = ((Class319) this).aClass505_Sub2_Sub1_3700.method13963();
		int i_89_ = (((Class505_Sub2_Sub1) ((Class319) this).aClass505_Sub2_Sub1_3700).anIntArray10188[i]);
		if (i_89_ != ((Class319) this).anInt3707) {
			if (i_89_ != 0) {
				OpenGL.glBindTexture(i_89_, 0);
				OpenGL.glDisable(i_89_);
			}
			OpenGL.glEnable(((Class319) this).anInt3707);
			((Class505_Sub2_Sub1) ((Class319) this).aClass505_Sub2_Sub1_3700).anIntArray10188[i] = ((Class319) this).anInt3707;
		}
		OpenGL.glBindTexture(((Class319) this).anInt3707, ((Class319) this).anInt3706);
	}

	public void method201(Class35 class35) {
		if (((Class319) this).aClass35_3705 != class35) {
			((Class319) this).aClass35_3705 = class35;
			method5700();
		}
	}

	public void method202(Class35 class35) {
		if (((Class319) this).aClass35_3705 != class35) {
			((Class319) this).aClass35_3705 = class35;
			method5700();
		}
	}

	void method5709() {
		((Class319) this).aClass505_Sub2_Sub1_3700.method14035(this);
		if (((Class319) this).aClass35_3705 == Class35.aClass35_382) {
			OpenGL.glTexParameteri(((Class319) this).anInt3707, 10241, ((Class319) this).aBool3712 ? 9987 : 9729);
			OpenGL.glTexParameteri(((Class319) this).anInt3707, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(((Class319) this).anInt3707, 10241, ((Class319) this).aBool3712 ? 9984 : 9728);
			OpenGL.glTexParameteri(((Class319) this).anInt3707, 10240, 9728);
		}
	}

	void method5710(int i, int i_90_, int i_91_, int[] is) {
		if (i_90_ > 0 && !Class96_Sub9.method14585(i_90_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_91_ > 0 && !Class96_Sub9.method14585(i_91_, 1942118537))
			throw new IllegalArgumentException("");
		if (((Class319) this).aClass150_3708 != Class150.aClass150_1949)
			throw new IllegalArgumentException("");
		int i_92_ = 0;
		int i_93_ = i_90_ < i_91_ ? i_90_ : i_91_;
		int i_94_ = i_90_ >> 1;
		int i_95_ = i_91_ >> 1;
		int[] is_96_ = is;
		int[] is_97_ = new int[i_94_ * i_95_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_92_, (Class505_Sub2_Sub1.method15574(((Class319) this).aClass150_3708, ((Class319) this).aClass76_3710)), i_90_, i_91_, 0, 32993, (((Class505_Sub2_Sub1) ((Class319) this).aClass505_Sub2_Sub1_3700).anInt10198), is_96_, 0);
			if (i_93_ <= 1)
				break;
			int i_98_ = 0;
			int i_99_ = 0;
			int i_100_ = i_99_ + i_90_;
			for (int i_101_ = 0; i_101_ < i_95_; i_101_++) {
				for (int i_102_ = 0; i_102_ < i_94_; i_102_++) {
					int i_103_ = is_96_[i_99_++];
					int i_104_ = is_96_[i_99_++];
					int i_105_ = is_96_[i_100_++];
					int i_106_ = is_96_[i_100_++];
					int i_107_ = i_103_ >> 24 & 0xff;
					int i_108_ = i_103_ >> 16 & 0xff;
					int i_109_ = i_103_ >> 8 & 0xff;
					int i_110_ = i_103_ & 0xff;
					i_107_ += i_104_ >> 24 & 0xff;
					i_108_ += i_104_ >> 16 & 0xff;
					i_109_ += i_104_ >> 8 & 0xff;
					i_110_ += i_104_ & 0xff;
					i_107_ += i_105_ >> 24 & 0xff;
					i_108_ += i_105_ >> 16 & 0xff;
					i_109_ += i_105_ >> 8 & 0xff;
					i_110_ += i_105_ & 0xff;
					i_107_ += i_106_ >> 24 & 0xff;
					i_108_ += i_106_ >> 16 & 0xff;
					i_109_ += i_106_ >> 8 & 0xff;
					i_110_ += i_106_ & 0xff;
					is_97_[i_98_++] = ((i_107_ & 0x3fc) << 22 | (i_108_ & 0x3fc) << 14 | (i_109_ & 0x3fc) << 6 | (i_110_ & 0x3fc) >> 2);
				}
				i_99_ += i_90_;
				i_100_ += i_90_;
			}
			int[] is_111_ = is_97_;
			is_97_ = is_96_;
			is_96_ = is_111_;
			i_90_ = i_94_;
			i_91_ = i_95_;
			i_94_ >>= 1;
			i_95_ >>= 1;
			i_93_ >>= 1;
			i_92_++;
		}
	}

	void method5711(int i, int i_112_, int i_113_, int[] is) {
		if (i_112_ > 0 && !Class96_Sub9.method14585(i_112_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_113_ > 0 && !Class96_Sub9.method14585(i_113_, 1942118537))
			throw new IllegalArgumentException("");
		if (((Class319) this).aClass150_3708 != Class150.aClass150_1949)
			throw new IllegalArgumentException("");
		int i_114_ = 0;
		int i_115_ = i_112_ < i_113_ ? i_112_ : i_113_;
		int i_116_ = i_112_ >> 1;
		int i_117_ = i_113_ >> 1;
		int[] is_118_ = is;
		int[] is_119_ = new int[i_116_ * i_117_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_114_, (Class505_Sub2_Sub1.method15574(((Class319) this).aClass150_3708, ((Class319) this).aClass76_3710)), i_112_, i_113_, 0, 32993, (((Class505_Sub2_Sub1) ((Class319) this).aClass505_Sub2_Sub1_3700).anInt10198), is_118_, 0);
			if (i_115_ <= 1)
				break;
			int i_120_ = 0;
			int i_121_ = 0;
			int i_122_ = i_121_ + i_112_;
			for (int i_123_ = 0; i_123_ < i_117_; i_123_++) {
				for (int i_124_ = 0; i_124_ < i_116_; i_124_++) {
					int i_125_ = is_118_[i_121_++];
					int i_126_ = is_118_[i_121_++];
					int i_127_ = is_118_[i_122_++];
					int i_128_ = is_118_[i_122_++];
					int i_129_ = i_125_ >> 24 & 0xff;
					int i_130_ = i_125_ >> 16 & 0xff;
					int i_131_ = i_125_ >> 8 & 0xff;
					int i_132_ = i_125_ & 0xff;
					i_129_ += i_126_ >> 24 & 0xff;
					i_130_ += i_126_ >> 16 & 0xff;
					i_131_ += i_126_ >> 8 & 0xff;
					i_132_ += i_126_ & 0xff;
					i_129_ += i_127_ >> 24 & 0xff;
					i_130_ += i_127_ >> 16 & 0xff;
					i_131_ += i_127_ >> 8 & 0xff;
					i_132_ += i_127_ & 0xff;
					i_129_ += i_128_ >> 24 & 0xff;
					i_130_ += i_128_ >> 16 & 0xff;
					i_131_ += i_128_ >> 8 & 0xff;
					i_132_ += i_128_ & 0xff;
					is_119_[i_120_++] = ((i_129_ & 0x3fc) << 22 | (i_130_ & 0x3fc) << 14 | (i_131_ & 0x3fc) << 6 | (i_132_ & 0x3fc) >> 2);
				}
				i_121_ += i_112_;
				i_122_ += i_112_;
			}
			int[] is_133_ = is_119_;
			is_119_ = is_118_;
			is_118_ = is_133_;
			i_112_ = i_116_;
			i_113_ = i_117_;
			i_116_ >>= 1;
			i_117_ >>= 1;
			i_115_ >>= 1;
			i_114_++;
		}
	}

	void method5712(int i, int i_134_, int i_135_, int[] is) {
		if (i_134_ > 0 && !Class96_Sub9.method14585(i_134_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_135_ > 0 && !Class96_Sub9.method14585(i_135_, 1942118537))
			throw new IllegalArgumentException("");
		if (((Class319) this).aClass150_3708 != Class150.aClass150_1949)
			throw new IllegalArgumentException("");
		int i_136_ = 0;
		int i_137_ = i_134_ < i_135_ ? i_134_ : i_135_;
		int i_138_ = i_134_ >> 1;
		int i_139_ = i_135_ >> 1;
		int[] is_140_ = is;
		int[] is_141_ = new int[i_138_ * i_139_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_136_, (Class505_Sub2_Sub1.method15574(((Class319) this).aClass150_3708, ((Class319) this).aClass76_3710)), i_134_, i_135_, 0, 32993, (((Class505_Sub2_Sub1) ((Class319) this).aClass505_Sub2_Sub1_3700).anInt10198), is_140_, 0);
			if (i_137_ <= 1)
				break;
			int i_142_ = 0;
			int i_143_ = 0;
			int i_144_ = i_143_ + i_134_;
			for (int i_145_ = 0; i_145_ < i_139_; i_145_++) {
				for (int i_146_ = 0; i_146_ < i_138_; i_146_++) {
					int i_147_ = is_140_[i_143_++];
					int i_148_ = is_140_[i_143_++];
					int i_149_ = is_140_[i_144_++];
					int i_150_ = is_140_[i_144_++];
					int i_151_ = i_147_ >> 24 & 0xff;
					int i_152_ = i_147_ >> 16 & 0xff;
					int i_153_ = i_147_ >> 8 & 0xff;
					int i_154_ = i_147_ & 0xff;
					i_151_ += i_148_ >> 24 & 0xff;
					i_152_ += i_148_ >> 16 & 0xff;
					i_153_ += i_148_ >> 8 & 0xff;
					i_154_ += i_148_ & 0xff;
					i_151_ += i_149_ >> 24 & 0xff;
					i_152_ += i_149_ >> 16 & 0xff;
					i_153_ += i_149_ >> 8 & 0xff;
					i_154_ += i_149_ & 0xff;
					i_151_ += i_150_ >> 24 & 0xff;
					i_152_ += i_150_ >> 16 & 0xff;
					i_153_ += i_150_ >> 8 & 0xff;
					i_154_ += i_150_ & 0xff;
					is_141_[i_142_++] = ((i_151_ & 0x3fc) << 22 | (i_152_ & 0x3fc) << 14 | (i_153_ & 0x3fc) << 6 | (i_154_ & 0x3fc) >> 2);
				}
				i_143_ += i_134_;
				i_144_ += i_134_;
			}
			int[] is_155_ = is_141_;
			is_141_ = is_140_;
			is_140_ = is_155_;
			i_134_ = i_138_;
			i_135_ = i_139_;
			i_138_ >>= 1;
			i_139_ >>= 1;
			i_137_ >>= 1;
			i_136_++;
		}
	}

	public void method206(Class35 class35) {
		if (((Class319) this).aClass35_3705 != class35) {
			((Class319) this).aClass35_3705 = class35;
			method5700();
		}
	}

	public void method205(Class35 class35) {
		if (((Class319) this).aClass35_3705 != class35) {
			((Class319) this).aClass35_3705 = class35;
			method5700();
		}
	}

	void method5713(int i, int i_156_, int i_157_, float[] fs) {
		if (i_156_ > 0 && !Class96_Sub9.method14585(i_156_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_157_ > 0 && !Class96_Sub9.method14585(i_157_, 1942118537))
			throw new IllegalArgumentException("");
		int i_158_ = ((Class319) this).aClass150_3708.anInt1959 * 351642797;
		int i_159_ = 0;
		int i_160_ = i_156_ < i_157_ ? i_156_ : i_157_;
		int i_161_ = i_156_ >> 1;
		int i_162_ = i_157_ >> 1;
		float[] fs_163_ = fs;
		float[] fs_164_ = new float[i_161_ * i_162_ * i_158_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_159_, Class505_Sub2_Sub1.method15574((((Class319) this).aClass150_3708), (((Class319) this).aClass76_3710)), i_156_, i_157_, 0, Class505_Sub2_Sub1.method15575(((Class319) this).aClass150_3708), 5126, fs_163_, 0);
			if (i_160_ <= 1)
				break;
			int i_165_ = i_156_ * i_158_;
			for (int i_166_ = 0; i_166_ < i_158_; i_166_++) {
				int i_167_ = i_166_;
				int i_168_ = i_166_;
				int i_169_ = i_168_ + i_165_;
				for (int i_170_ = 0; i_170_ < i_162_; i_170_++) {
					for (int i_171_ = 0; i_171_ < i_161_; i_171_++) {
						float f = fs_163_[i_168_];
						i_168_ += i_158_;
						f += fs_163_[i_168_];
						i_168_ += i_158_;
						f += fs_163_[i_169_];
						i_169_ += i_158_;
						f += fs_163_[i_169_];
						i_169_ += i_158_;
						fs_164_[i_167_] = f * 0.25F;
						i_167_ += i_158_;
					}
					i_168_ += i_165_;
					i_169_ += i_165_;
				}
			}
			float[] fs_172_ = fs_164_;
			fs_164_ = fs_163_;
			fs_163_ = fs_172_;
			i_156_ = i_161_;
			i_157_ = i_162_;
			i_161_ >>= 1;
			i_162_ >>= 1;
			i_160_ >>= 1;
			i_159_++;
		}
	}

	void method5714(int i, int i_173_, int i_174_, int[] is) {
		if (i_173_ > 0 && !Class96_Sub9.method14585(i_173_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_174_ > 0 && !Class96_Sub9.method14585(i_174_, 1942118537))
			throw new IllegalArgumentException("");
		if (((Class319) this).aClass150_3708 != Class150.aClass150_1949)
			throw new IllegalArgumentException("");
		int i_175_ = 0;
		int i_176_ = i_173_ < i_174_ ? i_173_ : i_174_;
		int i_177_ = i_173_ >> 1;
		int i_178_ = i_174_ >> 1;
		int[] is_179_ = is;
		int[] is_180_ = new int[i_177_ * i_178_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_175_, (Class505_Sub2_Sub1.method15574(((Class319) this).aClass150_3708, ((Class319) this).aClass76_3710)), i_173_, i_174_, 0, 32993, (((Class505_Sub2_Sub1) ((Class319) this).aClass505_Sub2_Sub1_3700).anInt10198), is_179_, 0);
			if (i_176_ <= 1)
				break;
			int i_181_ = 0;
			int i_182_ = 0;
			int i_183_ = i_182_ + i_173_;
			for (int i_184_ = 0; i_184_ < i_178_; i_184_++) {
				for (int i_185_ = 0; i_185_ < i_177_; i_185_++) {
					int i_186_ = is_179_[i_182_++];
					int i_187_ = is_179_[i_182_++];
					int i_188_ = is_179_[i_183_++];
					int i_189_ = is_179_[i_183_++];
					int i_190_ = i_186_ >> 24 & 0xff;
					int i_191_ = i_186_ >> 16 & 0xff;
					int i_192_ = i_186_ >> 8 & 0xff;
					int i_193_ = i_186_ & 0xff;
					i_190_ += i_187_ >> 24 & 0xff;
					i_191_ += i_187_ >> 16 & 0xff;
					i_192_ += i_187_ >> 8 & 0xff;
					i_193_ += i_187_ & 0xff;
					i_190_ += i_188_ >> 24 & 0xff;
					i_191_ += i_188_ >> 16 & 0xff;
					i_192_ += i_188_ >> 8 & 0xff;
					i_193_ += i_188_ & 0xff;
					i_190_ += i_189_ >> 24 & 0xff;
					i_191_ += i_189_ >> 16 & 0xff;
					i_192_ += i_189_ >> 8 & 0xff;
					i_193_ += i_189_ & 0xff;
					is_180_[i_181_++] = ((i_190_ & 0x3fc) << 22 | (i_191_ & 0x3fc) << 14 | (i_192_ & 0x3fc) << 6 | (i_193_ & 0x3fc) >> 2);
				}
				i_182_ += i_173_;
				i_183_ += i_173_;
			}
			int[] is_194_ = is_180_;
			is_180_ = is_179_;
			is_179_ = is_194_;
			i_173_ = i_177_;
			i_174_ = i_178_;
			i_177_ >>= 1;
			i_178_ >>= 1;
			i_176_ >>= 1;
			i_175_++;
		}
	}

	void method5715(int i, int i_195_, int i_196_, float[] fs) {
		if (i_195_ > 0 && !Class96_Sub9.method14585(i_195_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_196_ > 0 && !Class96_Sub9.method14585(i_196_, 1942118537))
			throw new IllegalArgumentException("");
		int i_197_ = ((Class319) this).aClass150_3708.anInt1959 * 351642797;
		int i_198_ = 0;
		int i_199_ = i_195_ < i_196_ ? i_195_ : i_196_;
		int i_200_ = i_195_ >> 1;
		int i_201_ = i_196_ >> 1;
		float[] fs_202_ = fs;
		float[] fs_203_ = new float[i_200_ * i_201_ * i_197_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_198_, Class505_Sub2_Sub1.method15574((((Class319) this).aClass150_3708), (((Class319) this).aClass76_3710)), i_195_, i_196_, 0, Class505_Sub2_Sub1.method15575(((Class319) this).aClass150_3708), 5126, fs_202_, 0);
			if (i_199_ <= 1)
				break;
			int i_204_ = i_195_ * i_197_;
			for (int i_205_ = 0; i_205_ < i_197_; i_205_++) {
				int i_206_ = i_205_;
				int i_207_ = i_205_;
				int i_208_ = i_207_ + i_204_;
				for (int i_209_ = 0; i_209_ < i_201_; i_209_++) {
					for (int i_210_ = 0; i_210_ < i_200_; i_210_++) {
						float f = fs_202_[i_207_];
						i_207_ += i_197_;
						f += fs_202_[i_207_];
						i_207_ += i_197_;
						f += fs_202_[i_208_];
						i_208_ += i_197_;
						f += fs_202_[i_208_];
						i_208_ += i_197_;
						fs_203_[i_206_] = f * 0.25F;
						i_206_ += i_197_;
					}
					i_207_ += i_204_;
					i_208_ += i_204_;
				}
			}
			float[] fs_211_ = fs_203_;
			fs_203_ = fs_202_;
			fs_202_ = fs_211_;
			i_195_ = i_200_;
			i_196_ = i_201_;
			i_200_ >>= 1;
			i_201_ >>= 1;
			i_199_ >>= 1;
			i_198_++;
		}
	}

	void method5716(int i) {
		((Class319) this).aClass505_Sub2_Sub1_3700.anInt8701 -= i;
		((Class319) this).aClass505_Sub2_Sub1_3700.anInt8701 += method5698();
	}

	void method5717(int i) {
		((Class319) this).aClass505_Sub2_Sub1_3700.anInt8701 -= i;
		((Class319) this).aClass505_Sub2_Sub1_3700.anInt8701 += method5698();
	}

	int method5718() {
		int i = (((Class319) this).aClass150_3708.anInt1959 * 351642797 * (((Class319) this).aClass76_3710.anInt748 * 971905895) * ((Class319) this).anInt3711);
		return ((Class319) this).aBool3712 ? i * 4 / 3 : i;
	}

	public void method203() {
		int i = ((Class319) this).aClass505_Sub2_Sub1_3700.method13963();
		int i_212_ = (((Class505_Sub2_Sub1) ((Class319) this).aClass505_Sub2_Sub1_3700).anIntArray10188[i]);
		if (i_212_ != ((Class319) this).anInt3707) {
			if (i_212_ != 0) {
				OpenGL.glBindTexture(i_212_, 0);
				OpenGL.glDisable(i_212_);
			}
			OpenGL.glEnable(((Class319) this).anInt3707);
			((Class505_Sub2_Sub1) ((Class319) this).aClass505_Sub2_Sub1_3700).anIntArray10188[i] = ((Class319) this).anInt3707;
		}
		OpenGL.glBindTexture(((Class319) this).anInt3707, ((Class319) this).anInt3706);
	}
}
