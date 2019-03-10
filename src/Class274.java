public class Class274 {

    protected static Class470 aClass470_3336;

    int anInt3334;

    int anInt3338;

    int anInt3333;

    int anInt3335;

    String aString3337;

    int method4868(short s_1) {
        return this.anInt3333;
    }

    String method4870(int i_1) {
        return this.aString3337;
    }

    int method4871(int i_1) {
        return this.anInt3334;
    }

    int method4872(byte b_1) {
        return this.anInt3335;
    }

    int method4877(byte b_1) {
        return this.anInt3338;
    }

    public Class274(int i_1, int i_2, int i_3, int i_4, String string_5) {
        this.anInt3334 = i_1;
        this.anInt3338 = i_2;
        this.anInt3333 = i_3;
        this.anInt3335 = i_4;
        this.aString3337 = string_5;
    }

    static final void method4883(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2, CS2Executor cs2executor_3, int i_4) {
        if (icomponentdefinitions_0.anIntArray1267 == null) {
            if (i_2 <= 0) {
                return;
            }
            icomponentdefinitions_0.aByteArrayArray1366 = new byte[11][];
            icomponentdefinitions_0.aByteArrayArray1367 = new byte[11][];
            icomponentdefinitions_0.anIntArray1395 = new int[11];
            icomponentdefinitions_0.anIntArray1267 = new int[11];
        }
        icomponentdefinitions_0.anIntArray1267[i_1] = i_2;
        if (i_2 > 0) {
            icomponentdefinitions_0.aBool1424 = true;
        } else {
            icomponentdefinitions_0.aBool1424 = false;
            for (int i_5 = 0; i_5 < icomponentdefinitions_0.aByteArrayArray1366.length; i_5++) {
                if (icomponentdefinitions_0.aByteArrayArray1366[i_5] != null || icomponentdefinitions_0.anIntArray1267[i_5] > 0) {
                    icomponentdefinitions_0.aBool1424 = true;
                    break;
                }
            }
        }
    }

    public static void method4884(byte b_0) {
        if (Class448.aClass450_5421.worldId != -1) {
            Class62.method1262(Class448.aClass450_5421.worldId, Class448.aClass450_5421.aString5433, (byte) 0);
        }
    }
}
