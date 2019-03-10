public abstract class Class282_Sub11 extends Node {

	abstract void method12203(RsByteBuffer var1, int var2);

	abstract void method12204(Class282_Sub4 var1, int var2);

	abstract void method12205(Class282_Sub4 var1);

	abstract void method12206(RsByteBuffer var1);

	abstract void method12207(RsByteBuffer var1);

	abstract void method12208(RsByteBuffer var1);

	static final void method12209(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 2;
		byte b_4 = 10;
		byte[] bytes_5 = new byte[] { (byte) cs2executor_2.intStack[cs2executor_2.intStackPtr] };
		byte[] bytes_6 = new byte[] { (byte) cs2executor_2.intStack[cs2executor_2.intStackPtr + 1] };
		Class445.method7429(icomponentdefinitions_0, b_4, bytes_5, bytes_6, cs2executor_2, -2033836462);
	}

	static final void method12210(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.stringStackPtr -= 3;
		Class533.method11404((String) cs2executor_0.stringStack[cs2executor_0.stringStackPtr], (String) cs2executor_0.stringStack[cs2executor_0.stringStackPtr + 1], (String) cs2executor_0.stringStack[cs2executor_0.stringStackPtr + 2], cs2executor_0.intStack[--cs2executor_0.intStackPtr] == 1, true, -94301647);
	}

	public static void method12211(int i_0) {
		Class442 class442_1 = null;

		try {
			class442_1 = Class345.method6137("2", client.CURRENT_GAME.aString5748, true, (byte) -1);
			RsByteBuffer rsbytebuffer_2 = new RsByteBuffer(client.anInt7399 * 6 + 3);
			rsbytebuffer_2.writeByte(1);
			rsbytebuffer_2.writeShort(client.anInt7399, 1417031095);

			for (int i_3 = 0; i_3 < Class320.anIntArray3724.length; i_3++) {
				if (Class282_Sub17_Sub2.aBoolArray9934[i_3]) {
					rsbytebuffer_2.writeShort(i_3, 1417031095);
					rsbytebuffer_2.writeInt(Class320.anIntArray3724[i_3]);
				}
			}

			class442_1.method7386(rsbytebuffer_2.buffer, 0, rsbytebuffer_2.index, 18074141);
		} catch (Exception exception_5) {
			;
		}

		try {
			if (class442_1 != null) {
				class442_1.method7385((short) 27554);
			}
		} catch (Exception exception_4) {
			;
		}

		client.aLong7401 = Class169.time();
		client.aBool7400 = false;
	}

}
