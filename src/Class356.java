public class Class356 {

	static Class356 aClass356_4117 = new Class356();

	static Class356 aClass356_4118 = new Class356();

	static Class356 aClass356_4119 = new Class356();

	public int method6221(int i_1, int i_2, int i_3) {
		int i_4 = Class349.anInt4083 > i_2 ? Class349.anInt4083 : i_2;
		return this == aClass356_4117 ? 0 : (this == aClass356_4119 ? i_4 - i_1 : (this == aClass356_4118 ? (i_4 - i_1) / 2 : 0));
	}

	static int parseInt(CharSequence charsequence_0, int i_1) {
		if (i_1 >= 2 && i_1 <= 36) {
			boolean bool_4 = false;
			boolean bool_5 = false;
			int i_6 = 0;
			int i_7 = charsequence_0.length();
			for (int i_8 = 0; i_8 < i_7; i_8++) {
				char var_9 = charsequence_0.charAt(i_8);
				if (i_8 == 0) {
					if (var_9 == 45) {
						bool_4 = true;
						continue;
					}
					if (var_9 == 43) {
						continue;
					}
				}
				int i_11;
				if (var_9 >= 48 && var_9 <= 57) {
					i_11 = var_9 - 48;
				} else if (var_9 >= 65 && var_9 <= 90) {
					i_11 = var_9 - 55;
				} else {
					if (var_9 < 97 || var_9 > 122) {
						throw new NumberFormatException();
					}
					i_11 = var_9 - 87;
				}
				if (i_11 >= i_1) {
					throw new NumberFormatException();
				}
				if (bool_4) {
					i_11 = -i_11;
				}
				int i_10 = i_11 + i_6 * i_1;
				if (i_10 / i_1 != i_6) {
					throw new NumberFormatException();
				}
				i_6 = i_10;
				bool_5 = true;
			}
			if (!bool_5) {
				throw new NumberFormatException();
			} else {
				return i_6;
			}
		} else {
			throw new IllegalArgumentException("" + i_1);
		}
	}

	public static final void method6227(boolean bool_0, byte b_1) {
		if (!bool_0) {
			IndexLoaders.OVERLAY_LOADER.method11476();
			IndexLoaders.UNDERLAY_LOADER.method8026();
			IndexLoaders.IDENTITI_KIT_LOADER.method801();
			IndexLoaders.MAP_REGION_DECODER.method4436(-1471749977).method7895((byte) 113);
			IndexLoaders.NPC_INDEX_LOADER.method6836((byte) -66);
			IndexLoaders.ITEM_LOADER.method7150(-1855693683);
			IndexLoaders.ANIMATION_LOADER.method11204();
			IndexLoaders.SPOT_ANIM_LOADER.method8848();
			IndexLoaders.VARBIT_LOADER.method3903();
			IndexLoaders.VAR_LOADER.method6388();
			IndexLoaders.SCT24_LOADER.method7458();
			IndexLoaders.SCT25_LOADER.method8319();
			IndexLoaders.CLAN_VAR_LOADER.method6754();
			IndexLoaders.CLAN_VAR_SETTINGS_LOADER.method3924();
			IndexLoaders.RENDER_ANIM_LOADER.method3617();
			IndexLoaders.MAP_SPRITE_LOADER.method7174();
			IndexLoaders.WORLD_MAP_LOADER.method3699();
			IndexLoaders.PARAM_LOADER.method7070();
			IndexLoaders.SKYBOX_LOADER.method5070();
			IndexLoaders.SUN_LOADER.method916();
			IndexLoaders.LIGHT_INTENSITY_LOADER.method7306();
			IndexLoaders.CURSOR_LOADER.method7324();
			IndexLoaders.HITSPLAT_LOADER.method3604();
			IndexLoaders.HITBAR_LOADER.method5103();
			Preference_Sub8.method12679();
			Class520.method11161();
			Class487.aClass378_5752.method6410();
			Class413.method6939();
			if (HDWaterTile.aClass496_952 != ServerEnvironment.aClass496_5813) {
				for (int i_2 = 0; i_2 < Class339.aByteArrayArray3986.length; i_2++) {
					Class339.aByteArrayArray3986[i_2] = null;
				}
				client.anInt7173 = 0;
			}
			IndexLoaders.MAP_REGION_DECODER.method4435().method4040();
			Preference_Sub27.method12958();
			Class188.method3140();
			Class191.method3166();
			Class321.method5757();
			client.aClass229_5901.method3859();
			client.aClass229_7204.method3859();
			Class20.aClass229_191.method3859();
		}
		Class430.method7217();
		HostNameIdentifier.method482((byte) 38);
	}
}
