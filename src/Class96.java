public abstract class Class96 {

    public int anInt992;

    public abstract void method1592(int var1);

    void method1593(byte b_1) {
    }

    Class96(RsByteBuffer rsbytebuffer_1) {
        this.anInt992 = rsbytebuffer_1.readUnsignedShort();
    }

    boolean method1599(int i_1) {
        return true;
    }

    public abstract void method1601();

    public static Interface method1605(int i_0, byte b_1) {
        return Class468_Sub8.aClass98Array7889[i_0 >> 16];
    }

    public static void method1607(byte b_0) {
        Class61.aClass160_647 = null;
        Class60.aClass160_612 = null;
        Class467.aClass160_5576 = null;
        ParamDefinitions.aClass160_5339 = null;
        Class290.aClass160_3452 = null;
        Class354.aClass160_4110 = null;
        Class125.aClass160_1571 = null;
        Class149_Sub2.aClass160_9315 = null;
        Class186.aClass8_2348 = null;
        Class176.aClass414_2200 = null;
    }

    static final String method1609(String string_0, String string_1, String string_2, int i_3) {
        for (int i_4 = string_0.indexOf(string_1); i_4 != -1; i_4 = string_0.indexOf(string_1, i_4 + string_2.length())) {
            string_0 = string_0.substring(0, i_4) + string_2 + string_0.substring(i_4 + string_1.length());
        }
        return string_0;
    }
}
