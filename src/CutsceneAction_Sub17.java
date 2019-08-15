public class CutsceneAction_Sub17 extends CutsceneAction {

    int anInt9385;

    int anInt9386;

    String aString9387;

    int anInt9388;

    int anInt9389;

    CutsceneAction_Sub17(RsByteBuffer rsbytebuffer_1) {
        super(rsbytebuffer_1);
        this.anInt9385 = rsbytebuffer_1.readUnsignedShort();
        this.anInt9386 = rsbytebuffer_1.readUnsignedShort();
        this.aString9387 = rsbytebuffer_1.readString();
        this.anInt9388 = rsbytebuffer_1.readInt();
        this.anInt9389 = rsbytebuffer_1.readUnsignedShort();
    }

    public void method1592() {
        ParticleProducerDefinition.method1161(Class4.MY_PLAYER_PLANE, this.anInt9385, this.anInt9386, Class504.getTerrainHeightAtPos(this.anInt9385, this.anInt9386, Class4.MY_PLAYER_PLANE), this.anInt9389, this.anInt9388, this.aString9387, (short) 12244);
    }

    public void method1601() {
        ParticleProducerDefinition.method1161(Class4.MY_PLAYER_PLANE * -647602067 * 675588453, 31133705 * this.anInt9385 * -1930592711, this.anInt9386 * -621881623 * -2086575783, Class504.getTerrainHeightAtPos(31133705 * this.anInt9385 * -1930592711, -2086575783 * this.anInt9386 * -621881623, 675588453 * Class4.MY_PLAYER_PLANE * -647602067), this.anInt9389 * -159499065 * -469908233, this.anInt9388 * -1475639137 * 882611039, this.aString9387, (short) 20309);
    }

    public static void method14656(int i_0) {
        PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(20, (long) i_0);
        class282_sub50_sub12_2.method14965((byte) 40);
    }
}
