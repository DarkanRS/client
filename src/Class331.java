public class Class331 {

    SoftCache aClass229_3871 = new SoftCache(64);

    Index aClass317_3872;

    Index aClass317_3870;

    public Class282_Sub50_Sub14 method5918(int i_1, int i_2) {
        Class282_Sub50_Sub14 class282_sub50_sub14_3 = (Class282_Sub50_Sub14) this.aClass229_3871.get((long) i_1);
        if (class282_sub50_sub14_3 != null) {
            return class282_sub50_sub14_3;
        } else {
            byte[] bytes_4;
            if (i_1 >= 32768) {
                bytes_4 = this.aClass317_3870.getFile(0, i_1 & 0x7fff);
            } else {
                bytes_4 = this.aClass317_3872.getFile(0, i_1);
            }
            class282_sub50_sub14_3 = new Class282_Sub50_Sub14();
            if (bytes_4 != null) {
                class282_sub50_sub14_3.method15209(new RsByteBuffer(bytes_4), 625561470);
            }
            if (i_1 >= 32768) {
                class282_sub50_sub14_3.method15213(707027607);
            }
            this.aClass229_3871.put(class282_sub50_sub14_3, (long) i_1);
            return class282_sub50_sub14_3;
        }
    }

    public Class331(Language xlanguage_1, Index index_2, Index index_3) {
        this.aClass317_3872 = index_2;
        this.aClass317_3870 = index_3;
        if (this.aClass317_3872 != null) {
            this.aClass317_3872.filesCount(0);
        }
        if (this.aClass317_3870 != null) {
            this.aClass317_3870.filesCount(0);
        }
    }

    static void method5921(byte b_0) {
        if (client.aByteArray7152 != null) {
            Class346.method6160(1908586920);
        } else if (Class9.anInt76 != -1) {
            Class279.method4964(-1370855311);
        } else {
            Class282_Sub20_Sub26.lobbyLogin(Class9.aString99, Class9.aString102, (byte) -8);
        }
    }

    public static void method5923(Animable animable_0, int[] ints_1, int[] ints_2, int[] ints_3, int i_4) {
        for (int i_5 = 0; i_5 < ints_1.length; i_5++) {
            int i_6 = ints_1[i_5];
            int i_7 = ints_3[i_5];
            int i_8 = ints_2[i_5];
            for (int i_9 = 0; i_7 != 0 && i_9 < animable_0.aClass456_Sub2_Sub1Array10354.length; i_7 >>>= 1) {
                if ((i_7 & 0x1) != 0) {
                    if (i_6 == -1) {
                        animable_0.aClass456_Sub2_Sub1Array10354[i_9] = null;
                    } else {
                        AnimationDefinitions animationdefinitions_10 = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(i_6, (byte) 24);
                        int i_11 = animationdefinitions_10.replayMode;
                        Class456_Sub2_Sub1 class456_sub2_sub1_12 = animable_0.aClass456_Sub2_Sub1Array10354[i_9];
                        if (class456_sub2_sub1_12 != null && class456_sub2_sub1_12.hasDefs()) {
                            if (i_6 == class456_sub2_sub1_12.method7597(-1055922469)) {
                                if (i_11 == 0) {
                                    animable_0.aClass456_Sub2_Sub1Array10354[i_9] = null;
                                    class456_sub2_sub1_12 = null;
                                } else if (i_11 == 1) {
                                    class456_sub2_sub1_12.method7582((byte) -96);
                                    class456_sub2_sub1_12.anInt10065 = i_8;
                                } else if (i_11 == 2) {
                                    class456_sub2_sub1_12.method7584(-309852534);
                                }
                            } else if (animationdefinitions_10.priority >= class456_sub2_sub1_12.getDefs().priority) {
                                animable_0.aClass456_Sub2_Sub1Array10354[i_9] = null;
                                class456_sub2_sub1_12 = null;
                            }
                        }
                        if (class456_sub2_sub1_12 == null || !class456_sub2_sub1_12.hasDefs()) {
                            class456_sub2_sub1_12 = animable_0.aClass456_Sub2_Sub1Array10354[i_9] = new Class456_Sub2_Sub1(animable_0);
                            class456_sub2_sub1_12.method7567(i_6, (short) 8960);
                            class456_sub2_sub1_12.anInt10065 = i_8;
                        }
                    }
                }
                ++i_9;
            }
        }
    }

    static void method5924(int i_0, boolean bool_1, int i_2) {
        Class282_Sub50_Sub12 class282_sub50_sub12_3 = Engine.getIComponentVar(21, (long) i_0);
        class282_sub50_sub12_3.method14995(1949020630);
        class282_sub50_sub12_3.anInt9668 = bool_1 ? 1 : 0;
    }
}
