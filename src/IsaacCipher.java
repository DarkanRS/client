public final class IsaacCipher {

    static int anInt5157;

    int anInt5152;

    int anInt5156;

    int anInt5155;

    int anInt5154;

    int[] anIntArray5149 = new int[256];

    int[] anIntArray5150 = new int[256];

    final void method7253() {
        int i_2 = -1640531527;
        int i_3 = -1640531527;
        int i_4 = -1640531527;
        int i_5 = -1640531527;
        int i_6 = -1640531527;
        int i_7 = -1640531527;
        int i_8 = -1640531527;
        int i_9 = -1640531527;
        int i_10;
        for (i_10 = 0; i_10 < 4; i_10++) {
            i_9 ^= i_8 << 11;
            i_6 += i_9;
            i_8 += i_7;
            i_8 ^= i_7 >>> 2;
            i_5 += i_8;
            i_7 += i_6;
            i_7 ^= i_6 << 8;
            i_4 += i_7;
            i_6 += i_5;
            i_6 ^= i_5 >>> 16;
            i_3 += i_6;
            i_5 += i_4;
            i_5 ^= i_4 << 10;
            i_2 += i_5;
            i_4 += i_3;
            i_4 ^= i_3 >>> 4;
            i_9 += i_4;
            i_3 += i_2;
            i_3 ^= i_2 << 8;
            i_8 += i_3;
            i_2 += i_9;
            i_2 ^= i_9 >>> 9;
            i_7 += i_2;
            i_9 += i_8;
        }
        for (i_10 = 0; i_10 < 256; i_10 += 8) {
            i_9 += this.anIntArray5150[i_10];
            i_8 += this.anIntArray5150[i_10 + 1];
            i_7 += this.anIntArray5150[i_10 + 2];
            i_6 += this.anIntArray5150[i_10 + 3];
            i_5 += this.anIntArray5150[i_10 + 4];
            i_4 += this.anIntArray5150[i_10 + 5];
            i_3 += this.anIntArray5150[i_10 + 6];
            i_2 += this.anIntArray5150[i_10 + 7];
            i_9 ^= i_8 << 11;
            i_6 += i_9;
            i_8 += i_7;
            i_8 ^= i_7 >>> 2;
            i_5 += i_8;
            i_7 += i_6;
            i_7 ^= i_6 << 8;
            i_4 += i_7;
            i_6 += i_5;
            i_6 ^= i_5 >>> 16;
            i_3 += i_6;
            i_5 += i_4;
            i_5 ^= i_4 << 10;
            i_2 += i_5;
            i_4 += i_3;
            i_4 ^= i_3 >>> 4;
            i_9 += i_4;
            i_3 += i_2;
            i_3 ^= i_2 << 8;
            i_8 += i_3;
            i_2 += i_9;
            i_2 ^= i_9 >>> 9;
            i_7 += i_2;
            i_9 += i_8;
            this.anIntArray5149[i_10] = i_9;
            this.anIntArray5149[i_10 + 1] = i_8;
            this.anIntArray5149[i_10 + 2] = i_7;
            this.anIntArray5149[i_10 + 3] = i_6;
            this.anIntArray5149[i_10 + 4] = i_5;
            this.anIntArray5149[i_10 + 5] = i_4;
            this.anIntArray5149[i_10 + 6] = i_3;
            this.anIntArray5149[i_10 + 7] = i_2;
        }
        for (i_10 = 0; i_10 < 256; i_10 += 8) {
            i_9 += this.anIntArray5149[i_10];
            i_8 += this.anIntArray5149[i_10 + 1];
            i_7 += this.anIntArray5149[i_10 + 2];
            i_6 += this.anIntArray5149[i_10 + 3];
            i_5 += this.anIntArray5149[i_10 + 4];
            i_4 += this.anIntArray5149[i_10 + 5];
            i_3 += this.anIntArray5149[i_10 + 6];
            i_2 += this.anIntArray5149[i_10 + 7];
            i_9 ^= i_8 << 11;
            i_6 += i_9;
            i_8 += i_7;
            i_8 ^= i_7 >>> 2;
            i_5 += i_8;
            i_7 += i_6;
            i_7 ^= i_6 << 8;
            i_4 += i_7;
            i_6 += i_5;
            i_6 ^= i_5 >>> 16;
            i_3 += i_6;
            i_5 += i_4;
            i_5 ^= i_4 << 10;
            i_2 += i_5;
            i_4 += i_3;
            i_4 ^= i_3 >>> 4;
            i_9 += i_4;
            i_3 += i_2;
            i_3 ^= i_2 << 8;
            i_8 += i_3;
            i_2 += i_9;
            i_2 ^= i_9 >>> 9;
            i_7 += i_2;
            i_9 += i_8;
            this.anIntArray5149[i_10] = i_9;
            this.anIntArray5149[i_10 + 1] = i_8;
            this.anIntArray5149[i_10 + 2] = i_7;
            this.anIntArray5149[i_10 + 3] = i_6;
            this.anIntArray5149[i_10 + 4] = i_5;
            this.anIntArray5149[i_10 + 5] = i_4;
            this.anIntArray5149[i_10 + 6] = i_3;
            this.anIntArray5149[i_10 + 7] = i_2;
        }
        this.method7256();
        this.anInt5152 = 256;
    }

    public final int nextInt() {
        if (this.anInt5152 == 0) {
            this.method7256();
            this.anInt5152 = 256;
        }
        if (!Loader.USING_ISAAC) {
            return 0;
        }
        return (this.anIntArray5150[(this.anInt5152 -= 1)]);
    }

    public final int method7255() {
        if (this.anInt5152 == 0) {
            this.method7256();
            this.anInt5152 = 256;
        }
        if (!Loader.USING_ISAAC) {
            return 0;
        }
        return (this.anIntArray5150[this.anInt5152 - 1]);
    }

    final void method7256() {
        this.anInt5155 += ++this.anInt5156;
        for (int i_2 = 0; i_2 < 256; i_2++) {
            int i_3 = this.anIntArray5149[i_2];
            if ((i_2 & 0x2) == 0) {
                if ((i_2 & 0x1) == 0) {
                    this.anInt5154 ^= this.anInt5154 << 13;
                } else {
                    this.anInt5154 ^= this.anInt5154 >>> 6;
                }
            } else if ((i_2 & 0x1) == 0) {
                this.anInt5154 ^= this.anInt5154 << 2;
            } else {
                this.anInt5154 ^= this.anInt5154 >>> 16;
            }
            this.anInt5154 += this.anIntArray5149[128 + i_2 & 0xff];
            int i_4;
            this.anIntArray5149[i_2] = i_4 = this.anIntArray5149[(i_3 & 0x3fc) >> 2] + this.anInt5155 + this.anInt5154;
            this.anIntArray5150[i_2] = this.anInt5155 = this.anIntArray5149[(i_4 >> 8 & 0x3fc) >> 2] + i_3;
        }
    }

    public IsaacCipher(int[] ints_1) {
        for (int i_2 = 0; i_2 < ints_1.length; i_2++) {
            this.anIntArray5150[i_2] = ints_1[i_2];
        }
        this.method7253();
    }

    public static WorldDescriptor method7266() {
        return ObjectIndexLoader.getWorld(Class159.GAME_CONNECTION_INFO.worldId);
    }

    static final void processCamera() {
        if (client.aFloat7146 < 1081.0F) {
            client.aFloat7146 = 1081.0F;
        }
        if (client.aFloat7146 > 2980.0F) {
            client.aFloat7146 = 2980.0F;
        }
        while (client.aFloat7365 >= 16384.0F) {
            client.aFloat7365 -= 16384.0F;
        }
        while (client.aFloat7365 < 0.0F) {
            client.aFloat7365 += 16384.0F;
        }
        RegionMap regionmap_1 = IndexLoaders.MAP_REGION_DECODER.method4433();
        SceneObjectManager sceneobjectmanager_2 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager();
        int i_3 = Class11.anInt122 >> 9;
        int i_4 = Class266.anInt3289 >> 9;
        int i_5 = Class504.getTerrainHeightAtPos(Class11.anInt122, Class266.anInt3289, Class4.anInt35);
        int i_6 = 0;
        if (i_3 > 3 && i_4 > 3 && i_3 < IndexLoaders.MAP_REGION_DECODER.getSizeX() - 4 && i_4 < IndexLoaders.MAP_REGION_DECODER.getSizeY() - 4) {
            for (int x = i_3 - 4; x <= i_3 + 4; x++) {
                for (int y = i_4 - 4; y <= i_4 + 4; y++) {
                    int i_9 = Class4.anInt35;
                    if (i_9 < 3 && regionmap_1.is0x2(x, y, 1857186418)) {
                        ++i_9;
                    }
                    int i_10 = 0;
                    byte[][] bytes_11 = IndexLoaders.MAP_REGION_DECODER.method4507(i_9);
                    if (bytes_11 != null) {
                        i_10 = (bytes_11[x][y] & 0xff) * 8 << 2;
                    }
                    if (sceneobjectmanager_2.aGroundArray2591 != null && sceneobjectmanager_2.aGroundArray2591[i_9] != null) {
                        int i_12 = i_5 - (sceneobjectmanager_2.aGroundArray2591[i_9].getHeight(x, y) - i_10);
                        if (i_12 > i_6) {
                            i_6 = i_12;
                        }
                    }
                }
            }
        }
        int i_7 = (i_6 >> 2) * 1536;
        if (i_7 > 786432) {
            i_7 = 786432;
        }
        if (i_7 < 262144) {
            i_7 = 262144;
        }
        if (i_7 > client.anInt7273) {
            client.anInt7273 += (i_7 - client.anInt7273) / 24;
        } else if (i_7 < client.anInt7273) {
            client.anInt7273 += (i_7 - client.anInt7273) / 80;
        }
    }
}
