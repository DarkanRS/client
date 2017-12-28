/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class100 {
	int anInt1006;
	byte[] aByteArray1007;
	static Class253 aClass253_1008;

	Class100(byte[] is) {
		((Class100) this).aByteArray1007 = is;
		((Class100) this).anInt1006 = 0;
	}

	int method1632(byte i) {
		short i_0_ = 0;
		for (int i_1_ = 0; i_1_ < 2; i_1_++)
			i_0_ |= ((((Class100) this).aByteArray1007[((((Class100) this).anInt1006 += 928321679) * -2140533137 - 1)]) & 0xff) << i_1_ * 8;
		return i_0_;
	}

	String method1633(int i) {
		int i_2_ = method1632((byte) -122);
		if (-1 == i_2_)
			return null;
		if (i_2_ > 256)
			throw new RuntimeException_Sub4();
		String string = new String(((Class100) this).aByteArray1007, ((Class100) this).anInt1006 * -2140533137, i_2_);
		((Class100) this).anInt1006 += 928321679 * i_2_;
		return string;
	}

	int method1634() {
		short i = 0;
		for (int i_3_ = 0; i_3_ < 2; i_3_++)
			i |= ((((Class100) this).aByteArray1007[((((Class100) this).anInt1006 += 928321679) * -2140533137 - 1)]) & 0xff) << i_3_ * 8;
		return i;
	}

	int method1635() {
		short i = 0;
		for (int i_4_ = 0; i_4_ < 2; i_4_++)
			i |= ((((Class100) this).aByteArray1007[((((Class100) this).anInt1006 += 928321679) * -2140533137 - 1)]) & 0xff) << i_4_ * 8;
		return i;
	}

	int method1636() {
		short i = 0;
		for (int i_5_ = 0; i_5_ < 2; i_5_++)
			i |= ((((Class100) this).aByteArray1007[((((Class100) this).anInt1006 += 928321679) * -2140533137 - 1)]) & 0xff) << i_5_ * 8;
		return i;
	}

	String method1637() {
		int i = method1632((byte) -86);
		if (-1 == i)
			return null;
		if (i > 256)
			throw new RuntimeException_Sub4();
		String string = new String(((Class100) this).aByteArray1007, ((Class100) this).anInt1006 * -2140533137, i);
		((Class100) this).anInt1006 += 928321679 * i;
		return string;
	}

	String method1638() {
		int i = method1632((byte) -110);
		if (-1 == i)
			return null;
		if (i > 256)
			throw new RuntimeException_Sub4();
		String string = new String(((Class100) this).aByteArray1007, ((Class100) this).anInt1006 * -2140533137, i);
		((Class100) this).anInt1006 += 928321679 * i;
		return string;
	}

	String method1639() {
		int i = method1632((byte) -25);
		if (-1 == i)
			return null;
		if (i > 256)
			throw new RuntimeException_Sub4();
		String string = new String(((Class100) this).aByteArray1007, ((Class100) this).anInt1006 * -2140533137, i);
		((Class100) this).anInt1006 += 928321679 * i;
		return string;
	}

	static Class221 method1640(int i, byte i_6_) {
		Class221[] class221s = Class327.method5815(484597042);
		for (int i_7_ = 0; i_7_ < class221s.length; i_7_++) {
			Class221 class221 = class221s[i_7_];
			if (i == ((Class221) class221).anInt2758 * 692352953)
				return class221;
		}
		return null;
	}

	static final void method1641(Class527 class527, int i) {
		String string = (String) (((Class527) class527).anObjectArray7019[(((Class527) class527).anInt7000 -= 1476624725) * 1806726141]);
		int i_8_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class404.method6809(string, i_8_, 1250092294);
	}

	static final void method1642(Class118 class118, Class98 class98, Class527 class527, int i) {
		String string = (String) (((Class527) class527).anObjectArray7019[(((Class527) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1421907667) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1400 = Class351.method6193(string, class527, 1475160400);
		class118.aBool1384 = true;
	}

	static final void method1643(Class527 class527, short i) {
		((Class527) class527).anInt7012 -= 283782002;
		client.aShort7436 = (short) (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537]);
		if (client.aShort7436 <= 0)
			client.aShort7436 = (short) 256;
		client.aShort7437 = (short) (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012 + 1]);
		if (client.aShort7437 <= 0)
			client.aShort7437 = (short) 205;
	}

	public static void method1644(String[] strings, short[] is, short i) {
		Class88.method1495(strings, is, 0, strings.length - 1, -519753439);
	}
}
