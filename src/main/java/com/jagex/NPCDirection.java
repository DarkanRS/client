package com.jagex;

public enum NPCDirection implements Identifiable {
    NORTH(0, 0),
    EAST(2, 1),
    SOUTH_EAST(3, 2),
    NORTH_WEST(7, 3),
    SOUTH(6, 4),
    WEST(4, 5),
    NORTH_EAST(5, 6),
    SOUTH_WEST(1, 7);

    public final int value;
    final int direction;

    NPCDirection(int i_1, int i_2) {
        value = i_1;
        direction = i_2;
    }

    static int method4325(WorldDescriptor class217_sub1_0, WorldDescriptor class217_sub1_1, int i_2, boolean bool_3, int i_4, boolean bool_5) {
        int i_7 = Preference_Sub1.method12620(class217_sub1_0, class217_sub1_1, i_2, bool_3);
        if (i_7 != 0) {
            return bool_3 ? -i_7 : i_7;
        } else if (i_4 == -1) {
            return 0;
        } else {
            int i_8 = Preference_Sub1.method12620(class217_sub1_0, class217_sub1_1, i_4, bool_5);
            return bool_5 ? -i_8 : i_8;
        }
    }

    static void drawDebugInformation(int x, int y, IComponentDefinitions inter) {
        int currDrawX = inter.width + x;
        int currDrawY = y + 15;
        if (client.DRAW_DEBUG) {
            int fpsColor = -256;
            if (client.FPS < 20) {
                fpsColor = -65536;
            }
            Class16.aFontRenderer_144.drawText("Fps:" + client.FPS, currDrawX, currDrawY, fpsColor, -1);
            currDrawY += 15;
            Runtime runtime = Runtime.getRuntime();
            long totalMem = runtime.totalMemory() / 1024L;
            long freeMem = totalMem - runtime.freeMemory() / 1024L;
            int memColor = -256;
            if (freeMem > 262144L) {
                memColor = -65536;
            }
            Class16.aFontRenderer_144.drawText("Mem:" + freeMem + "/" + totalMem + "k", currDrawX, currDrawY, memColor, -1);
            currDrawY += 15;
            long gamePing = client.GAME_CONNECTION_CONTEXT.pinger.getPing();
            String gamePingStr = "N/A";
            if (gamePing != -1L) {
                gamePingStr = gamePing + "ms";
                if (gamePing > 500L) {
                    gamePingStr = Utils.rgbToColHexShortcut(16711680) + gamePingStr + Utils.rgbToColHexShortcut(16776960);
                }
            }
            Class16.aFontRenderer_144.drawText("Game: In:" + client.GAME_CONNECTION_CONTEXT.anInt2294 + "B/s " + "Out:" + client.GAME_CONNECTION_CONTEXT.anInt2293 + "B/s " + "Ping:" + gamePingStr, currDrawX, currDrawY, -256, -1);
            currDrawY += 15;
            long lobbyPing = client.LOBBY_CONNECTION_CONTEXT.pinger.getPing();
            String lobbyPingStr = "N/A";
            if (lobbyPing != -1L) {
                lobbyPingStr = lobbyPing + "ms";
                if (lobbyPing > 500L) {
                    lobbyPingStr = Utils.rgbToColHexShortcut(16711680) + lobbyPingStr + Utils.rgbToColHexShortcut(16776960);
                }
            }
            Class16.aFontRenderer_144.drawText("Lobby: In:" + client.LOBBY_CONNECTION_CONTEXT.anInt2294 + "B/s " + "Out:" + client.LOBBY_CONNECTION_CONTEXT.anInt2293 + "B/s " + "Ping:" + lobbyPingStr, currDrawX, currDrawY, -256, -1);
            currDrawY += 15;
            int i_19 = Renderers.CURRENT_RENDERER.za() / 1024;
            Class16.aFontRenderer_144.drawText("Offheap:" + i_19 + "k", currDrawX, currDrawY, i_19 > 65536 ? -65536 : -256, -1);
            currDrawY += 15;
            int i_20 = 0;
            int i_21 = 0;
            int i_22 = 0;
            int i_23;
            for (i_23 = 0; i_23 < Class492.aClass327_Sub1Array5777.length; i_23++) {
                if (Class492.aClass327_Sub1Array5777[i_23] != null) {
                    i_20 += Class492.aClass327_Sub1Array5777[i_23].method12541();
                    i_21 += Class492.aClass327_Sub1Array5777[i_23].method12542();
                    i_22 += Class492.aClass327_Sub1Array5777[i_23].method12559();
                }
            }
            i_23 = i_22 * 100 / i_20;
            int i_24 = i_21 * 10000 / i_20;
            String string_25 = "Cache:" + Connection.method3342(i_24, 2, true, Language.ENGLISH) + "% (" + i_23 + "%)";
            Renderers.FONT_RENDERER.drawText(string_25, currDrawX, currDrawY, -256, -1);
            currDrawY += 12;
        }
    }

    public static int containerTotalParam(int containerId, int paramId, boolean countStack) {
        ItemContainer container = ItemContainer.getContainer(containerId, false);
        if (container == null) {
            return 0;
        } else {
            int total = 0;
            for (int i = 0; i < container.itemIds.length; i++) {
                if (container.itemIds[i] >= 0 && container.itemIds[i] < IndexLoaders.ITEM_LOADER.maxItemsCount) {
                    ItemDefinitions itemDef = IndexLoaders.ITEM_LOADER.getItemDefinitions(container.itemIds[i]);
                    int param = itemDef.getCS2Integer(paramId, IndexLoaders.PARAM_LOADER.getParam(paramId).defaultInt);
                    if (countStack) {
                        total += param * container.amounts[i];
                    } else {
                        total += param;
                    }
                }
            }
            return total;
        }
    }

    public NPCDirection method4317() {
        switch (value) {
            case 0:
                return SOUTH;
            case 1:
                return NORTH_WEST;
            case 2:
                return WEST;
            case 3:
                return NORTH_EAST;
            case 4:
                return EAST;
            case 5:
                return SOUTH_EAST;
            case 6:
                return NORTH;
            case 7:
                return SOUTH_WEST;
            default:
                throw new IllegalStateException();
        }
    }

    @Override
    public int getValue() {
        return direction;
    }
}
