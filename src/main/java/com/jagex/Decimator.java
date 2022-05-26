package com.jagex;

public class Decimator {

    int inputRate;

    int outputRate;

    int[][] table;

    public Decimator(int inputRate, int outputRate) {
        if (outputRate != inputRate) {
            int scale = CutsceneAction_Sub15.scale(inputRate, outputRate);
            inputRate /= scale;
            outputRate /= scale;
            this.inputRate = inputRate;
            this.outputRate = outputRate;
            table = new int[inputRate][14];
            for (int i_4 = 0; i_4 < inputRate; i_4++) {
                int[] ints_5 = table[i_4];
                double d_6 = (double) i_4 / inputRate + 6.0D;
                int i_8 = (int) Math.floor(d_6 - 7.0D + 1.0D);
                if (i_8 < 0) {
                    i_8 = 0;
                }
                int i_9 = (int) Math.ceil(7.0D + d_6);
                if (i_9 > 14) {
                    i_9 = 14;
                }
                for (double d_10 = (double) outputRate / inputRate; i_8 < i_9; i_8++) {
                    double d_12 = (i_8 - d_6) * 3.141592653589793D;
                    double d_14 = d_10;
                    if (d_12 < -1.0E-4 || d_12 > 1.0E-4D) {
                        d_14 = d_10 * (Math.sin(d_12) / d_12);
                    }
                    d_14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * (i_8 - d_6));
                    ints_5[i_8] = (int) Math.floor(d_14 * 65536.0D + 0.5D);
                }
            }
        }
    }

    byte[] resampleBytes(byte[] bytes_1) {
        byte[] bytes_11 = bytes_1;
        if (table != null) {
            int i_3 = (int) ((long) outputRate * bytes_11.length / inputRate) + 14;
            int[] ints_4 = new int[i_3];
            int i_5 = 0;
            int i_6 = 0;
            int i_7;
            for (i_7 = 0; i_7 < bytes_11.length; i_7++) {
                byte b_8 = bytes_11[i_7];
                int[] ints_9 = table[i_6];
                int i_10;
                for (i_10 = 0; i_10 < 14; i_10++) {
                    ints_4[i_5 + i_10] += b_8 * ints_9[i_10];
                }
                i_6 += outputRate;
                i_10 = i_6 / inputRate;
                i_5 += i_10;
                i_6 -= i_10 * inputRate;
            }
            bytes_11 = new byte[i_3];
            for (i_7 = 0; i_7 < i_3; i_7++) {
                int i_11 = ints_4[i_7] + 32768 >> 16;
                if (i_11 < -128) {
                    bytes_11[i_7] = -128;
                } else if (i_11 > 127) {
                    bytes_11[i_7] = 127;
                } else {
                    bytes_11[i_7] = (byte) i_11;
                }
            }
        }
        return bytes_11;
    }

    public short[] resampleShorts(short[] shorts_1) {
        short[] shorts_11 = shorts_1;
        if (table != null) {
            int i_3 = (int) ((long) shorts_11.length * outputRate / inputRate) + 14;
            int[] ints_4 = new int[i_3];
            int i_5 = 0;
            int i_6 = 0;
            int i_7;
            for (i_7 = 0; i_7 < shorts_11.length; i_7++) {
                short s_8 = shorts_11[i_7];
                int[] ints_9 = table[i_6];
                int i_10;
                for (i_10 = 0; i_10 < 14; i_10++) {
                    ints_4[i_10 + i_5] += ints_9[i_10] * s_8 >> 2;
                }
                i_6 += outputRate;
                i_10 = i_6 / inputRate;
                i_5 += i_10;
                i_6 -= i_10 * inputRate;
            }
            shorts_11 = new short[i_3];
            for (i_7 = 0; i_7 < i_3; i_7++) {
                int i_11 = ints_4[i_7] + 8192 >> 14;
                if (i_11 < -32768) {
                    shorts_11[i_7] = -32768;
                } else if (i_11 > 32767) {
                    shorts_11[i_7] = 32767;
                } else {
                    shorts_11[i_7] = (short) i_11;
                }
            }
        }
        return shorts_11;
    }

    int scaleRate(int i_1) {
        if (table != null) {
            i_1 = (int) ((long) outputRate * i_1 / inputRate);
        }
        return i_1;
    }

    int scalePosition(int i_1) {
        if (table != null) {
            i_1 = (int) ((long) outputRate * i_1 / inputRate) + 6;
        }
        return i_1;
    }

	public static void kickFriendsChat(String string_0) {
	    if (Class467.FC_PLAYERS != null) {
	        BufferedConnectionContext class184_2 = BufferedConnectionContext.getConnectionContext();
	        TCPPacket tcpmessage_3 = TCPPacket.createPacket(ClientProt.FC_KICK, class184_2.outKeys);
	        tcpmessage_3.buffer.writeByte(ChatLine.getLength(string_0));
	        tcpmessage_3.buffer.writeString(string_0);
	        class184_2.queuePacket(tcpmessage_3);
	    }
	}
}
