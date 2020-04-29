package com.jagex;

public class IdentikitDefinition implements Definition {

    public static int[] anIntArray428 = {0, 1, 2, 3, 4, 5, 6, 14};
    public static int[] anIntArray422 = {7, 8, 9, 10, 11, 12, 13, 15};
    static int anInt430;
    static int anInt431;
    IdentiKitIndexLoader aClass31_429;
    int[] modelIds;
    short[] originalColours;
    short[] replacementColours;
    short[] originalTextures;
    short[] replacementTextures;
    int[] headModels = {-1, -1, -1, -1, -1};

    static int method912(int i_0) {
        return i_0 == 16711935 ? -1 : Class5.method294(i_0);
    }

    public static void method913(Interface interface_0, Component icomponentdefinitions_1) {
        Component icomponentdefinitions_3 = CutsceneAction_Sub23.method14682(interface_0, icomponentdefinitions_1);
        int i_4;
        int i_5;
        if (icomponentdefinitions_3 == null) {
            i_4 = Class349.anInt4083;
            i_5 = client.anInt3243 * -969250379;
        } else {
            i_4 = icomponentdefinitions_3.width;
            i_5 = icomponentdefinitions_3.height;
        }
        Class484.initSizes(icomponentdefinitions_1, i_4, i_5, false);
        Class246.method4204(icomponentdefinitions_1, i_4, i_5);
    }

    public RSMesh renderHead() {
        RSMesh[] arr_2 = new RSMesh[5];
        int i_3 = 0;
        Index index_4 = aClass31_429.aClass317_359;
        int i_5;
        synchronized (aClass31_429.aClass317_359) {
            i_5 = 0;
            while (i_5 < 5) {
                if (headModels[i_5] != -1) {
                    arr_2[i_3++] = RSMesh.decodeMesh(aClass31_429.aClass317_359, headModels[i_5]);
                }
                ++i_5;
            }
        }
        for (int i_6 = 0; i_6 < 5; i_6++) {
            if (arr_2[i_6] != null && arr_2[i_6].version < 13) {
                arr_2[i_6].upscale();
            }
        }
        RSMesh rsmesh_8 = new RSMesh(arr_2, i_3);
        if (originalColours != null) {
            for (i_5 = 0; i_5 < originalColours.length; i_5++) {
                rsmesh_8.recolor(originalColours[i_5], replacementColours[i_5]);
            }
        }
        if (originalTextures != null) {
            for (i_5 = 0; i_5 < originalTextures.length; i_5++) {
                rsmesh_8.retexture(originalTextures[i_5], replacementTextures[i_5]);
            }
        }
        return rsmesh_8;
    }

    void method897(ByteBuf buffer, int opcode) {
        if (opcode == 1) {
            buffer.readUnsignedByte();
        } else if (opcode == 2) {
            int count = buffer.readUnsignedByte();
            modelIds = new int[count];
            for (int i_5 = 0; i_5 < count; i_5++) {
                modelIds[i_5] = buffer.readBigSmart();
            }
        } else if (opcode == 40) {
            int count = buffer.readUnsignedByte();
            originalColours = new short[count];
            replacementColours = new short[count];
            for (int i_5 = 0; i_5 < count; i_5++) {
                originalColours[i_5] = (short) buffer.readUnsignedShort();
                replacementColours[i_5] = (short) buffer.readUnsignedShort();
            }
        } else if (opcode == 41) {
            int count = buffer.readUnsignedByte();
            originalTextures = new short[count];
            replacementTextures = new short[count];
            for (int i_5 = 0; i_5 < count; i_5++) {
                originalTextures[i_5] = (short) buffer.readUnsignedShort();
                replacementTextures[i_5] = (short) buffer.readUnsignedShort();
            }
        } else if (opcode >= 60 && opcode < 70) {
            headModels[opcode - 60] = buffer.readBigSmart();
        }
    }

    public boolean method898() {
        if (modelIds == null) {
            return true;
        } else {
            boolean bool_2 = true;
            Index index_3 = aClass31_429.aClass317_359;
            synchronized (aClass31_429.aClass317_359) {
                for (int i_4 = 0; i_4 < modelIds.length; i_4++) {
                    if (!aClass31_429.aClass317_359.load(modelIds[i_4], 0)) {
                        bool_2 = false;
                    }
                }
                return bool_2;
            }
        }
    }

    public RSMesh method899() {
        if (modelIds == null) {
            return null;
        } else {
            RSMesh[] arr_2 = new RSMesh[modelIds.length];
            Index index_3 = aClass31_429.aClass317_359;
            int i_4;
            synchronized (aClass31_429.aClass317_359) {
                i_4 = 0;
                while (i_4 < modelIds.length) {
                    arr_2[i_4] = RSMesh.decodeMesh(aClass31_429.aClass317_359, modelIds[i_4]);
                    ++i_4;
                }
            }
            for (int i_5 = 0; i_5 < modelIds.length; i_5++) {
                if (arr_2[i_5].version < 13) {
                    arr_2[i_5].upscale();
                }
            }
            RSMesh rsmesh_7;
            if (arr_2.length == 1) {
                rsmesh_7 = arr_2[0];
            } else {
                rsmesh_7 = new RSMesh(arr_2, arr_2.length);
            }
            if (rsmesh_7 == null) {
                return null;
            } else {
                if (originalColours != null) {
                    for (i_4 = 0; i_4 < originalColours.length; i_4++) {
                        rsmesh_7.recolor(originalColours[i_4], replacementColours[i_4]);
                    }
                }
                if (originalTextures != null) {
                    for (i_4 = 0; i_4 < originalTextures.length; i_4++) {
                        rsmesh_7.retexture(originalTextures[i_4], replacementTextures[i_4]);
                    }
                }
                return rsmesh_7;
            }
        }
    }

    public boolean method900() {
        boolean bool_2 = true;
        Index index_3 = aClass31_429.aClass317_359;
        synchronized (aClass31_429.aClass317_359) {
            for (int i_4 = 0; i_4 < 5; i_4++) {
                if (headModels[i_4] != -1 && !aClass31_429.aClass317_359.load(headModels[i_4], 0)) {
                    bool_2 = false;
                }
            }
            return bool_2;
        }
    }

    void method909(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            method897(rsbytebuffer_1, i_3);
        }
    }
}
