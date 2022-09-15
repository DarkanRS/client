package com.jagex;

public abstract class MaterialProperty extends Node<MaterialProperty> {

	static MaterialProperty decode(ByteBuf buffer) {
		buffer.readUnsignedByte();
		int opIndex = buffer.readUnsignedByte();
		MaterialProperty operation = getById(opIndex);
		operation.anInt7668 = buffer.readUnsignedByte();
		int numReads = buffer.readUnsignedByte();
		for (int i = 0; i < numReads; i++) {
			int opcode = buffer.readUnsignedByte();
			operation.decode(opcode, buffer);
		}
		operation.method12321();
		return operation;
	}
	static MaterialProperty getById(int i_0) {
		return switch (i_0) {
		case 0 -> new MaterialProp0();
		case 1 -> new MaterialProp1();
		case 2 -> new MaterialProp2();
		case 3 -> new MaterialProp3();
		case 4 -> new MaterialProp4();
		case 5 -> new MaterialProp5();
		case 6 -> new MaterialProp6();
		case 7 -> new MaterialProp7();
		case 8 -> new MaterialProp8();
		case 9 -> new MaterialProp9();
		case 10 -> new MaterialProp10();
		case 11 -> new MaterialProp11();
		case 12 -> new MaterialProp12();
		case 13 -> new MaterialProp13();
		case 14 -> new MaterialProp14();
		case 15 -> new MaterialProp15();
		case 16 -> new MaterialProp16();
		case 17 -> new MaterialProp17();
		case 18 -> new MaterialPropSpriteSub18();
		case 19 -> new MaterialProp19();
		case 20 -> new MaterialProp20();
		case 21 -> new MaterialProp21();
		case 22 -> new MaterialProp22();
		case 23 -> new MaterialProp23();
		case 24 -> new MaterialProp24();
		case 25 -> new MaterialProp25();
		case 26 -> new MaterialProp26();
		case 27 -> new MaterialProp27();
		case 28 -> new MaterialProp28();
		case 29 -> new MaterialProp29();
		case 30 -> new MaterialProp30();
		case 31 -> new MaterialProp31();
		case 32 -> new MaterialProp32();
		case 33 -> new MaterialProp33();
		case 34 -> new MaterialProp34();
		case 35 -> new MaterialProp35();
		case 36 -> new MaterialPropTexture();
		case 37 -> new MaterialProp37();
		case 38 -> new MaterialProp38();
		case 39 -> new MaterialPropSprite();
		default -> null;
		};
	}
	protected Class308 aClass308_7670;
	protected Class320 aClass320_7667;
	protected boolean noPalette;

	int anInt7668;

	MaterialProperty[] params;

	MaterialProperty(int numParams, boolean bool_2) {
		noPalette = bool_2;
		params = new MaterialProperty[numParams];
	}

	void decode(int i_1, ByteBuf rsbytebuffer_2) {
	}

	int[][] getPixels(int i_1) {
		throw new IllegalStateException();
	}

	int getSpriteId() {
		return -1;
	}

	int getTextureId() {
		return -1;
	}

	void method12315(int i_1, int i_2) {
		int i_4 = anInt7668 == 255 ? i_2 : anInt7668;
		if (noPalette)
			aClass320_7667 = new Class320(i_4, i_2, i_1);
		else
			aClass308_7670 = new Class308(i_4, i_2, i_1);
	}

	int[] method12317(int i_1, int i_2) {
		return !params[i_1].noPalette ? params[i_1].getPixels(i_2)[0] : params[i_1].method12319(i_2);
	}

	int[] method12319(int i_1) {
		throw new IllegalStateException();
	}

	void method12321() {
	}

	int[][] method12333(int i_1, int i_2) {
		if (params[i_1].noPalette) {
			int[] ints_4 = params[i_1].method12319(i_2);
			int[][] ints_5 = {ints_4, ints_4, ints_4};
			return ints_5;
		}
		return params[i_1].getPixels(i_2);
	}

	void reset() {
		if (noPalette) {
			aClass320_7667.clear();
			aClass320_7667 = null;
		} else {
			aClass308_7670.clear();
			aClass308_7670 = null;
		}
	}
}
