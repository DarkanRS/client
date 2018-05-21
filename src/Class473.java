/* Class473 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class473 {
	Node aClass282_5603;
	public Node aClass282_5604 = new Node();
	public static Class526 aClass526_5605;
	static int anInt5606;

	public Node method7854() {
		Node class282 = aClass282_5604.prev;
		if (aClass282_5604 == class282) {
			((Class473) this).aClass282_5603 = null;
			return null;
		}
		((Class473) this).aClass282_5603 = class282.prev;
		return class282;
	}

	public void method7855(byte i) {
		for (;;) {
			Node class282 = aClass282_5604.next;
			if (class282 == aClass282_5604)
				break;
			class282.unlink(-371378792);
		}
		((Class473) this).aClass282_5603 = null;
	}

	public void method7856() {
		for (;;) {
			Node class282 = aClass282_5604.next;
			if (class282 == aClass282_5604)
				break;
			class282.unlink(-371378792);
		}
		((Class473) this).aClass282_5603 = null;
	}

	public Node method7857(byte i) {
		Node class282 = ((Class473) this).aClass282_5603;
		if (class282 == aClass282_5604) {
			((Class473) this).aClass282_5603 = null;
			return null;
		}
		((Class473) this).aClass282_5603 = class282.next;
		return class282;
	}

	public Node method7858(byte i) {
		Node class282 = aClass282_5604.next;
		if (class282 == aClass282_5604)
			return null;
		class282.unlink(-371378792);
		return class282;
	}

	public Node method7859(int i) {
		Node class282 = aClass282_5604.next;
		if (aClass282_5604 == class282) {
			((Class473) this).aClass282_5603 = null;
			return null;
		}
		((Class473) this).aClass282_5603 = class282.next;
		return class282;
	}

	public Node method7860() {
		Node class282 = ((Class473) this).aClass282_5603;
		if (class282 == aClass282_5604) {
			((Class473) this).aClass282_5603 = null;
			return null;
		}
		((Class473) this).aClass282_5603 = class282.next;
		return class282;
	}

	public Class473() {
		aClass282_5604.next = aClass282_5604;
		aClass282_5604.prev = aClass282_5604;
	}

	public boolean method7861(int i) {
		return aClass282_5604 == aClass282_5604.next;
	}

	public void method7862(Node class282) {
		if (class282.prev != null)
			class282.unlink(-371378792);
		class282.prev = aClass282_5604;
		class282.next = aClass282_5604.next;
		class282.prev.next = class282;
		class282.next.prev = class282;
	}

	public void method7863() {
		for (;;) {
			Node class282 = aClass282_5604.next;
			if (class282 == aClass282_5604)
				break;
			class282.unlink(-371378792);
		}
		((Class473) this).aClass282_5603 = null;
	}

	public Node method7864() {
		Node class282 = aClass282_5604.next;
		if (aClass282_5604 == class282) {
			((Class473) this).aClass282_5603 = null;
			return null;
		}
		((Class473) this).aClass282_5603 = class282.next;
		return class282;
	}

	public void method7865(Node class282) {
		if (class282.prev != null)
			class282.unlink(-371378792);
		class282.prev = aClass282_5604;
		class282.next = aClass282_5604.next;
		class282.prev.next = class282;
		class282.next.prev = class282;
	}

	public Node method7866() {
		Node class282 = aClass282_5604.next;
		if (class282 == aClass282_5604)
			return null;
		class282.unlink(-371378792);
		return class282;
	}

	public Node method7867() {
		Node class282 = aClass282_5604.next;
		if (class282 == aClass282_5604)
			return null;
		class282.unlink(-371378792);
		return class282;
	}

	public Node method7868() {
		Node class282 = aClass282_5604.next;
		if (class282 == aClass282_5604)
			return null;
		class282.unlink(-371378792);
		return class282;
	}

	public Node method7869(int i) {
		Node class282 = aClass282_5604.prev;
		if (aClass282_5604 == class282) {
			((Class473) this).aClass282_5603 = null;
			return null;
		}
		((Class473) this).aClass282_5603 = class282.prev;
		return class282;
	}

	public Node method7870() {
		Node class282 = aClass282_5604.next;
		if (aClass282_5604 == class282) {
			((Class473) this).aClass282_5603 = null;
			return null;
		}
		((Class473) this).aClass282_5603 = class282.next;
		return class282;
	}

	public Node method7871() {
		Node class282 = aClass282_5604.prev;
		if (aClass282_5604 == class282) {
			((Class473) this).aClass282_5603 = null;
			return null;
		}
		((Class473) this).aClass282_5603 = class282.prev;
		return class282;
	}

	public Node method7872() {
		Node class282 = aClass282_5604.next;
		if (aClass282_5604 == class282) {
			((Class473) this).aClass282_5603 = null;
			return null;
		}
		((Class473) this).aClass282_5603 = class282.next;
		return class282;
	}

	public void method7873(Node class282, byte i) {
		if (class282.prev != null)
			class282.unlink(-371378792);
		class282.prev = aClass282_5604;
		class282.next = aClass282_5604.next;
		class282.prev.next = class282;
		class282.next.prev = class282;
	}

	public Node method7874() {
		Node class282 = aClass282_5604.prev;
		if (aClass282_5604 == class282) {
			((Class473) this).aClass282_5603 = null;
			return null;
		}
		((Class473) this).aClass282_5603 = class282.prev;
		return class282;
	}

	public void method7875(Node class282) {
		if (class282.prev != null)
			class282.unlink(-371378792);
		class282.prev = aClass282_5604;
		class282.next = aClass282_5604.next;
		class282.prev.next = class282;
		class282.next.prev = class282;
	}

	public Node method7876() {
		Node class282 = aClass282_5604.prev;
		if (aClass282_5604 == class282) {
			((Class473) this).aClass282_5603 = null;
			return null;
		}
		((Class473) this).aClass282_5603 = class282.prev;
		return class282;
	}

	public void method7877(Node class282, int i) {
		if (null != class282.prev)
			class282.unlink(-371378792);
		class282.prev = aClass282_5604.prev;
		class282.next = aClass282_5604;
		class282.prev.next = class282;
		class282.next.prev = class282;
	}

	public Node method7878() {
		Node class282 = aClass282_5604.prev;
		if (aClass282_5604 == class282) {
			((Class473) this).aClass282_5603 = null;
			return null;
		}
		((Class473) this).aClass282_5603 = class282.prev;
		return class282;
	}

	public Node method7879() {
		Node class282 = ((Class473) this).aClass282_5603;
		if (class282 == aClass282_5604) {
			((Class473) this).aClass282_5603 = null;
			return null;
		}
		((Class473) this).aClass282_5603 = class282.next;
		return class282;
	}

	public Node method7880() {
		Node class282 = ((Class473) this).aClass282_5603;
		if (class282 == aClass282_5604) {
			((Class473) this).aClass282_5603 = null;
			return null;
		}
		((Class473) this).aClass282_5603 = class282.next;
		return class282;
	}

	public Node method7881() {
		Node class282 = aClass282_5604.prev;
		if (aClass282_5604 == class282) {
			((Class473) this).aClass282_5603 = null;
			return null;
		}
		((Class473) this).aClass282_5603 = class282.prev;
		return class282;
	}

	public boolean method7882() {
		return aClass282_5604 == aClass282_5604.next;
	}

	public boolean method7883() {
		return aClass282_5604 == aClass282_5604.next;
	}

	public boolean method7884() {
		return aClass282_5604 == aClass282_5604.next;
	}

	public static byte[] method7885(CharSequence charsequence, byte i) {
		int i_0_ = charsequence.length();
		byte[] is = new byte[i_0_];
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
			char c = charsequence.charAt(i_1_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_1_] = (byte) c;
			else if (c == '\u20ac')
				is[i_1_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_1_] = (byte) -126;
			else if (c == '\u0192')
				is[i_1_] = (byte) -125;
			else if (c == '\u201e')
				is[i_1_] = (byte) -124;
			else if (c == '\u2026')
				is[i_1_] = (byte) -123;
			else if ('\u2020' == c)
				is[i_1_] = (byte) -122;
			else if ('\u2021' == c)
				is[i_1_] = (byte) -121;
			else if (c == '\u02c6')
				is[i_1_] = (byte) -120;
			else if (c == '\u2030')
				is[i_1_] = (byte) -119;
			else if (c == '\u0160')
				is[i_1_] = (byte) -118;
			else if (c == '\u2039')
				is[i_1_] = (byte) -117;
			else if ('\u0152' == c)
				is[i_1_] = (byte) -116;
			else if (c == '\u017d')
				is[i_1_] = (byte) -114;
			else if (c == '\u2018')
				is[i_1_] = (byte) -111;
			else if ('\u2019' == c)
				is[i_1_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_1_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_1_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_1_] = (byte) -107;
			else if (c == '\u2013')
				is[i_1_] = (byte) -106;
			else if ('\u2014' == c)
				is[i_1_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_1_] = (byte) -104;
			else if (c == '\u2122')
				is[i_1_] = (byte) -103;
			else if (c == '\u0161')
				is[i_1_] = (byte) -102;
			else if (c == '\u203a')
				is[i_1_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_1_] = (byte) -100;
			else if (c == '\u017e')
				is[i_1_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_1_] = (byte) -97;
			else
				is[i_1_] = (byte) 63;
		}
		return is;
	}

	public static final void method7886(boolean bool, int i) {
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4587, client.aClass184_7475.aClass432_2283, 1209499491);
		client.aClass184_7475.method3049(class282_sub23, 2048910350);
		for (Class282_Sub44 class282_sub44 = ((Class282_Sub44) client.aClass465_7442.method7750(1343073416)); class282_sub44 != null; class282_sub44 = ((Class282_Sub44) client.aClass465_7442.method7751((byte) 30))) {
			if (!class282_sub44.method4994(-1056667124)) {
				class282_sub44 = ((Class282_Sub44) client.aClass465_7442.method7750(861555487));
				if (null == class282_sub44)
					break;
			}
			if (0 == class282_sub44.anInt8062 * -1517697923)
				Class351.method6196(class282_sub44, true, bool, -1206109982);
		}
		if (null != client.aClass118_7352) {
			Class109.method1858(client.aClass118_7352, (byte) 66);
			client.aClass118_7352 = null;
		}
	}

	public static void method7887(int i) {
		for (Class282_Sub48 class282_sub48 = ((Class282_Sub48) Class282_Sub48.aClass482_8073.head((byte) 94)); class282_sub48 != null; class282_sub48 = (Class282_Sub48) Class282_Sub48.aClass482_8073.next(-1229768145)) {
			if (((Class282_Sub48) class282_sub48).aBool8092)
				class282_sub48.method13426((byte) 1);
		}
		for (Class282_Sub48 class282_sub48 = ((Class282_Sub48) Class282_Sub48.aClass482_8074.head((byte) 66)); null != class282_sub48; class282_sub48 = (Class282_Sub48) Class282_Sub48.aClass482_8074.next(893135123)) {
			if (((Class282_Sub48) class282_sub48).aBool8092)
				class282_sub48.method13426((byte) 1);
		}
	}

	static final void method7888(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7001 -= 1918006146;
		if ((((CS2Executor) class527).aLongArray7003[1820448321 * ((CS2Executor) class527).anInt7001]) >= (((CS2Executor) class527).aLongArray7003[1 + 1820448321 * ((CS2Executor) class527).anInt7001]))
			((CS2Executor) class527).instrPtr += (-1051529003 * (((CS2Executor) class527).unknown[301123709 * ((CS2Executor) class527).instrPtr]));
	}

	static final void method7889(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1390174253) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1346 = Class351.method6193(string, class527, 1483918243);
		class118.aBool1384 = true;
	}
}
