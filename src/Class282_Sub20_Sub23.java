public class Class282_Sub20_Sub23 extends Class282_Sub20 {

    boolean aBool9878 = true;

    boolean aBool9875 = true;

    int[] method12319(int i_1, int i_2) {
        int[] ints_3 = this.aClass320_7667.method5721(i_1, -1293135852);
        if (this.aClass320_7667.aBool3722) {
            int[] ints_4 = this.method12317(0, this.aBool9875 ? Class316.anInt3673 - i_1 : i_1, 1953683424);
            if (this.aBool9878) {
                for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
                    ints_3[i_5] = ints_4[Class316.anInt3669 - i_5];
                }
            } else {
                Class503.method8362(ints_4, 0, ints_3, 0, Class316.anInt3670);
            }
        }
        return ints_3;
    }

    int[][] method12320(int i_1, int i_2) {
        int[][] ints_3 = this.aClass308_7670.method5463(i_1, 2077005299);
        if (this.aClass308_7670.aBool3619) {
            int[][] ints_4 = this.method12333(0, this.aBool9875 ? Class316.anInt3673 - i_1 : i_1, (byte) 3);
            int[] ints_5 = ints_4[0];
            int[] ints_6 = ints_4[1];
            int[] ints_7 = ints_4[2];
            int[] ints_8 = ints_3[0];
            int[] ints_9 = ints_3[1];
            int[] ints_10 = ints_3[2];
            int i_11;
            if (this.aBool9878) {
                for (i_11 = 0; i_11 < Class316.anInt3670; i_11++) {
                    ints_8[i_11] = ints_5[Class316.anInt3669 - i_11];
                    ints_9[i_11] = ints_6[Class316.anInt3669 - i_11];
                    ints_10[i_11] = ints_7[Class316.anInt3669 - i_11];
                }
            } else {
                for (i_11 = 0; i_11 < Class316.anInt3670; i_11++) {
                    ints_8[i_11] = ints_5[i_11];
                    ints_9[i_11] = ints_6[i_11];
                    ints_10[i_11] = ints_7[i_11];
                }
            }
        }
        return ints_3;
    }

    void method12322(int i_1, RsByteBuffer rsbytebuffer_2, int i_3) {
        switch(i_1) {
            case 0:
                this.aBool9878 = rsbytebuffer_2.readUnsignedByte() == 1;
                break;
            case 1:
                this.aBool9875 = rsbytebuffer_2.readUnsignedByte() == 1;
                break;
            case 2:
                this.aBool7669 = rsbytebuffer_2.readUnsignedByte() == 1;
        }
    }

    public Class282_Sub20_Sub23() {
        super(1, false);
    }
}
