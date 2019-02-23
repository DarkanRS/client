public class Class370_Sub2_Sub1 extends Class370_Sub2 {

	byte[] aByteArray10022;

	void method12517(int i_1, byte b_2) {
		int i_3 = i_1 * 2;
		b_2 = (byte) (((b_2 & 0xff) >> 1) + 127);
		this.aByteArray10022[i_3++] = b_2;
		this.aByteArray10022[i_3] = b_2;
	}

	byte[] method15442(int i_1, int i_2, int i_3) {
		this.aByteArray10022 = new byte[i_3 * i_2 * i_1 * 2];
		this.method6322(i_1, i_2, i_3);
		return this.aByteArray10022;
	}

	Class370_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

}
