public class WorldMapIndexLoader {

	static boolean[] INTERFACES_LOADED;
	SoftCache aClass229_2707 = new SoftCache(128);
	SoftCache aClass229_2708 = new SoftCache(64);
	Index aClass317_2705;
	Index aClass317_2703;

	public void method3695(int i_1, int i_2) {
		SoftCache softcache_3 = this.aClass229_2707;
		synchronized (this.aClass229_2707) {
			this.aClass229_2707.method3858(i_1, (byte) 71);
		}

		softcache_3 = this.aClass229_2708;
		synchronized (this.aClass229_2708) {
			this.aClass229_2708.method3858(i_1, (byte) -60);
		}
	}

	public void method3696(byte b_1) {
		SoftCache softcache_2 = this.aClass229_2707;
		synchronized (this.aClass229_2707) {
			this.aClass229_2707.method3863(2127164020);
		}

		softcache_2 = this.aClass229_2708;
		synchronized (this.aClass229_2708) {
			this.aClass229_2708.method3863(1611491782);
		}
	}

	public void method3697(int i_1, int i_2, int i_3) {
		this.aClass229_2707 = new SoftCache(i_1);
		this.aClass229_2708 = new SoftCache(i_2);
	}

	public void method3699(byte b_1) {
		SoftCache softcache_2 = this.aClass229_2707;
		synchronized (this.aClass229_2707) {
			this.aClass229_2707.method3859(-1557275586);
		}

		softcache_2 = this.aClass229_2708;
		synchronized (this.aClass229_2708) {
			this.aClass229_2708.method3859(-1044931706);
		}
	}

	public WorldMapAreaDefs getWorldMapDefs(int i_1, int i_2) {
		SoftCache softcache_4 = this.aClass229_2707;
		WorldMapAreaDefs worldmapareadefs_3;
		synchronized (this.aClass229_2707) {
			worldmapareadefs_3 = (WorldMapAreaDefs) this.aClass229_2707.get((long) i_1);
		}

		if (worldmapareadefs_3 != null) {
			return worldmapareadefs_3;
		} else {
			Index index_5 = this.aClass317_2705;
			byte[] bytes_10;
			synchronized (this.aClass317_2705) {
				bytes_10 = this.aClass317_2705.getFile(SharedConfigsType.WORLD_MAP_DEFS.id, i_1);
			}

			worldmapareadefs_3 = new WorldMapAreaDefs();
			worldmapareadefs_3.anInt2753 = i_1;
			worldmapareadefs_3.aClass218_2716 = this;
			if (bytes_10 != null) {
				worldmapareadefs_3.method3716(new RsByteBuffer(bytes_10), -141546823);
			}

			worldmapareadefs_3.method3718(-1915876048);
			SoftCache softcache_9 = this.aClass229_2707;
			synchronized (this.aClass229_2707) {
				this.aClass229_2707.put(worldmapareadefs_3, (long) i_1);
				return worldmapareadefs_3;
			}
		}
	}

	public WorldMapIndexLoader(Game game_1, Language xlanguage_2, Index index_3, Index index_4) {
		this.aClass317_2705 = index_3;
		this.aClass317_2703 = index_4;
		this.aClass317_2705.filesCount(SharedConfigsType.WORLD_MAP_DEFS.id);
	}

	public static void method3709(int i_0, short s_1) {
		SoftCache softcache_2 = PlayerAppearance.aClass229_2920;
		synchronized (PlayerAppearance.aClass229_2920) {
			PlayerAppearance.aClass229_2920.method3858(i_0, (byte) 86);
		}

		softcache_2 = PlayerAppearance.aClass229_2930;
		synchronized (PlayerAppearance.aClass229_2930) {
			PlayerAppearance.aClass229_2930.method3858(i_0, (byte) 15);
		}
	}

	static void method3710(Interface interface_0, IComponentDefinitions icomponentdefinitions_1, int i_2) {
		if (icomponentdefinitions_1 != null) {
			int i_4;
			if (icomponentdefinitions_1.anInt1288 != -1) {
				IComponentDefinitions icomponentdefinitions_3 = interface_0.components[icomponentdefinitions_1.parent & 0xffff];
				if (icomponentdefinitions_3 != null) {
					if (icomponentdefinitions_3.aClass118Array1438 == icomponentdefinitions_3.aClass118Array1439) {
						icomponentdefinitions_3.aClass118Array1439 = new IComponentDefinitions[icomponentdefinitions_3.aClass118Array1438.length];
						icomponentdefinitions_3.aClass118Array1439[0] = icomponentdefinitions_1;
						Class503.method8359(icomponentdefinitions_3.aClass118Array1438, 0, icomponentdefinitions_3.aClass118Array1439, 1, icomponentdefinitions_1.anInt1288);
						Class503.method8359(icomponentdefinitions_3.aClass118Array1438, icomponentdefinitions_1.anInt1288 + 1, icomponentdefinitions_3.aClass118Array1439, icomponentdefinitions_1.anInt1288 + 1, icomponentdefinitions_3.aClass118Array1438.length - icomponentdefinitions_1.anInt1288 - 1);
					} else {
						i_4 = 0;

						IComponentDefinitions[] arr_5;
						for (arr_5 = icomponentdefinitions_3.aClass118Array1439; i_4 < arr_5.length && arr_5[i_4] != icomponentdefinitions_1; i_4++) {
							;
						}

						if (i_4 < arr_5.length) {
							Class503.method8359(arr_5, 0, arr_5, 1, i_4);
							arr_5[0] = icomponentdefinitions_1;
						}
					}
				}
			} else {
				IComponentDefinitions[] arr_6 = interface_0.method1617(-1207733107);

				for (i_4 = 0; i_4 < arr_6.length && arr_6[i_4] != icomponentdefinitions_1; i_4++) {
					;
				}

				if (i_4 < arr_6.length) {
					Class503.method8359(arr_6, 0, arr_6, 1, i_4);
					arr_6[0] = icomponentdefinitions_1;
				}
			}
		}

	}

}
