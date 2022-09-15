package com.jagex;

public class EntityNode_Sub1 extends EntityNode {

	public static void method12424(int i_0) {
		Class149.anInt1744 = i_0;
		LRUCache softcache_2 = PlayerModel.aClass229_2930;
		synchronized (PlayerModel.aClass229_2930) {
			PlayerModel.aClass229_2930.method3859();
		}

		softcache_2 = PlayerModel.aClass229_2920;
		synchronized (PlayerModel.aClass229_2920) {
			PlayerModel.aClass229_2920.method3859();
		}
	}
	public EntityNode_Sub1 aEntityNode_Sub1_7706;

	public EntityNode_Sub1 aEntityNode_Sub1_7707;

	public void method12423() {
		if (aEntityNode_Sub1_7707 != null) {
			aEntityNode_Sub1_7707.aEntityNode_Sub1_7706 = aEntityNode_Sub1_7706;
			aEntityNode_Sub1_7706.aEntityNode_Sub1_7707 = aEntityNode_Sub1_7707;
			aEntityNode_Sub1_7706 = null;
			aEntityNode_Sub1_7707 = null;
		}

	}

}
