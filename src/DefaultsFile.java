/* Class524 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class DefaultsFile {
	static DefaultsFile FILE_5;
	static DefaultsFile FILE_2;
	public static DefaultsFile FILE_1 = new DefaultsFile(1);
	static DefaultsFile FILE_3;
	public static DefaultsFile FILE_4;
	static DefaultsFile FILE_6;
	static DefaultsFile FILE_7;
	static DefaultsFile FILE_8;
	public int anInt6966;
	static Class194 aClass194_6967;

	DefaultsFile(int i) {
		anInt6966 = i * -1916651541;
	}

	static {
		FILE_2 = new DefaultsFile(2);
		FILE_3 = new DefaultsFile(3);
		FILE_4 = new DefaultsFile(4);
		FILE_5 = new DefaultsFile(5);
		FILE_6 = new DefaultsFile(6);
		FILE_7 = new DefaultsFile(7);
		FILE_8 = new DefaultsFile(8);
	}

	static final void method11221(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1482833983) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1393 = Class351.method6193(string, class527, -404986216);
		class118.aBool1384 = true;
	}

	static final void method11222(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_0_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_1_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		AttributeDefault class437 = IndexLoaders.ITEM_DEFAULTS.method7069(i_1_, (byte) 0);
		if (class437.method7319(1753438100))
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = IndexLoaders.MAP_REGION_DECODER.method4436(-2071995524).getObjectDefinitions(i_0_, 65280).method7973(i_1_, class437.aString5335, (byte) 97);
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (IndexLoaders.MAP_REGION_DECODER.method4436(-1502045991).getObjectDefinitions(i_0_, 65280).method7963(i_1_, -1741480635 * class437.anInt5337, 1059658238));
	}

	static final void method11223(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 382641837) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1392 = Class351.method6193(string, class527, 1828799616);
		class118.aBool1384 = true;
	}

	static final void method11224(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_2_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_3_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		if (null != Class84.myPlayer.playerAppearance) {
			for (int i_4_ = 0; i_4_ < Class44.anIntArray428.length; i_4_++) {
				if (Class44.anIntArray428[i_4_] == i_2_) {
					Class84.myPlayer.playerAppearance.method3993(i_4_, i_3_, IndexLoaders.aClass31_204, -1891661545);
					return;
				}
			}
			for (int i_5_ = 0; i_5_ < Class44.anIntArray422.length; i_5_++) {
				if (Class44.anIntArray422[i_5_] == i_2_) {
					Class84.myPlayer.playerAppearance.method3993(i_5_, i_3_, IndexLoaders.aClass31_204, 938562628);
					break;
				}
			}
		}
	}
}
