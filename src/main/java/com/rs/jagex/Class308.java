package com.rs.jagex;

public class Class308 {

	public static client aclient3620;
	public static short[] CS2_QUERY_RESULTS;
	static Node_Sub16 aNode_Sub16_3618 = new Node_Sub16(0, 0);
	public static boolean isWall(int i_0) {
		return i_0 >= ObjectType.WALL_STRAIGHT.id && i_0 <= ObjectType.WALL_STRAIGHT_CORNER.id || i_0 == ObjectType.WALL_INTERACT.id;
	}
	public boolean aBool3619;
	Node_Sub16[] aNode_Sub16Array3615;
	int[][][] anIntArrayArrayArray3614;
	LinkedNodeList aClass473_3612 = new LinkedNodeList();
	int anInt3617;
	int anInt3616 = -1;
	int anInt3611;

	int anInt3613;

	Class308(int i_1, int i_2, int i_3) {
		anInt3611 = i_2;
		anInt3613 = i_1;
		anIntArrayArrayArray3614 = new int[anInt3613][3][i_3];
		aNode_Sub16Array3615 = new Node_Sub16[anInt3611];
	}

	void clear() {
		for (int i_2 = 0; i_2 < anInt3613; i_2++) {
			anIntArrayArrayArray3614[i_2][0] = null;
			anIntArrayArrayArray3614[i_2][1] = null;
			anIntArrayArrayArray3614[i_2][2] = null;
			anIntArrayArrayArray3614[i_2] = null;
		}
		aNode_Sub16Array3615 = null;
		anIntArrayArrayArray3614 = null;
		aClass473_3612.clear();
		aClass473_3612 = null;
	}

	public int[][] method5463(int i_1) {
		if (anInt3611 == anInt3613) {
			aBool3619 = aNode_Sub16Array3615[i_1] == null;
			aNode_Sub16Array3615[i_1] = aNode_Sub16_3618;
			return anIntArrayArrayArray3614[i_1];
		}
		if (anInt3613 != 1) {
			Node_Sub16 class282_sub16_3 = aNode_Sub16Array3615[i_1];
			if (class282_sub16_3 == null) {
				aBool3619 = true;
				if (anInt3617 >= anInt3613) {
					Node_Sub16 class282_sub16_4 = (Node_Sub16) aClass473_3612.getNext();
					class282_sub16_3 = new Node_Sub16(i_1, class282_sub16_4.anInt7602);
					aNode_Sub16Array3615[class282_sub16_4.anInt7603] = null;
					class282_sub16_4.unlink();
				} else {
					class282_sub16_3 = new Node_Sub16(i_1, anInt3617);
					++anInt3617;
				}
				aNode_Sub16Array3615[i_1] = class282_sub16_3;
			} else
				aBool3619 = false;
			aClass473_3612.insertFront(class282_sub16_3);
			return anIntArrayArrayArray3614[class282_sub16_3.anInt7602];
		} else {
			aBool3619 = anInt3616 != i_1;
			anInt3616 = i_1;
			return anIntArrayArrayArray3614[0];
		}
	}

	public int[][][] method5464() {
		if (anInt3613 != anInt3611)
			throw new RuntimeException();
		for (int i_2 = 0; i_2 < anInt3613; i_2++)
			aNode_Sub16Array3615[i_2] = aNode_Sub16_3618;
		return anIntArrayArrayArray3614;
	}
}
