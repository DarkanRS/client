public class Class1 {

	static Class282_Sub50_Sub7 aClass282_Sub50_Sub7_12;

	static Class1 REQUEST = new Class1();

	static Class1 RESPONSE = new Class1();

	public static void method252(Class397 class397_0, int i_1, int i_2, Animable animable_3, int i_4, int i_5) {
		CS2Executor cs2executor_6 = Class125.getNextScriptExecutor(1590618390);
		cs2executor_6.animable = animable_3;
		cs2executor_6.anInt7004 = i_4;
		Class107.method1834(class397_0, i_1, i_2, cs2executor_6, (byte) 104);
		cs2executor_6.animable = null;
		cs2executor_6.anInt7004 = -1;
	}

	static final void method253(int i_0, IterableNodeMap iterablenodemap_1, int i_2) {
		if (i_0 != -1 && iterablenodemap_1.get((long) i_0) == null) {
			iterablenodemap_1.put(new Node(), (long) i_0);
		}
	}
}
