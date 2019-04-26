public class Class86 {

	static Class77[] aClass77Array818;

	static Class92[] aClass92Array820;

	static Class93[] aClass93Array821;

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
			Class9.aClass184_73.method3051((byte) -81);
			JS5StandardRequester.method5558();
			Class361.method6270((byte) 39);
		}
	}

	static final long method1480(int i_0) {
		return (long) (++CS2Runner.anInt5906 - 1) << 32 | 0xffffffffL;
	}

	static boolean method1481(KeyHoldInputSubscriber class232_0, byte b_1) {
		return Class6.method302(class232_0, (MouseRecord) null);
	}

	static void method1482(IComponentDefinitions icomponentdefinitions_0, byte b_1) {
		if (icomponentdefinitions_0.type == 5 && icomponentdefinitions_0.anInt1426 != -1) {
			VarcDefinitions.method6996(Renderers.SOFTWARE_RENDERER, icomponentdefinitions_0);
		}
	}
}
