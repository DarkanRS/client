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

    public static void method1644(String[] arr_0, short[] shorts_1, short s_2) {
        Class88.method1495(arr_0, shorts_1, 0, arr_0.length - 1, -519753439);
    }
}
