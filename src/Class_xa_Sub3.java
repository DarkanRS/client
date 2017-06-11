/* Class_xa_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class_xa_Sub3 extends Class_xa {
	Class32 aClass32_8517;
	static int anInt8518 = 74;
	Class32 aClass32_8519;
	int anInt8520;
	int anInt8521;
	int anInt8522;
	int anInt8523;
	static float[] aFloatArray8524 = new float[16];
	int anInt8525;
	int anInt8526;
	Class298_Sub5[][][] aClass298_Sub5ArrayArrayArray8527;
	int[][][] anIntArrayArrayArray8528;
	int[][][] anIntArrayArrayArray8529;
	float[][] aFloatArrayArray8530;
	int[][][] anIntArrayArrayArray8531;
	int[][][] anIntArrayArrayArray8532;
	int[][][] anIntArrayArrayArray8533;
	Linkable[] aClass298Array8534;
	Class_ra_Sub2 aClass_ra_Sub2_8535;
	Class458 aClass458_8536 = new Class458();
	int[][][] anIntArrayArrayArray8537;
	Interface1 anInterface1_8538;
	Class32 aClass32_8539;
	Class32 aClass32_8540;
	Class44 aClass44_8541;
	static int anInt8542 = 1;
	int anInt8543;
	int anInt8544;
	byte[][] aByteArrayArray8545;
	byte[][] aByteArrayArray8546;
	float[][] aFloatArrayArray8547;
	float[][] aFloatArrayArray8548;
	Class440 aClass440_8549;
	short[][] aShortArrayArray8550;

	public void LA(int i, int i_0_, int i_1_) {
		if ((((Class_xa_Sub3) this).aByteArrayArray8545[i][i_0_] & 0xff) < i_1_)
			((Class_xa_Sub3) this).aByteArrayArray8545[i][i_0_] = (byte) i_1_;
	}

	public Class_na aa(int i, int i_2_, Class_na class_na) {
		if ((((Class_xa_Sub3) this).aByteArrayArray8546[i][i_2_] & 0x1) == 0)
			return null;
		int i_3_ = (anInt6288 * -1212653763 >> (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064));
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		Class_na_Sub1 class_na_sub1_4_;
		if (class_na_sub1 != null && class_na_sub1.method3481(i_3_, i_3_)) {
			class_na_sub1_4_ = class_na_sub1;
			class_na_sub1_4_.method3482();
		} else
			class_na_sub1_4_ = new Class_na_Sub1(((Class_xa_Sub3) this).aClass_ra_Sub2_8535, i_3_, i_3_);
		class_na_sub1_4_.method3485(0, 0, i_3_, i_3_);
		method6375(class_na_sub1_4_, i, i_2_);
		return class_na_sub1_4_;
	}

	public void ad(Class_na class_na, int i, int i_5_, int i_6_, int i_7_, boolean bool) {
		if (((Class_xa_Sub3) this).aClass44_8541 != null && class_na != null) {
			int i_8_ = (i - (i_5_ * (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).anInt8066) >> 8) >> ((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).anInt8064);
			int i_9_ = (i_6_ - (i_5_ * (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8026) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064);
			((Class_xa_Sub3) this).aClass44_8541.method491(class_na, i_8_, i_9_);
		}
	}

	public void SA() {
		if (((Class_xa_Sub3) this).anInt8543 > 0) {
			byte[][] is = (new byte[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
			for (int i = 1; i < anInt6287 * -506105871; i++) {
				for (int i_10_ = 1; i_10_ < anInt6286 * -1148794921; i_10_++)
					is[i][i_10_] = (byte) (((((Class_xa_Sub3) this).aByteArrayArray8545[i - 1][i_10_]) >> 2) + ((((Class_xa_Sub3) this).aByteArrayArray8545[i + 1][i_10_]) >> 3) + ((((Class_xa_Sub3) this).aByteArrayArray8545[i][i_10_ - 1]) >> 2) + ((((Class_xa_Sub3) this).aByteArrayArray8545[i][i_10_ + 1]) >> 3) + ((((Class_xa_Sub3) this).aByteArrayArray8545[i][i_10_]) >> 1));
			}
			((Class_xa_Sub3) this).aClass298Array8534 = new Linkable[((Class_xa_Sub3) this).aClass440_8549.method5855(1429819619)];
			((Class_xa_Sub3) this).aClass440_8549.method5854(((Class_xa_Sub3) this).aClass298Array8534, 2105233647);
			for (int i = 0; i < ((Class_xa_Sub3) this).aClass298Array8534.length; i++)
				((Class298_Sub5) ((Class_xa_Sub3) this).aClass298Array8534[i]).method2859(((Class_xa_Sub3) this).anInt8543);
			int i = 24;
			if (((Class_xa_Sub3) this).anIntArrayArrayArray8533 != null)
				i += 4;
			if ((((Class_xa_Sub3) this).anInt8523 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = ((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aNativeHeap8181.f(((Class_xa_Sub3) this).anInt8543 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class298_Sub5[] class298_sub5s = new Class298_Sub5[((Class_xa_Sub3) this).anInt8543];
			int i_11_ = Class422_Sub4.method5639((((Class_xa_Sub3) this).anInt8543 / 4), 1715118458);
			if (i_11_ < 1)
				i_11_ = 1;
			Class440 class440 = new Class440(i_11_);
			Class298_Sub5[] class298_sub5s_12_ = new Class298_Sub5[((Class_xa_Sub3) this).anInt8544];
			for (int i_13_ = 0; i_13_ < anInt6287 * -506105871; i_13_++) {
				for (int i_14_ = 0; i_14_ < anInt6286 * -1148794921; i_14_++) {
					if ((((Class_xa_Sub3) this).anIntArrayArrayArray8528[i_13_][i_14_]) != null) {
						Class298_Sub5[] class298_sub5s_15_ = (((Class_xa_Sub3) this).aClass298_Sub5ArrayArrayArray8527[i_13_][i_14_]);
						int[] is_16_ = (((Class_xa_Sub3) this).anIntArrayArrayArray8537[i_13_][i_14_]);
						int[] is_17_ = (((Class_xa_Sub3) this).anIntArrayArrayArray8531[i_13_][i_14_]);
						int[] is_18_ = (((Class_xa_Sub3) this).anIntArrayArrayArray8529[i_13_][i_14_]);
						int[] is_19_ = (((Class_xa_Sub3) this).anIntArrayArrayArray8528[i_13_][i_14_]);
						int[] is_20_ = ((((Class_xa_Sub3) this).anIntArrayArrayArray8532 != null) ? (((Class_xa_Sub3) this).anIntArrayArrayArray8532[i_13_][i_14_]) : null);
						int[] is_21_ = ((((Class_xa_Sub3) this).anIntArrayArrayArray8533 != null) ? (((Class_xa_Sub3) this).anIntArrayArrayArray8533[i_13_][i_14_]) : null);
						if (is_18_ == null)
							is_18_ = is_19_;
						float f = (((Class_xa_Sub3) this).aFloatArrayArray8530[i_13_][i_14_]);
						float f_22_ = (((Class_xa_Sub3) this).aFloatArrayArray8547[i_13_][i_14_]);
						float f_23_ = (((Class_xa_Sub3) this).aFloatArrayArray8548[i_13_][i_14_]);
						float f_24_ = (((Class_xa_Sub3) this).aFloatArrayArray8530[i_13_][i_14_ + 1]);
						float f_25_ = (((Class_xa_Sub3) this).aFloatArrayArray8547[i_13_][i_14_ + 1]);
						float f_26_ = (((Class_xa_Sub3) this).aFloatArrayArray8548[i_13_][i_14_ + 1]);
						float f_27_ = (((Class_xa_Sub3) this).aFloatArrayArray8530[i_13_ + 1][i_14_ + 1]);
						float f_28_ = (((Class_xa_Sub3) this).aFloatArrayArray8547[i_13_ + 1][i_14_ + 1]);
						float f_29_ = (((Class_xa_Sub3) this).aFloatArrayArray8548[i_13_ + 1][i_14_ + 1]);
						float f_30_ = (((Class_xa_Sub3) this).aFloatArrayArray8530[i_13_ + 1][i_14_]);
						float f_31_ = (((Class_xa_Sub3) this).aFloatArrayArray8547[i_13_ + 1][i_14_]);
						float f_32_ = (((Class_xa_Sub3) this).aFloatArrayArray8548[i_13_ + 1][i_14_]);
						int i_33_ = is[i_13_][i_14_] & 0xff;
						int i_34_ = is[i_13_][i_14_ + 1] & 0xff;
						int i_35_ = is[i_13_ + 1][i_14_ + 1] & 0xff;
						int i_36_ = is[i_13_ + 1][i_14_] & 0xff;
						int i_37_ = 0;
						while_114_: for (int i_38_ = 0; i_38_ < is_19_.length; i_38_++) {
							Class298_Sub5 class298_sub5 = class298_sub5s_15_[i_38_];
							for (int i_39_ = 0; i_39_ < i_37_; i_39_++) {
								if (class298_sub5s_12_[i_39_] == class298_sub5)
									continue while_114_;
							}
							class298_sub5s_12_[i_37_++] = class298_sub5;
						}
						short[] is_40_ = (((Class_xa_Sub3) this).aShortArrayArray8550[i_14_ * (anInt6287 * -506105871) + i_13_] = new short[is_19_.length]);
						for (int i_41_ = 0; i_41_ < is_19_.length; i_41_++) {
							int i_42_ = ((i_13_ << anInt6289 * -2137349879) + is_16_[i_41_]);
							int i_43_ = ((i_14_ << anInt6289 * -2137349879) + is_17_[i_41_]);
							int i_44_ = i_42_ >> ((Class_xa_Sub3) this).anInt8520;
							int i_45_ = i_43_ >> ((Class_xa_Sub3) this).anInt8520;
							int i_46_ = is_19_[i_41_];
							int i_47_ = is_18_[i_41_];
							int i_48_ = is_20_ != null ? is_20_[i_41_] : 0;
							long l = ((long) i_47_ << 48 | (long) i_46_ << 32 | (long) (i_44_ << 16) | (long) i_45_);
							int i_49_ = is_16_[i_41_];
							int i_50_ = is_17_[i_41_];
							int i_51_ = 74;
							int i_52_ = 0;
							float f_53_ = 1.0F;
							float f_54_;
							float f_55_;
							float f_56_;
							if (i_49_ == 0 && i_50_ == 0) {
								f_54_ = f;
								f_55_ = f_22_;
								f_56_ = f_23_;
								i_51_ -= i_33_;
							} else if (i_49_ == 0 && i_50_ == anInt6288 * -1212653763) {
								f_54_ = f_24_;
								f_55_ = f_25_;
								f_56_ = f_26_;
								i_51_ -= i_34_;
							} else if (i_49_ == anInt6288 * -1212653763 && i_50_ == anInt6288 * -1212653763) {
								f_54_ = f_27_;
								f_55_ = f_28_;
								f_56_ = f_29_;
								i_51_ -= i_35_;
							} else if (i_49_ == anInt6288 * -1212653763 && i_50_ == 0) {
								f_54_ = f_30_;
								f_55_ = f_31_;
								f_56_ = f_32_;
								i_51_ -= i_36_;
							} else {
								float f_57_ = ((float) i_49_ / (float) (anInt6288 * -1212653763));
								float f_58_ = ((float) i_50_ / (float) (anInt6288 * -1212653763));
								float f_59_ = f + (f_30_ - f) * f_57_;
								float f_60_ = f_22_ + (f_31_ - f_22_) * f_57_;
								float f_61_ = f_23_ + (f_32_ - f_23_) * f_57_;
								float f_62_ = f_24_ + (f_27_ - f_24_) * f_57_;
								float f_63_ = f_25_ + (f_28_ - f_25_) * f_57_;
								float f_64_ = f_26_ + (f_29_ - f_26_) * f_57_;
								f_54_ = f_59_ + (f_62_ - f_59_) * f_58_;
								f_55_ = f_60_ + (f_63_ - f_60_) * f_58_;
								f_56_ = f_61_ + (f_64_ - f_61_) * f_58_;
								int i_65_ = i_33_ + ((i_36_ - i_33_) * i_49_ >> anInt6289 * -2137349879);
								int i_66_ = i_34_ + ((i_35_ - i_34_) * i_49_ >> anInt6289 * -2137349879);
								i_51_ -= i_65_ + ((i_66_ - i_65_) * i_50_ >> anInt6289 * -2137349879);
							}
							if (i_46_ != -1) {
								int i_67_ = (i_46_ & 0x7f) * i_51_ >> 7;
								if (i_67_ < 2)
									i_67_ = 2;
								else if (i_67_ > 126)
									i_67_ = 126;
								i_52_ = (Class294.anIntArray3165[i_46_ & 0xff80 | i_67_]);
								if ((((Class_xa_Sub3) this).anInt8523 & 0x7) == 0) {
									f_53_ = ((((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloatArray8124[0]) * f_54_ + (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloatArray8124[1]) * f_55_ + (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloatArray8124[2]) * f_56_);
									f_53_ = (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloat8130 + (f_53_ * (f_53_ > 0.0F ? (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloat8131) : (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloat8132))));
								}
							}
							Linkable class298 = null;
							if (((i_42_ & ((Class_xa_Sub3) this).anInt8521 - 1) == 0) && ((i_43_ & ((Class_xa_Sub3) this).anInt8521 - 1) == 0))
								class298 = class440.method5852(l);
							int i_68_;
							if (class298 == null) {
								int i_69_;
								if (i_47_ != i_46_) {
									int i_70_ = (i_47_ & 0x7f) * i_51_ >> 7;
									if (i_70_ < 2)
										i_70_ = 2;
									else if (i_70_ > 126)
										i_70_ = 126;
									i_69_ = (Class294.anIntArray3165[i_47_ & 0xff80 | i_70_]);
									if ((((Class_xa_Sub3) this).anInt8523 & 0x7) == 0) {
										float f_71_ = ((((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloatArray8124[0]) * f_54_ + (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloatArray8124[1]) * f_55_ + ((((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloatArray8124[2]) * f_56_));
										f_71_ = ((((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloat8130) + (f_53_ * (f_53_ > 0.0F ? (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloat8131) : (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloat8132))));
										int i_72_ = i_69_ >> 16 & 0xff;
										int i_73_ = i_69_ >> 8 & 0xff;
										int i_74_ = i_69_ & 0xff;
										i_72_ *= f_71_;
										if (i_72_ < 0)
											i_72_ = 0;
										else if (i_72_ > 255)
											i_72_ = 255;
										i_73_ *= f_71_;
										if (i_73_ < 0)
											i_73_ = 0;
										else if (i_73_ > 255)
											i_73_ = 255;
										i_74_ *= f_71_;
										if (i_74_ < 0)
											i_74_ = 0;
										else if (i_74_ > 255)
											i_74_ = 255;
										i_69_ = i_72_ << 16 | i_73_ << 8 | i_74_;
									}
								} else
									i_69_ = i_52_;
								if (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aBoolean8143) {
									stream.d((float) i_42_);
									stream.d((float) (method6340(i_42_, i_43_, -1789282838) + i_48_));
									stream.d((float) i_43_);
									stream.p((byte) (i_69_ >> 16));
									stream.p((byte) (i_69_ >> 8));
									stream.p((byte) i_69_);
									stream.p(-1);
									stream.d((float) i_42_);
									stream.d((float) i_43_);
									if ((((Class_xa_Sub3) this).anIntArrayArrayArray8533) != null)
										stream.d(is_21_ != null ? (float) (is_21_[i_41_] - 1) : 0.0F);
									if ((((Class_xa_Sub3) this).anInt8523 & 0x7) != 0) {
										stream.d(f_54_);
										stream.d(f_55_);
										stream.d(f_56_);
									}
								} else {
									stream.u((float) i_42_);
									stream.u((float) (method6340(i_42_, i_43_, -1884194336) + i_48_));
									stream.u((float) i_43_);
									stream.p((byte) (i_69_ >> 16));
									stream.p((byte) (i_69_ >> 8));
									stream.p((byte) i_69_);
									stream.p(-1);
									stream.u((float) i_42_);
									stream.u((float) i_43_);
									if ((((Class_xa_Sub3) this).anIntArrayArrayArray8533) != null)
										stream.u(is_21_ != null ? (float) (is_21_[i_41_] - 1) : 0.0F);
									if ((((Class_xa_Sub3) this).anInt8523 & 0x7) != 0) {
										stream.u(f_54_);
										stream.u(f_55_);
										stream.u(f_56_);
									}
								}
								i_68_ = ((Class_xa_Sub3) this).anInt8526++;
								is_40_[i_41_] = (short) i_68_;
								if (i_46_ != -1)
									class298_sub5s[i_68_] = class298_sub5s_15_[i_41_];
								class440.method5858(new Class298_Sub20(is_40_[i_41_]), l);
							} else {
								is_40_[i_41_] = ((Class298_Sub20) class298).aShort7314;
								i_68_ = is_40_[i_41_] & 0xffff;
								if (i_46_ != -1 && ((class298_sub5s_15_[i_41_].linkedKey * 7051297995265073167L) < (class298_sub5s[i_68_].linkedKey * 7051297995265073167L)))
									class298_sub5s[i_68_] = class298_sub5s_15_[i_41_];
							}
							for (int i_75_ = 0; i_75_ < i_37_; i_75_++)
								class298_sub5s_12_[i_75_].method2857(i_68_, i_52_, i_51_, f_53_);
							((Class_xa_Sub3) this).anInt8525++;
						}
					}
				}
			}
			for (int i_76_ = 0; i_76_ < ((Class_xa_Sub3) this).anInt8526; i_76_++) {
				Class298_Sub5 class298_sub5 = class298_sub5s[i_76_];
				if (class298_sub5 != null)
					class298_sub5.method2858(i_76_);
			}
			for (int i_77_ = 0; i_77_ < anInt6287 * -506105871; i_77_++) {
				for (int i_78_ = 0; i_78_ < anInt6286 * -1148794921; i_78_++) {
					short[] is_79_ = (((Class_xa_Sub3) this).aShortArrayArray8550[i_78_ * (anInt6287 * -506105871) + i_77_]);
					if (is_79_ != null) {
						int i_80_ = 0;
						int i_81_ = 0;
						while (i_81_ < is_79_.length) {
							int i_82_ = is_79_[i_81_++] & 0xffff;
							int i_83_ = is_79_[i_81_++] & 0xffff;
							int i_84_ = is_79_[i_81_++] & 0xffff;
							Class298_Sub5 class298_sub5 = class298_sub5s[i_82_];
							Class298_Sub5 class298_sub5_85_ = class298_sub5s[i_83_];
							Class298_Sub5 class298_sub5_86_ = class298_sub5s[i_84_];
							Class298_Sub5 class298_sub5_87_ = null;
							if (class298_sub5 != null) {
								class298_sub5.method2856(i_77_, i_78_, i_80_);
								class298_sub5_87_ = class298_sub5;
							}
							if (class298_sub5_85_ != null) {
								class298_sub5_85_.method2856(i_77_, i_78_, i_80_);
								if (class298_sub5_87_ == null || ((class298_sub5_85_.linkedKey * 7051297995265073167L) < (class298_sub5_87_.linkedKey * 7051297995265073167L)))
									class298_sub5_87_ = class298_sub5_85_;
							}
							if (class298_sub5_86_ != null) {
								class298_sub5_86_.method2856(i_77_, i_78_, i_80_);
								if (class298_sub5_87_ == null || ((class298_sub5_86_.linkedKey * 7051297995265073167L) < (class298_sub5_87_.linkedKey * 7051297995265073167L)))
									class298_sub5_87_ = class298_sub5_86_;
							}
							if (class298_sub5_87_ != null) {
								if (class298_sub5 != null)
									class298_sub5_87_.method2858(i_82_);
								if (class298_sub5_85_ != null)
									class298_sub5_87_.method2858(i_83_);
								if (class298_sub5_86_ != null)
									class298_sub5_87_.method2858(i_84_);
								class298_sub5_87_.method2856(i_77_, i_78_, i_80_);
							}
							i_80_++;
						}
					}
				}
			}
			stream.x();
			((Class_xa_Sub3) this).anInterface1_8538 = ((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5245(i, nativeheapbuffer, stream.f(), false);
			if (((Class_xa_Sub3) this).anInterface1_8538 instanceof Class40_Sub2)
				nativeheapbuffer.t();
			((Class_xa_Sub3) this).aClass32_8539 = new Class32(((Class_xa_Sub3) this).anInterface1_8538, 5126, 3, 0);
			((Class_xa_Sub3) this).aClass32_8540 = new Class32(((Class_xa_Sub3) this).anInterface1_8538, 5121, 4, 12);
			int i_88_;
			if (((Class_xa_Sub3) this).anIntArrayArrayArray8533 != null) {
				((Class_xa_Sub3) this).aClass32_8517 = new Class32(((Class_xa_Sub3) this).anInterface1_8538, 5126, 3, 16);
				i_88_ = 28;
			} else {
				((Class_xa_Sub3) this).aClass32_8517 = new Class32(((Class_xa_Sub3) this).anInterface1_8538, 5126, 2, 16);
				i_88_ = 24;
			}
			if ((((Class_xa_Sub3) this).anInt8523 & 0x7) != 0)
				((Class_xa_Sub3) this).aClass32_8519 = new Class32(((Class_xa_Sub3) this).anInterface1_8538, 5126, 3, i_88_);
			long[] ls = new long[((Class_xa_Sub3) this).aClass298Array8534.length];
			for (int i_89_ = 0; i_89_ < ((Class_xa_Sub3) this).aClass298Array8534.length; i_89_++) {
				Class298_Sub5 class298_sub5 = ((Class298_Sub5) ((Class_xa_Sub3) this).aClass298Array8534[i_89_]);
				ls[i_89_] = class298_sub5.linkedKey * 7051297995265073167L;
				class298_sub5.method2860(((Class_xa_Sub3) this).anInt8526);
			}
			Class365_Sub1_Sub3_Sub1.method4507(ls, (((Class_xa_Sub3) this).aClass298Array8534), (byte) -115);
			if (((Class_xa_Sub3) this).aClass44_8541 != null)
				((Class_xa_Sub3) this).aClass44_8541.method489();
		} else
			((Class_xa_Sub3) this).aClass44_8541 = null;
		if ((((Class_xa_Sub3) this).anInt8522 & 0x2) == 0) {
			((Class_xa_Sub3) this).anIntArrayArrayArray8531 = null;
			((Class_xa_Sub3) this).anIntArrayArrayArray8537 = null;
			((Class_xa_Sub3) this).anIntArrayArrayArray8528 = null;
		}
		((Class_xa_Sub3) this).anIntArrayArrayArray8533 = null;
		((Class_xa_Sub3) this).anIntArrayArrayArray8529 = null;
		((Class_xa_Sub3) this).anIntArrayArrayArray8532 = null;
		((Class_xa_Sub3) this).aClass298_Sub5ArrayArrayArray8527 = null;
		((Class_xa_Sub3) this).aByteArrayArray8545 = null;
		((Class_xa_Sub3) this).aClass440_8549 = null;
		((Class_xa_Sub3) this).aFloatArrayArray8548 = null;
		((Class_xa_Sub3) this).aFloatArrayArray8547 = null;
		((Class_xa_Sub3) this).aFloatArrayArray8530 = null;
	}

	public void method6351(int i, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, boolean[][] bools) {
		Class52 class52 = ((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method4992((short) 23850);
		if (((Class_xa_Sub3) this).anInt8543 > 0 && class52 != null) {
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5291();
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5226(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5264(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5281(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5266(0);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5275(-2);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5256(null);
			aFloatArray8524[0] = (float) i_91_ / (128.0F * (float) (anInt6288 * -1212653763) * (float) class52.method545());
			aFloatArray8524[1] = 0.0F;
			aFloatArray8524[2] = 0.0F;
			aFloatArray8524[3] = 0.0F;
			aFloatArray8524[4] = 0.0F;
			aFloatArray8524[5] = (float) i_91_ / (128.0F * (float) (anInt6288 * -1212653763) * (float) class52.method552());
			aFloatArray8524[6] = 0.0F;
			aFloatArray8524[7] = 0.0F;
			aFloatArray8524[8] = 0.0F;
			aFloatArray8524[9] = 0.0F;
			aFloatArray8524[10] = 0.0F;
			aFloatArray8524[11] = 0.0F;
			aFloatArray8524[12] = -1.0F - (((float) (i_92_ * i_91_) / 128.0F - (float) (i * 2)) / (float) class52.method545());
			aFloatArray8524[13] = 1.0F - (((float) (2 * i_90_) + (float) (i_95_ * i_91_) / 128.0F) / (float) class52.method552());
			aFloatArray8524[14] = 0.0F;
			aFloatArray8524[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray8524, 0);
			aFloatArray8524[0] = 1.0F;
			aFloatArray8524[1] = 0.0F;
			aFloatArray8524[2] = 0.0F;
			aFloatArray8524[3] = 0.0F;
			aFloatArray8524[4] = 0.0F;
			aFloatArray8524[5] = 0.0F;
			aFloatArray8524[6] = 1.0F;
			aFloatArray8524[7] = 0.0F;
			aFloatArray8524[8] = 0.0F;
			aFloatArray8524[9] = 1.0F;
			aFloatArray8524[10] = 0.0F;
			aFloatArray8524[11] = 0.0F;
			aFloatArray8524[12] = 0.0F;
			aFloatArray8524[13] = 0.0F;
			aFloatArray8524[14] = 0.0F;
			aFloatArray8524[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray8524, 0);
			if ((((Class_xa_Sub3) this).anInt8523 & 0x7) != 0) {
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(true);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5279();
			} else
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5248(((Class_xa_Sub3) this).aClass32_8539, ((Class_xa_Sub3) this).aClass32_8519, ((Class_xa_Sub3) this).aClass32_8540, ((Class_xa_Sub3) this).aClass32_8517);
			if ((((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197.buffer).length < ((Class_xa_Sub3) this).anInt8525 * 2)
				((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197 = new RsFloatBuffer(((Class_xa_Sub3) this).anInt8525 * 2);
			else
				((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197.index = 0;
			int i_96_ = 0;
			RsFloatBuffer class298_sub53_sub1 = (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197);
			if (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aBoolean8143) {
				for (int i_97_ = i_93_; i_97_ < i_95_; i_97_++) {
					int i_98_ = i_97_ * (anInt6287 * -506105871) + i_92_;
					for (int i_99_ = i_92_; i_99_ < i_94_; i_99_++) {
						if (bools[i_99_ - i_92_][i_97_ - i_93_]) {
							short[] is = (((Class_xa_Sub3) this).aShortArrayArray8550[i_98_]);
							if (is != null) {
								for (int i_100_ = 0; i_100_ < is.length; i_100_++) {
									class298_sub53_sub1.writeShort((is[i_100_] & 0xffff), 16711935);
									i_96_++;
								}
							}
						}
						i_98_++;
					}
				}
			} else {
				for (int i_101_ = i_93_; i_101_ < i_95_; i_101_++) {
					int i_102_ = i_101_ * (anInt6287 * -506105871) + i_92_;
					for (int i_103_ = i_92_; i_103_ < i_94_; i_103_++) {
						if (bools[i_103_ - i_92_][i_101_ - i_93_]) {
							short[] is = (((Class_xa_Sub3) this).aShortArrayArray8550[i_102_]);
							if (is != null) {
								for (int i_104_ = 0; i_104_ < is.length; i_104_++) {
									class298_sub53_sub1.method3587((is[i_104_] & 0xffff), 1368367793);
									i_96_++;
								}
							}
						}
						i_102_++;
					}
				}
			}
			if (i_96_ > 0) {
				Class46_Sub1 class46_sub1 = new Class46_Sub1((((Class_xa_Sub3) this).aClass_ra_Sub2_8535), 5123, class298_sub53_sub1.buffer, (class298_sub53_sub1.index * 385051775));
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5254(class46_sub1, 4, 0, i_96_);
			}
		}
	}

	void method6374(int i, int i_105_, int i_106_, boolean[][] bools, boolean bool, int i_107_) {
		if (((Class_xa_Sub3) this).aClass298Array8534 != null) {
			int i_108_ = i_106_ + i_106_ + 1;
			i_108_ *= i_108_;
			if ((((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anIntArray8200).length < i_108_)
				((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anIntArray8200 = new int[i_108_];
			if ((((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197.buffer).length < ((Class_xa_Sub3) this).anInt8525 * 2)
				((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197 = new RsFloatBuffer(((Class_xa_Sub3) this).anInt8525 * 2);
			int i_109_ = i - i_106_;
			int i_110_ = i_109_;
			if (i_109_ < 0)
				i_109_ = 0;
			int i_111_ = i_105_ - i_106_;
			int i_112_ = i_111_;
			if (i_111_ < 0)
				i_111_ = 0;
			int i_113_ = i + i_106_;
			if (i_113_ > anInt6287 * -506105871 - 1)
				i_113_ = anInt6287 * -506105871 - 1;
			int i_114_ = i_105_ + i_106_;
			if (i_114_ > anInt6286 * -1148794921 - 1)
				i_114_ = anInt6286 * -1148794921 - 1;
			int i_115_ = 0;
			int[] is = (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anIntArray8200);
			for (int i_116_ = i_109_; i_116_ <= i_113_; i_116_++) {
				boolean[] bools_117_ = bools[i_116_ - i_110_];
				for (int i_118_ = i_111_; i_118_ <= i_114_; i_118_++) {
					if (bools_117_[i_118_ - i_112_])
						is[i_115_++] = i_118_ * (anInt6287 * -506105871) + i_116_;
				}
			}
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5252();
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262((((Class_xa_Sub3) this).anInt8523 & 0x7) != 0);
			for (int i_119_ = 0; i_119_ < ((Class_xa_Sub3) this).aClass298Array8534.length - 0; i_119_++)
				((Class298_Sub5) ((Class_xa_Sub3) this).aClass298Array8534[i_119_]).method2861(is, i_115_);
			if (!((Class_xa_Sub3) this).aClass458_8536.method5970((byte) 115)) {
				int i_120_ = (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8139);
				int i_121_ = (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8007);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.c(0, i_121_, ((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8195);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(false);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5281(false);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5266(128);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5275(-2);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5256(((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass30_Sub2_8140);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5258(8448, 7681);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5259(0, 34166, 770);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5286(0, 34167, 770);
				for (Linkable class298 = ((Class_xa_Sub3) this).aClass458_8536.method5967(1797943581); class298 != null; class298 = ((Class_xa_Sub3) this).aClass458_8536.method5969((byte) -37)) {
					Class298_Sub3 class298_sub3 = (Class298_Sub3) class298;
					class298_sub3.method2852(i, i_105_, i_106_, bools);
				}
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5259(0, 5890, 768);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5286(0, 5890, 770);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5256(null);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.c(i_120_, i_121_, ((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8195);
			}
			if (((Class_xa_Sub3) this).aClass44_8541 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5248(((Class_xa_Sub3) this).aClass32_8539, null, null, ((Class_xa_Sub3) this).aClass32_8517);
				((Class_xa_Sub3) this).aClass44_8541.method490(i, i_105_, i_106_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	public void method6339(int i, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, boolean[][] bools) {
		Class52 class52 = ((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method4992((short) -628);
		if (((Class_xa_Sub3) this).anInt8543 > 0 && class52 != null) {
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5291();
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5226(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5264(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5281(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5266(0);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5275(-2);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5256(null);
			aFloatArray8524[0] = (float) i_123_ / (128.0F * (float) (anInt6288 * -1212653763) * (float) class52.method545());
			aFloatArray8524[1] = 0.0F;
			aFloatArray8524[2] = 0.0F;
			aFloatArray8524[3] = 0.0F;
			aFloatArray8524[4] = 0.0F;
			aFloatArray8524[5] = (float) i_123_ / (128.0F * (float) (anInt6288 * -1212653763) * (float) class52.method552());
			aFloatArray8524[6] = 0.0F;
			aFloatArray8524[7] = 0.0F;
			aFloatArray8524[8] = 0.0F;
			aFloatArray8524[9] = 0.0F;
			aFloatArray8524[10] = 0.0F;
			aFloatArray8524[11] = 0.0F;
			aFloatArray8524[12] = -1.0F - ((float) (i_124_ * i_123_) / 128.0F - (float) (i * 2)) / (float) class52.method545();
			aFloatArray8524[13] = 1.0F - (((float) (2 * i_122_) + (float) (i_127_ * i_123_) / 128.0F) / (float) class52.method552());
			aFloatArray8524[14] = 0.0F;
			aFloatArray8524[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray8524, 0);
			aFloatArray8524[0] = 1.0F;
			aFloatArray8524[1] = 0.0F;
			aFloatArray8524[2] = 0.0F;
			aFloatArray8524[3] = 0.0F;
			aFloatArray8524[4] = 0.0F;
			aFloatArray8524[5] = 0.0F;
			aFloatArray8524[6] = 1.0F;
			aFloatArray8524[7] = 0.0F;
			aFloatArray8524[8] = 0.0F;
			aFloatArray8524[9] = 1.0F;
			aFloatArray8524[10] = 0.0F;
			aFloatArray8524[11] = 0.0F;
			aFloatArray8524[12] = 0.0F;
			aFloatArray8524[13] = 0.0F;
			aFloatArray8524[14] = 0.0F;
			aFloatArray8524[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray8524, 0);
			if ((((Class_xa_Sub3) this).anInt8523 & 0x7) != 0) {
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(true);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5279();
			} else
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5248(((Class_xa_Sub3) this).aClass32_8539, ((Class_xa_Sub3) this).aClass32_8519, ((Class_xa_Sub3) this).aClass32_8540, ((Class_xa_Sub3) this).aClass32_8517);
			if ((((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197.buffer).length < ((Class_xa_Sub3) this).anInt8525 * 2)
				((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197 = new RsFloatBuffer(((Class_xa_Sub3) this).anInt8525 * 2);
			else
				((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197.index = 0;
			int i_128_ = 0;
			RsFloatBuffer class298_sub53_sub1 = (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197);
			if (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aBoolean8143) {
				for (int i_129_ = i_125_; i_129_ < i_127_; i_129_++) {
					int i_130_ = i_129_ * (anInt6287 * -506105871) + i_124_;
					for (int i_131_ = i_124_; i_131_ < i_126_; i_131_++) {
						if (bools[i_131_ - i_124_][i_129_ - i_125_]) {
							short[] is = (((Class_xa_Sub3) this).aShortArrayArray8550[i_130_]);
							if (is != null) {
								for (int i_132_ = 0; i_132_ < is.length; i_132_++) {
									class298_sub53_sub1.writeShort((is[i_132_] & 0xffff), 16711935);
									i_128_++;
								}
							}
						}
						i_130_++;
					}
				}
			} else {
				for (int i_133_ = i_125_; i_133_ < i_127_; i_133_++) {
					int i_134_ = i_133_ * (anInt6287 * -506105871) + i_124_;
					for (int i_135_ = i_124_; i_135_ < i_126_; i_135_++) {
						if (bools[i_135_ - i_124_][i_133_ - i_125_]) {
							short[] is = (((Class_xa_Sub3) this).aShortArrayArray8550[i_134_]);
							if (is != null) {
								for (int i_136_ = 0; i_136_ < is.length; i_136_++) {
									class298_sub53_sub1.method3587((is[i_136_] & 0xffff), 1368367793);
									i_128_++;
								}
							}
						}
						i_134_++;
					}
				}
			}
			if (i_128_ > 0) {
				Class46_Sub1 class46_sub1 = new Class46_Sub1((((Class_xa_Sub3) this).aClass_ra_Sub2_8535), 5123, class298_sub53_sub1.buffer, (class298_sub53_sub1.index * 385051775));
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5254(class46_sub1, 4, 0, i_128_);
			}
		}
	}

	public Class_na w(int i, int i_137_, Class_na class_na) {
		if ((((Class_xa_Sub3) this).aByteArrayArray8546[i][i_137_] & 0x1) == 0)
			return null;
		int i_138_ = (anInt6288 * -1212653763 >> (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064));
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		Class_na_Sub1 class_na_sub1_139_;
		if (class_na_sub1 != null && class_na_sub1.method3481(i_138_, i_138_)) {
			class_na_sub1_139_ = class_na_sub1;
			class_na_sub1_139_.method3482();
		} else
			class_na_sub1_139_ = new Class_na_Sub1(((Class_xa_Sub3) this).aClass_ra_Sub2_8535, i_138_, i_138_);
		class_na_sub1_139_.method3485(0, 0, i_138_, i_138_);
		method6375(class_na_sub1_139_, i, i_137_);
		return class_na_sub1_139_;
	}

	void method6375(Class_na_Sub1 class_na_sub1, int i, int i_140_) {
		int[] is = ((Class_xa_Sub3) this).anIntArrayArrayArray8537[i][i_140_];
		int[] is_141_ = ((Class_xa_Sub3) this).anIntArrayArrayArray8531[i][i_140_];
		int i_142_ = is.length;
		if ((((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anIntArray8198).length < i_142_) {
			((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anIntArray8198 = new int[i_142_];
			((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anIntArray8199 = new int[i_142_];
		}
		int[] is_143_ = (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anIntArray8198);
		int[] is_144_ = (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anIntArray8199);
		for (int i_145_ = 0; i_145_ < i_142_; i_145_++) {
			is_143_[i_145_] = is[i_145_] >> (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064);
			is_144_[i_145_] = is_141_[i_145_] >> (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).anInt8064);
		}
		int i_146_ = 0;
		while (i_146_ < i_142_) {
			int i_147_ = is_143_[i_146_];
			int i_148_ = is_144_[i_146_++];
			int i_149_ = is_143_[i_146_];
			int i_150_ = is_144_[i_146_++];
			int i_151_ = is_143_[i_146_];
			int i_152_ = is_144_[i_146_++];
			if (((i_147_ - i_149_) * (i_150_ - i_152_) - (i_150_ - i_148_) * (i_151_ - i_149_)) > 0)
				class_na_sub1.method3483(i_148_, i_150_, i_152_, i_147_, i_149_, i_151_);
		}
	}

	public void method6338(int i, int i_153_, int i_154_, boolean[][] bools, boolean bool, int i_155_) {
		method6374(i, i_153_, i_154_, bools, bool, i_155_);
	}

	public void method6335(int i, int i_156_, int[] is, int[] is_157_, int[] is_158_, int[] is_159_, int[] is_160_, int[] is_161_, int[] is_162_, int[] is_163_, Class78 class78, boolean bool) {
		Interface_ma interface_ma = ((Class_xa_Sub3) this).aClass_ra_Sub2_8535.anInterface_ma5299;
		if (is_159_ != null && ((Class_xa_Sub3) this).anIntArrayArrayArray8533 == null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8533 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		if (is_157_ != null && ((Class_xa_Sub3) this).anIntArrayArrayArray8532 == null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8532 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		((Class_xa_Sub3) this).anIntArrayArrayArray8537[i][i_156_] = is;
		((Class_xa_Sub3) this).anIntArrayArrayArray8531[i][i_156_] = is_158_;
		((Class_xa_Sub3) this).anIntArrayArrayArray8528[i][i_156_] = is_160_;
		((Class_xa_Sub3) this).anIntArrayArrayArray8529[i][i_156_] = is_161_;
		if (((Class_xa_Sub3) this).anIntArrayArrayArray8533 != null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8533[i][i_156_] = is_159_;
		if (((Class_xa_Sub3) this).anIntArrayArrayArray8532 != null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8532[i][i_156_] = is_157_;
		Class298_Sub5[] class298_sub5s = (((Class_xa_Sub3) this).aClass298_Sub5ArrayArrayArray8527[i][i_156_] = new Class298_Sub5[is_160_.length]);
		for (int i_164_ = 0; i_164_ < is_160_.length; i_164_++) {
			int i_165_ = is_162_[i_164_];
			int i_166_ = is_163_[i_164_];
			if ((((Class_xa_Sub3) this).anInt8523 & 0x20) != 0 && i_165_ != -1 && interface_ma.method174(i_165_, 602140986).aBoolean524) {
				i_166_ = 128;
				i_165_ = -1;
			}
			long l = ((long) (class78.anInt727 * -1475891183) << 48 | (long) (class78.anInt725 * 1996750669) << 42 | (long) (class78.anInt726 * -1212608691) << 28 | (long) (i_166_ << 14) | (long) i_165_);
			Linkable class298;
			for (class298 = ((Class_xa_Sub3) this).aClass440_8549.method5852(l); class298 != null; class298 = ((Class_xa_Sub3) this).aClass440_8549.method5853(-1829773748)) {
				Class298_Sub5 class298_sub5 = (Class298_Sub5) class298;
				if (((Class298_Sub5) class298_sub5).anInt7199 == i_165_ && (((Class298_Sub5) class298_sub5).aFloat7196 == (float) i_166_) && ((Class298_Sub5) class298_sub5).aClass78_7198.method843(class78, (byte) -48))
					break;
			}
			if (class298 == null) {
				class298_sub5s[i_164_] = new Class298_Sub5(this, i_165_, i_166_, class78);
				((Class_xa_Sub3) this).aClass440_8549.method5858(class298_sub5s[i_164_], l);
			} else
				class298_sub5s[i_164_] = (Class298_Sub5) class298;
		}
		if (bool)
			((Class_xa_Sub3) this).aByteArrayArray8546[i][i_156_] |= 0x1;
		if (is_160_.length > ((Class_xa_Sub3) this).anInt8544)
			((Class_xa_Sub3) this).anInt8544 = is_160_.length;
		((Class_xa_Sub3) this).anInt8543 += is_160_.length;
	}

	public void NA(Class_na class_na, int i, int i_167_, int i_168_, int i_169_, boolean bool) {
		if (((Class_xa_Sub3) this).aClass44_8541 != null && class_na != null) {
			int i_170_ = (i - (i_167_ * (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8066) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064);
			int i_171_ = (i_168_ - (i_167_ * (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).anInt8026) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064);
			((Class_xa_Sub3) this).aClass44_8541.method491(class_na, i_170_, i_171_);
		}
	}

	public void method6342(Class298_Sub10 class298_sub10, int[] is) {
		((Class_xa_Sub3) this).aClass458_8536.method5968(new Class298_Sub3(((Class_xa_Sub3) this).aClass_ra_Sub2_8535, this, class298_sub10, is), 136823922);
	}

	public void method6356(int i, int i_172_, int[] is, int[] is_173_, int[] is_174_, int[] is_175_, int[] is_176_, int[] is_177_, int[] is_178_, int[] is_179_, int[] is_180_, int[] is_181_, int[] is_182_, Class78 class78, boolean bool) {
		int i_183_ = is_179_.length;
		int[] is_184_ = new int[i_183_ * 3];
		int[] is_185_ = new int[i_183_ * 3];
		int[] is_186_ = new int[i_183_ * 3];
		int[] is_187_ = is_180_ != null ? new int[i_183_ * 3] : null;
		int[] is_188_ = new int[i_183_ * 3];
		int[] is_189_ = new int[i_183_ * 3];
		int[] is_190_ = is_173_ != null ? new int[i_183_ * 3] : null;
		int[] is_191_ = is_175_ != null ? new int[i_183_ * 3] : null;
		int i_192_ = 0;
		for (int i_193_ = 0; i_193_ < i_183_; i_193_++) {
			int i_194_ = is_176_[i_193_];
			int i_195_ = is_177_[i_193_];
			int i_196_ = is_178_[i_193_];
			is_184_[i_192_] = is[i_194_];
			is_185_[i_192_] = is_174_[i_194_];
			is_186_[i_192_] = is_179_[i_193_];
			is_188_[i_192_] = is_181_[i_193_];
			is_189_[i_192_] = is_182_[i_193_];
			if (is_180_ != null)
				is_187_[i_192_] = is_180_[i_193_];
			if (is_173_ != null)
				is_190_[i_192_] = is_173_[i_194_];
			if (is_175_ != null)
				is_191_[i_192_] = is_175_[i_194_];
			i_192_++;
			is_184_[i_192_] = is[i_195_];
			is_185_[i_192_] = is_174_[i_195_];
			is_186_[i_192_] = is_179_[i_193_];
			is_188_[i_192_] = is_181_[i_193_];
			is_189_[i_192_] = is_182_[i_193_];
			if (is_180_ != null)
				is_187_[i_192_] = is_180_[i_193_];
			if (is_173_ != null)
				is_190_[i_192_] = is_173_[i_195_];
			if (is_175_ != null)
				is_191_[i_192_] = is_175_[i_195_];
			i_192_++;
			is_184_[i_192_] = is[i_196_];
			is_185_[i_192_] = is_174_[i_196_];
			is_186_[i_192_] = is_179_[i_193_];
			is_188_[i_192_] = is_181_[i_193_];
			is_189_[i_192_] = is_182_[i_193_];
			if (is_180_ != null)
				is_187_[i_192_] = is_180_[i_193_];
			if (is_173_ != null)
				is_190_[i_192_] = is_173_[i_196_];
			if (is_175_ != null)
				is_191_[i_192_] = is_175_[i_196_];
			i_192_++;
		}
		method6335(i, i_172_, is_184_, is_190_, is_185_, is_191_, is_186_, is_187_, is_188_, is_189_, class78, bool);
	}

	public void method6343(int i, int i_197_, int[] is, int[] is_198_, int[] is_199_, int[] is_200_, int[] is_201_, int[] is_202_, int[] is_203_, int[] is_204_, int[] is_205_, int[] is_206_, int[] is_207_, Class78 class78, boolean bool) {
		int i_208_ = is_204_.length;
		int[] is_209_ = new int[i_208_ * 3];
		int[] is_210_ = new int[i_208_ * 3];
		int[] is_211_ = new int[i_208_ * 3];
		int[] is_212_ = is_205_ != null ? new int[i_208_ * 3] : null;
		int[] is_213_ = new int[i_208_ * 3];
		int[] is_214_ = new int[i_208_ * 3];
		int[] is_215_ = is_198_ != null ? new int[i_208_ * 3] : null;
		int[] is_216_ = is_200_ != null ? new int[i_208_ * 3] : null;
		int i_217_ = 0;
		for (int i_218_ = 0; i_218_ < i_208_; i_218_++) {
			int i_219_ = is_201_[i_218_];
			int i_220_ = is_202_[i_218_];
			int i_221_ = is_203_[i_218_];
			is_209_[i_217_] = is[i_219_];
			is_210_[i_217_] = is_199_[i_219_];
			is_211_[i_217_] = is_204_[i_218_];
			is_213_[i_217_] = is_206_[i_218_];
			is_214_[i_217_] = is_207_[i_218_];
			if (is_205_ != null)
				is_212_[i_217_] = is_205_[i_218_];
			if (is_198_ != null)
				is_215_[i_217_] = is_198_[i_219_];
			if (is_200_ != null)
				is_216_[i_217_] = is_200_[i_219_];
			i_217_++;
			is_209_[i_217_] = is[i_220_];
			is_210_[i_217_] = is_199_[i_220_];
			is_211_[i_217_] = is_204_[i_218_];
			is_213_[i_217_] = is_206_[i_218_];
			is_214_[i_217_] = is_207_[i_218_];
			if (is_205_ != null)
				is_212_[i_217_] = is_205_[i_218_];
			if (is_198_ != null)
				is_215_[i_217_] = is_198_[i_220_];
			if (is_200_ != null)
				is_216_[i_217_] = is_200_[i_220_];
			i_217_++;
			is_209_[i_217_] = is[i_221_];
			is_210_[i_217_] = is_199_[i_221_];
			is_211_[i_217_] = is_204_[i_218_];
			is_213_[i_217_] = is_206_[i_218_];
			is_214_[i_217_] = is_207_[i_218_];
			if (is_205_ != null)
				is_212_[i_217_] = is_205_[i_218_];
			if (is_198_ != null)
				is_215_[i_217_] = is_198_[i_221_];
			if (is_200_ != null)
				is_216_[i_217_] = is_200_[i_221_];
			i_217_++;
		}
		method6335(i, i_197_, is_209_, is_215_, is_210_, is_216_, is_211_, is_212_, is_213_, is_214_, class78, bool);
	}

	public void method6350(int i, int i_222_, int i_223_, int i_224_, int i_225_, int i_226_, int i_227_, boolean[][] bools) {
		Class52 class52 = ((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method4992((short) 8066);
		if (((Class_xa_Sub3) this).anInt8543 > 0 && class52 != null) {
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5291();
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5226(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5264(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5281(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5266(0);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5275(-2);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5256(null);
			aFloatArray8524[0] = (float) i_223_ / (128.0F * (float) (anInt6288 * -1212653763) * (float) class52.method545());
			aFloatArray8524[1] = 0.0F;
			aFloatArray8524[2] = 0.0F;
			aFloatArray8524[3] = 0.0F;
			aFloatArray8524[4] = 0.0F;
			aFloatArray8524[5] = (float) i_223_ / (128.0F * (float) (anInt6288 * -1212653763) * (float) class52.method552());
			aFloatArray8524[6] = 0.0F;
			aFloatArray8524[7] = 0.0F;
			aFloatArray8524[8] = 0.0F;
			aFloatArray8524[9] = 0.0F;
			aFloatArray8524[10] = 0.0F;
			aFloatArray8524[11] = 0.0F;
			aFloatArray8524[12] = -1.0F - ((float) (i_224_ * i_223_) / 128.0F - (float) (i * 2)) / (float) class52.method545();
			aFloatArray8524[13] = 1.0F - (((float) (2 * i_222_) + (float) (i_227_ * i_223_) / 128.0F) / (float) class52.method552());
			aFloatArray8524[14] = 0.0F;
			aFloatArray8524[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray8524, 0);
			aFloatArray8524[0] = 1.0F;
			aFloatArray8524[1] = 0.0F;
			aFloatArray8524[2] = 0.0F;
			aFloatArray8524[3] = 0.0F;
			aFloatArray8524[4] = 0.0F;
			aFloatArray8524[5] = 0.0F;
			aFloatArray8524[6] = 1.0F;
			aFloatArray8524[7] = 0.0F;
			aFloatArray8524[8] = 0.0F;
			aFloatArray8524[9] = 1.0F;
			aFloatArray8524[10] = 0.0F;
			aFloatArray8524[11] = 0.0F;
			aFloatArray8524[12] = 0.0F;
			aFloatArray8524[13] = 0.0F;
			aFloatArray8524[14] = 0.0F;
			aFloatArray8524[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray8524, 0);
			if ((((Class_xa_Sub3) this).anInt8523 & 0x7) != 0) {
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(true);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5279();
			} else
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5248(((Class_xa_Sub3) this).aClass32_8539, ((Class_xa_Sub3) this).aClass32_8519, ((Class_xa_Sub3) this).aClass32_8540, ((Class_xa_Sub3) this).aClass32_8517);
			if ((((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197.buffer).length < ((Class_xa_Sub3) this).anInt8525 * 2)
				((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197 = new RsFloatBuffer(((Class_xa_Sub3) this).anInt8525 * 2);
			else
				((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197.index = 0;
			int i_228_ = 0;
			RsFloatBuffer class298_sub53_sub1 = (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197);
			if (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aBoolean8143) {
				for (int i_229_ = i_225_; i_229_ < i_227_; i_229_++) {
					int i_230_ = i_229_ * (anInt6287 * -506105871) + i_224_;
					for (int i_231_ = i_224_; i_231_ < i_226_; i_231_++) {
						if (bools[i_231_ - i_224_][i_229_ - i_225_]) {
							short[] is = (((Class_xa_Sub3) this).aShortArrayArray8550[i_230_]);
							if (is != null) {
								for (int i_232_ = 0; i_232_ < is.length; i_232_++) {
									class298_sub53_sub1.writeShort((is[i_232_] & 0xffff), 16711935);
									i_228_++;
								}
							}
						}
						i_230_++;
					}
				}
			} else {
				for (int i_233_ = i_225_; i_233_ < i_227_; i_233_++) {
					int i_234_ = i_233_ * (anInt6287 * -506105871) + i_224_;
					for (int i_235_ = i_224_; i_235_ < i_226_; i_235_++) {
						if (bools[i_235_ - i_224_][i_233_ - i_225_]) {
							short[] is = (((Class_xa_Sub3) this).aShortArrayArray8550[i_234_]);
							if (is != null) {
								for (int i_236_ = 0; i_236_ < is.length; i_236_++) {
									class298_sub53_sub1.method3587((is[i_236_] & 0xffff), 1368367793);
									i_228_++;
								}
							}
						}
						i_234_++;
					}
				}
			}
			if (i_228_ > 0) {
				Class46_Sub1 class46_sub1 = new Class46_Sub1((((Class_xa_Sub3) this).aClass_ra_Sub2_8535), 5123, class298_sub53_sub1.buffer, (class298_sub53_sub1.index * 385051775));
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5254(class46_sub1, 4, 0, i_228_);
			}
		}
	}

	public void method6359(int i, int i_237_, int[] is, int[] is_238_, int[] is_239_, int[] is_240_, int[] is_241_, int[] is_242_, int[] is_243_, int[] is_244_, Class78 class78, boolean bool) {
		Interface_ma interface_ma = ((Class_xa_Sub3) this).aClass_ra_Sub2_8535.anInterface_ma5299;
		if (is_240_ != null && ((Class_xa_Sub3) this).anIntArrayArrayArray8533 == null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8533 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		if (is_238_ != null && ((Class_xa_Sub3) this).anIntArrayArrayArray8532 == null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8532 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		((Class_xa_Sub3) this).anIntArrayArrayArray8537[i][i_237_] = is;
		((Class_xa_Sub3) this).anIntArrayArrayArray8531[i][i_237_] = is_239_;
		((Class_xa_Sub3) this).anIntArrayArrayArray8528[i][i_237_] = is_241_;
		((Class_xa_Sub3) this).anIntArrayArrayArray8529[i][i_237_] = is_242_;
		if (((Class_xa_Sub3) this).anIntArrayArrayArray8533 != null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8533[i][i_237_] = is_240_;
		if (((Class_xa_Sub3) this).anIntArrayArrayArray8532 != null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8532[i][i_237_] = is_238_;
		Class298_Sub5[] class298_sub5s = (((Class_xa_Sub3) this).aClass298_Sub5ArrayArrayArray8527[i][i_237_] = new Class298_Sub5[is_241_.length]);
		for (int i_245_ = 0; i_245_ < is_241_.length; i_245_++) {
			int i_246_ = is_243_[i_245_];
			int i_247_ = is_244_[i_245_];
			if ((((Class_xa_Sub3) this).anInt8523 & 0x20) != 0 && i_246_ != -1 && interface_ma.method174(i_246_, 620135548).aBoolean524) {
				i_247_ = 128;
				i_246_ = -1;
			}
			long l = ((long) (class78.anInt727 * -1475891183) << 48 | (long) (class78.anInt725 * 1996750669) << 42 | (long) (class78.anInt726 * -1212608691) << 28 | (long) (i_247_ << 14) | (long) i_246_);
			Linkable class298;
			for (class298 = ((Class_xa_Sub3) this).aClass440_8549.method5852(l); class298 != null; class298 = ((Class_xa_Sub3) this).aClass440_8549.method5853(-2069832948)) {
				Class298_Sub5 class298_sub5 = (Class298_Sub5) class298;
				if (((Class298_Sub5) class298_sub5).anInt7199 == i_246_ && (((Class298_Sub5) class298_sub5).aFloat7196 == (float) i_247_) && ((Class298_Sub5) class298_sub5).aClass78_7198.method843(class78, (byte) 30))
					break;
			}
			if (class298 == null) {
				class298_sub5s[i_245_] = new Class298_Sub5(this, i_246_, i_247_, class78);
				((Class_xa_Sub3) this).aClass440_8549.method5858(class298_sub5s[i_245_], l);
			} else
				class298_sub5s[i_245_] = (Class298_Sub5) class298;
		}
		if (bool)
			((Class_xa_Sub3) this).aByteArrayArray8546[i][i_237_] |= 0x1;
		if (is_241_.length > ((Class_xa_Sub3) this).anInt8544)
			((Class_xa_Sub3) this).anInt8544 = is_241_.length;
		((Class_xa_Sub3) this).anInt8543 += is_241_.length;
	}

	public void method6346(int i, int i_248_, int[] is, int[] is_249_, int[] is_250_, int[] is_251_, int[] is_252_, int[] is_253_, int[] is_254_, int[] is_255_, Class78 class78, boolean bool) {
		Interface_ma interface_ma = ((Class_xa_Sub3) this).aClass_ra_Sub2_8535.anInterface_ma5299;
		if (is_251_ != null && ((Class_xa_Sub3) this).anIntArrayArrayArray8533 == null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8533 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		if (is_249_ != null && ((Class_xa_Sub3) this).anIntArrayArrayArray8532 == null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8532 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		((Class_xa_Sub3) this).anIntArrayArrayArray8537[i][i_248_] = is;
		((Class_xa_Sub3) this).anIntArrayArrayArray8531[i][i_248_] = is_250_;
		((Class_xa_Sub3) this).anIntArrayArrayArray8528[i][i_248_] = is_252_;
		((Class_xa_Sub3) this).anIntArrayArrayArray8529[i][i_248_] = is_253_;
		if (((Class_xa_Sub3) this).anIntArrayArrayArray8533 != null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8533[i][i_248_] = is_251_;
		if (((Class_xa_Sub3) this).anIntArrayArrayArray8532 != null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8532[i][i_248_] = is_249_;
		Class298_Sub5[] class298_sub5s = (((Class_xa_Sub3) this).aClass298_Sub5ArrayArrayArray8527[i][i_248_] = new Class298_Sub5[is_252_.length]);
		for (int i_256_ = 0; i_256_ < is_252_.length; i_256_++) {
			int i_257_ = is_254_[i_256_];
			int i_258_ = is_255_[i_256_];
			if ((((Class_xa_Sub3) this).anInt8523 & 0x20) != 0 && i_257_ != -1 && interface_ma.method174(i_257_, 1671695698).aBoolean524) {
				i_258_ = 128;
				i_257_ = -1;
			}
			long l = ((long) (class78.anInt727 * -1475891183) << 48 | (long) (class78.anInt725 * 1996750669) << 42 | (long) (class78.anInt726 * -1212608691) << 28 | (long) (i_258_ << 14) | (long) i_257_);
			Linkable class298;
			for (class298 = ((Class_xa_Sub3) this).aClass440_8549.method5852(l); class298 != null; class298 = ((Class_xa_Sub3) this).aClass440_8549.method5853(-1821853943)) {
				Class298_Sub5 class298_sub5 = (Class298_Sub5) class298;
				if (((Class298_Sub5) class298_sub5).anInt7199 == i_257_ && (((Class298_Sub5) class298_sub5).aFloat7196 == (float) i_258_) && ((Class298_Sub5) class298_sub5).aClass78_7198.method843(class78, (byte) -53))
					break;
			}
			if (class298 == null) {
				class298_sub5s[i_256_] = new Class298_Sub5(this, i_257_, i_258_, class78);
				((Class_xa_Sub3) this).aClass440_8549.method5858(class298_sub5s[i_256_], l);
			} else
				class298_sub5s[i_256_] = (Class298_Sub5) class298;
		}
		if (bool)
			((Class_xa_Sub3) this).aByteArrayArray8546[i][i_248_] |= 0x1;
		if (is_252_.length > ((Class_xa_Sub3) this).anInt8544)
			((Class_xa_Sub3) this).anInt8544 = is_252_.length;
		((Class_xa_Sub3) this).anInt8543 += is_252_.length;
	}

	public Class_na l(int i, int i_259_, Class_na class_na) {
		if ((((Class_xa_Sub3) this).aByteArrayArray8546[i][i_259_] & 0x1) == 0)
			return null;
		int i_260_ = (anInt6288 * -1212653763 >> (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064));
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		Class_na_Sub1 class_na_sub1_261_;
		if (class_na_sub1 != null && class_na_sub1.method3481(i_260_, i_260_)) {
			class_na_sub1_261_ = class_na_sub1;
			class_na_sub1_261_.method3482();
		} else
			class_na_sub1_261_ = new Class_na_Sub1(((Class_xa_Sub3) this).aClass_ra_Sub2_8535, i_260_, i_260_);
		class_na_sub1_261_.method3485(0, 0, i_260_, i_260_);
		method6375(class_na_sub1_261_, i, i_259_);
		return class_na_sub1_261_;
	}

	public void h() {
		if (((Class_xa_Sub3) this).anInt8543 > 0) {
			byte[][] is = (new byte[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
			for (int i = 1; i < anInt6287 * -506105871; i++) {
				for (int i_262_ = 1; i_262_ < anInt6286 * -1148794921; i_262_++)
					is[i][i_262_] = (byte) (((((Class_xa_Sub3) this).aByteArrayArray8545[i - 1][i_262_]) >> 2) + ((((Class_xa_Sub3) this).aByteArrayArray8545[i + 1][i_262_]) >> 3) + ((((Class_xa_Sub3) this).aByteArrayArray8545[i][i_262_ - 1]) >> 2) + ((((Class_xa_Sub3) this).aByteArrayArray8545[i][i_262_ + 1]) >> 3) + ((((Class_xa_Sub3) this).aByteArrayArray8545[i][i_262_]) >> 1));
			}
			((Class_xa_Sub3) this).aClass298Array8534 = new Linkable[((Class_xa_Sub3) this).aClass440_8549.method5855(-575368869)];
			((Class_xa_Sub3) this).aClass440_8549.method5854(((Class_xa_Sub3) this).aClass298Array8534, 2072858153);
			for (int i = 0; i < ((Class_xa_Sub3) this).aClass298Array8534.length; i++)
				((Class298_Sub5) ((Class_xa_Sub3) this).aClass298Array8534[i]).method2859(((Class_xa_Sub3) this).anInt8543);
			int i = 24;
			if (((Class_xa_Sub3) this).anIntArrayArrayArray8533 != null)
				i += 4;
			if ((((Class_xa_Sub3) this).anInt8523 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = ((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aNativeHeap8181.f(((Class_xa_Sub3) this).anInt8543 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class298_Sub5[] class298_sub5s = new Class298_Sub5[((Class_xa_Sub3) this).anInt8543];
			int i_263_ = Class422_Sub4.method5639((((Class_xa_Sub3) this).anInt8543 / 4), 1877653209);
			if (i_263_ < 1)
				i_263_ = 1;
			Class440 class440 = new Class440(i_263_);
			Class298_Sub5[] class298_sub5s_264_ = new Class298_Sub5[((Class_xa_Sub3) this).anInt8544];
			for (int i_265_ = 0; i_265_ < anInt6287 * -506105871; i_265_++) {
				for (int i_266_ = 0; i_266_ < anInt6286 * -1148794921; i_266_++) {
					if ((((Class_xa_Sub3) this).anIntArrayArrayArray8528[i_265_][i_266_]) != null) {
						Class298_Sub5[] class298_sub5s_267_ = (((Class_xa_Sub3) this).aClass298_Sub5ArrayArrayArray8527[i_265_][i_266_]);
						int[] is_268_ = (((Class_xa_Sub3) this).anIntArrayArrayArray8537[i_265_][i_266_]);
						int[] is_269_ = (((Class_xa_Sub3) this).anIntArrayArrayArray8531[i_265_][i_266_]);
						int[] is_270_ = (((Class_xa_Sub3) this).anIntArrayArrayArray8529[i_265_][i_266_]);
						int[] is_271_ = (((Class_xa_Sub3) this).anIntArrayArrayArray8528[i_265_][i_266_]);
						int[] is_272_ = ((((Class_xa_Sub3) this).anIntArrayArrayArray8532 != null) ? (((Class_xa_Sub3) this).anIntArrayArrayArray8532[i_265_][i_266_]) : null);
						int[] is_273_ = ((((Class_xa_Sub3) this).anIntArrayArrayArray8533 != null) ? (((Class_xa_Sub3) this).anIntArrayArrayArray8533[i_265_][i_266_]) : null);
						if (is_270_ == null)
							is_270_ = is_271_;
						float f = (((Class_xa_Sub3) this).aFloatArrayArray8530[i_265_][i_266_]);
						float f_274_ = (((Class_xa_Sub3) this).aFloatArrayArray8547[i_265_][i_266_]);
						float f_275_ = (((Class_xa_Sub3) this).aFloatArrayArray8548[i_265_][i_266_]);
						float f_276_ = (((Class_xa_Sub3) this).aFloatArrayArray8530[i_265_][i_266_ + 1]);
						float f_277_ = (((Class_xa_Sub3) this).aFloatArrayArray8547[i_265_][i_266_ + 1]);
						float f_278_ = (((Class_xa_Sub3) this).aFloatArrayArray8548[i_265_][i_266_ + 1]);
						float f_279_ = (((Class_xa_Sub3) this).aFloatArrayArray8530[i_265_ + 1][i_266_ + 1]);
						float f_280_ = (((Class_xa_Sub3) this).aFloatArrayArray8547[i_265_ + 1][i_266_ + 1]);
						float f_281_ = (((Class_xa_Sub3) this).aFloatArrayArray8548[i_265_ + 1][i_266_ + 1]);
						float f_282_ = (((Class_xa_Sub3) this).aFloatArrayArray8530[i_265_ + 1][i_266_]);
						float f_283_ = (((Class_xa_Sub3) this).aFloatArrayArray8547[i_265_ + 1][i_266_]);
						float f_284_ = (((Class_xa_Sub3) this).aFloatArrayArray8548[i_265_ + 1][i_266_]);
						int i_285_ = is[i_265_][i_266_] & 0xff;
						int i_286_ = is[i_265_][i_266_ + 1] & 0xff;
						int i_287_ = is[i_265_ + 1][i_266_ + 1] & 0xff;
						int i_288_ = is[i_265_ + 1][i_266_] & 0xff;
						int i_289_ = 0;
						while_116_: for (int i_290_ = 0; i_290_ < is_271_.length; i_290_++) {
							Class298_Sub5 class298_sub5 = class298_sub5s_267_[i_290_];
							for (int i_291_ = 0; i_291_ < i_289_; i_291_++) {
								if (class298_sub5s_264_[i_291_] == class298_sub5)
									continue while_116_;
							}
							class298_sub5s_264_[i_289_++] = class298_sub5;
						}
						short[] is_292_ = (((Class_xa_Sub3) this).aShortArrayArray8550[i_266_ * (anInt6287 * -506105871) + i_265_] = new short[is_271_.length]);
						for (int i_293_ = 0; i_293_ < is_271_.length; i_293_++) {
							int i_294_ = ((i_265_ << anInt6289 * -2137349879) + is_268_[i_293_]);
							int i_295_ = ((i_266_ << anInt6289 * -2137349879) + is_269_[i_293_]);
							int i_296_ = i_294_ >> ((Class_xa_Sub3) this).anInt8520;
							int i_297_ = i_295_ >> ((Class_xa_Sub3) this).anInt8520;
							int i_298_ = is_271_[i_293_];
							int i_299_ = is_270_[i_293_];
							int i_300_ = is_272_ != null ? is_272_[i_293_] : 0;
							long l = ((long) i_299_ << 48 | (long) i_298_ << 32 | (long) (i_296_ << 16) | (long) i_297_);
							int i_301_ = is_268_[i_293_];
							int i_302_ = is_269_[i_293_];
							int i_303_ = 74;
							int i_304_ = 0;
							float f_305_ = 1.0F;
							float f_306_;
							float f_307_;
							float f_308_;
							if (i_301_ == 0 && i_302_ == 0) {
								f_306_ = f;
								f_307_ = f_274_;
								f_308_ = f_275_;
								i_303_ -= i_285_;
							} else if (i_301_ == 0 && i_302_ == anInt6288 * -1212653763) {
								f_306_ = f_276_;
								f_307_ = f_277_;
								f_308_ = f_278_;
								i_303_ -= i_286_;
							} else if (i_301_ == anInt6288 * -1212653763 && i_302_ == anInt6288 * -1212653763) {
								f_306_ = f_279_;
								f_307_ = f_280_;
								f_308_ = f_281_;
								i_303_ -= i_287_;
							} else if (i_301_ == anInt6288 * -1212653763 && i_302_ == 0) {
								f_306_ = f_282_;
								f_307_ = f_283_;
								f_308_ = f_284_;
								i_303_ -= i_288_;
							} else {
								float f_309_ = ((float) i_301_ / (float) (anInt6288 * -1212653763));
								float f_310_ = ((float) i_302_ / (float) (anInt6288 * -1212653763));
								float f_311_ = f + (f_282_ - f) * f_309_;
								float f_312_ = f_274_ + (f_283_ - f_274_) * f_309_;
								float f_313_ = f_275_ + (f_284_ - f_275_) * f_309_;
								float f_314_ = f_276_ + (f_279_ - f_276_) * f_309_;
								float f_315_ = f_277_ + (f_280_ - f_277_) * f_309_;
								float f_316_ = f_278_ + (f_281_ - f_278_) * f_309_;
								f_306_ = f_311_ + (f_314_ - f_311_) * f_310_;
								f_307_ = f_312_ + (f_315_ - f_312_) * f_310_;
								f_308_ = f_313_ + (f_316_ - f_313_) * f_310_;
								int i_317_ = i_285_ + ((i_288_ - i_285_) * i_301_ >> anInt6289 * -2137349879);
								int i_318_ = i_286_ + ((i_287_ - i_286_) * i_301_ >> anInt6289 * -2137349879);
								i_303_ -= i_317_ + ((i_318_ - i_317_) * i_302_ >> anInt6289 * -2137349879);
							}
							if (i_298_ != -1) {
								int i_319_ = (i_298_ & 0x7f) * i_303_ >> 7;
								if (i_319_ < 2)
									i_319_ = 2;
								else if (i_319_ > 126)
									i_319_ = 126;
								i_304_ = (Class294.anIntArray3165[i_298_ & 0xff80 | i_319_]);
								if ((((Class_xa_Sub3) this).anInt8523 & 0x7) == 0) {
									f_305_ = ((((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloatArray8124[0]) * f_306_ + (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloatArray8124[1]) * f_307_ + (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloatArray8124[2]) * f_308_);
									f_305_ = (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloat8130 + (f_305_ * (f_305_ > 0.0F ? (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloat8131) : (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloat8132))));
								}
							}
							Linkable class298 = null;
							if ((i_294_ & ((Class_xa_Sub3) this).anInt8521 - 1) == 0 && ((i_295_ & ((Class_xa_Sub3) this).anInt8521 - 1) == 0))
								class298 = class440.method5852(l);
							int i_320_;
							if (class298 == null) {
								int i_321_;
								if (i_299_ != i_298_) {
									int i_322_ = (i_299_ & 0x7f) * i_303_ >> 7;
									if (i_322_ < 2)
										i_322_ = 2;
									else if (i_322_ > 126)
										i_322_ = 126;
									i_321_ = (Class294.anIntArray3165[i_299_ & 0xff80 | i_322_]);
									if ((((Class_xa_Sub3) this).anInt8523 & 0x7) == 0) {
										float f_323_ = ((((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloatArray8124[0]) * f_306_ + (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloatArray8124[1]) * f_307_ + ((((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloatArray8124[2]) * f_308_));
										f_323_ = ((((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloat8130) + (f_305_ * (f_305_ > 0.0F ? (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloat8131) : (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aFloat8132))));
										int i_324_ = i_321_ >> 16 & 0xff;
										int i_325_ = i_321_ >> 8 & 0xff;
										int i_326_ = i_321_ & 0xff;
										i_324_ *= f_323_;
										if (i_324_ < 0)
											i_324_ = 0;
										else if (i_324_ > 255)
											i_324_ = 255;
										i_325_ *= f_323_;
										if (i_325_ < 0)
											i_325_ = 0;
										else if (i_325_ > 255)
											i_325_ = 255;
										i_326_ *= f_323_;
										if (i_326_ < 0)
											i_326_ = 0;
										else if (i_326_ > 255)
											i_326_ = 255;
										i_321_ = (i_324_ << 16 | i_325_ << 8 | i_326_);
									}
								} else
									i_321_ = i_304_;
								if (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).aBoolean8143) {
									stream.d((float) i_294_);
									stream.d((float) (method6340(i_294_, i_295_, -1419532745) + i_300_));
									stream.d((float) i_295_);
									stream.p((byte) (i_321_ >> 16));
									stream.p((byte) (i_321_ >> 8));
									stream.p((byte) i_321_);
									stream.p(-1);
									stream.d((float) i_294_);
									stream.d((float) i_295_);
									if ((((Class_xa_Sub3) this).anIntArrayArrayArray8533) != null)
										stream.d(is_273_ != null ? (float) (is_273_[i_293_] - 1) : 0.0F);
									if ((((Class_xa_Sub3) this).anInt8523 & 0x7) != 0) {
										stream.d(f_306_);
										stream.d(f_307_);
										stream.d(f_308_);
									}
								} else {
									stream.u((float) i_294_);
									stream.u((float) (method6340(i_294_, i_295_, -2119264527) + i_300_));
									stream.u((float) i_295_);
									stream.p((byte) (i_321_ >> 16));
									stream.p((byte) (i_321_ >> 8));
									stream.p((byte) i_321_);
									stream.p(-1);
									stream.u((float) i_294_);
									stream.u((float) i_295_);
									if ((((Class_xa_Sub3) this).anIntArrayArrayArray8533) != null)
										stream.u(is_273_ != null ? (float) (is_273_[i_293_] - 1) : 0.0F);
									if ((((Class_xa_Sub3) this).anInt8523 & 0x7) != 0) {
										stream.u(f_306_);
										stream.u(f_307_);
										stream.u(f_308_);
									}
								}
								i_320_ = ((Class_xa_Sub3) this).anInt8526++;
								is_292_[i_293_] = (short) i_320_;
								if (i_298_ != -1)
									class298_sub5s[i_320_] = class298_sub5s_267_[i_293_];
								class440.method5858(new Class298_Sub20(is_292_[i_293_]), l);
							} else {
								is_292_[i_293_] = ((Class298_Sub20) class298).aShort7314;
								i_320_ = is_292_[i_293_] & 0xffff;
								if (i_298_ != -1 && ((class298_sub5s_267_[i_293_].linkedKey * 7051297995265073167L) < (class298_sub5s[i_320_].linkedKey * 7051297995265073167L)))
									class298_sub5s[i_320_] = class298_sub5s_267_[i_293_];
							}
							for (int i_327_ = 0; i_327_ < i_289_; i_327_++)
								class298_sub5s_264_[i_327_].method2857(i_320_, i_304_, i_303_, f_305_);
							((Class_xa_Sub3) this).anInt8525++;
						}
					}
				}
			}
			for (int i_328_ = 0; i_328_ < ((Class_xa_Sub3) this).anInt8526; i_328_++) {
				Class298_Sub5 class298_sub5 = class298_sub5s[i_328_];
				if (class298_sub5 != null)
					class298_sub5.method2858(i_328_);
			}
			for (int i_329_ = 0; i_329_ < anInt6287 * -506105871; i_329_++) {
				for (int i_330_ = 0; i_330_ < anInt6286 * -1148794921; i_330_++) {
					short[] is_331_ = (((Class_xa_Sub3) this).aShortArrayArray8550[i_330_ * (anInt6287 * -506105871) + i_329_]);
					if (is_331_ != null) {
						int i_332_ = 0;
						int i_333_ = 0;
						while (i_333_ < is_331_.length) {
							int i_334_ = is_331_[i_333_++] & 0xffff;
							int i_335_ = is_331_[i_333_++] & 0xffff;
							int i_336_ = is_331_[i_333_++] & 0xffff;
							Class298_Sub5 class298_sub5 = class298_sub5s[i_334_];
							Class298_Sub5 class298_sub5_337_ = class298_sub5s[i_335_];
							Class298_Sub5 class298_sub5_338_ = class298_sub5s[i_336_];
							Class298_Sub5 class298_sub5_339_ = null;
							if (class298_sub5 != null) {
								class298_sub5.method2856(i_329_, i_330_, i_332_);
								class298_sub5_339_ = class298_sub5;
							}
							if (class298_sub5_337_ != null) {
								class298_sub5_337_.method2856(i_329_, i_330_, i_332_);
								if (class298_sub5_339_ == null || ((class298_sub5_337_.linkedKey * 7051297995265073167L) < (class298_sub5_339_.linkedKey * 7051297995265073167L)))
									class298_sub5_339_ = class298_sub5_337_;
							}
							if (class298_sub5_338_ != null) {
								class298_sub5_338_.method2856(i_329_, i_330_, i_332_);
								if (class298_sub5_339_ == null || ((class298_sub5_338_.linkedKey * 7051297995265073167L) < (class298_sub5_339_.linkedKey * 7051297995265073167L)))
									class298_sub5_339_ = class298_sub5_338_;
							}
							if (class298_sub5_339_ != null) {
								if (class298_sub5 != null)
									class298_sub5_339_.method2858(i_334_);
								if (class298_sub5_337_ != null)
									class298_sub5_339_.method2858(i_335_);
								if (class298_sub5_338_ != null)
									class298_sub5_339_.method2858(i_336_);
								class298_sub5_339_.method2856(i_329_, i_330_, i_332_);
							}
							i_332_++;
						}
					}
				}
			}
			stream.x();
			((Class_xa_Sub3) this).anInterface1_8538 = ((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5245(i, nativeheapbuffer, stream.f(), false);
			if (((Class_xa_Sub3) this).anInterface1_8538 instanceof Class40_Sub2)
				nativeheapbuffer.t();
			((Class_xa_Sub3) this).aClass32_8539 = new Class32(((Class_xa_Sub3) this).anInterface1_8538, 5126, 3, 0);
			((Class_xa_Sub3) this).aClass32_8540 = new Class32(((Class_xa_Sub3) this).anInterface1_8538, 5121, 4, 12);
			int i_340_;
			if (((Class_xa_Sub3) this).anIntArrayArrayArray8533 != null) {
				((Class_xa_Sub3) this).aClass32_8517 = new Class32(((Class_xa_Sub3) this).anInterface1_8538, 5126, 3, 16);
				i_340_ = 28;
			} else {
				((Class_xa_Sub3) this).aClass32_8517 = new Class32(((Class_xa_Sub3) this).anInterface1_8538, 5126, 2, 16);
				i_340_ = 24;
			}
			if ((((Class_xa_Sub3) this).anInt8523 & 0x7) != 0)
				((Class_xa_Sub3) this).aClass32_8519 = new Class32(((Class_xa_Sub3) this).anInterface1_8538, 5126, 3, i_340_);
			long[] ls = new long[((Class_xa_Sub3) this).aClass298Array8534.length];
			for (int i_341_ = 0; i_341_ < ((Class_xa_Sub3) this).aClass298Array8534.length; i_341_++) {
				Class298_Sub5 class298_sub5 = ((Class298_Sub5) ((Class_xa_Sub3) this).aClass298Array8534[i_341_]);
				ls[i_341_] = class298_sub5.linkedKey * 7051297995265073167L;
				class298_sub5.method2860(((Class_xa_Sub3) this).anInt8526);
			}
			Class365_Sub1_Sub3_Sub1.method4507(ls, (((Class_xa_Sub3) this).aClass298Array8534), (byte) -108);
			if (((Class_xa_Sub3) this).aClass44_8541 != null)
				((Class_xa_Sub3) this).aClass44_8541.method489();
		} else
			((Class_xa_Sub3) this).aClass44_8541 = null;
		if ((((Class_xa_Sub3) this).anInt8522 & 0x2) == 0) {
			((Class_xa_Sub3) this).anIntArrayArrayArray8531 = null;
			((Class_xa_Sub3) this).anIntArrayArrayArray8537 = null;
			((Class_xa_Sub3) this).anIntArrayArrayArray8528 = null;
		}
		((Class_xa_Sub3) this).anIntArrayArrayArray8533 = null;
		((Class_xa_Sub3) this).anIntArrayArrayArray8529 = null;
		((Class_xa_Sub3) this).anIntArrayArrayArray8532 = null;
		((Class_xa_Sub3) this).aClass298_Sub5ArrayArrayArray8527 = null;
		((Class_xa_Sub3) this).aByteArrayArray8545 = null;
		((Class_xa_Sub3) this).aClass440_8549 = null;
		((Class_xa_Sub3) this).aFloatArrayArray8548 = null;
		((Class_xa_Sub3) this).aFloatArrayArray8547 = null;
		((Class_xa_Sub3) this).aFloatArrayArray8530 = null;
	}

	public void method6357(int i, int i_342_, int i_343_, boolean[][] bools, boolean bool, int i_344_) {
		method6374(i, i_342_, i_343_, bools, bool, i_344_);
	}

	public void method6345(int i, int i_345_, int[] is, int[] is_346_, int[] is_347_, int[] is_348_, int[] is_349_, int[] is_350_, int[] is_351_, int[] is_352_, Class78 class78, boolean bool) {
		Interface_ma interface_ma = ((Class_xa_Sub3) this).aClass_ra_Sub2_8535.anInterface_ma5299;
		if (is_348_ != null && ((Class_xa_Sub3) this).anIntArrayArrayArray8533 == null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8533 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		if (is_346_ != null && ((Class_xa_Sub3) this).anIntArrayArrayArray8532 == null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8532 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		((Class_xa_Sub3) this).anIntArrayArrayArray8537[i][i_345_] = is;
		((Class_xa_Sub3) this).anIntArrayArrayArray8531[i][i_345_] = is_347_;
		((Class_xa_Sub3) this).anIntArrayArrayArray8528[i][i_345_] = is_349_;
		((Class_xa_Sub3) this).anIntArrayArrayArray8529[i][i_345_] = is_350_;
		if (((Class_xa_Sub3) this).anIntArrayArrayArray8533 != null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8533[i][i_345_] = is_348_;
		if (((Class_xa_Sub3) this).anIntArrayArrayArray8532 != null)
			((Class_xa_Sub3) this).anIntArrayArrayArray8532[i][i_345_] = is_346_;
		Class298_Sub5[] class298_sub5s = (((Class_xa_Sub3) this).aClass298_Sub5ArrayArrayArray8527[i][i_345_] = new Class298_Sub5[is_349_.length]);
		for (int i_353_ = 0; i_353_ < is_349_.length; i_353_++) {
			int i_354_ = is_351_[i_353_];
			int i_355_ = is_352_[i_353_];
			if ((((Class_xa_Sub3) this).anInt8523 & 0x20) != 0 && i_354_ != -1 && interface_ma.method174(i_354_, 156111587).aBoolean524) {
				i_355_ = 128;
				i_354_ = -1;
			}
			long l = ((long) (class78.anInt727 * -1475891183) << 48 | (long) (class78.anInt725 * 1996750669) << 42 | (long) (class78.anInt726 * -1212608691) << 28 | (long) (i_355_ << 14) | (long) i_354_);
			Linkable class298;
			for (class298 = ((Class_xa_Sub3) this).aClass440_8549.method5852(l); class298 != null; class298 = ((Class_xa_Sub3) this).aClass440_8549.method5853(-2112383276)) {
				Class298_Sub5 class298_sub5 = (Class298_Sub5) class298;
				if (((Class298_Sub5) class298_sub5).anInt7199 == i_354_ && (((Class298_Sub5) class298_sub5).aFloat7196 == (float) i_355_) && ((Class298_Sub5) class298_sub5).aClass78_7198.method843(class78, (byte) 12))
					break;
			}
			if (class298 == null) {
				class298_sub5s[i_353_] = new Class298_Sub5(this, i_354_, i_355_, class78);
				((Class_xa_Sub3) this).aClass440_8549.method5858(class298_sub5s[i_353_], l);
			} else
				class298_sub5s[i_353_] = (Class298_Sub5) class298;
		}
		if (bool)
			((Class_xa_Sub3) this).aByteArrayArray8546[i][i_345_] |= 0x1;
		if (is_349_.length > ((Class_xa_Sub3) this).anInt8544)
			((Class_xa_Sub3) this).anInt8544 = is_349_.length;
		((Class_xa_Sub3) this).anInt8543 += is_349_.length;
	}

	public void method6347(int i, int i_356_, int i_357_, int i_358_, int i_359_, int i_360_, int i_361_, boolean[][] bools) {
		Class52 class52 = ((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method4992((short) -5205);
		if (((Class_xa_Sub3) this).anInt8543 > 0 && class52 != null) {
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5291();
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5226(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5264(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5281(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5266(0);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5275(-2);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5256(null);
			aFloatArray8524[0] = (float) i_357_ / (128.0F * (float) (anInt6288 * -1212653763) * (float) class52.method545());
			aFloatArray8524[1] = 0.0F;
			aFloatArray8524[2] = 0.0F;
			aFloatArray8524[3] = 0.0F;
			aFloatArray8524[4] = 0.0F;
			aFloatArray8524[5] = (float) i_357_ / (128.0F * (float) (anInt6288 * -1212653763) * (float) class52.method552());
			aFloatArray8524[6] = 0.0F;
			aFloatArray8524[7] = 0.0F;
			aFloatArray8524[8] = 0.0F;
			aFloatArray8524[9] = 0.0F;
			aFloatArray8524[10] = 0.0F;
			aFloatArray8524[11] = 0.0F;
			aFloatArray8524[12] = -1.0F - ((float) (i_358_ * i_357_) / 128.0F - (float) (i * 2)) / (float) class52.method545();
			aFloatArray8524[13] = 1.0F - (((float) (2 * i_356_) + (float) (i_361_ * i_357_) / 128.0F) / (float) class52.method552());
			aFloatArray8524[14] = 0.0F;
			aFloatArray8524[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray8524, 0);
			aFloatArray8524[0] = 1.0F;
			aFloatArray8524[1] = 0.0F;
			aFloatArray8524[2] = 0.0F;
			aFloatArray8524[3] = 0.0F;
			aFloatArray8524[4] = 0.0F;
			aFloatArray8524[5] = 0.0F;
			aFloatArray8524[6] = 1.0F;
			aFloatArray8524[7] = 0.0F;
			aFloatArray8524[8] = 0.0F;
			aFloatArray8524[9] = 1.0F;
			aFloatArray8524[10] = 0.0F;
			aFloatArray8524[11] = 0.0F;
			aFloatArray8524[12] = 0.0F;
			aFloatArray8524[13] = 0.0F;
			aFloatArray8524[14] = 0.0F;
			aFloatArray8524[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray8524, 0);
			if ((((Class_xa_Sub3) this).anInt8523 & 0x7) != 0) {
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(true);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5279();
			} else
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5248(((Class_xa_Sub3) this).aClass32_8539, ((Class_xa_Sub3) this).aClass32_8519, ((Class_xa_Sub3) this).aClass32_8540, ((Class_xa_Sub3) this).aClass32_8517);
			if ((((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197.buffer).length < ((Class_xa_Sub3) this).anInt8525 * 2)
				((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197 = new RsFloatBuffer(((Class_xa_Sub3) this).anInt8525 * 2);
			else
				((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197.index = 0;
			int i_362_ = 0;
			RsFloatBuffer class298_sub53_sub1 = (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197);
			if (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aBoolean8143) {
				for (int i_363_ = i_359_; i_363_ < i_361_; i_363_++) {
					int i_364_ = i_363_ * (anInt6287 * -506105871) + i_358_;
					for (int i_365_ = i_358_; i_365_ < i_360_; i_365_++) {
						if (bools[i_365_ - i_358_][i_363_ - i_359_]) {
							short[] is = (((Class_xa_Sub3) this).aShortArrayArray8550[i_364_]);
							if (is != null) {
								for (int i_366_ = 0; i_366_ < is.length; i_366_++) {
									class298_sub53_sub1.writeShort((is[i_366_] & 0xffff), 16711935);
									i_362_++;
								}
							}
						}
						i_364_++;
					}
				}
			} else {
				for (int i_367_ = i_359_; i_367_ < i_361_; i_367_++) {
					int i_368_ = i_367_ * (anInt6287 * -506105871) + i_358_;
					for (int i_369_ = i_358_; i_369_ < i_360_; i_369_++) {
						if (bools[i_369_ - i_358_][i_367_ - i_359_]) {
							short[] is = (((Class_xa_Sub3) this).aShortArrayArray8550[i_368_]);
							if (is != null) {
								for (int i_370_ = 0; i_370_ < is.length; i_370_++) {
									class298_sub53_sub1.method3587((is[i_370_] & 0xffff), 1368367793);
									i_362_++;
								}
							}
						}
						i_368_++;
					}
				}
			}
			if (i_362_ > 0) {
				Class46_Sub1 class46_sub1 = new Class46_Sub1((((Class_xa_Sub3) this).aClass_ra_Sub2_8535), 5123, class298_sub53_sub1.buffer, (class298_sub53_sub1.index * 385051775));
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5254(class46_sub1, 4, 0, i_362_);
			}
		}
	}

	public void method6349(int i, int i_371_, int i_372_, int i_373_, int i_374_, int i_375_, int i_376_, boolean[][] bools) {
		Class52 class52 = ((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method4992((short) -3637);
		if (((Class_xa_Sub3) this).anInt8543 > 0 && class52 != null) {
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5291();
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5226(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5264(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5281(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5266(0);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5275(-2);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5256(null);
			aFloatArray8524[0] = (float) i_372_ / (128.0F * (float) (anInt6288 * -1212653763) * (float) class52.method545());
			aFloatArray8524[1] = 0.0F;
			aFloatArray8524[2] = 0.0F;
			aFloatArray8524[3] = 0.0F;
			aFloatArray8524[4] = 0.0F;
			aFloatArray8524[5] = (float) i_372_ / (128.0F * (float) (anInt6288 * -1212653763) * (float) class52.method552());
			aFloatArray8524[6] = 0.0F;
			aFloatArray8524[7] = 0.0F;
			aFloatArray8524[8] = 0.0F;
			aFloatArray8524[9] = 0.0F;
			aFloatArray8524[10] = 0.0F;
			aFloatArray8524[11] = 0.0F;
			aFloatArray8524[12] = -1.0F - ((float) (i_373_ * i_372_) / 128.0F - (float) (i * 2)) / (float) class52.method545();
			aFloatArray8524[13] = 1.0F - (((float) (2 * i_371_) + (float) (i_376_ * i_372_) / 128.0F) / (float) class52.method552());
			aFloatArray8524[14] = 0.0F;
			aFloatArray8524[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray8524, 0);
			aFloatArray8524[0] = 1.0F;
			aFloatArray8524[1] = 0.0F;
			aFloatArray8524[2] = 0.0F;
			aFloatArray8524[3] = 0.0F;
			aFloatArray8524[4] = 0.0F;
			aFloatArray8524[5] = 0.0F;
			aFloatArray8524[6] = 1.0F;
			aFloatArray8524[7] = 0.0F;
			aFloatArray8524[8] = 0.0F;
			aFloatArray8524[9] = 1.0F;
			aFloatArray8524[10] = 0.0F;
			aFloatArray8524[11] = 0.0F;
			aFloatArray8524[12] = 0.0F;
			aFloatArray8524[13] = 0.0F;
			aFloatArray8524[14] = 0.0F;
			aFloatArray8524[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray8524, 0);
			if ((((Class_xa_Sub3) this).anInt8523 & 0x7) != 0) {
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(true);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5279();
			} else
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5248(((Class_xa_Sub3) this).aClass32_8539, ((Class_xa_Sub3) this).aClass32_8519, ((Class_xa_Sub3) this).aClass32_8540, ((Class_xa_Sub3) this).aClass32_8517);
			if ((((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197.buffer).length < ((Class_xa_Sub3) this).anInt8525 * 2)
				((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197 = new RsFloatBuffer(((Class_xa_Sub3) this).anInt8525 * 2);
			else
				((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197.index = 0;
			int i_377_ = 0;
			RsFloatBuffer class298_sub53_sub1 = (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197);
			if (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aBoolean8143) {
				for (int i_378_ = i_374_; i_378_ < i_376_; i_378_++) {
					int i_379_ = i_378_ * (anInt6287 * -506105871) + i_373_;
					for (int i_380_ = i_373_; i_380_ < i_375_; i_380_++) {
						if (bools[i_380_ - i_373_][i_378_ - i_374_]) {
							short[] is = (((Class_xa_Sub3) this).aShortArrayArray8550[i_379_]);
							if (is != null) {
								for (int i_381_ = 0; i_381_ < is.length; i_381_++) {
									class298_sub53_sub1.writeShort((is[i_381_] & 0xffff), 16711935);
									i_377_++;
								}
							}
						}
						i_379_++;
					}
				}
			} else {
				for (int i_382_ = i_374_; i_382_ < i_376_; i_382_++) {
					int i_383_ = i_382_ * (anInt6287 * -506105871) + i_373_;
					for (int i_384_ = i_373_; i_384_ < i_375_; i_384_++) {
						if (bools[i_384_ - i_373_][i_382_ - i_374_]) {
							short[] is = (((Class_xa_Sub3) this).aShortArrayArray8550[i_383_]);
							if (is != null) {
								for (int i_385_ = 0; i_385_ < is.length; i_385_++) {
									class298_sub53_sub1.method3587((is[i_385_] & 0xffff), 1368367793);
									i_377_++;
								}
							}
						}
						i_383_++;
					}
				}
			}
			if (i_377_ > 0) {
				Class46_Sub1 class46_sub1 = new Class46_Sub1((((Class_xa_Sub3) this).aClass_ra_Sub2_8535), 5123, class298_sub53_sub1.buffer, (class298_sub53_sub1.index * 385051775));
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5254(class46_sub1, 4, 0, i_377_);
			}
		}
	}

	public boolean method6353(Class_na class_na, int i, int i_386_, int i_387_, int i_388_, boolean bool) {
		if (((Class_xa_Sub3) this).aClass44_8541 == null || class_na == null)
			return false;
		int i_389_ = (i - (i_386_ * ((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).anInt8066 >> 8) >> (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064));
		int i_390_ = (i_387_ - (i_386_ * (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8026) >> 8) >> (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064));
		return ((Class_xa_Sub3) this).aClass44_8541.method492(class_na, i_389_, i_390_);
	}

	public void method6358(Class298_Sub10 class298_sub10, int[] is) {
		((Class_xa_Sub3) this).aClass458_8536.method5968(new Class298_Sub3(((Class_xa_Sub3) this).aClass_ra_Sub2_8535, this, class298_sub10, is), 2091242360);
	}

	public void method6352(int i, int i_391_, int i_392_, int i_393_, int i_394_, int i_395_, int i_396_, boolean[][] bools) {
		Class52 class52 = ((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method4992((short) 8148);
		if (((Class_xa_Sub3) this).anInt8543 > 0 && class52 != null) {
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5291();
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5226(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5264(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5281(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5266(0);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5275(-2);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5256(null);
			aFloatArray8524[0] = (float) i_392_ / (128.0F * (float) (anInt6288 * -1212653763) * (float) class52.method545());
			aFloatArray8524[1] = 0.0F;
			aFloatArray8524[2] = 0.0F;
			aFloatArray8524[3] = 0.0F;
			aFloatArray8524[4] = 0.0F;
			aFloatArray8524[5] = (float) i_392_ / (128.0F * (float) (anInt6288 * -1212653763) * (float) class52.method552());
			aFloatArray8524[6] = 0.0F;
			aFloatArray8524[7] = 0.0F;
			aFloatArray8524[8] = 0.0F;
			aFloatArray8524[9] = 0.0F;
			aFloatArray8524[10] = 0.0F;
			aFloatArray8524[11] = 0.0F;
			aFloatArray8524[12] = -1.0F - ((float) (i_393_ * i_392_) / 128.0F - (float) (i * 2)) / (float) class52.method545();
			aFloatArray8524[13] = 1.0F - (((float) (2 * i_391_) + (float) (i_396_ * i_392_) / 128.0F) / (float) class52.method552());
			aFloatArray8524[14] = 0.0F;
			aFloatArray8524[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray8524, 0);
			aFloatArray8524[0] = 1.0F;
			aFloatArray8524[1] = 0.0F;
			aFloatArray8524[2] = 0.0F;
			aFloatArray8524[3] = 0.0F;
			aFloatArray8524[4] = 0.0F;
			aFloatArray8524[5] = 0.0F;
			aFloatArray8524[6] = 1.0F;
			aFloatArray8524[7] = 0.0F;
			aFloatArray8524[8] = 0.0F;
			aFloatArray8524[9] = 1.0F;
			aFloatArray8524[10] = 0.0F;
			aFloatArray8524[11] = 0.0F;
			aFloatArray8524[12] = 0.0F;
			aFloatArray8524[13] = 0.0F;
			aFloatArray8524[14] = 0.0F;
			aFloatArray8524[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray8524, 0);
			if ((((Class_xa_Sub3) this).anInt8523 & 0x7) != 0) {
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(true);
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5279();
			} else
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5262(false);
			((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5248(((Class_xa_Sub3) this).aClass32_8539, ((Class_xa_Sub3) this).aClass32_8519, ((Class_xa_Sub3) this).aClass32_8540, ((Class_xa_Sub3) this).aClass32_8517);
			if ((((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197.buffer).length < ((Class_xa_Sub3) this).anInt8525 * 2)
				((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197 = new RsFloatBuffer(((Class_xa_Sub3) this).anInt8525 * 2);
			else
				((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197.index = 0;
			int i_397_ = 0;
			RsFloatBuffer class298_sub53_sub1 = (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aClass298_Sub53_Sub1_8197);
			if (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).aBoolean8143) {
				for (int i_398_ = i_394_; i_398_ < i_396_; i_398_++) {
					int i_399_ = i_398_ * (anInt6287 * -506105871) + i_393_;
					for (int i_400_ = i_393_; i_400_ < i_395_; i_400_++) {
						if (bools[i_400_ - i_393_][i_398_ - i_394_]) {
							short[] is = (((Class_xa_Sub3) this).aShortArrayArray8550[i_399_]);
							if (is != null) {
								for (int i_401_ = 0; i_401_ < is.length; i_401_++) {
									class298_sub53_sub1.writeShort((is[i_401_] & 0xffff), 16711935);
									i_397_++;
								}
							}
						}
						i_399_++;
					}
				}
			} else {
				for (int i_402_ = i_394_; i_402_ < i_396_; i_402_++) {
					int i_403_ = i_402_ * (anInt6287 * -506105871) + i_393_;
					for (int i_404_ = i_393_; i_404_ < i_395_; i_404_++) {
						if (bools[i_404_ - i_393_][i_402_ - i_394_]) {
							short[] is = (((Class_xa_Sub3) this).aShortArrayArray8550[i_403_]);
							if (is != null) {
								for (int i_405_ = 0; i_405_ < is.length; i_405_++) {
									class298_sub53_sub1.method3587((is[i_405_] & 0xffff), 1368367793);
									i_397_++;
								}
							}
						}
						i_403_++;
					}
				}
			}
			if (i_397_ > 0) {
				Class46_Sub1 class46_sub1 = new Class46_Sub1((((Class_xa_Sub3) this).aClass_ra_Sub2_8535), 5123, class298_sub53_sub1.buffer, (class298_sub53_sub1.index * 385051775));
				((Class_xa_Sub3) this).aClass_ra_Sub2_8535.method5254(class46_sub1, 4, 0, i_397_);
			}
		}
	}

	public void method6337(int i, int i_406_, int[] is, int[] is_407_, int[] is_408_, int[] is_409_, int[] is_410_, int[] is_411_, int[] is_412_, int[] is_413_, int[] is_414_, int[] is_415_, int[] is_416_, Class78 class78, boolean bool) {
		int i_417_ = is_413_.length;
		int[] is_418_ = new int[i_417_ * 3];
		int[] is_419_ = new int[i_417_ * 3];
		int[] is_420_ = new int[i_417_ * 3];
		int[] is_421_ = is_414_ != null ? new int[i_417_ * 3] : null;
		int[] is_422_ = new int[i_417_ * 3];
		int[] is_423_ = new int[i_417_ * 3];
		int[] is_424_ = is_407_ != null ? new int[i_417_ * 3] : null;
		int[] is_425_ = is_409_ != null ? new int[i_417_ * 3] : null;
		int i_426_ = 0;
		for (int i_427_ = 0; i_427_ < i_417_; i_427_++) {
			int i_428_ = is_410_[i_427_];
			int i_429_ = is_411_[i_427_];
			int i_430_ = is_412_[i_427_];
			is_418_[i_426_] = is[i_428_];
			is_419_[i_426_] = is_408_[i_428_];
			is_420_[i_426_] = is_413_[i_427_];
			is_422_[i_426_] = is_415_[i_427_];
			is_423_[i_426_] = is_416_[i_427_];
			if (is_414_ != null)
				is_421_[i_426_] = is_414_[i_427_];
			if (is_407_ != null)
				is_424_[i_426_] = is_407_[i_428_];
			if (is_409_ != null)
				is_425_[i_426_] = is_409_[i_428_];
			i_426_++;
			is_418_[i_426_] = is[i_429_];
			is_419_[i_426_] = is_408_[i_429_];
			is_420_[i_426_] = is_413_[i_427_];
			is_422_[i_426_] = is_415_[i_427_];
			is_423_[i_426_] = is_416_[i_427_];
			if (is_414_ != null)
				is_421_[i_426_] = is_414_[i_427_];
			if (is_407_ != null)
				is_424_[i_426_] = is_407_[i_429_];
			if (is_409_ != null)
				is_425_[i_426_] = is_409_[i_429_];
			i_426_++;
			is_418_[i_426_] = is[i_430_];
			is_419_[i_426_] = is_408_[i_430_];
			is_420_[i_426_] = is_413_[i_427_];
			is_422_[i_426_] = is_415_[i_427_];
			is_423_[i_426_] = is_416_[i_427_];
			if (is_414_ != null)
				is_421_[i_426_] = is_414_[i_427_];
			if (is_407_ != null)
				is_424_[i_426_] = is_407_[i_430_];
			if (is_409_ != null)
				is_425_[i_426_] = is_409_[i_430_];
			i_426_++;
		}
		method6335(i, i_406_, is_418_, is_424_, is_419_, is_425_, is_420_, is_421_, is_422_, is_423_, class78, bool);
	}

	public Class_na ax(int i, int i_431_, Class_na class_na) {
		if ((((Class_xa_Sub3) this).aByteArrayArray8546[i][i_431_] & 0x1) == 0)
			return null;
		int i_432_ = (anInt6288 * -1212653763 >> (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064));
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		Class_na_Sub1 class_na_sub1_433_;
		if (class_na_sub1 != null && class_na_sub1.method3481(i_432_, i_432_)) {
			class_na_sub1_433_ = class_na_sub1;
			class_na_sub1_433_.method3482();
		} else
			class_na_sub1_433_ = new Class_na_Sub1(((Class_xa_Sub3) this).aClass_ra_Sub2_8535, i_432_, i_432_);
		class_na_sub1_433_.method3485(0, 0, i_432_, i_432_);
		method6375(class_na_sub1_433_, i, i_431_);
		return class_na_sub1_433_;
	}

	Class_xa_Sub3(Class_ra_Sub2 class_ra_sub2, int i, int i_434_, int i_435_, int i_436_, int[][] is, int[][] is_437_, int i_438_) {
		super(i_435_, i_436_, i_438_, is);
		((Class_xa_Sub3) this).aClass_ra_Sub2_8535 = class_ra_sub2;
		((Class_xa_Sub3) this).anInt8520 = anInt6289 * -2137349879 - 2;
		((Class_xa_Sub3) this).anInt8521 = 1 << ((Class_xa_Sub3) this).anInt8520;
		((Class_xa_Sub3) this).anInt8522 = i;
		((Class_xa_Sub3) this).anInt8523 = i_434_;
		((Class_xa_Sub3) this).anIntArrayArrayArray8532 = new int[i_435_][i_436_][];
		((Class_xa_Sub3) this).aClass298_Sub5ArrayArrayArray8527 = new Class298_Sub5[i_435_][i_436_][];
		((Class_xa_Sub3) this).anIntArrayArrayArray8537 = new int[i_435_][i_436_][];
		((Class_xa_Sub3) this).anIntArrayArrayArray8531 = new int[i_435_][i_436_][];
		((Class_xa_Sub3) this).anIntArrayArrayArray8528 = new int[i_435_][i_436_][];
		((Class_xa_Sub3) this).anIntArrayArrayArray8529 = new int[i_435_][i_436_][];
		((Class_xa_Sub3) this).aShortArrayArray8550 = new short[i_435_ * i_436_][];
		((Class_xa_Sub3) this).aByteArrayArray8546 = new byte[i_435_][i_436_];
		((Class_xa_Sub3) this).aByteArrayArray8545 = new byte[i_435_ + 1][i_436_ + 1];
		((Class_xa_Sub3) this).aFloatArrayArray8530 = (new float[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
		((Class_xa_Sub3) this).aFloatArrayArray8547 = (new float[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
		((Class_xa_Sub3) this).aFloatArrayArray8548 = (new float[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
		for (int i_439_ = 1; i_439_ < anInt6286 * -1148794921; i_439_++) {
			for (int i_440_ = 1; i_440_ < anInt6287 * -506105871; i_440_++) {
				int i_441_ = (is_437_[i_440_ + 1][i_439_] - is_437_[i_440_ - 1][i_439_]);
				int i_442_ = (is_437_[i_440_][i_439_ + 1] - is_437_[i_440_][i_439_ - 1]);
				float f = (float) (1.0 / Math.sqrt((double) (i_441_ * i_441_ + 4 * i_438_ * i_438_ + i_442_ * i_442_)));
				((Class_xa_Sub3) this).aFloatArrayArray8530[i_440_][i_439_] = (float) i_441_ * f;
				((Class_xa_Sub3) this).aFloatArrayArray8547[i_440_][i_439_] = (float) (-i_438_ * 2) * f;
				((Class_xa_Sub3) this).aFloatArrayArray8548[i_440_][i_439_] = (float) i_442_ * f;
			}
		}
		((Class_xa_Sub3) this).aClass440_8549 = new Class440(128);
		if ((((Class_xa_Sub3) this).anInt8523 & 0x10) != 0)
			((Class_xa_Sub3) this).aClass44_8541 = new Class44(((Class_xa_Sub3) this).aClass_ra_Sub2_8535, this);
	}

	public void ak(Class_na class_na, int i, int i_443_, int i_444_, int i_445_, boolean bool) {
		if (((Class_xa_Sub3) this).aClass44_8541 != null && class_na != null) {
			int i_446_ = (i - (i_443_ * (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8066) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064);
			int i_447_ = (i_444_ - (i_443_ * (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).anInt8026) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064);
			((Class_xa_Sub3) this).aClass44_8541.method496(class_na, i_446_, i_447_);
		}
	}

	public boolean method6354(Class_na class_na, int i, int i_448_, int i_449_, int i_450_, boolean bool) {
		if (((Class_xa_Sub3) this).aClass44_8541 == null || class_na == null)
			return false;
		int i_451_ = (i - (i_448_ * ((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).anInt8066 >> 8) >> (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064));
		int i_452_ = (i_449_ - (i_448_ * (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8026) >> 8) >> (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064));
		return ((Class_xa_Sub3) this).aClass44_8541.method492(class_na, i_451_, i_452_);
	}

	public boolean method6355(Class_na class_na, int i, int i_453_, int i_454_, int i_455_, boolean bool) {
		if (((Class_xa_Sub3) this).aClass44_8541 == null || class_na == null)
			return false;
		int i_456_ = (i - (i_453_ * ((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).anInt8066 >> 8) >> (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064));
		int i_457_ = (i_454_ - (i_453_ * (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8026) >> 8) >> (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064));
		return ((Class_xa_Sub3) this).aClass44_8541.method492(class_na, i_456_, i_457_);
	}

	public void method6336(int i, int i_458_, int[] is, int[] is_459_, int[] is_460_, int[] is_461_, int[] is_462_, int[] is_463_, int[] is_464_, int[] is_465_, int[] is_466_, int[] is_467_, int[] is_468_, Class78 class78, boolean bool) {
		int i_469_ = is_465_.length;
		int[] is_470_ = new int[i_469_ * 3];
		int[] is_471_ = new int[i_469_ * 3];
		int[] is_472_ = new int[i_469_ * 3];
		int[] is_473_ = is_466_ != null ? new int[i_469_ * 3] : null;
		int[] is_474_ = new int[i_469_ * 3];
		int[] is_475_ = new int[i_469_ * 3];
		int[] is_476_ = is_459_ != null ? new int[i_469_ * 3] : null;
		int[] is_477_ = is_461_ != null ? new int[i_469_ * 3] : null;
		int i_478_ = 0;
		for (int i_479_ = 0; i_479_ < i_469_; i_479_++) {
			int i_480_ = is_462_[i_479_];
			int i_481_ = is_463_[i_479_];
			int i_482_ = is_464_[i_479_];
			is_470_[i_478_] = is[i_480_];
			is_471_[i_478_] = is_460_[i_480_];
			is_472_[i_478_] = is_465_[i_479_];
			is_474_[i_478_] = is_467_[i_479_];
			is_475_[i_478_] = is_468_[i_479_];
			if (is_466_ != null)
				is_473_[i_478_] = is_466_[i_479_];
			if (is_459_ != null)
				is_476_[i_478_] = is_459_[i_480_];
			if (is_461_ != null)
				is_477_[i_478_] = is_461_[i_480_];
			i_478_++;
			is_470_[i_478_] = is[i_481_];
			is_471_[i_478_] = is_460_[i_481_];
			is_472_[i_478_] = is_465_[i_479_];
			is_474_[i_478_] = is_467_[i_479_];
			is_475_[i_478_] = is_468_[i_479_];
			if (is_466_ != null)
				is_473_[i_478_] = is_466_[i_479_];
			if (is_459_ != null)
				is_476_[i_478_] = is_459_[i_481_];
			if (is_461_ != null)
				is_477_[i_478_] = is_461_[i_481_];
			i_478_++;
			is_470_[i_478_] = is[i_482_];
			is_471_[i_478_] = is_460_[i_482_];
			is_472_[i_478_] = is_465_[i_479_];
			is_474_[i_478_] = is_467_[i_479_];
			is_475_[i_478_] = is_468_[i_479_];
			if (is_466_ != null)
				is_473_[i_478_] = is_466_[i_479_];
			if (is_459_ != null)
				is_476_[i_478_] = is_459_[i_482_];
			if (is_461_ != null)
				is_477_[i_478_] = is_461_[i_482_];
			i_478_++;
		}
		method6335(i, i_458_, is_470_, is_476_, is_471_, is_477_, is_472_, is_473_, is_474_, is_475_, class78, bool);
	}

	public void method6348(int i, int i_483_, int i_484_, boolean[][] bools, boolean bool, int i_485_) {
		method6374(i, i_483_, i_484_, bools, bool, i_485_);
	}

	public void at(int i, int i_486_, int i_487_) {
		if ((((Class_xa_Sub3) this).aByteArrayArray8545[i][i_486_] & 0xff) < i_487_)
			((Class_xa_Sub3) this).aByteArrayArray8545[i][i_486_] = (byte) i_487_;
	}

	public void av(Class_na class_na, int i, int i_488_, int i_489_, int i_490_, boolean bool) {
		if (((Class_xa_Sub3) this).aClass44_8541 != null && class_na != null) {
			int i_491_ = (i - (i_488_ * (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8066) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064);
			int i_492_ = (i_489_ - (i_488_ * (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).anInt8026) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064);
			((Class_xa_Sub3) this).aClass44_8541.method491(class_na, i_491_, i_492_);
		}
	}

	public void method6344(Class298_Sub10 class298_sub10, int[] is) {
		((Class_xa_Sub3) this).aClass458_8536.method5968(new Class298_Sub3(((Class_xa_Sub3) this).aClass_ra_Sub2_8535, this, class298_sub10, is), 1011020488);
	}

	public void UA(Class_na class_na, int i, int i_493_, int i_494_, int i_495_, boolean bool) {
		if (((Class_xa_Sub3) this).aClass44_8541 != null && class_na != null) {
			int i_496_ = (i - (i_493_ * (((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8066) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064);
			int i_497_ = (i_494_ - (i_493_ * (((Class_ra_Sub2) (((Class_xa_Sub3) this).aClass_ra_Sub2_8535)).anInt8026) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub3) this).aClass_ra_Sub2_8535).anInt8064);
			((Class_xa_Sub3) this).aClass44_8541.method496(class_na, i_496_, i_497_);
		}
	}
}
