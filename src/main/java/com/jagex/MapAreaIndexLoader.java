package com.jagex;

public class MapAreaIndexLoader {

	static boolean[] INTERFACES_LOADED;
	public static void method3709() {
		LRUCache softcache_2 = PlayerModel.aClass229_2920;
		synchronized (PlayerModel.aClass229_2920) {
			PlayerModel.aClass229_2920.method3858(5);
		}

		softcache_2 = PlayerModel.aClass229_2930;
		synchronized (PlayerModel.aClass229_2930) {
			PlayerModel.aClass229_2930.method3858(5);
		}
	}
	LRUCache aClass229_2707 = new LRUCache(128);
	LRUCache aClass229_2708 = new LRUCache(64);
	Index aClass317_2705;

	Index aClass317_2703;

	public MapAreaIndexLoader(Index index_3, Index index_4) {
		aClass317_2705 = index_3;
		aClass317_2703 = index_4;
		aClass317_2705.filesCount(SharedConfigsType.MAP_AREAS.id);
	}

	public MapAreaDefinitions getWorldMapDefs(int i_1) {
		LRUCache softcache_4 = aClass229_2707;
		MapAreaDefinitions worldmapareadefs_3;
		synchronized (aClass229_2707) {
			worldmapareadefs_3 = (MapAreaDefinitions) aClass229_2707.get(i_1);
		}

		if (worldmapareadefs_3 != null)
			return worldmapareadefs_3;
		Index index_5 = aClass317_2705;
		byte[] bytes_10;
		synchronized (aClass317_2705) {
			bytes_10 = aClass317_2705.getFile(SharedConfigsType.MAP_AREAS.id, i_1);
		}

		worldmapareadefs_3 = new MapAreaDefinitions();
		worldmapareadefs_3.anInt2753 = i_1;
		worldmapareadefs_3.aClass218_2716 = this;
		if (bytes_10 != null)
			worldmapareadefs_3.method3716(new ByteBuf(bytes_10));

		worldmapareadefs_3.method3718();
		LRUCache softcache_9 = aClass229_2707;
		synchronized (aClass229_2707) {
			aClass229_2707.put(worldmapareadefs_3, i_1);
			return worldmapareadefs_3;
		}
	}

	public void method3695() {
		LRUCache softcache_3 = aClass229_2707;
		synchronized (aClass229_2707) {
			aClass229_2707.method3858(5);
		}

		softcache_3 = aClass229_2708;
		synchronized (aClass229_2708) {
			aClass229_2708.method3858(5);
		}
	}

	public void method3696() {
		LRUCache softcache_2 = aClass229_2707;
		synchronized (aClass229_2707) {
			aClass229_2707.method3863();
		}

		softcache_2 = aClass229_2708;
		synchronized (aClass229_2708) {
			aClass229_2708.method3863();
		}
	}

	public void method3697(int i_1, int i_2) {
		aClass229_2707 = new LRUCache(i_1);
		aClass229_2708 = new LRUCache(i_2);
	}

	public void method3699() {
		LRUCache softcache_2 = aClass229_2707;
		synchronized (aClass229_2707) {
			aClass229_2707.method3859();
		}

		softcache_2 = aClass229_2708;
		synchronized (aClass229_2708) {
			aClass229_2708.method3859();
		}
	}

}
