import java.util.BitSet;

public class Class282_Sub4 extends Node {

    boolean aBool7498 = true;

    public int anInt7503 = 0;

    public String aString7501 = null;

    int[] anIntArray7500;

    public Class57[] aClass57Array7499;

    boolean aBool7505;

    long aLong7502;

    public byte aByte7497;

    public byte aByte7504;

    static {
        new BitSet(65536);
    }

    public Class282_Sub4(RsByteBuffer rsbytebuffer_1) {
        this.method12099(rsbytebuffer_1, 1015432776);
    }

    public int[] method12095(int i_1) {
        if (this.anIntArray7500 == null) {
            String[] arr_2 = new String[this.anInt7503];
            this.anIntArray7500 = new int[this.anInt7503];
            for (int i_3 = 0; i_3 < this.anInt7503; this.anIntArray7500[i_3] = i_3++) {
                arr_2[i_3] = this.aClass57Array7499[i_3].aString524;
            }
            Class111.method1865(arr_2, this.anIntArray7500, 413972480);
        }
        return this.anIntArray7500;
    }

    void method12096(int i_1, byte b_2) {
        --this.anInt7503;
        if (this.anInt7503 == 0) {
            this.aClass57Array7499 = null;
        } else {
            Class503.method8359(this.aClass57Array7499, i_1 + 1, this.aClass57Array7499, i_1, this.anInt7503 - i_1);
        }
        this.anIntArray7500 = null;
    }

    public int method12098(String string_1, int i_2) {
        for (int i_3 = 0; i_3 < this.anInt7503; i_3++) {
            if (this.aClass57Array7499[i_3].aString524.equalsIgnoreCase(string_1)) {
                return i_3;
            }
        }
        return -1;
    }

    void method12099(RsByteBuffer rsbytebuffer_1, int i_2) {
        int i_3 = rsbytebuffer_1.readUnsignedByte();
        if ((i_3 & 0x1) != 0) {
            this.aBool7505 = true;
        }
        if ((i_3 & 0x2) != 0) {
            this.aBool7498 = true;
        }
        this.data = rsbytebuffer_1.readLong(181951412);
        this.aLong7502 = rsbytebuffer_1.readLong(456385505);
        this.aString7501 = rsbytebuffer_1.readString();
        rsbytebuffer_1.readUnsignedByte();
        this.aByte7497 = rsbytebuffer_1.readByte();
        this.aByte7504 = rsbytebuffer_1.readByte();
        this.anInt7503 = rsbytebuffer_1.readUnsignedShort();
        if (this.anInt7503 > 0) {
            this.aClass57Array7499 = new Class57[this.anInt7503];
            for (int i_4 = 0; i_4 < this.anInt7503; i_4++) {
                Class57 class57_5 = new Class57();
                if (this.aBool7505) {
                    rsbytebuffer_1.readLong(-77478356);
                }
                if (this.aBool7498) {
                    class57_5.aString524 = rsbytebuffer_1.readString();
                }
                class57_5.aByte525 = rsbytebuffer_1.readByte();
                class57_5.anInt526 = rsbytebuffer_1.readUnsignedShort();
                this.aClass57Array7499[i_4] = class57_5;
            }
        }
    }

    void method12105(Class57 class57_1, byte b_2) {
        if (this.aClass57Array7499 == null || this.anInt7503 >= this.aClass57Array7499.length) {
            this.method12112(this.anInt7503 + 5, (byte) 1);
        }
        this.aClass57Array7499[++this.anInt7503 - 1] = class57_1;
        this.anIntArray7500 = null;
    }

    void method12112(int i_1, byte b_2) {
        if (this.aClass57Array7499 != null) {
            Class503.method8359(this.aClass57Array7499, 0, this.aClass57Array7499 = new Class57[i_1], 0, this.anInt7503);
        } else {
            this.aClass57Array7499 = new Class57[i_1];
        }
    }

    public static void method12114(int i_0, int i_1) {
        if (i_0 == 37) {
            Class291_Sub1.aFloat3462 = 3.0F;
        } else if (i_0 == 50) {
            Class291_Sub1.aFloat3462 = 4.0F;
        } else if (i_0 == 75) {
            Class291_Sub1.aFloat3462 = 6.0F;
        } else if (i_0 == 100) {
            Class291_Sub1.aFloat3462 = 8.0F;
        } else if (i_0 == 200) {
            Class291_Sub1.aFloat3462 = 16.0F;
        }
        Class291_Sub1.anInt8016 = -1;
        Class291_Sub1.anInt8016 = -1;
    }

    static void method12117(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        if (i_0 == i_2 && i_3 == i_1 && i_4 == i_6 && i_5 == i_7) {
            AnimationIndexLoader.method11220(i_0, i_1, i_6, i_7, i_8, (byte) 47);
        } else {
            int i_10 = i_0;
            int i_11 = i_1;
            int i_12 = i_0 * 3;
            int i_13 = i_1 * 3;
            int i_14 = i_2 * 3;
            int i_15 = i_3 * 3;
            int i_16 = i_4 * 3;
            int i_17 = i_5 * 3;
            int i_18 = i_6 - i_16 + i_14 - i_0;
            int i_19 = i_15 + (i_7 - i_17) - i_1;
            int i_20 = i_12 + (i_16 - i_14 - i_14);
            int i_21 = i_13 + (i_17 - i_15 - i_15);
            int i_22 = i_14 - i_12;
            int i_23 = i_15 - i_13;
            for (int i_24 = 128; i_24 <= 4096; i_24 += 128) {
                int i_25 = i_24 * i_24 >> 12;
                int i_26 = i_25 * i_24 >> 12;
                int i_27 = i_18 * i_26;
                int i_28 = i_26 * i_19;
                int i_29 = i_20 * i_25;
                int i_30 = i_25 * i_21;
                int i_31 = i_24 * i_22;
                int i_32 = i_24 * i_23;
                int i_33 = i_0 + (i_29 + i_27 + i_31 >> 12);
                int i_34 = (i_28 + i_30 + i_32 >> 12) + i_1;
                AnimationIndexLoader.method11220(i_10, i_11, i_33, i_34, i_8, (byte) 85);
                i_10 = i_33;
                i_11 = i_34;
            }
        }
    }
}
