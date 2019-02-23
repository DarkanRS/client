public abstract class RouteStrategy {

	public int approxDestinationX;
	public int approxDestinationY;
	public int approxDestinationSizeX;
	public int approxDestinationSizeY;

	public abstract boolean method3785(int var1, int var2, int var3, ClipMap var4);

	public abstract boolean method3786(int var1, int var2, int var3, ClipMap var4);

	public abstract boolean canExit(int var1, int var2, int var3, ClipMap var4, byte var5);

	public abstract boolean method3788(int var1, int var2, int var3, ClipMap var4);

	public abstract boolean method3789(int var1, int var2, int var3, ClipMap var4);

	static final void method3790(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		if (underlaydefinition_2.aClass118_5886.anInt1288 == -1) {
			if (cs2executor_0.aBool7022) {
				throw new RuntimeException("");
			} else {
				throw new RuntimeException("");
			}
		} else {
			IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.method8772(42076446);
			icomponentdefinitions_3.aClass118Array1438[underlaydefinition_2.aClass118_5886.anInt1288] = null;
			Class109.method1858(icomponentdefinitions_3, (byte) -39);
		}
	}

	static final void method3791(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 77);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		DefaultsFile.method11223(icomponentdefinitions_3, interface_4, cs2executor_0, 334837898);
	}

	static final void method3792(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class163.aClass209_2031.method3569(2029806925);
	}

	static final void method3793(CS2Executor cs2executor_0, byte b_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = string_2.toLowerCase();
	}

	public static final void method3794(int i_0, int i_1, int i_2, int i_3, int i_4, boolean bool_5, byte b_6) {
		Class296.anInt3534 = i_0;
		Class282_Sub44.anInt8064 = i_1;
		SpotAnimDefinitions.anInt6985 = i_2;
		Class454.anInt5451 = i_3;
		Class115.anInt1249 = i_4;
		if (bool_5 && Class115.anInt1249 >= 100) {
			Class31.anInt361 = Class296.anInt3534 * 512 + 256;
			Class246.anInt3029 = Class282_Sub44.anInt8064 * 512 + 256;
			Class109_Sub1.anInt9384 = Class504.method8389(Class31.anInt361, Class246.anInt3029, Class4.anInt35, (byte) 10) - SpotAnimDefinitions.anInt6985;
		}

		NativeLibraryLoader.anInt3240 = 5;
		Class86.anInt833 = -1;
		Class508.anInt5864 = -1;
	}

}
