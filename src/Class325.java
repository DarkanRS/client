import java.awt.Component;

public class Class325 {

	Class325() throws Throwable {
		throw new Error();
	}

	static final void method5786(CS2Executor cs2executor_0, int i_1) {
		String string_2 = (String) cs2executor_0.stringStack[--cs2executor_0.stringStackPtr];
		TCPMessage tcpmessage_3 = Class271.method4828(OutgoingPacket.aClass379_4607, client.aClass184_7475.isaac, 1863419528);
		tcpmessage_3.buffer.writeByte(string_2.length() + 1);
		tcpmessage_3.buffer.writeString(string_2);
		client.aClass184_7475.method3049(tcpmessage_3, -495344290);
	}

	public static Class199 method5787(Component component_0, int i_1) {
		return new Class199_Sub1(component_0);
	}

	static final void method5788(CS2Executor cs2executor_0, int i_1) {
		Class282_Sub36 class282_sub36_2 = Class312_Sub1.method12538((byte) -105);
		if (class282_sub36_2 == null) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = class282_sub36_2.anInt7991;
			int i_3 = class282_sub36_2.anInt7988 << 28 | class282_sub36_2.anInt7987 + Class291.anInt3472 << 14 | class282_sub36_2.anInt7993 + Class291.anInt3473;
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_3;
		}

	}

	static boolean method5789(int i_0, int i_1) {
		return i_0 == 0 || i_0 == 7;
	}

	public static boolean method5790(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		return i_0 < i_4 + i_6 && i_4 < i_0 + i_2 ? i_1 < i_5 + i_7 && i_5 < i_3 + i_1 : false;
	}

}
