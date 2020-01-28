public class Node_Sub20_Sub25 extends Node_Sub20 {

	int anInt9885 = 585;

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			this.anInt9885 = rsbytebuffer_2.readUnsignedShort();
		default:
		}
	}

	int[] method12319(int i_1) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, 633392158);
		if (this.aClass320_7667.aBool3722) {
			int i_4 = Class316.anIntArray3668[i_1];
			for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
				int i_6 = Class316.anIntArray3672[i_5];
				int i_7;
				if (i_6 > this.anInt9885 && i_6 < 4096 - this.anInt9885 && i_4 > 2048 - this.anInt9885 && i_4 < this.anInt9885 + 2048) {
					i_7 = 2048 - i_6;
					i_7 = i_7 < 0 ? -i_7 : i_7;
					i_7 <<= 12;
					i_7 /= 2048 - this.anInt9885;
					ints_3[i_5] = 4096 - i_7;
				} else if (i_6 > 2048 - this.anInt9885 && i_6 < this.anInt9885 + 2048) {
					i_7 = i_4 - 2048;
					i_7 = i_7 < 0 ? -i_7 : i_7;
					i_7 -= this.anInt9885;
					i_7 <<= 12;
					ints_3[i_5] = i_7 / (2048 - this.anInt9885);
				} else if (i_4 >= this.anInt9885 && i_4 <= 4096 - this.anInt9885) {
					if (i_6 >= this.anInt9885 && i_6 <= 4096 - this.anInt9885) {
						ints_3[i_5] = 0;
					} else {
						i_7 = 2048 - i_4;
						i_7 = i_7 < 0 ? -i_7 : i_7;
						i_7 <<= 12;
						i_7 /= 2048 - this.anInt9885;
						ints_3[i_5] = 4096 - i_7;
					}
				} else {
					i_7 = i_6 - 2048;
					i_7 = i_7 < 0 ? -i_7 : i_7;
					i_7 -= this.anInt9885;
					i_7 <<= 12;
					ints_3[i_5] = i_7 / (2048 - this.anInt9885);
				}
			}
		}
		return ints_3;
	}

	public Node_Sub20_Sub25() {
		super(0, true);
	}

	public static void method15393(int i_1) {
		Class393.preferences.setValue(Class393.preferences.removeRoofs, 1);
		Class393.preferences.setValue(Class393.preferences.removeRoofsOptionOverride, 1);
		Class393.preferences.setValue(Class393.preferences.groundDecoration, 0);
		Class393.preferences.setValue(Class393.preferences.fog, 0);
		Class393.preferences.setValue(Class393.preferences.groundBlending, 0);
		Class393.preferences.setValue(Class393.preferences.idleAnimations, 0);
		Class393.preferences.setValue(Class393.preferences.flickeringEffects, 0);
		Class393.preferences.setValue(Class393.preferences.characterShadows, 0);
		Class393.preferences.setValue(Class393.preferences.sceneryShadows, 0);
		Class393.preferences.setValue(Class393.preferences.textures, 0);
		Class393.preferences.setValue(Class393.preferences.lightDetail, 0);
		Class393.preferences.setValue(Class393.preferences.water, 0);
		Class393.preferences.setValue(Class393.preferences.antiAliasingDefault, 0);
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub4_8223, 0);
		Class393.preferences.setValue(Class393.preferences.particles, 0);
		Class393.preferences.setValue(Class393.preferences.buildArea, MapSize.aClass106_1075.anInt1071);
		Class393.preferences.setValue(Class393.preferences.bloom, 0);
		Class393.preferences.setValue(Class393.preferences.skyBoxes, 0);
		ImageIndexLoader.method5777(1755856105);
		Class393.preferences.setValue(Class393.preferences.maxScreenSize, 2);
		Class393.preferences.setValue(Class393.preferences.graphics, 1);
		Class94.method1589();
		IndexLoaders.MAP_REGION_DECODER.method4435().method4048();
		client.aBool7185 = true;
	}
}
