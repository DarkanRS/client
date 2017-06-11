/* Class365_Sub1_Sub1_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class365_Sub1_Sub1_Sub6 extends Class365_Sub1_Sub1 implements Interface3 {
	Class387 aClass387_9879;
	byte aByte9880;
	Class_na aClass_na9881;
	Class334 aClass334_9882;
	int anInt9883;
	Class433 aClass433_9884;
	byte aByte9885;
	boolean aBoolean9886;
	boolean aBoolean9887;
	boolean aBoolean9888;
	boolean aBoolean9889;

	boolean method4400() {
		return ((Class365_Sub1_Sub1_Sub6) this).aBoolean9889;
	}

	public void method40(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class365_Sub1_Sub1_Sub6) this).aClass_na9881 && ((Class365_Sub1_Sub1_Sub6) this).aBoolean9887) {
			Class454 class454 = method4492(class_ra, 262144, true, -1968877061);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub1_Sub6) this).aClass_na9881;
			((Class365_Sub1_Sub1_Sub6) this).aClass_na9881 = null;
		}
		Class217 class217 = method4337().aClass217_2599;
		if (class_na != null)
			aClass331_7722.method4047(class_na, aByte7724, (int) class217.aFloat2451, (int) class217.aFloat2454, null, 612367667);
	}

	boolean method4369() {
		if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879)
			return ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.i();
		return false;
	}

	public int method4361(int i) {
		try {
			return (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 ? ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.YA() : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.bm(").append(')').toString());
		}
	}

	Class387 method4491(GraphicsToolkit class_ra, int i, int i_0_) {
		try {
			if (((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 != null && class_ra.method5017(((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.m(), i) == 0)
				return ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879;
			Class454 class454 = method4492(class_ra, i, false, -1828314772);
			if (class454 != null)
				return (Class387) class454.anObject5645;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.bl(").append(')').toString());
		}
	}

	void method4371(GraphicsToolkit class_ra) {
		/* empty */
	}

	public Class334 method4358(GraphicsToolkit class_ra, byte i) {
		try {
			Class217 class217 = method4337().aClass217_2599;
			if (((Class365_Sub1_Sub1_Sub6) this).aClass334_9882 == null)
				((Class365_Sub1_Sub1_Sub6) this).aClass334_9882 = Class472.method6063((int) class217.aFloat2451, (int) class217.aFloat2455, (int) class217.aFloat2454, method4491(class_ra, 0, 720922451), 2111696382);
			return ((Class365_Sub1_Sub1_Sub6) this).aClass334_9882;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.bc(").append(')').toString());
		}
	}

	public int method29(int i) {
		try {
			return ((Class365_Sub1_Sub1_Sub6) this).aByte9880;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.f(").append(')').toString());
		}
	}

	public void method28(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class365_Sub1_Sub1_Sub6) this).aClass_na9881 && ((Class365_Sub1_Sub1_Sub6) this).aBoolean9887) {
			Class454 class454 = method4492(class_ra, 262144, true, -1624110229);
			class_na = (Class_na) (null != class454 ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub1_Sub6) this).aClass_na9881;
			((Class365_Sub1_Sub1_Sub6) this).aClass_na9881 = null;
		}
		Class217 class217 = method4337().aClass217_2599;
		if (null != class_na)
			aClass331_7722.method4055(class_na, aByte7724, (int) class217.aFloat2451, (int) class217.aFloat2454, null, 1156448479);
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_1_, byte i_2_) {
		try {
			Class387 class387 = method4491(class_ra, 131072, -114494856);
			if (null != class387) {
				Matrix3f class222 = method4347();
				return class387.method4787(i, i_1_, class222, false, 0);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.bu(").append(')').toString());
		}
	}

	boolean method4366(int i) {
		try {
			return ((Class365_Sub1_Sub1_Sub6) this).aBoolean9889;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.bw(").append(')').toString());
		}
	}

	void method4355(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_3_, int i_4_, boolean bool, int i_5_) {
		try {
			if (class365_sub1 instanceof Class365_Sub1_Sub5_Sub1) {
				Class365_Sub1_Sub5_Sub1 class365_sub1_sub5_sub1 = (Class365_Sub1_Sub5_Sub1) class365_sub1;
				if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 && null != ((Class365_Sub1_Sub5_Sub1) class365_sub1_sub5_sub1).aClass387_9893)
					((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.method4745((((Class365_Sub1_Sub5_Sub1) class365_sub1_sub5_sub1).aClass387_9893), i, i_3_, i_4_, bool);
			} else if (class365_sub1 instanceof Class365_Sub1_Sub1_Sub6) {
				Class365_Sub1_Sub1_Sub6 class365_sub1_sub1_sub6_6_ = (Class365_Sub1_Sub1_Sub6) class365_sub1;
				if (((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 != null && (((Class365_Sub1_Sub1_Sub6) class365_sub1_sub1_sub6_6_).aClass387_9879) != null)
					((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.method4745(((Class365_Sub1_Sub1_Sub6) class365_sub1_sub1_sub6_6_).aClass387_9879, i, i_3_, i_4_, bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.bk(").append(')').toString());
		}
	}

	void method4398(byte i) {
		try {
			((Class365_Sub1_Sub1_Sub6) this).aBoolean9889 = false;
			if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879)
				((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.KA(((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.m() & ~0x10000);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.bq(").append(')').toString());
		}
	}

	boolean method4349() {
		if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879)
			return ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.i();
		return false;
	}

	public int method30(short i) {
		try {
			return ((Class365_Sub1_Sub1_Sub6) this).aByte9885;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.b(").append(')').toString());
		}
	}

	public void method31(byte i) {
		try {
			if (((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 != null)
				((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.method4784();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.p(").append(')').toString());
		}
	}

	public boolean method39(int i) {
		try {
			return ((Class365_Sub1_Sub1_Sub6) this).aBoolean9887;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.i(").append(')').toString());
		}
	}

	public void method44(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class365_Sub1_Sub1_Sub6) this).aClass_na9881 && ((Class365_Sub1_Sub1_Sub6) this).aBoolean9887) {
			Class454 class454 = method4492(class_ra, 262144, true, -1865263954);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub1_Sub6) this).aClass_na9881;
			((Class365_Sub1_Sub1_Sub6) this).aClass_na9881 = null;
		}
		Class217 class217 = method4337().aClass217_2599;
		if (class_na != null)
			aClass331_7722.method4047(class_na, aByte7724, (int) class217.aFloat2451, (int) class217.aFloat2454, null, 1005842960);
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.bb(").append(')').toString());
		}
	}

	Class335 method4394(GraphicsToolkit class_ra, int i) {
		try {
			if (((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 == null)
				return null;
			Matrix3f class222 = method4347();
			Class335 class335 = Class73.method818((((Class365_Sub1_Sub1_Sub6) this).aBoolean9888), 1956566103);
			((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.method4739(class222, aClass302_Sub1Array7726[0], 0);
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.bo(").append(')').toString());
		}
	}

	public int method45() {
		return 614847827 * ((Class365_Sub1_Sub1_Sub6) this).anInt9883;
	}

	public int method36() {
		return ((Class365_Sub1_Sub1_Sub6) this).aByte9880;
	}

	boolean method4365() {
		if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879)
			return !((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.u();
		return true;
	}

	public int method42() {
		return ((Class365_Sub1_Sub1_Sub6) this).aByte9885;
	}

	public int method38() {
		return ((Class365_Sub1_Sub1_Sub6) this).aByte9885;
	}

	public void method34() {
		if (((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 != null)
			((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.method4784();
	}

	public boolean method41() {
		return ((Class365_Sub1_Sub1_Sub6) this).aBoolean9887;
	}

	public int method4381() {
		return (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 ? ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.YA() : 0);
	}

	public void method43(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class365_Sub1_Sub1_Sub6) this).aClass_na9881 && ((Class365_Sub1_Sub1_Sub6) this).aBoolean9887) {
			Class454 class454 = method4492(class_ra, 262144, true, -1678242522);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub1_Sub6) this).aClass_na9881;
			((Class365_Sub1_Sub1_Sub6) this).aClass_na9881 = null;
		}
		Class217 class217 = method4337().aClass217_2599;
		if (class_na != null)
			aClass331_7722.method4047(class_na, aByte7724, (int) class217.aFloat2451, (int) class217.aFloat2454, null, 2123208646);
	}

	public Class365_Sub1_Sub1_Sub6(Class331 class331, GraphicsToolkit class_ra, Class433 class433, ObjectDefinitions class432, int i, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool_17_) {
		super(class331, i, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, 512737201 * class432.anInt5409 == 1, Class79.method848(i_15_, i_16_, (byte) 27));
		((Class365_Sub1_Sub1_Sub6) this).aClass433_9884 = class433;
		((Class365_Sub1_Sub1_Sub6) this).anInt9883 = class432.anInt5365 * 1514496897;
		aByte7724 = (byte) i_7_;
		((Class365_Sub1_Sub1_Sub6) this).aBoolean9886 = bool;
		((Class365_Sub1_Sub1_Sub6) this).aByte9880 = (byte) i_15_;
		((Class365_Sub1_Sub1_Sub6) this).aByte9885 = (byte) i_16_;
		((Class365_Sub1_Sub1_Sub6) this).aBoolean9888 = 0 != 1532834983 * class432.anInt5382 && !bool;
		((Class365_Sub1_Sub1_Sub6) this).aBoolean9889 = bool_17_;
		((Class365_Sub1_Sub1_Sub6) this).aBoolean9887 = (class_ra.method5082() && class432.aBoolean5433 && !((Class365_Sub1_Sub1_Sub6) this).aBoolean9886 && Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub7_7581.method5650(3122198) != 0);
		int i_18_ = 2048;
		if (((Class365_Sub1_Sub1_Sub6) this).aBoolean9889)
			i_18_ |= 0x10000;
		if (class432.aBoolean5441)
			i_18_ |= 0x80000;
		Class454 class454 = method4492(class_ra, i_18_, ((Class365_Sub1_Sub1_Sub6) this).aBoolean9887, -1835687018);
		if (null != class454) {
			((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 = (Class387) class454.anObject5645;
			((Class365_Sub1_Sub1_Sub6) this).aClass_na9881 = (Class_na) class454.anObject5646;
			if (((Class365_Sub1_Sub1_Sub6) this).aBoolean9889 || class432.aBoolean5441) {
				((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 = ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.method4755((byte) 0, i_18_, false);
				if (class432.aBoolean5441) {
					Class287 class287 = client.aClass283_8716.method2632(-1997873817);
					((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.PA(1599271859 * class287.anInt3096, class287.anInt3097 * 1630923113, class287.anInt3098 * -1560648831, class287.anInt3099 * -57569897);
				}
			}
		}
		method4362(1, 1215264227);
	}

	boolean method4353() {
		if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879)
			return !((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.u();
		return true;
	}

	Class335 method4370(GraphicsToolkit class_ra) {
		if (((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 == null)
			return null;
		Matrix3f class222 = method4347();
		Class335 class335 = Class73.method818(((Class365_Sub1_Sub1_Sub6) this).aBoolean9888, 1628879403);
		((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.method4739(class222, aClass302_Sub1Array7726[0], 0);
		return class335;
	}

	boolean method4374() {
		if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879)
			return !((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.u();
		return true;
	}

	public Class334 method4367(GraphicsToolkit class_ra) {
		Class217 class217 = method4337().aClass217_2599;
		if (((Class365_Sub1_Sub1_Sub6) this).aClass334_9882 == null)
			((Class365_Sub1_Sub1_Sub6) this).aClass334_9882 = Class472.method6063((int) class217.aFloat2451, (int) class217.aFloat2455, (int) class217.aFloat2454, method4491(class_ra, 0, 489982768), 2048305004);
		return ((Class365_Sub1_Sub1_Sub6) this).aClass334_9882;
	}

	public Class334 method4368(GraphicsToolkit class_ra) {
		Class217 class217 = method4337().aClass217_2599;
		if (((Class365_Sub1_Sub1_Sub6) this).aClass334_9882 == null)
			((Class365_Sub1_Sub1_Sub6) this).aClass334_9882 = Class472.method6063((int) class217.aFloat2451, (int) class217.aFloat2455, (int) class217.aFloat2454, method4491(class_ra, 0, 2128967957), 2011596409);
		return ((Class365_Sub1_Sub1_Sub6) this).aClass334_9882;
	}

	Class454 method4492(GraphicsToolkit class_ra, int i, boolean bool, int i_19_) {
		try {
			ObjectDefinitions class432 = (((Class365_Sub1_Sub1_Sub6) this).aClass433_9884.getObjectDefinitions(((Class365_Sub1_Sub1_Sub6) this).anInt9883 * 614847827));
			Class_xa class_xa;
			Class_xa class_xa_20_;
			if (((Class365_Sub1_Sub1_Sub6) this).aBoolean9886) {
				class_xa = aClass331_7722.aClass_xaArray3521[aByte7724];
				class_xa_20_ = aClass331_7722.aClass_xaArray3519[0];
			} else {
				class_xa = aClass331_7722.aClass_xaArray3519[aByte7724];
				if (aByte7724 < 3)
					class_xa_20_ = aClass331_7722.aClass_xaArray3519[1 + aByte7724];
				else
					class_xa_20_ = null;
			}
			Class217 class217 = method4337().aClass217_2599;
			return (class432.method5785(class_ra, i, ((((Class365_Sub1_Sub1_Sub6) this).aByte9880 != Class424.aClass424_6604.anInt6613 * -1976050083) ? (int) ((Class365_Sub1_Sub1_Sub6) this).aByte9880 : Class424.aClass424_6611.anInt6613 * -1976050083), ((Class424.aClass424_6604.anInt6613 * -1976050083 == ((Class365_Sub1_Sub1_Sub6) this).aByte9880) ? (int) (((Class365_Sub1_Sub1_Sub6) this).aByte9885 + 4) : ((Class365_Sub1_Sub1_Sub6) this).aByte9885), class_xa, class_xa_20_,
					(int) class217.aFloat2451, (int) class217.aFloat2455, (int) class217.aFloat2454, bool, null, -920698887));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.br(").append(')').toString());
		}
	}

	public int method4493(short i) {
		try {
			return (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 ? ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.N() / 4 : 15);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.bz(").append(')').toString());
		}
	}

	void method4373(GraphicsToolkit class_ra) {
		/* empty */
	}

	boolean method4372(GraphicsToolkit class_ra, int i, int i_21_) {
		Class387 class387 = method4491(class_ra, 131072, -259800971);
		if (null != class387) {
			Matrix3f class222 = method4347();
			return class387.method4787(i, i_21_, class222, false, 0);
		}
		return false;
	}

	boolean method4385(GraphicsToolkit class_ra, int i, int i_22_) {
		Class387 class387 = method4491(class_ra, 131072, 547557370);
		if (null != class387) {
			Matrix3f class222 = method4347();
			return class387.method4787(i, i_22_, class222, false, 0);
		}
		return false;
	}

	boolean method4352(GraphicsToolkit class_ra, int i, int i_23_) {
		Class387 class387 = method4491(class_ra, 131072, -943107376);
		if (null != class387) {
			Matrix3f class222 = method4347();
			return class387.method4787(i, i_23_, class222, false, 0);
		}
		return false;
	}

	void method4375(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_24_, int i_25_, boolean bool) {
		if (class365_sub1 instanceof Class365_Sub1_Sub5_Sub1) {
			Class365_Sub1_Sub5_Sub1 class365_sub1_sub5_sub1 = (Class365_Sub1_Sub5_Sub1) class365_sub1;
			if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 && null != (((Class365_Sub1_Sub5_Sub1) class365_sub1_sub5_sub1).aClass387_9893))
				((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.method4745((((Class365_Sub1_Sub5_Sub1) class365_sub1_sub5_sub1).aClass387_9893), i, i_24_, i_25_, bool);
		} else if (class365_sub1 instanceof Class365_Sub1_Sub1_Sub6) {
			Class365_Sub1_Sub1_Sub6 class365_sub1_sub1_sub6_26_ = (Class365_Sub1_Sub1_Sub6) class365_sub1;
			if (((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 != null && (((Class365_Sub1_Sub1_Sub6) class365_sub1_sub1_sub6_26_).aClass387_9879) != null)
				((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.method4745((((Class365_Sub1_Sub1_Sub6) class365_sub1_sub1_sub6_26_).aClass387_9879), i, i_24_, i_25_, bool);
		}
	}

	void method4388(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_27_, int i_28_, boolean bool) {
		if (class365_sub1 instanceof Class365_Sub1_Sub5_Sub1) {
			Class365_Sub1_Sub5_Sub1 class365_sub1_sub5_sub1 = (Class365_Sub1_Sub5_Sub1) class365_sub1;
			if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 && null != (((Class365_Sub1_Sub5_Sub1) class365_sub1_sub5_sub1).aClass387_9893))
				((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.method4745((((Class365_Sub1_Sub5_Sub1) class365_sub1_sub5_sub1).aClass387_9893), i, i_27_, i_28_, bool);
		} else if (class365_sub1 instanceof Class365_Sub1_Sub1_Sub6) {
			Class365_Sub1_Sub1_Sub6 class365_sub1_sub1_sub6_29_ = (Class365_Sub1_Sub1_Sub6) class365_sub1;
			if (((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 != null && (((Class365_Sub1_Sub1_Sub6) class365_sub1_sub1_sub6_29_).aClass387_9879) != null)
				((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.method4745((((Class365_Sub1_Sub1_Sub6) class365_sub1_sub1_sub6_29_).aClass387_9879), i, i_27_, i_28_, bool);
		}
	}

	boolean method4351() {
		if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879)
			return ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.i();
		return false;
	}

	void method4378() {
		((Class365_Sub1_Sub1_Sub6) this).aBoolean9889 = false;
		if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879)
			((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.KA(((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.m() & ~0x10000);
	}

	public int method4379() {
		return (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 ? ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.YA() : 0);
	}

	public int method4380() {
		return (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879 ? ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.YA() : 0);
	}

	public void method37(GraphicsToolkit class_ra, int i) {
		try {
			Object object = null;
			Class_na class_na;
			if (null == ((Class365_Sub1_Sub1_Sub6) this).aClass_na9881 && ((Class365_Sub1_Sub1_Sub6) this).aBoolean9887) {
				Class454 class454 = method4492(class_ra, 262144, true, -2139710295);
				class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
			} else {
				class_na = ((Class365_Sub1_Sub1_Sub6) this).aClass_na9881;
				((Class365_Sub1_Sub1_Sub6) this).aClass_na9881 = null;
			}
			Class217 class217 = method4337().aClass217_2599;
			if (class_na != null)
				aClass331_7722.method4047(class_na, aByte7724, (int) class217.aFloat2451, (int) class217.aFloat2454, null, 1871597287);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.d(").append(')').toString());
		}
	}

	boolean method4399(byte i) {
		try {
			if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879)
				return !((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.u();
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.bf(").append(')').toString());
		}
	}

	boolean method4382() {
		if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879)
			return ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.i();
		return false;
	}

	boolean method4376(short i) {
		try {
			if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879)
				return ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.i();
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.be(").append(')').toString());
		}
	}

	boolean method4383() {
		if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879)
			return ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.i();
		return false;
	}

	void method4377() {
		((Class365_Sub1_Sub1_Sub6) this).aBoolean9889 = false;
		if (null != ((Class365_Sub1_Sub1_Sub6) this).aClass387_9879)
			((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.KA(((Class365_Sub1_Sub1_Sub6) this).aClass387_9879.m() & ~0x10000);
	}

	boolean method4384() {
		return ((Class365_Sub1_Sub1_Sub6) this).aBoolean9889;
	}

	public void method33(GraphicsToolkit class_ra, int i) {
		try {
			Object object = null;
			Class_na class_na;
			if (null == ((Class365_Sub1_Sub1_Sub6) this).aClass_na9881 && ((Class365_Sub1_Sub1_Sub6) this).aBoolean9887) {
				Class454 class454 = method4492(class_ra, 262144, true, -1616676956);
				class_na = (Class_na) (null != class454 ? class454.anObject5646 : null);
			} else {
				class_na = ((Class365_Sub1_Sub1_Sub6) this).aClass_na9881;
				((Class365_Sub1_Sub1_Sub6) this).aClass_na9881 = null;
			}
			Class217 class217 = method4337().aClass217_2599;
			if (null != class_na)
				aClass331_7722.method4055(class_na, aByte7724, (int) class217.aFloat2451, (int) class217.aFloat2454, null, -808327981);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.k(").append(')').toString());
		}
	}

	boolean method4386() {
		return ((Class365_Sub1_Sub1_Sub6) this).aBoolean9889;
	}

	boolean method4387() {
		return ((Class365_Sub1_Sub1_Sub6) this).aBoolean9889;
	}

	public int method35() {
		return ((Class365_Sub1_Sub1_Sub6) this).aByte9880;
	}

	public int method32(byte i) {
		try {
			return 614847827 * ((Class365_Sub1_Sub1_Sub6) this).anInt9883;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.a(").append(')').toString());
		}
	}

	static void method4494(GraphicsToolkit class_ra, int i) {
		try {
			if ((Class287.myPlayer.plane != -1694437021 * Class3.anInt57) && client.aClass283_8716.method2675(-1611682495) != null) {
				Class122.method1319((byte) 1);
				if (Class145.method1597(class_ra, (Class287.myPlayer.plane), 1177065502))
					Class3.anInt57 = (Class287.myPlayer.plane) * -955770805;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wf.p(").append(')').toString());
		}
	}
}
