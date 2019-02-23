public class RsBitsBuffer extends RsByteBuffer {

	static int[] anIntArray9610 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
	IsaacCipher isaac;
	int anInt9608;

	public void setIsaacCipher(IsaacCipher isaaccipher_1, int i_2) {
		this.isaac = isaaccipher_1;
	}

	public boolean method14869(short s_1) {
		int i_2 = this.buffer[this.index] - this.isaac.method7255(-44751888) & 0xff;
		return i_2 >= 128;
	}

	public int method14870() {
		int i_1 = this.buffer[++this.index - 1] - this.isaac.nextInt(1151052161) & 0xff;
		return i_1 < 128 ? i_1 : (i_1 - 128 << 8) + (this.buffer[++this.index - 1] - this.isaac.nextInt(843866869) & 0xff);
	}

	public int readBits(int i_1, byte b_2) {
		int i_3 = this.anInt9608 >> 3;
		int i_4 = 8 - (this.anInt9608 & 0x7);
		int i_5 = 0;

		for (this.anInt9608 += i_1; i_1 > i_4; i_4 = 8) {
			i_5 += (this.buffer[i_3++] & anIntArray9610[i_4]) << i_1 - i_4;
			i_1 -= i_4;
		}

		if (i_4 == i_1) {
			i_5 += this.buffer[i_3] & anIntArray9610[i_4];
		} else {
			i_5 += this.buffer[i_3] >> i_4 - i_1 & anIntArray9610[i_1];
		}

		return i_5;
	}

	public void initBitAccess(byte b_1) {
		this.anInt9608 = this.index * 8;
	}

	public void method14873(byte[] bytes_1, int i_2, int i_3, byte b_4) {
		for (int i_5 = 0; i_5 < i_3; i_5++) {
			bytes_1[i_5 + i_2] = (byte) (this.buffer[++this.index - 1] - this.isaac.nextInt(1542383540));
		}

	}

	public void finishBitAccess(byte b_1) {
		this.index = (this.anInt9608 + 7) / 8;
	}

	public int readableBits(int i_1, int i_2) {
		return i_1 * 8 - this.anInt9608;
	}

	public void writeIsaacByte(int i_1, int i_2) {
		this.buffer[++this.index - 1] = (byte) (i_1 + this.isaac.nextInt(1317631877));
	}

	public RsBitsBuffer(int i_1) {
		super(i_1);
	}

}
