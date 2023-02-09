package com.rs.jagex;

public class OverlayDef {

	public int anInt7052 = 8;
	public int primaryRGB;
	public int texture = -1;
	public boolean aBool7056 = true;
	public int secondaryRGB = -1;
	public int anInt7057 = 512;
	public boolean aBool7059 = true;
	public boolean aBool7061;
	public int waterColour = 1190717;
	public int waterScale = 512;
	public int waterIntensity = 255;
	public int anInt7065 = 63;
	public int anInt7055;
	public int anInt7067 = 64;
	int anInt7053;
	OverlayIndexLoader aClass536_7062;

	void method11356() {
		anInt7052 = anInt7052 << 8 | anInt7053;
	}

	void method11357(ByteBuf rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0)
				return;
			method11364(rsbytebuffer_1, i_3);
		}
	}

	void method11364(ByteBuf rsbytebuffer_1, int i_2) {
		if (i_2 == 1)
			primaryRGB = IdentikitDefinition.method912(rsbytebuffer_1.read24BitUnsignedInteger());
		else if (i_2 == 2)
			texture = rsbytebuffer_1.readUnsignedByte();
		else if (i_2 == 3) {
			texture = rsbytebuffer_1.readUnsignedShort();
			if (texture == 65535)
				texture = -1;
		} else if (i_2 == 5)
			aBool7056 = false;
		else if (i_2 == 7)
			secondaryRGB = IdentikitDefinition.method912(rsbytebuffer_1.read24BitUnsignedInteger());
		else if (i_2 == 8)
			aClass536_7062.anInt7093 = anInt7053;
		else if (i_2 == 9)
			anInt7057 = rsbytebuffer_1.readUnsignedShort() << 2;
		else if (i_2 == 10)
			aBool7059 = false;
		else if (i_2 == 11)
			anInt7052 = rsbytebuffer_1.readUnsignedByte();
		else if (i_2 == 12)
			aBool7061 = true;
		else if (i_2 == 13)
			waterColour = rsbytebuffer_1.read24BitUnsignedInteger();
		else if (i_2 == 14)
			waterScale = (rsbytebuffer_1.readUnsignedByte() << 2);
		else if (i_2 == 16)
			waterIntensity = rsbytebuffer_1.readUnsignedByte();
		else if (i_2 == 20)
			anInt7065 = rsbytebuffer_1.readUnsignedShort();
		else if (i_2 == 21)
			anInt7055 = rsbytebuffer_1.readUnsignedByte();
		else if (i_2 == 22)
			anInt7067 = rsbytebuffer_1.readUnsignedShort();
	}
}
