package com.rs.jagex;

import java.util.HashMap;
import java.util.Map;

public enum UpdateZonePacket {

	CUSTOMIZE_OBJECT(ServerProt.CUSTOMIZE_OBJECT, -1),
	REMOVE_GROUND_ITEM(ServerProt.REMOVE_GROUND_ITEM, 3),
	CREATE_GROUND_ITEM(ServerProt.CREATE_GROUND_ITEM, 5),
	DESTROY_OBJECT(ServerProt.DESTROY_OBJECT, 2),
	CREATE_OBJECT(ServerProt.CREATE_OBJECT, 6),
	MAP_PROJANIM(ServerProt.MAP_PROJANIM, 16),
	MAP_PROJANIM_HALFSQ(ServerProt.MAP_PROJANIM_HALFSQ, 19),
	OBJECT_PREFETCH(ServerProt.OBJECT_PREFETCH, 5),
	GROUND_ITEM_REVEAL(ServerProt.GROUND_ITEM_REVEAL, 7),
	GROUND_ITEM_COUNT(ServerProt.GROUND_ITEM_COUNT, 7),
	MIDI_SONG_LOCATION(ServerProt.MIDI_SONG_LOCATION, 8),
	TILE_MESSAGE(ServerProt.TILE_MESSAGE, -1),
	OBJ_ANIM(ServerProt.OBJ_ANIM, 6),
	SOUND_AREA(null, 9),
	SPOT_ANIM(ServerProt.SPOT_ANIM, 8);

	static void method6292(int i_0, int i_1, int i_2, int i_3) {
		if (i_0 - i_2 >= Class532.anInt7071 && i_0 + i_2 <= Class532.anInt7069 && i_1 - i_2 >= Class532.anInt7070 && i_2 + i_1 <= Class532.anInt7068)
			IdentiKitIndexLoader.method813(i_0, i_1, i_2, i_3);
		else
			FPSManager.method4866(i_0, i_1, i_2, i_3);
	}

	static Map<ServerProt, UpdateZonePacket> MAPPING = new HashMap<>();

	static {
		for (UpdateZonePacket p : UpdateZonePacket.values())
			if (p.basePacket != null)
				MAPPING.put(p.basePacket, p);
	}

	public static UpdateZonePacket forServerPacket(ServerProt basePacket) {
		return MAPPING.get(basePacket);
	}

	public ServerProt basePacket;
	public final int size;

	UpdateZonePacket(ServerProt basePacket, int size) {
		this.basePacket = basePacket;
		this.size = size;
	}
}
