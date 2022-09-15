package com.jagex;

public class Friend {
	static int anInt46;
	static boolean method302(InputSubscriber interface17_0, MouseRecord class282_sub53_1) {
		return interface17_0 != null && interface17_0.valid(class282_sub53_1, client.keyRecords, client.maximumHeldKeys, PlaySoundJingleCutsceneAction.keyRecorder);
	}
	static void method303(int i_0, int i_1, int i_2) {
		if (i_0 == 1008)
			ScriptRunner.executeTrigger(ClientTriggerType.ON_OP_1008, i_1, i_2);
		else if (i_0 == 1009)
			ScriptRunner.executeTrigger(ClientTriggerType.ON_OP_1009, i_1, i_2);
		else if (i_0 == 1010)
			ScriptRunner.executeTrigger(ClientTriggerType.ON_OP_1010, i_1, i_2);
		else if (i_0 == 1011)
			ScriptRunner.executeTrigger(ClientTriggerType.ON_OP_1011, i_1, i_2);
		else if (i_0 == 1012)
			ScriptRunner.executeTrigger(ClientTriggerType.ON_OP_1012, i_1, i_2);
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
