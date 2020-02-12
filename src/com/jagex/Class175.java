package com.jagex;

public class Class175 {

    Class175() throws Throwable {
        throw new Error();
    }

    public static QuickChatMessage decodeQuickchatMessage(RsByteBuffer buffer) {
        QuickChatMessage message = new QuickChatMessage();
        message.qcMessageId = buffer.readUnsignedShort();
        message.qcMessageDefs = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(message.qcMessageId);
        return message;
    }

    public static boolean method2962(char var_0) {
        if ((var_0 <= 0 || var_0 >= 128) && (var_0 < 160 || var_0 > 255)) {
            if (var_0 != 0) {
                char[] arr_2 = Class490.aCharArray5766;
                for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
                    char var_4 = arr_2[i_3];
                    if (var_0 == var_4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    static void method2964(Node_Sub48 class282_sub48_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        if (class282_sub48_0.soundEffectId != -1 || class282_sub48_0.anIntArray8102 != null) {
            int i_6 = 0;
            int i_7 = class282_sub48_0.anInt8089 * Class393.preferences.ambientSoundVolume.method12714() >> 8;
            if (i_2 > class282_sub48_0.anInt8079) {
                i_6 += i_2 - class282_sub48_0.anInt8079;
            } else if (i_2 < class282_sub48_0.anInt8107) {
                i_6 += class282_sub48_0.anInt8107 - i_2;
            }
            if (i_3 > class282_sub48_0.anInt8077) {
                i_6 += i_3 - class282_sub48_0.anInt8077;
            } else if (i_3 < class282_sub48_0.anInt8078) {
                i_6 += class282_sub48_0.anInt8078 - i_3;
            }
            if (class282_sub48_0.anInt8105 != 0 && i_6 - 256 <= class282_sub48_0.anInt8105 && Class393.preferences.ambientSoundVolume.method12714() != 0 && class282_sub48_0.anInt8076 == i_1) {
                i_6 -= 256;
                if (i_6 < 0) {
                    i_6 = 0;
                }
                int i_8 = class282_sub48_0.anInt8105 - class282_sub48_0.anInt8081;
                if (i_8 < 0) {
                    i_8 = class282_sub48_0.anInt8105;
                }
                int i_9 = i_7;
                int i_10 = i_6 - class282_sub48_0.anInt8081;
                if (i_10 > 0 && i_8 > 0) {
                    i_9 = i_7 * (i_8 - i_10) / i_8;
                }
                VertexNormal.MY_PLAYER.getSize();
                int i_11 = 8192;
                int i_12 = (class282_sub48_0.anInt8107 + class282_sub48_0.anInt8079) / 2 - i_2;
                int i_13 = (class282_sub48_0.anInt8078 + class282_sub48_0.anInt8077) / 2 - i_3;
                if (i_12 != 0 || i_13 != 0) {
                    int i_17 = -AnimationDefinitions.anInt5930 - (int) (Math.atan2(i_12, i_13) * 2607.5945876176133D) - 4096 & 0x3fff;
                    if (i_17 > 8192) {
                        i_17 = 16384 - i_17;
                    }
                    int i_18;
                    if (i_6 <= 0) {
                        i_18 = 8192;
                    } else if (i_6 >= 4096) {
                        i_18 = 16384;
                    } else {
                        i_18 = i_6 * 8192 / 4096 + 8192;
                    }
                    i_11 = (16384 - i_18 >> 1) + i_17 * i_18 / 8192;
                }
                Node_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1_14;
                Node_Sub26_Sub1_Sub2 class282_sub26_sub1_sub2_15;
                Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_16;
                SoundEffect class343_19;
                if (class282_sub48_0.aNode_Sub15_Sub5_8099 == null) {
                    if (class282_sub48_0.soundEffectId >= 0) {
                        i_12 = class282_sub48_0.anInt8094 == 256 && class282_sub48_0.anInt8093 == 256 ? 256 : Class76.method1356(class282_sub48_0.anInt8093, class282_sub48_0.anInt8094);
                        if (class282_sub48_0.aBool8098) {
                            if (class282_sub48_0.aNode_Sub18_8097 == null) {
                                class282_sub48_0.aNode_Sub18_8097 = MIDIInstrument.method12270(IndexLoaders.MIDI_INSTRUMENT_INDEX, class282_sub48_0.soundEffectId);
                            }
                            if (class282_sub48_0.aNode_Sub18_8097 != null) {
                                if (class282_sub48_0.aNode_Sub26_Sub1_Sub1_8082 == null) {
                                    class282_sub48_0.aNode_Sub26_Sub1_Sub1_8082 = class282_sub48_0.aNode_Sub18_8097.method12272();
                                }
                                if (class282_sub48_0.aNode_Sub26_Sub1_Sub1_8082 != null) {
                                    class282_sub15_sub5_sub1_14 = (Node_Sub15_Sub5_Sub1) class282_sub48_0.aNode_Sub26_Sub1_Sub1_8082.method15225(i_12, i_9 << 6, i_11);
                                    class282_sub15_sub5_sub1_14.method15325(-1);
                                    Class79.aNode_Sub15_Sub4_783.method15275(class282_sub15_sub5_sub1_14);
                                    class282_sub48_0.aNode_Sub15_Sub5_8099 = class282_sub15_sub5_sub1_14;
                                }
                            }
                        } else {
                            class343_19 = SoundEffect.getSoundEffect(IndexLoaders.SOUND_EFFECT_INDEX, class282_sub48_0.soundEffectId, 0);
                            if (class343_19 != null) {
                                class282_sub26_sub1_sub2_15 = class343_19.getMixedAudio().method16062(Class119.aClass344_1460);
                                class282_sub15_sub5_sub2_16 = (Node_Sub15_Sub5_Sub2) class282_sub26_sub1_sub2_15.method15225(i_12, i_9 << 6, i_11);
                                class282_sub15_sub5_sub2_16.method15325(-1);
                                Class79.aNode_Sub15_Sub4_783.method15275(class282_sub15_sub5_sub2_16);
                                class282_sub48_0.aNode_Sub15_Sub5_8099 = class282_sub15_sub5_sub2_16;
                            }
                        }
                    }
                } else {
                    class282_sub48_0.aNode_Sub15_Sub5_8099.method15312(i_9, (byte) 58);
                    class282_sub48_0.aNode_Sub15_Sub5_8099.method15340(i_11, -1345145813);
                }
                if (class282_sub48_0.aNode_Sub15_Sub5_8096 == null) {
                    if (class282_sub48_0.anIntArray8102 != null && (class282_sub48_0.anInt8080 -= i_4) <= 0) {
                        i_12 = class282_sub48_0.anInt8094 == 256 && class282_sub48_0.anInt8093 == 256 ? 256 : (int) (Math.random() * (double) (class282_sub48_0.anInt8094 - class282_sub48_0.anInt8093)) + class282_sub48_0.anInt8093;
                        if (class282_sub48_0.aBool8103) {
                            if (class282_sub48_0.aNode_Sub18_8087 == null) {
                                i_13 = (int) (Math.random() * (double) class282_sub48_0.anIntArray8102.length);
                                class282_sub48_0.aNode_Sub18_8087 = MIDIInstrument.method12270(IndexLoaders.MIDI_INSTRUMENT_INDEX, class282_sub48_0.anIntArray8102[i_13]);
                            }
                            if (class282_sub48_0.aNode_Sub18_8087 != null) {
                                if (class282_sub48_0.aNode_Sub26_Sub1_Sub1_8106 == null) {
                                    class282_sub48_0.aNode_Sub26_Sub1_Sub1_8106 = class282_sub48_0.aNode_Sub18_8087.method12272();
                                }
                                if (class282_sub48_0.aNode_Sub26_Sub1_Sub1_8106 != null) {
                                    class282_sub15_sub5_sub1_14 = (Node_Sub15_Sub5_Sub1) class282_sub48_0.aNode_Sub26_Sub1_Sub1_8106.method15225(i_12, i_9 << 6, i_11);
                                    class282_sub15_sub5_sub1_14.method15325(0);
                                    Class79.aNode_Sub15_Sub4_783.method15275(class282_sub15_sub5_sub1_14);
                                    class282_sub48_0.aNode_Sub15_Sub5_8096 = class282_sub15_sub5_sub1_14;
                                    class282_sub48_0.anInt8080 = class282_sub48_0.anInt8072 + (int) (Math.random() * (double) (class282_sub48_0.anInt8101 - class282_sub48_0.anInt8072));
                                }
                            }
                        } else {
                            i_13 = (int) (Math.random() * (double) class282_sub48_0.anIntArray8102.length);
                            class343_19 = SoundEffect.getSoundEffect(IndexLoaders.SOUND_EFFECT_INDEX, class282_sub48_0.anIntArray8102[i_13], 0);
                            if (class343_19 != null) {
                                class282_sub26_sub1_sub2_15 = class343_19.getMixedAudio().method16062(Class119.aClass344_1460);
                                class282_sub15_sub5_sub2_16 = (Node_Sub15_Sub5_Sub2) class282_sub26_sub1_sub2_15.method15225(i_12, i_9 << 6, i_11);
                                class282_sub15_sub5_sub2_16.method15325(0);
                                Class79.aNode_Sub15_Sub4_783.method15275(class282_sub15_sub5_sub2_16);
                                class282_sub48_0.aNode_Sub15_Sub5_8096 = class282_sub15_sub5_sub2_16;
                                class282_sub48_0.anInt8080 = class282_sub48_0.anInt8072 + (int) (Math.random() * (double) (class282_sub48_0.anInt8101 - class282_sub48_0.anInt8072));
                            }
                        }
                    }
                } else {
                    class282_sub48_0.aNode_Sub15_Sub5_8096.method15312(i_9, (byte) 125);
                    class282_sub48_0.aNode_Sub15_Sub5_8096.method15340(i_11, -1828796659);
                    if (!class282_sub48_0.aNode_Sub15_Sub5_8096.isLinked()) {
                        class282_sub48_0.aNode_Sub15_Sub5_8096 = null;
                        class282_sub48_0.aNode_Sub18_8087 = null;
                        class282_sub48_0.aNode_Sub26_Sub1_Sub1_8106 = null;
                    }
                }
            } else {
                if (class282_sub48_0.aNode_Sub15_Sub5_8099 != null) {
                    Class79.aNode_Sub15_Sub4_783.method15276(class282_sub48_0.aNode_Sub15_Sub5_8099);
                    class282_sub48_0.aNode_Sub15_Sub5_8099 = null;
                    class282_sub48_0.aNode_Sub26_Sub1_Sub1_8082 = null;
                    class282_sub48_0.aNode_Sub18_8097 = null;
                }
                if (class282_sub48_0.aNode_Sub15_Sub5_8096 != null) {
                    Class79.aNode_Sub15_Sub4_783.method15276(class282_sub48_0.aNode_Sub15_Sub5_8096);
                    class282_sub48_0.aNode_Sub15_Sub5_8096 = null;
                    class282_sub48_0.aNode_Sub18_8087 = null;
                    class282_sub48_0.aNode_Sub26_Sub1_Sub1_8106 = null;
                }
            }
        }
    }
}
