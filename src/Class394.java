public class Class394 {

	SoftCache aClass229_4786 = new SoftCache(64);

	Index aClass317_4784;

	public int clanVarSize;

	public Class405 method6753(int i_1, int i_2) {
		SoftCache softcache_4 = this.aClass229_4786;
		Class405 class405_3;
		synchronized (this.aClass229_4786) {
			class405_3 = (Class405) this.aClass229_4786.get((long) i_1);
		}
		if (class405_3 != null) {
			return class405_3;
		} else {
			Index index_5 = this.aClass317_4784;
			byte[] bytes_10;
			synchronized (this.aClass317_4784) {
				bytes_10 = this.aClass317_4784.getFile(SharedConfigsType.aClass120_1510.id, i_1);
			}
			class405_3 = new Class405();
			if (bytes_10 != null) {
				class405_3.method6816(new RsByteBuffer(bytes_10));
			}
			SoftCache softcache_9 = this.aClass229_4786;
			synchronized (this.aClass229_4786) {
				this.aClass229_4786.put(class405_3, (long) i_1);
				return class405_3;
			}
		}
	}

	public void method6754() {
		SoftCache softcache_2 = this.aClass229_4786;
		synchronized (this.aClass229_4786) {
			this.aClass229_4786.method3859(-51654906);
		}
	}

	public void method6755() {
		SoftCache softcache_3 = this.aClass229_4786;
		synchronized (this.aClass229_4786) {
			this.aClass229_4786.method3858(5, (byte) -24);
		}
	}

	public void method6756() {
		SoftCache softcache_2 = this.aClass229_4786;
		synchronized (this.aClass229_4786) {
			this.aClass229_4786.method3863(1671454169);
		}
	}

	public Class394(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_4784 = index_3;
		if (this.aClass317_4784 != null) {
			this.clanVarSize = this.aClass317_4784.filesCount(SharedConfigsType.aClass120_1510.id);
		} else {
			this.clanVarSize = 0;
		}
	}

	static void method6763() {
		Class187.anInt2363 = 0;
		Class187.anInt2351 = -1;
		Class187.anInt2361 = -1;
		Class187.anInt2359 = -1;
	}
}
