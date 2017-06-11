/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55 {
	public int anInt556;
	public static Class55 aClass55_557;
	public static Class55 aClass55_558;
	public static Class55 aClass55_559;
	public static Class55 aClass55_560 = new Class55(5, 3);
	public static Class55 aClass55_561;
	static Class55 aClass55_562;
	static Class55 aClass55_563;
	public static Class55 aClass55_564;
	public static Class55 aClass55_565;
	public int anInt566;
	public static Class55 aClass55_567;

	static {
		aClass55_557 = new Class55(9, 4);
		aClass55_567 = new Class55(7, 1);
		aClass55_559 = new Class55(1, 1);
		aClass55_565 = new Class55(3, 2);
		aClass55_561 = new Class55(2, 1);
		aClass55_562 = new Class55(6, 3);
		aClass55_563 = new Class55(4, 4);
		aClass55_564 = new Class55(8, 1);
		aClass55_558 = new Class55(0, 1);
	}

	Class55(int i, int i_0_) {
		anInt566 = i * -57892181;
		anInt556 = i_0_ * -1192469397;
	}

	static final void method603(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			Class386.method4725(Class287.myPlayer, (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 * 681479919)]), (((ClientScript2) class403).anIntArray5244[(681479919 * ((ClientScript2) class403).anInt5239 + 1)]), -16777216);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ce.sm(").append(')').toString());
		}
	}

	static final void method604(ClientScript2 class403, byte i) {
		try {
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub25_7569, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]), -2054835114);
			Class3.method300(656179282);
			client.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ce.aie(").append(')').toString());
		}
	}

	static final void method605(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class359.method4292(class105, class119, class403, (byte) -16);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ce.no(").append(')').toString());
		}
	}

	static void method606(String[] strings, int i) {
		try {
			if (strings.length > 1) {
				for (int i_1_ = 0; i_1_ < strings.length; i_1_++) {
					if (strings[i_1_].startsWith("pause")) {
						int i_2_ = 5;
						try {
							i_2_ = Integer.parseInt(strings[i_1_].substring(6));
						} catch (Exception exception) {
							/* empty */
						}
						Class255.method2435(new StringBuilder().append("Pausing for ").append(i_2_).append(" seconds...").toString(), 357563950);
						Class8.aStringArray109 = strings;
						Class8.anInt104 = -1428832631 * (i_1_ + 1);
						Class146.aLong1576 = (Class122.method1319((byte) 1) + (long) (i_2_ * 1000)) * 6717445677357895093L;
						break;
					}
					Class8.aString101 = strings[i_1_];
					Class142.method1568(false, 1496417723);
				}
			} else {
				Class8.aString101 = new StringBuilder().append(Class8.aString101).append(strings[0]).toString();
				Class8.anInt99 += strings[0].length() * 1914783065;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ce.d(").append(')').toString());
		}
	}

	static void method607(int i) {
		try {
			if (-1217082313 * Class8.anInt105 > 0) {
				int i_3_ = 0;
				for (int i_4_ = 0; i_4_ < Class8.aStringArray107.length; i_4_++) {
					if (Class8.aStringArray107[i_4_].indexOf("--> ") != -1 && ++i_3_ == Class8.anInt105 * -1217082313) {
						Class8.aString101 = (Class8.aStringArray107[i_4_].substring(Class8.aStringArray107[i_4_].indexOf('>') + 2));
						break;
					}
				}
			} else
				Class8.aString101 = "";
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ce.x(").append(')').toString());
		}
	}
}
