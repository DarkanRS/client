public class Class94 {

	Class94() throws Throwable {
		throw new Error();
	}

	static String prependOS(String string_0) {
		return Class396.OS_NAME.startsWith("win") ? string_0 + ".dll" : (Class396.OS_NAME.startsWith("linux") ? "lib" + string_0 + ".so" : (Class396.OS_NAME.startsWith("mac") ? "lib" + string_0 + ".dylib" : null));
	}

	static RsByteBuffer method1587(byte b_0) {
		RsByteBuffer rsbytebuffer_1 = new RsByteBuffer(518);
		Class500.anIntArray5827 = new int[4];
		Class500.anIntArray5827[0] = (int) (Math.random() * 9.9999999E7D);
		Class500.anIntArray5827[1] = (int) (Math.random() * 9.9999999E7D);
		Class500.anIntArray5827[2] = (int) (Math.random() * 9.9999999E7D);
		Class500.anIntArray5827[3] = (int) (Math.random() * 9.9999999E7D);
		rsbytebuffer_1.writeByte(10);
		rsbytebuffer_1.writeInt(Class500.anIntArray5827[0]);
		rsbytebuffer_1.writeInt(Class500.anIntArray5827[1]);
		rsbytebuffer_1.writeInt(Class500.anIntArray5827[2]);
		rsbytebuffer_1.writeInt(Class500.anIntArray5827[3]);
		return rsbytebuffer_1;
	}

	public static FontMetrics getFontMetrics(Index index_0, int i_1, int i_3) {
		byte[] bytes_4 = index_0.getFile(i_1, 0);
		return bytes_4 == null ? null : new FontMetrics(bytes_4);
	}

	public static void method1589() {
		int i_1 = 0;
		if (Class393.preferences.aClass468_Sub19_8204.method12786() == 1) {
			i_1 |= 0x1;
			i_1 |= 0x10;
			i_1 |= 0x20;
			i_1 |= 0x2;
			i_1 |= 0x4;
		}
		if (Class393.preferences.textures.method12873(477680375) == 0) {
			i_1 |= 0x40;
		}
		Class468_Sub12.method12710(i_1);
		IndexLoaders.MAP_REGION_DECODER.method4436(-2047295764).method7893(i_1, 2082493334);
		IndexLoaders.MAP_REGION_LOADER_THREAD.method6052((short) -5779).method4436(-1603453217).method7893(i_1, -79480655);
		IndexLoaders.ITEM_LOADER.method7153(i_1);
		IndexLoaders.NPC_INDEX_LOADER.method6829(i_1);
		IndexLoaders.SPOT_ANIM_LOADER.method8846(i_1);
		SunDefinitions.method851(i_1);
		Game.method8204(i_1);
		Huffman.method1982(i_1);
		Class275_Sub1.method12424(i_1);
		Class345.method6143(i_1);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -126);
	}
}
