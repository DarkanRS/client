package com.jagex;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

public class Node_Sub41_Sub4 extends Node_Sub41 {

    VorbisInfo aVorbisInfo9605 = new VorbisInfo();
    VorbisComment aVorbisComment9599 = new VorbisComment();
    double aDouble9604;
    int anInt9602;
    DSPState aDSPState9600;
    VorbisBlock aVorbisBlock9601;
    Class344 aClass344_9598;
    Node_Sub15_Sub1 aNode_Sub15_Sub1_9603;

    Node_Sub41_Sub4(OggStreamState oggstreamstate_1) {
        super(oggstreamstate_1);
    }

    @Override
    void method13362(OggPacket oggpacket_1) {
        if (anInt8031 < 3) {
            int i_3 = aVorbisInfo9605.headerIn(aVorbisComment9599, oggpacket_1);
            if (i_3 < 0) {
                throw new IllegalStateException("" + i_3);
            }
            if (anInt8031 == 2) {
                if (aVorbisInfo9605.channels > 2 || aVorbisInfo9605.channels < 1) {
                    throw new RuntimeException("" + aVorbisInfo9605.channels);
                }
                aDSPState9600 = new DSPState(aVorbisInfo9605);
                aVorbisBlock9601 = new VorbisBlock(aDSPState9600);
                aClass344_9598 = new Class344(aVorbisInfo9605.rate, Class253.hertz);
                aNode_Sub15_Sub1_9603 = new Node_Sub15_Sub1(aVorbisInfo9605.channels);
            }
        } else {
            if (aVorbisBlock9601.synthesis(oggpacket_1) == 0) {
                aDSPState9600.blockIn(aVorbisBlock9601);
            }
            float[][] floats_6 = aDSPState9600.pcmOut(aVorbisInfo9605.channels);
            aDouble9604 = aDSPState9600.granuleTime();
            if (aDouble9604 == -1.0) {
                aDouble9604 = (float) anInt9602 / aVorbisInfo9605.rate;
            }
            aDSPState9600.read(floats_6[0].length);
            anInt9602 += floats_6[0].length;
            Node_Sub39 class282_sub39_4 = aNode_Sub15_Sub1_9603.method14814(floats_6[0].length, aDouble9604);
            Preference_Sub20.method12805(floats_6, class282_sub39_4.aShortArrayArray8003);
            for (int i_5 = 0; i_5 < aVorbisInfo9605.channels; i_5++) {
                class282_sub39_4.aShortArrayArray8003[i_5] = aClass344_9598.method6111(class282_sub39_4.aShortArrayArray8003[i_5]);
            }
            aNode_Sub15_Sub1_9603.method14815(class282_sub39_4);
        }
    }

    public Node_Sub15_Sub1 method14845() {
        return aNode_Sub15_Sub1_9603;
    }

    @Override
    void method13364() {
        if (aVorbisBlock9601 != null) {
            aVorbisBlock9601.method6699();
        }
        if (aDSPState9600 != null) {
            aDSPState9600.method6699();
        }
        aVorbisComment9599.method6699();
        aVorbisInfo9605.method6699();
        if (aNode_Sub15_Sub1_9603 != null) {
            aNode_Sub15_Sub1_9603.method14808();
        }
    }

    int method14847() {
        return aNode_Sub15_Sub1_9603 == null ? 0 : aNode_Sub15_Sub1_9603.method14811();
    }

    @Override
    void method13363(OggPacket oggpacket_1) {
        if (anInt8031 * 1669091145 * -509226247 < 3) {
            int i_2 = aVorbisInfo9605.headerIn(aVorbisComment9599, oggpacket_1);
            if (i_2 < 0) {
                throw new IllegalStateException("" + i_2);
            }
            if (-509226247 * anInt8031 * 1669091145 == 2) {
                if (aVorbisInfo9605.channels > 2 || aVorbisInfo9605.channels < 1) {
                    throw new RuntimeException("" + aVorbisInfo9605.channels);
                }
                aDSPState9600 = new DSPState(aVorbisInfo9605);
                aVorbisBlock9601 = new VorbisBlock(aDSPState9600);
                aClass344_9598 = new Class344(aVorbisInfo9605.rate, Class253.hertz);
                aNode_Sub15_Sub1_9603 = new Node_Sub15_Sub1(aVorbisInfo9605.channels);
            }
        } else {
            if (aVorbisBlock9601.synthesis(oggpacket_1) == 0) {
                aDSPState9600.blockIn(aVorbisBlock9601);
            }
            float[][] floats_5 = aDSPState9600.pcmOut(aVorbisInfo9605.channels);
            aDouble9604 = aDSPState9600.granuleTime();
            if (aDouble9604 == -1.0) {
                aDouble9604 = (float) (anInt9602 * -1560334429 * 1938979851) / aVorbisInfo9605.rate;
            }
            aDSPState9600.read(floats_5[0].length);
            anInt9602 = (anInt9602 * -1560334429 + -1560334429 * floats_5[0].length) * 1938979851;
            Node_Sub39 class282_sub39_3 = aNode_Sub15_Sub1_9603.method14814(floats_5[0].length, aDouble9604);
            Preference_Sub20.method12805(floats_5, class282_sub39_3.aShortArrayArray8003);
            for (int i_4 = 0; i_4 < aVorbisInfo9605.channels; i_4++) {
                class282_sub39_3.aShortArrayArray8003[i_4] = aClass344_9598.method6111(class282_sub39_3.aShortArrayArray8003[i_4]);
            }
            aNode_Sub15_Sub1_9603.method14815(class282_sub39_3);
        }
    }

    @Override
    void method13366(OggPacket oggpacket_1) {
        if (anInt8031 * 1669091145 * -509226247 < 3) {
            int i_2 = aVorbisInfo9605.headerIn(aVorbisComment9599, oggpacket_1);
            if (i_2 < 0) {
                throw new IllegalStateException("" + i_2);
            }
            if (-509226247 * anInt8031 * 1669091145 == 2) {
                if (aVorbisInfo9605.channels > 2 || aVorbisInfo9605.channels < 1) {
                    throw new RuntimeException("" + aVorbisInfo9605.channels);
                }
                aDSPState9600 = new DSPState(aVorbisInfo9605);
                aVorbisBlock9601 = new VorbisBlock(aDSPState9600);
                aClass344_9598 = new Class344(aVorbisInfo9605.rate, Class253.hertz);
                aNode_Sub15_Sub1_9603 = new Node_Sub15_Sub1(aVorbisInfo9605.channels);
            }
        } else {
            if (aVorbisBlock9601.synthesis(oggpacket_1) == 0) {
                aDSPState9600.blockIn(aVorbisBlock9601);
            }
            float[][] floats_5 = aDSPState9600.pcmOut(aVorbisInfo9605.channels);
            aDouble9604 = aDSPState9600.granuleTime();
            if (aDouble9604 == -1.0) {
                aDouble9604 = (float) (anInt9602 * -1560334429 * 1938979851) / aVorbisInfo9605.rate;
            }
            aDSPState9600.read(floats_5[0].length);
            anInt9602 = (anInt9602 * -1560334429 + -1560334429 * floats_5[0].length) * 1938979851;
            Node_Sub39 class282_sub39_3 = aNode_Sub15_Sub1_9603.method14814(floats_5[0].length, aDouble9604);
            Preference_Sub20.method12805(floats_5, class282_sub39_3.aShortArrayArray8003);
            for (int i_4 = 0; i_4 < aVorbisInfo9605.channels; i_4++) {
                class282_sub39_3.aShortArrayArray8003[i_4] = aClass344_9598.method6111(class282_sub39_3.aShortArrayArray8003[i_4]);
            }
            aNode_Sub15_Sub1_9603.method14815(class282_sub39_3);
        }
    }

    @Override
    void method13365() {
        if (aVorbisBlock9601 != null) {
            aVorbisBlock9601.method6699();
        }
        if (aDSPState9600 != null) {
            aDSPState9600.method6699();
        }
        aVorbisComment9599.method6699();
        aVorbisInfo9605.method6699();
        if (aNode_Sub15_Sub1_9603 != null) {
            aNode_Sub15_Sub1_9603.method14808();
        }
    }

    double method14848() {
        double d_2 = aDouble9604;
        if (aNode_Sub15_Sub1_9603 != null) {
            d_2 = aNode_Sub15_Sub1_9603.method14819();
            if (d_2 < 0.0D) {
                d_2 = aDouble9604;
            }
        }
        return d_2 - (256.0F / Class253.hertz);
    }

    @Override
    void method13360() {
        if (aVorbisBlock9601 != null) {
            aVorbisBlock9601.method6699();
        }
        if (aDSPState9600 != null) {
            aDSPState9600.method6699();
        }
        aVorbisComment9599.method6699();
        aVorbisInfo9605.method6699();
        if (aNode_Sub15_Sub1_9603 != null) {
            aNode_Sub15_Sub1_9603.method14808();
        }
    }
}
