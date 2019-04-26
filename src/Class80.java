public class Class80 {

	static byte[] aByteArray784 = new byte[] { (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
	int anInt785;
	int anInt790;
	int[] anIntArray793;
	long aLong786;
	int[] anIntArray787;
	int[] anIntArray788;
	int[] anIntArray796;
	RsByteBuffer aNode_Sub35_792 = new RsByteBuffer((byte[]) null);

	void method1392(int i_1) {
		int i_2 = this.aNode_Sub35_792.method13099(2005906318);
		this.anIntArray788[i_1] += i_2;
	}

	int method1393() {
		int i_1 = this.anIntArray787.length;
		int i_2 = -1;
		int i_3 = Integer.MAX_VALUE;

		for (int i_4 = 0; i_4 < i_1; i_4++) {
			if (this.anIntArray787[i_4] >= 0 && this.anIntArray788[i_4] < i_3) {
				i_2 = i_4;
				i_3 = this.anIntArray788[i_4];
			}
		}

		return i_2;
	}

	void method1394(byte[] bytes_1) {
		this.aNode_Sub35_792.buffer = bytes_1;
		this.aNode_Sub35_792.index = 10;
		int i_2 = this.aNode_Sub35_792.readUnsignedShort();
		this.anInt785 = this.aNode_Sub35_792.readUnsignedShort();
		this.anInt790 = 500000;
		this.anIntArray793 = new int[i_2];

		int i_3;
		int i_5;
		for (i_3 = 0; i_3 < i_2; this.aNode_Sub35_792.index += i_5) {
			int i_4 = this.aNode_Sub35_792.readInt();
			i_5 = this.aNode_Sub35_792.readInt();
			if (i_4 == 1297379947) {
				this.anIntArray793[i_3] = this.aNode_Sub35_792.index;
				++i_3;
			}
		}

		this.aLong786 = 0L;
		this.anIntArray787 = new int[i_2];

		for (i_3 = 0; i_3 < i_2; i_3++) {
			this.anIntArray787[i_3] = this.anIntArray793[i_3];
		}

		this.anIntArray788 = new int[i_2];
		this.anIntArray796 = new int[i_2];
	}

	void method1395() {
		this.aNode_Sub35_792.buffer = null;
		this.anIntArray793 = null;
		this.anIntArray787 = null;
		this.anIntArray788 = null;
		this.anIntArray796 = null;
	}

	int method1397() {
		return this.anIntArray787.length;
	}

	void method1398(int i_1) {
		this.aNode_Sub35_792.index = this.anIntArray787[i_1];
	}

	Class80(byte[] bytes_1) {
		this.method1394(bytes_1);
	}

	void method1400() {
		this.aNode_Sub35_792.index = -1;
	}

	int method1401(int i_1) {
		int i_2 = this.method1423(i_1);
		return i_2;
	}

	long method1403(int i_1) {
		return this.aLong786 + (long) i_1 * (long) this.anInt790;
	}

	void method1404(int i_1) {
		this.anIntArray787[i_1] = this.aNode_Sub35_792.index;
	}

	boolean method1405() {
		int i_1 = this.anIntArray787.length;

		for (int i_2 = 0; i_2 < i_1; i_2++) {
			if (this.anIntArray787[i_2] >= 0) {
				return false;
			}
		}

		return true;
	}

	void method1406(long long_1) {
		this.aLong786 = long_1;
		int i_3 = this.anIntArray787.length;

		for (int i_4 = 0; i_4 < i_3; i_4++) {
			this.anIntArray788[i_4] = 0;
			this.anIntArray796[i_4] = 0;
			this.aNode_Sub35_792.index = this.anIntArray793[i_4];
			this.method1392(i_4);
			this.anIntArray787[i_4] = this.aNode_Sub35_792.index;
		}

	}

	boolean method1409() {
		return this.aNode_Sub35_792.buffer != null;
	}

	int method1412(int i_1, int i_2) {
		int i_4;
		if (i_2 == 255) {
			int i_7 = this.aNode_Sub35_792.readUnsignedByte();
			i_4 = this.aNode_Sub35_792.method13099(-873046353);
			if (i_7 == 47) {
				this.aNode_Sub35_792.index += i_4;
				return 1;
			} else if (i_7 == 81) {
				int i_5 = this.aNode_Sub35_792.read24BitUnsignedInteger();
				i_4 -= 3;
				int i_6 = this.anIntArray788[i_1];
				this.aLong786 += (long) i_6 * (long) (this.anInt790 - i_5);
				this.anInt790 = i_5;
				this.aNode_Sub35_792.index += i_4;
				return 2;
			} else {
				this.aNode_Sub35_792.index += i_4;
				return 3;
			}
		} else {
			byte b_3 = aByteArray784[i_2 - 128];
			i_4 = i_2;
			if (b_3 >= 1) {
				i_4 = i_2 | this.aNode_Sub35_792.readUnsignedByte() << 8;
			}

			if (b_3 >= 2) {
				i_4 |= this.aNode_Sub35_792.readUnsignedByte() << 16;
			}

			return i_4;
		}
	}

	int method1423(int i_1) {
		byte b_2 = this.aNode_Sub35_792.buffer[this.aNode_Sub35_792.index];
		int i_5;
		if (b_2 < 0) {
			i_5 = b_2 & 0xff;
			this.anIntArray796[i_1] = i_5;
			++this.aNode_Sub35_792.index;
		} else {
			i_5 = this.anIntArray796[i_1];
		}

		if (i_5 != 240 && i_5 != 247) {
			return this.method1412(i_1, i_5);
		} else {
			int i_3 = this.aNode_Sub35_792.method13099(57806040);
			if (i_5 == 247 && i_3 > 0) {
				int i_4 = this.aNode_Sub35_792.buffer[this.aNode_Sub35_792.index] & 0xff;
				if (i_4 >= 241 && i_4 <= 243 || i_4 == 246 || i_4 == 248 || i_4 >= 250 && i_4 <= 252 || i_4 == 254) {
					++this.aNode_Sub35_792.index;
					this.anIntArray796[i_1] = i_4;
					return this.method1412(i_1, i_4);
				}
			}

			this.aNode_Sub35_792.index += i_3;
			return 0;
		}
	}

	Class80() {
	}

}
