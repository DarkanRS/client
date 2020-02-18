package com.jagex;

public class Node_Sub7 extends Node {

    byte[] aByteArray7522;
    IterableNodeMap<Object> aClass465_7521;

    Node_Sub7(Packet rsbytebuffer_1) {
        rsbytebuffer_1.index = rsbytebuffer_1.buffer.length - 3;
        int i_2 = rsbytebuffer_1.readUnsignedByte();
        int i_3 = rsbytebuffer_1.readUnsignedShort();
        int i_4 = i_2 * 10 + 14;
        rsbytebuffer_1.index = 0;
        int i_5 = 0;
        int i_6 = 0;
        int i_7 = 0;
        int i_8 = 0;
        int i_9 = 0;
        int i_10 = 0;
        int i_11 = 0;
        int i_12 = 0;

        int i_13;
        int i_14;
        int i_15;
        for (i_13 = 0; i_13 < i_2; i_13++) {
            i_14 = -1;

            while (true) {
                i_15 = rsbytebuffer_1.readUnsignedByte();
                if (i_15 != i_14) {
                    ++i_4;
                }

                i_14 = i_15 & 0xf;
                if (i_15 == 7) {
                    break;
                }

                if (i_15 == 23) {
                    ++i_5;
                } else if (i_14 == 0) {
                    ++i_7;
                } else if (i_14 == 1) {
                    ++i_8;
                } else if (i_14 == 2) {
                    ++i_6;
                } else if (i_14 == 3) {
                    ++i_9;
                } else if (i_14 == 4) {
                    ++i_10;
                } else if (i_14 == 5) {
                    ++i_11;
                } else {
                    if (i_14 != 6) {
                        throw new RuntimeException();
                    }

                    ++i_12;
                }
            }
        }

        i_4 += i_5 * 5;
        i_4 += (i_7 + i_8 + i_6 + i_9 + i_11) * 2;
        i_4 += i_10 + i_12;
        i_13 = rsbytebuffer_1.index;
        i_14 = i_2 + i_5 + i_6 + i_7 + i_8 + i_9 + i_10 + i_11 + i_12;

        for (i_15 = 0; i_15 < i_14; i_15++) {
            rsbytebuffer_1.method13099();
        }

        i_4 += rsbytebuffer_1.index - i_13;
        i_15 = rsbytebuffer_1.index;
        int i_16 = 0;
        int i_17 = 0;
        int i_18 = 0;
        int i_19 = 0;
        int i_20 = 0;
        int i_21 = 0;
        int i_22 = 0;
        int i_23 = 0;
        int i_24 = 0;
        int i_25 = 0;
        int i_26 = 0;
        int i_27 = 0;
        int i_28 = 0;

        int i_29;
        for (i_29 = 0; i_29 < i_6; i_29++) {
            i_28 = i_28 + rsbytebuffer_1.readUnsignedByte() & 0x7f;
            if (i_28 != 0 && i_28 != 32) {
                if (i_28 == 1) {
                    ++i_16;
                } else if (i_28 == 33) {
                    ++i_17;
                } else if (i_28 == 7) {
                    ++i_18;
                } else if (i_28 == 39) {
                    ++i_19;
                } else if (i_28 == 10) {
                    ++i_20;
                } else if (i_28 == 42) {
                    ++i_21;
                } else if (i_28 == 99) {
                    ++i_22;
                } else if (i_28 == 98) {
                    ++i_23;
                } else if (i_28 == 101) {
                    ++i_24;
                } else if (i_28 == 100) {
                    ++i_25;
                } else if (i_28 != 64 && i_28 != 65 && i_28 != 120 && i_28 != 121 && i_28 != 123) {
                    ++i_27;
                } else {
                    ++i_26;
                }
            } else {
                ++i_12;
            }
        }

        i_29 = 0;
        int i_30 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_26;
        int i_31 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_11;
        int i_32 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_10;
        int i_33 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_9;
        int i_34 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_16;
        int i_35 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_18;
        int i_36 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_20;
        int i_37 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_7 + i_8 + i_11;
        int i_38 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_7;
        int i_39 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_27;
        int i_40 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_8;
        int i_41 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_17;
        int i_42 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_19;
        int i_43 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_21;
        int i_44 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_12;
        int i_45 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_9;
        int i_46 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_22;
        int i_47 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_23;
        int i_48 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_24;
        int i_49 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_25;
        int i_50 = rsbytebuffer_1.index;
        rsbytebuffer_1.index += i_5 * 3;
        aByteArray7522 = new byte[i_4];
        Packet rsbytebuffer_51 = new Packet(aByteArray7522);
        rsbytebuffer_51.writeInt(1297377380);
        rsbytebuffer_51.writeInt(6);
        rsbytebuffer_51.writeShort(i_2 > 1 ? 1 : 0);
        rsbytebuffer_51.writeShort(i_2);
        rsbytebuffer_51.writeShort(i_3);
        rsbytebuffer_1.index = i_13;
        int i_52 = 0;
        int i_53 = 0;
        int i_54 = 0;
        int i_55 = 0;
        int i_56 = 0;
        int i_57 = 0;
        int i_58 = 0;
        int[] ints_59 = new int[128];
        i_28 = 0;

        label228:
        for (int i_60 = 0; i_60 < i_2; i_60++) {
            rsbytebuffer_51.writeInt(1297379947);
            rsbytebuffer_51.index += 4;
            int i_61 = rsbytebuffer_51.index;
            int i_62 = -1;

            while (true) {
                while (true) {
                    int i_63 = rsbytebuffer_1.method13099();
                    rsbytebuffer_51.method13077(i_63);
                    int i_64 = rsbytebuffer_1.buffer[i_29++] & 0xff;
                    boolean bool_65 = i_64 != i_62;
                    i_62 = i_64 & 0xf;
                    if (i_64 == 7) {
                        if (bool_65) {
                            rsbytebuffer_51.writeByte(255);
                        }

                        rsbytebuffer_51.writeByte(47);
                        rsbytebuffer_51.writeByte(0);
                        rsbytebuffer_51.method13073(rsbytebuffer_51.index - i_61);
                        continue label228;
                    }

                    if (i_64 == 23) {
                        if (bool_65) {
                            rsbytebuffer_51.writeByte(255);
                        }

                        rsbytebuffer_51.writeByte(81);
                        rsbytebuffer_51.writeByte(3);
                        rsbytebuffer_51.writeByte(rsbytebuffer_1.buffer[i_50++]);
                        rsbytebuffer_51.writeByte(rsbytebuffer_1.buffer[i_50++]);
                        rsbytebuffer_51.writeByte(rsbytebuffer_1.buffer[i_50++]);
                    } else {
                        i_52 ^= i_64 >> 4;
                        if (i_62 == 0) {
                            if (bool_65) {
                                rsbytebuffer_51.writeByte(i_52 + 144);
                            }

                            i_53 += rsbytebuffer_1.buffer[i_37++];
                            i_54 += rsbytebuffer_1.buffer[i_38++];
                            rsbytebuffer_51.writeByte(i_53 & 0x7f);
                            rsbytebuffer_51.writeByte(i_54 & 0x7f);
                        } else if (i_62 == 1) {
                            if (bool_65) {
                                rsbytebuffer_51.writeByte(i_52 + 128);
                            }

                            i_53 += rsbytebuffer_1.buffer[i_37++];
                            i_55 += rsbytebuffer_1.buffer[i_40++];
                            rsbytebuffer_51.writeByte(i_53 & 0x7f);
                            rsbytebuffer_51.writeByte(i_55 & 0x7f);
                        } else if (i_62 == 2) {
                            if (bool_65) {
                                rsbytebuffer_51.writeByte(i_52 + 176);
                            }

                            i_28 = i_28 + rsbytebuffer_1.buffer[i_15++] & 0x7f;
                            rsbytebuffer_51.writeByte(i_28);
                            byte b_66;
                            if (i_28 != 0 && i_28 != 32) {
                                if (i_28 == 1) {
                                    b_66 = rsbytebuffer_1.buffer[i_34++];
                                } else if (i_28 == 33) {
                                    b_66 = rsbytebuffer_1.buffer[i_41++];
                                } else if (i_28 == 7) {
                                    b_66 = rsbytebuffer_1.buffer[i_35++];
                                } else if (i_28 == 39) {
                                    b_66 = rsbytebuffer_1.buffer[i_42++];
                                } else if (i_28 == 10) {
                                    b_66 = rsbytebuffer_1.buffer[i_36++];
                                } else if (i_28 == 42) {
                                    b_66 = rsbytebuffer_1.buffer[i_43++];
                                } else if (i_28 == 99) {
                                    b_66 = rsbytebuffer_1.buffer[i_46++];
                                } else if (i_28 == 98) {
                                    b_66 = rsbytebuffer_1.buffer[i_47++];
                                } else if (i_28 == 101) {
                                    b_66 = rsbytebuffer_1.buffer[i_48++];
                                } else if (i_28 == 100) {
                                    b_66 = rsbytebuffer_1.buffer[i_49++];
                                } else if (i_28 != 64 && i_28 != 65 && i_28 != 120 && i_28 != 121 && i_28 != 123) {
                                    b_66 = rsbytebuffer_1.buffer[i_39++];
                                } else {
                                    b_66 = rsbytebuffer_1.buffer[i_30++];
                                }
                            } else {
                                b_66 = rsbytebuffer_1.buffer[i_44++];
                            }

                            int i_67 = b_66 + ints_59[i_28];
                            ints_59[i_28] = i_67;
                            rsbytebuffer_51.writeByte(i_67 & 0x7f);
                        } else if (i_62 == 3) {
                            if (bool_65) {
                                rsbytebuffer_51.writeByte(i_52 + 224);
                            }

                            i_56 += rsbytebuffer_1.buffer[i_45++];
                            i_56 += rsbytebuffer_1.buffer[i_33++] << 7;
                            rsbytebuffer_51.writeByte(i_56 & 0x7f);
                            rsbytebuffer_51.writeByte(i_56 >> 7 & 0x7f);
                        } else if (i_62 == 4) {
                            if (bool_65) {
                                rsbytebuffer_51.writeByte(i_52 + 208);
                            }

                            i_57 += rsbytebuffer_1.buffer[i_32++];
                            rsbytebuffer_51.writeByte(i_57 & 0x7f);
                        } else if (i_62 == 5) {
                            if (bool_65) {
                                rsbytebuffer_51.writeByte(i_52 + 160);
                            }

                            i_53 += rsbytebuffer_1.buffer[i_37++];
                            i_58 += rsbytebuffer_1.buffer[i_31++];
                            rsbytebuffer_51.writeByte(i_53 & 0x7f);
                            rsbytebuffer_51.writeByte(i_58 & 0x7f);
                        } else {
                            if (i_62 != 6) {
                                throw new RuntimeException();
                            }

                            if (bool_65) {
                                rsbytebuffer_51.writeByte(i_52 + 192);
                            }

                            rsbytebuffer_51.writeByte(rsbytebuffer_1.buffer[i_44++]);
                        }
                    }
                }
            }
        }

    }

    static Node_Sub7 method12164(Index index_0, int i_1, int i_2) {
        byte[] bytes_3 = index_0.getFile(i_1, i_2);
        return bytes_3 == null ? null : new Node_Sub7(new Packet(bytes_3));
    }

    void method12165() {
        if (aClass465_7521 == null) {
            aClass465_7521 = new IterableNodeMap<>(16);
            int[] ints_1 = new int[16];
            int[] ints_2 = new int[16];
            ints_2[9] = 128;
            ints_1[9] = 128;
            Class80 class80_4 = new Class80(aByteArray7522);
            int i_5 = class80_4.method1397();

            int i_6;
            for (i_6 = 0; i_6 < i_5; i_6++) {
                class80_4.method1398(i_6);
                class80_4.method1392(i_6);
                class80_4.method1404(i_6);
            }

            label56:
            do {
                while (true) {
                    i_6 = class80_4.method1393();
                    int i_7 = class80_4.anIntArray788[i_6];

                    while (i_7 == class80_4.anIntArray788[i_6]) {
                        class80_4.method1398(i_6);
                        int i_8 = class80_4.method1401(i_6);
                        if (i_8 == 1) {
                            class80_4.method1400();
                            class80_4.method1404(i_6);
                            continue label56;
                        }

                        int i_9 = i_8 & 0xf0;
                        int i_10;
                        int i_11;
                        int i_12;
                        if (i_9 == 176) {
                            i_10 = i_8 & 0xf;
                            i_11 = i_8 >> 8 & 0x7f;
                            i_12 = i_8 >> 16 & 0x7f;
                            if (i_11 == 0) {
                                ints_1[i_10] = (i_12 << 14) + (ints_1[i_10] & -2080769);
                            }

                            if (i_11 == 32) {
                                ints_1[i_10] = (ints_1[i_10] & -16257) + (i_12 << 7);
                            }
                        }

                        if (i_9 == 192) {
                            i_10 = i_8 & 0xf;
                            i_11 = i_8 >> 8 & 0x7f;
                            ints_2[i_10] = i_11 + ints_1[i_10];
                        }

                        if (i_9 == 144) {
                            i_10 = i_8 & 0xf;
                            i_11 = i_8 >> 8 & 0x7f;
                            i_12 = i_8 >> 16 & 0x7f;
                            if (i_12 > 0) {
                                int i_13 = ints_2[i_10];
                                ObjectNode class282_sub47_14 = (ObjectNode) aClass465_7521.get(i_13);
                                if (class282_sub47_14 == null) {
                                    class282_sub47_14 = new ObjectNode(new byte[128]);
                                    aClass465_7521.put(class282_sub47_14, i_13);
                                }

                                ((byte[]) class282_sub47_14.anObject8068)[i_11] = 1;
                            }
                        }

                        class80_4.method1392(i_6);
                        class80_4.method1404(i_6);
                    }
                }
            } while (!class80_4.method1405());
        }

    }

    void method12167() {
        aClass465_7521 = null;
    }

}
