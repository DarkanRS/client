package com.jagex;

public class Class462 {

	public static String[] VARC_STRING;

	int anInt5542;

	AnimationFrameSet aCacheableNode_Sub13_5545;

	int anInt5543;

	int anInt5547;

	AnimationFrameSet animationFrameSet;

	boolean aBool5544;

	boolean method7707(AnimationIndexLoader animationindexloader_1, AnimationDefinitions animationdefinitions_2, int i_3, int i_4, int[] ints_5) {
		if (aBool5544)
			return true;
		if (i_3 >= ints_5.length)
			return false;
		else {
			anInt5542 = ints_5[i_3];
			aCacheableNode_Sub13_5545 = animationindexloader_1.getAnimationFrame(anInt5542 >> 16);
			anInt5542 &= 0xffff;
			if (aCacheableNode_Sub13_5545 != null) {
				if (animationdefinitions_2.tweened && i_4 != -1 && i_4 < ints_5.length) {
					anInt5547 = ints_5[i_4];
					animationFrameSet = animationindexloader_1.getAnimationFrame(anInt5547 >> 16);
					anInt5547 &= 0xffff;
				}
				if (animationdefinitions_2.aBool5923)
					anInt5543 |= 0x200;
				if (aCacheableNode_Sub13_5545.method15080(anInt5542))
					anInt5543 |= 0x80;
				if (aCacheableNode_Sub13_5545.method15079(anInt5542))
					anInt5543 |= 0x100;
				if (aCacheableNode_Sub13_5545.method15081(anInt5542))
					anInt5543 |= 0x400;
				if (animationFrameSet != null) {
					if (animationFrameSet.method15080(anInt5547))
						anInt5543 |= 0x80;
					if (animationFrameSet.method15079(anInt5547))
						anInt5543 |= 0x100;
					if (animationFrameSet.method15081(anInt5547))
						anInt5543 |= 0x400;
				}
				anInt5543 |= 0x20;
				aBool5544 = true;
				return true;
			} else
				return false;
		}
	}

	void method7708() {
		aBool5544 = false;
		anInt5543 = 0;
		animationFrameSet = null;
		aCacheableNode_Sub13_5545 = null;
	}
}
