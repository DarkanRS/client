package com.jagex;

public class MapSpriteDefinitions {

    public static int WORLD_LIST_IDK;
    public int anInt4995;
    public int anInt4997;
    public boolean aBool4996;
    MapSpriteIndexLoader aClass427_4998;

    static void method7022() {
        Class9.lobbyStage = 273;
        Class9.CURRENT_CONNECTION_CONTEXT = client.GAME_CONNECTION_CONTEXT;
        if (client.aByteArray7152 != null) {
            ByteBuf rsbytebuffer_1 = new ByteBuf(client.aByteArray7152);
            Class9.aLong77 = rsbytebuffer_1.readLong();
            Class9.aLong86 = rsbytebuffer_1.readLong();
        }
        if (Class9.aLong77 < 0L) {
            FontRenderer_Sub1.method13784(35);
        } else {
            Class455.method7558(false, true, "", "", Class9.aLong77);
        }
    }

    void method7008(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            method7009(rsbytebuffer_1, i_3);
        }
    }

    void method7009(ByteBuf rsbytebuffer_1, int i_2) {
        if (i_2 == 1) {
            anInt4995 = rsbytebuffer_1.readBigSmart();
        } else if (i_2 == 2) {
            anInt4997 = rsbytebuffer_1.read24BitUnsignedInteger();
        } else if (i_2 == 3) {
            aBool4996 = true;
        } else if (i_2 == 4) {
            anInt4995 = -1;
        }
    }

    public NativeSprite method7010(AbstractRenderer graphicalrenderer_1, int i_2, boolean bool_3) {
        long long_5 = anInt4995 | i_2 << 16 | (bool_3 ? 262144 : 0) | graphicalrenderer_1.rendererId << 19;
        NativeSprite nativesprite_7 = (NativeSprite) aClass427_4998.aClass229_5122.get(long_5);
        if (nativesprite_7 != null) {
            return nativesprite_7;
        } else if (!aClass427_4998.aClass317_5118.loadFile(anInt4995)) {
            return null;
        } else {
            SpriteDefinitions class91_8 = SpriteDefinitions.getSprite(aClass427_4998.aClass317_5118, anInt4995, 0);
            if (class91_8 != null) {
                class91_8.minY = 0;
                class91_8.anInt958 = 0;
                class91_8.minX = 0;
                class91_8.anInt953 = 0;
                if (bool_3) {
                    class91_8.method1526();
                }
                for (int i_12 = 0; i_12 < i_2; i_12++) {
                    class91_8.method1527();
                }
            }
            nativesprite_7 = graphicalrenderer_1.method8444(class91_8, true);
            if (nativesprite_7 != null) {
                aClass427_4998.aClass229_5122.put(nativesprite_7, long_5);
            }
            return nativesprite_7;
        }
    }

    public boolean method7015() {
        return aClass427_4998.aClass317_5118.loadFile(anInt4995);
    }
}
