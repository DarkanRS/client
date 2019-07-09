public class ShaderDecoder {

    static Class253 aClass253_1008;
    byte[] aByteArray1007;
    int anInt1006;

    ShaderDecoder(byte[] bytes_1) {
        this.aByteArray1007 = bytes_1;
        this.anInt1006 = 0;
    }

    int method1632(byte b_1) {
        short s_2 = 0;
        for (int i_3 = 0; i_3 < 2; i_3++) {
            s_2 = (short) (s_2 | (this.aByteArray1007[++this.anInt1006 - 1] & 0xff) << i_3 * 8);
        }
        return s_2;
    }

    String method1633() {
        int i_2 = this.method1632((byte) -122);
        if (i_2 == -1) {
            return null;
        } else if (i_2 > 256) {
            throw new RuntimeException_Sub4();
        } else {
            String string_3 = new String(this.aByteArray1007, this.anInt1006, i_2);
            this.anInt1006 += i_2;
            return string_3;
        }
    }

    public static void method1644(String[] arr_0, short[] shorts_1, short s_2) {
        Class88.method1495(arr_0, shorts_1, 0, arr_0.length - 1, -519753439);
    }
}
