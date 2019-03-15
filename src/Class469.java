import java.util.Iterator;

public class Class469 implements Iterator {

	public static boolean aBool5585;
	CacheableNode aClass282_Sub50_5582 = null;
	Queue aClass477_5584;
	CacheableNode aClass282_Sub50_5583;

	public CacheableNode method7790() {
		this.method7800();
		return (CacheableNode) this.next();
	}

	public Class469(Queue class477_1) {
		this.aClass477_5584 = class477_1;
		this.aClass282_Sub50_5583 = this.aClass477_5584.aClass282_Sub50_5629.aClass282_Sub50_8119;
		this.aClass282_Sub50_5582 = null;
	}

	public Object next() {
		CacheableNode cacheablenode_1 = this.aClass282_Sub50_5583;
		if (cacheablenode_1 == this.aClass477_5584.aClass282_Sub50_5629) {
			cacheablenode_1 = null;
			this.aClass282_Sub50_5583 = null;
		} else {
			this.aClass282_Sub50_5583 = cacheablenode_1.aClass282_Sub50_8119;
		}

		this.aClass282_Sub50_5582 = cacheablenode_1;
		return cacheablenode_1;
	}

	public boolean hasNext() {
		return this.aClass477_5584.aClass282_Sub50_5629 != this.aClass282_Sub50_5583;
	}

	public void remove() {
		if (this.aClass282_Sub50_5582 == null) {
			throw new IllegalStateException();
		} else {
			this.aClass282_Sub50_5582.method13452();
			this.aClass282_Sub50_5582 = null;
		}
	}

	void method7800() {
		this.aClass282_Sub50_5583 = this.aClass477_5584.aClass282_Sub50_5629.aClass282_Sub50_8119;
		this.aClass282_Sub50_5582 = null;
	}

	static void method7805(GraphicalRenderer graphicalrenderer_0, int i_1, int i_2, IComponentDefinitions icomponentdefinitions_3, Class455 class455_4, int i_5, int i_6) {
		for (int i_8 = 0; i_8 < client.anInt7211; i_8++) {
			Class282_Sub47 class282_sub47_9 = (Class282_Sub47) client.NPCS.get((long) client.anIntArray7212[i_8]);
			if (class282_sub47_9 != null) {
				NPC npc_10 = (NPC) class282_sub47_9.anObject8068;
				if (npc_10.hasDefinition(-438666523) && npc_10.plane == VertexNormal.myPlayer.plane) {
					NPCDefinitions npcdefinitions_11 = npc_10.definitions;
					if (npcdefinitions_11 != null && npcdefinitions_11.anIntArray4886 != null) {
						npcdefinitions_11 = npcdefinitions_11.method6884(Class158_Sub1.PLAYER_VAR_PROVIDER);
					}

					if (npcdefinitions_11 != null && npcdefinitions_11.aBool4864 && npcdefinitions_11.aBool4893) {
						Vector3 vector3_12 = npc_10.method11166().aClass385_3595;
						int i_13 = (int) vector3_12.x / 128 - i_1 / 128;
						int i_14 = (int) vector3_12.z / 128 - i_2 / 128;
						if (npcdefinitions_11.anInt4914 != -1) {
							Class158.method2731(graphicalrenderer_0, class455_4, icomponentdefinitions_3, i_5, i_6, i_13, i_14, npcdefinitions_11.anInt4914, -1804553865);
						} else {
							Class190.method3149(icomponentdefinitions_3, class455_4, i_5, i_6, i_13, i_14, Class250.aClass160Array3092[1], -1465246718);
						}
					}
				}
			}
		}

	}

}
