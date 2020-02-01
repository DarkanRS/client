package com.jagex;
public class Class357 implements Interface3 {

	public int anInt4124;

	public Class356 aClass356_4121;

	public Class353 aClass353_4122;

	public int anInt4123;

	public int anInt4120;

	public Class60 method24() {
		return Class60.aClass60_606;
	}

	Class357(int i_1, Class356 class356_2, Class353 class353_3, int i_4, int i_5) {
		this.anInt4124 = i_1;
		this.aClass356_4121 = class356_2;
		this.aClass353_4122 = class353_3;
		this.anInt4123 = i_4;
		this.anInt4120 = i_5;
	}

	public Class60 method25() {
		return Class60.aClass60_606;
	}

	static final void method6233() {
		int[] ints_1 = Class197.PLAYER_INDICES;
		int i_2;
		for (i_2 = 0; i_2 < Class197.NUM_PLAYER_INDICES; i_2++) {
			Player player_3 = client.players[ints_1[i_2]];
			if (player_3 != null) {
				player_3.method15812(-942538273);
			}
		}
		for (i_2 = 0; i_2 < client.NPC_UPDATE_INDEX; i_2++) {
			long long_6 = (long) client.NPC_UPDATE_INDICES[i_2];
			StringNode class282_sub47_5 = (StringNode) client.NPCS.get(long_6);
			if (class282_sub47_5 != null) {
				((Entity) class282_sub47_5.anObject8068).method15812(655110500);
			}
		}
		if (client.anInt7341 == 4) {
			for (i_2 = 0; i_2 < Class82.CUTSCENE_ENTITIES.length; i_2++) {
				CutsceneEntity class75_8 = Class82.CUTSCENE_ENTITIES[i_2];
				if (class75_8.initialized) {
					class75_8.method1342((byte) 50).method15812(298889820);
				}
			}
		}
	}
}
