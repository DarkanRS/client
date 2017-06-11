/* Class285 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

public final class Class285 {
	static int[] routeFinderYArray;
	static int anInt3075 = 128;
	static int[][] anIntArrayArray3076 = new int[128][128];
	static int[] routeFinderXArray;
	static int anInt3078;
	static int anInt3079 = 128;
	static int[][] anIntArrayArray3080 = new int[128][128];
	static int anInt3081 = 4095;
	static Font aFont3082;
	public static Class298_Sub19_Sub4 aClass298_Sub19_Sub4_3083;

	static {
		routeFinderXArray = new int[4096];
		routeFinderYArray = new int[4096];
	}

	Class285() throws Throwable {
		throw new Error();
	}

	public static String method2709(int i, int i_0_) {
		try {
			return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lv.f(").append(')').toString());
		}
	}

	public static void method2710(int i, byte i_1_) {
		try {
			Class298_Sub49 class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.get((long) i));
			if (class298_sub49 != null) {
				((Class298_Sub49) class298_sub49).aClass308_Sub1_7591.method3771((byte) 57);
				Class125.method1395(1566028323 * ((Class298_Sub49) class298_sub49).anInt7589, (((Class298_Sub49) class298_sub49).aBoolean7588), 1982223094);
				class298_sub49.unlink(-1460969981);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lv.b(").append(')').toString());
		}
	}

	static final void method2711(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class429.method5758(class105, class403, 378164107);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lv.cx(").append(')').toString());
		}
	}

	static final void method2712(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			if (i - i_3_ >= Class372_Sub1.anInt4051 * -1424479739 && i + i_3_ <= Class372_Sub1.anInt4048 * 1135094847 && i_2_ - i_3_ >= Class372_Sub1.anInt4049 * 1155384281 && i_3_ + i_2_ <= -1062447355 * Class372_Sub1.anInt4050)
				Class487.method6165(i, i_2_, i_3_, i_4_, i_5_, i_6_, 1691112571);
			else
				Class315.method3836(i, i_2_, i_3_, i_4_, i_5_, i_6_, (byte) 55);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lv.u(").append(')').toString());
		}
	}

	public static int method2713(int i, int i_8_, int i_9_) {
		try {
			if (i_8_ > i) {
				int i_10_ = i;
				i = i_8_;
				i_8_ = i_10_;
			}
			int i_11_;
			for (/**/; 0 != i_8_; i_8_ = i_11_) {
				i_11_ = i % i_8_;
				i = i_8_;
			}
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lv.f(").append(')').toString());
		}
	}

	static void method2714(Class298_Sub37_Sub15 class298_sub37_sub15, byte i) {
		try {
			if (!Class436.aBoolean5478) {
				class298_sub37_sub15.unlink(-1460969981);
				Class436.anInt5506 -= -970198067;
				if (!((Class298_Sub37_Sub15) class298_sub37_sub15).aBoolean9668) {
					long l = (6619564980435866523L * (((Class298_Sub37_Sub15) class298_sub37_sub15).aLong9666));
					Class298_Sub37_Sub5 class298_sub37_sub5;
					for (class298_sub37_sub5 = ((Class298_Sub37_Sub5) Class436.aClass437_5470.get(l)); class298_sub37_sub5 != null; class298_sub37_sub5 = ((Class298_Sub37_Sub5) Class436.aClass437_5470.nextInBucket(-1565779381))) {
						if (((Class298_Sub37_Sub5) class298_sub37_sub5).aString9585.equals(((Class298_Sub37_Sub15) class298_sub37_sub15).aString9657)) {
							if (i == 2) {
								/* empty */
							}
							break;
						}
					}
					if (null != class298_sub37_sub5 && class298_sub37_sub5.method3418(class298_sub37_sub15, -948596623))
						Class75.method837(class298_sub37_sub5, -2092429244);
				} else {
					for (Class298_Sub37_Sub5 class298_sub37_sub5 = ((Class298_Sub37_Sub5) Class436.aClass461_5482.method5984(-1184499761)); class298_sub37_sub5 != null; class298_sub37_sub5 = ((Class298_Sub37_Sub5) Class436.aClass461_5482.method5985(79001809))) {
						if (((Class298_Sub37_Sub5) class298_sub37_sub5).aString9585.equals(((Class298_Sub37_Sub15) class298_sub37_sub15).aString9657)) {
							boolean bool = false;
							for (Class298_Sub37_Sub15 class298_sub37_sub15_12_ = ((Class298_Sub37_Sub15) ((Class298_Sub37_Sub5) class298_sub37_sub5).aClass461_9584.method5984(-611796752)); class298_sub37_sub15_12_ != null; class298_sub37_sub15_12_ = ((Class298_Sub37_Sub15) ((Class298_Sub37_Sub5) class298_sub37_sub5).aClass461_9584.method5985(241315594))) {
								if (class298_sub37_sub15_12_ == class298_sub37_sub15) {
									if (class298_sub37_sub5.method3418(class298_sub37_sub15, -948596623))
										Class75.method837(class298_sub37_sub5, -1144026748);
									bool = true;
									break;
								}
							}
							if (bool) {
								if (i != 2)
									break;
								break;
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lv.m(").append(')').toString());
		}
	}
}
