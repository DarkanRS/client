public class Class506 {

	static int anInt5858;
	static Class223 aClass223_5857 = new Class223(128);

	Class506() throws Throwable {
		throw new Error();
	}

	static final void method8714(CS2Executor cs2executor_0, byte b_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class175.method2960(icomponentdefinitions_3, interface_4, cs2executor_0, 1306300088);
	}

	static final void method8715(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 60);
		Class199.method3251(icomponentdefinitions_3, cs2executor_0, 1146866687);
	}

	static final void method8716(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		int i_3 = client.aClass330Array7428[i_2].method5908(-12393301);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_3 == 2 ? 1 : 0;
	}

	static final void method8717(CS2Executor cs2executor_0, int i_1) {
		String string_2;
		if (Class84.myPlayer != null && Class84.myPlayer.username != null) {
			string_2 = Class84.myPlayer.method16127(true, 2008342545);
		} else {
			string_2 = "";
		}

		cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = string_2;
	}

	static final void method8718(CS2Executor cs2executor_0, byte b_1) {
		String string_2 = (String) cs2executor_0.stringStack[--cs2executor_0.stringStackPtr];
		cs2executor_0.aClass191_7008 = new Class191(string_2, true);
	}

	static final void method8719(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStackPtr -= 3;
		long long_2 = (long) cs2executor_0.intStack[cs2executor_0.intStackPtr];
		long long_4 = (long) cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		long long_6 = (long) cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = (int) (long_6 * long_2 / long_4);
	}

	static final void method8720(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		int i_3 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (i_3 >= 0 && i_3 < cs2executor_0.globalArrayLengths[i_2]) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = cs2executor_0.globalArrays[i_2][i_3];
		} else {
			throw new RuntimeException();
		}
	}

	public static MeshModifier decodeItemEffects(ItemDefinitions itemdefinitions_0, RsByteBuffer rsbytebuffer_1, int i_2) {
		MeshModifier meshmodifier_3 = new MeshModifier(itemdefinitions_0);
		int i_4 = rsbytebuffer_1.readUnsignedByte();
		boolean bool_5 = (i_4 & 0x1) != 0;
		boolean bool_6 = (i_4 & 0x2) != 0;
		boolean bool_7 = (i_4 & 0x4) != 0;
		boolean bool_8 = (i_4 & 0x8) != 0;
		if (bool_5) {
			meshmodifier_3.maleBody[0] = rsbytebuffer_1.readBigSmart();
			meshmodifier_3.femaleBody[0] = rsbytebuffer_1.readBigSmart();
			if (itemdefinitions_0.maleEquip2 != -1 || itemdefinitions_0.femaleEquip2 != -1) {
				meshmodifier_3.maleBody[1] = rsbytebuffer_1.readBigSmart();
				meshmodifier_3.femaleBody[1] = rsbytebuffer_1.readBigSmart();
			}

			if (itemdefinitions_0.maleEquip3 != -1 || itemdefinitions_0.femaleEquip3 != -1) {
				meshmodifier_3.maleBody[2] = rsbytebuffer_1.readBigSmart();
				meshmodifier_3.femaleBody[2] = rsbytebuffer_1.readBigSmart();
			}
		}

		if (bool_6) {
			meshmodifier_3.maleHeads[0] = rsbytebuffer_1.readBigSmart();
			meshmodifier_3.femaleHeads[0] = rsbytebuffer_1.readBigSmart();
			if (itemdefinitions_0.maleHead2 != -1 || itemdefinitions_0.femaleHead2 != -1) {
				meshmodifier_3.maleHeads[1] = rsbytebuffer_1.readBigSmart();
				meshmodifier_3.femaleHeads[1] = rsbytebuffer_1.readBigSmart();
			}
		}

		int i_9;
		int[] ints_10;
		int i_11;
		if (bool_7) {
			i_9 = rsbytebuffer_1.readUnsignedShort();
			ints_10 = new int[] { i_9 & 0xf, i_9 >> 4 & 0xf, i_9 >> 8 & 0xf, i_9 >> 12 & 0xf };

			for (i_11 = 0; i_11 < 4; i_11++) {
				if (ints_10[i_11] != 15) {
					meshmodifier_3.modifiedColors[ints_10[i_11]] = (short) rsbytebuffer_1.readUnsignedShort();
				}
			}
		}

		if (bool_8) {
			i_9 = rsbytebuffer_1.readUnsignedByte();
			ints_10 = new int[] { i_9 & 0xf, i_9 >> 4 & 0xf };

			for (i_11 = 0; i_11 < 2; i_11++) {
				if (ints_10[i_11] != 15) {
					meshmodifier_3.modifiedTextures[ints_10[i_11]] = (short) rsbytebuffer_1.readUnsignedShort();
				}
			}
		}

		return meshmodifier_3;
	}

	static void method8722(int i_0, int i_1, int i_2, int i_3, int i_4) {
		Class282_Sub50_Sub12 class282_sub50_sub12_5 = Engine.getIComponentVar(18, (long) i_1 << 32 | (long) i_0);
		class282_sub50_sub12_5.method14995(540803591);
		class282_sub50_sub12_5.anInt9668 = i_2;
		class282_sub50_sub12_5.anInt9641 = i_3;
	}

}
