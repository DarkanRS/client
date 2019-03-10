public class Class282_Sub20_Sub17 extends Class282_Sub20 {

    int anInt9860;

    int[] method12319(int i_1, int i_2) {
        int[] ints_3 = this.aClass320_7667.method5721(i_1, -272864160);
        if (this.aClass320_7667.aBool3722) {
            Class503.method8365(ints_3, 0, Class316.anInt3670, this.anInt9860);
        }
        return ints_3;
    }

    Class282_Sub20_Sub17(int i_1) {
        super(0, true);
        this.anInt9860 = 4096;
        this.anInt9860 = i_1;
    }

    void method12322(int i_1, RsByteBuffer rsbytebuffer_2, int i_3) {
        switch(i_1) {
            case 0:
                this.anInt9860 = (rsbytebuffer_2.readUnsignedByte() << 12) / 255;
            default:
        }
    }

    public Class282_Sub20_Sub17() {
        this(4096);
    }
}
