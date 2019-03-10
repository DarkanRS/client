public class Class89 {

	public static int[] anIntArray931 = new int[] { 3, 7, 15 };

	public static int[] anIntArray934 = new int[] { 2047, 16383, 65535 };

	Class89() throws Throwable {
		throw new Error();
	}

	static void method1496(byte[] bytes_0, int i_1) {
		RsByteBuffer rsbytebuffer_2 = new RsByteBuffer(bytes_0);
		while (true) {
			int i_3 = rsbytebuffer_2.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			if (i_3 == 1) {
				int i_4 = rsbytebuffer_2.readUnsignedShort();
				if (Class260.anInt3228 == -1) {
					Class260.anInt3228 = i_4;
				}
			}
		}
	}

	static void method1502(int i_0) {
		if (Class427.anInt5123 < 0) {
			Class427.anInt5123 = 0;
			Class291_Sub1.anInt8014 = -1;
			Class291_Sub1.anInt8016 = -1;
		}
		if (Class427.anInt5123 > Class291_Sub1.xLength) {
			Class427.anInt5123 = Class291_Sub1.xLength;
			Class291_Sub1.anInt8014 = -1;
			Class291_Sub1.anInt8016 = -1;
		}
		if (Class475.anInt5624 < 0) {
			Class475.anInt5624 = 0;
			Class291_Sub1.anInt8014 = -1;
			Class291_Sub1.anInt8016 = -1;
		}
		if (Class475.anInt5624 > Class291_Sub1.yLength) {
			Class475.anInt5624 = Class291_Sub1.yLength;
			Class291_Sub1.anInt8014 = -1;
			Class291_Sub1.anInt8016 = -1;
		}
	}

	static void method1503(int i_0, int i_1) {
		Class427.anInt5123 = i_0;
		Class291_Sub1.anInt8014 = -1;
		Class291_Sub1.anInt8016 = -1;
		method1502(-1202375965);
	}

	public static final void sleep(long long_0) {
		if (long_0 > 0L) {
			if (long_0 % 10L == 0L) {
				Class350_Sub3_Sub1.method15560(long_0 - 1L);
				Class350_Sub3_Sub1.method15560(1L);
			} else {
				Class350_Sub3_Sub1.method15560(long_0);
			}
		}
	}
}
