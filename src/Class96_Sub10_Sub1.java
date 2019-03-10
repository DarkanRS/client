public class Class96_Sub10_Sub1 extends Class96_Sub10 {

    static int anInt10159;

    int anInt10157;

    int anInt10158;

    int anInt10156;

    public void method1601() {
        Class82.aClass75Array804[-2052083567 * this.anInt10157 * -1328934799].method1342((byte) 68).sendSpotAnim(this.anInt9296 * -1972436045 * 660169595, 277206935 * this.anInt9295 * 143267879 << 16, this.anInt9297 * 468728079 * 1009489391, -1634196889 * this.anInt10156 * 1239800151, false, -2011621393 * this.anInt10158 * 1183905551, -1087821934);
    }

    public void method1592(int i_1) {
        Class82.aClass75Array804[this.anInt10157].method1342((byte) 72).sendSpotAnim(this.anInt9296, this.anInt9295 << 16, this.anInt9297, this.anInt10156, false, this.anInt10158, 1119829285);
    }

    Class96_Sub10_Sub1(RsByteBuffer rsbytebuffer_1) {
        super(rsbytebuffer_1);
        this.anInt10157 = rsbytebuffer_1.readUnsignedShort();
        this.anInt10158 = rsbytebuffer_1.readUnsignedByte();
        this.anInt10156 = rsbytebuffer_1.readUnsignedShort();
    }

    static final void method15553(boolean bool_0, CS2Executor cs2executor_1, int i_2) {
        int i_3 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
        IComponentDefinitions icomponentdefinitions_4 = Class117.method1981(i_3, (byte) 11);
        Interface interface_5 = Class468_Sub8.aClass98Array7889[i_3 >> 16];
        if (bool_0) {
            Class455.method7554(interface_5, icomponentdefinitions_4, 1019153265);
        } else {
            WorldMapIndexLoader.method3710(interface_5, icomponentdefinitions_4, 983481657);
        }
    }

    public static void setAnimationIndices(Index index_0, Index index_1, int i_2, int i_3) {
        AnimationFrameSet.ANIMATION_FRAMESET_INDEX = index_0;
        AnimationFrameSet.ANIMATION_FRAME_INDEX = index_1;
    }
}
