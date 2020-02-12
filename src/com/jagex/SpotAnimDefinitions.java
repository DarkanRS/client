package com.jagex;

public class SpotAnimDefinitions {

    SpotAnimIndexLoader aClass515_6973;

    static int CAM_MOVE_Z;

    int defaultModel;

    public int animationId = -1;

    int anInt6976 = 128;

    int anInt6971 = 128;

    int anInt6978 = 0;

    int anInt6979 = 0;

    int anInt6981 = 0;

    public byte aByte6982 = 0;

    int anInt6980 = -1;

    public boolean aBool6968 = false;

    short[] aShortArray6972;

    short[] aShortArray6983;

    short[] aShortArray6974;

    short[] aShortArray6975;

    int anInt6969;

    void method11226(RsByteBuffer rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            this.method11227(rsbytebuffer_1, i_3);
        }
    }

    void method11227(RsByteBuffer rsbytebuffer_1, int i_2) {
        if (i_2 == 1) {
            this.defaultModel = rsbytebuffer_1.readBigSmart();
        } else if (i_2 == 2) {
            this.animationId = rsbytebuffer_1.readBigSmart();
        } else if (i_2 == 4) {
            this.anInt6976 = rsbytebuffer_1.readUnsignedShort();
        } else if (i_2 == 5) {
            this.anInt6971 = rsbytebuffer_1.readUnsignedShort();
        } else if (i_2 == 6) {
            this.anInt6978 = rsbytebuffer_1.readUnsignedShort();
        } else if (i_2 == 7) {
            this.anInt6979 = rsbytebuffer_1.readUnsignedByte();
        } else if (i_2 == 8) {
            this.anInt6981 = rsbytebuffer_1.readUnsignedByte();
        } else if (i_2 == 9) {
            this.aByte6982 = 3;
            this.anInt6980 = 8224;
        } else if (i_2 == 10) {
            this.aBool6968 = true;
        } else if (i_2 == 11) {
            this.aByte6982 = 1;
        } else if (i_2 == 12) {
            this.aByte6982 = 4;
        } else if (i_2 == 13) {
            this.aByte6982 = 5;
        } else if (i_2 == 14) {
            this.aByte6982 = 2;
            this.anInt6980 = rsbytebuffer_1.readUnsignedByte() * 256;
        } else if (i_2 == 15) {
            this.aByte6982 = 3;
            this.anInt6980 = rsbytebuffer_1.readUnsignedShort();
        } else if (i_2 == 16) {
            this.aByte6982 = 3;
            this.anInt6980 = rsbytebuffer_1.readInt();
        } else {
            int i_4;
            int i_5;
            if (i_2 == 40) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                this.aShortArray6972 = new short[i_4];
                this.aShortArray6983 = new short[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.aShortArray6972[i_5] = (short) rsbytebuffer_1.readUnsignedShort();
                    this.aShortArray6983[i_5] = (short) rsbytebuffer_1.readUnsignedShort();
                }
            } else if (i_2 == 41) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                this.aShortArray6974 = new short[i_4];
                this.aShortArray6975 = new short[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.aShortArray6974[i_5] = (short) rsbytebuffer_1.readUnsignedShort();
                    this.aShortArray6975[i_5] = (short) rsbytebuffer_1.readUnsignedShort();
                }
            }
        }
    }

    public final MeshRasterizer method11228(GraphicalRenderer graphicalrenderer_1, int i_2, Animation animation_3, byte b_4, byte b_5) {
        return this.rasterize(graphicalrenderer_1, i_2, false, null, null, 0, 0, 0, animation_3, b_4, -2132170713);
    }

    public final boolean method11230(int i_1) {
        return this.defaultModel == -1 || this.aClass515_6973.aClass317_5889.load(this.defaultModel, 0);
    }

    public final MeshRasterizer rasterize(GraphicalRenderer graphicalrenderer_1, int i_2, boolean bool_3, Ground class390_4, Ground class390_5, int i_6, int i_7, int i_8, Animation animation_9, byte b_10, int i_11) {
        int i_12 = i_2;
        bool_3 &= this.aByte6982 != 0;
        if (animation_9 != null) {
            i_12 = i_2 | animation_9.method7640(-1098428491);
        }
        if (bool_3) {
            i_12 |= this.aByte6982 == 3 ? 7 : 2;
        }
        if (this.anInt6971 != 128) {
            i_12 |= 0x2;
        }
        if (this.anInt6976 != 128 || this.anInt6978 != 0) {
            i_12 |= 0x5;
        }
        SoftCache softcache_14 = this.aClass515_6973.aClass229_5890;
        MeshRasterizer meshrasterizer_13;
        synchronized (this.aClass515_6973.aClass229_5890) {
            meshrasterizer_13 = (MeshRasterizer) this.aClass515_6973.aClass229_5890.get(this.anInt6969 |= graphicalrenderer_1.rendererId << 29);
        }
        if (meshrasterizer_13 == null || graphicalrenderer_1.method8452(meshrasterizer_13.m(), i_12) != 0) {
            if (meshrasterizer_13 != null) {
                i_12 = graphicalrenderer_1.method8546(i_12, meshrasterizer_13.m());
            }
            int i_17 = i_12;
            if (this.aShortArray6972 != null) {
                i_17 = i_12 | 0x4000;
            }
            if (this.aShortArray6974 != null) {
                i_17 |= 0x8000;
            }
            RSMesh rsmesh_15 = RSMesh.decodeMesh(this.aClass515_6973.aClass317_5889, this.defaultModel);
            if (rsmesh_15 == null) {
                return null;
            }
            if (rsmesh_15.version < 13) {
                rsmesh_15.upscale();
            }
            meshrasterizer_13 = graphicalrenderer_1.createMeshRasterizer(rsmesh_15, i_17, this.aClass515_6973.anInt5892, this.anInt6979 + 64, this.anInt6981 + 850);
            int i_16;
            if (this.aShortArray6972 != null) {
                for (i_16 = 0; i_16 < this.aShortArray6972.length; i_16++) {
                    meshrasterizer_13.X(this.aShortArray6972[i_16], this.aShortArray6983[i_16]);
                }
            }
            if (this.aShortArray6974 != null) {
                for (i_16 = 0; i_16 < this.aShortArray6974.length; i_16++) {
                    meshrasterizer_13.W(this.aShortArray6974[i_16], this.aShortArray6975[i_16]);
                }
            }
            meshrasterizer_13.KA(i_12);
            SoftCache softcache_18 = this.aClass515_6973.aClass229_5890;
            synchronized (this.aClass515_6973.aClass229_5890) {
                this.aClass515_6973.aClass229_5890.put(meshrasterizer_13, this.anInt6969 |= graphicalrenderer_1.rendererId << 29);
            }
        }
        MeshRasterizer meshrasterizer_21 = meshrasterizer_13.method11289(b_10, i_12, true);
        if (animation_9 != null) {
            animation_9.rasterize(meshrasterizer_21, 0);
        }
        if (this.anInt6976 != 128 || this.anInt6971 != 128) {
            meshrasterizer_21.oa(this.anInt6976, this.anInt6971, this.anInt6976);
        }
        if (this.anInt6978 != 0) {
            if (this.anInt6978 == 90) {
                meshrasterizer_21.f(4096);
            }
            if (this.anInt6978 == 180) {
                meshrasterizer_21.f(8192);
            }
            if (this.anInt6978 == 270) {
                meshrasterizer_21.f(12288);
            }
        }
        if (bool_3) {
            meshrasterizer_21.pa(this.aByte6982, this.anInt6980, class390_4, class390_5, i_6, i_7, i_8);
        }
        meshrasterizer_21.KA(i_2);
        return meshrasterizer_21;
    }

    static void method11243() {
        if (Class298.method5303((byte) 39)) {
            if (Class13.aStringArray129 == null) {
                FontRenderer.method402(-26055309);
            }
            Class179.aBool2229 = true;
            Class179.anInt2221 = 0;
        }
    }
}
