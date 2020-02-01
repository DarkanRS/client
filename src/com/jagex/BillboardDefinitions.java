package com.jagex;
public class BillboardDefinitions {

	static Index BILLBOARD_INDEX;
	static SoftCache BILLBOARD_CACHE = new SoftCache(64);
	public int anInt4055 = -1;
	public int anInt4054 = 64;
	public int anInt4050 = 64;
	public int anInt4051 = 2;
	public int anInt4057 = 1;
	public boolean aBool4058 = false;
	public boolean aBool4059 = false;

	void decode(RsByteBuffer rsbytebuffer_1, int i_2) {
		while (true) {
			int i_4 = rsbytebuffer_1.readUnsignedByte();
			if (i_4 == 0) {
				return;
			}
			this.method6164(rsbytebuffer_1, i_4, i_2);
		}
	}

	void method6164(RsByteBuffer rsbytebuffer_1, int i_2, int i_3) {
		if (i_2 == 1) {
			this.anInt4055 = rsbytebuffer_1.readUnsignedShort();
			if (this.anInt4055 == 65535) {
				this.anInt4055 = -1;
			}
		} else if (i_2 == 2) {
			this.anInt4054 = rsbytebuffer_1.readUnsignedShort() + 1;
			this.anInt4050 = rsbytebuffer_1.readUnsignedShort() + 1;
		} else if (i_2 == 3) {
			rsbytebuffer_1.readByte();
		} else if (i_2 == 4) {
			this.anInt4051 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 5) {
			this.anInt4057 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 6) {
			this.aBool4058 = true;
		} else if (i_2 == 7) {
			this.aBool4059 = true;
		}
	}

	static final void method6170(int i_0, int i_1) {
		if (Class291_Sub1.aFloat3468 < Class291_Sub1.aFloat3462) {
			Class291_Sub1.aFloat3468 = (float) ((double) Class291_Sub1.aFloat3468 + (double) Class291_Sub1.aFloat3468 / 30.0D);
			if (Class291_Sub1.aFloat3468 > Class291_Sub1.aFloat3462) {
				Class291_Sub1.aFloat3468 = Class291_Sub1.aFloat3462;
			}
			Class89.method1502(-463679465);
			Class291_Sub1.anInt3469 = (int) Class291_Sub1.aFloat3468 >> 1;
			Class291_Sub1.aByteArrayArrayArray3464 = CircularBuffer.method8246(Class291_Sub1.anInt3469);
		} else if (Class291_Sub1.aFloat3468 > Class291_Sub1.aFloat3462) {
			Class291_Sub1.aFloat3468 = (float) ((double) Class291_Sub1.aFloat3468 - (double) Class291_Sub1.aFloat3468 / 30.0D);
			if (Class291_Sub1.aFloat3468 < Class291_Sub1.aFloat3462) {
				Class291_Sub1.aFloat3468 = Class291_Sub1.aFloat3462;
			}
			Class89.method1502(372349674);
			Class291_Sub1.anInt3469 = (int) Class291_Sub1.aFloat3468 >> 1;
			Class291_Sub1.aByteArrayArrayArray3464 = CircularBuffer.method8246(Class291_Sub1.anInt3469);
		}
		if (Class291_Sub1.anInt8014 != -1 && Class291_Sub1.anInt8016 != -1) {
			int i_3 = Class291_Sub1.anInt8014 - MapSpriteIndexLoader.anInt5123;
			if (i_3 < 2 || i_3 > 2) {
				i_3 /= 8;
			}
			int i_4 = Class291_Sub1.anInt8016 - Class475.anInt5624;
			if (i_4 < 2 || i_4 > 2) {
				i_4 /= 8;
			}
			MapSpriteIndexLoader.anInt5123 += i_3;
			Class475.anInt5624 += i_4;
			if (i_3 == 0 && i_4 == 0) {
				Class291_Sub1.anInt8014 = -1;
				Class291_Sub1.anInt8016 = -1;
			}
			Class89.method1502(-140705519);
		}
		if (Class361.anInt4185 > 0) {
			--CutsceneAction_Sub9.anInt9282;
			if (CutsceneAction_Sub9.anInt9282 == 0) {
				--Class361.anInt4185;
				CutsceneAction_Sub9.anInt9282 = 100;
			}
		} else {
			Class291_Sub1.anInt8018 = -1;
			Class291_Sub1.anInt8026 = -1;
		}
		if (Class291_Sub1.aBool8022 && QuickChatMessage.aClass482_4049 != null) {
			for (Node_Sub33 class282_sub33_5 = (Node_Sub33) QuickChatMessage.aClass482_4049.head(); class282_sub33_5 != null; class282_sub33_5 = (Node_Sub33) QuickChatMessage.aClass482_4049.next(-731653338)) {
				MapAreaDefinitions worldmapareadefs_6 = Class291_Sub1.MAP_AREA_LOADER.getWorldMapDefs(class282_sub33_5.aNode_Sub36_7835.anInt7991, 1327385371);
				if (class282_sub33_5.method12577(i_0, i_1)) {
					if (worldmapareadefs_6.aStringArray2740 != null) {
						if (worldmapareadefs_6.aStringArray2740[4] != null) {
							PlayerAppearance.method4032(worldmapareadefs_6.aStringArray2740[4], worldmapareadefs_6.aString2732, -1, 1012, -1, (long) class282_sub33_5.aNode_Sub36_7835.anInt7991, worldmapareadefs_6.anInt2718, 0, true, false, (long) class282_sub33_5.aNode_Sub36_7835.anInt7991, false, -1941866254);
						}
						if (worldmapareadefs_6.aStringArray2740[3] != null) {
							PlayerAppearance.method4032(worldmapareadefs_6.aStringArray2740[3], worldmapareadefs_6.aString2732, -1, 1011, -1, (long) class282_sub33_5.aNode_Sub36_7835.anInt7991, worldmapareadefs_6.anInt2718, 0, true, false, (long) class282_sub33_5.aNode_Sub36_7835.anInt7991, false, -1376328054);
						}
						if (worldmapareadefs_6.aStringArray2740[2] != null) {
							PlayerAppearance.method4032(worldmapareadefs_6.aStringArray2740[2], worldmapareadefs_6.aString2732, -1, 1010, -1, (long) class282_sub33_5.aNode_Sub36_7835.anInt7991, worldmapareadefs_6.anInt2718, 0, true, false, (long) class282_sub33_5.aNode_Sub36_7835.anInt7991, false, -1687598339);
						}
						if (worldmapareadefs_6.aStringArray2740[1] != null) {
							PlayerAppearance.method4032(worldmapareadefs_6.aStringArray2740[1], worldmapareadefs_6.aString2732, -1, 1009, -1, (long) class282_sub33_5.aNode_Sub36_7835.anInt7991, worldmapareadefs_6.anInt2718, 0, true, false, (long) class282_sub33_5.aNode_Sub36_7835.anInt7991, false, -1447138539);
						}
						if (worldmapareadefs_6.aStringArray2740[0] != null) {
							PlayerAppearance.method4032(worldmapareadefs_6.aStringArray2740[0], worldmapareadefs_6.aString2732, -1, 1008, -1, (long) class282_sub33_5.aNode_Sub36_7835.anInt7991, worldmapareadefs_6.anInt2718, 0, true, false, (long) class282_sub33_5.aNode_Sub36_7835.anInt7991, false, -1091796707);
						}
					}
					if (!class282_sub33_5.aNode_Sub36_7835.aBool7989) {
						class282_sub33_5.aNode_Sub36_7835.aBool7989 = true;
						HitsplatIndexLoader.method3614(CS2HookEventType.aClass397_4797, class282_sub33_5.aNode_Sub36_7835.anInt7991, worldmapareadefs_6.anInt2718, (byte) 82);
					}
					if (class282_sub33_5.aNode_Sub36_7835.aBool7989) {
						HitsplatIndexLoader.method3614(CS2HookEventType.aClass397_4805, class282_sub33_5.aNode_Sub36_7835.anInt7991, worldmapareadefs_6.anInt2718, (byte) 69);
					}
				} else if (class282_sub33_5.aNode_Sub36_7835.aBool7989) {
					class282_sub33_5.aNode_Sub36_7835.aBool7989 = false;
					HitsplatIndexLoader.method3614(CS2HookEventType.aClass397_4798, class282_sub33_5.aNode_Sub36_7835.anInt7991, worldmapareadefs_6.anInt2718, (byte) 75);
				}
			}
		}
	}
}
