package com.jagex;

public class RSMesh {

    public int version = 12;
    public int vertexCount;
    public int maxDepth;
    public int faceCount;
    public byte priority;
    public int texturedFaceCount;
    public byte[] textureRenderTypes;
    public int[] vertexX;
    public int[] vertexY;
    public int[] vertexZ;
    public short[] triangleX;
    public short[] triangleY;
    public short[] triangleZ;
    public int[] vertexSkins;
    public byte[] faceType;
    public byte[] facePriorities;
    public byte[] faceAlphas;
    public int[] textureSkins;
    public short[] faceTextures;
    public short[] faceColor;
    public byte[] texturePos;
    public short[] texTriX;
    public short[] texTriY;
    public short[] texTriZ;
    public int[] particleDirectionX;
    public int[] particleDirectionY;
    public int[] particleDirectionZ;
    public byte[] particleLifespanX;
    public byte[] particleLifespanY;
    public int[] particleLifespanZ;
    public int[] texturePrimaryColor;
    public int[] textureSecondaryColor;
    public ParticleEmitterConfig[] particleConfig;
    public SurfaceSkin[] surfaceSkins;
    public VertexNormal[] isolatedVertexNormals;
    public short[] aShortArray1980;
    public short[] aShortArray1981;

    RSMesh(byte[] data) {
        if (data[data.length - 1] == -1 && data[data.length - 2] == -1) {
            decodeNewFormat(data);
        } else {
            decodeOldFormat(data);
        }

    }

    public RSMesh(RSMesh[] arr_1, int i_2) {
        vertexCount = 0;
        faceCount = 0;
        texturedFaceCount = 0;
        int i_3 = 0;
        int i_4 = 0;
        int i_5 = 0;
        boolean bool_6 = false;
        boolean bool_7 = false;
        boolean bool_8 = false;
        boolean bool_9 = false;
        boolean bool_10 = false;
        boolean bool_11 = false;
        priority = -1;

        int i_12;
        for (i_12 = 0; i_12 < i_2; i_12++) {
            RSMesh rsmesh_22 = arr_1[i_12];
            if (rsmesh_22 != null) {
                vertexCount += rsmesh_22.vertexCount;
                faceCount += rsmesh_22.faceCount;
                texturedFaceCount += rsmesh_22.texturedFaceCount;
                if (rsmesh_22.particleConfig != null) {
                    i_3 += rsmesh_22.particleConfig.length;
                }

                if (rsmesh_22.surfaceSkins != null) {
                    i_4 += rsmesh_22.surfaceSkins.length;
                }

                if (rsmesh_22.isolatedVertexNormals != null) {
                    i_5 += rsmesh_22.isolatedVertexNormals.length;
                }

                bool_6 |= rsmesh_22.faceType != null;
                if (rsmesh_22.facePriorities != null) {
                    bool_7 = true;
                } else {
                    if (priority == -1) {
                        priority = rsmesh_22.priority;
                    }

                    if (priority != rsmesh_22.priority) {
                        bool_7 = true;
                    }
                }

                bool_8 |= rsmesh_22.faceAlphas != null;
                bool_9 |= rsmesh_22.texturePos != null;
                bool_10 |= rsmesh_22.faceTextures != null;
                bool_11 |= rsmesh_22.textureSkins != null;
            }
        }

        vertexX = new int[vertexCount];
        vertexY = new int[vertexCount];
        vertexZ = new int[vertexCount];
        vertexSkins = new int[vertexCount];
        aShortArray1980 = new short[vertexCount];
        triangleX = new short[faceCount];
        triangleY = new short[faceCount];
        triangleZ = new short[faceCount];
        if (bool_6) {
            faceType = new byte[faceCount];
        }

        if (bool_7) {
            facePriorities = new byte[faceCount];
        }

        if (bool_8) {
            faceAlphas = new byte[faceCount];
        }

        if (bool_9) {
            texturePos = new byte[faceCount];
        }

        faceColor = new short[faceCount];
        if (bool_10) {
            faceTextures = new short[faceCount];
        }

        if (bool_11) {
            textureSkins = new int[faceCount];
        }

        aShortArray1981 = new short[faceCount];
        if (texturedFaceCount > 0) {
            textureRenderTypes = new byte[texturedFaceCount];
            texTriX = new short[texturedFaceCount];
            texTriY = new short[texturedFaceCount];
            texTriZ = new short[texturedFaceCount];
            particleDirectionX = new int[texturedFaceCount];
            particleDirectionY = new int[texturedFaceCount];
            particleDirectionZ = new int[texturedFaceCount];
            particleLifespanX = new byte[texturedFaceCount];
            particleLifespanY = new byte[texturedFaceCount];
            particleLifespanZ = new int[texturedFaceCount];
            texturePrimaryColor = new int[texturedFaceCount];
            textureSecondaryColor = new int[texturedFaceCount];
        }

        if (i_5 > 0) {
            isolatedVertexNormals = new VertexNormal[i_5];
        }

        if (i_3 > 0) {
            particleConfig = new ParticleEmitterConfig[i_3];
        }

        if (i_4 > 0) {
            surfaceSkins = new SurfaceSkin[i_4];
        }

        vertexCount = 0;
        faceCount = 0;
        texturedFaceCount = 0;
        i_3 = 0;
        i_4 = 0;
        i_5 = 0;

        int i_16;
        for (i_12 = 0; i_12 < i_2; i_12++) {
            short s_13 = (short) (1 << i_12);
            RSMesh rsmesh_14 = arr_1[i_12];
            if (rsmesh_14 != null) {
                int i_15;
                if (rsmesh_14.isolatedVertexNormals != null) {
                    for (i_15 = 0; i_15 < rsmesh_14.isolatedVertexNormals.length; i_15++) {
                        VertexNormal class84_21 = rsmesh_14.isolatedVertexNormals[i_15];
                        isolatedVertexNormals[i_5++] = class84_21.method1459(class84_21.anInt809 + faceCount);
                    }
                }

                for (i_15 = 0; i_15 < rsmesh_14.faceCount; i_15++) {
                    if (bool_6 && rsmesh_14.faceType != null) {
                        faceType[faceCount] = rsmesh_14.faceType[i_15];
                    }

                    if (bool_7) {
                        if (rsmesh_14.facePriorities != null) {
                            facePriorities[faceCount] = rsmesh_14.facePriorities[i_15];
                        } else {
                            facePriorities[faceCount] = rsmesh_14.priority;
                        }
                    }

                    if (bool_8 && rsmesh_14.faceAlphas != null) {
                        faceAlphas[faceCount] = rsmesh_14.faceAlphas[i_15];
                    }

                    if (bool_10) {
                        if (rsmesh_14.faceTextures != null) {
                            faceTextures[faceCount] = rsmesh_14.faceTextures[i_15];
                        } else {
                            faceTextures[faceCount] = -1;
                        }
                    }

                    if (bool_11) {
                        if (rsmesh_14.textureSkins != null) {
                            textureSkins[faceCount] = rsmesh_14.textureSkins[i_15];
                        } else {
                            textureSkins[faceCount] = -1;
                        }
                    }

                    triangleX[faceCount] = (short) method2657(rsmesh_14, rsmesh_14.triangleX[i_15], s_13);
                    triangleY[faceCount] = (short) method2657(rsmesh_14, rsmesh_14.triangleY[i_15], s_13);
                    triangleZ[faceCount] = (short) method2657(rsmesh_14, rsmesh_14.triangleZ[i_15], s_13);
                    aShortArray1981[faceCount] = s_13;
                    faceColor[faceCount] = rsmesh_14.faceColor[i_15];
                    ++faceCount;
                }

                if (rsmesh_14.particleConfig != null) {
                    for (i_15 = 0; i_15 < rsmesh_14.particleConfig.length; i_15++) {
                        i_16 = method2657(rsmesh_14, rsmesh_14.particleConfig[i_15].faceX, s_13);
                        int i_17 = method2657(rsmesh_14, rsmesh_14.particleConfig[i_15].faceY, s_13);
                        int i_18 = method2657(rsmesh_14, rsmesh_14.particleConfig[i_15].faceZ, s_13);
                        particleConfig[i_3] = rsmesh_14.particleConfig[i_15].method1488(i_16, i_17, i_18);
                        ++i_3;
                    }
                }

                if (rsmesh_14.surfaceSkins != null) {
                    for (i_15 = 0; i_15 < rsmesh_14.surfaceSkins.length; i_15++) {
                        i_16 = method2657(rsmesh_14, rsmesh_14.surfaceSkins[i_15].anInt2119, s_13);
                        surfaceSkins[i_4] = rsmesh_14.surfaceSkins[i_15].method2911(i_16);
                        ++i_4;
                    }
                }
            }
        }

        i_12 = 0;
        maxDepth = vertexCount;

        for (int i_23 = 0; i_23 < i_2; i_23++) {
            short s_19 = (short) (1 << i_23);
            RSMesh rsmesh_20 = arr_1[i_23];
            if (rsmesh_20 != null) {
                for (i_16 = 0; i_16 < rsmesh_20.faceCount; i_16++) {
                    if (bool_9) {
                        texturePos[i_12++] = (byte) (rsmesh_20.texturePos != null && rsmesh_20.texturePos[i_16] != -1 ? texturedFaceCount + rsmesh_20.texturePos[i_16] : -1);
                    }
                }

                for (i_16 = 0; i_16 < rsmesh_20.texturedFaceCount; i_16++) {
                    byte b_24 = textureRenderTypes[texturedFaceCount] = rsmesh_20.textureRenderTypes[i_16];
                    if (b_24 == 0) {
                        texTriX[texturedFaceCount] = (short) method2657(rsmesh_20, rsmesh_20.texTriX[i_16], s_19);
                        texTriY[texturedFaceCount] = (short) method2657(rsmesh_20, rsmesh_20.texTriY[i_16], s_19);
                        texTriZ[texturedFaceCount] = (short) method2657(rsmesh_20, rsmesh_20.texTriZ[i_16], s_19);
                    }

                    if (b_24 >= 1 && b_24 <= 3) {
                        texTriX[texturedFaceCount] = rsmesh_20.texTriX[i_16];
                        texTriY[texturedFaceCount] = rsmesh_20.texTriY[i_16];
                        texTriZ[texturedFaceCount] = rsmesh_20.texTriZ[i_16];
                        particleDirectionX[texturedFaceCount] = rsmesh_20.particleDirectionX[i_16];
                        particleDirectionY[texturedFaceCount] = rsmesh_20.particleDirectionY[i_16];
                        particleDirectionZ[texturedFaceCount] = rsmesh_20.particleDirectionZ[i_16];
                        particleLifespanX[texturedFaceCount] = rsmesh_20.particleLifespanX[i_16];
                        particleLifespanY[texturedFaceCount] = rsmesh_20.particleLifespanY[i_16];
                        particleLifespanZ[texturedFaceCount] = rsmesh_20.particleLifespanZ[i_16];
                    }

                    if (b_24 == 2) {
                        texturePrimaryColor[texturedFaceCount] = rsmesh_20.texturePrimaryColor[i_16];
                        textureSecondaryColor[texturedFaceCount] = rsmesh_20.textureSecondaryColor[i_16];
                    }

                    ++texturedFaceCount;
                }
            }
        }

    }

    public RSMesh(int i_1, int i_2, int i_3) {
        vertexX = new int[i_1];
        vertexY = new int[i_1];
        vertexZ = new int[i_1];
        vertexSkins = new int[i_1];
        triangleX = new short[i_2];
        triangleY = new short[i_2];
        triangleZ = new short[i_2];
        faceType = new byte[i_2];
        facePriorities = new byte[i_2];
        faceAlphas = new byte[i_2];
        texturePos = new byte[i_2];
        faceColor = new short[i_2];
        faceTextures = new short[i_2];
        textureSkins = new int[i_2];
        if (i_3 > 0) {
            textureRenderTypes = new byte[i_3];
            texTriX = new short[i_3];
            texTriY = new short[i_3];
            texTriZ = new short[i_3];
            particleDirectionX = new int[i_3];
            particleDirectionY = new int[i_3];
            particleDirectionZ = new int[i_3];
            particleLifespanX = new byte[i_3];
            particleLifespanY = new byte[i_3];
            particleLifespanZ = new int[i_3];
            texturePrimaryColor = new int[i_3];
            textureSecondaryColor = new int[i_3];
        }

    }

    public static RSMesh decodeMesh(Index index_0, int i_1) {
        byte[] bytes_3 = index_0.getFile(i_1, 0);
        return bytes_3 == null ? null : new RSMesh(bytes_3);
    }

    int method2657(RSMesh rsmesh_1, int i_2, short s_3) {
        int i_4 = rsmesh_1.vertexX[i_2];
        int i_5 = rsmesh_1.vertexY[i_2];
        int i_6 = rsmesh_1.vertexZ[i_2];

        for (int i_7 = 0; i_7 < vertexCount; i_7++) {
            if (i_4 == vertexX[i_7] && i_5 == vertexY[i_7] && i_6 == vertexZ[i_7]) {
                aShortArray1980[i_7] |= s_3;
                return i_7;
            }
        }

        vertexX[vertexCount] = i_4;
        vertexY[vertexCount] = i_5;
        vertexZ[vertexCount] = i_6;
        aShortArray1980[vertexCount] = s_3;
        vertexSkins[vertexCount] = rsmesh_1.vertexSkins != null ? rsmesh_1.vertexSkins[i_2] : -1;
        return vertexCount++;
    }

    void decodeNewFormat(byte[] data) {
        Packet buffer1 = new Packet(data);
        Packet buffer2 = new Packet(data);
        Packet buffer3 = new Packet(data);
        Packet buffer4 = new Packet(data);
        Packet buffer5 = new Packet(data);
        Packet buffer6 = new Packet(data);
        Packet buffer7 = new Packet(data);
        buffer1.index = data.length - 23;
        vertexCount = buffer1.readUnsignedShort();
        faceCount = buffer1.readUnsignedShort();
        texturedFaceCount = buffer1.readUnsignedByte();
        int i_9 = buffer1.readUnsignedByte();
        boolean hasFaceRenderTypes = (i_9 & 0x1) == 1;
        boolean hasParticleEffects = (i_9 & 0x2) == 2;
        boolean hasBillboards = (i_9 & 0x4) == 4;
        boolean bool_13 = (i_9 & 0x8) == 8;
        if (bool_13) {
            buffer1.index -= 7;
            version = buffer1.readUnsignedByte();
            buffer1.index += 6;
        }

        int modelPriority = buffer1.readUnsignedByte();
        int i_15 = buffer1.readUnsignedByte();
        int i_16 = buffer1.readUnsignedByte();
        int i_17 = buffer1.readUnsignedByte();
        int modelSkins = buffer1.readUnsignedByte();
        int i_19 = buffer1.readUnsignedShort();
        int i_20 = buffer1.readUnsignedShort();
        int i_21 = buffer1.readUnsignedShort();
        int i_22 = buffer1.readUnsignedShort();
        int i_23 = buffer1.readUnsignedShort();
        int textureCount = 0;
        int i_25 = 0;
        int i_26 = 0;
        int i_27;
        if (texturedFaceCount > 0) {
            textureRenderTypes = new byte[texturedFaceCount];
            buffer1.index = 0;

            for (i_27 = 0; i_27 < texturedFaceCount; i_27++) {
                byte b_28 = textureRenderTypes[i_27] = buffer1.readByte();
                if (b_28 == 0) {
                    ++textureCount;
                }

                if (b_28 >= 1 && b_28 <= 3) {
                    ++i_25;
                }

                if (b_28 == 2) {
                    ++i_26;
                }
            }
        }

        i_27 = texturedFaceCount;
        int i_59 = i_27;
        i_27 += vertexCount;
        int i_29 = i_27;
        if (hasFaceRenderTypes) {
            i_27 += faceCount;
        }

        int i_30 = i_27;
        i_27 += faceCount;
        int i_31 = i_27;
        if (modelPriority == 255) {
            i_27 += faceCount;
        }

        int i_32 = i_27;
        if (i_16 == 1) {
            i_27 += faceCount;
        }

        int i_33 = i_27;
        if (modelSkins == 1) {
            i_27 += vertexCount;
        }

        int i_34 = i_27;
        if (i_15 == 1) {
            i_27 += faceCount;
        }

        int i_35 = i_27;
        i_27 += i_22;
        int i_36 = i_27;
        if (i_17 == 1) {
            i_27 += faceCount * 2;
        }

        int i_37 = i_27;
        i_27 += i_23;
        int i_38 = i_27;
        i_27 += faceCount * 2;
        int i_39 = i_27;
        i_27 += i_19;
        int i_40 = i_27;
        i_27 += i_20;
        int i_41 = i_27;
        i_27 += i_21;
        int simple_tex_pmn_offset = i_27;
        i_27 += textureCount * 6;
        int i_43 = i_27;
        i_27 += i_25 * 6;
        byte b_44 = 6;
        if (version == 14) {
            b_44 = 7;
        } else if (version >= 15) {
            b_44 = 9;
        }

        int i_45 = i_27;
        i_27 += i_25 * b_44;
        int i_46 = i_27;
        i_27 += i_25;
        int i_47 = i_27;
        i_27 += i_25;
        int i_48 = i_27;
        i_27 = i_26 * 2 + i_27 + i_25;
        vertexX = new int[vertexCount];
        vertexY = new int[vertexCount];
        vertexZ = new int[vertexCount];
        triangleX = new short[faceCount];
        triangleY = new short[faceCount];
        triangleZ = new short[faceCount];
        if (modelSkins == 1) {
            vertexSkins = new int[vertexCount];
        }

        if (hasFaceRenderTypes) {
            faceType = new byte[faceCount];
        }

        if (modelPriority == 255) {
            facePriorities = new byte[faceCount];
        } else {
            priority = (byte) modelPriority;
        }

        if (i_15 == 1) {
            faceAlphas = new byte[faceCount];
        }

        if (i_16 == 1) {
            textureSkins = new int[faceCount];
        }

        if (i_17 == 1) {
            faceTextures = new short[faceCount];
        }

        if (i_17 == 1 && texturedFaceCount > 0) {
            texturePos = new byte[faceCount];
        }

        faceColor = new short[faceCount];
        if (texturedFaceCount > 0) {
            texTriX = new short[texturedFaceCount];
            texTriY = new short[texturedFaceCount];
            texTriZ = new short[texturedFaceCount];
            if (i_25 > 0) {
                particleDirectionX = new int[i_25];
                particleDirectionY = new int[i_25];
                particleDirectionZ = new int[i_25];
                particleLifespanX = new byte[i_25];
                particleLifespanY = new byte[i_25];
                particleLifespanZ = new int[i_25];
            }

            if (i_26 > 0) {
                texturePrimaryColor = new int[i_26];
                textureSecondaryColor = new int[i_26];
            }
        }

        buffer1.index = i_59;
        buffer2.index = i_39;
        buffer3.index = i_40;
        buffer4.index = i_41;
        buffer5.index = i_33;
        int i_50 = 0;
        int i_51 = 0;
        int i_52 = 0;

        for (int i_53 = 0; i_53 < vertexCount; i_53++) {
            int offsetFlags = buffer1.readUnsignedByte();
            int vertextOffsetX = 0;
            if ((offsetFlags & 0x1) != 0) {
                vertextOffsetX = buffer2.readSignedSmart();
            }

            int vertextOffsetY = 0;
            if ((offsetFlags & 0x2) != 0) {
                vertextOffsetY = buffer3.readSignedSmart();
            }

            int vertetxOffsetZ = 0;
            if ((offsetFlags & 0x4) != 0) {
                vertetxOffsetZ = buffer4.readSignedSmart();
            }

            vertexX[i_53] = i_50 + vertextOffsetX;
            vertexY[i_53] = i_51 + vertextOffsetY;
            vertexZ[i_53] = i_52 + vertetxOffsetZ;
            i_50 = vertexX[i_53];
            i_51 = vertexY[i_53];
            i_52 = vertexZ[i_53];
            if (modelSkins == 1) {
                vertexSkins[i_53] = buffer5.readUnsignedByte();
            }
        }

        buffer1.index = i_38;
        buffer2.index = i_29;
        buffer3.index = i_31;
        buffer4.index = i_34;
        buffer5.index = i_32;
        buffer6.index = i_36;
        buffer7.index = i_37;

        for (int i_53 = 0; i_53 < faceCount; i_53++) {
            faceColor[i_53] = (short) buffer1.readUnsignedShort();
            if (hasFaceRenderTypes) {
                faceType[i_53] = buffer2.readByte();
            }

            if (modelPriority == 255) {
                facePriorities[i_53] = buffer3.readByte();
            }

            if (i_15 == 1) {
                faceAlphas[i_53] = buffer4.readByte();
            }

            if (i_16 == 1) {
                textureSkins[i_53] = buffer5.readUnsignedByte();
            }

            if (i_17 == 1) {
                faceTextures[i_53] = (short) (buffer6.readUnsignedShort() - 1);
            }

            if (texturePos != null) {
                if (faceTextures[i_53] != -1) {
                    texturePos[i_53] = (byte) (buffer7.readUnsignedByte() - 1);
                } else {
                    texturePos[i_53] = -1;
                }
            }
        }

        maxDepth = -1;
        buffer1.index = i_35;
        buffer2.index = i_30;
        calculateMaxDepth(buffer1, buffer2);
        buffer1.index = simple_tex_pmn_offset;
        buffer2.index = i_43;
        buffer3.index = i_45;
        buffer4.index = i_46;
        buffer5.index = i_47;
        buffer6.index = i_48;
        decodeTexturedTriangles(buffer1, buffer2, buffer3, buffer4, buffer5, buffer6);
        buffer1.index = i_27;
        if (hasParticleEffects) {
            int emitterCount = buffer1.readUnsignedByte();
            if (emitterCount > 0) {
                particleConfig = new ParticleEmitterConfig[emitterCount];

                for (int i = 0; i < emitterCount; i++) {
                    int particleId = buffer1.readUnsignedShort();
                    int faceIdx = buffer1.readUnsignedShort();
                    byte b_60;
                    if (modelPriority == 255) {
                        b_60 = facePriorities[faceIdx];
                    } else {
                        b_60 = (byte) modelPriority;
                    }

                    particleConfig[i] = new ParticleEmitterConfig(particleId, triangleX[faceIdx], triangleY[faceIdx], triangleZ[faceIdx], b_60);
                }
            }

            int surfaceSkinCount = buffer1.readUnsignedByte();
            if (surfaceSkinCount > 0) {
                surfaceSkins = new SurfaceSkin[surfaceSkinCount];

                for (int i = 0; i < surfaceSkinCount; i++) {
                    int x = buffer1.readUnsignedShort();
                    int y = buffer1.readUnsignedShort();
                    surfaceSkins[i] = new SurfaceSkin(x, y);
                }
            }
        }

        if (hasBillboards) {
            int i_53 = buffer1.readUnsignedByte();
            if (i_53 > 0) {
                isolatedVertexNormals = new VertexNormal[i_53];

                for (int i = 0; i < i_53; i++) {
                    int vertextOffsetX = buffer1.readUnsignedShort();
                    int vertextOffsetY = buffer1.readUnsignedShort();
                    int vertetxOffsetZ = buffer1.readUnsignedByte();
                    byte b_58 = buffer1.readByte();
                    isolatedVertexNormals[i] = new VertexNormal(vertextOffsetX, vertextOffsetY, vertetxOffsetZ, b_58);
                }
            }
        }

    }

    void calculateMaxDepth(Packet rsbytebuffer_1, Packet rsbytebuffer_2) {
        short s_3 = 0;
        short s_4 = 0;
        short s_5 = 0;
        short s_6 = 0;

        for (int i_7 = 0; i_7 < faceCount; i_7++) {
            int i_8 = rsbytebuffer_2.readUnsignedByte();
            if (i_8 == 1) {
                s_3 = (short) (rsbytebuffer_1.readSignedSmart() + s_6);
                s_4 = (short) (rsbytebuffer_1.readSignedSmart() + s_3);
                s_5 = (short) (rsbytebuffer_1.readSignedSmart() + s_4);
                s_6 = s_5;
                triangleX[i_7] = s_3;
                triangleY[i_7] = s_4;
                triangleZ[i_7] = s_5;
                if (s_3 > maxDepth) {
                    maxDepth = s_3;
                }

                if (s_4 > maxDepth) {
                    maxDepth = s_4;
                }

                if (s_5 > maxDepth) {
                    maxDepth = s_5;
                }
            }

            if (i_8 == 2) {
                s_4 = s_5;
                s_5 = (short) (rsbytebuffer_1.readSignedSmart() + s_6);
                s_6 = s_5;
                triangleX[i_7] = s_3;
                triangleY[i_7] = s_4;
                triangleZ[i_7] = s_5;
                if (s_5 > maxDepth) {
                    maxDepth = s_5;
                }
            }

            if (i_8 == 3) {
                s_3 = s_5;
                s_5 = (short) (rsbytebuffer_1.readSignedSmart() + s_6);
                s_6 = s_5;
                triangleX[i_7] = s_3;
                triangleY[i_7] = s_4;
                triangleZ[i_7] = s_5;
                if (s_5 > maxDepth) {
                    maxDepth = s_5;
                }
            }

            if (i_8 == 4) {
                short s_9 = s_3;
                s_3 = s_4;
                s_4 = s_9;
                s_5 = (short) (rsbytebuffer_1.readSignedSmart() + s_6);
                s_6 = s_5;
                triangleX[i_7] = s_3;
                triangleY[i_7] = s_9;
                triangleZ[i_7] = s_5;
                if (s_5 > maxDepth) {
                    maxDepth = s_5;
                }
            }
        }

        ++maxDepth;
    }

    void decodeTexturedTriangles(Packet rsbytebuffer_1, Packet rsbytebuffer_2, Packet rsbytebuffer_3, Packet rsbytebuffer_4, Packet rsbytebuffer_5, Packet rsbytebuffer_6) {
        for (int i_7 = 0; i_7 < texturedFaceCount; i_7++) {
            int i_8 = textureRenderTypes[i_7] & 0xff;
            if (i_8 == 0) {
                texTriX[i_7] = (short) rsbytebuffer_1.readUnsignedShort();
                texTriY[i_7] = (short) rsbytebuffer_1.readUnsignedShort();
                texTriZ[i_7] = (short) rsbytebuffer_1.readUnsignedShort();
            }

            if (i_8 == 1) {
                texTriX[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
                texTriY[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
                texTriZ[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
                if (version < 15) {
                    particleDirectionX[i_7] = rsbytebuffer_3.readUnsignedShort();
                    if (version < 14) {
                        particleDirectionY[i_7] = rsbytebuffer_3.readUnsignedShort();
                    } else {
                        particleDirectionY[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
                    }

                    particleDirectionZ[i_7] = rsbytebuffer_3.readUnsignedShort();
                } else {
                    particleDirectionX[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
                    particleDirectionY[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
                    particleDirectionZ[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
                }

                particleLifespanX[i_7] = rsbytebuffer_4.readByte();
                particleLifespanY[i_7] = rsbytebuffer_5.readByte();
                particleLifespanZ[i_7] = rsbytebuffer_6.readByte();
            }

            if (i_8 == 2) {
                texTriX[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
                texTriY[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
                texTriZ[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
                if (version < 15) {
                    particleDirectionX[i_7] = rsbytebuffer_3.readUnsignedShort();
                    if (version < 14) {
                        particleDirectionY[i_7] = rsbytebuffer_3.readUnsignedShort();
                    } else {
                        particleDirectionY[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
                    }

                    particleDirectionZ[i_7] = rsbytebuffer_3.readUnsignedShort();
                } else {
                    particleDirectionX[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
                    particleDirectionY[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
                    particleDirectionZ[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
                }

                particleLifespanX[i_7] = rsbytebuffer_4.readByte();
                particleLifespanY[i_7] = rsbytebuffer_5.readByte();
                particleLifespanZ[i_7] = rsbytebuffer_6.readByte();
                texturePrimaryColor[i_7] = rsbytebuffer_6.readByte();
                textureSecondaryColor[i_7] = rsbytebuffer_6.readByte();
            }

            if (i_8 == 3) {
                texTriX[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
                texTriY[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
                texTriZ[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
                if (version < 15) {
                    particleDirectionX[i_7] = rsbytebuffer_3.readUnsignedShort();
                    if (version < 14) {
                        particleDirectionY[i_7] = rsbytebuffer_3.readUnsignedShort();
                    } else {
                        particleDirectionY[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
                    }

                    particleDirectionZ[i_7] = rsbytebuffer_3.readUnsignedShort();
                } else {
                    particleDirectionX[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
                    particleDirectionY[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
                    particleDirectionZ[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
                }

                particleLifespanX[i_7] = rsbytebuffer_4.readByte();
                particleLifespanY[i_7] = rsbytebuffer_5.readByte();
                particleLifespanZ[i_7] = rsbytebuffer_6.readByte();
            }
        }

    }

    public int method2662(int i_1, int i_2, int i_3) {
        for (int i_4 = 0; i_4 < vertexCount; i_4++) {
            if (vertexX[i_4] == i_1 && i_2 == vertexY[i_4] && i_3 == vertexZ[i_4]) {
                return i_4;
            }
        }

        vertexX[vertexCount] = i_1;
        vertexY[vertexCount] = i_2;
        vertexZ[vertexCount] = i_3;
        maxDepth = vertexCount + 1;
        return vertexCount++;
    }

    public int method2663(int i_1, int i_2, int i_3, byte b_4, byte b_5, short s_6, byte b_7, short s_8) {
        triangleX[faceCount] = (short) i_1;
        triangleY[faceCount] = (short) i_2;
        triangleZ[faceCount] = (short) i_3;
        faceType[faceCount] = b_4;
        texturePos[faceCount] = b_5;
        faceColor[faceCount] = s_6;
        faceAlphas[faceCount] = b_7;
        faceTextures[faceCount] = s_8;
        return faceCount++;
    }

    public byte method2664() {
        if (texturedFaceCount >= 255) {
            throw new IllegalStateException();
        } else {
            textureRenderTypes[texturedFaceCount] = 3;
            texTriX[texturedFaceCount] = 0;
            texTriY[texturedFaceCount] = 32767;
            texTriZ[texturedFaceCount] = 0;
            particleDirectionX[texturedFaceCount] = 1024;
            particleDirectionY[texturedFaceCount] = 1024;
            particleDirectionZ[texturedFaceCount] = 1024;
            particleLifespanX[texturedFaceCount] = 0;
            particleLifespanY[texturedFaceCount] = 0;
            particleLifespanZ[texturedFaceCount] = 0;
            return (byte) (texturedFaceCount++);
        }
    }

    public int[][] getBones(boolean bool_1) {
        int[] ints_2 = new int[256];
        int i_3 = 0;
        int i_4 = bool_1 ? vertexCount : maxDepth;

        int i_6;
        for (int i_5 = 0; i_5 < i_4; i_5++) {
            i_6 = vertexSkins[i_5];
            if (i_6 >= 0) {
                ++ints_2[i_6];
                if (i_6 > i_3) {
                    i_3 = i_6;
                }
            }
        }

        int[][] ints_8 = new int[i_3 + 1][];

        for (i_6 = 0; i_6 <= i_3; i_6++) {
            ints_8[i_6] = new int[ints_2[i_6]];
            ints_2[i_6] = 0;
        }

        for (i_6 = 0; i_6 < i_4; i_6++) {
            int i_7 = vertexSkins[i_6];
            if (i_7 >= 0) {
                ints_8[i_7][ints_2[i_7]++] = i_6;
            }
        }

        return ints_8;
    }

    public int[][] method2666() {
        int[] ints_1 = new int[256];
        int i_2 = 0;

        int i_4;
        for (int i_3 = 0; i_3 < faceCount; i_3++) {
            i_4 = textureSkins[i_3];
            if (i_4 >= 0) {
                ++ints_1[i_4];
                if (i_4 > i_2) {
                    i_2 = i_4;
                }
            }
        }

        int[][] ints_6 = new int[i_2 + 1][];

        for (i_4 = 0; i_4 <= i_2; i_4++) {
            ints_6[i_4] = new int[ints_1[i_4]];
            ints_1[i_4] = 0;
        }

        for (i_4 = 0; i_4 < faceCount; i_4++) {
            int i_5 = textureSkins[i_4];
            if (i_5 >= 0) {
                ints_6[i_5][ints_1[i_5]++] = i_4;
            }
        }

        return ints_6;
    }

    public int[][] method2667() {
        int[] ints_1 = new int[256];
        int i_2 = 0;

        int i_4;
        for (int i_3 = 0; i_3 < isolatedVertexNormals.length; i_3++) {
            i_4 = isolatedVertexNormals[i_3].anInt811;
            if (i_4 >= 0) {
                ++ints_1[i_4];
                if (i_4 > i_2) {
                    i_2 = i_4;
                }
            }
        }

        int[][] ints_6 = new int[i_2 + 1][];

        for (i_4 = 0; i_4 <= i_2; i_4++) {
            ints_6[i_4] = new int[ints_1[i_4]];
            ints_1[i_4] = 0;
        }

        for (i_4 = 0; i_4 < isolatedVertexNormals.length; i_4++) {
            int i_5 = isolatedVertexNormals[i_4].anInt811;
            if (i_5 >= 0) {
                ints_6[i_5][ints_1[i_5]++] = i_4;
            }
        }

        return ints_6;
    }

    public void recolor(short s_1, short s_2) {
        for (int i_3 = 0; i_3 < faceCount; i_3++) {
            if (faceColor[i_3] == s_1) {
                faceColor[i_3] = s_2;
            }
        }

    }

    public void retexture(short s_1, short s_2) {
        if (faceTextures != null) {
            for (int i_3 = 0; i_3 < faceCount; i_3++) {
                if (faceTextures[i_3] == s_1) {
                    faceTextures[i_3] = s_2;
                }
            }
        }

    }

    public void method2671(int i_1, int i_2, int i_3) {
        int i_4;
        int i_5;
        int i_6;
        int i_7;
        if (i_3 != 0) {
            i_4 = Class382.SINE[i_3];
            i_5 = Class382.COSINE[i_3];

            for (i_6 = 0; i_6 < vertexCount; i_6++) {
                i_7 = i_4 * vertexY[i_6] + i_5 * vertexX[i_6] >> 14;
                vertexY[i_6] = i_5 * vertexY[i_6] - i_4 * vertexX[i_6] >> 14;
                vertexX[i_6] = i_7;
            }
        }

        if (i_1 != 0) {
            i_4 = Class382.SINE[i_1];
            i_5 = Class382.COSINE[i_1];

            for (i_6 = 0; i_6 < vertexCount; i_6++) {
                i_7 = i_5 * vertexY[i_6] - i_4 * vertexZ[i_6] >> 14;
                vertexZ[i_6] = i_4 * vertexY[i_6] + i_5 * vertexZ[i_6] >> 14;
                vertexY[i_6] = i_7;
            }
        }

        if (i_2 != 0) {
            i_4 = Class382.SINE[i_2];
            i_5 = Class382.COSINE[i_2];

            for (i_6 = 0; i_6 < vertexCount; i_6++) {
                i_7 = i_4 * vertexZ[i_6] + i_5 * vertexX[i_6] >> 14;
                vertexZ[i_6] = i_5 * vertexZ[i_6] - i_4 * vertexX[i_6] >> 14;
                vertexX[i_6] = i_7;
            }
        }

    }

    void decodeOldFormat(byte[] bytes_1) {
        boolean bool_2 = false;
        boolean bool_3 = false;
        Packet rsbytebuffer_4 = new Packet(bytes_1);
        Packet rsbytebuffer_5 = new Packet(bytes_1);
        Packet rsbytebuffer_6 = new Packet(bytes_1);
        Packet rsbytebuffer_7 = new Packet(bytes_1);
        Packet rsbytebuffer_8 = new Packet(bytes_1);
        rsbytebuffer_4.index = bytes_1.length - 18;
        vertexCount = rsbytebuffer_4.readUnsignedShort();
        faceCount = rsbytebuffer_4.readUnsignedShort();
        texturedFaceCount = rsbytebuffer_4.readUnsignedByte();
        int i_9 = rsbytebuffer_4.readUnsignedByte();
        int i_10 = rsbytebuffer_4.readUnsignedByte();
        int i_11 = rsbytebuffer_4.readUnsignedByte();
        int i_12 = rsbytebuffer_4.readUnsignedByte();
        int i_13 = rsbytebuffer_4.readUnsignedByte();
        int i_14 = rsbytebuffer_4.readUnsignedShort();
        int i_15 = rsbytebuffer_4.readUnsignedShort();
        int i_16 = rsbytebuffer_4.readUnsignedShort();
        int i_17 = rsbytebuffer_4.readUnsignedShort();
        byte b_18 = 0;
        int i_42 = b_18 + vertexCount;
        int i_20 = i_42;
        i_42 += faceCount;
        int i_21 = i_42;
        if (i_10 == 255) {
            i_42 += faceCount;
        }

        int i_22 = i_42;
        if (i_12 == 1) {
            i_42 += faceCount;
        }

        int i_23 = i_42;
        if (i_9 == 1) {
            i_42 += faceCount;
        }

        int i_24 = i_42;
        if (i_13 == 1) {
            i_42 += vertexCount;
        }

        int i_25 = i_42;
        if (i_11 == 1) {
            i_42 += faceCount;
        }

        int i_26 = i_42;
        i_42 += i_17;
        int i_27 = i_42;
        i_42 += faceCount * 2;
        int i_28 = i_42;
        i_42 += texturedFaceCount * 6;
        int i_29 = i_42;
        i_42 += i_14;
        int i_30 = i_42;
        i_42 += i_15;
        int i_10000 = i_42 + i_16;
        vertexX = new int[vertexCount];
        vertexY = new int[vertexCount];
        vertexZ = new int[vertexCount];
        triangleX = new short[faceCount];
        triangleY = new short[faceCount];
        triangleZ = new short[faceCount];
        if (texturedFaceCount > 0) {
            textureRenderTypes = new byte[texturedFaceCount];
            texTriX = new short[texturedFaceCount];
            texTriY = new short[texturedFaceCount];
            texTriZ = new short[texturedFaceCount];
        }

        if (i_13 == 1) {
            vertexSkins = new int[vertexCount];
        }

        if (i_9 == 1) {
            faceType = new byte[faceCount];
            texturePos = new byte[faceCount];
            faceTextures = new short[faceCount];
        }

        if (i_10 == 255) {
            facePriorities = new byte[faceCount];
        } else {
            priority = (byte) i_10;
        }

        if (i_11 == 1) {
            faceAlphas = new byte[faceCount];
        }

        if (i_12 == 1) {
            textureSkins = new int[faceCount];
        }

        faceColor = new short[faceCount];
        rsbytebuffer_4.index = b_18;
        rsbytebuffer_5.index = i_29;
        rsbytebuffer_6.index = i_30;
        rsbytebuffer_7.index = i_42;
        rsbytebuffer_8.index = i_24;
        int i_32 = 0;
        int i_33 = 0;
        int i_34 = 0;

        int i_35;
        int i_36;
        int i_39;
        for (i_35 = 0; i_35 < vertexCount; i_35++) {
            i_36 = rsbytebuffer_4.readUnsignedByte();
            int i_37 = 0;
            if ((i_36 & 0x1) != 0) {
                i_37 = rsbytebuffer_5.readSignedSmart();
            }

            int i_38 = 0;
            if ((i_36 & 0x2) != 0) {
                i_38 = rsbytebuffer_6.readSignedSmart();
            }

            i_39 = 0;
            if ((i_36 & 0x4) != 0) {
                i_39 = rsbytebuffer_7.readSignedSmart();
            }

            vertexX[i_35] = i_32 + i_37;
            vertexY[i_35] = i_33 + i_38;
            vertexZ[i_35] = i_34 + i_39;
            i_32 = vertexX[i_35];
            i_33 = vertexY[i_35];
            i_34 = vertexZ[i_35];
            if (i_13 == 1) {
                vertexSkins[i_35] = rsbytebuffer_8.readUnsignedByte();
            }
        }

        rsbytebuffer_4.index = i_27;
        rsbytebuffer_5.index = i_23;
        rsbytebuffer_6.index = i_21;
        rsbytebuffer_7.index = i_25;
        rsbytebuffer_8.index = i_22;

        for (i_35 = 0; i_35 < faceCount; i_35++) {
            faceColor[i_35] = (short) rsbytebuffer_4.readUnsignedShort();
            if (i_9 == 1) {
                i_36 = rsbytebuffer_5.readUnsignedByte();
                if ((i_36 & 0x1) == 1) {
                    faceType[i_35] = 1;
                    bool_2 = true;
                } else {
                    faceType[i_35] = 0;
                }

                if ((i_36 & 0x2) == 2) {
                    texturePos[i_35] = (byte) (i_36 >> 2);
                    faceTextures[i_35] = faceColor[i_35];
                    faceColor[i_35] = 127;
                    if (faceTextures[i_35] != -1) {
                        bool_3 = true;
                    }
                } else {
                    texturePos[i_35] = -1;
                    faceTextures[i_35] = -1;
                }
            }

            if (i_10 == 255) {
                facePriorities[i_35] = rsbytebuffer_6.readByte();
            }

            if (i_11 == 1) {
                faceAlphas[i_35] = rsbytebuffer_7.readByte();
            }

            if (i_12 == 1) {
                textureSkins[i_35] = rsbytebuffer_8.readUnsignedByte();
            }
        }

        maxDepth = -1;
        rsbytebuffer_4.index = i_26;
        rsbytebuffer_5.index = i_20;
        short s_43 = 0;
        short s_44 = 0;
        short s_45 = 0;
        short s_46 = 0;

        int i_40;
        for (i_39 = 0; i_39 < faceCount; i_39++) {
            i_40 = rsbytebuffer_5.readUnsignedByte();
            if (i_40 == 1) {
                s_43 = (short) (rsbytebuffer_4.readSignedSmart() + s_46);
                s_44 = (short) (rsbytebuffer_4.readSignedSmart() + s_43);
                s_45 = (short) (rsbytebuffer_4.readSignedSmart() + s_44);
                s_46 = s_45;
                triangleX[i_39] = s_43;
                triangleY[i_39] = s_44;
                triangleZ[i_39] = s_45;
                if (s_43 > maxDepth) {
                    maxDepth = s_43;
                }

                if (s_44 > maxDepth) {
                    maxDepth = s_44;
                }

                if (s_45 > maxDepth) {
                    maxDepth = s_45;
                }
            }

            if (i_40 == 2) {
                s_44 = s_45;
                s_45 = (short) (rsbytebuffer_4.readSignedSmart() + s_46);
                s_46 = s_45;
                triangleX[i_39] = s_43;
                triangleY[i_39] = s_44;
                triangleZ[i_39] = s_45;
                if (s_45 > maxDepth) {
                    maxDepth = s_45;
                }
            }

            if (i_40 == 3) {
                s_43 = s_45;
                s_45 = (short) (rsbytebuffer_4.readSignedSmart() + s_46);
                s_46 = s_45;
                triangleX[i_39] = s_43;
                triangleY[i_39] = s_44;
                triangleZ[i_39] = s_45;
                if (s_45 > maxDepth) {
                    maxDepth = s_45;
                }
            }

            if (i_40 == 4) {
                short s_41 = s_43;
                s_43 = s_44;
                s_44 = s_41;
                s_45 = (short) (rsbytebuffer_4.readSignedSmart() + s_46);
                s_46 = s_45;
                triangleX[i_39] = s_43;
                triangleY[i_39] = s_41;
                triangleZ[i_39] = s_45;
                if (s_45 > maxDepth) {
                    maxDepth = s_45;
                }
            }
        }

        ++maxDepth;
        rsbytebuffer_4.index = i_28;

        for (i_39 = 0; i_39 < texturedFaceCount; i_39++) {
            textureRenderTypes[i_39] = 0;
            texTriX[i_39] = (short) rsbytebuffer_4.readUnsignedShort();
            texTriY[i_39] = (short) rsbytebuffer_4.readUnsignedShort();
            texTriZ[i_39] = (short) rsbytebuffer_4.readUnsignedShort();
        }

        if (texturePos != null) {
            boolean bool_47 = false;

            for (i_40 = 0; i_40 < faceCount; i_40++) {
                int i_48 = texturePos[i_40] & 0xff;
                if (i_48 != 255) {
                    if (triangleX[i_40] == (texTriX[i_48] & 0xffff) && triangleY[i_40] == (texTriY[i_48] & 0xffff) && triangleZ[i_40] == (texTriZ[i_48] & 0xffff)) {
                        texturePos[i_40] = -1;
                    } else {
                        bool_47 = true;
                    }
                }
            }

            if (!bool_47) {
                texturePos = null;
            }
        }

        if (!bool_3) {
            faceTextures = null;
        }

        if (!bool_2) {
            faceType = null;
        }

    }

    public void upscale() {
        int i_2;
        for (i_2 = 0; i_2 < vertexCount; i_2++) {
            vertexX[i_2] <<= 2;
            vertexY[i_2] <<= 2;
            vertexZ[i_2] <<= 2;
        }

        if (texturedFaceCount > 0 && particleDirectionX != null) {
            for (i_2 = 0; i_2 < particleDirectionX.length; i_2++) {
                particleDirectionX[i_2] <<= 2;
                particleDirectionY[i_2] <<= 2;
                if (textureRenderTypes[i_2] != 1) {
                    particleDirectionZ[i_2] <<= 2;
                }
            }
        }

    }

    public void translate(int dx, int dy, int dz) {
        for (int i = 0; i < vertexCount; i++) {
            vertexX[i] += dx;
            vertexY[i] += dy;
            vertexZ[i] += dz;
        }

    }

}
