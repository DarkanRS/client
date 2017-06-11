/* Class_xa_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jaclib.memory.Stream;

public class Class_xa_Sub1 extends Class_xa {
	float aFloat8447;
	static int anInt8448 = 74;
	Interface7_Impl1 anInterface7_Impl1_8449;
	int anInt8450;
	int anInt8451;
	Class169 aClass169_8452;
	static int anInt8453;
	int anInt8454;
	int anInt8455;
	short[][] aShortArrayArray8456;
	float aFloat8457 = 3.4028235E38F;
	int[][][] anIntArrayArrayArray8458;
	Class298_Sub16[][][] aClass298_Sub16ArrayArrayArray8459;
	int[][][] anIntArrayArrayArray8460;
	int[][][] anIntArrayArrayArray8461;
	int[][][] anIntArrayArrayArray8462;
	int anInt8463;
	static int anInt8464 = 1;
	int[][][] anIntArrayArrayArray8465;
	float[][] aFloatArrayArray8466;
	Class_ra_Sub3 aClass_ra_Sub3_8467;
	Class458 aClass458_8468;
	byte[][] aByteArrayArray8469;
	Interface7_Impl1 anInterface7_Impl1_8470;
	static int[] anIntArray8471;
	Class153 aClass153_8472;
	int anInt8473;
	int anInt8474;
	byte[][] aByteArrayArray8475;
	float[][] aFloatArrayArray8476;
	float[][] aFloatArrayArray8477;
	Linkable[] aClass298Array8478;
	Class440 aClass440_8479;
	static int[] anIntArray8480 = new int[1];
	static int[] anIntArray8481 = new int[1];
	int anInt8482;
	int[][][] anIntArrayArrayArray8483;

	public void h() {
		if (((Class_xa_Sub1) this).anInt8473 > 0) {
			byte[][] is = (new byte[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
			for (int i = 1; i < anInt6287 * -506105871; i++) {
				for (int i_0_ = 1; i_0_ < anInt6286 * -1148794921; i_0_++)
					is[i][i_0_] = (byte) (((((Class_xa_Sub1) this).aByteArrayArray8475[i - 1][i_0_]) >> 2) + ((((Class_xa_Sub1) this).aByteArrayArray8475[i + 1][i_0_]) >> 3) + ((((Class_xa_Sub1) this).aByteArrayArray8475[i][i_0_ - 1]) >> 2) + ((((Class_xa_Sub1) this).aByteArrayArray8475[i][i_0_ + 1]) >> 3) + ((((Class_xa_Sub1) this).aByteArrayArray8475[i][i_0_]) >> 1));
			}
			Linkable[] class298s = new Linkable[((Class_xa_Sub1) this).aClass440_8479.method5855(1016688966)];
			((Class_xa_Sub1) this).aClass440_8479.method5854(class298s, 2103539357);
			for (int i = 0; i < class298s.length; i++)
				((Class298_Sub16) class298s[i]).method2910(((Class_xa_Sub1) this).anInt8473);
			int i = 20;
			if (((Class_xa_Sub1) this).anIntArrayArrayArray8465 != null)
				i += 4;
			if ((((Class_xa_Sub1) this).anInt8482 & 0x7) != 0)
				i += 12;
			jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = ((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aNativeHeap8221.f(((Class_xa_Sub1) this).anInt8473 * 4, false);
			jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer_1_ = ((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aNativeHeap8221.f(((Class_xa_Sub1) this).anInt8473 * i, false);
			Stream stream = new Stream(nativeheapbuffer_1_);
			Stream stream_2_ = new Stream(nativeheapbuffer);
			Class298_Sub16[] class298_sub16s = new Class298_Sub16[((Class_xa_Sub1) this).anInt8473];
			int i_3_ = Class422_Sub4.method5639((((Class_xa_Sub1) this).anInt8473 / 4), 1661685249);
			if (i_3_ < 1)
				i_3_ = 1;
			Class440 class440 = new Class440(i_3_);
			Class298_Sub16[] class298_sub16s_4_ = new Class298_Sub16[((Class_xa_Sub1) this).anInt8474];
			for (int i_5_ = 0; i_5_ < anInt6287 * -506105871; i_5_++) {
				for (int i_6_ = 0; i_6_ < anInt6286 * -1148794921; i_6_++) {
					if ((((Class_xa_Sub1) this).anIntArrayArrayArray8483[i_5_][i_6_]) != null) {
						Class298_Sub16[] class298_sub16s_7_ = (((Class_xa_Sub1) this).aClass298_Sub16ArrayArrayArray8459[i_5_][i_6_]);
						int[] is_8_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8462[i_5_][i_6_]);
						int[] is_9_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8458[i_5_][i_6_]);
						int[] is_10_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8461[i_5_][i_6_]);
						int[] is_11_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8483[i_5_][i_6_]);
						int[] is_12_ = ((((Class_xa_Sub1) this).anIntArrayArrayArray8460 != null) ? (((Class_xa_Sub1) this).anIntArrayArrayArray8460[i_5_][i_6_]) : null);
						int[] is_13_ = ((((Class_xa_Sub1) this).anIntArrayArrayArray8465 != null) ? (((Class_xa_Sub1) this).anIntArrayArrayArray8465[i_5_][i_6_]) : null);
						if (is_10_ == null)
							is_10_ = is_11_;
						float f = (((Class_xa_Sub1) this).aFloatArrayArray8476[i_5_][i_6_]);
						float f_14_ = (((Class_xa_Sub1) this).aFloatArrayArray8477[i_5_][i_6_]);
						float f_15_ = (((Class_xa_Sub1) this).aFloatArrayArray8466[i_5_][i_6_]);
						float f_16_ = (((Class_xa_Sub1) this).aFloatArrayArray8476[i_5_][i_6_ + 1]);
						float f_17_ = (((Class_xa_Sub1) this).aFloatArrayArray8477[i_5_][i_6_ + 1]);
						float f_18_ = (((Class_xa_Sub1) this).aFloatArrayArray8466[i_5_][i_6_ + 1]);
						float f_19_ = (((Class_xa_Sub1) this).aFloatArrayArray8476[i_5_ + 1][i_6_ + 1]);
						float f_20_ = (((Class_xa_Sub1) this).aFloatArrayArray8477[i_5_ + 1][i_6_ + 1]);
						float f_21_ = (((Class_xa_Sub1) this).aFloatArrayArray8466[i_5_ + 1][i_6_ + 1]);
						float f_22_ = (((Class_xa_Sub1) this).aFloatArrayArray8476[i_5_ + 1][i_6_]);
						float f_23_ = (((Class_xa_Sub1) this).aFloatArrayArray8477[i_5_ + 1][i_6_]);
						float f_24_ = (((Class_xa_Sub1) this).aFloatArrayArray8466[i_5_ + 1][i_6_]);
						int i_25_ = is[i_5_][i_6_] & 0xff;
						int i_26_ = is[i_5_][i_6_ + 1] & 0xff;
						int i_27_ = is[i_5_ + 1][i_6_ + 1] & 0xff;
						int i_28_ = is[i_5_ + 1][i_6_] & 0xff;
						int i_29_ = 0;
						while_110_: for (int i_30_ = 0; i_30_ < is_11_.length; i_30_++) {
							Class298_Sub16 class298_sub16 = class298_sub16s_7_[i_30_];
							for (int i_31_ = 0; i_31_ < i_29_; i_31_++) {
								if (class298_sub16s_4_[i_31_] == class298_sub16)
									continue while_110_;
							}
							class298_sub16s_4_[i_29_++] = class298_sub16;
						}
						short[] is_32_ = (((Class_xa_Sub1) this).aShortArrayArray8456[i_6_ * (anInt6287 * -506105871) + i_5_] = new short[is_11_.length]);
						for (int i_33_ = 0; i_33_ < is_11_.length; i_33_++) {
							int i_34_ = ((i_5_ << anInt6289 * -2137349879) + is_8_[i_33_]);
							int i_35_ = ((i_6_ << anInt6289 * -2137349879) + is_9_[i_33_]);
							int i_36_ = i_34_ >> ((Class_xa_Sub1) this).anInt8450;
							int i_37_ = i_35_ >> ((Class_xa_Sub1) this).anInt8450;
							int i_38_ = is_11_[i_33_];
							int i_39_ = is_10_[i_33_];
							int i_40_ = is_12_ != null ? is_12_[i_33_] : 0;
							long l = ((long) i_39_ << 48 | (long) i_38_ << 32 | (long) (i_36_ << 16) | (long) i_37_);
							int i_41_ = is_8_[i_33_];
							int i_42_ = is_9_[i_33_];
							int i_43_ = 74;
							int i_44_ = 0;
							float f_45_ = 1.0F;
							float f_46_;
							float f_47_;
							float f_48_;
							if (i_41_ == 0 && i_42_ == 0) {
								f_46_ = f;
								f_47_ = f_14_;
								f_48_ = f_15_;
								i_43_ -= i_25_;
							} else if (i_41_ == 0 && i_42_ == anInt6288 * -1212653763) {
								f_46_ = f_16_;
								f_47_ = f_17_;
								f_48_ = f_18_;
								i_43_ -= i_26_;
							} else if (i_41_ == anInt6288 * -1212653763 && i_42_ == anInt6288 * -1212653763) {
								f_46_ = f_19_;
								f_47_ = f_20_;
								f_48_ = f_21_;
								i_43_ -= i_27_;
							} else if (i_41_ == anInt6288 * -1212653763 && i_42_ == 0) {
								f_46_ = f_22_;
								f_47_ = f_23_;
								f_48_ = f_24_;
								i_43_ -= i_28_;
							} else {
								float f_49_ = ((float) i_41_ / (float) (anInt6288 * -1212653763));
								float f_50_ = ((float) i_42_ / (float) (anInt6288 * -1212653763));
								float f_51_ = f + (f_22_ - f) * f_49_;
								float f_52_ = f_14_ + (f_23_ - f_14_) * f_49_;
								float f_53_ = f_15_ + (f_24_ - f_15_) * f_49_;
								float f_54_ = f_16_ + (f_19_ - f_16_) * f_49_;
								float f_55_ = f_17_ + (f_20_ - f_17_) * f_49_;
								float f_56_ = f_18_ + (f_21_ - f_18_) * f_49_;
								f_46_ = f_51_ + (f_54_ - f_51_) * f_50_;
								f_47_ = f_52_ + (f_55_ - f_52_) * f_50_;
								f_48_ = f_53_ + (f_56_ - f_53_) * f_50_;
								int i_57_ = i_25_ + ((i_28_ - i_25_) * i_41_ >> anInt6289 * -2137349879);
								int i_58_ = i_26_ + ((i_27_ - i_26_) * i_41_ >> anInt6289 * -2137349879);
								i_43_ -= i_57_ + ((i_58_ - i_57_) * i_42_ >> anInt6289 * -2137349879);
							}
							if (i_38_ != -1) {
								int i_59_ = (i_38_ & 0x7f) * i_43_ >> 7;
								if (i_59_ < 2)
									i_59_ = 2;
								else if (i_59_ > 126)
									i_59_ = 126;
								i_44_ = (Class294.anIntArray3165[i_38_ & 0xff80 | i_59_]);
								if ((((Class_xa_Sub1) this).anInt8482 & 0x7) == 0) {
									f_45_ = ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[0]) * f_46_ + (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[1]) * f_47_ + (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[2]) * f_48_);
									f_45_ = ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8291) + f_45_ * (f_45_ > 0.0F ? (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8364) : (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8293)));
								}
							}
							Linkable class298 = null;
							if (((i_34_ & ((Class_xa_Sub1) this).anInt8451 - 1) == 0) && ((i_35_ & ((Class_xa_Sub1) this).anInt8451 - 1) == 0))
								class298 = class440.method5852(l);
							int i_60_;
							if (class298 == null) {
								int i_61_;
								if (i_39_ != i_38_) {
									int i_62_ = (i_39_ & 0x7f) * i_43_ >> 7;
									if (i_62_ < 2)
										i_62_ = 2;
									else if (i_62_ > 126)
										i_62_ = 126;
									i_61_ = (Class294.anIntArray3165[i_39_ & 0xff80 | i_62_]);
									if ((((Class_xa_Sub1) this).anInt8482 & 0x7) == 0) {
										float f_63_ = ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[0]) * f_46_ + (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[1]) * f_47_ + ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[2]) * f_48_));
										f_63_ = ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8291) + (f_45_ * (f_45_ > 0.0F ? (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8364) : (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8293))));
										int i_64_ = i_61_ >> 16 & 0xff;
										int i_65_ = i_61_ >> 8 & 0xff;
										int i_66_ = i_61_ & 0xff;
										i_64_ *= f_63_;
										if (i_64_ < 0)
											i_64_ = 0;
										else if (i_64_ > 255)
											i_64_ = 255;
										i_65_ *= f_63_;
										if (i_65_ < 0)
											i_65_ = 0;
										else if (i_65_ > 255)
											i_65_ = 255;
										i_66_ *= f_63_;
										if (i_66_ < 0)
											i_66_ = 0;
										else if (i_66_ > 255)
											i_66_ = 255;
										i_61_ = i_64_ << 16 | i_65_ << 8 | i_66_;
									}
								} else
									i_61_ = i_44_;
								if (Stream.r()) {
									stream.d((float) i_34_);
									stream.d((float) (method6340(i_34_, i_35_, -1715806278) + i_40_));
									stream.d((float) i_35_);
									stream.d((float) i_34_);
									stream.d((float) i_35_);
									if ((((Class_xa_Sub1) this).anIntArrayArrayArray8465) != null)
										stream.d(is_13_ != null ? (float) (is_13_[i_33_] - 1) : 0.0F);
									if ((((Class_xa_Sub1) this).anInt8482 & 0x7) != 0) {
										stream.d(f_46_);
										stream.d(f_47_);
										stream.d(f_48_);
									}
								} else {
									stream.u((float) i_34_);
									stream.u((float) (method6340(i_34_, i_35_, -2089316863) + i_40_));
									stream.u((float) i_35_);
									stream.u((float) i_34_);
									stream.u((float) i_35_);
									if ((((Class_xa_Sub1) this).anIntArrayArrayArray8465) != null)
										stream.u(is_13_ != null ? (float) (is_13_[i_33_] - 1) : 0.0F);
									if ((((Class_xa_Sub1) this).anInt8482 & 0x7) != 0) {
										stream.u(f_46_);
										stream.u(f_47_);
										stream.u(f_48_);
									}
								}
								if ((((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).anInt8346) == 0)
									stream_2_.i(~0xffffff | i_61_);
								else
									stream_2_.k(~0xffffff | i_61_);
								i_60_ = ((Class_xa_Sub1) this).anInt8454++;
								is_32_[i_33_] = (short) i_60_;
								if (i_38_ != -1)
									class298_sub16s[i_60_] = class298_sub16s_7_[i_33_];
								class440.method5858(new Class298_Sub20(is_32_[i_33_]), l);
							} else {
								is_32_[i_33_] = ((Class298_Sub20) class298).aShort7314;
								i_60_ = is_32_[i_33_] & 0xffff;
								if (i_38_ != -1 && ((class298_sub16s_7_[i_33_].linkedKey * 7051297995265073167L) < (class298_sub16s[i_60_].linkedKey * 7051297995265073167L)))
									class298_sub16s[i_60_] = class298_sub16s_7_[i_33_];
							}
							for (int i_67_ = 0; i_67_ < i_29_; i_67_++)
								class298_sub16s_4_[i_67_].method2913(i_60_, i_44_, i_43_, f_45_);
							((Class_xa_Sub1) this).anInt8455++;
						}
					}
				}
			}
			for (int i_68_ = 0; i_68_ < ((Class_xa_Sub1) this).anInt8454; i_68_++) {
				Class298_Sub16 class298_sub16 = class298_sub16s[i_68_];
				if (class298_sub16 != null)
					class298_sub16.method2911(i_68_);
			}
			for (int i_69_ = 0; i_69_ < anInt6287 * -506105871; i_69_++) {
				for (int i_70_ = 0; i_70_ < anInt6286 * -1148794921; i_70_++) {
					short[] is_71_ = (((Class_xa_Sub1) this).aShortArrayArray8456[i_70_ * (anInt6287 * -506105871) + i_69_]);
					if (is_71_ != null) {
						int i_72_ = 0;
						int i_73_ = 0;
						while (i_73_ < is_71_.length) {
							int i_74_ = is_71_[i_73_++] & 0xffff;
							int i_75_ = is_71_[i_73_++] & 0xffff;
							int i_76_ = is_71_[i_73_++] & 0xffff;
							Class298_Sub16 class298_sub16 = class298_sub16s[i_74_];
							Class298_Sub16 class298_sub16_77_ = class298_sub16s[i_75_];
							Class298_Sub16 class298_sub16_78_ = class298_sub16s[i_76_];
							Class298_Sub16 class298_sub16_79_ = null;
							if (class298_sub16 != null) {
								class298_sub16.method2912(i_69_, i_70_, i_72_);
								class298_sub16_79_ = class298_sub16;
							}
							if (class298_sub16_77_ != null) {
								class298_sub16_77_.method2912(i_69_, i_70_, i_72_);
								if (class298_sub16_79_ == null || ((class298_sub16_77_.linkedKey * 7051297995265073167L) < (class298_sub16_79_.linkedKey * 7051297995265073167L)))
									class298_sub16_79_ = class298_sub16_77_;
							}
							if (class298_sub16_78_ != null) {
								class298_sub16_78_.method2912(i_69_, i_70_, i_72_);
								if (class298_sub16_79_ == null || ((class298_sub16_78_.linkedKey * 7051297995265073167L) < (class298_sub16_79_.linkedKey * 7051297995265073167L)))
									class298_sub16_79_ = class298_sub16_78_;
							}
							if (class298_sub16_79_ != null) {
								if (class298_sub16 != null)
									class298_sub16_79_.method2911(i_74_);
								if (class298_sub16_77_ != null)
									class298_sub16_79_.method2911(i_75_);
								if (class298_sub16_78_ != null)
									class298_sub16_79_.method2911(i_76_);
								class298_sub16_79_.method2912(i_69_, i_70_, i_72_);
							}
							i_72_++;
						}
					}
				}
			}
			stream.x();
			stream_2_.x();
			((Class_xa_Sub1) this).anInterface7_Impl1_8449 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5382(false);
			((Class_xa_Sub1) this).anInterface7_Impl1_8449.method71(((Class_xa_Sub1) this).anInt8454 * 4, 4, nativeheapbuffer);
			((Class_xa_Sub1) this).anInterface7_Impl1_8470 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5382(false);
			((Class_xa_Sub1) this).anInterface7_Impl1_8470.method71(((Class_xa_Sub1) this).anInt8454 * i, i, nativeheapbuffer_1_);
			if ((((Class_xa_Sub1) this).anInt8482 & 0x7) != 0) {
				if (((Class_xa_Sub1) this).anIntArrayArrayArray8465 != null)
					((Class_xa_Sub1) this).aClass153_8472 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1599, Class155.aClass155_1601, Class155.aClass155_1596 }), new Class181(Class155.aClass155_1597) }));
				else
					((Class_xa_Sub1) this).aClass153_8472 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1599, Class155.aClass155_1596 }), new Class181(Class155.aClass155_1597) }));
			} else if (((Class_xa_Sub1) this).anIntArrayArrayArray8465 != null)
				((Class_xa_Sub1) this).aClass153_8472 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1599, Class155.aClass155_1601 }), new Class181(Class155.aClass155_1597) }));
			else
				((Class_xa_Sub1) this).aClass153_8472 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1599 }), new Class181(Class155.aClass155_1597) }));
			int i_80_ = 0;
			for (int i_81_ = 0; i_81_ < class298s.length; i_81_++) {
				Class298_Sub16 class298_sub16 = (Class298_Sub16) class298s[i_81_];
				if (((Class298_Sub16) class298_sub16).anInt7290 > 0)
					class298s[i_80_++] = class298_sub16;
			}
			((Class_xa_Sub1) this).aClass298Array8478 = new Linkable[i_80_];
			long[] ls = new long[i_80_];
			for (int i_82_ = 0; i_82_ < i_80_; i_82_++) {
				Class298_Sub16 class298_sub16 = (Class298_Sub16) class298s[i_82_];
				ls[i_82_] = class298_sub16.linkedKey * 7051297995265073167L;
				((Class_xa_Sub1) this).aClass298Array8478[i_82_] = class298_sub16;
				class298_sub16.method2914(((Class_xa_Sub1) this).anInt8454);
			}
			Class365_Sub1_Sub3_Sub1.method4507(ls, (((Class_xa_Sub1) this).aClass298Array8478), (byte) -43);
			if (((Class_xa_Sub1) this).aClass169_8452 != null)
				((Class_xa_Sub1) this).aClass169_8452.method1799();
		} else
			((Class_xa_Sub1) this).aClass169_8452 = null;
		if ((((Class_xa_Sub1) this).anInt8463 & 0x2) == 0) {
			((Class_xa_Sub1) this).anIntArrayArrayArray8458 = null;
			((Class_xa_Sub1) this).anIntArrayArrayArray8462 = null;
			((Class_xa_Sub1) this).anIntArrayArrayArray8483 = null;
		}
		((Class_xa_Sub1) this).anIntArrayArrayArray8465 = null;
		((Class_xa_Sub1) this).anIntArrayArrayArray8461 = null;
		((Class_xa_Sub1) this).anIntArrayArrayArray8460 = null;
		((Class_xa_Sub1) this).aClass298_Sub16ArrayArrayArray8459 = null;
		((Class_xa_Sub1) this).aByteArrayArray8475 = null;
		((Class_xa_Sub1) this).aClass440_8479 = null;
		((Class_xa_Sub1) this).aFloatArrayArray8466 = null;
		((Class_xa_Sub1) this).aFloatArrayArray8477 = null;
		((Class_xa_Sub1) this).aFloatArrayArray8476 = null;
	}

	public boolean method6355(Class_na class_na, int i, int i_83_, int i_84_, int i_85_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass169_8452 == null || class_na == null)
			return false;
		int i_86_ = (i - (i_83_ * ((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).anInt8299 >> 8) >> (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313));
		int i_87_ = (i_84_ - (i_83_ * (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8317) >> 8) >> (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313));
		return ((Class_xa_Sub1) this).aClass169_8452.method1807(class_na, i_86_, i_87_);
	}

	public void method6335(int i, int i_88_, int[] is, int[] is_89_, int[] is_90_, int[] is_91_, int[] is_92_, int[] is_93_, int[] is_94_, int[] is_95_, Class78 class78, boolean bool) {
		Interface_ma interface_ma = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface_ma5299;
		if (is_91_ != null && ((Class_xa_Sub1) this).anIntArrayArrayArray8465 == null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8465 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		if (is_89_ != null && ((Class_xa_Sub1) this).anIntArrayArrayArray8460 == null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8460 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		((Class_xa_Sub1) this).anIntArrayArrayArray8462[i][i_88_] = is;
		((Class_xa_Sub1) this).anIntArrayArrayArray8458[i][i_88_] = is_90_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8483[i][i_88_] = is_92_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8461[i][i_88_] = is_93_;
		if (((Class_xa_Sub1) this).anIntArrayArrayArray8465 != null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8465[i][i_88_] = is_91_;
		if (((Class_xa_Sub1) this).anIntArrayArrayArray8460 != null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8460[i][i_88_] = is_89_;
		Class298_Sub16[] class298_sub16s = (((Class_xa_Sub1) this).aClass298_Sub16ArrayArrayArray8459[i][i_88_] = new Class298_Sub16[is_92_.length]);
		for (int i_96_ = 0; i_96_ < is_92_.length; i_96_++) {
			int i_97_ = is_94_[i_96_];
			int i_98_ = is_95_[i_96_];
			if ((((Class_xa_Sub1) this).anInt8482 & 0x20) != 0 && i_97_ != -1 && interface_ma.method174(i_97_, 1147162095).aBoolean524) {
				i_98_ = 128;
				i_97_ = -1;
			}
			long l = ((long) (class78.anInt727 * -1475891183) << 48 | (long) (class78.anInt725 * 1996750669) << 42 | (long) (class78.anInt726 * -1212608691) << 28 | (long) (i_98_ << 14) | (long) i_97_);
			Linkable class298;
			for (class298 = ((Class_xa_Sub1) this).aClass440_8479.method5852(l); class298 != null; class298 = ((Class_xa_Sub1) this).aClass440_8479.method5853(-1979022775)) {
				Class298_Sub16 class298_sub16 = (Class298_Sub16) class298;
				if (((Class298_Sub16) class298_sub16).anInt7284 == i_97_ && (((Class298_Sub16) class298_sub16).aFloat7294 == (float) i_98_) && ((Class298_Sub16) class298_sub16).aClass78_7286.method843(class78, (byte) 61))
					break;
			}
			if (class298 == null) {
				class298_sub16s[i_96_] = new Class298_Sub16(this, i_97_, i_98_, class78);
				((Class_xa_Sub1) this).aClass440_8479.method5858(class298_sub16s[i_96_], l);
			} else
				class298_sub16s[i_96_] = (Class298_Sub16) class298;
		}
		if (bool)
			((Class_xa_Sub1) this).aByteArrayArray8469[i][i_88_] |= 0x1;
		if (is_92_.length > ((Class_xa_Sub1) this).anInt8474)
			((Class_xa_Sub1) this).anInt8474 = is_92_.length;
		((Class_xa_Sub1) this).anInt8473 += is_92_.length;
	}

	public Class_na aa(int i, int i_99_, Class_na class_na) {
		if ((((Class_xa_Sub1) this).aByteArrayArray8469[i][i_99_] & 0x1) == 0)
			return null;
		int i_100_ = (anInt6288 * -1212653763 >> (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313));
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		Class_na_Sub2 class_na_sub2_101_;
		if (class_na_sub2 != null && class_na_sub2.method3489(i_100_, i_100_)) {
			class_na_sub2_101_ = class_na_sub2;
			class_na_sub2_101_.method3487();
		} else
			class_na_sub2_101_ = new Class_na_Sub2(((Class_xa_Sub1) this).aClass_ra_Sub3_8467, i_100_, i_100_);
		class_na_sub2_101_.method3486(0, 0, i_100_, i_100_);
		method6365(class_na_sub2_101_, i, i_99_);
		return class_na_sub2_101_;
	}

	Class_xa_Sub1(Class_ra_Sub3 class_ra_sub3, int i, int i_102_, int i_103_, int i_104_, int[][] is, int[][] is_105_, int i_106_) {
		super(i_103_, i_104_, i_106_, is);
		((Class_xa_Sub1) this).aFloat8447 = -3.4028235E38F;
		((Class_xa_Sub1) this).aClass458_8468 = new Class458();
		((Class_xa_Sub1) this).aClass_ra_Sub3_8467 = class_ra_sub3;
		((Class_xa_Sub1) this).anInt8450 = anInt6289 * -2137349879 - 2;
		((Class_xa_Sub1) this).anInt8451 = 1 << ((Class_xa_Sub1) this).anInt8450;
		((Class_xa_Sub1) this).anInt8463 = i;
		((Class_xa_Sub1) this).anInt8482 = i_102_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8460 = new int[i_103_][i_104_][];
		((Class_xa_Sub1) this).aClass298_Sub16ArrayArrayArray8459 = new Class298_Sub16[i_103_][i_104_][];
		((Class_xa_Sub1) this).anIntArrayArrayArray8462 = new int[i_103_][i_104_][];
		((Class_xa_Sub1) this).anIntArrayArrayArray8458 = new int[i_103_][i_104_][];
		((Class_xa_Sub1) this).anIntArrayArrayArray8483 = new int[i_103_][i_104_][];
		((Class_xa_Sub1) this).anIntArrayArrayArray8461 = new int[i_103_][i_104_][];
		((Class_xa_Sub1) this).aShortArrayArray8456 = new short[i_103_ * i_104_][];
		((Class_xa_Sub1) this).aByteArrayArray8469 = new byte[i_103_][i_104_];
		((Class_xa_Sub1) this).aByteArrayArray8475 = new byte[i_103_ + 1][i_104_ + 1];
		((Class_xa_Sub1) this).aFloatArrayArray8476 = (new float[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
		((Class_xa_Sub1) this).aFloatArrayArray8477 = (new float[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
		((Class_xa_Sub1) this).aFloatArrayArray8466 = (new float[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
		for (int i_107_ = 0; i_107_ <= anInt6286 * -1148794921; i_107_++) {
			for (int i_108_ = 0; i_108_ <= anInt6287 * -506105871; i_108_++) {
				int i_109_ = anIntArrayArray6290[i_108_][i_107_];
				if ((float) i_109_ < ((Class_xa_Sub1) this).aFloat8457)
					((Class_xa_Sub1) this).aFloat8457 = (float) i_109_;
				if ((float) i_109_ > ((Class_xa_Sub1) this).aFloat8447)
					((Class_xa_Sub1) this).aFloat8447 = (float) i_109_;
				if (i_108_ > 0 && i_107_ > 0 && i_108_ < anInt6287 * -506105871 && i_107_ < anInt6286 * -1148794921) {
					int i_110_ = (is_105_[i_108_ + 1][i_107_] - is_105_[i_108_ - 1][i_107_]);
					int i_111_ = (is_105_[i_108_][i_107_ + 1] - is_105_[i_108_][i_107_ - 1]);
					float f = (float) (1.0 / Math.sqrt((double) (i_110_ * i_110_ + 4 * i_106_ * i_106_ + i_111_ * i_111_)));
					((Class_xa_Sub1) this).aFloatArrayArray8476[i_108_][i_107_] = (float) i_110_ * f;
					((Class_xa_Sub1) this).aFloatArrayArray8477[i_108_][i_107_] = (float) (-i_106_ * 2) * f;
					((Class_xa_Sub1) this).aFloatArrayArray8466[i_108_][i_107_] = (float) i_111_ * f;
				}
			}
		}
		((Class_xa_Sub1) this).aFloat8457--;
		((Class_xa_Sub1) this).aFloat8447++;
		((Class_xa_Sub1) this).aClass440_8479 = new Class440(128);
		if ((((Class_xa_Sub1) this).anInt8482 & 0x10) != 0)
			((Class_xa_Sub1) this).aClass169_8452 = new Class169(((Class_xa_Sub1) this).aClass_ra_Sub3_8467, this);
	}

	public void method6346(int i, int i_112_, int[] is, int[] is_113_, int[] is_114_, int[] is_115_, int[] is_116_, int[] is_117_, int[] is_118_, int[] is_119_, Class78 class78, boolean bool) {
		Interface_ma interface_ma = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface_ma5299;
		if (is_115_ != null && ((Class_xa_Sub1) this).anIntArrayArrayArray8465 == null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8465 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		if (is_113_ != null && ((Class_xa_Sub1) this).anIntArrayArrayArray8460 == null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8460 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		((Class_xa_Sub1) this).anIntArrayArrayArray8462[i][i_112_] = is;
		((Class_xa_Sub1) this).anIntArrayArrayArray8458[i][i_112_] = is_114_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8483[i][i_112_] = is_116_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8461[i][i_112_] = is_117_;
		if (((Class_xa_Sub1) this).anIntArrayArrayArray8465 != null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8465[i][i_112_] = is_115_;
		if (((Class_xa_Sub1) this).anIntArrayArrayArray8460 != null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8460[i][i_112_] = is_113_;
		Class298_Sub16[] class298_sub16s = (((Class_xa_Sub1) this).aClass298_Sub16ArrayArrayArray8459[i][i_112_] = new Class298_Sub16[is_116_.length]);
		for (int i_120_ = 0; i_120_ < is_116_.length; i_120_++) {
			int i_121_ = is_118_[i_120_];
			int i_122_ = is_119_[i_120_];
			if ((((Class_xa_Sub1) this).anInt8482 & 0x20) != 0 && i_121_ != -1 && interface_ma.method174(i_121_, 469546768).aBoolean524) {
				i_122_ = 128;
				i_121_ = -1;
			}
			long l = ((long) (class78.anInt727 * -1475891183) << 48 | (long) (class78.anInt725 * 1996750669) << 42 | (long) (class78.anInt726 * -1212608691) << 28 | (long) (i_122_ << 14) | (long) i_121_);
			Linkable class298;
			for (class298 = ((Class_xa_Sub1) this).aClass440_8479.method5852(l); class298 != null; class298 = ((Class_xa_Sub1) this).aClass440_8479.method5853(-1981494486)) {
				Class298_Sub16 class298_sub16 = (Class298_Sub16) class298;
				if (((Class298_Sub16) class298_sub16).anInt7284 == i_121_ && (((Class298_Sub16) class298_sub16).aFloat7294 == (float) i_122_) && ((Class298_Sub16) class298_sub16).aClass78_7286.method843(class78, (byte) -65))
					break;
			}
			if (class298 == null) {
				class298_sub16s[i_120_] = new Class298_Sub16(this, i_121_, i_122_, class78);
				((Class_xa_Sub1) this).aClass440_8479.method5858(class298_sub16s[i_120_], l);
			} else
				class298_sub16s[i_120_] = (Class298_Sub16) class298;
		}
		if (bool)
			((Class_xa_Sub1) this).aByteArrayArray8469[i][i_112_] |= 0x1;
		if (is_116_.length > ((Class_xa_Sub1) this).anInt8474)
			((Class_xa_Sub1) this).anInt8474 = is_116_.length;
		((Class_xa_Sub1) this).anInt8473 += is_116_.length;
	}

	public void method6339(int i, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, boolean[][] bools) {
		if (((Class_xa_Sub1) this).anInt8473 > 0) {
			Interface7_Impl2 interface7_impl2 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5312(((Class_xa_Sub1) this).anInt8455);
			int i_129_ = 0;
			int i_130_ = 32767;
			int i_131_ = -32768;
			ByteBuffer bytebuffer = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aByteBuffer8216;
			bytebuffer.clear();
			for (int i_132_ = i_126_; i_132_ < i_128_; i_132_++) {
				int i_133_ = i_132_ * (anInt6287 * -506105871) + i_125_;
				for (int i_134_ = i_125_; i_134_ < i_127_; i_134_++) {
					if (bools[i_134_ - i_125_][i_132_ - i_126_]) {
						short[] is = (((Class_xa_Sub1) this).aShortArrayArray8456[i_133_]);
						if (is != null) {
							for (int i_135_ = 0; i_135_ < is.length; i_135_++) {
								int i_136_ = is[i_135_] & 0xffff;
								if (i_136_ > i_131_)
									i_131_ = i_136_;
								if (i_136_ < i_130_)
									i_130_ = i_136_;
								bytebuffer.putShort((short) i_136_);
								i_129_++;
							}
						}
					}
					i_133_++;
				}
			}
			interface7_impl2.method63(0, bytebuffer.position(), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aLong8217));
			if (i_129_ > 0) {
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5393();
				Class137 class137 = (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass137_8316);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(0, ((Class_xa_Sub1) this).anInterface7_Impl1_8470);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(1, ((Class_xa_Sub1) this).anInterface7_Impl1_8449);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5455(((Class_xa_Sub1) this).aClass153_8472);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5384(interface7_impl2);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5043(Matrix3f.aClass222_2504);
				float f = (float) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method4992((short) 2045).method545();
				float f_137_ = (float) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method4992((short) -2467).method552();
				Matrix3f class222 = new Matrix3f();
				Matrix3f class222_138_ = new Matrix3f();
				class222.method2057(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class222_138_.method2065((float) i_124_ / (256.0F * (float) (anInt6288 * -1212653763)), (float) -i_124_ / (256.0F * (float) (anInt6288 * -1212653763)), 1.0F / (((Class_xa_Sub1) this).aFloat8447 - ((Class_xa_Sub1) this).aFloat8457));
				class222_138_.method2064((float) i - (float) (i_125_ * i_124_) / 256.0F, (float) i_123_ + (float) (i_128_ * i_124_) / 256.0F, (-((Class_xa_Sub1) this).aFloat8457 / (((Class_xa_Sub1) this).aFloat8447 - ((Class_xa_Sub1) this).aFloat8457)));
				class222_138_.method2061(2.0F / f, 2.0F / f_137_, 1.0F);
				class222_138_.method2064(-1.0F, -1.0F, 0.0F);
				((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aClass222_8235.method2068(class222, class222_138_);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236.method2145(((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass222_8235);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5182(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236);
				class137.method1506(Matrix4f.aClass233_2595);
				class137.aClass232_1525.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1522.method2007(0.0F, 0.0F, 0.0F);
				class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1524.method2007(0.0F, 0.0F, 0.0F);
				class137.anInterface9_Impl2_1517 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface9_Impl2_8310);
				class137.aClass233_1519.method2172();
				class137.anInt1532 = i_130_;
				class137.anInt1533 = i_131_ - i_130_ + 1;
				class137.anInt1534 = 0;
				class137.anInt1514 = i_129_ / 3;
				class137.method1514(false);
			}
		}
	}

	public void method6336(int i, int i_139_, int[] is, int[] is_140_, int[] is_141_, int[] is_142_, int[] is_143_, int[] is_144_, int[] is_145_, int[] is_146_, int[] is_147_, int[] is_148_, int[] is_149_, Class78 class78, boolean bool) {
		int i_150_ = is_146_.length;
		int[] is_151_ = new int[i_150_ * 3];
		int[] is_152_ = new int[i_150_ * 3];
		int[] is_153_ = new int[i_150_ * 3];
		int[] is_154_ = new int[i_150_ * 3];
		int[] is_155_ = new int[i_150_ * 3];
		int[] is_156_ = new int[i_150_ * 3];
		int[] is_157_ = is_140_ != null ? new int[i_150_ * 3] : null;
		int[] is_158_ = is_142_ != null ? new int[i_150_ * 3] : null;
		int i_159_ = 0;
		for (int i_160_ = 0; i_160_ < i_150_; i_160_++) {
			int i_161_ = is_143_[i_160_];
			int i_162_ = is_144_[i_160_];
			int i_163_ = is_145_[i_160_];
			is_151_[i_159_] = is[i_161_];
			is_152_[i_159_] = is_141_[i_161_];
			is_153_[i_159_] = is_146_[i_160_];
			is_155_[i_159_] = is_148_[i_160_];
			is_156_[i_159_] = is_149_[i_160_];
			is_154_[i_159_] = is_147_ != null ? is_147_[i_160_] : is_146_[i_160_];
			if (is_140_ != null)
				is_157_[i_159_] = is_140_[i_161_];
			if (is_142_ != null)
				is_158_[i_159_] = is_142_[i_161_];
			i_159_++;
			is_151_[i_159_] = is[i_162_];
			is_152_[i_159_] = is_141_[i_162_];
			is_153_[i_159_] = is_146_[i_160_];
			is_155_[i_159_] = is_148_[i_160_];
			is_156_[i_159_] = is_149_[i_160_];
			is_154_[i_159_] = is_147_ != null ? is_147_[i_160_] : is_146_[i_160_];
			if (is_140_ != null)
				is_157_[i_159_] = is_140_[i_162_];
			if (is_142_ != null)
				is_158_[i_159_] = is_142_[i_162_];
			i_159_++;
			is_151_[i_159_] = is[i_163_];
			is_152_[i_159_] = is_141_[i_163_];
			is_153_[i_159_] = is_146_[i_160_];
			is_155_[i_159_] = is_148_[i_160_];
			is_156_[i_159_] = is_149_[i_160_];
			is_154_[i_159_] = is_147_ != null ? is_147_[i_160_] : is_146_[i_160_];
			if (is_140_ != null)
				is_157_[i_159_] = is_140_[i_163_];
			if (is_142_ != null)
				is_158_[i_159_] = is_142_[i_163_];
			i_159_++;
		}
		method6335(i, i_139_, is_151_, is_157_, is_152_, is_158_, is_153_, is_154_, is_155_, is_156_, class78, bool);
	}

	void method6365(Class_na_Sub2 class_na_sub2, int i, int i_164_) {
		int[] is = ((Class_xa_Sub1) this).anIntArrayArrayArray8462[i][i_164_];
		int[] is_165_ = ((Class_xa_Sub1) this).anIntArrayArrayArray8458[i][i_164_];
		int i_166_ = is.length;
		if (anIntArray8480.length < i_166_) {
			anIntArray8480 = new int[i_166_];
			anIntArray8481 = new int[i_166_];
		}
		for (int i_167_ = 0; i_167_ < i_166_; i_167_++) {
			anIntArray8480[i_167_] = is[i_167_] >> (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313);
			anIntArray8481[i_167_] = is_165_[i_167_] >> (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).anInt8313);
		}
		int i_168_ = 0;
		while (i_168_ < i_166_) {
			int i_169_ = anIntArray8480[i_168_];
			int i_170_ = anIntArray8481[i_168_++];
			int i_171_ = anIntArray8480[i_168_];
			int i_172_ = anIntArray8481[i_168_++];
			int i_173_ = anIntArray8480[i_168_];
			int i_174_ = anIntArray8481[i_168_++];
			if (((i_169_ - i_171_) * (i_172_ - i_174_) - (i_172_ - i_170_) * (i_173_ - i_171_)) > 0)
				class_na_sub2.method3490(i_170_, i_172_, i_174_, i_169_, i_171_, i_173_);
		}
	}

	public boolean method6353(Class_na class_na, int i, int i_175_, int i_176_, int i_177_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass169_8452 == null || class_na == null)
			return false;
		int i_178_ = (i - (i_175_ * ((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).anInt8299 >> 8) >> (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313));
		int i_179_ = (i_176_ - (i_175_ * (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8317) >> 8) >> (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313));
		return ((Class_xa_Sub1) this).aClass169_8452.method1807(class_na, i_178_, i_179_);
	}

	public void UA(Class_na class_na, int i, int i_180_, int i_181_, int i_182_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass169_8452 != null && class_na != null) {
			int i_183_ = (i - (i_180_ * (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8299) >> 8) >> ((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313);
			int i_184_ = (i_181_ - (i_180_ * (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).anInt8317) >> 8) >> ((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313);
			((Class_xa_Sub1) this).aClass169_8452.method1805(class_na, i_183_, i_184_);
		}
	}

	public void NA(Class_na class_na, int i, int i_185_, int i_186_, int i_187_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass169_8452 != null && class_na != null) {
			int i_188_ = (i - (i_185_ * (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8299) >> 8) >> ((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313);
			int i_189_ = (i_186_ - (i_185_ * (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).anInt8317) >> 8) >> ((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313);
			((Class_xa_Sub1) this).aClass169_8452.method1801(class_na, i_188_, i_189_);
		}
	}

	public void method6345(int i, int i_190_, int[] is, int[] is_191_, int[] is_192_, int[] is_193_, int[] is_194_, int[] is_195_, int[] is_196_, int[] is_197_, Class78 class78, boolean bool) {
		Interface_ma interface_ma = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface_ma5299;
		if (is_193_ != null && ((Class_xa_Sub1) this).anIntArrayArrayArray8465 == null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8465 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		if (is_191_ != null && ((Class_xa_Sub1) this).anIntArrayArrayArray8460 == null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8460 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		((Class_xa_Sub1) this).anIntArrayArrayArray8462[i][i_190_] = is;
		((Class_xa_Sub1) this).anIntArrayArrayArray8458[i][i_190_] = is_192_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8483[i][i_190_] = is_194_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8461[i][i_190_] = is_195_;
		if (((Class_xa_Sub1) this).anIntArrayArrayArray8465 != null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8465[i][i_190_] = is_193_;
		if (((Class_xa_Sub1) this).anIntArrayArrayArray8460 != null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8460[i][i_190_] = is_191_;
		Class298_Sub16[] class298_sub16s = (((Class_xa_Sub1) this).aClass298_Sub16ArrayArrayArray8459[i][i_190_] = new Class298_Sub16[is_194_.length]);
		for (int i_198_ = 0; i_198_ < is_194_.length; i_198_++) {
			int i_199_ = is_196_[i_198_];
			int i_200_ = is_197_[i_198_];
			if ((((Class_xa_Sub1) this).anInt8482 & 0x20) != 0 && i_199_ != -1 && interface_ma.method174(i_199_, 645709692).aBoolean524) {
				i_200_ = 128;
				i_199_ = -1;
			}
			long l = ((long) (class78.anInt727 * -1475891183) << 48 | (long) (class78.anInt725 * 1996750669) << 42 | (long) (class78.anInt726 * -1212608691) << 28 | (long) (i_200_ << 14) | (long) i_199_);
			Linkable class298;
			for (class298 = ((Class_xa_Sub1) this).aClass440_8479.method5852(l); class298 != null; class298 = ((Class_xa_Sub1) this).aClass440_8479.method5853(-2025134225)) {
				Class298_Sub16 class298_sub16 = (Class298_Sub16) class298;
				if (((Class298_Sub16) class298_sub16).anInt7284 == i_199_ && (((Class298_Sub16) class298_sub16).aFloat7294 == (float) i_200_) && ((Class298_Sub16) class298_sub16).aClass78_7286.method843(class78, (byte) -112))
					break;
			}
			if (class298 == null) {
				class298_sub16s[i_198_] = new Class298_Sub16(this, i_199_, i_200_, class78);
				((Class_xa_Sub1) this).aClass440_8479.method5858(class298_sub16s[i_198_], l);
			} else
				class298_sub16s[i_198_] = (Class298_Sub16) class298;
		}
		if (bool)
			((Class_xa_Sub1) this).aByteArrayArray8469[i][i_190_] |= 0x1;
		if (is_194_.length > ((Class_xa_Sub1) this).anInt8474)
			((Class_xa_Sub1) this).anInt8474 = is_194_.length;
		((Class_xa_Sub1) this).anInt8473 += is_194_.length;
	}

	static {
		anIntArray8471 = new int[1];
	}

	public void method6356(int i, int i_201_, int[] is, int[] is_202_, int[] is_203_, int[] is_204_, int[] is_205_, int[] is_206_, int[] is_207_, int[] is_208_, int[] is_209_, int[] is_210_, int[] is_211_, Class78 class78, boolean bool) {
		int i_212_ = is_208_.length;
		int[] is_213_ = new int[i_212_ * 3];
		int[] is_214_ = new int[i_212_ * 3];
		int[] is_215_ = new int[i_212_ * 3];
		int[] is_216_ = new int[i_212_ * 3];
		int[] is_217_ = new int[i_212_ * 3];
		int[] is_218_ = new int[i_212_ * 3];
		int[] is_219_ = is_202_ != null ? new int[i_212_ * 3] : null;
		int[] is_220_ = is_204_ != null ? new int[i_212_ * 3] : null;
		int i_221_ = 0;
		for (int i_222_ = 0; i_222_ < i_212_; i_222_++) {
			int i_223_ = is_205_[i_222_];
			int i_224_ = is_206_[i_222_];
			int i_225_ = is_207_[i_222_];
			is_213_[i_221_] = is[i_223_];
			is_214_[i_221_] = is_203_[i_223_];
			is_215_[i_221_] = is_208_[i_222_];
			is_217_[i_221_] = is_210_[i_222_];
			is_218_[i_221_] = is_211_[i_222_];
			is_216_[i_221_] = is_209_ != null ? is_209_[i_222_] : is_208_[i_222_];
			if (is_202_ != null)
				is_219_[i_221_] = is_202_[i_223_];
			if (is_204_ != null)
				is_220_[i_221_] = is_204_[i_223_];
			i_221_++;
			is_213_[i_221_] = is[i_224_];
			is_214_[i_221_] = is_203_[i_224_];
			is_215_[i_221_] = is_208_[i_222_];
			is_217_[i_221_] = is_210_[i_222_];
			is_218_[i_221_] = is_211_[i_222_];
			is_216_[i_221_] = is_209_ != null ? is_209_[i_222_] : is_208_[i_222_];
			if (is_202_ != null)
				is_219_[i_221_] = is_202_[i_224_];
			if (is_204_ != null)
				is_220_[i_221_] = is_204_[i_224_];
			i_221_++;
			is_213_[i_221_] = is[i_225_];
			is_214_[i_221_] = is_203_[i_225_];
			is_215_[i_221_] = is_208_[i_222_];
			is_217_[i_221_] = is_210_[i_222_];
			is_218_[i_221_] = is_211_[i_222_];
			is_216_[i_221_] = is_209_ != null ? is_209_[i_222_] : is_208_[i_222_];
			if (is_202_ != null)
				is_219_[i_221_] = is_202_[i_225_];
			if (is_204_ != null)
				is_220_[i_221_] = is_204_[i_225_];
			i_221_++;
		}
		method6335(i, i_201_, is_213_, is_219_, is_214_, is_220_, is_215_, is_216_, is_217_, is_218_, class78, bool);
	}

	public void method6343(int i, int i_226_, int[] is, int[] is_227_, int[] is_228_, int[] is_229_, int[] is_230_, int[] is_231_, int[] is_232_, int[] is_233_, int[] is_234_, int[] is_235_, int[] is_236_, Class78 class78, boolean bool) {
		int i_237_ = is_233_.length;
		int[] is_238_ = new int[i_237_ * 3];
		int[] is_239_ = new int[i_237_ * 3];
		int[] is_240_ = new int[i_237_ * 3];
		int[] is_241_ = new int[i_237_ * 3];
		int[] is_242_ = new int[i_237_ * 3];
		int[] is_243_ = new int[i_237_ * 3];
		int[] is_244_ = is_227_ != null ? new int[i_237_ * 3] : null;
		int[] is_245_ = is_229_ != null ? new int[i_237_ * 3] : null;
		int i_246_ = 0;
		for (int i_247_ = 0; i_247_ < i_237_; i_247_++) {
			int i_248_ = is_230_[i_247_];
			int i_249_ = is_231_[i_247_];
			int i_250_ = is_232_[i_247_];
			is_238_[i_246_] = is[i_248_];
			is_239_[i_246_] = is_228_[i_248_];
			is_240_[i_246_] = is_233_[i_247_];
			is_242_[i_246_] = is_235_[i_247_];
			is_243_[i_246_] = is_236_[i_247_];
			is_241_[i_246_] = is_234_ != null ? is_234_[i_247_] : is_233_[i_247_];
			if (is_227_ != null)
				is_244_[i_246_] = is_227_[i_248_];
			if (is_229_ != null)
				is_245_[i_246_] = is_229_[i_248_];
			i_246_++;
			is_238_[i_246_] = is[i_249_];
			is_239_[i_246_] = is_228_[i_249_];
			is_240_[i_246_] = is_233_[i_247_];
			is_242_[i_246_] = is_235_[i_247_];
			is_243_[i_246_] = is_236_[i_247_];
			is_241_[i_246_] = is_234_ != null ? is_234_[i_247_] : is_233_[i_247_];
			if (is_227_ != null)
				is_244_[i_246_] = is_227_[i_249_];
			if (is_229_ != null)
				is_245_[i_246_] = is_229_[i_249_];
			i_246_++;
			is_238_[i_246_] = is[i_250_];
			is_239_[i_246_] = is_228_[i_250_];
			is_240_[i_246_] = is_233_[i_247_];
			is_242_[i_246_] = is_235_[i_247_];
			is_243_[i_246_] = is_236_[i_247_];
			is_241_[i_246_] = is_234_ != null ? is_234_[i_247_] : is_233_[i_247_];
			if (is_227_ != null)
				is_244_[i_246_] = is_227_[i_250_];
			if (is_229_ != null)
				is_245_[i_246_] = is_229_[i_250_];
			i_246_++;
		}
		method6335(i, i_226_, is_238_, is_244_, is_239_, is_245_, is_240_, is_241_, is_242_, is_243_, class78, bool);
	}

	public void method6337(int i, int i_251_, int[] is, int[] is_252_, int[] is_253_, int[] is_254_, int[] is_255_, int[] is_256_, int[] is_257_, int[] is_258_, int[] is_259_, int[] is_260_, int[] is_261_, Class78 class78, boolean bool) {
		int i_262_ = is_258_.length;
		int[] is_263_ = new int[i_262_ * 3];
		int[] is_264_ = new int[i_262_ * 3];
		int[] is_265_ = new int[i_262_ * 3];
		int[] is_266_ = new int[i_262_ * 3];
		int[] is_267_ = new int[i_262_ * 3];
		int[] is_268_ = new int[i_262_ * 3];
		int[] is_269_ = is_252_ != null ? new int[i_262_ * 3] : null;
		int[] is_270_ = is_254_ != null ? new int[i_262_ * 3] : null;
		int i_271_ = 0;
		for (int i_272_ = 0; i_272_ < i_262_; i_272_++) {
			int i_273_ = is_255_[i_272_];
			int i_274_ = is_256_[i_272_];
			int i_275_ = is_257_[i_272_];
			is_263_[i_271_] = is[i_273_];
			is_264_[i_271_] = is_253_[i_273_];
			is_265_[i_271_] = is_258_[i_272_];
			is_267_[i_271_] = is_260_[i_272_];
			is_268_[i_271_] = is_261_[i_272_];
			is_266_[i_271_] = is_259_ != null ? is_259_[i_272_] : is_258_[i_272_];
			if (is_252_ != null)
				is_269_[i_271_] = is_252_[i_273_];
			if (is_254_ != null)
				is_270_[i_271_] = is_254_[i_273_];
			i_271_++;
			is_263_[i_271_] = is[i_274_];
			is_264_[i_271_] = is_253_[i_274_];
			is_265_[i_271_] = is_258_[i_272_];
			is_267_[i_271_] = is_260_[i_272_];
			is_268_[i_271_] = is_261_[i_272_];
			is_266_[i_271_] = is_259_ != null ? is_259_[i_272_] : is_258_[i_272_];
			if (is_252_ != null)
				is_269_[i_271_] = is_252_[i_274_];
			if (is_254_ != null)
				is_270_[i_271_] = is_254_[i_274_];
			i_271_++;
			is_263_[i_271_] = is[i_275_];
			is_264_[i_271_] = is_253_[i_275_];
			is_265_[i_271_] = is_258_[i_272_];
			is_267_[i_271_] = is_260_[i_272_];
			is_268_[i_271_] = is_261_[i_272_];
			is_266_[i_271_] = is_259_ != null ? is_259_[i_272_] : is_258_[i_272_];
			if (is_252_ != null)
				is_269_[i_271_] = is_252_[i_275_];
			if (is_254_ != null)
				is_270_[i_271_] = is_254_[i_275_];
			i_271_++;
		}
		method6335(i, i_251_, is_263_, is_269_, is_264_, is_270_, is_265_, is_266_, is_267_, is_268_, class78, bool);
	}

	public Class_na ax(int i, int i_276_, Class_na class_na) {
		if ((((Class_xa_Sub1) this).aByteArrayArray8469[i][i_276_] & 0x1) == 0)
			return null;
		int i_277_ = (anInt6288 * -1212653763 >> (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313));
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		Class_na_Sub2 class_na_sub2_278_;
		if (class_na_sub2 != null && class_na_sub2.method3489(i_277_, i_277_)) {
			class_na_sub2_278_ = class_na_sub2;
			class_na_sub2_278_.method3487();
		} else
			class_na_sub2_278_ = new Class_na_Sub2(((Class_xa_Sub1) this).aClass_ra_Sub3_8467, i_277_, i_277_);
		class_na_sub2_278_.method3486(0, 0, i_277_, i_277_);
		method6365(class_na_sub2_278_, i, i_276_);
		return class_na_sub2_278_;
	}

	public Class_na w(int i, int i_279_, Class_na class_na) {
		if ((((Class_xa_Sub1) this).aByteArrayArray8469[i][i_279_] & 0x1) == 0)
			return null;
		int i_280_ = (anInt6288 * -1212653763 >> (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313));
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		Class_na_Sub2 class_na_sub2_281_;
		if (class_na_sub2 != null && class_na_sub2.method3489(i_280_, i_280_)) {
			class_na_sub2_281_ = class_na_sub2;
			class_na_sub2_281_.method3487();
		} else
			class_na_sub2_281_ = new Class_na_Sub2(((Class_xa_Sub1) this).aClass_ra_Sub3_8467, i_280_, i_280_);
		class_na_sub2_281_.method3486(0, 0, i_280_, i_280_);
		method6365(class_na_sub2_281_, i, i_279_);
		return class_na_sub2_281_;
	}

	public Class_na l(int i, int i_282_, Class_na class_na) {
		if ((((Class_xa_Sub1) this).aByteArrayArray8469[i][i_282_] & 0x1) == 0)
			return null;
		int i_283_ = (anInt6288 * -1212653763 >> (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313));
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		Class_na_Sub2 class_na_sub2_284_;
		if (class_na_sub2 != null && class_na_sub2.method3489(i_283_, i_283_)) {
			class_na_sub2_284_ = class_na_sub2;
			class_na_sub2_284_.method3487();
		} else
			class_na_sub2_284_ = new Class_na_Sub2(((Class_xa_Sub1) this).aClass_ra_Sub3_8467, i_283_, i_283_);
		class_na_sub2_284_.method3486(0, 0, i_283_, i_283_);
		method6365(class_na_sub2_284_, i, i_282_);
		return class_na_sub2_284_;
	}

	public void SA() {
		if (((Class_xa_Sub1) this).anInt8473 > 0) {
			byte[][] is = (new byte[anInt6287 * -506105871 + 1][anInt6286 * -1148794921 + 1]);
			for (int i = 1; i < anInt6287 * -506105871; i++) {
				for (int i_285_ = 1; i_285_ < anInt6286 * -1148794921; i_285_++)
					is[i][i_285_] = (byte) (((((Class_xa_Sub1) this).aByteArrayArray8475[i - 1][i_285_]) >> 2) + ((((Class_xa_Sub1) this).aByteArrayArray8475[i + 1][i_285_]) >> 3) + ((((Class_xa_Sub1) this).aByteArrayArray8475[i][i_285_ - 1]) >> 2) + ((((Class_xa_Sub1) this).aByteArrayArray8475[i][i_285_ + 1]) >> 3) + ((((Class_xa_Sub1) this).aByteArrayArray8475[i][i_285_]) >> 1));
			}
			Linkable[] class298s = new Linkable[((Class_xa_Sub1) this).aClass440_8479.method5855(1332224628)];
			((Class_xa_Sub1) this).aClass440_8479.method5854(class298s, 2094257346);
			for (int i = 0; i < class298s.length; i++)
				((Class298_Sub16) class298s[i]).method2910(((Class_xa_Sub1) this).anInt8473);
			int i = 20;
			if (((Class_xa_Sub1) this).anIntArrayArrayArray8465 != null)
				i += 4;
			if ((((Class_xa_Sub1) this).anInt8482 & 0x7) != 0)
				i += 12;
			jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = ((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aNativeHeap8221.f(((Class_xa_Sub1) this).anInt8473 * 4, false);
			jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer_286_ = ((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aNativeHeap8221.f(((Class_xa_Sub1) this).anInt8473 * i, false);
			Stream stream = new Stream(nativeheapbuffer_286_);
			Stream stream_287_ = new Stream(nativeheapbuffer);
			Class298_Sub16[] class298_sub16s = new Class298_Sub16[((Class_xa_Sub1) this).anInt8473];
			int i_288_ = Class422_Sub4.method5639((((Class_xa_Sub1) this).anInt8473 / 4), 2098856769);
			if (i_288_ < 1)
				i_288_ = 1;
			Class440 class440 = new Class440(i_288_);
			Class298_Sub16[] class298_sub16s_289_ = new Class298_Sub16[((Class_xa_Sub1) this).anInt8474];
			for (int i_290_ = 0; i_290_ < anInt6287 * -506105871; i_290_++) {
				for (int i_291_ = 0; i_291_ < anInt6286 * -1148794921; i_291_++) {
					if ((((Class_xa_Sub1) this).anIntArrayArrayArray8483[i_290_][i_291_]) != null) {
						Class298_Sub16[] class298_sub16s_292_ = (((Class_xa_Sub1) this).aClass298_Sub16ArrayArrayArray8459[i_290_][i_291_]);
						int[] is_293_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8462[i_290_][i_291_]);
						int[] is_294_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8458[i_290_][i_291_]);
						int[] is_295_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8461[i_290_][i_291_]);
						int[] is_296_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8483[i_290_][i_291_]);
						int[] is_297_ = ((((Class_xa_Sub1) this).anIntArrayArrayArray8460 != null) ? (((Class_xa_Sub1) this).anIntArrayArrayArray8460[i_290_][i_291_]) : null);
						int[] is_298_ = ((((Class_xa_Sub1) this).anIntArrayArrayArray8465 != null) ? (((Class_xa_Sub1) this).anIntArrayArrayArray8465[i_290_][i_291_]) : null);
						if (is_295_ == null)
							is_295_ = is_296_;
						float f = (((Class_xa_Sub1) this).aFloatArrayArray8476[i_290_][i_291_]);
						float f_299_ = (((Class_xa_Sub1) this).aFloatArrayArray8477[i_290_][i_291_]);
						float f_300_ = (((Class_xa_Sub1) this).aFloatArrayArray8466[i_290_][i_291_]);
						float f_301_ = (((Class_xa_Sub1) this).aFloatArrayArray8476[i_290_][i_291_ + 1]);
						float f_302_ = (((Class_xa_Sub1) this).aFloatArrayArray8477[i_290_][i_291_ + 1]);
						float f_303_ = (((Class_xa_Sub1) this).aFloatArrayArray8466[i_290_][i_291_ + 1]);
						float f_304_ = (((Class_xa_Sub1) this).aFloatArrayArray8476[i_290_ + 1][i_291_ + 1]);
						float f_305_ = (((Class_xa_Sub1) this).aFloatArrayArray8477[i_290_ + 1][i_291_ + 1]);
						float f_306_ = (((Class_xa_Sub1) this).aFloatArrayArray8466[i_290_ + 1][i_291_ + 1]);
						float f_307_ = (((Class_xa_Sub1) this).aFloatArrayArray8476[i_290_ + 1][i_291_]);
						float f_308_ = (((Class_xa_Sub1) this).aFloatArrayArray8477[i_290_ + 1][i_291_]);
						float f_309_ = (((Class_xa_Sub1) this).aFloatArrayArray8466[i_290_ + 1][i_291_]);
						int i_310_ = is[i_290_][i_291_] & 0xff;
						int i_311_ = is[i_290_][i_291_ + 1] & 0xff;
						int i_312_ = is[i_290_ + 1][i_291_ + 1] & 0xff;
						int i_313_ = is[i_290_ + 1][i_291_] & 0xff;
						int i_314_ = 0;
						while_112_: for (int i_315_ = 0; i_315_ < is_296_.length; i_315_++) {
							Class298_Sub16 class298_sub16 = class298_sub16s_292_[i_315_];
							for (int i_316_ = 0; i_316_ < i_314_; i_316_++) {
								if (class298_sub16s_289_[i_316_] == class298_sub16)
									continue while_112_;
							}
							class298_sub16s_289_[i_314_++] = class298_sub16;
						}
						short[] is_317_ = (((Class_xa_Sub1) this).aShortArrayArray8456[i_291_ * (anInt6287 * -506105871) + i_290_] = new short[is_296_.length]);
						for (int i_318_ = 0; i_318_ < is_296_.length; i_318_++) {
							int i_319_ = ((i_290_ << anInt6289 * -2137349879) + is_293_[i_318_]);
							int i_320_ = ((i_291_ << anInt6289 * -2137349879) + is_294_[i_318_]);
							int i_321_ = i_319_ >> ((Class_xa_Sub1) this).anInt8450;
							int i_322_ = i_320_ >> ((Class_xa_Sub1) this).anInt8450;
							int i_323_ = is_296_[i_318_];
							int i_324_ = is_295_[i_318_];
							int i_325_ = is_297_ != null ? is_297_[i_318_] : 0;
							long l = ((long) i_324_ << 48 | (long) i_323_ << 32 | (long) (i_321_ << 16) | (long) i_322_);
							int i_326_ = is_293_[i_318_];
							int i_327_ = is_294_[i_318_];
							int i_328_ = 74;
							int i_329_ = 0;
							float f_330_ = 1.0F;
							float f_331_;
							float f_332_;
							float f_333_;
							if (i_326_ == 0 && i_327_ == 0) {
								f_331_ = f;
								f_332_ = f_299_;
								f_333_ = f_300_;
								i_328_ -= i_310_;
							} else if (i_326_ == 0 && i_327_ == anInt6288 * -1212653763) {
								f_331_ = f_301_;
								f_332_ = f_302_;
								f_333_ = f_303_;
								i_328_ -= i_311_;
							} else if (i_326_ == anInt6288 * -1212653763 && i_327_ == anInt6288 * -1212653763) {
								f_331_ = f_304_;
								f_332_ = f_305_;
								f_333_ = f_306_;
								i_328_ -= i_312_;
							} else if (i_326_ == anInt6288 * -1212653763 && i_327_ == 0) {
								f_331_ = f_307_;
								f_332_ = f_308_;
								f_333_ = f_309_;
								i_328_ -= i_313_;
							} else {
								float f_334_ = ((float) i_326_ / (float) (anInt6288 * -1212653763));
								float f_335_ = ((float) i_327_ / (float) (anInt6288 * -1212653763));
								float f_336_ = f + (f_307_ - f) * f_334_;
								float f_337_ = f_299_ + (f_308_ - f_299_) * f_334_;
								float f_338_ = f_300_ + (f_309_ - f_300_) * f_334_;
								float f_339_ = f_301_ + (f_304_ - f_301_) * f_334_;
								float f_340_ = f_302_ + (f_305_ - f_302_) * f_334_;
								float f_341_ = f_303_ + (f_306_ - f_303_) * f_334_;
								f_331_ = f_336_ + (f_339_ - f_336_) * f_335_;
								f_332_ = f_337_ + (f_340_ - f_337_) * f_335_;
								f_333_ = f_338_ + (f_341_ - f_338_) * f_335_;
								int i_342_ = i_310_ + ((i_313_ - i_310_) * i_326_ >> anInt6289 * -2137349879);
								int i_343_ = i_311_ + ((i_312_ - i_311_) * i_326_ >> anInt6289 * -2137349879);
								i_328_ -= i_342_ + ((i_343_ - i_342_) * i_327_ >> anInt6289 * -2137349879);
							}
							if (i_323_ != -1) {
								int i_344_ = (i_323_ & 0x7f) * i_328_ >> 7;
								if (i_344_ < 2)
									i_344_ = 2;
								else if (i_344_ > 126)
									i_344_ = 126;
								i_329_ = (Class294.anIntArray3165[i_323_ & 0xff80 | i_344_]);
								if ((((Class_xa_Sub1) this).anInt8482 & 0x7) == 0) {
									f_330_ = ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[0]) * f_331_ + (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[1]) * f_332_ + (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[2]) * f_333_);
									f_330_ = ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8291) + (f_330_ * (f_330_ > 0.0F ? (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8364) : (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8293))));
								}
							}
							Linkable class298 = null;
							if ((i_319_ & ((Class_xa_Sub1) this).anInt8451 - 1) == 0 && ((i_320_ & ((Class_xa_Sub1) this).anInt8451 - 1) == 0))
								class298 = class440.method5852(l);
							int i_345_;
							if (class298 == null) {
								int i_346_;
								if (i_324_ != i_323_) {
									int i_347_ = (i_324_ & 0x7f) * i_328_ >> 7;
									if (i_347_ < 2)
										i_347_ = 2;
									else if (i_347_ > 126)
										i_347_ = 126;
									i_346_ = (Class294.anIntArray3165[i_324_ & 0xff80 | i_347_]);
									if ((((Class_xa_Sub1) this).anInt8482 & 0x7) == 0) {
										float f_348_ = ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[0]) * f_331_ + (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[1]) * f_332_ + ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[2]) * f_333_));
										f_348_ = ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8291) + (f_330_ * (f_330_ > 0.0F ? (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8364) : (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8293))));
										int i_349_ = i_346_ >> 16 & 0xff;
										int i_350_ = i_346_ >> 8 & 0xff;
										int i_351_ = i_346_ & 0xff;
										i_349_ *= f_348_;
										if (i_349_ < 0)
											i_349_ = 0;
										else if (i_349_ > 255)
											i_349_ = 255;
										i_350_ *= f_348_;
										if (i_350_ < 0)
											i_350_ = 0;
										else if (i_350_ > 255)
											i_350_ = 255;
										i_351_ *= f_348_;
										if (i_351_ < 0)
											i_351_ = 0;
										else if (i_351_ > 255)
											i_351_ = 255;
										i_346_ = (i_349_ << 16 | i_350_ << 8 | i_351_);
									}
								} else
									i_346_ = i_329_;
								if (Stream.r()) {
									stream.d((float) i_319_);
									stream.d((float) (method6340(i_319_, i_320_, -1533098299) + i_325_));
									stream.d((float) i_320_);
									stream.d((float) i_319_);
									stream.d((float) i_320_);
									if ((((Class_xa_Sub1) this).anIntArrayArrayArray8465) != null)
										stream.d(is_298_ != null ? (float) (is_298_[i_318_] - 1) : 0.0F);
									if ((((Class_xa_Sub1) this).anInt8482 & 0x7) != 0) {
										stream.d(f_331_);
										stream.d(f_332_);
										stream.d(f_333_);
									}
								} else {
									stream.u((float) i_319_);
									stream.u((float) (method6340(i_319_, i_320_, -1562205139) + i_325_));
									stream.u((float) i_320_);
									stream.u((float) i_319_);
									stream.u((float) i_320_);
									if ((((Class_xa_Sub1) this).anIntArrayArrayArray8465) != null)
										stream.u(is_298_ != null ? (float) (is_298_[i_318_] - 1) : 0.0F);
									if ((((Class_xa_Sub1) this).anInt8482 & 0x7) != 0) {
										stream.u(f_331_);
										stream.u(f_332_);
										stream.u(f_333_);
									}
								}
								if ((((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).anInt8346) == 0)
									stream_287_.i(~0xffffff | i_346_);
								else
									stream_287_.k(~0xffffff | i_346_);
								i_345_ = ((Class_xa_Sub1) this).anInt8454++;
								is_317_[i_318_] = (short) i_345_;
								if (i_323_ != -1)
									class298_sub16s[i_345_] = class298_sub16s_292_[i_318_];
								class440.method5858(new Class298_Sub20(is_317_[i_318_]), l);
							} else {
								is_317_[i_318_] = ((Class298_Sub20) class298).aShort7314;
								i_345_ = is_317_[i_318_] & 0xffff;
								if (i_323_ != -1 && ((class298_sub16s_292_[i_318_].linkedKey * 7051297995265073167L) < (class298_sub16s[i_345_].linkedKey * 7051297995265073167L)))
									class298_sub16s[i_345_] = class298_sub16s_292_[i_318_];
							}
							for (int i_352_ = 0; i_352_ < i_314_; i_352_++)
								class298_sub16s_289_[i_352_].method2913(i_345_, i_329_, i_328_, f_330_);
							((Class_xa_Sub1) this).anInt8455++;
						}
					}
				}
			}
			for (int i_353_ = 0; i_353_ < ((Class_xa_Sub1) this).anInt8454; i_353_++) {
				Class298_Sub16 class298_sub16 = class298_sub16s[i_353_];
				if (class298_sub16 != null)
					class298_sub16.method2911(i_353_);
			}
			for (int i_354_ = 0; i_354_ < anInt6287 * -506105871; i_354_++) {
				for (int i_355_ = 0; i_355_ < anInt6286 * -1148794921; i_355_++) {
					short[] is_356_ = (((Class_xa_Sub1) this).aShortArrayArray8456[i_355_ * (anInt6287 * -506105871) + i_354_]);
					if (is_356_ != null) {
						int i_357_ = 0;
						int i_358_ = 0;
						while (i_358_ < is_356_.length) {
							int i_359_ = is_356_[i_358_++] & 0xffff;
							int i_360_ = is_356_[i_358_++] & 0xffff;
							int i_361_ = is_356_[i_358_++] & 0xffff;
							Class298_Sub16 class298_sub16 = class298_sub16s[i_359_];
							Class298_Sub16 class298_sub16_362_ = class298_sub16s[i_360_];
							Class298_Sub16 class298_sub16_363_ = class298_sub16s[i_361_];
							Class298_Sub16 class298_sub16_364_ = null;
							if (class298_sub16 != null) {
								class298_sub16.method2912(i_354_, i_355_, i_357_);
								class298_sub16_364_ = class298_sub16;
							}
							if (class298_sub16_362_ != null) {
								class298_sub16_362_.method2912(i_354_, i_355_, i_357_);
								if (class298_sub16_364_ == null || ((class298_sub16_362_.linkedKey * 7051297995265073167L) < (class298_sub16_364_.linkedKey * 7051297995265073167L)))
									class298_sub16_364_ = class298_sub16_362_;
							}
							if (class298_sub16_363_ != null) {
								class298_sub16_363_.method2912(i_354_, i_355_, i_357_);
								if (class298_sub16_364_ == null || ((class298_sub16_363_.linkedKey * 7051297995265073167L) < (class298_sub16_364_.linkedKey * 7051297995265073167L)))
									class298_sub16_364_ = class298_sub16_363_;
							}
							if (class298_sub16_364_ != null) {
								if (class298_sub16 != null)
									class298_sub16_364_.method2911(i_359_);
								if (class298_sub16_362_ != null)
									class298_sub16_364_.method2911(i_360_);
								if (class298_sub16_363_ != null)
									class298_sub16_364_.method2911(i_361_);
								class298_sub16_364_.method2912(i_354_, i_355_, i_357_);
							}
							i_357_++;
						}
					}
				}
			}
			stream.x();
			stream_287_.x();
			((Class_xa_Sub1) this).anInterface7_Impl1_8449 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5382(false);
			((Class_xa_Sub1) this).anInterface7_Impl1_8449.method71(((Class_xa_Sub1) this).anInt8454 * 4, 4, nativeheapbuffer);
			((Class_xa_Sub1) this).anInterface7_Impl1_8470 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5382(false);
			((Class_xa_Sub1) this).anInterface7_Impl1_8470.method71(((Class_xa_Sub1) this).anInt8454 * i, i, nativeheapbuffer_286_);
			if ((((Class_xa_Sub1) this).anInt8482 & 0x7) != 0) {
				if (((Class_xa_Sub1) this).anIntArrayArrayArray8465 != null)
					((Class_xa_Sub1) this).aClass153_8472 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1599, Class155.aClass155_1601, Class155.aClass155_1596 }), new Class181(Class155.aClass155_1597) }));
				else
					((Class_xa_Sub1) this).aClass153_8472 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1599, Class155.aClass155_1596 }), new Class181(Class155.aClass155_1597) }));
			} else if (((Class_xa_Sub1) this).anIntArrayArrayArray8465 != null)
				((Class_xa_Sub1) this).aClass153_8472 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1599, Class155.aClass155_1601 }), new Class181(Class155.aClass155_1597) }));
			else
				((Class_xa_Sub1) this).aClass153_8472 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5404(new Class181[] { new Class181(new Class155[] { Class155.aClass155_1610, Class155.aClass155_1599 }), new Class181(Class155.aClass155_1597) }));
			int i_365_ = 0;
			for (int i_366_ = 0; i_366_ < class298s.length; i_366_++) {
				Class298_Sub16 class298_sub16 = (Class298_Sub16) class298s[i_366_];
				if (((Class298_Sub16) class298_sub16).anInt7290 > 0)
					class298s[i_365_++] = class298_sub16;
			}
			((Class_xa_Sub1) this).aClass298Array8478 = new Linkable[i_365_];
			long[] ls = new long[i_365_];
			for (int i_367_ = 0; i_367_ < i_365_; i_367_++) {
				Class298_Sub16 class298_sub16 = (Class298_Sub16) class298s[i_367_];
				ls[i_367_] = class298_sub16.linkedKey * 7051297995265073167L;
				((Class_xa_Sub1) this).aClass298Array8478[i_367_] = class298_sub16;
				class298_sub16.method2914(((Class_xa_Sub1) this).anInt8454);
			}
			Class365_Sub1_Sub3_Sub1.method4507(ls, (((Class_xa_Sub1) this).aClass298Array8478), (byte) -13);
			if (((Class_xa_Sub1) this).aClass169_8452 != null)
				((Class_xa_Sub1) this).aClass169_8452.method1799();
		} else
			((Class_xa_Sub1) this).aClass169_8452 = null;
		if ((((Class_xa_Sub1) this).anInt8463 & 0x2) == 0) {
			((Class_xa_Sub1) this).anIntArrayArrayArray8458 = null;
			((Class_xa_Sub1) this).anIntArrayArrayArray8462 = null;
			((Class_xa_Sub1) this).anIntArrayArrayArray8483 = null;
		}
		((Class_xa_Sub1) this).anIntArrayArrayArray8465 = null;
		((Class_xa_Sub1) this).anIntArrayArrayArray8461 = null;
		((Class_xa_Sub1) this).anIntArrayArrayArray8460 = null;
		((Class_xa_Sub1) this).aClass298_Sub16ArrayArrayArray8459 = null;
		((Class_xa_Sub1) this).aByteArrayArray8475 = null;
		((Class_xa_Sub1) this).aClass440_8479 = null;
		((Class_xa_Sub1) this).aFloatArrayArray8466 = null;
		((Class_xa_Sub1) this).aFloatArrayArray8477 = null;
		((Class_xa_Sub1) this).aFloatArrayArray8476 = null;
	}

	public void method6338(int i, int i_368_, int i_369_, boolean[][] bools, boolean bool, int i_370_) {
		if (((Class_xa_Sub1) this).aClass298Array8478 != null) {
			int i_371_ = i_369_ + i_369_ + 1;
			i_371_ *= i_371_;
			if (anIntArray8471.length < i_371_)
				anIntArray8471 = new int[i_371_];
			int i_372_ = i - i_369_;
			int i_373_ = i_372_;
			if (i_372_ < 0)
				i_372_ = 0;
			int i_374_ = i_368_ - i_369_;
			int i_375_ = i_374_;
			if (i_374_ < 0)
				i_374_ = 0;
			int i_376_ = i + i_369_;
			if (i_376_ > anInt6287 * -506105871 - 1)
				i_376_ = anInt6287 * -506105871 - 1;
			int i_377_ = i_368_ + i_369_;
			if (i_377_ > anInt6286 * -1148794921 - 1)
				i_377_ = anInt6286 * -1148794921 - 1;
			anInt8453 = 0;
			for (int i_378_ = i_372_; i_378_ <= i_376_; i_378_++) {
				boolean[] bools_379_ = bools[i_378_ - i_373_];
				for (int i_380_ = i_374_; i_380_ <= i_377_; i_380_++) {
					if (bools_379_[i_380_ - i_375_])
						anIntArray8471[anInt8453++] = i_380_ * (anInt6287 * -506105871) + i_378_;
				}
			}
			ByteBuffer bytebuffer = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aByteBuffer8216;
			bytebuffer.clear();
			for (int i_381_ = 0; i_381_ < ((Class_xa_Sub1) this).aClass298Array8478.length; i_381_++) {
				Class298_Sub16 class298_sub16 = ((Class298_Sub16) ((Class_xa_Sub1) this).aClass298Array8478[i_381_]);
				class298_sub16.method2915(anIntArray8471, anInt8453);
			}
			int i_382_ = bytebuffer.position();
			Class137 class137 = (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aClass137_8316);
			if (i_382_ != 0) {
				Interface7_Impl2 interface7_impl2 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5312(i_382_ / 2);
				interface7_impl2.method63(0, i_382_, (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aLong8217));
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5393();
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(0, ((Class_xa_Sub1) this).anInterface7_Impl1_8470);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5384(interface7_impl2);
				class137.method1506(Matrix4f.aClass233_2595);
				if (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInt8233 > 0) {
					class137.aClass232_1525.method2135(0.0F, 0.0F, 1.0F, -(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8292));
					class137.aClass217_1522.method2007((float) ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInt8332) >> 16 & 0xff) / 255.0F, (float) ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInt8332) >> 8 & 0xff) / 255.0F, (float) ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInt8332) >> 0 & 0xff) / 255.0F);
					((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236.method2142(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8230);
					((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236.method2159();
					class137.aClass232_1525.method2138(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236);
					class137.aClass232_1525.method2139(1.0F / ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8336) - (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8292)));
				} else {
					class137.aClass232_1525.method2135(0.0F, 0.0F, 0.0F, 0.0F);
					class137.aClass217_1522.method2007(0.0F, 0.0F, 0.0F);
				}
				if ((((Class_xa_Sub1) this).anInt8482 & 0x37) == 0) {
					int i_383_ = 0;
					for (int i_384_ = 0; (i_384_ < ((Class_xa_Sub1) this).aClass298Array8478.length); i_384_++) {
						Class298_Sub16 class298_sub16 = (Class298_Sub16) (((Class_xa_Sub1) this).aClass298Array8478[i_384_]);
						if (((Class298_Sub16) class298_sub16).anInt7282 != 0) {
							if (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aBoolean8326) {
								((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5058(0, (((Class298_Sub16) class298_sub16).aClass78_7286));
								class137.aClass232_1523.method2135(0.0F, 1.0F, 0.0F, ((float) (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).anInt8328) + ((float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt727) * -1475891183) / 255.0F * (float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt725) * 1996750669))));
								class137.aClass232_1523.method2139(1.0F / (float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt725) * 1996750669));
								class137.aClass217_1524.method2007((float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 16 & 0xff) / 255.0F, (float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 8 & 0xff) / 255.0F, (float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 0 & 0xff) / 255.0F);
							} else {
								class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
								class137.aClass217_1524.method2007(0.0F, 0.0F, 0.0F);
							}
							boolean bool_385_ = false;
							if (((Class298_Sub16) class298_sub16).anInt7284 != -1) {
								class137.anInterface9_Impl2_1517 = (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass157_8351.method1698(((Class298_Sub16) class298_sub16).anInt7284));
								Class53 class53 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface_ma5299.method174((((Class298_Sub16) class298_sub16).anInt7284), 377396513));
								bool_385_ = !(Class298_Sub32_Sub31.method3339(class53.aByte529, -596124611));
							} else
								class137.anInterface9_Impl2_1517 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface9_Impl2_8310);
							((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(1, (((Class298_Sub16) class298_sub16).anInterface7_Impl1_7287));
							((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5455(((Class_xa_Sub1) this).aClass153_8472);
							class137.aClass233_1519.method2147(1.0F / (((Class298_Sub16) class298_sub16).aFloat7294), 1.0F / (((Class298_Sub16) class298_sub16).aFloat7294), 1.0F, 1.0F);
							class137.anInt1532 = ((Class298_Sub16) class298_sub16).anInt7291;
							class137.anInt1533 = (((Class298_Sub16) class298_sub16).anInt7292 - (((Class298_Sub16) class298_sub16).anInt7291) + 1);
							class137.anInt1534 = i_383_;
							class137.anInt1514 = (((Class298_Sub16) class298_sub16).anInt7282 / 3);
							class137.method1514(bool_385_);
							i_383_ += ((Class298_Sub16) class298_sub16).anInt7282;
						}
					}
				} else {
					class137.aClass217_1527.method2007((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[0]), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[1]), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[2]));
					class137.aClass217_1528.method2007((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8364 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8362)), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8364 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8289)), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8364 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8290)));
					class137.aClass217_1529.method2007((-(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8293) * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8362)), (-(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8293) * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8289)), (-(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8293) * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8290)));
					class137.aClass217_1515.method2007((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8291 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8362)), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8291 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8289)), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8291 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8290)));
					int i_386_ = 0;
					for (int i_387_ = 0; (i_387_ < ((Class_xa_Sub1) this).aClass298Array8478.length); i_387_++) {
						Class298_Sub16 class298_sub16 = (Class298_Sub16) (((Class_xa_Sub1) this).aClass298Array8478[i_387_]);
						if (((Class298_Sub16) class298_sub16).anInt7282 > 0) {
							if (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aBoolean8326) {
								((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5058(0, (((Class298_Sub16) class298_sub16).aClass78_7286));
								float f = 0.15F;
								class137.aClass232_1523.method2135(0.0F, 1.0F / ((float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt725) * 1996750669) * f), 0.0F, 256.0F / ((float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt725) * 1996750669) * f));
								class137.aClass217_1524.method2007((float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 16 & 0xff) / 255.0F, (float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 8 & 0xff) / 255.0F, (float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 0 & 0xff) / 255.0F);
							} else {
								class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
								class137.aClass217_1524.method2007(0.0F, 0.0F, 0.0F);
							}
							byte i_388_ = 11;
							if (((Class298_Sub16) class298_sub16).anInt7284 != -1) {
								Class53 class53 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface_ma5299.method174((((Class298_Sub16) class298_sub16).anInt7284), 515352996));
								i_388_ = class53.aByte529;
								class137.anInterface9_Impl2_1517 = (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass157_8351.method1698(((Class298_Sub16) class298_sub16).anInt7284));
								class137.method1509(class53);
							} else
								class137.anInterface9_Impl2_1517 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface9_Impl2_8310);
							((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(1, (((Class298_Sub16) class298_sub16).anInterface7_Impl1_7287));
							((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5455(((Class_xa_Sub1) this).aClass153_8472);
							class137.aClass233_1519.method2147(1.0F / (((Class298_Sub16) class298_sub16).aFloat7294), 1.0F / (((Class298_Sub16) class298_sub16).aFloat7294), 1.0F, 1.0F);
							class137.anInt1532 = ((Class298_Sub16) class298_sub16).anInt7291;
							class137.anInt1533 = (((Class298_Sub16) class298_sub16).anInt7292 - (((Class298_Sub16) class298_sub16).anInt7291) + 1);
							class137.anInt1534 = i_386_;
							class137.anInt1514 = (((Class298_Sub16) class298_sub16).anInt7282 / 3);
							switch (i_388_) {
							case 7:
								class137.aClass217_1530.method2007((((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[12]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[13]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[14]));
								class137.aClass233_1535.method2172();
								class137.anInterface9_Impl1_1518 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5321();
								class137.method1503(0);
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (!(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.fixedFunction) && (((Class_xa_Sub1) this).anInt8482 & 0x8) != 0) {
									Class161_Sub1_Sub2 class161_sub1_sub2 = (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass161_Sub1_Sub2_8319);
									class161_sub1_sub2.aClass233_9140.method2142(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8251);
									class161_sub1_sub2.aClass233_9142.method2147(1.0F / (((Class298_Sub16) class298_sub16).aFloat7294 * (float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt729) * -28774789)), 1.0F / (((Class298_Sub16) class298_sub16).aFloat7294 * (float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt729) * -28774789)), 1.0F, 1.0F);
									class161_sub1_sub2.aClass217_9144.method2007((((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[12]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[13]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[14]));
									Class53 class53 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface_ma5299.method174((((Class298_Sub16) class298_sub16).anInt7284), 191676686));
									class161_sub1_sub2.anInt9145 = class53.aByte536 * -1021876967;
									class161_sub1_sub2.anInt9160 = (((Class298_Sub16) class298_sub16).anInt7291) * 1525453135;
									class161_sub1_sub2.anInt9158 = ((((Class298_Sub16) class298_sub16).anInt7292) - (((Class298_Sub16) class298_sub16).anInt7291) + 1) * 942867733;
									class161_sub1_sub2.anInt9162 = i_386_ * 771469949;
									class161_sub1_sub2.anInt9163 = (((Class298_Sub16) class298_sub16).anInt7282) / 3 * -745727859;
									class161_sub1_sub2.aClass232_9153.method2140(class137.aClass232_1523);
									class161_sub1_sub2.aClass217_9149.method2013(class137.aClass217_1524);
									class161_sub1_sub2.aClass232_9157.method2140(class137.aClass232_1525);
									class161_sub1_sub2.aClass217_9139.method2013(class137.aClass217_1522);
									class161_sub1_sub2.method1748(-1712018251);
								} else
									class137.method1507(0);
								break;
							default:
								if (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aBoolean8326)
									class137.method1510();
								else
									class137.method1507(0);
								break;
							case 1:
								class137.aClass217_1530.method2007((((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[12]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[13]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[14]));
								class137.method1508(0);
								break;
							case 6:
								class137.method1514(!Class298_Sub32_Sub31.method3339(i_388_, -869988177));
							}
							i_386_ += ((Class298_Sub16) class298_sub16).anInt7282;
						}
					}
				}
			}
			if (((Class_xa_Sub1) this).aClass169_8452 != null) {
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(0, ((Class_xa_Sub1) this).anInterface7_Impl1_8470);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(1, ((Class_xa_Sub1) this).anInterface7_Impl1_8449);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5455(((Class_xa_Sub1) this).aClass153_8472);
				Matrix4f class233 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236);
				class233.method2172();
				class233.aFloatArray2594[13] = -1.0F;
				class137.method1506(class233);
				((Class_xa_Sub1) this).aClass169_8452.method1800(class137, i, i_368_, i_369_, bools, bool);
			}
		}
	}

	public void method6348(int i, int i_389_, int i_390_, boolean[][] bools, boolean bool, int i_391_) {
		if (((Class_xa_Sub1) this).aClass298Array8478 != null) {
			int i_392_ = i_390_ + i_390_ + 1;
			i_392_ *= i_392_;
			if (anIntArray8471.length < i_392_)
				anIntArray8471 = new int[i_392_];
			int i_393_ = i - i_390_;
			int i_394_ = i_393_;
			if (i_393_ < 0)
				i_393_ = 0;
			int i_395_ = i_389_ - i_390_;
			int i_396_ = i_395_;
			if (i_395_ < 0)
				i_395_ = 0;
			int i_397_ = i + i_390_;
			if (i_397_ > anInt6287 * -506105871 - 1)
				i_397_ = anInt6287 * -506105871 - 1;
			int i_398_ = i_389_ + i_390_;
			if (i_398_ > anInt6286 * -1148794921 - 1)
				i_398_ = anInt6286 * -1148794921 - 1;
			anInt8453 = 0;
			for (int i_399_ = i_393_; i_399_ <= i_397_; i_399_++) {
				boolean[] bools_400_ = bools[i_399_ - i_394_];
				for (int i_401_ = i_395_; i_401_ <= i_398_; i_401_++) {
					if (bools_400_[i_401_ - i_396_])
						anIntArray8471[anInt8453++] = i_401_ * (anInt6287 * -506105871) + i_399_;
				}
			}
			ByteBuffer bytebuffer = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aByteBuffer8216;
			bytebuffer.clear();
			for (int i_402_ = 0; i_402_ < ((Class_xa_Sub1) this).aClass298Array8478.length; i_402_++) {
				Class298_Sub16 class298_sub16 = ((Class298_Sub16) ((Class_xa_Sub1) this).aClass298Array8478[i_402_]);
				class298_sub16.method2915(anIntArray8471, anInt8453);
			}
			int i_403_ = bytebuffer.position();
			Class137 class137 = (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aClass137_8316);
			if (i_403_ != 0) {
				Interface7_Impl2 interface7_impl2 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5312(i_403_ / 2);
				interface7_impl2.method63(0, i_403_, (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aLong8217));
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5393();
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(0, ((Class_xa_Sub1) this).anInterface7_Impl1_8470);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5384(interface7_impl2);
				class137.method1506(Matrix4f.aClass233_2595);
				if (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInt8233 > 0) {
					class137.aClass232_1525.method2135(0.0F, 0.0F, 1.0F, -(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8292));
					class137.aClass217_1522.method2007((float) ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInt8332) >> 16 & 0xff) / 255.0F, (float) ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInt8332) >> 8 & 0xff) / 255.0F, (float) ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInt8332) >> 0 & 0xff) / 255.0F);
					((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236.method2142(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8230);
					((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236.method2159();
					class137.aClass232_1525.method2138(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236);
					class137.aClass232_1525.method2139(1.0F / ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8336) - (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8292)));
				} else {
					class137.aClass232_1525.method2135(0.0F, 0.0F, 0.0F, 0.0F);
					class137.aClass217_1522.method2007(0.0F, 0.0F, 0.0F);
				}
				if ((((Class_xa_Sub1) this).anInt8482 & 0x37) == 0) {
					int i_404_ = 0;
					for (int i_405_ = 0; (i_405_ < ((Class_xa_Sub1) this).aClass298Array8478.length); i_405_++) {
						Class298_Sub16 class298_sub16 = (Class298_Sub16) (((Class_xa_Sub1) this).aClass298Array8478[i_405_]);
						if (((Class298_Sub16) class298_sub16).anInt7282 != 0) {
							if (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aBoolean8326) {
								((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5058(0, (((Class298_Sub16) class298_sub16).aClass78_7286));
								class137.aClass232_1523.method2135(0.0F, 1.0F, 0.0F, ((float) (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).anInt8328) + ((float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt727) * -1475891183) / 255.0F * (float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt725) * 1996750669))));
								class137.aClass232_1523.method2139(1.0F / (float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt725) * 1996750669));
								class137.aClass217_1524.method2007((float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 16 & 0xff) / 255.0F, (float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 8 & 0xff) / 255.0F, (float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 0 & 0xff) / 255.0F);
							} else {
								class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
								class137.aClass217_1524.method2007(0.0F, 0.0F, 0.0F);
							}
							boolean bool_406_ = false;
							if (((Class298_Sub16) class298_sub16).anInt7284 != -1) {
								class137.anInterface9_Impl2_1517 = (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass157_8351.method1698(((Class298_Sub16) class298_sub16).anInt7284));
								Class53 class53 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface_ma5299.method174((((Class298_Sub16) class298_sub16).anInt7284), 593985487));
								bool_406_ = !(Class298_Sub32_Sub31.method3339(class53.aByte529, -1511846848));
							} else
								class137.anInterface9_Impl2_1517 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface9_Impl2_8310);
							((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(1, (((Class298_Sub16) class298_sub16).anInterface7_Impl1_7287));
							((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5455(((Class_xa_Sub1) this).aClass153_8472);
							class137.aClass233_1519.method2147(1.0F / (((Class298_Sub16) class298_sub16).aFloat7294), 1.0F / (((Class298_Sub16) class298_sub16).aFloat7294), 1.0F, 1.0F);
							class137.anInt1532 = ((Class298_Sub16) class298_sub16).anInt7291;
							class137.anInt1533 = (((Class298_Sub16) class298_sub16).anInt7292 - (((Class298_Sub16) class298_sub16).anInt7291) + 1);
							class137.anInt1534 = i_404_;
							class137.anInt1514 = (((Class298_Sub16) class298_sub16).anInt7282 / 3);
							class137.method1514(bool_406_);
							i_404_ += ((Class298_Sub16) class298_sub16).anInt7282;
						}
					}
				} else {
					class137.aClass217_1527.method2007((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[0]), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[1]), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[2]));
					class137.aClass217_1528.method2007((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8364 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8362)), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8364 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8289)), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8364 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8290)));
					class137.aClass217_1529.method2007((-(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8293) * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8362)), (-(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8293) * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8289)), (-(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8293) * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8290)));
					class137.aClass217_1515.method2007((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8291 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8362)), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8291 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8289)), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8291 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8290)));
					int i_407_ = 0;
					for (int i_408_ = 0; (i_408_ < ((Class_xa_Sub1) this).aClass298Array8478.length); i_408_++) {
						Class298_Sub16 class298_sub16 = (Class298_Sub16) (((Class_xa_Sub1) this).aClass298Array8478[i_408_]);
						if (((Class298_Sub16) class298_sub16).anInt7282 > 0) {
							if (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aBoolean8326) {
								((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5058(0, (((Class298_Sub16) class298_sub16).aClass78_7286));
								float f = 0.15F;
								class137.aClass232_1523.method2135(0.0F, 1.0F / ((float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt725) * 1996750669) * f), 0.0F, 256.0F / ((float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt725) * 1996750669) * f));
								class137.aClass217_1524.method2007((float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 16 & 0xff) / 255.0F, (float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 8 & 0xff) / 255.0F, (float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 0 & 0xff) / 255.0F);
							} else {
								class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
								class137.aClass217_1524.method2007(0.0F, 0.0F, 0.0F);
							}
							byte i_409_ = 11;
							if (((Class298_Sub16) class298_sub16).anInt7284 != -1) {
								Class53 class53 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface_ma5299.method174((((Class298_Sub16) class298_sub16).anInt7284), 1262090784));
								i_409_ = class53.aByte529;
								class137.anInterface9_Impl2_1517 = (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass157_8351.method1698(((Class298_Sub16) class298_sub16).anInt7284));
								class137.method1509(class53);
							} else
								class137.anInterface9_Impl2_1517 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface9_Impl2_8310);
							((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(1, (((Class298_Sub16) class298_sub16).anInterface7_Impl1_7287));
							((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5455(((Class_xa_Sub1) this).aClass153_8472);
							class137.aClass233_1519.method2147(1.0F / (((Class298_Sub16) class298_sub16).aFloat7294), 1.0F / (((Class298_Sub16) class298_sub16).aFloat7294), 1.0F, 1.0F);
							class137.anInt1532 = ((Class298_Sub16) class298_sub16).anInt7291;
							class137.anInt1533 = (((Class298_Sub16) class298_sub16).anInt7292 - (((Class298_Sub16) class298_sub16).anInt7291) + 1);
							class137.anInt1534 = i_407_;
							class137.anInt1514 = (((Class298_Sub16) class298_sub16).anInt7282 / 3);
							switch (i_409_) {
							case 7:
								class137.aClass217_1530.method2007((((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[12]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[13]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[14]));
								class137.aClass233_1535.method2172();
								class137.anInterface9_Impl1_1518 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5321();
								class137.method1503(0);
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (!(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.fixedFunction) && (((Class_xa_Sub1) this).anInt8482 & 0x8) != 0) {
									Class161_Sub1_Sub2 class161_sub1_sub2 = (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass161_Sub1_Sub2_8319);
									class161_sub1_sub2.aClass233_9140.method2142(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8251);
									class161_sub1_sub2.aClass233_9142.method2147(1.0F / (((Class298_Sub16) class298_sub16).aFloat7294 * (float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt729) * -28774789)), 1.0F / (((Class298_Sub16) class298_sub16).aFloat7294 * (float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt729) * -28774789)), 1.0F, 1.0F);
									class161_sub1_sub2.aClass217_9144.method2007((((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[12]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[13]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[14]));
									Class53 class53 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface_ma5299.method174((((Class298_Sub16) class298_sub16).anInt7284), 1144477529));
									class161_sub1_sub2.anInt9145 = class53.aByte536 * -1021876967;
									class161_sub1_sub2.anInt9160 = (((Class298_Sub16) class298_sub16).anInt7291) * 1525453135;
									class161_sub1_sub2.anInt9158 = ((((Class298_Sub16) class298_sub16).anInt7292) - (((Class298_Sub16) class298_sub16).anInt7291) + 1) * 942867733;
									class161_sub1_sub2.anInt9162 = i_407_ * 771469949;
									class161_sub1_sub2.anInt9163 = (((Class298_Sub16) class298_sub16).anInt7282) / 3 * -745727859;
									class161_sub1_sub2.aClass232_9153.method2140(class137.aClass232_1523);
									class161_sub1_sub2.aClass217_9149.method2013(class137.aClass217_1524);
									class161_sub1_sub2.aClass232_9157.method2140(class137.aClass232_1525);
									class161_sub1_sub2.aClass217_9139.method2013(class137.aClass217_1522);
									class161_sub1_sub2.method1748(961682393);
								} else
									class137.method1507(0);
								break;
							default:
								if (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aBoolean8326)
									class137.method1510();
								else
									class137.method1507(0);
								break;
							case 1:
								class137.aClass217_1530.method2007((((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[12]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[13]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[14]));
								class137.method1508(0);
								break;
							case 6:
								class137.method1514(!Class298_Sub32_Sub31.method3339(i_409_, -1822142623));
							}
							i_407_ += ((Class298_Sub16) class298_sub16).anInt7282;
						}
					}
				}
			}
			if (((Class_xa_Sub1) this).aClass169_8452 != null) {
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(0, ((Class_xa_Sub1) this).anInterface7_Impl1_8470);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(1, ((Class_xa_Sub1) this).anInterface7_Impl1_8449);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5455(((Class_xa_Sub1) this).aClass153_8472);
				Matrix4f class233 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236);
				class233.method2172();
				class233.aFloatArray2594[13] = -1.0F;
				class137.method1506(class233);
				((Class_xa_Sub1) this).aClass169_8452.method1800(class137, i, i_389_, i_390_, bools, bool);
			}
		}
	}

	public void method6347(int i, int i_410_, int i_411_, int i_412_, int i_413_, int i_414_, int i_415_, boolean[][] bools) {
		if (((Class_xa_Sub1) this).anInt8473 > 0) {
			Interface7_Impl2 interface7_impl2 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5312(((Class_xa_Sub1) this).anInt8455);
			int i_416_ = 0;
			int i_417_ = 32767;
			int i_418_ = -32768;
			ByteBuffer bytebuffer = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aByteBuffer8216;
			bytebuffer.clear();
			for (int i_419_ = i_413_; i_419_ < i_415_; i_419_++) {
				int i_420_ = i_419_ * (anInt6287 * -506105871) + i_412_;
				for (int i_421_ = i_412_; i_421_ < i_414_; i_421_++) {
					if (bools[i_421_ - i_412_][i_419_ - i_413_]) {
						short[] is = (((Class_xa_Sub1) this).aShortArrayArray8456[i_420_]);
						if (is != null) {
							for (int i_422_ = 0; i_422_ < is.length; i_422_++) {
								int i_423_ = is[i_422_] & 0xffff;
								if (i_423_ > i_418_)
									i_418_ = i_423_;
								if (i_423_ < i_417_)
									i_417_ = i_423_;
								bytebuffer.putShort((short) i_423_);
								i_416_++;
							}
						}
					}
					i_420_++;
				}
			}
			interface7_impl2.method63(0, bytebuffer.position(), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aLong8217));
			if (i_416_ > 0) {
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5393();
				Class137 class137 = (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass137_8316);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(0, ((Class_xa_Sub1) this).anInterface7_Impl1_8470);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(1, ((Class_xa_Sub1) this).anInterface7_Impl1_8449);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5455(((Class_xa_Sub1) this).aClass153_8472);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5384(interface7_impl2);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5043(Matrix3f.aClass222_2504);
				float f = (float) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method4992((short) 2365).method545();
				float f_424_ = (float) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method4992((short) -15012).method552();
				Matrix3f class222 = new Matrix3f();
				Matrix3f class222_425_ = new Matrix3f();
				class222.method2057(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class222_425_.method2065((float) i_411_ / (256.0F * (float) (anInt6288 * -1212653763)), (float) -i_411_ / (256.0F * (float) (anInt6288 * -1212653763)), 1.0F / (((Class_xa_Sub1) this).aFloat8447 - ((Class_xa_Sub1) this).aFloat8457));
				class222_425_.method2064((float) i - (float) (i_412_ * i_411_) / 256.0F, (float) i_410_ + (float) (i_415_ * i_411_) / 256.0F, (-((Class_xa_Sub1) this).aFloat8457 / (((Class_xa_Sub1) this).aFloat8447 - ((Class_xa_Sub1) this).aFloat8457)));
				class222_425_.method2061(2.0F / f, 2.0F / f_424_, 1.0F);
				class222_425_.method2064(-1.0F, -1.0F, 0.0F);
				((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aClass222_8235.method2068(class222, class222_425_);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236.method2145(((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass222_8235);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5182(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236);
				class137.method1506(Matrix4f.aClass233_2595);
				class137.aClass232_1525.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1522.method2007(0.0F, 0.0F, 0.0F);
				class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1524.method2007(0.0F, 0.0F, 0.0F);
				class137.anInterface9_Impl2_1517 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface9_Impl2_8310);
				class137.aClass233_1519.method2172();
				class137.anInt1532 = i_417_;
				class137.anInt1533 = i_418_ - i_417_ + 1;
				class137.anInt1534 = 0;
				class137.anInt1514 = i_416_ / 3;
				class137.method1514(false);
			}
		}
	}

	public void method6351(int i, int i_426_, int i_427_, int i_428_, int i_429_, int i_430_, int i_431_, boolean[][] bools) {
		if (((Class_xa_Sub1) this).anInt8473 > 0) {
			Interface7_Impl2 interface7_impl2 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5312(((Class_xa_Sub1) this).anInt8455);
			int i_432_ = 0;
			int i_433_ = 32767;
			int i_434_ = -32768;
			ByteBuffer bytebuffer = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aByteBuffer8216;
			bytebuffer.clear();
			for (int i_435_ = i_429_; i_435_ < i_431_; i_435_++) {
				int i_436_ = i_435_ * (anInt6287 * -506105871) + i_428_;
				for (int i_437_ = i_428_; i_437_ < i_430_; i_437_++) {
					if (bools[i_437_ - i_428_][i_435_ - i_429_]) {
						short[] is = (((Class_xa_Sub1) this).aShortArrayArray8456[i_436_]);
						if (is != null) {
							for (int i_438_ = 0; i_438_ < is.length; i_438_++) {
								int i_439_ = is[i_438_] & 0xffff;
								if (i_439_ > i_434_)
									i_434_ = i_439_;
								if (i_439_ < i_433_)
									i_433_ = i_439_;
								bytebuffer.putShort((short) i_439_);
								i_432_++;
							}
						}
					}
					i_436_++;
				}
			}
			interface7_impl2.method63(0, bytebuffer.position(), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aLong8217));
			if (i_432_ > 0) {
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5393();
				Class137 class137 = (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass137_8316);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(0, ((Class_xa_Sub1) this).anInterface7_Impl1_8470);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(1, ((Class_xa_Sub1) this).anInterface7_Impl1_8449);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5455(((Class_xa_Sub1) this).aClass153_8472);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5384(interface7_impl2);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5043(Matrix3f.aClass222_2504);
				float f = (float) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method4992((short) -18098).method545();
				float f_440_ = (float) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method4992((short) 2214).method552();
				Matrix3f class222 = new Matrix3f();
				Matrix3f class222_441_ = new Matrix3f();
				class222.method2057(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class222_441_.method2065((float) i_427_ / (256.0F * (float) (anInt6288 * -1212653763)), (float) -i_427_ / (256.0F * (float) (anInt6288 * -1212653763)), 1.0F / (((Class_xa_Sub1) this).aFloat8447 - ((Class_xa_Sub1) this).aFloat8457));
				class222_441_.method2064((float) i - (float) (i_428_ * i_427_) / 256.0F, (float) i_426_ + (float) (i_431_ * i_427_) / 256.0F, (-((Class_xa_Sub1) this).aFloat8457 / (((Class_xa_Sub1) this).aFloat8447 - ((Class_xa_Sub1) this).aFloat8457)));
				class222_441_.method2061(2.0F / f, 2.0F / f_440_, 1.0F);
				class222_441_.method2064(-1.0F, -1.0F, 0.0F);
				((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aClass222_8235.method2068(class222, class222_441_);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236.method2145(((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass222_8235);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5182(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236);
				class137.method1506(Matrix4f.aClass233_2595);
				class137.aClass232_1525.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1522.method2007(0.0F, 0.0F, 0.0F);
				class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1524.method2007(0.0F, 0.0F, 0.0F);
				class137.anInterface9_Impl2_1517 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface9_Impl2_8310);
				class137.aClass233_1519.method2172();
				class137.anInt1532 = i_433_;
				class137.anInt1533 = i_434_ - i_433_ + 1;
				class137.anInt1534 = 0;
				class137.anInt1514 = i_432_ / 3;
				class137.method1514(false);
			}
		}
	}

	public void method6350(int i, int i_442_, int i_443_, int i_444_, int i_445_, int i_446_, int i_447_, boolean[][] bools) {
		if (((Class_xa_Sub1) this).anInt8473 > 0) {
			Interface7_Impl2 interface7_impl2 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5312(((Class_xa_Sub1) this).anInt8455);
			int i_448_ = 0;
			int i_449_ = 32767;
			int i_450_ = -32768;
			ByteBuffer bytebuffer = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aByteBuffer8216;
			bytebuffer.clear();
			for (int i_451_ = i_445_; i_451_ < i_447_; i_451_++) {
				int i_452_ = i_451_ * (anInt6287 * -506105871) + i_444_;
				for (int i_453_ = i_444_; i_453_ < i_446_; i_453_++) {
					if (bools[i_453_ - i_444_][i_451_ - i_445_]) {
						short[] is = (((Class_xa_Sub1) this).aShortArrayArray8456[i_452_]);
						if (is != null) {
							for (int i_454_ = 0; i_454_ < is.length; i_454_++) {
								int i_455_ = is[i_454_] & 0xffff;
								if (i_455_ > i_450_)
									i_450_ = i_455_;
								if (i_455_ < i_449_)
									i_449_ = i_455_;
								bytebuffer.putShort((short) i_455_);
								i_448_++;
							}
						}
					}
					i_452_++;
				}
			}
			interface7_impl2.method63(0, bytebuffer.position(), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aLong8217));
			if (i_448_ > 0) {
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5393();
				Class137 class137 = (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass137_8316);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(0, ((Class_xa_Sub1) this).anInterface7_Impl1_8470);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(1, ((Class_xa_Sub1) this).anInterface7_Impl1_8449);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5455(((Class_xa_Sub1) this).aClass153_8472);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5384(interface7_impl2);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5043(Matrix3f.aClass222_2504);
				float f = (float) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method4992((short) -10639).method545();
				float f_456_ = (float) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method4992((short) -13227).method552();
				Matrix3f class222 = new Matrix3f();
				Matrix3f class222_457_ = new Matrix3f();
				class222.method2057(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class222_457_.method2065((float) i_443_ / (256.0F * (float) (anInt6288 * -1212653763)), (float) -i_443_ / (256.0F * (float) (anInt6288 * -1212653763)), 1.0F / (((Class_xa_Sub1) this).aFloat8447 - ((Class_xa_Sub1) this).aFloat8457));
				class222_457_.method2064((float) i - (float) (i_444_ * i_443_) / 256.0F, (float) i_442_ + (float) (i_447_ * i_443_) / 256.0F, (-((Class_xa_Sub1) this).aFloat8457 / (((Class_xa_Sub1) this).aFloat8447 - ((Class_xa_Sub1) this).aFloat8457)));
				class222_457_.method2061(2.0F / f, 2.0F / f_456_, 1.0F);
				class222_457_.method2064(-1.0F, -1.0F, 0.0F);
				((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aClass222_8235.method2068(class222, class222_457_);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236.method2145(((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass222_8235);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5182(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236);
				class137.method1506(Matrix4f.aClass233_2595);
				class137.aClass232_1525.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1522.method2007(0.0F, 0.0F, 0.0F);
				class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1524.method2007(0.0F, 0.0F, 0.0F);
				class137.anInterface9_Impl2_1517 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface9_Impl2_8310);
				class137.aClass233_1519.method2172();
				class137.anInt1532 = i_449_;
				class137.anInt1533 = i_450_ - i_449_ + 1;
				class137.anInt1534 = 0;
				class137.anInt1514 = i_448_ / 3;
				class137.method1514(false);
			}
		}
	}

	public void method6357(int i, int i_458_, int i_459_, boolean[][] bools, boolean bool, int i_460_) {
		if (((Class_xa_Sub1) this).aClass298Array8478 != null) {
			int i_461_ = i_459_ + i_459_ + 1;
			i_461_ *= i_461_;
			if (anIntArray8471.length < i_461_)
				anIntArray8471 = new int[i_461_];
			int i_462_ = i - i_459_;
			int i_463_ = i_462_;
			if (i_462_ < 0)
				i_462_ = 0;
			int i_464_ = i_458_ - i_459_;
			int i_465_ = i_464_;
			if (i_464_ < 0)
				i_464_ = 0;
			int i_466_ = i + i_459_;
			if (i_466_ > anInt6287 * -506105871 - 1)
				i_466_ = anInt6287 * -506105871 - 1;
			int i_467_ = i_458_ + i_459_;
			if (i_467_ > anInt6286 * -1148794921 - 1)
				i_467_ = anInt6286 * -1148794921 - 1;
			anInt8453 = 0;
			for (int i_468_ = i_462_; i_468_ <= i_466_; i_468_++) {
				boolean[] bools_469_ = bools[i_468_ - i_463_];
				for (int i_470_ = i_464_; i_470_ <= i_467_; i_470_++) {
					if (bools_469_[i_470_ - i_465_])
						anIntArray8471[anInt8453++] = i_470_ * (anInt6287 * -506105871) + i_468_;
				}
			}
			ByteBuffer bytebuffer = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aByteBuffer8216;
			bytebuffer.clear();
			for (int i_471_ = 0; i_471_ < ((Class_xa_Sub1) this).aClass298Array8478.length; i_471_++) {
				Class298_Sub16 class298_sub16 = ((Class298_Sub16) ((Class_xa_Sub1) this).aClass298Array8478[i_471_]);
				class298_sub16.method2915(anIntArray8471, anInt8453);
			}
			int i_472_ = bytebuffer.position();
			Class137 class137 = (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aClass137_8316);
			if (i_472_ != 0) {
				Interface7_Impl2 interface7_impl2 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5312(i_472_ / 2);
				interface7_impl2.method63(0, i_472_, (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aLong8217));
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5393();
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(0, ((Class_xa_Sub1) this).anInterface7_Impl1_8470);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5384(interface7_impl2);
				class137.method1506(Matrix4f.aClass233_2595);
				if (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInt8233 > 0) {
					class137.aClass232_1525.method2135(0.0F, 0.0F, 1.0F, -(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8292));
					class137.aClass217_1522.method2007((float) ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInt8332) >> 16 & 0xff) / 255.0F, (float) ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInt8332) >> 8 & 0xff) / 255.0F, (float) ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInt8332) >> 0 & 0xff) / 255.0F);
					((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236.method2142(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8230);
					((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236.method2159();
					class137.aClass232_1525.method2138(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236);
					class137.aClass232_1525.method2139(1.0F / ((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8336) - (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8292)));
				} else {
					class137.aClass232_1525.method2135(0.0F, 0.0F, 0.0F, 0.0F);
					class137.aClass217_1522.method2007(0.0F, 0.0F, 0.0F);
				}
				if ((((Class_xa_Sub1) this).anInt8482 & 0x37) == 0) {
					int i_473_ = 0;
					for (int i_474_ = 0; (i_474_ < ((Class_xa_Sub1) this).aClass298Array8478.length); i_474_++) {
						Class298_Sub16 class298_sub16 = (Class298_Sub16) (((Class_xa_Sub1) this).aClass298Array8478[i_474_]);
						if (((Class298_Sub16) class298_sub16).anInt7282 != 0) {
							if (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aBoolean8326) {
								((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5058(0, (((Class298_Sub16) class298_sub16).aClass78_7286));
								class137.aClass232_1523.method2135(0.0F, 1.0F, 0.0F, ((float) (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).anInt8328) + ((float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt727) * -1475891183) / 255.0F * (float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt725) * 1996750669))));
								class137.aClass232_1523.method2139(1.0F / (float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt725) * 1996750669));
								class137.aClass217_1524.method2007((float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 16 & 0xff) / 255.0F, (float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 8 & 0xff) / 255.0F, (float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 0 & 0xff) / 255.0F);
							} else {
								class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
								class137.aClass217_1524.method2007(0.0F, 0.0F, 0.0F);
							}
							boolean bool_475_ = false;
							if (((Class298_Sub16) class298_sub16).anInt7284 != -1) {
								class137.anInterface9_Impl2_1517 = (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass157_8351.method1698(((Class298_Sub16) class298_sub16).anInt7284));
								Class53 class53 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface_ma5299.method174((((Class298_Sub16) class298_sub16).anInt7284), 444879772));
								bool_475_ = !(Class298_Sub32_Sub31.method3339(class53.aByte529, -1276184366));
							} else
								class137.anInterface9_Impl2_1517 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface9_Impl2_8310);
							((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(1, (((Class298_Sub16) class298_sub16).anInterface7_Impl1_7287));
							((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5455(((Class_xa_Sub1) this).aClass153_8472);
							class137.aClass233_1519.method2147(1.0F / (((Class298_Sub16) class298_sub16).aFloat7294), 1.0F / (((Class298_Sub16) class298_sub16).aFloat7294), 1.0F, 1.0F);
							class137.anInt1532 = ((Class298_Sub16) class298_sub16).anInt7291;
							class137.anInt1533 = (((Class298_Sub16) class298_sub16).anInt7292 - (((Class298_Sub16) class298_sub16).anInt7291) + 1);
							class137.anInt1534 = i_473_;
							class137.anInt1514 = (((Class298_Sub16) class298_sub16).anInt7282 / 3);
							class137.method1514(bool_475_);
							i_473_ += ((Class298_Sub16) class298_sub16).anInt7282;
						}
					}
				} else {
					class137.aClass217_1527.method2007((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[0]), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[1]), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloatArray8283[2]));
					class137.aClass217_1528.method2007((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8364 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8362)), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8364 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8289)), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8364 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8290)));
					class137.aClass217_1529.method2007((-(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8293) * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8362)), (-(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8293) * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8289)), (-(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8293) * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8290)));
					class137.aClass217_1515.method2007((((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8291 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8362)), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8291 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8289)), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8291 * (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aFloat8290)));
					int i_476_ = 0;
					for (int i_477_ = 0; (i_477_ < ((Class_xa_Sub1) this).aClass298Array8478.length); i_477_++) {
						Class298_Sub16 class298_sub16 = (Class298_Sub16) (((Class_xa_Sub1) this).aClass298Array8478[i_477_]);
						if (((Class298_Sub16) class298_sub16).anInt7282 > 0) {
							if (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aBoolean8326) {
								((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5058(0, (((Class298_Sub16) class298_sub16).aClass78_7286));
								float f = 0.15F;
								class137.aClass232_1523.method2135(0.0F, 1.0F / ((float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt725) * 1996750669) * f), 0.0F, 256.0F / ((float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt725) * 1996750669) * f));
								class137.aClass217_1524.method2007((float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 16 & 0xff) / 255.0F, (float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 8 & 0xff) / 255.0F, (float) (((((Class298_Sub16) class298_sub16).aClass78_7286.anInt726) * -1212608691) >> 0 & 0xff) / 255.0F);
							} else {
								class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
								class137.aClass217_1524.method2007(0.0F, 0.0F, 0.0F);
							}
							byte i_478_ = 11;
							if (((Class298_Sub16) class298_sub16).anInt7284 != -1) {
								Class53 class53 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface_ma5299.method174((((Class298_Sub16) class298_sub16).anInt7284), 2135192368));
								i_478_ = class53.aByte529;
								class137.anInterface9_Impl2_1517 = (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass157_8351.method1698(((Class298_Sub16) class298_sub16).anInt7284));
								class137.method1509(class53);
							} else
								class137.anInterface9_Impl2_1517 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface9_Impl2_8310);
							((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(1, (((Class298_Sub16) class298_sub16).anInterface7_Impl1_7287));
							((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5455(((Class_xa_Sub1) this).aClass153_8472);
							class137.aClass233_1519.method2147(1.0F / (((Class298_Sub16) class298_sub16).aFloat7294), 1.0F / (((Class298_Sub16) class298_sub16).aFloat7294), 1.0F, 1.0F);
							class137.anInt1532 = ((Class298_Sub16) class298_sub16).anInt7291;
							class137.anInt1533 = (((Class298_Sub16) class298_sub16).anInt7292 - (((Class298_Sub16) class298_sub16).anInt7291) + 1);
							class137.anInt1534 = i_476_;
							class137.anInt1514 = (((Class298_Sub16) class298_sub16).anInt7282 / 3);
							switch (i_478_) {
							case 7:
								class137.aClass217_1530.method2007((((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[12]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[13]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[14]));
								class137.aClass233_1535.method2172();
								class137.anInterface9_Impl1_1518 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5321();
								class137.method1503(0);
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (!(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.fixedFunction) && (((Class_xa_Sub1) this).anInt8482 & 0x8) != 0) {
									Class161_Sub1_Sub2 class161_sub1_sub2 = (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass161_Sub1_Sub2_8319);
									class161_sub1_sub2.aClass233_9140.method2142(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8251);
									class161_sub1_sub2.aClass233_9142.method2147(1.0F / (((Class298_Sub16) class298_sub16).aFloat7294 * (float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt729) * -28774789)), 1.0F / (((Class298_Sub16) class298_sub16).aFloat7294 * (float) ((((Class298_Sub16) class298_sub16).aClass78_7286.anInt729) * -28774789)), 1.0F, 1.0F);
									class161_sub1_sub2.aClass217_9144.method2007((((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[12]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[13]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[14]));
									Class53 class53 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface_ma5299.method174((((Class298_Sub16) class298_sub16).anInt7284), 1719353613));
									class161_sub1_sub2.anInt9145 = class53.aByte536 * -1021876967;
									class161_sub1_sub2.anInt9160 = (((Class298_Sub16) class298_sub16).anInt7291) * 1525453135;
									class161_sub1_sub2.anInt9158 = ((((Class298_Sub16) class298_sub16).anInt7292) - (((Class298_Sub16) class298_sub16).anInt7291) + 1) * 942867733;
									class161_sub1_sub2.anInt9162 = i_476_ * 771469949;
									class161_sub1_sub2.anInt9163 = (((Class298_Sub16) class298_sub16).anInt7282) / 3 * -745727859;
									class161_sub1_sub2.aClass232_9153.method2140(class137.aClass232_1523);
									class161_sub1_sub2.aClass217_9149.method2013(class137.aClass217_1524);
									class161_sub1_sub2.aClass232_9157.method2140(class137.aClass232_1525);
									class161_sub1_sub2.aClass217_9139.method2013(class137.aClass217_1522);
									class161_sub1_sub2.method1748(1844797050);
								} else
									class137.method1507(0);
								break;
							default:
								if (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aBoolean8326)
									class137.method1510();
								else
									class137.method1507(0);
								break;
							case 1:
								class137.aClass217_1530.method2007((((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[12]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[13]), (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass233_8231.aFloatArray2594[14]));
								class137.method1508(0);
								break;
							case 6:
								class137.method1514(!Class298_Sub32_Sub31.method3339(i_478_, -642644362));
							}
							i_476_ += ((Class298_Sub16) class298_sub16).anInt7282;
						}
					}
				}
			}
			if (((Class_xa_Sub1) this).aClass169_8452 != null) {
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(0, ((Class_xa_Sub1) this).anInterface7_Impl1_8470);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(1, ((Class_xa_Sub1) this).anInterface7_Impl1_8449);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5455(((Class_xa_Sub1) this).aClass153_8472);
				Matrix4f class233 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236);
				class233.method2172();
				class233.aFloatArray2594[13] = -1.0F;
				class137.method1506(class233);
				((Class_xa_Sub1) this).aClass169_8452.method1800(class137, i, i_458_, i_459_, bools, bool);
			}
		}
	}

	public void method6352(int i, int i_479_, int i_480_, int i_481_, int i_482_, int i_483_, int i_484_, boolean[][] bools) {
		if (((Class_xa_Sub1) this).anInt8473 > 0) {
			Interface7_Impl2 interface7_impl2 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5312(((Class_xa_Sub1) this).anInt8455);
			int i_485_ = 0;
			int i_486_ = 32767;
			int i_487_ = -32768;
			ByteBuffer bytebuffer = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aByteBuffer8216;
			bytebuffer.clear();
			for (int i_488_ = i_482_; i_488_ < i_484_; i_488_++) {
				int i_489_ = i_488_ * (anInt6287 * -506105871) + i_481_;
				for (int i_490_ = i_481_; i_490_ < i_483_; i_490_++) {
					if (bools[i_490_ - i_481_][i_488_ - i_482_]) {
						short[] is = (((Class_xa_Sub1) this).aShortArrayArray8456[i_489_]);
						if (is != null) {
							for (int i_491_ = 0; i_491_ < is.length; i_491_++) {
								int i_492_ = is[i_491_] & 0xffff;
								if (i_492_ > i_487_)
									i_487_ = i_492_;
								if (i_492_ < i_486_)
									i_486_ = i_492_;
								bytebuffer.putShort((short) i_492_);
								i_485_++;
							}
						}
					}
					i_489_++;
				}
			}
			interface7_impl2.method63(0, bytebuffer.position(), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aLong8217));
			if (i_485_ > 0) {
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5393();
				Class137 class137 = (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass137_8316);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(0, ((Class_xa_Sub1) this).anInterface7_Impl1_8470);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(1, ((Class_xa_Sub1) this).anInterface7_Impl1_8449);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5455(((Class_xa_Sub1) this).aClass153_8472);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5384(interface7_impl2);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5043(Matrix3f.aClass222_2504);
				float f = (float) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method4992((short) 12709).method545();
				float f_493_ = (float) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method4992((short) -19432).method552();
				Matrix3f class222 = new Matrix3f();
				Matrix3f class222_494_ = new Matrix3f();
				class222.method2057(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class222_494_.method2065((float) i_480_ / (256.0F * (float) (anInt6288 * -1212653763)), (float) -i_480_ / (256.0F * (float) (anInt6288 * -1212653763)), 1.0F / (((Class_xa_Sub1) this).aFloat8447 - ((Class_xa_Sub1) this).aFloat8457));
				class222_494_.method2064((float) i - (float) (i_481_ * i_480_) / 256.0F, (float) i_479_ + (float) (i_484_ * i_480_) / 256.0F, (-((Class_xa_Sub1) this).aFloat8457 / (((Class_xa_Sub1) this).aFloat8447 - ((Class_xa_Sub1) this).aFloat8457)));
				class222_494_.method2061(2.0F / f, 2.0F / f_493_, 1.0F);
				class222_494_.method2064(-1.0F, -1.0F, 0.0F);
				((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aClass222_8235.method2068(class222, class222_494_);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236.method2145(((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass222_8235);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5182(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236);
				class137.method1506(Matrix4f.aClass233_2595);
				class137.aClass232_1525.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1522.method2007(0.0F, 0.0F, 0.0F);
				class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1524.method2007(0.0F, 0.0F, 0.0F);
				class137.anInterface9_Impl2_1517 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface9_Impl2_8310);
				class137.aClass233_1519.method2172();
				class137.anInt1532 = i_486_;
				class137.anInt1533 = i_487_ - i_486_ + 1;
				class137.anInt1534 = 0;
				class137.anInt1514 = i_485_ / 3;
				class137.method1514(false);
			}
		}
	}

	public void method6349(int i, int i_495_, int i_496_, int i_497_, int i_498_, int i_499_, int i_500_, boolean[][] bools) {
		if (((Class_xa_Sub1) this).anInt8473 > 0) {
			Interface7_Impl2 interface7_impl2 = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5312(((Class_xa_Sub1) this).anInt8455);
			int i_501_ = 0;
			int i_502_ = 32767;
			int i_503_ = -32768;
			ByteBuffer bytebuffer = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aByteBuffer8216;
			bytebuffer.clear();
			for (int i_504_ = i_498_; i_504_ < i_500_; i_504_++) {
				int i_505_ = i_504_ * (anInt6287 * -506105871) + i_497_;
				for (int i_506_ = i_497_; i_506_ < i_499_; i_506_++) {
					if (bools[i_506_ - i_497_][i_504_ - i_498_]) {
						short[] is = (((Class_xa_Sub1) this).aShortArrayArray8456[i_505_]);
						if (is != null) {
							for (int i_507_ = 0; i_507_ < is.length; i_507_++) {
								int i_508_ = is[i_507_] & 0xffff;
								if (i_508_ > i_503_)
									i_503_ = i_508_;
								if (i_508_ < i_502_)
									i_502_ = i_508_;
								bytebuffer.putShort((short) i_508_);
								i_501_++;
							}
						}
					}
					i_505_++;
				}
			}
			interface7_impl2.method63(0, bytebuffer.position(), (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aLong8217));
			if (i_501_ > 0) {
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5393();
				Class137 class137 = (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass137_8316);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(0, ((Class_xa_Sub1) this).anInterface7_Impl1_8470);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5383(1, ((Class_xa_Sub1) this).anInterface7_Impl1_8449);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5455(((Class_xa_Sub1) this).aClass153_8472);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5384(interface7_impl2);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5043(Matrix3f.aClass222_2504);
				float f = (float) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method4992((short) -2056).method545();
				float f_509_ = (float) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method4992((short) 898).method552();
				Matrix3f class222 = new Matrix3f();
				Matrix3f class222_510_ = new Matrix3f();
				class222.method2057(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class222_510_.method2065((float) i_496_ / (256.0F * (float) (anInt6288 * -1212653763)), (float) -i_496_ / (256.0F * (float) (anInt6288 * -1212653763)), 1.0F / (((Class_xa_Sub1) this).aFloat8447 - ((Class_xa_Sub1) this).aFloat8457));
				class222_510_.method2064((float) i - (float) (i_497_ * i_496_) / 256.0F, (float) i_495_ + (float) (i_500_ * i_496_) / 256.0F, (-((Class_xa_Sub1) this).aFloat8457 / (((Class_xa_Sub1) this).aFloat8447 - ((Class_xa_Sub1) this).aFloat8457)));
				class222_510_.method2061(2.0F / f, 2.0F / f_509_, 1.0F);
				class222_510_.method2064(-1.0F, -1.0F, 0.0F);
				((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).aClass222_8235.method2068(class222, class222_510_);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236.method2145(((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).aClass222_8235);
				((Class_xa_Sub1) this).aClass_ra_Sub3_8467.method5182(((Class_xa_Sub1) this).aClass_ra_Sub3_8467.aClass233_8236);
				class137.method1506(Matrix4f.aClass233_2595);
				class137.aClass232_1525.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1522.method2007(0.0F, 0.0F, 0.0F);
				class137.aClass232_1523.method2135(0.0F, 0.0F, 0.0F, 0.0F);
				class137.aClass217_1524.method2007(0.0F, 0.0F, 0.0F);
				class137.anInterface9_Impl2_1517 = (((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface9_Impl2_8310);
				class137.aClass233_1519.method2172();
				class137.anInt1532 = i_502_;
				class137.anInt1533 = i_503_ - i_502_ + 1;
				class137.anInt1534 = 0;
				class137.anInt1514 = i_501_ / 3;
				class137.method1514(false);
			}
		}
	}

	public void method6342(Class298_Sub10 class298_sub10, int[] is) {
		((Class_xa_Sub1) this).aClass458_8468.method5968(new Class298_Sub18(((Class_xa_Sub1) this).aClass_ra_Sub3_8467, this, class298_sub10, is), 847764960);
	}

	public void method6359(int i, int i_511_, int[] is, int[] is_512_, int[] is_513_, int[] is_514_, int[] is_515_, int[] is_516_, int[] is_517_, int[] is_518_, Class78 class78, boolean bool) {
		Interface_ma interface_ma = ((Class_xa_Sub1) this).aClass_ra_Sub3_8467.anInterface_ma5299;
		if (is_514_ != null && ((Class_xa_Sub1) this).anIntArrayArrayArray8465 == null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8465 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		if (is_512_ != null && ((Class_xa_Sub1) this).anIntArrayArrayArray8460 == null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8460 = new int[anInt6287 * -506105871][anInt6286 * -1148794921][];
		((Class_xa_Sub1) this).anIntArrayArrayArray8462[i][i_511_] = is;
		((Class_xa_Sub1) this).anIntArrayArrayArray8458[i][i_511_] = is_513_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8483[i][i_511_] = is_515_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8461[i][i_511_] = is_516_;
		if (((Class_xa_Sub1) this).anIntArrayArrayArray8465 != null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8465[i][i_511_] = is_514_;
		if (((Class_xa_Sub1) this).anIntArrayArrayArray8460 != null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8460[i][i_511_] = is_512_;
		Class298_Sub16[] class298_sub16s = (((Class_xa_Sub1) this).aClass298_Sub16ArrayArrayArray8459[i][i_511_] = new Class298_Sub16[is_515_.length]);
		for (int i_519_ = 0; i_519_ < is_515_.length; i_519_++) {
			int i_520_ = is_517_[i_519_];
			int i_521_ = is_518_[i_519_];
			if ((((Class_xa_Sub1) this).anInt8482 & 0x20) != 0 && i_520_ != -1 && interface_ma.method174(i_520_, 831412301).aBoolean524) {
				i_521_ = 128;
				i_520_ = -1;
			}
			long l = ((long) (class78.anInt727 * -1475891183) << 48 | (long) (class78.anInt725 * 1996750669) << 42 | (long) (class78.anInt726 * -1212608691) << 28 | (long) (i_521_ << 14) | (long) i_520_);
			Linkable class298;
			for (class298 = ((Class_xa_Sub1) this).aClass440_8479.method5852(l); class298 != null; class298 = ((Class_xa_Sub1) this).aClass440_8479.method5853(-1980491334)) {
				Class298_Sub16 class298_sub16 = (Class298_Sub16) class298;
				if (((Class298_Sub16) class298_sub16).anInt7284 == i_520_ && (((Class298_Sub16) class298_sub16).aFloat7294 == (float) i_521_) && ((Class298_Sub16) class298_sub16).aClass78_7286.method843(class78, (byte) -64))
					break;
			}
			if (class298 == null) {
				class298_sub16s[i_519_] = new Class298_Sub16(this, i_520_, i_521_, class78);
				((Class_xa_Sub1) this).aClass440_8479.method5858(class298_sub16s[i_519_], l);
			} else
				class298_sub16s[i_519_] = (Class298_Sub16) class298;
		}
		if (bool)
			((Class_xa_Sub1) this).aByteArrayArray8469[i][i_511_] |= 0x1;
		if (is_515_.length > ((Class_xa_Sub1) this).anInt8474)
			((Class_xa_Sub1) this).anInt8474 = is_515_.length;
		((Class_xa_Sub1) this).anInt8473 += is_515_.length;
	}

	public void ak(Class_na class_na, int i, int i_522_, int i_523_, int i_524_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass169_8452 != null && class_na != null) {
			int i_525_ = (i - (i_522_ * (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8299) >> 8) >> ((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313);
			int i_526_ = (i_523_ - (i_522_ * (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).anInt8317) >> 8) >> ((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313);
			((Class_xa_Sub1) this).aClass169_8452.method1805(class_na, i_525_, i_526_);
		}
	}

	public boolean method6354(Class_na class_na, int i, int i_527_, int i_528_, int i_529_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass169_8452 == null || class_na == null)
			return false;
		int i_530_ = (i - (i_527_ * ((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).anInt8299 >> 8) >> (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313));
		int i_531_ = (i_528_ - (i_527_ * (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8317) >> 8) >> (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313));
		return ((Class_xa_Sub1) this).aClass169_8452.method1807(class_na, i_530_, i_531_);
	}

	public void LA(int i, int i_532_, int i_533_) {
		if ((((Class_xa_Sub1) this).aByteArrayArray8475[i][i_532_] & 0xff) < i_533_)
			((Class_xa_Sub1) this).aByteArrayArray8475[i][i_532_] = (byte) i_533_;
	}

	public void ad(Class_na class_na, int i, int i_534_, int i_535_, int i_536_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass169_8452 != null && class_na != null) {
			int i_537_ = (i - (i_534_ * (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8299) >> 8) >> ((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313);
			int i_538_ = (i_535_ - (i_534_ * (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).anInt8317) >> 8) >> ((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313);
			((Class_xa_Sub1) this).aClass169_8452.method1801(class_na, i_537_, i_538_);
		}
	}

	public void av(Class_na class_na, int i, int i_539_, int i_540_, int i_541_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass169_8452 != null && class_na != null) {
			int i_542_ = (i - (i_539_ * (((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8299) >> 8) >> ((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313);
			int i_543_ = (i_540_ - (i_539_ * (((Class_ra_Sub3) (((Class_xa_Sub1) this).aClass_ra_Sub3_8467)).anInt8317) >> 8) >> ((Class_ra_Sub3) ((Class_xa_Sub1) this).aClass_ra_Sub3_8467).anInt8313);
			((Class_xa_Sub1) this).aClass169_8452.method1801(class_na, i_542_, i_543_);
		}
	}

	public void at(int i, int i_544_, int i_545_) {
		if ((((Class_xa_Sub1) this).aByteArrayArray8475[i][i_544_] & 0xff) < i_545_)
			((Class_xa_Sub1) this).aByteArrayArray8475[i][i_544_] = (byte) i_545_;
	}

	public void method6344(Class298_Sub10 class298_sub10, int[] is) {
		((Class_xa_Sub1) this).aClass458_8468.method5968(new Class298_Sub18(((Class_xa_Sub1) this).aClass_ra_Sub3_8467, this, class298_sub10, is), 1474142040);
	}

	public void method6358(Class298_Sub10 class298_sub10, int[] is) {
		((Class_xa_Sub1) this).aClass458_8468.method5968(new Class298_Sub18(((Class_xa_Sub1) this).aClass_ra_Sub3_8467, this, class298_sub10, is), 2119427070);
	}
}
