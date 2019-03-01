public class Class86 {

	static Class77[] aClass77Array818;
	static Class92[] aClass92Array820;
	static Class93[] aClass93Array821;
	public static Class96[] aClass96Array822;
	static short aShort828;
	static short aShort829;
	static short aShort830;
	public static int anInt833;
	public static NodeCollection aClass482_827 = new NodeCollection();
	public static IterableNodeMap aClass465_823 = new IterableNodeMap(32);
	static int anInt819 = 1;
	static int anInt825 = 0;
	static int anInt824 = 0;
	static boolean aBool826 = false;
	static int anInt831 = -1;
	public static Interface42 anInterface42_832 = new Class79();

	Class86() throws Throwable {
		throw new Error();
	}

	public static final void method1478(int i_0) {
		if (Class9.loginStage != 2) {
			Class9.aClass184_73.method3051((byte) -81);
			JS5StandardRequester.method5558(-500941691);
			Class361.method6270((byte) 39);
		}

	}

	static final void method1479(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		boolean bool_3 = true;
		if (i_2 < 0) {
			bool_3 = (i_2 + 1) % 4 == 0;
		} else if (i_2 < 1582) {
			bool_3 = i_2 % 4 == 0;
		} else if (i_2 % 4 != 0) {
			bool_3 = false;
		} else if (i_2 % 100 != 0) {
			bool_3 = true;
		} else if (i_2 % 400 != 0) {
			bool_3 = false;
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = bool_3 ? 1 : 0;
	}

	static final long method1480(int i_0) {
		return (long) (++CS2Runner.anInt5906 - 1) << 32 | 0xffffffffL;
	}

	static boolean method1481(Class232 class232_0, byte b_1) {
		return Class6.method302(class232_0, (MouseRecord) null, 898171196);
	}

	static void method1482(IComponentDefinitions icomponentdefinitions_0, byte b_1) {
		if (icomponentdefinitions_0.anInt1268 == 5 && icomponentdefinitions_0.anInt1426 != -1) {
			Class415.method6996(Renderers.SOFTWARE_RENDERER, icomponentdefinitions_0, -585931804);
		}

	}

}
