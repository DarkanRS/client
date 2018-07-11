/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class86 {
	static Class77[] aClass77Array818;
	static int anInt819;
	static Class92[] aClass92Array820;
	static Class93[] aClass93Array821;
	public static Class96[] aClass96Array822;
	public static IterableNodeMap aClass465_823;
	static int anInt824;
	static int anInt825;
	static boolean aBool826;
	public static NodeCollection aClass482_827 = new NodeCollection();
	static short aShort828;
	static short aShort829;
	static short aShort830;
	static int anInt831;
	public static Interface42 anInterface42_832;
	public static int anInt833;

	public static void method1468(boolean bool) {
		if (2 != -891719545 * client.anInt7341 && 1 != client.anInt7341 * -891719545) {
			if (!bool) {
				Class96[] class96s = aClass96Array822;
				for (int i = 0; i < class96s.length; i++) {
					Class96 class96 = class96s[i];
					class96.method1593((byte) 1);
				}
			}
			client.anInt7341 = 761834094;
			NativeLibraryLoader.anIntArrayArray3239 = null;
			Class276.aClass282_Sub35_3346 = null;
			client.aBool7321 = false;
			Class79.method1390(-1754686812);
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4572, client.aClass184_7475.isaac, -321060949);
			class282_sub23.buffer.writeByte(bool ? 1 : 0);
			client.aClass184_7475.method3049(class282_sub23, -359726056);
		}
	}

	static {
		aClass465_823 = new IterableNodeMap(32);
		anInt819 = 523556513;
		anInt825 = 0;
		anInt824 = 0;
		aBool826 = false;
		anInt831 = -1539001787;
		anInterface42_832 = new Class79();
	}

	public static boolean method1469(int i) {
		if (i != anInt831 * -436703373 || null == Class282_Sub42.aClass85_8039) {
			Class79.method1390(-617797612);
			Class282_Sub42.aClass85_8039 = Class85.aClass85_815;
			anInt831 = i * 1539001787;
		}
		if (Class282_Sub42.aClass85_8039 == Class85.aClass85_815) {
			byte[] is = IndexLoaders.CUTSCENE_INDEX.getFile(i, -1513841891);
			if (null == is)
				return false;
			RsByteBuffer class282_sub35 = new RsByteBuffer(is);
			Class176.method2976(class282_sub35, -2017548765);
			int i_0_ = class282_sub35.readUnsignedByte();
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
				aClass482_827.append(new Class282_Sub2(class282_sub35), -231043282);
			int i_2_ = class282_sub35.readUnsignedSmart(1809723622);
			aClass77Array818 = new Class77[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
				aClass77Array818[i_3_] = new Class77(class282_sub35);
			int i_4_ = class282_sub35.readUnsignedSmart(1613276700);
			Class82.aClass75Array804 = new Class75[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
				Class82.aClass75Array804[i_5_] = new Class75(class282_sub35, i_5_);
			int i_6_ = class282_sub35.readUnsignedSmart(1860442234);
			aClass92Array820 = new Class92[i_6_];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
				aClass92Array820[i_7_] = new Class92(class282_sub35);
			int i_8_ = class282_sub35.readUnsignedSmart(1826597875);
			aClass93Array821 = new Class93[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
				aClass93Array821[i_9_] = new Class93(class282_sub35);
			int i_10_ = class282_sub35.readUnsignedSmart(2006065156);
			aClass96Array822 = new Class96[i_10_];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
				aClass96Array822[i_11_] = Class16.method562(class282_sub35, 1972468902);
			Class282_Sub42.aClass85_8039 = Class85.aClass85_816;
		}
		if (Class85.aClass85_816 == Class282_Sub42.aClass85_8039) {
			boolean bool = true;
			Class75[] class75s = Class82.aClass75Array804;
			for (int i_12_ = 0; i_12_ < class75s.length; i_12_++) {
				Class75 class75 = class75s[i_12_];
				if (!class75.method1339((short) -23842))
					bool = false;
			}
			Class96[] class96s = aClass96Array822;
			for (int i_13_ = 0; i_13_ < class96s.length; i_13_++) {
				Class96 class96 = class96s[i_13_];
				if (!class96.method1599(-136091863))
					bool = false;
			}
			Class92[] class92s = aClass92Array820;
			for (int i_14_ = 0; i_14_ < class92s.length; i_14_++) {
				Class92 class92 = class92s[i_14_];
				if (!class92.method1557(1350675684))
					bool = false;
			}
			if (!bool)
				return false;
			Class282_Sub42.aClass85_8039 = Class85.aClass85_814;
		}
		return true;
	}

	static void method1470(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			switch (i) {
			case 0:
				anInt825 = class282_sub35.readUnsignedShort() * -251071231;
				anInt824 = class282_sub35.readUnsignedShort() * -11206567;
				break;
			case 255:
				return;
			}
		}
	}

	static void method1471(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			switch (i) {
			case 0:
				anInt825 = class282_sub35.readUnsignedShort() * -251071231;
				anInt824 = class282_sub35.readUnsignedShort() * -11206567;
				break;
			case 255:
				return;
			}
		}
	}

	public static void method1472() {
		aClass465_823.method7749(-1968596411);
		aClass482_827.method8118(-486993166);
		aClass77Array818 = null;
		Class82.aClass75Array804 = null;
		aClass92Array820 = null;
		aClass93Array821 = null;
		aClass96Array822 = null;
		anInt819 = 523556513;
		anInt825 = 0;
		anInt824 = 0;
		Class282_Sub42.aClass85_8039 = null;
		anInt831 = -1539001787;
		if (aBool826) {
			client.aShort7214 = aShort828;
			client.aShort7474 = aShort829;
			client.aShort7276 = Class534.aShort7079;
			client.aShort7441 = aShort830;
			aBool826 = false;
		}
	}

	static void method1473(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			switch (i) {
			case 0:
				anInt825 = class282_sub35.readUnsignedShort() * -251071231;
				anInt824 = class282_sub35.readUnsignedShort() * -11206567;
				break;
			case 255:
				return;
			}
		}
	}

	public static void method1474() {
		aShort828 = client.aShort7214;
		aShort829 = client.aShort7474;
		Class534.aShort7079 = client.aShort7276;
		aShort830 = client.aShort7441;
		aBool826 = true;
		if (0 != 194660329 * anInt824 && anInt825 * 2087717633 != 0) {
			client.aShort7276 = (short) 334;
			client.aShort7441 = (short) 334;
			client.aShort7474 = client.aShort7214 = (short) (881840640 * anInt824 / (2087717633 * anInt825));
		}
	}

	public static void method1475(boolean bool) {
		if (2 != -891719545 * client.anInt7341 && 1 != client.anInt7341 * -891719545) {
			if (!bool) {
				Class96[] class96s = aClass96Array822;
				for (int i = 0; i < class96s.length; i++) {
					Class96 class96 = class96s[i];
					class96.method1593((byte) 1);
				}
			}
			client.anInt7341 = 761834094;
			NativeLibraryLoader.anIntArrayArray3239 = null;
			Class276.aClass282_Sub35_3346 = null;
			client.aBool7321 = false;
			Class79.method1390(2109894057);
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4572, client.aClass184_7475.isaac, 492734490);
			class282_sub23.buffer.writeByte(bool ? 1 : 0);
			client.aClass184_7475.method3049(class282_sub23, 1960953052);
		}
	}

	public static void method1476(boolean bool) {
		if (2 != -891719545 * client.anInt7341 && 1 != client.anInt7341 * -891719545) {
			if (!bool) {
				Class96[] class96s = aClass96Array822;
				for (int i = 0; i < class96s.length; i++) {
					Class96 class96 = class96s[i];
					class96.method1593((byte) 1);
				}
			}
			client.anInt7341 = 761834094;
			NativeLibraryLoader.anIntArrayArray3239 = null;
			Class276.aClass282_Sub35_3346 = null;
			client.aBool7321 = false;
			Class79.method1390(-2058569097);
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4572, client.aClass184_7475.isaac, -409403571);
			class282_sub23.buffer.writeByte(bool ? 1 : 0);
			client.aClass184_7475.method3049(class282_sub23, -129762551);
		}
	}

	Class86() throws Throwable {
		throw new Error();
	}

	public static void method1477(boolean bool) {
		if (2 != -891719545 * client.anInt7341 && 1 != client.anInt7341 * -891719545) {
			if (!bool) {
				Class96[] class96s = aClass96Array822;
				for (int i = 0; i < class96s.length; i++) {
					Class96 class96 = class96s[i];
					class96.method1593((byte) 1);
				}
			}
			client.anInt7341 = 761834094;
			NativeLibraryLoader.anIntArrayArray3239 = null;
			Class276.aClass282_Sub35_3346 = null;
			client.aBool7321 = false;
			Class79.method1390(450147318);
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4572, client.aClass184_7475.isaac, 883726871);
			class282_sub23.buffer.writeByte(bool ? 1 : 0);
			client.aClass184_7475.method3049(class282_sub23, -1224202096);
		}
	}

	public static final void method1478(int i) {
		if (Class9.loginStage * 1923286921 != 2) {
			Class9.aClass184_73.method3051((byte) -81);
			JS5StandardRequester.method5558(-500941691);
			Class361.method6270((byte) 39);
		}
	}

	static final void method1479(CS2Executor class527, int i) {
		int i_15_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		boolean bool = true;
		if (i_15_ < 0)
			bool = 0 == (i_15_ + 1) % 4;
		else if (i_15_ < 1582)
			bool = 0 == i_15_ % 4;
		else if (i_15_ % 4 != 0)
			bool = false;
		else if (i_15_ % 100 != 0)
			bool = true;
		else if (0 != i_15_ % 400)
			bool = false;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
	}

	static final long method1480(int i) {
		return (((long) ((CS2Runner.anInt5906 += -1393099101) * -336812789 - 1) << 32) | 0xffffffffL);
	}

	static boolean method1481(Class232 class232, byte i) {
		return Class6.method302(class232, null, 898171196);
	}

	static void method1482(IComponentDefinitions class118, byte i) {
		if (5 == -2131393857 * class118.anInt1268 && -1 != class118.anInt1426 * -56249735)
			Class415.method6996(Renderers.SOFTWARE_RENDERER, class118, -585931804);
	}
}
