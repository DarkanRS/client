public class EntityNode_Sub7 extends EntityNode {

	static GameTipsLoader GAME_TIPS_LOADER;
	EntityList aClass457_7861 = new EntityList();
	public HitbarDefinitions aClass198_7863;

	public EntityNode_Sub7(HitbarDefinitions hitbardefinitions_1) {
		this.aClass198_7863 = hitbardefinitions_1;
	}

	public EntityNode_Sub3 method12600(int i_1) {
		EntityNode_Sub3 class275_sub3_3 = (EntityNode_Sub3) this.aClass457_7861.method7659();
		if (class275_sub3_3 != null && class275_sub3_3.anInt7811 <= i_1) {
			for (EntityNode_Sub3 class275_sub3_4 = (EntityNode_Sub3) this.aClass457_7861.method7650((byte) 12); class275_sub3_4 != null && class275_sub3_4.anInt7811 <= i_1; class275_sub3_4 = (EntityNode_Sub3) this.aClass457_7861.method7650((byte) 86)) {
				class275_sub3_3.method4887();
				class275_sub3_3 = class275_sub3_4;
			}

			if (this.aClass198_7863.anInt2443 + class275_sub3_3.anInt7811 + class275_sub3_3.anInt7812 > i_1) {
				return class275_sub3_3;
			} else {
				class275_sub3_3.method4887();
				return null;
			}
		} else {
			return null;
		}
	}

	public void method12601(int i_1, int i_2, int i_3, int i_4, int i_5) {
		EntityNode_Sub3 class275_sub3_6 = null;
		int i_7 = 0;

		for (EntityNode_Sub3 class275_sub3_8 = (EntityNode_Sub3) this.aClass457_7861.method7659(); class275_sub3_8 != null; class275_sub3_8 = (EntityNode_Sub3) this.aClass457_7861.method7650((byte) 78)) {
			++i_7;
			if (class275_sub3_8.anInt7811 == i_1) {
				class275_sub3_8.method12566(i_1, i_2, i_3, i_4);
				return;
			}

			if (class275_sub3_8.anInt7811 <= i_1) {
				class275_sub3_6 = class275_sub3_8;
			}
		}

		if (class275_sub3_6 == null) {
			if (i_7 < QuickchatFiller.ENTITY_DEFAULTS.anInt7030) {
				this.aClass457_7861.method7647(new EntityNode_Sub3(i_1, i_2, i_3, i_4), -2075315301);
			}
		} else {
			Class516.method8866(new EntityNode_Sub3(i_1, i_2, i_3, i_4), class275_sub3_6, -653430478);
			if (i_7 >= QuickchatFiller.ENTITY_DEFAULTS.anInt7030) {
				this.aClass457_7861.method7659().method4887();
			}
		}

	}

	public boolean method12602() {
		return this.aClass457_7861.method7666(1726407188);
	}

	public static final void method12606(byte b_0) {
		for (int i_1 = 0; i_1 < 5; i_1++) {
			client.aBoolArray7431[i_1] = false;
		}

		client.anInt7277 = -1;
		client.anInt7448 = -1;
		LinkedNodeList.anInt5606 = 0;
		Class501.anInt5828 = 0;
		NativeLibraryLoader.anInt3240 = 1;
		Class86.anInt833 = -1;
		PingRequester.anInt5864 = -1;
		client.anInt7429 = client.cycles;
		Class186.anInt2349 = IdentitiKitIndexLoader.anInt361;
		Transform_Sub1_Sub2.anInt9461 = Class109_Sub1.anInt9384;
		Node_Sub15_Sub1.anInt9575 = Class246.anInt3029;
		ClipMap.anInt3968 = Class293.anInt3512;
		ParamIndexLoader.anInt5029 = AnimationDefinitions.anInt5930;
	}

}
