/* Class524 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class524 {
	static Class524 aClass524_6958;
	static Class524 aClass524_6959;
	public static Class524 aClass524_6960 = new Class524(1);
	static Class524 aClass524_6961;
	public static Class524 aClass524_6962;
	static Class524 aClass524_6963;
	static Class524 aClass524_6964;
	static Class524 aClass524_6965;
	public int anInt6966;
	static Class194 aClass194_6967;

	Class524(int i) {
		anInt6966 = i * -1916651541;
	}

	static {
		aClass524_6959 = new Class524(2);
		aClass524_6961 = new Class524(3);
		aClass524_6962 = new Class524(4);
		aClass524_6958 = new Class524(5);
		aClass524_6963 = new Class524(6);
		aClass524_6964 = new Class524(7);
		aClass524_6965 = new Class524(8);
	}

	static final void method11221(Class118 class118, Class98 class98, Class527 class527, int i) {
		String string = (String) (((Class527) class527).anObjectArray7019[(((Class527) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1482833983) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1393 = Class351.method6193(string, class527, -404986216);
		class118.aBool1384 = true;
	}

	static final void method11222(Class527 class527, int i) {
		((Class527) class527).anInt7012 -= 283782002;
		int i_0_ = (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012]);
		int i_1_ = (((Class527) class527).anIntArray6999[1 + ((Class527) class527).anInt7012 * 1942118537]);
		Class437 class437 = Class125.aClass424_1573.method7069(i_1_, (byte) 0);
		if (class437.method7319(1753438100))
			((Class527) class527).anObjectArray7019[((((Class527) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = client.aClass257_7353.method4436(-2071995524).method7891(i_0_, 65280).method7973(i_1_, class437.aString5335, (byte) 97);
		else
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = (client.aClass257_7353.method4436(-1502045991).method7891(i_0_, 65280).method7963(i_1_, -1741480635 * class437.anInt5337, 1059658238));
	}

	static final void method11223(Class118 class118, Class98 class98, Class527 class527, int i) {
		String string = (String) (((Class527) class527).anObjectArray7019[(((Class527) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 382641837) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1392 = Class351.method6193(string, class527, 1828799616);
		class118.aBool1384 = true;
	}

	static final void method11224(Class527 class527, int i) {
		((Class527) class527).anInt7012 -= 283782002;
		int i_2_ = (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537]);
		int i_3_ = (((Class527) class527).anIntArray6999[1 + ((Class527) class527).anInt7012 * 1942118537]);
		if (null != Class84.myPlayer.aClass238_10558) {
			for (int i_4_ = 0; i_4_ < Class44.anIntArray428.length; i_4_++) {
				if (Class44.anIntArray428[i_4_] == i_2_) {
					Class84.myPlayer.aClass238_10558.method3993(i_4_, i_3_, Class20.aClass31_204, -1891661545);
					return;
				}
			}
			for (int i_5_ = 0; i_5_ < Class44.anIntArray422.length; i_5_++) {
				if (Class44.anIntArray422[i_5_] == i_2_) {
					Class84.myPlayer.aClass238_10558.method3993(i_5_, i_3_, Class20.aClass31_204, 938562628);
					break;
				}
			}
		}
	}
}
