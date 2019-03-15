public class Class370_Sub2_Sub2 extends Class370_Sub2 {

	byte[] aByteArray10219;

	Class370_Sub2_Sub2() {
		super();
	}

	byte[] method15617() {
		this.aByteArray10219 = new byte[16 * 128 * 128 * 2];
		this.method6322(128, 128, 16);
		return this.aByteArray10219;
	}

	void method12517(int i_1, byte b_2) {
		int i_3 = i_1 * 2;
		b_2 = (byte) (((b_2 & 0xff) >> 1) + 127);
		this.aByteArray10219[i_3++] = b_2;
		this.aByteArray10219[i_3] = b_2;
	}

}
