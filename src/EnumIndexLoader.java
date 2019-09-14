public class EnumIndexLoader {

	public static int[] anIntArray5379;

	SoftCache aClass229_5377 = new SoftCache(128);

	Index configIndex;

	public EnumDefinitions getEnumDefinitions(int enumId) {
		EnumDefinitions enumdefinitions_3;
		synchronized (this.aClass229_5377) {
			enumdefinitions_3 = (EnumDefinitions) this.aClass229_5377.get((long) enumId);
		}
		if (enumdefinitions_3 != null) {
			return enumdefinitions_3;
		} else {
			byte[] bytes_8 = this.configIndex.getFile(SharedConfigsType.ENUMS.containerId(enumId), SharedConfigsType.ENUMS.fileId(enumId));
			enumdefinitions_3 = new EnumDefinitions();
			if (bytes_8 != null) {
				enumdefinitions_3.method7227(new RsByteBuffer(bytes_8));
			}
			synchronized (this.aClass229_5377) {
				this.aClass229_5377.put(enumdefinitions_3, (long) enumId);
				return enumdefinitions_3;
			}
		}
	}

	public EnumIndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
		this.configIndex = index_3;
		if (this.configIndex != null) {
			int i_4 = this.configIndex.containersCount() - 1;
			SharedConfigsType.ENUMS.filesPerContainer();
			this.configIndex.filesCount(i_4);
		}
	}

	public static boolean method7426(int i_0, byte b_1) {
		for (CacheableNode_Sub7 class282_sub50_sub7_2 = (CacheableNode_Sub7) Class20.aClass482_171.head(); class282_sub50_sub7_2 != null; class282_sub50_sub7_2 = (CacheableNode_Sub7) Class20.aClass482_171.next(1043628930)) {
			if (Class237.isNPCClickType(class282_sub50_sub7_2.clickType) && (long) i_0 == class282_sub50_sub7_2.aLong9584) {
				return true;
			}
		}
		return false;
	}
}
