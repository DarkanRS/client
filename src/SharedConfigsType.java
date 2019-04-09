public class SharedConfigsType {

	public static SharedConfigsType UNDERLAYS = new SharedConfigsType(1);
	public static SharedConfigsType SCT_2 = new SharedConfigsType(2);
	public static SharedConfigsType IDENTITIKIT = new SharedConfigsType(3);
	public static SharedConfigsType OVERLAYS = new SharedConfigsType(4);
	public static SharedConfigsType INVENTORIES = new SharedConfigsType(5);
	public static SharedConfigsType OBJECTS = new SharedConfigsType(6, 8);
	public static SharedConfigsType SCT_7 = new SharedConfigsType(7);
	public static SharedConfigsType ENUMS = new SharedConfigsType(8, 8);
	public static SharedConfigsType NPCS = new SharedConfigsType(9, 7);
	public static SharedConfigsType ITEMS = new SharedConfigsType(10, 8);
	public static SharedConfigsType PARAMS = new SharedConfigsType(11);
	public static SharedConfigsType ANIMATIONS = new SharedConfigsType(12, 7);
	public static SharedConfigsType SPOT_ANIMS = new SharedConfigsType(13, 8);
	public static SharedConfigsType VARBITS = new SharedConfigsType(14, 10);
	public static SharedConfigsType VARC_STRING = new SharedConfigsType(15);
	public static SharedConfigsType VARS = new SharedConfigsType(16);
	public static SharedConfigsType SCT_17 = new SharedConfigsType(17);
	public static SharedConfigsType SCT_18 = new SharedConfigsType(18);
	public static SharedConfigsType VARC = new SharedConfigsType(19);
	public static SharedConfigsType SCT_20 = new SharedConfigsType(20);
	public static SharedConfigsType SCT_21 = new SharedConfigsType(21);
	public static SharedConfigsType SCT_22 = new SharedConfigsType(22);
	public static SharedConfigsType SCT_23 = new SharedConfigsType(23);
	public static SharedConfigsType SCT_24 = new SharedConfigsType(24);
	public static SharedConfigsType SCT_25 = new SharedConfigsType(25);
	public static SharedConfigsType STRUCTS = new SharedConfigsType(26);
	public static SharedConfigsType SCT_27 = new SharedConfigsType(27);
	public static SharedConfigsType SCT_28 = new SharedConfigsType(28);
	public static SharedConfigsType SKYBOX = new SharedConfigsType(29);
	public static SharedConfigsType SUN = new SharedConfigsType(30);
	public static SharedConfigsType LIGHT_INTENSITIES = new SharedConfigsType(31);
	public static SharedConfigsType RENDER_ANIMS = new SharedConfigsType(32);
	public static SharedConfigsType CURSORS = new SharedConfigsType(33);
	public static SharedConfigsType MAP_SPRITES = new SharedConfigsType(34);
	public static SharedConfigsType QUESTS = new SharedConfigsType(35);
	public static SharedConfigsType MAP_AREAS = new SharedConfigsType(36);
	public static SharedConfigsType SCT_37 = new SharedConfigsType(37);
	public static SharedConfigsType SCT_38 = new SharedConfigsType(38);
	public static SharedConfigsType SCT_39 = new SharedConfigsType(39);
	public static SharedConfigsType SCT_40 = new SharedConfigsType(40);
	public static SharedConfigsType SCT_41 = new SharedConfigsType(41);
	public static SharedConfigsType SCT_42 = new SharedConfigsType(42);
	public static SharedConfigsType SCT_43 = new SharedConfigsType(43);
	public static SharedConfigsType SCT_44 = new SharedConfigsType(44);
	public static SharedConfigsType SCT_45 = new SharedConfigsType(45);
	public static SharedConfigsType HITSPLATS = new SharedConfigsType(46);
	public static SharedConfigsType CLAN_VAR = new SharedConfigsType(47);
	public static SharedConfigsType SCT_48 = new SharedConfigsType(48);
	public static SharedConfigsType SCT_49 = new SharedConfigsType(49);
	public static SharedConfigsType SCT_50 = new SharedConfigsType(50);
	public static SharedConfigsType SCT_51 = new SharedConfigsType(51);
	public static SharedConfigsType SCT_53 = new SharedConfigsType(53);
	public static SharedConfigsType CLAN_VAR_SETTINGS = new SharedConfigsType(54);
	public static SharedConfigsType SCT_70 = new SharedConfigsType(70);
	public static SharedConfigsType HITBARS = new SharedConfigsType(72);
	public static SharedConfigsType SCT_73 = new SharedConfigsType(73);
	public static SharedConfigsType SCT_74 = new SharedConfigsType(74);

	public int id;

	int fileIdBitShift;

	SharedConfigsType(int i_1) {
		this(i_1, 0);
	}

	SharedConfigsType(int i_1, int i_2) {
		this.id = i_1;
		this.fileIdBitShift = i_2;
	}

	public int filesPerContainer(int i_1) {
		return 1 << this.fileIdBitShift;
	}

	public int containerId(int i_1) {
		return i_1 >>> this.fileIdBitShift;
	}

	public int fileId(int i_1) {
		return i_1 & (1 << this.fileIdBitShift) - 1;
	}

	public static boolean method2084(Index index_0, Index index_1, Index index_2, Class282_Sub15_Sub2 class282_sub15_sub2_3, Class253 class253_4) {
		Class148.aClass317_1737 = index_0;
		Class148.aClass317_1731 = index_1;
		Class148.aClass317_1732 = index_2;
		Class148.aClass282_Sub15_Sub2_1735 = class282_sub15_sub2_3;
		Class502.aClass253_5830 = class253_4;
		HashTable.anIntArray5449 = new int[16];
		for (int i_6 = 0; i_6 < 16; i_6++) {
			HashTable.anIntArray5449[i_6] = 255;
		}
		return true;
	}

	public static void method2094(int i_0) {
		Class291_Sub1.anInt8018 = -1;
		Class291_Sub1.anInt8026 = i_0;
		Class361.anInt4185 = 3;
		Class96_Sub9.anInt9282 = 100;
	}

	static void method2095(Class282_Sub50_Sub7 class282_sub50_sub7_0) {
		if (!Class20.aBool161) {
			class282_sub50_sub7_0.remove();
			--Class20.anInt169;
			if (!class282_sub50_sub7_0.aBool9586) {
				long long_2 = class282_sub50_sub7_0.aLong9580;
				Class282_Sub50_Sub15 class282_sub50_sub15_4;
				for (class282_sub50_sub15_4 = (Class282_Sub50_Sub15) Class20.aClass465_172.get(long_2); class282_sub50_sub15_4 != null && !class282_sub50_sub15_4.aString9771.equals(class282_sub50_sub7_0.aString9588); class282_sub50_sub15_4 = (Class282_Sub50_Sub15) Class20.aClass465_172.method7747(-1584347554)) {
					;
				}
				if (class282_sub50_sub15_4 != null && class282_sub50_sub15_4.method15249(class282_sub50_sub7_0, (byte) 17)) {
					Class13.method503(class282_sub50_sub15_4, 1715883578);
				}
			} else {
				for (Class282_Sub50_Sub15 class282_sub50_sub15_5 = (Class282_Sub50_Sub15) Class20.aClass477_182.method7941(); class282_sub50_sub15_5 != null; class282_sub50_sub15_5 = (Class282_Sub50_Sub15) Class20.aClass477_182.method7955(194809254)) {
					if (class282_sub50_sub15_5.aString9771.equals(class282_sub50_sub7_0.aString9588)) {
						boolean bool_3 = false;
						for (Class282_Sub50_Sub7 class282_sub50_sub7_6 = (Class282_Sub50_Sub7) class282_sub50_sub15_5.aClass477_9770.method7941(); class282_sub50_sub7_6 != null; class282_sub50_sub7_6 = (Class282_Sub50_Sub7) class282_sub50_sub15_5.aClass477_9770.method7955(444396099)) {
							if (class282_sub50_sub7_6 == class282_sub50_sub7_0) {
								if (class282_sub50_sub15_5.method15249(class282_sub50_sub7_0, (byte) 111)) {
									Class13.method503(class282_sub50_sub15_5, 1035797942);
								}
								bool_3 = true;
								break;
							}
						}
						if (bool_3) {
							break;
						}
					}
				}
			}
		}
	}
}
