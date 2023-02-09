package com.rs.jagex;

public class Class357 implements Interface3 {

	static void method6233() {
		int[] ints_1 = Class197.PLAYER_INDICES;
		int i_2;
		for (i_2 = 0; i_2 < Class197.NUM_PLAYER_INDICES; i_2++) {
			PlayerEntity player_3 = client.PLAYER_LIST[ints_1[i_2]];
			if (player_3 != null)
				player_3.method15812();
		}
		for (i_2 = 0; i_2 < client.NPC_UPDATE_INDEX; i_2++) {
			long long_6 = client.NPC_UPDATE_INDICES[i_2];
			ObjectNode class282_sub47_5 = (ObjectNode) client.NPC_MAP.get(long_6);
			if (class282_sub47_5 != null)
				((PathingEntity) class282_sub47_5.anObject8068).method15812();
		}
		if (client.anInt7341 == 4)
			for (i_2 = 0; i_2 < Class82.CUTSCENE_ENTITIES.length; i_2++) {
				CutsceneEntity class75_8 = Class82.CUTSCENE_ENTITIES[i_2];
				if (class75_8.initialized)
					class75_8.method1342().method15812();
			}
	}

	public int anInt4124;

	public Class356 aClass356_4121;

	public Class353 aClass353_4122;

	public int anInt4123;

	public int anInt4120;

	Class357(int i_1, Class356 class356_2, Class353 class353_3, int i_4, int i_5) {
		anInt4124 = i_1;
		aClass356_4121 = class356_2;
		aClass353_4122 = class353_3;
		anInt4123 = i_4;
		anInt4120 = i_5;
	}

	@Override
	public Class60 method24() {
		return Class60.aClass60_606;
	}

	@Override
	public Class60 method25() {
		return Class60.aClass60_606;
	}
}
