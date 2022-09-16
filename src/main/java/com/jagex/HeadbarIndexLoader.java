package com.jagex;

public class HeadbarIndexLoader {

	public static NativeSprite aNativeSprite_3452;
	static int anInt3451;
	static void method5118() {
		Class9.aLong77 = -1L;
		Class9.aLong86 = 0L;
		Class9.anInt76 = -1;
	}
	public static String method5120(int i_0, boolean bool_1) {
		return bool_1 && i_0 >= 0 ? Class149_Sub4.method14662(i_0, bool_1) : Integer.toString(i_0);
	}
	LRUCache aClass229_3449 = new LRUCache(64);
	LRUCache aClass229_3447 = new LRUCache(20);

	Index aClass317_3448;

	Index aClass317_3450;

	public HeadbarIndexLoader(Index index_3, Index index_4) {
		aClass317_3448 = index_4;
		aClass317_3450 = index_3;
		aClass317_3450.filesCount(SharedConfigsType.HITBARS.id);
	}

	public HitbarDefinitions getDefinitions(int i_1) {
		LRUCache softcache_4 = aClass229_3449;
		HitbarDefinitions hitbardefinitions_3;
		synchronized (aClass229_3449) {
			hitbardefinitions_3 = (HitbarDefinitions) aClass229_3449.get(i_1);
		}
		if (hitbardefinitions_3 != null)
			return hitbardefinitions_3;
		Index index_5 = aClass317_3450;
		byte[] bytes_10;
		synchronized (aClass317_3450) {
			bytes_10 = aClass317_3450.getFile(SharedConfigsType.HITBARS.id, i_1);
		}
		hitbardefinitions_3 = new HitbarDefinitions();
		hitbardefinitions_3.aClass290_2437 = this;
		if (bytes_10 != null)
			hitbardefinitions_3.method3210(new ByteBuf(bytes_10));
		LRUCache softcache_9 = aClass229_3449;
		synchronized (aClass229_3449) {
			aClass229_3449.put(hitbardefinitions_3, i_1);
			return hitbardefinitions_3;
		}
	}

	public void method5103() {
		LRUCache softcache_2 = aClass229_3449;
		synchronized (aClass229_3449) {
			aClass229_3449.method3859();
		}
		softcache_2 = aClass229_3447;
		synchronized (aClass229_3447) {
			aClass229_3447.method3859();
		}
	}

	public void method5107() {
		LRUCache softcache_3 = aClass229_3449;
		synchronized (aClass229_3449) {
			aClass229_3449.method3858(5);
		}
		softcache_3 = aClass229_3447;
		synchronized (aClass229_3447) {
			aClass229_3447.method3858(5);
		}
	}

	public void method5109() {
		LRUCache softcache_2 = aClass229_3449;
		synchronized (aClass229_3449) {
			aClass229_3449.method3863();
		}
		softcache_2 = aClass229_3447;
		synchronized (aClass229_3447) {
			aClass229_3447.method3863();
		}
	}
}
