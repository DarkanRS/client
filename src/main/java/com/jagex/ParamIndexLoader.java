package com.jagex;

public class ParamIndexLoader {

	static int anInt5029;

	static char method7080(char c) {
		return switch (c) {
		case '\u00d2', '\u00d3', '\u00d4', '\u00d5', '\u00d6', '\u00f2', '\u00f3', '\u00f4', '\u00f5', '\u00f6' -> 'o';
		case '\u00c7', '\u00e7' -> 'c';
		case '\u00df' -> 'b';
		case '\u00ff', '\u0178' -> 'y';
		case '#', '[', ']' -> c;
		case '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00e8', '\u00e9', '\u00ea', '\u00eb' -> 'e';
		case '\u00d1', '\u00f1' -> 'n';
		case '\u00c0', '\u00c1', '\u00c2', '\u00c3', '\u00c4', '\u00e0', '\u00e1', '\u00e2', '\u00e3', '\u00e4' -> 'a';
		case ' ', '-', '_', '\u00a0' -> '_';
		default -> Character.toLowerCase(c);
		case '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00f9', '\u00fa', '\u00fb', '\u00fc' -> 'u';
		case '\u00cd', '\u00ce', '\u00cf', '\u00ed', '\u00ee', '\u00ef' -> 'i';
		};
	}
	public static void method7081() {
		GameState.setGameState(GameState.UNK_18);
		Class459.method7678();
		System.gc();
	}

	LRUCache aClass229_5028 = new LRUCache(64);

	Index aClass317_5027;

	public ParamIndexLoader(Index index_3) {
		aClass317_5027 = index_3;
		if (aClass317_5027 != null)
			aClass317_5027.filesCount(SharedConfigsType.PARAMS.id);
	}

	public ParamDefinitions getParam(int i_1) {
		LRUCache softcache_4 = aClass229_5028;
		ParamDefinitions attributedefault_3;
		synchronized (aClass229_5028) {
			attributedefault_3 = (ParamDefinitions) aClass229_5028.get(i_1);
		}
		if (attributedefault_3 != null)
			return attributedefault_3;
		Index index_5 = aClass317_5027;
		byte[] bytes_10;
		synchronized (aClass317_5027) {
			bytes_10 = aClass317_5027.getFile(SharedConfigsType.PARAMS.id, i_1);
		}
		attributedefault_3 = new ParamDefinitions();
		if (bytes_10 != null)
			attributedefault_3.method7315(new ByteBuf(bytes_10));
		LRUCache softcache_9 = aClass229_5028;
		synchronized (aClass229_5028) {
			aClass229_5028.put(attributedefault_3, i_1);
			return attributedefault_3;
		}
	}

	public void method7067() {
		LRUCache softcache_2 = aClass229_5028;
		synchronized (aClass229_5028) {
			aClass229_5028.method3863();
		}
	}

	public void method7068() {
		LRUCache softcache_3 = aClass229_5028;
		synchronized (aClass229_5028) {
			aClass229_5028.method3858(5);
		}
	}

	public void method7070() {
		LRUCache softcache_2 = aClass229_5028;
		synchronized (aClass229_5028) {
			aClass229_5028.method3859();
		}
	}
}
