package com.jagex;

import com.jagex.clans.settings.impl.EditMemberSetting;

public class IndexLoaders {

    public static MapRegion MAP_REGION_DECODER;
    public static MapRegionLoaderTask MAP_REGION_LOADER_THREAD;
    public static Index SPRITES_INDEX;
    public static Index ANIMATION_FRAME_SET_INDEX;
    public static Index ANIMATION_FRAME_BASE_INDEX;
    public static Index CONFIG_INDEX;
    public static Index INTERFACE_INDEX;
    public static Index SOUND_EFFECT_INDEX;
    public static Index MAP_INDEX;
    public static Index MUSIC_INDEX;
    public static Index MESH_INDEX;
    public static Index TEXTURE_INDEX;
    public static Index HUFFMAN_INDEX;
    public static Index MUSIC2_INDEX;
    public static Index CS2_SCRIPTS_INDEX;
    public static Index MIDI_INSTRUMENT_INDEX;
    public static Index SOUND_MIDI_INDEX;
    public static Index OBJECT_INDEX;
    public static Index ENUM_INDEX;
    public static Index NPC_INDEX;
    public static Index ITEM_INDEX;
    public static Index ANIMATION_INDEX;
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
    public static Index VORBIS_INDEX;
    public static Index LOADING_FONT_INDEX;
    public static Index GAME_TIPS_INDEX;
    public static Index FONT_METRICS_INDEX;
    public static NativeLibraryLoader NATIVE_LIBRARY_LOADER;
    public static ImageLoader IMAGE_LOADER;
    public static ParamIndexLoader PARAM_LOADER;
    public static RenderAnimIndexLoader RENDER_ANIM_LOADER;
    public static CursorIndexLoader CURSOR_LOADER;
    public static EnumIndexLoader ENUM_LOADER;
    public static OverlayIndexLoader OVERLAY_LOADER;
    public static UnderlayIndexLoader UNDERLAY_LOADER;
    public static ScriptRunner HITSPLAT_LOADER;
    public static HeadbarIndexLoader HITBAR_LOADER;
    public static IdentiKitIndexLoader IDENTIKIT_LOADER;
    public static InventoriesIndexLoader INVENTORY_LOADER;
    public static LightIntensityIndexLoader LIGHT_INTENSITY_LOADER;
    public static LocationIndexLoader OBJECT_LOADER;
    public static MapAreaIndexLoader WORLD_MAP_LOADER;
    public static MapSpriteIndexLoader MAP_SPRITE_LOADER;
    public static NPCIndexLoader NPC_INDEX_LOADER;
    public static ItemIndexLoader ITEM_LOADER;
    public static QuestIndexLoader QUEST_LOADER;
    public static AnimationIndexLoader ANIMATION_LOADER;
    public static SkyboxIndexLoader SKYBOX_LOADER;
    public static SunIndexLoader SUN_LOADER;
    public static SpotAnimIndexLoader SPOT_ANIM_LOADER;
    public static StructIndexLoader STRUCT_LOADER;
    public static VarcStringIndexLoader VARC_STRING_LOADER;
    public static VarcIndexLoader VARC_LOADER;
    public static VarBitIndexLoader VARBIT_LOADER;
    public static VarDefinitionLoader VAR_LOADER;
    public static VarnIndexLoader VARN_LOADER;
    public static VarnBitIndexLoader VARNBIT_LOADER;
    public static ClanVarIndexLoader CLAN_VAR_LOADER;
    public static ClanVarSettingsIndexLoader CLAN_VAR_SETTINGS_LOADER;
    public static QuickchatCategoryLoader QUICK_CHAT_CATEGORY_LOADER;
    public static QuickchatMessageLoader QUICK_CHAT_MESSAGE_LOADER;
    static LoadingStage LOADING_STAGE;
    static boolean USING_JAGEX_IMAGE_FORMAT;

    public static int initializeGame() {
        int i;
        if (Class393.preferences.safeMode.getValue() == 0) {
            for (i = 0; i < client.anInt7193; i++) {
                if (client.KEYS_PRESSED[i].getCharacter() == 115 || client.KEYS_PRESSED[i].getCharacter() == 83) {
                    Class393.preferences.setValue(Class393.preferences.safeMode, 1);
                    client.aBool7155 = true;
                    break;
                }
            }
        }

        if (LOADING_STAGE == LoadingStage.aClass387_4697) {
            if (ScreenSizePreference.JS5_MANAGER == null) {
                ScreenSizePreference.JS5_MANAGER = new JS5Manager(Class119.JS5_STANDARD_REQUESTER, Whirlpool.JS5_LOCAL_REQUESTER);
            }

            if (!ScreenSizePreference.JS5_MANAGER.init()) {
                return 0;
            }

            Node_Sub17_Sub1.method15402(0, null, true);
            USING_JAGEX_IMAGE_FORMAT = !NodeCollection.method8145();
            LOADING_FONT_INDEX = loadIndex(USING_JAGEX_IMAGE_FORMAT ? IndexReference.INDEX_34 : IndexReference.INDEX_32, false, 1);
            GAME_TIPS_INDEX = loadIndex(IndexReference.INDEX_33, false, 1);
            FONT_METRICS_INDEX = loadIndex(IndexReference.INDEX_13, false, 1);
        }

        int i_2;
        boolean bool_10;
        if (LoadingStage.aClass387_4695 == LOADING_STAGE) {
            bool_10 = GAME_TIPS_INDEX.isValid();
            i_2 = Class492.aClass327_Sub1Array5777[IndexReference.INDEX_33.method1781()].method12543();
            i_2 += Class492.aClass327_Sub1Array5777[USING_JAGEX_IMAGE_FORMAT ? IndexReference.INDEX_34.method1781() : IndexReference.INDEX_32.method1781()].method12543();
            i_2 += Class492.aClass327_Sub1Array5777[IndexReference.INDEX_13.method1781()].method12543();
            i_2 += bool_10 ? 100 : GAME_TIPS_INDEX.getCompletion();
            if (i_2 != 400) {
                return i_2 / 4;
            }

            CutsceneAction_Sub10_Sub1.anInt10159 = LOADING_FONT_INDEX.getCrc();
            Class302.anInt3561 = GAME_TIPS_INDEX.getCrc();
            Queue.loadFontArchiveIds(LOADING_FONT_INDEX);
            int i_3 = Class393.preferences.aPreference_Sub11_8217.method12699();
            EntityNode_Sub7.GAME_TIPS_LOADER = new GameTipsLoader(GAME_TIPS_INDEX);
            Class399[] arr_4 = EntityNode_Sub7.GAME_TIPS_LOADER.method6786(i_3);
            if (arr_4.length == 0) {
                arr_4 = EntityNode_Sub7.GAME_TIPS_LOADER.method6786(0);
            }

            Class29 class29_5 = new Class29(LOADING_FONT_INDEX, FONT_METRICS_INDEX);
            if (arr_4.length > 0) {
                Class302.anInterface27Array3559 = new Interface27[arr_4.length];

                for (int i_6 = 0; i_6 < Class302.anInterface27Array3559.length; i_6++) {
                    Class302.anInterface27Array3559[i_6] = new Class299(EntityNode_Sub7.GAME_TIPS_LOADER.method6785(arr_4[i_6].anInt4814), arr_4[i_6].anInt4815, arr_4[i_6].anInt4816, class29_5);
                }
            }
        }

        if (LOADING_STAGE == LoadingStage.aClass387_4696) {
            Class487.aClass378_5752 = new Class378(LOADING_FONT_INDEX, FONT_METRICS_INDEX, Class52_Sub3.getFontSpecifications());
        }

        if (LoadingStage.aClass387_4702 == LOADING_STAGE) {
            i = Class487.aClass378_5752.method6404();
            i_2 = Class487.aClass378_5752.method6422();
            if (i < i_2) {
                return i * 100 / i_2;
            }
        }

        if (LOADING_STAGE == LoadingStage.aClass387_4708) {
            if (Class302.anInterface27Array3559 != null && Class302.anInterface27Array3559.length > 0) {
                if (Class302.anInterface27Array3559[0].method191() < 100) {
                    return 0;
                }

                if (Class302.anInterface27Array3559.length > 1 && EntityNode_Sub7.GAME_TIPS_LOADER.method6790() && Class302.anInterface27Array3559[1].method191() < 100) {
                    return 0;
                }
            }

            Class487.aClass378_5752.method6403(client.anInterface35_7206);
            EditMemberSetting.method15476();
            GameState.setGameState(GameState.UNK_15);
        }

        if (LOADING_STAGE == LoadingStage.aClass387_4699) {
            SPRITES_INDEX = loadIndex(IndexReference.INDEX_8, false, 1);
            ANIMATION_FRAME_SET_INDEX = loadIndex(IndexReference.INDEX_0, false, 1);
            ANIMATION_FRAME_BASE_INDEX = loadIndex(IndexReference.INDEX_1, false, 1);
            CONFIG_INDEX = loadIndex(IndexReference.INDEX_2, false, 1);
            INTERFACE_INDEX = loadIndex(IndexReference.INDEX_3, false, 1);
            SOUND_EFFECT_INDEX = loadIndex(IndexReference.INDEX_4, false, 1);
            MAP_INDEX = loadIndex(IndexReference.INDEX_5, true, 1);
            MUSIC_INDEX = loadIndex(IndexReference.INDEX_6, true, 1);
            MESH_INDEX = loadIndex(IndexReference.INDEX_7, false, 1);
            TEXTURE_INDEX = loadIndex(IndexReference.INDEX_9, false, 1);
            HUFFMAN_INDEX = loadIndex(IndexReference.INDEX_10, false, 1);
            MUSIC2_INDEX = loadIndex(IndexReference.INDEX_11, false, 1);
            CS2_SCRIPTS_INDEX = loadIndex(IndexReference.INDEX_12, false, 1);
            MIDI_INSTRUMENT_INDEX = loadIndex(IndexReference.INDEX_14, false, 1);
            SOUND_MIDI_INDEX = loadIndex(IndexReference.INDEX_15, false, 1);
            OBJECT_INDEX = loadIndex(IndexReference.INDEX_16, false, 1);
            ENUM_INDEX = loadIndex(IndexReference.INDEX_17, false, 1);
            NPC_INDEX = loadIndex(IndexReference.INDEX_18, false, 1);
            ITEM_INDEX = loadIndex(IndexReference.INDEX_19, false, 1);
            ANIMATION_INDEX = loadIndex(IndexReference.INDEX_20, false, 1);
            SPOTANIM_INDEX = loadIndex(IndexReference.INDEX_21, false, 1);
            VARBIT_INDEX = loadIndex(IndexReference.INDEX_22, false, 1);
            WORLD_MAP_INDEX = loadIndex(IndexReference.INDEX_23, true, 1);
            QC_MESSAGES_INDEX = loadIndex(IndexReference.INDEX_24, false, 1);
            QC_MENU_INDEX = loadIndex(IndexReference.INDEX_25, false, 1);
            TEXTURE_DEFINITION_INDEX = loadIndex(IndexReference.INDEX_26, true, 1);
            PARTICLE_INDEX = loadIndex(IndexReference.INDEX_27, false, 1);
            DEFAULTS_INDEX = loadIndex(IndexReference.INDEX_28, true, 1);
            BILLBOARD_INDEX = loadIndex(IndexReference.INDEX_29, false, 1);
            CUTSCENE_INDEX = loadIndex(IndexReference.INDEX_35, true, 1);
            NATIVE_LIBRARY_INDEX = loadIndex(IndexReference.INDEX_30, true, 1);
            SHADER_INDEX = loadIndex(IndexReference.INDEX_31, true, 1);
            VORBIS_INDEX = loadIndex(IndexReference.INDEX_36, true, 2);
        }

        if (LOADING_STAGE == LoadingStage.aClass387_4700) {
            i = 0;

            for (i_2 = 0; i_2 < Class492.aClass327_Sub1Array5777.length; i_2++) {
                if (Class492.aClass327_Sub1Array5777[i_2] != null) {
                    i += Class492.aClass327_Sub1Array5777[i_2].method12543() * Class302.anIntArray3558[i_2] / 100;
                }
            }

            if (i != 100) {
                if (Class302.anInt3564 < 0) {
                    Class302.anInt3564 = i;
                }

                return (i - Class302.anInt3564) * 100 / (100 - Class302.anInt3564);
            }

            Preference_Sub20.method12806(SPRITES_INDEX);
            Class487.aClass378_5752 = new Class378(SPRITES_INDEX, FONT_METRICS_INDEX, Class52_Sub3.getFontSpecifications());
        }

        if (LoadingStage.aClass387_4717 == LOADING_STAGE) {
            byte[] bytes_7 = DEFAULTS_INDEX.getFile(DefaultsFile.FILE_4.fileId);
            if (bytes_7 == null) {
                return 0;
            }

            Class89.method1496(bytes_7);
            NodeCollection.method8148();
            GameState.setGameState(GameState.UNK_1);
        }

        if (LoadingStage.aClass387_4709 == LOADING_STAGE) {
            NATIVE_LIBRARY_LOADER = new NativeLibraryLoader(NATIVE_LIBRARY_INDEX);
            Class159.setNativeLibraryLoader(NATIVE_LIBRARY_LOADER);
        }

        if (LoadingStage.aClass387_4716 == LOADING_STAGE) {
            i = FriendStatus.method7702();
            if (i < 100) {
                return i;
            }

            Class358.method6235(DEFAULTS_INDEX.getFile(DefaultsFile.FILE_1.fileId));
            QuickchatFiller.ENTITY_DEFAULTS = new EntityDefaults(DEFAULTS_INDEX);
            AbstractQueue_Sub1.SKIN_COLORS = QuickchatFiller.ENTITY_DEFAULTS.originalColours;
            Class366.SKIN_COLORS = QuickchatFiller.ENTITY_DEFAULTS.replacementColours;
            if (QuickchatFiller.ENTITY_DEFAULTS.anInt7045 != -1 && QuickchatFiller.ENTITY_DEFAULTS.anInt7046 != -1) {
                client.GAME_WIDTH = QuickchatFiller.ENTITY_DEFAULTS.anInt7045;
                client.GAME_HEIGHT = QuickchatFiller.ENTITY_DEFAULTS.anInt7046;
            }

            LinkedNodeList.EQUIPMENT_DEFAULTS = new EquipmentDefaults(DEFAULTS_INDEX);
            Class149_Sub2.DEFAULTS_LOADER_7 = new Defaults7Loader(DEFAULTS_INDEX);
            Node_Sub13.DEFAULTS_LOADER_8 = new Defaults8Loader(DEFAULTS_INDEX);
        }

        if (LoadingStage.aClass387_4704 == LOADING_STAGE) {
            if (QuickchatFiller.ENTITY_DEFAULTS.profilingModel != -1 && !MESH_INDEX.load(QuickchatFiller.ENTITY_DEFAULTS.profilingModel, 0)) {
                return 99;
            }

            IMAGE_LOADER = new ImageIndexLoader(TEXTURE_DEFINITION_INDEX, TEXTURE_INDEX, SPRITES_INDEX);
            PARAM_LOADER = new ParamIndexLoader(CONFIG_INDEX);
            RENDER_ANIM_LOADER = new RenderAnimIndexLoader(CONFIG_INDEX, LinkedNodeList.EQUIPMENT_DEFAULTS);
            CURSOR_LOADER = new CursorIndexLoader(CONFIG_INDEX, SPRITES_INDEX);
            ENUM_LOADER = new EnumIndexLoader(ENUM_INDEX);
            OVERLAY_LOADER = new OverlayIndexLoader(CONFIG_INDEX);
            UNDERLAY_LOADER = new UnderlayIndexLoader(CONFIG_INDEX);
            HITSPLAT_LOADER = new ScriptRunner(CONFIG_INDEX, SPRITES_INDEX);
            HITBAR_LOADER = new HeadbarIndexLoader(CONFIG_INDEX, SPRITES_INDEX);
            IDENTIKIT_LOADER = new IdentiKitIndexLoader(CONFIG_INDEX, MESH_INDEX);
            INVENTORY_LOADER = new InventoriesIndexLoader(CONFIG_INDEX);
            LIGHT_INTENSITY_LOADER = new LightIntensityIndexLoader(CONFIG_INDEX);
            OBJECT_LOADER = new LocationIndexLoader(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, OBJECT_INDEX, MESH_INDEX);
            MAP_REGION_DECODER.setObjectIndexLoader(OBJECT_LOADER);
            MAP_REGION_LOADER_THREAD.setObjectIndexLoader(new LocationIndexLoader(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, OBJECT_INDEX, MESH_INDEX));
            WORLD_MAP_LOADER = new MapAreaIndexLoader(CONFIG_INDEX, SPRITES_INDEX);
            MAP_SPRITE_LOADER = new MapSpriteIndexLoader(CONFIG_INDEX, SPRITES_INDEX);
            NPC_INDEX_LOADER = new NPCIndexLoader(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, NPC_INDEX, MESH_INDEX);
            ITEM_LOADER = new ItemIndexLoader(client.CURRENT_GAME, Class223.CURRENT_LANGUAGE, PARAM_LOADER, ITEM_INDEX, MESH_INDEX);
            QUEST_LOADER = new QuestIndexLoader(CONFIG_INDEX);
            ANIMATION_LOADER = new AnimationIndexLoader(ANIMATION_INDEX, ANIMATION_FRAME_SET_INDEX, ANIMATION_FRAME_BASE_INDEX);
            SKYBOX_LOADER = new SkyboxIndexLoader(CONFIG_INDEX);
            SUN_LOADER = new SunIndexLoader(CONFIG_INDEX);
            SPOT_ANIM_LOADER = new SpotAnimIndexLoader(SPOTANIM_INDEX, MESH_INDEX);
            STRUCT_LOADER = new StructIndexLoader(CONFIG_INDEX);
            VARC_STRING_LOADER = new VarcStringIndexLoader(CONFIG_INDEX);
            VARC_LOADER = new VarcIndexLoader(CONFIG_INDEX);
            VARBIT_LOADER = new VarBitIndexLoader(VARBIT_INDEX);
            VAR_LOADER = new VarDefinitionLoader(CONFIG_INDEX);
            VARN_LOADER = new VarnIndexLoader(CONFIG_INDEX);
            VARNBIT_LOADER = new VarnBitIndexLoader(CONFIG_INDEX);
            CLAN_VAR_LOADER = new ClanVarIndexLoader(CONFIG_INDEX);
            CLAN_VAR_SETTINGS_LOADER = new ClanVarSettingsIndexLoader(CONFIG_INDEX);
            Class403.method6803(INTERFACE_INDEX, MESH_INDEX, SPRITES_INDEX);
            JS5StandardRequester.setBillboardIndex(BILLBOARD_INDEX);
            QUICK_CHAT_CATEGORY_LOADER = new QuickchatCategoryLoader(QC_MESSAGES_INDEX, QC_MENU_INDEX);
            QUICK_CHAT_MESSAGE_LOADER = new QuickchatMessageLoader(QC_MESSAGES_INDEX, QC_MENU_INDEX, new QuickchatFiller());
            Class158_Sub1.PLAYER_VAR_PROVIDER = new PlayerVarProvider();
            Class94.method1589();
            CutsceneCameraMovement.method1369(ANIMATION_LOADER);
            Class62.method1261(PARTICLE_INDEX);
            FriendsChatPlayer.method2943(MESH_INDEX, IMAGE_LOADER);
            Huffman huffman = new Huffman(HUFFMAN_INDEX.getFileByName("huffman", ""));
            InventoriesIndexLoader.setHuffman(huffman);
            Engine.FPS_MANAGER = FPSManager.createFPSManager();
            Class11.SYSTEM_INFO = new SystemInfo();
        }

        if (LoadingStage.aClass387_4705 == LOADING_STAGE) {
            i = ParticleProducerDefinition.method1159(SPRITES_INDEX) + Class487.aClass378_5752.method6405(true);
            i_2 = Class109_Sub1.method14651() + Class487.aClass378_5752.method6422();
            if (i < i_2) {
                return i * 100 / i_2;
            }
        }

        if (LOADING_STAGE == LoadingStage.aClass387_4706) {
            Class291.method5125(WORLD_MAP_INDEX, OVERLAY_LOADER, UNDERLAY_LOADER, MAP_REGION_DECODER.method4436(), WORLD_MAP_LOADER, MAP_SPRITE_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER);
        }

        if (LoadingStage.aClass387_4707 == LOADING_STAGE) {
            Class320.VARC_INT = new int[VARC_LOADER.size];
            Node_Sub17_Sub2.IS_VARC_SAVE_TO_FILE = new boolean[VARC_LOADER.size];
            Class462.VARC_STRING = new String[VARC_STRING_LOADER.size];

            for (i = 0; i < VARC_LOADER.size; i++) {
                if (VARC_LOADER.method6873(i).anInt4983 == 0) {
                    Node_Sub17_Sub2.IS_VARC_SAVE_TO_FILE[i] = true;
                    ++client.anInt7399;
                }

                Class320.VARC_INT[i] = -1;
            }

            Class152.method2596();
            MAP_INDEX.method5676(false);
            MUSIC_INDEX.method5676(true);
            SPRITES_INDEX.method5676(true);
            FONT_METRICS_INDEX.method5676(true);
            HUFFMAN_INDEX.method5676(true);
            client.aBool7219 = true;
        }

        if (LOADING_STAGE == LoadingStage.aClass387_4713) {
            if (!MovingAnimation.isInterfaceLoaded(QuickchatFiller.ENTITY_DEFAULTS.loginWindow, null)) {
                return 0;
            }

            bool_10 = true;

            for (i_2 = 0; i_2 < Interface.INTERFACES[QuickchatFiller.ENTITY_DEFAULTS.loginWindow].components.length; i_2++) {
                IComponentDefinitions icomponentdefinitions_8 = Interface.INTERFACES[QuickchatFiller.ENTITY_DEFAULTS.loginWindow].components[i_2];
                if (icomponentdefinitions_8.type == ComponentType.SPRITE && icomponentdefinitions_8.spriteId != -1 && !SPRITES_INDEX.load(icomponentdefinitions_8.spriteId, 0)) {
                    bool_10 = false;
                }
            }

            if (!bool_10) {
                return 0;
            }
        }

        if (LoadingStage.aClass387_4698 == LOADING_STAGE) {
            Class348.method6175(true);
        }

        if (LoadingStage.aClass387_4710 == LOADING_STAGE) {
            Comparable_Sub1.aClass306_3771.method5437();

            try {
                VarDefinitionLoader.aThread4520.join();
            } catch (InterruptedException interruptedexception_9) {
                return 0;
            }

            Comparable_Sub1.aClass306_3771 = null;
            VarDefinitionLoader.aThread4520 = null;
            LOADING_FONT_INDEX = null;
            GAME_TIPS_INDEX = null;
            EntityNode_Sub7.GAME_TIPS_LOADER = null;
            Class302.anInterface27Array3559 = null;
            Class358.method6234();
            client.aBool7465 = Class393.preferences.safeMode.getValue() == 1;
            Class393.preferences.setValue(Class393.preferences.safeMode, 1);
            if (client.aBool7465) {
                Class393.preferences.setValue(Class393.preferences.toolKit, 0);
            } else if (Class393.preferences.toolKit.aBool7914 && Class11.SYSTEM_INFO.ram < 512 && Class11.SYSTEM_INFO.ram != 0) {
                Class393.preferences.setValue(Class393.preferences.toolKit, 0);
            }

            Class190.savePreferences();
            if (client.aBool7465) {
                ParticleProducer.switchRenderType(0, false);
            } else {
                ParticleProducer.switchRenderType(Class393.preferences.toolKit.getValue(), false);
            }

            UID192.method7373(Class393.preferences.screenSize.getValue(), -1, -1);
            Class487.aClass378_5752.method6403(client.anInterface35_7206);
            EditMemberSetting.method15476();
            Class188.method3139(Renderers.CURRENT_RENDERER, SPRITES_INDEX);
            Class122.method2109(Class182.aNativeSpriteArray2261);
        }

        return Class152.method2604();
    }

    public static Index loadIndex(IndexReference indexreference_0, boolean bool_1, int i_2) {
        if (Class492.aClass327_Sub1Array5777 == null) {
            Class492.aClass327_Sub1Array5777 = new JS5GrabWorker[Class123.method2149()];
        }

        JS5CacheFile js5cachefile_4 = null;
        int i_5 = indexreference_0.method1781();
        if (client.aClass440_3270 != null) {
            js5cachefile_4 = new JS5CacheFile(i_5, client.aClass440_3270, Class97.aClass440Array996[i_5]);
        }

        Class492.aClass327_Sub1Array5777[i_5] = ScreenSizePreference.JS5_MANAGER.method5480(i_5, js5cachefile_4, Class533.aClass203_7073);
        Class492.aClass327_Sub1Array5777[i_5].method12544();
        return new Index(Class492.aClass327_Sub1Array5777[i_5], bool_1, i_2);
    }

}
