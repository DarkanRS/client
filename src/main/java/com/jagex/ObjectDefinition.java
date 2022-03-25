package com.jagex;

import java.io.File;
import java.io.IOException;

public class ObjectDefinition {

    public static short[] aShortArray5691 = new short[256];
    public int id;
    public String[] options;
    public byte[] types;
    public int[][] modelIds;
    public String name = "null";
    public int sizeX = 1;
    public int sizeY = 1;
    public int clipType = 2;
    public boolean blocks = true;
    public int interactable = -1;
    public boolean delayShading;
    public int occludes = -1;
    public int decorDisplacement = 64;
    public short[] modifiedColors;
    public short[] modifiedTextures;
    public boolean inverted;
    public boolean castsShadow = true;
    public boolean obstructsGround;
    public boolean ignoreAltClip;
    public int supportsItems = -1;
    public int ambientSoundId = -1;
    public int ambientSoundHearDistance;
    public int anInt5667;
    public int anInt5698;
    public int[] audioTracks;
    public int[] transformTo;
    public boolean hidden;
    public boolean aBool5703 = true;
    public boolean aBool5702 = true;
    public boolean members;
    public boolean adjustMapSceneRotation;
    public boolean hasAnimation;
    public int anInt5705 = -1;
    public int anInt5665 = -1;
    public int anInt5670 = -1;
    public int anInt5666 = -1;
    public int mapSpriteRotation;
    public int mapSpriteId = -1;
    public int ambientSoundVolume = 255;
    public boolean flipMapSprite;
    public int mapIcon = -1;
    public int[] anIntArray5707;
    public int anInt5704;
    public boolean aBool5696;
    public boolean aBool5700;
    public int anInt5684 = 960;
    public int anInt5658;
    public int anInt5708 = 256;
    public int anInt5709 = 256;
    public boolean aBool5699;
    public int anInt5694;
    public boolean aBool5711;
    LocationIndexLoader loader;
    byte groundContoured;
    int[] animations;
    int ambient;
    int contrast;
    short[] originalColors;
    short[] originalTextures;
    byte[] aByteArray5641;
    int scaleX = 128;
    int scaleY = 128;
    int scaleZ = 128;
    int offsetX;
    int offsetY;
    int offsetZ;
    int varBit = -1;
    int var = -1;
    int anInt5654 = -1;
    int[] animProbs;
    byte aByte5644;
    byte aByte5642;
    byte aByte5646;
    byte aByte5634;
    int anInt5682;
    int anInt5683;
    int anInt5710;
    IterableNodeMap aClass465_5668;

    public static void pulseSounds() {
        MeshModifier.method7042();
        MaterialProp33.method15420();
        MaterialPropTexture.method15391();
        Class335.method5961();
    }

    static PulseEvent nextPulseEvent() {
        PulseEvent class282_sub50_sub12_1 = (PulseEvent) PulseEvent.aClass477_9666.method7941();
        if (class282_sub50_sub12_1 != null) {
            class282_sub50_sub12_1.unlink();
            class282_sub50_sub12_1.method13452();
        } else {
            do {
                class282_sub50_sub12_1 = (PulseEvent) PulseEvent.PULSE_EVENT_QUEUE.method7941();
                if (class282_sub50_sub12_1 == null) {
                    return null;
                }
                if (class282_sub50_sub12_1.getTime() > Utils.time()) {
                    return null;
                }
                class282_sub50_sub12_1.unlink();
                class282_sub50_sub12_1.method13452();
            } while ((class282_sub50_sub12_1.key & -9223372036854775808L) == 0L);
        }
        return class282_sub50_sub12_1;
    }

    static byte[] method8023(File file_0, int i_1) {
        try {
            byte[] bytes_4 = new byte[i_1];
            Class353.method6208(file_0, bytes_4, i_1);
            return bytes_4;
        } catch (IOException ioexception_5) {
            return null;
        }
    }

    public int method7963(int i_1, int i_2) {
        if (aClass465_5668 == null) {
            return i_2;
        } else {
            IntNode class282_sub38_4 = (IntNode) aClass465_5668.get(i_1);
            return class282_sub38_4 == null ? i_2 : class282_sub38_4.value;
        }
    }

    void method7964(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            method7965(rsbytebuffer_1, i_3);
        }
    }

    void method7965(ByteBuf buffer, int opcode) {
        int i_4;
        int i_5;
        int i_6;
        int i_7;
        if (opcode == 1) {
            i_4 = buffer.readUnsignedByte();
            types = new byte[i_4];
            modelIds = new int[i_4][];
            for (i_5 = 0; i_5 < i_4; i_5++) {
                types[i_5] = buffer.readByte();
                i_6 = buffer.readUnsignedByte();
                modelIds[i_5] = new int[i_6];
                for (i_7 = 0; i_7 < i_6; i_7++) {
                    modelIds[i_5][i_7] = buffer.readBigSmart();
                }
            }
        } else if (opcode == 2) {
            name = buffer.readString();
        } else if (opcode == 14) {
            sizeX = buffer.readUnsignedByte();
        } else if (opcode == 15) {
            sizeY = buffer.readUnsignedByte();
        } else if (opcode == 17) {
            clipType = 0;
            blocks = false;
        } else if (opcode == 18) {
            blocks = false;
        } else if (opcode == 19) {
            interactable = buffer.readUnsignedByte();
        } else if (opcode == 21) {
            groundContoured = 1;
        } else if (opcode == 22) {
            delayShading = true;
        } else if (opcode == 23) {
            occludes = 1;
        } else if (opcode == 24) {
            i_4 = buffer.readBigSmart();
            if (i_4 != -1) {
                animations = new int[]{i_4};
            }
        } else if (opcode == 27) {
            clipType = 1;
        } else if (opcode == 28) {
            decorDisplacement = buffer.readUnsignedByte() << 2;
        } else if (opcode == 29) {
            ambient = buffer.readByte();
        } else if (opcode == 39) {
            contrast = buffer.readByte() * 5;
        } else if (opcode >= 30 && opcode < 35) {
            options[opcode - 30] = buffer.readString();
        } else if (opcode == 40) {
            i_4 = buffer.readUnsignedByte();
            originalColors = new short[i_4];
            modifiedColors = new short[i_4];
            for (i_5 = 0; i_5 < i_4; i_5++) {
                originalColors[i_5] = (short) buffer.readUnsignedShort();
                modifiedColors[i_5] = (short) buffer.readUnsignedShort();
            }
        } else if (opcode == 41) {
            i_4 = buffer.readUnsignedByte();
            originalTextures = new short[i_4];
            modifiedTextures = new short[i_4];
            for (i_5 = 0; i_5 < i_4; i_5++) {
                originalTextures[i_5] = (short) buffer.readUnsignedShort();
                modifiedTextures[i_5] = (short) buffer.readUnsignedShort();
            }
        } else if (opcode == 42) {
            i_4 = buffer.readUnsignedByte();
            aByteArray5641 = new byte[i_4];
            for (i_5 = 0; i_5 < i_4; i_5++) {
                aByteArray5641[i_5] = buffer.readByte();
            }
        } else if (opcode == 62) {
            inverted = true;
        } else if (opcode == 64) {
            castsShadow = false;
        } else if (opcode == 65) {
            scaleX = buffer.readUnsignedShort();
        } else if (opcode == 66) {
            scaleY = buffer.readUnsignedShort();
        } else if (opcode == 67) {
            scaleZ = buffer.readUnsignedShort();
        } else if (opcode == 69) {
            buffer.readUnsignedByte();
        } else if (opcode == 70) {
            offsetX = buffer.readShort() << 2;
        } else if (opcode == 71) {
            offsetY = buffer.readShort() << 2;
        } else if (opcode == 72) {
            offsetZ = buffer.readShort() << 2;
        } else if (opcode == 73) {
            obstructsGround = true;
        } else if (opcode == 74) {
            ignoreAltClip = true;
        } else if (opcode == 75) {
            supportsItems = buffer.readUnsignedByte();
        } else if (opcode != 77 && opcode != 92) {
            if (opcode == 78) {
                ambientSoundId = buffer.readUnsignedShort();
                ambientSoundHearDistance = buffer.readUnsignedByte();
            } else if (opcode == 79) {
                anInt5667 = buffer.readUnsignedShort();
                anInt5698 = buffer.readUnsignedShort();
                ambientSoundHearDistance = buffer.readUnsignedByte();
                i_4 = buffer.readUnsignedByte();
                audioTracks = new int[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    audioTracks[i_5] = buffer.readUnsignedShort();
                }
            } else if (opcode == 81) {
                groundContoured = 2;
                anInt5654 = buffer.readUnsignedByte() * 256;
            } else if (opcode == 82) {
                hidden = true;
            } else if (opcode == 88) {
                aBool5703 = false;
            } else if (opcode == 89) {
                aBool5702 = false;
            } else if (opcode == 91) {
                members = true;
            } else if (opcode == 93) {
                groundContoured = 3;
                anInt5654 = buffer.readUnsignedShort();
            } else if (opcode == 94) {
                groundContoured = 4;
            } else if (opcode == 95) {
                groundContoured = 5;
                anInt5654 = buffer.readShort();
            } else if (opcode == 97) {
                adjustMapSceneRotation = true;
            } else if (opcode == 98) {
                hasAnimation = true;
            } else if (opcode == 99) {
                anInt5705 = buffer.readUnsignedByte();
                anInt5665 = buffer.readUnsignedShort();
            } else if (opcode == 100) {
                anInt5670 = buffer.readUnsignedByte();
                anInt5666 = buffer.readUnsignedShort();
            } else if (opcode == 101) {
                mapSpriteRotation = buffer.readUnsignedByte();
            } else if (opcode == 102) {
                mapSpriteId = buffer.readUnsignedShort();
            } else if (opcode == 103) {
                occludes = 0;
            } else if (opcode == 104) {
                ambientSoundVolume = buffer.readUnsignedByte();
            } else if (opcode == 105) {
                flipMapSprite = true;
            } else if (opcode == 106) {
                i_4 = buffer.readUnsignedByte();
                i_5 = 0;
                animations = new int[i_4];
                animProbs = new int[i_4];
                for (i_6 = 0; i_6 < i_4; i_6++) {
                    animations[i_6] = buffer.readBigSmart();
                    i_5 += animProbs[i_6] = buffer.readUnsignedByte();
                }
                for (i_6 = 0; i_6 < i_4; i_6++) {
                    animProbs[i_6] = animProbs[i_6] * 65535 / i_5;
                }
            } else if (opcode == 107) {
                mapIcon = buffer.readUnsignedShort();
            } else if (opcode >= 150 && opcode < 155) {
                options[opcode - 150] = buffer.readString();
                if (!loader.showOptions) {
                    options[opcode - 150] = null;
                }
            } else if (opcode == 160) {
                i_4 = buffer.readUnsignedByte();
                anIntArray5707 = new int[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    anIntArray5707[i_5] = buffer.readUnsignedShort();
                }
            } else if (opcode == 162) {
                groundContoured = 3;
                anInt5654 = buffer.readInt();
            } else if (opcode == 163) {
                aByte5644 = buffer.readByte();
                aByte5642 = buffer.readByte();
                aByte5646 = buffer.readByte();
                aByte5634 = buffer.readByte();
            } else if (opcode == 164) {
                anInt5682 = buffer.readShort();
            } else if (opcode == 165) {
                anInt5683 = buffer.readShort();
            } else if (opcode == 166) {
                anInt5710 = buffer.readShort();
            } else if (opcode == 167) {
                anInt5704 = buffer.readUnsignedShort();
            } else if (opcode == 168) {
                aBool5696 = true;
            } else if (opcode == 169) {
                aBool5700 = true;
            } else if (opcode == 170) {
                anInt5684 = buffer.readSmart();
            } else if (opcode == 171) {
                anInt5658 = buffer.readSmart();
            } else if (opcode == 173) {
                anInt5708 = buffer.readUnsignedShort();
                anInt5709 = buffer.readUnsignedShort();
            } else if (opcode == 177) {
                aBool5699 = true;
            } else if (opcode == 178) {
                anInt5694 = buffer.readUnsignedByte();
            } else if (opcode == 189) {
                aBool5711 = true;
            } else if (opcode == 249) {
                i_4 = buffer.readUnsignedByte();
                if (aClass465_5668 == null) {
                    i_5 = Utils.nextPowerOfTwo(i_4);
                    aClass465_5668 = new IterableNodeMap(i_5);
                }
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    boolean bool_9 = buffer.readUnsignedByte() == 1;
                    i_7 = buffer.read24BitUnsignedInteger();
                    Object obj_8;
                    if (bool_9) {
                        obj_8 = new ObjectNode(buffer.readString());
                    } else {
                        obj_8 = new IntNode(buffer.readInt());
                    }
                    aClass465_5668.put((Node) obj_8, i_7);
                }
            }
        } else {
            varBit = buffer.readUnsignedShort();
            if (varBit == 65535) {
                varBit = -1;
            }
            var = buffer.readUnsignedShort();
            if (var == 65535) {
                var = -1;
            }
            i_4 = -1;
            if (opcode == 92) {
                i_4 = buffer.readBigSmart();
            }
            i_5 = buffer.readUnsignedByte();
            transformTo = new int[i_5 + 2];
            for (i_6 = 0; i_6 <= i_5; i_6++) {
                transformTo[i_6] = buffer.readBigSmart();
            }
            transformTo[i_5 + 1] = i_4;
        }
    }

    void method7966() {
        if (interactable == -1) {
            interactable = 0;
            if (types != null && types.length == 1 && types[0] == ObjectType.SCENERY_INTERACT.id) {
                interactable = 1;
            }
            for (int i_2 = 0; i_2 < 5; i_2++) {
                if (options[i_2] != null) {
                    interactable = 1;
                    break;
                }
            }
        }
        if (supportsItems == -1) {
            supportsItems = clipType != 0 ? 1 : 0;
        }
        if (method7967() || hasAnimation || transformTo != null) {
            aBool5699 = true;
        }
    }

    public boolean method7967() {
        return animations != null;
    }

    public boolean method7968() {
        if (modelIds == null) {
            return true;
        } else {
            boolean bool_2 = true;
            Index index_3 = loader.meshIndex;
            synchronized (loader.meshIndex) {
                for (int i_4 = 0; i_4 < modelIds.length; i_4++) {
                    for (int i_5 = 0; i_5 < modelIds[i_4].length; i_5++) {
                        bool_2 &= loader.meshIndex.load(modelIds[i_4][i_5], 0);
                    }
                }
                return bool_2;
            }
        }
    }

    MeshRasterizer method7971(AbstractRenderer class505, int i, int i_35_, int i_36_, Class476 class476) {
        int i_38_ = 64 + ambient;
        int i_39_ = 850 + contrast;
        int i_40_ = i;
        boolean bool = inverted || i_35_ == (ObjectType.WALL_WHOLE_CORNER.id) && i_36_ > 3;
        if (bool)
            i |= 0x10;
        if (i_36_ == 0) {
            if (scaleX != 128 || offsetX != 0)
                i |= 0x1;
            if (scaleZ != 128 || offsetZ != 0)
                i |= 0x4;
        } else
            i |= 0xd;
        if (scaleY != 128 || offsetY != 0)
            i |= 0x2;
        if (originalColors != null)
            i |= 0x4000;
        if (originalTextures != null)
            i |= 0x8000;
        if (aByte5634 != 0)
            i |= 0x80000;
        MeshRasterizer class528 = null;
        if (types != null) {
            int i_41_ = -1;
            for (int i_42_ = 0; i_42_ < types.length; i_42_++) {
                if (i_35_ == types[i_42_]) {
                    i_41_ = i_42_;
                    break;
                }
            }
            if (i_41_ == -1)
                return null;
            int[] is = ((class476 != null && class476.anIntArray5626 != null) ? class476.anIntArray5626 : modelIds[i_41_]);
            int i_43_ = is.length;
            if (i_43_ > 0) {
                long l = class505.rendererId;
                for (int i_44_ = 0; i_44_ < i_43_; i_44_++)
                    l = is[i_44_] + 67783L * l;
                synchronized (loader.aClass229_5614) {
                    class528 = ((MeshRasterizer) loader.aClass229_5614.get(l));
                }
                if (class528 != null) {
                    if (i_38_ != class528.c())
                        i |= 0x1000;
                    if (i_39_ != class528.Z())
                        i |= 0x2000;
                }
                if (class528 == null || class505.method8452(class528.m(), i) != 0) {
                    int i_45_ = i | 0x1f01f;
                    if (class528 != null)
                        i_45_ = class505.method8546(i_45_, class528.m());
                    RSMesh class157 = null;
                    synchronized (loader.aClass157Array5616) {
                        for (int i_46_ = 0; i_46_ < i_43_; i_46_++) {
                            synchronized (loader.meshIndex) {
                                class157 = RSMesh.decodeMesh((loader.meshIndex), is[i_46_]);
                            }
                            if (class157 == null) {
                                MeshRasterizer class528_47_ = null;
                                return class528_47_;
                            }
                            if (class157.version < 13)
                                class157.upscale();
                            if (i_43_ > 1)
                                loader.aClass157Array5616[i_46_] = class157;
                        }
                        if (i_43_ > 1)
                            class157 = new RSMesh((loader.aClass157Array5616), i_43_);
                    }
                    class528 = class505.createMeshRasterizer(class157, i_45_, (loader.anInt5617), i_38_, i_39_);
                    synchronized (loader.aClass229_5614) {
                        loader.aClass229_5614.put(class528, l);
                    }
                }
            }
        }
        if (class528 == null)
            return null;
        MeshRasterizer class528_48_ = class528.method11289((byte) 0, i, true);
        if (i_38_ != class528.c())
            class528_48_.p(i_38_);
        if (i_39_ != class528.Z())
            class528_48_.Q(i_39_);
        if (bool)
            class528_48_.wa();
        if (ObjectType.STRAIGHT_INSIDE_WALL_DEC.id == i_35_ && i_36_ > 3) {
            class528_48_.S(2048);
            class528_48_.ia(180, 0, -180);
        }
        i_36_ &= 0x3;
        if (i_36_ == 1)
            class528_48_.S(4096);
        else if (i_36_ == 2)
            class528_48_.S(8192);
        else if (i_36_ == 3)
            class528_48_.S(12288);
        if (originalColors != null) {
            short[] is;
            if (class476 != null && class476.aShortArray5628 != null)
                is = class476.aShortArray5628;
            else
                is = modifiedColors;
            for (int i_49_ = 0; i_49_ < originalColors.length; i_49_++) {
                if (aByteArray5641 != null && i_49_ < aByteArray5641.length)
                    class528_48_.X(originalColors[i_49_], (aShortArray5691[(aByteArray5641[i_49_] & 0xff)]));
                else
                    class528_48_.X(originalColors[i_49_], is[i_49_]);
            }
        }
        if (originalTextures != null) {
            short[] is;
            if (class476 != null && class476.aShortArray5625 != null)
                is = class476.aShortArray5625;
            else
                is = modifiedTextures;
            for (int i_50_ = 0; i_50_ < originalTextures.length; i_50_++)
                class528_48_.W(originalTextures[i_50_], is[i_50_]);
        }
        if (aByte5634 != 0)
            class528_48_.PA(aByte5644, aByte5642, aByte5646, aByte5634 & 0xff);
        if (scaleX != 128 || scaleY != 128 || scaleZ != 128)
            class528_48_.oa(scaleX, scaleY, scaleZ);
        if (offsetX != 0 || offsetY != 0 || offsetZ != 0)
            class528_48_.ia(offsetX, offsetY, offsetZ);
        class528_48_.KA(i_40_);
        return class528_48_;
    }

    public String method7973(int i_1, String string_2) {
        if (aClass465_5668 == null) {
            return string_2;
        } else {
            ObjectNode class282_sub47_4 = (ObjectNode) aClass465_5668.get(i_1);
            return class282_sub47_4 == null ? string_2 : (String) class282_sub47_4.anObject8068;
        }
    }

    public boolean hasSound() {
        if (transformTo == null) {
            return ambientSoundId != -1 || audioTracks != null;
        } else {
            for (int i_2 = 0; i_2 < transformTo.length; i_2++) {
                if (transformTo[i_2] != -1) {
                    ObjectDefinition objectdefinitions_3 = loader.getObjectDefs(transformTo[i_2]);
                    if (objectdefinitions_3.ambientSoundId != -1 || objectdefinitions_3.audioTracks != null) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public boolean method7976() {
        return animations != null && animations.length > 1;
    }

    public int method7977() {
        if (animations != null) {
            if (animations.length <= 1) {
                return animations[0];
            }
            int i_2 = (int) (Math.random() * 65535.0D);
            for (int i_3 = 0; i_3 < animations.length; i_3++) {
                if (i_2 <= animProbs[i_3]) {
                    return animations[i_3];
                }
                i_2 -= animProbs[i_3];
            }
        }
        return -1;
    }

    public boolean method7979(int i_1) {
        if (animations != null && i_1 != -1) {
            for (int i_3 = 0; i_3 < animations.length; i_3++) {
                if (animations[i_3] == i_1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean method7987(int i_1) {
        if (modelIds == null) {
            return true;
        } else {
            boolean bool_3 = true;
            Index index_4 = loader.meshIndex;
            synchronized (loader.meshIndex) {
                for (int i_5 = 0; i_5 < types.length; i_5++) {
                    if (types[i_5] == i_1) {
                        for (int i_6 = 0; i_6 < modelIds[i_5].length; i_6++) {
                            if (!loader.meshIndex.load(modelIds[i_5][i_6], 0)) {
                                bool_3 = false;
                            }
                        }
                    }
                }
                return bool_3;
            }
        }
    }

    public int[] method8008() {
        return animations;
    }

    public synchronized Class452 method8010(AbstractRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, Ground class390_5, Ground class390_6, int i_7, int i_8, int i_9, boolean bool_10, Class476 class476_11) {
        int i_31 = i_3;
        if (Class485.method8201(i_31)) {
            i_31 = ObjectType.STRAIGHT_INSIDE_WALL_DEC.id;
        }
        long long_13 = (i_31 << 3) + i_4 + (id << 10);
        long_13 |= graphicalrenderer_1.rendererId << 29;
        if (class476_11 != null) {
            long_13 |= class476_11.aLong5627 << 32;
        }
        int i_15 = i_2;
        if (groundContoured == 3) {
            i_15 = i_2 | 0x7;
        } else {
            if (groundContoured != 0 || anInt5683 != 0) {
                i_15 = i_2 | 0x2;
            }
            if (anInt5682 != 0) {
                i_15 |= 0x1;
            }
            if (anInt5710 != 0) {
                i_15 |= 0x4;
            }
        }
        if (bool_10) {
            i_15 |= 0x40000;
        }
        LRUCache softcache_17 = loader.aClass229_5615;
        Class452 class452_16;
        synchronized (loader.aClass229_5615) {
            class452_16 = (Class452) loader.aClass229_5615.get(long_13);
        }
        MeshRasterizer meshrasterizer_24 = (MeshRasterizer) (class452_16 != null ? class452_16.anObject5443 : null);
        Shadow class282_sub50_sub17_18 = null;
        if (meshrasterizer_24 != null && graphicalrenderer_1.method8452(meshrasterizer_24.m(), i_15) == 0) {
            class282_sub50_sub17_18 = (Shadow) class452_16.anObject5444;
            if (bool_10 && class282_sub50_sub17_18 == null) {
                class282_sub50_sub17_18 = (Shadow) (class452_16.anObject5444 = meshrasterizer_24.ga(null));
            }
        } else {
            if (meshrasterizer_24 != null) {
                i_15 = graphicalrenderer_1.method8546(i_15, meshrasterizer_24.m());
            }
            int i_19 = i_15;
            if (i_31 == ObjectType.SCENERY_INTERACT.id && i_4 > 3) {
                i_19 = i_15 | 0x5;
            }
            meshrasterizer_24 = method7971(graphicalrenderer_1, i_19, i_31, i_4, class476_11);
            if (meshrasterizer_24 == null) {
                return null;
            }
            if (i_31 == ObjectType.SCENERY_INTERACT.id && i_4 > 3) {
                meshrasterizer_24.f(2048);
            }
            if (bool_10) {
                class282_sub50_sub17_18 = meshrasterizer_24.ga(null);
            }
            meshrasterizer_24.KA(i_15);
            class452_16 = new Class452(meshrasterizer_24, class282_sub50_sub17_18);
            LRUCache softcache_20 = loader.aClass229_5615;
            synchronized (loader.aClass229_5615) {
                loader.aClass229_5615.put(class452_16, long_13);
            }
        }
        boolean bool_25 = groundContoured != 0 && (class390_5 != null || class390_6 != null);
        boolean bool_21 = anInt5682 != 0 || anInt5683 != 0 || anInt5710 != 0;
        if (!bool_25 && !bool_21) {
            meshrasterizer_24 = meshrasterizer_24.method11289((byte) 0, i_2, true);
        } else {
            meshrasterizer_24 = meshrasterizer_24.method11289((byte) 0, i_15, true);
            if (bool_25 && anInt5654 < 16384) {
                meshrasterizer_24.pa(groundContoured, anInt5654, class390_5, class390_6, i_7, i_8, i_9);
            }
            if (bool_21) {
                meshrasterizer_24.ia(anInt5682, anInt5683, anInt5710);
            }
            meshrasterizer_24.KA(i_2);
        }
        loader.aClass452_5620.anObject5443 = meshrasterizer_24;
        loader.aClass452_5620.anObject5444 = class282_sub50_sub17_18;
        return loader.aClass452_5620;
    }

    public synchronized MeshRasterizer method8012(AbstractRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, Ground class390_5, Ground class390_6, int i_7, int i_8, int i_9, Animation animation_10, Class476 class476_11) {
        int i_31 = i_3;
        if (Class485.method8201(i_31)) {
            i_31 = ObjectType.STRAIGHT_INSIDE_WALL_DEC.id;
        }
        long long_13 = (i_31 << 3) + i_4 + (id << 10);
        long_13 |= graphicalrenderer_1.rendererId << 29;
        if (class476_11 != null) {
            long_13 |= class476_11.aLong5627 << 32;
        }
        if (animation_10 != null) {
            i_2 |= animation_10.method7640();
        }
        if (groundContoured == 3) {
            i_2 |= 0x7;
        } else {
            if (groundContoured != 0 || anInt5683 != 0) {
                i_2 |= 0x2;
            }
            if (anInt5682 != 0) {
                i_2 |= 0x1;
            }
            if (anInt5710 != 0) {
                i_2 |= 0x4;
            }
        }
        if (i_31 == ObjectType.SCENERY_INTERACT.id && i_4 > 3) {
            i_2 |= 0x5;
        }
        LRUCache softcache_17 = loader.aClass229_5619;
        MeshRasterizer meshrasterizer_16;
        synchronized (loader.aClass229_5619) {
            meshrasterizer_16 = (MeshRasterizer) loader.aClass229_5619.get(long_13);
        }
        if (meshrasterizer_16 == null || graphicalrenderer_1.method8452(meshrasterizer_16.m(), i_2) != 0) {
            if (meshrasterizer_16 != null) {
                i_2 = graphicalrenderer_1.method8546(i_2, meshrasterizer_16.m());
            }
            meshrasterizer_16 = method7971(graphicalrenderer_1, i_2, i_31, i_4, class476_11);
            if (meshrasterizer_16 == null) {
                return null;
            }
            softcache_17 = loader.aClass229_5619;
            synchronized (loader.aClass229_5619) {
                loader.aClass229_5619.put(meshrasterizer_16, long_13);
            }
        }
        boolean bool_18 = false;
        if (animation_10 != null) {
            meshrasterizer_16 = meshrasterizer_16.method11289((byte) 1, i_2, true);
            bool_18 = true;
            animation_10.rasterize(meshrasterizer_16, i_4 & 0x3);
        }
        if (i_31 == ObjectType.SCENERY_INTERACT.id && i_4 > 3) {
            if (!bool_18) {
                meshrasterizer_16 = meshrasterizer_16.method11289((byte) 3, i_2, true);
                bool_18 = true;
            }
            meshrasterizer_16.f(2048);
        }
        if (groundContoured != 0) {
            if (!bool_18) {
                meshrasterizer_16 = meshrasterizer_16.method11289((byte) 3, i_2, true);
                bool_18 = true;
            }
            meshrasterizer_16.pa(groundContoured, anInt5654, class390_5, class390_6, i_7, i_8, i_9);
        }
        if (anInt5682 != 0 || anInt5683 != 0 || anInt5710 != 0) {
            if (!bool_18) {
                meshrasterizer_16 = meshrasterizer_16.method11289((byte) 3, i_2, true);
                bool_18 = true;
            }
            meshrasterizer_16.ia(anInt5682, anInt5683, anInt5710);
        }
        if (bool_18) {
            meshrasterizer_16.KA(i_2);
        }
        return meshrasterizer_16;
    }

    public ObjectDefinition getMultiLoc(VarProvider vars) {
        int index = -1;
        if (varBit != -1) {
            index = vars.getVarBit(varBit);
        } else if (var != -1) {
            index = vars.getVar(var);
        }
        if (index >= 0 && index < transformTo.length - 1 && transformTo[index] != -1) {
            return loader.getObjectDefs(transformTo[index]);
        } else {
            int id = transformTo[transformTo.length - 1];
            return id != -1 ? loader.getObjectDefs(id) : null;
        }
    }
}
