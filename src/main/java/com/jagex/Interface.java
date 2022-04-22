package com.jagex;

public class Interface {
    public static Interface[] INTERFACES;
    public IComponentDefinitions[] components;
    public boolean aBool999;
    IComponentDefinitions[] iComponentDefinitions;

    Interface(boolean bool_1, IComponentDefinitions[] arr_2) {
        components = arr_2;
        aBool999 = bool_1;
    }

    static void method7554(Interface inter, IComponentDefinitions defs) {
        if (defs != null) {
            int i_4;
            if (defs.slotId != -1) {
                IComponentDefinitions icomponentdefinitions_3 = inter.getComponent(defs.parent);
                if (icomponentdefinitions_3 != null) {
                    if (icomponentdefinitions_3.itemSlots == icomponentdefinitions_3.slotChildren) {
                        icomponentdefinitions_3.itemSlots = new IComponentDefinitions[icomponentdefinitions_3.slotChildren.length];
                        icomponentdefinitions_3.itemSlots[icomponentdefinitions_3.itemSlots.length - 1] = defs;
                        Class503.setSize(icomponentdefinitions_3.slotChildren, 0, icomponentdefinitions_3.itemSlots, 0, defs.slotId);
                        Class503.setSize(icomponentdefinitions_3.slotChildren, defs.slotId + 1, icomponentdefinitions_3.itemSlots, defs.slotId, icomponentdefinitions_3.slotChildren.length - defs.slotId - 1);
                    } else {
                        i_4 = 0;
                        IComponentDefinitions[] arr_5;
                        for (arr_5 = icomponentdefinitions_3.itemSlots; i_4 < arr_5.length && arr_5[i_4] != defs; i_4++) {
                        }
                        if (i_4 < arr_5.length) {
                            Class503.setSize(arr_5, i_4 + 1, arr_5, i_4, arr_5.length - i_4 - 1);
                            arr_5[icomponentdefinitions_3.itemSlots.length - 1] = defs;
                        }
                    }
                }
            } else {
                IComponentDefinitions[] arr_6 = inter.method1617();
                for (i_4 = 0; i_4 < arr_6.length && arr_6[i_4] != defs; i_4++) {
                }
                if (i_4 < arr_6.length) {
                    Class503.setSize(arr_6, i_4 + 1, arr_6, i_4, arr_6.length - i_4 - 1);
                    arr_6[arr_6.length - 1] = defs;
                }
            }
        }
    }

    static void method3710(Interface inter, IComponentDefinitions defs) {
        if (defs != null) {
            int i_4;
            if (defs.slotId != -1) {
                IComponentDefinitions icomponentdefinitions_3 = inter.components[defs.parent & 0xffff];
                if (icomponentdefinitions_3 != null) {
                    if (icomponentdefinitions_3.slotChildren == icomponentdefinitions_3.itemSlots) {
                        icomponentdefinitions_3.itemSlots = new IComponentDefinitions[icomponentdefinitions_3.slotChildren.length];
                        icomponentdefinitions_3.itemSlots[0] = defs;
                        Class503.setSize(icomponentdefinitions_3.slotChildren, 0, icomponentdefinitions_3.itemSlots, 1, defs.slotId);
                        Class503.setSize(icomponentdefinitions_3.slotChildren, defs.slotId + 1, icomponentdefinitions_3.itemSlots, defs.slotId + 1, icomponentdefinitions_3.slotChildren.length - defs.slotId - 1);
                    } else {
                        i_4 = 0;

                        IComponentDefinitions[] arr_5;
                        for (arr_5 = icomponentdefinitions_3.itemSlots; i_4 < arr_5.length && arr_5[i_4] != defs; i_4++) {
                        }

                        if (i_4 < arr_5.length) {
                            Class503.setSize(arr_5, 0, arr_5, 1, i_4);
                            arr_5[0] = defs;
                        }
                    }
                }
            } else {
                IComponentDefinitions[] arr_6 = inter.method1617();

                for (i_4 = 0; i_4 < arr_6.length && arr_6[i_4] != defs; i_4++) {
                }

                if (i_4 < arr_6.length) {
                    Class503.setSize(arr_6, 0, arr_6, 1, i_4);
                    arr_6[0] = defs;
                }
            }
        }

    }

    public static void updateInGameSounds() {
        Class216.sendSongStartedPacket();
        for (int i = 0; i < Class260.SOUNDS_SIZE; i++) {
            AreadSound areadSound_1 = Class260.SOUNDS[i];
            boolean soundEnded = false;
            int i_4;
            if (areadSound_1.aSoundNode_1_3304 == null) {//Runs once and fills the node with the sound
                --areadSound_1.timePosition;
                if (areadSound_1.timePosition >= (areadSound_1.isRecordedAudio() ? -1500 : -10)) {
                    if (areadSound_1.type == 1 && areadSound_1.soundEffect == null) {
                        areadSound_1.soundEffect = SoundEffect.getSoundEffect(IndexLoaders.SOUND_EFFECT_INDEX, areadSound_1.soundId, 0);
                        if (areadSound_1.soundEffect == null) {
                            continue;
                        }
                        areadSound_1.timePosition += areadSound_1.soundEffect.getDelay();
                    } else if (areadSound_1.isRecordedAudio() && (areadSound_1.midiInstrumentSound == null || areadSound_1.audio == null)) {
                        if (areadSound_1.midiInstrumentSound == null) {
                            areadSound_1.midiInstrumentSound = MIDIInstrument.getMidiInstrumentSound(IndexLoaders.MIDI_INSTRUMENT_INDEX, areadSound_1.soundId);
                        }
                        if (areadSound_1.midiInstrumentSound == null) {
                            continue;
                        }
                        if (areadSound_1.audio == null) {
                            areadSound_1.audio = areadSound_1.midiInstrumentSound.getAudio();
                            if (areadSound_1.audio == null) {
                                continue;
                            }
                        }
                    }
                    if (areadSound_1.timePosition < 0) {//Play area sound up to 0
                        i_4 = 8192;
                        int volume;
                        if (areadSound_1.anInt3298 != 0) {
                            int i_6 = areadSound_1.anInt3298 >> 24 & 0x3;
                            if (i_6 == VertexNormal.MY_PLAYER.plane) {
                                int i_7 = (areadSound_1.anInt3298 & 0xff) << 9;
                                int i_8 = VertexNormal.MY_PLAYER.getSize() << 8;
                                Vector3 vector3_9 = VertexNormal.MY_PLAYER.method11166().coords;
                                int i_10 = areadSound_1.anInt3298 >> 16 & 0xff;
                                int i_11 = (i_10 << 9) + 256 - (int) vector3_9.x + i_8;
                                int i_12 = areadSound_1.anInt3298 >> 8 & 0xff;
                                int i_13 = (i_12 << 9) + 256 - (int) vector3_9.z + i_8;
                                int i_14 = Math.abs(i_11) + Math.abs(i_13) - 512;
                                if (i_14 > i_7) {
                                    areadSound_1.timePosition = -99999;
                                    continue;
                                }
                                if (i_14 < 0) {
                                    i_14 = 0;
                                }
                                volume = (i_7 - i_14) * Class393.preferences.ambientSoundVolume.getVolumeRatio() * areadSound_1.anInt123 / i_7 >> 2;
                                if (areadSound_1.anInt3305 != -1) {
                                    i_10 = areadSound_1.anInt3305;
                                    i_12 = areadSound_1.anInt3306;
                                }
                                if (i_11 != 0 || i_13 != 0) {
                                    int i_15 = -AnimationDefinitions.anInt5930 - (int) (Math.atan2(i_11, i_13) * 2607.5945876176133D) - 4096 & 0x3fff;
                                    if (i_15 > 8192) {
                                        i_15 = 16384 - i_15;
                                    }
                                    int i_16;
                                    if (i_14 <= 0) {
                                        i_16 = 8192;
                                    } else if (i_14 >= 4096) {
                                        i_16 = 16384;
                                    } else {
                                        i_16 = (8192 - i_14) / 4096 + 8192;
                                    }
                                    i_4 = (16384 - i_16 >> 1) + i_15 * i_16 / 8192;
                                }
                            } else {
                                volume = 0;
                            }
                        } else {
                            volume = areadSound_1.anInt123 * (areadSound_1.type == 3 ? Class393.preferences.voiceOverVolume.getVolumeRatio() : Class393.preferences.soundEffectVolume.getVolumeRatio()) >> 2;
                        }
                        if (volume > 0) {
                            if (areadSound_1.type == 1) {
                                Object obj_18 = null;
                                AudioFormatUnknown audio = areadSound_1.soundEffect.getMixedAudio().method16062(Class119.aClass344_1460);
                                areadSound_1.aSoundNode_1_3304 = audio.getHeadSoundNode_4(areadSound_1.anInt3295, volume, i_4);
                            } else if (areadSound_1.isRecordedAudio()) {
                                areadSound_1.aSoundNode_1_3304 = areadSound_1.audio.getHeadSoundNode_4(areadSound_1.anInt3295, volume, i_4);
                            }
                            areadSound_1.aSoundNode_1_3304.method15325(areadSound_1.anInt3302 - 1);
                            Class79.aNode_Sub15_Sub4_783.method15275(areadSound_1.aSoundNode_1_3304);
                        }
                    }
                } else {
                    soundEnded = true;
                }
            } else if (!areadSound_1.aSoundNode_1_3304.linked()) {
                soundEnded = true;
            }
            if (soundEnded) {//Remove from sound queue
                --Class260.SOUNDS_SIZE;
                for (i_4 = i; i_4 < Class260.SOUNDS_SIZE; i_4++) {
                    Class260.SOUNDS[i_4] = Class260.SOUNDS[i_4 + 1];
                }
                --i;
            }
        }
        if (Class260.aBool3220 && !SongReference.method1966()) {
            if (Class393.preferences.musicVolume.getVolumeRatio() != 0 && Class260.musicId != -1) {
                if (Class260.aNode_Sub15_Sub2_3231 != null) {
                    Class217.method3690(IndexLoaders.MUSIC_INDEX, Class260.musicId, Class393.preferences.musicVolume.getVolumeRatio(), Class260.aNode_Sub15_Sub2_3231);
                } else {
                    Class11.method13400(IndexLoaders.MUSIC_INDEX, Class260.musicId, Class393.preferences.musicVolume.getVolumeRatio());
                }
            }
            Class260.aBool3220 = false;
            Class260.aNode_Sub15_Sub2_3231 = null;
        } else if (Class393.preferences.musicVolume.getVolumeRatio() != 0 && Class260.musicId != -1 && !SongReference.method1966()) {
            TCPPacket musicSoundEnd = TCPPacket.createPacket(ClientProt.SOUND_EFFECT_MUSIC_ENDED, client.GAME_CONNECTION_CONTEXT.outKeys);
            musicSoundEnd.buffer.writeInt(Class260.musicId);
            client.GAME_CONNECTION_CONTEXT.queuePacket(musicSoundEnd);
            Class260.musicId = -1;
        }
    }

    public static AccountCreationResponseOpcodes[] method1626() {
        return new AccountCreationResponseOpcodes[]{AccountCreationResponseOpcodes.aClass483_5729, AccountCreationResponseOpcodes.CLIENT_HAS_BEEN_UPDATED, AccountCreationResponseOpcodes.CONTINUE, AccountCreationResponseOpcodes.aClass483_5733, AccountCreationResponseOpcodes.aClass483_5730, AccountCreationResponseOpcodes.aClass483_5735, AccountCreationResponseOpcodes.aClass483_5732, AccountCreationResponseOpcodes.aClass483_5736, AccountCreationResponseOpcodes.aClass483_5737, AccountCreationResponseOpcodes.aClass483_5731};
    }

    public IComponentDefinitions[] method1616() {
        return iComponentDefinitions == null ? components : iComponentDefinitions;
    }

    public IComponentDefinitions[] method1617() {
        if (iComponentDefinitions == null) {
            int i_2 = components.length;
            iComponentDefinitions = new IComponentDefinitions[i_2];
            System.arraycopy(components, 0, iComponentDefinitions, 0, components.length);
        }
        return iComponentDefinitions;
    }

    public IComponentDefinitions getComponent(int componentId) {
        if (componentId >>> 16 != components[0].idHash >>> 16) {
            throw new IllegalArgumentException();
        } else {
            return components[componentId & 0xffff];
        }
    }
}
