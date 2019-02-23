public class Class536 {

	SoftCache aClass229_7092 = new SoftCache(64);
	public int anInt7093 = 0;
	Index aClass317_7095;
	public int anInt7094;

	public OverlayDef method11475(int i_1, byte b_2) {
		SoftCache softcache_4 = this.aClass229_7092;
		OverlayDef overlaydef_3;
		synchronized (this.aClass229_7092) {
			overlaydef_3 = (OverlayDef) this.aClass229_7092.get((long) i_1);
		}

		if (overlaydef_3 != null) {
			return overlaydef_3;
		} else {
			Index index_5 = this.aClass317_7095;
			byte[] bytes_10;
			synchronized (this.aClass317_7095) {
				bytes_10 = this.aClass317_7095.getFile(SharedConfigsType.FLO2.id, i_1);
			}

			overlaydef_3 = new OverlayDef();
			overlaydef_3.aClass536_7062 = this;
			overlaydef_3.anInt7053 = i_1;
			if (bytes_10 != null) {
				overlaydef_3.method11357(new RsByteBuffer(bytes_10), 1338105221);
			}

			overlaydef_3.method11356((byte) -46);
			SoftCache softcache_9 = this.aClass229_7092;
			synchronized (this.aClass229_7092) {
				this.aClass229_7092.put(overlaydef_3, (long) i_1);
				return overlaydef_3;
			}
		}
	}

	public void method11476(byte b_1) {
		SoftCache softcache_2 = this.aClass229_7092;
		synchronized (this.aClass229_7092) {
			this.aClass229_7092.method3859(2009928513);
		}
	}

	public void method11477(int i_1, byte b_2) {
		SoftCache softcache_3 = this.aClass229_7092;
		synchronized (this.aClass229_7092) {
			this.aClass229_7092.method3858(i_1, (byte) 14);
		}
	}

	public void method11478(int i_1) {
		SoftCache softcache_2 = this.aClass229_7092;
		synchronized (this.aClass229_7092) {
			this.aClass229_7092.method3863(1398711796);
		}
	}

	public Class536(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_7095 = index_3;
		this.anInt7094 = this.aClass317_7095.filesCount(SharedConfigsType.FLO2.id);
	}

	static final void method11486(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.anIntArray7337[i_2];
	}

}
