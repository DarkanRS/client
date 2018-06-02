/* Class530 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class530 {
	int anInt7047;
	Class219 aClass219_7048;
	int anInt7049;
	public static boolean aBool7050;

	public SceneObject method11342() {
		SceneObject interface12 = method11348((short) 28673);
		if (null == interface12)
			return null;
		if (interface12.getId(-549147694) != ((Class530) this).anInt7049 * -1382651561)
			return null;
		return interface12;
	}

	int method11343(int i) {
		return client.anIntArray7230[((Class530) this).anInt7047 * 1219960497];
	}

	public SceneObject method11344(byte i) {
		SceneObject interface12 = method11348((short) 17190);
		if (null == interface12)
			return null;
		if (interface12.getId(416174941) != ((Class530) this).anInt7049 * -1382651561)
			return null;
		return interface12;
	}

	int method11345() {
		return client.anIntArray7230[((Class530) this).anInt7047 * 1219960497];
	}

	public Class530(Class219 class219, int i, int i_0_, int i_1_) {
		((Class530) this).aClass219_7048 = class219;
		((Class530) this).anInt7047 = i * -75863471;
		((Class530) this).anInt7049 = i_1_ * 433623655;
	}

	int method11346() {
		return client.anIntArray7230[((Class530) this).anInt7047 * 1219960497];
	}

	int method11347() {
		return client.anIntArray7230[((Class530) this).anInt7047 * 1219960497];
	}

	SceneObject method11348(short i) {
		int i_2_ = 298538453 * ((Class530) this).aClass219_7048.anInt2713;
		Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(1217612419);
		int i_3_ = (((Class530) this).aClass219_7048.anInt2711 * 1948093437 - 1948093437 * class219.anInt2711);
		int i_4_ = (-1002240017 * ((Class530) this).aClass219_7048.anInt2712 - class219.anInt2712 * -1002240017);
		if (i_3_ < 0 || i_4_ < 0 || i_3_ >= IndexLoaders.MAP_REGION_DECODER.method4424(-444629403) || i_4_ >= IndexLoaders.MAP_REGION_DECODER.method4451(-343963365))
			return null;
		switch (method11343(-1790322453)) {
		case 1:
			return (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-2014086808).getWallDecoration(i_2_, i_3_, i_4_, (byte) 45);
		case 3:
			return (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1684834400).getGroundDecoration(i_2_, i_3_, i_4_, -387297653);
		case 2:
			return ((SceneObject) (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1571764476).getInteractableObject(i_2_, i_3_, i_4_, client.anInterface25_7446, -233664382)));
		default:
			return null;
		case 0:
			return (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1288178726).getWall(i_2_, i_3_, i_4_, (byte) -33);
		}
	}

	SceneObject method11349() {
		int i = 298538453 * ((Class530) this).aClass219_7048.anInt2713;
		Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(1833251508);
		int i_5_ = (((Class530) this).aClass219_7048.anInt2711 * 1948093437 - 1948093437 * class219.anInt2711);
		int i_6_ = (-1002240017 * ((Class530) this).aClass219_7048.anInt2712 - class219.anInt2712 * -1002240017);
		if (i_5_ < 0 || i_6_ < 0 || i_5_ >= IndexLoaders.MAP_REGION_DECODER.method4424(1337608146) || i_6_ >= IndexLoaders.MAP_REGION_DECODER.method4451(-2076212393))
			return null;
		switch (method11343(-1790322453)) {
		case 1:
			return (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-817952191).getWallDecoration(i, i_5_, i_6_, (byte) -69);
		case 3:
			return (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1712945263).getGroundDecoration(i, i_5_, i_6_, -387297653);
		case 2:
			return ((SceneObject) (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1727152520).getInteractableObject(i, i_5_, i_6_, client.anInterface25_7446, -233664382)));
		default:
			return null;
		case 0:
			return (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1378077948).getWall(i, i_5_, i_6_, (byte) -74);
		}
	}

	static final void method11350(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 1552292309 * class118.anInt1293;
	}

	static final void method11351(CS2Executor class527, int i) {
		int i_7_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method7785(i_7_, -1569082845);
	}

	static Class106[] method11352(int i) {
		return (new Class106[] { Class106.aClass106_1072, Class106.aClass106_1073, Class106.aClass106_1070, Class106.aClass106_1074, Class106.aClass106_1075 });
	}

	static Class204[] method11353(int i) {
		return (new Class204[] { Class204.aClass204_2578, Class204.aClass204_2579 });
	}

	public static Class357 method11354(RsByteBuffer class282_sub35, int i) {
		Class357 class357 = Class258.method4570(class282_sub35, 2052241851);
		int i_8_ = class282_sub35.read24BitInteger(1307039132);
		return new Class357_Sub1(class357.anInt4124 * -1847374165, class357.aClass356_4121, class357.aClass353_4122, class357.anInt4123 * -809264285, 177795463 * class357.anInt4120, i_8_);
	}

	static final void method11355(CS2Executor class527, short i) {
		int i_9_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (client.aString7426 != null && i_9_ < Class459.anInt5534 * -1772444859)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = Class467.aClass173Array5575[i_9_].aString2130;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}
}
