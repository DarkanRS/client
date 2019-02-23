public class Class96_Sub8 extends Class96 {

	Class268 aClass268_9271;
	int anInt9270;
	int anInt9269;
	int anInt9272;
	int anInt9268;

	public void method1592(int i_1) {
		this.aClass268_9271 = Class435.method7300(this.anInt9270, this.anInt9268, 0, this.anInt9269, false, this.anInt9272, 1449989045);
	}

	Class96_Sub8(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt9270 = rsbytebuffer_1.readUnsignedShort();
		this.anInt9269 = rsbytebuffer_1.readUnsignedByte();
		this.anInt9272 = rsbytebuffer_1.readUnsignedByte();
		this.anInt9268 = rsbytebuffer_1.readUnsignedByte();
	}

	void method1593(byte b_1) {
		if (this.aClass268_9271 != null) {
			Class58.method1142(this.aClass268_9271, 1303678782);
			this.aClass268_9271 = null;
		}

	}

	public void method1601() {
		this.aClass268_9271 = Class435.method7300(983294899 * this.anInt9270 * -1315470469, this.anInt9268 * 1609664985 * -573413783, 0, this.anInt9269 * -957613339 * -840420627, false, 177588843 * this.anInt9272 * -1529769405, 1449989045);
	}

	static boolean method14577(int i_0) {
		return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5879, (byte) -63);
	}

	static final void method14578(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1314;
	}

	static final void method14579(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 55);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class236.method3983(icomponentdefinitions_3, interface_4, cs2executor_0, -1297016434);
	}

}
