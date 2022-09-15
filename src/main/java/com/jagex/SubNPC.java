package com.jagex;

public class SubNPC extends SubInterface {

	int anInt9460;

	public SubNPC(int i_1, int i_2, int i_3) {
		super(i_1, i_2);
		anInt9460 = i_3;
	}

	@Override
	public boolean load() {
		ObjectNode class282_sub47_2 = (ObjectNode) client.NPC_MAP.get(anInt9460);
		if (class282_sub47_2 != null) {
			AccountCreationStage.method252(ClientTriggerType.aClass397_4799, interfaceId, (PathingEntity) class282_sub47_2.anObject8068, anInt9460);
			return true;
		}
		return false;
	}

}
