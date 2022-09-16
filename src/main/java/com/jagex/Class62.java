package com.jagex;

import java.util.LinkedList;

public class Class62 implements Interface3 {

	static void method1260(int i_0, boolean bool_1) {
		if (bool_1) {
			TCPPacket tcpmessage_3 = TCPPacket.createPacket(ClientProt.UNK_37, client.GAME_CONNECTION_CONTEXT.outKeys);
			tcpmessage_3.buffer.writeShort(i_0);
			client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
		} else
			ScriptRunner.executeTrigger(ClientTriggerType.aClass397_4800, i_0, -1);
	}

	public static void method1261(Index index_0) {
		Class235.anInt2902 = 0;
		Class235.anInt2905 = 0;
		Class235.aList2896 = new LinkedList<>();
		Class235.aEntityNode_Sub1_Sub1_Sub1Array2897 = new Particle[1024];
		Queue.aClass539Array5632 = new ParticleSystem[Class89.anIntArray931[Class235.anInt2906] + 1];
		Class235.anInt2899 = 0;
		Class235.anInt2901 = 0;
		MaterialProp23.setParticleIndex(index_0);
		Class111.method1866(index_0);
	}

	public static boolean setGameHost(int i_0, String string_1) {
		ConnectionInfo.GAME_CONNECTION_INFO = new ConnectionInfo();
		ConnectionInfo.GAME_CONNECTION_INFO.worldId = i_0;
		ConnectionInfo.GAME_CONNECTION_INFO.host = string_1;
		if (ConnectionInfo.SERVER_ENVIRONMENT != ServerEnvironment.LIVE) {
			ConnectionInfo.GAME_CONNECTION_INFO.anInt5434 = ConnectionInfo.GAME_CONNECTION_INFO.worldId;
			ConnectionInfo.GAME_CONNECTION_INFO.anInt5437 = ConnectionInfo.GAME_CONNECTION_INFO.worldId;
		}
		return true;
	}

	public String aString649;

	public Class356 aClass356_650;

	public Class353 aClass353_654;

	public int anInt651;

	public int anInt655;

	public int anInt653;

	public int anInt656;

	public int anInt657;

	public int anInt652;

	public int anInt648;

	public int anInt658;

	public int anInt659;

	public int anInt660;

	Class62(String string_1, Class356 class356_2, Class353 class353_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13) {
		aString649 = string_1;
		aClass356_650 = class356_2;
		aClass353_654 = class353_3;
		anInt651 = i_4;
		anInt655 = i_5;
		anInt653 = i_6;
		anInt656 = i_7;
		anInt657 = i_8;
		anInt652 = i_9;
		anInt648 = i_10;
		anInt658 = i_11;
		anInt659 = i_12;
		anInt660 = i_13;
	}

	@Override
	public Class60 method24() {
		return Class60.aClass60_604;
	}

	@Override
	public Class60 method25() {
		return Class60.aClass60_604;
	}
}
