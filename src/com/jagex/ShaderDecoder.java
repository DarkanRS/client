package com.jagex;

public class ShaderDecoder {

    static Class253 aClass253_1008;
    byte[] data;
    int decoderIndex;

    ShaderDecoder(byte[] bytes_1) {
        this.data = bytes_1;
        this.decoderIndex = 0;
    }

    int getNextStringLength() {
        short s_2 = 0;
        for (int i_3 = 0; i_3 < 2; i_3++) {
            s_2 = (short) (s_2 | (this.data[++this.decoderIndex - 1] & 0xff) << i_3 * 8);
        }
        return s_2;
    }

    String readString() {
        int length = this.getNextStringLength();
        if (length == -1) {
            return null;
        } else if (length > 256) {
            throw new RuntimeException_Sub4();
        } else {
            String str = new String(this.data, this.decoderIndex, length);
            this.decoderIndex += length;
            return str;
        }
    }

    public static void sortAlphabetically(String[] names, short[] ids) {
        Class88.method1495(names, ids, 0, names.length - 1);
    }
}
