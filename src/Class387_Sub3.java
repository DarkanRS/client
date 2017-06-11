/* Class387_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class387_Sub3 extends Class387 {
	Class166[] aClass166Array7892;
	boolean aBoolean7893;
	Class_ra_Sub3 aClass_ra_Sub3_7894;
	int[] anIntArray7895;
	int anInt7896;
	short aShort7897;
	short aShort7898;
	int anInt7899 = 0;
	int anInt7900 = 0;
	int[] anIntArray7901;
	static int anInt7902;
	boolean aBoolean7903;
	Class68[] aClass68Array7904;
	static boolean aBoolean7905;
	int anInt7906 = 0;
	short[] aShortArray7907;
	short[] aShortArray7908;
	short[] aShortArray7909;
	short[] aShortArray7910;
	Class186 aClass186_7911;
	int anInt7912;
	int[] anIntArray7913;
	float[] aFloatArray7914;
	Class185 aClass185_7915;
	int anInt7916 = 0;
	int anInt7917 = 0;
	int[][] anIntArrayArray7918;
	short[] aShortArray7919;
	short[] aShortArray7920;
	short[] aShortArray7921;
	short[] aShortArray7922;
	short[] aShortArray7923;
	int[][] anIntArrayArray7924;
	short[] aShortArray7925;
	Class167 aClass167_7926;
	Class186 aClass186_7927;
	int anInt7928;
	static int[] anIntArray7929;
	Class186 aClass186_7930;
	boolean aBoolean7931 = false;
	boolean aBoolean7932 = true;
	static int[] anIntArray7933;
	Class186 aClass186_7934;
	short[] aShortArray7935;
	int anInt7936;
	static int anInt7937;
	int anInt7938;
	int anInt7939;
	int anInt7940;
	int anInt7941;
	int anInt7942;
	int anInt7943;
	int[] anIntArray7944;
	int[] anIntArray7945;
	int[][] anIntArrayArray7946;
	int[] anIntArray7947;
	short[] aShortArray7948;
	Class85[] aClass85Array7949;
	boolean aBoolean7950;
	int anInt7951;
	Class191[] aClass191Array7952;
	float[] aFloatArray7953;
	static int anInt7954 = 7;
	static long[] aLongArray7955;
	static int anInt7956;
	static int anInt7957 = 4;
	byte[] aByteArray7958;
	static int[] anIntArray7959;
	static int[] anIntArray7960;
	static int[] anIntArray7961;
	static float[] aFloatArray7962 = new float[2];
	byte[] aByteArray7963;
	short[] aShortArray7964;
	int[] anIntArray7965;
	static Class156 aClass156_7966;

	public int ya() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7941;
	}

	public int an() {
		return ((Class387_Sub3) this).anInt7912;
	}

	void method4832() {
		int i = 32767;
		int i_0_ = 32767;
		int i_1_ = 32767;
		int i_2_ = -32768;
		int i_3_ = -32768;
		int i_4_ = -32768;
		int i_5_ = 0;
		int i_6_ = 0;
		for (int i_7_ = 0; i_7_ < ((Class387_Sub3) this).anInt7900; i_7_++) {
			int i_8_ = ((Class387_Sub3) this).anIntArray7901[i_7_];
			int i_9_ = ((Class387_Sub3) this).anIntArray7895[i_7_];
			int i_10_ = ((Class387_Sub3) this).anIntArray7965[i_7_];
			if (i_8_ < i)
				i = i_8_;
			if (i_8_ > i_2_)
				i_2_ = i_8_;
			if (i_9_ < i_0_)
				i_0_ = i_9_;
			if (i_9_ > i_3_)
				i_3_ = i_9_;
			if (i_10_ < i_1_)
				i_1_ = i_10_;
			if (i_10_ > i_4_)
				i_4_ = i_10_;
			int i_11_ = i_8_ * i_8_ + i_10_ * i_10_;
			if (i_11_ > i_5_)
				i_5_ = i_11_;
			i_11_ = i_8_ * i_8_ + i_10_ * i_10_ + i_9_ * i_9_;
			if (i_11_ > i_6_)
				i_6_ = i_11_;
		}
		((Class387_Sub3) this).anInt7940 = i;
		((Class387_Sub3) this).anInt7941 = i_2_;
		((Class387_Sub3) this).anInt7938 = i_0_;
		((Class387_Sub3) this).anInt7939 = i_3_;
		((Class387_Sub3) this).anInt7942 = i_1_;
		((Class387_Sub3) this).anInt7943 = i_4_;
		((Class387_Sub3) this).anInt7936 = (int) (Math.sqrt((double) i_5_) + 0.99);
		((Class387_Sub3) this).anInt7928 = (int) (Math.sqrt((double) i_6_) + 0.99);
		((Class387_Sub3) this).aBoolean7950 = true;
	}

	static byte[] method4833(byte[] is, int i) {
		byte[] is_12_ = new byte[i];
		System.arraycopy(is, 0, is_12_, 0, i);
		return is_12_;
	}

	static short[] method4834(short[] is, int i) {
		short[] is_13_ = new short[i];
		System.arraycopy(is, 0, is_13_, 0, i);
		return is_13_;
	}

	boolean method4835() {
		if (((Class167) ((Class387_Sub3) this).aClass167_7926).aBoolean1710)
			return true;
		if ((((Class167) ((Class387_Sub3) this).aClass167_7926).anInterface7_Impl2_1709) == null)
			((Class167) ((Class387_Sub3) this).aClass167_7926).anInterface7_Impl2_1709 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.method5381(false);
		Interface7_Impl2 interface7_impl2 = (((Class167) ((Class387_Sub3) this).aClass167_7926).anInterface7_Impl2_1709);
		interface7_impl2.method113(((Class387_Sub3) this).anInt7917 * 6);
		Unsafe unsafe = ((Class387_Sub3) this).aClass_ra_Sub3_7894.anUnsafe8219;
		if (unsafe != null) {
			int i = ((Class387_Sub3) this).anInt7917 * 6;
			long l = interface7_impl2.method62(0, i);
			if (l == 0L)
				return false;
			for (int i_14_ = 0; i_14_ < ((Class387_Sub3) this).anInt7917; i_14_++) {
				unsafe.putShort(l, ((Class387_Sub3) this).aShortArray7920[i_14_]);
				l += 2L;
				unsafe.putShort(l, ((Class387_Sub3) this).aShortArray7921[i_14_]);
				l += 2L;
				unsafe.putShort(l, ((Class387_Sub3) this).aShortArray7922[i_14_]);
				l += 2L;
			}
			interface7_impl2.method69();
			((Class167) ((Class387_Sub3) this).aClass167_7926).anInterface7_Impl2_1707 = interface7_impl2;
			((Class167) ((Class387_Sub3) this).aClass167_7926).aBoolean1710 = true;
			((Class387_Sub3) this).aBoolean7932 = true;
			return true;
		}
		ByteBuffer bytebuffer = ((Class387_Sub3) this).aClass_ra_Sub3_7894.aByteBuffer8216;
		bytebuffer.clear();
		for (int i = 0; i < ((Class387_Sub3) this).anInt7917; i++) {
			bytebuffer.putShort(((Class387_Sub3) this).aShortArray7920[i]);
			bytebuffer.putShort(((Class387_Sub3) this).aShortArray7921[i]);
			bytebuffer.putShort(((Class387_Sub3) this).aShortArray7922[i]);
		}
		if (interface7_impl2.method63(0, bytebuffer.position(), (((Class387_Sub3) this).aClass_ra_Sub3_7894.aLong8217))) {
			((Class167) ((Class387_Sub3) this).aClass167_7926).anInterface7_Impl2_1707 = interface7_impl2;
			((Class167) ((Class387_Sub3) this).aClass167_7926).aBoolean1710 = true;
			((Class387_Sub3) this).aBoolean7932 = true;
			return true;
		}
		return false;
	}

	public int dp() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7943;
	}

	void method4738(int i, int[] is, int i_15_, int i_16_, int i_17_, int i_18_, boolean bool) {
		int i_19_ = is.length;
		if (i == 0) {
			i_15_ <<= 4;
			i_16_ <<= 4;
			i_17_ <<= 4;
			int i_20_ = 0;
			anInt7902 = 0;
			anInt7937 = 0;
			anInt7956 = 0;
			for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
				int i_22_ = is[i_21_];
				if (i_22_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_23_ = ((Class387_Sub3) this).anIntArrayArray7918[i_22_];
					for (int i_24_ = 0; i_24_ < is_23_.length; i_24_++) {
						int i_25_ = is_23_[i_24_];
						anInt7902 += ((Class387_Sub3) this).anIntArray7901[i_25_];
						anInt7937 += ((Class387_Sub3) this).anIntArray7895[i_25_];
						anInt7956 += ((Class387_Sub3) this).anIntArray7965[i_25_];
						i_20_++;
					}
				}
			}
			if (i_20_ > 0) {
				anInt7902 = anInt7902 / i_20_ + i_15_;
				anInt7937 = anInt7937 / i_20_ + i_16_;
				anInt7956 = anInt7956 / i_20_ + i_17_;
			} else {
				anInt7902 = i_15_;
				anInt7937 = i_16_;
				anInt7956 = i_17_;
			}
		} else if (i == 1) {
			i_15_ <<= 4;
			i_16_ <<= 4;
			i_17_ <<= 4;
			for (int i_26_ = 0; i_26_ < i_19_; i_26_++) {
				int i_27_ = is[i_26_];
				if (i_27_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_28_ = ((Class387_Sub3) this).anIntArrayArray7918[i_27_];
					for (int i_29_ = 0; i_29_ < is_28_.length; i_29_++) {
						int i_30_ = is_28_[i_29_];
						((Class387_Sub3) this).anIntArray7901[i_30_] += i_15_;
						((Class387_Sub3) this).anIntArray7895[i_30_] += i_16_;
						((Class387_Sub3) this).anIntArray7965[i_30_] += i_17_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_31_ = 0; i_31_ < i_19_; i_31_++) {
				int i_32_ = is[i_31_];
				if (i_32_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_33_ = ((Class387_Sub3) this).anIntArrayArray7918[i_32_];
					if ((i_18_ & 0x1) == 0) {
						for (int i_34_ = 0; i_34_ < is_33_.length; i_34_++) {
							int i_35_ = is_33_[i_34_];
							((Class387_Sub3) this).anIntArray7901[i_35_] -= anInt7902;
							((Class387_Sub3) this).anIntArray7895[i_35_] -= anInt7937;
							((Class387_Sub3) this).anIntArray7965[i_35_] -= anInt7956;
							if (i_17_ != 0) {
								int i_36_ = Class220.anIntArray2483[i_17_];
								int i_37_ = Class220.anIntArray2474[i_17_];
								int i_38_ = ((((Class387_Sub3) this).anIntArray7895[i_35_]) * i_36_ + (((Class387_Sub3) this).anIntArray7901[i_35_]) * i_37_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7895[i_35_] = ((((Class387_Sub3) this).anIntArray7895[i_35_]) * i_37_ - (((Class387_Sub3) this).anIntArray7901[i_35_]) * i_36_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7901[i_35_] = i_38_;
							}
							if (i_15_ != 0) {
								int i_39_ = Class220.anIntArray2483[i_15_];
								int i_40_ = Class220.anIntArray2474[i_15_];
								int i_41_ = ((((Class387_Sub3) this).anIntArray7895[i_35_]) * i_40_ - (((Class387_Sub3) this).anIntArray7965[i_35_]) * i_39_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7965[i_35_] = ((((Class387_Sub3) this).anIntArray7895[i_35_]) * i_39_ + (((Class387_Sub3) this).anIntArray7965[i_35_]) * i_40_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7895[i_35_] = i_41_;
							}
							if (i_16_ != 0) {
								int i_42_ = Class220.anIntArray2483[i_16_];
								int i_43_ = Class220.anIntArray2474[i_16_];
								int i_44_ = ((((Class387_Sub3) this).anIntArray7965[i_35_]) * i_42_ + (((Class387_Sub3) this).anIntArray7901[i_35_]) * i_43_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7965[i_35_] = ((((Class387_Sub3) this).anIntArray7965[i_35_]) * i_43_ - (((Class387_Sub3) this).anIntArray7901[i_35_]) * i_42_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7901[i_35_] = i_44_;
							}
							((Class387_Sub3) this).anIntArray7901[i_35_] += anInt7902;
							((Class387_Sub3) this).anIntArray7895[i_35_] += anInt7937;
							((Class387_Sub3) this).anIntArray7965[i_35_] += anInt7956;
						}
					} else {
						for (int i_45_ = 0; i_45_ < is_33_.length; i_45_++) {
							int i_46_ = is_33_[i_45_];
							((Class387_Sub3) this).anIntArray7901[i_46_] -= anInt7902;
							((Class387_Sub3) this).anIntArray7895[i_46_] -= anInt7937;
							((Class387_Sub3) this).anIntArray7965[i_46_] -= anInt7956;
							if (i_15_ != 0) {
								int i_47_ = Class220.anIntArray2483[i_15_];
								int i_48_ = Class220.anIntArray2474[i_15_];
								int i_49_ = ((((Class387_Sub3) this).anIntArray7895[i_46_]) * i_48_ - (((Class387_Sub3) this).anIntArray7965[i_46_]) * i_47_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7965[i_46_] = ((((Class387_Sub3) this).anIntArray7895[i_46_]) * i_47_ + (((Class387_Sub3) this).anIntArray7965[i_46_]) * i_48_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7895[i_46_] = i_49_;
							}
							if (i_17_ != 0) {
								int i_50_ = Class220.anIntArray2483[i_17_];
								int i_51_ = Class220.anIntArray2474[i_17_];
								int i_52_ = ((((Class387_Sub3) this).anIntArray7895[i_46_]) * i_50_ + (((Class387_Sub3) this).anIntArray7901[i_46_]) * i_51_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7895[i_46_] = ((((Class387_Sub3) this).anIntArray7895[i_46_]) * i_51_ - (((Class387_Sub3) this).anIntArray7901[i_46_]) * i_50_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7901[i_46_] = i_52_;
							}
							if (i_16_ != 0) {
								int i_53_ = Class220.anIntArray2483[i_16_];
								int i_54_ = Class220.anIntArray2474[i_16_];
								int i_55_ = ((((Class387_Sub3) this).anIntArray7965[i_46_]) * i_53_ + (((Class387_Sub3) this).anIntArray7901[i_46_]) * i_54_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7965[i_46_] = ((((Class387_Sub3) this).anIntArray7965[i_46_]) * i_54_ - (((Class387_Sub3) this).anIntArray7901[i_46_]) * i_53_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7901[i_46_] = i_55_;
							}
							((Class387_Sub3) this).anIntArray7901[i_46_] += anInt7902;
							((Class387_Sub3) this).anIntArray7895[i_46_] += anInt7937;
							((Class387_Sub3) this).anIntArray7965[i_46_] += anInt7956;
						}
					}
				}
			}
			if (bool) {
				for (int i_56_ = 0; i_56_ < i_19_; i_56_++) {
					int i_57_ = is[i_56_];
					if (i_57_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_58_ = (((Class387_Sub3) this).anIntArrayArray7918[i_57_]);
						for (int i_59_ = 0; i_59_ < is_58_.length; i_59_++) {
							int i_60_ = is_58_[i_59_];
							int i_61_ = ((Class387_Sub3) this).anIntArray7947[i_60_];
							int i_62_ = (((Class387_Sub3) this).anIntArray7947[i_60_ + 1]);
							for (int i_63_ = i_61_; i_63_ < i_62_; i_63_++) {
								int i_64_ = ((((Class387_Sub3) this).aShortArray7948[i_63_]) - 1);
								if (i_64_ == -1)
									break;
								if (i_17_ != 0) {
									int i_65_ = Class220.anIntArray2483[i_17_];
									int i_66_ = Class220.anIntArray2474[i_17_];
									int i_67_ = (((((Class387_Sub3) this).aShortArray7910[i_64_]) * i_65_ + (((Class387_Sub3) this).aShortArray7909[i_64_]) * i_66_ + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7910[i_64_] = (short) ((((((Class387_Sub3) this).aShortArray7910[i_64_]) * i_66_) - (((Class387_Sub3) this).aShortArray7909[i_64_]) * i_65_ + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7909[i_64_] = (short) i_67_;
								}
								if (i_15_ != 0) {
									int i_68_ = Class220.anIntArray2483[i_15_];
									int i_69_ = Class220.anIntArray2474[i_15_];
									int i_70_ = (((((Class387_Sub3) this).aShortArray7910[i_64_]) * i_69_ - (((Class387_Sub3) this).aShortArray7919[i_64_]) * i_68_ + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7919[i_64_] = (short) ((((((Class387_Sub3) this).aShortArray7910[i_64_]) * i_68_) + (((Class387_Sub3) this).aShortArray7919[i_64_]) * i_69_ + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7910[i_64_] = (short) i_70_;
								}
								if (i_16_ != 0) {
									int i_71_ = Class220.anIntArray2483[i_16_];
									int i_72_ = Class220.anIntArray2474[i_16_];
									int i_73_ = (((((Class387_Sub3) this).aShortArray7919[i_64_]) * i_71_ + (((Class387_Sub3) this).aShortArray7909[i_64_]) * i_72_ + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7919[i_64_] = (short) ((((((Class387_Sub3) this).aShortArray7919[i_64_]) * i_72_) - (((Class387_Sub3) this).aShortArray7909[i_64_]) * i_71_ + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7909[i_64_] = (short) i_73_;
								}
							}
						}
					}
				}
				method4839();
			}
		} else if (i == 3) {
			for (int i_74_ = 0; i_74_ < i_19_; i_74_++) {
				int i_75_ = is[i_74_];
				if (i_75_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_76_ = ((Class387_Sub3) this).anIntArrayArray7918[i_75_];
					for (int i_77_ = 0; i_77_ < is_76_.length; i_77_++) {
						int i_78_ = is_76_[i_77_];
						((Class387_Sub3) this).anIntArray7901[i_78_] -= anInt7902;
						((Class387_Sub3) this).anIntArray7895[i_78_] -= anInt7937;
						((Class387_Sub3) this).anIntArray7965[i_78_] -= anInt7956;
						((Class387_Sub3) this).anIntArray7901[i_78_] = (((Class387_Sub3) this).anIntArray7901[i_78_] * i_15_) >> 7;
						((Class387_Sub3) this).anIntArray7895[i_78_] = (((Class387_Sub3) this).anIntArray7895[i_78_] * i_16_) >> 7;
						((Class387_Sub3) this).anIntArray7965[i_78_] = (((Class387_Sub3) this).anIntArray7965[i_78_] * i_17_) >> 7;
						((Class387_Sub3) this).anIntArray7901[i_78_] += anInt7902;
						((Class387_Sub3) this).anIntArray7895[i_78_] += anInt7937;
						((Class387_Sub3) this).anIntArray7965[i_78_] += anInt7956;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub3) this).anIntArrayArray7924 != null) {
				boolean bool_79_ = false;
				for (int i_80_ = 0; i_80_ < i_19_; i_80_++) {
					int i_81_ = is[i_80_];
					if (i_81_ < ((Class387_Sub3) this).anIntArrayArray7924.length) {
						int[] is_82_ = (((Class387_Sub3) this).anIntArrayArray7924[i_81_]);
						for (int i_83_ = 0; i_83_ < is_82_.length; i_83_++) {
							int i_84_ = is_82_[i_83_];
							int i_85_ = (((Class387_Sub3) this).aByteArray7963[i_84_] & 0xff) + i_15_ * 8;
							if (i_85_ < 0)
								i_85_ = 0;
							else if (i_85_ > 255)
								i_85_ = 255;
							((Class387_Sub3) this).aByteArray7963[i_84_] = (byte) i_85_;
						}
						bool_79_ = bool_79_ | is_82_.length > 0;
					}
				}
				if (bool_79_) {
					if (((Class387_Sub3) this).aClass191Array7952 != null) {
						for (int i_86_ = 0; i_86_ < ((Class387_Sub3) this).anInt7951; i_86_++) {
							Class191 class191 = (((Class387_Sub3) this).aClass191Array7952[i_86_]);
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[i_86_]);
							((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & 0xffffff | 255 - ((((Class387_Sub3) this).aByteArray7963[((Class191) class191).anInt1947]) & 0xff) << 24);
						}
					}
					method4838();
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub3) this).anIntArrayArray7924 != null) {
				boolean bool_87_ = false;
				for (int i_88_ = 0; i_88_ < i_19_; i_88_++) {
					int i_89_ = is[i_88_];
					if (i_89_ < ((Class387_Sub3) this).anIntArrayArray7924.length) {
						int[] is_90_ = (((Class387_Sub3) this).anIntArrayArray7924[i_89_]);
						for (int i_91_ = 0; i_91_ < is_90_.length; i_91_++) {
							int i_92_ = is_90_[i_91_];
							int i_93_ = ((((Class387_Sub3) this).aShortArray7935[i_92_]) & 0xffff);
							int i_94_ = i_93_ >> 10 & 0x3f;
							int i_95_ = i_93_ >> 7 & 0x7;
							int i_96_ = i_93_ & 0x7f;
							i_94_ = i_94_ + i_15_ & 0x3f;
							i_95_ += i_16_ / 4;
							if (i_95_ < 0)
								i_95_ = 0;
							else if (i_95_ > 7)
								i_95_ = 7;
							i_96_ += i_17_;
							if (i_96_ < 0)
								i_96_ = 0;
							else if (i_96_ > 127)
								i_96_ = 127;
							((Class387_Sub3) this).aShortArray7935[i_92_] = (short) (i_94_ << 10 | i_95_ << 7 | i_96_);
						}
						bool_87_ = bool_87_ | is_90_.length > 0;
					}
				}
				if (bool_87_) {
					if (((Class387_Sub3) this).aClass191Array7952 != null) {
						for (int i_97_ = 0; i_97_ < ((Class387_Sub3) this).anInt7951; i_97_++) {
							Class191 class191 = (((Class387_Sub3) this).aClass191Array7952[i_97_]);
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[i_97_]);
							((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | (Class294.anIntArray3165[((((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff)]) & 0xffffff);
						}
					}
					method4838();
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_98_ = 0; i_98_ < i_19_; i_98_++) {
					int i_99_ = is[i_98_];
					if (i_99_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_100_ = (((Class387_Sub3) this).anIntArrayArray7946[i_99_]);
						for (int i_101_ = 0; i_101_ < is_100_.length; i_101_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_100_[i_101_]]);
							((Class166) class166).anInt1704 += i_15_;
							((Class166) class166).anInt1705 += i_16_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_102_ = 0; i_102_ < i_19_; i_102_++) {
					int i_103_ = is[i_102_];
					if (i_103_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_104_ = (((Class387_Sub3) this).anIntArrayArray7946[i_103_]);
						for (int i_105_ = 0; i_105_ < is_104_.length; i_105_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_104_[i_105_]]);
							((Class166) class166).anInt1702 = ((Class166) class166).anInt1702 * i_15_ >> 7;
							((Class166) class166).anInt1701 = ((Class166) class166).anInt1701 * i_16_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_106_ = 0; i_106_ < i_19_; i_106_++) {
					int i_107_ = is[i_106_];
					if (i_107_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_108_ = (((Class387_Sub3) this).anIntArrayArray7946[i_107_]);
						for (int i_109_ = 0; i_109_ < is_108_.length; i_109_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_108_[i_109_]]);
							((Class166) class166).anInt1706 = (((Class166) class166).anInt1706 + i_15_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void method4784() {
		if (((Class387_Sub3) this).anInt7906 > 0 && ((Class387_Sub3) this).anInt7917 > 0) {
			method4844();
			method4835();
			method4837();
		}
	}

	public Class387 method4755(byte i, int i_110_, boolean bool) {
		boolean bool_111_ = false;
		Class387_Sub3 class387_sub3_112_;
		Class387_Sub3 class387_sub3_113_;
		if (i > 0 && i <= 7) {
			class387_sub3_113_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass387_Sub3Array8267[i - 1]);
			class387_sub3_112_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass387_Sub3Array8288[i - 1]);
			bool_111_ = true;
		} else
			class387_sub3_112_ = class387_sub3_113_ = new Class387_Sub3(((Class387_Sub3) this).aClass_ra_Sub3_7894, 0, 0, true, false);
		return method4836(class387_sub3_112_, class387_sub3_113_, i_110_, bool_111_, bool);
	}

	Class387 method4836(Class387_Sub3 class387_sub3_114_, Class387_Sub3 class387_sub3_115_, int i, boolean bool, boolean bool_116_) {
		((Class387_Sub3) class387_sub3_114_).anInt7912 = i;
		((Class387_Sub3) class387_sub3_114_).anInt7896 = ((Class387_Sub3) this).anInt7896;
		((Class387_Sub3) class387_sub3_114_).aShort7897 = ((Class387_Sub3) this).aShort7897;
		((Class387_Sub3) class387_sub3_114_).aShort7898 = ((Class387_Sub3) this).aShort7898;
		((Class387_Sub3) class387_sub3_114_).anInt7899 = ((Class387_Sub3) this).anInt7899;
		((Class387_Sub3) class387_sub3_114_).anInt7900 = ((Class387_Sub3) this).anInt7900;
		((Class387_Sub3) class387_sub3_114_).anInt7906 = ((Class387_Sub3) this).anInt7906;
		((Class387_Sub3) class387_sub3_114_).anInt7916 = ((Class387_Sub3) this).anInt7916;
		((Class387_Sub3) class387_sub3_114_).anInt7917 = ((Class387_Sub3) this).anInt7917;
		((Class387_Sub3) class387_sub3_114_).anInt7951 = ((Class387_Sub3) this).anInt7951;
		if ((i & 0x100) != 0)
			((Class387_Sub3) class387_sub3_114_).aBoolean7893 = true;
		else
			((Class387_Sub3) class387_sub3_114_).aBoolean7893 = ((Class387_Sub3) this).aBoolean7893;
		((Class387_Sub3) class387_sub3_114_).aBoolean7903 = ((Class387_Sub3) this).aBoolean7903;
		boolean bool_117_ = Class154.method1659(i, ((Class387_Sub3) this).anInt7896);
		boolean bool_118_ = Class154.method1670(i, ((Class387_Sub3) this).anInt7896);
		boolean bool_119_ = Class154.method1660(i, ((Class387_Sub3) this).anInt7896);
		boolean bool_120_ = bool_117_ | bool_118_ | bool_119_;
		if (bool_120_) {
			if (bool_117_) {
				if (((Class387_Sub3) class387_sub3_115_).anIntArray7901 == null || ((((Class387_Sub3) class387_sub3_115_).anIntArray7901).length < ((Class387_Sub3) this).anInt7899))
					((Class387_Sub3) class387_sub3_114_).anIntArray7901 = ((Class387_Sub3) class387_sub3_115_).anIntArray7901 = new int[((Class387_Sub3) this).anInt7899];
				else
					((Class387_Sub3) class387_sub3_114_).anIntArray7901 = ((Class387_Sub3) class387_sub3_115_).anIntArray7901;
			} else
				((Class387_Sub3) class387_sub3_114_).anIntArray7901 = ((Class387_Sub3) this).anIntArray7901;
			if (bool_118_) {
				if (((Class387_Sub3) class387_sub3_115_).anIntArray7895 == null || ((((Class387_Sub3) class387_sub3_115_).anIntArray7895).length < ((Class387_Sub3) this).anInt7899))
					((Class387_Sub3) class387_sub3_114_).anIntArray7895 = ((Class387_Sub3) class387_sub3_115_).anIntArray7895 = new int[((Class387_Sub3) this).anInt7899];
				else
					((Class387_Sub3) class387_sub3_114_).anIntArray7895 = ((Class387_Sub3) class387_sub3_115_).anIntArray7895;
			} else
				((Class387_Sub3) class387_sub3_114_).anIntArray7895 = ((Class387_Sub3) this).anIntArray7895;
			if (bool_119_) {
				if (((Class387_Sub3) class387_sub3_115_).anIntArray7965 == null || ((((Class387_Sub3) class387_sub3_115_).anIntArray7965).length < ((Class387_Sub3) this).anInt7899))
					((Class387_Sub3) class387_sub3_114_).anIntArray7965 = ((Class387_Sub3) class387_sub3_115_).anIntArray7965 = new int[((Class387_Sub3) this).anInt7899];
				else
					((Class387_Sub3) class387_sub3_114_).anIntArray7965 = ((Class387_Sub3) class387_sub3_115_).anIntArray7965;
			} else
				((Class387_Sub3) class387_sub3_114_).anIntArray7965 = ((Class387_Sub3) this).anIntArray7965;
			for (int i_121_ = 0; i_121_ < ((Class387_Sub3) this).anInt7899; i_121_++) {
				if (bool_117_)
					((Class387_Sub3) class387_sub3_114_).anIntArray7901[i_121_] = ((Class387_Sub3) this).anIntArray7901[i_121_];
				if (bool_118_)
					((Class387_Sub3) class387_sub3_114_).anIntArray7895[i_121_] = ((Class387_Sub3) this).anIntArray7895[i_121_];
				if (bool_119_)
					((Class387_Sub3) class387_sub3_114_).anIntArray7965[i_121_] = ((Class387_Sub3) this).anIntArray7965[i_121_];
			}
		} else {
			((Class387_Sub3) class387_sub3_114_).anIntArray7901 = ((Class387_Sub3) this).anIntArray7901;
			((Class387_Sub3) class387_sub3_114_).anIntArray7895 = ((Class387_Sub3) this).anIntArray7895;
			((Class387_Sub3) class387_sub3_114_).anIntArray7965 = ((Class387_Sub3) this).anIntArray7965;
		}
		if (Class154.method1685(i, ((Class387_Sub3) this).anInt7896)) {
			((Class387_Sub3) class387_sub3_114_).aClass186_7927 = ((Class387_Sub3) class387_sub3_115_).aClass186_7927;
			((Class186) ((Class387_Sub3) class387_sub3_114_).aClass186_7927).anInterface7_Impl1_1902 = (((Class186) ((Class387_Sub3) this).aClass186_7927).anInterface7_Impl1_1902);
			((Class186) ((Class387_Sub3) class387_sub3_114_).aClass186_7927).aBoolean1900 = (((Class186) ((Class387_Sub3) this).aClass186_7927).aBoolean1900);
			((Class186) ((Class387_Sub3) class387_sub3_114_).aClass186_7927).aBoolean1901 = true;
		} else if (Class154.method1671(i, ((Class387_Sub3) this).anInt7896))
			((Class387_Sub3) class387_sub3_114_).aClass186_7927 = ((Class387_Sub3) this).aClass186_7927;
		else
			((Class387_Sub3) class387_sub3_114_).aClass186_7927 = null;
		if (Class154.method1662(i, ((Class387_Sub3) this).anInt7896)) {
			if (((Class387_Sub3) class387_sub3_115_).aShortArray7935 == null || (((Class387_Sub3) class387_sub3_115_).aShortArray7935.length < ((Class387_Sub3) this).anInt7916))
				((Class387_Sub3) class387_sub3_114_).aShortArray7935 = ((Class387_Sub3) class387_sub3_115_).aShortArray7935 = new short[((Class387_Sub3) this).anInt7916];
			else
				((Class387_Sub3) class387_sub3_114_).aShortArray7935 = ((Class387_Sub3) class387_sub3_115_).aShortArray7935;
			for (int i_122_ = 0; i_122_ < ((Class387_Sub3) this).anInt7916; i_122_++)
				((Class387_Sub3) class387_sub3_114_).aShortArray7935[i_122_] = ((Class387_Sub3) this).aShortArray7935[i_122_];
		} else
			((Class387_Sub3) class387_sub3_114_).aShortArray7935 = ((Class387_Sub3) this).aShortArray7935;
		if (Class154.method1663(i, ((Class387_Sub3) this).anInt7896)) {
			if (((Class387_Sub3) class387_sub3_115_).aByteArray7963 == null || (((Class387_Sub3) class387_sub3_115_).aByteArray7963.length < ((Class387_Sub3) this).anInt7916))
				((Class387_Sub3) class387_sub3_114_).aByteArray7963 = ((Class387_Sub3) class387_sub3_115_).aByteArray7963 = new byte[((Class387_Sub3) this).anInt7916];
			else
				((Class387_Sub3) class387_sub3_114_).aByteArray7963 = ((Class387_Sub3) class387_sub3_115_).aByteArray7963;
			for (int i_123_ = 0; i_123_ < ((Class387_Sub3) this).anInt7916; i_123_++)
				((Class387_Sub3) class387_sub3_114_).aByteArray7963[i_123_] = ((Class387_Sub3) this).aByteArray7963[i_123_];
		} else
			((Class387_Sub3) class387_sub3_114_).aByteArray7963 = ((Class387_Sub3) this).aByteArray7963;
		if (Class154.method1680(i, ((Class387_Sub3) this).anInt7896)) {
			((Class387_Sub3) class387_sub3_114_).aClass186_7911 = ((Class387_Sub3) class387_sub3_115_).aClass186_7911;
			((Class186) ((Class387_Sub3) class387_sub3_114_).aClass186_7911).anInterface7_Impl1_1902 = (((Class186) ((Class387_Sub3) this).aClass186_7911).anInterface7_Impl1_1902);
			((Class186) ((Class387_Sub3) class387_sub3_114_).aClass186_7911).aBoolean1900 = (((Class186) ((Class387_Sub3) this).aClass186_7911).aBoolean1900);
			((Class186) ((Class387_Sub3) class387_sub3_114_).aClass186_7911).aBoolean1901 = true;
		} else if (Class154.method1667(i, ((Class387_Sub3) this).anInt7896))
			((Class387_Sub3) class387_sub3_114_).aClass186_7911 = ((Class387_Sub3) this).aClass186_7911;
		else
			((Class387_Sub3) class387_sub3_114_).aClass186_7911 = null;
		if (Class154.method1661(i, ((Class387_Sub3) this).anInt7896)) {
			if (((Class387_Sub3) class387_sub3_115_).aShortArray7909 == null || (((Class387_Sub3) class387_sub3_115_).aShortArray7909.length < ((Class387_Sub3) this).anInt7906)) {
				int i_124_ = ((Class387_Sub3) this).anInt7906;
				((Class387_Sub3) class387_sub3_114_).aShortArray7909 = ((Class387_Sub3) class387_sub3_115_).aShortArray7909 = new short[i_124_];
				((Class387_Sub3) class387_sub3_114_).aShortArray7910 = ((Class387_Sub3) class387_sub3_115_).aShortArray7910 = new short[i_124_];
				((Class387_Sub3) class387_sub3_114_).aShortArray7919 = ((Class387_Sub3) class387_sub3_115_).aShortArray7919 = new short[i_124_];
			} else {
				((Class387_Sub3) class387_sub3_114_).aShortArray7909 = ((Class387_Sub3) class387_sub3_115_).aShortArray7909;
				((Class387_Sub3) class387_sub3_114_).aShortArray7910 = ((Class387_Sub3) class387_sub3_115_).aShortArray7910;
				((Class387_Sub3) class387_sub3_114_).aShortArray7919 = ((Class387_Sub3) class387_sub3_115_).aShortArray7919;
			}
			if (((Class387_Sub3) this).aClass185_7915 != null) {
				if (((Class387_Sub3) class387_sub3_115_).aClass185_7915 == null)
					((Class387_Sub3) class387_sub3_115_).aClass185_7915 = new Class185();
				Class185 class185 = (((Class387_Sub3) class387_sub3_114_).aClass185_7915 = ((Class387_Sub3) class387_sub3_115_).aClass185_7915);
				if (((Class185) class185).aShortArray1899 == null || (((Class185) class185).aShortArray1899.length < ((Class387_Sub3) this).anInt7906)) {
					int i_125_ = ((Class387_Sub3) this).anInt7906;
					((Class185) class185).aShortArray1899 = new short[i_125_];
					((Class185) class185).aShortArray1897 = new short[i_125_];
					((Class185) class185).aShortArray1896 = new short[i_125_];
					((Class185) class185).aByteArray1898 = new byte[i_125_];
				}
				for (int i_126_ = 0; i_126_ < ((Class387_Sub3) this).anInt7906; i_126_++) {
					((Class387_Sub3) class387_sub3_114_).aShortArray7909[i_126_] = ((Class387_Sub3) this).aShortArray7909[i_126_];
					((Class387_Sub3) class387_sub3_114_).aShortArray7910[i_126_] = ((Class387_Sub3) this).aShortArray7910[i_126_];
					((Class387_Sub3) class387_sub3_114_).aShortArray7919[i_126_] = ((Class387_Sub3) this).aShortArray7919[i_126_];
					((Class185) class185).aShortArray1899[i_126_] = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1899[i_126_]);
					((Class185) class185).aShortArray1897[i_126_] = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1897[i_126_]);
					((Class185) class185).aShortArray1896[i_126_] = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1896[i_126_]);
					((Class185) class185).aByteArray1898[i_126_] = (((Class185) ((Class387_Sub3) this).aClass185_7915).aByteArray1898[i_126_]);
				}
			} else {
				((Class387_Sub3) class387_sub3_114_).aClass185_7915 = null;
				for (int i_127_ = 0; i_127_ < ((Class387_Sub3) this).anInt7906; i_127_++) {
					((Class387_Sub3) class387_sub3_114_).aShortArray7909[i_127_] = ((Class387_Sub3) this).aShortArray7909[i_127_];
					((Class387_Sub3) class387_sub3_114_).aShortArray7910[i_127_] = ((Class387_Sub3) this).aShortArray7910[i_127_];
					((Class387_Sub3) class387_sub3_114_).aShortArray7919[i_127_] = ((Class387_Sub3) this).aShortArray7919[i_127_];
				}
			}
			((Class387_Sub3) class387_sub3_114_).aByteArray7958 = ((Class387_Sub3) this).aByteArray7958;
		} else {
			((Class387_Sub3) class387_sub3_114_).aClass185_7915 = ((Class387_Sub3) this).aClass185_7915;
			((Class387_Sub3) class387_sub3_114_).aShortArray7909 = ((Class387_Sub3) this).aShortArray7909;
			((Class387_Sub3) class387_sub3_114_).aShortArray7910 = ((Class387_Sub3) this).aShortArray7910;
			((Class387_Sub3) class387_sub3_114_).aShortArray7919 = ((Class387_Sub3) this).aShortArray7919;
			((Class387_Sub3) class387_sub3_114_).aByteArray7958 = ((Class387_Sub3) this).aByteArray7958;
		}
		if (Class154.method1669(i, ((Class387_Sub3) this).anInt7896)) {
			((Class387_Sub3) class387_sub3_114_).aClass186_7934 = ((Class387_Sub3) class387_sub3_115_).aClass186_7934;
			((Class186) ((Class387_Sub3) class387_sub3_114_).aClass186_7934).anInterface7_Impl1_1902 = (((Class186) ((Class387_Sub3) this).aClass186_7934).anInterface7_Impl1_1902);
			((Class186) ((Class387_Sub3) class387_sub3_114_).aClass186_7934).aBoolean1900 = (((Class186) ((Class387_Sub3) this).aClass186_7934).aBoolean1900);
			((Class186) ((Class387_Sub3) class387_sub3_114_).aClass186_7934).aBoolean1901 = true;
		} else if (Class154.method1690(i, ((Class387_Sub3) this).anInt7896))
			((Class387_Sub3) class387_sub3_114_).aClass186_7934 = ((Class387_Sub3) this).aClass186_7934;
		else
			((Class387_Sub3) class387_sub3_114_).aClass186_7934 = null;
		if (Class154.method1664(i, ((Class387_Sub3) this).anInt7896)) {
			if (((Class387_Sub3) class387_sub3_115_).aFloatArray7953 == null || (((Class387_Sub3) class387_sub3_115_).aFloatArray7953.length < ((Class387_Sub3) this).anInt7916)) {
				int i_128_ = ((Class387_Sub3) this).anInt7906;
				((Class387_Sub3) class387_sub3_114_).aFloatArray7953 = ((Class387_Sub3) class387_sub3_115_).aFloatArray7953 = new float[i_128_];
				((Class387_Sub3) class387_sub3_114_).aFloatArray7914 = ((Class387_Sub3) class387_sub3_115_).aFloatArray7914 = new float[i_128_];
			} else {
				((Class387_Sub3) class387_sub3_114_).aFloatArray7953 = ((Class387_Sub3) class387_sub3_115_).aFloatArray7953;
				((Class387_Sub3) class387_sub3_114_).aFloatArray7914 = ((Class387_Sub3) class387_sub3_115_).aFloatArray7914;
			}
			for (int i_129_ = 0; i_129_ < ((Class387_Sub3) this).anInt7906; i_129_++) {
				((Class387_Sub3) class387_sub3_114_).aFloatArray7953[i_129_] = ((Class387_Sub3) this).aFloatArray7953[i_129_];
				((Class387_Sub3) class387_sub3_114_).aFloatArray7914[i_129_] = ((Class387_Sub3) this).aFloatArray7914[i_129_];
			}
		} else {
			((Class387_Sub3) class387_sub3_114_).aFloatArray7953 = ((Class387_Sub3) this).aFloatArray7953;
			((Class387_Sub3) class387_sub3_114_).aFloatArray7914 = ((Class387_Sub3) this).aFloatArray7914;
		}
		if (Class154.method1692(i, ((Class387_Sub3) this).anInt7896)) {
			((Class387_Sub3) class387_sub3_114_).aClass186_7930 = ((Class387_Sub3) class387_sub3_115_).aClass186_7930;
			((Class186) ((Class387_Sub3) class387_sub3_114_).aClass186_7930).anInterface7_Impl1_1902 = (((Class186) ((Class387_Sub3) this).aClass186_7930).anInterface7_Impl1_1902);
			((Class186) ((Class387_Sub3) class387_sub3_114_).aClass186_7930).aBoolean1900 = (((Class186) ((Class387_Sub3) this).aClass186_7930).aBoolean1900);
			((Class186) ((Class387_Sub3) class387_sub3_114_).aClass186_7930).aBoolean1901 = true;
		} else if (Class154.method1683(i, ((Class387_Sub3) this).anInt7896))
			((Class387_Sub3) class387_sub3_114_).aClass186_7930 = ((Class387_Sub3) this).aClass186_7930;
		else
			((Class387_Sub3) class387_sub3_114_).aClass186_7930 = null;
		if (Class154.method1682(i, ((Class387_Sub3) this).anInt7896)) {
			if (((Class387_Sub3) class387_sub3_115_).aShortArray7920 == null || (((Class387_Sub3) class387_sub3_115_).aShortArray7920.length < ((Class387_Sub3) this).anInt7916)) {
				int i_130_ = ((Class387_Sub3) this).anInt7916;
				((Class387_Sub3) class387_sub3_114_).aShortArray7920 = ((Class387_Sub3) class387_sub3_115_).aShortArray7920 = new short[i_130_];
				((Class387_Sub3) class387_sub3_114_).aShortArray7921 = ((Class387_Sub3) class387_sub3_115_).aShortArray7921 = new short[i_130_];
				((Class387_Sub3) class387_sub3_114_).aShortArray7922 = ((Class387_Sub3) class387_sub3_115_).aShortArray7922 = new short[i_130_];
			} else {
				((Class387_Sub3) class387_sub3_114_).aShortArray7920 = ((Class387_Sub3) class387_sub3_115_).aShortArray7920;
				((Class387_Sub3) class387_sub3_114_).aShortArray7921 = ((Class387_Sub3) class387_sub3_115_).aShortArray7921;
				((Class387_Sub3) class387_sub3_114_).aShortArray7922 = ((Class387_Sub3) class387_sub3_115_).aShortArray7922;
			}
			for (int i_131_ = 0; i_131_ < ((Class387_Sub3) this).anInt7916; i_131_++) {
				((Class387_Sub3) class387_sub3_114_).aShortArray7920[i_131_] = ((Class387_Sub3) this).aShortArray7920[i_131_];
				((Class387_Sub3) class387_sub3_114_).aShortArray7921[i_131_] = ((Class387_Sub3) this).aShortArray7921[i_131_];
				((Class387_Sub3) class387_sub3_114_).aShortArray7922[i_131_] = ((Class387_Sub3) this).aShortArray7922[i_131_];
			}
		} else {
			((Class387_Sub3) class387_sub3_114_).aShortArray7920 = ((Class387_Sub3) this).aShortArray7920;
			((Class387_Sub3) class387_sub3_114_).aShortArray7921 = ((Class387_Sub3) this).aShortArray7921;
			((Class387_Sub3) class387_sub3_114_).aShortArray7922 = ((Class387_Sub3) this).aShortArray7922;
		}
		if (Class154.method1686(i, ((Class387_Sub3) this).anInt7896)) {
			((Class387_Sub3) class387_sub3_114_).aClass167_7926 = ((Class387_Sub3) class387_sub3_115_).aClass167_7926;
			((Class167) ((Class387_Sub3) class387_sub3_114_).aClass167_7926).anInterface7_Impl2_1707 = (((Class167) ((Class387_Sub3) this).aClass167_7926).anInterface7_Impl2_1707);
			((Class167) ((Class387_Sub3) class387_sub3_114_).aClass167_7926).aBoolean1710 = (((Class167) ((Class387_Sub3) this).aClass167_7926).aBoolean1710);
			((Class167) ((Class387_Sub3) class387_sub3_114_).aClass167_7926).aBoolean1708 = true;
		} else if (Class154.method1668(i, ((Class387_Sub3) this).anInt7896))
			((Class387_Sub3) class387_sub3_114_).aClass167_7926 = ((Class387_Sub3) this).aClass167_7926;
		else
			((Class387_Sub3) class387_sub3_114_).aClass167_7926 = null;
		if (Class154.method1665(i, ((Class387_Sub3) this).anInt7896)) {
			if (((Class387_Sub3) class387_sub3_115_).aShortArray7923 == null || (((Class387_Sub3) class387_sub3_115_).aShortArray7923.length < ((Class387_Sub3) this).anInt7916)) {
				int i_132_ = ((Class387_Sub3) this).anInt7916;
				((Class387_Sub3) class387_sub3_114_).aShortArray7923 = ((Class387_Sub3) class387_sub3_115_).aShortArray7923 = new short[i_132_];
			} else
				((Class387_Sub3) class387_sub3_114_).aShortArray7923 = ((Class387_Sub3) class387_sub3_115_).aShortArray7923;
			for (int i_133_ = 0; i_133_ < ((Class387_Sub3) this).anInt7916; i_133_++)
				((Class387_Sub3) class387_sub3_114_).aShortArray7923[i_133_] = ((Class387_Sub3) this).aShortArray7923[i_133_];
		} else
			((Class387_Sub3) class387_sub3_114_).aShortArray7923 = ((Class387_Sub3) this).aShortArray7923;
		if (Class154.method1666(i, ((Class387_Sub3) this).anInt7896)) {
			if (((Class387_Sub3) class387_sub3_115_).aClass166Array7892 == null || ((((Class387_Sub3) class387_sub3_115_).aClass166Array7892).length < ((Class387_Sub3) this).anInt7951)) {
				int i_134_ = ((Class387_Sub3) this).anInt7951;
				((Class387_Sub3) class387_sub3_114_).aClass166Array7892 = ((Class387_Sub3) class387_sub3_115_).aClass166Array7892 = new Class166[i_134_];
				for (int i_135_ = 0; i_135_ < ((Class387_Sub3) this).anInt7951; i_135_++)
					((Class387_Sub3) class387_sub3_114_).aClass166Array7892[i_135_] = ((Class387_Sub3) this).aClass166Array7892[i_135_].method1785();
			} else {
				((Class387_Sub3) class387_sub3_114_).aClass166Array7892 = ((Class387_Sub3) class387_sub3_115_).aClass166Array7892;
				for (int i_136_ = 0; i_136_ < ((Class387_Sub3) this).anInt7951; i_136_++)
					((Class387_Sub3) class387_sub3_114_).aClass166Array7892[i_136_].method1786(((Class387_Sub3) this).aClass166Array7892[i_136_]);
			}
		} else
			((Class387_Sub3) class387_sub3_114_).aClass166Array7892 = ((Class387_Sub3) this).aClass166Array7892;
		((Class387_Sub3) class387_sub3_114_).aClass191Array7952 = ((Class387_Sub3) this).aClass191Array7952;
		if (((Class387_Sub3) this).aBoolean7950) {
			((Class387_Sub3) class387_sub3_114_).anInt7928 = ((Class387_Sub3) this).anInt7928;
			((Class387_Sub3) class387_sub3_114_).anInt7936 = ((Class387_Sub3) this).anInt7936;
			((Class387_Sub3) class387_sub3_114_).anInt7940 = ((Class387_Sub3) this).anInt7940;
			((Class387_Sub3) class387_sub3_114_).anInt7941 = ((Class387_Sub3) this).anInt7941;
			((Class387_Sub3) class387_sub3_114_).anInt7938 = ((Class387_Sub3) this).anInt7938;
			((Class387_Sub3) class387_sub3_114_).anInt7939 = ((Class387_Sub3) this).anInt7939;
			((Class387_Sub3) class387_sub3_114_).anInt7942 = ((Class387_Sub3) this).anInt7942;
			((Class387_Sub3) class387_sub3_114_).anInt7943 = ((Class387_Sub3) this).anInt7943;
			((Class387_Sub3) class387_sub3_114_).aBoolean7950 = true;
		} else
			((Class387_Sub3) class387_sub3_114_).aBoolean7950 = false;
		((Class387_Sub3) class387_sub3_114_).anIntArrayArray7918 = ((Class387_Sub3) this).anIntArrayArray7918;
		((Class387_Sub3) class387_sub3_114_).anIntArrayArray7924 = ((Class387_Sub3) this).anIntArrayArray7924;
		((Class387_Sub3) class387_sub3_114_).anIntArrayArray7946 = ((Class387_Sub3) this).anIntArrayArray7946;
		((Class387_Sub3) class387_sub3_114_).aShortArray7948 = ((Class387_Sub3) this).aShortArray7948;
		((Class387_Sub3) class387_sub3_114_).anIntArray7947 = ((Class387_Sub3) this).anIntArray7947;
		((Class387_Sub3) class387_sub3_114_).aShortArray7907 = ((Class387_Sub3) this).aShortArray7907;
		((Class387_Sub3) class387_sub3_114_).aShortArray7908 = ((Class387_Sub3) this).aShortArray7908;
		((Class387_Sub3) class387_sub3_114_).aShortArray7964 = ((Class387_Sub3) this).aShortArray7964;
		((Class387_Sub3) class387_sub3_114_).aShortArray7925 = ((Class387_Sub3) this).aShortArray7925;
		((Class387_Sub3) class387_sub3_114_).anIntArray7944 = ((Class387_Sub3) this).anIntArray7944;
		((Class387_Sub3) class387_sub3_114_).anIntArray7913 = ((Class387_Sub3) this).anIntArray7913;
		((Class387_Sub3) class387_sub3_114_).anIntArray7945 = ((Class387_Sub3) this).anIntArray7945;
		((Class387_Sub3) class387_sub3_114_).aClass85Array7949 = ((Class387_Sub3) this).aClass85Array7949;
		((Class387_Sub3) class387_sub3_114_).aClass68Array7904 = ((Class387_Sub3) this).aClass68Array7904;
		return class387_sub3_114_;
	}

	void method4837() {
		if (((Class387_Sub3) this).aBoolean7932) {
			((Class387_Sub3) this).aBoolean7932 = false;
			if (((Class387_Sub3) this).aClass85Array7949 == null && ((Class387_Sub3) this).aClass68Array7904 == null && ((Class387_Sub3) this).aClass191Array7952 == null && !Class154.method1689(((Class387_Sub3) this).anInt7912, ((Class387_Sub3) this).anInt7896)) {
				boolean bool = false;
				boolean bool_137_ = false;
				boolean bool_138_ = false;
				if (((Class387_Sub3) this).anIntArray7901 != null && !Class154.method1672(((Class387_Sub3) this).anInt7912, (((Class387_Sub3) this).anInt7896))) {
					if (((Class387_Sub3) this).aClass186_7927 == null || ((Class387_Sub3) this).aClass186_7927.method1848()) {
						if (!((Class387_Sub3) this).aBoolean7950)
							method4832();
						bool = true;
					} else
						((Class387_Sub3) this).aBoolean7932 = true;
				}
				if (((Class387_Sub3) this).anIntArray7895 != null && !Class154.method1673(((Class387_Sub3) this).anInt7912, (((Class387_Sub3) this).anInt7896))) {
					if (((Class387_Sub3) this).aClass186_7927 == null || ((Class387_Sub3) this).aClass186_7927.method1848()) {
						if (!((Class387_Sub3) this).aBoolean7950)
							method4832();
						bool_137_ = true;
					} else
						((Class387_Sub3) this).aBoolean7932 = true;
				}
				if (((Class387_Sub3) this).anIntArray7965 != null && !Class154.method1674(((Class387_Sub3) this).anInt7912, (((Class387_Sub3) this).anInt7896))) {
					if (((Class387_Sub3) this).aClass186_7927 == null || ((Class387_Sub3) this).aClass186_7927.method1848()) {
						if (!((Class387_Sub3) this).aBoolean7950)
							method4832();
						bool_138_ = true;
					} else
						((Class387_Sub3) this).aBoolean7932 = true;
				}
				if (bool)
					((Class387_Sub3) this).anIntArray7901 = null;
				if (bool_137_)
					((Class387_Sub3) this).anIntArray7895 = null;
				if (bool_138_)
					((Class387_Sub3) this).anIntArray7965 = null;
			}
			if (((Class387_Sub3) this).aShortArray7948 != null && ((Class387_Sub3) this).anIntArray7901 == null && ((Class387_Sub3) this).anIntArray7895 == null && ((Class387_Sub3) this).anIntArray7965 == null) {
				((Class387_Sub3) this).aShortArray7948 = null;
				((Class387_Sub3) this).anIntArray7947 = null;
			}
			while_121_: do {
				if (((Class387_Sub3) this).aByteArray7958 != null && !Class154.method1675(((Class387_Sub3) this).anInt7912, (((Class387_Sub3) this).anInt7896))) {
					do {
						if ((((Class387_Sub3) this).anInt7896 & 0x37) != 0) {
							if (((Class387_Sub3) this).aClass186_7934 != null && !((Class387_Sub3) this).aClass186_7934.method1848())
								break;
						} else if ((((Class387_Sub3) this).aClass186_7911 != null) && !((Class387_Sub3) this).aClass186_7911.method1848())
							break;
						((Class387_Sub3) this).aShortArray7919 = null;
						((Class387_Sub3) this).aShortArray7910 = null;
						((Class387_Sub3) this).aShortArray7909 = null;
						((Class387_Sub3) this).aByteArray7958 = null;
						break while_121_;
					} while (false);
					((Class387_Sub3) this).aBoolean7932 = true;
				}
			} while (false);
			if (((Class387_Sub3) this).aShortArray7935 != null && !Class154.method1688(((Class387_Sub3) this).anInt7912, ((Class387_Sub3) this).anInt7896)) {
				if (((Class387_Sub3) this).aClass186_7911 == null || ((Class387_Sub3) this).aClass186_7911.method1848())
					((Class387_Sub3) this).aShortArray7935 = null;
				else
					((Class387_Sub3) this).aBoolean7932 = true;
			}
			if (((Class387_Sub3) this).aByteArray7963 != null && !Class154.method1687(((Class387_Sub3) this).anInt7912, ((Class387_Sub3) this).anInt7896)) {
				if (((Class387_Sub3) this).aClass186_7911 == null || ((Class387_Sub3) this).aClass186_7911.method1848())
					((Class387_Sub3) this).aByteArray7963 = null;
				else
					((Class387_Sub3) this).aBoolean7932 = true;
			}
			if (((Class387_Sub3) this).aFloatArray7953 != null && !Class154.method1676(((Class387_Sub3) this).anInt7912, ((Class387_Sub3) this).anInt7896)) {
				if (((Class387_Sub3) this).aClass186_7930 == null || ((Class387_Sub3) this).aClass186_7930.method1848()) {
					((Class387_Sub3) this).aFloatArray7914 = null;
					((Class387_Sub3) this).aFloatArray7953 = null;
				} else
					((Class387_Sub3) this).aBoolean7932 = true;
			}
			if (((Class387_Sub3) this).aShortArray7923 != null && !Class154.method1681(((Class387_Sub3) this).anInt7912, ((Class387_Sub3) this).anInt7896)) {
				if (((Class387_Sub3) this).aClass186_7911 == null || ((Class387_Sub3) this).aClass186_7911.method1848())
					((Class387_Sub3) this).aShortArray7923 = null;
				else
					((Class387_Sub3) this).aBoolean7932 = true;
			}
			if (((Class387_Sub3) this).aShortArray7920 != null && !Class154.method1691(((Class387_Sub3) this).anInt7912, ((Class387_Sub3) this).anInt7896)) {
				if ((((Class387_Sub3) this).aClass167_7926 == null || ((Class387_Sub3) this).aClass167_7926.method1787()) && (((Class387_Sub3) this).aClass186_7911 == null || ((Class387_Sub3) this).aClass186_7911.method1848())) {
					((Class387_Sub3) this).aShortArray7922 = null;
					((Class387_Sub3) this).aShortArray7921 = null;
					((Class387_Sub3) this).aShortArray7920 = null;
				} else
					((Class387_Sub3) this).aBoolean7932 = true;
			}
			if (((Class387_Sub3) this).aShortArray7907 != null) {
				if (((Class387_Sub3) this).aClass186_7927 == null || ((Class387_Sub3) this).aClass186_7927.method1848())
					((Class387_Sub3) this).aShortArray7907 = null;
				else
					((Class387_Sub3) this).aBoolean7932 = true;
			}
			if (((Class387_Sub3) this).aShortArray7908 != null) {
				if (((Class387_Sub3) this).aClass186_7911 == null || ((Class387_Sub3) this).aClass186_7911.method1848())
					((Class387_Sub3) this).aShortArray7908 = null;
				else
					((Class387_Sub3) this).aBoolean7932 = true;
			}
			if (((Class387_Sub3) this).anIntArrayArray7924 != null && !Class154.method1677(((Class387_Sub3) this).anInt7912, ((Class387_Sub3) this).anInt7896)) {
				((Class387_Sub3) this).anIntArrayArray7924 = null;
				((Class387_Sub3) this).aShortArray7925 = null;
			}
			if (((Class387_Sub3) this).anIntArrayArray7918 != null && !Class154.method1678(((Class387_Sub3) this).anInt7912, ((Class387_Sub3) this).anInt7896)) {
				((Class387_Sub3) this).anIntArrayArray7918 = null;
				((Class387_Sub3) this).aShortArray7964 = null;
			}
			if (((Class387_Sub3) this).anIntArrayArray7946 != null && !Class154.method1679(((Class387_Sub3) this).anInt7912, ((Class387_Sub3) this).anInt7896))
				((Class387_Sub3) this).anIntArrayArray7946 = null;
			if (((Class387_Sub3) this).anIntArray7944 != null && (((Class387_Sub3) this).anInt7912 & 0x800) == 0 && (((Class387_Sub3) this).anInt7912 & 0x40000) == 0) {
				((Class387_Sub3) this).anIntArray7944 = null;
				((Class387_Sub3) this).anIntArray7913 = null;
				((Class387_Sub3) this).anIntArray7945 = null;
			}
		}
	}

	public Class68[] method4775() {
		return ((Class387_Sub3) this).aClass68Array7904;
	}

	void method4838() {
		if (((Class387_Sub3) this).aClass186_7911 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7911).aBoolean1900 = false;
	}

	void method4839() {
		if ((((Class387_Sub3) this).anInt7896 & 0x37) != 0) {
			if (((Class387_Sub3) this).aClass186_7934 != null)
				((Class186) ((Class387_Sub3) this).aClass186_7934).aBoolean1900 = false;
		} else if (((Class387_Sub3) this).aClass186_7911 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7911).aBoolean1900 = false;
	}

	public Class_na ct(Class_na class_na) {
		if (((Class387_Sub3) this).anInt7906 == 0)
			return null;
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		int i;
		int i_139_;
		if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8299) > 0) {
			i = ((((Class387_Sub3) this).anInt7940 - ((((Class387_Sub3) this).anInt7939 * ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8299) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
			i_139_ = ((((Class387_Sub3) this).anInt7941 - ((((Class387_Sub3) this).anInt7938 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8299) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
		} else {
			i = ((((Class387_Sub3) this).anInt7940 - ((((Class387_Sub3) this).anInt7938 * ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8299) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
			i_139_ = ((((Class387_Sub3) this).anInt7941 - ((((Class387_Sub3) this).anInt7939 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8299) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
		}
		int i_140_;
		int i_141_;
		if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8317) > 0) {
			i_140_ = ((((Class387_Sub3) this).anInt7942 - ((((Class387_Sub3) this).anInt7939 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8317) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
			i_141_ = ((((Class387_Sub3) this).anInt7943 - ((((Class387_Sub3) this).anInt7938 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8317) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
		} else {
			i_140_ = ((((Class387_Sub3) this).anInt7942 - ((((Class387_Sub3) this).anInt7938 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8317) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
			i_141_ = ((((Class387_Sub3) this).anInt7943 - ((((Class387_Sub3) this).anInt7939 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8317) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
		}
		int i_142_ = i_139_ - i + 1;
		int i_143_ = i_141_ - i_140_ + 1;
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		Class_na_Sub2 class_na_sub2_144_;
		if (class_na_sub2 != null && class_na_sub2.method3489(i_142_, i_143_)) {
			class_na_sub2_144_ = class_na_sub2;
			class_na_sub2_144_.method3487();
		} else
			class_na_sub2_144_ = new Class_na_Sub2(((Class387_Sub3) this).aClass_ra_Sub3_7894, i_142_, i_143_);
		class_na_sub2_144_.method3486(i, i_140_, i_139_, i_141_);
		method4842(class_na_sub2_144_);
		return class_na_sub2_144_;
	}

	public void f(int i) {
		int i_145_ = Class220.anIntArray2483[i];
		int i_146_ = Class220.anIntArray2474[i];
		for (int i_147_ = 0; i_147_ < ((Class387_Sub3) this).anInt7900; i_147_++) {
			int i_148_ = ((((Class387_Sub3) this).anIntArray7965[i_147_] * i_145_ + ((Class387_Sub3) this).anIntArray7901[i_147_] * i_146_) >> 14);
			((Class387_Sub3) this).anIntArray7965[i_147_] = ((((Class387_Sub3) this).anIntArray7965[i_147_] * i_146_ - ((Class387_Sub3) this).anIntArray7901[i_147_] * i_145_) >> 14);
			((Class387_Sub3) this).anIntArray7901[i_147_] = i_148_;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public void t(int i) {
		int i_149_ = Class220.anIntArray2483[i];
		int i_150_ = Class220.anIntArray2474[i];
		for (int i_151_ = 0; i_151_ < ((Class387_Sub3) this).anInt7900; i_151_++) {
			int i_152_ = ((((Class387_Sub3) this).anIntArray7895[i_151_] * i_150_ - ((Class387_Sub3) this).anIntArray7965[i_151_] * i_149_) >> 14);
			((Class387_Sub3) this).anIntArray7965[i_151_] = ((((Class387_Sub3) this).anIntArray7895[i_151_] * i_149_ + ((Class387_Sub3) this).anIntArray7965[i_151_] * i_150_) >> 14);
			((Class387_Sub3) this).anIntArray7895[i_151_] = i_152_;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public void EA(int i) {
		int i_153_ = Class220.anIntArray2483[i];
		int i_154_ = Class220.anIntArray2474[i];
		for (int i_155_ = 0; i_155_ < ((Class387_Sub3) this).anInt7900; i_155_++) {
			int i_156_ = ((((Class387_Sub3) this).anIntArray7895[i_155_] * i_153_ + ((Class387_Sub3) this).anIntArray7901[i_155_] * i_154_) >> 14);
			((Class387_Sub3) this).anIntArray7895[i_155_] = ((((Class387_Sub3) this).anIntArray7895[i_155_] * i_154_ - ((Class387_Sub3) this).anIntArray7901[i_155_] * i_153_) >> 14);
			((Class387_Sub3) this).anIntArray7901[i_155_] = i_156_;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public void ia(int i, int i_157_, int i_158_) {
		for (int i_159_ = 0; i_159_ < ((Class387_Sub3) this).anInt7900; i_159_++) {
			if (i != 0)
				((Class387_Sub3) this).anIntArray7901[i_159_] += i;
			if (i_157_ != 0)
				((Class387_Sub3) this).anIntArray7895[i_159_] += i_157_;
			if (i_158_ != 0)
				((Class387_Sub3) this).anIntArray7965[i_159_] += i_158_;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public byte[] ah() {
		return ((Class387_Sub3) this).aByteArray7963;
	}

	public void oa(int i, int i_160_, int i_161_) {
		for (int i_162_ = 0; i_162_ < ((Class387_Sub3) this).anInt7900; i_162_++) {
			if (i != 128)
				((Class387_Sub3) this).anIntArray7901[i_162_] = ((Class387_Sub3) this).anIntArray7901[i_162_] * i >> 7;
			if (i_160_ != 128)
				((Class387_Sub3) this).anIntArray7895[i_162_] = (((Class387_Sub3) this).anIntArray7895[i_162_] * i_160_ >> 7);
			if (i_161_ != 128)
				((Class387_Sub3) this).anIntArray7965[i_162_] = (((Class387_Sub3) this).anIntArray7965[i_162_] * i_161_ >> 7);
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public Class387 method4748(byte i, int i_163_, boolean bool) {
		boolean bool_164_ = false;
		Class387_Sub3 class387_sub3_165_;
		Class387_Sub3 class387_sub3_166_;
		if (i > 0 && i <= 7) {
			class387_sub3_166_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass387_Sub3Array8267[i - 1]);
			class387_sub3_165_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass387_Sub3Array8288[i - 1]);
			bool_164_ = true;
		} else
			class387_sub3_165_ = class387_sub3_166_ = new Class387_Sub3(((Class387_Sub3) this).aClass_ra_Sub3_7894, 0, 0, true, false);
		return method4836(class387_sub3_165_, class387_sub3_166_, i_163_, bool_164_, bool);
	}

	public void pa(int i, int i_167_, Class_xa class_xa, Class_xa class_xa_168_, int i_169_, int i_170_, int i_171_) {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		int i_172_ = i_169_ + ((Class387_Sub3) this).anInt7940;
		int i_173_ = i_169_ + ((Class387_Sub3) this).anInt7941;
		int i_174_ = i_171_ + ((Class387_Sub3) this).anInt7942;
		int i_175_ = i_171_ + ((Class387_Sub3) this).anInt7943;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_172_ >= 0 && ((i_173_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6287 * -506105871) && i_174_ >= 0 && ((i_175_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6286 * -1148794921))) {
			if (i == 4 || i == 5) {
				if (class_xa_168_ == null || (i_172_ < 0 || ((i_173_ + class_xa_168_.anInt6288 * -1212653763 >> class_xa_168_.anInt6289 * -2137349879) >= class_xa_168_.anInt6287 * -506105871) || i_174_ < 0 || ((i_175_ + class_xa_168_.anInt6288 * -1212653763 >> class_xa_168_.anInt6289 * -2137349879) >= class_xa_168_.anInt6286 * -1148794921)))
					return;
			} else {
				i_172_ >>= class_xa.anInt6289 * -2137349879;
				i_173_ = (i_173_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				i_174_ >>= class_xa.anInt6289 * -2137349879;
				i_175_ = (i_175_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				if (class_xa.method6341(i_172_, i_174_, (byte) -124) == i_170_ && (class_xa.method6341(i_173_, i_174_, (byte) -30) == i_170_) && (class_xa.method6341(i_172_, i_175_, (byte) -100) == i_170_) && (class_xa.method6341(i_173_, i_175_, (byte) -104) == i_170_))
					return;
			}
			if (i == 1) {
				for (int i_176_ = 0; i_176_ < ((Class387_Sub3) this).anInt7900; i_176_++)
					((Class387_Sub3) this).anIntArray7895[i_176_] = (((Class387_Sub3) this).anIntArray7895[i_176_] + class_xa.method6340(((((Class387_Sub3) this).anIntArray7901[i_176_]) + i_169_), ((((Class387_Sub3) this).anIntArray7965[i_176_]) + i_171_), -1680457516) - i_170_);
			} else if (i == 2) {
				int i_177_ = ((Class387_Sub3) this).anInt7938;
				if (i_177_ == 0)
					return;
				for (int i_178_ = 0; i_178_ < ((Class387_Sub3) this).anInt7900; i_178_++) {
					int i_179_ = (((Class387_Sub3) this).anIntArray7895[i_178_] << 16) / i_177_;
					if (i_179_ < i_167_)
						((Class387_Sub3) this).anIntArray7895[i_178_] = (((Class387_Sub3) this).anIntArray7895[i_178_] + (class_xa.method6340((((Class387_Sub3) this).anIntArray7901[i_178_]) + i_169_, (((Class387_Sub3) this).anIntArray7965[i_178_]) + i_171_, -1706111217) - i_170_) * (i_167_ - i_179_) / i_167_);
				}
			} else if (i == 3) {
				int i_180_ = (i_167_ & 0xff) * 4;
				int i_181_ = (i_167_ >> 8 & 0xff) * 4;
				int i_182_ = (i_167_ >> 16 & 0xff) << 6;
				int i_183_ = (i_167_ >> 24 & 0xff) << 6;
				if (i_169_ - (i_180_ >> 1) < 0 || ((i_169_ + (i_180_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6287 * -506105871 << class_xa.anInt6289 * -2137349879)) || i_171_ - (i_181_ >> 1) < 0 || ((i_171_ + (i_181_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6286 * -1148794921 << class_xa.anInt6289 * -2137349879)))
					return;
				method4732(class_xa, i_169_, i_170_, i_171_, i_180_, i_181_, i_182_, i_183_);
			} else if (i == 4) {
				int i_184_ = (((Class387_Sub3) this).anInt7939 - ((Class387_Sub3) this).anInt7938);
				for (int i_185_ = 0; i_185_ < ((Class387_Sub3) this).anInt7900; i_185_++)
					((Class387_Sub3) this).anIntArray7895[i_185_] = (((Class387_Sub3) this).anIntArray7895[i_185_] + (class_xa_168_.method6340((((Class387_Sub3) this).anIntArray7901[i_185_]) + i_169_, (((Class387_Sub3) this).anIntArray7965[i_185_]) + i_171_, -1523371782) - i_170_) + i_184_);
			} else if (i == 5) {
				int i_186_ = (((Class387_Sub3) this).anInt7939 - ((Class387_Sub3) this).anInt7938);
				for (int i_187_ = 0; i_187_ < ((Class387_Sub3) this).anInt7900; i_187_++) {
					int i_188_ = (((Class387_Sub3) this).anIntArray7901[i_187_] + i_169_);
					int i_189_ = (((Class387_Sub3) this).anIntArray7965[i_187_] + i_171_);
					int i_190_ = class_xa.method6340(i_188_, i_189_, -1428452858);
					int i_191_ = class_xa_168_.method6340(i_188_, i_189_, -2144565564);
					int i_192_ = i_190_ - i_191_ - i_167_;
					((Class387_Sub3) this).anIntArray7895[i_187_] = ((((Class387_Sub3) this).anIntArray7895[i_187_] << 8) / i_186_ * i_192_ >> 8) - (i_170_ - i_190_);
				}
			}
			method4851();
			((Class387_Sub3) this).aBoolean7950 = false;
		}
	}

	void method4840() {
		if (((Class387_Sub3) this).aClass167_7926 != null)
			((Class167) ((Class387_Sub3) this).aClass167_7926).aBoolean1710 = false;
	}

	Class387_Sub3(Class_ra_Sub3 class_ra_sub3, int i, int i_193_, boolean bool, boolean bool_194_) {
		((Class387_Sub3) this).aBoolean7893 = false;
		((Class387_Sub3) this).aBoolean7903 = false;
		((Class387_Sub3) this).aBoolean7950 = false;
		((Class387_Sub3) this).aClass_ra_Sub3_7894 = class_ra_sub3;
		((Class387_Sub3) this).anInt7912 = i;
		((Class387_Sub3) this).anInt7896 = i_193_;
		((Class387_Sub3) this).aBoolean7931 = bool_194_;
		if (bool || Class154.method1671(((Class387_Sub3) this).anInt7912, ((Class387_Sub3) this).anInt7896))
			((Class387_Sub3) this).aClass186_7927 = new Class186(Class154.method1685((((Class387_Sub3) this).anInt7912), (((Class387_Sub3) this).anInt7896)));
		if (bool || Class154.method1683(((Class387_Sub3) this).anInt7912, ((Class387_Sub3) this).anInt7896))
			((Class387_Sub3) this).aClass186_7930 = new Class186(Class154.method1692((((Class387_Sub3) this).anInt7912), (((Class387_Sub3) this).anInt7896)));
		if (bool || Class154.method1667(((Class387_Sub3) this).anInt7912, ((Class387_Sub3) this).anInt7896))
			((Class387_Sub3) this).aClass186_7911 = new Class186(Class154.method1680((((Class387_Sub3) this).anInt7912), (((Class387_Sub3) this).anInt7896)));
		if (bool || Class154.method1690(((Class387_Sub3) this).anInt7912, ((Class387_Sub3) this).anInt7896))
			((Class387_Sub3) this).aClass186_7934 = new Class186(Class154.method1669((((Class387_Sub3) this).anInt7912), (((Class387_Sub3) this).anInt7896)));
		if (bool || Class154.method1668(((Class387_Sub3) this).anInt7912, ((Class387_Sub3) this).anInt7896))
			((Class387_Sub3) this).aClass167_7926 = new Class167(Class154.method1686((((Class387_Sub3) this).anInt7912), (((Class387_Sub3) this).anInt7896)));
		if (bool && bool_194_) {
			((Class186) ((Class387_Sub3) this).aClass186_7927).anInterface7_Impl1_1903 = ((Class186) ((Class387_Sub3) this).aClass186_7927).anInterface7_Impl1_1902 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.method5382(((Class387_Sub3) this).aBoolean7931);
			((Class186) ((Class387_Sub3) this).aClass186_7930).anInterface7_Impl1_1903 = ((Class186) ((Class387_Sub3) this).aClass186_7930).anInterface7_Impl1_1902 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.method5382(((Class387_Sub3) this).aBoolean7931);
			((Class186) ((Class387_Sub3) this).aClass186_7911).anInterface7_Impl1_1903 = ((Class186) ((Class387_Sub3) this).aClass186_7911).anInterface7_Impl1_1902 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.method5382(((Class387_Sub3) this).aBoolean7931);
			((Class186) ((Class387_Sub3) this).aClass186_7934).anInterface7_Impl1_1903 = ((Class186) ((Class387_Sub3) this).aClass186_7934).anInterface7_Impl1_1902 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.method5382(((Class387_Sub3) this).aBoolean7931);
		}
	}

	public int YA() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7938;
	}

	public int dk() {
		return ((Class387_Sub3) this).aShort7897;
	}

	public int AA() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7942;
	}

	public boolean method4763(int i, int i_195_, Matrix3f class222, boolean bool, int i_196_) {
		Matrix4f class233 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236;
		class233.method2145(class222);
		class233.method2144(((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8205);
		boolean bool_197_ = false;
		float f = 3.4028235E38F;
		float f_198_ = -3.4028235E38F;
		float f_199_ = 3.4028235E38F;
		float f_200_ = -3.4028235E38F;
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		int i_201_ = ((((Class387_Sub3) this).anInt7941 - ((Class387_Sub3) this).anInt7940) >> 1);
		int i_202_ = ((((Class387_Sub3) this).anInt7939 - ((Class387_Sub3) this).anInt7938) >> 1);
		int i_203_ = ((((Class387_Sub3) this).anInt7943 - ((Class387_Sub3) this).anInt7942) >> 1);
		int i_204_ = ((Class387_Sub3) this).anInt7940 + i_201_;
		int i_205_ = ((Class387_Sub3) this).anInt7938 + i_202_;
		int i_206_ = ((Class387_Sub3) this).anInt7942 + i_203_;
		int i_207_ = i_204_ - (i_201_ << i_196_);
		int i_208_ = i_205_ - (i_202_ << i_196_);
		int i_209_ = i_206_ - (i_203_ << i_196_);
		int i_210_ = i_204_ + (i_201_ << i_196_);
		int i_211_ = i_205_ + (i_202_ << i_196_);
		int i_212_ = i_206_ + (i_203_ << i_196_);
		anIntArray7959[0] = i_207_;
		anIntArray7960[0] = i_208_;
		anIntArray7961[0] = i_209_;
		anIntArray7959[1] = i_210_;
		anIntArray7960[1] = i_208_;
		anIntArray7961[1] = i_209_;
		anIntArray7959[2] = i_207_;
		anIntArray7960[2] = i_211_;
		anIntArray7961[2] = i_209_;
		anIntArray7959[3] = i_210_;
		anIntArray7960[3] = i_211_;
		anIntArray7961[3] = i_209_;
		anIntArray7959[4] = i_207_;
		anIntArray7960[4] = i_208_;
		anIntArray7961[4] = i_212_;
		anIntArray7959[5] = i_210_;
		anIntArray7960[5] = i_208_;
		anIntArray7961[5] = i_212_;
		anIntArray7959[6] = i_207_;
		anIntArray7960[6] = i_211_;
		anIntArray7961[6] = i_212_;
		anIntArray7959[7] = i_210_;
		anIntArray7960[7] = i_211_;
		anIntArray7961[7] = i_212_;
		for (int i_213_ = 0; i_213_ < 8; i_213_++) {
			float f_214_ = (float) anIntArray7959[i_213_];
			float f_215_ = (float) anIntArray7960[i_213_];
			float f_216_ = (float) anIntArray7961[i_213_];
			float f_217_ = (class233.aFloatArray2594[2] * f_214_ + class233.aFloatArray2594[6] * f_215_ + class233.aFloatArray2594[10] * f_216_ + class233.aFloatArray2594[14]);
			float f_218_ = (class233.aFloatArray2594[3] * f_214_ + class233.aFloatArray2594[7] * f_215_ + class233.aFloatArray2594[11] * f_216_ + class233.aFloatArray2594[15]);
			if (f_217_ >= -f_218_) {
				float f_219_ = (class233.aFloatArray2594[0] * f_214_ + class233.aFloatArray2594[4] * f_215_ + class233.aFloatArray2594[8] * f_216_ + class233.aFloatArray2594[12]);
				float f_220_ = (class233.aFloatArray2594[1] * f_214_ + class233.aFloatArray2594[5] * f_215_ + class233.aFloatArray2594[9] * f_216_ + class233.aFloatArray2594[13]);
				float f_221_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8253 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_219_ / f_218_));
				float f_222_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8255 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256 * f_220_ / f_218_));
				if (f_221_ < f)
					f = f_221_;
				if (f_221_ > f_198_)
					f_198_ = f_221_;
				if (f_222_ < f_199_)
					f_199_ = f_222_;
				if (f_222_ > f_200_)
					f_200_ = f_222_;
				bool_197_ = true;
			}
		}
		if (bool_197_ && (float) i > f && (float) i < f_198_ && (float) i_195_ > f_199_ && (float) i_195_ < f_200_) {
			if (bool)
				return true;
			if (anIntArray7933.length < ((Class387_Sub3) this).anInt7906) {
				anIntArray7933 = new int[((Class387_Sub3) this).anInt7906];
				anIntArray7929 = new int[((Class387_Sub3) this).anInt7906];
			}
			for (int i_223_ = 0; i_223_ < ((Class387_Sub3) this).anInt7900; i_223_++) {
				float f_224_ = (float) ((Class387_Sub3) this).anIntArray7901[i_223_];
				float f_225_ = (float) ((Class387_Sub3) this).anIntArray7895[i_223_];
				float f_226_ = (float) ((Class387_Sub3) this).anIntArray7965[i_223_];
				float f_227_ = (class233.aFloatArray2594[2] * f_224_ + class233.aFloatArray2594[6] * f_225_ + class233.aFloatArray2594[10] * f_226_ + class233.aFloatArray2594[14]);
				float f_228_ = (class233.aFloatArray2594[3] * f_224_ + class233.aFloatArray2594[7] * f_225_ + class233.aFloatArray2594[11] * f_226_ + class233.aFloatArray2594[15]);
				if (f_227_ >= -f_228_) {
					float f_229_ = (class233.aFloatArray2594[0] * f_224_ + class233.aFloatArray2594[4] * f_225_ + class233.aFloatArray2594[8] * f_226_ + class233.aFloatArray2594[12]);
					float f_230_ = (class233.aFloatArray2594[1] * f_224_ + class233.aFloatArray2594[5] * f_225_ + class233.aFloatArray2594[9] * f_226_ + class233.aFloatArray2594[13]);
					int i_231_ = ((Class387_Sub3) this).anIntArray7947[i_223_];
					int i_232_ = ((Class387_Sub3) this).anIntArray7947[i_223_ + 1];
					for (int i_233_ = i_231_; i_233_ < i_232_; i_233_++) {
						int i_234_ = (((Class387_Sub3) this).aShortArray7948[i_233_] - 1);
						if (i_234_ == -1)
							break;
						anIntArray7933[i_234_] = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8253) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_229_ / f_228_));
						anIntArray7929[i_234_] = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8255) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256 * f_230_ / f_228_));
					}
				} else {
					int i_235_ = ((Class387_Sub3) this).anIntArray7947[i_223_];
					int i_236_ = ((Class387_Sub3) this).anIntArray7947[i_223_ + 1];
					for (int i_237_ = i_235_; i_237_ < i_236_; i_237_++) {
						int i_238_ = (((Class387_Sub3) this).aShortArray7948[i_237_] - 1);
						if (i_238_ == -1)
							break;
						anIntArray7933[(((Class387_Sub3) this).aShortArray7948[i_237_]) - 1] = -999999;
					}
				}
			}
			for (int i_239_ = 0; i_239_ < ((Class387_Sub3) this).anInt7916; i_239_++) {
				if (anIntArray7933[(((Class387_Sub3) this).aShortArray7920[i_239_])] != -999999 && anIntArray7933[(((Class387_Sub3) this).aShortArray7921[i_239_])] != -999999 && anIntArray7933[(((Class387_Sub3) this).aShortArray7922[i_239_])] != -999999
						&& method4841(i, i_195_, anIntArray7929[(((Class387_Sub3) this).aShortArray7920[i_239_])], anIntArray7929[(((Class387_Sub3) this).aShortArray7921[i_239_])], anIntArray7929[(((Class387_Sub3) this).aShortArray7922[i_239_])], anIntArray7933[(((Class387_Sub3) this).aShortArray7920[i_239_])], anIntArray7933[(((Class387_Sub3) this).aShortArray7921[i_239_])], anIntArray7933[(((Class387_Sub3) this).aShortArray7922[i_239_])]))
					return true;
			}
		}
		return false;
	}

	public void method4745(Class387 class387, int i, int i_240_, int i_241_, boolean bool) {
		Class387_Sub3 class387_sub3_242_ = (Class387_Sub3) class387;
		if (((Class387_Sub3) this).anInt7916 != 0 && ((Class387_Sub3) class387_sub3_242_).anInt7916 != 0) {
			int i_243_ = ((Class387_Sub3) class387_sub3_242_).anInt7900;
			int[] is = ((Class387_Sub3) class387_sub3_242_).anIntArray7901;
			int[] is_244_ = ((Class387_Sub3) class387_sub3_242_).anIntArray7895;
			int[] is_245_ = ((Class387_Sub3) class387_sub3_242_).anIntArray7965;
			short[] is_246_ = ((Class387_Sub3) class387_sub3_242_).aShortArray7909;
			short[] is_247_ = ((Class387_Sub3) class387_sub3_242_).aShortArray7910;
			short[] is_248_ = ((Class387_Sub3) class387_sub3_242_).aShortArray7919;
			byte[] is_249_ = ((Class387_Sub3) class387_sub3_242_).aByteArray7958;
			short[] is_250_;
			short[] is_251_;
			short[] is_252_;
			byte[] is_253_;
			if (((Class387_Sub3) this).aClass185_7915 != null) {
				is_250_ = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1899);
				is_251_ = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1897);
				is_252_ = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1896);
				is_253_ = (((Class185) ((Class387_Sub3) this).aClass185_7915).aByteArray1898);
			} else {
				is_250_ = null;
				is_251_ = null;
				is_252_ = null;
				is_253_ = null;
			}
			short[] is_254_;
			short[] is_255_;
			short[] is_256_;
			byte[] is_257_;
			if (((Class387_Sub3) class387_sub3_242_).aClass185_7915 != null) {
				is_254_ = ((Class185) (((Class387_Sub3) class387_sub3_242_).aClass185_7915)).aShortArray1899;
				is_255_ = ((Class185) (((Class387_Sub3) class387_sub3_242_).aClass185_7915)).aShortArray1897;
				is_256_ = ((Class185) (((Class387_Sub3) class387_sub3_242_).aClass185_7915)).aShortArray1896;
				is_257_ = ((Class185) (((Class387_Sub3) class387_sub3_242_).aClass185_7915)).aByteArray1898;
			} else {
				is_254_ = null;
				is_255_ = null;
				is_256_ = null;
				is_257_ = null;
			}
			int[] is_258_ = ((Class387_Sub3) class387_sub3_242_).anIntArray7947;
			short[] is_259_ = ((Class387_Sub3) class387_sub3_242_).aShortArray7948;
			if (!((Class387_Sub3) class387_sub3_242_).aBoolean7950)
				class387_sub3_242_.method4832();
			int i_260_ = ((Class387_Sub3) class387_sub3_242_).anInt7938;
			int i_261_ = ((Class387_Sub3) class387_sub3_242_).anInt7939;
			int i_262_ = ((Class387_Sub3) class387_sub3_242_).anInt7940;
			int i_263_ = ((Class387_Sub3) class387_sub3_242_).anInt7941;
			int i_264_ = ((Class387_Sub3) class387_sub3_242_).anInt7942;
			int i_265_ = ((Class387_Sub3) class387_sub3_242_).anInt7943;
			for (int i_266_ = 0; i_266_ < ((Class387_Sub3) this).anInt7900; i_266_++) {
				int i_267_ = ((Class387_Sub3) this).anIntArray7895[i_266_] - i_240_;
				if (i_267_ >= i_260_ && i_267_ <= i_261_) {
					int i_268_ = ((Class387_Sub3) this).anIntArray7901[i_266_] - i;
					if (i_268_ >= i_262_ && i_268_ <= i_263_) {
						int i_269_ = (((Class387_Sub3) this).anIntArray7965[i_266_] - i_241_);
						if (i_269_ >= i_264_ && i_269_ <= i_265_) {
							int i_270_ = -1;
							int i_271_ = (((Class387_Sub3) this).anIntArray7947[i_266_]);
							int i_272_ = (((Class387_Sub3) this).anIntArray7947[i_266_ + 1]);
							for (int i_273_ = i_271_; i_273_ < i_272_; i_273_++) {
								i_270_ = (((Class387_Sub3) this).aShortArray7948[i_273_]) - 1;
								if (i_270_ == -1 || (((Class387_Sub3) this).aByteArray7958[i_270_]) != 0)
									break;
							}
							if (i_270_ != -1) {
								for (int i_274_ = 0; i_274_ < i_243_; i_274_++) {
									if (i_268_ == is[i_274_] && i_269_ == is_245_[i_274_] && i_267_ == is_244_[i_274_]) {
										int i_275_ = -1;
										i_271_ = is_258_[i_274_];
										i_272_ = is_258_[i_274_ + 1];
										for (int i_276_ = i_271_; i_276_ < i_272_; i_276_++) {
											i_275_ = is_259_[i_276_] - 1;
											if (i_275_ == -1 || is_249_[i_275_] != 0)
												break;
										}
										if (i_275_ != -1) {
											if (is_250_ == null) {
												((Class387_Sub3) this).aClass185_7915 = new Class185();
												is_250_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aShortArray1899 = (Class378.method4670((((Class387_Sub3) this).aShortArray7909), (byte) -55));
												is_251_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aShortArray1897 = (Class378.method4670((((Class387_Sub3) this).aShortArray7910), (byte) -99));
												is_252_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aShortArray1896 = (Class378.method4670((((Class387_Sub3) this).aShortArray7919), (byte) -32));
												is_253_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aByteArray1898 = (Class409.method4978((((Class387_Sub3) this).aByteArray7958), 1194497584));
											}
											if (is_254_ == null) {
												Class185 class185 = (((Class387_Sub3) class387_sub3_242_).aClass185_7915 = new Class185());
												is_254_ = ((Class185) class185).aShortArray1899 = (Class378.method4670(is_246_, (byte) -56));
												is_255_ = ((Class185) class185).aShortArray1897 = (Class378.method4670(is_247_, (byte) -81));
												is_256_ = ((Class185) class185).aShortArray1896 = (Class378.method4670(is_248_, (byte) -45));
												is_257_ = ((Class185) class185).aByteArray1898 = (Class409.method4978(is_249_, 1194497584));
											}
											short i_277_ = (((Class387_Sub3) this).aShortArray7909[i_270_]);
											short i_278_ = (((Class387_Sub3) this).aShortArray7910[i_270_]);
											short i_279_ = (((Class387_Sub3) this).aShortArray7919[i_270_]);
											byte i_280_ = (((Class387_Sub3) this).aByteArray7958[i_270_]);
											i_271_ = is_258_[i_274_];
											i_272_ = is_258_[i_274_ + 1];
											for (int i_281_ = i_271_; i_281_ < i_272_; i_281_++) {
												int i_282_ = is_259_[i_281_] - 1;
												if (i_282_ == -1)
													break;
												if (is_257_[i_282_] != 0) {
													is_254_[i_282_] += i_277_;
													is_255_[i_282_] += i_278_;
													is_256_[i_282_] += i_279_;
													is_257_[i_282_] += i_280_;
												}
											}
											i_277_ = is_246_[i_275_];
											i_278_ = is_247_[i_275_];
											i_279_ = is_248_[i_275_];
											i_280_ = is_249_[i_275_];
											i_271_ = (((Class387_Sub3) this).anIntArray7947[i_266_]);
											i_272_ = (((Class387_Sub3) this).anIntArray7947[i_266_ + 1]);
											for (int i_283_ = i_271_; i_283_ < i_272_; i_283_++) {
												int i_284_ = ((((Class387_Sub3) this).aShortArray7948[i_283_]) - 1);
												if (i_284_ == -1)
													break;
												if (is_253_[i_284_] != 0) {
													is_250_[i_284_] += i_277_;
													is_251_[i_284_] += i_278_;
													is_252_[i_284_] += i_279_;
													is_253_[i_284_] += i_280_;
												}
											}
											class387_sub3_242_.method4839();
											method4839();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	void e(int i, int[] is, int i_285_, int i_286_, int i_287_, boolean bool, int i_288_, int[] is_289_) {
		int i_290_ = is.length;
		if (i == 0) {
			i_285_ <<= 4;
			i_286_ <<= 4;
			i_287_ <<= 4;
			int i_291_ = 0;
			anInt7902 = 0;
			anInt7937 = 0;
			anInt7956 = 0;
			for (int i_292_ = 0; i_292_ < i_290_; i_292_++) {
				int i_293_ = is[i_292_];
				if (i_293_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_294_ = ((Class387_Sub3) this).anIntArrayArray7918[i_293_];
					for (int i_295_ = 0; i_295_ < is_294_.length; i_295_++) {
						int i_296_ = is_294_[i_295_];
						if (((Class387_Sub3) this).aShortArray7964 == null || (i_288_ & (((Class387_Sub3) this).aShortArray7964[i_296_])) != 0) {
							anInt7902 += (((Class387_Sub3) this).anIntArray7901[i_296_]);
							anInt7937 += (((Class387_Sub3) this).anIntArray7895[i_296_]);
							anInt7956 += (((Class387_Sub3) this).anIntArray7965[i_296_]);
							i_291_++;
						}
					}
				}
			}
			if (i_291_ > 0) {
				anInt7902 = anInt7902 / i_291_ + i_285_;
				anInt7937 = anInt7937 / i_291_ + i_286_;
				anInt7956 = anInt7956 / i_291_ + i_287_;
				aBoolean7905 = true;
			} else {
				anInt7902 = i_285_;
				anInt7937 = i_286_;
				anInt7956 = i_287_;
			}
		} else if (i == 1) {
			if (is_289_ != null) {
				int i_297_ = ((is_289_[0] * i_285_ + is_289_[1] * i_286_ + is_289_[2] * i_287_ + 8192) >> 14);
				int i_298_ = ((is_289_[3] * i_285_ + is_289_[4] * i_286_ + is_289_[5] * i_287_ + 8192) >> 14);
				int i_299_ = ((is_289_[6] * i_285_ + is_289_[7] * i_286_ + is_289_[8] * i_287_ + 8192) >> 14);
				i_285_ = i_297_;
				i_286_ = i_298_;
				i_287_ = i_299_;
			}
			i_285_ <<= 4;
			i_286_ <<= 4;
			i_287_ <<= 4;
			for (int i_300_ = 0; i_300_ < i_290_; i_300_++) {
				int i_301_ = is[i_300_];
				if (i_301_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_302_ = ((Class387_Sub3) this).anIntArrayArray7918[i_301_];
					for (int i_303_ = 0; i_303_ < is_302_.length; i_303_++) {
						int i_304_ = is_302_[i_303_];
						if (((Class387_Sub3) this).aShortArray7964 == null || (i_288_ & (((Class387_Sub3) this).aShortArray7964[i_304_])) != 0) {
							((Class387_Sub3) this).anIntArray7901[i_304_] += i_285_;
							((Class387_Sub3) this).anIntArray7895[i_304_] += i_286_;
							((Class387_Sub3) this).anIntArray7965[i_304_] += i_287_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_289_ != null) {
				int i_305_ = is_289_[9] << 4;
				int i_306_ = is_289_[10] << 4;
				int i_307_ = is_289_[11] << 4;
				int i_308_ = is_289_[12] << 4;
				int i_309_ = is_289_[13] << 4;
				int i_310_ = is_289_[14] << 4;
				if (aBoolean7905) {
					int i_311_ = ((is_289_[0] * anInt7902 + is_289_[3] * anInt7937 + is_289_[6] * anInt7956 + 8192) >> 14);
					int i_312_ = ((is_289_[1] * anInt7902 + is_289_[4] * anInt7937 + is_289_[7] * anInt7956 + 8192) >> 14);
					int i_313_ = ((is_289_[2] * anInt7902 + is_289_[5] * anInt7937 + is_289_[8] * anInt7956 + 8192) >> 14);
					i_311_ += i_308_;
					i_312_ += i_309_;
					i_313_ += i_310_;
					anInt7902 = i_311_;
					anInt7937 = i_312_;
					anInt7956 = i_313_;
					aBoolean7905 = false;
				}
				int[] is_314_ = new int[9];
				int i_315_ = Class220.anIntArray2474[i_285_];
				int i_316_ = Class220.anIntArray2483[i_285_];
				int i_317_ = Class220.anIntArray2474[i_286_];
				int i_318_ = Class220.anIntArray2483[i_286_];
				int i_319_ = Class220.anIntArray2474[i_287_];
				int i_320_ = Class220.anIntArray2483[i_287_];
				int i_321_ = i_316_ * i_319_ + 8192 >> 14;
				int i_322_ = i_316_ * i_320_ + 8192 >> 14;
				is_314_[0] = i_317_ * i_319_ + i_318_ * i_322_ + 8192 >> 14;
				is_314_[1] = -i_317_ * i_320_ + i_318_ * i_321_ + 8192 >> 14;
				is_314_[2] = i_318_ * i_315_ + 8192 >> 14;
				is_314_[3] = i_315_ * i_320_ + 8192 >> 14;
				is_314_[4] = i_315_ * i_319_ + 8192 >> 14;
				is_314_[5] = -i_316_;
				is_314_[6] = -i_318_ * i_319_ + i_317_ * i_322_ + 8192 >> 14;
				is_314_[7] = i_318_ * i_320_ + i_317_ * i_321_ + 8192 >> 14;
				is_314_[8] = i_317_ * i_315_ + 8192 >> 14;
				int i_323_ = (is_314_[0] * -anInt7902 + is_314_[1] * -anInt7937 + is_314_[2] * -anInt7956 + 8192) >> 14;
				int i_324_ = (is_314_[3] * -anInt7902 + is_314_[4] * -anInt7937 + is_314_[5] * -anInt7956 + 8192) >> 14;
				int i_325_ = (is_314_[6] * -anInt7902 + is_314_[7] * -anInt7937 + is_314_[8] * -anInt7956 + 8192) >> 14;
				int i_326_ = i_323_ + anInt7902;
				int i_327_ = i_324_ + anInt7937;
				int i_328_ = i_325_ + anInt7956;
				int[] is_329_ = new int[9];
				for (int i_330_ = 0; i_330_ < 3; i_330_++) {
					for (int i_331_ = 0; i_331_ < 3; i_331_++) {
						int i_332_ = 0;
						for (int i_333_ = 0; i_333_ < 3; i_333_++)
							i_332_ += (is_314_[i_330_ * 3 + i_333_] * is_289_[i_331_ * 3 + i_333_]);
						is_329_[i_330_ * 3 + i_331_] = i_332_ + 8192 >> 14;
					}
				}
				int i_334_ = ((is_314_[0] * i_308_ + is_314_[1] * i_309_ + is_314_[2] * i_310_ + 8192) >> 14);
				int i_335_ = ((is_314_[3] * i_308_ + is_314_[4] * i_309_ + is_314_[5] * i_310_ + 8192) >> 14);
				int i_336_ = ((is_314_[6] * i_308_ + is_314_[7] * i_309_ + is_314_[8] * i_310_ + 8192) >> 14);
				i_334_ += i_326_;
				i_335_ += i_327_;
				i_336_ += i_328_;
				int[] is_337_ = new int[9];
				for (int i_338_ = 0; i_338_ < 3; i_338_++) {
					for (int i_339_ = 0; i_339_ < 3; i_339_++) {
						int i_340_ = 0;
						for (int i_341_ = 0; i_341_ < 3; i_341_++)
							i_340_ += (is_289_[i_338_ * 3 + i_341_] * is_329_[i_339_ + i_341_ * 3]);
						is_337_[i_338_ * 3 + i_339_] = i_340_ + 8192 >> 14;
					}
				}
				int i_342_ = ((is_289_[0] * i_334_ + is_289_[1] * i_335_ + is_289_[2] * i_336_ + 8192) >> 14);
				int i_343_ = ((is_289_[3] * i_334_ + is_289_[4] * i_335_ + is_289_[5] * i_336_ + 8192) >> 14);
				int i_344_ = ((is_289_[6] * i_334_ + is_289_[7] * i_335_ + is_289_[8] * i_336_ + 8192) >> 14);
				i_342_ += i_305_;
				i_343_ += i_306_;
				i_344_ += i_307_;
				for (int i_345_ = 0; i_345_ < i_290_; i_345_++) {
					int i_346_ = is[i_345_];
					if (i_346_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_347_ = (((Class387_Sub3) this).anIntArrayArray7918[i_346_]);
						for (int i_348_ = 0; i_348_ < is_347_.length; i_348_++) {
							int i_349_ = is_347_[i_348_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_288_ & (((Class387_Sub3) this).aShortArray7964[i_349_])) != 0)) {
								int i_350_ = (is_337_[0] * (((Class387_Sub3) this).anIntArray7901[i_349_]) + is_337_[1] * (((Class387_Sub3) this).anIntArray7895[i_349_]) + is_337_[2] * (((Class387_Sub3) this).anIntArray7965[i_349_]) + 8192) >> 14;
								int i_351_ = (is_337_[3] * (((Class387_Sub3) this).anIntArray7901[i_349_]) + is_337_[4] * (((Class387_Sub3) this).anIntArray7895[i_349_]) + is_337_[5] * (((Class387_Sub3) this).anIntArray7965[i_349_]) + 8192) >> 14;
								int i_352_ = (is_337_[6] * (((Class387_Sub3) this).anIntArray7901[i_349_]) + is_337_[7] * (((Class387_Sub3) this).anIntArray7895[i_349_]) + is_337_[8] * (((Class387_Sub3) this).anIntArray7965[i_349_]) + 8192) >> 14;
								i_350_ += i_342_;
								i_351_ += i_343_;
								i_352_ += i_344_;
								((Class387_Sub3) this).anIntArray7901[i_349_] = i_350_;
								((Class387_Sub3) this).anIntArray7895[i_349_] = i_351_;
								((Class387_Sub3) this).anIntArray7965[i_349_] = i_352_;
							}
						}
					}
				}
			} else {
				for (int i_353_ = 0; i_353_ < i_290_; i_353_++) {
					int i_354_ = is[i_353_];
					if (i_354_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_355_ = (((Class387_Sub3) this).anIntArrayArray7918[i_354_]);
						for (int i_356_ = 0; i_356_ < is_355_.length; i_356_++) {
							int i_357_ = is_355_[i_356_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_288_ & (((Class387_Sub3) this).aShortArray7964[i_357_])) != 0)) {
								((Class387_Sub3) this).anIntArray7901[i_357_] -= anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_357_] -= anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_357_] -= anInt7956;
								if (i_287_ != 0) {
									int i_358_ = Class220.anIntArray2483[i_287_];
									int i_359_ = Class220.anIntArray2474[i_287_];
									int i_360_ = ((((Class387_Sub3) this).anIntArray7895[i_357_]) * i_358_ + (((Class387_Sub3) this).anIntArray7901[i_357_]) * i_359_ + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7895[i_357_] = ((((Class387_Sub3) this).anIntArray7895[i_357_]) * i_359_ - (((Class387_Sub3) this).anIntArray7901[i_357_]) * i_358_ + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7901[i_357_] = i_360_;
								}
								if (i_285_ != 0) {
									int i_361_ = Class220.anIntArray2483[i_285_];
									int i_362_ = Class220.anIntArray2474[i_285_];
									int i_363_ = ((((Class387_Sub3) this).anIntArray7895[i_357_]) * i_362_ - (((Class387_Sub3) this).anIntArray7965[i_357_]) * i_361_ + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7965[i_357_] = ((((Class387_Sub3) this).anIntArray7895[i_357_]) * i_361_ + (((Class387_Sub3) this).anIntArray7965[i_357_]) * i_362_ + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7895[i_357_] = i_363_;
								}
								if (i_286_ != 0) {
									int i_364_ = Class220.anIntArray2483[i_286_];
									int i_365_ = Class220.anIntArray2474[i_286_];
									int i_366_ = ((((Class387_Sub3) this).anIntArray7965[i_357_]) * i_364_ + (((Class387_Sub3) this).anIntArray7901[i_357_]) * i_365_ + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7965[i_357_] = ((((Class387_Sub3) this).anIntArray7965[i_357_]) * i_365_ - (((Class387_Sub3) this).anIntArray7901[i_357_]) * i_364_ + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7901[i_357_] = i_366_;
								}
								((Class387_Sub3) this).anIntArray7901[i_357_] += anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_357_] += anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_357_] += anInt7956;
							}
						}
					}
				}
				if (bool) {
					for (int i_367_ = 0; i_367_ < i_290_; i_367_++) {
						int i_368_ = is[i_367_];
						if (i_368_ < (((Class387_Sub3) this).anIntArrayArray7918).length) {
							int[] is_369_ = (((Class387_Sub3) this).anIntArrayArray7918[i_368_]);
							for (int i_370_ = 0; i_370_ < is_369_.length; i_370_++) {
								int i_371_ = is_369_[i_370_];
								if ((((Class387_Sub3) this).aShortArray7964 == null) || ((i_288_ & (((Class387_Sub3) this).aShortArray7964[i_371_])) != 0)) {
									int i_372_ = (((Class387_Sub3) this).anIntArray7947[i_371_]);
									int i_373_ = (((Class387_Sub3) this).anIntArray7947[i_371_ + 1]);
									for (int i_374_ = i_372_; i_374_ < i_373_; i_374_++) {
										int i_375_ = ((((Class387_Sub3) this).aShortArray7948[i_374_]) - 1);
										if (i_375_ == -1)
											break;
										if (i_287_ != 0) {
											int i_376_ = (Class220.anIntArray2483[i_287_]);
											int i_377_ = (Class220.anIntArray2474[i_287_]);
											int i_378_ = ((((((Class387_Sub3) this).aShortArray7910[i_375_]) * i_376_) + (((Class387_Sub3) this).aShortArray7909[i_375_]) * i_377_ + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7910[i_375_] = (short) (((((Class387_Sub3) this).aShortArray7910[i_375_]) * i_377_ - (((Class387_Sub3) this).aShortArray7909[i_375_]) * i_376_ + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7909[i_375_] = (short) i_378_;
										}
										if (i_285_ != 0) {
											int i_379_ = (Class220.anIntArray2483[i_285_]);
											int i_380_ = (Class220.anIntArray2474[i_285_]);
											int i_381_ = ((((((Class387_Sub3) this).aShortArray7910[i_375_]) * i_380_) - (((Class387_Sub3) this).aShortArray7919[i_375_]) * i_379_ + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7919[i_375_] = (short) (((((Class387_Sub3) this).aShortArray7910[i_375_]) * i_379_ + (((Class387_Sub3) this).aShortArray7919[i_375_]) * i_380_ + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7910[i_375_] = (short) i_381_;
										}
										if (i_286_ != 0) {
											int i_382_ = (Class220.anIntArray2483[i_286_]);
											int i_383_ = (Class220.anIntArray2474[i_286_]);
											int i_384_ = ((((((Class387_Sub3) this).aShortArray7919[i_375_]) * i_382_) + (((Class387_Sub3) this).aShortArray7909[i_375_]) * i_383_ + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7919[i_375_] = (short) (((((Class387_Sub3) this).aShortArray7919[i_375_]) * i_383_ - (((Class387_Sub3) this).aShortArray7909[i_375_]) * i_382_ + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7909[i_375_] = (short) i_384_;
										}
									}
								}
							}
						}
					}
					method4839();
				}
			}
		} else if (i == 3) {
			if (is_289_ != null) {
				int i_385_ = is_289_[9] << 4;
				int i_386_ = is_289_[10] << 4;
				int i_387_ = is_289_[11] << 4;
				int i_388_ = is_289_[12] << 4;
				int i_389_ = is_289_[13] << 4;
				int i_390_ = is_289_[14] << 4;
				if (aBoolean7905) {
					int i_391_ = ((is_289_[0] * anInt7902 + is_289_[3] * anInt7937 + is_289_[6] * anInt7956 + 8192) >> 14);
					int i_392_ = ((is_289_[1] * anInt7902 + is_289_[4] * anInt7937 + is_289_[7] * anInt7956 + 8192) >> 14);
					int i_393_ = ((is_289_[2] * anInt7902 + is_289_[5] * anInt7937 + is_289_[8] * anInt7956 + 8192) >> 14);
					i_391_ += i_388_;
					i_392_ += i_389_;
					i_393_ += i_390_;
					anInt7902 = i_391_;
					anInt7937 = i_392_;
					anInt7956 = i_393_;
					aBoolean7905 = false;
				}
				int i_394_ = i_285_ << 15 >> 7;
				int i_395_ = i_286_ << 15 >> 7;
				int i_396_ = i_287_ << 15 >> 7;
				int i_397_ = i_394_ * -anInt7902 + 8192 >> 14;
				int i_398_ = i_395_ * -anInt7937 + 8192 >> 14;
				int i_399_ = i_396_ * -anInt7956 + 8192 >> 14;
				int i_400_ = i_397_ + anInt7902;
				int i_401_ = i_398_ + anInt7937;
				int i_402_ = i_399_ + anInt7956;
				int[] is_403_ = new int[9];
				is_403_[0] = i_394_ * is_289_[0] + 8192 >> 14;
				is_403_[1] = i_394_ * is_289_[3] + 8192 >> 14;
				is_403_[2] = i_394_ * is_289_[6] + 8192 >> 14;
				is_403_[3] = i_395_ * is_289_[1] + 8192 >> 14;
				is_403_[4] = i_395_ * is_289_[4] + 8192 >> 14;
				is_403_[5] = i_395_ * is_289_[7] + 8192 >> 14;
				is_403_[6] = i_396_ * is_289_[2] + 8192 >> 14;
				is_403_[7] = i_396_ * is_289_[5] + 8192 >> 14;
				is_403_[8] = i_396_ * is_289_[8] + 8192 >> 14;
				int i_404_ = i_394_ * i_388_ + 8192 >> 14;
				int i_405_ = i_395_ * i_389_ + 8192 >> 14;
				int i_406_ = i_396_ * i_390_ + 8192 >> 14;
				i_404_ += i_400_;
				i_405_ += i_401_;
				i_406_ += i_402_;
				int[] is_407_ = new int[9];
				for (int i_408_ = 0; i_408_ < 3; i_408_++) {
					for (int i_409_ = 0; i_409_ < 3; i_409_++) {
						int i_410_ = 0;
						for (int i_411_ = 0; i_411_ < 3; i_411_++)
							i_410_ += (is_289_[i_408_ * 3 + i_411_] * is_403_[i_409_ + i_411_ * 3]);
						is_407_[i_408_ * 3 + i_409_] = i_410_ + 8192 >> 14;
					}
				}
				int i_412_ = ((is_289_[0] * i_404_ + is_289_[1] * i_405_ + is_289_[2] * i_406_ + 8192) >> 14);
				int i_413_ = ((is_289_[3] * i_404_ + is_289_[4] * i_405_ + is_289_[5] * i_406_ + 8192) >> 14);
				int i_414_ = ((is_289_[6] * i_404_ + is_289_[7] * i_405_ + is_289_[8] * i_406_ + 8192) >> 14);
				i_412_ += i_385_;
				i_413_ += i_386_;
				i_414_ += i_387_;
				for (int i_415_ = 0; i_415_ < i_290_; i_415_++) {
					int i_416_ = is[i_415_];
					if (i_416_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_417_ = (((Class387_Sub3) this).anIntArrayArray7918[i_416_]);
						for (int i_418_ = 0; i_418_ < is_417_.length; i_418_++) {
							int i_419_ = is_417_[i_418_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_288_ & (((Class387_Sub3) this).aShortArray7964[i_419_])) != 0)) {
								int i_420_ = (is_407_[0] * (((Class387_Sub3) this).anIntArray7901[i_419_]) + is_407_[1] * (((Class387_Sub3) this).anIntArray7895[i_419_]) + is_407_[2] * (((Class387_Sub3) this).anIntArray7965[i_419_]) + 8192) >> 14;
								int i_421_ = (is_407_[3] * (((Class387_Sub3) this).anIntArray7901[i_419_]) + is_407_[4] * (((Class387_Sub3) this).anIntArray7895[i_419_]) + is_407_[5] * (((Class387_Sub3) this).anIntArray7965[i_419_]) + 8192) >> 14;
								int i_422_ = (is_407_[6] * (((Class387_Sub3) this).anIntArray7901[i_419_]) + is_407_[7] * (((Class387_Sub3) this).anIntArray7895[i_419_]) + is_407_[8] * (((Class387_Sub3) this).anIntArray7965[i_419_]) + 8192) >> 14;
								i_420_ += i_412_;
								i_421_ += i_413_;
								i_422_ += i_414_;
								((Class387_Sub3) this).anIntArray7901[i_419_] = i_420_;
								((Class387_Sub3) this).anIntArray7895[i_419_] = i_421_;
								((Class387_Sub3) this).anIntArray7965[i_419_] = i_422_;
							}
						}
					}
				}
			} else {
				for (int i_423_ = 0; i_423_ < i_290_; i_423_++) {
					int i_424_ = is[i_423_];
					if (i_424_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_425_ = (((Class387_Sub3) this).anIntArrayArray7918[i_424_]);
						for (int i_426_ = 0; i_426_ < is_425_.length; i_426_++) {
							int i_427_ = is_425_[i_426_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_288_ & (((Class387_Sub3) this).aShortArray7964[i_427_])) != 0)) {
								((Class387_Sub3) this).anIntArray7901[i_427_] -= anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_427_] -= anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_427_] -= anInt7956;
								((Class387_Sub3) this).anIntArray7901[i_427_] = (((Class387_Sub3) this).anIntArray7901[i_427_]) * i_285_ >> 7;
								((Class387_Sub3) this).anIntArray7895[i_427_] = (((Class387_Sub3) this).anIntArray7895[i_427_]) * i_286_ >> 7;
								((Class387_Sub3) this).anIntArray7965[i_427_] = (((Class387_Sub3) this).anIntArray7965[i_427_]) * i_287_ >> 7;
								((Class387_Sub3) this).anIntArray7901[i_427_] += anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_427_] += anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_427_] += anInt7956;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub3) this).anIntArrayArray7924 != null) {
				boolean bool_428_ = false;
				for (int i_429_ = 0; i_429_ < i_290_; i_429_++) {
					int i_430_ = is[i_429_];
					if (i_430_ < ((Class387_Sub3) this).anIntArrayArray7924.length) {
						int[] is_431_ = (((Class387_Sub3) this).anIntArrayArray7924[i_430_]);
						for (int i_432_ = 0; i_432_ < is_431_.length; i_432_++) {
							int i_433_ = is_431_[i_432_];
							if (((Class387_Sub3) this).aShortArray7925 == null || ((i_288_ & (((Class387_Sub3) this).aShortArray7925[i_433_])) != 0)) {
								int i_434_ = (((((Class387_Sub3) this).aByteArray7963[i_433_]) & 0xff) + i_285_ * 8);
								if (i_434_ < 0)
									i_434_ = 0;
								else if (i_434_ > 255)
									i_434_ = 255;
								((Class387_Sub3) this).aByteArray7963[i_433_] = (byte) i_434_;
							}
						}
						bool_428_ = bool_428_ | is_431_.length > 0;
					}
				}
				if (bool_428_) {
					if (((Class387_Sub3) this).aClass191Array7952 != null) {
						for (int i_435_ = 0; i_435_ < ((Class387_Sub3) this).anInt7951; i_435_++) {
							Class191 class191 = (((Class387_Sub3) this).aClass191Array7952[i_435_]);
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[i_435_]);
							((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & 0xffffff | 255 - ((((Class387_Sub3) this).aByteArray7963[((Class191) class191).anInt1947]) & 0xff) << 24);
						}
					}
					method4838();
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub3) this).anIntArrayArray7924 != null) {
				boolean bool_436_ = false;
				for (int i_437_ = 0; i_437_ < i_290_; i_437_++) {
					int i_438_ = is[i_437_];
					if (i_438_ < ((Class387_Sub3) this).anIntArrayArray7924.length) {
						int[] is_439_ = (((Class387_Sub3) this).anIntArrayArray7924[i_438_]);
						for (int i_440_ = 0; i_440_ < is_439_.length; i_440_++) {
							int i_441_ = is_439_[i_440_];
							if (((Class387_Sub3) this).aShortArray7925 == null || ((i_288_ & (((Class387_Sub3) this).aShortArray7925[i_441_])) != 0)) {
								int i_442_ = ((((Class387_Sub3) this).aShortArray7935[i_441_]) & 0xffff);
								int i_443_ = i_442_ >> 10 & 0x3f;
								int i_444_ = i_442_ >> 7 & 0x7;
								int i_445_ = i_442_ & 0x7f;
								i_443_ = i_443_ + i_285_ & 0x3f;
								i_444_ += i_286_ / 4;
								if (i_444_ < 0)
									i_444_ = 0;
								else if (i_444_ > 7)
									i_444_ = 7;
								i_445_ += i_287_;
								if (i_445_ < 0)
									i_445_ = 0;
								else if (i_445_ > 127)
									i_445_ = 127;
								((Class387_Sub3) this).aShortArray7935[i_441_] = (short) (i_443_ << 10 | i_444_ << 7 | i_445_);
							}
						}
						bool_436_ = bool_436_ | is_439_.length > 0;
					}
				}
				if (bool_436_) {
					if (((Class387_Sub3) this).aClass191Array7952 != null) {
						for (int i_446_ = 0; i_446_ < ((Class387_Sub3) this).anInt7951; i_446_++) {
							Class191 class191 = (((Class387_Sub3) this).aClass191Array7952[i_446_]);
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[i_446_]);
							((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | (Class294.anIntArray3165[((((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff)]) & 0xffffff);
						}
					}
					method4838();
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_447_ = 0; i_447_ < i_290_; i_447_++) {
					int i_448_ = is[i_447_];
					if (i_448_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_449_ = (((Class387_Sub3) this).anIntArrayArray7946[i_448_]);
						for (int i_450_ = 0; i_450_ < is_449_.length; i_450_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_449_[i_450_]]);
							((Class166) class166).anInt1704 += i_285_;
							((Class166) class166).anInt1705 += i_286_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_451_ = 0; i_451_ < i_290_; i_451_++) {
					int i_452_ = is[i_451_];
					if (i_452_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_453_ = (((Class387_Sub3) this).anIntArrayArray7946[i_452_]);
						for (int i_454_ = 0; i_454_ < is_453_.length; i_454_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_453_[i_454_]]);
							((Class166) class166).anInt1702 = (((Class166) class166).anInt1702 * i_285_ >> 7);
							((Class166) class166).anInt1701 = (((Class166) class166).anInt1701 * i_286_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_455_ = 0; i_455_ < i_290_; i_455_++) {
					int i_456_ = is[i_455_];
					if (i_456_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_457_ = (((Class387_Sub3) this).anIntArrayArray7946[i_456_]);
						for (int i_458_ = 0; i_458_ < is_457_.length; i_458_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_457_[i_458_]]);
							((Class166) class166).anInt1706 = (((Class166) class166).anInt1706 + i_285_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void Q(int i) {
		((Class387_Sub3) this).aShort7898 = (short) i;
		method4851();
		method4839();
	}

	public int c() {
		return ((Class387_Sub3) this).aShort7897;
	}

	public int Z() {
		return ((Class387_Sub3) this).aShort7898;
	}

	public int dq() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7943;
	}

	public void bc(int i) {
		int i_459_ = Class220.anIntArray2483[i];
		int i_460_ = Class220.anIntArray2474[i];
		for (int i_461_ = 0; i_461_ < ((Class387_Sub3) this).anInt7900; i_461_++) {
			int i_462_ = ((((Class387_Sub3) this).anIntArray7965[i_461_] * i_459_ + ((Class387_Sub3) this).anIntArray7901[i_461_] * i_460_) >> 14);
			((Class387_Sub3) this).anIntArray7965[i_461_] = ((((Class387_Sub3) this).anIntArray7965[i_461_] * i_460_ - ((Class387_Sub3) this).anIntArray7901[i_461_] * i_459_) >> 14);
			((Class387_Sub3) this).anIntArray7901[i_461_] = i_462_;
		}
		for (int i_463_ = 0; i_463_ < ((Class387_Sub3) this).anInt7906; i_463_++) {
			int i_464_ = ((((Class387_Sub3) this).aShortArray7919[i_463_] * i_459_ + ((Class387_Sub3) this).aShortArray7909[i_463_] * i_460_) >> 14);
			((Class387_Sub3) this).aShortArray7919[i_463_] = (short) (((((Class387_Sub3) this).aShortArray7919[i_463_] * i_460_) - (((Class387_Sub3) this).aShortArray7909[i_463_] * i_459_)) >> 14);
			((Class387_Sub3) this).aShortArray7909[i_463_] = (short) i_464_;
		}
		method4851();
		method4839();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public void W(short i, short i_465_) {
		Interface_ma interface_ma = ((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface_ma5299;
		for (int i_466_ = 0; i_466_ < ((Class387_Sub3) this).anInt7916; i_466_++) {
			if (((Class387_Sub3) this).aShortArray7923[i_466_] == i)
				((Class387_Sub3) this).aShortArray7923[i_466_] = i_465_;
		}
		byte i_467_ = 0;
		byte i_468_ = 0;
		if (i != -1) {
			Class53 class53 = interface_ma.method174(i & 0xffff, 1064866173);
			i_467_ = class53.aByte533;
			i_468_ = class53.aByte534;
		}
		byte i_469_ = 0;
		byte i_470_ = 0;
		if (i_465_ != -1) {
			Class53 class53 = interface_ma.method174(i_465_ & 0xffff, 2063902774);
			i_469_ = class53.aByte533;
			i_470_ = class53.aByte534;
			if (class53.aByte535 != 0 || class53.aByte509 != 0)
				((Class387_Sub3) this).aBoolean7903 = true;
		}
		if (i_467_ != i_469_ | i_468_ != i_470_) {
			if (((Class387_Sub3) this).aClass191Array7952 != null) {
				for (int i_471_ = 0; i_471_ < ((Class387_Sub3) this).anInt7951; i_471_++) {
					Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_471_];
					Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_471_];
					((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
				}
			}
			method4838();
		}
	}

	public void PA(int i, int i_472_, int i_473_, int i_474_) {
		for (int i_475_ = 0; i_475_ < ((Class387_Sub3) this).anInt7916; i_475_++) {
			int i_476_ = ((Class387_Sub3) this).aShortArray7935[i_475_] & 0xffff;
			int i_477_ = i_476_ >> 10 & 0x3f;
			int i_478_ = i_476_ >> 7 & 0x7;
			int i_479_ = i_476_ & 0x7f;
			if (i != -1)
				i_477_ += (i - i_477_) * i_474_ >> 7;
			if (i_472_ != -1)
				i_478_ += (i_472_ - i_478_) * i_474_ >> 7;
			if (i_473_ != -1)
				i_479_ += (i_473_ - i_479_) * i_474_ >> 7;
			((Class387_Sub3) this).aShortArray7935[i_475_] = (short) (i_477_ << 10 | i_478_ << 7 | i_479_);
		}
		if (((Class387_Sub3) this).aClass191Array7952 != null) {
			for (int i_480_ = 0; i_480_ < ((Class387_Sub3) this).anInt7951; i_480_++) {
				Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_480_];
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_480_];
				((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
			}
		}
		method4838();
	}

	public boolean method4743() {
		if (((Class387_Sub3) this).aShortArray7923 == null)
			return true;
		for (int i = 0; i < ((Class387_Sub3) this).aShortArray7923.length; i++) {
			if (((Class387_Sub3) this).aShortArray7923[i] != -1 && !(((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface_ma5299.method170(((Class387_Sub3) this).aShortArray7923[i], (short) 10294)))
				return false;
		}
		return true;
	}

	public boolean i() {
		return ((Class387_Sub3) this).aBoolean7893;
	}

	public boolean u() {
		return ((Class387_Sub3) this).aBoolean7903;
	}

	static {
		anIntArray7933 = new int[1];
		anIntArray7929 = new int[1];
		anIntArray7959 = new int[8];
		anIntArray7960 = new int[8];
		anIntArray7961 = new int[8];
	}

	void method4734() {
		/* empty */
	}

	public Class387 method4770(byte i, int i_481_, boolean bool) {
		boolean bool_482_ = false;
		Class387_Sub3 class387_sub3_483_;
		Class387_Sub3 class387_sub3_484_;
		if (i > 0 && i <= 7) {
			class387_sub3_484_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass387_Sub3Array8267[i - 1]);
			class387_sub3_483_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass387_Sub3Array8288[i - 1]);
			bool_482_ = true;
		} else
			class387_sub3_483_ = class387_sub3_484_ = new Class387_Sub3(((Class387_Sub3) this).aClass_ra_Sub3_7894, 0, 0, true, false);
		return method4836(class387_sub3_483_, class387_sub3_484_, i_481_, bool_482_, bool);
	}

	void w(int i, int i_485_, int i_486_, int i_487_) {
		if (i == 0) {
			int i_488_ = 0;
			anInt7902 = 0;
			anInt7937 = 0;
			anInt7956 = 0;
			for (int i_489_ = 0; i_489_ < ((Class387_Sub3) this).anInt7900; i_489_++) {
				anInt7902 += ((Class387_Sub3) this).anIntArray7901[i_489_];
				anInt7937 += ((Class387_Sub3) this).anIntArray7895[i_489_];
				anInt7956 += ((Class387_Sub3) this).anIntArray7965[i_489_];
				i_488_++;
			}
			if (i_488_ > 0) {
				anInt7902 = anInt7902 / i_488_ + i_485_;
				anInt7937 = anInt7937 / i_488_ + i_486_;
				anInt7956 = anInt7956 / i_488_ + i_487_;
			} else {
				anInt7902 = i_485_;
				anInt7937 = i_486_;
				anInt7956 = i_487_;
			}
		} else if (i == 1) {
			for (int i_490_ = 0; i_490_ < ((Class387_Sub3) this).anInt7900; i_490_++) {
				((Class387_Sub3) this).anIntArray7901[i_490_] += i_485_;
				((Class387_Sub3) this).anIntArray7895[i_490_] += i_486_;
				((Class387_Sub3) this).anIntArray7965[i_490_] += i_487_;
			}
		} else if (i == 2) {
			for (int i_491_ = 0; i_491_ < ((Class387_Sub3) this).anInt7900; i_491_++) {
				((Class387_Sub3) this).anIntArray7901[i_491_] -= anInt7902;
				((Class387_Sub3) this).anIntArray7895[i_491_] -= anInt7937;
				((Class387_Sub3) this).anIntArray7965[i_491_] -= anInt7956;
				if (i_487_ != 0) {
					int i_492_ = Class220.anIntArray2483[i_487_];
					int i_493_ = Class220.anIntArray2474[i_487_];
					int i_494_ = (((((Class387_Sub3) this).anIntArray7895[i_491_] * i_492_) + (((Class387_Sub3) this).anIntArray7901[i_491_] * i_493_) + 16383) >> 14);
					((Class387_Sub3) this).anIntArray7895[i_491_] = ((((Class387_Sub3) this).anIntArray7895[i_491_] * i_493_) - (((Class387_Sub3) this).anIntArray7901[i_491_] * i_492_) + 16383) >> 14;
					((Class387_Sub3) this).anIntArray7901[i_491_] = i_494_;
				}
				if (i_485_ != 0) {
					int i_495_ = Class220.anIntArray2483[i_485_];
					int i_496_ = Class220.anIntArray2474[i_485_];
					int i_497_ = (((((Class387_Sub3) this).anIntArray7895[i_491_] * i_496_) - (((Class387_Sub3) this).anIntArray7965[i_491_] * i_495_) + 16383) >> 14);
					((Class387_Sub3) this).anIntArray7965[i_491_] = ((((Class387_Sub3) this).anIntArray7895[i_491_] * i_495_) + (((Class387_Sub3) this).anIntArray7965[i_491_] * i_496_) + 16383) >> 14;
					((Class387_Sub3) this).anIntArray7895[i_491_] = i_497_;
				}
				if (i_486_ != 0) {
					int i_498_ = Class220.anIntArray2483[i_486_];
					int i_499_ = Class220.anIntArray2474[i_486_];
					int i_500_ = (((((Class387_Sub3) this).anIntArray7965[i_491_] * i_498_) + (((Class387_Sub3) this).anIntArray7901[i_491_] * i_499_) + 16383) >> 14);
					((Class387_Sub3) this).anIntArray7965[i_491_] = ((((Class387_Sub3) this).anIntArray7965[i_491_] * i_499_) - (((Class387_Sub3) this).anIntArray7901[i_491_] * i_498_) + 16383) >> 14;
					((Class387_Sub3) this).anIntArray7901[i_491_] = i_500_;
				}
				((Class387_Sub3) this).anIntArray7901[i_491_] += anInt7902;
				((Class387_Sub3) this).anIntArray7895[i_491_] += anInt7937;
				((Class387_Sub3) this).anIntArray7965[i_491_] += anInt7956;
			}
		} else if (i == 3) {
			for (int i_501_ = 0; i_501_ < ((Class387_Sub3) this).anInt7900; i_501_++) {
				((Class387_Sub3) this).anIntArray7901[i_501_] -= anInt7902;
				((Class387_Sub3) this).anIntArray7895[i_501_] -= anInt7937;
				((Class387_Sub3) this).anIntArray7965[i_501_] -= anInt7956;
				((Class387_Sub3) this).anIntArray7901[i_501_] = (((Class387_Sub3) this).anIntArray7901[i_501_] * i_485_ / 128);
				((Class387_Sub3) this).anIntArray7895[i_501_] = (((Class387_Sub3) this).anIntArray7895[i_501_] * i_486_ / 128);
				((Class387_Sub3) this).anIntArray7965[i_501_] = (((Class387_Sub3) this).anIntArray7965[i_501_] * i_487_ / 128);
				((Class387_Sub3) this).anIntArray7901[i_501_] += anInt7902;
				((Class387_Sub3) this).anIntArray7895[i_501_] += anInt7937;
				((Class387_Sub3) this).anIntArray7965[i_501_] += anInt7956;
			}
		} else if (i == 5) {
			for (int i_502_ = 0; i_502_ < ((Class387_Sub3) this).anInt7916; i_502_++) {
				int i_503_ = ((((Class387_Sub3) this).aByteArray7963[i_502_] & 0xff) + i_485_ * 8);
				if (i_503_ < 0)
					i_503_ = 0;
				else if (i_503_ > 255)
					i_503_ = 255;
				((Class387_Sub3) this).aByteArray7963[i_502_] = (byte) i_503_;
			}
			if (((Class387_Sub3) this).aClass191Array7952 != null) {
				for (int i_504_ = 0; i_504_ < ((Class387_Sub3) this).anInt7951; i_504_++) {
					Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_504_];
					Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_504_];
					((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & 0xffffff | 255 - ((((Class387_Sub3) this).aByteArray7963[((Class191) class191).anInt1947]) & 0xff) << 24);
				}
			}
			method4838();
		} else if (i == 7) {
			for (int i_505_ = 0; i_505_ < ((Class387_Sub3) this).anInt7916; i_505_++) {
				int i_506_ = ((Class387_Sub3) this).aShortArray7935[i_505_] & 0xffff;
				int i_507_ = i_506_ >> 10 & 0x3f;
				int i_508_ = i_506_ >> 7 & 0x7;
				int i_509_ = i_506_ & 0x7f;
				i_507_ = i_507_ + i_485_ & 0x3f;
				i_508_ += i_486_ / 4;
				if (i_508_ < 0)
					i_508_ = 0;
				else if (i_508_ > 7)
					i_508_ = 7;
				i_509_ += i_487_;
				if (i_509_ < 0)
					i_509_ = 0;
				else if (i_509_ > 127)
					i_509_ = 127;
				((Class387_Sub3) this).aShortArray7935[i_505_] = (short) (i_507_ << 10 | i_508_ << 7 | i_509_);
			}
			if (((Class387_Sub3) this).aClass191Array7952 != null) {
				for (int i_510_ = 0; i_510_ < ((Class387_Sub3) this).anInt7951; i_510_++) {
					Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_510_];
					Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_510_];
					((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
				}
			}
			method4838();
		} else if (i == 8) {
			for (int i_511_ = 0; i_511_ < ((Class387_Sub3) this).anInt7951; i_511_++) {
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_511_];
				((Class166) class166).anInt1704 += i_485_;
				((Class166) class166).anInt1705 += i_486_;
			}
		} else if (i == 10) {
			for (int i_512_ = 0; i_512_ < ((Class387_Sub3) this).anInt7951; i_512_++) {
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_512_];
				((Class166) class166).anInt1702 = ((Class166) class166).anInt1702 * i_485_ >> 7;
				((Class166) class166).anInt1701 = ((Class166) class166).anInt1701 * i_486_ >> 7;
			}
		} else if (i == 9) {
			for (int i_513_ = 0; i_513_ < ((Class387_Sub3) this).anInt7951; i_513_++) {
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_513_];
				((Class166) class166).anInt1706 = ((Class166) class166).anInt1706 + i_485_ & 0x3fff;
			}
		}
	}

	void ka() {
		for (int i = 0; i < ((Class387_Sub3) this).anInt7899; i++) {
			((Class387_Sub3) this).anIntArray7901[i] = ((Class387_Sub3) this).anIntArray7901[i] + 7 >> 4;
			((Class387_Sub3) this).anIntArray7895[i] = ((Class387_Sub3) this).anIntArray7895[i] + 7 >> 4;
			((Class387_Sub3) this).anIntArray7965[i] = ((Class387_Sub3) this).anIntArray7965[i] + 7 >> 4;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public void method4741(Matrix3f class222, int i, boolean bool) {
		if (((Class387_Sub3) this).aShortArray7964 != null) {
			Matrix3f class222_514_ = class222;
			if (bool) {
				class222_514_ = ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aClass222_8235;
				class222_514_.method2074(class222);
			}
			float[] fs = new float[3];
			for (int i_515_ = 0; i_515_ < ((Class387_Sub3) this).anInt7900; i_515_++) {
				if ((i & ((Class387_Sub3) this).aShortArray7964[i_515_]) != 0) {
					class222_514_.method2077((float) ((Class387_Sub3) this).anIntArray7901[i_515_], (float) ((Class387_Sub3) this).anIntArray7895[i_515_], (float) ((Class387_Sub3) this).anIntArray7965[i_515_], fs);
					((Class387_Sub3) this).anIntArray7901[i_515_] = (int) fs[0];
					((Class387_Sub3) this).anIntArray7895[i_515_] = (int) fs[1];
					((Class387_Sub3) this).anIntArray7965[i_515_] = (int) fs[2];
				}
			}
		}
	}

	public Class68[] method4728() {
		return ((Class387_Sub3) this).aClass68Array7904;
	}

	public Class85[] method4781() {
		return ((Class387_Sub3) this).aClass85Array7949;
	}

	public void method4786(Matrix3f class222) {
		Matrix4f class233 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236;
		class233.method2145(class222);
		if (((Class387_Sub3) this).aClass85Array7949 != null) {
			for (int i = 0; i < ((Class387_Sub3) this).aClass85Array7949.length; i++) {
				Class85 class85 = ((Class387_Sub3) this).aClass85Array7949[i];
				Class85 class85_516_ = class85;
				if (class85.aClass85_776 != null)
					class85_516_ = class85.aClass85_776;
				class85_516_.anInt777 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt773 * -710317103)])))) * -1879868075);
				class85_516_.anInt783 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt773 * -710317103)])))) * -2041556771);
				class85_516_.anInt779 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt773 * -710317103)])))) * -1434499227);
				class85_516_.anInt772 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt774 * 1705862021)])))) * 1070341177);
				class85_516_.anInt781 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt774 * 1705862021)])))) * 1802851857);
				class85_516_.anInt782 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt774 * 1705862021)])))) * 103846281;
				class85_516_.anInt771 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt775 * 1636170731)])))) * -2103324039);
				class85_516_.anInt784 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt775 * 1636170731)])))) * -526039059);
				class85_516_.anInt785 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt775 * 1636170731)])))) * 491030489;
			}
		}
		if (((Class387_Sub3) this).aClass68Array7904 != null) {
			for (int i = 0; i < ((Class387_Sub3) this).aClass68Array7904.length; i++) {
				Class68 class68 = ((Class387_Sub3) this).aClass68Array7904[i];
				Class68 class68_517_ = class68;
				if (class68.aClass68_672 != null)
					class68_517_ = class68.aClass68_672;
				if (class68.aClass233_677 != null)
					class68.aClass233_677.method2142(class233);
				else
					class68.aClass233_677 = new Matrix4f(class233);
				class68_517_.anInt671 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class68.anInt674 * -180596249)])))) * -1436341053);
				class68_517_.anInt675 = (int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class68.anInt674 * -180596249)])))) * 449866009;
				class68_517_.anInt676 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class68.anInt674 * -180596249)])))) * 1336328763);
			}
		}
	}

	public boolean method4787(int i, int i_518_, Matrix3f class222, boolean bool, int i_519_) {
		Matrix4f class233 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236;
		class233.method2145(class222);
		class233.method2144(((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8205);
		boolean bool_520_ = false;
		float f = 3.4028235E38F;
		float f_521_ = -3.4028235E38F;
		float f_522_ = 3.4028235E38F;
		float f_523_ = -3.4028235E38F;
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		int i_524_ = ((((Class387_Sub3) this).anInt7941 - ((Class387_Sub3) this).anInt7940) >> 1);
		int i_525_ = ((((Class387_Sub3) this).anInt7939 - ((Class387_Sub3) this).anInt7938) >> 1);
		int i_526_ = ((((Class387_Sub3) this).anInt7943 - ((Class387_Sub3) this).anInt7942) >> 1);
		int i_527_ = ((Class387_Sub3) this).anInt7940 + i_524_;
		int i_528_ = ((Class387_Sub3) this).anInt7938 + i_525_;
		int i_529_ = ((Class387_Sub3) this).anInt7942 + i_526_;
		int i_530_ = i_527_ - (i_524_ << i_519_);
		int i_531_ = i_528_ - (i_525_ << i_519_);
		int i_532_ = i_529_ - (i_526_ << i_519_);
		int i_533_ = i_527_ + (i_524_ << i_519_);
		int i_534_ = i_528_ + (i_525_ << i_519_);
		int i_535_ = i_529_ + (i_526_ << i_519_);
		anIntArray7959[0] = i_530_;
		anIntArray7960[0] = i_531_;
		anIntArray7961[0] = i_532_;
		anIntArray7959[1] = i_533_;
		anIntArray7960[1] = i_531_;
		anIntArray7961[1] = i_532_;
		anIntArray7959[2] = i_530_;
		anIntArray7960[2] = i_534_;
		anIntArray7961[2] = i_532_;
		anIntArray7959[3] = i_533_;
		anIntArray7960[3] = i_534_;
		anIntArray7961[3] = i_532_;
		anIntArray7959[4] = i_530_;
		anIntArray7960[4] = i_531_;
		anIntArray7961[4] = i_535_;
		anIntArray7959[5] = i_533_;
		anIntArray7960[5] = i_531_;
		anIntArray7961[5] = i_535_;
		anIntArray7959[6] = i_530_;
		anIntArray7960[6] = i_534_;
		anIntArray7961[6] = i_535_;
		anIntArray7959[7] = i_533_;
		anIntArray7960[7] = i_534_;
		anIntArray7961[7] = i_535_;
		for (int i_536_ = 0; i_536_ < 8; i_536_++) {
			float f_537_ = (float) anIntArray7959[i_536_];
			float f_538_ = (float) anIntArray7960[i_536_];
			float f_539_ = (float) anIntArray7961[i_536_];
			float f_540_ = (class233.aFloatArray2594[2] * f_537_ + class233.aFloatArray2594[6] * f_538_ + class233.aFloatArray2594[10] * f_539_ + class233.aFloatArray2594[14]);
			float f_541_ = (class233.aFloatArray2594[3] * f_537_ + class233.aFloatArray2594[7] * f_538_ + class233.aFloatArray2594[11] * f_539_ + class233.aFloatArray2594[15]);
			if (f_540_ >= -f_541_) {
				float f_542_ = (class233.aFloatArray2594[0] * f_537_ + class233.aFloatArray2594[4] * f_538_ + class233.aFloatArray2594[8] * f_539_ + class233.aFloatArray2594[12]);
				float f_543_ = (class233.aFloatArray2594[1] * f_537_ + class233.aFloatArray2594[5] * f_538_ + class233.aFloatArray2594[9] * f_539_ + class233.aFloatArray2594[13]);
				float f_544_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8253 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_542_ / f_541_));
				float f_545_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8255 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256 * f_543_ / f_541_));
				if (f_544_ < f)
					f = f_544_;
				if (f_544_ > f_521_)
					f_521_ = f_544_;
				if (f_545_ < f_522_)
					f_522_ = f_545_;
				if (f_545_ > f_523_)
					f_523_ = f_545_;
				bool_520_ = true;
			}
		}
		if (bool_520_ && (float) i > f && (float) i < f_521_ && (float) i_518_ > f_522_ && (float) i_518_ < f_523_) {
			if (bool)
				return true;
			if (anIntArray7933.length < ((Class387_Sub3) this).anInt7906) {
				anIntArray7933 = new int[((Class387_Sub3) this).anInt7906];
				anIntArray7929 = new int[((Class387_Sub3) this).anInt7906];
			}
			for (int i_546_ = 0; i_546_ < ((Class387_Sub3) this).anInt7900; i_546_++) {
				float f_547_ = (float) ((Class387_Sub3) this).anIntArray7901[i_546_];
				float f_548_ = (float) ((Class387_Sub3) this).anIntArray7895[i_546_];
				float f_549_ = (float) ((Class387_Sub3) this).anIntArray7965[i_546_];
				float f_550_ = (class233.aFloatArray2594[2] * f_547_ + class233.aFloatArray2594[6] * f_548_ + class233.aFloatArray2594[10] * f_549_ + class233.aFloatArray2594[14]);
				float f_551_ = (class233.aFloatArray2594[3] * f_547_ + class233.aFloatArray2594[7] * f_548_ + class233.aFloatArray2594[11] * f_549_ + class233.aFloatArray2594[15]);
				if (f_550_ >= -f_551_) {
					float f_552_ = (class233.aFloatArray2594[0] * f_547_ + class233.aFloatArray2594[4] * f_548_ + class233.aFloatArray2594[8] * f_549_ + class233.aFloatArray2594[12]);
					float f_553_ = (class233.aFloatArray2594[1] * f_547_ + class233.aFloatArray2594[5] * f_548_ + class233.aFloatArray2594[9] * f_549_ + class233.aFloatArray2594[13]);
					int i_554_ = ((Class387_Sub3) this).anIntArray7947[i_546_];
					int i_555_ = ((Class387_Sub3) this).anIntArray7947[i_546_ + 1];
					for (int i_556_ = i_554_; i_556_ < i_555_; i_556_++) {
						int i_557_ = (((Class387_Sub3) this).aShortArray7948[i_556_] - 1);
						if (i_557_ == -1)
							break;
						anIntArray7933[i_557_] = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8253) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_552_ / f_551_));
						anIntArray7929[i_557_] = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8255) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256 * f_553_ / f_551_));
					}
				} else {
					int i_558_ = ((Class387_Sub3) this).anIntArray7947[i_546_];
					int i_559_ = ((Class387_Sub3) this).anIntArray7947[i_546_ + 1];
					for (int i_560_ = i_558_; i_560_ < i_559_; i_560_++) {
						int i_561_ = (((Class387_Sub3) this).aShortArray7948[i_560_] - 1);
						if (i_561_ == -1)
							break;
						anIntArray7933[(((Class387_Sub3) this).aShortArray7948[i_560_]) - 1] = -999999;
					}
				}
			}
			for (int i_562_ = 0; i_562_ < ((Class387_Sub3) this).anInt7916; i_562_++) {
				if (anIntArray7933[(((Class387_Sub3) this).aShortArray7920[i_562_])] != -999999 && anIntArray7933[(((Class387_Sub3) this).aShortArray7921[i_562_])] != -999999 && anIntArray7933[(((Class387_Sub3) this).aShortArray7922[i_562_])] != -999999
						&& method4841(i, i_518_, anIntArray7929[(((Class387_Sub3) this).aShortArray7920[i_562_])], anIntArray7929[(((Class387_Sub3) this).aShortArray7921[i_562_])], anIntArray7929[(((Class387_Sub3) this).aShortArray7922[i_562_])], anIntArray7933[(((Class387_Sub3) this).aShortArray7920[i_562_])], anIntArray7933[(((Class387_Sub3) this).aShortArray7921[i_562_])], anIntArray7933[(((Class387_Sub3) this).aShortArray7922[i_562_])]))
					return true;
			}
		}
		return false;
	}

	boolean method4841(int i, int i_563_, int i_564_, int i_565_, int i_566_, int i_567_, int i_568_, int i_569_) {
		if (i_563_ < i_564_ && i_563_ < i_565_ && i_563_ < i_566_)
			return false;
		if (i_563_ > i_564_ && i_563_ > i_565_ && i_563_ > i_566_)
			return false;
		if (i < i_567_ && i < i_568_ && i < i_569_)
			return false;
		if (i > i_567_ && i > i_568_ && i > i_569_)
			return false;
		return true;
	}

	public void bk(int i, int i_570_, int i_571_) {
		for (int i_572_ = 0; i_572_ < ((Class387_Sub3) this).anInt7900; i_572_++) {
			if (i != 0)
				((Class387_Sub3) this).anIntArray7901[i_572_] += i;
			if (i_570_ != 0)
				((Class387_Sub3) this).anIntArray7895[i_572_] += i_570_;
			if (i_571_ != 0)
				((Class387_Sub3) this).anIntArray7965[i_572_] += i_571_;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	void method4842(Class_na_Sub2 class_na_sub2) {
		if (anIntArray7933.length < ((Class387_Sub3) this).anInt7906) {
			anIntArray7933 = new int[((Class387_Sub3) this).anInt7906];
			anIntArray7929 = new int[((Class387_Sub3) this).anInt7906];
		}
		for (int i = 0; i < ((Class387_Sub3) this).anInt7900; i++) {
			int i_573_ = (((((Class387_Sub3) this).anIntArray7901[i] - ((((Class387_Sub3) this).anIntArray7895[i] * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8299) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313) - ((Class_na_Sub2) class_na_sub2).anInt10018);
			int i_574_ = (((((Class387_Sub3) this).anIntArray7965[i] - ((((Class387_Sub3) this).anIntArray7895[i] * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8317) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313) - ((Class_na_Sub2) class_na_sub2).anInt10022);
			int i_575_ = ((Class387_Sub3) this).anIntArray7947[i];
			int i_576_ = ((Class387_Sub3) this).anIntArray7947[i + 1];
			for (int i_577_ = i_575_; i_577_ < i_576_; i_577_++) {
				int i_578_ = ((Class387_Sub3) this).aShortArray7948[i_577_] - 1;
				if (i_578_ == -1)
					break;
				anIntArray7933[i_578_] = i_573_;
				anIntArray7929[i_578_] = i_574_;
			}
		}
		for (int i = 0; i < ((Class387_Sub3) this).anInt7917; i++) {
			if (((Class387_Sub3) this).aByteArray7963 == null || ((Class387_Sub3) this).aByteArray7963[i] <= 128) {
				short i_579_ = ((Class387_Sub3) this).aShortArray7920[i];
				short i_580_ = ((Class387_Sub3) this).aShortArray7921[i];
				short i_581_ = ((Class387_Sub3) this).aShortArray7922[i];
				int i_582_ = anIntArray7933[i_579_];
				int i_583_ = anIntArray7933[i_580_];
				int i_584_ = anIntArray7933[i_581_];
				int i_585_ = anIntArray7929[i_579_];
				int i_586_ = anIntArray7929[i_580_];
				int i_587_ = anIntArray7929[i_581_];
				if (((i_582_ - i_583_) * (i_586_ - i_587_) - (i_586_ - i_585_) * (i_584_ - i_583_)) > 0)
					class_na_sub2.method3490(i_585_, i_586_, i_587_, i_582_, i_583_, i_584_);
			}
		}
	}

	public void method4739(Matrix3f class222, Class302_Sub1 class302_sub1, int i) {
		if (aClass156_7966 != null)
			aClass156_7966.method1694();
		if (((Class387_Sub3) this).anInt7906 != 0) {
			Matrix4f class233 = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8246);
			Matrix4f class233_588_ = ((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236;
			Matrix4f class233_589_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8204);
			class233_588_.method2145(class222);
			class233_589_.method2142(class233_588_);
			class233_589_.method2144(((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aClass233_8205);
			if (!((Class387_Sub3) this).aBoolean7950)
				method4832();
			float[] fs = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloatArray8312);
			class233_588_.method2149(0.0F, (float) ((Class387_Sub3) this).anInt7938, 0.0F, fs);
			float f = fs[0];
			float f_590_ = fs[1];
			float f_591_ = fs[2];
			class233_588_.method2149(0.0F, (float) ((Class387_Sub3) this).anInt7939, 0.0F, fs);
			float f_592_ = fs[0];
			float f_593_ = fs[1];
			float f_594_ = fs[2];
			for (int i_595_ = 0; i_595_ < 6; i_595_++) {
				float[] fs_596_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloatArrayArray8252[i_595_]);
				float f_597_ = (fs_596_[0] * f + fs_596_[1] * f_590_ + fs_596_[2] * f_591_ + fs_596_[3] + (float) ((Class387_Sub3) this).anInt7936);
				float f_598_ = (fs_596_[0] * f_592_ + fs_596_[1] * f_593_ + fs_596_[2] * f_594_ + fs_596_[3] + (float) ((Class387_Sub3) this).anInt7936);
				if (f_597_ < 0.0F && f_598_ < 0.0F)
					return;
			}
			if (class302_sub1 != null) {
				boolean bool = false;
				boolean bool_599_ = true;
				int i_600_ = ((((Class387_Sub3) this).anInt7940 + ((Class387_Sub3) this).anInt7941) >> 1);
				int i_601_ = ((((Class387_Sub3) this).anInt7942 + ((Class387_Sub3) this).anInt7943) >> 1);
				int i_602_ = i_600_;
				int i_603_ = ((Class387_Sub3) this).anInt7938;
				int i_604_ = i_601_;
				float f_605_ = (class233_589_.aFloatArray2594[0] * (float) i_602_ + class233_589_.aFloatArray2594[4] * (float) i_603_ + class233_589_.aFloatArray2594[8] * (float) i_604_ + class233_589_.aFloatArray2594[12]);
				float f_606_ = (class233_589_.aFloatArray2594[1] * (float) i_602_ + class233_589_.aFloatArray2594[5] * (float) i_603_ + class233_589_.aFloatArray2594[9] * (float) i_604_ + class233_589_.aFloatArray2594[13]);
				float f_607_ = (class233_589_.aFloatArray2594[2] * (float) i_602_ + class233_589_.aFloatArray2594[6] * (float) i_603_ + class233_589_.aFloatArray2594[10] * (float) i_604_ + class233_589_.aFloatArray2594[14]);
				float f_608_ = (class233_589_.aFloatArray2594[3] * (float) i_602_ + class233_589_.aFloatArray2594[7] * (float) i_603_ + class233_589_.aFloatArray2594[11] * (float) i_604_ + class233_589_.aFloatArray2594[15]);
				if (f_607_ >= -f_608_) {
					class302_sub1.anInt7641 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8253) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329) * f_605_ / f_608_);
					class302_sub1.anInt7642 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8255) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256) * f_606_ / f_608_);
				} else
					bool = true;
				i_602_ = i_600_;
				i_603_ = ((Class387_Sub3) this).anInt7939;
				i_604_ = i_601_;
				float f_609_ = (class233_589_.aFloatArray2594[0] * (float) i_602_ + class233_589_.aFloatArray2594[4] * (float) i_603_ + class233_589_.aFloatArray2594[8] * (float) i_604_ + class233_589_.aFloatArray2594[12]);
				float f_610_ = (class233_589_.aFloatArray2594[1] * (float) i_602_ + class233_589_.aFloatArray2594[5] * (float) i_603_ + class233_589_.aFloatArray2594[9] * (float) i_604_ + class233_589_.aFloatArray2594[13]);
				float f_611_ = (class233_589_.aFloatArray2594[2] * (float) i_602_ + class233_589_.aFloatArray2594[6] * (float) i_603_ + class233_589_.aFloatArray2594[10] * (float) i_604_ + class233_589_.aFloatArray2594[14]);
				float f_612_ = (class233_589_.aFloatArray2594[3] * (float) i_602_ + class233_589_.aFloatArray2594[7] * (float) i_603_ + class233_589_.aFloatArray2594[11] * (float) i_604_ + class233_589_.aFloatArray2594[15]);
				if (f_611_ >= -f_612_) {
					class302_sub1.anInt7643 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8253) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329) * f_609_ / f_612_);
					class302_sub1.anInt7640 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8255) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256) * f_610_ / f_612_);
				} else
					bool = true;
				if (bool) {
					if (f_607_ < -f_608_ && f_611_ < -f_612_)
						bool_599_ = false;
					else if (f_607_ < -f_608_) {
						float f_613_ = (f_607_ + f_608_) / (f_611_ + f_612_) - 1.0F;
						float f_614_ = f_605_ + f_613_ * (f_609_ - f_605_);
						float f_615_ = f_606_ + f_613_ * (f_610_ - f_606_);
						float f_616_ = f_608_ + f_613_ * (f_612_ - f_608_);
						class302_sub1.anInt7641 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8253) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_614_ / f_616_));
						class302_sub1.anInt7642 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8255) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256 * f_615_ / f_616_));
					} else if (f_611_ < -f_612_) {
						float f_617_ = (f_611_ + f_612_) / (f_607_ + f_608_) - 1.0F;
						float f_618_ = f_609_ + f_617_ * (f_605_ - f_609_);
						float f_619_ = f_610_ + f_617_ * (f_606_ - f_610_);
						float f_620_ = f_612_ + f_617_ * (f_608_ - f_612_);
						class302_sub1.anInt7643 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8253) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_618_ / f_620_));
						class302_sub1.anInt7640 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8255) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256 * f_619_ / f_620_));
					}
				}
				if (bool_599_) {
					if (f_607_ / f_608_ > f_611_ / f_612_) {
						float f_621_ = (f_605_ + (class233.aFloatArray2594[0] * (float) ((Class387_Sub3) this).anInt7936) + class233.aFloatArray2594[12]);
						float f_622_ = (f_608_ + (class233.aFloatArray2594[3] * (float) ((Class387_Sub3) this).anInt7936) + class233.aFloatArray2594[15]);
						class302_sub1.anInt7645 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8253) - (float) class302_sub1.anInt7641 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_621_ / f_622_));
					} else {
						float f_623_ = (f_609_ + (class233.aFloatArray2594[0] * (float) ((Class387_Sub3) this).anInt7936) + class233.aFloatArray2594[12]);
						float f_624_ = (f_612_ + (class233.aFloatArray2594[3] * (float) ((Class387_Sub3) this).anInt7936) + class233.aFloatArray2594[15]);
						class302_sub1.anInt7645 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8253) - (float) class302_sub1.anInt7643 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_623_ / f_624_));
					}
					class302_sub1.aBoolean7644 = true;
				}
			}
			((Class387_Sub3) this).aClass_ra_Sub3_7894.method5394(i);
			method4843(class222);
			((Class387_Sub3) this).aClass_ra_Sub3_7894.method5394(0);
			class233_588_.method2145(class222);
			class233_588_.method2144(((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8230);
			method4849(class233_588_);
		}
	}

	void method4843(Matrix3f class222) {
		if (((Class387_Sub3) this).anInt7917 != 0 && (method4844() && method4835())) {
			if (aClass156_7966 == null) {
				/* empty */
			}
			((Class387_Sub3) this).aClass_ra_Sub3_7894.method5393();
			Class137 class137 = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass137_8316);
			((Class387_Sub3) this).aClass_ra_Sub3_7894.method5383(0, (((Class186) ((Class387_Sub3) this).aClass186_7927).anInterface7_Impl1_1902));
			((Class387_Sub3) this).aClass_ra_Sub3_7894.method5383(1, (((Class186) ((Class387_Sub3) this).aClass186_7911).anInterface7_Impl1_1902));
			((Class387_Sub3) this).aClass_ra_Sub3_7894.method5383(2, (((Class186) ((Class387_Sub3) this).aClass186_7930).anInterface7_Impl1_1902));
			((Class387_Sub3) this).aClass_ra_Sub3_7894.method5384(((Class167) ((Class387_Sub3) this).aClass167_7926).anInterface7_Impl2_1707);
			((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236.method2145(class222);
			class137.method1506(((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236);
			class137.aClass233_1519.method2172();
			if (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aBoolean8326) {
				Class78 class78 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.method5373();
				class137.aClass232_1523.method2135(0.0F, 1.0F, 0.0F, (float) -(((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8328));
				class137.aClass232_1523.method2139(3.0F / (float) (class78.anInt725 * 1996750669));
				class137.aClass217_1524.method2007(((float) (class78.anInt726 * -1212608691 >> 16 & 0xff) / 255.0F), ((float) (class78.anInt726 * -1212608691 >> 8 & 0xff) / 255.0F), ((float) (class78.anInt726 * -1212608691 >> 0 & 0xff) / 255.0F));
			} else {
				class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1524.method2007(0.0F, 0.0F, 0.0F);
			}
			if (((Class387_Sub3) this).aClass_ra_Sub3_7894.anInt8233 > 0) {
				class137.aClass232_1525.method2135(0.0F, 0.0F, 1.0F, -(((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8292));
				class137.aClass217_1522.method2007((float) ((((Class387_Sub3) this).aClass_ra_Sub3_7894.anInt8332) >> 16 & 0xff) / 255.0F, (float) ((((Class387_Sub3) this).aClass_ra_Sub3_7894.anInt8332) >> 8 & 0xff) / 255.0F, (float) ((((Class387_Sub3) this).aClass_ra_Sub3_7894.anInt8332) >> 0 & 0xff) / 255.0F);
				((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236.method2145(class222);
				((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236.method2159();
				class137.aClass232_1523.method2138(((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236);
				((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236.method2145(class222);
				((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236.method2144(((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8230);
				((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236.method2159();
				class137.aClass232_1525.method2138(((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236);
				class137.aClass232_1525.method2139(1.0F / ((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8336) - (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8292)));
			} else {
				class137.aClass232_1525.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1522.method2007(0.0F, 0.0F, 0.0F);
			}
			if ((((Class387_Sub3) this).anInt7896 & 0x37) == 0) {
				((Class387_Sub3) this).aClass_ra_Sub3_7894.method5455(((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aClass153_8306);
				if (((Class387_Sub3) this).aClass_ra_Sub3_7894.fixedFunction)
					((Class387_Sub3) this).aClass_ra_Sub3_7894.method5417(false);
				for (int i = 0; i < ((Class387_Sub3) this).anIntArray7945.length; i++) {
					int i_625_ = ((Class387_Sub3) this).anIntArray7944[i];
					int i_626_ = ((Class387_Sub3) this).anIntArray7944[i + 1];
					int i_627_ = (((Class387_Sub3) this).aShortArray7923[i_625_] & 0xffff);
					boolean bool = false;
					if (i_627_ != 65535) {
						class137.anInterface9_Impl2_1517 = ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass157_8351.method1698(i_627_);
						Class53 class53 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface_ma5299.method174(i_627_, 2089802504);
						bool = !Class298_Sub32_Sub31.method3339(class53.aByte529, -1764580449);
						class137.aClass233_1519.aFloatArray2594[12] = ((float) ((((Class387_Sub3) this).aClass_ra_Sub3_7894.anInt8342) % 128000) / 1000.0F * (float) class53.aByte535 / 64.0F % 1.0F);
						class137.aClass233_1519.aFloatArray2594[13] = ((float) ((((Class387_Sub3) this).aClass_ra_Sub3_7894.anInt8342) % 128000) / 1000.0F * (float) class53.aByte509 / 64.0F % 1.0F);
					} else {
						class137.anInterface9_Impl2_1517 = (((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface9_Impl2_8310);
						float[] fs = class137.aClass233_1519.aFloatArray2594;
						class137.aClass233_1519.aFloatArray2594[13] = 0.0F;
						fs[12] = 0.0F;
					}
					class137.anInt1532 = ((Class387_Sub3) this).anIntArray7945[i];
					class137.anInt1533 = ((Class387_Sub3) this).anIntArray7913[i];
					class137.anInt1534 = i_625_ * 3;
					class137.anInt1514 = i_626_ - i_625_;
					class137.method1514(bool);
				}
			} else {
				((Class387_Sub3) this).aClass_ra_Sub3_7894.method5383(3, (((Class186) ((Class387_Sub3) this).aClass186_7934).anInterface7_Impl1_1902));
				((Class387_Sub3) this).aClass_ra_Sub3_7894.method5455(((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aClass153_8358);
				Matrix3f class222_628_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass222_8235);
				class222_628_.method2070(class222);
				class222_628_.method2058();
				int i = 0;
				if (((Class387_Sub3) this).aClass_ra_Sub3_7894.fixedFunction)
					((Class387_Sub3) this).aClass_ra_Sub3_7894.method5417(true);
				else {
					class137.aClass217_1527.method2007((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloatArray8283[0]), (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloatArray8283[1]), (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloatArray8283[2]));
					class137.aClass217_1527.method2018(class222_628_);
					class137.aClass217_1528.method2007((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8364 * (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8362)), (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8364 * (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8289)), (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8364 * (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8290)));
					class137.aClass217_1529.method2007((-(((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8293) * (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8362)), (-(((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8293) * (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8289)), (-(((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8293) * (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8290)));
					class137.aClass217_1515.method2007((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8291 * (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8362)), (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8291 * (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8289)), (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8291 * (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8290)));
					if (((Class387_Sub3) this).aClass_ra_Sub3_7894.anInt8295 > 0) {
						i = (((Class387_Sub3) this).aClass_ra_Sub3_7894.anInt8295);
						Class217 class217 = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass217_8238);
						for (int i_629_ = 0; i_629_ < i; i_629_++) {
							Class298_Sub10 class298_sub10 = (((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass298_Sub10Array8286[i_629_]);
							int i_630_ = class298_sub10.method2898(-1700557017);
							class217.method2013(class298_sub10.aClass217_7231);
							class217.method2016(class222_628_);
							class137.aFloatArray1516[i_629_ * 4 + 0] = class217.aFloat2451;
							class137.aFloatArray1516[i_629_ * 4 + 1] = class217.aFloat2455;
							class137.aFloatArray1516[i_629_ * 4 + 2] = class217.aFloat2454;
							class137.aFloatArray1516[i_629_ * 4 + 3] = (float) (class298_sub10.method2900(-516677016) * class298_sub10.method2900(-969209529));
							float f = (class298_sub10.method2901(608404512) / 255.0F);
							class137.aFloatArray1526[i_629_ * 4 + 0] = (float) (i_630_ >> 16 & 0xff) * f;
							class137.aFloatArray1526[i_629_ * 4 + 1] = (float) (i_630_ >> 8 & 0xff) * f;
							class137.aFloatArray1526[i_629_ * 4 + 2] = (float) (i_630_ & 0xff) * f;
							class137.aFloatArray1526[i_629_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_631_ = 0; i_631_ < ((Class387_Sub3) this).anIntArray7945.length; i_631_++) {
					int i_632_ = ((Class387_Sub3) this).anIntArray7944[i_631_];
					int i_633_ = ((Class387_Sub3) this).anIntArray7944[i_631_ + 1];
					int i_634_ = (((Class387_Sub3) this).aShortArray7923[i_632_] & 0xffff);
					byte i_635_ = 11;
					if (i_634_ != 65535) {
						class137.anInterface9_Impl2_1517 = ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass157_8351.method1698(i_634_);
						Class53 class53 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface_ma5299.method174(i_634_, 1828434127);
						i_635_ = class53.aByte529;
						class137.method1509(class53);
						class137.aClass233_1519.aFloatArray2594[12] = ((float) ((((Class387_Sub3) this).aClass_ra_Sub3_7894.anInt8342) % 128000) / 1000.0F * (float) class53.aByte535 / 64.0F % 1.0F);
						class137.aClass233_1519.aFloatArray2594[13] = ((float) ((((Class387_Sub3) this).aClass_ra_Sub3_7894.anInt8342) % 128000) / 1000.0F * (float) class53.aByte509 / 64.0F % 1.0F);
					} else {
						class137.anInterface9_Impl2_1517 = (((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface9_Impl2_8310);
						float[] fs = class137.aClass233_1519.aFloatArray2594;
						class137.aClass233_1519.aFloatArray2594[13] = 0.0F;
						fs[12] = 0.0F;
					}
					class137.anInt1532 = ((Class387_Sub3) this).anIntArray7945[i_631_];
					class137.anInt1533 = ((Class387_Sub3) this).anIntArray7913[i_631_];
					class137.anInt1534 = i_632_ * 3;
					class137.anInt1514 = i_633_ - i_632_;
					switch (i_635_) {
					case 6:
						class137.method1514(!Class298_Sub32_Sub31.method3339(i_635_, -2085193350));
						break;
					default:
						class137.method1507(i);
						break;
					case 5:
						if (!((Class387_Sub3) this).aClass_ra_Sub3_7894.fixedFunction) {
							Class161_Sub1_Sub1 class161_sub1_sub1 = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass161_Sub1_Sub1_8266);
							Class53 class53 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface_ma5299.method174(i_634_, 1474848008);
							class161_sub1_sub1.method1738(class53.aByte536, (class53.anInt531 * 1616831825), (byte) 19);
							class161_sub1_sub1.aClass233_9121.method2145(class222);
							class161_sub1_sub1.aClass233_9124.method2145(class222);
							class161_sub1_sub1.aClass233_9124.method2144(((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8251);
							class161_sub1_sub1.anInt9132 = (((Class387_Sub3) this).anIntArray7945[i_631_]) * 1459484499;
							class161_sub1_sub1.anInt9133 = (((Class387_Sub3) this).anIntArray7913[i_631_]) * -2143476445;
							class161_sub1_sub1.anInt9134 = i_632_ * 1595616125;
							class161_sub1_sub1.anInt9135 = (i_633_ - i_632_) * -1212285161;
							class161_sub1_sub1.method1739(-1182747927);
						} else
							class137.method1507(i);
						break;
					case 7:
						class137.aClass217_1530.method2007((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8231.aFloatArray2594[12]), (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8231.aFloatArray2594[13]), (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8231.aFloatArray2594[14]));
						class137.aClass217_1530.method2016(class222_628_);
						class137.aClass233_1535.method2145(class222);
						class137.anInterface9_Impl1_1518 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.method5321();
						class137.method1503(i);
						break;
					case 1:
						class137.aClass217_1530.method2007((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8231.aFloatArray2594[12]), (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8231.aFloatArray2594[13]), (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8231.aFloatArray2594[14]));
						class137.aClass217_1530.method2016(class222_628_);
						class137.method1508(i);
					}
				}
			}
			method4837();
		}
	}

	public int cr() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7940;
	}

	boolean method4844() {
		boolean bool = !((Class186) ((Class387_Sub3) this).aClass186_7911).aBoolean1900;
		boolean bool_636_ = ((((Class387_Sub3) this).anInt7896 & 0x37) != 0 && !(((Class186) ((Class387_Sub3) this).aClass186_7934).aBoolean1900));
		boolean bool_637_ = !((Class186) ((Class387_Sub3) this).aClass186_7927).aBoolean1900;
		boolean bool_638_ = !((Class186) ((Class387_Sub3) this).aClass186_7930).aBoolean1900;
		if (!bool_637_ && !bool && !bool_636_ && !bool_638_)
			return true;
		boolean bool_639_ = true;
		if (bool_637_ && ((Class387_Sub3) this).aShortArray7907 != null) {
			if ((((Class186) ((Class387_Sub3) this).aClass186_7927).anInterface7_Impl1_1903) == null)
				((Class186) ((Class387_Sub3) this).aClass186_7927).anInterface7_Impl1_1903 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.method5382(((Class387_Sub3) this).aBoolean7931);
			Interface7_Impl1 interface7_impl1 = (((Class186) ((Class387_Sub3) this).aClass186_7927).anInterface7_Impl1_1903);
			interface7_impl1.method72(((Class387_Sub3) this).anInt7906 * 12, 12);
			Unsafe unsafe = ((Class387_Sub3) this).aClass_ra_Sub3_7894.anUnsafe8219;
			if (unsafe != null) {
				int i = ((Class387_Sub3) this).anInt7906 * 12;
				long l = interface7_impl1.method62(0, i);
				for (int i_640_ = 0; i_640_ < ((Class387_Sub3) this).anInt7906; i_640_++) {
					short i_641_ = ((Class387_Sub3) this).aShortArray7907[i_640_];
					unsafe.putFloat(l, (float) (((Class387_Sub3) this).anIntArray7901[i_641_]));
					l += 4L;
					unsafe.putFloat(l, (float) (((Class387_Sub3) this).anIntArray7895[i_641_]));
					l += 4L;
					unsafe.putFloat(l, (float) (((Class387_Sub3) this).anIntArray7965[i_641_]));
					l += 4L;
				}
				interface7_impl1.method69();
			} else {
				ByteBuffer bytebuffer = (((Class387_Sub3) this).aClass_ra_Sub3_7894.aByteBuffer8216);
				bytebuffer.clear();
				for (int i = 0; i < ((Class387_Sub3) this).anInt7906; i++) {
					bytebuffer.putFloat((float) ((Class387_Sub3) this).anIntArray7901[(((Class387_Sub3) this).aShortArray7907[i])]);
					bytebuffer.putFloat((float) ((Class387_Sub3) this).anIntArray7895[(((Class387_Sub3) this).aShortArray7907[i])]);
					bytebuffer.putFloat((float) ((Class387_Sub3) this).anIntArray7965[(((Class387_Sub3) this).aShortArray7907[i])]);
				}
				interface7_impl1.method63(0, bytebuffer.position(), (((Class387_Sub3) this).aClass_ra_Sub3_7894.aLong8217));
			}
			((Class186) ((Class387_Sub3) this).aClass186_7927).anInterface7_Impl1_1902 = interface7_impl1;
			((Class186) ((Class387_Sub3) this).aClass186_7927).aBoolean1900 = true;
		}
		if (bool) {
			if ((((Class186) ((Class387_Sub3) this).aClass186_7911).anInterface7_Impl1_1903) == null)
				((Class186) ((Class387_Sub3) this).aClass186_7911).anInterface7_Impl1_1903 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.method5382(((Class387_Sub3) this).aBoolean7931);
			Interface7_Impl1 interface7_impl1 = (((Class186) ((Class387_Sub3) this).aClass186_7911).anInterface7_Impl1_1903);
			interface7_impl1.method72(((Class387_Sub3) this).anInt7906 * 4, 4);
			Unsafe unsafe = ((Class387_Sub3) this).aClass_ra_Sub3_7894.anUnsafe8219;
			if (unsafe != null) {
				int i = ((Class387_Sub3) this).anInt7906 * 4;
				long l = interface7_impl1.method62(0, i);
				if ((((Class387_Sub3) this).anInt7896 & 0x37) == 0) {
					short[] is;
					short[] is_642_;
					short[] is_643_;
					byte[] is_644_;
					if (((Class387_Sub3) this).aClass185_7915 != null) {
						is = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aShortArray1899;
						is_642_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aShortArray1897;
						is_643_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aShortArray1896;
						is_644_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aByteArray1898;
					} else {
						is = ((Class387_Sub3) this).aShortArray7909;
						is_642_ = ((Class387_Sub3) this).aShortArray7910;
						is_643_ = ((Class387_Sub3) this).aShortArray7919;
						is_644_ = ((Class387_Sub3) this).aByteArray7958;
					}
					float f = ((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8364) * 768.0F / (float) ((Class387_Sub3) this).aShort7898);
					float f_645_ = ((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8293) * 768.0F / (float) ((Class387_Sub3) this).aShort7898);
					for (int i_646_ = 0; i_646_ < ((Class387_Sub3) this).anInt7906; i_646_++) {
						short i_647_ = ((Class387_Sub3) this).aShortArray7908[i_646_];
						int i_648_ = method4846((((Class387_Sub3) this).aShortArray7935[i_647_]) & 0xffff, (((Class387_Sub3) this).aShortArray7923[i_647_]), ((Class387_Sub3) this).aShort7897);
						float f_649_ = ((float) (i_648_ >> 16 & 0xff) * (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8362));
						float f_650_ = ((float) (i_648_ >> 8 & 0xff) * (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8289));
						float f_651_ = ((float) (i_648_ & 0xff) * (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8290));
						byte i_652_ = is_644_[i_646_];
						float f_653_;
						if (i_652_ == 0)
							f_653_ = (((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloatArray8283[0]) * (float) is[i_646_] + (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloatArray8283[1]) * (float) is_642_[i_646_] + (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloatArray8283[2]) * (float) is_643_[i_646_]) * 0.0026041667F);
						else
							f_653_ = (((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloatArray8283[0]) * (float) is[i_646_] + (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloatArray8283[1]) * (float) is_642_[i_646_] + (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloatArray8283[2]) * (float) is_643_[i_646_]) / ((float) i_652_ * 256.0F));
						float f_654_ = ((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8291) + f_653_ * (f_653_ < 0.0F ? f_645_ : f));
						int i_655_ = (int) (f_649_ * f_654_);
						if (i_655_ < 0)
							i_655_ = 0;
						else if (i_655_ > 255)
							i_655_ = 255;
						int i_656_ = (int) (f_650_ * f_654_);
						if (i_656_ < 0)
							i_656_ = 0;
						else if (i_656_ > 255)
							i_656_ = 255;
						int i_657_ = (int) (f_651_ * f_654_);
						if (i_657_ < 0)
							i_657_ = 0;
						else if (i_657_ > 255)
							i_657_ = 255;
						unsafe.putInt(l, (255 - (((Class387_Sub3) this).aByteArray7963[i_647_]) << 24 | i_655_ << 16 | i_656_ << 8 | i_657_));
						l += 4L;
					}
				} else {
					for (int i_658_ = 0; i_658_ < ((Class387_Sub3) this).anInt7906; i_658_++) {
						short i_659_ = ((Class387_Sub3) this).aShortArray7908[i_658_];
						int i_660_ = (255 - (((Class387_Sub3) this).aByteArray7963[i_659_]) << 24 | method4846(((((Class387_Sub3) this).aShortArray7935[i_659_]) & 0xffff), (((Class387_Sub3) this).aShortArray7923[i_659_]), (((Class387_Sub3) this).aShort7897)));
						unsafe.putInt(l, i_660_);
						l += 4L;
					}
				}
				interface7_impl1.method69();
			} else {
				ByteBuffer bytebuffer = (((Class387_Sub3) this).aClass_ra_Sub3_7894.aByteBuffer8216);
				bytebuffer.clear();
				if ((((Class387_Sub3) this).anInt7896 & 0x37) == 0) {
					short[] is;
					short[] is_661_;
					short[] is_662_;
					byte[] is_663_;
					if (((Class387_Sub3) this).aClass185_7915 != null) {
						is = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aShortArray1899;
						is_661_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aShortArray1897;
						is_662_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aShortArray1896;
						is_663_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aByteArray1898;
					} else {
						is = ((Class387_Sub3) this).aShortArray7909;
						is_661_ = ((Class387_Sub3) this).aShortArray7910;
						is_662_ = ((Class387_Sub3) this).aShortArray7919;
						is_663_ = ((Class387_Sub3) this).aByteArray7958;
					}
					float f = ((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8364) * 768.0F / (float) ((Class387_Sub3) this).aShort7898);
					float f_664_ = ((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8293) * 768.0F / (float) ((Class387_Sub3) this).aShort7898);
					for (int i = 0; i < ((Class387_Sub3) this).anInt7906; i++) {
						short i_665_ = ((Class387_Sub3) this).aShortArray7908[i];
						int i_666_ = method4846((((Class387_Sub3) this).aShortArray7935[i_665_]) & 0xffff, (((Class387_Sub3) this).aShortArray7923[i_665_]), ((Class387_Sub3) this).aShort7897);
						float f_667_ = ((float) (i_666_ >> 16 & 0xff) * (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8362));
						float f_668_ = ((float) (i_666_ >> 8 & 0xff) * (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8289));
						float f_669_ = ((float) (i_666_ & 0xff) * (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8290));
						byte i_670_ = is_663_[i];
						float f_671_;
						if (i_670_ == 0)
							f_671_ = ((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloatArray8283[0]) * (float) is[i] + ((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloatArray8283[1]) * (float) is_661_[i]) + ((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloatArray8283[2]) * (float) is_662_[i])) * 0.0026041667F;
						else
							f_671_ = (((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloatArray8283[0]) * (float) is[i] + (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloatArray8283[1]) * (float) is_661_[i] + (((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloatArray8283[2]) * (float) is_662_[i]) / ((float) i_670_ * 256.0F));
						float f_672_ = ((((Class387_Sub3) this).aClass_ra_Sub3_7894.aFloat8291) + f_671_ * (f_671_ < 0.0F ? f_664_ : f));
						int i_673_ = (int) (f_667_ * f_672_);
						if (i_673_ < 0)
							i_673_ = 0;
						else if (i_673_ > 255)
							i_673_ = 255;
						int i_674_ = (int) (f_668_ * f_672_);
						if (i_674_ < 0)
							i_674_ = 0;
						else if (i_674_ > 255)
							i_674_ = 255;
						int i_675_ = (int) (f_669_ * f_672_);
						if (i_675_ < 0)
							i_675_ = 0;
						else if (i_675_ > 255)
							i_675_ = 255;
						bytebuffer.putInt(255 - (((Class387_Sub3) this).aByteArray7963[i_665_]) << 24 | i_673_ << 16 | i_674_ << 8 | i_675_);
					}
				} else {
					for (int i = 0; i < ((Class387_Sub3) this).anInt7906; i++) {
						short i_676_ = ((Class387_Sub3) this).aShortArray7908[i];
						int i_677_ = (255 - (((Class387_Sub3) this).aByteArray7963[i_676_]) << 24 | method4846(((((Class387_Sub3) this).aShortArray7935[i_676_]) & 0xffff), (((Class387_Sub3) this).aShortArray7923[i_676_]), (((Class387_Sub3) this).aShort7897)));
						bytebuffer.putInt(i_677_);
					}
				}
				interface7_impl1.method63(0, bytebuffer.position(), (((Class387_Sub3) this).aClass_ra_Sub3_7894.aLong8217));
			}
			((Class186) ((Class387_Sub3) this).aClass186_7911).anInterface7_Impl1_1902 = interface7_impl1;
			((Class186) ((Class387_Sub3) this).aClass186_7911).aBoolean1900 = true;
		}
		if (bool_636_) {
			if ((((Class186) ((Class387_Sub3) this).aClass186_7934).anInterface7_Impl1_1903) == null)
				((Class186) ((Class387_Sub3) this).aClass186_7934).anInterface7_Impl1_1903 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.method5382(((Class387_Sub3) this).aBoolean7931);
			Interface7_Impl1 interface7_impl1 = (((Class186) ((Class387_Sub3) this).aClass186_7934).anInterface7_Impl1_1903);
			interface7_impl1.method72(((Class387_Sub3) this).anInt7906 * 12, 12);
			short[] is;
			short[] is_678_;
			short[] is_679_;
			byte[] is_680_;
			if (((Class387_Sub3) this).aClass185_7915 != null) {
				is = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1899);
				is_678_ = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1897);
				is_679_ = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1896);
				is_680_ = (((Class185) ((Class387_Sub3) this).aClass185_7915).aByteArray1898);
			} else {
				is = ((Class387_Sub3) this).aShortArray7909;
				is_678_ = ((Class387_Sub3) this).aShortArray7910;
				is_679_ = ((Class387_Sub3) this).aShortArray7919;
				is_680_ = ((Class387_Sub3) this).aByteArray7958;
			}
			float f = 3.0F / (float) ((Class387_Sub3) this).aShort7898;
			float f_681_ = 3.0F / (float) (((Class387_Sub3) this).aShort7898 + ((Class387_Sub3) this).aShort7898 / 2);
			Unsafe unsafe = ((Class387_Sub3) this).aClass_ra_Sub3_7894.anUnsafe8219;
			if (unsafe != null) {
				int i = ((Class387_Sub3) this).anInt7906 * 12;
				long l = interface7_impl1.method62(0, i);
				for (int i_682_ = 0; i_682_ < ((Class387_Sub3) this).anInt7906; i_682_++) {
					float f_683_ = (is_680_[i_682_] == 0 ? f_681_ : f / (float) is_680_[i_682_]);
					float f_684_ = (float) is[i_682_] * f_683_;
					float f_685_ = (float) is_678_[i_682_] * f_683_;
					float f_686_ = (float) is_679_[i_682_] * f_683_;
					unsafe.putFloat(l, f_684_);
					l += 4L;
					unsafe.putFloat(l, f_685_);
					l += 4L;
					unsafe.putFloat(l, f_686_);
					l += 4L;
				}
				interface7_impl1.method69();
			} else {
				ByteBuffer bytebuffer = (((Class387_Sub3) this).aClass_ra_Sub3_7894.aByteBuffer8216);
				bytebuffer.clear();
				for (int i = 0; i < ((Class387_Sub3) this).anInt7906; i++) {
					float f_687_ = is_680_[i] == 0 ? f_681_ : f / (float) is_680_[i];
					float f_688_ = (float) is[i] * f_687_;
					float f_689_ = (float) is_678_[i] * f_687_;
					float f_690_ = (float) is_679_[i] * f_687_;
					bytebuffer.putFloat(f_688_);
					bytebuffer.putFloat(f_689_);
					bytebuffer.putFloat(f_690_);
				}
				interface7_impl1.method63(0, bytebuffer.position(), (((Class387_Sub3) this).aClass_ra_Sub3_7894.aLong8217));
			}
			((Class186) ((Class387_Sub3) this).aClass186_7934).anInterface7_Impl1_1902 = interface7_impl1;
			((Class186) ((Class387_Sub3) this).aClass186_7934).aBoolean1900 = true;
		}
		if (bool_638_) {
			if ((((Class186) ((Class387_Sub3) this).aClass186_7930).anInterface7_Impl1_1903) == null)
				((Class186) ((Class387_Sub3) this).aClass186_7930).anInterface7_Impl1_1903 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.method5382(((Class387_Sub3) this).aBoolean7931);
			Interface7_Impl1 interface7_impl1 = (((Class186) ((Class387_Sub3) this).aClass186_7930).anInterface7_Impl1_1903);
			interface7_impl1.method72(((Class387_Sub3) this).anInt7906 * 8, 8);
			Unsafe unsafe = ((Class387_Sub3) this).aClass_ra_Sub3_7894.anUnsafe8219;
			if (unsafe != null) {
				int i = ((Class387_Sub3) this).anInt7906 * 8;
				long l = interface7_impl1.method62(0, i);
				for (int i_691_ = 0; i_691_ < ((Class387_Sub3) this).anInt7906; i_691_++) {
					unsafe.putFloat(l, (((Class387_Sub3) this).aFloatArray7953[i_691_]));
					l += 4L;
					unsafe.putFloat(l, (((Class387_Sub3) this).aFloatArray7914[i_691_]));
					l += 4L;
				}
				interface7_impl1.method69();
			} else {
				ByteBuffer bytebuffer = (((Class387_Sub3) this).aClass_ra_Sub3_7894.aByteBuffer8216);
				bytebuffer.clear();
				for (int i = 0; i < ((Class387_Sub3) this).anInt7906; i++) {
					bytebuffer.putFloat(((Class387_Sub3) this).aFloatArray7953[i]);
					bytebuffer.putFloat(((Class387_Sub3) this).aFloatArray7914[i]);
				}
				interface7_impl1.method63(0, bytebuffer.position(), (((Class387_Sub3) this).aClass_ra_Sub3_7894.aLong8217));
			}
			((Class186) ((Class387_Sub3) this).aClass186_7930).anInterface7_Impl1_1902 = interface7_impl1;
			((Class186) ((Class387_Sub3) this).aClass186_7930).aBoolean1900 = true;
		}
		return bool_639_;
	}

	public int m() {
		return ((Class387_Sub3) this).anInt7912;
	}

	int method4845(int i, int i_692_) {
		i_692_ = i_692_ * (i & 0x7f) >> 7;
		if (i_692_ < 2)
			i_692_ = 2;
		else if (i_692_ > 126)
			i_692_ = 126;
		return (i & 0xff80) + i_692_;
	}

	int method4846(int i, short i_693_, int i_694_) {
		int i_695_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anIntArray8215[method4845(i, i_694_)]);
		if (i_693_ != -1) {
			Class53 class53 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface_ma5299.method174(i_693_ & 0xffff, 655487432);
			int i_696_ = class53.aByte533 & 0xff;
			if (i_696_ != 0) {
				int i_697_ = 131586 * i_694_;
				if (i_696_ == 256)
					i_695_ = i_697_;
				else {
					int i_698_ = i_696_;
					int i_699_ = 256 - i_696_;
					i_695_ = ((((i_697_ & 0xff00ff) * i_698_ + (i_695_ & 0xff00ff) * i_699_) & ~0xff00ff) + (((i_697_ & 0xff00) * i_698_ + (i_695_ & 0xff00) * i_699_) & 0xff0000)) >> 8;
				}
			}
			int i_700_ = class53.aByte534 & 0xff;
			if (i_700_ != 0) {
				i_700_ += 256;
				int i_701_ = ((i_695_ & 0xff0000) >> 16) * i_700_;
				if (i_701_ > 65535)
					i_701_ = 65535;
				int i_702_ = ((i_695_ & 0xff00) >> 8) * i_700_;
				if (i_702_ > 65535)
					i_702_ = 65535;
				int i_703_ = (i_695_ & 0xff) * i_700_;
				if (i_703_ > 65535)
					i_703_ = 65535;
				i_695_ = (i_701_ << 8 & 0xff0000) + (i_702_ & 0xff00) + (i_703_ >> 8);
			}
		}
		return i_695_ & 0xffffff;
	}

	public int cp() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7941;
	}

	public void method4742(byte i, byte[] is) {
		if (is == null) {
			for (int i_704_ = 0; i_704_ < ((Class387_Sub3) this).anInt7916; i_704_++)
				((Class387_Sub3) this).aByteArray7963[i_704_] = i;
		} else {
			for (int i_705_ = 0; i_705_ < ((Class387_Sub3) this).anInt7916; i_705_++) {
				int i_706_ = 255 - ((255 - (is[i_705_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class387_Sub3) this).aByteArray7963[i_705_] = (byte) i_706_;
			}
		}
		method4838();
	}

	public void dj(int i, int i_707_, int i_708_, int i_709_) {
		for (int i_710_ = 0; i_710_ < ((Class387_Sub3) this).anInt7916; i_710_++) {
			int i_711_ = ((Class387_Sub3) this).aShortArray7935[i_710_] & 0xffff;
			int i_712_ = i_711_ >> 10 & 0x3f;
			int i_713_ = i_711_ >> 7 & 0x7;
			int i_714_ = i_711_ & 0x7f;
			if (i != -1)
				i_712_ += (i - i_712_) * i_709_ >> 7;
			if (i_707_ != -1)
				i_713_ += (i_707_ - i_713_) * i_709_ >> 7;
			if (i_708_ != -1)
				i_714_ += (i_708_ - i_714_) * i_709_ >> 7;
			((Class387_Sub3) this).aShortArray7935[i_710_] = (short) (i_712_ << 10 | i_713_ << 7 | i_714_);
		}
		if (((Class387_Sub3) this).aClass191Array7952 != null) {
			for (int i_715_ = 0; i_715_ < ((Class387_Sub3) this).anInt7951; i_715_++) {
				Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_715_];
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_715_];
				((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
			}
		}
		method4838();
	}

	public int cq() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7941;
	}

	public int n() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7928;
	}

	public Class387 method4750(byte i, int i_716_, boolean bool) {
		boolean bool_717_ = false;
		Class387_Sub3 class387_sub3_718_;
		Class387_Sub3 class387_sub3_719_;
		if (i > 0 && i <= 7) {
			class387_sub3_719_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass387_Sub3Array8267[i - 1]);
			class387_sub3_718_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass387_Sub3Array8288[i - 1]);
			bool_717_ = true;
		} else
			class387_sub3_718_ = class387_sub3_719_ = new Class387_Sub3(((Class387_Sub3) this).aClass_ra_Sub3_7894, 0, 0, true, false);
		return method4836(class387_sub3_718_, class387_sub3_719_, i_716_, bool_717_, bool);
	}

	static float[] method4847(float[] fs, int i) {
		float[] fs_720_ = new float[i];
		System.arraycopy(fs, 0, fs_720_, 0, i);
		return fs_720_;
	}

	public void au(int i) {
		if (((Class387_Sub3) this).aClass186_7927 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7927).aBoolean1901 = Class154.method1685(i, ((Class387_Sub3) this).anInt7896);
		if (((Class387_Sub3) this).aClass186_7930 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7930).aBoolean1901 = Class154.method1692(i, ((Class387_Sub3) this).anInt7896);
		if (((Class387_Sub3) this).aClass186_7911 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7911).aBoolean1901 = Class154.method1680(i, ((Class387_Sub3) this).anInt7896);
		if (((Class387_Sub3) this).aClass186_7934 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7934).aBoolean1901 = Class154.method1669(i, ((Class387_Sub3) this).anInt7896);
		((Class387_Sub3) this).anInt7912 = i;
		if (((Class387_Sub3) this).aClass185_7915 != null && (((Class387_Sub3) this).anInt7912 & 0x10000) == 0) {
			((Class387_Sub3) this).aShortArray7909 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1899);
			((Class387_Sub3) this).aShortArray7910 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1897);
			((Class387_Sub3) this).aShortArray7919 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1896);
			((Class387_Sub3) this).aByteArray7958 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aByteArray1898);
			((Class387_Sub3) this).aClass185_7915 = null;
		}
		((Class387_Sub3) this).aBoolean7932 = true;
		method4837();
	}

	public void ar(int i) {
		if (((Class387_Sub3) this).aClass186_7927 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7927).aBoolean1901 = Class154.method1685(i, ((Class387_Sub3) this).anInt7896);
		if (((Class387_Sub3) this).aClass186_7930 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7930).aBoolean1901 = Class154.method1692(i, ((Class387_Sub3) this).anInt7896);
		if (((Class387_Sub3) this).aClass186_7911 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7911).aBoolean1901 = Class154.method1680(i, ((Class387_Sub3) this).anInt7896);
		if (((Class387_Sub3) this).aClass186_7934 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7934).aBoolean1901 = Class154.method1669(i, ((Class387_Sub3) this).anInt7896);
		((Class387_Sub3) this).anInt7912 = i;
		if (((Class387_Sub3) this).aClass185_7915 != null && (((Class387_Sub3) this).anInt7912 & 0x10000) == 0) {
			((Class387_Sub3) this).aShortArray7909 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1899);
			((Class387_Sub3) this).aShortArray7910 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1897);
			((Class387_Sub3) this).aShortArray7919 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1896);
			((Class387_Sub3) this).aByteArray7958 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aByteArray1898);
			((Class387_Sub3) this).aClass185_7915 = null;
		}
		((Class387_Sub3) this).aBoolean7932 = true;
		method4837();
	}

	public void ac(int i) {
		if (((Class387_Sub3) this).aClass186_7927 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7927).aBoolean1901 = Class154.method1685(i, ((Class387_Sub3) this).anInt7896);
		if (((Class387_Sub3) this).aClass186_7930 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7930).aBoolean1901 = Class154.method1692(i, ((Class387_Sub3) this).anInt7896);
		if (((Class387_Sub3) this).aClass186_7911 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7911).aBoolean1901 = Class154.method1680(i, ((Class387_Sub3) this).anInt7896);
		if (((Class387_Sub3) this).aClass186_7934 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7934).aBoolean1901 = Class154.method1669(i, ((Class387_Sub3) this).anInt7896);
		((Class387_Sub3) this).anInt7912 = i;
		if (((Class387_Sub3) this).aClass185_7915 != null && (((Class387_Sub3) this).anInt7912 & 0x10000) == 0) {
			((Class387_Sub3) this).aShortArray7909 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1899);
			((Class387_Sub3) this).aShortArray7910 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1897);
			((Class387_Sub3) this).aShortArray7919 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1896);
			((Class387_Sub3) this).aByteArray7958 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aByteArray1898);
			((Class387_Sub3) this).aClass185_7915 = null;
		}
		((Class387_Sub3) this).aBoolean7932 = true;
		method4837();
	}

	public void method4752() {
		if (((Class387_Sub3) this).anInt7906 > 0 && ((Class387_Sub3) this).anInt7917 > 0) {
			method4844();
			method4835();
			method4837();
		}
	}

	public void method4764() {
		if (((Class387_Sub3) this).anInt7906 > 0 && ((Class387_Sub3) this).anInt7917 > 0) {
			method4844();
			method4835();
			method4837();
		}
	}

	public void bf(int i) {
		int i_721_ = Class220.anIntArray2483[i];
		int i_722_ = Class220.anIntArray2474[i];
		for (int i_723_ = 0; i_723_ < ((Class387_Sub3) this).anInt7900; i_723_++) {
			int i_724_ = ((((Class387_Sub3) this).anIntArray7965[i_723_] * i_721_ + ((Class387_Sub3) this).anIntArray7901[i_723_] * i_722_) >> 14);
			((Class387_Sub3) this).anIntArray7965[i_723_] = ((((Class387_Sub3) this).anIntArray7965[i_723_] * i_722_ - ((Class387_Sub3) this).anIntArray7901[i_723_] * i_721_) >> 14);
			((Class387_Sub3) this).anIntArray7901[i_723_] = i_724_;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public void be(int i) {
		int i_725_ = Class220.anIntArray2483[i];
		int i_726_ = Class220.anIntArray2474[i];
		for (int i_727_ = 0; i_727_ < ((Class387_Sub3) this).anInt7900; i_727_++) {
			int i_728_ = ((((Class387_Sub3) this).anIntArray7965[i_727_] * i_725_ + ((Class387_Sub3) this).anIntArray7901[i_727_] * i_726_) >> 14);
			((Class387_Sub3) this).anIntArray7965[i_727_] = ((((Class387_Sub3) this).anIntArray7965[i_727_] * i_726_ - ((Class387_Sub3) this).anIntArray7901[i_727_] * i_725_) >> 14);
			((Class387_Sub3) this).anIntArray7901[i_727_] = i_728_;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public void by(int i) {
		int i_729_ = Class220.anIntArray2483[i];
		int i_730_ = Class220.anIntArray2474[i];
		for (int i_731_ = 0; i_731_ < ((Class387_Sub3) this).anInt7900; i_731_++) {
			int i_732_ = ((((Class387_Sub3) this).anIntArray7965[i_731_] * i_729_ + ((Class387_Sub3) this).anIntArray7901[i_731_] * i_730_) >> 14);
			((Class387_Sub3) this).anIntArray7965[i_731_] = ((((Class387_Sub3) this).anIntArray7965[i_731_] * i_730_ - ((Class387_Sub3) this).anIntArray7901[i_731_] * i_729_) >> 14);
			((Class387_Sub3) this).anIntArray7901[i_731_] = i_732_;
		}
		for (int i_733_ = 0; i_733_ < ((Class387_Sub3) this).anInt7906; i_733_++) {
			int i_734_ = ((((Class387_Sub3) this).aShortArray7919[i_733_] * i_729_ + ((Class387_Sub3) this).aShortArray7909[i_733_] * i_730_) >> 14);
			((Class387_Sub3) this).aShortArray7919[i_733_] = (short) (((((Class387_Sub3) this).aShortArray7919[i_733_] * i_730_) - (((Class387_Sub3) this).aShortArray7909[i_733_] * i_729_)) >> 14);
			((Class387_Sub3) this).aShortArray7909[i_733_] = (short) i_734_;
		}
		method4851();
		method4839();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	short method4848(Model model, int i, int i_735_, long l, int i_736_, int i_737_, int i_738_, int i_739_, float f, float f_740_) {
		int i_741_ = ((Class387_Sub3) this).anIntArray7947[i];
		int i_742_ = ((Class387_Sub3) this).anIntArray7947[i + 1];
		int i_743_ = 0;
		for (int i_744_ = i_741_; i_744_ < i_742_; i_744_++) {
			short i_745_ = ((Class387_Sub3) this).aShortArray7948[i_744_];
			if (i_745_ == 0) {
				i_743_ = i_744_;
				break;
			}
			if (aLongArray7955[i_744_] == l)
				return (short) (i_745_ - 1);
		}
		((Class387_Sub3) this).aShortArray7948[i_743_] = (short) (((Class387_Sub3) this).anInt7906 + 1);
		aLongArray7955[i_743_] = l;
		((Class387_Sub3) this).aShortArray7908[(((Class387_Sub3) this).anInt7906)] = (short) i_735_;
		((Class387_Sub3) this).aShortArray7907[(((Class387_Sub3) this).anInt7906)] = (short) i;
		((Class387_Sub3) this).aShortArray7909[(((Class387_Sub3) this).anInt7906)] = (short) i_736_;
		((Class387_Sub3) this).aShortArray7910[(((Class387_Sub3) this).anInt7906)] = (short) i_737_;
		((Class387_Sub3) this).aShortArray7919[(((Class387_Sub3) this).anInt7906)] = (short) i_738_;
		((Class387_Sub3) this).aByteArray7958[((Class387_Sub3) this).anInt7906] = (byte) i_739_;
		((Class387_Sub3) this).aFloatArray7953[(((Class387_Sub3) this).anInt7906)] = f;
		((Class387_Sub3) this).aFloatArray7914[(((Class387_Sub3) this).anInt7906)] = f_740_;
		return (short) ((Class387_Sub3) this).anInt7906++;
	}

	void method4849(Matrix4f class233) {
		if (((Class387_Sub3) this).aClass191Array7952 != null) {
			((Class387_Sub3) this).aClass_ra_Sub3_7894.RA(!((Class387_Sub3) this).aBoolean7893);
			Matrix3f class222 = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass222_8235);
			Class130 class130 = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass130_8249);
			for (int i = 0; i < ((Class387_Sub3) this).anInt7951; i++) {
				Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i];
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i];
				if (!((Class191) class191).aBoolean1945 || !((Class387_Sub3) this).aClass_ra_Sub3_7894.method5054()) {
					float f = ((float) ((((Class387_Sub3) this).anIntArray7901[((Class191) class191).anInt1951]) + (((Class387_Sub3) this).anIntArray7901[((Class191) class191).anInt1946]) + (((Class387_Sub3) this).anIntArray7901[((Class191) class191).anInt1944])) * 0.3333333F);
					float f_746_ = ((float) ((((Class387_Sub3) this).anIntArray7895[((Class191) class191).anInt1951]) + (((Class387_Sub3) this).anIntArray7895[((Class191) class191).anInt1946]) + (((Class387_Sub3) this).anIntArray7895[((Class191) class191).anInt1944])) * 0.3333333F);
					float f_747_ = ((float) ((((Class387_Sub3) this).anIntArray7965[((Class191) class191).anInt1951]) + (((Class387_Sub3) this).anIntArray7965[((Class191) class191).anInt1946]) + (((Class387_Sub3) this).anIntArray7965[((Class191) class191).anInt1944])) * 0.3333333F);
					float f_748_ = (class233.aFloatArray2594[0] * f + class233.aFloatArray2594[4] * f_746_ + class233.aFloatArray2594[8] * f_747_ + class233.aFloatArray2594[12]);
					float f_749_ = (class233.aFloatArray2594[1] * f + class233.aFloatArray2594[5] * f_746_ + class233.aFloatArray2594[9] * f_747_ + class233.aFloatArray2594[13]);
					float f_750_ = (class233.aFloatArray2594[2] * f + class233.aFloatArray2594[6] * f_746_ + class233.aFloatArray2594[10] * f_747_ + class233.aFloatArray2594[14]);
					float f_751_ = ((float) (1.0 / Math.sqrt((double) (f_748_ * f_748_ + f_749_ * f_749_ + f_750_ * f_750_))) * (float) ((Class191) class191).anInt1952);
					class222.method2056(((Class166) class166).anInt1706, (((Class166) class166).anInt1702 * ((Class191) class191).aShort1948) >> 7, (((Class166) class166).anInt1701 * ((Class191) class191).aShort1949) >> 7, (f_748_ + (float) ((Class166) class166).anInt1704 - f_748_ * f_751_), (f_749_ + (float) ((Class166) class166).anInt1705 - f_749_ * f_751_), f_750_ - f_750_ * f_751_);
					class222.method2073(((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aClass222_8229);
					((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8204.method2145(class222);
					class130.method1452(((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aClass233_8204);
					class130.aClass233_1494.method2172();
					class130.anInt1493 = ((Class166) class166).anInt1703;
					class130.anInterface9_Impl2_1492 = ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass157_8351.method1698(((Class191) class191).aShort1950);
					class130.method1451();
				}
			}
			((Class387_Sub3) this).aClass_ra_Sub3_7894.RA(true);
		}
	}

	public void bo(int i) {
		int i_752_ = Class220.anIntArray2483[i];
		int i_753_ = Class220.anIntArray2474[i];
		for (int i_754_ = 0; i_754_ < ((Class387_Sub3) this).anInt7900; i_754_++) {
			int i_755_ = ((((Class387_Sub3) this).anIntArray7895[i_754_] * i_753_ - ((Class387_Sub3) this).anIntArray7965[i_754_] * i_752_) >> 14);
			((Class387_Sub3) this).anIntArray7965[i_754_] = ((((Class387_Sub3) this).anIntArray7895[i_754_] * i_752_ + ((Class387_Sub3) this).anIntArray7965[i_754_] * i_753_) >> 14);
			((Class387_Sub3) this).anIntArray7895[i_754_] = i_755_;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public void bb(int i) {
		int i_756_ = Class220.anIntArray2483[i];
		int i_757_ = Class220.anIntArray2474[i];
		for (int i_758_ = 0; i_758_ < ((Class387_Sub3) this).anInt7900; i_758_++) {
			int i_759_ = ((((Class387_Sub3) this).anIntArray7895[i_758_] * i_756_ + ((Class387_Sub3) this).anIntArray7901[i_758_] * i_757_) >> 14);
			((Class387_Sub3) this).anIntArray7895[i_758_] = ((((Class387_Sub3) this).anIntArray7895[i_758_] * i_757_ - ((Class387_Sub3) this).anIntArray7901[i_758_] * i_756_) >> 14);
			((Class387_Sub3) this).anIntArray7901[i_758_] = i_759_;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public void bl(int i, int i_760_, int i_761_) {
		for (int i_762_ = 0; i_762_ < ((Class387_Sub3) this).anInt7900; i_762_++) {
			if (i != 0)
				((Class387_Sub3) this).anIntArray7901[i_762_] += i;
			if (i_760_ != 0)
				((Class387_Sub3) this).anIntArray7895[i_762_] += i_760_;
			if (i_761_ != 0)
				((Class387_Sub3) this).anIntArray7965[i_762_] += i_761_;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public void bu(int i, int i_763_, int i_764_) {
		for (int i_765_ = 0; i_765_ < ((Class387_Sub3) this).anInt7900; i_765_++) {
			if (i != 0)
				((Class387_Sub3) this).anIntArray7901[i_765_] += i;
			if (i_763_ != 0)
				((Class387_Sub3) this).anIntArray7895[i_765_] += i_763_;
			if (i_764_ != 0)
				((Class387_Sub3) this).anIntArray7965[i_765_] += i_764_;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public void bw(int i, int i_766_, int i_767_) {
		for (int i_768_ = 0; i_768_ < ((Class387_Sub3) this).anInt7900; i_768_++) {
			if (i != 0)
				((Class387_Sub3) this).anIntArray7901[i_768_] += i;
			if (i_766_ != 0)
				((Class387_Sub3) this).anIntArray7895[i_768_] += i_766_;
			if (i_767_ != 0)
				((Class387_Sub3) this).anIntArray7965[i_768_] += i_767_;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public Class85[] method4771() {
		return ((Class387_Sub3) this).aClass85Array7949;
	}

	public void bq(int i, int i_769_, int i_770_) {
		for (int i_771_ = 0; i_771_ < ((Class387_Sub3) this).anInt7900; i_771_++) {
			if (i != 128)
				((Class387_Sub3) this).anIntArray7901[i_771_] = ((Class387_Sub3) this).anIntArray7901[i_771_] * i >> 7;
			if (i_769_ != 128)
				((Class387_Sub3) this).anIntArray7895[i_771_] = (((Class387_Sub3) this).anIntArray7895[i_771_] * i_769_ >> 7);
			if (i_770_ != 128)
				((Class387_Sub3) this).anIntArray7965[i_771_] = (((Class387_Sub3) this).anIntArray7965[i_771_] * i_770_ >> 7);
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public void bg(int i, int i_772_, Class_xa class_xa, Class_xa class_xa_773_, int i_774_, int i_775_, int i_776_) {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		int i_777_ = i_774_ + ((Class387_Sub3) this).anInt7940;
		int i_778_ = i_774_ + ((Class387_Sub3) this).anInt7941;
		int i_779_ = i_776_ + ((Class387_Sub3) this).anInt7942;
		int i_780_ = i_776_ + ((Class387_Sub3) this).anInt7943;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_777_ >= 0 && ((i_778_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6287 * -506105871) && i_779_ >= 0 && ((i_780_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6286 * -1148794921))) {
			if (i == 4 || i == 5) {
				if (class_xa_773_ == null || (i_777_ < 0 || ((i_778_ + class_xa_773_.anInt6288 * -1212653763 >> class_xa_773_.anInt6289 * -2137349879) >= class_xa_773_.anInt6287 * -506105871) || i_779_ < 0 || ((i_780_ + class_xa_773_.anInt6288 * -1212653763 >> class_xa_773_.anInt6289 * -2137349879) >= class_xa_773_.anInt6286 * -1148794921)))
					return;
			} else {
				i_777_ >>= class_xa.anInt6289 * -2137349879;
				i_778_ = (i_778_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				i_779_ >>= class_xa.anInt6289 * -2137349879;
				i_780_ = (i_780_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				if (class_xa.method6341(i_777_, i_779_, (byte) -8) == i_775_ && (class_xa.method6341(i_778_, i_779_, (byte) -69) == i_775_) && (class_xa.method6341(i_777_, i_780_, (byte) -76) == i_775_) && (class_xa.method6341(i_778_, i_780_, (byte) -23) == i_775_))
					return;
			}
			if (i == 1) {
				for (int i_781_ = 0; i_781_ < ((Class387_Sub3) this).anInt7900; i_781_++)
					((Class387_Sub3) this).anIntArray7895[i_781_] = (((Class387_Sub3) this).anIntArray7895[i_781_] + class_xa.method6340(((((Class387_Sub3) this).anIntArray7901[i_781_]) + i_774_), ((((Class387_Sub3) this).anIntArray7965[i_781_]) + i_776_), -2097067003) - i_775_);
			} else if (i == 2) {
				int i_782_ = ((Class387_Sub3) this).anInt7938;
				if (i_782_ == 0)
					return;
				for (int i_783_ = 0; i_783_ < ((Class387_Sub3) this).anInt7900; i_783_++) {
					int i_784_ = (((Class387_Sub3) this).anIntArray7895[i_783_] << 16) / i_782_;
					if (i_784_ < i_772_)
						((Class387_Sub3) this).anIntArray7895[i_783_] = (((Class387_Sub3) this).anIntArray7895[i_783_] + (class_xa.method6340((((Class387_Sub3) this).anIntArray7901[i_783_]) + i_774_, (((Class387_Sub3) this).anIntArray7965[i_783_]) + i_776_, -1363823811) - i_775_) * (i_772_ - i_784_) / i_772_);
				}
			} else if (i == 3) {
				int i_785_ = (i_772_ & 0xff) * 4;
				int i_786_ = (i_772_ >> 8 & 0xff) * 4;
				int i_787_ = (i_772_ >> 16 & 0xff) << 6;
				int i_788_ = (i_772_ >> 24 & 0xff) << 6;
				if (i_774_ - (i_785_ >> 1) < 0 || ((i_774_ + (i_785_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6287 * -506105871 << class_xa.anInt6289 * -2137349879)) || i_776_ - (i_786_ >> 1) < 0 || ((i_776_ + (i_786_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6286 * -1148794921 << class_xa.anInt6289 * -2137349879)))
					return;
				method4732(class_xa, i_774_, i_775_, i_776_, i_785_, i_786_, i_787_, i_788_);
			} else if (i == 4) {
				int i_789_ = (((Class387_Sub3) this).anInt7939 - ((Class387_Sub3) this).anInt7938);
				for (int i_790_ = 0; i_790_ < ((Class387_Sub3) this).anInt7900; i_790_++)
					((Class387_Sub3) this).anIntArray7895[i_790_] = (((Class387_Sub3) this).anIntArray7895[i_790_] + (class_xa_773_.method6340((((Class387_Sub3) this).anIntArray7901[i_790_]) + i_774_, (((Class387_Sub3) this).anIntArray7965[i_790_]) + i_776_, -1820526862) - i_775_) + i_789_);
			} else if (i == 5) {
				int i_791_ = (((Class387_Sub3) this).anInt7939 - ((Class387_Sub3) this).anInt7938);
				for (int i_792_ = 0; i_792_ < ((Class387_Sub3) this).anInt7900; i_792_++) {
					int i_793_ = (((Class387_Sub3) this).anIntArray7901[i_792_] + i_774_);
					int i_794_ = (((Class387_Sub3) this).anIntArray7965[i_792_] + i_776_);
					int i_795_ = class_xa.method6340(i_793_, i_794_, -1985664825);
					int i_796_ = class_xa_773_.method6340(i_793_, i_794_, -1789819114);
					int i_797_ = i_795_ - i_796_ - i_772_;
					((Class387_Sub3) this).anIntArray7895[i_792_] = ((((Class387_Sub3) this).anIntArray7895[i_792_] << 8) / i_791_ * i_797_ >> 8) - (i_775_ - i_795_);
				}
			}
			method4851();
			((Class387_Sub3) this).aBoolean7950 = false;
		}
	}

	public void bs(int i, int i_798_, Class_xa class_xa, Class_xa class_xa_799_, int i_800_, int i_801_, int i_802_) {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		int i_803_ = i_800_ + ((Class387_Sub3) this).anInt7940;
		int i_804_ = i_800_ + ((Class387_Sub3) this).anInt7941;
		int i_805_ = i_802_ + ((Class387_Sub3) this).anInt7942;
		int i_806_ = i_802_ + ((Class387_Sub3) this).anInt7943;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_803_ >= 0 && ((i_804_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6287 * -506105871) && i_805_ >= 0 && ((i_806_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6286 * -1148794921))) {
			if (i == 4 || i == 5) {
				if (class_xa_799_ == null || (i_803_ < 0 || ((i_804_ + class_xa_799_.anInt6288 * -1212653763 >> class_xa_799_.anInt6289 * -2137349879) >= class_xa_799_.anInt6287 * -506105871) || i_805_ < 0 || ((i_806_ + class_xa_799_.anInt6288 * -1212653763 >> class_xa_799_.anInt6289 * -2137349879) >= class_xa_799_.anInt6286 * -1148794921)))
					return;
			} else {
				i_803_ >>= class_xa.anInt6289 * -2137349879;
				i_804_ = (i_804_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				i_805_ >>= class_xa.anInt6289 * -2137349879;
				i_806_ = (i_806_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				if (class_xa.method6341(i_803_, i_805_, (byte) -36) == i_801_ && class_xa.method6341(i_804_, i_805_, (byte) -5) == i_801_ && (class_xa.method6341(i_803_, i_806_, (byte) -59) == i_801_) && (class_xa.method6341(i_804_, i_806_, (byte) -77) == i_801_))
					return;
			}
			if (i == 1) {
				for (int i_807_ = 0; i_807_ < ((Class387_Sub3) this).anInt7900; i_807_++)
					((Class387_Sub3) this).anIntArray7895[i_807_] = (((Class387_Sub3) this).anIntArray7895[i_807_] + class_xa.method6340(((((Class387_Sub3) this).anIntArray7901[i_807_]) + i_800_), ((((Class387_Sub3) this).anIntArray7965[i_807_]) + i_802_), -1988396086) - i_801_);
			} else if (i == 2) {
				int i_808_ = ((Class387_Sub3) this).anInt7938;
				if (i_808_ == 0)
					return;
				for (int i_809_ = 0; i_809_ < ((Class387_Sub3) this).anInt7900; i_809_++) {
					int i_810_ = (((Class387_Sub3) this).anIntArray7895[i_809_] << 16) / i_808_;
					if (i_810_ < i_798_)
						((Class387_Sub3) this).anIntArray7895[i_809_] = (((Class387_Sub3) this).anIntArray7895[i_809_] + (class_xa.method6340((((Class387_Sub3) this).anIntArray7901[i_809_]) + i_800_, (((Class387_Sub3) this).anIntArray7965[i_809_]) + i_802_, -1806752452) - i_801_) * (i_798_ - i_810_) / i_798_);
				}
			} else if (i == 3) {
				int i_811_ = (i_798_ & 0xff) * 4;
				int i_812_ = (i_798_ >> 8 & 0xff) * 4;
				int i_813_ = (i_798_ >> 16 & 0xff) << 6;
				int i_814_ = (i_798_ >> 24 & 0xff) << 6;
				if (i_800_ - (i_811_ >> 1) < 0 || ((i_800_ + (i_811_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6287 * -506105871 << class_xa.anInt6289 * -2137349879)) || i_802_ - (i_812_ >> 1) < 0 || ((i_802_ + (i_812_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6286 * -1148794921 << class_xa.anInt6289 * -2137349879)))
					return;
				method4732(class_xa, i_800_, i_801_, i_802_, i_811_, i_812_, i_813_, i_814_);
			} else if (i == 4) {
				int i_815_ = (((Class387_Sub3) this).anInt7939 - ((Class387_Sub3) this).anInt7938);
				for (int i_816_ = 0; i_816_ < ((Class387_Sub3) this).anInt7900; i_816_++)
					((Class387_Sub3) this).anIntArray7895[i_816_] = (((Class387_Sub3) this).anIntArray7895[i_816_] + (class_xa_799_.method6340((((Class387_Sub3) this).anIntArray7901[i_816_]) + i_800_, (((Class387_Sub3) this).anIntArray7965[i_816_]) + i_802_, -1399719361) - i_801_) + i_815_);
			} else if (i == 5) {
				int i_817_ = (((Class387_Sub3) this).anInt7939 - ((Class387_Sub3) this).anInt7938);
				for (int i_818_ = 0; i_818_ < ((Class387_Sub3) this).anInt7900; i_818_++) {
					int i_819_ = (((Class387_Sub3) this).anIntArray7901[i_818_] + i_800_);
					int i_820_ = (((Class387_Sub3) this).anIntArray7965[i_818_] + i_802_);
					int i_821_ = class_xa.method6340(i_819_, i_820_, -1686264500);
					int i_822_ = class_xa_799_.method6340(i_819_, i_820_, -1996725293);
					int i_823_ = i_821_ - i_822_ - i_798_;
					((Class387_Sub3) this).anIntArray7895[i_818_] = ((((Class387_Sub3) this).anIntArray7895[i_818_] << 8) / i_817_ * i_823_ >> 8) - (i_801_ - i_821_);
				}
			}
			method4851();
			((Class387_Sub3) this).aBoolean7950 = false;
		}
	}

	public void bp(int i, int i_824_, Class_xa class_xa, Class_xa class_xa_825_, int i_826_, int i_827_, int i_828_) {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		int i_829_ = i_826_ + ((Class387_Sub3) this).anInt7940;
		int i_830_ = i_826_ + ((Class387_Sub3) this).anInt7941;
		int i_831_ = i_828_ + ((Class387_Sub3) this).anInt7942;
		int i_832_ = i_828_ + ((Class387_Sub3) this).anInt7943;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_829_ >= 0 && ((i_830_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6287 * -506105871) && i_831_ >= 0 && ((i_832_ + class_xa.anInt6288 * -1212653763 >> class_xa.anInt6289 * -2137349879) < class_xa.anInt6286 * -1148794921))) {
			if (i == 4 || i == 5) {
				if (class_xa_825_ == null || (i_829_ < 0 || ((i_830_ + class_xa_825_.anInt6288 * -1212653763 >> class_xa_825_.anInt6289 * -2137349879) >= class_xa_825_.anInt6287 * -506105871) || i_831_ < 0 || ((i_832_ + class_xa_825_.anInt6288 * -1212653763 >> class_xa_825_.anInt6289 * -2137349879) >= class_xa_825_.anInt6286 * -1148794921)))
					return;
			} else {
				i_829_ >>= class_xa.anInt6289 * -2137349879;
				i_830_ = (i_830_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				i_831_ >>= class_xa.anInt6289 * -2137349879;
				i_832_ = (i_832_ + (class_xa.anInt6288 * -1212653763 - 1) >> class_xa.anInt6289 * -2137349879);
				if (class_xa.method6341(i_829_, i_831_, (byte) -79) == i_827_ && (class_xa.method6341(i_830_, i_831_, (byte) -15) == i_827_) && (class_xa.method6341(i_829_, i_832_, (byte) -63) == i_827_) && (class_xa.method6341(i_830_, i_832_, (byte) -127) == i_827_))
					return;
			}
			if (i == 1) {
				for (int i_833_ = 0; i_833_ < ((Class387_Sub3) this).anInt7900; i_833_++)
					((Class387_Sub3) this).anIntArray7895[i_833_] = (((Class387_Sub3) this).anIntArray7895[i_833_] + class_xa.method6340(((((Class387_Sub3) this).anIntArray7901[i_833_]) + i_826_), ((((Class387_Sub3) this).anIntArray7965[i_833_]) + i_828_), -1754503253) - i_827_);
			} else if (i == 2) {
				int i_834_ = ((Class387_Sub3) this).anInt7938;
				if (i_834_ == 0)
					return;
				for (int i_835_ = 0; i_835_ < ((Class387_Sub3) this).anInt7900; i_835_++) {
					int i_836_ = (((Class387_Sub3) this).anIntArray7895[i_835_] << 16) / i_834_;
					if (i_836_ < i_824_)
						((Class387_Sub3) this).anIntArray7895[i_835_] = (((Class387_Sub3) this).anIntArray7895[i_835_] + (class_xa.method6340((((Class387_Sub3) this).anIntArray7901[i_835_]) + i_826_, (((Class387_Sub3) this).anIntArray7965[i_835_]) + i_828_, -2096719300) - i_827_) * (i_824_ - i_836_) / i_824_);
				}
			} else if (i == 3) {
				int i_837_ = (i_824_ & 0xff) * 4;
				int i_838_ = (i_824_ >> 8 & 0xff) * 4;
				int i_839_ = (i_824_ >> 16 & 0xff) << 6;
				int i_840_ = (i_824_ >> 24 & 0xff) << 6;
				if (i_826_ - (i_837_ >> 1) < 0 || ((i_826_ + (i_837_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6287 * -506105871 << class_xa.anInt6289 * -2137349879)) || i_828_ - (i_838_ >> 1) < 0 || ((i_828_ + (i_838_ >> 1) + class_xa.anInt6288 * -1212653763) >= (class_xa.anInt6286 * -1148794921 << class_xa.anInt6289 * -2137349879)))
					return;
				method4732(class_xa, i_826_, i_827_, i_828_, i_837_, i_838_, i_839_, i_840_);
			} else if (i == 4) {
				int i_841_ = (((Class387_Sub3) this).anInt7939 - ((Class387_Sub3) this).anInt7938);
				for (int i_842_ = 0; i_842_ < ((Class387_Sub3) this).anInt7900; i_842_++)
					((Class387_Sub3) this).anIntArray7895[i_842_] = (((Class387_Sub3) this).anIntArray7895[i_842_] + (class_xa_825_.method6340((((Class387_Sub3) this).anIntArray7901[i_842_]) + i_826_, (((Class387_Sub3) this).anIntArray7965[i_842_]) + i_828_, -1750305937) - i_827_) + i_841_);
			} else if (i == 5) {
				int i_843_ = (((Class387_Sub3) this).anInt7939 - ((Class387_Sub3) this).anInt7938);
				for (int i_844_ = 0; i_844_ < ((Class387_Sub3) this).anInt7900; i_844_++) {
					int i_845_ = (((Class387_Sub3) this).anIntArray7901[i_844_] + i_826_);
					int i_846_ = (((Class387_Sub3) this).anIntArray7965[i_844_] + i_828_);
					int i_847_ = class_xa.method6340(i_845_, i_846_, -1782278244);
					int i_848_ = class_xa_825_.method6340(i_845_, i_846_, -1287457378);
					int i_849_ = i_847_ - i_848_ - i_824_;
					((Class387_Sub3) this).anIntArray7895[i_844_] = ((((Class387_Sub3) this).anIntArray7895[i_844_] << 8) / i_843_ * i_849_ >> 8) - (i_827_ - i_847_);
				}
			}
			method4851();
			((Class387_Sub3) this).aBoolean7950 = false;
		}
	}

	void method4754() {
		/* empty */
	}

	void method4757() {
		/* empty */
	}

	void method4756() {
		/* empty */
	}

	void method4758() {
		/* empty */
	}

	boolean bt() {
		if (((Class387_Sub3) this).anIntArrayArray7918 == null)
			return false;
		for (int i = 0; i < ((Class387_Sub3) this).anInt7899; i++) {
			((Class387_Sub3) this).anIntArray7901[i] <<= 4;
			((Class387_Sub3) this).anIntArray7895[i] <<= 4;
			((Class387_Sub3) this).anIntArray7965[i] <<= 4;
		}
		anInt7902 = 0;
		anInt7937 = 0;
		anInt7956 = 0;
		return true;
	}

	void br() {
		for (int i = 0; i < ((Class387_Sub3) this).anInt7899; i++) {
			((Class387_Sub3) this).anIntArray7901[i] = ((Class387_Sub3) this).anIntArray7901[i] + 7 >> 4;
			((Class387_Sub3) this).anIntArray7895[i] = ((Class387_Sub3) this).anIntArray7895[i] + 7 >> 4;
			((Class387_Sub3) this).anIntArray7965[i] = ((Class387_Sub3) this).anIntArray7965[i] + 7 >> 4;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	void bz() {
		for (int i = 0; i < ((Class387_Sub3) this).anInt7899; i++) {
			((Class387_Sub3) this).anIntArray7901[i] = ((Class387_Sub3) this).anIntArray7901[i] + 7 >> 4;
			((Class387_Sub3) this).anIntArray7895[i] = ((Class387_Sub3) this).anIntArray7895[i] + 7 >> 4;
			((Class387_Sub3) this).anIntArray7965[i] = ((Class387_Sub3) this).anIntArray7965[i] + 7 >> 4;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	void cm() {
		for (int i = 0; i < ((Class387_Sub3) this).anInt7899; i++) {
			((Class387_Sub3) this).anIntArray7901[i] = ((Class387_Sub3) this).anIntArray7901[i] + 7 >> 4;
			((Class387_Sub3) this).anIntArray7895[i] = ((Class387_Sub3) this).anIntArray7895[i] + 7 >> 4;
			((Class387_Sub3) this).anIntArray7965[i] = ((Class387_Sub3) this).anIntArray7965[i] + 7 >> 4;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	void cd() {
		for (int i = 0; i < ((Class387_Sub3) this).anInt7899; i++) {
			((Class387_Sub3) this).anIntArray7901[i] = ((Class387_Sub3) this).anIntArray7901[i] + 7 >> 4;
			((Class387_Sub3) this).anIntArray7895[i] = ((Class387_Sub3) this).anIntArray7895[i] + 7 >> 4;
			((Class387_Sub3) this).anIntArray7965[i] = ((Class387_Sub3) this).anIntArray7965[i] + 7 >> 4;
		}
		method4851();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	void method4760(int i, int[] is, int i_850_, int i_851_, int i_852_, int i_853_, boolean bool) {
		int i_854_ = is.length;
		if (i == 0) {
			i_850_ <<= 4;
			i_851_ <<= 4;
			i_852_ <<= 4;
			int i_855_ = 0;
			anInt7902 = 0;
			anInt7937 = 0;
			anInt7956 = 0;
			for (int i_856_ = 0; i_856_ < i_854_; i_856_++) {
				int i_857_ = is[i_856_];
				if (i_857_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_858_ = ((Class387_Sub3) this).anIntArrayArray7918[i_857_];
					for (int i_859_ = 0; i_859_ < is_858_.length; i_859_++) {
						int i_860_ = is_858_[i_859_];
						anInt7902 += ((Class387_Sub3) this).anIntArray7901[i_860_];
						anInt7937 += ((Class387_Sub3) this).anIntArray7895[i_860_];
						anInt7956 += ((Class387_Sub3) this).anIntArray7965[i_860_];
						i_855_++;
					}
				}
			}
			if (i_855_ > 0) {
				anInt7902 = anInt7902 / i_855_ + i_850_;
				anInt7937 = anInt7937 / i_855_ + i_851_;
				anInt7956 = anInt7956 / i_855_ + i_852_;
			} else {
				anInt7902 = i_850_;
				anInt7937 = i_851_;
				anInt7956 = i_852_;
			}
		} else if (i == 1) {
			i_850_ <<= 4;
			i_851_ <<= 4;
			i_852_ <<= 4;
			for (int i_861_ = 0; i_861_ < i_854_; i_861_++) {
				int i_862_ = is[i_861_];
				if (i_862_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_863_ = ((Class387_Sub3) this).anIntArrayArray7918[i_862_];
					for (int i_864_ = 0; i_864_ < is_863_.length; i_864_++) {
						int i_865_ = is_863_[i_864_];
						((Class387_Sub3) this).anIntArray7901[i_865_] += i_850_;
						((Class387_Sub3) this).anIntArray7895[i_865_] += i_851_;
						((Class387_Sub3) this).anIntArray7965[i_865_] += i_852_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_866_ = 0; i_866_ < i_854_; i_866_++) {
				int i_867_ = is[i_866_];
				if (i_867_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_868_ = ((Class387_Sub3) this).anIntArrayArray7918[i_867_];
					if ((i_853_ & 0x1) == 0) {
						for (int i_869_ = 0; i_869_ < is_868_.length; i_869_++) {
							int i_870_ = is_868_[i_869_];
							((Class387_Sub3) this).anIntArray7901[i_870_] -= anInt7902;
							((Class387_Sub3) this).anIntArray7895[i_870_] -= anInt7937;
							((Class387_Sub3) this).anIntArray7965[i_870_] -= anInt7956;
							if (i_852_ != 0) {
								int i_871_ = Class220.anIntArray2483[i_852_];
								int i_872_ = Class220.anIntArray2474[i_852_];
								int i_873_ = (((((Class387_Sub3) this).anIntArray7895[i_870_]) * i_871_ + (((Class387_Sub3) this).anIntArray7901[i_870_]) * i_872_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray7895[i_870_] = ((((Class387_Sub3) this).anIntArray7895[i_870_]) * i_872_ - (((Class387_Sub3) this).anIntArray7901[i_870_]) * i_871_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7901[i_870_] = i_873_;
							}
							if (i_850_ != 0) {
								int i_874_ = Class220.anIntArray2483[i_850_];
								int i_875_ = Class220.anIntArray2474[i_850_];
								int i_876_ = (((((Class387_Sub3) this).anIntArray7895[i_870_]) * i_875_ - (((Class387_Sub3) this).anIntArray7965[i_870_]) * i_874_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray7965[i_870_] = ((((Class387_Sub3) this).anIntArray7895[i_870_]) * i_874_ + (((Class387_Sub3) this).anIntArray7965[i_870_]) * i_875_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7895[i_870_] = i_876_;
							}
							if (i_851_ != 0) {
								int i_877_ = Class220.anIntArray2483[i_851_];
								int i_878_ = Class220.anIntArray2474[i_851_];
								int i_879_ = (((((Class387_Sub3) this).anIntArray7965[i_870_]) * i_877_ + (((Class387_Sub3) this).anIntArray7901[i_870_]) * i_878_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray7965[i_870_] = ((((Class387_Sub3) this).anIntArray7965[i_870_]) * i_878_ - (((Class387_Sub3) this).anIntArray7901[i_870_]) * i_877_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7901[i_870_] = i_879_;
							}
							((Class387_Sub3) this).anIntArray7901[i_870_] += anInt7902;
							((Class387_Sub3) this).anIntArray7895[i_870_] += anInt7937;
							((Class387_Sub3) this).anIntArray7965[i_870_] += anInt7956;
						}
					} else {
						for (int i_880_ = 0; i_880_ < is_868_.length; i_880_++) {
							int i_881_ = is_868_[i_880_];
							((Class387_Sub3) this).anIntArray7901[i_881_] -= anInt7902;
							((Class387_Sub3) this).anIntArray7895[i_881_] -= anInt7937;
							((Class387_Sub3) this).anIntArray7965[i_881_] -= anInt7956;
							if (i_850_ != 0) {
								int i_882_ = Class220.anIntArray2483[i_850_];
								int i_883_ = Class220.anIntArray2474[i_850_];
								int i_884_ = (((((Class387_Sub3) this).anIntArray7895[i_881_]) * i_883_ - (((Class387_Sub3) this).anIntArray7965[i_881_]) * i_882_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray7965[i_881_] = ((((Class387_Sub3) this).anIntArray7895[i_881_]) * i_882_ + (((Class387_Sub3) this).anIntArray7965[i_881_]) * i_883_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7895[i_881_] = i_884_;
							}
							if (i_852_ != 0) {
								int i_885_ = Class220.anIntArray2483[i_852_];
								int i_886_ = Class220.anIntArray2474[i_852_];
								int i_887_ = (((((Class387_Sub3) this).anIntArray7895[i_881_]) * i_885_ + (((Class387_Sub3) this).anIntArray7901[i_881_]) * i_886_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray7895[i_881_] = ((((Class387_Sub3) this).anIntArray7895[i_881_]) * i_886_ - (((Class387_Sub3) this).anIntArray7901[i_881_]) * i_885_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7901[i_881_] = i_887_;
							}
							if (i_851_ != 0) {
								int i_888_ = Class220.anIntArray2483[i_851_];
								int i_889_ = Class220.anIntArray2474[i_851_];
								int i_890_ = (((((Class387_Sub3) this).anIntArray7965[i_881_]) * i_888_ + (((Class387_Sub3) this).anIntArray7901[i_881_]) * i_889_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray7965[i_881_] = ((((Class387_Sub3) this).anIntArray7965[i_881_]) * i_889_ - (((Class387_Sub3) this).anIntArray7901[i_881_]) * i_888_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7901[i_881_] = i_890_;
							}
							((Class387_Sub3) this).anIntArray7901[i_881_] += anInt7902;
							((Class387_Sub3) this).anIntArray7895[i_881_] += anInt7937;
							((Class387_Sub3) this).anIntArray7965[i_881_] += anInt7956;
						}
					}
				}
			}
			if (bool) {
				for (int i_891_ = 0; i_891_ < i_854_; i_891_++) {
					int i_892_ = is[i_891_];
					if (i_892_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_893_ = (((Class387_Sub3) this).anIntArrayArray7918[i_892_]);
						for (int i_894_ = 0; i_894_ < is_893_.length; i_894_++) {
							int i_895_ = is_893_[i_894_];
							int i_896_ = (((Class387_Sub3) this).anIntArray7947[i_895_]);
							int i_897_ = (((Class387_Sub3) this).anIntArray7947[i_895_ + 1]);
							for (int i_898_ = i_896_; i_898_ < i_897_; i_898_++) {
								int i_899_ = ((((Class387_Sub3) this).aShortArray7948[i_898_]) - 1);
								if (i_899_ == -1)
									break;
								if (i_852_ != 0) {
									int i_900_ = Class220.anIntArray2483[i_852_];
									int i_901_ = Class220.anIntArray2474[i_852_];
									int i_902_ = (((((Class387_Sub3) this).aShortArray7910[i_899_]) * i_900_ + ((((Class387_Sub3) this).aShortArray7909[i_899_]) * i_901_) + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7910[i_899_] = (short) ((((((Class387_Sub3) this).aShortArray7910[i_899_]) * i_901_) - (((Class387_Sub3) this).aShortArray7909[i_899_]) * i_900_ + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7909[i_899_] = (short) i_902_;
								}
								if (i_850_ != 0) {
									int i_903_ = Class220.anIntArray2483[i_850_];
									int i_904_ = Class220.anIntArray2474[i_850_];
									int i_905_ = (((((Class387_Sub3) this).aShortArray7910[i_899_]) * i_904_ - ((((Class387_Sub3) this).aShortArray7919[i_899_]) * i_903_) + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7919[i_899_] = (short) ((((((Class387_Sub3) this).aShortArray7910[i_899_]) * i_903_) + (((Class387_Sub3) this).aShortArray7919[i_899_]) * i_904_ + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7910[i_899_] = (short) i_905_;
								}
								if (i_851_ != 0) {
									int i_906_ = Class220.anIntArray2483[i_851_];
									int i_907_ = Class220.anIntArray2474[i_851_];
									int i_908_ = (((((Class387_Sub3) this).aShortArray7919[i_899_]) * i_906_ + ((((Class387_Sub3) this).aShortArray7909[i_899_]) * i_907_) + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7919[i_899_] = (short) ((((((Class387_Sub3) this).aShortArray7919[i_899_]) * i_907_) - (((Class387_Sub3) this).aShortArray7909[i_899_]) * i_906_ + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7909[i_899_] = (short) i_908_;
								}
							}
						}
					}
				}
				method4839();
			}
		} else if (i == 3) {
			for (int i_909_ = 0; i_909_ < i_854_; i_909_++) {
				int i_910_ = is[i_909_];
				if (i_910_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_911_ = ((Class387_Sub3) this).anIntArrayArray7918[i_910_];
					for (int i_912_ = 0; i_912_ < is_911_.length; i_912_++) {
						int i_913_ = is_911_[i_912_];
						((Class387_Sub3) this).anIntArray7901[i_913_] -= anInt7902;
						((Class387_Sub3) this).anIntArray7895[i_913_] -= anInt7937;
						((Class387_Sub3) this).anIntArray7965[i_913_] -= anInt7956;
						((Class387_Sub3) this).anIntArray7901[i_913_] = (((Class387_Sub3) this).anIntArray7901[i_913_] * i_850_) >> 7;
						((Class387_Sub3) this).anIntArray7895[i_913_] = (((Class387_Sub3) this).anIntArray7895[i_913_] * i_851_) >> 7;
						((Class387_Sub3) this).anIntArray7965[i_913_] = (((Class387_Sub3) this).anIntArray7965[i_913_] * i_852_) >> 7;
						((Class387_Sub3) this).anIntArray7901[i_913_] += anInt7902;
						((Class387_Sub3) this).anIntArray7895[i_913_] += anInt7937;
						((Class387_Sub3) this).anIntArray7965[i_913_] += anInt7956;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub3) this).anIntArrayArray7924 != null) {
				boolean bool_914_ = false;
				for (int i_915_ = 0; i_915_ < i_854_; i_915_++) {
					int i_916_ = is[i_915_];
					if (i_916_ < ((Class387_Sub3) this).anIntArrayArray7924.length) {
						int[] is_917_ = (((Class387_Sub3) this).anIntArrayArray7924[i_916_]);
						for (int i_918_ = 0; i_918_ < is_917_.length; i_918_++) {
							int i_919_ = is_917_[i_918_];
							int i_920_ = (((((Class387_Sub3) this).aByteArray7963[i_919_]) & 0xff) + i_850_ * 8);
							if (i_920_ < 0)
								i_920_ = 0;
							else if (i_920_ > 255)
								i_920_ = 255;
							((Class387_Sub3) this).aByteArray7963[i_919_] = (byte) i_920_;
						}
						bool_914_ = bool_914_ | is_917_.length > 0;
					}
				}
				if (bool_914_) {
					if (((Class387_Sub3) this).aClass191Array7952 != null) {
						for (int i_921_ = 0; i_921_ < ((Class387_Sub3) this).anInt7951; i_921_++) {
							Class191 class191 = (((Class387_Sub3) this).aClass191Array7952[i_921_]);
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[i_921_]);
							((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & 0xffffff | 255 - ((((Class387_Sub3) this).aByteArray7963[((Class191) class191).anInt1947]) & 0xff) << 24);
						}
					}
					method4838();
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub3) this).anIntArrayArray7924 != null) {
				boolean bool_922_ = false;
				for (int i_923_ = 0; i_923_ < i_854_; i_923_++) {
					int i_924_ = is[i_923_];
					if (i_924_ < ((Class387_Sub3) this).anIntArrayArray7924.length) {
						int[] is_925_ = (((Class387_Sub3) this).anIntArrayArray7924[i_924_]);
						for (int i_926_ = 0; i_926_ < is_925_.length; i_926_++) {
							int i_927_ = is_925_[i_926_];
							int i_928_ = ((((Class387_Sub3) this).aShortArray7935[i_927_]) & 0xffff);
							int i_929_ = i_928_ >> 10 & 0x3f;
							int i_930_ = i_928_ >> 7 & 0x7;
							int i_931_ = i_928_ & 0x7f;
							i_929_ = i_929_ + i_850_ & 0x3f;
							i_930_ += i_851_ / 4;
							if (i_930_ < 0)
								i_930_ = 0;
							else if (i_930_ > 7)
								i_930_ = 7;
							i_931_ += i_852_;
							if (i_931_ < 0)
								i_931_ = 0;
							else if (i_931_ > 127)
								i_931_ = 127;
							((Class387_Sub3) this).aShortArray7935[i_927_] = (short) (i_929_ << 10 | i_930_ << 7 | i_931_);
						}
						bool_922_ = bool_922_ | is_925_.length > 0;
					}
				}
				if (bool_922_) {
					if (((Class387_Sub3) this).aClass191Array7952 != null) {
						for (int i_932_ = 0; i_932_ < ((Class387_Sub3) this).anInt7951; i_932_++) {
							Class191 class191 = (((Class387_Sub3) this).aClass191Array7952[i_932_]);
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[i_932_]);
							((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | (Class294.anIntArray3165[((((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff)]) & 0xffffff);
						}
					}
					method4838();
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_933_ = 0; i_933_ < i_854_; i_933_++) {
					int i_934_ = is[i_933_];
					if (i_934_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_935_ = (((Class387_Sub3) this).anIntArrayArray7946[i_934_]);
						for (int i_936_ = 0; i_936_ < is_935_.length; i_936_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_935_[i_936_]]);
							((Class166) class166).anInt1704 += i_850_;
							((Class166) class166).anInt1705 += i_851_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_937_ = 0; i_937_ < i_854_; i_937_++) {
					int i_938_ = is[i_937_];
					if (i_938_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_939_ = (((Class387_Sub3) this).anIntArrayArray7946[i_938_]);
						for (int i_940_ = 0; i_940_ < is_939_.length; i_940_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_939_[i_940_]]);
							((Class166) class166).anInt1702 = (((Class166) class166).anInt1702 * i_850_ >> 7);
							((Class166) class166).anInt1701 = (((Class166) class166).anInt1701 * i_851_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_941_ = 0; i_941_ < i_854_; i_941_++) {
					int i_942_ = is[i_941_];
					if (i_942_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_943_ = (((Class387_Sub3) this).anIntArrayArray7946[i_942_]);
						for (int i_944_ = 0; i_944_ < is_943_.length; i_944_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_943_[i_944_]]);
							((Class166) class166).anInt1706 = (((Class166) class166).anInt1706 + i_850_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void method4761(int i, int[] is, int i_945_, int i_946_, int i_947_, int i_948_, boolean bool) {
		int i_949_ = is.length;
		if (i == 0) {
			i_945_ <<= 4;
			i_946_ <<= 4;
			i_947_ <<= 4;
			int i_950_ = 0;
			anInt7902 = 0;
			anInt7937 = 0;
			anInt7956 = 0;
			for (int i_951_ = 0; i_951_ < i_949_; i_951_++) {
				int i_952_ = is[i_951_];
				if (i_952_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_953_ = ((Class387_Sub3) this).anIntArrayArray7918[i_952_];
					for (int i_954_ = 0; i_954_ < is_953_.length; i_954_++) {
						int i_955_ = is_953_[i_954_];
						anInt7902 += ((Class387_Sub3) this).anIntArray7901[i_955_];
						anInt7937 += ((Class387_Sub3) this).anIntArray7895[i_955_];
						anInt7956 += ((Class387_Sub3) this).anIntArray7965[i_955_];
						i_950_++;
					}
				}
			}
			if (i_950_ > 0) {
				anInt7902 = anInt7902 / i_950_ + i_945_;
				anInt7937 = anInt7937 / i_950_ + i_946_;
				anInt7956 = anInt7956 / i_950_ + i_947_;
			} else {
				anInt7902 = i_945_;
				anInt7937 = i_946_;
				anInt7956 = i_947_;
			}
		} else if (i == 1) {
			i_945_ <<= 4;
			i_946_ <<= 4;
			i_947_ <<= 4;
			for (int i_956_ = 0; i_956_ < i_949_; i_956_++) {
				int i_957_ = is[i_956_];
				if (i_957_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_958_ = ((Class387_Sub3) this).anIntArrayArray7918[i_957_];
					for (int i_959_ = 0; i_959_ < is_958_.length; i_959_++) {
						int i_960_ = is_958_[i_959_];
						((Class387_Sub3) this).anIntArray7901[i_960_] += i_945_;
						((Class387_Sub3) this).anIntArray7895[i_960_] += i_946_;
						((Class387_Sub3) this).anIntArray7965[i_960_] += i_947_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_961_ = 0; i_961_ < i_949_; i_961_++) {
				int i_962_ = is[i_961_];
				if (i_962_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_963_ = ((Class387_Sub3) this).anIntArrayArray7918[i_962_];
					if ((i_948_ & 0x1) == 0) {
						for (int i_964_ = 0; i_964_ < is_963_.length; i_964_++) {
							int i_965_ = is_963_[i_964_];
							((Class387_Sub3) this).anIntArray7901[i_965_] -= anInt7902;
							((Class387_Sub3) this).anIntArray7895[i_965_] -= anInt7937;
							((Class387_Sub3) this).anIntArray7965[i_965_] -= anInt7956;
							if (i_947_ != 0) {
								int i_966_ = Class220.anIntArray2483[i_947_];
								int i_967_ = Class220.anIntArray2474[i_947_];
								int i_968_ = (((((Class387_Sub3) this).anIntArray7895[i_965_]) * i_966_ + (((Class387_Sub3) this).anIntArray7901[i_965_]) * i_967_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray7895[i_965_] = ((((Class387_Sub3) this).anIntArray7895[i_965_]) * i_967_ - (((Class387_Sub3) this).anIntArray7901[i_965_]) * i_966_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7901[i_965_] = i_968_;
							}
							if (i_945_ != 0) {
								int i_969_ = Class220.anIntArray2483[i_945_];
								int i_970_ = Class220.anIntArray2474[i_945_];
								int i_971_ = (((((Class387_Sub3) this).anIntArray7895[i_965_]) * i_970_ - (((Class387_Sub3) this).anIntArray7965[i_965_]) * i_969_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray7965[i_965_] = ((((Class387_Sub3) this).anIntArray7895[i_965_]) * i_969_ + (((Class387_Sub3) this).anIntArray7965[i_965_]) * i_970_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7895[i_965_] = i_971_;
							}
							if (i_946_ != 0) {
								int i_972_ = Class220.anIntArray2483[i_946_];
								int i_973_ = Class220.anIntArray2474[i_946_];
								int i_974_ = (((((Class387_Sub3) this).anIntArray7965[i_965_]) * i_972_ + (((Class387_Sub3) this).anIntArray7901[i_965_]) * i_973_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray7965[i_965_] = ((((Class387_Sub3) this).anIntArray7965[i_965_]) * i_973_ - (((Class387_Sub3) this).anIntArray7901[i_965_]) * i_972_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7901[i_965_] = i_974_;
							}
							((Class387_Sub3) this).anIntArray7901[i_965_] += anInt7902;
							((Class387_Sub3) this).anIntArray7895[i_965_] += anInt7937;
							((Class387_Sub3) this).anIntArray7965[i_965_] += anInt7956;
						}
					} else {
						for (int i_975_ = 0; i_975_ < is_963_.length; i_975_++) {
							int i_976_ = is_963_[i_975_];
							((Class387_Sub3) this).anIntArray7901[i_976_] -= anInt7902;
							((Class387_Sub3) this).anIntArray7895[i_976_] -= anInt7937;
							((Class387_Sub3) this).anIntArray7965[i_976_] -= anInt7956;
							if (i_945_ != 0) {
								int i_977_ = Class220.anIntArray2483[i_945_];
								int i_978_ = Class220.anIntArray2474[i_945_];
								int i_979_ = (((((Class387_Sub3) this).anIntArray7895[i_976_]) * i_978_ - (((Class387_Sub3) this).anIntArray7965[i_976_]) * i_977_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray7965[i_976_] = ((((Class387_Sub3) this).anIntArray7895[i_976_]) * i_977_ + (((Class387_Sub3) this).anIntArray7965[i_976_]) * i_978_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7895[i_976_] = i_979_;
							}
							if (i_947_ != 0) {
								int i_980_ = Class220.anIntArray2483[i_947_];
								int i_981_ = Class220.anIntArray2474[i_947_];
								int i_982_ = (((((Class387_Sub3) this).anIntArray7895[i_976_]) * i_980_ + (((Class387_Sub3) this).anIntArray7901[i_976_]) * i_981_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray7895[i_976_] = ((((Class387_Sub3) this).anIntArray7895[i_976_]) * i_981_ - (((Class387_Sub3) this).anIntArray7901[i_976_]) * i_980_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7901[i_976_] = i_982_;
							}
							if (i_946_ != 0) {
								int i_983_ = Class220.anIntArray2483[i_946_];
								int i_984_ = Class220.anIntArray2474[i_946_];
								int i_985_ = (((((Class387_Sub3) this).anIntArray7965[i_976_]) * i_983_ + (((Class387_Sub3) this).anIntArray7901[i_976_]) * i_984_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray7965[i_976_] = ((((Class387_Sub3) this).anIntArray7965[i_976_]) * i_984_ - (((Class387_Sub3) this).anIntArray7901[i_976_]) * i_983_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray7901[i_976_] = i_985_;
							}
							((Class387_Sub3) this).anIntArray7901[i_976_] += anInt7902;
							((Class387_Sub3) this).anIntArray7895[i_976_] += anInt7937;
							((Class387_Sub3) this).anIntArray7965[i_976_] += anInt7956;
						}
					}
				}
			}
			if (bool) {
				for (int i_986_ = 0; i_986_ < i_949_; i_986_++) {
					int i_987_ = is[i_986_];
					if (i_987_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_988_ = (((Class387_Sub3) this).anIntArrayArray7918[i_987_]);
						for (int i_989_ = 0; i_989_ < is_988_.length; i_989_++) {
							int i_990_ = is_988_[i_989_];
							int i_991_ = (((Class387_Sub3) this).anIntArray7947[i_990_]);
							int i_992_ = (((Class387_Sub3) this).anIntArray7947[i_990_ + 1]);
							for (int i_993_ = i_991_; i_993_ < i_992_; i_993_++) {
								int i_994_ = ((((Class387_Sub3) this).aShortArray7948[i_993_]) - 1);
								if (i_994_ == -1)
									break;
								if (i_947_ != 0) {
									int i_995_ = Class220.anIntArray2483[i_947_];
									int i_996_ = Class220.anIntArray2474[i_947_];
									int i_997_ = (((((Class387_Sub3) this).aShortArray7910[i_994_]) * i_995_ + ((((Class387_Sub3) this).aShortArray7909[i_994_]) * i_996_) + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7910[i_994_] = (short) ((((((Class387_Sub3) this).aShortArray7910[i_994_]) * i_996_) - (((Class387_Sub3) this).aShortArray7909[i_994_]) * i_995_ + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7909[i_994_] = (short) i_997_;
								}
								if (i_945_ != 0) {
									int i_998_ = Class220.anIntArray2483[i_945_];
									int i_999_ = Class220.anIntArray2474[i_945_];
									int i_1000_ = (((((Class387_Sub3) this).aShortArray7910[i_994_]) * i_999_ - ((((Class387_Sub3) this).aShortArray7919[i_994_]) * i_998_) + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7919[i_994_] = (short) ((((((Class387_Sub3) this).aShortArray7910[i_994_]) * i_998_) + (((Class387_Sub3) this).aShortArray7919[i_994_]) * i_999_ + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7910[i_994_] = (short) i_1000_;
								}
								if (i_946_ != 0) {
									int i_1001_ = Class220.anIntArray2483[i_946_];
									int i_1002_ = Class220.anIntArray2474[i_946_];
									int i_1003_ = ((((Class387_Sub3) this).aShortArray7919[i_994_]) * i_1001_ + ((((Class387_Sub3) this).aShortArray7909[i_994_]) * i_1002_) + 16383) >> 14;
									((Class387_Sub3) this).aShortArray7919[i_994_] = (short) ((((((Class387_Sub3) this).aShortArray7919[i_994_]) * i_1002_) - (((Class387_Sub3) this).aShortArray7909[i_994_]) * i_1001_ + 16383) >> 14);
									((Class387_Sub3) this).aShortArray7909[i_994_] = (short) i_1003_;
								}
							}
						}
					}
				}
				method4839();
			}
		} else if (i == 3) {
			for (int i_1004_ = 0; i_1004_ < i_949_; i_1004_++) {
				int i_1005_ = is[i_1004_];
				if (i_1005_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_1006_ = ((Class387_Sub3) this).anIntArrayArray7918[i_1005_];
					for (int i_1007_ = 0; i_1007_ < is_1006_.length; i_1007_++) {
						int i_1008_ = is_1006_[i_1007_];
						((Class387_Sub3) this).anIntArray7901[i_1008_] -= anInt7902;
						((Class387_Sub3) this).anIntArray7895[i_1008_] -= anInt7937;
						((Class387_Sub3) this).anIntArray7965[i_1008_] -= anInt7956;
						((Class387_Sub3) this).anIntArray7901[i_1008_] = (((Class387_Sub3) this).anIntArray7901[i_1008_] * i_945_) >> 7;
						((Class387_Sub3) this).anIntArray7895[i_1008_] = (((Class387_Sub3) this).anIntArray7895[i_1008_] * i_946_) >> 7;
						((Class387_Sub3) this).anIntArray7965[i_1008_] = (((Class387_Sub3) this).anIntArray7965[i_1008_] * i_947_) >> 7;
						((Class387_Sub3) this).anIntArray7901[i_1008_] += anInt7902;
						((Class387_Sub3) this).anIntArray7895[i_1008_] += anInt7937;
						((Class387_Sub3) this).anIntArray7965[i_1008_] += anInt7956;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub3) this).anIntArrayArray7924 != null) {
				boolean bool_1009_ = false;
				for (int i_1010_ = 0; i_1010_ < i_949_; i_1010_++) {
					int i_1011_ = is[i_1010_];
					if (i_1011_ < ((Class387_Sub3) this).anIntArrayArray7924.length) {
						int[] is_1012_ = (((Class387_Sub3) this).anIntArrayArray7924[i_1011_]);
						for (int i_1013_ = 0; i_1013_ < is_1012_.length; i_1013_++) {
							int i_1014_ = is_1012_[i_1013_];
							int i_1015_ = (((((Class387_Sub3) this).aByteArray7963[i_1014_]) & 0xff) + i_945_ * 8);
							if (i_1015_ < 0)
								i_1015_ = 0;
							else if (i_1015_ > 255)
								i_1015_ = 255;
							((Class387_Sub3) this).aByteArray7963[i_1014_] = (byte) i_1015_;
						}
						bool_1009_ = bool_1009_ | is_1012_.length > 0;
					}
				}
				if (bool_1009_) {
					if (((Class387_Sub3) this).aClass191Array7952 != null) {
						for (int i_1016_ = 0; i_1016_ < ((Class387_Sub3) this).anInt7951; i_1016_++) {
							Class191 class191 = (((Class387_Sub3) this).aClass191Array7952[i_1016_]);
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[i_1016_]);
							((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & 0xffffff | 255 - ((((Class387_Sub3) this).aByteArray7963[((Class191) class191).anInt1947]) & 0xff) << 24);
						}
					}
					method4838();
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub3) this).anIntArrayArray7924 != null) {
				boolean bool_1017_ = false;
				for (int i_1018_ = 0; i_1018_ < i_949_; i_1018_++) {
					int i_1019_ = is[i_1018_];
					if (i_1019_ < ((Class387_Sub3) this).anIntArrayArray7924.length) {
						int[] is_1020_ = (((Class387_Sub3) this).anIntArrayArray7924[i_1019_]);
						for (int i_1021_ = 0; i_1021_ < is_1020_.length; i_1021_++) {
							int i_1022_ = is_1020_[i_1021_];
							int i_1023_ = ((((Class387_Sub3) this).aShortArray7935[i_1022_]) & 0xffff);
							int i_1024_ = i_1023_ >> 10 & 0x3f;
							int i_1025_ = i_1023_ >> 7 & 0x7;
							int i_1026_ = i_1023_ & 0x7f;
							i_1024_ = i_1024_ + i_945_ & 0x3f;
							i_1025_ += i_946_ / 4;
							if (i_1025_ < 0)
								i_1025_ = 0;
							else if (i_1025_ > 7)
								i_1025_ = 7;
							i_1026_ += i_947_;
							if (i_1026_ < 0)
								i_1026_ = 0;
							else if (i_1026_ > 127)
								i_1026_ = 127;
							((Class387_Sub3) this).aShortArray7935[i_1022_] = (short) (i_1024_ << 10 | i_1025_ << 7 | i_1026_);
						}
						bool_1017_ = bool_1017_ | is_1020_.length > 0;
					}
				}
				if (bool_1017_) {
					if (((Class387_Sub3) this).aClass191Array7952 != null) {
						for (int i_1027_ = 0; i_1027_ < ((Class387_Sub3) this).anInt7951; i_1027_++) {
							Class191 class191 = (((Class387_Sub3) this).aClass191Array7952[i_1027_]);
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[i_1027_]);
							((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | (Class294.anIntArray3165[((((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff)]) & 0xffffff);
						}
					}
					method4838();
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_1028_ = 0; i_1028_ < i_949_; i_1028_++) {
					int i_1029_ = is[i_1028_];
					if (i_1029_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_1030_ = (((Class387_Sub3) this).anIntArrayArray7946[i_1029_]);
						for (int i_1031_ = 0; i_1031_ < is_1030_.length; i_1031_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_1030_[i_1031_]]);
							((Class166) class166).anInt1704 += i_945_;
							((Class166) class166).anInt1705 += i_946_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_1032_ = 0; i_1032_ < i_949_; i_1032_++) {
					int i_1033_ = is[i_1032_];
					if (i_1033_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_1034_ = (((Class387_Sub3) this).anIntArrayArray7946[i_1033_]);
						for (int i_1035_ = 0; i_1035_ < is_1034_.length; i_1035_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_1034_[i_1035_]]);
							((Class166) class166).anInt1702 = (((Class166) class166).anInt1702 * i_945_ >> 7);
							((Class166) class166).anInt1701 = (((Class166) class166).anInt1701 * i_946_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_1036_ = 0; i_1036_ < i_949_; i_1036_++) {
					int i_1037_ = is[i_1036_];
					if (i_1037_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_1038_ = (((Class387_Sub3) this).anIntArrayArray7946[i_1037_]);
						for (int i_1039_ = 0; i_1039_ < is_1038_.length; i_1039_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_1038_[i_1039_]]);
							((Class166) class166).anInt1706 = (((Class166) class166).anInt1706 + i_945_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void method4751(Matrix3f class222) {
		Matrix4f class233 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236;
		class233.method2145(class222);
		if (((Class387_Sub3) this).aClass85Array7949 != null) {
			for (int i = 0; i < ((Class387_Sub3) this).aClass85Array7949.length; i++) {
				Class85 class85 = ((Class387_Sub3) this).aClass85Array7949[i];
				Class85 class85_1040_ = class85;
				if (class85.aClass85_776 != null)
					class85_1040_ = class85.aClass85_776;
				class85_1040_.anInt777 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt773 * -710317103)])))) * -1879868075);
				class85_1040_.anInt783 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt773 * -710317103)])))) * -2041556771);
				class85_1040_.anInt779 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt773 * -710317103)])))) * -1434499227);
				class85_1040_.anInt772 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt774 * 1705862021)])))) * 1070341177);
				class85_1040_.anInt781 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt774 * 1705862021)])))) * 1802851857);
				class85_1040_.anInt782 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt774 * 1705862021)])))) * 103846281;
				class85_1040_.anInt771 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt775 * 1636170731)])))) * -2103324039);
				class85_1040_.anInt784 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt775 * 1636170731)])))) * -526039059);
				class85_1040_.anInt785 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt775 * 1636170731)])))) * 491030489;
			}
		}
		if (((Class387_Sub3) this).aClass68Array7904 != null) {
			for (int i = 0; i < ((Class387_Sub3) this).aClass68Array7904.length; i++) {
				Class68 class68 = ((Class387_Sub3) this).aClass68Array7904[i];
				Class68 class68_1041_ = class68;
				if (class68.aClass68_672 != null)
					class68_1041_ = class68.aClass68_672;
				if (class68.aClass233_677 != null)
					class68.aClass233_677.method2142(class233);
				else
					class68.aClass233_677 = new Matrix4f(class233);
				class68_1041_.anInt671 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class68.anInt674 * -180596249)])))) * -1436341053);
				class68_1041_.anInt675 = (int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class68.anInt674 * -180596249)])))) * 449866009;
				class68_1041_.anInt676 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class68.anInt674 * -180596249)])))) * 1336328763);
			}
		}
	}

	void cj(int i, int[] is, int i_1042_, int i_1043_, int i_1044_, boolean bool, int i_1045_, int[] is_1046_) {
		int i_1047_ = is.length;
		if (i == 0) {
			i_1042_ <<= 4;
			i_1043_ <<= 4;
			i_1044_ <<= 4;
			int i_1048_ = 0;
			anInt7902 = 0;
			anInt7937 = 0;
			anInt7956 = 0;
			for (int i_1049_ = 0; i_1049_ < i_1047_; i_1049_++) {
				int i_1050_ = is[i_1049_];
				if (i_1050_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_1051_ = ((Class387_Sub3) this).anIntArrayArray7918[i_1050_];
					for (int i_1052_ = 0; i_1052_ < is_1051_.length; i_1052_++) {
						int i_1053_ = is_1051_[i_1052_];
						if (((Class387_Sub3) this).aShortArray7964 == null || (i_1045_ & (((Class387_Sub3) this).aShortArray7964[i_1053_])) != 0) {
							anInt7902 += (((Class387_Sub3) this).anIntArray7901[i_1053_]);
							anInt7937 += (((Class387_Sub3) this).anIntArray7895[i_1053_]);
							anInt7956 += (((Class387_Sub3) this).anIntArray7965[i_1053_]);
							i_1048_++;
						}
					}
				}
			}
			if (i_1048_ > 0) {
				anInt7902 = anInt7902 / i_1048_ + i_1042_;
				anInt7937 = anInt7937 / i_1048_ + i_1043_;
				anInt7956 = anInt7956 / i_1048_ + i_1044_;
				aBoolean7905 = true;
			} else {
				anInt7902 = i_1042_;
				anInt7937 = i_1043_;
				anInt7956 = i_1044_;
			}
		} else if (i == 1) {
			if (is_1046_ != null) {
				int i_1054_ = ((is_1046_[0] * i_1042_ + is_1046_[1] * i_1043_ + is_1046_[2] * i_1044_ + 8192) >> 14);
				int i_1055_ = ((is_1046_[3] * i_1042_ + is_1046_[4] * i_1043_ + is_1046_[5] * i_1044_ + 8192) >> 14);
				int i_1056_ = ((is_1046_[6] * i_1042_ + is_1046_[7] * i_1043_ + is_1046_[8] * i_1044_ + 8192) >> 14);
				i_1042_ = i_1054_;
				i_1043_ = i_1055_;
				i_1044_ = i_1056_;
			}
			i_1042_ <<= 4;
			i_1043_ <<= 4;
			i_1044_ <<= 4;
			for (int i_1057_ = 0; i_1057_ < i_1047_; i_1057_++) {
				int i_1058_ = is[i_1057_];
				if (i_1058_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_1059_ = ((Class387_Sub3) this).anIntArrayArray7918[i_1058_];
					for (int i_1060_ = 0; i_1060_ < is_1059_.length; i_1060_++) {
						int i_1061_ = is_1059_[i_1060_];
						if (((Class387_Sub3) this).aShortArray7964 == null || (i_1045_ & (((Class387_Sub3) this).aShortArray7964[i_1061_])) != 0) {
							((Class387_Sub3) this).anIntArray7901[i_1061_] += i_1042_;
							((Class387_Sub3) this).anIntArray7895[i_1061_] += i_1043_;
							((Class387_Sub3) this).anIntArray7965[i_1061_] += i_1044_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1046_ != null) {
				int i_1062_ = is_1046_[9] << 4;
				int i_1063_ = is_1046_[10] << 4;
				int i_1064_ = is_1046_[11] << 4;
				int i_1065_ = is_1046_[12] << 4;
				int i_1066_ = is_1046_[13] << 4;
				int i_1067_ = is_1046_[14] << 4;
				if (aBoolean7905) {
					int i_1068_ = ((is_1046_[0] * anInt7902 + is_1046_[3] * anInt7937 + is_1046_[6] * anInt7956 + 8192) >> 14);
					int i_1069_ = ((is_1046_[1] * anInt7902 + is_1046_[4] * anInt7937 + is_1046_[7] * anInt7956 + 8192) >> 14);
					int i_1070_ = ((is_1046_[2] * anInt7902 + is_1046_[5] * anInt7937 + is_1046_[8] * anInt7956 + 8192) >> 14);
					i_1068_ += i_1065_;
					i_1069_ += i_1066_;
					i_1070_ += i_1067_;
					anInt7902 = i_1068_;
					anInt7937 = i_1069_;
					anInt7956 = i_1070_;
					aBoolean7905 = false;
				}
				int[] is_1071_ = new int[9];
				int i_1072_ = Class220.anIntArray2474[i_1042_];
				int i_1073_ = Class220.anIntArray2483[i_1042_];
				int i_1074_ = Class220.anIntArray2474[i_1043_];
				int i_1075_ = Class220.anIntArray2483[i_1043_];
				int i_1076_ = Class220.anIntArray2474[i_1044_];
				int i_1077_ = Class220.anIntArray2483[i_1044_];
				int i_1078_ = i_1073_ * i_1076_ + 8192 >> 14;
				int i_1079_ = i_1073_ * i_1077_ + 8192 >> 14;
				is_1071_[0] = i_1074_ * i_1076_ + i_1075_ * i_1079_ + 8192 >> 14;
				is_1071_[1] = -i_1074_ * i_1077_ + i_1075_ * i_1078_ + 8192 >> 14;
				is_1071_[2] = i_1075_ * i_1072_ + 8192 >> 14;
				is_1071_[3] = i_1072_ * i_1077_ + 8192 >> 14;
				is_1071_[4] = i_1072_ * i_1076_ + 8192 >> 14;
				is_1071_[5] = -i_1073_;
				is_1071_[6] = -i_1075_ * i_1076_ + i_1074_ * i_1079_ + 8192 >> 14;
				is_1071_[7] = i_1075_ * i_1077_ + i_1074_ * i_1078_ + 8192 >> 14;
				is_1071_[8] = i_1074_ * i_1072_ + 8192 >> 14;
				int i_1080_ = ((is_1071_[0] * -anInt7902 + is_1071_[1] * -anInt7937 + is_1071_[2] * -anInt7956 + 8192) >> 14);
				int i_1081_ = ((is_1071_[3] * -anInt7902 + is_1071_[4] * -anInt7937 + is_1071_[5] * -anInt7956 + 8192) >> 14);
				int i_1082_ = ((is_1071_[6] * -anInt7902 + is_1071_[7] * -anInt7937 + is_1071_[8] * -anInt7956 + 8192) >> 14);
				int i_1083_ = i_1080_ + anInt7902;
				int i_1084_ = i_1081_ + anInt7937;
				int i_1085_ = i_1082_ + anInt7956;
				int[] is_1086_ = new int[9];
				for (int i_1087_ = 0; i_1087_ < 3; i_1087_++) {
					for (int i_1088_ = 0; i_1088_ < 3; i_1088_++) {
						int i_1089_ = 0;
						for (int i_1090_ = 0; i_1090_ < 3; i_1090_++)
							i_1089_ += (is_1071_[i_1087_ * 3 + i_1090_] * is_1046_[i_1088_ * 3 + i_1090_]);
						is_1086_[i_1087_ * 3 + i_1088_] = i_1089_ + 8192 >> 14;
					}
				}
				int i_1091_ = ((is_1071_[0] * i_1065_ + is_1071_[1] * i_1066_ + is_1071_[2] * i_1067_ + 8192) >> 14);
				int i_1092_ = ((is_1071_[3] * i_1065_ + is_1071_[4] * i_1066_ + is_1071_[5] * i_1067_ + 8192) >> 14);
				int i_1093_ = ((is_1071_[6] * i_1065_ + is_1071_[7] * i_1066_ + is_1071_[8] * i_1067_ + 8192) >> 14);
				i_1091_ += i_1083_;
				i_1092_ += i_1084_;
				i_1093_ += i_1085_;
				int[] is_1094_ = new int[9];
				for (int i_1095_ = 0; i_1095_ < 3; i_1095_++) {
					for (int i_1096_ = 0; i_1096_ < 3; i_1096_++) {
						int i_1097_ = 0;
						for (int i_1098_ = 0; i_1098_ < 3; i_1098_++)
							i_1097_ += (is_1046_[i_1095_ * 3 + i_1098_] * is_1086_[i_1096_ + i_1098_ * 3]);
						is_1094_[i_1095_ * 3 + i_1096_] = i_1097_ + 8192 >> 14;
					}
				}
				int i_1099_ = ((is_1046_[0] * i_1091_ + is_1046_[1] * i_1092_ + is_1046_[2] * i_1093_ + 8192) >> 14);
				int i_1100_ = ((is_1046_[3] * i_1091_ + is_1046_[4] * i_1092_ + is_1046_[5] * i_1093_ + 8192) >> 14);
				int i_1101_ = ((is_1046_[6] * i_1091_ + is_1046_[7] * i_1092_ + is_1046_[8] * i_1093_ + 8192) >> 14);
				i_1099_ += i_1062_;
				i_1100_ += i_1063_;
				i_1101_ += i_1064_;
				for (int i_1102_ = 0; i_1102_ < i_1047_; i_1102_++) {
					int i_1103_ = is[i_1102_];
					if (i_1103_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_1104_ = (((Class387_Sub3) this).anIntArrayArray7918[i_1103_]);
						for (int i_1105_ = 0; i_1105_ < is_1104_.length; i_1105_++) {
							int i_1106_ = is_1104_[i_1105_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_1045_ & (((Class387_Sub3) this).aShortArray7964[i_1106_])) != 0)) {
								int i_1107_ = (is_1094_[0] * (((Class387_Sub3) this).anIntArray7901[i_1106_]) + is_1094_[1] * (((Class387_Sub3) this).anIntArray7895[i_1106_]) + is_1094_[2] * (((Class387_Sub3) this).anIntArray7965[i_1106_]) + 8192) >> 14;
								int i_1108_ = (is_1094_[3] * (((Class387_Sub3) this).anIntArray7901[i_1106_]) + is_1094_[4] * (((Class387_Sub3) this).anIntArray7895[i_1106_]) + is_1094_[5] * (((Class387_Sub3) this).anIntArray7965[i_1106_]) + 8192) >> 14;
								int i_1109_ = (is_1094_[6] * (((Class387_Sub3) this).anIntArray7901[i_1106_]) + is_1094_[7] * (((Class387_Sub3) this).anIntArray7895[i_1106_]) + is_1094_[8] * (((Class387_Sub3) this).anIntArray7965[i_1106_]) + 8192) >> 14;
								i_1107_ += i_1099_;
								i_1108_ += i_1100_;
								i_1109_ += i_1101_;
								((Class387_Sub3) this).anIntArray7901[i_1106_] = i_1107_;
								((Class387_Sub3) this).anIntArray7895[i_1106_] = i_1108_;
								((Class387_Sub3) this).anIntArray7965[i_1106_] = i_1109_;
							}
						}
					}
				}
			} else {
				for (int i_1110_ = 0; i_1110_ < i_1047_; i_1110_++) {
					int i_1111_ = is[i_1110_];
					if (i_1111_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_1112_ = (((Class387_Sub3) this).anIntArrayArray7918[i_1111_]);
						for (int i_1113_ = 0; i_1113_ < is_1112_.length; i_1113_++) {
							int i_1114_ = is_1112_[i_1113_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_1045_ & (((Class387_Sub3) this).aShortArray7964[i_1114_])) != 0)) {
								((Class387_Sub3) this).anIntArray7901[i_1114_] -= anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_1114_] -= anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_1114_] -= anInt7956;
								if (i_1044_ != 0) {
									int i_1115_ = Class220.anIntArray2483[i_1044_];
									int i_1116_ = Class220.anIntArray2474[i_1044_];
									int i_1117_ = ((((Class387_Sub3) this).anIntArray7895[i_1114_]) * i_1115_ + ((((Class387_Sub3) this).anIntArray7901[i_1114_]) * i_1116_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7895[i_1114_] = ((((Class387_Sub3) this).anIntArray7895[i_1114_]) * i_1116_ - ((((Class387_Sub3) this).anIntArray7901[i_1114_]) * i_1115_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7901[i_1114_] = i_1117_;
								}
								if (i_1042_ != 0) {
									int i_1118_ = Class220.anIntArray2483[i_1042_];
									int i_1119_ = Class220.anIntArray2474[i_1042_];
									int i_1120_ = ((((Class387_Sub3) this).anIntArray7895[i_1114_]) * i_1119_ - ((((Class387_Sub3) this).anIntArray7965[i_1114_]) * i_1118_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7965[i_1114_] = ((((Class387_Sub3) this).anIntArray7895[i_1114_]) * i_1118_ + ((((Class387_Sub3) this).anIntArray7965[i_1114_]) * i_1119_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7895[i_1114_] = i_1120_;
								}
								if (i_1043_ != 0) {
									int i_1121_ = Class220.anIntArray2483[i_1043_];
									int i_1122_ = Class220.anIntArray2474[i_1043_];
									int i_1123_ = ((((Class387_Sub3) this).anIntArray7965[i_1114_]) * i_1121_ + ((((Class387_Sub3) this).anIntArray7901[i_1114_]) * i_1122_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7965[i_1114_] = ((((Class387_Sub3) this).anIntArray7965[i_1114_]) * i_1122_ - ((((Class387_Sub3) this).anIntArray7901[i_1114_]) * i_1121_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7901[i_1114_] = i_1123_;
								}
								((Class387_Sub3) this).anIntArray7901[i_1114_] += anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_1114_] += anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_1114_] += anInt7956;
							}
						}
					}
				}
				if (bool) {
					for (int i_1124_ = 0; i_1124_ < i_1047_; i_1124_++) {
						int i_1125_ = is[i_1124_];
						if (i_1125_ < (((Class387_Sub3) this).anIntArrayArray7918).length) {
							int[] is_1126_ = (((Class387_Sub3) this).anIntArrayArray7918[i_1125_]);
							for (int i_1127_ = 0; i_1127_ < is_1126_.length; i_1127_++) {
								int i_1128_ = is_1126_[i_1127_];
								if ((((Class387_Sub3) this).aShortArray7964 == null) || ((i_1045_ & (((Class387_Sub3) this).aShortArray7964[i_1128_])) != 0)) {
									int i_1129_ = (((Class387_Sub3) this).anIntArray7947[i_1128_]);
									int i_1130_ = (((Class387_Sub3) this).anIntArray7947[i_1128_ + 1]);
									for (int i_1131_ = i_1129_; i_1131_ < i_1130_; i_1131_++) {
										int i_1132_ = ((((Class387_Sub3) this).aShortArray7948[i_1131_]) - 1);
										if (i_1132_ == -1)
											break;
										if (i_1044_ != 0) {
											int i_1133_ = (Class220.anIntArray2483[i_1044_]);
											int i_1134_ = (Class220.anIntArray2474[i_1044_]);
											int i_1135_ = (((((Class387_Sub3) this).aShortArray7910[i_1132_]) * i_1133_ + (((Class387_Sub3) this).aShortArray7909[i_1132_]) * i_1134_ + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7910[i_1132_] = (short) ((((((Class387_Sub3) this).aShortArray7910[i_1132_]) * i_1134_) - ((((Class387_Sub3) this).aShortArray7909[i_1132_]) * i_1133_) + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7909[i_1132_] = (short) i_1135_;
										}
										if (i_1042_ != 0) {
											int i_1136_ = (Class220.anIntArray2483[i_1042_]);
											int i_1137_ = (Class220.anIntArray2474[i_1042_]);
											int i_1138_ = (((((Class387_Sub3) this).aShortArray7910[i_1132_]) * i_1137_ - (((Class387_Sub3) this).aShortArray7919[i_1132_]) * i_1136_ + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7919[i_1132_] = (short) ((((((Class387_Sub3) this).aShortArray7910[i_1132_]) * i_1136_) + ((((Class387_Sub3) this).aShortArray7919[i_1132_]) * i_1137_) + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7910[i_1132_] = (short) i_1138_;
										}
										if (i_1043_ != 0) {
											int i_1139_ = (Class220.anIntArray2483[i_1043_]);
											int i_1140_ = (Class220.anIntArray2474[i_1043_]);
											int i_1141_ = (((((Class387_Sub3) this).aShortArray7919[i_1132_]) * i_1139_ + (((Class387_Sub3) this).aShortArray7909[i_1132_]) * i_1140_ + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7919[i_1132_] = (short) ((((((Class387_Sub3) this).aShortArray7919[i_1132_]) * i_1140_) - ((((Class387_Sub3) this).aShortArray7909[i_1132_]) * i_1139_) + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7909[i_1132_] = (short) i_1141_;
										}
									}
								}
							}
						}
					}
					method4839();
				}
			}
		} else if (i == 3) {
			if (is_1046_ != null) {
				int i_1142_ = is_1046_[9] << 4;
				int i_1143_ = is_1046_[10] << 4;
				int i_1144_ = is_1046_[11] << 4;
				int i_1145_ = is_1046_[12] << 4;
				int i_1146_ = is_1046_[13] << 4;
				int i_1147_ = is_1046_[14] << 4;
				if (aBoolean7905) {
					int i_1148_ = ((is_1046_[0] * anInt7902 + is_1046_[3] * anInt7937 + is_1046_[6] * anInt7956 + 8192) >> 14);
					int i_1149_ = ((is_1046_[1] * anInt7902 + is_1046_[4] * anInt7937 + is_1046_[7] * anInt7956 + 8192) >> 14);
					int i_1150_ = ((is_1046_[2] * anInt7902 + is_1046_[5] * anInt7937 + is_1046_[8] * anInt7956 + 8192) >> 14);
					i_1148_ += i_1145_;
					i_1149_ += i_1146_;
					i_1150_ += i_1147_;
					anInt7902 = i_1148_;
					anInt7937 = i_1149_;
					anInt7956 = i_1150_;
					aBoolean7905 = false;
				}
				int i_1151_ = i_1042_ << 15 >> 7;
				int i_1152_ = i_1043_ << 15 >> 7;
				int i_1153_ = i_1044_ << 15 >> 7;
				int i_1154_ = i_1151_ * -anInt7902 + 8192 >> 14;
				int i_1155_ = i_1152_ * -anInt7937 + 8192 >> 14;
				int i_1156_ = i_1153_ * -anInt7956 + 8192 >> 14;
				int i_1157_ = i_1154_ + anInt7902;
				int i_1158_ = i_1155_ + anInt7937;
				int i_1159_ = i_1156_ + anInt7956;
				int[] is_1160_ = new int[9];
				is_1160_[0] = i_1151_ * is_1046_[0] + 8192 >> 14;
				is_1160_[1] = i_1151_ * is_1046_[3] + 8192 >> 14;
				is_1160_[2] = i_1151_ * is_1046_[6] + 8192 >> 14;
				is_1160_[3] = i_1152_ * is_1046_[1] + 8192 >> 14;
				is_1160_[4] = i_1152_ * is_1046_[4] + 8192 >> 14;
				is_1160_[5] = i_1152_ * is_1046_[7] + 8192 >> 14;
				is_1160_[6] = i_1153_ * is_1046_[2] + 8192 >> 14;
				is_1160_[7] = i_1153_ * is_1046_[5] + 8192 >> 14;
				is_1160_[8] = i_1153_ * is_1046_[8] + 8192 >> 14;
				int i_1161_ = i_1151_ * i_1145_ + 8192 >> 14;
				int i_1162_ = i_1152_ * i_1146_ + 8192 >> 14;
				int i_1163_ = i_1153_ * i_1147_ + 8192 >> 14;
				i_1161_ += i_1157_;
				i_1162_ += i_1158_;
				i_1163_ += i_1159_;
				int[] is_1164_ = new int[9];
				for (int i_1165_ = 0; i_1165_ < 3; i_1165_++) {
					for (int i_1166_ = 0; i_1166_ < 3; i_1166_++) {
						int i_1167_ = 0;
						for (int i_1168_ = 0; i_1168_ < 3; i_1168_++)
							i_1167_ += (is_1046_[i_1165_ * 3 + i_1168_] * is_1160_[i_1166_ + i_1168_ * 3]);
						is_1164_[i_1165_ * 3 + i_1166_] = i_1167_ + 8192 >> 14;
					}
				}
				int i_1169_ = ((is_1046_[0] * i_1161_ + is_1046_[1] * i_1162_ + is_1046_[2] * i_1163_ + 8192) >> 14);
				int i_1170_ = ((is_1046_[3] * i_1161_ + is_1046_[4] * i_1162_ + is_1046_[5] * i_1163_ + 8192) >> 14);
				int i_1171_ = ((is_1046_[6] * i_1161_ + is_1046_[7] * i_1162_ + is_1046_[8] * i_1163_ + 8192) >> 14);
				i_1169_ += i_1142_;
				i_1170_ += i_1143_;
				i_1171_ += i_1144_;
				for (int i_1172_ = 0; i_1172_ < i_1047_; i_1172_++) {
					int i_1173_ = is[i_1172_];
					if (i_1173_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_1174_ = (((Class387_Sub3) this).anIntArrayArray7918[i_1173_]);
						for (int i_1175_ = 0; i_1175_ < is_1174_.length; i_1175_++) {
							int i_1176_ = is_1174_[i_1175_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_1045_ & (((Class387_Sub3) this).aShortArray7964[i_1176_])) != 0)) {
								int i_1177_ = (is_1164_[0] * (((Class387_Sub3) this).anIntArray7901[i_1176_]) + is_1164_[1] * (((Class387_Sub3) this).anIntArray7895[i_1176_]) + is_1164_[2] * (((Class387_Sub3) this).anIntArray7965[i_1176_]) + 8192) >> 14;
								int i_1178_ = (is_1164_[3] * (((Class387_Sub3) this).anIntArray7901[i_1176_]) + is_1164_[4] * (((Class387_Sub3) this).anIntArray7895[i_1176_]) + is_1164_[5] * (((Class387_Sub3) this).anIntArray7965[i_1176_]) + 8192) >> 14;
								int i_1179_ = (is_1164_[6] * (((Class387_Sub3) this).anIntArray7901[i_1176_]) + is_1164_[7] * (((Class387_Sub3) this).anIntArray7895[i_1176_]) + is_1164_[8] * (((Class387_Sub3) this).anIntArray7965[i_1176_]) + 8192) >> 14;
								i_1177_ += i_1169_;
								i_1178_ += i_1170_;
								i_1179_ += i_1171_;
								((Class387_Sub3) this).anIntArray7901[i_1176_] = i_1177_;
								((Class387_Sub3) this).anIntArray7895[i_1176_] = i_1178_;
								((Class387_Sub3) this).anIntArray7965[i_1176_] = i_1179_;
							}
						}
					}
				}
			} else {
				for (int i_1180_ = 0; i_1180_ < i_1047_; i_1180_++) {
					int i_1181_ = is[i_1180_];
					if (i_1181_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_1182_ = (((Class387_Sub3) this).anIntArrayArray7918[i_1181_]);
						for (int i_1183_ = 0; i_1183_ < is_1182_.length; i_1183_++) {
							int i_1184_ = is_1182_[i_1183_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_1045_ & (((Class387_Sub3) this).aShortArray7964[i_1184_])) != 0)) {
								((Class387_Sub3) this).anIntArray7901[i_1184_] -= anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_1184_] -= anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_1184_] -= anInt7956;
								((Class387_Sub3) this).anIntArray7901[i_1184_] = (((Class387_Sub3) this).anIntArray7901[i_1184_]) * i_1042_ >> 7;
								((Class387_Sub3) this).anIntArray7895[i_1184_] = (((Class387_Sub3) this).anIntArray7895[i_1184_]) * i_1043_ >> 7;
								((Class387_Sub3) this).anIntArray7965[i_1184_] = (((Class387_Sub3) this).anIntArray7965[i_1184_]) * i_1044_ >> 7;
								((Class387_Sub3) this).anIntArray7901[i_1184_] += anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_1184_] += anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_1184_] += anInt7956;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub3) this).anIntArrayArray7924 != null) {
				boolean bool_1185_ = false;
				for (int i_1186_ = 0; i_1186_ < i_1047_; i_1186_++) {
					int i_1187_ = is[i_1186_];
					if (i_1187_ < ((Class387_Sub3) this).anIntArrayArray7924.length) {
						int[] is_1188_ = (((Class387_Sub3) this).anIntArrayArray7924[i_1187_]);
						for (int i_1189_ = 0; i_1189_ < is_1188_.length; i_1189_++) {
							int i_1190_ = is_1188_[i_1189_];
							if (((Class387_Sub3) this).aShortArray7925 == null || ((i_1045_ & (((Class387_Sub3) this).aShortArray7925[i_1190_])) != 0)) {
								int i_1191_ = (((((Class387_Sub3) this).aByteArray7963[i_1190_]) & 0xff) + i_1042_ * 8);
								if (i_1191_ < 0)
									i_1191_ = 0;
								else if (i_1191_ > 255)
									i_1191_ = 255;
								((Class387_Sub3) this).aByteArray7963[i_1190_] = (byte) i_1191_;
							}
						}
						bool_1185_ = bool_1185_ | is_1188_.length > 0;
					}
				}
				if (bool_1185_) {
					if (((Class387_Sub3) this).aClass191Array7952 != null) {
						for (int i_1192_ = 0; i_1192_ < ((Class387_Sub3) this).anInt7951; i_1192_++) {
							Class191 class191 = (((Class387_Sub3) this).aClass191Array7952[i_1192_]);
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[i_1192_]);
							((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & 0xffffff | 255 - ((((Class387_Sub3) this).aByteArray7963[((Class191) class191).anInt1947]) & 0xff) << 24);
						}
					}
					method4838();
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub3) this).anIntArrayArray7924 != null) {
				boolean bool_1193_ = false;
				for (int i_1194_ = 0; i_1194_ < i_1047_; i_1194_++) {
					int i_1195_ = is[i_1194_];
					if (i_1195_ < ((Class387_Sub3) this).anIntArrayArray7924.length) {
						int[] is_1196_ = (((Class387_Sub3) this).anIntArrayArray7924[i_1195_]);
						for (int i_1197_ = 0; i_1197_ < is_1196_.length; i_1197_++) {
							int i_1198_ = is_1196_[i_1197_];
							if (((Class387_Sub3) this).aShortArray7925 == null || ((i_1045_ & (((Class387_Sub3) this).aShortArray7925[i_1198_])) != 0)) {
								int i_1199_ = ((((Class387_Sub3) this).aShortArray7935[i_1198_]) & 0xffff);
								int i_1200_ = i_1199_ >> 10 & 0x3f;
								int i_1201_ = i_1199_ >> 7 & 0x7;
								int i_1202_ = i_1199_ & 0x7f;
								i_1200_ = i_1200_ + i_1042_ & 0x3f;
								i_1201_ += i_1043_ / 4;
								if (i_1201_ < 0)
									i_1201_ = 0;
								else if (i_1201_ > 7)
									i_1201_ = 7;
								i_1202_ += i_1044_;
								if (i_1202_ < 0)
									i_1202_ = 0;
								else if (i_1202_ > 127)
									i_1202_ = 127;
								((Class387_Sub3) this).aShortArray7935[i_1198_] = (short) (i_1200_ << 10 | i_1201_ << 7 | i_1202_);
							}
						}
						bool_1193_ = bool_1193_ | is_1196_.length > 0;
					}
				}
				if (bool_1193_) {
					if (((Class387_Sub3) this).aClass191Array7952 != null) {
						for (int i_1203_ = 0; i_1203_ < ((Class387_Sub3) this).anInt7951; i_1203_++) {
							Class191 class191 = (((Class387_Sub3) this).aClass191Array7952[i_1203_]);
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[i_1203_]);
							((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | (Class294.anIntArray3165[((((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff)]) & 0xffffff);
						}
					}
					method4838();
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_1204_ = 0; i_1204_ < i_1047_; i_1204_++) {
					int i_1205_ = is[i_1204_];
					if (i_1205_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_1206_ = (((Class387_Sub3) this).anIntArrayArray7946[i_1205_]);
						for (int i_1207_ = 0; i_1207_ < is_1206_.length; i_1207_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_1206_[i_1207_]]);
							((Class166) class166).anInt1704 += i_1042_;
							((Class166) class166).anInt1705 += i_1043_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_1208_ = 0; i_1208_ < i_1047_; i_1208_++) {
					int i_1209_ = is[i_1208_];
					if (i_1209_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_1210_ = (((Class387_Sub3) this).anIntArrayArray7946[i_1209_]);
						for (int i_1211_ = 0; i_1211_ < is_1210_.length; i_1211_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_1210_[i_1211_]]);
							((Class166) class166).anInt1702 = (((Class166) class166).anInt1702 * i_1042_ >> 7);
							((Class166) class166).anInt1701 = (((Class166) class166).anInt1701 * i_1043_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_1212_ = 0; i_1212_ < i_1047_; i_1212_++) {
					int i_1213_ = is[i_1212_];
					if (i_1213_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_1214_ = (((Class387_Sub3) this).anIntArrayArray7946[i_1213_]);
						for (int i_1215_ = 0; i_1215_ < is_1214_.length; i_1215_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_1214_[i_1215_]]);
							((Class166) class166).anInt1706 = (((Class166) class166).anInt1706 + i_1042_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void co(int i, int[] is, int i_1216_, int i_1217_, int i_1218_, boolean bool, int i_1219_, int[] is_1220_) {
		int i_1221_ = is.length;
		if (i == 0) {
			i_1216_ <<= 4;
			i_1217_ <<= 4;
			i_1218_ <<= 4;
			int i_1222_ = 0;
			anInt7902 = 0;
			anInt7937 = 0;
			anInt7956 = 0;
			for (int i_1223_ = 0; i_1223_ < i_1221_; i_1223_++) {
				int i_1224_ = is[i_1223_];
				if (i_1224_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_1225_ = ((Class387_Sub3) this).anIntArrayArray7918[i_1224_];
					for (int i_1226_ = 0; i_1226_ < is_1225_.length; i_1226_++) {
						int i_1227_ = is_1225_[i_1226_];
						if (((Class387_Sub3) this).aShortArray7964 == null || (i_1219_ & (((Class387_Sub3) this).aShortArray7964[i_1227_])) != 0) {
							anInt7902 += (((Class387_Sub3) this).anIntArray7901[i_1227_]);
							anInt7937 += (((Class387_Sub3) this).anIntArray7895[i_1227_]);
							anInt7956 += (((Class387_Sub3) this).anIntArray7965[i_1227_]);
							i_1222_++;
						}
					}
				}
			}
			if (i_1222_ > 0) {
				anInt7902 = anInt7902 / i_1222_ + i_1216_;
				anInt7937 = anInt7937 / i_1222_ + i_1217_;
				anInt7956 = anInt7956 / i_1222_ + i_1218_;
				aBoolean7905 = true;
			} else {
				anInt7902 = i_1216_;
				anInt7937 = i_1217_;
				anInt7956 = i_1218_;
			}
		} else if (i == 1) {
			if (is_1220_ != null) {
				int i_1228_ = ((is_1220_[0] * i_1216_ + is_1220_[1] * i_1217_ + is_1220_[2] * i_1218_ + 8192) >> 14);
				int i_1229_ = ((is_1220_[3] * i_1216_ + is_1220_[4] * i_1217_ + is_1220_[5] * i_1218_ + 8192) >> 14);
				int i_1230_ = ((is_1220_[6] * i_1216_ + is_1220_[7] * i_1217_ + is_1220_[8] * i_1218_ + 8192) >> 14);
				i_1216_ = i_1228_;
				i_1217_ = i_1229_;
				i_1218_ = i_1230_;
			}
			i_1216_ <<= 4;
			i_1217_ <<= 4;
			i_1218_ <<= 4;
			for (int i_1231_ = 0; i_1231_ < i_1221_; i_1231_++) {
				int i_1232_ = is[i_1231_];
				if (i_1232_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_1233_ = ((Class387_Sub3) this).anIntArrayArray7918[i_1232_];
					for (int i_1234_ = 0; i_1234_ < is_1233_.length; i_1234_++) {
						int i_1235_ = is_1233_[i_1234_];
						if (((Class387_Sub3) this).aShortArray7964 == null || (i_1219_ & (((Class387_Sub3) this).aShortArray7964[i_1235_])) != 0) {
							((Class387_Sub3) this).anIntArray7901[i_1235_] += i_1216_;
							((Class387_Sub3) this).anIntArray7895[i_1235_] += i_1217_;
							((Class387_Sub3) this).anIntArray7965[i_1235_] += i_1218_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1220_ != null) {
				int i_1236_ = is_1220_[9] << 4;
				int i_1237_ = is_1220_[10] << 4;
				int i_1238_ = is_1220_[11] << 4;
				int i_1239_ = is_1220_[12] << 4;
				int i_1240_ = is_1220_[13] << 4;
				int i_1241_ = is_1220_[14] << 4;
				if (aBoolean7905) {
					int i_1242_ = ((is_1220_[0] * anInt7902 + is_1220_[3] * anInt7937 + is_1220_[6] * anInt7956 + 8192) >> 14);
					int i_1243_ = ((is_1220_[1] * anInt7902 + is_1220_[4] * anInt7937 + is_1220_[7] * anInt7956 + 8192) >> 14);
					int i_1244_ = ((is_1220_[2] * anInt7902 + is_1220_[5] * anInt7937 + is_1220_[8] * anInt7956 + 8192) >> 14);
					i_1242_ += i_1239_;
					i_1243_ += i_1240_;
					i_1244_ += i_1241_;
					anInt7902 = i_1242_;
					anInt7937 = i_1243_;
					anInt7956 = i_1244_;
					aBoolean7905 = false;
				}
				int[] is_1245_ = new int[9];
				int i_1246_ = Class220.anIntArray2474[i_1216_];
				int i_1247_ = Class220.anIntArray2483[i_1216_];
				int i_1248_ = Class220.anIntArray2474[i_1217_];
				int i_1249_ = Class220.anIntArray2483[i_1217_];
				int i_1250_ = Class220.anIntArray2474[i_1218_];
				int i_1251_ = Class220.anIntArray2483[i_1218_];
				int i_1252_ = i_1247_ * i_1250_ + 8192 >> 14;
				int i_1253_ = i_1247_ * i_1251_ + 8192 >> 14;
				is_1245_[0] = i_1248_ * i_1250_ + i_1249_ * i_1253_ + 8192 >> 14;
				is_1245_[1] = -i_1248_ * i_1251_ + i_1249_ * i_1252_ + 8192 >> 14;
				is_1245_[2] = i_1249_ * i_1246_ + 8192 >> 14;
				is_1245_[3] = i_1246_ * i_1251_ + 8192 >> 14;
				is_1245_[4] = i_1246_ * i_1250_ + 8192 >> 14;
				is_1245_[5] = -i_1247_;
				is_1245_[6] = -i_1249_ * i_1250_ + i_1248_ * i_1253_ + 8192 >> 14;
				is_1245_[7] = i_1249_ * i_1251_ + i_1248_ * i_1252_ + 8192 >> 14;
				is_1245_[8] = i_1248_ * i_1246_ + 8192 >> 14;
				int i_1254_ = ((is_1245_[0] * -anInt7902 + is_1245_[1] * -anInt7937 + is_1245_[2] * -anInt7956 + 8192) >> 14);
				int i_1255_ = ((is_1245_[3] * -anInt7902 + is_1245_[4] * -anInt7937 + is_1245_[5] * -anInt7956 + 8192) >> 14);
				int i_1256_ = ((is_1245_[6] * -anInt7902 + is_1245_[7] * -anInt7937 + is_1245_[8] * -anInt7956 + 8192) >> 14);
				int i_1257_ = i_1254_ + anInt7902;
				int i_1258_ = i_1255_ + anInt7937;
				int i_1259_ = i_1256_ + anInt7956;
				int[] is_1260_ = new int[9];
				for (int i_1261_ = 0; i_1261_ < 3; i_1261_++) {
					for (int i_1262_ = 0; i_1262_ < 3; i_1262_++) {
						int i_1263_ = 0;
						for (int i_1264_ = 0; i_1264_ < 3; i_1264_++)
							i_1263_ += (is_1245_[i_1261_ * 3 + i_1264_] * is_1220_[i_1262_ * 3 + i_1264_]);
						is_1260_[i_1261_ * 3 + i_1262_] = i_1263_ + 8192 >> 14;
					}
				}
				int i_1265_ = ((is_1245_[0] * i_1239_ + is_1245_[1] * i_1240_ + is_1245_[2] * i_1241_ + 8192) >> 14);
				int i_1266_ = ((is_1245_[3] * i_1239_ + is_1245_[4] * i_1240_ + is_1245_[5] * i_1241_ + 8192) >> 14);
				int i_1267_ = ((is_1245_[6] * i_1239_ + is_1245_[7] * i_1240_ + is_1245_[8] * i_1241_ + 8192) >> 14);
				i_1265_ += i_1257_;
				i_1266_ += i_1258_;
				i_1267_ += i_1259_;
				int[] is_1268_ = new int[9];
				for (int i_1269_ = 0; i_1269_ < 3; i_1269_++) {
					for (int i_1270_ = 0; i_1270_ < 3; i_1270_++) {
						int i_1271_ = 0;
						for (int i_1272_ = 0; i_1272_ < 3; i_1272_++)
							i_1271_ += (is_1220_[i_1269_ * 3 + i_1272_] * is_1260_[i_1270_ + i_1272_ * 3]);
						is_1268_[i_1269_ * 3 + i_1270_] = i_1271_ + 8192 >> 14;
					}
				}
				int i_1273_ = ((is_1220_[0] * i_1265_ + is_1220_[1] * i_1266_ + is_1220_[2] * i_1267_ + 8192) >> 14);
				int i_1274_ = ((is_1220_[3] * i_1265_ + is_1220_[4] * i_1266_ + is_1220_[5] * i_1267_ + 8192) >> 14);
				int i_1275_ = ((is_1220_[6] * i_1265_ + is_1220_[7] * i_1266_ + is_1220_[8] * i_1267_ + 8192) >> 14);
				i_1273_ += i_1236_;
				i_1274_ += i_1237_;
				i_1275_ += i_1238_;
				for (int i_1276_ = 0; i_1276_ < i_1221_; i_1276_++) {
					int i_1277_ = is[i_1276_];
					if (i_1277_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_1278_ = (((Class387_Sub3) this).anIntArrayArray7918[i_1277_]);
						for (int i_1279_ = 0; i_1279_ < is_1278_.length; i_1279_++) {
							int i_1280_ = is_1278_[i_1279_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_1219_ & (((Class387_Sub3) this).aShortArray7964[i_1280_])) != 0)) {
								int i_1281_ = (is_1268_[0] * (((Class387_Sub3) this).anIntArray7901[i_1280_]) + is_1268_[1] * (((Class387_Sub3) this).anIntArray7895[i_1280_]) + is_1268_[2] * (((Class387_Sub3) this).anIntArray7965[i_1280_]) + 8192) >> 14;
								int i_1282_ = (is_1268_[3] * (((Class387_Sub3) this).anIntArray7901[i_1280_]) + is_1268_[4] * (((Class387_Sub3) this).anIntArray7895[i_1280_]) + is_1268_[5] * (((Class387_Sub3) this).anIntArray7965[i_1280_]) + 8192) >> 14;
								int i_1283_ = (is_1268_[6] * (((Class387_Sub3) this).anIntArray7901[i_1280_]) + is_1268_[7] * (((Class387_Sub3) this).anIntArray7895[i_1280_]) + is_1268_[8] * (((Class387_Sub3) this).anIntArray7965[i_1280_]) + 8192) >> 14;
								i_1281_ += i_1273_;
								i_1282_ += i_1274_;
								i_1283_ += i_1275_;
								((Class387_Sub3) this).anIntArray7901[i_1280_] = i_1281_;
								((Class387_Sub3) this).anIntArray7895[i_1280_] = i_1282_;
								((Class387_Sub3) this).anIntArray7965[i_1280_] = i_1283_;
							}
						}
					}
				}
			} else {
				for (int i_1284_ = 0; i_1284_ < i_1221_; i_1284_++) {
					int i_1285_ = is[i_1284_];
					if (i_1285_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_1286_ = (((Class387_Sub3) this).anIntArrayArray7918[i_1285_]);
						for (int i_1287_ = 0; i_1287_ < is_1286_.length; i_1287_++) {
							int i_1288_ = is_1286_[i_1287_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_1219_ & (((Class387_Sub3) this).aShortArray7964[i_1288_])) != 0)) {
								((Class387_Sub3) this).anIntArray7901[i_1288_] -= anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_1288_] -= anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_1288_] -= anInt7956;
								if (i_1218_ != 0) {
									int i_1289_ = Class220.anIntArray2483[i_1218_];
									int i_1290_ = Class220.anIntArray2474[i_1218_];
									int i_1291_ = ((((Class387_Sub3) this).anIntArray7895[i_1288_]) * i_1289_ + ((((Class387_Sub3) this).anIntArray7901[i_1288_]) * i_1290_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7895[i_1288_] = ((((Class387_Sub3) this).anIntArray7895[i_1288_]) * i_1290_ - ((((Class387_Sub3) this).anIntArray7901[i_1288_]) * i_1289_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7901[i_1288_] = i_1291_;
								}
								if (i_1216_ != 0) {
									int i_1292_ = Class220.anIntArray2483[i_1216_];
									int i_1293_ = Class220.anIntArray2474[i_1216_];
									int i_1294_ = ((((Class387_Sub3) this).anIntArray7895[i_1288_]) * i_1293_ - ((((Class387_Sub3) this).anIntArray7965[i_1288_]) * i_1292_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7965[i_1288_] = ((((Class387_Sub3) this).anIntArray7895[i_1288_]) * i_1292_ + ((((Class387_Sub3) this).anIntArray7965[i_1288_]) * i_1293_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7895[i_1288_] = i_1294_;
								}
								if (i_1217_ != 0) {
									int i_1295_ = Class220.anIntArray2483[i_1217_];
									int i_1296_ = Class220.anIntArray2474[i_1217_];
									int i_1297_ = ((((Class387_Sub3) this).anIntArray7965[i_1288_]) * i_1295_ + ((((Class387_Sub3) this).anIntArray7901[i_1288_]) * i_1296_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7965[i_1288_] = ((((Class387_Sub3) this).anIntArray7965[i_1288_]) * i_1296_ - ((((Class387_Sub3) this).anIntArray7901[i_1288_]) * i_1295_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7901[i_1288_] = i_1297_;
								}
								((Class387_Sub3) this).anIntArray7901[i_1288_] += anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_1288_] += anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_1288_] += anInt7956;
							}
						}
					}
				}
				if (bool) {
					for (int i_1298_ = 0; i_1298_ < i_1221_; i_1298_++) {
						int i_1299_ = is[i_1298_];
						if (i_1299_ < (((Class387_Sub3) this).anIntArrayArray7918).length) {
							int[] is_1300_ = (((Class387_Sub3) this).anIntArrayArray7918[i_1299_]);
							for (int i_1301_ = 0; i_1301_ < is_1300_.length; i_1301_++) {
								int i_1302_ = is_1300_[i_1301_];
								if ((((Class387_Sub3) this).aShortArray7964 == null) || ((i_1219_ & (((Class387_Sub3) this).aShortArray7964[i_1302_])) != 0)) {
									int i_1303_ = (((Class387_Sub3) this).anIntArray7947[i_1302_]);
									int i_1304_ = (((Class387_Sub3) this).anIntArray7947[i_1302_ + 1]);
									for (int i_1305_ = i_1303_; i_1305_ < i_1304_; i_1305_++) {
										int i_1306_ = ((((Class387_Sub3) this).aShortArray7948[i_1305_]) - 1);
										if (i_1306_ == -1)
											break;
										if (i_1218_ != 0) {
											int i_1307_ = (Class220.anIntArray2483[i_1218_]);
											int i_1308_ = (Class220.anIntArray2474[i_1218_]);
											int i_1309_ = (((((Class387_Sub3) this).aShortArray7910[i_1306_]) * i_1307_ + (((Class387_Sub3) this).aShortArray7909[i_1306_]) * i_1308_ + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7910[i_1306_] = (short) ((((((Class387_Sub3) this).aShortArray7910[i_1306_]) * i_1308_) - ((((Class387_Sub3) this).aShortArray7909[i_1306_]) * i_1307_) + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7909[i_1306_] = (short) i_1309_;
										}
										if (i_1216_ != 0) {
											int i_1310_ = (Class220.anIntArray2483[i_1216_]);
											int i_1311_ = (Class220.anIntArray2474[i_1216_]);
											int i_1312_ = (((((Class387_Sub3) this).aShortArray7910[i_1306_]) * i_1311_ - (((Class387_Sub3) this).aShortArray7919[i_1306_]) * i_1310_ + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7919[i_1306_] = (short) ((((((Class387_Sub3) this).aShortArray7910[i_1306_]) * i_1310_) + ((((Class387_Sub3) this).aShortArray7919[i_1306_]) * i_1311_) + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7910[i_1306_] = (short) i_1312_;
										}
										if (i_1217_ != 0) {
											int i_1313_ = (Class220.anIntArray2483[i_1217_]);
											int i_1314_ = (Class220.anIntArray2474[i_1217_]);
											int i_1315_ = (((((Class387_Sub3) this).aShortArray7919[i_1306_]) * i_1313_ + (((Class387_Sub3) this).aShortArray7909[i_1306_]) * i_1314_ + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7919[i_1306_] = (short) ((((((Class387_Sub3) this).aShortArray7919[i_1306_]) * i_1314_) - ((((Class387_Sub3) this).aShortArray7909[i_1306_]) * i_1313_) + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7909[i_1306_] = (short) i_1315_;
										}
									}
								}
							}
						}
					}
					method4839();
				}
			}
		} else if (i == 3) {
			if (is_1220_ != null) {
				int i_1316_ = is_1220_[9] << 4;
				int i_1317_ = is_1220_[10] << 4;
				int i_1318_ = is_1220_[11] << 4;
				int i_1319_ = is_1220_[12] << 4;
				int i_1320_ = is_1220_[13] << 4;
				int i_1321_ = is_1220_[14] << 4;
				if (aBoolean7905) {
					int i_1322_ = ((is_1220_[0] * anInt7902 + is_1220_[3] * anInt7937 + is_1220_[6] * anInt7956 + 8192) >> 14);
					int i_1323_ = ((is_1220_[1] * anInt7902 + is_1220_[4] * anInt7937 + is_1220_[7] * anInt7956 + 8192) >> 14);
					int i_1324_ = ((is_1220_[2] * anInt7902 + is_1220_[5] * anInt7937 + is_1220_[8] * anInt7956 + 8192) >> 14);
					i_1322_ += i_1319_;
					i_1323_ += i_1320_;
					i_1324_ += i_1321_;
					anInt7902 = i_1322_;
					anInt7937 = i_1323_;
					anInt7956 = i_1324_;
					aBoolean7905 = false;
				}
				int i_1325_ = i_1216_ << 15 >> 7;
				int i_1326_ = i_1217_ << 15 >> 7;
				int i_1327_ = i_1218_ << 15 >> 7;
				int i_1328_ = i_1325_ * -anInt7902 + 8192 >> 14;
				int i_1329_ = i_1326_ * -anInt7937 + 8192 >> 14;
				int i_1330_ = i_1327_ * -anInt7956 + 8192 >> 14;
				int i_1331_ = i_1328_ + anInt7902;
				int i_1332_ = i_1329_ + anInt7937;
				int i_1333_ = i_1330_ + anInt7956;
				int[] is_1334_ = new int[9];
				is_1334_[0] = i_1325_ * is_1220_[0] + 8192 >> 14;
				is_1334_[1] = i_1325_ * is_1220_[3] + 8192 >> 14;
				is_1334_[2] = i_1325_ * is_1220_[6] + 8192 >> 14;
				is_1334_[3] = i_1326_ * is_1220_[1] + 8192 >> 14;
				is_1334_[4] = i_1326_ * is_1220_[4] + 8192 >> 14;
				is_1334_[5] = i_1326_ * is_1220_[7] + 8192 >> 14;
				is_1334_[6] = i_1327_ * is_1220_[2] + 8192 >> 14;
				is_1334_[7] = i_1327_ * is_1220_[5] + 8192 >> 14;
				is_1334_[8] = i_1327_ * is_1220_[8] + 8192 >> 14;
				int i_1335_ = i_1325_ * i_1319_ + 8192 >> 14;
				int i_1336_ = i_1326_ * i_1320_ + 8192 >> 14;
				int i_1337_ = i_1327_ * i_1321_ + 8192 >> 14;
				i_1335_ += i_1331_;
				i_1336_ += i_1332_;
				i_1337_ += i_1333_;
				int[] is_1338_ = new int[9];
				for (int i_1339_ = 0; i_1339_ < 3; i_1339_++) {
					for (int i_1340_ = 0; i_1340_ < 3; i_1340_++) {
						int i_1341_ = 0;
						for (int i_1342_ = 0; i_1342_ < 3; i_1342_++)
							i_1341_ += (is_1220_[i_1339_ * 3 + i_1342_] * is_1334_[i_1340_ + i_1342_ * 3]);
						is_1338_[i_1339_ * 3 + i_1340_] = i_1341_ + 8192 >> 14;
					}
				}
				int i_1343_ = ((is_1220_[0] * i_1335_ + is_1220_[1] * i_1336_ + is_1220_[2] * i_1337_ + 8192) >> 14);
				int i_1344_ = ((is_1220_[3] * i_1335_ + is_1220_[4] * i_1336_ + is_1220_[5] * i_1337_ + 8192) >> 14);
				int i_1345_ = ((is_1220_[6] * i_1335_ + is_1220_[7] * i_1336_ + is_1220_[8] * i_1337_ + 8192) >> 14);
				i_1343_ += i_1316_;
				i_1344_ += i_1317_;
				i_1345_ += i_1318_;
				for (int i_1346_ = 0; i_1346_ < i_1221_; i_1346_++) {
					int i_1347_ = is[i_1346_];
					if (i_1347_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_1348_ = (((Class387_Sub3) this).anIntArrayArray7918[i_1347_]);
						for (int i_1349_ = 0; i_1349_ < is_1348_.length; i_1349_++) {
							int i_1350_ = is_1348_[i_1349_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_1219_ & (((Class387_Sub3) this).aShortArray7964[i_1350_])) != 0)) {
								int i_1351_ = (is_1338_[0] * (((Class387_Sub3) this).anIntArray7901[i_1350_]) + is_1338_[1] * (((Class387_Sub3) this).anIntArray7895[i_1350_]) + is_1338_[2] * (((Class387_Sub3) this).anIntArray7965[i_1350_]) + 8192) >> 14;
								int i_1352_ = (is_1338_[3] * (((Class387_Sub3) this).anIntArray7901[i_1350_]) + is_1338_[4] * (((Class387_Sub3) this).anIntArray7895[i_1350_]) + is_1338_[5] * (((Class387_Sub3) this).anIntArray7965[i_1350_]) + 8192) >> 14;
								int i_1353_ = (is_1338_[6] * (((Class387_Sub3) this).anIntArray7901[i_1350_]) + is_1338_[7] * (((Class387_Sub3) this).anIntArray7895[i_1350_]) + is_1338_[8] * (((Class387_Sub3) this).anIntArray7965[i_1350_]) + 8192) >> 14;
								i_1351_ += i_1343_;
								i_1352_ += i_1344_;
								i_1353_ += i_1345_;
								((Class387_Sub3) this).anIntArray7901[i_1350_] = i_1351_;
								((Class387_Sub3) this).anIntArray7895[i_1350_] = i_1352_;
								((Class387_Sub3) this).anIntArray7965[i_1350_] = i_1353_;
							}
						}
					}
				}
			} else {
				for (int i_1354_ = 0; i_1354_ < i_1221_; i_1354_++) {
					int i_1355_ = is[i_1354_];
					if (i_1355_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_1356_ = (((Class387_Sub3) this).anIntArrayArray7918[i_1355_]);
						for (int i_1357_ = 0; i_1357_ < is_1356_.length; i_1357_++) {
							int i_1358_ = is_1356_[i_1357_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_1219_ & (((Class387_Sub3) this).aShortArray7964[i_1358_])) != 0)) {
								((Class387_Sub3) this).anIntArray7901[i_1358_] -= anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_1358_] -= anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_1358_] -= anInt7956;
								((Class387_Sub3) this).anIntArray7901[i_1358_] = (((Class387_Sub3) this).anIntArray7901[i_1358_]) * i_1216_ >> 7;
								((Class387_Sub3) this).anIntArray7895[i_1358_] = (((Class387_Sub3) this).anIntArray7895[i_1358_]) * i_1217_ >> 7;
								((Class387_Sub3) this).anIntArray7965[i_1358_] = (((Class387_Sub3) this).anIntArray7965[i_1358_]) * i_1218_ >> 7;
								((Class387_Sub3) this).anIntArray7901[i_1358_] += anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_1358_] += anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_1358_] += anInt7956;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub3) this).anIntArrayArray7924 != null) {
				boolean bool_1359_ = false;
				for (int i_1360_ = 0; i_1360_ < i_1221_; i_1360_++) {
					int i_1361_ = is[i_1360_];
					if (i_1361_ < ((Class387_Sub3) this).anIntArrayArray7924.length) {
						int[] is_1362_ = (((Class387_Sub3) this).anIntArrayArray7924[i_1361_]);
						for (int i_1363_ = 0; i_1363_ < is_1362_.length; i_1363_++) {
							int i_1364_ = is_1362_[i_1363_];
							if (((Class387_Sub3) this).aShortArray7925 == null || ((i_1219_ & (((Class387_Sub3) this).aShortArray7925[i_1364_])) != 0)) {
								int i_1365_ = (((((Class387_Sub3) this).aByteArray7963[i_1364_]) & 0xff) + i_1216_ * 8);
								if (i_1365_ < 0)
									i_1365_ = 0;
								else if (i_1365_ > 255)
									i_1365_ = 255;
								((Class387_Sub3) this).aByteArray7963[i_1364_] = (byte) i_1365_;
							}
						}
						bool_1359_ = bool_1359_ | is_1362_.length > 0;
					}
				}
				if (bool_1359_) {
					if (((Class387_Sub3) this).aClass191Array7952 != null) {
						for (int i_1366_ = 0; i_1366_ < ((Class387_Sub3) this).anInt7951; i_1366_++) {
							Class191 class191 = (((Class387_Sub3) this).aClass191Array7952[i_1366_]);
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[i_1366_]);
							((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & 0xffffff | 255 - ((((Class387_Sub3) this).aByteArray7963[((Class191) class191).anInt1947]) & 0xff) << 24);
						}
					}
					method4838();
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub3) this).anIntArrayArray7924 != null) {
				boolean bool_1367_ = false;
				for (int i_1368_ = 0; i_1368_ < i_1221_; i_1368_++) {
					int i_1369_ = is[i_1368_];
					if (i_1369_ < ((Class387_Sub3) this).anIntArrayArray7924.length) {
						int[] is_1370_ = (((Class387_Sub3) this).anIntArrayArray7924[i_1369_]);
						for (int i_1371_ = 0; i_1371_ < is_1370_.length; i_1371_++) {
							int i_1372_ = is_1370_[i_1371_];
							if (((Class387_Sub3) this).aShortArray7925 == null || ((i_1219_ & (((Class387_Sub3) this).aShortArray7925[i_1372_])) != 0)) {
								int i_1373_ = ((((Class387_Sub3) this).aShortArray7935[i_1372_]) & 0xffff);
								int i_1374_ = i_1373_ >> 10 & 0x3f;
								int i_1375_ = i_1373_ >> 7 & 0x7;
								int i_1376_ = i_1373_ & 0x7f;
								i_1374_ = i_1374_ + i_1216_ & 0x3f;
								i_1375_ += i_1217_ / 4;
								if (i_1375_ < 0)
									i_1375_ = 0;
								else if (i_1375_ > 7)
									i_1375_ = 7;
								i_1376_ += i_1218_;
								if (i_1376_ < 0)
									i_1376_ = 0;
								else if (i_1376_ > 127)
									i_1376_ = 127;
								((Class387_Sub3) this).aShortArray7935[i_1372_] = (short) (i_1374_ << 10 | i_1375_ << 7 | i_1376_);
							}
						}
						bool_1367_ = bool_1367_ | is_1370_.length > 0;
					}
				}
				if (bool_1367_) {
					if (((Class387_Sub3) this).aClass191Array7952 != null) {
						for (int i_1377_ = 0; i_1377_ < ((Class387_Sub3) this).anInt7951; i_1377_++) {
							Class191 class191 = (((Class387_Sub3) this).aClass191Array7952[i_1377_]);
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[i_1377_]);
							((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | (Class294.anIntArray3165[((((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff)]) & 0xffffff);
						}
					}
					method4838();
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_1378_ = 0; i_1378_ < i_1221_; i_1378_++) {
					int i_1379_ = is[i_1378_];
					if (i_1379_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_1380_ = (((Class387_Sub3) this).anIntArrayArray7946[i_1379_]);
						for (int i_1381_ = 0; i_1381_ < is_1380_.length; i_1381_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_1380_[i_1381_]]);
							((Class166) class166).anInt1704 += i_1216_;
							((Class166) class166).anInt1705 += i_1217_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_1382_ = 0; i_1382_ < i_1221_; i_1382_++) {
					int i_1383_ = is[i_1382_];
					if (i_1383_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_1384_ = (((Class387_Sub3) this).anIntArrayArray7946[i_1383_]);
						for (int i_1385_ = 0; i_1385_ < is_1384_.length; i_1385_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_1384_[i_1385_]]);
							((Class166) class166).anInt1702 = (((Class166) class166).anInt1702 * i_1216_ >> 7);
							((Class166) class166).anInt1701 = (((Class166) class166).anInt1701 * i_1217_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_1386_ = 0; i_1386_ < i_1221_; i_1386_++) {
					int i_1387_ = is[i_1386_];
					if (i_1387_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_1388_ = (((Class387_Sub3) this).anIntArrayArray7946[i_1387_]);
						for (int i_1389_ = 0; i_1389_ < is_1388_.length; i_1389_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_1388_[i_1389_]]);
							((Class166) class166).anInt1706 = (((Class166) class166).anInt1706 + i_1216_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	void cw(int i, int i_1390_, int i_1391_, int i_1392_) {
		if (i == 0) {
			int i_1393_ = 0;
			anInt7902 = 0;
			anInt7937 = 0;
			anInt7956 = 0;
			for (int i_1394_ = 0; i_1394_ < ((Class387_Sub3) this).anInt7900; i_1394_++) {
				anInt7902 += ((Class387_Sub3) this).anIntArray7901[i_1394_];
				anInt7937 += ((Class387_Sub3) this).anIntArray7895[i_1394_];
				anInt7956 += ((Class387_Sub3) this).anIntArray7965[i_1394_];
				i_1393_++;
			}
			if (i_1393_ > 0) {
				anInt7902 = anInt7902 / i_1393_ + i_1390_;
				anInt7937 = anInt7937 / i_1393_ + i_1391_;
				anInt7956 = anInt7956 / i_1393_ + i_1392_;
			} else {
				anInt7902 = i_1390_;
				anInt7937 = i_1391_;
				anInt7956 = i_1392_;
			}
		} else if (i == 1) {
			for (int i_1395_ = 0; i_1395_ < ((Class387_Sub3) this).anInt7900; i_1395_++) {
				((Class387_Sub3) this).anIntArray7901[i_1395_] += i_1390_;
				((Class387_Sub3) this).anIntArray7895[i_1395_] += i_1391_;
				((Class387_Sub3) this).anIntArray7965[i_1395_] += i_1392_;
			}
		} else if (i == 2) {
			for (int i_1396_ = 0; i_1396_ < ((Class387_Sub3) this).anInt7900; i_1396_++) {
				((Class387_Sub3) this).anIntArray7901[i_1396_] -= anInt7902;
				((Class387_Sub3) this).anIntArray7895[i_1396_] -= anInt7937;
				((Class387_Sub3) this).anIntArray7965[i_1396_] -= anInt7956;
				if (i_1392_ != 0) {
					int i_1397_ = Class220.anIntArray2483[i_1392_];
					int i_1398_ = Class220.anIntArray2474[i_1392_];
					int i_1399_ = (((((Class387_Sub3) this).anIntArray7895[i_1396_] * i_1397_) + (((Class387_Sub3) this).anIntArray7901[i_1396_] * i_1398_) + 16383) >> 14);
					((Class387_Sub3) this).anIntArray7895[i_1396_] = ((((Class387_Sub3) this).anIntArray7895[i_1396_] * i_1398_) - (((Class387_Sub3) this).anIntArray7901[i_1396_] * i_1397_) + 16383) >> 14;
					((Class387_Sub3) this).anIntArray7901[i_1396_] = i_1399_;
				}
				if (i_1390_ != 0) {
					int i_1400_ = Class220.anIntArray2483[i_1390_];
					int i_1401_ = Class220.anIntArray2474[i_1390_];
					int i_1402_ = (((((Class387_Sub3) this).anIntArray7895[i_1396_] * i_1401_) - (((Class387_Sub3) this).anIntArray7965[i_1396_] * i_1400_) + 16383) >> 14);
					((Class387_Sub3) this).anIntArray7965[i_1396_] = ((((Class387_Sub3) this).anIntArray7895[i_1396_] * i_1400_) + (((Class387_Sub3) this).anIntArray7965[i_1396_] * i_1401_) + 16383) >> 14;
					((Class387_Sub3) this).anIntArray7895[i_1396_] = i_1402_;
				}
				if (i_1391_ != 0) {
					int i_1403_ = Class220.anIntArray2483[i_1391_];
					int i_1404_ = Class220.anIntArray2474[i_1391_];
					int i_1405_ = (((((Class387_Sub3) this).anIntArray7965[i_1396_] * i_1403_) + (((Class387_Sub3) this).anIntArray7901[i_1396_] * i_1404_) + 16383) >> 14);
					((Class387_Sub3) this).anIntArray7965[i_1396_] = ((((Class387_Sub3) this).anIntArray7965[i_1396_] * i_1404_) - (((Class387_Sub3) this).anIntArray7901[i_1396_] * i_1403_) + 16383) >> 14;
					((Class387_Sub3) this).anIntArray7901[i_1396_] = i_1405_;
				}
				((Class387_Sub3) this).anIntArray7901[i_1396_] += anInt7902;
				((Class387_Sub3) this).anIntArray7895[i_1396_] += anInt7937;
				((Class387_Sub3) this).anIntArray7965[i_1396_] += anInt7956;
			}
		} else if (i == 3) {
			for (int i_1406_ = 0; i_1406_ < ((Class387_Sub3) this).anInt7900; i_1406_++) {
				((Class387_Sub3) this).anIntArray7901[i_1406_] -= anInt7902;
				((Class387_Sub3) this).anIntArray7895[i_1406_] -= anInt7937;
				((Class387_Sub3) this).anIntArray7965[i_1406_] -= anInt7956;
				((Class387_Sub3) this).anIntArray7901[i_1406_] = (((Class387_Sub3) this).anIntArray7901[i_1406_] * i_1390_ / 128);
				((Class387_Sub3) this).anIntArray7895[i_1406_] = (((Class387_Sub3) this).anIntArray7895[i_1406_] * i_1391_ / 128);
				((Class387_Sub3) this).anIntArray7965[i_1406_] = (((Class387_Sub3) this).anIntArray7965[i_1406_] * i_1392_ / 128);
				((Class387_Sub3) this).anIntArray7901[i_1406_] += anInt7902;
				((Class387_Sub3) this).anIntArray7895[i_1406_] += anInt7937;
				((Class387_Sub3) this).anIntArray7965[i_1406_] += anInt7956;
			}
		} else if (i == 5) {
			for (int i_1407_ = 0; i_1407_ < ((Class387_Sub3) this).anInt7916; i_1407_++) {
				int i_1408_ = ((((Class387_Sub3) this).aByteArray7963[i_1407_] & 0xff) + i_1390_ * 8);
				if (i_1408_ < 0)
					i_1408_ = 0;
				else if (i_1408_ > 255)
					i_1408_ = 255;
				((Class387_Sub3) this).aByteArray7963[i_1407_] = (byte) i_1408_;
			}
			if (((Class387_Sub3) this).aClass191Array7952 != null) {
				for (int i_1409_ = 0; i_1409_ < ((Class387_Sub3) this).anInt7951; i_1409_++) {
					Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_1409_];
					Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_1409_];
					((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & 0xffffff | 255 - ((((Class387_Sub3) this).aByteArray7963[((Class191) class191).anInt1947]) & 0xff) << 24);
				}
			}
			method4838();
		} else if (i == 7) {
			for (int i_1410_ = 0; i_1410_ < ((Class387_Sub3) this).anInt7916; i_1410_++) {
				int i_1411_ = ((Class387_Sub3) this).aShortArray7935[i_1410_] & 0xffff;
				int i_1412_ = i_1411_ >> 10 & 0x3f;
				int i_1413_ = i_1411_ >> 7 & 0x7;
				int i_1414_ = i_1411_ & 0x7f;
				i_1412_ = i_1412_ + i_1390_ & 0x3f;
				i_1413_ += i_1391_ / 4;
				if (i_1413_ < 0)
					i_1413_ = 0;
				else if (i_1413_ > 7)
					i_1413_ = 7;
				i_1414_ += i_1392_;
				if (i_1414_ < 0)
					i_1414_ = 0;
				else if (i_1414_ > 127)
					i_1414_ = 127;
				((Class387_Sub3) this).aShortArray7935[i_1410_] = (short) (i_1412_ << 10 | i_1413_ << 7 | i_1414_);
			}
			if (((Class387_Sub3) this).aClass191Array7952 != null) {
				for (int i_1415_ = 0; i_1415_ < ((Class387_Sub3) this).anInt7951; i_1415_++) {
					Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_1415_];
					Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_1415_];
					((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
				}
			}
			method4838();
		} else if (i == 8) {
			for (int i_1416_ = 0; i_1416_ < ((Class387_Sub3) this).anInt7951; i_1416_++) {
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_1416_];
				((Class166) class166).anInt1704 += i_1390_;
				((Class166) class166).anInt1705 += i_1391_;
			}
		} else if (i == 10) {
			for (int i_1417_ = 0; i_1417_ < ((Class387_Sub3) this).anInt7951; i_1417_++) {
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_1417_];
				((Class166) class166).anInt1702 = ((Class166) class166).anInt1702 * i_1390_ >> 7;
				((Class166) class166).anInt1701 = ((Class166) class166).anInt1701 * i_1391_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1418_ = 0; i_1418_ < ((Class387_Sub3) this).anInt7951; i_1418_++) {
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_1418_];
				((Class166) class166).anInt1706 = ((Class166) class166).anInt1706 + i_1390_ & 0x3fff;
			}
		}
	}

	public void method4776(Matrix3f class222, int i, boolean bool) {
		if (((Class387_Sub3) this).aShortArray7964 != null) {
			Matrix3f class222_1419_ = class222;
			if (bool) {
				class222_1419_ = ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aClass222_8235;
				class222_1419_.method2074(class222);
			}
			float[] fs = new float[3];
			for (int i_1420_ = 0; i_1420_ < ((Class387_Sub3) this).anInt7900; i_1420_++) {
				if ((i & ((Class387_Sub3) this).aShortArray7964[i_1420_]) != 0) {
					class222_1419_.method2077((float) (((Class387_Sub3) this).anIntArray7901[i_1420_]), (float) (((Class387_Sub3) this).anIntArray7895[i_1420_]), (float) (((Class387_Sub3) this).anIntArray7965[i_1420_]), fs);
					((Class387_Sub3) this).anIntArray7901[i_1420_] = (int) fs[0];
					((Class387_Sub3) this).anIntArray7895[i_1420_] = (int) fs[1];
					((Class387_Sub3) this).anIntArray7965[i_1420_] = (int) fs[2];
				}
			}
		}
	}

	public void method4762(Matrix3f class222, int i, boolean bool) {
		if (((Class387_Sub3) this).aShortArray7964 != null) {
			Matrix3f class222_1421_ = class222;
			if (bool) {
				class222_1421_ = ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aClass222_8235;
				class222_1421_.method2074(class222);
			}
			float[] fs = new float[3];
			for (int i_1422_ = 0; i_1422_ < ((Class387_Sub3) this).anInt7900; i_1422_++) {
				if ((i & ((Class387_Sub3) this).aShortArray7964[i_1422_]) != 0) {
					class222_1421_.method2077((float) (((Class387_Sub3) this).anIntArray7901[i_1422_]), (float) (((Class387_Sub3) this).anIntArray7895[i_1422_]), (float) (((Class387_Sub3) this).anIntArray7965[i_1422_]), fs);
					((Class387_Sub3) this).anIntArray7901[i_1422_] = (int) fs[0];
					((Class387_Sub3) this).anIntArray7895[i_1422_] = (int) fs[1];
					((Class387_Sub3) this).anIntArray7965[i_1422_] = (int) fs[2];
				}
			}
		}
	}

	public void method4759(Matrix3f class222, Class302_Sub1 class302_sub1, int i) {
		if (aClass156_7966 != null)
			aClass156_7966.method1694();
		if (((Class387_Sub3) this).anInt7906 != 0) {
			Matrix4f class233 = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8246);
			Matrix4f class233_1423_ = ((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236;
			Matrix4f class233_1424_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8204);
			class233_1423_.method2145(class222);
			class233_1424_.method2142(class233_1423_);
			class233_1424_.method2144(((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aClass233_8205);
			if (!((Class387_Sub3) this).aBoolean7950)
				method4832();
			float[] fs = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloatArray8312);
			class233_1423_.method2149(0.0F, (float) ((Class387_Sub3) this).anInt7938, 0.0F, fs);
			float f = fs[0];
			float f_1425_ = fs[1];
			float f_1426_ = fs[2];
			class233_1423_.method2149(0.0F, (float) ((Class387_Sub3) this).anInt7939, 0.0F, fs);
			float f_1427_ = fs[0];
			float f_1428_ = fs[1];
			float f_1429_ = fs[2];
			for (int i_1430_ = 0; i_1430_ < 6; i_1430_++) {
				float[] fs_1431_ = (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloatArrayArray8252[i_1430_]);
				float f_1432_ = (fs_1431_[0] * f + fs_1431_[1] * f_1425_ + fs_1431_[2] * f_1426_ + fs_1431_[3] + (float) ((Class387_Sub3) this).anInt7936);
				float f_1433_ = (fs_1431_[0] * f_1427_ + fs_1431_[1] * f_1428_ + fs_1431_[2] * f_1429_ + fs_1431_[3] + (float) ((Class387_Sub3) this).anInt7936);
				if (f_1432_ < 0.0F && f_1433_ < 0.0F)
					return;
			}
			if (class302_sub1 != null) {
				boolean bool = false;
				boolean bool_1434_ = true;
				int i_1435_ = ((((Class387_Sub3) this).anInt7940 + ((Class387_Sub3) this).anInt7941) >> 1);
				int i_1436_ = ((((Class387_Sub3) this).anInt7942 + ((Class387_Sub3) this).anInt7943) >> 1);
				int i_1437_ = i_1435_;
				int i_1438_ = ((Class387_Sub3) this).anInt7938;
				int i_1439_ = i_1436_;
				float f_1440_ = (class233_1424_.aFloatArray2594[0] * (float) i_1437_ + class233_1424_.aFloatArray2594[4] * (float) i_1438_ + class233_1424_.aFloatArray2594[8] * (float) i_1439_ + class233_1424_.aFloatArray2594[12]);
				float f_1441_ = (class233_1424_.aFloatArray2594[1] * (float) i_1437_ + class233_1424_.aFloatArray2594[5] * (float) i_1438_ + class233_1424_.aFloatArray2594[9] * (float) i_1439_ + class233_1424_.aFloatArray2594[13]);
				float f_1442_ = (class233_1424_.aFloatArray2594[2] * (float) i_1437_ + class233_1424_.aFloatArray2594[6] * (float) i_1438_ + class233_1424_.aFloatArray2594[10] * (float) i_1439_ + class233_1424_.aFloatArray2594[14]);
				float f_1443_ = (class233_1424_.aFloatArray2594[3] * (float) i_1437_ + class233_1424_.aFloatArray2594[7] * (float) i_1438_ + class233_1424_.aFloatArray2594[11] * (float) i_1439_ + class233_1424_.aFloatArray2594[15]);
				if (f_1442_ >= -f_1443_) {
					class302_sub1.anInt7641 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8253) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329) * f_1440_ / f_1443_);
					class302_sub1.anInt7642 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8255) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256) * f_1441_ / f_1443_);
				} else
					bool = true;
				i_1437_ = i_1435_;
				i_1438_ = ((Class387_Sub3) this).anInt7939;
				i_1439_ = i_1436_;
				float f_1444_ = (class233_1424_.aFloatArray2594[0] * (float) i_1437_ + class233_1424_.aFloatArray2594[4] * (float) i_1438_ + class233_1424_.aFloatArray2594[8] * (float) i_1439_ + class233_1424_.aFloatArray2594[12]);
				float f_1445_ = (class233_1424_.aFloatArray2594[1] * (float) i_1437_ + class233_1424_.aFloatArray2594[5] * (float) i_1438_ + class233_1424_.aFloatArray2594[9] * (float) i_1439_ + class233_1424_.aFloatArray2594[13]);
				float f_1446_ = (class233_1424_.aFloatArray2594[2] * (float) i_1437_ + class233_1424_.aFloatArray2594[6] * (float) i_1438_ + class233_1424_.aFloatArray2594[10] * (float) i_1439_ + class233_1424_.aFloatArray2594[14]);
				float f_1447_ = (class233_1424_.aFloatArray2594[3] * (float) i_1437_ + class233_1424_.aFloatArray2594[7] * (float) i_1438_ + class233_1424_.aFloatArray2594[11] * (float) i_1439_ + class233_1424_.aFloatArray2594[15]);
				if (f_1446_ >= -f_1447_) {
					class302_sub1.anInt7643 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8253) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329) * f_1444_ / f_1447_);
					class302_sub1.anInt7640 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8255) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256) * f_1445_ / f_1447_);
				} else
					bool = true;
				if (bool) {
					if (f_1442_ < -f_1443_ && f_1446_ < -f_1447_)
						bool_1434_ = false;
					else if (f_1442_ < -f_1443_) {
						float f_1448_ = (f_1442_ + f_1443_) / (f_1446_ + f_1447_) - 1.0F;
						float f_1449_ = f_1440_ + f_1448_ * (f_1444_ - f_1440_);
						float f_1450_ = f_1441_ + f_1448_ * (f_1445_ - f_1441_);
						float f_1451_ = f_1443_ + f_1448_ * (f_1447_ - f_1443_);
						class302_sub1.anInt7641 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8253) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_1449_ / f_1451_));
						class302_sub1.anInt7642 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8255) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256 * f_1450_ / f_1451_));
					} else if (f_1446_ < -f_1447_) {
						float f_1452_ = (f_1446_ + f_1447_) / (f_1442_ + f_1443_) - 1.0F;
						float f_1453_ = f_1444_ + f_1452_ * (f_1440_ - f_1444_);
						float f_1454_ = f_1445_ + f_1452_ * (f_1441_ - f_1445_);
						float f_1455_ = f_1447_ + f_1452_ * (f_1443_ - f_1447_);
						class302_sub1.anInt7643 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8253) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_1453_ / f_1455_));
						class302_sub1.anInt7640 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8255) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256 * f_1454_ / f_1455_));
					}
				}
				if (bool_1434_) {
					if (f_1442_ / f_1443_ > f_1446_ / f_1447_) {
						float f_1456_ = (f_1440_ + (class233.aFloatArray2594[0] * (float) ((Class387_Sub3) this).anInt7936) + class233.aFloatArray2594[12]);
						float f_1457_ = (f_1443_ + (class233.aFloatArray2594[3] * (float) ((Class387_Sub3) this).anInt7936) + class233.aFloatArray2594[15]);
						class302_sub1.anInt7645 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8253) - (float) class302_sub1.anInt7641 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_1456_ / f_1457_));
					} else {
						float f_1458_ = (f_1444_ + (class233.aFloatArray2594[0] * (float) ((Class387_Sub3) this).anInt7936) + class233.aFloatArray2594[12]);
						float f_1459_ = (f_1447_ + (class233.aFloatArray2594[3] * (float) ((Class387_Sub3) this).anInt7936) + class233.aFloatArray2594[15]);
						class302_sub1.anInt7645 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8253) - (float) class302_sub1.anInt7643 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_1458_ / f_1459_));
					}
					class302_sub1.aBoolean7644 = true;
				}
			}
			((Class387_Sub3) this).aClass_ra_Sub3_7894.method5394(i);
			method4843(class222);
			((Class387_Sub3) this).aClass_ra_Sub3_7894.method5394(0);
			class233_1423_.method2145(class222);
			class233_1423_.method2144(((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8230);
			method4849(class233_1423_);
		}
	}

	public void method4740(Matrix3f class222, Class302_Sub1 class302_sub1, int i) {
		if (aClass156_7966 != null)
			aClass156_7966.method1694();
		if (((Class387_Sub3) this).anInt7906 != 0) {
			Matrix4f class233 = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8246);
			Matrix4f class233_1460_ = ((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236;
			Matrix4f class233_1461_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8204);
			class233_1460_.method2145(class222);
			class233_1461_.method2142(class233_1460_);
			class233_1461_.method2144(((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aClass233_8205);
			if (!((Class387_Sub3) this).aBoolean7950)
				method4832();
			float[] fs = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloatArray8312);
			class233_1460_.method2149(0.0F, (float) ((Class387_Sub3) this).anInt7938, 0.0F, fs);
			float f = fs[0];
			float f_1462_ = fs[1];
			float f_1463_ = fs[2];
			class233_1460_.method2149(0.0F, (float) ((Class387_Sub3) this).anInt7939, 0.0F, fs);
			float f_1464_ = fs[0];
			float f_1465_ = fs[1];
			float f_1466_ = fs[2];
			for (int i_1467_ = 0; i_1467_ < 6; i_1467_++) {
				float[] fs_1468_ = (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloatArrayArray8252[i_1467_]);
				float f_1469_ = (fs_1468_[0] * f + fs_1468_[1] * f_1462_ + fs_1468_[2] * f_1463_ + fs_1468_[3] + (float) ((Class387_Sub3) this).anInt7936);
				float f_1470_ = (fs_1468_[0] * f_1464_ + fs_1468_[1] * f_1465_ + fs_1468_[2] * f_1466_ + fs_1468_[3] + (float) ((Class387_Sub3) this).anInt7936);
				if (f_1469_ < 0.0F && f_1470_ < 0.0F)
					return;
			}
			if (class302_sub1 != null) {
				boolean bool = false;
				boolean bool_1471_ = true;
				int i_1472_ = ((((Class387_Sub3) this).anInt7940 + ((Class387_Sub3) this).anInt7941) >> 1);
				int i_1473_ = ((((Class387_Sub3) this).anInt7942 + ((Class387_Sub3) this).anInt7943) >> 1);
				int i_1474_ = i_1472_;
				int i_1475_ = ((Class387_Sub3) this).anInt7938;
				int i_1476_ = i_1473_;
				float f_1477_ = (class233_1461_.aFloatArray2594[0] * (float) i_1474_ + class233_1461_.aFloatArray2594[4] * (float) i_1475_ + class233_1461_.aFloatArray2594[8] * (float) i_1476_ + class233_1461_.aFloatArray2594[12]);
				float f_1478_ = (class233_1461_.aFloatArray2594[1] * (float) i_1474_ + class233_1461_.aFloatArray2594[5] * (float) i_1475_ + class233_1461_.aFloatArray2594[9] * (float) i_1476_ + class233_1461_.aFloatArray2594[13]);
				float f_1479_ = (class233_1461_.aFloatArray2594[2] * (float) i_1474_ + class233_1461_.aFloatArray2594[6] * (float) i_1475_ + class233_1461_.aFloatArray2594[10] * (float) i_1476_ + class233_1461_.aFloatArray2594[14]);
				float f_1480_ = (class233_1461_.aFloatArray2594[3] * (float) i_1474_ + class233_1461_.aFloatArray2594[7] * (float) i_1475_ + class233_1461_.aFloatArray2594[11] * (float) i_1476_ + class233_1461_.aFloatArray2594[15]);
				if (f_1479_ >= -f_1480_) {
					class302_sub1.anInt7641 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8253) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329) * f_1477_ / f_1480_);
					class302_sub1.anInt7642 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8255) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256) * f_1478_ / f_1480_);
				} else
					bool = true;
				i_1474_ = i_1472_;
				i_1475_ = ((Class387_Sub3) this).anInt7939;
				i_1476_ = i_1473_;
				float f_1481_ = (class233_1461_.aFloatArray2594[0] * (float) i_1474_ + class233_1461_.aFloatArray2594[4] * (float) i_1475_ + class233_1461_.aFloatArray2594[8] * (float) i_1476_ + class233_1461_.aFloatArray2594[12]);
				float f_1482_ = (class233_1461_.aFloatArray2594[1] * (float) i_1474_ + class233_1461_.aFloatArray2594[5] * (float) i_1475_ + class233_1461_.aFloatArray2594[9] * (float) i_1476_ + class233_1461_.aFloatArray2594[13]);
				float f_1483_ = (class233_1461_.aFloatArray2594[2] * (float) i_1474_ + class233_1461_.aFloatArray2594[6] * (float) i_1475_ + class233_1461_.aFloatArray2594[10] * (float) i_1476_ + class233_1461_.aFloatArray2594[14]);
				float f_1484_ = (class233_1461_.aFloatArray2594[3] * (float) i_1474_ + class233_1461_.aFloatArray2594[7] * (float) i_1475_ + class233_1461_.aFloatArray2594[11] * (float) i_1476_ + class233_1461_.aFloatArray2594[15]);
				if (f_1483_ >= -f_1484_) {
					class302_sub1.anInt7643 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8253) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329) * f_1481_ / f_1484_);
					class302_sub1.anInt7640 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8255) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256) * f_1482_ / f_1484_);
				} else
					bool = true;
				if (bool) {
					if (f_1479_ < -f_1480_ && f_1483_ < -f_1484_)
						bool_1471_ = false;
					else if (f_1479_ < -f_1480_) {
						float f_1485_ = (f_1479_ + f_1480_) / (f_1483_ + f_1484_) - 1.0F;
						float f_1486_ = f_1477_ + f_1485_ * (f_1481_ - f_1477_);
						float f_1487_ = f_1478_ + f_1485_ * (f_1482_ - f_1478_);
						float f_1488_ = f_1480_ + f_1485_ * (f_1484_ - f_1480_);
						class302_sub1.anInt7641 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8253) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_1486_ / f_1488_));
						class302_sub1.anInt7642 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8255) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256 * f_1487_ / f_1488_));
					} else if (f_1483_ < -f_1484_) {
						float f_1489_ = (f_1483_ + f_1484_) / (f_1479_ + f_1480_) - 1.0F;
						float f_1490_ = f_1481_ + f_1489_ * (f_1477_ - f_1481_);
						float f_1491_ = f_1482_ + f_1489_ * (f_1478_ - f_1482_);
						float f_1492_ = f_1484_ + f_1489_ * (f_1480_ - f_1484_);
						class302_sub1.anInt7643 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8253) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_1490_ / f_1492_));
						class302_sub1.anInt7640 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8255) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256 * f_1491_ / f_1492_));
					}
				}
				if (bool_1471_) {
					if (f_1479_ / f_1480_ > f_1483_ / f_1484_) {
						float f_1493_ = (f_1477_ + (class233.aFloatArray2594[0] * (float) ((Class387_Sub3) this).anInt7936) + class233.aFloatArray2594[12]);
						float f_1494_ = (f_1480_ + (class233.aFloatArray2594[3] * (float) ((Class387_Sub3) this).anInt7936) + class233.aFloatArray2594[15]);
						class302_sub1.anInt7645 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8253) - (float) class302_sub1.anInt7641 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_1493_ / f_1494_));
					} else {
						float f_1495_ = (f_1481_ + (class233.aFloatArray2594[0] * (float) ((Class387_Sub3) this).anInt7936) + class233.aFloatArray2594[12]);
						float f_1496_ = (f_1484_ + (class233.aFloatArray2594[3] * (float) ((Class387_Sub3) this).anInt7936) + class233.aFloatArray2594[15]);
						class302_sub1.anInt7645 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8253) - (float) class302_sub1.anInt7643 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_1495_ / f_1496_));
					}
					class302_sub1.aBoolean7644 = true;
				}
			}
			((Class387_Sub3) this).aClass_ra_Sub3_7894.method5394(i);
			method4843(class222);
			((Class387_Sub3) this).aClass_ra_Sub3_7894.method5394(0);
			class233_1460_.method2145(class222);
			class233_1460_.method2144(((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8230);
			method4849(class233_1460_);
		}
	}

	boolean ea() {
		if (((Class387_Sub3) this).anIntArrayArray7918 == null)
			return false;
		for (int i = 0; i < ((Class387_Sub3) this).anInt7899; i++) {
			((Class387_Sub3) this).anIntArray7901[i] <<= 4;
			((Class387_Sub3) this).anIntArray7895[i] <<= 4;
			((Class387_Sub3) this).anIntArray7965[i] <<= 4;
		}
		anInt7902 = 0;
		anInt7937 = 0;
		anInt7956 = 0;
		return true;
	}

	public boolean method4746(int i, int i_1497_, Matrix3f class222, boolean bool, int i_1498_) {
		Matrix4f class233 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236;
		class233.method2145(class222);
		class233.method2144(((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass233_8205);
		boolean bool_1499_ = false;
		float f = 3.4028235E38F;
		float f_1500_ = -3.4028235E38F;
		float f_1501_ = 3.4028235E38F;
		float f_1502_ = -3.4028235E38F;
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		int i_1503_ = ((((Class387_Sub3) this).anInt7941 - ((Class387_Sub3) this).anInt7940) >> 1);
		int i_1504_ = ((((Class387_Sub3) this).anInt7939 - ((Class387_Sub3) this).anInt7938) >> 1);
		int i_1505_ = ((((Class387_Sub3) this).anInt7943 - ((Class387_Sub3) this).anInt7942) >> 1);
		int i_1506_ = ((Class387_Sub3) this).anInt7940 + i_1503_;
		int i_1507_ = ((Class387_Sub3) this).anInt7938 + i_1504_;
		int i_1508_ = ((Class387_Sub3) this).anInt7942 + i_1505_;
		int i_1509_ = i_1506_ - (i_1503_ << i_1498_);
		int i_1510_ = i_1507_ - (i_1504_ << i_1498_);
		int i_1511_ = i_1508_ - (i_1505_ << i_1498_);
		int i_1512_ = i_1506_ + (i_1503_ << i_1498_);
		int i_1513_ = i_1507_ + (i_1504_ << i_1498_);
		int i_1514_ = i_1508_ + (i_1505_ << i_1498_);
		anIntArray7959[0] = i_1509_;
		anIntArray7960[0] = i_1510_;
		anIntArray7961[0] = i_1511_;
		anIntArray7959[1] = i_1512_;
		anIntArray7960[1] = i_1510_;
		anIntArray7961[1] = i_1511_;
		anIntArray7959[2] = i_1509_;
		anIntArray7960[2] = i_1513_;
		anIntArray7961[2] = i_1511_;
		anIntArray7959[3] = i_1512_;
		anIntArray7960[3] = i_1513_;
		anIntArray7961[3] = i_1511_;
		anIntArray7959[4] = i_1509_;
		anIntArray7960[4] = i_1510_;
		anIntArray7961[4] = i_1514_;
		anIntArray7959[5] = i_1512_;
		anIntArray7960[5] = i_1510_;
		anIntArray7961[5] = i_1514_;
		anIntArray7959[6] = i_1509_;
		anIntArray7960[6] = i_1513_;
		anIntArray7961[6] = i_1514_;
		anIntArray7959[7] = i_1512_;
		anIntArray7960[7] = i_1513_;
		anIntArray7961[7] = i_1514_;
		for (int i_1515_ = 0; i_1515_ < 8; i_1515_++) {
			float f_1516_ = (float) anIntArray7959[i_1515_];
			float f_1517_ = (float) anIntArray7960[i_1515_];
			float f_1518_ = (float) anIntArray7961[i_1515_];
			float f_1519_ = (class233.aFloatArray2594[2] * f_1516_ + class233.aFloatArray2594[6] * f_1517_ + class233.aFloatArray2594[10] * f_1518_ + class233.aFloatArray2594[14]);
			float f_1520_ = (class233.aFloatArray2594[3] * f_1516_ + class233.aFloatArray2594[7] * f_1517_ + class233.aFloatArray2594[11] * f_1518_ + class233.aFloatArray2594[15]);
			if (f_1519_ >= -f_1520_) {
				float f_1521_ = (class233.aFloatArray2594[0] * f_1516_ + class233.aFloatArray2594[4] * f_1517_ + class233.aFloatArray2594[8] * f_1518_ + class233.aFloatArray2594[12]);
				float f_1522_ = (class233.aFloatArray2594[1] * f_1516_ + class233.aFloatArray2594[5] * f_1517_ + class233.aFloatArray2594[9] * f_1518_ + class233.aFloatArray2594[13]);
				float f_1523_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8253 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_1521_ / f_1520_));
				float f_1524_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aFloat8255 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256 * f_1522_ / f_1520_));
				if (f_1523_ < f)
					f = f_1523_;
				if (f_1523_ > f_1500_)
					f_1500_ = f_1523_;
				if (f_1524_ < f_1501_)
					f_1501_ = f_1524_;
				if (f_1524_ > f_1502_)
					f_1502_ = f_1524_;
				bool_1499_ = true;
			}
		}
		if (bool_1499_ && (float) i > f && (float) i < f_1500_ && (float) i_1497_ > f_1501_ && (float) i_1497_ < f_1502_) {
			if (bool)
				return true;
			if (anIntArray7933.length < ((Class387_Sub3) this).anInt7906) {
				anIntArray7933 = new int[((Class387_Sub3) this).anInt7906];
				anIntArray7929 = new int[((Class387_Sub3) this).anInt7906];
			}
			for (int i_1525_ = 0; i_1525_ < ((Class387_Sub3) this).anInt7900; i_1525_++) {
				float f_1526_ = (float) ((Class387_Sub3) this).anIntArray7901[i_1525_];
				float f_1527_ = (float) ((Class387_Sub3) this).anIntArray7895[i_1525_];
				float f_1528_ = (float) ((Class387_Sub3) this).anIntArray7965[i_1525_];
				float f_1529_ = (class233.aFloatArray2594[2] * f_1526_ + class233.aFloatArray2594[6] * f_1527_ + class233.aFloatArray2594[10] * f_1528_ + class233.aFloatArray2594[14]);
				float f_1530_ = (class233.aFloatArray2594[3] * f_1526_ + class233.aFloatArray2594[7] * f_1527_ + class233.aFloatArray2594[11] * f_1528_ + class233.aFloatArray2594[15]);
				if (f_1529_ >= -f_1530_) {
					float f_1531_ = (class233.aFloatArray2594[0] * f_1526_ + class233.aFloatArray2594[4] * f_1527_ + class233.aFloatArray2594[8] * f_1528_ + class233.aFloatArray2594[12]);
					float f_1532_ = (class233.aFloatArray2594[1] * f_1526_ + class233.aFloatArray2594[5] * f_1527_ + class233.aFloatArray2594[9] * f_1528_ + class233.aFloatArray2594[13]);
					int i_1533_ = ((Class387_Sub3) this).anIntArray7947[i_1525_];
					int i_1534_ = ((Class387_Sub3) this).anIntArray7947[i_1525_ + 1];
					for (int i_1535_ = i_1533_; i_1535_ < i_1534_; i_1535_++) {
						int i_1536_ = (((Class387_Sub3) this).aShortArray7948[i_1535_] - 1);
						if (i_1536_ == -1)
							break;
						anIntArray7933[i_1536_] = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8253) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8329 * f_1531_ / f_1530_));
						anIntArray7929[i_1536_] = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8255) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).aFloat8256 * f_1532_ / f_1530_));
					}
				} else {
					int i_1537_ = ((Class387_Sub3) this).anIntArray7947[i_1525_];
					int i_1538_ = ((Class387_Sub3) this).anIntArray7947[i_1525_ + 1];
					for (int i_1539_ = i_1537_; i_1539_ < i_1538_; i_1539_++) {
						int i_1540_ = (((Class387_Sub3) this).aShortArray7948[i_1539_] - 1);
						if (i_1540_ == -1)
							break;
						anIntArray7933[(((Class387_Sub3) this).aShortArray7948[i_1539_]) - 1] = -999999;
					}
				}
			}
			for (int i_1541_ = 0; i_1541_ < ((Class387_Sub3) this).anInt7916; i_1541_++) {
				if (anIntArray7933[(((Class387_Sub3) this).aShortArray7920[i_1541_])] != -999999 && anIntArray7933[(((Class387_Sub3) this).aShortArray7921[i_1541_])] != -999999 && anIntArray7933[(((Class387_Sub3) this).aShortArray7922[i_1541_])] != -999999
						&& method4841(i, i_1497_, anIntArray7929[(((Class387_Sub3) this).aShortArray7920[i_1541_])], anIntArray7929[(((Class387_Sub3) this).aShortArray7921[i_1541_])], anIntArray7929[(((Class387_Sub3) this).aShortArray7922[i_1541_])], anIntArray7933[(((Class387_Sub3) this).aShortArray7920[i_1541_])], anIntArray7933[(((Class387_Sub3) this).aShortArray7921[i_1541_])], anIntArray7933[(((Class387_Sub3) this).aShortArray7922[i_1541_])]))
					return true;
			}
		}
		return false;
	}

	public int ha() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7943;
	}

	public Class85[] method4772() {
		return ((Class387_Sub3) this).aClass85Array7949;
	}

	public int RA() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7940;
	}

	public int cu() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7940;
	}

	public int ce() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7928;
	}

	public int cb() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7928;
	}

	void cl(int i, int[] is, int i_1542_, int i_1543_, int i_1544_, boolean bool, int i_1545_, int[] is_1546_) {
		int i_1547_ = is.length;
		if (i == 0) {
			i_1542_ <<= 4;
			i_1543_ <<= 4;
			i_1544_ <<= 4;
			int i_1548_ = 0;
			anInt7902 = 0;
			anInt7937 = 0;
			anInt7956 = 0;
			for (int i_1549_ = 0; i_1549_ < i_1547_; i_1549_++) {
				int i_1550_ = is[i_1549_];
				if (i_1550_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_1551_ = ((Class387_Sub3) this).anIntArrayArray7918[i_1550_];
					for (int i_1552_ = 0; i_1552_ < is_1551_.length; i_1552_++) {
						int i_1553_ = is_1551_[i_1552_];
						if (((Class387_Sub3) this).aShortArray7964 == null || (i_1545_ & (((Class387_Sub3) this).aShortArray7964[i_1553_])) != 0) {
							anInt7902 += (((Class387_Sub3) this).anIntArray7901[i_1553_]);
							anInt7937 += (((Class387_Sub3) this).anIntArray7895[i_1553_]);
							anInt7956 += (((Class387_Sub3) this).anIntArray7965[i_1553_]);
							i_1548_++;
						}
					}
				}
			}
			if (i_1548_ > 0) {
				anInt7902 = anInt7902 / i_1548_ + i_1542_;
				anInt7937 = anInt7937 / i_1548_ + i_1543_;
				anInt7956 = anInt7956 / i_1548_ + i_1544_;
				aBoolean7905 = true;
			} else {
				anInt7902 = i_1542_;
				anInt7937 = i_1543_;
				anInt7956 = i_1544_;
			}
		} else if (i == 1) {
			if (is_1546_ != null) {
				int i_1554_ = ((is_1546_[0] * i_1542_ + is_1546_[1] * i_1543_ + is_1546_[2] * i_1544_ + 8192) >> 14);
				int i_1555_ = ((is_1546_[3] * i_1542_ + is_1546_[4] * i_1543_ + is_1546_[5] * i_1544_ + 8192) >> 14);
				int i_1556_ = ((is_1546_[6] * i_1542_ + is_1546_[7] * i_1543_ + is_1546_[8] * i_1544_ + 8192) >> 14);
				i_1542_ = i_1554_;
				i_1543_ = i_1555_;
				i_1544_ = i_1556_;
			}
			i_1542_ <<= 4;
			i_1543_ <<= 4;
			i_1544_ <<= 4;
			for (int i_1557_ = 0; i_1557_ < i_1547_; i_1557_++) {
				int i_1558_ = is[i_1557_];
				if (i_1558_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
					int[] is_1559_ = ((Class387_Sub3) this).anIntArrayArray7918[i_1558_];
					for (int i_1560_ = 0; i_1560_ < is_1559_.length; i_1560_++) {
						int i_1561_ = is_1559_[i_1560_];
						if (((Class387_Sub3) this).aShortArray7964 == null || (i_1545_ & (((Class387_Sub3) this).aShortArray7964[i_1561_])) != 0) {
							((Class387_Sub3) this).anIntArray7901[i_1561_] += i_1542_;
							((Class387_Sub3) this).anIntArray7895[i_1561_] += i_1543_;
							((Class387_Sub3) this).anIntArray7965[i_1561_] += i_1544_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1546_ != null) {
				int i_1562_ = is_1546_[9] << 4;
				int i_1563_ = is_1546_[10] << 4;
				int i_1564_ = is_1546_[11] << 4;
				int i_1565_ = is_1546_[12] << 4;
				int i_1566_ = is_1546_[13] << 4;
				int i_1567_ = is_1546_[14] << 4;
				if (aBoolean7905) {
					int i_1568_ = ((is_1546_[0] * anInt7902 + is_1546_[3] * anInt7937 + is_1546_[6] * anInt7956 + 8192) >> 14);
					int i_1569_ = ((is_1546_[1] * anInt7902 + is_1546_[4] * anInt7937 + is_1546_[7] * anInt7956 + 8192) >> 14);
					int i_1570_ = ((is_1546_[2] * anInt7902 + is_1546_[5] * anInt7937 + is_1546_[8] * anInt7956 + 8192) >> 14);
					i_1568_ += i_1565_;
					i_1569_ += i_1566_;
					i_1570_ += i_1567_;
					anInt7902 = i_1568_;
					anInt7937 = i_1569_;
					anInt7956 = i_1570_;
					aBoolean7905 = false;
				}
				int[] is_1571_ = new int[9];
				int i_1572_ = Class220.anIntArray2474[i_1542_];
				int i_1573_ = Class220.anIntArray2483[i_1542_];
				int i_1574_ = Class220.anIntArray2474[i_1543_];
				int i_1575_ = Class220.anIntArray2483[i_1543_];
				int i_1576_ = Class220.anIntArray2474[i_1544_];
				int i_1577_ = Class220.anIntArray2483[i_1544_];
				int i_1578_ = i_1573_ * i_1576_ + 8192 >> 14;
				int i_1579_ = i_1573_ * i_1577_ + 8192 >> 14;
				is_1571_[0] = i_1574_ * i_1576_ + i_1575_ * i_1579_ + 8192 >> 14;
				is_1571_[1] = -i_1574_ * i_1577_ + i_1575_ * i_1578_ + 8192 >> 14;
				is_1571_[2] = i_1575_ * i_1572_ + 8192 >> 14;
				is_1571_[3] = i_1572_ * i_1577_ + 8192 >> 14;
				is_1571_[4] = i_1572_ * i_1576_ + 8192 >> 14;
				is_1571_[5] = -i_1573_;
				is_1571_[6] = -i_1575_ * i_1576_ + i_1574_ * i_1579_ + 8192 >> 14;
				is_1571_[7] = i_1575_ * i_1577_ + i_1574_ * i_1578_ + 8192 >> 14;
				is_1571_[8] = i_1574_ * i_1572_ + 8192 >> 14;
				int i_1580_ = ((is_1571_[0] * -anInt7902 + is_1571_[1] * -anInt7937 + is_1571_[2] * -anInt7956 + 8192) >> 14);
				int i_1581_ = ((is_1571_[3] * -anInt7902 + is_1571_[4] * -anInt7937 + is_1571_[5] * -anInt7956 + 8192) >> 14);
				int i_1582_ = ((is_1571_[6] * -anInt7902 + is_1571_[7] * -anInt7937 + is_1571_[8] * -anInt7956 + 8192) >> 14);
				int i_1583_ = i_1580_ + anInt7902;
				int i_1584_ = i_1581_ + anInt7937;
				int i_1585_ = i_1582_ + anInt7956;
				int[] is_1586_ = new int[9];
				for (int i_1587_ = 0; i_1587_ < 3; i_1587_++) {
					for (int i_1588_ = 0; i_1588_ < 3; i_1588_++) {
						int i_1589_ = 0;
						for (int i_1590_ = 0; i_1590_ < 3; i_1590_++)
							i_1589_ += (is_1571_[i_1587_ * 3 + i_1590_] * is_1546_[i_1588_ * 3 + i_1590_]);
						is_1586_[i_1587_ * 3 + i_1588_] = i_1589_ + 8192 >> 14;
					}
				}
				int i_1591_ = ((is_1571_[0] * i_1565_ + is_1571_[1] * i_1566_ + is_1571_[2] * i_1567_ + 8192) >> 14);
				int i_1592_ = ((is_1571_[3] * i_1565_ + is_1571_[4] * i_1566_ + is_1571_[5] * i_1567_ + 8192) >> 14);
				int i_1593_ = ((is_1571_[6] * i_1565_ + is_1571_[7] * i_1566_ + is_1571_[8] * i_1567_ + 8192) >> 14);
				i_1591_ += i_1583_;
				i_1592_ += i_1584_;
				i_1593_ += i_1585_;
				int[] is_1594_ = new int[9];
				for (int i_1595_ = 0; i_1595_ < 3; i_1595_++) {
					for (int i_1596_ = 0; i_1596_ < 3; i_1596_++) {
						int i_1597_ = 0;
						for (int i_1598_ = 0; i_1598_ < 3; i_1598_++)
							i_1597_ += (is_1546_[i_1595_ * 3 + i_1598_] * is_1586_[i_1596_ + i_1598_ * 3]);
						is_1594_[i_1595_ * 3 + i_1596_] = i_1597_ + 8192 >> 14;
					}
				}
				int i_1599_ = ((is_1546_[0] * i_1591_ + is_1546_[1] * i_1592_ + is_1546_[2] * i_1593_ + 8192) >> 14);
				int i_1600_ = ((is_1546_[3] * i_1591_ + is_1546_[4] * i_1592_ + is_1546_[5] * i_1593_ + 8192) >> 14);
				int i_1601_ = ((is_1546_[6] * i_1591_ + is_1546_[7] * i_1592_ + is_1546_[8] * i_1593_ + 8192) >> 14);
				i_1599_ += i_1562_;
				i_1600_ += i_1563_;
				i_1601_ += i_1564_;
				for (int i_1602_ = 0; i_1602_ < i_1547_; i_1602_++) {
					int i_1603_ = is[i_1602_];
					if (i_1603_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_1604_ = (((Class387_Sub3) this).anIntArrayArray7918[i_1603_]);
						for (int i_1605_ = 0; i_1605_ < is_1604_.length; i_1605_++) {
							int i_1606_ = is_1604_[i_1605_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_1545_ & (((Class387_Sub3) this).aShortArray7964[i_1606_])) != 0)) {
								int i_1607_ = (is_1594_[0] * (((Class387_Sub3) this).anIntArray7901[i_1606_]) + is_1594_[1] * (((Class387_Sub3) this).anIntArray7895[i_1606_]) + is_1594_[2] * (((Class387_Sub3) this).anIntArray7965[i_1606_]) + 8192) >> 14;
								int i_1608_ = (is_1594_[3] * (((Class387_Sub3) this).anIntArray7901[i_1606_]) + is_1594_[4] * (((Class387_Sub3) this).anIntArray7895[i_1606_]) + is_1594_[5] * (((Class387_Sub3) this).anIntArray7965[i_1606_]) + 8192) >> 14;
								int i_1609_ = (is_1594_[6] * (((Class387_Sub3) this).anIntArray7901[i_1606_]) + is_1594_[7] * (((Class387_Sub3) this).anIntArray7895[i_1606_]) + is_1594_[8] * (((Class387_Sub3) this).anIntArray7965[i_1606_]) + 8192) >> 14;
								i_1607_ += i_1599_;
								i_1608_ += i_1600_;
								i_1609_ += i_1601_;
								((Class387_Sub3) this).anIntArray7901[i_1606_] = i_1607_;
								((Class387_Sub3) this).anIntArray7895[i_1606_] = i_1608_;
								((Class387_Sub3) this).anIntArray7965[i_1606_] = i_1609_;
							}
						}
					}
				}
			} else {
				for (int i_1610_ = 0; i_1610_ < i_1547_; i_1610_++) {
					int i_1611_ = is[i_1610_];
					if (i_1611_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_1612_ = (((Class387_Sub3) this).anIntArrayArray7918[i_1611_]);
						for (int i_1613_ = 0; i_1613_ < is_1612_.length; i_1613_++) {
							int i_1614_ = is_1612_[i_1613_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_1545_ & (((Class387_Sub3) this).aShortArray7964[i_1614_])) != 0)) {
								((Class387_Sub3) this).anIntArray7901[i_1614_] -= anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_1614_] -= anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_1614_] -= anInt7956;
								if (i_1544_ != 0) {
									int i_1615_ = Class220.anIntArray2483[i_1544_];
									int i_1616_ = Class220.anIntArray2474[i_1544_];
									int i_1617_ = ((((Class387_Sub3) this).anIntArray7895[i_1614_]) * i_1615_ + ((((Class387_Sub3) this).anIntArray7901[i_1614_]) * i_1616_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7895[i_1614_] = ((((Class387_Sub3) this).anIntArray7895[i_1614_]) * i_1616_ - ((((Class387_Sub3) this).anIntArray7901[i_1614_]) * i_1615_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7901[i_1614_] = i_1617_;
								}
								if (i_1542_ != 0) {
									int i_1618_ = Class220.anIntArray2483[i_1542_];
									int i_1619_ = Class220.anIntArray2474[i_1542_];
									int i_1620_ = ((((Class387_Sub3) this).anIntArray7895[i_1614_]) * i_1619_ - ((((Class387_Sub3) this).anIntArray7965[i_1614_]) * i_1618_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7965[i_1614_] = ((((Class387_Sub3) this).anIntArray7895[i_1614_]) * i_1618_ + ((((Class387_Sub3) this).anIntArray7965[i_1614_]) * i_1619_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7895[i_1614_] = i_1620_;
								}
								if (i_1543_ != 0) {
									int i_1621_ = Class220.anIntArray2483[i_1543_];
									int i_1622_ = Class220.anIntArray2474[i_1543_];
									int i_1623_ = ((((Class387_Sub3) this).anIntArray7965[i_1614_]) * i_1621_ + ((((Class387_Sub3) this).anIntArray7901[i_1614_]) * i_1622_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7965[i_1614_] = ((((Class387_Sub3) this).anIntArray7965[i_1614_]) * i_1622_ - ((((Class387_Sub3) this).anIntArray7901[i_1614_]) * i_1621_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray7901[i_1614_] = i_1623_;
								}
								((Class387_Sub3) this).anIntArray7901[i_1614_] += anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_1614_] += anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_1614_] += anInt7956;
							}
						}
					}
				}
				if (bool) {
					for (int i_1624_ = 0; i_1624_ < i_1547_; i_1624_++) {
						int i_1625_ = is[i_1624_];
						if (i_1625_ < (((Class387_Sub3) this).anIntArrayArray7918).length) {
							int[] is_1626_ = (((Class387_Sub3) this).anIntArrayArray7918[i_1625_]);
							for (int i_1627_ = 0; i_1627_ < is_1626_.length; i_1627_++) {
								int i_1628_ = is_1626_[i_1627_];
								if ((((Class387_Sub3) this).aShortArray7964 == null) || ((i_1545_ & (((Class387_Sub3) this).aShortArray7964[i_1628_])) != 0)) {
									int i_1629_ = (((Class387_Sub3) this).anIntArray7947[i_1628_]);
									int i_1630_ = (((Class387_Sub3) this).anIntArray7947[i_1628_ + 1]);
									for (int i_1631_ = i_1629_; i_1631_ < i_1630_; i_1631_++) {
										int i_1632_ = ((((Class387_Sub3) this).aShortArray7948[i_1631_]) - 1);
										if (i_1632_ == -1)
											break;
										if (i_1544_ != 0) {
											int i_1633_ = (Class220.anIntArray2483[i_1544_]);
											int i_1634_ = (Class220.anIntArray2474[i_1544_]);
											int i_1635_ = (((((Class387_Sub3) this).aShortArray7910[i_1632_]) * i_1633_ + (((Class387_Sub3) this).aShortArray7909[i_1632_]) * i_1634_ + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7910[i_1632_] = (short) ((((((Class387_Sub3) this).aShortArray7910[i_1632_]) * i_1634_) - ((((Class387_Sub3) this).aShortArray7909[i_1632_]) * i_1633_) + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7909[i_1632_] = (short) i_1635_;
										}
										if (i_1542_ != 0) {
											int i_1636_ = (Class220.anIntArray2483[i_1542_]);
											int i_1637_ = (Class220.anIntArray2474[i_1542_]);
											int i_1638_ = (((((Class387_Sub3) this).aShortArray7910[i_1632_]) * i_1637_ - (((Class387_Sub3) this).aShortArray7919[i_1632_]) * i_1636_ + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7919[i_1632_] = (short) ((((((Class387_Sub3) this).aShortArray7910[i_1632_]) * i_1636_) + ((((Class387_Sub3) this).aShortArray7919[i_1632_]) * i_1637_) + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7910[i_1632_] = (short) i_1638_;
										}
										if (i_1543_ != 0) {
											int i_1639_ = (Class220.anIntArray2483[i_1543_]);
											int i_1640_ = (Class220.anIntArray2474[i_1543_]);
											int i_1641_ = (((((Class387_Sub3) this).aShortArray7919[i_1632_]) * i_1639_ + (((Class387_Sub3) this).aShortArray7909[i_1632_]) * i_1640_ + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7919[i_1632_] = (short) ((((((Class387_Sub3) this).aShortArray7919[i_1632_]) * i_1640_) - ((((Class387_Sub3) this).aShortArray7909[i_1632_]) * i_1639_) + 16383) >> 14);
											((Class387_Sub3) this).aShortArray7909[i_1632_] = (short) i_1641_;
										}
									}
								}
							}
						}
					}
					method4839();
				}
			}
		} else if (i == 3) {
			if (is_1546_ != null) {
				int i_1642_ = is_1546_[9] << 4;
				int i_1643_ = is_1546_[10] << 4;
				int i_1644_ = is_1546_[11] << 4;
				int i_1645_ = is_1546_[12] << 4;
				int i_1646_ = is_1546_[13] << 4;
				int i_1647_ = is_1546_[14] << 4;
				if (aBoolean7905) {
					int i_1648_ = ((is_1546_[0] * anInt7902 + is_1546_[3] * anInt7937 + is_1546_[6] * anInt7956 + 8192) >> 14);
					int i_1649_ = ((is_1546_[1] * anInt7902 + is_1546_[4] * anInt7937 + is_1546_[7] * anInt7956 + 8192) >> 14);
					int i_1650_ = ((is_1546_[2] * anInt7902 + is_1546_[5] * anInt7937 + is_1546_[8] * anInt7956 + 8192) >> 14);
					i_1648_ += i_1645_;
					i_1649_ += i_1646_;
					i_1650_ += i_1647_;
					anInt7902 = i_1648_;
					anInt7937 = i_1649_;
					anInt7956 = i_1650_;
					aBoolean7905 = false;
				}
				int i_1651_ = i_1542_ << 15 >> 7;
				int i_1652_ = i_1543_ << 15 >> 7;
				int i_1653_ = i_1544_ << 15 >> 7;
				int i_1654_ = i_1651_ * -anInt7902 + 8192 >> 14;
				int i_1655_ = i_1652_ * -anInt7937 + 8192 >> 14;
				int i_1656_ = i_1653_ * -anInt7956 + 8192 >> 14;
				int i_1657_ = i_1654_ + anInt7902;
				int i_1658_ = i_1655_ + anInt7937;
				int i_1659_ = i_1656_ + anInt7956;
				int[] is_1660_ = new int[9];
				is_1660_[0] = i_1651_ * is_1546_[0] + 8192 >> 14;
				is_1660_[1] = i_1651_ * is_1546_[3] + 8192 >> 14;
				is_1660_[2] = i_1651_ * is_1546_[6] + 8192 >> 14;
				is_1660_[3] = i_1652_ * is_1546_[1] + 8192 >> 14;
				is_1660_[4] = i_1652_ * is_1546_[4] + 8192 >> 14;
				is_1660_[5] = i_1652_ * is_1546_[7] + 8192 >> 14;
				is_1660_[6] = i_1653_ * is_1546_[2] + 8192 >> 14;
				is_1660_[7] = i_1653_ * is_1546_[5] + 8192 >> 14;
				is_1660_[8] = i_1653_ * is_1546_[8] + 8192 >> 14;
				int i_1661_ = i_1651_ * i_1645_ + 8192 >> 14;
				int i_1662_ = i_1652_ * i_1646_ + 8192 >> 14;
				int i_1663_ = i_1653_ * i_1647_ + 8192 >> 14;
				i_1661_ += i_1657_;
				i_1662_ += i_1658_;
				i_1663_ += i_1659_;
				int[] is_1664_ = new int[9];
				for (int i_1665_ = 0; i_1665_ < 3; i_1665_++) {
					for (int i_1666_ = 0; i_1666_ < 3; i_1666_++) {
						int i_1667_ = 0;
						for (int i_1668_ = 0; i_1668_ < 3; i_1668_++)
							i_1667_ += (is_1546_[i_1665_ * 3 + i_1668_] * is_1660_[i_1666_ + i_1668_ * 3]);
						is_1664_[i_1665_ * 3 + i_1666_] = i_1667_ + 8192 >> 14;
					}
				}
				int i_1669_ = ((is_1546_[0] * i_1661_ + is_1546_[1] * i_1662_ + is_1546_[2] * i_1663_ + 8192) >> 14);
				int i_1670_ = ((is_1546_[3] * i_1661_ + is_1546_[4] * i_1662_ + is_1546_[5] * i_1663_ + 8192) >> 14);
				int i_1671_ = ((is_1546_[6] * i_1661_ + is_1546_[7] * i_1662_ + is_1546_[8] * i_1663_ + 8192) >> 14);
				i_1669_ += i_1642_;
				i_1670_ += i_1643_;
				i_1671_ += i_1644_;
				for (int i_1672_ = 0; i_1672_ < i_1547_; i_1672_++) {
					int i_1673_ = is[i_1672_];
					if (i_1673_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_1674_ = (((Class387_Sub3) this).anIntArrayArray7918[i_1673_]);
						for (int i_1675_ = 0; i_1675_ < is_1674_.length; i_1675_++) {
							int i_1676_ = is_1674_[i_1675_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_1545_ & (((Class387_Sub3) this).aShortArray7964[i_1676_])) != 0)) {
								int i_1677_ = (is_1664_[0] * (((Class387_Sub3) this).anIntArray7901[i_1676_]) + is_1664_[1] * (((Class387_Sub3) this).anIntArray7895[i_1676_]) + is_1664_[2] * (((Class387_Sub3) this).anIntArray7965[i_1676_]) + 8192) >> 14;
								int i_1678_ = (is_1664_[3] * (((Class387_Sub3) this).anIntArray7901[i_1676_]) + is_1664_[4] * (((Class387_Sub3) this).anIntArray7895[i_1676_]) + is_1664_[5] * (((Class387_Sub3) this).anIntArray7965[i_1676_]) + 8192) >> 14;
								int i_1679_ = (is_1664_[6] * (((Class387_Sub3) this).anIntArray7901[i_1676_]) + is_1664_[7] * (((Class387_Sub3) this).anIntArray7895[i_1676_]) + is_1664_[8] * (((Class387_Sub3) this).anIntArray7965[i_1676_]) + 8192) >> 14;
								i_1677_ += i_1669_;
								i_1678_ += i_1670_;
								i_1679_ += i_1671_;
								((Class387_Sub3) this).anIntArray7901[i_1676_] = i_1677_;
								((Class387_Sub3) this).anIntArray7895[i_1676_] = i_1678_;
								((Class387_Sub3) this).anIntArray7965[i_1676_] = i_1679_;
							}
						}
					}
				}
			} else {
				for (int i_1680_ = 0; i_1680_ < i_1547_; i_1680_++) {
					int i_1681_ = is[i_1680_];
					if (i_1681_ < ((Class387_Sub3) this).anIntArrayArray7918.length) {
						int[] is_1682_ = (((Class387_Sub3) this).anIntArrayArray7918[i_1681_]);
						for (int i_1683_ = 0; i_1683_ < is_1682_.length; i_1683_++) {
							int i_1684_ = is_1682_[i_1683_];
							if (((Class387_Sub3) this).aShortArray7964 == null || ((i_1545_ & (((Class387_Sub3) this).aShortArray7964[i_1684_])) != 0)) {
								((Class387_Sub3) this).anIntArray7901[i_1684_] -= anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_1684_] -= anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_1684_] -= anInt7956;
								((Class387_Sub3) this).anIntArray7901[i_1684_] = (((Class387_Sub3) this).anIntArray7901[i_1684_]) * i_1542_ >> 7;
								((Class387_Sub3) this).anIntArray7895[i_1684_] = (((Class387_Sub3) this).anIntArray7895[i_1684_]) * i_1543_ >> 7;
								((Class387_Sub3) this).anIntArray7965[i_1684_] = (((Class387_Sub3) this).anIntArray7965[i_1684_]) * i_1544_ >> 7;
								((Class387_Sub3) this).anIntArray7901[i_1684_] += anInt7902;
								((Class387_Sub3) this).anIntArray7895[i_1684_] += anInt7937;
								((Class387_Sub3) this).anIntArray7965[i_1684_] += anInt7956;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub3) this).anIntArrayArray7924 != null) {
				boolean bool_1685_ = false;
				for (int i_1686_ = 0; i_1686_ < i_1547_; i_1686_++) {
					int i_1687_ = is[i_1686_];
					if (i_1687_ < ((Class387_Sub3) this).anIntArrayArray7924.length) {
						int[] is_1688_ = (((Class387_Sub3) this).anIntArrayArray7924[i_1687_]);
						for (int i_1689_ = 0; i_1689_ < is_1688_.length; i_1689_++) {
							int i_1690_ = is_1688_[i_1689_];
							if (((Class387_Sub3) this).aShortArray7925 == null || ((i_1545_ & (((Class387_Sub3) this).aShortArray7925[i_1690_])) != 0)) {
								int i_1691_ = (((((Class387_Sub3) this).aByteArray7963[i_1690_]) & 0xff) + i_1542_ * 8);
								if (i_1691_ < 0)
									i_1691_ = 0;
								else if (i_1691_ > 255)
									i_1691_ = 255;
								((Class387_Sub3) this).aByteArray7963[i_1690_] = (byte) i_1691_;
							}
						}
						bool_1685_ = bool_1685_ | is_1688_.length > 0;
					}
				}
				if (bool_1685_) {
					if (((Class387_Sub3) this).aClass191Array7952 != null) {
						for (int i_1692_ = 0; i_1692_ < ((Class387_Sub3) this).anInt7951; i_1692_++) {
							Class191 class191 = (((Class387_Sub3) this).aClass191Array7952[i_1692_]);
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[i_1692_]);
							((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & 0xffffff | 255 - ((((Class387_Sub3) this).aByteArray7963[((Class191) class191).anInt1947]) & 0xff) << 24);
						}
					}
					method4838();
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub3) this).anIntArrayArray7924 != null) {
				boolean bool_1693_ = false;
				for (int i_1694_ = 0; i_1694_ < i_1547_; i_1694_++) {
					int i_1695_ = is[i_1694_];
					if (i_1695_ < ((Class387_Sub3) this).anIntArrayArray7924.length) {
						int[] is_1696_ = (((Class387_Sub3) this).anIntArrayArray7924[i_1695_]);
						for (int i_1697_ = 0; i_1697_ < is_1696_.length; i_1697_++) {
							int i_1698_ = is_1696_[i_1697_];
							if (((Class387_Sub3) this).aShortArray7925 == null || ((i_1545_ & (((Class387_Sub3) this).aShortArray7925[i_1698_])) != 0)) {
								int i_1699_ = ((((Class387_Sub3) this).aShortArray7935[i_1698_]) & 0xffff);
								int i_1700_ = i_1699_ >> 10 & 0x3f;
								int i_1701_ = i_1699_ >> 7 & 0x7;
								int i_1702_ = i_1699_ & 0x7f;
								i_1700_ = i_1700_ + i_1542_ & 0x3f;
								i_1701_ += i_1543_ / 4;
								if (i_1701_ < 0)
									i_1701_ = 0;
								else if (i_1701_ > 7)
									i_1701_ = 7;
								i_1702_ += i_1544_;
								if (i_1702_ < 0)
									i_1702_ = 0;
								else if (i_1702_ > 127)
									i_1702_ = 127;
								((Class387_Sub3) this).aShortArray7935[i_1698_] = (short) (i_1700_ << 10 | i_1701_ << 7 | i_1702_);
							}
						}
						bool_1693_ = bool_1693_ | is_1696_.length > 0;
					}
				}
				if (bool_1693_) {
					if (((Class387_Sub3) this).aClass191Array7952 != null) {
						for (int i_1703_ = 0; i_1703_ < ((Class387_Sub3) this).anInt7951; i_1703_++) {
							Class191 class191 = (((Class387_Sub3) this).aClass191Array7952[i_1703_]);
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[i_1703_]);
							((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | (Class294.anIntArray3165[((((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff)]) & 0xffffff);
						}
					}
					method4838();
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_1704_ = 0; i_1704_ < i_1547_; i_1704_++) {
					int i_1705_ = is[i_1704_];
					if (i_1705_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_1706_ = (((Class387_Sub3) this).anIntArrayArray7946[i_1705_]);
						for (int i_1707_ = 0; i_1707_ < is_1706_.length; i_1707_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_1706_[i_1707_]]);
							((Class166) class166).anInt1704 += i_1542_;
							((Class166) class166).anInt1705 += i_1543_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_1708_ = 0; i_1708_ < i_1547_; i_1708_++) {
					int i_1709_ = is[i_1708_];
					if (i_1709_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_1710_ = (((Class387_Sub3) this).anIntArrayArray7946[i_1709_]);
						for (int i_1711_ = 0; i_1711_ < is_1710_.length; i_1711_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_1710_[i_1711_]]);
							((Class166) class166).anInt1702 = (((Class166) class166).anInt1702 * i_1542_ >> 7);
							((Class166) class166).anInt1701 = (((Class166) class166).anInt1701 * i_1543_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub3) this).anIntArrayArray7946 != null) {
				for (int i_1712_ = 0; i_1712_ < i_1547_; i_1712_++) {
					int i_1713_ = is[i_1712_];
					if (i_1713_ < ((Class387_Sub3) this).anIntArrayArray7946.length) {
						int[] is_1714_ = (((Class387_Sub3) this).anIntArrayArray7946[i_1713_]);
						for (int i_1715_ = 0; i_1715_ < is_1714_.length; i_1715_++) {
							Class166 class166 = (((Class387_Sub3) this).aClass166Array7892[is_1714_[i_1715_]]);
							((Class166) class166).anInt1706 = (((Class166) class166).anInt1706 + i_1542_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	public void method4783(Matrix3f class222) {
		Matrix4f class233 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236;
		class233.method2145(class222);
		if (((Class387_Sub3) this).aClass85Array7949 != null) {
			for (int i = 0; i < ((Class387_Sub3) this).aClass85Array7949.length; i++) {
				Class85 class85 = ((Class387_Sub3) this).aClass85Array7949[i];
				Class85 class85_1716_ = class85;
				if (class85.aClass85_776 != null)
					class85_1716_ = class85.aClass85_776;
				class85_1716_.anInt777 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt773 * -710317103)])))) * -1879868075);
				class85_1716_.anInt783 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt773 * -710317103)])))) * -2041556771);
				class85_1716_.anInt779 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt773 * -710317103)])))) * -1434499227);
				class85_1716_.anInt772 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt774 * 1705862021)])))) * 1070341177);
				class85_1716_.anInt781 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt774 * 1705862021)])))) * 1802851857);
				class85_1716_.anInt782 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt774 * 1705862021)])))) * 103846281;
				class85_1716_.anInt771 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt775 * 1636170731)])))) * -2103324039);
				class85_1716_.anInt784 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt775 * 1636170731)])))) * -526039059);
				class85_1716_.anInt785 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt775 * 1636170731)])))) * 491030489;
			}
		}
		if (((Class387_Sub3) this).aClass68Array7904 != null) {
			for (int i = 0; i < ((Class387_Sub3) this).aClass68Array7904.length; i++) {
				Class68 class68 = ((Class387_Sub3) this).aClass68Array7904[i];
				Class68 class68_1717_ = class68;
				if (class68.aClass68_672 != null)
					class68_1717_ = class68.aClass68_672;
				if (class68.aClass233_677 != null)
					class68.aClass233_677.method2142(class233);
				else
					class68.aClass233_677 = new Matrix4f(class233);
				class68_1717_.anInt671 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class68.anInt674 * -180596249)])))) * -1436341053);
				class68_1717_.anInt675 = (int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class68.anInt674 * -180596249)])))) * 449866009;
				class68_1717_.anInt676 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class68.anInt674 * -180596249)])))) * 1336328763);
			}
		}
	}

	public void S(int i) {
		int i_1718_ = Class220.anIntArray2483[i];
		int i_1719_ = Class220.anIntArray2474[i];
		for (int i_1720_ = 0; i_1720_ < ((Class387_Sub3) this).anInt7900; i_1720_++) {
			int i_1721_ = ((((Class387_Sub3) this).anIntArray7965[i_1720_] * i_1718_ + ((Class387_Sub3) this).anIntArray7901[i_1720_] * i_1719_) >> 14);
			((Class387_Sub3) this).anIntArray7965[i_1720_] = ((((Class387_Sub3) this).anIntArray7965[i_1720_] * i_1719_ - ((Class387_Sub3) this).anIntArray7901[i_1720_] * i_1718_) >> 14);
			((Class387_Sub3) this).anIntArray7901[i_1720_] = i_1721_;
		}
		for (int i_1722_ = 0; i_1722_ < ((Class387_Sub3) this).anInt7906; i_1722_++) {
			int i_1723_ = ((((Class387_Sub3) this).aShortArray7919[i_1722_] * i_1718_ + (((Class387_Sub3) this).aShortArray7909[i_1722_] * i_1719_)) >> 14);
			((Class387_Sub3) this).aShortArray7919[i_1722_] = (short) (((((Class387_Sub3) this).aShortArray7919[i_1722_] * i_1719_) - (((Class387_Sub3) this).aShortArray7909[i_1722_] * i_1718_)) >> 14);
			((Class387_Sub3) this).aShortArray7909[i_1722_] = (short) i_1723_;
		}
		method4851();
		method4839();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public Class387 method4749(byte i, int i_1724_, boolean bool) {
		boolean bool_1725_ = false;
		Class387_Sub3 class387_sub3_1726_;
		Class387_Sub3 class387_sub3_1727_;
		if (i > 0 && i <= 7) {
			class387_sub3_1727_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass387_Sub3Array8267[i - 1]);
			class387_sub3_1726_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).aClass387_Sub3Array8288[i - 1]);
			bool_1725_ = true;
		} else
			class387_sub3_1726_ = class387_sub3_1727_ = new Class387_Sub3(((Class387_Sub3) this).aClass_ra_Sub3_7894, 0, 0, true, false);
		return method4836(class387_sub3_1726_, class387_sub3_1727_, i_1724_, bool_1725_, bool);
	}

	public int cf() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7941;
	}

	public void KA(int i) {
		if (((Class387_Sub3) this).aClass186_7927 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7927).aBoolean1901 = Class154.method1685(i, ((Class387_Sub3) this).anInt7896);
		if (((Class387_Sub3) this).aClass186_7930 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7930).aBoolean1901 = Class154.method1692(i, ((Class387_Sub3) this).anInt7896);
		if (((Class387_Sub3) this).aClass186_7911 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7911).aBoolean1901 = Class154.method1680(i, ((Class387_Sub3) this).anInt7896);
		if (((Class387_Sub3) this).aClass186_7934 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7934).aBoolean1901 = Class154.method1669(i, ((Class387_Sub3) this).anInt7896);
		((Class387_Sub3) this).anInt7912 = i;
		if (((Class387_Sub3) this).aClass185_7915 != null && (((Class387_Sub3) this).anInt7912 & 0x10000) == 0) {
			((Class387_Sub3) this).aShortArray7909 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1899);
			((Class387_Sub3) this).aShortArray7910 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1897);
			((Class387_Sub3) this).aShortArray7919 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1896);
			((Class387_Sub3) this).aByteArray7958 = (((Class185) ((Class387_Sub3) this).aClass185_7915).aByteArray1898);
			((Class387_Sub3) this).aClass185_7915 = null;
		}
		((Class387_Sub3) this).aBoolean7932 = true;
		method4837();
	}

	public int dg() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7942;
	}

	public int dl() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7942;
	}

	public int ci() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7928;
	}

	public int ds() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7943;
	}

	public void bx(int i) {
		int i_1728_ = Class220.anIntArray2483[i];
		int i_1729_ = Class220.anIntArray2474[i];
		for (int i_1730_ = 0; i_1730_ < ((Class387_Sub3) this).anInt7900; i_1730_++) {
			int i_1731_ = ((((Class387_Sub3) this).anIntArray7965[i_1730_] * i_1728_ + ((Class387_Sub3) this).anIntArray7901[i_1730_] * i_1729_) >> 14);
			((Class387_Sub3) this).anIntArray7965[i_1730_] = ((((Class387_Sub3) this).anIntArray7965[i_1730_] * i_1729_ - ((Class387_Sub3) this).anIntArray7901[i_1730_] * i_1728_) >> 14);
			((Class387_Sub3) this).anIntArray7901[i_1730_] = i_1731_;
		}
		for (int i_1732_ = 0; i_1732_ < ((Class387_Sub3) this).anInt7906; i_1732_++) {
			int i_1733_ = ((((Class387_Sub3) this).aShortArray7919[i_1732_] * i_1728_ + (((Class387_Sub3) this).aShortArray7909[i_1732_] * i_1729_)) >> 14);
			((Class387_Sub3) this).aShortArray7919[i_1732_] = (short) (((((Class387_Sub3) this).aShortArray7919[i_1732_] * i_1729_) - (((Class387_Sub3) this).aShortArray7909[i_1732_] * i_1728_)) >> 14);
			((Class387_Sub3) this).aShortArray7909[i_1732_] = (short) i_1733_;
		}
		method4851();
		method4839();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public void dd(int i) {
		((Class387_Sub3) this).aShort7897 = (short) i;
		method4838();
	}

	public void method4747(Class387 class387, int i, int i_1734_, int i_1735_, boolean bool) {
		Class387_Sub3 class387_sub3_1736_ = (Class387_Sub3) class387;
		if (((Class387_Sub3) this).anInt7916 != 0 && ((Class387_Sub3) class387_sub3_1736_).anInt7916 != 0) {
			int i_1737_ = ((Class387_Sub3) class387_sub3_1736_).anInt7900;
			int[] is = ((Class387_Sub3) class387_sub3_1736_).anIntArray7901;
			int[] is_1738_ = ((Class387_Sub3) class387_sub3_1736_).anIntArray7895;
			int[] is_1739_ = ((Class387_Sub3) class387_sub3_1736_).anIntArray7965;
			short[] is_1740_ = ((Class387_Sub3) class387_sub3_1736_).aShortArray7909;
			short[] is_1741_ = ((Class387_Sub3) class387_sub3_1736_).aShortArray7910;
			short[] is_1742_ = ((Class387_Sub3) class387_sub3_1736_).aShortArray7919;
			byte[] is_1743_ = ((Class387_Sub3) class387_sub3_1736_).aByteArray7958;
			short[] is_1744_;
			short[] is_1745_;
			short[] is_1746_;
			byte[] is_1747_;
			if (((Class387_Sub3) this).aClass185_7915 != null) {
				is_1744_ = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1899);
				is_1745_ = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1897);
				is_1746_ = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1896);
				is_1747_ = (((Class185) ((Class387_Sub3) this).aClass185_7915).aByteArray1898);
			} else {
				is_1744_ = null;
				is_1745_ = null;
				is_1746_ = null;
				is_1747_ = null;
			}
			short[] is_1748_;
			short[] is_1749_;
			short[] is_1750_;
			byte[] is_1751_;
			if (((Class387_Sub3) class387_sub3_1736_).aClass185_7915 != null) {
				is_1748_ = ((Class185) (((Class387_Sub3) class387_sub3_1736_).aClass185_7915)).aShortArray1899;
				is_1749_ = ((Class185) (((Class387_Sub3) class387_sub3_1736_).aClass185_7915)).aShortArray1897;
				is_1750_ = ((Class185) (((Class387_Sub3) class387_sub3_1736_).aClass185_7915)).aShortArray1896;
				is_1751_ = ((Class185) (((Class387_Sub3) class387_sub3_1736_).aClass185_7915)).aByteArray1898;
			} else {
				is_1748_ = null;
				is_1749_ = null;
				is_1750_ = null;
				is_1751_ = null;
			}
			int[] is_1752_ = ((Class387_Sub3) class387_sub3_1736_).anIntArray7947;
			short[] is_1753_ = ((Class387_Sub3) class387_sub3_1736_).aShortArray7948;
			if (!((Class387_Sub3) class387_sub3_1736_).aBoolean7950)
				class387_sub3_1736_.method4832();
			int i_1754_ = ((Class387_Sub3) class387_sub3_1736_).anInt7938;
			int i_1755_ = ((Class387_Sub3) class387_sub3_1736_).anInt7939;
			int i_1756_ = ((Class387_Sub3) class387_sub3_1736_).anInt7940;
			int i_1757_ = ((Class387_Sub3) class387_sub3_1736_).anInt7941;
			int i_1758_ = ((Class387_Sub3) class387_sub3_1736_).anInt7942;
			int i_1759_ = ((Class387_Sub3) class387_sub3_1736_).anInt7943;
			for (int i_1760_ = 0; i_1760_ < ((Class387_Sub3) this).anInt7900; i_1760_++) {
				int i_1761_ = ((Class387_Sub3) this).anIntArray7895[i_1760_] - i_1734_;
				if (i_1761_ >= i_1754_ && i_1761_ <= i_1755_) {
					int i_1762_ = ((Class387_Sub3) this).anIntArray7901[i_1760_] - i;
					if (i_1762_ >= i_1756_ && i_1762_ <= i_1757_) {
						int i_1763_ = (((Class387_Sub3) this).anIntArray7965[i_1760_] - i_1735_);
						if (i_1763_ >= i_1758_ && i_1763_ <= i_1759_) {
							int i_1764_ = -1;
							int i_1765_ = (((Class387_Sub3) this).anIntArray7947[i_1760_]);
							int i_1766_ = (((Class387_Sub3) this).anIntArray7947[i_1760_ + 1]);
							for (int i_1767_ = i_1765_; i_1767_ < i_1766_; i_1767_++) {
								i_1764_ = (((Class387_Sub3) this).aShortArray7948[i_1767_]) - 1;
								if (i_1764_ == -1 || (((Class387_Sub3) this).aByteArray7958[i_1764_]) != 0)
									break;
							}
							if (i_1764_ != -1) {
								for (int i_1768_ = 0; i_1768_ < i_1737_; i_1768_++) {
									if (i_1762_ == is[i_1768_] && i_1763_ == is_1739_[i_1768_] && i_1761_ == is_1738_[i_1768_]) {
										int i_1769_ = -1;
										i_1765_ = is_1752_[i_1768_];
										i_1766_ = is_1752_[i_1768_ + 1];
										for (int i_1770_ = i_1765_; i_1770_ < i_1766_; i_1770_++) {
											i_1769_ = is_1753_[i_1770_] - 1;
											if (i_1769_ == -1 || is_1743_[i_1769_] != 0)
												break;
										}
										if (i_1769_ != -1) {
											if (is_1744_ == null) {
												((Class387_Sub3) this).aClass185_7915 = new Class185();
												is_1744_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aShortArray1899 = (Class378.method4670((((Class387_Sub3) this).aShortArray7909), (byte) -109));
												is_1745_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aShortArray1897 = (Class378.method4670((((Class387_Sub3) this).aShortArray7910), (byte) -95));
												is_1746_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aShortArray1896 = (Class378.method4670((((Class387_Sub3) this).aShortArray7919), (byte) -95));
												is_1747_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aByteArray1898 = (Class409.method4978((((Class387_Sub3) this).aByteArray7958), 1194497584));
											}
											if (is_1748_ == null) {
												Class185 class185 = (((Class387_Sub3) class387_sub3_1736_).aClass185_7915 = new Class185());
												is_1748_ = ((Class185) class185).aShortArray1899 = (Class378.method4670(is_1740_, (byte) -48));
												is_1749_ = ((Class185) class185).aShortArray1897 = (Class378.method4670(is_1741_, (byte) -67));
												is_1750_ = ((Class185) class185).aShortArray1896 = (Class378.method4670(is_1742_, (byte) -93));
												is_1751_ = ((Class185) class185).aByteArray1898 = (Class409.method4978(is_1743_, 1194497584));
											}
											short i_1771_ = (((Class387_Sub3) this).aShortArray7909[i_1764_]);
											short i_1772_ = (((Class387_Sub3) this).aShortArray7910[i_1764_]);
											short i_1773_ = (((Class387_Sub3) this).aShortArray7919[i_1764_]);
											byte i_1774_ = (((Class387_Sub3) this).aByteArray7958[i_1764_]);
											i_1765_ = is_1752_[i_1768_];
											i_1766_ = is_1752_[i_1768_ + 1];
											for (int i_1775_ = i_1765_; i_1775_ < i_1766_; i_1775_++) {
												int i_1776_ = is_1753_[i_1775_] - 1;
												if (i_1776_ == -1)
													break;
												if (is_1751_[i_1776_] != 0) {
													is_1748_[i_1776_] += i_1771_;
													is_1749_[i_1776_] += i_1772_;
													is_1750_[i_1776_] += i_1773_;
													is_1751_[i_1776_] += i_1774_;
												}
											}
											i_1771_ = is_1740_[i_1769_];
											i_1772_ = is_1741_[i_1769_];
											i_1773_ = is_1742_[i_1769_];
											i_1774_ = is_1743_[i_1769_];
											i_1765_ = (((Class387_Sub3) this).anIntArray7947[i_1760_]);
											i_1766_ = (((Class387_Sub3) this).anIntArray7947[i_1760_ + 1]);
											for (int i_1777_ = i_1765_; i_1777_ < i_1766_; i_1777_++) {
												int i_1778_ = ((((Class387_Sub3) this).aShortArray7948[i_1777_]) - 1);
												if (i_1778_ == -1)
													break;
												if (is_1747_[i_1778_] != 0) {
													is_1744_[i_1778_] += i_1771_;
													is_1745_[i_1778_] += i_1772_;
													is_1746_[i_1778_] += i_1773_;
													is_1747_[i_1778_] += i_1774_;
												}
											}
											class387_sub3_1736_.method4839();
											method4839();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void dc(int i) {
		((Class387_Sub3) this).aShort7898 = (short) i;
		method4851();
		method4839();
	}

	public int dh() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7938;
	}

	public int dn() {
		return ((Class387_Sub3) this).aShort7898;
	}

	public byte[] method_do() {
		return ((Class387_Sub3) this).aByteArray7963;
	}

	public void method4768(byte i, byte[] is) {
		if (is == null) {
			for (int i_1779_ = 0; i_1779_ < ((Class387_Sub3) this).anInt7916; i_1779_++)
				((Class387_Sub3) this).aByteArray7963[i_1779_] = i;
		} else {
			for (int i_1780_ = 0; i_1780_ < ((Class387_Sub3) this).anInt7916; i_1780_++) {
				int i_1781_ = 255 - ((255 - (is[i_1780_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class387_Sub3) this).aByteArray7963[i_1780_] = (byte) i_1781_;
			}
		}
		method4838();
	}

	public void method4769(byte i, byte[] is) {
		if (is == null) {
			for (int i_1782_ = 0; i_1782_ < ((Class387_Sub3) this).anInt7916; i_1782_++)
				((Class387_Sub3) this).aByteArray7963[i_1782_] = i;
		} else {
			for (int i_1783_ = 0; i_1783_ < ((Class387_Sub3) this).anInt7916; i_1783_++) {
				int i_1784_ = 255 - ((255 - (is[i_1783_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class387_Sub3) this).aByteArray7963[i_1783_] = (byte) i_1784_;
			}
		}
		method4838();
	}

	public void du(short i, short i_1785_) {
		Interface_ma interface_ma = ((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface_ma5299;
		for (int i_1786_ = 0; i_1786_ < ((Class387_Sub3) this).anInt7916; i_1786_++) {
			if (((Class387_Sub3) this).aShortArray7923[i_1786_] == i)
				((Class387_Sub3) this).aShortArray7923[i_1786_] = i_1785_;
		}
		byte i_1787_ = 0;
		byte i_1788_ = 0;
		if (i != -1) {
			Class53 class53 = interface_ma.method174(i & 0xffff, 536301787);
			i_1787_ = class53.aByte533;
			i_1788_ = class53.aByte534;
		}
		byte i_1789_ = 0;
		byte i_1790_ = 0;
		if (i_1785_ != -1) {
			Class53 class53 = interface_ma.method174(i_1785_ & 0xffff, 696074580);
			i_1789_ = class53.aByte533;
			i_1790_ = class53.aByte534;
			if (class53.aByte535 != 0 || class53.aByte509 != 0)
				((Class387_Sub3) this).aBoolean7903 = true;
		}
		if (i_1787_ != i_1789_ | i_1788_ != i_1790_) {
			if (((Class387_Sub3) this).aClass191Array7952 != null) {
				for (int i_1791_ = 0; i_1791_ < ((Class387_Sub3) this).anInt7951; i_1791_++) {
					Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_1791_];
					Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_1791_];
					((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
				}
			}
			method4838();
		}
	}

	public void dv(short i, short i_1792_) {
		Interface_ma interface_ma = ((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface_ma5299;
		for (int i_1793_ = 0; i_1793_ < ((Class387_Sub3) this).anInt7916; i_1793_++) {
			if (((Class387_Sub3) this).aShortArray7923[i_1793_] == i)
				((Class387_Sub3) this).aShortArray7923[i_1793_] = i_1792_;
		}
		byte i_1794_ = 0;
		byte i_1795_ = 0;
		if (i != -1) {
			Class53 class53 = interface_ma.method174(i & 0xffff, 1294573076);
			i_1794_ = class53.aByte533;
			i_1795_ = class53.aByte534;
		}
		byte i_1796_ = 0;
		byte i_1797_ = 0;
		if (i_1792_ != -1) {
			Class53 class53 = interface_ma.method174(i_1792_ & 0xffff, 277630297);
			i_1796_ = class53.aByte533;
			i_1797_ = class53.aByte534;
			if (class53.aByte535 != 0 || class53.aByte509 != 0)
				((Class387_Sub3) this).aBoolean7903 = true;
		}
		if (i_1794_ != i_1796_ | i_1795_ != i_1797_) {
			if (((Class387_Sub3) this).aClass191Array7952 != null) {
				for (int i_1798_ = 0; i_1798_ < ((Class387_Sub3) this).anInt7951; i_1798_++) {
					Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_1798_];
					Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_1798_];
					((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
				}
			}
			method4838();
		}
	}

	public void di(short i, short i_1799_) {
		Interface_ma interface_ma = ((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface_ma5299;
		for (int i_1800_ = 0; i_1800_ < ((Class387_Sub3) this).anInt7916; i_1800_++) {
			if (((Class387_Sub3) this).aShortArray7923[i_1800_] == i)
				((Class387_Sub3) this).aShortArray7923[i_1800_] = i_1799_;
		}
		byte i_1801_ = 0;
		byte i_1802_ = 0;
		if (i != -1) {
			Class53 class53 = interface_ma.method174(i & 0xffff, 1548685895);
			i_1801_ = class53.aByte533;
			i_1802_ = class53.aByte534;
		}
		byte i_1803_ = 0;
		byte i_1804_ = 0;
		if (i_1799_ != -1) {
			Class53 class53 = interface_ma.method174(i_1799_ & 0xffff, 1149419492);
			i_1803_ = class53.aByte533;
			i_1804_ = class53.aByte534;
			if (class53.aByte535 != 0 || class53.aByte509 != 0)
				((Class387_Sub3) this).aBoolean7903 = true;
		}
		if (i_1801_ != i_1803_ | i_1802_ != i_1804_) {
			if (((Class387_Sub3) this).aClass191Array7952 != null) {
				for (int i_1805_ = 0; i_1805_ < ((Class387_Sub3) this).anInt7951; i_1805_++) {
					Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_1805_];
					Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_1805_];
					((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
				}
			}
			method4838();
		}
	}

	public void df(short i, short i_1806_) {
		Interface_ma interface_ma = ((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface_ma5299;
		for (int i_1807_ = 0; i_1807_ < ((Class387_Sub3) this).anInt7916; i_1807_++) {
			if (((Class387_Sub3) this).aShortArray7923[i_1807_] == i)
				((Class387_Sub3) this).aShortArray7923[i_1807_] = i_1806_;
		}
		byte i_1808_ = 0;
		byte i_1809_ = 0;
		if (i != -1) {
			Class53 class53 = interface_ma.method174(i & 0xffff, 1866757821);
			i_1808_ = class53.aByte533;
			i_1809_ = class53.aByte534;
		}
		byte i_1810_ = 0;
		byte i_1811_ = 0;
		if (i_1806_ != -1) {
			Class53 class53 = interface_ma.method174(i_1806_ & 0xffff, 1664949994);
			i_1810_ = class53.aByte533;
			i_1811_ = class53.aByte534;
			if (class53.aByte535 != 0 || class53.aByte509 != 0)
				((Class387_Sub3) this).aBoolean7903 = true;
		}
		if (i_1808_ != i_1810_ | i_1809_ != i_1811_) {
			if (((Class387_Sub3) this).aClass191Array7952 != null) {
				for (int i_1812_ = 0; i_1812_ < ((Class387_Sub3) this).anInt7951; i_1812_++) {
					Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_1812_];
					Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_1812_];
					((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
				}
			}
			method4838();
		}
	}

	public int ec() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7939;
	}

	public void dt(int i, int i_1813_, int i_1814_, int i_1815_) {
		for (int i_1816_ = 0; i_1816_ < ((Class387_Sub3) this).anInt7916; i_1816_++) {
			int i_1817_ = ((Class387_Sub3) this).aShortArray7935[i_1816_] & 0xffff;
			int i_1818_ = i_1817_ >> 10 & 0x3f;
			int i_1819_ = i_1817_ >> 7 & 0x7;
			int i_1820_ = i_1817_ & 0x7f;
			if (i != -1)
				i_1818_ += (i - i_1818_) * i_1815_ >> 7;
			if (i_1813_ != -1)
				i_1819_ += (i_1813_ - i_1819_) * i_1815_ >> 7;
			if (i_1814_ != -1)
				i_1820_ += (i_1814_ - i_1820_) * i_1815_ >> 7;
			((Class387_Sub3) this).aShortArray7935[i_1816_] = (short) (i_1818_ << 10 | i_1819_ << 7 | i_1820_);
		}
		if (((Class387_Sub3) this).aClass191Array7952 != null) {
			for (int i_1821_ = 0; i_1821_ < ((Class387_Sub3) this).anInt7951; i_1821_++) {
				Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_1821_];
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_1821_];
				((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
			}
		}
		method4838();
	}

	public boolean ev() {
		return ((Class387_Sub3) this).aBoolean7893;
	}

	public void dr(int i, int i_1822_, int i_1823_, int i_1824_) {
		for (int i_1825_ = 0; i_1825_ < ((Class387_Sub3) this).anInt7916; i_1825_++) {
			int i_1826_ = ((Class387_Sub3) this).aShortArray7935[i_1825_] & 0xffff;
			int i_1827_ = i_1826_ >> 10 & 0x3f;
			int i_1828_ = i_1826_ >> 7 & 0x7;
			int i_1829_ = i_1826_ & 0x7f;
			if (i != -1)
				i_1827_ += (i - i_1827_) * i_1824_ >> 7;
			if (i_1822_ != -1)
				i_1828_ += (i_1822_ - i_1828_) * i_1824_ >> 7;
			if (i_1823_ != -1)
				i_1829_ += (i_1823_ - i_1829_) * i_1824_ >> 7;
			((Class387_Sub3) this).aShortArray7935[i_1825_] = (short) (i_1827_ << 10 | i_1828_ << 7 | i_1829_);
		}
		if (((Class387_Sub3) this).aClass191Array7952 != null) {
			for (int i_1830_ = 0; i_1830_ < ((Class387_Sub3) this).anInt7951; i_1830_++) {
				Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_1830_];
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_1830_];
				((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
			}
		}
		method4838();
	}

	Class387_Sub3(Class_ra_Sub3 class_ra_sub3, Model model, int i, int i_1831_, int i_1832_, int i_1833_) {
		this(class_ra_sub3, i, i_1833_, true, false);
		Interface_ma interface_ma = class_ra_sub3.anInterface_ma5299;
		int[] is = new int[model.triangles];
		((Class387_Sub3) this).anIntArray7947 = new int[model.anInt626 + 1];
		for (int i_1834_ = 0; i_1834_ < model.triangles; i_1834_++) {
			if (model.face_fill_attributes == null || model.face_fill_attributes[i_1834_] != 2) {
				if (model.aShortArray617 != null && model.aShortArray617[i_1834_] != -1) {
					Class53 class53 = interface_ma.method174((model.aShortArray617[i_1834_]) & 0xffff, 854670928);
					if (((((Class387_Sub3) this).anInt7896 & 0x40) == 0 || !class53.aBoolean524) && class53.aBoolean538)
						continue;
				}
				is[((Class387_Sub3) this).anInt7916++] = i_1834_;
				((Class387_Sub3) this).anIntArray7947[(model.aShortArray644[i_1834_])]++;
				((Class387_Sub3) this).anIntArray7947[(model.aShortArray646[i_1834_])]++;
				((Class387_Sub3) this).anIntArray7947[(model.aShortArray624[i_1834_])]++;
			}
		}
		((Class387_Sub3) this).anInt7917 = ((Class387_Sub3) this).anInt7916;
		long[] ls = new long[((Class387_Sub3) this).anInt7916];
		boolean bool = (((Class387_Sub3) this).anInt7912 & 0x100) != 0;
		for (int i_1835_ = 0; i_1835_ < ((Class387_Sub3) this).anInt7916; i_1835_++) {
			int i_1836_ = is[i_1835_];
			Class53 class53 = null;
			int i_1837_ = 0;
			int i_1838_ = 0;
			int i_1839_ = 0;
			int i_1840_ = 0;
			if (model.aClass84Array649 != null) {
				boolean bool_1841_ = false;
				for (int i_1842_ = 0; i_1842_ < model.aClass84Array649.length; i_1842_++) {
					Class84 class84 = model.aClass84Array649[i_1842_];
					if (i_1836_ == class84.anInt767 * 1512514121) {
						Class173 class173 = Linkable.method2844((class84.anInt768 * 1834782277), 1266955447);
						if (class173.aBoolean1757)
							bool_1841_ = true;
						if (class173.anInt1751 * 39181267 != -1) {
							Class53 class53_1843_ = interface_ma.method174((class173.anInt1751 * 39181267), 991625180);
							if (class53_1843_.anInt528 * -2138060883 == 2)
								((Class387_Sub3) this).aBoolean7893 = true;
						}
					}
				}
				if (bool_1841_) {
					ls[i_1835_] = 9223372036854775807L;
					((Class387_Sub3) this).anInt7917--;
					continue;
				}
			}
			int i_1844_ = -1;
			if (model.aShortArray617 != null) {
				i_1844_ = model.aShortArray617[i_1836_];
				if (i_1844_ != -1) {
					class53 = interface_ma.method174(i_1844_ & 0xffff, 1849620785);
					if ((((Class387_Sub3) this).anInt7896 & 0x40) == 0 || !class53.aBoolean524) {
						i_1839_ = class53.aByte529;
						i_1840_ = class53.aByte536;
					} else {
						i_1844_ = -1;
						class53 = null;
					}
				}
			}
			boolean bool_1845_ = ((model.aByteArray627 != null && model.aByteArray627[i_1836_] != 0) || class53 != null && class53.anInt528 * -2138060883 != 0);
			if ((bool || bool_1845_) && model.priorities != null)
				i_1837_ += model.priorities[i_1836_] << 17;
			if (bool_1845_)
				i_1837_ += 65536;
			i_1837_ += (i_1839_ & 0xff) << 8;
			i_1837_ += i_1840_ & 0xff;
			i_1838_ += (i_1844_ & 0xffff) << 16;
			i_1838_ += i_1835_ & 0xffff;
			ls[i_1835_] = ((long) i_1837_ << 32) + (long) i_1838_;
			((Class387_Sub3) this).aBoolean7893 |= bool_1845_;
			Class387_Sub3 class387_sub3_1846_ = this;
			((Class387_Sub3) class387_sub3_1846_).aBoolean7903 = (((Class387_Sub3) class387_sub3_1846_).aBoolean7903 | (class53 != null && (class53.aByte535 != 0 || class53.aByte509 != 0)));
		}
		Class277.method2598(ls, is, (byte) 8);
		((Class387_Sub3) this).anInt7899 = model.vertices;
		((Class387_Sub3) this).anInt7900 = model.anInt626;
		((Class387_Sub3) this).anIntArray7901 = model.anIntArray616;
		((Class387_Sub3) this).anIntArray7895 = model.anIntArray642;
		((Class387_Sub3) this).anIntArray7965 = model.anIntArray618;
		((Class387_Sub3) this).aShortArray7964 = model.aShortArray620;
		Class184[] class184s = new Class184[((Class387_Sub3) this).anInt7900];
		((Class387_Sub3) this).aClass85Array7949 = model.aClass85Array647;
		((Class387_Sub3) this).aClass68Array7904 = model.aClass68Array613;
		if (model.aClass84Array649 != null) {
			((Class387_Sub3) this).anInt7951 = model.aClass84Array649.length;
			((Class387_Sub3) this).aClass191Array7952 = new Class191[((Class387_Sub3) this).anInt7951];
			((Class387_Sub3) this).aClass166Array7892 = new Class166[((Class387_Sub3) this).anInt7951];
			for (int i_1847_ = 0; i_1847_ < ((Class387_Sub3) this).anInt7951; i_1847_++) {
				Class84 class84 = model.aClass84Array649[i_1847_];
				Class173 class173 = Linkable.method2844(class84.anInt768 * 1834782277, 1209275845);
				int i_1848_ = -1;
				for (int i_1849_ = 0; i_1849_ < ((Class387_Sub3) this).anInt7916; i_1849_++) {
					if (is[i_1849_] == class84.anInt767 * 1512514121) {
						i_1848_ = i_1849_;
						break;
					}
				}
				int i_1850_ = ((Class294.anIntArray3165[(model.aShortArray629[class84.anInt767 * 1512514121] & 0xffff)]) & 0xffffff);
				i_1850_ = i_1850_ | 255 - (model.aByteArray627 != null ? (model.aByteArray627[class84.anInt767 * 1512514121]) : 0) << 24;
				((Class387_Sub3) this).aClass191Array7952[i_1847_] = (new Class191(i_1848_, model.aShortArray644[class84.anInt767 * 1512514121], model.aShortArray646[class84.anInt767 * 1512514121], model.aShortArray624[class84.anInt767 * 1512514121], class173.anInt1755 * 1951943953, class173.anInt1753 * 893949695, class173.anInt1751 * 39181267, class173.anInt1752 * -310074719, class173.anInt1754 * 1092922159, class173.aBoolean1757, class173.aBoolean1748, class84.anInt769 * 2010148771));
				((Class387_Sub3) this).aClass166Array7892[i_1847_] = new Class166(i_1850_);
			}
		}
		int i_1851_ = ((Class387_Sub3) this).anInt7916 * 3;
		((Class387_Sub3) this).aShortArray7907 = new short[i_1851_];
		((Class387_Sub3) this).aShortArray7908 = new short[i_1851_];
		((Class387_Sub3) this).aShortArray7909 = new short[i_1851_];
		((Class387_Sub3) this).aShortArray7910 = new short[i_1851_];
		((Class387_Sub3) this).aShortArray7919 = new short[i_1851_];
		((Class387_Sub3) this).aByteArray7958 = new byte[i_1851_];
		((Class387_Sub3) this).aFloatArray7953 = new float[i_1851_];
		((Class387_Sub3) this).aFloatArray7914 = new float[i_1851_];
		((Class387_Sub3) this).aShortArray7935 = new short[((Class387_Sub3) this).anInt7916];
		((Class387_Sub3) this).aByteArray7963 = new byte[((Class387_Sub3) this).anInt7916];
		((Class387_Sub3) this).aShortArray7920 = new short[((Class387_Sub3) this).anInt7916];
		((Class387_Sub3) this).aShortArray7921 = new short[((Class387_Sub3) this).anInt7916];
		((Class387_Sub3) this).aShortArray7922 = new short[((Class387_Sub3) this).anInt7916];
		((Class387_Sub3) this).aShortArray7923 = new short[((Class387_Sub3) this).anInt7916];
		if (model.aShortArray615 != null)
			((Class387_Sub3) this).aShortArray7925 = new short[((Class387_Sub3) this).anInt7916];
		((Class387_Sub3) this).aShort7897 = (short) i_1831_;
		((Class387_Sub3) this).aShort7898 = (short) i_1832_;
		((Class387_Sub3) this).aShortArray7948 = new short[i_1851_];
		aLongArray7955 = new long[i_1851_];
		int i_1852_ = 0;
		for (int i_1853_ = 0; i_1853_ < model.anInt626; i_1853_++) {
			int i_1854_ = ((Class387_Sub3) this).anIntArray7947[i_1853_];
			((Class387_Sub3) this).anIntArray7947[i_1853_] = i_1852_;
			i_1852_ += i_1854_;
			class184s[i_1853_] = new Class184();
		}
		((Class387_Sub3) this).anIntArray7947[model.anInt626] = i_1852_;
		Class76 class76 = method4785(model, is, ((Class387_Sub3) this).anInt7916);
		Class189[] class189s = new Class189[model.triangles];
		for (int i_1855_ = 0; i_1855_ < model.triangles; i_1855_++) {
			short i_1856_ = model.aShortArray644[i_1855_];
			short i_1857_ = model.aShortArray646[i_1855_];
			short i_1858_ = model.aShortArray624[i_1855_];
			int i_1859_ = (((Class387_Sub3) this).anIntArray7901[i_1857_] - ((Class387_Sub3) this).anIntArray7901[i_1856_]);
			int i_1860_ = (((Class387_Sub3) this).anIntArray7895[i_1857_] - ((Class387_Sub3) this).anIntArray7895[i_1856_]);
			int i_1861_ = (((Class387_Sub3) this).anIntArray7965[i_1857_] - ((Class387_Sub3) this).anIntArray7965[i_1856_]);
			int i_1862_ = (((Class387_Sub3) this).anIntArray7901[i_1858_] - ((Class387_Sub3) this).anIntArray7901[i_1856_]);
			int i_1863_ = (((Class387_Sub3) this).anIntArray7895[i_1858_] - ((Class387_Sub3) this).anIntArray7895[i_1856_]);
			int i_1864_ = (((Class387_Sub3) this).anIntArray7965[i_1858_] - ((Class387_Sub3) this).anIntArray7965[i_1856_]);
			int i_1865_ = i_1860_ * i_1864_ - i_1863_ * i_1861_;
			int i_1866_ = i_1861_ * i_1862_ - i_1864_ * i_1859_;
			int i_1867_;
			for (i_1867_ = i_1859_ * i_1863_ - i_1862_ * i_1860_; (i_1865_ > 8192 || i_1866_ > 8192 || i_1867_ > 8192 || i_1865_ < -8192 || i_1866_ < -8192 || i_1867_ < -8192); i_1867_ >>= 1) {
				i_1865_ >>= 1;
				i_1866_ >>= 1;
			}
			int i_1868_ = (int) Math.sqrt((double) (i_1865_ * i_1865_ + i_1866_ * i_1866_ + i_1867_ * i_1867_));
			if (i_1868_ <= 0)
				i_1868_ = 1;
			i_1865_ = i_1865_ * 256 / i_1868_;
			i_1866_ = i_1866_ * 256 / i_1868_;
			i_1867_ = i_1867_ * 256 / i_1868_;
			byte i_1869_ = (model.face_fill_attributes == null ? (byte) 0 : model.face_fill_attributes[i_1855_]);
			if (i_1869_ == 0) {
				Class184 class184 = class184s[i_1856_];
				((Class184) class184).anInt1894 += i_1865_;
				((Class184) class184).anInt1893 += i_1866_;
				((Class184) class184).anInt1892 += i_1867_;
				((Class184) class184).anInt1895++;
				class184 = class184s[i_1857_];
				((Class184) class184).anInt1894 += i_1865_;
				((Class184) class184).anInt1893 += i_1866_;
				((Class184) class184).anInt1892 += i_1867_;
				((Class184) class184).anInt1895++;
				class184 = class184s[i_1858_];
				((Class184) class184).anInt1894 += i_1865_;
				((Class184) class184).anInt1893 += i_1866_;
				((Class184) class184).anInt1892 += i_1867_;
				((Class184) class184).anInt1895++;
			} else if (i_1869_ == 1) {
				Class189 class189 = class189s[i_1855_] = new Class189();
				((Class189) class189).anInt1915 = i_1865_;
				((Class189) class189).anInt1916 = i_1866_;
				((Class189) class189).anInt1914 = i_1867_;
			}
		}
		for (int i_1870_ = 0; i_1870_ < ((Class387_Sub3) this).anInt7916; i_1870_++) {
			int i_1871_ = is[i_1870_];
			int i_1872_ = model.aShortArray629[i_1871_] & 0xffff;
			int i_1873_;
			if (model.aByteArray635 == null)
				i_1873_ = -1;
			else
				i_1873_ = model.aByteArray635[i_1871_];
			int i_1874_;
			if (model.aByteArray627 == null)
				i_1874_ = 0;
			else
				i_1874_ = model.aByteArray627[i_1871_] & 0xff;
			short i_1875_ = (model.aShortArray617 == null ? (short) -1 : model.aShortArray617[i_1871_]);
			if (i_1875_ != -1 && (((Class387_Sub3) this).anInt7896 & 0x40) != 0) {
				Class53 class53 = interface_ma.method174(i_1875_ & 0xffff, 1230249869);
				if (class53.aBoolean524)
					i_1875_ = (short) -1;
			}
			float f = 0.0F;
			float f_1876_ = 0.0F;
			float f_1877_ = 0.0F;
			float f_1878_ = 0.0F;
			float f_1879_ = 0.0F;
			float f_1880_ = 0.0F;
			int i_1881_ = 0;
			int i_1882_ = 0;
			int i_1883_ = 0;
			if (i_1875_ != -1) {
				if (i_1873_ == -1) {
					f = 0.0F;
					f_1876_ = 1.0F;
					f_1877_ = 1.0F;
					f_1878_ = 1.0F;
					i_1881_ = 1;
					f_1879_ = 0.0F;
					f_1880_ = 0.0F;
					i_1882_ = 2;
				} else {
					i_1873_ &= 0xff;
					byte i_1884_ = model.tex_fill_attr[i_1873_];
					if (i_1884_ == 0) {
						short i_1885_ = model.aShortArray644[i_1871_];
						short i_1886_ = model.aShortArray646[i_1871_];
						short i_1887_ = model.aShortArray624[i_1871_];
						short i_1888_ = model.tex_point_mapx[i_1873_];
						short i_1889_ = model.tex_point_mapy[i_1873_];
						short i_1890_ = model.tex_point_mapz[i_1873_];
						float f_1891_ = (float) model.anIntArray616[i_1888_];
						float f_1892_ = (float) model.anIntArray642[i_1888_];
						float f_1893_ = (float) model.anIntArray618[i_1888_];
						float f_1894_ = (float) model.anIntArray616[i_1889_] - f_1891_;
						float f_1895_ = (float) model.anIntArray642[i_1889_] - f_1892_;
						float f_1896_ = (float) model.anIntArray618[i_1889_] - f_1893_;
						float f_1897_ = (float) model.anIntArray616[i_1890_] - f_1891_;
						float f_1898_ = (float) model.anIntArray642[i_1890_] - f_1892_;
						float f_1899_ = (float) model.anIntArray618[i_1890_] - f_1893_;
						float f_1900_ = (float) model.anIntArray616[i_1885_] - f_1891_;
						float f_1901_ = (float) model.anIntArray642[i_1885_] - f_1892_;
						float f_1902_ = (float) model.anIntArray618[i_1885_] - f_1893_;
						float f_1903_ = (float) model.anIntArray616[i_1886_] - f_1891_;
						float f_1904_ = (float) model.anIntArray642[i_1886_] - f_1892_;
						float f_1905_ = (float) model.anIntArray618[i_1886_] - f_1893_;
						float f_1906_ = (float) model.anIntArray616[i_1887_] - f_1891_;
						float f_1907_ = (float) model.anIntArray642[i_1887_] - f_1892_;
						float f_1908_ = (float) model.anIntArray618[i_1887_] - f_1893_;
						float f_1909_ = f_1895_ * f_1899_ - f_1896_ * f_1898_;
						float f_1910_ = f_1896_ * f_1897_ - f_1894_ * f_1899_;
						float f_1911_ = f_1894_ * f_1898_ - f_1895_ * f_1897_;
						float f_1912_ = f_1898_ * f_1911_ - f_1899_ * f_1910_;
						float f_1913_ = f_1899_ * f_1909_ - f_1897_ * f_1911_;
						float f_1914_ = f_1897_ * f_1910_ - f_1898_ * f_1909_;
						float f_1915_ = 1.0F / (f_1912_ * f_1894_ + f_1913_ * f_1895_ + f_1914_ * f_1896_);
						f = (f_1912_ * f_1900_ + f_1913_ * f_1901_ + f_1914_ * f_1902_) * f_1915_;
						f_1877_ = (f_1912_ * f_1903_ + f_1913_ * f_1904_ + f_1914_ * f_1905_) * f_1915_;
						f_1879_ = (f_1912_ * f_1906_ + f_1913_ * f_1907_ + f_1914_ * f_1908_) * f_1915_;
						f_1912_ = f_1895_ * f_1911_ - f_1896_ * f_1910_;
						f_1913_ = f_1896_ * f_1909_ - f_1894_ * f_1911_;
						f_1914_ = f_1894_ * f_1910_ - f_1895_ * f_1909_;
						f_1915_ = 1.0F / (f_1912_ * f_1897_ + f_1913_ * f_1898_ + f_1914_ * f_1899_);
						f_1876_ = (f_1912_ * f_1900_ + f_1913_ * f_1901_ + f_1914_ * f_1902_) * f_1915_;
						f_1878_ = (f_1912_ * f_1903_ + f_1913_ * f_1904_ + f_1914_ * f_1905_) * f_1915_;
						f_1880_ = (f_1912_ * f_1906_ + f_1913_ * f_1907_ + f_1914_ * f_1908_) * f_1915_;
					} else {
						short i_1916_ = model.aShortArray644[i_1871_];
						short i_1917_ = model.aShortArray646[i_1871_];
						short i_1918_ = model.aShortArray624[i_1871_];
						int i_1919_ = class76.anIntArray713[i_1873_];
						int i_1920_ = class76.anIntArray710[i_1873_];
						int i_1921_ = class76.anIntArray709[i_1873_];
						float[] fs = class76.aFloatArrayArray711[i_1873_];
						byte i_1922_ = model.aByteArray628[i_1873_];
						float f_1923_ = (float) model.anIntArray637[i_1873_] / 256.0F;
						if (i_1884_ == 1) {
							float f_1924_ = ((float) model.particles_xdir[i_1873_] / 1024.0F);
							method4744(model.anIntArray616[i_1916_], model.anIntArray642[i_1916_], model.anIntArray618[i_1916_], i_1919_, i_1920_, i_1921_, fs, f_1924_, i_1922_, f_1923_, aFloatArray7962);
							f = aFloatArray7962[0];
							f_1876_ = aFloatArray7962[1];
							method4744(model.anIntArray616[i_1917_], model.anIntArray642[i_1917_], model.anIntArray618[i_1917_], i_1919_, i_1920_, i_1921_, fs, f_1924_, i_1922_, f_1923_, aFloatArray7962);
							f_1877_ = aFloatArray7962[0];
							f_1878_ = aFloatArray7962[1];
							method4744(model.anIntArray616[i_1918_], model.anIntArray642[i_1918_], model.anIntArray618[i_1918_], i_1919_, i_1920_, i_1921_, fs, f_1924_, i_1922_, f_1923_, aFloatArray7962);
							f_1879_ = aFloatArray7962[0];
							f_1880_ = aFloatArray7962[1];
							float f_1925_ = f_1924_ / 2.0F;
							if ((i_1922_ & 0x1) == 0) {
								if (f_1877_ - f > f_1925_) {
									f_1877_ -= f_1924_;
									i_1881_ = 1;
								} else if (f - f_1877_ > f_1925_) {
									f_1877_ += f_1924_;
									i_1881_ = 2;
								}
								if (f_1879_ - f > f_1925_) {
									f_1879_ -= f_1924_;
									i_1882_ = 1;
								} else if (f - f_1879_ > f_1925_) {
									f_1879_ += f_1924_;
									i_1882_ = 2;
								}
							} else {
								if (f_1878_ - f_1876_ > f_1925_) {
									f_1878_ -= f_1924_;
									i_1881_ = 1;
								} else if (f_1876_ - f_1878_ > f_1925_) {
									f_1878_ += f_1924_;
									i_1881_ = 2;
								}
								if (f_1880_ - f_1876_ > f_1925_) {
									f_1880_ -= f_1924_;
									i_1882_ = 1;
								} else if (f_1876_ - f_1880_ > f_1925_) {
									f_1880_ += f_1924_;
									i_1882_ = 2;
								}
							}
						} else if (i_1884_ == 2) {
							float f_1926_ = ((float) model.tex_primary_clr[i_1873_] / 256.0F);
							float f_1927_ = ((float) model.tex_secondary_clr[i_1873_] / 256.0F);
							int i_1928_ = (model.anIntArray616[i_1917_] - model.anIntArray616[i_1916_]);
							int i_1929_ = (model.anIntArray642[i_1917_] - model.anIntArray642[i_1916_]);
							int i_1930_ = (model.anIntArray618[i_1917_] - model.anIntArray618[i_1916_]);
							int i_1931_ = (model.anIntArray616[i_1918_] - model.anIntArray616[i_1916_]);
							int i_1932_ = (model.anIntArray642[i_1918_] - model.anIntArray642[i_1916_]);
							int i_1933_ = (model.anIntArray618[i_1918_] - model.anIntArray618[i_1916_]);
							int i_1934_ = i_1929_ * i_1933_ - i_1932_ * i_1930_;
							int i_1935_ = i_1930_ * i_1931_ - i_1933_ * i_1928_;
							int i_1936_ = i_1928_ * i_1932_ - i_1931_ * i_1929_;
							float f_1937_ = (64.0F / (float) model.particles_zlifepsan[i_1873_]);
							float f_1938_ = (64.0F / (float) model.particles_zdir[i_1873_]);
							float f_1939_ = (64.0F / (float) model.particles_xdir[i_1873_]);
							float f_1940_ = (((float) i_1934_ * fs[0] + (float) i_1935_ * fs[1] + (float) i_1936_ * fs[2]) / f_1937_);
							float f_1941_ = (((float) i_1934_ * fs[3] + (float) i_1935_ * fs[4] + (float) i_1936_ * fs[5]) / f_1938_);
							float f_1942_ = (((float) i_1934_ * fs[6] + (float) i_1935_ * fs[7] + (float) i_1936_ * fs[8]) / f_1939_);
							i_1883_ = method4729(f_1940_, f_1941_, f_1942_);
							method4730(model.anIntArray616[i_1916_], model.anIntArray642[i_1916_], model.anIntArray618[i_1916_], i_1919_, i_1920_, i_1921_, i_1883_, fs, i_1922_, f_1923_, f_1926_, f_1927_, aFloatArray7962);
							f = aFloatArray7962[0];
							f_1876_ = aFloatArray7962[1];
							method4730(model.anIntArray616[i_1917_], model.anIntArray642[i_1917_], model.anIntArray618[i_1917_], i_1919_, i_1920_, i_1921_, i_1883_, fs, i_1922_, f_1923_, f_1926_, f_1927_, aFloatArray7962);
							f_1877_ = aFloatArray7962[0];
							f_1878_ = aFloatArray7962[1];
							method4730(model.anIntArray616[i_1918_], model.anIntArray642[i_1918_], model.anIntArray618[i_1918_], i_1919_, i_1920_, i_1921_, i_1883_, fs, i_1922_, f_1923_, f_1926_, f_1927_, aFloatArray7962);
							f_1879_ = aFloatArray7962[0];
							f_1880_ = aFloatArray7962[1];
						} else if (i_1884_ == 3) {
							method4780(model.anIntArray616[i_1916_], model.anIntArray642[i_1916_], model.anIntArray618[i_1916_], i_1919_, i_1920_, i_1921_, fs, i_1922_, f_1923_, aFloatArray7962);
							f = aFloatArray7962[0];
							f_1876_ = aFloatArray7962[1];
							method4780(model.anIntArray616[i_1917_], model.anIntArray642[i_1917_], model.anIntArray618[i_1917_], i_1919_, i_1920_, i_1921_, fs, i_1922_, f_1923_, aFloatArray7962);
							f_1877_ = aFloatArray7962[0];
							f_1878_ = aFloatArray7962[1];
							method4780(model.anIntArray616[i_1918_], model.anIntArray642[i_1918_], model.anIntArray618[i_1918_], i_1919_, i_1920_, i_1921_, fs, i_1922_, f_1923_, aFloatArray7962);
							f_1879_ = aFloatArray7962[0];
							f_1880_ = aFloatArray7962[1];
							if ((i_1922_ & 0x1) == 0) {
								if (f_1877_ - f > 0.5F) {
									f_1877_--;
									i_1881_ = 1;
								} else if (f - f_1877_ > 0.5F) {
									f_1877_++;
									i_1881_ = 2;
								}
								if (f_1879_ - f > 0.5F) {
									f_1879_--;
									i_1882_ = 1;
								} else if (f - f_1879_ > 0.5F) {
									f_1879_++;
									i_1882_ = 2;
								}
							} else {
								if (f_1878_ - f_1876_ > 0.5F) {
									f_1878_--;
									i_1881_ = 1;
								} else if (f_1876_ - f_1878_ > 0.5F) {
									f_1878_++;
									i_1881_ = 2;
								}
								if (f_1880_ - f_1876_ > 0.5F) {
									f_1880_--;
									i_1882_ = 1;
								} else if (f_1876_ - f_1880_ > 0.5F) {
									f_1880_++;
									i_1882_ = 2;
								}
							}
						}
					}
				}
			}
			byte i_1943_;
			if (model.face_fill_attributes == null)
				i_1943_ = (byte) 0;
			else
				i_1943_ = model.face_fill_attributes[i_1871_];
			if (i_1943_ == 0) {
				long l = ((long) (i_1873_ << 2) + (((long) (i_1883_ << 24) + (long) (i_1872_ << 8) + (long) i_1874_) << 32));
				short i_1944_ = model.aShortArray644[i_1871_];
				short i_1945_ = model.aShortArray646[i_1871_];
				short i_1946_ = model.aShortArray624[i_1871_];
				Class184 class184 = class184s[i_1944_];
				((Class387_Sub3) this).aShortArray7920[i_1870_] = method4848(model, i_1944_, i_1870_, l, ((Class184) class184).anInt1894, ((Class184) class184).anInt1893, ((Class184) class184).anInt1892, ((Class184) class184).anInt1895, f, f_1876_);
				class184 = class184s[i_1945_];
				((Class387_Sub3) this).aShortArray7921[i_1870_] = method4848(model, i_1945_, i_1870_, l + (long) i_1881_, ((Class184) class184).anInt1894, ((Class184) class184).anInt1893, ((Class184) class184).anInt1892, ((Class184) class184).anInt1895, f_1877_, f_1878_);
				class184 = class184s[i_1946_];
				((Class387_Sub3) this).aShortArray7922[i_1870_] = method4848(model, i_1946_, i_1870_, l + (long) i_1882_, ((Class184) class184).anInt1894, ((Class184) class184).anInt1893, ((Class184) class184).anInt1892, ((Class184) class184).anInt1895, f_1879_, f_1880_);
			} else if (i_1943_ == 1) {
				Class189 class189 = class189s[i_1871_];
				long l = ((long) ((i_1873_ << 2) + (((Class189) class189).anInt1915 > 0 ? 1024 : 2048) + (((Class189) class189).anInt1916 + 256 << 12) + (((Class189) class189).anInt1914 + 256 << 22)) + (((long) (i_1883_ << 24) + (long) (i_1872_ << 8) + (long) i_1874_) << 32));
				((Class387_Sub3) this).aShortArray7920[i_1870_] = method4848(model, model.aShortArray644[i_1871_], i_1870_, l, ((Class189) class189).anInt1915, ((Class189) class189).anInt1916, ((Class189) class189).anInt1914, 0, f, f_1876_);
				((Class387_Sub3) this).aShortArray7921[i_1870_] = method4848(model, model.aShortArray646[i_1871_], i_1870_, l + (long) i_1881_, ((Class189) class189).anInt1915, ((Class189) class189).anInt1916, ((Class189) class189).anInt1914, 0, f_1877_, f_1878_);
				((Class387_Sub3) this).aShortArray7922[i_1870_] = method4848(model, model.aShortArray624[i_1871_], i_1870_, l + (long) i_1882_, ((Class189) class189).anInt1915, ((Class189) class189).anInt1916, ((Class189) class189).anInt1914, 0, f_1879_, f_1880_);
			}
			if (model.aByteArray627 != null)
				((Class387_Sub3) this).aByteArray7963[i_1870_] = model.aByteArray627[i_1871_];
			if (model.aShortArray615 != null)
				((Class387_Sub3) this).aShortArray7925[i_1870_] = model.aShortArray615[i_1871_];
			((Class387_Sub3) this).aShortArray7935[i_1870_] = model.aShortArray629[i_1871_];
			((Class387_Sub3) this).aShortArray7923[i_1870_] = i_1875_;
		}
		if (((Class387_Sub3) this).anInt7917 > 0) {
			int i_1947_ = 1;
			short i_1948_ = ((Class387_Sub3) this).aShortArray7923[0];
			for (int i_1949_ = 0; i_1949_ < ((Class387_Sub3) this).anInt7917; i_1949_++) {
				short i_1950_ = ((Class387_Sub3) this).aShortArray7923[i_1949_];
				if (i_1950_ != i_1948_) {
					i_1947_++;
					i_1948_ = i_1950_;
				}
			}
			((Class387_Sub3) this).anIntArray7945 = new int[i_1947_];
			((Class387_Sub3) this).anIntArray7913 = new int[i_1947_];
			((Class387_Sub3) this).anIntArray7944 = new int[i_1947_ + 1];
			((Class387_Sub3) this).anIntArray7944[0] = 0;
			int i_1951_ = ((Class387_Sub3) this).anInt7906;
			int i_1952_ = 0;
			i_1947_ = 0;
			i_1948_ = ((Class387_Sub3) this).aShortArray7923[0];
			for (int i_1953_ = 0; i_1953_ < ((Class387_Sub3) this).anInt7917; i_1953_++) {
				short i_1954_ = ((Class387_Sub3) this).aShortArray7923[i_1953_];
				if (i_1954_ != i_1948_) {
					((Class387_Sub3) this).anIntArray7945[i_1947_] = i_1951_;
					((Class387_Sub3) this).anIntArray7913[i_1947_] = i_1952_ - i_1951_ + 1;
					((Class387_Sub3) this).anIntArray7944[++i_1947_] = i_1953_;
					i_1951_ = ((Class387_Sub3) this).anInt7906;
					i_1952_ = 0;
					i_1948_ = i_1954_;
				}
				int i_1955_ = ((Class387_Sub3) this).aShortArray7920[i_1953_];
				if (i_1955_ < i_1951_)
					i_1951_ = i_1955_;
				if (i_1955_ > i_1952_)
					i_1952_ = i_1955_;
				i_1955_ = ((Class387_Sub3) this).aShortArray7921[i_1953_];
				if (i_1955_ < i_1951_)
					i_1951_ = i_1955_;
				if (i_1955_ > i_1952_)
					i_1952_ = i_1955_;
				i_1955_ = ((Class387_Sub3) this).aShortArray7922[i_1953_];
				if (i_1955_ < i_1951_)
					i_1951_ = i_1955_;
				if (i_1955_ > i_1952_)
					i_1952_ = i_1955_;
			}
			((Class387_Sub3) this).anIntArray7945[i_1947_] = i_1951_;
			((Class387_Sub3) this).anIntArray7913[i_1947_] = i_1952_ - i_1951_ + 1;
			((Class387_Sub3) this).anIntArray7944[++i_1947_] = ((Class387_Sub3) this).anInt7917;
		}
		aLongArray7955 = null;
		((Class387_Sub3) this).aShortArray7907 = method4834(((Class387_Sub3) this).aShortArray7907, ((Class387_Sub3) this).anInt7906);
		((Class387_Sub3) this).aShortArray7908 = method4834(((Class387_Sub3) this).aShortArray7908, ((Class387_Sub3) this).anInt7906);
		((Class387_Sub3) this).aShortArray7909 = method4834(((Class387_Sub3) this).aShortArray7909, ((Class387_Sub3) this).anInt7906);
		((Class387_Sub3) this).aShortArray7910 = method4834(((Class387_Sub3) this).aShortArray7910, ((Class387_Sub3) this).anInt7906);
		((Class387_Sub3) this).aShortArray7919 = method4834(((Class387_Sub3) this).aShortArray7919, ((Class387_Sub3) this).anInt7906);
		((Class387_Sub3) this).aByteArray7958 = method4833(((Class387_Sub3) this).aByteArray7958, ((Class387_Sub3) this).anInt7906);
		((Class387_Sub3) this).aFloatArray7953 = method4847(((Class387_Sub3) this).aFloatArray7953, ((Class387_Sub3) this).anInt7906);
		((Class387_Sub3) this).aFloatArray7914 = method4847(((Class387_Sub3) this).aFloatArray7914, ((Class387_Sub3) this).anInt7906);
		if (model.vertexSkinTypes != null && Class154.method1678(i, ((Class387_Sub3) this).anInt7896))
			((Class387_Sub3) this).anIntArrayArray7918 = model.method749(false);
		if (model.aClass84Array649 != null && Class154.method1679(i, ((Class387_Sub3) this).anInt7896))
			((Class387_Sub3) this).anIntArrayArray7946 = model.method759();
		if (model.alpha_channel != null && Class154.method1677(i, ((Class387_Sub3) this).anInt7896)) {
			int i_1956_ = 0;
			int[] is_1957_ = new int[256];
			for (int i_1958_ = 0; i_1958_ < ((Class387_Sub3) this).anInt7916; i_1958_++) {
				int i_1959_ = model.alpha_channel[is[i_1958_]];
				if (i_1959_ >= 0) {
					is_1957_[i_1959_]++;
					if (i_1959_ > i_1956_)
						i_1956_ = i_1959_;
				}
			}
			((Class387_Sub3) this).anIntArrayArray7924 = new int[i_1956_ + 1][];
			for (int i_1960_ = 0; i_1960_ <= i_1956_; i_1960_++) {
				((Class387_Sub3) this).anIntArrayArray7924[i_1960_] = new int[is_1957_[i_1960_]];
				is_1957_[i_1960_] = 0;
			}
			for (int i_1961_ = 0; i_1961_ < ((Class387_Sub3) this).anInt7916; i_1961_++) {
				int i_1962_ = model.alpha_channel[is[i_1961_]];
				if (i_1962_ >= 0)
					((Class387_Sub3) this).anIntArrayArray7924[i_1962_][is_1957_[i_1962_]++] = i_1961_;
			}
		}
	}

	public Class68[] method4773() {
		return ((Class387_Sub3) this).aClass68Array7904;
	}

	public Class68[] method4774() {
		return ((Class387_Sub3) this).aClass68Array7904;
	}

	boolean bj() {
		if (((Class387_Sub3) this).anIntArrayArray7918 == null)
			return false;
		for (int i = 0; i < ((Class387_Sub3) this).anInt7899; i++) {
			((Class387_Sub3) this).anIntArray7901[i] <<= 4;
			((Class387_Sub3) this).anIntArray7895[i] <<= 4;
			((Class387_Sub3) this).anIntArray7965[i] <<= 4;
		}
		anInt7902 = 0;
		anInt7937 = 0;
		anInt7956 = 0;
		return true;
	}

	public boolean ex() {
		return ((Class387_Sub3) this).aBoolean7903;
	}

	public Class_na ga(Class_na class_na) {
		if (((Class387_Sub3) this).anInt7906 == 0)
			return null;
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		int i;
		int i_1963_;
		if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8299) > 0) {
			i = ((((Class387_Sub3) this).anInt7940 - ((((Class387_Sub3) this).anInt7939 * ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8299) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
			i_1963_ = ((((Class387_Sub3) this).anInt7941 - ((((Class387_Sub3) this).anInt7938 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8299) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
		} else {
			i = ((((Class387_Sub3) this).anInt7940 - ((((Class387_Sub3) this).anInt7938 * ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8299) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
			i_1963_ = ((((Class387_Sub3) this).anInt7941 - ((((Class387_Sub3) this).anInt7939 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8299) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
		}
		int i_1964_;
		int i_1965_;
		if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8317) > 0) {
			i_1964_ = ((((Class387_Sub3) this).anInt7942 - ((((Class387_Sub3) this).anInt7939 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8317) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
			i_1965_ = ((((Class387_Sub3) this).anInt7943 - ((((Class387_Sub3) this).anInt7938 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8317) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
		} else {
			i_1964_ = ((((Class387_Sub3) this).anInt7942 - ((((Class387_Sub3) this).anInt7938 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8317) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
			i_1965_ = ((((Class387_Sub3) this).anInt7943 - ((((Class387_Sub3) this).anInt7939 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8317) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
		}
		int i_1966_ = i_1963_ - i + 1;
		int i_1967_ = i_1965_ - i_1964_ + 1;
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		Class_na_Sub2 class_na_sub2_1968_;
		if (class_na_sub2 != null && class_na_sub2.method3489(i_1966_, i_1967_)) {
			class_na_sub2_1968_ = class_na_sub2;
			class_na_sub2_1968_.method3487();
		} else
			class_na_sub2_1968_ = new Class_na_Sub2(((Class387_Sub3) this).aClass_ra_Sub3_7894, i_1966_, i_1967_);
		class_na_sub2_1968_.method3486(i, i_1964_, i_1963_, i_1965_);
		method4842(class_na_sub2_1968_);
		return class_na_sub2_1968_;
	}

	public boolean method4777() {
		if (((Class387_Sub3) this).aShortArray7923 == null)
			return true;
		for (int i = 0; i < ((Class387_Sub3) this).aShortArray7923.length; i++) {
			if (((Class387_Sub3) this).aShortArray7923[i] != -1 && !(((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface_ma5299.method170(((Class387_Sub3) this).aShortArray7923[i], (short) 24767)))
				return false;
		}
		return true;
	}

	public boolean method4778() {
		if (((Class387_Sub3) this).aShortArray7923 == null)
			return true;
		for (int i = 0; i < ((Class387_Sub3) this).aShortArray7923.length; i++) {
			if (((Class387_Sub3) this).aShortArray7923[i] != -1 && !(((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface_ma5299.method170(((Class387_Sub3) this).aShortArray7923[i], (short) 4712)))
				return false;
		}
		return true;
	}

	public boolean eg() {
		return ((Class387_Sub3) this).aBoolean7903;
	}

	public int N() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7936;
	}

	public boolean ek() {
		return ((Class387_Sub3) this).aBoolean7903;
	}

	public void em() {
		for (int i = 0; i < ((Class387_Sub3) this).anInt7900; i++)
			((Class387_Sub3) this).anIntArray7965[i] = -((Class387_Sub3) this).anIntArray7965[i];
		for (int i = 0; i < ((Class387_Sub3) this).anInt7906; i++)
			((Class387_Sub3) this).aShortArray7919[i] = (short) -((Class387_Sub3) this).aShortArray7919[i];
		for (int i = 0; i < ((Class387_Sub3) this).anInt7916; i++) {
			short i_1969_ = ((Class387_Sub3) this).aShortArray7920[i];
			((Class387_Sub3) this).aShortArray7920[i] = ((Class387_Sub3) this).aShortArray7922[i];
			((Class387_Sub3) this).aShortArray7922[i] = i_1969_;
		}
		method4851();
		method4839();
		method4840();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public void bm(int i) {
		int i_1970_ = Class220.anIntArray2483[i];
		int i_1971_ = Class220.anIntArray2474[i];
		for (int i_1972_ = 0; i_1972_ < ((Class387_Sub3) this).anInt7900; i_1972_++) {
			int i_1973_ = ((((Class387_Sub3) this).anIntArray7965[i_1972_] * i_1970_ + ((Class387_Sub3) this).anIntArray7901[i_1972_] * i_1971_) >> 14);
			((Class387_Sub3) this).anIntArray7965[i_1972_] = ((((Class387_Sub3) this).anIntArray7965[i_1972_] * i_1971_ - ((Class387_Sub3) this).anIntArray7901[i_1972_] * i_1970_) >> 14);
			((Class387_Sub3) this).anIntArray7901[i_1972_] = i_1973_;
		}
		for (int i_1974_ = 0; i_1974_ < ((Class387_Sub3) this).anInt7906; i_1974_++) {
			int i_1975_ = ((((Class387_Sub3) this).aShortArray7919[i_1974_] * i_1970_ + (((Class387_Sub3) this).aShortArray7909[i_1974_] * i_1971_)) >> 14);
			((Class387_Sub3) this).aShortArray7919[i_1974_] = (short) (((((Class387_Sub3) this).aShortArray7919[i_1974_] * i_1971_) - (((Class387_Sub3) this).aShortArray7909[i_1974_] * i_1970_)) >> 14);
			((Class387_Sub3) this).aShortArray7909[i_1974_] = (short) i_1975_;
		}
		method4851();
		method4839();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	public void eb(short i, short i_1976_) {
		for (int i_1977_ = 0; i_1977_ < ((Class387_Sub3) this).anInt7916; i_1977_++) {
			if (((Class387_Sub3) this).aShortArray7935[i_1977_] == i)
				((Class387_Sub3) this).aShortArray7935[i_1977_] = i_1976_;
		}
		if (((Class387_Sub3) this).aClass191Array7952 != null) {
			for (int i_1978_ = 0; i_1978_ < ((Class387_Sub3) this).anInt7951; i_1978_++) {
				Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_1978_];
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_1978_];
				((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
			}
		}
		method4838();
	}

	public void ey(short i, short i_1979_) {
		for (int i_1980_ = 0; i_1980_ < ((Class387_Sub3) this).anInt7916; i_1980_++) {
			if (((Class387_Sub3) this).aShortArray7935[i_1980_] == i)
				((Class387_Sub3) this).aShortArray7935[i_1980_] = i_1979_;
		}
		if (((Class387_Sub3) this).aClass191Array7952 != null) {
			for (int i_1981_ = 0; i_1981_ < ((Class387_Sub3) this).anInt7951; i_1981_++) {
				Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_1981_];
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_1981_];
				((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
			}
		}
		method4838();
	}

	public void method4782(Matrix3f class222) {
		Matrix4f class233 = ((Class387_Sub3) this).aClass_ra_Sub3_7894.aClass233_8236;
		class233.method2145(class222);
		if (((Class387_Sub3) this).aClass85Array7949 != null) {
			for (int i = 0; i < ((Class387_Sub3) this).aClass85Array7949.length; i++) {
				Class85 class85 = ((Class387_Sub3) this).aClass85Array7949[i];
				Class85 class85_1982_ = class85;
				if (class85.aClass85_776 != null)
					class85_1982_ = class85.aClass85_776;
				class85_1982_.anInt777 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt773 * -710317103)])))) * -1879868075);
				class85_1982_.anInt783 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt773 * -710317103)])))) * -2041556771);
				class85_1982_.anInt779 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt773 * -710317103])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt773 * -710317103)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt773 * -710317103)])))) * -1434499227);
				class85_1982_.anInt772 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt774 * 1705862021)])))) * 1070341177);
				class85_1982_.anInt781 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt774 * 1705862021)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt774 * 1705862021)])))) * 1802851857);
				class85_1982_.anInt782 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[class85.anInt774 * 1705862021])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt774 * 1705862021)])))) * 103846281;
				class85_1982_.anInt771 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt775 * 1636170731)])))) * -2103324039);
				class85_1982_.anInt784 = ((int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[(class85.anInt775 * 1636170731)])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt775 * 1636170731)])))) * -526039059);
				class85_1982_.anInt785 = (int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[class85.anInt775 * 1636170731])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class85.anInt775 * 1636170731)])))) * 491030489;
			}
		}
		if (((Class387_Sub3) this).aClass68Array7904 != null) {
			for (int i = 0; i < ((Class387_Sub3) this).aClass68Array7904.length; i++) {
				Class68 class68 = ((Class387_Sub3) this).aClass68Array7904[i];
				Class68 class68_1983_ = class68;
				if (class68.aClass68_672 != null)
					class68_1983_ = class68.aClass68_672;
				if (class68.aClass233_677 != null)
					class68.aClass233_677.method2142(class233);
				else
					class68.aClass233_677 = new Matrix4f(class233);
				class68_1983_.anInt671 = ((int) (class233.aFloatArray2594[12] + ((class233.aFloatArray2594[0] * (float) (((Class387_Sub3) this).anIntArray7901[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[4] * (float) (((Class387_Sub3) this).anIntArray7895[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[8] * (float) (((Class387_Sub3) this).anIntArray7965[(class68.anInt674 * -180596249)])))) * -1436341053);
				class68_1983_.anInt675 = (int) (class233.aFloatArray2594[13] + ((class233.aFloatArray2594[1] * (float) (((Class387_Sub3) this).anIntArray7901[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[5] * (float) (((Class387_Sub3) this).anIntArray7895[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[9] * (float) (((Class387_Sub3) this).anIntArray7965[(class68.anInt674 * -180596249)])))) * 449866009;
				class68_1983_.anInt676 = ((int) (class233.aFloatArray2594[14] + ((class233.aFloatArray2594[2] * (float) (((Class387_Sub3) this).anIntArray7901[class68.anInt674 * -180596249])) + (class233.aFloatArray2594[6] * (float) (((Class387_Sub3) this).anIntArray7895[(class68.anInt674 * -180596249)])) + (class233.aFloatArray2594[10] * (float) (((Class387_Sub3) this).anIntArray7965[(class68.anInt674 * -180596249)])))) * 1336328763);
			}
		}
	}

	public void X(short i, short i_1984_) {
		for (int i_1985_ = 0; i_1985_ < ((Class387_Sub3) this).anInt7916; i_1985_++) {
			if (((Class387_Sub3) this).aShortArray7935[i_1985_] == i)
				((Class387_Sub3) this).aShortArray7935[i_1985_] = i_1984_;
		}
		if (((Class387_Sub3) this).aClass191Array7952 != null) {
			for (int i_1986_ = 0; i_1986_ < ((Class387_Sub3) this).anInt7951; i_1986_++) {
				Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_1986_];
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_1986_];
				((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
			}
		}
		method4838();
	}

	public void dx(int i) {
		((Class387_Sub3) this).aShort7898 = (short) i;
		method4851();
		method4839();
	}

	void method4733() {
		/* empty */
	}

	public void dz(short i, short i_1987_) {
		Interface_ma interface_ma = ((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface_ma5299;
		for (int i_1988_ = 0; i_1988_ < ((Class387_Sub3) this).anInt7916; i_1988_++) {
			if (((Class387_Sub3) this).aShortArray7923[i_1988_] == i)
				((Class387_Sub3) this).aShortArray7923[i_1988_] = i_1987_;
		}
		byte i_1989_ = 0;
		byte i_1990_ = 0;
		if (i != -1) {
			Class53 class53 = interface_ma.method174(i & 0xffff, 555074717);
			i_1989_ = class53.aByte533;
			i_1990_ = class53.aByte534;
		}
		byte i_1991_ = 0;
		byte i_1992_ = 0;
		if (i_1987_ != -1) {
			Class53 class53 = interface_ma.method174(i_1987_ & 0xffff, 276140436);
			i_1991_ = class53.aByte533;
			i_1992_ = class53.aByte534;
			if (class53.aByte535 != 0 || class53.aByte509 != 0)
				((Class387_Sub3) this).aBoolean7903 = true;
		}
		if (i_1989_ != i_1991_ | i_1990_ != i_1992_) {
			if (((Class387_Sub3) this).aClass191Array7952 != null) {
				for (int i_1993_ = 0; i_1993_ < ((Class387_Sub3) this).anInt7951; i_1993_++) {
					Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_1993_];
					Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_1993_];
					((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
				}
			}
			method4838();
		}
	}

	public int db() {
		return ((Class387_Sub3) this).aShort7897;
	}

	public Class68[] method4753() {
		return ((Class387_Sub3) this).aClass68Array7904;
	}

	public int ca() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7936;
	}

	void method4850() {
		if (((Class387_Sub3) this).aClass186_7927 != null)
			((Class387_Sub3) this).aClass186_7927.method1849();
		if (((Class387_Sub3) this).aClass186_7930 != null)
			((Class387_Sub3) this).aClass186_7930.method1849();
		if (((Class387_Sub3) this).aClass186_7911 != null)
			((Class387_Sub3) this).aClass186_7911.method1849();
		if (((Class387_Sub3) this).aClass186_7934 != null)
			((Class387_Sub3) this).aClass186_7934.method1849();
		if (((Class387_Sub3) this).aClass167_7926 != null)
			((Class387_Sub3) this).aClass167_7926.method1788();
	}

	public void p(int i) {
		((Class387_Sub3) this).aShort7897 = (short) i;
		method4838();
	}

	public int o() {
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		return ((Class387_Sub3) this).anInt7939;
	}

	void method4851() {
		if (((Class387_Sub3) this).aClass186_7927 != null)
			((Class186) ((Class387_Sub3) this).aClass186_7927).aBoolean1900 = false;
	}

	public Class_na cc(Class_na class_na) {
		if (((Class387_Sub3) this).anInt7906 == 0)
			return null;
		if (!((Class387_Sub3) this).aBoolean7950)
			method4832();
		int i;
		int i_1994_;
		if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8299) > 0) {
			i = ((((Class387_Sub3) this).anInt7940 - ((((Class387_Sub3) this).anInt7939 * ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8299) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
			i_1994_ = ((((Class387_Sub3) this).anInt7941 - ((((Class387_Sub3) this).anInt7938 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8299) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
		} else {
			i = ((((Class387_Sub3) this).anInt7940 - ((((Class387_Sub3) this).anInt7938 * ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8299) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
			i_1994_ = ((((Class387_Sub3) this).anInt7941 - ((((Class387_Sub3) this).anInt7939 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8299) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
		}
		int i_1995_;
		int i_1996_;
		if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8317) > 0) {
			i_1995_ = ((((Class387_Sub3) this).anInt7942 - ((((Class387_Sub3) this).anInt7939 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8317) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
			i_1996_ = ((((Class387_Sub3) this).anInt7943 - ((((Class387_Sub3) this).anInt7938 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8317) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
		} else {
			i_1995_ = ((((Class387_Sub3) this).anInt7942 - ((((Class387_Sub3) this).anInt7938 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8317) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
			i_1996_ = ((((Class387_Sub3) this).anInt7943 - ((((Class387_Sub3) this).anInt7939 * ((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_7894)).anInt8317) >> 8)) >> ((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_7894).anInt8313);
		}
		int i_1997_ = i_1994_ - i + 1;
		int i_1998_ = i_1996_ - i_1995_ + 1;
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		Class_na_Sub2 class_na_sub2_1999_;
		if (class_na_sub2 != null && class_na_sub2.method3489(i_1997_, i_1998_)) {
			class_na_sub2_1999_ = class_na_sub2;
			class_na_sub2_1999_.method3487();
		} else
			class_na_sub2_1999_ = new Class_na_Sub2(((Class387_Sub3) this).aClass_ra_Sub3_7894, i_1997_, i_1998_);
		class_na_sub2_1999_.method3486(i, i_1995_, i_1994_, i_1996_);
		method4842(class_na_sub2_1999_);
		return class_na_sub2_1999_;
	}

	public boolean method4788() {
		if (((Class387_Sub3) this).aShortArray7923 == null)
			return true;
		for (int i = 0; i < ((Class387_Sub3) this).aShortArray7923.length; i++) {
			if (((Class387_Sub3) this).aShortArray7923[i] != -1 && !(((Class387_Sub3) this).aClass_ra_Sub3_7894.anInterface_ma5299.method170(((Class387_Sub3) this).aShortArray7923[i], (short) 3108)))
				return false;
		}
		return true;
	}

	public void method4779(Class387 class387, int i, int i_2000_, int i_2001_, boolean bool) {
		Class387_Sub3 class387_sub3_2002_ = (Class387_Sub3) class387;
		if (((Class387_Sub3) this).anInt7916 != 0 && ((Class387_Sub3) class387_sub3_2002_).anInt7916 != 0) {
			int i_2003_ = ((Class387_Sub3) class387_sub3_2002_).anInt7900;
			int[] is = ((Class387_Sub3) class387_sub3_2002_).anIntArray7901;
			int[] is_2004_ = ((Class387_Sub3) class387_sub3_2002_).anIntArray7895;
			int[] is_2005_ = ((Class387_Sub3) class387_sub3_2002_).anIntArray7965;
			short[] is_2006_ = ((Class387_Sub3) class387_sub3_2002_).aShortArray7909;
			short[] is_2007_ = ((Class387_Sub3) class387_sub3_2002_).aShortArray7910;
			short[] is_2008_ = ((Class387_Sub3) class387_sub3_2002_).aShortArray7919;
			byte[] is_2009_ = ((Class387_Sub3) class387_sub3_2002_).aByteArray7958;
			short[] is_2010_;
			short[] is_2011_;
			short[] is_2012_;
			byte[] is_2013_;
			if (((Class387_Sub3) this).aClass185_7915 != null) {
				is_2010_ = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1899);
				is_2011_ = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1897);
				is_2012_ = (((Class185) ((Class387_Sub3) this).aClass185_7915).aShortArray1896);
				is_2013_ = (((Class185) ((Class387_Sub3) this).aClass185_7915).aByteArray1898);
			} else {
				is_2010_ = null;
				is_2011_ = null;
				is_2012_ = null;
				is_2013_ = null;
			}
			short[] is_2014_;
			short[] is_2015_;
			short[] is_2016_;
			byte[] is_2017_;
			if (((Class387_Sub3) class387_sub3_2002_).aClass185_7915 != null) {
				is_2014_ = ((Class185) (((Class387_Sub3) class387_sub3_2002_).aClass185_7915)).aShortArray1899;
				is_2015_ = ((Class185) (((Class387_Sub3) class387_sub3_2002_).aClass185_7915)).aShortArray1897;
				is_2016_ = ((Class185) (((Class387_Sub3) class387_sub3_2002_).aClass185_7915)).aShortArray1896;
				is_2017_ = ((Class185) (((Class387_Sub3) class387_sub3_2002_).aClass185_7915)).aByteArray1898;
			} else {
				is_2014_ = null;
				is_2015_ = null;
				is_2016_ = null;
				is_2017_ = null;
			}
			int[] is_2018_ = ((Class387_Sub3) class387_sub3_2002_).anIntArray7947;
			short[] is_2019_ = ((Class387_Sub3) class387_sub3_2002_).aShortArray7948;
			if (!((Class387_Sub3) class387_sub3_2002_).aBoolean7950)
				class387_sub3_2002_.method4832();
			int i_2020_ = ((Class387_Sub3) class387_sub3_2002_).anInt7938;
			int i_2021_ = ((Class387_Sub3) class387_sub3_2002_).anInt7939;
			int i_2022_ = ((Class387_Sub3) class387_sub3_2002_).anInt7940;
			int i_2023_ = ((Class387_Sub3) class387_sub3_2002_).anInt7941;
			int i_2024_ = ((Class387_Sub3) class387_sub3_2002_).anInt7942;
			int i_2025_ = ((Class387_Sub3) class387_sub3_2002_).anInt7943;
			for (int i_2026_ = 0; i_2026_ < ((Class387_Sub3) this).anInt7900; i_2026_++) {
				int i_2027_ = ((Class387_Sub3) this).anIntArray7895[i_2026_] - i_2000_;
				if (i_2027_ >= i_2020_ && i_2027_ <= i_2021_) {
					int i_2028_ = ((Class387_Sub3) this).anIntArray7901[i_2026_] - i;
					if (i_2028_ >= i_2022_ && i_2028_ <= i_2023_) {
						int i_2029_ = (((Class387_Sub3) this).anIntArray7965[i_2026_] - i_2001_);
						if (i_2029_ >= i_2024_ && i_2029_ <= i_2025_) {
							int i_2030_ = -1;
							int i_2031_ = (((Class387_Sub3) this).anIntArray7947[i_2026_]);
							int i_2032_ = (((Class387_Sub3) this).anIntArray7947[i_2026_ + 1]);
							for (int i_2033_ = i_2031_; i_2033_ < i_2032_; i_2033_++) {
								i_2030_ = (((Class387_Sub3) this).aShortArray7948[i_2033_]) - 1;
								if (i_2030_ == -1 || (((Class387_Sub3) this).aByteArray7958[i_2030_]) != 0)
									break;
							}
							if (i_2030_ != -1) {
								for (int i_2034_ = 0; i_2034_ < i_2003_; i_2034_++) {
									if (i_2028_ == is[i_2034_] && i_2029_ == is_2005_[i_2034_] && i_2027_ == is_2004_[i_2034_]) {
										int i_2035_ = -1;
										i_2031_ = is_2018_[i_2034_];
										i_2032_ = is_2018_[i_2034_ + 1];
										for (int i_2036_ = i_2031_; i_2036_ < i_2032_; i_2036_++) {
											i_2035_ = is_2019_[i_2036_] - 1;
											if (i_2035_ == -1 || is_2009_[i_2035_] != 0)
												break;
										}
										if (i_2035_ != -1) {
											if (is_2010_ == null) {
												((Class387_Sub3) this).aClass185_7915 = new Class185();
												is_2010_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aShortArray1899 = (Class378.method4670((((Class387_Sub3) this).aShortArray7909), (byte) -79));
												is_2011_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aShortArray1897 = (Class378.method4670((((Class387_Sub3) this).aShortArray7910), (byte) -109));
												is_2012_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aShortArray1896 = (Class378.method4670((((Class387_Sub3) this).aShortArray7919), (byte) -67));
												is_2013_ = ((Class185) (((Class387_Sub3) this).aClass185_7915)).aByteArray1898 = (Class409.method4978((((Class387_Sub3) this).aByteArray7958), 1194497584));
											}
											if (is_2014_ == null) {
												Class185 class185 = (((Class387_Sub3) class387_sub3_2002_).aClass185_7915 = new Class185());
												is_2014_ = ((Class185) class185).aShortArray1899 = (Class378.method4670(is_2006_, (byte) -33));
												is_2015_ = ((Class185) class185).aShortArray1897 = (Class378.method4670(is_2007_, (byte) -25));
												is_2016_ = ((Class185) class185).aShortArray1896 = (Class378.method4670(is_2008_, (byte) -24));
												is_2017_ = ((Class185) class185).aByteArray1898 = (Class409.method4978(is_2009_, 1194497584));
											}
											short i_2037_ = (((Class387_Sub3) this).aShortArray7909[i_2030_]);
											short i_2038_ = (((Class387_Sub3) this).aShortArray7910[i_2030_]);
											short i_2039_ = (((Class387_Sub3) this).aShortArray7919[i_2030_]);
											byte i_2040_ = (((Class387_Sub3) this).aByteArray7958[i_2030_]);
											i_2031_ = is_2018_[i_2034_];
											i_2032_ = is_2018_[i_2034_ + 1];
											for (int i_2041_ = i_2031_; i_2041_ < i_2032_; i_2041_++) {
												int i_2042_ = is_2019_[i_2041_] - 1;
												if (i_2042_ == -1)
													break;
												if (is_2017_[i_2042_] != 0) {
													is_2014_[i_2042_] += i_2037_;
													is_2015_[i_2042_] += i_2038_;
													is_2016_[i_2042_] += i_2039_;
													is_2017_[i_2042_] += i_2040_;
												}
											}
											i_2037_ = is_2006_[i_2035_];
											i_2038_ = is_2007_[i_2035_];
											i_2039_ = is_2008_[i_2035_];
											i_2040_ = is_2009_[i_2035_];
											i_2031_ = (((Class387_Sub3) this).anIntArray7947[i_2026_]);
											i_2032_ = (((Class387_Sub3) this).anIntArray7947[i_2026_ + 1]);
											for (int i_2043_ = i_2031_; i_2043_ < i_2032_; i_2043_++) {
												int i_2044_ = ((((Class387_Sub3) this).aShortArray7948[i_2043_]) - 1);
												if (i_2044_ == -1)
													break;
												if (is_2013_[i_2044_] != 0) {
													is_2010_[i_2044_] += i_2037_;
													is_2011_[i_2044_] += i_2038_;
													is_2012_[i_2044_] += i_2039_;
													is_2013_[i_2044_] += i_2040_;
												}
											}
											class387_sub3_2002_.method4839();
											method4839();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void wa() {
		for (int i = 0; i < ((Class387_Sub3) this).anInt7900; i++)
			((Class387_Sub3) this).anIntArray7965[i] = -((Class387_Sub3) this).anIntArray7965[i];
		for (int i = 0; i < ((Class387_Sub3) this).anInt7906; i++)
			((Class387_Sub3) this).aShortArray7919[i] = (short) -((Class387_Sub3) this).aShortArray7919[i];
		for (int i = 0; i < ((Class387_Sub3) this).anInt7916; i++) {
			short i_2045_ = ((Class387_Sub3) this).aShortArray7920[i];
			((Class387_Sub3) this).aShortArray7920[i] = ((Class387_Sub3) this).aShortArray7922[i];
			((Class387_Sub3) this).aShortArray7922[i] = i_2045_;
		}
		method4851();
		method4839();
		method4840();
		((Class387_Sub3) this).aBoolean7950 = false;
	}

	void cv(int i, int i_2046_, int i_2047_, int i_2048_) {
		if (i == 0) {
			int i_2049_ = 0;
			anInt7902 = 0;
			anInt7937 = 0;
			anInt7956 = 0;
			for (int i_2050_ = 0; i_2050_ < ((Class387_Sub3) this).anInt7900; i_2050_++) {
				anInt7902 += ((Class387_Sub3) this).anIntArray7901[i_2050_];
				anInt7937 += ((Class387_Sub3) this).anIntArray7895[i_2050_];
				anInt7956 += ((Class387_Sub3) this).anIntArray7965[i_2050_];
				i_2049_++;
			}
			if (i_2049_ > 0) {
				anInt7902 = anInt7902 / i_2049_ + i_2046_;
				anInt7937 = anInt7937 / i_2049_ + i_2047_;
				anInt7956 = anInt7956 / i_2049_ + i_2048_;
			} else {
				anInt7902 = i_2046_;
				anInt7937 = i_2047_;
				anInt7956 = i_2048_;
			}
		} else if (i == 1) {
			for (int i_2051_ = 0; i_2051_ < ((Class387_Sub3) this).anInt7900; i_2051_++) {
				((Class387_Sub3) this).anIntArray7901[i_2051_] += i_2046_;
				((Class387_Sub3) this).anIntArray7895[i_2051_] += i_2047_;
				((Class387_Sub3) this).anIntArray7965[i_2051_] += i_2048_;
			}
		} else if (i == 2) {
			for (int i_2052_ = 0; i_2052_ < ((Class387_Sub3) this).anInt7900; i_2052_++) {
				((Class387_Sub3) this).anIntArray7901[i_2052_] -= anInt7902;
				((Class387_Sub3) this).anIntArray7895[i_2052_] -= anInt7937;
				((Class387_Sub3) this).anIntArray7965[i_2052_] -= anInt7956;
				if (i_2048_ != 0) {
					int i_2053_ = Class220.anIntArray2483[i_2048_];
					int i_2054_ = Class220.anIntArray2474[i_2048_];
					int i_2055_ = (((((Class387_Sub3) this).anIntArray7895[i_2052_] * i_2053_) + (((Class387_Sub3) this).anIntArray7901[i_2052_] * i_2054_) + 16383) >> 14);
					((Class387_Sub3) this).anIntArray7895[i_2052_] = ((((Class387_Sub3) this).anIntArray7895[i_2052_] * i_2054_) - (((Class387_Sub3) this).anIntArray7901[i_2052_] * i_2053_) + 16383) >> 14;
					((Class387_Sub3) this).anIntArray7901[i_2052_] = i_2055_;
				}
				if (i_2046_ != 0) {
					int i_2056_ = Class220.anIntArray2483[i_2046_];
					int i_2057_ = Class220.anIntArray2474[i_2046_];
					int i_2058_ = (((((Class387_Sub3) this).anIntArray7895[i_2052_] * i_2057_) - (((Class387_Sub3) this).anIntArray7965[i_2052_] * i_2056_) + 16383) >> 14);
					((Class387_Sub3) this).anIntArray7965[i_2052_] = ((((Class387_Sub3) this).anIntArray7895[i_2052_] * i_2056_) + (((Class387_Sub3) this).anIntArray7965[i_2052_] * i_2057_) + 16383) >> 14;
					((Class387_Sub3) this).anIntArray7895[i_2052_] = i_2058_;
				}
				if (i_2047_ != 0) {
					int i_2059_ = Class220.anIntArray2483[i_2047_];
					int i_2060_ = Class220.anIntArray2474[i_2047_];
					int i_2061_ = (((((Class387_Sub3) this).anIntArray7965[i_2052_] * i_2059_) + (((Class387_Sub3) this).anIntArray7901[i_2052_] * i_2060_) + 16383) >> 14);
					((Class387_Sub3) this).anIntArray7965[i_2052_] = ((((Class387_Sub3) this).anIntArray7965[i_2052_] * i_2060_) - (((Class387_Sub3) this).anIntArray7901[i_2052_] * i_2059_) + 16383) >> 14;
					((Class387_Sub3) this).anIntArray7901[i_2052_] = i_2061_;
				}
				((Class387_Sub3) this).anIntArray7901[i_2052_] += anInt7902;
				((Class387_Sub3) this).anIntArray7895[i_2052_] += anInt7937;
				((Class387_Sub3) this).anIntArray7965[i_2052_] += anInt7956;
			}
		} else if (i == 3) {
			for (int i_2062_ = 0; i_2062_ < ((Class387_Sub3) this).anInt7900; i_2062_++) {
				((Class387_Sub3) this).anIntArray7901[i_2062_] -= anInt7902;
				((Class387_Sub3) this).anIntArray7895[i_2062_] -= anInt7937;
				((Class387_Sub3) this).anIntArray7965[i_2062_] -= anInt7956;
				((Class387_Sub3) this).anIntArray7901[i_2062_] = (((Class387_Sub3) this).anIntArray7901[i_2062_] * i_2046_ / 128);
				((Class387_Sub3) this).anIntArray7895[i_2062_] = (((Class387_Sub3) this).anIntArray7895[i_2062_] * i_2047_ / 128);
				((Class387_Sub3) this).anIntArray7965[i_2062_] = (((Class387_Sub3) this).anIntArray7965[i_2062_] * i_2048_ / 128);
				((Class387_Sub3) this).anIntArray7901[i_2062_] += anInt7902;
				((Class387_Sub3) this).anIntArray7895[i_2062_] += anInt7937;
				((Class387_Sub3) this).anIntArray7965[i_2062_] += anInt7956;
			}
		} else if (i == 5) {
			for (int i_2063_ = 0; i_2063_ < ((Class387_Sub3) this).anInt7916; i_2063_++) {
				int i_2064_ = ((((Class387_Sub3) this).aByteArray7963[i_2063_] & 0xff) + i_2046_ * 8);
				if (i_2064_ < 0)
					i_2064_ = 0;
				else if (i_2064_ > 255)
					i_2064_ = 255;
				((Class387_Sub3) this).aByteArray7963[i_2063_] = (byte) i_2064_;
			}
			if (((Class387_Sub3) this).aClass191Array7952 != null) {
				for (int i_2065_ = 0; i_2065_ < ((Class387_Sub3) this).anInt7951; i_2065_++) {
					Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_2065_];
					Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_2065_];
					((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & 0xffffff | 255 - ((((Class387_Sub3) this).aByteArray7963[((Class191) class191).anInt1947]) & 0xff) << 24);
				}
			}
			method4838();
		} else if (i == 7) {
			for (int i_2066_ = 0; i_2066_ < ((Class387_Sub3) this).anInt7916; i_2066_++) {
				int i_2067_ = ((Class387_Sub3) this).aShortArray7935[i_2066_] & 0xffff;
				int i_2068_ = i_2067_ >> 10 & 0x3f;
				int i_2069_ = i_2067_ >> 7 & 0x7;
				int i_2070_ = i_2067_ & 0x7f;
				i_2068_ = i_2068_ + i_2046_ & 0x3f;
				i_2069_ += i_2047_ / 4;
				if (i_2069_ < 0)
					i_2069_ = 0;
				else if (i_2069_ > 7)
					i_2069_ = 7;
				i_2070_ += i_2048_;
				if (i_2070_ < 0)
					i_2070_ = 0;
				else if (i_2070_ > 127)
					i_2070_ = 127;
				((Class387_Sub3) this).aShortArray7935[i_2066_] = (short) (i_2068_ << 10 | i_2069_ << 7 | i_2070_);
			}
			if (((Class387_Sub3) this).aClass191Array7952 != null) {
				for (int i_2071_ = 0; i_2071_ < ((Class387_Sub3) this).anInt7951; i_2071_++) {
					Class191 class191 = ((Class387_Sub3) this).aClass191Array7952[i_2071_];
					Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_2071_];
					((Class166) class166).anInt1703 = (((Class166) class166).anInt1703 & ~0xffffff | ((Class294.anIntArray3165[(((Class387_Sub3) this).aShortArray7935[((Class191) class191).anInt1947]) & 0xffff]) & 0xffffff));
				}
			}
			method4838();
		} else if (i == 8) {
			for (int i_2072_ = 0; i_2072_ < ((Class387_Sub3) this).anInt7951; i_2072_++) {
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_2072_];
				((Class166) class166).anInt1704 += i_2046_;
				((Class166) class166).anInt1705 += i_2047_;
			}
		} else if (i == 10) {
			for (int i_2073_ = 0; i_2073_ < ((Class387_Sub3) this).anInt7951; i_2073_++) {
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_2073_];
				((Class166) class166).anInt1702 = ((Class166) class166).anInt1702 * i_2046_ >> 7;
				((Class166) class166).anInt1701 = ((Class166) class166).anInt1701 * i_2047_ >> 7;
			}
		} else if (i == 9) {
			for (int i_2074_ = 0; i_2074_ < ((Class387_Sub3) this).anInt7951; i_2074_++) {
				Class166 class166 = ((Class387_Sub3) this).aClass166Array7892[i_2074_];
				((Class166) class166).anInt1706 = ((Class166) class166).anInt1706 + i_2046_ & 0x3fff;
			}
		}
	}
}
