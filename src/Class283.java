public class Class283 {

	public static int anInt3384;

	public int anInt3382;

	public int[] anIntArray3381;

	public int[] anIntArray3383;

	public Class283(int i_1) {
		this.anInt3382 = i_1;
		this.anIntArray3381 = new int[this.anInt3382];
		this.anIntArray3383 = new int[this.anInt3382];
	}

	static final void method5009(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 1962956605) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1413 = Class351.method6193(string_4, cs2executor_2, 1097556379);
		icomponentdefinitions_0.aBool1384 = true;
	}
}
