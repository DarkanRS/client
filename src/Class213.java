public class Class213 {

	public String aString2679;
	public int anInt2680;

	public static void method3661(int i_0, String string_1, int i_2, byte b_3) {
		CS2Script cs2script_4 = Class225_Sub1.method12792(Class397.aClass397_4792, i_0, -1);
		if (cs2script_4 != null) {
			CS2Executor cs2executor_5 = Class125.getNextScriptExecutor(2125481004);
			cs2executor_5.intLocals = new int[cs2script_4.intLocalsCount];
			cs2executor_5.objectLocals = new String[cs2script_4.stringLocalsCount];
			cs2executor_5.objectLocals[0] = string_1;
			cs2executor_5.intLocals[0] = i_2;
			Class51.method1068(cs2script_4, 200000, cs2executor_5, -625116466);
		}

	}

	public static void method3662(AnimationDefinitions animationdefinitions_0, int i_1, Class521_Sub1 class521_sub1_2) {
		if (Class260.anInt3219 < 50 && animationdefinitions_0 != null && animationdefinitions_0.anIntArrayArray5913 != null && i_1 < animationdefinitions_0.anIntArrayArray5913.length && animationdefinitions_0.anIntArrayArray5913[i_1] != null && class521_sub1_2.plane == Class84.myPlayer.plane) {
			int i_4 = animationdefinitions_0.anIntArrayArray5913[i_1][0];
			int i_5 = i_4 >> 8;
			int i_6 = i_4 >> 5 & 0x7;
			int i_7 = i_4 & 0x1f;
			int i_8;
			if (animationdefinitions_0.anIntArrayArray5913[i_1].length > 1) {
				i_8 = (int) (Math.random() * (double) animationdefinitions_0.anIntArrayArray5913[i_1].length);
				if (i_8 > 0) {
					i_5 = animationdefinitions_0.anIntArrayArray5913[i_1][i_8];
				}
			}

			i_8 = 256;
			if (animationdefinitions_0.anIntArray5927 != null && animationdefinitions_0.anIntArray5919 != null) {
				i_8 = (int) (Math.random() * (double) (animationdefinitions_0.anIntArray5919[i_1] - animationdefinitions_0.anIntArray5927[i_1])) + animationdefinitions_0.anIntArray5927[i_1];
			}

			int i_9 = animationdefinitions_0.anIntArray5926 == null ? 255 : animationdefinitions_0.anIntArray5926[i_1];
			if (i_7 == 0) {
				if (class521_sub1_2 == Class84.myPlayer) {
					if (animationdefinitions_0.aBool5928) {
						Class435.method7300(i_5, i_6, 0, i_9, false, i_8);
					} else {
						Class153.method2618(i_5, i_6, 0, i_9, i_8, 1889559384);
					}
				}
			} else {
				if (class521_sub1_2 == Class84.myPlayer) {
					if (Class393.preferences.aClass468_Sub13_8225.method12714(-1858915479) == 0) {
						return;
					}
				} else if (Class393.preferences.aClass468_Sub13_8193.method12714(70703320) == 0) {
					return;
				}

				Vector3 vector3_10 = class521_sub1_2.method11166().aClass385_3595;
				int i_11 = (int) vector3_10.x - 256 >> 9;
				int i_12 = (int) vector3_10.z - 256 >> 9;
				int i_13 = class521_sub1_2 == Class84.myPlayer ? 0 : i_7 + (i_12 << 8) + (class521_sub1_2.plane << 24) + (i_11 << 16);
				Class260.aClass268Array3232[++Class260.anInt3219 - 1] = new Class268((byte) (animationdefinitions_0.aBool5928 ? 2 : 1), i_5, i_6, 0, i_9, i_13, i_8, class521_sub1_2);
			}
		}

	}

}
