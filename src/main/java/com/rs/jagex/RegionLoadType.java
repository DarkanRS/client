package com.rs.jagex;

public enum RegionLoadType {

	LOAD_MAP_SCENE_BACKGROUND(false, false),
	aRegionLoadType_3153(true, false),
	LOAD_MAP_SCENE_NORMAL(false, false),
	aRegionLoadType_3155(true, false),
	aRegionLoadType_3156(true, false),
	aRegionLoadType_3157(true, true),
	aRegionLoadType_3161(true, true),
	aRegionLoadType_3152(false, false);

	public static void method4412(SongReference class116_0, int volume) {
		volume = volume * Class393.preferences.musicVolume.method12714() >> 8;
		if (class116_0 == null)
			VarBitDefinitions.method3805();
		else {
			HostNameIdentifier.method487(class116_0, volume);
			VarBitIndexLoader.method3912();
		}
	}
	public static AreadSound method4414(int soundId, int i_1, int i_2, int i_3, int i_4, boolean type, int i_6) {
		if ((type ? Class393.preferences.voiceOverVolume.method12714() : Class393.preferences.soundEffectVolume.method12714()) != 0 && i_1 != 0 && Class260.SOUNDS_SIZE < 50 && soundId != -1) {
			AreadSound class268_8 = new AreadSound((byte) (type ? 3 : 2), soundId, i_1, i_2, i_3, i_4, i_6, null);
			Class260.SOUNDS[++Class260.SOUNDS_SIZE - 1] = class268_8;
			return class268_8;
		}
		return null;
	}

	public static void method4415(int i_0, int i_1, int i_2, ObjectDefinition objectdefinitions_3) {
		for (Node_Sub48 class282_sub48_5 = (Node_Sub48) Node_Sub48.aClass482_8073.head(); class282_sub48_5 != null; class282_sub48_5 = (Node_Sub48) Node_Sub48.aClass482_8073.next())
			if (i_0 == class282_sub48_5.anInt8076 && class282_sub48_5.anInt8107 == i_1 << 9 && i_2 << 9 == class282_sub48_5.anInt8078 && class282_sub48_5.aClass478_8104.id == objectdefinitions_3.id) {
				if (class282_sub48_5.aNode_Sub15_Sub5_8099 != null) {
					Class79.aNode_Sub15_Sub4_783.method15276(class282_sub48_5.aNode_Sub15_Sub5_8099);
					class282_sub48_5.aNode_Sub15_Sub5_8099 = null;
				}
				if (class282_sub48_5.aNode_Sub15_Sub5_8096 != null) {
					Class79.aNode_Sub15_Sub4_783.method15276(class282_sub48_5.aNode_Sub15_Sub5_8096);
					class282_sub48_5.aNode_Sub15_Sub5_8096 = null;
				}
				class282_sub48_5.unlink();
				break;
			}
	}

	static void method4416() {
		Class187.anInt2363 = 0;
		Class187.MINIMAP_FLAG_X = -1;
		Class187.MINIMAP_FLAG_Y = -1;
	}

	boolean allowDynamicMapScene;

	boolean aBool3159;

	RegionLoadType(boolean allowDynamicMapScene, boolean bool_2) {
		this.allowDynamicMapScene = allowDynamicMapScene;
		aBool3159 = bool_2;
	}

	boolean allowDynamicMapScene() {
		return allowDynamicMapScene;
	}

	public boolean method4401() {
		return aBool3159;
	}
}
