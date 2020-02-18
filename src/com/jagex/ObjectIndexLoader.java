package com.jagex;

public class ObjectIndexLoader implements IndexLoader {

    public Class212 aClass212_5114 = new Class212();
    public int maxItemsCount;
    boolean membersOnly;
    int anInt5116;
    LRUCache cache = new LRUCache(64);
    LRUCache aClass229_5115 = new LRUCache(50);
    SoftwareItemRender softwareItemRender = new SoftwareItemRender();
    Game game;
    Language language;
    ParamIndexLoader attrDefaults;
    Index fs19;
    Index meshIndex;
    String[] defaultGroundOptions;
    String[] defaultInventoryOptions;

    public ObjectIndexLoader(Game game_1, Language xlanguage_2, ParamIndexLoader itemdefaultsloader_4, Index index_5, Index index_6) {
        game = game_1;
        language = xlanguage_2;
        membersOnly = true;
        attrDefaults = itemdefaultsloader_4;
        fs19 = index_5;
        meshIndex = index_6;
        if (fs19 != null) {
            int i_7 = fs19.containersCount() - 1;
            maxItemsCount = i_7 * SharedConfigsType.ITEMS.filesPerContainer() + fs19.filesCount(i_7);
        } else {
            maxItemsCount = 0;
        }

        if (game == Game.darkan) {
            defaultGroundOptions = new String[]{null, null, LocalizedText.TAKE.translate(language), null, null, LocalizedText.EXAMINE.translate(language)};
        } else {
            defaultGroundOptions = new String[]{null, null, LocalizedText.TAKE.translate(language), null, null, null};
        }

        defaultInventoryOptions = new String[]{null, null, null, null, LocalizedText.DROP.translate(language)};
    }

    static String method7169(int i_0, int i_1) {
        int i_3 = i_1 - i_0;
        return i_3 < -9 ? Utils.rgbToColHexShortcut(16711680) : (i_3 < -6 ? Utils.rgbToColHexShortcut(16723968) : (i_3 < -3 ? Utils.rgbToColHexShortcut(16740352) : (i_3 < 0 ? Utils.rgbToColHexShortcut(16756736) : (i_3 > 9 ? Utils.rgbToColHexShortcut(65280) : (i_3 > 6 ? Utils.rgbToColHexShortcut(4259584) : (i_3 > 3 ? Utils.rgbToColHexShortcut(8453888) : (i_3 > 0 ? Utils.rgbToColHexShortcut(12648192) : Utils.rgbToColHexShortcut(16776960))))))));
    }

    static void method7170(int i_0) {
        if (Class5.anIntArray36 == null || Class5.anIntArray36.length < i_0) {
            Class5.anIntArray36 = new int[i_0];
        }

    }

    static String method7171(Component icomponentdefinitions_0, int i_1) {
        return !client.getIComponentSettings(icomponentdefinitions_0).clickOptionEnabled(i_1) && icomponentdefinitions_0.params == null ? null : (icomponentdefinitions_0.optionNames != null && icomponentdefinitions_0.optionNames.length > i_1 && icomponentdefinitions_0.optionNames[i_1] != null && !icomponentdefinitions_0.optionNames[i_1].trim().isEmpty() ? icomponentdefinitions_0.optionNames[i_1] : (client.aBool7168 ? "Hidden-" + i_1 : null));
    }

    public ItemDefinitions getItemDefinitions(int i_1) {
        LRUCache softcache_4 = cache;
        ItemDefinitions itemdefinitions_3;
        synchronized (cache) {
            itemdefinitions_3 = (ItemDefinitions) cache.get(i_1);
        }

        if (itemdefinitions_3 != null) {
            return itemdefinitions_3;
        } else {
            Index index_5 = fs19;
            byte[] bytes_12;
            synchronized (fs19) {
                bytes_12 = fs19.getFile(SharedConfigsType.ITEMS.containerId(i_1), SharedConfigsType.ITEMS.fileId(i_1));
            }

            itemdefinitions_3 = new ItemDefinitions();
            itemdefinitions_3.loader = this;
            itemdefinitions_3.id = i_1;
            itemdefinitions_3.groundOptions = defaultGroundOptions.clone();
            itemdefinitions_3.inventoryOptions = defaultInventoryOptions.clone();
            if (bytes_12 != null) {
                itemdefinitions_3.decode(new Packet(bytes_12));
            }

            itemdefinitions_3.postDecode();
            if (itemdefinitions_3.certTemplateId != -1) {
                itemdefinitions_3.generateCert(getItemDefinitions(itemdefinitions_3.certTemplateId), getItemDefinitions(itemdefinitions_3.certId));
            }

            if (itemdefinitions_3.lendTemplateId != -1) {
                itemdefinitions_3.generateLend(getItemDefinitions(itemdefinitions_3.lendTemplateId), getItemDefinitions(itemdefinitions_3.lendId));
            }

            if (itemdefinitions_3.bindTemplateId != -1) {
                itemdefinitions_3.generateBind(getItemDefinitions(itemdefinitions_3.bindTemplateId), getItemDefinitions(itemdefinitions_3.bindId));
            }

            if (!membersOnly && itemdefinitions_3.membersOnly) {
                itemdefinitions_3.teamId = 0;
                itemdefinitions_3.groundOptions = defaultGroundOptions;
                itemdefinitions_3.inventoryOptions = defaultInventoryOptions;
                itemdefinitions_3.grandExchange = false;
                itemdefinitions_3.quests = null;
                if (itemdefinitions_3.cs2Map != null) {
                    boolean bool_8 = false;
                    for (Node node_6 = itemdefinitions_3.cs2Map.method7750(); node_6 != null; node_6 = itemdefinitions_3.cs2Map.method7751()) {
                        ParamDefinitions param = attrDefaults.getParam((int) node_6.pointer);
                        if (param.autoDisable) {
                            node_6.unlink();
                        } else {
                            bool_8 = true;
                        }
                    }

                    if (!bool_8) {
                        itemdefinitions_3.cs2Map = null;
                    }
                }
            }

            LRUCache softcache_13 = cache;
            synchronized (cache) {
                cache.put(itemdefinitions_3, i_1);
                return itemdefinitions_3;
            }
        }
    }

    public NativeSprite getSprite(AbstractRenderer graphicalrenderer_1, AbstractRenderer graphicalrenderer_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7, boolean bool_8, int i_9, FontRenderer fontrenderer_10, PlayerModel playerappearance_11) {
        if (!bool_8) {
            NativeSprite nativesprite_13 = softwareRender(graphicalrenderer_2, i_3, i_4, i_5, i_6, i_9, playerappearance_11);
            if (nativesprite_13 != null) {
                return nativesprite_13;
            }
        }

        ItemDefinitions itemdefinitions_19 = getItemDefinitions(i_3);
        if (i_4 > 1 && itemdefinitions_19.stackIds != null) {
            int i_14 = -1;

            for (int i_15 = 0; i_15 < 10; i_15++) {
                if (i_4 >= itemdefinitions_19.stackAmounts[i_15] && itemdefinitions_19.stackAmounts[i_15] != 0) {
                    i_14 = itemdefinitions_19.stackIds[i_15];
                }
            }

            if (i_14 != -1) {
                itemdefinitions_19 = getItemDefinitions(i_14);
            }
        }

        int[] ints_17 = itemdefinitions_19.getSprite(graphicalrenderer_1, graphicalrenderer_2, i_4, i_5, i_6, bool_7, i_9, fontrenderer_10, playerappearance_11);
        if (ints_17 == null) {
            return null;
        } else {
            NativeSprite nativesprite_18;
            if (bool_8) {
                nativesprite_18 = graphicalrenderer_1.createNativeSprite(ints_17, 36, 36, 32);
            } else {
                nativesprite_18 = graphicalrenderer_2.createNativeSprite(ints_17, 36, 36, 32);
            }

            if (!bool_8) {
                SoftwareItemRender softwareitemrender_16 = new SoftwareItemRender();
                softwareitemrender_16.rendererId = graphicalrenderer_2.rendererId;
                softwareitemrender_16.itemId = i_3;
                softwareitemrender_16.itemAmount = i_4;
                softwareitemrender_16.outlineSize = i_5;
                softwareitemrender_16.shadowColor = i_6;
                softwareitemrender_16.renderStack = i_9;
                softwareitemrender_16.hasPlayerAppearance = playerappearance_11 != null;
                aClass212_5114.method3644(nativesprite_18, softwareitemrender_16);
            }

            return nativesprite_18;
        }
    }

    public void method7148(boolean bool_1) {
        if (membersOnly != bool_1) {
            membersOnly = bool_1;
            method7150();
        }

    }

    public void method7150() {
        LRUCache softcache_2 = cache;
        synchronized (cache) {
            cache.method3859();
        }

        softcache_2 = aClass229_5115;
        synchronized (aClass229_5115) {
            aClass229_5115.method3859();
        }

        Class212 class212_6 = aClass212_5114;
        synchronized (aClass212_5114) {
            aClass212_5114.method3638();
        }
    }

    public void method7151() {
        Class212 class212_2 = aClass212_5114;
        synchronized (aClass212_5114) {
            aClass212_5114.method3638();
        }
    }

    public void method7152() {
        LRUCache softcache_2 = aClass229_5115;
        synchronized (aClass229_5115) {
            aClass229_5115.method3859();
        }
    }

    public void method7153(int i_1) {
        anInt5116 = i_1;
        LRUCache softcache_3 = aClass229_5115;
        synchronized (aClass229_5115) {
            aClass229_5115.method3859();
        }
    }

    public void method7156() {
        LRUCache softcache_3 = cache;
        synchronized (cache) {
            cache.method3858(5);
        }

        softcache_3 = aClass229_5115;
        synchronized (aClass229_5115) {
            aClass229_5115.method3858(5);
        }

        Class212 class212_7 = aClass212_5114;
        synchronized (aClass212_5114) {
            aClass212_5114.method3639();
        }
    }

    public NativeSprite softwareRender(AbstractRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int i_6, PlayerModel playerappearance_7) {
        softwareItemRender.rendererId = graphicalrenderer_1.rendererId;
        softwareItemRender.itemId = i_2;
        softwareItemRender.itemAmount = i_3;
        softwareItemRender.outlineSize = i_4;
        softwareItemRender.shadowColor = i_5;
        softwareItemRender.renderStack = i_6;
        softwareItemRender.hasPlayerAppearance = playerappearance_7 != null;
        return aClass212_5114.method3654(softwareItemRender);
    }

    public void method7166() {
        LRUCache softcache_2 = cache;
        synchronized (cache) {
            cache.method3863();
        }

        softcache_2 = aClass229_5115;
        synchronized (aClass229_5115) {
            aClass229_5115.method3863();
        }

        Class212 class212_6 = aClass212_5114;
        synchronized (aClass212_5114) {
            aClass212_5114.method3641();
        }
    }

}
