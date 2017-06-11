/* Class365_Sub1_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class365_Sub1_Sub1_Sub3 extends Class365_Sub1_Sub1 {
	int anInt10134;
	int anInt10135;
	Class438 aClass438_10136;
	Class351 aClass351_10137;
	boolean aBoolean10138;
	int anInt10139 = 0;

	boolean method4353() {
		return false;
	}

	void method4479(GraphicsToolkit class_ra, Class387 class387, Matrix3f class222, byte i) {
		try {
			class387.method4786(class222);
			Class85[] class85s = class387.method4781();
			Class68[] class68s = class387.method4728();
			if ((null == ((Class365_Sub1_Sub1_Sub3) this).aClass351_10137 || (((Class365_Sub1_Sub1_Sub3) this).aClass351_10137.aBoolean3772)) && (class85s != null || class68s != null))
				((Class365_Sub1_Sub1_Sub3) this).aClass351_10137 = Class351.method4232(client.anInt8884 * 443738891, true);
			if (null != ((Class365_Sub1_Sub1_Sub3) this).aClass351_10137) {
				((Class365_Sub1_Sub1_Sub3) this).aClass351_10137.method4231(class_ra, (long) (443738891 * client.anInt8884), class85s, class68s, false);
				((Class365_Sub1_Sub1_Sub3) this).aClass351_10137.method4227(plane, aShort9798, aShort9796, aShort9795, aShort9797);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.i(").append(')').toString());
		}
	}

	public void method4480(byte i) {
		try {
			if (((Class365_Sub1_Sub1_Sub3) this).aClass351_10137 != null)
				((Class365_Sub1_Sub1_Sub3) this).aClass351_10137.method4221();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.k(").append(')').toString());
		}
	}

	final void method4377() {
		throw new IllegalStateException();
	}

	public Class334 method4358(GraphicsToolkit class_ra, byte i) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.bc(").append(')').toString());
		}
	}

	public Class365_Sub1_Sub1_Sub3(Class331 class331, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool) {
		super(class331, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, false, (byte) 0);
		((Class365_Sub1_Sub1_Sub3) this).anInt10134 = 0;
		((Class365_Sub1_Sub1_Sub3) this).aBoolean10138 = true;
		((Class365_Sub1_Sub1_Sub3) this).anInt10135 = 1921334459 * i;
		((Class365_Sub1_Sub1_Sub3) this).anInt10139 = i_10_ * -1141067271;
		Class398 class398 = (Class158_Sub1.aClass389_8568.method4857(((Class365_Sub1_Sub1_Sub3) this).anInt10135 * -743331725, -2103306753));
		int i_11_ = 1505778629 * class398.anInt5205;
		if (i_11_ != -1) {
			((Class365_Sub1_Sub1_Sub3) this).aClass438_10136 = new Class438_Sub2(this, false);
			int i_12_ = class398.aBoolean5215 ? 0 : 2;
			if (bool)
				i_12_ = 1;
			((Class365_Sub1_Sub1_Sub3) this).aClass438_10136.method5824(i_11_, i_0_, i_12_, false, (byte) 0);
		}
		method4362(1, -656221662);
	}

	public final boolean method4481(byte i) {
		try {
			return (((Class365_Sub1_Sub1_Sub3) this).aClass438_10136 != null && !((Class365_Sub1_Sub1_Sub3) this).aClass438_10136.method5826(-65534));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.f(").append(')').toString());
		}
	}

	final boolean method4386() {
		return false;
	}

	Class387 method4482(GraphicsToolkit class_ra, int i, int i_13_, int i_14_) {
		try {
			Class398 class398 = Class158_Sub1.aClass389_8568.method4857(i_13_, -1949428738);
			Class_xa class_xa = aClass331_7722.aClass_xaArray3519[plane];
			Class_xa class_xa_15_ = (aByte7724 < 3 ? aClass331_7722.aClass_xaArray3519[1 + aByte7724] : null);
			Class217 class217 = method4337().aClass217_2599;
			return ((((Class365_Sub1_Sub1_Sub3) this).aClass438_10136 != null && !((Class365_Sub1_Sub1_Sub3) this).aClass438_10136.method5832(1032843646)) ? class398.method4918(class_ra, i, true, class_xa, class_xa_15_, (int) class217.aFloat2451, (int) class217.aFloat2455, (int) class217.aFloat2454, (((Class365_Sub1_Sub1_Sub3) this).aClass438_10136), (byte) 2, 345220259) : class398.method4918(class_ra, i, true, class_xa, class_xa_15_, (int) class217.aFloat2451, (int) class217.aFloat2455,
					(int) class217.aFloat2454, null, (byte) 2, -2126228993));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.p(").append(')').toString());
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			Class387 class387 = method4482(class_ra, 0, (-743331725 * ((Class365_Sub1_Sub1_Sub3) this).anInt10135), -1760774279);
			if (class387 != null)
				method4479(class_ra, class387, method4347(), (byte) -58);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.bb(").append(')').toString());
		}
	}

	final void method4355(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_16_, int i_17_, boolean bool, int i_18_) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.bk(").append(')').toString());
		}
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_19_, byte i_20_) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.bu(").append(')').toString());
		}
	}

	boolean method4374() {
		return false;
	}

	final boolean method4366(int i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.bw(").append(')').toString());
		}
	}

	public final void method4483(int i, int i_21_) {
		try {
			if (((Class365_Sub1_Sub1_Sub3) this).aClass438_10136 != null && !((Class365_Sub1_Sub1_Sub3) this).aClass438_10136.method5832(-891942946))
				((Class365_Sub1_Sub1_Sub3) this).aClass438_10136.method5822(i, 2083264997);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.a(").append(')').toString());
		}
	}

	final void method4398(byte i) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.bq(").append(')').toString());
		}
	}

	public int method4361(int i) {
		try {
			return 1112786493 * ((Class365_Sub1_Sub1_Sub3) this).anInt10134;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.bm(").append(')').toString());
		}
	}

	boolean method4365() {
		return false;
	}

	final boolean method4387() {
		return false;
	}

	public Class334 method4367(GraphicsToolkit class_ra) {
		return null;
	}

	public Class334 method4368(GraphicsToolkit class_ra) {
		return null;
	}

	Class335 method4370(GraphicsToolkit class_ra) {
		Class387 class387 = method4482(class_ra, 0x800 | (0 != (((Class365_Sub1_Sub1_Sub3) this).anInt10139) * -657768375 ? 5 : 0), (-743331725 * ((Class365_Sub1_Sub1_Sub3) this).anInt10135), -1821357765);
		if (null == class387)
			return null;
		if (-657768375 * ((Class365_Sub1_Sub1_Sub3) this).anInt10139 != 0)
			class387.f(1510098944 * ((Class365_Sub1_Sub1_Sub3) this).anInt10139);
		Matrix3f class222 = method4347();
		method4479(class_ra, class387, class222, (byte) -14);
		Class335 class335 = Class73.method818(false, 1620653169);
		class387.method4739(class222, aClass302_Sub1Array7726[0], 0);
		if (null != ((Class365_Sub1_Sub1_Sub3) this).aClass351_10137) {
			Class69 class69 = ((Class365_Sub1_Sub1_Sub3) this).aClass351_10137.method4229();
			class_ra.method5042(class69);
		}
		((Class365_Sub1_Sub1_Sub3) this).aBoolean10138 = class387.i();
		((Class365_Sub1_Sub1_Sub3) this).anInt10134 = class387.YA() * 2028765461;
		class387.n();
		return class335;
	}

	void method4371(GraphicsToolkit class_ra) {
		Class387 class387 = method4482(class_ra, 0, (-743331725 * ((Class365_Sub1_Sub1_Sub3) this).anInt10135), -1484520412);
		if (class387 != null)
			method4479(class_ra, class387, method4347(), (byte) -82);
	}

	void method4373(GraphicsToolkit class_ra) {
		Class387 class387 = method4482(class_ra, 0, (-743331725 * ((Class365_Sub1_Sub1_Sub3) this).anInt10135), -1936222136);
		if (class387 != null)
			method4479(class_ra, class387, method4347(), (byte) -12);
	}

	boolean method4372(GraphicsToolkit class_ra, int i, int i_22_) {
		return false;
	}

	boolean method4385(GraphicsToolkit class_ra, int i, int i_23_) {
		return false;
	}

	boolean method4352(GraphicsToolkit class_ra, int i, int i_24_) {
		return false;
	}

	final void method4375(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_25_, int i_26_, boolean bool) {
		throw new IllegalStateException();
	}

	Class335 method4394(GraphicsToolkit class_ra, int i) {
		try {
			Class387 class387 = method4482(class_ra, 0x800 | (0 != (((Class365_Sub1_Sub1_Sub3) this).anInt10139) * -657768375 ? 5 : 0), (-743331725 * ((Class365_Sub1_Sub1_Sub3) this).anInt10135), -1982313638);
			if (null == class387)
				return null;
			if (-657768375 * ((Class365_Sub1_Sub1_Sub3) this).anInt10139 != 0)
				class387.f(1510098944 * ((Class365_Sub1_Sub1_Sub3) this).anInt10139);
			Matrix3f class222 = method4347();
			method4479(class_ra, class387, class222, (byte) -52);
			Class335 class335 = Class73.method818(false, 1486074028);
			class387.method4739(class222, aClass302_Sub1Array7726[0], 0);
			if (null != ((Class365_Sub1_Sub1_Sub3) this).aClass351_10137) {
				Class69 class69 = ((Class365_Sub1_Sub1_Sub3) this).aClass351_10137.method4229();
				class_ra.method5042(class69);
			}
			((Class365_Sub1_Sub1_Sub3) this).aBoolean10138 = class387.i();
			((Class365_Sub1_Sub1_Sub3) this).anInt10134 = class387.YA() * 2028765461;
			class387.n();
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.bo(").append(')').toString());
		}
	}

	boolean method4369() {
		return ((Class365_Sub1_Sub1_Sub3) this).aBoolean10138;
	}

	final void method4378() {
		throw new IllegalStateException();
	}

	boolean method4376(short i) {
		try {
			return ((Class365_Sub1_Sub1_Sub3) this).aBoolean10138;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.be(").append(')').toString());
		}
	}

	public int method4380() {
		return 1112786493 * ((Class365_Sub1_Sub1_Sub3) this).anInt10134;
	}

	public int method4381() {
		return 1112786493 * ((Class365_Sub1_Sub1_Sub3) this).anInt10134;
	}

	public int method4379() {
		return 1112786493 * ((Class365_Sub1_Sub1_Sub3) this).anInt10134;
	}

	boolean method4382() {
		return ((Class365_Sub1_Sub1_Sub3) this).aBoolean10138;
	}

	boolean method4349() {
		return ((Class365_Sub1_Sub1_Sub3) this).aBoolean10138;
	}

	boolean method4351() {
		return ((Class365_Sub1_Sub1_Sub3) this).aBoolean10138;
	}

	final boolean method4384() {
		return false;
	}

	final boolean method4400() {
		return false;
	}

	final void method4388(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_27_, int i_28_, boolean bool) {
		throw new IllegalStateException();
	}

	boolean method4383() {
		return ((Class365_Sub1_Sub1_Sub3) this).aBoolean10138;
	}

	public final boolean method4484(int i) {
		try {
			return (null == ((Class365_Sub1_Sub1_Sub3) this).aClass438_10136 || ((Class365_Sub1_Sub1_Sub3) this).aClass438_10136.method5832(1776258671));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.b(").append(')').toString());
		}
	}

	boolean method4399(byte i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akr.bf(").append(')').toString());
		}
	}
}
