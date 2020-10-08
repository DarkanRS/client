package com.jagex;

import java.util.Iterator;

public class Class469 implements Iterator {

    public static boolean LOYALTY_ENABLED;
    CacheableNode aCacheableNode_5582;
    Queue aClass477_5584;
    CacheableNode aCacheableNode_5583;

    public Class469(Queue class477_1) {
        aClass477_5584 = class477_1;
        aCacheableNode_5583 = aClass477_5584.aCacheableNode_5629.aCacheableNode_8119;
        aCacheableNode_5582 = null;
    }

    static void method7805(AbstractRenderer graphicalrenderer_0, int i_1, int i_2, IComponentDefinitions icomponentdefinitions_3, Class455 class455_4, int i_5, int i_6) {
        for (int i_8 = 0; i_8 < client.NPC_UPDATE_INDEX; i_8++) {
            ObjectNode class282_sub47_9 = (ObjectNode) client.NPC_MAP.get(client.NPC_UPDATE_INDICES[i_8]);
            if (class282_sub47_9 != null) {
                NPCEntity npc_10 = (NPCEntity) class282_sub47_9.anObject8068;
                if (npc_10.hasDefinition() && npc_10.plane == VertexNormal.MY_PLAYER.plane) {
                    NPCDefinitions npcdefinitions_11 = npc_10.definitions;
                    if (npcdefinitions_11 != null && npcdefinitions_11.transformTo != null) {
                        npcdefinitions_11 = npcdefinitions_11.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
                    }

                    if (npcdefinitions_11 != null && npcdefinitions_11.isVisibleOnMap && npcdefinitions_11.visible) {
                        Vector3 vector3_12 = npc_10.method11166().coords;
                        int i_13 = (int) vector3_12.x / 128 - i_1 / 128;
                        int i_14 = (int) vector3_12.z / 128 - i_2 / 128;
                        if (npcdefinitions_11.anInt4914 != -1) {
                            Class158.method2731(graphicalrenderer_0, class455_4, icomponentdefinitions_3, i_5, i_6, i_13, i_14, npcdefinitions_11.anInt4914);
                        } else {
                            Class190.method3149(icomponentdefinitions_3, class455_4, i_5, i_6, i_13, i_14, Class250.aNativeSpriteArray3092[1]);
                        }
                    }
                }
            }
        }

    }

    public CacheableNode method7790() {
        method7800();
        return (CacheableNode) next();
    }

    @Override
    public Object next() {
        CacheableNode cacheablenode_1 = aCacheableNode_5583;
        if (cacheablenode_1 == aClass477_5584.aCacheableNode_5629) {
            cacheablenode_1 = null;
            aCacheableNode_5583 = null;
        } else {
            aCacheableNode_5583 = cacheablenode_1.aCacheableNode_8119;
        }

        aCacheableNode_5582 = cacheablenode_1;
        return cacheablenode_1;
    }

    @Override
    public boolean hasNext() {
        return aClass477_5584.aCacheableNode_5629 != aCacheableNode_5583;
    }

    @Override
    public void remove() {
        if (aCacheableNode_5582 == null) {
            throw new IllegalStateException();
        } else {
            aCacheableNode_5582.method13452();
            aCacheableNode_5582 = null;
        }
    }

    void method7800() {
        aCacheableNode_5583 = aClass477_5584.aCacheableNode_5629.aCacheableNode_8119;
        aCacheableNode_5582 = null;
    }

}
