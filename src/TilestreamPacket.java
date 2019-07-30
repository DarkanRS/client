public enum TilestreamPacket {

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
	
	public int id;

    TilestreamPacket(int i_1) {
    	this.id = i_1;
    }

    static final void method6292(int i_0, int i_1, int i_2, int i_3) {
        if (i_0 - i_2 >= Class532_Sub3.anInt7071 && i_0 + i_2 <= Class532_Sub3.anInt7069 && i_1 - i_2 >= Class532_Sub3.anInt7070 && i_2 + i_1 <= Class532_Sub3.anInt7068) {
            IdentitiKitIndexLoader.method813(i_0, i_1, i_2, i_3);
        } else {
            Class273.method4866(i_0, i_1, i_2, i_3);
        }
    }

//	public static TilestreamPacket[] values() {
//		return new TilestreamPacket[] { CUSTOMIZE_OBJECT, REMOVE_GROUND_ITEM, CREATE_GROUND_ITEM, DESTROY_OBJECT, CREATE_OBJECT, PROJECTILE, aClass364_4210, aClass364_4211, aClass364_4205, aClass364_4204, aClass364_4214, TILE_MESSAGE, aClass364_4216, aClass364_4217, aClass364_4218 };
//	}
}
