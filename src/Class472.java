
/* Class472 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class472 {
	public static Class472 aClass472_5596;
	static Class472 aClass472_5597;
	public static Class472 aClass472_5598;
	public static Class472 aClass472_5599;
	public static Class472 aClass472_5600 = new Class472("LIVE", 0);
	public String aString5601;
	public int anInt5602;

	public static Class472 method7849(int i) {
		Class472[] class472s = Class275_Sub6.method12598(-1844238843);
		for (int i_0_ = 0; i_0_ < class472s.length; i_0_++) {
			Class472 class472 = class472s[i_0_];
			if (-2001827121 * class472.anInt5602 == i)
				return class472;
		}
		return null;
	}

	static Class472[] method7850() {
		return new Class472[] { aClass472_5596, aClass472_5599, aClass472_5597, aClass472_5600, aClass472_5598 };
	}

	Class472(String string, int i) {
		aString5601 = string;
		anInt5602 = i * 886324271;
	}

	static Class472[] method7851() {
		return new Class472[] { aClass472_5596, aClass472_5599, aClass472_5597, aClass472_5600, aClass472_5598 };
	}

	static {
		aClass472_5596 = new Class472("BUILDLIVE", 3);
		aClass472_5598 = new Class472("RC", 1);
		aClass472_5599 = new Class472("WIP", 2);
		aClass472_5597 = new Class472("INTBETA", 4);
	}

	public static Frame method7852(Class470 class470, int i, int i_1_, int i_2_, int i_3_, byte i_4_) {
		if (i_2_ == 0) {
			Class467[] class467s = Class386.method6671(class470, -356410067);
			if (class467s == null)
				return null;
			boolean bool = false;
			for (int i_5_ = 0; i_5_ < class467s.length; i_5_++) {
				if (class467s[i_5_].anInt5571 * -1928226539 == i && i_1_ == class467s[i_5_].anInt5574 * -1980032233 && (i_3_ == 0 || i_3_ == (((Class467) class467s[i_5_]).anInt5572 * 1746595513)) && (!bool || -1254475713 * class467s[i_5_].anInt5573 > i_2_)) {
					i_2_ = class467s[i_5_].anInt5573 * -1254475713;
					bool = true;
				}
			}
			if (!bool)
				return null;
		}
		Frame frame = new Frame("Jagex Full Screen");
		frame.setResizable(false);
		class470.method7808(frame, i, i_1_, i_2_, i_3_, 1656708290);
		return frame;
	}

	static byte method7853(int i, int i_6_, int i_7_) {
		if (Class458.aClass458_5474.anInt5481 * 1109376893 != i)
			return (byte) 0;
		if ((i_6_ & 0x1) == 0)
			return (byte) 1;
		return (byte) 2;
	}
}
