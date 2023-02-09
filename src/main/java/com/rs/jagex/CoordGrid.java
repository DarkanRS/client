package com.rs.jagex;

public class CoordGrid {

	static Index PARTICLE_INDEX;
	public int plane;
	public int x;
	public int y;

	public CoordGrid() {
		plane = -1;
	}

	public CoordGrid(int i_1) {
		if (i_1 == -1)
			plane = -1;
		else {
			plane = i_1 >> 28 & 0x3;
			x = i_1 >> 14 & 0x3fff;
			y = i_1 & 0x3fff;
		}
	}

	public CoordGrid(int i_1, int i_2, int i_3) {
		plane = i_1;
		x = i_2;
		y = i_3;
	}

	@Override
	public String toString() {
		return plane + "," + (x >> 6) + "," + (y >> 6) + "," + (x & 0x3f) + "," + (y & 0x3f);
	}
}
