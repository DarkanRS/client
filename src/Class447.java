public class Class447 {

	SoftCache aClass229_5417 = new SoftCache(64);
	Index aClass317_5418;

	public Class449 method7450(int i_1, byte b_2) {
		SoftCache softcache_4 = this.aClass229_5417;
		Class449 class449_3;
		synchronized (this.aClass229_5417) {
			class449_3 = (Class449) this.aClass229_5417.get((long) i_1);
		}

		if (class449_3 != null) {
			return class449_3;
		} else {
			byte[] bytes_8 = this.aClass317_5418.getFile(SharedConfigsType.aClass120_1522.id, i_1);
			class449_3 = new Class449();
			if (bytes_8 != null) {
				class449_3.method7487(new RsByteBuffer(bytes_8), -267873948);
			}

			SoftCache softcache_5 = this.aClass229_5417;
			synchronized (this.aClass229_5417) {
				this.aClass229_5417.put(class449_3, (long) i_1);
				return class449_3;
			}
		}
	}

	public void method7452(int i_1, byte b_2) {
		SoftCache softcache_3 = this.aClass229_5417;
		synchronized (this.aClass229_5417) {
			this.aClass229_5417.method3858(i_1, (byte) -19);
		}
	}

	public void method7453(byte b_1) {
		SoftCache softcache_2 = this.aClass229_5417;
		synchronized (this.aClass229_5417) {
			this.aClass229_5417.method3863(972747632);
		}
	}

	public Class447(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_5418 = index_3;
		if (this.aClass317_5418 != null) {
			this.aClass317_5418.filesCount(SharedConfigsType.aClass120_1522.id);
		}

	}

	public void method7458(int i_1) {
		SoftCache softcache_2 = this.aClass229_5417;
		synchronized (this.aClass229_5417) {
			this.aClass229_5417.method3859(1246806514);
		}
	}

	static final void method7460(int i_0, int i_1, int i_2, int i_3) {
		String string_4 = "tele " + i_0 + "," + (i_1 >> 6) + "," + (i_2 >> 6) + "," + (i_1 & 0x3f) + "," + (i_2 & 0x3f);
		Class251.handleCommand(string_4, true, false, -354697449);
	}

	static void method7461(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[cs2executor_0.intStackPtr - 1] = IndexLoaders.aClass242_4922.method4156(cs2executor_0.intStack[cs2executor_0.intStackPtr - 1], -1396181317).aBool2962 ? 1 : 0;
	}

	static final void method7462(CS2Executor cs2executor_0) {
		String string_2 = null;
		if (Class119.aClass12_1461 != null) {
			string_2 = Class119.aClass12_1461.method473(1840459942);
		}

		if (string_2 == null) {
			string_2 = "";
		}

		cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = string_2;
	}

	static final void method7463(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 5;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		int i_5 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 3];
		int i_6 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 4];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_2 + (i_6 - i_4) * (i_3 - i_2) / (i_5 - i_4);
	}

}
