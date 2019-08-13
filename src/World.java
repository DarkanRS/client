public class World {

	public String activity;
	public int countryId;

	public static void method3662(AnimationDefinitions animDef, int i_1, Transform_Sub1 class521_sub1_2) {
		if (Class260.SOUNDS_SIZE < 50 && animDef != null && animDef.anIntArrayArray5913 != null && i_1 < animDef.anIntArrayArray5913.length && animDef.anIntArrayArray5913[i_1] != null && class521_sub1_2.plane == VertexNormal.MY_PLAYER.plane) {
			int i_4 = animDef.anIntArrayArray5913[i_1][0];
			int i_5 = i_4 >> 8;
			int i_6 = i_4 >> 5 & 0x7;
			int i_7 = i_4 & 0x1f;
			int i_8;
			if (animDef.anIntArrayArray5913[i_1].length > 1) {
				i_8 = (int) (Math.random() * (double) animDef.anIntArrayArray5913[i_1].length);
				if (i_8 > 0) {
					i_5 = animDef.anIntArrayArray5913[i_1][i_8];
				}
			}

			i_8 = 256;
			if (animDef.anIntArray5927 != null && animDef.anIntArray5919 != null) {
				i_8 = (int) (Math.random() * (double) (animDef.anIntArray5919[i_1] - animDef.anIntArray5927[i_1])) + animDef.anIntArray5927[i_1];
			}

			int i_9 = animDef.anIntArray5926 == null ? 255 : animDef.anIntArray5926[i_1];
			if (i_7 == 0) {
				if (class521_sub1_2 == VertexNormal.MY_PLAYER) {
					if (animDef.aBool5928) {
						Class435.playSoundVorbis(i_5, i_6, 0, i_9, false, i_8);
					} else {
						VarNPCMap.playSoundSynth(i_5, i_6, 0, i_9, i_8);
					}
				}
			} else {
				if (class521_sub1_2 == VertexNormal.MY_PLAYER) {
					if (Class393.preferences.soundEffectVolume.method12714() == 0) {
						return;
					}
				} else if (Class393.preferences.ambientSoundVolume.method12714() == 0) {
					return;
				}

				Vector3 vector3_10 = class521_sub1_2.method11166().coords;
				int i_11 = (int) vector3_10.x - 256 >> 9;
				int i_12 = (int) vector3_10.z - 256 >> 9;
				int i_13 = class521_sub1_2 == VertexNormal.MY_PLAYER ? 0 : i_7 + (i_12 << 8) + (class521_sub1_2.plane << 24) + (i_11 << 16);
				Class260.SOUNDS[++Class260.SOUNDS_SIZE - 1] = new AreadSound((byte) (animDef.aBool5928 ? 2 : 1), i_5, i_6, 0, i_9, i_13, i_8, class521_sub1_2);
			}
		}

	}

}
