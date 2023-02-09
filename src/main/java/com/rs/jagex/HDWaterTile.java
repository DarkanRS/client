package com.rs.jagex;

public class HDWaterTile {

	public int color;
	public int scale;
	public int intensity;
	public int hdWaterInt1;
	public int hdWaterInt2;
	public int hdWaterInt3;
	int anInt948;

	public HDWaterTile() {
		color = 1583160;
		scale = 40;
		intensity = 127;
		anInt948 = 63;
		hdWaterInt1 = 0;
		hdWaterInt2 = 0;
		hdWaterInt3 = 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof HDWaterTile tile))
			return false;
		return color == tile.color && scale == tile.scale && intensity == tile.intensity && anInt948 == tile.anInt948 && hdWaterInt1 == tile.hdWaterInt1 && hdWaterInt2 == tile.hdWaterInt2 && hdWaterInt3 == tile.hdWaterInt3;
	}
}
