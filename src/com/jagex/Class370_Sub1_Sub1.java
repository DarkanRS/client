package com.jagex;
public class Class370_Sub1_Sub1 extends Class370_Sub1 {

	byte[] aByteArray9998;

	byte[] method15431() {
		this.aByteArray9998 = new byte[16 * 128 * 128 * 2];
		this.method6322();
		return this.aByteArray9998;
	}

	void method12508(int i_1, byte b_2) {
		int i_3 = i_1 * 2;
		int i_4 = b_2 & 0xff;
		this.aByteArray9998[i_3++] = -1;
		this.aByteArray9998[i_3] = (byte) (i_4 * 3 >> 5);
	}

	Class370_Sub1_Sub1() {
		super();
	}

}
