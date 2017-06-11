/* Class366 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class366 {
	long aLong3966;
	public static int anInt3967 = 1073741824;
	static int anInt3968 = 1073741823;
	int[] anIntArray3969;
	public static short[][] aShortArrayArray3970;
	ItemEffects[] aClass464Array3971;
	static int[] anIntArray3972 = { 8, 11, 4, 6, 9, 7, 10, 0 };
	public int[] anIntArray3973;
	public int anInt3974 = 993979383;
	long aLong3975;
	int anInt3976;
	public boolean aBoolean3977;
	public static int anInt3978 = -2147483648;
	static Class348 aClass348_3979 = new Class348(260);
	static Class348 aClass348_3980 = new Class348(5);
	static int anInt3981;

	public void method4538(int i, int i_0_, Class144 class144, int i_1_) {
		try {
			int i_2_ = anIntArray3972[i];
			if (class144.method1579(i_0_, -1709524743) != null) {
				((Class366) this).anIntArray3969[i_2_] = i_0_ | ~0x7fffffff;
				method4542(-1951489461);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pf.f(").append(')').toString());
		}
	}

	public void method4539(int i, int i_3_, byte i_4_) {
		try {
			anIntArray3973[i] = i_3_;
			method4542(2147284588);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pf.b(").append(')').toString());
		}
	}

	public void method4540(boolean bool, int i) {
		try {
			aBoolean3977 = bool;
			method4542(1206946871);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pf.p(").append(')').toString());
		}
	}

	public void method4541(int i, int i_5_, Class477 class477, byte i_6_) {
		try {
			if (-1 == i_5_)
				((Class366) this).anIntArray3969[i] = 0;
			else if (class477.getItemDefinitions(i_5_) != null) {
				((Class366) this).anIntArray3969[i] = i_5_ | 0x40000000;
				method4542(-1390071548);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pf.i(").append(')').toString());
		}
	}

	void method4542(int i) {
		try {
			long[] ls = RsByteBuffer.aLongArray7619;
			((Class366) this).aLong3975 = -1662367026201571203L;
			((Class366) this).aLong3975 = (1662367026201571203L * (((Class366) this).aLong3975 * 5093099708756449067L >>> 8 ^ ls[(int) (((((Class366) this).aLong3975 * 5093099708756449067L) ^ (long) ((((Class366) this).anInt3976 * 767962207) >> 8)) & 0xffL)]));
			((Class366) this).aLong3975 = (1662367026201571203L * (5093099708756449067L * ((Class366) this).aLong3975 >>> 8 ^ ls[(int) (((((Class366) this).aLong3975 * 5093099708756449067L) ^ (long) (((Class366) this).anInt3976 * 767962207)) & 0xffL)]));
			for (int i_7_ = 0; i_7_ < ((Class366) this).anIntArray3969.length; i_7_++) {
				((Class366) this).aLong3975 = (((Class366) this).aLong3975 * 5093099708756449067L >>> 8 ^ ls[(int) (((5093099708756449067L * ((Class366) this).aLong3975) ^ (long) ((((Class366) this).anIntArray3969[i_7_]) >> 24)) & 0xffL)]) * 1662367026201571203L;
				((Class366) this).aLong3975 = (1662367026201571203L * ((5093099708756449067L * ((Class366) this).aLong3975 >>> 8) ^ ls[(int) (((((Class366) this).aLong3975 * 5093099708756449067L) ^ (long) ((((Class366) this).anIntArray3969[i_7_]) >> 16)) & 0xffL)]));
				((Class366) this).aLong3975 = (5093099708756449067L * ((Class366) this).aLong3975 >>> 8 ^ ls[(int) (((5093099708756449067L * ((Class366) this).aLong3975) ^ (long) ((((Class366) this).anIntArray3969[i_7_]) >> 8)) & 0xffL)]) * 1662367026201571203L;
				((Class366) this).aLong3975 = (((Class366) this).aLong3975 * 5093099708756449067L >>> 8 ^ ls[(int) (((((Class366) this).aLong3975 * 5093099708756449067L) ^ (long) (((Class366) this).anIntArray3969[i_7_])) & 0xffL)]) * 1662367026201571203L;
			}
			if (((Class366) this).aClass464Array3971 != null) {
				for (int i_8_ = 0; i_8_ < ((Class366) this).aClass464Array3971.length; i_8_++) {
					if (((Class366) this).aClass464Array3971[i_8_] != null) {
						int[] is;
						int[] is_9_;
						if (aBoolean3977) {
							is = (((Class366) this).aClass464Array3971[i_8_].aura_cmp_pttwo);
							is_9_ = (((Class366) this).aClass464Array3971[i_8_].fem_head_mdls);
						} else {
							is = (((Class366) this).aClass464Array3971[i_8_].aura_cmp_ptone);
							is_9_ = (((Class366) this).aClass464Array3971[i_8_].male_head_mdls);
						}
						if (null != is) {
							for (int i_10_ = 0; i_10_ < is.length; i_10_++) {
								((Class366) this).aLong3975 = (((((Class366) this).aLong3975 * 5093099708756449067L) >>> 8 ^ ls[(int) ((((((Class366) this).aLong3975) * 5093099708756449067L) ^ (long) (is[i_10_] >> 8)) & 0xffL)]) * 1662367026201571203L);
								((Class366) this).aLong3975 = (((((Class366) this).aLong3975 * 5093099708756449067L) >>> 8 ^ ls[(int) ((((((Class366) this).aLong3975) * 5093099708756449067L) ^ (long) is[i_10_]) & 0xffL)]) * 1662367026201571203L);
							}
						}
						if (is_9_ != null) {
							for (int i_11_ = 0; i_11_ < is_9_.length; i_11_++) {
								((Class366) this).aLong3975 = (1662367026201571203L * ((5093099708756449067L * ((Class366) this).aLong3975) >>> 8 ^ ls[(int) (((5093099708756449067L * (((Class366) this).aLong3975)) ^ (long) (is_9_[i_11_] >> 8)) & 0xffL)]));
								((Class366) this).aLong3975 = (((5093099708756449067L * ((Class366) this).aLong3975) >>> 8 ^ ls[(int) ((((((Class366) this).aLong3975) * 5093099708756449067L) ^ (long) is_9_[i_11_]) & 0xffL)]) * 1662367026201571203L);
							}
						}
						if ((((Class366) this).aClass464Array3971[i_8_].color_palette) != null) {
							for (int i_12_ = 0; i_12_ < (((Class366) this).aClass464Array3971[i_8_].color_palette).length; i_12_++) {
								((Class366) this).aLong3975 = (1662367026201571203L * ((((Class366) this).aLong3975 * 5093099708756449067L) >>> 8 ^ (ls[(int) (((5093099708756449067L * (((Class366) this).aLong3975)) ^ (long) ((((Class366) this).aClass464Array3971[i_8_].color_palette[i_12_]) >> 8)) & 0xffL)])));
								((Class366) this).aLong3975 = (1662367026201571203L * ((5093099708756449067L * ((Class366) this).aLong3975) >>> 8 ^ (ls[(int) (((5093099708756449067L * (((Class366) this).aLong3975)) ^ (long) (((Class366) this).aClass464Array3971[i_8_].color_palette[i_12_])) & 0xffL)])));
							}
						}
						if (null != (((Class366) this).aClass464Array3971[i_8_].texture_palette)) {
							for (int i_13_ = 0; i_13_ < (((Class366) this).aClass464Array3971[i_8_].texture_palette).length; i_13_++) {
								((Class366) this).aLong3975 = (1662367026201571203L * ((5093099708756449067L * ((Class366) this).aLong3975) >>> 8 ^ (ls[(int) (((5093099708756449067L * (((Class366) this).aLong3975)) ^ (long) ((((Class366) this).aClass464Array3971[i_8_].texture_palette[i_13_]) >> 8)) & 0xffL)])));
								((Class366) this).aLong3975 = (1662367026201571203L * ((5093099708756449067L * ((Class366) this).aLong3975) >>> 8 ^ (ls[(int) (((5093099708756449067L * (((Class366) this).aLong3975)) ^ (long) (((Class366) this).aClass464Array3971[i_8_].texture_palette[i_13_])) & 0xffL)])));
							}
						}
					}
				}
			}
			for (int i_14_ = 0; i_14_ < 10; i_14_++)
				((Class366) this).aLong3975 = (1662367026201571203L * ((((Class366) this).aLong3975 * 5093099708756449067L >>> 8) ^ ls[(int) (((((Class366) this).aLong3975 * 5093099708756449067L) ^ (long) anIntArray3973[i_14_]) & 0xffL)]));
			((Class366) this).aLong3975 = (((Class366) this).aLong3975 * 5093099708756449067L >>> 8 ^ ls[(int) (((((Class366) this).aLong3975 * 5093099708756449067L) ^ (long) (aBoolean3977 ? 1 : 0)) & 0xffL)]) * 1662367026201571203L;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pf.k(").append(')').toString());
		}
	}

	public Class387 method4543(GraphicsToolkit class_ra, int i, Class144 class144, Class507 class507, Class477 class477, Class395 class395, Interface23 interface23, Class438 class438, int i_15_) {
		try {
			if (-1 != anInt3974 * 164936249)
				return (class507.method6269(anInt3974 * 164936249, 491367243).method6237(class_ra, i, interface23, class438, null, -218177955));
			int i_16_ = class438 != null ? i | class438.method5829(-1790708337) : i;
			Class387 class387;
			synchronized (aClass348_3980) {
				class387 = (Class387) aClass348_3980.method4184(5093099708756449067L * (((Class366) this).aLong3975));
			}
			if (class387 == null || class_ra.method5017(class387.m(), i_16_) != 0) {
				if (null != class387)
					i_16_ = class_ra.method5004(i_16_, class387.m());
				int i_17_ = i_16_;
				boolean bool = false;
				for (int i_18_ = 0; i_18_ < ((Class366) this).anIntArray3969.length; i_18_++) {
					int i_19_ = ((Class366) this).anIntArray3969[i_18_];
					ItemEffects class464 = null;
					if ((i_19_ & 0x40000000) != 0) {
						if (null != ((Class366) this).aClass464Array3971 && (((Class366) this).aClass464Array3971[i_18_] != null))
							class464 = ((Class366) this).aClass464Array3971[i_18_];
						if (!class477.getItemDefinitions(i_19_ & 0x3fffffff).method6035(aBoolean3977, class464, (byte) 0))
							bool = true;
					} else if ((i_19_ & ~0x7fffffff) != 0 && !class144.method1579(i_19_ & 0x3fffffff, -939984800).method1475(-783889357))
						bool = true;
				}
				if (bool)
					return null;
				Model[] class64s = new Model[((Class366) this).anIntArray3969.length];
				int i_20_ = 0;
				for (int i_21_ = 0; i_21_ < ((Class366) this).anIntArray3969.length; i_21_++) {
					int i_22_ = ((Class366) this).anIntArray3969[i_21_];
					ItemEffects class464 = null;
					if (0 != (i_22_ & 0x40000000)) {
						if (((Class366) this).aClass464Array3971 != null && (((Class366) this).aClass464Array3971[i_21_] != null))
							class464 = ((Class366) this).aClass464Array3971[i_21_];
						Model model = (class477.getItemDefinitions(i_22_ & 0x3fffffff).method6040(aBoolean3977, class464, 327827223));
						if (model != null)
							class64s[i_20_++] = model;
					} else if ((i_22_ & ~0x7fffffff) != 0) {
						Model model = class144.method1579(i_22_ & 0x3fffffff, -276971058).method1476(1209505122);
						if (null != model)
							class64s[i_20_++] = model;
					}
				}
				Model model = new Model(class64s, i_20_);
				i_17_ |= 0x4000;
				class387 = class_ra.method5037(model, i_17_, anInt3981 * 1931277641, 64, 768);
				for (int i_23_ = 0; i_23_ < 10; i_23_++) {
					for (int i_24_ = 0; i_24_ < aShortArrayArray3970[i_23_].length; i_24_++) {
						if (anIntArray3973[i_23_] < (Class22.aShortArrayArrayArray278[i_23_][i_24_]).length)
							class387.X(aShortArrayArray3970[i_23_][i_24_], (Class22.aShortArrayArrayArray278[i_23_][i_24_][anIntArray3973[i_23_]]));
					}
				}
				class387.KA(i_16_);
				synchronized (aClass348_3980) {
					aClass348_3980.method4194(class387, (((Class366) this).aLong3975 * 5093099708756449067L));
				}
			}
			if (null == class438)
				return class387;
			Class387 class387_25_ = class387.method4755((byte) 4, i_16_, true);
			class438.method5839(class387_25_, 0, -1353467740);
			return class387_25_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pf.u(").append(')').toString());
		}
	}

	public Class387 method4544(GraphicsToolkit class_ra, int i, Class144 class144, Class395 class395, Class438 class438, int i_26_, int i_27_, int i_28_, byte i_29_) {
		try {
			int i_30_ = class438 != null ? i | class438.method5829(-1790708337) : i;
			long l = (long) i_28_ << 32 | (long) (i_27_ << 16) | (long) i_26_;
			Class387 class387;
			synchronized (aClass348_3980) {
				class387 = (Class387) aClass348_3980.method4184(l);
			}
			do {
				if (class387 == null || class_ra.method5017(class387.m(), i_30_) != 0) {
					if (null != class387)
						i_30_ = class_ra.method5004(i_30_, class387.m());
					int i_31_ = i_30_;
					Model[] class64s = new Model[3];
					int i_32_ = 0;
					if (class144.method1579(i_26_, -1760783131).method1475(-783889357) && class144.method1579(i_27_, -1162557302).method1475(-783889357) && class144.method1579(i_28_, -839635617).method1475(-783889357)) {
						Model model = class144.method1579(i_26_, -156721354).method1476(1042420956);
						if (model != null)
							class64s[i_32_++] = model;
						model = class144.method1579(i_27_, 773247218).method1476(74933704);
						if (model != null)
							class64s[i_32_++] = model;
						model = class144.method1579(i_28_, 744132841).method1476(552695292);
						if (null != model)
							class64s[i_32_++] = model;
						model = new Model(class64s, i_32_);
						i_31_ |= 0x4000;
						class387 = class_ra.method5037(model, i_31_, 1931277641 * anInt3981, 64, 768);
						for (int i_33_ = 0; i_33_ < 10; i_33_++) {
							for (int i_34_ = 0; i_34_ < aShortArrayArray3970[i_33_].length; i_34_++) {
								if (anIntArray3973[i_33_] < (Class22.aShortArrayArrayArray278[i_33_][i_34_]).length)
									class387.X((aShortArrayArray3970[i_33_][i_34_]), (Class22.aShortArrayArrayArray278[i_33_][i_34_][anIntArray3973[i_33_]]));
							}
						}
						class387.KA(i_30_);
						synchronized (aClass348_3980) {
							aClass348_3980.method4194(class387, l);
							break;
						}
					}
					return null;
				}
			} while (false);
			if (class438 == null)
				return class387;
			class387 = class387.method4755((byte) 4, i_30_, true);
			class438.method5839(class387, 0, -716564268);
			return class387;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pf.x(").append(')').toString());
		}
	}

	public Class387 method4545(GraphicsToolkit class_ra, int i, Class349 class349, Class144 class144, Class507 class507, Class477 class477, Class395 class395, Interface23 interface23, Class438 class438, Class438 class438_35_, Class438[] class438s, int[] is, int i_36_, boolean bool, Class405 class405, int i_37_) {
		try {
			if (anInt3974 * 164936249 != -1)
				return (class507.method6269(anInt3974 * 164936249, 1899433887).method6246(class_ra, i, class349, interface23, class438, class438_35_, class438s, is, i_36_, null, -884053309));
			int i_38_ = i;
			long l = ((Class366) this).aLong3975 * 5093099708756449067L;
			int[] is_39_ = ((Class366) this).anIntArray3969;
			boolean bool_40_ = false;
			boolean bool_41_ = false;
			if (null != class438) {
				Class391 class391 = class438.method5820(28542107);
				if (null != class391 && (609841829 * class391.anInt4179 >= 0 || 1548903495 * class391.anInt4180 >= 0)) {
					is_39_ = new int[((Class366) this).anIntArray3969.length];
					for (int i_42_ = 0; i_42_ < is_39_.length; i_42_++)
						is_39_[i_42_] = ((Class366) this).anIntArray3969[i_42_];
					if (class391.anInt4179 * 609841829 >= 0 && -1 != -817429509 * class405.anInt5266) {
						bool_40_ = true;
						if (65535 == class391.anInt4179 * 609841829) {
							is_39_[-817429509 * class405.anInt5266] = 0;
							for (int i_43_ = 0; i_43_ < class405.anIntArray5272.length; i_43_++)
								is_39_[class405.anIntArray5272[i_43_]] = 0;
							l ^= ~0xffffffffL;
						} else {
							is_39_[-817429509 * class405.anInt5266] = 609841829 * class391.anInt4179 | 0x40000000;
							for (int i_44_ = 0; i_44_ < class405.anIntArray5272.length; i_44_++)
								is_39_[class405.anIntArray5272[i_44_]] = 0;
							l ^= (long) is_39_[(class405.anInt5266 * -817429509)] << 32;
						}
					}
					if (1548903495 * class391.anInt4180 >= 0 && -1 != class405.anInt5270 * -2126257265) {
						bool_41_ = true;
						if (class391.anInt4180 * 1548903495 == 65535) {
							is_39_[-2126257265 * class405.anInt5270] = 0;
							for (int i_45_ = 0; i_45_ < class405.anIntArray5273.length; i_45_++)
								is_39_[class405.anIntArray5273[i_45_]] = 0;
							l ^= 0xffffffffL;
						} else {
							is_39_[-2126257265 * class405.anInt5270] = 1548903495 * class391.anInt4180 | 0x40000000;
							for (int i_46_ = 0; i_46_ < class405.anIntArray5273.length; i_46_++)
								is_39_[class405.anIntArray5273[i_46_]] = 0;
							l ^= (long) (is_39_[-2126257265 * class405.anInt5270]);
						}
					}
				}
			}
			boolean bool_47_ = false;
			int i_48_ = null != class438s ? class438s.length : 0;
			for (int i_49_ = 0; i_49_ < i_48_; i_49_++) {
				if (class438s[i_49_] != null) {
					i_38_ |= class438s[i_49_].method5829(-1790708337);
					bool_47_ = true;
				}
			}
			if (null != class438) {
				i_38_ |= class438.method5829(-1790708337);
				bool_47_ = true;
			}
			if (null != class438_35_) {
				i_38_ |= class438_35_.method5829(-1790708337);
				bool_47_ = true;
			}
			boolean bool_50_ = false;
			if (is != null) {
				for (int i_51_ = 0; i_51_ < is.length; i_51_++) {
					if (is[i_51_] != -1) {
						i_38_ |= 0x20;
						bool_50_ = true;
					}
				}
			}
			Class387 class387;
			synchronized (aClass348_3979) {
				class387 = (Class387) aClass348_3979.method4184(l);
			}
			Class350 class350 = null;
			if (((Class366) this).anInt3976 * 767962207 != -1)
				class350 = class349.method4202((((Class366) this).anInt3976 * 767962207), (byte) 29);
			if (null == class387 || class_ra.method5017(class387.m(), i_38_) != 0) {
				if (null != class387)
					i_38_ = class_ra.method5004(i_38_, class387.m());
				int i_52_ = i_38_;
				boolean bool_53_ = false;
				for (int i_54_ = 0; i_54_ < is_39_.length; i_54_++) {
					int i_55_ = is_39_[i_54_];
					ItemEffects class464 = null;
					boolean bool_56_ = false;
					if (bool_40_) {
						if (-817429509 * class405.anInt5266 == i_54_)
							bool_56_ = true;
						else {
							for (int i_57_ = 0; i_57_ < class405.anIntArray5272.length; i_57_++) {
								if (class405.anIntArray5272[i_57_] == i_54_) {
									bool_56_ = true;
									break;
								}
							}
						}
					}
					if (bool_41_) {
						if (i_54_ == -2126257265 * class405.anInt5270)
							bool_56_ = true;
						else {
							for (int i_58_ = 0; i_58_ < class405.anIntArray5273.length; i_58_++) {
								if (class405.anIntArray5273[i_58_] == i_54_) {
									bool_56_ = true;
									break;
								}
							}
						}
					}
					if ((i_55_ & 0x40000000) != 0) {
						if (!bool_56_ && null != ((Class366) this).aClass464Array3971 && (((Class366) this).aClass464Array3971[i_54_] != null))
							class464 = ((Class366) this).aClass464Array3971[i_54_];
						if (!class477.getItemDefinitions(i_55_ & 0x3fffffff).method6034(aBoolean3977, class464, (byte) -1))
							bool_53_ = true;
					} else if ((i_55_ & ~0x7fffffff) != 0 && !class144.method1579(i_55_ & 0x3fffffff, 1033806901).method1477(169549971))
						bool_53_ = true;
				}
				if (bool_53_) {
					if (-1L != (4366628042331861927L * ((Class366) this).aLong3966)) {
						synchronized (aClass348_3979) {
							class387 = (Class387) (aClass348_3979.method4184(4366628042331861927L * ((Class366) this).aLong3966));
						}
					}
					if (null == class387 || class_ra.method5017(class387.m(), i_38_) != 0)
						return null;
				} else {
					Model[] class64s = new Model[is_39_.length];
					for (int i_59_ = 0; i_59_ < is_39_.length; i_59_++) {
						int i_60_ = is_39_[i_59_];
						ItemEffects class464 = null;
						boolean bool_61_ = 5 == i_59_ && bool_40_ || i_59_ == 3 && bool_41_;
						if (0 != (i_60_ & 0x40000000)) {
							if (!bool_61_ && null != ((Class366) this).aClass464Array3971 && (((Class366) this).aClass464Array3971[i_59_] != null))
								class464 = (((Class366) this).aClass464Array3971[i_59_]);
							Model model = (class477.getItemDefinitions(i_60_ & 0x3fffffff).method6028(aBoolean3977, class464, -1675025463));
							if (null != model)
								class64s[i_59_] = model;
						} else if (0 != (i_60_ & ~0x7fffffff)) {
							Model model = class144.method1579(i_60_ & 0x3fffffff, -959041423).method1474((byte) 93);
							if (null != model)
								class64s[i_59_] = model;
						}
					}
					if (class350 != null && null != class350.anIntArrayArray3710) {
						for (int i_62_ = 0; i_62_ < class350.anIntArrayArray3710.length; i_62_++) {
							if (class64s[i_62_] == null) {
								if (i_37_ <= -992714828)
									throw new IllegalStateException();
							} else {
								int i_63_ = 0;
								int i_64_ = 0;
								int i_65_ = 0;
								int i_66_ = 0;
								int i_67_ = 0;
								int i_68_ = 0;
								if (null != class350.anIntArrayArray3710[i_62_]) {
									i_63_ = (class350.anIntArrayArray3710[i_62_][0]);
									i_64_ = (class350.anIntArrayArray3710[i_62_][1]);
									i_65_ = (class350.anIntArrayArray3710[i_62_][2]);
									i_66_ = (class350.anIntArrayArray3710[i_62_][3]) << 3;
									i_67_ = (class350.anIntArrayArray3710[i_62_][4]) << 3;
									i_68_ = (class350.anIntArrayArray3710[i_62_][5]) << 3;
								}
								if (0 != i_66_ || i_67_ != 0 || i_68_ != 0)
									class64s[i_62_].method754(i_66_, i_67_, i_68_);
								if (0 != i_63_ || 0 != i_64_ || i_65_ != 0)
									class64s[i_62_].method753(i_63_, i_64_, i_65_);
							}
						}
					}
					Model model = new Model(class64s, class64s.length);
					i_52_ |= 0x4000;
					class387 = class_ra.method5037(model, i_52_, 1931277641 * anInt3981, 64, 850);
					for (int i_69_ = 0; i_69_ < 10; i_69_++) {
						for (int i_70_ = 0; i_70_ < aShortArrayArray3970[i_69_].length; i_70_++) {
							if (anIntArray3973[i_69_] < (Class22.aShortArrayArrayArray278[i_69_][i_70_]).length)
								class387.X(aShortArrayArray3970[i_69_][i_70_], (Class22.aShortArrayArrayArray278[i_69_][i_70_][anIntArray3973[i_69_]]));
						}
					}
					if (bool) {
						class387.KA(i_38_);
						synchronized (aClass348_3979) {
							aClass348_3979.method4194(class387, l);
						}
						((Class366) this).aLong3966 = l * -2813682692256545769L;
					}
				}
			}
			Class387 class387_71_ = class387.method4755((byte) 4, i_38_, true);
			if (!bool_47_ && !bool_50_)
				return class387_71_;
			Matrix3f[] class222s = null;
			if (class350 != null)
				class222s = class350.method4207((byte) 92);
			if (bool_50_ && class222s != null) {
				for (int i_72_ = 0; i_72_ < is.length; i_72_++) {
					if (null != class222s[i_72_])
						class387_71_.method4741(class222s[i_72_], 1 << i_72_, true);
				}
			}
			int i_73_ = 0;
			int i_74_ = 1;
			while (i_73_ < i_48_) {
				if (null != class438s[i_73_])
					class438s[i_73_].method5830(class387_71_, 0, i_74_, (byte) 57);
				i_73_++;
				i_74_ <<= 1;
			}
			if (bool_50_) {
				for (i_73_ = 0; i_73_ < is.length; i_73_++) {
					if (-1 == is[i_73_]) {
						if (i_37_ <= -992714828)
							throw new IllegalStateException();
					} else {
						i_74_ = is[i_73_] - i_36_;
						i_74_ &= 0x3fff;
						Matrix3f class222 = new Matrix3f();
						class222.method2059(0.0F, 1.0F, 0.0F, Class220.method2049(i_74_));
						class387_71_.method4741(class222, 1 << i_73_, false);
					}
				}
			}
			if (bool_50_ && class222s != null) {
				for (i_73_ = 0; i_73_ < is.length; i_73_++) {
					if (class222s[i_73_] != null)
						class387_71_.method4741(class222s[i_73_], 1 << i_73_, false);
				}
			}
			if (class438 != null && null != class438_35_)
				Class400.method4929(class387_71_, class438, class438_35_, -2147197181);
			else if (null != class438)
				class438.method5839(class387_71_, 0, -390031954);
			else if (null != class438_35_)
				class438_35_.method5839(class387_71_, 0, 1377070013);
			return class387_71_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pf.d(").append(')').toString());
		}
	}

	public void method4546(int i, int[] is, ItemEffects[] class464s, int[] is_75_, boolean bool, int i_76_, int i_77_) {
		try {
			if (i != ((Class366) this).anInt3976 * 767962207)
				((Class366) this).anInt3976 = -698667105 * i;
			((Class366) this).anIntArray3969 = is;
			((Class366) this).aClass464Array3971 = class464s;
			anIntArray3973 = is_75_;
			aBoolean3977 = bool;
			anInt3974 = -993979383 * i_76_;
			method4542(-330295212);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pf.a(").append(')').toString());
		}
	}

	static void method4547(int i) {
		try {
			client.lobbyConnection.method384((byte) 4);
			if (-1868526275 * Class525.anInt6297 < 2) {
				Class241.aClass471_2705.method6058(-1528906992);
				Class525.anInt6295 = 0;
				Class525.anInt6297 += -853495275;
			} else {
				Class525.aClass486_6298 = null;
				Class525.aClass412_6299 = Class412.aClass412_6563;
				Class439.method5851(19, 561881815);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pf.z(").append(')').toString());
		}
	}
}
