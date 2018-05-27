/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class2 {
	static String aString13 = "true";
	static String aString14 = ",";
	static String aString15 = " (";
	public static String aString16;
	static String aString17;
	static String aString18 = ")";
	static String aString19;
	static String aString20;

	Class2() throws Throwable {
		throw new Error();
	}

	public static String method255(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	public static String method256(int i) {
		return new StringBuilder().append("<img=").append(i).append(">").toString();
	}

	static {
		aString17 = "->";
		aString19 = "127.0.0.1";
		aString16 = "<br>";
		aString20 = "</col>";
	}

	public static void method257(String string, String string_0_, int i) {
		if (string.length() <= 320 && Class388.method6693(1589792436)) {
			Class290.method5118((byte) -52);
			Class9.aString99 = string;
			Class9.aString102 = string_0_;
			Class365.method6298(19, 1621476114);
		}
	}

	public static void method258(String string, int i) {
		Class191.method3167(0, 0, "", "", "", string, 1534931586);
	}

	public static int method259(int i, int i_1_, int i_2_, int i_3_) {
		i_2_ &= 0x3;
		if (0 == i_2_)
			return i_1_;
		if (i_2_ == 1)
			return 7 - i;
		if (2 == i_2_)
			return 7 - i_1_;
		return i;
	}

	static final void method260(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Language.method8277(class118, class98, class527, 1708366546);
	}

	static final void method261(CS2Executor class527, byte i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (class527.animable.anInt10374 * 226532721);
	}

	public static Class458[] method262(byte i) {
		return (new Class458[] { Class458.aClass458_5475, Class458.aClass458_5486, Class458.aClass458_5492, Class458.aClass458_5484, Class458.aClass458_5471, Class458.aClass458_5488, Class458.aClass458_5474, Class458.aClass458_5476, Class458.aClass458_5489, Class458.aClass458_5478, Class458.aClass458_5493, Class458.aClass458_5473, Class458.aClass458_5479, Class458.aClass458_5472, Class458.aClass458_5490, Class458.aClass458_5487, Class458.aClass458_5477, Class458.aClass458_5480,
				Class458.aClass458_5491, Class458.aClass458_5485, Class458.aClass458_5470, Class458.aClass458_5482, Class458.aClass458_5483 });
	}

	static void method263(Class282_Sub18 class282_sub18, byte i) {
		if (!Class337.aLinkedList3969.contains(class282_sub18))
			Class337.aLinkedList3969.add(class282_sub18);
	}
}
