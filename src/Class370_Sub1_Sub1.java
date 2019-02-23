public class Class370_Sub1_Sub1 extends Class370_Sub1 {

	byte[] aByteArray9998;

	byte[] method15431(int i_1, int i_2, int i_3) {
		this.aByteArray9998 = new byte[i_3 * i_2 * i_1 * 2];
		this.method6322(i_1, i_2, i_3);
		return this.aByteArray9998;
	}

	void method12508(int i_1, byte b_2) {
		int i_3 = i_1 * 2;
		int i_4 = b_2 & 0xff;
		this.aByteArray9998[i_3++] = -1;
		this.aByteArray9998[i_3] = (byte) (i_4 * 3 >> 5);
	}

	Class370_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

}
