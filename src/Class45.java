public class Class45 {

	protected static int anInt434;
	SoftCache aClass229_432 = new SoftCache(16);
	Index aClass317_433;

	public Class38 method914(int i_1, int i_2) {
		SoftCache softcache_4 = this.aClass229_432;
		Class38 class38_3;
		synchronized (this.aClass229_432) {
			class38_3 = (Class38) this.aClass229_432.get((long) i_1);
		}

		if (class38_3 != null) {
			return class38_3;
		} else {
			Index index_5 = this.aClass317_433;
			byte[] bytes_10;
			synchronized (this.aClass317_433) {
				bytes_10 = this.aClass317_433.getFile(SharedConfigsType.aClass120_1489.id, i_1);
			}

			class38_3 = new Class38();
			if (bytes_10 != null) {
				class38_3.method850(new RsByteBuffer(bytes_10), -50150458);
			}

			SoftCache softcache_9 = this.aClass229_432;
			synchronized (this.aClass229_432) {
				this.aClass229_432.put(class38_3, (long) i_1);
				return class38_3;
			}
		}
	}

	public void method916(byte b_1) {
		SoftCache softcache_2 = this.aClass229_432;
		synchronized (this.aClass229_432) {
			this.aClass229_432.method3859(-1765413444);
		}
	}

	public void method917(int i_1, int i_2) {
		SoftCache softcache_3 = this.aClass229_432;
		synchronized (this.aClass229_432) {
			this.aClass229_432.method3858(i_1, (byte) 1);
		}
	}

	public void method918(int i_1) {
		SoftCache softcache_2 = this.aClass229_432;
		synchronized (this.aClass229_432) {
			this.aClass229_432.method3863(1208180587);
		}
	}

	public Class45(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_433 = index_3;
		this.aClass317_433.filesCount(SharedConfigsType.aClass120_1489.id);
	}

	static final void method926(CS2Executor cs2executor_0, int i_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		int i_3 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = string_2 + Class290.method5120(i_3, true, -948271642);
	}

	static final void method927(CS2Executor cs2executor_0, int i_1) {
		int i_2 = client.aClass465_7442.method7748((short) 622);
		if (client.anInt7349 != -1) {
			++i_2;
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_2;
	}

	static final void method928(CS2Executor cs2executor_0, int i_1) {
		if (Class96_Sub21.aClass199_9438.method3236(82, -2064164643)) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 1;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

}
