package com.rs.jagex;

public class ProcessorSpecs {

	static Index SPRITES_INDEX;

	static void method7724(PathingEntity animable_0) {
		if (animable_0 instanceof NPCEntity npc_2) {
			if (npc_2.definitions != null)
				MapAreaDefinitions.iComponentOnNPC(npc_2, npc_2.plane != VertexNormal.MY_PLAYER.plane);
		} else if (animable_0 instanceof PlayerEntity player_3) {
			CutsceneAction_Sub22.iComponentOnPlayer(player_3, player_3.plane != VertexNormal.MY_PLAYER.plane);
		}
	}
	static int[] method7725(TCPPacket tcpmessage_0) {
		ByteBuf rsbytebuffer_2 = new ByteBuf(518);
		int[] ints_3 = new int[4];
		int i_4;
		for (i_4 = 0; i_4 < 4; i_4++)
			ints_3[i_4] = (int) (Math.random() * 9.9999999E7D);
		rsbytebuffer_2.writeByte(10);
		rsbytebuffer_2.writeInt(ints_3[0]);
		rsbytebuffer_2.writeInt(ints_3[1]);
		rsbytebuffer_2.writeInt(ints_3[2]);
		rsbytebuffer_2.writeInt(ints_3[3]);
		for (i_4 = 0; i_4 < 10; i_4++)
			rsbytebuffer_2.writeInt((int) (Math.random() * 9.9999999E7D));
		rsbytebuffer_2.writeShort((int) (Math.random() * 9.9999999E7D));
		rsbytebuffer_2.applyRSA();
		tcpmessage_0.buffer.writeBytes(rsbytebuffer_2.buffer, 0, rsbytebuffer_2.index);
		return ints_3;
	}
	static void method7727(PathingEntity animable_0) {
		Animation animation_2 = animable_0.currentAnimation;
		if (animable_0.forceMovementT2Delay == client.FRAME_COUNT || !animation_2.hasDefs() || animation_2.method7585(1)) {
			int i_3 = animable_0.forceMovementT2Delay - animable_0.forceMovementT1Delay;
			int i_4 = client.FRAME_COUNT - animable_0.forceMovementT1Delay;
			int i_5 = animable_0.forceMovementT1XOff * 512 + animable_0.getSize() * 256;
			int i_6 = animable_0.forceMovementT1YOff * 512 + animable_0.getSize() * 256;
			int i_7 = animable_0.forceMovementT2XOff * 512 + animable_0.getSize() * 256;
			int i_8 = animable_0.forceMovementT2YOff * 512 + animable_0.getSize() * 256;
			Vector3 vector3_9 = animable_0.method11166().coords;
			animable_0.method11172(((i_7 * i_4 + i_5 * (i_3 - i_4)) / i_3), ((int) vector3_9.y), ((i_4 * i_8 + i_6 * (i_3 - i_4)) / i_3));
		}
		animable_0.anInt10366 = 0;
		animable_0.turn(animable_0.forceMovementDir, false);
	}

	static void method7728(int i_0, int i_1, int i_2, int i_3, int i_4) {
		int i_6 = EntityNode.method4890(i_2, Class532.anInt7070, Class532.anInt7068);
		int i_7 = EntityNode.method4890(i_3, Class532.anInt7070, Class532.anInt7068);
		int i_8 = EntityNode.method4890(i_0, Class532.anInt7071, Class532.anInt7069);
		int i_9 = EntityNode.method4890(i_1, Class532.anInt7071, Class532.anInt7069);
		for (int i_10 = i_6; i_10 <= i_7; i_10++)
			KeyHoldInputSubscriber.method3922(Class532.anIntArrayArray7072[i_10], i_8, i_9, i_4);
	}

	public static boolean method7730() {
		try {
			if (Class148.anInt1730 == 2) {
				if (Node_Sub44_Sub3.aNode_Sub7_9563 == null) {
					Node_Sub44_Sub3.aNode_Sub7_9563 = Node_Sub7.method12164(CutsceneEntity.aClass317_746, Friend.anInt46, Class148.anInt1738);
					if (Node_Sub44_Sub3.aNode_Sub7_9563 == null)
						return false;
				}
				if (Class454.aClass250_5450 == null)
					Class454.aClass250_5450 = new Class250(Class148.aClass317_1732, Class148.aClass317_1731);
				Node_Sub15_Sub2 class282_sub15_sub2_2 = Class148.aNode_Sub15_Sub2_1735;
				if (Node_Sub33.aNode_Sub15_Sub2_7836 != null)
					class282_sub15_sub2_2 = Node_Sub33.aNode_Sub15_Sub2_7836;
				if (class282_sub15_sub2_2.method15182(Node_Sub44_Sub3.aNode_Sub7_9563, Class148.aClass317_1737, Class454.aClass250_5450)) {
					Class148.aNode_Sub15_Sub2_1735 = class282_sub15_sub2_2;
					Class148.aNode_Sub15_Sub2_1735.method15096();
					int i_3;
					if (Class383.anInt4664 > 0) {
						Class148.anInt1730 = 3;
						Class148.aNode_Sub15_Sub2_1735.setVolume(Math.min(Class383.anInt4664, Class158_Sub2_Sub3.anInt10243));
						for (i_3 = 0; i_3 < HashTable.anIntArray5449.length; i_3++) {
							Class148.aNode_Sub15_Sub2_1735.method15095(i_3, HashTable.anIntArray5449[i_3]);
							HashTable.anIntArray5449[i_3] = 255;
						}
					} else {
						Class148.anInt1730 = 0;
						Class148.aNode_Sub15_Sub2_1735.setVolume(Class158_Sub2_Sub3.anInt10243);
						for (i_3 = 0; i_3 < HashTable.anIntArray5449.length; i_3++) {
							Class148.aNode_Sub15_Sub2_1735.method15095(i_3, HashTable.anIntArray5449[i_3]);
							HashTable.anIntArray5449[i_3] = 255;
						}
					}
					if (Node_Sub33.aNode_Sub15_Sub2_7836 == null) {
						if (Class148.aLong1740 > 0L)
							Class148.aNode_Sub15_Sub2_1735.method15100(Node_Sub44_Sub3.aNode_Sub7_9563, Class152.aBool1962, Class148.aLong1740);
						else
							Class148.aNode_Sub15_Sub2_1735.method15098(Node_Sub44_Sub3.aNode_Sub7_9563, Class152.aBool1962);
						if (Class11.aClass109_121 != null)
							Class11.aClass109_121.method1849();
					}
					if (Class502.aClass253_5830 != null)
						Class502.aClass253_5830.method4329(Class148.aNode_Sub15_Sub2_1735);
					Node_Sub44_Sub3.aNode_Sub7_9563 = null;
					Class454.aClass250_5450 = null;
					CutsceneEntity.aClass317_746 = null;
					Class148.aLong1740 = 0L;
					Node_Sub33.aNode_Sub15_Sub2_7836 = null;
					Class11.aClass109_121 = null;
					boolean bool_1 = true;
					return bool_1;
				}
			}
		} catch (Exception exception_4) {
			exception_4.printStackTrace();
			Class148.aNode_Sub15_Sub2_1735.method15101();
			Class332.method5929();
		}
		return false;
	}

	int maxMemory;

	int processorCount;

	boolean isARM;

	ProcessorSpecs(int i_1, int i_2, boolean bool_3) {
		maxMemory = i_1;
		processorCount = i_2;
		isARM = bool_3;
	}

	public int getMaxMemory() {
		return maxMemory;
	}

	public int getProcessorCount() {
		return processorCount;
	}

	public boolean isARM() {
		return isARM;
	}
}
