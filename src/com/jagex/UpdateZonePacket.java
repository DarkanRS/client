package com.jagex;

public enum UpdateZonePacket {

    CUSTOMIZE_OBJECT(-1),
    REMOVE_GROUND_ITEM(3),
    CREATE_GROUND_ITEM(5),
    DESTROY_OBJECT(2),
    CREATE_OBJECT(6),
    MAP_PROJANIM(16),
    MAP_PROJANIM_HALFSQ(19),
    OBJECT_PREFETCH(5),
    GROUND_ITEM_REVEAL(7),
    GROUND_ITEM_COUNT(7),
    MIDI_SONG_LOCATION(8),
    TILE_MESSAGE(-1),
    OBJ_ANIM(6),
    SOUND_AREA(9),
    SPOT_ANIM(8);

    public final int size;

    UpdateZonePacket(int size) {
        this.size = size;
    }

    static void method6292(int i_0, int i_1, int i_2, int i_3) {
        if (i_0 - i_2 >= Class532_Sub3.anInt7071 && i_0 + i_2 <= Class532_Sub3.anInt7069 && i_1 - i_2 >= Class532_Sub3.anInt7070 && i_2 + i_1 <= Class532_Sub3.anInt7068) {
            IdentiKitIndexLoader.method813(i_0, i_1, i_2, i_3);
        } else {
            FPSManager.method4866(i_0, i_1, i_2, i_3);
        }
    }
}
