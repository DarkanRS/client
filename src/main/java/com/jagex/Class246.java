package com.jagex;

public class Class246 {

    public static int CAM_MOVE_ABSOLUTEY;
    static String[] aStringArray3028;

    Class246() throws Throwable {
        throw new Error();
    }

    public static FriendStatus getFriendStatus(int i_0) {
        FriendStatus[] arr_2 = Connection.method3343();
        for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
            FriendStatus class461_4 = arr_2[i_3];
            if (i_0 == class461_4.id) {
                return class461_4;
            }
        }
        return null;
    }

    static void method4204(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2) {
        if (icomponentdefinitions_0.aspectXType == 0) {
            icomponentdefinitions_0.x = icomponentdefinitions_0.basePositionX;
        } else if (icomponentdefinitions_0.aspectXType == 1) {
            icomponentdefinitions_0.x = icomponentdefinitions_0.basePositionX + (i_1 - icomponentdefinitions_0.width) / 2;
        } else if (icomponentdefinitions_0.aspectXType == 2) {
            icomponentdefinitions_0.x = i_1 - icomponentdefinitions_0.width - icomponentdefinitions_0.basePositionX;
        } else if (icomponentdefinitions_0.aspectXType == 3) {
            icomponentdefinitions_0.x = icomponentdefinitions_0.basePositionX * i_1 >> 14;
        } else if (icomponentdefinitions_0.aspectXType == 4) {
            icomponentdefinitions_0.x = (i_1 - icomponentdefinitions_0.width) / 2 + (icomponentdefinitions_0.basePositionX * i_1 >> 14);
        } else {
            icomponentdefinitions_0.x = i_1 - icomponentdefinitions_0.width - (icomponentdefinitions_0.basePositionX * i_1 >> 14);
        }
        if (icomponentdefinitions_0.aspectYType == 0) {
            icomponentdefinitions_0.y = icomponentdefinitions_0.basePositionY;
        } else if (icomponentdefinitions_0.aspectYType == 1) {
            icomponentdefinitions_0.y = (i_2 - icomponentdefinitions_0.height) / 2 + icomponentdefinitions_0.basePositionY;
        } else if (icomponentdefinitions_0.aspectYType == 2) {
            icomponentdefinitions_0.y = i_2 - icomponentdefinitions_0.height - icomponentdefinitions_0.basePositionY;
        } else if (icomponentdefinitions_0.aspectYType == 3) {
            icomponentdefinitions_0.y = i_2 * icomponentdefinitions_0.basePositionY >> 14;
        } else if (icomponentdefinitions_0.aspectYType == 4) {
            icomponentdefinitions_0.y = (i_2 - icomponentdefinitions_0.height) / 2 + (i_2 * icomponentdefinitions_0.basePositionY >> 14);
        } else {
            icomponentdefinitions_0.y = i_2 - icomponentdefinitions_0.height - (i_2 * icomponentdefinitions_0.basePositionY >> 14);
        }
        if (client.aBool7168 && (client.getIComponentSettings(icomponentdefinitions_0).settingsHash != 0 || icomponentdefinitions_0.type == ComponentType.CONTAINER)) {
            if (icomponentdefinitions_0.x < 0) {
                icomponentdefinitions_0.x = 0;
            } else if (icomponentdefinitions_0.x + icomponentdefinitions_0.width > i_1) {
                icomponentdefinitions_0.x = i_1 - icomponentdefinitions_0.width;
            }
            if (icomponentdefinitions_0.y < 0) {
                icomponentdefinitions_0.y = 0;
            } else if (icomponentdefinitions_0.height + icomponentdefinitions_0.y > i_2) {
                icomponentdefinitions_0.y = i_2 - icomponentdefinitions_0.height;
            }
        }
    }
}
