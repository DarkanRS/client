package com.jagex;

import com.jagex.clans.settings.ChangeClanSetting;

public class Class388 implements Interface41 {

    public static int anInt4722;
    public static int anInt4723;
    static Index INTERFACE_INDEX;
    Index aClass317_4720;

    String aString4719;

    Class388(Index index_1) {
        aClass317_4720 = index_1;
        aString4719 = "details";
    }

    static void method6692() {
        TCPPacket tcpmessage_1 = TCPPacket.createPacket(ClientProt.SCREEN_SIZE, client.GAME_CONNECTION_CONTEXT.outKeys);
        tcpmessage_1.buffer.writeByte(Class158.getScreenMode());
        tcpmessage_1.buffer.writeShort(ChangeClanSetting.BASE_WINDOW_WIDTH);
        tcpmessage_1.buffer.writeShort(client.BASE_WINDOW_HEIGHT * -969250379);
        tcpmessage_1.buffer.writeByte(Class393.preferences.aPreference_Sub4_8223.method12641());
        client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_1);
    }

    static boolean method6693() {
        return client.GAME_STATE == GameState.UNK_5 && (!JS5CacheFile.method3360() && !Class85.method1466());
    }

    static void method6694(Class200 class200_0, int i_1, int i_2, int i_3, MeshRasterizer meshrasterizer_4) {
        if (meshrasterizer_4 != null) {
            class200_0.method3253(i_1, i_2, i_3, meshrasterizer_4.N(), meshrasterizer_4.RA(), meshrasterizer_4.ya(), meshrasterizer_4.YA(), meshrasterizer_4.o(), meshrasterizer_4.AA(), meshrasterizer_4.ha());
        }
    }

    @Override
    public Class445 method234() {
        return Class445.aClass445_5382;
    }

    @Override
    public Class445 method232() {
        return Class445.aClass445_5382;
    }

    @Override
    public int method231() {
        return aClass317_4720.method5629(aString4719) ? 100 : aClass317_4720.method5631(aString4719);
    }

    @Override
    public Class445 method230() {
        return Class445.aClass445_5382;
    }

    @Override
    public Class445 method233() {
        return Class445.aClass445_5382;
    }

    @Override
    public int getCompletion() {
        return aClass317_4720.method5629(aString4719) ? 100 : aClass317_4720.method5631(aString4719);
    }

    @Override
    public Class445 method235() {
        return Class445.aClass445_5382;
    }
}
