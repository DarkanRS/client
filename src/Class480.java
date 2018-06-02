/* Class480 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class480 {
	static int[] anIntArray5715;
	static char[] aCharArray5716 = new char[64];
	static char[] aCharArray5717;

	static {
		for (int i = 0; i < 26; i++)
			aCharArray5716[i] = (char) (65 + i);
		for (int i = 26; i < 52; i++)
			aCharArray5716[i] = (char) (i + 97 - 26);
		for (int i = 52; i < 62; i++)
			aCharArray5716[i] = (char) (i + 48 - 52);
		aCharArray5716[62] = '+';
		aCharArray5716[63] = '/';
		aCharArray5717 = new char[64];
		for (int i = 0; i < 26; i++)
			aCharArray5717[i] = (char) (i + 65);
		for (int i = 26; i < 52; i++)
			aCharArray5717[i] = (char) (97 + i - 26);
		for (int i = 52; i < 62; i++)
			aCharArray5717[i] = (char) (48 + i - 52);
		aCharArray5717[62] = '*';
		aCharArray5717[63] = '-';
		anIntArray5715 = new int[128];
		for (int i = 0; i < anIntArray5715.length; i++)
			anIntArray5715[i] = -1;
		for (int i = 65; i <= 90; i++)
			anIntArray5715[i] = i - 65;
		for (int i = 97; i <= 122; i++)
			anIntArray5715[i] = 26 + (i - 97);
		for (int i = 48; i <= 57; i++)
			anIntArray5715[i] = i - 48 + 52;
		int[] is = anIntArray5715;
		anIntArray5715[43] = 62;
		is[42] = 62;
		int[] is_0_ = anIntArray5715;
		anIntArray5715[47] = 63;
		is_0_[45] = 63;
	}

	static int method8039(char c) {
		if (c >= 0 && c < anIntArray5715.length)
			return anIntArray5715[c];
		return -1;
	}

	Class480() throws Throwable {
		throw new Error();
	}

	static int method8040(String string, byte[] is, int i) {
		int i_1_ = i;
		int i_2_ = string.length();
		for (int i_3_ = 0; i_3_ < i_2_; i_3_ += 4) {
			int i_4_ = Class514.method8840(string.charAt(i_3_), -863681881);
			int i_5_ = (i_3_ + 1 < i_2_ ? Class514.method8840(string.charAt(1 + i_3_), -573596194) : -1);
			int i_6_ = (i_3_ + 2 < i_2_ ? Class514.method8840(string.charAt(i_3_ + 2), -1798132259) : -1);
			int i_7_ = (3 + i_3_ < i_2_ ? Class514.method8840(string.charAt(i_3_ + 3), -1933039933) : -1);
			is[i++] = (byte) (i_4_ << 2 | i_5_ >>> 4);
			if (i_6_ == -1)
				break;
			is[i++] = (byte) ((i_5_ & 0xf) << 4 | i_6_ >>> 2);
			if (i_7_ == -1)
				break;
			is[i++] = (byte) ((i_6_ & 0x3) << 6 | i_7_);
		}
		return i - i_1_;
	}

	public static byte[] method8041(String string) {
		int i = string.length();
		if (0 == i)
			return new byte[0];
		int i_8_ = i + 3 & ~0x3;
		int i_9_ = i_8_ / 4 * 3;
		if (i_8_ - 2 >= i || Class514.method8840(string.charAt(i_8_ - 2), -632296399) == -1)
			i_9_ -= 2;
		else if (i_8_ - 1 >= i || Class514.method8840(string.charAt(i_8_ - 1), -611790389) == -1)
			i_9_--;
		byte[] is = new byte[i_9_];
		IncomingPacket.method6375(string, is, 0, 818062955);
		return is;
	}

	public static byte[] method8042(String string) {
		int i = string.length();
		if (0 == i)
			return new byte[0];
		int i_10_ = i + 3 & ~0x3;
		int i_11_ = i_10_ / 4 * 3;
		if (i_10_ - 2 >= i || Class514.method8840(string.charAt(i_10_ - 2), -1352873567) == -1)
			i_11_ -= 2;
		else if (i_10_ - 1 >= i || (Class514.method8840(string.charAt(i_10_ - 1), -1518890458) == -1))
			i_11_--;
		byte[] is = new byte[i_11_];
		IncomingPacket.method6375(string, is, 0, -1149787256);
		return is;
	}

	public static final void method8043(int i) {
		String string = (null != Class445.aString5384 ? Class445.aString5384 : WorldMapAreaDefs.method3741((byte) -1));
		Class282_Sub50_Sub6.method14788(string, false, Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(375740834) == 5, client.aBool7158, client.aBool7159, (byte) -111);
	}

	static void method8044(Class118[] class118s, Class118 class118, boolean bool, byte i) {
		int i_12_ = (class118.anInt1376 * -354780671 != 0 ? -354780671 * class118.anInt1376 : 1506818197 * class118.anInt1301);
		int i_13_ = (class118.anInt1314 * -37350919 != 0 ? -37350919 * class118.anInt1314 : class118.anInt1429 * -492594917);
		InteractableObject.method16099(class118s, -1952846363 * class118.anInt1287, i_12_, i_13_, bool, (byte) 29);
		if (class118.aClass118Array1439 != null)
			InteractableObject.method16099(class118.aClass118Array1439, (-1952846363 * class118.anInt1287), i_12_, i_13_, bool, (byte) 17);
		Class282_Sub44 class282_sub44 = ((Class282_Sub44) client.aClass465_7442.method7754((long) (-1952846363 * class118.anInt1287)));
		if (null != class282_sub44)
			Class442.method7403(587626901 * class282_sub44.anInt8063, i_12_, i_13_, bool, 1720687852);
		if (class118 == client.aClass118_7183) {
			int i_14_ = Class197.NUM_PLAYER_INDICES * -963499271;
			int[] is = Class197.PLAYER_INDICES;
			for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
				Player class521_sub1_sub1_sub2_sub1 = client.players[is[i_15_]];
				if (null != class521_sub1_sub1_sub2_sub1)
					class521_sub1_sub1_sub2_sub1.method15795(i_12_, i_13_, bool, (byte) 27);
			}
			for (int i_16_ = 0; i_16_ < -685729279 * client.anInt7211; i_16_++) {
				int i_17_ = client.anIntArray7212[i_16_];
				Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i_17_));
				if (null != class282_sub47)
					((Animable) class282_sub47.anObject8068).method15795(i_12_, i_13_, bool, (byte) -94);
			}
		}
	}

	static final void method8045(CS2Executor class527, byte i) {
		int i_18_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_18_, (byte) 119);
		int i_19_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		i_19_--;
		if (null == class118.aStringArray1352 || i_19_ >= class118.aStringArray1352.length || null == class118.aStringArray1352[i_19_])
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class118.aStringArray1352[i_19_];
	}

	public static Class106 method8046(int i, byte i_20_) {
		Class106[] class106s = Class530.method11352(-2059272885);
		for (int i_21_ = 0; i_21_ < class106s.length; i_21_++) {
			Class106 class106 = class106s[i_21_];
			if (-530599889 * class106.anInt1071 == i)
				return class106;
		}
		return null;
	}
}
