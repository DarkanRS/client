import java.util.Iterator;

public class Class469 implements Iterator {

	public static boolean aBool5585;
	CacheableNode aCacheableNode_5582 = null;
	Queue aClass477_5584;
	CacheableNode aCacheableNode_5583;

	public CacheableNode method7790() {
		this.method7800();
		return (CacheableNode) this.next();
	}

	public Class469(Queue class477_1) {
		this.aClass477_5584 = class477_1;
		this.aCacheableNode_5583 = this.aClass477_5584.aCacheableNode_5629.aCacheableNode_8119;
		this.aCacheableNode_5582 = null;
	}

	public Object next() {
		CacheableNode cacheablenode_1 = this.aCacheableNode_5583;
		if (cacheablenode_1 == this.aClass477_5584.aCacheableNode_5629) {
			cacheablenode_1 = null;
			this.aCacheableNode_5583 = null;
		} else {
			this.aCacheableNode_5583 = cacheablenode_1.aCacheableNode_8119;
		}

		this.aCacheableNode_5582 = cacheablenode_1;
		return cacheablenode_1;
	}

	public boolean hasNext() {
		return this.aClass477_5584.aCacheableNode_5629 != this.aCacheableNode_5583;
	}

	public void remove() {
		if (this.aCacheableNode_5582 == null) {
			throw new IllegalStateException();
		} else {
			this.aCacheableNode_5582.method13452();
			this.aCacheableNode_5582 = null;
		}
	}

	void method7800() {
		this.aCacheableNode_5583 = this.aClass477_5584.aCacheableNode_5629.aCacheableNode_8119;
		this.aCacheableNode_5582 = null;
	}

	static void method7805(GraphicalRenderer graphicalrenderer_0, int i_1, int i_2, IComponentDefinitions icomponentdefinitions_3, Class455 class455_4, int i_5, int i_6) {
		for (int i_8 = 0; i_8 < client.NPC_UPDATE_INDEX; i_8++) {
			StringNode class282_sub47_9 = (StringNode) client.NPCS.get((long) client.NPC_UPDATE_INDICES[i_8]);
			if (class282_sub47_9 != null) {
				NPC npc_10 = (NPC) class282_sub47_9.anObject8068;
				if (npc_10.hasDefinition(-438666523) && npc_10.plane == VertexNormal.MY_PLAYER.plane) {
					NPCDefinitions npcdefinitions_11 = npc_10.definitions;
					if (npcdefinitions_11 != null && npcdefinitions_11.transformTo != null) {
						npcdefinitions_11 = npcdefinitions_11.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER);
					}

					if (npcdefinitions_11 != null && npcdefinitions_11.isVisibleOnMap && npcdefinitions_11.visible) {
						Vector3 vector3_12 = npc_10.method11166().coords;
						int i_13 = (int) vector3_12.x / 128 - i_1 / 128;
						int i_14 = (int) vector3_12.z / 128 - i_2 / 128;
						if (npcdefinitions_11.anInt4914 != -1) {
							Class158.method2731(graphicalrenderer_0, class455_4, icomponentdefinitions_3, i_5, i_6, i_13, i_14, npcdefinitions_11.anInt4914, -1804553865);
						} else {
							Class190.method3149(icomponentdefinitions_3, class455_4, i_5, i_6, i_13, i_14, Class250.aNativeSpriteArray3092[1], -1465246718);
						}
					}
				}
			}
		}

	}

}
