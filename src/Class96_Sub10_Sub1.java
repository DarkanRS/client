public class Class96_Sub10_Sub1 extends Class96_Sub10 {

    static int anInt10159;

    int anInt10157;

    int anInt10158;

    int anInt10156;

    public void method1601() {
        Class82.aClass75Array804[-2052083567 * this.anInt10157 * -1328934799].method1342((byte) 68).sendSpotAnim(this.anInt9296 * -1972436045 * 660169595, 277206935 * this.anInt9295 * 143267879 << 16, this.anInt9297 * 468728079 * 1009489391, -1634196889 * this.anInt10156 * 1239800151, false, -2011621393 * this.anInt10158 * 1183905551, -1087821934);
    }

    public void method1592() {
        Class82.aClass75Array804[this.anInt10157].method1342((byte) 72).sendSpotAnim(this.anInt9296, this.anInt9295 << 16, this.anInt9297, this.anInt10156, false, this.anInt10158, 1119829285);
    }

    Class96_Sub10_Sub1(RsByteBuffer rsbytebuffer_1) {
        super(rsbytebuffer_1);
        this.anInt10157 = rsbytebuffer_1.readUnsignedShort();
        this.anInt10158 = rsbytebuffer_1.readUnsignedByte();
        this.anInt10156 = rsbytebuffer_1.readUnsignedShort();
    }

    public static void setAnimationIndices(Index index_0, Index index_1) {
        AnimationFrameSet.ANIMATION_FRAMESET_INDEX = index_0;
        AnimationFrameSet.ANIMATION_FRAME_INDEX = index_1;
    }
}
