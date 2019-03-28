public class SurfaceSkin {

	public int anInt2113;
	public SurfaceSkin aClass172_2114;
	public Matrix44Arr aClass384_2116;
	public int anInt2117;
	public int anInt2118;
	public int anInt2115;
	public int anInt2119;

	SurfaceSkin(int i_1, int i_2) {
		this.anInt2115 = i_1;
		this.anInt2119 = i_2;
	}

	SurfaceSkin method2911(int i_1) {
		return new SurfaceSkin(this.anInt2115, i_1);
	}

	public Class345 method2913(int i_1) {
		return Class423.method7065(this.anInt2115);
	}

	static final void method2915(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		icomponentdefinitions_0.anInt1324 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 15);
	}
}
