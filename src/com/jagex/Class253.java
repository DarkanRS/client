package com.jagex;

import java.util.Arrays;

public class Class253 {

    public static int anInt3129;
    public static boolean aBool3115;
    static int anInt3139;
    static Class254 aClass254_3120;
    Node_Sub15 aNode_Sub15_3122;
    int[] anIntArray3140;
    int anInt3132;
    int anInt3121;
    long aLong3124 = Utils.time();
    long aLong3128;
    boolean aBool3133 = true;
    int anInt3114;
    int anInt3125;
    int anInt3131;
    long aLong3126;
    int anInt3130;
    boolean aBool3135;
    int anInt3117;
    int anInt3123 = 32;
    Node_Sub15[] aNode_Sub15Array3116 = new Node_Sub15[8];
    Node_Sub15[] aNode_Sub15Array3141 = new Node_Sub15[8];

    public static void method4330(boolean bool_1) {
        if (true) {
            anInt3129 = 22050;
            aBool3115 = bool_1;
            anInt3139 = 2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static Class253 method4331(int i_1, int i_2) {
        int i_21 = i_2;
        if (anInt3129 == 0) {
            throw new IllegalStateException();
        } else if (i_1 >= 0 && i_1 < 2) {
            if (i_21 < 256) {
                i_21 = 256;
            }

            try {
                Class253_Sub1 class253_sub1_4 = new Class253_Sub1();
                class253_sub1_4.anIntArray3140 = new int[256 * (aBool3115 ? 2 : 1)];
                class253_sub1_4.anInt3132 = i_21;
                class253_sub1_4.method4370();
                class253_sub1_4.anInt3121 = (i_21 & -1024) + 1024;
                if (class253_sub1_4.anInt3121 > 16384) {
                    class253_sub1_4.anInt3121 = 16384;
                }

                class253_sub1_4.method4361(class253_sub1_4.anInt3121);
                if (anInt3139 > 0 && aClass254_3120 == null) {
                    aClass254_3120 = new Class254_Sub1();
                    Thread thread_5 = new Thread(aClass254_3120);
                    thread_5.setDaemon(true);
                    thread_5.start();
                    thread_5.setPriority(anInt3139);
                }

                if (aClass254_3120 != null) {
                    if (aClass254_3120.aClass253Array3142[i_1] != null) {
                        throw new IllegalArgumentException();
                    }

                    aClass254_3120.aClass253Array3142[i_1] = class253_sub1_4;
                }

                return class253_sub1_4;
            } catch (Throwable throwable_6) {
                return new Class253();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    static void method4338(Node_Sub15 class282_sub15_0) {
        class282_sub15_0.aBool7600 = false;
        if (class282_sub15_0.aNode_Sub26_7601 != null) {
            class282_sub15_0.aNode_Sub26_7601.anInt7690 = 0;
        }

        for (Node_Sub15 class282_sub15_1 = class282_sub15_0.method12226(); class282_sub15_1 != null; class282_sub15_1 = class282_sub15_0.method12239()) {
            method4338(class282_sub15_1);
        }

    }

    public synchronized void method4329(Node_Sub15 class282_sub15_1) {
        aNode_Sub15_3122 = class282_sub15_1;
    }

    public synchronized void method4333() {
        if (!aBool3135) {
            long long_1 = Utils.time();

            try {
                if (long_1 > aLong3124 + 6000L) {
                    aLong3124 = long_1 - 6000L;
                }

                while (long_1 > aLong3124 + 5000L) {
                    method4373();
                    aLong3124 += 256000 / anInt3129;
                    long_1 = Utils.time();
                }
            } catch (Exception exception_7) {
                aLong3124 = long_1;
            }

            if (anIntArray3140 != null) {
                try {
                    if (aLong3128 != 0L) {
                        if (long_1 < aLong3128) {
                            return;
                        }

                        method4361(anInt3121);
                        aLong3128 = 0L;
                        aBool3133 = true;
                    }

                    int i_5 = method4340();
                    if (anInt3131 - i_5 > anInt3114) {
                        anInt3114 = anInt3131 - i_5;
                    }

                    int i_4 = anInt3132 + anInt3125;
                    if (i_4 + 256 > 16384) {
                        i_4 = 16128;
                    }

                    if (i_4 + 256 > anInt3121) {
                        anInt3121 += 1024;
                        if (anInt3121 > 16384) {
                            anInt3121 = 16384;
                        }

                        method4343();
                        method4361(anInt3121);
                        i_5 = 0;
                        aBool3133 = true;
                        if (i_4 + 256 > anInt3121) {
                            i_4 = anInt3121 - 256;
                            anInt3125 = i_4 - anInt3132;
                        }
                    }

                    while (i_5 < i_4) {
                        method4337(anIntArray3140);
                        method4342();
                        i_5 += 256;
                    }

                    if (long_1 > aLong3126) {
                        if (!aBool3133) {
                            if (anInt3114 == 0 && anInt3130 == 0) {
                                method4343();
                                aLong3128 = long_1 + 2000L;
                                return;
                            }

                            anInt3125 = Math.min(anInt3130, anInt3114);
                            anInt3130 = anInt3114;
                        } else {
                            aBool3133 = false;
                        }

                        anInt3114 = 0;
                        aLong3126 = long_1 + 2000L;
                    }

                    anInt3131 = i_5;
                } catch (Exception exception_6) {
                    method4343();
                    aLong3128 = long_1 + 2000L;
                }
            }
        }

    }

    public synchronized void method4334() {
        aBool3133 = true;

        try {
            method4344();
        } catch (Exception exception_2) {
            method4343();
            aLong3128 = Utils.time() + 2000L;
        }

    }

    public synchronized void method4335() {
        if (aClass254_3120 != null) {
            boolean bool_1 = true;

            for (int i_2 = 0; i_2 < 2; i_2++) {
                if (this == aClass254_3120.aClass253Array3142[i_2]) {
                    aClass254_3120.aClass253Array3142[i_2] = null;
                }

                if (aClass254_3120.aClass253Array3142[i_2] != null) {
                    bool_1 = false;
                }
            }

            if (bool_1) {
                aClass254_3120.aBool3143 = true;

                while (aClass254_3120.aBool3144) {
                    Class89.sleep(50L);
                }

                aClass254_3120 = null;
            }
        }

        method4343();
        anIntArray3140 = null;
        aBool3135 = true;
    }

    void method4337(int[] ints_1) {
        int i_3 = 256;
        if (aBool3115) {
            i_3 = 512;
        }

        Arrays.fill(ints_1, 0, i_3, 0);
        anInt3117 -= 256;
        if (aNode_Sub15_3122 != null && anInt3117 <= 0) {
            anInt3117 += anInt3129 >> 4;
            method4338(aNode_Sub15_3122);
            method4339(aNode_Sub15_3122, aNode_Sub15_3122.method12225());
            int i_4 = 0;
            int i_5 = 255;

            int i_6;
            Node_Sub15 class282_sub15_10;
            label107:
            for (i_6 = 7; i_5 != 0; --i_6) {
                int i_16;
                int i_17;
                if (i_6 < 0) {
                    i_16 = i_6 & 0x3;
                    i_17 = -(i_6 >> 2);
                } else {
                    i_16 = i_6;
                    i_17 = 0;
                }

                for (int i_9 = i_5 >>> i_16 & 0x11111111; i_9 != 0; i_9 >>>= 4) {
                    if ((i_9 & 0x1) != 0) {
                        i_5 &= ~(1 << i_16);
                        class282_sub15_10 = null;
                        Node_Sub15 class282_sub15_11 = aNode_Sub15Array3116[i_16];

                        label101:
                        while (true) {
                            while (true) {
                                if (class282_sub15_11 == null) {
                                    break label101;
                                }

                                Node_Sub26 class282_sub26_12 = class282_sub15_11.aNode_Sub26_7601;
                                if (class282_sub26_12 != null && class282_sub26_12.anInt7690 > i_17) {
                                    i_5 |= 1 << i_16;
                                    class282_sub15_10 = class282_sub15_11;
                                    class282_sub15_11 = class282_sub15_11.aNode_Sub15_7598;
                                } else {
                                    class282_sub15_11.aBool7600 = true;
                                    int i_13 = class282_sub15_11.method12228();
                                    i_4 += i_13;
                                    if (class282_sub26_12 != null) {
                                        class282_sub26_12.anInt7690 += i_13;
                                    }

                                    if (i_4 >= anInt3123) {
                                        break label107;
                                    }

                                    Node_Sub15 class282_sub15_14 = class282_sub15_11.method12226();
                                    if (class282_sub15_14 != null) {
                                        for (int i_15 = class282_sub15_11.anInt7599; class282_sub15_14 != null; class282_sub15_14 = class282_sub15_11.method12239()) {
                                            method4339(class282_sub15_14, i_15 * class282_sub15_14.method12225() >> 8);
                                        }
                                    }

                                    Node_Sub15 class282_sub15_18 = class282_sub15_11.aNode_Sub15_7598;
                                    class282_sub15_11.aNode_Sub15_7598 = null;
                                    if (class282_sub15_10 == null) {
                                        aNode_Sub15Array3116[i_16] = class282_sub15_18;
                                    } else {
                                        class282_sub15_10.aNode_Sub15_7598 = class282_sub15_18;
                                    }

                                    if (class282_sub15_18 == null) {
                                        aNode_Sub15Array3141[i_16] = class282_sub15_10;
                                    }

                                    class282_sub15_11 = class282_sub15_18;
                                }
                            }
                        }
                    }

                    i_16 += 4;
                    ++i_17;
                }
            }

            for (i_6 = 0; i_6 < 8; i_6++) {
                Node_Sub15 class282_sub15_7 = aNode_Sub15Array3116[i_6];
                Node_Sub15[] arr_8 = aNode_Sub15Array3116;
                aNode_Sub15Array3141[i_6] = null;

                for (arr_8[i_6] = null; class282_sub15_7 != null; class282_sub15_7 = class282_sub15_10) {
                    class282_sub15_10 = class282_sub15_7.aNode_Sub15_7598;
                    class282_sub15_7.aNode_Sub15_7598 = null;
                }
            }
        }

        if (anInt3117 < 0) {
            anInt3117 = 0;
        }

        if (aNode_Sub15_3122 != null) {
            aNode_Sub15_3122.method12230(ints_1, 0, 256);
        }

        aLong3124 = Utils.time();
    }

    void method4339(Node_Sub15 class282_sub15_1, int i_2) {
        int i_3 = i_2 >> 5;
        Node_Sub15 class282_sub15_4 = aNode_Sub15Array3141[i_3];
        if (class282_sub15_4 == null) {
            aNode_Sub15Array3116[i_3] = class282_sub15_1;
        } else {
            class282_sub15_4.aNode_Sub15_7598 = class282_sub15_1;
        }

        aNode_Sub15Array3141[i_3] = class282_sub15_1;
        class282_sub15_1.anInt7599 = i_2;
    }

    int method4340() throws Exception {
        return anInt3121;
    }

    void method4342() throws Exception {
    }

    void method4343() {
    }

    void method4344() throws Exception {
    }

    void method4361(int i_1) throws Exception {
    }

    void method4370() throws Exception {
    }

    void method4373() {
        anInt3117 -= 256;
        if (anInt3117 < 0) {
            anInt3117 = 0;
        }

        if (aNode_Sub15_3122 != null) {
            aNode_Sub15_3122.method12231(256);
        }

    }

}
