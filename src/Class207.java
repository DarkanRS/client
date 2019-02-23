public class Class207 {

	int anInt2653 = -1;
	int anInt2654 = -1;
	Class204 aClass204_2656;
	int anInt2657;
	int[] anIntArray2655;

	void method3549(RsByteBuffer rsbytebuffer_1, int i_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method3552(rsbytebuffer_1, i_3, (byte) 127);
		}
	}

	Class207() {
		this.aClass204_2656 = Class204.aClass204_2579;
		this.anInt2657 = -1;
	}

	void method3552(RsByteBuffer rsbytebuffer_1, int i_2, byte b_3) {
		if (i_2 == 1) {
			this.anInt2653 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 2) {
			this.anIntArray2655 = new int[rsbytebuffer_1.readUnsignedByte()];

			for (int i_4 = 0; i_4 < this.anIntArray2655.length; i_4++) {
				this.anIntArray2655[i_4] = rsbytebuffer_1.readUnsignedShort();
			}
		} else if (i_2 == 3) {
			this.anInt2654 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 4) {
			this.aClass204_2656 = (Class204) Class386.method6672(Class530.method11353(-430210137), rsbytebuffer_1.readUnsignedByte(), -1538541275);
		} else if (i_2 == 5) {
			this.anInt2657 = rsbytebuffer_1.readBigSmart();
		}

	}

	static void method3553(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = IndexLoaders.aClass242_4922.method4156(cs2executor_0.intStack[cs2executor_0.intStackPtr - 2], -1396181317).aStringArray2971[cs2executor_0.intStack[cs2executor_0.intStackPtr - 1]];
		cs2executor_0.intStackPtr -= 2;
	}

	static final void method3554(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 71);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Defaults7Loader.method8754(icomponentdefinitions_3, interface_4, cs2executor_0, 1449946769);
	}

	static final void method3555(CS2Executor cs2executor_0, int i_1) {
		Class42.method890(cs2executor_0.intStack[--cs2executor_0.intStackPtr], 255, 50, (byte) 39);
	}

	static final void method3556(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		Class282_Sub50_Sub6 class282_sub50_sub6_3 = Class125.method2173(1333145388);
		if (class282_sub50_sub6_3 != null) {
			boolean bool_4 = class282_sub50_sub6_3.method14778(i_2 >> 28 & 0x3, i_2 >> 14 & 0x3fff, i_2 & 0x3fff, CS2Runner.anIntArray5900, -1889413502);
			if (bool_4) {
				Class8_Sub2.method14263(CS2Runner.anIntArray5900[1], CS2Runner.anIntArray5900[2], (byte) 0);
			}
		}

	}

	static final void method3557(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (Class291_Sub1.aClass465_8025 != null) {
			Node node_3 = Class291_Sub1.aClass465_8025.method7754((long) i_2);
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = node_3 != null ? 1 : 0;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

	public static TCPMessage method3558(byte b_0) {
		TCPMessage tcpmessage_1 = Class158_Sub2.method14356((short) 2048);
		tcpmessage_1.packet = null;
		tcpmessage_1.anInt7678 = 0;
		tcpmessage_1.buffer = new RsBitsBuffer(5000);
		return tcpmessage_1;
	}

}
