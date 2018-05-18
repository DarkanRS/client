/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class218 {
	Index aClass317_2703;
	public static final int anInt2704 = 64;
	Index aClass317_2705;
	public static final int anInt2706 = 128;
	Class229 aClass229_2707 = new Class229(128);
	Class229 aClass229_2708 = new Class229(64);
	static boolean[] aBoolArray2709;

	public void method3695(int i, int i_0_) {
		synchronized (((Class218) this).aClass229_2707) {
			((Class218) this).aClass229_2707.method3858(i, (byte) 71);
		}
		synchronized (((Class218) this).aClass229_2708) {
			((Class218) this).aClass229_2708.method3858(i, (byte) -60);
		}
	}

	public void method3696(byte i) {
		synchronized (((Class218) this).aClass229_2707) {
			((Class218) this).aClass229_2707.method3863(2127164020);
		}
		synchronized (((Class218) this).aClass229_2708) {
			((Class218) this).aClass229_2708.method3863(1611491782);
		}
	}

	public void method3697(int i, int i_1_, int i_2_) {
		((Class218) this).aClass229_2707 = new Class229(i);
		((Class218) this).aClass229_2708 = new Class229(i_1_);
	}

	public void method3698(int i) {
		synchronized (((Class218) this).aClass229_2707) {
			((Class218) this).aClass229_2707.method3858(i, (byte) 11);
		}
		synchronized (((Class218) this).aClass229_2708) {
			((Class218) this).aClass229_2708.method3858(i, (byte) -18);
		}
	}

	public void method3699(byte i) {
		synchronized (((Class218) this).aClass229_2707) {
			((Class218) this).aClass229_2707.method3859(-1557275586);
		}
		synchronized (((Class218) this).aClass229_2708) {
			((Class218) this).aClass229_2708.method3859(-1044931706);
		}
	}

	public Class220 method3700(int i, int i_3_) {
		Class220 class220;
		synchronized (((Class218) this).aClass229_2707) {
			class220 = ((Class220) ((Class218) this).aClass229_2707.method3865((long) i));
		}
		if (null != class220)
			return class220;
		byte[] is;
		synchronized (((Class218) this).aClass317_2705) {
			is = ((Class218) this).aClass317_2705.getFile(((Class120.aClass120_1483.anInt1521) * -71319279), i, -1668017415);
		}
		class220 = new Class220();
		class220.anInt2753 = 443844459 * i;
		((Class220) class220).aClass218_2716 = this;
		if (is != null)
			class220.method3716(new RsByteBuffer(is), -141546823);
		class220.method3718(-1915876048);
		synchronized (((Class218) this).aClass229_2707) {
			((Class218) this).aClass229_2707.method3856(class220, (long) i);
		}
		return class220;
	}

	public Class220 method3701(int i) {
		Class220 class220;
		synchronized (((Class218) this).aClass229_2707) {
			class220 = ((Class220) ((Class218) this).aClass229_2707.method3865((long) i));
		}
		if (null != class220)
			return class220;
		byte[] is;
		synchronized (((Class218) this).aClass317_2705) {
			is = ((Class218) this).aClass317_2705.getFile(((Class120.aClass120_1483.anInt1521) * -71319279), i, -1362506596);
		}
		class220 = new Class220();
		class220.anInt2753 = 443844459 * i;
		((Class220) class220).aClass218_2716 = this;
		if (is != null)
			class220.method3716(new RsByteBuffer(is), -141546823);
		class220.method3718(-275295059);
		synchronized (((Class218) this).aClass229_2707) {
			((Class218) this).aClass229_2707.method3856(class220, (long) i);
		}
		return class220;
	}

	public void method3702(int i, int i_4_) {
		((Class218) this).aClass229_2707 = new Class229(i);
		((Class218) this).aClass229_2708 = new Class229(i_4_);
	}

	public Class218(Game class486, Class495 class495, Index class317, Index class317_5_) {
		((Class218) this).aClass317_2705 = class317;
		((Class218) this).aClass317_2703 = class317_5_;
		((Class218) this).aClass317_2705.filesCount((-71319279 * (Class120.aClass120_1483.anInt1521)), -945990147);
	}

	public void method3703(int i, int i_6_) {
		((Class218) this).aClass229_2707 = new Class229(i);
		((Class218) this).aClass229_2708 = new Class229(i_6_);
	}

	public void method3704(int i, int i_7_) {
		((Class218) this).aClass229_2707 = new Class229(i);
		((Class218) this).aClass229_2708 = new Class229(i_7_);
	}

	public void method3705(int i) {
		synchronized (((Class218) this).aClass229_2707) {
			((Class218) this).aClass229_2707.method3858(i, (byte) -68);
		}
		synchronized (((Class218) this).aClass229_2708) {
			((Class218) this).aClass229_2708.method3858(i, (byte) 11);
		}
	}

	public void method3706(int i, int i_8_) {
		((Class218) this).aClass229_2707 = new Class229(i);
		((Class218) this).aClass229_2708 = new Class229(i_8_);
	}

	public void method3707() {
		synchronized (((Class218) this).aClass229_2707) {
			((Class218) this).aClass229_2707.method3863(1498884219);
		}
		synchronized (((Class218) this).aClass229_2708) {
			((Class218) this).aClass229_2708.method3863(1582058157);
		}
	}

	public void method3708() {
		synchronized (((Class218) this).aClass229_2707) {
			((Class218) this).aClass229_2707.method3863(1396736779);
		}
		synchronized (((Class218) this).aClass229_2708) {
			((Class218) this).aClass229_2708.method3863(1448169082);
		}
	}

	public static void method3709(int i, short i_9_) {
		synchronized (Class238.aClass229_2920) {
			Class238.aClass229_2920.method3858(i, (byte) 86);
		}
		synchronized (Class238.aClass229_2930) {
			Class238.aClass229_2930.method3858(i, (byte) 15);
		}
	}

	static void method3710(Class98 class98, Class118 class118, int i) {
		if (null != class118) {
			if (class118.anInt1288 * 1924549737 != -1) {
				Class118 class118_10_ = (class98.aClass118Array998[class118.anInt1305 * 2110532063 & 0xffff]);
				if (null != class118_10_) {
					if (class118_10_.aClass118Array1438 == class118_10_.aClass118Array1439) {
						class118_10_.aClass118Array1439 = (new Class118[class118_10_.aClass118Array1438.length]);
						class118_10_.aClass118Array1439[0] = class118;
						Class503.method8359(class118_10_.aClass118Array1438, 0, class118_10_.aClass118Array1439, 1, 1924549737 * class118.anInt1288);
						Class503.method8359(class118_10_.aClass118Array1438, 1 + 1924549737 * class118.anInt1288, class118_10_.aClass118Array1439, 1924549737 * class118.anInt1288 + 1, (class118_10_.aClass118Array1438.length - 1924549737 * class118.anInt1288 - 1));
					} else {
						int i_11_ = 0;
						Class118[] class118s;
						for (class118s = class118_10_.aClass118Array1439; (i_11_ < class118s.length && class118s[i_11_] != class118); i_11_++) {
							/* empty */
						}
						if (i_11_ < class118s.length) {
							Class503.method8359(class118s, 0, class118s, 1, i_11_);
							class118s[0] = class118;
						}
					}
				}
			} else {
				Class118[] class118s = class98.method1617(-1207733107);
				int i_12_;
				for (i_12_ = 0; i_12_ < class118s.length && class118 != class118s[i_12_]; i_12_++) {
					/* empty */
				}
				if (i_12_ < class118s.length) {
					Class503.method8359(class118s, 0, class118s, 1, i_12_);
					class118s[0] = class118;
				}
			}
		}
	}
}
