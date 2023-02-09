package com.rs.jagex;

public class VarcIndexLoader {

	public int size;
	LRUCache aClass229_4850 = new LRUCache(64);
	Index aClass317_4852;

	public VarcIndexLoader(Index index_3) {
		aClass317_4852 = index_3;
		size = aClass317_4852.filesCount(SharedConfigsType.VARC.id);
	}

	public VarcDefinitions method6873(int i_1) {
		LRUCache softcache_4 = aClass229_4850;
		VarcDefinitions class415_3;
		synchronized (aClass229_4850) {
			class415_3 = (VarcDefinitions) aClass229_4850.get(i_1);
		}

		if (class415_3 != null)
			return class415_3;
		Index index_5 = aClass317_4852;
		byte[] bytes_10;
		synchronized (aClass317_4852) {
			bytes_10 = aClass317_4852.getFile(SharedConfigsType.VARC.id, i_1);
		}

		class415_3 = new VarcDefinitions();
		if (bytes_10 != null)
			class415_3.method6990(new ByteBuf(bytes_10));

		LRUCache softcache_9 = aClass229_4850;
		synchronized (aClass229_4850) {
			aClass229_4850.put(class415_3, i_1);
			return class415_3;
		}
	}

}
