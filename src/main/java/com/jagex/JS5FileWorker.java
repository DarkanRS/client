package com.jagex;

public abstract class JS5FileWorker {

	static InputSubscriberType[] method5815() {
		return new InputSubscriberType[]{InputSubscriberType.KEY_HOLD, InputSubscriberType.KEY_PRESS, InputSubscriberType.COMBINED};
	}

	abstract ReferenceTable getReferenceTable();

	abstract byte[] method5804(int var1);

	abstract void method5805(int var1);

	abstract int method5806(int var1);

	abstract ReferenceTable method5807();

	abstract void method5808(int var1);

	abstract byte[] method5809(int var1);

	abstract int method5810(int var1);

	abstract byte[] method5811(int var1);

	abstract void method5812(int var1);

	abstract byte[] method5813(int var1);
}
