package com.jagex;

public class EnumIndexLoader {

	public static int[] anIntArray5379;

	public static boolean method7426(int i_0) {
		for (CacheableNode_Sub7 class282_sub50_sub7_2 = (CacheableNode_Sub7) Class20.aClass482_171.head(); class282_sub50_sub7_2 != null; class282_sub50_sub7_2 = (CacheableNode_Sub7) Class20.aClass482_171.next())
			if (Class237.isNPCClickType(class282_sub50_sub7_2.clickType) && i_0 == class282_sub50_sub7_2.aLong9584)
				return true;
		return false;
	}

	LRUCache aClass229_5377 = new LRUCache(128);

	Index configIndex;

	public EnumIndexLoader(Index index_3) {
		configIndex = index_3;
		if (configIndex != null) {
			int i_4 = configIndex.containersCount() - 1;
			SharedConfigsType.ENUMS.filesPerContainer();
			configIndex.filesCount(i_4);
		}
	}

	public EnumDefinitions getEnumDefinitions(int enumId) {
		EnumDefinitions enumdefinitions_3;
		synchronized (aClass229_5377) {
			enumdefinitions_3 = (EnumDefinitions) aClass229_5377.get(enumId);
		}
		if (enumdefinitions_3 != null)
			return enumdefinitions_3;
		byte[] bytes_8 = configIndex.getFile(SharedConfigsType.ENUMS.containerId(enumId), SharedConfigsType.ENUMS.fileId(enumId));
		enumdefinitions_3 = new EnumDefinitions();
		if (bytes_8 != null)
			enumdefinitions_3.method7227(new ByteBuf(bytes_8));
		synchronized (aClass229_5377) {
			aClass229_5377.put(enumdefinitions_3, enumId);
			return enumdefinitions_3;
		}
	}
}
