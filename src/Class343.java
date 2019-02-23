public class Class343 {

	Class248[] aClass248Array4009 = new Class248[10];
	int anInt4011;
	int anInt4008;

	Class343(RsByteBuffer rsbytebuffer_1) {
		for (int i_2 = 0; i_2 < 10; i_2++) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 != 0) {
				--rsbytebuffer_1.index;
				this.aClass248Array4009[i_2] = new Class248();
				this.aClass248Array4009[i_2].method4255(rsbytebuffer_1);
			}
		}

		this.anInt4011 = rsbytebuffer_1.readUnsignedShort();
		this.anInt4008 = rsbytebuffer_1.readUnsignedShort();
	}

	public Class282_Sub26_Sub1_Sub2 method6089() {
		byte[] bytes_1 = this.method6091();
		return new Class282_Sub26_Sub1_Sub2(22050, bytes_1, this.anInt4011 * 22050 / 1000, this.anInt4008 * 22050 / 1000);
	}

	public final int method6090() {
		int i_1 = 9999999;

		int i_2;
		for (i_2 = 0; i_2 < 10; i_2++) {
			if (this.aClass248Array4009[i_2] != null && this.aClass248Array4009[i_2].anInt3076 / 20 < i_1) {
				i_1 = this.aClass248Array4009[i_2].anInt3076 / 20;
			}
		}

		if (this.anInt4011 < this.anInt4008 && this.anInt4011 / 20 < i_1) {
			i_1 = this.anInt4011 / 20;
		}

		if (i_1 != 9999999 && i_1 != 0) {
			for (i_2 = 0; i_2 < 10; i_2++) {
				if (this.aClass248Array4009[i_2] != null) {
					this.aClass248Array4009[i_2].anInt3076 -= i_1 * 20;
				}
			}

			if (this.anInt4011 < this.anInt4008) {
				this.anInt4011 -= i_1 * 20;
				this.anInt4008 -= i_1 * 20;
			}

			return i_1;
		} else {
			return 0;
		}
	}

	final byte[] method6091() {
		int i_1 = 0;

		int i_2;
		for (i_2 = 0; i_2 < 10; i_2++) {
			if (this.aClass248Array4009[i_2] != null && this.aClass248Array4009[i_2].anInt3055 + this.aClass248Array4009[i_2].anInt3076 > i_1) {
				i_1 = this.aClass248Array4009[i_2].anInt3055 + this.aClass248Array4009[i_2].anInt3076;
			}
		}

		if (i_1 == 0) {
			return new byte[0];
		} else {
			i_2 = i_1 * 22050 / 1000;
			byte[] bytes_3 = new byte[i_2];

			for (int i_4 = 0; i_4 < 10; i_4++) {
				if (this.aClass248Array4009[i_4] != null) {
					int i_5 = this.aClass248Array4009[i_4].anInt3055 * 22050 / 1000;
					int i_6 = this.aClass248Array4009[i_4].anInt3076 * 22050 / 1000;
					int[] ints_7 = this.aClass248Array4009[i_4].method4253(i_5, this.aClass248Array4009[i_4].anInt3055);

					for (int i_8 = 0; i_8 < i_5; i_8++) {
						int i_9 = (ints_7[i_8] >> 8) + bytes_3[i_8 + i_6];
						if ((i_9 + 128 & ~0xff) != 0) {
							i_9 = i_9 >> 31 ^ 0x7f;
						}

						bytes_3[i_8 + i_6] = (byte) i_9;
					}
				}
			}

			return bytes_3;
		}
	}

	public static Class343 method6094(Index index_0, int i_1, int i_2) {
		byte[] bytes_3 = index_0.getFile(i_1, i_2);
		return bytes_3 == null ? null : new Class343(new RsByteBuffer(bytes_3));
	}

}
