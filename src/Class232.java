public class Class232 implements Interface17 {

	static int anInt2878;
	public static int anInt2879;
	int[] anIntArray2877;

	public boolean method126(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4) {
		int[] ints_5 = this.anIntArray2877;

		for (int i_6 = 0; i_6 < ints_5.length; i_6++) {
			int i_7 = ints_5[i_6];
			if (!class199_4.method3236(i_7, -1320094050)) {
				return false;
			}
		}

		return true;
	}

	public boolean method127(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4, byte b_5) {
		int[] ints_6 = this.anIntArray2877;

		for (int i_7 = 0; i_7 < ints_6.length; i_7++) {
			int i_8 = ints_6[i_7];
			if (!class199_4.method3236(i_8, -2034817305)) {
				return false;
			}
		}

		return true;
	}

	public boolean method128(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4) {
		int[] ints_5 = this.anIntArray2877;

		for (int i_6 = 0; i_6 < ints_5.length; i_6++) {
			int i_7 = ints_5[i_6];
			if (!class199_4.method3236(i_7, -1373982439)) {
				return false;
			}
		}

		return true;
	}

	public boolean method129(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4) {
		int[] ints_5 = this.anIntArray2877;

		for (int i_6 = 0; i_6 < ints_5.length; i_6++) {
			int i_7 = ints_5[i_6];
			if (!class199_4.method3236(i_7, -1634337253)) {
				return false;
			}
		}

		return true;
	}

	Class232(int[] ints_1) {
		this.anIntArray2877 = ints_1;
	}

	static final void method3918(CS2Executor cs2executor_0, byte b_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Defaults7Loader.method8754(icomponentdefinitions_3, interface_4, cs2executor_0, 1449946769);
	}

	static final void method3919(CS2Executor cs2executor_0, int i_1) {
		Class291_Sub1.aBool8027 = cs2executor_0.intStack[--cs2executor_0.intStackPtr] == 1;
	}

	static final void method3920(int i_0, int i_1) {
		int i_2 = client.cycles - client.anInt7429;
		if (i_2 >= 100) {
			NativeLibraryLoader.anInt3240 = 2;
			Class86.anInt833 = -1;
			Class508.anInt5864 = -1;
		} else {
			int i_3 = (int) client.aFloat7146;
			if (client.anInt7273 >> 8 > i_3) {
				i_3 = client.anInt7273 >> 8;
			}

			if (client.aBoolArray7431[4] && client.anIntArray7433[4] + 128 > i_3) {
				i_3 = client.anIntArray7433[4] + 128;
			}

			int i_4 = (int) client.aFloat7365 + client.anInt7343 & 0x3fff;
			Vector3 vector3_5 = Class84.myPlayer.method11166().aClass385_3595;
			LoadingStage.method6683(Class11.anInt122, Class504.method8389((int) vector3_5.x, (int) vector3_5.z, Class4.anInt35, (byte) 51) - 200, Class266.anInt3289, i_3, i_4, (i_3 >> 3) * 3 + 600 << 2, i_0, 1500551332);
			float f_6 = 1.0F - (float) ((100 - i_2) * (100 - i_2) * (100 - i_2)) / 1000000.0F;
			Class31.anInt361 = (int) ((float) Class186.anInt2349 + f_6 * (float) (Class31.anInt361 - Class186.anInt2349));
			Class109_Sub1.anInt9384 = (int) ((float) Class521_Sub1_Sub2.anInt9461 + f_6 * (float) (Class109_Sub1.anInt9384 - Class521_Sub1_Sub2.anInt9461));
			Class246.anInt3029 = (int) ((float) (Class246.anInt3029 - Class282_Sub15_Sub1.anInt9575) * f_6 + (float) Class282_Sub15_Sub1.anInt9575);
			Class293.anInt3512 = (int) ((float) ClipMap.anInt3968 + f_6 * (float) (Class293.anInt3512 - ClipMap.anInt3968));
			int i_7 = AnimationDefinitions.anInt5930 - ParamDefinitionsLoader.anInt5029;
			if (i_7 > 8192) {
				i_7 -= 16384;
			} else if (i_7 < -8192) {
				i_7 += 16384;
			}

			AnimationDefinitions.anInt5930 = (int) ((float) ParamDefinitionsLoader.anInt5029 + f_6 * (float) i_7);
			AnimationDefinitions.anInt5930 &= 0x3fff;
		}

	}

	static final void method3921(CS2Executor cs2executor_0, int i_1) {
		Class184 class184_2 = Class468_Sub20.method12807(-1070075874);
		TCPMessage tcpmessage_3 = Class271.method4828(OutgoingPacket.aClass379_4591, class184_2.isaac, 1590511706);
		tcpmessage_3.buffer.writeByte(0);
		int i_4 = tcpmessage_3.buffer.index;
		tcpmessage_3.buffer.writeByte(1);
		tcpmessage_3.buffer.writeShort(cs2executor_0.aClass346_7009.anInt4048, 1417031095);
		cs2executor_0.aClass346_7009.aClass282_Sub50_Sub9_4047.method14896(tcpmessage_3.buffer, cs2executor_0.aClass346_7009.anIntArray4046, -245952501);
		tcpmessage_3.buffer.method13061(tcpmessage_3.buffer.index - i_4, 1096626300);
		class184_2.method3049(tcpmessage_3, 363864337);
	}

	static final void method3922(int[] ints_0, int i_1, int i_2, int i_3, byte b_4) {
		--i_1;
		--i_2;

		for (int i_5 = i_2 - 7; i_1 < i_5; ints_0[i_1] = i_3) {
			++i_1;
			ints_0[i_1] = i_3;
			++i_1;
			ints_0[i_1] = i_3;
			++i_1;
			ints_0[i_1] = i_3;
			++i_1;
			ints_0[i_1] = i_3;
			++i_1;
			ints_0[i_1] = i_3;
			++i_1;
			ints_0[i_1] = i_3;
			++i_1;
			ints_0[i_1] = i_3;
			++i_1;
		}

		while (i_1 <= i_2) {
			++i_1;
			ints_0[i_1] = i_3;
		}

	}

}
