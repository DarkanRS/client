public class Class529 {

    public int anInt7026 = 4;

    public int[] anIntArray7042 = null;

    public int[] anIntArray7029 = null;

    public int anInt7030 = 4;

    public int anInt7032 = 4;

    public int anInt7028 = 7;

    public int anInt7034 = -1;

    public boolean aBool7044 = true;

    public boolean aBool7041 = true;

    public int anInt7038 = 2;

    public boolean aBool7035 = true;

    public int anInt7043 = 3;

    public int anInt7045 = -1;

    public int anInt7046 = -1;

    public int anInt7036;

    public int anInt7027;

    public short[][] aShortArrayArray7039;

    public short[][][] aShortArrayArrayArray7040;

    public Class529(Index index_1) {
        byte[] bytes_2 = index_1.getFile(DefaultsFile.FILE_3.fileId);
        this.method11335(new RsByteBuffer(bytes_2), (byte) 63);
    }

    void method11335(RsByteBuffer rsbytebuffer_1, byte b_2) {
        boolean bool_3 = false;
        while (true) {
            while (true) {
                int i_4 = rsbytebuffer_1.readUnsignedByte();
                if (i_4 == 0) {
                    if (!bool_3) {
                        if (this.anIntArray7042 == null) {
                            this.anInt7026 = 4;
                            this.anIntArray7042 = new int[4];
                            this.anIntArray7029 = new int[4];
                        }
                        for (i_4 = 0; i_4 < this.anIntArray7042.length; i_4++) {
                            this.anIntArray7042[i_4] = 0;
                            this.anIntArray7029[i_4] = i_4 * 20;
                        }
                    }
                    return;
                }
                int i_5;
                if (i_4 == 1) {
                    if (this.anIntArray7042 == null) {
                        this.anInt7026 = 4;
                        this.anIntArray7042 = new int[4];
                        this.anIntArray7029 = new int[4];
                    }
                    for (i_5 = 0; i_5 < this.anIntArray7042.length; i_5++) {
                        this.anIntArray7042[i_5] = rsbytebuffer_1.readShort();
                        this.anIntArray7029[i_5] = rsbytebuffer_1.readShort();
                    }
                    bool_3 = true;
                } else if (i_4 == 2) {
                    this.anInt7034 = rsbytebuffer_1.readBigSmart();
                } else if (i_4 == 3) {
                    this.anInt7026 = rsbytebuffer_1.readUnsignedByte();
                    this.anIntArray7042 = new int[this.anInt7026];
                    this.anIntArray7029 = new int[this.anInt7026];
                } else if (i_4 == 4) {
                    this.aBool7044 = false;
                } else if (i_4 == 5) {
                    this.anInt7036 = rsbytebuffer_1.read24BitUnsignedInteger();
                } else if (i_4 == 6) {
                    this.anInt7027 = rsbytebuffer_1.read24BitUnsignedInteger();
                } else if (i_4 != 7) {
                    if (i_4 == 8) {
                        this.aBool7041 = false;
                    } else if (i_4 == 9) {
                        this.anInt7038 = rsbytebuffer_1.readUnsignedByte();
                    } else if (i_4 == 10) {
                        this.aBool7035 = false;
                    } else if (i_4 == 11) {
                        this.anInt7043 = rsbytebuffer_1.readUnsignedByte();
                    } else if (i_4 == 12) {
                        this.anInt7045 = rsbytebuffer_1.readUnsignedShort();
                        this.anInt7046 = rsbytebuffer_1.readUnsignedShort();
                    } else if (i_4 == 13) {
                        this.anInt7032 = rsbytebuffer_1.readUnsignedByte();
                    } else if (i_4 == 14) {
                        this.anInt7030 = rsbytebuffer_1.readUnsignedByte();
                    } else if (i_4 == 15) {
                        this.anInt7028 = rsbytebuffer_1.readUnsignedByte();
                    }
                } else {
                    this.aShortArrayArray7039 = new short[10][4];
                    this.aShortArrayArrayArray7040 = new short[10][4][];
                    for (i_5 = 0; i_5 < 10; i_5++) {
                        for (int i_6 = 0; i_6 < 4; i_6++) {
                            int i_7 = rsbytebuffer_1.readUnsignedShort();
                            if (i_7 == 65535) {
                                i_7 = -1;
                            }
                            this.aShortArrayArray7039[i_5][i_6] = (short) i_7;
                            int i_8 = rsbytebuffer_1.readUnsignedShort();
                            this.aShortArrayArrayArray7040[i_5][i_6] = new short[i_8];
                            for (int i_9 = 0; i_9 < i_8; i_9++) {
                                int i_10 = rsbytebuffer_1.readUnsignedShort();
                                if (i_10 == 65535) {
                                    i_10 = -1;
                                }
                                this.aShortArrayArrayArray7040[i_5][i_6][i_9] = (short) i_10;
                            }
                        }
                    }
                }
            }
        }
    }

    static final void method11337(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
        icomponentdefinitions_0.anInt1329 = 6;
        icomponentdefinitions_0.aClass417_1308 = null;
        icomponentdefinitions_0.anInt1330 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
        if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
            Class92.method1565(icomponentdefinitions_0.idHash, -515297121);
        }
    }
}
