package com.jagex;

public class CacheableNode_Sub17_Sub1 extends Shadow {

    byte[] aByteArray10297;
    int anInt10293;
    int anInt10295;
    int anInt10296;
    int anInt10294;

    CacheableNode_Sub17_Sub1(int i_2, int i_3) {
        aByteArray10297 = new byte[i_3 * i_2];
    }

    static void method15709(byte[] bytes_0, int i_1, int i_2, int i_3, int i_4) {
        int i_21 = i_2;
        if (i_3 < i_4) {
            i_1 += i_3;
            i_21 = i_4 - i_3 >> 2;

            while (true) {
                --i_21;
                if (i_21 < 0) {
                    i_21 = i_4 - i_3 & 0x3;

                    while (true) {
                        --i_21;
                        if (i_21 < 0) {
                            return;
                        }

                        bytes_0[i_1++] = 1;
                    }
                }

                bytes_0[i_1++] = 1;
                bytes_0[i_1++] = 1;
                bytes_0[i_1++] = 1;
                bytes_0[i_1++] = 1;
            }
        }
    }

    void method15712() {
        int i_1 = -1;

        for (int i_2 = aByteArray10297.length - 8; i_1 < i_2; aByteArray10297[i_1] = 0) {
            ++i_1;
            aByteArray10297[i_1] = 0;
            ++i_1;
            aByteArray10297[i_1] = 0;
            ++i_1;
            aByteArray10297[i_1] = 0;
            ++i_1;
            aByteArray10297[i_1] = 0;
            ++i_1;
            aByteArray10297[i_1] = 0;
            ++i_1;
            aByteArray10297[i_1] = 0;
            ++i_1;
            aByteArray10297[i_1] = 0;
            ++i_1;
        }

        while (i_1 < aByteArray10297.length - 1) {
            ++i_1;
            aByteArray10297[i_1] = 0;
        }

    }

    void method15713(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_61 = i_6;
        int i_51 = i_5;
        int i_11 = i_1;
        int i_41 = i_4;
        int i_31 = i_3;
        int i_21 = i_2;
        int i_7 = 0;
        if (i_21 != i_11) {
            i_7 = (i_51 - i_41 << 16) / (i_21 - i_11);
        }

        int i_8 = 0;
        if (i_31 != i_21) {
            i_8 = (i_61 - i_51 << 16) / (i_31 - i_21);
        }

        int i_9 = 0;
        if (i_31 != i_11) {
            i_9 = (i_41 - i_61 << 16) / (i_11 - i_31);
        }

        if (i_11 <= i_21 && i_11 <= i_31) {
            if (i_21 < i_31) {
                i_61 = i_41 <<= 16;
                if (i_11 < 0) {
                    i_61 -= i_9 * i_11;
                    i_41 -= i_7 * i_11;
                    i_11 = 0;
                }

                i_51 <<= 16;
                if (i_21 < 0) {
                    i_51 -= i_8 * i_21;
                    i_21 = 0;
                }

                if (i_21 != i_11 ? i_9 < i_7 : i_9 > i_8) {
                    i_31 -= i_21;
                    i_21 -= i_11;
                    i_11 = anInt10296 * i_11;

                    while (true) {
                        --i_21;
                        if (i_21 < 0) {
                            while (true) {
                                --i_31;
                                if (i_31 < 0) {
                                    return;
                                }

                                method15709(aByteArray10297, i_11, 0, i_61 >> 16, i_51 >> 16);
                                i_61 += i_9;
                                i_51 += i_8;
                                i_11 += anInt10296;
                            }
                        }

                        method15709(aByteArray10297, i_11, 0, i_61 >> 16, i_41 >> 16);
                        i_61 += i_9;
                        i_41 += i_7;
                        i_11 += anInt10296;
                    }
                } else {
                    i_31 -= i_21;
                    i_21 -= i_11;
                    i_11 = anInt10296 * i_11;

                    while (true) {
                        --i_21;
                        if (i_21 < 0) {
                            while (true) {
                                --i_31;
                                if (i_31 < 0) {
                                    return;
                                }

                                method15709(aByteArray10297, i_11, 0, i_51 >> 16, i_61 >> 16);
                                i_61 += i_9;
                                i_51 += i_8;
                                i_11 += anInt10296;
                            }
                        }

                        method15709(aByteArray10297, i_11, 0, i_41 >> 16, i_61 >> 16);
                        i_61 += i_9;
                        i_41 += i_7;
                        i_11 += anInt10296;
                    }
                }
            } else {
                i_51 = i_41 <<= 16;
                if (i_11 < 0) {
                    i_51 -= i_9 * i_11;
                    i_41 -= i_7 * i_11;
                    i_11 = 0;
                }

                i_61 <<= 16;
                if (i_31 < 0) {
                    i_61 -= i_31 * i_8;
                    i_31 = 0;
                }

                if ((i_31 == i_11 || i_9 >= i_7) && (i_31 != i_11 || i_8 <= i_7)) {
                    i_21 -= i_31;
                    i_31 -= i_11;
                    i_11 = anInt10296 * i_11;

                    while (true) {
                        --i_31;
                        if (i_31 < 0) {
                            while (true) {
                                --i_21;
                                if (i_21 < 0) {
                                    return;
                                }

                                method15709(aByteArray10297, i_11, 0, i_41 >> 16, i_61 >> 16);
                                i_61 += i_8;
                                i_41 += i_7;
                                i_11 += anInt10296;
                            }
                        }

                        method15709(aByteArray10297, i_11, 0, i_41 >> 16, i_51 >> 16);
                        i_51 += i_9;
                        i_41 += i_7;
                        i_11 += anInt10296;
                    }
                } else {
                    i_21 -= i_31;
                    i_31 -= i_11;
                    i_11 = anInt10296 * i_11;

                    while (true) {
                        --i_31;
                        if (i_31 < 0) {
                            while (true) {
                                --i_21;
                                if (i_21 < 0) {
                                    return;
                                }

                                method15709(aByteArray10297, i_11, 0, i_61 >> 16, i_41 >> 16);
                                i_61 += i_8;
                                i_41 += i_7;
                                i_11 += anInt10296;
                            }
                        }

                        method15709(aByteArray10297, i_11, 0, i_51 >> 16, i_41 >> 16);
                        i_51 += i_9;
                        i_41 += i_7;
                        i_11 += anInt10296;
                    }
                }
            }
        } else if (i_21 <= i_31) {
            if (i_31 < i_11) {
                i_41 = i_51 <<= 16;
                if (i_21 < 0) {
                    i_41 -= i_7 * i_21;
                    i_51 -= i_8 * i_21;
                    i_21 = 0;
                }

                i_61 <<= 16;
                if (i_31 < 0) {
                    i_61 -= i_31 * i_9;
                    i_31 = 0;
                }

                if ((i_31 == i_21 || i_7 >= i_8) && (i_31 != i_21 || i_7 <= i_9)) {
                    i_11 -= i_31;
                    i_31 -= i_21;
                    i_21 *= anInt10296;

                    while (true) {
                        --i_31;
                        if (i_31 < 0) {
                            while (true) {
                                --i_11;
                                if (i_11 < 0) {
                                    return;
                                }

                                method15709(aByteArray10297, i_21, 0, i_61 >> 16, i_41 >> 16);
                                i_41 += i_7;
                                i_61 += i_9;
                                i_21 += anInt10296;
                            }
                        }

                        method15709(aByteArray10297, i_21, 0, i_51 >> 16, i_41 >> 16);
                        i_41 += i_7;
                        i_51 += i_8;
                        i_21 += anInt10296;
                    }
                } else {
                    i_11 -= i_31;
                    i_31 -= i_21;
                    i_21 *= anInt10296;

                    while (true) {
                        --i_31;
                        if (i_31 < 0) {
                            while (true) {
                                --i_11;
                                if (i_11 < 0) {
                                    return;
                                }

                                method15709(aByteArray10297, i_21, 0, i_41 >> 16, i_61 >> 16);
                                i_41 += i_7;
                                i_61 += i_9;
                                i_21 += anInt10296;
                            }
                        }

                        method15709(aByteArray10297, i_21, 0, i_41 >> 16, i_51 >> 16);
                        i_41 += i_7;
                        i_51 += i_8;
                        i_21 += anInt10296;
                    }
                }
            } else {
                i_61 = i_51 <<= 16;
                if (i_21 < 0) {
                    i_61 -= i_7 * i_21;
                    i_51 -= i_8 * i_21;
                    i_21 = 0;
                }

                i_41 <<= 16;
                if (i_11 < 0) {
                    i_41 -= i_9 * i_11;
                    i_11 = 0;
                }

                if (i_7 < i_8) {
                    i_31 -= i_11;
                    i_11 -= i_21;
                    i_21 *= anInt10296;

                    while (true) {
                        --i_11;
                        if (i_11 < 0) {
                            while (true) {
                                --i_31;
                                if (i_31 < 0) {
                                    return;
                                }

                                method15709(aByteArray10297, i_21, 0, i_41 >> 16, i_51 >> 16);
                                i_41 += i_9;
                                i_51 += i_8;
                                i_21 += anInt10296;
                            }
                        }

                        method15709(aByteArray10297, i_21, 0, i_61 >> 16, i_51 >> 16);
                        i_61 += i_7;
                        i_51 += i_8;
                        i_21 += anInt10296;
                    }
                } else {
                    i_31 -= i_11;
                    i_11 -= i_21;
                    i_21 *= anInt10296;

                    while (true) {
                        --i_11;
                        if (i_11 < 0) {
                            while (true) {
                                --i_31;
                                if (i_31 < 0) {
                                    return;
                                }

                                method15709(aByteArray10297, i_21, 0, i_51 >> 16, i_41 >> 16);
                                i_41 += i_9;
                                i_51 += i_8;
                                i_21 += anInt10296;
                            }
                        }

                        method15709(aByteArray10297, i_21, 0, i_51 >> 16, i_61 >> 16);
                        i_61 += i_7;
                        i_51 += i_8;
                        i_21 += anInt10296;
                    }
                }
            }
        } else if (i_11 < i_21) {
            i_51 = i_61 <<= 16;
            if (i_31 < 0) {
                i_51 -= i_31 * i_8;
                i_61 -= i_31 * i_9;
                i_31 = 0;
            }

            i_41 <<= 16;
            if (i_11 < 0) {
                i_41 -= i_7 * i_11;
                i_11 = 0;
            }

            if (i_8 < i_9) {
                i_21 -= i_11;
                i_11 -= i_31;
                i_31 *= anInt10296;

                while (true) {
                    --i_11;
                    if (i_11 < 0) {
                        while (true) {
                            --i_21;
                            if (i_21 < 0) {
                                return;
                            }

                            method15709(aByteArray10297, i_31, 0, i_51 >> 16, i_41 >> 16);
                            i_51 += i_8;
                            i_41 += i_7;
                            i_31 += anInt10296;
                        }
                    }

                    method15709(aByteArray10297, i_31, 0, i_51 >> 16, i_61 >> 16);
                    i_51 += i_8;
                    i_61 += i_9;
                    i_31 += anInt10296;
                }
            } else {
                i_21 -= i_11;
                i_11 -= i_31;
                i_31 *= anInt10296;

                while (true) {
                    --i_11;
                    if (i_11 < 0) {
                        while (true) {
                            --i_21;
                            if (i_21 < 0) {
                                return;
                            }

                            method15709(aByteArray10297, i_31, 0, i_41 >> 16, i_51 >> 16);
                            i_51 += i_8;
                            i_41 += i_7;
                            i_31 += anInt10296;
                        }
                    }

                    method15709(aByteArray10297, i_31, 0, i_61 >> 16, i_51 >> 16);
                    i_51 += i_8;
                    i_61 += i_9;
                    i_31 += anInt10296;
                }
            }
        } else {
            i_41 = i_61 <<= 16;
            if (i_31 < 0) {
                i_41 -= i_31 * i_8;
                i_61 -= i_31 * i_9;
                i_31 = 0;
            }

            i_51 <<= 16;
            if (i_21 < 0) {
                i_51 -= i_7 * i_21;
                i_21 = 0;
            }

            if (i_8 < i_9) {
                i_11 -= i_21;
                i_21 -= i_31;
                i_31 *= anInt10296;

                while (true) {
                    --i_21;
                    if (i_21 < 0) {
                        while (true) {
                            --i_11;
                            if (i_11 < 0) {
                                return;
                            }

                            method15709(aByteArray10297, i_31, 0, i_51 >> 16, i_61 >> 16);
                            i_51 += i_7;
                            i_61 += i_9;
                            i_31 += anInt10296;
                        }
                    }

                    method15709(aByteArray10297, i_31, 0, i_41 >> 16, i_61 >> 16);
                    i_41 += i_8;
                    i_61 += i_9;
                    i_31 += anInt10296;
                }
            } else {
                i_11 -= i_21;
                i_21 -= i_31;
                i_31 *= anInt10296;

                while (true) {
                    --i_21;
                    if (i_21 < 0) {
                        while (true) {
                            --i_11;
                            if (i_11 < 0) {
                                return;
                            }

                            method15709(aByteArray10297, i_31, 0, i_61 >> 16, i_51 >> 16);
                            i_51 += i_7;
                            i_61 += i_9;
                            i_31 += anInt10296;
                        }
                    }

                    method15709(aByteArray10297, i_31, 0, i_61 >> 16, i_41 >> 16);
                    i_41 += i_8;
                    i_61 += i_9;
                    i_31 += anInt10296;
                }
            }
        }
    }

    boolean method15716(int i_1, int i_2) {
        return aByteArray10297.length >= i_2 * i_1;
    }

    void method15721(int i_1, int i_2, int i_3, int i_4) {
        anInt10293 = i_1;
        anInt10295 = i_2;
        anInt10296 = i_3 - i_1;
        anInt10294 = i_4 - i_2;
    }

}
