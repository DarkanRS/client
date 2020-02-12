package com.jagex;

public class Class205 {

    int anInt2587;
    int anInt2588 = 0;
    Class201 aClass201_2586;

    final boolean method3371(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        if (i_1 <= 2002 && i_2 <= 2002 && i_3 <= 2002 && i_4 <= 2002 && i_5 <= 2002 && i_6 <= 2002) {
            if (i_1 >= -2002 && i_2 >= -2002 && i_3 >= -2002 && i_4 >= -2002 && i_5 >= -2002 && i_6 >= -2002) {
                int i_10;
                if (this.anInt2587 == 2) {
                    i_10 = this.aClass201_2586.anInt2543 * i_1 + i_4;
                    if (i_10 >= 0 && i_10 < this.aClass201_2586.anIntArray2565.length && (i_7 << 8) - 39168 < this.aClass201_2586.anIntArray2565[i_10]) {
                        return false;
                    }

                    i_10 = i_5 + this.aClass201_2586.anInt2543 * i_2;
                    if (i_10 >= 0 && i_10 < this.aClass201_2586.anIntArray2565.length && (i_8 << 8) - 39168 < this.aClass201_2586.anIntArray2565[i_10]) {
                        return false;
                    }

                    i_10 = i_3 * this.aClass201_2586.anInt2543 + i_6;
                    if (i_10 >= 0 && i_10 < this.aClass201_2586.anIntArray2565.length && (i_9 << 8) - 39168 < this.aClass201_2586.anIntArray2565[i_10]) {
                        return false;
                    }
                }

                i_10 = i_5 - i_4;
                int i_11 = i_2 - i_1;
                int i_12 = i_6 - i_4;
                int i_13 = i_3 - i_1;
                int i_14 = i_8 - i_7;
                int i_15 = i_9 - i_7;
                if (i_1 < i_2 && i_1 < i_3) {
                    --i_1;
                    if (i_2 > i_3) {
                        ++i_2;
                    } else {
                        ++i_3;
                    }
                } else if (i_2 < i_3) {
                    --i_2;
                    if (i_1 > i_3) {
                        ++i_1;
                    } else {
                        ++i_3;
                    }
                } else {
                    --i_3;
                    if (i_1 > i_2) {
                        ++i_1;
                    } else {
                        ++i_2;
                    }
                }

                int i_16 = 0;
                if (i_2 != i_1) {
                    i_16 = (i_5 - i_4 << 12) / (i_2 - i_1);
                }

                int i_17 = 0;
                if (i_3 != i_2) {
                    i_17 = (i_6 - i_5 << 12) / (i_3 - i_2);
                }

                int i_18 = 0;
                if (i_3 != i_1) {
                    i_18 = (i_4 - i_6 << 12) / (i_1 - i_3);
                }

                int i_19 = i_10 * i_13 - i_12 * i_11;
                if (i_19 == 0) {
                    return false;
                } else {
                    int i_20 = (i_14 * i_13 - i_15 * i_11 << 8) / i_19;
                    int i_21 = (i_15 * i_10 - i_14 * i_12 << 8) / i_19;
                    if (i_1 <= i_2 && i_1 <= i_3) {
                        if (i_1 >= this.aClass201_2586.anInt2570) {
                            return true;
                        } else {
                            if (i_2 > this.aClass201_2586.anInt2570) {
                                i_2 = this.aClass201_2586.anInt2570;
                            }

                            if (i_3 > this.aClass201_2586.anInt2570) {
                                i_3 = this.aClass201_2586.anInt2570;
                            }

                            i_7 = i_20 + ((i_7 << 8) - i_20 * i_4);
                            if (i_2 < i_3) {
                                i_6 = i_4 <<= 12;
                                if (i_1 < 0) {
                                    i_6 -= i_18 * i_1;
                                    i_4 -= i_16 * i_1;
                                    i_7 -= i_21 * i_1;
                                    i_1 = 0;
                                }

                                i_5 <<= 12;
                                if (i_2 < 0) {
                                    i_5 -= i_17 * i_2;
                                    i_2 = 0;
                                }

                                if (i_2 != i_1 && i_18 < i_16 || i_2 == i_1 && i_18 > i_17) {
                                    i_3 -= i_2;
                                    i_2 -= i_1;
                                    i_1 = this.aClass201_2586.anInt2543 * i_1;

                                    while (true) {
                                        --i_2;
                                        if (i_2 < 0) {
                                            while (true) {
                                                --i_3;
                                                if (i_3 < 0) {
                                                    return true;
                                                }

                                                if (!this.method3373(this.aClass201_2586.anIntArray2565, i_1, 0, (i_6 >> 12) - 1, (i_5 >> 12) + 1, i_7, i_20, this.aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_6 += i_18;
                                                i_5 += i_17;
                                                i_7 += i_21;
                                                i_1 += this.aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!this.method3373(this.aClass201_2586.anIntArray2565, i_1, 0, (i_6 >> 12) - 1, (i_4 >> 12) + 1, i_7, i_20, this.aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_6 += i_18;
                                        i_4 += i_16;
                                        i_7 += i_21;
                                        i_1 += this.aClass201_2586.anInt2543;
                                    }
                                } else {
                                    i_3 -= i_2;
                                    i_2 -= i_1;
                                    i_1 = this.aClass201_2586.anInt2543 * i_1;

                                    while (true) {
                                        --i_2;
                                        if (i_2 < 0) {
                                            while (true) {
                                                --i_3;
                                                if (i_3 < 0) {
                                                    return true;
                                                }

                                                if (!this.method3373(this.aClass201_2586.anIntArray2565, i_1, 0, (i_5 >> 12) - 1, (i_6 >> 12) + 1, i_7, i_20, this.aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_6 += i_18;
                                                i_5 += i_17;
                                                i_7 += i_21;
                                                i_1 += this.aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!this.method3373(this.aClass201_2586.anIntArray2565, i_1, 0, (i_4 >> 12) - 1, (i_6 >> 12) + 1, i_7, i_20, this.aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_6 += i_18;
                                        i_4 += i_16;
                                        i_7 += i_21;
                                        i_1 += this.aClass201_2586.anInt2543;
                                    }
                                }
                            } else {
                                i_5 = i_4 <<= 12;
                                if (i_1 < 0) {
                                    i_5 -= i_18 * i_1;
                                    i_4 -= i_16 * i_1;
                                    i_7 -= i_21 * i_1;
                                    i_1 = 0;
                                }

                                i_6 <<= 12;
                                if (i_3 < 0) {
                                    i_6 -= i_3 * i_17;
                                    i_3 = 0;
                                }

                                if (i_3 != i_1 && i_18 < i_16 || i_3 == i_1 && i_17 > i_16) {
                                    i_2 -= i_3;
                                    i_3 -= i_1;
                                    i_1 = this.aClass201_2586.anInt2543 * i_1;

                                    while (true) {
                                        --i_3;
                                        if (i_3 < 0) {
                                            while (true) {
                                                --i_2;
                                                if (i_2 < 0) {
                                                    return true;
                                                }

                                                if (!this.method3373(this.aClass201_2586.anIntArray2565, i_1, 0, (i_6 >> 12) - 1, (i_4 >> 12) + 1, i_7, i_20, this.aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_6 += i_17;
                                                i_4 += i_16;
                                                i_7 += i_21;
                                                i_1 += this.aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!this.method3373(this.aClass201_2586.anIntArray2565, i_1, 0, (i_5 >> 12) - 1, (i_4 >> 12) + 1, i_7, i_20, this.aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_5 += i_18;
                                        i_4 += i_16;
                                        i_7 += i_21;
                                        i_1 += this.aClass201_2586.anInt2543;
                                    }
                                } else {
                                    i_2 -= i_3;
                                    i_3 -= i_1;
                                    i_1 = this.aClass201_2586.anInt2543 * i_1;

                                    while (true) {
                                        --i_3;
                                        if (i_3 < 0) {
                                            while (true) {
                                                --i_2;
                                                if (i_2 < 0) {
                                                    return true;
                                                }

                                                if (!this.method3373(this.aClass201_2586.anIntArray2565, i_1, 0, (i_4 >> 12) - 1, (i_6 >> 12) + 1, i_7, i_20, this.aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_6 += i_17;
                                                i_4 += i_16;
                                                i_7 += i_21;
                                                i_1 += this.aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!this.method3373(this.aClass201_2586.anIntArray2565, i_1, 0, (i_4 >> 12) - 1, (i_5 >> 12) + 1, i_7, i_20, this.aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_5 += i_18;
                                        i_4 += i_16;
                                        i_7 += i_21;
                                        i_1 += this.aClass201_2586.anInt2543;
                                    }
                                }
                            }
                        }
                    } else if (i_2 <= i_3) {
                        if (i_2 >= this.aClass201_2586.anInt2570) {
                            return true;
                        } else {
                            if (i_3 > this.aClass201_2586.anInt2570) {
                                i_3 = this.aClass201_2586.anInt2570;
                            }

                            if (i_1 > this.aClass201_2586.anInt2570) {
                                i_1 = this.aClass201_2586.anInt2570;
                            }

                            i_8 = i_20 + ((i_8 << 8) - i_5 * i_20);
                            if (i_3 < i_1) {
                                i_4 = i_5 <<= 12;
                                if (i_2 < 0) {
                                    i_4 -= i_16 * i_2;
                                    i_5 -= i_17 * i_2;
                                    i_8 -= i_21 * i_2;
                                    i_2 = 0;
                                }

                                i_6 <<= 12;
                                if (i_3 < 0) {
                                    i_6 -= i_3 * i_18;
                                    i_3 = 0;
                                }

                                if (i_3 != i_2 && i_16 < i_17 || i_3 == i_2 && i_16 > i_18) {
                                    i_1 -= i_3;
                                    i_3 -= i_2;
                                    i_2 = this.aClass201_2586.anInt2543 * i_2;

                                    while (true) {
                                        --i_3;
                                        if (i_3 < 0) {
                                            while (true) {
                                                --i_1;
                                                if (i_1 < 0) {
                                                    return true;
                                                }

                                                if (!this.method3373(this.aClass201_2586.anIntArray2565, i_2, 0, (i_4 >> 12) - 1, (i_6 >> 12) + 1, i_8, i_20, this.aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_4 += i_16;
                                                i_6 += i_18;
                                                i_8 += i_21;
                                                i_2 += this.aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!this.method3373(this.aClass201_2586.anIntArray2565, i_2, 0, (i_4 >> 12) - 1, (i_5 >> 12) + 1, i_8, i_20, this.aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_4 += i_16;
                                        i_5 += i_17;
                                        i_8 += i_21;
                                        i_2 += this.aClass201_2586.anInt2543;
                                    }
                                } else {
                                    i_1 -= i_3;
                                    i_3 -= i_2;
                                    i_2 = this.aClass201_2586.anInt2543 * i_2;

                                    while (true) {
                                        --i_3;
                                        if (i_3 < 0) {
                                            while (true) {
                                                --i_1;
                                                if (i_1 < 0) {
                                                    return true;
                                                }

                                                if (!this.method3373(this.aClass201_2586.anIntArray2565, i_2, 0, (i_6 >> 12) - 1, (i_4 >> 12) + 1, i_8, i_20, this.aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_4 += i_16;
                                                i_6 += i_18;
                                                i_8 += i_21;
                                                i_2 += this.aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!this.method3373(this.aClass201_2586.anIntArray2565, i_2, 0, (i_5 >> 12) - 1, (i_4 >> 12) + 1, i_8, i_20, this.aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_4 += i_16;
                                        i_5 += i_17;
                                        i_8 += i_21;
                                        i_2 += this.aClass201_2586.anInt2543;
                                    }
                                }
                            } else {
                                i_6 = i_5 <<= 12;
                                if (i_2 < 0) {
                                    i_6 -= i_16 * i_2;
                                    i_5 -= i_17 * i_2;
                                    i_8 -= i_21 * i_2;
                                    i_2 = 0;
                                }

                                i_4 <<= 12;
                                if (i_1 < 0) {
                                    i_4 -= i_18 * i_1;
                                    i_1 = 0;
                                }

                                if (i_16 < i_17) {
                                    i_3 -= i_1;
                                    i_1 -= i_2;
                                    i_2 = this.aClass201_2586.anInt2543 * i_2;

                                    while (true) {
                                        --i_1;
                                        if (i_1 < 0) {
                                            while (true) {
                                                --i_3;
                                                if (i_3 < 0) {
                                                    return true;
                                                }

                                                if (!this.method3373(this.aClass201_2586.anIntArray2565, i_2, 0, (i_4 >> 12) - 1, (i_5 >> 12) + 1, i_8, i_20, this.aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_4 += i_18;
                                                i_5 += i_17;
                                                i_8 += i_21;
                                                i_2 += this.aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!this.method3373(this.aClass201_2586.anIntArray2565, i_2, 0, (i_6 >> 12) - 1, (i_5 >> 12) + 1, i_8, i_20, this.aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_6 += i_16;
                                        i_5 += i_17;
                                        i_8 += i_21;
                                        i_2 += this.aClass201_2586.anInt2543;
                                    }
                                } else {
                                    i_3 -= i_1;
                                    i_1 -= i_2;
                                    i_2 = this.aClass201_2586.anInt2543 * i_2;

                                    while (true) {
                                        --i_1;
                                        if (i_1 < 0) {
                                            while (true) {
                                                --i_3;
                                                if (i_3 < 0) {
                                                    return true;
                                                }

                                                if (!this.method3373(this.aClass201_2586.anIntArray2565, i_2, 0, (i_5 >> 12) - 1, (i_4 >> 12) + 1, i_8, i_20, this.aClass201_2586.anInt2543)) {
                                                    return false;
                                                }

                                                i_4 += i_18;
                                                i_5 += i_17;
                                                i_8 += i_21;
                                                i_2 += this.aClass201_2586.anInt2543;
                                            }
                                        }

                                        if (!this.method3373(this.aClass201_2586.anIntArray2565, i_2, 0, (i_5 >> 12) - 1, (i_6 >> 12) + 1, i_8, i_20, this.aClass201_2586.anInt2543)) {
                                            return false;
                                        }

                                        i_6 += i_16;
                                        i_5 += i_17;
                                        i_8 += i_21;
                                        i_2 += this.aClass201_2586.anInt2543;
                                    }
                                }
                            }
                        }
                    } else if (i_3 >= this.aClass201_2586.anInt2570) {
                        return true;
                    } else {
                        if (i_1 > this.aClass201_2586.anInt2570) {
                            i_1 = this.aClass201_2586.anInt2570;
                        }

                        if (i_2 > this.aClass201_2586.anInt2570) {
                            i_2 = this.aClass201_2586.anInt2570;
                        }

                        i_9 = i_20 + ((i_9 << 8) - i_20 * i_6);
                        if (i_1 < i_2) {
                            i_5 = i_6 <<= 12;
                            if (i_3 < 0) {
                                i_5 -= i_3 * i_17;
                                i_6 -= i_3 * i_18;
                                i_9 -= i_3 * i_21;
                                i_3 = 0;
                            }

                            i_4 <<= 12;
                            if (i_1 < 0) {
                                i_4 -= i_16 * i_1;
                                i_1 = 0;
                            }

                            if (i_17 < i_18) {
                                i_2 -= i_1;
                                i_1 -= i_3;
                                i_3 *= this.aClass201_2586.anInt2543;

                                while (true) {
                                    --i_1;
                                    if (i_1 < 0) {
                                        while (true) {
                                            --i_2;
                                            if (i_2 < 0) {
                                                return true;
                                            }

                                            if (!this.method3373(this.aClass201_2586.anIntArray2565, i_3, 0, (i_5 >> 12) - 1, (i_4 >> 12) + 1, i_9, i_20, this.aClass201_2586.anInt2543)) {
                                                return false;
                                            }

                                            i_5 += i_17;
                                            i_4 += i_16;
                                            i_9 += i_21;
                                            i_3 += this.aClass201_2586.anInt2543;
                                        }
                                    }

                                    if (!this.method3373(this.aClass201_2586.anIntArray2565, i_3, 0, (i_5 >> 12) - 1, (i_6 >> 12) + 1, i_9, i_20, this.aClass201_2586.anInt2543)) {
                                        return false;
                                    }

                                    i_5 += i_17;
                                    i_6 += i_18;
                                    i_9 += i_21;
                                    i_3 += this.aClass201_2586.anInt2543;
                                }
                            } else {
                                i_2 -= i_1;
                                i_1 -= i_3;
                                i_3 *= this.aClass201_2586.anInt2543;

                                while (true) {
                                    --i_1;
                                    if (i_1 < 0) {
                                        while (true) {
                                            --i_2;
                                            if (i_2 < 0) {
                                                return true;
                                            }

                                            if (!this.method3373(this.aClass201_2586.anIntArray2565, i_3, 0, (i_4 >> 12) - 1, (i_5 >> 12) + 1, i_9, i_20, this.aClass201_2586.anInt2543)) {
                                                return false;
                                            }

                                            i_5 += i_17;
                                            i_4 += i_16;
                                            i_9 += i_21;
                                            i_3 += this.aClass201_2586.anInt2543;
                                        }
                                    }

                                    if (!this.method3373(this.aClass201_2586.anIntArray2565, i_3, 0, (i_6 >> 12) - 1, (i_5 >> 12) + 1, i_9, i_20, this.aClass201_2586.anInt2543)) {
                                        return false;
                                    }

                                    i_5 += i_17;
                                    i_6 += i_18;
                                    i_9 += i_21;
                                    i_3 += this.aClass201_2586.anInt2543;
                                }
                            }
                        } else {
                            i_4 = i_6 <<= 12;
                            if (i_3 < 0) {
                                i_4 -= i_3 * i_17;
                                i_6 -= i_3 * i_18;
                                i_9 -= i_3 * i_21;
                                i_3 = 0;
                            }

                            i_5 <<= 12;
                            if (i_2 < 0) {
                                i_5 -= i_16 * i_2;
                                i_2 = 0;
                            }

                            if (i_17 < i_18) {
                                i_1 -= i_2;
                                i_2 -= i_3;
                                i_3 *= this.aClass201_2586.anInt2543;

                                while (true) {
                                    --i_2;
                                    if (i_2 < 0) {
                                        while (true) {
                                            --i_1;
                                            if (i_1 < 0) {
                                                return true;
                                            }

                                            if (!this.method3373(this.aClass201_2586.anIntArray2565, i_3, 0, (i_5 >> 12) - 1, (i_6 >> 12) + 1, i_9, i_20, this.aClass201_2586.anInt2543)) {
                                                return false;
                                            }

                                            i_5 += i_16;
                                            i_6 += i_18;
                                            i_9 += i_21;
                                            i_3 += this.aClass201_2586.anInt2543;
                                        }
                                    }

                                    if (!this.method3373(this.aClass201_2586.anIntArray2565, i_3, 0, (i_4 >> 12) - 1, (i_6 >> 12) + 1, i_9, i_20, this.aClass201_2586.anInt2543)) {
                                        return false;
                                    }

                                    i_4 += i_17;
                                    i_6 += i_18;
                                    i_9 += i_21;
                                    i_3 += this.aClass201_2586.anInt2543;
                                }
                            } else {
                                i_1 -= i_2;
                                i_2 -= i_3;
                                i_3 *= this.aClass201_2586.anInt2543;

                                while (true) {
                                    --i_2;
                                    if (i_2 < 0) {
                                        while (true) {
                                            --i_1;
                                            if (i_1 < 0) {
                                                return true;
                                            }

                                            if (!this.method3373(this.aClass201_2586.anIntArray2565, i_3, 0, (i_6 >> 12) - 1, (i_5 >> 12) + 1, i_9, i_20, this.aClass201_2586.anInt2543)) {
                                                return false;
                                            }

                                            i_5 += i_16;
                                            i_6 += i_18;
                                            i_9 += i_21;
                                            i_3 += this.aClass201_2586.anInt2543;
                                        }
                                    }

                                    if (!this.method3373(this.aClass201_2586.anIntArray2565, i_3, 0, (i_6 >> 12) - 1, (i_4 >> 12) + 1, i_9, i_20, this.aClass201_2586.anInt2543)) {
                                        return false;
                                    }

                                    i_4 += i_17;
                                    i_6 += i_18;
                                    i_9 += i_21;
                                    i_3 += this.aClass201_2586.anInt2543;
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

    final boolean method3373(int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        if (i_5 > i_8) {
            i_5 = i_8;
        }

        if (i_4 < 0) {
            i_4 = 0;
        }

        if (i_4 >= i_5) {
            return true;
        } else {
            i_2 += i_4 - 1;
            i_3 = i_5 - i_4 >> 2;
            i_6 += i_4 * i_7;
            if (this.anInt2587 == 1) {
                this.anInt2588 += i_3;

                while (true) {
                    --i_3;
                    if (i_3 < 0) {
                        i_3 = i_5 - i_4 & 0x3;

                        while (true) {
                            --i_3;
                            if (i_3 < 0) {
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
                    --i_3;
                    if (i_3 < 0) {
                        i_3 = i_5 - i_4 & 0x3;

                        while (true) {
                            --i_3;
                            if (i_3 < 0) {
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

    Class205(Class201 class201_1) {
        this.aClass201_2586 = class201_1;
    }

}
