public class Class193 {

	int anInt2393;
	short aShort2394;
	short aShort2395;
	short aShort2396;
	byte aByte2398;
	byte aByte2397;
	boolean aBool2399;
	int anInt2400;

	Class193(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11) {
		this.anInt2393 = i_1;
		this.aShort2394 = (short) i_5;
		this.aShort2395 = (short) i_6;
		this.aShort2396 = (short) i_7;
		this.aByte2398 = (byte) i_8;
		this.aByte2397 = (byte) i_9;
		this.aBool2399 = bool_10;
		this.anInt2400 = i_11;
	}

	static final void method3170(CS2Executor cs2executor_0, int i_1) {
		boolean bool_2 = false;
		if (client.aBool7310) {
			try {
				Object object_3 = Class361.aClass361_4178.method6254(new Object[] { Integer.valueOf(Class504.anInt5832), Boolean.valueOf(Class84.myPlayer.male == 1), Integer.valueOf(cs2executor_0.intStack[--cs2executor_0.intStackPtr]) }, (byte) 69);
				if (object_3 != null) {
					bool_2 = ((Boolean) object_3).booleanValue();
				}
			} catch (Throwable throwable_4) {
				;
			}
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = bool_2 ? 1 : 0;
	}

	static final void method3171(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 105);
		Class209.method3601(icomponentdefinitions_3, cs2executor_0, -1995583516);
	}

	static final void method3172(CS2Executor cs2executor_0, int i_1) {
		Class282_Sub29.method12426(1174367137);
	}

}
