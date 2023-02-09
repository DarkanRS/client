package com.rs.jagex;

public class Friend {
	static int anInt46;
	static boolean method302(InputSubscriber interface17_0, MouseRecord class282_sub53_1) {
		return interface17_0 != null && interface17_0.valid(class282_sub53_1, client.keyRecords, client.maximumHeldKeys, PlaySoundJingleCutsceneAction.keyRecorder);
	}
	
	static void method303(MenuAction action, int i_1, int i_2) {
		ScriptRunner.executeTrigger(switch(action) {
		case OP_MAPELEMENT1 -> ClientTriggerType.ON_OP_MAPELEMENT1;
		case OP_MAPELEMENT2 -> ClientTriggerType.ON_OP_MAPELEMENT2;
		case OP_MAPELEMENT3 -> ClientTriggerType.ON_OP_MAPELEMENT3;
		case OP_MAPELEMENT4 -> ClientTriggerType.ON_OP_MAPELEMENT4;
		case OP_MAPELEMENT5 -> ClientTriggerType.ON_OP_MAPELEMENT5;
		default -> throw new IllegalArgumentException("Unexpected menu action trigger: " + action);
		}, i_1, i_2);
	}
	
	public static int method304() {
		return Class291.aFloat3462 == 3.0D ? 37 : (Class291.aFloat3462 == 4.0D ? 50 : (Class291.aFloat3462 == 6.0D ? 75 : (Class291.aFloat3462 == 8.0D ? 100 : 200)));
	}
	public String displayName;
	public boolean referrer;
	public int worldId;
	public String worldName;
	public int fcRank;

	public int platform;

	public String username;

	public int worldFlags;
}
