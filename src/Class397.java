public class Class397 implements Interface38 {

	public static Class397 aClass397_4801 = new Class397("", 10);
	public static Class397 aClass397_4793 = new Class397("", 11);
	public static Class397 aClass397_4794 = new Class397("", 12);
	public static Class397 aClass397_4795 = new Class397("", 13);
	public static Class397 aClass397_4796 = new Class397("", 14);
	public static Class397 aClass397_4797 = new Class397("", 15);
	public static Class397 aClass397_4798 = new Class397("", 16);
	public static Class397 aClass397_4805 = new Class397("", 17);
	public static Class397 aClass397_4800 = new Class397("", 18);
	public static Class397 aClass397_4812 = new Class397("", 19);
	public static Class397 aClass397_4792 = new Class397("", 20);
	public static Class397 aClass397_4803 = new Class397("", 21);
	public static Class397 aClass397_4804 = new Class397("", 22);
	public static Class397 aClass397_4806 = new Class397("", 23);
	public static Class397 aClass397_4799 = new Class397("", 24);
	public static Class397 aClass397_4807 = new Class397("", 25);
	public static Class397 aClass397_4808 = new Class397("", 26);
	public static Class397 aClass397_4809 = new Class397("", 27);
	static Class397 aClass397_4810 = new Class397("", 73);
	static Class397 aClass397_4811 = new Class397("", 76);

	public int anInt4802;

	Class397(String string_1, int i_2) {
		this.anInt4802 = i_2;
	}

	public static void method6775(int i_0, int i_1, int i_2, int i_3, ObjectDefinitions objectdefinitions_4, NPC npc_5, Player player_6, int i_7) {
		Node_Sub48 class282_sub48_8 = new Node_Sub48();
		class282_sub48_8.anInt8076 = i_0;
		class282_sub48_8.anInt8107 = i_1 << 9;
		class282_sub48_8.anInt8078 = i_2 << 9;
		if (objectdefinitions_4 != null) {
			class282_sub48_8.aClass478_8104 = objectdefinitions_4;
			int i_9 = objectdefinitions_4.sizeX;
			int i_10 = objectdefinitions_4.sizeY;
			if (i_3 == 1 || i_3 == 3) {
				i_9 = objectdefinitions_4.sizeY;
				i_10 = objectdefinitions_4.sizeX;
			}
			class282_sub48_8.anInt8079 = i_9 + i_1 << 9;
			class282_sub48_8.anInt8077 = i_10 + i_2 << 9;
			class282_sub48_8.soundEffectId = objectdefinitions_4.ambientSoundId;
			class282_sub48_8.aBool8098 = objectdefinitions_4.aBool5696;
			class282_sub48_8.anInt8105 = objectdefinitions_4.ambientSoundHearDistance << 9;
			class282_sub48_8.anInt8089 = objectdefinitions_4.ambientSoundVolume;
			class282_sub48_8.anInt8072 = objectdefinitions_4.anInt5667;
			class282_sub48_8.anInt8101 = objectdefinitions_4.anInt5698;
			class282_sub48_8.anIntArray8102 = objectdefinitions_4.audioTracks;
			class282_sub48_8.aBool8103 = objectdefinitions_4.aBool5700;
			class282_sub48_8.anInt8094 = objectdefinitions_4.anInt5709;
			class282_sub48_8.anInt8093 = objectdefinitions_4.anInt5708;
			class282_sub48_8.anInt8081 = objectdefinitions_4.anInt5694 << 9;
			if (objectdefinitions_4.toObjectIds != null) {
				class282_sub48_8.aBool8092 = true;
				class282_sub48_8.method13426();
			}
			if (class282_sub48_8.anIntArray8102 != null) {
				class282_sub48_8.anInt8080 = class282_sub48_8.anInt8072 + (int) (Math.random() * (double) (class282_sub48_8.anInt8101 - class282_sub48_8.anInt8072));
			}
			Node_Sub48.aClass482_8073.append(class282_sub48_8);
		} else if (npc_5 != null) {
			class282_sub48_8.aTransform_Sub1_Sub1_Sub2_Sub2_8085 = npc_5;
			NPCDefinitions npcdefinitions_11 = npc_5.definitions;
			if (npcdefinitions_11.transformTo != null) {
				class282_sub48_8.aBool8092 = true;
				npcdefinitions_11 = npcdefinitions_11.getTransformed(Class158_Sub1.PLAYER_VAR_PROVIDER);
			}
			if (npcdefinitions_11 != null) {
				class282_sub48_8.anInt8079 = npcdefinitions_11.size + i_1 << 9;
				class282_sub48_8.anInt8077 = i_2 + npcdefinitions_11.size << 9;
				class282_sub48_8.soundEffectId = Node_Sub11_Sub1.method15433(npc_5);
				class282_sub48_8.aBool8098 = npcdefinitions_11.aBool4872;
				class282_sub48_8.anInt8105 = npcdefinitions_11.specialByte << 9;
				class282_sub48_8.anInt8089 = npcdefinitions_11.anInt4909;
				class282_sub48_8.anInt8094 = npcdefinitions_11.anInt4919;
				class282_sub48_8.anInt8093 = npcdefinitions_11.anInt4911;
				class282_sub48_8.anInt8081 = npcdefinitions_11.anInt4908 << 9;
			}
			Node_Sub48.aClass482_8074.append(class282_sub48_8);
		} else if (player_6 != null) {
			class282_sub48_8.aTransform_Sub1_Sub1_Sub2_Sub1_8086 = player_6;
			class282_sub48_8.anInt8079 = i_1 + player_6.getSize() << 9;
			class282_sub48_8.anInt8077 = i_2 + player_6.getSize() << 9;
			class282_sub48_8.soundEffectId = Class149_Sub2.method14610(player_6, 1888639983);
			class282_sub48_8.aBool8098 = player_6.isTransformedNPC;
			class282_sub48_8.anInt8105 = player_6.isNpc << 9;
			class282_sub48_8.anInt8089 = player_6.specialByte;
			class282_sub48_8.anInt8094 = 256;
			class282_sub48_8.anInt8093 = 256;
			class282_sub48_8.anInt8081 = 0;
			Node_Sub48.aClass465_8075.put(class282_sub48_8, (long) player_6.index);
		}
	}
}
