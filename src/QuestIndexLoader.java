public class QuestIndexLoader {

    static SpriteDefinitions aClass91_2981;

    public static int anInt2982;

    Index aClass317_2979;

    int size;

    QuestDefinitions[] questDefinitions;

    int method4154(VarProvider interface42_1, int i_2) {
        int i_3 = 0;
        for (int i_4 = 0; i_4 < this.size; i_4++) {
            QuestDefinitions questdefinitions_5 = this.getQuest(i_4);
            if (questdefinitions_5.isComplete(interface42_1)) {
                i_3 += questdefinitions_5.questpointReward;
            }
        }
        return i_3;
    }

    public QuestIndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
        this.aClass317_2979 = index_3;
        if (this.aClass317_2979 != null) {
            this.size = this.aClass317_2979.filesCount(SharedConfigsType.QUESTS.id);
        } else {
            this.size = 0;
        }
        this.questDefinitions = new QuestDefinitions[this.size];
        for (int i_5 = 0; i_5 < this.size; i_5++) {
            Index index_7 = this.aClass317_2979;
            byte[] bytes_6;
            synchronized (this.aClass317_2979) {
                bytes_6 = this.aClass317_2979.getFile(SharedConfigsType.QUESTS.id, i_5);
            }
            QuestDefinitions questdefinitions_9 = new QuestDefinitions();
            if (bytes_6 != null) {
                questdefinitions_9.method4119(new RsByteBuffer(bytes_6));
            }
            questdefinitions_9.method4095();
            this.questDefinitions[i_5] = questdefinitions_9;
            this.questDefinitions[i_5].aClass242_2976 = this;
        }
    }

    public QuestDefinitions getQuest(int i_1) {
        return this.questDefinitions[i_1];
    }

    public static final int method4162(int i_0, int i_1, byte b_2) {
        if (i_0 == -2) {
            return 12345678;
        } else if (i_0 == -1) {
            if (i_1 < 2) {
                i_1 = 2;
            } else if (i_1 > 126) {
                i_1 = 126;
            }
            return i_1;
        } else {
            i_1 = (i_0 & 0x7f) * i_1 >> 7;
            if (i_1 < 2) {
                i_1 = 2;
            } else if (i_1 > 126) {
                i_1 = 126;
            }
            return (i_0 & 0xff80) + i_1;
        }
    }

    public static byte getByteForChar(char var_0) {
        byte b_1;
        if ((var_0 <= 0 || var_0 >= 128) && (var_0 < 160 || var_0 > 255)) {
            if (var_0 == 8364) {
                b_1 = -128;
            } else if (var_0 == 8218) {
                b_1 = -126;
            } else if (var_0 == 402) {
                b_1 = -125;
            } else if (var_0 == 8222) {
                b_1 = -124;
            } else if (var_0 == 8230) {
                b_1 = -123;
            } else if (var_0 == 8224) {
                b_1 = -122;
            } else if (var_0 == 8225) {
                b_1 = -121;
            } else if (var_0 == 710) {
                b_1 = -120;
            } else if (var_0 == 8240) {
                b_1 = -119;
            } else if (var_0 == 352) {
                b_1 = -118;
            } else if (var_0 == 8249) {
                b_1 = -117;
            } else if (var_0 == 338) {
                b_1 = -116;
            } else if (var_0 == 381) {
                b_1 = -114;
            } else if (var_0 == 8216) {
                b_1 = -111;
            } else if (var_0 == 8217) {
                b_1 = -110;
            } else if (var_0 == 8220) {
                b_1 = -109;
            } else if (var_0 == 8221) {
                b_1 = -108;
            } else if (var_0 == 8226) {
                b_1 = -107;
            } else if (var_0 == 8211) {
                b_1 = -106;
            } else if (var_0 == 8212) {
                b_1 = -105;
            } else if (var_0 == 732) {
                b_1 = -104;
            } else if (var_0 == 8482) {
                b_1 = -103;
            } else if (var_0 == 353) {
                b_1 = -102;
            } else if (var_0 == 8250) {
                b_1 = -101;
            } else if (var_0 == 339) {
                b_1 = -100;
            } else if (var_0 == 382) {
                b_1 = -98;
            } else if (var_0 == 376) {
                b_1 = -97;
            } else {
                b_1 = 63;
            }
        } else {
            b_1 = (byte) var_0;
        }
        return b_1;
    }

    static void method4164(int i_0, int i_1, int i_2) {
        if (Class20.anInt167 == 1) {
            CutsceneAction_Sub4.method13789(Class46.aCacheableNode_Sub7_438, i_0, i_1, -549787245);
        } else if (Class20.anInt167 == 2) {
            NativeLibraryLoader.method4653(i_0, i_1, -769540795);
        }
        Class20.anInt167 = 0;
        Class46.aCacheableNode_Sub7_438 = null;
    }

    static Class149_Sub3 method4165(RsByteBuffer rsbytebuffer_0) {
        return new Class149_Sub3(rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.readUnsignedByte());
    }

    public static final void method4166() {
        if (!client.aBool7331) {
            client.aFloat7284 += (12.0F - client.aFloat7284) / 2.0F;
            client.aBool7371 = true;
            client.aBool7331 = true;
        }
    }

    public static void method4167(String string_0) {
        if (client.aBool7344 && (Class506.USE_OPTIONS_FLAGS & 0x18) != 0) {
            boolean bool_2 = false;
            int i_3 = Class197.NUM_PLAYER_INDICES;
            int[] ints_4 = Class197.PLAYER_INDICES;
            for (int i_5 = 0; i_5 < i_3; i_5++) {
                Player player_6 = client.players[ints_4[i_5]];
                if (player_6.displayName != null && player_6.displayName.equalsIgnoreCase(string_0) && (player_6 == VertexNormal.MY_PLAYER && (Class506.USE_OPTIONS_FLAGS & 0x10) != 0 || (Class506.USE_OPTIONS_FLAGS & 0x8) != 0)) {
                    TCPPacket tcpmessage_7 = Class271.createPacket(ClientPacket.IF_ON_PLAYER, client.GAME_CONNECTION_CONTEXT.isaac);
                    tcpmessage_7.buffer.writeShort(client.anInt7345);
                    tcpmessage_7.buffer.writeShortLE(ints_4[i_5]);
                    tcpmessage_7.buffer.write128Byte(0);
                    tcpmessage_7.buffer.writeIntV2(client.anInt56);
                    tcpmessage_7.buffer.writeShortLE(client.anInt7346);
                    client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_7);
                    int i_8 = player_6.getSize();
                    MapRegion.routeTo(player_6.regionBaseX[0], player_6.regionBaseY[0], true, Class344.method6115(player_6.regionBaseX[0], player_6.regionBaseY[0], i_8, i_8));
                    bool_2 = true;
                    break;
                }
            }
            if (!bool_2) {
                ChatLine.appendGameMessage(Message.UNABLE_TO_FIND.translate(Class223.CURRENT_LANGUAGE) + string_0);
            }
            if (client.aBool7344) {
                Class60.method1170();
            }
        }
    }
}
