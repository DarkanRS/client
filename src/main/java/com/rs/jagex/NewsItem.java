package com.rs.jagex;

public class NewsItem {

	static int anInt1069;

	static void method1804(int i_0, String string_1, String string_2) {
		if (client.GAME_CONNECTION_CONTEXT != null) {
			TCPPacket tcpmessage_4 = TCPPacket.createPacket(ClientProt.BUG_REPORT, client.GAME_CONNECTION_CONTEXT.outKeys);
			tcpmessage_4.buffer.writeShort(1 + Utils.stringLengthPlus2(string_1) + Utils.stringLengthPlus2(string_2));
			tcpmessage_4.buffer.writeByte(i_0);
			tcpmessage_4.buffer.writeJagString(string_2);
			tcpmessage_4.buffer.writeJagString(string_1);
			client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_4);
		}
	}

	public static void method1805(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (i_0 >= Class532.anInt7071 && i_1 <= Class532.anInt7069 && i_2 >= Class532.anInt7070 && i_3 <= Class532.anInt7068) {
			if (i_5 == 1)
				Class48_Sub2.method14572(i_0, i_1, i_2, i_3, i_4);
			else
				MapRegion.method4561(i_0, i_1, i_2, i_3, i_4, i_5);
		} else if (i_5 == 1)
			Class78.method1388(i_0, i_1, i_2, i_3, i_4);
		else
			Class20.method744(i_0, i_1, i_2, i_3, i_4, i_5);
	}

	String aString1067;

	String aString1066;

	String aString1068;

	NewsItem(String string_1, String string_2, String string_3) {
		aString1067 = string_1;
		aString1066 = string_2;
		aString1068 = string_3;
	}
}
