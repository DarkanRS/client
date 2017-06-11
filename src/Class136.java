/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class136 implements Interface6 {
	Class57 aClass57_6385;
	Class158 aClass158_6386;
	Class243 aClass243_6387;
	public static int[] anIntArray6388;

	public void method55() {
		((Class136) this).aClass57_6385 = Class422_Sub10.method5663(((Class136) this).aClass243_6387, -610589451 * (((Class136) this).aClass158_6386.anInt6361), (byte) -80);
	}

	public void method53(int i) {
		try {
			((Class136) this).aClass57_6385 = Class422_Sub10.method5663(((Class136) this).aClass243_6387, -610589451 * (((Class136) this).aClass158_6386.anInt6361), (byte) -10);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fm.a(").append(')').toString());
		}
	}

	public void method58(boolean bool, byte i) {
		try {
			if (bool) {
				int i_0_ = ((((Class136) this).aClass158_6386.aClass139_6360.method1545(((Class136) this).aClass57_6385.method271(), client.anInt8794 * 775068819, -2059315000)) + (-245579987 * ((Class136) this).aClass158_6386.anInt6362));
				int i_1_ = ((((Class136) this).aClass158_6386.aClass133_6363.method1482(((Class136) this).aClass57_6385.method626(), client.anInt8803 * -791746413, -1363619703)) + (((Class136) this).aClass158_6386.anInt6359 * -1426302101));
				((Class136) this).aClass57_6385.method645(i_0_, i_1_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fm.f(").append(')').toString());
		}
	}

	public boolean method52(int i) {
		try {
			return (((Class136) this).aClass243_6387.method2310(-610589451 * ((Class136) this).aClass158_6386.anInt6361, -457216440));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fm.b(").append(')').toString());
		}
	}

	public void method56(boolean bool) {
		if (bool) {
			int i = ((((Class136) this).aClass158_6386.aClass139_6360.method1545(((Class136) this).aClass57_6385.method271(), client.anInt8794 * 775068819, -2133654536)) + -245579987 * ((Class136) this).aClass158_6386.anInt6362);
			int i_2_ = ((((Class136) this).aClass158_6386.aClass133_6363.method1482(((Class136) this).aClass57_6385.method626(), client.anInt8803 * -791746413, -1742244574)) + ((Class136) this).aClass158_6386.anInt6359 * -1426302101);
			((Class136) this).aClass57_6385.method645(i, i_2_);
		}
	}

	public boolean method54() {
		return (((Class136) this).aClass243_6387.method2310(-610589451 * ((Class136) this).aClass158_6386.anInt6361, -457216440));
	}

	public boolean method57() {
		return (((Class136) this).aClass243_6387.method2310(-610589451 * ((Class136) this).aClass158_6386.anInt6361, -457216440));
	}

	Class136(Class243 class243, Class158 class158) {
		((Class136) this).aClass243_6387 = class243;
		((Class136) this).aClass158_6386 = class158;
	}

	public boolean method59() {
		return (((Class136) this).aClass243_6387.method2310(-610589451 * ((Class136) this).aClass158_6386.anInt6361, -457216440));
	}

	public static void method1495(int i, int i_3_, int i_4_, int i_5_) {
		try {
			i_4_ = (i_4_ * Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7584.method5726(-2142096131) >> 8);
			if (0 != i_4_ && i != -1) {
				if (!Class300.aBoolean3208 && -1256171511 * Class300.anInt3207 != -1 && Class68.method781(87442639) && !Class82_Sub9.method899((byte) 9)) {
					Class298_Sub2.aClass298_Sub19_Sub1_7167 = Class173.method1819(34386078);
					Class368.method4555((short) 1644);
					Class298_Sub19_Sub1 class298_sub19_sub1 = Class8.method318((Class298_Sub2.aClass298_Sub19_Sub1_7167), -1213425929);
					Class68.method777(true, class298_sub19_sub1, 1899476415);
				}
				Class477.method6096(Class463.aClass243_5688, i, 0, i_4_, false, -1993911100);
				Class323_Sub1.method3955(-1, 255, -1975547626);
				Class300.aBoolean3208 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fm.c(").append(')').toString());
		}
	}

	static final void method1496(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class82_Sub14.method912(class105, class119, class403, 2141482523);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fm.in(").append(')').toString());
		}
	}

	static final void method1497(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.aShort8928;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.aShort8929;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fm.akc(").append(')').toString());
		}
	}

	static Class method1498(String string, byte i) throws ClassNotFoundException {
		try {
			if (string.equals("B"))
				return Byte.TYPE;
			if (string.equals("I"))
				return Integer.TYPE;
			if (string.equals("S"))
				return Short.TYPE;
			if (string.equals("J"))
				return Long.TYPE;
			if (string.equals("Z"))
				return Boolean.TYPE;
			if (string.equals("F"))
				return Float.TYPE;
			if (string.equals("D"))
				return Double.TYPE;
			if (string.equals("C"))
				return Character.TYPE;
			if (string.equals("void"))
				return Void.TYPE;
			return Class.forName(string);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fm.i(").append(')').toString());
		}
	}

	public static final void method1499(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		try {
			if (i >= Class372_Sub3.anInt4051 * -1424479739 && i_6_ <= Class372_Sub3.anInt4048 * 1135094847 && i_7_ >= 1155384281 * Class372_Sub3.anInt4049 && i_8_ <= Class372_Sub3.anInt4050 * -1062447355) {
				if (1 == i_10_)
					Class365_Sub1_Sub5_Sub1.method4529(i, i_6_, i_7_, i_8_, i_9_, -616636288);
				else
					Class365_Sub1_Sub3_Sub2.method4514(i, i_6_, i_7_, i_8_, i_9_, i_10_, 1228342009);
			} else if (1 == i_10_)
				Class315.method3835(i, i_6_, i_7_, i_8_, i_9_, (byte) 16);
			else
				Class_v.method3672(i, i_6_, i_7_, i_8_, i_9_, i_10_, 630835292);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fm.r(").append(')').toString());
		}
	}

	static final void method1500(ClientScript2 class403, int i) {
		try {
			boolean bool = ((((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) != 0);
			if (Class287.myPlayer.aClass366_10209 != null)
				Class287.myPlayer.aClass366_10209.method4540(bool, -635669328);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fm.cw(").append(')').toString());
		}
	}

	static final void method1501(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ItemDefinitions.method6043(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-1033655497), 200, -564822941);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fm.akd(").append(')').toString());
		}
	}
}
