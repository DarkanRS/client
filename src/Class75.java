public final class Class75 {

	static Index aClass317_746;
	static int anInt747;
	public boolean aBool742 = false;
	Player aClass521_Sub1_Sub1_Sub2_Sub1_744 = null;
	NPC aClass521_Sub1_Sub1_Sub2_Sub2_741 = null;
	int[] anIntArray745;
	int anInt740;
	public int anInt739;

	void method1336(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (!this.aBool742) {
			this.aBool742 = true;
			if (this.anInt739 >= 0) {
				this.aClass521_Sub1_Sub1_Sub2_Sub2_741 = new NPC(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1965384058), 25);
				this.aClass521_Sub1_Sub1_Sub2_Sub2_741.anInt10314 = this.anInt740;
				this.aClass521_Sub1_Sub1_Sub2_Sub2_741.anInt10353 = client.cycles;
				this.aClass521_Sub1_Sub1_Sub2_Sub2_741.method16166(IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(this.anInt739, (byte) 5), 687087501);
				this.aClass521_Sub1_Sub1_Sub2_Sub2_741.method15836(this.aClass521_Sub1_Sub1_Sub2_Sub2_741.definitions.anInt4858, (byte) -96);
				this.aClass521_Sub1_Sub1_Sub2_Sub2_741.anInt10340 = this.aClass521_Sub1_Sub1_Sub2_Sub2_741.definitions.anInt4889 << 3;
				this.aClass521_Sub1_Sub1_Sub2_Sub2_741.drawPriority = ++Class86.anInt819 - 1;
			} else {
				this.aClass521_Sub1_Sub1_Sub2_Sub1_744 = new Player(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1995345801), 25);
				this.aClass521_Sub1_Sub1_Sub2_Sub1_744.decodeAppearance(Class276.aClass282_Sub35_3346, 1925099603);
				this.aClass521_Sub1_Sub1_Sub2_Sub1_744.anInt10314 = this.anInt740;
				this.aClass521_Sub1_Sub1_Sub2_Sub1_744.anInt10353 = client.cycles;
				this.aClass521_Sub1_Sub1_Sub2_Sub1_744.drawPriority = ++Class86.anInt819 - 1;
			}
		}

		if (this.anInt739 >= 0) {
			this.aClass521_Sub1_Sub1_Sub2_Sub2_741.method16159(i_3, i_1, i_2, true, this.aClass521_Sub1_Sub1_Sub2_Sub2_741.getSize(828768449), -1440996136);
			this.aClass521_Sub1_Sub1_Sub2_Sub2_741.method15791(i_4, true, (byte) -89);
		} else {
			this.aClass521_Sub1_Sub1_Sub2_Sub1_744.plane = this.aClass521_Sub1_Sub1_Sub2_Sub1_744.aByte7968 = (byte) i_3;
			this.aClass521_Sub1_Sub1_Sub2_Sub1_744.method16130(i_1, i_2, 87845463);
			this.aClass521_Sub1_Sub1_Sub2_Sub1_744.method15791(i_4, true, (byte) -27);
		}

	}

	void method1337(int i_1) {
		this.aClass521_Sub1_Sub1_Sub2_Sub2_741 = null;
		this.aClass521_Sub1_Sub1_Sub2_Sub1_744 = null;
		this.aBool742 = false;
	}

	void method1338(int i_1, int i_2, int i_3, int i_4) {
		if (this.aClass521_Sub1_Sub1_Sub2_Sub2_741 != null) {
			this.aClass521_Sub1_Sub1_Sub2_Sub2_741.method16159(i_1, i_2, i_3, true, this.aClass521_Sub1_Sub1_Sub2_Sub2_741.getSize(828768449), -1226948828);
		} else {
			this.aClass521_Sub1_Sub1_Sub2_Sub1_744.plane = this.aClass521_Sub1_Sub1_Sub2_Sub1_744.aByte7968 = (byte) i_1;
			this.aClass521_Sub1_Sub1_Sub2_Sub1_744.method16130(i_2, i_3, -909985689);
		}

	}

	boolean method1339(short s_1) {
		if (this.anInt739 < 0) {
			return true;
		} else {
			NPCDefinitions npcdefinitions_2 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(this.anInt739, (byte) 53);
			boolean bool_3 = npcdefinitions_2.method6881(-1593262415);
			if (this.anIntArray745 == null) {
				RenderAnimDefs renderanimdefs_4 = IndexLoaders.RENDER_ANIMS.getRenderAnimDefs(npcdefinitions_2.anInt4898, (byte) -42);
				this.anIntArray745 = renderanimdefs_4.method3828(163665015);
			}

			int[] ints_7 = this.anIntArray745;

			for (int i_5 = 0; i_5 < ints_7.length; i_5++) {
				int i_6 = ints_7[i_5];
				bool_3 &= IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(i_6, (byte) 91).ready();
			}

			return bool_3;
		}
	}

	public Animable method1342(byte b_1) {
		return (Animable) (this.aClass521_Sub1_Sub1_Sub2_Sub2_741 != null ? this.aClass521_Sub1_Sub1_Sub2_Sub2_741 : this.aClass521_Sub1_Sub1_Sub2_Sub1_744);
	}

	Class75(RsByteBuffer rsbytebuffer_1, int i_2) {
		this.anInt740 = i_2;
		int i_3 = rsbytebuffer_1.readUnsignedByte();
		switch (i_3) {
		case 0:
			this.anInt739 = rsbytebuffer_1.readBigSmart();
			break;
		case 1:
			this.anInt739 = -1;
			break;
		default:
			this.anInt739 = -1;
		}

		rsbytebuffer_1.readString();
	}

	static final void method1349(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 104);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class174.method2955(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 0);
	}

	static final void method1350(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub28_8212.method12966((byte) -16) == 1 ? 1 : 0;
	}

	static final void method1351(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class469.aBool5585 ? 1 : 0;
	}

	static final void method1352(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub17_8200.method7785(i_2, -332063758);
	}

	public static String method1353(String string_0, int i_1) {
		StringBuilder stringbuilder_2 = new StringBuilder();
		int i_3 = string_0.length();

		for (int i_4 = 0; i_4 < i_3; i_4++) {
			char var_5 = string_0.charAt(i_4);
			if (var_5 == 37 && i_3 > i_4 + 2) {
				var_5 = string_0.charAt(i_4 + 1);
				boolean bool_6 = false;
				int i_7;
				if (var_5 >= 48 && var_5 <= 57) {
					i_7 = var_5 - 48;
				} else if (var_5 >= 97 && var_5 <= 102) {
					i_7 = var_5 + 10 - 97;
				} else {
					if (var_5 < 65 || var_5 > 70) {
						stringbuilder_2.append('%');
						continue;
					}

					i_7 = var_5 + 10 - 65;
				}

				i_7 *= 16;
				char var_8 = string_0.charAt(i_4 + 2);
				if (var_8 >= 48 && var_8 <= 57) {
					i_7 += var_8 - 48;
				} else if (var_8 >= 97 && var_8 <= 102) {
					i_7 += var_8 + 10 - 97;
				} else {
					if (var_8 < 65 || var_8 > 70) {
						stringbuilder_2.append('%');
						continue;
					}

					i_7 += var_8 + 10 - 65;
				}

				if (i_7 != 0 && Class209.method3600((byte) i_7, 1053306035)) {
					stringbuilder_2.append(Class11.getChar((byte) i_7, -847887616));
				}

				i_4 += 2;
			} else if (var_5 == 43) {
				stringbuilder_2.append(' ');
			} else {
				stringbuilder_2.append(var_5);
			}
		}

		return stringbuilder_2.toString();
	}

	static String method1354(Class282_Sub50_Sub15 class282_sub50_sub15_0, int i_1) {
		return class282_sub50_sub15_0.aString9771 + ParticleProducerDefinition.method1163(16777215, 619010179) + " >";
	}

	static final void method1355(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		Class31.method812(i_2, new Class282_Sub44(i_3, 3), (int[]) null, true, (byte) 92);
	}

}
