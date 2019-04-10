public class Class20 {

	static Class282_Sub50_Sub7 aClass282_Sub50_Sub7_157;

	static Class282_Sub50_Sub7 aClass282_Sub50_Sub7_168;

	static int[] anIntArray177;

	static int anInt186;

	public static int anInt188;

	static int anInt178 = 16;

	public static boolean aBool161 = false;

	static boolean aBool162 = false;

	static Class282_Sub50_Sub15 aClass282_Sub50_Sub15_163 = null;

	static int anInt167 = 0;

	public static int anInt169 = 0;

	public static int anInt170 = 0;

	static NodeCollection aClass482_171 = new NodeCollection();

	static IterableNodeMap aClass465_172 = new IterableNodeMap(16);

	static Queue aClass477_182 = new Queue();

	static NodeCollection aClass482_174 = new NodeCollection();

	static NodeCollection aClass482_175 = new NodeCollection();

	static SoftCache aClass229_164 = new SoftCache(30);

	static IComponentDefinitions aClass118_183 = null;

	static int anInt195 = -1;

	static int anInt179 = -1;

	static int anInt180 = -1;

	static int anInt181 = -1;

	static int anInt176 = 0;

	static int anInt184 = 0;

	static Matrix44Arr aClass384_158 = null;

	static Matrix44Arr aClass384_185 = new Matrix44Arr();

	static Matrix44Var aClass294_155 = new Matrix44Var();

	public static boolean aBool187 = false;

	static int anInt156 = 0;

	public static int anInt198 = -1;

	static SoftCache aClass229_191 = new SoftCache(8);

	static float[] aFloatArray194 = new float[4];

	Class20() throws Throwable {
		throw new Error();
	}

	static void method744(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		int i_7 = EntityNode.method4890(i_2, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068, -109837866);
		int i_8 = EntityNode.method4890(i_3, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068, -766812485);
		int i_9 = EntityNode.method4890(i_0, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069, -1790568603);
		int i_10 = EntityNode.method4890(i_1, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069, -1159028771);
		int i_11 = EntityNode.method4890(i_5 + i_2, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068, -1317034828);
		int i_12 = EntityNode.method4890(i_3 - i_5, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068, -1696179527);
		int i_13;
		for (i_13 = i_7; i_13 < i_11; i_13++) {
			KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_13], i_9, i_10, i_4, (byte) 31);
		}
		for (i_13 = i_8; i_13 > i_12; --i_13) {
			KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_13], i_9, i_10, i_4, (byte) 46);
		}
		i_13 = EntityNode.method4890(i_5 + i_0, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069, 2146581760);
		int i_14 = EntityNode.method4890(i_1 - i_5, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069, 167924575);
		for (int i_15 = i_11; i_15 <= i_12; i_15++) {
			int[] ints_16 = Class532_Sub1.anIntArrayArray7072[i_15];
			KeyHoldInputSubscriber.method3922(ints_16, i_9, i_13, i_4, (byte) -7);
			KeyHoldInputSubscriber.method3922(ints_16, i_14, i_10, i_4, (byte) -37);
		}
	}

	public static void animate(Animable animable_0, int[] animationIds, int speed, boolean bool_3, byte b_4) {
		boolean bool_5;
		int i_6;
		if (animable_0.currentAnimations != null) {
			bool_5 = true;
			for (i_6 = 0; i_6 < animable_0.currentAnimations.length; i_6++) {
				if (animable_0.currentAnimations[i_6] != animationIds[i_6]) {
					bool_5 = false;
					break;
				}
			}
			Animation animation_9 = animable_0.currentAnimation;
			if (bool_5 && animation_9.hasDefs()) {
				AnimationDefinitions animationdefinitions_7 = animable_0.currentAnimation.getDefs();
				int speedType = animationdefinitions_7.replayMode;
				if (speedType == 1) {
					animation_9.method7583(speed);
				}
				if (speedType == 2) {
					animation_9.method7584(-272427166);
				}
			}
		}
		bool_5 = true;
		for (i_6 = 0; i_6 < animationIds.length; i_6++) {
			if (animationIds[i_6] != -1) {
				bool_5 = false;
			}
			if (animable_0.currentAnimations == null || animable_0.currentAnimations[i_6] == -1 || IndexLoaders.ANIMATION_LOADER.getAnimDefs(animationIds[i_6], (byte) -52).priority >= IndexLoaders.ANIMATION_LOADER.getAnimDefs(animable_0.currentAnimations[i_6], (byte) -23).priority) {
				animable_0.currentAnimations = animationIds;
				animable_0.currentAnimation.setSpeed(speed);
				if (bool_3) {
					animable_0.anInt10367 = animable_0.anInt10355;
				}
			}
		}
		if (bool_5) {
			animable_0.currentAnimations = animationIds;
			animable_0.currentAnimation.setSpeed(speed);
			if (bool_3) {
				animable_0.anInt10367 = animable_0.anInt10355;
			}
		}
	}
}
