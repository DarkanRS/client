public class Class3 implements Interface42 {

	static int[] anIntArray27 = new int[32];

	IterableNodeMap aClass465_28 = new IterableNodeMap(128);

	int[] anIntArray25;

	public int[] anIntArray26;

	static {
		int i_0 = 2;
		for (int i_1 = 0; i_1 < 32; i_1++) {
			anIntArray27[i_1] = i_0 - 1;
			i_0 += i_0;
		}
	}

	public int method242(int i_1) {
		Class226 class226_2 = IndexLoaders.aClass230_147.method3897(i_1, (byte) 13);
		int i_3 = -1764754967 * class226_2.anInt2784 * -1882165671;
		int i_4 = -1174362995 * class226_2.anInt2785 * -1187004859;
		int i_5 = class226_2.anInt2783 * -1434404187 * -188179155;
		int i_6 = anIntArray27[i_5 - i_4];
		return this.anIntArray26[i_3] >> i_4 & i_6;
	}

	int poll(boolean bool_1) {
		long long_3 = TextureDetails.time();
		for (Class282_Sub45 class282_sub45_5 = (Class282_Sub45) (bool_1 ? this.aClass465_28.method7750(-1019501860) : this.aClass465_28.method7751((byte) 13)); class282_sub45_5 != null; class282_sub45_5 = (Class282_Sub45) this.aClass465_28.method7751((byte) 105)) {
			if ((class282_sub45_5.aLong8066 & 0x3fffffffffffffffL) < long_3) {
				if ((class282_sub45_5.aLong8066 & 0x4000000000000000L) != 0L) {
					int i_6 = (int) class282_sub45_5.data;
					this.anIntArray26[i_6] = this.anIntArray25[i_6];
					class282_sub45_5.remove();
					return i_6;
				}
				class282_sub45_5.remove();
			}
		}
		return -1;
	}

	void method265(int i_1) {
		for (int i_2 = 0; i_2 < IndexLoaders.aClass377_1065.anInt4519; i_2++) {
			this.anIntArray25[i_2] = 0;
			this.anIntArray26[i_2] = 0;
		}
		this.aClass465_28 = new IterableNodeMap(128);
	}

	public void method266(int i_1, int i_2, int i_3) {
		this.anIntArray26[i_1] = i_2;
		Class282_Sub45 class282_sub45_4 = (Class282_Sub45) this.aClass465_28.get((long) i_1);
		if (class282_sub45_4 != null) {
			class282_sub45_4.aLong8066 = TextureDetails.time() + 500L;
		} else {
			class282_sub45_4 = new Class282_Sub45(TextureDetails.time() + 500L);
			this.aClass465_28.put(class282_sub45_4, (long) i_1);
		}
	}

	public int method236(int i_1) {
		return this.anIntArray26[i_1];
	}

	void method268(int i_1, int i_2, int i_3) {
		Class226 class226_4 = IndexLoaders.aClass230_147.method3897(i_1, (byte) 29);
		int i_5 = class226_4.anInt2784;
		int i_6 = class226_4.anInt2785;
		int i_7 = class226_4.anInt2783;
		int i_8 = anIntArray27[i_7 - i_6];
		if (i_2 < 0 || i_2 > i_8) {
			i_2 = 0;
		}
		i_8 <<= i_6;
		this.method281(i_5, this.anIntArray25[i_5] & ~i_8 | i_2 << i_6 & i_8, (byte) 73);
	}

	public int method241(int i_1, int i_2) {
		Class226 class226_3 = IndexLoaders.aClass230_147.method3897(i_1, (byte) 125);
		int i_4 = class226_3.anInt2784;
		int i_5 = class226_3.anInt2785;
		int i_6 = class226_3.anInt2783;
		int i_7 = anIntArray27[i_6 - i_5];
		return this.anIntArray26[i_4] >> i_5 & i_7;
	}

	public Class3() {
		this.anIntArray25 = new int[IndexLoaders.aClass377_1065.anInt4519];
		this.anIntArray26 = new int[IndexLoaders.aClass377_1065.anInt4519];
	}

	public int method238(int i_1) {
		return this.anIntArray26[i_1];
	}

	public void method280(int i_1, int i_2) {
		Class226 class226_4 = IndexLoaders.aClass230_147.method3897(i_1, (byte) 58);
		int i_5 = class226_4.anInt2784;
		int i_6 = class226_4.anInt2785;
		int i_7 = class226_4.anInt2783;
		int i_8 = anIntArray27[i_7 - i_6];
		if (i_2 < 0 || i_2 > i_8) {
			i_2 = 0;
		}
		i_8 <<= i_6;
		this.method266(i_5, this.anIntArray26[i_5] & ~i_8 | i_2 << i_6 & i_8, 682938464);
	}

	public int method239(int i_1) {
		return this.anIntArray26[i_1];
	}

	public int method237(int i_1) {
		return this.anIntArray26[i_1];
	}

	public int method240(int i_1, int i_2) {
		return this.anIntArray26[i_1];
	}

	void method281(int i_1, int i_2, byte b_3) {
		this.anIntArray25[i_1] = i_2;
		Class282_Sub45 class282_sub45_4 = (Class282_Sub45) this.aClass465_28.get((long) i_1);
		if (class282_sub45_4 != null) {
			if (class282_sub45_4.aLong8066 != 4611686018427387905L) {
				class282_sub45_4.aLong8066 = TextureDetails.time() + 500L | 0x4000000000000000L;
			}
		} else {
			class282_sub45_4 = new Class282_Sub45(4611686018427387905L);
			this.aClass465_28.put(class282_sub45_4, (long) i_1);
		}
	}

	public static int method282(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		if ((i_5 & 0x1) == 1) {
			int i_7 = i_3;
			i_3 = i_4;
			i_4 = i_7;
		}
		i_2 &= 0x3;
		return i_2 == 0 ? i_1 : (i_2 == 1 ? 7 - i_0 - (i_3 - 1) : (i_2 == 2 ? 7 - i_1 - (i_4 - 1) : i_0));
	}

	public static int method285(int i_0, int i_1) {
		int i_3;
		for (i_3 = 0; i_1 > 0; --i_1) {
			i_3 = i_3 << 1 | i_0 & 0x1;
			i_0 >>>= 1;
		}
		return i_3;
	}

	static Class275_Sub2 method286() {
		Class275_Sub2 class275_sub2_1 = (Class275_Sub2) Class275_Sub2.aClass457_7745.method7648(1622132188);
		if (class275_sub2_1 != null) {
			--Class275_Sub2.anInt7741;
			return class275_sub2_1;
		} else {
			return new Class275_Sub2();
		}
	}
}
