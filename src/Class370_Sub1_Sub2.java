public class Class370_Sub1_Sub2 extends Class370_Sub1 {

	byte[] aByteArray10215;

	byte[] method15614() {
		this.aByteArray10215 = new byte[16 * 128 * 128 * 2];
		this.method6322(128, 128, 16);
		return this.aByteArray10215;
	}

	Class370_Sub1_Sub2() {
		super();
	}

	void method12508(int i_1, byte b_2) {
		int i_3 = i_1 * 2;
		int i_4 = b_2 & 0xff;
		this.aByteArray10215[i_3++] = (byte) (i_4 * 3 >> 5);
		this.aByteArray10215[i_3] = (byte) (i_4 * 3 >> 5);
	}

}
