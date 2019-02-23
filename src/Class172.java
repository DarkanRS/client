public class Class172 {

	public int anInt2113;
	public Class172 aClass172_2114;
	public Matrix44Arr aClass384_2116;
	public int anInt2117;
	public int anInt2118;
	public int anInt2115;
	public int anInt2119;

	Class172(int i_1, int i_2) {
		this.anInt2115 = i_1;
		this.anInt2119 = i_2;
	}

	Class172 method2911(int i_1, int i_2) {
		return new Class172(this.anInt2115, i_1);
	}

	public Class345 method2913(int i_1) {
		return Class423.method7065(this.anInt2115, -1229346850);
	}

	static final void method2914(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		Class282_Sub44 class282_sub44_3 = (Class282_Sub44) client.aClass465_7442.method7754((long) i_2);
		if (class282_sub44_3 != null) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 1;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

	static final void method2915(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.anInt1324 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.method1858(icomponentdefinitions_0, (byte) 15);
	}

	static final void method2916(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		Class282_Sub50_Sub6 class282_sub50_sub6_3 = Class125.method2173(2115091118);
		if (class282_sub50_sub6_3 != null) {
			boolean bool_4 = class282_sub50_sub6_3.method14778(i_2 >> 28 & 0x3, i_2 >> 14 & 0x3fff, i_2 & 0x3fff, CS2Runner.anIntArray5900, -1837274243);
			if (bool_4) {
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = CS2Runner.anIntArray5900[1];
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = CS2Runner.anIntArray5900[2];
			} else {
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
			}
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
		}

	}

}
