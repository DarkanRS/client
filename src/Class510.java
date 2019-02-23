public final class Class510 {

	public volatile int anInt5872 = -1;
	volatile String aString5871;

	Class510(String string_1) {
		this.aString5871 = string_1;
	}

	static final void method8741(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 19);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class30.method797(icomponentdefinitions_3, interface_4, cs2executor_0, 2057644852);
	}

	static final void method8742(CS2Executor cs2executor_0, int i_1) {
		Class275_Sub7.method12606((byte) 70);
	}

	static final void method8743(CS2Executor cs2executor_0, int i_1) {
		if (cs2executor_0.anInt7002 != 0) {
			Class509 class509_2 = cs2executor_0.aClass509Array7016[--cs2executor_0.anInt7002];
			cs2executor_0.current = class509_2.aClass282_Sub50_Sub5_5869;
			cs2executor_0.operations = cs2executor_0.current.operations;
			cs2executor_0.intOpValues = cs2executor_0.current.intOpValues;
			cs2executor_0.instrPtr = class509_2.anInt5866;
			cs2executor_0.intLocals = class509_2.anIntArray5867;
			cs2executor_0.objectLocals = class509_2.anObjectArray5865;
			cs2executor_0.longLocals = class509_2.aLongArray5868;
		}

	}

	static final void method8744(byte b_0, int i_1) {
		byte[][][] bytes_2 = IndexLoaders.MAP_REGION_DECODER.method4532(1227540505);
		if (bytes_2 == null) {
			bytes_2 = new byte[4][IndexLoaders.MAP_REGION_DECODER.getSizeX(1852995764)][IndexLoaders.MAP_REGION_DECODER.getSizeY(-533095676)];
			IndexLoaders.MAP_REGION_DECODER.method4440(bytes_2, (byte) 2);
		}

		for (int i_3 = 0; i_3 < 4; i_3++) {
			for (int i_4 = 0; i_4 < IndexLoaders.MAP_REGION_DECODER.getSizeX(713986087); i_4++) {
				for (int i_5 = 0; i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-748380927); i_5++) {
					bytes_2[i_3][i_4][i_5] = b_0;
				}
			}
		}

	}

}
