public class Class282_Sub20_Sub25 extends Class282_Sub20 {

	int anInt9885 = 585;

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2, int i_3) {
		switch (i_1) {
		case 0:
			this.anInt9885 = rsbytebuffer_2.readUnsignedShort();
		default:
		}
	}

	int[] method12319(int i_1, int i_2) {
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

	public Class282_Sub20_Sub25() {
		super(0, true);
	}

	static final void method15392(CS2Executor cs2executor_0, int i_1) {
		IComponentDefinitions icomponentdefinitions_2 = Class117.method1981(cs2executor_0.intStack[--cs2executor_0.intStackPtr], (byte) 16);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_2.anInt1426;
	}

	public static void method15393(boolean bool_0, int i_1) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub27_8208, 1, 62287602);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub27_8209, 1, 463702183);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub23_8202, 0, -1779797403);
		Class393.preferences.setValue(Class393.preferences.fog, 0, -1558090127);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub17_8200, 0, 1513887822);
		Class393.preferences.setValue(Class393.preferences.idleAnimations, 0, -1514537540);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub26_8224, 0, 1378722670);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub28_8212, 0, -339994641);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub2_8205, 0, 1587382390);
		Class393.preferences.setValue(Class393.preferences.textures, 0, -1566931898);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub19_8204, 0, 142474266);
		Class393.preferences.setValue(Class393.preferences.water, 0, 1640092780);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub4_8187, 0, -847424999);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub4_8223, 0, 358482435);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub20_8207, 0, 2033925467);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub1_8197, Class106.aClass106_1075.anInt1071, -273525452);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub12_8195, 0, 1196949747);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub14_8211, 0, -1623251899);
		Class323.method5777(1755856105);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub7_8210, 2, -1469341129);
		Class393.preferences.setValue(Class393.preferences.graphics, 1, -971375585);
		Class94.method1589((short) 255);
		IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4048(-462453553);
		client.aBool7185 = true;
	}

}
