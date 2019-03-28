public class QuickChatDynamicValue {

	public static QuickChatDynamicValue LISTDIALOG = new QuickChatDynamicValue(0, 2, 2, 1);

	public static QuickChatDynamicValue OBJDIALOG = new QuickChatDynamicValue(1, 2, 2, 0);

	static QuickChatDynamicValue COUNTDIALOG = new QuickChatDynamicValue(2, 4, 4, 0);

	static QuickChatDynamicValue STAT_BASE = new QuickChatDynamicValue(4, 1, 1, 1);

	public static QuickChatDynamicValue ENUM_STRING = new QuickChatDynamicValue(6, 0, 4, 2);

	public static QuickChatDynamicValue ENUM_STRING_CLAN = new QuickChatDynamicValue(7, 0, 1, 1);

	static QuickChatDynamicValue TOSTRING_VARP = new QuickChatDynamicValue(8, 0, 4, 1);

	static QuickChatDynamicValue TOSTRING_VARBIT = new QuickChatDynamicValue(9, 0, 4, 1);

	public static QuickChatDynamicValue OBJTRADEDIALOG = new QuickChatDynamicValue(10, 2, 2, 0);

	public static QuickChatDynamicValue ENUM_STRING_STATBASE = new QuickChatDynamicValue(11, 0, 1, 2);

	static QuickChatDynamicValue ACC_GETCOUNT_WORLD = new QuickChatDynamicValue(12, 0, 1, 0);

	static QuickChatDynamicValue ACC_GETMEANCOMBATLEVEL = new QuickChatDynamicValue(13, 0, 1, 0);

	static QuickChatDynamicValue TOSTRING_SHARED = new QuickChatDynamicValue(14, 0, 4, 1);

	static QuickChatDynamicValue ACTIVECOMBATLEVEL = new QuickChatDynamicValue(15, 0, 1, 0);

	public int id;

	public int clientTransmitSize;

	public int serverTransmitSize;

	public int paramCount;

	QuickChatDynamicValue(int i_1, int i_2, int i_3, int i_4) {
		this.id = i_1;
		this.clientTransmitSize = i_2;
		this.serverTransmitSize = i_3;
		this.paramCount = i_4;
	}

	static final void method4179(int i_0, int i_1, int i_2, int i_3, Class476 class476_4, byte b_5) {
		if (i_2 >= 1 && i_3 >= 1 && i_2 <= IndexLoaders.MAP_REGION_DECODER.getSizeX() - 2 && i_3 <= IndexLoaders.MAP_REGION_DECODER.getSizeY() - 2 && IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1940602014) != null) {
			SceneObject sceneobject_6 = IndexLoaders.MAP_REGION_DECODER.method4441().method12467(i_0, i_1, i_2, i_3, 2009974413);
			if (sceneobject_6 != null) {
				if (sceneobject_6 instanceof InteractableObject) {
					((InteractableObject) sceneobject_6).method16096(class476_4);
				} else if (sceneobject_6 instanceof GroundDecoration) {
					((GroundDecoration) sceneobject_6).method16091(class476_4);
				} else if (sceneobject_6 instanceof Wall) {
					((Wall) sceneobject_6).method16108(class476_4);
				} else if (sceneobject_6 instanceof WallDecoration) {
					((WallDecoration) sceneobject_6).method16082(class476_4);
				}
			}
		}
	}

	static boolean method4180(int i_0) {
		return i_0 == 7 || i_0 == 6;
	}

	public static QuickChatDynamicValue get(int i_0, byte b_1) {
		QuickChatDynamicValue[] arr_2 = Class92.getQuickChatDynamicValueTypes();
		for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
			if (i_0 == arr_2[i_3].id) {
				return arr_2[i_3];
			}
		}
		return null;
	}
}
