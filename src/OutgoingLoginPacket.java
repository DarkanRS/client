/* Class369 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class OutgoingLoginPacket {
	static OutgoingLoginPacket[] OUTGOING_LOGIN_PACKETS;
	static OutgoingLoginPacket CHECK_WORLD_SUITABILITY;
	public static OutgoingLoginPacket SOCIAL_NETWORK_LOGIN;
	public static OutgoingLoginPacket LOBBYLOGIN;
	static OutgoingLoginPacket REQUEST_WORLDLIST;
	public static OutgoingLoginPacket INIT_GAME_CONNECTION = new OutgoingLoginPacket(14, 0);
	public static OutgoingLoginPacket GAMELOGIN_CONTINUE;
	static OutgoingLoginPacket SSL_WEBCONNECTION;
	public static OutgoingLoginPacket CREATE_ACCOUNT_CONNECT;
	public static OutgoingLoginPacket INIT_SOCIAL_NETWORK_CONNECTION;
	public static OutgoingLoginPacket GAMELOGIN;
	public int id;
	public static OutgoingLoginPacket INIT_JS5REMOTE_CONNECTION = new OutgoingLoginPacket(15, -1);
	public static int anInt4280;

	OutgoingLoginPacket(int i, int i_0_) {
		id = i * -1958225857;
	}

	static {
		GAMELOGIN = new OutgoingLoginPacket(16, -2);
		LOBBYLOGIN = new OutgoingLoginPacket(19, -2);
		REQUEST_WORLDLIST = new OutgoingLoginPacket(23, 4);
		CHECK_WORLD_SUITABILITY = new OutgoingLoginPacket(24, -1);
		GAMELOGIN_CONTINUE = new OutgoingLoginPacket(26, 0);
		SSL_WEBCONNECTION = new OutgoingLoginPacket(27, 0);
		CREATE_ACCOUNT_CONNECT = new OutgoingLoginPacket(28, -2);
		INIT_SOCIAL_NETWORK_CONNECTION = new OutgoingLoginPacket(29, -2);
		SOCIAL_NETWORK_LOGIN = new OutgoingLoginPacket(30, -2);
		OUTGOING_LOGIN_PACKETS = new OutgoingLoginPacket[32];
		OutgoingLoginPacket[] class369s = Class345.getOutgoingLoginPackets();
		for (int i = 0; i < class369s.length; i++)
			OUTGOING_LOGIN_PACKETS[1627920319 * class369s[i].id] = class369s[i];
	}

	static final void method6313(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		class527.intStackPtr -= 567564004;
		class118.anInt1404 = (class527.intStack[class527.intStackPtr * 1942118537]) * -619343517;
		class118.anInt1432 = (class527.intStack[1 + class527.intStackPtr * 1942118537]) * 664420687;
		class118.anInt1433 = (class527.intStack[2 + 1942118537 * class527.intStackPtr]) * 656180565;
		class118.anInt1434 = 265875707 * (class527.intStack[1942118537 * class527.intStackPtr + 3]);
		Class109.method1858(class118, (byte) 33);
	}

	static final void method6314(CS2Executor class527, short i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = 985215637 * class118.anInt1320;
	}

	static final void method6315(CS2Executor class527, byte i) {
		Class184 class184 = Class468_Sub20.method12807(-1148731547);
		TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4591, class184.isaac, 213013153);
		class282_sub23.buffer.writeByte(0);
		int i_1_ = -1990677291 * class282_sub23.buffer.index;
		class282_sub23.buffer.writeByte(0);
		class282_sub23.buffer.writeShort(-624100047 * class527.aClass346_7009.anInt4048, 1417031095);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(class282_sub23.buffer, class527.aClass346_7009.anIntArray4046, -1259900340);
		class282_sub23.buffer.method13061((class282_sub23.buffer.index * -1990677291 - i_1_), 1119414501);
		class184.method3049(class282_sub23, -95892997);
	}

	static final void method6316(CS2Executor class527, int i) {
		int i_2_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = -1903324139 * client.aClass330Array7428[i_2_].anInt3863;
	}

	static final void method6317(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (Class169.method2875(client.anInt7166 * -1741204137, -2059083211) ? 1 : 0);
	}

	static final void method6318(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, true, 2, class527, (byte) -20);
	}
}
