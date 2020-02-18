package com.jagex;

public class SpriteDefinitions {

    public int minX;
    public int minY;
    public int width;
    public int height;
    public int anInt958;
    public int anInt953;
    public int[] pallete;
    public byte[] pixels;
    public byte[] alpha;

    public static SpriteDefinitions[] method1514(Index index_0, int i_1) {
        byte[] bytes_3 = index_0.getFile(i_1, 0);
        return bytes_3 == null ? null : decode(bytes_3);
    }

    public static SpriteDefinitions method1515(Index index_0, int i_1) {
        byte[] bytes_2 = index_0.getFile(i_1);
        return bytes_2 == null ? null : decode(bytes_2)[0];
    }

    public static SpriteDefinitions[] decode(byte[] data) {
        Packet stream = new Packet(data);
        stream.index = data.length - 2;
        int count = stream.readUnsignedShort();
        SpriteDefinitions[] sprites = new SpriteDefinitions[count];

        for (int i = 0; i < count; i++) {
            sprites[i] = new SpriteDefinitions();
        }

        stream.index = data.length - 7 - count * 8;
        int biggestWidth = stream.readUnsignedShort();
        int biggestHeight = stream.readUnsignedShort();
        int palleteLength = (stream.readUnsignedByte() & 0xff) + 1;

        for (int i = 0; i < count; i++) {
            sprites[i].minX = stream.readUnsignedShort();
        }

        for (int i = 0; i < count; i++) {
            sprites[i].minY = stream.readUnsignedShort();
        }

        for (int i = 0; i < count; i++) {
            sprites[i].width = stream.readUnsignedShort();
        }

        for (int i = 0; i < count; i++) {
            sprites[i].height = stream.readUnsignedShort();
        }

        for (int i = 0; i < count; i++) {
            SpriteDefinitions sprite = sprites[i];
            sprite.anInt958 = biggestWidth - sprite.width - sprite.minX;
            sprite.anInt953 = biggestHeight - sprite.height - sprite.minY;
        }

        stream.index = data.length - 7 - count * 8 - (palleteLength - 1) * 3;
        int[] pallete = new int[palleteLength];

        for (int i = 1; i < palleteLength; i++) {
            pallete[i] = stream.read24BitUnsignedInteger();
            if (pallete[i] == 0) {
                pallete[i] = 1;
            }
        }

        for (int i = 0; i < count; i++) {
            sprites[i].pallete = pallete;
        }

        stream.index = 0;

        for (int i = 0; i < count; i++) {
            SpriteDefinitions sprite = sprites[i];
            int numPixels = sprite.width * sprite.height;
            sprite.pixels = new byte[numPixels];
            int flags = stream.readUnsignedByte();
            if ((flags & 0x2) == 0) {
                if ((flags & 0x1) == 0) {
                    for (int j = 0; j < numPixels; j++) {
                        sprite.pixels[j] = stream.readByte();
                    }
                } else {
                    for (int j = 0; j < sprite.width; j++) {
                        for (int k = 0; k < sprite.height; k++) {
                            sprite.pixels[j + k * sprite.width] = stream.readByte();
                        }
                    }
                }
            } else {
                boolean usesAlpha = false;
                sprite.alpha = new byte[numPixels];
                if ((flags & 0x1) == 0) {
                    for (int j = 0; j < numPixels; j++) {
                        sprite.pixels[j] = stream.readByte();
                    }

                    for (int j = 0; j < numPixels; j++) {
                        byte alpha = sprite.alpha[j] = stream.readByte();
                        usesAlpha |= alpha != -1;
                    }
                } else {
                    for (int j = 0; j < sprite.width; j++) {
                        for (int k = 0; k < sprite.height; k++) {
                            sprite.pixels[j + k * sprite.width] = stream.readByte();
                        }
                    }

                    for (int j = 0; j < sprite.width; j++) {
                        for (int k = 0; k < sprite.height; k++) {
                            byte alpha = sprite.alpha[j + k * sprite.width] = stream.readByte();
                            usesAlpha |= alpha != -1;
                        }
                    }
                }

                if (!usesAlpha) {
                    sprite.alpha = null;
                }
            }
        }

        return sprites;
    }

    public static SpriteDefinitions getSprite(Index index, int archiveId, int fileId) {
        byte[] data = index.getFile(archiveId, fileId);
        return data == null ? null : decode(data)[0];
    }

    public static SpriteDefinitions[] method1534(Index index_0, int i_1) {
        byte[] bytes_2 = index_0.getFile(i_1);
        return bytes_2 == null ? null : decode(bytes_2);
    }

    public int method1519() {
        return width + minX + anInt958;
    }

    public int method1520() {
        return height + minY + anInt953;
    }

    public void method1523() {
        int i_1 = method1519();
        int i_2 = method1520();
        if (i_1 != width || i_2 != height) {
            byte[] bytes_3 = new byte[i_1 * i_2];
            int i_5;
            int i_6;
            int i_7;
            if (alpha != null) {
                byte[] bytes_4 = new byte[i_1 * i_2];
                i_5 = 0;

                while (true) {
                    if (i_5 >= height) {
                        alpha = bytes_4;
                        break;
                    }

                    i_6 = i_5 * width;
                    i_7 = i_1 * (i_5 + minY) + minX;

                    for (int i_8 = 0; i_8 < width; i_8++) {
                        bytes_3[i_7] = pixels[i_6];
                        bytes_4[i_7++] = alpha[i_6++];
                    }

                    ++i_5;
                }
            } else {
                for (int i_9 = 0; i_9 < height; i_9++) {
                    i_5 = i_9 * width;
                    i_6 = i_1 * (i_9 + minY) + minX;

                    for (i_7 = 0; i_7 < width; i_7++) {
                        bytes_3[i_6++] = pixels[i_5++];
                    }
                }
            }

            anInt953 = 0;
            minY = 0;
            anInt958 = 0;
            minX = 0;
            width = i_1;
            height = i_2;
            pixels = bytes_3;
        }

    }

    public void method1524(int i_1) {
        int i_2 = -1;
        int i_3;
        int i_4;
        int i_5;
        if (pallete.length < 255) {
            for (i_3 = 0; i_3 < pallete.length; i_3++) {
                if (pallete[i_3] == i_1) {
                    i_2 = i_3;
                    break;
                }
            }

            if (i_2 == -1) {
                i_2 = pallete.length;
                int[] ints_16 = new int[pallete.length + 1];
                Class503.method8362(pallete, 0, ints_16, 0, pallete.length);
                pallete = ints_16;
                ints_16[i_2] = i_1;
            }
        } else {
            i_3 = Integer.MAX_VALUE;
            i_4 = i_1 >> 16 & 0xff;
            i_5 = i_1 >> 8 & 0xff;
            int i_6 = i_1 & 0xff;

            for (int i_7 = 0; i_7 < pallete.length; i_7++) {
                int i_8 = pallete[i_7];
                int i_9 = i_8 >> 16 & 0xff;
                int i_10 = i_8 >> 8 & 0xff;
                int i_11 = i_8 & 0xff;
                int i_12 = i_4 - i_9;
                if (i_12 < 0) {
                    i_12 = -i_12;
                }

                int i_13 = i_5 - i_10;
                if (i_13 < 0) {
                    i_13 = -i_13;
                }

                int i_14 = i_6 - i_11;
                if (i_14 < 0) {
                    i_14 = -i_14;
                }

                int i_15 = i_12 + i_13 + i_14;
                if (i_15 < i_3) {
                    i_3 = i_15;
                    i_2 = i_7;
                }
            }
        }

        for (i_3 = height - 1; i_3 > 0; --i_3) {
            i_4 = i_3 * width;

            for (i_5 = width - 1; i_5 > 0; --i_5) {
                if (pallete[pixels[i_5 + i_4] & 0xff] == 0 && pallete[pixels[i_5 + i_4 - 1 - width] & 0xff] != 0) {
                    pixels[i_5 + i_4] = (byte) i_2;
                }
            }
        }

    }

    public void method1525() {
        byte[] bytes_1 = pixels;
        int i_2;
        int i_3;
        int i_4;
        if (alpha == null) {
            for (i_2 = height - 1; i_2 >= 0; --i_2) {
                i_3 = i_2 * width;

                for (i_4 = (i_2 + 1) * width; i_3 < i_4; i_3++) {
                    --i_4;
                    byte b_5 = bytes_1[i_3];
                    bytes_1[i_3] = bytes_1[i_4];
                    bytes_1[i_4] = b_5;
                }
            }
        } else {
            byte[] bytes_7 = alpha;

            for (i_3 = height - 1; i_3 >= 0; --i_3) {
                i_4 = i_3 * width;

                for (int i_8 = (i_3 + 1) * width; i_4 < i_8; i_4++) {
                    --i_8;
                    byte b_6 = bytes_1[i_4];
                    bytes_1[i_4] = bytes_1[i_8];
                    bytes_1[i_8] = b_6;
                    b_6 = bytes_7[i_4];
                    bytes_7[i_4] = bytes_7[i_8];
                    bytes_7[i_8] = b_6;
                }
            }
        }

        i_2 = minX;
        minX = anInt958;
        anInt958 = i_2;
    }

    public void method1526() {
        byte[] bytes_1 = pixels;
        int i_2;
        int i_3;
        int i_4;
        int i_5;
        if (alpha == null) {
            for (i_2 = (height >> 1) - 1; i_2 >= 0; --i_2) {
                i_3 = i_2 * width;
                i_4 = (height - i_2 - 1) * width;

                for (i_5 = -width; i_5 < 0; i_5++) {
                    byte b_6 = bytes_1[i_3];
                    bytes_1[i_3] = bytes_1[i_4];
                    bytes_1[i_4] = b_6;
                    ++i_3;
                    ++i_4;
                }
            }
        } else {
            byte[] bytes_8 = alpha;

            for (i_3 = (height >> 1) - 1; i_3 >= 0; --i_3) {
                i_4 = i_3 * width;
                i_5 = (height - i_3 - 1) * width;

                for (int i_9 = -width; i_9 < 0; i_9++) {
                    byte b_7 = bytes_1[i_4];
                    bytes_1[i_4] = bytes_1[i_5];
                    bytes_1[i_5] = b_7;
                    b_7 = bytes_8[i_4];
                    bytes_8[i_4] = bytes_8[i_5];
                    bytes_8[i_5] = b_7;
                    ++i_4;
                    ++i_5;
                }
            }
        }

        i_2 = minY;
        minY = anInt953;
        anInt953 = i_2;
    }

    public void method1527() {
        byte[] bytes_1 = new byte[width * height];
        int i_2 = 0;
        int i_3;
        int i_4;
        if (alpha == null) {
            for (i_3 = 0; i_3 < width; i_3++) {
                for (i_4 = height - 1; i_4 >= 0; --i_4) {
                    bytes_1[i_2++] = pixels[i_3 + i_4 * width];
                }
            }

            pixels = bytes_1;
        } else {
            byte[] bytes_6 = new byte[width * height];

            for (i_4 = 0; i_4 < width; i_4++) {
                for (int i_5 = height - 1; i_5 >= 0; --i_5) {
                    bytes_1[i_2] = pixels[i_4 + i_5 * width];
                    bytes_6[i_2++] = alpha[i_4 + i_5 * width];
                }
            }

            pixels = bytes_1;
            alpha = bytes_6;
        }

        i_3 = minY;
        minY = minX;
        minX = anInt953;
        anInt953 = anInt958;
        anInt958 = minY;
        i_3 = height;
        height = width;
        width = i_3;
    }

    public int[] method1528() {
        int i_1 = method1519();
        int[] ints_2 = new int[i_1 * method1520()];
        int i_3;
        int i_4;
        int i_5;
        int i_6;
        if (alpha != null) {
            for (i_3 = 0; i_3 < height; i_3++) {
                i_4 = i_3 * width;
                i_5 = i_1 * (i_3 + minY) + minX;

                for (i_6 = 0; i_6 < width; i_6++) {
                    ints_2[i_5++] = alpha[i_4] << 24 | pallete[pixels[i_4] & 0xff];
                    ++i_4;
                }
            }
        } else {
            for (i_3 = 0; i_3 < height; i_3++) {
                i_4 = i_3 * width;
                i_5 = i_1 * (i_3 + minY) + minX;

                for (i_6 = 0; i_6 < width; i_6++) {
                    int i_7 = pallete[pixels[i_4++] & 0xff];
                    if (i_7 != 0) {
                        ints_2[i_5++] = -16777216 | i_7;
                    } else {
                        ints_2[i_5++] = 0;
                    }
                }
            }
        }

        return ints_2;
    }

    public void method1529(int i_1, int i_2, int i_3) {
        for (int i_4 = 1; i_4 < pallete.length; i_4++) {
            if (pallete[i_4] != 1 && pallete[i_4] != 16711935) {
                int i_5 = pallete[i_4] >> 16 & 0xff;
                i_5 += i_1;
                if (i_5 < 0) {
                    i_5 = 0;
                } else if (i_5 > 255) {
                    i_5 = 255;
                }

                int i_6 = pallete[i_4] >> 8 & 0xff;
                i_6 += i_2;
                if (i_6 < 0) {
                    i_6 = 0;
                } else if (i_6 > 255) {
                    i_6 = 255;
                }

                int i_7 = pallete[i_4] & 0xff;
                i_7 += i_3;
                if (i_7 < 0) {
                    i_7 = 0;
                } else if (i_7 > 255) {
                    i_7 = 255;
                }

                pallete[i_4] = i_5 << 16 | i_6 << 8 | i_7;
            }
        }

    }

    public void method1536(int i_1) {
        int i_2 = -1;
        int i_3;
        int i_5;
        int i_6;
        int i_7;
        if (pallete.length < 255) {
            for (i_3 = 0; i_3 < pallete.length; i_3++) {
                if (pallete[i_3] == i_1) {
                    i_2 = i_3;
                    break;
                }
            }

            if (i_2 == -1) {
                i_2 = pallete.length;
                int[] ints_16 = new int[pallete.length + 1];
                Class503.method8362(pallete, 0, ints_16, 0, pallete.length);
                pallete = ints_16;
                ints_16[i_2] = i_1;
            }
        } else {
            i_3 = Integer.MAX_VALUE;
            int i_17 = i_1 >> 16 & 0xff;
            i_5 = i_1 >> 8 & 0xff;
            i_6 = i_1 & 0xff;

            for (i_7 = 0; i_7 < pallete.length; i_7++) {
                int i_8 = pallete[i_7];
                int i_9 = i_8 >> 16 & 0xff;
                int i_10 = i_8 >> 8 & 0xff;
                int i_11 = i_8 & 0xff;
                int i_12 = i_17 - i_9;
                if (i_12 < 0) {
                    i_12 = -i_12;
                }

                int i_13 = i_5 - i_10;
                if (i_13 < 0) {
                    i_13 = -i_13;
                }

                int i_14 = i_6 - i_11;
                if (i_14 < 0) {
                    i_14 = -i_14;
                }

                int i_15 = i_12 + i_13 + i_14;
                if (i_15 < i_3) {
                    i_3 = i_15;
                    i_2 = i_7;
                }
            }
        }

        i_3 = 0;
        byte[] bytes_4 = new byte[width * height];

        for (i_5 = 0; i_5 < height; i_5++) {
            for (i_6 = 0; i_6 < width; i_6++) {
                i_7 = pixels[i_3] & 0xff;
                if (pallete[i_7] == 0) {
                    if (i_6 > 0 && pallete[pixels[i_3 - 1] & 0xff] != 0) {
                        i_7 = i_2;
                    } else if (i_5 > 0 && pallete[pixels[i_3 - width] & 0xff] != 0) {
                        i_7 = i_2;
                    } else if (i_6 < width - 1 && pallete[pixels[i_3 + 1] & 0xff] != 0) {
                        i_7 = i_2;
                    } else if (i_5 < height - 1 && pallete[pixels[i_3 + width] & 0xff] != 0) {
                        i_7 = i_2;
                    }
                }

                bytes_4[i_3++] = (byte) i_7;
            }
        }

        pixels = bytes_4;
    }

    public void method1554(int i_1) {
        int i_2 = method1519();
        int i_3 = method1520();
        if (i_2 != width || i_3 != height) {
            int i_4 = i_1;
            if (i_1 > minX) {
                i_4 = minX;
            }

            int i_5 = i_1;
            if (i_1 + minX + width > i_2) {
                i_5 = i_2 - minX - width;
            }

            int i_6 = i_1;
            if (i_1 > minY) {
                i_6 = minY;
            }

            int i_7 = i_1;
            if (i_1 + minY + height > i_3) {
                i_7 = i_3 - minY - height;
            }

            int i_8 = i_4 + i_5 + width;
            int i_9 = i_6 + i_7 + height;
            byte[] bytes_10 = new byte[i_8 * i_9];
            int i_12;
            int i_13;
            int i_14;
            if (alpha == null) {
                for (int i_11 = 0; i_11 < height; i_11++) {
                    i_12 = i_11 * width;
                    i_13 = i_8 * (i_11 + i_6) + i_4;

                    for (i_14 = 0; i_14 < width; i_14++) {
                        bytes_10[i_13++] = pixels[i_12++];
                    }
                }
            } else {
                byte[] bytes_16 = new byte[i_8 * i_9];
                i_12 = 0;

                while (true) {
                    if (i_12 >= height) {
                        alpha = bytes_16;
                        break;
                    }

                    i_13 = i_12 * width;
                    i_14 = i_8 * (i_12 + i_6) + i_4;

                    for (int i_15 = 0; i_15 < width; i_15++) {
                        bytes_16[i_14] = alpha[i_13];
                        bytes_10[i_14++] = pixels[i_13++];
                    }

                    ++i_12;
                }
            }

            minX -= i_4;
            minY -= i_6;
            anInt958 -= i_5;
            anInt953 -= i_7;
            width = i_8;
            height = i_9;
            pixels = bytes_10;
        }

    }

}
