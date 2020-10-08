package com.jagex;

public abstract class Class455 {

    public static short[] aShortArray5452;

    static void iComponentOnIComponent(IComponentDefinitions icomponentdefinitions_0) {
        if (client.aBool7344) {
            ParamDefinitions attributedefault_4 = CutsceneAction_Sub12.USE_INTERFACE_ID != -1 ? IndexLoaders.PARAM_LOADER.getParam(CutsceneAction_Sub12.USE_INTERFACE_ID) : null;
            if (client.getIComponentSettings(icomponentdefinitions_0).bit22Enabled() && (Class506.USE_OPTIONS_FLAGS & 0x20) != 0 && (attributedefault_4 == null || icomponentdefinitions_0.method1997(CutsceneAction_Sub12.USE_INTERFACE_ID, attributedefault_4.defaultInt) != attributedefault_4.defaultInt)) {
                PlayerModel.method4032(client.aString7275, client.aString7356 + " " + "->" + " " + icomponentdefinitions_0.useOnName, Defaults8Loader.anInt5932, 58, icomponentdefinitions_0.containerItemId, 0L, icomponentdefinitions_0.slotId, icomponentdefinitions_0.idHash, true, false, icomponentdefinitions_0.slotId << 0 | icomponentdefinitions_0.idHash, false);
            }
        }
        for (int i_7 = 9; i_7 >= 5; --i_7) {
            String string_8 = ItemIndexLoader.method7171(icomponentdefinitions_0, i_7);
            if (string_8 != null) {
                PlayerModel.method4032(string_8, icomponentdefinitions_0.useOnName, Class520.method11163(icomponentdefinitions_0, i_7), 1007, icomponentdefinitions_0.containerItemId, i_7 + 1, icomponentdefinitions_0.slotId, icomponentdefinitions_0.idHash, true, false, icomponentdefinitions_0.slotId << 0 | icomponentdefinitions_0.idHash, false);
            }
        }
        String string_9 = QuickChatMessage.method6157(icomponentdefinitions_0);
        if (string_9 != null) {
            PlayerModel.method4032(string_9, icomponentdefinitions_0.useOnName, icomponentdefinitions_0.anInt1378, 25, icomponentdefinitions_0.containerItemId, 0L, icomponentdefinitions_0.slotId, icomponentdefinitions_0.idHash, true, false, icomponentdefinitions_0.slotId << 0 | icomponentdefinitions_0.idHash, false);
        }
        for (int i_5 = 4; i_5 >= 0; --i_5) {
            String string_6 = ItemIndexLoader.method7171(icomponentdefinitions_0, i_5);
            if (string_6 != null) {
                PlayerModel.method4032(string_6, icomponentdefinitions_0.useOnName, Class520.method11163(icomponentdefinitions_0, i_5), 57, icomponentdefinitions_0.containerItemId, i_5 + 1, icomponentdefinitions_0.slotId, icomponentdefinitions_0.idHash, true, false, icomponentdefinitions_0.slotId << 0 | icomponentdefinitions_0.idHash, false);
            }
        }
        if (client.getIComponentSettings(icomponentdefinitions_0).continueOptionEnabled()) {
            if (icomponentdefinitions_0.opName != null) {
                PlayerModel.method4032(icomponentdefinitions_0.opName, "", -1, 30, icomponentdefinitions_0.containerItemId, 0L, icomponentdefinitions_0.slotId, icomponentdefinitions_0.idHash, true, false, icomponentdefinitions_0.slotId << 0 | icomponentdefinitions_0.idHash, false);
            } else {
                PlayerModel.method4032(LocalizedText.CONTINUE.translate(Class223.CURRENT_LANGUAGE), "", -1, 30, icomponentdefinitions_0.containerItemId, 0L, icomponentdefinitions_0.slotId, icomponentdefinitions_0.idHash, true, false, icomponentdefinitions_0.slotId << 0 | icomponentdefinitions_0.idHash, false);
            }
        }
    }

    public static int method7557(CharSequence charsequence_0, CharSequence charsequence_1, Language xlanguage_2) {
        int i_4 = charsequence_0.length();
        int i_5 = charsequence_1.length();
        int i_6 = 0;
        int i_7 = 0;
        char var_8 = 0;
        char var_9 = 0;
        while (i_6 - var_8 < i_4 || i_7 - var_9 < i_5) {
            if (i_6 - var_8 >= i_4) {
                return -1;
            }
            if (i_7 - var_9 >= i_5) {
                return 1;
            }
            char var_10;
            if (var_8 != 0) {
                var_10 = var_8;
                boolean bool_11 = false;
            } else {
                var_10 = charsequence_0.charAt(i_6++);
            }
            char var_15;
            if (var_9 != 0) {
                var_15 = var_9;
                boolean bool_12 = false;
            } else {
                var_15 = charsequence_1.charAt(i_7++);
            }
            var_8 = Class466.method7778(var_10);
            var_9 = Class466.method7778(var_15);
            var_10 = Class152.method2599(var_10, xlanguage_2);
            var_15 = Class152.method2599(var_15, xlanguage_2);
            if (var_10 != var_15 && Character.toUpperCase(var_10) != Character.toUpperCase(var_15)) {
                var_10 = Character.toLowerCase(var_10);
                var_15 = Character.toLowerCase(var_15);
                if (var_15 != var_10) {
                    return FogPreference.method13422(var_10) - FogPreference.method13422(var_15);
                }
            }
        }
        int i_16 = Math.min(i_4, i_5);
        char var_13;
        int i_18;
        for (i_18 = 0; i_18 < i_16; i_18++) {
            if (xlanguage_2 == Language.FRENCH) {
                i_6 = i_4 - 1 - i_18;
                i_7 = i_5 - 1 - i_18;
            } else {
                i_7 = i_18;
                i_6 = i_18;
            }
            char var_17 = charsequence_0.charAt(i_6);
            var_13 = charsequence_1.charAt(i_7);
            if (var_13 != var_17 && Character.toUpperCase(var_17) != Character.toUpperCase(var_13)) {
                var_17 = Character.toLowerCase(var_17);
                var_13 = Character.toLowerCase(var_13);
                if (var_17 != var_13) {
                    return FogPreference.method13422(var_17) - FogPreference.method13422(var_13);
                }
            }
        }
        i_18 = i_4 - i_5;
        if (i_18 != 0) {
            return i_18;
        } else {
            for (int i_19 = 0; i_19 < i_16; i_19++) {
                var_13 = charsequence_0.charAt(i_19);
                char var_14 = charsequence_1.charAt(i_19);
                if (var_13 != var_14) {
                    return FogPreference.method13422(var_13) - FogPreference.method13422(var_14);
                }
            }
            return 0;
        }
    }

    static void method7558(boolean bool_0, boolean bool_1, String string_2, String string_3, long long_4) {
        Class9.socialNetworkLogin = bool_0;
        if (!bool_1) {
            Class9.anInt76 = -1;
        }
        Class9.aBool74 = bool_1;
        Class9.aString99 = string_2;
        Class9.aString102 = string_3;
        Class9.aLong77 = long_4;
        if (Class9.aBool74 || !Class9.aString99.isEmpty() && !Class9.aString102.isEmpty()) {
            if (Class9.lobbyStage != 140) {
                Class9.anInt103 = 0;
                Class9.anInt112 = -1;
                Class9.anInt94 = -1;
            }
            Class9.CURRENT_CONNECTION_CONTEXT.aBool2298 = false;
            FontRenderer_Sub1.method13784(-3);
            Class9.loginStage = 18;
            Class9.anInt90 = 0;
            Class9.anInt104 = 0;
        } else {
            FontRenderer_Sub1.method13784(3);
        }
    }

    static int getCRC(byte[] data, int start, int end) {
        int i_3 = -1;
        for (int i_4 = start; i_4 < end; i_4++) {
            i_3 = i_3 >>> 8 ^ ByteBuf.anIntArray7986[(i_3 ^ data[i_4]) & 0xff];
        }
        i_3 = ~i_3;
        return i_3;
    }
}
