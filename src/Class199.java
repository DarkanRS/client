public abstract class Class199 {

	public abstract KeyRecord method3234();

	public abstract void method3235();

	public abstract boolean method3236(int var1, int var2);

	public abstract KeyRecord getNext(int var1);

	public abstract void method3238();

	public abstract KeyRecord method3239();

	public abstract boolean method3240(int var1);

	public abstract boolean method3242(int var1);

	public abstract KeyRecord method3243();

	public abstract boolean method3244(int var1);

	public abstract void method3245();

	public abstract void method3246();

	public abstract void method3247();

	public abstract void method3248();

	public abstract void method3249();

	static final void method3251(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		if (cs2executor_1.anInt7015 >= 10) {
			throw new RuntimeException();
		} else {
			if (icomponentdefinitions_0.anObjectArray1271 != null) {
				HookRequest hookrequest_3 = new HookRequest();
				hookrequest_3.iComponentDefs = icomponentdefinitions_0;
				hookrequest_3.params = icomponentdefinitions_0.anObjectArray1271;
				hookrequest_3.anInt8061 = cs2executor_1.anInt7015 + 1;
				client.aClass482_7402.append(hookrequest_3);
			}
		}
	}
}
