package com.jagex;

public class Class80 {

    static byte[] aByteArray784 = {(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    int anInt785;
    int anInt790;
    int[] anIntArray793;
    long aLong786;
    int[] anIntArray787;
    int[] anIntArray788;
    int[] anIntArray796;
    Packet aNode_Sub35_792 = new Packet(null);

    Class80(byte[] bytes_1) {
        method1394(bytes_1);
    }

    Class80() {
    }

    void method1392(int i_1) {
        int i_2 = aNode_Sub35_792.method13099();
        anIntArray788[i_1] += i_2;
    }

    int method1393() {
        int i_1 = anIntArray787.length;
        int i_2 = -1;
        int i_3 = Integer.MAX_VALUE;

        for (int i_4 = 0; i_4 < i_1; i_4++) {
            if (anIntArray787[i_4] >= 0 && anIntArray788[i_4] < i_3) {
                i_2 = i_4;
                i_3 = anIntArray788[i_4];
            }
        }

        return i_2;
    }

    void method1394(byte[] bytes_1) {
        aNode_Sub35_792.buffer = bytes_1;
        aNode_Sub35_792.index = 10;
        int i_2 = aNode_Sub35_792.readUnsignedShort();
        anInt785 = aNode_Sub35_792.readUnsignedShort();
        anInt790 = 500000;
        anIntArray793 = new int[i_2];

        int i_3;
        int i_5;
        for (i_3 = 0; i_3 < i_2; aNode_Sub35_792.index += i_5) {
            int i_4 = aNode_Sub35_792.readInt();
            i_5 = aNode_Sub35_792.readInt();
            if (i_4 == 1297379947) {
                anIntArray793[i_3] = aNode_Sub35_792.index;
                ++i_3;
            }
        }

        aLong786 = 0L;
        anIntArray787 = new int[i_2];

        for (i_3 = 0; i_3 < i_2; i_3++) {
            anIntArray787[i_3] = anIntArray793[i_3];
        }

        anIntArray788 = new int[i_2];
        anIntArray796 = new int[i_2];
    }

    void method1395() {
        aNode_Sub35_792.buffer = null;
        anIntArray793 = null;
        anIntArray787 = null;
        anIntArray788 = null;
        anIntArray796 = null;
    }

    int method1397() {
        return anIntArray787.length;
    }

    void method1398(int i_1) {
        aNode_Sub35_792.index = anIntArray787[i_1];
    }

    void method1400() {
        aNode_Sub35_792.index = -1;
    }

    int method1401(int i_1) {
        int i_2 = method1423(i_1);
        return i_2;
    }

    long method1403(int i_1) {
        return aLong786 + (long) i_1 * anInt790;
    }

    void method1404(int i_1) {
        anIntArray787[i_1] = aNode_Sub35_792.index;
    }

    boolean method1405() {
        int i_1 = anIntArray787.length;

        for (int i_2 = 0; i_2 < i_1; i_2++) {
            if (anIntArray787[i_2] >= 0) {
                return false;
            }
        }

        return true;
    }

    void method1406(long long_1) {
        aLong786 = long_1;
        int i_3 = anIntArray787.length;

        for (int i_4 = 0; i_4 < i_3; i_4++) {
            anIntArray788[i_4] = 0;
            anIntArray796[i_4] = 0;
            aNode_Sub35_792.index = anIntArray793[i_4];
            method1392(i_4);
            anIntArray787[i_4] = aNode_Sub35_792.index;
        }

    }

    boolean method1409() {
        return aNode_Sub35_792.buffer != null;
    }

    int method1412(int i_1, int i_2) {
        int i_4;
        if (i_2 == 255) {
            int i_7 = aNode_Sub35_792.readUnsignedByte();
            i_4 = aNode_Sub35_792.method13099();
            if (i_7 == 47) {
                aNode_Sub35_792.index += i_4;
                return 1;
            } else if (i_7 == 81) {
                int i_5 = aNode_Sub35_792.read24BitUnsignedInteger();
                i_4 -= 3;
                int i_6 = anIntArray788[i_1];
                aLong786 += (long) i_6 * (anInt790 - i_5);
                anInt790 = i_5;
                aNode_Sub35_792.index += i_4;
                return 2;
            } else {
                aNode_Sub35_792.index += i_4;
                return 3;
            }
        } else {
            byte b_3 = aByteArray784[i_2 - 128];
            i_4 = i_2;
            if (b_3 >= 1) {
                i_4 = i_2 | aNode_Sub35_792.readUnsignedByte() << 8;
            }

            if (b_3 >= 2) {
                i_4 |= aNode_Sub35_792.readUnsignedByte() << 16;
            }

            return i_4;
        }
    }

    int method1423(int i_1) {
        byte b_2 = aNode_Sub35_792.buffer[aNode_Sub35_792.index];
        int i_5;
        if (b_2 < 0) {
            i_5 = b_2 & 0xff;
            anIntArray796[i_1] = i_5;
            ++aNode_Sub35_792.index;
        } else {
            i_5 = anIntArray796[i_1];
        }

        if (i_5 != 240 && i_5 != 247) {
            return method1412(i_1, i_5);
        } else {
            int i_3 = aNode_Sub35_792.method13099();
            if (i_5 == 247 && i_3 > 0) {
                int i_4 = aNode_Sub35_792.buffer[aNode_Sub35_792.index] & 0xff;
                if (i_4 >= 241 && i_4 <= 243 || i_4 == 246 || i_4 == 248 || i_4 >= 250 && i_4 <= 252 || i_4 == 254) {
                    ++aNode_Sub35_792.index;
                    anIntArray796[i_1] = i_4;
                    return method1412(i_1, i_4);
                }
            }

            aNode_Sub35_792.index += i_3;
            return 0;
        }
    }

}
