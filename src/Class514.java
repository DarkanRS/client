public final class Class514 {

	static int anInt5887;

	Class514() throws Throwable {
		throw new Error();
	}

	static final void method8839(CS2Executor cs2executor_0, int i_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		cs2executor_0.intStackPtr -= 2;
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = string_2.substring(i_3, i_4);
	}

	static int method8840(char var_0, int i_1) {
		return var_0 >= 0 && var_0 < Class480.anIntArray5715.length ? Class480.anIntArray5715[var_0] : -1;
	}

	public static final void method8841(int i_0) {
		for (int i_1 = 0; i_1 < 5; i_1++) {
			client.aBoolArray7431[i_1] = false;
		}

		client.anInt7277 = -1;
		client.anInt7448 = -1;
		LinkedNodeList.anInt5606 = 0;
		Class501.anInt5828 = 0;
		NativeLibraryLoader.anInt3240 = 2;
		Class86.anInt833 = -1;
		Class508.anInt5864 = -1;
	}

	static Class149_Sub2 method8842(RsByteBuffer rsbytebuffer_0, byte b_1) {
		return new Class149_Sub2(rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.readUnsignedByte());
	}

	static final void method8843(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 47);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class363.method6288(icomponentdefinitions_3, interface_4, cs2executor_0, (short) 25412);
	}

	static final void method8844(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub17_8200.method12761(-969273595) ? 1 : 0;
	}

}
