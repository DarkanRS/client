public abstract class Class282_Sub20 extends Node {

    int anInt7668;

    protected Class308 aClass308_7670;

    protected Class320 aClass320_7667;

    protected boolean aBool7669;

    Class282_Sub20[] aClass282_Sub20Array7671;

    void method12315(int i_1, int i_2, byte b_3) {
        int i_4 = this.anInt7668 == 255 ? i_2 : this.anInt7668;
        if (this.aBool7669) {
            this.aClass320_7667 = new Class320(i_4, i_2, i_1);
        } else {
            this.aClass308_7670 = new Class308(i_4, i_2, i_1);
        }
    }

    final int[] method12317(int i_1, int i_2, int i_3) {
        return !this.aClass282_Sub20Array7671[i_1].aBool7669 ? this.aClass282_Sub20Array7671[i_1].method12320(i_2, -1507861387)[0] : this.aClass282_Sub20Array7671[i_1].method12319(i_2, 752457538);
    }

    int[] method12319(int i_1, int i_2) {
        throw new IllegalStateException();
    }

    int[][] method12320(int i_1, int i_2) {
        throw new IllegalStateException();
    }

    void method12321(int i_1) {
    }

    void method12322(int i_1, RsByteBuffer rsbytebuffer_2, int i_3) {
    }

    int method12323(int i_1) {
        return -1;
    }

    int method12324(byte b_1) {
        return -1;
    }

    void method12326(int i_1) {
        if (this.aBool7669) {
            this.aClass320_7667.method5720((byte) 8);
            this.aClass320_7667 = null;
        } else {
            this.aClass308_7670.method5462((byte) 0);
            this.aClass308_7670 = null;
        }
    }

    final int[][] method12333(int i_1, int i_2, byte b_3) {
        if (this.aClass282_Sub20Array7671[i_1].aBool7669) {
            int[] ints_4 = this.aClass282_Sub20Array7671[i_1].method12319(i_2, 752457538);
            int[][] ints_5 = new int[][] { ints_4, ints_4, ints_4 };
            return ints_5;
        } else {
            return this.aClass282_Sub20Array7671[i_1].method12320(i_2, 1247848050);
        }
    }

    Class282_Sub20(int i_1, boolean bool_2) {
        this.aBool7669 = bool_2;
        this.aClass282_Sub20Array7671 = new Class282_Sub20[i_1];
    }
}
