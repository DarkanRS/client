package com.rs.jagex;

public class Class533 {

	static JS5CacheFile aClass203_7073;

	static void method11404(String string_0, String string_1, String string_2, boolean bool_3, boolean bool_4) {
		BufferedConnectionContext class184_6 = BufferedConnectionContext.getConnectionContext();
		if (class184_6.getConnection() != null) {
			TCPPacket tcpmessage_7 = TCPPacket.createPacket(ClientProt.LOBBY_HYPERLINK, class184_6.outKeys);
			tcpmessage_7.buffer.writeShort(ChatLine.getLength(string_0) + ChatLine.getLength(string_1) + ChatLine.getLength(string_2) + 1);
			tcpmessage_7.buffer.writeString(string_0);
			tcpmessage_7.buffer.writeString(string_1);
			tcpmessage_7.buffer.writeString(string_2);
			int i_8 = 0;
			if (bool_3)
				i_8 |= 0x1;
			if (bool_4)
				i_8 |= 0x2;
			tcpmessage_7.buffer.writeByte(i_8);
			class184_6.queuePacket(tcpmessage_7);
		}
	}

	Class533() throws Throwable {
		throw new Error();
	}
}
