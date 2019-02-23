public class Class11 {

	static Class109 aClass109_121;
	public static int anInt122;
	static int anInt123;
	public static SystemInfo SYSTEM_INFO;

	Class11() throws Throwable {
		throw new Error();
	}

	static void method466(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[cs2executor_0.intStackPtr - 1] = IndexLoaders.aClass242_4922.method4156(cs2executor_0.intStack[cs2executor_0.intStackPtr - 1], -1396181317).method4101(Class158_Sub1.aClass3_8507, (byte) -15) ? 1 : 0;
	}

	static final void method467(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.anInt7001 -= 2;
		if (cs2executor_0.aLongArray7003[cs2executor_0.anInt7001] < cs2executor_0.aLongArray7003[cs2executor_0.anInt7001 + 1]) {
			cs2executor_0.instrPtr += cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		}

	}

	static final void method468(CS2Executor cs2executor_0, int i_1) {
		Class184 class184_2 = Class468_Sub20.method12807(461566707);
		TCPMessage tcpmessage_3 = Class271.method4828(OutgoingPacket.aClass379_4591, class184_2.isaac, 1283884802);
		tcpmessage_3.buffer.writeByte(0);
		int i_4 = tcpmessage_3.buffer.index;
		tcpmessage_3.buffer.writeByte(2);
		tcpmessage_3.buffer.writeShort(cs2executor_0.aClass346_7009.anInt4048, 1417031095);
		cs2executor_0.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(tcpmessage_3.buffer, cs2executor_0.aClass346_7009.anIntArray4046, -463581846);
		tcpmessage_3.buffer.method13061(tcpmessage_3.buffer.index - i_4, -76404824);
		class184_2.method3049(tcpmessage_3, -206649129);
	}

	public static final void method469(int i_0, int i_1, int i_2, int i_3, int i_4, byte b_5) {
		Class96_Sub13.anInt9368 = i_0;
		OutgoingLoginPacket.anInt4280 = i_1;
		Class121.anInt1527 = i_2;
		LinkedNodeList.anInt5606 = i_3;
		Class501.anInt5828 = i_4;
		if (Class501.anInt5828 >= 100) {
			int i_6 = Class96_Sub13.anInt9368 * 512 + 256;
			int i_7 = OutgoingLoginPacket.anInt4280 * 512 + 256;
			int i_8 = Class504.method8389(i_6, i_7, Class4.anInt35, (byte) 25) - Class121.anInt1527;
			int i_9 = i_6 - Class31.anInt361;
			int i_10 = i_8 - Class109_Sub1.anInt9384;
			int i_11 = i_7 - Class246.anInt3029;
			int i_12 = (int) Math.sqrt((double) (i_9 * i_9 + i_11 * i_11));
			Class293.anInt3512 = (int) (Math.atan2((double) i_10, (double) i_12) * 2607.5945876176133D) & 0x3fff;
			AnimationDefinitions.anInt5930 = (int) (Math.atan2((double) i_9, (double) i_11) * -2607.5945876176133D) & 0x3fff;
			Class121.anInt1525 = 0;
			if (Class293.anInt3512 < 1024) {
				Class293.anInt3512 = 1024;
			}

			if (Class293.anInt3512 > 3072) {
				Class293.anInt3512 = 3072;
			}
		}

		NativeLibraryLoader.anInt3240 = 5;
		Class86.anInt833 = -1;
		Class508.anInt5864 = -1;
	}

	public static char getChar(byte b_0, int i_1) {
		int i_2 = b_0 & 0xff;
		if (i_2 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(i_2, 16));
		} else {
			if (i_2 >= 128 && i_2 < 160) {
				char var_3 = Class490.aCharArray5766[i_2 - 128];
				if (var_3 == 0) {
					var_3 = 63;
				}

				i_2 = var_3;
			}

			return (char) i_2;
		}
	}

	static final void method471(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[cs2executor_0.intStackPtr - 1] = cs2executor_0.aClass282_Sub4_7011.method12095(837376369)[cs2executor_0.intStack[cs2executor_0.intStackPtr - 1]];
	}

	public static void method13400(Index index_0, int i_1, int i_2, int i_3, boolean bool_4, byte b_5) {
		Class271.method4827(index_0, i_1, i_2, i_3, bool_4, 0L);
	}

}
