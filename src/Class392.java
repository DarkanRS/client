/* Class392 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class392 implements Interface20 {
	Class317 aClass317_4779;
	Class229 aClass229_4780 = new Class229(64);
	public static int anInt4781;

	public Class392(Class486 class486, Class495 class495, Class317 class317) {
		((Class392) this).aClass317_4779 = class317;
		((Class392) this).aClass317_4779.method5624((Class120.aClass120_1492.anInt1521) * -71319279, -2082829167);
	}

	public Class282_Sub50_Sub18 method6735(int i, short i_0_) {
		Class282_Sub50_Sub18 class282_sub50_sub18;
		synchronized (((Class392) this).aClass229_4780) {
			class282_sub50_sub18 = ((Class282_Sub50_Sub18) ((Class392) this).aClass229_4780.method3865((long) i));
		}
		if (class282_sub50_sub18 != null)
			return class282_sub50_sub18;
		byte[] is;
		synchronized (((Class392) this).aClass317_4779) {
			is = (((Class392) this).aClass317_4779.method5607(-71319279 * Class120.aClass120_1492.anInt1521, i, -1196710306));
		}
		class282_sub50_sub18 = new Class282_Sub50_Sub18();
		if (null != is)
			class282_sub50_sub18.method15690(new RsByteBuffer(is), 1939942716);
		synchronized (((Class392) this).aClass229_4780) {
			((Class392) this).aClass229_4780.method3856(class282_sub50_sub18, (long) i);
		}
		return class282_sub50_sub18;
	}

	public Class282_Sub50_Sub18 method6736(int i) {
		Class282_Sub50_Sub18 class282_sub50_sub18;
		synchronized (((Class392) this).aClass229_4780) {
			class282_sub50_sub18 = ((Class282_Sub50_Sub18) ((Class392) this).aClass229_4780.method3865((long) i));
		}
		if (class282_sub50_sub18 != null)
			return class282_sub50_sub18;
		byte[] is;
		synchronized (((Class392) this).aClass317_4779) {
			is = (((Class392) this).aClass317_4779.method5607(-71319279 * Class120.aClass120_1492.anInt1521, i, -2029707345));
		}
		class282_sub50_sub18 = new Class282_Sub50_Sub18();
		if (null != is)
			class282_sub50_sub18.method15690(new RsByteBuffer(is), 1818285749);
		synchronized (((Class392) this).aClass229_4780) {
			((Class392) this).aClass229_4780.method3856(class282_sub50_sub18, (long) i);
		}
		return class282_sub50_sub18;
	}

	public Class282_Sub50_Sub18 method6737(int i) {
		Class282_Sub50_Sub18 class282_sub50_sub18;
		synchronized (((Class392) this).aClass229_4780) {
			class282_sub50_sub18 = ((Class282_Sub50_Sub18) ((Class392) this).aClass229_4780.method3865((long) i));
		}
		if (class282_sub50_sub18 != null)
			return class282_sub50_sub18;
		byte[] is;
		synchronized (((Class392) this).aClass317_4779) {
			is = (((Class392) this).aClass317_4779.method5607(-71319279 * Class120.aClass120_1492.anInt1521, i, -1696807675));
		}
		class282_sub50_sub18 = new Class282_Sub50_Sub18();
		if (null != is)
			class282_sub50_sub18.method15690(new RsByteBuffer(is), 1327061290);
		synchronized (((Class392) this).aClass229_4780) {
			((Class392) this).aClass229_4780.method3856(class282_sub50_sub18, (long) i);
		}
		return class282_sub50_sub18;
	}

	static final void method6738(Class527 class527, int i) {
		int i_1_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_1_, (byte) 91);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_1_ >> 16];
		Class278_Sub1.method13450(class118, class98, class527, -51249694);
	}

	static void method6739(Class505 class505, Class282_Sub36 class282_sub36, Class220 class220, int i, int i_2_, int i_3_, int i_4_, Class194 class194, byte i_5_) {
		int i_6_ = i_2_ - i_4_ / 2 - 5;
		int i_7_ = 2 + i_3_;
		if (0 != class220.anInt2726 * 1903100449)
			class505.method8425(i_6_, i_7_, i_4_ + 10, i_3_ + i * class194.method3173() - i_7_ + 1, class220.anInt2726 * 1903100449, (byte) -128);
		if (0 != class220.anInt2727 * 1542243419)
			class505.method8562(i_6_, i_7_, 10 + i_4_, i_3_ + i * class194.method3173() - i_7_ + 1, 1542243419 * class220.anInt2727, (byte) 4);
		int i_8_ = -2116785903 * class220.anInt2720;
		if (class282_sub36.aBool7989 && -1 != -1748609101 * class220.anInt2721)
			i_8_ = -1748609101 * class220.anInt2721;
		for (int i_9_ = 0; i_9_ < i; i_9_++) {
			String string = Class291_Sub1.aStringArray8024[i_9_];
			if (i_9_ < i - 1)
				string = string.substring(0, string.length() - 4);
			class194.method3178(class505, string, i_2_, i_3_, i_8_, true);
			i_3_ += class194.method3173();
		}
	}

	public static void method6740(Class117 class117, int i) {
		Class113.aClass117_1234 = class117;
	}

	static final void method6741(Class527 class527, int i) {
		int i_10_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = ((Class527) class527).aClass61_7010.anIntArray634[i_10_];
	}
}
