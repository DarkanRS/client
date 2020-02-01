package com.jagex;
public class Node_Sub44_Sub1 extends IFSubNode {

	int anInt9460;

	public boolean method13401() {
		StringNode class282_sub47_2 = (StringNode) client.NPCS.get((long) this.anInt9460);
		if (class282_sub47_2 != null) {
			AccountCreationStage.method252(CS2HookEventType.aClass397_4799, this.interfaceId, (Entity) class282_sub47_2.anObject8068, this.anInt9460, 1712110950);
			return true;
		} else {
			return false;
		}
	}

	public Node_Sub44_Sub1(int i_1, int i_2, int i_3) {
		super(i_1, i_2);
		this.anInt9460 = i_3;
	}

}
