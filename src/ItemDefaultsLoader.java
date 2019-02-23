public class ItemDefaultsLoader {

	static int anInt5029;
	SoftCache aClass229_5028 = new SoftCache(64);
	Index aClass317_5027;

	public void method7067(int i_1) {
		SoftCache softcache_2 = this.aClass229_5028;
		synchronized (this.aClass229_5028) {
			this.aClass229_5028.method3863(1684780970);
		}
	}

	public void method7068(int i_1, int i_2) {
		SoftCache softcache_3 = this.aClass229_5028;
		synchronized (this.aClass229_5028) {
			this.aClass229_5028.method3858(i_1, (byte) -89);
		}
	}

	public ItemDefaultsLoader(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_5027 = index_3;
		if (this.aClass317_5027 != null) {
			this.aClass317_5027.filesCount(SharedConfigsType.aClass120_1474.id);
		}

	}

	public AttributeDefault method7069(int i_1, byte b_2) {
		SoftCache softcache_4 = this.aClass229_5028;
		AttributeDefault attributedefault_3;
		synchronized (this.aClass229_5028) {
			attributedefault_3 = (AttributeDefault) this.aClass229_5028.get((long) i_1);
		}

		if (attributedefault_3 != null) {
			return attributedefault_3;
		} else {
			Index index_5 = this.aClass317_5027;
			byte[] bytes_10;
			synchronized (this.aClass317_5027) {
				bytes_10 = this.aClass317_5027.getFile(SharedConfigsType.aClass120_1474.id, i_1);
			}

			attributedefault_3 = new AttributeDefault();
			if (bytes_10 != null) {
				attributedefault_3.method7315(new RsByteBuffer(bytes_10), 864887749);
			}

			SoftCache softcache_9 = this.aClass229_5028;
			synchronized (this.aClass229_5028) {
				this.aClass229_5028.put(attributedefault_3, (long) i_1);
				return attributedefault_3;
			}
		}
	}

	public void method7070(int i_1) {
		SoftCache softcache_2 = this.aClass229_5028;
		synchronized (this.aClass229_5028) {
			this.aClass229_5028.method3859(-299334668);
		}
	}

	static char method7080(char c, int i) {
		switch (c) {
		case '\u00d2':
		case '\u00d3':
		case '\u00d4':
		case '\u00d5':
		case '\u00d6':
		case '\u00f2':
		case '\u00f3':
		case '\u00f4':
		case '\u00f5':
		case '\u00f6':
			return 'o';
		case '\u00c7':
		case '\u00e7':
			return 'c';
		case '\u00df':
			return 'b';
		case '\u00ff':
		case '\u0178':
			return 'y';
		case '#':
		case '[':
		case ']':
			return c;
		case '\u00c8':
		case '\u00c9':
		case '\u00ca':
		case '\u00cb':
		case '\u00e8':
		case '\u00e9':
		case '\u00ea':
		case '\u00eb':
			return 'e';
		case '\u00d1':
		case '\u00f1':
			return 'n';
		case '\u00c0':
		case '\u00c1':
		case '\u00c2':
		case '\u00c3':
		case '\u00c4':
		case '\u00e0':
		case '\u00e1':
		case '\u00e2':
		case '\u00e3':
		case '\u00e4':
			return 'a';
		case ' ':
		case '-':
		case '_':
		case '\u00a0':
			return '_';
		default:
			return Character.toLowerCase(c);
		case '\u00d9':
		case '\u00da':
		case '\u00db':
		case '\u00dc':
		case '\u00f9':
		case '\u00fa':
		case '\u00fb':
		case '\u00fc':
			return 'u';
		case '\u00cd':
		case '\u00ce':
		case '\u00cf':
		case '\u00ed':
		case '\u00ee':
		case '\u00ef':
			return 'i';
		}
	}

	public static void method7081(byte b_0) {
		Class365.setGameState(18, 1932929676);
		Class459.method7678(142230333);
		System.gc();
	}

	static final void method7082(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub10_8215.method12691(-1233469498) == 1 ? 1 : 0;
	}

	static void method7083(CS2Executor cs2executor_0, int i_1) {
		QuestDefinitions questdefinitions_2 = IndexLoaders.aClass242_4922.method4156(cs2executor_0.intStack[--cs2executor_0.intStackPtr], -1396181317);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = questdefinitions_2.anIntArray2964 == null ? 0 : questdefinitions_2.anIntArray2964.length;
	}

}
