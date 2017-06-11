/* Class503 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SomethingDefinitions {
	public boolean aBoolean6124;
	Class507 aClass507_6125;
	public int anInt6126;
	public String aString6127 = "null";
	public int anInt6128;
	public int[] anIntArray6129;
	public int[] anIntArray6130;
	public int[] anIntArray6131;
	public int anInt6132;
	short[] aShortArray6133;
	public short[] aShortArray6134;
	byte[] aByteArray6135;
	short[] aShortArray6136;
	int anInt6137;
	byte aByte6138;
	byte aByte6139;
	public int anInt6140;
	byte aByte6141;
	public String[] aStringArray6142;
	public int anInt6143;
	public int anInt6144;
	public int anInt6145;
	public int anInt6146;
	public int anInt6147;
	public boolean aBoolean6148;
	public int anInt6149;
	int anInt6150;
	public int anInt6151;
	public byte aByte6152;
	public short aShort6153;
	public short[] aShortArray6154;
	public boolean aBoolean6155;
	int anInt6156;
	byte aByte6157;
	public byte aByte6158;
	HashTable aClass437_6159;
	int anInt6160;
	public int anInt6161;
	int anInt6162;
	public boolean aBoolean6163;
	public boolean aBoolean6164;
	public boolean aBoolean6165;
	int[][] anIntArrayArray6166;
	public int anInt6167;
	public byte aByte6168;
	public int anInt6169;
	public byte aByte6170;
	int anInt6171;
	public static int anInt6172 = 2;
	public boolean aBoolean6173;
	public int anInt6174;
	public int anInt6175;
	public int anInt6176;
	public static int anInt6177 = 1;
	public int anInt6178;
	public int anInt6179;
	public boolean aBoolean6180;
	public int anInt6181;
	public static short[] aShortArray6182 = new short[256];
	public Class274 aClass274_6183;
	public int anInt6184;
	public int anInt6185;
	public int anInt6186;
	public int anInt6187 = -1690840619;
	public int[] anIntArray6188;
	public int anInt6189;
	public int anInt6190;
	public short aShort6191;
	public int anInt6192;
	public boolean aBoolean6193;

	void method6235(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (0 == i_0_) {
					if (i != -975728899) {
						/* empty */
					}
					break;
				}
				readValues(class298_sub53, i_0_, 1663900566);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uu.a(").append(')').toString());
		}
	}

	public final Class387 method6236(GraphicsToolkit class_ra, int i, Class349 class349, Interface23 interface23, Class438 class438, Class438 class438_1_, Class438[] class438s, int[] is, int i_2_, Class498 class498, int i_3_, boolean bool, int i_4_) {
		try {
			if (null != anIntArray6188) {
				SomethingDefinitions class503_5_ = method6240(interface23, 1886245346);
				if (null == class503_5_)
					return null;
				return class503_5_.method6236(class_ra, i, class349, interface23, class438, class438_1_, class438s, is, i_2_, class498, i_3_, bool, -679459424);
			}
			int i_6_ = i;
			if (-1282053981 * ((SomethingDefinitions) this).anInt6160 != 128)
				i_6_ |= 0x2;
			if (128 != -2086573057 * ((SomethingDefinitions) this).anInt6150)
				i_6_ |= 0x5;
			boolean bool_7_ = false;
			int i_8_ = null != class438s ? class438s.length : 0;
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				if (class438s[i_9_] != null) {
					i_6_ |= class438s[i_9_].method5829(-1790708337);
					bool_7_ = true;
				}
			}
			if (null != class438) {
				i_6_ |= class438.method5829(-1790708337);
				bool_7_ = true;
			}
			if (null != class438_1_) {
				i_6_ |= class438_1_.method5829(-1790708337);
				bool_7_ = true;
			}
			long l = (long) (anInt6126 * -407713023 | 580915349 * class_ra.anInt5298 << 16);
			if (null != class498)
				l |= class498.aLong6110 * -8495627389615588201L << 24;
			Class387 class387;
			synchronized (((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass348_6204) {
				class387 = (Class387) ((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass348_6204.method4184(l);
			}
			Class350 class350 = null;
			if (!bool && i_3_ != -1)
				class350 = class349.method4202(i_3_, (byte) 59);
			else if (-1 != 525312939 * anInt6132)
				class350 = class349.method4202(anInt6132 * 525312939, (byte) 89);
			if (class387 == null || (class387.m() & i_6_) != i_6_) {
				if (null != class387)
					i_6_ |= class387.m();
				int i_10_ = i_6_;
				if (((SomethingDefinitions) this).aShortArray6133 != null)
					i_10_ |= 0x4000;
				if (((SomethingDefinitions) this).aShortArray6136 != null)
					i_10_ |= 0x8000;
				if (((SomethingDefinitions) this).aByte6141 != 0)
					i_10_ |= 0x80000;
				int[] is_11_ = (null != class498 && class498.anIntArray6108 != null ? class498.anIntArray6108 : anIntArray6129);
				boolean bool_12_ = false;
				synchronized (((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass243_6208) {
					for (int i_13_ = 0; i_13_ < is_11_.length; i_13_++) {
						if (is_11_[i_13_] == -1) {
							if (i_4_ != -679459424)
								throw new IllegalStateException();
						} else if (!((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass243_6208.method2290(is_11_[i_13_], 0, -1819291215))
							bool_12_ = true;
					}
				}
				if (bool_12_)
					return null;
				Model[] class64s = new Model[is_11_.length];
				for (int i_14_ = 0; i_14_ < is_11_.length; i_14_++) {
					if (is_11_[i_14_] == -1) {
						if (i_4_ != -679459424)
							throw new IllegalStateException();
					} else {
						synchronized (((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass243_6208) {
							class64s[i_14_] = Model.method751((((Class507) (((SomethingDefinitions) this).aClass507_6125)).aClass243_6208), is_11_[i_14_], 0);
						}
						if (class64s[i_14_] != null) {
							if (class64s[i_14_].size < 13)
								class64s[i_14_].method755(2);
							if (((SomethingDefinitions) this).anIntArrayArray6166 != null && (((SomethingDefinitions) this).anIntArrayArray6166[i_14_]) != null)
								class64s[i_14_].method753((((SomethingDefinitions) this).anIntArrayArray6166[i_14_][0]), (((SomethingDefinitions) this).anIntArrayArray6166[i_14_][1]), (((SomethingDefinitions) this).anIntArrayArray6166[i_14_][2]));
						}
					}
				}
				if (null != class350 && null != class350.anIntArrayArray3710) {
					for (int i_15_ = 0; i_15_ < class350.anIntArrayArray3710.length; i_15_++) {
						if (i_15_ < class64s.length) {
							if (null == class64s[i_15_]) {
								if (i_4_ != -679459424)
									throw new IllegalStateException();
							} else {
								int i_16_ = 0;
								int i_17_ = 0;
								int i_18_ = 0;
								int i_19_ = 0;
								int i_20_ = 0;
								int i_21_ = 0;
								if (null != class350.anIntArrayArray3710[i_15_]) {
									i_16_ = (class350.anIntArrayArray3710[i_15_][0]);
									i_17_ = (class350.anIntArrayArray3710[i_15_][1]);
									i_18_ = (class350.anIntArrayArray3710[i_15_][2]);
									i_19_ = (class350.anIntArrayArray3710[i_15_][3]) << 3;
									i_20_ = (class350.anIntArrayArray3710[i_15_][4]) << 3;
									i_21_ = (class350.anIntArrayArray3710[i_15_][5]) << 3;
								}
								if (0 != i_19_ || 0 != i_20_ || 0 != i_21_)
									class64s[i_15_].method754(i_19_, i_20_, i_21_);
								if (0 != i_16_ || i_17_ != 0 || i_18_ != 0)
									class64s[i_15_].method753(i_16_, i_17_, i_18_);
							}
						}
					}
				}
				Model model;
				if (1 == class64s.length)
					model = class64s[0];
				else
					model = new Model(class64s, class64s.length);
				class387 = (class_ra.method5037(model, i_10_, 299909243 * ((Class507) (((SomethingDefinitions) this).aClass507_6125)).anInt6210, -335572127 * ((SomethingDefinitions) this).anInt6137 + 64, 850 + -1208973327 * ((SomethingDefinitions) this).anInt6156));
				if (null != ((SomethingDefinitions) this).aShortArray6133) {
					short[] is_22_;
					if (class498 != null && null != class498.aShortArray6109)
						is_22_ = class498.aShortArray6109;
					else
						is_22_ = aShortArray6134;
					for (int i_23_ = 0; i_23_ < ((SomethingDefinitions) this).aShortArray6133.length; i_23_++) {
						if (null != ((SomethingDefinitions) this).aByteArray6135 && i_23_ < ((SomethingDefinitions) this).aByteArray6135.length)
							class387.X((((SomethingDefinitions) this).aShortArray6133[i_23_]), aShortArray6182[(((SomethingDefinitions) this).aByteArray6135[i_23_]) & 0xff]);
						else
							class387.X((((SomethingDefinitions) this).aShortArray6133[i_23_]), is_22_[i_23_]);
					}
				}
				if (null != ((SomethingDefinitions) this).aShortArray6136) {
					short[] is_24_;
					if (class498 != null && null != class498.aShortArray6107)
						is_24_ = class498.aShortArray6107;
					else
						is_24_ = aShortArray6154;
					for (int i_25_ = 0; i_25_ < ((SomethingDefinitions) this).aShortArray6136.length; i_25_++)
						class387.W(((SomethingDefinitions) this).aShortArray6136[i_25_], is_24_[i_25_]);
				}
				if (0 != ((SomethingDefinitions) this).aByte6141)
					class387.PA(((SomethingDefinitions) this).aByte6138, ((SomethingDefinitions) this).aByte6139, ((SomethingDefinitions) this).aByte6157, ((SomethingDefinitions) this).aByte6141 & 0xff);
				class387.KA(i_6_);
				synchronized (((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass348_6204) {
					((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass348_6204.method4194(class387, l);
				}
			}
			Class387 class387_26_ = class387.method4755((byte) 4, i_6_, true);
			boolean bool_27_ = false;
			if (is != null) {
				for (int i_28_ = 0; i_28_ < 12; i_28_++) {
					if (-1 != is[i_28_])
						bool_27_ = true;
				}
			}
			if (!bool_7_ && !bool_27_)
				return class387_26_;
			Matrix3f[] class222s = null;
			if (null != class350)
				class222s = class350.method4207((byte) 22);
			if (bool_27_ && null != class222s) {
				for (int i_29_ = 0; i_29_ < 12; i_29_++) {
					if (class222s[i_29_] != null)
						class387_26_.method4741(class222s[i_29_], 1 << i_29_, true);
				}
			}
			int i_30_ = 0;
			int i_31_ = 1;
			while (i_30_ < i_8_) {
				if (class438s[i_30_] == null) {
					if (i_4_ != -679459424) {
						/* empty */
					}
				} else
					class438s[i_30_].method5830(class387_26_, 0, i_31_, (byte) 125);
				i_30_++;
				i_31_ <<= 1;
			}
			if (bool_27_) {
				for (i_30_ = 0; i_30_ < 12; i_30_++) {
					if (-1 == is[i_30_]) {
						if (i_4_ != -679459424) {
							/* empty */
						}
					} else {
						i_31_ = is[i_30_] - i_2_;
						i_31_ &= 0x3fff;
						Matrix3f class222 = new Matrix3f();
						class222.method2059(0.0F, 1.0F, 0.0F, Class220.method2049(i_31_));
						class387_26_.method4741(class222, 1 << i_30_, false);
					}
				}
			}
			if (bool_27_ && class222s != null) {
				for (i_30_ = 0; i_30_ < 12; i_30_++) {
					if (class222s[i_30_] != null)
						class387_26_.method4741(class222s[i_30_], 1 << i_30_, false);
				}
			}
			if (null != class438 && class438_1_ != null)
				Class400.method4929(class387_26_, class438, class438_1_, -1827693647);
			else if (class438 != null)
				class438.method5839(class387_26_, 0, 339112441);
			else if (null != class438_1_)
				class438_1_.method5839(class387_26_, 0, -1538889562);
			if (-2086573057 * ((SomethingDefinitions) this).anInt6150 != 128 || 128 != -1282053981 * ((SomethingDefinitions) this).anInt6160)
				class387_26_.oa(((SomethingDefinitions) this).anInt6150 * -2086573057, ((SomethingDefinitions) this).anInt6160 * -1282053981, ((SomethingDefinitions) this).anInt6150 * -2086573057);
			class387_26_.KA(i);
			return class387_26_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uu.i(").append(')').toString());
		}
	}

	public final Class387 method6237(GraphicsToolkit class_ra, int i, Interface23 interface23, Class438 class438, Class498 class498, int i_32_) {
		try {
			if (anIntArray6188 != null) {
				SomethingDefinitions class503_33_ = method6240(interface23, 1912809157);
				if (null == class503_33_)
					return null;
				return class503_33_.method6237(class_ra, i, interface23, class438, class498, -1500196036);
			}
			if (anIntArray6130 == null && (null == class498 || null == class498.anIntArray6108))
				return null;
			int i_34_ = i;
			if (class438 != null)
				i_34_ |= class438.method5829(-1790708337);
			long l = (long) (anInt6126 * -407713023 | 580915349 * class_ra.anInt5298 << 16);
			if (null != class498)
				l |= -8495627389615588201L * class498.aLong6110 << 24;
			Class387 class387;
			synchronized (((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass348_6211) {
				class387 = (Class387) ((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass348_6211.method4184(l);
			}
			if (null == class387 || (class387.m() & i_34_) != i_34_) {
				if (null != class387)
					i_34_ |= class387.m();
				int i_35_ = i_34_;
				if (null != ((SomethingDefinitions) this).aShortArray6133)
					i_35_ |= 0x4000;
				if (null != ((SomethingDefinitions) this).aShortArray6136)
					i_35_ |= 0x8000;
				if (((SomethingDefinitions) this).aByte6141 != 0)
					i_35_ |= 0x80000;
				int[] is = (class498 != null && null != class498.anIntArray6108 ? class498.anIntArray6108 : anIntArray6130);
				boolean bool = false;
				synchronized (((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass243_6208) {
					for (int i_36_ = 0; i_36_ < is.length; i_36_++) {
						if (!((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass243_6208.method2290(is[i_36_], 0, -602703169))
							bool = true;
					}
				}
				if (bool)
					return null;
				Model[] class64s = new Model[is.length];
				synchronized (((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass243_6208) {
					for (int i_37_ = 0; i_37_ < is.length; i_37_++)
						class64s[i_37_] = Model.method751((((Class507) (((SomethingDefinitions) this).aClass507_6125)).aClass243_6208), is[i_37_], 0);
				}
				for (int i_38_ = 0; i_38_ < is.length; i_38_++) {
					if (null != class64s[i_38_] && class64s[i_38_].size < 13)
						class64s[i_38_].method755(2);
				}
				Model model;
				if (class64s.length == 1)
					model = class64s[0];
				else
					model = new Model(class64s, class64s.length);
				class387 = class_ra.method5037(model, i_35_, (((Class507) (((SomethingDefinitions) this).aClass507_6125)).anInt6210) * 299909243, 64, 768);
				if (((SomethingDefinitions) this).aShortArray6133 != null) {
					short[] is_39_;
					if (null != class498 && class498.aShortArray6109 != null)
						is_39_ = class498.aShortArray6109;
					else
						is_39_ = aShortArray6134;
					for (int i_40_ = 0; i_40_ < ((SomethingDefinitions) this).aShortArray6133.length; i_40_++) {
						if (null != ((SomethingDefinitions) this).aByteArray6135 && i_40_ < ((SomethingDefinitions) this).aByteArray6135.length)
							class387.X((((SomethingDefinitions) this).aShortArray6133[i_40_]), aShortArray6182[(((SomethingDefinitions) this).aByteArray6135[i_40_]) & 0xff]);
						else
							class387.X((((SomethingDefinitions) this).aShortArray6133[i_40_]), is_39_[i_40_]);
					}
				}
				if (((SomethingDefinitions) this).aShortArray6136 != null) {
					short[] is_41_;
					if (class498 != null && class498.aShortArray6107 != null)
						is_41_ = class498.aShortArray6107;
					else
						is_41_ = aShortArray6154;
					for (int i_42_ = 0; i_42_ < ((SomethingDefinitions) this).aShortArray6136.length; i_42_++)
						class387.W(((SomethingDefinitions) this).aShortArray6136[i_42_], is_41_[i_42_]);
				}
				if (((SomethingDefinitions) this).aByte6141 != 0)
					class387.PA(((SomethingDefinitions) this).aByte6138, ((SomethingDefinitions) this).aByte6139, ((SomethingDefinitions) this).aByte6157, ((SomethingDefinitions) this).aByte6141 & 0xff);
				class387.KA(i_34_);
				synchronized (((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass348_6211) {
					((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass348_6211.method4194(class387, l);
				}
			}
			if (class438 != null) {
				class387 = class387.method4755((byte) 1, i_34_, true);
				class438.method5839(class387, 0, -731129719);
			}
			class387.KA(i);
			return class387;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uu.k(").append(')').toString());
		}
	}

	public final boolean method6238(int i) {
		try {
			if (anIntArray6129 == null)
				return true;
			boolean bool = true;
			int[] is = anIntArray6129;
			for (int i_43_ = 0; i_43_ < is.length; i_43_++) {
				int i_44_ = is[i_43_];
				if (!((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass243_6208.method2290(i_44_, 0, -463050298))
					bool = false;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uu.d(").append(')').toString());
		}
	}

	public int method6239(int i, int i_45_, byte i_46_) {
		try {
			if (((SomethingDefinitions) this).aClass437_6159 == null)
				return i_45_;
			Class298_Sub35 class298_sub35 = ((Class298_Sub35) ((SomethingDefinitions) this).aClass437_6159.get((long) i));
			if (class298_sub35 == null)
				return i_45_;
			return class298_sub35.anInt7394 * -774922497;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uu.u(").append(')').toString());
		}
	}

	public final SomethingDefinitions method6240(Interface23 interface23, int i) {
		try {
			int i_47_ = -1;
			if (((SomethingDefinitions) this).anInt6171 * 677538211 != -1)
				i_47_ = interface23.method250((677538211 * ((SomethingDefinitions) this).anInt6171), (byte) 122);
			else if (((SomethingDefinitions) this).anInt6162 * -1248679093 != -1)
				i_47_ = interface23.method252((((SomethingDefinitions) this).anInt6162 * -1248679093), (byte) 49);
			if (i_47_ < 0 || i_47_ >= anIntArray6188.length - 1 || -1 == anIntArray6188[i_47_]) {
				int i_48_ = anIntArray6188[anIntArray6188.length - 1];
				if (i_48_ != -1)
					return ((SomethingDefinitions) this).aClass507_6125.method6269(i_48_, 749174826);
				return null;
			}
			return ((SomethingDefinitions) this).aClass507_6125.method6269(anIntArray6188[i_47_], 541835254);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uu.r(").append(')').toString());
		}
	}

	SomethingDefinitions() {
		anInt6132 = 799129853;
		((SomethingDefinitions) this).aByte6141 = (byte) 0;
		anInt6128 = -1197123063;
		anInt6144 = -1226765471;
		anInt6145 = 625322989;
		anInt6146 = -1361323597;
		anInt6147 = -1737724111;
		aBoolean6148 = true;
		anInt6149 = -954057527;
		((SomethingDefinitions) this).anInt6150 = 1732902784;
		((SomethingDefinitions) this).anInt6160 = 910525824;
		aBoolean6124 = false;
		aBoolean6155 = false;
		aBoolean6173 = false;
		((SomethingDefinitions) this).anInt6137 = 0;
		((SomethingDefinitions) this).anInt6156 = 0;
		anInt6185 = -945207309;
		anInt6178 = 537547649;
		anInt6181 = -68186784;
		((SomethingDefinitions) this).anInt6171 = 70774261;
		((SomethingDefinitions) this).anInt6162 = 1169422749;
		aBoolean6163 = true;
		aBoolean6164 = true;
		aBoolean6165 = true;
		aShort6191 = (short) 0;
		aShort6153 = (short) 0;
		aByte6168 = (byte) -96;
		aByte6152 = (byte) -16;
		aByte6170 = (byte) 0;
		anInt6151 = 273231167;
		anInt6174 = 1377267175;
		anInt6169 = 1213502441;
		anInt6176 = 363354277;
		anInt6140 = 0;
		anInt6175 = 0;
		anInt6179 = -1876875963;
		anInt6167 = -1506883587;
		anInt6143 = -1816293685;
		anInt6184 = -198329521;
		aClass274_6183 = Class274.aClass274_6530;
		anInt6186 = -1432059025;
		aByte6158 = (byte) -1;
		anInt6189 = 133354337;
		anInt6190 = -986694912;
		anInt6161 = 1143914752;
		anInt6192 = 0;
		aBoolean6193 = true;
	}

	public boolean method6241(Interface23 interface23, int i) {
		try {
			if (null == anIntArray6188)
				return true;
			int i_49_ = -1;
			if (-1 != ((SomethingDefinitions) this).anInt6171 * 677538211)
				i_49_ = interface23.method250((677538211 * ((SomethingDefinitions) this).anInt6171), (byte) 4);
			else if (-1248679093 * ((SomethingDefinitions) this).anInt6162 != -1)
				i_49_ = interface23.method252((-1248679093 * ((SomethingDefinitions) this).anInt6162), (byte) 94);
			if (i_49_ < 0 || i_49_ >= anIntArray6188.length - 1 || anIntArray6188[i_49_] == -1) {
				int i_50_ = anIntArray6188[anIntArray6188.length - 1];
				if (-1 != i_50_)
					return true;
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uu.q(").append(')').toString());
		}
	}

	public boolean method6242(byte i) {
		try {
			if (anIntArray6188 == null)
				return (-1 != anInt6151 * 1945943361 || -1 != 1105496999 * anInt6169 || -1390399277 * anInt6176 != -1);
			for (int i_51_ = 0; i_51_ < anIntArray6188.length; i_51_++) {
				if (-1 != anIntArray6188[i_51_]) {
					SomethingDefinitions class503_52_ = ((SomethingDefinitions) this).aClass507_6125.method6269(anIntArray6188[i_51_], -1960092896);
					if (1945943361 * class503_52_.anInt6151 != -1 || -1 != class503_52_.anInt6169 * 1105496999 || class503_52_.anInt6176 * -1390399277 != -1)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uu.n(").append(')').toString());
		}
	}

	void method6243(int i) {
		try {
			if (null == anIntArray6129)
				anIntArray6129 = new int[0];
			if (aByte6158 == -1) {
				if ((((Class507) ((SomethingDefinitions) this).aClass507_6125).aClass411_6205) == Class411.aClass411_5320)
					aByte6158 = (byte) 1;
				else
					aByte6158 = (byte) 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uu.b(").append(')').toString());
		}
	}

	void readValues(RsByteBuffer class298_sub53, int i, int i_53_) {
		try {
			if (i == 1) {
				int i_54_ = class298_sub53.readUnsignedByte();
				anIntArray6129 = new int[i_54_];
				for (int i_55_ = 0; i_55_ < i_54_; i_55_++)
					anIntArray6129[i_55_] = class298_sub53.readBigSmart(1235052657);
			} else if (i == 2)
				aString6127 = class298_sub53.readString(-1611525197);
			else if (12 == i)
				anInt6187 = class298_sub53.readUnsignedByte() * -1690840619;
			else if (i >= 30 && i < 35)
				aStringArray6142[i - 30] = class298_sub53.readString(-329838492);
			else if (i == 40) {
				int i_56_ = class298_sub53.readUnsignedByte();
				((SomethingDefinitions) this).aShortArray6133 = new short[i_56_];
				aShortArray6134 = new short[i_56_];
				for (int i_57_ = 0; i_57_ < i_56_; i_57_++) {
					((SomethingDefinitions) this).aShortArray6133[i_57_] = (short) class298_sub53.readUnsignedShort();
					aShortArray6134[i_57_] = (short) class298_sub53.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_58_ = class298_sub53.readUnsignedByte();
				((SomethingDefinitions) this).aShortArray6136 = new short[i_58_];
				aShortArray6154 = new short[i_58_];
				for (int i_59_ = 0; i_59_ < i_58_; i_59_++) {
					((SomethingDefinitions) this).aShortArray6136[i_59_] = (short) class298_sub53.readUnsignedShort();
					aShortArray6154[i_59_] = (short) class298_sub53.readUnsignedShort();
				}
			} else if (i == 42) {
				int i_60_ = class298_sub53.readUnsignedByte();
				((SomethingDefinitions) this).aByteArray6135 = new byte[i_60_];
				for (int i_61_ = 0; i_61_ < i_60_; i_61_++)
					((SomethingDefinitions) this).aByteArray6135[i_61_] = class298_sub53.readByte(-12558881);
			} else if (i == 60) {
				int i_62_ = class298_sub53.readUnsignedByte();
				anIntArray6130 = new int[i_62_];
				for (int i_63_ = 0; i_63_ < i_62_; i_63_++)
					anIntArray6130[i_63_] = class298_sub53.readBigSmart(1235052657);
			} else if (i == 93)
				aBoolean6148 = false;
			else if (i == 95)
				anInt6149 = class298_sub53.readUnsignedShort() * 954057527;
			else if (i == 97)
				((SomethingDefinitions) this).anInt6150 = class298_sub53.readUnsignedShort() * -1227975681;
			else if (98 == i)
				((SomethingDefinitions) this).anInt6160 = class298_sub53.readUnsignedShort() * 745310987;
			else if (i == 99)
				aBoolean6124 = true;
			else if (i == 100)
				((SomethingDefinitions) this).anInt6137 = class298_sub53.readByte(-12558881) * 2012631201;
			else if (101 == i)
				((SomethingDefinitions) this).anInt6156 = class298_sub53.readByte(-12558881) * 1653976405;
			else if (i == 102)
				anInt6185 = class298_sub53.readUnsignedShort() * 945207309;
			else if (103 == i)
				anInt6181 = class298_sub53.readUnsignedShort() * -1075872661;
			else if (i == 106 || 118 == i) {
				((SomethingDefinitions) this).anInt6171 = class298_sub53.readUnsignedShort() * -70774261;
				if (677538211 * ((SomethingDefinitions) this).anInt6171 == 65535)
					((SomethingDefinitions) this).anInt6171 = 70774261;
				((SomethingDefinitions) this).anInt6162 = class298_sub53.readUnsignedShort() * -1169422749;
				if (((SomethingDefinitions) this).anInt6162 * -1248679093 == 65535)
					((SomethingDefinitions) this).anInt6162 = 1169422749;
				int i_64_ = -1;
				if (i == 118) {
					i_64_ = class298_sub53.readUnsignedShort();
					if (i_64_ == 65535)
						i_64_ = -1;
				}
				int i_65_ = class298_sub53.readUnsignedByte();
				anIntArray6188 = new int[2 + i_65_];
				for (int i_66_ = 0; i_66_ <= i_65_; i_66_++) {
					anIntArray6188[i_66_] = class298_sub53.readUnsignedShort();
					if (65535 == anIntArray6188[i_66_])
						anIntArray6188[i_66_] = -1;
				}
				anIntArray6188[i_65_ + 1] = i_64_;
			} else if (i == 107)
				aBoolean6163 = false;
			else if (i == 109)
				aBoolean6164 = false;
			else if (111 == i)
				aBoolean6165 = false;
			else if (i == 113) {
				aShort6191 = (short) class298_sub53.readUnsignedShort();
				aShort6153 = (short) class298_sub53.readUnsignedShort();
			} else if (114 == i) {
				aByte6168 = class298_sub53.readByte(-12558881);
				aByte6152 = class298_sub53.readByte(-12558881);
			} else if (119 == i)
				aByte6170 = class298_sub53.readByte(-12558881);
			else if (i == 121) {
				((SomethingDefinitions) this).anIntArrayArray6166 = new int[anIntArray6129.length][];
				int i_67_ = class298_sub53.readUnsignedByte();
				for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
					int i_69_ = class298_sub53.readUnsignedByte();
					int[] is = (((SomethingDefinitions) this).anIntArrayArray6166[i_69_] = new int[3]);
					is[0] = class298_sub53.readByte(-12558881);
					is[1] = class298_sub53.readByte(-12558881);
					is[2] = class298_sub53.readByte(-12558881);
				}
			} else if (i == 122)
				anInt6167 = class298_sub53.readBigSmart(1235052657) * 1506883587;
			else if (i == 123)
				anInt6143 = class298_sub53.readUnsignedShort() * 1816293685;
			else if (i == 125)
				aClass274_6183 = ((Class274) Class422_Sub20.method5701(Class299.method3680(-1901608125), class298_sub53.readByte(-12558881), (byte) 2));
			else if (127 == i)
				anInt6132 = class298_sub53.readUnsignedShort() * -799129853;
			else if (128 == i)
				Class422_Sub20.method5701(Class522.method6325((byte) -83), class298_sub53.readUnsignedByte(), (byte) 2);
			else if (i == 134) {
				anInt6151 = class298_sub53.readUnsignedShort() * -273231167;
				if (65535 == anInt6151 * 1945943361)
					anInt6151 = 273231167;
				anInt6174 = class298_sub53.readUnsignedShort() * -1377267175;
				if (65535 == anInt6174 * -904091095)
					anInt6174 = 1377267175;
				anInt6169 = class298_sub53.readUnsignedShort() * -1213502441;
				if (65535 == 1105496999 * anInt6169)
					anInt6169 = 1213502441;
				anInt6176 = class298_sub53.readUnsignedShort() * -363354277;
				if (anInt6176 * -1390399277 == 65535)
					anInt6176 = 363354277;
				anInt6140 = class298_sub53.readUnsignedByte() * 203494719;
			} else if (i == 135) {
				anInt6145 = class298_sub53.readUnsignedByte() * -625322989;
				anInt6128 = class298_sub53.readUnsignedShort() * 1197123063;
			} else if (136 == i) {
				anInt6146 = class298_sub53.readUnsignedByte() * 1361323597;
				anInt6144 = class298_sub53.readUnsignedShort() * 1226765471;
			} else if (i == 137)
				anInt6147 = class298_sub53.readUnsignedShort() * 1737724111;
			else if (i == 138)
				anInt6178 = class298_sub53.readBigSmart(1235052657) * -537547649;
			else if (139 == i)
				anInt6184 = class298_sub53.readBigSmart(1235052657) * 198329521;
			else if (i == 140)
				anInt6179 = class298_sub53.readUnsignedByte() * -462121541;
			else if (i == 141)
				aBoolean6173 = true;
			else if (i == 142)
				anInt6186 = class298_sub53.readUnsignedShort() * 1432059025;
			else if (143 == i)
				aBoolean6155 = true;
			else if (i >= 150 && i < 155) {
				aStringArray6142[i - 150] = class298_sub53.readString(1280562882);
				if (!((Class507) ((SomethingDefinitions) this).aClass507_6125).aBoolean6209)
					aStringArray6142[i - 150] = null;
			} else if (i == 155) {
				((SomethingDefinitions) this).aByte6138 = class298_sub53.readByte(-12558881);
				((SomethingDefinitions) this).aByte6139 = class298_sub53.readByte(-12558881);
				((SomethingDefinitions) this).aByte6157 = class298_sub53.readByte(-12558881);
				((SomethingDefinitions) this).aByte6141 = class298_sub53.readByte(-12558881);
			} else if (158 == i)
				aByte6158 = (byte) 1;
			else if (i == 159)
				aByte6158 = (byte) 0;
			else if (i == 160) {
				int i_70_ = class298_sub53.readUnsignedByte();
				anIntArray6131 = new int[i_70_];
				for (int i_71_ = 0; i_71_ < i_70_; i_71_++)
					anIntArray6131[i_71_] = class298_sub53.readUnsignedShort();
			} else if (i == 162)
				aBoolean6180 = true;
			else if (i == 163)
				anInt6189 = class298_sub53.readUnsignedByte() * -133354337;
			else if (164 == i) {
				anInt6190 = class298_sub53.readUnsignedShort() * -138072005;
				anInt6161 = class298_sub53.readUnsignedShort() * 1615081153;
			} else if (165 == i)
				anInt6192 = class298_sub53.readUnsignedByte() * -1027847229;
			else if (168 == i)
				anInt6175 = class298_sub53.readUnsignedByte() * -2143657709;
			else if (i == 169)
				aBoolean6193 = false;
			else if (249 == i) {
				int i_72_ = class298_sub53.readUnsignedByte();
				if (((SomethingDefinitions) this).aClass437_6159 == null) {
					int i_73_ = Class416.method5590(i_72_, (byte) 16);
					((SomethingDefinitions) this).aClass437_6159 = new HashTable(i_73_);
				}
				for (int i_74_ = 0; i_74_ < i_72_; i_74_++) {
					boolean bool = class298_sub53.readUnsignedByte() == 1;
					int i_75_ = class298_sub53.read24BitUnsignedInteger((byte) -8);
					Linkable class298;
					if (bool)
						class298 = new Class298_Sub29(class298_sub53.readString(1107258472));
					else
						class298 = new Class298_Sub35(class298_sub53.readInt((byte) -18));
					((SomethingDefinitions) this).aClass437_6159.method5817(class298, (long) i_75_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uu.f(").append(')').toString());
		}
	}

	public String method6245(int i, String string, int i_76_) {
		try {
			if (null == ((SomethingDefinitions) this).aClass437_6159)
				return string;
			Class298_Sub29 class298_sub29 = ((Class298_Sub29) ((SomethingDefinitions) this).aClass437_6159.get((long) i));
			if (null == class298_sub29)
				return string;
			return (String) class298_sub29.anObject7366;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uu.x(").append(')').toString());
		}
	}

	public final Class387 method6246(GraphicsToolkit class_ra, int i, Class349 class349, Interface23 interface23, Class438 class438, Class438 class438_77_, Class438[] class438s, int[] is, int i_78_, Class498 class498, int i_79_) {
		try {
			return method6236(class_ra, i, class349, interface23, class438, class438_77_, class438s, is, i_78_, class498, anInt6132 * 525312939, true, -679459424);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uu.p(").append(')').toString());
		}
	}

	public static Class128 method6247(RsByteBuffer class298_sub53, int i) {
		try {
			Class128 class128 = Graphics.method608(class298_sub53, -2098410603);
			int i_80_ = class298_sub53.readInt((byte) -118);
			int i_81_ = class298_sub53.readInt((byte) 85);
			return new Class128_Sub2(class128.aClass139_6322, class128.aClass133_6323, class128.anInt6327 * -39975161, 1886882435 * class128.anInt6325, class128.anInt6326 * -944287579, -1387457793 * class128.anInt6330, -684094775 * class128.anInt6328, 955568089 * class128.anInt6329, class128.anInt6324 * 782326281, i_80_, i_81_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uu.i(").append(')').toString());
		}
	}
}
