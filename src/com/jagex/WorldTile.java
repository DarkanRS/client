package com.jagex;
public class WorldTile {

	static Index PARTICLE_INDEX;
	public int plane;
	public int x;
	public int y;

	public String toString() {
		return this.plane + "," + (this.x >> 6) + "," + (this.y >> 6) + "," + (this.x & 0x3f) + "," + (this.y & 0x3f);
	}

	public WorldTile(int i_1) {
		if (i_1 == -1) {
			this.plane = -1;
		} else {
			this.plane = i_1 >> 28 & 0x3;
			this.x = i_1 >> 14 & 0x3fff;
			this.y = i_1 & 0x3fff;
		}
	}

	public WorldTile() {
		this.plane = -1;
	}

	public WorldTile(int i_1, int i_2, int i_3) {
		this.plane = i_1;
		this.x = i_2;
		this.y = i_3;
	}
}
