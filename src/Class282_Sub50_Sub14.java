public class Class282_Sub50_Sub14 extends CacheableNode {

	public String aString9744;
	public int[] anIntArray9746;
	public char[] aCharArray9745;
	public int[] anIntArray9747;
	public char[] aCharArray9748;

	void method15209(RsByteBuffer rsbytebuffer_1, int i_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method15210(rsbytebuffer_1, i_3, (byte) -71);
		}
	}

	void method15210(RsByteBuffer rsbytebuffer_1, int i_2, byte b_3) {
		if (i_2 == 1) {
			this.aString9744 = rsbytebuffer_1.readString();
		} else {
			int i_4;
			int i_5;
			byte b_6;
			if (i_2 == 2) {
				i_4 = rsbytebuffer_1.readUnsignedByte();
				this.anIntArray9746 = new int[i_4];
				this.aCharArray9745 = new char[i_4];

				for (i_5 = 0; i_5 < i_4; i_5++) {
					this.anIntArray9746[i_5] = rsbytebuffer_1.readUnsignedShort();
					b_6 = rsbytebuffer_1.readByte();
					this.aCharArray9745[i_5] = b_6 == 0 ? 0 : Class11.getChar(b_6, 1677278079);
				}
			} else if (i_2 == 3) {
				i_4 = rsbytebuffer_1.readUnsignedByte();
				this.anIntArray9747 = new int[i_4];
				this.aCharArray9748 = new char[i_4];

				for (i_5 = 0; i_5 < i_4; i_5++) {
					this.anIntArray9747[i_5] = rsbytebuffer_1.readUnsignedShort();
					b_6 = rsbytebuffer_1.readByte();
					this.aCharArray9748[i_5] = b_6 == 0 ? 0 : Class11.getChar(b_6, -1266805306);
				}
			} else if (i_2 == 4) {
				;
			}
		}

	}

	public int method15211(char var_1, int i_2) {
		if (this.anIntArray9746 == null) {
			return -1;
		} else {
			for (int i_3 = 0; i_3 < this.anIntArray9746.length; i_3++) {
				if (this.aCharArray9745[i_3] == var_1) {
					return this.anIntArray9746[i_3];
				}
			}

			return -1;
		}
	}

	public int method15212(char var_1, byte b_2) {
		if (this.anIntArray9747 == null) {
			return -1;
		} else {
			for (int i_3 = 0; i_3 < this.anIntArray9747.length; i_3++) {
				if (this.aCharArray9748[i_3] == var_1) {
					return this.anIntArray9747[i_3];
				}
			}

			return -1;
		}
	}

	void method15213(int i_1) {
		int i_2;
		if (this.anIntArray9747 != null) {
			for (i_2 = 0; i_2 < this.anIntArray9747.length; i_2++) {
				this.anIntArray9747[i_2] |= 0x8000;
			}
		}

		if (this.anIntArray9746 != null) {
			for (i_2 = 0; i_2 < this.anIntArray9746.length; i_2++) {
				this.anIntArray9746[i_2] |= 0x8000;
			}
		}

	}

}
