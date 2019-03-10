public class Class226 implements Definition {

	public int anInt2784;
	public int anInt2785;
	public int anInt2783;

	void method3795(RsByteBuffer rsbytebuffer_1, int i_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method3796(rsbytebuffer_1, i_3, 767185341);
		}
	}

	void method3796(RsByteBuffer rsbytebuffer_1, int i_2, int i_3) {
		if (i_2 == 1) {
			this.anInt2784 = rsbytebuffer_1.readUnsignedShort();
			this.anInt2785 = rsbytebuffer_1.readUnsignedByte();
			this.anInt2783 = rsbytebuffer_1.readUnsignedByte();
		}

	}

	static final void method3802(CS2Executor cs2executor_0) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.aClass330Array7428[i_2].anInt3865;
	}

	static final void method3803(CS2Executor cs2executor_0, short s_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		ChatLine chatline_3 = Class180.method3032(i_2, (byte) -1);
		int i_4 = -1;
		if (chatline_3 != null) {
			i_4 = chatline_3.anInt1085;
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_4;
	}

	static final void method3804(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_10000 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		i_10000 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		if (Class475.supportsFullScreen) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Engine.fullScreenFrame != null ? 1 : 0;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

	public static void method3805(int i_0) {
		Class148.aClass282_Sub15_Sub2_1735.method15101((short) -11220);
		Class148.anInt1730 = 1;
		Class75.aClass317_746 = null;
		Class282_Sub33.aClass282_Sub15_Sub2_7836 = null;
	}

	static final void method3806(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 114);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class96_Sub18.method14664(icomponentdefinitions_3, interface_4, true, 1, cs2executor_0, (byte) -9);
	}

}
