package com.jagex;

public class SoundEffectNode_2 extends Sound_Node_1 {

	/**
	 * Converted from Sound Effect, could be a node for a byte buffer array for music
	 * @param audio
	 * @param i_2
	 * @param volume
	 * @param i_4
	 */
    SoundEffectNode_2(AudioFormatUnknown audio, int i_2, int volume, int i_4) {
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

    static int method15991(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, SoundEffectNode_2 class282_sub15_sub5_sub2_8) {
        int i_51 = i_5;
        i_2 >>= 8;
        i_7 >>= 8;
        i_4 <<= 2;
        if ((i_51 = i_3 + i_2 - (i_7 - 1)) > i_6) {
            i_51 = i_6;
        }

        int i_10001;
        for (i_51 -= 3; i_3 < i_51; ints_1[i_10001] += bytes_0[i_2--] * i_4) {
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
            i_10001 = i_3++;
        }

        for (i_51 += 3; i_3 < i_51; ints_1[i_10001] += bytes_0[i_2--] * i_4) {
            i_10001 = i_3++;
        }

        class282_sub15_sub5_sub2_8.nodeIndex = i_2 << 8;
        return i_3;
    }

    static int method15992(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, SoundEffectNode_2 class282_sub15_sub5_sub2_8) {
        int i_51 = i_5;
        i_2 >>= 8;
        i_7 >>= 8;
        i_4 <<= 2;
        if ((i_51 = i_3 + i_7 - i_2) > i_6) {
            i_51 = i_6;
        }

        int i_10001;
        for (i_51 -= 3; i_3 < i_51; ints_1[i_10001] += bytes_0[i_2++] * i_4) {
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
            i_10001 = i_3++;
        }

        for (i_51 += 3; i_3 < i_51; ints_1[i_10001] += bytes_0[i_2++] * i_4) {
            i_10001 = i_3++;
        }

        class282_sub15_sub5_sub2_8.nodeIndex = i_2 << 8;
        return i_3;
    }

    static int method15995(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, SoundEffectNode_2 class282_sub15_sub5_sub2_10) {
        int i_71 = i_7;
        i_3 >>= 8;
        i_9 >>= 8;
        i_5 <<= 2;
        i_6 <<= 2;
        if ((i_71 = i_3 + i_4 - (i_9 - 1)) > i_8) {
            i_71 = i_8;
        }

        i_4 <<= 1;
        i_71 <<= 1;

        int i_10001;
        byte b_11;
        for (i_71 -= 6; i_4 < i_71; ints_2[i_10001] += b_11 * i_6) {
            b_11 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_6;
            b_11 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_6;
            b_11 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_6;
            b_11 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
        }

        for (i_71 += 6; i_4 < i_71; ints_2[i_10001] += b_11 * i_6) {
            b_11 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
        }

        class282_sub15_sub5_sub2_10.nodeIndex = i_3 << 8;
        return i_4 >> 1;
    }

    static int method15996(int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, SoundEffectNode_2 class282_sub15_sub5_sub2_10, int i_11, int i_12) {
        int i_71 = i_7;
        int i_13 = i_1;
        if (i_11 == 0 || (i_71 = i_5 + (i_11 + (i_9 - i_4) - 257) / i_11) > i_8) {
            i_71 = i_8;
        }

        byte b_13;
        int i_10001;
        while (i_5 < i_71) {
            i_13 = i_4 >> 8;
            b_13 = bytes_2[i_13];
            i_10001 = i_5++;
            ints_3[i_10001] += ((b_13 << 8) + (bytes_2[i_13 + 1] - b_13) * (i_4 & 0xff)) * i_6 >> 6;
            i_4 += i_11;
        }

        if (i_11 == 0 || (i_71 = i_5 + (i_11 + (i_9 - i_4) - 1) / i_11) > i_8) {
            i_71 = i_8;
        }

        for (i_13 = i_12; i_5 < i_71; i_4 += i_11) {
            b_13 = bytes_2[i_4 >> 8];
            i_10001 = i_5++;
            ints_3[i_10001] += ((b_13 << 8) + (i_13 - b_13) * (i_4 & 0xff)) * i_6 >> 6;
        }

        class282_sub15_sub5_sub2_10.nodeIndex = i_4;
        return i_5;
    }

    static int method15998(int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, SoundEffectNode_2 class282_sub15_sub5_sub2_10, int i_11, int i_12) {
        int i_71 = i_7;
        int i_13 = i_1;
        if (i_11 == 0 || (i_71 = i_5 + (i_11 + (i_9 + 256 - i_4)) / i_11) > i_8) {
            i_71 = i_8;
        }

        int i_10001;
        while (i_5 < i_71) {
            i_13 = i_4 >> 8;
            byte b_13 = bytes_2[i_13 - 1];
            i_10001 = i_5++;
            ints_3[i_10001] += ((b_13 << 8) + (bytes_2[i_13] - b_13) * (i_4 & 0xff)) * i_6 >> 6;
            i_4 += i_11;
        }

        if (i_11 == 0 || (i_71 = i_5 + (i_11 + (i_9 - i_4)) / i_11) > i_8) {
            i_71 = i_8;
        }

        int i_01 = i_12;

        for (i_13 = i_11; i_5 < i_71; i_4 += i_13) {
            i_10001 = i_5++;
            ints_3[i_10001] += ((i_01 << 8) + (bytes_2[i_4 >> 8] - i_01) * (i_4 & 0xff)) * i_6 >> 6;
        }

        class282_sub15_sub5_sub2_10.nodeIndex = i_4;
        return i_5;
    }

    static int method15999(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, SoundEffectNode_2 class282_sub15_sub5_sub2_11, int i_12, int i_13) {
        int i_81 = i_8;
        int i_11 = i_1;
        int i_01 = i_0;
        if (i_12 == 0 || (i_81 = i_5 + (i_10 + 256 - i_4 + i_12) / i_12) > i_9) {
            i_81 = i_9;
        }

        i_5 <<= 1;

        int i_10001;
        for (i_81 <<= 1; i_5 < i_81; i_4 += i_12) {
            i_11 = i_4 >> 8;
            byte b_14 = bytes_2[i_11 - 1];
            i_01 = (bytes_2[i_11] - b_14) * (i_4 & 0xff) + (b_14 << 8);
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_6 >> 6;
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_7 >> 6;
        }

        if (i_12 == 0 || (i_81 = (i_5 >> 1) + (i_10 - i_4 + i_12) / i_12) > i_9) {
            i_81 = i_9;
        }

        i_81 <<= 1;

        for (i_11 = i_13; i_5 < i_81; i_4 += i_12) {
            i_01 = (i_11 << 8) + (i_4 & 0xff) * (bytes_2[i_4 >> 8] - i_11);
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_6 >> 6;
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_7 >> 6;
        }

        class282_sub15_sub5_sub2_11.nodeIndex = i_4;
        return i_5 >> 1;
    }

    static int method16000(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, SoundEffectNode_2 class282_sub15_sub5_sub2_9) {
        int i_61 = i_6;
        i_2 >>= 8;
        i_8 >>= 8;
        i_4 <<= 2;
        i_5 <<= 2;
        if ((i_61 = i_3 + i_8 - i_2) > i_7) {
            i_61 = i_7;
        }

        class282_sub15_sub5_sub2_9.anInt9845 += class282_sub15_sub5_sub2_9.anInt9852 * (i_61 - i_3);
        class282_sub15_sub5_sub2_9.anInt9850 += class282_sub15_sub5_sub2_9.anInt9851 * (i_61 - i_3);

        int i_10001;
        for (i_61 -= 3; i_3 < i_61; i_4 += i_5) {
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
        }

        for (i_61 += 3; i_3 < i_61; i_4 += i_5) {
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
        }

        class282_sub15_sub5_sub2_9.anInt9848 = i_4 >> 2;
        class282_sub15_sub5_sub2_9.nodeIndex = i_2 << 8;
        return i_3;
    }

    static int method16001(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, SoundEffectNode_2 class282_sub15_sub5_sub2_12) {
        int i_91 = i_9;
        i_3 >>= 8;
        i_11 >>= 8;
        i_5 <<= 2;
        i_6 <<= 2;
        i_7 <<= 2;
        i_8 <<= 2;
        if ((i_91 = i_11 + i_4 - i_3) > i_10) {
            i_91 = i_10;
        }

        class282_sub15_sub5_sub2_12.anInt9848 += class282_sub15_sub5_sub2_12.anInt9849 * (i_91 - i_4);
        i_4 <<= 1;
        i_91 <<= 1;

        byte b_13;
        int i_10001;
        for (i_91 -= 6; i_4 < i_91; i_6 += i_8) {
            b_13 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
            i_6 += i_8;
            b_13 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
            i_6 += i_8;
            b_13 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
            i_6 += i_8;
            b_13 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
        }

        for (i_91 += 6; i_4 < i_91; i_6 += i_8) {
            b_13 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
        }

        class282_sub15_sub5_sub2_12.anInt9845 = i_5 >> 2;
        class282_sub15_sub5_sub2_12.anInt9850 = i_6 >> 2;
        class282_sub15_sub5_sub2_12.nodeIndex = i_3 << 8;
        return i_4 >> 1;
    }

    static int method16002(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, SoundEffectNode_2 class282_sub15_sub5_sub2_9) {
        int i_61 = i_6;
        i_2 >>= 8;
        i_8 >>= 8;
        i_4 <<= 2;
        i_5 <<= 2;
        if ((i_61 = i_3 + i_2 - (i_8 - 1)) > i_7) {
            i_61 = i_7;
        }

        class282_sub15_sub5_sub2_9.anInt9845 += class282_sub15_sub5_sub2_9.anInt9852 * (i_61 - i_3);
        class282_sub15_sub5_sub2_9.anInt9850 += class282_sub15_sub5_sub2_9.anInt9851 * (i_61 - i_3);

        int i_10001;
        for (i_61 -= 3; i_3 < i_61; i_4 += i_5) {
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
        }

        for (i_61 += 3; i_3 < i_61; i_4 += i_5) {
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
        }

        class282_sub15_sub5_sub2_9.anInt9848 = i_4 >> 2;
        class282_sub15_sub5_sub2_9.nodeIndex = i_2 << 8;
        return i_3;
    }

    static int method16003(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, SoundEffectNode_2 class282_sub15_sub5_sub2_12) {
        int i_91 = i_9;
        i_3 >>= 8;
        i_11 >>= 8;
        i_5 <<= 2;
        i_6 <<= 2;
        i_7 <<= 2;
        i_8 <<= 2;
        if ((i_91 = i_3 + i_4 - (i_11 - 1)) > i_10) {
            i_91 = i_10;
        }

        class282_sub15_sub5_sub2_12.anInt9848 += class282_sub15_sub5_sub2_12.anInt9849 * (i_91 - i_4);
        i_4 <<= 1;
        i_91 <<= 1;

        byte b_13;
        int i_10001;
        for (i_91 -= 6; i_4 < i_91; i_6 += i_8) {
            b_13 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
            i_6 += i_8;
            b_13 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
            i_6 += i_8;
            b_13 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
            i_6 += i_8;
            b_13 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
        }

        for (i_91 += 6; i_4 < i_91; i_6 += i_8) {
            b_13 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
        }

        class282_sub15_sub5_sub2_12.anInt9845 = i_5 >> 2;
        class282_sub15_sub5_sub2_12.anInt9850 = i_6 >> 2;
        class282_sub15_sub5_sub2_12.nodeIndex = i_3 << 8;
        return i_4 >> 1;
    }

    static int method16004(int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, SoundEffectNode_2 class282_sub15_sub5_sub2_11, int i_12, int i_13) {
        int i_81 = i_8;
        int i_11 = i_1;
        class282_sub15_sub5_sub2_11.anInt9845 -= class282_sub15_sub5_sub2_11.anInt9852 * i_5;
        class282_sub15_sub5_sub2_11.anInt9850 -= class282_sub15_sub5_sub2_11.anInt9851 * i_5;
        if (i_12 == 0 || (i_81 = i_5 + (i_10 - i_4 + i_12 - 257) / i_12) > i_9) {
            i_81 = i_9;
        }

        byte b_14;
        int i_10001;
        while (i_5 < i_81) {
            i_11 = i_4 >> 8;
            b_14 = bytes_2[i_11];
            i_10001 = i_5++;
            ints_3[i_10001] += ((b_14 << 8) + (bytes_2[i_11 + 1] - b_14) * (i_4 & 0xff)) * i_6 >> 6;
            i_6 += i_7;
            i_4 += i_12;
        }

        if (i_12 == 0 || (i_81 = i_5 + (i_10 - i_4 + i_12 - 1) / i_12) > i_9) {
            i_81 = i_9;
        }

        for (i_11 = i_13; i_5 < i_81; i_4 += i_12) {
            b_14 = bytes_2[i_4 >> 8];
            i_10001 = i_5++;
            ints_3[i_10001] += ((b_14 << 8) + (i_11 - b_14) * (i_4 & 0xff)) * i_6 >> 6;
            i_6 += i_7;
        }

        class282_sub15_sub5_sub2_11.anInt9845 += class282_sub15_sub5_sub2_11.anInt9852 * i_5;
        class282_sub15_sub5_sub2_11.anInt9850 += class282_sub15_sub5_sub2_11.anInt9851 * i_5;
        class282_sub15_sub5_sub2_11.anInt9848 = i_6;
        class282_sub15_sub5_sub2_11.nodeIndex = i_4;
        return i_5;
    }

    static int method16005(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, SoundEffectNode_2 class282_sub15_sub5_sub2_13, int i_14, int i_15) {
        int i_101 = i_10;
        int i_13 = i_1;
        int i_01 = i_0;
        class282_sub15_sub5_sub2_13.anInt9848 -= i_5 * class282_sub15_sub5_sub2_13.anInt9849;
        if (i_14 == 0 || (i_101 = i_5 + (i_12 - i_4 + i_14 - 257) / i_14) > i_11) {
            i_101 = i_11;
        }

        i_5 <<= 1;

        byte b_16;
        int i_10001;
        for (i_101 <<= 1; i_5 < i_101; i_4 += i_14) {
            i_13 = i_4 >> 8;
            b_16 = bytes_2[i_13];
            i_01 = (b_16 << 8) + (i_4 & 0xff) * (bytes_2[i_13 + 1] - b_16);
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_6 >> 6;
            i_6 += i_8;
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_7 >> 6;
            i_7 += i_9;
        }

        if (i_14 == 0 || (i_101 = (i_5 >> 1) + (i_12 - i_4 + i_14 - 1) / i_14) > i_11) {
            i_101 = i_11;
        }

        i_101 <<= 1;

        for (i_13 = i_15; i_5 < i_101; i_4 += i_14) {
            b_16 = bytes_2[i_4 >> 8];
            i_01 = (b_16 << 8) + (i_13 - b_16) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_6 >> 6;
            i_6 += i_8;
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_7 >> 6;
            i_7 += i_9;
        }

        i_5 >>= 1;
        class282_sub15_sub5_sub2_13.anInt9848 += class282_sub15_sub5_sub2_13.anInt9849 * i_5;
        class282_sub15_sub5_sub2_13.anInt9845 = i_6;
        class282_sub15_sub5_sub2_13.anInt9850 = i_7;
        class282_sub15_sub5_sub2_13.nodeIndex = i_4;
        return i_5;
    }

    static int method16006(int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, SoundEffectNode_2 class282_sub15_sub5_sub2_11, int i_12, int i_13) {
        int i_81 = i_8;
        int i_11 = i_1;
        class282_sub15_sub5_sub2_11.anInt9845 -= class282_sub15_sub5_sub2_11.anInt9852 * i_5;
        class282_sub15_sub5_sub2_11.anInt9850 -= class282_sub15_sub5_sub2_11.anInt9851 * i_5;
        if (i_12 == 0 || (i_81 = i_5 + (i_10 + 256 - i_4 + i_12) / i_12) > i_9) {
            i_81 = i_9;
        }

        int i_10001;
        while (i_5 < i_81) {
            i_11 = i_4 >> 8;
            byte b_14 = bytes_2[i_11 - 1];
            i_10001 = i_5++;
            ints_3[i_10001] += ((b_14 << 8) + (bytes_2[i_11] - b_14) * (i_4 & 0xff)) * i_6 >> 6;
            i_6 += i_7;
            i_4 += i_12;
        }

        if (i_12 == 0 || (i_81 = i_5 + (i_10 - i_4 + i_12) / i_12) > i_9) {
            i_81 = i_9;
        }

        int i_01 = i_13;

        for (i_11 = i_12; i_5 < i_81; i_4 += i_11) {
            i_10001 = i_5++;
            ints_3[i_10001] += ((i_01 << 8) + (bytes_2[i_4 >> 8] - i_01) * (i_4 & 0xff)) * i_6 >> 6;
            i_6 += i_7;
        }

        class282_sub15_sub5_sub2_11.anInt9845 += class282_sub15_sub5_sub2_11.anInt9852 * i_5;
        class282_sub15_sub5_sub2_11.anInt9850 += class282_sub15_sub5_sub2_11.anInt9851 * i_5;
        class282_sub15_sub5_sub2_11.anInt9848 = i_6;
        class282_sub15_sub5_sub2_11.nodeIndex = i_4;
        return i_5;
    }

    static int method16007(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, SoundEffectNode_2 class282_sub15_sub5_sub2_13, int i_14, int i_15) {
        int i_101 = i_10;
        int i_13 = i_1;
        int i_01 = i_0;
        class282_sub15_sub5_sub2_13.anInt9848 -= i_5 * class282_sub15_sub5_sub2_13.anInt9849;
        if (i_14 == 0 || (i_101 = i_5 + (i_12 + 256 - i_4 + i_14) / i_14) > i_11) {
            i_101 = i_11;
        }

        i_5 <<= 1;

        int i_10001;
        for (i_101 <<= 1; i_5 < i_101; i_4 += i_14) {
            i_13 = i_4 >> 8;
            byte b_16 = bytes_2[i_13 - 1];
            i_01 = (bytes_2[i_13] - b_16) * (i_4 & 0xff) + (b_16 << 8);
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_6 >> 6;
            i_6 += i_8;
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_7 >> 6;
            i_7 += i_9;
        }

        if (i_14 == 0 || (i_101 = (i_5 >> 1) + (i_12 - i_4 + i_14) / i_14) > i_11) {
            i_101 = i_11;
        }

        i_101 <<= 1;

        for (i_13 = i_15; i_5 < i_101; i_4 += i_14) {
            i_01 = (i_13 << 8) + (i_4 & 0xff) * (bytes_2[i_4 >> 8] - i_13);
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_6 >> 6;
            i_6 += i_8;
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_7 >> 6;
            i_7 += i_9;
        }

        i_5 >>= 1;
        class282_sub15_sub5_sub2_13.anInt9848 += class282_sub15_sub5_sub2_13.anInt9849 * i_5;
        class282_sub15_sub5_sub2_13.anInt9845 = i_6;
        class282_sub15_sub5_sub2_13.anInt9850 = i_7;
        class282_sub15_sub5_sub2_13.nodeIndex = i_4;
        return i_5;
    }

    static int method16019(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, SoundEffectNode_2 class282_sub15_sub5_sub2_11, int i_12, int i_13) {
        int i_81 = i_8;
        int i_11 = i_1;
        int i_01 = i_0;
        if (i_12 == 0 || (i_81 = i_5 + (i_10 - i_4 + i_12 - 257) / i_12) > i_9) {
            i_81 = i_9;
        }

        i_5 <<= 1;

        byte b_14;
        int i_10001;
        for (i_81 <<= 1; i_5 < i_81; i_4 += i_12) {
            i_11 = i_4 >> 8;
            b_14 = bytes_2[i_11];
            i_01 = (b_14 << 8) + (i_4 & 0xff) * (bytes_2[i_11 + 1] - b_14);
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_6 >> 6;
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_7 >> 6;
        }

        if (i_12 == 0 || (i_81 = (i_5 >> 1) + (i_10 - i_4 + i_12 - 1) / i_12) > i_9) {
            i_81 = i_9;
        }

        i_81 <<= 1;

        for (i_11 = i_13; i_5 < i_81; i_4 += i_12) {
            b_14 = bytes_2[i_4 >> 8];
            i_01 = (b_14 << 8) + (i_11 - b_14) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_6 >> 6;
            i_10001 = i_5++;
            ints_3[i_10001] += i_01 * i_7 >> 6;
        }

        class282_sub15_sub5_sub2_11.nodeIndex = i_4;
        return i_5 >> 1;
    }

    static int method16031(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, SoundEffectNode_2 class282_sub15_sub5_sub2_10) {
        int i_71 = i_7;
        i_3 >>= 8;
        i_9 >>= 8;
        i_5 <<= 2;
        i_6 <<= 2;
        if ((i_71 = i_4 + i_9 - i_3) > i_8) {
            i_71 = i_8;
        }

        i_4 <<= 1;
        i_71 <<= 1;

        int i_10001;
        byte b_11;
        for (i_71 -= 6; i_4 < i_71; ints_2[i_10001] += b_11 * i_6) {
            b_11 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_6;
            b_11 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_6;
            b_11 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_6;
            b_11 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
        }

        for (i_71 += 6; i_4 < i_71; ints_2[i_10001] += b_11 * i_6) {
            b_11 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
        }

        class282_sub15_sub5_sub2_10.nodeIndex = i_3 << 8;
        return i_4 >> 1;
    }

    @Override
    public synchronized void method12230(int[] ints_1, int i_2, int i_3) {
        if (volume == 0 && anInt9858 == 0) {
            method12231(i_3);
        } else {
            int i_4 = anInt9844 << 8;
            int i_5 = duration << 8;
            int i_6 = ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer.length << 8;
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

            if (nodeIndex >= i_6) {
                if (anInt9855 >= 0) {
                    method15354();
                    unlink();
                    return;
                }

                nodeIndex = i_6 - 1;
            }

            if (anInt9854 < 0) {
                if (aBoolNormFalse9857) {
                    if (anInt9855 < 0) {
                        i_8 = method16018(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844]);
                        if (nodeIndex >= i_4) {
                            return;
                        }

                        nodeIndex = i_4 + i_4 - 1 - nodeIndex;
                        anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                    }

                    while (true) {
                        i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration - 1]);
                        if (nodeIndex < i_5) {
                            break;
                        }

                        nodeIndex = i_5 + i_5 - 1 - nodeIndex;
                        anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                        i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844]);
                        if (nodeIndex >= i_4) {
                            break;
                        }

                        nodeIndex = i_4 + i_4 - 1 - nodeIndex;
                        anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                    }
                } else if (anInt9855 < 0) {
                    while (true) {
                        i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration - 1]);
                        if (nodeIndex >= i_4) {
                            break;
                        }

                        nodeIndex = i_5 - 1 - (i_5 - 1 - nodeIndex) % i_7;
                    }
                } else {
                    while (true) {
                        i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844]);
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
                                i_8 = method16018(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844]);
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
                                i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration - 1]);
                                if (nodeIndex < i_5) {
                                    return;
                                }

                                nodeIndex = i_5 + i_5 - 1 - nodeIndex;
                                anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                                if (--anInt9854 == 0) {
                                    break;
                                }

                                i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844]);
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
                                i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration - 1]);
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
                                i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844]);
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
                    method16018(ints_1, i_8, 0, i_3, 0);
                    if (nodeIndex < 0) {
                        nodeIndex = -1;
                        method15354();
                        unlink();
                    }
                } else {
                    method15990(ints_1, i_8, i_6, i_3, 0);
                    if (nodeIndex >= i_6) {
                        nodeIndex = i_6;
                        method15354();
                        unlink();
                    }
                }
            }
        }

    }

    int method15990(int[] ints_1, int i_2, int i_3, int i_4, int i_5) {
        do {
            if (anInt9858 <= 0) {
                if (anInt9855 == 256 && (nodeIndex & 0xff) == 0) {
                    if (Class253.isStereo) {
                        return method16031(((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9845, anInt9850, 0, i_4, i_3, this);
                    }

                    return method15992(((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9848, 0, i_4, i_3, this);
                }

                if (Class253.isStereo) {
                    return method16019(0, 0, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9845, anInt9850, 0, i_4, i_3, this, anInt9855, i_5);
                }

                return method15996(0, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9848, 0, i_4, i_3, this, anInt9855, i_5);
            }

            int i_6 = i_2 + anInt9858;
            if (i_6 > i_4) {
                i_6 = i_4;
            }

            anInt9858 += i_2;
            if (anInt9855 == 256 && (nodeIndex & 0xff) == 0) {
                if (Class253.isStereo) {
                    i_2 = method16001(((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9845, anInt9850, anInt9852, anInt9851, 0, i_6, i_3, this);
                } else {
                    i_2 = method16000(((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9848, anInt9849, 0, i_6, i_3, this);
                }
            } else if (Class253.isStereo) {
                i_2 = method16005(0, 0, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9845, anInt9850, anInt9852, anInt9851, 0, i_6, i_3, this, anInt9855, i_5);
            } else {
                i_2 = method16004(0, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9848, anInt9849, 0, i_6, i_3, this, anInt9855, i_5);
            }

            anInt9858 -= i_2;
            if (anInt9858 != 0) {
                return i_2;
            }
        } while (!method15324());

        return i_4;
    }

    @Override
    public synchronized void method12240(int[] ints_1, int i_2, int i_3) {
        if (volume * -298675253 * -1302038045 == 0 && anInt9858 * 1156515807 * 1008956447 == 0) {
            method12231(i_3);
        } else {
            int i_4 = anInt9844 * 900940833 * -99794975 << 8;
            int i_5 = duration * -628161865 * -1048610041 << 8;
            int i_6 = ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer.length << 8;
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
                        i_8 = method16018(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            return;
                        }

                        nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    }

                    while (true) {
                        i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration * -628161865 * -1048610041 - 1]);
                        if (nodeIndex * -834443097 * -354697449 < i_5) {
                            break;
                        }

                        nodeIndex = (i_5 + i_5 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                        i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            break;
                        }

                        nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    }
                } else if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                    while (true) {
                        i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration * -628161865 * -1048610041 - 1]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            break;
                        }

                        nodeIndex = (i_5 - 1 - (i_5 - 1 - nodeIndex * -834443097 * -354697449) % i_7) * -834443097 * -354697449;
                    }
                } else {
                    while (true) {
                        i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
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
                                i_8 = method16018(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
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
                                i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration * -628161865 * -1048610041 - 1]);
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

                                i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
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
                                i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration * -628161865 * -1048610041 - 1]);
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
                                i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
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
                    method16018(ints_1, i_8, 0, i_3, 0);
                    if (nodeIndex * -834443097 * -354697449 < 0) {
                        nodeIndex = 834443097 * -354697449;
                        method15354();
                        unlink();
                    }
                } else {
                    method15990(ints_1, i_8, i_6, i_3, 0);
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
    public synchronized void method12241(int[] ints_1, int i_2, int i_3) {
        if (volume * -298675253 * -1302038045 == 0 && anInt9858 * 1156515807 * 1008956447 == 0) {
            method12231(i_3);
        } else {
            int i_4 = anInt9844 * 900940833 * -99794975 << 8;
            int i_5 = duration * -628161865 * -1048610041 << 8;
            int i_6 = ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer.length << 8;
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
                        i_8 = method16018(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            return;
                        }

                        nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    }

                    while (true) {
                        i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration * -628161865 * -1048610041 - 1]);
                        if (nodeIndex * -834443097 * -354697449 < i_5) {
                            break;
                        }

                        nodeIndex = (i_5 + i_5 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                        i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            break;
                        }

                        nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    }
                } else if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                    while (true) {
                        i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration * -628161865 * -1048610041 - 1]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            break;
                        }

                        nodeIndex = (i_5 - 1 - (i_5 - 1 - nodeIndex * -834443097 * -354697449) % i_7) * -834443097 * -354697449;
                    }
                } else {
                    while (true) {
                        i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
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
                                i_8 = method16018(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
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
                                i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration * -628161865 * -1048610041 - 1]);
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

                                i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
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
                                i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration * -628161865 * -1048610041 - 1]);
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
                                i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
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
                    method16018(ints_1, i_8, 0, i_3, 0);
                    if (nodeIndex * -834443097 * -354697449 < 0) {
                        nodeIndex = 834443097 * -354697449;
                        method15354();
                        unlink();
                    }
                } else {
                    method15990(ints_1, i_8, i_6, i_3, 0);
                    if (nodeIndex * -834443097 * -354697449 >= i_6) {
                        nodeIndex = i_6 * -834443097 * -354697449;
                        method15354();
                        unlink();
                    }
                }
            }
        }

    }

    int method16018(int[] ints_1, int i_2, int i_3, int i_4, int i_5) {
        do {
            if (anInt9858 <= 0) {
                if (anInt9855 == -256 && (nodeIndex & 0xff) == 0) {
                    if (Class253.isStereo) {
                        return method15995(((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9845, anInt9850, 0, i_4, i_3, this);
                    }

                    return method15991(((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9848, 0, i_4, i_3, this);
                }

                if (Class253.isStereo) {
                    return method15999(0, 0, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9845, anInt9850, 0, i_4, i_3, this, anInt9855, i_5);
                }

                return method15998(0, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9848, 0, i_4, i_3, this, anInt9855, i_5);
            }

            int i_6 = i_2 + anInt9858;
            if (i_6 > i_4) {
                i_6 = i_4;
            }

            anInt9858 += i_2;
            if (anInt9855 == -256 && (nodeIndex & 0xff) == 0) {
                if (Class253.isStereo) {
                    i_2 = method16003(((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9845, anInt9850, anInt9852, anInt9851, 0, i_6, i_3, this);
                } else {
                    i_2 = method16002(((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9848, anInt9849, 0, i_6, i_3, this);
                }
            } else if (Class253.isStereo) {
                i_2 = method16007(0, 0, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9845, anInt9850, anInt9852, anInt9851, 0, i_6, i_3, this, anInt9855, i_5);
            } else {
                i_2 = method16006(0, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer, ints_1, nodeIndex, i_2, anInt9848, anInt9849, 0, i_6, i_3, this, anInt9855, i_5);
            }

            anInt9858 -= i_2;
            if (anInt9858 != 0) {
                return i_2;
            }
        } while (!method15324());

        return i_4;
    }

    @Override
    public synchronized void method12242(int[] ints_1, int i_2, int i_3) {
        if (volume * -298675253 * -1302038045 == 0 && anInt9858 * 1156515807 * 1008956447 == 0) {
            method12231(i_3);
        } else {
            int i_4 = anInt9844 * 900940833 * -99794975 << 8;
            int i_5 = duration * -628161865 * -1048610041 << 8;
            int i_6 = ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer.length << 8;
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
                        i_8 = method16018(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            return;
                        }

                        nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    }

                    while (true) {
                        i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration * -628161865 * -1048610041 - 1]);
                        if (nodeIndex * -834443097 * -354697449 < i_5) {
                            break;
                        }

                        nodeIndex = (i_5 + i_5 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                        i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            break;
                        }

                        nodeIndex = (i_4 + i_4 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                        anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    }
                } else if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                    while (true) {
                        i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration * -628161865 * -1048610041 - 1]);
                        if (nodeIndex * -834443097 * -354697449 >= i_4) {
                            break;
                        }

                        nodeIndex = (i_5 - 1 - (i_5 - 1 - nodeIndex * -834443097 * -354697449) % i_7) * -834443097 * -354697449;
                    }
                } else {
                    while (true) {
                        i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
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
                                i_8 = method16018(ints_1, i_2, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
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
                                i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration * -628161865 * -1048610041 - 1]);
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

                                i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
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
                                i_8 = method16018(ints_1, i_8, i_4, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[duration * -628161865 * -1048610041 - 1]);
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
                                i_8 = method15990(ints_1, i_8, i_5, i_3, ((AudioFormatUnknown) nodeWithAudioBuffer26).audioBuffer[anInt9844 * 900940833 * -99794975]);
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
                    method16018(ints_1, i_8, 0, i_3, 0);
                    if (nodeIndex * -834443097 * -354697449 < 0) {
                        nodeIndex = 834443097 * -354697449;
                        method15354();
                        unlink();
                    }
                } else {
                    method15990(ints_1, i_8, i_6, i_3, 0);
                    if (nodeIndex * -834443097 * -354697449 >= i_6) {
                        nodeIndex = i_6 * -834443097 * -354697449;
                        method15354();
                        unlink();
                    }
                }
            }
        }

    }

}
