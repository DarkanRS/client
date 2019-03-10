public class Class413 implements Interface43 {

    static Class413 aClass413_4971 = new Class413(1, 0, "", "");

    static Class413 aClass413_4965 = new Class413(6, 1, "", "");

    static Class413 aClass413_4968 = new Class413(7, 2, "", "");

    static Class413 aClass413_4967 = new Class413(3, 3, "", "");

    static Class413 aClass413_4970 = new Class413(4, 4, "", "");

    static Class413 aClass413_4969 = new Class413(5, 5, "", "");

    static Class413 aClass413_4964 = new Class413(0, 6, "", "");

    static Class413 aClass413_4966;

    int anInt4972;

    int anInt4973;

    String aString4974;

    static {
        aClass413_4966 = new Class413(2, -1, "", "", true, new Class413[] { aClass413_4971, aClass413_4965, aClass413_4968, aClass413_4970, aClass413_4967 });
    }

    public int method243(byte b_1) {
        return this.anInt4973;
    }

    public String toString() {
        return this.aString4974;
    }

    Class413(int i_1, int i_2, String string_3, String string_4) {
        this.anInt4972 = i_1;
        this.anInt4973 = i_2;
        this.aString4974 = string_4;
    }

    Class413(int i_1, int i_2, String string_3, String string_4, boolean bool_5, Class413[] arr_6) {
        this.anInt4972 = i_1;
        this.anInt4973 = i_2;
        this.aString4974 = string_4;
    }

    public int method75() {
        return this.anInt4973 * -1733059543 * -1048592359;
    }

    public int method76() {
        return this.anInt4973 * -1733059543 * -1048592359;
    }

    static void method6939(byte b_0) {
        ItemContainer.aClass229_7712.method3859(1403175614);
    }

    static final void method6942(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
        if (client.method11633(icomponentdefinitions_0).continueOptionEnabled() && client.aClass118_7352 == null) {
            Class158_Sub2.method14355(icomponentdefinitions_0.idHash, icomponentdefinitions_0.anInt1288, -946546687);
            client.aClass118_7352 = Index.method5694(icomponentdefinitions_0.idHash, icomponentdefinitions_0.anInt1288, -1963750401);
            Class109.method1858(client.aClass118_7352, (byte) -38);
        }
    }
}
