
public class StaticMethods {

	public static boolean method2084(Index index_0, Index index_1, Index index_2, Node_Sub15_Sub2 class282_sub15_sub2_3, Class253 class253_4) {
		Class148.aClass317_1737 = index_0;
		Class148.aClass317_1731 = index_1;
		Class148.aClass317_1732 = index_2;
		Class148.aNode_Sub15_Sub2_1735 = class282_sub15_sub2_3;
		Class502.aClass253_5830 = class253_4;
		HashTable.anIntArray5449 = new int[16];
		for (int i_6 = 0; i_6 < 16; i_6++) {
			HashTable.anIntArray5449[i_6] = 255;
		}
		return true;
	}

	public static void method2094(int i_0) {
		Class291_Sub1.anInt8018 = -1;
		Class291_Sub1.anInt8026 = i_0;
		Class361.anInt4185 = 3;
		CutsceneAction_Sub9.anInt9282 = 100;
	}

	static void method2095(CacheableNode_Sub7 class282_sub50_sub7_0) {
		if (!Class20.aBool161) {
			class282_sub50_sub7_0.remove();
			--Class20.anInt169;
			if (!class282_sub50_sub7_0.aBool9586) {
				long long_2 = class282_sub50_sub7_0.aLong9580;
				CacheableNode_Sub15 class282_sub50_sub15_4;
				for (class282_sub50_sub15_4 = (CacheableNode_Sub15) Class20.aClass465_172.get(long_2); class282_sub50_sub15_4 != null && !class282_sub50_sub15_4.aString9771.equals(class282_sub50_sub7_0.aString9588); class282_sub50_sub15_4 = (CacheableNode_Sub15) Class20.aClass465_172.method7747(-1584347554)) {
					;
				}
				if (class282_sub50_sub15_4 != null && class282_sub50_sub15_4.method15249(class282_sub50_sub7_0, (byte) 17)) {
					Class13.method503(class282_sub50_sub15_4, 1715883578);
				}
			} else {
				for (CacheableNode_Sub15 class282_sub50_sub15_5 = (CacheableNode_Sub15) Class20.aClass477_182.method7941(); class282_sub50_sub15_5 != null; class282_sub50_sub15_5 = (CacheableNode_Sub15) Class20.aClass477_182.method7955(194809254)) {
					if (class282_sub50_sub15_5.aString9771.equals(class282_sub50_sub7_0.aString9588)) {
						boolean bool_3 = false;
						for (CacheableNode_Sub7 class282_sub50_sub7_6 = (CacheableNode_Sub7) class282_sub50_sub15_5.aClass477_9770.method7941(); class282_sub50_sub7_6 != null; class282_sub50_sub7_6 = (CacheableNode_Sub7) class282_sub50_sub15_5.aClass477_9770.method7955(444396099)) {
							if (class282_sub50_sub7_6 == class282_sub50_sub7_0) {
								if (class282_sub50_sub15_5.method15249(class282_sub50_sub7_0, (byte) 111)) {
									Class13.method503(class282_sub50_sub15_5, 1035797942);
								}
								bool_3 = true;
								break;
							}
						}
						if (bool_3) {
							break;
						}
					}
				}
			}
		}
	}

}
