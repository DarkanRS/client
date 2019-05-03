public class CutsceneAction_Sub21 extends CutsceneAction {

	public static KeyRecorder keyRecorder;
	int anInt9437;
	int anInt9436;

	public void method1592() {
		Huffman.playSoundJingle(this.anInt9437, 0, this.anInt9436);
	}

	CutsceneAction_Sub21(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt9437 = rsbytebuffer_1.readUnsignedShort();
		this.anInt9436 = rsbytebuffer_1.readUnsignedByte();
	}

	public void method1601() {
		Huffman.playSoundJingle(this.anInt9437 * -576205695 * 865366913, 0, 1859517477 * this.anInt9436 * -1281245267);
	}

	public static void method14675(int i_0, int i_1, int i_2, int i_3) {
		Node_Sub48 class282_sub48_5;
		for (class282_sub48_5 = (Node_Sub48) Node_Sub48.aClass482_8073.head(); class282_sub48_5 != null; class282_sub48_5 = (Node_Sub48) Node_Sub48.aClass482_8073.next(1744342009)) {
			Class175.method2964(class282_sub48_5, i_0, i_1, i_2, i_3, -1230088474);
		}

		byte b_6;
		BASDefinitions renderanimdefs_7;
		int i_8;
		int i_9;
		Vector3 vector3_12;
		for (class282_sub48_5 = (Node_Sub48) Node_Sub48.aClass482_8074.head(); class282_sub48_5 != null; class282_sub48_5 = (Node_Sub48) Node_Sub48.aClass482_8074.next(1161440846)) {
			b_6 = 1;
			renderanimdefs_7 = class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub2_8085.getRenderAnimDefs();
			i_8 = class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub2_8085.aAnimation_Sub3_10337.method7597();
			if (i_8 != -1 && !class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub2_8085.aAnimation_Sub3_10337.aBool7891) {
				if (i_8 != renderanimdefs_7.runningAnimation && i_8 != renderanimdefs_7.runDir3 && i_8 != renderanimdefs_7.runDir1 && i_8 != renderanimdefs_7.runDir2) {
					if (i_8 == renderanimdefs_7.teleportingAnimation || i_8 == renderanimdefs_7.teleDir3 || i_8 == renderanimdefs_7.teleDir1 || i_8 == renderanimdefs_7.teleDir2) {
						b_6 = 3;
					}
				} else {
					b_6 = 2;
				}
			} else {
				b_6 = 0;
			}

			if (b_6 != class282_sub48_5.anInt8091) {
				i_9 = Node_Sub11_Sub1.method15433(class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub2_8085);
				NPCDefinitions npcdefinitions_10 = class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub2_8085.definitions;
				if (npcdefinitions_10.transformTo != null) {
					npcdefinitions_10 = npcdefinitions_10.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER);
				}

				if (npcdefinitions_10 != null && i_9 != -1) {
					if (i_9 == class282_sub48_5.soundEffectId && class282_sub48_5.aBool8098 == npcdefinitions_10.aBool4872) {
						class282_sub48_5.anInt8091 = b_6;
						class282_sub48_5.anInt8089 = npcdefinitions_10.anInt4909;
					} else {
						boolean bool_11 = false;
						if (class282_sub48_5.aNode_Sub15_Sub5_8099 != null) {
							class282_sub48_5.anInt8089 -= 512;
							if (class282_sub48_5.anInt8089 <= 0) {
								Class79.aNode_Sub15_Sub4_783.method15276(class282_sub48_5.aNode_Sub15_Sub5_8099);
								class282_sub48_5.aNode_Sub15_Sub5_8099 = null;
								bool_11 = true;
							}
						} else {
							bool_11 = true;
						}

						if (bool_11) {
							class282_sub48_5.anInt8089 = npcdefinitions_10.anInt4909;
							class282_sub48_5.aNode_Sub26_Sub1_Sub1_8082 = null;
							class282_sub48_5.aNode_Sub18_8097 = null;
							class282_sub48_5.soundEffectId = i_9;
							class282_sub48_5.aBool8098 = npcdefinitions_10.aBool4872;
							class282_sub48_5.anInt8091 = b_6;
						}
					}
				} else {
					class282_sub48_5.soundEffectId = -1;
					class282_sub48_5.aBool8098 = false;
					class282_sub48_5.anInt8091 = b_6;
				}
			}

			vector3_12 = class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub2_8085.method11166().aClass385_3595;
			class282_sub48_5.anInt8107 = (int) vector3_12.x;
			class282_sub48_5.anInt8079 = (int) vector3_12.x + (class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub2_8085.getSize() << 8);
			class282_sub48_5.anInt8078 = (int) vector3_12.z;
			class282_sub48_5.anInt8077 = (int) vector3_12.z + (class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub2_8085.getSize() << 8);
			class282_sub48_5.anInt8076 = class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub2_8085.plane;
			Class175.method2964(class282_sub48_5, i_0, i_1, i_2, i_3, -1411599519);
		}

		for (class282_sub48_5 = (Node_Sub48) Node_Sub48.aClass465_8075.method7750(524790011); class282_sub48_5 != null; class282_sub48_5 = (Node_Sub48) Node_Sub48.aClass465_8075.method7751((byte) 99)) {
			b_6 = 1;
			renderanimdefs_7 = class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub1_8086.getRenderAnimDefs();
			i_8 = class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub1_8086.aAnimation_Sub3_10337.method7597();
			if (i_8 != -1 && !class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub1_8086.aAnimation_Sub3_10337.aBool7891) {
				if (i_8 != renderanimdefs_7.runningAnimation && i_8 != renderanimdefs_7.runDir3 && i_8 != renderanimdefs_7.runDir1 && i_8 != renderanimdefs_7.runDir2) {
					if (i_8 == renderanimdefs_7.teleportingAnimation || i_8 == renderanimdefs_7.teleDir3 || i_8 == renderanimdefs_7.teleDir1 || i_8 == renderanimdefs_7.teleDir2) {
						b_6 = 3;
					}
				} else {
					b_6 = 2;
				}
			} else {
				b_6 = 0;
			}

			if (b_6 != class282_sub48_5.anInt8091) {
				i_9 = Class149_Sub2.method14610(class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub1_8086, 1504837662);
				if (i_9 == class282_sub48_5.soundEffectId && class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub1_8086.isTransformedNPC == class282_sub48_5.aBool8098) {
					class282_sub48_5.anInt8089 = class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub1_8086.specialByte;
					class282_sub48_5.anInt8091 = b_6;
				} else {
					boolean bool_13 = false;
					if (class282_sub48_5.aNode_Sub15_Sub5_8099 != null) {
						class282_sub48_5.anInt8089 -= 512;
						if (class282_sub48_5.anInt8089 <= 0) {
							Class79.aNode_Sub15_Sub4_783.method15276(class282_sub48_5.aNode_Sub15_Sub5_8099);
							class282_sub48_5.aNode_Sub15_Sub5_8099 = null;
							bool_13 = true;
						}
					} else {
						bool_13 = true;
					}

					if (bool_13) {
						class282_sub48_5.anInt8089 = class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub1_8086.specialByte;
						class282_sub48_5.aNode_Sub26_Sub1_Sub1_8082 = null;
						class282_sub48_5.aNode_Sub18_8097 = null;
						class282_sub48_5.soundEffectId = i_9;
						class282_sub48_5.aBool8098 = class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub1_8086.isTransformedNPC;
						class282_sub48_5.anInt8091 = b_6;
					}
				}
			}

			vector3_12 = class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub1_8086.method11166().aClass385_3595;
			class282_sub48_5.anInt8107 = (int) vector3_12.x;
			class282_sub48_5.anInt8079 = (int) vector3_12.x + (class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub1_8086.getSize() << 8);
			class282_sub48_5.anInt8078 = (int) vector3_12.z;
			class282_sub48_5.anInt8077 = (int) vector3_12.z + (class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub1_8086.getSize() << 8);
			class282_sub48_5.anInt8076 = class282_sub48_5.aTransform_Sub1_Sub1_Sub2_Sub1_8086.plane;
			Class175.method2964(class282_sub48_5, i_0, i_1, i_2, i_3, -2031057762);
		}

	}

	static Node_Sub14 method14676(Index index_0, int i_1) {
		byte[] bytes_3 = index_0.getFile(i_1);
		return bytes_3 == null ? null : new Node_Sub14(bytes_3);
	}

	public static final int method14677(int i_0, int i_1) {
		if (i_0 == -1) {
			return 12345678;
		} else {
			i_1 = (i_0 & 0x7f) * i_1 >> 7;
			if (i_1 < 2) {
				i_1 = 2;
			} else if (i_1 > 126) {
				i_1 = 126;
			}

			return (i_0 & 0xff80) + i_1;
		}
	}

}
