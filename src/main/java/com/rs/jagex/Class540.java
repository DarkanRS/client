package com.rs.jagex;

public class Class540 {

	public static int[] anIntArray7136;

	static int anInt7137;

	static int anInt7135;

	public static Node_Sub36 method11595() {
		if (Class291.aClass482_3459 != null && Class291_Sub1.aClass460_8030 != null)
			for (Node_Sub36 class282_sub36_1 = (Node_Sub36) Class291_Sub1.aClass460_8030.next(); class282_sub36_1 != null; class282_sub36_1 = (Node_Sub36) Class291_Sub1.aClass460_8030.next()) {
				MapAreaDefinitions worldmapareadefs_2 = Class291.MAP_AREA_LOADER.getWorldMapDefs(class282_sub36_1.anInt7991);
				if (worldmapareadefs_2 != null && worldmapareadefs_2.aBool2742 && worldmapareadefs_2.shouldDraw(Class291.PLAYER_VAR_PROVIDER))
					return class282_sub36_1;
			}
		return null;
	}

	Class540() throws Throwable {
		throw new Error();
	}
}
