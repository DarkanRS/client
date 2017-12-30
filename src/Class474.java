/* Class474 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class474 {
	Class229 aClass229_5607 = new Class229(256);
	Class495 aClass495_5608;
	boolean aBool5609;
	Class317 aClass317_5610;
	Class317 aClass317_5611;
	public static final int anInt5612 = 256;
	Class486 aClass486_5613;
	Class229 aClass229_5614 = new Class229(500);
	Class229 aClass229_5615 = new Class229(30);
	Class157[] aClass157Array5616;
	int anInt5617;
	String[] aStringArray5618;
	Class229 aClass229_5619 = new Class229(50);
	Class452 aClass452_5620;
	static Class387 aClass387_5621;

	public void method7890(int i) {
		synchronized (((Class474) this).aClass229_5607) {
			((Class474) this).aClass229_5607.method3858(i, (byte) -21);
		}
		synchronized (((Class474) this).aClass229_5614) {
			((Class474) this).aClass229_5614.method3858(i, (byte) -1);
		}
		synchronized (((Class474) this).aClass229_5615) {
			((Class474) this).aClass229_5615.method3858(i, (byte) -23);
		}
		synchronized (((Class474) this).aClass229_5619) {
			((Class474) this).aClass229_5619.method3858(i, (byte) 78);
		}
	}

	public Class478 method7891(int i, int i_0_) {
		Class478 class478;
		synchronized (((Class474) this).aClass229_5607) {
			class478 = ((Class478) ((Class474) this).aClass229_5607.method3865((long) i));
		}
		if (null != class478)
			return class478;
		byte[] is;
		synchronized (((Class474) this).aClass317_5610) {
			is = (((Class474) this).aClass317_5610.getFile(Class120.aClass120_1488.method2079(i, -1163305846), Class120.aClass120_1488.method2080(i, -2086943964), -1721086771));
		}
		class478 = new Class478();
		class478.anInt5633 = -199598417 * i;
		((Class478) class478).aClass474_5651 = this;
		class478.aStringArray5647 = (String[]) ((Class474) this).aStringArray5618.clone();
		if (is != null)
			class478.method7964(new RsByteBuffer(is), (byte) 43);
		class478.method7966(787748525);
		if (class478.aBool5686) {
			class478.anInt5677 = 0;
			class478.aBool5664 = false;
		}
		if (!((Class474) this).aBool5609 && class478.aBool5660) {
			class478.aStringArray5647 = null;
			class478.anIntArray5707 = null;
		}
		synchronized (((Class474) this).aClass229_5607) {
			((Class474) this).aClass229_5607.method3856(class478, (long) i);
		}
		return class478;
	}

	public void method7892(boolean bool) {
		if (bool != ((Class474) this).aBool5609) {
			((Class474) this).aBool5609 = bool;
			method7895((byte) 123);
		}
	}

	public void method7893(int i, int i_1_) {
		((Class474) this).anInt5617 = i * 587822967;
		synchronized (((Class474) this).aClass229_5614) {
			((Class474) this).aClass229_5614.method3859(-2096062108);
		}
		synchronized (((Class474) this).aClass229_5615) {
			((Class474) this).aClass229_5615.method3859(-27932787);
		}
		synchronized (((Class474) this).aClass229_5619) {
			((Class474) this).aClass229_5619.method3859(1932349321);
		}
	}

	public void method7894() {
		synchronized (((Class474) this).aClass229_5607) {
			((Class474) this).aClass229_5607.method3859(-1803400951);
		}
		synchronized (((Class474) this).aClass229_5614) {
			((Class474) this).aClass229_5614.method3859(907662069);
		}
		synchronized (((Class474) this).aClass229_5615) {
			((Class474) this).aClass229_5615.method3859(333088219);
		}
		synchronized (((Class474) this).aClass229_5619) {
			((Class474) this).aClass229_5619.method3859(47774622);
		}
		((Class474) this).aClass157Array5616 = new Class157[4];
		((Class474) this).aClass452_5620 = new Class452(null, null);
	}

	public void method7895(byte i) {
		synchronized (((Class474) this).aClass229_5607) {
			((Class474) this).aClass229_5607.method3859(1354085029);
		}
		synchronized (((Class474) this).aClass229_5614) {
			((Class474) this).aClass229_5614.method3859(-1238602820);
		}
		synchronized (((Class474) this).aClass229_5615) {
			((Class474) this).aClass229_5615.method3859(895757660);
		}
		synchronized (((Class474) this).aClass229_5619) {
			((Class474) this).aClass229_5619.method3859(722371520);
		}
		((Class474) this).aClass157Array5616 = new Class157[4];
		((Class474) this).aClass452_5620 = new Class452(null, null);
	}

	public void method7896(int i, byte i_2_) {
		synchronized (((Class474) this).aClass229_5607) {
			((Class474) this).aClass229_5607.method3858(i, (byte) -81);
		}
		synchronized (((Class474) this).aClass229_5614) {
			((Class474) this).aClass229_5614.method3858(i, (byte) -26);
		}
		synchronized (((Class474) this).aClass229_5615) {
			((Class474) this).aClass229_5615.method3858(i, (byte) 77);
		}
		synchronized (((Class474) this).aClass229_5619) {
			((Class474) this).aClass229_5619.method3858(i, (byte) 63);
		}
	}

	public void method7897(int i) {
		synchronized (((Class474) this).aClass229_5607) {
			((Class474) this).aClass229_5607.method3863(1368757759);
		}
		synchronized (((Class474) this).aClass229_5614) {
			((Class474) this).aClass229_5614.method3863(1886053158);
		}
		synchronized (((Class474) this).aClass229_5615) {
			((Class474) this).aClass229_5615.method3863(1444983758);
		}
		synchronized (((Class474) this).aClass229_5619) {
			((Class474) this).aClass229_5619.method3863(1778004488);
		}
	}

	public Class478 method7898(int i) {
		Class478 class478;
		synchronized (((Class474) this).aClass229_5607) {
			class478 = ((Class478) ((Class474) this).aClass229_5607.method3865((long) i));
		}
		if (null != class478)
			return class478;
		byte[] is;
		synchronized (((Class474) this).aClass317_5610) {
			is = (((Class474) this).aClass317_5610.getFile(Class120.aClass120_1488.method2079(i, 394538842), Class120.aClass120_1488.method2080(i, -2080510646), -1806868307));
		}
		class478 = new Class478();
		class478.anInt5633 = -199598417 * i;
		((Class478) class478).aClass474_5651 = this;
		class478.aStringArray5647 = (String[]) ((Class474) this).aStringArray5618.clone();
		if (is != null)
			class478.method7964(new RsByteBuffer(is), (byte) 58);
		class478.method7966(1053129684);
		if (class478.aBool5686) {
			class478.anInt5677 = 0;
			class478.aBool5664 = false;
		}
		if (!((Class474) this).aBool5609 && class478.aBool5660) {
			class478.aStringArray5647 = null;
			class478.anIntArray5707 = null;
		}
		synchronized (((Class474) this).aClass229_5607) {
			((Class474) this).aClass229_5607.method3856(class478, (long) i);
		}
		return class478;
	}

	public Class474(Class486 class486, Class495 class495, boolean bool, Class317 class317, Class317 class317_3_) {
		((Class474) this).aClass157Array5616 = new Class157[4];
		((Class474) this).aClass452_5620 = new Class452(null, null);
		((Class474) this).aClass486_5613 = class486;
		((Class474) this).aClass495_5608 = class495;
		((Class474) this).aBool5609 = bool;
		((Class474) this).aClass317_5610 = class317;
		((Class474) this).aClass317_5611 = class317_3_;
		if (null != ((Class474) this).aClass317_5610) {
			int i = ((Class474) this).aClass317_5610.method5618(-1925709864) - 1;
			Class120.aClass120_1488.method2078(-1090472574);
			((Class474) this).aClass317_5610.method5624(i, -1510124116);
		}
		if (((Class474) this).aClass486_5613 == Class486.aClass486_5744)
			((Class474) this).aStringArray5618 = (new String[] { null, null, null, null, null, Class433.aClass433_5282.method7273((((Class474) this).aClass495_5608), -952366759) });
		else
			((Class474) this).aStringArray5618 = new String[] { null, null, null, null, null, null };
	}

	public void method7899(int i, int i_4_) {
		((Class474) this).aClass229_5607 = new Class229(i);
	}

	public Class478 method7900(int i) {
		Class478 class478;
		synchronized (((Class474) this).aClass229_5607) {
			class478 = ((Class478) ((Class474) this).aClass229_5607.method3865((long) i));
		}
		if (null != class478)
			return class478;
		byte[] is;
		synchronized (((Class474) this).aClass317_5610) {
			is = (((Class474) this).aClass317_5610.getFile(Class120.aClass120_1488.method2079(i, 1917016711), Class120.aClass120_1488.method2080(i, -2101953341), -2018257047));
		}
		class478 = new Class478();
		class478.anInt5633 = -199598417 * i;
		((Class478) class478).aClass474_5651 = this;
		class478.aStringArray5647 = (String[]) ((Class474) this).aStringArray5618.clone();
		if (is != null)
			class478.method7964(new RsByteBuffer(is), (byte) 24);
		class478.method7966(1666947903);
		if (class478.aBool5686) {
			class478.anInt5677 = 0;
			class478.aBool5664 = false;
		}
		if (!((Class474) this).aBool5609 && class478.aBool5660) {
			class478.aStringArray5647 = null;
			class478.anIntArray5707 = null;
		}
		synchronized (((Class474) this).aClass229_5607) {
			((Class474) this).aClass229_5607.method3856(class478, (long) i);
		}
		return class478;
	}

	public Class478 method7901(int i) {
		Class478 class478;
		synchronized (((Class474) this).aClass229_5607) {
			class478 = ((Class478) ((Class474) this).aClass229_5607.method3865((long) i));
		}
		if (null != class478)
			return class478;
		byte[] is;
		synchronized (((Class474) this).aClass317_5610) {
			is = (((Class474) this).aClass317_5610.getFile(Class120.aClass120_1488.method2079(i, 1801672212), Class120.aClass120_1488.method2080(i, -1894166586), -1996097305));
		}
		class478 = new Class478();
		class478.anInt5633 = -199598417 * i;
		((Class478) class478).aClass474_5651 = this;
		class478.aStringArray5647 = (String[]) ((Class474) this).aStringArray5618.clone();
		if (is != null)
			class478.method7964(new RsByteBuffer(is), (byte) 29);
		class478.method7966(1645174137);
		if (class478.aBool5686) {
			class478.anInt5677 = 0;
			class478.aBool5664 = false;
		}
		if (!((Class474) this).aBool5609 && class478.aBool5660) {
			class478.aStringArray5647 = null;
			class478.anIntArray5707 = null;
		}
		synchronized (((Class474) this).aClass229_5607) {
			((Class474) this).aClass229_5607.method3856(class478, (long) i);
		}
		return class478;
	}

	public void method7902(boolean bool) {
		if (bool != ((Class474) this).aBool5609) {
			((Class474) this).aBool5609 = bool;
			method7895((byte) 58);
		}
	}

	public void method7903(boolean bool) {
		if (bool != ((Class474) this).aBool5609) {
			((Class474) this).aBool5609 = bool;
			method7895((byte) 63);
		}
	}

	public void method7904(int i) {
		((Class474) this).anInt5617 = i * 587822967;
		synchronized (((Class474) this).aClass229_5614) {
			((Class474) this).aClass229_5614.method3859(1282603193);
		}
		synchronized (((Class474) this).aClass229_5615) {
			((Class474) this).aClass229_5615.method3859(-1314648908);
		}
		synchronized (((Class474) this).aClass229_5619) {
			((Class474) this).aClass229_5619.method3859(-786211608);
		}
	}

	public void method7905(int i) {
		((Class474) this).anInt5617 = i * 587822967;
		synchronized (((Class474) this).aClass229_5614) {
			((Class474) this).aClass229_5614.method3859(1566792677);
		}
		synchronized (((Class474) this).aClass229_5615) {
			((Class474) this).aClass229_5615.method3859(1566660236);
		}
		synchronized (((Class474) this).aClass229_5619) {
			((Class474) this).aClass229_5619.method3859(-1330422626);
		}
	}

	public void method7906(int i) {
		((Class474) this).aClass229_5607 = new Class229(i);
	}

	public Class478 method7907(int i) {
		Class478 class478;
		synchronized (((Class474) this).aClass229_5607) {
			class478 = ((Class478) ((Class474) this).aClass229_5607.method3865((long) i));
		}
		if (null != class478)
			return class478;
		byte[] is;
		synchronized (((Class474) this).aClass317_5610) {
			is = (((Class474) this).aClass317_5610.getFile(Class120.aClass120_1488.method2079(i, 1584456493), Class120.aClass120_1488.method2080(i, -1954703096), -1972004805));
		}
		class478 = new Class478();
		class478.anInt5633 = -199598417 * i;
		((Class478) class478).aClass474_5651 = this;
		class478.aStringArray5647 = (String[]) ((Class474) this).aStringArray5618.clone();
		if (is != null)
			class478.method7964(new RsByteBuffer(is), (byte) 98);
		class478.method7966(1519508054);
		if (class478.aBool5686) {
			class478.anInt5677 = 0;
			class478.aBool5664 = false;
		}
		if (!((Class474) this).aBool5609 && class478.aBool5660) {
			class478.aStringArray5647 = null;
			class478.anIntArray5707 = null;
		}
		synchronized (((Class474) this).aClass229_5607) {
			((Class474) this).aClass229_5607.method3856(class478, (long) i);
		}
		return class478;
	}

	public void method7908(int i) {
		((Class474) this).aClass229_5607 = new Class229(i);
	}

	public void method7909(int i) {
		synchronized (((Class474) this).aClass229_5607) {
			((Class474) this).aClass229_5607.method3858(i, (byte) 70);
		}
		synchronized (((Class474) this).aClass229_5614) {
			((Class474) this).aClass229_5614.method3858(i, (byte) -11);
		}
		synchronized (((Class474) this).aClass229_5615) {
			((Class474) this).aClass229_5615.method3858(i, (byte) -42);
		}
		synchronized (((Class474) this).aClass229_5619) {
			((Class474) this).aClass229_5619.method3858(i, (byte) -56);
		}
	}

	public void method7910() {
		synchronized (((Class474) this).aClass229_5607) {
			((Class474) this).aClass229_5607.method3859(1537341667);
		}
		synchronized (((Class474) this).aClass229_5614) {
			((Class474) this).aClass229_5614.method3859(158685369);
		}
		synchronized (((Class474) this).aClass229_5615) {
			((Class474) this).aClass229_5615.method3859(-271234634);
		}
		synchronized (((Class474) this).aClass229_5619) {
			((Class474) this).aClass229_5619.method3859(525958053);
		}
		((Class474) this).aClass157Array5616 = new Class157[4];
		((Class474) this).aClass452_5620 = new Class452(null, null);
	}

	public void method7911(int i) {
		((Class474) this).aClass229_5607 = new Class229(i);
	}

	public void method7912(boolean bool, int i) {
		if (bool != ((Class474) this).aBool5609) {
			((Class474) this).aBool5609 = bool;
			method7895((byte) 107);
		}
	}

	public void method7913(int i) {
		synchronized (((Class474) this).aClass229_5607) {
			((Class474) this).aClass229_5607.method3858(i, (byte) 29);
		}
		synchronized (((Class474) this).aClass229_5614) {
			((Class474) this).aClass229_5614.method3858(i, (byte) 53);
		}
		synchronized (((Class474) this).aClass229_5615) {
			((Class474) this).aClass229_5615.method3858(i, (byte) -25);
		}
		synchronized (((Class474) this).aClass229_5619) {
			((Class474) this).aClass229_5619.method3858(i, (byte) 76);
		}
	}

	public static int method7914(long l) {
		return (int) (l / 86400000L) - 11745;
	}

	static final void method7915(CS2Executor class527, byte i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class417.anInt4994 * -385885769;
	}

	public static Class217_Sub1 method7916(int i, int i_5_) {
		if (!Class244.aBool3007 || i < Class485.anInt5740 * -377428565 || i > -860748679 * Class244.anInt3003)
			return null;
		return (Class244.aClass217_Sub1Array3006[i - Class485.anInt5740 * -377428565]);
	}

	static void method7917(int i, int i_6_, byte i_7_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Class263.method4778(14, (long) i);
		class282_sub50_sub12.method14995(1795507411);
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9668 = i_6_ * -1773141545;
	}
}
