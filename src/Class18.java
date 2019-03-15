public class Class18 {

	Class18() throws Throwable {
		throw new Error();
	}

	static void method571() {
		Class180.aClass229_2245.method3863(1106684848);
	}

	static void renderInformation(GraphicalRenderer graphicalrenderer_0, NodeCollection nodecollection_1) {
		Class346.aClass482_4049.method8118(-449430209);
		if (!Class291_Sub1.aBool8027) {
			for (Class282_Sub36 class282_sub36_5 = (Class282_Sub36) nodecollection_1.head((byte) 59); class282_sub36_5 != null; class282_sub36_5 = (Class282_Sub36) nodecollection_1.next(-319423268)) {
				WorldMapAreaDefs worldmapareadefs_6 = Class291_Sub1.aClass218_3456.getWorldMapDefs(class282_sub36_5.anInt7991, -113762832);
				if (Class282_Sub16.method12248(worldmapareadefs_6, -852702638)) {
					boolean bool_7 = WorldMapAreaDefs.renderIconsAndNames(graphicalrenderer_0, class282_sub36_5, worldmapareadefs_6);
					if (bool_7) {
						Class282_Sub39.method13297(graphicalrenderer_0, class282_sub36_5, worldmapareadefs_6);
					}
				}
			}
		}
	}

	static void method574() {
	}
}
