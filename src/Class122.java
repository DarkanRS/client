public class Class122 {

	Class111 aClass111_1529;
	Class111 aClass111_1533;
	int anInt1528 = -1;
	String aString1530;
	String aString1532;
	public int[] anIntArray1531;
	public int[] anIntArray1534;

	void method2105(Class100 class100_1, byte b_2) {
		int i_3 = class100_1.method1632((byte) -72);
		this.aClass111_1529 = NPCIndexLoader.method6852(-1465285148)[i_3];
		int i_4;
		if (this.aClass111_1529 == Class111.aClass111_1109) {
			i_4 = class100_1.method1632((byte) 0);
			this.aClass111_1533 = NPCIndexLoader.method6852(-2096161358)[i_4];
			this.anInt1528 = class100_1.method1632((byte) -88);
		}

		this.aString1530 = class100_1.method1633(16711935);
		this.aString1532 = class100_1.method1633(16711935);
		i_4 = class100_1.method1632((byte) -35);
		this.anIntArray1531 = new int[i_4];
		this.anIntArray1534 = new int[i_4];

		for (int i_5 = 0; i_5 < i_4; i_5++) {
			this.anIntArray1531[i_5] = class100_1.method1632((byte) -74);
			this.anIntArray1534[i_5] = class100_1.method1632((byte) -19);
		}

	}

	static final void method2107(CS2Executor cs2executor_0, int i_1) {
		Class466.method7777(1416493755);
	}

	static final void method2108(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.method7785(i_2, 198119632);
	}

	public static void method2109(NativeSprite[] arr_0, byte b_1) {
		Class20.anInt186 = arr_0.length;
		Class115.aClass160Array1248 = new NativeSprite[Class20.anInt186 + 10];
		Class20.anIntArray177 = new int[Class20.anInt186 + 10];
		System.arraycopy(arr_0, 0, Class115.aClass160Array1248, 0, Class20.anInt186);

		int i_2;
		for (i_2 = 0; i_2 < Class20.anInt186; i_2++) {
			Class20.anIntArray177[i_2] = Class115.aClass160Array1248[i_2].method2748();
		}

		for (i_2 = Class20.anInt186; i_2 < Class115.aClass160Array1248.length; i_2++) {
			Class20.anIntArray177[i_2] = 12;
		}

	}

	public static String method2110(String string_0, char var_1, String string_2, int i_3) {
		int i_4 = string_0.length();
		int i_5 = string_2.length();
		int i_6 = i_4;
		int i_7 = i_5 - 1;
		if (i_7 != 0) {
			int i_8 = 0;

			while (true) {
				i_8 = string_0.indexOf(var_1, i_8);
				if (i_8 < 0) {
					break;
				}

				++i_8;
				i_6 += i_7;
			}
		}

		StringBuilder stringbuilder_11 = new StringBuilder(i_6);
		int i_9 = 0;

		while (true) {
			int i_10 = string_0.indexOf(var_1, i_9);
			if (i_10 < 0) {
				stringbuilder_11.append(string_0.substring(i_9));
				return stringbuilder_11.toString();
			}

			stringbuilder_11.append(string_0.substring(i_9, i_10));
			stringbuilder_11.append(string_2);
			i_9 = i_10 + 1;
		}
	}

	public static void method2111(boolean bool_0, int i_1) {
		if (bool_0 && Class291_Sub1.aClass282_Sub50_Sub6_3491 != null) {
			Class51.anInt488 = Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9536;
		} else {
			Class51.anInt488 = -1;
		}

		Class291_Sub1.aClass282_Sub50_Sub6_3491 = null;
		Class346.aClass482_4049 = null;
		Class291_Sub1.anInt8015 = 0;
		Class282_Sub20_Sub24.aClass118_9884 = null;
		Class291_Sub1.method5137();
		Class291_Sub1.aClass482_3459.method8118(-1939522587);
		Class291_Sub1.aClass283_3470 = null;
		Defaults7Loader.aClass160_5883 = null;
		Class291_Sub1.anInt8014 = -1;
		Class291_Sub1.anInt8016 = -1;
		Class494.aClass194_5794 = null;
		Class291_Sub1.aClass194_8017 = null;
		Class291_Sub1.aClass194_8023 = null;
		Class446.aClass194_5416 = null;
		Class114.aClass194_1243 = null;
		DefaultsFile.aClass194_6967 = null;
		Class251.aClass194_3103 = null;
		Class521_Sub1_Sub5_Sub1.aClass194_10527 = null;
		if (Class291_Sub1.aClass218_3456 != null) {
			Class291_Sub1.aClass218_3456.method3699((byte) 1);
			Class291_Sub1.aClass218_3456.method3697(128, 64, 1766469976);
		}

		if (Class291_Sub1.aClass427_3457 != null) {
			Class291_Sub1.aClass427_3457.method7175(64, 64, 1145501351);
		}

		if (Class291_Sub1.aClass474_3455 != null) {
			Class291_Sub1.aClass474_3455.method7899(256, -2034610586);
		}

		IndexLoaders.aClass230_147.method3906(64, (short) 727);
	}

	static final void method2112(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 7;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1] << 1;
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		int i_5 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 3];
		int i_6 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 4];
		int i_7 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 5];
		int i_8 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 6];
		if (i_2 >= 0 && i_2 < 2 && client.anIntArrayArrayArray7302[i_2] != null && i_3 >= 0 && i_3 < client.anIntArrayArrayArray7302[i_2].length) {
			client.anIntArrayArrayArray7302[i_2][i_3] = new int[] { (i_4 >> 14 & 0x3fff) << 9, i_5 << 2, (i_4 & 0x3fff) << 9, i_8 };
			client.anIntArrayArrayArray7302[i_2][i_3 + 1] = new int[] { (i_6 >> 14 & 0x3fff) << 9, i_7 << 2, (i_6 & 0x3fff) << 9 };
		}

	}

}
