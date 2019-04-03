public class Class233 {

	public static int anInt2880;

	static Connection aClass202_2883;

	SoftCache aClass229_2881 = new SoftCache(64);

	Index aClass317_2882;

	public void method3923() {
		SoftCache softcache_3 = this.aClass229_2881;
		synchronized (this.aClass229_2881) {
			this.aClass229_2881.method3858(5, (byte) -46);
		}
	}

	public Class233(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_2882 = index_3;
		if (this.aClass317_2882 != null) {
			this.aClass317_2882.filesCount(SharedConfigsType.SCT_54.id);
		}
	}

	public void method3924() {
		SoftCache softcache_2 = this.aClass229_2881;
		synchronized (this.aClass229_2881) {
			this.aClass229_2881.method3859(122018948);
		}
	}

	public void method3926() {
		SoftCache softcache_2 = this.aClass229_2881;
		synchronized (this.aClass229_2881) {
			this.aClass229_2881.method3863(733385638);
		}
	}

	public Class537 method3933(int i_1, int i_2) {
		SoftCache softcache_4 = this.aClass229_2881;
		Class537 class537_3;
		synchronized (this.aClass229_2881) {
			class537_3 = (Class537) this.aClass229_2881.get((long) i_1);
		}
		if (class537_3 != null) {
			return class537_3;
		} else {
			Index index_5 = this.aClass317_2882;
			byte[] bytes_10;
			synchronized (this.aClass317_2882) {
				bytes_10 = this.aClass317_2882.getFile(SharedConfigsType.SCT_54.id, i_1);
			}
			class537_3 = new Class537();
			if (bytes_10 != null) {
				class537_3.method11487(new RsByteBuffer(bytes_10));
			}
			SoftCache softcache_9 = this.aClass229_2881;
			synchronized (this.aClass229_2881) {
				this.aClass229_2881.put(class537_3, (long) i_1);
				return class537_3;
			}
		}
	}

	public static void method3936(int[][] ints_0) {
		Class532.anIntArrayArray7072 = ints_0;
	}
}
