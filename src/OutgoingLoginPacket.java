public class OutgoingLoginPacket {

	public static int anInt4280;
	public static OutgoingLoginPacket INIT_GAME_CONNECTION = new OutgoingLoginPacket(14, 0);
	public static OutgoingLoginPacket INIT_JS5REMOTE_CONNECTION = new OutgoingLoginPacket(15, -1);
	public static OutgoingLoginPacket GAMELOGIN = new OutgoingLoginPacket(16, -2);
	public static OutgoingLoginPacket LOBBYLOGIN = new OutgoingLoginPacket(19, -2);
	static OutgoingLoginPacket REQUEST_WORLDLIST = new OutgoingLoginPacket(23, 4);
	static OutgoingLoginPacket CHECK_WORLD_SUITABILITY = new OutgoingLoginPacket(24, -1);
	public static OutgoingLoginPacket GAMELOGIN_CONTINUE = new OutgoingLoginPacket(26, 0);
	static OutgoingLoginPacket SSL_WEBCONNECTION = new OutgoingLoginPacket(27, 0);
	public static OutgoingLoginPacket CREATE_ACCOUNT_CONNECT = new OutgoingLoginPacket(28, -2);
	public static OutgoingLoginPacket INIT_SOCIAL_NETWORK_CONNECTION = new OutgoingLoginPacket(29, -2);
	public static OutgoingLoginPacket SOCIAL_NETWORK_LOGIN = new OutgoingLoginPacket(30, -2);
	static OutgoingLoginPacket[] OUTGOING_LOGIN_PACKETS = new OutgoingLoginPacket[32];
	public int id;

	static {
		OutgoingLoginPacket[] arr_0 = Class345.getOutgoingLoginPackets();

		for (int i_1 = 0; i_1 < arr_0.length; i_1++) {
			OUTGOING_LOGIN_PACKETS[arr_0[i_1].id] = arr_0[i_1];
		}

	}

	OutgoingLoginPacket(int i_1, int i_2) {
		this.id = i_1;
	}

	static final void method6313(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 4;
		icomponentdefinitions_0.anInt1404 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1432 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		icomponentdefinitions_0.anInt1433 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		icomponentdefinitions_0.anInt1434 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3];
		Class109.method1858(icomponentdefinitions_0, (byte) 33);
	}

	static final void method6314(CS2Executor cs2executor_0, short s_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1320;
	}

	static final void method6315(CS2Executor cs2executor_0, byte b_1) {
		Class184 class184_2 = Class468_Sub20.method12807(-1148731547);
		TCPMessage tcpmessage_3 = Class271.method4828(OutgoingPacket.aClass379_4591, class184_2.isaac, 213013153);
		tcpmessage_3.buffer.writeByte(0);
		int i_4 = tcpmessage_3.buffer.index;
		tcpmessage_3.buffer.writeByte(0);
		tcpmessage_3.buffer.writeShort(cs2executor_0.aClass346_7009.anInt4048, 1417031095);
		cs2executor_0.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(tcpmessage_3.buffer, cs2executor_0.aClass346_7009.anIntArray4046, -1259900340);
		tcpmessage_3.buffer.method13061(tcpmessage_3.buffer.index - i_4, 1119414501);
		class184_2.method3049(tcpmessage_3, -95892997);
	}

	static final void method6316(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.aClass330Array7428[i_2].anInt3863;
	}

	static final void method6317(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class169.method2875(client.gameState, -2059083211) ? 1 : 0;
	}

	static final void method6318(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class96_Sub18.method14664(icomponentdefinitions_3, interface_4, true, 2, cs2executor_0, (byte) -20);
	}

}
