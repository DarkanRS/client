package com.rs.jagex;

public class Class370_Sub1_Sub2 extends Class370_Sub1 {

	byte[] aByteArray10215;

	Class370_Sub1_Sub2() {
	}

	@Override
	void method12508(int i_1, byte b_2) {
		int i_3 = i_1 * 2;
		int i_4 = b_2 & 0xff;
		aByteArray10215[i_3++] = (byte) (i_4 * 3 >> 5);
		aByteArray10215[i_3] = (byte) (i_4 * 3 >> 5);
	}

	byte[] method15614() {
		aByteArray10215 = new byte[524288];
		method6322();
		return aByteArray10215;
	}

}
