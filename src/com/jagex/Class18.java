package com.jagex;
public class Class18 {

	Class18() throws Throwable {
		throw new Error();
	}

	static void method571() {
		HintArrow.aClass229_2245.method3863();
	}

	static void renderInformation(GraphicalRenderer graphicalrenderer_0, NodeCollection nodecollection_1) {
		QuickChatMessage.aClass482_4049.removeAll();
		if (!Class291_Sub1.aBool8027) {
			for (Node_Sub36 class282_sub36_5 = (Node_Sub36) nodecollection_1.head(); class282_sub36_5 != null; class282_sub36_5 = (Node_Sub36) nodecollection_1.next(-319423268)) {
				MapAreaDefinitions worldmapareadefs_6 = Class291_Sub1.MAP_AREA_LOADER.getWorldMapDefs(class282_sub36_5.anInt7991, -113762832);
				if (Node_Sub16.method12248(worldmapareadefs_6, -852702638)) {
					boolean bool_7 = MapAreaDefinitions.renderIconsAndNames(graphicalrenderer_0, class282_sub36_5, worldmapareadefs_6);
					if (bool_7) {
						Node_Sub39.method13297(graphicalrenderer_0, class282_sub36_5, worldmapareadefs_6);
					}
				}
			}
		}
	}

	static void method574() {
	}
}
