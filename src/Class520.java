public class Class520 {

	CoordGrid aClass219_5934;
	int anInt5933;

	public Class521_Sub1_Sub2_Sub1 method11158() {
		Class282_Sub29 class282_sub29_2 = (Class282_Sub29) client.aClass465_7414.get((long) (this.aClass219_5934.level << 28 | this.aClass219_5934.y << 14 | this.aClass219_5934.x));
		if (class282_sub29_2 == null) {
			return null;
		} else {
			CoordGrid coordgrid_3 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			int i_4 = this.aClass219_5934.x - coordgrid_3.x;
			int i_5 = this.aClass219_5934.y - coordgrid_3.y;
			if (i_4 >= 0 && i_5 >= 0 && i_4 < IndexLoaders.MAP_REGION_DECODER.getSizeX(453899598) && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-1973666054)) {
				for (Class282_Sub34 class282_sub34_6 = (Class282_Sub34) class282_sub29_2.aClass482_7708.head((byte) 54); class282_sub34_6 != null; class282_sub34_6 = (Class282_Sub34) class282_sub29_2.aClass482_7708.next(184260692)) {
					if (class282_sub34_6.anInt7853 == this.anInt5933) {
						return (Class521_Sub1_Sub2_Sub1) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1373135935).method3437(this.aClass219_5934.level, i_4, i_5);
					}
				}
			}

			return null;
		}
	}

	public Class520(CoordGrid coordgrid_1, int i_2) {
		this.aClass219_5934 = coordgrid_1;
		this.anInt5933 = i_2;
	}

	static final void method11160(Class282_Sub50_Sub7 class282_sub50_sub7_0, CS2Executor cs2executor_1) {
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = Class96_Sub12.method14613(class282_sub50_sub7_0);
		cs2executor_1.stringStack[++cs2executor_1.stringStackPtr - 1] = Class158_Sub1.method13768(class282_sub50_sub7_0);
		cs2executor_1.stringStack[++cs2executor_1.stringStackPtr - 1] = Class435.method7303(class282_sub50_sub7_0);
		cs2executor_1.stringStack[++cs2executor_1.stringStackPtr - 1] = Class9.method450(class282_sub50_sub7_0);
	}

	public static void method11161() {
		IComponentDefinitions.aClass229_1280.method3859(286396160);
		IComponentDefinitions.aClass229_1341.method3859(-1363804807);
		IComponentDefinitions.aClass229_1303.method3859(857287784);
		IComponentDefinitions.aClass229_1282.method3859(-1018738721);
	}

	public static boolean method11162(int i_0, byte b_1) {
		return i_0 == 0 || i_0 == 2;
	}

	static int method11163(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2) {
		return !client.method11633(icomponentdefinitions_0).clickOptionEnabled(i_1) && icomponentdefinitions_0.params == null ? -1 : (icomponentdefinitions_0.anIntArray1284 != null && icomponentdefinitions_0.anIntArray1284.length > i_1 ? icomponentdefinitions_0.anIntArray1284[i_1] : -1);
	}

}
