package com.jagex;

public class Class366 implements Interface3 {

    public static short[][][] SKIN_COLORS;

    public int anInt4231;

    public Class60 method24() {
        return Class60.aClass60_609;
    }

    Class366(int i_1) {
        this.anInt4231 = i_1;
    }

    public Class60 method25() {
        return Class60.aClass60_609;
    }

    static void method6301(GraphicalRenderer graphicalrenderer_0, int i_1, int i_2, IComponentDefinitions icomponentdefinitions_3, int i_4) {
        for (int i_6 = 7; i_6 >= 0; --i_6) {
            for (int i_7 = 127; i_7 >= 0; --i_7) {
                int i_8 = (i_4 & 0x3f) << 10 | (i_6 & 0x7) << 7 | i_7 & 0x7f;
                SunDefinitions.method854(false, true, -1039964582);
                int i_9 = Class540.anIntArray7136[i_8];
                Class13.method508(false, true, -1893866080);
                graphicalrenderer_0.B((i_7 * icomponentdefinitions_3.width >> 7) + i_1, i_2 + ((7 - i_6) * icomponentdefinitions_3.height >> 3), (icomponentdefinitions_3.width >> 7) + 1, (icomponentdefinitions_3.height >> 3) + 1, i_9, 0);
            }
        }
    }

    static long method6302(CharSequence charsequence_0) {
        long long_2 = 0L;
        int i_4 = charsequence_0.length();
        for (int i_5 = 0; i_5 < i_4; i_5++) {
            long_2 *= 37L;
            char var_6 = charsequence_0.charAt(i_5);
            if (var_6 >= 65 && var_6 <= 90) {
                long_2 += var_6 + 1 - 65;
            } else if (var_6 >= 97 && var_6 <= 122) {
                long_2 += var_6 + 1 - 97;
            } else if (var_6 >= 48 && var_6 <= 57) {
                long_2 += var_6 + 27 - 48;
            }
            if (long_2 >= 177917621779460413L) {
                break;
            }
        }
        while (long_2 % 37L == 0L && long_2 != 0L) {
            long_2 /= 37L;
        }
        return long_2;
    }

    public static Class365 method6303(RsByteBuffer rsbytebuffer_0) {
        int i_2 = rsbytebuffer_0.readUnsignedByte();
        Class356 class356_3 = Class356.values()[rsbytebuffer_0.readUnsignedByte()];
        Class353 class353_4 = Class353.values()[rsbytebuffer_0.readUnsignedByte()];
        int i_5 = rsbytebuffer_0.readShort();
        int i_6 = rsbytebuffer_0.readShort();
        int i_7 = rsbytebuffer_0.readUnsignedShort();
        int i_8 = rsbytebuffer_0.readUnsignedShort();
        int i_9 = rsbytebuffer_0.readInt();
        int i_10 = rsbytebuffer_0.readInt();
        int i_11 = rsbytebuffer_0.readInt();
        boolean bool_12 = rsbytebuffer_0.readUnsignedByte() == 1;
        return new Class365(i_2, class356_3, class353_4, i_5, i_6, i_7, i_8, i_9, i_10, i_11, bool_12);
    }
}
