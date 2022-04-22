package com.jagex;

public class MidiInstrumentNode_2 extends Sound_Node_1 {
	/**
	 * Converted from MidiInstrument, could be a node for a byte buffer array for music
	 * @param audio
	 * @param i_2
	 * @param volume
	 * @param i_4
	 */
    MidiInstrumentNode_2(AudioFormatUnknown2 audio, int i_2, int volume, int i_4) {
        nodeWithAudioBuffer26 = audio;
        anInt9844 = audio.anInt9749;
        duration = audio.duration;
        aBoolNormFalse9857 = audio.aBoolNormFalse9752;
        anInt9855 = i_2;
        this.volume = volume;
        anInt9847 = i_4;
        nodeIndex = 0;
        method15332();
    }

    static int method15729(float f_0, int i_1, float[] floats_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, MidiInstrumentNode_2 class282_sub15_sub5_sub1_11, int i_12, float f_13) {
        int i_11 = i_1;
        int i_81 = i_8;
        float f_01 = f_0;
        i_6 *= 128;
        i_7 *= 128;
        if (i_12 == 0 || (i_81 = i_5 + (i_10 + 256 - i_4 + i_12) / i_12) > i_9) {
            i_81 = i_9;
        }

        i_5 <<= 1;

        int i_10001;
        for (i_81 <<= 1; i_5 < i_81; i_4 += i_12) {
            i_11 = i_4 >> 8;
            f_01 = floats_2[i_11 - 1];
            f_01 = f_01 * 256.0F + (floats_2[i_11] - f_01) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_6) >> 6;
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_7) >> 6;
        }

        if (i_12 == 0 || (i_81 = (i_5 >> 1) + (i_10 - i_4 + i_12) / i_12) > i_9) {
            i_81 = i_9;
        }

        for (i_81 <<= 1; i_5 < i_81; i_4 += i_12) {
            f_01 = f_13 * 256.0F + (floats_2[i_4 >> 8] - f_13) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_6) >> 6;
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_7) >> 6;
        }

        class282_sub15_sub5_sub1_11.nodeIndex = i_4;
        return i_5 >> 1;
    }

    static int method15731(float f_0, float[] floats_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, MidiInstrumentNode_2 class282_sub15_sub5_sub1_10) {
        int i_71 = i_7;
        float f_01 = f_0;
        i_3 >>= 8;
        i_9 >>= 8;
        i_5 <<= 2;
        i_6 <<= 2;
        i_5 *= 128;
        i_6 *= 128;
        if ((i_71 = i_3 + i_4 - (i_9 - 1)) > i_8) {
            i_71 = i_8;
        }

        i_4 <<= 1;
        i_71 <<= 1;

        int i_10001;
        for (i_71 -= 6; i_4 < i_71; ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6)) {
            f_01 = floats_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
            f_01 = floats_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
            f_01 = floats_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
            f_01 = floats_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_10001 = i_4++;
        }

        for (i_71 += 6; i_4 < i_71; ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6)) {
            f_01 = floats_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_10001 = i_4++;
        }

        class282_sub15_sub5_sub1_10.nodeIndex = i_3 << 8;
        return i_4 >> 1;
    }

    static int method15734(float f_0, int i_1, float[] floats_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, MidiInstrumentNode_2 class282_sub15_sub5_sub1_10, int i_11, float f_12) {
        int i_12 = i_1;
        int i_71 = i_7;
        float f_01 = f_0;
        i_6 *= 128;
        if (i_11 == 0 || (i_71 = i_5 + (i_11 + (i_9 + 256 - i_4)) / i_11) > i_8) {
            i_71 = i_8;
        }

        int i_10001;
        while (i_5 < i_71) {
            i_12 = i_4 >> 8;
            f_01 = floats_2[i_12 - 1];
            i_10001 = i_5++;
            ints_3[i_10001] += (int) ((f_01 * 256.0F + (floats_2[i_12] - f_01) * (i_4 & 0xff)) * i_6) >> 6;
            i_4 += i_11;
        }

        if (i_11 == 0 || (i_71 = i_5 + (i_11 + (i_9 - i_4)) / i_11) > i_8) {
            i_71 = i_8;
        }

        for (f_01 = f_12; i_5 < i_71; i_4 += i_11) {
            i_10001 = i_5++;
            ints_3[i_10001] += (int) ((f_01 * 256.0F + (floats_2[i_4 >> 8] - f_01) * (i_4 & 0xff)) * i_6) >> 6;
        }

        class282_sub15_sub5_sub1_10.nodeIndex = i_4;
        return i_5;
    }

    static int method15735(float f_0, int i_1, float[] floats_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, MidiInstrumentNode_2 class282_sub15_sub5_sub1_11, int i_12, float f_13) {
        int i_11 = i_1;
        int i_81 = i_8;
        float f_01 = f_0;
        i_6 *= 128;
        i_7 *= 128;
        class282_sub15_sub5_sub1_11.anInt9845 -= class282_sub15_sub5_sub1_11.anInt9852 * i_5;
        class282_sub15_sub5_sub1_11.anInt9850 -= class282_sub15_sub5_sub1_11.anInt9851 * i_5;
        if (i_12 == 0 || (i_81 = i_5 + (i_10 - i_4 + i_12 - 257) / i_12) > i_9) {
            i_81 = i_9;
        }

        int i_10001;
        while (i_5 < i_81) {
            i_11 = i_4 >> 8;
            f_01 = floats_2[i_11];
            i_10001 = i_5++;
            ints_3[i_10001] += (int) ((f_01 * 256.0F + (floats_2[i_11 + 1] - f_01) * (i_4 & 0xff)) * i_6) >> 6;
            i_6 += i_7;
            i_4 += i_12;
        }

        if (i_12 == 0 || (i_81 = i_5 + (i_10 - i_4 + i_12 - 1) / i_12) > i_9) {
            i_81 = i_9;
        }

        while (i_5 < i_81) {
            f_01 = floats_2[i_4 >> 8];
            i_10001 = i_5++;
            ints_3[i_10001] += (int) ((f_01 * 256.0F + (f_13 - f_01) * (i_4 & 0xff)) * i_6) >> 6;
            i_6 += i_7;
            i_4 += i_12;
        }

        class282_sub15_sub5_sub1_11.anInt9845 += class282_sub15_sub5_sub1_11.anInt9852 * i_5;
        class282_sub15_sub5_sub1_11.anInt9850 += class282_sub15_sub5_sub1_11.anInt9851 * i_5;
        class282_sub15_sub5_sub1_11.anInt9848 = i_6 / 128;
        class282_sub15_sub5_sub1_11.nodeIndex = i_4;
        return i_5;
    }

    static int method15737(float f_0, float[] floats_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, MidiInstrumentNode_2 class282_sub15_sub5_sub1_12) {
        int i_91 = i_9;
        float f_01 = f_0;
        i_3 >>= 8;
        i_11 >>= 8;
        i_5 <<= 2;
        i_6 <<= 2;
        i_7 <<= 2;
        i_8 <<= 2;
        i_5 *= 128;
        i_7 *= 128;
        i_6 *= 128;
        i_8 *= 128;
        if ((i_91 = i_11 + i_4 - i_3) > i_10) {
            i_91 = i_10;
        }

        class282_sub15_sub5_sub1_12.anInt9848 += class282_sub15_sub5_sub1_12.anInt9849 * (i_91 - i_4);
        i_4 <<= 1;
        i_91 <<= 1;

        int i_10001;
        for (i_91 -= 6; i_4 < i_91; i_6 += i_8) {
            f_01 = floats_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
            i_6 += i_8;
            f_01 = floats_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
            i_6 += i_8;
            f_01 = floats_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
            i_6 += i_8;
            f_01 = floats_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
        }

        for (i_91 += 6; i_4 < i_91; i_6 += i_8) {
            f_01 = floats_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
        }

        class282_sub15_sub5_sub1_12.anInt9845 = i_5 / 128 >> 2;
        class282_sub15_sub5_sub1_12.anInt9850 = i_6 / 128 >> 2;
        class282_sub15_sub5_sub1_12.nodeIndex = i_3 << 8;
        return i_4 >> 1;
    }

    static int method15738(float[] floats_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, MidiInstrumentNode_2 class282_sub15_sub5_sub1_9) {
        int i_61 = i_6;
        i_2 >>= 8;
        i_8 >>= 8;
        i_4 <<= 2;
        i_5 <<= 2;
        i_4 *= 128;
        i_5 *= 128;
        if ((i_61 = i_3 + i_2 - (i_8 - 1)) > i_7) {
            i_61 = i_7;
        }

        class282_sub15_sub5_sub1_9.anInt9845 += class282_sub15_sub5_sub1_9.anInt9852 * (i_61 - i_3);
        class282_sub15_sub5_sub1_9.anInt9850 += class282_sub15_sub5_sub1_9.anInt9851 * (i_61 - i_3);

        int i_10001;
        for (i_61 -= 3; i_3 < i_61; i_4 += i_5) {
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2--] * i_4);
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2--] * i_4);
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2--] * i_4);
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2--] * i_4);
        }

        for (i_61 += 3; i_3 < i_61; i_4 += i_5) {
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2--] * i_4);
        }

        class282_sub15_sub5_sub1_9.anInt9848 = i_4 / 128 >> 2;
        class282_sub15_sub5_sub1_9.nodeIndex = i_2 << 8;
        return i_3;
    }

    static int method15739(float f_0, float[] floats_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, MidiInstrumentNode_2 class282_sub15_sub5_sub1_12) {
        int i_91 = i_9;
        float f_01 = f_0;
        i_3 >>= 8;
        i_11 >>= 8;
        i_5 <<= 2;
        i_6 <<= 2;
        i_7 <<= 2;
        i_8 <<= 2;
        i_5 *= 128;
        i_7 *= 128;
        i_6 *= 128;
        i_8 *= 128;
        if ((i_91 = i_3 + i_4 - (i_11 - 1)) > i_10) {
            i_91 = i_10;
        }

        class282_sub15_sub5_sub1_12.anInt9848 += class282_sub15_sub5_sub1_12.anInt9849 * (i_91 - i_4);
        i_4 <<= 1;
        i_91 <<= 1;

        int i_10001;
        for (i_91 -= 6; i_4 < i_91; i_6 += i_8) {
            f_01 = floats_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
            i_6 += i_8;
            f_01 = floats_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
            i_6 += i_8;
            f_01 = floats_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
            i_6 += i_8;
            f_01 = floats_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
        }

        for (i_91 += 6; i_4 < i_91; i_6 += i_8) {
            f_01 = floats_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
        }

        class282_sub15_sub5_sub1_12.anInt9845 = i_5 / 128 >> 2;
        class282_sub15_sub5_sub1_12.anInt9850 = i_6 / 128 >> 2;
        class282_sub15_sub5_sub1_12.nodeIndex = i_3 << 8;
        return i_4 >> 1;
    }

    static int method15740(float[] floats_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, MidiInstrumentNode_2 class282_sub15_sub5_sub1_8) {
        int i_51 = i_5;
        i_2 >>= 8;
        i_7 >>= 8;
        i_4 <<= 2;
        i_4 *= 128;
        if ((i_51 = i_3 + i_7 - i_2) > i_6) {
            i_51 = i_6;
        }

        int i_10001;
        for (i_51 -= 3; i_3 < i_51; ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2++] * i_4)) {
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2++] * i_4);
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2++] * i_4);
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2++] * i_4);
            i_10001 = i_3++;
        }

        for (i_51 += 3; i_3 < i_51; ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2++] * i_4)) {
            i_10001 = i_3++;
        }

        class282_sub15_sub5_sub1_8.nodeIndex = i_2 << 8;
        return i_3;
    }

    static int method15741(float f_0, int i_1, float[] floats_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, MidiInstrumentNode_2 class282_sub15_sub5_sub1_13, int i_14, float f_15) {
        int i_13 = i_1;
        int i_101 = i_10;
        float f_01 = f_0;
        i_6 *= 128;
        i_8 *= 128;
        i_7 *= 128;
        i_9 *= 128;
        class282_sub15_sub5_sub1_13.anInt9848 -= i_5 * class282_sub15_sub5_sub1_13.anInt9849;
        if (i_14 == 0 || (i_101 = i_5 + (i_12 - i_4 + i_14 - 257) / i_14) > i_11) {
            i_101 = i_11;
        }

        i_5 <<= 1;

        int i_10001;
        for (i_101 <<= 1; i_5 < i_101; i_4 += i_14) {
            i_13 = i_4 >> 8;
            f_01 = floats_2[i_13];
            f_01 = f_01 * 256.0F + (floats_2[i_13 + 1] - f_01) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_6) >> 6;
            i_6 += i_8;
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_7) >> 6;
            i_7 += i_9;
        }

        if (i_14 == 0 || (i_101 = (i_5 >> 1) + (i_12 - i_4 + i_14 - 1) / i_14) > i_11) {
            i_101 = i_11;
        }

        for (i_101 <<= 1; i_5 < i_101; i_4 += i_14) {
            f_01 = floats_2[i_4 >> 8];
            f_01 = f_01 * 256.0F + (f_15 - f_01) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_6) >> 6;
            i_6 += i_8;
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_7) >> 6;
            i_7 += i_9;
        }

        i_5 >>= 1;
        class282_sub15_sub5_sub1_13.anInt9848 += class282_sub15_sub5_sub1_13.anInt9849 * i_5;
        class282_sub15_sub5_sub1_13.anInt9845 = i_6 / 128;
        class282_sub15_sub5_sub1_13.anInt9850 = i_7 / 128;
        class282_sub15_sub5_sub1_13.nodeIndex = i_4;
        return i_5;
    }

    static int method15742(float f_0, int i_1, float[] floats_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, MidiInstrumentNode_2 class282_sub15_sub5_sub1_11, int i_12, float f_13) {
        int i_11 = i_1;
        int i_81 = i_8;
        float f_01 = f_0;
        i_6 *= 128;
        i_7 *= 128;
        class282_sub15_sub5_sub1_11.anInt9845 -= class282_sub15_sub5_sub1_11.anInt9852 * i_5;
        class282_sub15_sub5_sub1_11.anInt9850 -= class282_sub15_sub5_sub1_11.anInt9851 * i_5;
        if (i_12 == 0 || (i_81 = i_5 + (i_10 + 256 - i_4 + i_12) / i_12) > i_9) {
            i_81 = i_9;
        }

        int i_10001;
        while (i_5 < i_81) {
            i_11 = i_4 >> 8;
            f_01 = floats_2[i_11 - 1];
            i_10001 = i_5++;
            ints_3[i_10001] += (int) ((f_01 * 256.0F + (floats_2[i_11] - f_01) * (i_4 & 0xff)) * i_6) >> 6;
            i_6 += i_7;
            i_4 += i_12;
        }

        if (i_12 == 0 || (i_81 = i_5 + (i_10 - i_4 + i_12) / i_12) > i_9) {
            i_81 = i_9;
        }

        for (f_01 = f_13; i_5 < i_81; i_4 += i_12) {
            i_10001 = i_5++;
            ints_3[i_10001] += (int) ((f_01 * 256.0F + (floats_2[i_4 >> 8] - f_01) * (i_4 & 0xff)) * i_6) >> 6;
            i_6 += i_7;
        }

        class282_sub15_sub5_sub1_11.anInt9845 += class282_sub15_sub5_sub1_11.anInt9852 * i_5;
        class282_sub15_sub5_sub1_11.anInt9850 += class282_sub15_sub5_sub1_11.anInt9851 * i_5;
        class282_sub15_sub5_sub1_11.anInt9848 = i_6 / 128;
        class282_sub15_sub5_sub1_11.nodeIndex = i_4;
        return i_5;
    }

    static int method15743(float f_0, int i_1, float[] floats_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, MidiInstrumentNode_2 class282_sub15_sub5_sub1_13, int i_14, float f_15) {
        int i_13 = i_1;
        int i_101 = i_10;
        float f_01 = f_0;
        i_6 *= 128;
        i_8 *= 128;
        i_7 *= 128;
        i_9 *= 128;
        class282_sub15_sub5_sub1_13.anInt9848 -= i_5 * class282_sub15_sub5_sub1_13.anInt9849;
        if (i_14 == 0 || (i_101 = i_5 + (i_12 + 256 - i_4 + i_14) / i_14) > i_11) {
            i_101 = i_11;
        }

        i_5 <<= 1;

        int i_10001;
        for (i_101 <<= 1; i_5 < i_101; i_4 += i_14) {
            i_13 = i_4 >> 8;
            f_01 = floats_2[i_13 - 1];
            f_01 = f_01 * 256.0F + (floats_2[i_13] - f_01) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_6) >> 6;
            i_6 += i_8;
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_7) >> 6;
            i_7 += i_9;
        }

        if (i_14 == 0 || (i_101 = (i_5 >> 1) + (i_12 - i_4 + i_14) / i_14) > i_11) {
            i_101 = i_11;
        }

        for (i_101 <<= 1; i_5 < i_101; i_4 += i_14) {
            f_01 = f_15 * 256.0F + (floats_2[i_4 >> 8] - f_15) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_6) >> 6;
            i_6 += i_8;
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_7) >> 6;
            i_7 += i_9;
        }

        i_5 >>= 1;
        class282_sub15_sub5_sub1_13.anInt9848 += class282_sub15_sub5_sub1_13.anInt9849 * i_5;
        class282_sub15_sub5_sub1_13.anInt9845 = i_6 / 128;
        class282_sub15_sub5_sub1_13.anInt9850 = i_7 / 128;
        class282_sub15_sub5_sub1_13.nodeIndex = i_4;
        return i_5;
    }

    static int method15746(float f_0, int i_1, float[] floats_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, MidiInstrumentNode_2 class282_sub15_sub5_sub1_11, int i_12, float f_13) {
        int i_11 = i_1;
        int i_81 = i_8;
        float f_01 = f_0;
        i_6 *= 128;
        i_7 *= 128;
        if (i_12 == 0 || (i_81 = i_5 + (i_10 - i_4 + i_12 - 257) / i_12) > i_9) {
            i_81 = i_9;
        }

        i_5 <<= 1;

        int i_10001;
        for (i_81 <<= 1; i_5 < i_81; i_4 += i_12) {
            i_11 = i_4 >> 8;
            f_01 = floats_2[i_11];
            f_01 = f_01 * 256.0F + (floats_2[i_11 + 1] - f_01) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_6) >> 6;
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_7) >> 6;
        }

        if (i_12 == 0 || (i_81 = (i_5 >> 1) + (i_10 - i_4 + i_12 - 1) / i_12) > i_9) {
            i_81 = i_9;
        }

        for (i_81 <<= 1; i_5 < i_81; i_4 += i_12) {
            f_01 = floats_2[i_4 >> 8];
            f_01 = f_01 * 256.0F + (f_13 - f_01) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_6) >> 6;
            i_10001 = i_5++;
            ints_3[i_10001] += (int) (f_01 * i_7) >> 6;
        }

        class282_sub15_sub5_sub1_11.nodeIndex = i_4;
        return i_5 >> 1;
    }

    static int method15747(float f_0, int i_1, float[] floats_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, MidiInstrumentNode_2 class282_sub15_sub5_sub1_10, int i_11, float f_12) {
        int i_12 = i_1;
        int i_71 = i_7;
        float f_01 = f_0;
        i_6 *= 128;
        if (i_11 == 0 || (i_71 = i_5 + (i_11 + (i_9 - i_4) - 257) / i_11) > i_8) {
            i_71 = i_8;
        }

        int i_10001;
        while (i_5 < i_71) {
            i_12 = i_4 >> 8;
            f_01 = floats_2[i_12];
            i_10001 = i_5++;
            ints_3[i_10001] += (int) ((f_01 * 256.0F + (floats_2[i_12 + 1] - f_01) * (i_4 & 0xff)) * i_6) >> 6;
            i_4 += i_11;
        }

        if (i_11 == 0 || (i_71 = i_5 + (i_11 + (i_9 - i_4) - 1) / i_11) > i_8) {
            i_71 = i_8;
        }

        while (i_5 < i_71) {
            f_01 = floats_2[i_4 >> 8];
            i_10001 = i_5++;
            ints_3[i_10001] += (int) ((f_01 * 256.0F + (f_12 - f_01) * (i_4 & 0xff)) * i_6) >> 6;
            i_4 += i_11;
        }

        class282_sub15_sub5_sub1_10.nodeIndex = i_4;
        return i_5;
    }

    static int method15770(float f_0, float[] floats_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, MidiInstrumentNode_2 class282_sub15_sub5_sub1_10) {
        int i_71 = i_7;
        float f_01 = f_0;
        i_3 >>= 8;
        i_9 >>= 8;
        i_5 <<= 2;
        i_6 <<= 2;
        i_5 *= 128;
        i_6 *= 128;
        if ((i_71 = i_4 + i_9 - i_3) > i_8) {
            i_71 = i_8;
        }

        i_4 <<= 1;
        i_71 <<= 1;

        int i_10001;
        for (i_71 -= 6; i_4 < i_71; ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6)) {
            f_01 = floats_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
            f_01 = floats_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
            f_01 = floats_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6);
            f_01 = floats_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_10001 = i_4++;
        }

        for (i_71 += 6; i_4 < i_71; ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_6)) {
            f_01 = floats_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] = (int) (ints_2[i_10001] + f_01 * i_5);
            i_10001 = i_4++;
        }

        class282_sub15_sub5_sub1_10.nodeIndex = i_3 << 8;
        return i_4 >> 1;
    }

    static int method15774(float[] floats_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, MidiInstrumentNode_2 class282_sub15_sub5_sub1_8) {
        int i_51 = i_5;
        i_2 >>= 8;
        i_7 >>= 8;
        i_4 <<= 2;
        i_4 *= 128;
        if ((i_51 = i_3 + i_2 - (i_7 - 1)) > i_6) {
            i_51 = i_6;
        }

        int i_10001;
        for (i_51 -= 3; i_3 < i_51; ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2--] * i_4)) {
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2--] * i_4);
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2--] * i_4);
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2--] * i_4);
            i_10001 = i_3++;
        }

        for (i_51 += 3; i_3 < i_51; ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2--] * i_4)) {
            i_10001 = i_3++;
        }

        class282_sub15_sub5_sub1_8.nodeIndex = i_2 << 8;
        return i_3;
    }

    static int method15777(float[] floats_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, MidiInstrumentNode_2 class282_sub15_sub5_sub1_9) {
        int i_61 = i_6;
        i_2 >>= 8;
        i_8 >>= 8;
        i_4 <<= 2;
        i_5 <<= 2;
        i_4 *= 128;
        i_5 *= 128;
        if ((i_61 = i_3 + i_8 - i_2) > i_7) {
            i_61 = i_7;
        }

        class282_sub15_sub5_sub1_9.anInt9845 += class282_sub15_sub5_sub1_9.anInt9852 * (i_61 - i_3);
        class282_sub15_sub5_sub1_9.anInt9850 += class282_sub15_sub5_sub1_9.anInt9851 * (i_61 - i_3);

        int i_10001;
        for (i_61 -= 3; i_3 < i_61; i_4 += i_5) {
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2++] * i_4);
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2++] * i_4);
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2++] * i_4);
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2++] * i_4);
        }

        for (i_61 += 3; i_3 < i_61; i_4 += i_5) {
            i_10001 = i_3++;
            ints_1[i_10001] = (int) (ints_1[i_10001] + floats_0[i_2++] * i_4);
        }

        class282_sub15_sub5_sub1_9.anInt9848 = i_4 / 128 >> 2;
        class282_sub15_sub5_sub1_9.nodeIndex = i_2 << 8;
        return i_3;
    }

	/**
	 * Runs throughout the sound
	 * @param ints_1
	 * @param i_2
	 * @param i_3
	 * @throws IllegalStateException
	 */
    @Override
    public synchronized void method12230(int[] ints_1, int i_2, int i_3) throws IllegalStateException {
        if (volume == 0 && anInt9858 == 0) {
            method12231(i_3);
        } else {

            int i_4 = anInt9844 << 8;
            int i_5 = duration << 8;
            int bufferLength = ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBufferLength() << 8;
            int i_7 = i_5 - i_4;
            if (i_7 <= 0) {
                anInt9854 = 0;
            }

            int i_8 = i_2;
            i_3 += i_2;
            if (nodeIndex < 0) {
                if (anInt9855 <= 0) {
                    method15354();
                    unlink();
                    return;
                }

                nodeIndex = 0;
            }

            if (nodeIndex >= bufferLength) {
                if (anInt9855 >= 0) {
                    method15354();
                    unlink();
                    return;
                }

                nodeIndex = bufferLength - 1;
            }

            if (anInt9854 < 0) {
                if (aBoolNormFalse9857) {
                    if (anInt9855 < 0) {
                        i_8 = method15732(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844]);
                        if (nodeIndex >= i_4) {
                            return;
                        }

                        nodeIndex = i_4 + i_4 - 1 - nodeIndex;
                        anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                    }

                    while (true) {
                        i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration - 1]);
                        if (nodeIndex < i_5) {
                            break;
                        }

                        nodeIndex = i_5 + i_5 - 1 - nodeIndex;
                        anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                        i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844]);
                        if (nodeIndex >= i_4) {
                            break;
                        }

                        nodeIndex = i_4 + i_4 - 1 - nodeIndex;
                        anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                    }
                } else if (anInt9855 < 0) {
                    while (true) {
                        i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration - 1]);
                        if (nodeIndex >= i_4) {
                            break;
                        }

                        nodeIndex = i_5 - 1 - (i_5 - 1 - nodeIndex) % i_7;
                    }
                } else {
                    while (true) {
                        i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844]);
                        if (nodeIndex < i_5) {
                            break;
                        }

                        nodeIndex = i_4 + (nodeIndex - i_4) % i_7;
                    }
                }
            } else {
                if (anInt9854 > 0) {
                    if (aBoolNormFalse9857) {
                        label111:
                        {
                            if (anInt9855 < 0) {
                                i_8 = method15732(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844]);
                                if (nodeIndex >= i_4) {
                                    return;
                                }

                                nodeIndex = i_4 + i_4 - 1 - nodeIndex;
                                anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                                if (--anInt9854 == 0) {
                                    break label111;
                                }
                            }

                            do {
                                i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration - 1]);
                                if (nodeIndex < i_5) {
                                    return;
                                }

                                nodeIndex = i_5 + i_5 - 1 - nodeIndex;
                                anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                                if (--anInt9854 == 0) {
                                    break;
                                }

                                i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844]);
                                if (nodeIndex >= i_4) {
                                    return;
                                }

                                nodeIndex = i_4 + i_4 - 1 - nodeIndex;
                                anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                            } while (--anInt9854 != 0);
                        }
                    } else {
                        int i_9;
                        if (anInt9855 < 0) {
                            while (true) {
                                i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration - 1]);
                                if (nodeIndex >= i_4) {
                                    return;
                                }

                                i_9 = (i_5 - 1 - nodeIndex) / i_7;
                                if (i_9 >= anInt9854) {
                                    nodeIndex += i_7 * anInt9854;
                                    anInt9854 = 0;
                                    break;
                                }

                                nodeIndex += i_7 * i_9;
                                anInt9854 -= i_9;
                            }
                        } else {
                            while (true) {
                                i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844]);
                                if (nodeIndex < i_5) {
                                    return;
                                }

                                i_9 = (nodeIndex - i_4) / i_7;
                                if (i_9 >= anInt9854) {
                                    nodeIndex -= i_7 * anInt9854;
                                    anInt9854 = 0;
                                    break;
                                }

                                nodeIndex -= i_7 * i_9;
                                anInt9854 -= i_9;
                            }
                        }
                    }
                }

                if (anInt9855 < 0) {
                    method15732(ints_1, i_8, 0, i_3, 0.0F);
                    if (nodeIndex < 0) {
                        nodeIndex = -1;
                        method15354();
                        unlink();
                    }
                } else {
                    method15769(ints_1, i_8, bufferLength, i_3, 0.0F);
                    if (nodeIndex >= bufferLength) {
                        nodeIndex = bufferLength;
                        method15354();
                        unlink();
                    }
                }
            }
        }

    }

    @Override
    public synchronized void method12240(int[] ints_1, int i_2, int i_3) throws IllegalStateException {
        if (volume * -298675253 * -1302038045 == 0 && anInt9858 * 1156515807 * 1008956447 == 0) {
            method12231(i_3);
        } else {
            int i_4 = anInt9844 * 900940833 * -99794975 << 8;
            int i_5 = duration * -628161865 * -1048610041 << 8;
            int i_6 = ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBufferLength() << 8;
            int i_7 = i_5 - i_4;
            if (i_7 <= 0) {
                anInt9854 = 0;
            }

            int i_8 = i_2;
            i_3 += i_2;
            if (nodeIndex * -834443097 * -354697449 < 0) {
                if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 <= 0) {
                    method15354();
                    unlink();
                    return;
                }

                nodeIndex = 0;
            }

            if (nodeIndex * -834443097 * -354697449 >= i_6) {
                if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 >= 0) {
                    method15354();
                    unlink();
                    return;
                }

                nodeIndex = (i_6 - 1) * -834443097 * -354697449;
            }

            if (anInt9854 * -485012237 * 1507503163 < 0) {
                if (aBoolNormFalse9857) {
                    if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                        i_8 = method15732(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            return;
                        }

                        nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    }

                    while (true) {
                        i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration * -628161865 * -1048610041 - 1]);
                        if (nodeIndex * -834443097 * -354697449 < i_5) {
                            break;
                        }

                        nodeIndex = (i_5 + i_5 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                        i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            break;
                        }

                        nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    }
                } else if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                    while (true) {
                        i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration * -628161865 * -1048610041 - 1]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            break;
                        }

                        nodeIndex = (i_5 - 1 - (i_5 - 1 - nodeIndex * -834443097 * -354697449) % i_7) * -834443097 * -354697449;
                    }
                } else {
                    while (true) {
                        i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                        if (nodeIndex * -834443097 * -354697449 < i_5) {
                            break;
                        }

                        nodeIndex = (i_4 + (nodeIndex * -834443097 * -354697449 - i_4) % i_7) * -834443097 * -354697449;
                    }
                }
            } else {
                if (anInt9854 * -485012237 * 1507503163 > 0) {
                    if (aBoolNormFalse9857) {
                        label111:
                        {
                            int i_10002;
                            if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                                i_8 = method15732(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                                if (nodeIndex * -834443097 * -354697449 >= i_4) {
                                    return;
                                }

                                nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                                anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                                i_10002 = anInt9854 * -485012237 - -485012237;
                                anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                                if (i_10002 * 1507503163 == 0) {
                                    break label111;
                                }
                            }

                            do {
                                i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration * -628161865 * -1048610041 - 1]);
                                if (nodeIndex * -834443097 * -354697449 < i_5) {
                                    return;
                                }

                                nodeIndex = (i_5 + i_5 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                                anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                                i_10002 = anInt9854 * -485012237 - -485012237;
                                anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                                if (i_10002 * 1507503163 == 0) {
                                    break;
                                }

                                i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                                if (nodeIndex * -834443097 * -354697449 >= i_4) {
                                    return;
                                }

                                nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                                anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                                i_10002 = anInt9854 * -485012237 - -485012237;
                                anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                            } while (i_10002 * 1507503163 != 0);
                        }
                    } else {
                        int i_9;
                        if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                            while (true) {
                                i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration * -628161865 * -1048610041 - 1]);
                                if (nodeIndex * -834443097 * -354697449 >= i_4) {
                                    return;
                                }

                                i_9 = (i_5 - 1 - nodeIndex * -834443097 * -354697449) / i_7;
                                if (i_9 >= anInt9854 * -485012237 * 1507503163) {
                                    nodeIndex = (nodeIndex * -834443097 + i_7 * anInt9854 * -485012237 * 1507503163 * -834443097) * -354697449;
                                    anInt9854 = 0;
                                    break;
                                }

                                nodeIndex = (nodeIndex * -834443097 + i_7 * i_9 * -834443097) * -354697449;
                                anInt9854 = (anInt9854 * -485012237 - i_9 * -485012237) * 1507503163;
                            }
                        } else {
                            while (true) {
                                i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                                if (nodeIndex * -834443097 * -354697449 < i_5) {
                                    return;
                                }

                                i_9 = (nodeIndex * -834443097 * -354697449 - i_4) / i_7;
                                if (i_9 >= anInt9854 * -485012237 * 1507503163) {
                                    nodeIndex = (nodeIndex * -834443097 - i_7 * anInt9854 * -485012237 * 1507503163 * -834443097) * -354697449;
                                    anInt9854 = 0;
                                    break;
                                }

                                nodeIndex = (nodeIndex * -834443097 - i_7 * i_9 * -834443097) * -354697449;
                                anInt9854 = (anInt9854 * -485012237 - i_9 * -485012237) * 1507503163;
                            }
                        }
                    }
                }

                if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                    method15732(ints_1, i_8, 0, i_3, 0.0F);
                    if (nodeIndex * -834443097 * -354697449 < 0) {
                        nodeIndex = 834443097 * -354697449;
                        method15354();
                        unlink();
                    }
                } else {
                    method15769(ints_1, i_8, i_6, i_3, 0.0F);
                    if (nodeIndex * -834443097 * -354697449 >= i_6) {
                        nodeIndex = i_6 * -834443097 * -354697449;
                        method15354();
                        unlink();
                    }
                }
            }
        }

    }

    int method15732(int[] ints_1, int i_2, int i_3, int i_4, float f_5) {
        do {
            if (anInt9858 <= 0) {
                if (anInt9855 == -256 && (nodeIndex & 0xff) == 0) {
                    if (Class253.isStereo) {
                        return method15731(0.0F, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9845, anInt9850, 0, i_4, i_3, this);
                    }

                    return method15774(((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9848, 0, i_4, i_3, this);
                }

                if (Class253.isStereo) {
                    return method15729(0.0F, 0, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9845, anInt9850, 0, i_4, i_3, this, anInt9855, f_5);
                }

                return method15734(0.0F, 0, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9848, 0, i_4, i_3, this, anInt9855, f_5);
            }

            int i_6 = i_2 + anInt9858;
            if (i_6 > i_4) {
                i_6 = i_4;
            }

            anInt9858 += i_2;
            if (anInt9855 == -256 && (nodeIndex & 0xff) == 0) {
                if (Class253.isStereo) {
                    i_2 = method15739(0.0F, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9845, anInt9850, anInt9852, anInt9851, 0, i_6, i_3, this);
                } else {
                    i_2 = method15738(((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9848, anInt9849, 0, i_6, i_3, this);
                }
            } else if (Class253.isStereo) {
                i_2 = method15743(0.0F, 0, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9845, anInt9850, anInt9852, anInt9851, 0, i_6, i_3, this, anInt9855, f_5);
            } else {
                i_2 = method15742(0.0F, 0, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9848, anInt9849, 0, i_6, i_3, this, anInt9855, f_5);
            }

            anInt9858 -= i_2;
            if (anInt9858 != 0) {
                return i_2;
            }
        } while (!method15324());

        return i_4;
    }

    @Override
    public synchronized void method12241(int[] ints_1, int i_2, int i_3) throws IllegalStateException {
        if (volume * -298675253 * -1302038045 == 0 && anInt9858 * 1156515807 * 1008956447 == 0) {
            method12231(i_3);
        } else {
            int i_4 = anInt9844 * 900940833 * -99794975 << 8;
            int i_5 = duration * -628161865 * -1048610041 << 8;
            int i_6 = ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBufferLength() << 8;
            int i_7 = i_5 - i_4;
            if (i_7 <= 0) {
                anInt9854 = 0;
            }

            int i_8 = i_2;
            i_3 += i_2;
            if (nodeIndex * -834443097 * -354697449 < 0) {
                if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 <= 0) {
                    method15354();
                    unlink();
                    return;
                }

                nodeIndex = 0;
            }

            if (nodeIndex * -834443097 * -354697449 >= i_6) {
                if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 >= 0) {
                    method15354();
                    unlink();
                    return;
                }

                nodeIndex = (i_6 - 1) * -834443097 * -354697449;
            }

            if (anInt9854 * -485012237 * 1507503163 < 0) {
                if (aBoolNormFalse9857) {
                    if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                        i_8 = method15732(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            return;
                        }

                        nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    }

                    while (true) {
                        i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration * -628161865 * -1048610041 - 1]);
                        if (nodeIndex * -834443097 * -354697449 < i_5) {
                            break;
                        }

                        nodeIndex = (i_5 + i_5 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                        i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            break;
                        }

                        nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    }
                } else if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                    while (true) {
                        i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration * -628161865 * -1048610041 - 1]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            break;
                        }

                        nodeIndex = (i_5 - 1 - (i_5 - 1 - nodeIndex * -834443097 * -354697449) % i_7) * -834443097 * -354697449;
                    }
                } else {
                    while (true) {
                        i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                        if (nodeIndex * -834443097 * -354697449 < i_5) {
                            break;
                        }

                        nodeIndex = (i_4 + (nodeIndex * -834443097 * -354697449 - i_4) % i_7) * -834443097 * -354697449;
                    }
                }
            } else {
                if (anInt9854 * -485012237 * 1507503163 > 0) {
                    if (aBoolNormFalse9857) {
                        label111:
                        {
                            int i_10002;
                            if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                                i_8 = method15732(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                                if (nodeIndex * -834443097 * -354697449 >= i_4) {
                                    return;
                                }

                                nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                                anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                                i_10002 = anInt9854 * -485012237 - -485012237;
                                anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                                if (i_10002 * 1507503163 == 0) {
                                    break label111;
                                }
                            }

                            do {
                                i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration * -628161865 * -1048610041 - 1]);
                                if (nodeIndex * -834443097 * -354697449 < i_5) {
                                    return;
                                }

                                nodeIndex = (i_5 + i_5 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                                anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                                i_10002 = anInt9854 * -485012237 - -485012237;
                                anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                                if (i_10002 * 1507503163 == 0) {
                                    break;
                                }

                                i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                                if (nodeIndex * -834443097 * -354697449 >= i_4) {
                                    return;
                                }

                                nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                                anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                                i_10002 = anInt9854 * -485012237 - -485012237;
                                anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                            } while (i_10002 * 1507503163 != 0);
                        }
                    } else {
                        int i_9;
                        if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                            while (true) {
                                i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration * -628161865 * -1048610041 - 1]);
                                if (nodeIndex * -834443097 * -354697449 >= i_4) {
                                    return;
                                }

                                i_9 = (i_5 - 1 - nodeIndex * -834443097 * -354697449) / i_7;
                                if (i_9 >= anInt9854 * -485012237 * 1507503163) {
                                    nodeIndex = (nodeIndex * -834443097 + i_7 * anInt9854 * -485012237 * 1507503163 * -834443097) * -354697449;
                                    anInt9854 = 0;
                                    break;
                                }

                                nodeIndex = (nodeIndex * -834443097 + i_7 * i_9 * -834443097) * -354697449;
                                anInt9854 = (anInt9854 * -485012237 - i_9 * -485012237) * 1507503163;
                            }
                        } else {
                            while (true) {
                                i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                                if (nodeIndex * -834443097 * -354697449 < i_5) {
                                    return;
                                }

                                i_9 = (nodeIndex * -834443097 * -354697449 - i_4) / i_7;
                                if (i_9 >= anInt9854 * -485012237 * 1507503163) {
                                    nodeIndex = (nodeIndex * -834443097 - i_7 * anInt9854 * -485012237 * 1507503163 * -834443097) * -354697449;
                                    anInt9854 = 0;
                                    break;
                                }

                                nodeIndex = (nodeIndex * -834443097 - i_7 * i_9 * -834443097) * -354697449;
                                anInt9854 = (anInt9854 * -485012237 - i_9 * -485012237) * 1507503163;
                            }
                        }
                    }
                }

                if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                    method15732(ints_1, i_8, 0, i_3, 0.0F);
                    if (nodeIndex * -834443097 * -354697449 < 0) {
                        nodeIndex = 834443097 * -354697449;
                        method15354();
                        unlink();
                    }
                } else {
                    method15769(ints_1, i_8, i_6, i_3, 0.0F);
                    if (nodeIndex * -834443097 * -354697449 >= i_6) {
                        nodeIndex = i_6 * -834443097 * -354697449;
                        method15354();
                        unlink();
                    }
                }
            }
        }

    }

    @Override
    public synchronized void method12242(int[] ints_1, int i_2, int i_3) throws IllegalStateException {
        if (volume * -298675253 * -1302038045 == 0 && anInt9858 * 1156515807 * 1008956447 == 0) {
            method12231(i_3);
        } else {
            int i_4 = anInt9844 * 900940833 * -99794975 << 8;
            int i_5 = duration * -628161865 * -1048610041 << 8;
            int i_6 = ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBufferLength() << 8;
            int i_7 = i_5 - i_4;
            if (i_7 <= 0) {
                anInt9854 = 0;
            }

            int i_8 = i_2;
            i_3 += i_2;
            if (nodeIndex * -834443097 * -354697449 < 0) {
                if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 <= 0) {
                    method15354();
                    unlink();
                    return;
                }

                nodeIndex = 0;
            }

            if (nodeIndex * -834443097 * -354697449 >= i_6) {
                if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 >= 0) {
                    method15354();
                    unlink();
                    return;
                }

                nodeIndex = (i_6 - 1) * -834443097 * -354697449;
            }

            if (anInt9854 * -485012237 * 1507503163 < 0) {
                if (aBoolNormFalse9857) {
                    if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                        i_8 = method15732(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            return;
                        }

                        nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    }

                    while (true) {
                        i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration * -628161865 * -1048610041 - 1]);
                        if (nodeIndex * -834443097 * -354697449 < i_5) {
                            break;
                        }

                        nodeIndex = (i_5 + i_5 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                        i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            break;
                        }

                        nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    }
                } else if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                    while (true) {
                        i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration * -628161865 * -1048610041 - 1]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            break;
                        }

                        nodeIndex = (i_5 - 1 - (i_5 - 1 - nodeIndex * -834443097 * -354697449) % i_7) * -834443097 * -354697449;
                    }
                } else {
                    while (true) {
                        i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                        if (nodeIndex * -834443097 * -354697449 < i_5) {
                            break;
                        }

                        nodeIndex = (i_4 + (nodeIndex * -834443097 * -354697449 - i_4) % i_7) * -834443097 * -354697449;
                    }
                }
            } else {
                if (anInt9854 * -485012237 * 1507503163 > 0) {
                    if (aBoolNormFalse9857) {
                        label111:
                        {
                            int i_10002;
                            if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                                i_8 = method15732(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                                if (nodeIndex * -834443097 * -354697449 >= i_4) {
                                    return;
                                }

                                nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                                anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                                i_10002 = anInt9854 * -485012237 - -485012237;
                                anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                                if (i_10002 * 1507503163 == 0) {
                                    break label111;
                                }
                            }

                            do {
                                i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration * -628161865 * -1048610041 - 1]);
                                if (nodeIndex * -834443097 * -354697449 < i_5) {
                                    return;
                                }

                                nodeIndex = (i_5 + i_5 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                                anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                                i_10002 = anInt9854 * -485012237 - -485012237;
                                anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                                if (i_10002 * 1507503163 == 0) {
                                    break;
                                }

                                i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                                if (nodeIndex * -834443097 * -354697449 >= i_4) {
                                    return;
                                }

                                nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                                anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                                i_10002 = anInt9854 * -485012237 - -485012237;
                                anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                            } while (i_10002 * 1507503163 != 0);
                        }
                    } else {
                        int i_9;
                        if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                            while (true) {
                                i_8 = method15732(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[duration * -628161865 * -1048610041 - 1]);
                                if (nodeIndex * -834443097 * -354697449 >= i_4) {
                                    return;
                                }

                                i_9 = (i_5 - 1 - nodeIndex * -834443097 * -354697449) / i_7;
                                if (i_9 >= anInt9854 * -485012237 * 1507503163) {
                                    nodeIndex = (nodeIndex * -834443097 + i_7 * anInt9854 * -485012237 * 1507503163 * -834443097) * -354697449;
                                    anInt9854 = 0;
                                    break;
                                }

                                nodeIndex = (nodeIndex * -834443097 + i_7 * i_9 * -834443097) * -354697449;
                                anInt9854 = (anInt9854 * -485012237 - i_9 * -485012237) * 1507503163;
                            }
                        } else {
                            while (true) {
                                i_8 = method15769(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer()[anInt9844 * 900940833 * -99794975]);
                                if (nodeIndex * -834443097 * -354697449 < i_5) {
                                    return;
                                }

                                i_9 = (nodeIndex * -834443097 * -354697449 - i_4) / i_7;
                                if (i_9 >= anInt9854 * -485012237 * 1507503163) {
                                    nodeIndex = (nodeIndex * -834443097 - i_7 * anInt9854 * -485012237 * 1507503163 * -834443097) * -354697449;
                                    anInt9854 = 0;
                                    break;
                                }

                                nodeIndex = (nodeIndex * -834443097 - i_7 * i_9 * -834443097) * -354697449;
                                anInt9854 = (anInt9854 * -485012237 - i_9 * -485012237) * 1507503163;
                            }
                        }
                    }
                }

                if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                    method15732(ints_1, i_8, 0, i_3, 0.0F);
                    if (nodeIndex * -834443097 * -354697449 < 0) {
                        nodeIndex = 834443097 * -354697449;
                        method15354();
                        unlink();
                    }
                } else {
                    method15769(ints_1, i_8, i_6, i_3, 0.0F);
                    if (nodeIndex * -834443097 * -354697449 >= i_6) {
                        nodeIndex = i_6 * -834443097 * -354697449;
                        method15354();
                        unlink();
                    }
                }
            }
        }

    }

    int method15769(int[] ints_1, int i_2, int i_3, int i_4, float f_5) {
        do {
            if (anInt9858 <= 0) {
                if (anInt9855 == 256 && (nodeIndex & 0xff) == 0) {
                    if (Class253.isStereo) {
                        return method15770(0.0F, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9845, anInt9850, 0, i_4, i_3, this);
                    }

                    return method15740(((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9848, 0, i_4, i_3, this);
                }

                if (Class253.isStereo) {
                    return method15746(0.0F, 0, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9845, anInt9850, 0, i_4, i_3, this, anInt9855, f_5);
                }

                return method15747(0.0F, 0, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9848, 0, i_4, i_3, this, anInt9855, f_5);
            }

            int i_6 = i_2 + anInt9858;
            if (i_6 > i_4) {
                i_6 = i_4;
            }

            anInt9858 += i_2;
            if (anInt9855 == 256 && (nodeIndex & 0xff) == 0) {
                if (Class253.isStereo) {
                    i_2 = method15737(0.0F, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9845, anInt9850, anInt9852, anInt9851, 0, i_6, i_3, this);
                } else {
                    i_2 = method15777(((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9848, anInt9849, 0, i_6, i_3, this);
                }
            } else if (Class253.isStereo) {
                i_2 = method15741(0.0F, 0, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9845, anInt9850, anInt9852, anInt9851, 0, i_6, i_3, this, anInt9855, f_5);
            } else {
                i_2 = method15735(0.0F, 0, ((AudioFormatUnknown2) nodeWithAudioBuffer26).getAudioBuffer(), ints_1, nodeIndex, i_2, anInt9848, anInt9849, 0, i_6, i_3, this, anInt9855, f_5);
            }

            anInt9858 -= i_2;
            if (anInt9858 != 0) {
                return i_2;
            }
        } while (!method15324());

        return i_4;
    }

}
