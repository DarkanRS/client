public class QuestDefinitions {

    QuestIndexLoader aClass242_2976;
    public String name;
    public String sortName;
    int[][] varValues;
    int[][] varbitValues;
    public int type = 0;
    public int difficulty = 0;
    public boolean members = false;
    public int questpointReward;
    int[] anIntArray2955;
    public int[] questPrerequisiteIds;
    public int[][] levelRequirements;
    public int questpointRequirement;
    public int graphicId = -1;
    public int[] varpRequirements;
    int[] minVarpValue;
    int[] maxVarpValue;
    public String[] varpRequirementNames;
    public int[] varBitRequirements;
    int[] minVarBitValue;
    int[] maxVarBitValue;
    public String[] varbitRequirementNames;
    IterableNodeMap params;

    public boolean method4093(VarProvider interface42_1, int[] ints_2) {
        if (this.aClass242_2976.method4154(interface42_1, 1765999661) < this.questpointRequirement) {
            return false;
        } else {
            int i_4;
            if (this.levelRequirements != null) {
                for (i_4 = 0; i_4 < this.levelRequirements.length; i_4++) {
                    if (ints_2[this.levelRequirements[i_4][0]] < this.levelRequirements[i_4][1]) {
                        return false;
                    }
                }
            }
            if (this.questPrerequisiteIds != null) {
                for (i_4 = 0; i_4 < this.questPrerequisiteIds.length; i_4++) {
                    if (!this.aClass242_2976.getQuest(this.questPrerequisiteIds[i_4]).isComplete(interface42_1)) {
                        return false;
                    }
                }
            }
            int i_5;
            if (this.varpRequirements != null) {
                for (i_4 = 0; i_4 < this.varpRequirements.length; i_4++) {
                    i_5 = interface42_1.getVar(this.varpRequirements[i_4]);
                    if (i_5 < this.minVarpValue[i_4] || i_5 > this.maxVarpValue[i_4]) {
                        return false;
                    }
                }
            }
            if (this.varBitRequirements != null) {
                for (i_4 = 0; i_4 < this.varBitRequirements.length; i_4++) {
                    i_5 = interface42_1.getVarBit(this.varBitRequirements[i_4]);
                    if (i_5 < this.minVarBitValue[i_4] || i_5 > this.maxVarBitValue[i_4]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    void method4094(RsByteBuffer rsbytebuffer_1, int i_2) {
        if (i_2 == 1) {
            this.name = rsbytebuffer_1.readGJString();
        } else if (i_2 == 2) {
            this.sortName = rsbytebuffer_1.readGJString();
        } else {
            int i_4;
            int i_5;
            if (i_2 == 3) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                this.varValues = new int[i_4][3];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.varValues[i_5][0] = rsbytebuffer_1.readUnsignedShort();
                    this.varValues[i_5][1] = rsbytebuffer_1.readInt();
                    this.varValues[i_5][2] = rsbytebuffer_1.readInt();
                }
            } else if (i_2 == 4) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                this.varbitValues = new int[i_4][3];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.varbitValues[i_5][0] = rsbytebuffer_1.readUnsignedShort();
                    this.varbitValues[i_5][1] = rsbytebuffer_1.readInt();
                    this.varbitValues[i_5][2] = rsbytebuffer_1.readInt();
                }
            } else if (i_2 == 5) {
                rsbytebuffer_1.readUnsignedShort();
            } else if (i_2 == 6) {
                this.type = rsbytebuffer_1.readUnsignedByte();
            } else if (i_2 == 7) {
                this.difficulty = rsbytebuffer_1.readUnsignedByte();
            } else if (i_2 == 8) {
                this.members = true;
            } else if (i_2 == 9) {
                this.questpointReward = rsbytebuffer_1.readUnsignedByte();
            } else if (i_2 == 10) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                this.anIntArray2955 = new int[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.anIntArray2955[i_5] = rsbytebuffer_1.readInt();
                }
            } else if (i_2 == 12) {
                rsbytebuffer_1.readInt();
            } else if (i_2 == 13) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                this.questPrerequisiteIds = new int[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.questPrerequisiteIds[i_5] = rsbytebuffer_1.readUnsignedShort();
                }
            } else if (i_2 == 14) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                this.levelRequirements = new int[i_4][2];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.levelRequirements[i_5][0] = rsbytebuffer_1.readUnsignedByte();
                    this.levelRequirements[i_5][1] = rsbytebuffer_1.readUnsignedByte();
                }
            } else if (i_2 == 15) {
                this.questpointRequirement = rsbytebuffer_1.readUnsignedShort();
            } else if (i_2 == 17) {
                this.graphicId = rsbytebuffer_1.readBigSmart();
            } else if (i_2 == 18) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                this.varpRequirements = new int[i_4];
                this.minVarpValue = new int[i_4];
                this.maxVarpValue = new int[i_4];
                this.varpRequirementNames = new String[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.varpRequirements[i_5] = rsbytebuffer_1.readInt();
                    this.minVarpValue[i_5] = rsbytebuffer_1.readInt();
                    this.maxVarpValue[i_5] = rsbytebuffer_1.readInt();
                    this.varpRequirementNames[i_5] = rsbytebuffer_1.readString();
                }
            } else if (i_2 == 19) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                this.varBitRequirements = new int[i_4];
                this.minVarBitValue = new int[i_4];
                this.maxVarBitValue = new int[i_4];
                this.varbitRequirementNames = new String[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.varBitRequirements[i_5] = rsbytebuffer_1.readInt();
                    this.minVarBitValue[i_5] = rsbytebuffer_1.readInt();
                    this.maxVarBitValue[i_5] = rsbytebuffer_1.readInt();
                    this.varbitRequirementNames[i_5] = rsbytebuffer_1.readString();
                }
            } else if (i_2 == 249) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                if (this.params == null) {
                    i_5 = Utils.nextPowerOfTwo(i_4);
                    this.params = new IterableNodeMap(i_5);
                }
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    boolean bool_6 = rsbytebuffer_1.readUnsignedByte() == 1;
                    int i_7 = rsbytebuffer_1.read24BitUnsignedInteger();
                    Object obj_8;
                    if (bool_6) {
                        obj_8 = new StringNode(rsbytebuffer_1.readString());
                    } else {
                        obj_8 = new IntNode(rsbytebuffer_1.readInt());
                    }
                    this.params.put((Node) obj_8, (long) i_7);
                }
            }
        }
    }

    void method4095() {
        if (this.sortName == null) {
            this.sortName = this.name;
        }
    }

    public boolean isStarted(VarProvider provider) {
        int i_3;
        if (this.varValues != null) {
            for (i_3 = 0; i_3 < this.varValues.length; i_3++) {
                if (provider.getVar(this.varValues[i_3][0]) >= this.varValues[i_3][1]) {
                    return true;
                }
            }
        }
        if (this.varbitValues != null) {
            for (i_3 = 0; i_3 < this.varbitValues.length; i_3++) {
                if (provider.getVarBit(this.varbitValues[i_3][0]) >= this.varbitValues[i_3][1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isComplete(VarProvider interface42_1) {
        int i_3;
        if (this.varValues != null) {
            for (i_3 = 0; i_3 < this.varValues.length; i_3++) {
                if (interface42_1.getVar(this.varValues[i_3][0]) >= this.varValues[i_3][2]) {
                    return true;
                }
            }
        }
        if (this.varbitValues != null) {
            for (i_3 = 0; i_3 < this.varbitValues.length; i_3++) {
                if (interface42_1.getVarBit(this.varbitValues[i_3][0]) >= this.varbitValues[i_3][2]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean method4101(VarProvider interface42_1) {
        return this.aClass242_2976.method4154(interface42_1, 2095145584) >= this.questpointRequirement;
    }

    public boolean method4103(VarProvider interface42_1, int i_2) {
        return this.questPrerequisiteIds != null && i_2 >= 0 && i_2 < this.questPrerequisiteIds.length ? this.aClass242_2976.getQuest(this.questPrerequisiteIds[i_2]).isComplete(interface42_1) : false;
    }

    public boolean method4104(VarProvider interface42_1, int i_2) {
        if (this.varpRequirements != null && i_2 >= 0 && i_2 < this.varpRequirements.length) {
            int i_4 = interface42_1.getVar(this.varpRequirements[i_2]);
            return i_4 >= this.minVarpValue[i_2] && i_4 <= this.maxVarpValue[i_2];
        } else {
            return false;
        }
    }

    public boolean method4105(VarProvider interface42_1, int i_2) {
        if (this.varBitRequirements != null && i_2 >= 0 && i_2 < this.varBitRequirements.length) {
            int i_4 = interface42_1.getVarBit(this.varBitRequirements[i_2]);
            return i_4 >= this.minVarBitValue[i_2] && i_4 <= this.maxVarBitValue[i_2];
        } else {
            return false;
        }
    }

    public String method4110(int i_1, String string_2) {
        if (this.params == null) {
            return string_2;
        } else {
            StringNode class282_sub47_4 = (StringNode) this.params.get((long) i_1);
            return class282_sub47_4 == null ? string_2 : (String) class282_sub47_4.anObject8068;
        }
    }

    public boolean method4111(int[] ints_1, int i_2) {
        return this.levelRequirements != null && i_2 >= 0 && i_2 < this.levelRequirements.length ? ints_1[this.levelRequirements[i_2][0]] >= this.levelRequirements[i_2][1] : false;
    }

    void method4119(RsByteBuffer rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            this.method4094(rsbytebuffer_1, i_3);
        }
    }

    public int method4135(int i_1, int i_2) {
        if (this.params == null) {
            return i_2;
        } else {
            IntNode class282_sub38_4 = (IntNode) this.params.get((long) i_1);
            return class282_sub38_4 == null ? i_2 : class282_sub38_4.value;
        }
    }

    public static boolean isRoof(int i_0, int i_1) {
        return i_0 >= SceneObjectType.STRAIGHT_SLOPE_ROOF.type && i_0 <= SceneObjectType.STRAIGHT_FLAT_ROOF.type;
    }

    static void writeCRCs(RsBitsBuffer rsbitsbuffer_0, int i_1) {
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
        rsbitsbuffer_0.writeInt(IndexLoaders.INDEX_11.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.CS2_SCRIPTS_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.FONT_METRICS_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.MIDI_INSTRUMENT_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.INDEX_15.getCrc());
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
        rsbitsbuffer_0.writeInt(IndexLoaders.INDEX_36.getCrc());
    }

    public static void setConsoleText(String string_0) {
        Class179.aString2225 = string_0;
        Class179.anInt2220 = Class179.aString2225.length();
    }
}
