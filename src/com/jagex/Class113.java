package com.jagex;

public class Class113 {

    static Huffman HUFFMAN;

    public static ClanChannel CLAN_CHANNEL;

    Class113() throws Throwable {
        throw new Error();
    }

    static final void method1883() {
        for (ProjectileNode class282_sub50_sub16_1 = (ProjectileNode) client.PROJECTILES.head(); class282_sub50_sub16_1 != null; class282_sub50_sub16_1 = (ProjectileNode) client.PROJECTILES.next(380890791)) {
            Projectile class521_sub1_sub1_sub3_2 = class282_sub50_sub16_1.aTransform_Sub1_Sub1_Sub3_9839;
            if (client.cycles > class521_sub1_sub1_sub3_2.endTime) {
                class282_sub50_sub16_1.remove();
                class521_sub1_sub1_sub3_2.method15906();
            } else if (client.cycles >= class521_sub1_sub1_sub3_2.startTime) {
                class521_sub1_sub1_sub3_2.method15903();
                Vector3 vector3_5;
                if (class521_sub1_sub1_sub3_2.entityLockOn > 0) {
                    if (client.anInt7341 == 4) {
                        Entity animable_3 = Class82.CUTSCENE_ENTITIES[class521_sub1_sub1_sub3_2.entityLockOn - 1].method1342((byte) 22);
                        if (animable_3 != null) {
                            Vector3 vector3_4 = animable_3.method11166().coords;
                            if ((int) vector3_4.x >= 0 && (int) vector3_4.x < IndexLoaders.MAP_REGION_DECODER.getSizeX() * 512 && (int) vector3_4.z >= 0 && (int) vector3_4.z < IndexLoaders.MAP_REGION_DECODER.getSizeY() * 512) {
                                class521_sub1_sub1_sub3_2.start((int) vector3_4.x, (int) vector3_4.z, Class504.getTerrainHeightAtPos((int) vector3_4.x, (int) vector3_4.z, animable_3.plane) - class521_sub1_sub1_sub3_2.endHeight, client.cycles);
                            }
                        }
                    } else {
                        StringNode class282_sub47_7 = (StringNode) client.NPCS.get(class521_sub1_sub1_sub3_2.entityLockOn - 1);
                        if (class282_sub47_7 != null) {
                            NPC npc_8 = (NPC) class282_sub47_7.anObject8068;
                            vector3_5 = npc_8.method11166().coords;
                            if ((int) vector3_5.x >= 0 && (int) vector3_5.x < IndexLoaders.MAP_REGION_DECODER.getSizeX() * 512 && (int) vector3_5.z >= 0 && (int) vector3_5.z < IndexLoaders.MAP_REGION_DECODER.getSizeY() * 512) {
                                class521_sub1_sub1_sub3_2.start((int) vector3_5.x, (int) vector3_5.z, Class504.getTerrainHeightAtPos((int) vector3_5.x, (int) vector3_5.z, class521_sub1_sub1_sub3_2.plane) - class521_sub1_sub1_sub3_2.endHeight, client.cycles);
                            }
                        }
                    }
                }
                if (class521_sub1_sub1_sub3_2.entityLockOn < 0) {
                    int i_6 = -class521_sub1_sub1_sub3_2.entityLockOn - 1;
                    Player player_9;
                    if (i_6 == client.myPlayerIndex) {
                        player_9 = VertexNormal.MY_PLAYER;
                    } else {
                        player_9 = client.players[i_6];
                    }
                    if (player_9 != null) {
                        vector3_5 = player_9.method11166().coords;
                        if ((int) vector3_5.x >= 0 && (int) vector3_5.x < IndexLoaders.MAP_REGION_DECODER.getSizeX() * 512 && (int) vector3_5.z >= 0 && (int) vector3_5.z < IndexLoaders.MAP_REGION_DECODER.getSizeY() * 512) {
                            class521_sub1_sub1_sub3_2.start((int) vector3_5.x, (int) vector3_5.z, Class504.getTerrainHeightAtPos((int) vector3_5.x, (int) vector3_5.z, class521_sub1_sub1_sub3_2.plane) - class521_sub1_sub1_sub3_2.endHeight, client.cycles);
                        }
                    }
                }
                class521_sub1_sub1_sub3_2.method15910(client.anInt7261);
                IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3397(class521_sub1_sub1_sub3_2, true, -1495291324);
            }
        }
    }
}
