public class RegionMap {

	public static String aString3643;
	public static int anInt3644;
	public byte[][][] tileMasks;

	public void reset(int i_1) {
		for (int i_2 = 0; i_2 < this.tileMasks.length; i_2++) {
			for (int i_3 = 0; i_3 < this.tileMasks[0].length; i_3++) {
				for (int i_4 = 0; i_4 < this.tileMasks[0][0].length; i_4++) {
					this.tileMasks[i_2][i_3][i_4] = 0;
				}
			}
		}

	}

	public boolean is0x2(int i_1, int i_2, int i_3) {
		return i_1 >= 0 && i_2 >= 0 && i_1 < this.tileMasks[1].length && i_2 < this.tileMasks[1][i_1].length ? (this.tileMasks[1][i_1][i_2] & 0x2) != 0 : false;
	}

	public boolean method5498(int i_1, int i_2, int i_3, int i_4, short s_5) {
		return (this.tileMasks[0][i_3][i_4] & 0x2) != 0 ? true : ((this.tileMasks[i_2][i_3][i_4] & 0x10) != 0 ? false : this.method5499(i_2, i_3, i_4, (short) -9790) == i_1);
	}

	int method5499(int i_1, int i_2, int i_3, short s_4) {
		return (this.tileMasks[i_1][i_2][i_3] & 0x8) != 0 ? 0 : (i_1 > 0 && (this.tileMasks[1][i_2][i_3] & 0x2) != 0 ? i_1 - 1 : i_1);
	}

	public RegionMap(int i_1, int i_2, int i_3) {
		this.tileMasks = new byte[i_1][i_2][i_3];
	}

	static final void method5511(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 98);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class169.method2874(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 3);
	}

	static final void method5512(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Class96_Sub10.method14605(icomponentdefinitions_3, cs2executor_0, (byte) -77);
	}

	public static void method5513(int i_0, int i_1, byte b_2) {
		Class282_Sub50_Sub12 class282_sub50_sub12_3 = Engine.getIComponentVar(18, (long) i_1 << 32 | (long) i_0);
		class282_sub50_sub12_3.method14965((byte) -18);
	}

}
