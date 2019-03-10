public class Class216 {

	static {
		Math.sqrt(131072.0D);
	}

	Class216() throws Throwable {
		throw new Error();
	}

	static void method3675(int i_0) {
		if (Class260.aClass116_3229 != null && !Class260.aClass116_3229.method1956(1097733979) && Class260.aClass116_3229.method1963(1418683997)) {
			TCPMessage tcpmessage_1 = Class271.method4828(OutgoingPacket.aClass379_4531, client.aClass184_7475.isaac, 920221723);
			tcpmessage_1.buffer.writeInt(Class260.aClass116_3229.anInt1254);
			client.aClass184_7475.method3049(tcpmessage_1, 17076661);
		}
	}

	static boolean method3677(int i_0) {
		return Class20.anInt169 > 0;
	}
}
