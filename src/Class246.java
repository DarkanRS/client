public class Class246 {

	static String[] aStringArray3028;

	public static int CAM_MOVE_ABSOLUTEY;

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

	static void method4204(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2, int i_3) {
		if (icomponentdefinitions_0.aByte1333 == 0) {
			icomponentdefinitions_0.x = icomponentdefinitions_0.basePositionX;
		} else if (icomponentdefinitions_0.aByte1333 == 1) {
			icomponentdefinitions_0.x = icomponentdefinitions_0.basePositionX + (i_1 - icomponentdefinitions_0.width) / 2;
		} else if (icomponentdefinitions_0.aByte1333 == 2) {
			icomponentdefinitions_0.x = i_1 - icomponentdefinitions_0.width - icomponentdefinitions_0.basePositionX;
		} else if (icomponentdefinitions_0.aByte1333 == 3) {
			icomponentdefinitions_0.x = icomponentdefinitions_0.basePositionX * i_1 >> 14;
		} else if (icomponentdefinitions_0.aByte1333 == 4) {
			icomponentdefinitions_0.x = (i_1 - icomponentdefinitions_0.width) / 2 + (icomponentdefinitions_0.basePositionX * i_1 >> 14);
		} else {
			icomponentdefinitions_0.x = i_1 - icomponentdefinitions_0.width - (icomponentdefinitions_0.basePositionX * i_1 >> 14);
		}
		if (icomponentdefinitions_0.aByte1355 == 0) {
			icomponentdefinitions_0.y = icomponentdefinitions_0.basePositionY;
		} else if (icomponentdefinitions_0.aByte1355 == 1) {
			icomponentdefinitions_0.y = (i_2 - icomponentdefinitions_0.height) / 2 + icomponentdefinitions_0.basePositionY;
		} else if (icomponentdefinitions_0.aByte1355 == 2) {
			icomponentdefinitions_0.y = i_2 - icomponentdefinitions_0.height - icomponentdefinitions_0.basePositionY;
		} else if (icomponentdefinitions_0.aByte1355 == 3) {
			icomponentdefinitions_0.y = i_2 * icomponentdefinitions_0.basePositionY >> 14;
		} else if (icomponentdefinitions_0.aByte1355 == 4) {
			icomponentdefinitions_0.y = (i_2 - icomponentdefinitions_0.height) / 2 + (i_2 * icomponentdefinitions_0.basePositionY >> 14);
		} else {
			icomponentdefinitions_0.y = i_2 - icomponentdefinitions_0.height - (i_2 * icomponentdefinitions_0.basePositionY >> 14);
		}
		if (client.aBool7168 && (client.method11633(icomponentdefinitions_0).settingsHash != 0 || icomponentdefinitions_0.type == 0)) {
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
