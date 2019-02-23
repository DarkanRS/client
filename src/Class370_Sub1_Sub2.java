public class Class370_Sub1_Sub2 extends Class370_Sub1 {

	byte[] aByteArray10215;

	byte[] method15614(int i_1, int i_2, int i_3) {
		this.aByteArray10215 = new byte[i_3 * i_2 * i_1 * 2];
		this.method6322(i_1, i_2, i_3);
		return this.aByteArray10215;
	}

	Class370_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	void method12508(int i_1, byte b_2) {
		int i_3 = i_1 * 2;
		int i_4 = b_2 & 0xff;
		this.aByteArray10215[i_3++] = (byte) (i_4 * 3 >> 5);
		this.aByteArray10215[i_3] = (byte) (i_4 * 3 >> 5);
	}

}
