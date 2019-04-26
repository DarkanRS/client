public final class Class224 {

	static RouteStrategy_Sub1 aRouteStrategy_Sub1_2776 = new RouteStrategy_Sub1();

	static RouteStrategy_Sub6 aRouteStrategy_Sub6_2774 = new RouteStrategy_Sub6();

	static RouteStrategy_Sub3 aRouteStrategy_Sub3_2773 = new RouteStrategy_Sub3();

	static RouteStrategy_Sub2 aRouteStrategy_Sub2_2778 = new RouteStrategy_Sub2();

	static RouteStrategy_Sub4 aRouteStrategy_Sub4_2777 = new RouteStrategy_Sub4();

	static RouteStrategy_Sub5 aRouteStrategy_Sub5_2775 = new RouteStrategy_Sub5();

	Class224() throws Throwable {
		throw new Error();
	}

	public static void method3782(CacheableNode cacheablenode_0, CacheableNode cacheablenode_1, int i_2) {
		if (cacheablenode_0.current != null) {
			cacheablenode_0.method13452();
		}
		cacheablenode_0.current = cacheablenode_1;
		cacheablenode_0.aCacheableNode_8119 = cacheablenode_1.aCacheableNode_8119;
		cacheablenode_0.current.aCacheableNode_8119 = cacheablenode_0;
		cacheablenode_0.aCacheableNode_8119.current = cacheablenode_0;
	}

	public static Class366 method3784(RsByteBuffer rsbytebuffer_0) {
		int i_2 = rsbytebuffer_0.readInt();
		return new Class366(i_2);
	}
}
