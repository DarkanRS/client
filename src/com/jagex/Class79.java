package com.jagex;
final class Class79 implements VarProvider {

	public static Node_Sub15_Sub4 aNode_Sub15_Sub4_783;

	public int method237(int i_1) {
		IntNode class282_sub38_2 = (IntNode) Class86.aClass465_823.get((long) i_1);
		return class282_sub38_2 == null ? Class158_Sub1.PLAYER_VAR_PROVIDER.getVar(i_1) : -570797415 * class282_sub38_2.value * 1270866345;
	}

	public int getVarBit(int i_1) {
		IntNode class282_sub38_3 = (IntNode) Class86.aClass465_823.get(0x100000000L | (long) i_1);
		return class282_sub38_3 == null ? Class158_Sub1.PLAYER_VAR_PROVIDER.getVarBit(i_1) : class282_sub38_3.value;
	}

	public int getVar(int i_1) {
		IntNode class282_sub38_3 = (IntNode) Class86.aClass465_823.get((long) i_1);
		return class282_sub38_3 == null ? Class158_Sub1.PLAYER_VAR_PROVIDER.getVar(i_1) : class282_sub38_3.value;
	}

	public int method239(int i_1) {
		IntNode class282_sub38_2 = (IntNode) Class86.aClass465_823.get((long) i_1);
		return class282_sub38_2 == null ? Class158_Sub1.PLAYER_VAR_PROVIDER.getVar(i_1) : -570797415 * class282_sub38_2.value * 1270866345;
	}

	public int method238(int i_1) {
		IntNode class282_sub38_2 = (IntNode) Class86.aClass465_823.get((long) i_1);
		return class282_sub38_2 == null ? Class158_Sub1.PLAYER_VAR_PROVIDER.getVar(i_1) : -570797415 * class282_sub38_2.value * 1270866345;
	}

	public int method236(int i_1) {
		IntNode class282_sub38_2 = (IntNode) Class86.aClass465_823.get((long) i_1);
		return class282_sub38_2 == null ? Class158_Sub1.PLAYER_VAR_PROVIDER.getVar(i_1) : -570797415 * class282_sub38_2.value * 1270866345;
	}

	public int method242(int i_1) {
		IntNode class282_sub38_2 = (IntNode) Class86.aClass465_823.get(0x100000000L | (long) i_1);
		return class282_sub38_2 == null ? Class158_Sub1.PLAYER_VAR_PROVIDER.getVarBit(i_1) : -570797415 * class282_sub38_2.value * 1270866345;
	}

	public static void method1390(int i_0) {
		Class86.aClass465_823.method7749(1941006178);
		Class86.CUTSCENE_AREAS.removeAll();
		Class86.CUTSCENE_CAMERA_MOVEMENTS = null;
		Class82.CUTSCENE_ENTITIES = null;
		Class86.CUTSCENE_OBJECTS = null;
		Class86.aClass93Array821 = null;
		Class86.aCutsceneActionArray822 = null;
		Class86.anInt819 = 1;
		Class86.anInt825 = 0;
		Class86.anInt824 = 0;
		ReflectionCheck.aClass85_8039 = null;
		Class86.anInt831 = -1;
		if (Class86.aBool826) {
			client.aShort7214 = Class86.aShort828;
			client.aShort7474 = Class86.aShort829;
			client.aShort7276 = Class534.aShort7079;
			client.aShort7441 = Class86.aShort830;
			Class86.aBool826 = false;
		}
	}
}
