package com.jagex;

import java.io.FileOutputStream;

public class MaterialDefinitions extends CacheableNode {

    static FileOutputStream aFileOutputStream9481;
    static double aDouble9479 = -1.0;
    static int[] anIntArray9474 = new int[256];
    MaterialProperty[] properties;
    int[] spritePropertyIds;
    int[] texturePropertyIds;
    MaterialProperty aNode_Sub20_9476;
    MaterialProperty aNode_Sub20_9477;
    MaterialProperty aNode_Sub20_9480;

    MaterialDefinitions(ByteBuf buffer) {
        int size = buffer.readUnsignedByte();
        int spriteProperties = 0;
        int textureProperties = 0;
        int[][] propertyParams = new int[size][];
        properties = new MaterialProperty[size];

        for (int i = 0; i < size; i++) {
        	MaterialProperty property = MaterialProperty.decode(buffer);
            if (property.getSpriteId() >= 0) {
                ++spriteProperties;
            }

            if (property.getTextureId() >= 0) {
                ++textureProperties;
            }

            int paramCount = property.params.length;
            propertyParams[i] = new int[paramCount];

            for (int j = 0; j < paramCount; j++) {
                propertyParams[i][j] = buffer.readUnsignedByte();
            }

            properties[i] = property;
        }

        spritePropertyIds = new int[spriteProperties];
        spriteProperties = 0;
        texturePropertyIds = new int[textureProperties];
        textureProperties = 0;

        for (int i = 0; i < size; i++) {
        	MaterialProperty property = properties[i];
            int paramLen = property.params.length;

            for (int j = 0; j < paramLen; j++) {
                property.params[j] = properties[propertyParams[i][j]];
            }

            int spriteId = property.getSpriteId();
            int textureId = property.getTextureId();
            if (spriteId > 0) {
                spritePropertyIds[spriteProperties++] = spriteId;
            }

            if (textureId > 0) {
                texturePropertyIds[textureProperties++] = textureId;
            }

            propertyParams[i] = null;
        }

        aNode_Sub20_9476 = properties[buffer.readUnsignedByte()];
        aNode_Sub20_9477 = properties[buffer.readUnsignedByte()];
        aNode_Sub20_9480 = properties[buffer.readUnsignedByte()];
    }

    boolean loadImageFiles(Index spriteIndex, ImageLoader imageLoader) {
        if (MaterialPropSprite.SPRITE_ARCHIVE_ID >= 0) {
            for (int i = 0; i < spritePropertyIds.length; i++) {
                if (!spriteIndex.load(MaterialPropSprite.SPRITE_ARCHIVE_ID, spritePropertyIds[i])) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < spritePropertyIds.length; i++) {
                if (!spriteIndex.loadFile(spritePropertyIds[i])) {
                    return false;
                }
            }
        }

        for (int i_4 = 0; i_4 < texturePropertyIds.length; i_4++) {
            if (!imageLoader.loadTexture(texturePropertyIds[i_4])) {
                return false;
            }
        }

        return true;
    }

    int[] method14718(Index index_1, ImageLoader interface22_2, double d_3, int i_5, int i_6, boolean bool_7, boolean bool_8) {
        Class532_Sub2.CURR_SPRITE_INDEX = index_1;
        Class532_Sub1.IMAGE_LOADER = interface22_2;

        for (int i_10 = 0; i_10 < properties.length; i_10++) {
            properties[i_10].method12315(i_5, i_6);
        }

        LRUCache.method3895(d_3);
        Class316.method5593(i_5, i_6);
        int[] ints_24 = new int[i_5 * i_6];
        int i_11;
        int i_12;
        byte b_13;
        if (bool_7) {
            i_11 = i_5 - 1;
            i_12 = -1;
            b_13 = -1;
        } else {
            i_11 = 0;
            i_12 = i_5;
            b_13 = 1;
        }

        int i_14 = 0;

        int i_15;
        for (i_15 = 0; i_15 < i_6; i_15++) {
            int[] ints_16;
            int[] ints_17;
            int[] ints_18;
            if (aNode_Sub20_9476.aBool7669) {
                int[] ints_19 = aNode_Sub20_9476.method12319(i_15);
                ints_16 = ints_19;
                ints_17 = ints_19;
                ints_18 = ints_19;
            } else {
                int[][] ints_26 = aNode_Sub20_9476.getPixels(i_15);
                ints_16 = ints_26[0];
                ints_17 = ints_26[1];
                ints_18 = ints_26[2];
            }

            if (bool_8) {
                i_14 = i_15;
            }

            for (int i_25 = i_11; i_25 != i_12; i_25 += b_13) {
                int i_20 = ints_16[i_25] >> 4;
                if (i_20 > 255) {
                    i_20 = 255;
                }

                if (i_20 < 0) {
                    i_20 = 0;
                }

                int i_21 = ints_17[i_25] >> 4;
                if (i_21 > 255) {
                    i_21 = 255;
                }

                if (i_21 < 0) {
                    i_21 = 0;
                }

                int i_22 = ints_18[i_25] >> 4;
                if (i_22 > 255) {
                    i_22 = 255;
                }

                if (i_22 < 0) {
                    i_22 = 0;
                }

                i_20 = anIntArray9474[i_20];
                i_21 = anIntArray9474[i_21];
                i_22 = anIntArray9474[i_22];
                int i_23 = i_22 + (i_21 << 8) + (i_20 << 16);
                if (i_23 != 0) {
                    i_23 |= -16777216;
                }

                ints_24[i_14++] = i_23;
                if (bool_8) {
                    i_14 += i_5 - 1;
                }
            }
        }

        for (i_15 = 0; i_15 < properties.length; i_15++) {
            properties[i_15].method12326();
        }

        return ints_24;
    }

    int[] method14719(Index index_1, ImageLoader interface22_2, double d_3, int i_5, int i_6, boolean bool_7) {
        Class532_Sub2.CURR_SPRITE_INDEX = index_1;
        Class532_Sub1.IMAGE_LOADER = interface22_2;

        for (int i_9 = 0; i_9 < properties.length; i_9++) {
            properties[i_9].method12315(i_5, i_6);
        }

        LRUCache.method3895(d_3);
        Class316.method5593(i_5, i_6);
        int[] ints_21 = new int[i_5 * i_6];
        int i_10 = 0;

        int i_11;
        for (i_11 = 0; i_11 < i_6; i_11++) {
            int[] ints_12;
            int[] ints_13;
            int[] ints_14;
            int[] ints_15;
            if (aNode_Sub20_9476.aBool7669) {
                ints_15 = aNode_Sub20_9476.method12319(i_11);
                ints_12 = ints_15;
                ints_13 = ints_15;
                ints_14 = ints_15;
            } else {
                int[][] ints_22 = aNode_Sub20_9476.getPixels(i_11);
                ints_12 = ints_22[0];
                ints_13 = ints_22[1];
                ints_14 = ints_22[2];
            }

            if (aNode_Sub20_9477.aBool7669) {
                ints_15 = aNode_Sub20_9477.method12319(i_11);
            } else {
                ints_15 = aNode_Sub20_9477.getPixels(i_11)[0];
            }

            if (bool_7) {
                i_10 = i_11;
            }

            for (int i_16 = i_5 - 1; i_16 >= 0; --i_16) {
                int i_17 = ints_12[i_16] >> 4;
                if (i_17 > 255) {
                    i_17 = 255;
                }

                if (i_17 < 0) {
                    i_17 = 0;
                }

                int i_18 = ints_13[i_16] >> 4;
                if (i_18 > 255) {
                    i_18 = 255;
                }

                if (i_18 < 0) {
                    i_18 = 0;
                }

                int i_19 = ints_14[i_16] >> 4;
                if (i_19 > 255) {
                    i_19 = 255;
                }

                if (i_19 < 0) {
                    i_19 = 0;
                }

                i_17 = anIntArray9474[i_17];
                i_18 = anIntArray9474[i_18];
                i_19 = anIntArray9474[i_19];
                int i_20;
                if (i_17 == 0 && i_18 == 0 && i_19 == 0) {
                    i_20 = 0;
                } else {
                    i_20 = ints_15[i_16] >> 4;
                    if (i_20 > 255) {
                        i_20 = 255;
                    }

                    if (i_20 < 0) {
                        i_20 = 0;
                    }
                }

                ints_21[i_10++] = i_19 + (i_18 << 8) + (i_20 << 24) + (i_17 << 16);
                if (bool_7) {
                    i_10 += i_5 - 1;
                }
            }
        }

        for (i_11 = 0; i_11 < properties.length; i_11++) {
            properties[i_11].method12326();
        }

        return ints_21;
    }

    float[] method14723(Index index_1, ImageLoader interface22_2, int i_3, int i_4, boolean bool_5) {
        Class532_Sub2.CURR_SPRITE_INDEX = index_1;
        Class532_Sub1.IMAGE_LOADER = interface22_2;

        for (int i_7 = 0; i_7 < properties.length; i_7++) {
            properties[i_7].method12315(i_3, i_4);
        }

        Class316.method5593(i_3, i_4);
        float[] floats_18 = new float[i_3 * i_4 * 4];
        int i_8 = 0;

        int i_9;
        for (i_9 = 0; i_9 < i_4; i_9++) {
            int[] ints_10;
            int[] ints_11;
            int[] ints_12;
            int[] ints_13;
            if (aNode_Sub20_9476.aBool7669) {
                ints_13 = aNode_Sub20_9476.method12319(i_9);
                ints_10 = ints_13;
                ints_11 = ints_13;
                ints_12 = ints_13;
            } else {
                int[][] ints_19 = aNode_Sub20_9476.getPixels(i_9);
                ints_10 = ints_19[0];
                ints_11 = ints_19[1];
                ints_12 = ints_19[2];
            }

            if (aNode_Sub20_9477.aBool7669) {
                ints_13 = aNode_Sub20_9477.method12319(i_9);
            } else {
                ints_13 = aNode_Sub20_9477.getPixels(i_9)[0];
            }

            int[] ints_14;
            if (aNode_Sub20_9480.aBool7669) {
                ints_14 = aNode_Sub20_9480.method12319(i_9);
            } else {
                ints_14 = aNode_Sub20_9480.getPixels(i_9)[0];
            }

            if (bool_5) {
                i_8 = i_9 << 2;
            }

            for (int i_15 = i_3 - 1; i_15 >= 0; --i_15) {
                float f_16 = ints_13[i_15] / 4096.0F;
                float f_17 = (1.0F + ints_14[i_15] * 31.0F / 4096.0F) / 4096.0F;
                if (f_16 < 0.0F) {
                    f_16 = 0.0F;
                } else if (f_16 > 1.0F) {
                    f_16 = 1.0F;
                }

                floats_18[i_8++] = ints_10[i_15] * f_17;
                floats_18[i_8++] = f_17 * ints_11[i_15];
                floats_18[i_8++] = ints_12[i_15] * f_17;
                floats_18[i_8++] = f_16;
                if (bool_5) {
                    i_8 += (i_3 << 2) - 4;
                }
            }
        }

        for (i_9 = 0; i_9 < properties.length; i_9++) {
            properties[i_9].method12326();
        }

        return floats_18;
    }

}
