/* Class521_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class521_Sub1_Sub1 extends Class521_Sub1 {
	byte aByte9454;
	public short aShort9455;
	public short aShort9456;
	public short aShort9457;
	public short aShort9458;
	public boolean aBool9459;

	int method13024(Class282_Sub24[] class282_sub24s) {
		int i = 0;
		while_139_: for (int i_0_ = aShort9458; i_0_ <= aShort9455; i_0_++) {
			for (int i_1_ = aShort9456; i_1_ <= aShort9457; i_1_++) {
				long l = (((Class206) aClass206_7970).aLongArrayArrayArray2645[aByte7967][i_0_][i_1_]);
				long l_2_ = 0L;
				while_138_: while (l_2_ <= 48L) {
					int i_3_ = (int) (l >>> (int) l_2_ & 0xffffL);
					if (i_3_ <= 0)
						break;
					Class287 class287 = (((Class206) aClass206_7970).aClass287Array2646[i_3_ - 1]);
					for (int i_4_ = 0; i_4_ < i; i_4_++) {
						if (class282_sub24s[i_4_] == class287.aClass282_Sub24_3425) {
							l_2_ += 16L;
							continue while_138_;
						}
					}
					class282_sub24s[i++] = class287.aClass282_Sub24_3425;
					if (i == 4)
						break while_139_;
					l_2_ += 16L;
				}
			}
		}
		for (int i_5_ = i; i_5_ < 4; i_5_++)
			class282_sub24s[i_5_] = null;
		if (0 != ((Class521_Sub1_Sub1) this).aByte9454) {
			int i_6_ = (aShort9458 - ((Class206) aClass206_7970).anInt2628 * -527863643);
			int i_7_ = (aShort9456 - 1580412859 * ((Class206) aClass206_7970).anInt2629);
			short i_8_;
			int i_9_;
			int i_10_;
			short i_11_;
			if (((Class521_Sub1_Sub1) this).aByte9454 == 1) {
				if (i_7_ > i_6_) {
					i_8_ = aShort9458;
					i_9_ = aShort9456 - 1;
					i_10_ = 1 + aShort9458;
					i_11_ = aShort9456;
				} else {
					i_8_ = aShort9458;
					i_9_ = 1 + aShort9456;
					i_10_ = aShort9458 - 1;
					i_11_ = aShort9456;
				}
			} else if (i_7_ > -i_6_) {
				i_8_ = aShort9458;
				i_9_ = aShort9456 - 1;
				i_10_ = aShort9458 - 1;
				i_11_ = aShort9456;
			} else {
				i_8_ = aShort9458;
				i_9_ = aShort9456 + 1;
				i_10_ = 1 + aShort9458;
				i_11_ = aShort9456;
			}
			int i_12_ = 0;
			while_141_: for (/**/; i_12_ < i; i_12_++) {
				long l = (((Class206) aClass206_7970).aLongArrayArrayArray2645[aByte7967][i_8_][i_9_]);
				while (0L != l) {
					Class287 class287 = (((Class206) aClass206_7970).aClass287Array2646[(int) ((l & 0xffffL) - 1L)]);
					l >>>= 16;
					if (class282_sub24s[i_12_] == class287.aClass282_Sub24_3425)
						continue while_141_;
				}
				l = (((Class206) aClass206_7970).aLongArrayArrayArray2645[aByte7967][i_10_][i_11_]);
				while (l != 0L) {
					Class287 class287 = (((Class206) aClass206_7970).aClass287Array2646[(int) ((l & 0xffffL) - 1L)]);
					l >>>= 16;
					if (class282_sub24s[i_12_] == class287.aClass282_Sub24_3425)
						continue while_141_;
				}
				for (int i_13_ = i_12_; i_13_ < i - 1; i_13_++)
					class282_sub24s[i_13_] = class282_sub24s[1 + i_13_];
				i--;
			}
		}
		return i;
	}

	void method14697(byte i) {
		/* empty */
	}

	int method13036(Class282_Sub24[] class282_sub24s, int i) {
		int i_14_ = 0;
		while_143_: for (int i_15_ = aShort9458; i_15_ <= aShort9455; i_15_++) {
			for (int i_16_ = aShort9456; i_16_ <= aShort9457; i_16_++) {
				long l = (((Class206) aClass206_7970).aLongArrayArrayArray2645[aByte7967][i_15_][i_16_]);
				long l_17_ = 0L;
				while_142_: while (l_17_ <= 48L) {
					int i_18_ = (int) (l >>> (int) l_17_ & 0xffffL);
					if (i_18_ <= 0)
						break;
					Class287 class287 = (((Class206) aClass206_7970).aClass287Array2646[i_18_ - 1]);
					for (int i_19_ = 0; i_19_ < i_14_; i_19_++) {
						if (class282_sub24s[i_19_] == class287.aClass282_Sub24_3425) {
							l_17_ += 16L;
							continue while_142_;
						}
					}
					class282_sub24s[i_14_++] = class287.aClass282_Sub24_3425;
					if (i_14_ == 4)
						break while_143_;
					l_17_ += 16L;
				}
			}
		}
		for (int i_20_ = i_14_; i_20_ < 4; i_20_++)
			class282_sub24s[i_20_] = null;
		if (0 != ((Class521_Sub1_Sub1) this).aByte9454) {
			int i_21_ = (aShort9458 - ((Class206) aClass206_7970).anInt2628 * -527863643);
			int i_22_ = (aShort9456 - 1580412859 * ((Class206) aClass206_7970).anInt2629);
			short i_23_;
			int i_24_;
			int i_25_;
			short i_26_;
			if (((Class521_Sub1_Sub1) this).aByte9454 == 1) {
				if (i_22_ > i_21_) {
					i_23_ = aShort9458;
					i_24_ = aShort9456 - 1;
					i_25_ = 1 + aShort9458;
					i_26_ = aShort9456;
				} else {
					i_23_ = aShort9458;
					i_24_ = 1 + aShort9456;
					i_25_ = aShort9458 - 1;
					i_26_ = aShort9456;
				}
			} else if (i_22_ > -i_21_) {
				i_23_ = aShort9458;
				i_24_ = aShort9456 - 1;
				i_25_ = aShort9458 - 1;
				i_26_ = aShort9456;
			} else {
				i_23_ = aShort9458;
				i_24_ = aShort9456 + 1;
				i_25_ = 1 + aShort9458;
				i_26_ = aShort9456;
			}
			int i_27_ = 0;
			while_145_: for (/**/; i_27_ < i_14_; i_27_++) {
				long l = (((Class206) aClass206_7970).aLongArrayArrayArray2645[aByte7967][i_23_][i_24_]);
				while (0L != l) {
					Class287 class287 = (((Class206) aClass206_7970).aClass287Array2646[(int) ((l & 0xffffL) - 1L)]);
					l >>>= 16;
					if (class282_sub24s[i_27_] == class287.aClass282_Sub24_3425)
						continue while_145_;
				}
				l = (((Class206) aClass206_7970).aLongArrayArrayArray2645[aByte7967][i_25_][i_26_]);
				while (l != 0L) {
					Class287 class287 = (((Class206) aClass206_7970).aClass287Array2646[(int) ((l & 0xffffL) - 1L)]);
					l >>>= 16;
					if (class282_sub24s[i_27_] == class287.aClass282_Sub24_3425)
						continue while_145_;
				}
				for (int i_28_ = i_27_; i_28_ < i_14_ - 1; i_28_++)
					class282_sub24s[i_28_] = class282_sub24s[1 + i_28_];
				i_14_--;
			}
		}
		return i_14_;
	}

	boolean method13037(Class505 class505, int i) {
		return (aClass206_7970.aClass201_2600.method3274(aByte7968, aShort9458, aShort9455, aShort9456, aShort9457, method12992(class505, (byte) -128)));
	}

	boolean method13029(byte i) {
		for (int i_29_ = aShort9458; i_29_ <= aShort9455; i_29_++) {
			for (int i_30_ = aShort9456; i_30_ <= aShort9457; i_30_++) {
				int i_31_ = (i_29_ - ((Class206) aClass206_7970).anInt2628 * -527863643 + ((Class206) aClass206_7970).anInt2652 * 1459994833);
				if (i_31_ >= 0 && i_31_ < (((Class206) aClass206_7970).aBoolArrayArray2651).length) {
					int i_32_ = (((Class206) aClass206_7970).anInt2652 * 1459994833 + (i_30_ - 1580412859 * (((Class206) aClass206_7970).anInt2629)));
					if (i_32_ >= 0 && i_32_ < (((Class206) aClass206_7970).aBoolArrayArray2651).length && (((Class206) aClass206_7970).aBoolArrayArray2651[i_31_][i_32_]))
						return true;
				}
			}
		}
		return false;
	}

	void method14698() {
		/* empty */
	}

	void method14699() {
		/* empty */
	}

	int method13031(Class282_Sub24[] class282_sub24s) {
		int i = 0;
		while_147_: for (int i_33_ = aShort9458; i_33_ <= aShort9455; i_33_++) {
			for (int i_34_ = aShort9456; i_34_ <= aShort9457; i_34_++) {
				long l = (((Class206) aClass206_7970).aLongArrayArrayArray2645[aByte7967][i_33_][i_34_]);
				long l_35_ = 0L;
				while_146_: while (l_35_ <= 48L) {
					int i_36_ = (int) (l >>> (int) l_35_ & 0xffffL);
					if (i_36_ <= 0)
						break;
					Class287 class287 = (((Class206) aClass206_7970).aClass287Array2646[i_36_ - 1]);
					for (int i_37_ = 0; i_37_ < i; i_37_++) {
						if (class282_sub24s[i_37_] == class287.aClass282_Sub24_3425) {
							l_35_ += 16L;
							continue while_146_;
						}
					}
					class282_sub24s[i++] = class287.aClass282_Sub24_3425;
					if (i == 4)
						break while_147_;
					l_35_ += 16L;
				}
			}
		}
		for (int i_38_ = i; i_38_ < 4; i_38_++)
			class282_sub24s[i_38_] = null;
		if (0 != ((Class521_Sub1_Sub1) this).aByte9454) {
			int i_39_ = (aShort9458 - ((Class206) aClass206_7970).anInt2628 * -527863643);
			int i_40_ = (aShort9456 - 1580412859 * ((Class206) aClass206_7970).anInt2629);
			short i_41_;
			int i_42_;
			int i_43_;
			short i_44_;
			if (((Class521_Sub1_Sub1) this).aByte9454 == 1) {
				if (i_40_ > i_39_) {
					i_41_ = aShort9458;
					i_42_ = aShort9456 - 1;
					i_43_ = 1 + aShort9458;
					i_44_ = aShort9456;
				} else {
					i_41_ = aShort9458;
					i_42_ = 1 + aShort9456;
					i_43_ = aShort9458 - 1;
					i_44_ = aShort9456;
				}
			} else if (i_40_ > -i_39_) {
				i_41_ = aShort9458;
				i_42_ = aShort9456 - 1;
				i_43_ = aShort9458 - 1;
				i_44_ = aShort9456;
			} else {
				i_41_ = aShort9458;
				i_42_ = aShort9456 + 1;
				i_43_ = 1 + aShort9458;
				i_44_ = aShort9456;
			}
			int i_45_ = 0;
			while_149_: for (/**/; i_45_ < i; i_45_++) {
				long l = (((Class206) aClass206_7970).aLongArrayArrayArray2645[aByte7967][i_41_][i_42_]);
				while (0L != l) {
					Class287 class287 = (((Class206) aClass206_7970).aClass287Array2646[(int) ((l & 0xffffL) - 1L)]);
					l >>>= 16;
					if (class282_sub24s[i_45_] == class287.aClass282_Sub24_3425)
						continue while_149_;
				}
				l = (((Class206) aClass206_7970).aLongArrayArrayArray2645[aByte7967][i_43_][i_44_]);
				while (l != 0L) {
					Class287 class287 = (((Class206) aClass206_7970).aClass287Array2646[(int) ((l & 0xffffL) - 1L)]);
					l >>>= 16;
					if (class282_sub24s[i_45_] == class287.aClass282_Sub24_3425)
						continue while_149_;
				}
				for (int i_46_ = i_45_; i_46_ < i - 1; i_46_++)
					class282_sub24s[i_46_] = class282_sub24s[1 + i_46_];
				i--;
			}
		}
		return i;
	}

	boolean method13022(Class505 class505) {
		return (aClass206_7970.aClass201_2600.method3274(aByte7968, aShort9458, aShort9455, aShort9456, aShort9457, method12992(class505, (byte) -106)));
	}

	boolean method13032() {
		for (int i = aShort9458; i <= aShort9455; i++) {
			for (int i_47_ = aShort9456; i_47_ <= aShort9457; i_47_++) {
				int i_48_ = (i - ((Class206) aClass206_7970).anInt2628 * -527863643 + ((Class206) aClass206_7970).anInt2652 * 1459994833);
				if (i_48_ >= 0 && i_48_ < (((Class206) aClass206_7970).aBoolArrayArray2651).length) {
					int i_49_ = (((Class206) aClass206_7970).anInt2652 * 1459994833 + (i_47_ - 1580412859 * (((Class206) aClass206_7970).anInt2629)));
					if (i_49_ >= 0 && i_49_ < (((Class206) aClass206_7970).aBoolArrayArray2651).length && (((Class206) aClass206_7970).aBoolArrayArray2651[i_48_][i_49_]))
						return true;
				}
			}
		}
		return false;
	}

	int method12982(Class282_Sub24[] class282_sub24s) {
		int i = 0;
		while_151_: for (int i_50_ = aShort9458; i_50_ <= aShort9455; i_50_++) {
			for (int i_51_ = aShort9456; i_51_ <= aShort9457; i_51_++) {
				long l = (((Class206) aClass206_7970).aLongArrayArrayArray2645[aByte7967][i_50_][i_51_]);
				long l_52_ = 0L;
				while_150_: while (l_52_ <= 48L) {
					int i_53_ = (int) (l >>> (int) l_52_ & 0xffffL);
					if (i_53_ <= 0)
						break;
					Class287 class287 = (((Class206) aClass206_7970).aClass287Array2646[i_53_ - 1]);
					for (int i_54_ = 0; i_54_ < i; i_54_++) {
						if (class282_sub24s[i_54_] == class287.aClass282_Sub24_3425) {
							l_52_ += 16L;
							continue while_150_;
						}
					}
					class282_sub24s[i++] = class287.aClass282_Sub24_3425;
					if (i == 4)
						break while_151_;
					l_52_ += 16L;
				}
			}
		}
		for (int i_55_ = i; i_55_ < 4; i_55_++)
			class282_sub24s[i_55_] = null;
		if (0 != ((Class521_Sub1_Sub1) this).aByte9454) {
			int i_56_ = (aShort9458 - ((Class206) aClass206_7970).anInt2628 * -527863643);
			int i_57_ = (aShort9456 - 1580412859 * ((Class206) aClass206_7970).anInt2629);
			short i_58_;
			int i_59_;
			int i_60_;
			short i_61_;
			if (((Class521_Sub1_Sub1) this).aByte9454 == 1) {
				if (i_57_ > i_56_) {
					i_58_ = aShort9458;
					i_59_ = aShort9456 - 1;
					i_60_ = 1 + aShort9458;
					i_61_ = aShort9456;
				} else {
					i_58_ = aShort9458;
					i_59_ = 1 + aShort9456;
					i_60_ = aShort9458 - 1;
					i_61_ = aShort9456;
				}
			} else if (i_57_ > -i_56_) {
				i_58_ = aShort9458;
				i_59_ = aShort9456 - 1;
				i_60_ = aShort9458 - 1;
				i_61_ = aShort9456;
			} else {
				i_58_ = aShort9458;
				i_59_ = aShort9456 + 1;
				i_60_ = 1 + aShort9458;
				i_61_ = aShort9456;
			}
			int i_62_ = 0;
			while_153_: for (/**/; i_62_ < i; i_62_++) {
				long l = (((Class206) aClass206_7970).aLongArrayArrayArray2645[aByte7967][i_58_][i_59_]);
				while (0L != l) {
					Class287 class287 = (((Class206) aClass206_7970).aClass287Array2646[(int) ((l & 0xffffL) - 1L)]);
					l >>>= 16;
					if (class282_sub24s[i_62_] == class287.aClass282_Sub24_3425)
						continue while_153_;
				}
				l = (((Class206) aClass206_7970).aLongArrayArrayArray2645[aByte7967][i_60_][i_61_]);
				while (l != 0L) {
					Class287 class287 = (((Class206) aClass206_7970).aClass287Array2646[(int) ((l & 0xffffL) - 1L)]);
					l >>>= 16;
					if (class282_sub24s[i_62_] == class287.aClass282_Sub24_3425)
						continue while_153_;
				}
				for (int i_63_ = i_62_; i_63_ < i - 1; i_63_++)
					class282_sub24s[i_63_] = class282_sub24s[1 + i_63_];
				i--;
			}
		}
		return i;
	}

	boolean method13030(Class505 class505) {
		return (aClass206_7970.aClass201_2600.method3274(aByte7968, aShort9458, aShort9455, aShort9456, aShort9457, method12992(class505, (byte) -58)));
	}

	boolean method12988(Class505 class505) {
		return (aClass206_7970.aClass201_2600.method3274(aByte7968, aShort9458, aShort9455, aShort9456, aShort9457, method12992(class505, (byte) -101)));
	}

	int method13025(Class282_Sub24[] class282_sub24s) {
		int i = 0;
		while_155_: for (int i_64_ = aShort9458; i_64_ <= aShort9455; i_64_++) {
			for (int i_65_ = aShort9456; i_65_ <= aShort9457; i_65_++) {
				long l = (((Class206) aClass206_7970).aLongArrayArrayArray2645[aByte7967][i_64_][i_65_]);
				long l_66_ = 0L;
				while_154_: while (l_66_ <= 48L) {
					int i_67_ = (int) (l >>> (int) l_66_ & 0xffffL);
					if (i_67_ <= 0)
						break;
					Class287 class287 = (((Class206) aClass206_7970).aClass287Array2646[i_67_ - 1]);
					for (int i_68_ = 0; i_68_ < i; i_68_++) {
						if (class282_sub24s[i_68_] == class287.aClass282_Sub24_3425) {
							l_66_ += 16L;
							continue while_154_;
						}
					}
					class282_sub24s[i++] = class287.aClass282_Sub24_3425;
					if (i == 4)
						break while_155_;
					l_66_ += 16L;
				}
			}
		}
		for (int i_69_ = i; i_69_ < 4; i_69_++)
			class282_sub24s[i_69_] = null;
		if (0 != ((Class521_Sub1_Sub1) this).aByte9454) {
			int i_70_ = (aShort9458 - ((Class206) aClass206_7970).anInt2628 * -527863643);
			int i_71_ = (aShort9456 - 1580412859 * ((Class206) aClass206_7970).anInt2629);
			short i_72_;
			int i_73_;
			int i_74_;
			short i_75_;
			if (((Class521_Sub1_Sub1) this).aByte9454 == 1) {
				if (i_71_ > i_70_) {
					i_72_ = aShort9458;
					i_73_ = aShort9456 - 1;
					i_74_ = 1 + aShort9458;
					i_75_ = aShort9456;
				} else {
					i_72_ = aShort9458;
					i_73_ = 1 + aShort9456;
					i_74_ = aShort9458 - 1;
					i_75_ = aShort9456;
				}
			} else if (i_71_ > -i_70_) {
				i_72_ = aShort9458;
				i_73_ = aShort9456 - 1;
				i_74_ = aShort9458 - 1;
				i_75_ = aShort9456;
			} else {
				i_72_ = aShort9458;
				i_73_ = aShort9456 + 1;
				i_74_ = 1 + aShort9458;
				i_75_ = aShort9456;
			}
			int i_76_ = 0;
			while_157_: for (/**/; i_76_ < i; i_76_++) {
				long l = (((Class206) aClass206_7970).aLongArrayArrayArray2645[aByte7967][i_72_][i_73_]);
				while (0L != l) {
					Class287 class287 = (((Class206) aClass206_7970).aClass287Array2646[(int) ((l & 0xffffL) - 1L)]);
					l >>>= 16;
					if (class282_sub24s[i_76_] == class287.aClass282_Sub24_3425)
						continue while_157_;
				}
				l = (((Class206) aClass206_7970).aLongArrayArrayArray2645[aByte7967][i_74_][i_75_]);
				while (l != 0L) {
					Class287 class287 = (((Class206) aClass206_7970).aClass287Array2646[(int) ((l & 0xffffL) - 1L)]);
					l >>>= 16;
					if (class282_sub24s[i_76_] == class287.aClass282_Sub24_3425)
						continue while_157_;
				}
				for (int i_77_ = i_76_; i_77_ < i - 1; i_77_++)
					class282_sub24s[i_77_] = class282_sub24s[1 + i_77_];
				i--;
			}
		}
		return i;
	}

	boolean method12998(Class505 class505) {
		return (aClass206_7970.aClass201_2600.method3274(aByte7968, aShort9458, aShort9455, aShort9456, aShort9457, method12992(class505, (byte) -56)));
	}

	boolean method13033() {
		for (int i = aShort9458; i <= aShort9455; i++) {
			for (int i_78_ = aShort9456; i_78_ <= aShort9457; i_78_++) {
				int i_79_ = (i - ((Class206) aClass206_7970).anInt2628 * -527863643 + ((Class206) aClass206_7970).anInt2652 * 1459994833);
				if (i_79_ >= 0 && i_79_ < (((Class206) aClass206_7970).aBoolArrayArray2651).length) {
					int i_80_ = (((Class206) aClass206_7970).anInt2652 * 1459994833 + (i_78_ - 1580412859 * (((Class206) aClass206_7970).anInt2629)));
					if (i_80_ >= 0 && i_80_ < (((Class206) aClass206_7970).aBoolArrayArray2651).length && (((Class206) aClass206_7970).aBoolArrayArray2651[i_79_][i_80_]))
						return true;
				}
			}
		}
		return false;
	}

	Class521_Sub1_Sub1(Class206 class206, int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, boolean bool, byte i_89_) {
		super(class206);
		aByte7967 = (byte) i;
		aByte7968 = (byte) i_81_;
		method11171(new Class385((float) i_82_, (float) i_83_, (float) i_84_));
		aShort9458 = (short) i_85_;
		aShort9455 = (short) i_86_;
		aShort9456 = (short) i_87_;
		aShort9457 = (short) i_88_;
		aBool9459 = bool;
		((Class521_Sub1_Sub1) this).aByte9454 = i_89_;
	}

	boolean method13034() {
		for (int i = aShort9458; i <= aShort9455; i++) {
			for (int i_90_ = aShort9456; i_90_ <= aShort9457; i_90_++) {
				int i_91_ = (i - ((Class206) aClass206_7970).anInt2628 * -527863643 + ((Class206) aClass206_7970).anInt2652 * 1459994833);
				if (i_91_ >= 0 && i_91_ < (((Class206) aClass206_7970).aBoolArrayArray2651).length) {
					int i_92_ = (((Class206) aClass206_7970).anInt2652 * 1459994833 + (i_90_ - 1580412859 * (((Class206) aClass206_7970).anInt2629)));
					if (i_92_ >= 0 && i_92_ < (((Class206) aClass206_7970).aBoolArrayArray2651).length && (((Class206) aClass206_7970).aBoolArrayArray2651[i_91_][i_92_]))
						return true;
				}
			}
		}
		return false;
	}
}
