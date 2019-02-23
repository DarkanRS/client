public class AnimationSkin {

	static short[] aShortArray976 = new short[500];
	static short[] aShortArray973 = new short[500];
	static short[] aShortArray977 = new short[500];
	static short[] aShortArray975 = new short[500];
	static short[] aShortArray979 = new short[500];
	static byte[] aByteArray991 = new byte[500];
	AnimationSkinNode skinNodeList = null;
	int anInt980 = 0;
	boolean aBool986 = false;
	boolean aBool972 = false;
	boolean aBool988 = false;
	short[] aShortArray987;
	short[] aShortArray981;
	short[] aShortArray982;
	short[] aShortArray983;
	short[] aShortArray984;
	byte[] aByteArray985;

	AnimationSkin(byte[] bytes_1, AnimationSkinNode animationskinnode_2) {
		this.skinNodeList = animationskinnode_2;

		try {
			RsByteBuffer rsbytebuffer_3 = new RsByteBuffer(bytes_1);
			RsByteBuffer rsbytebuffer_4 = new RsByteBuffer(bytes_1);
			rsbytebuffer_3.readUnsignedByte();
			rsbytebuffer_3.index += 2;
			int i_5 = rsbytebuffer_3.readUnsignedByte();
			int i_6 = 0;
			int i_7 = -1;
			int i_8 = -1;
			rsbytebuffer_4.index = i_5 + rsbytebuffer_3.index;

			int i_9;
			for (i_9 = 0; i_9 < i_5; i_9++) {
				int i_10 = this.skinNodeList.anIntArray7562[i_9];
				if (i_10 == 0) {
					i_7 = i_9;
				}

				int i_11 = rsbytebuffer_3.readUnsignedByte();
				if (i_11 > 0) {
					if (i_10 == 0) {
						i_8 = i_9;
					}

					aShortArray976[i_6] = (short) i_9;
					short s_12 = 0;
					if (i_10 == 3 || i_10 == 10) {
						s_12 = 128;
					}

					if ((i_11 & 0x1) != 0) {
						aShortArray973[i_6] = (short) rsbytebuffer_4.method13094(98798348);
					} else {
						aShortArray973[i_6] = s_12;
					}

					if ((i_11 & 0x2) != 0) {
						aShortArray977[i_6] = (short) rsbytebuffer_4.method13094(-1955143271);
					} else {
						aShortArray977[i_6] = s_12;
					}

					if ((i_11 & 0x4) != 0) {
						aShortArray975[i_6] = (short) rsbytebuffer_4.method13094(117687154);
					} else {
						aShortArray975[i_6] = s_12;
					}

					aByteArray991[i_6] = (byte) (i_11 >>> 3 & 0x3);
					if (i_10 == 2 || i_10 == 9) {
						aShortArray973[i_6] = (short) (aShortArray973[i_6] << 2 & 0x3fff);
						aShortArray977[i_6] = (short) (aShortArray977[i_6] << 2 & 0x3fff);
						aShortArray975[i_6] = (short) (aShortArray975[i_6] << 2 & 0x3fff);
					}

					aShortArray979[i_6] = -1;
					if (i_10 != 1 && i_10 != 2 && i_10 != 3) {
						if (i_10 == 5) {
							this.aBool986 = true;
						} else if (i_10 == 7) {
							this.aBool972 = true;
						} else if (i_10 == 9 || i_10 == 10 || i_10 == 8) {
							this.aBool988 = true;
						}
					} else if (i_7 > i_8) {
						aShortArray979[i_6] = (short) i_7;
						i_8 = i_7;
					}

					++i_6;
				}
			}

			if (bytes_1.length != rsbytebuffer_4.index) {
				throw new RuntimeException();
			}

			this.anInt980 = i_6;
			this.aShortArray987 = new short[i_6];
			this.aShortArray981 = new short[i_6];
			this.aShortArray982 = new short[i_6];
			this.aShortArray983 = new short[i_6];
			this.aShortArray984 = new short[i_6];
			this.aByteArray985 = new byte[i_6];

			for (i_9 = 0; i_9 < i_6; i_9++) {
				this.aShortArray987[i_9] = aShortArray976[i_9];
				this.aShortArray981[i_9] = aShortArray973[i_9];
				this.aShortArray982[i_9] = aShortArray977[i_9];
				this.aShortArray983[i_9] = aShortArray975[i_9];
				this.aShortArray984[i_9] = aShortArray979[i_9];
				this.aByteArray985[i_9] = aByteArray991[i_9];
			}
		} catch (Exception exception_13) {
			this.anInt980 = 0;
			this.aBool986 = false;
			this.aBool972 = false;
		}

	}

}
