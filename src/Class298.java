public class Class298 implements Interface41 {

	Index index;

	public Class445 method232(byte b_1) {
		return Class445.aClass445_5381;
	}

	public int getCompletion(int i_1) {
		return this.index.isValid() ? 100 : this.index.getCompletion();
	}

	public Class445 method234() {
		return Class445.aClass445_5381;
	}

	public int method231() {
		return this.index.isValid() ? 100 : this.index.getCompletion();
	}

	public Class445 method230() {
		return Class445.aClass445_5381;
	}

	public Class445 method233() {
		return Class445.aClass445_5381;
	}

	public Class445 method235() {
		return Class445.aClass445_5381;
	}

	Class298(Index index_1) {
		this.index = index_1;
	}

	static final void method5300(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		Class462.aStringArray5548[i_2] = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		Class282_Sub20_Sub10.method15263(i_2, (byte) 42);
	}

	static final void method5301(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 84);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class29.method786(icomponentdefinitions_3, interface_4, cs2executor_0, -1279446637);
	}

	static final void method5302(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 23);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class109.method1852(icomponentdefinitions_3, interface_4, cs2executor_0, 1050548242);
	}

	static boolean method5303(byte b_0) {
		return !Class504.method8388(client.anInt7166, (byte) 22);
	}

	public static boolean method5304(int i_0, int i_1) {
		return i_0 == 0 || i_0 == 1 || i_0 == 2;
	}

}
