package com.jagex;

public abstract class MaterialProperty extends Node {

    protected Class308 aClass308_7670;
    protected Class320 aClass320_7667;
    protected boolean aBool7669;
    int anInt7668;
    MaterialProperty[] params;

    MaterialProperty(int numParams, boolean bool_2) {
        aBool7669 = bool_2;
        params = new MaterialProperty[numParams];
    }

    void method12315(int i_1, int i_2) {
        int i_4 = anInt7668 == 255 ? i_2 : anInt7668;
        if (aBool7669) {
            aClass320_7667 = new Class320(i_4, i_2, i_1);
        } else {
            aClass308_7670 = new Class308(i_4, i_2, i_1);
        }
    }

    int[] method12317(int i_1, int i_2) {
        return !params[i_1].aBool7669 ? params[i_1].getPixels(i_2)[0] : params[i_1].method12319(i_2);
    }

    int[] method12319(int i_1) {
        throw new IllegalStateException();
    }

    int[][] getPixels(int i_1) {
        throw new IllegalStateException();
    }

    void method12321() {
    }

    void decode(int i_1, ByteBuf rsbytebuffer_2) {
    }

    int getSpriteId() {
        return -1;
    }

    int getTextureId() {
        return -1;
    }

    void method12326() {
        if (aBool7669) {
            aClass320_7667.method5720();
            aClass320_7667 = null;
        } else {
            aClass308_7670.method5462();
            aClass308_7670 = null;
        }
    }

    int[][] method12333(int i_1, int i_2) {
        if (params[i_1].aBool7669) {
            int[] ints_4 = params[i_1].method12319(i_2);
            int[][] ints_5 = {ints_4, ints_4, ints_4};
            return ints_5;
        } else {
            return params[i_1].getPixels(i_2);
        }
    }

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
	    switch (i_0) {
	        case 0:
	            return new MaterialProp0();
	        case 1:
	            return new MaterialProp1();
	        case 2:
	            return new MaterialProp2();
	        case 3:
	            return new MaterialProp3();
	        case 4:
	            return new MaterialProp4();
	        case 5:
	            return new MaterialProp5();
	        case 6:
	            return new MaterialProp6();
	        case 7:
	            return new MaterialProp7();
	        case 8:
	            return new MaterialProp8();
	        case 9:
	            return new MaterialProp9();
	        case 10:
	            return new MaterialProp10();
	        case 11:
	            return new MaterialProp11();
	        case 12:
	            return new MaterialProp12();
	        case 13:
	            return new MaterialProp13();
	        case 14:
	            return new MaterialProp14();
	        case 15:
	            return new MaterialProp15();
	        case 16:
	            return new MaterialProp16();
	        case 17:
	            return new MaterialProp17();
	        case 18:
	            return new MaterialPropSpriteSub18();
	        case 19:
	            return new MaterialProp19();
	        case 20:
	            return new MaterialProp20();
	        case 21:
	            return new MaterialProp21();
	        case 22:
	            return new MaterialProp22();
	        case 23:
	            return new MaterialProp23();
	        case 24:
	            return new MaterialProp24();
	        case 25:
	            return new MaterialProp25();
	        case 26:
	            return new MaterialProp26();
	        case 27:
	            return new MaterialProp27();
	        case 28:
	            return new MaterialProp28();
	        case 29:
	            return new MaterialProp29();
	        case 30:
	            return new MaterialProp30();
	        case 31:
	            return new MaterialProp31();
	        case 32:
	            return new MaterialProp32();
	        case 33:
	            return new MaterialProp33();
	        case 34:
	            return new MaterialProp34();
	        case 35:
	            return new MaterialProp35();
	        case 36:
	            return new MaterialPropTexture();
	        case 37:
	            return new MaterialProp37();
	        case 38:
	            return new MaterialProp38();
	        case 39:
	            return new MaterialPropSprite();
	        default:
	            return null;
	    }
	}
}
