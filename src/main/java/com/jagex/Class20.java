package com.jagex;

public class Class20 {

	public static int anInt188;
	public static boolean aBool161;
	public static int anInt169;
	public static int anInt170;
	public static boolean aBool187;
	public static int anInt198 = -1;
	static CacheableNode_Sub7 aCacheableNode_Sub7_157;
	static CacheableNode_Sub7 aCacheableNode_Sub7_168;
	static int[] anIntArray177;
	static int anInt186;
	static int anInt178 = 16;
	static boolean aBool162;
	static CacheableNode_Sub15 aCacheableNode_Sub15_163;
	static int anInt167;
	static NodeCollection aClass482_171 = new NodeCollection();
	static IterableNodeMap aClass465_172 = new IterableNodeMap(16);
	static Queue aClass477_182 = new Queue();
	static NodeCollection aClass482_174 = new NodeCollection();
	static NodeCollection aClass482_175 = new NodeCollection();
	static LRUCache aClass229_164 = new LRUCache(30);
	static IComponentDefinitions aClass118_183;
	static int anInt195 = -1;
	static int anInt179 = -1;
	static int anInt180 = -1;
	static int anInt181 = -1;
	static int anInt176;
	static int anInt184;
	static Matrix44 aClass384_158;
	static Matrix44 aClass384_185 = new Matrix44();
	static Matrix44Var aClass294_155 = new Matrix44Var();
	static int anInt156;
	static LRUCache aClass229_191 = new LRUCache(8);

	static float[] aFloatArray194 = new float[4];

	public static void animate(PathingEntity animable, int[] animationIds, int speed, boolean bool_3) {
		boolean bool_5;
		int i_6;
		if (animable.currentAnimations != null) {
			bool_5 = true;
			for (i_6 = 0; i_6 < animable.currentAnimations.length; i_6++)
				if (animable.currentAnimations[i_6] != animationIds[i_6]) {
					bool_5 = false;
					break;
				}
			Animation animation_9 = animable.currentAnimation;
			if (bool_5 && animation_9.hasDefs()) {
				AnimationDefinitions animationdefinitions_7 = animable.currentAnimation.getDefs();
				int speedType = animationdefinitions_7.replayMode;
				if (speedType == 1)
					animation_9.method7583(speed);
				if (speedType == 2)
					animation_9.method7584();
			}
		}
		bool_5 = true;
		for (i_6 = 0; i_6 < animationIds.length; i_6++) {
			if (animationIds[i_6] != -1)
				bool_5 = false;
			if (animable.currentAnimations == null || animable.currentAnimations[i_6] == -1 || IndexLoaders.ANIMATION_LOADER.getAnimDefs(animationIds[i_6]).priority >= IndexLoaders.ANIMATION_LOADER.getAnimDefs(animable.currentAnimations[i_6]).priority) {
				animable.currentAnimations = animationIds;
				animable.currentAnimation.setSpeed(speed);
				if (bool_3)
					animable.anInt10367 = animable.anInt10355;
			}
		}
		if (bool_5) {
			animable.currentAnimations = animationIds;
			animable.currentAnimation.setSpeed(speed);
			if (bool_3)
				animable.anInt10367 = animable.anInt10355;
		}
	}

	static void method744(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		int i_7 = EntityNode.method4890(i_2, Class532.anInt7070, Class532.anInt7068);
		int i_8 = EntityNode.method4890(i_3, Class532.anInt7070, Class532.anInt7068);
		int i_9 = EntityNode.method4890(i_0, Class532.anInt7071, Class532.anInt7069);
		int i_10 = EntityNode.method4890(i_1, Class532.anInt7071, Class532.anInt7069);
		int i_11 = EntityNode.method4890(i_5 + i_2, Class532.anInt7070, Class532.anInt7068);
		int i_12 = EntityNode.method4890(i_3 - i_5, Class532.anInt7070, Class532.anInt7068);
		int i_13;
		for (i_13 = i_7; i_13 < i_11; i_13++)
			KeyHoldInputSubscriber.method3922(Class532.anIntArrayArray7072[i_13], i_9, i_10, i_4);
		for (i_13 = i_8; i_13 > i_12; --i_13)
			KeyHoldInputSubscriber.method3922(Class532.anIntArrayArray7072[i_13], i_9, i_10, i_4);
		i_13 = EntityNode.method4890(i_5 + i_0, Class532.anInt7071, Class532.anInt7069);
		int i_14 = EntityNode.method4890(i_1 - i_5, Class532.anInt7071, Class532.anInt7069);
		for (int i_15 = i_11; i_15 <= i_12; i_15++) {
			int[] ints_16 = Class532.anIntArrayArray7072[i_15];
			KeyHoldInputSubscriber.method3922(ints_16, i_9, i_13, i_4);
			KeyHoldInputSubscriber.method3922(ints_16, i_14, i_10, i_4);
		}
	}

	Class20() throws Throwable {
		throw new Error();
	}
}
