package com.rs.jagex;

import java.awt.*;

public class UnderlayIndexLoader {

	static void method8036(int i_0) {
		int i_01 = i_0;
		if (Class393.preferences.customCursors.method12675() == 0)
			i_01 = -1;
		if (i_01 != client.CURRENT_CURSOR) {
			if (i_01 != -1) {
				CursorDefintions class419_2 = IndexLoaders.CURSOR_LOADER.method7325(i_01);
				SpriteDefinitions class91_3 = class419_2.getSprite();
				if (class91_3 != null) {
					MeshModifier.aClass267_5026.setCustomCursor(Class351.gameCanvas, class91_3.getPixels(), class91_3.getMaxWidth(), class91_3.getMaxHeight(), new Point(class419_2.anInt5002, class419_2.anInt5000));
					client.CURRENT_CURSOR = i_01;
				} else
					i_01 = -1;
			}
			if (i_01 == -1 && client.CURRENT_CURSOR != -1) {
				MeshModifier.aClass267_5026.setCustomCursor(Class351.gameCanvas, null, -1, -1, new Point());
				client.CURRENT_CURSOR = -1;
			}
		}
	}

	public static Class494[] method8038() {
		return new Class494[]{Class494.aClass494_5784, Class494.aClass494_5792, Class494.aClass494_5787, Class494.aClass494_5789, Class494.aClass494_5786, Class494.aClass494_5782, Class494.aClass494_5788, Class494.aClass494_5779, Class494.aClass494_5790, Class494.aClass494_5783, Class494.aClass494_5791, Class494.aClass494_5781, Class494.aClass494_5785, Class494.aClass494_5780};
	}

	LRUCache cache = new LRUCache(128);

	Index configIndex;

	public UnderlayIndexLoader(Index index_3) {
		configIndex = index_3;
		configIndex.filesCount(SharedConfigsType.UNDERLAYS.id);
	}

	public UnderlayDef getUnderlayDef(int i_1) {
		LRUCache softcache_4 = cache;
		UnderlayDef underlaydef_3;
		synchronized (cache) {
			underlaydef_3 = (UnderlayDef) cache.get(i_1);
		}
		if (underlaydef_3 != null)
			return underlaydef_3;
		Index index_5 = configIndex;
		byte[] bytes_10;
		synchronized (configIndex) {
			bytes_10 = configIndex.getFile(SharedConfigsType.UNDERLAYS.id, i_1);
		}
		underlaydef_3 = new UnderlayDef();
		if (bytes_10 != null)
			underlaydef_3.decode(new ByteBuf(bytes_10));
		LRUCache softcache_9 = cache;
		synchronized (cache) {
			cache.put(underlaydef_3, i_1);
			return underlaydef_3;
		}
	}

	public void method8026() {
		LRUCache softcache_2 = cache;
		synchronized (cache) {
			cache.method3859();
		}
	}

	public void method8030() {
		LRUCache softcache_3 = cache;
		synchronized (cache) {
			cache.method3858(5);
		}
	}

	public void method8032() {
		LRUCache softcache_2 = cache;
		synchronized (cache) {
			cache.method3863();
		}
	}
}
