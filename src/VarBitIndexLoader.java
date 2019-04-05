public class VarBitIndexLoader implements IndexLoader {

	SoftCache aClass229_2856 = new SoftCache(64);

	Index aClass317_2858;

	public VarBitDefinitions getVarBit(int i_1, byte b_2) {
		SoftCache softcache_4 = this.aClass229_2856;
		VarBitDefinitions class226_3;
		synchronized (this.aClass229_2856) {
			class226_3 = (VarBitDefinitions) this.aClass229_2856.get((long) i_1);
		}
		if (class226_3 != null) {
			return class226_3;
		} else {
			Index index_5 = this.aClass317_2858;
			byte[] bytes_10;
			synchronized (this.aClass317_2858) {
				bytes_10 = this.aClass317_2858.getFile(SharedConfigsType.VARBITS.containerId(i_1), SharedConfigsType.VARBITS.fileId(i_1));
			}
			class226_3 = new VarBitDefinitions();
			if (bytes_10 != null) {
				class226_3.method3795(new RsByteBuffer(bytes_10));
			}
			SoftCache softcache_9 = this.aClass229_2856;
			synchronized (this.aClass229_2856) {
				this.aClass229_2856.put(class226_3, (long) i_1);
				return class226_3;
			}
		}
	}

	public VarBitIndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_2858 = index_3;
		if (this.aClass317_2858 != null) {
			int i_4 = this.aClass317_2858.containersCount() - 1;
			SharedConfigsType.VARBITS.filesPerContainer(-689743414);
			this.aClass317_2858.filesCount(i_4);
		}
	}

	public void method3898() {
		SoftCache softcache_3 = this.aClass229_2856;
		synchronized (this.aClass229_2856) {
			this.aClass229_2856.method3858(5, (byte) -17);
		}
	}

	public void method3899() {
		SoftCache softcache_2 = this.aClass229_2856;
		synchronized (this.aClass229_2856) {
			this.aClass229_2856.method3863(1268003404);
		}
	}

	public void method3903() {
		SoftCache softcache_2 = this.aClass229_2856;
		synchronized (this.aClass229_2856) {
			this.aClass229_2856.method3859(891629452);
		}
	}

	public void method3906(int i_1) {
		SoftCache softcache_3 = this.aClass229_2856;
		synchronized (this.aClass229_2856) {
			this.aClass229_2856.method3859(1117502683);
			this.aClass229_2856 = new SoftCache(i_1);
		}
	}

	public static final int method3910(String string_0) {
		if (string_0 == null) {
			return -1;
		} else {
			for (int i_2 = 0; i_2 < client.anInt7449; i_2++) {
				if (string_0.equalsIgnoreCase(client.aClass6Array7452[i_2].aString37)) {
					return i_2;
				}
			}
			return -1;
		}
	}

	static void method3912() {
		if (Class260.aClass277_3221 != null) {
			Class260.aClass277_3221 = null;
			Class187.method3121(256, (short) -575);
		}
	}
}
