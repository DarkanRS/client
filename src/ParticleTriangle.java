public class ParticleTriangle {

	int anInt2884;
	int anInt2885;
	int anInt2886;
	int centerZ;
	int anInt2888;
	int anInt2889;
	int anInt2890;
	int anInt2891;
	int centerY;
	int anInt2893;
	int centerX;
	int anInt2895;

	boolean equals(ParticleTriangle class234_1, byte b_2) {
		return this.centerX == class234_1.centerX && this.centerZ == class234_1.centerZ && this.centerY == class234_1.centerY;
	}

	static final void method3949(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 82);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class389.method6697(icomponentdefinitions_3, interface_4, cs2executor_0, 1042468011);
	}

	static final void method3950(CS2Executor cs2executor_0, int i_1) {
		Class283.anInt3384 = 0;
	}

	static final void method3951(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Character.toLowerCase((char) i_2);
	}

	public static int method3952(String string_0, int i_1) {
		return string_0.length() + 2;
	}

	public static void method3953(byte b_0) {
		Class86.aShort828 = client.aShort7214;
		Class86.aShort829 = client.aShort7474;
		Class534.aShort7079 = client.aShort7276;
		Class86.aShort830 = client.aShort7441;
		Class86.aBool826 = true;
		if (Class86.anInt824 != 0 && Class86.anInt825 != 0) {
			client.aShort7276 = 334;
			client.aShort7441 = 334;
			client.aShort7474 = client.aShort7214 = (short) (Class86.anInt824 * 512 / Class86.anInt825);
		}

	}

}
