public class Class245 {

	static NativeSprite[] aClass160Array3027;

	Class245() throws Throwable {
		throw new Error();
	}

	static final void method4197(CS2Executor cs2executor_0) {
		String string_2 = (String) cs2executor_0.stringStack[--cs2executor_0.stringStackPtr];
		TCPMessage tcpmessage_3 = Class271.method4828(OutgoingPacket.aClass379_4614, client.aClass184_7475.isaac, 1498065982);
		tcpmessage_3.buffer.writeByte(string_2.length() + 1);
		tcpmessage_3.buffer.writeString(string_2);
		client.aClass184_7475.method3049(tcpmessage_3, 934266754);
	}

	static boolean method4198(int i_0, int i_1) {
		return i_0 == 5 || i_0 == 14 || i_0 == 19 || i_0 == 3 || i_0 == 8 || i_0 == 9;
	}

}
