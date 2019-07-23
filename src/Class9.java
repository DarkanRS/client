public class Class9 {

	static BufferedConnectionContext CURRENT_CONNECTION_CONTEXT;
	static int lobbyStage;
	static boolean aBool74 = false;
	static boolean socialNetworkLogin = false;
	static int anInt76 = -1;
	static long aLong77 = -1L;
	static int loginStage = 2;
	static long aLong86 = 0L;
	static String aString99 = "";
	static String aString102 = "";
	static int anInt90 = 0;
	static int anInt104 = 0;
	public static int anInt72 = -2;
	public static int anInt106 = -2;
	public static int anInt107 = -2;
	public static int anInt108 = -1;
	public static int anInt109 = -1;
	public static int anInt103 = 0;
	public static int anInt94 = -1;
	public static int anInt112 = -1;
	public static int anInt113 = 0;
	static boolean aBool71 = false;

	Class9() throws Throwable {
		throw new Error();
	}

	public static String method450(CacheableNode_Sub7 class282_sub50_sub7_0) {
		if (!Class20.aBool161 && class282_sub50_sub7_0 != null) {
			int[] ints_2 = Class534_Sub1.method12815(class282_sub50_sub7_0, -1654060513);
			return ints_2 == null ? "" : Class15.method547(ints_2, 1877842979);
		} else {
			return "";
		}
	}

	public static void animateObject(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		if (i_1 >= 0 && i_2 >= 0 && i_1 < IndexLoaders.MAP_REGION_DECODER.getSizeX() - 1 && i_2 < IndexLoaders.MAP_REGION_DECODER.getSizeY() - 1 && IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null) {
			SceneObject sceneobject_8;
			if (i_3 == 0) {
				sceneobject_8 = (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getWall(i_0, i_1, i_2, (byte) -24);
				SceneObject sceneobject_9 = (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getWall2(i_0, i_1, i_2);
				if (sceneobject_8 != null && i_4 != 2) {
					if (sceneobject_8 instanceof Wall) {
						((Wall) sceneobject_8).aClass123_10532.animate(i_6);
					} else {
						Class174.animateObject(i_0, i_3, i_1, i_2, sceneobject_8.getId(622402037), i_5, i_4, i_6, -724241554);
					}
				}
				if (sceneobject_9 != null) {
					if (sceneobject_9 instanceof Wall) {
						((Wall) sceneobject_9).aClass123_10532.animate(i_6);
					} else {
						Class174.animateObject(i_0, i_3, i_1, i_2, sceneobject_9.getId(-1155370235), i_5, i_4, i_6, -958170746);
					}
				}
			} else if (i_3 == 1) {
				sceneobject_8 = (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getWallDecoration(i_0, i_1, i_2, (byte) 31);
				if (sceneobject_8 != null) {
					if (sceneobject_8 instanceof WallDecoration) {
						((WallDecoration) sceneobject_8).aClass123_10501.animate(i_6);
					} else {
						int i_10 = sceneobject_8.getId(1811097056);
						if (i_4 != 4 && i_4 != 5) {
							if (i_4 == 6) {
								Class174.animateObject(i_0, i_3, i_1, i_2, i_10, i_5 + 4, 4, i_6, -398135119);
							} else if (i_4 == 7) {
								Class174.animateObject(i_0, i_3, i_1, i_2, i_10, (i_5 + 2 & 0x3) + 4, 4, i_6, -578636810);
							} else if (i_4 == 8) {
								Class174.animateObject(i_0, i_3, i_1, i_2, i_10, i_5 + 4, 4, i_6, -1020779055);
								Class174.animateObject(i_0, i_3, i_1, i_2, i_10, (i_5 + 2 & 0x3) + 4, 4, i_6, -593163941);
							}
						} else {
							Class174.animateObject(i_0, i_3, i_1, i_2, i_10, i_5, 4, i_6, -517311617);
						}
					}
				}
			} else if (i_3 == 2) {
				sceneobject_8 = (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getInteractableObject(i_0, i_1, i_2, client.anInterface25_7446);
				if (sceneobject_8 != null) {
					if (i_4 == 11) {
						i_4 = 10;
					}
					if (sceneobject_8 instanceof InteractableObject) {
						((InteractableObject) sceneobject_8).aClass123_10509.animate(i_6);
					} else {
						Class174.animateObject(i_0, i_3, i_1, i_2, sceneobject_8.getId(-469540620), i_5, i_4, i_6, -283267512);
					}
				}
			} else if (i_3 == 3) {
				sceneobject_8 = (SceneObject) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().getGroundDecoration(i_0, i_1, i_2);
				if (sceneobject_8 != null) {
					if (sceneobject_8 instanceof GroundDecoration) {
						((GroundDecoration) sceneobject_8).aClass123_10507.animate(i_6);
					} else {
						Class174.animateObject(i_0, i_3, i_1, i_2, sceneobject_8.getId(554771962), i_5, i_4, i_6, -948532137);
					}
				}
			}
		}
	}
}
