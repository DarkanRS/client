public class Class408 {

	SoftCache aClass229_4850 = new SoftCache(64);
	Index aClass317_4852;
	public int anInt4851;

	public Class415 method6873(int i_1, byte b_2) {
		SoftCache softcache_4 = this.aClass229_4850;
		Class415 class415_3;
		synchronized (this.aClass229_4850) {
			class415_3 = (Class415) this.aClass229_4850.get((long) i_1);
		}

		if (class415_3 != null) {
			return class415_3;
		} else {
			Index index_5 = this.aClass317_4852;
			byte[] bytes_10;
			synchronized (this.aClass317_4852) {
				bytes_10 = this.aClass317_4852.getFile(SharedConfigsType.aClass120_1482.id, i_1);
			}

			class415_3 = new Class415();
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

	public Class408(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_4852 = index_3;
		this.anInt4851 = this.aClass317_4852.filesCount(SharedConfigsType.aClass120_1482.id);
	}

}
