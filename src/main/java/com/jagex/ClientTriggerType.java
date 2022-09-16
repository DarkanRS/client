package com.jagex;

public enum ClientTriggerType {

	ON_OP_1008(10),
	ON_OP_1009(11),
	ON_OP_1010(12),
	ON_OP_1011(13),
	ON_OP_1012(14),
	aClass397_4797(15),
	aClass397_4798(16),
	aClass397_4805(17),
	aClass397_4800(18),
	aClass397_4812(19),
	aClass397_4792(20),
	LOYALTY_UPDATED(21),
	aClass397_4804(22),
	aClass397_4806(23),
	aClass397_4799(24),
	aClass397_4807(25),
	aClass397_4808(26),
	aClass397_4809(27),
	aClass397_4810(73),
	aClass397_4811(76);

	public final int id;

	ClientTriggerType(int id) {
		this.id = id;
	}
}
