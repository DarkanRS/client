package com.rs.jagex;

public class Class370_Sub2_Sub2 extends Class370_Sub2 {

	byte[] aByteArray10219;

	Class370_Sub2_Sub2() {
	}

	@Override
	void method12517(int i_1, byte b_2) {
		int i_3 = i_1 * 2;
		b_2 = (byte) (((b_2 & 0xff) >> 1) + 127);
		aByteArray10219[i_3++] = b_2;
		aByteArray10219[i_3] = b_2;
	}

	byte[] method15617() {
		aByteArray10219 = new byte[524288];
		method6322();
		return aByteArray10219;
	}

}
