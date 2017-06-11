/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class182 {
	static Class348 aClass348_1815 = new Class348(64);
	public static int anInt1816 = 1;
	public static int anInt1817 = 2;
	public boolean aBoolean1818;
	public int anInt1819 = 0;
	public short aShort1820;
	static Class243 aClass243_1821;
	public short aShort1822;
	public int[] anIntArray1823;
	public int anInt1824;
	int anInt1825;
	public int anInt1826;
	int anInt1827;
	public int anInt1828 = -460402411;
	public int[] anIntArray1829;
	int anInt1830 = 551876020;
	public int anInt1831;
	public int anInt1832 = -1186467237;
	int anInt1833 = -82525436;
	int anInt1834;
	int anInt1835;
	public boolean aBoolean1836;
	public int anInt1837;
	int anInt1838;
	int anInt1839;
	public int anInt1840;
	public int anInt1841;
	public int anInt1842;
	public int anInt1843;
	public int anInt1844;
	public int anInt1845;
	public int[] anIntArray1846;
	public int anInt1847;
	public int[] anIntArray1848;
	public static int anInt1849 = -1;
	public int anInt1850;
	public int anInt1851;
	public int anInt1852;
	public short aShort1853;
	public boolean aBoolean1854;
	public int anInt1855;
	public int anInt1856;
	public int anInt1857;
	public int anInt1858;
	public int anInt1859;
	public boolean aBoolean1860 = true;
	static int anInt1861 = 0;
	public boolean aBoolean1862;
	public boolean aBoolean1863;
	public boolean aBoolean1864;
	public int anInt1865;
	int anInt1866;
	public int anInt1867;
	public int anInt1868;
	public int anInt1869;
	public int anInt1870;
	public int anInt1871;
	int anInt1872;
	public int anInt1873;
	public boolean aBoolean1874;
	public short aShort1875;
	public int anInt1876;
	public boolean aBoolean1877;
	public int anInt1878;
	public int anInt1879;
	public int anInt1880;
	public int anInt1881;
	public int anInt1882;
	public int anInt1883;
	public int anInt1884;
	public int anInt1885;
	public int anInt1886;

	void method1843(RsByteBuffer class298_sub53, byte i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (0 == i_0_) {
					if (i <= 0) {
						/* empty */
					}
					break;
				}
				method1844(class298_sub53, i_0_, (short) 3276);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hp.b(").append(')').toString());
		}
	}

	Class182() {
		((Class182) this).anInt1838 = -1351633244;
		((Class182) this).anInt1839 = 59539036;
		anInt1840 = -313955239;
		anInt1850 = 894014710;
		anInt1851 = -1054767914;
		anInt1852 = 0;
		aBoolean1836 = true;
		aBoolean1854 = true;
		anInt1855 = -1971154607;
		anInt1859 = -2053470659;
		anInt1857 = 0;
		aBoolean1877 = true;
		anInt1873 = -891363123;
		aBoolean1818 = false;
		aBoolean1874 = true;
		aBoolean1862 = false;
		aBoolean1863 = true;
		aBoolean1864 = false;
	}

	void method1844(RsByteBuffer class298_sub53, int i, short i_1_) {
		try {
			if (1 == i) {
				aShort1820 = (short) class298_sub53.readUnsignedShort();
				aShort1853 = (short) class298_sub53.readUnsignedShort();
				aShort1822 = (short) class298_sub53.readUnsignedShort();
				aShort1875 = (short) class298_sub53.readUnsignedShort();
				int i_2_ = 3;
				aShort1820 <<= i_2_;
				aShort1853 <<= i_2_;
				aShort1822 <<= i_2_;
				aShort1875 <<= i_2_;
			} else if (2 == i)
				class298_sub53.readUnsignedByte();
			else if (3 == i) {
				anInt1824 = class298_sub53.readInt((byte) 43) * -387057077;
				anInt1858 = class298_sub53.readInt((byte) -103) * -1853520269;
			} else if (i == 4) {
				anInt1819 = class298_sub53.readUnsignedByte() * -687561841;
				anInt1847 = class298_sub53.readByte(-12558881) * -1070610169;
			} else if (5 == i)
				anInt1869 = (anInt1831 = (class298_sub53.readUnsignedShort() << 12 << 2) * -1969619697) * -2077217427;
			else if (6 == i) {
				((Class182) this).anInt1834 = class298_sub53.readInt((byte) 100) * -1365954181;
				((Class182) this).anInt1835 = class298_sub53.readInt((byte) -15) * 902519911;
			} else if (7 == i) {
				anInt1841 = class298_sub53.readUnsignedShort() * 704499925;
				anInt1842 = class298_sub53.readUnsignedShort() * -1653481859;
			} else if (i == 8) {
				anInt1843 = class298_sub53.readUnsignedShort() * -517504949;
				anInt1844 = class298_sub53.readUnsignedShort() * -1502909185;
			} else if (9 == i) {
				int i_3_ = class298_sub53.readUnsignedByte();
				anIntArray1823 = new int[i_3_];
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
					anIntArray1823[i_4_] = class298_sub53.readUnsignedShort();
			} else if (10 == i) {
				int i_5_ = class298_sub53.readUnsignedByte();
				anIntArray1829 = new int[i_5_];
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
					anIntArray1829[i_6_] = class298_sub53.readUnsignedShort();
			} else if (12 == i)
				anInt1850 = class298_sub53.readByte(-12558881) * 1700476293;
			else if (i == 13)
				anInt1851 = class298_sub53.readByte(-12558881) * -1620099691;
			else if (14 == i)
				anInt1852 = class298_sub53.readUnsignedShort() * -629947759;
			else if (15 == i)
				anInt1840 = class298_sub53.readUnsignedShort() * 313955239;
			else if (i == 16) {
				aBoolean1836 = class298_sub53.readUnsignedByte() == 1;
				anInt1855 = class298_sub53.readUnsignedShort() * 1971154607;
				anInt1859 = class298_sub53.readUnsignedShort() * 2053470659;
				aBoolean1854 = class298_sub53.readUnsignedByte() == 1;
			} else if (i == 17)
				anInt1873 = class298_sub53.readUnsignedShort() * 891363123;
			else if (18 == i)
				anInt1837 = class298_sub53.readInt((byte) 24) * 661695111;
			else if (i == 19)
				anInt1857 = class298_sub53.readUnsignedByte() * 709275159;
			else if (i == 20)
				((Class182) this).anInt1838 = class298_sub53.readUnsignedByte() * 587779089;
			else if (21 == i)
				((Class182) this).anInt1839 = class298_sub53.readUnsignedByte() * 1460884271;
			else if (i == 22)
				anInt1828 = class298_sub53.readInt((byte) -1) * 460402411;
			else if (23 == i)
				((Class182) this).anInt1830 = class298_sub53.readUnsignedByte() * -853474699;
			else if (24 == i)
				aBoolean1860 = false;
			else if (25 == i) {
				int i_7_ = class298_sub53.readUnsignedByte();
				anIntArray1846 = new int[i_7_];
				for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
					anIntArray1846[i_8_] = class298_sub53.readUnsignedShort();
			} else if (i == 26)
				aBoolean1877 = false;
			else if (i == 27)
				anInt1832 = ((class298_sub53.readUnsignedShort() << 12 << 2) * 1186467237);
			else if (i == 28)
				((Class182) this).anInt1833 = class298_sub53.readUnsignedByte() * -1461114135;
			else if (29 == i)
				class298_sub53.readShort(1655872053);
			else if (30 == i)
				aBoolean1818 = true;
			else if (i == 31) {
				anInt1869 = ((class298_sub53.readUnsignedShort() << 12 << 2) * 1138516579);
				anInt1831 = (class298_sub53.readUnsignedShort() << 12 << 2) * -1969619697;
			} else if (32 == i)
				aBoolean1874 = false;
			else if (33 == i)
				aBoolean1862 = true;
			else if (34 == i)
				aBoolean1863 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hp.p(").append(')').toString());
		}
	}

	void method1845(int i) {
		try {
			if (anInt1850 * -275612851 > -2 || -1831524931 * anInt1851 > -2)
				aBoolean1864 = true;
			anInt1865 = 1630521741 * (737478067 * ((Class182) this).anInt1834 >> 16 & 0xff);
			((Class182) this).anInt1866 = ((1522532183 * ((Class182) this).anInt1835 >> 16 & 0xff) * -231735957);
			anInt1867 = (((Class182) this).anInt1866 * 147388659 - anInt1865 * -902341611);
			anInt1868 = 313528669 * (((Class182) this).anInt1834 * 737478067 >> 8 & 0xff);
			((Class182) this).anInt1825 = -339699839 * (((Class182) this).anInt1835 * 1522532183 >> 8 & 0xff);
			anInt1870 = (((Class182) this).anInt1825 * -1096760557 - 1588068271 * anInt1868);
			anInt1871 = ((((Class182) this).anInt1834 * 737478067 & 0xff) * -573588505);
			((Class182) this).anInt1827 = ((1522532183 * ((Class182) this).anInt1835 & 0xff) * -1720855383);
			anInt1856 = (-844298861 * ((Class182) this).anInt1827 - 1351662653 * anInt1871);
			anInt1826 = ((737478067 * ((Class182) this).anInt1834 >> 24 & 0xff) * -1453810947);
			((Class182) this).anInt1872 = 1322388433 * (1522532183 * ((Class182) this).anInt1835 >> 24 & 0xff);
			anInt1876 = (((Class182) this).anInt1872 * 1784226905 - 1139279133 * anInt1826);
			if (0 != 1558182711 * anInt1837) {
				anInt1886 = -1525995331 * (1395500273 * ((Class182) this).anInt1838 * (1940196053 * anInt1842) / 100);
				anInt1845 = -323160919 * (anInt1842 * 1940196053 * (-1087319089 * ((Class182) this).anInt1839) / 100);
				if (0 == -1703669099 * anInt1886)
					anInt1886 = -1525995331;
				anInt1879 = 220598105 * ((((anInt1837 * 1558182711 >> 16 & 0xff) - (anInt1867 * -447935375 / 2 + anInt1865 * 1443995973)) << 8) / (-1703669099 * anInt1886));
				anInt1880 = 1551625825 * ((((1558182711 * anInt1837 >> 8 & 0xff) - (-1237529867 * anInt1868 + -1154628453 * anInt1870 / 2)) << 8) / (anInt1886 * -1703669099));
				anInt1881 = (((1558182711 * anInt1837 & 0xff) - (anInt1871 * -1297143849 + anInt1856 * -564637277 / 2)) << 8) / (anInt1886 * -1703669099) * 1145782203;
				if (0 == anInt1845 * -966201447)
					anInt1845 = -323160919;
				anInt1882 = 756703809 * ((((1558182711 * anInt1837 >> 24 & 0xff) - (629527125 * anInt1826 + anInt1876 * 1235129497 / 2)) << 8) / (-966201447 * anInt1845));
				Class182 class182_9_ = this;
				class182_9_.anInt1879 = (class182_9_.anInt1879 + 220598105 * (-1778169623 * anInt1879 > 0 ? -4 : 4));
				Class182 class182_10_ = this;
				class182_10_.anInt1880 = (class182_10_.anInt1880 + (anInt1880 * 936719777 > 0 ? -4 : 4) * 1551625825);
				Class182 class182_11_ = this;
				class182_11_.anInt1881 = (class182_11_.anInt1881 + 1145782203 * (anInt1881 * 1137945971 > 0 ? -4 : 4));
				Class182 class182_12_ = this;
				class182_12_.anInt1882 = (class182_12_.anInt1882 + 756703809 * (anInt1882 * 825667009 > 0 ? -4 : 4));
			}
			if (anInt1828 * 799607235 != -1) {
				anInt1883 = -1215468705 * (((Class182) this).anInt1830 * 635387357 * (anInt1842 * 1940196053) / 100);
				if (anInt1883 * -1035489121 == 0)
					anInt1883 = -1215468705;
				anInt1884 = (799607235 * anInt1828 - (anInt1824 * 373784419 + ((anInt1858 * -439251269 - 373784419 * anInt1824) / 2))) / (anInt1883 * -1035489121) * -1441694519;
			}
			if (-1628433875 * anInt1832 != -1) {
				anInt1885 = (1204309337 * ((Class182) this).anInt1833 * (1940196053 * anInt1842) / 100 * -1190650305);
				if (-1648307777 * anInt1885 == 0)
					anInt1885 = -1190650305;
				anInt1878 = ((-1628433875 * anInt1832 - ((-769306129 * anInt1831 - -992661685 * anInt1869) / 2 + -992661685 * anInt1869)) / (-1648307777 * anInt1885) * -1770208597);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hp.i(").append(')').toString());
		}
	}

	static final void method1846(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		try {
			if (client.anInt8724 * 1596783995 == 3) {
				int i_20_ = Class10.anInt129 * 1168366243;
				int[] is = Class10.anIntArray135;
				for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
					Player class365_sub1_sub1_sub2_sub2 = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[is[i_21_]]);
					if (class365_sub1_sub1_sub2_sub2 != null)
						class365_sub1_sub1_sub2_sub2.method4441(i, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_, (byte) 12);
				}
				for (int i_22_ = 0; i_22_ < -1230451913 * client.anInt8703; i_22_++) {
					int i_23_ = client.anIntArray8699[i_22_];
					Class298_Sub29 class298_sub29 = ((Class298_Sub29) client.npcs.get((long) i_23_));
					if (class298_sub29 != null)
						((Entity) class298_sub29.anObject7366).method4441(i, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_, (byte) 12);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hp.js(").append(')').toString());
		}
	}

	static void method1847(byte i) {
		try {
			Class298_Sub37_Sub12.aClass437_9621.clear((byte) -40);
			Class298_Sub37_Sub12.aClass461_9607.method5988(1028697182);
			Class298_Sub37_Sub12.aClass461_9638.method5988(1342386694);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hp.f(").append(')').toString());
		}
	}
}
