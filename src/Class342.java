public class Class342 {

	int anInt4002;
	int anInt4000;
	int anInt3999;
	int anInt4003;
	int anInt4004;
	int anInt4006;
	int anInt4001;
	int anInt4007;
	int anInt3997 = 2;
	int[] anIntArray4005 = new int[2];
	int[] anIntArray3998 = new int[2];

	final void method6076(RsByteBuffer rsbytebuffer_1) {
		this.anInt4002 = rsbytebuffer_1.readUnsignedByte();
		this.anInt4000 = rsbytebuffer_1.readInt();
		this.anInt3999 = rsbytebuffer_1.readInt();
		this.method6086(rsbytebuffer_1);
	}

	final void method6078() {
		this.anInt4003 = 0;
		this.anInt4004 = 0;
		this.anInt4006 = 0;
		this.anInt4001 = 0;
		this.anInt4007 = 0;
	}

	Class342() {
		this.anIntArray4005[0] = 0;
		this.anIntArray4005[1] = 65535;
		this.anIntArray3998[0] = 0;
		this.anIntArray3998[1] = 65535;
	}

	final void method6086(RsByteBuffer rsbytebuffer_1) {
		this.anInt3997 = rsbytebuffer_1.readUnsignedByte();
		this.anIntArray4005 = new int[this.anInt3997];
		this.anIntArray3998 = new int[this.anInt3997];

		for (int i_2 = 0; i_2 < this.anInt3997; i_2++) {
			this.anIntArray4005[i_2] = rsbytebuffer_1.readUnsignedShort();
			this.anIntArray3998[i_2] = rsbytebuffer_1.readUnsignedShort();
		}

	}

	final int method6087(int i_1) {
		if (this.anInt4007 >= this.anInt4003) {
			this.anInt4001 = this.anIntArray3998[this.anInt4004++] << 15;
			if (this.anInt4004 >= this.anInt3997) {
				this.anInt4004 = this.anInt3997 - 1;
			}

			this.anInt4003 = (int) ((double) this.anIntArray4005[this.anInt4004] / 65536.0D * (double) i_1);
			if (this.anInt4003 > this.anInt4007) {
				this.anInt4006 = ((this.anIntArray3998[this.anInt4004] << 15) - this.anInt4001) / (this.anInt4003 - this.anInt4007);
			}
		}

		this.anInt4001 += this.anInt4006;
		++this.anInt4007;
		return this.anInt4001 - this.anInt4006 >> 15;
	}

}
