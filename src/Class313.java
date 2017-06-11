/* Class313 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class313 {
	static int anInt3295 = 63;
	static int anInt3296 = 7;
	public static int anInt3297;
	public static Object[] anObjectArray3298;
	public static Class57 aClass57_3299;
	static Class97 aClass97_3300;

	Class313() throws Throwable {
		throw new Error();
	}

	public static void method3820(int i, int i_0_, boolean bool, int i_1_) {
		try {
			if (Class423.aClass437_5354.get((long) i) == null) {
				if (!client.aBoolean8806)
					Class125.method1395(i, bool, 1982223094);
				else {
					Class298_Sub49 class298_sub49 = (new Class298_Sub49(i, new Class308_Sub1(4096, Class517.aClass243_6270, i), i_0_, bool));
					((Class298_Sub49) class298_sub49).aClass308_Sub1_7591.method3764(Class321.aClass429_3357.method5753(1748854882), (byte) 104);
					Class423.aClass437_5354.method5817(class298_sub49, (long) i);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("n.a(").append(')').toString());
		}
	}

	static int[] method3821(Class298_Sub37_Sub15 class298_sub37_sub15, byte i) {
		try {
			int[] is = null;
			if (Class398.method4920(946432351 * (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662), (short) 300))
				is = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions((int) ((((Class298_Sub37_Sub15) class298_sub37_sub15).aLong9661) * 2236412381003659263L)).anIntArray5767);
			else if (-1 != (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9660) * -149710173)
				is = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions((((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9660 * -149710173)).anIntArray5767);
			else if (Class302.method3716(946432351 * (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662), -838004269)) {
				Class298_Sub29 class298_sub29 = ((Class298_Sub29) (client.npcs.get((long) (int) (2236412381003659263L * ((Class298_Sub37_Sub15) class298_sub37_sub15).aLong9661))));
				if (class298_sub29 != null) {
					NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.anObject7366);
					SomethingDefinitions class503 = class365_sub1_sub1_sub2_sub1.aClass503_10190;
					if (null != class503.anIntArray6188)
						class503 = class503.method6240(Class128.aClass148_6331, 2033982126);
					if (class503 != null)
						is = class503.anIntArray6131;
				}
			} else if (Class395.method4907((((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 * 946432351), (byte) -114)) {
				ObjectDefinitions class432 = (client.aClass283_8716.method2641(150013546).getObjectDefinitions((int) (2236412381003659263L * (((Class298_Sub37_Sub15) class298_sub37_sub15).aLong9661) >>> 32 & 0x7fffffffL)));
				if (class432.anIntArray5366 != null)
					class432 = class432.method5777(Class128.aClass148_6331, 1956265286);
				if (null != class432)
					is = class432.anIntArray5370;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("n.ag(").append(')').toString());
		}
	}

	static final void method3822(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class523.method6329(class105, class403, -2024770880);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("n.qm(").append(')').toString());
		}
	}
}
