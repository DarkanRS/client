package com.jagex;
public final class Class484 {

	Class484() throws Throwable {
		throw new Error();
	}

	static void initSizes(IComponentDefinitions iCompDef, int i_1, int i_2, boolean bool_3, int i_4) {
		int i_5 = iCompDef.width;
		int i_6 = iCompDef.height;
		if (iCompDef.aspectWidthType == 0) {
			iCompDef.width = iCompDef.baseWidth;
		} else if (iCompDef.aspectWidthType == 1) {
			iCompDef.width = i_1 - iCompDef.baseWidth;
		} else if (iCompDef.aspectWidthType == 2) {
			iCompDef.width = iCompDef.baseWidth * i_1 >> 14;
		}
		if (iCompDef.aspectHeightType == 0) {
			iCompDef.height = iCompDef.baseHeight;
		} else if (iCompDef.aspectHeightType == 1) {
			iCompDef.height = i_2 - iCompDef.baseHeight;
		} else if (iCompDef.aspectHeightType == 2) {
			iCompDef.height = i_2 * iCompDef.baseHeight >> 14;
		}
		if (iCompDef.aspectWidthType == 4) {
			iCompDef.width = iCompDef.aspectX * iCompDef.height / iCompDef.aspectY;
		}
		if (iCompDef.aspectHeightType == 4) {
			iCompDef.height = iCompDef.width * iCompDef.aspectY / iCompDef.aspectX;
		}
		if (client.aBool7168 && (client.getIComponentSettings(iCompDef).settingsHash != 0 || iCompDef.type == ComponentType.CONTAINER)) {
			if (iCompDef.height < 5 && iCompDef.width < 5) {
				iCompDef.height = 5;
				iCompDef.width = 5;
			} else {
				if (iCompDef.height <= 0) {
					iCompDef.height = 5;
				}
				if (iCompDef.width <= 0) {
					iCompDef.width = 5;
				}
			}
		}
		if (iCompDef.contentType == IComponentDefinitions.CONTENT_TYPE_1337) {
			client.GAME_SCREEN_INTERFACE = iCompDef;
		}
		if (bool_3 && iCompDef.anObjectArray1271 != null && (i_5 != iCompDef.width || i_6 != iCompDef.height)) {
			HookRequest hookrequest_7 = new HookRequest();
			hookrequest_7.source = iCompDef;
			hookrequest_7.params = iCompDef.anObjectArray1271;
			client.PENDING_HOOK_REQUESTS.append(hookrequest_7);
		}
	}
}
