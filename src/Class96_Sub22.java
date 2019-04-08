public class Class96_Sub22 extends CutsceneAction {

    static int anInt9440;

    int anInt9442;

    int anInt9439;

    int anInt9441;

    Class96_Sub22(RsByteBuffer rsbytebuffer_1) {
        super(rsbytebuffer_1);
        this.anInt9442 = rsbytebuffer_1.readUnsignedShort();
        this.anInt9439 = rsbytebuffer_1.readUnsignedShort();
        this.anInt9441 = rsbytebuffer_1.readUnsignedByte();
    }

    public void method1592() {
        CutsceneEntity class75_2 = Class82.aClass75Array804[this.anInt9442];
        Class93 class93_3 = Class86.aClass93Array821[this.anInt9439];
        class93_3.method1566(class75_2, this.anInt9441, 682382660);
    }

    public void method1601() {
        CutsceneEntity class75_1 = Class82.aClass75Array804[-1738900237 * this.anInt9442 * 1623391291];
        Class93 class93_2 = Class86.aClass93Array821[588964331 * this.anInt9439 * 1017986755];
        class93_2.method1566(class75_1, this.anInt9441 * 579947685 * -851068115, -1235876637);
    }

    static void method14678(Player player_0, boolean bool_1) {
        if (Class20.anInt169 < 412) {
            if (VertexNormal.myPlayer == player_0) {
                if (client.aBool7344 && (Class506.anInt5858 & 0x10) != 0) {
                    PlayerAppearance.method4032(client.aString7275, client.aString7356 + " " + "->" + " " + ParticleProducerDefinition.method1163(16777215) + Message.aClass433_5299.translate(Class223.CURRENT_LANGUAGE, -1114882023), Defaults8Loader.anInt5932, 16, -1, 0L, 0, 0, true, false, (long) player_0.index, false, -1931180359);
                }
            } else {
                String string_3;
                if (player_0.anInt10556 == 0) {
                    boolean bool_4 = true;
                    if (VertexNormal.myPlayer.anInt10555 != -1 && player_0.anInt10555 != -1) {
                        int i_5 = VertexNormal.myPlayer.anInt10555 < player_0.anInt10555 ? VertexNormal.myPlayer.anInt10555 : player_0.anInt10555;
                        int i_6 = VertexNormal.myPlayer.anInt10565 - player_0.anInt10565;
                        if (i_6 < 0) {
                            i_6 = -i_6;
                        }
                        if (i_6 > i_5) {
                            bool_4 = false;
                        }
                    }
                    String string_8 = client.CURRENT_GAME == Game.stellarDawn ? Message.RATING_.translate(Class223.CURRENT_LANGUAGE, -1209944287) : Message.LEVEL_.translate(Class223.CURRENT_LANGUAGE, -1303103497);
                    if (player_0.anInt10565 >= player_0.anInt10554) {
                        string_3 = player_0.method16127(2054627302) + (bool_4 ? ItemIndexLoader.method7169(player_0.anInt10565, VertexNormal.myPlayer.anInt10565, -1737457030) : ParticleProducerDefinition.method1163(16777215)) + " (" + string_8 + player_0.anInt10565 + ")";
                    } else {
                        string_3 = player_0.method16127(2144417480) + (bool_4 ? ItemIndexLoader.method7169(player_0.anInt10565, VertexNormal.myPlayer.anInt10565, -1524250646) : ParticleProducerDefinition.method1163(16777215)) + " (" + string_8 + player_0.anInt10565 + "+" + (player_0.anInt10554 - player_0.anInt10565) + ")";
                    }
                } else if (player_0.anInt10556 == -1) {
                    string_3 = player_0.method16127(2137901539);
                } else {
                    string_3 = player_0.method16127(1967945336) + " (" + Message.SKILL_.translate(Class223.CURRENT_LANGUAGE, -871379797) + player_0.anInt10556 + ")";
                }
                if (client.aBool7344 && !bool_1 && (Class506.anInt5858 & 0x8) != 0) {
                    PlayerAppearance.method4032(client.aString7275, client.aString7356 + " " + "->" + " " + ParticleProducerDefinition.method1163(16777215) + string_3, Defaults8Loader.anInt5932, 15, -1, (long) player_0.index, 0, 0, true, false, (long) player_0.index, false, -1521566355);
                }
                if (bool_1) {
                    PlayerAppearance.method4032(ParticleProducerDefinition.method1163(13421772) + string_3, "", -1, -1, 0, 0L, 0, 0, false, true, (long) player_0.index, false, -1005059728);
                } else {
                    for (int i_10 = 7; i_10 >= 0; --i_10) {
                        if (client.PLAYER_OPTIONS[i_10] != null) {
                            short s_11 = 0;
                            if (Game.darkan == client.CURRENT_GAME && client.PLAYER_OPTIONS[i_10].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -440996695))) {
                                if (client.aBool7454 && player_0.anInt10565 > VertexNormal.myPlayer.anInt10565) {
                                    s_11 = 2000;
                                }
                                if (VertexNormal.myPlayer.teamId != 0 && player_0.teamId != 0) {
                                    if (player_0.teamId == VertexNormal.myPlayer.teamId) {
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
                            PlayerAppearance.method4032(client.PLAYER_OPTIONS[i_10], ParticleProducerDefinition.method1163(16777215) + string_3, i_7, s_12, -1, (long) player_0.index, 0, 0, true, false, (long) player_0.index, false, -1621747030);
                        }
                    }
                }
                if (!bool_1) {
                    for (Class282_Sub50_Sub7 class282_sub50_sub7_9 = (Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 114); class282_sub50_sub7_9 != null; class282_sub50_sub7_9 = (Class282_Sub50_Sub7) Class20.aClass482_171.next(1246744595)) {
                        if (class282_sub50_sub7_9.anInt9587 == 23) {
                            class282_sub50_sub7_9.aString9585 = ParticleProducerDefinition.method1163(16777215) + string_3;
                            break;
                        }
                    }
                }
            }
        }
    }
}
