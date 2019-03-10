public class Class89 {

	public static int[] anIntArray931 = new int[] { 3, 7, 15 };
	public static int[] anIntArray934 = new int[] { 2047, 16383, 65535 };

	Class89() throws Throwable {
		throw new Error();
	}

	static void method1496(byte[] bytes_0, int i_1) {
		RsByteBuffer rsbytebuffer_2 = new RsByteBuffer(bytes_0);

		while (true) {
			int i_3 = rsbytebuffer_2.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			if (i_3 == 1) {
				int i_4 = rsbytebuffer_2.readUnsignedShort();
				if (Class260.anInt3228 == -1) {
					Class260.anInt3228 = i_4;
				}
			}
		}
	}

	static final void method1497(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class172.method2915(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 0);
	}

	static final void method1498(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1334;
	}

	static final void method1499(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = (int) (Class116.aLong1259 / 60000L);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = (int) ((Class116.aLong1259 - Class169.time() - Class43.aLong420) / 60000L);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class509.aBool5870 ? 1 : 0;
	}

	static final void method1500(CS2Executor cs2executor_0, int i_1) {
		String string_2 = (String) cs2executor_0.stringStack[--cs2executor_0.stringStackPtr];
		Class152.method2603(string_2, -671341252);
	}

	static final void method1501(CS2Executor cs2executor_0, byte b_1) {
		if (Class202_Sub1.aClass282_Sub4_8186 != null) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 1;
			cs2executor_0.aClass282_Sub4_7011 = Class202_Sub1.aClass282_Sub4_8186;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

	static void method1502(int i_0) {
		if (Class427.anInt5123 < 0) {
			Class427.anInt5123 = 0;
			Class291_Sub1.anInt8014 = -1;
			Class291_Sub1.anInt8016 = -1;
		}

		if (Class427.anInt5123 > Class291_Sub1.xLength) {
			Class427.anInt5123 = Class291_Sub1.xLength;
			Class291_Sub1.anInt8014 = -1;
			Class291_Sub1.anInt8016 = -1;
		}

		if (Class475.anInt5624 < 0) {
			Class475.anInt5624 = 0;
			Class291_Sub1.anInt8014 = -1;
			Class291_Sub1.anInt8016 = -1;
		}

		if (Class475.anInt5624 > Class291_Sub1.yLength) {
			Class475.anInt5624 = Class291_Sub1.yLength;
			Class291_Sub1.anInt8014 = -1;
			Class291_Sub1.anInt8016 = -1;
		}

	}

	static void method1503(int i_0, int i_1) {
		Class427.anInt5123 = i_0;
		Class291_Sub1.anInt8014 = -1;
		Class291_Sub1.anInt8016 = -1;
		method1502(-1202375965);
	}

	public static final void sleep(long long_0) {
		if (long_0 > 0L) {
			if (long_0 % 10L == 0L) {
				Class350_Sub3_Sub1.method15560(long_0 - 1L);
				Class350_Sub3_Sub1.method15560(1L);
			} else {
				Class350_Sub3_Sub1.method15560(long_0);
			}
		}

	}

}
