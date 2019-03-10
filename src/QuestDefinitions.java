public class QuestDefinitions {

    Class242 aClass242_2976;

    public String name;

    public String altName;

    int[][] varValues;

    int[][] varbitValues;

    public int anInt2958 = 0;

    public int anInt2960 = 0;

    public boolean aBool2962 = false;

    public int anInt2963;

    int[] anIntArray2955;

    public int[] anIntArray2968;

    public int[][] anIntArrayArray2966;

    public int anInt2973;

    public int anInt2977 = -1;

    public int[] anIntArray2961;

    int[] anIntArray2969;

    int[] anIntArray2970;

    public String[] aStringArray2971;

    public int[] anIntArray2964;

    int[] anIntArray2967;

    int[] anIntArray2974;

    public String[] aStringArray2975;

    IterableNodeMap aClass465_2972;

    public boolean method4093(Interface42 interface42_1, int[] ints_2, int i_3) {
        if (this.aClass242_2976.method4154(interface42_1, 1765999661) < this.anInt2973) {
            return false;
        } else {
            int i_4;
            if (this.anIntArrayArray2966 != null) {
                for (i_4 = 0; i_4 < this.anIntArrayArray2966.length; i_4++) {
                    if (ints_2[this.anIntArrayArray2966[i_4][0]] < this.anIntArrayArray2966[i_4][1]) {
                        return false;
                    }
                }
            }
            if (this.anIntArray2968 != null) {
                for (i_4 = 0; i_4 < this.anIntArray2968.length; i_4++) {
                    if (!this.aClass242_2976.method4156(this.anIntArray2968[i_4], -1396181317).method4099(interface42_1, -2060810176)) {
                        return false;
                    }
                }
            }
            int i_5;
            if (this.anIntArray2961 != null) {
                for (i_4 = 0; i_4 < this.anIntArray2961.length; i_4++) {
                    i_5 = interface42_1.method240(this.anIntArray2961[i_4], -853289836);
                    if (i_5 < this.anIntArray2969[i_4] || i_5 > this.anIntArray2970[i_4]) {
                        return false;
                    }
                }
            }
            if (this.anIntArray2964 != null) {
                for (i_4 = 0; i_4 < this.anIntArray2964.length; i_4++) {
                    i_5 = interface42_1.method241(this.anIntArray2964[i_4], -520349475);
                    if (i_5 < this.anIntArray2967[i_4] || i_5 > this.anIntArray2974[i_4]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    void method4094(RsByteBuffer rsbytebuffer_1, int i_2, int i_3) {
        if (i_2 == 1) {
            this.name = rsbytebuffer_1.readGJString(-1054894786);
        } else if (i_2 == 2) {
            this.altName = rsbytebuffer_1.readGJString(-1501893281);
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
                this.anInt2958 = rsbytebuffer_1.readUnsignedByte();
            } else if (i_2 == 7) {
                this.anInt2960 = rsbytebuffer_1.readUnsignedByte();
            } else if (i_2 == 8) {
                this.aBool2962 = true;
            } else if (i_2 == 9) {
                this.anInt2963 = rsbytebuffer_1.readUnsignedByte();
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
                this.anIntArray2968 = new int[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.anIntArray2968[i_5] = rsbytebuffer_1.readUnsignedShort();
                }
            } else if (i_2 == 14) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                this.anIntArrayArray2966 = new int[i_4][2];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.anIntArrayArray2966[i_5][0] = rsbytebuffer_1.readUnsignedByte();
                    this.anIntArrayArray2966[i_5][1] = rsbytebuffer_1.readUnsignedByte();
                }
            } else if (i_2 == 15) {
                this.anInt2973 = rsbytebuffer_1.readUnsignedShort();
            } else if (i_2 == 17) {
                this.anInt2977 = rsbytebuffer_1.readBigSmart();
            } else if (i_2 == 18) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                this.anIntArray2961 = new int[i_4];
                this.anIntArray2969 = new int[i_4];
                this.anIntArray2970 = new int[i_4];
                this.aStringArray2971 = new String[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.anIntArray2961[i_5] = rsbytebuffer_1.readInt();
                    this.anIntArray2969[i_5] = rsbytebuffer_1.readInt();
                    this.anIntArray2970[i_5] = rsbytebuffer_1.readInt();
                    this.aStringArray2971[i_5] = rsbytebuffer_1.readString();
                }
            } else if (i_2 == 19) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                this.anIntArray2964 = new int[i_4];
                this.anIntArray2967 = new int[i_4];
                this.anIntArray2974 = new int[i_4];
                this.aStringArray2975 = new String[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.anIntArray2964[i_5] = rsbytebuffer_1.readInt();
                    this.anIntArray2967[i_5] = rsbytebuffer_1.readInt();
                    this.anIntArray2974[i_5] = rsbytebuffer_1.readInt();
                    this.aStringArray2975[i_5] = rsbytebuffer_1.readString();
                }
            } else if (i_2 == 249) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                if (this.aClass465_2972 == null) {
                    i_5 = Class323.nextPowerOfTwo(i_4, -265127005);
                    this.aClass465_2972 = new IterableNodeMap(i_5);
                }
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    boolean bool_6 = rsbytebuffer_1.readUnsignedByte() == 1;
                    int i_7 = rsbytebuffer_1.read24BitUnsignedInteger();
                    Object obj_8;
                    if (bool_6) {
                        obj_8 = new Class282_Sub47(rsbytebuffer_1.readString());
                    } else {
                        obj_8 = new Class282_Sub38(rsbytebuffer_1.readInt());
                    }
                    this.aClass465_2972.put((Node) obj_8, (long) i_7);
                }
            }
        }
    }

    void method4095(byte b_1) {
        if (this.altName == null) {
            this.altName = this.name;
        }
    }

    public boolean method4098(Interface42 interface42_1, byte b_2) {
        int i_3;
        if (this.varValues != null) {
            for (i_3 = 0; i_3 < this.varValues.length; i_3++) {
                if (interface42_1.method240(this.varValues[i_3][0], -409569082) >= this.varValues[i_3][1]) {
                    return true;
                }
            }
        }
        if (this.varbitValues != null) {
            for (i_3 = 0; i_3 < this.varbitValues.length; i_3++) {
                if (interface42_1.method241(this.varbitValues[i_3][0], -1489106913) >= this.varbitValues[i_3][1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean method4099(Interface42 interface42_1, int i_2) {
        int i_3;
        if (this.varValues != null) {
            for (i_3 = 0; i_3 < this.varValues.length; i_3++) {
                if (interface42_1.method240(this.varValues[i_3][0], -585739390) >= this.varValues[i_3][2]) {
                    return true;
                }
            }
        }
        if (this.varbitValues != null) {
            for (i_3 = 0; i_3 < this.varbitValues.length; i_3++) {
                if (interface42_1.method241(this.varbitValues[i_3][0], -598279654) >= this.varbitValues[i_3][2]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean method4101(Interface42 interface42_1, byte b_2) {
        return this.aClass242_2976.method4154(interface42_1, 2095145584) >= this.anInt2973;
    }

    public boolean method4103(Interface42 interface42_1, int i_2, int i_3) {
        return this.anIntArray2968 != null && i_2 >= 0 && i_2 < this.anIntArray2968.length ? this.aClass242_2976.method4156(this.anIntArray2968[i_2], -1396181317).method4099(interface42_1, 1001789983) : false;
    }

    public boolean method4104(Interface42 interface42_1, int i_2, short s_3) {
        if (this.anIntArray2961 != null && i_2 >= 0 && i_2 < this.anIntArray2961.length) {
            int i_4 = interface42_1.method240(this.anIntArray2961[i_2], 1497520500);
            return i_4 >= this.anIntArray2969[i_2] && i_4 <= this.anIntArray2970[i_2];
        } else {
            return false;
        }
    }

    public boolean method4105(Interface42 interface42_1, int i_2, int i_3) {
        if (this.anIntArray2964 != null && i_2 >= 0 && i_2 < this.anIntArray2964.length) {
            int i_4 = interface42_1.method241(this.anIntArray2964[i_2], 1488898797);
            return i_4 >= this.anIntArray2967[i_2] && i_4 <= this.anIntArray2974[i_2];
        } else {
            return false;
        }
    }

    public String method4110(int i_1, String string_2, byte b_3) {
        if (this.aClass465_2972 == null) {
            return string_2;
        } else {
            Class282_Sub47 class282_sub47_4 = (Class282_Sub47) this.aClass465_2972.get((long) i_1);
            return class282_sub47_4 == null ? string_2 : (String) class282_sub47_4.anObject8068;
        }
    }

    public boolean method4111(int[] ints_1, int i_2, int i_3) {
        return this.anIntArrayArray2966 != null && i_2 >= 0 && i_2 < this.anIntArrayArray2966.length ? ints_1[this.anIntArrayArray2966[i_2][0]] >= this.anIntArrayArray2966[i_2][1] : false;
    }

    void method4119(RsByteBuffer rsbytebuffer_1, int i_2) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            this.method4094(rsbytebuffer_1, i_3, -379084068);
        }
    }

    public int method4135(int i_1, int i_2, byte b_3) {
        if (this.aClass465_2972 == null) {
            return i_2;
        } else {
            Class282_Sub38 class282_sub38_4 = (Class282_Sub38) this.aClass465_2972.get((long) i_1);
            return class282_sub38_4 == null ? i_2 : class282_sub38_4.anInt8002;
        }
    }

    static final void method4136(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
        String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
        if (Class96_Sub14.method14642(string_4, cs2executor_2, 718441711) != null) {
            string_4 = string_4.substring(0, string_4.length() - 1);
        }
        icomponentdefinitions_0.anObjectArray1409 = Class351.method6193(string_4, cs2executor_2, 1509347670);
        icomponentdefinitions_0.aBool1384 = true;
    }

    public static boolean isRoof(int i_0, int i_1) {
        return i_0 >= SceneObjectType.STRAIGHT_SLOPE_ROOF.type && i_0 <= SceneObjectType.STRAIGHT_FLAT_ROOF.type;
    }

    static void writeCRCs(RsBitsBuffer rsbitsbuffer_0, int i_1) {
        rsbitsbuffer_0.writeInt(IndexLoaders.ANIMATION_SKELETON_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.ANIMATION_SKIN_INDEX.getCrc());
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
        rsbitsbuffer_0.writeInt(IndexLoaders.SEQUENCES_INDEX.getCrc());
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
        rsbitsbuffer_0.writeInt(Class378.method6435(-1443123937));
        rsbitsbuffer_0.writeInt(Class468_Sub7.method12672((byte) 0));
        rsbitsbuffer_0.writeInt(IndexLoaders.CUTSCENE_INDEX.getCrc());
        rsbitsbuffer_0.writeInt(IndexLoaders.aClass317_2663.getCrc());
    }

    public static void method4140(String string_0, int i_1) {
        Class179.aString2225 = string_0;
        Class179.anInt2220 = Class179.aString2225.length();
    }
}
