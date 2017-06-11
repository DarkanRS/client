/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class155 {
	static Class155 aClass155_1595;
	public static Class155 aClass155_1596;
	public static Class155 aClass155_1597;
	public static Class155 aClass155_1598;
	public static Class155 aClass155_1599;
	public static Class155 aClass155_1600;
	public static Class155 aClass155_1601;
	static Class155 aClass155_1602;
	static Class155 aClass155_1603;
	public int anInt1604;
	Class77 aClass77_1605;
	static Class155 aClass155_1606;
	int anInt1607;
	static int anInt1608 = 16;
	static int anInt1609;
	public static Class155 aClass155_1610 = new Class155(0, 0, 3, Class77.aClass77_721);
	public int anInt1611;
	int anInt1612;
	static Class155 aClass155_1613;

	Class155(int i, int i_0_, int i_1_, Class77 class77) {
		anInt1604 = i;
		((Class155) this).anInt1607 = i_0_;
		((Class155) this).anInt1612 = i_1_;
		((Class155) this).aClass77_1605 = class77;
		anInt1611 = (((Class155) this).anInt1612 * (((Class155) this).aClass77_1605.anInt724 * 685647847));
		if (((Class155) this).anInt1607 >= 16)
			throw new RuntimeException();
	}

	static Class155 method1693(int i) {
		switch (i) {
		case 0:
			return aClass155_1610;
		case 4:
			return aClass155_1599;
		case 3:
			return aClass155_1601;
		case 6:
			return aClass155_1598;
		case 2:
			return aClass155_1597;
		case 5:
			return aClass155_1600;
		case 1:
			return aClass155_1596;
		default:
			return null;
		}
	}

	static {
		aClass155_1596 = new Class155(11, 1, 3, Class77.aClass77_721);
		aClass155_1597 = new Class155(3, 2, 4, Class77.aClass77_717);
		aClass155_1601 = new Class155(9, 3, 1, Class77.aClass77_721);
		aClass155_1599 = new Class155(10, 4, 2, Class77.aClass77_721);
		aClass155_1600 = new Class155(5, 5, 3, Class77.aClass77_721);
		aClass155_1598 = new Class155(8, 6, 4, Class77.aClass77_721);
		aClass155_1602 = new Class155(6, 7, 4, Class77.aClass77_721);
		aClass155_1613 = new Class155(1, 8, 4, Class77.aClass77_721);
		aClass155_1595 = new Class155(4, 9, 4, Class77.aClass77_721);
		aClass155_1603 = new Class155(7, 10, 3, Class77.aClass77_721);
		aClass155_1606 = new Class155(2, 11, 3, Class77.aClass77_721);
		anInt1609 = Class87.method970(16, 1046709218);
	}
}
