package com.jagex;

public class CursorDefintions {

    static NativeSprite aNativeSprite_5004;
    public int anInt5002;
    public int anInt5000;
    CursorIndexLoader loader;
    int spriteId;

    void method7024(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }

            method7025(rsbytebuffer_1, i_3);
        }
    }

    void method7025(ByteBuf rsbytebuffer_1, int i_2) {
        if (i_2 == 1) {
            spriteId = rsbytebuffer_1.readBigSmart();
        } else if (i_2 == 2) {
            anInt5002 = rsbytebuffer_1.readUnsignedByte();
            anInt5000 = rsbytebuffer_1.readUnsignedByte();
        }

    }

    public synchronized SpriteDefinitions getSprite() {
        SpriteDefinitions class91_2 = (SpriteDefinitions) loader.aClass229_5342.get(spriteId);
        if (class91_2 == null) {
            class91_2 = SpriteDefinitions.getSprite(loader.spritesIndex, spriteId, 0);
            if (class91_2 != null) {
                loader.aClass229_5342.put(class91_2, spriteId);
            }

        }
        return class91_2;
    }

}
