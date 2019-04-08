public class VarcIndexLoader {

	SoftCache aClass229_4850 = new SoftCache(64);
	Index aClass317_4852;
	public int size;

	public VarcDefinitions method6873(int i_1, byte b_2) {
		SoftCache softcache_4 = this.aClass229_4850;
		VarcDefinitions class415_3;
		synchronized (this.aClass229_4850) {
			class415_3 = (VarcDefinitions) this.aClass229_4850.get((long) i_1);
		}

		if (class415_3 != null) {
			return class415_3;
		} else {
			Index index_5 = this.aClass317_4852;
			byte[] bytes_10;
			synchronized (this.aClass317_4852) {
				bytes_10 = this.aClass317_4852.getFile(SharedConfigsType.VARC.id, i_1);
			}

			class415_3 = new VarcDefinitions();
			if (bytes_10 != null) {
				class415_3.method6990(new RsByteBuffer(bytes_10));
			}

			SoftCache softcache_9 = this.aClass229_4850;
			synchronized (this.aClass229_4850) {
				this.aClass229_4850.put(class415_3, (long) i_1);
				return class415_3;
			}
		}
	}

	public VarcIndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_4852 = index_3;
		this.size = this.aClass317_4852.filesCount(SharedConfigsType.VARC.id);
	}

}
