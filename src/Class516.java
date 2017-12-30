/* Class516 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class516 {
	public static final int anInt5894 = 25;
	public static int[] anIntArray5895 = { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };
	public static int[] anIntArray5896 = new int[120];

	Class516() throws Throwable {
		throw new Error();
	}

	static {
		int i = 0;
		for (int i_0_ = 0; i_0_ < 120; i_0_++) {
			int i_1_ = i_0_ + 1;
			int i_2_ = (int) ((double) i_1_ + 300.0 * Math.pow(2.0, (double) i_1_ / 7.0));
			i += i_2_;
			anIntArray5896[i_0_] = i / 4;
		}
	}

	static final void method8864(CS2Executor class527, byte i) {
		int i_3_ = (((CS2Executor) class527).unknown[((CS2Executor) class527).instrPtr * 301123709]);
		String string = (((CS2Executor) class527).aClass61_7010.method1202(client.aClass486_7450.anInt5746 * 1648080491 << 16 | i_3_, -735824266));
		String string_4_;
		if (null == string) {
			if (i == -1)
				throw new IllegalStateException();
			string_4_ = "";
		} else
			string_4_ = string;
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = string_4_;
	}

	static final void method8865(CS2Executor class527, byte i) {
		int i_5_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub9 class282_sub50_sub9 = Class368.aClass429_4265.method7214(i_5_, -1707891446);
		if (null == class282_sub50_sub9.anIntArray9624)
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub9.anIntArray9624.length;
	}

	public static void method8866(Class275 class275, Class275 class275_6_, int i) {
		if (class275.aClass275_3340 != null)
			class275.method4887((byte) -120);
		class275.aClass275_3340 = class275_6_;
		class275.aClass275_3339 = class275_6_.aClass275_3339;
		class275.aClass275_3340.aClass275_3339 = class275;
		class275.aClass275_3339.aClass275_3340 = class275;
	}

	static final void method8867(boolean bool, int i) {
		Class442.method7403(-1699899559 * client.anInt7349, Class349.anInt4083 * -418109423, client.anInt3243 * -969250379, bool, 2111552471);
	}

	static void method8868(String string, byte i) {
		client.aString7281 = string;
		if (Class40.method867(-1769935536) != Class279.aClass279_3368) {
			try {
				String string_7_ = Class282_Sub44.anApplet8065.getParameter(Class358.aClass358_4158.aString4159);
				String string_8_ = Class282_Sub44.anApplet8065.getParameter(Class358.aClass358_4144.aString4159);
				String string_9_ = new StringBuilder().append(string_7_).append("settings=").append(string).append("; version=1; path=/; domain=").append(string_8_).toString();
				if (string.length() == 0)
					string_9_ = new StringBuilder().append(string_9_).append("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0").toString();
				else
					string_9_ = new StringBuilder().append(string_9_).append("; Expires=").append(Class316.method5596(Class169.method2869(1577477583) + 94608000000L)).append("; Max-Age=").append(94608000L).toString();
				Class441.method7376(Class282_Sub44.anApplet8065, new StringBuilder().append("document.cookie=\"").append(string_9_).append("\"").toString(), (byte) 78);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	static final void method8869(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = 1775931893 * Class121.anInt1526;
	}

	static final void method8870(CS2Executor class527, byte i) {
		int i_10_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		if (client.aString7426 != null && i_10_ < Class459.anInt5534 * -1772444859)
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = Class467.aClass173Array5575[i_10_].aString2129;
		else
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}
}
