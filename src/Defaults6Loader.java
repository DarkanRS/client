public class Defaults6Loader {

    public int[] equipmentSlots;

    public int anInt6990 = -1;

    public int anInt6991 = -1;

    public int[] anIntArray6992;

    public int[] anIntArray6993;

    void method11245(RsByteBuffer rsbytebuffer_1, int i_2) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            int i_4;
            if (i_3 == 1) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                this.equipmentSlots = new int[i_4];
                for (int i_5 = 0; i_5 < this.equipmentSlots.length; i_5++) {
                    this.equipmentSlots[i_5] = rsbytebuffer_1.readUnsignedByte();
                    if (this.equipmentSlots[i_5] != 0) {
                        int i_10000 = this.equipmentSlots[i_5];
                    }
                }
            } else if (i_3 == 3) {
                this.anInt6990 = rsbytebuffer_1.readUnsignedByte();
            } else if (i_3 == 4) {
                this.anInt6991 = rsbytebuffer_1.readUnsignedByte();
            } else if (i_3 == 5) {
                this.anIntArray6992 = new int[rsbytebuffer_1.readUnsignedByte()];
                for (i_4 = 0; i_4 < this.anIntArray6992.length; i_4++) {
                    this.anIntArray6992[i_4] = rsbytebuffer_1.readUnsignedByte();
                }
            } else if (i_3 == 6) {
                this.anIntArray6993 = new int[rsbytebuffer_1.readUnsignedByte()];
                for (i_4 = 0; i_4 < this.anIntArray6993.length; i_4++) {
                    this.anIntArray6993[i_4] = rsbytebuffer_1.readUnsignedByte();
                }
            }
        }
    }

    public Defaults6Loader(Index index_1) {
        byte[] bytes_2 = index_1.getFile(DefaultsFile.FILE_6.fileId);
        this.method11245(new RsByteBuffer(bytes_2), -672057910);
        if (this.equipmentSlots == null) {
            throw new RuntimeException("");
        }
    }

    public static void method11248(int i_0) {
        Class393.preferences.setValue(Class393.preferences.aClass468_Sub27_8208, 2, -739339272);
        Class393.preferences.setValue(Class393.preferences.aClass468_Sub27_8209, 2, -1802461123);
        Class393.preferences.setValue(Class393.preferences.aClass468_Sub23_8202, 1, -2042721165);
        Class393.preferences.setValue(Class393.preferences.aClass468_Sub17_8200, 1, -483974796);
        Class393.preferences.setValue(Class393.preferences.idleAnimations, 1, -1488523867);
        Class393.preferences.setValue(Class393.preferences.aClass468_Sub26_8224, 1, 1312691024);
        Class393.preferences.setValue(Class393.preferences.aClass468_Sub28_8212, 1, 1015106335);
        Class393.preferences.setValue(Class393.preferences.textures, 1, -562253480);
        Class393.preferences.setValue(Class393.preferences.aClass468_Sub2_8205, 2, -1286707836);
        Class393.preferences.setValue(Class393.preferences.aClass468_Sub19_8204, 1, 478043407);
        Class393.preferences.setValue(Class393.preferences.water, 2, -821146984);
        Class393.preferences.setValue(Class393.preferences.fog, 1, -268934018);
        Class393.preferences.setValue(Class393.preferences.aClass468_Sub4_8187, 0, 1600153169);
        Class393.preferences.setValue(Class393.preferences.aClass468_Sub4_8223, 0, -2035572278);
        Class393.preferences.setValue(Class393.preferences.aClass468_Sub20_8207, 2, 2138674404);
        Class393.preferences.setValue(Class393.preferences.aClass468_Sub1_8197, Class106.aClass106_1075.anInt1071, -1318681666);
        Class393.preferences.setValue(Class393.preferences.aClass468_Sub12_8195, 0, 1179600345);
        Class393.preferences.setValue(Class393.preferences.aClass468_Sub14_8211, 1, 991235937);
        Class323.method5777(1560410818);
        Class393.preferences.setValue(Class393.preferences.aClass468_Sub7_8210, 0, -231227368);
        Class393.preferences.setValue(Class393.preferences.graphics, 4, -702190975);
        Class94.method1589((short) 255);
        IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4048(1356336946);
        client.aBool7185 = true;
    }
}
