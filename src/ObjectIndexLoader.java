public class ObjectIndexLoader {

	int anInt5617;

	RSMesh[] aClass157Array5616 = new RSMesh[4];

	Class452 aClass452_5620 = new Class452((Object) null, (Object) null);

	SoftCache softCache = new SoftCache(256);

	SoftCache aClass229_5614 = new SoftCache(500);

	SoftCache aClass229_5615 = new SoftCache(30);

	SoftCache aClass229_5619 = new SoftCache(50);

	Game game;

	Language aClass495_5608;

	boolean showOptions;

	Index objectIndex;

	Index meshIndex;

	String[] defaultOptions;

	public ObjectDefinitions getObjectDefinitions(int i_1) {
		SoftCache softcache_4 = this.softCache;
		ObjectDefinitions objectdefinitions_3;
		synchronized (this.softCache) {
			objectdefinitions_3 = (ObjectDefinitions) this.softCache.get((long) i_1);
		}
		if (objectdefinitions_3 != null) {
			return objectdefinitions_3;
		} else {
			Index index_5 = this.objectIndex;
			byte[] bytes_9;
			synchronized (this.objectIndex) {
				bytes_9 = this.objectIndex.getFile(SharedConfigsType.OBJECTS.containerId(i_1), SharedConfigsType.OBJECTS.fileId(i_1));
			}
			objectdefinitions_3 = new ObjectDefinitions();
			objectdefinitions_3.id = i_1;
			objectdefinitions_3.loader = this;
			objectdefinitions_3.options = (String[]) this.defaultOptions.clone();
			if (bytes_9 != null) {
				objectdefinitions_3.method7964(new RsByteBuffer(bytes_9));
			}
			objectdefinitions_3.method7966();
			if (objectdefinitions_3.gateway) {
				objectdefinitions_3.clipType = 0;
				objectdefinitions_3.projectileClipped = false;
			}
			if (!this.showOptions && objectdefinitions_3.members) {
				objectdefinitions_3.options = null;
				objectdefinitions_3.anIntArray5707 = null;
			}
			SoftCache softcache_10 = this.softCache;
			synchronized (this.softCache) {
				this.softCache.put(objectdefinitions_3, (long) i_1);
				return objectdefinitions_3;
			}
		}
	}

	public void method7893(int i_1, int i_2) {
		this.anInt5617 = i_1;
		SoftCache softcache_3 = this.aClass229_5614;
		synchronized (this.aClass229_5614) {
			this.aClass229_5614.method3859();
		}
		softcache_3 = this.aClass229_5615;
		synchronized (this.aClass229_5615) {
			this.aClass229_5615.method3859();
		}
		softcache_3 = this.aClass229_5619;
		synchronized (this.aClass229_5619) {
			this.aClass229_5619.method3859();
		}
	}

	public void method7895(byte b_1) {
		SoftCache softcache_2 = this.softCache;
		synchronized (this.softCache) {
			this.softCache.method3859();
		}
		softcache_2 = this.aClass229_5614;
		synchronized (this.aClass229_5614) {
			this.aClass229_5614.method3859();
		}
		softcache_2 = this.aClass229_5615;
		synchronized (this.aClass229_5615) {
			this.aClass229_5615.method3859();
		}
		softcache_2 = this.aClass229_5619;
		synchronized (this.aClass229_5619) {
			this.aClass229_5619.method3859();
		}
		this.aClass157Array5616 = new RSMesh[4];
		this.aClass452_5620 = new Class452((Object) null, (Object) null);
	}

	public void method7896() {
		SoftCache softcache_3 = this.softCache;
		synchronized (this.softCache) {
			this.softCache.method3858(5);
		}
		softcache_3 = this.aClass229_5614;
		synchronized (this.aClass229_5614) {
			this.aClass229_5614.method3858(5);
		}
		softcache_3 = this.aClass229_5615;
		synchronized (this.aClass229_5615) {
			this.aClass229_5615.method3858(5);
		}
		softcache_3 = this.aClass229_5619;
		synchronized (this.aClass229_5619) {
			this.aClass229_5619.method3858(5);
		}
	}

	public void method7897() {
		SoftCache softcache_2 = this.softCache;
		synchronized (this.softCache) {
			this.softCache.method3863();
		}
		softcache_2 = this.aClass229_5614;
		synchronized (this.aClass229_5614) {
			this.aClass229_5614.method3863();
		}
		softcache_2 = this.aClass229_5615;
		synchronized (this.aClass229_5615) {
			this.aClass229_5615.method3863();
		}
		softcache_2 = this.aClass229_5619;
		synchronized (this.aClass229_5619) {
			this.aClass229_5619.method3863();
		}
	}

	public ObjectIndexLoader(Game game_1, Language xlanguage_2, Index index_4, Index index_5) {
		this.game = game_1;
		this.aClass495_5608 = xlanguage_2;
		this.showOptions = true;
		this.objectIndex = index_4;
		this.meshIndex = index_5;
		if (this.objectIndex != null) {
			int i_6 = this.objectIndex.containersCount() - 1;
			SharedConfigsType.OBJECTS.filesPerContainer(-1090472574);
			this.objectIndex.filesCount(i_6);
		}
		if (this.game == Game.darkan) {
			this.defaultOptions = new String[] { null, null, null, null, null, Message.EXAMINE.translate(this.aClass495_5608, -952366759) };
		} else {
			this.defaultOptions = new String[6];
		}
	}

	public void method7899(int i_1) {
		this.softCache = new SoftCache(i_1);
	}

	public void method7912(boolean bool_1) {
		if (this.showOptions != bool_1) {
			this.showOptions = bool_1;
			this.method7895((byte) 107);
		}
	}

	public static int method7914(long long_0) {
		return (int) (long_0 / 86400000L) - 11745;
	}

	public static WorldDescriptor getWorld(int id) {
		return Class244.aBool3007 && id >= Class485.WORLD_LIST_START && id <= Class244.WORLD_LIST_SIZEPLUS1 ? Class244.WORLD_LIST_DESCRIPTORS[id - Class485.WORLD_LIST_START] : null;
	}
}
