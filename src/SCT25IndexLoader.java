public class SCT25IndexLoader {

	SoftCache aClass229_5824 = new SoftCache(64);

	Index aClass317_5823;

	public void method8319() {
		SoftCache softcache_2 = this.aClass229_5824;
		synchronized (this.aClass229_5824) {
			this.aClass229_5824.method3859(-1742228693);
		}
	}

	public void method8320() {
		SoftCache softcache_3 = this.aClass229_5824;
		synchronized (this.aClass229_5824) {
			this.aClass229_5824.method3858(5, (byte) -28);
		}
	}

	public void method8321() {
		SoftCache softcache_2 = this.aClass229_5824;
		synchronized (this.aClass229_5824) {
			this.aClass229_5824.method3863(1716297142);
		}
	}

	public SCT25IndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_5823 = index_3;
		if (this.aClass317_5823 != null) {
			this.aClass317_5823.filesCount(SharedConfigsType.SCT_25.id);
		}
	}

	public SCT25Definitions method8322(int i_1) {
		SoftCache softcache_4 = this.aClass229_5824;
		SCT25Definitions class489_3;
		synchronized (this.aClass229_5824) {
			class489_3 = (SCT25Definitions) this.aClass229_5824.get((long) i_1);
		}
		if (class489_3 != null) {
			return class489_3;
		} else {
			byte[] bytes_8 = this.aClass317_5823.getFile(SharedConfigsType.SCT_25.id, i_1);
			class489_3 = new SCT25Definitions();
			if (bytes_8 != null) {
				class489_3.method8213(new RsByteBuffer(bytes_8));
			}
			SoftCache softcache_5 = this.aClass229_5824;
			synchronized (this.aClass229_5824) {
				this.aClass229_5824.put(class489_3, (long) i_1);
				return class489_3;
			}
		}
	}
}
