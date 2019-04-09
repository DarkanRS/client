public class Class388 implements Interface41 {

    static Index INTERFACE_INDEX;

    public static int anInt4722;

    public static int anInt4723;

    Index aClass317_4720;

    String aString4719;

    public Class445 method234() {
        return Class445.aClass445_5382;
    }

    public Class445 method232() {
        return Class445.aClass445_5382;
    }

    Class388(Index index_1) {
        this.aClass317_4720 = index_1;
        this.aString4719 = "details";
    }

    public int method231() {
        return this.aClass317_4720.method5629(this.aString4719) ? 100 : this.aClass317_4720.method5631(this.aString4719, (byte) 58);
    }

    public Class445 method230() {
        return Class445.aClass445_5382;
    }

    public Class445 method233() {
        return Class445.aClass445_5382;
    }

    public int getCompletion() {
        return this.aClass317_4720.method5629(this.aString4719) ? 100 : this.aClass317_4720.method5631(this.aString4719, (byte) 25);
    }

    public Class445 method235() {
        return Class445.aClass445_5382;
    }

    static void method6692(int i_0) {
        TCPPacket tcpmessage_1 = Class271.createPacket(OutgoingPacket.SCREEN_SIZE, client.outputContext.isaac);
        tcpmessage_1.buffer.writeByte(Class158.windowedMode());
        tcpmessage_1.buffer.writeShort(Class349.anInt4083);
        tcpmessage_1.buffer.writeShort(client.anInt3243 * -969250379);
        tcpmessage_1.buffer.writeByte(Class393.preferences.aClass468_Sub4_8223.method12641(-965992195));
        client.outputContext.queuePacket(tcpmessage_1);
    }

    static boolean method6693(int i_0) {
        return client.gameState != 5 ? false : !JS5CacheFile.method3360((byte) 103) && !Class85.method1466(-611019435);
    }

    static void method6694(Class200 class200_0, int i_1, int i_2, int i_3, MeshRasterizer meshrasterizer_4, int i_5) {
        if (meshrasterizer_4 != null) {
            class200_0.method3253(i_1, i_2, i_3, meshrasterizer_4.N(), meshrasterizer_4.RA(), meshrasterizer_4.ya(), meshrasterizer_4.YA(), meshrasterizer_4.o(), meshrasterizer_4.AA(), meshrasterizer_4.ha());
        }
    }
}
