package com.jagex;

import java.util.HashMap;
import java.util.Map;

public enum ModelType {
	NONE(0),
	RAW_MODEL(1),
	NPC_HEAD(2),
	PLAYER_HEAD(3),
	ITEM(4),
	PLAYER_MODEL(5),
	NPC_MODEL(6),
	PLAYER_HEAD_IGNOREWORN(7),
	ITEM_CONTAINER_MALE(8),
	ITEM_CONTAINER_FEMALE(9);

	private static Map<Integer, ModelType> MAP = new HashMap<>();

	static {
		for (ModelType t : ModelType.values())
			MAP.put(t.id, t);
	}

	public static ModelType forId(int id) {
		return MAP.get(id);
	}

	private final int id;

	ModelType(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
