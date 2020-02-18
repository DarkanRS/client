package com.jagex;

public class Class471 {

    static Class459 aClass459_5588 = new Class459();

    Class471() throws Throwable {
        throw new Error();
    }

    public static int method7828(byte[] bytes_0, int i_1, byte[] bytes_2) {
        Class459 class459_5 = aClass459_5588;
        synchronized (aClass459_5588) {
            aClass459_5588.aByteArray5502 = bytes_2;
            aClass459_5588.anInt5503 = 9;
            aClass459_5588.aByteArray5526 = bytes_0;
            aClass459_5588.anInt5506 = 0;
            aClass459_5588.anInt5507 = i_1;
            aClass459_5588.anInt5532 = 0;
            aClass459_5588.anInt5511 = 0;
            aClass459_5588.anInt5499 = 0;
            aClass459_5588.anInt5508 = 0;
            method7848(aClass459_5588);
            i_1 -= aClass459_5588.anInt5507;
            aClass459_5588.aByteArray5502 = null;
            aClass459_5588.aByteArray5526 = null;
            return i_1;
        }
    }

    static byte method7831(Class459 class459_0) {
        return (byte) method7833(8, class459_0);
    }

    static byte method7832(Class459 class459_0) {
        return (byte) method7833(1, class459_0);
    }

    static int method7833(int i_0, Class459 class459_1) {
        while (class459_1.anInt5532 < i_0) {
            class459_1.anInt5511 = class459_1.anInt5511 << 8 | class459_1.aByteArray5502[class459_1.anInt5503] & 0xff;
            class459_1.anInt5532 += 8;
            ++class459_1.anInt5503;
            class459_1.anInt5499 += 1564222761;
            int i_10000 = class459_1.anInt5499;
        }

        int i_2 = class459_1.anInt5511 >> class459_1.anInt5532 - i_0 & (1 << i_0) - 1;
        class459_1.anInt5532 -= i_0;
        return i_2;
    }

    static void method7835(int[] ints_0, int[] ints_1, int[] ints_2, byte[] bytes_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;

        int i_8;
        int i_9;
        for (i_8 = i_4; i_8 <= i_5; i_8++) {
            for (i_9 = 0; i_9 < i_6; i_9++) {
                if (i_8 == bytes_3[i_9]) {
                    ints_2[i_7] = i_9;
                    ++i_7;
                }
            }
        }

        for (i_8 = 0; i_8 < 23; i_8++) {
            ints_1[i_8] = 0;
        }

        for (i_8 = 0; i_8 < i_6; i_8++) {
            ++ints_1[bytes_3[i_8] + 1];
        }

        for (i_8 = 1; i_8 < 23; i_8++) {
            ints_1[i_8] += ints_1[i_8 - 1];
        }

        for (i_8 = 0; i_8 < 23; i_8++) {
            ints_0[i_8] = 0;
        }

        i_8 = 0;

        for (i_9 = i_4; i_9 <= i_5; i_9++) {
            i_8 += ints_1[i_9 + 1] - ints_1[i_9];
            ints_0[i_9] = i_8 - 1;
            i_8 <<= 1;
        }

        for (i_9 = i_4 + 1; i_9 <= i_5; i_9++) {
            ints_1[i_9] = (ints_0[i_9 - 1] + 1 << 1) - ints_1[i_9];
        }

    }

    static void method7836(Class459 class459_0) {
        byte b_1 = class459_0.aByte5509;
        int i_2 = class459_0.anInt5496;
        int i_3 = class459_0.anInt5518;
        int i_4 = class459_0.anInt5516;
        int[] ints_5 = Class266.anIntArray3288;
        int i_6 = class459_0.anInt5515;
        byte[] bytes_7 = class459_0.aByteArray5526;
        int i_8 = class459_0.anInt5506;
        int i_9 = class459_0.anInt5507;
        int i_11 = class459_0.anInt5505 + 1;

        label56:
        while (true) {
            if (i_2 > 0) {
                while (true) {
                    if (i_9 == 0) {
                        break label56;
                    }

                    if (i_2 == 1) {
                        if (i_9 == 0) {
                            i_2 = 1;
                            break label56;
                        }

                        bytes_7[i_8] = b_1;
                        ++i_8;
                        --i_9;
                        break;
                    }

                    bytes_7[i_8] = b_1;
                    --i_2;
                    ++i_8;
                    --i_9;
                }
            }

            while (i_3 != i_11) {
                b_1 = (byte) i_4;
                i_6 = ints_5[i_6];
                byte b_12 = (byte) i_6;
                i_6 >>= 8;
                ++i_3;
                if (b_12 != i_4) {
                    i_4 = b_12;

                } else {
                    if (i_3 != i_11) {
                        i_2 = 2;
                        i_6 = ints_5[i_6];
                        b_12 = (byte) i_6;
                        i_6 >>= 8;
                        ++i_3;
                        if (i_3 != i_11) {
                            if (b_12 != i_4) {
                                i_4 = b_12;
                            } else {
                                i_2 = 3;
                                i_6 = ints_5[i_6];
                                b_12 = (byte) i_6;
                                i_6 >>= 8;
                                ++i_3;
                                if (i_3 != i_11) {
                                    if (b_12 != i_4) {
                                        i_4 = b_12;
                                    } else {
                                        i_6 = ints_5[i_6];
                                        b_12 = (byte) i_6;
                                        i_6 >>= 8;
                                        ++i_3;
                                        i_2 = (b_12 & 0xff) + 4;
                                        i_6 = ints_5[i_6];
                                        i_4 = (byte) i_6;
                                        i_6 >>= 8;
                                        ++i_3;
                                    }
                                }
                            }
                        }
                        continue label56;
                    }

                }
                if (i_9 == 0) {
                    i_2 = 1;
                    break label56;
                }
                bytes_7[i_8] = b_1;
                ++i_8;
                --i_9;
            }

            i_2 = 0;
            break;
        }

        int i_13 = class459_0.anInt5508;
        class459_0.anInt5508 += 0;
        int i_10000 = class459_0.anInt5508 * -1541698763;
        class459_0.aByte5509 = b_1;
        class459_0.anInt5496 = i_2;
        class459_0.anInt5518 = i_3;
        class459_0.anInt5516 = i_4;
        Class266.anIntArray3288 = ints_5;
        class459_0.anInt5515 = i_6;
        class459_0.aByteArray5526 = bytes_7;
        class459_0.anInt5506 = i_8;
        class459_0.anInt5507 = i_9;
    }

    static void method7844(Class459 class459_0) {
        class459_0.anInt5520 = 0;

        for (int i_1 = 0; i_1 < 256; i_1++) {
            if (class459_0.aBoolArray5497[i_1]) {
                class459_0.aByteArray5523[class459_0.anInt5520] = (byte) i_1;
                ++class459_0.anInt5520;
            }
        }

    }

    static void method7848(Class459 class459_0) {
        boolean bool_1 = false;
        boolean bool_2 = false;
        boolean bool_3 = false;
        boolean bool_4 = false;
        boolean bool_5 = false;
        boolean bool_6 = false;
        boolean bool_7 = false;
        boolean bool_8 = false;
        boolean bool_9 = false;
        boolean bool_10 = false;
        boolean bool_11 = false;
        boolean bool_12 = false;
        boolean bool_13 = false;
        boolean bool_14 = false;
        boolean bool_15 = false;
        boolean bool_16 = false;
        boolean bool_17 = false;
        boolean bool_18 = false;
        int i_19 = 0;
        int[] ints_20 = null;
        int[] ints_21 = null;
        int[] ints_22 = null;
        class459_0.anInt5513 = 1;
        if (Class266.anIntArray3288 == null) {
            Class266.anIntArray3288 = new int[class459_0.anInt5513 * 100000];
        }

        boolean bool_23 = true;

        while (bool_23) {
            byte b_24 = method7831(class459_0);
            if (b_24 == 23) {
                break;
            }

            b_24 = method7831(class459_0);
            b_24 = method7831(class459_0);
            b_24 = method7831(class459_0);
            b_24 = method7831(class459_0);
            b_24 = method7831(class459_0);
            b_24 = method7831(class459_0);
            b_24 = method7831(class459_0);
            b_24 = method7831(class459_0);
            b_24 = method7831(class459_0);
            b_24 = method7832(class459_0);
            class459_0.anInt5514 = 0;
            byte b_25 = method7831(class459_0);
            class459_0.anInt5514 = class459_0.anInt5514 << 8 | b_25 & 0xff;
            b_25 = method7831(class459_0);
            class459_0.anInt5514 = class459_0.anInt5514 << 8 | b_25 & 0xff;
            b_25 = method7831(class459_0);
            class459_0.anInt5514 = class459_0.anInt5514 << 8 | b_25 & 0xff;

            int i_26;
            for (i_26 = 0; i_26 < 16; i_26++) {
                b_24 = method7832(class459_0);
                class459_0.aBoolArray5510[i_26] = b_24 == 1;
            }

            for (i_26 = 0; i_26 < 256; i_26++) {
                class459_0.aBoolArray5497[i_26] = false;
            }

            int i_27;
            for (i_26 = 0; i_26 < 16; i_26++) {
                if (class459_0.aBoolArray5510[i_26]) {
                    for (i_27 = 0; i_27 < 16; i_27++) {
                        b_24 = method7832(class459_0);
                        if (b_24 == 1) {
                            class459_0.aBoolArray5497[i_27 + i_26 * 16] = true;
                        }
                    }
                }
            }

            method7844(class459_0);
            i_26 = class459_0.anInt5520 + 2;
            i_27 = method7833(3, class459_0);
            int i_28 = method7833(15, class459_0);

            int i_30;
            for (int i_29 = 0; i_29 < i_28; i_29++) {
                i_30 = 0;

                while (true) {
                    b_24 = method7832(class459_0);
                    if (b_24 == 0) {
                        class459_0.aByteArray5527[i_29] = (byte) i_30;
                        break;
                    }

                    ++i_30;
                }
            }

            byte[] bytes_45 = new byte[6];

            for (byte b_47 = 0; b_47 < i_27; bytes_45[b_47] = b_47++) {
            }

            byte b_31;
            byte b_32;
            for (i_30 = 0; i_30 < i_28; i_30++) {
                b_31 = class459_0.aByteArray5527[i_30];

                for (b_32 = bytes_45[b_31]; b_31 > 0; --b_31) {
                    bytes_45[b_31] = bytes_45[b_31 - 1];
                }

                bytes_45[0] = b_32;
                class459_0.aByteArray5504[i_30] = b_32;
            }

            int i_48;
            int i_49;
            for (i_30 = 0; i_30 < i_27; i_30++) {
                i_48 = method7833(5, class459_0);

                for (i_49 = 0; i_49 < i_26; i_49++) {
                    while (true) {
                        b_24 = method7832(class459_0);
                        if (b_24 == 0) {
                            class459_0.aByteArrayArray5528[i_30][i_49] = (byte) i_48;
                            break;
                        }

                        b_24 = method7832(class459_0);
                        if (b_24 == 0) {
                            ++i_48;
                        } else {
                            --i_48;
                        }
                    }
                }
            }

            int i_33;
            for (i_30 = 0; i_30 < i_27; i_30++) {
                b_31 = 32;
                b_32 = 0;

                for (i_33 = 0; i_33 < i_26; i_33++) {
                    if (class459_0.aByteArrayArray5528[i_30][i_33] > b_32) {
                        b_32 = class459_0.aByteArrayArray5528[i_30][i_33];
                    }

                    if (class459_0.aByteArrayArray5528[i_30][i_33] < b_31) {
                        b_31 = class459_0.aByteArrayArray5528[i_30][i_33];
                    }
                }

                method7835(class459_0.anIntArrayArray5529[i_30], class459_0.anIntArrayArray5530[i_30], class459_0.anIntArrayArray5531[i_30], class459_0.aByteArrayArray5528[i_30], b_31, b_32, i_26);
                class459_0.anIntArray5533[i_30] = b_31;
            }

            i_30 = class459_0.anInt5520 + 1;
            i_48 = -1;
            byte b_50 = 0;

            for (i_33 = 0; i_33 <= 255; i_33++) {
                class459_0.anIntArray5517[i_33] = 0;
            }

            i_33 = 4095;

            int i_34;
            int i_35;
            for (i_34 = 15; i_34 >= 0; --i_34) {
                for (i_35 = 15; i_35 >= 0; --i_35) {
                    class459_0.aByteArray5524[i_33] = (byte) (i_35 + i_34 * 16);
                    --i_33;
                }

                class459_0.anIntArray5525[i_34] = i_33 + 1;
            }

            i_34 = 0;
            if (b_50 == 0) {
                ++i_48;
                b_50 = 50;
                byte b_51 = class459_0.aByteArray5504[i_48];
                i_19 = class459_0.anIntArray5533[b_51];
                ints_20 = class459_0.anIntArrayArray5529[b_51];
                ints_22 = class459_0.anIntArrayArray5531[b_51];
                ints_21 = class459_0.anIntArrayArray5530[b_51];
            }

            i_49 = b_50 - 1;
            i_35 = i_19;

            byte b_36;
            int i_37;
            for (i_37 = method7833(i_19, class459_0); i_37 > ints_20[i_35]; i_37 = i_37 << 1 | b_36) {
                ++i_35;
                b_36 = method7832(class459_0);
            }

            int i_38 = ints_22[i_37 - ints_21[i_35]];

            while (true) {
                int i_39;
                while (i_38 != i_30) {
                    int i_40;
                    if (i_38 != 0 && i_38 != 1) {
                        i_39 = i_38 - 1;
                        int i_52;
                        if (i_39 < 16) {
                            i_40 = class459_0.anIntArray5525[0];

                            for (b_24 = class459_0.aByteArray5524[i_40 + i_39]; i_39 > 3; i_39 -= 4) {
                                i_52 = i_40 + i_39;
                                class459_0.aByteArray5524[i_52] = class459_0.aByteArray5524[i_52 - 1];
                                class459_0.aByteArray5524[i_52 - 1] = class459_0.aByteArray5524[i_52 - 2];
                                class459_0.aByteArray5524[i_52 - 2] = class459_0.aByteArray5524[i_52 - 3];
                                class459_0.aByteArray5524[i_52 - 3] = class459_0.aByteArray5524[i_52 - 4];
                            }

                            while (i_39 > 0) {
                                class459_0.aByteArray5524[i_40 + i_39] = class459_0.aByteArray5524[i_40 + i_39 - 1];
                                --i_39;
                            }

                            class459_0.aByteArray5524[i_40] = b_24;
                        } else {
                            i_40 = i_39 / 16;
                            i_52 = i_39 % 16;
                            int i_42 = class459_0.anIntArray5525[i_40] + i_52;

                            for (b_24 = class459_0.aByteArray5524[i_42]; i_42 > class459_0.anIntArray5525[i_40]; --i_42) {
                                class459_0.aByteArray5524[i_42] = class459_0.aByteArray5524[i_42 - 1];
                            }

                            ++class459_0.anIntArray5525[i_40];

                            while (i_40 > 0) {
                                --class459_0.anIntArray5525[i_40];
                                class459_0.aByteArray5524[class459_0.anIntArray5525[i_40]] = class459_0.aByteArray5524[class459_0.anIntArray5525[i_40 - 1] + 16 - 1];
                                --i_40;
                            }

                            --class459_0.anIntArray5525[0];
                            class459_0.aByteArray5524[class459_0.anIntArray5525[0]] = b_24;
                            if (class459_0.anIntArray5525[0] == 0) {
                                i_33 = 4095;

                                for (int i_43 = 15; i_43 >= 0; --i_43) {
                                    for (int i_44 = 15; i_44 >= 0; --i_44) {
                                        class459_0.aByteArray5524[i_33] = class459_0.aByteArray5524[class459_0.anIntArray5525[i_43] + i_44];
                                        --i_33;
                                    }

                                    class459_0.anIntArray5525[i_43] = i_33 + 1;
                                }
                            }
                        }

                        ++class459_0.anIntArray5517[class459_0.aByteArray5523[b_24 & 0xff] & 0xff];
                        Class266.anIntArray3288[i_34] = class459_0.aByteArray5523[b_24 & 0xff] & 0xff;
                        ++i_34;
                        if (i_49 == 0) {
                            ++i_48;
                            i_49 = 50;
                            byte b_53 = class459_0.aByteArray5504[i_48];
                            i_19 = class459_0.anIntArray5533[b_53];
                            ints_20 = class459_0.anIntArrayArray5529[b_53];
                            ints_22 = class459_0.anIntArrayArray5531[b_53];
                            ints_21 = class459_0.anIntArrayArray5530[b_53];
                        }

                        --i_49;
                        i_35 = i_19;

                        for (i_37 = method7833(i_19, class459_0); i_37 > ints_20[i_35]; i_37 = i_37 << 1 | b_36) {
                            ++i_35;
                            b_36 = method7832(class459_0);
                        }

                        i_38 = ints_22[i_37 - ints_21[i_35]];
                    } else {
                        i_39 = -1;
                        i_40 = 1;

                        do {
                            if (i_38 == 0) {
                                i_39 += i_40;
                            } else if (i_38 == 1) {
                                i_39 += i_40 * 2;
                            }

                            i_40 *= 2;
                            if (i_49 == 0) {
                                ++i_48;
                                i_49 = 50;
                                byte b_41 = class459_0.aByteArray5504[i_48];
                                i_19 = class459_0.anIntArray5533[b_41];
                                ints_20 = class459_0.anIntArrayArray5529[b_41];
                                ints_22 = class459_0.anIntArrayArray5531[b_41];
                                ints_21 = class459_0.anIntArrayArray5530[b_41];
                            }

                            --i_49;
                            i_35 = i_19;

                            for (i_37 = method7833(i_19, class459_0); i_37 > ints_20[i_35]; i_37 = i_37 << 1 | b_36) {
                                ++i_35;
                                b_36 = method7832(class459_0);
                            }

                            i_38 = ints_22[i_37 - ints_21[i_35]];
                        } while (i_38 == 0 || i_38 == 1);

                        ++i_39;
                        b_25 = class459_0.aByteArray5523[class459_0.aByteArray5524[class459_0.anIntArray5525[0]] & 0xff];

                        for (class459_0.anIntArray5517[b_25 & 0xff] += i_39; i_39 > 0; --i_39) {
                            Class266.anIntArray3288[i_34] = b_25 & 0xff;
                            ++i_34;
                        }
                    }
                }

                class459_0.anInt5496 = 0;
                class459_0.aByte5509 = 0;
                class459_0.anIntArray5519[0] = 0;

                for (i_39 = 1; i_39 <= 256; i_39++) {
                    class459_0.anIntArray5519[i_39] = class459_0.anIntArray5517[i_39 - 1];
                }

                for (i_39 = 1; i_39 <= 256; i_39++) {
                    class459_0.anIntArray5519[i_39] += class459_0.anIntArray5519[i_39 - 1];
                }

                for (i_39 = 0; i_39 < i_34; i_39++) {
                    b_25 = (byte) (Class266.anIntArray3288[i_39] & 0xff);
                    Class266.anIntArray3288[class459_0.anIntArray5519[b_25 & 0xff]] |= i_39 << 8;
                    ++class459_0.anIntArray5519[b_25 & 0xff];
                }

                class459_0.anInt5515 = Class266.anIntArray3288[class459_0.anInt5514] >> 8;
                class459_0.anInt5518 = 0;
                class459_0.anInt5515 = Class266.anIntArray3288[class459_0.anInt5515];
                class459_0.anInt5516 = (byte) (class459_0.anInt5515 & 0xff);
                class459_0.anInt5515 >>= 8;
                ++class459_0.anInt5518;
                class459_0.anInt5505 = i_34;
                method7836(class459_0);
                if (class459_0.anInt5505 + 1 == class459_0.anInt5518 && class459_0.anInt5496 == 0) {
                    bool_23 = true;
                    break;
                }

                bool_23 = false;
                break;
            }
        }

    }

}
