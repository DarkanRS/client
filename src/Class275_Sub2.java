public class Class275_Sub2 extends Class275 {

	Animable aClass521_Sub1_Sub1_Sub2_7739;
	int anInt7740;
	int anInt7742;
	int anInt7743;
	int anInt7744;
	static EntityList aClass457_7745 = new EntityList();
	static int anInt7741 = 0;

	static final void method12504(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = cs2executor_0.intLocals[cs2executor_0.intOpValues[cs2executor_0.instrPtr]];
	}

	static Class200 method12505(int i_0, int i_1, int i_2, MeshRasterizer meshrasterizer_3, byte b_4) {
		if (meshrasterizer_3 == null) {
			return null;
		} else {
			Class200 class200_5 = new Class200(i_0, i_1, i_2, meshrasterizer_3.N(), meshrasterizer_3.RA(), meshrasterizer_3.ya(), meshrasterizer_3.YA(), meshrasterizer_3.o(), meshrasterizer_3.AA(), meshrasterizer_3.ha());
			return class200_5;
		}
	}

	static final void method12506(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		boolean bool_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1] == 1;
		if (Class291_Sub1.aClass465_8029 != null) {
			Node node_4 = Class291_Sub1.aClass465_8029.get((long) i_2);
			if (node_4 != null && !bool_3) {
				node_4.remove();
			} else if (node_4 == null && bool_3) {
				node_4 = new Node();
				Class291_Sub1.aClass465_8029.method7765(node_4, (long) i_2);
			}
		}

	}

}
