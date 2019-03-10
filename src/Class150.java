public class Class150 {

	public static Class150 aClass150_1950 = new Class150(5, 3);

	public static Class150 aClass150_1949 = new Class150(6, 4);

	public static Class150 aClass150_1951 = new Class150(1, 1);

	public static Class150 aClass150_1948 = new Class150(0, 1);

	public static Class150 aClass150_1952 = new Class150(4, 2);

	public static Class150 aClass150_1953 = new Class150(8, 1);

	static Class150 aClass150_1954 = new Class150(3, 3);

	static Class150 aClass150_1955 = new Class150(2, 4);

	public static Class150 aClass150_1956 = new Class150(7, 1);

	public static Class150 aClass150_1957 = new Class150(9, 1);

	public int anInt1958;

	public int anInt1959;

	Class150(int i_1, int i_2) {
		this.anInt1958 = i_1;
		this.anInt1959 = i_2;
	}

	public static void method2580(int i_0, int i_1, byte b_2) {
		if (Class148.anInt1730 != 0) {
			if (i_0 < 0) {
				for (int i_3 = 0; i_3 < 16; i_3++) {
					HashTable.anIntArray5449[i_3] = i_1;
				}
			} else {
				HashTable.anIntArray5449[i_0] = i_1;
			}
		}
		Class148.aClass282_Sub15_Sub2_1735.method15095(i_0, i_1, 1233853540);
	}

	static final void method2581(Animable animable_0, int i_1) {
		Class456_Sub3 class456_sub3_2 = animable_0.aClass456_Sub3_10337;
		if (class456_sub3_2.hasDefs() && class456_sub3_2.method7627(1, -1365163818) && class456_sub3_2.method7580(952228354)) {
			if (class456_sub3_2.aBool7891) {
				class456_sub3_2.method7570(animable_0.getRenderAnimDefs((byte) -17).method3809(386342083), false, true, -321228583);
				class456_sub3_2.aBool7891 = class456_sub3_2.hasDefs();
			}
			class456_sub3_2.method7582((byte) -126);
		}
		for (int i_3 = 0; i_3 < animable_0.aClass161Array10339.length; i_3++) {
			if (animable_0.aClass161Array10339[i_3].spotAnimId != -1) {
				Animation animation_4 = animable_0.aClass161Array10339[i_3].animation;
				if (animation_4.hasSpeed(1176831971)) {
					SpotAnimDefinitions spotanimdefinitions_5 = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(animable_0.aClass161Array10339[i_3].spotAnimId, (byte) 52);
					AnimationDefinitions animationdefinitions_6 = animation_4.getDefs();
					if (spotanimdefinitions_5.aBool6968) {
						if (animationdefinitions_6.animatingPrecedence == 3) {
							if (animable_0.anInt10367 > 0 && animable_0.anInt10342 <= client.cycles && animable_0.anInt10345 < client.cycles) {
								animation_4.method7567(-1, (short) 8960);
								animable_0.aClass161Array10339[i_3].spotAnimId = -1;
								continue;
							}
						} else if (animationdefinitions_6.animatingPrecedence == 1 && animable_0.anInt10367 > 0 && animable_0.anInt10342 <= client.cycles && animable_0.anInt10345 < client.cycles) {
							continue;
						}
					}
				}
				if (animation_4.method7627(1, -1386003531) && animation_4.method7580(1255247674)) {
					animation_4.method7567(-1, (short) 8960);
					animable_0.aClass161Array10339[i_3].spotAnimId = -1;
				}
			}
		}
		Animation animation_7 = animable_0.currentAnimation;
		if (animation_7.hasDefs()) {
			label88: {
				AnimationDefinitions animationdefinitions_9 = animation_7.getDefs();
				if (animationdefinitions_9.animatingPrecedence == 3) {
					if (animable_0.anInt10367 > 0 && animable_0.anInt10342 <= client.cycles && animable_0.anInt10345 < client.cycles) {
						animable_0.currentAnimations = null;
						animation_7.method7567(-1, (short) 8960);
						break label88;
					}
				} else if (animationdefinitions_9.animatingPrecedence == 1) {
					if (animable_0.anInt10367 > 0 && animable_0.anInt10342 <= client.cycles && animable_0.anInt10345 < client.cycles) {
						animation_7.setSpeed(1);
						break label88;
					}
					animation_7.setSpeed(0);
				}
				if (animation_7.method7627(1, 1985078512) && animation_7.method7580(1773255286)) {
					animable_0.currentAnimations = null;
					animation_7.method7567(-1, (short) 8960);
				}
			}
		}
		for (int i_8 = 0; i_8 < animable_0.aClass456_Sub2_Sub1Array10354.length; i_8++) {
			Class456_Sub2_Sub1 class456_sub2_sub1_10 = animable_0.aClass456_Sub2_Sub1Array10354[i_8];
			if (class456_sub2_sub1_10 != null) {
				if (class456_sub2_sub1_10.anInt10065 > 0) {
					--class456_sub2_sub1_10.anInt10065;
				} else if (class456_sub2_sub1_10.method7627(1, 1857072218) && class456_sub2_sub1_10.method7580(921988866)) {
					animable_0.aClass456_Sub2_Sub1Array10354[i_8] = null;
				}
			}
		}
	}

	public static void method2582(int i_0, int[] ints_1, int i_2) {
		if (i_0 != -1 && Class456_Sub3.method12682(i_0, ints_1, -1943227865)) {
			IComponentDefinitions[] arr_3 = Class468_Sub8.aClass98Array7889[i_0].components;
			Class202.runIComponentScripts(arr_3, 2088119296);
		}
	}

	public static void method2583(Class397 class397_0, int i_1, int i_2, Class520 class520_3, Class521_Sub1_Sub2_Sub1 class521_sub1_sub2_sub1_4, int i_5) {
		CS2Executor cs2executor_6 = Class125.getNextScriptExecutor(1132906159);
		cs2executor_6.aClass521_Sub1_Sub2_Sub1_7014 = class521_sub1_sub2_sub1_4;
		Class107.method1834(class397_0, i_1, i_2, cs2executor_6, (byte) 35);
		cs2executor_6.aClass521_Sub1_Sub2_Sub1_7014 = null;
	}
}
