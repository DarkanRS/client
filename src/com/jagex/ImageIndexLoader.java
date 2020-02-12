package com.jagex;

public class ImageIndexLoader implements Interface22 {

    Class223 aClass223_3754 = new Class223(256);

    Index textureIndex;

    Index spriteIndex;

    int textureDefSize;

    TextureDetails[] textures;

    TextureDefinition method5770(int i_1, int i_2) {
        CacheableNode cacheablenode_3 = this.aClass223_3754.get(i_1);
        if (cacheablenode_3 != null) {
            return (TextureDefinition) cacheablenode_3;
        } else {
            byte[] bytes_4 = this.textureIndex.getFile(i_1);
            if (bytes_4 == null) {
                return null;
            } else {
                TextureDefinition texturedefinition_5 = new TextureDefinition(new RsByteBuffer(bytes_4));
                this.aClass223_3754.put(texturedefinition_5, i_1);
                return texturedefinition_5;
            }
        }
    }

    public int method84() {
        return this.textureDefSize;
    }

    public int method39() {
        return 821306191 * this.textureDefSize * 309531567;
    }

    public TextureDetails method144(int i_1) {
        return this.textures[i_1];
    }

    public void method161(int i_1) {
    }

    public ImageIndexLoader(Index textureDefIndex, Index textureIndex, Index spriteIndex) {
        this.textureIndex = textureIndex;
        this.spriteIndex = spriteIndex;
        RsByteBuffer stream = new RsByteBuffer(textureDefIndex.getFile(0, 0));
        this.textureDefSize = stream.readUnsignedShort();
        this.textures = new TextureDetails[this.textureDefSize];
        int i_5;
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (stream.readUnsignedByte() == 1) {
                this.textures[i_5] = new TextureDetails();
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].isGroundMesh = stream.readUnsignedByte() == 0;
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].isHalfSize = stream.readUnsignedByte() == 1;
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].skipTriangles = stream.readUnsignedByte() == 1;
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].brightness = stream.readByte();
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].shadowFactor = stream.readByte();
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].effectId = stream.readByte();
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].effectParam1 = stream.readByte();
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].color = (short) stream.readUnsignedShort();
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].textureSpeedU = stream.readByte();
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].textureSpeedV = stream.readByte();
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].aBool2087 = stream.readUnsignedByte() == 1;
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].isBrickTile = stream.readUnsignedByte() == 1;
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].useMipmaps = stream.readByte();
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].repeatS = stream.readUnsignedByte() == 1;
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].repeatT = stream.readUnsignedByte() == 1;
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].hdr = stream.readUnsignedByte() == 1;
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].combineMode = stream.readUnsignedByte();
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].effectParam2 = stream.readInt();
            }
        }
        for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
            if (this.textures[i_5] != null) {
                this.textures[i_5].blendType = stream.readUnsignedByte();
            }
        }
    }

    public int[] method141(int i_1, int i_3, int i_4, boolean bool_5, int i_6) {
        int[] ints_7 = this.method5770(i_1, 1098624376).method14719(this.spriteIndex, this, (float) 0.7, i_3, i_4, this.textures[i_1].isBrickTile, (byte) -5);
        return ints_7;
    }

    public float[] method145(int i_1, int i_3, int i_4) {
        float[] floats_7 = this.method5770(i_1, 409452943).method14723(this.spriteIndex, this, i_3, i_4, this.textures[i_1].isBrickTile);
        return floats_7;
    }

    public boolean method146(int i_1) {
        TextureDefinition texturedefinition_2 = this.method5770(i_1, 1665929764);
        return texturedefinition_2 != null && texturedefinition_2.method14717(this.spriteIndex, this, -1782889034);
    }

    public int method76() {
        return 821306191 * this.textureDefSize * 309531567;
    }

    public boolean method139(int i_1, int i_2) {
        TextureDefinition texturedefinition_3 = this.method5770(i_1, 832620623);
        return texturedefinition_3 != null && texturedefinition_3.method14717(this.spriteIndex, this, -950452873);
    }

    public boolean method150(int i_1) {
        TextureDefinition texturedefinition_2 = this.method5770(i_1, 2122748961);
        return texturedefinition_2 != null && texturedefinition_2.method14717(this.spriteIndex, this, -450865232);
    }

    public float[] method143(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
        float[] floats_6 = this.method5770(i_1, 1967689599).method14723(this.spriteIndex, this, i_3, i_4, this.textures[i_1].isBrickTile);
        return floats_6;
    }

    public boolean method147(int i_1) {
        TextureDefinition texturedefinition_2 = this.method5770(i_1, 1168970702);
        return texturedefinition_2 != null && texturedefinition_2.method14717(this.spriteIndex, this, 1117287067);
    }

    public int[] method151(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
        int[] ints_6 = this.method5770(i_1, 1578123890).method14719(this.spriteIndex, this, f_2, i_3, i_4, this.textures[i_1].isBrickTile, (byte) -42);
        return ints_6;
    }

    public int[] method149(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
        int[] ints_6 = this.method5770(i_1, 131429824).method14718(this.spriteIndex, this, f_2, i_3, i_4, bool_5, this.textures[i_1].isBrickTile, 1932199605);
        return ints_6;
    }

    public int[] method142(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
        int[] ints_6 = this.method5770(i_1, 1541756935).method14718(this.spriteIndex, this, f_2, i_3, i_4, bool_5, this.textures[i_1].isBrickTile, 1245157724);
        return ints_6;
    }

    public boolean method148(int i_1) {
        TextureDefinition texturedefinition_2 = this.method5770(i_1, 1141007931);
        return texturedefinition_2 != null && texturedefinition_2.method14717(this.spriteIndex, this, 1414802158);
    }

    public int[] method138(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
        int[] ints_6 = this.method5770(i_1, 638861447).method14718(this.spriteIndex, this, f_2, i_3, i_4, bool_5, this.textures[i_1].isBrickTile, 733021009);
        return ints_6;
    }

    public float[] method152(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
        float[] floats_6 = this.method5770(i_1, 795042789).method14723(this.spriteIndex, this, i_3, i_4, this.textures[i_1].isBrickTile);
        return floats_6;
    }

    public float[] method154(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
        float[] floats_6 = this.method5770(i_1, 1535419542).method14723(this.spriteIndex, this, i_3, i_4, this.textures[i_1].isBrickTile);
        return floats_6;
    }

    public float[] method155(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
        float[] floats_6 = this.method5770(i_1, 777010049).method14723(this.spriteIndex, this, i_3, i_4, this.textures[i_1].isBrickTile);
        return floats_6;
    }

    public TextureDetails method156(int i_1) {
        return this.textures[i_1];
    }

    public void method157() {
    }

    public int[] method140(int i_1, float f_2, int i_3, int i_4, boolean bool_5, byte b_6) {
        int[] ints_7 = this.method5770(i_1, 531210835).method14718(this.spriteIndex, this, f_2, i_3, i_4, bool_5, this.textures[i_1].isBrickTile, 112593463);
        return ints_7;
    }

    public void method159() {
    }

    public TextureDetails method160(int i_1) {
        return this.textures[i_1];
    }

    public float[] method153(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
        float[] floats_6 = this.method5770(i_1, 1019867788).method14723(this.spriteIndex, this, i_3, i_4, this.textures[i_1].isBrickTile);
        return floats_6;
    }

    public void method158() {
    }

    public static int method5773(int i_0, int i_1, byte b_2) {
        int i_3 = i_1 >>> 24;
        int i_4 = 255 - i_3;
        i_1 = (i_3 * (i_1 & 0xff00ff) & ~0xff00ff | i_3 * (i_1 & 0xff00) & 0xff0000) >>> 8;
        return ((i_4 * (i_0 & 0xff00ff) & ~0xff00ff | (i_0 & 0xff00) * i_4 & 0xff0000) >>> 8) + i_1;
    }

    static void method5777(int i_0) {
        if (Engine.AVAILABLE_PROCESSORS > 1) {
            Class393.preferences.setValue(Class393.preferences.cpu, 4);
        } else {
            Class393.preferences.setValue(Class393.preferences.cpu, 2);
        }
    }
}
