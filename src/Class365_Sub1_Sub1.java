/* Class365_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class365_Sub1_Sub1 extends Class365_Sub1 {
	public short aShort9795;
	public short aShort9796;
	public short aShort9797;
	public short aShort9798;
	public boolean aBoolean9799;
	byte aByte9800;

	Class365_Sub1_Sub1(Class331 class331, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, byte i_8_) {
		super(class331);
		plane = (byte) i;
		aByte7724 = (byte) i_0_;
		method4340(new Class217((float) i_1_, (float) i_2_, (float) i_3_));
		aShort9798 = (short) i_4_;
		aShort9796 = (short) i_5_;
		aShort9795 = (short) i_6_;
		aShort9797 = (short) i_7_;
		aBoolean9799 = bool;
		((Class365_Sub1_Sub1) this).aByte9800 = i_8_;
	}

	void method4404(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajf.ew(").append(')').toString());
		}
	}

	int method4354(Class298_Sub10[] class298_sub10s, int i) {
		try {
			int i_9_ = 0;
			while_44_: for (int i_10_ = aShort9798; i_10_ <= aShort9796; i_10_++) {
				for (int i_11_ = aShort9795; i_11_ <= aShort9797; i_11_++) {
					long l = (((Class331) aClass331_7722).aLongArrayArrayArray3554[plane][i_10_][i_11_]);
					long l_12_ = 0L;
					while_43_: while (l_12_ <= 48L) {
						int i_13_ = (int) (l >>> (int) l_12_ & 0xffffL);
						if (i_13_ <= 0)
							break;
						Class321 class321 = (((Class331) aClass331_7722).aClass321Array3558[i_13_ - 1]);
						for (int i_14_ = 0; i_14_ < i_9_; i_14_++) {
							if (class321.aClass298_Sub10_3337 == class298_sub10s[i_14_]) {
								l_12_ += 16L;
								continue while_43_;
							}
						}
						class298_sub10s[i_9_++] = class321.aClass298_Sub10_3337;
						if (i_9_ == 4) {
							if (i == -1150488077) {
								/* empty */
							}
							break while_44_;
						}
						l_12_ += 16L;
					}
				}
			}
			for (int i_15_ = i_9_; i_15_ < 4; i_15_++)
				class298_sub10s[i_15_] = null;
			if (((Class365_Sub1_Sub1) this).aByte9800 != 0) {
				int i_16_ = (aShort9798 - -804213305 * ((Class331) aClass331_7722).anInt3553);
				int i_17_ = (aShort9795 - ((Class331) aClass331_7722).anInt3513 * 465603579);
				short i_18_;
				int i_19_;
				int i_20_;
				short i_21_;
				if (1 == ((Class365_Sub1_Sub1) this).aByte9800) {
					if (i_17_ > i_16_) {
						i_18_ = aShort9798;
						i_19_ = aShort9795 - 1;
						i_20_ = 1 + aShort9798;
						i_21_ = aShort9795;
					} else {
						i_18_ = aShort9798;
						i_19_ = 1 + aShort9795;
						i_20_ = aShort9798 - 1;
						i_21_ = aShort9795;
					}
				} else if (i_17_ > -i_16_) {
					i_18_ = aShort9798;
					i_19_ = aShort9795 - 1;
					i_20_ = aShort9798 - 1;
					i_21_ = aShort9795;
				} else {
					i_18_ = aShort9798;
					i_19_ = aShort9795 + 1;
					i_20_ = aShort9798 + 1;
					i_21_ = aShort9795;
				}
				int i_22_ = 0;
				while_48_: for (/**/; i_22_ < i_9_; i_22_++) {
					long l = (((Class331) aClass331_7722).aLongArrayArrayArray3554[plane][i_18_][i_19_]);
					while_45_: do {
						Class321 class321;
						do {
							if (0L == l)
								break while_45_;
							class321 = (((Class331) aClass331_7722).aClass321Array3558[(int) ((l & 0xffffL) - 1L)]);
							l >>>= 16;
						} while (class321.aClass298_Sub10_3337 != class298_sub10s[i_22_]);
						if (i == -1150488077) {
							/* empty */
						}
						continue while_48_;
					} while (false);
					l = (((Class331) aClass331_7722).aLongArrayArrayArray3554[plane][i_20_][i_21_]);
					while_46_: do {
						Class321 class321;
						do {
							if (0L == l)
								break while_46_;
							class321 = (((Class331) aClass331_7722).aClass321Array3558[(int) ((l & 0xffffL) - 1L)]);
							l >>>= 16;
						} while (class321.aClass298_Sub10_3337 != class298_sub10s[i_22_]);
						if (i == -1150488077) {
							/* empty */
						}
						continue while_48_;
					} while (false);
					for (int i_23_ = i_22_; i_23_ < i_9_ - 1; i_23_++)
						class298_sub10s[i_23_] = class298_sub10s[i_23_ + 1];
					i_9_--;
				}
			}
			return i_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajf.dg(").append(')').toString());
		}
	}

	boolean method4360(int i) {
		try {
			for (int i_24_ = aShort9798; i_24_ <= aShort9796; i_24_++) {
				for (int i_25_ = aShort9795; i_25_ <= aShort9797; i_25_++) {
					int i_26_ = (((Class331) aClass331_7722).anInt3538 * 583010427 + (i_24_ - (((Class331) aClass331_7722).anInt3553 * -804213305)));
					if (i_26_ >= 0) {
						if (i_26_ >= (((Class331) aClass331_7722).aBooleanArrayArray3563).length) {
							if (i == -697358316) {
								/* empty */
							}
						} else {
							int i_27_ = (i_25_ - (465603579 * ((Class331) aClass331_7722).anInt3513) + (((Class331) aClass331_7722).anInt3538 * 583010427));
							if (i_27_ >= 0) {
								if (i_27_ >= (((Class331) aClass331_7722).aBooleanArrayArray3563).length) {
									if (i == -697358316) {
										/* empty */
									}
								} else if (((Class331) aClass331_7722).aBooleanArrayArray3563[i_26_][i_27_])
									return true;
							}
						}
					}
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajf.dq(").append(')').toString());
		}
	}

	boolean method4359(GraphicsToolkit class_ra) {
		return aClass331_7722.aClass333_3512.method4074(aByte7724, aShort9798, aShort9796, aShort9795, aShort9797, method4358(class_ra, (byte) 93));
	}

	int method4390(Class298_Sub10[] class298_sub10s) {
		int i = 0;
		while_50_: for (int i_28_ = aShort9798; i_28_ <= aShort9796; i_28_++) {
			for (int i_29_ = aShort9795; i_29_ <= aShort9797; i_29_++) {
				long l = (((Class331) aClass331_7722).aLongArrayArrayArray3554[plane][i_28_][i_29_]);
				long l_30_ = 0L;
				while_49_: while (l_30_ <= 48L) {
					int i_31_ = (int) (l >>> (int) l_30_ & 0xffffL);
					if (i_31_ <= 0)
						break;
					Class321 class321 = (((Class331) aClass331_7722).aClass321Array3558[i_31_ - 1]);
					for (int i_32_ = 0; i_32_ < i; i_32_++) {
						if (class321.aClass298_Sub10_3337 == class298_sub10s[i_32_]) {
							l_30_ += 16L;
							continue while_49_;
						}
					}
					class298_sub10s[i++] = class321.aClass298_Sub10_3337;
					if (i == 4)
						break while_50_;
					l_30_ += 16L;
				}
			}
		}
		for (int i_33_ = i; i_33_ < 4; i_33_++)
			class298_sub10s[i_33_] = null;
		if (((Class365_Sub1_Sub1) this).aByte9800 != 0) {
			int i_34_ = (aShort9798 - -804213305 * ((Class331) aClass331_7722).anInt3553);
			int i_35_ = (aShort9795 - ((Class331) aClass331_7722).anInt3513 * 465603579);
			short i_36_;
			int i_37_;
			int i_38_;
			short i_39_;
			if (1 == ((Class365_Sub1_Sub1) this).aByte9800) {
				if (i_35_ > i_34_) {
					i_36_ = aShort9798;
					i_37_ = aShort9795 - 1;
					i_38_ = 1 + aShort9798;
					i_39_ = aShort9795;
				} else {
					i_36_ = aShort9798;
					i_37_ = 1 + aShort9795;
					i_38_ = aShort9798 - 1;
					i_39_ = aShort9795;
				}
			} else if (i_35_ > -i_34_) {
				i_36_ = aShort9798;
				i_37_ = aShort9795 - 1;
				i_38_ = aShort9798 - 1;
				i_39_ = aShort9795;
			} else {
				i_36_ = aShort9798;
				i_37_ = aShort9795 + 1;
				i_38_ = aShort9798 + 1;
				i_39_ = aShort9795;
			}
			int i_40_ = 0;
			while_54_: for (/**/; i_40_ < i; i_40_++) {
				long l = (((Class331) aClass331_7722).aLongArrayArrayArray3554[plane][i_36_][i_37_]);
				while_51_: do {
					Class321 class321;
					do {
						if (0L == l)
							break while_51_;
						class321 = (((Class331) aClass331_7722).aClass321Array3558[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
					} while (class321.aClass298_Sub10_3337 != class298_sub10s[i_40_]);
					continue while_54_;
				} while (false);
				l = (((Class331) aClass331_7722).aLongArrayArrayArray3554[plane][i_38_][i_39_]);
				while_52_: do {
					Class321 class321;
					do {
						if (0L == l)
							break while_52_;
						class321 = (((Class331) aClass331_7722).aClass321Array3558[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
					} while (class321.aClass298_Sub10_3337 != class298_sub10s[i_40_]);
					continue while_54_;
				} while (false);
				for (int i_41_ = i_40_; i_41_ < i - 1; i_41_++)
					class298_sub10s[i_41_] = class298_sub10s[i_41_ + 1];
				i--;
			}
		}
		return i;
	}

	boolean method4391(GraphicsToolkit class_ra) {
		return (aClass331_7722.aClass333_3512.method4074(aByte7724, aShort9798, aShort9796, aShort9795, aShort9797, method4358(class_ra, (byte) -38)));
	}

	boolean method4389(GraphicsToolkit class_ra) {
		return aClass331_7722.aClass333_3512.method4074(aByte7724, aShort9798, aShort9796, aShort9795, aShort9797, method4358(class_ra, (byte) 43));
	}

	boolean method4393(GraphicsToolkit class_ra) {
		return aClass331_7722.aClass333_3512.method4074(aByte7724, aShort9798, aShort9796, aShort9795, aShort9797, method4358(class_ra, (byte) -4));
	}

	boolean method4364(GraphicsToolkit class_ra, byte i) {
		try {
			return (aClass331_7722.aClass333_3512.method4074(aByte7724, aShort9798, aShort9796, aShort9795, aShort9797, method4358(class_ra, (byte) -61)));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajf.dl(").append(')').toString());
		}
	}

	boolean method4395() {
		for (int i = aShort9798; i <= aShort9796; i++) {
			for (int i_42_ = aShort9795; i_42_ <= aShort9797; i_42_++) {
				int i_43_ = (((Class331) aClass331_7722).anInt3538 * 583010427 + (i - (((Class331) aClass331_7722).anInt3553 * -804213305)));
				if (i_43_ >= 0 && i_43_ < (((Class331) aClass331_7722).aBooleanArrayArray3563).length) {
					int i_44_ = (i_42_ - 465603579 * ((Class331) aClass331_7722).anInt3513 + (((Class331) aClass331_7722).anInt3538 * 583010427));
					if (i_44_ >= 0 && i_44_ < (((Class331) aClass331_7722).aBooleanArrayArray3563).length && (((Class331) aClass331_7722).aBooleanArrayArray3563[i_43_][i_44_]))
						return true;
				}
			}
		}
		return false;
	}

	boolean method4396() {
		for (int i = aShort9798; i <= aShort9796; i++) {
			for (int i_45_ = aShort9795; i_45_ <= aShort9797; i_45_++) {
				int i_46_ = (((Class331) aClass331_7722).anInt3538 * 583010427 + (i - (((Class331) aClass331_7722).anInt3553 * -804213305)));
				if (i_46_ >= 0 && i_46_ < (((Class331) aClass331_7722).aBooleanArrayArray3563).length) {
					int i_47_ = (i_45_ - 465603579 * ((Class331) aClass331_7722).anInt3513 + (((Class331) aClass331_7722).anInt3538 * 583010427));
					if (i_47_ >= 0 && i_47_ < (((Class331) aClass331_7722).aBooleanArrayArray3563).length && (((Class331) aClass331_7722).aBooleanArrayArray3563[i_46_][i_47_]))
						return true;
				}
			}
		}
		return false;
	}

	boolean method4397() {
		for (int i = aShort9798; i <= aShort9796; i++) {
			for (int i_48_ = aShort9795; i_48_ <= aShort9797; i_48_++) {
				int i_49_ = (((Class331) aClass331_7722).anInt3538 * 583010427 + (i - (((Class331) aClass331_7722).anInt3553 * -804213305)));
				if (i_49_ >= 0 && i_49_ < (((Class331) aClass331_7722).aBooleanArrayArray3563).length) {
					int i_50_ = (i_48_ - 465603579 * ((Class331) aClass331_7722).anInt3513 + (((Class331) aClass331_7722).anInt3538 * 583010427));
					if (i_50_ >= 0 && i_50_ < (((Class331) aClass331_7722).aBooleanArrayArray3563).length && (((Class331) aClass331_7722).aBooleanArrayArray3563[i_49_][i_50_]))
						return true;
				}
			}
		}
		return false;
	}
}
