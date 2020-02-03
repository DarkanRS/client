package com.jagex;
public class Class86 {

	static CutsceneCameraMovement[] CUTSCENE_CAMERA_MOVEMENTS;
	static CutsceneObject[] CUTSCENE_OBJECTS;
	static CutsceneEntityMovement[] aClass93Array821;
	public static CutsceneAction[] aCutsceneActionArray822;
	static short aShort828;
	static short aShort829;
	static short aShort830;
	public static int anInt833;
	public static NodeCollection CUTSCENE_AREAS = new NodeCollection();
	public static IterableNodeMap aClass465_823 = new IterableNodeMap(32);
	static int anInt819 = 1;
	static int anInt825 = 0;
	static int anInt824 = 0;
	static boolean aBool826 = false;
	static int anInt831 = -1;
	public static VarProvider anInterface42_832 = new Class79();

	Class86() throws Throwable {
		throw new Error();
	}

	public static final void method1478() {
		if (Class9.loginStage != 2) {
			Class9.CURRENT_CONNECTION_CONTEXT.method3051();
			JS5StandardRequester.method5558();
			Class361.method6270((byte) 39);
		}
	}

	static boolean method1481(KeyHoldInputSubscriber class232_0, byte b_1) {
		return Friend.method302(class232_0, (MouseRecord) null);
	}

	static void method1482(IComponentDefinitions icomponentdefinitions_0, byte b_1) {
		if (icomponentdefinitions_0.type == ComponentType.SPRITE && icomponentdefinitions_0.containerItemId != -1) {
			VarcDefinitions.method6996(Renderers.SOFTWARE_RENDERER, icomponentdefinitions_0);
		}
	}
}
