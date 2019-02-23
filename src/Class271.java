import java.io.File;
import java.util.Hashtable;

public class Class271 {

	static File aFile3327;
	static int anInt3330;
	static boolean aBool3328 = false;
	static Hashtable aHashtable3329 = new Hashtable(16);

	Class271() throws Throwable {
		throw new Error();
	}

	public static String method4824(byte[] bytes_0, int i_1, int i_2, int i_3) {
		char[] arr_4 = new char[i_2];
		int i_5 = 0;
		int i_6 = i_1;

		int i_9;
		for (int i_7 = i_2 + i_1; i_6 < i_7; arr_4[i_5++] = (char) i_9) {
			int i_8 = bytes_0[i_6++] & 0xff;
			if (i_8 < 128) {
				if (i_8 == 0) {
					i_9 = 65533;
				} else {
					i_9 = i_8;
				}
			} else if (i_8 < 192) {
				i_9 = 65533;
			} else if (i_8 < 224) {
				if (i_6 < i_7 && (bytes_0[i_6] & 0xc0) == 128) {
					i_9 = (i_8 & 0x1f) << 6 | bytes_0[i_6++] & 0x3f;
					if (i_9 < 128) {
						i_9 = 65533;
					}
				} else {
					i_9 = 65533;
				}
			} else if (i_8 < 240) {
				if (i_6 + 1 < i_7 && (bytes_0[i_6] & 0xc0) == 128 && (bytes_0[i_6 + 1] & 0xc0) == 128) {
					i_9 = (i_8 & 0xf) << 12 | (bytes_0[i_6++] & 0x3f) << 6 | bytes_0[i_6++] & 0x3f;
					if (i_9 < 2048) {
						i_9 = 65533;
					}
				} else {
					i_9 = 65533;
				}
			} else if (i_8 < 248) {
				if (i_6 + 2 < i_7 && (bytes_0[i_6] & 0xc0) == 128 && (bytes_0[i_6 + 1] & 0xc0) == 128 && (bytes_0[i_6 + 2] & 0xc0) == 128) {
					i_9 = (i_8 & 0x7) << 18 | (bytes_0[i_6++] & 0x3f) << 12 | (bytes_0[i_6++] & 0x3f) << 6 | bytes_0[i_6++] & 0x3f;
					if (i_9 >= 65536 && i_9 <= 1114111) {
						i_9 = 65533;
					} else {
						i_9 = 65533;
					}
				} else {
					i_9 = 65533;
				}
			} else {
				i_9 = 65533;
			}
		}

		return new String(arr_4, 0, i_5);
	}

	static final void method4825(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = SpotAnimIndexLoader.method8861(i_2, i_3, true, 113694446);
	}

	static final void method4826(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class9.anInt112;
	}

	static void method4827(Index index_0, int i_1, int i_2, int i_3, boolean bool_4, long long_5) {
		Class109.method1859(index_0, i_1, i_2, i_3, bool_4, long_5, 0, 2065437582);
	}

	public static TCPMessage method4828(OutgoingPacket outgoingpacket_0, IsaacCipher isaaccipher_1, int i_2) {
		TCPMessage tcpmessage_3 = Class158_Sub2.method14356((short) 2048);
		tcpmessage_3.packet = outgoingpacket_0;
		tcpmessage_3.anInt7678 = outgoingpacket_0.anInt4632;
		if (tcpmessage_3.anInt7678 == -1) {
			tcpmessage_3.buffer = new RsBitsBuffer(260);
		} else if (tcpmessage_3.anInt7678 == -2) {
			tcpmessage_3.buffer = new RsBitsBuffer(10000);
		} else if (tcpmessage_3.anInt7678 <= 18) {
			tcpmessage_3.buffer = new RsBitsBuffer(20);
		} else if (tcpmessage_3.anInt7678 <= 98) {
			tcpmessage_3.buffer = new RsBitsBuffer(100);
		} else {
			tcpmessage_3.buffer = new RsBitsBuffer(260);
		}

		tcpmessage_3.buffer.setIsaacCipher(isaaccipher_1, 351906319);
		tcpmessage_3.buffer.writeIsaacByte(tcpmessage_3.packet.anInt4631, 328020366);
		tcpmessage_3.anInt7680 = 0;
		return tcpmessage_3;
	}

	static final void method4829(CS2Executor cs2executor_0, short s_1) {
		if (client.anInt7434 == 0) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.anInt7373;
		}

	}

	static final void method4830(CS2Executor cs2executor_0, int i_1) {
		IComponentDefinitions icomponentdefinitions_2 = cs2executor_0.animable.inter.method1618(cs2executor_0.intStack[--cs2executor_0.intStackPtr], (byte) 12);
		icomponentdefinitions_2.aClass118Array1438 = null;
		icomponentdefinitions_2.aClass118Array1439 = null;
		Class109.method1858(icomponentdefinitions_2, (byte) -73);
	}

}
