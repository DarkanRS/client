package com.jagex;

public class ClanVarSettingsIndexLoader {

	public static int anInt2880;

	static Connection aClass202_2883;

	public static void method3936(int[][] ints_0) {
		Class532.anIntArrayArray7072 = ints_0;
	}

	LRUCache aClass229_2881 = new LRUCache(64);

	Index aClass317_2882;

	public ClanVarSettingsIndexLoader(Index index_3) {
		aClass317_2882 = index_3;
		if (aClass317_2882 != null)
			aClass317_2882.filesCount(SharedConfigsType.CLAN_VAR_SETTINGS.id);
	}

	public void method3923() {
		LRUCache softcache_3 = aClass229_2881;
		synchronized (aClass229_2881) {
			aClass229_2881.method3858(5);
		}
	}

	public void method3924() {
		LRUCache softcache_2 = aClass229_2881;
		synchronized (aClass229_2881) {
			aClass229_2881.method3859();
		}
	}

	public void method3926() {
		LRUCache softcache_2 = aClass229_2881;
		synchronized (aClass229_2881) {
			aClass229_2881.method3863();
		}
	}

	public ClanVarSettingsDefinitions method3933(int i_1) {
		LRUCache softcache_4 = aClass229_2881;
		ClanVarSettingsDefinitions class537_3;
		synchronized (aClass229_2881) {
			class537_3 = (ClanVarSettingsDefinitions) aClass229_2881.get(i_1);
		}
		if (class537_3 != null)
			return class537_3;
		Index index_5 = aClass317_2882;
		byte[] bytes_10;
		synchronized (aClass317_2882) {
			bytes_10 = aClass317_2882.getFile(SharedConfigsType.CLAN_VAR_SETTINGS.id, i_1);
		}
		class537_3 = new ClanVarSettingsDefinitions();
		if (bytes_10 != null)
			class537_3.method11487(new ByteBuf(bytes_10));
		LRUCache softcache_9 = aClass229_2881;
		synchronized (aClass229_2881) {
			aClass229_2881.put(class537_3, i_1);
			return class537_3;
		}
	}
}
