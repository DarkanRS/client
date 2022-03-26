package com.jagex;

public class ParticleProducerDefinition {

    static LRUCache aClass229_533 = new LRUCache(64);
    public int[] anIntArray562;
    public short minimumAngleH;

    public short maximumAngleH;

    public short minimumAngleV;

    public short maximumAngleV;

    public int minimumSpeed;

    public int maximumSpeed;

    public int anInt542;

    public int anInt569;

    public int maximumSize;

    public int minimumSize;
    public int minimumLifetime;
    public int maximumLifetime;
    public int minimumParticleRate;
    public int maximumParticleRate;
    public int[] anIntArray559;
    public int[] anIntArray561;
    public int anInt591 = -2;
    public int anInt600 = -2;
    public int anInt557;
    public int textureId = -1;
    public int anInt573 = -1;
    public int fadeColor;
    public boolean activeFirst = true;
    public int anInt537 = -1;
    public int lifetime = -1;
    public int minimumSetting;
    public boolean periodic = true;
    public int endSpeed = -1;
    public boolean uniformColorVariance = true;
    public int[] anIntArray582;
    public boolean aBool572 = true;
    public int endSize = -1;
    public boolean aBool574;
    public boolean aBool534 = true;
    public boolean aBool576;
    public boolean aBool541 = true;
    public boolean aBool578;
    public int anInt565;
    public int anInt581;
    public int anInt551;
    public int anInt584;
    public int anInt585;
    public int anInt587;
    public int anInt588;
    public int anInt590;
    public int colorFadeStart;
    public int alphaFadeStart;
    public int fadeRedStep;
    public int fadeGreenStep;
    public int fadeBlueStep;
    public int startSpeedChange;
    public int fadeAlphaStep;
    public int speedStep;
    public int startSizeChange;
    public int sizeChangeStep;
    int minimumStartColor;
    int maximumStartColor;
    int colorFading = 100;
    int alphaFading = 100;
    int speedChange = 100;
    int sizeChange = 100;
    int anInt566;
    int anInt599;
    int anInt586;
    int anInt575;

    public static int method1159(Index index_0) {
        int i_2 = 0;
        if (index_0.loadFile(Class165.anInt2035)) {
            ++i_2;
        }
        if (index_0.loadFile(Class475.anInt5622)) {
            ++i_2;
        }
        if (index_0.loadFile(Class16.anInt135)) {
            ++i_2;
        }
        if (index_0.loadFile(Class16.anInt142)) {
            ++i_2;
        }
        if (index_0.loadFile(Class16.anInt137)) {
            ++i_2;
        }
        if (index_0.loadFile(BloomPreference.anInt7899)) {
            ++i_2;
        }
        if (index_0.loadFile(Class13.anInt130)) {
            ++i_2;
        }
        if (index_0.loadFile(Class16.anInt143)) {
            ++i_2;
        }
        if (index_0.loadFile(GameTipsLoader.anInt4821)) {
            ++i_2;
        }
        if (index_0.loadFile(Class16.anInt141)) {
            ++i_2;
        }
        if (index_0.loadFile(Class165.anInt2037)) {
            ++i_2;
        }
        if (index_0.loadFile(Class271.anInt3330)) {
            ++i_2;
        }
        return i_2;
    }

    public static void method1160() {
        if (Class51.anInt488 != -1) {
            SpotAnimIndexLoader.method8862(Class51.anInt488, -1, -1, false);
            Class51.anInt488 = -1;
        }
    }

    public static void method1161(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, String string_6) {
        EntityNode_Sub6 class275_sub6_8 = new EntityNode_Sub6();
        class275_sub6_8.anInt7857 = i_0;
        class275_sub6_8.anInt7859 = i_1;
        class275_sub6_8.anInt7854 = i_2;
        class275_sub6_8.anInt7858 = i_4 + client.FRAME_COUNT;
        class275_sub6_8.anInt7855 = i_3;
        class275_sub6_8.aString7860 = string_6;
        class275_sub6_8.anInt7856 = i_5;
        client.aClass457_7335.offer(class275_sub6_8);
    }

    void readValues(ByteBuf buffer, int opcode) {
        if (opcode == 1) {
            minimumAngleH = (short) buffer.readUnsignedShort();
            maximumAngleH = (short) buffer.readUnsignedShort();
            minimumAngleV = (short) buffer.readUnsignedShort();
            maximumAngleV = (short) buffer.readUnsignedShort();
            byte scale = 3;
            minimumAngleH <<= scale;
            maximumAngleH <<= scale;
            minimumAngleV <<= scale;
            maximumAngleV <<= scale;
        } else if (opcode == 2) {
            buffer.readUnsignedByte();
        } else if (opcode == 3) {
            minimumSpeed = buffer.readInt();
            maximumSpeed = buffer.readInt();
        } else if (opcode == 4) {
            anInt542 = buffer.readUnsignedByte();
            anInt569 = buffer.readByte();
        } else if (opcode == 5) {
            minimumSize = maximumSize = buffer.readUnsignedShort() << 12 << 2;
        } else if (opcode == 6) {
            minimumStartColor = buffer.readInt();
            maximumStartColor = buffer.readInt();
        } else if (opcode == 7) {
            minimumLifetime = buffer.readUnsignedShort();
            maximumLifetime = buffer.readUnsignedShort();
        } else if (opcode == 8) {
            minimumParticleRate = buffer.readUnsignedShort();
            maximumParticleRate = buffer.readUnsignedShort();
        } else {
            int i_5;
            int count;
            if (opcode == 9) {
                count = buffer.readUnsignedByte();
                anIntArray559 = new int[count];
                for (i_5 = 0; i_5 < count; i_5++) {
                    anIntArray559[i_5] = buffer.readUnsignedShort();
                }
            } else if (opcode == 10) {
                count = buffer.readUnsignedByte();
                anIntArray561 = new int[count];
                for (i_5 = 0; i_5 < count; i_5++) {
                    anIntArray561[i_5] = buffer.readUnsignedShort();
                }
            } else if (opcode == 12) {
                anInt591 = buffer.readByte();
            } else if (opcode == 13) {
                anInt600 = buffer.readByte();
            } else if (opcode == 14) {
                anInt557 = buffer.readUnsignedShort();
            } else if (opcode == 15) {
                textureId = buffer.readUnsignedShort();
            } else if (opcode == 16) {
                activeFirst = buffer.readUnsignedByte() == 1;
                anInt537 = buffer.readUnsignedShort();
                lifetime = buffer.readUnsignedShort();
                periodic = buffer.readUnsignedByte() == 1;
            } else if (opcode == 17) {
                anInt573 = buffer.readUnsignedShort();
            } else if (opcode == 18) {
                fadeColor = buffer.readInt();
            } else if (opcode == 19) {
                minimumSetting = buffer.readUnsignedByte();
            } else if (opcode == 20) {
                colorFading = buffer.readUnsignedByte();
            } else if (opcode == 21) {
                alphaFading = buffer.readUnsignedByte();
            } else if (opcode == 22) {
                endSpeed = buffer.readInt();
            } else if (opcode == 23) {
                speedChange = buffer.readUnsignedByte();
            } else if (opcode == 24) {
                uniformColorVariance = false;
            } else if (opcode == 25) {
                count = buffer.readUnsignedByte();
                anIntArray582 = new int[count];
                for (i_5 = 0; i_5 < count; i_5++) {
                    anIntArray582[i_5] = buffer.readUnsignedShort();
                }
            } else if (opcode == 26) {
                aBool572 = false;
            } else if (opcode == 27) {
                endSize = buffer.readUnsignedShort() << 12 << 2;
            } else if (opcode == 28) {
                sizeChange = buffer.readUnsignedByte();
            } else if (opcode == 29) {
                buffer.readShort();
            } else if (opcode == 30) {
                aBool574 = true;
            } else if (opcode == 31) {
                minimumSize = buffer.readUnsignedShort() << 12 << 2;
                maximumSize = buffer.readUnsignedShort() << 12 << 2;
            } else if (opcode == 32) {
                aBool534 = false;
            } else if (opcode == 33) {
                aBool576 = true;
            } else if (opcode == 34) {
                aBool541 = false;
            }
        }
    }

    void init() {
        if (anInt591 > -2 || anInt600 > -2) {
            aBool578 = true;
        }
        anInt565 = minimumStartColor >> 16 & 0xff;
        anInt566 = maximumStartColor >> 16 & 0xff;
        anInt581 = anInt566 - anInt565;
        anInt551 = minimumStartColor >> 8 & 0xff;
        anInt599 = maximumStartColor >> 8 & 0xff;
        anInt584 = anInt599 - anInt551;
        anInt585 = minimumStartColor & 0xff;
        anInt586 = maximumStartColor & 0xff;
        anInt587 = anInt586 - anInt585;
        anInt588 = minimumStartColor >> 24 & 0xff;
        anInt575 = maximumStartColor >> 24 & 0xff;
        anInt590 = anInt575 - anInt588;
        if (fadeColor != 0) {
            colorFadeStart = colorFading * maximumLifetime / 100;
            alphaFadeStart = alphaFading * maximumLifetime / 100;
            if (colorFadeStart == 0) {
                colorFadeStart = 1;
            }
            fadeRedStep = ((fadeColor >> 16 & 0xff) - (anInt581 / 2 + anInt565) << 8) / colorFadeStart;
            fadeGreenStep = ((fadeColor >> 8 & 0xff) - (anInt584 / 2 + anInt551) << 8) / colorFadeStart;
            fadeBlueStep = ((fadeColor & 0xff) - (anInt587 / 2 + anInt585) << 8) / colorFadeStart;
            if (alphaFadeStart == 0) {
                alphaFadeStart = 1;
            }
            fadeAlphaStep = ((fadeColor >> 24 & 0xff) - (anInt590 / 2 + anInt588) << 8) / alphaFadeStart;
            fadeRedStep += fadeRedStep > 0 ? -4 : 4;
            fadeGreenStep += fadeGreenStep > 0 ? -4 : 4;
            fadeBlueStep += fadeBlueStep > 0 ? -4 : 4;
            fadeAlphaStep += fadeAlphaStep > 0 ? -4 : 4;
        }
        if (endSpeed != -1) {
            startSpeedChange = maximumLifetime * speedChange / 100;
            if (startSpeedChange == 0) {
                startSpeedChange = 1;
            }
            speedStep = (endSpeed - ((maximumSpeed - minimumSpeed) / 2 + minimumSpeed)) / startSpeedChange;
        }
        if (endSize != -1) {
            startSizeChange = sizeChange * maximumLifetime / 100;
            if (startSizeChange == 0) {
                startSizeChange = 1;
            }
            sizeChangeStep = (endSize - ((maximumSize - minimumSize) / 2 + minimumSize)) / startSizeChange;
        }
    }

    void decode(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            readValues(rsbytebuffer_1, i_3);
        }
    }
}
