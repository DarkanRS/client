/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class73 {
	HashTable aClass437_687;
	int anInt688;
	public static int anInt689;

	Class73(int i) {
		((Class73) this).anInt688 = 547036117 * i;
	}

	public void method814(int i, int i_0_, int i_1_) {
		try {
			if (null == ((Class73) this).aClass437_687)
				((Class73) this).aClass437_687 = new HashTable(-1623767683 * ((Class73) this).anInt688);
			Class298_Sub35 class298_sub35 = ((Class298_Sub35) ((Class73) this).aClass437_687.get((long) i));
			if (null != class298_sub35)
				class298_sub35.anInt7394 = -898670337 * i_0_;
			else {
				class298_sub35 = new Class298_Sub35(i_0_);
				((Class73) this).aClass437_687.method5817(class298_sub35, (long) i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cz.f(").append(')').toString());
		}
	}

	public int method815(int i, byte i_2_) {
		try {
			Class434 class434 = Class82_Sub16.aClass427_6886.method5748(i, -1438180456);
			int i_3_ = class434.anInt5458 * -1979044991;
			int i_4_ = (31 == class434.anInt5457 * -1638834999 ? -1 : (1 << class434.anInt5457 * -1638834999 + 1) - 1);
			return ((method817(i_3_, -1967259188) & i_4_) >>> -2127213381 * class434.anInt5459);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cz.p(").append(')').toString());
		}
	}

	public void method816(byte i) {
		try {
			if (((Class73) this).aClass437_687 != null)
				((Class73) this).aClass437_687.clear((byte) -14);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cz.a(").append(')').toString());
		}
	}

	public int method817(int i, int i_5_) {
		try {
			Class298_Sub35 class298_sub35 = ((Class298_Sub35) ((Class73) this).aClass437_687.get((long) i));
			if (null != class298_sub35)
				return class298_sub35.anInt7394 * -774922497;
			Class485 class485 = Class422_Sub7.aClass445_8384.method5892(i, 1792178977);
			if ('i' != class485.aChar6058)
				return -1;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cz.b(").append(')').toString());
		}
	}

	public static Class335 method818(boolean bool, int i) {
		try {
			synchronized (Class335.aStack3619) {
				Class335 class335;
				if (Class335.aStack3619.isEmpty())
					class335 = new Class335();
				else
					class335 = (Class335) Class335.aStack3619.pop();
				((Class335) class335).aBoolean3617 = bool;
				Class335 class335_6_ = class335;
				return class335_6_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cz.a(").append(')').toString());
		}
	}

	static final void method819(ClientScript2 class403, int i) {
		try {
			int i_7_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_7_, (byte) 73);
			Class119 class119 = Class389.aClass119Array4165[i_7_ >> 16];
			Class318.method3875(class105, class119, class403, -1870622749);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cz.cn(").append(')').toString());
		}
	}

	static final void method820(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class391.method4887(class105, class119, class403, (byte) -38);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cz.dd(").append(')').toString());
		}
	}

	static final void method821(IComponentDefinition class105, Class119 class119, ClientScript2 class403, short i) {
		try {
			int i_8_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (i_8_ != class105.anInt1290 * 1347982601) {
				if (-1 != i_8_) {
					if (null == class105.aClass438_1152)
						class105.aClass438_1152 = new Class438_Sub1();
					class105.aClass438_1152.method5821(i_8_, -1614086942);
				} else
					class105.aClass438_1152 = null;
				class105.anInt1290 = 1587382585 * i_8_;
				Tradution.method6054(class105, -1503687245);
			}
			if (-1 == -1309843523 * class105.anInt1154 && !class119.aBoolean1403)
				Class365_Sub1_Sub1_Sub5.method4490(-440872681 * class105.anInt1142, -1349352488);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cz.eu(").append(')').toString());
		}
	}

	public static String method822(Class298_Sub37_Sub15 class298_sub37_sub15, int i) {
		try {
			if (Class436.aBoolean5478 || class298_sub37_sub15 == null)
				return "";
			return ((Class298_Sub37_Sub15) class298_sub37_sub15).aString9667;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cz.az(").append(')').toString());
		}
	}
}
