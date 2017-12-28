
/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public abstract class Class137 {
	static final int anInt1640 = 3552;
	boolean aBool1641;
	static final int anInt1642 = 34037;
	static final int anInt1643 = 34067;
	static final int anInt1644 = 32879;
	static final int anInt1645 = 5121;
	Class505_Sub1 aClass505_Sub1_1646;
	int anInt1647;
	int anInt1648;
	static int[] anIntArray1649 = new int[1];
	Class150 aClass150_1650;
	Class76 aClass76_1651;
	boolean aBool1652 = false;
	static final int anInt1653 = 3553;
	int anInt1654;

	void method2350() {
		if (((Class137) this).anInt1647 > 0) {
			((Class505_Sub1) ((Class137) this).aClass505_Sub1_1646).anInt8370 -= method2358();
			int[] is = new int[1];
			is[0] = ((Class137) this).anInt1647;
			OpenGL.glDeleteTextures(1, is, 0);
			((Class137) this).anInt1647 = 0;
		}
	}

	void method2351(boolean bool) {
		if (((Class137) this).aBool1652 != bool) {
			((Class137) this).aBool1652 = bool;
			method2352();
		}
	}

	void method2352() {
		((Class137) this).aClass505_Sub1_1646.method13654(this);
		if (((Class137) this).aBool1652) {
			OpenGL.glTexParameteri(((Class137) this).anInt1648, 10241, ((Class137) this).aBool1641 ? 9987 : 9729);
			OpenGL.glTexParameteri(((Class137) this).anInt1648, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(((Class137) this).anInt1648, 10241, ((Class137) this).aBool1641 ? 9984 : 9728);
			OpenGL.glTexParameteri(((Class137) this).anInt1648, 10240, 9728);
		}
	}

	boolean method2353() {
		if (((Class505_Sub1) ((Class137) this).aClass505_Sub1_1646).aBool8472) {
			int i = method2358();
			((Class137) this).aClass505_Sub1_1646.method13654(this);
			OpenGL.glGenerateMipmapEXT(((Class137) this).anInt1648);
			((Class137) this).aBool1641 = true;
			method2352();
			method2357(i);
			return true;
		}
		return false;
	}

	void method2354(boolean bool) {
		if (((Class137) this).aBool1641 != bool) {
			int i = method2358();
			((Class137) this).aBool1641 = true;
			method2352();
			method2357(i);
		}
	}

	void method2355() {
		if (((Class137) this).anInt1647 > 0) {
			((Class505_Sub1) ((Class137) this).aClass505_Sub1_1646).anInt8370 -= method2358();
			int[] is = new int[1];
			is[0] = ((Class137) this).anInt1647;
			OpenGL.glDeleteTextures(1, is, 0);
			((Class137) this).anInt1647 = 0;
		}
	}

	void method2356(boolean bool) {
		if (((Class137) this).aBool1641 != bool) {
			int i = method2358();
			((Class137) this).aBool1641 = true;
			method2352();
			method2357(i);
		}
	}

	void method2357(int i) {
		((Class505_Sub1) ((Class137) this).aClass505_Sub1_1646).anInt8370 -= i;
		((Class505_Sub1) ((Class137) this).aClass505_Sub1_1646).anInt8370 += method2358();
	}

	int method2358() {
		int i = (((Class137) this).aClass150_1650.anInt1959 * 351642797 * (((Class137) this).aClass76_1651.anInt748 * 971905895) * ((Class137) this).anInt1654);
		return ((Class137) this).aBool1641 ? i * 4 / 3 : i;
	}

	static void method2359(int i, int i_0_, int i_1_, int i_2_, Class150 class150, byte[] is) {
		if (i_1_ > 0 && !Class96_Sub9.method14585(i_1_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_2_ > 0 && !Class96_Sub9.method14585(i_2_, 1942118537))
			throw new IllegalArgumentException("");
		int i_3_ = class150.anInt1959 * 351642797;
		int i_4_ = 0;
		int i_5_ = i_1_ < i_2_ ? i_1_ : i_2_;
		int i_6_ = i_1_ >> 1;
		int i_7_ = i_2_ >> 1;
		byte[] is_8_ = is;
		byte[] is_9_ = new byte[i_6_ * i_7_ * i_3_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_4_, i_0_, i_1_, i_2_, 0, Class505_Sub1.method13629(class150), 5121, is_8_, 0);
			if (i_5_ <= 1)
				break;
			int i_10_ = i_1_ * i_3_;
			for (int i_11_ = 0; i_11_ < i_3_; i_11_++) {
				int i_12_ = i_11_;
				int i_13_ = i_11_;
				int i_14_ = i_13_ + i_10_;
				for (int i_15_ = 0; i_15_ < i_7_; i_15_++) {
					for (int i_16_ = 0; i_16_ < i_6_; i_16_++) {
						int i_17_ = is_8_[i_13_];
						i_13_ += i_3_;
						i_17_ += is_8_[i_13_];
						i_13_ += i_3_;
						i_17_ += is_8_[i_14_];
						i_14_ += i_3_;
						i_17_ += is_8_[i_14_];
						i_14_ += i_3_;
						is_9_[i_12_] = (byte) (i_17_ >> 2);
						i_12_ += i_3_;
					}
					i_13_ += i_10_;
					i_14_ += i_10_;
				}
			}
			byte[] is_18_ = is_9_;
			is_9_ = is_8_;
			is_8_ = is_18_;
			i_1_ = i_6_;
			i_2_ = i_7_;
			i_6_ >>= 1;
			i_7_ >>= 1;
			i_5_ >>= 1;
			i_4_++;
		}
	}

	void method2360(boolean bool) {
		if (((Class137) this).aBool1641 != bool) {
			int i = method2358();
			((Class137) this).aBool1641 = true;
			method2352();
			method2357(i);
		}
	}

	static void method2361(int i, int i_19_, int i_20_, int i_21_, Class150 class150, float[] fs) {
		if (i_20_ > 0 && !Class96_Sub9.method14585(i_20_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_21_ > 0 && !Class96_Sub9.method14585(i_21_, 1942118537))
			throw new IllegalArgumentException("");
		int i_22_ = class150.anInt1959 * 351642797;
		int i_23_ = 0;
		int i_24_ = i_20_ < i_21_ ? i_20_ : i_21_;
		int i_25_ = i_20_ >> 1;
		int i_26_ = i_21_ >> 1;
		float[] fs_27_ = fs;
		float[] fs_28_ = new float[i_25_ * i_26_ * i_22_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_23_, i_19_, i_20_, i_21_, 0, Class505_Sub1.method13629(class150), 5126, fs_27_, 0);
			if (i_24_ <= 1)
				break;
			int i_29_ = i_20_ * i_22_;
			for (int i_30_ = 0; i_30_ < i_22_; i_30_++) {
				int i_31_ = i_30_;
				int i_32_ = i_30_;
				int i_33_ = i_32_ + i_29_;
				for (int i_34_ = 0; i_34_ < i_26_; i_34_++) {
					for (int i_35_ = 0; i_35_ < i_25_; i_35_++) {
						float f = fs_27_[i_32_];
						i_32_ += i_22_;
						f += fs_27_[i_32_];
						i_32_ += i_22_;
						f += fs_27_[i_33_];
						i_33_ += i_22_;
						f += fs_27_[i_33_];
						i_33_ += i_22_;
						fs_28_[i_31_] = f * 0.25F;
						i_31_ += i_22_;
					}
					i_32_ += i_29_;
					i_33_ += i_29_;
				}
			}
			float[] fs_36_ = fs_28_;
			fs_28_ = fs_27_;
			fs_27_ = fs_36_;
			i_20_ = i_25_;
			i_21_ = i_26_;
			i_25_ >>= 1;
			i_26_ >>= 1;
			i_24_ >>= 1;
			i_23_++;
		}
	}

	static void method2362(int i, int i_37_, int i_38_, int i_39_, Class150 class150, float[] fs) {
		if (i_38_ > 0 && !Class96_Sub9.method14585(i_38_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_39_ > 0 && !Class96_Sub9.method14585(i_39_, 1942118537))
			throw new IllegalArgumentException("");
		int i_40_ = class150.anInt1959 * 351642797;
		int i_41_ = 0;
		int i_42_ = i_38_ < i_39_ ? i_38_ : i_39_;
		int i_43_ = i_38_ >> 1;
		int i_44_ = i_39_ >> 1;
		float[] fs_45_ = fs;
		float[] fs_46_ = new float[i_43_ * i_44_ * i_40_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_41_, i_37_, i_38_, i_39_, 0, Class505_Sub1.method13629(class150), 5126, fs_45_, 0);
			if (i_42_ <= 1)
				break;
			int i_47_ = i_38_ * i_40_;
			for (int i_48_ = 0; i_48_ < i_40_; i_48_++) {
				int i_49_ = i_48_;
				int i_50_ = i_48_;
				int i_51_ = i_50_ + i_47_;
				for (int i_52_ = 0; i_52_ < i_44_; i_52_++) {
					for (int i_53_ = 0; i_53_ < i_43_; i_53_++) {
						float f = fs_45_[i_50_];
						i_50_ += i_40_;
						f += fs_45_[i_50_];
						i_50_ += i_40_;
						f += fs_45_[i_51_];
						i_51_ += i_40_;
						f += fs_45_[i_51_];
						i_51_ += i_40_;
						fs_46_[i_49_] = f * 0.25F;
						i_49_ += i_40_;
					}
					i_50_ += i_47_;
					i_51_ += i_47_;
				}
			}
			float[] fs_54_ = fs_46_;
			fs_46_ = fs_45_;
			fs_45_ = fs_54_;
			i_38_ = i_43_;
			i_39_ = i_44_;
			i_43_ >>= 1;
			i_44_ >>= 1;
			i_42_ >>= 1;
			i_41_++;
		}
	}

	void method2363() throws Throwable {
		method2378();
		super.finalize();
	}

	void method2364() {
		if (((Class137) this).anInt1647 > 0) {
			((Class505_Sub1) ((Class137) this).aClass505_Sub1_1646).anInt8370 -= method2358();
			int[] is = new int[1];
			is[0] = ((Class137) this).anInt1647;
			OpenGL.glDeleteTextures(1, is, 0);
			((Class137) this).anInt1647 = 0;
		}
	}

	void method2365() throws Throwable {
		method2378();
		super.finalize();
	}

	void method2366() {
		((Class137) this).aClass505_Sub1_1646.method13654(this);
		if (((Class137) this).aBool1652) {
			OpenGL.glTexParameteri(((Class137) this).anInt1648, 10241, ((Class137) this).aBool1641 ? 9987 : 9729);
			OpenGL.glTexParameteri(((Class137) this).anInt1648, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(((Class137) this).anInt1648, 10241, ((Class137) this).aBool1641 ? 9984 : 9728);
			OpenGL.glTexParameteri(((Class137) this).anInt1648, 10240, 9728);
		}
	}

	boolean method2367() {
		if (((Class505_Sub1) ((Class137) this).aClass505_Sub1_1646).aBool8472) {
			int i = method2358();
			((Class137) this).aClass505_Sub1_1646.method13654(this);
			OpenGL.glGenerateMipmapEXT(((Class137) this).anInt1648);
			((Class137) this).aBool1641 = true;
			method2352();
			method2357(i);
			return true;
		}
		return false;
	}

	boolean method2368() {
		if (((Class505_Sub1) ((Class137) this).aClass505_Sub1_1646).aBool8472) {
			int i = method2358();
			((Class137) this).aClass505_Sub1_1646.method13654(this);
			OpenGL.glGenerateMipmapEXT(((Class137) this).anInt1648);
			((Class137) this).aBool1641 = true;
			method2352();
			method2357(i);
			return true;
		}
		return false;
	}

	boolean method2369() {
		if (((Class505_Sub1) ((Class137) this).aClass505_Sub1_1646).aBool8472) {
			int i = method2358();
			((Class137) this).aClass505_Sub1_1646.method13654(this);
			OpenGL.glGenerateMipmapEXT(((Class137) this).anInt1648);
			((Class137) this).aBool1641 = true;
			method2352();
			method2357(i);
			return true;
		}
		return false;
	}

	void method2370(boolean bool) {
		if (((Class137) this).aBool1641 != bool) {
			int i = method2358();
			((Class137) this).aBool1641 = true;
			method2352();
			method2357(i);
		}
	}

	public void finalize() throws Throwable {
		method2378();
		super.finalize();
	}

	Class137(Class505_Sub1 class505_sub1, int i, Class150 class150, Class76 class76, int i_55_, boolean bool) {
		((Class137) this).aClass505_Sub1_1646 = class505_sub1;
		((Class137) this).anInt1648 = i;
		((Class137) this).aClass150_1650 = class150;
		((Class137) this).aClass76_1651 = class76;
		((Class137) this).aBool1641 = bool;
		((Class137) this).anInt1654 = i_55_;
		OpenGL.glGenTextures(1, anIntArray1649, 0);
		((Class137) this).anInt1647 = anIntArray1649[0];
		method2357(0);
	}

	static void method2371(int i, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int[] is) {
		if (i_57_ > 0 && !Class96_Sub9.method14585(i_57_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_58_ > 0 && !Class96_Sub9.method14585(i_58_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_59_ != 32993)
			throw new IllegalArgumentException("");
		int i_61_ = 0;
		int i_62_ = i_57_ < i_58_ ? i_57_ : i_58_;
		int i_63_ = i_57_ >> 1;
		int i_64_ = i_58_ >> 1;
		int[] is_65_ = is;
		int[] is_66_ = new int[i_63_ * i_64_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_61_, i_56_, i_57_, i_58_, 0, i_59_, i_60_, is_65_, 0);
			if (i_62_ <= 1)
				break;
			int i_67_ = 0;
			int i_68_ = 0;
			int i_69_ = i_68_ + i_57_;
			for (int i_70_ = 0; i_70_ < i_64_; i_70_++) {
				for (int i_71_ = 0; i_71_ < i_63_; i_71_++) {
					int i_72_ = is_65_[i_68_++];
					int i_73_ = is_65_[i_68_++];
					int i_74_ = is_65_[i_69_++];
					int i_75_ = is_65_[i_69_++];
					int i_76_ = i_72_ >> 24 & 0xff;
					int i_77_ = i_72_ >> 16 & 0xff;
					int i_78_ = i_72_ >> 8 & 0xff;
					int i_79_ = i_72_ & 0xff;
					i_76_ += i_73_ >> 24 & 0xff;
					i_77_ += i_73_ >> 16 & 0xff;
					i_78_ += i_73_ >> 8 & 0xff;
					i_79_ += i_73_ & 0xff;
					i_76_ += i_74_ >> 24 & 0xff;
					i_77_ += i_74_ >> 16 & 0xff;
					i_78_ += i_74_ >> 8 & 0xff;
					i_79_ += i_74_ & 0xff;
					i_76_ += i_75_ >> 24 & 0xff;
					i_77_ += i_75_ >> 16 & 0xff;
					i_78_ += i_75_ >> 8 & 0xff;
					i_79_ += i_75_ & 0xff;
					is_66_[i_67_++] = ((i_76_ & 0x3fc) << 22 | (i_77_ & 0x3fc) << 14 | (i_78_ & 0x3fc) << 6 | (i_79_ & 0x3fc) >> 2);
				}
				i_68_ += i_57_;
				i_69_ += i_57_;
			}
			int[] is_80_ = is_66_;
			is_66_ = is_65_;
			is_65_ = is_80_;
			i_57_ = i_63_;
			i_58_ = i_64_;
			i_63_ >>= 1;
			i_64_ >>= 1;
			i_62_ >>= 1;
			i_61_++;
		}
	}

	void method2372() {
		if (((Class137) this).anInt1647 > 0) {
			((Class505_Sub1) ((Class137) this).aClass505_Sub1_1646).anInt8370 -= method2358();
			int[] is = new int[1];
			is[0] = ((Class137) this).anInt1647;
			OpenGL.glDeleteTextures(1, is, 0);
			((Class137) this).anInt1647 = 0;
		}
	}

	void method2373(boolean bool) {
		if (((Class137) this).aBool1652 != bool) {
			((Class137) this).aBool1652 = bool;
			method2352();
		}
	}

	void method2374() {
		if (((Class137) this).anInt1647 > 0) {
			((Class137) this).aClass505_Sub1_1646.method13625(((Class137) this).anInt1647, method2358());
			((Class137) this).anInt1647 = 0;
		}
	}

	static void method2375(int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int[] is) {
		if (i_82_ > 0 && !Class96_Sub9.method14585(i_82_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_83_ > 0 && !Class96_Sub9.method14585(i_83_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_84_ != 32993)
			throw new IllegalArgumentException("");
		int i_86_ = 0;
		int i_87_ = i_82_ < i_83_ ? i_82_ : i_83_;
		int i_88_ = i_82_ >> 1;
		int i_89_ = i_83_ >> 1;
		int[] is_90_ = is;
		int[] is_91_ = new int[i_88_ * i_89_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_86_, i_81_, i_82_, i_83_, 0, i_84_, i_85_, is_90_, 0);
			if (i_87_ <= 1)
				break;
			int i_92_ = 0;
			int i_93_ = 0;
			int i_94_ = i_93_ + i_82_;
			for (int i_95_ = 0; i_95_ < i_89_; i_95_++) {
				for (int i_96_ = 0; i_96_ < i_88_; i_96_++) {
					int i_97_ = is_90_[i_93_++];
					int i_98_ = is_90_[i_93_++];
					int i_99_ = is_90_[i_94_++];
					int i_100_ = is_90_[i_94_++];
					int i_101_ = i_97_ >> 24 & 0xff;
					int i_102_ = i_97_ >> 16 & 0xff;
					int i_103_ = i_97_ >> 8 & 0xff;
					int i_104_ = i_97_ & 0xff;
					i_101_ += i_98_ >> 24 & 0xff;
					i_102_ += i_98_ >> 16 & 0xff;
					i_103_ += i_98_ >> 8 & 0xff;
					i_104_ += i_98_ & 0xff;
					i_101_ += i_99_ >> 24 & 0xff;
					i_102_ += i_99_ >> 16 & 0xff;
					i_103_ += i_99_ >> 8 & 0xff;
					i_104_ += i_99_ & 0xff;
					i_101_ += i_100_ >> 24 & 0xff;
					i_102_ += i_100_ >> 16 & 0xff;
					i_103_ += i_100_ >> 8 & 0xff;
					i_104_ += i_100_ & 0xff;
					is_91_[i_92_++] = ((i_101_ & 0x3fc) << 22 | (i_102_ & 0x3fc) << 14 | (i_103_ & 0x3fc) << 6 | (i_104_ & 0x3fc) >> 2);
				}
				i_93_ += i_82_;
				i_94_ += i_82_;
			}
			int[] is_105_ = is_91_;
			is_91_ = is_90_;
			is_90_ = is_105_;
			i_82_ = i_88_;
			i_83_ = i_89_;
			i_88_ >>= 1;
			i_89_ >>= 1;
			i_87_ >>= 1;
			i_86_++;
		}
	}

	static void method2376(int i, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, int[] is) {
		if (i_107_ > 0 && !Class96_Sub9.method14585(i_107_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_108_ > 0 && !Class96_Sub9.method14585(i_108_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_109_ != 32993)
			throw new IllegalArgumentException("");
		int i_111_ = 0;
		int i_112_ = i_107_ < i_108_ ? i_107_ : i_108_;
		int i_113_ = i_107_ >> 1;
		int i_114_ = i_108_ >> 1;
		int[] is_115_ = is;
		int[] is_116_ = new int[i_113_ * i_114_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_111_, i_106_, i_107_, i_108_, 0, i_109_, i_110_, is_115_, 0);
			if (i_112_ <= 1)
				break;
			int i_117_ = 0;
			int i_118_ = 0;
			int i_119_ = i_118_ + i_107_;
			for (int i_120_ = 0; i_120_ < i_114_; i_120_++) {
				for (int i_121_ = 0; i_121_ < i_113_; i_121_++) {
					int i_122_ = is_115_[i_118_++];
					int i_123_ = is_115_[i_118_++];
					int i_124_ = is_115_[i_119_++];
					int i_125_ = is_115_[i_119_++];
					int i_126_ = i_122_ >> 24 & 0xff;
					int i_127_ = i_122_ >> 16 & 0xff;
					int i_128_ = i_122_ >> 8 & 0xff;
					int i_129_ = i_122_ & 0xff;
					i_126_ += i_123_ >> 24 & 0xff;
					i_127_ += i_123_ >> 16 & 0xff;
					i_128_ += i_123_ >> 8 & 0xff;
					i_129_ += i_123_ & 0xff;
					i_126_ += i_124_ >> 24 & 0xff;
					i_127_ += i_124_ >> 16 & 0xff;
					i_128_ += i_124_ >> 8 & 0xff;
					i_129_ += i_124_ & 0xff;
					i_126_ += i_125_ >> 24 & 0xff;
					i_127_ += i_125_ >> 16 & 0xff;
					i_128_ += i_125_ >> 8 & 0xff;
					i_129_ += i_125_ & 0xff;
					is_116_[i_117_++] = ((i_126_ & 0x3fc) << 22 | (i_127_ & 0x3fc) << 14 | (i_128_ & 0x3fc) << 6 | (i_129_ & 0x3fc) >> 2);
				}
				i_118_ += i_107_;
				i_119_ += i_107_;
			}
			int[] is_130_ = is_116_;
			is_116_ = is_115_;
			is_115_ = is_130_;
			i_107_ = i_113_;
			i_108_ = i_114_;
			i_113_ >>= 1;
			i_114_ >>= 1;
			i_112_ >>= 1;
			i_111_++;
		}
	}

	static void method2377(int i, int i_131_, int i_132_, int i_133_, Class150 class150, byte[] is) {
		if (i_132_ > 0 && !Class96_Sub9.method14585(i_132_, 1942118537))
			throw new IllegalArgumentException("");
		if (i_133_ > 0 && !Class96_Sub9.method14585(i_133_, 1942118537))
			throw new IllegalArgumentException("");
		int i_134_ = class150.anInt1959 * 351642797;
		int i_135_ = 0;
		int i_136_ = i_132_ < i_133_ ? i_132_ : i_133_;
		int i_137_ = i_132_ >> 1;
		int i_138_ = i_133_ >> 1;
		byte[] is_139_ = is;
		byte[] is_140_ = new byte[i_137_ * i_138_ * i_134_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_135_, i_131_, i_132_, i_133_, 0, Class505_Sub1.method13629(class150), 5121, is_139_, 0);
			if (i_136_ <= 1)
				break;
			int i_141_ = i_132_ * i_134_;
			for (int i_142_ = 0; i_142_ < i_134_; i_142_++) {
				int i_143_ = i_142_;
				int i_144_ = i_142_;
				int i_145_ = i_144_ + i_141_;
				for (int i_146_ = 0; i_146_ < i_138_; i_146_++) {
					for (int i_147_ = 0; i_147_ < i_137_; i_147_++) {
						int i_148_ = is_139_[i_144_];
						i_144_ += i_134_;
						i_148_ += is_139_[i_144_];
						i_144_ += i_134_;
						i_148_ += is_139_[i_145_];
						i_145_ += i_134_;
						i_148_ += is_139_[i_145_];
						i_145_ += i_134_;
						is_140_[i_143_] = (byte) (i_148_ >> 2);
						i_143_ += i_134_;
					}
					i_144_ += i_141_;
					i_145_ += i_141_;
				}
			}
			byte[] is_149_ = is_140_;
			is_140_ = is_139_;
			is_139_ = is_149_;
			i_132_ = i_137_;
			i_133_ = i_138_;
			i_137_ >>= 1;
			i_138_ >>= 1;
			i_136_ >>= 1;
			i_135_++;
		}
	}

	void method2378() {
		if (((Class137) this).anInt1647 > 0) {
			((Class137) this).aClass505_Sub1_1646.method13625(((Class137) this).anInt1647, method2358());
			((Class137) this).anInt1647 = 0;
		}
	}
}
