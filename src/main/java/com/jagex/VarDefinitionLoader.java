package com.jagex;

public class VarDefinitionLoader implements IndexLoader {

	static Thread aThread4520;
	static void method6394(AbstractRenderer graphicalrenderer_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		graphicalrenderer_0.method8425(i_1, i_2, i_3, i_4, i_5);
		graphicalrenderer_0.method8425(i_1 + 1, i_2 + 1, i_3 - 2, 16, -16777216);
		graphicalrenderer_0.method8562(i_1 + 1, i_2 + 18, i_3 - 2, i_4 - 19, -16777216);
	}
	public static String method6398(Object[] arr_0, int i_1, int i_2) {
		if (i_2 == 0)
			return "";
		if (i_2 == 1) {
			CharSequence charsequence_4 = (CharSequence) arr_0[i_1];
			return charsequence_4 == null ? "null" : charsequence_4.toString();
		} else {
			int i_9 = i_2 + i_1;
			int i_5 = 0;
			for (int i_6 = i_1; i_6 < i_9; i_6++) {
				CharSequence charsequence_11 = (CharSequence) arr_0[i_6];
				if (charsequence_11 == null)
					i_5 += 4;
				else
					i_5 += charsequence_11.length();
			}
			StringBuilder stringbuilder_10 = new StringBuilder(i_5);
			for (int i_7 = i_1; i_7 < i_9; i_7++) {
				CharSequence charsequence_8 = (CharSequence) arr_0[i_7];
				if (charsequence_8 == null)
					stringbuilder_10.append("null");
				else
					stringbuilder_10.append(charsequence_8);
			}
			return stringbuilder_10.toString();
		}
	}
	public static Class62 method6401(ByteBuf rsbytebuffer_0) {
		String string_2 = rsbytebuffer_0.readString();
		Class356 class356_3 = Class356.values()[rsbytebuffer_0.readUnsignedByte()];
		Class353 class353_4 = Class353.values()[rsbytebuffer_0.readUnsignedByte()];
		int i_5 = rsbytebuffer_0.readShort();
		int i_6 = rsbytebuffer_0.readShort();
		int i_7 = rsbytebuffer_0.readUnsignedByte();
		int i_8 = rsbytebuffer_0.readUnsignedByte();
		int i_9 = rsbytebuffer_0.readUnsignedByte();
		int i_10 = rsbytebuffer_0.readUnsignedShort();
		int i_11 = rsbytebuffer_0.readUnsignedShort();
		int i_12 = rsbytebuffer_0.readBigSmart();
		int i_13 = rsbytebuffer_0.readInt();
		int i_14 = rsbytebuffer_0.readInt();
		return new Class62(string_2, class356_3, class353_4, i_5, i_6, i_7, i_8, i_9, i_10, i_11, i_12, i_13, i_14);
	}

	public int size;

	LRUCache aClass229_4517 = new LRUCache(64);

	Index varIndex;

	public VarDefinitionLoader(Index index_3) {
		varIndex = index_3;
		if (varIndex != null)
			size = varIndex.filesCount(SharedConfigsType.VARS.id);
		else
			size = 0;
	}

	public Class372 method6384(int i_1) {
		LRUCache softcache_4 = aClass229_4517;
		Class372 class372_3;
		synchronized (aClass229_4517) {
			class372_3 = (Class372) aClass229_4517.get(i_1);
		}
		if (class372_3 != null)
			return class372_3;
		Index index_5 = varIndex;
		byte[] bytes_10;
		synchronized (varIndex) {
			bytes_10 = varIndex.getFile(SharedConfigsType.VARS.id, i_1);
		}
		class372_3 = new Class372();
		if (bytes_10 != null)
			class372_3.method6356(new ByteBuf(bytes_10));
		LRUCache softcache_9 = aClass229_4517;
		synchronized (aClass229_4517) {
			aClass229_4517.put(class372_3, i_1);
			return class372_3;
		}
	}

	public void method6386() {
		LRUCache softcache_3 = aClass229_4517;
		synchronized (aClass229_4517) {
			aClass229_4517.method3858(5);
		}
	}

	public void method6388() {
		LRUCache softcache_2 = aClass229_4517;
		synchronized (aClass229_4517) {
			aClass229_4517.method3859();
		}
	}

	public void method6390() {
		LRUCache softcache_2 = aClass229_4517;
		synchronized (aClass229_4517) {
			aClass229_4517.method3863();
		}
	}
}
