package com.jagex;

public class QuestDefinitions {

    public String name;
    public String sortName;
    public int type;
    public int difficulty;
    public boolean members;
    public int questpointReward;
    public int[] questPrerequisiteIds;
    public int[][] levelRequirements;
    public int questpointRequirement;
    public int graphicId = -1;
    public int[] varpRequirements;
    public String[] varpRequirementNames;
    public int[] varBitRequirements;
    public String[] varbitRequirementNames;
    QuestIndexLoader aClass242_2976;
    int[][] varValues;
    int[][] varbitValues;
    int[] anIntArray2955;
    int[] minVarpValue;
    int[] maxVarpValue;
    int[] minVarBitValue;
    int[] maxVarBitValue;
    IterableNodeMap params;

    public static boolean isRoof(int locShape) {
        return locShape >= ObjectType.STRAIGHT_SLOPE_ROOF.id && locShape <= ObjectType.STRAIGHT_FLAT_ROOF.id;
    }

    static void writeCRCs(ByteBuf.Bit rsbitsbuffer_0) {
        rsbitsbuffer_0.writeInt(IndexLoaders.ANIMATION_FRAME_SET_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.ANIMATION_FRAME_BASE_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.CONFIG_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.INTERFACE_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.SOUND_EFFECT_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.MAP_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.MUSIC_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.MESH_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.SPRITES_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.TEXTURE_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.HUFFMAN_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.MUSIC2_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.CS2_SCRIPTS_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.FONT_METRICS_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.MIDI_INSTRUMENT_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.SOUND_MIDI_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.OBJECT_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.ENUM_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.NPC_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.ITEM_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.ANIMATION_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.SPOTANIM_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.VARBIT_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.WORLD_MAP_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.QC_MESSAGES_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.QC_MENU_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.TEXTURE_DEFINITION_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.PARTICLE_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.DEFAULTS_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.BILLBOARD_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.NATIVE_LIBRARY_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.SHADER_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(Class378.method6435());
        rsbitsbuffer_0.writeInt(Preference_Sub7.method12672());
        rsbitsbuffer_0.writeInt(IndexLoaders.CUTSCENE_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.VORBIS_INDEX.getCrc());
    }

    public static void setConsoleText(String string_0) {
        Class179.aString2225 = string_0;
        Class179.anInt2220 = Class179.aString2225.length();
    }

    public boolean method4093(VarProvider interface42_1, int[] ints_2) {
        if (aClass242_2976.method4154(interface42_1) < questpointRequirement) {
            return false;
        } else {
            int i_4;
            if (levelRequirements != null) {
                for (i_4 = 0; i_4 < levelRequirements.length; i_4++) {
                    if (ints_2[levelRequirements[i_4][0]] < levelRequirements[i_4][1]) {
                        return false;
                    }
                }
            }
            if (questPrerequisiteIds != null) {
                for (i_4 = 0; i_4 < questPrerequisiteIds.length; i_4++) {
                    if (!aClass242_2976.getQuest(questPrerequisiteIds[i_4]).isComplete(interface42_1)) {
                        return false;
                    }
                }
            }
            int i_5;
            if (varpRequirements != null) {
                for (i_4 = 0; i_4 < varpRequirements.length; i_4++) {
                    i_5 = interface42_1.getVar(varpRequirements[i_4]);
                    if (i_5 < minVarpValue[i_4] || i_5 > maxVarpValue[i_4]) {
                        return false;
                    }
                }
            }
            if (varBitRequirements != null) {
                for (i_4 = 0; i_4 < varBitRequirements.length; i_4++) {
                    i_5 = interface42_1.getVarBit(varBitRequirements[i_4]);
                    if (i_5 < minVarBitValue[i_4] || i_5 > maxVarBitValue[i_4]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    void method4094(ByteBuf rsbytebuffer_1, int i_2) {
        if (i_2 == 1) {
            name = rsbytebuffer_1.readGJString();
        } else if (i_2 == 2) {
            sortName = rsbytebuffer_1.readGJString();
        } else {
            int i_4;
            int i_5;
            if (i_2 == 3) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                varValues = new int[i_4][3];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    varValues[i_5][0] = rsbytebuffer_1.readUnsignedShort();
                    varValues[i_5][1] = rsbytebuffer_1.readInt();
                    varValues[i_5][2] = rsbytebuffer_1.readInt();
                }
            } else if (i_2 == 4) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                varbitValues = new int[i_4][3];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    varbitValues[i_5][0] = rsbytebuffer_1.readUnsignedShort();
                    varbitValues[i_5][1] = rsbytebuffer_1.readInt();
                    varbitValues[i_5][2] = rsbytebuffer_1.readInt();
                }
            } else if (i_2 == 5) {
                rsbytebuffer_1.readUnsignedShort();
            } else if (i_2 == 6) {
                type = rsbytebuffer_1.readUnsignedByte();
            } else if (i_2 == 7) {
                difficulty = rsbytebuffer_1.readUnsignedByte();
            } else if (i_2 == 8) {
                members = true;
            } else if (i_2 == 9) {
                questpointReward = rsbytebuffer_1.readUnsignedByte();
            } else if (i_2 == 10) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                anIntArray2955 = new int[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    anIntArray2955[i_5] = rsbytebuffer_1.readInt();
                }
            } else if (i_2 == 12) {
                rsbytebuffer_1.readInt();
            } else if (i_2 == 13) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                questPrerequisiteIds = new int[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    questPrerequisiteIds[i_5] = rsbytebuffer_1.readUnsignedShort();
                }
            } else if (i_2 == 14) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                levelRequirements = new int[i_4][2];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    levelRequirements[i_5][0] = rsbytebuffer_1.readUnsignedByte();
                    levelRequirements[i_5][1] = rsbytebuffer_1.readUnsignedByte();
                }
            } else if (i_2 == 15) {
                questpointRequirement = rsbytebuffer_1.readUnsignedShort();
            } else if (i_2 == 17) {
                graphicId = rsbytebuffer_1.readBigSmart();
            } else if (i_2 == 18) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                varpRequirements = new int[i_4];
                minVarpValue = new int[i_4];
                maxVarpValue = new int[i_4];
                varpRequirementNames = new String[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    varpRequirements[i_5] = rsbytebuffer_1.readInt();
                    minVarpValue[i_5] = rsbytebuffer_1.readInt();
                    maxVarpValue[i_5] = rsbytebuffer_1.readInt();
                    varpRequirementNames[i_5] = rsbytebuffer_1.readString();
                }
            } else if (i_2 == 19) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                varBitRequirements = new int[i_4];
                minVarBitValue = new int[i_4];
                maxVarBitValue = new int[i_4];
                varbitRequirementNames = new String[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    varBitRequirements[i_5] = rsbytebuffer_1.readInt();
                    minVarBitValue[i_5] = rsbytebuffer_1.readInt();
                    maxVarBitValue[i_5] = rsbytebuffer_1.readInt();
                    varbitRequirementNames[i_5] = rsbytebuffer_1.readString();
                }
            } else if (i_2 == 249) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                if (params == null) {
                    i_5 = Utils.nextPowerOfTwo(i_4);
                    params = new IterableNodeMap(i_5);
                }
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    boolean bool_6 = rsbytebuffer_1.readUnsignedByte() == 1;
                    int i_7 = rsbytebuffer_1.read24BitUnsignedInteger();
                    Node obj_8;
                    if (bool_6) {
                        obj_8 = new ObjectNode(rsbytebuffer_1.readString());
                    } else {
                        obj_8 = new IntNode(rsbytebuffer_1.readInt());
                    }
                    params.put((Node) obj_8, i_7);
                }
            }
        }
    }

    void method4095() {
        if (sortName == null) {
            sortName = name;
        }
    }

    public boolean isStarted(VarProvider provider) {
        int i_3;
        if (varValues != null) {
            for (i_3 = 0; i_3 < varValues.length; i_3++) {
                if (provider.getVar(varValues[i_3][0]) >= varValues[i_3][1]) {
                    return true;
                }
            }
        }
        if (varbitValues != null) {
            for (i_3 = 0; i_3 < varbitValues.length; i_3++) {
                if (provider.getVarBit(varbitValues[i_3][0]) >= varbitValues[i_3][1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isComplete(VarProvider interface42_1) {
        int i_3;
        if (varValues != null) {
            for (i_3 = 0; i_3 < varValues.length; i_3++) {
                if (interface42_1.getVar(varValues[i_3][0]) >= varValues[i_3][2]) {
                    return true;
                }
            }
        }
        if (varbitValues != null) {
            for (i_3 = 0; i_3 < varbitValues.length; i_3++) {
                if (interface42_1.getVarBit(varbitValues[i_3][0]) >= varbitValues[i_3][2]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean method4101(VarProvider interface42_1) {
        return aClass242_2976.method4154(interface42_1) >= questpointRequirement;
    }

    public boolean method4103(VarProvider interface42_1, int i_2) {
        return (questPrerequisiteIds != null && i_2 >= 0 && i_2 < questPrerequisiteIds.length) && aClass242_2976.getQuest(questPrerequisiteIds[i_2]).isComplete(interface42_1);
    }

    public boolean method4104(VarProvider interface42_1, int i_2) {
        if (varpRequirements != null && i_2 >= 0 && i_2 < varpRequirements.length) {
            int i_4 = interface42_1.getVar(varpRequirements[i_2]);
            return i_4 >= minVarpValue[i_2] && i_4 <= maxVarpValue[i_2];
        } else {
            return false;
        }
    }

    public boolean method4105(VarProvider interface42_1, int i_2) {
        if (varBitRequirements != null && i_2 >= 0 && i_2 < varBitRequirements.length) {
            int i_4 = interface42_1.getVarBit(varBitRequirements[i_2]);
            return i_4 >= minVarBitValue[i_2] && i_4 <= maxVarBitValue[i_2];
        } else {
            return false;
        }
    }

    public String method4110(int i_1, String string_2) {
        if (params == null) {
            return string_2;
        } else {
            ObjectNode class282_sub47_4 = (ObjectNode) params.get(i_1);
            return class282_sub47_4 == null ? string_2 : (String) class282_sub47_4.anObject8068;
        }
    }

    public boolean method4111(int[] ints_1, int i_2) {
        return (levelRequirements != null && i_2 >= 0 && i_2 < levelRequirements.length) && ints_1[levelRequirements[i_2][0]] >= levelRequirements[i_2][1];
    }

    void method4119(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            method4094(rsbytebuffer_1, i_3);
        }
    }

    public int method4135(int i_1, int i_2) {
        if (params == null) {
            return i_2;
        } else {
            IntNode class282_sub38_4 = (IntNode) params.get(i_1);
            return class282_sub38_4 == null ? i_2 : class282_sub38_4.value;
        }
    }
}
