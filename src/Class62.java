
/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

public class Class62 implements Interface3 {
	public int anInt648;
	public String aString649;
	public Class356 aClass356_650;
	public int anInt651;
	public int anInt652;
	public int anInt653;
	public Class353 aClass353_654;
	public int anInt655;
	public int anInt656;
	public int anInt657;
	public int anInt658;
	public int anInt659;
	public int anInt660;

	public Class60 method24(int i) {
		return Class60.aClass60_604;
	}

	Class62(String string, Class356 class356, Class353 class353, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		aString649 = string;
		aClass356_650 = class356;
		aClass353_654 = class353;
		anInt651 = -1042975847 * i;
		anInt655 = i_0_ * -2042627867;
		anInt653 = -762236223 * i_1_;
		anInt656 = 533004051 * i_2_;
		anInt657 = 1235699735 * i_3_;
		anInt652 = 1860559737 * i_4_;
		anInt648 = i_5_ * 959976471;
		anInt658 = -2111808237 * i_6_;
		anInt659 = 1820776739 * i_7_;
		anInt660 = -1985214661 * i_8_;
	}

	public Class60 method25() {
		return Class60.aClass60_604;
	}

	public static Class62 method1256(RsByteBuffer class282_sub35) {
		String string = class282_sub35.readString(-210384568);
		Class356 class356 = (Class350_Sub3_Sub1.method15558(755585650)[class282_sub35.readUnsignedByte()]);
		Class353 class353 = (Class483.method8155(152314627)[class282_sub35.readUnsignedByte()]);
		int i = class282_sub35.readShort(1780936894);
		int i_9_ = class282_sub35.readShort(1846262904);
		int i_10_ = class282_sub35.readUnsignedByte();
		int i_11_ = class282_sub35.readUnsignedByte();
		int i_12_ = class282_sub35.readUnsignedByte();
		int i_13_ = class282_sub35.readUnsignedShort();
		int i_14_ = class282_sub35.readUnsignedShort();
		int i_15_ = class282_sub35.readBigSmart(1942206835);
		int i_16_ = class282_sub35.readInt();
		int i_17_ = class282_sub35.readInt();
		return new Class62(string, class356, class353, i, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, i_17_);
	}

	public static Class62 method1257(RsByteBuffer class282_sub35) {
		String string = class282_sub35.readString(1353033153);
		Class356 class356 = (Class350_Sub3_Sub1.method15558(563954548)[class282_sub35.readUnsignedByte()]);
		Class353 class353 = (Class483.method8155(152314627)[class282_sub35.readUnsignedByte()]);
		int i = class282_sub35.readShort(1756940293);
		int i_18_ = class282_sub35.readShort(1893190838);
		int i_19_ = class282_sub35.readUnsignedByte();
		int i_20_ = class282_sub35.readUnsignedByte();
		int i_21_ = class282_sub35.readUnsignedByte();
		int i_22_ = class282_sub35.readUnsignedShort();
		int i_23_ = class282_sub35.readUnsignedShort();
		int i_24_ = class282_sub35.readBigSmart(2091553119);
		int i_25_ = class282_sub35.readInt();
		int i_26_ = class282_sub35.readInt();
		return new Class62(string, class356, class353, i, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_);
	}

	public static Class62 method1258(RsByteBuffer class282_sub35) {
		String string = class282_sub35.readString(-615738790);
		Class356 class356 = (Class350_Sub3_Sub1.method15558(1630681329)[class282_sub35.readUnsignedByte()]);
		Class353 class353 = (Class483.method8155(152314627)[class282_sub35.readUnsignedByte()]);
		int i = class282_sub35.readShort(2113135095);
		int i_27_ = class282_sub35.readShort(1636498629);
		int i_28_ = class282_sub35.readUnsignedByte();
		int i_29_ = class282_sub35.readUnsignedByte();
		int i_30_ = class282_sub35.readUnsignedByte();
		int i_31_ = class282_sub35.readUnsignedShort();
		int i_32_ = class282_sub35.readUnsignedShort();
		int i_33_ = class282_sub35.readBigSmart(1944050009);
		int i_34_ = class282_sub35.readInt();
		int i_35_ = class282_sub35.readInt();
		return new Class62(string, class356, class353, i, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_, i_33_, i_34_, i_35_);
	}

	static final void method1259(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class278_Sub1.method13450(class118, class98, class527, -2236332);
	}

	static void method1260(int i, boolean bool, int i_36_) {
		if (bool) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4556, client.aClass184_7475.aClass432_2283, -341537070);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i, 1417031095);
			client.aClass184_7475.method3049(class282_sub23, 684083045);
		} else
			Class210.method3614(Class397.aClass397_4800, i, -1, (byte) 69);
	}

	public static void method1261(Index class317, byte i) {
		Class235.anInt2902 = 0;
		Class235.anInt2905 = 0;
		Class235.aList2896 = new LinkedList();
		Class235.aClass275_Sub1_Sub1_Sub1Array2897 = new Class275_Sub1_Sub1_Sub1[1024];
		Class477.aClass539Array5632 = (new Class539[Class89.anIntArray931[Class235.anInt2906 * -391332475] + 1]);
		Class235.anInt2899 = 0;
		Class235.anInt2901 = 0;
		Class282_Sub20_Sub22.method15388(class317, (byte) -16);
		Class111.method1866(class317, -473782412);
	}

	public static boolean method1262(int i, String string, byte i_37_) {
		Class159.aClass450_2010 = new Class450();
		Class159.aClass450_2010.worldId = i * -1933199413;
		Class159.aClass450_2010.aString5433 = string;
		if (Class90.aClass496_952 != Class496.aClass496_5813) {
			Class159.aClass450_2010.anInt5434 = 1140744768 + -58916693 * Class159.aClass450_2010.worldId;
			Class159.aClass450_2010.anInt5437 = 1250363344 + -1441381029 * Class159.aClass450_2010.worldId;
		}
		return true;
	}
}
