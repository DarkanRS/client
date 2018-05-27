/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class101 {
	int anInt1009;
	Class115[] aClass115Array1010;
	Class107 aClass107_1011;
	static Interface11 anInterface11_1012 = new Class82();
	Class107 aClass107_1013;
	String aString1014;
	protected int anInt1015 = 1224879653;
	int anInt1016;

	public final Class115 method1645(int i) {
		return ((Class101) this).aClass115Array1010[i];
	}

	public abstract void method1646();

	public abstract void method1647();

	public abstract boolean method1648();

	public final void method1649(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1936(class282_sub21_sub1, class384);
	}

	public final int method1650(int i) {
		return ((Class101) this).aClass115Array1010.length;
	}

	public Class115 method1651(String string, int i) throws Exception_Sub2_Sub1 {
		Class115[] class115s = ((Class101) this).aClass115Array1010;
		for (int i_0_ = 0; i_0_ < class115s.length; i_0_++) {
			Class115 class115 = class115s[i_0_];
			String string_1_ = class115.method1892((byte) -1);
			if (string_1_ != null && string_1_.equals(string)) {
				if (!class115.method1899())
					throw new Exception_Sub2_Sub1(string);
				return class115;
			}
		}
		throw new Exception_Sub2_Sub1(string);
	}

	Class101(Class505_Sub2 class505_sub2, Class114 class114) {
		((Class101) this).aString1014 = ((Class114) class114).aString1237;
		((Class101) this).anInt1009 = ((Class114) class114).aClass122Array1236.length * -1828828925;
		((Class101) this).aClass107_1013 = new Class107(((Class101) this).anInt1009 * 957442475, anInterface11_1012);
		for (int i = 0; i < 957442475 * ((Class101) this).anInt1009; i++)
			((Class101) this).aClass107_1013.method1822(i, (((Class122) ((Class114) class114).aClass122Array1236[i]).aString1530), method1765(((Class114) class114).aClass122Array1236[i]), 2010834409);
		((Class101) this).anInt1016 = ((Class114) class114).aClass122Array1240.length * -851665849;
		((Class101) this).aClass107_1011 = new Class107(((Class101) this).anInt1016 * -962704009, anInterface11_1012);
		for (int i = 0; i < -962704009 * ((Class101) this).anInt1016; i++)
			((Class101) this).aClass107_1011.method1822(i, (((Class122) ((Class114) class114).aClass122Array1240[i]).aString1530), method1765(((Class114) class114).aClass122Array1240[i]), 2010834409);
		((Class101) this).aClass115Array1010 = new Class115[((Class114) class114).aClass99Array1241.length];
		for (int i = 0; i < ((Class114) class114).aClass99Array1241.length; i++)
			((Class101) this).aClass115Array1010[i] = method1743(class505_sub2, ((Class114) class114).aClass99Array1241[i]);
	}

	public final Class115 method1652(int i, byte i_2_) {
		return ((Class101) this).aClass115Array1010[i];
	}

	public int method1653(Class115 class115, byte i) {
		for (int i_3_ = 0; i_3_ < ((Class101) this).aClass115Array1010.length; i_3_++) {
			if (((Class101) this).aClass115Array1010[i_3_] == class115)
				return i_3_;
		}
		return -1;
	}

	public Class115 method1654(int i) {
		Class115[] class115s = ((Class101) this).aClass115Array1010;
		for (int i_4_ = 0; i_4_ < class115s.length; i_4_++) {
			Class115 class115 = class115s[i_4_];
			if (class115.method1899())
				return class115;
		}
		return null;
	}

	public abstract boolean method1655(Class115 class115);

	public final Class115 method1656(int i) {
		return (-401096109 * anInt1015 >= 0 ? ((Class101) this).aClass115Array1010[anInt1015 * -401096109] : null);
	}

	public final void method1657(int i, Class384 class384) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1905(i, class384);
	}

	public final void method1658(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_5_, int i) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1923(class282_sub21_sub1, f, f_5_);
	}

	public final void method1659(Class282_Sub21_Sub1 class282_sub21_sub1, float f, short i) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1894(class282_sub21_sub1, f);
	}

	public final void method1660(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_6_, float f_7_) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1939(class282_sub21_sub1, f, f_6_, f_7_);
	}

	public final void method1661(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_8_, float f_9_, byte i) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1939(class282_sub21_sub1, f, f_8_, f_9_);
	}

	public final void method1662(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_10_, float f_11_, float f_12_, byte i) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1897(class282_sub21_sub1, f, f_10_, f_11_, f_12_);
	}

	public final void method1663(Class282_Sub21_Sub1 class282_sub21_sub1, Class385 class385, int i) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1939(class282_sub21_sub1, class385.aFloat4671, class385.aFloat4672, class385.aFloat4673);
	}

	public abstract boolean method1664();

	abstract Class115 method1665(Class505_Sub2 class505_sub2, Class99 class99);

	public final void method1666(int i, Class384 class384) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1906(i, class384);
	}

	public final void method1667(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384, int i) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1936(class282_sub21_sub1, class384);
	}

	public final void method1668(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384, byte i) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1891(class282_sub21_sub1, class384);
	}

	public final void method1669(Class282_Sub21_Sub1 class282_sub21_sub1, float f) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1894(class282_sub21_sub1, f);
	}

	public final void method1670(int i, float f, float f_13_, float f_14_, int i_15_) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1893(i, f, f_13_, f_14_);
	}

	public final void method1671(Class282_Sub21_Sub1 class282_sub21_sub1, int i, Interface30 interface30, byte i_16_) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1896(class282_sub21_sub1, i, interface30);
	}

	public final void method1672(int i, Class385 class385, byte i_17_) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1893(i, class385.aFloat4671, class385.aFloat4672, class385.aFloat4673);
	}

	public final void method1673(int i, float[] fs, int i_18_, int i_19_) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1904(i, fs, i_18_);
	}

	public final void method1674(int i, Class384 class384, int i_20_) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1905(i, class384);
	}

	public final void method1675(int i, Class384 class384, byte i_21_) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1906(i, class384);
	}

	public final void method1676(int i, Class384 class384, int i_22_) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1900(i, class384);
	}

	public final void method1677(int i, int i_23_, Interface30 interface30, int i_24_) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1908(i, i_23_, interface30);
	}

	public abstract void method1678();

	public int method1679(int i) {
		return ((Class101) this).anInt1016 * -962704009;
	}

	public final void method1680(int i, Class385 class385) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1893(i, class385.aFloat4671, class385.aFloat4672, class385.aFloat4673);
	}

	public Class282_Sub21_Sub1 method1681(String string, byte i) {
		return ((Class282_Sub21_Sub1) ((Class101) this).aClass107_1011.method1820(string, -2115714822));
	}

	public int method1682(int i) {
		return 957442475 * ((Class101) this).anInt1009;
	}

	abstract Class115 method1683(Class505_Sub2 class505_sub2, Class99 class99);

	void method1684() {
		/* empty */
	}

	public abstract void method1685();

	public abstract void method1686();

	public abstract void method1687();

	public final void method1688(Class282_Sub21_Sub1 class282_sub21_sub1, float[] fs, int i) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1903(class282_sub21_sub1, fs, fs.length);
	}

	public final void method1689(Class282_Sub21_Sub1 class282_sub21_sub1, Class303 class303, int i) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1897(class282_sub21_sub1, class303.aFloat3568, class303.aFloat3566, class303.aFloat3565, class303.aFloat3567);
	}

	public abstract void method1690();

	public Class282_Sub21_Sub1 method1691(String string, short i) throws Exception_Sub2_Sub2 {
		Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class282_Sub21_Sub1) ((Class101) this).aClass107_1013.method1820(string, -2068288662));
		if (class282_sub21_sub1 == null)
			throw new Exception_Sub2_Sub2(string);
		return class282_sub21_sub1;
	}

	public abstract boolean method1692();

	public abstract boolean method1693();

	abstract Class282_Sub21_Sub1 method1694(Class122 class122);

	public final void method1695(Class282_Sub21_Sub1 class282_sub21_sub1, int i, Interface30 interface30) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1896(class282_sub21_sub1, i, interface30);
	}

	public final void method1696(Class282_Sub21_Sub1 class282_sub21_sub1, int i, int i_25_) {
		float f = (float) (i >> 16 & 0xff) / 255.0F;
		float f_26_ = (float) (i >> 8 & 0xff) / 255.0F;
		float f_27_ = (float) (i & 0xff) / 255.0F;
		float f_28_ = (float) (i >> 24 & 0xff) / 255.0F;
		method1662(class282_sub21_sub1, f, f_26_, f_27_, f_28_, (byte) -41);
	}

	abstract Class115 method1697(Class505_Sub2 class505_sub2, Class99 class99);

	public Class115 method1698(String string) throws Exception_Sub2_Sub1 {
		Class115[] class115s = ((Class101) this).aClass115Array1010;
		for (int i = 0; i < class115s.length; i++) {
			Class115 class115 = class115s[i];
			String string_29_ = class115.method1892((byte) -64);
			if (string_29_ != null && string_29_.equals(string)) {
				if (!class115.method1899())
					throw new Exception_Sub2_Sub1(string);
				return class115;
			}
		}
		throw new Exception_Sub2_Sub1(string);
	}

	public final int method1699() {
		return ((Class101) this).aClass115Array1010.length;
	}

	public Class115 method1700(String string) throws Exception_Sub2_Sub1 {
		Class115[] class115s = ((Class101) this).aClass115Array1010;
		for (int i = 0; i < class115s.length; i++) {
			Class115 class115 = class115s[i];
			String string_30_ = class115.method1892((byte) -126);
			if (string_30_ != null && string_30_.equals(string)) {
				if (!class115.method1899())
					throw new Exception_Sub2_Sub1(string);
				return class115;
			}
		}
		throw new Exception_Sub2_Sub1(string);
	}

	public final void method1701(int i, int i_31_, Interface30 interface30) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1908(i, i_31_, interface30);
	}

	public final void method1702(int i, float f, float f_32_, float f_33_, float f_34_) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1895(i, f, f_32_, f_33_, f_34_);
	}

	public int method1703(Class115 class115) {
		for (int i = 0; i < ((Class101) this).aClass115Array1010.length; i++) {
			if (((Class101) this).aClass115Array1010[i] == class115)
				return i;
		}
		return -1;
	}

	public int method1704(Class115 class115) {
		for (int i = 0; i < ((Class101) this).aClass115Array1010.length; i++) {
			if (((Class101) this).aClass115Array1010[i] == class115)
				return i;
		}
		return -1;
	}

	public Class282_Sub21_Sub1 method1705(int i, int i_35_) {
		return ((Class282_Sub21_Sub1) ((Class101) this).aClass107_1011.method1823(i, 1658223630));
	}

	public abstract boolean method1706(Class115 class115);

	public abstract boolean method1707(Class115 class115);

	public final Class115 method1708() {
		return (-401096109 * anInt1015 >= 0 ? ((Class101) this).aClass115Array1010[anInt1015 * -401096109] : null);
	}

	public final Class115 method1709() {
		return (-401096109 * anInt1015 >= 0 ? ((Class101) this).aClass115Array1010[anInt1015 * -401096109] : null);
	}

	public final int method1710() {
		return anInt1015 * -401096109;
	}

	public int method1711() {
		return 957442475 * ((Class101) this).anInt1009;
	}

	abstract Class282_Sub21_Sub1 method1712(Class122 class122);

	public abstract void method1713();

	public final int method1714(int i) {
		return anInt1015 * -401096109;
	}

	public final void method1715(Class282_Sub21_Sub1 class282_sub21_sub1, float f) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1894(class282_sub21_sub1, f);
	}

	public final void method1716(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_36_, float f_37_) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1939(class282_sub21_sub1, f, f_36_, f_37_);
	}

	public String method1717(int i) {
		return ((Class101) this).aString1014;
	}

	public final void method1718(Class282_Sub21_Sub1 class282_sub21_sub1, float f, float f_38_, float f_39_, float f_40_) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1897(class282_sub21_sub1, f, f_38_, f_39_, f_40_);
	}

	public final void method1719(Class282_Sub21_Sub1 class282_sub21_sub1, Class385 class385) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1939(class282_sub21_sub1, class385.aFloat4671, class385.aFloat4672, class385.aFloat4673);
	}

	public final void method1720(Class282_Sub21_Sub1 class282_sub21_sub1, Class385 class385) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1939(class282_sub21_sub1, class385.aFloat4671, class385.aFloat4672, class385.aFloat4673);
	}

	public final void method1721(Class282_Sub21_Sub1 class282_sub21_sub1, Class303 class303) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1897(class282_sub21_sub1, class303.aFloat3568, class303.aFloat3566, class303.aFloat3565, class303.aFloat3567);
	}

	public final void method1722(Class282_Sub21_Sub1 class282_sub21_sub1, Class303 class303) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1897(class282_sub21_sub1, class303.aFloat3568, class303.aFloat3566, class303.aFloat3565, class303.aFloat3567);
	}

	public final void method1723(Class282_Sub21_Sub1 class282_sub21_sub1, Class303 class303) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1897(class282_sub21_sub1, class303.aFloat3568, class303.aFloat3566, class303.aFloat3565, class303.aFloat3567);
	}

	public final void method1724(Class282_Sub21_Sub1 class282_sub21_sub1, float[] fs) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1903(class282_sub21_sub1, fs, fs.length);
	}

	public final void method1725(Class282_Sub21_Sub1 class282_sub21_sub1, float[] fs) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1903(class282_sub21_sub1, fs, fs.length);
	}

	public final void method1726(Class282_Sub21_Sub1 class282_sub21_sub1, float[] fs) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1903(class282_sub21_sub1, fs, fs.length);
	}

	public final void method1727(Class282_Sub21_Sub1 class282_sub21_sub1, int i) {
		float f = (float) (i >> 16 & 0xff) / 255.0F;
		float f_41_ = (float) (i >> 8 & 0xff) / 255.0F;
		float f_42_ = (float) (i & 0xff) / 255.0F;
		float f_43_ = (float) (i >> 24 & 0xff) / 255.0F;
		method1662(class282_sub21_sub1, f, f_41_, f_42_, f_43_, (byte) -124);
	}

	public final void method1728(Class282_Sub21_Sub1 class282_sub21_sub1, int i) {
		float f = (float) (i >> 16 & 0xff) / 255.0F;
		float f_44_ = (float) (i >> 8 & 0xff) / 255.0F;
		float f_45_ = (float) (i & 0xff) / 255.0F;
		float f_46_ = (float) (i >> 24 & 0xff) / 255.0F;
		method1662(class282_sub21_sub1, f, f_44_, f_45_, f_46_, (byte) -100);
	}

	public final void method1729(Class282_Sub21_Sub1 class282_sub21_sub1, int i) {
		float f = (float) (i >> 16 & 0xff) / 255.0F;
		float f_47_ = (float) (i >> 8 & 0xff) / 255.0F;
		float f_48_ = (float) (i & 0xff) / 255.0F;
		float f_49_ = (float) (i >> 24 & 0xff) / 255.0F;
		method1662(class282_sub21_sub1, f, f_47_, f_48_, f_49_, (byte) -46);
	}

	public final void method1730(Class282_Sub21_Sub1 class282_sub21_sub1, int i) {
		float f = (float) (i >> 16 & 0xff) / 255.0F;
		float f_50_ = (float) (i >> 8 & 0xff) / 255.0F;
		float f_51_ = (float) (i & 0xff) / 255.0F;
		float f_52_ = (float) (i >> 24 & 0xff) / 255.0F;
		method1662(class282_sub21_sub1, f, f_50_, f_51_, f_52_, (byte) -63);
	}

	public int method1731() {
		return 957442475 * ((Class101) this).anInt1009;
	}

	public final void method1732(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1936(class282_sub21_sub1, class384);
	}

	public final void method1733(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1936(class282_sub21_sub1, class384);
	}

	public abstract boolean method1734();

	public final void method1735(int i, float f, float f_53_, float f_54_) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1893(i, f, f_53_, f_54_);
	}

	public final void method1736(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1891(class282_sub21_sub1, class384);
	}

	public final void method1737(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1891(class282_sub21_sub1, class384);
	}

	public final void method1738(int i, float f, float f_55_, float f_56_) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1893(i, f, f_55_, f_56_);
	}

	public final void method1739(int i, float f, float f_57_, float f_58_) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1893(i, f, f_57_, f_58_);
	}

	public final void method1740(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1891(class282_sub21_sub1, class384);
	}

	public int method1741() {
		return 957442475 * ((Class101) this).anInt1009;
	}

	public Class282_Sub21_Sub1 method1742(int i, int i_59_) {
		return ((Class282_Sub21_Sub1) ((Class101) this).aClass107_1013.method1823(i, 1690895511));
	}

	abstract Class115 method1743(Class505_Sub2 class505_sub2, Class99 class99);

	public Class282_Sub21_Sub1 method1744(int i) {
		return ((Class282_Sub21_Sub1) ((Class101) this).aClass107_1011.method1823(i, 1719849700));
	}

	public final void method1745(int i, Class385 class385) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1893(i, class385.aFloat4671, class385.aFloat4672, class385.aFloat4673);
	}

	public final void method1746(int i, float[] fs, int i_60_) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1904(i, fs, i_60_);
	}

	public final void method1747(int i, float[] fs, int i_61_) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1904(i, fs, i_61_);
	}

	public final void method1748(int i, float f, float f_62_, float f_63_, float f_64_) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1895(i, f, f_62_, f_63_, f_64_);
	}

	public final void method1749(int i, float f, float f_65_, float f_66_, float f_67_, byte i_68_) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1895(i, f, f_65_, f_66_, f_67_);
	}

	public Class282_Sub21_Sub1 method1750(int i) {
		return ((Class282_Sub21_Sub1) ((Class101) this).aClass107_1013.method1823(i, 2095708146));
	}

	public Class115 method1751() {
		Class115[] class115s = ((Class101) this).aClass115Array1010;
		for (int i = 0; i < class115s.length; i++) {
			Class115 class115 = class115s[i];
			if (class115.method1899())
				return class115;
		}
		return null;
	}

	public final void method1752(int i, Class384 class384) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1900(i, class384);
	}

	public final void method1753(Class282_Sub21_Sub1 class282_sub21_sub1, Class384 class384) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1936(class282_sub21_sub1, class384);
	}

	public final void method1754(int i, int i_69_, Interface30 interface30) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1908(i, i_69_, interface30);
	}

	public Class282_Sub21_Sub1 method1755(String string) throws Exception_Sub2_Sub2 {
		Class282_Sub21_Sub1 class282_sub21_sub1 = ((Class282_Sub21_Sub1) ((Class101) this).aClass107_1013.method1820(string, -2146015791));
		if (class282_sub21_sub1 == null)
			throw new Exception_Sub2_Sub2(string);
		return class282_sub21_sub1;
	}

	public int method1756() {
		return ((Class101) this).anInt1016 * -962704009;
	}

	public int method1757() {
		return ((Class101) this).anInt1016 * -962704009;
	}

	public int method1758() {
		return ((Class101) this).anInt1016 * -962704009;
	}

	public final void method1759(Class282_Sub21_Sub1 class282_sub21_sub1, float f) {
		((Class101) this).aClass115Array1010[anInt1015 * -401096109].method1894(class282_sub21_sub1, f);
	}

	public Class282_Sub21_Sub1 method1760(int i) {
		return ((Class282_Sub21_Sub1) ((Class101) this).aClass107_1011.method1823(i, 2014668971));
	}

	public Class282_Sub21_Sub1 method1761(int i) {
		return ((Class282_Sub21_Sub1) ((Class101) this).aClass107_1011.method1823(i, 1625889537));
	}

	public Class282_Sub21_Sub1 method1762(int i) {
		return ((Class282_Sub21_Sub1) ((Class101) this).aClass107_1011.method1823(i, 1692768901));
	}

	public int method1763() {
		return ((Class101) this).anInt1016 * -962704009;
	}

	public Class282_Sub21_Sub1 method1764(int i) {
		return ((Class282_Sub21_Sub1) ((Class101) this).aClass107_1011.method1823(i, 2067847400));
	}

	abstract Class282_Sub21_Sub1 method1765(Class122 class122);

	public Class115 method1766(String string) throws Exception_Sub2_Sub1 {
		Class115[] class115s = ((Class101) this).aClass115Array1010;
		for (int i = 0; i < class115s.length; i++) {
			Class115 class115 = class115s[i];
			String string_70_ = class115.method1892((byte) -33);
			if (string_70_ != null && string_70_.equals(string)) {
				if (!class115.method1899())
					throw new Exception_Sub2_Sub1(string);
				return class115;
			}
		}
		throw new Exception_Sub2_Sub1(string);
	}

	public Class282_Sub21_Sub1 method1767(String string) {
		return ((Class282_Sub21_Sub1) ((Class101) this).aClass107_1011.method1820(string, -2031264937));
	}

	public int method1768() {
		return 957442475 * ((Class101) this).anInt1009;
	}

	public final void method1769(int i, Class384 class384) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1905(i, class384);
	}

	public Class282_Sub21_Sub1 method1770(int i) {
		return ((Class282_Sub21_Sub1) ((Class101) this).aClass107_1013.method1823(i, 1767352446));
	}

	public final void method1771(int i, Class384 class384) {
		((Class101) this).aClass115Array1010[-401096109 * anInt1015].method1906(i, class384);
	}

	void method1772() {
		/* empty */
	}

	static void method1773(String[] strings, int[] is, int i, int i_71_, int i_72_) {
		if (i < i_71_) {
			int i_73_ = (i + i_71_) / 2;
			int i_74_ = i;
			String string = strings[i_73_];
			strings[i_73_] = strings[i_71_];
			strings[i_71_] = string;
			int i_75_ = is[i_73_];
			is[i_73_] = is[i_71_];
			is[i_71_] = i_75_;
			for (int i_76_ = i; i_76_ < i_71_; i_76_++) {
				if (string == null || (null != strings[i_76_] && strings[i_76_].compareTo(string) < (i_76_ & 0x1))) {
					String string_77_ = strings[i_76_];
					strings[i_76_] = strings[i_74_];
					strings[i_74_] = string_77_;
					int i_78_ = is[i_76_];
					is[i_76_] = is[i_74_];
					is[i_74_++] = i_78_;
				}
			}
			strings[i_71_] = strings[i_74_];
			strings[i_74_] = string;
			is[i_71_] = is[i_74_];
			is[i_74_] = i_75_;
			method1773(strings, is, i, i_74_ - 1, 698486595);
			method1773(strings, is, i_74_ + 1, i_71_, 698486595);
		}
	}

	public static void method1774(byte i) {
		if (1923286921 * Class9.loginStage == 105)
			Class9.loginStage = -1229304549;
	}

	static final void method1775(CS2Executor class527, byte i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (string.startsWith(Class76.method1358(0, (byte) 0)) || string.startsWith(Class76.method1358(1, (byte) 0)))
			string = string.substring(7);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class230.method3910(string, -555098945);
	}

	public static int method1776(int i, boolean bool, int i_79_) {
		if (bool)
			return 0;
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, 1085109812);
		if (class282_sub30 == null)
			return ((IndexLoaders.INVENTORY_INDEX_LOADER.getInventoryDef(i, (short) 6976).anInt10277) * 875957203);
		int i_80_ = 0;
		for (int i_81_ = 0; i_81_ < ((Class282_Sub30) class282_sub30).anIntArray7710.length; i_81_++) {
			if (-1 == ((Class282_Sub30) class282_sub30).anIntArray7710[i_81_])
				i_80_++;
		}
		i_80_ += ((IndexLoaders.INVENTORY_INDEX_LOADER.getInventoryDef(i, (short) 24410).anInt10277) * 875957203 - ((Class282_Sub30) class282_sub30).anIntArray7710.length);
		return i_80_;
	}

	static final void method1777(CS2Executor class527, int i) {
		int i_82_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_82_, (byte) 29);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_82_ >> 16];
		Class282_Sub17_Sub4.method15409(class118, class98, class527, -1219012115);
	}
}
