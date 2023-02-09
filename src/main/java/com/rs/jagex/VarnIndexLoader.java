package com.rs.jagex;

public class VarnIndexLoader {

	static void method7460(int i_0, int i_1, int i_2) {
		String string_4 = "tele " + i_0 + "," + (i_1 >> 6) + "," + (i_2 >> 6) + "," + (i_1 & 0x3f) + "," + (i_2 & 0x3f);
		RouteFinder.handleCommand(string_4, true, false);
	}

	LRUCache aClass229_5417 = new LRUCache(64);

	Index aClass317_5418;

	public VarnIndexLoader(Index index_3) {
		aClass317_5418 = index_3;
		if (aClass317_5418 != null)
			aClass317_5418.filesCount(SharedConfigsType.VARN.id);
	}

	public VarnDefinitions method7450(int i_1) {
		LRUCache softcache_4 = aClass229_5417;
		VarnDefinitions class449_3;
		synchronized (aClass229_5417) {
			class449_3 = (VarnDefinitions) aClass229_5417.get(i_1);
		}
		if (class449_3 != null)
			return class449_3;
		byte[] bytes_8 = aClass317_5418.getFile(SharedConfigsType.VARN.id, i_1);
		class449_3 = new VarnDefinitions();
		if (bytes_8 != null)
			class449_3.method7487(new ByteBuf(bytes_8));
		LRUCache softcache_5 = aClass229_5417;
		synchronized (aClass229_5417) {
			aClass229_5417.put(class449_3, i_1);
			return class449_3;
		}
	}

	public void method7452() {
		LRUCache softcache_3 = aClass229_5417;
		synchronized (aClass229_5417) {
			aClass229_5417.method3858(5);
		}
	}

	public void method7453() {
		LRUCache softcache_2 = aClass229_5417;
		synchronized (aClass229_5417) {
			aClass229_5417.method3863();
		}
	}

	public void method7458() {
		LRUCache softcache_2 = aClass229_5417;
		synchronized (aClass229_5417) {
			aClass229_5417.method3859();
		}
	}
}
