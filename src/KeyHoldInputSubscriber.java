public class KeyHoldInputSubscriber implements InputSubscriber {

	static int anInt2878;

	public static int anInt2879;

	int[] requiredKeys;

	public boolean method126(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4) {
		int[] ints_5 = this.requiredKeys;
		for (int i_6 = 0; i_6 < ints_5.length; i_6++) {
			int i_7 = ints_5[i_6];
			if (!class199_4.held(i_7)) {
				return false;
			}
		}
		return true;
	}

	public boolean valid(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4) {
		int[] ints_6 = this.requiredKeys;
		for (int i_7 = 0; i_7 < ints_6.length; i_7++) {
			int i_8 = ints_6[i_7];
			if (!class199_4.held(i_8)) {
				return false;
			}
		}
		return true;
	}

	public boolean method128(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4) {
		int[] ints_5 = this.requiredKeys;
		for (int i_6 = 0; i_6 < ints_5.length; i_6++) {
			int i_7 = ints_5[i_6];
			if (!class199_4.held(i_7)) {
				return false;
			}
		}
		return true;
	}

	public boolean method129(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4) {
		int[] ints_5 = this.requiredKeys;
		for (int i_6 = 0; i_6 < ints_5.length; i_6++) {
			int i_7 = ints_5[i_6];
			if (!class199_4.held(i_7)) {
				return false;
			}
		}
		return true;
	}

	public static KeyHoldInputSubscriber decode(RsByteBuffer rsbytebuffer_0) {
	    int count = rsbytebuffer_0.readUnsignedByte();
	    int[] requiredKeys = new int[count];
	    for (int i_4 = 0; i_4 < count; i_4++) {
	        requiredKeys[i_4] = rsbytebuffer_0.readUnsignedByte();
	    }
	    return new KeyHoldInputSubscriber(requiredKeys);
	}

	KeyHoldInputSubscriber(int[] ints_1) {
		this.requiredKeys = ints_1;
	}

	static final void method3920(int i_0) {
		int i_2 = client.cycles - client.anInt7429;
		if (i_2 >= 100) {
			NativeLibraryLoader.anInt3240 = 2;
			Class86.anInt833 = -1;
			PingRequester.anInt5864 = -1;
		} else {
			int i_3 = (int) client.aFloat7146;
			if (client.anInt7273 >> 8 > i_3) {
				i_3 = client.anInt7273 >> 8;
			}
			if (client.aBoolArray7431[4] && client.anIntArray7433[4] + 128 > i_3) {
				i_3 = client.anIntArray7433[4] + 128;
			}
			int i_4 = (int) client.aFloat7365 + client.anInt7343 & 0x3fff;
			Vector3 vector3_5 = VertexNormal.MY_PLAYER.method11166().aClass385_3595;
			LoadingStage.method6683(Class11.anInt122, Class504.method8389((int) vector3_5.x, (int) vector3_5.z, Class4.anInt35, (byte) 51) - 200, Class266.anInt3289, i_3, i_4, (i_3 >> 3) * 3 + 600 << 2, i_0, 1500551332);
			float f_6 = 1.0F - (float) ((100 - i_2) * (100 - i_2) * (100 - i_2)) / 1000000.0F;
			IdentitiKitIndexLoader.anInt361 = (int) ((float) Class186.anInt2349 + f_6 * (float) (IdentitiKitIndexLoader.anInt361 - Class186.anInt2349));
			Class109_Sub1.anInt9384 = (int) ((float) Transform_Sub1_Sub2.anInt9461 + f_6 * (float) (Class109_Sub1.anInt9384 - Transform_Sub1_Sub2.anInt9461));
			Class246.anInt3029 = (int) ((float) (Class246.anInt3029 - Node_Sub15_Sub1.anInt9575) * f_6 + (float) Node_Sub15_Sub1.anInt9575);
			Class293.anInt3512 = (int) ((float) ClipMap.anInt3968 + f_6 * (float) (Class293.anInt3512 - ClipMap.anInt3968));
			int i_7 = AnimationDefinitions.anInt5930 - ParamIndexLoader.anInt5029;
			if (i_7 > 8192) {
				i_7 -= 16384;
			} else if (i_7 < -8192) {
				i_7 += 16384;
			}
			AnimationDefinitions.anInt5930 = (int) ((float) ParamIndexLoader.anInt5029 + f_6 * (float) i_7);
			AnimationDefinitions.anInt5930 &= 0x3fff;
		}
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
