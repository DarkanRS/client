/* Class247 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class247 {
	NativeSprite aClass160_3030;
	int anInt3031;
	int anInt3032 = 2109950169;
	Class334 aClass334_3033;
	int anInt3034;
	Class334[] aClass334Array3035;
	int anInt3036;
	byte[] aByteArray3037;
	int anInt3038;
	int anInt3039;
	int anInt3040;
	static final int anInt3041 = 512;
	boolean aBool3042;
	int anInt3043;
	int anInt3044;
	boolean aBool3045 = true;
	static Interface22 anInterface22_3046;
	int anInt3047;
	MeshRasterizer aClass528_3048;
	Class334[] aClass334Array3049;
	Class204 aClass204_3050;
	Class247 aClass247_3051;
	int anInt3052;
	int anInt3053;
	int anInt3054;

	void method4206(GraphicalRenderer class505, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, boolean bool_8_, int i_9_, byte i_10_) {
		int i_11_ = 255 - i_9_;
		if (((Class247) this).aClass528_3048 == null) {
			class505.ba(2, 0);
			i_5_ = i + i_5_ & 0x3fff;
			if (-1 != ((Class247) this).anInt3031 * -224273715 && ((Class247) this).anInt3034 * 1403346971 != 0) {
				Class169 class169 = anInterface22_3046.method144((-224273715 * (((Class247) this).anInt3031)), -1768391150);
				if (null == ((Class247) this).aClass160_3030 && anInterface22_3046.method139((((Class247) this).anInt3031) * -224273715, -408857237)) {
					int[] is = (class169.anInt2074 * 1960017665 == 2 ? (anInterface22_3046.method141(((Class247) this).anInt3031 * -224273715, 0.7F, 1403346971 * ((Class247) this).anInt3034, ((Class247) this).anInt3034 * 1403346971, false, -1509054197)) : (anInterface22_3046.method140(-224273715 * ((Class247) this).anInt3031, 0.7F, 1403346971 * ((Class247) this).anInt3034, ((Class247) this).anInt3034 * 1403346971, false, (byte) 127)));
					((Class247) this).anInt3053 = is[0] * 207419167;
					((Class247) this).anInt3044 = -1059388863 * is[is.length - 1];
					((Class247) this).aClass160_3030 = (class505.createNativeSprite(is, 0, 1403346971 * ((Class247) this).anInt3034, ((Class247) this).anInt3034 * 1403346971, 1403346971 * ((Class247) this).anInt3034, 1367570399));
				}
				int i_12_ = (255 == i_11_ ? class169.anInt2074 * 1960017665 == 2 ? 1 : 0 : 1);
				if (i_12_ == 1 && bool)
					class505.B(i_0_, i_1_, i_2_, i_3_, i_7_, 0);
				if (null != ((Class247) this).aClass160_3030) {
					int i_13_ = i_4_ * i_3_ / -4096;
					int i_14_;
					for (i_14_ = i_5_ * i_3_ / 4096 + (i_2_ - i_3_) / 2; i_14_ > i_3_; i_14_ -= i_3_) {
						/* empty */
					}
					for (/**/; i_14_ < 0; i_14_ += i_3_) {
						/* empty */
					}
					if (Class204.aClass204_2578 == ((Class247) this).aClass204_3050) {
						for (int i_15_ = i_14_ - i_3_; i_15_ < i_2_; i_15_ += i_3_)
							((Class247) this).aClass160_3030.method2754(i_15_ + i_0_, i_13_ + i_1_, i_3_, i_3_, 0, i_11_ << 24 | 0xffffff, i_12_);
						if ((((Class247) this).anInt3053 * 219137247 & ~0xffffff) != 0)
							class505.method8425(0, 0, i_2_, i_1_ + i_13_ + 1, (((Class247) this).anInt3053 * 219137247), (byte) -82);
						if ((1581649345 * ((Class247) this).anInt3044 & ~0xffffff) != 0)
							class505.method8425(0, i_3_ + (i_13_ + i_1_), i_2_, i_3_ - (i_1_ + i_13_ + i_3_), 1581649345 * (((Class247) this).anInt3044), (byte) -94);
					} else {
						for (/**/; i_13_ > i_3_; i_13_ -= i_3_) {
							/* empty */
						}
						for (/**/; i_13_ < 0; i_13_ += i_3_) {
							/* empty */
						}
						for (int i_16_ = i_14_ - i_3_; i_16_ < i_2_; i_16_ += i_3_) {
							for (int i_17_ = i_13_ - i_3_; i_17_ < i_3_; i_17_ += i_3_)
								((Class247) this).aClass160_3030.method2754(i_0_ + i_16_, i_1_ + i_17_, i_3_, i_3_, 0, i_11_ << 24 | 0xffffff, i_12_);
						}
					}
				}
			} else
				class505.B(i_0_, i_1_, i_2_, i_3_, i_11_ << 24 | i_7_, 1);
		} else if (bool_8_) {
			Class384 class384 = class505.method8453();
			Class384 class384_18_ = class505.method8453();
			class384.aFloatArray4667[2] = class384.aFloatArray4667[3];
			class384.aFloatArray4667[6] = class384.aFloatArray4667[7];
			class384.aFloatArray4667[10] = class384.aFloatArray4667[11];
			class384.aFloatArray4667[14] = class384.aFloatArray4667[15];
			class505.method8424(class384);
			method4231(class505, i_4_, i_5_, i_6_, i_9_, 1009070761);
			class505.method8424(class384_18_);
		} else {
			if (bool)
				class505.ba(3, i_7_);
			method4231(class505, i_4_, i_5_, i_6_, i_9_, 1808967350);
		}
		for (int i_19_ = ((Class247) this).anInt3043 * 238612959 - 1; i_19_ >= 0; i_19_--)
			((Class247) this).aClass334Array3035[i_19_].method5955(class505, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, -1553248551 * ((Class247) this).anInt3038, ((Class247) this).anInt3039 * 1144064127, 133739471 * ((Class247) this).anInt3040, i_11_);
		class505.ba(2, 0);
	}

	public void method4207(int i, int i_20_, int i_21_) {
		if (((Class247) this).aBool3042) {
			/* empty */
		}
		((Class247) this).anInt3052 = ((i_20_ - 453225409 * ((Class247) this).anInt3054) * i / 255 + 453225409 * ((Class247) this).anInt3054) * 1264087833;
	}

	public void method4208(Class247 class247_22_, int i) {
		if (((Class247) this).aBool3042)
			((Class247) this).anInt3054 = 883525481 * ((Class247) this).anInt3052;
		else if (class247_22_ != null && ((Class247) class247_22_).aBool3042)
			((Class247) this).anInt3054 = -555098945 - ((Class247) class247_22_).anInt3052 * 883525481;
		else
			((Class247) this).anInt3054 = 0;
		((Class247) this).aBool3042 = true;
		((Class247) this).aClass247_3051 = class247_22_;
		((Class247) this).anInt3052 = 0;
	}

	public void method4209(int i) {
		((Class247) this).aBool3042 = false;
		((Class247) this).aClass247_3051 = null;
		((Class247) this).anInt3052 = 0;
	}

	public boolean method4210(short i) {
		return ((Class247) this).aBool3042;
	}

	public Class247 method4211(byte i) {
		return ((Class247) this).aClass247_3051;
	}

	public static void method4212() {
		Class334.method5940();
	}

	public static void method4213(Index class317, Interface22 interface22) {
		Class282_Sub50_Sub11_Sub1.aClass317_10379 = class317;
		anInterface22_3046 = interface22;
	}

	public void method4214(GraphicalRenderer class505, int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_) {
		method4215(class505, i, i_23_, i_24_, i_25_, i_26_, i_27_, i_28_, 0, i_30_, true, false, (byte) 14);
	}

	public void method4215(GraphicalRenderer class505, int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, boolean bool, boolean bool_40_, byte i_41_) {
		int i_42_ = 0;
		if (((Class247) this).aBool3042)
			i_42_ = ((Class247) this).anInt3052 * -1703069399;
		if (null != ((Class247) this).aClass247_3051) {
			Class247 class247_43_ = this;
			Class247 class247_44_ = ((Class247) this).aClass247_3051;
			if (class247_43_.hashCode() > class247_44_.hashCode()) {
				class247_43_ = ((Class247) this).aClass247_3051;
				class247_44_ = this;
				i_42_ = 255 - i_42_;
			}
			class247_43_.method4206(class505, i, i_32_, i_33_, i_34_, i_35_, i_36_, i_37_, i_38_, i_39_, bool, bool_40_, i_42_, (byte) -85);
			class247_44_.method4206(class505, i, i_32_, i_33_, i_34_, i_35_, i_36_, i_37_, i_38_, i_39_, false, bool_40_, 255 - i_42_, (byte) -6);
		} else
			method4206(class505, i, i_32_, i_33_, i_34_, i_35_, i_36_, i_37_, i_38_, i_39_, bool, bool_40_, i_42_, (byte) -95);
	}

	public boolean method4216() {
		return ((Class247) this).aBool3042;
	}

	public boolean method4217(GraphicalRenderer class505, int i, int i_45_, int i_46_) {
		if (1678461079 * ((Class247) this).anInt3032 != i) {
			((Class247) this).anInt3032 = i * -2109950169;
			int i_47_ = Class51.method1072(i, 1659000710);
			if (i_47_ > 512)
				i_47_ = 512;
			if (i_47_ <= 0)
				i_47_ = 1;
			if (i_47_ != 1403346971 * ((Class247) this).anInt3034) {
				((Class247) this).anInt3034 = i_47_ * -1852343789;
				((Class247) this).aClass160_3030 = null;
			}
			if (null != ((Class247) this).aClass334Array3049) {
				((Class247) this).anInt3043 = 0;
				int[] is = new int[((Class247) this).aClass334Array3049.length];
				for (int i_48_ = 0; i_48_ < ((Class247) this).aClass334Array3049.length; i_48_++) {
					Class334 class334 = ((Class247) this).aClass334Array3049[i_48_];
					if (class334.method5938(-1553248551 * ((Class247) this).anInt3038, ((Class247) this).anInt3039 * 1144064127, 133739471 * ((Class247) this).anInt3040, ((Class247) this).anInt3032 * 1678461079)) {
						is[((Class247) this).anInt3043 * 238612959] = ((Class334) class334).anInt3897;
						((Class247) this).aClass334Array3035[((((Class247) this).anInt3043 += 928516639) * 238612959) - 1] = class334;
					}
				}
				Class51.method1074(is, ((Class247) this).aClass334Array3035, 0, 238612959 * ((Class247) this).anInt3043 - 1, -377919121);
			}
			((Class247) this).aBool3045 = true;
		}
		boolean bool = false;
		if (((Class247) this).aBool3045) {
			((Class247) this).aBool3045 = false;
			for (int i_49_ = 238612959 * ((Class247) this).anInt3043 - 1; i_49_ >= 0; i_49_--) {
				boolean bool_50_ = (((Class247) this).aClass334Array3035[i_49_].method5937(class505, ((Class247) this).aClass334_3033));
				Class247 class247_51_ = this;
				((Class247) class247_51_).aBool3045 = ((Class247) class247_51_).aBool3045 | !bool_50_;
				bool |= bool_50_;
			}
		}
		if (i_45_ == 0 || !class505.method8404())
			((Class247) this).aClass528_3048 = null;
		else if (((Class247) this).aClass528_3048 == null && ((Class247) this).anInt3047 * 565265759 >= 0)
			method4229(class505, (byte) 24);
		if (((Class247) this).aClass247_3051 != null && this != ((Class247) this).aClass247_3051) {
			((Class247) this).aClass247_3051.method4209(202966170);
			bool |= ((Class247) this).aClass247_3051.method4217(class505, i, i_45_, -1133830850);
		}
		return bool;
	}

	public boolean method4218(GraphicalRenderer class505, int i, int i_52_) {
		if (1678461079 * ((Class247) this).anInt3032 != i) {
			((Class247) this).anInt3032 = i * -2109950169;
			int i_53_ = Class51.method1072(i, 1227517211);
			if (i_53_ > 512)
				i_53_ = 512;
			if (i_53_ <= 0)
				i_53_ = 1;
			if (i_53_ != 1403346971 * ((Class247) this).anInt3034) {
				((Class247) this).anInt3034 = i_53_ * -1852343789;
				((Class247) this).aClass160_3030 = null;
			}
			if (null != ((Class247) this).aClass334Array3049) {
				((Class247) this).anInt3043 = 0;
				int[] is = new int[((Class247) this).aClass334Array3049.length];
				for (int i_54_ = 0; i_54_ < ((Class247) this).aClass334Array3049.length; i_54_++) {
					Class334 class334 = ((Class247) this).aClass334Array3049[i_54_];
					if (class334.method5938(-1553248551 * ((Class247) this).anInt3038, ((Class247) this).anInt3039 * 1144064127, 133739471 * ((Class247) this).anInt3040, ((Class247) this).anInt3032 * 1678461079)) {
						is[((Class247) this).anInt3043 * 238612959] = ((Class334) class334).anInt3897;
						((Class247) this).aClass334Array3035[((((Class247) this).anInt3043 += 928516639) * 238612959) - 1] = class334;
					}
				}
				Class51.method1074(is, ((Class247) this).aClass334Array3035, 0, 238612959 * ((Class247) this).anInt3043 - 1, 553075137);
			}
			((Class247) this).aBool3045 = true;
		}
		boolean bool = false;
		if (((Class247) this).aBool3045) {
			((Class247) this).aBool3045 = false;
			for (int i_55_ = 238612959 * ((Class247) this).anInt3043 - 1; i_55_ >= 0; i_55_--) {
				boolean bool_56_ = (((Class247) this).aClass334Array3035[i_55_].method5937(class505, ((Class247) this).aClass334_3033));
				Class247 class247_57_ = this;
				((Class247) class247_57_).aBool3045 = ((Class247) class247_57_).aBool3045 | !bool_56_;
				bool |= bool_56_;
			}
		}
		if (i_52_ == 0 || !class505.method8404())
			((Class247) this).aClass528_3048 = null;
		else if (((Class247) this).aClass528_3048 == null && ((Class247) this).anInt3047 * 565265759 >= 0)
			method4229(class505, (byte) 71);
		if (((Class247) this).aClass247_3051 != null && this != ((Class247) this).aClass247_3051) {
			((Class247) this).aClass247_3051.method4209(202966170);
			bool |= ((Class247) this).aClass247_3051.method4217(class505, i, i_52_, -1133830850);
		}
		return bool;
	}

	public static void method4219() {
		Class334.method5940();
	}

	public static void method4220() {
		Class334.method5940();
	}

	void method4221(GraphicalRenderer class505, int i, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, boolean bool, boolean bool_66_, int i_67_) {
		int i_68_ = 255 - i_67_;
		if (((Class247) this).aClass528_3048 == null) {
			class505.ba(2, 0);
			i_63_ = i + i_63_ & 0x3fff;
			if (-1 != ((Class247) this).anInt3031 * -224273715 && ((Class247) this).anInt3034 * 1403346971 != 0) {
				Class169 class169 = anInterface22_3046.method144((-224273715 * (((Class247) this).anInt3031)), -2094812357);
				if (null == ((Class247) this).aClass160_3030 && anInterface22_3046.method139((((Class247) this).anInt3031) * -224273715, -1068754048)) {
					int[] is = (class169.anInt2074 * 1960017665 == 2 ? (anInterface22_3046.method141(((Class247) this).anInt3031 * -224273715, 0.7F, 1403346971 * ((Class247) this).anInt3034, ((Class247) this).anInt3034 * 1403346971, false, -611075687)) : (anInterface22_3046.method140(-224273715 * ((Class247) this).anInt3031, 0.7F, 1403346971 * ((Class247) this).anInt3034, ((Class247) this).anInt3034 * 1403346971, false, (byte) 52)));
					((Class247) this).anInt3053 = is[0] * 207419167;
					((Class247) this).anInt3044 = -1059388863 * is[is.length - 1];
					((Class247) this).aClass160_3030 = (class505.createNativeSprite(is, 0, 1403346971 * ((Class247) this).anInt3034, ((Class247) this).anInt3034 * 1403346971, 1403346971 * ((Class247) this).anInt3034, 1107451088));
				}
				int i_69_ = (255 == i_68_ ? class169.anInt2074 * 1960017665 == 2 ? 1 : 0 : 1);
				if (i_69_ == 1 && bool)
					class505.B(i_58_, i_59_, i_60_, i_61_, i_65_, 0);
				if (null != ((Class247) this).aClass160_3030) {
					int i_70_ = i_62_ * i_61_ / -4096;
					int i_71_;
					for (i_71_ = i_63_ * i_61_ / 4096 + (i_60_ - i_61_) / 2; i_71_ > i_61_; i_71_ -= i_61_) {
						/* empty */
					}
					for (/**/; i_71_ < 0; i_71_ += i_61_) {
						/* empty */
					}
					if (Class204.aClass204_2578 == ((Class247) this).aClass204_3050) {
						for (int i_72_ = i_71_ - i_61_; i_72_ < i_60_; i_72_ += i_61_)
							((Class247) this).aClass160_3030.method2754(i_72_ + i_58_, i_70_ + i_59_, i_61_, i_61_, 0, i_68_ << 24 | 0xffffff, i_69_);
						if ((((Class247) this).anInt3053 * 219137247 & ~0xffffff) != 0)
							class505.method8425(0, 0, i_60_, i_59_ + i_70_ + 1, (((Class247) this).anInt3053 * 219137247), (byte) -53);
						if ((1581649345 * ((Class247) this).anInt3044 & ~0xffffff) != 0)
							class505.method8425(0, i_61_ + (i_70_ + i_59_), i_60_, i_61_ - (i_59_ + i_70_ + i_61_), 1581649345 * (((Class247) this).anInt3044), (byte) -109);
					} else {
						for (/**/; i_70_ > i_61_; i_70_ -= i_61_) {
							/* empty */
						}
						for (/**/; i_70_ < 0; i_70_ += i_61_) {
							/* empty */
						}
						for (int i_73_ = i_71_ - i_61_; i_73_ < i_60_; i_73_ += i_61_) {
							for (int i_74_ = i_70_ - i_61_; i_74_ < i_61_; i_74_ += i_61_)
								((Class247) this).aClass160_3030.method2754(i_58_ + i_73_, i_59_ + i_74_, i_61_, i_61_, 0, i_68_ << 24 | 0xffffff, i_69_);
						}
					}
				}
			} else
				class505.B(i_58_, i_59_, i_60_, i_61_, i_68_ << 24 | i_65_, 1);
		} else if (bool_66_) {
			Class384 class384 = class505.method8453();
			Class384 class384_75_ = class505.method8453();
			class384.aFloatArray4667[2] = class384.aFloatArray4667[3];
			class384.aFloatArray4667[6] = class384.aFloatArray4667[7];
			class384.aFloatArray4667[10] = class384.aFloatArray4667[11];
			class384.aFloatArray4667[14] = class384.aFloatArray4667[15];
			class505.method8424(class384);
			method4231(class505, i_62_, i_63_, i_64_, i_67_, 1479122101);
			class505.method8424(class384_75_);
		} else {
			if (bool)
				class505.ba(3, i_65_);
			method4231(class505, i_62_, i_63_, i_64_, i_67_, 308009828);
		}
		for (int i_76_ = ((Class247) this).anInt3043 * 238612959 - 1; i_76_ >= 0; i_76_--)
			((Class247) this).aClass334Array3035[i_76_].method5955(class505, i_58_, i_59_, i_60_, i_61_, i_62_, i_63_, -1553248551 * ((Class247) this).anInt3038, ((Class247) this).anInt3039 * 1144064127, 133739471 * ((Class247) this).anInt3040, i_68_);
		class505.ba(2, 0);
	}

	public void method4222(int i, int i_77_) {
		if (((Class247) this).aBool3042) {
			/* empty */
		}
		((Class247) this).anInt3052 = ((i_77_ - 453225409 * ((Class247) this).anInt3054) * i / 255 + 453225409 * ((Class247) this).anInt3054) * 1264087833;
	}

	public void method4223(Class247 class247_78_) {
		if (((Class247) this).aBool3042)
			((Class247) this).anInt3054 = 883525481 * ((Class247) this).anInt3052;
		else if (class247_78_ != null && ((Class247) class247_78_).aBool3042)
			((Class247) this).anInt3054 = -555098945 - ((Class247) class247_78_).anInt3052 * 883525481;
		else
			((Class247) this).anInt3054 = 0;
		((Class247) this).aBool3042 = true;
		((Class247) this).aClass247_3051 = class247_78_;
		((Class247) this).anInt3052 = 0;
	}

	public void method4224(Class247 class247_79_) {
		if (((Class247) this).aBool3042)
			((Class247) this).anInt3054 = 883525481 * ((Class247) this).anInt3052;
		else if (class247_79_ != null && ((Class247) class247_79_).aBool3042)
			((Class247) this).anInt3054 = -555098945 - ((Class247) class247_79_).anInt3052 * 883525481;
		else
			((Class247) this).anInt3054 = 0;
		((Class247) this).aBool3042 = true;
		((Class247) this).aClass247_3051 = class247_79_;
		((Class247) this).anInt3052 = 0;
	}

	public void method4225(Class247 class247_80_) {
		if (((Class247) this).aBool3042)
			((Class247) this).anInt3054 = 883525481 * ((Class247) this).anInt3052;
		else if (class247_80_ != null && ((Class247) class247_80_).aBool3042)
			((Class247) this).anInt3054 = -555098945 - ((Class247) class247_80_).anInt3052 * 883525481;
		else
			((Class247) this).anInt3054 = 0;
		((Class247) this).aBool3042 = true;
		((Class247) this).aClass247_3051 = class247_80_;
		((Class247) this).anInt3052 = 0;
	}

	public void method4226(Class247 class247_81_) {
		if (((Class247) this).aBool3042)
			((Class247) this).anInt3054 = 883525481 * ((Class247) this).anInt3052;
		else if (class247_81_ != null && ((Class247) class247_81_).aBool3042)
			((Class247) this).anInt3054 = -555098945 - ((Class247) class247_81_).anInt3052 * 883525481;
		else
			((Class247) this).anInt3054 = 0;
		((Class247) this).aBool3042 = true;
		((Class247) this).aClass247_3051 = class247_81_;
		((Class247) this).anInt3052 = 0;
	}

	public void method4227() {
		((Class247) this).aBool3042 = false;
		((Class247) this).aClass247_3051 = null;
		((Class247) this).anInt3052 = 0;
	}

	public void method4228() {
		((Class247) this).aBool3042 = false;
		((Class247) this).aClass247_3051 = null;
		((Class247) this).anInt3052 = 0;
	}

	void method4229(GraphicalRenderer class505, byte i) {
		try {
			boolean bool = (Class282_Sub50_Sub11_Sub1.aClass317_10379.method5647(565265759 * ((Class247) this).anInt3047, -2119577317));
			if (bool) {
				class505.m(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				RSMesh class157 = RSMesh.decodeMesh((Class282_Sub50_Sub11_Sub1.aClass317_10379), (((Class247) this).anInt3047 * 565265759), 0);
				((Class247) this).aClass528_3048 = class505.createMeshRasterizer(class157, 1099776, 0, 255, 1);
				byte[] is = ((Class247) this).aClass528_3048.aw();
				if (is == null)
					((Class247) this).aByteArray3037 = null;
				else {
					((Class247) this).aByteArray3037 = new byte[is.length];
					System.arraycopy(is, 0, ((Class247) this).aByteArray3037, 0, is.length);
				}
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	public void method4230() {
		((Class247) this).aBool3042 = false;
		((Class247) this).aClass247_3051 = null;
		((Class247) this).anInt3052 = 0;
	}

	void method4231(GraphicalRenderer class505, int i, int i_82_, int i_83_, int i_84_, int i_85_) {
		Class294 class294 = class505.method8458();
		Class294 class294_86_ = new Class294();
		class294_86_.method5223(0.0F, 0.0F, 0.0F);
		class294_86_.method5220(0.0F, -1.0F, 0.0F, Class382.method6508(-i_82_ & 0x3fff));
		class294_86_.method5220(-1.0F, 0.0F, 0.0F, Class382.method6508(-i & 0x3fff));
		class294_86_.method5220(0.0F, 0.0F, -1.0F, Class382.method6508(-i_83_ & 0x3fff));
		class505.method8457(class294_86_);
		Class294 class294_87_ = new Class294();
		if (i_84_ != ((Class247) this).anInt3036 * -510157735) {
			((Class247) this).aClass528_3048.method11312((byte) i_84_, ((Class247) this).aByteArray3037);
			((Class247) this).anInt3036 = i_84_ * -1329206295;
		}
		((Class247) this).aClass528_3048.method11282(class294_87_, null, 0);
		class505.method8457(class294);
	}

	public boolean method4232() {
		return ((Class247) this).aBool3042;
	}

	void method4233(GraphicalRenderer class505) {
		try {
			boolean bool = (Class282_Sub50_Sub11_Sub1.aClass317_10379.method5647(565265759 * ((Class247) this).anInt3047, -2119577317));
			if (bool) {
				class505.m(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				RSMesh class157 = RSMesh.decodeMesh((Class282_Sub50_Sub11_Sub1.aClass317_10379), (((Class247) this).anInt3047 * 565265759), 0);
				((Class247) this).aClass528_3048 = class505.createMeshRasterizer(class157, 1099776, 0, 255, 1);
				byte[] is = ((Class247) this).aClass528_3048.aw();
				if (is == null)
					((Class247) this).aByteArray3037 = null;
				else {
					((Class247) this).aByteArray3037 = new byte[is.length];
					System.arraycopy(is, 0, ((Class247) this).aByteArray3037, 0, is.length);
				}
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	public Class247 method4234() {
		return ((Class247) this).aClass247_3051;
	}

	void method4235(GraphicalRenderer class505, int i, int i_88_, int i_89_, int i_90_) {
		Class294 class294 = class505.method8458();
		Class294 class294_91_ = new Class294();
		class294_91_.method5223(0.0F, 0.0F, 0.0F);
		class294_91_.method5220(0.0F, -1.0F, 0.0F, Class382.method6508(-i_88_ & 0x3fff));
		class294_91_.method5220(-1.0F, 0.0F, 0.0F, Class382.method6508(-i & 0x3fff));
		class294_91_.method5220(0.0F, 0.0F, -1.0F, Class382.method6508(-i_89_ & 0x3fff));
		class505.method8457(class294_91_);
		Class294 class294_92_ = new Class294();
		if (i_90_ != ((Class247) this).anInt3036 * -510157735) {
			((Class247) this).aClass528_3048.method11312((byte) i_90_, ((Class247) this).aByteArray3037);
			((Class247) this).anInt3036 = i_90_ * -1329206295;
		}
		((Class247) this).aClass528_3048.method11282(class294_92_, null, 0);
		class505.method8457(class294);
	}

	public boolean method4236(GraphicalRenderer class505, int i, int i_93_) {
		if (1678461079 * ((Class247) this).anInt3032 != i) {
			((Class247) this).anInt3032 = i * -2109950169;
			int i_94_ = Class51.method1072(i, 1725261377);
			if (i_94_ > 512)
				i_94_ = 512;
			if (i_94_ <= 0)
				i_94_ = 1;
			if (i_94_ != 1403346971 * ((Class247) this).anInt3034) {
				((Class247) this).anInt3034 = i_94_ * -1852343789;
				((Class247) this).aClass160_3030 = null;
			}
			if (null != ((Class247) this).aClass334Array3049) {
				((Class247) this).anInt3043 = 0;
				int[] is = new int[((Class247) this).aClass334Array3049.length];
				for (int i_95_ = 0; i_95_ < ((Class247) this).aClass334Array3049.length; i_95_++) {
					Class334 class334 = ((Class247) this).aClass334Array3049[i_95_];
					if (class334.method5938(-1553248551 * ((Class247) this).anInt3038, ((Class247) this).anInt3039 * 1144064127, 133739471 * ((Class247) this).anInt3040, ((Class247) this).anInt3032 * 1678461079)) {
						is[((Class247) this).anInt3043 * 238612959] = ((Class334) class334).anInt3897;
						((Class247) this).aClass334Array3035[((((Class247) this).anInt3043 += 928516639) * 238612959) - 1] = class334;
					}
				}
				Class51.method1074(is, ((Class247) this).aClass334Array3035, 0, 238612959 * ((Class247) this).anInt3043 - 1, -977590173);
			}
			((Class247) this).aBool3045 = true;
		}
		boolean bool = false;
		if (((Class247) this).aBool3045) {
			((Class247) this).aBool3045 = false;
			for (int i_96_ = 238612959 * ((Class247) this).anInt3043 - 1; i_96_ >= 0; i_96_--) {
				boolean bool_97_ = (((Class247) this).aClass334Array3035[i_96_].method5937(class505, ((Class247) this).aClass334_3033));
				Class247 class247_98_ = this;
				((Class247) class247_98_).aBool3045 = ((Class247) class247_98_).aBool3045 | !bool_97_;
				bool |= bool_97_;
			}
		}
		if (i_93_ == 0 || !class505.method8404())
			((Class247) this).aClass528_3048 = null;
		else if (((Class247) this).aClass528_3048 == null && ((Class247) this).anInt3047 * 565265759 >= 0)
			method4229(class505, (byte) 103);
		if (((Class247) this).aClass247_3051 != null && this != ((Class247) this).aClass247_3051) {
			((Class247) this).aClass247_3051.method4209(202966170);
			bool |= ((Class247) this).aClass247_3051.method4217(class505, i, i_93_, -1133830850);
		}
		return bool;
	}

	public boolean method4237(GraphicalRenderer class505, int i, int i_99_) {
		if (1678461079 * ((Class247) this).anInt3032 != i) {
			((Class247) this).anInt3032 = i * -2109950169;
			int i_100_ = Class51.method1072(i, 1348460893);
			if (i_100_ > 512)
				i_100_ = 512;
			if (i_100_ <= 0)
				i_100_ = 1;
			if (i_100_ != 1403346971 * ((Class247) this).anInt3034) {
				((Class247) this).anInt3034 = i_100_ * -1852343789;
				((Class247) this).aClass160_3030 = null;
			}
			if (null != ((Class247) this).aClass334Array3049) {
				((Class247) this).anInt3043 = 0;
				int[] is = new int[((Class247) this).aClass334Array3049.length];
				for (int i_101_ = 0; i_101_ < ((Class247) this).aClass334Array3049.length; i_101_++) {
					Class334 class334 = ((Class247) this).aClass334Array3049[i_101_];
					if (class334.method5938(-1553248551 * ((Class247) this).anInt3038, ((Class247) this).anInt3039 * 1144064127, 133739471 * ((Class247) this).anInt3040, ((Class247) this).anInt3032 * 1678461079)) {
						is[((Class247) this).anInt3043 * 238612959] = ((Class334) class334).anInt3897;
						((Class247) this).aClass334Array3035[((((Class247) this).anInt3043 += 928516639) * 238612959) - 1] = class334;
					}
				}
				Class51.method1074(is, ((Class247) this).aClass334Array3035, 0, 238612959 * ((Class247) this).anInt3043 - 1, -1225081345);
			}
			((Class247) this).aBool3045 = true;
		}
		boolean bool = false;
		if (((Class247) this).aBool3045) {
			((Class247) this).aBool3045 = false;
			for (int i_102_ = 238612959 * ((Class247) this).anInt3043 - 1; i_102_ >= 0; i_102_--) {
				boolean bool_103_ = (((Class247) this).aClass334Array3035[i_102_].method5937(class505, ((Class247) this).aClass334_3033));
				Class247 class247_104_ = this;
				((Class247) class247_104_).aBool3045 = ((Class247) class247_104_).aBool3045 | !bool_103_;
				bool |= bool_103_;
			}
		}
		if (i_99_ == 0 || !class505.method8404())
			((Class247) this).aClass528_3048 = null;
		else if (((Class247) this).aClass528_3048 == null && ((Class247) this).anInt3047 * 565265759 >= 0)
			method4229(class505, (byte) 97);
		if (((Class247) this).aClass247_3051 != null && this != ((Class247) this).aClass247_3051) {
			((Class247) this).aClass247_3051.method4209(202966170);
			bool |= ((Class247) this).aClass247_3051.method4217(class505, i, i_99_, -1133830850);
		}
		return bool;
	}

	public void method4238() {
		((Class247) this).aBool3042 = false;
		((Class247) this).aClass247_3051 = null;
		((Class247) this).anInt3052 = 0;
	}

	void method4239(GraphicalRenderer class505) {
		try {
			boolean bool = (Class282_Sub50_Sub11_Sub1.aClass317_10379.method5647(565265759 * ((Class247) this).anInt3047, -2119577317));
			if (bool) {
				class505.m(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				RSMesh class157 = RSMesh.decodeMesh((Class282_Sub50_Sub11_Sub1.aClass317_10379), (((Class247) this).anInt3047 * 565265759), 0);
				((Class247) this).aClass528_3048 = class505.createMeshRasterizer(class157, 1099776, 0, 255, 1);
				byte[] is = ((Class247) this).aClass528_3048.aw();
				if (is == null)
					((Class247) this).aByteArray3037 = null;
				else {
					((Class247) this).aByteArray3037 = new byte[is.length];
					System.arraycopy(is, 0, ((Class247) this).aByteArray3037, 0, is.length);
				}
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	public void method4240(GraphicalRenderer class505, int i, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_) {
		method4215(class505, i, i_105_, i_106_, i_107_, i_108_, i_109_, i_110_, 0, i_112_, true, false, (byte) 14);
	}

	public void method4241(GraphicalRenderer class505, int i, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, boolean bool, boolean bool_121_) {
		int i_122_ = 0;
		if (((Class247) this).aBool3042)
			i_122_ = ((Class247) this).anInt3052 * -1703069399;
		if (null != ((Class247) this).aClass247_3051) {
			Class247 class247_123_ = this;
			Class247 class247_124_ = ((Class247) this).aClass247_3051;
			if (class247_123_.hashCode() > class247_124_.hashCode()) {
				class247_123_ = ((Class247) this).aClass247_3051;
				class247_124_ = this;
				i_122_ = 255 - i_122_;
			}
			class247_123_.method4206(class505, i, i_113_, i_114_, i_115_, i_116_, i_117_, i_118_, i_119_, i_120_, bool, bool_121_, i_122_, (byte) -45);
			class247_124_.method4206(class505, i, i_113_, i_114_, i_115_, i_116_, i_117_, i_118_, i_119_, i_120_, false, bool_121_, 255 - i_122_, (byte) -75);
		} else
			method4206(class505, i, i_113_, i_114_, i_115_, i_116_, i_117_, i_118_, i_119_, i_120_, bool, bool_121_, i_122_, (byte) -79);
	}

	public Class247(int i, Class334[] class334s, int i_125_, int i_126_, int i_127_, int i_128_, Class204 class204, int i_129_) {
		((Class247) this).anInt3038 = i_126_ * 991580521;
		((Class247) this).anInt3039 = 1147582335 * i_127_;
		((Class247) this).anInt3040 = i_128_ * 1839166255;
		((Class247) this).anInt3031 = -1847221755 * i;
		((Class247) this).aClass334Array3049 = class334s;
		((Class247) this).aClass204_3050 = class204;
		if (null != class334s) {
			((Class247) this).aClass334Array3035 = new Class334[class334s.length];
			((Class247) this).aClass334_3033 = i_125_ >= 0 ? class334s[i_125_] : null;
		} else {
			((Class247) this).aClass334Array3035 = null;
			((Class247) this).aClass334_3033 = null;
		}
		((Class247) this).anInt3047 = i_129_ * 157832863;
	}

	public void method4242(GraphicalRenderer class505, int i, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_, boolean bool, boolean bool_138_) {
		int i_139_ = 0;
		if (((Class247) this).aBool3042)
			i_139_ = ((Class247) this).anInt3052 * -1703069399;
		if (null != ((Class247) this).aClass247_3051) {
			Class247 class247_140_ = this;
			Class247 class247_141_ = ((Class247) this).aClass247_3051;
			if (class247_140_.hashCode() > class247_141_.hashCode()) {
				class247_140_ = ((Class247) this).aClass247_3051;
				class247_141_ = this;
				i_139_ = 255 - i_139_;
			}
			class247_140_.method4206(class505, i, i_130_, i_131_, i_132_, i_133_, i_134_, i_135_, i_136_, i_137_, bool, bool_138_, i_139_, (byte) -115);
			class247_141_.method4206(class505, i, i_130_, i_131_, i_132_, i_133_, i_134_, i_135_, i_136_, i_137_, false, bool_138_, 255 - i_139_, (byte) -96);
		} else
			method4206(class505, i, i_130_, i_131_, i_132_, i_133_, i_134_, i_135_, i_136_, i_137_, bool, bool_138_, i_139_, (byte) -96);
	}

	public void method4243(GraphicalRenderer class505, int i, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, boolean bool, boolean bool_150_) {
		int i_151_ = 0;
		if (((Class247) this).aBool3042)
			i_151_ = ((Class247) this).anInt3052 * -1703069399;
		if (null != ((Class247) this).aClass247_3051) {
			Class247 class247_152_ = this;
			Class247 class247_153_ = ((Class247) this).aClass247_3051;
			if (class247_152_.hashCode() > class247_153_.hashCode()) {
				class247_152_ = ((Class247) this).aClass247_3051;
				class247_153_ = this;
				i_151_ = 255 - i_151_;
			}
			class247_152_.method4206(class505, i, i_142_, i_143_, i_144_, i_145_, i_146_, i_147_, i_148_, i_149_, bool, bool_150_, i_151_, (byte) -13);
			class247_153_.method4206(class505, i, i_142_, i_143_, i_144_, i_145_, i_146_, i_147_, i_148_, i_149_, false, bool_150_, 255 - i_151_, (byte) -22);
		} else
			method4206(class505, i, i_142_, i_143_, i_144_, i_145_, i_146_, i_147_, i_148_, i_149_, bool, bool_150_, i_151_, (byte) -92);
	}

	void method4244(GraphicalRenderer class505, int i, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_, boolean bool, boolean bool_162_, int i_163_) {
		int i_164_ = 255 - i_163_;
		if (((Class247) this).aClass528_3048 == null) {
			class505.ba(2, 0);
			i_159_ = i + i_159_ & 0x3fff;
			if (-1 != ((Class247) this).anInt3031 * -224273715 && ((Class247) this).anInt3034 * 1403346971 != 0) {
				Class169 class169 = anInterface22_3046.method144((-224273715 * (((Class247) this).anInt3031)), -1771425385);
				if (null == ((Class247) this).aClass160_3030 && anInterface22_3046.method139((((Class247) this).anInt3031) * -224273715, -1014090054)) {
					int[] is = (class169.anInt2074 * 1960017665 == 2 ? (anInterface22_3046.method141(((Class247) this).anInt3031 * -224273715, 0.7F, 1403346971 * ((Class247) this).anInt3034, ((Class247) this).anInt3034 * 1403346971, false, -148667756)) : (anInterface22_3046.method140(-224273715 * ((Class247) this).anInt3031, 0.7F, 1403346971 * ((Class247) this).anInt3034, ((Class247) this).anInt3034 * 1403346971, false, (byte) 41)));
					((Class247) this).anInt3053 = is[0] * 207419167;
					((Class247) this).anInt3044 = -1059388863 * is[is.length - 1];
					((Class247) this).aClass160_3030 = (class505.createNativeSprite(is, 0, 1403346971 * ((Class247) this).anInt3034, ((Class247) this).anInt3034 * 1403346971, 1403346971 * ((Class247) this).anInt3034, -283481415));
				}
				int i_165_ = (255 == i_164_ ? class169.anInt2074 * 1960017665 == 2 ? 1 : 0 : 1);
				if (i_165_ == 1 && bool)
					class505.B(i_154_, i_155_, i_156_, i_157_, i_161_, 0);
				if (null != ((Class247) this).aClass160_3030) {
					int i_166_ = i_158_ * i_157_ / -4096;
					int i_167_;
					for (i_167_ = i_159_ * i_157_ / 4096 + (i_156_ - i_157_) / 2; i_167_ > i_157_; i_167_ -= i_157_) {
						/* empty */
					}
					for (/**/; i_167_ < 0; i_167_ += i_157_) {
						/* empty */
					}
					if (Class204.aClass204_2578 == ((Class247) this).aClass204_3050) {
						for (int i_168_ = i_167_ - i_157_; i_168_ < i_156_; i_168_ += i_157_)
							((Class247) this).aClass160_3030.method2754(i_168_ + i_154_, i_166_ + i_155_, i_157_, i_157_, 0, i_164_ << 24 | 0xffffff, i_165_);
						if ((((Class247) this).anInt3053 * 219137247 & ~0xffffff) != 0)
							class505.method8425(0, 0, i_156_, i_155_ + i_166_ + 1, (((Class247) this).anInt3053 * 219137247), (byte) -89);
						if ((1581649345 * ((Class247) this).anInt3044 & ~0xffffff) != 0)
							class505.method8425(0, i_157_ + (i_166_ + i_155_), i_156_, i_157_ - (i_155_ + i_166_ + i_157_), 1581649345 * (((Class247) this).anInt3044), (byte) -15);
					} else {
						for (/**/; i_166_ > i_157_; i_166_ -= i_157_) {
							/* empty */
						}
						for (/**/; i_166_ < 0; i_166_ += i_157_) {
							/* empty */
						}
						for (int i_169_ = i_167_ - i_157_; i_169_ < i_156_; i_169_ += i_157_) {
							for (int i_170_ = i_166_ - i_157_; i_170_ < i_157_; i_170_ += i_157_)
								((Class247) this).aClass160_3030.method2754(i_154_ + i_169_, i_155_ + i_170_, i_157_, i_157_, 0, i_164_ << 24 | 0xffffff, i_165_);
						}
					}
				}
			} else
				class505.B(i_154_, i_155_, i_156_, i_157_, i_164_ << 24 | i_161_, 1);
		} else if (bool_162_) {
			Class384 class384 = class505.method8453();
			Class384 class384_171_ = class505.method8453();
			class384.aFloatArray4667[2] = class384.aFloatArray4667[3];
			class384.aFloatArray4667[6] = class384.aFloatArray4667[7];
			class384.aFloatArray4667[10] = class384.aFloatArray4667[11];
			class384.aFloatArray4667[14] = class384.aFloatArray4667[15];
			class505.method8424(class384);
			method4231(class505, i_158_, i_159_, i_160_, i_163_, -248425578);
			class505.method8424(class384_171_);
		} else {
			if (bool)
				class505.ba(3, i_161_);
			method4231(class505, i_158_, i_159_, i_160_, i_163_, -1187288984);
		}
		for (int i_172_ = ((Class247) this).anInt3043 * 238612959 - 1; i_172_ >= 0; i_172_--)
			((Class247) this).aClass334Array3035[i_172_].method5955(class505, i_154_, i_155_, i_156_, i_157_, i_158_, i_159_, -1553248551 * ((Class247) this).anInt3038, ((Class247) this).anInt3039 * 1144064127, 133739471 * ((Class247) this).anInt3040, i_164_);
		class505.ba(2, 0);
	}

	public void method4245(GraphicalRenderer class505, int i, int i_173_, int i_174_, int i_175_, int i_176_, int i_177_, int i_178_, int i_179_, int i_180_, boolean bool, boolean bool_181_) {
		int i_182_ = 0;
		if (((Class247) this).aBool3042)
			i_182_ = ((Class247) this).anInt3052 * -1703069399;
		if (null != ((Class247) this).aClass247_3051) {
			Class247 class247_183_ = this;
			Class247 class247_184_ = ((Class247) this).aClass247_3051;
			if (class247_183_.hashCode() > class247_184_.hashCode()) {
				class247_183_ = ((Class247) this).aClass247_3051;
				class247_184_ = this;
				i_182_ = 255 - i_182_;
			}
			class247_183_.method4206(class505, i, i_173_, i_174_, i_175_, i_176_, i_177_, i_178_, i_179_, i_180_, bool, bool_181_, i_182_, (byte) -21);
			class247_184_.method4206(class505, i, i_173_, i_174_, i_175_, i_176_, i_177_, i_178_, i_179_, i_180_, false, bool_181_, 255 - i_182_, (byte) -19);
		} else
			method4206(class505, i, i_173_, i_174_, i_175_, i_176_, i_177_, i_178_, i_179_, i_180_, bool, bool_181_, i_182_, (byte) -84);
	}

	public Class247 method4246() {
		return ((Class247) this).aClass247_3051;
	}

	static final void method4247(CS2Executor class527, int i) {
		int i_185_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = (Class119.aClass426_1463.getItemDefinitions(i_185_, 1589162254).aString5043);
	}

	public static boolean method4248(int i, int i_186_, short i_187_) {
		if (!Class20.aBool161)
			return false;
		int i_188_ = i >> 16;
		int i_189_ = i & 0xffff;
		if (null == Class468_Sub8.aClass98Array7889[i_188_] || (Class468_Sub8.aClass98Array7889[i_188_].aClass118Array998[i_189_]) == null)
			return false;
		Class118 class118 = (Class468_Sub8.aClass98Array7889[i_188_].aClass118Array998[i_189_]);
		if (i_186_ != -1 || -2131393857 * class118.anInt1268 != 0) {
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 31)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.next(2009173063))) {
				if (i_186_ == (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9581) * 1575008129 && (class118.anInt1287 * -1952846363 == 395156599 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9582)
						&& (58 == (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225 || (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225 == 1007 || -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 == 25 || (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225 == 57 || 30 == -1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587)))
					return true;
			}
		} else {
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 59)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.next(1787533982))) {
				if ((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225) == 58 || 1007 == -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 || -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 == 25 || (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225) == 57 || 30 == (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225) {
					for (Class118 class118_190_ = Class117.method1981((395156599 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9582)), (byte) 70); null != class118_190_; class118_190_ = Class96_Sub23.method14682((Class468_Sub8.aClass98Array7889[(((class118_190_.anInt1287) * -1952846363) >> 16)]), class118_190_, -838454718)) {
						if (-1952846363 * class118_190_.anInt1287 == -1952846363 * class118.anInt1287)
							return true;
					}
				}
			}
		}
		return false;
	}

	static void method4249(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_191_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_192_ = (((CS2Executor) class527).intStack[1 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		AttributeDefault class437 = Class125.aClass424_1573.get(i_192_, (byte) 0);
		if (class437.method7319(2105121793)) {
			String string = class437.aString5335;
			if (i_191_ == -1)
				((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141) - 1] = string;
			else
				((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141) - 1] = Class409.aClass242_4922.method4156(i_191_, -1396181317).method4110(i_192_, string, (byte) 1);
		} else {
			int i_193_ = class437.anInt5337 * -1741480635;
			if (i_191_ == -1)
				((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537) - 1] = i_193_;
			else
				((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537) - 1] = Class409.aClass242_4922.method4156(i_191_, -1396181317).method4135(i_192_, i_193_, (byte) 7);
		}
	}

	public static void method4250(byte i) {
		for (Class282_Sub37 class282_sub37 = ((Class282_Sub37) Class492.aClass465_5774.method7750(-1139367366)); null != class282_sub37; class282_sub37 = ((Class282_Sub37) Class492.aClass465_5774.method7751((byte) 8))) {
			if (i >= 0)
				break;
			Class92.method1563((((Class282_Sub37) class282_sub37).anInt7999 * 1729403683), 1917715893);
		}
	}

	static void method4251(short i) {
		Class192.aClass1_2391 = Class1.aClass1_11;
		Class96_Sub9.aClass483_9278 = Class483.aClass483_5729;
		Class237.aClass494_2916 = Class494.aClass494_5786;
		Class404.aClass466_4831 = Class466.aClass466_5569;
	}

	static final void method4252(CS2Executor class527, byte i) {
		int i_194_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class282_Sub25.method12402((char) i_194_, (byte) 46) ? 1 : 0;
	}
}
