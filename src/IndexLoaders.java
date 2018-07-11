
public class IndexLoaders {
	
	/*
	 * Load vars
	 */
	static boolean USING_JAGEX_IMAGE_FORMAT;
	static LoadingStage LOADING_STAGE;
	
	/*
	 * Indices
	 */
	public static Index LOADING_FONT_INDEX;
	public static Index GAME_TIPS_INDEX;
	public static Index FONT_METRICS_INDEX;
	public static Index SPRITES_INDEX;
	public static Index INDEX_15;
	public static Index ANIMATION_SKELETON_INDEX;
	public static Index ANIMATION_SKIN_INDEX;
	public static Index SEQUENCES_INDEX;
	public static Index CONFIG_INDEX;
	public static Index INTERFACE_INDEX;
	public static Index SOUND_EFFECT_INDEX;
	public static Index MAP_INDEX;
	public static Index MUSIC_INDEX;
	public static Index MESH_INDEX;
	public static Index TEXTURE_INDEX;
	public static Index HUFFMAN_INDEX;
	public static Index INDEX_11;
	public static Index CS2_SCRIPTS_INDEX;
	public static Index MIDI_INSTRUMENT_INDEX;
	public static Index OBJECT_INDEX;
	public static Index ENUM_INDEX;
	public static Index NPC_INDEX;
	public static Index ITEM_INDEX;
	public static Index SPOTANIM_INDEX;
	public static Index VARBIT_INDEX;
	public static Index WORLD_MAP_INDEX;
	public static Index QC_MESSAGES_INDEX;
	public static Index QC_MENU_INDEX;
	public static Index TEXTURE_DEFINITION_INDEX;
	public static Index PARTICLE_INDEX;
	public static Index DEFAULTS_INDEX;
	public static Index BILLBOARD_INDEX;
	public static Index CUTSCENE_INDEX;
	public static Index NATIVE_LIBRARY_INDEX;
	public static Index SHADER_INDEX;
	public static Index aClass317_2663;
	
	/*
	 * Index Loaders
	 */
	public static ItemIndexLoader ITEM_INDEX_LOADER;
	public static Interface22 IMAGE_LOADER;
	public static ItemDefaultsLoader ITEM_DEFAULTS;
	public static Class211 aClass211_9383;
	public static Class438 aClass438_7932;
	public static Class31 aClass31_204;
	public static Class290 HITBAR_INDEX;
	public static Class210 HITSPLAT_INDEX_LOADER;
	public static UnderlayIndexLoader UNDERLAY_INDEX_LOADER;
	public static Class536 aClass536_1535;
	public static Class444 aClass444_5570;
	public static InventoriesIndexLoader INVENTORY_INDEX_LOADER;
	public static Class436 aClass436_7683;
	public static ObjectIndexLoader OBJECT_INDEX_LOADER;
	public static MapRegion MAP_REGION_DECODER;
	public static MapRegionLoaderTask MAP_REGION_LOADER_THREAD;
	public static WorldMapIndexLoader WORLD_MAP_INDEX_LOADER;
	public static Class427 aClass427_995;
	public static NPCIndexLoader NPC_INDEX_LOADER;
	public static Class242 aClass242_4922;
	public static Class523 aClass523_3868;
	public static Class288 aClass288_1746;
	public static Class45 aClass45_5759;
	public static Class515 aClass515_9416;
	public static Class421 aClass421_2658;
	public static Class401 aClass401_4791;
	public static Class408 aClass408_7207;
	public static Class230 aClass230_147;
	public static Class377 aClass377_1065;
	public static Class447 aClass447_435;
	public static Class498 aClass498_3001;
	public static Class394 aClass394_5831;
	public static Class233 aClass233_5822;
	public static Class331 QUICK_CHAT_INDEX_LOADER;
	public static QuickchatDefinitionsLoader QUICK_CHAT_INDEX_LOADER2;

	public static int initializeGame(byte i) {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub25_8206.method12926((byte) 1) == 0) {
			for (int i_6_ = 0; i_6_ < client.anInt7193 * -1911445195; i_6_++) {
				if ((client.anInterface16Array7154[i_6_].method118(-469731478) == 's') || client.anInterface16Array7154[i_6_].method118(-1315201556) == 'S') {
					Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub25_8206, 1, -821310033);
					client.aBool7155 = true;
					break;
				}
			}
		}
		if (LOADING_STAGE == LoadingStage.aClass387_4697) {
			if (Class468_Sub9.JS5_MANAGER == null) {
				Class468_Sub9.JS5_MANAGER = new JS5Manager(Class119.JS5_STANDARD_REQUESTER, Whirlpool.JS5_LOCAL_REQUESTER, Class18.UPDATE_SERVER_EXPONENT, Class18.UPDATE_SERVER_MODULUS);
			}
			if (!Class468_Sub9.JS5_MANAGER.verify255RSA((byte) -44)) {
				return 0;
			}
			Class282_Sub17_Sub1.method15402(0, null, true, 1056006027);
			USING_JAGEX_IMAGE_FORMAT = !NodeCollection.method8145(-1882809257);
			LOADING_FONT_INDEX = loadIndex((USING_JAGEX_IMAGE_FORMAT ? IndexReference.INDEX_34 : IndexReference.INDEX_32), false, 1, true);
			GAME_TIPS_INDEX = loadIndex(IndexReference.INDEX_33, false, 1, true);
			FONT_METRICS_INDEX = loadIndex(IndexReference.INDEX_13, false, 1, true);
		}
		if (LoadingStage.aClass387_4695 == LOADING_STAGE) {
			boolean bool = GAME_TIPS_INDEX.method5612((byte) 25);
			int i_7_ = Class492.aClass327_Sub1Array5777[IndexReference.INDEX_33.method1781(-1788134814)].method12543(-1386827058);
			i_7_ = (i_7_ + Class492.aClass327_Sub1Array5777[(USING_JAGEX_IMAGE_FORMAT ? IndexReference.INDEX_34.method1781(-1812792223) : IndexReference.INDEX_32.method1781(-1188170232))].method12543(-1418980679));
			i_7_ += Class492.aClass327_Sub1Array5777[IndexReference.INDEX_13.method1781(308835858)].method12543(-1132280394);
			i_7_ = i_7_ + (bool ? 100 : GAME_TIPS_INDEX.method5614(-1834183892));
			if (i_7_ != 400) {
				return i_7_ / 4;
			}
			Class96_Sub10_Sub1.anInt10159 = LOADING_FONT_INDEX.getCrc() * -1509668177;
			Class302.anInt3561 = GAME_TIPS_INDEX.getCrc() * 1439418903;
			Class477.method7960(LOADING_FONT_INDEX, (byte) -12);
			int i_8_ = Class393.aClass282_Sub54_4783.aClass468_Sub11_8217.method12699((byte) -106);
			Class275_Sub7.aClass400_7862 = new Class400(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, GAME_TIPS_INDEX);
			Class399[] class399s = Class275_Sub7.aClass400_7862.method6786(i_8_, -1983202433);
			if (0 == class399s.length) {
				class399s = Class275_Sub7.aClass400_7862.method6786(0, 462233129);
			}
			Class29 class29 = new Class29(LOADING_FONT_INDEX, FONT_METRICS_INDEX);
			if (class399s.length > 0) {
				Class302.anInterface27Array3559 = new Interface27[class399s.length];
				for (int i_9_ = 0; i_9_ < Class302.anInterface27Array3559.length; i_9_++) {
					Class302.anInterface27Array3559[i_9_] = new Class299((Class275_Sub7.aClass400_7862.method6785(class399s[i_9_].anInt4814 * -87203297, 1258078414)), class399s[i_9_].anInt4815 * -811216011, -1604669349 * class399s[i_9_].anInt4816, class29);
				}
			}
		}
		if (LOADING_STAGE == LoadingStage.aClass387_4696) {
			Class487.aClass378_5752 = new Class378(LOADING_FONT_INDEX, FONT_METRICS_INDEX, Class52_Sub3.method14522(-388253830));
		}
		if (LoadingStage.aClass387_4702 == LOADING_STAGE) {
			int i_10_ = Class487.aClass378_5752.method6404(253897692);
			int i_11_ = Class487.aClass378_5752.method6422(-1970261338);
			if (i_10_ < i_11_) {
				return i_10_ * 100 / i_11_;
			}
		}
		if (LOADING_STAGE == LoadingStage.aClass387_4708) {
			if (Class302.anInterface27Array3559 != null && Class302.anInterface27Array3559.length > 0) {
				if (Class302.anInterface27Array3559[0].method191(-155060841) < 100) {
					return 0;
				}
				if (Class302.anInterface27Array3559.length > 1 && Class275_Sub7.aClass400_7862.method6790(906509340) && Class302.anInterface27Array3559[1].method191(1471914500) < 100) {
					return 0;
				}
			}
			Class487.aClass378_5752.method6403(client.anInterface35_7206, (short) 255);
			Class282_Sub11_Sub3.method15476(Renderers.SOFTWARE_RENDERER, 425996443);
			Class365.setGameState(15, 1025544676);
		}
		if (LOADING_STAGE == LoadingStage.aClass387_4699) {
			SPRITES_INDEX = loadIndex(IndexReference.INDEX_8, false, 1, false);
			ANIMATION_SKELETON_INDEX = loadIndex(IndexReference.INDEX_0, false, 1, false);
			ANIMATION_SKIN_INDEX = loadIndex(IndexReference.INDEX_1, false, 1, false);
			CONFIG_INDEX = loadIndex(IndexReference.INDEX_2, false, 1, true);
			INTERFACE_INDEX = loadIndex(IndexReference.INDEX_3, false, 1, true);
			SOUND_EFFECT_INDEX = loadIndex(IndexReference.INDEX_4, false, 1, false);
			MAP_INDEX = loadIndex(IndexReference.INDEX_5, true, 1, false);
			MUSIC_INDEX = loadIndex(IndexReference.INDEX_6, true, 1, false);
			MESH_INDEX = loadIndex(IndexReference.INDEX_7, false, 1, false);
			TEXTURE_INDEX = loadIndex(IndexReference.INDEX_9, false, 1, true);
			HUFFMAN_INDEX = loadIndex(IndexReference.INDEX_10, false, 1, false);
			INDEX_11 = loadIndex(IndexReference.INDEX_11, false, 1, false);
			CS2_SCRIPTS_INDEX = loadIndex(IndexReference.INDEX_12, false, 1, true);
			MIDI_INSTRUMENT_INDEX = loadIndex(IndexReference.INDEX_14, false, 1, false);
			INDEX_15 = loadIndex(IndexReference.INDEX_15, false, 1, false);
			OBJECT_INDEX = loadIndex(IndexReference.INDEX_16, false, 1, true);
			ENUM_INDEX = loadIndex(IndexReference.INDEX_17, false, 1, true);
			NPC_INDEX = loadIndex(IndexReference.INDEX_18, false, 1, true);
			ITEM_INDEX = loadIndex(IndexReference.INDEX_19, false, 1, true);
			SEQUENCES_INDEX = loadIndex(IndexReference.INDEX_20, false, 1, true);
			SPOTANIM_INDEX = loadIndex(IndexReference.INDEX_21, false, 1, true);
			VARBIT_INDEX = loadIndex(IndexReference.INDEX_22, false, 1, true);
			WORLD_MAP_INDEX = loadIndex(IndexReference.INDEX_23, true, 1, false);
			QC_MESSAGES_INDEX = loadIndex(IndexReference.INDEX_24, false, 1, true);
			QC_MENU_INDEX = loadIndex(IndexReference.INDEX_25, false, 1, true);
			TEXTURE_DEFINITION_INDEX = loadIndex(IndexReference.INDEX_26, true, 1, true);
			PARTICLE_INDEX = loadIndex(IndexReference.INDEX_27, false, 1, true);
			DEFAULTS_INDEX = loadIndex(IndexReference.INDEX_28, true, 1, true);
			BILLBOARD_INDEX = loadIndex(IndexReference.INDEX_29, false, 1, true);
			CUTSCENE_INDEX = loadIndex(IndexReference.INDEX_35, true, 1, false);
			NATIVE_LIBRARY_INDEX = loadIndex(IndexReference.INDEX_30, true, 1, false);
			SHADER_INDEX = loadIndex(IndexReference.INDEX_31, true, 1, true);
			aClass317_2663 = loadIndex(IndexReference.INDEX_36, true, 2, false);
		}
		if (LOADING_STAGE == LoadingStage.aClass387_4700) {
			int i_12_ = 0;
			for (int i_13_ = 0; i_13_ < Class492.aClass327_Sub1Array5777.length; i_13_++) {
				if (Class492.aClass327_Sub1Array5777[i_13_] != null) {
					i_12_ += (Class492.aClass327_Sub1Array5777[i_13_].method12543(-1380150804) * Class302.anIntArray3558[i_13_] / 100);
				}
			}
			if (i_12_ != 100) {
				if (-1474947065 * Class302.anInt3564 < 0) {
					Class302.anInt3564 = 1146213815 * i_12_;
				}
				return ((i_12_ - Class302.anInt3564 * -1474947065) * 100 / (100 - Class302.anInt3564 * -1474947065));
			}
			Class468_Sub20.method12806(SPRITES_INDEX, (byte) -64);
			Class487.aClass378_5752 = new Class378(SPRITES_INDEX, FONT_METRICS_INDEX, Class52_Sub3.method14522(-388253830));
		}
		if (LoadingStage.aClass387_4717 == LOADING_STAGE) {
			byte[] is = DEFAULTS_INDEX.getFile(((DefaultsFile.FILE_4.anInt6966) * -1719912253), -176752755);
			if (is == null) {
				return 0;
			}
			Class89.method1496(is, -164492309);
			NodeCollection.method8148((byte) 4);
			Class365.setGameState(1, 1855105859);
		}
		if (LoadingStage.aClass387_4709 == LOADING_STAGE) {
			NATIVE_LIBRARY_LOADER = new NativeLibraryLoader(NATIVE_LIBRARY_INDEX);
			Class159.setNativeLibraryLoader(NATIVE_LIBRARY_LOADER, 1544888001);
		}
		if (LoadingStage.aClass387_4716 == LOADING_STAGE) {
			int i_14_ = Class461.method7702(-1152427430);
			if (i_14_ < 100) {
				return i_14_;
			}
			Class358.method6235((DEFAULTS_INDEX.getFile((-1719912253 * DefaultsFile.FILE_1.anInt6966), -1241129078)), (byte) -81);
			Class58.aClass529_527 = new Class529(DEFAULTS_INDEX);
			AbstractQueue_Sub1.SKIN_COLORS = Class58.aClass529_527.aShortArrayArray7039;
			Class366.SKIN_COLORS = Class58.aClass529_527.aShortArrayArrayArray7040;
			if (-1 != Class58.aClass529_527.anInt7045 * 1965360767 && -1 != 2007534195 * Class58.aClass529_527.anInt7046) {
				client.anInt7439 = -406576707 * Class58.aClass529_527.anInt7045;
				client.anInt7312 = 981526077 * Class58.aClass529_527.anInt7046;
			}
			Class473.DEFAULTS_LOADER_6 = new Defaults6Loader(DEFAULTS_INDEX);
			Class149_Sub2.DEFAULTS_LOADER_7 = new Defaults7Loader(DEFAULTS_INDEX);
			Class282_Sub13.DEFAULTS_LOADER_8 = new Defaults8Loader(DEFAULTS_INDEX);
		}
		if (LoadingStage.aClass387_4704 == LOADING_STAGE) {
			if (-1878247413 * Class58.aClass529_527.anInt7034 != -1 && !MESH_INDEX.load((-1878247413 * (Class58.aClass529_527.anInt7034)), 0, 16711935)) {
				return 99;
			}
			IMAGE_LOADER = new Class323(TEXTURE_DEFINITION_INDEX, TEXTURE_INDEX, SPRITES_INDEX);
			ITEM_DEFAULTS = new ItemDefaultsLoader(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX);
			aClass211_9383 = new Class211(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX, Class473.DEFAULTS_LOADER_6);
			aClass438_7932 = new Class438(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX, SPRITES_INDEX);
			aClass444_5570 = new Class444(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, ENUM_INDEX);
			aClass536_1535 = new Class536(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX);
			UNDERLAY_INDEX_LOADER = new UnderlayIndexLoader(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX);
			HITSPLAT_INDEX_LOADER = new Class210(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX, SPRITES_INDEX);
			HITBAR_INDEX = new Class290(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX, SPRITES_INDEX);
			aClass31_204 = new Class31(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX, MESH_INDEX);
			INVENTORY_INDEX_LOADER = new InventoriesIndexLoader(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX);
			aClass436_7683 = new Class436(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX);
			OBJECT_INDEX_LOADER = new ObjectIndexLoader(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, true, OBJECT_INDEX, MESH_INDEX);
			MAP_REGION_DECODER.setObjectIndexLoader(OBJECT_INDEX_LOADER, -834443097);
			MAP_REGION_LOADER_THREAD.setObjectIndexLoader(new ObjectIndexLoader(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, true, OBJECT_INDEX, MESH_INDEX), -375345213);
			WORLD_MAP_INDEX_LOADER = new WorldMapIndexLoader(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX, SPRITES_INDEX);
			aClass427_995 = new Class427(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX, SPRITES_INDEX);
			NPC_INDEX_LOADER = new NPCIndexLoader(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, true, NPC_INDEX, MESH_INDEX);
			ITEM_INDEX_LOADER = new ItemIndexLoader(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, true, ITEM_DEFAULTS, ITEM_INDEX, MESH_INDEX);
			aClass242_4922 = new Class242(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX, true);
			aClass523_3868 = new Class523(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, SEQUENCES_INDEX, ANIMATION_SKELETON_INDEX, ANIMATION_SKIN_INDEX);
			aClass288_1746 = new Class288(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX);
			aClass45_5759 = new Class45(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX);
			aClass515_9416 = new Class515(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, SPOTANIM_INDEX, MESH_INDEX);
			aClass421_2658 = new Class421(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX, true);
			aClass401_4791 = new Class401(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX);
			aClass408_7207 = new Class408(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX);
			aClass230_147 = new Class230(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, VARBIT_INDEX);
			aClass377_1065 = new Class377(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX);
			aClass447_435 = new Class447(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX);
			aClass498_3001 = new Class498(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX);
			aClass394_5831 = new Class394(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX);
			aClass233_5822 = new Class233(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, CONFIG_INDEX);
			Class403.method6803(INTERFACE_INDEX, MESH_INDEX, SPRITES_INDEX, FONT_METRICS_INDEX, 78858918);
			JS5StandardRequester.method5559(BILLBOARD_INDEX, -1845335453);
			QUICK_CHAT_INDEX_LOADER = new Class331(Class223.CURRENT_LANGUAGE, QC_MESSAGES_INDEX, QC_MENU_INDEX);
			QUICK_CHAT_INDEX_LOADER2 = new QuickchatDefinitionsLoader(Class223.CURRENT_LANGUAGE, QC_MESSAGES_INDEX, QC_MENU_INDEX, new Class58());
			Class158_Sub1.aClass3_8507 = new Class3();
			Class94.method1589((short) 255);
			Class77.method1369(aClass523_3868, 1486901897);
			Class62.method1261(PARTICLE_INDEX, (byte) -73);
			Class173.method2943(MESH_INDEX, IMAGE_LOADER, 16711680);
			Class117 class117 = new Class117(HUFFMAN_INDEX.method5626("huffman", "", (byte) 1));
			InventoriesIndexLoader.method6740(class117, -1608458297);
			Engine.aClass273_3244 = Class84.method1461(192179911);
			Class11.SYSTEM_INFO = new SystemInfo(true);
		}
		if (LoadingStage.aClass387_4705 == LOADING_STAGE) {
			int i_15_ = (Class59.method1159(SPRITES_INDEX, -1920163258) + Class487.aClass378_5752.method6405(true, 1940883220));
			int i_16_ = (Class109_Sub1.method14651(-2091974733) + Class487.aClass378_5752.method6422(-167054108));
			if (i_15_ < i_16_) {
				return 100 * i_15_ / i_16_;
			}
		}
		if (LOADING_STAGE == LoadingStage.aClass387_4706) {
			Class291.method5125(WORLD_MAP_INDEX, aClass536_1535, UNDERLAY_INDEX_LOADER, MAP_REGION_DECODER.method4436(-2053638412), WORLD_MAP_INDEX_LOADER, aClass427_995, Class158_Sub1.aClass3_8507);
		}
		if (LoadingStage.aClass387_4707 == LOADING_STAGE) {
			Class320.anIntArray3724 = new int[-1719166449 * aClass408_7207.anInt4851];
			Class282_Sub17_Sub2.aBoolArray9934 = new boolean[aClass408_7207.anInt4851 * -1719166449];
			Class462.aStringArray5548 = new String[-1873030137 * aClass401_4791.anInt4823];
			for (int i_17_ = 0; i_17_ < -1719166449 * aClass408_7207.anInt4851; i_17_++) {
				if ((aClass408_7207.method6873(i_17_, (byte) 124).anInt4983) * -1037642941 == 0) {
					Class282_Sub17_Sub2.aBoolArray9934[i_17_] = true;
					client.anInt7399 += 1707039013;
				}
				Class320.anIntArray3724[i_17_] = -1;
			}
			Class152.method2596((byte) -103);
			MAP_INDEX.method5676(false, true, (byte) 8);
			MUSIC_INDEX.method5676(true, true, (byte) 8);
			SPRITES_INDEX.method5676(true, true, (byte) 8);
			FONT_METRICS_INDEX.method5676(true, true, (byte) 8);
			HUFFMAN_INDEX.method5676(true, true, (byte) 8);
			client.aBool7219 = true;
		}
		if (LOADING_STAGE == LoadingStage.aClass387_4713) {
			if (!Class456_Sub3.method12682((Class58.aClass529_527.anInt7036 * 376713291), null, -402984376)) {
				return 0;
			}
			boolean bool = true;
			for (int i_18_ = 0; i_18_ < (Class468_Sub8.aClass98Array7889[Class58.aClass529_527.anInt7036 * 376713291].components).length; i_18_++) {
				IComponentDefinitions class118 = (Class468_Sub8.aClass98Array7889[376713291 * Class58.aClass529_527.anInt7036].components[i_18_]);
				if (-2131393857 * class118.anInt1268 == 5 && 985215637 * class118.anInt1320 != -1 && !SPRITES_INDEX.load((class118.anInt1320 * 985215637), 0, 16711935)) {
					bool = false;
				}
			}
			if (!bool) {
				return 0;
			}
		}
		if (LoadingStage.aClass387_4698 == LOADING_STAGE) {
			Class348.method6175(true, -1140561340);
		}
		if (LoadingStage.aClass387_4710 == LOADING_STAGE) {
			Class328.aClass306_3771.method5437(1971285079);
			try {
				Class377.aThread4520.join();
			} catch (InterruptedException interruptedexception) {
				return 0;
			}
			Class328.aClass306_3771 = null;
			Class377.aThread4520 = null;
			LOADING_FONT_INDEX = null;
			GAME_TIPS_INDEX = null;
			Class275_Sub7.aClass400_7862 = null;
			Class302.anInterface27Array3559 = null;
			Class358.method6234((byte) 120);
			client.aBool7465 = Class393.aClass282_Sub54_4783.aClass468_Sub25_8206.method12926((byte) -77) == 1;
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub25_8206), 1, -425362702);
			if (client.aBool7465) {
				Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub18_8214, 0, 2109366156);
			} else if ((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.aBool7914) && -79546877 * Class11.SYSTEM_INFO.anInt8167 < 512 && 0 != -79546877 * Class11.SYSTEM_INFO.anInt8167) {
				Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub18_8214, 0, -28181047);
			}
			Class190.method3148((byte) 125);
			if (client.aBool7465) {
				Class538.method11500(0, false, (byte) 24);
			} else {
				Class538.method11500(Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.method12776(2116214746), false, (byte) 24);
			}
			Class440.method7373(Class393.aClass282_Sub54_4783.aClass468_Sub9_8226.method12687(-2050547783), -1, -1, false, (byte) 65);
			Class487.aClass378_5752.method6403(client.anInterface35_7206, (short) 255);
			Class282_Sub11_Sub3.method15476(Renderers.SOFTWARE_RENDERER, -2058774683);
			Class188.method3139(Renderers.SOFTWARE_RENDERER, SPRITES_INDEX, -814245885);
			Class122.method2109(Class182.aClass160Array2261, (byte) -7);
		}
		return Class152.method2604((byte) 3);
	}

	public static Index loadIndex(IndexReference class102, boolean bool, int i, boolean bool_91_) {
		if (null == Class492.aClass327_Sub1Array5777)
			Class492.aClass327_Sub1Array5777 = new JS5GrabWorker[Class123.method2149(957345803)];
		JS5CacheFile class203 = null;
		int i_93_ = class102.method1781(-333623124);
		if (client.aClass440_3270 != null)
			class203 = new JS5CacheFile(i_93_, client.aClass440_3270, Class97.aClass440Array996[i_93_], 1500000);
		Class492.aClass327_Sub1Array5777[i_93_] = Class468_Sub9.JS5_MANAGER.method5480(i_93_, class203, Class533.aClass203_7073, (byte) 107);
		Class492.aClass327_Sub1Array5777[i_93_].method12544((short) -3210);
		return new Index(Class492.aClass327_Sub1Array5777[i_93_], bool, i);
	}

	public static NativeLibraryLoader NATIVE_LIBRARY_LOADER;
}
