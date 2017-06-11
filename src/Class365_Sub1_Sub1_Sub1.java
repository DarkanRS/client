/* Class365_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class365_Sub1_Sub1_Sub1 extends Class365_Sub1_Sub1 {
	int anInt10041;
	int anInt10042;
	int anInt10043;
	public int anInt10044;
	public int anInt10045;
	int anInt10046;
	Class438 aClass438_10047;
	int anInt10048;
	public int anInt10049;
	double aDouble10050;
	boolean aBoolean10051;
	boolean aBoolean10052 = false;
	double aDouble10053;
	int anInt10054;
	double aDouble10055;
	double aDouble10056;
	double aDouble10057;
	public int anInt10058;
	int anInt10059 = 0;
	boolean aBoolean10060 = false;
	Class351 aClass351_10061;

	final boolean method4400() {
		return false;
	}

	boolean method4353() {
		return false;
	}

	public int method4361(int i) {
		try {
			return ((Class365_Sub1_Sub1_Sub1) this).anInt10059 * 1137666943;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.bm(").append(')').toString());
		}
	}

	public int method4380() {
		return ((Class365_Sub1_Sub1_Sub1) this).anInt10059 * 1137666943;
	}

	public final void method4405(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			Class217 class217 = Class217.method2005(method4337().aClass217_2599);
			if (!((Class365_Sub1_Sub1_Sub1) this).aBoolean10052) {
				float f = (float) i - class217.aFloat2451;
				float f_4_ = (float) i_0_ - class217.aFloat2454;
				float f_5_ = (float) Math.sqrt((double) (f_4_ * f_4_ + f * f));
				if (0.0F != f_5_) {
					class217.aFloat2451 += (float) (732601943 * (((Class365_Sub1_Sub1_Sub1) this).anInt10054)) * f / f_5_;
					class217.aFloat2454 += (float) (732601943 * (((Class365_Sub1_Sub1_Sub1) this).anInt10054)) * f_4_ / f_5_;
				}
				if (((Class365_Sub1_Sub1_Sub1) this).aBoolean10051)
					class217.aFloat2455 = (float) (Class356.method4271((int) (class217.aFloat2451), (int) (class217.aFloat2454), plane, -1463922586) - (((Class365_Sub1_Sub1_Sub1) this).anInt10042) * 1403412253);
				method4340(class217);
			}
			double d = (double) (anInt10049 * -1349988959 + 1 - i_2_);
			((Class365_Sub1_Sub1_Sub1) this).aDouble10053 = (double) ((float) i - class217.aFloat2451) / d;
			((Class365_Sub1_Sub1_Sub1) this).aDouble10050 = (double) ((float) i_0_ - class217.aFloat2454) / d;
			((Class365_Sub1_Sub1_Sub1) this).aDouble10055 = Math.sqrt((((Class365_Sub1_Sub1_Sub1) this).aDouble10050 * ((Class365_Sub1_Sub1_Sub1) this).aDouble10050) + (((Class365_Sub1_Sub1_Sub1) this).aDouble10053 * (((Class365_Sub1_Sub1_Sub1) this).aDouble10053)));
			if (-1 != ((Class365_Sub1_Sub1_Sub1) this).anInt10048 * 1575706083) {
				if (!((Class365_Sub1_Sub1_Sub1) this).aBoolean10052)
					((Class365_Sub1_Sub1_Sub1) this).aDouble10056 = (-((Class365_Sub1_Sub1_Sub1) this).aDouble10055 * Math.tan(0.02454369 * (double) (1575706083 * ((Class365_Sub1_Sub1_Sub1) this).anInt10048)));
				((Class365_Sub1_Sub1_Sub1) this).aDouble10057 = (2.0 * ((double) ((float) i_1_ - class217.aFloat2455) - d * ((Class365_Sub1_Sub1_Sub1) this).aDouble10056) / (d * d));
			} else
				((Class365_Sub1_Sub1_Sub1) this).aDouble10056 = (double) ((float) i_1_ - class217.aFloat2455) / d;
			class217.method2006();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.a(").append(')').toString());
		}
	}

	public void method4406(int i) {
		try {
			if (!((Class365_Sub1_Sub1_Sub1) this).aBoolean10052) {
				if (0 != (((Class365_Sub1_Sub1_Sub1) this).anInt10043 * 132125965)) {
					Entity class365_sub1_sub1_sub2 = null;
					if (client.anInt8724 * 1596783995 == 0)
						class365_sub1_sub1_sub2 = Class87.aClass94Array794[(((Class365_Sub1_Sub1_Sub1) this).anInt10043 * 132125965) - 1].method1015(1781553547);
					else if ((((Class365_Sub1_Sub1_Sub1) this).anInt10043 * 132125965) < 0) {
						int i_6_ = (-(((Class365_Sub1_Sub1_Sub1) this).anInt10043 * 132125965) - 1);
						if (-442628795 * client.playerIndex == i_6_)
							class365_sub1_sub1_sub2 = Class287.myPlayer;
						else
							class365_sub1_sub1_sub2 = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_6_]);
					} else {
						int i_7_ = ((132125965 * ((Class365_Sub1_Sub1_Sub1) this).anInt10043) - 1);
						Class298_Sub29 class298_sub29 = ((Class298_Sub29) client.npcs.get((long) i_7_));
						if (null != class298_sub29)
							class365_sub1_sub1_sub2 = ((Entity) class298_sub29.anObject7366);
					}
					if (class365_sub1_sub1_sub2 != null) {
						Class217 class217 = (class365_sub1_sub1_sub2.method4337().aClass217_2599);
						method4341(class217.aFloat2451, (float) ((Class356.method4271((int) class217.aFloat2451, (int) class217.aFloat2454, plane, -1098231500)) - (1403412253 * ((Class365_Sub1_Sub1_Sub1) this).anInt10042)), class217.aFloat2454);
						if ((((Class365_Sub1_Sub1_Sub1) this).anInt10041 * -1955698847) >= 0) {
							Class350 class350 = class365_sub1_sub1_sub2.method4426(399670605);
							int i_8_ = 0;
							int i_9_ = 0;
							if (null != class350.anIntArrayArray3710 && null != (class350.anIntArrayArray3710[(((Class365_Sub1_Sub1_Sub1) this).anInt10041) * -1955698847])) {
								i_8_ += (class350.anIntArrayArray3710[(-1955698847 * (((Class365_Sub1_Sub1_Sub1) this).anInt10041))][0]);
								i_9_ += (class350.anIntArrayArray3710[(((Class365_Sub1_Sub1_Sub1) this).anInt10041) * -1955698847][2]);
							}
							if (class350.anIntArrayArray3753 != null && ((class350.anIntArrayArray3753[-1955698847 * ((Class365_Sub1_Sub1_Sub1) this).anInt10041]) != null)) {
								i_8_ += (class350.anIntArrayArray3753[(-1955698847 * (((Class365_Sub1_Sub1_Sub1) this).anInt10041))][0]);
								i_9_ += (class350.anIntArrayArray3753[(((Class365_Sub1_Sub1_Sub1) this).anInt10041) * -1955698847][2]);
							}
							if (i_8_ != 0 || 0 != i_9_) {
								int i_10_ = class365_sub1_sub1_sub2.aClass386_10084.method4719((byte) 0);
								int i_11_ = i_10_;
								if ((class365_sub1_sub1_sub2.anIntArray10085 != null) && (class365_sub1_sub1_sub2.anIntArray10085[(((Class365_Sub1_Sub1_Sub1) this).anInt10041) * -1955698847]) != -1)
									i_11_ = (class365_sub1_sub1_sub2.anIntArray10085[(-1955698847 * ((Class365_Sub1_Sub1_Sub1) this).anInt10041)]);
								int i_12_ = i_11_ - i_10_ & 0x3fff;
								int i_13_ = Class220.anIntArray2483[i_12_];
								int i_14_ = Class220.anIntArray2474[i_12_];
								int i_15_ = i_9_ * i_13_ + i_8_ * i_14_ >> 14;
								i_9_ = i_9_ * i_14_ - i_13_ * i_8_ >> 14;
								i_8_ = i_15_;
								Class217 class217_16_ = Class217.method2005(method4337().aClass217_2599);
								class217_16_.aFloat2451 += (float) i_8_;
								class217_16_.aFloat2454 += (float) i_9_;
								method4340(class217_16_);
								class217_16_.method2006();
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.f(").append(')').toString());
		}
	}

	final void method4375(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_17_, int i_18_, boolean bool) {
		throw new IllegalStateException();
	}

	public final void method4407(int i, byte i_19_) {
		try {
			((Class365_Sub1_Sub1_Sub1) this).aBoolean10052 = true;
			Class235 class235 = new Class235(method4337());
			class235.aClass217_2599.aFloat2451 += ((Class365_Sub1_Sub1_Sub1) this).aDouble10053 * (double) i;
			class235.aClass217_2599.aFloat2454 += ((Class365_Sub1_Sub1_Sub1) this).aDouble10050 * (double) i;
			if (((Class365_Sub1_Sub1_Sub1) this).aBoolean10051)
				class235.aClass217_2599.aFloat2455 = (float) (Class356.method4271((int) (class235.aClass217_2599.aFloat2451), (int) (class235.aClass217_2599.aFloat2454), plane, -1903626222) - 1403412253 * (((Class365_Sub1_Sub1_Sub1) this).anInt10042));
			else if (((Class365_Sub1_Sub1_Sub1) this).anInt10048 * 1575706083 != -1) {
				class235.aClass217_2599.aFloat2455 += ((double) i * ((double) i * (0.5 * (((Class365_Sub1_Sub1_Sub1) this).aDouble10057))) + ((double) i * ((Class365_Sub1_Sub1_Sub1) this).aDouble10056));
				((Class365_Sub1_Sub1_Sub1) this).aDouble10056 += ((double) i * ((Class365_Sub1_Sub1_Sub1) this).aDouble10057);
			} else
				class235.aClass217_2599.aFloat2455 += (((Class365_Sub1_Sub1_Sub1) this).aDouble10056 * (double) i);
			class235.aClass218_2600.method2023(1.0F, 0.0F, 0.0F, (float) Math.atan2((((Class365_Sub1_Sub1_Sub1) this).aDouble10056), (((Class365_Sub1_Sub1_Sub1) this).aDouble10055)));
			Class218 class218 = Class218.method2019();
			class218.method2023(0.0F, 1.0F, 0.0F, ((float) Math.atan2(((Class365_Sub1_Sub1_Sub1) this).aDouble10053, ((Class365_Sub1_Sub1_Sub1) this).aDouble10050) - 3.1415927F));
			class235.aClass218_2600.method2026(class218);
			class218.method2029();
			method4339(class235);
			if (((Class365_Sub1_Sub1_Sub1) this).aClass438_10047.method5822(1, 1832022530) && ((Class365_Sub1_Sub1_Sub1) this).aClass438_10047.method5832(588331212))
				((Class365_Sub1_Sub1_Sub1) this).aClass438_10047.method5834(981301272);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.b(").append(')').toString());
		}
	}

	final boolean method4386() {
		return false;
	}

	void method4404(int i) {
		try {
			Class217 class217 = method4337().aClass217_2599;
			aShort9798 = aShort9796 = (short) (int) (class217.aFloat2451 / 512.0F);
			aShort9795 = aShort9797 = (short) (int) (class217.aFloat2454 / 512.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.ew(").append(')').toString());
		}
	}

	public Class334 method4358(GraphicsToolkit class_ra, byte i) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.bc(").append(')').toString());
		}
	}

	boolean method4399(byte i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.bf(").append(')').toString());
		}
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_20_, byte i_21_) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.bu(").append(')').toString());
		}
	}

	final boolean method4366(int i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.bw(").append(')').toString());
		}
	}

	final void method4355(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_22_, int i_23_, boolean bool, int i_24_) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.bk(").append(')').toString());
		}
	}

	final void method4398(byte i) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.bq(").append(')').toString());
		}
	}

	Class335 method4394(GraphicsToolkit class_ra, int i) {
		try {
			Class387 class387 = method4410(class_ra, 2048, -1431142826);
			if (class387 == null)
				return null;
			Matrix3f class222 = method4347();
			method4408(class_ra, class387, class222, 752544216);
			Class335 class335 = Class73.method818(false, 1890696440);
			class387.method4739(class222, aClass302_Sub1Array7726[0], 0);
			if (null != ((Class365_Sub1_Sub1_Sub1) this).aClass351_10061) {
				Class69 class69 = ((Class365_Sub1_Sub1_Sub1) this).aClass351_10061.method4229();
				class_ra.method5042(class69);
			}
			((Class365_Sub1_Sub1_Sub1) this).aBoolean10060 = class387.i();
			class387.n();
			((Class365_Sub1_Sub1_Sub1) this).anInt10059 = class387.YA() * -1389603713;
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.bo(").append(')').toString());
		}
	}

	void method4408(GraphicsToolkit class_ra, Class387 class387, Matrix3f class222, int i) {
		try {
			class387.method4786(class222);
			Class85[] class85s = class387.method4781();
			Class68[] class68s = class387.method4728();
			if ((null == ((Class365_Sub1_Sub1_Sub1) this).aClass351_10061 || (((Class365_Sub1_Sub1_Sub1) this).aClass351_10061.aBoolean3772)) && (null != class85s || class68s != null))
				((Class365_Sub1_Sub1_Sub1) this).aClass351_10061 = Class351.method4232(client.anInt8884 * 443738891, true);
			if (((Class365_Sub1_Sub1_Sub1) this).aClass351_10061 != null) {
				((Class365_Sub1_Sub1_Sub1) this).aClass351_10061.method4231(class_ra, (long) (443738891 * client.anInt8884), class85s, class68s, false);
				((Class365_Sub1_Sub1_Sub1) this).aClass351_10061.method4227(plane, aShort9798, aShort9796, aShort9795, aShort9797);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.i(").append(')').toString());
		}
	}

	boolean method4374() {
		return false;
	}

	public Class334 method4367(GraphicsToolkit class_ra) {
		return null;
	}

	public Class334 method4368(GraphicsToolkit class_ra) {
		return null;
	}

	Class335 method4370(GraphicsToolkit class_ra) {
		Class387 class387 = method4410(class_ra, 2048, -1431142826);
		if (class387 == null)
			return null;
		Matrix3f class222 = method4347();
		method4408(class_ra, class387, class222, 250084815);
		Class335 class335 = Class73.method818(false, 1436132074);
		class387.method4739(class222, aClass302_Sub1Array7726[0], 0);
		if (null != ((Class365_Sub1_Sub1_Sub1) this).aClass351_10061) {
			Class69 class69 = ((Class365_Sub1_Sub1_Sub1) this).aClass351_10061.method4229();
			class_ra.method5042(class69);
		}
		((Class365_Sub1_Sub1_Sub1) this).aBoolean10060 = class387.i();
		class387.n();
		((Class365_Sub1_Sub1_Sub1) this).anInt10059 = class387.YA() * -1389603713;
		return class335;
	}

	void method4371(GraphicsToolkit class_ra) {
		Class387 class387 = method4410(class_ra, 0, -1431142826);
		if (null != class387) {
			Matrix3f class222 = method4347();
			((Class365_Sub1_Sub1_Sub1) this).anInt10059 = class387.YA() * -1389603713;
			class387.n();
			method4408(class_ra, class387, class222, 378749771);
		}
	}

	final void method4378() {
		throw new IllegalStateException();
	}

	boolean method4372(GraphicsToolkit class_ra, int i, int i_25_) {
		return false;
	}

	boolean method4385(GraphicsToolkit class_ra, int i, int i_26_) {
		return false;
	}

	boolean method4352(GraphicsToolkit class_ra, int i, int i_27_) {
		return false;
	}

	public int method4381() {
		return ((Class365_Sub1_Sub1_Sub1) this).anInt10059 * 1137666943;
	}

	final void method4388(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_28_, int i_29_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method4377() {
		throw new IllegalStateException();
	}

	boolean method4365() {
		return false;
	}

	public int method4379() {
		return ((Class365_Sub1_Sub1_Sub1) this).anInt10059 * 1137666943;
	}

	boolean method4376(short i) {
		try {
			return ((Class365_Sub1_Sub1_Sub1) this).aBoolean10060;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.be(").append(')').toString());
		}
	}

	void method4409() {
		Class217 class217 = method4337().aClass217_2599;
		aShort9798 = aShort9796 = (short) (int) (class217.aFloat2451 / 512.0F);
		aShort9795 = aShort9797 = (short) (int) (class217.aFloat2454 / 512.0F);
	}

	Class387 method4410(GraphicsToolkit class_ra, int i, int i_30_) {
		try {
			Class398 class398 = (Class158_Sub1.aClass389_8568.method4857(1528803725 * ((Class365_Sub1_Sub1_Sub1) this).anInt10046, -1880515681));
			return class398.method4917(class_ra, i, (((Class365_Sub1_Sub1_Sub1) this).aClass438_10047), (byte) 2, 2089191246);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.p(").append(')').toString());
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			Class387 class387 = method4410(class_ra, 0, -1431142826);
			if (null != class387) {
				Matrix3f class222 = method4347();
				((Class365_Sub1_Sub1_Sub1) this).anInt10059 = class387.YA() * -1389603713;
				class387.n();
				method4408(class_ra, class387, class222, 1295394803);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.bb(").append(')').toString());
		}
	}

	boolean method4369() {
		return ((Class365_Sub1_Sub1_Sub1) this).aBoolean10060;
	}

	boolean method4382() {
		return ((Class365_Sub1_Sub1_Sub1) this).aBoolean10060;
	}

	boolean method4349() {
		return ((Class365_Sub1_Sub1_Sub1) this).aBoolean10060;
	}

	public void method4411(int i) {
		try {
			if (null != ((Class365_Sub1_Sub1_Sub1) this).aClass351_10061)
				((Class365_Sub1_Sub1_Sub1) this).aClass351_10061.method4221();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aka.k(").append(')').toString());
		}
	}

	boolean method4351() {
		return ((Class365_Sub1_Sub1_Sub1) this).aBoolean10060;
	}

	final boolean method4384() {
		return false;
	}

	public Class365_Sub1_Sub1_Sub1(Class331 class331, int i, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int index, int i_42_, boolean bool, int i_43_) {
		super(class331, i_31_, i_32_, i_33_, Class356.method4271(i_33_, i_34_, i_31_, -1556375135) - i_35_, i_34_, i_33_ >> 9, i_33_ >> 9, i_34_ >> 9, i_34_ >> 9, false, (byte) 0);
		((Class365_Sub1_Sub1_Sub1) this).anInt10046 = i * -342886075;
		anInt10044 = 52330647 * i_36_;
		anInt10049 = -195668383 * i_37_;
		((Class365_Sub1_Sub1_Sub1) this).anInt10048 = -1889087541 * i_38_;
		((Class365_Sub1_Sub1_Sub1) this).anInt10054 = i_39_ * -1501352601;
		((Class365_Sub1_Sub1_Sub1) this).anInt10043 = -113917499 * i_40_;
		anInt10058 = index * 1040105721;
		((Class365_Sub1_Sub1_Sub1) this).anInt10042 = i_35_ * -1635034315;
		anInt10045 = -954169831 * i_42_;
		((Class365_Sub1_Sub1_Sub1) this).aBoolean10051 = bool;
		((Class365_Sub1_Sub1_Sub1) this).aBoolean10052 = false;
		((Class365_Sub1_Sub1_Sub1) this).anInt10041 = 1279163553 * i_43_;
		int i_44_ = (Class158_Sub1.aClass389_8568.method4857(((Class365_Sub1_Sub1_Sub1) this).anInt10046 * 1528803725, -1811500435).anInt5205) * 1505778629;
		((Class365_Sub1_Sub1_Sub1) this).aClass438_10047 = new Class438_Sub2(this, false);
		((Class365_Sub1_Sub1_Sub1) this).aClass438_10047.method5821(i_44_, -1768064453);
		method4362(1, 291576769);
	}

	void method4412() {
		Class217 class217 = method4337().aClass217_2599;
		aShort9798 = aShort9796 = (short) (int) (class217.aFloat2451 / 512.0F);
		aShort9795 = aShort9797 = (short) (int) (class217.aFloat2454 / 512.0F);
	}

	final boolean method4387() {
		return false;
	}

	void method4373(GraphicsToolkit class_ra) {
		Class387 class387 = method4410(class_ra, 0, -1431142826);
		if (null != class387) {
			Matrix3f class222 = method4347();
			((Class365_Sub1_Sub1_Sub1) this).anInt10059 = class387.YA() * -1389603713;
			class387.n();
			method4408(class_ra, class387, class222, 1024355071);
		}
	}

	boolean method4383() {
		return ((Class365_Sub1_Sub1_Sub1) this).aBoolean10060;
	}
}
