/* Class230 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class230 {
	static long aLong2560;
	static Class227[] aClass227Array2561;
	static Interface12[] anInterface12Array2562;
	static int anInt2563;
	static Class243 aClass243_2564;
	static int anInt2565;
	static int anInt2566;
	static boolean aBoolean2567;
	static int[] anIntArray2568 = { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	static {
		anInt2563 = -64708895;
		anInt2565 = -1430761433;
	}

	Class230() throws Throwable {
		throw new Error();
	}

	static void method2125(GraphicsToolkit class_ra, IComponentDefinition class105, int i) {
		try {
			boolean bool = ((Class298_Sub32_Sub14.aClass477_9400.method6085(class_ra, class105.anInt1280 * -1232467723, -66163287 * class105.anInt1281, 547522005 * class105.anInt1178, ~0xffffff | class105.anInt1251 * -2065110161, 2097772641 * class105.anInt1201, (class105.aBoolean1213 ? (Class287.myPlayer.aClass366_10209) : null), 467134725)) == null);
			if (bool) {
				Class522.aClass453_6283.method5935(new Class298_Sub14(-1232467723 * class105.anInt1280, class105.anInt1281 * -66163287, class105.anInt1178 * 547522005, (~0xffffff | class105.anInt1251 * -2065110161), 2097772641 * class105.anInt1201, class105.aBoolean1213), 829085914);
				Tradution.method6054(class105, 1662949261);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("js.a(").append(')').toString());
		}
	}

	static final void method2126(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.anInt1168 * 1867913305;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("js.pm(").append(')').toString());
		}
	}

	static final void method2127(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2034, client.lobbyConnection.aClass449_330, (byte) 126);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(Class58.method693(string, -19370609));
			class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2104083010);
			client.lobbyConnection.method390(class298_sub36, (byte) -70);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("js.vn(").append(')').toString());
		}
	}
}
