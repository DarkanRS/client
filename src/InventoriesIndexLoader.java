public class InventoriesIndexLoader implements IndexLoader {

	public static int anInt4781;
	SoftCache cached = new SoftCache(64);
	Index configIndex;

	public InventoriesIndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
		this.configIndex = index_3;
		this.configIndex.filesCount(SharedConfigsType.INVENTORIES.id);
	}

	public InventoryDef getInventoryDef(int i_1, short s_2) {
		SoftCache softcache_4 = this.cached;
		InventoryDef inventorydef_3;
		synchronized (this.cached) {
			inventorydef_3 = (InventoryDef) this.cached.get((long) i_1);
		}

		if (inventorydef_3 != null) {
			return inventorydef_3;
		} else {
			Index index_5 = this.configIndex;
			byte[] bytes_10;
			synchronized (this.configIndex) {
				bytes_10 = this.configIndex.getFile(SharedConfigsType.INVENTORIES.id, i_1);
			}

			inventorydef_3 = new InventoryDef();
			if (bytes_10 != null) {
				inventorydef_3.method15690(new RsByteBuffer(bytes_10), 1939942716);
			}

			SoftCache softcache_9 = this.cached;
			synchronized (this.cached) {
				this.cached.put(inventorydef_3, (long) i_1);
				return inventorydef_3;
			}
		}
	}

	static final void method6738(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 91);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class278_Sub1.method13450(icomponentdefinitions_3, interface_4, cs2executor_0, -51249694);
	}

	static void renderAreaText(GraphicalRenderer graphicalrenderer_0, Class282_Sub36 class282_sub36_1, WorldMapAreaDefs worldmapareadefs_2, int i_3, int i_4, int i_5, int i_6, Class194 class194_7, byte b_8) {
		int i_9 = i_4 - i_6 / 2 - 5;
		int i_10 = i_5 + 2;
		if (worldmapareadefs_2.anInt2726 != 0) {
			graphicalrenderer_0.method8425(i_9, i_10, i_6 + 10, i_5 + i_3 * class194_7.method3173() - i_10 + 1, worldmapareadefs_2.anInt2726, (byte) -128);
		}

		if (worldmapareadefs_2.anInt2727 != 0) {
			graphicalrenderer_0.method8562(i_9, i_10, i_6 + 10, i_5 + i_3 * class194_7.method3173() - i_10 + 1, worldmapareadefs_2.anInt2727, (byte) 4);
		}

		int i_11 = worldmapareadefs_2.anInt2720;
		if (class282_sub36_1.aBool7989 && worldmapareadefs_2.anInt2721 != -1) {
			i_11 = worldmapareadefs_2.anInt2721;
		}

		for (int i_12 = 0; i_12 < i_3; i_12++) {
			String string_13 = Class291_Sub1.aStringArray8024[i_12];
			if (i_12 < i_3 - 1) {
				string_13 = string_13.substring(0, string_13.length() - 4);
			}

			class194_7.method3178(graphicalrenderer_0, string_13, i_4, i_5, i_11, true);
			i_5 += class194_7.method3173();
		}

	}

	public static void method6740(Class117 class117_0, int i_1) {
		Class113.aClass117_1234 = class117_0;
	}

	static final void method6741(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = cs2executor_0.aClass61_7010.anIntArray634[i_2];
	}

}
