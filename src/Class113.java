public class Class113 {

	static Huffman HUFFMAN;

	public static ClanChannel CLAN_CHANNEL;

	Class113() throws Throwable {
		throw new Error();
	}

	static final void method1883() {
		for (Class282_Sub50_Sub16 class282_sub50_sub16_1 = (Class282_Sub50_Sub16) client.aClass482_7333.head(); class282_sub50_sub16_1 != null; class282_sub50_sub16_1 = (Class282_Sub50_Sub16) client.aClass482_7333.next(380890791)) {
			Class521_Sub1_Sub1_Sub3 class521_sub1_sub1_sub3_2 = class282_sub50_sub16_1.aClass521_Sub1_Sub1_Sub3_9839;
			if (client.cycles > class521_sub1_sub1_sub3_2.anInt10392) {
				class282_sub50_sub16_1.remove();
				class521_sub1_sub1_sub3_2.method15906();
			} else if (client.cycles >= class521_sub1_sub1_sub3_2.anInt10393) {
				class521_sub1_sub1_sub3_2.method15903();
				Vector3 vector3_5;
				if (class521_sub1_sub1_sub3_2.anInt10382 > 0) {
					if (client.anInt7341 == 4) {
						Animable animable_3 = Class82.aClass75Array804[class521_sub1_sub1_sub3_2.anInt10382 - 1].method1342((byte) 22);
						if (animable_3 != null) {
							Vector3 vector3_4 = animable_3.method11166().aClass385_3595;
							if ((int) vector3_4.x >= 0 && (int) vector3_4.x < IndexLoaders.MAP_REGION_DECODER.getSizeX() * 512 && (int) vector3_4.z >= 0 && (int) vector3_4.z < IndexLoaders.MAP_REGION_DECODER.getSizeY() * 512) {
								class521_sub1_sub1_sub3_2.method15904((int) vector3_4.x, (int) vector3_4.z, Class504.method8389((int) vector3_4.x, (int) vector3_4.z, animable_3.plane, (byte) 107) - class521_sub1_sub1_sub3_2.anInt10384, client.cycles);
							}
						}
					} else {
						StringNode class282_sub47_7 = (StringNode) client.NPCS.get((long) (class521_sub1_sub1_sub3_2.anInt10382 - 1));
						if (class282_sub47_7 != null) {
							NPC npc_8 = (NPC) class282_sub47_7.anObject8068;
							vector3_5 = npc_8.method11166().aClass385_3595;
							if ((int) vector3_5.x >= 0 && (int) vector3_5.x < IndexLoaders.MAP_REGION_DECODER.getSizeX() * 512 && (int) vector3_5.z >= 0 && (int) vector3_5.z < IndexLoaders.MAP_REGION_DECODER.getSizeY() * 512) {
								class521_sub1_sub1_sub3_2.method15904((int) vector3_5.x, (int) vector3_5.z, Class504.method8389((int) vector3_5.x, (int) vector3_5.z, class521_sub1_sub1_sub3_2.plane, (byte) 124) - class521_sub1_sub1_sub3_2.anInt10384, client.cycles);
							}
						}
					}
				}
				if (class521_sub1_sub1_sub3_2.anInt10382 < 0) {
					int i_6 = -class521_sub1_sub1_sub3_2.anInt10382 - 1;
					Player player_9;
					if (i_6 == client.anInt7315) {
						player_9 = VertexNormal.myPlayer;
					} else {
						player_9 = client.players[i_6];
					}
					if (player_9 != null) {
						vector3_5 = player_9.method11166().aClass385_3595;
						if ((int) vector3_5.x >= 0 && (int) vector3_5.x < IndexLoaders.MAP_REGION_DECODER.getSizeX() * 512 && (int) vector3_5.z >= 0 && (int) vector3_5.z < IndexLoaders.MAP_REGION_DECODER.getSizeY() * 512) {
							class521_sub1_sub1_sub3_2.method15904((int) vector3_5.x, (int) vector3_5.z, Class504.method8389((int) vector3_5.x, (int) vector3_5.z, class521_sub1_sub1_sub3_2.plane, (byte) 88) - class521_sub1_sub1_sub3_2.anInt10384, client.cycles);
						}
					}
				}
				class521_sub1_sub1_sub3_2.method15910(client.anInt7261);
				IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3397(class521_sub1_sub1_sub3_2, true, -1495291324);
			}
		}
	}
}
