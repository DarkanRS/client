public final class Class224 {

	static Class225_Sub1 aClass225_Sub1_2776 = new Class225_Sub1();

	static Class225_Sub6 aClass225_Sub6_2774 = new Class225_Sub6();

	static Class225_Sub3 aClass225_Sub3_2773 = new Class225_Sub3();

	static Class225_Sub2 aClass225_Sub2_2778 = new Class225_Sub2();

	static Class225_Sub4 aClass225_Sub4_2777 = new Class225_Sub4();

	static Class225_Sub5 aClass225_Sub5_2775 = new Class225_Sub5();

	Class224() throws Throwable {
		throw new Error();
	}

	public static void method3782(CacheableNode cacheablenode_0, CacheableNode cacheablenode_1, int i_2) {
		if (cacheablenode_0.current != null) {
			cacheablenode_0.method13452();
		}
		cacheablenode_0.current = cacheablenode_1;
		cacheablenode_0.aClass282_Sub50_8119 = cacheablenode_1.aClass282_Sub50_8119;
		cacheablenode_0.current.aClass282_Sub50_8119 = cacheablenode_0;
		cacheablenode_0.aClass282_Sub50_8119.current = cacheablenode_0;
	}

	public static Class366 method3784(RsByteBuffer rsbytebuffer_0) {
		int i_2 = rsbytebuffer_0.readInt();
		return new Class366(i_2);
	}
}
