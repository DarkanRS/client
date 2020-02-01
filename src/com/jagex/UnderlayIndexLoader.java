package com.jagex;
import java.awt.Point;

public class UnderlayIndexLoader {

	SoftCache cache = new SoftCache(128);

	Index configIndex;

	public UnderlayDef getUnderlayDef(int i_1) {
		SoftCache softcache_4 = this.cache;
		UnderlayDef underlaydef_3;
		synchronized (this.cache) {
			underlaydef_3 = (UnderlayDef) this.cache.get((long) i_1);
		}
		if (underlaydef_3 != null) {
			return underlaydef_3;
		} else {
			Index index_5 = this.configIndex;
			byte[] bytes_10;
			synchronized (this.configIndex) {
				bytes_10 = this.configIndex.getFile(SharedConfigsType.UNDERLAYS.id, i_1);
			}
			underlaydef_3 = new UnderlayDef();
			if (bytes_10 != null) {
				underlaydef_3.method8050(new RsByteBuffer(bytes_10));
			}
			SoftCache softcache_9 = this.cache;
			synchronized (this.cache) {
				this.cache.put(underlaydef_3, (long) i_1);
				return underlaydef_3;
			}
		}
	}

	public void method8026() {
		SoftCache softcache_2 = this.cache;
		synchronized (this.cache) {
			this.cache.method3859();
		}
	}

	public UnderlayIndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
		this.configIndex = index_3;
		this.configIndex.filesCount(SharedConfigsType.UNDERLAYS.id);
	}

	public void method8030() {
		SoftCache softcache_3 = this.cache;
		synchronized (this.cache) {
			this.cache.method3858(5);
		}
	}

	public void method8032() {
		SoftCache softcache_2 = this.cache;
		synchronized (this.cache) {
			this.cache.method3863();
		}
	}

	static void method8036(int i_0) {
		if (Class393.preferences.customCursors.method12675() == 0) {
			i_0 = -1;
		}
		if (i_0 != client.CURRENT_CURSOR) {
			if (i_0 != -1) {
				CursorDefintions class419_2 = IndexLoaders.CURSOR_LOADER.method7325(i_0);
				SpriteDefinitions class91_3 = class419_2.getSprite();
				if (class91_3 != null) {
					MeshModifier.aClass267_5026.setCustomCursor(Class351.gameCanvas, class91_3.method1528(), class91_3.method1519(), class91_3.method1520(), new Point(class419_2.anInt5002, class419_2.anInt5000));
					client.CURRENT_CURSOR = i_0;
				} else {
					i_0 = -1;
				}
			}
			if (i_0 == -1 && client.CURRENT_CURSOR != -1) {
				MeshModifier.aClass267_5026.setCustomCursor(Class351.gameCanvas, (int[]) null, -1, -1, new Point());
				client.CURRENT_CURSOR = -1;
			}
		}
	}

	public static Class494[] method8038() {
		return new Class494[] { Class494.aClass494_5784, Class494.aClass494_5792, Class494.aClass494_5787, Class494.aClass494_5789, Class494.aClass494_5786, Class494.aClass494_5782, Class494.aClass494_5788, Class494.aClass494_5779, Class494.aClass494_5790, Class494.aClass494_5783, Class494.aClass494_5791, Class494.aClass494_5781, Class494.aClass494_5785, Class494.aClass494_5780 };
	}
}
