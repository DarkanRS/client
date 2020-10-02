package com.jagex;

import java.awt.*;

public class Class383 implements Interface41 {

    static int anInt4664;

    Index aClass317_4663;

    String aString4662;

    Class383(Index index_1) {
        aClass317_4663 = index_1;
        aString4662 = "huffman";
    }

    public static AreadSound method6509(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        if (Class393.preferences.soundEffectVolume.method12714() != 0 && i_1 != 0 && Class260.SOUNDS_SIZE < 50 && i_0 != -1) {
            AreadSound class268_7 = new AreadSound((byte) 1, i_0, i_1, i_2, i_3, i_4, i_5, null);
            Class260.SOUNDS[++Class260.SOUNDS_SIZE - 1] = class268_7;
            return class268_7;
        } else {
            return null;
        }
    }

    public static void method6511() {
        for (VorbisNode class282_sub37_1 = (VorbisNode) Class492.INDEX36_FILE_CACHE.method7750(); class282_sub37_1 != null; class282_sub37_1 = (VorbisNode) Class492.INDEX36_FILE_CACHE.method7751()) {
            if (!class282_sub37_1.aBool7996) {
                CutsceneObject.method1563(class282_sub37_1.fileId);
            } else {
                class282_sub37_1.aBool7996 = false;
            }
        }
    }

    static Class350 method6512(ByteBuf rsbytebuffer_0) {
        Class356 class356_2 = Class356.values()[rsbytebuffer_0.readUnsignedByte()];
        Class353 class353_3 = Class353.values()[rsbytebuffer_0.readUnsignedByte()];
        int i_4 = rsbytebuffer_0.readShort();
        int i_5 = rsbytebuffer_0.readShort();
        int i_6 = rsbytebuffer_0.readUnsignedShort();
        int i_7 = rsbytebuffer_0.readUnsignedShort();
        int i_8 = rsbytebuffer_0.readShort();
        int i_9 = rsbytebuffer_0.readBigSmart();
        int i_10 = rsbytebuffer_0.readInt();
        return new Class350(class356_2, class353_3, i_4, i_5, i_6, i_7, i_8, i_9, i_10);
    }

    public static int method6513(int i_0, int i_1) {
        if (QuickchatFiller.ENTITY_DEFAULTS.profilingModel == -1) {
            return 1;
        } else {
            if (i_0 != Class393.preferences.currentToolkit.getValue()) {
                Class231.method3914(i_0, LocalizedText.PROFILING.translate(Class223.CURRENT_LANGUAGE), true);
                if (Class393.preferences.currentToolkit.getValue() != i_0) {
                    return -1;
                }
            }
            try {
                Dimension dimension_4 = Class351.gameCanvas.getSize();
                Class446.method7447(LocalizedText.PROFILING.translate(Class223.CURRENT_LANGUAGE), true, Renderers.CURRENT_RENDERER, Class16.aFontRenderer_144, Class16.aClass414_139);
                RSMesh rsmesh_5 = RSMesh.decodeMesh(IndexLoaders.MESH_INDEX, QuickchatFiller.ENTITY_DEFAULTS.profilingModel);
                long long_6 = Utils.time();
                Renderers.CURRENT_RENDERER.L();
                client.aClass294_7457.method5223(0.0F, 256.0F, 0.0F);
                Renderers.CURRENT_RENDERER.method8457(client.aClass294_7457);
                Matrix44 matrix44_8 = Renderers.CURRENT_RENDERER.method8449();
                matrix44_8.method6531((dimension_4.width / 2), (dimension_4.height / 2), 512.0F, 512.0F, IndexLoaders.MAP_REGION_DECODER.method4544(), IndexLoaders.MAP_REGION_DECODER.method4522(), dimension_4.width, dimension_4.height);
                Renderers.CURRENT_RENDERER.method8424(matrix44_8);
                Renderers.CURRENT_RENDERER.IA(1.0F);
                Renderers.CURRENT_RENDERER.m(16777215, 0.5F, 0.5F, 20.0F, -50.0f, 30.0F);
                MeshRasterizer meshrasterizer_9 = Renderers.CURRENT_RENDERER.createMeshRasterizer(rsmesh_5, 2048, 64, 64, 768);
                int i_10 = 0;
                label43:
                for (int i_11 = 0; i_11 < 500; i_11++) {
                    Renderers.CURRENT_RENDERER.ba(3, 0);
                    for (int i_12 = 15; i_12 >= 0; --i_12) {
                        for (int i_13 = 0; i_13 <= i_12; i_13++) {
                            client.aClass294_7169.method5223(((int) (512.0F * (i_13 - i_12 / 2.0F))), 0.0F, ((i_12 + 1) * 512));
                            meshrasterizer_9.method11282(client.aClass294_7169, null, 0);
                            ++i_10;
                            if (Utils.time() - long_6 >= i_1) {
                                break label43;
                            }
                        }
                    }
                }
                Renderers.CURRENT_RENDERER.method8395();
                long long_14 = (i_10 * 1000) / (Utils.time() - long_6);
                Renderers.CURRENT_RENDERER.ba(3, 0);
                int i_3 = (int) long_14;
                return i_3;
            } catch (Throwable throwable_16) {
                throwable_16.printStackTrace();
                return -1;
            }
        }
    }

    static void method6514(int i_0, int i_1) {
        if (MovingAnimation.isInterfaceLoaded(i_0, null)) {
            Class151.method2591(Interface.INTERFACES[i_0].components, i_1);
        }
    }

    public static String method6515(CharSequence charsequence_0) {
        return KeyPressInputSubscriber.method3754(charsequence_0, null);
    }

    @Override
    public Class445 method234() {
        return Class445.aClass445_5380;
    }

    @Override
    public int getCompletion() {
        return aClass317_4663.method5628(aString4662) ? 100 : 0;
    }

    @Override
    public int method231() {
        return aClass317_4663.method5628(aString4662) ? 100 : 0;
    }

    @Override
    public Class445 method235() {
        return Class445.aClass445_5380;
    }

    @Override
    public Class445 method233() {
        return Class445.aClass445_5380;
    }

    @Override
    public Class445 method230() {
        return Class445.aClass445_5380;
    }

    @Override
    public Class445 method232() {
        return Class445.aClass445_5380;
    }
}
