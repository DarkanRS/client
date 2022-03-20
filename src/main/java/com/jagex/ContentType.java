package com.jagex;

import java.util.HashMap;
import java.util.Map;

public enum ContentType {
   LOCAL_PLAYER_MODEL(328),
   MAIN_GAME_SCENE(1337),
   CONTENT_TYPE_1403(1403),
   CONTENT_TYPE_1338(1338),
   CONTENT_TYPE_1339(1339),
   CONTENT_TYPE_1400(1400),
   MINIMAP(1401),
   DEBUG_INFORMATION(1405),
   CONTENT_TYPE_1406(1406),
   CONTENT_TYPE_1407(1407),
   CONTENT_TYPE_1408(1408),
   CONTENT_TYPE_1409(1409);
	
	private static Map<Integer, ContentType> MAP = new HashMap<>();
	
	static {
		for (ContentType t : ContentType.values())
			MAP.put(t.id, t);
	}
	
	private int id;
	
	ContentType(int id) {
		this.id = id;
	}
	
    public static ContentType forId(int id) {
        return MAP.get(id);
    }
    
    public static boolean isGameSceneRelated(ContentType type) {
    	if (type == ContentType.CONTENT_TYPE_1338 || type == ContentType.CONTENT_TYPE_1406 || type == ContentType.MAIN_GAME_SCENE || type == ContentType.CONTENT_TYPE_1403)
    		return true;
    	return false;
    }
}
