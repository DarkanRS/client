/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class119 {
	public int anInt1454;
	public int[] anIntArray1455;
	public Class455 aClass455_1456;
	public int[] anIntArray1457;
	public int anInt1458;
	int anInt1459;
	static Class344 aClass344_1460;
	public static Class12 aClass12_1461;
	public static Js5StandardRequester aClass312_1462;
	public static ItemIndexLoader aClass426_1463;

	public boolean method2073(int i, int i_0_, int i_1_) {
		if (i_0_ >= 0 && i_0_ < anIntArray1457.length) {
			int i_2_ = anIntArray1457[i_0_];
			if (i >= i_2_ && i <= i_2_ + anIntArray1455[i_0_])
				return true;
		}
		return false;
	}

	Class119(int i, int i_3_, int[] is, int[] is_4_, Class455 class455, int i_5_) {
		anInt1458 = 627047069 * i;
		anInt1454 = 49286549 * i_3_;
		anIntArray1455 = is;
		anIntArray1457 = is_4_;
		aClass455_1456 = class455;
		((Class119) this).anInt1459 = i_5_ * 1926973683;
	}

	public static void method2074(String string, String string_6_, int i, boolean bool, byte i_7_) {
		if (3 == client.anInt7166 * -1741204137) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4628, client.aClass184_7218.aClass432_2283, 94516093);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(0, 1417031095);
			int i_8_ = (-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string_6_);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(bool ? 1 : 0);
			class282_sub23.aClass282_Sub35_Sub2_7682.index += 781596523;
			class282_sub23.aClass282_Sub35_Sub2_7682.method13101(Class14.anIntArray131, i_8_, (class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291), 1773448479);
			class282_sub23.aClass282_Sub35_Sub2_7682.method13281((-1990677291 * class282_sub23.aClass282_Sub35_Sub2_7682.index) - i_8_, 1201423895);
			client.aClass184_7218.method3049(class282_sub23, -593132534);
			if (i < 13) {
				client.aBool7189 = true;
				Class188.method3142(-1273118938);
			}
			Class237.aClass494_2916 = Class494.aClass494_5790;
		}
	}

	public static void method2075(int i, String string, byte i_9_) {
		int i_10_ = -963499271 * Class197.NUM_PLAYER_INDICES;
		int[] is = Class197.PLAYER_INDICES;
		boolean bool = false;
		for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
			Player class521_sub1_sub1_sub2_sub1 = client.players[is[i_11_]];
			if (class521_sub1_sub1_sub2_sub1 != null && (class521_sub1_sub1_sub2_sub1 != Class84.myPlayer) && null != class521_sub1_sub1_sub2_sub1.displayName && class521_sub1_sub1_sub2_sub1.displayName.equalsIgnoreCase(string)) {
				OutgoingPacket class379 = null;
				if (1 == i)
					class379 = OutgoingPacket.aClass379_4539;
				else if (4 == i)
					class379 = OutgoingPacket.aClass379_4616;
				else if (i == 5)
					class379 = OutgoingPacket.aClass379_4610;
				else if (6 == i)
					class379 = OutgoingPacket.aClass379_4528;
				else if (i == 7)
					class379 = OutgoingPacket.aClass379_4594;
				else if (i == 9)
					class379 = OutgoingPacket.aClass379_4580;
				if (null != class379) {
					Class282_Sub23 class282_sub23 = Class271.method4828(class379, (client.aClass184_7475.aClass432_2283), -147657643);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(is[i_11_], 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(0, 1653548844);
					client.aClass184_7475.method3049(class282_sub23, 669327577);
				}
				bool = true;
				break;
			}
		}
		if (!bool)
			Class387.method6681(4, new StringBuilder().append(Message.aClass433_5280.translate(Class223.aClass495_2772, -774222111)).append(string).toString(), (byte) -65);
	}

	static void method2076(Class118 class118, Class118 class118_12_, int i) {
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4601, client.aClass184_7475.aClass432_2283, -3887603);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(class118_12_.anInt1288 * 1924549737, -1183932171);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(1924549737 * class118.anInt1288, (short) -28348);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(class118_12_.anInt1426 * -56249735, 1417031095);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(-56249735 * class118.anInt1426, -1183932171);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV1(class118.anInt1287 * -1952846363, -1596162032);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeLEInt(class118_12_.anInt1287 * -1952846363, (byte) 77);
		client.aClass184_7475.method3049(class282_sub23, -683028728);
	}

	public static void method2077(int i) {
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub27_8208), 1, -879331586);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub27_8209), 1, -1380077307);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub23_8202), 1, 748663457);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub17_8200), 1, 2086914701);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub15_8203), 0, -480234174);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub26_8224), 0, -1904588686);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub28_8212), 0, 213575590);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub2_8205), 0, 665870482);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub22_8213), 0, -1952612636);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub19_8204), 0, -998359039);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub24_8216), 0, 812339318);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub30_8194), 0, 926852510);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub4_8187), 0, -561555646);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub4_8223), 0, -1744988767);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub20_8207), 0, -1860208204);
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub1_8197, Class106.aClass106_1075.anInt1071 * -530599889, -1298876886);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub12_8195), 0, -1771298616);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub14_8211), 0, -1247353645);
		Class323.method5777(1139653705);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub7_8210), 2, 2126000152);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub6_8192), 2, -761948866);
		Class94.method1589((short) 255);
		client.aClass257_7353.method4435((byte) 1).method4048(572282036);
		client.aBool7185 = true;
	}
}
