import java.awt.Canvas;

public class Class351 implements Interface3 {

	public static Canvas gameCanvas;
	public static int anInt4097;
	public int anInt4095;

	public Class60 method25() {
		return Class60.aClass60_601;
	}

	Class351(int i_1) {
		this.anInt4095 = i_1;
	}

	public Class60 method24(int i_1) {
		return Class60.aClass60_601;
	}

	static final Object[] method6193(String string_0, CS2Executor cs2executor_1, int i_2) {
		Object[] arr_3 = new Object[string_0.length() + 1];

		int i_4;
		for (i_4 = arr_3.length - 1; i_4 >= 1; --i_4) {
			if (string_0.charAt(i_4 - 1) == 115) {
				arr_3[i_4] = cs2executor_1.objectStack[--cs2executor_1.anInt7000];
			} else if (string_0.charAt(i_4 - 1) == 167) {
				arr_3[i_4] = new Long(cs2executor_1.aLongArray7003[--cs2executor_1.anInt7001]);
			} else {
				arr_3[i_4] = new Integer(cs2executor_1.intStack[--cs2executor_1.intStackPtr]);
			}
		}

		i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		if (i_4 != -1) {
			arr_3[0] = new Integer(i_4);
		} else {
			arr_3 = null;
		}

		return arr_3;
	}

	static final void method6194(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		String string_3 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		Class119.method2075(i_2, string_3, (byte) 3);
	}

	static final void method6195(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub4_8223.method12641(-1731892952);
	}

	public static final void method6196(Class282_Sub44 class282_sub44_0, boolean bool_1, boolean bool_2, int i_3) {
		int i_4 = class282_sub44_0.anInt8063;
		int i_5 = (int) class282_sub44_0.data;
		class282_sub44_0.remove();
		if (bool_1) {
			Class337.unloadInterface(i_4, -775991491);
		}

		Class109_Sub1.method14650(i_4, 185452428);
		IComponentDefinitions icomponentdefinitions_6 = Class117.method1981(i_5, (byte) 49);
		if (icomponentdefinitions_6 != null) {
			Class109.method1858(icomponentdefinitions_6, (byte) -15);
		}

		OutputStream_Sub1.method12938((byte) 7);
		if (!bool_2 && client.anInt7349 != -1) {
			Class383.method6514(client.anInt7349, 1, 772605854);
		}

		Class451 class451_7 = new Class451(client.aClass465_7442);

		for (Class282_Sub44 class282_sub44_8 = (Class282_Sub44) class451_7.method7503(2066696054); class282_sub44_8 != null; class282_sub44_8 = (Class282_Sub44) class451_7.next()) {
			if (!class282_sub44_8.method4994(1418797057)) {
				class282_sub44_8 = (Class282_Sub44) class451_7.method7503(1554887126);
				if (class282_sub44_8 == null) {
					break;
				}
			}

			if (class282_sub44_8.anInt8062 == 3) {
				int i_9 = (int) class282_sub44_8.data;
				if (i_9 >>> 16 == i_4) {
					method6196(class282_sub44_8, true, bool_2, -1676599874);
				}
			}
		}

	}

	public static synchronized void method6197(byte[] bytes_0, int i_1) {
		if (bytes_0.length == 100 && CircularBuffer.anInt5768 < 1000) {
			CircularBuffer.aByteArrayArray5767[++CircularBuffer.anInt5768 - 1] = bytes_0;
		} else if (bytes_0.length == 5000 && CircularBuffer.anInt5769 < 250) {
			CircularBuffer.aByteArrayArray5771[++CircularBuffer.anInt5769 - 1] = bytes_0;
		} else if (bytes_0.length == 30000 && CircularBuffer.anInt5772 < 50) {
			CircularBuffer.aByteArrayArray5770[++CircularBuffer.anInt5772 - 1] = bytes_0;
		} else if (IcmpService_Sub1.aByteArrayArrayArray7963 != null) {
			for (int i_2 = 0; i_2 < CircularBuffer.anIntArray5773.length; i_2++) {
				if (bytes_0.length == CircularBuffer.anIntArray5773[i_2] && Class412.anIntArray4962[i_2] < IcmpService_Sub1.aByteArrayArrayArray7963[i_2].length) {
					IcmpService_Sub1.aByteArrayArrayArray7963[i_2][Class412.anIntArray4962[i_2]++] = bytes_0;
					break;
				}
			}
		}

	}

}
