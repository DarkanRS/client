package com.rs.jagex;

public class KeyHoldInputSubscriber implements InputSubscriber {

	public static int LOYALTY_BALANCE;
	static int anInt2878;
	public static KeyHoldInputSubscriber decode(ByteBuf rsbytebuffer_0) {
		int count = rsbytebuffer_0.readUnsignedByte();
		int[] requiredKeys = new int[count];
		for (int i_4 = 0; i_4 < count; i_4++)
			requiredKeys[i_4] = rsbytebuffer_0.readUnsignedByte();
		return new KeyHoldInputSubscriber(requiredKeys);
	}

	static void method3922(int[] ints_0, int i_1, int i_2, int i_3) {
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

	int[] requiredKeys;

	KeyHoldInputSubscriber(int[] ints_1) {
		requiredKeys = ints_1;
	}

	public boolean method126(KeyRecorder class199_4) {
		int[] ints_5 = requiredKeys;
		for (int i_7 : ints_5) {
			if (!class199_4.held(i_7))
				return false;
		}
		return true;
	}

	public boolean method128(KeyRecorder class199_4) {
		int[] ints_5 = requiredKeys;
		for (int i_7 : ints_5) {
			if (!class199_4.held(i_7))
				return false;
		}
		return true;
	}

	public boolean method129(KeyRecorder class199_4) {
		int[] ints_5 = requiredKeys;
		for (int i_7 : ints_5) {
			if (!class199_4.held(i_7))
				return false;
		}
		return true;
	}

	@Override
	public boolean valid(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, KeyRecorder class199_4) {
		int[] ints_6 = requiredKeys;
		for (int i_8 : ints_6) {
			if (!class199_4.held(i_8))
				return false;
		}
		return true;
	}
}
