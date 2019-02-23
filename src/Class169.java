public class Class169 {

	public boolean aBool2056;
	public boolean aBool2059;
	public byte aByte2064;
	public boolean aBool2065;
	public boolean aBool2072;
	public short aShort2073;
	public int anInt2074;
	public byte aByte2076;
	public int anInt2077;
	public byte aByte2079;
	public byte aByte2080;
	public byte aByte2081;
	public boolean aBool2082;
	public boolean aBool2086;
	public boolean aBool2087;
	public byte aByte2088;
	public boolean aBool2089;
	public byte aByte2090;
	public int anInt2091;

	public static final synchronized long method2869(int i_0) {
		long long_1 = System.currentTimeMillis();
		if (long_1 < Class97.aLong993) {
			Class97.aLong994 += Class97.aLong993 - long_1;
		}

		Class97.aLong993 = long_1;
		return long_1 + Class97.aLong994;
	}

	static final void method2870(CS2Executor cs2executor_0, int i_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		TCPMessage tcpmessage_3 = Class271.method4828(OutgoingPacket.aClass379_4596, client.aClass184_7475.isaac, 1814841723);
		tcpmessage_3.buffer.writeByte(string_2.length() + 1);
		tcpmessage_3.buffer.writeString(string_2);
		client.aClass184_7475.method3049(tcpmessage_3, 426449473);
	}

	static final void method2871(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (client.anInt7434 == 2 && i_2 < client.anInt7449) {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = client.aClass6Array7452[i_2].aString40;
		} else {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = "";
		}

	}

	static final void method2872(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.anInt7416;
	}

	static final void method2873(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12728(-1912429644);
	}

	static final void method2874(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.objectStack[--cs2executor_2.anInt7000];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 69608151) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1319 = Class351.method6193(string_4, cs2executor_2, 1275110471);
		icomponentdefinitions_0.aBool1384 = true;
	}

	public static boolean method2875(int i_0, int i_1) {
		return i_0 == 13 || i_0 == 18 || i_0 == 12;
	}

	public static void method2876(NPC npc_0, int i_1) {
		for (Class282_Sub48 class282_sub48_2 = (Class282_Sub48) Class282_Sub48.aClass482_8074.head((byte) 123); class282_sub48_2 != null; class282_sub48_2 = (Class282_Sub48) Class282_Sub48.aClass482_8074.next(1114732326)) {
			if (class282_sub48_2.aClass521_Sub1_Sub1_Sub2_Sub2_8085 == npc_0) {
				if (class282_sub48_2.aClass282_Sub15_Sub5_8099 != null) {
					Class79.aClass282_Sub15_Sub4_783.method15276(class282_sub48_2.aClass282_Sub15_Sub5_8099);
					class282_sub48_2.aClass282_Sub15_Sub5_8099 = null;
				}

				class282_sub48_2.remove();
				break;
			}
		}

	}

	public static void method2877(Interface45 interface45_0, byte b_1) {
		if (IcmpService_Sub1.anIcmpService_Sub1_7964 == null) {
			throw new IllegalStateException("");
		} else {
			IcmpService_Sub1.anIcmpService_Sub1_7964.aList7962.add(interface45_0);
		}
	}

}
