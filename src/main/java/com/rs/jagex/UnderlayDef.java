package com.rs.jagex;

public class UnderlayDef {

	public int g;
	public int b;
	public int a;
	public int r;
	public int texture = -1;
	public int scale = 512;
	public boolean blockShadow = true;
	public boolean aBool5722 = true;
	int rgb;

	void decode(ByteBuf packet) {
		while (true) {
			int i_3 = packet.readUnsignedByte();
			if (i_3 == 0)
				return;
			decodeOpcode(packet, i_3);
		}
	}

	void decodeOpcode(ByteBuf packet, int opcode) {
		if (opcode == 1) {
			rgb = packet.read24BitUnsignedInteger();
			method8048(rgb);
		} else if (opcode == 2) {
			texture = packet.readUnsignedShort();
			if (texture == 65535)
				texture = -1;
		} else if (opcode == 3)
			scale = packet.readUnsignedShort() << 2;
		else if (opcode == 4)
			blockShadow = false;
		else if (opcode == 5)
			aBool5722 = false;

	}

	void method8048(int i_1) {
		double d_3 = (i_1 >> 16 & 0xff) / 256.0D;
		double d_5 = (i_1 >> 8 & 0xff) / 256.0D;
		double d_7 = (i_1 & 0xff) / 256.0D;
		double d_9 = d_3;
		if (d_5 < d_3)
			d_9 = d_5;

		if (d_7 < d_9)
			d_9 = d_7;

		double d_11 = d_3;
		if (d_5 > d_3)
			d_11 = d_5;

		if (d_7 > d_11)
			d_11 = d_7;

		double d_13 = 0.0D;
		double d_15 = 0.0D;
		double d_17 = (d_11 + d_9) / 2.0D;
		if (d_11 != d_9) {
			if (d_17 < 0.5D)
				d_15 = (d_11 - d_9) / (d_11 + d_9);

			if (d_17 >= 0.5D)
				d_15 = (d_11 - d_9) / (2.0D - d_11 - d_9);

			if (d_3 == d_11)
				d_13 = (d_5 - d_7) / (d_11 - d_9);
			else if (d_11 == d_5)
				d_13 = 2.0D + (d_7 - d_3) / (d_11 - d_9);
			else if (d_11 == d_7)
				d_13 = (d_3 - d_5) / (d_11 - d_9) + 4.0D;
		}

		d_13 /= 6.0D;
		g = (int) (d_15 * 256.0D);
		b = (int) (256.0D * d_17);
		if (g < 0)
			g = 0;
		else if (g > 255)
			g = 255;

		if (b < 0)
			b = 0;
		else if (b > 255)
			b = 255;

		if (d_17 > 0.5D)
			a = (int) (d_15 * (1.0D - d_17) * 512.0D);
		else
			a = (int) (d_15 * d_17 * 512.0D);

		if (a < 1)
			a = 1;

		r = (int) (d_13 * a);
	}

}
