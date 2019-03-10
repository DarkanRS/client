public class Class246 {

    static String[] aStringArray3028;

    public static int anInt3029;

    Class246() throws Throwable {
        throw new Error();
    }

    public static Class461 method4203(int i_0, byte b_1) {
        Class461[] arr_2 = Class202.method3343(-757707497);
        for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
            Class461 class461_4 = arr_2[i_3];
            if (i_0 == class461_4.anInt5541) {
                return class461_4;
            }
        }
        return null;
    }

    static void method4204(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2, int i_3) {
        if (icomponentdefinitions_0.aByte1333 == 0) {
            icomponentdefinitions_0.anInt1299 = icomponentdefinitions_0.anInt1295;
        } else if (icomponentdefinitions_0.aByte1333 == 1) {
            icomponentdefinitions_0.anInt1299 = icomponentdefinitions_0.anInt1295 + (i_1 - icomponentdefinitions_0.anInt1301) / 2;
        } else if (icomponentdefinitions_0.aByte1333 == 2) {
            icomponentdefinitions_0.anInt1299 = i_1 - icomponentdefinitions_0.anInt1301 - icomponentdefinitions_0.anInt1295;
        } else if (icomponentdefinitions_0.aByte1333 == 3) {
            icomponentdefinitions_0.anInt1299 = icomponentdefinitions_0.anInt1295 * i_1 >> 14;
        } else if (icomponentdefinitions_0.aByte1333 == 4) {
            icomponentdefinitions_0.anInt1299 = (i_1 - icomponentdefinitions_0.anInt1301) / 2 + (icomponentdefinitions_0.anInt1295 * i_1 >> 14);
        } else {
            icomponentdefinitions_0.anInt1299 = i_1 - icomponentdefinitions_0.anInt1301 - (icomponentdefinitions_0.anInt1295 * i_1 >> 14);
        }
        if (icomponentdefinitions_0.aByte1355 == 0) {
            icomponentdefinitions_0.anInt1428 = icomponentdefinitions_0.anInt1296;
        } else if (icomponentdefinitions_0.aByte1355 == 1) {
            icomponentdefinitions_0.anInt1428 = (i_2 - icomponentdefinitions_0.anInt1429) / 2 + icomponentdefinitions_0.anInt1296;
        } else if (icomponentdefinitions_0.aByte1355 == 2) {
            icomponentdefinitions_0.anInt1428 = i_2 - icomponentdefinitions_0.anInt1429 - icomponentdefinitions_0.anInt1296;
        } else if (icomponentdefinitions_0.aByte1355 == 3) {
            icomponentdefinitions_0.anInt1428 = i_2 * icomponentdefinitions_0.anInt1296 >> 14;
        } else if (icomponentdefinitions_0.aByte1355 == 4) {
            icomponentdefinitions_0.anInt1428 = (i_2 - icomponentdefinitions_0.anInt1429) / 2 + (i_2 * icomponentdefinitions_0.anInt1296 >> 14);
        } else {
            icomponentdefinitions_0.anInt1428 = i_2 - icomponentdefinitions_0.anInt1429 - (i_2 * icomponentdefinitions_0.anInt1296 >> 14);
        }
        if (client.aBool7168 && (client.method11633(icomponentdefinitions_0).settings != 0 || icomponentdefinitions_0.anInt1268 == 0)) {
            if (icomponentdefinitions_0.anInt1299 < 0) {
                icomponentdefinitions_0.anInt1299 = 0;
            } else if (icomponentdefinitions_0.anInt1299 + icomponentdefinitions_0.anInt1301 > i_1) {
                icomponentdefinitions_0.anInt1299 = i_1 - icomponentdefinitions_0.anInt1301;
            }
            if (icomponentdefinitions_0.anInt1428 < 0) {
                icomponentdefinitions_0.anInt1428 = 0;
            } else if (icomponentdefinitions_0.anInt1429 + icomponentdefinitions_0.anInt1428 > i_2) {
                icomponentdefinitions_0.anInt1428 = i_2 - icomponentdefinitions_0.anInt1429;
            }
        }
    }
}
