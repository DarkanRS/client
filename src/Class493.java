public class Class493 {

	Class493() throws Throwable {
		throw new Error();
	}

	public static void sendCheckEmailPacket(String string_0) {
		if (client.gameState == 3) {
			TCPMessage tcpmessage_2 = Class271.method4828(OutgoingPacket.aClass379_4570, client.aClass184_7218.isaac, 302264892);
			tcpmessage_2.buffer.writeShort(0);
			int i_3 = tcpmessage_2.buffer.index;
			tcpmessage_2.buffer.writeString(string_0);
			tcpmessage_2.buffer.index += 7;
			tcpmessage_2.buffer.encryptWithXtea(Class14.LOGIN_XTEAS, i_3, tcpmessage_2.buffer.index, 1836980481);
			tcpmessage_2.buffer.method13281(tcpmessage_2.buffer.index - i_3);
			client.aClass184_7218.method3049(tcpmessage_2, -349048671);
			Class404.aClass466_4831 = Class466.aClass466_5564;
		}

	}

}
