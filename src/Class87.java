public class Class87 {

	public int anInt834;
	public Class87 aClass87_835;
	public int anInt840;
	public int anInt841;
	public int anInt843;
	public int anInt844;
	public int anInt845;
	public int anInt846;
	public int anInt847;
	public int anInt848;
	int anInt842;
	public int anInt836;
	public int anInt837;
	public int anInt838;
	public byte aByte839;

	public Class59 method1485(int i_1) {
		return Class282_Sub11_Sub1.method15434(this.anInt842, (byte) 14);
	}

	Class87 method1488(int i_1, int i_2, int i_3, byte b_4) {
		return new Class87(this.anInt842, i_1, i_2, i_3, this.aByte839);
	}

	Class87(int i_1, int i_2, int i_3, int i_4, byte b_5) {
		this.anInt842 = i_1;
		this.anInt836 = i_2;
		this.anInt837 = i_3;
		this.anInt838 = i_4;
		this.aByte839 = b_5;
	}

	public static AccountCreationResponseOpcodes method1489(int i_0) {
		return Class96_Sub9.RECIEVED_RESPONSE == null ? AccountCreationResponseOpcodes.aClass483_5730 : Class96_Sub9.RECIEVED_RESPONSE;
	}

	static final void method1490(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 28);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		TilestreamPacket.method6289(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) -46);
	}

	public static void method1491(int i_0, byte b_1) {
		if (Class148.anInt1730 != 0) {
			Class158_Sub2_Sub3.anInt10243 = i_0;
		} else {
			Class148.aClass282_Sub15_Sub2_1735.method15144(i_0, 814872907);
		}

	}

	static final void method1492(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 54);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class28.method774(icomponentdefinitions_3, interface_4, cs2executor_0, -1296322680);
	}

}
