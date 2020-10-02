package com.jagex;

public class Filter {

    static float[][] coefficient_float = new float[2][8];
    static int[][] coefficient_int = new int[2][8];
    static float invUnity_float;
    static int invUnity_int;
    int[] numPairs = new int[2];
    int[][][] pairPhase = new int[2][2][4];
    int[][][] pairMagnitude = new int[2][2][4];
    int[] unity = new int[2];

    static float normalize(float f) {
        float _f = 32.703197F * (float) Math.pow(2.0D, f);
        return _f * 3.1415927F / 11025.0F;
    }

    float adaptMagnitude(int dir, int k, float t) {
        float alpha = pairMagnitude[dir][0][k] + t * (pairMagnitude[dir][1][k] - pairMagnitude[dir][0][k]);
        alpha *= 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, -alpha / 20.0F);
    }

    float adaptPhase(int dir, int i, float t) {
        float _f = pairPhase[dir][0][i] + t * (pairPhase[dir][1][i] - pairPhase[dir][0][i]);
        _f *= 1.2207031E-4F;
        return normalize(_f);
    }

    void decode(ByteBuf buffer, Envelope envelope) {
        int count = buffer.readUnsignedByte();
        numPairs[0] = count >> 4;
        numPairs[1] = count & 0xf;
        if (count != 0) {
            unity[0] = buffer.readUnsignedShort();
            unity[1] = buffer.readUnsignedShort();
            int migrated = buffer.readUnsignedByte();

            for (int dir = 0; dir < 2; dir++) {
                for (int term = 0; term < numPairs[dir]; term++) {
                    pairPhase[dir][0][term] = buffer.readUnsignedShort();
                    pairMagnitude[dir][0][term] = buffer.readUnsignedShort();
                }
            }

            for (int dir = 0; dir < 2; dir++) {
                for (int phase = 0; phase < numPairs[dir]; phase++) {
                    if ((migrated & 1 << dir * 4 << phase) != 0) {
                        pairPhase[dir][1][phase] = buffer.readUnsignedShort();
                        pairMagnitude[dir][1][phase] = buffer.readUnsignedShort();
                    } else {
                        pairPhase[dir][1][phase] = pairPhase[dir][0][phase];
                        pairMagnitude[dir][1][phase] = pairMagnitude[dir][0][phase];
                    }
                }
            }

            if (migrated != 0 || unity[1] != unity[0]) {
                envelope.decodeShape(buffer);
            }
        } else {
            int[] placeholder = unity;
            unity[1] = 0;
            placeholder[0] = 0;
        }

    }

    int compute(int dir, float t) {
        if (dir == 0) {
            float a0 = unity[0] + (unity[1] - unity[0]) * t;
            a0 *= 0.0030517578F;
            invUnity_float = (float) Math.pow(0.1D, a0 / 20.0F);
            invUnity_int = (int) (invUnity_float * 65536.0F);
        }

        if (numPairs[dir] == 0) {
            return 0;
        } else {
            float f_3 = adaptMagnitude(dir, 0, t);
            coefficient_float[dir][0] = -2.0f * f_3 * (float) Math.cos(adaptPhase(dir, 0, t));
            coefficient_float[dir][1] = f_3 * f_3;

            int i_4;
            for (i_4 = 1; i_4 < numPairs[dir]; i_4++) {
                f_3 = adaptMagnitude(dir, i_4, t);
                float f_5 = -2.0f * f_3 * (float) Math.cos(adaptPhase(dir, i_4, t));
                float f_6 = f_3 * f_3;
                coefficient_float[dir][i_4 * 2 + 1] = coefficient_float[dir][i_4 * 2 - 1] * f_6;
                coefficient_float[dir][i_4 * 2] = coefficient_float[dir][i_4 * 2 - 1] * f_5 + coefficient_float[dir][i_4 * 2 - 2] * f_6;

                for (int i_7 = i_4 * 2 - 1; i_7 >= 2; --i_7) {
                    coefficient_float[dir][i_7] += coefficient_float[dir][i_7 - 1] * f_5 + coefficient_float[dir][i_7 - 2] * f_6;
                }

                coefficient_float[dir][1] += coefficient_float[dir][0] * f_5 + f_6;
                coefficient_float[dir][0] += f_5;
            }

            if (dir == 0) {
                for (i_4 = 0; i_4 < numPairs[0] * 2; i_4++) {
                    coefficient_float[0][i_4] *= invUnity_float;
                }
            }

            for (i_4 = 0; i_4 < numPairs[dir] * 2; i_4++) {
                coefficient_int[dir][i_4] = (int) (coefficient_float[dir][i_4] * 65536.0F);
            }

            return numPairs[dir] * 2;
        }
    }

}
