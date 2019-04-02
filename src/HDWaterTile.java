public class HDWaterTile {

	public static Class496 aClass496_952;
	public int color;
	public int scale;
	public int intensity;
	int anInt948;
	public int hdWaterInt1;
	public int hdWaterInt2;
	public int hdWaterInt3;

	public HDWaterTile() {
		this.color = 1583160;
		this.scale = 40;
		this.intensity = 127;
		this.anInt948 = 63;
		this.hdWaterInt1 = 0;
		this.hdWaterInt2 = 0;
		this.hdWaterInt3 = 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof HDWaterTile))
			return false;
		HDWaterTile tile = (HDWaterTile) obj;
		return this.color == tile.color && this.scale == tile.scale && this.intensity == tile.intensity && this.anInt948 == tile.anInt948 && this.hdWaterInt1 == tile.hdWaterInt1 && this.hdWaterInt2 == tile.hdWaterInt2 && this.hdWaterInt3 == tile.hdWaterInt3;
	}
}
