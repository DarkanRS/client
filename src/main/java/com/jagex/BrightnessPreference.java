package com.jagex;

public class BrightnessPreference extends Preference {

	public static void method12869(boolean bool_0) {
		if (client.anInt7341 != 2 && client.anInt7341 != 1) {
			if (!bool_0) {
				CutsceneAction[] arr_2 = Class86.aCutsceneActionArray822;

				for (CutsceneAction class96_4 : arr_2) {
					class96_4.method1593();
				}
			}

			client.anInt7341 = 2;
			NativeLibraryLoader.CUTSCENE_MAP_XTEAS = null;
			Class276.aNode_Sub35_3346 = null;
			client.aBool7321 = false;
			Class79.method1390();
			TCPPacket tcpmessage_5 = TCPPacket.createPacket(ClientProt.CUTSCENE_FINISHED, client.GAME_CONNECTION_CONTEXT.outKeys);
			tcpmessage_5.buffer.writeByte(bool_0 ? 1 : 0);
			client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_5);
		}

	}

	public BrightnessPreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public BrightnessPreference(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	@Override
	int checkValid(int i_1) {
		return 1;
	}

	@Override
	int getDefaultValue() {
		return 3;
	}

	public void method12861() {
		if (value < 0 || value > 4)
			value = getDefaultValue();

	}

	public int method12865() {
		return value;
	}

	void method7780(int i_1) {
		value = -754033619 * i_1 * -859024475;
	}

	int method7784() {
		return 1;
	}

	int method7786() {
		return 3;
	}

	int method7787() {
		return 3;
	}

	@Override
	void setValue(int i_1) {
		value = i_1;
	}

}
