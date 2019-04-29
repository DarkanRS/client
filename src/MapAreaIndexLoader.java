public class MapAreaIndexLoader {

	static boolean[] INTERFACES_LOADED;
	SoftCache aClass229_2707 = new SoftCache(128);
	SoftCache aClass229_2708 = new SoftCache(64);
	Index aClass317_2705;
	Index aClass317_2703;

	public void method3695() {
		SoftCache softcache_3 = this.aClass229_2707;
		synchronized (this.aClass229_2707) {
			this.aClass229_2707.method3858(5);
		}

		softcache_3 = this.aClass229_2708;
		synchronized (this.aClass229_2708) {
			this.aClass229_2708.method3858(5);
		}
	}

	public void method3696() {
		SoftCache softcache_2 = this.aClass229_2707;
		synchronized (this.aClass229_2707) {
			this.aClass229_2707.method3863();
		}

		softcache_2 = this.aClass229_2708;
		synchronized (this.aClass229_2708) {
			this.aClass229_2708.method3863();
		}
	}

	public void method3697(int i_1, int i_2, int i_3) {
		this.aClass229_2707 = new SoftCache(i_1);
		this.aClass229_2708 = new SoftCache(i_2);
	}

	public void method3699() {
		SoftCache softcache_2 = this.aClass229_2707;
		synchronized (this.aClass229_2707) {
			this.aClass229_2707.method3859();
		}

		softcache_2 = this.aClass229_2708;
		synchronized (this.aClass229_2708) {
			this.aClass229_2708.method3859();
		}
	}

	public MapAreaDefinitions getWorldMapDefs(int i_1, int i_2) {
		SoftCache softcache_4 = this.aClass229_2707;
		MapAreaDefinitions worldmapareadefs_3;
		synchronized (this.aClass229_2707) {
			worldmapareadefs_3 = (MapAreaDefinitions) this.aClass229_2707.get((long) i_1);
		}

		if (worldmapareadefs_3 != null) {
			return worldmapareadefs_3;
		} else {
			Index index_5 = this.aClass317_2705;
			byte[] bytes_10;
			synchronized (this.aClass317_2705) {
				bytes_10 = this.aClass317_2705.getFile(SharedConfigsType.MAP_AREAS.id, i_1);
			}

			worldmapareadefs_3 = new MapAreaDefinitions();
			worldmapareadefs_3.anInt2753 = i_1;
			worldmapareadefs_3.aClass218_2716 = this;
			if (bytes_10 != null) {
				worldmapareadefs_3.method3716(new RsByteBuffer(bytes_10));
			}

			worldmapareadefs_3.method3718();
			SoftCache softcache_9 = this.aClass229_2707;
			synchronized (this.aClass229_2707) {
				this.aClass229_2707.put(worldmapareadefs_3, (long) i_1);
				return worldmapareadefs_3;
			}
		}
	}

	public MapAreaIndexLoader(Game game_1, Language xlanguage_2, Index index_3, Index index_4) {
		this.aClass317_2705 = index_3;
		this.aClass317_2703 = index_4;
		this.aClass317_2705.filesCount(SharedConfigsType.MAP_AREAS.id);
	}

	public static void method3709() {
		SoftCache softcache_2 = PlayerAppearance.aClass229_2920;
		synchronized (PlayerAppearance.aClass229_2920) {
			PlayerAppearance.aClass229_2920.method3858(5);
		}

		softcache_2 = PlayerAppearance.aClass229_2930;
		synchronized (PlayerAppearance.aClass229_2930) {
			PlayerAppearance.aClass229_2930.method3858(5);
		}
	}

}
