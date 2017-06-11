/* Class365_Sub1_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class365_Sub1_Sub2_Sub2 extends Class365_Sub1_Sub2 implements Interface3 {
	boolean aBoolean9912;
	Class387 aClass387_9913;
	Class_na aClass_na9914;
	int anInt9915;
	boolean aBoolean9916;
	byte aByte9917;
	Class433 aClass433_9918;
	boolean aBoolean9919;
	Class334 aClass334_9920;
	boolean aBoolean9921;

	public Class334 method4358(GraphicsToolkit class_ra, byte i) {
		try {
			Class217 class217 = method4337().aClass217_2599;
			if (((Class365_Sub1_Sub2_Sub2) this).aClass334_9920 == null)
				((Class365_Sub1_Sub2_Sub2) this).aClass334_9920 = Class472.method6063((int) class217.aFloat2451, (int) class217.aFloat2455, (int) class217.aFloat2454, method4501(class_ra, 0, (byte) 68), 2029931481);
			return ((Class365_Sub1_Sub2_Sub2) this).aClass334_9920;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.bc(").append(')').toString());
		}
	}

	boolean method4369() {
		if (null != ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913)
			return ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.i();
		return false;
	}

	public int method4361(int i) {
		try {
			return (null != ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 ? ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.YA() : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.bm(").append(')').toString());
		}
	}

	Class387 method4501(GraphicsToolkit class_ra, int i, byte i_0_) {
		try {
			if (((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 != null && class_ra.method5017(((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.m(), i) == 0)
				return ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913;
			Class454 class454 = method4502(class_ra, i, false, -1886813239);
			if (null != class454)
				return (Class387) class454.anObject5645;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.by(").append(')').toString());
		}
	}

	Class454 method4502(GraphicsToolkit class_ra, int i, boolean bool, int i_1_) {
		try {
			ObjectDefinitions class432 = (((Class365_Sub1_Sub2_Sub2) this).aClass433_9918.getObjectDefinitions(2049836463 * ((Class365_Sub1_Sub2_Sub2) this).anInt9915));
			Class_xa class_xa;
			Class_xa class_xa_2_;
			if (((Class365_Sub1_Sub2_Sub2) this).aBoolean9916) {
				class_xa = aClass331_7722.aClass_xaArray3521[aByte7724];
				class_xa_2_ = aClass331_7722.aClass_xaArray3519[0];
			} else {
				class_xa = aClass331_7722.aClass_xaArray3519[aByte7724];
				if (aByte7724 < 3)
					class_xa_2_ = aClass331_7722.aClass_xaArray3519[aByte7724 + 1];
				else
					class_xa_2_ = null;
			}
			Class217 class217 = method4337().aClass217_2599;
			return (class432.method5785(class_ra, i, Class424.aClass424_6610.anInt6613 * -1976050083, ((Class365_Sub1_Sub2_Sub2) this).aByte9917, class_xa, class_xa_2_, (int) class217.aFloat2451, (int) class217.aFloat2455, (int) class217.aFloat2454, bool, null, -474476261));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.bl(").append(')').toString());
		}
	}

	boolean method4351() {
		if (null != ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913)
			return ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.i();
		return false;
	}

	public int method38() {
		return ((Class365_Sub1_Sub2_Sub2) this).aByte9917;
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.bb(").append(')').toString());
		}
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_3_, byte i_4_) {
		try {
			Class387 class387 = method4501(class_ra, 131072, (byte) 22);
			if (null != class387) {
				Matrix3f class222 = method4347();
				return class387.method4787(i, i_3_, class222, false, 0);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.bu(").append(')').toString());
		}
	}

	boolean method4366(int i) {
		try {
			return ((Class365_Sub1_Sub2_Sub2) this).aBoolean9912;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.bw(").append(')').toString());
		}
	}

	void method4355(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_5_, int i_6_, boolean bool, int i_7_) {
		try {
			if (class365_sub1 instanceof Class365_Sub1_Sub2_Sub2) {
				Class365_Sub1_Sub2_Sub2 class365_sub1_sub2_sub2_8_ = (Class365_Sub1_Sub2_Sub2) class365_sub1;
				if (((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 != null && null != ((Class365_Sub1_Sub2_Sub2) class365_sub1_sub2_sub2_8_).aClass387_9913)
					((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.method4745(((Class365_Sub1_Sub2_Sub2) class365_sub1_sub2_sub2_8_).aClass387_9913, i, i_5_, i_6_, bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.bk(").append(')').toString());
		}
	}

	void method4398(byte i) {
		try {
			((Class365_Sub1_Sub2_Sub2) this).aBoolean9912 = false;
			if (((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 != null)
				((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.KA(((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.m() & ~0x10000);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.bq(").append(')').toString());
		}
	}

	boolean method4382() {
		if (null != ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913)
			return ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.i();
		return false;
	}

	public int method29(int i) {
		try {
			return Class424.aClass424_6610.anInt6613 * -1976050083;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.f(").append(')').toString());
		}
	}

	public int method30(short i) {
		try {
			return ((Class365_Sub1_Sub2_Sub2) this).aByte9917;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.b(").append(')').toString());
		}
	}

	public void method31(byte i) {
		try {
			if (((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 != null)
				((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.method4784();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.p(").append(')').toString());
		}
	}

	public boolean method39(int i) {
		try {
			return ((Class365_Sub1_Sub2_Sub2) this).aBoolean9921;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.i(").append(')').toString());
		}
	}

	boolean method4383() {
		if (null != ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913)
			return ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.i();
		return false;
	}

	public void method37(GraphicsToolkit class_ra, int i) {
		try {
			Object object = null;
			Class_na class_na;
			if (((Class365_Sub1_Sub2_Sub2) this).aClass_na9914 == null && ((Class365_Sub1_Sub2_Sub2) this).aBoolean9921) {
				Class454 class454 = method4502(class_ra, 262144, true, -1850458180);
				class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
			} else {
				class_na = ((Class365_Sub1_Sub2_Sub2) this).aClass_na9914;
				((Class365_Sub1_Sub2_Sub2) this).aClass_na9914 = null;
			}
			Class217 class217 = method4337().aClass217_2599;
			if (class_na != null)
				aClass331_7722.method4047(class_na, aByte7724, (int) class217.aFloat2451, (int) class217.aFloat2454, null, 174451452);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.d(").append(')').toString());
		}
	}

	public int method45() {
		return ((Class365_Sub1_Sub2_Sub2) this).anInt9915 * 2049836463;
	}

	public int method4380() {
		return (null != ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 ? ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.YA() : 0);
	}

	public int method35() {
		return Class424.aClass424_6610.anInt6613 * -1976050083;
	}

	public int method42() {
		return ((Class365_Sub1_Sub2_Sub2) this).aByte9917;
	}

	boolean method4384() {
		return ((Class365_Sub1_Sub2_Sub2) this).aBoolean9912;
	}

	public void method34() {
		if (((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 != null)
			((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.method4784();
	}

	public boolean method41() {
		return ((Class365_Sub1_Sub2_Sub2) this).aBoolean9921;
	}

	public void method28(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (((Class365_Sub1_Sub2_Sub2) this).aClass_na9914 == null && ((Class365_Sub1_Sub2_Sub2) this).aBoolean9921) {
			Class454 class454 = method4502(class_ra, 262144, true, -1804274121);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub2_Sub2) this).aClass_na9914;
			((Class365_Sub1_Sub2_Sub2) this).aClass_na9914 = null;
		}
		Class217 class217 = method4337().aClass217_2599;
		if (null != class_na)
			aClass331_7722.method4055(class_na, aByte7724, (int) class217.aFloat2451, (int) class217.aFloat2454, null, -1115505976);
	}

	public void method43(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (((Class365_Sub1_Sub2_Sub2) this).aClass_na9914 == null && ((Class365_Sub1_Sub2_Sub2) this).aBoolean9921) {
			Class454 class454 = method4502(class_ra, 262144, true, -2127866030);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub2_Sub2) this).aClass_na9914;
			((Class365_Sub1_Sub2_Sub2) this).aClass_na9914 = null;
		}
		Class217 class217 = method4337().aClass217_2599;
		if (class_na != null)
			aClass331_7722.method4047(class_na, aByte7724, (int) class217.aFloat2451, (int) class217.aFloat2454, null, 1644514804);
	}

	public void method40(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (((Class365_Sub1_Sub2_Sub2) this).aClass_na9914 == null && ((Class365_Sub1_Sub2_Sub2) this).aBoolean9921) {
			Class454 class454 = method4502(class_ra, 262144, true, -2044645596);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub2_Sub2) this).aClass_na9914;
			((Class365_Sub1_Sub2_Sub2) this).aClass_na9914 = null;
		}
		Class217 class217 = method4337().aClass217_2599;
		if (class_na != null)
			aClass331_7722.method4047(class_na, aByte7724, (int) class217.aFloat2451, (int) class217.aFloat2454, null, 710992193);
	}

	public Class365_Sub1_Sub2_Sub2(Class331 class331, GraphicsToolkit class_ra, Class433 class433, ObjectDefinitions class432, int i, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, int i_13_, boolean bool_14_) {
		super(class331, i_10_, i_11_, i_12_, i, i_9_, class432.anInt5418 * -228547261);
		((Class365_Sub1_Sub2_Sub2) this).aClass433_9918 = class433;
		((Class365_Sub1_Sub2_Sub2) this).anInt9915 = 646380829 * class432.anInt5365;
		((Class365_Sub1_Sub2_Sub2) this).aBoolean9916 = bool;
		((Class365_Sub1_Sub2_Sub2) this).aByte9917 = (byte) i_13_;
		((Class365_Sub1_Sub2_Sub2) this).aBoolean9919 = class432.anInt5382 * 1532834983 != 0 && !bool;
		((Class365_Sub1_Sub2_Sub2) this).aBoolean9912 = bool_14_;
		((Class365_Sub1_Sub2_Sub2) this).aBoolean9921 = (class_ra.method5082() && class432.aBoolean5433 && !((Class365_Sub1_Sub2_Sub2) this).aBoolean9916 && Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub7_7581.method5650(-1930969884) != 0);
		int i_15_ = 2048;
		if (((Class365_Sub1_Sub2_Sub2) this).aBoolean9912)
			i_15_ |= 0x10000;
		if (class432.aBoolean5441)
			i_15_ |= 0x80000;
		Class454 class454 = method4502(class_ra, i_15_, ((Class365_Sub1_Sub2_Sub2) this).aBoolean9921, -2037171144);
		if (class454 != null) {
			((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 = (Class387) class454.anObject5645;
			((Class365_Sub1_Sub2_Sub2) this).aClass_na9914 = (Class_na) class454.anObject5646;
			if (((Class365_Sub1_Sub2_Sub2) this).aBoolean9912 || class432.aBoolean5441) {
				((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 = ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.method4755((byte) 0, i_15_, false);
				if (class432.aBoolean5441) {
					Class287 class287 = client.aClass283_8716.method2632(-1945230052);
					((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.PA(1599271859 * class287.anInt3096, class287.anInt3097 * 1630923113, -1560648831 * class287.anInt3098, -57569897 * class287.anInt3099);
				}
			}
		}
		method4362(1, -105360757);
	}

	boolean method4365() {
		if (null != ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913)
			return !((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.u();
		return true;
	}

	boolean method4374() {
		if (null != ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913)
			return !((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.u();
		return true;
	}

	public Class334 method4367(GraphicsToolkit class_ra) {
		Class217 class217 = method4337().aClass217_2599;
		if (((Class365_Sub1_Sub2_Sub2) this).aClass334_9920 == null)
			((Class365_Sub1_Sub2_Sub2) this).aClass334_9920 = Class472.method6063((int) class217.aFloat2451, (int) class217.aFloat2455, (int) class217.aFloat2454, method4501(class_ra, 0, (byte) 71), 1982463178);
		return ((Class365_Sub1_Sub2_Sub2) this).aClass334_9920;
	}

	public Class334 method4368(GraphicsToolkit class_ra) {
		Class217 class217 = method4337().aClass217_2599;
		if (((Class365_Sub1_Sub2_Sub2) this).aClass334_9920 == null)
			((Class365_Sub1_Sub2_Sub2) this).aClass334_9920 = Class472.method6063((int) class217.aFloat2451, (int) class217.aFloat2455, (int) class217.aFloat2454, method4501(class_ra, 0, (byte) 44), 2033804861);
		return ((Class365_Sub1_Sub2_Sub2) this).aClass334_9920;
	}

	public int method36() {
		return Class424.aClass424_6610.anInt6613 * -1976050083;
	}

	void method4371(GraphicsToolkit class_ra) {
		/* empty */
	}

	void method4373(GraphicsToolkit class_ra) {
		/* empty */
	}

	boolean method4372(GraphicsToolkit class_ra, int i, int i_16_) {
		Class387 class387 = method4501(class_ra, 131072, (byte) 43);
		if (null != class387) {
			Matrix3f class222 = method4347();
			return class387.method4787(i, i_16_, class222, false, 0);
		}
		return false;
	}

	boolean method4385(GraphicsToolkit class_ra, int i, int i_17_) {
		Class387 class387 = method4501(class_ra, 131072, (byte) 125);
		if (null != class387) {
			Matrix3f class222 = method4347();
			return class387.method4787(i, i_17_, class222, false, 0);
		}
		return false;
	}

	boolean method4352(GraphicsToolkit class_ra, int i, int i_18_) {
		Class387 class387 = method4501(class_ra, 131072, (byte) 126);
		if (null != class387) {
			Matrix3f class222 = method4347();
			return class387.method4787(i, i_18_, class222, false, 0);
		}
		return false;
	}

	void method4375(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_19_, int i_20_, boolean bool) {
		if (class365_sub1 instanceof Class365_Sub1_Sub2_Sub2) {
			Class365_Sub1_Sub2_Sub2 class365_sub1_sub2_sub2_21_ = (Class365_Sub1_Sub2_Sub2) class365_sub1;
			if (((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 != null && null != ((Class365_Sub1_Sub2_Sub2) class365_sub1_sub2_sub2_21_).aClass387_9913)
				((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.method4745((((Class365_Sub1_Sub2_Sub2) class365_sub1_sub2_sub2_21_).aClass387_9913), i, i_19_, i_20_, bool);
		}
	}

	Class335 method4370(GraphicsToolkit class_ra) {
		if (((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 == null)
			return null;
		Matrix3f class222 = method4347();
		Class335 class335 = Class73.method818(((Class365_Sub1_Sub2_Sub2) this).aBoolean9919, 1241916364);
		((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.method4739(class222, aClass302_Sub1Array7726[0], 0);
		return class335;
	}

	void method4377() {
		((Class365_Sub1_Sub2_Sub2) this).aBoolean9912 = false;
		if (((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 != null)
			((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.KA(((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.m() & ~0x10000);
	}

	void method4378() {
		((Class365_Sub1_Sub2_Sub2) this).aBoolean9912 = false;
		if (((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 != null)
			((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.KA(((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.m() & ~0x10000);
	}

	public int method4379() {
		return (null != ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 ? ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.YA() : 0);
	}

	public void method44(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (((Class365_Sub1_Sub2_Sub2) this).aClass_na9914 == null && ((Class365_Sub1_Sub2_Sub2) this).aBoolean9921) {
			Class454 class454 = method4502(class_ra, 262144, true, -1967364085);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub2_Sub2) this).aClass_na9914;
			((Class365_Sub1_Sub2_Sub2) this).aClass_na9914 = null;
		}
		Class217 class217 = method4337().aClass217_2599;
		if (class_na != null)
			aClass331_7722.method4047(class_na, aByte7724, (int) class217.aFloat2451, (int) class217.aFloat2454, null, 193928700);
	}

	public int method4381() {
		return (null != ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 ? ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.YA() : 0);
	}

	Class335 method4394(GraphicsToolkit class_ra, int i) {
		try {
			if (((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 == null)
				return null;
			Matrix3f class222 = method4347();
			Class335 class335 = Class73.method818((((Class365_Sub1_Sub2_Sub2) this).aBoolean9919), 2139686110);
			((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.method4739(class222, aClass302_Sub1Array7726[0], 0);
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.bo(").append(')').toString());
		}
	}

	public void method33(GraphicsToolkit class_ra, int i) {
		try {
			Object object = null;
			Class_na class_na;
			if (((Class365_Sub1_Sub2_Sub2) this).aClass_na9914 == null && ((Class365_Sub1_Sub2_Sub2) this).aBoolean9921) {
				Class454 class454 = method4502(class_ra, 262144, true, -2121821591);
				class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
			} else {
				class_na = ((Class365_Sub1_Sub2_Sub2) this).aClass_na9914;
				((Class365_Sub1_Sub2_Sub2) this).aClass_na9914 = null;
			}
			Class217 class217 = method4337().aClass217_2599;
			if (null != class_na)
				aClass331_7722.method4055(class_na, aByte7724, (int) class217.aFloat2451, (int) class217.aFloat2454, null, -412237236);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.k(").append(')').toString());
		}
	}

	boolean method4349() {
		if (null != ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913)
			return ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.i();
		return false;
	}

	void method4388(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_22_, int i_23_, boolean bool) {
		if (class365_sub1 instanceof Class365_Sub1_Sub2_Sub2) {
			Class365_Sub1_Sub2_Sub2 class365_sub1_sub2_sub2_24_ = (Class365_Sub1_Sub2_Sub2) class365_sub1;
			if (((Class365_Sub1_Sub2_Sub2) this).aClass387_9913 != null && null != ((Class365_Sub1_Sub2_Sub2) class365_sub1_sub2_sub2_24_).aClass387_9913)
				((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.method4745((((Class365_Sub1_Sub2_Sub2) class365_sub1_sub2_sub2_24_).aClass387_9913), i, i_22_, i_23_, bool);
		}
	}

	public int method32(byte i) {
		try {
			return ((Class365_Sub1_Sub2_Sub2) this).anInt9915 * 2049836463;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.a(").append(')').toString());
		}
	}

	boolean method4353() {
		if (null != ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913)
			return !((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.u();
		return true;
	}

	boolean method4400() {
		return ((Class365_Sub1_Sub2_Sub2) this).aBoolean9912;
	}

	boolean method4386() {
		return ((Class365_Sub1_Sub2_Sub2) this).aBoolean9912;
	}

	boolean method4387() {
		return ((Class365_Sub1_Sub2_Sub2) this).aBoolean9912;
	}

	boolean method4376(short i) {
		try {
			if (null != ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913)
				return ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.i();
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.be(").append(')').toString());
		}
	}

	boolean method4399(byte i) {
		try {
			if (null != ((Class365_Sub1_Sub2_Sub2) this).aClass387_9913)
				return !((Class365_Sub1_Sub2_Sub2) this).aClass387_9913.u();
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.bf(").append(')').toString());
		}
	}

	static final void method4503(ClientScript2 class403, int i) {
		try {
			int i_25_ = (((ClientScript2) class403).anIntArray5257[((ClientScript2) class403).anInt5259 * 1883543357]);
			int i_26_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (i_26_ < 0 || i_26_ >= ((ClientScript2) class403).anIntArray5236[i_25_])
				throw new RuntimeException();
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((ClientScript2) class403).anIntArrayArray5238[i_25_][i_26_];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wo.au(").append(')').toString());
		}
	}
}
