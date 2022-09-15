package com.jagex;

import java.io.File;

public class Class499 {

	static void method8333(int i_0) {
		LinkedNodeList.method7887();
		int i_2 = IndexLoaders.VAR_LOADER.method6384(i_0).anInt4327;
		if (i_2 != 0) {
			int i_3 = Class158_Sub1.PLAYER_VAR_PROVIDER.vars[i_0];
			if (i_2 == 5)
				client.anInt7339 = i_3;

			if (i_2 == 6)
				client.anInt7351 = i_3;
		}

	}

	static void method8334(File file_0) {
		Class271.aFile3327 = file_0;
		if (!Class271.aFile3327.exists())
			throw new RuntimeException("");
		Class271.aBool3328 = true;
	}

	Class499() throws Throwable {
		throw new Error();
	}

}
