public class ClipMap {

    public int[][] map;

    public int offsetX;

    public int offsetY;

    int sizeX;

    int sizeY;

    static int anInt3968;

    public void method5965() {
        for (int i_2 = 0; i_2 < this.sizeX; i_2++) {
            for (int i_3 = 0; i_3 < this.sizeY; i_3++) {
                if (i_2 != 0 && i_3 != 0 && i_2 < this.sizeX - 5 && i_3 < this.sizeY - 5) {
                    this.map[i_2][i_3] = 2097152;
                } else {
                    this.map[i_2][i_3] = -1;
                }
            }
        }
    }

    public void addObject(int i_1, int i_2, int i_3, int i_4, boolean bool_5, boolean bool_6, byte b_7) {
        int i_8 = 256;
        if (bool_5) {
            i_8 |= 0x20000;
        }
        if (bool_6) {
            i_8 |= 0x40000000;
        }
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        for (int i_9 = i_1; i_9 < i_3 + i_1; i_9++) {
            if (i_9 >= 0 && i_9 < this.sizeX) {
                for (int i_10 = i_2; i_10 < i_2 + i_4; i_10++) {
                    if (i_10 >= 0 && i_10 < this.sizeY) {
                        this.addMask(i_9, i_10, i_8, (byte) -45);
                    }
                }
            }
        }
    }

    public void addBlockFloorDeco(int i_1, int i_2) {
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        this.map[i_1][i_2] |= 0x40000;
    }

    public void method5970(int i_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6, boolean bool_7) {
        int i_9 = 256;
        if (bool_6) {
            i_9 |= 0x20000;
        }
        if (bool_7) {
            i_9 |= 0x40000000;
        }
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        int i_10;
        if (i_5 == 1 || i_5 == 3) {
            i_10 = i_3;
            i_3 = i_4;
            i_4 = i_10;
        }
        for (i_10 = i_1; i_10 < i_3 + i_1; i_10++) {
            if (i_10 >= 0 && i_10 < this.sizeX) {
                for (int i_11 = i_2; i_11 < i_2 + i_4; i_11++) {
                    if (i_11 >= 0 && i_11 < this.sizeY) {
                        this.method5973(i_10, i_11, i_9, (byte) 121);
                    }
                }
            }
        }
    }

    public void method5971(int i_1, int i_2, int i_3, int i_4, boolean bool_5, boolean bool_6) {
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        if (i_3 == 0) {
            if (i_4 == 0) {
                this.addMask(i_1, i_2, 128, (byte) -66);
                this.addMask(i_1 - 1, i_2, 8, (byte) -78);
            }
            if (i_4 == 1) {
                this.addMask(i_1, i_2, 2, (byte) -8);
                this.addMask(i_1, i_2 + 1, 32, (byte) -40);
            }
            if (i_4 == 2) {
                this.addMask(i_1, i_2, 8, (byte) -5);
                this.addMask(i_1 + 1, i_2, 128, (byte) -55);
            }
            if (i_4 == 3) {
                this.addMask(i_1, i_2, 32, (byte) -4);
                this.addMask(i_1, i_2 - 1, 2, (byte) -73);
            }
        }
        if (i_3 == 1 || i_3 == 3) {
            if (i_4 == 0) {
                this.addMask(i_1, i_2, 1, (byte) -65);
                this.addMask(i_1 - 1, i_2 + 1, 16, (byte) -1);
            }
            if (i_4 == 1) {
                this.addMask(i_1, i_2, 4, (byte) -113);
                this.addMask(i_1 + 1, i_2 + 1, 64, (byte) -40);
            }
            if (i_4 == 2) {
                this.addMask(i_1, i_2, 16, (byte) -55);
                this.addMask(i_1 + 1, i_2 - 1, 1, (byte) -106);
            }
            if (i_4 == 3) {
                this.addMask(i_1, i_2, 64, (byte) -119);
                this.addMask(i_1 - 1, i_2 - 1, 4, (byte) -35);
            }
        }
        if (i_3 == 2) {
            if (i_4 == 0) {
                this.addMask(i_1, i_2, 130, (byte) -57);
                this.addMask(i_1 - 1, i_2, 8, (byte) -10);
                this.addMask(i_1, i_2 + 1, 32, (byte) -15);
            }
            if (i_4 == 1) {
                this.addMask(i_1, i_2, 10, (byte) -5);
                this.addMask(i_1, i_2 + 1, 32, (byte) -98);
                this.addMask(i_1 + 1, i_2, 128, (byte) -13);
            }
            if (i_4 == 2) {
                this.addMask(i_1, i_2, 40, (byte) -32);
                this.addMask(i_1 + 1, i_2, 128, (byte) -104);
                this.addMask(i_1, i_2 - 1, 2, (byte) -11);
            }
            if (i_4 == 3) {
                this.addMask(i_1, i_2, 160, (byte) -41);
                this.addMask(i_1, i_2 - 1, 2, (byte) -112);
                this.addMask(i_1 - 1, i_2, 8, (byte) -103);
            }
        }
        if (bool_5) {
            if (i_3 == 0) {
                if (i_4 == 0) {
                    this.addMask(i_1, i_2, 65536, (byte) -54);
                    this.addMask(i_1 - 1, i_2, 4096, (byte) -117);
                }
                if (i_4 == 1) {
                    this.addMask(i_1, i_2, 1024, (byte) -86);
                    this.addMask(i_1, i_2 + 1, 16384, (byte) -114);
                }
                if (i_4 == 2) {
                    this.addMask(i_1, i_2, 4096, (byte) -112);
                    this.addMask(i_1 + 1, i_2, 65536, (byte) -88);
                }
                if (i_4 == 3) {
                    this.addMask(i_1, i_2, 16384, (byte) -20);
                    this.addMask(i_1, i_2 - 1, 1024, (byte) -12);
                }
            }
            if (i_3 == 1 || i_3 == 3) {
                if (i_4 == 0) {
                    this.addMask(i_1, i_2, 512, (byte) -118);
                    this.addMask(i_1 - 1, i_2 + 1, 8192, (byte) -106);
                }
                if (i_4 == 1) {
                    this.addMask(i_1, i_2, 2048, (byte) -15);
                    this.addMask(i_1 + 1, i_2 + 1, 32768, (byte) -59);
                }
                if (i_4 == 2) {
                    this.addMask(i_1, i_2, 8192, (byte) -115);
                    this.addMask(i_1 + 1, i_2 - 1, 512, (byte) -60);
                }
                if (i_4 == 3) {
                    this.addMask(i_1, i_2, 32768, (byte) -88);
                    this.addMask(i_1 - 1, i_2 - 1, 2048, (byte) -40);
                }
            }
            if (i_3 == 2) {
                if (i_4 == 0) {
                    this.addMask(i_1, i_2, 66560, (byte) -32);
                    this.addMask(i_1 - 1, i_2, 4096, (byte) -5);
                    this.addMask(i_1, i_2 + 1, 16384, (byte) -16);
                }
                if (i_4 == 1) {
                    this.addMask(i_1, i_2, 5120, (byte) -17);
                    this.addMask(i_1, i_2 + 1, 16384, (byte) -115);
                    this.addMask(i_1 + 1, i_2, 65536, (byte) -83);
                }
                if (i_4 == 2) {
                    this.addMask(i_1, i_2, 20480, (byte) -124);
                    this.addMask(i_1 + 1, i_2, 65536, (byte) -78);
                    this.addMask(i_1, i_2 - 1, 1024, (byte) -2);
                }
                if (i_4 == 3) {
                    this.addMask(i_1, i_2, 81920, (byte) -97);
                    this.addMask(i_1, i_2 - 1, 1024, (byte) -22);
                    this.addMask(i_1 - 1, i_2, 4096, (byte) -53);
                }
            }
        }
        if (bool_6) {
            if (i_3 == 0) {
                if (i_4 == 0) {
                    this.addMask(i_1, i_2, 536870912, (byte) -6);
                    this.addMask(i_1 - 1, i_2, 33554432, (byte) -69);
                }
                if (i_4 == 1) {
                    this.addMask(i_1, i_2, 8388608, (byte) -99);
                    this.addMask(i_1, i_2 + 1, 134217728, (byte) -100);
                }
                if (i_4 == 2) {
                    this.addMask(i_1, i_2, 33554432, (byte) -18);
                    this.addMask(i_1 + 1, i_2, 536870912, (byte) -23);
                }
                if (i_4 == 3) {
                    this.addMask(i_1, i_2, 134217728, (byte) -104);
                    this.addMask(i_1, i_2 - 1, 8388608, (byte) -88);
                }
            }
            if (i_3 == 1 || i_3 == 3) {
                if (i_4 == 0) {
                    this.addMask(i_1, i_2, 4194304, (byte) -116);
                    this.addMask(i_1 - 1, i_2 + 1, 67108864, (byte) -95);
                }
                if (i_4 == 1) {
                    this.addMask(i_1, i_2, 16777216, (byte) -120);
                    this.addMask(i_1 + 1, i_2 + 1, 268435456, (byte) -127);
                }
                if (i_4 == 2) {
                    this.addMask(i_1, i_2, 67108864, (byte) -59);
                    this.addMask(i_1 + 1, i_2 - 1, 4194304, (byte) -92);
                }
                if (i_4 == 3) {
                    this.addMask(i_1, i_2, 268435456, (byte) -63);
                    this.addMask(i_1 - 1, i_2 - 1, 16777216, (byte) -69);
                }
            }
            if (i_3 == 2) {
                if (i_4 == 0) {
                    this.addMask(i_1, i_2, 545259520, (byte) -108);
                    this.addMask(i_1 - 1, i_2, 33554432, (byte) -103);
                    this.addMask(i_1, i_2 + 1, 134217728, (byte) -9);
                }
                if (i_4 == 1) {
                    this.addMask(i_1, i_2, 41943040, (byte) -99);
                    this.addMask(i_1, i_2 + 1, 134217728, (byte) -27);
                    this.addMask(i_1 + 1, i_2, 536870912, (byte) -124);
                }
                if (i_4 == 2) {
                    this.addMask(i_1, i_2, 167772160, (byte) -67);
                    this.addMask(i_1 + 1, i_2, 536870912, (byte) -102);
                    this.addMask(i_1, i_2 - 1, 8388608, (byte) -115);
                }
                if (i_4 == 3) {
                    this.addMask(i_1, i_2, 671088640, (byte) -1);
                    this.addMask(i_1, i_2 - 1, 8388608, (byte) -83);
                    this.addMask(i_1 - 1, i_2, 33554432, (byte) -81);
                }
            }
        }
    }

    public void addUnwalkable(int i_1, int i_2) {
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        this.map[i_1][i_2] |= 0x200000;
    }

    void method5973(int i_1, int i_2, int i_3, byte b_4) {
        this.map[i_1][i_2] &= ~i_3;
    }

    public void method5974(int i_1, int i_2) {
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        this.map[i_1][i_2] &= ~0x200000;
    }

    void addMask(int i_1, int i_2, int i_3, byte b_4) {
        this.map[i_1][i_2] |= i_3;
    }

    public boolean method5978(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
        int i_11 = i_3 + i_1;
        int i_12 = i_2 + i_4;
        int i_13 = i_5 + i_7;
        int i_14 = i_8 + i_6;
        int i_15;
        int i_16;
        if (i_13 == i_1 && (i_9 & 0x2) == 0) {
            i_15 = i_2 > i_6 ? i_2 : i_6;
            for (i_16 = i_12 < i_14 ? i_12 : i_14; i_15 < i_16; i_15++) {
                if ((this.map[i_13 - 1 - this.offsetX][i_15 - this.offsetY] & 0x8) == 0) {
                    return true;
                }
            }
        } else if (i_5 == i_11 && (i_9 & 0x8) == 0) {
            i_15 = i_2 > i_6 ? i_2 : i_6;
            for (i_16 = i_12 < i_14 ? i_12 : i_14; i_15 < i_16; i_15++) {
                if ((this.map[i_5 - this.offsetX][i_15 - this.offsetY] & 0x80) == 0) {
                    return true;
                }
            }
        } else if (i_14 == i_2 && (i_9 & 0x1) == 0) {
            i_15 = i_1 > i_5 ? i_1 : i_5;
            for (i_16 = i_11 < i_13 ? i_11 : i_13; i_15 < i_16; i_15++) {
                if ((this.map[i_15 - this.offsetX][i_14 - 1 - this.offsetY] & 0x2) == 0) {
                    return true;
                }
            }
        } else if (i_12 == i_6 && (i_9 & 0x4) == 0) {
            i_15 = i_1 > i_5 ? i_1 : i_5;
            for (i_16 = i_11 < i_13 ? i_11 : i_13; i_15 < i_16; i_15++) {
                if ((this.map[i_15 - this.offsetX][i_6 - this.offsetY] & 0x20) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean method5986(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, short s_8) {
        if (i_3 == 1) {
            if (i_4 == i_1 && i_5 == i_2) {
                return true;
            }
        } else if (i_4 >= i_1 && i_4 <= i_3 + i_1 - 1 && i_5 >= i_5 && i_5 <= i_3 + i_5 - 1) {
            return true;
        }
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        i_4 -= this.offsetX;
        i_5 -= this.offsetY;
        if (i_3 == 1) {
            if (i_6 == 0) {
                if (i_7 == 0) {
                    if (i_4 - 1 == i_1 && i_5 == i_2) {
                        return true;
                    }
                    if (i_4 == i_1 && i_5 + 1 == i_2 && (this.map[i_1][i_2] & 0x2c0120) == 0) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1 && (this.map[i_1][i_2] & 0x2c0102) == 0) {
                        return true;
                    }
                } else if (i_7 == 1) {
                    if (i_4 == i_1 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 - 1 == i_1 && i_5 == i_2 && (this.map[i_1][i_2] & 0x2c0108) == 0) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2 && (this.map[i_1][i_2] & 0x2c0180) == 0) {
                        return true;
                    }
                } else if (i_7 == 2) {
                    if (i_4 + 1 == i_1 && i_5 == i_2) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 + 1 && (this.map[i_1][i_2] & 0x2c0120) == 0) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1 && (this.map[i_1][i_2] & 0x2c0102) == 0) {
                        return true;
                    }
                } else if (i_7 == 3) {
                    if (i_4 == i_1 && i_2 == i_5 - 1) {
                        return true;
                    }
                    if (i_4 - 1 == i_1 && i_5 == i_2 && (this.map[i_1][i_2] & 0x2c0108) == 0) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2 && (this.map[i_1][i_2] & 0x2c0180) == 0) {
                        return true;
                    }
                }
            }
            if (i_6 == 2) {
                if (i_7 == 0) {
                    if (i_4 - 1 == i_1 && i_5 == i_2) {
                        return true;
                    }
                    if (i_4 == i_1 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2 && (this.map[i_1][i_2] & 0x2c0180) == 0) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1 && (this.map[i_1][i_2] & 0x2c0102) == 0) {
                        return true;
                    }
                } else if (i_7 == 1) {
                    if (i_4 - 1 == i_1 && i_5 == i_2 && (this.map[i_1][i_2] & 0x2c0108) == 0) {
                        return true;
                    }
                    if (i_4 == i_1 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1 && (this.map[i_1][i_2] & 0x2c0102) == 0) {
                        return true;
                    }
                } else if (i_7 == 2) {
                    if (i_4 - 1 == i_1 && i_5 == i_2 && (this.map[i_1][i_2] & 0x2c0108) == 0) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 + 1 && (this.map[i_1][i_2] & 0x2c0120) == 0) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1) {
                        return true;
                    }
                } else if (i_7 == 3) {
                    if (i_4 - 1 == i_1 && i_5 == i_2) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 + 1 && (this.map[i_1][i_2] & 0x2c0120) == 0) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2 && (this.map[i_1][i_2] & 0x2c0180) == 0) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1) {
                        return true;
                    }
                }
            }
            if (i_6 == 9) {
                if (i_4 == i_1 && i_2 == i_5 + 1 && (this.map[i_1][i_2] & 0x20) == 0) {
                    return true;
                }
                if (i_4 == i_1 && i_2 == i_5 - 1 && (this.map[i_1][i_2] & 0x2) == 0) {
                    return true;
                }
                if (i_4 - 1 == i_1 && i_5 == i_2 && (this.map[i_1][i_2] & 0x8) == 0) {
                    return true;
                }
                if (i_4 + 1 == i_1 && i_5 == i_2 && (this.map[i_1][i_2] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int i_9 = i_3 + i_1 - 1;
            int i_10 = i_3 + i_2 - 1;
            if (i_6 == 0) {
                if (i_7 == 0) {
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_2 == i_5 + 1 && (this.map[i_4][i_2] & 0x2c0120) == 0) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2 && (this.map[i_4][i_10] & 0x2c0102) == 0) {
                        return true;
                    }
                } else if (i_7 == 1) {
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10 && (this.map[i_9][i_5] & 0x2c0108) == 0) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10 && (this.map[i_1][i_5] & 0x2c0180) == 0) {
                        return true;
                    }
                } else if (i_7 == 2) {
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2 && (this.map[i_4][i_2] & 0x2c0120) == 0) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2 && (this.map[i_4][i_10] & 0x2c0102) == 0) {
                        return true;
                    }
                } else if (i_7 == 3) {
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2) {
                        return true;
                    }
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10 && (this.map[i_9][i_5] & 0x2c0108) == 0) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10 && (this.map[i_1][i_5] & 0x2c0180) == 0) {
                        return true;
                    }
                }
            }
            if (i_6 == 2) {
                if (i_7 == 0) {
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10 && (this.map[i_1][i_5] & 0x2c0180) == 0) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2 && (this.map[i_4][i_10] & 0x2c0102) == 0) {
                        return true;
                    }
                } else if (i_7 == 1) {
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10 && (this.map[i_9][i_5] & 0x2c0108) == 0) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2 && (this.map[i_4][i_10] & 0x2c0102) == 0) {
                        return true;
                    }
                } else if (i_7 == 2) {
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10 && (this.map[i_9][i_5] & 0x2c0108) == 0) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2 && (this.map[i_4][i_2] & 0x2c0120) == 0) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2) {
                        return true;
                    }
                } else if (i_7 == 3) {
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_2 == i_5 + 1 && (this.map[i_4][i_2] & 0x2c0120) == 0) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10 && (this.map[i_1][i_5] & 0x2c0180) == 0) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2) {
                        return true;
                    }
                }
            }
            if (i_6 == 9) {
                if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2 && (this.map[i_4][i_2] & 0x2c0120) == 0) {
                    return true;
                }
                if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2 && (this.map[i_4][i_10] & 0x2c0102) == 0) {
                    return true;
                }
                if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10 && (this.map[i_9][i_5] & 0x2c0108) == 0) {
                    return true;
                }
                if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10 && (this.map[i_1][i_5] & 0x2c0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean method5988(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, byte b_9) {
        if (i_3 > 1) {
            return Class325.method5790(i_1, i_2, i_3, i_3, i_4, i_5, i_6, i_7, -386839744) ? true : this.method5978(i_1, i_2, i_3, i_3, i_4, i_5, i_6, i_7, i_8, -1585578368);
        } else {
            int i_10 = i_4 + i_6 - 1;
            int i_11 = i_5 + i_7 - 1;
            return i_1 >= i_4 && i_1 <= i_10 && i_2 >= i_5 && i_2 <= i_11 ? true : (i_4 - 1 == i_1 && i_2 >= i_5 && i_2 <= i_11 && (this.map[i_1 - this.offsetX][i_2 - this.offsetY] & 0x8) == 0 && (i_8 & 0x8) == 0 ? true : (i_10 + 1 == i_1 && i_2 >= i_5 && i_2 <= i_11 && (this.map[i_1 - this.offsetX][i_2 - this.offsetY] & 0x80) == 0 && (i_8 & 0x2) == 0 ? true : (i_2 == i_5 - 1 && i_1 >= i_4 && i_1 <= i_10 && (this.map[i_1 - this.offsetX][i_2 - this.offsetY] & 0x2) == 0 && (i_8 & 0x4) == 0 ? true : i_2 == i_11 + 1 && i_1 >= i_4 && i_1 <= i_10 && (this.map[i_1 - this.offsetX][i_2 - this.offsetY] & 0x20) == 0 && (i_8 & 0x1) == 0)));
        }
    }

    public void method5991(int i_1, int i_2) {
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        this.map[i_1][i_2] &= ~0x40000;
    }

    public void method5992(int i_1, int i_2, int i_3, int i_4, boolean bool_5, boolean bool_6) {
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        if (i_3 == 0) {
            if (i_4 == 0) {
                this.method5973(i_1, i_2, 128, (byte) 124);
                this.method5973(i_1 - 1, i_2, 8, (byte) 71);
            }
            if (i_4 == 1) {
                this.method5973(i_1, i_2, 2, (byte) 69);
                this.method5973(i_1, i_2 + 1, 32, (byte) 69);
            }
            if (i_4 == 2) {
                this.method5973(i_1, i_2, 8, (byte) 119);
                this.method5973(i_1 + 1, i_2, 128, (byte) 114);
            }
            if (i_4 == 3) {
                this.method5973(i_1, i_2, 32, (byte) 113);
                this.method5973(i_1, i_2 - 1, 2, (byte) 101);
            }
        }
        if (i_3 == 1 || i_3 == 3) {
            if (i_4 == 0) {
                this.method5973(i_1, i_2, 1, (byte) 123);
                this.method5973(i_1 - 1, i_2 + 1, 16, (byte) 93);
            }
            if (i_4 == 1) {
                this.method5973(i_1, i_2, 4, (byte) 122);
                this.method5973(i_1 + 1, i_2 + 1, 64, (byte) 68);
            }
            if (i_4 == 2) {
                this.method5973(i_1, i_2, 16, (byte) 105);
                this.method5973(i_1 + 1, i_2 - 1, 1, (byte) 89);
            }
            if (i_4 == 3) {
                this.method5973(i_1, i_2, 64, (byte) 68);
                this.method5973(i_1 - 1, i_2 - 1, 4, (byte) 106);
            }
        }
        if (i_3 == 2) {
            if (i_4 == 0) {
                this.method5973(i_1, i_2, 130, (byte) 112);
                this.method5973(i_1 - 1, i_2, 8, (byte) 74);
                this.method5973(i_1, i_2 + 1, 32, (byte) 100);
            }
            if (i_4 == 1) {
                this.method5973(i_1, i_2, 10, (byte) 122);
                this.method5973(i_1, i_2 + 1, 32, (byte) 68);
                this.method5973(i_1 + 1, i_2, 128, (byte) 99);
            }
            if (i_4 == 2) {
                this.method5973(i_1, i_2, 40, (byte) 73);
                this.method5973(i_1 + 1, i_2, 128, (byte) 102);
                this.method5973(i_1, i_2 - 1, 2, (byte) 73);
            }
            if (i_4 == 3) {
                this.method5973(i_1, i_2, 160, (byte) 114);
                this.method5973(i_1, i_2 - 1, 2, (byte) 74);
                this.method5973(i_1 - 1, i_2, 8, (byte) 105);
            }
        }
        if (bool_5) {
            if (i_3 == 0) {
                if (i_4 == 0) {
                    this.method5973(i_1, i_2, 65536, (byte) 79);
                    this.method5973(i_1 - 1, i_2, 4096, (byte) 124);
                }
                if (i_4 == 1) {
                    this.method5973(i_1, i_2, 1024, (byte) 82);
                    this.method5973(i_1, i_2 + 1, 16384, (byte) 72);
                }
                if (i_4 == 2) {
                    this.method5973(i_1, i_2, 4096, (byte) 101);
                    this.method5973(i_1 + 1, i_2, 65536, (byte) 119);
                }
                if (i_4 == 3) {
                    this.method5973(i_1, i_2, 16384, (byte) 107);
                    this.method5973(i_1, i_2 - 1, 1024, (byte) 122);
                }
            }
            if (i_3 == 1 || i_3 == 3) {
                if (i_4 == 0) {
                    this.method5973(i_1, i_2, 512, (byte) 66);
                    this.method5973(i_1 - 1, i_2 + 1, 8192, (byte) 126);
                }
                if (i_4 == 1) {
                    this.method5973(i_1, i_2, 2048, (byte) 127);
                    this.method5973(i_1 + 1, i_2 + 1, 32768, (byte) 114);
                }
                if (i_4 == 2) {
                    this.method5973(i_1, i_2, 8192, (byte) 125);
                    this.method5973(i_1 + 1, i_2 - 1, 512, (byte) 84);
                }
                if (i_4 == 3) {
                    this.method5973(i_1, i_2, 32768, (byte) 116);
                    this.method5973(i_1 - 1, i_2 - 1, 2048, (byte) 91);
                }
            }
            if (i_3 == 2) {
                if (i_4 == 0) {
                    this.method5973(i_1, i_2, 66560, (byte) 70);
                    this.method5973(i_1 - 1, i_2, 4096, (byte) 88);
                    this.method5973(i_1, i_2 + 1, 16384, (byte) 121);
                }
                if (i_4 == 1) {
                    this.method5973(i_1, i_2, 5120, (byte) 66);
                    this.method5973(i_1, i_2 + 1, 16384, (byte) 101);
                    this.method5973(i_1 + 1, i_2, 65536, (byte) 85);
                }
                if (i_4 == 2) {
                    this.method5973(i_1, i_2, 20480, (byte) 125);
                    this.method5973(i_1 + 1, i_2, 65536, (byte) 107);
                    this.method5973(i_1, i_2 - 1, 1024, (byte) 118);
                }
                if (i_4 == 3) {
                    this.method5973(i_1, i_2, 81920, (byte) 91);
                    this.method5973(i_1, i_2 - 1, 1024, (byte) 69);
                    this.method5973(i_1 - 1, i_2, 4096, (byte) 123);
                }
            }
        }
        if (bool_6) {
            if (i_3 == 0) {
                if (i_4 == 0) {
                    this.method5973(i_1, i_2, 536870912, (byte) 122);
                    this.method5973(i_1 - 1, i_2, 33554432, (byte) 118);
                }
                if (i_4 == 1) {
                    this.method5973(i_1, i_2, 8388608, (byte) 81);
                    this.method5973(i_1, i_2 + 1, 134217728, (byte) 90);
                }
                if (i_4 == 2) {
                    this.method5973(i_1, i_2, 33554432, (byte) 106);
                    this.method5973(i_1 + 1, i_2, 536870912, (byte) 120);
                }
                if (i_4 == 3) {
                    this.method5973(i_1, i_2, 134217728, (byte) 89);
                    this.method5973(i_1, i_2 - 1, 8388608, (byte) 68);
                }
            }
            if (i_3 == 1 || i_3 == 3) {
                if (i_4 == 0) {
                    this.method5973(i_1, i_2, 4194304, (byte) 106);
                    this.method5973(i_1 - 1, i_2 + 1, 67108864, (byte) 82);
                }
                if (i_4 == 1) {
                    this.method5973(i_1, i_2, 16777216, (byte) 113);
                    this.method5973(i_1 + 1, i_2 + 1, 268435456, (byte) 101);
                }
                if (i_4 == 2) {
                    this.method5973(i_1, i_2, 67108864, (byte) 94);
                    this.method5973(i_1 + 1, i_2 - 1, 4194304, (byte) 106);
                }
                if (i_4 == 3) {
                    this.method5973(i_1, i_2, 268435456, (byte) 111);
                    this.method5973(i_1 - 1, i_2 - 1, 16777216, (byte) 69);
                }
            }
            if (i_3 == 2) {
                if (i_4 == 0) {
                    this.method5973(i_1, i_2, 545259520, (byte) 87);
                    this.method5973(i_1 - 1, i_2, 33554432, (byte) 118);
                    this.method5973(i_1, i_2 + 1, 134217728, (byte) 67);
                }
                if (i_4 == 1) {
                    this.method5973(i_1, i_2, 41943040, (byte) 106);
                    this.method5973(i_1, i_2 + 1, 134217728, (byte) 91);
                    this.method5973(i_1 + 1, i_2, 536870912, (byte) 123);
                }
                if (i_4 == 2) {
                    this.method5973(i_1, i_2, 167772160, (byte) 107);
                    this.method5973(i_1 + 1, i_2, 536870912, (byte) 90);
                    this.method5973(i_1, i_2 - 1, 8388608, (byte) 86);
                }
                if (i_4 == 3) {
                    this.method5973(i_1, i_2, 671088640, (byte) 122);
                    this.method5973(i_1, i_2 - 1, 8388608, (byte) 88);
                    this.method5973(i_1 - 1, i_2, 33554432, (byte) 102);
                }
            }
        }
    }

    static final void method6007(int i_0, int[] ints_1, int i_2) {
        if (MovingAnimation.isInterfaceLoaded(i_0, ints_1, 214426228)) {
            IComponentDefinitions[] arr_3 = Class468_Sub8.INTERFACES[i_0].components;
            for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
                IComponentDefinitions icomponentdefinitions_5 = arr_3[i_4];
                if (icomponentdefinitions_5 != null && icomponentdefinitions_5.aClass456_1437 != null) {
                    icomponentdefinitions_5.aClass456_1437.method7582((byte) -62);
                }
            }
        }
    }

    public static void method6008(boolean bool_0) {
        Class282_Sub48 class282_sub48_2;
        for (class282_sub48_2 = (Class282_Sub48) Class282_Sub48.aClass482_8073.head(); class282_sub48_2 != null; class282_sub48_2 = (Class282_Sub48) Class282_Sub48.aClass482_8073.next(-128319020)) {
            if (class282_sub48_2.aClass282_Sub15_Sub5_8099 != null) {
                Class79.aClass282_Sub15_Sub4_783.method15276(class282_sub48_2.aClass282_Sub15_Sub5_8099);
                class282_sub48_2.aClass282_Sub15_Sub5_8099 = null;
            }
            if (class282_sub48_2.aClass282_Sub15_Sub5_8096 != null) {
                Class79.aClass282_Sub15_Sub4_783.method15276(class282_sub48_2.aClass282_Sub15_Sub5_8096);
                class282_sub48_2.aClass282_Sub15_Sub5_8096 = null;
            }
            class282_sub48_2.remove();
        }
        if (bool_0) {
            for (class282_sub48_2 = (Class282_Sub48) Class282_Sub48.aClass482_8074.head(); class282_sub48_2 != null; class282_sub48_2 = (Class282_Sub48) Class282_Sub48.aClass482_8074.next(-938773769)) {
                if (class282_sub48_2.aClass282_Sub15_Sub5_8099 != null) {
                    Class79.aClass282_Sub15_Sub4_783.method15276(class282_sub48_2.aClass282_Sub15_Sub5_8099);
                    class282_sub48_2.aClass282_Sub15_Sub5_8099 = null;
                }
                class282_sub48_2.remove();
            }
            for (class282_sub48_2 = (Class282_Sub48) Class282_Sub48.aClass465_8075.method7750(856415350); class282_sub48_2 != null; class282_sub48_2 = (Class282_Sub48) Class282_Sub48.aClass465_8075.method7751((byte) 62)) {
                if (class282_sub48_2.aClass282_Sub15_Sub5_8099 != null) {
                    Class79.aClass282_Sub15_Sub4_783.method15276(class282_sub48_2.aClass282_Sub15_Sub5_8099);
                    class282_sub48_2.aClass282_Sub15_Sub5_8099 = null;
                }
                class282_sub48_2.remove();
            }
        }
    }
}
