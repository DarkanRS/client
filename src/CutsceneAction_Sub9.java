public class CutsceneAction_Sub9 extends CutsceneAction {

    static AccountCreationResponseOpcodes RECIEVED_RESPONSE;

    static int anInt9282;

    int anInt9280;

    int anInt9279;

    Class116 aClass116_9281;

    CutsceneAction_Sub9(RsByteBuffer rsbytebuffer_1) {
        super(rsbytebuffer_1);
        this.anInt9280 = rsbytebuffer_1.readUnsignedShort();
        this.anInt9279 = rsbytebuffer_1.readUnsignedByte();
    }

    boolean method1599() {
        if (this.aClass116_9281 == null) {
            this.aClass116_9281 = new Class116(IndexLoaders.MUSIC_INDEX, this.anInt9280);
        }
        return this.aClass116_9281.method1963();
    }

    public void method1601() {
        Class256.method4412(this.aClass116_9281, 68269153 * this.anInt9279 * -321392735, 1541193543);
    }

    public void method1592() {
        Class256.method4412(this.aClass116_9281, this.anInt9279, 1212110524);
    }

    public static boolean method14585(int i_0) {
        return i_0 == (i_0 & -i_0);
    }
}
