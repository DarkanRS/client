package com.jagex;
public class CutsceneAction_Sub22 extends CutsceneAction {

    static int anInt9440;

    int anInt9442;

    int anInt9439;

    int anInt9441;

    CutsceneAction_Sub22(RsByteBuffer rsbytebuffer_1) {
        super(rsbytebuffer_1);
        this.anInt9442 = rsbytebuffer_1.readUnsignedShort();
        this.anInt9439 = rsbytebuffer_1.readUnsignedShort();
        this.anInt9441 = rsbytebuffer_1.readUnsignedByte();
    }

    public void method1592() {
        CutsceneEntity class75_2 = Class82.CUTSCENE_ENTITIES[this.anInt9442];
        CutsceneEntityMovement class93_3 = Class86.aClass93Array821[this.anInt9439];
        class93_3.method1566(class75_2, this.anInt9441, 682382660);
    }

    public void method1601() {
        CutsceneEntity class75_1 = Class82.CUTSCENE_ENTITIES[-1738900237 * this.anInt9442 * 1623391291];
        CutsceneEntityMovement class93_2 = Class86.aClass93Array821[588964331 * this.anInt9439 * 1017986755];
        class93_2.method1566(class75_1, this.anInt9441 * 579947685 * -851068115, -1235876637);
    }

    static void iComponentOnPlayer(Player player_0, boolean bool_1) {
        if (Class20.anInt169 < 412) {
            if (VertexNormal.MY_PLAYER == player_0) {
                if (client.aBool7344 && (Class506.USE_OPTIONS_FLAGS & 0x10) != 0) {
                    PlayerAppearance.method4032(client.aString7275, client.aString7356 + " " + "->" + " " + Utils.rgbToColHexShortcut(16777215) + Message.aClass433_5299.translate(Class223.CURRENT_LANGUAGE), Defaults8Loader.anInt5932, 16, -1, 0L, 0, 0, true, false, (long) player_0.index, false, -1931180359);
                }
            } else {
                String string_3;
                if (player_0.elo == 0) {
                    boolean bool_4 = true;
                    if (VertexNormal.MY_PLAYER.cbLevelRelated != -1 && player_0.cbLevelRelated != -1) {
                        int i_5 = VertexNormal.MY_PLAYER.cbLevelRelated < player_0.cbLevelRelated ? VertexNormal.MY_PLAYER.cbLevelRelated : player_0.cbLevelRelated;
                        int i_6 = VertexNormal.MY_PLAYER.combatLevel - player_0.combatLevel;
                        if (i_6 < 0) {
                            i_6 = -i_6;
                        }
                        if (i_6 > i_5) {
                            bool_4 = false;
                        }
                    }
                    String string_8 = client.CURRENT_GAME == Game.stellarDawn ? Message.RATING_.translate(Class223.CURRENT_LANGUAGE) : Message.LEVEL_.translate(Class223.CURRENT_LANGUAGE);
                    if (player_0.combatLevel >= player_0.cbLevelWithSumm) {
                        string_3 = player_0.getUsernameWithTitle() + (bool_4 ? ItemIndexLoader.method7169(player_0.combatLevel, VertexNormal.MY_PLAYER.combatLevel, -1737457030) : Utils.rgbToColHexShortcut(16777215)) + " (" + string_8 + player_0.combatLevel + ")";
                    } else {
                        string_3 = player_0.getUsernameWithTitle() + (bool_4 ? ItemIndexLoader.method7169(player_0.combatLevel, VertexNormal.MY_PLAYER.combatLevel, -1524250646) : Utils.rgbToColHexShortcut(16777215)) + " (" + string_8 + player_0.combatLevel + "+" + (player_0.cbLevelWithSumm - player_0.combatLevel) + ")";
                    }
                } else if (player_0.elo == -1) {
                    string_3 = player_0.getUsernameWithTitle();
                } else {
                    string_3 = player_0.getUsernameWithTitle() + " (" + Message.SKILL_.translate(Class223.CURRENT_LANGUAGE) + player_0.elo + ")";
                }
                if (client.aBool7344 && !bool_1 && (Class506.USE_OPTIONS_FLAGS & 0x8) != 0) {
                    PlayerAppearance.method4032(client.aString7275, client.aString7356 + " " + "->" + " " + Utils.rgbToColHexShortcut(16777215) + string_3, Defaults8Loader.anInt5932, 15, -1, (long) player_0.index, 0, 0, true, false, (long) player_0.index, false, -1521566355);
                }
                if (bool_1) {
                    PlayerAppearance.method4032(Utils.rgbToColHexShortcut(13421772) + string_3, "", -1, -1, 0, 0L, 0, 0, false, true, (long) player_0.index, false, -1005059728);
                } else {
                    for (int i_10 = 7; i_10 >= 0; --i_10) {
                        if (client.PLAYER_OPTIONS[i_10] != null) {
                            short s_11 = 0;
                            if (Game.darkan == client.CURRENT_GAME && client.PLAYER_OPTIONS[i_10].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE))) {
                                if (client.REDUCE_ATTACK_PRIORITY && player_0.combatLevel > VertexNormal.MY_PLAYER.combatLevel) {
                                    s_11 = 2000;
                                }
                                if (VertexNormal.MY_PLAYER.teamId != 0 && player_0.teamId != 0) {
                                    if (player_0.teamId == VertexNormal.MY_PLAYER.teamId) {
                                        s_11 = 2000;
                                    } else {
                                        s_11 = 0;
                                    }
                                } else if (player_0.aBool10550) {
                                    s_11 = 2000;
                                }
                            } else if (client.PLAYER_OPTION_REDUCED_PRIORITY[i_10]) {
                                s_11 = 2000;
                            }
                            short s_12 = (short) (client.aShortArray7239[i_10] + s_11);
                            int i_7 = client.PLAYER_OPTION_CURSORS[i_10] != -1 ? client.PLAYER_OPTION_CURSORS[i_10] : client.anInt7342;
                            PlayerAppearance.method4032(client.PLAYER_OPTIONS[i_10], Utils.rgbToColHexShortcut(16777215) + string_3, i_7, s_12, -1, (long) player_0.index, 0, 0, true, false, (long) player_0.index, false, -1621747030);
                        }
                    }
                }
                if (!bool_1) {
                    for (CacheableNode_Sub7 class282_sub50_sub7_9 = (CacheableNode_Sub7) Class20.aClass482_171.head(); class282_sub50_sub7_9 != null; class282_sub50_sub7_9 = (CacheableNode_Sub7) Class20.aClass482_171.next(1246744595)) {
                        if (class282_sub50_sub7_9.clickType == 23) {
                            class282_sub50_sub7_9.aString9585 = Utils.rgbToColHexShortcut(16777215) + string_3;
                            break;
                        }
                    }
                }
            }
        }
    }
}
