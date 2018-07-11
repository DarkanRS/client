/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class190 {
	static boolean aBool2383 = false;

	public static void method3143() {
		if (!aBool2383) {
			Class435.method7301((IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1189807769).aClass293ArrayArrayArray2610), (byte) 43);
			if ((IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1170487294).aClass293ArrayArrayArray2608) != null) {
				Class435.method7301((IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-997459267).aClass293ArrayArrayArray2608), (byte) 84);
			}
			aBool2383 = true;
		}
	}

	public static void method3144() {
		if (!aBool2383) {
			Class435.method7301((IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1861368594).aClass293ArrayArrayArray2610), (byte) 104);
			if ((IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1030142987).aClass293ArrayArrayArray2608) != null) {
				Class435.method7301((IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1250980403).aClass293ArrayArrayArray2608), (byte) 42);
			}
			aBool2383 = true;
		}
	}

	public static void method3145() {
		if (!aBool2383) {
			Class435.method7301((IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1668774955).aClass293ArrayArrayArray2610), (byte) 75);
			if ((IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1081231062).aClass293ArrayArrayArray2608) != null) {
				Class435.method7301((IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1657805859).aClass293ArrayArrayArray2608), (byte) 86);
			}
			aBool2383 = true;
		}
	}

	Class190() throws Throwable {
		throw new Error();
	}

	public static void method3146() {
		if (!aBool2383) {
			Class435.method7301((IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-804715718).aClass293ArrayArrayArray2610), (byte) 2);
			if ((IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1011619217).aClass293ArrayArrayArray2608) != null) {
				Class435.method7301((IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1716542666).aClass293ArrayArrayArray2608), (byte) 70);
			}
			aBool2383 = true;
		}
	}

	static void method3147(Class293[][][] class293s) {
		for (int i = 0; i < class293s.length; i++) {
			Class293[][] class293s_0_ = class293s[i];
			for (int i_1_ = 0; i_1_ < class293s_0_.length; i_1_++) {
				for (int i_2_ = 0; i_2_ < class293s_0_[i_1_].length; i_2_++) {
					Class293 class293 = class293s_0_[i_1_][i_2_];
					if (null != class293) {
						if (class293.aClass521_Sub1_Sub3_3499 instanceof SceneObject) {
							((SceneObject) class293.aClass521_Sub1_Sub3_3499).method85((byte) 1);
						}
						if (class293.aClass521_Sub1_Sub4_3503 instanceof SceneObject) {
							((SceneObject) class293.aClass521_Sub1_Sub4_3503).method85((byte) 1);
						}
						if (class293.aClass521_Sub1_Sub4_3500 instanceof SceneObject) {
							((SceneObject) class293.aClass521_Sub1_Sub4_3500).method85((byte) 1);
						}
						if (class293.aClass521_Sub1_Sub5_3505 instanceof SceneObject) {
							((SceneObject) class293.aClass521_Sub1_Sub5_3505).method85((byte) 1);
						}
						if (class293.aClass521_Sub1_Sub5_3502 instanceof SceneObject) {
							((SceneObject) class293.aClass521_Sub1_Sub5_3502).method85((byte) 1);
						}
						for (Class208 class208 = class293.aClass208_3504; class208 != null; class208 = class208.aClass208_2660) {
							Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
							if (class521_sub1_sub1 instanceof SceneObject) {
								((SceneObject) class521_sub1_sub1).method85((byte) 1);
							}
						}
					}
				}
			}
		}
	}

	public static void method3148(byte i) {
		Class442 class442 = null;
		try {
			class442 = Class345.method6137("", client.CURRENT_GAME.aString5748, true, (byte) -1);
			RsByteBuffer class282_sub35 = Class393.aClass282_Sub54_4783.method13499(-1147561842);
			class442.method7386(class282_sub35.buffer, 0, class282_sub35.index * -1990677291, -1686459180);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (null != class442) {
				class442.method7385((short) 27366);
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	static void method3149(IComponentDefinitions class118, Class455 class455, int i, int i_3_, int i_4_, int i_5_, NativeSprite class160, int i_6_) {
		if (null != class160) {
			int i_7_;
			if (4 == NativeLibraryLoader.anInt3240 * -672443707) {
				i_7_ = (int) client.aFloat7365 & 0x3fff;
			} else {
				i_7_ = ((int) client.aFloat7365 + client.anInt7255 * -1790074477 & 0x3fff);
			}
			int i_8_ = (Math.max(1506818197 * class118.anInt1301 / 2, -492594917 * class118.anInt1429 / 2) + 10);
			int i_9_ = i_5_ * i_5_ + i_4_ * i_4_;
			if (i_9_ <= i_8_ * i_8_) {
				int i_10_ = Class382.anIntArray4657[i_7_];
				int i_11_ = Class382.anIntArray4661[i_7_];
				if (4 != -672443707 * NativeLibraryLoader.anInt3240) {
					i_10_ = 256 * i_10_ / (-1864403271 * client.anInt7203 + 256);
					i_11_ = 256 * i_11_ / (client.anInt7203 * -1864403271 + 256);
				}
				int i_12_ = i_5_ * i_10_ + i_11_ * i_4_ >> 14;
				int i_13_ = i_5_ * i_11_ - i_10_ * i_4_ >> 14;
				class160.method2773((1506818197 * class118.anInt1301 / 2 + i + i_12_ - class160.method228() / 2), (class118.anInt1429 * -492594917 / 2 + i_3_ - i_13_ - class160.method2748() / 2), class455, i, i_3_);
			}
		}
	}

	public static RouteStrategy method3150(int i, int i_14_, int i_15_, int i_16_, int i_17_, byte i_18_) {
		Class224.aClass225_Sub2_2778.approxDestinationX = -726719813 * i;
		Class224.aClass225_Sub2_2778.approxDestinationY = i_14_ * 1767388707;
		Class224.aClass225_Sub2_2778.approxDestinationSizeX = -12808295 * i_15_;
		Class224.aClass225_Sub2_2778.approxDestinationSizeY = i_16_ * 1709796035;
		Class224.aClass225_Sub2_2778.anInt7928 = i_17_ * -1398297429;
		return Class224.aClass225_Sub2_2778;
	}

	static void method3151(int i, int i_19_, IComponentDefinitions class118, Class119 class119, int i_20_, int i_21_, int i_22_) {
		Class180[] class180s = client.aClass180Array7348;
		for (int i_23_ = 0; i_23_ < class180s.length; i_23_++) {
			Class180 class180 = class180s[i_23_];
			if (null != class180 && 0 != -379447335 * class180.anInt2236 && client.cycles * -1809259861 % 20 < 10) {
				if (1 == -379447335 * class180.anInt2236) {
					Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754(1505135749 * class180.anInt2238)));
					if (null != class282_sub47) {
						NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
						Vector3 class385 = (class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
						int i_24_ = (int) class385.x / 128 - i / 128;
						int i_25_ = (int) class385.z / 128 - i_19_ / 128;
						Class390.method6728(class118, class119, i_20_, i_21_, i_24_, i_25_, -1923151643 * class180.anInt2240, 360000L);
					}
				}
				if (2 == -379447335 * class180.anInt2236) {
					int i_26_ = -51612493 * class180.anInt2243 / 128 - i / 128;
					int i_27_ = class180.anInt2235 * -1074026889 / 128 - i_19_ / 128;
					long l = 1116475963 * class180.anInt2237 << 7;
					l *= l;
					Class390.method6728(class118, class119, i_20_, i_21_, i_26_, i_27_, (class180.anInt2240 * -1923151643), l);
				}
				if (class180.anInt2236 * -379447335 == 10 && 1505135749 * class180.anInt2238 >= 0 && (class180.anInt2238 * 1505135749 < (client.players).length)) {
					Player class521_sub1_sub1_sub2_sub1 = (client.players[class180.anInt2238 * 1505135749]);
					if (class521_sub1_sub1_sub2_sub1 != null) {
						Vector3 class385 = (class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
						int i_28_ = (int) class385.x / 128 - i / 128;
						int i_29_ = (int) class385.z / 128 - i_19_ / 128;
						Class390.method6728(class118, class119, i_20_, i_21_, i_28_, i_29_, (class180.anInt2240 * -1923151643), 360000L);
					}
				}
			}
		}
	}

	static void method3152(byte i) {
		if (client.anInt7166 * -1741204137 == 17) {
			Class42_Sub1.method14562(733346392);
		}
		Class186.method3083(619410098);
		client.aClass184_7218.method3051((byte) -99);
		Class530.aBool7050 = true;
		Class250.method4296(-1751136048);
		for (int i_30_ = 0; i_30_ < client.aClass180Array7348.length; i_30_++) {
			client.aClass180Array7348[i_30_] = null;
		}
		client.aBool7344 = false;
		Class16.method566(2012843625);
		client.anInt7248 = ((int) (Math.random() * 100.0) - 50) * -1917577385;
		client.anInt7250 = ((int) (Math.random() * 110.0) - 55) * -796384909;
		client.anInt7343 = ((int) (Math.random() * 80.0) - 40) * 337678701;
		client.anInt7255 = ((int) (Math.random() * 120.0) - 60) * -911235941;
		client.anInt7203 = ((int) (Math.random() * 30.0) - 20) * -137777271;
		client.aFloat7365 = (int) (Math.random() * 160.0) - 80 & 0x3fff;
		Class394.method6763((byte) 68);
		for (int i_31_ = 0; i_31_ < 2048; i_31_++) {
			client.players[i_31_] = null;
		}
		Class84.myPlayer = null;
		client.anInt7211 = 0;
		client.anInt7210 = 0;
		client.aClass465_7208.method7749(1966305284);
		client.aClass482_7333.method8118(1024989967);
		client.aClass465_7334.method7749(1935752602);
		client.aClass457_7335.method7651((byte) 5);
		client.aClass465_7414.method7749(828403909);
		Class282_Sub31.aClass482_7775 = new NodeCollection();
		Class282_Sub31.aClass482_7776 = new NodeCollection();
		Class158_Sub1.aClass3_8507.method265(-1043684196);
		Class8_Sub3.method14341(1480679080);
		Class296.anInt3534 = 0;
		Class282_Sub44.anInt8064 = 0;
		Class525.anInt6985 = 0;
		Class454.anInt5451 = 0;
		Class115.anInt1249 = 0;
		Class96_Sub13.anInt9368 = 0;
		OutgoingLoginPacket.anInt4280 = 0;
		Class121.anInt1527 = 0;
		Class473.anInt5606 = 0;
		Class501.anInt5828 = 0;
		for (int i_32_ = 0; i_32_ < Class320.anIntArray3724.length; i_32_++) {
			if (!Class282_Sub17_Sub2.aBoolArray9934[i_32_]) {
				Class320.anIntArray3724[i_32_] = -1;
			}
		}
		if (client.anInt7349 * -1699899559 != -1) {
			Class337.method6017(client.anInt7349 * -1699899559, 1308673999);
		}
		for (Class282_Sub44 class282_sub44 = ((Class282_Sub44) client.aClass465_7442.method7750(774217336)); class282_sub44 != null; class282_sub44 = ((Class282_Sub44) client.aClass465_7442.method7751((byte) 87))) {
			if (!class282_sub44.method4994(2082273340)) {
				class282_sub44 = (Class282_Sub44) client.aClass465_7442.method7750(-1913243579);
				if (null == class282_sub44) {
					break;
				}
			}
			Class351.method6196(class282_sub44, true, false, -1492337711);
		}
		client.anInt7349 = -153305321;
		client.aClass465_7442 = new IterableNodeMap(8);
		MeshModifier.method7041((byte) -126);
		client.aClass118_7352 = null;
		for (int i_33_ = 0; i_33_ < 8; i_33_++) {
			client.aStringArray7329[i_33_] = null;
			client.aBoolArray7330[i_33_] = false;
			client.anIntArray7328[i_33_] = -1;
		}
		Class8_Sub2.method14262(-19282159);
		client.aBool7172 = true;
		for (int i_34_ = 0; i_34_ < 107; i_34_++) {
			client.aBoolArray7443[i_34_] = true;
		}
		for (int i_35_ = 0; i_35_ < 6; i_35_++) {
			client.aClass330Array7428[i_35_] = new Class330();
		}
		IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4048(117803918);
		client.aBool7371 = true;
		Class455.aShortArray5452 = ObjectDefinitions.aShortArray5691 = NPCDefinitions.aShortArray4862 = ItemDefinitions.staticColorArr256 = new short[256];
		Class85.aString817 = Message.WALK_HERE.translate(Class223.CURRENT_LANGUAGE, -1420130584);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub27_8209), Class393.aClass282_Sub54_4783.aClass468_Sub27_8208.method12952((byte) 104), 999317322);
		client.anInt7221 = 0;
		Class350.method6189((byte) 111);
		Class388.method6692(2043592347);
		Class496.aClass510_5816 = null;
		Class28.aLong351 = 0L;
	}
}
