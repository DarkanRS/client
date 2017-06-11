/* Class198 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class OutcommingPacket {
	public static OutcommingPacket aClass198_1993;
	public static OutcommingPacket aClass198_1994;
	public static OutcommingPacket aClass198_1995;
	public static OutcommingPacket ITEM_ON_ITEM;
	public static OutcommingPacket ADD_IGNORE_PACKET;
	public static OutcommingPacket aClass198_1998;
	public static OutcommingPacket aClass198_1999;
	public static OutcommingPacket aClass198_2000;
	public static OutcommingPacket INTERFACE_ON_NPC;
	public static OutcommingPacket aClass198_2002;
	public static OutcommingPacket aClass198_2003;
	public static OutcommingPacket aClass198_2004;
	public static OutcommingPacket aClass198_2005;
	public static OutcommingPacket CLICK_UNWALKABLE_AREA_PACKET;
	public static OutcommingPacket ACTION_BUTTON1_PACKET;
	public static OutcommingPacket aClass198_2008;
	public static OutcommingPacket aClass198_2009;
	public static OutcommingPacket aClass198_2010;
	public static OutcommingPacket aClass198_2011;
	public static OutcommingPacket aClass198_2012;
	public static OutcommingPacket ATTACK_NPC_PACKET;
	public static OutcommingPacket PING_PACKET;
	public static OutcommingPacket CHANGE_FRIEND_CHAT_PACKET;
	public static OutcommingPacket aClass198_2016;
	public static OutcommingPacket COMMANDS_PACKET;
	public static OutcommingPacket EXAMINE_OBJECT_PACKET;
	public static OutcommingPacket aClass198_2019;
	public static OutcommingPacket aClass198_2020;
	public static OutcommingPacket aClass198_2021;
	public static OutcommingPacket ITEM_TAKE_PACKET;
	public static OutcommingPacket DONE_LOADING_REGION_PACKET;
	public static OutcommingPacket aClass198_2024;
	public static OutcommingPacket aClass198_2025;
	public static OutcommingPacket RECEIVE_PACKET_COUNT_PACKET;
	public static OutcommingPacket aClass198_2027;
	public static OutcommingPacket aClass198_2028;
	public static OutcommingPacket JOIN_FRIEND_CHAT_PACKET;
	public static OutcommingPacket INTERFACE_ON_OBJECT;
	public static OutcommingPacket aClass198_2031;
	public static OutcommingPacket CHANGE_GRAPHIC_OPTIONS_PACKET;
	public static OutcommingPacket aClass198_2033;
	public static OutcommingPacket aClass198_2034;
	public static OutcommingPacket aClass198_2035;
	public static OutcommingPacket aClass198_2036;
	public static OutcommingPacket aClass198_2037;
	public static OutcommingPacket aClass198_2038;
	public static OutcommingPacket aClass198_2039;
	public static OutcommingPacket aClass198_2040;
	public static OutcommingPacket aClass198_2041;
	public static OutcommingPacket aClass198_2042;
	public static OutcommingPacket ATTACK_PLAYER_PACKET;
	public static OutcommingPacket SEND_PERSONAL_MESSAGE;
	public static OutcommingPacket aClass198_2045;
	public static OutcommingPacket CHAT_PACKET;
	public static OutcommingPacket CLOSE_INTERFACE_PACKET;
	public static OutcommingPacket aClass198_2048;
	public static OutcommingPacket aClass198_2049;
	public static OutcommingPacket aClass198_2050;
	public static OutcommingPacket MINI_WALKING_PACKET;
	public static OutcommingPacket aClass198_2052;
	public static OutcommingPacket aClass198_2053;
	public static OutcommingPacket aClass198_2054;
	public static OutcommingPacket aClass198_2055;
	public static OutcommingPacket aClass198_2056;
	public static OutcommingPacket aClass198_2057;
	public static OutcommingPacket NPC_EXAMINE_PACKET;
	public static OutcommingPacket aClass198_2059;
	public static OutcommingPacket ACTION_BUTTON2_PACKET;
	public static OutcommingPacket REMOVE_IGNORE_PACKET;
	public static OutcommingPacket aClass198_2062;
	public static OutcommingPacket aClass198_2063;
	public static OutcommingPacket aClass198_2064;
	public static OutcommingPacket DIALOGUE_CONTINUE_PACKET;
	public static OutcommingPacket QUICK_CHAT_PRIVATE_MESSAGE = new OutcommingPacket(0, -1);
	public static OutcommingPacket KICK_FRIEND_CHAT_PACKET;
	public static OutcommingPacket aClass198_2068;
	public static OutcommingPacket SWITCH_INTERFACE_ITEM_PACKET;
	public static OutcommingPacket aClass198_2070;
	public static OutcommingPacket aClass198_2071;
	public static OutcommingPacket aClass198_2072;
	public static OutcommingPacket aClass198_2073;
	public static OutcommingPacket aClass198_2074;
	public static OutcommingPacket WALKING_PACKET;
	public static OutcommingPacket CHAT_TYPE_PACKET;
	public static OutcommingPacket NPC_CLICK_4;
	public static OutcommingPacket aClass198_2078;
	public static OutcommingPacket FRIEND_CHAT_QUICK_CHAT_MESSAGE;
	public static OutcommingPacket REMOVE_FRIEND_PACKET;
	int id;
	public static OutcommingPacket aClass198_2082;
	public static OutcommingPacket aClass198_2083;
	public static OutcommingPacket aClass198_2084;
	public static OutcommingPacket aClass198_2085;
	public static OutcommingPacket WORLD_MAP_CLICK_PACKET;
	public static OutcommingPacket aClass198_2087;
	public static OutcommingPacket aClass198_2088;
	public static OutcommingPacket aClass198_2089;
	public static OutcommingPacket COLOR_ID_PACKET;
	public static OutcommingPacket SCREEN_PACKET;
	public static OutcommingPacket ADD_FRIEND_PACKET;
	public static OutcommingPacket aClass198_2093;
	public static OutcommingPacket aClass198_2094;
	public static OutcommingPacket ITEM_ON_FLOOR_EXAMINE;
	public static OutcommingPacket MOVE_CAMERA_PACKET;
	int length;
	public static OutcommingPacket INTERFACE_ON_PLAYER;
	public static int anInt2099;

	static {
		aClass198_1994 = new OutcommingPacket(1, -2);
		aClass198_1995 = new OutcommingPacket(2, -1);
		ITEM_ON_ITEM = new OutcommingPacket(3, 16);
		ADD_IGNORE_PACKET = new OutcommingPacket(4, -1);
		aClass198_2054 = new OutcommingPacket(5, 8);
		aClass198_1999 = new OutcommingPacket(6, 8);
		aClass198_2000 = new OutcommingPacket(7, 3);
		WALKING_PACKET = new OutcommingPacket(8, -1);
		NPC_EXAMINE_PACKET = new OutcommingPacket(9, 3);
		aClass198_2003 = new OutcommingPacket(10, -1);
		aClass198_2085 = new OutcommingPacket(11, -1);
		aClass198_2005 = new OutcommingPacket(12, -1);
		CLICK_UNWALKABLE_AREA_PACKET = new OutcommingPacket(13, 7);
		ACTION_BUTTON1_PACKET = new OutcommingPacket(14, 8);
		aClass198_2008 = new OutcommingPacket(15, 6);
		aClass198_2009 = new OutcommingPacket(16, 2);
		aClass198_2010 = new OutcommingPacket(17, 3);
		aClass198_2073 = new OutcommingPacket(18, -1);
		aClass198_2072 = new OutcommingPacket(19, -2);
		ATTACK_NPC_PACKET = new OutcommingPacket(20, 3);
		PING_PACKET = new OutcommingPacket(21, 0);
		CHANGE_FRIEND_CHAT_PACKET = new OutcommingPacket(22, -1);
		aClass198_2016 = new OutcommingPacket(23, 9);
		REMOVE_FRIEND_PACKET = new OutcommingPacket(24, -1);
		EXAMINE_OBJECT_PACKET = new OutcommingPacket(25, 9);
		aClass198_2019 = new OutcommingPacket(26, 9);
		aClass198_2020 = new OutcommingPacket(27, 8);
		aClass198_2004 = new OutcommingPacket(28, 4);
		aClass198_2027 = new OutcommingPacket(29, -1);
		DONE_LOADING_REGION_PACKET = new OutcommingPacket(30, 0);
		aClass198_2024 = new OutcommingPacket(31, 3);
		aClass198_2025 = new OutcommingPacket(32, 8);
		RECEIVE_PACKET_COUNT_PACKET = new OutcommingPacket(33, 4);
		aClass198_2031 = new OutcommingPacket(34, 3);
		aClass198_2028 = new OutcommingPacket(35, -1);
		JOIN_FRIEND_CHAT_PACKET = new OutcommingPacket(36, -1);
		INTERFACE_ON_OBJECT = new OutcommingPacket(37, 17);
		WORLD_MAP_CLICK_PACKET = new OutcommingPacket(38, 4);
		CHANGE_GRAPHIC_OPTIONS_PACKET = new OutcommingPacket(39, 4);
		aClass198_2033 = new OutcommingPacket(40, 9);
		aClass198_2034 = new OutcommingPacket(41, -1);
		ATTACK_PLAYER_PACKET = new OutcommingPacket(42, 3);
		aClass198_2050 = new OutcommingPacket(43, 7);
		aClass198_2037 = new OutcommingPacket(44, -2);
		aClass198_2038 = new OutcommingPacket(45, 7);
		aClass198_2039 = new OutcommingPacket(46, 3);
		aClass198_2040 = new OutcommingPacket(47, 4);
		aClass198_2041 = new OutcommingPacket(48, -1);
		aClass198_2042 = new OutcommingPacket(49, 3);
		INTERFACE_ON_PLAYER = new OutcommingPacket(50, 11);
		aClass198_2056 = new OutcommingPacket(51, 3);
		aClass198_2045 = new OutcommingPacket(52, -1);
		CHAT_PACKET = new OutcommingPacket(53, -1);
		CLOSE_INTERFACE_PACKET = new OutcommingPacket(54, 0);
		aClass198_2048 = new OutcommingPacket(55, 8);
		aClass198_2049 = new OutcommingPacket(56, 3);
		ITEM_TAKE_PACKET = new OutcommingPacket(57, 7);
		MINI_WALKING_PACKET = new OutcommingPacket(58, -1);
		aClass198_2052 = new OutcommingPacket(59, 9);
		COMMANDS_PACKET = new OutcommingPacket(60, -1);
		aClass198_2002 = new OutcommingPacket(61, 7);
		aClass198_2055 = new OutcommingPacket(62, 7);
		aClass198_2087 = new OutcommingPacket(63, 12);
		aClass198_2082 = new OutcommingPacket(64, 4);
		NPC_CLICK_4 = new OutcommingPacket(65, 3);
		INTERFACE_ON_NPC = new OutcommingPacket(66, 11);
		ACTION_BUTTON2_PACKET = new OutcommingPacket(67, 8);
		aClass198_1993 = new OutcommingPacket(68, 8);
		aClass198_2062 = new OutcommingPacket(69, 15);
		aClass198_2063 = new OutcommingPacket(70, 1);
		aClass198_2057 = new OutcommingPacket(71, 2);
		DIALOGUE_CONTINUE_PACKET = new OutcommingPacket(72, 6);
		REMOVE_IGNORE_PACKET = new OutcommingPacket(73, -1);
		KICK_FRIEND_CHAT_PACKET = new OutcommingPacket(74, -1);
		aClass198_2068 = new OutcommingPacket(75, -2);
		SWITCH_INTERFACE_ITEM_PACKET = new OutcommingPacket(76, 16);
		aClass198_2070 = new OutcommingPacket(77, 3);
		aClass198_2011 = new OutcommingPacket(78, 1);
		aClass198_2053 = new OutcommingPacket(79, 3);
		aClass198_2012 = new OutcommingPacket(80, 9);
		aClass198_2074 = new OutcommingPacket(81, 4);
		SEND_PERSONAL_MESSAGE = new OutcommingPacket(82, -2);
		CHAT_TYPE_PACKET = new OutcommingPacket(83, 1);
		aClass198_2021 = new OutcommingPacket(84, 1);
		aClass198_2078 = new OutcommingPacket(85, 3);
		FRIEND_CHAT_QUICK_CHAT_MESSAGE = new OutcommingPacket(86, -1);
		aClass198_2071 = new OutcommingPacket(87, 4);
		aClass198_2064 = new OutcommingPacket(88, 3);
		ADD_FRIEND_PACKET = new OutcommingPacket(89, -1);
		aClass198_2083 = new OutcommingPacket(90, 8);
		aClass198_2084 = new OutcommingPacket(91, -2);
		aClass198_2035 = new OutcommingPacket(92, -1);
		aClass198_2059 = new OutcommingPacket(93, -1);
		aClass198_1998 = new OutcommingPacket(94, 9);
		aClass198_2088 = new OutcommingPacket(95, -2);
		aClass198_2089 = new OutcommingPacket(96, 8);
		COLOR_ID_PACKET = new OutcommingPacket(97, 2);
		SCREEN_PACKET = new OutcommingPacket(98, 6);
		aClass198_2036 = new OutcommingPacket(99, 2);
		aClass198_2093 = new OutcommingPacket(100, -2);
		aClass198_2094 = new OutcommingPacket(101, 3);
		ITEM_ON_FLOOR_EXAMINE = new OutcommingPacket(102, 7);
		MOVE_CAMERA_PACKET = new OutcommingPacket(103, 4);
	}

	OutcommingPacket(int id, int length) {
		((OutcommingPacket) this).id = -525230381 * id;
		((OutcommingPacket) this).length = 1381077963 * length;
	}

	static final void method1889(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_1_, (byte) 0);
			Class119 class119 = Class389.aClass119Array4165[i_1_ >> 16];
			Class373.method4606(class105, class119, class403, -1722505013);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ij.ei(").append(')').toString());
		}
	}

	static final void method1890(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -699082754) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1244 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ij.ky(").append(')').toString());
		}
	}

	static final void method1891(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((ClientScript2) class403).aClass298_Sub25_5237.aByte7360;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ij.xb(").append(')').toString());
		}
	}

	static final void method1892(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = (Class79.method847(Class411.method5574((((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]), 2103151536), Class321.aClass429_3357.method242(694163818), -1841335173));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ij.zo(").append(')').toString());
		}
	}

	static final void method1893(IComponentDefinition class105, Class119 class119, ClientScript2 class403, byte i) {
		try {
			class105.anInt1239 = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) * 476443207;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ij.ik(").append(')').toString());
		}
	}
}
