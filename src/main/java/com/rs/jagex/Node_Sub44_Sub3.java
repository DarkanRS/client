package com.rs.jagex;

public class Node_Sub44_Sub3 extends SubInterface {

	static Node_Sub7 aNode_Sub7_9563;
	Class520 aClass520_9562;

	public Node_Sub44_Sub3(int i_1, int i_2, Class520 class520_3) {
		super(i_1, i_2);
		aClass520_9562 = class520_3;
	}

	@Override
	public boolean load() {
		GroundItem class521_sub1_sub2_sub1_2 = aClass520_9562.method11158();
		if (class521_sub1_sub2_sub1_2 != null) {
			Class150.method2583(ClientTriggerType.aClass397_4809, interfaceId, class521_sub1_sub2_sub1_2);
			return true;
		}
		return false;
	}

}
