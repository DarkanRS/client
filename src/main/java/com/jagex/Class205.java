package com.jagex;

public class Class205 {

    int anInt2587;
    int anInt2588;
    Class201 aClass201_2586;

    Class205(Class201 class201_1) {
        aClass201_2586 = class201_1;
    }

    boolean method3371(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        int i_61 = i_6;
        int i_51 = i_5;
        int i_110 = i_1;
        int i_41 = i_4;
        int i_31 = i_3;
        int i_22 = i_2;
        if (i_110 <= 2002 && i_22 <= 2002 && i_31 <= 2002 && i_41 <= 2002 && i_51 <= 2002 && i_61 <= 2002) {
            if (i_110 >= -2002 && i_22 >= -2002 && i_31 >= -2002 && i_41 >= -2002 && i_51 >= -2002 && i_61 >= -2002) {
                int i_10;
                if (anInt2587 == 2) {
                    i_10 = aClass201_2586.anInt2543 * i_110 + i_41;
                    if (i_10 >= 0 && i_10 < aClass201_2586.anIntArray2565.length && (i_7 << 8) - 39168 < aClass201_2586.anIntArray2565[i_10]) {
                        return false;
                    }

                    i_10 = i_51 + aClass201_2586.anInt2543 * i_22;
                    if (i_10 >= 0 && i_10 < aClass201_2586.anIntArray2565.length && (i_8 << 8) - 39168 < aClass201_2586.anIntArray2565[i_10]) {
                        return false;
                    }

                    i_10 = i_31 * aClass201_2586.anInt2543 + i_61;
                    if (i_10 >= 0 && i_10 < aClass201_2586.anIntArray2565.length && (i_9 << 8) - 39168 < aClass201_2586.anIntArray2565[i_10]) {
                        return false;
                    }
                }

                i_10 = i_51 - i_41;
                int i_11 = i_22 - i_110;
                int i_12 = i_61 - i_41;
                int i_13 = i_31 - i_110;
                int i_14 = i_8 - i_7;
                int i_15 = i_9 - i_7;
                if (i_110 < i_22 && i_110 < i_31) {
                    --i_110;
                    if (i_22 > i_31) {
                        ++i_22;
                    } else {
                        ++i_31;
                    }
                } else if (i_22 < i_31) {
                    --i_22;
                    if (i_110 > i_31) {
                        ++i_110;
                    } else {
                        ++i_31;
                    }
                } else {
                    --i_31;
                    if (i_110 > i_22) {
                        ++i_110;
                    } else {
                        ++i_22;
                    }
                }

                int i_16 = 0;
                if (i_22 != i_110) {
                    i_16 = (i_51 - i_41 << 12) / (i_22 - i_110);
                }

                int i_17 = 0;
                if (i_31 != i_22) {
                    i_17 = (i_61 - i_51 << 12) / (i_31 - i_22);
                }

                int i_18 = 0;
                if (i_31 != i_110) {
                    i_18 = (i_41 - i_61 << 12) / (i_110 - i_31);
                }

                int i_19 = i_10 * i_13 - i_12 * i_11;
                if (i_19 == 0) {
                    return false;
                } else {
                    int i_20 = (i_14 * i_13 - i_15 * i_11 << 8) / i_19;
                    int i_21 = (i_15 * i_10 - i_14 * i_12 << 8) / i_19;
                    if (i_110 <= i_22 && i_110 <= i_31) {
                        if (i_110 >= aClass201_2586.anInt2570) {
                            return true;
                        } else {
                            if (i_22 > aClass201_2586.anInt2570) {
                                i_22 = aClass201_2586.anInt2570;
                            }

                            if (i_31 > aClass201_2586.anInt2570) {
                                i_31 = aClass201_2586.anInt2570;
                            }

                            i_7 = i_20 + ((i_7 << 8) - i_20 * i_41);
                            if (i_22 < i_31) {
                                i_61 = i_41 <<= 12;
                                if (i_110 < 0) {
                                    i_61 -= i_18 * i_110;
                                    i_41 -= i_16 * i_110;
                                    i_7 -= i_21 * i_110;
                                    i_110 = 0;
                                }

                                i_51 <<= 12;
                                if (i_22 < 0) {
                                    i_51 -= i_17 * i_22;
                                    i_22 = 0;
                                }

                                if (i_22 != i_110 ? i_18 < i_16 : i_18 > i_17) {
                                    i_31 -= i_22;
                                    i_22 -= i_110;
                                    i_110 = aClass201_2586.anInt2543 * i_110;

                                    while (true) {
                                        --i_22;
                                        if (i_22 < 0) {
                                            while (true) {
                                                --i_31;
                                                if (i_31 < 0) {
                                                    return true;
                                                }

                                                if (!method3373(aClass201_2586.anIntArray2565, i_110, 0, (i_61 >> 12) - 1, (i_51 >> 12) + 1, i_7, i_20, aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_61 += i_18;
                                                i_51 += i_17;
                                                i_7 += i_21;
                                                i_110 += aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!method3373(aClass201_2586.anIntArray2565, i_110, 0, (i_61 >> 12) - 1, (i_41 >> 12) + 1, i_7, i_20, aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_61 += i_18;
                                        i_41 += i_16;
                                        i_7 += i_21;
                                        i_110 += aClass201_2586.anInt2543;
                                    }
                                } else {
                                    i_31 -= i_22;
                                    i_22 -= i_110;
                                    i_110 = aClass201_2586.anInt2543 * i_110;

                                    while (true) {
                                        --i_22;
                                        if (i_22 < 0) {
                                            while (true) {
                                                --i_31;
                                                if (i_31 < 0) {
                                                    return true;
                                                }

                                                if (!method3373(aClass201_2586.anIntArray2565, i_110, 0, (i_51 >> 12) - 1, (i_61 >> 12) + 1, i_7, i_20, aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_61 += i_18;
                                                i_51 += i_17;
                                                i_7 += i_21;
                                                i_110 += aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!method3373(aClass201_2586.anIntArray2565, i_110, 0, (i_41 >> 12) - 1, (i_61 >> 12) + 1, i_7, i_20, aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_61 += i_18;
                                        i_41 += i_16;
                                        i_7 += i_21;
                                        i_110 += aClass201_2586.anInt2543;
                                    }
                                }
                            } else {
                                i_51 = i_41 <<= 12;
                                if (i_110 < 0) {
                                    i_51 -= i_18 * i_110;
                                    i_41 -= i_16 * i_110;
                                    i_7 -= i_21 * i_110;
                                    i_110 = 0;
                                }

                                i_61 <<= 12;
                                if (i_31 < 0) {
                                    i_61 -= i_31 * i_17;
                                    i_31 = 0;
                                }

                                if (i_31 != i_110 ? i_18 < i_16 : i_17 > i_16) {
                                    i_22 -= i_31;
                                    i_31 -= i_110;
                                    i_110 = aClass201_2586.anInt2543 * i_110;

                                    while (true) {
                                        --i_31;
                                        if (i_31 < 0) {
                                            while (true) {
                                                --i_22;
                                                if (i_22 < 0) {
                                                    return true;
                                                }

                                                if (!method3373(aClass201_2586.anIntArray2565, i_110, 0, (i_61 >> 12) - 1, (i_41 >> 12) + 1, i_7, i_20, aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_61 += i_17;
                                                i_41 += i_16;
                                                i_7 += i_21;
                                                i_110 += aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!method3373(aClass201_2586.anIntArray2565, i_110, 0, (i_51 >> 12) - 1, (i_41 >> 12) + 1, i_7, i_20, aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_51 += i_18;
                                        i_41 += i_16;
                                        i_7 += i_21;
                                        i_110 += aClass201_2586.anInt2543;
                                    }
                                } else {
                                    i_22 -= i_31;
                                    i_31 -= i_110;
                                    i_110 = aClass201_2586.anInt2543 * i_110;

                                    while (true) {
                                        --i_31;
                                        if (i_31 < 0) {
                                            while (true) {
                                                --i_22;
                                                if (i_22 < 0) {
                                                    return true;
                                                }

                                                if (!method3373(aClass201_2586.anIntArray2565, i_110, 0, (i_41 >> 12) - 1, (i_61 >> 12) + 1, i_7, i_20, aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_61 += i_17;
                                                i_41 += i_16;
                                                i_7 += i_21;
                                                i_110 += aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!method3373(aClass201_2586.anIntArray2565, i_110, 0, (i_41 >> 12) - 1, (i_51 >> 12) + 1, i_7, i_20, aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_51 += i_18;
                                        i_41 += i_16;
                                        i_7 += i_21;
                                        i_110 += aClass201_2586.anInt2543;
                                    }
                                }
                            }
                        }
                    } else if (i_22 <= i_31) {
                        if (i_22 >= aClass201_2586.anInt2570) {
                            return true;
                        } else {
                            if (i_31 > aClass201_2586.anInt2570) {
                                i_31 = aClass201_2586.anInt2570;
                            }

                            if (i_110 > aClass201_2586.anInt2570) {
                                i_110 = aClass201_2586.anInt2570;
                            }

                            i_8 = i_20 + ((i_8 << 8) - i_51 * i_20);
                            if (i_31 < i_110) {
                                i_41 = i_51 <<= 12;
                                if (i_22 < 0) {
                                    i_41 -= i_16 * i_22;
                                    i_51 -= i_17 * i_22;
                                    i_8 -= i_21 * i_22;
                                    i_22 = 0;
                                }

                                i_61 <<= 12;
                                if (i_31 < 0) {
                                    i_61 -= i_31 * i_18;
                                    i_31 = 0;
                                }

                                if (i_31 != i_22 ? i_16 < i_17 : i_16 > i_18) {
                                    i_110 -= i_31;
                                    i_31 -= i_22;
                                    i_22 = aClass201_2586.anInt2543 * i_22;

                                    while (true) {
                                        --i_31;
                                        if (i_31 < 0) {
                                            while (true) {
                                                --i_110;
                                                if (i_110 < 0) {
                                                    return true;
                                                }

                                                if (!method3373(aClass201_2586.anIntArray2565, i_22, 0, (i_41 >> 12) - 1, (i_61 >> 12) + 1, i_8, i_20, aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_41 += i_16;
                                                i_61 += i_18;
                                                i_8 += i_21;
                                                i_22 += aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!method3373(aClass201_2586.anIntArray2565, i_22, 0, (i_41 >> 12) - 1, (i_51 >> 12) + 1, i_8, i_20, aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_41 += i_16;
                                        i_51 += i_17;
                                        i_8 += i_21;
                                        i_22 += aClass201_2586.anInt2543;
                                    }
                                } else {
                                    i_110 -= i_31;
                                    i_31 -= i_22;
                                    i_22 = aClass201_2586.anInt2543 * i_22;

                                    while (true) {
                                        --i_31;
                                        if (i_31 < 0) {
                                            while (true) {
                                                --i_110;
                                                if (i_110 < 0) {
                                                    return true;
                                                }

                                                if (!method3373(aClass201_2586.anIntArray2565, i_22, 0, (i_61 >> 12) - 1, (i_41 >> 12) + 1, i_8, i_20, aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_41 += i_16;
                                                i_61 += i_18;
                                                i_8 += i_21;
                                                i_22 += aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!method3373(aClass201_2586.anIntArray2565, i_22, 0, (i_51 >> 12) - 1, (i_41 >> 12) + 1, i_8, i_20, aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_41 += i_16;
                                        i_51 += i_17;
                                        i_8 += i_21;
                                        i_22 += aClass201_2586.anInt2543;
                                    }
                                }
                            } else {
                                i_61 = i_51 <<= 12;
                                if (i_22 < 0) {
                                    i_61 -= i_16 * i_22;
                                    i_51 -= i_17 * i_22;
                                    i_8 -= i_21 * i_22;
                                    i_22 = 0;
                                }

                                i_41 <<= 12;
                                if (i_110 < 0) {
                                    i_41 -= i_18 * i_110;
                                    i_110 = 0;
                                }

                                if (i_16 < i_17) {
                                    i_31 -= i_110;
                                    i_110 -= i_22;
                                    i_22 = aClass201_2586.anInt2543 * i_22;

                                    while (true) {
                                        --i_110;
                                        if (i_110 < 0) {
                                            while (true) {
                                                --i_31;
                                                if (i_31 < 0) {
                                                    return true;
                                                }

                                                if (!method3373(aClass201_2586.anIntArray2565, i_22, 0, (i_41 >> 12) - 1, (i_51 >> 12) + 1, i_8, i_20, aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_41 += i_18;
                                                i_51 += i_17;
                                                i_8 += i_21;
                                                i_22 += aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!method3373(aClass201_2586.anIntArray2565, i_22, 0, (i_61 >> 12) - 1, (i_51 >> 12) + 1, i_8, i_20, aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_61 += i_16;
                                        i_51 += i_17;
                                        i_8 += i_21;
                                        i_22 += aClass201_2586.anInt2543;
                                    }
                                } else {
                                    i_31 -= i_110;
                                    i_110 -= i_22;
                                    i_22 = aClass201_2586.anInt2543 * i_22;

                                    while (true) {
                                        --i_110;
                                        if (i_110 < 0) {
                                            while (true) {
                                                --i_31;
                                                if (i_31 < 0) {
                                                    return true;
                                                }

                                                if (!method3373(aClass201_2586.anIntArray2565, i_22, 0, (i_51 >> 12) - 1, (i_41 >> 12) + 1, i_8, i_20, aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_41 += i_18;
                                                i_51 += i_17;
                                                i_8 += i_21;
                                                i_22 += aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!method3373(aClass201_2586.anIntArray2565, i_22, 0, (i_51 >> 12) - 1, (i_61 >> 12) + 1, i_8, i_20, aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_61 += i_16;
                                        i_51 += i_17;
                                        i_8 += i_21;
                                        i_22 += aClass201_2586.anInt2543;
                                    }
                                }
                            }
                        }
                    } else if (i_31 >= aClass201_2586.anInt2570) {
                        return true;
                    } else {
                        if (i_110 > aClass201_2586.anInt2570) {
                            i_110 = aClass201_2586.anInt2570;
                        }

                        if (i_22 > aClass201_2586.anInt2570) {
                            i_22 = aClass201_2586.anInt2570;
                        }

                        i_9 = i_20 + ((i_9 << 8) - i_20 * i_61);
                        if (i_110 < i_22) {
                            i_51 = i_61 <<= 12;
                            if (i_31 < 0) {
                                i_51 -= i_31 * i_17;
                                i_61 -= i_31 * i_18;
                                i_9 -= i_31 * i_21;
                                i_31 = 0;
                            }

                            i_41 <<= 12;
                            if (i_110 < 0) {
                                i_41 -= i_16 * i_110;
                                i_110 = 0;
                            }

                            if (i_17 < i_18) {
                                i_22 -= i_110;
                                i_110 -= i_31;
                                i_31 *= aClass201_2586.anInt2543;

                                while (true) {
                                    --i_110;
                                    if (i_110 < 0) {
                                        while (true) {
                                            --i_22;
                                            if (i_22 < 0) {
                                                return true;
                                            }

                                            if (!method3373(aClass201_2586.anIntArray2565, i_31, 0, (i_51 >> 12) - 1, (i_41 >> 12) + 1, i_9, i_20, aClass201_2586.anInt2543)) {
                                                return false;
                                            }

                                            i_51 += i_17;
                                            i_41 += i_16;
                                            i_9 += i_21;
                                            i_31 += aClass201_2586.anInt2543;
                                        }
                                    }

                                    if (!method3373(aClass201_2586.anIntArray2565, i_31, 0, (i_51 >> 12) - 1, (i_61 >> 12) + 1, i_9, i_20, aClass201_2586.anInt2543)) {
                                        return false;
                                    }

                                    i_51 += i_17;
                                    i_61 += i_18;
                                    i_9 += i_21;
                                    i_31 += aClass201_2586.anInt2543;
                                }
                            } else {
                                i_22 -= i_110;
                                i_110 -= i_31;
                                i_31 *= aClass201_2586.anInt2543;

                                while (true) {
                                    --i_110;
                                    if (i_110 < 0) {
                                        while (true) {
                                            --i_22;
                                            if (i_22 < 0) {
                                                return true;
                                            }

                                            if (!method3373(aClass201_2586.anIntArray2565, i_31, 0, (i_41 >> 12) - 1, (i_51 >> 12) + 1, i_9, i_20, aClass201_2586.anInt2543)) {
                                                return false;
                                            }

                                            i_51 += i_17;
                                            i_41 += i_16;
                                            i_9 += i_21;
                                            i_31 += aClass201_2586.anInt2543;
                                        }
                                    }

                                    if (!method3373(aClass201_2586.anIntArray2565, i_31, 0, (i_61 >> 12) - 1, (i_51 >> 12) + 1, i_9, i_20, aClass201_2586.anInt2543)) {
                                        return false;
                                    }

                                    i_51 += i_17;
                                    i_61 += i_18;
                                    i_9 += i_21;
                                    i_31 += aClass201_2586.anInt2543;
                                }
                            }
                        } else {
                            i_41 = i_61 <<= 12;
                            if (i_31 < 0) {
                                i_41 -= i_31 * i_17;
                                i_61 -= i_31 * i_18;
                                i_9 -= i_31 * i_21;
                                i_31 = 0;
                            }

                            i_51 <<= 12;
                            if (i_22 < 0) {
                                i_51 -= i_16 * i_22;
                                i_22 = 0;
                            }

                            if (i_17 < i_18) {
                                i_110 -= i_22;
                                i_22 -= i_31;
                                i_31 *= aClass201_2586.anInt2543;

                                while (true) {
                                    --i_22;
                                    if (i_22 < 0) {
                                        while (true) {
                                            --i_110;
                                            if (i_110 < 0) {
                                                return true;
                                            }

                                            if (!method3373(aClass201_2586.anIntArray2565, i_31, 0, (i_51 >> 12) - 1, (i_61 >> 12) + 1, i_9, i_20, aClass201_2586.anInt2543)) {
                                                return false;
                                            }

                                            i_51 += i_16;
                                            i_61 += i_18;
                                            i_9 += i_21;
                                            i_31 += aClass201_2586.anInt2543;
                                        }
                                    }

                                    if (!method3373(aClass201_2586.anIntArray2565, i_31, 0, (i_41 >> 12) - 1, (i_61 >> 12) + 1, i_9, i_20, aClass201_2586.anInt2543)) {
                                        return false;
                                    }

                                    i_41 += i_17;
                                    i_61 += i_18;
                                    i_9 += i_21;
                                    i_31 += aClass201_2586.anInt2543;
                                }
                            } else {
                                i_110 -= i_22;
                                i_22 -= i_31;
                                i_31 *= aClass201_2586.anInt2543;

                                while (true) {
                                    --i_22;
                                    if (i_22 < 0) {
                                        while (true) {
                                            --i_110;
                                            if (i_110 < 0) {
                                                return true;
                                            }

                                            if (!method3373(aClass201_2586.anIntArray2565, i_31, 0, (i_61 >> 12) - 1, (i_51 >> 12) + 1, i_9, i_20, aClass201_2586.anInt2543)) {
                                                return false;
                                            }

                                            i_51 += i_16;
                                            i_61 += i_18;
                                            i_9 += i_21;
                                            i_31 += aClass201_2586.anInt2543;
                                        }
                                    }

                                    if (!method3373(aClass201_2586.anIntArray2565, i_31, 0, (i_61 >> 12) - 1, (i_41 >> 12) + 1, i_9, i_20, aClass201_2586.anInt2543)) {
                                        return false;
                                    }

                                    i_41 += i_17;
                                    i_61 += i_18;
                                    i_9 += i_21;
                                    i_31 += aClass201_2586.anInt2543;
                                }
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    boolean method3373(int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        int i_51 = i_5;
        int i_41 = i_4;
        int i_31 = i_3;
        if (i_51 > i_8) {
            i_51 = i_8;
        }

        if (i_41 < 0) {
            i_41 = 0;
        }

        if (i_41 >= i_51) {
            return true;
        } else {
            i_2 += i_41 - 1;
            i_31 = i_51 - i_41 >> 2;
            i_6 += i_41 * i_7;
            if (anInt2587 == 1) {
                anInt2588 += i_31;

                while (true) {
                    --i_31;
                    if (i_31 < 0) {
                        i_31 = i_51 - i_41 & 0x3;

                        while (true) {
                            --i_31;
                            if (i_31 < 0) {
                                return true;
                            }

                            ++i_2;
                            if (i_6 < ints_1[i_2]) {
                                ints_1[i_2] = i_6;
                            }

                            i_6 += i_7;
                        }
                    }

                    ++i_2;
                    if (i_6 < ints_1[i_2]) {
                        ints_1[i_2] = i_6;
                    }

                    i_6 += i_7;
                    ++i_2;
                    if (i_6 < ints_1[i_2]) {
                        ints_1[i_2] = i_6;
                    }

                    i_6 += i_7;
                    ++i_2;
                    if (i_6 < ints_1[i_2]) {
                        ints_1[i_2] = i_6;
                    }

                    i_6 += i_7;
                    ++i_2;
                    if (i_6 < ints_1[i_2]) {
                        ints_1[i_2] = i_6;
                    }

                    i_6 += i_7;
                }
            } else {
                i_6 -= 39168;

                while (true) {
                    --i_31;
                    if (i_31 < 0) {
                        i_31 = i_51 - i_41 & 0x3;

                        while (true) {
                            --i_31;
                            if (i_31 < 0) {
                                return true;
                            }

                            ++i_2;
                            if (i_6 < ints_1[i_2]) {
                                return false;
                            }

                            i_6 += i_7;
                        }
                    }

                    ++i_2;
                    if (i_6 < ints_1[i_2]) {
                        return false;
                    }

                    i_6 += i_7;
                    ++i_2;
                    if (i_6 < ints_1[i_2]) {
                        return false;
                    }

                    i_6 += i_7;
                    ++i_2;
                    if (i_6 < ints_1[i_2]) {
                        return false;
                    }

                    i_6 += i_7;
                    ++i_2;
                    if (i_6 < ints_1[i_2]) {
                        return false;
                    }

                    i_6 += i_7;
                }
            }
        }
    }

}
