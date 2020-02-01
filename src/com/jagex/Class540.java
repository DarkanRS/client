package com.jagex;
public class Class540 {

	public static int[] anIntArray7136;

	static int anInt7137 = 0;

	static int anInt7135 = 0;

	Class540() throws Throwable {
		throw new Error();
	}

	public static Node_Sub36 method11595(int i_0) {
		if (Class291_Sub1.aClass482_3459 != null && Class291_Sub1.aClass460_8030 != null) {
			for (Node_Sub36 class282_sub36_1 = (Node_Sub36) Class291_Sub1.aClass460_8030.next(); class282_sub36_1 != null; class282_sub36_1 = (Node_Sub36) Class291_Sub1.aClass460_8030.next()) {
				MapAreaDefinitions worldmapareadefs_2 = Class291_Sub1.MAP_AREA_LOADER.getWorldMapDefs(class282_sub36_1.anInt7991, 461119623);
				if (worldmapareadefs_2 != null && worldmapareadefs_2.aBool2742 && worldmapareadefs_2.method3719(Class291_Sub1.PLAYER_VAR_PROVIDER, 1905436135)) {
					return class282_sub36_1;
				}
			}
			return null;
		} else {
			return null;
		}
	}
}
