package com.rs.jagex;

public class SunIndexLoader {

	protected static int anInt434;

	LRUCache aClass229_432 = new LRUCache(16);

	Index aClass317_433;

	public SunIndexLoader(Index index_3) {
		aClass317_433 = index_3;
		aClass317_433.filesCount(SharedConfigsType.SUN.id);
	}

	public SunDefinitions method914(int i_1) {
		LRUCache softcache_4 = aClass229_432;
		SunDefinitions class38_3;
		synchronized (aClass229_432) {
			class38_3 = (SunDefinitions) aClass229_432.get(i_1);
		}
		if (class38_3 != null)
			return class38_3;
		Index index_5 = aClass317_433;
		byte[] bytes_10;
		synchronized (aClass317_433) {
			bytes_10 = aClass317_433.getFile(SharedConfigsType.SUN.id, i_1);
		}
		class38_3 = new SunDefinitions();
		if (bytes_10 != null)
			class38_3.method850(new ByteBuf(bytes_10));
		LRUCache softcache_9 = aClass229_432;
		synchronized (aClass229_432) {
			aClass229_432.put(class38_3, i_1);
			return class38_3;
		}
	}

	public void method916() {
		LRUCache softcache_2 = aClass229_432;
		synchronized (aClass229_432) {
			aClass229_432.method3859();
		}
	}

	public void method917() {
		LRUCache softcache_3 = aClass229_432;
		synchronized (aClass229_432) {
			aClass229_432.method3858(5);
		}
	}

	public void method918() {
		LRUCache softcache_2 = aClass229_432;
		synchronized (aClass229_432) {
			aClass229_432.method3863();
		}
	}
}
