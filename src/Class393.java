public class Class393 {

	public static GamePreferences preferences;

	public Interface3[] anInterface3Array4782;

	void method6743(RsByteBuffer rsbytebuffer_1) {
		this.anInterface3Array4782 = new Interface3[rsbytebuffer_1.readUnsignedByte()];
		Class60[] arr_3 = Class112.method1870();
		for (int i_4 = 0; i_4 < this.anInterface3Array4782.length; i_4++) {
			this.anInterface3Array4782[i_4] = this.method6745(rsbytebuffer_1, arr_3[rsbytebuffer_1.readUnsignedByte()]);
		}
	}

	Interface3 method6745(RsByteBuffer rsbytebuffer_1, Class60 class60_2) {
		return (Interface3) (class60_2 == Class60.aClass60_609 ? RouteStrategies.method3784(rsbytebuffer_1) : (class60_2 == Class60.aClass60_602 ? CutsceneActionType.method6915(rsbytebuffer_1) : (class60_2 == Class60.aClass60_605 ? Class366.method6303(rsbytebuffer_1) : (class60_2 == Class60.aClass60_607 ? Class530.method11354(rsbytebuffer_1) : (class60_2 == Class60.aClass60_606 ? Class258.method4570(rsbytebuffer_1, 2086694291) : (class60_2 == Class60.aClass60_603 ? MapRegion.method4564(rsbytebuffer_1) : (class60_2 == Class60.aClass60_608 ? Class163.method2843(rsbytebuffer_1, 1348878542) : (class60_2 == Class60.aClass60_604 ? VarDefinitionLoader.method6401(rsbytebuffer_1) : (class60_2 == Class60.aClass60_601 ? Class214.method3668(rsbytebuffer_1) : (class60_2 == Class60.aClass60_610 ? Class332.method5928(rsbytebuffer_1) : null))))))))));
	}
}
