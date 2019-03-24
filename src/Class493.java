

public class Class493 {

	Class493() throws Throwable {
		throw new Error();
	}

	public static void sendCheckEmailPacket(String string_0) {
		if (client.gameState == 3) {
			TCPPacket message = Class271.method4828(OutgoingPacket.aClass379_4570, client.connectionContext.isaac, 302264892);
			message.buffer.writeShort(0);
			int start = message.buffer.index;
			message.buffer.writeString(string_0);
			message.buffer.index += 7;
			message.buffer.encryptWithXtea(Class14.LOGIN_XTEAS, start, message.buffer.index);
			message.buffer.method13281(message.buffer.index - start);
			client.connectionContext.queuePacket(message);
			Class404.aClass466_4831 = Class466.aClass466_5564;
		}

	}

}
