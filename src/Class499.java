import java.io.File;

public class Class499 {

	Class499() throws Throwable {
		throw new Error();
	}

	static final void method8333(int i_0, int i_1) {
		LinkedNodeList.method7887(-1685527133);
		int i_2 = IndexLoaders.aClass377_1065.method6384(i_0, -822529502).anInt4327;
		if (i_2 != 0) {
			int i_3 = Class158_Sub1.PLAYER_VAR_PROVIDER.anIntArray26[i_0];
			if (i_2 == 5) {
				client.anInt7339 = i_3;
			}

			if (i_2 == 6) {
				client.anInt7351 = i_3;
			}
		}

	}

	static void method8334(File file_0, int i_1) {
		Class271.aFile3327 = file_0;
		if (!Class271.aFile3327.exists()) {
			throw new RuntimeException("");
		} else {
			Class271.aBool3328 = true;
		}
	}

}
