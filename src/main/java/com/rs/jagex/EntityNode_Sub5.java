package com.rs.jagex;

public class EntityNode_Sub5 extends EntityNode {

	public int anInt7846;
	public int anInt7847;
	public int anInt7848;
	public int anInt7850;
	public int anInt7851;
	public boolean aBool7849;

	public boolean method12594(int i_1, int i_2) {
		if (!aBool7849)
			return false;
		int i_3 = anInt7850 - anInt7847;
		int i_4 = anInt7846 - anInt7848;
		int i_5 = i_3 * i_3 + i_4 * i_4;
		int i_6 = i_3 * i_1 + i_4 * i_2 - (i_3 * anInt7847 + i_4 * anInt7848);
		int i_7;
		int i_8;
		if (i_6 <= 0) {
			i_7 = anInt7847 - i_1;
			i_8 = anInt7848 - i_2;
			return i_7 * i_7 + i_8 * i_8 < anInt7851 * anInt7851;
		} else if (i_6 > i_5) {
			i_7 = anInt7850 - i_1;
			i_8 = anInt7846 - i_2;
			return i_7 * i_7 + i_8 * i_8 < anInt7851 * anInt7851;
		} else {
			i_6 = (i_6 << 10) / i_5;
			i_7 = (i_3 * i_6 >> 10) + anInt7847 - i_1;
			i_8 = (i_4 * i_6 >> 10) + anInt7848 - i_2;
			return i_7 * i_7 + i_8 * i_8 < anInt7851 * anInt7851;
		}
	}

}
