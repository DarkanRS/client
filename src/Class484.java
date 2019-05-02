public final class Class484 {

	Class484() throws Throwable {
		throw new Error();
	}

	static void method8200(IComponentDefinitions iCompDef, int i_1, int i_2, boolean bool_3, int i_4) {
		int i_5 = iCompDef.width;
		int i_6 = iCompDef.height;
		if (iCompDef.aByte1368 == 0) {
			iCompDef.width = iCompDef.baseWidth;
		} else if (iCompDef.aByte1368 == 1) {
			iCompDef.width = i_1 - iCompDef.baseWidth;
		} else if (iCompDef.aByte1368 == 2) {
			iCompDef.width = iCompDef.baseWidth * i_1 >> 14;
		}
		if (iCompDef.aByte1294 == 0) {
			iCompDef.height = iCompDef.baseHeight;
		} else if (iCompDef.aByte1294 == 1) {
			iCompDef.height = i_2 - iCompDef.baseHeight;
		} else if (iCompDef.aByte1294 == 2) {
			iCompDef.height = i_2 * iCompDef.baseHeight >> 14;
		}
		if (iCompDef.aByte1368 == 4) {
			iCompDef.width = iCompDef.anInt1289 * iCompDef.height / iCompDef.anInt1375;
		}
		if (iCompDef.aByte1294 == 4) {
			iCompDef.height = iCompDef.width * iCompDef.anInt1375 / iCompDef.anInt1289;
		}
		if (client.aBool7168 && (client.method11633(iCompDef).settingsHash != 0 || iCompDef.type == 0)) {
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
		if (iCompDef.contentType == IComponentDefinitions.anInt1372) {
			client.aClass118_7183 = iCompDef;
		}
		if (bool_3 && iCompDef.anObjectArray1271 != null && (i_5 != iCompDef.width || i_6 != iCompDef.height)) {
			HookRequest hookrequest_7 = new HookRequest();
			hookrequest_7.source = iCompDef;
			hookrequest_7.params = iCompDef.anObjectArray1271;
			client.PENDING_HOOK_REQUESTS.append(hookrequest_7);
		}
	}
}
