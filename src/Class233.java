public class Class233 {

	public static int anInt2880;
	static Class202 aClass202_2883;
	SoftCache aClass229_2881 = new SoftCache(64);
	Index aClass317_2882;

	public void method3923(int i_1, int i_2) {
		SoftCache softcache_3 = this.aClass229_2881;
		synchronized (this.aClass229_2881) {
			this.aClass229_2881.method3858(i_1, (byte) -46);
		}
	}

	public Class233(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_2882 = index_3;
		if (this.aClass317_2882 != null) {
			this.aClass317_2882.filesCount(SharedConfigsType.aClass120_1464.id);
		}

	}

	public void method3924(int i_1) {
		SoftCache softcache_2 = this.aClass229_2881;
		synchronized (this.aClass229_2881) {
			this.aClass229_2881.method3859(122018948);
		}
	}

	public void method3926(byte b_1) {
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
				bytes_10 = this.aClass317_2882.getFile(SharedConfigsType.aClass120_1464.id, i_1);
			}

			class537_3 = new Class537();
			if (bytes_10 != null) {
				class537_3.method11487(new RsByteBuffer(bytes_10), (byte) -105);
			}

			SoftCache softcache_9 = this.aClass229_2881;
			synchronized (this.aClass229_2881) {
				this.aClass229_2881.put(class537_3, (long) i_1);
				return class537_3;
			}
		}
	}

	public static void method3936(int[][] ints_0, int i_1) {
		Class532.anIntArrayArray7072 = ints_0;
	}

	static final void method3937(CS2Executor cs2executor_0) {
		String string_2 = (String) cs2executor_0.stringStack[--cs2executor_0.stringStackPtr];
		StringBuilder stringbuilder_3 = new StringBuilder(string_2.length());
		boolean bool_4 = false;

		for (int i_5 = 0; i_5 < string_2.length(); i_5++) {
			char var_6 = string_2.charAt(i_5);
			if (var_6 == 60) {
				bool_4 = true;
			} else if (var_6 == 62) {
				bool_4 = false;
			} else if (!bool_4) {
				stringbuilder_3.append(var_6);
			}
		}

		cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = stringbuilder_3.toString();
	}

	static final void method3938(CS2Executor cs2executor_0) {
		cs2executor_0.intStackPtr -= 2;
	}

	static final void method3939(CS2Executor cs2executor_0, int i_1) {
		LinkedNodeList.method7886(true, 1516035825);
	}

	static final void method3940(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 105);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class388.method6689(icomponentdefinitions_3, interface_4, cs2executor_0, -1054634282);
	}

	static final void method3941(CS2Executor cs2executor_0) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		WorldMapAreaDefs.method3738(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) -2);
	}

	static final void method3942(CS2Executor cs2executor_0, int i_1) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub10_8215, cs2executor_0.intStack[--cs2executor_0.intStackPtr] == 1 ? 1 : 0, -989964873);
		Class282_Sub20_Sub36.method15418(668850119);
		Class190.savePreferences((byte) 44);
		client.aBool7175 = false;
	}

}
