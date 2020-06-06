package com.jagex;

public class HitsplatDefinitions {

    public int anInt2849 = -1;
    public int anInt2844 = 16777215;
    public boolean aBool2838;
    public int anInt2846;
    public int anInt2841 = 70;
    public int anInt2833;
    public int anInt2847 = -1;
    public int anInt2839 = -1;
    public int anInt2832;
    ScriptRunner aClass210_2850;
    int anInt2842 = -1;
    int anInt2851 = -1;
    int anInt2843 = -1;
    int anInt2845 = -1;
    String aString2840 = "";

    public static boolean method3849(int i_0) {
        return i_0 >= ObjectType.STRAIGHT_BOTTOM_EDGE_ROOF.type && i_0 <= ObjectType.STRAIGHT_BOTTOM_EDGE_CONNECT_CORNER_ROOF.type;
    }

    static void method3850(Matrix44 matrix44_0, float f_2, float f_3, float f_4, float f_5, int i_6, int i_7) {
        int i_9 = IndexLoaders.MAP_REGION_DECODER.method4522();
        int i_10 = IndexLoaders.MAP_REGION_DECODER.method4544();
        matrix44_0.method6531(f_2, f_3, f_4, f_5, i_10, i_9, i_6, i_7);
    }

    static void method3851() {
        for (CacheableNode_Sub15 class282_sub50_sub15_1 = (CacheableNode_Sub15) Class20.aClass477_182.method7941(); class282_sub50_sub15_1 != null; class282_sub50_sub15_1 = (CacheableNode_Sub15) Class20.aClass477_182.method7955()) {
            if (class282_sub50_sub15_1.anInt9769 > 1) {
                class282_sub50_sub15_1.anInt9769 = 0;
                Class20.aClass229_164.put(class282_sub50_sub15_1, ((CacheableNode_Sub7) class282_sub50_sub15_1.aClass477_9770.aCacheableNode_5629.aCacheableNode_8119).aLong9580);
                class282_sub50_sub15_1.aClass477_9770.method7935();
            }
        }

        Class20.anInt170 = 0;
        Class20.anInt169 = 0;
        Class20.aClass482_171.removeAll();
        Class20.aClass465_172.method7749();
        Class20.aClass477_182.method7935();
        Class361.method6269(Class20.aCacheableNode_Sub7_157);
    }

    public NativeSprite method3832(AbstractRenderer graphicalrenderer_1) {
        if (anInt2851 < 0) {
            return null;
        } else {
            NativeSprite nativesprite_3 = (NativeSprite) aClass210_2850.aClass229_2664.get(anInt2851);
            if (nativesprite_3 == null) {
                method3839(graphicalrenderer_1);
                nativesprite_3 = (NativeSprite) aClass210_2850.aClass229_2664.get(anInt2851);
            }

            return nativesprite_3;
        }
    }

    void method3833(ByteBuf stream, int opcode) {
        if (opcode == 1) {
            anInt2849 = stream.readBigSmart();
        } else if (opcode == 2) {
            anInt2844 = stream.read24BitUnsignedInteger();
            aBool2838 = true;
        } else if (opcode == 3) {
            anInt2842 = stream.readBigSmart();
        } else if (opcode == 4) {
            anInt2851 = stream.readBigSmart();
        } else if (opcode == 5) {
            anInt2843 = stream.readBigSmart();
        } else if (opcode == 6) {
            anInt2845 = stream.readBigSmart();
        } else if (opcode == 7) {
            anInt2846 = stream.readShort();
        } else if (opcode == 8) {
            aString2840 = stream.readGJString();
        } else if (opcode == 9) {
            anInt2841 = stream.readUnsignedShort();
        } else if (opcode == 10) {
            anInt2833 = stream.readShort();
        } else if (opcode == 11) {
            anInt2847 = 0;
        } else if (opcode == 12) {
            anInt2839 = stream.readUnsignedByte();
        } else if (opcode == 13) {
            anInt2832 = stream.readShort();
        } else if (opcode == 14) {
            anInt2847 = stream.readUnsignedShort();
        }
    }

    public NativeSprite method3835(AbstractRenderer graphicalrenderer_1) {
        if (anInt2842 < 0) {
            return null;
        } else {
            NativeSprite nativesprite_3 = (NativeSprite) aClass210_2850.aClass229_2664.get(anInt2842);
            if (nativesprite_3 == null) {
                method3839(graphicalrenderer_1);
                nativesprite_3 = (NativeSprite) aClass210_2850.aClass229_2664.get(anInt2842);
            }

            return nativesprite_3;
        }
    }

    public NativeSprite method3836(AbstractRenderer graphicalrenderer_1) {
        if (anInt2843 < 0) {
            return null;
        } else {
            NativeSprite nativesprite_3 = (NativeSprite) aClass210_2850.aClass229_2664.get(anInt2843);
            if (nativesprite_3 == null) {
                method3839(graphicalrenderer_1);
                nativesprite_3 = (NativeSprite) aClass210_2850.aClass229_2664.get(anInt2843);
            }

            return nativesprite_3;
        }
    }

    void method3837(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }

            method3833(rsbytebuffer_1, i_3);
        }
    }

    public NativeSprite method3838(AbstractRenderer graphicalrenderer_1) {
        if (anInt2845 < 0) {
            return null;
        } else {
            NativeSprite nativesprite_3 = (NativeSprite) aClass210_2850.aClass229_2664.get(anInt2845);
            if (nativesprite_3 == null) {
                method3839(graphicalrenderer_1);
                nativesprite_3 = (NativeSprite) aClass210_2850.aClass229_2664.get(anInt2845);
            }

            return nativesprite_3;
        }
    }

    void method3839(AbstractRenderer graphicalrenderer_1) {
        Index index_3 = aClass210_2850.aClass317_2666;
        SpriteDefinitions class91_4;
        if (anInt2842 >= 0 && aClass210_2850.aClass229_2664.get(anInt2842) == null && index_3.loadFile(anInt2842)) {
            class91_4 = SpriteDefinitions.method1515(index_3, anInt2842);
            aClass210_2850.aClass229_2664.put(graphicalrenderer_1.method8444(class91_4, true), anInt2842);
        }

        if (anInt2843 >= 0 && aClass210_2850.aClass229_2664.get(anInt2843) == null && index_3.loadFile(anInt2843)) {
            class91_4 = SpriteDefinitions.method1515(index_3, anInt2843);
            aClass210_2850.aClass229_2664.put(graphicalrenderer_1.method8444(class91_4, true), anInt2843);
        }

        if (anInt2851 >= 0 && aClass210_2850.aClass229_2664.get(anInt2851) == null && index_3.loadFile(anInt2851)) {
            class91_4 = SpriteDefinitions.method1515(index_3, anInt2851);
            aClass210_2850.aClass229_2664.put(graphicalrenderer_1.method8444(class91_4, true), anInt2851);
        }

        if (anInt2845 >= 0 && aClass210_2850.aClass229_2664.get(anInt2845) == null && index_3.loadFile(anInt2845)) {
            class91_4 = SpriteDefinitions.method1515(index_3, anInt2845);
            aClass210_2850.aClass229_2664.put(graphicalrenderer_1.method8444(class91_4, true), anInt2845);
        }

    }

    public String method3844(int i_1) {
        String string_3 = aString2840;

        while (true) {
            int i_4 = string_3.indexOf("%1");
            if (i_4 < 0) {
                return string_3;
            }

            string_3 = string_3.substring(0, i_4) + HeadbarIndexLoader.method5120(i_1, false) + string_3.substring(i_4 + 2);
        }
    }

}
