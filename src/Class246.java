
/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class246 {
	static String[] aStringArray3028;
	public static int anInt3029;

	Class246() throws Throwable {
		throw new Error();
	}

	public static void method4199(boolean bool) {
		Class282_Sub20_Sub24.method15391(-1991624950);
		if (Class169.method2875(client.anInt7166 * -1741204137, -2047065853)) {
			Class184[] class184s = client.aClass184Array7220;
			for (int i = 0; i < class184s.length; i++) {
				Class184 class184 = class184s[i];
				class184.anInt2290 += 352048501;
				if (class184.anInt2290 * 804033245 < 50 && !bool)
					return;
				class184.anInt2290 = 0;
				if (!class184.aBool2298 && class184.method3053((byte) -113) != null) {
					Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.KEEP_ALIVE, class184.aClass432_2283, -98412133);
					class184.method3049(class282_sub23, 1836352081);
					try {
						class184.method3047(414932495);
					} catch (IOException ioexception) {
						class184.aBool2298 = true;
					}
				}
			}
			Class282_Sub20_Sub24.method15391(-980063507);
		}
	}

	static final void method4200(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.anInt7012 -= 1418910010;
		byte[] is = null;
		byte[] is_0_ = null;
		int i_1_;
		for (i_1_ = 0; (i_1_ < 10 && (class527.intStack[1942118537 * class527.anInt7012 + i_1_]) >= 0); i_1_ += 2) {
			/* empty */
		}
		if (i_1_ > 0) {
			is = new byte[i_1_ / 2];
			is_0_ = new byte[i_1_ / 2];
			for (i_1_ -= 2; i_1_ >= 0; i_1_ -= 2) {
				is[i_1_ / 2] = (byte) (class527.intStack[i_1_ + (1942118537 * class527.anInt7012)]);
				is_0_[i_1_ / 2] = (byte) (class527.intStack[(1 + (class527.anInt7012 * 1942118537 + i_1_))]);
			}
		}
		Class107.method1838(class118, is, is_0_, class527, 1844755981);
	}

	static final void method4201(CS2Executor class527, int i) {
		Class118 class118 = Class117.method1981((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), (byte) 117);
		if (-1 != -56249735 * class118.anInt1426)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class118.anInt1427 * 6040081;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method4202(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_2_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_3_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_2_, 173872175);
		if (i_3_ >= 1 && i_3_ <= 5 && class425.inventoryOptions[i_3_ - 1] != null)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class425.inventoryOptions[i_3_ - 1];
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	public static Class461 method4203(int i, byte i_4_) {
		Class461[] class461s = Class202.method3343(-757707497);
		for (int i_5_ = 0; i_5_ < class461s.length; i_5_++) {
			Class461 class461 = class461s[i_5_];
			if (-1977256787 * class461.anInt5541 == i)
				return class461;
		}
		return null;
	}

	static void method4204(Class118 class118, int i, int i_6_, int i_7_) {
		if (0 == class118.aByte1333)
			class118.anInt1299 = class118.anInt1295 * 1054420063;
		else if (1 == class118.aByte1333)
			class118.anInt1299 = -324515311 * (1901666159 * class118.anInt1295 + (i - class118.anInt1301 * 1506818197) / 2);
		else if (2 == class118.aByte1333)
			class118.anInt1299 = (i - 1506818197 * class118.anInt1301 - class118.anInt1295 * 1901666159) * -324515311;
		else if (class118.aByte1333 == 3)
			class118.anInt1299 = (1901666159 * class118.anInt1295 * i >> 14) * -324515311;
		else if (class118.aByte1333 == 4)
			class118.anInt1299 = -324515311 * ((i - 1506818197 * class118.anInt1301) / 2 + (class118.anInt1295 * 1901666159 * i >> 14));
		else
			class118.anInt1299 = -324515311 * (i - class118.anInt1301 * 1506818197 - (class118.anInt1295 * 1901666159 * i >> 14));
		if (class118.aByte1355 == 0)
			class118.anInt1428 = 822620217 * class118.anInt1296;
		else if (1 == class118.aByte1355)
			class118.anInt1428 = ((i_6_ - -492594917 * class118.anInt1429) / 2 + class118.anInt1296 * -1769612869) * 686052507;
		else if (class118.aByte1355 == 2)
			class118.anInt1428 = 686052507 * (i_6_ - class118.anInt1429 * -492594917 - class118.anInt1296 * -1769612869);
		else if (3 == class118.aByte1355)
			class118.anInt1428 = 686052507 * (-1769612869 * class118.anInt1296 * i_6_ >> 14);
		else if (4 == class118.aByte1355)
			class118.anInt1428 = 686052507 * ((i_6_ * (class118.anInt1296 * -1769612869) >> 14) + (i_6_ - -492594917 * class118.anInt1429) / 2);
		else
			class118.anInt1428 = (i_6_ - -492594917 * class118.anInt1429 - (-1769612869 * class118.anInt1296 * i_6_ >> 14)) * 686052507;
		if (client.aBool7168 && (client.method11633(class118).anInt7547 * 488242129 != 0 || -2131393857 * class118.anInt1268 == 0)) {
			if (class118.anInt1299 * 597157617 < 0)
				class118.anInt1299 = 0;
			else if ((597157617 * class118.anInt1299 + 1506818197 * class118.anInt1301) > i)
				class118.anInt1299 = -324515311 * (i - 1506818197 * class118.anInt1301);
			if (class118.anInt1428 * 198275475 < 0)
				class118.anInt1428 = 0;
			else if ((-492594917 * class118.anInt1429 + 198275475 * class118.anInt1428) > i_6_)
				class118.anInt1428 = (i_6_ - -492594917 * class118.anInt1429) * 686052507;
		}
	}

	static final void method4205(CS2Executor class527, int i) {
		int i_8_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_8_, (byte) 63);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_8_ >> 16];
		Class125.method2168(class118, class98, class527, -1301648510);
	}
}
