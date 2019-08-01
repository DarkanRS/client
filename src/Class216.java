public class Class216 {

	static {
		Math.sqrt(131072.0D);
	}

	Class216() throws Throwable {
		throw new Error();
	}

	static void method3675() {
		if (Class260.aClass116_3229 != null && !Class260.aClass116_3229.method1956(1097733979) && Class260.aClass116_3229.method1963()) {
			TCPPacket tcpmessage_1 = Class271.createPacket(ClientPacket.UNK_18, client.GAME_CONNECTION_CONTEXT.isaac);
			tcpmessage_1.buffer.writeInt(Class260.aClass116_3229.anInt1254);
			client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_1);
		}
	}

	static boolean method3677(int i_0) {
		return Class20.anInt169 > 0;
	}
}
