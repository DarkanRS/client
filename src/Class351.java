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
				arr_3[i_4] = cs2executor_1.stringStack[--cs2executor_1.stringStackPtr];
			} else if (string_0.charAt(i_4 - 1) == 167) {
				arr_3[i_4] = new Long(cs2executor_1.longStack[--cs2executor_1.longStackPtr]);
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

	public static final void closeChildren(Class282_Sub44 parentInterface, boolean unload, boolean bool_2, int i_3) {
		int i_4 = parentInterface.anInt8063;
		int interfaceHash = (int) parentInterface.data;
		parentInterface.remove();
		if (unload) {
			Class337.unloadInterface(i_4, -775991491);
		}
		Class109_Sub1.method14650(i_4, 185452428);
		IComponentDefinitions component = Class117.getInterfaceComponent(interfaceHash);
		if (component != null) {
			Class109.redrawComponent(component, (byte) -15);
		}
		OutputStream_Sub1.method12938((byte) 7);
		if (!bool_2 && client.anInt7349 != -1) {
			Class383.method6514(client.anInt7349, 1, 772605854);
		}
		HashTableIterator itr = new HashTableIterator(client.aClass465_7442);
		for (Class282_Sub44 class282_sub44_8 = (Class282_Sub44) itr.first(); class282_sub44_8 != null; class282_sub44_8 = (Class282_Sub44) itr.next()) {
			if (!class282_sub44_8.isLinked()) {
				class282_sub44_8 = (Class282_Sub44) itr.first();
				if (class282_sub44_8 == null) {
					break;
				}
			}
			if (class282_sub44_8.anInt8062 == 3) {
				int i_9 = (int) class282_sub44_8.data;
				if (i_9 >>> 16 == i_4) {
					closeChildren(class282_sub44_8, true, bool_2, -1676599874);
				}
			}
		}
	}

	public static synchronized void method6197(byte[] data, int i_1) {
		if (data.length == 100 && CircularBuffer.anInt5768 < 1000) {
			CircularBuffer.aByteArrayArray5767[++CircularBuffer.anInt5768 - 1] = data;
		} else if (data.length == 5000 && CircularBuffer.anInt5769 < 250) {
			CircularBuffer.aByteArrayArray5771[++CircularBuffer.anInt5769 - 1] = data;
		} else if (data.length == 30000 && CircularBuffer.anInt5772 < 50) {
			CircularBuffer.aByteArrayArray5770[++CircularBuffer.anInt5772 - 1] = data;
		} else if (IcmpService_Sub1.aByteArrayArrayArray7963 != null) {
			for (int i_2 = 0; i_2 < CircularBuffer.anIntArray5773.length; i_2++) {
				if (data.length == CircularBuffer.anIntArray5773[i_2] && Class412.anIntArray4962[i_2] < IcmpService_Sub1.aByteArrayArrayArray7963[i_2].length) {
					IcmpService_Sub1.aByteArrayArrayArray7963[i_2][Class412.anIntArray4962[i_2]++] = data;
					break;
				}
			}
		}
	}
}
