public class OverlayDef {

	int anInt7053;

	OverlayIndexLoader aClass536_7062;

	public int anInt7052 = 8;

	public int primaryRGB = 0;

	public int texture = -1;

	public boolean aBool7056 = true;

	public int secondaryRGB = -1;

	public int anInt7057 = 512;

	public boolean aBool7059 = true;

	public boolean aBool7061 = false;

	public int waterColour = 1190717;

	public int waterScale = 512;

	public int waterIntensity = 255;

	public int anInt7065 = 63;

	public int anInt7055 = 0;

	public int anInt7067 = 64;

	void method11356(byte b_1) {
		this.anInt7052 = this.anInt7052 << 8 | this.anInt7053;
	}

	void method11357(RsByteBuffer rsbytebuffer_1, int i_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			this.method11364(rsbytebuffer_1, i_3, (byte) 14);
		}
	}

	void method11364(RsByteBuffer rsbytebuffer_1, int i_2, byte b_3) {
		if (i_2 == 1) {
			this.primaryRGB = IdentikitDefinition.method912(rsbytebuffer_1.read24BitUnsignedInteger(), 2117926535);
		} else if (i_2 == 2) {
			this.texture = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 3) {
			this.texture = rsbytebuffer_1.readUnsignedShort();
			if (this.texture == 65535) {
				this.texture = -1;
			}
		} else if (i_2 == 5) {
			this.aBool7056 = false;
		} else if (i_2 == 7) {
			this.secondaryRGB = IdentikitDefinition.method912(rsbytebuffer_1.read24BitUnsignedInteger(), 2117926535);
		} else if (i_2 == 8) {
			this.aClass536_7062.anInt7093 = this.anInt7053;
		} else if (i_2 == 9) {
			this.anInt7057 = rsbytebuffer_1.readUnsignedShort() << 2;
		} else if (i_2 == 10) {
			this.aBool7059 = false;
		} else if (i_2 == 11) {
			this.anInt7052 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 12) {
			this.aBool7061 = true;
		} else if (i_2 == 13) {
			this.waterColour = rsbytebuffer_1.read24BitUnsignedInteger();
		} else if (i_2 == 14) {
			this.waterScale = (rsbytebuffer_1.readUnsignedByte() << 2);
		} else if (i_2 == 16) {
			this.waterIntensity = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 20) {
			this.anInt7065 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 21) {
			this.anInt7055 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 22) {
			this.anInt7067 = rsbytebuffer_1.readUnsignedShort();
		}
	}
}
