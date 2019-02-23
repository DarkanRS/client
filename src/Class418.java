import java.io.File;

public class Class418 {

	Class427 aClass427_4998;
	public static int anInt4999;
	public int anInt4995;
	public int anInt4997;
	public boolean aBool4996 = false;

	void method7008(RsByteBuffer rsbytebuffer_1, int i_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method7009(rsbytebuffer_1, i_3, -1539480331);
		}
	}

	void method7009(RsByteBuffer rsbytebuffer_1, int i_2, int i_3) {
		if (i_2 == 1) {
			this.anInt4995 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 2) {
			this.anInt4997 = rsbytebuffer_1.read24BitUnsignedInteger();
		} else if (i_2 == 3) {
			this.aBool4996 = true;
		} else if (i_2 == 4) {
			this.anInt4995 = -1;
		}

	}

	public NativeSprite method7010(GraphicalRenderer graphicalrenderer_1, int i_2, boolean bool_3, byte b_4) {
		long long_5 = (long) (this.anInt4995 | i_2 << 16 | (bool_3 ? 262144 : 0) | graphicalrenderer_1.rendererId << 19);
		NativeSprite nativesprite_7 = (NativeSprite) this.aClass427_4998.aClass229_5122.get(long_5);
		if (nativesprite_7 != null) {
			return nativesprite_7;
		} else if (!this.aClass427_4998.aClass317_5118.method5661(this.anInt4995, -2124549990)) {
			return null;
		} else {
			Class91 class91_8 = Class91.method1522(this.aClass427_4998.aClass317_5118, this.anInt4995, 0);
			if (class91_8 != null) {
				class91_8.anInt959 = 0;
				class91_8.anInt958 = 0;
				class91_8.anInt956 = 0;
				class91_8.anInt953 = 0;
				if (bool_3) {
					class91_8.method1526();
				}

				for (int i_12 = 0; i_12 < i_2; i_12++) {
					class91_8.method1527();
				}
			}

			nativesprite_7 = graphicalrenderer_1.method8444(class91_8, true);
			if (nativesprite_7 != null) {
				this.aClass427_4998.aClass229_5122.put(nativesprite_7, long_5);
			}

			return nativesprite_7;
		}
	}

	public boolean method7015(int i_1) {
		return this.aClass427_4998.aClass317_5118.method5661(this.anInt4995, 2025308521);
	}

	static final void method7021(CS2Executor cs2executor_0, int i_1) {
		boolean bool_2 = false;
		String str_3 = "";
		if (cs2executor_0.aClass191_7008 != null && cs2executor_0.aClass191_7008.method3154((byte) -45)) {
			File file_4 = cs2executor_0.aClass191_7008.method3161(-2069377284);
			if (file_4 != null) {
				str_3 = file_4.getPath();
				if (str_3 == null) {
					str_3 = "";
				}
			}

			bool_2 = true;
			cs2executor_0.aClass191_7008 = null;
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = bool_2 ? 1 : 0;
		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = str_3;
	}

	static void method7022(byte b_0) {
		Class9.lobbyStage = 273;
		Class9.aClass184_73 = client.aClass184_7475;
		if (client.aByteArray7152 != null) {
			RsByteBuffer rsbytebuffer_1 = new RsByteBuffer(client.aByteArray7152);
			Class9.aLong77 = rsbytebuffer_1.readLong(1246778050);
			Class9.aLong86 = rsbytebuffer_1.readLong(441994271);
		}

		if (Class9.aLong77 < 0L) {
			Class8_Sub1.method13784(35, -90187895);
		} else {
			Class455.method7558(false, true, "", "", Class9.aLong77);
		}

	}

}
