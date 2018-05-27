/* Class388 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class388 implements Interface41 {
	String aString4719;
	Index aClass317_4720;
	static Index aClass317_4721;
	public static int anInt4722;
	public static int anInt4723;

	public Class445 method234() {
		return Class445.aClass445_5382;
	}

	public Class445 method232(byte i) {
		return Class445.aClass445_5382;
	}

	Class388(Index class317, String string) {
		((Class388) this).aClass317_4720 = class317;
		((Class388) this).aString4719 = string;
	}

	public int method231() {
		if (((Class388) this).aClass317_4720.method5629(((Class388) this).aString4719, 71472045))
			return 100;
		return ((Class388) this).aClass317_4720.method5631(((Class388) this).aString4719, (byte) 58);
	}

	public Class445 method230() {
		return Class445.aClass445_5382;
	}

	public Class445 method233() {
		return Class445.aClass445_5382;
	}

	public int method84(int i) {
		if (((Class388) this).aClass317_4720.method5629(((Class388) this).aString4719, 71472045))
			return 100;
		return ((Class388) this).aClass317_4720.method5631(((Class388) this).aString4719, (byte) 25);
	}

	public Class445 method235() {
		return Class445.aClass445_5382;
	}

	static final void method6687(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class521_Sub1_Sub4.method14892(class118, class98, class527, (byte) 121);
	}

	static final void method6688(CS2Executor class527, byte i) {
		UnderlayDefinition class513;
		if (((CS2Executor) class527).aBool7022) {
			if (i != 63)
				return;
			class513 = ((CS2Executor) class527).aClass513_6994;
		} else
			class513 = ((CS2Executor) class527).aClass513_7007;
		UnderlayDefinition class513_0_ = class513;
		Class118 class118 = ((UnderlayDefinition) class513_0_).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513_0_).aClass98_5885;
		Class336.method6010(class118, class98, class527, -1956215078);
	}

	static final void method6689(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		int[] is = Class96_Sub14.method14642(string, class527, 1724948075);
		if (is != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1397 = Class351.method6193(string, class527, 116060778);
		class118.anIntArray1401 = is;
		class118.aBool1384 = true;
	}

	static final void method6690(Class118 class118, Class98 class98, CS2Executor class527, byte i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 41262162) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1361 = Class351.method6193(string, class527, -295691698);
		class118.aBool1384 = true;
	}

	static final void method6691(CS2Executor class527, int i) {
		boolean bool = ((((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]) != 0);
		int i_1_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = Class202.method3342((long) i_1_, 0, bool, Class223.CURRENT_LANGUAGE, (byte) -28);
	}

	static void method6692(int i) {
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4627, client.aClass184_7475.aClass432_2283, 1965593342);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(Class158.method2730((short) -245));
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(-418109423 * Class349.anInt4083, 1417031095);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(client.anInt3243 * -969250379, 1417031095);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(Class393.aClass282_Sub54_4783.aClass468_Sub4_8223.method12641(-965992195));
		client.aClass184_7475.method3049(class282_sub23, 664640946);
	}

	static boolean method6693(int i) {
		if (-1741204137 * client.anInt7166 != 5)
			return false;
		if (JS5CacheFile.method3360((byte) 103) || Class85.method1466(-611019435))
			return false;
		return true;
	}

	static void method6694(Class200 class200, int i, int i_2_, int i_3_, MeshRasterizer class528, int i_4_) {
		if (null != class528)
			class200.method3253(i, i_2_, i_3_, class528.N(), class528.RA(), class528.ya(), class528.YA(), class528.o(), class528.AA(), class528.ha());
	}

	static final void method6695(CS2Executor class527, int i) {
		Class101.method1774((byte) -107);
	}
}
