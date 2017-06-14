/* Class298_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub23 extends Linkable {
	static int[] anIntArray7317;
	int anInt7318;
	int anInt7319;
	int anInt7320;
	int anInt7321;
	static float[] aFloatArray7322;
	float[] aFloatArray7323;
	static int anInt7324;
	static float[] aFloatArray7325;
	static int anInt7326;
	static int anInt7327;
	static Class265[] aClass265Array7328;
	static Class280[] aClass280Array7329;
	int anInt7330;
	static Class269[] aClass269Array7331;
	static boolean[] aBooleanArray7332;
	static int[] anIntArray7333;
	static boolean aBoolean7334 = false;
	int anInt7335;
	boolean aBoolean7336;
	int anInt7337;
	boolean aBoolean7338;
	static byte[] aByteArray7339;
	static float[] aFloatArray7340;
	byte[] aByteArray7341;
	static float[] aFloatArray7342;
	static float[] aFloatArray7343;
	static Class281[] aClass281Array7344;
	static float[] aFloatArray7345;
	static int[] anIntArray7346;
	byte[][] aByteArrayArray7347;
	static int anInt7348;
	static float[] aFloatArray7349;
	int anInt7350;

	void method3061(byte[] is) {
		RsByteBuffer class298_sub53 = new RsByteBuffer(is);
		((Class298_Sub23) this).anInt7318 = class298_sub53.readInt((byte) 55);
		((Class298_Sub23) this).anInt7335 = class298_sub53.readInt((byte) 18);
		((Class298_Sub23) this).anInt7320 = class298_sub53.readInt((byte) -10);
		((Class298_Sub23) this).anInt7321 = class298_sub53.readInt((byte) -87);
		if (((Class298_Sub23) this).anInt7321 < 0) {
			((Class298_Sub23) this).anInt7321 = ((Class298_Sub23) this).anInt7321 ^ 0xffffffff;
			((Class298_Sub23) this).aBoolean7336 = true;
		}
		int i = class298_sub53.readInt((byte) 96);
		((Class298_Sub23) this).aByteArrayArray7347 = new byte[i][];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = 0;
			int i_2_;
			do {
				i_2_ = class298_sub53.readUnsignedByte();
				i_1_ += i_2_;
			} while (i_2_ >= 255);
			byte[] is_3_ = new byte[i_1_];
			class298_sub53.readBytes(is_3_, 0, i_1_, -953523806);
			((Class298_Sub23) this).aByteArrayArray7347[i_0_] = is_3_;
		}
	}

	static void method3062(byte[] is, int i) {
		aByteArray7339 = is;
		anInt7324 = i;
		anInt7348 = 0;
	}

	static int method3063() {
		int i = aByteArray7339[anInt7324] >> anInt7348 & 0x1;
		anInt7348++;
		anInt7324 += anInt7348 >> 3;
		anInt7348 &= 0x7;
		return i;
	}

	static boolean method3064(Class243 class243) {
		if (!aBoolean7334) {
			byte[] is = class243.getFile(0, 0, (byte) -48);
			if (is == null)
				return false;
			method3069(is);
		}
		return true;
	}

	static Class298_Sub23 method3065(Class243 class243, int i, int i_4_) {
		if (!method3064(class243)) {
			class243.method2290(i, i_4_, -875831506);
			return null;
		}
		byte[] is = class243.getFile(i, i_4_, (byte) -123);
		if (is == null)
			return null;
		return new Class298_Sub23(is);
	}

	public static Class298_Sub23 method3066(Class243 class243, int i) {
		if (!method3064(class243)) {
			class243.method2310(i, -457216440);
			return null;
		}
		byte[] is = class243.method2294(i, (byte) 72);
		if (is == null)
			return null;
		return new Class298_Sub23(is);
	}

	public Class298_Sub26_Sub1 method3067(int[] is) {
		if (is != null && is[0] <= 0)
			return null;
		if (((Class298_Sub23) this).aByteArray7341 == null) {
			((Class298_Sub23) this).anInt7319 = 0;
			((Class298_Sub23) this).aFloatArray7323 = new float[anInt7327];
			((Class298_Sub23) this).aByteArray7341 = new byte[((Class298_Sub23) this).anInt7335];
			((Class298_Sub23) this).anInt7330 = 0;
			((Class298_Sub23) this).anInt7350 = 0;
		}
		for (/**/; (((Class298_Sub23) this).anInt7350 < ((Class298_Sub23) this).aByteArrayArray7347.length); ((Class298_Sub23) this).anInt7350++) {
			if (is != null && is[0] <= 0)
				return null;
			float[] fs = method3071(((Class298_Sub23) this).anInt7350);
			if (fs != null) {
				int i = ((Class298_Sub23) this).anInt7330;
				int i_5_ = fs.length;
				if (i_5_ > ((Class298_Sub23) this).anInt7335 - i)
					i_5_ = ((Class298_Sub23) this).anInt7335 - i;
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					int i_7_ = (int) (128.0F + fs[i_6_] * 128.0F);
					if ((i_7_ & ~0xff) != 0)
						i_7_ = (i_7_ ^ 0xffffffff) >> 31;
					((Class298_Sub23) this).aByteArray7341[i++] = (byte) (i_7_ - 128);
				}
				if (is != null)
					is[0] -= i - ((Class298_Sub23) this).anInt7330;
				((Class298_Sub23) this).anInt7330 = i;
			}
		}
		((Class298_Sub23) this).aFloatArray7323 = null;
		byte[] is_8_ = ((Class298_Sub23) this).aByteArray7341;
		((Class298_Sub23) this).aByteArray7341 = null;
		return new Class298_Sub26_Sub1(((Class298_Sub23) this).anInt7318, is_8_, ((Class298_Sub23) this).anInt7320, ((Class298_Sub23) this).anInt7321, ((Class298_Sub23) this).aBoolean7336);
	}

	static float method3068(int i) {
		int i_9_ = i & 0x1fffff;
		int i_10_ = i & ~0x7fffffff;
		int i_11_ = (i & 0x7fe00000) >> 21;
		if (i_10_ != 0)
			i_9_ = -i_9_;
		return (float) ((double) i_9_ * Math.pow(2.0, (double) (i_11_ - 788)));
	}

	static void method3069(byte[] is) {
		method3062(is, 0);
		anInt7326 = 1 << method3070(4);
		anInt7327 = 1 << method3070(4);
		aFloatArray7349 = new float[anInt7327];
		for (int i = 0; i < 2; i++) {
			int i_12_ = i != 0 ? anInt7327 : anInt7326;
			int i_13_ = i_12_ >> 1;
			int i_14_ = i_12_ >> 2;
			int i_15_ = i_12_ >> 3;
			float[] fs = new float[i_13_];
			for (int i_16_ = 0; i_16_ < i_14_; i_16_++) {
				fs[2 * i_16_] = (float) Math.cos((double) (4 * i_16_) * 3.141592653589793 / (double) i_12_);
				fs[2 * i_16_ + 1] = -(float) Math.sin((double) (4 * i_16_) * 3.141592653589793 / (double) i_12_);
			}
			float[] fs_17_ = new float[i_13_];
			for (int i_18_ = 0; i_18_ < i_14_; i_18_++) {
				fs_17_[2 * i_18_] = (float) Math.cos((double) (2 * i_18_ + 1) * 3.141592653589793 / (double) (2 * i_12_));
				fs_17_[2 * i_18_ + 1] = (float) Math.sin((double) (2 * i_18_ + 1) * 3.141592653589793 / (double) (2 * i_12_));
			}
			float[] fs_19_ = new float[i_14_];
			for (int i_20_ = 0; i_20_ < i_15_; i_20_++) {
				fs_19_[2 * i_20_] = (float) Math.cos((double) (4 * i_20_ + 2) * 3.141592653589793 / (double) i_12_);
				fs_19_[2 * i_20_ + 1] = -(float) Math.sin((double) (4 * i_20_ + 2) * 3.141592653589793 / (double) i_12_);
			}
			int[] is_21_ = new int[i_15_];
			int i_22_ = Class87.method970(i_15_ - 1, -1369747861);
			for (int i_23_ = 0; i_23_ < i_15_; i_23_++)
				is_21_[i_23_] = Class469.method6046(i_23_, i_22_, (byte) 19);
			if (i != 0) {
				aFloatArray7343 = fs;
				aFloatArray7325 = fs_17_;
				aFloatArray7345 = fs_19_;
				anIntArray7317 = is_21_;
			} else {
				aFloatArray7340 = fs;
				aFloatArray7322 = fs_17_;
				aFloatArray7342 = fs_19_;
				anIntArray7346 = is_21_;
			}
		}
		int i = method3070(8) + 1;
		aClass265Array7328 = new Class265[i];
		for (int i_24_ = 0; i_24_ < i; i_24_++)
			aClass265Array7328[i_24_] = new Class265();
		int i_25_ = method3070(6) + 1;
		for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
			method3070(16);
		i_25_ = method3070(6) + 1;
		aClass281Array7344 = new Class281[i_25_];
		for (int i_27_ = 0; i_27_ < i_25_; i_27_++)
			aClass281Array7344[i_27_] = new Class281();
		int i_28_ = method3070(6) + 1;
		aClass280Array7329 = new Class280[i_28_];
		for (int i_29_ = 0; i_29_ < i_28_; i_29_++)
			aClass280Array7329[i_29_] = new Class280();
		int i_30_ = method3070(6) + 1;
		aClass269Array7331 = new Class269[i_30_];
		for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
			aClass269Array7331[i_31_] = new Class269();
		int i_32_ = method3070(6) + 1;
		aBooleanArray7332 = new boolean[i_32_];
		anIntArray7333 = new int[i_32_];
		for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
			aBooleanArray7332[i_33_] = method3063() != 0;
			method3070(16);
			method3070(16);
			anIntArray7333[i_33_] = method3070(8);
		}
		aBoolean7334 = true;
	}

	static int method3070(int i) {
		int i_34_ = 0;
		int i_35_ = 0;
		int i_36_;
		for (/**/; i >= 8 - anInt7348; i -= i_36_) {
			i_36_ = 8 - anInt7348;
			int i_37_ = (1 << i_36_) - 1;
			i_34_ += (aByteArray7339[anInt7324] >> anInt7348 & i_37_) << i_35_;
			anInt7348 = 0;
			anInt7324++;
			i_35_ += i_36_;
		}
		if (i > 0) {
			i_36_ = (1 << i) - 1;
			i_34_ += (aByteArray7339[anInt7324] >> anInt7348 & i_36_) << i_35_;
			anInt7348 += i;
		}
		return i_34_;
	}

	float[] method3071(int i) {
		method3062(((Class298_Sub23) this).aByteArrayArray7347[i], 0);
		method3063();
		int i_38_ = method3070(Class87.method970(anIntArray7333.length - 1, -1535771411));
		boolean bool = aBooleanArray7332[i_38_];
		int i_39_ = bool ? anInt7327 : anInt7326;
		boolean bool_40_ = false;
		boolean bool_41_ = false;
		if (bool) {
			bool_40_ = method3063() != 0;
			bool_41_ = method3063() != 0;
		}
		int i_42_ = i_39_ >> 1;
		int i_43_;
		int i_44_;
		int i_45_;
		if (bool && !bool_40_) {
			i_43_ = (i_39_ >> 2) - (anInt7326 >> 2);
			i_44_ = (i_39_ >> 2) + (anInt7326 >> 2);
			i_45_ = anInt7326 >> 1;
		} else {
			i_43_ = 0;
			i_44_ = i_42_;
			i_45_ = i_39_ >> 1;
		}
		int i_46_;
		int i_47_;
		int i_48_;
		if (bool && !bool_41_) {
			i_46_ = i_39_ - (i_39_ >> 2) - (anInt7326 >> 2);
			i_47_ = i_39_ - (i_39_ >> 2) + (anInt7326 >> 2);
			i_48_ = anInt7326 >> 1;
		} else {
			i_46_ = i_42_;
			i_47_ = i_39_;
			i_48_ = i_39_ >> 1;
		}
		Class269 class269 = aClass269Array7331[anIntArray7333[i_38_]];
		int i_49_ = ((Class269) class269).anInt2884;
		int i_50_ = ((Class269) class269).anIntArray2886[i_49_];
		boolean bool_51_ = !aClass281Array7344[i_50_].method2613();
		boolean bool_52_ = bool_51_;
		for (i_50_ = 0; i_50_ < ((Class269) class269).anInt2885; i_50_++) {
			Class280 class280 = (aClass280Array7329[((Class269) class269).anIntArray2887[i_50_]]);
			float[] fs = aFloatArray7349;
			class280.method2609(fs, i_39_ >> 1, bool_52_);
		}
		if (!bool_51_) {
			i_50_ = ((Class269) class269).anInt2884;
			int i_53_ = ((Class269) class269).anIntArray2886[i_50_];
			aClass281Array7344[i_53_].method2614(aFloatArray7349, i_39_ >> 1);
		}
		if (bool_51_) {
			for (i_50_ = i_39_ >> 1; i_50_ < i_39_; i_50_++)
				aFloatArray7349[i_50_] = 0.0F;
		} else {
			i_50_ = i_39_ >> 1;
			int i_54_ = i_39_ >> 2;
			int i_55_ = i_39_ >> 3;
			float[] fs = aFloatArray7349;
			for (int i_56_ = 0; i_56_ < i_50_; i_56_++)
				fs[i_56_] *= 0.5F;
			for (int i_57_ = i_50_; i_57_ < i_39_; i_57_++)
				fs[i_57_] = -fs[i_39_ - i_57_ - 1];
			float[] fs_58_ = bool ? aFloatArray7343 : aFloatArray7340;
			float[] fs_59_ = bool ? aFloatArray7325 : aFloatArray7322;
			float[] fs_60_ = bool ? aFloatArray7345 : aFloatArray7342;
			int[] is = bool ? anIntArray7317 : anIntArray7346;
			for (int i_61_ = 0; i_61_ < i_54_; i_61_++) {
				float f = fs[4 * i_61_] - fs[i_39_ - 4 * i_61_ - 1];
				float f_62_ = fs[4 * i_61_ + 2] - fs[i_39_ - 4 * i_61_ - 3];
				float f_63_ = fs_58_[2 * i_61_];
				float f_64_ = fs_58_[2 * i_61_ + 1];
				fs[i_39_ - 4 * i_61_ - 1] = f * f_63_ - f_62_ * f_64_;
				fs[i_39_ - 4 * i_61_ - 3] = f * f_64_ + f_62_ * f_63_;
			}
			for (int i_65_ = 0; i_65_ < i_55_; i_65_++) {
				float f = fs[i_50_ + 3 + 4 * i_65_];
				float f_66_ = fs[i_50_ + 1 + 4 * i_65_];
				float f_67_ = fs[4 * i_65_ + 3];
				float f_68_ = fs[4 * i_65_ + 1];
				fs[i_50_ + 3 + 4 * i_65_] = f + f_67_;
				fs[i_50_ + 1 + 4 * i_65_] = f_66_ + f_68_;
				float f_69_ = fs_58_[i_50_ - 4 - 4 * i_65_];
				float f_70_ = fs_58_[i_50_ - 3 - 4 * i_65_];
				fs[4 * i_65_ + 3] = (f - f_67_) * f_69_ - (f_66_ - f_68_) * f_70_;
				fs[4 * i_65_ + 1] = (f_66_ - f_68_) * f_69_ + (f - f_67_) * f_70_;
			}
			int i_71_ = Class87.method970(i_39_ - 1, 1223920235);
			for (int i_72_ = 0; i_72_ < i_71_ - 3; i_72_++) {
				int i_73_ = i_39_ >> i_72_ + 2;
				int i_74_ = 8 << i_72_;
				for (int i_75_ = 0; i_75_ < 2 << i_72_; i_75_++) {
					int i_76_ = i_39_ - i_73_ * 2 * i_75_;
					int i_77_ = i_39_ - i_73_ * (2 * i_75_ + 1);
					for (int i_78_ = 0; i_78_ < i_39_ >> i_72_ + 4; i_78_++) {
						int i_79_ = 4 * i_78_;
						float f = fs[i_76_ - 1 - i_79_];
						float f_80_ = fs[i_76_ - 3 - i_79_];
						float f_81_ = fs[i_77_ - 1 - i_79_];
						float f_82_ = fs[i_77_ - 3 - i_79_];
						fs[i_76_ - 1 - i_79_] = f + f_81_;
						fs[i_76_ - 3 - i_79_] = f_80_ + f_82_;
						float f_83_ = fs_58_[i_78_ * i_74_];
						float f_84_ = fs_58_[i_78_ * i_74_ + 1];
						fs[i_77_ - 1 - i_79_] = (f - f_81_) * f_83_ - (f_80_ - f_82_) * f_84_;
						fs[i_77_ - 3 - i_79_] = (f_80_ - f_82_) * f_83_ + (f - f_81_) * f_84_;
					}
				}
			}
			for (int i_85_ = 1; i_85_ < i_55_ - 1; i_85_++) {
				int i_86_ = is[i_85_];
				if (i_85_ < i_86_) {
					int i_87_ = 8 * i_85_;
					int i_88_ = 8 * i_86_;
					float f = fs[i_87_ + 1];
					fs[i_87_ + 1] = fs[i_88_ + 1];
					fs[i_88_ + 1] = f;
					f = fs[i_87_ + 3];
					fs[i_87_ + 3] = fs[i_88_ + 3];
					fs[i_88_ + 3] = f;
					f = fs[i_87_ + 5];
					fs[i_87_ + 5] = fs[i_88_ + 5];
					fs[i_88_ + 5] = f;
					f = fs[i_87_ + 7];
					fs[i_87_ + 7] = fs[i_88_ + 7];
					fs[i_88_ + 7] = f;
				}
			}
			for (int i_89_ = 0; i_89_ < i_50_; i_89_++)
				fs[i_89_] = fs[2 * i_89_ + 1];
			for (int i_90_ = 0; i_90_ < i_55_; i_90_++) {
				fs[i_39_ - 1 - 2 * i_90_] = fs[4 * i_90_];
				fs[i_39_ - 2 - 2 * i_90_] = fs[4 * i_90_ + 1];
				fs[i_39_ - i_54_ - 1 - 2 * i_90_] = fs[4 * i_90_ + 2];
				fs[i_39_ - i_54_ - 2 - 2 * i_90_] = fs[4 * i_90_ + 3];
			}
			for (int i_91_ = 0; i_91_ < i_55_; i_91_++) {
				float f = fs_60_[2 * i_91_];
				float f_92_ = fs_60_[2 * i_91_ + 1];
				float f_93_ = fs[i_50_ + 2 * i_91_];
				float f_94_ = fs[i_50_ + 2 * i_91_ + 1];
				float f_95_ = fs[i_39_ - 2 - 2 * i_91_];
				float f_96_ = fs[i_39_ - 1 - 2 * i_91_];
				float f_97_ = f_92_ * (f_93_ - f_95_) + f * (f_94_ + f_96_);
				fs[i_50_ + 2 * i_91_] = (f_93_ + f_95_ + f_97_) * 0.5F;
				fs[i_39_ - 2 - 2 * i_91_] = (f_93_ + f_95_ - f_97_) * 0.5F;
				f_97_ = f_92_ * (f_94_ + f_96_) - f * (f_93_ - f_95_);
				fs[i_50_ + 2 * i_91_ + 1] = (f_94_ - f_96_ + f_97_) * 0.5F;
				fs[i_39_ - 1 - 2 * i_91_] = (-f_94_ + f_96_ + f_97_) * 0.5F;
			}
			for (int i_98_ = 0; i_98_ < i_54_; i_98_++) {
				fs[i_98_] = (fs[2 * i_98_ + i_50_] * fs_59_[2 * i_98_] + fs[2 * i_98_ + 1 + i_50_] * fs_59_[2 * i_98_ + 1]);
				fs[i_50_ - 1 - i_98_] = (fs[2 * i_98_ + i_50_] * fs_59_[2 * i_98_ + 1] - fs[2 * i_98_ + 1 + i_50_] * fs_59_[2 * i_98_]);
			}
			for (int i_99_ = 0; i_99_ < i_54_; i_99_++)
				fs[i_39_ - i_54_ + i_99_] = -fs[i_99_];
			for (int i_100_ = 0; i_100_ < i_54_; i_100_++)
				fs[i_100_] = fs[i_54_ + i_100_];
			for (int i_101_ = 0; i_101_ < i_54_; i_101_++)
				fs[i_54_ + i_101_] = -fs[i_54_ - i_101_ - 1];
			for (int i_102_ = 0; i_102_ < i_54_; i_102_++)
				fs[i_50_ + i_102_] = fs[i_39_ - i_102_ - 1];
			for (int i_103_ = i_43_; i_103_ < i_44_; i_103_++) {
				float f = (float) Math.sin(((double) (i_103_ - i_43_) + 0.5) / (double) i_45_ * 0.5 * 3.141592653589793);
				aFloatArray7349[i_103_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
			}
			for (int i_104_ = i_46_; i_104_ < i_47_; i_104_++) {
				float f = (float) Math.sin((((double) (i_104_ - i_46_) + 0.5) / (double) i_48_ * 0.5 * 3.141592653589793) + 1.5707963267948966);
				aFloatArray7349[i_104_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
			}
		}
		float[] fs = null;
		if (((Class298_Sub23) this).anInt7319 > 0) {
			int i_105_ = ((Class298_Sub23) this).anInt7319 + i_39_ >> 2;
			fs = new float[i_105_];
			if (!((Class298_Sub23) this).aBoolean7338) {
				for (int i_106_ = 0; i_106_ < ((Class298_Sub23) this).anInt7337; i_106_++) {
					int i_107_ = (((Class298_Sub23) this).anInt7319 >> 1) + i_106_;
					fs[i_106_] += ((Class298_Sub23) this).aFloatArray7323[i_107_];
				}
			}
			if (!bool_51_) {
				for (int i_108_ = i_43_; i_108_ < i_39_ >> 1; i_108_++) {
					int i_109_ = fs.length - (i_39_ >> 1) + i_108_;
					fs[i_109_] += aFloatArray7349[i_108_];
				}
			}
		}
		float[] fs_110_ = ((Class298_Sub23) this).aFloatArray7323;
		((Class298_Sub23) this).aFloatArray7323 = aFloatArray7349;
		aFloatArray7349 = fs_110_;
		((Class298_Sub23) this).anInt7319 = i_39_;
		((Class298_Sub23) this).anInt7337 = i_47_ - (i_39_ >> 1);
		((Class298_Sub23) this).aBoolean7338 = bool_51_;
		return fs;
	}

	Class298_Sub23(byte[] is) {
		method3061(is);
	}
}
