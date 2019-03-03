public class UnderlayDef {

	public int g;
	public int b;
	public int a;
	public int r;
	int rgb = 0;
	public int texture = -1;
	public int scale = 512;
	public boolean blockShadow = true;
	public boolean aBool5722 = true;

	void method8048(int i_1, int i_2) {
		double d_3 = (double) (i_1 >> 16 & 0xff) / 256.0D;
		double d_5 = (double) (i_1 >> 8 & 0xff) / 256.0D;
		double d_7 = (double) (i_1 & 0xff) / 256.0D;
		double d_9 = d_3;
		if (d_5 < d_3) {
			d_9 = d_5;
		}

		if (d_7 < d_9) {
			d_9 = d_7;
		}

		double d_11 = d_3;
		if (d_5 > d_3) {
			d_11 = d_5;
		}

		if (d_7 > d_11) {
			d_11 = d_7;
		}

		double d_13 = 0.0D;
		double d_15 = 0.0D;
		double d_17 = (d_11 + d_9) / 2.0D;
		if (d_11 != d_9) {
			if (d_17 < 0.5D) {
				d_15 = (d_11 - d_9) / (d_11 + d_9);
			}

			if (d_17 >= 0.5D) {
				d_15 = (d_11 - d_9) / (2.0D - d_11 - d_9);
			}

			if (d_3 == d_11) {
				d_13 = (d_5 - d_7) / (d_11 - d_9);
			} else if (d_11 == d_5) {
				d_13 = 2.0D + (d_7 - d_3) / (d_11 - d_9);
			} else if (d_11 == d_7) {
				d_13 = (d_3 - d_5) / (d_11 - d_9) + 4.0D;
			}
		}

		d_13 /= 6.0D;
		this.g = (int) (d_15 * 256.0D);
		this.b = (int) (256.0D * d_17);
		if (this.g < 0) {
			this.g = 0;
		} else if (this.g > 255) {
			this.g = 255;
		}

		if (this.b < 0) {
			this.b = 0;
		} else if (this.b > 255) {
			this.b = 255;
		}

		if (d_17 > 0.5D) {
			this.a = (int) (d_15 * (1.0D - d_17) * 512.0D);
		} else {
			this.a = (int) (d_15 * d_17 * 512.0D);
		}

		if (this.a < 1) {
			this.a = 1;
		}

		this.r = (int) (d_13 * (double) this.a);
	}

	void method8049(RsByteBuffer rsbytebuffer_1, int i_2, byte b_3) {
		if (i_2 == 1) {
			this.rgb = rsbytebuffer_1.read24BitUnsignedInteger();
			this.method8048(this.rgb, 1049430248);
		} else if (i_2 == 2) {
			this.texture = rsbytebuffer_1.readUnsignedShort();
			if (this.texture == 65535) {
				this.texture = -1;
			}
		} else if (i_2 == 3) {
			this.scale = rsbytebuffer_1.readUnsignedShort() << 2;
		} else if (i_2 == 4) {
			this.blockShadow = false;
		} else if (i_2 == 5) {
			this.aBool5722 = false;
		}

	}

	void method8050(RsByteBuffer rsbytebuffer_1, int i_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method8049(rsbytebuffer_1, i_3, (byte) 87);
		}
	}

}
