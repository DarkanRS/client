package com.jagex;
public class EntityNode_Sub1 extends EntityNode {

	public EntityNode_Sub1 aEntityNode_Sub1_7706;
	public EntityNode_Sub1 aEntityNode_Sub1_7707;

	public void method12423(byte b_1) {
		if (this.aEntityNode_Sub1_7707 != null) {
			this.aEntityNode_Sub1_7707.aEntityNode_Sub1_7706 = this.aEntityNode_Sub1_7706;
			this.aEntityNode_Sub1_7706.aEntityNode_Sub1_7707 = this.aEntityNode_Sub1_7707;
			this.aEntityNode_Sub1_7706 = null;
			this.aEntityNode_Sub1_7707 = null;
		}

	}

	public static void method12424(int i_0) {
		Class149.anInt1744 = i_0;
		SoftCache softcache_2 = PlayerAppearance.aClass229_2930;
		synchronized (PlayerAppearance.aClass229_2930) {
			PlayerAppearance.aClass229_2930.method3859();
		}

		softcache_2 = PlayerAppearance.aClass229_2920;
		synchronized (PlayerAppearance.aClass229_2920) {
			PlayerAppearance.aClass229_2920.method3859();
		}
	}

}
