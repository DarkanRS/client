public class QuickChatValueType {

	public static QuickChatValueType LISTDIALOG = new QuickChatValueType(0, 2, 2, 1);
	public static QuickChatValueType OBJDIALOG = new QuickChatValueType(1, 2, 2, 0);
	public static QuickChatValueType COUNTDIALOG = new QuickChatValueType(2, 4, 4, 0);
	public static QuickChatValueType STAT_BASE = new QuickChatValueType(4, 1, 1, 1);
	public static QuickChatValueType ENUM_STRING = new QuickChatValueType(6, 0, 4, 2);
	public static QuickChatValueType ENUM_STRING_CLAN = new QuickChatValueType(7, 0, 1, 1);
	public static QuickChatValueType TOSTRING_VARP = new QuickChatValueType(8, 0, 4, 1);
	public static QuickChatValueType TOSTRING_VARBIT = new QuickChatValueType(9, 0, 4, 1);
	public static QuickChatValueType OBJTRADEDIALOG = new QuickChatValueType(10, 2, 2, 0);
	public static QuickChatValueType ENUM_STRING_STATBASE = new QuickChatValueType(11, 0, 1, 2);
	public static QuickChatValueType ACC_GETCOUNT_WORLD = new QuickChatValueType(12, 0, 1, 0);
	public static QuickChatValueType ACC_GETMEANCOMBATLEVEL = new QuickChatValueType(13, 0, 1, 0);
	public static QuickChatValueType TOSTRING_SHARED = new QuickChatValueType(14, 0, 4, 1);
	public static QuickChatValueType ACTIVECOMBATLEVEL = new QuickChatValueType(15, 0, 1, 0);

	public int id;
	public int clientTransmitSize;
	public int serverTransmitSize;
	public int paramCount;

	QuickChatValueType(int i_1, int i_2, int i_3, int i_4) {
		this.id = i_1;
		this.clientTransmitSize = i_2;
		this.serverTransmitSize = i_3;
		this.paramCount = i_4;
	}

	static final void method4179(int i_0, int i_1, int i_2, int i_3, Class476 class476_4, byte b_5) {
		if (i_2 >= 1 && i_3 >= 1 && i_2 <= IndexLoaders.MAP_REGION_DECODER.getSizeX() - 2 && i_3 <= IndexLoaders.MAP_REGION_DECODER.getSizeY() - 2 && IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null) {
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

	public static QuickChatValueType get(int i_0) {
		QuickChatValueType[] arr_2 = Class92.getQuickChatDynamicValueTypes();
		for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
			if (i_0 == arr_2[i_3].id) {
				return arr_2[i_3];
			}
		}
		return null;
	}
}
