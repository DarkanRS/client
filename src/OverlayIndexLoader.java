public class OverlayIndexLoader {

	SoftCache aClass229_7092 = new SoftCache(64);

	public int anInt7093 = 0;

	Index aClass317_7095;

	public int anInt7094;

	public OverlayDef getOverlayDef(int i_1) {
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
				bytes_10 = this.aClass317_7095.getFile(SharedConfigsType.OVERLAYS.id, i_1);
			}
			overlaydef_3 = new OverlayDef();
			overlaydef_3.aClass536_7062 = this;
			overlaydef_3.anInt7053 = i_1;
			if (bytes_10 != null) {
				overlaydef_3.method11357(new RsByteBuffer(bytes_10));
			}
			overlaydef_3.method11356();
			SoftCache softcache_9 = this.aClass229_7092;
			synchronized (this.aClass229_7092) {
				this.aClass229_7092.put(overlaydef_3, (long) i_1);
				return overlaydef_3;
			}
		}
	}

	public void method11476() {
		SoftCache softcache_2 = this.aClass229_7092;
		synchronized (this.aClass229_7092) {
			this.aClass229_7092.method3859();
		}
	}

	public void method11477() {
		SoftCache softcache_3 = this.aClass229_7092;
		synchronized (this.aClass229_7092) {
			this.aClass229_7092.method3858(5);
		}
	}

	public void method11478() {
		SoftCache softcache_2 = this.aClass229_7092;
		synchronized (this.aClass229_7092) {
			this.aClass229_7092.method3863();
		}
	}

	public OverlayIndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_7095 = index_3;
		this.anInt7094 = this.aClass317_7095.filesCount(SharedConfigsType.OVERLAYS.id);
	}
}
